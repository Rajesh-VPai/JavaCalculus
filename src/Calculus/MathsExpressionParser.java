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
import static Calculus.MathsContxtLAv.IsAlphaNumberSpecial;
import static Calculus.MathsContxtLAv.IsNumber;
import static Calculus.MathsContxtLAv.IsVariable;
import static Calculus.MathsContxtLAv.NormalNotPareFlag;
import static Calculus.MathsContxtLAv.ParenthesisFlag;
import static Calculus.MathsContxtLAv.ParenthesisOperator;
import static Calculus.MathsContxtLAv.PerfFLAG;
import static Calculus.MathsContxtLAv.StrCurrentTimeTaken;
import static Calculus.MathsContxtLAv.StrIsAConstant;
import static Calculus.MathsContxtLAv.ZeroTermSignFlag;
import static Calculus.MathsContxtLAv.eatAll;
import static Calculus.MathsContxtLAv.functions;
import static Calculus.MathsContxtLAv.log;
import static Calculus.MathsContxtLAv.multiArgFunctions;
import static Calculus.UsageCalculus.Order;
import static Calculus.UsageCalculus.StageMapping;
import static Calculus.UsageCalculus.TestCase;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleUnaryOperator;

/**
 *
 * @author Rajesh V Pai
 */
public class MathsExpressionParser {
    
    public static Map<String, Double> variables = new HashMap<>();// Expression Term character Index and Character Variable    
    public static int posExpr = -1, chExpr = -1;
    public static String StrExpr = "";
    public static enum LogLevel {
        All(7), Debug(6), Info(5), Warn(4), Error(3), Fatal(2), Off(1);
        int level = 0;

        LogLevel(int level1) {
            this.level = level1;
        }
    }
    public static String eatAll(String Temp, int CharToEat) {
        String MyTempString = "";
        //if (Temp.equalsIgnoreCase("")) {
        //    Temp = Str;
        //}
        for (int i = 0; (i < Temp.length());) {
            if (CharToEat == Temp.charAt(i)) {
                i++;
            } else {
                MyTempString = MyTempString + Temp.charAt(i);
                i++;
            }
        }
        return MyTempString;
    }
     @FunctionalInterface
    public interface Expression {

        Double eval();
    }

    //Author:StackOverflow User:Boann & User :Mike Scholtes 
    // Taken from stackoverflow.com:Evaluating a math 
    // expression given in string form [closed]
    //http://stackoverflow.com/questions/3422673/evaluating-a-math-expression-given-in-string-form
    //Grammar:
//<expression> ::= <term> | <expression> "+" <term> | <expression> "-" <term> 
//<term>       ::= <factor> | <term> "*" <factor> | <term> "/" <factor> | <term> "^" <factor>
//<factor>     ::= <number> | <identifier> | <function> | "(" <expression> ")"
//<function>   ::= <identifier> "(" <arguments> ")"
//<arguments>  ::= <expression> | <expression> "," <arguments>
//<number>     ::= <digit> | <digit> <number>
//<digit>      ::= "0" | "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9"
//<identifier> ::= <letter> | <letter> <identifier>
//<letter>     ::= "a" | "b" | "c" | ... | "z" | "A" | "B" | "C" | ... | "Z"
    public static Expression parse(String str, Map<String, Double> variables, String DiffWithRespTo, boolean HideAllFlag, String Silent, LogLevel MyLogLevel) {

        return new Object() {
            void nextCharExpr() {
                ++posExpr;
                chExpr = (posExpr < StrExpr.length()) ? StrExpr.charAt(posExpr) : -1;
                if ((chExpr == -1) && (posExpr >= StrExpr.length())) {
                    posExpr = StrExpr.length();
                } else if ((chExpr == -1) || ((chExpr == 0))) {
                    throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "nextChar:nextChar:Unexpected: " + (char) chExpr + " int=" + (int) chExpr + " Cannot Format:" + StrExpr.substring(posExpr, StrExpr.length()));
                }
            }

            void prevCharExpr() {
                --posExpr;
                chExpr = (posExpr >= 0) ? StrExpr.charAt(posExpr) : -1;
                if ((chExpr == -1) && (posExpr < 0)) 
            ; else if ((chExpr == -1) || ((chExpr == 0))) {
                    throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "prevChar:prevChar:Unexpected: " + (char) chExpr + " int=" + (int) chExpr + " Cannot Format:" + StrExpr.substring(posExpr, StrExpr.length()));
                }
            }

