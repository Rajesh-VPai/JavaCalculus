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

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rajesh V Pai
 */
public class FlipNormalizer {
    // --- FlipNormalizer (multiplication <-> division canonicalizers) ---
            public static String toMultiplicationForm(String expr) {
            List<String> terms = splitTerms(expr);
            List<String> normalizedTerms = new ArrayList<>();
                System.out.println("toMultiplicationForm:terms=");
                terms.forEach(System.out::println);
            for (String term : terms) {
                String termSign = extractTermSign(term);
                term = stripTermSign(term);

                List<String> rawFactors = splitFactors(term);
                List<String> ops = extractOperators(rawFactors);
                List<String> factors = stripOperators(rawFactors);
                System.out.println("toMultiplicationForm:rawFactors=");
                rawFactors.forEach(System.out::println);
                for (int i = 0; i < factors.size(); i++) {
                    String factor = factors.get(i);
                    
                    if (isParenthesized(factor)) {
                        factor = "(" + toMultiplicationForm(factor.substring(1, factor.length() - 1)) + ")";
                    }
                    System.out.println("toMultiplicationForm:factor="+ factor);
                    if (ops.get(i).equals("*") && isVarPowerNegative(factor)) {
                        String oldops=ops.get(i);
                        ops.set(i, "/");
                        String oldFactor=factor;
                        System.out.println("toMultiplicationForm:factor="+ factor + " oldFactor=" + oldFactor + " oldops=" + oldops);
                        factor = flipExponentSign(factor,ops.get(i));
                        if( (factor.startsWith("/")) &&( (!oldFactor.startsWith("/"))&&(!oldFactor.startsWith("*")) &&(oldops.equalsIgnoreCase("*")) &&(i==0) ) ){
                            factor= "1.0" + factor;
                        }
                        System.out.println("toMultiplicationForm:Flipped:1:factor="+ factor + " oldFactor=" + oldFactor + " oldops=" + oldops);
                    } else if (ops.get(i).equals("/") && isVarPowerNegative(factor)) {
                        ops.set(i, "*");
                        System.out.println("toMultiplicationForm:factor="+ factor);
                        factor = flipNegativeExponent(factor);
                        System.out.println("toMultiplicationForm:Flipped:factor="+ factor);
                    } else if (ops.get(i).equals("/") && isPlainVar(factor)) {
//                        ops.set(i, "*");
//                        factor = factor + "^1";
//                        System.out.println("toMultiplicationForm::var:factor="+ factor);
//                        factor = flipNegativeExponent(factor);
                        System.out.println("toMultiplicationForm:var:Flipped:factor="+ factor);
                    }

                    factors.set(i, factor);
                }

                //collapseZeroFactors(ops, factors);
                String joined = joinFactors(ops, factors);

                // sanitize and apply term-level sign correctly
                if (!"0.0".equals(joined)) {
                    if (joined.startsWith("*") || joined.startsWith("/")) joined = joined.substring(1);
                    joined = sanitizeTerm(joined);
                    normalizedTerms.add(termSign.equals("-") ? "-" + joined : joined);
                }
                System.out.println("toMultiplicationForm:Final:normalizedTerms:");
                normalizedTerms.forEach(System.out::println);
            }

            String full = String.join("+", normalizedTerms);
            full = finalSanitize(full);
            System.out.println("toMultiplicationForm:Final:String="+full);
            
            return stripLeadingPlus(full);
        }

