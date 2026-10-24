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

import java.awt.Dimension;
import java.awt.Toolkit;
import static java.lang.Math.sqrt;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.apache.log4j.Logger;

/**
 *
 * @author Rajesh V Pai
 */
public class TernaryLogic {

    public static Logger log = Logger.getLogger(TernaryLogic.class.getName());

    public static enum LogLevel {
        All(7), Debug(6), Info(5), Warn(4), Error(3), Fatal(2), Off(1);
        public int level = 0;

        LogLevel(int level1) {
            this.level = level1;
        }
    }
    //Predicate Variables
    private static int PredicateArithOper = -1;
    private static int PredicateArithOperNext = -1;
    private static boolean NegateGotFlag = false;
    private static boolean ZeroTermSignFlag = false;
    
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
    public static boolean IsNumber(int Mych) {
        return ((((Mych >= '0') && (Mych <= '9')) || (Mych == '.')));
    }
    public static boolean IsVariable(int Mych) {
        return (((Mych >= 'a') && (Mych <= 'z')) || ((Mych >= 'A') && (Mych <= 'Z')));
    }
    public static boolean IsLogicalOperator(int Mych) {
        return (((Mych == '>') || (Mych == '<') || (Mych == '=') || (Mych == '&') || (Mych == '|') || (Mych == '!')));
    }
    public static boolean IsOperator(int Mych) {
        return (((Mych == '+') || (Mych == '-') || (Mych == '*') || (Mych == '/') || (Mych == '^')));
    }
    //Created by Rajesh Pai
// Implements Predicates(Conditions) for F(x) Expressions
    @FunctionalInterface
    public interface Predicate3VLMixed {

