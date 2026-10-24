/*
CC0 1.0 Universal (CC0 1.0) Public Domain Dedication

To the extent possible under law, the author(s) have dedicated all copyright
and related rights to this software to the public domain worldwide. This
software is distributed without any warranty.

You may copy, modify, distribute, and perform the work, even for commercial
purposes, all without asking permission.

For more information, see <https://creativecommons.org/publicdomain/zero/1.0/>
*/
/*
This is free and unencumbered software released into the public domain.

Anyone is free to copy, modify, publish, use, compile, sell, or distribute
this software, either in source code form or as a compiled binary, for any
purpose, commercial or non-commercial, and by any means.

In jurisdictions that recognize copyright laws, the author(s) dedicate any
and all copyright interest in the software to the public domain. We make
this dedication for the benefit of the public at large and to the detriment
of our heirs and successors. We intend this dedication to be an overt act
of relinquishment in perpetuity of all present and future rights to this
software under copyright law.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN
ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

For more information, please refer to <https://unlicense.org/>
*/
/**
 *
 * @author Rajesh V Pai
 */
package Calculus;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Rajesh V Pai
 */
public class FlipUtilsConformal {
    /**
     * FlipUtilsConformal
     * - Symmetric, conformal toMultiplicationForm / toDivisionForm
     * - Shared exponent regex helpers
     * - Canonical numeric formatting (one decimal place, locale-agnostic)
     * - Debug trace mode via traceFor(String expr)
     */
    // --- canonical number formatter (one decimal place) ---
    private static final NumberFormat NF;
    static {
        NF = NumberFormat.getNumberInstance();
        NF.setGroupingUsed(false);
        NF.setMaximumFractionDigits(1);
        NF.setMinimumFractionDigits(1);
    }

    // shared exponent patterns
    private static final Pattern EXP_POS = Pattern.compile("\\^\\+?(\\d+(?:\\.\\d+)?(?:[eE][+-]?\\d+)?)");
    private static final Pattern EXP_NEG = Pattern.compile("\\^-(\\d+(?:\\.\\d+)?(?:[eE][+-]?\\d+)?)");

    // debug flag (set true to get verbose traces in normal runs)
    public static boolean DEBUG = true;

    // public canonical normalizers
    public static String toMultiplicationForm(String expr) {
        return normalize(expr, Mode.MUL);
    }

    public static String toDivisionForm(String expr) {
        return normalize(expr, Mode.DIV);
    }

    // trace helper (prints detailed step-by-step transform for provided expression)
    public static void traceFor(String raw) {
        DEBUG = true;
        System.out.println("TRACE START for: " + raw);
        String mult = toMultiplicationForm(raw);
        System.out.println("-> Multiplication canonical: " + mult);
        String backDiv = toDivisionForm(mult);
        System.out.println("-> Back to Division (from mult): " + backDiv);
        String div = toDivisionForm(raw);
        System.out.println("-> Division canonical: " + div);
        String backMult = toMultiplicationForm(div);
        System.out.println("-> Back to Multiplication (from div): " + backMult);

        System.out.println("Round-trip checks:");
        System.out.println(" div.equals(backDiv) ? " + div.equals(backDiv));
        System.out.println(" mult.equals(backMult) ? " + mult.equals(backMult));
        DEBUG = false;
        System.out.println("TRACE END");
    }

    // --- internal ----------------------------------------------------------------

    private enum Mode { MUL, DIV }