        public static String toDivisionForm(String expr) {
            List<String> terms = splitTerms(expr);
            List<String> normalizedTerms = new ArrayList<>();
                System.out.println("toDivisionForm:terms=");
                terms.forEach(System.out::println);
            for (String term : terms) {
                String termSign = extractTermSign(term);
                term = stripTermSign(term);

                List<String> rawFactors = splitFactors(term);
                List<String> ops = extractOperators(rawFactors);
                List<String> factors = stripOperators(rawFactors);
                System.out.println("toDivisionForm:rawFactors=");
                rawFactors.forEach(System.out::println);
                for (int i = 0; i < factors.size(); i++) {
                    String factor = factors.get(i);

                    if (isParenthesized(factor)) {
                        factor = "(" + toDivisionForm(factor.substring(1, factor.length() - 1)) + ")";
                    }
                    System.out.println("toDivisionForm:factor="+ factor); 
                    if (ops.get(i).equals("/") && isVarPowerNegative(factor)) {
                        String oldops=ops.get(i);
                        ops.set(i, "*");
                        String oldFactor=factor;
                        System.out.println("toDivisionForm:factor="+ factor + " oldFactor=" + oldFactor + " oldops=" + oldops);
                        factor = flipNegativeExponent(factor);
                        if( (factor.startsWith("/")) &&( (!oldFactor.startsWith("/"))&&(!oldFactor.startsWith("*")) &&(oldops.equalsIgnoreCase("*"))&&(i >0)&&(factors.size() > 1 ) ) ){
                            factor= "1.0" + factor;
                        }
                        System.out.println("toDivisionForm:Flipped:1:factor="+ factor + " oldFactor=" + oldFactor);
                    }else if (ops.get(i).equals("*") && isVarPowerNegative(factor)) {
                        String oldops=ops.get(i);
                        ops.set(i, "/");
                        String oldFactor=factor;
                        System.out.println("toDivisionForm:factor="+ factor + " oldFactor=" + oldFactor + " oldops=" + oldops);
                        System.out.println("toDivisionForm:factor="+ factor);
                        factor = flipExponentSign(factor,ops.get(i));
                        if( (factor.startsWith("/")) &&( (!oldFactor.startsWith("/"))&&(!oldFactor.startsWith("*")) &&(oldops.equalsIgnoreCase("*"))&&(i >0)&&(factors.size() > 1 ) ) ){
                            factor= factor;
                        }
                        System.out.println("toDivisionForm:Flipped:2:factor="+ factor + " oldFactor=" + oldFactor + " oldops=" + oldops);
                    }else if (ops.get(i).equals("/") && isPlainVar(factor)) {
//                        ops.set(i, "*");
//                        factor = factor + "^1";
//                        System.out.println("toMultiplicationForm::var:factor="+ factor);
//                        factor = flipNegativeExponent(factor);
                        System.out.println("toDivisionForm:3:var:Flipped:factor="+ factor);
                    }
                    factors.set(i, factor);
                }
                //collapseZeroFactors(ops, factors);
                String joined = joinFactors(ops, factors);

                //if (!"0.0".equals(joined)) {
                    if (joined.startsWith("*") || joined.startsWith("/")) joined = joined.substring(1);
                    joined = sanitizeTerm(joined);
                    normalizedTerms.add(termSign.equals("-") ? "-" + joined : joined);
                //}
                System.out.println("toDivisionForm:Final:normalizedTerms:");
                normalizedTerms.forEach(System.out::println);
            }

            String full = String.join("+", normalizedTerms);
            full = finalSanitize(full);
            System.out.println("toDivisionForm:Final:String="+full);
            return stripLeadingPlus(full);
        }

        // --- Utilities ---

        private static String extractTermSign(String term) {
            if (term.startsWith("-")) return "-";
            if (term.startsWith("+")) return "+";
            return "+";
        }

        private static String stripTermSign(String term) {
            if (term.startsWith("-") || term.startsWith("+")) {
                return term.substring(1);
            }
            return term;
        }

        private static boolean isParenthesized(String s) {
            return s.startsWith("(") && s.endsWith(")");
        }
/**
     * Returns true if the character at expr[pos] is '+' or '-' and should be
     * treated as a unary sign, i.e.: • it’s at the very start of the string, OR
     * • it immediately follows '(', '*', '/', or '^', OR • it’s part of a
     * scientific-notation exponent (e.g. "1e-3").
     */
    /**
     * From earlier: checks if '+'/'-' at pos is unary.
     */
    public static boolean isUnarySign(String Expr, int mypos) {
        if (mypos < 0 || mypos >= Expr.length()) {
            return false;
        }
        char c = Expr.charAt(mypos);
        if (c != '+' && c != '-') {
            return false;
        }
        if (mypos == 0) {
            return true;
        }
        char prev = Expr.charAt(mypos - 1);
        if (prev == '(' || prev == '*' || prev == '/' || prev == '^') {
            return true;
        }
        // handle scientific notation (e.g. "1e-3")
        if (mypos > 1 && (Expr.charAt(mypos - 2) == 'e' || Expr.charAt(mypos - 2) == 'E')
                && Character.isDigit(prev)) {
            return true;
        }
        return false;
    }
        private static List<String> splitTerms(String expr) {
            List<String> terms = new ArrayList<>();
            StringBuilder sb = new StringBuilder();
            int depth = 0;
            for (int i = 0; i < expr.length(); i++) {
                char c = expr.charAt(i);
                if (c == '(') depth++;
                if (c == ')') depth--;
                if ((c == '+' || c == '-') &&(!isUnarySign (expr,i))&& depth == 0 && sb.length() > 0) {
                    terms.add(sb.toString());
                    sb.setLength(0);
                }
                sb.append(c);
            }
            if (sb.length() > 0) terms.add(sb.toString());
            return terms;
        }

