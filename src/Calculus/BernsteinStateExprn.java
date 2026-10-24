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

import static Calculus.MathsContxtLAv.IsAConstant;
import static Calculus.MathsContxtLAv.ParenthesisFlag;
import static Calculus.MathsContxtLAv.StrIsAConstant;
import static Calculus.MathsContxtLAv.eatAll;
import static Calculus.MathsContxtLAv.ParenthesisOperator;
import static Calculus.MathsContxtLAv.ZeroTermSignFlag;
import static Calculus.MathsContxtLAv.IsOperator;
import static Calculus.MathsContxtLAv.IsNumber;
import static Calculus.MathsContxtLAv.IsVariable;
import static Calculus.MathsContxtLAv.IsNotAnOperator;
import static Calculus.MathsContxtLAv.functions;
import static Calculus.UsageCalculus.Order;
import static Calculus.UsageCalculus.StageMapping;
import static Calculus.UsageCalculus.TestCase;
import java.util.HashMap;
import java.util.Map;
import java.util.function.DoubleUnaryOperator;
import org.apache.log4j.Logger;

/**
 *
 * @author Administrator
 */
public class BernsteinStateExprn {
    public static Logger log = Logger.getLogger(BernsteinStateExprn.class.getName());
    private static Map<String, DoubleUnaryOperator> functions = new HashMap<>();
    
    // Expression Term character Index and Character Variable    
    public static int posBSExpr = -1, chBSExpr;
    public static String StrBSExpr;
    public static void MyFuncBSExpress() {
        functions.put("sqrt", x -> Math.sqrt(x));
        functions.put("sin", x -> Math.sin(Math.toRadians(x)));
        functions.put("cos", x -> Math.cos(Math.toRadians(x)));
        functions.put("tan", x -> Math.tan(Math.toRadians(x)));
        functions.put("round", x -> Math.round(x));
        functions.put("abs", x -> Math.abs(x));
        functions.put("ceil", x -> Math.ceil(x));
        functions.put("floor", x -> Math.floor(x));
        functions.put("log", x -> Math.log10(x));
        functions.put("ln", x -> Math.log(x));
        functions.put("exp", x -> Math.exp(x));
        // This is a bug workaround for CONFORMAL MAPPING
        // As we are doing Str.replaceall(DiffWithRespTo,"y")
        functions.put("eyp", x -> Math.exp(x));
        //TODO:More Unary Functions to be added
    }
//Created by Rajesh Pai
// Substitutes State Values
@FunctionalInterface
    public interface BSExpression {

        Double evalState();
    }

    //Author:StackOverflow User:Boann & User :Mike Scholtes 
    // Taken from stackoverflow.com:Evaluating a math 
    // expression given in string form [closed]
    //http://stackoverflow.com/questions/3422673/evaluating-a-math-expression-given-in-string-form
    public static BSExpression parse(String str, Map<String, Double> variables, Map<String, Double> varNewState,String DiffWithRespTo, String Silent, MathsContxtLAv.LogLevel MyLogLevel) {

        return new Object() {
            void nextCharBSExpr() {
                ++posBSExpr;
                chBSExpr = (posBSExpr < StrBSExpr.length()) ? StrBSExpr.charAt(posBSExpr) : -1;
                if ((chBSExpr == -1) && (posBSExpr >= StrBSExpr.length())) {
                    posBSExpr = StrBSExpr.length();
                } else if ((chBSExpr == -1) || ((chBSExpr == 0))) {
                    throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "nextChar:nextChar:Unexpected: " + (char) chBSExpr + " int=" + (int) chBSExpr + " Cannot Format:" + StrBSExpr.substring(posBSExpr, StrBSExpr.length()));
                }
            }

            void prevCharBSExpr() {
                --posBSExpr;
                chBSExpr = (posBSExpr >= 0) ? StrBSExpr.charAt(posBSExpr) : -1;
                if ((chBSExpr == -1) && (posBSExpr < 0)) 
            ; else if ((chBSExpr == -1) || ((chBSExpr == 0))) {
                    throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "prevChar:prevChar:Unexpected: " + (char) chBSExpr + " int=" + (int) chBSExpr + " Cannot Format:" + StrBSExpr.substring(posBSExpr, StrBSExpr.length()));
                }
            }