            boolean eatExpr(int CharToEat) {
                while (chExpr == ' ') {
                    nextCharExpr();
                }
                if (chExpr == CharToEat) {
                    nextCharExpr();
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
                            && (StrX.matches("[\\-\\+]*[0-9\\.]+[Ee]*[\\-\\+]*[0-9]*"))
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

            Expression parse() {
                if (PerfFLAG == false) {
                    LocalDateTime current = LocalDateTime.now();
                    String[] TimeTaken = current.toString().split(":");
                    if (TimeTaken.length == 3) {
                        StrCurrentTimeTaken = "" + (Integer.parseInt(TimeTaken[1]) * 60) + (Double.parseDouble(TimeTaken[2]));
                    } else {
                        StrCurrentTimeTaken = "" + (Integer.parseInt(TimeTaken[1]) * 60);
                    }
                    //System.out.println("parse Started:Run Time:" + current + " ");
                }
                StrExpr = eatAll(str, ' ');
                //System.out.println("MathsContxtLAv:parse:Exprn=" + StrExpr);
                Expression x = (() -> 0.0);
                if (StrExpr == null) {
                    return x;
                } else if (StrExpr.length() >= 1) {
                    posExpr = 0;
                    chExpr = StrExpr.charAt(0);
                } else if (StrExpr.length() <= 0) {
                    return x;
                }
                ParenthesisFlag = false;
                NormalNotPareFlag = true;
                ParenthesisOperator = 0;
                ZeroTermSignFlag = false;
                if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                    log.info("Expression:parseExpression:Initial:StrExpr=" + StrExpr);
                }
                if ((StrExpr != null) && (StrExpr.length() > 0)
                        && (StrExpr.length() < 2)
                        && ((chExpr == '*')
                        || (chExpr == '/')
                        || (chExpr == '^'))) {
                    return x;
                } else if ((chExpr != 0) && (chExpr != -1)) {
                    x = parseExpression();
                } else {
                    throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "Expression:If NOT SATISFIED:parse: StrExpr.length()=" + StrExpr.length());
                }
                if (PerfFLAG == false) {
                    LocalDateTime current = LocalDateTime.now();
                    String[] TimeTaken = current.toString().split(":");
                    String localStrCurrentTimeTaken = "";
                    if (TimeTaken.length == 3) {
                        localStrCurrentTimeTaken = "" + (Integer.parseInt(TimeTaken[1]) * 60) + (Double.parseDouble(TimeTaken[2]));
                    } else {
                        localStrCurrentTimeTaken = "" + (Integer.parseInt(TimeTaken[1]) * 60);
                    }
                    System.out.println("parse Completed:Run Time:" + current + " Time Taken=" + (1000.0 * (Double.parseDouble(localStrCurrentTimeTaken) - Double.parseDouble(StrCurrentTimeTaken))) + " milli seconds.");
                }
                PerfFLAG = true;
                return x;
            }