    private static String normalize(String expr, Mode mode) {
        if (expr == null) return null;
        expr = expr.replaceAll("\\s+", ""); // canonical whitespace removal
        List<String> terms = splitTerms(expr);
        if (DEBUG) { System.out.println("Terms:"); terms.forEach(t -> System.out.println(" " + t)); }

        List<String> normalizedTerms = new ArrayList<>();

        for (String term : terms) {
            String termSign = extractTermSign(term);
            String termBody = stripTermSign(term);

            // split factors (exponent-aware)
            List<String> rawFactors = repairOperatorTokens(splitFactors(termBody));
            if (DEBUG) {
                System.out.println(" rawFactors:");
                rawFactors.forEach(f -> System.out.println(" " + f));
            }

            List<String> ops = extractOperatorsAligned(rawFactors); // "*" or "/"
            List<String> factors = stripOperatorsAligned(rawFactors);

            // canonicalize atoms early so flips see stable forms
            for (int i = 0; i < factors.size(); i++) {
                factors.set(i, canonicalizeAtom(factors.get(i), mode));
            }

            if (DEBUG) {
                System.out.println(" ops: " + ops);
                System.out.println(" atoms before flip: " + factors);
            }

            // apply flips according to mode
            for (int i = 0; i < factors.size(); i++) {
                String op = ops.get(i);
                String atom = factors.get(i);

                // recursively handle parenthesized subexpressions
                if (isParenthesized(atom)) {
                    String inner = atom.substring(1, atom.length() - 1);
                    if (mode == Mode.MUL) atom = "(" + toMultiplicationForm(inner) + ")";
                    else atom = "(" + toDivisionForm(inner) + ")";
                }

                if (mode == Mode.MUL) {
                    // /x^n -> *x^-n
                    if ("/".equals(op) && isVarPower(atom)) {
                        ops.set(i, "*");
                        atom = flipExponentSign(atom);
                    } else if ("/".equals(op) && isPlainVar(atom)) {
                        ops.set(i, "*");
                        atom = atom + "^-1";
                    }
                } else {
                    // *x^-n -> /x^n
                    if ("*".equals(op) && isVarPowerNegative(atom)) {
                        ops.set(i, "/");
                        atom = flipNegativeExponent(atom);
                    }
                }

                // canonicalize after flip to normalize numeric exponent formatting
                atom = canonicalizeAtom(atom, mode);

                factors.set(i, atom);
            }

            if (DEBUG) {
                System.out.println(" atoms after flip: " + factors);
                System.out.println(" ops after flip: " + ops);
            }

            // collapse zero
            collapseZeroFactors(ops, factors);

            // join term (first factor exact, rest prefixed by op)
            String joined = joinFactors(ops, factors);
            if (joined.startsWith("*") || joined.startsWith("/")) joined = joined.substring(1);

            // sanitize joined term
            joined = sanitizeTerm(joined);

            // apply term-level sign
            String applied = termSign.equals("-") ? "-" + joined : joined;

            // avoid adding empty or dangling terms or explicit zero
            if (joined != null && !joined.isEmpty() && !"0.0".equals(joined) && !"*".equals(joined) && !"/".equals(joined)) {
                normalizedTerms.add(applied);
            }

            if (DEBUG) {
                System.out.println(" joined(before add): " + joined);
                System.out.println(" added term: " + applied);
            }
        }

        String full = String.join("+", normalizedTerms);
        full = finalSanitize(full);

        if (DEBUG) {
            System.out.println("Normalized full (" + mode + "): " + full);
        }

        return stripLeadingPlus(full);
    }

    // ------------------ tokenization & helpers -------------------

    private static String extractTermSign(String term) {
        if (term.startsWith("-")) return "-";
        if (term.startsWith("+")) return "+";
        return "+";
    }
    private static String stripTermSign(String term) {
        if (term.startsWith("-") || term.startsWith("+")) return term.substring(1);
        return term;
    }