            boolean eatBSExpr(int CharToEat) {
                while (chBSExpr == ' ') {
                    nextCharBSExpr();
                }
                if (chBSExpr == CharToEat) {
                    nextCharBSExpr();
                    return true;
                }
                return false;
            }

            boolean IsAConstantNumber(String StrX1, String DiffWithRespTo) {

                try {
                    StrIsAConstant = "Unknown";
                    String StrX = StrX1;
                    if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                        return IsAConstant(StrX1, DiffWithRespTo);
                    } else if ((StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (!StrX.contains(DiffWithRespTo))
                            && (StrX.matches("[\\-\\+]*[0-9\\.]+"))
                            //&& (!StrX.matches("[\\-\\+]*[a-zA-Z0-9]+"))
                            && (Double.isFinite(Double.valueOf(StrX)))) {
                        StrIsAConstant = "Number";
                        return true;
                    }
                } catch (NumberFormatException ConstExp) {
                    log.info("IsAConstant:Exception:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                }
                return false;
            }

            BSExpression parse() {
                StrBSExpr=eatAll(str,' ');
                BSExpression x = (() -> 0.0);
                if (StrBSExpr == null) {
                    return x;
                } else if (StrBSExpr.length() >= 1) {
                    posBSExpr = 0;
                    chBSExpr = StrBSExpr.charAt(0);
                } else if (StrBSExpr.length() <= 0) {
                    return x;
                }
                ParenthesisFlag = false;
                ParenthesisOperator = 0;
                ZeroTermSignFlag = false;
                if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                    log.info("Expression:parseExpression:Initial:StrBSExpr=" + StrBSExpr);
                }
                if ((StrBSExpr != null) && (StrBSExpr.length() > 0)
                        && (StrBSExpr.length() < 2)
                        && ((chBSExpr == '*')
                        || (chBSExpr == '/')
                        || (chBSExpr == '^'))) {
                    return x;
                } else if ((chBSExpr != 0) && (chBSExpr != -1)) {
                    x = parseExpression();
                }
                return x;
            }
            //Grammar:
            //expression = term | expression '+' term |expression '-' term
            //term = factor | term '*' factor | term '/' factor
            //factor = base | base ^ base
            //base = '-' base | '+' base | number | identifier |function expression | '(' expression ')'
            //

            BSExpression parseExpression() {
                BSExpression x = (() -> 0.0);
                int ExprStartPos = posBSExpr;
                int ExprEndPos = -1;
                if (posBSExpr < 0) {
                    ExprStartPos = 0;
                }

                x = parseTerm();
                if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                    log.info("Expression:parseExpression:Initial:x.eval=" + x.evalState());
                }
                for (;;) {
                    if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                        log.info("Expr:Expression:Top:Inside Loop: parseExpression:ParenthesisFlag=" + ParenthesisFlag + " chBSExpr=" + (char) chBSExpr + " posBSExpr=" + posBSExpr);
                    }
                    if (eatBSExpr(')')) {
                        return x;
                    } else if ((eatBSExpr('+'))) {// addition
                        if (eatBSExpr('(')) {
                            BSExpression a = x, b = parseExpression();
                            x = (() -> a.evalState() + b.evalState());
                            eatBSExpr(')');
                            if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                                log.info("Expression:parseExpression:x.evalState=" + x.evalState() + " a.evalState()=" + a.evalState() + "+ b.evalState()=" + b.evalState());
                            }
                        } else {
                            BSExpression a = x, b = parseTerm();
                            if (ZeroTermSignFlag == true) {
                                if ((Double.isFinite(a.evalState())) && (Double.isFinite(b.evalState()))) {
                                    x = (() -> -1.0 * a.evalState() + b.evalState());
                                } else {
                                    x = (() -> Double.POSITIVE_INFINITY);
                                }
                                ZeroTermSignFlag = false;
                            } else {
                                if ((Double.isFinite(a.evalState())) && (Double.isFinite(b.evalState()))) {
                                    x = (() -> a.evalState() + b.evalState());
                                } else {
                                    x = (() -> Double.POSITIVE_INFINITY);
                                }
                            }
                            if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                                log.info("Expression:parseExpression:x.eval=" + x.evalState() + " a.evalState()=" + a.evalState() + "+ b.evalState()=" + b.evalState());
                            }
                        }
                    } else if ((eatBSExpr('-'))) { // subtraction
                        if (eatBSExpr('(')) {
                            BSExpression a = x, b = parseExpression();
                            x = (() -> a.evalState() - b.evalState());
                            eatBSExpr(')');
                            if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                                log.info("Expression:parseExpression:x.eval=" + x.evalState() + " a.evalState()=" + a.evalState() + "- b.evalState()=" + b.evalState());
                            }
                        } else {
                            BSExpression a = x, b = parseTerm();
                            if (ZeroTermSignFlag == true) {
                                if ((Double.isFinite(a.evalState())) && (Double.isFinite(b.evalState()))) {
                                    x = (() -> -1.0 * a.evalState() - b.evalState());
                                } else {
                                    x = (() -> Double.POSITIVE_INFINITY);
                                }
                                ZeroTermSignFlag = false;
                            } else {
                                if ((Double.isFinite(a.evalState())) && (Double.isFinite(b.evalState()))) {
                                    x = (() -> a.evalState() - b.evalState());
                                } else {
                                    x = (() -> Double.POSITIVE_INFINITY);
                                }
                            }
                            if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                                log.info("Expression:parseExpression:x.eval=" + x.evalState() + " a.evalState()=" + a.evalState() + "- b.evalState()=" + b.evalState());
                            }
                        }

                    } else {
                        if ((posBSExpr >= 0) && (posBSExpr < StrBSExpr.length())) {
                            ExprEndPos = posBSExpr;
                        } else {
                            ExprEndPos = StrBSExpr.length();
                        }
                        if ((ExprStartPos > ExprEndPos)) {
                            ExprEndPos = StrBSExpr.length();
                        }
                        if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                            log.info("Expression:parseExpression:Return Value:x.eval=" + x.evalState() + " BSExpr=" + StrBSExpr.substring(ExprStartPos, ExprEndPos));
                        }
                        if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Warn.level) {
                            log.warn("Expression:parseExpression:Return Value:x.eval=" + x.evalState() + " BSExpr=" + StrBSExpr.substring(ExprStartPos, ExprEndPos));
                        }
                        return x;
                    }
                }
            }

            BSExpression parseTerm() {
                int TermStartPos = posBSExpr;
                int TermEndPos = -1;
                if (posBSExpr < 0) {
                    TermStartPos = 0;
                }
                BSExpression x = parseFactor();
                if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                    log.info("Expression:parseTerm:Initial:x.eval=" + x.evalState());
                }
                for (;;) {
                    BSExpression a = x;
                    if (eatBSExpr('*')) { // multiplication
                        if (eatBSExpr('(')) {
                            BSExpression b = parseExpression();
                            x = (() -> a.evalState() * b.evalState());
                            eatBSExpr(')');
                        } else {
                            BSExpression b = parseFactor();
                            if ((Double.isFinite(a.evalState())) && (Double.isFinite(b.evalState()))) {
                                x = (() -> a.evalState() * b.evalState());
                            } else {
                                x = (() -> Double.POSITIVE_INFINITY);
                            }
                            if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                                log.info("Expression:parseTerm:*:a.eval=" + a.evalState());
                            }
                            if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                                log.info("Expression:parseTerm:*:b.eval=" + b.evalState());
                            }
                            if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                                log.info("Expression:parseTerm:*:x.eval=" + x.evalState() + " a.evalState()=" + a.evalState() + "* b.evalState()=" + b.evalState());
                            }
                            int temp = chBSExpr;
                            nextCharBSExpr();
                            if (((chBSExpr == '+') || (chBSExpr == '-')) && (temp != '*') && (temp != '/')) {
                                posBSExpr--;
                                chBSExpr = temp;
                                return x;
                            } else if ((chBSExpr != -1) && (chBSExpr != 0)) {
                                posBSExpr--;
                                chBSExpr = temp;
                            }
                        }
                    } else if (eatBSExpr('/')) { // division
                        if (eatBSExpr('(')) {
                            BSExpression b = parseExpression();
                            x = (() -> a.evalState() / b.evalState());
                            eatBSExpr(')');
                        } else {
                            BSExpression b = parseFactor();
                            if ((Double.isFinite(a.evalState())) && (Double.isFinite(b.evalState()))) {
                                x = (() -> a.evalState() / b.evalState());
                            } else {
                                x = (() -> Double.POSITIVE_INFINITY);
                            }
                            if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                                log.info("Expression:parseTerm:/:a.eval=" + a.evalState());
                            }
                            if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                                log.info("Expression:parseTerm:/:b.eval=" + b.evalState());
                            }
                            if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                                log.info("Expression:parseTerm:/:x.eval=" + x.evalState() + " a.evalState()=" + a.evalState() + "/ b.evalState()=" + b.evalState());
                            }
                            int temp = chBSExpr;
                            nextCharBSExpr();
                            if (((chBSExpr == '+') || (chBSExpr == '-')) && (temp != '*') && (temp != '/')) {
                                posBSExpr--;
                                chBSExpr = temp;
                                return x;
                            } else if ((chBSExpr != -1) && (chBSExpr != 0)) {
                                posBSExpr--;
                                chBSExpr = temp;
                            }
                        }
                    } else if (eatBSExpr('%')) { // Modulus
                        BSExpression b = parseFactor();
                        if ((Double.isFinite(a.evalState())) && (Double.isFinite(b.evalState()))) {
                            x = (() -> a.evalState() % b.evalState());
                        } else {
                            x = (() -> Double.POSITIVE_INFINITY);
                        }
                        if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                            log.info("Expression:parseTerm:%:a.eval=" + a.evalState());
                        }
                        if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                            log.info("Expression:parseTerm:%:b.eval=" + b.evalState());
                        }
                        if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                            log.info("Expression:parseTerm:%:x.eval=" + x.evalState() + " a.evalState()=" + a.evalState() + "% b.evalState()=" + b.evalState());
                        }
                        int temp = chBSExpr;
                        nextCharBSExpr();
                        if (((chBSExpr == '+') || (chBSExpr == '-')) && (temp != '*') && (temp != '/')) {
                            posBSExpr--;
                            chBSExpr = temp;
                            return x;
                        } else if ((chBSExpr != -1) && (chBSExpr != 0)) {
                            posBSExpr--;
                            chBSExpr = temp;
                        }
                    } else {
                        if ((posBSExpr >= 0) && (posBSExpr < StrBSExpr.length())) {
                            TermEndPos = posBSExpr;
                        } else {
                            TermEndPos = StrBSExpr.length();
                        }
                        if ((TermStartPos > TermEndPos)) {
                            TermEndPos = StrBSExpr.length();
                        }
                        if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                            log.info("Expression:parseTerm:Return Value:x.eval=" + x.evalState() + " Term=" + StrBSExpr.substring(TermStartPos, TermEndPos));
                        }
                        if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Warn.level) {
                            log.warn("Expression:parseTerm:Return Value:x.eval=" + x.evalState() + " Term=" + StrBSExpr.substring(TermStartPos, TermEndPos));
                        }
                        return x;
                    }
                }
            }

            BSExpression parseFactor() {
                int FactorStartPos = posBSExpr;
                int FactorEndPos = -1;
                if (posBSExpr < 0) {
                    FactorStartPos = 0;
                }
                BSExpression x = parseBase();
                for (;;) {
                    if (eatBSExpr('^')) { // exponentiation
                        if (eatBSExpr('(')) {
                            BSExpression a = x, b = parseExpression();
                            x = (() -> a.evalState() * b.evalState());
                            eatBSExpr(')');
                            if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                                log.info("Expression:parseFactor:x.eval=" + x.evalState() + " Math.pow(a.evalState()=" + a.evalState() + "^ b.evalState()=" + b.evalState() + ")");
                            }
                        } else {
                            BSExpression a = x, b = parseBase();
                            if ((Double.isFinite(a.evalState())) && (Double.isFinite(b.evalState()))) {
                                x = (() -> Math.pow(a.evalState(), b.evalState()));
                            } else {
                                x = (() -> Double.POSITIVE_INFINITY);
                            }
                            if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                                log.info("Expression:parseFactor:x.eval=" + x.evalState() + " Math.pow(a.evalState()=" + a.evalState() + "^ b.evalState()=" + b.evalState() + ")");
                            }
                        }
                    } else {
                        if ((posBSExpr >= 0) && (posBSExpr < StrBSExpr.length())) {
                            FactorEndPos = posBSExpr;
                        } else {
                            FactorEndPos = StrBSExpr.length();
                        }
                        if ((FactorStartPos > FactorEndPos)) {
                            FactorEndPos = StrBSExpr.length();
                        }
                        if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                            log.info("Expression:parseFactor:FactorStartPos=" + FactorStartPos + " FactorEndPos=" + FactorEndPos);
                        }
                        if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                            log.info("Expression:parseFactor:Return Value:x.eval=" + x.evalState() + " Factor=" + StrBSExpr.substring(FactorStartPos, FactorEndPos));
                        }
                        if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Warn.level) {
                            log.warn("Expression:parseFactor:Return Value:x.eval=" + x.evalState() + " Factor=" + StrBSExpr.substring(FactorStartPos, FactorEndPos));
                        }
                        return x;
                    }
                }
            }

            BSExpression parseBase() {
                int startPos = posBSExpr;
                boolean StateFlag=false;
                BSExpression x = (() -> 0.0);
                if (posBSExpr >= StrBSExpr.length()) {
                    posBSExpr = -1;
                    chBSExpr = -1;
                    return x;
                }
                if ((eatBSExpr('-')) && (startPos != 0)) { // unary minus
                    BSExpression b = parseBase();
                    x = (() -> (-1.0) * b.evalState());
                    if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                        log.info("Expression:parseBase:-:Return Value:x.eval=" + x.evalState() + " startPos=" + startPos);
                    }
                    return x;
                } else if (eatBSExpr('+')) { // unary plus
                    x = parseBase();
                    if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                        log.info("Expression:parseBase:+:Return Value:x.eval=" + x.evalState());
                    }
                    return x;
                }

                if (eatBSExpr('(')) { //parentheses
                    //Code to handle Expressions:
                    int POpos = posBSExpr;
                    do {
                        posBSExpr--;
                    } while ((posBSExpr >= 0) && (posBSExpr < StrBSExpr.length()) && (!IsOperator(StrBSExpr.charAt(posBSExpr))));
                    if ((posBSExpr >= 0) && (posBSExpr < StrBSExpr.length())) {
                        ParenthesisOperator = StrBSExpr.charAt(posBSExpr);
                    } else {
                        ParenthesisOperator = '+';
                    }
                    posBSExpr = POpos;
                    ParenthesisFlag = true;
                    x = parseExpression();
                    eatBSExpr(')');
                    ParenthesisFlag = false;
                    if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                        log.info("Expression:parseBase:(:Return Value:x.eval=" + x.evalState());
                    }
                    return x;
                } else if (IsNumber(chBSExpr)) { //numbers
                    while (IsNumber(chBSExpr)) {
                        nextCharBSExpr();
                        if ((chBSExpr == 'E') || (chBSExpr == 'e')) {
                            nextCharBSExpr();
                            if ((chBSExpr == '-') || (chBSExpr == '+')) {
                                nextCharBSExpr();
                            }
                        }
                    }
                    double xx = 1.0;
                    if ((StrBSExpr != null) && (!StrBSExpr.equalsIgnoreCase("")) && (!StrBSExpr.equalsIgnoreCase("NaN")) && (posBSExpr <= StrBSExpr.length()) && (startPos <= (StrBSExpr.length() - 1))) {
                        if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                            log.info("Expression:parseBase: Number=" + StrBSExpr.substring(startPos, posBSExpr));
                        }
                        if ((IsAConstantNumber(StrBSExpr.substring(startPos, posBSExpr), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                            xx = Double.parseDouble(StrBSExpr.substring(startPos, posBSExpr));
                        }
                    } else {
                        if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                            log.info("Expression:parseBase:NaN:Exp Form: Number=" + StrBSExpr.substring(startPos, posBSExpr));
                        }
                        //xx=Double.parseDouble(String.format("%.12f"+StrRemoveEDbl(Str.substring(startPos, pos)) ) );
                        xx = Double.NaN;
                        posBSExpr = -1;
                        chBSExpr = -1;
                    }
                    if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                        log.info("Expression:parseBase:Number:Return Value:x.eval=" + x.evalState() + " xx=" + xx);
                    }
                    final Double XX = xx;
                    x = () -> XX;
                    if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                        log.info("Expression:parseBase:Number:Return Value:x.eval=" + x.evalState() + " xx=" + xx);
                    }
                    return x;
                } else if (IsVariable(chBSExpr)) {//functions & variables
                    while ((IsVariable(chBSExpr)) || (IsNumber(chBSExpr))) {
                        nextCharBSExpr();
                    }
                    if ((startPos == 0) && (StrBSExpr.charAt(startPos) == '-')) {
                        startPos++;
                        ZeroTermSignFlag = true;
                    }
                    if (chBSExpr == '$'){
                        StateFlag=true;
                    }
                    String name = StrBSExpr.substring(startPos, posBSExpr).trim();
                    if (StateFlag==true){
                        nextCharBSExpr();
                    }
                    if (functions.containsKey(name)) {
                        DoubleUnaryOperator func = functions.get(name);
                        nextCharBSExpr();//get open braces
                        BSExpression arg = parseExpression();
                        x = () -> func.applyAsDouble(arg.evalState());
                        if (chBSExpr == ')') {
                            nextCharBSExpr();
                        }
                        if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                            log.info("Expression:parseBase: Function: name=" + name + " x.evalState()=" + x.evalState() + " arg.evalState()=" + arg.evalState() + " startPos=" + startPos);
                        }
                    } else {
                        if((StateFlag==true)&&((name != null) && (!name.equalsIgnoreCase("")) && (!name.equalsIgnoreCase("NaN")) && (!name.equalsIgnoreCase("Infinity")) && (variables.get(name) != null)) ) {
                            // State Var Substitution
                            x = () -> varNewState.get(name);
                            StateFlag=false;
                        } else if ((name != null) && (!name.equalsIgnoreCase("")) && (!name.equalsIgnoreCase("NaN")) && (!name.equalsIgnoreCase("Infinity")) && (variables.get(name) != null)) {
                            // Normal Var Substitution
                            x = () -> variables.get(name);
                        } else if (name.equalsIgnoreCase("Infinity")) {
                            x = () -> Double.POSITIVE_INFINITY;
                        } else if (name.equalsIgnoreCase("Nan")) {
                            x = () -> Double.NaN;
                        }
                    }
                    if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                        log.info("Expression:parseBase: Variable: name=" + name + " x.evalState()=" + x.evalState() + " startPos=" + startPos);
                    }
                    return x;
                } else if (chBSExpr == ')') {
                    nextCharBSExpr();
                    if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                        log.info("Expression:parseBase:):Return Value:x.eval=" + x.evalState());
                    }
                    return x;
                } else {
                    if (((IsNotAnOperator(chBSExpr)) && ((!IsNumber(chBSExpr)) && (!IsVariable(chBSExpr)))) && (chBSExpr != 0) && (chBSExpr != -1) && (chBSExpr != '(')) {
                        if ((StrBSExpr != null) && (startPos < StrBSExpr.length()) && (startPos < posBSExpr) && (chBSExpr != -1) && (chBSExpr != 0)) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "Expression:parseBase:Unexpected: " + (char) chBSExpr + " int=" + (int) chBSExpr + " Cannot Format:" + StrBSExpr.substring(posBSExpr, StrBSExpr.length()));
                        } else if ((chBSExpr != -1) && (chBSExpr != 0) && (posBSExpr >= 1) && (posBSExpr < StrBSExpr.length()) && (IsNumber(chBSExpr))) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "Expression:parseBase:Please Check Code:Should not reach Here:Unexpected: " + (char) chBSExpr + " int=" + (int) chBSExpr + " Cannot Format:" + StrBSExpr.substring(posBSExpr, StrBSExpr.length()));
                        } else if ((chBSExpr != -1) && (chBSExpr != 0) && (posBSExpr >= 1) && (posBSExpr < StrBSExpr.length()) && (IsOperator(chBSExpr))) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "Expression:parseBase:Please Check Equation Operators / Code:Should not reach Here:Unexpected: " + (char) chBSExpr + " int=" + (int) chBSExpr + " Cannot Format:" + StrBSExpr.substring(posBSExpr, StrBSExpr.length()));
                        } else if ((chBSExpr != -1) && (chBSExpr != 0) && (posBSExpr >= 1) && (posBSExpr < StrBSExpr.length())) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "Expression:parseBase:Unexpected: " + (char) chBSExpr + " int=" + (int) chBSExpr + " Cannot Format:" + StrBSExpr.substring(posBSExpr, StrBSExpr.length()));
                        } else {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "Expression:parseBase:Unexpected char: " + (char) chBSExpr + " int=" + (int) chBSExpr + " Cannot Format:" + StrBSExpr.substring(posBSExpr, StrBSExpr.length()));
                        }
                    }
                    if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                        log.info("Expression:parseBase:Exception:Return Value:x.eval=" + x.evalState());
                    }
                    return x;
                }
            }
        }.parse();
    }
}