        String eval();
    }
 public static Predicate3VLMixed parsePredicate3VLMixed(String str, Map<String, Double> variables, String Silent, LogLevel MyLogLevel) {

        return new Object() {
            int posBool3VLMixed = -1, chBool3VLMixed;
            int chNextBool3VLMixed;
            String StrBool3VLMixed;

            void nextStrCharBool3VL() {
                ++posBool3VLMixed;
                chBool3VLMixed = (posBool3VLMixed < StrBool3VLMixed.length()) ? StrBool3VLMixed.charAt(posBool3VLMixed) : -1;
                if (posBool3VLMixed < (StrBool3VLMixed.length() - 1)) {
                    chNextBool3VLMixed = StrBool3VLMixed.charAt(posBool3VLMixed + 1);
                } else {
                    chNextBool3VLMixed = -1;
                }
            }

            void prevStrCharBool3VL() {
                --posBool3VLMixed;
                chBool3VLMixed = (posBool3VLMixed < StrBool3VLMixed.length()) ? StrBool3VLMixed.charAt(posBool3VLMixed) : -1;
                if (posBool3VLMixed < (StrBool3VLMixed.length())) {
                    chNextBool3VLMixed = StrBool3VLMixed.charAt(posBool3VLMixed + 1);
                } else {
                    chNextBool3VLMixed = -1;
                }
            }

            boolean eatBool3VL(int CharToEat) {
                while (chBool3VLMixed == ' ') {
                    nextStrCharBool3VL();
                }
                if (chBool3VLMixed == CharToEat) {
                    nextStrCharBool3VL();
                    return true;
                }
                return false;
            }

            String eatStrAll(String Temp, int CharToEat) {
                String MyTempString = "";
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

            Predicate3VLMixed parse3VLMixed() {
                if ((str == null) || (str.equalsIgnoreCase(""))) {
                    Predicate3VLMixed x = (() -> str);
                    return x;
                }
                StrBool3VLMixed = eatStrAll(str, ' ');
                posBool3VLMixed = -1;
                chBool3VLMixed = 0;
                chNextBool3VLMixed = 0;
                PredicateArithOper = -1;
                nextStrCharBool3VL();
                Predicate3VLMixed x = parseExpression();
                return x;
            }
            //Grammar:
            //expression = term | expression '+' term |expression '-' term
            //term = factor | term '*' factor | term '/' factor
            //factor = base | base ^ base
            //base = '-' base | '+' base | number | identifier |function expression | '(' expression ')'
            //

            Predicate3VLMixed parseExpression() {
                Predicate3VLMixed x = parseFactorPredicate();
                for (;;) {
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("Predicate3VLMixed:Expression:Top:Inside Loop: parseExpression:chBool3VLMixed=" + (char) chBool3VLMixed);
                    }
                    if (chBool3VLMixed == ')') {
                        nextStrCharBool3VL();
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VLMixed:parseExpression:):Return Value:x.eval()=" + x.eval());
                        }
                        //return x;
                    } else if (chBool3VLMixed == '(') {
                        //nextStrChar();
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VLMixed:parseExpression:):(:NegateGotFlag=" + NegateGotFlag);
                        }
                        chBool3VLMixed = chNextBool3VLMixed;
                    } else if ((chBool3VLMixed == '&') && (chNextBool3VLMixed == '&')) {// Logical AND

                        Predicate3VLMixed a = x, b = parseFactorPredicate();
                        if ((a.eval().equalsIgnoreCase("true")) && (b.eval().equalsIgnoreCase("true"))) {
                            x = (() -> "true");
                        } else if ((a.eval().equalsIgnoreCase("true")) && (b.eval().equalsIgnoreCase("false"))) {
                            x = (() -> "false");
                        } else if ((a.eval().equalsIgnoreCase("false")) && (b.eval().equalsIgnoreCase("false"))) {
                            x = (() -> "false");
                        } else if ((a.eval().equalsIgnoreCase("false")) && (b.eval().equalsIgnoreCase("true"))) {
                            x = (() -> "false");
                        } else if ((a.eval().equalsIgnoreCase("Unknown")) && (b.eval().equalsIgnoreCase("true"))) {
                            x = (() -> "false");
                        } else if ((a.eval().equalsIgnoreCase("Unknown")) && (b.eval().equalsIgnoreCase("false"))) {
                            x = (() -> "Unknown");
                        } else if ((a.eval().equalsIgnoreCase("Unknown")) && (b.eval().equalsIgnoreCase("Unknown"))) {
                            x = (() -> "Unknown");
                        }
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VLMixed:parseExpression:AND:a.eval()=" + a.eval());
                            log.info("Predicate3VLMixed:parseExpression:AND:b.eval()=" + b.eval());
                            log.info("Predicate3VLMixed:parseExpression:AND:x.eval()=" + x.eval());
                        }

                    } else if ((chBool3VLMixed == '|') && (chNextBool3VLMixed == '|')) { // Logical OR

                        Predicate3VLMixed a = x, b = parseFactorPredicate();
                        if ((a.eval().equalsIgnoreCase("true")) && (b.eval().equalsIgnoreCase("true"))) {
                            x = (() -> "true");
                        } else if ((a.eval().equalsIgnoreCase("true")) && (b.eval().equalsIgnoreCase("false"))) {
                            x = (() -> "true");
                        } else if ((a.eval().equalsIgnoreCase("false")) && (b.eval().equalsIgnoreCase("false"))) {
                            x = (() -> "false");
                        } else if ((a.eval().equalsIgnoreCase("false")) && (b.eval().equalsIgnoreCase("true"))) {
                            x = (() -> "true");
                        } else if ((a.eval().equalsIgnoreCase("Unknown")) && (b.eval().equalsIgnoreCase("true"))) {
                            x = (() -> "true");
                        } else if ((a.eval().equalsIgnoreCase("Unknown")) && (b.eval().equalsIgnoreCase("false"))) {
                            x = (() -> "false");
                        } else if ((a.eval().equalsIgnoreCase("Unknown")) && (b.eval().equalsIgnoreCase("Unknown"))) {
                            x = (() -> "Unknown");
                        }
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VLMixed:parseExpression:OR:a.eval()=" + a.eval());
                            log.info("Predicate3VLMixed:parseExpression:OR:b.eval()=" + b.eval());
                            log.info("Predicate3VLMixed:parseExpression:OR:x.eval()=" + x.eval());
                        }
                    } else {
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VLMixed:parseExpression:Return Value:x.eval()=" + x.eval());
                        }
                        return x;
                    }
                }
            }

            Predicate3VLMixed parseFactorPredicate() {
                String Data = parseStrTriStateHighExpr();
                Predicate3VLMixed x = (() -> "");
                if (Data.equalsIgnoreCase("true")) {
                    x = (() -> "true");
                } else if (Data.equalsIgnoreCase("false")) {
                    x = (() -> "false");
                } else if (Data.equalsIgnoreCase("Unknown")) {
                    x = (() -> "Unknown");
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.error("Predicate3VLMixed:parseFactorPredicate:GOT Unknown String Value:Data=" + Data + " NegateGotFlag=" + NegateGotFlag);
                    }
                } else {
                    x = (() -> "Error");
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.error("Predicate3VLMixed:parseFactorPredicate:GOT ERROR String Value:Data=" + Data + " NegateGotFlag=" + NegateGotFlag);
                        log.error("Predicate3VLMixed:parseFactorPredicate:GOT ERROR Value:x.eval()=" + x.eval() + " NegateGotFlag=" + NegateGotFlag);
                    }
                }
                if (MyLogLevel.level >= LogLevel.Info.level) {
                    log.info("Predicate3VLMixed:parseFactorPredicate:Initial String Value:Data=" + Data + " NegateGotFlag=" + NegateGotFlag + " chBool3VLMixed=" + (char) chBool3VLMixed);
                    log.info("Predicate3VLMixed:parseFactorPredicate:Initial Value:x.eval()=" + x.eval() + " NegateGotFlag=" + NegateGotFlag);
                }
                if ((chBool3VLMixed == '!') || (NegateGotFlag == true)) { // exponentiation
                    final String Temp = x.eval();
                    String y = "" + x.eval();
                    if (y.equalsIgnoreCase("true")) {
                        x = (() -> "false");
                    } else if (y.equalsIgnoreCase("false")) {
                        x = (() -> "true");
                    } else if (y.equalsIgnoreCase("Unknown")) {
                        x = (() -> "Unknown");
                    } else {
                        y = "ERROR";
                        x = (() -> "Error");
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.error("Predicate3VLMixed:parseStrTriStateHighExpr::ERROR String Value:y=" + y + " NegateGotFlag=" + NegateGotFlag);
                            log.error("Predicate3VLMixed:parseStrTriStateHighExpr::ERROR Value:x.eval()=" + x.eval() + " NegateGotFlag=" + NegateGotFlag);
                        }
                    }
                }
                if (MyLogLevel.level >= LogLevel.Info.level) {
                    log.info("Predicate3VLMixed:parseFactorPredicate:Return Value:x.eval()=" + x.eval() + " NegateGotFlag=" + NegateGotFlag);
                }
                return x;
            }

            String parseStrTriStateHighExpr() {
                String x = "Unknown";
                boolean TriStateFlag = false;
                if (chBool3VLMixed == '#') {
                    nextStrCharBool3VL();
                    TriStateFlag = true;
                }
                Predicate3VLMixed y = parseTermPredicate();
                if (TriStateFlag == true) {
                    x = y.eval();
                } else {
                    x = "" + y.eval();
                    if (x.equalsIgnoreCase("true"))
                    ; else if (x.equalsIgnoreCase("false"))
                    ; else if (x.equalsIgnoreCase("Unknown"))
                    ; else {
                        x = "ERROR";
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.error("Predicate3VLMixed:parseStrTriStateHighExpr::ERROR Value:y.eval()=" + y.eval() + " NegateGotFlag=" + NegateGotFlag);
                            log.error("Predicate3VLMixed:parseStrTriStateHighExpr::ERROR String Value:x=" + x + " NegateGotFlag=" + NegateGotFlag);
                        }
                    }
                }
                if (MyLogLevel.level >= LogLevel.Info.level) {
                    log.info("Predicate3VLMixed:parseStrTriStateHighExpr::Return Value:y.eval()=" + y.eval() + " NegateGotFlag=" + NegateGotFlag);
                    log.info("Predicate3VLMixed:parseStrTriStateHighExpr::Return String Value:x=" + x + " NegateGotFlag=" + NegateGotFlag);
                }
                return x;
            }

            Predicate3VLMixed parseTermPredicate() {
                String DataInit = parseStrTriStateLowExpr();
                Double x = Double.parseDouble(DataInit);
                Predicate3VLMixed y = (() -> "Unknown");
                boolean TempInit = true;
                if (MyLogLevel.level >= LogLevel.Info.level) {
                    log.info("Predicate3VLMixed:parseTerm:Initial Value:y.eval()=" + y.eval() + " posBool3VLMixed=" + posBool3VLMixed + " StrBool3VLMixed.length=" + StrBool3VLMixed.length() + " chBool3VLMixed=" + (char) chBool3VLMixed + " x=" + x + " chNextBool3VLMixed=" + (char) chNextBool3VLMixed);
                    log.info("Predicate3VLMixed:parseTerm:Initial Value:DataInit=" + DataInit);
                }
                for (;;) {
                    if (chBool3VLMixed == ')') {
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VLMixed:parseTerm:):Initial Value:y.eval()=" + y.eval() + " NegateGotFlag=" + NegateGotFlag);
                        }
                        if (NegateGotFlag == true) {
                            final String Temp = y.eval();
                            if (Temp.equalsIgnoreCase("true")) {
                                y = (() -> "false");
                            } else if (Temp.equalsIgnoreCase("false")) {
                                y = (() -> "true");
                            } else if (Temp.equalsIgnoreCase("Unknown")) {
                                y = (() -> "Unknown");
                            } else if (Temp.equalsIgnoreCase("")) {
                                y = (() -> "Error");
                            }
                        }
                        NegateGotFlag = false;
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VLMixed:parseTerm:):Return Value:y.eval()=" + y.eval() + " NegateGotFlag=" + NegateGotFlag);
                        }
                        return y;
                    } else if (chBool3VLMixed == '(') {
                        //nextStrCharBool3VL();
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VLMixed:parseTerm:(:y.eval()=" + y.eval());
                        }
                    } else if ((chBool3VLMixed == '<') && (chNextBool3VLMixed == '=')) { // GreaterThanOREqualTo
                        nextStrCharBool3VL();
                        Double a = x;
                        String Data = parseStrTriStateLowExpr();
                        Double b = Double.parseDouble(Data);
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VLMixed:parseTerm:<=:y.eval()=" + y.eval());
                        }
                        final String Temp = y.eval();
                        if (TempInit == false) {
                            if (Temp.equalsIgnoreCase("true") && (a.doubleValue() <= b.doubleValue())) {
                                y = (() -> "true");
                            } else if (Temp.equalsIgnoreCase("false") && (a.doubleValue() <= b.doubleValue())) {
                                y = (() -> "false");
                            } else if (Temp.equalsIgnoreCase("true") && (!(a.doubleValue() <= b.doubleValue()))) {
                                y = (() -> "false");
                            } else if (Temp.equalsIgnoreCase("Unknown") && (!(a.doubleValue() <= b.doubleValue()))) {
                                y = (() -> "Unknown");
                            } else if (Temp.equalsIgnoreCase("Unknown") && ((a.doubleValue() <= b.doubleValue()))) {
                                y = (() -> "Unknown");
                            } else if (Temp.equalsIgnoreCase("")) {
                                y = (() -> "Error");
                            }
                            if (MyLogLevel.level >= LogLevel.Info.level) {
                                log.info("Predicate3VLMixed:parseTerm:<=:y.eval()=" + y.eval());
                            }
                        } else {
                            if ((a.doubleValue() <= b.doubleValue())) {
                                y = (() -> "true");
                            } else if (a.doubleValue() > b.doubleValue()) {
                                y = (() -> "false");
                            } else {
                                y = (() -> "Unknown");
                            }
                            if (MyLogLevel.level >= LogLevel.Info.level) {
                                log.info("Predicate3VLMixed:parseTerm:<=:y.eval()=" + y.eval());
                            }
                        }
                        TempInit = false;
                        x = b;
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VLMixed:parseTerm:<=:a=" + a);
                            log.info("Predicate3VLMixed:parseTerm:<=:Data=" + Data);
                            log.info("Predicate3VLMixed:parseTerm:<=:b=" + b);
                            log.info("Predicate3VLMixed:parseTerm:<=:y.eval()=" + y.eval());
                        }
                    } else if ((chBool3VLMixed == '<') && (chNextBool3VLMixed != '=')) { // GreaterThan
                        final String MyTemp = PlainLessThanMixed(x, TempInit);
                        y = (() -> MyTemp);
                        TempInit = false;
                    } else if ((chBool3VLMixed == '>') && (chNextBool3VLMixed == '=')) { // LessThan
                        nextStrCharBool3VL();
                        Double a = x;
                        String Data = parseStrTriStateLowExpr();
                        Double b = Double.parseDouble(Data);
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VLMixed:parseTerm:>=:y.eval()=" + y.eval());
                        }
                        final String Temp = y.eval();
                        if (TempInit == false) {
                            if (Temp.equalsIgnoreCase("true") && (a.doubleValue() >= b.doubleValue())) {
                                y = (() -> "true");
                            } else if (Temp.equalsIgnoreCase("false") && (a.doubleValue() >= b.doubleValue())) {
                                y = (() -> "false");
                            } else if (Temp.equalsIgnoreCase("true") && (!(a.doubleValue() >= b.doubleValue()))) {
                                y = (() -> "false");
                            } else if (Temp.equalsIgnoreCase("Unknown") && (!(a.doubleValue() >= b.doubleValue()))) {
                                y = (() -> "Unknown");
                            } else if (Temp.equalsIgnoreCase("Unknown") && ((a.doubleValue() >= b.doubleValue()))) {
                                y = (() -> "Unknown");
                            } else if (Temp.equalsIgnoreCase("")) {
                                y = (() -> "Error");
                            }
                            if (MyLogLevel.level >= LogLevel.Info.level) {
                                log.info("Predicate3VLMixed:parseTerm:>=:y.eval()=" + y.eval());
                            }
                        } else {
                            if ((a.doubleValue() >= b.doubleValue())) {
                                y = (() -> "true");
                            } else if (a.doubleValue() < b.doubleValue()) {
                                y = (() -> "false");
                            } else {
                                y = (() -> "Unknown");
                            }
                            if (MyLogLevel.level >= LogLevel.Info.level) {
                                log.info("Predicate3VLMixed:parseTerm:>=:y.eval()=" + y.eval());
                            }
                        }
                        TempInit = false;
                        x = b;
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VLMixed:parseTerm:>=:a=" + a);
                            log.info("Predicate3VLMixed:parseTerm:>=:Data=" + Data);
                            log.info("Predicate3VLMixed:parseTerm:>=:b=" + b);
                            log.info("Predicate3VLMixed:parseTerm:>=:y.eval()=" + y.eval());
                        }
                    } else if ((chBool3VLMixed == '>') && (chNextBool3VLMixed != '=')) { // LessThanOREqualTo
                        final String MyTemp = PlainGreaterThanMixed(x, TempInit);
                        y = (() -> MyTemp);
                        TempInit = false;
                    } else if ((chBool3VLMixed == '=') && (chNextBool3VLMixed == '=')) { // EqualTo
                        Double a = x;
                        String Data = parseStrTriStateLowExpr();
                        Double b = Double.parseDouble(Data);
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VLMixed:parseTerm:==:y.eval()=" + y.eval() + " x=" + x + " a=" + a + " b=" + b + " Data=" + Data);
                        }
                        final String Temp = y.eval();
                        if (TempInit == false) {
                            if (Temp.equalsIgnoreCase("true") && (a.doubleValue() == b.doubleValue())) {
                                y = (() -> "true");
                                if (MyLogLevel.level >= LogLevel.Info.level) {
                                    log.info("Predicate3VLMixed:parseTerm:==:y.eval()=" + y.eval() + " x=" + x + " a=" + a + " b=" + b + " Data=" + Data);
                                }
                            } else if (Temp.equalsIgnoreCase("false") && (a.doubleValue() == b.doubleValue())) {
                                y = (() -> "false");
                                if (MyLogLevel.level >= LogLevel.Info.level) {
                                    log.info("Predicate3VLMixed:parseTerm:==:y.eval()=" + y.eval() + " x=" + x + " a=" + a + " b=" + b + " Data=" + Data);
                                }
                            } else if (Temp.equalsIgnoreCase("true") && (!(a.doubleValue() == b.doubleValue()))) {
                                y = (() -> "false");
                                if (MyLogLevel.level >= LogLevel.Info.level) {
                                    log.info("Predicate3VLMixed:parseTerm:==:y.eval()=" + y.eval() + " x=" + x + " a=" + a + " b=" + b + " Data=" + Data);
                                }
                            } else if (Temp.equalsIgnoreCase("Unknown") && (!(a.doubleValue() == b.doubleValue()))) {
                                y = (() -> "Unknown");
                                if (MyLogLevel.level >= LogLevel.Info.level) {
                                    log.info("Predicate3VLMixed:parseTerm:==:y.eval()=" + y.eval() + " x=" + x + " a=" + a + " b=" + b + " Data=" + Data);
                                }
                            } else if (Temp.equalsIgnoreCase("Unknown") && ((a.doubleValue() == b.doubleValue()))) {
                                y = (() -> "Unknown");
                                if (MyLogLevel.level >= LogLevel.Info.level) {
                                    log.info("Predicate3VLMixed:parseTerm:==:y.eval()=" + y.eval() + " x=" + x + " a=" + a + " b=" + b + " Data=" + Data);
                                }
                            } else if (Temp.equalsIgnoreCase("")) {
                                y = (() -> "Error");
                                if (MyLogLevel.level >= LogLevel.Info.level) {
                                    log.info("Predicate3VLMixed:parseTerm:==:y.eval()=" + y.eval() + " x=" + x + " a=" + a + " b=" + b + " Data=" + Data);
                                }
                            }
                            if (MyLogLevel.level >= LogLevel.Info.level) {
                                log.info("Predicate3VLMixed:parseTerm:=:y.eval()=" + y.eval());
                            }
                        } else {
                            if ((a.doubleValue() == b.doubleValue())) {
                                y = (() -> "true");
                                if (MyLogLevel.level >= LogLevel.Info.level) {
                                    log.info("Predicate3VLMixed:parseTerm:==:y.eval()=" + y.eval() + " x=" + x + " a=" + a + " b=" + b + " Data=" + Data);
                                }
                            } else if (a.doubleValue() != b.doubleValue()) {
                                y = (() -> "false");
                                if (MyLogLevel.level >= LogLevel.Info.level) {
                                    log.info("Predicate3VLMixed:parseTerm:==:y.eval()=" + y.eval() + " x=" + x + " a=" + a + " b=" + b + " Data=" + Data);
                                }
                            } else {
                                y = (() -> "Unknown");
                                if (MyLogLevel.level >= LogLevel.Info.level) {
                                    log.info("Predicate3VLMixed:parseTerm:==:y.eval()=" + y.eval() + " x=" + x + " a=" + a + " b=" + b + " Data=" + Data);
                                }
                            }
                            if (MyLogLevel.level >= LogLevel.Info.level) {
                                log.info("Predicate3VLMixed:parseTerm:=:y.eval()=" + y.eval());
                            }
                        }
                        TempInit = false;
                        x = b;
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VLMixed:parseTerm:==:a=" + a);
                            log.info("Predicate3VLMixed:parseTerm:==:Data=" + Data);
                            log.info("Predicate3VLMixed:parseTerm:==:b=" + b);
                            log.info("Predicate3VLMixed:parseTerm:==:y.eval()=" + y.eval());
                        }
                    } else if ((chBool3VLMixed == '!') && (chNextBool3VLMixed == '=')) { // Not EqualTo
                        Double a = x;
                        String Data = parseStrTriStateLowExpr();
                        Double b = Double.parseDouble(Data);
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VLMixed:parseTerm:!=:y.eval()=" + y.eval());
                        }
                        final String Temp = y.eval();
                        if (TempInit == false) {
                            if (Temp.equalsIgnoreCase("true") && (a.doubleValue() != b.doubleValue())) {
                                y = (() -> "true");
                                if (MyLogLevel.level >= LogLevel.Info.level) {
                                    log.info("Predicate3VLMixed:parseTerm:==:y.eval()=" + y.eval() + " x=" + x + " a=" + a + " b=" + b + " Data=" + Data);
                                }
                            } else if (Temp.equalsIgnoreCase("false") && (a.doubleValue() != b.doubleValue())) {
                                y = (() -> "false");
                                if (MyLogLevel.level >= LogLevel.Info.level) {
                                    log.info("Predicate3VLMixed:parseTerm:==:y.eval()=" + y.eval() + " x=" + x + " a=" + a + " b=" + b + " Data=" + Data);
                                }
                            } else if (Temp.equalsIgnoreCase("true") && (!(a.doubleValue() != b.doubleValue()))) {
                                y = (() -> "false");
                                if (MyLogLevel.level >= LogLevel.Info.level) {
                                    log.info("Predicate3VLMixed:parseTerm:==:y.eval()=" + y.eval() + " x=" + x + " a=" + a + " b=" + b + " Data=" + Data);
                                }
                            } else if (Temp.equalsIgnoreCase("Unknown") && (!(a.doubleValue() != b.doubleValue()))) {
                                y = (() -> "Unknown");
                                if (MyLogLevel.level >= LogLevel.Info.level) {
                                    log.info("Predicate3VLMixed:parseTerm:==:y.eval()=" + y.eval() + " x=" + x + " a=" + a + " b=" + b + " Data=" + Data);
                                }
                            } else if (Temp.equalsIgnoreCase("Unknown") && ((a.doubleValue() != b.doubleValue()))) {
                                y = (() -> "Unknown");
                                if (MyLogLevel.level >= LogLevel.Info.level) {
                                    log.info("Predicate3VLMixed:parseTerm:==:y.eval()=" + y.eval() + " x=" + x + " a=" + a + " b=" + b + " Data=" + Data);
                                }
                            } else if (Temp.equalsIgnoreCase("")) {
                                y = (() -> "Error");
                                if (MyLogLevel.level >= LogLevel.Info.level) {
                                    log.info("Predicate3VLMixed:parseTerm:==:y.eval()=" + y.eval() + " x=" + x + " a=" + a + " b=" + b + " Data=" + Data);
                                }
                            }
                            if (MyLogLevel.level >= LogLevel.Info.level) {
                                log.info("Predicate3VLMixed:parseTerm:!=:y.eval()=" + y.eval());
                            }
                        } else {
                            if ((a.doubleValue() != b.doubleValue())) {
                                y = (() -> "true");
                                if (MyLogLevel.level >= LogLevel.Info.level) {
                                    log.info("Predicate3VLMixed:parseTerm:==:y.eval()=" + y.eval() + " x=" + x + " a=" + a + " b=" + b + " Data=" + Data);
                                }
                            } else if (a.doubleValue() == b.doubleValue()) {
                                y = (() -> "false");
                                if (MyLogLevel.level >= LogLevel.Info.level) {
                                    log.info("Predicate3VLMixed:parseTerm:==:y.eval()=" + y.eval() + " x=" + x + " a=" + a + " b=" + b + " Data=" + Data);
                                }
                            } else {
                                y = (() -> "Unknown");
                                if (MyLogLevel.level >= LogLevel.Info.level) {
                                    log.info("Predicate3VLMixed:parseTerm:==:y.eval()=" + y.eval() + " x=" + x + " a=" + a + " b=" + b + " Data=" + Data);
                                }
                            }
                            if (MyLogLevel.level >= LogLevel.Info.level) {
                                log.info("Predicate3VLMixed:parseTerm:!=:y.eval()=" + y.eval());
                            }
                        }
                        TempInit = false;
                        x = b;
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VLMixed:parseTerm:!=:a=" + a);
                            log.info("Predicate3VLMixed:parseTerm:!=:Data=" + Data);
                            log.info("Predicate3VLMixed:parseTerm:!=:b=" + b);
                            log.info("Predicate3VLMixed:parseTerm:!=:y.eval()=" + y.eval());
                        }
                    } else {
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VLMixed:parseTerm:Return Value:y.eval()=" + y.eval() + " chBool3VLMixed=" + (char) chBool3VLMixed + " x=" + x + " chNextBool3VLMixed=" + (char) chNextBool3VLMixed);
                        }
                        return y;
                    }
                }
            }

            String PlainLessThanMixed(Double x, boolean TempInit) {
                Predicate3VLMixed y = (() -> "Unknown");
                chBool3VLMixed = chNextBool3VLMixed;
                posBool3VLMixed++;
                Double a = x;
                String Data = parseStrTriStateLowExpr();
                Double b = Double.parseDouble(Data);
                if (MyLogLevel.level >= LogLevel.Info.level) {
                    log.info("Predicate3VLMixed:PlainLessThanMixed:<:y.eval()=" + y.eval());
                }
                final String Temp = y.eval();
                if (TempInit == false) {
                    if (Temp.equalsIgnoreCase("true") && (a.doubleValue() < b.doubleValue())) {
                        y = (() -> "true");
                    } else if (Temp.equalsIgnoreCase("false") && (a.doubleValue() < b.doubleValue())) {
                        y = (() -> "false");
                    } else if (Temp.equalsIgnoreCase("true") && (!(a.doubleValue() < b.doubleValue()))) {
                        y = (() -> "false");
                    } else if (Temp.equalsIgnoreCase("Unknown") && (!(a.doubleValue() < b.doubleValue()))) {
                        y = (() -> "Unknown");
                    } else if (Temp.equalsIgnoreCase("Unknown") && ((a.doubleValue() < b.doubleValue()))) {
                        y = (() -> "Unknown");
                    } else if (Temp.equalsIgnoreCase("")) {
                        y = (() -> "Error");
                    }
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("Predicate3VLMixed:PlainLessThanMixed:<:y.eval()=" + y.eval());
                    }
                } else {
                    if ((a.doubleValue() < b.doubleValue())) {
                        y = (() -> "true");
                    } else if (a.doubleValue() > b.doubleValue()) {
                        y = (() -> "false");
                    } else {
                        y = (() -> "Unknown");
                    }
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("Predicate3VLMixed:PlainLessThanMixed:<:y.eval()=" + y.eval());
                    }
                }
                TempInit = false;
                x = b;
                if (MyLogLevel.level >= LogLevel.Info.level) {
                    log.info("Predicate3VLMixed:PlainLessThanMixed:<:a=" + a);
                    log.info("Predicate3VLMixed:PlainLessThanMixed:<:Data=" + Data);
                    log.info("Predicate3VLMixed:PlainLessThanMixed:<:b=" + b);
                    log.info("Predicate3VLMixed:PlainLessThanMixed:<:y.eval()=" + y.eval());
                }
                return y.eval();
            }

            String PlainGreaterThanMixed(Double x, boolean TempInit) {
                Predicate3VLMixed y = (() -> "Unknown");
                chBool3VLMixed = chNextBool3VLMixed;
                posBool3VLMixed++;
                Double a = x;
                String Data = parseStrTriStateLowExpr();
                Double b = Double.parseDouble(Data);
                if (MyLogLevel.level >= LogLevel.Info.level) {
                    log.info("Predicate3VLMixed:PlainGreaterThanMixed:>:y.eval()=" + y.eval());
                }
                final String Temp = y.eval();
                if (TempInit == false) {
                    if (Temp.equalsIgnoreCase("true") && (a.doubleValue() >= b.doubleValue())) {
                        y = (() -> "true");
                    } else if (Temp.equalsIgnoreCase("false") && (a.doubleValue() > b.doubleValue())) {
                        y = (() -> "false");
                    } else if (Temp.equalsIgnoreCase("true") && (!(a.doubleValue() > b.doubleValue()))) {
                        y = (() -> "false");
                    } else if (Temp.equalsIgnoreCase("Unknown") && (!(a.doubleValue() > b.doubleValue()))) {
                        y = (() -> "Unknown");
                    } else if (Temp.equalsIgnoreCase("Unknown") && ((a.doubleValue() > b.doubleValue()))) {
                        y = (() -> "Unknown");
                    } else if (Temp.equalsIgnoreCase("")) {
                        y = (() -> "Error");
                    }
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("Predicate3VLMixed:PlainGreaterThanMixed:>:y.eval()=" + y.eval());
                    }
                } else {
                    if ((a.doubleValue() > b.doubleValue())) {
                        y = (() -> "true");
                    } else if (a.doubleValue() < b.doubleValue()) {
                        y = (() -> "false");
                    } else {
                        y = (() -> "Unknown");
                    }
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("Predicate3VLMixed:PlainGreaterThanMixed:>:y.eval()=" + y.eval());
                    }
                }
                TempInit = false;
                x = b;
                if (MyLogLevel.level >= LogLevel.Info.level) {
                    log.info("Predicate3VLMixed:PlainGreaterThanMixed:>:a=" + a);
                    log.info("Predicate3VLMixed:PlainGreaterThanMixed:>:Data=" + Data);
                    log.info("Predicate3VLMixed:PlainGreaterThanMixed:>:b=" + b);
                    log.info("Predicate3VLMixed:PlainGreaterThanMixed:>:y.eval()=" + y.eval());
                }
                return y.eval();
            }

            String parseStrTriStateLowExpr() {
                String x = "Unknown";
                x = "" + parseArithExpression();
                if (MyLogLevel.level >= LogLevel.Info.level) {
                    log.info("Predicate3VLMixed:parseStrTriStateLowExpr:Initial:x=" + x + " chBool3VLMixed=" + (char) chBool3VLMixed + " chNextBool3VLMixed=" + (char) chNextBool3VLMixed);
                }
                return x;
            }

            Double parseArithExpression() {
                Double x = 0.0;
                int ExprStartPos = posBool3VLMixed;
                int ExprEndPos = -1;
                if (posBool3VLMixed < 0) {
                    ExprStartPos = 0;
                }
                x = parseTerm();
                if (MyLogLevel.level >= LogLevel.Info.level) {
                    log.info("Predicate3VLMixed:parseArithExpression:Initial:x=" + x);
                }
                for (;;) {
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("Predicate3VLMixed:parseArithExpression:Top:Inside Loop: parseExpression:chBool3VLMixed=" + (char) chBool3VLMixed + " posBool3VLMixed=" + posBool3VLMixed);
                    }
                    if (eatBool3VL(')')) {
                        return x;
                    } else if ((eatBool3VL('+'))) {// addition
                        Double a = x, b = parseTerm();
                        if (ZeroTermSignFlag == true) {
                            x = -1.0 * a + b;
                            ZeroTermSignFlag = false;
                        } else {
                            x = a + b;
                        }
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VLMixed:parseArithExpression:x=" + x + " a=" + a + "+ b=" + b);
                        }
                    } else if ((eatBool3VL('-'))) { // subtraction
                        Double a = x, b = parseTerm();
                        if (ZeroTermSignFlag == true) {
                            x = -1.0 * a - b;
                            ZeroTermSignFlag = false;
                        } else {
                            x = a - b;
                        }
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VLMixed:parseArithExpression:x=" + x + " a.eval()=" + a + "- b=" + b);
                        }
                    } else {
                        if ((posBool3VLMixed >= 0) && (posBool3VLMixed < StrBool3VLMixed.length())) {
                            ExprEndPos = posBool3VLMixed;
                        } else {
                            ExprEndPos = StrBool3VLMixed.length();
                        }
                        if ((ExprStartPos > ExprEndPos)) {
                            ExprEndPos = StrBool3VLMixed.length();
                        }
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VLMixed:parseArithExpression:Return Value:x=" + x + " Expr=" + StrBool3VLMixed.substring(ExprStartPos, ExprEndPos));
                            log.warn("Predicate3VLMixed:parseArithExpression:Return Value:x=" + x + " Expr=" + StrBool3VLMixed.substring(ExprStartPos, ExprEndPos));
                        }
                        return x;
                    }
                }
            }

            Double parseTerm() {
                int TermStartPos = posBool3VLMixed;
                int TermEndPos = -1;
                if (posBool3VLMixed < 0) {
                    TermStartPos = 0;
                }
                Double x = parseFactor();
                if (MyLogLevel.level >= LogLevel.Info.level) {
                    log.info("Predicate3VLMixed:parseTerm:Initial:x=" + x + " chBool3VLMixed=" + (char) chBool3VLMixed + " chNextBool3VLMixed=" + (char) chNextBool3VLMixed);
                }
                for (;;) {
                    Double a = x;
                    if (eatBool3VL('*')) { // multiplication
                        Double b = parseFactor();
                        x = a * b;
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VLMixed:parseTerm:*:a=" + a + " chBool3VLMixed=" + (char) chBool3VLMixed + " chNextBool3VLMixed=" + (char) chNextBool3VLMixed);
                            log.info("Predicate3VLMixed:parseTerm:*:b=" + b);
                            log.info("Predicate3VLMixed:parseTerm:*:x=" + x + " a=" + a + "* b=" + b);
                        }
                    } else if (eatBool3VL('/')) { // division
                        Double b = parseFactor();
                        x = a / b;
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VLMixed:parseTerm:/:a.eval=" + a + " chBool3VLMixed=" + (char) chBool3VLMixed + " chNextBool3VLMixed=" + (char) chNextBool3VLMixed);
                            log.info("Predicate3VLMixed:parseTerm:/:b.eval=" + b);
                            log.info("Predicate3VLMixed:parseTerm:/:x.eval=" + x + " a=" + a + "/ b=" + b);
                        }
                    } else if (eatBool3VL('%')) { // Modulus
                        Double b = parseFactor();
                        x = a % b;
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VLMixed:parseTerm:%:a=" + a + " chBool3VLMixed=" + (char) chBool3VLMixed + " chNextBool3VLMixed=" + (char) chNextBool3VLMixed);
                            log.info("Predicate3VLMixed:parseTerm:%:b=" + b);
                            log.info("Predicate3VLMixed:parseTerm:%:x=" + x + " a=" + a + "% b=" + b);
                        }
                    } else {
                        if ((posBool3VLMixed >= 0) && (posBool3VLMixed < StrBool3VLMixed.length())) {
                            TermEndPos = posBool3VLMixed;
                        } else {
                            TermEndPos = StrBool3VLMixed.length();
                        }
                        if ((TermStartPos > TermEndPos)) {
                            TermEndPos = StrBool3VLMixed.length();
                        }
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VLMixed:parseTerm:Return Value:x=" + x + " Term=" + StrBool3VLMixed.substring(TermStartPos, TermEndPos) + " chBool3VLMixed=" + (char) chBool3VLMixed + " chNextBool3VLMixed=" + (char) chNextBool3VLMixed);
                            log.warn("Predicate3VLMixed:parseTerm:Return Value:x=" + x + " Term=" + StrBool3VLMixed.substring(TermStartPos, TermEndPos));
                        }
                        return x;
                    }
                }
            }

            Double parseFactor() {
                int FactorStartPos = posBool3VLMixed;
                int FactorEndPos = -1;
                if (posBool3VLMixed < 0) {
                    FactorStartPos = 0;
                }
                Double x = parseBasePredicate();
                if (MyLogLevel.level >= LogLevel.Info.level) {
                    log.info("Predicate3VLMixed:parseFactor:x=" + x + " chBool3VLMixed=" + (char) chBool3VLMixed + " chNextBool3VLMixed=" + (char) chNextBool3VLMixed);
                }
                for (;;) {
                    if (eatBool3VL('^')) { // exponentiation
                        Double a = x, b = parseBasePredicate();
                        x = Math.pow(a.doubleValue(), b.doubleValue());
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VLMixed:parseFactor:x=" + x + " Math.pow(a=" + a + "^ b=" + b + ")" + " chBool3VLMixed=" + (char) chBool3VLMixed + " chNextBool3VLMixed=" + (char) chNextBool3VLMixed);
                        }
                    } else {
                        if ((posBool3VLMixed >= 0) && (posBool3VLMixed < StrBool3VLMixed.length())) {
                            FactorEndPos = posBool3VLMixed;
                        } else {
                            FactorEndPos = StrBool3VLMixed.length();
                        }
                        if ((FactorStartPos > FactorEndPos)) {
                            FactorEndPos = StrBool3VLMixed.length();
                        }
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VLMixed:parseFactor:FactorStartPos=" + FactorStartPos + " FactorEndPos=" + FactorEndPos + " chBool3VLMixed=" + (char) chBool3VLMixed + " chNextBool3VLMixed=" + (char) chNextBool3VLMixed);
                            log.info("Predicate3VLMixed:parseFactor:Return Value:x=" + x + " Factor=" + StrBool3VLMixed.substring(FactorStartPos, FactorEndPos));
                            log.warn("Predicate3VLMixed:parseFactor:Return Value:x=" + x + " Factor=" + StrBool3VLMixed.substring(FactorStartPos, FactorEndPos));
                        }
                        return x;
                    }
                }
            }

            Double parseBasePredicate() {
                int startPos = posBool3VLMixed;
                chNextBool3VLMixed = StrBool3VLMixed.charAt(posBool3VLMixed);
                if (MyLogLevel.level >= LogLevel.Info.level) {
                    log.info("Predicate3VLMixed:parseBasePredicate:Initial:chBool3VLMixed=" + (char) chBool3VLMixed + " chNextBool3VLMixed=" + (char) chNextBool3VLMixed + " StrBool3VLMixed=" + StrBool3VLMixed.substring(startPos));
                }
                Double x;
                if (chBool3VLMixed == '(') { //parentheses
                    nextStrCharBool3VL();
                    startPos = posBool3VLMixed;
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("Predicate3VLMixed:parseBasePredicate:(:chBool3VLMixed=" + (char) chBool3VLMixed + " chNextBool3VLMixed=" + (char) chNextBool3VLMixed);
                    }
                    if (chBool3VLMixed == '!') {
                        NegateGotFlag = true;
                    }
                    x = parseBasePredicate();
                    return x;
                }
                Double xx = 1.0;
                if (MyLogLevel.level >= LogLevel.Info.level) {
                    log.info("Predicate3VLMixed:parseBasePredicate:Number:chBool3VLMixed=" + (char) chBool3VLMixed + " chNextBool3VLMixed=" + (char) chNextBool3VLMixed + " xx=" + xx + " StrBool3VLMixed=" + StrBool3VLMixed.substring(startPos));
                }
                if (IsNumber(chBool3VLMixed)) { //numbers
                    while (IsNumber(chBool3VLMixed)) {
                        nextStrCharBool3VL();
                        if ((chBool3VLMixed == 'E') || (chBool3VLMixed == 'e')) {
                            nextStrCharBool3VL();
                            if ((chBool3VLMixed == '-') || (chBool3VLMixed == '+')) {
                                nextStrCharBool3VL();
                            }
                        }
                    }

                    if ((StrBool3VLMixed != null) && (!StrBool3VLMixed.equalsIgnoreCase("")) && (!StrBool3VLMixed.equalsIgnoreCase("NaN"))) {
                        xx = Double.parseDouble(StrBool3VLMixed.substring(startPos, posBool3VLMixed));
                    }
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("Predicate3VLMixed:parseBasePredicate:Number:chBool3VLMixed=" + (char) chBool3VLMixed + " chNextBool3VLMixed=" + (char) chNextBool3VLMixed + " xx=" + xx);
                    }
                    return xx;
                }
                if (chBool3VLMixed == '=') {
                    //nextStrCharBool3VL();
                }
                if ((chBool3VLMixed == ')') && (posBool3VLMixed == (StrBool3VLMixed.length() - 1))) {
                    chBool3VLMixed = -1;
                    posBool3VLMixed++;
                } else if (chBool3VLMixed == ')') {
                    //nextStrCharBool3VL();
                }
                Double xx2 = 1.0;
                startPos = posBool3VLMixed;
                if (IsVariable(chBool3VLMixed)) {//functions & variables
                    while ((IsVariable(chBool3VLMixed)) || (IsNumber(chBool3VLMixed))) {
                        nextStrCharBool3VL();
                    }
                    String name = StrBool3VLMixed.substring(startPos, posBool3VLMixed).trim();
                    if ((name != null) && (!name.equalsIgnoreCase("")) && (!name.equalsIgnoreCase("NaN")) && (variables.get(name) != null)) {
                        xx2 = variables.get(name);
                    }
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("Predicate3VLMixed:parseBasePredicate:Variable:chBool3VLMixed=" + (char) chBool3VLMixed + " chNextBool3VLMixed=" + (char) chNextBool3VLMixed + " xx2=" + xx2 + " name=" + name);
                    }
                    if (chBool3VLMixed == '=') {
                        //nextStrCharBool3VL();
                    }
                    if ((chBool3VLMixed == ')') && (posBool3VLMixed == (StrBool3VLMixed.length() - 1))) {
                        chBool3VLMixed = -1;
                        posBool3VLMixed++;
                    } else if (chBool3VLMixed == ')') {
                        //nextStrCharBool3VL();
                    }
                    return xx2;
                } else if ((IsLogicalOperator(chBool3VLMixed)) && (IsLogicalOperator(chNextBool3VLMixed))) {
                    nextStrCharBool3VL();
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("Predicate3VLMixed:parseBasePredicate:IsLogicalOperator:chBool3VLMixed=" + (char) chBool3VLMixed + " chNextBool3VLMixed=" + (char) chNextBool3VLMixed + " xx=" + xx + " StrBool3VLMixed=" + StrBool3VLMixed.substring(startPos));
                    }
                    xx = parseBasePredicate();
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("Predicate3VLMixed:parseBasePredicate:IsLogicalOperator:chBool3VLMixed=" + (char) chBool3VLMixed + " chNextBool3VLMixed=" + (char) chNextBool3VLMixed + " xx=" + xx + " StrBool3VLMixed=" + StrBool3VLMixed.substring(startPos));
                    }
                    return xx;
                } else if ((IsLogicalOperator(chBool3VLMixed))) {
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("Predicate3VLMixed:parseBasePredicate:IsLogicalOperator:chBool3VLMixed=" + (char) chBool3VLMixed + " chNextBool3VLMixed=" + (char) chNextBool3VLMixed + " xx=" + xx + " StrBool3VLMixed=" + StrBool3VLMixed.substring(startPos));
                    }
                    nextStrCharBool3VL();
                    posBool3VLMixed--;
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("Predicate3VLMixed:parseBasePredicate:IsLogicalOperator:chBool3VLMixed=" + (char) chBool3VLMixed + " chNextBool3VLMixed=" + (char) chNextBool3VLMixed + " xx=" + xx + " StrBool3VLMixed=" + StrBool3VLMixed.substring(startPos));
                    }
                    xx = parseBasePredicate();
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("Predicate3VLMixed:parseBasePredicate:IsLogicalOperator:chBool3VLMixed=" + (char) chBool3VLMixed + " chNextBool3VLMixed=" + (char) chNextBool3VLMixed + " xx=" + xx + " StrBool3VLMixed=" + StrBool3VLMixed.substring(startPos));
                    }
                    return xx;
                } else if ((IsOperator(chBool3VLMixed)) && ((IsNumber(chNextBool3VLMixed)) || (IsVariable(chNextBool3VLMixed)))) {
                    PredicateArithOper = chBool3VLMixed;
                    PredicateArithOperNext = chNextBool3VLMixed;
                    nextStrCharBool3VL();
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("Predicate3VLMixed:parseBasePredicate:IsLogicalOperator:chBool3VLMixed=" + (char) chBool3VLMixed + " chNextBool3VLMixed=" + (char) chNextBool3VLMixed + " xx=" + xx + " StrBool3VLMixed=" + StrBool3VLMixed.substring(startPos));
                    }
                    xx = parseBasePredicate();
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("Predicate3VLMixed:parseBasePredicate:IsLogicalOperator:chBool3VLMixed=" + (char) chBool3VLMixed + " chNextBool3VLMixed=" + (char) chNextBool3VLMixed + " xx=" + xx + " StrBool3VLMixed=" + StrBool3VLMixed.substring(startPos));
                    }
                    return xx;
                } else {
                    if ((startPos < StrBool3VLMixed.length()) && (startPos < posBool3VLMixed)) {
                        throw new RuntimeException("Predicate3VLMixed:parseBasePredicate:Unexpected: " + (char) chBool3VLMixed + " int=" + (int) chBool3VLMixed + " Cannot Format:" + StrBool3VLMixed.substring(posBool3VLMixed, StrBool3VLMixed.length()));
                    } else if (chBool3VLMixed != -1) {
                        throw new RuntimeException("Predicate3VLMixed:parseBasePredicate:Unexpected: " + (char) chBool3VLMixed + " int=" + (int) chBool3VLMixed + " Cannot Format:" + StrBool3VLMixed.substring(posBool3VLMixed, StrBool3VLMixed.length()));
                    }
                    return xx;
                }
            }
        }.parse3VLMixed();
    }
    //Created by Rajesh Pai