        // exponent-aware factor splitter
        private static List<String> splitFactors(String term) {
            List<String> factors = new ArrayList<>();
            StringBuilder sb = new StringBuilder();
            int depth = 0;
            boolean inExponent = false;

            for (int i = 0; i < term.length(); i++) {
                char c = term.charAt(i);

                if (c == '(') {
                    depth++;
                    sb.append(c);
                    continue;
                }
                if (c == ')') {
                    depth--;
                    sb.append(c);
                    continue;
                }

//                if (c == '^' && !inExponent) {
//                    inExponent = true;
//                    sb.append(c);
//                    continue;
//                }
                if (c=='^')   {
                    inExponent = true;
                }
                if (inExponent) {
                    // allow optional leading +/-, digits, dot, e/E and exponent sign/digits
                    if ((c == '+' || c == '-') && sb.charAt(sb.length() - 1) == '^') {
                        sb.append(c);
                        continue;
                    }
                    if ((c >= '0' && c <= '9') || c == '.' || c == 'e' || c == 'E' || c == '+' || c == '-') {
                        sb.append(c);
                        // keep inExponent until a character that cannot belong to exponent appears
                        continue;
                    }
                    // end exponent and fall through to process this character normally
                    inExponent = false;
                }

                if ((c == '*' || c == '/') && depth == 0 && !inExponent) {
                    if (sb.length() > 0) {
                        factors.add(sb.toString());
                        sb.setLength(0);
                    }
                    sb.append(c);
                    continue;
                }

                sb.append(c);
            }

            if (sb.length() > 0) factors.add(sb.toString());

//            // repair incomplete caret tokens if any (merge trailing '^' with following factor)
//            for (int i = 0; i < factors.size(); i++) {
//                String f = factors.get(i);
//                if (f.equals("^") || f.endsWith("^")) {
//                    if (i + 1 < factors.size()) {
//                        factors.set(i, f + factors.get(i + 1));
//                        factors.remove(i + 1);
//                        i--;
//                    }
//                }
//            }

            return factors;
        }

        private static List<String> extractOperators(List<String> rawFactors) {
            List<String> ops = new ArrayList<>();
            for (String f : rawFactors) {
                if (f.startsWith("/")) ops.add("/");
                else ops.add("*");
            }
            return ops;
        }

        private static List<String> stripOperators(List<String> rawFactors) {
            List<String> stripped = new ArrayList<>();
            for (String f : rawFactors) {
                if (f.startsWith("/") || f.startsWith("*")) stripped.add(f.substring(1));
                else stripped.add(f);
            }
            return stripped;
        }

        private static boolean isVarPower(String factor) {
            return factor.matches("[a-zA-Z]+\\^\\+?\\d+(?:\\.\\d+)?(?:[eE][+-]?\\d+)?");
        }

        private static boolean isVarPowerNegative(String factor) {
            return factor.matches("[a-zA-Z]+\\^-\\d+(?:\\.\\d+)?(?:[eE][+-]?\\d+)?");
        }

        private static boolean isPlainVar(String factor) {
            return factor.matches("[a-zA-Z]+");
        }