            Expression parseExpression() {
                Expression x = (() -> 0.0);
                int ExprStartPos = posExpr;
                int ExprEndPos = -1;
                if (posExpr < 0) {
                    ExprStartPos = 0;
                }

                x = parseTerm();
                if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                    log.info("Expression:parseExpression:Initial:x.eval=" + x.eval());
                }
                for (;;) {
                    if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                        log.info("Expr:Expression:Top:Inside Loop: parseExpression:ParenthesisFlag=" + ParenthesisFlag + " NormalNotPareFlag=" + NormalNotPareFlag + " chExpr=" + (char) chExpr + " pos=" + posExpr);
                    }
                    if ((eatExpr('+'))) {// addition
                        Expression a = x, b = parseTerm();
                        final Double Aeval = a.eval();
                        final Double Beval = b.eval();
                        if (ZeroTermSignFlag == true) {
                            if ((Double.isFinite(Aeval)) && (Double.isFinite(Beval))) {
                                x = (() -> -1.0 * Aeval + Beval);
                            } else {
                                x = (() -> Double.POSITIVE_INFINITY);
                            }
                            ZeroTermSignFlag = false;
                        } else {
                            if ((Double.isFinite(Aeval)) && (Double.isFinite(Beval))) {
                                x = (() -> Aeval + Beval);
                            } else {
                                x = (() -> Double.POSITIVE_INFINITY);
                            }
                        }
                        if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                            log.info("Expression:parseExpression:x.eval=" + x.eval() + " a.eval()=" + a.eval() + "+ b.eval()=" + b.eval());
                        }
                    } else if ((eatExpr('-'))) { // subtraction
                        Expression a = x, b = parseTerm();
                        final Double Aeval = a.eval();
                        final Double Beval = b.eval();
                        if (ZeroTermSignFlag == true) {
                            if ((Double.isFinite(Aeval)) && (Double.isFinite(Beval))) {
                                x = (() -> -1.0 * Aeval - Beval);
                            } else {
                                x = (() -> Double.POSITIVE_INFINITY);
                            }
                            ZeroTermSignFlag = false;
                        } else {
                            if ((Double.isFinite(Aeval)) && (Double.isFinite(Beval))) {
                                x = (() -> Aeval - Beval);
                            } else {
                                x = (() -> Double.POSITIVE_INFINITY);
                            }
                        }
                        if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                            log.info("Expression:parseExpression:x.eval=" + x.eval() + " a.eval()=" + a.eval() + "- b.eval()=" + b.eval());
                        }
                    } else {
                        if ((posExpr >= 0) && (posExpr < StrExpr.length())) {
                            ExprEndPos = posExpr;
                        } else {
                            ExprEndPos = StrExpr.length();
                        }
                        if ((ExprStartPos > ExprEndPos)) {
                            ExprEndPos = StrExpr.length();
                        }
                        if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                            log.info("Expression:parseExpression:Return Value:x.eval=" + x.eval() + " Expr=" + StrExpr.substring(ExprStartPos, ExprEndPos));
                        }
                        if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Warn.level) {
                            log.warn("Expression:parseExpression:Return Value:x.eval=" + x.eval() + " Expr=" + StrExpr.substring(ExprStartPos, ExprEndPos));
                        }
                        return x;
                    }
                }
            }

            Expression parseTerm() {
                int TermStartPos = posExpr;
                int TermEndPos = -1;
                if (posExpr < 0) {
                    TermStartPos = 0;
                }
                Expression x = parseFactor();
                if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                    log.info("Expression:parseTerm:Initial:x.eval=" + x.eval());
                }
                for (;;) {
                    Expression a = x;
                    final Double Aeval = a.eval();
                    if (eatExpr('*')) { // multiplication
                        Expression b = parseFactor();
                        final Double Beval = b.eval();
                        if ((Double.isFinite(Aeval)) && (Double.isFinite(Beval))) {
                            x = (() -> Aeval * Beval);
                        } else {
                            x = (() -> Double.POSITIVE_INFINITY);
                        }
                        if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                            log.info("Expression:parseTerm:*:a.eval=" + Aeval);
                        }
                        if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                            log.info("Expression:parseTerm:*:b.eval=" + Beval);
                        }
                        if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                            log.info("Expression:parseTerm:*:x.eval=" + x.eval() + " a.eval()=" + Aeval + "* b.eval()=" + Beval);
                        }
                        int temp = chExpr;
                        nextCharExpr();
                        if (((chExpr == '+') || (chExpr == '-')) && (temp != '*') && (temp != '/')) {
                            posExpr--;
                            chExpr = temp;
                            return x;
                        } else if ((chExpr != -1) && (chExpr != 0)) {
                            posExpr--;
                            chExpr = temp;
                        }
                        //}
                    } else if (eatExpr('/')) { // division
                        Expression b = parseFactor();
                        final Double Beval = b.eval();
                        if ((Double.isFinite(Aeval)) && (Double.isFinite(Beval))) {
                            x = (() -> Aeval / Beval);
                        } else {
                            x = (() -> Double.POSITIVE_INFINITY);
                        }
                        if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                            log.info("Expression:parseTerm:/:a.eval=" + Aeval);
                        }
                        if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                            log.info("Expression:parseTerm:/:b.eval=" + Beval);
                        }
                        if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                            log.info("Expression:parseTerm:/:x.eval=" + x.eval() + " a.eval()=" + Aeval + "/ b.eval()=" + Beval);
                        }
                        int temp = chExpr;
                        nextCharExpr();
                        if (((chExpr == '+') || (chExpr == '-')) && (temp != '*') && (temp != '/')) {
                            posExpr--;
                            chExpr = temp;
                            return x;
                        } else if ((chExpr != -1) && (chExpr != 0)) {
                            posExpr--;
                            chExpr = temp;
                        }
                        //}
                    } else if (eatExpr('%')) { // Modulus
                        Expression b = parseFactor();
                        final Double Beval = b.eval();
                        if ((Double.isFinite(Aeval)) && (Double.isFinite(Beval))) {
                            x = (() -> Aeval % Beval);
                        } else {
                            x = (() -> Double.POSITIVE_INFINITY);
                        }
                        if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                            log.info("Expression:parseTerm:%:a.eval=" + Aeval);
                        }
                        if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                            log.info("Expression:parseTerm:%:b.eval=" + Beval);
                        }
                        if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                            log.info("Expression:parseTerm:%:x.eval=" + x.eval() + " a.eval()=" + Aeval + "% b.eval()=" + Beval);
                        }
                        int temp = chExpr;
                        nextCharExpr();
                        if (((chExpr == '+') || (chExpr == '-')) && (temp != '*') && (temp != '/')) {
                            posExpr--;
                            chExpr = temp;
                            return x;
                        } else if ((chExpr != -1) && (chExpr != 0)) {
                            posExpr--;
                            chExpr = temp;
                        }
                    } else {
                        if ((posExpr >= 0) && (posExpr < StrExpr.length())) {
                            TermEndPos = posExpr;
                        } else {
                            TermEndPos = StrExpr.length();
                        }
                        if ((TermStartPos > TermEndPos)) {
                            TermEndPos = StrExpr.length();
                        }
                        if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                            log.info("Expression:parseTerm:Return Value:x.eval=" + x.eval() + " Term=" + StrExpr.substring(TermStartPos, TermEndPos));
                        }
                        if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Warn.level) {
                            log.warn("Expression:parseTerm:Return Value:x.eval=" + x.eval() + " Term=" + StrExpr.substring(TermStartPos, TermEndPos));
                        }
                        return x;
                    }
                }
            }

            Expression parseFactor() {
                int FactorStartPos = posExpr;
                int FactorEndPos = -1;
                if (posExpr < 0) {
                    FactorStartPos = 0;
                }
                Expression x = parseBase();
                for (;;) {
                    if (eatExpr('^')) { // exponentiation

                        Expression a = x, b = parseBase();
                        final Double Aeval = a.eval();
                        final Double Beval = b.eval();
                        if ((Double.isFinite(Aeval)) && (Double.isFinite(Beval))) {
                            x = (() -> Math.pow(Aeval, Beval));
                        } else {
                            x = (() -> Double.POSITIVE_INFINITY);
                        }
                        if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                            log.info("Expression:parseFactor:x.eval=" + x.eval() + " Math.pow(a.eval()=" + Aeval + "^ b.eval()=" + Beval + ")");
                        }
                    } else {
                        if ((posExpr >= 0) && (posExpr < StrExpr.length())) {
                            FactorEndPos = posExpr;
                        } else {
                            FactorEndPos = StrExpr.length();
                        }
                        if ((FactorStartPos > FactorEndPos)) {
                            FactorEndPos = StrExpr.length();
                        }
                        if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                            log.info("Expression:parseFactor:FactorStartPos=" + FactorStartPos + " FactorEndPos=" + FactorEndPos);
                        }
                        if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Info.level) {
                            log.info("Expression:parseFactor:Return Value:x.eval=" + x.eval() + " Factor=" + StrExpr.substring(FactorStartPos, FactorEndPos));
                        }
                        if (MyLogLevel.level >= MathsContxtLAv.LogLevel.Warn.level) {
                            log.warn("Expression:parseFactor:Return Value:x.eval=" + x.eval() + " Factor=" + StrExpr.substring(FactorStartPos, FactorEndPos));
                        }
                        return x;
                    }
                }
            }

