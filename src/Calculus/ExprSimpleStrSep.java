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
import Calculus.MathsExpressionParser;
import static Calculus.MathsExpressionParser.parse;
import static Calculus.CalculusApplication.eatAllHGH;
import static Calculus.CalculusApplication.parseHghLvlExprODE;
import static Calculus.DiffrIntegrSep.MyFuncDiff;
import static Calculus.DiffrIntegrSep.MyFuncIntegr;
import static Calculus.MathematicalTestHarness.CompletionTime;
import static Calculus.MathematicalTestHarness.LowInitFlagRecordTime;
import static Calculus.MathematicalTestHarness.TestDiffWithRespTo;
import static Calculus.MathematicalTestHarness.VerifyInverse;
import static Calculus.MathsContxtLAv.ChaosPrevention;
import static Calculus.MathsContxtLAv.StrIsAConstant;
import static Calculus.MathsContxtLAv.StrIsAConstHigh;
import static Calculus.MathsContxtLAv.parseOrder;
import static Calculus.TestHarnessClass.ConformalMapTestCaseDiff;
import static Calculus.TestHarnessClass.ConformalMapTestCaseIntegr;
import static Calculus.TestHarnessClass.PassFailTestCaseString;
import static Calculus.TestHarnessClass.PassFailTestCaseValueStrict;
import static Calculus.UsageCalculus.ByPassedTestCases;
import static Calculus.UsageCalculus.DiffWithRespTo;
import static Calculus.UsageCalculus.DupChecknInsert;
import static Calculus.UsageCalculus.EndTestCase;
import static Calculus.UsageCalculus.EqnDB;
import static Calculus.UsageCalculus.EqnDBDupCount;
import static Calculus.UsageCalculus.EqnDBIndex;
import static Calculus.UsageCalculus.EqnRegressionDiffStatus;
import static Calculus.UsageCalculus.EqnRegressionIntegreStatus;
import static Calculus.UsageCalculus.EqnSolArrayDiffAlone;
import static Calculus.UsageCalculus.EqnSolArrayIntegrAlone;
import static Calculus.UsageCalculus.EqnSolArrayMap1;
import static Calculus.UsageCalculus.EqnSolArrayMap2;
import static Calculus.UsageCalculus.EqnSolArrayMap3;
import static Calculus.UsageCalculus.EqnSolArrayMap4;
import static Calculus.UsageCalculus.EqnUnderTest;
import static Calculus.UsageCalculus.ExceptionStringDB;
import static Calculus.UsageCalculus.ExceptionTestCases;
import static Calculus.UsageCalculus.FailedTestCases;
import static Calculus.UsageCalculus.FailedTestCount;
import static Calculus.UsageCalculus.GapProcess;
import static Calculus.UsageCalculus.InvertAnsBothFlippedCount;
import static Calculus.UsageCalculus.InvertAnsFlippedCount;
import static Calculus.UsageCalculus.KnownIssues;
import static Calculus.UsageCalculus.LastTestCaseHarness;
import static Calculus.UsageCalculus.MaxDiffOrder;
import static Calculus.UsageCalculus.MaxIndexExcept;
import static Calculus.UsageCalculus.MaxIndexFail;
import static Calculus.UsageCalculus.MaxIntegreOrder;
import static Calculus.UsageCalculus.MissedNumberTestCases;
import static Calculus.UsageCalculus.MissedTestCasesException;
import static Calculus.UsageCalculus.MissedTestCasesInfinity;
import static Calculus.UsageCalculus.Order;
import static Calculus.UsageCalculus.Section;
import static Calculus.UsageCalculus.SectionIndexFail;
import static Calculus.UsageCalculus.SectionStart;
import static Calculus.UsageCalculus.SectionTestCaseEnd;
import static Calculus.UsageCalculus.SectionTestCaseStart;
import static Calculus.UsageCalculus.StageMapping;
import static Calculus.UsageCalculus.TestCase;
import static Calculus.UsageCalculus.TestCaseFile;
import static Calculus.UsageCalculus.TestCaseMatrixID;
import static Calculus.UsageCalculus.TestCaseName;
import static Calculus.UsageCalculus.TestCasePassConformalValFlag;
import static Calculus.UsageCalculus.TestCasePassHighLevelFlag;
import static Calculus.UsageCalculus.TestCasePassStrFlag;
import static Calculus.UsageCalculus.TestCasePassValFlag;
import static Calculus.UsageCalculus.TestHarnessDiff;
import static Calculus.UsageCalculus.TotalTestCases;
import static Calculus.UsageCalculus.cause;
import static Calculus.UsageCalculus.mainRegresssionHghLvlExprODETest;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.DoubleUnaryOperator;
import org.apache.log4j.Logger;

/**
 *
 * @author Administrator
 */
public class ExprSimpleStrSep {

    public static Logger log = Logger.getLogger(ExprSimpleStrSep.class.getName());
    static Map<String, String> variables = new HashMap<>();
    public static Map<String, DoubleUnaryOperator> functions = new HashMap<>();
    static String BC_SplitterDiff = "[\\^\\(\\/\\*\\-\\+\\)]";
    public static Map<String, String> functionsSimple = new HashMap<>();

    public static enum LogLevel {
        All(7), Debug(6), Info(5), Warn(4), Error(3), Fatal(2), Off(1);
        int level = 0;

        LogLevel(int level1) {
            this.level = level1;
        }
    }
    public static int ParenthesisOperator = 0;
    public static boolean ZeroTermSignFlag = false;