        private static String flipExponentSign(String factor, String Myops) {
            int index=-1;
            double exponent=-1;
            String Temp="";
            int FlipCharacter=-1;
            if(factor.contains("^")){
                index=factor.indexOf("^")+1;
                System.out.println("flipExponentSign:factor=" + factor + " RAW Exp:factor.substring(index)=" + factor.substring(index) + " exponent=" + exponent + " FlipCharacter=" + (char) FlipCharacter + " index=" + index);
                if ( (factor.substring(index).startsWith("+")) || (factor.substring(index).startsWith("-"))){
                    Temp=factor.substring(index).substring(1);
                    FlipCharacter=factor.substring(index).charAt(0);
                    if (FlipCharacter=='+')
                        FlipCharacter='-';
                    else if (FlipCharacter=='-')
                         FlipCharacter='+';
                    else
                        FlipCharacter=-2;
                    if ((Temp != null) && (!Temp.equalsIgnoreCase(""))) {
                        exponent = Double.parseDouble(Temp);
                    }
                    System.out.println("flipExponentSign:factor=" + factor + " exponent=" + exponent + " FlipCharacter=" + (char) FlipCharacter);
                    if (FlipCharacter == '-'){
                        System.out.println("flipExponentSign:Return Value:" + factor.substring(0,index) + (char) FlipCharacter + exponent);
                        if (Myops.endsWith("*"))
                            return factor.substring(0,index) + (char) FlipCharacter + exponent;
                        else if (Myops.endsWith("/"))
                            return Myops + factor.substring(0,index) + (char) FlipCharacter + exponent;
                    }else if (FlipCharacter == '+'){
                        System.out.println("flipExponentSign:Return Value:" + factor.substring(0,index) + exponent);
                        if (Myops.endsWith("*"))
                            return factor.substring(0,index) + exponent;
                        else if (Myops.endsWith("/"))
                            return Myops+factor.substring(0,index) + exponent;
                    }else{
                        System.out.println("flipExponentSign:Return Value:" + factor.substring(0,index) + exponent);
                        if (Myops.endsWith("*"))
                            return factor.substring(0,index) + exponent;
                        else if (Myops.endsWith("/"))
                            return Myops+factor.substring(0,index) + exponent;
                    }
                }
            }
            return factor.replaceFirst("\\^\\+?(\\d+(?:\\.\\d+)?(?:[eE][+-]?\\d+)?)", "^-$1");
        }

        private static String flipNegativeExponent(String factor) {
            System.out.println("flipNegativeExponent:factor=" + factor);
            String Temp=factor.replaceFirst("\\^-(\\d+(?:\\.\\d+)?(?:[eE][+-]?\\d+)?)", "^$1");
            System.out.println("flipNegativeExponent:Temp=" + Temp);
            return Temp;
        }

        private static void collapseZeroFactors(List<String> ops, List<String> facs) {
            for (String f : facs) {
                try {
                    if (Double.parseDouble(f) == 0.0d) {
                        ops.clear();
                        facs.clear();
                        ops.add("*");
                        facs.add("0.0");
                        return;
                    }
                } catch (NumberFormatException ignored) {
                }
            }
        }

        private static String joinFactors(List<String> ops, List<String> facs) {
            if (ops.isEmpty() || facs.isEmpty()) return "";

            StringBuilder sb = new StringBuilder();

            // first factor: exact (may include sign), no operator prefix
            sb.append(facs.get(0));

            for (int i = 1; i < facs.size(); i++) {
                sb.append(ops.get(i)).append(facs.get(i));
            }

            return sb.toString();
        }

        private static String sanitizeTerm(String term) {
            if (term == null || term.isEmpty()) return term;
            while (term.startsWith("*") || term.startsWith("/")) term = term.substring(1);

            // Fix caret sequences: ^+- -> ^- ; ^+ -> ^
            term = term.replaceAll("\\^\\+\\-", "^-");
            term = term.replaceAll("\\^\\+", "^");

            // Collapse "+-" and "++"
            term = term.replaceAll("\\+\\-", "-");
            term = term.replaceAll("\\+\\+", "+");

            // Remove "+*" and "+/" if present
            term = term.replaceAll("\\+\\*", "+");
            term = term.replaceAll("\\+\\/", "+");

            if (term.startsWith("+")) term = term.substring(1);
            return term;
        }

        private static String finalSanitize(String expr) {
            if (expr == null) return expr;
            expr = expr.replaceAll("\\+\\-", "-");
            expr = expr.replaceAll("\\+\\+", "+");
            expr = expr.replaceAll("//", "/");
            expr = expr.replaceAll("\\*\\*", "*");
            return expr;
        }

        private static String stripLeadingPlus(String expr) {
            return (expr != null && expr.startsWith("+")) ? expr.substring(1) : expr;
        }
}