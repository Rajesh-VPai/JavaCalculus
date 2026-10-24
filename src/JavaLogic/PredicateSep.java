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
package JavaLogic;

import static JavaLogic.TernaryLogic.IsLogicalOperator;
import static JavaLogic.TernaryLogic.IsNumber;
import static JavaLogic.TernaryLogic.IsOperator;
import static JavaLogic.TernaryLogic.IsVariable;
import JavaLogic.TernaryLogic.LogLevel;
import static JavaLogic.TernaryLogic.eatAll;
import java.util.Map;
import org.apache.log4j.Logger;

/**
 *
 * @author Rajesh V Pai
 */
public class PredicateSep {

    public static Logger log = Logger.getLogger(PredicateSep.class.getName());
    // Bool Predicate character Index and Character Variable & String Variable    
    private static int posBool = -1, chBool;
    private static int chNextBool;
    private static String StrBool;
    
    //HghLvlPredicate Expression character Index and Character Variable
    private static int posHghLvl = -1, chHghLvl;
    private static int chNextHghLvl;
    private static String StrHghLvl;

    //Predicate Variables
    private static int PredicateArithOper = -1;
    private static int PredicateArithOperNext = -1;
    private static boolean NegateGotFlag = false;
    private static boolean ZeroTermSignFlag = false;

//Created by Rajesh Pai
// Implements Predicates(Conditions) for F(x) Expressions
    @FunctionalInterface
    public interface PredicateBool {

        boolean eval();
    }