    // split on top-level + / - while preserving sign on each term
    private static List<String> splitTerms(String expr) {
        List<String> terms = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int depth = 0;
        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);
            if (c == '(') depth++;
            if (c == ')') depth--;
            if ((c == '+' || c == '-') && depth == 0 && sb.length() > 0) {
                terms.add(sb.toString());
                sb.setLength(0);
            }
            sb.append(c);
        }
        if (sb.length() > 0) terms.add(sb.toString());
        return terms;
    }

    // exponent-aware factor splitter: keeps x^-3.0 together
    private static List<String> splitFactors(String term) {
        List<String> factors = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int depth = 0;
        boolean inExponent = false;

        for (int i = 0; i < term.length(); i++) {
            char c = term.charAt(i);

            if (c == '(') { depth++; sb.append(c); continue; }
            if (c == ')') { depth--; sb.append(c); continue; }

            if (c == '^' && !inExponent) { inExponent = true; sb.append(c); continue; }

            if (inExponent) {
                // allow optional leading +/-, digits, dot, e/E and exponent sign/digits
                if ((c == '+' || c == '-') && sb.charAt(sb.length() - 1) == '^') { sb.append(c); continue; }
                if ((c >= '0' && c <= '9') || c == '.' || c == 'e' || c == 'E' || c == '+' || c == '-') {
                    sb.append(c);
                    continue;
                }
                // end exponent
                inExponent = false;
            }

            if ((c == '*' || c == '/') && depth == 0 && !inExponent) {
                if (sb.length() > 0) { factors.add(sb.toString()); sb.setLength(0); }
                sb.append(c);
                continue;
            }

            sb.append(c);
        }

        if (sb.length() > 0) factors.add(sb.toString());

        // repair incomplete caret tokens if any (merge trailing '^' with following factor)
        for (int i = 0; i < factors.size(); i++) {
            String f = factors.get(i);
            if (f.equals("^") || f.endsWith("^")) {
                if (i + 1 < factors.size()) {
                    factors.set(i, f + factors.get(i + 1));
                    factors.remove(i + 1);
                    i--;
                }
            }
        }

        return factors;
    }

    // repair standalone operator-only raw factor entries like "*" or "/"
    // ensures operator tokens are merged with following atom (prevents empty atoms)
    private static List<String> repairOperatorTokens(List<String> raw) {
        for (int i = 0; i < raw.size(); i++) {
            String f = raw.get(i);
            if ("*".equals(f) || "/".equals(f)) {
                if (i + 1 < raw.size()) {
                    raw.set(i, f + raw.get(i + 1));
                    raw.remove(i + 1);
                    i--;
                } else {
                    // trailing lone operator: remove defensively
                    raw.remove(i);
                    i--;
                }
            }
        }
        return raw;
    }

    private static List<String> extractOperators1(List<String> rawFactors) {
        List<String> ops = new ArrayList<>();
        for (String f : rawFactors) {
            if (f.startsWith("/")) ops.add("/");
            else ops.add("*");
        }
        return ops;
    }

    private static List<String> extractOperatorsAligned(List<String> rawFactors) {
        List<String> ops = new ArrayList<>();
        for (String f : rawFactors) {
            ops.add(f.startsWith("/") ? "/" : "*");
        }
        return ops;
    }

    private static List<String> stripOperatorsAligned(List<String> rawFactors) {
        List<String> atoms = new ArrayList<>();
        for (String f : rawFactors) {
            atoms.add(f.replaceFirst("^[*/]", ""));
        }
        return atoms;
    }

    private static List<String> stripOperators(List<String> rawFactors) {
        List<String> out = new ArrayList<>();
        for (String f : rawFactors) {
            if (f.startsWith("/") || f.startsWith("*")) out.add(f.substring(1));
            else out.add(f);
        }
        return out;
    }

    private static boolean isParenthesized(String s) {
        return s.startsWith("(") && s.endsWith(")");
    }

    // var^n where n is numeric (positive or explicitly signed)
    private static boolean isVarPower(String factor) {
        return factor.matches("[A-Za-z]+\\^\\+?\\d+(?:\\.\\d+)?(?:[eE][+-]?\\d+)?");
    }

    private static boolean isVarPowerNegative(String factor) {
        return factor.matches("[A-Za-z]+\\^-\\d+(?:\\.\\d+)?(?:[eE][+-]?\\d+)?");
    }

    private static boolean isPlainVar(String factor) {
        return factor.matches("[A-Za-z]+");
    }

    // flip helpers (shared, symmetric)
    private static String flipExponentSign(String factor) {
        Matcher m = EXP_POS.matcher(factor);
        if (m.find()) {
            String num = m.group(1);
            num = canonicalNumberString(num);
            return m.replaceFirst("^-" + Matcher.quoteReplacement(num));
        }
        return factor;
    }

    private static String flipNegativeExponent(String factor) {
        Matcher m = EXP_NEG.matcher(factor);
        if (m.find()) {
            String num = m.group(1);
            num = canonicalNumberString(num);
            return m.replaceFirst("^" + Matcher.quoteReplacement(num));
        }
        return factor;
    }

    // canonicalize single atom to a stable form (numeric exponents canonicalized).
    // Mode controls preferred emission: in MUL keep negative exponents as name^-k,
    // in DIV prefer denominator-style when assembling final string if you choose that later.
    private static String canonicalizeAtom(String atom, Mode mode) {
        if (atom == null || atom.isEmpty()) return atom;

        if (isParenthesized(atom)) {
            String inner = atom.substring(1, atom.length() - 1);
            return mode == Mode.MUL ? "(" + toMultiplicationForm(inner) + ")" : "(" + toDivisionForm(inner) + ")";
        }

        // match name^exp
        Pattern p = Pattern.compile("([A-Za-z]+)\\^(\\+?-?\\d+(?:\\.\\d+)?(?:[eE][+-]?\\d+)?)");
        Matcher m = p.matcher(atom);
        if (m.matches()) {
            String name = m.group(1);
            String rawExp = m.group(2);
            String fmt = canonicalNumberString(rawExp);
            try {
                double dv = Double.parseDouble(rawExp);
                // keep negative exponent in MUL form as name^-k (canonical numeric)
                if (dv < 0) {
                    return name + "^" + NF.format(dv);
                } else {
                    return name + "^" + fmt;
                }
            } catch (NumberFormatException ex) {
                return name + "^" + fmt;
            }
        }

        // numeric atoms: canonicalize numeric formatting
        try {
            double d = Double.parseDouble(atom);
            return NF.format(d);
        } catch (NumberFormatException ignored) {}

        return atom;
    }

    // canonicalize numeric string (ensure one decimal place, locale ROOT)
    private static String canonicalNumberString(String str) {
        try {
            double d = Double.parseDouble(str);
            return NF.format(d);
        } catch (Exception e) {
            return str; // if parsing fails, leave as-is
        }
    }

    // collapse zero factor to single 0.0 term
    private static void collapseZeroFactors(List<String> ops, List<String> facs) {
        for (String f : facs) {
            try {
                double d = Double.parseDouble(f);
                if (d == 0.0d) {
                    ops.clear();
                    facs.clear();
                    ops.add("*");
                    facs.add("0.0");
                    return;
                }
            } catch (NumberFormatException ignored) {}
        }
    }

    // join: first atom preserved (may include sign), remaining prefixed by op
    private static String joinFactors(List<String> ops, List<String> facs) {
        if (facs.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        sb.append(facs.get(0));
        for (int i = 1; i < facs.size(); i++) {
            String op = (i < ops.size() && ("/".equals(ops.get(i)) || "*".equals(ops.get(i)))) ? ops.get(i) : "*";
            sb.append(op).append(facs.get(i));
        }
        return sb.toString();
    }

    // conservative sanitizer used by both normalizers
    private static String sanitizeTerm(String term) {
        if (term == null || term.isEmpty()) return term;
        while (term.startsWith("*") || term.startsWith("/")) term = term.substring(1);

        // stabilize caret fragments first: ^+- -> ^- and ^+ -> ^
        term = term.replaceAll("\\^\\+\\-", "^-");
        term = term.replaceAll("\\^\\+", "^");

        // collapse common join artifacts
        term = term.replaceAll("\\+\\-", "-");
        term = term.replaceAll("\\+\\+", "+");
        term = term.replaceAll("\\+\\*", "+");
        term = term.replaceAll("\\+\\/", "+");

        if (term.startsWith("+")) term = term.substring(1);
        return term;
    }

    // final full-expression sanitizer (idempotent)
    private static String finalSanitize(String expr) {
        if (expr == null) return expr;
        String out = expr.replaceAll("\\+\\-", "-").replaceAll("\\+\\+", "+");
        return out;
    }

    private static String stripLeadingPlus(String expr) {
        return (expr != null && expr.startsWith("+")) ? expr.substring(1) : expr;
    }
} // end FlipUtilsConformal