// Implements Predicates(Conditions) for F(x) Expressions

    @FunctionalInterface
    public interface Predicate3VL {

        String eval();
    }

    // Taken from stackoverflow.com:Evaluating a math 
    // expression given in string form [closed]
    //http://stackoverflow.com/questions/3422673/evaluating-a-math-expression-given-in-string-form
    public static Predicate3VL parsePredicate3VL(String str, Map<String, Double> variables, boolean EqualsIsUnknownFlag,String Silent, LogLevel MyLogLevel) {

        return new Object() {
            // Bool3VL Predicate character Index and Character Variable & String Variable   
            int posBool3VL = -1, chBool3VL;
            int chNextBool3VL;
            String StrBool3VL;

            void nextStrCharBool3VL() {
                ++posBool3VL;
                chBool3VL = (posBool3VL < StrBool3VL.length()) ? StrBool3VL.charAt(posBool3VL) : -1;
                if (posBool3VL < (StrBool3VL.length() - 1)) {
                    chNextBool3VL = StrBool3VL.charAt(posBool3VL + 1);
                } else {
                    chNextBool3VL = -1;
                }
            }

            void prevStrCharBool3VL() {
                --posBool3VL;
                chBool3VL = (posBool3VL < StrBool3VL.length()) ? StrBool3VL.charAt(posBool3VL) : -1;
                if (posBool3VL < (StrBool3VL.length())) {
                    chNextBool3VL = StrBool3VL.charAt(posBool3VL + 1);
                } else {
                    chNextBool3VL = -1;
                }
            }

            boolean eatBool3VL(int CharToEat) {
                while (chBool3VL == ' ') {
                    nextStrCharBool3VL();
                }
                if (chBool3VL == CharToEat) {
                    nextStrCharBool3VL();
                    return true;
                }
                return false;
            }

            String eatStrAll(String Temp, int CharToEat) {
                String MyTempString = "";
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

            Predicate3VL parse3VL() {
                if ((str == null) || (str.equalsIgnoreCase(""))) {
                    Predicate3VL x = (() -> str);
                    return x;
                }
                StrBool3VL = eatStrAll(str, ' ');
                posBool3VL = -1;
                chBool3VL = 0;
                chNextBool3VL = 0;
                PredicateArithOper = -1;
                nextStrCharBool3VL();
                Predicate3VL x = parseExpression();
                return x;
            }
            //Grammar:
            //expression = term | expression '+' term |expression '-' term
            //term = factor | term '*' factor | term '/' factor
            //factor = base | base ^ base
            //base = '-' base | '+' base | number | identifier |function expression | '(' expression ')'
            //

            Predicate3VL parseExpression() {
                Predicate3VL x = parseFactorPredicate();
                for (;;) {
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("Predicate3VL:Expression:Top:Inside Loop: parseExpression:chBool3VL=" + (char) chBool3VL);
                    }
                    if (chBool3VL == ')') {
                        nextStrCharBool3VL();
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VL:parseExpression:):Return Value:x.eval()=" + x.eval());
                        }
                        //return x;
                    } else if (chBool3VL == '(') {
                        //nextStrChar();
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VL:parseExpression:):(:NegateGotFlag=" + NegateGotFlag);
                        }
                        chBool3VL = chNextBool3VL;
                    } else if ((chBool3VL == '&') && (chNextBool3VL == '&')) {// Logical AND

                        Predicate3VL a = x, b = parseFactorPredicate();
                        if ((a.eval().equalsIgnoreCase("true")) && (b.eval().equalsIgnoreCase("true"))) {
                            x = (() -> "true");
                        } else if ((a.eval().equalsIgnoreCase("true")) && (b.eval().equalsIgnoreCase("false"))) {
                            x = (() -> "false");
                        } else if ((a.eval().equalsIgnoreCase("true")) && (b.eval().equalsIgnoreCase("Unknown"))) {
                            //To be Thoroughly Tested
                            x = (() -> "false");
                        }else if ((a.eval().equalsIgnoreCase("false")) && (b.eval().equalsIgnoreCase("false"))) {
                            x = (() -> "false");
                        } else if ((a.eval().equalsIgnoreCase("false")) && (b.eval().equalsIgnoreCase("true"))) {
                            x = (() -> "false");
                        } //Below To be Thoroughly Tested
                        else if ((a.eval().equalsIgnoreCase("false")) && (b.eval().equalsIgnoreCase("Unknown"))) {
                             x = (() -> "Unknown");
                        } else if ((a.eval().equalsIgnoreCase("Unknown")) && (b.eval().equalsIgnoreCase("true"))) {
                            x = (() -> "false");
                        } else if ((a.eval().equalsIgnoreCase("Unknown")) && (b.eval().equalsIgnoreCase("false"))) {
                            x = (() -> "Unknown");
                        } else if ((a.eval().equalsIgnoreCase("Unknown")) && (b.eval().equalsIgnoreCase("Unknown"))) {
                            x = (() -> "Unknown");
                        }
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VL:parseExpression:AND:a.eval()=" + a.eval());
                            log.info("Predicate3VL:parseExpression:AND:b.eval()=" + b.eval());
                            log.info("Predicate3VL:parseExpression:AND:x.eval()=" + x.eval());
                        }

                    } else if ((chBool3VL == '|') && (chNextBool3VL == '|')) { // Logical OR

                        Predicate3VL a = x, b = parseFactorPredicate();
                        if ((a.eval().equalsIgnoreCase("true")) && (b.eval().equalsIgnoreCase("true"))) {
                            x = (() -> "true");
                        } else if ((a.eval().equalsIgnoreCase("true")) && (b.eval().equalsIgnoreCase("false"))) {
                            x = (() -> "true");
                        } else if ((a.eval().equalsIgnoreCase("true")) && (b.eval().equalsIgnoreCase("Unknown"))) {
                            //To be Thoroughly Tested
                            x = (() -> "false");
                        } else if ((a.eval().equalsIgnoreCase("false")) && (b.eval().equalsIgnoreCase("false"))) {
                            x = (() -> "false");
                        }  else if ((a.eval().equalsIgnoreCase("false")) && (b.eval().equalsIgnoreCase("true"))) {
                            x = (() -> "true");
                        }  //Below:To be Thoroughly Tested
                        else if ((a.eval().equalsIgnoreCase("false")) && (b.eval().equalsIgnoreCase("Unknown"))) {
                            x = (() -> "Unknown");
                        } else if ((a.eval().equalsIgnoreCase("Unknown")) && (b.eval().equalsIgnoreCase("true"))) {
                            x = (() -> "true");
                        } else if ((a.eval().equalsIgnoreCase("Unknown")) && (b.eval().equalsIgnoreCase("false"))) {
                            x = (() -> "false");
                        } else if ((a.eval().equalsIgnoreCase("Unknown")) && (b.eval().equalsIgnoreCase("Unknown"))) {
                            x = (() -> "Unknown");
                        }
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VL:parseExpression:OR:a.eval()=" + a.eval());
                            log.info("Predicate3VL:parseExpression:OR:b.eval()=" + b.eval());
                            log.info("Predicate3VL:parseExpression:OR:x.eval()=" + x.eval());
                        }
                    } else {
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VL:parseExpression:Return Value:x.eval()=" + x.eval());
                        }
                        return x;
                    }
                }
            }

            Predicate3VL parseFactorPredicate() {
                String Data = parseStrTriStateHighExpr();
                Predicate3VL x = (() -> "");
                if (Data.equalsIgnoreCase("true")) {
                    x = (() -> "true");
                } else if (Data.equalsIgnoreCase("false")) {
                    x = (() -> "false");
                } else if (Data.equalsIgnoreCase("Unknown")) {
                    x = (() -> "Unknown");
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.error("Predicate3VL:parseFactorPredicate:GOT Unknown String Value:Data=" + Data + " NegateGotFlag=" + NegateGotFlag);
                    }
                } else {
                    x = (() -> "Error");
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.error("Predicate3VL:parseFactorPredicate:GOT ERROR String Value:Data=" + Data + " NegateGotFlag=" + NegateGotFlag);
                        log.error("Predicate3VL:parseFactorPredicate:GOT ERROR Value:x.eval()=" + x.eval() + " NegateGotFlag=" + NegateGotFlag);
                    }
                }
                if (MyLogLevel.level >= LogLevel.Info.level) {
                    log.info("Predicate3VL:parseFactorPredicate:Initial String Value:Data=" + Data + " NegateGotFlag=" + NegateGotFlag + " chBool3VL=" + (char) chBool3VL);
                    log.info("Predicate3VL:parseFactorPredicate:Initial Value:x.eval()=" + x.eval() + " NegateGotFlag=" + NegateGotFlag);
                }
                if ((chBool3VL == '!') || (NegateGotFlag == true)) { // exponentiation
                    final String Temp = x.eval();
                    String y = "" + x.eval();
                    if (y.equalsIgnoreCase("true")) {
                        x = (() -> "false");
                    } else if (y.equalsIgnoreCase("false")) {
                        x = (() -> "true");
                    } else if (y.equalsIgnoreCase("Unknown")) {
                        x = (() -> "Unknown");
                    } else {
                        y = "ERROR";
                        x = (() -> "Error");
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.error("Predicate3VL:parseStrTriStateHighExpr::ERROR String Value:y=" + y + " NegateGotFlag=" + NegateGotFlag);
                            log.error("Predicate3VL:parseStrTriStateHighExpr::ERROR Value:x.eval()=" + x.eval() + " NegateGotFlag=" + NegateGotFlag);
                        }
                    }
                }
                if (MyLogLevel.level >= LogLevel.Info.level) {
                    log.info("Predicate3VL:parseFactorPredicate:Return Value:x.eval()=" + x.eval() + " NegateGotFlag=" + NegateGotFlag);
                }
                return x;
            }

            String parseStrTriStateHighExpr() {
                String x = "Unknown";
                boolean TriStateFlag = false;
                if (chBool3VL == '#') {
                    nextStrCharBool3VL();
                    TriStateFlag = true;
                }
                Predicate3VL y = parseTermPredicate();
                if (TriStateFlag == true) {
                    x = y.eval();
                } else {
                    x = "" + y.eval();
                    if (x.equalsIgnoreCase("true"))
                    ; else if (x.equalsIgnoreCase("false"))
                    ; else if (x.equalsIgnoreCase("Unknown"))
                    ; else {
                        x = "ERROR";
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.error("Predicate3VL:parseStrTriStateHighExpr::ERROR Value:y.eval()=" + y.eval() + " NegateGotFlag=" + NegateGotFlag);
                            log.error("Predicate3VL:parseStrTriStateHighExpr::ERROR String Value:x=" + x + " NegateGotFlag=" + NegateGotFlag);
                        }
                    }
                }
                if (MyLogLevel.level >= LogLevel.Info.level) {
                    log.info("Predicate3VL:parseStrTriStateHighExpr::Return Value:y.eval()=" + y.eval() + " NegateGotFlag=" + NegateGotFlag);
                    log.info("Predicate3VL:parseStrTriStateHighExpr::Return String Value:x=" + x + " NegateGotFlag=" + NegateGotFlag);
                }
                return x;
            }

            Predicate3VL parseTermPredicate() {
                String DataInit = parseStrTriStateLowExpr();
                Double x = Double.parseDouble(DataInit);
                Predicate3VL y = (() -> "Unknown");
                boolean TempInit = true;
                if (MyLogLevel.level >= LogLevel.Info.level) {
                    log.info("Predicate3VL:parseTerm:Initial Value:y.eval()=" + y.eval() + " posBool3VL=" + posBool3VL + " StrBool3VL.length=" + StrBool3VL.length() + " chBool3VL=" + (char) chBool3VL + " x=" + x + " chNextBool3VL=" + (char) chNextBool3VL);
                    log.info("Predicate3VL:parseTerm:Initial Value:DataInit=" + DataInit);
                }
                for (;;) {
                    if (chBool3VL == ')') {
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VL:parseTerm:):Initial Value:y.eval()=" + y.eval() + " NegateGotFlag=" + NegateGotFlag);
                        }
                        if (NegateGotFlag == true) {
                            final String Temp = y.eval();
                            if (Temp.equalsIgnoreCase("true")) {
                                y = (() -> "false");
                            } else if (Temp.equalsIgnoreCase("false")) {
                                y = (() -> "true");
                            } else if (Temp.equalsIgnoreCase("Unknown")) {
                                y = (() -> "Unknown");
                            } else if (Temp.equalsIgnoreCase("")) {
                                y = (() -> "Error");
                            }
                        }
                        NegateGotFlag = false;
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VL:parseTerm:):Return Value:y.eval()=" + y.eval() + " NegateGotFlag=" + NegateGotFlag);
                        }
                        return y;
                    } else if (chBool3VL == '(') {
                        //nextStrCharBool3VL();
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VL:parseTerm:(:y.eval()=" + y.eval());
                        }
                    } else if ((chBool3VL == '<') && (chNextBool3VL == '=')) { // GreaterThanOREqualTo
                        nextStrCharBool3VL();
                        Double a = x;
                        String Data = parseStrTriStateLowExpr();
                        Double b = Double.parseDouble(Data);
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VL:parseTerm:<=:y.eval()=" + y.eval());
                        }
                        final String Temp = y.eval();
                        if (TempInit == false) {
                            if (Temp.equalsIgnoreCase("true") && (a.doubleValue() <= b.doubleValue())) {
                                y = (() -> "true");
                            } else if (Temp.equalsIgnoreCase("false") && (a.doubleValue() <= b.doubleValue())) {
                                y = (() -> "false");
                            } else if (Temp.equalsIgnoreCase("true") && (!(a.doubleValue() <= b.doubleValue()))) {
                                y = (() -> "false");
                            } else if (Temp.equalsIgnoreCase("Unknown") && (!(a.doubleValue() <= b.doubleValue()))) {
                                y = (() -> "Unknown");
                            } else if (Temp.equalsIgnoreCase("Unknown") && ((a.doubleValue() <= b.doubleValue()))) {
                                y = (() -> "Unknown");
                            } else if (Temp.equalsIgnoreCase("")) {
                                y = (() -> "Error");
                            }
                            if (MyLogLevel.level >= LogLevel.Info.level) {
                                log.info("Predicate3VL:parseTerm:<=:y.eval()=" + y.eval());
                            }
                        } else {
                            if ((a.doubleValue() <= b.doubleValue())) {
                                y = (() -> "true");
                            } else if (a.doubleValue() > b.doubleValue()) {
                                y = (() -> "false");
                            } else {
                                y = (() -> "Unknown");
                            }
                            if (MyLogLevel.level >= LogLevel.Info.level) {
                                log.info("Predicate3VL:parseTerm:<=:y.eval()=" + y.eval());
                            }
                        }
                        TempInit = false;
                        x = b;
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VL:parseTerm:<=:a=" + a);
                            log.info("Predicate3VL:parseTerm:<=:Data=" + Data);
                            log.info("Predicate3VL:parseTerm:<=:b=" + b);
                            log.info("Predicate3VL:parseTerm:<=:y.eval()=" + y.eval());
                        }
                    } else if ((chBool3VL == '<') && (chNextBool3VL != '=')) { // GreaterThan
                        final String MyTemp = PlainLessThan(x, TempInit);
                        y = (() -> MyTemp);
                        TempInit = false;
                    } else if ((chBool3VL == '>') && (chNextBool3VL == '=')) { // LessThan
                        nextStrCharBool3VL();
                        Double a = x;
                        String Data = parseStrTriStateLowExpr();
                        Double b = Double.parseDouble(Data);
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VL:parseTerm:>=:y.eval()=" + y.eval());
                        }
                        final String Temp = y.eval();
                        if (TempInit == false) {
                            if (Temp.equalsIgnoreCase("true") && (a.doubleValue() >= b.doubleValue())) {
                                y = (() -> "true");
                            } else if (Temp.equalsIgnoreCase("false") && (a.doubleValue() >= b.doubleValue())) {
                                y = (() -> "false");
                            } else if (Temp.equalsIgnoreCase("true") && (!(a.doubleValue() >= b.doubleValue()))) {
                                y = (() -> "false");
                            } else if (Temp.equalsIgnoreCase("Unknown") && (!(a.doubleValue() >= b.doubleValue()))) {
                                y = (() -> "Unknown");
                            } else if (Temp.equalsIgnoreCase("Unknown") && ((a.doubleValue() >= b.doubleValue()))) {
                                y = (() -> "Unknown");
                            } else if (Temp.equalsIgnoreCase("")) {
                                y = (() -> "Error");
                            }
                            if (MyLogLevel.level >= LogLevel.Info.level) {
                                log.info("Predicate3VL:parseTerm:>=:y.eval()=" + y.eval());
                            }
                        } else {
                            if ((a.doubleValue() >= b.doubleValue())) {
                                y = (() -> "true");
                            } else if (a.doubleValue() < b.doubleValue()) {
                                y = (() -> "false");
                            } else {
                                y = (() -> "Unknown");
                            }
                            if (MyLogLevel.level >= LogLevel.Info.level) {
                                log.info("Predicate3VL:parseTerm:>=:y.eval()=" + y.eval());
                            }
                        }
                        TempInit = false;
                        x = b;
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VL:parseTerm:>=:a=" + a);
                            log.info("Predicate3VL:parseTerm:>=:Data=" + Data);
                            log.info("Predicate3VL:parseTerm:>=:b=" + b);
                            log.info("Predicate3VL:parseTerm:>=:y.eval()=" + y.eval());
                        }
                    } else if ((chBool3VL == '>') && (chNextBool3VL != '=')) { // Greaterthan
                        final String MyTemp = PlainGreaterThan(x, TempInit);
                        y = (() -> MyTemp);
                        TempInit = false;
                    } else if ((chBool3VL == '=') && (chNextBool3VL == '=')) { // EqualTo
                        Double a = x;
                        String Data = parseStrTriStateLowExpr();
                        Double b = Double.parseDouble(Data);
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VL:parseTerm:==:y.eval()=" + y.eval() + " x=" + x + " a=" + a + " b=" + b + " Data=" + Data);
                        }
                        final String Temp = y.eval();
                        if (TempInit == false) {
                            if (Temp.equalsIgnoreCase("true") && (a.doubleValue() == b.doubleValue())) {
                                y = (() -> "true");
                                if (MyLogLevel.level >= LogLevel.Info.level) {
                                    log.info("Predicate3VL:parseTerm:==:y.eval()=" + y.eval() + " x=" + x + " a=" + a + " b=" + b + " Data=" + Data);
                                }
                            } else if (Temp.equalsIgnoreCase("false") && (a.doubleValue() == b.doubleValue())) {
                                y = (() -> "false");
                                if (MyLogLevel.level >= LogLevel.Info.level) {
                                    log.info("Predicate3VL:parseTerm:==:y.eval()=" + y.eval() + " x=" + x + " a=" + a + " b=" + b + " Data=" + Data);
                                }
                            } else if (Temp.equalsIgnoreCase("true") && (!(a.doubleValue() == b.doubleValue()))) {
                                y = (() -> "false");
                                if (MyLogLevel.level >= LogLevel.Info.level) {
                                    log.info("Predicate3VL:parseTerm:==:y.eval()=" + y.eval() + " x=" + x + " a=" + a + " b=" + b + " Data=" + Data);
                                }
                            } else if (Temp.equalsIgnoreCase("Unknown") && (!(a.doubleValue() == b.doubleValue()))) {
                                y = (() -> "Unknown");
                                if (MyLogLevel.level >= LogLevel.Info.level) {
                                    log.info("Predicate3VL:parseTerm:==:y.eval()=" + y.eval() + " x=" + x + " a=" + a + " b=" + b + " Data=" + Data);
                                }
                            } else if (Temp.equalsIgnoreCase("Unknown") && ((a.doubleValue() == b.doubleValue()))) {
                                y = (() -> "Unknown");
                                if (MyLogLevel.level >= LogLevel.Info.level) {
                                    log.info("Predicate3VL:parseTerm:==:y.eval()=" + y.eval() + " x=" + x + " a=" + a + " b=" + b + " Data=" + Data);
                                }
                            } else if (Temp.equalsIgnoreCase("")) {
                                y = (() -> "Error");
                                if (MyLogLevel.level >= LogLevel.Info.level) {
                                    log.info("Predicate3VL:parseTerm:==:y.eval()=" + y.eval() + " x=" + x + " a=" + a + " b=" + b + " Data=" + Data);
                                }
                            }
                            if (MyLogLevel.level >= LogLevel.Info.level) {
                                log.info("Predicate3VL:parseTerm:=:y.eval()=" + y.eval());
                            }
                        } else {
                            if ((a.doubleValue() == b.doubleValue())) {
                                y = (() -> "true");
                                if (MyLogLevel.level >= LogLevel.Info.level) {
                                    log.info("Predicate3VL:parseTerm:==:y.eval()=" + y.eval() + " x=" + x + " a=" + a + " b=" + b + " Data=" + Data);
                                }
                            } else if (a.doubleValue() != b.doubleValue()) {
                                y = (() -> "false");
                                if (MyLogLevel.level >= LogLevel.Info.level) {
                                    log.info("Predicate3VL:parseTerm:==:y.eval()=" + y.eval() + " x=" + x + " a=" + a + " b=" + b + " Data=" + Data);
                                }
                            } else {
                                y = (() -> "Unknown");
                                if (MyLogLevel.level >= LogLevel.Info.level) {
                                    log.info("Predicate3VL:parseTerm:==:y.eval()=" + y.eval() + " x=" + x + " a=" + a + " b=" + b + " Data=" + Data);
                                }
                            }
                            if (MyLogLevel.level >= LogLevel.Info.level) {
                                log.info("Predicate3VL:parseTerm:=:y.eval()=" + y.eval());
                            }
                        }
                        TempInit = false;
                        x = b;
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VL:parseTerm:==:a=" + a);
                            log.info("Predicate3VL:parseTerm:==:Data=" + Data);
                            log.info("Predicate3VL:parseTerm:==:b=" + b);
                            log.info("Predicate3VL:parseTerm:==:y.eval()=" + y.eval());
                        }
                    } else if ((chBool3VL == '!') && (chNextBool3VL == '=')) { // Not EqualTo
                        Double a = x;
                        String Data = parseStrTriStateLowExpr();
                        Double b = Double.parseDouble(Data);
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VL:parseTerm:!=:y.eval()=" + y.eval());
                        }
                        final String Temp = y.eval();
                        if (TempInit == false) {
                            if (Temp.equalsIgnoreCase("true") && (a.doubleValue() != b.doubleValue())) {
                                y = (() -> "true");
                                if (MyLogLevel.level >= LogLevel.Info.level) {
                                    log.info("Predicate3VL:parseTerm:==:y.eval()=" + y.eval() + " x=" + x + " a=" + a + " b=" + b + " Data=" + Data);
                                }
                            } else if (Temp.equalsIgnoreCase("false") && (a.doubleValue() != b.doubleValue())) {
                                y = (() -> "false");
                                if (MyLogLevel.level >= LogLevel.Info.level) {
                                    log.info("Predicate3VL:parseTerm:==:y.eval()=" + y.eval() + " x=" + x + " a=" + a + " b=" + b + " Data=" + Data);
                                }
                            } else if (Temp.equalsIgnoreCase("true") && (!(a.doubleValue() != b.doubleValue()))) {
                                y = (() -> "false");
                                if (MyLogLevel.level >= LogLevel.Info.level) {
                                    log.info("Predicate3VL:parseTerm:==:y.eval()=" + y.eval() + " x=" + x + " a=" + a + " b=" + b + " Data=" + Data);
                                }
                            } else if (Temp.equalsIgnoreCase("Unknown") && (!(a.doubleValue() != b.doubleValue()))) {
                                y = (() -> "Unknown");
                                if (MyLogLevel.level >= LogLevel.Info.level) {
                                    log.info("Predicate3VL:parseTerm:==:y.eval()=" + y.eval() + " x=" + x + " a=" + a + " b=" + b + " Data=" + Data);
                                }
                            } else if (Temp.equalsIgnoreCase("Unknown") && ((a.doubleValue() != b.doubleValue()))) {
                                y = (() -> "Unknown");
                                if (MyLogLevel.level >= LogLevel.Info.level) {
                                    log.info("Predicate3VL:parseTerm:==:y.eval()=" + y.eval() + " x=" + x + " a=" + a + " b=" + b + " Data=" + Data);
                                }
                            } else if (Temp.equalsIgnoreCase("")) {
                                y = (() -> "Error");
                                if (MyLogLevel.level >= LogLevel.Info.level) {
                                    log.info("Predicate3VL:parseTerm:==:y.eval()=" + y.eval() + " x=" + x + " a=" + a + " b=" + b + " Data=" + Data);
                                }
                            }
                            if (MyLogLevel.level >= LogLevel.Info.level) {
                                log.info("Predicate3VL:parseTerm:!=:y.eval()=" + y.eval());
                            }
                        } else {
                            if ((a.doubleValue() != b.doubleValue())) {
                                y = (() -> "true");
                                if (MyLogLevel.level >= LogLevel.Info.level) {
                                    log.info("Predicate3VL:parseTerm:==:y.eval()=" + y.eval() + " x=" + x + " a=" + a + " b=" + b + " Data=" + Data);
                                }
                            } else if (a.doubleValue() == b.doubleValue()) {
                                y = (() -> "false");
                                if (MyLogLevel.level >= LogLevel.Info.level) {
                                    log.info("Predicate3VL:parseTerm:==:y.eval()=" + y.eval() + " x=" + x + " a=" + a + " b=" + b + " Data=" + Data);
                                }
                            } else {
                                y = (() -> "Unknown");
                                if (MyLogLevel.level >= LogLevel.Info.level) {
                                    log.info("Predicate3VL:parseTerm:==:y.eval()=" + y.eval() + " x=" + x + " a=" + a + " b=" + b + " Data=" + Data);
                                }
                            }
                            if (MyLogLevel.level >= LogLevel.Info.level) {
                                log.info("Predicate3VL:parseTerm:!=:y.eval()=" + y.eval());
                            }
                        }
                        TempInit = false;
                        x = b;
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VL:parseTerm:!=:a=" + a);
                            log.info("Predicate3VL:parseTerm:!=:Data=" + Data);
                            log.info("Predicate3VL:parseTerm:!=:b=" + b);
                            log.info("Predicate3VL:parseTerm:!=:y.eval()=" + y.eval());
                        }
                    } else {
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VL:parseTerm:Return Value:y.eval()=" + y.eval() + " chBool3VL=" + (char) chBool3VL + " x=" + x + " chNextBool3VL=" + (char) chNextBool3VL);
                        }
                        return y;
                    }
                }
            }

            String PlainLessThan(Double x, boolean TempInit) {
                Predicate3VL y = (() -> "Unknown");
                chBool3VL = chNextBool3VL;
                posBool3VL++;
                Double a = x;
                String Data = parseStrTriStateLowExpr();
                Double b = Double.parseDouble(Data);
                if (MyLogLevel.level >= LogLevel.Info.level) {
                    log.info("Predicate3VL:PlainLessThan:<:y.eval()=" + y.eval());
                }
                final String Temp = y.eval();
                if (TempInit == false) {
                    if (Temp.equalsIgnoreCase("true") && (a.doubleValue() < b.doubleValue())) {
                        y = (() -> "true");
                    } else if (Temp.equalsIgnoreCase("false") && (a.doubleValue() < b.doubleValue())) {
                        y = (() -> "false");
                    } else if (Temp.equalsIgnoreCase("true") && (!(a.doubleValue() < b.doubleValue()))) {
                        y = (() -> "false");
                    } else if (Temp.equalsIgnoreCase("Unknown") && (!(a.doubleValue() < b.doubleValue()))) {
                        y = (() -> "Unknown");
                    } else if (Temp.equalsIgnoreCase("Unknown") && ((a.doubleValue() < b.doubleValue()))) {
                        y = (() -> "Unknown");
                    } else if (Temp.equalsIgnoreCase("")) {
                        y = (() -> "Error");
                    }
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("Predicate3VL:PlainLessThan:<:y.eval()=" + y.eval());
                    }
                } else {
                    // BOOLEANATING CODE
                    if ((a.doubleValue() < b.doubleValue())) {
                        y = (() -> "true");
                    } else if (a.doubleValue() > b.doubleValue()) {
                        y = (() -> "false");
                    } else if ((EqualsIsUnknownFlag==true)&&(a.doubleValue() == b.doubleValue()) ) {
                        y = (() -> "Unknown");
                    }else if ((EqualsIsUnknownFlag==false)&&(a.doubleValue() == b.doubleValue()) ) {
                        y = (() -> "false");
                    }else {
                        y = (() -> "Error");
                    }
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("Predicate3VL:PlainLessThan:<:y.eval()=" + y.eval());
                    }
                }
                TempInit = false;
                x = b;
                if (MyLogLevel.level >= LogLevel.Info.level) {
                    log.info("Predicate3VL:PlainLessThan:<:a=" + a);
                    log.info("Predicate3VL:PlainLessThan:<:Data=" + Data);
                    log.info("Predicate3VL:PlainLessThan:<:b=" + b);
                    log.info("Predicate3VL:PlainLessThan:<:y.eval()=" + y.eval());
                }
                return y.eval();
            }

            String PlainGreaterThan(Double x, boolean TempInit) {
                Predicate3VL y = (() -> "Unknown");
                chBool3VL = chNextBool3VL;
                posBool3VL++;
                Double a = x;
                String Data = parseStrTriStateLowExpr();
                Double b = Double.parseDouble(Data);
                if (MyLogLevel.level >= LogLevel.Info.level) {
                    log.info("Predicate3VL:PlainGreaterThan:>:y.eval()=" + y.eval());
                }
                final String Temp = y.eval();
                if (TempInit == false) {
                    if (Temp.equalsIgnoreCase("true") && (a.doubleValue() >= b.doubleValue())) {
                        y = (() -> "true");
                    } else if (Temp.equalsIgnoreCase("false") && (a.doubleValue() > b.doubleValue())) {
                        y = (() -> "false");
                    } else if (Temp.equalsIgnoreCase("true") && (!(a.doubleValue() > b.doubleValue()))) {
                        y = (() -> "false");
                    } else if (Temp.equalsIgnoreCase("Unknown") && (!(a.doubleValue() > b.doubleValue()))) {
                        y = (() -> "Unknown");
                    } else if (Temp.equalsIgnoreCase("Unknown") && ((a.doubleValue() > b.doubleValue()))) {
                        y = (() -> "Unknown");
                    } else if (Temp.equalsIgnoreCase("")) {
                        y = (() -> "Error");
                    }
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("Predicate3VL:PlainGreaterThan:>:y.eval()=" + y.eval());
                    }
                } else {
                    // BOOLEANATING CODE
                    if ((a.doubleValue() > b.doubleValue())) {
                        y = (() -> "true");
                    } else if (a.doubleValue() < b.doubleValue()) {
                        y = (() -> "false");
                    } else if ((EqualsIsUnknownFlag==true)&&(a.doubleValue() == b.doubleValue()) ) {
                        y = (() -> "Unknown");
                    }else if ((EqualsIsUnknownFlag==false)&&(a.doubleValue() == b.doubleValue()) ) {
                        y = (() -> "false");
                    }else {
                        y = (() -> "Error");
                    }
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("Predicate3VL:PlainGreaterThan:>:y.eval()=" + y.eval());
                    }
                }
                TempInit = false;
                x = b;
                if (MyLogLevel.level >= LogLevel.Info.level) {
                    log.info("Predicate3VL:PlainGreaterThan:>:a=" + a);
                    log.info("Predicate3VL:PlainGreaterThan:>:Data=" + Data);
                    log.info("Predicate3VL:PlainGreaterThan:>:b=" + b);
                    log.info("Predicate3VL:PlainGreaterThan:>:y.eval()=" + y.eval());
                }
                return y.eval();
            }

            String parseStrTriStateLowExpr() {
                String x = "Unknown";
                x = "" + parseArithExpression();
                if (MyLogLevel.level >= LogLevel.Info.level) {
                    log.info("Predicate3VL:parseStrTriStateLowExpr:Initial:x=" + x + " chBool3VL=" + (char) chBool3VL + " chNextBool3VL=" + (char) chNextBool3VL);
                }
                return x;
            }

            Double parseArithExpression() {
                Double x = 0.0;
                int ExprStartPos = posBool3VL;
                int ExprEndPos = -1;
                if (posBool3VL < 0) {
                    ExprStartPos = 0;
                }
                x = parseTerm();
                if (MyLogLevel.level >= LogLevel.Info.level) {
                    log.info("Predicate3VL:parseArithExpression:Initial:x=" + x);
                }
                for (;;) {
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("Predicate3VL:parseArithExpression:Top:Inside Loop: parseExpression:chBool3VL=" + (char) chBool3VL + " posBool3VL=" + posBool3VL);
                    }
                    if (eatBool3VL(')')) {
                        return x;
                    } else if ((eatBool3VL('+'))) {// addition
                        Double a = x, b = parseTerm();
                        if (ZeroTermSignFlag == true) {
                            x = -1.0 * a + b;
                            ZeroTermSignFlag = false;
                        } else {
                            x = a + b;
                        }
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VL:parseArithExpression:x=" + x + " a=" + a + "+ b=" + b);
                        }
                    } else if ((eatBool3VL('-'))) { // subtraction
                        Double a = x, b = parseTerm();
                        if (ZeroTermSignFlag == true) {
                            x = -1.0 * a - b;
                            ZeroTermSignFlag = false;
                        } else {
                            x = a - b;
                        }
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VL:parseArithExpression:x=" + x + " a.eval()=" + a + "- b=" + b);
                        }
                    } else {
                        if ((posBool3VL >= 0) && (posBool3VL < StrBool3VL.length())) {
                            ExprEndPos = posBool3VL;
                        } else {
                            ExprEndPos = StrBool3VL.length();
                        }
                        if ((ExprStartPos > ExprEndPos)) {
                            ExprEndPos = StrBool3VL.length();
                        }
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VL:parseArithExpression:Return Value:x=" + x + " Expr=" + StrBool3VL.substring(ExprStartPos, ExprEndPos));
                            log.warn("Predicate3VL:parseArithExpression:Return Value:x=" + x + " Expr=" + StrBool3VL.substring(ExprStartPos, ExprEndPos));
                        }
                        return x;
                    }
                }
            }

            Double parseTerm() {
                int TermStartPos = posBool3VL;
                int TermEndPos = -1;
                if (posBool3VL < 0) {
                    TermStartPos = 0;
                }
                Double x = parseFactor();
                if (MyLogLevel.level >= LogLevel.Info.level) {
                    log.info("Predicate3VL:parseTerm:Initial:x=" + x + " chBool3VL=" + (char) chBool3VL + " chNextBool3VL=" + (char) chNextBool3VL);
                }
                for (;;) {
                    Double a = x;
                    if (eatBool3VL('*')) { // multiplication
                        Double b = parseFactor();
                        x = a * b;
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VL:parseTerm:*:a=" + a + " chBool3VL=" + (char) chBool3VL + " chNextBool3VL=" + (char) chNextBool3VL);
                            log.info("Predicate3VL:parseTerm:*:b=" + b);
                            log.info("Predicate3VL:parseTerm:*:x=" + x + " a=" + a + "* b=" + b);
                        }
                    } else if (eatBool3VL('/')) { // division
                        Double b = parseFactor();
                        x = a / b;
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VL:parseTerm:/:a.eval=" + a + " chBool3VL=" + (char) chBool3VL + " chNextBool3VL=" + (char) chNextBool3VL);
                            log.info("Predicate3VL:parseTerm:/:b.eval=" + b);
                            log.info("Predicate3VL:parseTerm:/:x.eval=" + x + " a=" + a + "/ b=" + b);
                        }
                    } else if (eatBool3VL('%')) { // Modulus
                        Double b = parseFactor();
                        x = a % b;
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VL:parseTerm:%:a=" + a + " chBool3VL=" + (char) chBool3VL + " chNextBool3VL=" + (char) chNextBool3VL);
                            log.info("Predicate3VL:parseTerm:%:b=" + b);
                            log.info("Predicate3VL:parseTerm:%:x=" + x + " a=" + a + "% b=" + b);
                        }
                    } else {
                        if ((posBool3VL >= 0) && (posBool3VL < StrBool3VL.length())) {
                            TermEndPos = posBool3VL;
                        } else {
                            TermEndPos = StrBool3VL.length();
                        }
                        if ((TermStartPos > TermEndPos)) {
                            TermEndPos = StrBool3VL.length();
                        }
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VL:parseTerm:Return Value:x=" + x + " Term=" + StrBool3VL.substring(TermStartPos, TermEndPos) + " chBool3VL=" + (char) chBool3VL + " chNextBool3VL=" + (char) chNextBool3VL);
                            log.warn("Predicate3VL:parseTerm:Return Value:x=" + x + " Term=" + StrBool3VL.substring(TermStartPos, TermEndPos));
                        }
                        return x;
                    }
                }
            }

            Double parseFactor() {
                int FactorStartPos = posBool3VL;
                int FactorEndPos = -1;
                if (posBool3VL < 0) {
                    FactorStartPos = 0;
                }
                Double x = parseBasePredicate();
                if (MyLogLevel.level >= LogLevel.Info.level) {
                    log.info("Predicate3VL:parseFactor:x=" + x + " chBool3VL=" + (char) chBool3VL + " chNextBool3VL=" + (char) chNextBool3VL);
                }
                for (;;) {
                    if (eatBool3VL('^')) { // exponentiation
                        Double a = x, b = parseBasePredicate();
                        x = Math.pow(a.doubleValue(), b.doubleValue());
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VL:parseFactor:x=" + x + " Math.pow(a=" + a + "^ b=" + b + ")" + " chBool3VL=" + (char) chBool3VL + " chNextBool3VL=" + (char) chNextBool3VL);
                        }
                    } else {
                        if ((posBool3VL >= 0) && (posBool3VL < StrBool3VL.length())) {
                            FactorEndPos = posBool3VL;
                        } else {
                            FactorEndPos = StrBool3VL.length();
                        }
                        if ((FactorStartPos > FactorEndPos)) {
                            FactorEndPos = StrBool3VL.length();
                        }
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("Predicate3VL:parseFactor:FactorStartPos=" + FactorStartPos + " FactorEndPos=" + FactorEndPos + " chBool3VL=" + (char) chBool3VL + " chNextBool3VL=" + (char) chNextBool3VL);
                            log.info("Predicate3VL:parseFactor:Return Value:x=" + x + " Factor=" + StrBool3VL.substring(FactorStartPos, FactorEndPos));
                            log.warn("Predicate3VL:parseFactor:Return Value:x=" + x + " Factor=" + StrBool3VL.substring(FactorStartPos, FactorEndPos));
                        }
                        return x;
                    }
                }
            }

            Double parseBasePredicate() {
                int startPos = posBool3VL;
                chNextBool3VL = StrBool3VL.charAt(posBool3VL);
                if (MyLogLevel.level >= LogLevel.Info.level) {
                    log.info("Predicate3VL:parseBasePredicate:Initial:chBool3VL=" + (char) chBool3VL + " chNextBool3VL=" + (char) chNextBool3VL + " StrBool3VL=" + StrBool3VL.substring(startPos));
                }
                Double x;
                if (chBool3VL == '(') { //parentheses
                    nextStrCharBool3VL();
                    startPos = posBool3VL;
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("Predicate3VL:parseBasePredicate:(:chBool3VL=" + (char) chBool3VL + " chNextBool3VL=" + (char) chNextBool3VL);
                    }
                    if (chBool3VL == '!') {
                        NegateGotFlag = true;
                    }
                    x = parseBasePredicate();
                    return x;
                }
                Double xx = 1.0;
                if (MyLogLevel.level >= LogLevel.Info.level) {
                    log.info("Predicate3VL:parseBasePredicate:Number:chBool3VL=" + (char) chBool3VL + " chNextBool3VL=" + (char) chNextBool3VL + " xx=" + xx + " StrBool3VL=" + StrBool3VL.substring(startPos));
                }
                if (IsNumber(chBool3VL)) { //numbers
                    while (IsNumber(chBool3VL)) {
                        nextStrCharBool3VL();
                        if ((chBool3VL == 'E') || (chBool3VL == 'e')) {
                            nextStrCharBool3VL();
                            if ((chBool3VL == '-') || (chBool3VL == '+')) {
                                nextStrCharBool3VL();
                            }
                        }
                    }

                    if ((StrBool3VL != null) && (!StrBool3VL.equalsIgnoreCase("")) && (!StrBool3VL.equalsIgnoreCase("NaN"))) {
                        xx = Double.parseDouble(StrBool3VL.substring(startPos, posBool3VL));
                    }
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("Predicate3VL:parseBasePredicate:Number:chBool3VL=" + (char) chBool3VL + " chNextBool3VL=" + (char) chNextBool3VL + " xx=" + xx);
                    }
                    return xx;
                }
                if (chBool3VL == '=') {
                    //nextStrCharBool3VL();
                }
                if ((chBool3VL == ')') && (posBool3VL == (StrBool3VL.length() - 1))) {
                    chBool3VL = -1;
                    posBool3VL++;
                } else if (chBool3VL == ')') {
                    //nextStrCharBool3VL();
                }
                Double xx2 = 1.0;
                startPos = posBool3VL;
                if (IsVariable(chBool3VL)) {//functions & variables
                    while ((IsVariable(chBool3VL)) || (IsNumber(chBool3VL))) {
                        nextStrCharBool3VL();
                    }
                    String name = StrBool3VL.substring(startPos, posBool3VL).trim();
                    if ((name != null) && (!name.equalsIgnoreCase("")) && (!name.equalsIgnoreCase("NaN")) && (variables.get(name) != null)) {
                        xx2 = variables.get(name);
                    }
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("Predicate3VL:parseBasePredicate:Variable:chBool3VL=" + (char) chBool3VL + " chNextBool3VL=" + (char) chNextBool3VL + " xx2=" + xx2 + " name=" + name);
                    }
                    if (chBool3VL == '=') {
                        //nextStrCharBool3VL();
                    }
                    if ((chBool3VL == ')') && (posBool3VL == (StrBool3VL.length() - 1))) {
                        chBool3VL = -1;
                        posBool3VL++;
                    } else if (chBool3VL == ')') {
                        //nextStrCharBool3VL();
                    }
                    return xx2;
                } else if ((IsLogicalOperator(chBool3VL)) && (IsLogicalOperator(chNextBool3VL))) {
                    nextStrCharBool3VL();
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("Predicate3VL:parseBasePredicate:IsLogicalOperator:chBool3VL=" + (char) chBool3VL + " chNextBool3VL=" + (char) chNextBool3VL + " xx=" + xx + " StrBool3VL=" + StrBool3VL.substring(startPos));
                    }
                    xx = parseBasePredicate();
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("Predicate3VL:parseBasePredicate:IsLogicalOperator:chBool3VL=" + (char) chBool3VL + " chNextBool3VL=" + (char) chNextBool3VL + " xx=" + xx + " StrBool3VL=" + StrBool3VL.substring(startPos));
                    }
                    return xx;
                } else if ((IsLogicalOperator(chBool3VL))) {
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("Predicate3VL:parseBasePredicate:IsLogicalOperator:chBool3VL=" + (char) chBool3VL + " chNextBool3VL=" + (char) chNextBool3VL + " xx=" + xx + " StrBool3VL=" + StrBool3VL.substring(startPos));
                    }
                    nextStrCharBool3VL();
                    posBool3VL--;
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("Predicate3VL:parseBasePredicate:IsLogicalOperator:chBool3VL=" + (char) chBool3VL + " chNextBool3VL=" + (char) chNextBool3VL + " xx=" + xx + " StrBool3VL=" + StrBool3VL.substring(startPos));
                    }
                    xx = parseBasePredicate();
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("Predicate3VL:parseBasePredicate:IsLogicalOperator:chBool3VL=" + (char) chBool3VL + " chNextBool3VL=" + (char) chNextBool3VL + " xx=" + xx + " StrBool3VL=" + StrBool3VL.substring(startPos));
                    }
                    return xx;
                } else if ((IsOperator(chBool3VL)) && ((IsNumber(chNextBool3VL)) || (IsVariable(chNextBool3VL)))) {
                    PredicateArithOper = chBool3VL;
                    PredicateArithOperNext = chNextBool3VL;
                    nextStrCharBool3VL();
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("Predicate3VL:parseBasePredicate:IsLogicalOperator:chBool3VL=" + (char) chBool3VL + " chNextBool3VL=" + (char) chNextBool3VL + " xx=" + xx + " StrBool3VL=" + StrBool3VL.substring(startPos));
                    }
                    xx = parseBasePredicate();
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("Predicate3VL:parseBasePredicate:IsLogicalOperator:chBool3VL=" + (char) chBool3VL + " chNextBool3VL=" + (char) chNextBool3VL + " xx=" + xx + " StrBool3VL=" + StrBool3VL.substring(startPos));
                    }
                    return xx;
                } else {
                    if ((startPos < StrBool3VL.length()) && (startPos < posBool3VL)) {
                        throw new RuntimeException("Predicate3VL:parseBasePredicate:Unexpected: " + (char) chBool3VL + " int=" + (int) chBool3VL + " Cannot Format:" + StrBool3VL.substring(posBool3VL, StrBool3VL.length()));
                    } else if (chBool3VL != -1) {
                        throw new RuntimeException("Predicate3VL:parseBasePredicate:Unexpected: " + (char) chBool3VL + " int=" + (int) chBool3VL + " Cannot Format:" + StrBool3VL.substring(posBool3VL, StrBool3VL.length()));
                    }
                    return xx;
                }
            }
        }.parse3VL();
    }
}