//            Expression parseBase() {
//                int startPos = posExpr;
//                Expression x = (() -> 0.0);
//                if (posExpr >= StrExpr.length()) {
//                    posExpr = -1;
//                    chExpr = -1;
//                    return x;
//                }
//                if (eatExpr('-')) { // unary minus
//                    Expression b = parseFactor();
//                    x = (() -> (-1.0) * b.eval());
//                    return x;
//                } else if (eatExpr('+')) { // unary plus
//                    x = parseBase();
//                    return x;
//                }
//
//                // 1. Handle Numbers
//                if (IsNumber(chExpr)) {
//                    while (IsNumber(chExpr)) {
//                        nextCharExpr();
//                        if ((chExpr == 'E') || (chExpr == 'e')) {
//                            nextCharExpr();
//                            if ((chExpr == '-') || (chExpr == '+')) {
//                                nextCharExpr();
//                            }
//                        }
//                    }
//                    double xx = 1.0;
//                    if ((StrExpr != null) && (!StrExpr.equalsIgnoreCase("")) && (!StrExpr.equalsIgnoreCase("NaN")) && (posExpr <= StrExpr.length()) && (startPos <= (StrExpr.length() - 1))) {
//                        if (IsAConstantNumber(StrExpr.substring(startPos, posExpr), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
//                            xx = Double.parseDouble(StrExpr.substring(startPos, posExpr));
//                        }
//                    } else {
//                        xx = Double.NaN;
//                        posExpr = -1;
//                        chExpr = -1;
//                    }
//                    final Double XX = xx;
//                    x = () -> XX;
//                    return x;
//
//                    // 2. Handle Functions & Variables
//                } else if (IsVariable(chExpr)) {
//                    while (IsAlphaNumberSpecial(chExpr)) {
//                        nextCharExpr();
//                    }
//                    if ((startPos == 0) && (StrExpr.charAt(startPos) == '-')) {
//                        startPos++;
//                        ZeroTermSignFlag = true;
//                    }
//                    String name = StrExpr.substring(startPos, posExpr).trim();
//
//                    if (functions.containsKey(name)) { // Standard Functions
//                        DoubleUnaryOperator func = functions.get(name);
//                        nextCharExpr(); // get open brace
//                        Expression arg = parseExpression();
//                        x = () -> func.applyAsDouble(arg.eval());
//                        if (chExpr == ')') {
//                            nextCharExpr();
//                        }
//                        return x;
//                    } else { // Standard Variables
//                        if ((name != null) && (!name.equalsIgnoreCase("")) && (!name.equalsIgnoreCase("NaN")) && (!name.equalsIgnoreCase("Infinity")) && (variables.get(name) != null)) {
//                            x = () -> variables.get(name);
//                        } else if (name.equalsIgnoreCase("Infinity")) {
//                            x = () -> Double.POSITIVE_INFINITY;
//                        } else if (name.equalsIgnoreCase("Nan")) {
//                            x = () -> Double.NaN;
//                        } else {
//                            throw new RuntimeException("Undefined variable: " + name);
//                        }
//                        return x;
//                    }
//
//                    // 3. Handle Parentheses Expressions (MOVED HERE)
//                } else if (eatExpr('(')) {
//                    Expression b = parseExpression();
//                    eatExpr(')');
//                    return b;
//
//                    // 4. Handle Unexpected Characters
//                } else {
//                    if (((IsNotAnOperator(chExpr)) && ((!IsNumber(chExpr)) && (!IsVariable(chExpr)))) && (chExpr != 0) && (chExpr != -1) && (chExpr != '(')) {
//                        throw new RuntimeException("Unexpected character: " + (char) chExpr);
//                    }
//                    return x;
//                }
//            }
            Expression parseBase() {
                int startPos = posExpr;
                Expression x = (() -> 0.0);

                if (posExpr >= StrExpr.length()) {
                    posExpr = -1;
                    chExpr = -1;
                    return x;
                }

                // Unary operators
                if (eatExpr('-')) {
                    Expression b = parseBase();
                    return (() -> -1.0 * b.eval());
                } else if (eatExpr('+')) {
                    return parseBase();
                }

                // Numbers
                if (IsNumber(chExpr)) {
                    while (IsNumber(chExpr)) {
                        nextCharExpr();
                        if ((chExpr == 'E') || (chExpr == 'e')) {
                            nextCharExpr();
                            if ((chExpr == '-') || (chExpr == '+')) {
                                nextCharExpr();
                            }
                        }
                    }
                    double value = Double.parseDouble(StrExpr.substring(startPos, posExpr));
                    final Double val = value;
                    return (() -> val);
                }

                // Identifiers: functions or variables
                if (IsVariable(chExpr)) {
                    while (IsAlphaNumberSpecial(chExpr)) {
                        nextCharExpr();
                    }
                    String name = StrExpr.substring(startPos, posExpr).trim();

                    // Function call
                    if (eatExpr('(')) {
                        List<Expression> args = new ArrayList<>();
                        args.add(parseExpression());
                        while (eatExpr(',')) {
                            args.add(parseExpression());
                        }
                        eatExpr(')');

                        if (functions.containsKey(name)) {
                            if (args.size() == 1) {
                                DoubleUnaryOperator func = functions.get(name);
                                //System.out.println("JavaCalculus:MathsContxtLAv:Reached Function:name=" + name + " eval=" + args.get(0).eval() + " overall Value=" + func.applyAsDouble(args.get(0).eval()));
                                return (() -> func.applyAsDouble(args.get(0).eval()));
                            } else {
                                throw new RuntimeException("Function " + name + " supports only one argument");
                            }
                        } else if (multiArgFunctions.containsKey(name)) {
                            DoubleBinaryOperator func = multiArgFunctions.get(name);
                            if (args.size() == 2) {
                                return (() -> func.applyAsDouble(args.get(0).eval(), args.get(1).eval()));
                            } else {
                                throw new RuntimeException("Function " + name + " requires two arguments");
                            }
                        } else {
                            throw new RuntimeException("Unknown function: " + name);
                        }
                    }

                    // Variable
                    if (variables.containsKey(name)) {
                        return (() -> variables.get(name));
                    } else if (name.equalsIgnoreCase("Infinity")) {
                        return (() -> Double.POSITIVE_INFINITY);
                    } else if (name.equalsIgnoreCase("NaN")) {
                        return (() -> Double.NaN);
                    } else {
                        throw new RuntimeException("Unknown identifier: " + name);
                    }
                }

                // Parentheses
                if (eatExpr('(')) {
                    Expression expr = parseExpression();
                    eatExpr(')');
                    return expr;
                }
                throw new RuntimeException("Unexpected character: " + (char) chExpr);
            }
        }.parse();
    }
   
}