    public static void MyFuncExpress() {
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

    public static void MyFuncSimple() {
        functionsSimple.put("sin", "sin");
        functionsSimple.put("cos", "cos");
        functionsSimple.put("tan", "tan");
        functionsSimple.put("log", "log");
        functionsSimple.put("ln", "ln");
        functionsSimple.put("exp", "exp");
        //TODO:More Simple Unary Functions to be added
    }

    public static boolean IsOperator(int Mych) {
        return (((Mych == '+') || (Mych == '-') || (Mych == '*') || (Mych == '/') || (Mych == '^')));
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

    public static boolean IsNumber(int Mych) {
        return ((((Mych >= '0') && (Mych <= '9')) || (Mych == '.')));
    }

    public static boolean IsVariable(int Mych) {
        return (((Mych >= 'a') && (Mych <= 'z')) || ((Mych >= 'A') && (Mych <= 'Z')));
    }

    public static boolean IsIndConstant(int Mych) {
        return ((((Mych >= 'a') && (Mych <= 'z')) || ((Mych >= 'A') && (Mych <= 'Z'))) && (variables.containsKey(Mych)));
    }

    public static boolean IsNotAnOperator(int Mych) {
        return (((Mych != '+') && (Mych != '-') && (Mych != '*') && (Mych != '/') && (Mych != '^')));
    }

    //Created by Rajesh Pai
    // 
    @FunctionalInterface
    public interface ExprSimpleStr {

        String evalStr();
    }

    public static ExprSimpleStr parse(String str, Map<String, String> variables, String DiffWithRespTo, String Silent, ExprSimpleStrSep.LogLevel MyLogLevel) {

        return new Object() {
            // Expression Term character Index and Character Variable    
            int posExprStr = -1, chExprStr;
            String StrExprStr;

            void nextCharExpr() {
                ++posExprStr;
                chExprStr = (posExprStr < StrExprStr.length()) ? StrExprStr.charAt(posExprStr) : -1;
                if ((chExprStr == -1) && (posExprStr >= StrExprStr.length())) {
                    posExprStr = StrExprStr.length();
                } else if ((chExprStr == -1) || ((chExprStr == 0))) {
                    throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "nextChar:nextChar:Unexpected: " + (char) chExprStr + " int=" + (int) chExprStr + " Cannot Format:" + StrExprStr.substring(posExprStr, StrExprStr.length()));
                }
            }

            void prevCharExpr() {
                --posExprStr;
                chExprStr = (posExprStr >= 0) ? StrExprStr.charAt(posExprStr) : -1;
                if ((chExprStr == -1) && (posExprStr < 0)) 
            ; else if ((chExprStr == -1) || ((chExprStr == 0))) {
                    throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "prevChar:prevChar:Unexpected: " + (char) chExprStr + " int=" + (int) chExprStr + " Cannot Format:" + StrExprStr.substring(posExprStr, StrExprStr.length()));
                }
            }

            boolean eatExpr(int CharToEat) {
                while (chExprStr == ' ') {
                    nextCharExpr();
                }
                if (chExprStr == CharToEat) {
                    nextCharExpr();
                    return true;
                }
                return false;
            }

            boolean IsAConstant(String StrX1, String DiffWithRespTo) {

                try {
                    StrIsAConstant = "Unknown";
                    String StrX = StrX1;
                    //log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant);
                    log.info("IsAConstant:StrX=" + StrX);
                    log.info("IsAConstant:DiffWithRespTo=" + DiffWithRespTo);
//            if ((StrX != null)
//                    && (!StrX.equalsIgnoreCase(""))
//                    && (!StrX.contains(DiffWithRespTo))
//                    && (StrX.matches("[-+]+"))) {
//                StrIsAConstant = "Number";
//                log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant);
//                return true;
//            } else 
                    if ((StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (!StrX.contains(DiffWithRespTo))
                            && (StrX.matches("[\\-\\+]*[0-9\\.]+"))
                            //&& (!StrX.matches("[\\-\\+]*[a-zA-Z0-9]+"))
                            && (Double.isFinite(Double.valueOf(StrX)))) {
                        StrIsAConstant = "Number";
                        log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                        return true;
                    } else if ((StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (!StrX.contains(DiffWithRespTo))
                            && (StrX.matches("[\\+\\-\\*/]*[a-zA-Z0-9]+"))) {
                        StrIsAConstant = "IndConstant";
                        log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                        return false;
                    } else if ((StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (!StrX.contains(DiffWithRespTo))
                            && (StrX.matches("[\\-\\+\\*/]*[0-9\\.]+"))) {
                        StrIsAConstant = "NumberExpression";
                        log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                        return true;
                    } else if ((StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (!StrX.equalsIgnoreCase(DiffWithRespTo))
                            && (!StrX.contains(DiffWithRespTo))
                            && (StrX.matches("[\\+\\-\\*/]*[a-zA-Z0-9\\.]+[\\^]*[0-9\\.]+"))) {
                        StrIsAConstant = "IndConstantExpression";
                        log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                        return false;
                    } else if ((StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (StrX.equalsIgnoreCase(DiffWithRespTo))
                            && (StrX.matches("[\\+\\-\\*\\^/]*[a-zA-Z0-9]+"))) {
                        StrIsAConstant = "Var";
                        log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                        return false;
                    } else if ((StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && ((StrX.equalsIgnoreCase(DiffWithRespTo)) //|| ((StrX.contains(DiffWithRespTo)) && ((!StrX.contains(DiffWithRespTo + "^"))))
                            )
                            && (StrX.matches("[\\+\\-\\*\\^/]*[a-zA-Z0-9]+"))) {
                        StrIsAConstant = "Var";
                        log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                        return false;
                    } else if ((StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (StrX.contains(DiffWithRespTo))
                            && (StrX.equalsIgnoreCase(DiffWithRespTo))) {
                        StrIsAConstant = "VarExpression";
                        log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                        return false;
                    } else if ((StrIsAConstant.equalsIgnoreCase("Unknown")) && (StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (!StrX.contains(DiffWithRespTo))
                            && ((StrX.contains("E-")) || (StrX.contains("E+")) || (StrX.contains("e+")) || (StrX.contains("e-")))
                            && (Double.isFinite(Double.valueOf(StrX)))) {
                        StrIsAConstant = "Number";
                        log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                        return true;
                    } else if (StrIsAConstant.equalsIgnoreCase("Unknown") && (StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (StrX.matches("[\\+\\-]*[a-zA-Z0-9\\.]+"))
                            && (StrX.matches(DiffWithRespTo))) {
                        StrIsAConstant = "VarExpression";
                        log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                        return false;
                    } else if ((StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (!StrX.contains(DiffWithRespTo))
                            && ((StrX.matches("[\\+\\-]*[0-9\\.\\+\\-\\*\\^/]+[0-9\\.\\+\\-*\\^/]*"))
                            || (StrX.matches("[\\+\\-]*[0-9\\.\\*/]*\\^[0-9\\.\\*\\^/]+")))) {
                        StrIsAConstant = "NumberExpression";
                        log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                        return true;
                    } else if ((StrIsAConstant.equalsIgnoreCase("Unknown") && (StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && ((StrX.matches("[\\+\\-]*[a-zA-Z0-9\\.\\*\\^/]+[\\+\\-]*[0-9\\.]*"))
                            || (StrX.matches("[\\+\\-]*[0-9\\.\\*/]*\\^[a-zA-Z0-9\\.\\*\\^/]+"))))) {
                        StrIsAConstant = "IndConstantExpression";
                        log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                        return false;
                    }
                } catch (NumberFormatException ConstExp) {
                    log.info("IsAConstant:Exception:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                }
                log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                return false;
            }

            boolean IsAConstantNumber(String StrX1, String DiffWithRespTo) {

                try {
                    StrIsAConstant = "Unknown";
                    String StrX = StrX1;
                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
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

            boolean IsExtremity(String StrX1) {
                if ((!StrX1.equalsIgnoreCase("Infinity"))
                        && (!StrX1.equalsIgnoreCase("-Infinity"))
                        && (!StrX1.equalsIgnoreCase("+Infinity"))
                        && (!StrX1.equalsIgnoreCase("NaN"))
                        && (!StrX1.equalsIgnoreCase("-NaN"))
                        && (!StrX1.equalsIgnoreCase("+NaN"))) {
                    return false;
                }
                return true;
            }

            ExprSimpleStr parse() {
                StrExprStr = eatAll(str, ' ');
                ExprSimpleStr x = (() -> "");
                if (StrExprStr == null) {
                    return x;
                } else if (StrExprStr.length() >= 1) {
                    posExprStr = 0;
                    chExprStr = StrExprStr.charAt(0);
                } else if (StrExprStr.length() <= 0) {
                    return x;
                }
                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                    log.info("ExprSimpleStr:parseExprSimpleStr:Initial:StrExpr=" + StrExprStr);
                }
                if ((StrExprStr != null) && (StrExprStr.length() > 0)
                        && (StrExprStr.length() < 2)
                        && ((chExprStr == '*')
                        || (chExprStr == '/')
                        || (chExprStr == '^'))) {
                    return x;
                } else if ((chExprStr != 0) && (chExprStr != -1)) {
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
            ExprSimpleStr parseExpression() {
                ExprSimpleStr x = (() -> "");
                int ExprStartPos = posExprStr;
                int ExprEndPos = -1;
                if (posExprStr < 0) {
                    ExprStartPos = 0;
                }

                x = parseTerm();
                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                    log.info("ExprSimpleStr:parseExpression:Initial:x.eval=" + x.evalStr());
                }
                for (;;) {
                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                        log.info("ExprSimpleStr:parseExpression:Top:Inside Loop: parseExpression:chExprStr=" + (char) chExprStr + " pos=" + posExprStr);
                    }
                    if (eatExpr(')')) {
                        return x;
                    } else if ((eatExpr('+'))) {// addition
                        if (eatExpr('(')) {
                            ExprSimpleStr a = x, b = parseExpression();
                            x = (() -> a.evalStr() + b.evalStr());
                            eatExpr(')');
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:parseExpression:x.eval=" + x.evalStr() + " a.evalStr()=" + a.evalStr() + "+ b.evalStr()=" + b.evalStr());
                            }
                        } else {
                            ExprSimpleStr a = x, b = parseTerm();
                            if (ZeroTermSignFlag == true) {
                                if ((Double.isFinite(Double.parseDouble(a.evalStr()))) && (Double.isFinite(Double.parseDouble(b.evalStr())))) {
                                    x = (() -> "" + (-1.0 * Double.parseDouble(a.evalStr()) + Double.parseDouble(b.evalStr())));
                                } else {
                                    x = (() -> "" + Double.POSITIVE_INFINITY);
                                }
                                ZeroTermSignFlag = false;
                            } else {
                                if ((Double.isFinite(Double.parseDouble(a.evalStr()))) && (Double.isFinite(Double.parseDouble(b.evalStr())))) {
                                    x = (() -> "" + ((Double) Double.parseDouble(a.evalStr()) + Double.parseDouble(b.evalStr())));
                                } else {
                                    x = (() -> "" + Double.POSITIVE_INFINITY);
                                }
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ExprSimpleStr:parseExpression:x.eval=" + x.evalStr() + " a.evalStr()=" + a.evalStr() + "+ b.evalStr()=" + b.evalStr());
                            }
                        }
                    } else if ((eatExpr('-'))) { // subtraction
                        if (eatExpr('(')) {
                            ExprSimpleStr a = x, b = parseExpression();
                            x = (() -> "" + (Double) (Double.parseDouble(a.evalStr()) - Double.parseDouble(b.evalStr())));
                            eatExpr(')');
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:parseExpression:x.eval=" + x.evalStr() + " a.evalStr()=" + a.evalStr() + "- b.evalStr()=" + b.evalStr());
                            }
                        } else {
                            ExprSimpleStr a = x, b = parseTerm();
                            if (ZeroTermSignFlag == true) {
                                if ((Double.isFinite(Double.parseDouble(a.evalStr()))) && (Double.isFinite(Double.parseDouble(b.evalStr())))) {
                                    x = (() -> "" + (Double) (-1.0 * (Double) Double.parseDouble(a.evalStr()) - Double.parseDouble(b.evalStr())));
                                } else {
                                    x = (() -> "" + Double.POSITIVE_INFINITY);
                                }
                                ZeroTermSignFlag = false;
                            } else {
                                if ((Double.isFinite(Double.parseDouble(a.evalStr()))) && (Double.isFinite(Double.parseDouble(b.evalStr())))) {
                                    x = (() -> "" + (Double) (Double.parseDouble(a.evalStr()) - Double.parseDouble(b.evalStr())));
                                } else {
                                    x = (() -> "" + Double.POSITIVE_INFINITY);
                                }
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ExprSimpleStr:parseExpression:x.eval=" + x.evalStr() + " a.evalStr()=" + a.evalStr() + "- b.evalStr()=" + b.evalStr());
                            }
                        }

                    } else {
                        if ((posExprStr >= 0) && (posExprStr < StrExprStr.length())) {
                            ExprEndPos = posExprStr;
                        } else {
                            ExprEndPos = StrExprStr.length();
                        }
                        if ((ExprStartPos > ExprEndPos)) {
                            ExprEndPos = StrExprStr.length();
                        }
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("ExprSimpleStr:parseExpression:Return Value:x.eval=" + x.evalStr() + " Expr=" + StrExprStr.substring(ExprStartPos, ExprEndPos));
                        }
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Warn.level) {
                            log.warn("ExprSimpleStr:parseExpression:Return Value:x.eval=" + x.evalStr() + " Expr=" + StrExprStr.substring(ExprStartPos, ExprEndPos));
                        }
                        return x;
                    }
                }
            }

            ExprSimpleStr parseTerm() {
                int TermStartPos = posExprStr;
                int TermEndPos = -1;
                if (posExprStr < 0) {
                    TermStartPos = 0;
                }
                ExprSimpleStr x = parseFactor();
                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                    log.info("ExprSimpleStr:parseTerm:Initial:x.eval=" + x.evalStr());
                }
                for (;;) {
                    ExprSimpleStr a = x;
                    if (eatExpr('*')) { // multiplication
                        if (eatExpr('(')) {
                            ExprSimpleStr b = parseExpression();
                            x = (() -> "" + ((Double) Double.parseDouble(a.evalStr()) * Double.parseDouble(b.evalStr())));
                            eatExpr(')');
                        } else {
                            ExprSimpleStr b = parseFactor();
                            if ((Double.isFinite(Double.parseDouble(a.evalStr()))) && (Double.isFinite(Double.parseDouble(b.evalStr())))) {
                                x = (() -> "" + ((Double) Double.parseDouble(a.evalStr()) * Double.parseDouble(b.evalStr())));
                            } else {
                                x = (() -> "" + Double.POSITIVE_INFINITY);
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ExprSimpleStr:parseTerm:*:a.eval=" + a.evalStr());
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ExprSimpleStr:parseTerm:*:b.eval=" + b.evalStr());
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ExprSimpleStr:parseTerm:*:x.eval=" + x.evalStr() + " a.evalStr()=" + a.evalStr() + "* b.evalStr()=" + b.evalStr());
                            }
                            int temp = chExprStr;
                            nextCharExpr();
                            if (((chExprStr == '+') || (chExprStr == '-')) && (temp != '*') && (temp != '/')) {
                                posExprStr--;
                                chExprStr = temp;
                                return x;
                            } else if ((chExprStr != -1) && (chExprStr != 0)) {
                                posExprStr--;
                                chExprStr = temp;
                            }
                        }
                    } else if (eatExpr('/')) { // division
                        if (eatExpr('(')) {
                            ExprSimpleStr b = parseExpression();
                            x = (() -> "" + ((Double) Double.parseDouble(a.evalStr()) / Double.parseDouble(b.evalStr())));

                            eatExpr(')');
                        } else {
                            ExprSimpleStr b = parseFactor();
                            if ((Double.isFinite(Double.parseDouble(a.evalStr()))) && (Double.isFinite(Double.parseDouble(b.evalStr())))) {
                                x = (() -> "" + ((Double) Double.parseDouble(a.evalStr()) / Double.parseDouble(b.evalStr())));
                            } else {
                                x = (() -> "" + Double.POSITIVE_INFINITY);
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ExprSimpleStr:parseTerm:/:a.eval=" + a.evalStr());
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ExprSimpleStr:parseTerm:/:b.eval=" + b.evalStr());
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ExprSimpleStr:parseTerm:/:x.eval=" + x.evalStr() + " a.evalStr()=" + a.evalStr() + "/ b.evalStr()=" + b.evalStr());
                            }
                            int temp = chExprStr;
                            nextCharExpr();
                            if (((chExprStr == '+') || (chExprStr == '-')) && (temp != '*') && (temp != '/')) {
                                posExprStr--;
                                chExprStr = temp;
                                return x;
                            } else if ((chExprStr != -1) && (chExprStr != 0)) {
                                posExprStr--;
                                chExprStr = temp;
                            }
                        }
                    } else if (eatExpr('%')) { // Modulus
                        ExprSimpleStr b = parseFactor();
                        if ((Double.isFinite(Double.parseDouble(a.evalStr()))) && (Double.isFinite(Double.parseDouble(b.evalStr())))) {
                            x = (() -> "" + ((Double) Double.parseDouble(a.evalStr()) % Double.parseDouble(b.evalStr())));
                        } else {
                            x = (() -> "" + Double.POSITIVE_INFINITY);
                        }
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("ExprSimpleStr:parseTerm:%:a.eval=" + a.evalStr());
                        }
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("ExprSimpleStr:parseTerm:%:b.eval=" + b.evalStr());
                        }
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("ExprSimpleStr:parseTerm:%:x.eval=" + x.evalStr() + " a.evalStr()=" + a.evalStr() + "% b.evalStr()=" + b.evalStr());
                        }
                        int temp = chExprStr;
                        nextCharExpr();
                        if (((chExprStr == '+') || (chExprStr == '-')) && (temp != '*') && (temp != '/')) {
                            posExprStr--;
                            chExprStr = temp;
                            return x;
                        } else if ((chExprStr != -1) && (chExprStr != 0)) {
                            posExprStr--;
                            chExprStr = temp;
                        }
                    } else {
                        if ((posExprStr >= 0) && (posExprStr < StrExprStr.length())) {
                            TermEndPos = posExprStr;
                        } else {
                            TermEndPos = StrExprStr.length();
                        }
                        if ((TermStartPos > TermEndPos)) {
                            TermEndPos = StrExprStr.length();
                        }
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("ExprSimpleStr:parseTerm:Return Value:x.eval=" + x.evalStr() + " Term=" + StrExprStr.substring(TermStartPos, TermEndPos));
                        }
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Warn.level) {
                            log.warn("ExprSimpleStr:parseTerm:Return Value:x.eval=" + x.evalStr() + " Term=" + StrExprStr.substring(TermStartPos, TermEndPos));
                        }
                        return x;
                    }
                }
            }

            ExprSimpleStr parseFactor() {
                int FactorStartPos = posExprStr;
                int FactorEndPos = -1;
                if (posExprStr < 0) {
                    FactorStartPos = 0;
                }
                ExprSimpleStr x = parseBase();
                for (;;) {
                    if (eatExpr('^')) { // exponentiation
                        if (eatExpr('(')) {
                            ExprSimpleStr a = x, b = parseExpression();
                            x = (() -> "" + ((Double) Double.parseDouble(a.evalStr()) * Double.parseDouble(b.evalStr())));
                            eatExpr(')');
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ExprSimpleStr:parseFactor:x.eval=" + x.evalStr() + " Math.pow(a.evalStr()=" + a.evalStr() + "^ b.evalStr()=" + b.evalStr() + ")");
                            }
                        } else {
                            ExprSimpleStr a = x, b = parseBase();
                            if ((Double.isFinite(Double.parseDouble(a.evalStr()))) && (Double.isFinite(Double.parseDouble(b.evalStr())))) {
                                x = (() -> "" + Math.pow(Double.parseDouble(a.evalStr()), Double.parseDouble(b.evalStr())));
                            } else {
                                x = (() -> "" + Double.POSITIVE_INFINITY);
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ExprSimpleStr:parseFactor:x.eval=" + x.evalStr() + " Math.pow(a.evalStr()=" + a.evalStr() + "^ b.evalStr()=" + b.evalStr() + ")");
                            }
                        }
                    } else {
                        if ((posExprStr >= 0) && (posExprStr < StrExprStr.length())) {
                            FactorEndPos = posExprStr;
                        } else {
                            FactorEndPos = StrExprStr.length();
                        }
                        if ((FactorStartPos > FactorEndPos)) {
                            FactorEndPos = StrExprStr.length();
                        }
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("ExprSimpleStr:parseFactor:FactorStartPos=" + FactorStartPos + " FactorEndPos=" + FactorEndPos);
                        }
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("ExprSimpleStr:parseFactor:Return Value:x.eval=" + x.evalStr() + " Factor=" + StrExprStr.substring(FactorStartPos, FactorEndPos));
                        }
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Warn.level) {
                            log.warn("ExprSimpleStr:parseFactor:Return Value:x.eval=" + x.evalStr() + " Factor=" + StrExprStr.substring(FactorStartPos, FactorEndPos));
                        }
                        return x;
                    }
                }
            }

            ExprSimpleStr parseBase() {
                int startPos = posExprStr;
                ExprSimpleStr x = (() -> "");
                if (posExprStr >= StrExprStr.length()) {
                    posExprStr = -1;
                    chExprStr = -1;
                    return x;
                }
                if ((eatExpr('-')) && (startPos != 0)) { // unary minus
                    ExprSimpleStr b = parseBase();
                    x = (() -> "" + ((Double) (-1.0) * Double.parseDouble(b.evalStr())));
                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                        log.info("ExprSimpleStr:parseBase:-:Return Value:x.eval=" + x.evalStr() + " startPos=" + startPos);
                    }
                    return x;
                } else if (eatExpr('+')) { // unary plus
                    x = parseBase();
                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                        log.info("ExprSimpleStr:parseBase:+:Return Value:x.eval=" + x.evalStr());
                    }
                    return x;
                }

                if (eatExpr('(')) { //parentheses
                    //Code to handle Expressions:
                    int POpos = posExprStr;
                    do {
                        posExprStr--;
                    } while ((posExprStr >= 0) && (posExprStr < StrExprStr.length()) && (!IsOperator(StrExprStr.charAt(posExprStr))));
                    if ((posExprStr >= 0) && (posExprStr < StrExprStr.length())) {
                        ParenthesisOperator = StrExprStr.charAt(posExprStr);
                    } else {
                        ParenthesisOperator = '+';
                    }
                    posExprStr = POpos;
                    x = parseExpression();
                    eatExpr(')');
                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                        log.info("ExprSimpleStr:parseBase:(:Return Value:x.eval=" + x.evalStr());
                    }
                    return x;
                } else if (IsNumber(chExprStr)) { //numbers
                    while (IsNumber(chExprStr)) {
                        nextCharExpr();
                        if ((chExprStr == 'E') || (chExprStr == 'e')) {
                            nextCharExpr();
                            if ((chExprStr == '-') || (chExprStr == '+')) {
                                nextCharExpr();
                            }
                        }
                    }
                    double xx = 1.0;
                    if ((StrExprStr != null) && (!StrExprStr.equalsIgnoreCase("")) && (!StrExprStr.equalsIgnoreCase("NaN")) && (posExprStr <= StrExprStr.length()) && (startPos <= (StrExprStr.length() - 1))) {
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("ExprSimpleStr:parseBase: Number=" + StrExprStr.substring(startPos, posExprStr));
                        }
                        if ((IsAConstantNumber(StrExprStr.substring(startPos, posExprStr), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                            xx = Double.parseDouble(StrExprStr.substring(startPos, posExprStr));
                        }
                    } else {
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("ExprSimpleStr:parseBase:NaN:Exp Form: Number=" + StrExprStr.substring(startPos, posExprStr));
                        }
                        //xx=Double.parseDouble(String.format("%.12f"+StrRemoveEDbl(Str.substring(startPos, pos)) ) );
                        xx = Double.NaN;
                        posExprStr = -1;
                        chExprStr = -1;
                    }
                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                        log.info("ExprSimpleStr:parseBase:Number:Return Value:x.eval=" + x.evalStr() + " xx=" + xx);
                    }
                    final Double XX = xx;
                    x = () -> "" + XX;
                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                        log.info("ExprSimpleStr:parseBase:Number:Return Value:x.eval=" + x.evalStr() + " xx=" + xx);
                    }
                    return x;
                } else if (IsVariable(chExprStr)) {//functions & variables
                    while ((IsVariable(chExprStr)) || (IsNumber(chExprStr))) {
                        nextCharExpr();
                    }
                    if ((startPos == 0) && (StrExprStr.charAt(startPos) == '-')) {
                        startPos++;
                        ZeroTermSignFlag = true;
                    }
                    String name = StrExprStr.substring(startPos, posExprStr).trim();
                    if (functions.containsKey(name)) {
                        DoubleUnaryOperator func = functions.get(name);
                        nextCharExpr();//get open braces
                        ExprSimpleStr arg = parseExpression();
                        x = () -> "" + func.applyAsDouble(Double.parseDouble(arg.evalStr()));
                        if (chExprStr == ')') {
                            nextCharExpr();
                        }
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("ExprSimpleStr:parseBase: Function: name=" + name + " x.evalStr()=" + x.evalStr() + " arg.evalStr()=" + arg.evalStr() + " startPos=" + startPos);
                        }
                    } else {
                        if ((name != null) && (!name.equalsIgnoreCase("")) && (!name.equalsIgnoreCase("NaN")) && (!name.equalsIgnoreCase("Infinity")) && (variables.get(name) != null)) {
                            x = () -> variables.get(name);
                        } else if (name.equalsIgnoreCase("Infinity")) {
                            x = () -> "" + Double.POSITIVE_INFINITY;
                        } else if (name.equalsIgnoreCase("Nan")) {
                            x = () -> "" + Double.NaN;
                        }
                    }
                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                        log.info("ExprSimpleStr:parseBase: Variable: name=" + name + " x.evalStr()=" + x.evalStr() + " startPos=" + startPos);
                    }
                    return x;
                } else if (chExprStr == ')') {
                    nextCharExpr();
                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                        log.info("ExprSimpleStr:parseBase:):Return Value:x.eval=" + x.evalStr());
                    }
                    return x;
                } else {
                    if (((IsNotAnOperator(chExprStr)) && ((!IsNumber(chExprStr)) && (!IsVariable(chExprStr)))) && (chExprStr != 0) && (chExprStr != -1) && (chExprStr != '(')) {
                        if ((StrExprStr != null) && (startPos < StrExprStr.length()) && (startPos < posExprStr) && (chExprStr != -1) && (chExprStr != 0)) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "ConformalStr:parseBase:Unexpected: " + (char) chExprStr + " int=" + (int) chExprStr + " Cannot Format:" + StrExprStr.substring(posExprStr, StrExprStr.length()));
                        } else if ((chExprStr != -1) && (chExprStr != 0) && (posExprStr >= 1) && (posExprStr < StrExprStr.length()) && (IsNumber(chExprStr))) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "ConformalStr:parseBase:Please Check Code:Should not reach Here:Unexpected: " + (char) chExprStr + " int=" + (int) chExprStr + " Cannot Format:" + StrExprStr.substring(posExprStr, StrExprStr.length()));
                        } else if ((chExprStr != -1) && (chExprStr != 0) && (posExprStr >= 1) && (posExprStr < StrExprStr.length()) && (IsOperator(chExprStr))) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "ConformalStr:parseBase:Please Check Equation Operators / Code:Should not reach Here:Unexpected: " + (char) chExprStr + " int=" + (int) chExprStr + " Cannot Format:" + StrExprStr.substring(posExprStr, StrExprStr.length()));
                        } else if ((chExprStr != -1) && (chExprStr != 0) && (posExprStr >= 1) && (posExprStr < StrExprStr.length())) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "ConformalStr:parseBase:Unexpected: " + (char) chExprStr + " int=" + (int) chExprStr + " Cannot Format:" + StrExprStr.substring(posExprStr, StrExprStr.length()));
                        } else {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "ConformalStr:parseBase:Unexpected char: " + (char) chExprStr + " int=" + (int) chExprStr + " Cannot Format:" + StrExprStr.substring(posExprStr, StrExprStr.length()));
                        }
                    }
                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                        log.info("ExprSimpleStr:parseBase:Exception:Return Value:x.eval=" + x.evalStr());
                    }
                    return x;
                }
            }
        }.parse();
    }

    //Created by Rajesh Pai
    // 
    @FunctionalInterface
    public interface SimpleStr {

        String evalStr();
    }

    public static SimpleStr parseSimple(String str, Map<String, String> variables, String DiffWithRespTo, String Silent, ExprSimpleStrSep.LogLevel MyLogLevel) {

        return new Object() {
            // Expression Term character Index and Character Variable    
            int posExprStr = -1, chExprStr;
            String StrExprStr;

            void nextCharExpr() {
                ++posExprStr;
                chExprStr = (posExprStr < StrExprStr.length()) ? StrExprStr.charAt(posExprStr) : -1;
                if ((chExprStr == -1) && (posExprStr >= StrExprStr.length())) {
                    posExprStr = StrExprStr.length();
                } else if ((chExprStr == -1) || ((chExprStr == 0))) {
                    throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "nextChar:nextChar:Unexpected: " + (char) chExprStr + " int=" + (int) chExprStr + " Cannot Format:" + StrExprStr.substring(posExprStr, StrExprStr.length()));
                }
            }

            void prevCharExpr() {
                --posExprStr;
                chExprStr = (posExprStr >= 0) ? StrExprStr.charAt(posExprStr) : -1;
                if ((chExprStr == -1) && (posExprStr < 0)) 
            ; else if ((chExprStr == -1) || ((chExprStr == 0))) {
                    throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "prevChar:prevChar:Unexpected: " + (char) chExprStr + " int=" + (int) chExprStr + " Cannot Format:" + StrExprStr.substring(posExprStr, StrExprStr.length()));
                }
            }

            boolean eatExpr(int CharToEat) {
                while (chExprStr == ' ') {
                    nextCharExpr();
                }
                if (chExprStr == CharToEat) {
                    nextCharExpr();
                    return true;
                }
                return false;
            }

            boolean IsAConstant(String StrX1, String DiffWithRespTo) {

                try {
                    StrIsAConstant = "Unknown";
                    String StrX = StrX1;
                    //log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant);
                    //log.info("IsAConstant:StrX=" + StrX);
                    //log.info("IsAConstant:DiffWithRespTo=" + DiffWithRespTo);
//            if ((StrX != null)
//                    && (!StrX.equalsIgnoreCase(""))
//                    && (!StrX.contains(DiffWithRespTo))
//                    && (StrX.matches("[-+]+"))) {
//                StrIsAConstant = "Number";
//                log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant);
//                return true;
//            } else 
                    if ((StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (!StrX.contains(DiffWithRespTo))
                            && (StrX.matches("[\\-\\+]*[0-9\\.]+"))
                            //&& (!StrX.matches("[\\-\\+]*[a-zA-Z0-9]+"))
                            && (Double.isFinite(Double.valueOf(StrX)))) {
                        StrIsAConstant = "Number";
                        //log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                        return true;
                    } else if ((StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (!StrX.contains(DiffWithRespTo))
                            && (StrX.matches("[\\+\\-\\*/]*[a-zA-Z0-9]+"))) {
                        StrIsAConstant = "IndConstant";
                        //log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                        return false;
                    } else if ((StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (!StrX.contains(DiffWithRespTo))
                            && (StrX.matches("[\\-\\+\\*/]*[0-9\\.]+"))) {
                        StrIsAConstant = "NumberExpression";
                        //log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                        return true;
                    } else if ((StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (!StrX.equalsIgnoreCase(DiffWithRespTo))
                            && (!StrX.contains(DiffWithRespTo))
                            && (StrX.matches("[\\+\\-\\*/]*[a-zA-Z0-9\\.]+[\\^]*[0-9\\.]+"))) {
                        StrIsAConstant = "IndConstantExpression";
                        //log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                        return false;
                    } else if ((StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (StrX.equalsIgnoreCase(DiffWithRespTo))
                            && (StrX.matches("[\\+\\-\\*\\^/]*[a-zA-Z0-9]+"))) {
                        StrIsAConstant = "Var";
                        //log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                        return false;
                    } else if ((StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && ((StrX.equalsIgnoreCase(DiffWithRespTo)) //|| ((StrX.contains(DiffWithRespTo)) && ((!StrX.contains(DiffWithRespTo + "^"))))
                            )
                            && (StrX.matches("[\\+\\-\\*\\^/]*[a-zA-Z0-9]+"))) {
                        StrIsAConstant = "Var";
                        //log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                        return false;
                    } else if ((StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (StrX.contains(DiffWithRespTo))) {
                        StrIsAConstant = "VarExpression";
                        //log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                        return false;
                    } else if ((StrIsAConstant.equalsIgnoreCase("Unknown")) && (StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (!StrX.contains(DiffWithRespTo))
                            && ((StrX.contains("E-")) || (StrX.contains("E+")) || (StrX.contains("e+")) || (StrX.contains("e-")))
                            && (Double.isFinite(Double.valueOf(StrX)))) {
                        StrIsAConstant = "Number";
                        //log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                        return true;
                    } else if (StrIsAConstant.equalsIgnoreCase("Unknown") && (StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (StrX.matches("[\\+\\-]*[a-zA-Z0-9\\.]+"))
                            && (StrX.matches(DiffWithRespTo))) {
                        StrIsAConstant = "VarExpression";
                        //log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                        return false;
                    } else if ((StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (!StrX.contains(DiffWithRespTo))
                            && ((StrX.matches("[\\+\\-]*[0-9\\.\\+\\-\\*\\^/]+[0-9\\.\\+\\-*\\^/]*"))
                            || (StrX.matches("[\\+\\-]*[0-9\\.\\*/]*\\^[0-9\\.\\*\\^/]+")))) {
                        StrIsAConstant = "NumberExpression";
                        //log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                        return true;
                    } else if ((StrIsAConstant.equalsIgnoreCase("Unknown") && (StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && ((StrX.matches("[\\+\\-]*[a-zA-Z0-9\\.\\*\\^/]+[\\+\\-]*[0-9\\.]*"))
                            || (StrX.matches("[\\+\\-]*[0-9\\.\\*/]*\\^[a-zA-Z0-9\\.\\*\\^/]+"))))) {
                        StrIsAConstant = "IndConstantExpression";
                        //log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                        return false;
                    }
                } catch (NumberFormatException ConstExp) {
                    log.info("IsAConstant:Exception:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                }
                //log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                return false;
            }

            boolean IsExtremity(String StrX1) {
                if ((!StrX1.equalsIgnoreCase("Infinity"))
                        && (!StrX1.equalsIgnoreCase("-Infinity"))
                        && (!StrX1.equalsIgnoreCase("+Infinity"))
                        && (!StrX1.equalsIgnoreCase("NaN"))
                        && (!StrX1.equalsIgnoreCase("-NaN"))
                        && (!StrX1.equalsIgnoreCase("+NaN"))) {
                    return false;
                }
                return true;
            }

            boolean IsAConstNumPermut0p0(SimpleStr a, SimpleStr b) {
                boolean Flag = false;
                StrIsAConstant = "Unknown";
                log.info("IsAConstNumPermut0p0:Entry:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag + " a=" + a.evalStr() + " b=" + b.evalStr());
                if ((IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("NumberExpression")))
                        && ((IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")))
                        && (b.evalStr().equalsIgnoreCase("0.0"))) {
                    Flag = true;
                    log.info("IsAConstNumPermut0p0:FSM1:Num:Number:0.0:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                } else if ((!IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("VarExpression")))
                        && ((IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")))
                        && (b.evalStr().equalsIgnoreCase("0.0"))) {
                    Flag = true;
                    log.info("IsAConstNumPermut0p0:FSM2:VarExpression:Number:0.0:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                } else if ((!IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))
                        && ((IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")))
                        && (b.evalStr().equalsIgnoreCase("0.0"))) {
                    Flag = true;
                    log.info("IsAConstNumPermut0p0:FSM3:IndConstantExpression:Number:0.0:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                }
                return Flag;
            }

            boolean IsAConstNumPermuta1p0(SimpleStr a, SimpleStr b) {
                boolean Flag = false;
                StrIsAConstant = "Unknown";
                log.info("IsAConstNumPermuta1p0:Entry:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag + " a=" + a.evalStr() + " b=" + b.evalStr());
                if ((IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Number")))
                        && ((!IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Var")))
                        && (a.evalStr().equalsIgnoreCase("1.0"))) {
                    Flag = true;
                    log.info("IsAConstNumPermuta1p0:FSM1:Num:Var:1.0:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                } else if ((IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Number")))
                        && ((!IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("VarExpression")))
                        && (a.evalStr().equalsIgnoreCase("1.0"))) {
                    Flag = true;
                    log.info("IsAConstNumPermuta1p0:FSM2:Number:VarExpression:1.0:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                } else if ((IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Number")))
                        && ((!IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant")))
                        && (a.evalStr().equalsIgnoreCase("1.0"))) {
                    Flag = true;
                    log.info("IsAConstNumPermuta1p0:FSM3:Num:IndConstant:1.0:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                } else if ((IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Number")))
                        && ((!IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))
                        && (a.evalStr().equalsIgnoreCase("1.0"))) {
                    Flag = true;
                    log.info("IsAConstNumPermuta1p0:FSM4:Number:IndConstantExpression:1.0:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                }
                return Flag;
            }

            boolean IsAConstNumPermut1p0(SimpleStr a, SimpleStr b) {
                boolean Flag = false;
                StrIsAConstant = "Unknown";
                log.info("IsAConstNumPermut1p0:Entry:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag + " a=" + a.evalStr() + " b=" + b.evalStr());
                if ((IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("NumberExpression")))
                        && ((IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")))
                        && (b.evalStr().equalsIgnoreCase("1.0"))) {
                    Flag = true;
                    log.info("IsAConstNumPermut1p0:FSM1:Num:Number:1.0:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                } else if ((!IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Var")))
                        && ((IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")))
                        && (b.evalStr().equalsIgnoreCase("1.0"))) {
                    Flag = true;
                    log.info("IsAConstNumPermut1p0:FSM2:Var:Number:1.0:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                } else if ((!IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("VarExpression")))
                        && ((IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")))
                        && (b.evalStr().equalsIgnoreCase("1.0"))) {
                    Flag = true;
                    log.info("IsAConstNumPermut1p0:FSM2:VarExpression:Number:1.0:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                } else if ((!IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("IndConstant")))
                        && ((IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")))
                        && (b.evalStr().equalsIgnoreCase("1.0"))) {
                    Flag = true;
                    log.info("IsAConstNumPermut1p0:FSM3:IndConstant:Number:1.0:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                } else if ((!IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))
                        && ((IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")))
                        && (b.evalStr().equalsIgnoreCase("1.0"))) {
                    Flag = true;
                    log.info("IsAConstNumPermut1p0:FSM3:IndConstantExpression:Number:0.0:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                }
                return Flag;
            }

            boolean IsAConstPermut(SimpleStr a, SimpleStr b) {
                boolean Flag = false;
                StrIsAConstant = "Unknown";
                log.info("IsAConstPermut:Entry:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag + " a=" + a.evalStr() + " b=" + b.evalStr());
                if ((IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Number")))
                        && ((!IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Var")))) {
                    Flag = true;
                    log.info("IsAConstPermut:FSM1:Num:Var:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                } else if ((!IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Var")))
                        && ((IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")))) {
                    Flag = true;
                    log.info("IsAConstPermut:FSM2:Var:Num:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                } else if ((IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Number")))
                        && ((!IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant")))) {
                    log.info("IsAConstPermut:FSM3:Num:IndConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("IndConstant")))
                        && ((IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")))) {
                    log.info("IsAConstPermut:FSM4:IndConstant:Num:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Var")))
                        && ((!IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant")))) {
                    log.info("IsAConstPermut:FSM5:Var:IndConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("IndConstant")))
                        && ((!IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Var")))) {
                    log.info("IsAConstPermut:FSM6:IndConstant:Var:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("IndConstant")))
                        && ((!IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant")))) {
                    log.info("IsAConstPermut:FSM7:IndConstant:IndConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Var")))
                        && ((!IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Var")))) {
                    log.info("IsAConstPermut:FSM8:Var:Var:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                }
                return Flag;
            }

            boolean IsAConstPermutExpr(SimpleStr a, SimpleStr b) {
                boolean Flag = false;
                StrIsAConstant = "Unknown";
                log.info("IsAConstPermutExpr:Entry:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag + " a=" + a.evalStr() + " b=" + b.evalStr());
                if ((IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Number")))
                        && ((!IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Var")))) {
                    Flag = true;
                    log.info("IsAConstPermutExpr:FSM1:Num:Var:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                } else if ((!IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Var")))
                        && ((IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")))) {
                    Flag = true;
                    log.info("IsAConstPermutExpr:FSM2:Var:Num:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                } else if ((!IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("VarExpression")))
                        && ((IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")))) {
                    Flag = true;
                    log.info("IsAConstPermutExpr:FSM3:VarExpression:Number:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                } else if ((IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("NumberExpression")))
                        && ((!IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
                    Flag = true;
                    log.info("IsAConstPermutExpr:FSM4:Num:Var:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                } else if ((!IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("VarExpression")))
                        && ((IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("NumberExpression")))) {
                    Flag = true;
                    log.info("IsAConstPermutExpr:FSM5:Var:Num:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                } else if ((IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("NumberExpression")))
                        && ((!IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstanExpressiont")))) {
                    log.info("IsAConstPermutExpr:FSM6:Num:IndConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))
                        && ((IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("NumberExpression")))) {
                    log.info("IsAConstPermutExpr:FSM7:IndConstant:Num:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("VarExpression")))
                        && ((!IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                    log.info("IsAConstPermutExpr:FSM8:Var:IndConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))
                        && ((!IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
                    log.info("IsAConstPermutExpr:FSM9:IndConstantExpression:VarExpression:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("VarExpression")))
                        && ((!IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
                    log.info("IsAConstPermutExpr:FSM10:VarExpression:VarExpression:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))
                        && ((!IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                    log.info("IsAConstPermutExpr:FSM11:IndConstantExpression:IndConstantExpression:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("VarExpression")))
                        && ((!IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                    log.info("IsAConstPermutExpr:FSM12:VarExpression:IndConstantExpression:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))
                        && ((!IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
                    log.info("IsAConstPermutExpr:FSM13:IndConstantExpression:VarExpression:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("VarExpression")))
                        && ((!IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Var")))) {
                    log.info("IsAConstPermutExpr:FSM14:VarExpression:Var:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))
                        && ((!IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant")))) {
                    log.info("IsAConstPermutExpr:FSM15:IndConstantExpression:IndConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("VarExpression")))
                        && ((!IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant")))) {
                    log.info("IsAConstPermutExpr:FSM16:VarExpression:IndConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))
                        && ((!IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Var")))) {
                    log.info("IsAConstPermutExpr:FSM17:IndConstantExpression:Var:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("VarExpression")))
                        && ((IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")))) {
                    log.info("IsAConstPermutExpr:FSM18:VarExpression:Number:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))
                        && ((IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")))) {
                    log.info("IsAConstPermutExpr:FSM19:IndConstantExpression:Number:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Number")))
                        && ((!IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
                    log.info("IsAConstPermutExpr:FSM20:Number:VarExpression:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Number")))
                        && ((!IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                    log.info("IsAConstPermutExpr:FSM21:Number:IndConstantExpression:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("IndConstant")))
                        && ((!IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
                    log.info("IsAConstPermutExpr:FSM22:IndConstant:VarExpression:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))
                        && ((!IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
                    log.info("IsAConstPermutExpr:FSM23:IndConstantExpression:VarExpression:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("VarExpression")))
                        && ((!IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
                    log.info("IsAConstPermutExpr:FSM24:VarExpression:VarExpression:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                }
                return Flag;
            }

            boolean IsAConstNumPermutUnkeUnk(SimpleStr a, SimpleStr b) {
                boolean Flag = false;
                StrIsAConstant = "Unknown";
                log.info("IsAConstNumPermutUnkeUnk:Entry:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag + " a=" + a.evalStr() + " b=" + b.evalStr());
                if ((!IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Unknown")))
                        && ((!IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                    log.info("IsAConstNumPermutUnkeUnk:FSM1:Unknown:IndConstantExpression:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Unknown")))
                        && ((!IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant")))) {
                    log.info("IsAConstNumPermutUnkeUnk:FSM2:Unknown:IndConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Unknown")))
                        && ((!IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
                    log.info("IsAConstNumPermutUnkeUnk:FSM3:Unknown:VarExpression:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Unknown")))
                        && ((!IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Var")))) {
                    log.info("IsAConstNumPermutUnkeUnk:FSM4:Unknown:VarExpression:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Unknown")))
                        && ((!IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Unknown")))) {
                    log.info("IsAConstNumPermutUnkeUnk:FSM5:Unknown:Unknown:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                }
                return Flag;
            }

            boolean IsAConstVarPermut1p0(SimpleStr a, SimpleStr b) {
                boolean Flag = false;
                StrIsAConstant = "Unknown";
                log.info("IsAConstVarPermut1p0:Entry:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag + " a=" + a.evalStr() + " b=" + b.evalStr());
                if ((IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("NumberExpression")))
                        && ((!IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Var")))
                        && (b.evalStr().equalsIgnoreCase(DiffWithRespTo))) {
                    Flag = true;
                    log.info("IsAConstVarPermut1p0:FSM1:Num:NumberExpression:DiffWithRespTo:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                } else if ((IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Number")))
                        && ((!IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Var")))
                        && (b.evalStr().equalsIgnoreCase(DiffWithRespTo))) {
                    Flag = true;
                    log.info("IsAConstVarPermut1p0:FSM2:Num:Number:DiffWithRespTo:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                }
                return Flag;
            }

            boolean IsAConstVarIndConst(SimpleStr a, SimpleStr b) {
                boolean Flag = false;
                StrIsAConstant = "Unknown";
                log.info("IsAConstVarIndConst:Entry:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag + " a=" + a.evalStr() + " b=" + b.evalStr());
                if ((IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("NumberExpression")))
                        && ((!IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant")))) {
                    Flag = true;
                    log.info("IsAConstVarIndConst:FSM1:NumberExpression:IndConstant:DiffWithRespTo:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                } else if ((IsAConstant(a.evalStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Number")))
                        && ((!IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant")))) {
                    Flag = true;
                    log.info("IsAConstVarIndConst:FSM2:Number:IndConstant:DiffWithRespTo:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                }
                return Flag;
            }

            SimpleStr parse() {
                StrExprStr = eatAll(str, ' ');
                SimpleStr x = (() -> "");
                if (StrExprStr == null) {
                    return x;
                } else if (StrExprStr.length() >= 1) {
                    posExprStr = 0;
                    chExprStr = StrExprStr.charAt(0);
                } else if (StrExprStr.length() <= 0) {
                    return x;
                }
                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                    log.info("ExprSimpleStr:parseExprSimpleStr:Initial:StrExpr=" + StrExprStr);
                }
                if ((StrExprStr != null) && (StrExprStr.length() > 0)
                        && (StrExprStr.length() < 2)
                        && ((chExprStr == '*')
                        || (chExprStr == '/')
                        || (chExprStr == '^'))) {
                    return x;
                } else if ((chExprStr != 0) && (chExprStr != -1)) {
                    x = parseExpression();
                    final String Temp1 = x.evalStr();
                    // Whole Term Ends Here so get the Conformal String
                    AlgebraicConfrmStr zConformal = parseConformal(Temp1, variables, DiffWithRespTo, Silent, ExprSimpleStrSep.LogLevel.Info);
                    x = (() -> zConformal.AlgebraicStr());

                }
                return x;
            }
            //Grammar:
            //expression = term | expression '+' term |expression '-' term
            //term = factor | term '*' factor | term '/' factor
            //factor = base | base ^ base
            //base = '-' base | '+' base | number | identifier |function expression | '(' expression ')'
            //

            SimpleStr parseExpression() {
                SimpleStr x = (() -> "");
                int ExprStartPos = posExprStr;
                int ExprEndPos = -1;
                if (posExprStr < 0) {
                    ExprStartPos = 0;
                }

                x = parseTerm();
                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                    log.info("SimpleStr:parseExpression:Initial:x.eval=" + x.evalStr());
                }
                for (;;) {
                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                        log.info("Expr:SimpleStr:Top:Inside Loop: parseExpression:chExprStr=" + (char) chExprStr + " pos=" + posExprStr + " StrExprStr=" + StrExprStr.substring(posExprStr));
                    }
                    if ((eatExpr('+'))) {// addition
                        if (/*(eatExpr('(')*/(chExprStr == '(')) {
                            final String StrX = x.evalStr();
                            SimpleStr a = (() -> StrX);
                            SimpleStr b = parseTerm();
                            final String StrA = a.evalStr();
                            final String StrB = b.evalStr();
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("SimpleStr:parseExpression:x.eval=" + x.evalStr() + " a.evalStr()=" + a.evalStr() + "- b.evalStr()=" + b.evalStr());
                            }
                            if ((IsAConstant(StrA, DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Number")))
                                    && ((IsAConstant(StrB, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")))) {
                                x = (() -> "" + ((Double) Double.parseDouble(StrA) + Double.parseDouble(StrB)));
                            } else if ((b.evalStr().equalsIgnoreCase("0.0")) && (IsAConstNumPermut0p0(a, b))) {
                                x = (() -> StrA);
                            } else if ((b.evalStr().equalsIgnoreCase("1.0")) && (IsAConstNumPermut1p0(a, b))) {
                                x = (() -> StrA + "+" + "1.0");
                            } else if (IsAConstPermut(a, b)) {
                                if (StrB.startsWith("-")) {
                                    x = (() -> StrA + StrB);
                                } else {
                                    x = (() -> StrA + "+" + StrB);
                                }
                            } else if (IsAConstPermutExpr(a, b)) {
                                if (StrB.startsWith("-")) {
                                    x = (() -> StrA + StrB);
                                } else {
                                    x = (() -> StrA + "+" + StrB);
                                }
                            } else if ((IsExtremity(StrA)) || (IsExtremity(StrB))) {
                                x = (() -> "" + Double.POSITIVE_INFINITY);
                            } else if (IsAConstNumPermutUnkeUnk(a, b)) {
                                if (StrB.startsWith("-")) {
                                    x = (() -> StrA + StrB);
                                } else {
                                    x = (() -> StrA + "+" + StrB);
                                }
                            } else if ((StrB.contains("(")) && (StrB.contains(")"))) {
                                x = (() -> a.evalStr() + "-" + StrB);
                            }
                            //eatExpr(')');
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("SimpleStr:parseExpression:x.eval=" + x.evalStr() + " a.evalStr()=" + a.evalStr() + "+ b.evalStr()=" + b.evalStr());
                            }
                        } else {
                            final String StrX = x.evalStr();
                            SimpleStr a = (() -> StrX);
                            SimpleStr b = parseTerm();
                            final String StrA = a.evalStr();
                            final String StrB = b.evalStr();
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("SimpleStr:parseExpression:x.eval=" + x.evalStr() + " a.evalStr()=" + a.evalStr() + "- b.evalStr()=" + b.evalStr());
                            }
                            if ((IsAConstant(StrA, DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Number")))
                                    && (IsAConstant(StrB, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))
                                    && (Double.isFinite(Double.parseDouble(StrA))) && (Double.isFinite(Double.parseDouble(StrB)))) {
                                x = (() -> "" + ((Double) Double.parseDouble(StrA) + Double.parseDouble(StrB)));
                            } else if ((b.evalStr().equalsIgnoreCase("0.0")) && (IsAConstNumPermut0p0(a, b))) {
                                x = (() -> StrA);
                            } else if ((b.evalStr().equalsIgnoreCase("1.0")) && (IsAConstNumPermut1p0(a, b))) {
                                x = (() -> StrA + "+" + "1.0");
                            } else if (IsAConstPermut(a, b)) {
                                if (StrB.startsWith("-")) {
                                    x = (() -> StrA + StrB);
                                } else {
                                    x = (() -> StrA + "+" + b.evalStr());
                                }
                            } else if (IsAConstPermutExpr(a, b)) {
                                if (StrB.startsWith("-")) {
                                    x = (() -> StrA + StrB);
                                } else {
                                    x = (() -> StrA + "+" + StrB);
                                }
                            } else if ((IsExtremity(StrA)) || (IsExtremity(StrB))) {
                                x = (() -> "" + Double.POSITIVE_INFINITY);
                            } else if (IsAConstNumPermutUnkeUnk(a, b)) {
                                if (StrB.startsWith("-")) {
                                    x = (() -> StrA + StrB);
                                } else {
                                    x = (() -> StrA + "+" + StrB);
                                }
                            } else if ((StrB.contains("(")) && (StrB.contains(")"))) {
                                x = (() -> a.evalStr() + "-" + StrB);
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("SimpleStr:parseExpression:x.eval=" + x.evalStr() + " a.evalStr()=" + a.evalStr() + "+ b.evalStr()=" + b.evalStr());
                            }
                        }
                    } else if ((eatExpr('-'))) { // subtraction
                        if (/*(eatExpr('(')*/(chExprStr == '(')) {
                            final String StrX = x.evalStr();
                            SimpleStr a = (() -> StrX);
                            SimpleStr b = parseTerm();
                            final String StrA = a.evalStr();
                            final String StrB = b.evalStr();
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("SimpleStr:parseExpression:x.eval=" + x.evalStr() + " a.evalStr()=" + a.evalStr() + "- b.evalStr()=" + b.evalStr());
                            }
                            if ((IsAConstant(StrA, DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Number")))
                                    && (IsAConstant(StrB, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))
                                    && (Double.isFinite(Double.parseDouble(StrA))) && (Double.isFinite(Double.parseDouble(StrB)))) {
                                x = (() -> "" + (Double) (Double.parseDouble(StrA) - Double.parseDouble(StrB)));
                            } else if ((b.evalStr().equalsIgnoreCase("0.0")) && (IsAConstNumPermut0p0(a, b))) {
                                x = (() -> StrA);
                            } else if ((b.evalStr().equalsIgnoreCase("1.0")) && (IsAConstNumPermut1p0(a, b))) {
                                x = (() -> StrA + "-" + "1.0");
                            } else if (IsAConstPermut(a, b)) {
                                if (StrB.startsWith("-")) {
                                    String Temp = StrB.replaceFirst("-", "");
                                    x = (() -> StrA + "+" + Temp);
                                } else {
                                    x = (() -> StrA + "-" + StrB);
                                }
                            } else if (IsAConstPermutExpr(a, b)) {
                                if (StrB.startsWith("-")) {
                                    String Temp = StrB.replaceFirst("-", "");
                                    x = (() -> StrA + "+" + Temp);
                                } else {
                                    x = (() -> StrA + "-" + StrB);
                                }
                            } else if ((IsExtremity(StrA)) || (IsExtremity(StrB))) {
                                x = (() -> "" + Double.POSITIVE_INFINITY);
                            } else if (IsAConstNumPermutUnkeUnk(a, b)) {
                                if (StrB.startsWith("-")) {
                                    String Temp = StrB.replaceFirst("-", "");
                                    x = (() -> StrA + "+" + Temp);
                                } else {
                                    x = (() -> StrA + "-" + StrB);
                                }
                            } //eatExpr(')');
                            else if ((StrB.contains("(")) && (StrB.contains(")"))) {
                                x = (() -> a.evalStr() + "-" + StrB);
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("SimpleStr:parseExpression:x.eval=" + x.evalStr() + " a.evalStr()=" + a.evalStr() + "- b.evalStr()=" + b.evalStr());
                            }
                        } else {
                            final String StrX = x.evalStr();
                            SimpleStr a = (() -> StrX);
                            SimpleStr b = parseTerm();
                            final String StrA = a.evalStr();
                            final String StrB = b.evalStr();
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("SimpleStr:parseExpression:x.eval=" + x.evalStr() + " a.evalStr()=" + a.evalStr() + "- b.evalStr()=" + b.evalStr());
                            }
                            if ((IsAConstant(StrA, DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Number")))
                                    && (IsAConstant(StrB, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))
                                    && (Double.isFinite(Double.parseDouble(StrA))) && (Double.isFinite(Double.parseDouble(StrB)))) {
                                x = (() -> "" + (Double) (Double.parseDouble(StrA) - Double.parseDouble(StrB)));
                            } else if ((StrB.equalsIgnoreCase("0.0")) && (IsAConstNumPermut0p0(a, b))) {
                                x = (() -> StrA);
                            } else if ((StrB.equalsIgnoreCase("1.0")) && (IsAConstNumPermut1p0(a, b))) {
                                x = (() -> StrA + "-" + "1.0");
                            } else if (IsAConstPermut(a, b)) {
                                if (StrB.startsWith("-")) {
                                    String Temp = StrB.replaceFirst("-", "");
                                    x = (() -> StrA + "+" + Temp);
                                } else {
                                    x = (() -> StrA + "-" + StrB);
                                }
                            } else if (IsAConstPermutExpr(a, b)) {
                                if (StrB.startsWith("-")) {
                                    String Temp = StrB.replaceFirst("-", "");
                                    x = (() -> StrA + "+" + Temp);
                                } else {
                                    x = (() -> StrA + "-" + StrB);
                                }
                            } else if ((IsExtremity(StrA)) || (IsExtremity(StrB))) {
                                x = (() -> "" + Double.POSITIVE_INFINITY);
                            } else if (IsAConstNumPermutUnkeUnk(a, b)) {
                                if (StrB.startsWith("-")) {
                                    String Temp = StrB.replaceFirst("-", "");
                                    x = (() -> a.evalStr() + "+" + Temp);
                                } else {
                                    x = (() -> a.evalStr() + "-" + StrB);
                                }
                            } else if ((StrB.contains("(")) && (StrB.contains(")"))) {
                                x = (() -> a.evalStr() + "-" + StrB);
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("SimpleStr:parseExpression:x.eval=" + x.evalStr() + " a.evalStr()=" + a.evalStr() + "- b.evalStr()=" + b.evalStr());
                            }
                        }
                    } else {
                        if ((posExprStr >= 0) && (posExprStr < StrExprStr.length())) {
                            ExprEndPos = posExprStr;
                        } else {
                            ExprEndPos = StrExprStr.length();
                        }
                        if ((ExprStartPos > ExprEndPos)) {
                            ExprEndPos = StrExprStr.length();
                        }
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("SimpleStr:parseExpression:Return Value:x.eval=" + x.evalStr() + " Expr=" + StrExprStr.substring(ExprStartPos, ExprEndPos));
                        }
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Warn.level) {
                            log.warn("SimpleStr:parseExpression:Return Value:x.eval=" + x.evalStr() + " Expr=" + StrExprStr.substring(ExprStartPos, ExprEndPos));
                        }
                        return x;
                    }
                }
            }

            SimpleStr parseTerm() {
                SimpleStr x = (() -> "");
                int TermStartPos = posExprStr;
                int TermEndPos = -1;
                if (posExprStr < 0) {
                    TermStartPos = 0;
                }
                if (chExprStr == '(') {
                    eatExpr('(');
                    x = parseExpression();
                    if (chExprStr == ')') {
                        eatExpr(')');
                    }
                } else {
                    x = parseFactor();
                }
                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                    log.info("SimpleStr:parseTerm:Initial:x.eval=" + x.evalStr());
                }
                for (;;) {
                    if (eatExpr('*')) { // multiplication
                        if (eatExpr('(')) {
                            final String StrX = x.evalStr();
                            SimpleStr a = (() -> StrX);
                            SimpleStr b = parseExpression();
                            final String StrA = StrX;
                            final String StrB1 = b.evalStr();
                            String StrB2 = "";
                            boolean AlreadyMappedFlag = false;
                            if ((StrB1.contains("+")) || (StrB1.contains("-"))) {
                                StrB2 = "(" + StrB1 + ")";
                            } else {
                                StrB2 = StrB1;
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("SimpleStr:parseTerm:*:Expr:a.eval=" + a.evalStr());
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("SimpleStr:parseTerm:*:Expr:b.eval=" + b.evalStr());
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("SimpleStr:parseTerm:*:Expr:x.eval=" + x.evalStr() + " a.evalStr()=" + a.evalStr() + "* b.evalStr()=" + b.evalStr());
                            }
                            final String StrB = StrB2;
                            if ((IsAConstant(StrA, DiffWithRespTo))
                                    && ((StrIsAConstant.equalsIgnoreCase("Number"))
                                    || (StrIsAConstant.equalsIgnoreCase("NumberExpression")))
                                    && (IsAConstant(StrB, DiffWithRespTo))
                                    && ((StrIsAConstant.equalsIgnoreCase("Number")))
                                    || (StrIsAConstant.equalsIgnoreCase("NumberExpression"))) {
                                //x = (() -> "" + ((Double) Double.parseDouble(a.evalStr()) / Double.parseDouble(b.evalStr())));
                                x = (() -> "" + StrA + "*" + StrB);
                                AlreadyMappedFlag = true;
                            } else if ((IsAConstNumPermut0p0(a, b)) && (StrB.equalsIgnoreCase("0.0"))) {
                                x = (() -> StrA + "*" + StrB);
                                AlreadyMappedFlag = true;
                            } else if ((IsAConstNumPermut1p0(a, b)) && (StrB.equalsIgnoreCase("1.0"))) {
                                x = (() -> StrA);
                                AlreadyMappedFlag = true;
                            } else if (IsAConstNumPermuta1p0(a, b)) {
                                x = (() -> StrB);
                                AlreadyMappedFlag = true;
                                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                    log.info("SimpleStr:parseTerm:*:x.eval=" + x.evalStr() + " a.evalStr()=" + a.evalStr() + "* b.evalStr()=" + b.evalStr());
                                }
                            } else if (IsAConstPermut(a, b)) {
                                x = (() -> StrA + "*" + StrB);
                                AlreadyMappedFlag = true;
                                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                    log.info("SimpleStr:parseTerm:*:x.eval=" + x.evalStr() + " StrA=" + StrA + "* StrB=" + StrB);
                                }
                            } else if (IsAConstPermutExpr(a, b)) {
                                x = (() -> StrA + "*" + StrB);
                                AlreadyMappedFlag = true;
                            } else if ((IsExtremity(StrA)) || (IsExtremity(StrB))) {
                                x = (() -> "" + Double.POSITIVE_INFINITY);
                                AlreadyMappedFlag = true;
                            } else if (IsAConstNumPermutUnkeUnk(a, b)) {
                                x = (() -> StrA + "*" + StrB);
                                AlreadyMappedFlag = true;
                            } else if (IsAConstVarPermut1p0(a, b)) {
                                x = (() -> StrA + "*" + StrB);
                                AlreadyMappedFlag = true;
                            }
                            eatExpr(')');
                            if (AlreadyMappedFlag == true)
                                ; else {
                                x = (() -> StrA + "*" + StrB);
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("SimpleStr:parseTerm:*:Expr:a.eval=" + a.evalStr());
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("SimpleStr:parseTerm:*:Expr:b.eval=" + b.evalStr());
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("SimpleStr:parseTerm:*:Expr:x.eval=" + x.evalStr() + " a.evalStr()=" + a.evalStr() + "* b.evalStr()=" + b.evalStr());
                            }
                        } else {
                            final String StrX = x.evalStr();
                            SimpleStr a = (() -> StrX);
                            SimpleStr b = parseFactor();
                            final String StrA = StrX;
                            final String StrB = b.evalStr();
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("SimpleStr:parseTerm:*:a.eval=" + a.evalStr());
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("SimpleStr:parseTerm:*:b.eval=" + b.evalStr());
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("SimpleStr:parseTerm:*:x.eval=" + x.evalStr() + " a.evalStr()=" + a.evalStr() + "* b.evalStr()=" + b.evalStr());
                            }
                            if ((IsAConstant(StrA, DiffWithRespTo))
                                    && ((StrIsAConstant.equalsIgnoreCase("Number"))
                                    || (StrIsAConstant.equalsIgnoreCase("NumberExpression")))
                                    && (IsAConstant(StrB, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                                //x = (() -> "" + ((Double) Double.parseDouble(a.evalStr()) / Double.parseDouble(b.evalStr())));
                                x = (() -> "" + StrA + "*" + StrB);
                            } else if ((IsAConstNumPermut0p0(a, b)) && (StrB.equalsIgnoreCase("0.0"))) {
                                x = (() -> StrA + "*" + StrB);
                            } else if ((IsAConstNumPermut1p0(a, b)) && (StrB.equalsIgnoreCase("1.0"))) {
                                x = (() -> StrA);
                            } else if (IsAConstNumPermuta1p0(a, b)) {
                                x = (() -> StrB);
                            } else if (IsAConstPermut(a, b)) {
                                x = (() -> StrA + "*" + StrB);
                            } else if (IsAConstPermutExpr(a, b)) {
                                x = (() -> StrA + "*" + StrB);
                            } else if ((IsExtremity(StrA)) || (IsExtremity(StrB))) {
                                x = (() -> "" + Double.POSITIVE_INFINITY);
                            } else if (IsAConstNumPermutUnkeUnk(a, b)) {
                                x = (() -> StrA + "*" + StrB);
                            } else if (IsAConstVarPermut1p0(a, b)) {
                                x = (() -> StrA + "*" + StrB);
                            } else if (IsAConstVarIndConst(a, b)) {
                                x = (() -> StrA + "*" + StrB);
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("SimpleStr:parseTerm:*:a.eval=" + a.evalStr());
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("SimpleStr:parseTerm:*:b.eval=" + b.evalStr());
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("SimpleStr:parseTerm:*:x.eval=" + x.evalStr() + " a.evalStr()=" + a.evalStr() + "* b.evalStr()=" + b.evalStr());
                            }
                        }
                    } else if (eatExpr('/')) { // division
                        if (eatExpr('(')) {
                            final String StrX = x.evalStr();
                            SimpleStr a = (() -> StrX);
                            SimpleStr b = parseExpression();
                            final String StrA = StrX;
                            final String StrB1 = b.evalStr();
                            String StrB2 = "";
                            boolean AlreadyMappedFlag = true;
                            if ((StrB1.contains("+")) || (StrB1.contains("-"))) {
                                StrB2 = "(" + StrB1 + ")";
                            } else {
                                StrB2 = StrB1;
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("SimpleStr:parseTerm:/:Expr:a.eval=" + a.evalStr());
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("SimpleStr:parseTerm:/:Expr:b.eval=" + b.evalStr());
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("SimpleStr:parseTerm:/:Expr:x.eval=" + x.evalStr() + " a.evalStr()=" + a.evalStr() + "/ b.evalStr()=" + b.evalStr());
                            }
                            final String StrB = StrB2;
                            if ((IsAConstant(StrA, DiffWithRespTo))
                                    && ((StrIsAConstant.equalsIgnoreCase("Number"))
                                    || (StrIsAConstant.equalsIgnoreCase("NumberExpression")))
                                    && (IsAConstant(StrB, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                                //x = (() -> "" + ((Double) Double.parseDouble(a.evalStr()) / Double.parseDouble(b.evalStr())));
                                x = (() -> "" + StrA + "/" + StrB);
                                AlreadyMappedFlag = true;
                            } else if ((IsAConstNumPermut0p0(a, b)) && (StrB.equalsIgnoreCase("0.0"))) {
                                x = (() -> StrA + "/" + StrB);
                                AlreadyMappedFlag = true;
                            } else if ((IsAConstNumPermut1p0(a, b)) && (StrB.equalsIgnoreCase("1.0"))) {
                                x = (() -> StrA);
                                AlreadyMappedFlag = true;
                            } else if (IsAConstNumPermuta1p0(a, b)) {
                                x = (() -> StrA + "/" + StrB);
                                AlreadyMappedFlag = true;
                            } else if (IsAConstPermut(a, b)) {
                                x = (() -> StrA + "/" + StrB);
                                AlreadyMappedFlag = true;
                            } else if (IsAConstPermutExpr(a, b)) {
                                x = (() -> StrA + "/" + StrB);
                                AlreadyMappedFlag = true;
                            } else if ((IsExtremity(StrA)) || (IsExtremity(StrB))) {
                                x = (() -> "" + Double.POSITIVE_INFINITY);
                                AlreadyMappedFlag = true;
                            } else if (IsAConstNumPermutUnkeUnk(a, b)) {
                                x = (() -> StrA + "/" + StrB);
                                AlreadyMappedFlag = true;
                            } else if (IsAConstVarPermut1p0(a, b)) {
                                x = (() -> StrA + "*" + StrB);
                                AlreadyMappedFlag = true;
                            }
                            eatExpr(')');
                            final String TempA = a.evalStr();
                            final String TempB = b.evalStr();
                            if (AlreadyMappedFlag == true)
                                ; else {
                                x = (() -> TempA + "/" + TempB);
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("SimpleStr:parseTerm:/:Expr:a.eval=" + a.evalStr());
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("SimpleStr:parseTerm:/:Expr:b.eval=" + b.evalStr());
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("SimpleStr:parseTerm:/:Expr:x.eval=" + x.evalStr() + " a.evalStr()=" + a.evalStr() + "/ b.evalStr()=" + b.evalStr());
                            }
                        } else {
                            final String StrX = x.evalStr();
                            SimpleStr a = (() -> StrX);
                            SimpleStr b = parseFactor();
                            final String StrA = StrX;
                            final String StrB = b.evalStr();
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("SimpleStr:parseTerm:/:a.eval=" + a.evalStr());
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("SimpleStr:parseTerm:/:b.eval=" + b.evalStr());
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("SimpleStr:parseTerm:/:x.eval=" + x.evalStr() + " a.evalStr()=" + a.evalStr() + "/ b.evalStr()=" + b.evalStr());
                            }
                            if ((IsAConstant(StrA, DiffWithRespTo))
                                    && ((StrIsAConstant.equalsIgnoreCase("Number"))
                                    || (StrIsAConstant.equalsIgnoreCase("NumberExpression")))
                                    && (IsAConstant(StrB, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                                //x = (() -> "" + ((Double) Double.parseDouble(a.evalStr()) / Double.parseDouble(b.evalStr())));
                                x = (() -> "" + StrA + "/" + StrB);
                            } else if ((IsAConstNumPermut0p0(a, b)) && (StrB.equalsIgnoreCase("0.0"))) {
                                x = (() -> StrA + "/" + StrB);
                            } else if ((IsAConstNumPermut1p0(a, b)) && (StrB.equalsIgnoreCase("1.0"))) {
                                x = (() -> StrA);
                            } else if (IsAConstNumPermuta1p0(a, b)) {
                                x = (() -> StrA + "/" + StrB);
                            } else if (IsAConstPermut(a, b)) {
                                x = (() -> StrA + "/" + StrB);
                            } else if (IsAConstPermutExpr(a, b)) {
                                x = (() -> StrA + "/" + StrB);
                            } else if ((IsExtremity(StrA)) || (IsExtremity(StrB))) {
                                x = (() -> "" + Double.POSITIVE_INFINITY);
                            } else if (IsAConstNumPermutUnkeUnk(a, b)) {
                                x = (() -> StrA + "/" + StrB);
                            } else if (IsAConstVarPermut1p0(a, b)) {
                                x = (() -> StrA + "/" + StrB);
                            } else if (IsAConstVarIndConst(a, b)) {
                                x = (() -> StrA + "/" + StrB);
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("SimpleStr:parseTerm:/:a.eval=" + a.evalStr());
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("SimpleStr:parseTerm:/:b.eval=" + b.evalStr());
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("SimpleStr:parseTerm:/:x.eval=" + x.evalStr() + " a.evalStr()=" + a.evalStr() + "/ b.evalStr()=" + b.evalStr());
                            }
                        }
                    } else {
                        final String Temp1 = x.evalStr();
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("SimpleStr:parseTerm:x.eval=" + Temp1);
                        }
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("SimpleStr:parseTerm:Conformal:x.eval=" + x.evalStr());
                        }
                        if ((posExprStr >= 0) && (posExprStr < StrExprStr.length())) {
                            TermEndPos = posExprStr;
                        } else {
                            TermEndPos = StrExprStr.length();
                        }
                        if ((TermStartPos > TermEndPos)) {
                            TermEndPos = StrExprStr.length();
                        }
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("SimpleStr:parseTerm:Return Value:x.eval=" + x.evalStr() + " Term=" + StrExprStr.substring(TermStartPos, TermEndPos));
                        }
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Warn.level) {
                            log.warn("SimpleStr:parseTerm:Return Value:x.eval=" + x.evalStr() + " Term=" + StrExprStr.substring(TermStartPos, TermEndPos));
                        }
                        return x;
                    }
                }
            }

            SimpleStr parseFactor() {
                int FactorStartPos = posExprStr;
                int FactorEndPos = -1;
                if (posExprStr < 0) {
                    FactorStartPos = 0;
                }
                SimpleStr x = parseBase();
                for (;;) {
                    if (eatExpr('^')) { // exponentiation
                        if (eatExpr('(')) {
                            final String StrX = x.evalStr();
                            SimpleStr a = (() -> StrX);
                            SimpleStr b = parseExpression();
                            final String StrA = a.evalStr();
                            final String StrB = b.evalStr();
                            if ((IsAConstant(StrA, DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Number")))
                                    && (IsAConstant(StrB, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))
                                    && (Double.isFinite(Double.parseDouble(StrA))) && (Double.isFinite(Double.parseDouble(StrB)))) {
                                x = (() -> "" + Math.pow(Double.parseDouble(StrA), Double.parseDouble(StrB)));
                            } //else if (IsAConstNumPermut0p0(a, b)) {
                            //    x = (() ->""+ 1.0);
                            //}
                            else if ((IsAConstNumPermut1p0(a, b)) && (b.evalStr().equalsIgnoreCase("1.0"))) {
                                x = (() -> StrA);
                            } else if (IsAConstPermut(a, b)) {
                                x = (() -> StrA + "^" + StrB);
                            } else if (IsAConstPermutExpr(a, b)) {
                                x = (() -> StrA + "^" + StrB);
                            } else if ((IsExtremity(StrA)) || (IsExtremity(StrB))) {
                                x = (() -> "" + Double.POSITIVE_INFINITY);
                            } else if (IsAConstNumPermutUnkeUnk(a, b)) {
                                x = (() -> StrA + "^" + StrB);
                            }
                            eatExpr(')');
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("SimpleStr:parseFactor:x.eval=" + x.evalStr() + " Math.pow(a.evalStr()=" + a.evalStr() + "^ b.evalStr()=" + b.evalStr() + ")");
                            }
                        } else {
                            final String StrX = x.evalStr();
                            SimpleStr a = (() -> StrX);
                            SimpleStr b = parseBase();
                            final String StrA = a.evalStr();
                            final String StrB = b.evalStr();
                            if ((IsAConstant(StrA, DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Number")))
                                    && (IsAConstant(StrB, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))
                                    && (Double.isFinite(Double.parseDouble(StrA))) && (Double.isFinite(Double.parseDouble(StrB)))) {
                                x = (() -> "" + Math.pow(Double.parseDouble(StrA), Double.parseDouble(StrB)));
                                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                    log.info("SimpleStr:parseFactor:x.eval=" + x.evalStr() + " Math.pow(a.evalStr()=" + a.evalStr() + "^ b.evalStr()=" + b.evalStr() + ")");
                                }
                            } //else if (IsAConstNumPermut0p0(a, b)) {
                            //    x = (() ->""+ 1.0);
                            //}
                            else if ((IsAConstNumPermut1p0(a, b)) && (StrB.equalsIgnoreCase("1.0"))) {
                                x = (() -> StrA);
                            } else if (IsAConstPermut(a, b)) {
                                x = (() -> StrA + "^" + b.evalStr());
                                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                    log.info("SimpleStr:parseFactor:x.eval=" + x.evalStr() + " a.evalStr()=" + a.evalStr() + "^ b.evalStr()=" + b.evalStr());
                                }
                            } else if (IsAConstPermutExpr(a, b)) {
                                x = (() -> StrA + "^" + StrB);
                                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                    log.info("SimpleStr:parseFactor:x.eval=" + x.evalStr() + " a.evalStr()=" + a.evalStr() + "^ b.evalStr()=" + b.evalStr());
                                }
                            } else if ((IsExtremity(a.evalStr())) || (IsExtremity(StrB))) {
                                x = (() -> "" + Double.POSITIVE_INFINITY);
                            } else if (IsAConstNumPermutUnkeUnk(a, b)) {
                                x = (() -> StrA + "^" + StrB);
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("SimpleStr:parseFactor:x.eval=" + x.evalStr() + " a.evalStr()=" + a.evalStr() + "^ b.evalStr()=" + b.evalStr());
                            }
                        }
                    } else {
                        if ((posExprStr >= 0) && (posExprStr < StrExprStr.length())) {
                            FactorEndPos = posExprStr;
                        } else {
                            FactorEndPos = StrExprStr.length();
                        }
                        if ((FactorStartPos > FactorEndPos)) {
                            FactorEndPos = StrExprStr.length();
                        }
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("SimpleStr:parseFactor:FactorStartPos=" + FactorStartPos + " FactorEndPos=" + FactorEndPos);
                        }
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("SimpleStr:parseFactor:Return Value:x.eval=" + x.evalStr() + " Factor=" + StrExprStr.substring(FactorStartPos, FactorEndPos));
                        }
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Warn.level) {
                            log.warn("SimpleStr:parseFactor:Return Value:x.eval=" + x.evalStr() + " Factor=" + StrExprStr.substring(FactorStartPos, FactorEndPos));
                        }
                        return x;
                    }
                }
            }

            SimpleStr parseBase() {
                int startPos = posExprStr;
                SimpleStr x = (() -> "");

                if ((eatExpr('-'))) { // unary minus
                    SimpleStr b = parseBase();
                    if ((IsAConstant(b.evalStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))
                            && (Double.isFinite(Double.parseDouble(b.evalStr())))) {
                        x = (() -> "" + ((Double) (-1.0) * Double.parseDouble(b.evalStr())));
                    } else if (IsAConstPermut(x, b)) {
                        x = (() -> "-" + b.evalStr());
                    } else if ((IsExtremity(b.evalStr()))) {
                        x = (() -> "" + Double.POSITIVE_INFINITY);
                    } else {
                        x = (() -> "-" + b.evalStr());
                    }
                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                        log.info("SimpleStr:parseBase:-:Return Value:x.eval=" + x.evalStr() + " startPos=" + startPos);
                    }
                    return x;
                } else if (eatExpr('+')) { // unary plus
                    startPos++;
                }
                if (IsNumber(chExprStr)) { //numbers
                    while (IsNumber(chExprStr)) {
                        nextCharExpr();
                        if ((chExprStr == 'E') || (chExprStr == 'e')) {
                            nextCharExpr();
                            if ((chExprStr == '-') || (chExprStr == '+')) {
                                nextCharExpr();
                            }
                        }
                    }
                    double xx = 1.0;
                    if ((StrExprStr != null) && (!StrExprStr.equalsIgnoreCase("")) && (!StrExprStr.equalsIgnoreCase("NaN")) && (posExprStr <= StrExprStr.length()) && (startPos <= (StrExprStr.length() - 1))) {
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("SimpleStr:parseBase: Number=" + StrExprStr.substring(startPos, posExprStr));
                        }
                        if ((IsAConstant(StrExprStr.substring(startPos, posExprStr), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                            xx = Double.parseDouble(StrExprStr.substring(startPos, posExprStr));
                        }
                    } else {
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("SimpleStr:parseBase:NaN:Exp Form: Number=" + StrExprStr.substring(startPos, posExprStr));
                        }
                        //xx=Double.parseDouble(String.format("%.12f"+StrRemoveEDbl(Str.substring(startPos, pos)) ) );
                        xx = Double.NaN;
                        posExprStr = -1;
                        chExprStr = -1;
                    }
                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                        log.info("SimpleStr:parseBase:Number:Return Value:x.eval=" + x.evalStr() + " xx=" + xx);
                    }
                    final Double XX = xx;
                    x = () -> "" + XX;
                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                        log.info("SimpleStr:parseBase:Number:Return Value:x.eval=" + x.evalStr() + " xx=" + xx);
                    }
                    return x;
                } else if (IsVariable(chExprStr)) {//functions & variables
                    while ((IsVariable(chExprStr)) || (IsNumber(chExprStr))) {
                        nextCharExpr();
                    }
                    String name = StrExprStr.substring(startPos, posExprStr).trim();
                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                        log.info("SimpleStr:parseBase:Var:name=" + name);
                    }
                    if (functionsSimple.containsKey(name)) {
                        eatExpr('(');//get open braces
                        final String FuncName = name;
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("SimpleStr:parseBase: Function:functionsSimple: name=" + name + " FuncName=" + FuncName + " x.evalStr()=" + x.evalStr() + " startPos=" + startPos);
                        }
                        SimpleStr arg = parseExpression();
                        x = (() -> "" + functionsSimple.get(FuncName) + "(" + arg.evalStr() + ")");
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("SimpleStr:parseBase: Function:functionsSimple: name=" + name + " FuncName=" + FuncName + " x.evalStr()=" + x.evalStr() + " arg.evalStr()=" + arg.evalStr() + " startPos=" + startPos);
                        }
                        eatExpr(')');
                    } else if (functions.containsKey(name)) {
                        DoubleUnaryOperator func = functions.get(name);
                        eatExpr('(');//get open braces
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("SimpleStr:parseBase: Function: name=" + name + " x.evalStr()=" + x.evalStr() + " startPos=" + startPos);
                        }
                        SimpleStr arg = parseExpression();
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("SimpleStr:parseBase: Function:functionsSimple: name=" + name + " x.evalStr()=" + x.evalStr() + " arg.evalStr()=" + arg.evalStr() + " startPos=" + startPos);
                        }
                        if ((IsAConstant(arg.evalStr(), DiffWithRespTo))
                                && ((StrIsAConstant.equalsIgnoreCase("Number"))
                                || (StrIsAConstant.equalsIgnoreCase("NumberExpression")))) {
                            x = () -> "" + func.applyAsDouble(Double.parseDouble(arg.evalStr()));
                        } else if (functionsSimple.containsKey(name)) {
                            x = (() -> "" + functionsSimple.get(name) + "(" + arg.evalStr() + ")");
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("SimpleStr:parseBase: Function:functionsSimple: name=" + name + " x.evalStr()=" + x.evalStr() + " arg.evalStr()=" + arg.evalStr() + " startPos=" + startPos);
                            }
                        }
                        eatExpr(')');
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("SimpleStr:parseBase: Function: name=" + name + " x.evalStr()=" + x.evalStr() + " arg.evalStr()=" + arg.evalStr() + " startPos=" + startPos);
                        }
                    } else if (functionsSimple.containsKey(name)) {
                        eatExpr('(');//get open braces
                        SimpleStr arg = parseExpression();
                        x = (() -> "" + functionsSimple.get(name) + "(" + arg.evalStr() + ")");
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("SimpleStr:parseBase: Function:functionsSimple: name=" + name + " x.evalStr()=" + x.evalStr() + " arg.evalStr()=" + arg.evalStr() + " startPos=" + startPos);
                        }
                        eatExpr(')');
                    } else {
                        if ((name != null) && (!name.equalsIgnoreCase("")) && (!name.equalsIgnoreCase("NaN")) && (!name.equalsIgnoreCase("Infinity")) && (variables.get(name) != null)) {
                            x = () -> variables.get(name);
                        } else if (name.equalsIgnoreCase("Infinity")) {
                            x = () -> "" + Double.POSITIVE_INFINITY;
                        } else if (name.equalsIgnoreCase("Nan")) {
                            x = () -> "" + Double.NaN;
                        }
                    }
                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                        log.info("SimpleStr:parseBase: Variable: name=" + name + " x.evalStr()=" + x.evalStr() + " startPos=" + startPos);
                    }
                    return x;
                } else {
                    if (((IsNotAnOperator(chExprStr)) && ((!IsNumber(chExprStr)) && (!IsVariable(chExprStr)))) && (chExprStr != 0) && (chExprStr != -1) && (chExprStr != '(')) {
                        if ((StrExprStr != null) && (startPos < StrExprStr.length()) && (startPos < posExprStr) && (chExprStr != -1) && (chExprStr != 0)) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "ExprSimpleStr:parseBase:Unexpected: " + (char) chExprStr + " int=" + (int) chExprStr + " Cannot Format:" + StrExprStr.substring(posExprStr, StrExprStr.length()));
                        } else if ((chExprStr != -1) && (chExprStr != 0) && (posExprStr >= 1) && (posExprStr < StrExprStr.length()) && (IsNumber(chExprStr))) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "ExprSimpleStr:parseBase:Please Check Code:Should not reach Here:Unexpected: " + (char) chExprStr + " int=" + (int) chExprStr + " Cannot Format:" + StrExprStr.substring(posExprStr, StrExprStr.length()));
                        } else if ((chExprStr != -1) && (chExprStr != 0) && (posExprStr >= 1) && (posExprStr < StrExprStr.length()) && (IsOperator(chExprStr))) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "ExprSimpleStr:parseBase:Please Check Equation Operators / Code:Should not reach Here:Unexpected: " + (char) chExprStr + " int=" + (int) chExprStr + " Cannot Format:" + StrExprStr.substring(posExprStr, StrExprStr.length()));
                        } else if ((chExprStr != -1) && (chExprStr != 0) && (posExprStr >= 1) && (posExprStr < StrExprStr.length())) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "ExprSimpleStr:parseBase:Unexpected: " + (char) chExprStr + " int=" + (int) chExprStr + " Cannot Format:" + StrExprStr.substring(posExprStr, StrExprStr.length()));
                        } else {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "ExprSimpleStr:parseBase:Unexpected char: " + (char) chExprStr + " int=" + (int) chExprStr + " Cannot Format:" + StrExprStr.substring(posExprStr, StrExprStr.length()));
                        }
                    }
                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                        log.info("SimpleStr:parseBase:Exception:Return Value:x.eval=" + x.evalStr());
                    }
                    return x;
                }
            }
        }.parse();
    }
//Created by Rajesh Pai
    // 

    @FunctionalInterface
    public interface AlgebraicConfrmStr {

        String AlgebraicStr();
    }

    public static AlgebraicConfrmStr parseConformal(String str, Map<String, String> variables, String DiffWithRespTo, String Silent, ExprSimpleStrSep.LogLevel MyLogLevel) {

        return new Object() {
            int posExprStr = 0, chExprStr;
            String StrExprStr;
            int Operator = -1;
            String StrNumberExpr = "";
            int OperNum = '*';
            int OperNumInMyMind = -1;
            String StrVarExpr = "";
            int OperVar = '*';
            String StrIndConstExpr = "";
            int OperIndConst = '*';

            void nextCharExpr() {
                ++posExprStr;
                chExprStr = (posExprStr < StrExprStr.length()) ? StrExprStr.charAt(posExprStr) : -1;
                if ((chExprStr == -1) && (posExprStr >= StrExprStr.length())) {
                    posExprStr = StrExprStr.length();
                } else if ((chExprStr == -1) || ((chExprStr == 0))) {
                    throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "nextChar:nextChar:Unexpected: " + (char) chExprStr + " int=" + (int) chExprStr + " Cannot Format:" + StrExprStr.substring(posExprStr, StrExprStr.length()));
                }
            }

            void prevCharExpr() {
                --posExprStr;
                chExprStr = (posExprStr >= 0) ? StrExprStr.charAt(posExprStr) : -1;
                if ((chExprStr == -1) && (posExprStr < 0)) 
            ; else if ((chExprStr == -1) || ((chExprStr == 0))) {
                    throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "prevChar:prevChar:Unexpected: " + (char) chExprStr + " int=" + (int) chExprStr + " Cannot Format:" + StrExprStr.substring(posExprStr, StrExprStr.length()));
                }
            }

            boolean eatExpr(int CharToEat) {
                while (chExprStr == ' ') {
                    nextCharExpr();
                }
                if (chExprStr == CharToEat) {
                    nextCharExpr();
                    return true;
                }
                return false;
            }

            boolean IsAConstant(String StrX1, String DiffWithRespTo) {

                try {
                    StrIsAConstant = "Unknown";
                    String StrX = StrX1;
                    //log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant);
                    log.info("IsAConstant:StrX=" + StrX + " DiffWithRespTo=" + DiffWithRespTo);
                    if ((StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (!StrX.contains(DiffWithRespTo))
                            && (StrX.matches("[\\-\\+]*[0-9\\.]+"))
                            //&& (!StrX.matches("[\\-\\+]*[a-zA-Z0-9]+"))
                            && (Double.isFinite(Double.valueOf(StrX)))) {
                        StrIsAConstant = "Number";
                        //log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                        return true;
                    } else if ((StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (!StrX.contains(DiffWithRespTo))
                            && (StrX.matches("[\\+\\-\\*/]*[a-zA-Z0-9]+"))) {
                        StrIsAConstant = "IndConstant";
                        log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                        return false;
                    } else if ((StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (!StrX.contains(DiffWithRespTo))
                            && (StrX.matches("[\\-\\+\\*/]*[0-9\\.]+"))) {
                        StrIsAConstant = "NumberExpression";
                        //log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                        return true;
                    } else if ((StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (!StrX.equalsIgnoreCase(DiffWithRespTo))
                            && (!StrX.contains(DiffWithRespTo))
                            && (StrX.matches("[\\+\\-\\*/]*[a-zA-Z0-9\\.]+[\\^]*[0-9\\.]+"))) {
                        StrIsAConstant = "IndConstantExpression";
                        log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                        return false;
                    } else if ((StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (StrX.equalsIgnoreCase(DiffWithRespTo))
                            && (StrX.matches("[\\+\\-\\*\\^/]*[a-zA-Z0-9]+"))) {
                        StrIsAConstant = "Var";
                        //log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                        return false;
                    } else if ((StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && ((StrX.equalsIgnoreCase(DiffWithRespTo)) //|| ((StrX.contains(DiffWithRespTo)) && ((!StrX.contains(DiffWithRespTo + "^"))))
                            )
                            && (StrX.matches("[\\+\\-\\*\\^/]*[a-zA-Z0-9]+"))) {
                        StrIsAConstant = "Var";
                        //log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                        return false;
                    } else if ((StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (StrX.contains(DiffWithRespTo))) {
                        StrIsAConstant = "VarExpression";
                        //log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                        return false;
                    } else if ((StrIsAConstant.equalsIgnoreCase("Unknown")) && (StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (!StrX.contains(DiffWithRespTo))
                            && ((StrX.contains("E-")) || (StrX.contains("E+")) || (StrX.contains("e+")) || (StrX.contains("e-")))
                            && (Double.isFinite(Double.valueOf(StrX)))) {
                        StrIsAConstant = "Number";
                        //log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                        return true;
                    } else if (StrIsAConstant.equalsIgnoreCase("Unknown") && (StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (StrX.matches("[\\+\\-]*[a-zA-Z0-9\\.]+"))
                            && (StrX.matches(DiffWithRespTo))) {
                        StrIsAConstant = "VarExpression";
                        //log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                        return false;
                    } else if ((StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (!StrX.contains(DiffWithRespTo))
                            && ((StrX.matches("[\\+\\-]*[0-9\\.\\+\\-\\*\\^/]+[0-9\\.\\+\\-*\\^/]*"))
                            || (StrX.matches("[\\+\\-]*[0-9\\.\\*/]*\\^[0-9\\.\\*\\^/]+")))) {
                        StrIsAConstant = "NumberExpression";
                        //log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                        return true;
                    } else if ((StrIsAConstant.equalsIgnoreCase("Unknown") && (StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && ((StrX.matches("[\\+\\-]*[a-zA-Z0-9\\.\\*\\^/]+"))
                            || (StrX.matches("[\\+\\-]*[a-zA-Z0-9\\.\\*\\^/]+"))))) {
                        StrIsAConstant = "IndConstantExpression";
                        log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                        return false;
                    } else if ((StrIsAConstant.equalsIgnoreCase("Unknown"))
                            && (StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (!StrX.contains(DiffWithRespTo))) {
                        StrIsAConstant = "IndConstantExpression";
                        log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                        return false;
                    }
                } catch (NumberFormatException ConstExp) {
                    log.info("IsAConstant:Exception:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                }
                log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                return false;
            }

            boolean IsAConstantExpr(String StrX1, String DiffWithRespTo) {

                try {
                    StrIsAConstHigh = "Unknown";
                    String StrX = StrX1;
                    //log.info("IsAConstant:StrIsAConstHigh=" + StrIsAConstHigh);
                    log.info("IsAConstantExpr:StrX=" + StrX);
                    log.info("IsAConstantExpr:DiffWithRespTo=" + DiffWithRespTo);
                    if ((StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (!StrX.contains(DiffWithRespTo))
                            && (StrX.matches("[\\-\\+]*[0-9\\.]+"))
                            && (Double.isFinite(Double.valueOf(StrX)))) {
                        StrIsAConstHigh = "Number";
                        log.info("IsAConstantExpr:StrIsAConstHigh=" + StrIsAConstHigh + " DiffWithRespTo=" + DiffWithRespTo);
                        return true;
                    } else if ((StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (!StrX.contains(DiffWithRespTo))
                            && (StrX.matches("[\\-\\+\\*/]*[0-9\\.]+"))) {
                        StrIsAConstHigh = "NumberExpression";
                        log.info("IsAConstantExpr:StrIsAConstHigh=" + StrIsAConstHigh + " DiffWithRespTo=" + DiffWithRespTo);
                        return true;
                    } else if ((StrIsAConstant.equalsIgnoreCase("Unknown")) && (StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (!StrX.contains(DiffWithRespTo))
                            && ((StrX.contains("E-")) || (StrX.contains("E+")) || (StrX.contains("e+")) || (StrX.contains("e-")))
                            && (Double.isFinite(Double.valueOf(StrX)))) {
                        StrIsAConstHigh = "Number";
                        log.info("IsAConstantExpr:StrIsAConstHigh=" + StrIsAConstHigh + " DiffWithRespTo=" + DiffWithRespTo);
                        return true;
                    } else if ((StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (!StrX.contains(DiffWithRespTo))
                            && ((StrX.matches("[\\+\\-]*[0-9\\.\\+\\-\\*\\^/]+")))) {
                        StrIsAConstHigh = "NumberExpression";
                        log.info("IsAConstantExpr:StrIsAConstHigh=" + StrIsAConstHigh + " DiffWithRespTo=" + DiffWithRespTo);
                        return true;
                    } else if ((StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (!StrX.contains(DiffWithRespTo))
                            && (StrX.matches("[\\+\\-\\*/]*[a-zA-Z0-9]+"))) {
                        StrIsAConstHigh = "IndConstant";
                        log.info("IsAConstantExpr:StrIsAConstHigh=" + StrIsAConstHigh + " DiffWithRespTo=" + DiffWithRespTo);
                        return false;
                    } else if ((StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (!StrX.equalsIgnoreCase(DiffWithRespTo))
                            && (!StrX.contains(DiffWithRespTo))
                            && (StrX.matches("[\\+\\-\\*/]*[a-zA-Z0-9\\.]+[\\^]*[0-9\\.]+"))) {
                        StrIsAConstHigh = "IndConstantExpression";
                        log.info("IsAConstantExpr:StrIsAConstHigh=" + StrIsAConstHigh + " DiffWithRespTo=" + DiffWithRespTo);
                        return false;
                    } else if ((StrIsAConstHigh.equalsIgnoreCase("Unknown") && (StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (!StrX.contains(DiffWithRespTo))
                            && ((StrX.matches("[\\+\\-]*[a-zA-Z0-9\\.\\*\\^/]+"))
                            || (StrX.matches("[\\+\\-]*[a-zA-Z0-9\\.\\*\\^/]+"))))) {
                        StrIsAConstHigh = "IndConstantExpression";
                        log.info("IsAConstantExpr:StrIsAConstHigh=" + StrIsAConstHigh + " DiffWithRespTo=" + DiffWithRespTo);
                        return false;
                    } else if ((StrIsAConstHigh.equalsIgnoreCase("Unknown"))
                            && (StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (!StrX.contains(DiffWithRespTo))) {
                        StrIsAConstHigh = "IndConstantExpression";
                        log.info("IsAConstantExpr:StrIsAConstHigh=" + StrIsAConstHigh + " DiffWithRespTo=" + DiffWithRespTo);
                        return false;
                    } else if ((StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (StrX.equalsIgnoreCase(DiffWithRespTo))
                            && (StrX.matches("[\\+\\-\\*\\^/]*[a-zA-Z0-9]+"))) {
                        StrIsAConstHigh = "Var";
                        log.info("IsAConstantExpr:StrIsAConstHigh=" + StrIsAConstHigh + " DiffWithRespTo=" + DiffWithRespTo);
                        return false;
                    } else if ((StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (StrX.contains(DiffWithRespTo))) {
                        StrIsAConstHigh = "VarExpression";
                        log.info("IsAConstantExpr:StrIsAConstHigh=" + StrIsAConstHigh + " DiffWithRespTo=" + DiffWithRespTo);
                        return false;
                    } else if (StrIsAConstHigh.equalsIgnoreCase("Unknown") && (StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (StrX.matches("[\\+\\-]*[a-zA-Z0-9\\.]+"))
                            && (StrX.matches(DiffWithRespTo))) {
                        StrIsAConstHigh = "VarExpression";
                        log.info("IsAConstantExpr:StrIsAConstHigh=" + StrIsAConstHigh + " DiffWithRespTo=" + DiffWithRespTo);
                        return false;
                    } else if (StrIsAConstHigh.equalsIgnoreCase("Unknown") && (StrX != null)
                            && (!StrX.equalsIgnoreCase(""))
                            && (StrX.matches("[\\+\\-]*[a-zA-Z0-9\\.\\*\\^/]+"))
                            && (StrX.contains(DiffWithRespTo))) {
                        StrIsAConstHigh = "VarExpression";
                        log.info("IsAConstantExpr:StrIsAConstHigh=" + StrIsAConstHigh + " DiffWithRespTo=" + DiffWithRespTo);
                        return false;
                    }
                } catch (NumberFormatException ConstExp) {
                    log.info("IsAConstantExpr:Exception:StrIsAConstHigh=" + StrIsAConstHigh + " DiffWithRespTo=" + DiffWithRespTo);
                }
                log.info("IsAConstantExpr:StrIsAConstHigh=" + StrIsAConstHigh + " DiffWithRespTo=" + DiffWithRespTo);
                return false;
            }

            boolean IsExtremity(String StrX1) {
                if ((!StrX1.equalsIgnoreCase("Infinity"))
                        && (!StrX1.equalsIgnoreCase("-Infinity"))
                        && (!StrX1.equalsIgnoreCase("+Infinity"))
                        && (!StrX1.equalsIgnoreCase("NaN"))
                        && (!StrX1.equalsIgnoreCase("-NaN"))
                        && (!StrX1.equalsIgnoreCase("+NaN"))) {
                    return false;
                }
                return true;
            }

            void BackupStateAll(Map<String, String> variablesBackupState) {
                variablesBackupState.put("StrNumberExpr", StrNumberExpr);
                variablesBackupState.put("StrVarExpr", StrVarExpr);
                variablesBackupState.put("StrIndConstExpr", StrIndConstExpr);
                variablesBackupState.put("Operator", "" + Operator);
                variablesBackupState.put("OperNum", "" + OperNum);
                variablesBackupState.put("OperVar", "" + OperVar);
                variablesBackupState.put("OperIndConst", "" + OperIndConst);

                variablesBackupState.put("StrExprStr", StrExprStr);

                variablesBackupState.put("posExprStr", "" + posExprStr);
                variablesBackupState.put("chExprStr", "" + chExprStr);
                StrNumberExpr = "";
                StrVarExpr = "";
                StrIndConstExpr = "";
                Operator = -1;
                OperNum = '*';
                OperVar = '*';
                OperIndConst = '*';
            }

            void RestoreStateAll(Map<String, String> variablesBackupState) {
                StrNumberExpr = variablesBackupState.get("StrNumberExpr");
                StrVarExpr = variablesBackupState.get("StrVarExpr");
                StrIndConstExpr = variablesBackupState.get("StrIndConstExpr");
                Operator = Integer.parseInt(variablesBackupState.get("Operator"));
                OperNum = Integer.parseInt(variablesBackupState.get("OperNum"));
                OperVar = Integer.parseInt(variablesBackupState.get("OperVar"));
                OperIndConst = Integer.parseInt(variablesBackupState.get("OperIndConst"));

                //StrExprStr = variablesBackupState.get("StrExprStr");
                //posExprStr = Integer.parseInt(variablesBackupState.get("posExprStr"));
                //chExprStr = Integer.parseInt(variablesBackupState.get("chExprStr"));
            }

            void ChaosPreventionLowLevel() {
                StrNumberExpr = "";
                StrVarExpr = "";
                StrIndConstExpr = "";
                Operator = -1;
                OperNum = '*';
                OperVar = '*';
                OperIndConst = '*';
            }

            String BlackBoxNum(Double StrNumber, Double BAlgeStrNum, int Operator, int OperNum) {
                if ((StrNumber == BAlgeStrNum) && (Operator == '/')) {
                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                        log.info("ConformalStr:BlackBoxNum:Number:=" + 1.0 + " StrNumberExpr=" + StrNumberExpr + " Operator=" + (char) Operator + " OperNum=" + (char) OperNum);
                    }
                    return "" + 1.0;
                } else if ((StrNumber == BAlgeStrNum) && (Operator == '/') && (OperNum == '/')) {
                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                        log.info("ConformalStr:BlackBoxNum:Number:=" + 1.0 + " StrNumberExpr=" + StrNumberExpr + " Operator=" + (char) Operator + " OperNum=" + (char) OperNum);
                    }
                    return "" + 1.0;
                } else if ((StrNumber == -BAlgeStrNum) && (Operator == '/')) {
                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                        log.info("ConformalStr:BlackBoxNum:Number:=" + -1.0 + " StrNumberExpr=" + StrNumberExpr + " Operator=" + (char) Operator + " OperNum=" + (char) OperNum);
                    }
                    return "" + -1.0;
                } else if (Operator == '/') {
                    if ((OperNum == '/')) {
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("ConformalStr:BlackBoxNum:Number:=" + (StrNumber / BAlgeStrNum) + " StrNumberExpr=" + StrNumberExpr + " Operator=" + (char) Operator + " OperNum=" + (char) OperNum);
                        }
                        return "" + StrNumber + "/" + BAlgeStrNum;
                    } else if (OperNum == '*') {
                        if (OperNumInMyMind == '/') {
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:BlackBoxNum:Number:=" + (StrNumber * BAlgeStrNum) + " StrNumberExpr=" + StrNumberExpr + " Operator=" + (char) Operator + " OperNum=" + (char) OperNum);
                            }
                            return "" + (StrNumber * BAlgeStrNum);
                        } else {
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:BlackBoxNum:Number:=" + (StrNumber * BAlgeStrNum) + " StrNumberExpr=" + StrNumberExpr + " Operator=" + (char) Operator + " OperNum=" + (char) OperNum);
                            }
                            return "" + (StrNumber * BAlgeStrNum);
                        }
                    }
                } else if (Operator == '*') {
                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                        log.info("ConformalStr:BlackBoxNum:Number:=" + (StrNumber * BAlgeStrNum) + " StrNumberExpr=" + StrNumberExpr + " Operator=" + (char) Operator + " OperNum=" + (char) OperNum);
                    }
                    return "" + StrNumber + "*" + BAlgeStrNum;
                }
                return "" + 1.0;
            }

            boolean IsAConstNumPermut0p0(AlgebraicConfrmStr a, AlgebraicConfrmStr b) {
                boolean Flag = false;
                StrIsAConstant = "Unknown";
                log.info("IsAConstNumPermut0p0:Entry:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag + " a=" + a.AlgebraicStr() + " b=" + b.AlgebraicStr());
                if ((IsAConstant(a.AlgebraicStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("NumberExpression")))
                        && ((IsAConstant(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")))
                        && (b.AlgebraicStr().equalsIgnoreCase("0.0"))) {
                    Flag = true;
                    log.info("IsAConstNumPermut0p0:FSM1:Num:Number:0.0:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                } else if ((!IsAConstant(a.AlgebraicStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("VarExpression")))
                        && ((IsAConstant(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")))
                        && (b.AlgebraicStr().equalsIgnoreCase("0.0"))) {
                    Flag = true;
                    log.info("IsAConstNumPermut0p0:FSM2:VarExpression:Number:0.0:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                } else if ((!IsAConstant(a.AlgebraicStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))
                        && ((IsAConstant(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")))
                        && (b.AlgebraicStr().equalsIgnoreCase("0.0"))) {
                    Flag = true;
                    log.info("IsAConstNumPermut0p0:FSM3:IndConstantExpression:Number:0.0:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                }
                return Flag;
            }

            boolean IsAConstNumPermuta1p0(AlgebraicConfrmStr a, AlgebraicConfrmStr b) {
                boolean Flag = false;
                StrIsAConstant = "Unknown";
                log.info("IsAConstNumPermuta1p0:Entry:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag + " a=" + a.AlgebraicStr() + " b=" + b.AlgebraicStr());
                if ((IsAConstant(a.AlgebraicStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Number")))
                        && ((!IsAConstant(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Var")))
                        && (a.AlgebraicStr().equalsIgnoreCase("1.0"))) {
                    Flag = true;
                    log.info("IsAConstNumPermuta1p0:FSM1:Num:Var:1.0:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                } else if ((IsAConstant(a.AlgebraicStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Number")))
                        && ((!IsAConstant(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("VarExpression")))
                        && (a.AlgebraicStr().equalsIgnoreCase("1.0"))) {
                    Flag = true;
                    log.info("IsAConstNumPermuta1p0:FSM2:Number:VarExpression:1.0:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                } else if ((IsAConstant(a.AlgebraicStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Number")))
                        && ((!IsAConstant(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant")))
                        && (a.AlgebraicStr().equalsIgnoreCase("1.0"))) {
                    Flag = true;
                    log.info("IsAConstNumPermuta1p0:FSM3:Num:IndConstant:1.0:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                } else if ((IsAConstant(a.AlgebraicStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Number")))
                        && ((!IsAConstant(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))
                        && (a.AlgebraicStr().equalsIgnoreCase("1.0"))) {
                    Flag = true;
                    log.info("IsAConstNumPermuta1p0:FSM4:Number:IndConstantExpression:1.0:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                }
                return Flag;
            }

            boolean IsAConstNumPermut1p0(AlgebraicConfrmStr a, AlgebraicConfrmStr b) {
                boolean Flag = false;
                StrIsAConstant = "Unknown";
                log.info("IsAConstNumPermut1p0:Entry:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag + " a=" + a.AlgebraicStr() + " b=" + b.AlgebraicStr());
                if ((IsAConstant(a.AlgebraicStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("NumberExpression")))
                        && ((IsAConstant(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")))
                        && (b.AlgebraicStr().equalsIgnoreCase("1.0"))) {
                    Flag = true;
                    log.info("IsAConstNumPermut1p0:FSM1:Num:Number:1.0:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                } else if ((!IsAConstant(a.AlgebraicStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Var")))
                        && ((IsAConstant(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")))
                        && (b.AlgebraicStr().equalsIgnoreCase("1.0"))) {
                    Flag = true;
                    log.info("IsAConstNumPermut1p0:FSM2:Var:Number:1.0:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                } else if ((!IsAConstant(a.AlgebraicStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("VarExpression")))
                        && ((IsAConstant(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")))
                        && (b.AlgebraicStr().equalsIgnoreCase("1.0"))) {
                    Flag = true;
                    log.info("IsAConstNumPermut1p0:FSM2:VarExpression:Number:1.0:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                } else if ((!IsAConstant(a.AlgebraicStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("IndConstant")))
                        && ((IsAConstant(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")))
                        && (b.AlgebraicStr().equalsIgnoreCase("1.0"))) {
                    Flag = true;
                    log.info("IsAConstNumPermut1p0:FSM3:IndConstant:Number:1.0:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                } else if ((!IsAConstant(a.AlgebraicStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))
                        && ((IsAConstant(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")))
                        && (b.AlgebraicStr().equalsIgnoreCase("1.0"))) {
                    Flag = true;
                    log.info("IsAConstNumPermut1p0:FSM3:IndConstantExpression:Number:0.0:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                }
                return Flag;
            }

            boolean IsAConstPermut(AlgebraicConfrmStr a, AlgebraicConfrmStr b) {
                boolean Flag = false;
                AlgebraicConfrmStr x;
                StrIsAConstant = "Unknown";
                final String StrA = a.AlgebraicStr();
                final String StrB = b.AlgebraicStr();
                log.info("IsAConstPermut:Entry:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag + " a=" + a.AlgebraicStr() + " b=" + b.AlgebraicStr());
                if ((StrA != null) && (IsAConstant(StrA, DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Number")))
                        && ((StrB != null) && (!IsAConstant(StrB, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Var")))) {
                    Flag = true;
                    log.info("IsAConstPermut:FSM1:Num:Var:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                } else if ((StrA != null) && (!IsAConstant(StrA, DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Var")))
                        && ((StrB != null) && (IsAConstant(StrB, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")))) {
                    Flag = true;
                    log.info("IsAConstPermut:FSM2:Var:Num:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                } else if ((StrA != null) && (IsAConstant(StrA, DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Number")))
                        && ((StrB != null) && (!IsAConstant(StrB, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant")))) {
                    log.info("IsAConstPermut:FSM3:Num:IndConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((StrA != null) && (!IsAConstant(StrA, DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("IndConstant")))
                        && ((StrB != null) && (IsAConstant(StrB, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")))) {
                    log.info("IsAConstPermut:FSM4:IndConstant:Num:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((StrA != null) && (!IsAConstant(StrA, DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Var")))
                        && ((StrB != null) && (!IsAConstant(StrB, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant")))) {
                    log.info("IsAConstPermut:FSM5:Var:IndConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((StrA != null) && (!IsAConstant(StrA, DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("IndConstant")))
                        && ((StrB != null) && (!IsAConstant(StrB, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Var")))) {
                    log.info("IsAConstPermut:FSM6:IndConstant:Var:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                }
                return Flag;
            }

            boolean IsAConstPermutExpr(AlgebraicConfrmStr a, AlgebraicConfrmStr b) {
                boolean Flag = false;
                AlgebraicConfrmStr x;
                StrIsAConstant = "Unknown";
                log.info("IsAConstPermutExpr:Entry:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag + " a=" + a.AlgebraicStr() + " b=" + b.AlgebraicStr());
                if ((IsAConstant(a.AlgebraicStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("NumberExpression")))
                        && ((!IsAConstant(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
                    Flag = true;
                    log.info("IsAConstPermutExpr:FSM1:Num:Var:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                } else if ((!IsAConstant(a.AlgebraicStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("VarExpression")))
                        && ((IsAConstant(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("NumberExpression")))) {
                    Flag = true;
                    log.info("IsAConstPermutExpr:FSM2:Var:Num:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                } else if ((IsAConstant(a.AlgebraicStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("NumberExpression")))
                        && ((!IsAConstant(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstanExpressiont")))) {
                    log.info("IsAConstPermutExpr:FSM3:Num:IndConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.AlgebraicStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))
                        && ((IsAConstant(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("NumberExpression")))) {
                    log.info("IsAConstPermutExpr:FSM4:IndConstant:Num:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.AlgebraicStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("VarExpression")))
                        && ((!IsAConstant(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                    log.info("IsAConstPermutExpr:FSM5:Var:IndConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.AlgebraicStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))
                        && ((!IsAConstant(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
                    log.info("IsAConstPermutExpr:FSM6:IndConstant:Var:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.AlgebraicStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("VarExpression")))
                        && ((!IsAConstant(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
                    log.info("IsAConstPermutExpr:FSM7:VarExpression:VarExpression:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.AlgebraicStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))
                        && ((!IsAConstant(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                    log.info("IsAConstPermutExpr:FSM8:IndConstantExpression:IndConstantExpression:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.AlgebraicStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("VarExpression")))
                        && ((!IsAConstant(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                    log.info("IsAConstPermutExpr:FSM9:VarExpression:IndConstantExpression:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.AlgebraicStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))
                        && ((!IsAConstant(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
                    log.info("IsAConstPermutExpr:FSM10:IndConstantExpression:VarExpression:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.AlgebraicStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("VarExpression")))
                        && ((!IsAConstant(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Var")))) {
                    log.info("IsAConstPermutExpr:FSM11:VarExpression:Var:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.AlgebraicStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))
                        && ((!IsAConstant(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant")))) {
                    log.info("IsAConstPermutExpr:FSM12:IndConstantExpression:IndConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.AlgebraicStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("VarExpression")))
                        && ((!IsAConstant(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant")))) {
                    log.info("IsAConstPermutExpr:FSM11:VarExpression:IndConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.AlgebraicStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))
                        && ((!IsAConstant(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Var")))) {
                    log.info("IsAConstPermutExpr:FSM12:IndConstantExpression:Var:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.AlgebraicStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("VarExpression")))
                        && ((IsAConstant(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")))) {
                    log.info("IsAConstPermutExpr:FSM13:VarExpression:Number:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.AlgebraicStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))
                        && ((IsAConstant(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")))) {
                    log.info("IsAConstPermutExpr:FSM14:IndConstantExpression:Number:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((IsAConstant(a.AlgebraicStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Number")))
                        && ((!IsAConstant(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
                    log.info("IsAConstPermutExpr:FSM15:Number:VarExpression:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((IsAConstant(a.AlgebraicStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Number")))
                        && ((!IsAConstant(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                    log.info("IsAConstPermutExpr:FSM16:Number:IndConstantExpression:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                }
                return Flag;
            }

            boolean IsAConstNumPermutUnkeUnk(AlgebraicConfrmStr a, AlgebraicConfrmStr b) {
                boolean Flag = false;
                StrIsAConstant = "Unknown";
                log.info("IsAConstNumPermutUnkeUnk:Entry:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag + " a=" + a.AlgebraicStr() + " b=" + b.AlgebraicStr());
                if ((!IsAConstant(a.AlgebraicStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Unknown")))
                        && ((!IsAConstant(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                    log.info("IsAConstNumPermutUnkeUnk:FSM1:Unknown:IndConstantExpression:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.AlgebraicStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Unknown")))
                        && ((!IsAConstant(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
                    log.info("IsAConstNumPermutUnkeUnk:FSM2:Unknown:IndConstantExpression:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(a.AlgebraicStr(), DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Unknown")))
                        && ((!IsAConstant(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Unknown")))) {
                    log.info("IsAConstNumPermutUnkeUnk:FSM3:Unknown:Unknown:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                }
                return Flag;
            }

            boolean IsAConstNumExprHighNum(AlgebraicConfrmStr a, AlgebraicConfrmStr b) {
                boolean Flag = false;
                StrIsAConstHigh = "Unknown";
                log.info("IsAConstNumExprHighNum:Entry:StrIsAConstant=" + StrIsAConstant + " StrIsAConstHigh=" + StrIsAConstHigh + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag + " a=" + a.AlgebraicStr() + " b=" + b.AlgebraicStr());
                if ((!IsAConstant(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Unknown"))
                        && (!IsAConstantExpr(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstHigh.equalsIgnoreCase("NumberExpression"))) {
                    log.info("IsAConstNumExprHighNum:FSM1:Unknown:NumberExpression:StrIsAConstant=" + StrIsAConstant + " StrIsAConstHigh=" + StrIsAConstHigh + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Unknown"))
                        && (!IsAConstantExpr(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstHigh.equalsIgnoreCase("VarExpression"))) {
                    log.info("IsAConstNumExprHighNum:FSM2:Unknown:VarExpression:StrIsAConstant=" + StrIsAConstant + " StrIsAConstHigh=" + StrIsAConstHigh + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                } else if ((!IsAConstant(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Unknown"))
                        && (!IsAConstantExpr(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstHigh.equalsIgnoreCase("IndConstantExpression"))) {
                    log.info("IsAConstNumExprHighNum:FSM3:Unknown:Unknown:IndConstantExpression=" + StrIsAConstant + " StrIsAConstHigh=" + StrIsAConstHigh + " DiffWithRespTo=" + DiffWithRespTo + " Flag=" + Flag);
                    Flag = true;
                }
                return Flag;
            }

            AlgebraicConfrmStr FormAlgebraicStr(AlgebraicConfrmStr x, boolean InitFlag, int Operator, int OperIndConst, int OperNum, int OperVar) {
                //AlgebraicConfrmStr y=(()->"");
                boolean AssignFlagIndConst = false;
                boolean AssignFlagNum = false;
                boolean AssignFlagVar = false;
                final String TempInd = x.AlgebraicStr();
                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                    log.info("ConformalStr:FormAlgebraicStr:Entry:TempInd=" + TempInd + " StrIndConstExpr=" + StrIndConstExpr + " Operator=" + (char) Operator + " OperIndConst=" + (char) OperIndConst);
                }
                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                    log.info("ConformalStr:FormAlgebraicStr:Entry:StrNumberExpr=" + StrNumberExpr + " Operator=" + (char) Operator + " OperNum=" + (char) OperNum);
                }
                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                    log.info("ConformalStr:FormAlgebraicStr:Entry:StrVarExpr=" + StrVarExpr + " Operator=" + (char) Operator + " OperVar=" + (char) OperVar);
                }
                if ((InitFlag == true) && (StrIndConstExpr != null) && (!StrIndConstExpr.equalsIgnoreCase(""))) {
                    if (OperIndConst == -1) {
                        x = (() -> StrIndConstExpr);
                        AssignFlagIndConst = true;
                    } else if (OperIndConst == '/') {
                        x = (() -> StrIndConstExpr);
                        AssignFlagIndConst = true;
                    } else if (OperIndConst == '*') {
                        x = (() -> StrIndConstExpr);
                        AssignFlagIndConst = true;
                    }
                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                        log.info("ConformalStr:FormAlgebraicStr:IndConst:x.AlgebraicStr()=" + x.AlgebraicStr() + " StrIndConstExpr=" + StrIndConstExpr + " Operator=" + (char) Operator + " OperIndConst=" + (char) OperIndConst);
                    }
                }
                if ((InitFlag == true) && (StrNumberExpr != null) && (!StrNumberExpr.equalsIgnoreCase(""))) {
                    if (((StrIndConstExpr == null) || (StrIndConstExpr.equalsIgnoreCase("")))) {
                        x = (() -> StrNumberExpr);
                        AssignFlagNum = true;
                    } else if ((StrNumberExpr != null) && (!StrNumberExpr.equalsIgnoreCase(""))
                            && (AssignFlagIndConst == true)) {
                        final String Temp = x.AlgebraicStr();
                        x = (() -> Temp + (char) OperNum + StrNumberExpr);
                        AssignFlagNum = true;
                    }
                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                        log.info("ConformalStr:FormAlgebraicStr:Number:x.AlgebraicStr()=" + x.AlgebraicStr() + " StrNumberExpr=" + StrNumberExpr + " Operator=" + (char) Operator + " OperNum=" + (char) OperNum);
                    }
                }
                final String TempVarPreStr = x.AlgebraicStr();
                if ((InitFlag == true) && (StrVarExpr != null) && (!StrVarExpr.equalsIgnoreCase(""))) {
                    if (TempVarPreStr.equalsIgnoreCase("")) {
                        x = (() -> StrVarExpr);
                        AssignFlagVar = true;
                    } else if ((Operator == '/') && (OperNum == '/') && ((StrIndConstExpr == null) || (StrIndConstExpr.equalsIgnoreCase("")))) {
                        x = (() -> StrVarExpr + (char) OperNum + TempVarPreStr);
                        AssignFlagVar = true;
                    } else {
                        x = (() -> TempVarPreStr + (char) OperVar + StrVarExpr);
                        AssignFlagVar = true;
                    }
                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                        log.info("ConformalStr:FormAlgebraicStr:Var:x.AlgebraicStr()=" + x.AlgebraicStr() + " StrVarExpr=" + StrVarExpr + " Operator=" + (char) Operator + " OperVar=" + (char) OperVar);
                    }
                }
                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                    log.info("ConformalStr:FormAlgebraicStr:Final:x.AlgebraicStr()=" + x.AlgebraicStr());
                }
                return x;
            }

            String FormVarStrVar(AlgebraicConfrmStr b, int Operator) {
                Double StrVarExponent = 0.0;
                Double BAlgeStrExponent = 0.0;
                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                    log.info("ConformalStr:FormVarStrVar:Initial:StrVarExpr=" + StrVarExpr + " b.AlgebraicStr()=" + b.AlgebraicStr() + " Operator=" + (char) Operator + " OperVar=" + (char) OperVar);
                }
                if ((StrVarExpr == null) || (StrVarExpr.equalsIgnoreCase(""))) {
                    StrVarExpr = b.AlgebraicStr();
                    OperVar = Operator;
                } else if ((!IsAConstant(StrVarExpr, DiffWithRespTo))
                        && (StrIsAConstant.equalsIgnoreCase("VarExpression"))
                        && (StrVarExpr.contains(DiffWithRespTo + "^"))) {
                    String[] Temp = StrVarExpr.split(DiffWithRespTo + "\\^");
                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                        log.info("ConformalStr:FormVarStrVar:Inter:Temp[1]=" + Temp[1] + " StrVarExponent=" + StrVarExponent + " BAlgeStrExponent=" + BAlgeStrExponent + " Operator=" + (char) Operator + " OperVar=" + (char) OperVar);
                    }
                    if ((Temp.length == 2) && (IsAConstant(Temp[1], DiffWithRespTo))) {
                        StrVarExponent = Double.parseDouble(Temp[1]);
                        if ((!IsAConstant(b.AlgebraicStr(), DiffWithRespTo))
                                && (StrIsAConstant.equalsIgnoreCase("VarExpression"))
                                && (b.AlgebraicStr().contains(DiffWithRespTo + "^"))) {
                            String[] Temp1 = b.AlgebraicStr().split(DiffWithRespTo + "\\^");
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:FormVarStrVar:Inter:Temp1[1]=" + Temp1[1] + " StrVarExponent=" + StrVarExponent + " BAlgeStrExponent=" + BAlgeStrExponent + " Operator=" + (char) Operator + " OperVar=" + (char) OperVar);
                            }
                            if ((Temp1.length == 2) && (IsAConstant(Temp1[1], DiffWithRespTo))) {
                                BAlgeStrExponent = Double.parseDouble(Temp1[1]);
                                //StrVarExpr = StrVarExpr + "*" + b.AlgebraicStr();
                                if (Operator == '*') {
                                    StrVarExpr = DiffWithRespTo + "^" + (StrVarExponent + BAlgeStrExponent);
                                    if ((StrVarExponent + BAlgeStrExponent) > 0) {
                                        OperVar = '*';
                                    } else {
                                        OperVar = '/';
                                    }
                                } else if (Operator == '/') {
                                    StrVarExpr = DiffWithRespTo + "^" + (StrVarExponent - BAlgeStrExponent);
                                    if ((StrVarExponent - BAlgeStrExponent) > 0) {
                                        OperVar = '*';
                                    } else {
                                        OperVar = '/';
                                    }
                                }
                                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                    log.info("ConformalStr:FormVarStrVar:Final:StrVarExpr=" + StrVarExpr + " StrVarExponent=" + StrVarExponent + " BAlgeStrExponent=" + BAlgeStrExponent + " Operator=" + (char) Operator + " OperVar=" + (char) OperVar);
                                }
                            }
                        }// b.AlgebraicStr() is a b.AlgebraicStr is a Var
                        else if ((!IsAConstant(b.AlgebraicStr(), DiffWithRespTo))
                                && (StrIsAConstant.equalsIgnoreCase("Var"))
                                && (b.AlgebraicStr().equalsIgnoreCase(DiffWithRespTo))) {
                            BAlgeStrExponent = 1.0;
                            //StrVarExpr = StrVarExpr + "*" + b.AlgebraicStr();
                            if (Operator == '*') {
                                StrVarExpr = DiffWithRespTo + "^" + (StrVarExponent + BAlgeStrExponent);
                                if ((StrVarExponent + BAlgeStrExponent) > 0) {
                                    OperVar = '*';
                                } else {
                                    OperVar = '/';
                                }
                            } else if (Operator == '/') {
                                StrVarExpr = DiffWithRespTo + "^" + (StrVarExponent - BAlgeStrExponent);
                                if ((StrVarExponent - BAlgeStrExponent) > 0) {
                                    OperVar = '*';
                                } else {
                                    OperVar = '/';
                                }
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:FormVarStrVar:Final:StrVarExpr=" + StrVarExpr + " StrVarExponent=" + StrVarExponent + " BAlgeStrExponent=" + BAlgeStrExponent + " Operator=" + (char) Operator + " OperVar=" + (char) OperVar);
                            }
                        }
                    }
                } //StrVarExpr is a Var
                else if ((!IsAConstant(StrVarExpr, DiffWithRespTo))
                        && (StrIsAConstant.equalsIgnoreCase("Var"))
                        && (StrVarExpr.equalsIgnoreCase(DiffWithRespTo))) {
                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                        log.info("ConformalStr:FormVarStrVar:Inter:StrVarExponent=" + StrVarExponent + " BAlgeStrExponent=" + BAlgeStrExponent);
                    }
                    StrVarExponent = 1.0;
                    if ((!IsAConstant(b.AlgebraicStr(), DiffWithRespTo))
                            && (StrIsAConstant.equalsIgnoreCase("VarExpression"))
                            && (b.AlgebraicStr().contains(DiffWithRespTo + "^"))) {
                        String[] Temp1 = b.AlgebraicStr().split(DiffWithRespTo + "\\^");
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("ConformalStr:FormVarStrVar:Inter:Temp1[1]=" + Temp1[1] + " StrVarExponent=" + StrVarExponent + " BAlgeStrExponent=" + BAlgeStrExponent + " Operator=" + (char) Operator + " OperVar=" + (char) OperVar);
                        }
                        if ((Temp1.length == 2) && (IsAConstant(Temp1[1], DiffWithRespTo))) {
                            BAlgeStrExponent = Double.parseDouble(Temp1[1]);
                            //StrVarExpr = StrVarExpr + "*" + b.AlgebraicStr();
                            if (Operator == '*') {
                                if ((StrVarExponent + BAlgeStrExponent) > 0) {
                                    OperVar = '*';
                                    if ((StrVarExponent + BAlgeStrExponent) == 1) {
                                        StrVarExpr = DiffWithRespTo;
                                    } else {
                                        StrVarExpr = DiffWithRespTo + "^" + (StrVarExponent + BAlgeStrExponent);
                                    }
                                } else {
                                    OperVar = '/';
                                    if ((StrVarExponent + BAlgeStrExponent) == 1) {
                                        StrVarExpr = DiffWithRespTo;
                                    } else {
                                        StrVarExpr = DiffWithRespTo + "^" + (StrVarExponent + BAlgeStrExponent);
                                    }
                                }
                            } else if (Operator == '/') {
                                if ((StrVarExponent - BAlgeStrExponent) > 0) {
                                    OperVar = '*';
                                    if ((StrVarExponent - BAlgeStrExponent) == -1) {
                                        StrVarExpr = DiffWithRespTo;
                                    } else {
                                        StrVarExpr = DiffWithRespTo + "^" + (StrVarExponent - BAlgeStrExponent);
                                    }
                                } else {
                                    OperVar = '/';
                                    if ((StrVarExponent - BAlgeStrExponent) == -1) {
                                        StrVarExpr = DiffWithRespTo;
                                    } else {
                                        StrVarExpr = DiffWithRespTo + "^" + (StrVarExponent - BAlgeStrExponent);
                                    }
                                }
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:FormVarStrVar:Final:StrVarExpr=" + StrVarExpr + " StrVarExponent=" + StrVarExponent + " BAlgeStrExponent=" + BAlgeStrExponent + " Operator=" + (char) Operator + " OperVar=" + (char) OperVar);
                            }
                        }
                    }// b.AlgebraicStr() is a b.AlgebraicStr is a Var
                    else if ((!IsAConstant(b.AlgebraicStr(), DiffWithRespTo))
                            && (StrIsAConstant.equalsIgnoreCase("Var"))
                            && (b.AlgebraicStr().equalsIgnoreCase(DiffWithRespTo))) {
                        BAlgeStrExponent = 1.0;
                        //StrVarExpr = StrVarExpr + "*" + b.AlgebraicStr();
                        if (Operator == '*') {
                            StrVarExpr = DiffWithRespTo + "^" + (StrVarExponent + BAlgeStrExponent);
                            if ((StrVarExponent + BAlgeStrExponent) > 0) {
                                OperVar = '*';
                            } else {
                                OperVar = '/';
                            }
                        } else if (Operator == '/') {
                            StrVarExpr = DiffWithRespTo + "^" + (StrVarExponent - BAlgeStrExponent);
                            if ((StrVarExponent - BAlgeStrExponent) > 0) {
                                OperVar = '*';
                            } else {
                                OperVar = '/';
                            }
                        }
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("ConformalStr:FormVarStrVar:Final:StrVarExpr=" + StrVarExpr + " StrVarExponent=" + StrVarExponent + " BAlgeStrExponent=" + BAlgeStrExponent + " Operator=" + (char) Operator + " OperVar=" + (char) OperVar);
                        }
                    }
                }
                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                    log.info("ConformalStr:FormVarStrVar:Final:StrVarExpr=" + StrVarExpr + " StrVarExponent=" + StrVarExponent + " BAlgeStrExponent=" + BAlgeStrExponent + " Operator=" + (char) Operator + " OperVar=" + (char) OperVar);
                }
                return StrVarExpr;
            }

            String FormVarStrNum(AlgebraicConfrmStr b, int Operator, int OperNum) {
                Double StrNumber = 0.0;
                Double BAlgeStrNum = 0.0;
                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                    log.info("ConformalStr:FormVarStrNum:Initial:StrNumberExpr=" + StrNumberExpr + " b.AlgebraicStr()=" + b.AlgebraicStr() + " OperNum=" + (char) OperNum + " Operator=" + (char) Operator + " OperNumInMyMind=" + (char) OperNumInMyMind);
                }
                if ((StrNumberExpr == null) || (StrNumberExpr.equalsIgnoreCase(""))) {
                    StrNumberExpr = b.AlgebraicStr();
                    OperNum = Operator;
                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                        log.info("ConformalStr:FormVarStrNum:Initial:StrNumberExpr=" + StrNumberExpr + " b.AlgebraicStr()=" + b.AlgebraicStr() + " OperNum=" + (char) OperNum + " Operator=" + (char) Operator + " OperNumInMyMind=" + (char) OperNumInMyMind);
                    }
                } // Multiplication
                else if ((IsAConstant(StrNumberExpr, DiffWithRespTo))
                        && ((StrIsAConstant.equalsIgnoreCase("Number")) 
                            ||( (StrIsAConstant.equalsIgnoreCase("NumberExpression"))
                                && (StrNumberExpr.contains("*")) ) )
                        ) {
                    String[] TempMul = StrNumberExpr.split("\\*");
                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                        log.info("ConformalStr:FormVarStrNum:Inter:Mult:TempMul[0]=" + TempMul[0] + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum + " OperNum=" + (char) OperNum + " Operator=" + (char) Operator + " OperNumInMyMind=" + (char) OperNumInMyMind);
                    }
                    if (TempMul.length >= 1) {
                        StrNumber = Double.parseDouble(TempMul[0]);;
                        if ((IsAConstant(b.AlgebraicStr(), DiffWithRespTo))
                                && (StrIsAConstant.equalsIgnoreCase("NumberExpression"))
                                && (b.AlgebraicStr().contains("*"))) {
                            String[] Temp1Mul = b.AlgebraicStr().split("\\*");
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:FormVarStrNum:Inter:Mult:Temp1Mul[1]=" + Temp1Mul[1] + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum + " OperNum=" + (char) OperNum + " Operator=" + (char) Operator + " OperNumInMyMind=" + (char) OperNumInMyMind);
                            }
                            if (Temp1Mul.length == 2) {
                                BAlgeStrNum = Double.parseDouble(Temp1Mul[1]);
                                //StrNumberExpr = "" + ((Double) Double.parseDouble(StrNumberExpr) * Double.parseDouble(b.AlgebraicStr()));
                                if (Operator == '*') {
                                    StrNumberExpr = "" + (StrNumber * BAlgeStrNum);
                                    
                                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                        log.info("ConformalStr:FormVarStrNum:Inter:Mult:StrNumberExpr=" + StrNumberExpr + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum + " OperNum=" + (char) OperNum + " Operator=" + (char) Operator + " OperNumInMyMind=" + (char) OperNumInMyMind);
                                    }
                                } else if (Operator == '/') {
                                    //StrNumberExpr = "" + (StrNumber / BAlgeStrNum);
                                    StrNumberExpr = "" + (StrNumber) + "/" + (BAlgeStrNum);
                                    
                                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                        log.info("ConformalStr:FormVarStrNum:Inter:Mult:StrNumberExpr=" + StrNumberExpr + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum + " OperNum=" + (char) OperNum + " Operator=" + (char) Operator + " OperNumInMyMind=" + (char) OperNumInMyMind);
                                    }
                                }
                                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                    log.info("ConformalStr:FormVarStrNum:Final:Mult:StrNumberExpr=" + StrNumberExpr + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum + " OperNum=" + (char) OperNum + " Operator=" + (char) Operator + " OperNumInMyMind=" + (char) OperNumInMyMind);
                                }
                            }
                        }// b.AlgebraicStr() is a b.AlgebraicStr is a Number
                        else if ((IsAConstant(b.AlgebraicStr(), DiffWithRespTo))
                                && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                            BAlgeStrNum = Double.parseDouble(b.AlgebraicStr());
                            //StrNumberExpr = "" + ((Double) Double.parseDouble(StrNumberExpr) * Double.parseDouble(b.AlgebraicStr()));
                            if (Operator == '*') {
                                StrNumberExpr = "" + (StrNumber * BAlgeStrNum);
                                
                                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                    log.info("ConformalStr:FormVarStrNum:Inter:Mult:StrNumberExpr=" + StrNumberExpr + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum + " OperNum=" + (char) OperNum + " Operator=" + (char) Operator + " OperNumInMyMind=" + (char) OperNumInMyMind);
                                }
                            } else if (Operator == '/') {
                                //StrNumberExpr = "" + (StrNumber / BAlgeStrNum);
                                StrNumberExpr = "" + (StrNumber) + "/" + (BAlgeStrNum);
                                
                                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                    log.info("ConformalStr:FormVarStrNum:Inter:Mult:StrNumberExpr=" + StrNumberExpr + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum + " OperNum=" + (char) OperNum + " Operator=" + (char) Operator + " OperNumInMyMind=" + (char) OperNumInMyMind);
                                }
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:FormVarStrNum:Final:Mult:StrVarExpr=" + StrVarExpr + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum + " OperNum=" + (char) OperNum + " Operator=" + (char) Operator + " OperNumInMyMind=" + (char) OperNumInMyMind);
                            }
                        }
                    } //StrNumberExpr is a Number
                    else if ((IsAConstant(StrNumberExpr, DiffWithRespTo))
                            && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("ConformalStr:FormVarStrNum:Inter:Mult:StrNumber=" + StrNumber + " BAlgeStrExponent=" + BAlgeStrNum + " OperNum=" + (char) OperNum + " Operator=" + (char) Operator);
                        }
                        StrNumber = Double.parseDouble(StrNumberExpr);
                        if ((IsAConstant(b.AlgebraicStr(), DiffWithRespTo))
                                && (StrIsAConstant.equalsIgnoreCase("NumberExpression"))
                                && (b.AlgebraicStr().contains("\\*"))) {
                            String[] Temp1Mul = b.AlgebraicStr().split("\\*");
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:FormVarStrNum:Inter:Mult:Temp1Mul[0]=" + Temp1Mul[0] + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum + " OperNum=" + (char) OperNum + " Operator=" + (char) Operator + " OperNumInMyMind=" + (char) OperNumInMyMind);
                            }
                            if (Temp1Mul.length >= 1) {
                                BAlgeStrNum = Double.parseDouble(Temp1Mul[0]);
                                if (Operator == '*') {
                                    if ((StrNumber + BAlgeStrNum) > 0) {
                                        if ((StrNumber * BAlgeStrNum) == 1) {
                                            StrNumberExpr = DiffWithRespTo;
                                        } else {
                                            StrNumberExpr = "" + (StrNumber * BAlgeStrNum);
                                        }
                                        OperNum = '*';
                                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                            log.info("ConformalStr:FormVarStrNum:Inter:Mult:StrNumberExpr=" + StrNumberExpr + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum + " OperNum=" + (char) OperNum + " Operator=" + (char) Operator + " OperNumInMyMind=" + (char) OperNumInMyMind);
                                        }
                                    } else {

                                        if ((StrNumber * BAlgeStrNum) == 1) {
                                            StrNumberExpr = "" + BAlgeStrNum;
                                        } else {
                                            //StrNumberExpr = "" + (StrNumber / BAlgeStrNum);
                                            StrNumberExpr = "" + (StrNumber) + "/" + (BAlgeStrNum);
                                        }
                                        OperNum = '/';
                                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                            log.info("ConformalStr:FormVarStrNum:Inter:Mult:StrNumberExpr=" + StrNumberExpr + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum + " OperNum=" + (char) OperNum + " Operator=" + (char) Operator + " OperNumInMyMind=" + (char) OperNumInMyMind);
                                        }
                                    }
                                } else if (Operator == '/') {
                                    if ((StrNumber / BAlgeStrNum) > 0) {
                                        OperNum = '*';
                                        if ((StrNumber / BAlgeStrNum) == -1) {
                                            StrNumberExpr = "" + BAlgeStrNum;
                                        } else {
                                            //StrNumberExpr = "" + (StrNumber / BAlgeStrNum);
                                            StrNumberExpr = "" + (StrNumber) + "/" + (BAlgeStrNum);
                                        }
                                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                            log.info("ConformalStr:FormVarStrNum:Inter:Mult:StrNumberExpr=" + StrNumberExpr + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum + " OperNum=" + (char) OperNum + " Operator=" + (char) Operator + " OperNumInMyMind=" + (char) OperNumInMyMind);
                                        }
                                    } else {
                                        OperNum = '/';
                                        if ((StrNumber / BAlgeStrNum) == -1) {
                                            StrNumberExpr = "" + BAlgeStrNum;
                                        } else {
                                            //StrNumberExpr = "" + (StrNumber / BAlgeStrNum);
                                            StrNumberExpr = "" + (StrNumber) + "/" + (BAlgeStrNum);
                                        }
                                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                            log.info("ConformalStr:FormVarStrNum:Inter:Mult:StrNumberExpr=" + StrNumberExpr + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum + " OperNum=" + (char) OperNum + " Operator=" + (char) Operator + " OperNumInMyMind=" + (char) OperNumInMyMind);
                                        }
                                    }
                                }
                                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                    log.info("ConformalStr:FormVarStrNum:Final:Mult:StrNumberExpr=" + StrNumberExpr + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum + " OperNum=" + (char) OperNum + " Operator=" + (char) Operator + " OperNumInMyMind=" + (char) OperNumInMyMind);
                                }
                            }
                        }// b.AlgebraicStr() is a b.AlgebraicStr is a Number
                        else if ((IsAConstant(b.AlgebraicStr(), DiffWithRespTo))
                                && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                            BAlgeStrNum = Double.parseDouble(b.AlgebraicStr());
                            if ((Operator == '*') && (OperNum == '*')) {
                                StrNumberExpr = "" + (StrNumber * BAlgeStrNum);
                                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                    log.info("ConformalStr:FormVarStrNum:Inter:Mult:StrNumberExpr=" + StrNumberExpr + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum + " OperNum=" + (char) OperNum + " Operator=" + (char) Operator + " OperNumInMyMind=" + (char) OperNumInMyMind);
                                }
                            } else if ((Operator == '/') && (OperNum == '/')) {
                                StrNumberExpr = "" + (StrNumber * BAlgeStrNum);
                                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                    log.info("ConformalStr:FormVarStrNum:Inter:Mult:StrNumberExpr=" + StrNumberExpr + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum + " OperNum=" + (char) OperNum + " Operator=" + (char) Operator + " OperNumInMyMind=" + (char) OperNumInMyMind);
                                }
                            } else if ((Operator == '/') && (OperNum == '*')) {
                                OperNumInMyMind = '/';
                                //StrNumberExpr = "" + StrNumber +"/" + BAlgeStrNum;
                                StrNumberExpr = "1.0/" + BlackBoxNum(StrNumber, BAlgeStrNum, Operator, OperNum);
                                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                    log.info("ConformalStr:FormVarStrNum:Inter:Mult:StrNumberExpr=" + StrNumberExpr + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum + " OperNum=" + (char) OperNum + " Operator=" + (char) Operator + " OperNumInMyMind=" + (char) OperNumInMyMind);
                                }
                            } else if ((Operator == '*') && (OperNum == '/')) {
                                OperNumInMyMind = -1;
                                //StrNumberExpr = "" + BAlgeStrNum +  "/" + StrNumber ;
                                StrNumberExpr = "" + BlackBoxNum(StrNumber, BAlgeStrNum, Operator, OperNum);
                                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                    log.info("ConformalStr:FormVarStrNum:Inter:Mult:StrNumberExpr=" + StrNumberExpr + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum + " OperNum=" + (char) OperNum + " Operator=" + (char) Operator + " OperNumInMyMind=" + (char) OperNumInMyMind);
                                }
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:FormVarStrNum:Final:Mult:StrNumberExpr=" + StrNumberExpr + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum + " OperNum=" + (char) OperNum + " Operator=" + (char) Operator + " OperNumInMyMind=" + (char) OperNumInMyMind);
                            }
                        }
                    }
                }// DIVISION
                else if ((IsAConstant(StrNumberExpr, DiffWithRespTo))
                        && ((StrIsAConstant.equalsIgnoreCase("Number"))
                                ||((StrIsAConstant.equalsIgnoreCase("NumberExpression"))
                                    && (StrNumberExpr.contains("/")) ) )
                        ) {
                    String[] TempMul = StrNumberExpr.split("/");
                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                        log.info("ConformalStr:FormVarStrNum:Inter:Division:TempMul[0]=" + TempMul[0] + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum);
                    }
                    if (TempMul.length >= 1) {
                        StrNumber = Double.parseDouble(TempMul[1]);;
                        if ((IsAConstant(b.AlgebraicStr(), DiffWithRespTo))
                                && (StrIsAConstant.equalsIgnoreCase("NumberExpression"))
                                && (b.AlgebraicStr().contains("/"))) {
                            String[] Temp1Mul = b.AlgebraicStr().split("/");
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:FormVarStrNum:Inter:Division:Temp1Mul[1]=" + Temp1Mul[1] + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum);
                            }
                            if (Temp1Mul.length >= 2) {
                                BAlgeStrNum = Double.parseDouble(Temp1Mul[1]);
                                //StrNumberExpr = "" + ((Double) Double.parseDouble(StrNumberExpr) * Double.parseDouble(b.AlgebraicStr()));
                                if (Operator == '*') {
                                    StrNumberExpr = "" + (StrNumber * BAlgeStrNum);
                                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                        log.info("ConformalStr:FormVarStrNum:Inter:Division:StrNumberExpr=" + StrNumberExpr + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum + " OperNum=" + (char) OperNum);
                                    }
                                } else if (Operator == '/') {
                                    //StrNumberExpr = "" + (StrNumber / BAlgeStrNum);
                                    StrNumberExpr = "" + (StrNumber) + "/" + (BAlgeStrNum);
                                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                        log.info("ConformalStr:FormVarStrNum:Inter:Division:StrNumberExpr=" + StrNumberExpr + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum + " OperNum=" + (char) OperNum);
                                    }
                                }
                                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                    log.info("ConformalStr:FormVarStrNum:Final:Division:StrNumberExpr=" + StrNumberExpr + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum + " OperNum=" + (char) OperNum);
                                }
                            }
                        }// b.AlgebraicStr() is a b.AlgebraicStr is a Number
                        else if ((IsAConstant(b.AlgebraicStr(), DiffWithRespTo))
                                && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                            BAlgeStrNum = Double.parseDouble(b.AlgebraicStr());
                            //StrNumberExpr = "" + ((Double) Double.parseDouble(StrNumberExpr) * Double.parseDouble(b.AlgebraicStr()));
                            if (Operator == '*') {
                                StrNumberExpr = "" + (StrNumber * BAlgeStrNum);
                                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                    log.info("ConformalStr:FormVarStrNum:Inter:Division:StrNumberExpr=" + StrNumberExpr + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum + " OperNum=" + (char) OperNum);
                                }
                            } else if (Operator == '/') {
                                //StrNumberExpr = "" + (StrNumber / BAlgeStrNum);
                                //StrNumberExpr = "" + (StrNumber) + "/" + (BAlgeStrNum);
                                String[] TempMul1 = StrNumberExpr.split("/");
                                StrNumberExpr = TempMul1[0] + "/" + BlackBoxNum(StrNumber, BAlgeStrNum, Operator, OperNum);
                                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                    log.info("ConformalStr:FormVarStrNum:Inter:Division:StrNumberExpr=" + StrNumberExpr + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum + " OperNum=" + (char) OperNum);
                                }
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:FormVarStrNum:Final:Division:StrNumberExpr=" + StrNumberExpr + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum + " OperNum=" + (char) OperNum);
                            }
                        }
                    } //StrNumberExpr is a Number
                    else if ((IsAConstant(StrNumberExpr, DiffWithRespTo))
                            && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("ConformalStr:FormVarStrNum:Inter:Division:StrNumber=" + StrNumber + " BAlgeStrExponent=" + BAlgeStrNum);
                        }
                        StrNumber = Double.parseDouble(StrNumberExpr);
                        if ((IsAConstant(b.AlgebraicStr(), DiffWithRespTo))
                                && (StrIsAConstant.equalsIgnoreCase("NumberExpression"))
                                && (b.AlgebraicStr().contains("/"))) {
                            String[] Temp1Mul = b.AlgebraicStr().split("/");
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:FormVarStrNum:Inter:Division:Temp1Mul[0]=" + Temp1Mul[0] + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum);
                            }
                            if (Temp1Mul.length >= 1) {
                                BAlgeStrNum = Double.parseDouble(Temp1Mul[0]);
                                if (Operator == '*') {
                                    if ((StrNumber + BAlgeStrNum) > 0) {
                                        OperNum = '*';
                                        if ((StrNumber + BAlgeStrNum) == 1) {
                                            StrNumberExpr = DiffWithRespTo;
                                        } else {
                                            StrNumberExpr = "" + (StrNumber * BAlgeStrNum);
                                        }
                                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                            log.info("ConformalStr:FormVarStrNum:Inter:Division:StrNumberExpr=" + StrNumberExpr + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum + " OperNum=" + (char) OperNum);
                                        }
                                    } else {
                                        OperNum = '/';
                                        if ((StrNumber + BAlgeStrNum) == 1) {
                                            StrNumberExpr = "" + BAlgeStrNum;
                                        } else {
                                            //StrNumberExpr = "" + (StrNumber / BAlgeStrNum);
                                            StrNumberExpr = "" + (StrNumber) + "/" + (BAlgeStrNum);
                                        }
                                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                            log.info("ConformalStr:FormVarStrNum:Inter:Division:StrNumberExpr=" + StrNumberExpr + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum + " OperNum=" + (char) OperNum);
                                        }
                                    }
                                } else if (Operator == '/') {
                                    if ((StrNumber / BAlgeStrNum) > 0) {
                                        OperNum = '*';
                                        if ((StrNumber / BAlgeStrNum) == -1) {
                                            StrNumberExpr = "" + BAlgeStrNum;
                                        } else {
                                            //StrNumberExpr = "" + (StrNumber / BAlgeStrNum);
                                            StrNumberExpr = "" + (StrNumber) + "/" + (BAlgeStrNum);
                                        }
                                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                            log.info("ConformalStr:FormVarStrNum:Inter:Division:StrNumberExpr=" + StrNumberExpr + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum + " OperNum=" + (char) OperNum);
                                        }
                                    } else {
                                        OperNum = '/';
                                        if ((StrNumber / BAlgeStrNum) == -1) {
                                            StrNumberExpr = "" + BAlgeStrNum;
                                        } else {
                                            //StrNumberExpr = "" + (StrNumber / BAlgeStrNum);
                                            StrNumberExpr = "" + (StrNumber) + "/" + (BAlgeStrNum);
                                        }
                                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                            log.info("ConformalStr:FormVarStrNum:Inter:Division:StrNumberExpr=" + StrNumberExpr + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum + " OperNum=" + (char) OperNum);
                                        }
                                    }
                                }
                                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                    log.info("ConformalStr:FormVarStrNum:Final:Division:StrNumberExpr=" + StrNumberExpr + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum + " OperNum=" + (char) OperNum);
                                }
                            }
                        }// b.AlgebraicStr() is a b.AlgebraicStr is a Number
                        else if ((IsAConstant(b.AlgebraicStr(), DiffWithRespTo))
                                && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                            BAlgeStrNum = Double.parseDouble(b.AlgebraicStr());
                            if (Operator == '*') {
                                StrNumberExpr = "" + (StrNumber * BAlgeStrNum);
                                if ((StrNumber * BAlgeStrNum) > 0) {
                                    OperNum = '*';
                                } else {
                                    OperNum = '/';
                                }
                                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                    log.info("ConformalStr:FormVarStrNum:Inter:Division:StrNumberExpr=" + StrNumberExpr + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum + " OperNum=" + (char) OperNum);
                                }
                            } else if ((Operator == '/') && (OperNum == '/')) {
                                StrNumberExpr = "" + (StrNumber * BAlgeStrNum);
                                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                    log.info("ConformalStr:FormVarStrNum:Inter:Division:StrNumberExpr=" + StrNumberExpr + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum + " OperNum=" + (char) OperNum);
                                }
                            } else if ((Operator == '/') && (OperNum == '*')) {
                                //StrNumberExpr = "" + (StrNumber / BAlgeStrNum);
                                StrNumberExpr = "" + (StrNumber) + "/" + (BAlgeStrNum);
                                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                    log.info("ConformalStr:FormVarStrNum:Inter:Division:StrNumberExpr=" + StrNumberExpr + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum + " OperNum=" + (char) OperNum);
                                }
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:FormVarStrNum:Final:Division:StrNumberExpr=" + StrNumberExpr + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum + " OperNum=" + (char) OperNum);
                            }
                        }
                    }
                }else {
                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                    log.info("ConformalStr:FormVarStrNum:NEITHER MULT NOR DIVISION:StrNumberExpr=" + StrNumberExpr + " StrIsAConstant=" + StrIsAConstant + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum + " OperNum=" + (char) OperNum);
                }
                }
                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                    log.info("ConformalStr:FormVarStrNum:Final:StrNumberExpr=" + StrNumberExpr + " StrNumber=" + StrNumber + " BAlgeStrNum=" + BAlgeStrNum + " OperNum=" + (char) OperNum);
                }
                return StrNumberExpr;
            }

            AlgebraicConfrmStr parse() {
                StrExprStr = eatAll(str, ' ');
                AlgebraicConfrmStr x = (() -> "");
                if (StrExprStr == null) {
                    return x;
                } else if (StrExprStr.length() >= 1) {
                    posExprStr = 0;
                    chExprStr = StrExprStr.charAt(0);
                } else if (StrExprStr.length() <= 0) {
                    return x;
                }
                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                    log.info("ConformalStr:parse:Initial:StrExpr=" + StrExprStr);
                }
                if ((StrExprStr != null) && (StrExprStr.length() > 0)
                        && (StrExprStr.length() < 2)
                        && ((chExprStr == '*')
                        || (chExprStr == '/')
                        || (chExprStr == '^'))) {
                    return x;
                } else if ((chExprStr != 0) && (chExprStr != -1)) {
                    x = parseExpression();

                }
//                Map<String, Double> variables = new HashMap<>();
//                MathsContxtLAv.SimpleExpression expSimpleMap1 = (() -> "");
//                expSimpleMap1 = MathsContxtLAv.parseSimple(x.AlgebraicStr(), variables, DiffWithRespTo);
//                final String Temp=expSimpleMap1.SimpleExpr();
//                x = (()-> Temp );
                return x;
            }
            //Grammar:
            //expression = term | expression '+' term |expression '-' term
            //term = factor | term '*' factor | term '/' factor
            //factor = base | base ^ base
            //base = '-' base | '+' base | number | identifier |function expression | '(' expression ')'
            //

            AlgebraicConfrmStr parseExpression() {
                AlgebraicConfrmStr x = (() -> "");
                int ExprStartPos = posExprStr;
                int ExprEndPos = -1;

                if (posExprStr < 0) {
                    ExprStartPos = 0;
                }
                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                    log.info("ConformalStr:parseExpression:Initial:x.AlgebraicStr=" + x.AlgebraicStr());
                }
                x = parseTerm();
                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                    log.info("ConformalStr:parseExpression:Initial:x.AlgebraicStr=" + x.AlgebraicStr() + " chExprStr=" + (char) chExprStr + " pos=" + posExprStr);
                }
                for (;;) {
                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                        log.info("ConformalStr:parseExpression:Top:Inside Loop: parseExpression:chExprStr=" + (char) chExprStr + " pos=" + posExprStr);
                    }
                    if ((eatExpr('+'))) {// addition
                        if (/*(eatExpr('('))*/(chExprStr == '(')) {
                            Map<String, String> variablesBackupState = new HashMap<>();
                            BackupStateAll(variablesBackupState);
                            ChaosPreventionLowLevel();
                            final String StrX = x.AlgebraicStr();
                            AlgebraicConfrmStr a = (() -> StrX);
                            AlgebraicConfrmStr b = parseTerm();
                            final String StrA = a.AlgebraicStr();
                            final String Temp = b.AlgebraicStr();
                            if ((IsAConstant(StrA, DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Number")))
                                    && ((IsAConstant(Temp, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")))) {
                                x = (() -> "" + ((Double) Double.parseDouble(StrA) + Double.parseDouble(Temp)));
                            } else if ((IsAConstNumPermut0p0(a, b)) && (Temp.equalsIgnoreCase("0.0"))) {
                                x = (() -> a.AlgebraicStr());
                            } else if ((IsAConstNumPermut1p0(a, b)) && (Temp.equalsIgnoreCase("1.0"))) {
                                x = (() -> a.AlgebraicStr() + "+" + "1.0");
                            } else if (IsAConstPermut(a, b)) {
                                x = (() -> a.AlgebraicStr() + "+" + Temp);
                            } else if (IsAConstPermutExpr(a, b)) {
                                x = (() -> a.AlgebraicStr() + "+" + Temp);
                            } else if ((IsExtremity(StrA)) || (IsExtremity(b.AlgebraicStr()))) {
                                x = (() -> "" + Double.POSITIVE_INFINITY);
                            } else if (IsAConstNumPermutUnkeUnk(a, b)) {
                                x = (() -> StrA + "+" + Temp);
                            } else if (IsAConstNumExprHighNum(a, b)) {
                                x = (() -> StrA + "*" + Temp);
                            }
                            RestoreStateAll(variablesBackupState);
                            eatExpr(')');
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:parseExpression:x.eval=" + x.AlgebraicStr() + " a.AlgebraicStr()=" + a.AlgebraicStr() + " + b.AlgebraicStr()=" + b.AlgebraicStr());
                            }
                        } else {
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:parseExpression:Initial:+:x.eval=" + x.AlgebraicStr());
                            }
                            final String StrX = x.AlgebraicStr();
                            AlgebraicConfrmStr a = (() -> StrX);
                            AlgebraicConfrmStr b = parseTerm();
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:parseExpression:Initial:+:x.eval=" + x.AlgebraicStr() + " a.AlgebraicStr()=" + a.AlgebraicStr() + " + b.AlgebraicStr()=" + b.AlgebraicStr());
                            }
                            final String StrA = a.AlgebraicStr();
                            final String StrB = b.AlgebraicStr();
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:parseExpression:Initial:+:StrA=" + StrA + " a.AlgebraicStr()=" + a.AlgebraicStr() + " + StrB=" + StrB);
                            }
                            if ((IsAConstant(StrA, DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Number")))
                                    && (IsAConstant(StrB, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))
                                    && (Double.isFinite(Double.parseDouble(StrA))) && (Double.isFinite(Double.parseDouble(StrB)))) {
                                x = (() -> "" + ((Double) Double.parseDouble(StrA) + Double.parseDouble(StrB)));
                            } else if ((IsAConstNumPermut0p0(a, b)) && (StrB.equalsIgnoreCase("0.0"))) {
                                x = (() -> StrA);
                            } else if ((IsAConstNumPermut1p0(a, b)) && (StrB.equalsIgnoreCase("1.0"))) {
                                x = (() -> StrA + "+" + "1.0");
                            } else if (IsAConstPermut(a, b)) {
                                x = (() -> StrA + "+" + StrB);
                            } else if (IsAConstPermutExpr(a, b)) {
                                x = (() -> StrA + "+" + StrB);
                            } else if ((IsExtremity(StrA)) || (IsExtremity(StrB))) {
                                x = (() -> "" + Double.POSITIVE_INFINITY);
                            } else if (IsAConstNumPermutUnkeUnk(a, b)) {
                                x = (() -> StrA + "+" + StrB);
                            } else if (IsAConstNumExprHighNum(a, b)) {
                                x = (() -> StrA + "*" + StrB);
                            } else {
                                x = (() -> StrA + "+" + StrB);
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:parseExpression:x.eval=" + x.AlgebraicStr() + " a.AlgebraicStr()=" + a.AlgebraicStr() + " + b.AlgebraicStr()=" + b.AlgebraicStr());
                            }
                        }
                    } else if ((eatExpr('-'))) { // subtraction
                        if (/*(eatExpr('('))*/(chExprStr == '(')) {
                            Map<String, String> variablesBackupState = new HashMap<>();
                            BackupStateAll(variablesBackupState);
                            ChaosPreventionLowLevel();
                            final String StrX = x.AlgebraicStr();
                            AlgebraicConfrmStr a = (() -> StrX);
                            AlgebraicConfrmStr b = parseTerm();
                            final String StrA = a.AlgebraicStr();
                            final String Temp = b.AlgebraicStr();
                            if ((IsAConstant(StrA, DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Number")))
                                    && (IsAConstant(Temp, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))
                                    && (Double.isFinite(Double.parseDouble(StrA))) && (Double.isFinite(Double.parseDouble(Temp)))) {
                                x = (() -> "" + (Double) (Double.parseDouble(StrA) - Double.parseDouble(Temp)));
                            } else if ((IsAConstNumPermut0p0(a, b)) && (Temp.equalsIgnoreCase("0.0"))) {
                                x = (() -> StrA);
                            } else if ((IsAConstNumPermut1p0(a, b)) && (Temp.equalsIgnoreCase("1.0"))) {
                                x = (() -> StrA + "-" + "1.0");
                            } else if (IsAConstPermut(a, b)) {
                                x = (() -> StrA + "-" + Temp);
                            } else if (IsAConstPermutExpr(a, b)) {
                                x = (() -> StrA + "-" + Temp);
                            } else if ((IsExtremity(a.AlgebraicStr())) || (IsExtremity(b.AlgebraicStr()))) {
                                x = (() -> "" + Double.POSITIVE_INFINITY);
                            } else if (IsAConstNumPermutUnkeUnk(a, b)) {
                                x = (() -> StrA + "-" + Temp);
                            } else if (IsAConstNumExprHighNum(a, b)) {
                                x = (() -> StrA + "*" + Temp);
                            }
                            RestoreStateAll(variablesBackupState);
                            eatExpr(')');
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:parseExpression:x.eval=" + x.AlgebraicStr() + " a.AlgebraicStr()=" + a.AlgebraicStr() + "- b.AlgebraicStr()=" + b.AlgebraicStr());
                            }
                        } else {
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:parseExpression:Initial:+:x.eval=" + x.AlgebraicStr());
                            }
                            final String StrX = x.AlgebraicStr();
                            AlgebraicConfrmStr a = (() -> StrX);
                            AlgebraicConfrmStr b = parseTerm();
                            final String StrA = a.AlgebraicStr();
                            final String StrB = b.AlgebraicStr();
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:parseExpression:Initial:-:x.eval=" + x.AlgebraicStr() + " a.AlgebraicStr()=" + a.AlgebraicStr() + "- b.AlgebraicStr()=" + b.AlgebraicStr());
                            }
                            if ((IsAConstant(StrA, DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Number")))
                                    && (IsAConstant(StrB, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))
                                    && (Double.isFinite(Double.parseDouble(StrA))) && (Double.isFinite(Double.parseDouble(StrB)))) {
                                x = (() -> "" + (Double) (Double.parseDouble(StrA) - Double.parseDouble(StrB)));
                                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                    log.info("ConformalStr:parseExpression:x.eval=" + x.AlgebraicStr() + " a.AlgebraicStr()=" + a.AlgebraicStr() + "- b.AlgebraicStr()=" + b.AlgebraicStr() + " StrA=" + StrA + " StrB=" + StrB);
                                }
                            } else if ((IsAConstNumPermut0p0(a, b)) && (StrB.equalsIgnoreCase("0.0"))) {
                                x = (() -> StrA);
                            } else if ((IsAConstNumPermut1p0(a, b)) && (StrB.equalsIgnoreCase("1.0"))) {
                                x = (() -> StrA + "-" + "1.0");
                            } else if (IsAConstPermut(a, b)) {
                                x = (() -> StrA + "-" + StrB);
                            } else if (IsAConstPermutExpr(a, b)) {
                                x = (() -> StrA + "-" + StrB);
                            } else if ((IsExtremity(StrA)) || (IsExtremity(StrB))) {
                                x = (() -> "" + Double.POSITIVE_INFINITY);
                            } else if (IsAConstNumPermutUnkeUnk(a, b)) {
                                x = (() -> StrA + "-" + StrB);
                            } else if (IsAConstNumExprHighNum(a, b)) {
                                x = (() -> StrA + "*" + StrB);
                            } else {
                                x = (() -> StrA + "-" + StrB);
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:parseExpression:x.eval=" + x.AlgebraicStr() + " a.AlgebraicStr()=" + a.AlgebraicStr() + "- b.AlgebraicStr()=" + b.AlgebraicStr());
                            }
                        }
                    } else {
                        if ((posExprStr >= 0) && (posExprStr < StrExprStr.length())) {
                            ExprEndPos = posExprStr;
                        } else {
                            ExprEndPos = StrExprStr.length();
                        }
                        if ((ExprStartPos > ExprEndPos)) {
                            ExprEndPos = StrExprStr.length();
                        }
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("ConformalStr:parseExpression:Return Value:x.AlgebraicStr=" + x.AlgebraicStr() + " Expr=" + StrExprStr.substring(ExprStartPos, ExprEndPos));
                        }
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Warn.level) {
                            log.warn("ConformalStr:parseExpression:Return Value:x.AlgebraicStr=" + x.AlgebraicStr() + " Expr=" + StrExprStr.substring(ExprStartPos, ExprEndPos));
                        }
                        return x;
                    }
                }
            }

            AlgebraicConfrmStr parseTerm() {
                int TermStartPos = posExprStr;
                int TermEndPos = -1;
                AlgebraicConfrmStr x = (() -> "");
                boolean InitFlag = false;
                if (posExprStr < 0) {
                    TermStartPos = 0;
                }
                StrNumberExpr = "";
                StrVarExpr = "";
                StrIndConstExpr = "";
                if (chExprStr == '(') {
                    eatExpr('(');
                    x = parseExpression();
                    if (chExprStr == ')') {
                        eatExpr(')');
                    }
                } else {
                    x = parseFactor();
                }

                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                    log.info("ConformalStr:parseTerm:Initial:x.eval=" + x.AlgebraicStr());
                }
                if ((IsAConstant(x.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                    if ((StrNumberExpr == null) || (StrNumberExpr.equalsIgnoreCase(""))) {
                        StrNumberExpr = "" + ((Double) Double.parseDouble(x.AlgebraicStr()));
                    } else if ((IsAConstant(x.AlgebraicStr(), DiffWithRespTo))
                            && (StrIsAConstant.equalsIgnoreCase("Number"))
                            && (IsAConstant(StrNumberExpr, DiffWithRespTo))
                            && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                        StrNumberExpr = "" + ((Double) Double.parseDouble(StrNumberExpr));
                    }
                } else if ((!IsAConstant(x.AlgebraicStr(), DiffWithRespTo))
                        && ((StrIsAConstant.equalsIgnoreCase("Var"))
                        || (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
                    if ((StrVarExpr == null) || (StrVarExpr.equalsIgnoreCase(""))) {
                        StrVarExpr = x.AlgebraicStr();
                    } else if ((!IsAConstant(StrVarExpr, DiffWithRespTo))
                            && ((StrIsAConstant.equalsIgnoreCase("Var"))
                            || (StrIsAConstant.equalsIgnoreCase("VarExpression")))
                            && (!IsAConstant(x.AlgebraicStr(), DiffWithRespTo))
                            && ((StrIsAConstant.equalsIgnoreCase("Var"))
                            || (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
                        StrVarExpr = x.AlgebraicStr();
                    }
                } else if ((!IsAConstant(x.AlgebraicStr(), DiffWithRespTo))
                        && ((StrIsAConstant.equalsIgnoreCase("IndConstant"))
                        || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                    if ((StrIndConstExpr == null) || (StrIndConstExpr.equalsIgnoreCase(""))) {
                        StrIndConstExpr = x.AlgebraicStr();
                    } else if ((!IsAConstant(StrIndConstExpr, DiffWithRespTo))
                            && ((StrIsAConstant.equalsIgnoreCase("IndConstant"))
                            || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))
                            && (!IsAConstant(x.AlgebraicStr(), DiffWithRespTo))
                            && ((StrIsAConstant.equalsIgnoreCase("IndConstant"))
                            || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                        StrIndConstExpr = x.AlgebraicStr();
                    }
                }
                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                    log.info("ConformalStr:parseTerm:Init:StrNumberExpr=" + StrNumberExpr);
                }
                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                    log.info("ConformalStr:parseTerm:Init:StrVarExpr=" + StrVarExpr);
                }
                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                    log.info("ConformalStr:parseTerm:Init:StrIndConstExpr=" + StrIndConstExpr);
                }
                for (;;) {
                    if (eatExpr('*')) { // multiplication
                        InitFlag = true;
                        Operator = '*';
                        if (eatExpr('(')) {
                            //Map<String, String> variablesBackupState = new HashMap<>();
                            //BackupStateAll(variablesBackupState);
                            //ChaosPreventionLowLevel();
                            final String StrX = x.AlgebraicStr();
                            AlgebraicConfrmStr a = (() -> StrX);
                            AlgebraicConfrmStr b = parseExpression();
                            final String StrA = a.AlgebraicStr();
                            final String StrB = b.AlgebraicStr();
                            //RestoreStateAll(variablesBackupState);
                            eatExpr(')');
                            if ((IsAConstant(StrB, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                                if ((StrNumberExpr == null) || (StrNumberExpr.equalsIgnoreCase(""))) {
                                    //StrNumberExpr = "" + ((Double) Double.parseDouble(b.AlgebraicStr()));
                                    StrNumberExpr = FormVarStrNum(b, '*', OperNum);
                                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                        log.info("ConformalStr:parseTerm:*:Expr:Number:StrNumberExpr=" + StrNumberExpr + " Operator=" + "*" + " OperNum=" + OperNum + " OperNumInMyMind=" + (char) OperNumInMyMind);
                                    }
                                } else if ((IsAConstant(StrB, DiffWithRespTo))
                                        && (StrIsAConstant.equalsIgnoreCase("Number"))
                                        && (IsAConstant(StrNumberExpr, DiffWithRespTo))
                                        && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                                    //StrNumberExpr = "" + ((Double) Double.parseDouble(StrNumberExpr) * Double.parseDouble(b.AlgebraicStr()));
                                    StrNumberExpr = FormVarStrNum(b, '*', OperNum);
                                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                        log.info("ConformalStr:parseTerm:*:Expr:Number:StrNumberExpr=" + StrNumberExpr + " Operator=" + "*" + " OperNum=" + OperNum + " OperNumInMyMind=" + (char) OperNumInMyMind);
                                    }
                                }
                                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                    log.info("ConformalStr:parseTerm:*:Expr:Number:StrNumberExpr=" + StrNumberExpr + " Operator=" + "*" + " OperNum=" + OperNum);
                                }
                            } else if ((!IsAConstant(StrB, DiffWithRespTo))
                                    && ((StrIsAConstant.equalsIgnoreCase("Var"))
                                    || (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
                                if ((StrVarExpr == null) || (StrVarExpr.equalsIgnoreCase(""))) {
                                    StrVarExpr = FormVarStrVar(b, '*');
                                } else if ((!IsAConstant(StrVarExpr, DiffWithRespTo))
                                        && ((StrIsAConstant.equalsIgnoreCase("Var"))
                                        || (StrIsAConstant.equalsIgnoreCase("VarExpression")))
                                        && (!IsAConstant(StrB, DiffWithRespTo))
                                        && ((StrIsAConstant.equalsIgnoreCase("Var"))
                                        || (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
                                    //StrVarExpr = StrVarExpr + "*" + b.AlgebraicStr();
                                    StrVarExpr = FormVarStrVar(b, '*');
                                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                        log.info("ConformalStr:parseTerm:*:Expr:Var:StrVarExpr=" + StrVarExpr);
                                    }
                                }
                                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                    log.info("ConformalStr:parseTerm:*:Expr:Var:StrVarExpr=" + StrVarExpr);
                                }
                            } else if ((!IsAConstant(StrB, DiffWithRespTo))
                                    && ((StrIsAConstant.equalsIgnoreCase("IndConstant"))
                                    || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                                if ((StrIndConstExpr == null) || (StrIndConstExpr.equalsIgnoreCase(""))) {
                                    StrIndConstExpr = StrB;
                                } else if ((!IsAConstant(StrIndConstExpr, DiffWithRespTo))
                                        && ((StrIsAConstant.equalsIgnoreCase("IndConstant"))
                                        || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")) //|| (StrIsAConstant.equalsIgnoreCase("Unknown"))
                                        )
                                        && (!IsAConstant(StrB, DiffWithRespTo))
                                        && ((StrIsAConstant.equalsIgnoreCase("IndConstant"))
                                        || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                                    StrIndConstExpr = StrIndConstExpr + "*" + StrB;
                                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                        log.info("ConformalStr:parseTerm:*:Expr:IndConstant:StrIndConstExpr=" + StrIndConstExpr + " StrIsAConstant=" + StrIsAConstant);
                                    }
                                }
                                OperIndConst = '*';
                                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                    log.info("ConformalStr:parseTerm:*:Expr:IndConstant:StrIndConstExpr=" + StrIndConstExpr + " StrIsAConstant=" + StrIsAConstant);
                                }
                            }
                        } else {
                            final String StrX = x.AlgebraicStr();
                            AlgebraicConfrmStr a = (() -> StrX);
                            AlgebraicConfrmStr b = parseFactor();
                            final String StrA = a.AlgebraicStr();
                            final String StrB = b.AlgebraicStr();
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:parseTerm:*:StrNumberExpr=" + StrNumberExpr + " StrB=" + StrB + " OperNum=" + (char) OperNum);
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:parseTerm:*:StrVarExpr=" + StrVarExpr + " StrB=" + StrB + " OperVar=" + (char) OperVar);
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:parseTerm:*:StrIndConstExpr=" + StrIndConstExpr + " StrB=" + StrB + " OperIndConst=" + (char) OperIndConst);
                            }
                            if ((IsAConstant(StrB, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                                if ((StrNumberExpr == null) || (StrNumberExpr.equalsIgnoreCase(""))) {
                                    //StrNumberExpr = "" + ((Double) Double.parseDouble(b.AlgebraicStr()));
                                    StrNumberExpr = FormVarStrNum(b, '*', OperNum);
                                } else if ((IsAConstant(StrB, DiffWithRespTo))
                                        && (StrIsAConstant.equalsIgnoreCase("Number"))
                                        && (IsAConstant(StrNumberExpr, DiffWithRespTo))
                                        && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                                    //StrNumberExpr = "" + ((Double) Double.parseDouble(StrNumberExpr) * Double.parseDouble(b.AlgebraicStr()));
                                    StrNumberExpr = FormVarStrNum(b, '*', OperNum);
                                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                        log.info("ConformalStr:parseTerm:*:Number:StrNumberExpr=" + StrNumberExpr + " Operator=" + "*" + " OperNum=" + (char) OperNum + " OperNumInMyMind=" + (char) OperNumInMyMind);
                                    }
                                }
                                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                    log.info("ConformalStr:parseTerm:*:Number:StrNumberExpr=" + StrNumberExpr);
                                }
                            } else if ((!IsAConstant(StrB, DiffWithRespTo))
                                    && ((StrIsAConstant.equalsIgnoreCase("Var"))
                                    || (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
                                if ((StrVarExpr == null) || (StrVarExpr.equalsIgnoreCase(""))) {
                                    StrVarExpr = FormVarStrVar(b, '*');
                                } else if ((!IsAConstant(StrVarExpr, DiffWithRespTo))
                                        && ((StrIsAConstant.equalsIgnoreCase("Var"))
                                        || (StrIsAConstant.equalsIgnoreCase("VarExpression")))
                                        && (!IsAConstant(StrB, DiffWithRespTo))
                                        && ((StrIsAConstant.equalsIgnoreCase("Var"))
                                        || (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
                                    //StrVarExpr = StrVarExpr + "*" + b.AlgebraicStr();
                                    StrVarExpr = FormVarStrVar(b, '*');
                                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                        log.info("ConformalStr:parseTerm:*:Var:StrVarExpr=" + StrVarExpr);
                                    }
                                }
                                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                    log.info("ConformalStr:parseTerm:*:Var:StrVarExpr=" + StrVarExpr);
                                }
                            } else if ((!IsAConstant(StrB, DiffWithRespTo))
                                    && ((StrIsAConstant.equalsIgnoreCase("IndConstant"))
                                    || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                                if ((StrIndConstExpr == null) || (StrIndConstExpr.equalsIgnoreCase(""))) {
                                    StrIndConstExpr = StrB;
                                } else if ((!IsAConstant(StrIndConstExpr, DiffWithRespTo))
                                        && ((StrIsAConstant.equalsIgnoreCase("IndConstant"))
                                        || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")) //|| (StrIsAConstant.equalsIgnoreCase("Unknown"))
                                        )
                                        && (!IsAConstant(StrB, DiffWithRespTo))
                                        && ((StrIsAConstant.equalsIgnoreCase("IndConstant"))
                                        || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                                    StrIndConstExpr = StrIndConstExpr + "*" + StrB;
                                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                        log.info("ConformalStr:parseTerm:*:IndConstant:StrIndConstExpr=" + StrIndConstExpr + " StrIsAConstant=" + StrIsAConstant);
                                    }
                                }
                                OperIndConst = '*';
                                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                    log.info("ConformalStr:parseTerm:*:IndConstant:StrIndConstExpr=" + StrIndConstExpr + " StrIsAConstant=" + StrIsAConstant);
                                }
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:parseTerm:*:a.eval=" + a.AlgebraicStr());
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:parseTerm:*:b.eval=" + b.AlgebraicStr() + " Operator=" + (char) Operator);
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:parseTerm:*:x.eval=" + x.AlgebraicStr() + " a.AlgebraicStr()=" + a.AlgebraicStr() + "* b.AlgebraicStr()=" + b.AlgebraicStr());
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:parseTerm:*:StrNumberExpr=" + StrNumberExpr + " OperNum=" + (char) OperNum);
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:parseTerm:*:StrVarExpr=" + StrVarExpr + " OperVar=" + (char) OperVar);
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:parseTerm:*:StrIndConstExpr=" + StrIndConstExpr + " OperIndConst=" + (char) OperIndConst);
                            }
                        }
                    } else if (eatExpr('/')) { // division
                        InitFlag = true;
                        Operator = '/';
                        if (eatExpr('(')) {
                            //Map<String, String> variablesBackupState = new HashMap<>();
                            //BackupStateAll(variablesBackupState);
                            //ChaosPreventionLowLevel();
                            final String StrX = x.AlgebraicStr();
                            AlgebraicConfrmStr a = (() -> StrX);
                            AlgebraicConfrmStr b = parseExpression();
                            final String StrA = a.AlgebraicStr();
                            final String StrB = b.AlgebraicStr();
                            //RestoreStateAll(variablesBackupState);
                            eatExpr(')');
                            if ((IsAConstant(StrB, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                                if ((StrNumberExpr == null) || (StrNumberExpr.equalsIgnoreCase(""))) {
                                    //StrNumberExpr = "" + ((Double) Double.parseDouble(b.AlgebraicStr()));
                                    StrNumberExpr = FormVarStrNum(b, '/', OperNum);
                                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                        log.info("ConformalStr:parseTerm:*:Expr:Number:StrNumberExpr=" + StrNumberExpr + " Operator=" + "*" + " OperNum=" + (char) OperNum + " OperNumInMyMind=" + (char) OperNumInMyMind);
                                    }
                                } else if ((IsAConstant(StrB, DiffWithRespTo))
                                        && (StrIsAConstant.equalsIgnoreCase("Number"))
                                        && (IsAConstant(StrNumberExpr, DiffWithRespTo))
                                        && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                                    //StrNumberExpr = "" + ((Double) Double.parseDouble(StrNumberExpr) / Double.parseDouble(b.AlgebraicStr()));
                                    StrNumberExpr = FormVarStrNum(b, '/', OperNum);
                                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                        log.info("ConformalStr:parseTerm:*:Expr:Number:StrNumberExpr=" + StrNumberExpr + " Operator=" + "*" + " OperNum=" + (char) OperNum + " OperNumInMyMind=" + (char) OperNumInMyMind);
                                    }
                                }
                                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                    log.info("ConformalStr:parseTerm:/:Expr:Number:StrNumberExpr=" + StrNumberExpr);
                                }

                            } else if ((!IsAConstant(StrB, DiffWithRespTo))
                                    && ((StrIsAConstant.equalsIgnoreCase("Var"))
                                    || (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
                                if ((StrVarExpr == null) || (StrVarExpr.equalsIgnoreCase(""))) {
                                    StrVarExpr = FormVarStrVar(b, '/');
                                } else if ((!IsAConstant(StrVarExpr, DiffWithRespTo))
                                        && ((StrIsAConstant.equalsIgnoreCase("Var"))
                                        || (StrIsAConstant.equalsIgnoreCase("VarExpression")))
                                        && (!IsAConstant(StrB, DiffWithRespTo))
                                        && ((StrIsAConstant.equalsIgnoreCase("Var"))
                                        || (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
                                    //StrVarExpr = StrVarExpr + "/" + b.AlgebraicStr();
                                    StrVarExpr = FormVarStrVar(b, '/');
                                }
                                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                    log.info("ConformalStr:parseTerm:/:Expr:Var:StrVarExpr=" + StrVarExpr);
                                }
                            } else if ((!IsAConstant(StrB, DiffWithRespTo))
                                    && ((StrIsAConstant.equalsIgnoreCase("IndConstant"))
                                    || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                                if ((StrIndConstExpr == null) || (StrIndConstExpr.equalsIgnoreCase(""))) {
                                    StrIndConstExpr = "1.0" + "/" + StrB;
                                    OperIndConst = '*';
                                } else if ((!IsAConstant(StrIndConstExpr, DiffWithRespTo))
                                        && ((StrIsAConstant.equalsIgnoreCase("IndConstant"))
                                        || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")) //|| (StrIsAConstant.equalsIgnoreCase("Unknown"))
                                        )
                                        && (!IsAConstant(StrB, DiffWithRespTo))
                                        && ((StrIsAConstant.equalsIgnoreCase("IndConstant"))
                                        || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                                    StrIndConstExpr = StrIndConstExpr + "/" + StrB;
                                    OperIndConst = '/';
                                }
                            }
                        } else {
                            final String StrX = x.AlgebraicStr();
                            AlgebraicConfrmStr a = (() -> StrX);
                            AlgebraicConfrmStr b = parseFactor();
                            final String StrA = a.AlgebraicStr();
                            final String StrB = b.AlgebraicStr();
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:parseTerm:/:StrNumberExpr=" + StrNumberExpr + " OperNum=" + (char) OperNum);
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:parseTerm:/:StrVarExpr=" + StrVarExpr + " OperVar=" + (char) OperVar);
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:parseTerm:/:StrIndConstExpr=" + StrIndConstExpr + " OperIndConst=" + (char) OperIndConst);
                            }
                            if ((IsAConstant(StrB, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                                if ((StrNumberExpr == null) || (StrNumberExpr.equalsIgnoreCase(""))) {
                                    //StrNumberExpr = "" + ((Double) Double.parseDouble(b.AlgebraicStr()));
                                    StrNumberExpr = FormVarStrNum(b, '/', OperNum);
                                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                        log.info("ConformalStr:parseTerm:/:Number:Number:StrNumberExpr=" + StrNumberExpr + " Operator=" + "/" + " OperNum=" + (char) OperNum + " OperNumInMyMind=" + (char) OperNumInMyMind);
                                    }
                                } else if ((IsAConstant(StrB, DiffWithRespTo))
                                        && (StrIsAConstant.equalsIgnoreCase("Number"))
                                        && (IsAConstant(StrNumberExpr, DiffWithRespTo))
                                        && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                                    //StrNumberExpr = "" + ((Double) Double.parseDouble(StrNumberExpr) / Double.parseDouble(b.AlgebraicStr()));
                                    StrNumberExpr = FormVarStrNum(b, '/', OperNum);
                                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                        log.info("ConformalStr:parseTerm:/:Number:Number:StrNumberExpr=" + StrNumberExpr + " Operator=" + "/" + " OperNum=" + (char) OperNum + " OperNumInMyMind=" + (char) OperNumInMyMind);
                                    }
                                } else if ((IsAConstant(StrB, DiffWithRespTo))
                                        && (StrIsAConstant.equalsIgnoreCase("Number"))
                                        && (IsAConstant(StrNumberExpr, DiffWithRespTo))
                                        && (StrIsAConstant.equalsIgnoreCase("NumberExpression"))) {
                                    //StrNumberExpr = "" + ((Double) Double.parseDouble(StrNumberExpr) / Double.parseDouble(b.AlgebraicStr()));
                                    StrNumberExpr = FormVarStrNum(b, '/', OperNum);
                                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                        log.info("ConformalStr:parseTerm:/:Number:NumberExpression:StrNumberExpr=" + StrNumberExpr + " Operator=" + "/" + " OperNum=" + (char) OperNum + " OperNumInMyMind=" + (char) OperNumInMyMind);
                                    }
                                }
                                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                    log.info("ConformalStr:parseTerm:/:Number:StrNumberExpr=" + StrNumberExpr);
                                }

                            } else if ((!IsAConstant(StrB, DiffWithRespTo))
                                    && ((StrIsAConstant.equalsIgnoreCase("Var"))
                                    || (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
                                if ((StrVarExpr == null) || (StrVarExpr.equalsIgnoreCase(""))) {
                                    StrVarExpr = FormVarStrVar(b, '/');
                                } else if ((!IsAConstant(StrVarExpr, DiffWithRespTo))
                                        && ((StrIsAConstant.equalsIgnoreCase("Var"))
                                        || (StrIsAConstant.equalsIgnoreCase("VarExpression")))
                                        && (!IsAConstant(StrB, DiffWithRespTo))
                                        && ((StrIsAConstant.equalsIgnoreCase("Var"))
                                        || (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
                                    //StrVarExpr = StrVarExpr + "/" + b.AlgebraicStr();
                                    StrVarExpr = FormVarStrVar(b, '/');
                                }
                                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                    log.info("ConformalStr:parseTerm:/:Var:StrVarExpr=" + StrVarExpr);
                                }
                            } else if ((!IsAConstant(StrB, DiffWithRespTo))
                                    && ((StrIsAConstant.equalsIgnoreCase("IndConstant"))
                                    || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                                if ((StrIndConstExpr == null) || (StrIndConstExpr.equalsIgnoreCase(""))) {
                                    StrIndConstExpr = "1.0" + "/" + StrB;
                                    OperIndConst = '*';
                                } else if ((!IsAConstant(StrIndConstExpr, DiffWithRespTo))
                                        && ((StrIsAConstant.equalsIgnoreCase("IndConstant"))
                                        || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")) //|| (StrIsAConstant.equalsIgnoreCase("Unknown"))
                                        )
                                        && (!IsAConstant(StrB, DiffWithRespTo))
                                        && ((StrIsAConstant.equalsIgnoreCase("IndConstant"))
                                        || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                                    StrIndConstExpr = StrIndConstExpr + "/" + StrB;
                                    OperIndConst = '/';
                                }

                                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                    log.info("ConformalStr:parseTerm:/:IndConstant:StrIndConstExpr=" + StrIndConstExpr);
                                }
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:parseTerm:/:a.AlgebraicStr()=" + a.AlgebraicStr());
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:parseTerm:/:b.AlgebraicStr=" + b.AlgebraicStr() + " Operator=" + (char) Operator);
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:parseTerm:/:x.AlgebraicStr=" + x.AlgebraicStr() + " a.AlgebraicStr()=" + a.AlgebraicStr() + "/ b.AlgebraicStr()=" + b.AlgebraicStr());
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:parseTerm:/:StrNumberExpr=" + StrNumberExpr + " OperNum=" + (char) OperNum);
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:parseTerm:/:StrVarExpr=" + StrVarExpr + " OperVar=" + (char) OperVar);
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:parseTerm:/:StrIndConstExpr=" + StrIndConstExpr + " OperIndConst=" + (char) OperIndConst);
                            }
                        }
                    } else {
                        x = FormAlgebraicStr(x, InitFlag, Operator, OperIndConst, OperNum, OperVar);
                        if ((posExprStr >= 0) && (posExprStr < StrExprStr.length())) {
                            TermEndPos = posExprStr;
                        } else {
                            TermEndPos = StrExprStr.length();
                        }
                        if ((TermStartPos > TermEndPos)) {
                            TermEndPos = StrExprStr.length();
                        }
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("ConformalStr:parseTerm:Return Value:x.AlgebraicStr()=" + x.AlgebraicStr() + " Term=" + StrExprStr.substring(TermStartPos, TermEndPos));
                        }
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Warn.level) {
                            log.warn("ConformalStr:parseTerm:Return Value:x.AlgebraicStr()=" + x.AlgebraicStr() + " Term=" + StrExprStr.substring(TermStartPos, TermEndPos));
                        }
                        return x;
                    }
                }
            }

            AlgebraicConfrmStr parseFactor() {
                int FactorStartPos = posExprStr;
                int FactorEndPos = -1;
                if (posExprStr < 0) {
                    FactorStartPos = 0;
                }
                AlgebraicConfrmStr x = parseBase();
                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                    log.info("ConformalStr:parseFactor:Init:x.AlgebraicStr=" + x.AlgebraicStr());
                }
                for (;;) {
                    if (eatExpr('^')) { // exponentiation
                        if (eatExpr('(')) {
                            Map<String, String> variablesBackupState = new HashMap<>();
                            BackupStateAll(variablesBackupState);
                            ChaosPreventionLowLevel();
                            final String StrX = x.AlgebraicStr();
                            AlgebraicConfrmStr a = (() -> StrX);
                            AlgebraicConfrmStr b = parseExpression();
                            final String StrA = a.AlgebraicStr();
                            final String StrB = b.AlgebraicStr();
                            if ((IsAConstant(StrA, DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Number")))
                                    && (IsAConstant(StrB, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))
                                    && (Double.isFinite(Double.parseDouble(StrA))) && (Double.isFinite(Double.parseDouble(StrB)))) {
                                x = (() -> "" + Math.pow(Double.parseDouble(StrA), Double.parseDouble(StrB)));
                            } //else if (IsAConstNumPermut0p0(a, b)) {
                            //    x = (() ->""+ 1.0);
                            //}
                            else if ((IsAConstNumPermut1p0(a, b)) && (StrB.equalsIgnoreCase("1.0"))) {
                                x = (() -> StrA);
                            } else if (IsAConstPermut(a, b)) {
                                x = (() -> StrA + "^" + StrB);
                            } else if (IsAConstPermutExpr(a, b)) {
                                x = (() -> StrA + "^" + StrB);
                            } else if ((IsExtremity(StrA)) || (IsExtremity(StrB))) {
                                x = (() -> "" + Double.POSITIVE_INFINITY);
                            } else if (IsAConstNumPermutUnkeUnk(a, b)) {
                                x = (() -> StrA + "^" + StrB);
                            }
                            RestoreStateAll(variablesBackupState);
                            eatExpr(')');
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:parseFactor:x.eval=" + x.AlgebraicStr() + " Math.pow(a.AlgebraicStr()=" + a.AlgebraicStr() + "^ b.AlgebraicStr()=" + b.AlgebraicStr() + ")");
                            }
                        } else {
                            final String StrX = x.AlgebraicStr();
                            AlgebraicConfrmStr a = (() -> StrX);
                            AlgebraicConfrmStr b = parseBase();
                            final String StrA = a.AlgebraicStr();
                            final String StrB = b.AlgebraicStr();
                            if ((IsAConstant(StrA, DiffWithRespTo) && (StrIsAConstant.equalsIgnoreCase("Number")))
                                    && (IsAConstant(StrB, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))
                                    && (Double.isFinite(Double.parseDouble(StrA))) && (Double.isFinite(Double.parseDouble(StrB)))) {
                                x = (() -> "" + Math.pow(Double.parseDouble(StrA), Double.parseDouble(StrB)));
                                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                    log.info("ConformalStr:parseFactor:x.eval=" + x.AlgebraicStr() + " Math.pow(a.AlgebraicStr()=" + a.AlgebraicStr() + "^ b.AlgebraicStr()=" + b.AlgebraicStr() + ")");
                                }
                            } //else if (IsAConstNumPermut0p0(a, b)) {
                            //    x = (() ->""+ 1.0);
                            //}
                            else if ((IsAConstNumPermut1p0(a, b)) && (StrB.equalsIgnoreCase("1.0"))) {
                                x = (() -> StrA);
                            } else if (IsAConstPermut(a, b)) {
                                x = (() -> StrA + "^" + StrB);
                                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                    log.info("ConformalStr:parseFactor:x.eval=" + x.AlgebraicStr() + " a.AlgebraicStr()=" + a.AlgebraicStr() + "^ b.AlgebraicStr()=" + b.AlgebraicStr());
                                }
                            } else if (IsAConstPermutExpr(a, b)) {
                                x = (() -> StrA + "^" + StrB);
                                if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                    log.info("ConformalStr:parseFactor:x.eval=" + x.AlgebraicStr() + " a.AlgebraicStr()=" + a.AlgebraicStr() + "^ b.AlgebraicStr()=" + b.AlgebraicStr());
                                }
                            } else if ((IsExtremity(StrA)) || (IsExtremity(StrB))) {
                                x = (() -> "" + Double.POSITIVE_INFINITY);
                            } else if (IsAConstNumPermutUnkeUnk(a, b)) {
                                x = (() -> StrA + "^" + StrB);
                            }
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:parseFactor:x.eval=" + x.AlgebraicStr() + " a.AlgebraicStr()=" + a.AlgebraicStr() + "^ b.AlgebraicStr()=" + b.AlgebraicStr());
                            }
                        }
                    } else {
                        if ((posExprStr >= 0) && (posExprStr < StrExprStr.length())) {
                            FactorEndPos = posExprStr;
                        } else {
                            FactorEndPos = StrExprStr.length();
                        }
                        if ((FactorStartPos > FactorEndPos)) {
                            FactorEndPos = StrExprStr.length();
                        }
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("ConformalStr:parseFactor:FactorStartPos=" + FactorStartPos + " FactorEndPos=" + FactorEndPos);
                        }
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("ConformalStr:parseFactor:Return Value:x.eval=" + x.AlgebraicStr() + " Factor=" + StrExprStr.substring(FactorStartPos, FactorEndPos));
                        }
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Warn.level) {
                            log.warn("ConformalStr:parseFactor:Return Value:x.eval=" + x.AlgebraicStr() + " Factor=" + StrExprStr.substring(FactorStartPos, FactorEndPos));
                        }
                        return x;
                    }
                }
            }

            AlgebraicConfrmStr parseBase() {
                int startPos = posExprStr;
                AlgebraicConfrmStr x = (() -> "");

                if (eatExpr('-')) { // unary minus
                    AlgebraicConfrmStr b = parseBase();
                    if ((IsAConstant(b.AlgebraicStr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))
                            && (Double.isFinite(Double.parseDouble(b.AlgebraicStr())))) {
                        x = (() -> "" + ((Double) (-1.0) * Double.parseDouble(b.AlgebraicStr())));
                    } else if (IsAConstPermut(x, b)) {
                        x = (() -> "-" + b.AlgebraicStr());
                    } else if ((IsExtremity(b.AlgebraicStr()))) {
                        x = (() -> "" + Double.POSITIVE_INFINITY);
                    } else {
                        x = (() -> "-" + b.AlgebraicStr());
                    }
                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                        log.info("ConformalStr:parseBase:-:Return Value:x.eval=" + x.AlgebraicStr() + " startPos=" + startPos);
                    }
                    return x;
                } else if (eatExpr('+')) { // unary plus

                }

                if (IsNumber(chExprStr)) { //numbers
                    while (IsNumber(chExprStr)) {
                        nextCharExpr();
                        if ((chExprStr == 'E') || (chExprStr == 'e')) {
                            nextCharExpr();
                            if ((chExprStr == '-') || (chExprStr == '+')) {
                                nextCharExpr();
                            }
                        }
                    }
                    double xx = 1.0;
                    if ((StrExprStr != null) && (!StrExprStr.equalsIgnoreCase("")) && (!StrExprStr.equalsIgnoreCase("NaN")) && (posExprStr <= StrExprStr.length()) && (startPos <= (StrExprStr.length() - 1))) {
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("ConformalStr:parseBase: Number=" + StrExprStr.substring(startPos, posExprStr));
                        }
                        if ((IsAConstant(StrExprStr.substring(startPos, posExprStr), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                            xx = Double.parseDouble(StrExprStr.substring(startPos, posExprStr));
                        }
                    } else {
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("ConformalStr:parseBase:NaN:Exp Form: Number=" + StrExprStr.substring(startPos, posExprStr));
                        }
                        //xx=Double.parseDouble(String.format("%.12f"+StrRemoveEDbl(Str.substring(startPos, pos)) ) );
                        xx = Double.NaN;
                        posExprStr = -1;
                        chExprStr = -1;
                    }
                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                        log.info("ConformalStr:parseBase:Number:Return Value:x.eval=" + x.AlgebraicStr() + " xx=" + xx);
                    }
                    final Double XX = xx;
                    x = () -> "" + XX;
                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                        log.info("ConformalStr:parseBase:Number:Return Value:x.eval=" + x.AlgebraicStr() + " xx=" + xx);
                    }
                    return x;
                } else if (IsVariable(chExprStr)) {//functions & variables
                    while ((IsVariable(chExprStr)) || (IsNumber(chExprStr))) {
                        nextCharExpr();
                    }
                    String name = StrExprStr.substring(startPos, posExprStr).trim();
                    if (functionsSimple.containsKey(name)) {
                        final String FuncName = name;
                        eatExpr('(');//get open braces
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("ConformalStr:parseBase: Function:functionsSimple: name=" + name + " FuncName=" + FuncName + " x.AlgebraicStr()=" + x.AlgebraicStr() + " startPos=" + startPos + " DiffWithRespTo=" + DiffWithRespTo);
                        }
                        Map<String, String> variablesBackupState = new HashMap<>();
                        BackupStateAll(variablesBackupState);
                        ChaosPreventionLowLevel();
                        AlgebraicConfrmStr arg = parseExpression();
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("ConformalStr:parseBase: Function:functionsSimple: name=" + name + " FuncName=" + FuncName + " x.AlgebraicStr()=" + x.AlgebraicStr() + " arg.AlgebraicStr()=" + arg.AlgebraicStr() + " startPos=" + startPos + " DiffWithRespTo=" + DiffWithRespTo);
                        }
                        final String MyTemp = arg.AlgebraicStr();
                        x = (() -> "" + functionsSimple.get(FuncName) + "(" + MyTemp + ")");
                        RestoreStateAll(variablesBackupState);
                        eatExpr(')');
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("ConformalStr:parseBase: Function:functionsSimple: name=" + name + " FuncName=" + FuncName + " x.AlgebraicStr()=" + x.AlgebraicStr() + " arg.AlgebraicStr()=" + arg.AlgebraicStr() + " startPos=" + startPos + " DiffWithRespTo=" + DiffWithRespTo);
                        }
                    } else if (functions.containsKey(name)) {
                        final String FuncName = name;
                        DoubleUnaryOperator func = functions.get(name);
                        eatExpr('(');//get open braces
                        Map<String, String> variablesBackupState = new HashMap<>();
                        BackupStateAll(variablesBackupState);
                        AlgebraicConfrmStr arg = parseExpression();
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("ConformalStr:parseBase: Function:functionsSimple: name=" + name + " FuncName=" + FuncName + " x.AlgebraicStr()=" + x.AlgebraicStr() + " arg.AlgebraicStr()=" + arg.AlgebraicStr() + " startPos=" + startPos);
                        }
                        final String MyTemp = arg.AlgebraicStr();
                        if ((IsAConstant(arg.AlgebraicStr(), DiffWithRespTo))
                                && ((StrIsAConstant.equalsIgnoreCase("Number"))
                                || (StrIsAConstant.equalsIgnoreCase("NumberExpression")))) {
                            x = () -> "" + func.applyAsDouble(Double.parseDouble(MyTemp));
                        } else if (functionsSimple.containsKey(FuncName)) {
                            x = (() -> "" + functionsSimple.get(FuncName) + "(" + MyTemp + ")");
                            if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                                log.info("ConformalStr:parseBase: Function:functionsSimple: name=" + name + " FuncName=" + FuncName + " x.AlgebraicStr()=" + x.AlgebraicStr() + " arg.AlgebraicStr()=" + arg.AlgebraicStr() + " startPos=" + startPos);
                            }
                        }
                        RestoreStateAll(variablesBackupState);
                        eatExpr(')');
                        if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                            log.info("ConformalStr:parseBase: Function: name=" + name + " x.AlgebraicStr()=" + x.AlgebraicStr() + " arg.AlgebraicStr()=" + arg.AlgebraicStr() + " startPos=" + startPos);
                        }
                    } else {
                        if ((name != null) && (!name.equalsIgnoreCase("")) && (!name.equalsIgnoreCase("NaN")) && (!name.equalsIgnoreCase("Infinity")) && (variables.get(name) != null)) {
                            x = () -> variables.get(name);
                        } else if (name.equalsIgnoreCase("Infinity")) {
                            x = () -> "" + Double.POSITIVE_INFINITY;
                        } else if (name.equalsIgnoreCase("Nan")) {
                            x = () -> "" + Double.NaN;
                        }
                    }
                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                        log.info("ConformalStr:parseBase: Variable: name=" + name + " x.AlgebraicStr()=" + x.AlgebraicStr() + " startPos=" + startPos);
                    }
                    return x;
                } else if (chExprStr == ')') {
                    nextCharExpr();
                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                        log.info("ConformalStr:parseBase:):Return Value:x.eval=" + x.AlgebraicStr());
                    }
                    return x;
                } else {
                    if (((IsNotAnOperator(chExprStr)) && ((!IsNumber(chExprStr)) && (!IsVariable(chExprStr)))) && (chExprStr != 0) && (chExprStr != -1) && (chExprStr != '(')) {
                        if ((StrExprStr != null) && (startPos < StrExprStr.length()) && (startPos < posExprStr) && (chExprStr != -1) && (chExprStr != 0)) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "ConformalStr:parseBase:Unexpected: " + (char) chExprStr + " int=" + (int) chExprStr + " Cannot Format:" + StrExprStr.substring(posExprStr, StrExprStr.length()));
                        } else if ((chExprStr != -1) && (chExprStr != 0) && (posExprStr >= 1) && (posExprStr < StrExprStr.length()) && (IsNumber(chExprStr))) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "ConformalStr:parseBase:Please Check Code:Should not reach Here:Unexpected: " + (char) chExprStr + " int=" + (int) chExprStr + " Cannot Format:" + StrExprStr.substring(posExprStr, StrExprStr.length()));
                        } else if ((chExprStr != -1) && (chExprStr != 0) && (posExprStr >= 1) && (posExprStr < StrExprStr.length()) && (IsOperator(chExprStr))) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "ConformalStr:parseBase:Please Check Equation Operators / Code:Should not reach Here:Unexpected: " + (char) chExprStr + " int=" + (int) chExprStr + " Cannot Format:" + StrExprStr.substring(posExprStr, StrExprStr.length()));
                        } else if ((chExprStr != -1) && (chExprStr != 0) && (posExprStr >= 1) && (posExprStr < StrExprStr.length())) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "ConformalStr:parseBase:Unexpected: " + (char) chExprStr + " int=" + (int) chExprStr + " Cannot Format:" + StrExprStr.substring(posExprStr, StrExprStr.length()));
                        } else {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "ConformalStr:parseBase:Unexpected char: " + (char) chExprStr + " int=" + (int) chExprStr + " Cannot Format:" + StrExprStr.substring(posExprStr, StrExprStr.length()));
                        }
                    }
                    if (MyLogLevel.level >= ExprSimpleStrSep.LogLevel.Info.level) {
                        log.info("ConformalStr:parseBase:Exception:Return Value:x.eval=" + x.AlgebraicStr());
                    }
                    return x;
                }
            }
        }.parse();
    }

    /* **************************************************************/
 /* *************************** FrameWork Functions **************/
 /* **************************************************************/
    public static void main(String... args) {
        if (LowInitFlagRecordTime == false) {
            LocalDateTime current = LocalDateTime.now();
            String[] TimeTaken = current.toString().split(":");
            CompletionTime = Double.parseDouble(TimeTaken[1]);
            System.out.println("MathematicalTestHarness:Started:ExprSimpleStrSep:Run Started Time:" + current + " ");
        }
        String StartMyTestCase = "1000";//1000;1011  //Test Case Number : Options :All or a Single Number
        String EndMyTestCase = "110023";//110023; //Test Case Number : Options :All or a Single Number
        int MaxDiffOrder = 5; // Maximum Differentiation Order (with Answers): 5 :Integration Order (with Answers): 5;
        double NumberOfTestCases = Double.parseDouble(EndMyTestCase) - Double.parseDouble(StartMyTestCase);

        variables.put(TestDiffWithRespTo, "0.0");
        variables.put("Index", "1.0");
        variables.put("StartMyTestCase", "" + Double.parseDouble(StartMyTestCase));
        String Exprn = "Index*x+StartMyTestCase";
        System.out.println(" MathematicalTestHarness:TestHarness Equation=" + Exprn);

        ExprSimpleStrSep.ExprSimpleStr expValue;
        expValue = parse(Exprn, variables, TestDiffWithRespTo, "Silent", ExprSimpleStrSep.LogLevel.Off);
        StartMyTestCase = "" + Math.round(Double.parseDouble(expValue.evalStr()));
        System.out.println(" MathematicalTestHarness:Result(Expn Value:StartMyTestCase)=" + expValue.evalStr());
        variables.put(TestDiffWithRespTo, "" + NumberOfTestCases);
        expValue = parse(Exprn, variables, TestDiffWithRespTo, "Silent", ExprSimpleStrSep.LogLevel.Off);
        EndMyTestCase = "" + Math.round(Double.parseDouble(expValue.evalStr()));
        System.out.println(" MathematicalTestHarness:Result(Expn Value:EndMyTestCase)=" + expValue.evalStr());

        String TestCaseType = "LimitedRegression";//Test Suite Type:Individual OR LimitedRegression OR Regression
        //Options( MaxDiffOrder, StartMyTestCase, EndMyTestCase , TestCaseType);
        String xExprn = "Regression";
        System.out.println("1) Run Regression OR " );
        System.out.println("2) 1 Equation Demo(UserInteractive)(Demo) OR " );
        System.out.println("3) HghLvlExprODE (ODE)");
        System.out.println("4) Schrodinger(Schro) OR " );
        System.out.println("5) FunctionComposition(FOG) OR " );
        System.out.print("6) String Vibration(String)(StringVibration): [" + xExprn + "]:" );
        Scanner scanner = new Scanner(System.in);
        String TempxExprn = xExprn.trim();
        TempxExprn = scanner.nextLine();
        if (TempxExprn.equalsIgnoreCase("")) {
            ;
        } else if ( (TempxExprn.equalsIgnoreCase("Regression"))||(TempxExprn.equalsIgnoreCase("1"))) {
            ;
        } else if ((TempxExprn.equalsIgnoreCase("2")) ||(TempxExprn.equalsIgnoreCase("Demo")) || (TempxExprn.equalsIgnoreCase("UserInteractive"))) {
            xExprn = "UserInteractive";
        } else if ((TempxExprn.equalsIgnoreCase("HghLvlExprODE"))||(TempxExprn.equalsIgnoreCase("ODE"))||(TempxExprn.equalsIgnoreCase("3")) ){
            xExprn = "HghLvlExprODE";
        }else if ((TempxExprn.equalsIgnoreCase("Schrodinger"))||(TempxExprn.equalsIgnoreCase("Schro"))||(TempxExprn.equalsIgnoreCase("4")) ) {
            xExprn = "Schrodinger";
        }else if ((TempxExprn.equalsIgnoreCase("FOG"))||(TempxExprn.equalsIgnoreCase("FunctionComposition"))||(TempxExprn.equalsIgnoreCase("5")) ) {
            xExprn = "FOG";
        }else if ((TempxExprn.equalsIgnoreCase("String"))||(TempxExprn.equalsIgnoreCase("StringVibration"))||(TempxExprn.equalsIgnoreCase("6")) ) {
            xExprn = "StringVibration";
        }if (TempxExprn.equalsIgnoreCase("")) {
            ;
        } else if ( (TempxExprn.equalsIgnoreCase("Regression"))||(TempxExprn.equalsIgnoreCase("1"))) {
            ;
        } else if ((TempxExprn.equalsIgnoreCase("2")) ||(TempxExprn.equalsIgnoreCase("Demo")) || (TempxExprn.equalsIgnoreCase("UserInteractive"))) {
            xExprn = "UserInteractive";
        } else if ((TempxExprn.equalsIgnoreCase("HghLvlExprODE"))||(TempxExprn.equalsIgnoreCase("ODE"))||(TempxExprn.equalsIgnoreCase("3")) ){
            xExprn = "HghLvlExprODE";
        }else if ((TempxExprn.equalsIgnoreCase("Schrodinger"))||(TempxExprn.equalsIgnoreCase("Schro"))||(TempxExprn.equalsIgnoreCase("4")) ) {
            xExprn = "Schrodinger";
        }else if ((TempxExprn.equalsIgnoreCase("FOG"))||(TempxExprn.equalsIgnoreCase("FunctionComposition"))||(TempxExprn.equalsIgnoreCase("5")) ) {
            xExprn = "FOG";
        }else if ((TempxExprn.equalsIgnoreCase("String"))||(TempxExprn.equalsIgnoreCase("StringVibration"))||(TempxExprn.equalsIgnoreCase("6")) ) {
            xExprn = "StringVibration";
        }
        xExprn = xExprn.trim();
        xExprn = eatAll(xExprn, ' ');
        System.out.println("You Entered:" + xExprn);
        if (xExprn.equalsIgnoreCase("Regression")) {
            System.out.println(" MathematicalTestHarness:MaxDiffOrder=" + MaxDiffOrder);
            TestHarnessClass MyTestData = new TestHarnessClass(14, StartMyTestCase, EndMyTestCase, TestCaseType);
            TestDiff(MaxDiffOrder, MyTestData);
            MyTestData = new TestHarnessClass(14, StartMyTestCase, EndMyTestCase, TestCaseType);
            TestIntegr(MaxDiffOrder, MyTestData);
            //TestPredicateMisc();
        } else if (xExprn.equalsIgnoreCase("UserInteractive")) {
            mainProdUser();
        } else if (xExprn.equalsIgnoreCase("HghLvlExprODE")) {
            TestHarnessClass MyTestData = new TestHarnessClass(14, StartMyTestCase, EndMyTestCase, TestCaseType);
            mainRegresssionHghLvlExprODETest(MaxDiffOrder, MyTestData);
        } else if (xExprn.equalsIgnoreCase("Schrodinger")) {
            mainSchrodinger();
        } else if (xExprn.equalsIgnoreCase("FOG")) {
            VerifyInverse( "x+5",  "x",  "y-5", "y");
            String xExprn1="";
            Scanner scanner1 = new Scanner(System.in);
            String TempxExprn1 = xExprn1.trim();
            TempxExprn1 = scanner1.nextLine();
        }else if (xExprn.equalsIgnoreCase("StringVibration")) {
            mainSchrodinger();
        }
        if (LowInitFlagRecordTime == false) {
            LocalDateTime current = LocalDateTime.now();
            String[] TimeTaken = current.toString().split(":");
            CompletionTime = Double.parseDouble(TimeTaken[1]) - CompletionTime;
            System.out.println("MathematicalTestHarness:Completed:Run Started Time:" + current + " " + " CompletionTime=" + CompletionTime + " minutes");
            LowInitFlagRecordTime = true;
        }
    }

    public static void mainRegresssionDiffTest(int MaxOrder, TestHarnessClass TestData) {
        int MaxOrder1 = MaxOrder;
        String Exprn = "";
        String OverallRegressionStatus = "Diff:Pass All (4000 to 110023) Except Test Cases: "
                + "\n" + "TestCases:Unit Test Cases" + " All Passing"
                + "\n" + "TestCases:Names " + " All Passing"
                + "\n" + "TestCases:Coefficients " + " 20016 , 20017"
                + "\n" + "TestCases:Exponent " + " 30006 to 30008"
                + "\n" + "TestCases:Parentheses " + " 80001 to 80024";
        System.out.print(ConsoleColors.BLUE + "Diff Overall Regression Status" + OverallRegressionStatus + ConsoleColors.RESET);
        System.out.print(System.lineSeparator());
        if (EndTestCase > LastTestCaseHarness) {
            EndTestCase = LastTestCaseHarness;
        }
        System.out.print(ConsoleColors.BLUE + "Diff EndTestCase=" + EndTestCase + " LastTestCaseHarness=" + LastTestCaseHarness + ConsoleColors.RESET);
        System.out.print(System.lineSeparator());
        if (EndTestCase < TestCase) {
            EndTestCase = TestCase;
        }
        int j = (int)TestCase;
        FailedTestCases = new HashMap<Integer, String>();
        ExceptionTestCases = new HashMap<Integer, String>();
        cause = new Throwable();
        TotalTestCases = 0;
        ByPassedTestCases = 0;
        MissedNumberTestCases = 0;
        MissedTestCasesInfinity = 0;
        MissedTestCasesException = 0;

        MaxIndexExcept = 0;
        MaxIndexFail = 0;
        SectionIndexFail = 1;
        FailedTestCount = 0;
        int OldFailedTestCount = FailedTestCount;
        SectionStart = TestCase;
        EqnDB = new HashMap<>();
        ExceptionStringDB = new HashMap<Integer, String>();
        EqnDBIndex = 0;
        EqnDBDupCount = 0;
        int OldDups = EqnDBDupCount;
        int OldTestCase = j;
        int OldMaxIndexFail = 0;
        int OldTotalTestCases = 0;
        int OldKnwnI=0;
        int OldKnwnISectionStart=0;
        int OldInvertAnsBothFlippedCount=0;
        int OldInvertAnsFlippedCount=0;
        boolean DupFlag = false;
        while (j <= EndTestCase) {
            EqnUnderTest = "";
            if (j==SectionTestCaseStart)
                OldKnwnI=KnownIssues;
            DupFlag = false;
            String TempExprn = "";

            TempExprn = TestHarnessDiff("mainDiffTest", j,"");
            Exprn = eatAll(TempExprn, ' ');
            DupFlag = DupChecknInsert(j);

            TestCasePassHighLevelFlag = true;
            if (MaxOrder == -1) {
                MaxOrder1 = MaxDiffOrder; //From Test Case
            } else if (MaxOrder >= MaxDiffOrder) {
                MaxOrder1 = MaxDiffOrder;
            } else {
                MaxOrder1 = MaxOrder;
            }
            OldMaxIndexFail = MaxIndexFail;
            if ((!EqnUnderTest.equalsIgnoreCase("")) && ((DupFlag == false))) {
                DiffSingleHighTestCase(MaxOrder1, Exprn);
                System.out.println(ConsoleColors.RED + "mainDiffTest: j=" + j + " TestCase=" + TestCase);
                if (DupFlag == false) {
                    TotalTestCases++;
                }
            } else if (DupFlag == true) {
                System.out.println(ConsoleColors.RED + "mainDiffTest: j=" + j + " TestCase=" + TestCase + " Dup. Hence NOT Executing.");

            } else if (EqnUnderTest.equalsIgnoreCase("")) {
                ByPassedTestCases++;
            }

            if (TestCasePassHighLevelFlag == false) {
                     MaxIndexFail++;
                    if (DupFlag == false) {
                        FailedTestCount++;
                    }
            }
                OldTestCase = j;
                j = RegressionControl(j);
                if (((j - OldTestCase) > 1)) {
                    if (j==SectionTestCaseEnd)
                    OldKnwnI=KnownIssues-OldKnwnISectionStart;
                    GapProcess("mainDiffTest", j, OldTotalTestCases, OldTestCase, OldMaxIndexFail, OldFailedTestCount, OldDups, OldKnwnI,EqnDBDupCount,OldInvertAnsBothFlippedCount,OldInvertAnsFlippedCount);
                    OldFailedTestCount = FailedTestCount;
                    OldDups = EqnDBDupCount;
                    SectionStart = j;
                    OldTotalTestCases = TotalTestCases;
                    if (j == SectionTestCaseEnd) {
                    OldInvertAnsBothFlippedCount=InvertAnsBothFlippedCount;
                    OldInvertAnsFlippedCount=InvertAnsFlippedCount;
                    }
                }
                TestCase = j;
            
        }
        GapProcess("mainDiffTest", j, OldTotalTestCases, OldTestCase, OldMaxIndexFail,  OldFailedTestCount, OldDups, OldKnwnI,EqnDBDupCount,0,0);

        int k = 0;
        for (int y = 0; (y < EqnDB.size()); y++) {
            String Temp = EqnDB.get(y);
            if ((Temp != null) && (Temp.contains(":Dup with"))) {
                k++;
            }
        }
        System.out.println(ConsoleColors.RED + "mainDiffTest: TestCase Summary : Total Failed=" + FailedTestCount + " Out of Run TestCases-Dups=" + (TotalTestCases) + " Passed Count=" + (TotalTestCases - FailedTestCount) + ConsoleColors.RESET);
        System.out.println(ConsoleColors.RED + "mainDiffTest: TestCase Summary : DupCount=" + k + " Total Exceptions=" + MaxIndexExcept + ConsoleColors.RESET);
        System.out.println(ConsoleColors.RED + "mainDiffTest: TestCase Summary : ByPassedTestCases=" + ByPassedTestCases + " MissedNumberTestCases=" + MissedNumberTestCases + " MissedTestCasesInfinity=" + MissedTestCasesInfinity + " MissedTestCasesException=" + MissedTestCasesException + ConsoleColors.RESET);
        for (int y = 0; (MaxIndexFail >= 0) && (FailedTestCases != null) && (y < FailedTestCases.size()); y++) {
            if ((FailedTestCases.get(y).contains("Section")) && (FailedTestCases.get(y).contains("Complete # of Failures="))) {
                System.out.print(ConsoleColors.GREEN + FailedTestCases.get(y) + ConsoleColors.RESET);
            }
        }
        System.out.print(System.lineSeparator());
        System.out.println(ConsoleColors.RED + "mainDiffTest: TestCase Summary : " + " Failed Test Cases are:" + ConsoleColors.RESET);

        for (int y = 0; y < MaxIndexFail; y++) {
            System.out.print(ConsoleColors.RED + " " + FailedTestCases.get(y) + ", " + ConsoleColors.RESET);
            if ((y != 0) && (y % 5 == 0)) {
                System.out.print(System.lineSeparator());
            }
        }
        System.out.print(System.lineSeparator());
        System.out.println(ConsoleColors.RED + "mainDiffTest: Exception TestCase Summary : Total Exceptions=" + MaxIndexExcept + " Exception Test Cases are:" + ConsoleColors.RESET);
        for (int y = 0; y < MaxIndexExcept; y++) {
            System.out.print(ConsoleColors.RED + " " + ExceptionTestCases.get(y) + ", " + ConsoleColors.RESET);
            if ((y != 0) && (y % 5 == 0)) {
                System.out.print(System.lineSeparator());
            }
        }
        System.out.print(System.lineSeparator());
        System.out.println(ConsoleColors.RED + "mainDiffTest: TestCase Duplicate Summary : " + " EqnDBIndex=" + EqnDBIndex + ConsoleColors.RESET);
        for (int y = 0; (y < EqnDB.size()); y++) {
            String Temp = EqnDB.get(y);
            if ((Temp != null) && (Temp.contains(":Dup with"))) {
                System.out.print(ConsoleColors.GREEN + EqnDB.get(y) + ConsoleColors.RESET);
                System.out.print(System.lineSeparator());
            }
        }
        System.out.println(ConsoleColors.RED + "mainDiffTest: TestCase Duplicate Summary : Total Dups=" + k + ConsoleColors.RESET);
        System.out.print(System.lineSeparator());
        for (int y = 0; y < MaxIndexExcept; y++) {
            System.out.println(ConsoleColors.RED + " " + ExceptionStringDB.get(y) + ", " + ConsoleColors.RESET);
        }
        System.out.print(System.lineSeparator());
    }

    public static int RegressionControl(int j) {
        if ((j >= 1000) && (j <= 1024)) {
            j++;
        } else if ((j >= 2000) && (j <= 2019)) {
            j++;
        } else if ((j >= 3000) && (j <= 3003)) {
            j++;
        } else if ((j >= 4000) && (j <= 4032)) {
            j++;
        } else if ((j >= 5019) && (j <= 5048)) {
            j++;
        } else if ((j >= 10001) && (j <= 10010)) {
            j++;
        } else if ((j >= 20001) && (j <= 20069)) {
            j++;
        } else if ((j >= 30001) && (j < 30011)) {
            j++;
        } else if ((j >= 40001) && (j <= 40049)) {
            j++;
        } else if ((j >= 50001) && (j <= 50093)) {
            j++;
        } else if ((j >= 80000) && (j <= 80097)) {
            j++;
        } else if ((j >= 90000) && (j <= 90015)) {
            j++;
        } else if ((j >= 100000) && (j <= 100004)) {
            j++;
        } else if ((j >= 110001) && (j <= 110023)) {
            j++;
        } //Bypass Gaps Section
        else if ((j < 1000)) {
            j = 1000;
        } else if ((j == 1025)) {
            j = 2000;
        } else if ((j == 2020)) {
            j = 3000;
        } else if ((j == 3004)) {
            j = 4000;
        } else if ((j == 4033)) {
            j = 5019;
        } else if (j == 5049) {
            j = 10001;
        } else if (j == 10011) {
            j = 20001;
        } else if (j == 20070) {
            j = 30001;
        } else if (j == 30011) {
            j = 40001;
        } else if (j == 40050) {
            j = 50001;
        } else if (j == 50094) {
            j = 80000;
        } else if (j == 80098) {
            j = 90000;
        } else if (j == 90016) {
            j = 100000;
        } else if (j == 100005) {
            j = 110001;
        } else if (j == 110024) {
            j = 120001;
        } else {
            System.out.println(ConsoleColors.RED + "RegressionControl:j= " + j + ": Infinite Loop" + ConsoleColors.RESET);
        }
        return j;

    }

    public static void TestDiff(int MaxDiffOrder, TestHarnessClass MyTestData) {
        mainRegresssionDiffTest(MaxDiffOrder, MyTestData);
    }

    public static void TestIntegr(int MaxDiffOrder, TestHarnessClass MyTestData) {
        mainRegressionIntegrTest(MaxDiffOrder, MyTestData);
    }

    public static void mainRegressionIntegrTest(int MaxOrder, TestHarnessClass TestData) {
        int MaxOrder1 = MaxOrder;
        String Exprn = "";
        String OverallRegressionStatus = "Integral:Pass All (100 to 110023) Except Test Cases: "
                + "\n" + "TestCases:Unit Test Cases" + " All Passing"
                + "\n" + "TestCases:Names " + " All Passing"
                + "\n" + "TestCases:Coefficients " + " 20016 , 20017"
                + "\n" + "TestCases:Exponent " + " 30006 to 30008"
                + "\n" + "TestCases:Parentheses " + " 80001 to 80024";
        System.out.print(ConsoleColors.BLUE + "Integral Overall Regression Status" + OverallRegressionStatus + ConsoleColors.RESET);
        System.out.print(System.lineSeparator());
        if (EndTestCase > LastTestCaseHarness) {
            EndTestCase = LastTestCaseHarness;
        }
        System.out.println(ConsoleColors.BLUE + "Integral EndTestCase=" + EndTestCase + " LastTestCaseHarness=" + LastTestCaseHarness + ConsoleColors.RESET);
        if (EndTestCase < TestCase) {
            EndTestCase = TestCase;
        }
        int j = (int)TestCase;
        FailedTestCases = new HashMap<Integer, String>();
        ExceptionTestCases = new HashMap<Integer, String>();
        TotalTestCases = 0;
        ByPassedTestCases = 0;
        MissedNumberTestCases = 0;
        MissedTestCasesInfinity = 0;
        MissedTestCasesException = 0;
        MaxIndexExcept = 0;
        MaxIndexFail = 0;
        SectionIndexFail = 1;
        FailedTestCount = 0;
        int OldFailedTestCount = FailedTestCount;
        SectionStart = TestCase;
        EqnDB = new HashMap<>();
        ExceptionStringDB = new HashMap<Integer, String>();
        cause = new Throwable();
        EqnDB.clear();
        EqnDBIndex = 0;
        EqnDBDupCount = 0;
        int OldDups = EqnDBDupCount;
        int OldTestCase = j;
        int OldMaxIndexFail = 0;
        int OldTotalTestCases = 0;
        int OldKnwnI=0;
        int OldKnwnISectionStart=0;
        boolean DupFlag = false;
        while (j <= EndTestCase) {
            EqnUnderTest = "";
            if (j==SectionTestCaseStart)
                OldKnwnI=KnownIssues;
            DupFlag = false;
            String TempExprn = "";

            TempExprn = TestHarnessDiff("mainIntegrTest", j,"");
            Exprn = eatAll(TempExprn, ' ');
            DupFlag = DupChecknInsert(j);
            TestCasePassHighLevelFlag = true;
            if (MaxOrder == -1) {
                MaxOrder1 = MaxIntegreOrder; //From Test Case
            } else if (MaxOrder >= MaxIntegreOrder) {
                MaxOrder1 = MaxIntegreOrder;
            } else {
                MaxOrder1 = MaxOrder;
            }
            OldMaxIndexFail = MaxIndexFail;
            if ((!EqnUnderTest.equalsIgnoreCase("")) && ((DupFlag == false))) {
                IntegralHighSingleTest(MaxOrder1, Exprn);
                System.out.println(ConsoleColors.RED + "mainIntegrTest: j=" + j + " TestCase=" + TestCase);
                if (DupFlag == false) {
                    TotalTestCases++;
                }
            } else if (DupFlag == true) {
                System.out.println(ConsoleColors.RED + "mainIntegrTest: j=" + j + " TestCase=" + TestCase + " Dup. Hence NOT Executing.");

            } else if (EqnUnderTest.equalsIgnoreCase("")) {
                ByPassedTestCases++;
            }
            if (TestCasePassHighLevelFlag == false) {
                    MaxIndexFail++;
                    if (DupFlag == false) {
                        FailedTestCount++;
                    }
            }
                OldTestCase = j;
                j = RegressionControl(j);
                if (((j - OldTestCase) > 1)) {
                    if (j==SectionTestCaseEnd)
                    OldKnwnI=KnownIssues-OldKnwnISectionStart;
                    GapProcess("mainIntegrTest", j, OldTotalTestCases, OldTestCase, OldMaxIndexFail, OldFailedTestCount, OldDups, OldKnwnI,EqnDBDupCount,0,0);
                    OldFailedTestCount = FailedTestCount;
                    OldDups = EqnDBDupCount;
                    SectionStart = j;
                    OldTotalTestCases = TotalTestCases;
                }
                TestCase = j;
                //System.out.println(ConsoleColors.RED +"mainIntegrTest: j="+ j + " TestCase=" + TestCase);         
        }
        GapProcess("mainIntegrTest", j, OldTotalTestCases, OldTestCase, OldMaxIndexFail, OldFailedTestCount, OldDups, OldKnwnI,EqnDBDupCount,0,0);
        int k = 0;
        for (int y = 0; (y < EqnDB.size()); y++) {
            String Temp = EqnDB.get(y);
            if ((Temp != null) && (Temp.contains(":Dup with"))) {
                k++;
            }
        }
        System.out.println(ConsoleColors.RED + "mainIntegrTest: TestCase Summary : Total Failed=" + FailedTestCount + " Out of Run TestCases-Dups=" + (TotalTestCases) + " Passed Count=" + (TotalTestCases - FailedTestCount) + " DupCount=" + k + ConsoleColors.RESET);
        System.out.println(ConsoleColors.RED + "mainIntegrTest: TestCase Summary : DupCount=" + k + " Total Exceptions=" + MaxIndexExcept + ConsoleColors.RESET);
        System.out.println(ConsoleColors.RED + "mainIntegrTest: TestCase Summary : ByPassedTestCases=" + ByPassedTestCases + " MissedNumberTestCases=" + MissedNumberTestCases + " MissedTestCasesInfinity=" + MissedTestCasesInfinity + " MissedTestCasesException=" + MissedTestCasesException + ConsoleColors.RESET);
        for (int y = 0; (y < FailedTestCases.size()); y++) {
            if ((FailedTestCases.get(y).contains("Section")) && (FailedTestCases.get(y).contains("Complete # of Failures="))) {
                System.out.print(ConsoleColors.GREEN + FailedTestCases.get(y) + ConsoleColors.RESET);
            }
        }
        System.out.print(System.lineSeparator());
        System.out.println(ConsoleColors.RED + "mainIntegrTest: TestCase Summary : " + " Failed Test Cases are:" + ConsoleColors.RESET);

        for (int y = 0; y < MaxIndexFail; y++) {
            System.out.print(ConsoleColors.RED + " " + FailedTestCases.get(y) + ", " + ConsoleColors.RESET);
            if ((y != 0) && (y % 5 == 0)) {
                System.out.print(System.lineSeparator());
            }
        }
        System.out.print(System.lineSeparator());
        System.out.println(ConsoleColors.RED + "mainIntegrTest: Exception TestCase Summary : Total Exceptions=" + MaxIndexExcept + " Exception Test Cases are:" + ConsoleColors.RESET);
        for (int y = 0; y < MaxIndexExcept; y++) {
            System.out.print(ConsoleColors.RED + " " + ExceptionTestCases.get(y) + ", " + ConsoleColors.RESET);
            if ((y != 0) && (y % 5 == 0)) {
                System.out.print(System.lineSeparator());
            }
        }
        System.out.print(System.lineSeparator());
        System.out.println(ConsoleColors.RED + "mainIntegrTest: TestCase Duplicate Summary : " + " EqnDBIndex=" + EqnDBIndex + ConsoleColors.RESET);
        for (int y = 0; (y < EqnDB.size()); y++) {
            String Temp = EqnDB.get(y);
            if ((Temp != null) && (Temp.contains(":Dup with"))) {
                System.out.print(ConsoleColors.GREEN + EqnDB.get(y) + ConsoleColors.RESET);
                System.out.print(System.lineSeparator());
            }
        }
        System.out.println(ConsoleColors.RED + "mainIntegrTest: TestCase Duplicate Summary : Total Dups=" + k + ConsoleColors.RESET);
        System.out.print(System.lineSeparator());
        for (int y = 0; y < MaxIndexExcept; y++) {
            System.out.println(ConsoleColors.RED + " " + ExceptionStringDB.get(y) + ", " + ConsoleColors.RESET);
        }
        System.out.print(System.lineSeparator());
    }

    public static void DiffSingleHighTestCase(int MaxOrder1, String Exprn) {
        Map<String, String> variables = new HashMap<>();
        Map<String, Double> variablesNum = new HashMap<>();
        SimpleStr expSimpleMap1 = (() -> "");
        MathsExpressionParser.Expression expValue = (() -> Double.NaN);
        SimpleStr expSimpleMap2 = (() -> "");
        DiffrIntegrSep.DiffExpr exp = (() -> "");
        MathsContxtLAv.OrderVar expOrder = (() -> "");

        MyFuncExpress();
        MyFuncDiff();
        MyFuncSimple();

        String Constant = "C";

        String StrexpSimpleExpressMap1 = "";
        String StrexpDiffExpress = "";
        String StrexpSimpleExpressMap2 = "";
        String myOrder = "";

        double ExprnexpValue = 0;
        double DblexpValueMap1 = 0;
        double DblexpDiffValue = 0;
        double DblexpValueMap2 = 0;

        StageMapping = "";
        Order = 1;

        System.out.println(ConsoleColors.YELLOW + "Test Case " + TestCase + " EndTestCase=" + EndTestCase + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case " + TestCase + " TestCaseFile=" + TestCaseFile + " Section=" + Section + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Exprn=" + Exprn + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case Name=" + TestCaseName + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case Name=" + TestCaseMatrixID + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Regression Status : Test Case should be " + EqnRegressionDiffStatus + ConsoleColors.RESET);

        for (double x = 1.0, y = 7.0; Order < MaxOrder1; y++, /*x++,*/ Order++) {
            try {
                TestCasePassStrFlag = false;
                TestCasePassValFlag = false;
                TestCasePassConformalValFlag = false;
                variables.put(DiffWithRespTo, DiffWithRespTo);
                if (!DiffWithRespTo.equalsIgnoreCase("x")) {
                    variables.put("x", "x");
                }
                variables.put("y", "y");
                variables.put("a", "a");
                variables.put("b", "b");
                variables.put("c", "c");
                variables.put("d", "d");
                variables.put("m", "m");
                variables.put("p", "p");
                variables.put("q", "q");
                variables.put("r", "r");
                variables.put("s", "s");
                variables.put("i", "i");
                variables.put("E1", "E1");
                variables.put(Constant, Constant);

                variablesNum.put(DiffWithRespTo, x);
                if (!DiffWithRespTo.equalsIgnoreCase("x")) {
                    variablesNum.put("x", x);
                }
                variablesNum.put("y", y);
                variablesNum.put("a", 1.0);
                variablesNum.put("b", 2.0);//variables.put("b", 0.0);
                variablesNum.put("c", -1.0);
                variablesNum.put("d", 2.0);
                variablesNum.put("m", -1.0);
                variablesNum.put("p", 3.0);
                variablesNum.put("q", 0.0);
                variablesNum.put("r", -1.0);
                variablesNum.put("s", 2.0);
                variablesNum.put("i", 1.0);
                variablesNum.put("E1", 1.0);
                variablesNum.put(Constant, 5.0);
                StageMapping = "Basic Mapping";
                ChaosPrevention();
                expOrder = parseOrder(Exprn, DiffWithRespTo, "Silent", MathsContxtLAv.LogLevel.Off);
                myOrder = expOrder.eval();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Exprn=" + Exprn + " Order=" + myOrder);

                expSimpleMap1 = parseSimple(Exprn, variables, DiffWithRespTo, "Silent", ExprSimpleStrSep.LogLevel.Info);
                StrexpSimpleExpressMap1 = expSimpleMap1.evalStr();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Basic Simple Exprn=" + StrexpSimpleExpressMap1);

                expValue = MathsExpressionParser.parse(StrexpSimpleExpressMap1, variablesNum, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                ExprnexpValue = expValue.eval();
                System.out.println(" main:Result(Expn Value)=" + ExprnexpValue + "  x=" + x + DiffWithRespTo + "=" + x);

                expValue = MathsExpressionParser.parse(StrexpSimpleExpressMap1, variablesNum, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpValueMap1 = expValue.eval();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Basic Simple (Exprn Value)=" + DblexpValueMap1);
                StageMapping = "Differentiation";
                String MapType="Map1";
                String IntegrORDiffr="Diffr";
                exp = DiffrIntegrSep.parseDiff(StrexpSimpleExpressMap1, variablesNum, DiffWithRespTo,MapType, IntegrORDiffr);
                StrexpDiffExpress = exp.DiffExpr();
                System.out.println(" main:Result(Diff Equation)(" + Order + " th order)=> " + StrexpDiffExpress);
                StageMapping = "Differentiation Mapping";
                ChaosPrevention();
                expSimpleMap2 = parseSimple(StrexpDiffExpress, variables, DiffWithRespTo, "Silent", ExprSimpleStrSep.LogLevel.Info);
                StrexpSimpleExpressMap2 = expSimpleMap2.evalStr();
                expValue = MathsExpressionParser.parse(StrexpDiffExpress, variablesNum, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpDiffValue = expValue.eval();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Result(Diff Value)=" + DblexpDiffValue);
                System.out.println(" main:Result(Simplified Diff Equation)(" + Order + " th order)=> " + StrexpSimpleExpressMap2);
                expValue = MathsExpressionParser.parse(StrexpSimpleExpressMap2, variablesNum, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpValueMap2 = expValue.eval();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Result(Simplified Diff Value)=" + expValue.eval());
                System.out.print(System.lineSeparator());
                if (PassFailTestCaseString(TestCase, Order, "Diff", Exprn, StrexpSimpleExpressMap1, StrexpDiffExpress, StrexpSimpleExpressMap2, EqnUnderTest, EqnSolArrayMap1[Order], EqnSolArrayDiffAlone[Order], EqnSolArrayMap2[Order],"","","")) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass STRING TEST Complete" + ConsoleColors.RESET);
                    TestCasePassStrFlag = true;
                } else {
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "FAIL STRING TEST Complete" + ConsoleColors.RESET);
                }

                if (PassFailTestCaseValueStrict(TestCase, Order,MaxOrder1, "Diff", Exprn, ExprnexpValue, DblexpValueMap1, DblexpDiffValue, DblexpValueMap2, StrexpDiffExpress, variablesNum, x)) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass VALUE TEST CompletePragma:Strict" + ConsoleColors.RESET);
                    TestCasePassValFlag = true;
                } 
//                else if (PassFailTestCaseValueEasy(TestCase, Order, "Diff", Exprn, ExprnexpValue, DblexpValueMap1, DblexpDiffValue, DblexpValueMap2, StrexpDiffExpress, variablesNum, x, expOrder)) {
//                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass VALUE TEST Complete:Pragma:Loose" + ConsoleColors.RESET);
//                    TestCasePassValFlag = true;
//                } 
                else {
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Fail VALUE TEST Complete" + ConsoleColors.RESET);
                    TestCasePassValFlag = false;
                }
                if ((TestCasePassStrFlag == true) || (TestCasePassValFlag == true)) {
                    TestCasePassConformalValFlag = ConformalMapTestCaseDiff(TestCase, Order, Exprn, expSimpleMap1.evalStr(), exp.DiffExpr(), expSimpleMap2.evalStr(), EqnSolArrayMap1[Order], EqnSolArrayDiffAlone[Order], EqnSolArrayMap2[Order], variablesNum, DiffWithRespTo);
                }
                if (TestCasePassConformalValFlag == true) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass Conformal Map TEST" + ConsoleColors.RESET);
                } else if ((TestCasePassStrFlag != true) || (TestCasePassValFlag != true)) {
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Conformal Map TEST Not Executed" + ConsoleColors.RESET);
                } else {
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "FAIL Conformal Map TEST " + ConsoleColors.RESET);
                }
                if ((TestCasePassStrFlag == true) && (TestCasePassValFlag == true)) {
                    System.out.println(ConsoleColors.BLUE + "Super Test Answer Checks" + ConsoleColors.RESET);
                }
                if ((TestCasePassStrFlag == true) /* && (TestCasePassValFlag == true) && (TestCasePassConformalValFlag == true)*/) {
                    TestCasePassHighLevelFlag = true;//DO Nothing as Test Cases Passes
                } else if (!((TestCasePassValFlag == true) && (TestCasePassConformalValFlag == true))) {
                    String Temp = FailedTestCases.get(MaxIndexFail);
                    String HashVal = "";
                    if ((Temp != null) && (Order >= 2) && (!Temp.equalsIgnoreCase("")) && (!Temp.contains("Section"))) {
                        HashVal = Temp + "," + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag + ":ConfValFlag=" + TestCasePassConformalValFlag;
                    } else {
                        HashVal = "TestCase=" + TestCase + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag + ":ConfValFlag=" + TestCasePassConformalValFlag;
                    }
                    FailedTestCases.put(MaxIndexFail, HashVal);
                    //i=MaxOrder1;
                    TestCasePassHighLevelFlag = false;
                } else {
                    TestCasePassHighLevelFlag = true;
                }
                Exprn = StrexpSimpleExpressMap2;
                System.out.print(System.lineSeparator());
            } catch (Exception MyException) {
                System.out.print(System.lineSeparator());
                System.out.print(System.lineSeparator());
                MyException.initCause(cause);
                if (MyException.getCause() != null) {
                    ExceptionStringDB.put(MaxIndexExcept, TestCase + ":" + MyException.getMessage());
                }
                System.out.println(ConsoleColors.RED + "TestCase " + TestCase + " Failed at Order=" + Order + " due to Exception at Stage=" + StageMapping + "." + ConsoleColors.RESET);
                System.out.print(System.lineSeparator());
                MyException.printStackTrace();
                String Temp = FailedTestCases.get(MaxIndexFail);
                String HashVal = "";
                if ((Temp != null) && (!Temp.equalsIgnoreCase("")) && (!Temp.contains("Section"))) {
                    HashVal = Temp + "," + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag;
                } else {
                    HashVal = "TestCase=" + TestCase + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag;
                }
                FailedTestCases.put(MaxIndexFail, HashVal);
                String Temp1 = ExceptionTestCases.get(MaxIndexExcept);
                String HashVal1 = "";
                if ((Temp1 != null) && (!Temp1.equalsIgnoreCase(""))) {
                    HashVal1 = Temp1 + "," + ":Order=" + (Order);
                } else {
                    HashVal1 = "TestCase=" + TestCase + ":Order=" + (Order);
                }
                ExceptionTestCases.put(MaxIndexExcept, HashVal);
                MaxIndexExcept++;
                Order = MaxOrder1;
                TestCasePassHighLevelFlag = false;
            }
        }
        System.out.print(System.lineSeparator());

    }

    public static void IntegralHighSingleTest(int MaxOrder1, String Exprn) {
        Map<String, String> variables = new HashMap<>();
        Map<String, Double> variablesNum = new HashMap<>();
        SimpleStr expSimpleMap1 = (() -> "");
        MathsExpressionParser.Expression expValue = (() -> Double.NaN);;
        SimpleStr expSimpleMap2 = (() -> "");
        DiffrIntegrSep.IntegrExpr exp = (() -> "");
        MathsContxtLAv.OrderVar expOrder = (() -> "");

        MyFuncExpress();
        MyFuncIntegr();
        MyFuncSimple();

        String Constant = "C";
        String StrexpSimpleExpressMap1 = "";
        String StrexpDiffExpress = "";
        String StrexpSimpleExpressMap2 = "";
        String myOrder = "";
        double ExprnexpValue = 0;
        double DblexpValueMap1 = 0;
        double DblexpDiffValue = 0;
        double DblexpValueMap2 = 0;
        Order = 1;
        System.out.println(ConsoleColors.YELLOW + "Test Case " + TestCase + " EndTestCase=" + EndTestCase + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case " + TestCase + " TestCaseFile=" + TestCaseFile + " Section=" + Section + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Exprn=" + Exprn + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case Name=" + TestCaseName + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case Name=" + TestCaseMatrixID + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Integral Regression Status : Test Case should be " + EqnRegressionIntegreStatus + ConsoleColors.RESET);
        Order = 1;
        StageMapping = "";
        for (double x = 1.0, y = 7; Order < MaxOrder1; y++, /*x++,*/ Order++) {
            try {
                TestCasePassStrFlag = false;
                TestCasePassValFlag = false;
                TestCasePassConformalValFlag = false;
                variables.put(DiffWithRespTo, DiffWithRespTo);
                if (!DiffWithRespTo.equalsIgnoreCase("x")) {
                    variables.put("x", "x");
                }
                variables.put("y", "y");
                variables.put("a", "a");
                variables.put("b", "b");//variables.put("b", 0.0);
                variables.put("c", "c");
                variables.put("d", "d");
                variables.put("p", "p");
                variables.put("q", "q");
                variables.put("r", "r");
                variables.put("s", "s");
                variables.put("i", "i");
                variables.put("E1", "E1");
                variables.put(Constant, "Constant");
                variablesNum.put(DiffWithRespTo, x);
                if (!DiffWithRespTo.equalsIgnoreCase("x")) {
                    variablesNum.put("x", x);
                }
                variablesNum.put("y", y);
                variablesNum.put("a", 1.0);
                variablesNum.put("b", 2.0);//variables.put("b", 0.0);
                variablesNum.put("c", -1.0);
                variablesNum.put("d", 2.0);
                variablesNum.put("p", 1.0);
                variablesNum.put("q", 0.0);
                variablesNum.put("r", -1.0);
                variablesNum.put("s", 2.0);
                variablesNum.put("i", 1.0);
                variablesNum.put("E1", 1.0);
                variablesNum.put(Constant, 5.0);
                StageMapping = "Basic Mapping";
                ChaosPrevention();
                //expOrder = parseOrder(Exprn, DiffWithRespTo, "Silent", ExprSimpleStrSep.LogLevel.Off);
                //myOrder = expOrder.eval();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Exprn=" + Exprn + " Order=" + myOrder);
                expSimpleMap1 = parseSimple(Exprn, variables, DiffWithRespTo, "Silent", ExprSimpleStrSep.LogLevel.Info);
                StrexpSimpleExpressMap1 = expSimpleMap1.evalStr();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Basic Simple Exprn=" + StrexpSimpleExpressMap1);

                expValue = MathsExpressionParser.parse(Exprn, variablesNum, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                ExprnexpValue = expValue.eval();
                System.out.println(" main:Result(Expn Value)=" + ExprnexpValue);

                expValue = MathsExpressionParser.parse(StrexpSimpleExpressMap1, variablesNum, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpValueMap1 = expValue.eval();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Basic Simple (Exprn Value)=" + DblexpValueMap1);

                StageMapping = "Integration";
                String MapType="Map1";
                String IntegrORDiffr="Integre";
                exp = DiffrIntegrSep.parseIntegr(StrexpSimpleExpressMap1, variablesNum, DiffWithRespTo,MapType, IntegrORDiffr);
                StrexpDiffExpress = exp.IntegrExpr();
                System.out.println(" main:Result(Integral Equation)(" + Order + " th order)=> " + StrexpDiffExpress);

                StageMapping = "Integration Mapping";
                ChaosPrevention();
                expSimpleMap2 = parseSimple(StrexpDiffExpress, variables, DiffWithRespTo, "Silent", ExprSimpleStrSep.LogLevel.Info);
                StrexpSimpleExpressMap2 = expSimpleMap2.evalStr();
                System.out.println(" main:Result(Simplified Integral Equation)(" + Order + " th order)=> " + StrexpSimpleExpressMap2);
                expValue = MathsExpressionParser.parse(StrexpDiffExpress, variablesNum, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpDiffValue = expValue.eval();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Result(Integral Value)=" + DblexpDiffValue);
                expValue = MathsExpressionParser.parse(StrexpSimpleExpressMap2, variablesNum, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpValueMap2 = expValue.eval();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Result(Simplified Integral Value)=" + expValue.eval());
                System.out.print(System.lineSeparator());

                if (PassFailTestCaseString(TestCase, Order, "Integre", Exprn, StrexpSimpleExpressMap1, StrexpDiffExpress, StrexpSimpleExpressMap2, EqnUnderTest, EqnSolArrayMap3[Order], EqnSolArrayIntegrAlone[Order], EqnSolArrayMap4[Order],"","","")) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass STRING TEST Complete" + ConsoleColors.RESET);
                    TestCasePassStrFlag = true;
                } else {
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "FAIL STRING TEST Complete" + ConsoleColors.RESET);
                }

                if (PassFailTestCaseValueStrict(TestCase, Order, MaxOrder1,"Integre", Exprn, ExprnexpValue, DblexpValueMap1, DblexpDiffValue, DblexpValueMap2, StrexpDiffExpress, variablesNum, x)) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass VALUE TEST CompletePragma:Strict" + ConsoleColors.RESET);
                    TestCasePassValFlag = true;
                } 
//                else if (PassFailTestCaseValueEasy(TestCase, Order, "Integre", Exprn, ExprnexpValue, DblexpValueMap1, DblexpDiffValue, DblexpValueMap2, StrexpDiffExpress, variablesNum, x, expOrder)) {
//                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass VALUE TEST Complete:Pragma:Loose" + ConsoleColors.RESET);
//                } 
                else {
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Fail VALUE TEST Complete" + ConsoleColors.RESET);
                }
                if ((TestCasePassStrFlag == true) || (TestCasePassValFlag == true)) {
                    TestCasePassConformalValFlag = ConformalMapTestCaseIntegr((int)TestCase, Order, Exprn, expSimpleMap1, exp, expSimpleMap2, EqnSolArrayMap3[Order], EqnSolArrayIntegrAlone[Order], EqnSolArrayMap4[Order], variablesNum, DiffWithRespTo);
                }
                if (TestCasePassConformalValFlag == true) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass Conformal Map TEST" + ConsoleColors.RESET);
                } else if ((TestCasePassStrFlag != true) || (TestCasePassValFlag != true)) {
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Conformal Map TEST Not Executed" + ConsoleColors.RESET);
                } else {
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "FAIL Conformal Map TEST " + ConsoleColors.RESET);
                }
                if ((TestCasePassStrFlag == true) && (TestCasePassValFlag == true)) {
                    System.out.println(ConsoleColors.BLUE + "Super Test Answer Checks" + ConsoleColors.RESET);
                }
                if ((TestCasePassStrFlag == true) /* && (TestCasePassValFlag == true) && (TestCasePassConformalValFlag == true)*/) {
                    TestCasePassHighLevelFlag = true;//DO Nothing as Test Cases Passes
                } else if (!((TestCasePassValFlag == true) && (TestCasePassConformalValFlag == true))) {
                    String Temp = FailedTestCases.get(MaxIndexFail);
                    String HashVal = "";
                    if ((Temp != null) && (Order >= 2) && (!Temp.equalsIgnoreCase("")) && (!Temp.contains("Section"))) {
                        HashVal = Temp + "," + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag + ":ConfValFlag=" + TestCasePassConformalValFlag;
                    } else {
                        HashVal = "TestCase=" + TestCase + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag + ":ConfValFlag=" + TestCasePassConformalValFlag;
                    }
                    FailedTestCases.put(MaxIndexFail, HashVal);
                    //i=MaxOrder1;
                    TestCasePassHighLevelFlag = false;
                } else {
                    TestCasePassHighLevelFlag = true;
                }
                Exprn = StrexpSimpleExpressMap2;
                System.out.print(System.lineSeparator());
            } catch (Exception MyException) {
                System.out.print(System.lineSeparator());
                System.out.print(System.lineSeparator());
                MyException.initCause(cause);
                if (MyException.getCause() != null) {
                    ExceptionStringDB.put(MaxIndexExcept, TestCase + ":" + MyException.getMessage().toString());
                }
                System.out.println(ConsoleColors.RED + "TestCase " + TestCase + " Failed at Order=" + Order + " due to Exception at Stage=" + StageMapping + "." + ConsoleColors.RESET);
                System.out.print(System.lineSeparator());
                MyException.printStackTrace();
                String Temp = FailedTestCases.get(MaxIndexFail);
                String HashVal = "";
                if ((Temp != null) && (!Temp.equalsIgnoreCase("")) && (!Temp.contains("Section"))) {
                    HashVal = Temp + "," + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag;
                } else {
                    HashVal = "TestCase=" + TestCase + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag;
                }
                FailedTestCases.put(MaxIndexFail, HashVal);
                String Temp1 = ExceptionTestCases.get(MaxIndexExcept);
                String HashVal1 = "";
                if ((Temp1 != null) && (!Temp1.equalsIgnoreCase(""))) {
                    HashVal1 = Temp1 + "," + ":Order=" + (Order);
                } else {
                    HashVal1 = "TestCase=" + TestCase + ":Order=" + (Order);
                }
                ExceptionTestCases.put(MaxIndexExcept, HashVal);
                MaxIndexExcept++;
                Order = MaxOrder1;
                TestCasePassHighLevelFlag = false;
            }
        }
        System.out.print(System.lineSeparator());
    }

    public static void SchrodingerEquationMethod1() {
        //public static void main(String... args) {
        System.out.print(System.lineSeparator());
        System.out.print(System.lineSeparator());
        System.out.println("SchrodingerEquation:Starting:SchrodingerEquationMethod1:Trial && Error from List of Probable Solutions");
        System.out.print(System.lineSeparator());
        System.out.print(System.lineSeparator());
        Map<Integer, String> variablesProbableSolutions = new HashMap<>();
        Map<String, String> variables = new HashMap<>();
        Map<String, Double> variablesNum = new HashMap<>();
        ExprSimpleStrSep.MyFuncExpress();
        DiffrIntegrSep.MyFuncDiff();
        ExprSimpleStrSep.MyFuncSimple();
        DiffrIntegrSep.MyFuncIntegr();
        String DiffWithRespTo = "x";
        String Constant = "C";
        variables.put(DiffWithRespTo, DiffWithRespTo);
        //MathsContxtLAv.SimpleExpression Fx;
        ExprSimpleStrSep.SimpleStr Fx;
        DiffrIntegrSep.DiffExpr FDash;
        DiffrIntegrSep.IntegrExpr FIntegral;
        CalculusApplication.HghLvlExprODE FHighLVLEqn0;
        CalculusApplication.HghLvlExprODE FHighLVLEqn1;
        CalculusApplication.HghLvlExprODE FHighLVLEqn2;
        MathsExpressionParser.Expression expValue;
        String StrexpSimpleExpressMap1 = "";
        double DblexpValueMap1 = 0;
        String MathsORExprSimple = "ExprSimpleStrSep";

        // ODE in the Form "LHS - RHS=0" Left hand Side - Right Hand Side=0
        // dy/dx in the form @D:~1~@ 
        // d^2/dx^2=@D:~2~@ 
        // d^3/dx^3=@D:~3~@ and so on
        // Single Integral in the form @I:~1~@ 
        // Double Integral=@I:~2~@ 
        // Triple Integral=@I:~3~@ and so on
        String Psi_x_t = "5*x^2*exp(-i*E1*t)";//Wave Function in :Parameter :complex Number x and t: Time
        String V_x_t = "x";//Potential in :Parameter :complex Number x and t: Time
        Double hBar = Double.NaN;//Reduced Planck's Constant
        Double mass = Double.NaN;//mass
        Double t = 1.0;//time
        Double x = 1.0;//x:position
        Double c = 0.0;//x:position
        Double E1 = 1.0;//E1
        Double i = 1.0;//i
        /* ************************ ODE SchrodingerEquation *********** */
        int NumOfODE = 1;
        String[] DiffEquationODE = new String[NumOfODE];
        String[] DiffEquationODEHumanRead = new String[NumOfODE];
        //DiffEquationODE[0] = "i*hBar*@D:~1~@ +hBar^2/2/m*D2/dx2*Phi_x_t - V_x_t*Phi_x_t";
        DiffEquationODEHumanRead[0] = "i*hBar*dPsi_x_t/dt=-hBar^2/2/mass*D2/dx2*Psi_x_t + V_x_t*Psi_x_t";

        /* ************************ ODE SchrodingerEquation *********** */
 /* ************************ Probable Solution *********** */
        int NumOfSolutions = 3;
        variablesProbableSolutions.put(0, eatAllHGH(Psi_x_t, ' '));
        variablesProbableSolutions.put(1, eatAllHGH("m*x+c", ' '));
        variablesProbableSolutions.put(2, eatAllHGH(Psi_x_t, ' '));
        /* ************************ Probable Solution *********** */
 /* ************************ Parts of ODE *********** */
        int NumOfParts = 3;
        String[] Parts = new String[NumOfParts];
        Parts[0] = eatAllHGH("hBar*@D:~1~@", ' ');//i*hBar*dPsi_x_t/dt
        Parts[1] = eatAllHGH("hBar^2/2/mass*@D:~2~@", ' ');//hBar^2/2/m*D2/dx2*Psi_x_t
        Parts[2] = eatAllHGH(V_x_t + " * " + Psi_x_t, ' ');//V_x_t*Psi_x_t
        String[] PartsDiffWithRespTo = new String[NumOfParts];
        PartsDiffWithRespTo[0] = "t";
        PartsDiffWithRespTo[1] = "x";
        PartsDiffWithRespTo[2] = "y";
        /* ************************ Parts of ODE *********** */
        System.out.println("SchrodingerEquation:Starting:DiffEquationODE=" + DiffEquationODEHumanRead[0]);
        System.out.println("SchrodingerEquation:Starting:Wave Function:Psi_x_t=" + Psi_x_t);
        System.out.println("SchrodingerEquation:Starting:Potential:V_x_t=" + V_x_t);
        System.out.println("SchrodingerEquation:Starting:Reduced Planck's Constant:hBar=" + hBar);
        System.out.println("SchrodingerEquation:Starting:Imaginary:i=" + "i");
        System.out.print(System.lineSeparator());
        System.out.print(System.lineSeparator());
        for (int j = 0; j < NumOfODE; j++) {
            DiffEquationODE[j] = Parts[0] + " + " + Parts[1] + " - " + Parts[2];
            System.out.println("SchrodingerEquation:Solution Loop:DiffEquationODE=" + DiffEquationODE[0]);
            for (int k = 0; k < NumOfSolutions; k++) {
                System.out.println("SchrodingerEquation:Starting:Trial " + i);
                variables.put("z", "z");
                variables.put("hBar", "hBar");
                variables.put("mass", "mass");
                variables.put("m", "m");
                variables.put("c", "c");
                variables.put("E1", "E1");
                variables.put("i", "i");
                variables.put(PartsDiffWithRespTo[0], PartsDiffWithRespTo[0]);
                variables.put(PartsDiffWithRespTo[1], PartsDiffWithRespTo[1]);

                variablesNum.put("z", 1.0);
                variablesNum.put("hBar", hBar);
                variablesNum.put("mass", mass);
                variablesNum.put("m", 1.0);
                variablesNum.put("c", c);
                variablesNum.put("E1", E1);
                variablesNum.put("i", i);
                variablesNum.put(PartsDiffWithRespTo[0], t);
                variablesNum.put(PartsDiffWithRespTo[1], x);
                System.out.println("SchrodingerEquation:DiffEquationODEHumanRead=" + DiffEquationODEHumanRead[j]);
                System.out.println("Trying Probable Solution(Psi_x_t)=" + variablesProbableSolutions.get(k));
                System.out.print(System.lineSeparator());
                System.out.print(System.lineSeparator());
                String Exprn0 = eatAllHGH(Parts[0], ' ');
                FHighLVLEqn0 = parseHghLvlExprODE(Exprn0, variables, variablesNum, PartsDiffWithRespTo[0], "z", variablesProbableSolutions.get(k), DiffEquationODEHumanRead[j], MathsORExprSimple);
                String MySymbolicEqn0 = FHighLVLEqn0.Solution();
                String Exprn1 = eatAllHGH(Parts[1], ' ');
                FHighLVLEqn1 = parseHghLvlExprODE(Exprn1, variables, variablesNum, PartsDiffWithRespTo[1], "z", variablesProbableSolutions.get(k), DiffEquationODEHumanRead[j], MathsORExprSimple);
                String MySymbolicEqn1 = FHighLVLEqn1.Solution();
                String Exprn2 = eatAllHGH(Parts[2], ' ');
                FHighLVLEqn2 = parseHghLvlExprODE(Exprn2, variables, variablesNum, PartsDiffWithRespTo[2], "z", variablesProbableSolutions.get(k), DiffEquationODEHumanRead[j], MathsORExprSimple);
                String MySymbolicEqn2 = FHighLVLEqn2.Solution();

                String MySymbolicEqn = MySymbolicEqn0 + " + " + MySymbolicEqn1 + " - " + MySymbolicEqn2;
                String HGHSol = eatAllHGH(MySymbolicEqn, ' ');

                Fx = ExprSimpleStrSep.parseSimple(MySymbolicEqn, variables, DiffWithRespTo, "Silent", ExprSimpleStrSep.LogLevel.Info);
                StrexpSimpleExpressMap1 = Fx.evalStr();
                expValue = MathsExpressionParser.parse(StrexpSimpleExpressMap1, variablesNum, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpValueMap1 = expValue.eval();
                System.out.println("SchrodingerEquation:DiffEquationODE:" + DiffEquationODEHumanRead[j]);
                System.out.println("SchrodingerEquation:Solution=" + MySymbolicEqn);
                System.out.println("SchrodingerEquation:StrexpSimpleExpressMap1=" + StrexpSimpleExpressMap1 + " DblexpValueMap1=" + DblexpValueMap1);
                System.out.print(System.lineSeparator());
                System.out.print(System.lineSeparator());
                System.out.println("SchrodingerEquation:Ending:Trial " + k);

            }
        }
    }

    public static void SchrodingerEquationMethod2() {
        //public static void main(String... args) {
        System.out.print(System.lineSeparator());
        System.out.print(System.lineSeparator());
        System.out.println("SchrodingerEquation:Starting:SchrodingerEquationMethod2: From known Functions");
        System.out.print(System.lineSeparator());
        System.out.print(System.lineSeparator());
        Map<Integer, String> variablesProbableSolutions = new HashMap<>();
        Map<String, String> variables = new HashMap<>();
        Map<String, Double> variablesNum = new HashMap<>();
        ExprSimpleStrSep.MyFuncExpress();
        DiffrIntegrSep.MyFuncDiff();
        ExprSimpleStrSep.MyFuncSimple();
        DiffrIntegrSep.MyFuncIntegr();
        String Constant = "C";
        String DiffWithRespTo = "x";
        variables.put(DiffWithRespTo, DiffWithRespTo);
        ExprSimpleStrSep.SimpleStr Fx;
        DiffrIntegrSep.DiffExpr FDash;
        DiffrIntegrSep.IntegrExpr FIntegral;
        CalculusApplication.HghLvlExprODE FHighLVLEqn0;
        CalculusApplication.HghLvlExprODE FHighLVLEqn1;
        CalculusApplication.HghLvlExprODE FHighLVLEqn2;
        MathsExpressionParser.Expression expValue;
        String StrexpSimpleExpressMap1 = "";
        double DblexpValueMap1 = 0;
        String MathsORExprSimple = "ExprSimpleStrSep";

        // ODE in the Form "LHS - RHS=0" Left hand Side - Right Hand Side=0
        // dy/dx in the form @D:~1~@ 
        // d^2/dx^2=@D:~2~@ 
        // d^3/dx^3=@D:~3~@ and so on
        // Single Integral in the form @I:~1~@ 
        // Double Integral=@I:~2~@ 
        // Triple Integral=@I:~3~@ and so on
        String Psi_x_t = "5*x^2*exp(-i*E1*t)";//Wave Function in :Parameter :complex Number x and t: Time
        String V_x_t = "x";//Potential in :Parameter :complex Number x and t: Time
        Double hBar = Double.NaN;//Reduced Planck's Constant
        Double mass = Double.NaN;//mass
        Double t = 1.0;//time
        Double x = 1.0;//x:position
        Double c = 0.0;//x:position
        Double E1 = 1.0;//E1
        Double i = 1.0;//i
        /* ************************ ODE SchrodingerEquation *********** */
        int NumOfODE = 1;
        String[] DiffEquationODE = new String[NumOfODE];
        String[] DiffEquationODEHumanRead = new String[NumOfODE];
        //DiffEquationODE[0] = "i*hBar*@D:~1~@ +hBar^2/2/m*D2/dx2*Phi_x_t - V_x_t*Phi_x_t";
        DiffEquationODEHumanRead[0] = "i*hBar*dPsi_x_t/dt=-hBar^2/2/mass*D2/dx2*Psi_x_t + V_x_t*Psi_x_t";

        /* ************************ ODE SchrodingerEquation *********** */
 /* ************************ Probable Solution *********** */
        int NumOfSolutions = 3;
        variablesProbableSolutions.put(0, eatAllHGH("m*t+c", ' '));
        variablesProbableSolutions.put(1, eatAllHGH("m*x+c", ' '));
        variablesProbableSolutions.put(2, eatAllHGH(Psi_x_t, ' '));
        System.out.println("SchrodingerEquation:Starting:DiffEquationODE:" + DiffEquationODEHumanRead[0]);
        System.out.print(System.lineSeparator());
        System.out.print(System.lineSeparator());

        System.out.println("Trying with Probable Solution:Fx=" + variablesProbableSolutions.get(2));
        /* ************************ Probable Solution *********** */
 /* ************************ Parts of ODE *********** */
        int NumOfParts = 3;
        String[] Parts = new String[NumOfParts];
        Parts[0] = "hBar*@D:~1~@";//i*hBar*dPsi_x_t/dt
        Parts[1] = "hBar^2/2/mass*@D:~2~@";//hBar^2/2/m*D2/dx2*Psi_x_t
        Parts[2] = V_x_t + " * " + Psi_x_t;//V_x_t*Psi_x_t
        String[] PartsDiffWithRespTo = new String[NumOfParts];
        PartsDiffWithRespTo[0] = "t";
        PartsDiffWithRespTo[1] = "x";
        PartsDiffWithRespTo[2] = "y";
        String[] PartsSolution = new String[NumOfParts];
        PartsSolution[0] = "";//i*hBar*dPsi_x_t/dt
        PartsSolution[1] = "";//hBar^2/2/m*D2/dx2*Psi_x_t
        PartsSolution[2] = "";//V_x_t*Psi_x_t
        System.out.println("Trying with Probable Solution:Parts[0]=" + Parts[0] + " DiffWithRespTo[0]=" + PartsDiffWithRespTo[0]);
        System.out.println("Trying with Probable Solution:Parts[1]=" + Parts[1] + " DiffWithRespTo[1]=" + PartsDiffWithRespTo[1]);
        System.out.println("Trying with Probable Solution:Parts[2]=" + Parts[2] + " DiffWithRespTo[2]=" + PartsDiffWithRespTo[2]);
        System.out.print(System.lineSeparator());
        System.out.print(System.lineSeparator());

        /* ************************ Parts of ODE *********** */
        System.out.println("SchrodingerEquation:Starting:Wave Function:Psi_x_t=" + Psi_x_t);
        System.out.println("SchrodingerEquation:Starting:Potential:V_x_t=" + V_x_t);
        System.out.println("SchrodingerEquation:Starting:Reduced Planck's Constant:hBar=" + hBar);
        System.out.println("SchrodingerEquation:Starting:Imaginary:i=" + "i");
        System.out.print(System.lineSeparator());
        System.out.print(System.lineSeparator());

        variables.put("hBar", "hBar");
        variables.put("mass", "mass");
        variables.put("m", "m");
        variables.put("c", "c");
        variables.put("E1", "E1");
        variables.put("i", "i");
        variables.put(PartsDiffWithRespTo[0], PartsDiffWithRespTo[0]);
        variables.put(PartsDiffWithRespTo[1], PartsDiffWithRespTo[1]);

        variablesNum.put("hBar", hBar);
        variablesNum.put("mass", mass);
        variablesNum.put("m", 1.0);
        variablesNum.put("c", c);
        variablesNum.put("E1", E1);
        variablesNum.put("i", i);
        variablesNum.put(PartsDiffWithRespTo[0], t);
        variablesNum.put(PartsDiffWithRespTo[1], x);
        // PARTS[0]DiffWithRespTo t
        //Assign the correct Equation
        String MySymbolicEqn = eatAllHGH(variablesProbableSolutions.get(2), ' ');
        String SimpleMySymbolicEqn = "";
        System.out.println("PARTS0:MySymbolicEqn: Fx=" + MySymbolicEqn + " DiffWithRespTo=" + PartsDiffWithRespTo[0]);
        Fx = ExprSimpleStrSep.parseSimple(MySymbolicEqn, variables, DiffWithRespTo, "Silent", ExprSimpleStrSep.LogLevel.Info);
        SimpleMySymbolicEqn = Fx.evalStr();
        System.out.println("PARTS0:Simple Fx=" + SimpleMySymbolicEqn);
        String MapType="Map1";
        String IntegrORDiffr="Diffr";
        FDash = DiffrIntegrSep.parseDiff(SimpleMySymbolicEqn, variablesNum, PartsDiffWithRespTo[0],MapType, IntegrORDiffr);
        SimpleMySymbolicEqn = FDash.DiffExpr();
        System.out.println("PARTS0:RAW:Diff Expression F(" + 1 + "th) Order=" + SimpleMySymbolicEqn);
        Fx = ExprSimpleStrSep.parseSimple(SimpleMySymbolicEqn, variables, DiffWithRespTo, "Silent", ExprSimpleStrSep.LogLevel.Info);
        SimpleMySymbolicEqn = Fx.evalStr();
        PartsSolution[0] = "i*hBar*" + SimpleMySymbolicEqn;
        System.out.println("PARTS0:Diff Expression F(" + 1 + "th) Order=" + SimpleMySymbolicEqn);
        System.out.println("PARTS0:Diff:Equation=" + SimpleMySymbolicEqn);

        System.out.println("Diff:PARTS0:1st Order:DiffWithRespTo t:SimpleMySymbolicEqn=" + SimpleMySymbolicEqn);
        System.out.print(System.lineSeparator());
        System.out.print(System.lineSeparator());

        // PARTS[1] DiffWithRespTo x
        //Assign the correct Equation
        MySymbolicEqn = eatAllHGH(variablesProbableSolutions.get(2), ' ');
        System.out.println("PARTS1:MySymbolicEqn: Fx=" + MySymbolicEqn + " DiffWithRespTo=" + PartsDiffWithRespTo[1]);
        Fx = ExprSimpleStrSep.parseSimple(MySymbolicEqn, variables, DiffWithRespTo, "Silent", ExprSimpleStrSep.LogLevel.Info);
        SimpleMySymbolicEqn = Fx.evalStr();
        System.out.println("PARTS1:Simple Fx=" + SimpleMySymbolicEqn);
        FDash = DiffrIntegrSep.parseDiff(SimpleMySymbolicEqn, variablesNum, PartsDiffWithRespTo[1],MapType, IntegrORDiffr);
        SimpleMySymbolicEqn = FDash.DiffExpr();
        System.out.println("PARTS1:RAW:Diff Expression F(" + 1 + "th) Order=" + SimpleMySymbolicEqn);
        Fx = ExprSimpleStrSep.parseSimple(SimpleMySymbolicEqn, variables, DiffWithRespTo, "Silent", ExprSimpleStrSep.LogLevel.Info);
        SimpleMySymbolicEqn = Fx.evalStr();
        System.out.println("Diff Expression F(" + 1 + "th) Order=" + SimpleMySymbolicEqn);
        System.out.println("Diff:PARTS1:1st Order:DiffWithRespTo x:Equation=" + SimpleMySymbolicEqn);

        //PARTS[1] 2nd Order DiffWithRespTo x
        MySymbolicEqn = SimpleMySymbolicEqn;
        System.out.println("PARTS1:MySymbolicEqn: Fx=" + MySymbolicEqn + " DiffWithRespTo=" + PartsDiffWithRespTo[1]);
        Fx = ExprSimpleStrSep.parseSimple(MySymbolicEqn, variables, DiffWithRespTo, "Silent", ExprSimpleStrSep.LogLevel.Info);
        SimpleMySymbolicEqn = Fx.evalStr();
        System.out.println("PARTS1:Simple Fx=" + SimpleMySymbolicEqn);
        FDash = DiffrIntegrSep.parseDiff(SimpleMySymbolicEqn, variablesNum, PartsDiffWithRespTo[1],MapType, IntegrORDiffr);
        SimpleMySymbolicEqn = FDash.DiffExpr();
        System.out.println("PARTS1:RAW:Diff Expression F(" + 2 + "th) Order=" + SimpleMySymbolicEqn);
        Fx = ExprSimpleStrSep.parseSimple(SimpleMySymbolicEqn, variables, DiffWithRespTo, "Silent", ExprSimpleStrSep.LogLevel.Info);
        SimpleMySymbolicEqn = Fx.evalStr();
        System.out.println("Diff Expression F(" + 2 + "th) Order=" + SimpleMySymbolicEqn);
        System.out.println("Diff:Equation=" + SimpleMySymbolicEqn);
        PartsSolution[1] = "hBar^2/2/m*" + SimpleMySymbolicEqn;
        System.out.println("Diff:PARTS1:2nd Order:DiffWithRespTo x:SimpleMySymbolicEqn=" + SimpleMySymbolicEqn);
        System.out.print(System.lineSeparator());
        System.out.print(System.lineSeparator());
//        // PARTS[2]
        //Assign the correct Equation
        MySymbolicEqn = eatAllHGH(Parts[2], ' ');
        System.out.println("parseEqn:MySymbolicEqn: Fx=" + MySymbolicEqn + " DiffWithRespTo=" + PartsDiffWithRespTo[1]);
        Fx = ExprSimpleStrSep.parseSimple(MySymbolicEqn, variables, DiffWithRespTo, "Silent", ExprSimpleStrSep.LogLevel.Info);
        SimpleMySymbolicEqn = Fx.evalStr();
        PartsSolution[2] = MySymbolicEqn;
        System.out.println("Simple Fx=" + SimpleMySymbolicEqn);
        System.out.println("PARTS2:SimpleMySymbolicEqn=" + SimpleMySymbolicEqn);

        System.out.print(System.lineSeparator());
        System.out.print(System.lineSeparator());
        System.out.println("Part Solution:PartsSolution[0]=" + PartsSolution[0] + " Differentiated " + Psi_x_t + " w.r.t time");
        System.out.println("Part Solution:PartsSolution[1]=" + PartsSolution[1] + " Twice Differentiated " + Psi_x_t + " w.r.t x(position)");
        System.out.println("Part Solution:PartsSolution[2]=" + PartsSolution[2] + " Product Function");
        System.out.print(System.lineSeparator());
        System.out.print(System.lineSeparator());
        // Solution
        String Overall = PartsSolution[0] + "=" + PartsSolution[1] + "+" + PartsSolution[2];
        System.out.println("SchrodingerEquation:Overall ODE:Overall:" + Overall);
        System.out.print(System.lineSeparator());
        System.out.print(System.lineSeparator());
    }

    public static void mainProdUser(String... args) {
        System.out.println(ConsoleColors.BLUE + "User Equation Demo(Differentiation)" + ConsoleColors.RESET);
        UsageCalculus.UserEquation = "p/9.0*xyc1^9.0 + p*6.0*xyc1^6.0 + p/5.0*xyc1^5.0 + p*2.0*xyc1^2.0 + p*25.0*xyc1 + p*50.0";
        UsageCalculus.MaxDiffOrder = 6;
        UsageCalculus.MaxIntegreOrder = 6;
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.mainDiff(args);
        System.out.println(ConsoleColors.BLUE + "User Equation Demo(Integration)" + ConsoleColors.RESET);
        UsageCalculus.mainIntegral(args);

        //Uncomment Below Lines for User String UsageCalculus
        System.out.println(ConsoleColors.BLUE + "User Equation Demo(Interactive)" + ConsoleColors.RESET);
        DiffWithRespTo = "x";
        UsageCalculus.mainUser(args);
        //System.out.println(ConsoleColors.BLUE + "User Equation Demo(Algebra & FoG)" + ConsoleColors.RESET);
        //mainAlgebraUser(args);

        System.out.println(ConsoleColors.BLUE + "User Equation Demo(Predicate)" + ConsoleColors.RESET);
        UsageCalculus.UserTestPredicate = "(x^2+y^2 >= 4)";
        UsageCalculus.mainPredicate(args);

    }

    public static void mainSchrodinger() {
        System.out.println(ConsoleColors.BLUE + "User Basic ODE Solver Demo" + ConsoleColors.RESET);
        SchrodingerEquationMethod1();
        System.out.println(ConsoleColors.BLUE + "User Basic ODE Solver Demo" + ConsoleColors.RESET);
        SchrodingerEquationMethod2();
    }
}