    // Taken from stackoverflow.com:Evaluating a math 
    // expression given in string form [closed]
    //http://stackoverflow.com/questions/3422673/evaluating-a-math-expression-given-in-string-form
    public static PredicateBool parsePredicate(String str, Map<String, Double> variables, String Silent, LogLevel MyLogLevel) {

        return new Object() {

            void nextStrCharBool() {
                ++posBool;
                chBool = (posBool < StrBool.length()) ? StrBool.charAt(posBool) : -1;
                if (posBool < (StrBool.length() - 1)) {
                    chNextBool = StrBool.charAt(posBool + 1);
                } else {
                    chNextBool = -1;
                }
                if ((chBool == -1) && (posBool <= StrBool.length())) {
                    posBool = StrBool.length();
                } else if ((chBool == -1) || ((chBool == 0))) {
                    throw new RuntimeException("Expression:parseBase:Unexpected: " + (char) chBool + " int=" + (int) chBool + " Cannot Format:" + StrBool.substring(posBool, StrBool.length()));
                }
            }

            boolean eatBool(int CharToEat) {
                while (chBool == ' ') {
                    nextStrCharBool();
                }
                if (chBool == CharToEat) {
                    nextStrCharBool();
                    return true;
                }
                return false;
            }

            PredicateBool parsePredicate() {
                StrBool=eatAll(str,' ');
                posBool = -1;
                chBool = 0;
                chNextBool = 0;
                PredicateArithOper = -1;
                if ((StrBool == null) || (StrBool.equalsIgnoreCase(""))) {
                    return (() -> false);
                }
                nextStrCharBool();
                PredicateBool x = parseExpression();
                return x;
            }
            //Grammar:
            //expression = term | expression '+' term |expression '-' term
            //term = factor | term '*' factor | term '/' factor
            //factor = base | base ^ base
            //base = '-' base | '+' base | number | identifier |function expression | '(' expression ')'
            //

            PredicateBool parseExpression() {
                PredicateBool x = parseFactorPredicate();
                for (;;) {
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("PredicateBool:Expression:Top:Inside Loop: parseExpression:chBool=" + (char) chBool);
                    }
                    if (chBool == ')') {
                        nextStrCharBool();
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("PredicateBool:parseExpression:):Return Value:x.eval()=" + x.eval());
                        }
                        //return x;
                    } else if (chBool == '(') {
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("PredicateBool:parseExpression:):(:NegateGotFlag=" + NegateGotFlag);
                        }
                        chBool = chNextBool;
                    } else if ((chBool == '&') && (chNextBool == '&')) {// Logical AND

                        PredicateBool a = x, b = parseFactorPredicate();
                        x = (() -> (a.eval() && b.eval()));
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("PredicateBool:parseExpression:AND:a.eval()=" + a.eval());
                            log.info("PredicateBool:parseExpression:AND:b.eval()=" + b.eval());
                            log.info("PredicateBool:parseExpression:AND:x.eval()=" + x.eval());
                        }
                    } else if ((chBool == '|') && (chNextBool == '|')) { // Logical OR

                        PredicateBool a = x, b = parseFactorPredicate();
                        x = (() -> (a.eval() || b.eval()));
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("PredicateBool:parseExpression:OR:a.eval()=" + a.eval());
                            log.info("PredicateBool:parseExpression:OR:b.eval()=" + b.eval());
                            log.info("PredicateBool:parseExpression:OR:x.eval()=" + x.eval());
                        }
                    } else {
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("PredicateBool:parseExpression:Return Value:x.eval()=" + x.eval());
                        }
                        return x;
                    }
                }
            }

            PredicateBool parseFactorPredicate() {
                PredicateBool x = parseTermPredicate();
                if (MyLogLevel.level >= LogLevel.Info.level) {
                    log.info("PredicateBool:parseFactorPredicate:Initial Value:x.eval()=" + x.eval() + " NegateGotFlag=" + NegateGotFlag);
                }
                if ((chBool == '!') || (NegateGotFlag == true)) { // exponentiation
                    final boolean Temp = x.eval();
                    x = (() -> (!Temp));
                }
                if (MyLogLevel.level >= LogLevel.Info.level) {
                    log.info("PredicateBool:parseFactorPredicate:Return Value:x.eval()=" + x.eval() + " NegateGotFlag=" + NegateGotFlag);
                }
                return x;
            }

            PredicateBool parseTermPredicate() {
                Double x = parseArithExpression();
                PredicateBool y = (() -> false);
                boolean TempInit = true;
                for (;;) {
                    if (chBool == ')') {
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("PredicateBool:parseTerm:):Initial Value:y.eval()=" + y.eval() + " NegateGotFlag=" + NegateGotFlag);
                        }
                        if (NegateGotFlag == true) {
                            final boolean Temp = y.eval();
                            y = (() -> !Temp);
                        }
                        NegateGotFlag = false;
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("PredicateBool:parseTerm:):Return Value:y.eval()=" + y.eval() + " NegateGotFlag=" + NegateGotFlag);
                        }
                        return y;
                    } else if (chBool == '(') {
                        //nextStrCharBool();
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("PredicateBool:parseTerm:(:y.eval()=" + y.eval());
                        }
                    } else if ((chBool == '<') && (chNextBool == '=')) { // GreaterThanOREqualTo
                        nextStrCharBool();
                        Double a = x;
                        Double b = parseArithExpression();
                        final boolean Temp = y.eval();
                        if (TempInit == false) {
                            y = (() -> Temp && (a.doubleValue() <= b.doubleValue()));
                        } else {
                            y = (() -> (a.doubleValue() <= b.doubleValue()));
                        }
                        TempInit = false;
                        x = b;
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("PredicateBool:parseTerm:<=:a=" + a);
                            log.info("PredicateBool:parseTerm:<=:b=" + b);
                            log.info("PredicateBool:parseTerm:<=:y.eval()=" + y.eval());
                        }
                    } else if ((chBool == '<') && (chNextBool != '=')) { // GreaterThan
                        chBool = chNextBool;
                        posBool++;
                        Double a = x;
                        Double b = parseArithExpression();
                        final boolean Temp = y.eval();
                        if (TempInit == false) {
                            y = (() -> Temp && (a.doubleValue() < b.doubleValue()));
                        } else {
                            y = (() -> (a.doubleValue() < b.doubleValue()));
                        }
                        TempInit = false;
                        x = b;
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("PredicateBool:parseTerm:<:a=" + a);
                            log.info("PredicateBool:parseTerm:<:b=" + b);
                            log.info("PredicateBool:parseTerm:<:y.eval()=" + y.eval());
                        }
                    } else if ((chBool == '>') && (chNextBool == '=')) { // LessThan
                        nextStrCharBool();
                        Double a = x;
                        Double b = parseArithExpression();
                        final boolean Temp = y.eval();
                        if (TempInit == false) {
                            y = (() -> Temp && (a.doubleValue() >= b.doubleValue()));
                        } else {
                            y = (() -> (a.doubleValue() >= b.doubleValue()));
                        }
                        TempInit = false;
                        x = b;
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("PredicateBool:parseTerm:>=:a=" + a);
                            log.info("PredicateBool:parseTerm:>=:b=" + b);
                            log.info("PredicateBool:parseTerm:>=:y.eval()=" + y.eval());
                        }
                    } else if ((chBool == '>') && (chNextBool != '=')) { // LessThanOREqualTo
                        chBool = chNextBool;
                        posBool++;
                        Double a = x;
                        Double b = parseArithExpression();
                        final boolean Temp = y.eval();
                        if (TempInit == false) {
                            y = (() -> Temp && (a.doubleValue() > b.doubleValue()));
                        } else {
                            y = (() -> (a.doubleValue() > b.doubleValue()));
                        }
                        TempInit = false;
                        x = b;
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("PredicateBool:parseTerm:>:a=" + a);
                            log.info("PredicateBool:parseTerm:>:b=" + b);
                            log.info("PredicateBool:parseTerm:>:y.eval()=" + y.eval());
                        }
                    } else if ((chBool == '=')) { // EqualTo
                        Double a = x;
                        Double b = parseArithExpression();
                        final boolean Temp = y.eval();
                        if (TempInit == false) {
                            y = (() -> Temp && (a.doubleValue() == b.doubleValue()));
                        } else {
                            y = (() -> (a.doubleValue() == b.doubleValue()));
                        }
                        TempInit = false;
                        x = b;
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("PredicateBool:parseTerm:==:a=" + a);
                            log.info("PredicateBool:parseTerm:==:b=" + b);
                            log.info("PredicateBool:parseTerm:==:y.eval()=" + y.eval());
                        }
                    } else if ((chBool == '!') && (chNextBool == '=')) { // Not EqualTo
                        Double a = x;
                        Double b = parseArithExpression();
                        final boolean Temp = y.eval();
                        if (TempInit == false) {
                            y = (() -> Temp && (a.doubleValue() != b.doubleValue()));
                        } else {
                            y = (() -> (a.doubleValue() != b.doubleValue()));
                        }
                        TempInit = false;
                        x = b;
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("PredicateBool:parseTerm:==:a=" + a);
                            log.info("PredicateBool:parseTerm:==:b=" + b);
                            log.info("PredicateBool:parseTerm:==:y.eval()=" + y.eval());
                        }
                    } else {
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("PredicateBool:parseTerm:Return Value:y.eval()=" + y.eval());
                        }
                        return y;
                    }
                }
            }

            Double parseArithExpression() {
                Double x = 0.0;
                int ExprStartPos = posBool;
                int ExprEndPos = -1;
                if (posBool < 0) {
                    ExprStartPos = 0;
                }
                x = parseTerm();
                if (MyLogLevel.level >= LogLevel.Info.level) {
                    log.info("PredicateBool:parseArithExpression:Initial:x=" + x);
                }
                for (;;) {
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("PredicateBool:parseArithExpression:Top:Inside Loop: parseExpression:chBool=" + (char) chBool + " posBool=" + posBool);
                    }
                    if (eatBool(')')) {
                        return x;
                    } else if ((eatBool('+'))) {// addition
                        Double a = x, b = parseTerm();
                        if (ZeroTermSignFlag == true) {
                            x = -1.0 * a + b;
                            ZeroTermSignFlag = false;
                        } else {
                            x = a + b;
                        }
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("PredicateBool:parseArithExpression:x=" + x + " a=" + a + "+ b=" + b);
                        }
                    } else if ((eatBool('-'))) { // subtraction
                        Double a = x, b = parseTerm();
                        if (ZeroTermSignFlag == true) {
                            x = -1.0 * a - b;
                            ZeroTermSignFlag = false;
                        } else {
                            x = a - b;
                        }
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("PredicateBool:parseArithExpression:x=" + x + " a.eval()=" + a + "- b=" + b);
                        }
                    } else {
                        if ((posBool >= 0) && (posBool < StrBool.length())) {
                            ExprEndPos = posBool;
                        } else {
                            ExprEndPos = StrBool.length();
                        }
                        if ((ExprStartPos > ExprEndPos)) {
                            ExprEndPos = StrBool.length();
                        }
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("PredicateBool:parseArithExpression:Return Value:x=" + x + " Expr=" + StrBool.substring(ExprStartPos, ExprEndPos));
                            log.warn("PredicateBool:parseArithExpression:Return Value:x=" + x + " Expr=" + StrBool.substring(ExprStartPos, ExprEndPos));
                        }
                        return x;
                    }
                }
            }

            Double parseTerm() {
                int TermStartPos = posBool;
                int TermEndPos = -1;
                if (posBool < 0) {
                    TermStartPos = 0;
                }
                Double x = parseFactor();
                if (MyLogLevel.level >= LogLevel.Info.level) {
                    log.info("PredicateBool:parseTerm:Initial:x=" + x);
                }
                for (;;) {
                    Double a = x;
                    if (eatBool('*')) { // multiplication
                        Double b = parseFactor();
                        x = a * b;
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("PredicateBool:parseTerm:*:a=" + a);
                            log.info("PredicateBool:parseTerm:*:b=" + b);
                            log.info("PredicateBool:parseTerm:*:x=" + x + " a=" + a + "* b=" + b);
                        }
                        int temp = chBool;
                        nextStrCharBool();
                        if (((chBool == '+') || (chBool == '-')) && (temp != '*') && (temp != '/')) {
                            posBool--;
                            chBool = temp;
                            return x;
                        } else if ((chBool != -1) && (chBool != 0)) {
                            posBool--;
                            chBool = temp;
                        }
                    } else if (eatBool('/')) { // division
                        Double b = parseFactor();
                        x = a / b;
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("PredicateBool:parseTerm:/:a.eval=" + a);
                            log.info("PredicateBool:parseTerm:/:b.eval=" + b);
                            log.info("PredicateBool:parseTerm:/:x.eval=" + x + " a=" + a + "/ b=" + b);
                        }
                        int temp = chBool;
                        nextStrCharBool();
                        if (((chBool == '+') || (chBool == '-')) && (temp != '*') && (temp != '/')) {
                            posBool--;
                            chBool = temp;
                            return x;
                        } else if ((chBool != -1) && (chBool != 0)) {
                            posBool--;
                            chBool = temp;
                        }
                    } else if (eatBool('%')) { // Modulus Operator
                        Double b = parseFactor();
                        x = a % b;
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("PredicateBool:parseTerm:%:a=" + a);
                            log.info("PredicateBool:parseTerm:%:b=" + b);
                            log.info("PredicateBool:parseTerm:%:x=" + x + " a=" + a + "% b=" + b);
                        }
                        int temp = chBool;
                        nextStrCharBool();
                        if (((chBool == '+') || (chBool == '-')) && (temp != '*') && (temp != '/')) {
                            posBool--;
                            chBool = temp;
                            return x;
                        } else if ((chBool != -1) && (chBool != 0)) {
                            posBool--;
                            chBool = temp;
                        }
                    } else {
                        if ((posBool >= 0) && (posBool < StrBool.length())) {
                            TermEndPos = posBool;
                        } else {
                            TermEndPos = StrBool.length();
                        }
                        if ((TermStartPos > TermEndPos)) {
                            TermEndPos = StrBool.length();
                        }
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("PredicateBool:parseTerm:Return Value:x=" + x + " Term=" + StrBool.substring(TermStartPos, TermEndPos));
                            log.warn("PredicateBool:parseTerm:Return Value:x=" + x + " Term=" + StrBool.substring(TermStartPos, TermEndPos));
                        }
                        return x;
                    }
                }
            }

            Double parseFactor() {
                int FactorStartPos = posBool;
                int FactorEndPos = -1;
                if (posBool < 0) {
                    FactorStartPos = 0;
                }
                Double x = parseBasePredicate();
                for (;;) {
                    if (eatBool('^')) { // exponentiation
                        Double a = x, b = parseBasePredicate();
                        x = Math.pow(a, b);
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("PredicateBool:parseFactor:x=" + x + " Math.pow(a=" + a + "^ b=" + b + ")");
                        }
                    } else {
                        if ((posBool >= 0) && (posBool < StrBool.length())) {
                            FactorEndPos = posBool;
                        } else {
                            FactorEndPos = StrBool.length();
                        }
                        if ((FactorStartPos > FactorEndPos)) {
                            FactorEndPos = StrBool.length();
                        }
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("PredicateBool:parseFactor:FactorStartPos=" + FactorStartPos + " FactorEndPos=" + FactorEndPos);
                            log.info("PredicateBool:parseFactor:Return Value:x=" + x + " Factor=" + StrBool.substring(FactorStartPos, FactorEndPos));
                            log.warn("PredicateBool:parseFactor:Return Value:x=" + x + " Factor=" + StrBool.substring(FactorStartPos, FactorEndPos));
                        }
                        return x;
                    }
                }
            }

            Double parseBasePredicate() {
                int startPos = posBool;
                chNextBool = StrBool.charAt(posBool);
                if (MyLogLevel.level >= LogLevel.Info.level) {
                    log.info("PredicateBool:parseBasePredicate:Initial:chBool=" + (char) chBool + " chNextBool=" + (char) chNextBool + " StrBool=" + StrBool.substring(startPos));
                }
                Double x;
                if (chBool == '(') { //parentheses
                    nextStrCharBool();
                    startPos = posBool;
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("PredicateBool:parseBasePredicate:(:chBool=" + (char) chBool + " chNextBool=" + (char) chNextBool);
                    }
                    if (chBool == '!') {
                        NegateGotFlag = true;
                    }
                    x = parseBasePredicate();
                    return x;
                }
                Double xx = 1.0;
                if (MyLogLevel.level >= LogLevel.Info.level) {
                    log.info("PredicateBool:parseBasePredicate:Number:chBool=" + (char) chBool + " chNexBoolt=" + (char) chNextBool + " xx=" + xx + " StrBool=" + StrBool.substring(startPos));
                }
                if (IsNumber(chBool)) { //numbers
                    while (IsNumber(chBool)) {
                        nextStrCharBool();
                        if ((chBool == 'E') || (chBool == 'e')) {
                            nextStrCharBool();
                            if ((chBool == '-') || (chBool == '+')) {
                                nextStrCharBool();
                            }
                        }
                    }

                    if ((StrBool != null) && (!StrBool.equalsIgnoreCase("")) && (!StrBool.equalsIgnoreCase("NaN"))) {
                        xx = Double.parseDouble(StrBool.substring(startPos, posBool));
                    }
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("PredicateBool:parseBasePredicate:Number:chBool=" + (char) chBool + " chNextBool=" + (char) chNextBool + " xx=" + xx);
                    }
                    return xx;
                }
                if (chBool == '=') {
                    //nextStrCharBool();
                }
                if ((chBool == ')') && (posBool == (StrBool.length() - 1))) {
                    chBool = -1;
                    posBool++;
                } else if (chBool == ')') {
                    nextStrCharBool();
                }
                Double xx2 = 1.0;
                startPos = posBool;
                if (IsVariable(chBool)) {//functions & variables
                    while ((IsVariable(chBool)) || (IsNumber(chBool))) {
                        nextStrCharBool();
                    }
                    String name = StrBool.substring(startPos, posBool).trim();
                    if ((name != null) && (!name.equalsIgnoreCase("")) && (!name.equalsIgnoreCase("NaN")) && (variables.get(name) != null)) {
                        xx2 = variables.get(name);
                    }
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("PredicateBool:parseBasePredicate:Variable:chBool=" + (char) chBool + " chNextBool=" + (char) chNextBool + " xx2=" + xx2 + " name=" + name);
                    }
                    if (chBool == '=') {
                        //nextStrCharBool();
                    }
                    if ((chBool == ')') && (posBool == (StrBool.length() - 1))) {
                        chBool = -1;
                        posBool++;
                    } else if (chBool == ')') {
                        nextStrCharBool();
                    }
                    return xx2;
                } else if ((IsLogicalOperator(chBool)) && (IsLogicalOperator(chNextBool))) {
                    nextStrCharBool();
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("PredicateBool:parseBasePredicate:IsLogicalOperator:chBool=" + (char) chBool + " chNextBool=" + (char) chNextBool + " xx=" + xx + " StrBool=" + StrBool.substring(startPos));
                    }
                    xx = parseBasePredicate();
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("PredicateBool:parseBasePredicate:IsLogicalOperator:chBool=" + (char) chBool + " chNextBool=" + (char) chNextBool + " xx=" + xx + " StrBool=" + StrBool.substring(startPos));
                    }
                    return xx;
                } else if ((IsLogicalOperator(chBool))) {
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("PredicateBool:parseBasePredicate:IsLogicalOperator:chBool=" + (char) chBool + " chNextBool=" + (char) chNextBool + " xx=" + xx + " StrBool=" + StrBool.substring(startPos));
                    }
                    nextStrCharBool();
                    posBool--;
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("PredicateBool:parseBasePredicate:IsLogicalOperator:chBool=" + (char) chBool + " chNextBool=" + (char) chNextBool + " xx=" + xx + " StrBool=" + StrBool.substring(startPos));
                    }
                    xx = parseBasePredicate();
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("PredicateBool:parseBasePredicate:IsLogicalOperator:chBool=" + (char) chBool + " chNextBool=" + (char) chNextBool + " xx=" + xx + " StrBool=" + StrBool.substring(startPos));
                    }
                    return xx;
                } else if ((IsOperator(chBool)) && ((IsNumber(chNextBool)) || (IsVariable(chNextBool)))) {
                    PredicateArithOper = chBool;
                    PredicateArithOperNext = chNextBool;
                    nextStrCharBool();
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("PredicateBool:parseBasePredicate:IsLogicalOperator:chBool=" + (char) chBool + " chNextBool=" + (char) chNextBool + " xx=" + xx + " StrBool=" + StrBool.substring(startPos));
                    }
                    xx = parseBasePredicate();
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("PredicateBool:parseBasePredicate:IsLogicalOperator:chBool=" + (char) chBool + " chNext=" + (char) chNextBool + " xx=" + xx + " StrBool=" + StrBool.substring(startPos));
                    }
                    return xx;
                } else {
                    if ((str != null) && (startPos < StrBool.length()) && (startPos < posBool) && (chBool != -1) && (chBool != 0)) {
                        throw new RuntimeException("PredicateBool:parseBasePredicate:Unexpected: " + (char) chBool + " int=" + (int) chBool + " Cannot Format:" + StrBool.substring(posBool, StrBool.length()));
                    } else if (chBool != -1) {
                        throw new RuntimeException("PredicateBool:parseBasePredicate:Unexpected: " + (char) chBool + " int=" + (int) chBool + " Cannot Format:" + StrBool.substring(posBool, StrBool.length()));
                    }
                    return xx;
                }
            }
        }.parsePredicate();
    }

//Created by Rajesh Pai
// Implements Predicates(Conditions) for F(x) Expressions

    @FunctionalInterface

    public interface HghLvlPredicate {

        String evalPredicate();
    }

    public static HghLvlPredicate parsePredicateHghLvl(String str, Map<String, Double> variables) {
        StrHghLvl = str;
        posHghLvl = -1;
        chHghLvl = 0;
        chNextHghLvl = 0;
        return new Object() {

            void nextStrChar() {
                ++posHghLvl;
                chHghLvl = (posHghLvl < StrHghLvl.length()) ? StrHghLvl.charAt(posHghLvl) : -1;
                if (posHghLvl < (StrHghLvl.length() - 1)) {
                    chNextHghLvl = StrHghLvl.charAt(posHghLvl + 1);
                } else {
                    chNextHghLvl = -1;
                }
            }

            void prevStrChar() {
                --posHghLvl;
                chHghLvl = (posHghLvl < StrHghLvl.length()) ? StrHghLvl.charAt(posHghLvl) : -1;
                if (posHghLvl < (StrHghLvl.length() - 1)) {
                    chNextHghLvl = StrHghLvl.charAt(posHghLvl + 1);
                } else {
                    chNextHghLvl = -1;
                }
            }

            boolean eatStrChar(int CharToEat, int CharToEatNxt) {
                while (chHghLvl == ' ') {
                    nextStrChar();
                }
                if ((chNextHghLvl != '\0') && (chHghLvl == CharToEat) && (chNextHghLvl == CharToEatNxt)) {
                    nextStrChar();
                    return true;
                } else if ((chNextHghLvl == '\0') && (chHghLvl == CharToEat)) {
                    nextStrChar();
                    return true;
                }
                return false;
            }

            String eatStrAll(String Temp, int CharToEat) {
                String MyTempString = "";
                if (Temp.equalsIgnoreCase("")) {
                    Temp = StrHghLvl;
                }
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

            HghLvlPredicate parsePredicate() {
                nextStrChar();
                HghLvlPredicate x = parseExpression();
//                if ((pos != -1)&&(str != null)&&(!str.equalsIgnoreCase(""))&&(str.substring(pos, str.length()).equalsIgnoreCase(""))&&(pos <= str.length())) {
//                    throw new RuntimeException("Expression:parse:Unexpected: " + (char) ch + " int=" + (int) ch + " pos=" + pos + " str=" + str.substring(pos, str.length()));
//                }
                return x;
            }
            //Grammar:
            //expression = term | expression '+' term |expression '-' term
            //term = factor | term '*' factor | term '/' factor
            //factor = base | base ^ base
            //base = '-' base | '+' base | number | identifier |function expression | '(' expression ')'
            //

            HghLvlPredicate parseExpression() {
                HghLvlPredicate x = parseFactorPredicate();
                for (;;) {
                    //log.warn("Predicate:Expression:Top:Inside Loop: parseExpression:ParenthesisFlag=" + ParenthesisFlag + " NormalNotPareFlag=" + NormalNotPareFlag + " ch=" + (char) ch);
                    if (chHghLvl == ')') {
                        nextStrChar();
                        //log.info("Predicate:parseExpression:):Return Value:x.eval()=" + x.eval());
                        //return x;
                    } else if (chHghLvl == '(') {
                        //nextStrChar();
                        //log.info("Predicate:parseExpression:):(:NegateGotFlag=" + NegateGotFlag);
                        chHghLvl = chNextHghLvl;
                    } else if ((chHghLvl == '&') && (chNextHghLvl == '&')) {// Logical AND

                        HghLvlPredicate a = x, b = parseFactorPredicate();
                        //x = (() -> (a.evalPredicate() &&  b.evalPredicate()));
                        if ((a.evalPredicate().equalsIgnoreCase("true")) && (b.evalPredicate().equalsIgnoreCase("true"))) {
                            x = (() -> "true");
                        } else {
                            x = (() -> "false");
                        }
                        //log.info("Predicate:parseExpression:AND:a.eval()=" + a.eval());
                        //log.info("Predicate:parseExpression:AND:b.eval()=" + b.eval());
                        //log.info("Predicate:parseExpression:AND:x.eval()=" + x.eval());
                    } else if ((chHghLvl == '|') && (chNextHghLvl == '|')) { // Logical OR

                        HghLvlPredicate a = x, b = parseFactorPredicate();
                        //x = (() -> (a.evalPredicate() || b.evalPredicate()));
                        if ((a.evalPredicate().equalsIgnoreCase("true")) || (b.evalPredicate().equalsIgnoreCase("true"))) {
                            x = (() -> "true");
                        } else {
                            x = (() -> "false");
                        }
                        //log.info("Predicate:parseExpression:OR:a.eval()=" + a.eval());
                        //log.info("Predicate:parseExpression:OR:b.eval()=" + b.eval());
                        //log.info("Predicate:parseExpression:OR:x.eval()=" + x.eval());
                    } else {
                        //log.info("Predicate:parseExpression:Return Value:x.eval()=" + x.eval());
                        return x;
                    }
                }
            }

            HghLvlPredicate parseFactorPredicate() {
                HghLvlPredicate x = parseTermPredicate();
                //log.info("Predicate:parseFactorPredicate:Initial Value:x.eval()=" + x.eval() + " NegateGotFlag=" + NegateGotFlag);
                if ((chHghLvl == '!') || (NegateGotFlag == true)) { // exponentiation
                    final String Temp = x.evalPredicate();
                    //x = (() -> (!Temp));
                    if (Temp.equalsIgnoreCase("true")) {
                        x = (() -> "false");
                    } else {
                        x = (() -> "true");
                    }
                }
                //log.info("Predicate:parseFactorPredicate:Return Value:x.eval()=" + x.eval() + " NegateGotFlag=" + NegateGotFlag);
                return x;
            }

            HghLvlPredicate parseTermPredicate() {
                Double x = parseBasePredicate();
                HghLvlPredicate y = (() -> "");
                boolean TempInit = true;
                for (;;) {
                    if (chHghLvl == ')') {
                        //log.info("Predicate:parseTerm:):Initial Value:y.eval()=" + y.eval() + " NegateGotFlag=" + NegateGotFlag);
                        if (NegateGotFlag == true) {
                            final String Temp = y.evalPredicate();
                            //y = (() -> !Temp);
                            if (Temp.equalsIgnoreCase("true")) {
                                y = (() -> "false");
                            } else {
                                y = (() -> "true");
                            }
                        }
                        NegateGotFlag = false;
                        //log.info("Predicate:parseTerm:):Return Value:y.eval()=" + y.eval() + " NegateGotFlag=" + NegateGotFlag);
                        return y;
                    } else if (chHghLvl == '(') {
                        //nextStrChar();
                        //log.info("Predicate:parseTerm:(:y.eval()=" + y.eval());
                    } else if ((chHghLvl == '<') && (chNextHghLvl == '=')) { // GreaterThanOREqualTo
                        nextStrChar();
                        Double a = x;
                        Double b = parseBasePredicate();
                        final String Temp = y.evalPredicate();
                        if (TempInit == false) {
                            //y = (() -> Temp && (a <= b));
                            if ((Temp.equalsIgnoreCase("true")) && (a.doubleValue() <= b.doubleValue())) {
                                y = (() -> "true");
                            } else {
                                y = (() -> "false");
                            }
                        } else {
                            //y = (() -> (a <= b));
                            if (a.doubleValue() <= b.doubleValue()) {
                                y = (() -> "true");
                            } else {
                                y = (() -> "false");
                            }
                        }
                        TempInit = false;
                        x = b;
                        //log.info("Predicate:parseTerm:<=:a=" + a);
                        //log.info("Predicate:parseTerm:<=:b=" + b);
                        //log.info("Predicate:parseTerm:<=:y.eval()=" + y.eval());
                    } else if ((chHghLvl == '<') && (chNextHghLvl != '=')) { // GreaterThan
                        chHghLvl = chNextHghLvl;
                        posHghLvl++;
                        Double a = x;
                        Double b = parseBasePredicate();
                        final String Temp = y.evalPredicate();
                        if (TempInit == false) {
                            //y = (() -> Temp && (a < b));
                            if ((Temp.equalsIgnoreCase("true")) && (a.doubleValue() < b.doubleValue())) {
                                y = (() -> "true");
                            } else {
                                y = (() -> "false");
                            }
                        } else {
                            //y = (() -> (a < b));
                            if (a.doubleValue() < b.doubleValue()) {
                                y = (() -> "true");
                            } else {
                                y = (() -> "false");
                            }
                        }
                        TempInit = false;
                        x = b;
                        //log.info("Predicate:parseTerm:<:a=" + a);
                        //log.info("Predicate:parseTerm:<:b=" + b);
                        //log.info("Predicate:parseTerm:<:y.eval()=" + y.eval());
                    } else if ((chHghLvl == '>') && (chNextHghLvl == '=')) { // LessThan
                        nextStrChar();
                        Double a = x;
                        Double b = parseBasePredicate();
                        final String Temp = y.evalPredicate();
                        if (TempInit == false) {
                            //y = (() -> Temp && (a >= b));
                            if ((Temp.equalsIgnoreCase("true")) && (a.doubleValue() >= b.doubleValue())) {
                                y = (() -> "true");
                            } else {
                                y = (() -> "false");
                            }
                        } else {
                            //y = (() -> (a >= b));
                            if (a.doubleValue() >= b.doubleValue()) {
                                y = (() -> "true");
                            } else {
                                y = (() -> "false");
                            }
                        }
                        TempInit = false;
                        x = b;
                        //log.info("Predicate:parseTerm:>=:a=" + a);
                        //log.info("Predicate:parseTerm:>=:b=" + b);
                        //log.info("Predicate:parseTerm:>=:y.eval()=" + y.eval());
                    } else if ((chHghLvl == '>') && (chNextHghLvl != '=')) { // LessThanOREqualTo
                        chHghLvl = chNextHghLvl;
                        posHghLvl++;
                        Double a = x;
                        Double b = parseBasePredicate();
                        final String Temp = y.evalPredicate();
                        if (TempInit == false) {
                            //y = (() -> Temp && (a > b));
                            if ((Temp.equalsIgnoreCase("true")) && (a.doubleValue() > b.doubleValue())) {
                                y = (() -> "true");
                            } else {
                                y = (() -> "false");
                            }
                        } else {
                            if (a.doubleValue() > b.doubleValue()) {
                                y = (() -> "true");
                            } else {
                                y = (() -> "false");
                            }
                            //y = (() -> (a > b));
                        }
                        TempInit = false;
                        x = b;
                        //log.info("Predicate:parseTerm:>:a=" + a);
                        //log.info("Predicate:parseTerm:>:b=" + b);
                        //log.info("Predicate:parseTerm:>:y.eval()=" + y.eval());
                    } else if ((chHghLvl == '=')) { // EqualTo
                        Double a = x;
                        Double b = parseBasePredicate();
                        final String Temp = y.evalPredicate();
                        if (TempInit == false) {
                            //y = (() -> Temp && (a == b));
                            if ((Temp.equalsIgnoreCase("true")) && (a.doubleValue() == b.doubleValue())) {
                                y = (() -> "true");
                            } else {
                                y = (() -> "false");
                            }

                        } else {
                            //y = (() -> (a == b));
                            if (a.doubleValue() == b.doubleValue()) {
                                y = (() -> "true");
                            } else {
                                y = (() -> "false");
                            }
                        }
                        TempInit = false;
                        x = b;
                        //log.info("Predicate:parseTerm:==:a=" + a);
                        //log.info("Predicate:parseTerm:==:b=" + b);
                        //log.info("Predicate:parseTerm:==:y.eval()=" + y.eval());
                    } else {
                        //log.info("Predicate:parseTerm:Return Value:y.eval()=" + y.eval());
                        return y;
                    }
                }
            }

            Double parseBasePredicate() {
                int startPos = posHghLvl;
                Double x;
                if (chHghLvl == '(') { //parentheses
                    nextStrChar();
                    startPos = posHghLvl;
                    //log.info("Predicate:parseBasePredicate:(:ch=" + (char) ch + " chNext=" + (char) chNext);
                    if (chHghLvl == '!') {
                        NegateGotFlag = true;
                    }
                    x = parseBasePredicate();
                    return x;
                }
                Double xx = 1.0;
                if (IsNumber(chHghLvl)) { //numbers
                    while (IsNumber(chHghLvl)) {
                        nextStrChar();
                    }

                    if ((str != null) && (!str.equalsIgnoreCase("")) && (!str.equalsIgnoreCase("NaN"))) {
                        xx = Double.parseDouble(str.substring(startPos, posHghLvl));
                    }
                    //log.info("Predicate:parseBasePredicate:Number:ch=" + (char) ch + " chNext=" + (char) chNext + " xx=" + xx);
                    return xx;
                }
                if (chHghLvl == '=') {
                    //nextStrChar();
                }
                if ((chHghLvl == ')') && (posHghLvl == (str.length() - 1))) {
                    chHghLvl = -1;
                    posHghLvl++;
                } else if (chHghLvl == ')') {
                    nextStrChar();
                }
                Double xx2 = 1.0;
                startPos = posHghLvl;
                if (IsVariable(chHghLvl)) {//functions & variables
                    while (IsVariable(chHghLvl)) {
                        nextStrChar();
                    }
                    String name = str.substring(startPos, posHghLvl).trim();
                    if ((name != null) && (!name.equalsIgnoreCase("")) && (!name.equalsIgnoreCase("NaN")) && (variables.get(name) != null)) {
                        xx2 = variables.get(name);
                    }
                    //log.info("Predicate:parseBasePredicate:Variable:ch=" + (char) ch + " chNext=" + (char) chNext + " xx2=" + xx2 + " name=" + name);
                    if (chHghLvl == '=') {
                        //nextStrChar();
                    }
                    if ((chHghLvl == ')') && (posHghLvl == (str.length() - 1))) {
                        chHghLvl = -1;
                        posHghLvl++;
                    } else if (chHghLvl == ')') {
                        nextStrChar();
                    }
                    return xx2;
                } else if ((IsLogicalOperator(chHghLvl)) && (IsLogicalOperator(chNextHghLvl))) {
                    nextStrChar();
                    nextStrChar();
                    xx = parseBasePredicate();
                    return xx;
                } else if ((IsLogicalOperator(chHghLvl))) {
                    nextStrChar();
                    xx = parseBasePredicate();
                    return xx;
                } else {
                    if ((startPos < str.length()) && (startPos < posHghLvl)) {
                        throw new RuntimeException("Predicate:parseBasePredicate:Unexpected: " + (char) chHghLvl + " int=" + (int) chHghLvl + " Cannot Format:" + str.substring(posHghLvl, str.length()));
                    } else if (chHghLvl != -1) {
                        throw new RuntimeException("Predicate:parseBasePredicate:Unexpected: " + (char) chHghLvl + " int=" + (int) chHghLvl + " Cannot Format:" + str.substring(posHghLvl, str.length()));
                    }
                    return xx;
                }
            }
        }.parsePredicate();
    }
}
