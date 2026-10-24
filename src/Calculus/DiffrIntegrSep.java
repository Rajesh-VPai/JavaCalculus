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

import static Calculus.MathsContxtLAv.parseSimple;
import static Calculus.ExprSimpleStrSep.parseSimple;
import static Calculus.MathematicalTestHarness.AutoGenSilentFlag;
import static Calculus.MathematicalTestHarness.DevelopmentDeepInfoFlagSep;
import static Calculus.MathematicalTestHarness.DevelopmentDeepInfoLambdaFlagSep;
import static Calculus.MathematicalTestHarness.DevelopmentFlagSep;
import static Calculus.MathematicalTestHarness.DevelopmentReasoningLambdaFlagSep;
import static Calculus.MathematicalTestHarness.GBLSilentDeepInfoLambdaSep;
import static Calculus.MathematicalTestHarness.GBLSilentDeepInfoSep;
import static Calculus.MathematicalTestHarness.GBLSilentSep;
import static Calculus.MathsContxtLAv.BackupMathsStateAll;
import static Calculus.MathsContxtLAv.CloseBraces;
import static Calculus.MathsContxtLAv.ComplexAssignFlag;
import static Calculus.MathsContxtLAv.LookAheadOperator;
import static Calculus.MathsContxtLAv.EnteredLAConstFlag;
import static Calculus.MathsContxtLAv.FunctionDiffExpr;
import static Calculus.MathsContxtLAv.FunctionExpr;
import static Calculus.MathsContxtLAv.FunctionName;
import static Calculus.MathsContxtLAv.FactorsDiffExpr;
import static Calculus.MathsContxtLAv.FactorsExpr;
import static Calculus.MathsContxtLAv.ParanDiffExpr;
import static Calculus.MathsContxtLAv.ParanExpr;
import static Calculus.MathsContxtLAv.ParenthesisHighLvlNum;
import static Calculus.MathsContxtLAv.ParenthesisCurrNum;
import static Calculus.MathsContxtLAv.TermOutputSetFlag;
import static Calculus.MathsContxtLAv.LastLADiffExtremityAidPos;
import static Calculus.MathsContxtLAv.GotExtremityFlag;
import static Calculus.MathsContxtLAv.ContainsIndConstFlag;
import static Calculus.MathsContxtLAv.ContainsXFlag;
import static Calculus.MathsContxtLAv.DiffTermOperator;
import static Calculus.MathsContxtLAv.GotExpntNumFlag;
import static Calculus.MathsContxtLAv.GotIndConstFlag;
import static Calculus.MathsContxtLAv.GotIndConstPos;
import static Calculus.MathsContxtLAv.GotVariableFlag;
import static Calculus.MathsContxtLAv.GotVariablePos;
import static Calculus.MathsContxtLAv.IsAConstant;
import static Calculus.MathsContxtLAv.LADiffFactorOperator;
import static Calculus.MathsContxtLAv.LADiffIndConstOperator;
import static Calculus.MathsContxtLAv.LastExpr;
import static Calculus.MathsContxtLAv.LastLADiffConstCoeffAidPos;
import static Calculus.MathsContxtLAv.LastLADiffIndConstAidPos;
import static Calculus.MathsContxtLAv.NormalNotPareFlag;
import static Calculus.MathsContxtLAv.OpenBraces;
import static Calculus.MathsContxtLAv.ParanExprFlag;
import static Calculus.MathsContxtLAv.ParenthesisFlag;
import static Calculus.MathsContxtLAv.ParseLog;
import static Calculus.MathsContxtLAv.ParseMapAPI;
import static Calculus.MathsContxtLAv.ResetVars;
import static Calculus.MathsContxtLAv.RestoreMathsStateAll;
import static Calculus.MathsContxtLAv.SavedOperator;
import static Calculus.MathsContxtLAv.StrIsAConstant;
import static Calculus.MathsContxtLAv.StrKeyBackUpRestore;
import static Calculus.MathsContxtLAv.TermOutputIndConst;
import static Calculus.MathsContxtLAv.chTerm;
import static Calculus.MathsContxtLAv.depthBackUpRestore;
import static Calculus.MathsExpressionParser.parse;
import static Calculus.MathsContxtLAv.posTerm;
import static Calculus.UsageCalculus.EqnUnderTest;
import static Calculus.UsageCalculus.Order;
import static Calculus.UsageCalculus.StageMapping;
import static Calculus.UsageCalculus.TestCase;
import static Calculus.UsageCalculus.ruleAnalytics;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.DoubleUnaryOperator;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

/**
 *
 * @author Administrator
 */
public class DiffrIntegrSep {

    public static Logger log = Logger.getLogger(DiffrIntegrSep.class.getName());

    // BackUp && Restore Variable
    public static String FileSepBackUpRestore = "DiffrIntegrSep";

    //Important Mapping Variables
    private static Map<String, Double> variables = new HashMap<>();
    private static Map<String, DoubleUnaryOperator> functions = new HashMap<>();
    public static Map<String, String> functionsDiff = new HashMap<>();
    public static Map<String, String> functionsIntegr = new HashMap<>();
    private static Map<Integer, String> variablesEqnPartialSol = new HashMap<>();

    //LAConstDiff Expression character Index and Character Variable
    public static int posLADiff = -1, chLADiff;
    public static String StrLADiff;
    //Diff Expression character Index and Character Variable
    public static int posDiff = -1, chDiff;
    public static String StrDiff;
    //Diff Expression character Index and Character Variable
    public static int posIntegr = -1, chIntegr;
    public static String StrIntegr;

    // Global Variables && Functions
    // Maximum number of Double Fractional Digits displayed in Equation
    private static int MaximumFractionDigits = 25;
    // Maximum number of Integer Digits displayed in Equation
    private static int MaximumIntegerDigits = 50;

    public static boolean ZeroTermSignFlag = false;
    public static boolean ParanExprInProgressFlag = false;
    public static String FuncName = "";
    public static String MyParenDecodedSep = "";
    public static String MyParenEncodedSep = "";
    public static boolean NormalExprnFlag = true;
    public static boolean FuncArgFlag = false;

    public static String ActualStrRuleUsed = "";
    public static String ActualLambdaRuleUsed = "";

    public static List<String> xTermsSep = new ArrayList<>();
    public static List<String> otherTermsSep = new ArrayList<>();
    public static List<String> ConstantTermsSep = new ArrayList<>();
    public static List<String> MixedExpressionTermsSep = new ArrayList<>();
    public static String IntegreNeurtralMultiplier = "";
    public static String IntegreNeurtralDivisor = "";

    public static void MyFuncDiff() {
        functionsDiff.put("sin", "cos");
        functionsDiff.put("cos", "-sin");
        functionsDiff.put("tan", "sec^2.0");
        functionsDiff.put("log", "log");
        functionsDiff.put("ln", "ln");
        functionsDiff.put("exp", "exp");
        //TODO:More Differential Unary Functions to be added
    }

    public static void MyFuncIntegr() {
        functionsIntegr.put("sin", "-cos");
        functionsIntegr.put("cos", "sin");
        functionsIntegr.put("tan", "sec^2.0");
        functionsIntegr.put("log", "log");
        functionsIntegr.put("ln", "ln");
        functionsIntegr.put("exp", "exp");
        //TODO:More Differential Unary Functions to be added
    }

    static void nextCharDiff() {
        ++posDiff;
        chDiff = (posDiff < StrDiff.length()) ? StrDiff.charAt(posDiff) : -1;
        if ((chDiff == -1) && (posDiff >= StrDiff.length())) {
            posDiff = StrDiff.length();
        } else if ((chDiff == -1) || ((chDiff == 0))) {
            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "nextCharDiff:nextCharDiff:Unexpected: " + (char) chDiff + " int=" + (int) chDiff + " Cannot Format:" + StrDiff.substring(posDiff, StrDiff.length()));
        }
    }

    static void prevCharDiff() {
        --posDiff;
        chDiff = (posDiff >= 0) ? StrDiff.charAt(posDiff) : -1;
        if ((chDiff == -1) && (posDiff < 0)) 
            ; else if ((chDiff == -1) || ((chDiff == 0))) {
            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "prevCharDiff:prevCharDiff:Unexpected: " + (char) chDiff + " int=" + (int) chDiff + " Cannot Format:" + StrDiff.substring(posDiff, StrDiff.length()));
        }
    }

    static boolean eatDiff(int CharToEat) {
        while (chDiff == ' ') {
            nextCharDiff();
        }
        if (chDiff == CharToEat) {
            nextCharDiff();
            return true;
        }
        return false;
    }

    static void SyncDiff() {
        if ((posDiff < StrDiff.length())
                && (StrDiff.charAt(posDiff) != chDiff)) {
            if (StrDiff.charAt(posDiff + 1) == chDiff) {
                posDiff++;
            } else if (StrDiff.charAt(posDiff - 1) == chDiff) {
                posDiff--;
            }
        }
    }

    static void nextCharIntegr() {
        ++posIntegr;
        chIntegr = (posIntegr < StrIntegr.length()) ? StrIntegr.charAt(posIntegr) : -1;
        if ((chIntegr == -1) && (posIntegr >= StrIntegr.length())) {
            posIntegr = StrIntegr.length();
        } else if ((chIntegr == -1) || ((chIntegr == 0))) {
            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "nextCharIntegr:nextCharIntegr:Unexpected: " + (char) chIntegr + " int=" + (int) chIntegr + " Cannot Format:" + StrIntegr.substring(posIntegr, StrIntegr.length()));
        }

    }

    static void prevCharIntegr() {
        --posIntegr;
        chIntegr = (posIntegr >= 0) ? StrIntegr.charAt(posIntegr) : -1;
        if ((chIntegr == -1) && (posIntegr < 0)) 
            ; else if ((chIntegr == -1) || ((chIntegr == 0))) {
            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "prevCharIntegr:prevCharIntegr:Unexpected: " + (char) chIntegr + " int=" + (int) chIntegr + " Cannot Format:" + StrIntegr.substring(posIntegr, StrIntegr.length()));
        }
    }

    static boolean eatIntegr(int CharToEat) {
        while (chIntegr == ' ') {
            nextCharIntegr();
        }
        if (chIntegr == CharToEat) {
            nextCharIntegr();
            return true;
        }
        return false;
    }

    static void SyncIntegr() {
        if ((posIntegr < StrIntegr.length())
                && (StrIntegr.charAt(posIntegr) != chIntegr)) {
            if (StrIntegr.charAt(posIntegr + 1) == chIntegr) {
                posIntegr++;
            } else if (StrIntegr.charAt(posIntegr - 1) == chIntegr) {
                posIntegr--;
            }
        }
    }

    static String splitBraces(String Str) {
        String[] Temp = Str.split("\\)");
        String MyTemp = "";
        if (Temp.length >= 1) {
            MyTemp = Temp[0].replaceFirst("\\(", "");
        }
        return MyTemp;
    }

    public static String RemoveEDbl(double Number) {
        String StrNumber = "" + Number;
        if ((StrNumber.contains("E")) || (StrNumber.contains("e"))) {
            NumberFormat formatter = new DecimalFormat();
            formatter.setMaximumFractionDigits(MaximumFractionDigits);
            formatter.setMaximumIntegerDigits(MaximumIntegerDigits);
            log.info("RemoveEDbl:Number=" + Number);
            log.info("RemoveEDbl:Formatted Number=" + formatter.format(Number));
            return formatter.format(Number);
        }
        return (StrNumber);
    }

    public static String StrRemoveEDbl(String Number) {
        if ((Number.contains("E")) || (Number.contains("e"))) {
            NumberFormat formatter = new DecimalFormat("#.##");
            formatter.setMaximumFractionDigits(MaximumFractionDigits);
            formatter.setMaximumIntegerDigits(MaximumIntegerDigits);
            log.info("StrRemoveEDbl:Number=" + Number);
            log.info("StrRemoveEDbl:Formatted Number=" + formatter.format(Number));
            return formatter.format(Number);
        }
        return Number;
    }

    static boolean IsAConstant(String StrX1, String DiffWithRespTo) {

        try {
            StrIsAConstant = "Unknown";
            if ((StrX1.contains("(")) && (StrX1.contains(")"))) {
                StrX1 = StrX1.replaceAll("\\(", "").replaceAll("\\)", "");
            }
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
                    && (StrX.equalsIgnoreCase(DiffWithRespTo)) //&& (StrX.matches("[\\+\\-\\*\\^/]*[a-zA-Z0-9]+"))
                    ) {
                StrIsAConstant = "Var";
                log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                return false;
            } else if ((StrX != null)
                    && (!StrX.equalsIgnoreCase(""))
                    && ((StrX.equalsIgnoreCase(DiffWithRespTo))
                    || ((StrX.contains(DiffWithRespTo)) && ((!StrX.contains(DiffWithRespTo + "^")))))
                    && (StrX.matches("[\\+\\-\\*\\^/]*[a-zA-Z0-9]+"))) {
                StrIsAConstant = "Var";
                log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                return false;
            } else if ((StrX != null)
                    && (!StrX.equalsIgnoreCase(""))
                    && (StrX.contains(DiffWithRespTo))
                    && (!StrX.contains("exp"))) {
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
                    && ((StrX.matches("[\\+\\-]*[0-9\\.\\*\\^/]+[0-9\\.]*"))
                    || (StrX.matches("[\\+\\-]*[0-9\\.\\*/]*\\^[0-9\\.\\*\\^/]+")))) {
                StrIsAConstant = "NumberExpression";
                log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                return true;
            } else if ((StrIsAConstant.equalsIgnoreCase("Unknown")) && (StrX != null)
                    && (!StrX.equalsIgnoreCase(""))
                    && (!StrX.contains(DiffWithRespTo))
                    && ((StrX.matches("[\\+\\-]*[a-zA-Z0-9\\.\\+\\-\\*\\^/]+[\\+\\-]*[0-9\\.]*"))
                    || (StrX.matches("[\\+\\-]*[0-9\\.\\*/\\^]*\\^[a-zA-Z0-9\\.\\+\\-\\*\\^/]*")))) {
                StrIsAConstant = "IndConstantExpression";
                log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                return false;
            } else if ((StrX != null)
                    && (!StrX.equalsIgnoreCase(""))
                    && (!StrX.contains(DiffWithRespTo))
                    && ((StrX.matches("[\\+\\-]*[a-zA-Z0-9\\.\\+\\-\\*\\^/]+[\\+\\-]*[0-9\\.]*"))
                    || (StrX.matches("[\\+\\-]*[0-9\\.\\*/\\^]*\\^[a-zA-Z0-9\\.\\+\\-\\*\\^/]*")))
                    && (StrX.contains("\\("))
                    && (StrX.contains("\\)"))
                    && (StringUtils.countMatches(StrX, "(") == 1)
                    && (StringUtils.countMatches(StrX, ")") == 1)
                    && ((StringUtils.countMatches(StrX, "(") == (StringUtils.countMatches(StrX, ")"))))) {
                StrIsAConstant = "ParenthesisExpression";
                log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                return false;
            } else if ((StrX != null)
                    && (!StrX.equalsIgnoreCase(""))
                    && (!StrX.contains(DiffWithRespTo))
                    && ((StrX.matches("[\\+\\-]*[a-zA-Z0-9\\.\\+\\-\\*\\^/]+[\\+\\-]*[0-9\\.]*"))
                    || (StrX.matches("[\\+\\-]*[0-9\\.\\*/\\^]*\\^[a-zA-Z0-9\\.\\+\\-\\*\\^/]*")))
                    && (StrX.contains("\\("))
                    && (StrX.contains("\\)"))
                    && (StringUtils.countMatches(StrX, "(") > 1)
                    && (StringUtils.countMatches(StrX, ")") == 1)
                    && ((StringUtils.countMatches(StrX, "(") == (StringUtils.countMatches(StrX, ")"))))) {
                StrIsAConstant = "NestedParenthesisExpression";
                log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                return false;
            } else if ((StrX != null)
                    && (!StrX.equalsIgnoreCase(""))
                    && (!StrX.contains(DiffWithRespTo))
                    && ((StrX.matches("[\\+\\-]*[a-zA-Z0-9\\.\\+\\-\\*\\^/]+[\\+\\-]*[0-9\\.]*"))
                    || (StrX.matches("[\\+\\-]*[0-9\\.\\*/\\^]*\\^[a-zA-Z0-9\\.\\+\\-\\*\\^/]*")))
                    && (!StrX.contains("\\("))
                    && (!StrX.contains("\\)"))) {
                StrIsAConstant = "Expression";
                log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                return false;
            }
        } catch (NumberFormatException ConstExp) {
            log.info("IsAConstant:Exception:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
        }
        log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
        return false;
    }

    public static boolean IsExtremity(String StrX1) {
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

    public static boolean IsNumber(int Mych) {
        return ((((Mych >= '0') && (Mych <= '9')) || (Mych == '.')));
    }

    public static boolean IsVariable(int Mych) {
        return (((Mych >= 'a') && (Mych <= 'z')) || ((Mych >= 'A') && (Mych <= 'Z')));
    }

    public static boolean IsIndConstant(int Mych) {
        return ((((Mych >= 'a') && (Mych <= 'z')) || ((Mych >= 'A') && (Mych <= 'Z'))));
    }

    public static boolean IsIndConstantPlain(int Mych) {
        return (((Mych >= 'a') && (Mych <= 'z')) || ((Mych >= 'A') && (Mych <= 'Z')));
    }

    public static boolean IsNotAVariable(int Mych) {
        return (((Mych < 'a') && (Mych > 'z')) && ((Mych < 'A') && (Mych > 'Z')));
    }

    public static boolean IsOperator(int Mych) {
        return (((Mych == '+') || (Mych == '-') || (Mych == '*') || (Mych == '/') || (Mych == '^')));
    }

    public static boolean IsNotANumber(int Mych) {
        return (((Mych < '0') && (Mych > '9')) && (Mych != '.'));
    }

    public static boolean IsNotAnOperator(int Mych) {
        return (((Mych != '+') && (Mych != '-') && (Mych != '*') && (Mych != '/') && (Mych != '^')));
    }

    public static boolean IsLogicalOperator(int Mych) {
        return (((Mych == '>') || (Mych == '<') || (Mych == '=') || (Mych == '&') || (Mych == '|') || (Mych == '!')));
    }

    public static boolean IsNullEmpty(String MyString) {
        return ((MyString == null) || (MyString.equalsIgnoreCase("")) || (MyString.equalsIgnoreCase("0.0")) || (MyString.equalsIgnoreCase("+0.0")) || (MyString.equalsIgnoreCase("-0.0")));
    }

    public static boolean IsNullEmptyZero(String MyString) {
        return ((MyString == null) || (MyString.equalsIgnoreCase("")) || (MyString.equalsIgnoreCase("0.0")) || (MyString.equalsIgnoreCase("+0.0")) || (MyString.equalsIgnoreCase("-0.0")));
    }

    public static boolean IsNotNullAndEmptyAndZero(String MyString) {
        return ((MyString != null) && (!MyString.equalsIgnoreCase("")) && (!MyString.equalsIgnoreCase("0.0")) && (!MyString.equalsIgnoreCase("+0.0")) && (!MyString.equalsIgnoreCase("-0.0")));
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
    private static boolean isUnarySign(String Expr, int mypos) {
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
        if ((mypos > 1) && (prev == 'e' || prev == 'E')) {
            return true;
        }
        return false;
    }

    public static boolean IsHighLvlNumberExprn(String MyString, String DiffWithRespTo) {
        int startPos = 0;
        int Mych = 0;
        if (MyString.length() >= 1) {
            Mych = MyString.charAt(startPos);
        } else if ((MyString == null) || (MyString.isEmpty())) {
            Mych = -1;
        }
        int i = 0;
        double xx = 1.0;
        boolean EnteredLoopFlag = false;
        //numbers
        while ((MyString != null) && (!MyString.equalsIgnoreCase("")) && (MyString.length() > 1) && (i < MyString.length()) && (Mych != -1) && (Mych != 0) && (IsNumber(Mych))) {
            Mych = MyString.charAt(i);
            i++;
            EnteredLoopFlag = true;
        }
        if ((EnteredLoopFlag == true) && (MyString != null) && (!MyString.equalsIgnoreCase("")) && (!MyString.equalsIgnoreCase("NaN")) && (i == MyString.length())) {
            //xx = Double.parseDouble(MyString);

            if ((MyString.contains("-")) || (MyString.contains("+")) || (MyString.contains("*")) || (MyString.contains("/"))) {
                return true;
            }
        } else if (IsAConstant(MyString, DiffWithRespTo)) {
            return false;
        }
        return false;
    }

    @FunctionalInterface
    public interface ReasoningLambdaDiffr {

        String apply();
    }

    public static ReasoningLambdaDiffr parseReason(String AlgoName, String CompleteExpression, String ActualRuleUsed, String HighLevelRule, String LowLevelRules, boolean LogORSkip, String Term1, String Diff1DiffExpr, String Term2, String Diff2DiffExpr, String Term3, String Term4, String StrOperator, String DiffWithRespTo, String TermOperator, String Exprn) {
        return new Object() {
            ReasoningLambdaDiffr Apply() {
                ReasoningLambdaDiffr x = () -> "";
                ActualStrRuleUsed += ActualRuleUsed + ",";
                ActualLambdaRuleUsed += ActualRuleUsed + ",";
                StringBuilder explanation = new StringBuilder("Diffr:Reasoning Steps: Expr=" + CompleteExpression + "\n");
                explanation.append("AlgoName=" + AlgoName + "\n");
                if (ActualRuleUsed.contains("Diff:Str:") && (LogORSkip)) {
                    ruleAnalytics.recordReasoning("" + TestCase, EqnUnderTest, ActualRuleUsed, HighLevelRule, "String");
                } else if (LogORSkip) {
                    ruleAnalytics.recordReasoning("" + TestCase, EqnUnderTest, ActualRuleUsed, HighLevelRule, "Lambda");
                }
                explanation.append("ActualRuleUsed=" + ActualRuleUsed + "\n");
                explanation.append("HighLevelRule=" + HighLevelRule + "\n");
                explanation.append("LowLevelRules=" + LowLevelRules + "\n");
                int i = 0;
                //for (int i=0; i < 15 ; i++) {
                //if (i < 10) {
                explanation.append("Term" + i + "(" + "Term1" + ")").append(":=").append(":=").append(Term1).append("\n");
                i++;
                explanation.append("Term" + i + "(" + "Diff1DiffExpr" + ")").append(":=").append(":=").append(Diff1DiffExpr).append("\n");
                i++;
                explanation.append("Term" + i + "(" + "Term2" + ")").append(":=").append(Term2).append("\n");
                i++;
                explanation.append("Term" + i + "(" + "Diff2DiffExpr" + ")").append(":=").append(Diff2DiffExpr).append("\n");
                i++;
                explanation.append("Term" + i + "(" + "Term3" + ")").append(":=").append(Term3).append("\n");
                i++;
                explanation.append("Term" + i + "(" + "Term4" + ")").append(":=").append(Term4).append("\n");
                i++;
                explanation.append("Term" + i + "(" + "Term4" + ")").append(":=").append(Term4).append("\n");
                i++;
                explanation.append("Term" + i + "(" + "StrOperator" + ")").append(":=").append(StrOperator).append("\n");
                i++;
                explanation.append("Term" + i + "(" + "DiffWithRespTo" + ")").append(":=").append(DiffWithRespTo).append("\n");
                i++;
                explanation.append("Term" + i + "(" + "TermOperator" + ")").append(":=").append(TermOperator).append("\n");
                i++;
                //} else {
                explanation.append("Complete Differentiation").append(":=").append(Exprn).append("\n");
                i++;
                //}
                //}
                x = () -> (explanation.toString());
                if (DevelopmentReasoningLambdaFlagSep) {
                    System.out.println(x.apply());
                }
                return x;
            }
        }.Apply();
    }
//Created by Rajesh Pai
// Converts Coefficients of a Term to a Single Value
//Used only in Differentiation & Integration

    @FunctionalInterface
    public interface LookAheadDiffConst {

        String eval();
    }

    public static LookAheadDiffConst parseLADiff(String str, int StartPos, int DiffLength, String MathsOpType, String DiffWithRespTo) {

        return new Object() {
            void nextCharLADiff() {
                ++posLADiff;
                chLADiff = (posLADiff < StrLADiff.length()) ? StrLADiff.charAt(posLADiff) : -1;
                if ((chLADiff == -1) && (posLADiff >= StrLADiff.length())) {
                    posLADiff = StrLADiff.length();
                } else if ((chLADiff == -1) || ((chLADiff == 0))) {
                    throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "LookAheadDiffConst:parseBase:Unexpected: " + (char) chLADiff + " int=" + (int) chLADiff + " Cannot Format:" + StrLADiff.substring(posLADiff, StrLADiff.length()));
                }
            }

            boolean eatLADiff(int CharToEat) {
                while (chLADiff == ' ') {
                    nextCharLADiff();
                }
                if (chLADiff == CharToEat) {
                    nextCharLADiff();
                    return true;
                }
                return false;
            }

            void SyncLADiff() {
                if ((posLADiff < StrLADiff.length())
                        && (StrLADiff.charAt(posLADiff) != chLADiff)) {
                    if (StrLADiff.charAt(posLADiff + 1) == chLADiff) {
                        posLADiff++;
                    } else if (StrLADiff.charAt(posLADiff - 1) == chLADiff) {
                        posLADiff--;
                    }
                }
            }

            LookAheadDiffConst parseLADiff() {
                ParenthesisFlag = false;
                NormalNotPareFlag = true;
                ComplexAssignFlag = false;
                ContainsIndConstFlag = false;
                GotExtremityFlag = false;
                GotVariableFlag = false;
                GotVariablePos = -1;
                StrLADiff = str;
                //LastLADiffIndConstAidPos = -1;
                //LastLADiffConstCoeffAidPos = -1;
                LastLADiffExtremityAidPos = -1;
                LookAheadDiffConst x = (() -> "");
//                if (ComplexAssignFlag == true) {
//                    ComplexAssignFlag = false;
//                    GotVariableFlag = false;
//                    posLADiff = GotVariablePos;
//                    chLADiff = StrLADiff.charAt(GotVariablePos);
//                } else 
                posLADiff = 0;
                chLADiff = StrLADiff.charAt(0);
                int startpos = posLADiff;
                if (MathsOpType.equalsIgnoreCase("Differentiation")) {
                    ParseLog("LookAheadDiffConst", "parseLADiff", "Initial", "StrLADiff", StrLADiff);
                } else if (MathsOpType.equalsIgnoreCase("Integration")) {
                    ParseLog("LookAheadDiffConst", "parseLADiff", "Initial", "StrLADiff", StrLADiff);
                }
                if ((StrLADiff != null) && (StrLADiff.length() > 0)
                        && (StrLADiff.length() < 2)
                        && ((chLADiff == '*')
                        || (chLADiff == '/')
                        || (chLADiff == '^'))) {
                    return x;
                } else {
                    x = parseTerm();
                    if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadDiffConst:parseLADiff:x.eval()=" + x.eval());
                    }
                }
                if (MathsOpType.equalsIgnoreCase("Differentiation")) {
                    //ParseLog("LookAheadDiffConst", "parseLADiff", "BeforeMap", "StrLADiff", StrLADiff);
                    //ParseMapAPI("LookAheadDiffConst:parseLADiff:Diff", StrDiff.length(), 0, DiffLength, DiffWithRespTo);
                    //ParseLog("LookAheadDiffConst", "parseLADiff", "Final", "StrDiff", StrDiff);
                    if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadDiffConst:parseLADiff:x.eval()=" + x.eval() + " posDiff=" + posDiff + " chDiff=" + (char) chDiff + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                    }
                } else if (MathsOpType.equalsIgnoreCase("Integration")) {
                    ParseLog("LookAheadDiffConst", "parseLADiff", "BeforeMap", "StrLADiff", StrLADiff);
                    ParseMapAPI("LookAheadDiffConst:parseLADiff:Integration", StrIntegr.length(), 0, DiffLength, DiffWithRespTo);
                    ParseLog("LookAheadDiffConst", "parseLADiff", "Final", "StrIntegr", StrIntegr);
                    if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadDiffConst:parseLADiff:x.eval()=" + x.eval() + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                    }
                }

                return x;
            }

            LookAheadDiffConst parseTerm() {
                double Output = 1.0;
                GotVariableFlag = false;
                GotIndConstFlag = false;
                LookAheadDiffConst x = (() -> "");
                x = parseFactor();
                if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                    System.out.println("LookAheadDiffConst:parseTerm:Initial:x.eval()=" + x.eval() + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                }
                for (;;) {
                    if (eatLADiff('*')) { // multiplication
                        LookAheadDiffConst a = x, b = parseFactor();
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadDiffConst:parseTerm:*:x.eval()=" + x.eval() + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                        }
                        log.info("LookAheadDiffConst:parseTerm:b.eval()=" + b.eval() + " DiffTermOperator=" + (char) DiffTermOperator + " LastLADiffConstCoeffAidPos=" + LastLADiffConstCoeffAidPos + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                        if (GotVariableFlag == true) {
                            LADiffFactorOperator = '*';
                        } else if (GotIndConstFlag == true) {
                            LADiffIndConstOperator = '*';
                        }
                        if ((IsAConstant(a.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))
                                && (IsAConstant(b.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                            x = (() -> "" + (Double.parseDouble(a.eval()) * Double.parseDouble(b.eval())));
                            if (MathsOpType.equalsIgnoreCase("Integration")) {
                                LastLADiffConstCoeffAidPos = posIntegr + posLADiff;
                            }
//                            else if (MathsOpType.equalsIgnoreCase("Differentiation")) {
//                                LastLADiffConstCoeffAidPos = posDiff + posLADiff;
//                            }
                            log.info("LookAheadDiffConst:parseTerm:Mult:x.eval()=" + x.eval() + " LADiffFactorOperator=" + (char) LADiffFactorOperator + " DiffTermOperator=" + (char) DiffTermOperator + " LastLADiffConstCoeffAidPos=" + LastLADiffConstCoeffAidPos + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                        } else if (!b.eval().equalsIgnoreCase("1.0")) {
                            x = (() -> a.eval() + "*" + b.eval());
                            if (MathsOpType.equalsIgnoreCase("Integration")) {
                                LastLADiffConstCoeffAidPos = posIntegr + posLADiff;
                            }
                            log.info("LookAheadDiffConst:parseTerm:Mult:x.eval()=" + x.eval() + " LADiffFactorOperator=" + (char) LADiffFactorOperator + " DiffTermOperator=" + (char) DiffTermOperator + " LastLADiffConstCoeffAidPos=" + LastLADiffConstCoeffAidPos + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                        }
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadDiffConst:parseTerm:*:End Value:x.eval()=" + x.eval() + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                        }
                        log.info("LookAheadDiffConst:parseTerm:x.eval()=" + x.eval() + " LADiffFactorOperator=" + (char) LADiffFactorOperator + " DiffTermOperator=" + (char) DiffTermOperator + " LastLADiffConstCoeffAidPos=" + LastLADiffConstCoeffAidPos + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                    } else if (eatLADiff('/')) { // division
                        LookAheadDiffConst a = x, b = parseFactor();
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadDiffConst:parseTerm:/:x.eval()=" + x.eval() + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                        }
                        log.info("LookAheadDiffConst:parseTerm:b.eval()=" + b.eval() + " DiffTermOperator=" + (char) DiffTermOperator + " LastLADiffConstCoeffAidPos=" + LastLADiffConstCoeffAidPos + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                        if (GotVariableFlag == true) {
                            LADiffFactorOperator = '/';
                        } else if (GotIndConstFlag == true) {
                            LADiffIndConstOperator = '/';
                        }
                        if ((IsAConstant(a.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))
                                && (IsAConstant(b.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                            if (b.eval().equalsIgnoreCase("1.0"))
                                ; else if ((IsAConstant(a.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("NumberExpression"))
                                    && (IsAConstant(b.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                                x = (() -> "" + (Double.parseDouble(a.eval()) / Double.parseDouble(b.eval())));
                            } else {
                                x = (() -> "" + a.eval() + "/" + b.eval());
                            }
                            if (MathsOpType.equalsIgnoreCase("Integration")) {
                                LastLADiffConstCoeffAidPos = posIntegr + posLADiff;
                            }
//                            else if (MathsOpType.equalsIgnoreCase("Differentiation")) {
//                                LastLADiffConstCoeffAidPos = posDiff + posLADiff;
//                            }
                            log.info("LookAheadDiffConst:parseTerm:Div:x.eval()=" + x.eval() + " LADiffFactorOperator=" + (char) LADiffFactorOperator + " DiffTermOperator=" + (char) DiffTermOperator + " LastLADiffConstCoeffAidPos=" + LastLADiffConstCoeffAidPos + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                        } else if (!b.eval().equalsIgnoreCase("1.0")) {
                            x = (() -> a.eval() + "/" + b.eval());
                            if (MathsOpType.equalsIgnoreCase("Integration")) {
                                LastLADiffConstCoeffAidPos = posIntegr + posLADiff;
                            }
                            log.info("LookAheadDiffConst:parseTerm:Div:x.eval()=" + x.eval() + " LADiffFactorOperator=" + (char) LADiffFactorOperator + " DiffTermOperator=" + (char) DiffTermOperator + " LastLADiffConstCoeffAidPos=" + LastLADiffConstCoeffAidPos + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                        }
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadDiffConst:parseTerm:/:End Value:x.eval()=" + x.eval() + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                        }
                        log.info("LookAheadDiffConst:parseTerm:x.eval()=" + x.eval() + " LADiffFactorOperator=" + (char) LADiffFactorOperator + " DiffTermOperator=" + (char) DiffTermOperator + " LastLADiffConstCoeffAidPos=" + LastLADiffConstCoeffAidPos + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                    } else {
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadDiffConst:parseTerm:Return Value:x.eval()=" + x.eval() + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                        }
                        return x;
                    }
                }
            }

            LookAheadDiffConst parseFactor() {
                LookAheadDiffConst x = (() -> "1.0");
                x = parseBase();
                if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                    System.out.println("LookAheadDiffConst:parseFactor:Initial:x.eval()=" + x.eval() + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                }
                log.info("LookAheadDiffConst:parseFactor:After Initial Call:x.eval()=" + x.eval() + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                for (;;) {
                    if (eatLADiff('^')) { // exponentiation
                        LookAheadDiffConst a = x, b = parseBase();
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadDiffConst:parseFactor:^:x.eval()=" + x.eval() + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                        }
                        log.info("LookAheadDiffConst:parseFactor:b.eval()=" + b.eval() + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                        if ((IsAConstant(a.eval(), DiffWithRespTo)) && (!a.eval().equalsIgnoreCase("1.0"))
                                && (IsAConstant(b.eval(), DiffWithRespTo)) && (!b.eval().equalsIgnoreCase("1.0"))) {
                            // 2^3
                            x = (() -> "" + (Math.pow(Double.parseDouble(a.eval()), Double.parseDouble(b.eval()))));
                            log.info("LookAheadDiffConst:parseFactor:Rule1:x.eval()=" + x.eval() + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                        } else if ((IsAConstant(a.eval(), DiffWithRespTo)) && (!a.eval().equalsIgnoreCase("1.0"))
                                && (!IsAConstant(b.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant"))) {
                            // 2^a
                            x = (() -> a.eval() + "^" + b.eval());
                            log.info("LookAheadDiffConst:parseFactor:Rule2:x.eval()=" + x.eval() + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                        } else if ((IsAConstant(a.eval(), DiffWithRespTo)) && (!a.eval().equalsIgnoreCase("1.0"))
                                && ((!IsAConstant(b.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Var")))
                                || ((IsAConstant(b.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")) && (b.eval().equalsIgnoreCase("1.0")))) {
                            // 2^x
                            x = (() -> "1.0");
                            log.info("LookAheadDiffConst:parseFactor:Rule3:x.eval()=" + x.eval() + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                        } else if ((!IsAConstant(a.eval(), DiffWithRespTo))
                                && (!IsAConstant(b.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant"))) {
                            // a^b
                            x = (() -> a.eval() + "^" + b.eval());
                            log.info("LookAheadDiffConst:parseFactor:Rule4:x.eval()=" + x.eval() + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                        } else if ((!IsAConstant(a.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Var"))
                                && (!IsAConstant(b.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant"))) {
                            // x^b
                            //x = (() -> "1");
                            log.info("LookAheadDiffConst:parseFactor:Rule5:x.eval()=" + x.eval() + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                        } else if ((!IsAConstant(a.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant"))
                                && (!IsAConstant(b.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Var"))) {
                            // a^x
                            //x = (() -> "1");
                            log.info("LookAheadDiffConst:parseFactor:Rule6:x.eval()=" + x.eval() + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                        } else if ((!IsAConstant(a.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant"))
                                && (IsAConstant(b.eval(), DiffWithRespTo)) && (!b.eval().equalsIgnoreCase("1.0"))) {
                            // a^2
                            TermOutputIndConst += Double.parseDouble(b.eval());
                            x = (() -> a.eval() + "^" + b.eval());
                            TermOutputSetFlag = true;
                            log.info("LookAheadDiffConst:parseFactor:Rule7:x.eval()=" + x.eval() + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                        }
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadDiffConst:parseFactor:^:End Value:x.eval()=" + x.eval() + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                        }
                        log.info("LookAheadDiffConst:parseFactor:x.eval()=" + x.eval() + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                    } else {
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadDiffConst:parseFactor:Return Value:x.eval()=" + x.eval() + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                        }
                        log.info("LookAheadDiffConst:parseFactor:ReturnValue:x.eval()=" + x.eval() + " DiffTermOperator=" + (char) DiffTermOperator + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                        return x;
                    }
                }
            }

            LookAheadDiffConst parseBase() {
                int startPos = posLADiff;

                LookAheadDiffConst x = (() -> "1.0");
                if (eatLADiff('-')) { // unary minus
                    LookAheadDiffConst b = parseBase();
                    x = (() -> b.eval());
                    return x;
                } else if (eatLADiff('+')) { // unary plus
                    x = parseBase();
                    return x;
                }
                if ((IsNumber(chLADiff))) { //numbers
                    log.info("LookAheadDiffConst:parseBase:Entered Numbers:posLADiff=" + posLADiff + " startPos=" + startPos + " chLADiff=" + (char) chLADiff);
                    int startPos1 = posLADiff;
                    if (startPos1 >= 0) ; else {
                        startPos1 = 0;
                    }
                    while ((IsNumber(chLADiff)) && (chLADiff != -1)) {
                        nextCharLADiff();
                        if ((chLADiff == 'E') || (chLADiff == 'e')) {
                            nextCharLADiff();
                            if ((chLADiff == '-') || (chLADiff == '+')) {
                                nextCharLADiff();
                            }
                        }
                    }
                    double xx = 1.0;
                    if ((posLADiff != -1) && (chLADiff != -1)) {
                        if ((IsAConstant(StrLADiff.substring(startPos1, posLADiff), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                            xx = Double.parseDouble(StrLADiff.substring(startPos1, posLADiff));
                        }
                    } else {
                        if ((IsAConstant(StrLADiff.substring(startPos1), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                            xx = Double.parseDouble(StrLADiff.substring(startPos1));
                        }
                    }
                    final Double XX = xx;
                    x = () -> "" + XX;
                    log.info("LookAheadDiffConst:parseBase:Number:x.eval()=" + x.eval() + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                    return x;
                } else if (IsVariable(chLADiff)) {//functions & variables
                    int startPos1 = posLADiff;
                    if (startPos1 >= 0) ; else {
                        startPos1 = 0;
                    }
                    while (((IsVariable(chLADiff)) || (IsNumber(chLADiff))) && (chLADiff != -1)) {
                        nextCharLADiff();
                    }
                    String TempVar = StrLADiff.substring(startPos1, posLADiff);
                    if ((!TempVar.equalsIgnoreCase(DiffWithRespTo)) && (!TempVar.equalsIgnoreCase("NaN")) && (!TempVar.equalsIgnoreCase("Infinity")) && (!functionsDiff.containsKey(TempVar))) {
                        ContainsIndConstFlag = true;
                        GotIndConstFlag = true;
                        GotIndConstPos = startPos1;
                    } else if ((ComplexAssignFlag == false)) {
                        GotVariablePos = startPos1;
                        GotVariableFlag = true;
                        ComplexAssignFlag = true;
                    }
                    // Got a Function
                    log.info("LookAheadDiffConst:parseBase:Before Function:TempVar=" + TempVar + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                    if ((TempVar != null) && (!TempVar.equalsIgnoreCase("")) && (!TempVar.equalsIgnoreCase(DiffWithRespTo)) && (!TempVar.equalsIgnoreCase("NaN")) && (!TempVar.equalsIgnoreCase("Infinity")) && (functionsDiff.containsKey(TempVar))) {
                        log.info("LookAheadDiffConst:parseBase:Function:TempVar=" + TempVar + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                        return x;
                    } else if ((TempVar != null) && (!TempVar.equalsIgnoreCase("")) && (!TempVar.equalsIgnoreCase("NaN")) && (!TempVar.equalsIgnoreCase("Infinity")) && (!TempVar.equalsIgnoreCase(DiffWithRespTo))) {
                        final String MyStr = TempVar;
                        GotIndConstFlag = true;
                        LastLADiffIndConstAidPos = startPos1 - 1;
                        x = () -> MyStr;
                        log.info("LookAheadDiffConst:parseBase:Variable:TempVar=" + TempVar + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                    } else if ((TempVar != null) && (!TempVar.equalsIgnoreCase("")) && ((TempVar.equalsIgnoreCase("NaN")) || (TempVar.equalsIgnoreCase("Infinity"))) && (!TempVar.equalsIgnoreCase(DiffWithRespTo))) {
                        final String MyStr = TempVar;
                        GotExtremityFlag = true;
                        LastLADiffExtremityAidPos = posLADiff;
                        x = () -> MyStr;
                        log.info("LookAheadDiffConst:parseBase:Variable:TempVar=" + TempVar + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                    } else {
                        if ((!TempVar.equalsIgnoreCase(DiffWithRespTo)) && (LastLADiffIndConstAidPos == -1)) {
                            LastLADiffIndConstAidPos = startPos1 - 1;
                        }
                        x = () -> "1.0";
                    }
                    log.info("LookAheadDiffConst:parseBase:Variable:x.eval()=" + x.eval() + " LastLADiffIndConstAidPos=" + LastLADiffIndConstAidPos + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff + " ComplexAssignFlag=" + ComplexAssignFlag + " GotVariableFlag=" + GotVariableFlag + " GotVariablePos=" + GotVariablePos + " GotIndConstFlag=" + GotIndConstFlag);
                    return x;
                } else if (chLADiff == '(') {
                    nextCharLADiff();
                    return x;
                } else if (chLADiff == '*') {
                    return x;
                } else if (chLADiff == '/') {
                    return x;
                }//                else if (chLADiff == ')') {
                //                    nextCharLADiff();
                //                    return x;
                //                } 
                else {
                    if ((StrLADiff != null) && (startPos < StrLADiff.length()) && (startPos < posLADiff) && (chLADiff != -1) && (chLADiff != 0)) {
                        throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "LookAheadConst:parseBase:Unexpected: " + (char) chLADiff + " int=" + (int) chLADiff + " Cannot Format:" + StrLADiff.substring(posLADiff, StrLADiff.length()));
                    } else if ((chLADiff != -1) && (chLADiff != 0) && (posLADiff >= 1) && (posLADiff < StrLADiff.length()) && (IsNumber(chLADiff))) {
                        throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "LookAheadConst:parseBase:Please Check Code:Should NOT reach Here:Unexpected: " + (char) chLADiff + " int=" + (int) chLADiff + " Cannot Format:" + StrLADiff.substring(posLADiff, StrLADiff.length()));
                    } else if ((chLADiff != -1) && (chLADiff != 0) && (posLADiff >= 1) && (posLADiff < StrLADiff.length()) && (IsOperator(chLADiff))) {
                        throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "LookAheadConst:parseBase:Please Check Equation Operators:Should NOT reach Here:Unexpected: " + (char) chLADiff + " int=" + (int) chLADiff + " Cannot Format:" + StrLADiff.substring(posLADiff, StrLADiff.length()));
                    } else if ((chLADiff != -1) && (chLADiff != 0) && (posLADiff >= 1) && (posLADiff < StrLADiff.length())) {
                        throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "LookAheadConst:parseBase:Unexpected: " + (char) chLADiff + " int=" + (int) chLADiff + " Cannot Format:" + StrLADiff.substring(posLADiff, StrLADiff.length()));
                    }
                    return x;
                }
            }
        }.parseLADiff();
    }

    @FunctionalInterface
    public interface DiffExpr {

        String DiffExpr();
    }

    public static DiffExpr parseDiff(String str, Map<String, Double> variables, String DiffWithRespTo, String MapType, String IntegrORDiffr) {

        return new Object() {

            boolean ParanExprInProgressFlag = false;

            DiffExpr parseDiffExpr() {
                DiffExpr x = (() -> "");
                ResetVars("DiffExpr");
                MyFuncDiff();
                StrDiff = str;
                if ((StrDiff == null) || (StrDiff.equalsIgnoreCase(""))) {
                    return x;
                }
                posDiff = 0;
                chDiff = StrDiff.charAt(0);
                int oldch = chDiff;
                if ((IsVariable(chDiff)) || (IsNumber(chDiff))) {
                    oldch = 0;
                } else if ((chDiff == '-') || (chDiff == '+')) {
                    posDiff = posDiff + 1;
                    if ((StrDiff.length() > 1)) {
                        chDiff = StrDiff.charAt(1);
                    }
                }
                if ((StrDiff != null) && (StrDiff.length() > 0)
                        && (StrDiff.length() < 2)
                        && ((chDiff == '*')
                        || (chDiff == '/')
                        || (chDiff == '^'))) {
                    return x;
                } else {
                    x = parseExpressionDiff();
                    if ((x.DiffExpr().contains("@Unknown@")) || (x.DiffExpr().contains("@"))) {
                        throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "Diff:parseDiffExpr:x.DiffExpr()=" + x.DiffExpr() + ":Unknown in Differentiation Output:Unexpected: " + (char) chDiff + " int=" + (int) chDiff + " Cannot Format:" + StrDiff.substring(posDiff, StrDiff.length()));
                    }
                }
                log.info("Diff:parseDiff:Final:x.DiffExpr()=" + x.DiffExpr());
                if ((oldch == '-') && (x.DiffExpr().startsWith("-"))) {
                    final String FinalOutput = x.DiffExpr().replaceFirst("-", "");
                    x = (() -> FinalOutput);
                } else if ((oldch == '-') && (!x.DiffExpr().startsWith("-"))) {
                    final String FinalOutput = x.DiffExpr();
                    final int MySignInt = oldch;
                    x = (() -> (char) MySignInt + FinalOutput);
                }
//                if (x.DiffExpr().contains("--")) {
//                    String OutputExprn = x.DiffExpr().replaceAll("\\--", "-");
//                    final String FinalOutput = OutputExprn;
//                    x = (() -> FinalOutput);
//                }
//                if (x.DiffExpr().contains("+-")) {
//                    String OutputExprn = x.DiffExpr().replaceAll("\\+-", "-");
//                    final String FinalOutput = OutputExprn;
//                    x = (() -> FinalOutput);
//                }
                return x;
            }

            //Grammar:
            //expression = term | expression '+' term |expression '-' term
            //term = factor | term '*' factor | term '/' factor
            //factor = base | base ^ base
            //base = '-' base | '+' base | number | identifier |function expression | '(' expression ')'
            //
            DiffExpr parseExpressionDiff() {
                int ExprStartPos = posDiff;
                int ExprEndPos = -1;

                int startpos = posDiff;
                DiffTermOperator = -1;
                DiffExpr x = parseTermDiff();
                int endpos = posDiff;
                String xExprn = "";
                String OutputExprn = "";
                if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                    System.out.println("parseExpressionDiff:x.DiffExpr()=" + x.DiffExpr());
                }
                if ((startpos != -1) && (endpos != -1) && (startpos < endpos) && (startpos <= StrDiff.length()) && (startpos < StrDiff.length()) && (endpos <= StrDiff.length())) {
                    xExprn = StrDiff.substring(startpos, endpos);
                }
                OutputExprn = x.DiffExpr();
                log.info("Diff:parseExpressionDiff:Initial Call to parseTermDiff:OutputExprn=" + OutputExprn);
                log.info("Diff:parseExpressionDiff:Initial Call to parseTermDiff:xExprn=" + xExprn);
                if ((IsAConstant(OutputExprn, DiffWithRespTo)) && (IsAConstant(xExprn, DiffWithRespTo)) && ((chDiff == '+') || (chDiff == '-') || (chDiff == -1))) {
                    log.info("Diff:parseExpressionDiff:Mapping 0.0:Got a Constant Value from parseTermDiff:OutputExprn=" + OutputExprn);
                    OutputExprn = "0.0";
                    final String Output = OutputExprn;
                    x = (() -> Output);
                    xExprn = Output;
                } else if ((!IsAConstant(OutputExprn, DiffWithRespTo))
                        && ((StrIsAConstant.equalsIgnoreCase("IndConstantExpression"))
                        || (StrIsAConstant.equalsIgnoreCase("IndConstant")))
                        && (!IsAConstant(xExprn, DiffWithRespTo))
                        && ((StrIsAConstant.equalsIgnoreCase("IndConstantExpression"))
                        || (StrIsAConstant.equalsIgnoreCase("IndConstant")))
                        && ((chDiff == '+') || (chDiff == '-') || (chDiff == -1))) {
                    log.info("Diff:parseExpressionDiff:Mapping 0.0:Got a Constant Value from parseTermDiff:OutputExprn=" + OutputExprn);
                    if (!OutputExprn.endsWith("*0.0")) {
                        OutputExprn = OutputExprn + "*" + "0.0";
                    }
                    final String Output = OutputExprn;
                    x = (() -> Output);
                    xExprn = Output;
                } else if ((OutputExprn.equalsIgnoreCase(DiffWithRespTo)) || (OutputExprn.equalsIgnoreCase("1.0")) && ((chDiff == '+') || (chDiff == '-') || (chDiff == -1))) {
                    OutputExprn = "1.0";
                    if (xExprn.equalsIgnoreCase("-" + DiffWithRespTo)) {
                        final String Output = "-" + OutputExprn;
                        x = (() -> Output);
                        xExprn = Output;
                    } else {
                        final String Output = OutputExprn;
                        x = (() -> Output);
                        xExprn = Output;
                    }
                    log.info("Diff:parseExpressionDiff:Mapping 1.0:Got a " + DiffWithRespTo + " from parseTermDiff:OutputExprn=" + OutputExprn + " x.DiffExpr()=" + x.DiffExpr() + " xExprn=" + xExprn);
                } else if ((OutputExprn.equalsIgnoreCase("")) || (xExprn.equalsIgnoreCase("")) && ((chDiff == '+') || (chDiff == '-') || (chDiff == -1))) {
                    log.info("Diff:parseExpressionDiff:Mapping 0.0:Got a Constant Value from parseTermDiff:OutputExprn=" + OutputExprn);
                    OutputExprn = "0.0";
                    final String Output = OutputExprn;
                    x = (() -> Output);
                    xExprn = Output;
                } else {
                    final String Output = OutputExprn;
                    x = (() -> Output);
                    xExprn = Output;
                }
                log.info("Diff:parseExpressionDiff:Initial Call to parseTermDiff:x.DiffExpr()=" + x.DiffExpr() + " chDiff=" + (char) chDiff + " chDiff=" + chDiff + " posDiff=" + posDiff);
                if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                    System.out.println("Diff:parseExpressionDiff:Initial Call to parseTermDiff:x.DiffExpr()=" + x.DiffExpr() + " chDiff=" + (char) chDiff + " chDiff=" + chDiff + " posDiff=" + posDiff + " StrDiff.substring(posDiff).length()=" + StrDiff.substring(posDiff).length() + " StrDiff=" + StrDiff.substring(posDiff));
                }
//                if (x.DiffExpr().contains("(")) {
//                    if (!x.DiffExpr().contains("ln(")) {
//                        prevCharDiff();
//                    }
//
//                }
                for (;;) {
                    DiffTermOperator = -1;
                    ContainsXFlag = false;
                    if ((eatDiff('+')) /*&& ((NormalExprnFlag == true) || (NormalNotPareFlag == true) || (ParenthesisFlag == true) || (FuncArgFlag == true)) */) {// addition
                        log.info("Diff:parseExpressionDiff:+ Entered");
                        int bstartpos = posDiff;
                        DiffExpr a = x, b = parseTermDiff();
                        String bExprn = "";
                        int bendpos = posDiff;
                        if ((bstartpos != -1) && (bendpos != -1) && (bstartpos < bendpos) && (bstartpos <= StrDiff.length()) && (bstartpos < StrDiff.length()) && (bendpos <= StrDiff.length())) {
                            bExprn = StrDiff.substring(bstartpos, bendpos);
                        }
                        log.info("Diff:parseExpressionDiff:b.DiffExpr()=" + b.DiffExpr());
                        log.info("Diff:parseExpressionDiff:bExprn=" + bExprn);
                        if (((IsAConstant(b.DiffExpr(), DiffWithRespTo))
                                && (!b.DiffExpr().contains(DiffWithRespTo))
                                && (b.DiffExpr().equalsIgnoreCase(bExprn)))
                                || (b.DiffExpr().equalsIgnoreCase(""))) {
                            b = (() -> "0.0");
                            //bExprn = "0.0";
                        } else if (!(IsAConstant(b.DiffExpr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")) && (!b.DiffExpr().contains(DiffWithRespTo)) && (b.DiffExpr().equalsIgnoreCase(bExprn))) {
                            final String Temp = b.DiffExpr();
                            if (!Temp.endsWith("*0.0")) {
                                b = (() -> Temp + "*" + "0.0");
                                //bExprn = Temp + "*" + "0.0";
                            } else {
                                b = (() -> Temp);
                                //bExprn = Temp;
                            }
                        } else if ((!b.DiffExpr().equalsIgnoreCase(bExprn)) && ((b.DiffExpr().equalsIgnoreCase(DiffWithRespTo)) || (b.DiffExpr().equalsIgnoreCase("1.0"))))
                            ;//Do Nothing as b.DiffExpr() has the value(the Coeff of x)
                        else if ((b.DiffExpr().equalsIgnoreCase(DiffWithRespTo)) || (b.DiffExpr().equalsIgnoreCase("1.0"))) {
                            b = (() -> "1.0");
                            //bExprn = "1.0";
                        } else {
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:parseExpressionDiff:+:No Else:x.DiffExpr()=" + x.DiffExpr() + " b.DiffExpr()=" + b.DiffExpr());
                            }
                        }

                        log.info("Diff:parseExpressionDiff:b.DiffExpr()=" + b.DiffExpr());
                        log.info("Diff:parseExpressionDiff:bExprn=" + bExprn);
                        log.info("Diff:parseExpressionDiff:xExprn=" + xExprn);
                        if (a.DiffExpr().contains("Parenthesis")) {
                            Expr_Func_Split(a.DiffExpr(), DiffWithRespTo);
                            final String ParaExprA = ParanExpr;
                            final String ParaExprDiffExprA = ParanDiffExpr;
                            a = (() -> ParaExprDiffExprA);
                        }
                        if (b.DiffExpr().contains("Parenthesis")) {
                            Expr_Func_Split(b.DiffExpr(), DiffWithRespTo);
                            final String ParaExprB = ParanExpr;
                            final String ParaExprDiffExprB = ParanDiffExpr;
                            b = (() -> ParaExprDiffExprB);
                        }
                        DiffTermOperator = -1;
                        String CompltExprn = StrDiff.substring(ExprStartPos, posDiff);
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Diff:parseExpressionDiff:+:Final:FSM Start:bExprn=" + bExprn + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                        }
                        if (bExprn.contains(DiffWithRespTo)) {
                            x = ApplyLambdaRules("parseExpressionDiff1", CompltExprn, xExprn, a, "", b, "", "", "+", "SumRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            xExprn = ApplyLambdaString("parseExpressionDiff1", CompltExprn, xExprn, a, "", b, "", "", "+", "SumRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            log.info("Diff:parseExpressionDiff::a.DiffExpr()=" + a.DiffExpr());
                            log.info("Diff:parseExpressionDiff::b.DiffExpr()=" + b.DiffExpr());
                            log.info("Diff:parseExpressionDiff::x.DiffExpr()=" + x.DiffExpr());
                            log.info("Diff:parseExpressionDiff::xExprn=" + xExprn);
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:parseExpressionDiff:+:Final:x.DiffExpr()=" + x.DiffExpr() + " bExprn=" + bExprn);
                                System.out.println("Diff:parseExpressionDiff:+:Final:xExprn=" + xExprn);
                            }
                        } else {
                            final String TempDiff1 = x.DiffExpr();
                            final String TempDiff2 = bExprn;
                            x = (() -> TempDiff1 + "+" + TempDiff2 + "*" + "0.0");
                            xExprn = TempDiff1 + "+" + TempDiff2 + "*" + "0.0";
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:parseExpressionDiff:+:Final:Else:x.DiffExpr()=" + x.DiffExpr() + " bExprn=" + bExprn + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                                System.out.println("Diff:parseExpressionDiff:+:Final:Else:xExprn=" + xExprn);
                            }
                        }
//                        if (x.DiffExpr().contains("(")) {
//                            if (!x.DiffExpr().contains("ln(")) {
//                                prevCharDiff();
//                            }
//                        }
                    } else if ((eatDiff('-')) /*&& ((NormalExprnFlag == true) || (NormalNotPareFlag == true) || (ParenthesisFlag == true) || (FuncArgFlag == true))*/) { // subtraction
                        log.info("Diff:parseExpressionDiff:- Entered");
                        int bstartpos = posDiff;
                        DiffExpr a = x, b = parseTermDiff();
                        int bendpos = posDiff;
                        String bExprn = "";
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Diff:parseExpressionDiff:-:Initial:x.DiffExpr()=" + x.DiffExpr() + " b.DiffExpr()=" + b.DiffExpr());
                        }
                        if ((bstartpos != -1) && (bendpos != -1) && (bstartpos < bendpos) && (bstartpos <= StrDiff.length()) && (bstartpos < StrDiff.length()) && (bendpos <= StrDiff.length())) {
                            bExprn = StrDiff.substring(bstartpos, bendpos).trim();
                        }
                        log.info("Diff:parseExpressionDiff:b.DiffExpr()=" + b.DiffExpr());
                        log.info("Diff:parseExpressionDiff:bExprn=" + bExprn);
                        log.info("Diff:parseExpressionDiff:xExprn=" + xExprn);
                        if ((IsAConstant(b.DiffExpr(), DiffWithRespTo))
                                && (!b.DiffExpr().contains(DiffWithRespTo))
                                && (b.DiffExpr().equalsIgnoreCase(bExprn))
                                || (b.DiffExpr().equalsIgnoreCase(""))) {
                            b = (() -> "0.0");
                            //bExprn = "0.0";
                        } else if (!(IsAConstant(b.DiffExpr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant")) && (!b.DiffExpr().contains(DiffWithRespTo)) && (b.DiffExpr().equalsIgnoreCase(bExprn))) {
                            if (((b.DiffExpr().equalsIgnoreCase("Infinity")) || (b.DiffExpr().equalsIgnoreCase("NaN"))) && (b.DiffExpr().equalsIgnoreCase(bExprn))) {
                                final String Temp = b.DiffExpr();
                                b = (() -> Temp);
                                //bExprn = Temp;
                            } else {
                                final String Temp = bExprn;
                                if (!Temp.endsWith("*0.0")) {
                                    b = (() -> Temp + "*" + "0.0");
                                    //bExprn = Temp + "*" + "0.0";
                                } else {
                                    b = (() -> Temp);
                                    //bExprn = Temp;
                                }

                            }
                        } else if (!(IsAConstant(b.DiffExpr(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")) && (!b.DiffExpr().contains(DiffWithRespTo)) && (b.DiffExpr().equalsIgnoreCase(bExprn))) {
                            final String Temp = bExprn;
                            if (!Temp.endsWith("*0.0")) {
                                b = (() -> Temp + "*" + "0.0");
                                //bExprn = Temp + "*" + "0.0";
                            } else {
                                b = (() -> Temp);
                                //bExprn = Temp;
                            }

                        } else if ((!b.DiffExpr().equalsIgnoreCase(bExprn)) && ((b.DiffExpr().equalsIgnoreCase(DiffWithRespTo)) || (b.DiffExpr().equalsIgnoreCase("1.0"))))
                            ;//Do Nothing
                        else if ((b.DiffExpr().equalsIgnoreCase(DiffWithRespTo)) || (b.DiffExpr().equalsIgnoreCase("1.0"))) {
                            b = (() -> "1.0");
                            //bExprn = "1.0";
                        } else {
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:parseExpressionDiff:-:No Else:x.DiffExpr()=" + x.DiffExpr() + " b.DiffExpr()=" + b.DiffExpr());
                            }
                        }
                        log.info("Diff:parseExpressionDiff:b.DiffExpr()=" + b.DiffExpr());
                        log.info("Diff:parseExpressionDiff:bExprn=" + bExprn);
                        log.info("Diff:parseExpressionDiff:xExprn=" + xExprn);
                        if (a.DiffExpr().contains("Parenthesis")) {
                            Expr_Func_Split(a.DiffExpr(), DiffWithRespTo);
                            final String ParaExprA = ParanExpr;
                            final String ParaExprDiffExprA = ParanDiffExpr;
                            a = (() -> ParaExprDiffExprA);
                        }
                        if (b.DiffExpr().contains("Parenthesis")) {
                            Expr_Func_Split(b.DiffExpr(), DiffWithRespTo);
                            final String ParaExprB = ParanExpr;
                            final String ParaExprDiffExprB = ParanDiffExpr;
                            b = (() -> ParaExprDiffExprB);
                        }
                        DiffTermOperator = -1;
                        String CompltExprn = StrDiff.substring(ExprStartPos, posDiff);
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Diff:parseExpressionDiff:-:Final:FSM START:bExprn=" + bExprn);
                        }
                        if (bExprn.contains(DiffWithRespTo)) {
                            x = ApplyLambdaRules("parseExpressionDiff2", CompltExprn, xExprn, a, bExprn, b, "", "", "-", "SubtractionRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            xExprn = ApplyLambdaString("parseExpressionDiff2", CompltExprn, xExprn, a, bExprn, b, "", "", "-", "SubtractionRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            log.info("Diff:parseExpressionDiff::a.DiffExpr()=" + a.DiffExpr());
                            log.info("Diff:parseExpressionDiff::b.DiffExpr()=" + b.DiffExpr());
                            log.info("Diff:parseExpressionDiff::x.DiffExpr()=" + x.DiffExpr());
                            log.info("Diff:parseExpressionDiff::xExprn=" + xExprn);
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:parseExpressionDiff:-:Final:x.DiffExpr()=" + x.DiffExpr() + " bExprn=" + bExprn);
                                System.out.println("Diff:parseExpressionDiff:-:Final:xExprn=" + xExprn);
                            }
                        } else {
                            final String TempDiff1 = x.DiffExpr();
                            final String TempDiff2 = bExprn;
                            x = (() -> TempDiff1 + "-" + TempDiff2 + "*" + "0.0");
                            xExprn = TempDiff1 + "-" + TempDiff2 + "*" + "0.0";
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:parseExpressionDiff:-:Final:Else:x.DiffExpr()=" + x.DiffExpr() + " bExprn=" + bExprn);
                                System.out.println("Diff:parseExpressionDiff:-:Final:Else:xExprn=" + xExprn);
                            }
                        }
//                        if (x.DiffExpr().contains("(")) {
//                            if (!x.DiffExpr().contains("ln(")) {
//                                prevCharDiff();
//                            }
//                        }
                    } else if ((chDiff != -1) && ((chDiff != '+') || (chDiff != '-'))) {
                        posDiff = advanceOneTerm(StrDiff, posDiff);
                        if ((posDiff > -1) && (posDiff < StrDiff.length())) {
                            chDiff = StrDiff.charAt(posDiff);
                        } else if ((StrDiff != null) && (posDiff == -1)) {
                            posDiff = StrDiff.length();
                            chDiff = -1;
                        } else {
                            posDiff = -1;
                            chDiff = -1;
                        }
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Diff:parseExpressionDiff:advanceOneTerm:One Term Over:x.DiffExpr()=" + x.DiffExpr() + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                            System.out.println("Diff:parseExpressionDiff:advanceOneTerm:One Term OverxExprn=" + xExprn + " StrDiff.length()=" + StrDiff.length());
                        }
                    } else {
                        if (posDiff < StrDiff.length()) {
                            ExprEndPos = posDiff;
                        } else {
                            ExprEndPos = StrDiff.length();
                        }
                        if (x.DiffExpr().equalsIgnoreCase(xExprn)) {
                            log.info("Diff:parseExpressionDiff:Equal:Return Value parseExpressionDiff:x.DiffExpr()=" + x.DiffExpr() + " Original Diff Expr=" + StrDiff.substring(ExprStartPos, ExprEndPos));
                            log.info("Diff:parseExpressionDiff:Equal:Return Value parseExpressionDiff:xExprn=" + xExprn);
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:parseExpressionDiff:+:Return Value:x.DiffExpr()=" + x.DiffExpr());
                                System.out.println("Diff:parseExpressionDiff:+:Return Value:xExprn=" + xExprn);
                            }
                            return x;
                        } else {
                            final String Temp = xExprn;
                            x = (() -> Temp);
                        }
                        log.warn("Diff:parseExpressionDiff:String:Mapped State Not Equal:Return Value parseExpressionDiff:x.DiffExpr()=" + x.DiffExpr() + " Original Diff Expr=" + StrDiff.substring(ExprStartPos, ExprEndPos));
                        log.warn("Diff:parseExpressionDiff:String:Mapped State Not Equal:Return Value parseExpressionDiff:xExprn=" + xExprn);
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Diff:parseExpressionDiff:Mapped State Not Equal:Return Value:x.DiffExpr()=" + x.DiffExpr());
                            System.out.println("Diff:parseExpressionDiff:Mapped State Not Equal:Return Value:xExprn=" + xExprn);
                        }
                        return x;
                    }
                }
            }

            DiffExpr parseTermDiff() {
                int TermStartPos = posDiff;
                int TermEndPos = -1;
                int startpos = posDiff;
                EnteredLAConstFlag = false;
                DiffExpr x = parseFactorDiff();
                DiffExpr c = x;
                DiffExpr dNull = (() -> "");
                int endpos = posDiff;
                String OutputExprn = "";
                String MappedProduct = "";
                String aMappedProduct = "";
                String aOrigExprn = "";
                String bOrigExprn = "";
                String xExprn = "";
                if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                    System.out.println("Diff:parseTermDiff:Initial:x.DiffExpr()=" + x.DiffExpr());
                }
                if ((startpos != -1) && (endpos != -1) && (startpos < endpos) && (startpos <= StrDiff.length()) && (startpos < StrDiff.length()) && (endpos < StrDiff.length())) {
                    xExprn = StrDiff.substring(startpos, endpos);
                    aOrigExprn = xExprn;
                }
                String xConst = "";
                OutputExprn = x.DiffExpr();
                log.info("Diff:parseTermDiff:Initial Call to FactorDiff:OutputExprn=" + OutputExprn);
                if ((posDiff == StrDiff.length()) && (chDiff == -1)) {
                    final String OutputExprn1 = OutputExprn;
                    x = (() -> OutputExprn1);
                    log.info("Diff:parseTermDiff:Last Term:Return Value parseTermDiff:x.DiffExpr()=" + x.DiffExpr() + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                    if (TermStartPos < TermEndPos) {
                        log.info(":Last Term:Original Diff=" + StrDiff.substring(TermStartPos, TermEndPos));
                    }
                    log.info("Diff:parseTermDiff:Last Term:Return Value parseTermDiff:xExprn=" + xExprn);
                    return x;
                } else if ((xConst.equalsIgnoreCase("")) && (!x.DiffExpr().equalsIgnoreCase("")) && (!x.DiffExpr().equalsIgnoreCase("0.0"))) {
                    aMappedProduct = xExprn;
                    String CompltExprn = "";
                    if (TermStartPos <= posDiff) {
                        CompltExprn = StrDiff.substring(TermStartPos, posDiff);
                    } else {
                        CompltExprn = StrDiff.substring(TermStartPos);
                    }
                    x = ApplyLambdaRules("parseTermDiff00", CompltExprn, aMappedProduct, x, x.DiffExpr(), dNull, "", "", ("" + (char) chDiff), "NoExponentRuleDiff", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                    xExprn = ApplyLambdaString("parseTermDiff00", CompltExprn, aMappedProduct, c, c.DiffExpr(), dNull, "", "", ("" + (char) chDiff), "NoExponentRuleDiff", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                } else if ((xConst.equalsIgnoreCase(OutputExprn)) && (!x.DiffExpr().equalsIgnoreCase("")) && (!x.DiffExpr().equalsIgnoreCase("0.0"))) {
                    aMappedProduct = xExprn;
                    String CompltExprn = "";
                    if (TermStartPos <= posDiff) {
                        CompltExprn = StrDiff.substring(TermStartPos, posDiff);
                    } else {
                        CompltExprn = StrDiff.substring(TermStartPos);
                    }
                    x = ApplyLambdaRules("parseTermDiff01", CompltExprn, OutputExprn, x, x.DiffExpr(), x, "", "", "*", "ExponentRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                    xExprn = ApplyLambdaString("parseTermDiff01", CompltExprn, OutputExprn, c, c.DiffExpr(), c, "", "", "*", "ExponentRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                } else if ((!x.DiffExpr().equalsIgnoreCase("")) && (!x.DiffExpr().equalsIgnoreCase("0.0"))) {
                    aMappedProduct = xExprn;
                    String CompltExprn = "";
                    if (TermStartPos <= posDiff) {
                        CompltExprn = StrDiff.substring(TermStartPos, posDiff);
                    } else {
                        CompltExprn = StrDiff.substring(TermStartPos);
                    }
                    x = ApplyLambdaRules("parseTermDiff10", CompltExprn, OutputExprn, x, x.DiffExpr(), x, "", "", "*", "CoeffExponentRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                    xExprn = ApplyLambdaString("parseTermDiff10", CompltExprn, OutputExprn, c, c.DiffExpr(), c, "", "", "*", "CoeffExponentRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                } else if (x.DiffExpr().equalsIgnoreCase("0.0")) {
                    aMappedProduct = xExprn;
                    xExprn = "0.0";
                } else if ((x.DiffExpr().equalsIgnoreCase("")) && (!IsAConstant(xExprn, DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("Unknown")))) {
                    aMappedProduct = xExprn;
                    String CompltExprn = "";
                    if (TermStartPos <= posDiff) {
                        CompltExprn = StrDiff.substring(TermStartPos, posDiff);
                    } else {
                        CompltExprn = StrDiff.substring(TermStartPos);
                    }
                    x = ApplyLambdaRules("parseTermDiff11", CompltExprn, xExprn, x, x.DiffExpr(), x, "", "", "*", "ConstantRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                    xExprn = ApplyLambdaString("parseTermDiff11", CompltExprn, OutputExprn, c, c.DiffExpr(), c, "", "", "*", "ConstantRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                } else {
                    if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                        System.out.println("Diff:parseTermDiff:No Else:x.DiffExpr()=" + x.DiffExpr());
                    }
                }
                log.info("Diff:parseTermDiff:Initial Call to FactorDiff:aMappedProduct=" + aMappedProduct);
                log.info("Diff:parseTermDiff:x.DiffExpr()=" + x.DiffExpr());
                log.info("Diff:parseTermDiff:xExprn=" + xExprn + " posDiff=" + posDiff + " chDiff=" + (char) chDiff + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                for (;;) {
                    if (eatDiff('*')) { // multiplication
                        log.info("Diff:parseTermDiff:Multiply Entered" + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                        if ((DiffTermOperator == -1) || (DiffTermOperator == '/')) {
                            DiffTermOperator = '*';
                        }
                        int bstartpos = posDiff;
                        log.info("Diff:parseTermDiff:x.DiffExpr()=" + x.DiffExpr());

                        DiffExpr a = x, b = parseFactorDiff();
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Diff:parseTermDiff:*:Initial:x.DiffExpr()=" + x.DiffExpr() + " b.DiffExpr()=" + b.DiffExpr());
                        }
                        int bendpos = posDiff;
                        if ((bstartpos != -1) && (bstartpos < bendpos) && (bstartpos <= StrDiff.length()) && (bstartpos < StrDiff.length()) && (bendpos < StrDiff.length())) {
                            MappedProduct = StrDiff.substring(bstartpos, bendpos);
                            if (!aOrigExprn.contains(DiffWithRespTo)) {
                                aOrigExprn = aOrigExprn + "*" + MappedProduct;
                            } else if (MappedProduct.contains(DiffWithRespTo)) {
                                bOrigExprn = MappedProduct;
                            }
                        }

                        log.info("Diff:parseTermDiff:Mult:OutputExprn=" + OutputExprn);
                        log.info("Diff:parseTermDiff:Mult:a.DiffExpr()=" + a.DiffExpr());
                        log.info("Diff:parseTermDiff:Mult:x.DiffExpr()=" + x.DiffExpr());
                        OutputExprn = b.DiffExpr();
                        log.info("Diff:parseTermDiff:Mult:x.DiffExpr()=" + x.DiffExpr());
                        log.info("Diff:parseTermDiff:Mult:aMappedProduct=" + aMappedProduct);
                        log.info("Diff:parseTermDiff:Mult:MappedProduct=" + MappedProduct);
                        log.info("Diff:parseTermDiff:Mult:OutputExprn=" + OutputExprn);
                        log.info("Diff:parseTermDiff:Mult:b.DiffExpr()=" + b.DiffExpr() + " DiffTermOperator=" + (char) DiffTermOperator);
                        log.info("Diff:parseTermDiff:Mult:a.DiffExpr()=" + a.DiffExpr());
                        if (((b.DiffExpr() == null) || (b.DiffExpr().equalsIgnoreCase("0.0"))) && ((OutputExprn == null) || (OutputExprn.equalsIgnoreCase("")))) {
                            String CompltExprn = "";
                            if (TermStartPos <= posDiff) {
                                CompltExprn = StrDiff.substring(TermStartPos, posDiff);
                            } else {
                                CompltExprn = StrDiff.substring(TermStartPos);
                            }
                            x = ApplyLambdaRules("parseTermDiff100", CompltExprn, OutputExprn, a, x.DiffExpr(), b, "", "", "*", "ExponentRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            xExprn = ApplyLambdaString("parseTermDiff100", CompltExprn, OutputExprn, a, b.DiffExpr(), b, "", "", "+", "ExponentRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            if ((!MappedProduct.equalsIgnoreCase("")) && (!MappedProduct.equalsIgnoreCase("1.0"))) {
                                aMappedProduct = aMappedProduct + "*" + MappedProduct;
                            }
                        } else if (OutputExprn.equalsIgnoreCase(DiffWithRespTo)) {
                            String CompltExprn = "";
                            if (TermStartPos <= posDiff) {
                                CompltExprn = StrDiff.substring(TermStartPos, posDiff);
                            } else {
                                CompltExprn = StrDiff.substring(TermStartPos);
                            }
                            x = ApplyLambdaRules("parseTermDiff101", CompltExprn, aMappedProduct, a, b.DiffExpr(), b, "", "", "*", "ConstantRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            xExprn = ApplyLambdaString("parseTermDiff101", CompltExprn, aMappedProduct, a, b.DiffExpr(), b, "", "", "*", "ConstantRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            if ((!MappedProduct.equalsIgnoreCase("")) && (!MappedProduct.equalsIgnoreCase("1.0"))) {
                                aMappedProduct = aMappedProduct + "*" + MappedProduct;
                            }
                        } else if (((a.DiffExpr().contains("Parenthesis")) && (!(a.DiffExpr().contains(DiffWithRespTo))))
                                || ((b.DiffExpr().contains("Parenthesis")) && (!(b.DiffExpr().contains(DiffWithRespTo))))) {
                            if ((a.DiffExpr().contains("Parenthesis")) && (!(a.DiffExpr().contains(DiffWithRespTo)))) {
                                Split(a.DiffExpr(), DiffWithRespTo);
                                Expr_Func_Split(a.DiffExpr(), DiffWithRespTo);
                                String CompltExprn = "";
                                if (TermStartPos <= posDiff) {
                                    CompltExprn = StrDiff.substring(TermStartPos, posDiff);
                                } else {
                                    CompltExprn = StrDiff.substring(TermStartPos);
                                }
                                x = ApplyLambdaRules("parseTermDiff1110", CompltExprn, aMappedProduct, a, b.DiffExpr(), b, "", "", "*", "ConstantRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                                xExprn = ApplyLambdaString("parseTermDiff1110", CompltExprn, aMappedProduct, a, b.DiffExpr(), b, "", "", "*", "ConstantRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            }
                            if ((b.DiffExpr().contains("Parenthesis")) && (!(b.DiffExpr().contains(DiffWithRespTo)))) {
                                Split(b.DiffExpr(), DiffWithRespTo);
                                Expr_Func_Split(b.DiffExpr(), DiffWithRespTo);
                                String CompltExprn = "";
                                if (TermStartPos <= posDiff) {
                                    CompltExprn = StrDiff.substring(TermStartPos, posDiff);
                                } else {
                                    CompltExprn = StrDiff.substring(TermStartPos);
                                }
                                x = ApplyLambdaRules("parseTermDiff2110", CompltExprn, aMappedProduct, a, b.DiffExpr(), b, "", "", "*", "ConstantRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                                xExprn = ApplyLambdaString("parseTermDiff2110", CompltExprn, aMappedProduct, a, b.DiffExpr(), b, "", "", "*", "ConstantRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            }

                            if ((!MappedProduct.equalsIgnoreCase("")) && (!MappedProduct.equalsIgnoreCase("1.0"))) {
                                aMappedProduct = aMappedProduct + "*" + MappedProduct;
                            }
                        } else if ((a.DiffExpr().contains("Parenthesis")) || (b.DiffExpr().contains("Parenthesis")) || (MyParenDecodedSep.contains(DiffWithRespTo))) {
                            String CompltExprn = "";
                            if (TermStartPos <= posDiff) {
                                CompltExprn = StrDiff.substring(TermStartPos, posDiff);
                            } else {
                                CompltExprn = StrDiff.substring(TermStartPos);
                            }
                            if ((x.DiffExpr().equalsIgnoreCase(DiffWithRespTo))) {
                                a = (() -> DiffWithRespTo + "@Parenthesis@" + "1.0");
                                x = ApplyLambdaRules("parseTermDiff118", CompltExprn, aMappedProduct, a, MappedProduct, b, "", "", "*", "MappedProductRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                                xExprn = ApplyLambdaString("parseTermDiff118", CompltExprn, aMappedProduct, a, MappedProduct, b, "", "", "*", "MappedProductRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                                if ((!MappedProduct.equalsIgnoreCase("")) && (!MappedProduct.equalsIgnoreCase("1.0"))) {
                                    aMappedProduct = aMappedProduct + "*" + MappedProduct;
                                }
                            } else if (((!IsAConstant(a.DiffExpr(), DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant") || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))))
                                    || ((!IsAConstant(b.DiffExpr(), DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression"))))) {
                                x = ApplyLambdaRules("parseTermDiff117A", CompltExprn, aMappedProduct, a, MappedProduct, b, "", "", "*", "ProductRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                                xExprn = ApplyLambdaString("parseTermDiff117A", CompltExprn, aMappedProduct, a, MappedProduct, b, "", "", "*", "ProductRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                                if ((!MappedProduct.equalsIgnoreCase("")) && (!MappedProduct.equalsIgnoreCase("1.0"))) {
                                    aMappedProduct = aMappedProduct + "*" + MappedProduct;
                                }
                            } else if (((IsAConstant(a.DiffExpr(), DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("Number") || (StrIsAConstant.equalsIgnoreCase("NumberExpression")))))
                                    || ((IsAConstant(b.DiffExpr(), DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("Number")) || (StrIsAConstant.equalsIgnoreCase("NumberExpression"))))) {
                                x = ApplyLambdaRules("parseTermDiff117B", CompltExprn, aMappedProduct, a, MappedProduct, b, "", "", "*", "ProductRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                                xExprn = ApplyLambdaString("parseTermDiff117B", CompltExprn, aMappedProduct, a, MappedProduct, b, "", "", "*", "ProductRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                                if ((!MappedProduct.equalsIgnoreCase("")) && (!MappedProduct.equalsIgnoreCase("1.0"))) {
                                    aMappedProduct = aMappedProduct + "*" + MappedProduct;
                                }
                            } else {
                                x = ApplyLambdaRules("parseTermDiff117", CompltExprn, aMappedProduct, a, MappedProduct, b, "", "", "*", "MappedProductRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                                xExprn = ApplyLambdaString("parseTermDiff117", CompltExprn, aMappedProduct, a, MappedProduct, b, "", "", "*", "MappedProductRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                                if ((!MappedProduct.equalsIgnoreCase("")) && (!MappedProduct.equalsIgnoreCase("1.0"))) {
                                    aMappedProduct = aMappedProduct + "*" + MappedProduct;
                                }
                            }
                        } else if ((!aMappedProduct.contains(DiffWithRespTo)) && (MappedProduct.contains(DiffWithRespTo)) && (!MappedProduct.equalsIgnoreCase(DiffWithRespTo))) {
                            if (!MappedProduct.contains("^" + DiffWithRespTo)) {
                                String CompltExprn = "";
                                if (TermStartPos <= posDiff) {
                                    CompltExprn = StrDiff.substring(TermStartPos, posDiff);
                                } else {
                                    CompltExprn = StrDiff.substring(TermStartPos);
                                }
                                x = ApplyLambdaRules("parseTermDiff111", CompltExprn, aMappedProduct, a, b.DiffExpr(), b, "", "", "*", "ConstantRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                                xExprn = ApplyLambdaString("parseTermDiff111", CompltExprn, aMappedProduct, a, b.DiffExpr(), b, "", "", "*", "ConstantRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                                if ((!MappedProduct.equalsIgnoreCase("")) && (!MappedProduct.equalsIgnoreCase("1.0"))) {
                                    aMappedProduct = aMappedProduct + "*" + MappedProduct;
                                }
                            } else {
                                String CompltExprn = "";
                                if (TermStartPos <= posDiff) {
                                    CompltExprn = StrDiff.substring(TermStartPos, posDiff);
                                } else {
                                    CompltExprn = StrDiff.substring(TermStartPos);
                                }
                                x = ApplyLambdaRules("parseTermDiff116", CompltExprn, aMappedProduct, a, b.DiffExpr(), b, MappedProduct, "", "*", "ConstantRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                                xExprn = ApplyLambdaString("parseTermDiff116", CompltExprn, aMappedProduct, a, b.DiffExpr(), b, MappedProduct, "", "*", "ConstantRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                                if ((!MappedProduct.equalsIgnoreCase("")) && (!MappedProduct.equalsIgnoreCase("1.0"))) {
                                    aMappedProduct = aMappedProduct + "*" + MappedProduct;
                                }
                            }
                        } else if ((!IsAConstant(aMappedProduct, DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("Var")) || (StrIsAConstant.equalsIgnoreCase("VarExpression")))
                                && (!IsAConstant(b.DiffExpr(), DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("Var")) || (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
                            String CompltExprn = "";
                            if (TermStartPos <= posDiff) {
                                CompltExprn = StrDiff.substring(TermStartPos, posDiff);
                            } else {
                                CompltExprn = StrDiff.substring(TermStartPos);
                            }
                            x = ApplyLambdaRules("parseTermDiff112", CompltExprn, aMappedProduct, a, MappedProduct, b, "", "", "*", "MappedProductRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            xExprn = ApplyLambdaString("parseTermDiff112", CompltExprn, aMappedProduct, a, MappedProduct, b, "", "", "*", "MappedProductRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            if ((!MappedProduct.equalsIgnoreCase("")) && (!MappedProduct.equalsIgnoreCase("1.0"))) {
                                aMappedProduct = aMappedProduct + "*" + MappedProduct;
                            }
                        } else if ((!IsAConstant(aMappedProduct, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant"))) {
                            String CompltExprn = "";
                            if (TermStartPos <= posDiff) {
                                CompltExprn = StrDiff.substring(TermStartPos, posDiff);
                            } else {
                                CompltExprn = StrDiff.substring(TermStartPos);
                            }
                            x = ApplyLambdaRules("parseTermDiff115", CompltExprn, aMappedProduct, a, x.DiffExpr(), b, "", "", "*", "ProductRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            xExprn = ApplyLambdaString("parseTermDiff115", CompltExprn, aMappedProduct, a, b.DiffExpr(), b, "", "", "*", "ProductRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            if ((!MappedProduct.equalsIgnoreCase("")) && (!MappedProduct.equalsIgnoreCase("1.0"))) {
                                aMappedProduct = aMappedProduct + "*" + MappedProduct;
                            }
                        } else if (b.DiffExpr().contains("@Complete@")) {
                            final String aTemp = a.DiffExpr().replaceFirst(FunctionName, "");
                            final String Temp = b.DiffExpr().replaceFirst("@Complete@", "");
                            if ((aTemp.endsWith("*")) || (aTemp.endsWith("/"))) {
                                x = (() -> aTemp + Temp);
                                xExprn = aTemp + Temp;
                            } else {
                                x = (() -> aTemp + "*" + Temp);
                                xExprn = aTemp + "*" + Temp;
                            }
                            log.info("Diff:parseTermDiff:Complete: parseTermDiff:x.DiffExpr()=" + x.DiffExpr() + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                            log.info("Diff:parseTermDiff:Complete: parseTermDiff:xExprn=" + xExprn);
                        } else {
                            String CompltExprn = "";
                            if (TermStartPos <= posDiff) {
                                CompltExprn = StrDiff.substring(TermStartPos, posDiff);
                            } else {
                                CompltExprn = StrDiff.substring(TermStartPos);
                            }
                            x = ApplyLambdaRules("parseTermDiff113", CompltExprn, aOrigExprn, a, OutputExprn, b, bOrigExprn, "", "*", "ProductRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            xExprn = ApplyLambdaString("parseTermDiff113", CompltExprn, aOrigExprn, a, OutputExprn, b, bOrigExprn, "", "*", "ProductRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            if ((!MappedProduct.equalsIgnoreCase("")) && (!MappedProduct.equalsIgnoreCase("1.0"))) {
                                aMappedProduct = aMappedProduct + "*" + MappedProduct;
                            }
                        }
                        log.info("Diff:parseTermDiff:x.DiffExpr()=" + x.DiffExpr() + " DiffTermOperator=" + (char) DiffTermOperator);
                        log.info("Diff:parseTermDiff:xExprn=" + xExprn);
                        log.info("Diff:parseTermDiff:aMappedProduct=" + aMappedProduct);
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Diff:parseTermDiff:*:Final:x.DiffExpr()=" + x.DiffExpr() + " xExprn=" + xExprn);
                        }
                    } else if (eatDiff('/')) { // division
                        log.info("Diff:parseTermDiff:Divide Entered" + " posDiff=" + posDiff + " chDiff=" + (char) chDiff + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                        if ((DiffTermOperator == -1) || (DiffTermOperator == '*')) {
                            DiffTermOperator = '/';
                        }
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Diff:parseTermDiff:/:Initial:x.DiffExpr()=" + x.DiffExpr());
                        }
                        int bstartpos = posDiff;
                        DiffExpr a = x, b = parseFactorDiff();
                        int bendpos = posDiff;

                        if ((bstartpos != -1) && (bstartpos < bendpos) && (bstartpos <= StrDiff.length()) && (bstartpos < StrDiff.length())) {
                            MappedProduct = StrDiff.substring(bstartpos, bendpos);
                        }
                        log.info("Diff:parseTermDiff:Div:OutputExprn=" + OutputExprn);
                        log.info("Diff:parseTermDiff:Div:a.DiffExpr()=" + a.DiffExpr());
                        log.info("Diff:parseTermDiff:Div:x.DiffExpr()=" + x.DiffExpr());
                        OutputExprn = b.DiffExpr();
                        log.info("Diff:parseTermDiff:Div:x.DiffExpr()=" + x.DiffExpr());
                        log.info("Diff:parseTermDiff:Div:aMappedProduct=" + aMappedProduct);
                        log.info("Diff:parseTermDiff:Div:MappedProduct=" + MappedProduct);
                        log.info("Diff:parseTermDiff:Div:OutputExprn=" + OutputExprn);
                        log.info("Diff:parseTermDiff:Div:b.DiffExpr()=" + b.DiffExpr() + " DiffTermOperator=" + (char) DiffTermOperator);
                        log.info("Diff:parseTermDiff:Div:a.DiffExpr()=" + a.DiffExpr());
                        if (((b.DiffExpr() == null) || (b.DiffExpr().equalsIgnoreCase("0.0"))) && ((OutputExprn == null) || (OutputExprn.equalsIgnoreCase("")))) {
                            String CompltExprn = "";
                            if (TermStartPos <= posDiff) {
                                CompltExprn = StrDiff.substring(TermStartPos, posDiff);
                            } else {
                                CompltExprn = StrDiff.substring(TermStartPos);
                            }
                            x = ApplyLambdaRules("parseTermDiff100", CompltExprn, OutputExprn, a, a.DiffExpr(), b, "", "", "*", "ExponentRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            xExprn = ApplyLambdaString("parseTermDiff100", CompltExprn, OutputExprn, a, b.DiffExpr(), b, "", "", "+", "ExponentRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            if ((!MappedProduct.equalsIgnoreCase("")) && (!MappedProduct.equalsIgnoreCase("1.0"))) {
                                aMappedProduct = aMappedProduct + "/" + MappedProduct;
                            }
                        } else if (OutputExprn.equalsIgnoreCase(DiffWithRespTo)) {
                            String CompltExprn = "";
                            if (TermStartPos <= posDiff) {
                                CompltExprn = StrDiff.substring(TermStartPos, posDiff);
                            } else {
                                CompltExprn = StrDiff.substring(TermStartPos);
                            }
                            x = ApplyLambdaRules("parseTermDiff110", CompltExprn, aMappedProduct, a, b.DiffExpr(), b, "", "", "/", "ConstantRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            xExprn = ApplyLambdaString("parseTermDiff110", CompltExprn, aMappedProduct, a, b.DiffExpr(), b, "", "", "/", "ConstantRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            if ((!MappedProduct.equalsIgnoreCase("")) && (!MappedProduct.equalsIgnoreCase("1.0"))) {
                                aMappedProduct = aMappedProduct + "/" + MappedProduct;
                            }
                        } else if ((a.DiffExpr().contains("Parenthesis")) || (b.DiffExpr().contains("Parenthesis")) || (MyParenDecodedSep.contains(DiffWithRespTo))) {
                            String CompltExprn = "";
                            if (TermStartPos <= posDiff) {
                                CompltExprn = StrDiff.substring(TermStartPos, posDiff);
                            } else {
                                CompltExprn = StrDiff.substring(TermStartPos);
                            }
                            x = ApplyLambdaRules("parseTermDiff11", CompltExprn, aMappedProduct, a, MappedProduct, b, "", "", "/", "MappedQuotientRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            xExprn = ApplyLambdaString("parseTermDiff11", CompltExprn, aMappedProduct, a, MappedProduct, b, "", "", "/", "MappedQuotientRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            if ((!MappedProduct.equalsIgnoreCase("")) && (!MappedProduct.equalsIgnoreCase("1.0"))) {
                                aMappedProduct = aMappedProduct + "/" + MappedProduct;
                            }
                        } else if ((aMappedProduct.contains(DiffWithRespTo)) && (b.DiffExpr().contains(DiffWithRespTo))) {
                            String CompltExprn = "";
                            if (TermStartPos <= posDiff) {
                                CompltExprn = StrDiff.substring(TermStartPos, posDiff);
                            } else {
                                CompltExprn = StrDiff.substring(TermStartPos);
                            }
                            x = ApplyLambdaRules("parseTermDiff112", CompltExprn, aMappedProduct, a, MappedProduct, b, "", "", "/", "MappedQuotientRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            xExprn = ApplyLambdaString("parseTermDiff112", CompltExprn, aMappedProduct, a, MappedProduct, b, "", "", "/", "MappedQuotientRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            if ((!MappedProduct.equalsIgnoreCase("")) && (!MappedProduct.equalsIgnoreCase("1.0"))) {
                                aMappedProduct = aMappedProduct + "/" + MappedProduct;
                            }
                        } else if ((!IsAConstant(OutputExprn, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant"))) {
                            String CompltExprn = "";
                            if (TermStartPos <= posDiff) {
                                CompltExprn = StrDiff.substring(TermStartPos, posDiff);
                            } else {
                                CompltExprn = StrDiff.substring(TermStartPos);
                            }
                            x = ApplyLambdaRules("parseTermDiff113", CompltExprn, OutputExprn, a, b.DiffExpr(), b, "", OutputExprn, "/", "QuotientRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            xExprn = ApplyLambdaString("parseTermDiff113", CompltExprn, OutputExprn, a, b.DiffExpr(), b, "", OutputExprn, "/", "QuotientRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            if ((!MappedProduct.equalsIgnoreCase("")) && (!MappedProduct.equalsIgnoreCase("1.0"))) {
                                aMappedProduct = aMappedProduct + "/" + MappedProduct;
                            }
                        } else if (b.DiffExpr().contains("@Complete@")) {
                            final String aTemp = a.DiffExpr().replaceFirst(FunctionName, "");
                            final String Temp = b.DiffExpr().replaceFirst("@Complete@", "");
                            if ((aTemp.endsWith("*")) || (aTemp.endsWith("/"))) {
                                x = (() -> aTemp + Temp);
                                xExprn = aTemp + Temp;
                            } else {
                                x = (() -> aTemp + "/" + Temp);
                                xExprn = aTemp + "/" + Temp;
                            }
                            log.info("Diff:parseTermDiff:Complete: parseTermDiff:x.DiffExpr()=" + x.DiffExpr() + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                            log.info("Diff:parseTermDiff:Complete: parseTermDiff:xExprn=" + xExprn);
                        } else {
                            String CompltExprn = "";
                            if (TermStartPos <= posDiff) {
                                CompltExprn = StrDiff.substring(TermStartPos, posDiff);
                            } else {
                                CompltExprn = StrDiff.substring(TermStartPos);
                            }
                            x = ApplyLambdaRules("parseTermDiff114", CompltExprn, OutputExprn, a, b.DiffExpr(), b, "", "", "*", "ProductRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            xExprn = ApplyLambdaString("parseTermDiff114", CompltExprn, OutputExprn, a, b.DiffExpr(), b, "", "", "*", "ProductRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            if ((!MappedProduct.equalsIgnoreCase("")) && (!MappedProduct.equalsIgnoreCase("1.0"))) {
                                aMappedProduct = aMappedProduct + "/" + MappedProduct;
                            }
                        }
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Diff:parseTermDiff:/:Final:x.DiffExpr()=" + x.DiffExpr() + " xExprn=" + xExprn);
                        }

                        log.info("Diff:parseTermDiff:x.DiffExpr()=" + x.DiffExpr() + " DiffTermOperator=" + (char) DiffTermOperator + " posDiff=" + posDiff + " chDiff=" + (char) chDiff + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
                    } else {
                        if (posDiff < StrDiff.length()) {
                            TermEndPos = posDiff;
                        } else {
                            TermEndPos = StrDiff.length();
                        }
                        if (TermStartPos <= TermEndPos) {
                            log.info("Diff:parseTermDiff:Return Value parseTermDiff:x.DiffExpr()=" + x.DiffExpr() + " Original Diff Term Expr=" + StrDiff.substring(TermStartPos, TermEndPos) + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                            log.info("Diff:parseTermDiff:Return Value parseTermDiff:xExprn=" + xExprn);
                        } else {
                            log.info("Diff:parseTermDiff:Return Value parseTermDiff:x.DiffExpr()=" + x.DiffExpr() + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                            log.info("Diff:parseTermDiff:Return Value parseTermDiff:xExprn=" + xExprn);
                        }
                        return x;
                    }
                }
            }

            DiffExpr parseFactorDiff() {
                String Exprn = "";
                int mychNext = chDiff;
                int myposNext = posDiff;
                int StartPos = posDiff;
                int aStartPos = posDiff;
                int bStartPos = -1;
                int FactorStartPos = posDiff;
                int FactorEndPos = -1;
                DiffExpr x = parseBaseDiff();
                log.info("Diff:parseFactorDiff:Initial:x.DiffExpr()=" + x.DiffExpr() + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                    System.out.println("Diff:parseFactorDiff:Initial:x.DiffExpr()=" + x.DiffExpr());
                }
                if ((x.DiffExpr().equalsIgnoreCase("-"))
                        || (x.DiffExpr().equalsIgnoreCase("+"))
                        || (x.DiffExpr().equalsIgnoreCase("*"))
                        || (x.DiffExpr().equalsIgnoreCase("/"))
                        || (x.DiffExpr().equalsIgnoreCase("^"))) {
                    x = (() -> "");
                    log.info("Diff:parseFactorDiff:Initial Call:Return Value:x.DiffExpr()=" + x.DiffExpr());
                    return x;
                }
                Split(x.DiffExpr(), DiffWithRespTo);
                Expr_Func_Split(x.DiffExpr(), DiffWithRespTo);
                if (x.DiffExpr().contains("@Function@")) {
                    if ((FunctionExpr.equalsIgnoreCase("")) && (!FactorsExpr.equalsIgnoreCase("")) && (IsAConstant(FactorsExpr, DiffWithRespTo))) {
                        x = (() -> FunctionExpr);
                        Exprn = FunctionExpr;
                        log.info("Diff:parseFactorDiff:@Function@:FunctionExpr=" + FunctionExpr);
                        log.info("Diff:parseFactorDiff:@Function@:x.DiffExpr()=" + x.DiffExpr());
                        log.info("Diff:parseFactorDiff:@Function@:Exprn=" + Exprn);

                    } else if ((FunctionDiffExpr != null) && (!FunctionDiffExpr.equalsIgnoreCase(""))) {
                        if (!FunctionDiffExpr.equalsIgnoreCase("0.0")) {
                            x = (() -> FunctionDiffExpr);
                            Exprn = FunctionDiffExpr;
                            log.info("Diff:parseFactorDiff:@Function@:FunctionDiffExpr=" + FunctionDiffExpr);
                            log.info("Diff:parseFactorDiff:@Function@:x.DiffExpr()=" + x.DiffExpr());
                            log.info("Diff:parseFactorDiff:@Function@:Exprn=" + Exprn);
                        } else {
                            x = (() -> FactorsExpr);
                            Exprn = FactorsExpr;
                            log.info("Diff:parseFactorDiff:@Function@:FunctionDiffExpr=" + FunctionDiffExpr);
                            log.info("Diff:parseFactorDiff:@Function@:x.DiffExpr()=" + x.DiffExpr());
                            log.info("Diff:parseFactorDiff:@Function@:Exprn=" + Exprn);
                        }
                    } else if ((FunctionDiffExpr == null) || (FunctionDiffExpr.equalsIgnoreCase(""))) {
                        x = (() -> FunctionDiffExpr);
                        Exprn = FunctionDiffExpr;
                        log.info("Diff:parseFactorDiff:@Function@:FunctionDiffExpr=" + FunctionDiffExpr);
                        log.info("Diff:parseFactorDiff:@Function@:x.DiffExpr()=" + x.DiffExpr());
                        log.info("Diff:parseFactorDiff:@Function@:Exprn=" + Exprn);
                    } else {
                        x = (() -> "Unknown");
                        Exprn = "Unknown";
                        log.info("Diff:parseFactorDiff:@Function@:x.DiffExpr()=" + x.DiffExpr());
                        log.info("Diff:parseFactorDiff:@Function@:Exprn=" + Exprn);

                    }
                    log.info("Diff:parseFactorDiff:@Function@:x.DiffExpr()=" + x.DiffExpr());
                    log.info("Diff:parseFactorDiff:@Function@:Exprn=" + Exprn);
                } else if (x.DiffExpr().contains("@Polynomial@")) {
                    x = (() -> FactorsExpr);
                    Exprn = FactorsExpr;
                } else if (x.DiffExpr().contains("@Factor@")) {
                    x = (() -> FactorsExpr);
                    Exprn = FactorsExpr;
                } else if (x.DiffExpr().contains("@IndependentFactor@")) {
                    x = (() -> FactorsExpr);
                    Exprn = FactorsExpr;
                    log.info("Diff:parseFactorDiff:Initial Call:x.DiffExpr()=" + x.DiffExpr());
                    log.info("Diff:parseFactorDiff:Initial Call:Exprn=" + Exprn);
                    if ((chDiff == '*') || (chDiff == '/') || (chDiff == -1) || (chDiff == 0)) {
                        log.info("Diff:parseFactorDiff:Initial Call:Return Value:x.DiffExpr()=" + x.DiffExpr());
                        return x;
                    }
                } else if (x.DiffExpr().contains("@ExtremityFactor@")) {
                    x = (() -> FactorsExpr);
                    Exprn = FactorsExpr;
                    log.info("Diff:parseFactorDiff:Initial Call:x.DiffExpr()=" + x.DiffExpr());
                    log.info("Diff:parseFactorDiff:Initial Call:Exprn=" + Exprn);
                    if ((chDiff == '*') || (chDiff == '/') || (chDiff == -1) || (chDiff == 0)) {
                        log.info("Diff:parseFactorDiff:Initial Call:Return Value:x.DiffExpr()=" + x.DiffExpr());
                        return x;
                    }
                } else if ((x.DiffExpr().contains("@Constant@")) && ((chDiff == -1) || (chDiff == ')') || (((myposNext == 0) || (mychNext == '+') || (mychNext == '-')) && ((chDiff == '+') || (chDiff == '-'))))) {
                    x = (() -> "0.0");
                    Exprn = "0.0";
                } else if (x.DiffExpr().contains("@Constant@")) {
                    x = (() -> FactorsExpr);
                    Exprn = FactorsExpr;
                } else if (x.DiffExpr().contains("@Complete@")) {
                    final String Temp = x.DiffExpr().replaceFirst("@Complete@", "");
                    x = (() -> Temp);
                    Exprn = Temp;
                    log.info("Diff:parseFactorDiff:Complete: parseFactorDiff:x.DiffExpr()=" + x.DiffExpr() + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                    log.info("Diff:parseFactorDiff:Complete: parseFactorDiff:Exprn=" + Exprn);
                } else if (x.DiffExpr().contains("@Parenthesis@")) {
                    x = (() -> ParanDiffExpr);
                    Exprn = ParanDiffExpr;
                } else {
                    if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                        System.out.println("Diff:parseFactorDiff:No Else:x.DiffExpr()=" + x.DiffExpr());
                    }
                }
                log.info("Diff:parseFactorDiff:Initial Call:x.DiffExpr()=" + x.DiffExpr() + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                log.info("Diff:parseFactorDiff:Initial Call:Exprn=" + Exprn);
                for (;;) {
                    if (eatDiff('^')) { // exponentiation

                        GotExpntNumFlag = true;

                        if (bStartPos == -1) {
                            bStartPos = posDiff;
                        }
                        DiffExpr a = x, b = parseBaseDiff();
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Diff:parseFactorDiff:^:Initial:x.DiffExpr()=" + x.DiffExpr() + " b.DiffExpr()=" + b.DiffExpr() + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                        }
                        int bEndPos = posDiff;
                        int aEndPos = posDiff;
                        int aHighLvlMappos = 0;
                        int bHighLvlMappos = 0;
                        FactorsExpr = "";
                        FactorsDiffExpr = "";
                        log.info("Diff:parseFactorDiff:Loop:b.DiffExpr()=" + b.DiffExpr() + " a.DiffExpr()=" + a.DiffExpr() + " Exprn=" + Exprn + " SavedOperator=" + (char) SavedOperator);
                        log.info("Diff:parseFactorDiff:Loop:aStartPos=" + aStartPos + " aEndPos=" + aEndPos);
                        log.info("Diff:parseFactorDiff:Loop:bStartPos=" + bStartPos + " bEndPos=" + bEndPos);

                        log.info("Diff:parseFactorDiff:Loop:b.DiffExpr()=" + b.DiffExpr() + " a.DiffExpr()=" + a.DiffExpr() + " SavedOperator=" + (char) SavedOperator + " aStartPos=" + aStartPos + " aEndPos=" + aEndPos + " bStartPos=" + bStartPos + " bEndPos=" + bEndPos);
                        log.info("Diff:parseFactorDiff:Loop:Exprn=" + Exprn);
                        //log.info("Diff:parseFactorDiff:Loop:aExprn=" + StrDiff.substring(aStartPos, aEndPos));
                        //log.info("Diff:parseFactorDiff:Loop:bExprn=" + StrDiff.substring(bStartPos, bEndPos));
                        // x^4
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Diff:parseFactorDiff:^:Initial:x.DiffExpr()=" + x.DiffExpr() + " b.DiffExpr()=" + b.DiffExpr() + " Exprn=" + Exprn + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                        }
                        if (Exprn.equalsIgnoreCase(DiffWithRespTo)) {
                            Split(b.DiffExpr(), DiffWithRespTo);
                            Expr_Func_Split(b.DiffExpr(), DiffWithRespTo);
                            String bExpr = FactorsExpr;
                            String bDiffExpr = FactorsDiffExpr;
                            log.info("Diff:parseFactorDiff:Loop:FactorsExpr=" + FactorsExpr);
                            log.info("Diff:parseFactorDiff:Loop:FactorsDiffExpr=" + FactorsDiffExpr);
                            if (DiffTermOperator == '/') {
                                if ((IsAConstant(bExpr, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))
                                        && (Double.parseDouble(bExpr) >= 1)) {
                                    x = (() -> "-" + bExpr + "/" + DiffWithRespTo + "^" + RemoveEDbl(Double.parseDouble(bExpr) + 1));
                                    Exprn = "-" + bExpr + "/" + DiffWithRespTo + "^" + RemoveEDbl(Double.parseDouble(bExpr) + 1);
                                    log.info("Diff:parseFactorDiff:x^4:Rule 1:x.DiffExpr()=" + x.DiffExpr() + " DiffTermOperator=" + (char) DiffTermOperator + " bExpr=" + bExpr);
                                    log.info("Diff:parseFactorDiff:x^4:Rule 1:Exprn=" + Exprn);
                                    if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("Diff:parseFactorDiff:^:x^4:if:Rule 1:x.DiffExpr()=" + x.DiffExpr() + " b.DiffExpr()=" + b.DiffExpr() + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                                    }
                                } else if ((IsAConstant(bExpr, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))
                                        && (Double.parseDouble(bExpr) < 0)) {
                                    x = (() -> bExpr + "/" + DiffWithRespTo + "^" + RemoveEDbl(Double.parseDouble(bExpr) + 1));
                                    Exprn = bExpr + "/" + DiffWithRespTo + "^" + RemoveEDbl(Double.parseDouble(bExpr) + 1);
                                    log.info("Diff:parseFactorDiff:x^4:Rule 2:x.DiffExpr()=" + x.DiffExpr() + " DiffTermOperator=" + (char) DiffTermOperator + " bExpr=" + bExpr);
                                    log.info("Diff:parseFactorDiff:x^4:Rule 2:Exprn=" + Exprn);
                                    if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("Diff:parseFactorDiff:^:x^4:if:Rule 21:x.DiffExpr()=" + x.DiffExpr() + " b.DiffExpr()=" + b.DiffExpr() + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                                    }
                                } else if ((IsAConstant(bExpr, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))
                                        && (Double.parseDouble(bExpr) > 0)) {
                                    x = (() -> "-" + bExpr + "/" + DiffWithRespTo + "^" + RemoveEDbl(Double.parseDouble(bExpr) + 1));
                                    Exprn = "-" + bExpr + "/" + DiffWithRespTo + "^" + RemoveEDbl(Double.parseDouble(bExpr) + 1);
                                    log.info("Diff:parseFactorDiff:x^4:Rule 3:x.DiffExpr()=" + x.DiffExpr() + " DiffTermOperator=" + (char) DiffTermOperator + " bExpr=" + bExpr);
                                    log.info("Diff:parseFactorDiff:x^4:Rule 3:Exprn=" + Exprn);
                                    if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("Diff:parseFactorDiff:^:x^4:if:Rule 3:x.DiffExpr()=" + x.DiffExpr() + " b.DiffExpr()=" + b.DiffExpr() + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                                    }
                                }
                                if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Diff:parseFactorDiff:^:x^4:if:x.DiffExpr()=" + x.DiffExpr() + " b.DiffExpr()=" + b.DiffExpr() + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                                }
                                //}
                            } else {
                                if ((IsAConstant(bExpr, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))
                                        && (Double.parseDouble(bExpr) >= 1)) {
                                    x = (() -> bExpr + "*" + DiffWithRespTo + "^" + RemoveEDbl(Double.parseDouble(bExpr) - 1));
                                    Exprn = bExpr + "*" + DiffWithRespTo + "^" + RemoveEDbl(Double.parseDouble(bExpr) - 1);
                                    log.info("Diff:parseFactorDiff:x^4:else:Rule 1:x.DiffExpr()=" + x.DiffExpr() + " DiffTermOperator=" + (char) DiffTermOperator + " bExpr=" + bExpr);
                                    log.info("Diff:parseFactorDiff:x^4:else:Rule 1:Exprn=" + Exprn);
                                    if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("Diff:parseFactorDiff:^:x^4:else:Rule 3:x.DiffExpr()=" + x.DiffExpr() + " b.DiffExpr()=" + b.DiffExpr() + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                                    }
                                } else if ((IsAConstant(bExpr, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))
                                        && (Double.parseDouble(bExpr) < 0)) {
                                    x = (() -> bExpr + "*" + DiffWithRespTo + "^" + RemoveEDbl(Double.parseDouble(bExpr) - 1));
                                    Exprn = bExpr + "*" + DiffWithRespTo + "^" + RemoveEDbl(Double.parseDouble(bExpr) - 1);
                                    log.info("Diff:parseFactorDiff:x^4:else:Rule 2:x.DiffExpr()=" + x.DiffExpr() + " DiffTermOperator=" + (char) DiffTermOperator + " bExpr=" + bExpr);
                                    log.info("Diff:parseFactorDiff:x^4:else:Rule 2:Exprn=" + Exprn);
                                    if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("Diff:parseFactorDiff:^:x^4:else:Rule 2:x.DiffExpr()=" + x.DiffExpr() + " b.DiffExpr()=" + b.DiffExpr() + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                                    }
                                } else if ((IsAConstant(bExpr, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))
                                        && (Double.parseDouble(bExpr) > 0)) {
                                    x = (() -> bExpr + "*" + DiffWithRespTo + "^" + RemoveEDbl(Double.parseDouble(bExpr) - 1));
                                    Exprn = bExpr + "*" + DiffWithRespTo + "^" + RemoveEDbl(Double.parseDouble(bExpr) - 1);
                                    log.info("Diff:parseFactorDiff:x^4:else:Rule 3:x.DiffExpr()=" + x.DiffExpr() + " DiffTermOperator=" + (char) DiffTermOperator + " bExpr=" + bExpr);
                                    log.info("Diff:parseFactorDiff:x^4:else:Rule 3:Exprn=" + Exprn);
                                    if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("Diff:parseFactorDiff:^:x^4:else:Rule 3:x.DiffExpr()=" + x.DiffExpr() + " b.DiffExpr()=" + b.DiffExpr() + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                                    }
                                } else if ((!IsAConstant(bExpr, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant"))) {
                                    x = (() -> bExpr + "*" + DiffWithRespTo + "^" + ("(" + bExpr + "-1.0" + ")"));
                                    Exprn = bExpr + "*" + DiffWithRespTo + "^" + ("(" + bExpr + "-1.0" + ")");
                                    log.info("Diff:parseFactorDiff:x^4:else:Rule 4:x.DiffExpr()=" + x.DiffExpr() + " DiffTermOperator=" + (char) DiffTermOperator + " bExpr=" + bExpr);
                                    log.info("Diff:parseFactorDiff:x^4:else:Rule 4:Exprn=" + Exprn);
                                    if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("Diff:parseFactorDiff:^:x^4:Power Rule:else:Rule 4:x.DiffExpr()=" + x.DiffExpr() + " b.DiffExpr()=" + b.DiffExpr() + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                                    }
                                }
                            }
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:parseFactorDiff:^:x^4:else:DiffTermOperator:x.DiffExpr()=" + x.DiffExpr() + " b.DiffExpr()=" + b.DiffExpr() + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                            }
                        } else if ((IsAConstant(StrDiff.substring(aStartPos, aEndPos), DiffWithRespTo))
                                && (IsAConstant(StrDiff.substring(bStartPos, bEndPos), DiffWithRespTo))) {
                            // 2^3
                            log.info("Diff:parseFactorDiff:2^3:aExprn=" + StrDiff.substring(aStartPos, aEndPos));
                            log.info("Diff:parseFactorDiff:2^3:bExprn=" + StrDiff.substring(bStartPos, bEndPos));
                            if (b.DiffExpr().contains("@Constant@")) {
                                log.info("Diff:parseFactorDiff:Exponential Constant:Exprn=" + Exprn + " x.DiffExpr()=" + x.DiffExpr());
                                Split(b.DiffExpr(), DiffWithRespTo);
                                log.info("Diff:parseFactorDiff:Loop:FactorsExpr=" + FactorsExpr + " FactorsDiffExpr=" + FactorsDiffExpr + " DiffTermOperator=" + (char) DiffTermOperator);
                                String Temp = "";

                                if (DiffTermOperator == -1) {
                                    Temp = "1.0/" + (Double.parseDouble(FactorsExpr) + 1.0) + "*" + DiffWithRespTo + "^" + (Double.parseDouble(FactorsExpr) + 1.0);
                                } else {
                                    Temp = "1.0/" + (Double.parseDouble(FactorsExpr) + 1.0) + (char) DiffTermOperator + DiffWithRespTo + "^" + (Double.parseDouble(FactorsExpr) + 1.0);
                                }
                                log.info("Diff:parseFactorDiff:Temp=" + Temp + " FactorsExpr=" + FactorsExpr + " DiffTermOperator=" + (char) DiffTermOperator);
                                final String MyTerm = Temp;
                                x = (() -> MyTerm);
                                Exprn = MyTerm;
                            }
                            log.info("Diff:parseFactorDiff:x.DiffExpr()=" + x.DiffExpr() + " DiffTermOperator=" + (char) DiffTermOperator);
                            log.info("Diff:parseFactorDiff:Exprn=" + Exprn);
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:parseFactorDiff:@Constant@:x.DiffExpr()=" + x.DiffExpr() + " b.DiffExpr()=" + b.DiffExpr() + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                            }
                        } else if ((IsAConstant(StrDiff.substring(aStartPos, aEndPos), DiffWithRespTo))
                                && (!IsAConstant(StrDiff.substring(bStartPos, bEndPos), DiffWithRespTo))
                                && ((StrIsAConstant.equalsIgnoreCase("IndConstant"))
                                || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                            // 2^a
                            final String aExprn = StrDiff.substring(aStartPos, aEndPos);
                            final String bExprn = StrDiff.substring(bStartPos, bEndPos);
                            x = (() -> aExprn + "^" + bExprn);
                            Exprn = aExprn + "^" + bExprn;
                            log.info("Diff:parseFactorDiff:2^a:aExprn=" + StrDiff.substring(aStartPos, aEndPos));
                            log.info("Diff:parseFactorDiff:2^a:bExprn=" + StrDiff.substring(bStartPos, bEndPos));
                            log.info("Diff:parseFactorDiff:x.DiffExpr()=" + x.DiffExpr() + " DiffTermOperator=" + (char) DiffTermOperator);
                            log.info("Diff:parseFactorDiff:Exprn=" + Exprn);
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:parseFactorDiff:2^a:x.DiffExpr()=" + x.DiffExpr() + " b.DiffExpr()=" + b.DiffExpr() + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                            }
                        } else if (((IsAConstant(StrDiff.substring(aStartPos, aEndPos), DiffWithRespTo))
                                && (!IsAConstant(StrDiff.substring(bStartPos, bEndPos), DiffWithRespTo))
                                && (StrIsAConstant.equalsIgnoreCase("Var")))) {
                            // 2^x
                            final String aExprn = StrDiff.substring(aStartPos, aEndPos);
                            final String bExprn = StrDiff.substring(bStartPos, bEndPos);
                            x = (() -> "1.0/" + "ln(" + aExprn + ")" + "*" + aExprn + "^" + bExprn);
                            Exprn = "1.0/" + "ln(" + aExprn + ")" + "*" + aExprn + "^" + bExprn;
                            log.info("Diff:parseFactorDiff:2^x:x.DiffExpr()=" + x.DiffExpr());
                            log.info("Diff:parseFactorDiff:2^x:aExprn=" + StrDiff.substring(aStartPos, aEndPos));
                            log.info("Diff:parseFactorDiff:2^x:bExprn=" + StrDiff.substring(bStartPos, bEndPos));
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:parseFactorDiff:2^x:x.DiffExpr()=" + x.DiffExpr() + " b.DiffExpr()=" + b.DiffExpr() + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                            }
                        } else if ((!IsAConstant(StrDiff.substring(aStartPos, aEndPos), DiffWithRespTo))
                                && ((StrIsAConstant.equalsIgnoreCase("Var"))
                                || (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
                            // 5.0^xyc1
                            final String aExprn = StrDiff.substring(aStartPos, aEndPos);
                            final String bExprn = StrDiff.substring(bStartPos, bEndPos);
                            String[] Temp = new String[2];
                            Temp = StrDiff.substring(aStartPos, aEndPos).split("\\^");
                            if (Temp.length >= 1) {
                                final String Temp0 = Temp[0];
                                x = (() -> "ln(" + Temp0 + ")" + "*" + aExprn);
                                Exprn = "ln(" + Temp0 + ")" + "*" + aExprn;
                                log.info("Diff:parseFactorDiff:2^x:Temp[0]=" + Temp[0]);
                                log.info("Diff:parseFactorDiff:2^x:Temp0=" + Temp0);
                            }
                            log.info("Diff:parseFactorDiff:2^x:x.DiffExpr()=" + x.DiffExpr());
                            log.info("Diff:parseFactorDiff:2^x:aExprn=" + StrDiff.substring(aStartPos, aEndPos));
                            log.info("Diff:parseFactorDiff:2^x:bExprn=" + StrDiff.substring(bStartPos, bEndPos));
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:parseFactorDiff:^5.0^xyc1:x.DiffExpr()=" + x.DiffExpr() + " b.DiffExpr()=" + b.DiffExpr() + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                            }
                        } else if ((!IsAConstant(StrDiff.substring(aStartPos, aEndPos), DiffWithRespTo))
                                && (!IsAConstant(StrDiff.substring(bStartPos, bEndPos), DiffWithRespTo))
                                && (StrIsAConstant.equalsIgnoreCase("IndConstant"))) {
                            // a^b
                            final String aExprn = StrDiff.substring(aStartPos, aEndPos);
                            final String bExprn = StrDiff.substring(bStartPos, bEndPos);
                            if ((!IsAConstant(aExprn, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstantExpression"))) {
                                x = (() -> aExprn);
                                Exprn = aExprn;
                            } else if (!Exprn.equalsIgnoreCase(aExprn)) {
                                x = (() -> aExprn + "^" + bExprn);
                                Exprn = aExprn + "^" + bExprn;
                            } else {
                                x = (() -> aExprn);
                                Exprn = aExprn;
                            }
                            if ((aStartPos >= 1) && (StrDiff.charAt(aStartPos - 1) == '*')) {
                                LADiffIndConstOperator = '*';
                            } else if ((aStartPos >= 1) && (StrDiff.charAt(aStartPos - 1) == '/')) {
                                LADiffIndConstOperator = '/';
                            }
                            log.info("Diff:parseFactorDiff:a^b:x.DiffExpr()=" + x.DiffExpr());
                            log.info("Diff:parseFactorDiff:Independent Variables:Exprn=" + Exprn + " SavedOperator=" + (char) SavedOperator);
                            log.info("Diff:parseFactorDiff:a^b:aExprn=" + StrDiff.substring(aStartPos, aEndPos) + " LADiffIndConstOperator=" + (char) LADiffIndConstOperator);
                            log.info("Diff:parseFactorDiff:a^b:bExprn=" + StrDiff.substring(bStartPos, bEndPos));
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:parseFactorDiff:^:a^b:x.DiffExpr()=" + x.DiffExpr() + " b.DiffExpr()=" + b.DiffExpr() + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                            }
                        } else if ((!IsAConstant(StrDiff.substring(aStartPos, aEndPos), DiffWithRespTo))
                                && (StrIsAConstant.equalsIgnoreCase("Var"))
                                && (!IsAConstant(StrDiff.substring(bStartPos, bEndPos), DiffWithRespTo))
                                && (StrIsAConstant.equalsIgnoreCase("IndConstant"))) {
                            // x^b
                            //x = (() -> "1");
                            if ((aStartPos >= 1) && (StrDiff.charAt(aStartPos - 1) == '*')) {
                                LADiffFactorOperator = '*';
                            } else if ((aStartPos >= 1) && (StrDiff.charAt(aStartPos - 1) == '/')) {
                                LADiffFactorOperator = '/';
                            }
                            log.info("Diff:parseFactorDiff:x^b:x.DiffExpr()=" + x.DiffExpr());
                            log.info("Diff:parseFactorDiff:x^b:aExprn=" + StrDiff.substring(aStartPos, aEndPos) + " LADiffFactorOperator=" + (char) LADiffFactorOperator);
                            log.info("Diff:parseFactorDiff:x^b:bExprn=" + StrDiff.substring(bStartPos, bEndPos));
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:parseFactorDiff:^:x^b:x.DiffExpr()=" + x.DiffExpr() + " b.DiffExpr()=" + b.DiffExpr() + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                            }
                        } else if ((!IsAConstant(StrDiff.substring(aStartPos, aEndPos), DiffWithRespTo))
                                && (StrIsAConstant.equalsIgnoreCase("IndConstant"))
                                && (!IsAConstant(StrDiff.substring(bStartPos, bEndPos), DiffWithRespTo))
                                && (StrIsAConstant.equalsIgnoreCase("Var"))) {
                            // a^x
                            final String aExprn1 = StrDiff.substring(aStartPos, aEndPos);
                            final String bExprn1 = StrDiff.substring(bStartPos, bEndPos);
                            x = (() -> "1.0/" + "ln(" + aExprn1 + ")" + "*" + aExprn1 + "^" + bExprn1);
                            Exprn = "1.0/" + "ln(" + aExprn1 + ")" + "*" + aExprn1 + "^" + bExprn1;
                            if ((aStartPos >= 1) && (StrDiff.charAt(aStartPos - 1) == '*')) {
                                LADiffIndConstOperator = '*';
                            } else if ((aStartPos >= 1) && (StrDiff.charAt(aStartPos - 1) == '/')) {
                                LADiffIndConstOperator = '/';
                            }
                            log.info("Diff:parseFactorDiff:a^x:x.DiffExpr()=" + x.DiffExpr());
                            log.info("Diff:parseFactorDiff:a^x:aExprn=" + StrDiff.substring(aStartPos, aEndPos) + " LADiffIndConstOperator=" + (char) LADiffIndConstOperator);
                            log.info("Diff:parseFactorDiff:a^x:bExprn=" + StrDiff.substring(bStartPos, bEndPos));
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:parseFactorDiff:^:a^x:x.DiffExpr()=" + x.DiffExpr() + " b.DiffExpr()=" + b.DiffExpr() + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                            }
                        } else if ((!IsAConstant(StrDiff.substring(aStartPos, aEndPos), DiffWithRespTo))
                                && ((StrIsAConstant.equalsIgnoreCase("IndConstant"))
                                || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))
                                && (IsAConstant(StrDiff.substring(bStartPos, bEndPos), DiffWithRespTo))) {
                            // a^2
                            final String aExprn1 = StrDiff.substring(aStartPos, aEndPos);
                            final String bExprn1 = StrDiff.substring(bStartPos, bEndPos);
                            if ((!IsAConstant(StrDiff.substring(aStartPos, aEndPos), DiffWithRespTo))
                                    && (StrIsAConstant.equalsIgnoreCase("IndConstantExpression"))) {
                                x = (() -> aExprn1);
                                Exprn = aExprn1;
                            } else {
                                x = (() -> aExprn1 + "^" + bExprn1);
                                Exprn = aExprn1 + "^" + bExprn1;
                            }
                            if ((aStartPos >= 1) && (StrDiff.charAt(aStartPos - 1) == '*')) {
                                LADiffIndConstOperator = '*';
                            } else if ((aStartPos >= 1) && (StrDiff.charAt(aStartPos - 1) == '/')) {
                                LADiffIndConstOperator = '/';
                            }
                            log.info("Diff:parseFactorDiff:a^2:aExprn=" + StrDiff.substring(aStartPos, aEndPos) + " LADiffIndConstOperator=" + (char) LADiffIndConstOperator);
                            log.info("Diff:parseFactorDiff:a^2:bExprn=" + StrDiff.substring(bStartPos, bEndPos));
                            log.info("Diff:parseFactorDiff:x.DiffExpr()=" + x.DiffExpr() + " DiffTermOperator=" + (char) DiffTermOperator);
                            log.info("Diff:parseFactorDiff:Exprn=" + Exprn);
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:parseFactorDiff:^:a^2:x.DiffExpr()=" + x.DiffExpr() + " b.DiffExpr()=" + b.DiffExpr() + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                            }
                        }//Independent Variables encountered
                        else if (variables.containsKey(Exprn)) {//Is a valid Independent Constant
                            log.info("Diff:parseFactorDiff:Independent Variables:Exprn=" + Exprn + " SavedOperator=" + (char) SavedOperator);
                            if ((SavedOperator == '+') || (SavedOperator == '-')) {
                                x = (() -> "0.0");
                                Exprn = "0.0";
                            } else if ((SavedOperator == '*') || (SavedOperator == '/')) {
                                Split(b.DiffExpr(), DiffWithRespTo);
                                final String MyTerm = Exprn + "^" + FactorsExpr;
                                x = (() -> MyTerm);
                                Exprn = MyTerm;
                            }
                        }
                        if (x.DiffExpr().contains("@Complete@")) {
                            final String Temp = x.DiffExpr().replaceFirst("@Complete@", "");
                            x = (() -> Temp);
                            log.info("Diff:parseFactorDiff:Complete: parseFactorDiff:x.DiffExpr()=" + x.DiffExpr() + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                            log.info("Diff:parseFactorDiff:Complete: parseFactorDiff:Exprn=" + Exprn);
                        }
                        if (bStartPos == bEndPos) {
                            log.info("Diff:parseFactorDiff:Mapping Loop:StrDiff=" + StrDiff.substring(posDiff));
                            posDiff = bHighLvlMappos;
                            while ((IsNumber(StrDiff.charAt(posDiff))) || (IsVariable(StrDiff.charAt(posDiff)))) {
                                nextCharDiff();
                            }
                            log.info("Diff:parseFactorDiff:Mapping Loop:StrDiff=" + StrDiff.substring(posDiff));
                        }
                        FactorsExpr = "";
                        FactorsDiffExpr = "";
                        log.info("Diff:parseFactorDiff:x.DiffExpr()=" + x.DiffExpr());
                        log.info("Diff:parseFactorDiff:Exprn=" + Exprn);
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Diff:parseFactorDiff:^:Return Value:x.DiffExpr()=" + x.DiffExpr() + " b.DiffExpr()=" + b.DiffExpr() + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                        }
                    } else {
                        if ((posDiff >= 0) && (posDiff < StrDiff.length())) {
                            FactorEndPos = posDiff;
                        } else {
                            FactorEndPos = StrDiff.length();
                        }
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Diff:parseFactorDiff:^:Final:Return Value:x.DiffExpr()=" + x.DiffExpr() + " Exprn=" + Exprn);
                        }
                        if (ParanExprInProgressFlag == true) {
                            log.info("Diff:parseFactorDiff:ParanExprInProgressFlag:Return Value parseFactorDiff:x.DiffExpr()=" + x.DiffExpr() + " Original Diff Factor Expr=" + StrDiff.substring(FactorStartPos, FactorEndPos));
                            log.info("Diff:parseFactorDiff:ParanExprInProgressFlag:Return Value parseFactorDiff:Exprn=" + Exprn);
                            final String ParaOutput = Exprn;
                            DiffExpr y = (() -> ParaOutput);
                            return y;
                        } else {
                            if (FactorStartPos <= FactorEndPos) {
                                log.info("Diff:parseFactorDiff:Normal:Return Value parseFactorDiff:x.DiffExpr()=" + x.DiffExpr() + " Original Diff Factor Expr=" + StrDiff.substring(FactorStartPos, FactorEndPos));
                                log.info("Diff:parseFactorDiff:Normal:Return Value parseFactorDiff:Exprn=" + Exprn);
                            } else {
                                log.info("Diff:parseFactorDiff:Normal:Return Value parseFactorDiff:x.DiffExpr()=" + x.DiffExpr());
                                log.info("Diff:parseFactorDiff:Normal:Return Value parseFactorDiff:Exprn=" + Exprn);

                            }
                            return x;
                        }

                    }
                }
            }

            DiffExpr parseBaseDiff() {
                int startPos = posDiff;
                boolean ConfirmedConstFlag = false;
                boolean ConfirmedFuncFlag = false;
                boolean ConfirmedIndConstFlag = false;
                DiffExpr x = (() -> "");
                if (eatDiff('-')) { // unary minus
                    DiffExpr b = parseBaseDiff();
                    //x = () -> "-" + xx;
                    if (startPos == 0) {
                        x = (() -> "-" + b.DiffExpr());
                    } else {
                        x = (() -> "-" + b.DiffExpr());
                    }
                    log.info("Diff:parseBaseDiff:Sign -: x.DiffExpr()=" + x.DiffExpr());
                    if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                        System.out.println("Diff:parseBaseDiff:-:Return:x.DiffExpr()=" + x.DiffExpr() + ":posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                    }
                    if (x.DiffExpr().contains("@IndependentFactor@")) {
                        String[] TempData = x.DiffExpr().split("@IndependentFactor@");
                        x = (() -> (TempData[0] + "@IndependentFactor@" + "-" + TempData[1]));
                    }
                    return x;
                } else if (eatDiff('+')) { // unary plus
                    startPos = posDiff;
                    log.info("Diff:parseBaseDiff:Sign +: x.DiffExpr()=" + x.DiffExpr());
                }
                if (IsNumber(chDiff)) { //numbers
                    log.info("Diff:parseBaseDiff:Entered Numbers:chDiff=" + (char) chDiff);
                    if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                        System.out.println("Diff:parseBaseDiff:Entered Numbers:posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                    }
                    while (IsNumber(chDiff)) {
                        nextCharDiff();
                        if ((chDiff == 'E') || (chDiff == 'e')) {
                            nextCharDiff();
                            if ((chDiff == '-') || (chDiff == '+')) {
                                nextCharDiff();
                            }
                        }
                    }
                    String xConst = "";
                    String xx = "";
                    if ((IsAConstant(StrDiff.substring(startPos, posDiff), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                        xx = "" + Double.parseDouble(StrDiff.substring(startPos, posDiff));
                    }
                    if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                        System.out.println("Diff:parseBaseDiff:Numbers: xx=" + xx + " EnteredLAConstFlag=" + EnteredLAConstFlag);
                    }
                    LookAheadDiffConst MyCoeff;
                    int DiffIntLength = posDiff - startPos;
                    if ((IsAConstant(xx, DiffWithRespTo)) && ((chDiff == '*') || (chDiff == '/') || (chDiff == -1))) {
                        log.info("Diff:parseBaseDiff:Entered LookAheadDiffConst Number:MyCoeff=" + xx);
                        MyCoeff = parseLADiff(StrDiff.substring(startPos), startPos, DiffIntLength, "Differentiation", DiffWithRespTo);
                        xConst = "" + MyCoeff.eval();
                        if (IsAConstant(xConst, DiffWithRespTo)) {
                            ConfirmedConstFlag = true;
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:parseBaseDiff:ConfirmedConstFlag:if:Function Expression:xConst=" + xConst + " ConfirmedConstFlag=" + ConfirmedConstFlag + " ConfirmedFuncFlag=" + ConfirmedFuncFlag + " ConfirmedIndConstFlag=" + ConfirmedIndConstFlag);
                            }
                        } else if ((!IsAConstant(xConst, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Unknown"))) {
                            ConfirmedFuncFlag = true;
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:parseBaseDiff:ConfirmedConstFlag:Else:Function Expression:xConst=" + xConst + " ConfirmedConstFlag=" + ConfirmedConstFlag + " ConfirmedFuncFlag=" + ConfirmedFuncFlag + " ConfirmedIndConstFlag=" + ConfirmedIndConstFlag);
                            }
                        }
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Diff:parseBaseDiff:ConfirmedConstFlag:Expression:xConst=" + xConst + " ConfirmedConstFlag=" + ConfirmedConstFlag);
                        }
                    } else {
                        MyCoeff = parseLADiff(StrDiff.substring(startPos), startPos, DiffIntLength, "Differentiation", DiffWithRespTo);
                        xConst = "" + MyCoeff.eval();
                        if ((IsAConstant(xConst, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                            ConfirmedConstFlag = true;
                        } else if ((!IsAConstant(xConst, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Unknown"))) {
                            ConfirmedIndConstFlag = true;
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:parseBaseDiff:IndConst Expression:ConfirmedConstFlag:Else:Function Expression:xConst=" + xConst + " ConfirmedConstFlag=" + ConfirmedConstFlag + " ConfirmedFuncFlag=" + ConfirmedFuncFlag + " ConfirmedIndConstFlag=" + ConfirmedIndConstFlag);
                            }
                        }
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Diff:parseBaseDiff:IndConst Expression:xConst=" + xConst);
                        }
                    }
                    log.info("Diff:parseBaseDiff:Number:MyCoeff=" + xConst + " EnteredLAConstFlag=" + EnteredLAConstFlag);
                    if (chDiff != -1) {
                        SavedOperator = chDiff;
                        if ((SavedOperator == ')') && (posDiff + 1) < StrDiff.length()) {
                            LookAheadOperator = StrDiff.charAt(posDiff + 1);
                        }
                        if (IsNotAnOperator(LookAheadOperator)) {
                            LookAheadOperator = 0;
                        }
                    } else {
                        SavedOperator = 0;
                    }
                    if (ConfirmedConstFlag == true) {
                        final String ConsolidatedConstTerm = xx;
                        x = () -> (ConsolidatedConstTerm + "@" + "Constant" + "@" + "0.0");
                        log.info("Diff:parseBaseDiff:NumberORConstant:x.DiffExpr()=" + x.DiffExpr());
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Diff:parseBaseDiff:Numbers:Return Value:x.DiffExpr()=" + x.DiffExpr());
                        }
                        return x;
                    } else if ((xConst.equalsIgnoreCase("Infinity")) || (xConst.equalsIgnoreCase("NaN"))
                            || (xConst.equalsIgnoreCase("-Infinity")) || (xConst.equalsIgnoreCase("-NaN"))
                            || (xConst.equalsIgnoreCase("+Infinity")) || (xConst.equalsIgnoreCase("+NaN"))
                            || (xConst.contains("Infinity"))
                            || (xConst.contains("NaN"))) {
                        final String ConsolidatedIndConstTerm = xConst;
                        x = () -> (ConsolidatedIndConstTerm + "@" + "ExtremityFactor" + "@" + ConsolidatedIndConstTerm);
                        log.info("Diff:parseBaseDiff:ExtremityFactor:x.DiffExpr()=" + x.DiffExpr());
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Diff:parseBaseDiff:Numbers:ExtremityFactor:Return Value:x.DiffExpr()=" + x.DiffExpr());
                        }
                        return x;
                    } else if ((ConfirmedFuncFlag == true) && (ConfirmedIndConstFlag == false)) {
                        final String ConsolidatedIndConstTerm = xConst;
                        x = () -> (ConsolidatedIndConstTerm + "@" + "Constant" + "@" + "0.0");
                        log.info("Diff:parseBaseDiff:Constant:x.DiffExpr()=" + x.DiffExpr());
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Diff:parseBaseDiff:Numbers:Constant:Return Value:x.DiffExpr()=" + x.DiffExpr());
                        }
                        return x;
                    } else {
                        final String ConsolidatedIndConstTerm = xConst;
                        x = () -> (ConsolidatedIndConstTerm + "@" + "IndependentFactor" + "@" + "0.0");
                        log.info("Diff:parseBaseDiff:IndConstExpression:x.DiffExpr()=" + x.DiffExpr());
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Diff:parseBaseDiff:Numbers:IndConstExpression:Return Value:x.DiffExpr()=" + x.DiffExpr() + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                        }
                        return x;
                    }
                } else if (IsVariable(chDiff)) {//functions & variables
                    log.info("Diff:parseBaseDiff:Entered Functions & Variable:chDiff=" + (char) chDiff);
                    if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                        System.out.println("Diff:parseBaseDiff:Entered Functions & Variable:chDiff=" + (char) chDiff + " posDiff=" + posDiff);
                    }
                    while ((IsVariable(chDiff)) || (IsNumber(chDiff))) {
                        nextCharDiff();
                    }
                    String name = StrDiff.substring(startPos, posDiff).trim();
                    //Code to handle Function
                    if (functionsDiff.containsKey(name)) {
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Diff:parseBaseDiff:Entered Functions:");
                        }
                        String func = name;
                        FuncArgFlag = true;
                        ParanExprFlag = false;
                        int argstartpos = posDiff;
                        int argEndpos = -1;
                        int numberofcharsread = 0;
                        int oldposition = posDiff;
                        numberofcharsread = extractAndClassifyFactors(StrDiff.substring(posDiff), DiffWithRespTo, true);
                        MyParenDecodedSep = "";
                        MyParenEncodedSep = "";
                        if (!otherTermsSep.isEmpty()) {
                            for (String str : otherTermsSep) {
                                MyParenDecodedSep = MyParenDecodedSep + str;
                            }
                            if (MyParenDecodedSep.startsWith("-")) {
                                MyParenDecodedSep = MyParenDecodedSep.replaceFirst("\\-", "");
                            } else if (MyParenDecodedSep.startsWith("+")) {
                                MyParenDecodedSep = MyParenDecodedSep.replaceFirst("\\+", "");
                            } else if (MyParenDecodedSep.startsWith("*")) {
                                MyParenDecodedSep = MyParenDecodedSep.replaceFirst("\\*", "");
                            } else if (MyParenDecodedSep.startsWith("/")) {
                                MyParenDecodedSep = MyParenDecodedSep.replaceFirst("/", "");
                            }
                            MyParenEncodedSep = MyParenDecodedSep;
                            if ((DevelopmentDeepInfoFlagSep) || (GBLSilentDeepInfoSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Braces:IndConst:String:" + StrDiff.substring(oldposition) + " MapType=" + MapType + " MyParenEncodedSep=" + MyParenEncodedSep + " MyParenDecodedSep=" + MyParenDecodedSep);
                            }
                        }
                        if (!xTermsSep.isEmpty()) {
                            for (String str : xTermsSep) {
                                MyParenDecodedSep = MyParenDecodedSep + str;
                            }
                            if (MyParenDecodedSep.startsWith("-")) {
                                MyParenDecodedSep = MyParenDecodedSep.replaceFirst("\\-", "");
                            } else if (MyParenDecodedSep.startsWith("+")) {
                                MyParenDecodedSep = MyParenDecodedSep.replaceFirst("\\+", "");
                            } else if (MyParenDecodedSep.startsWith("*")) {
                                MyParenDecodedSep = MyParenDecodedSep.replaceFirst("\\*", "");
                            } else if (MyParenDecodedSep.startsWith("/")) {
                                MyParenDecodedSep = MyParenDecodedSep.replaceFirst("/", "");
                            }
                            MyParenEncodedSep = MyParenDecodedSep;
                            if ((DevelopmentDeepInfoFlagSep) || (GBLSilentDeepInfoSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diffr:Braces:Variable:String:" + StrDiff.substring(oldposition) + " MapType=" + MapType + " MyParenEncodedSep=" + MyParenEncodedSep + " MyParenDecodedSep=" + MyParenDecodedSep);
                            }
                        }
                        if (!MixedExpressionTermsSep.isEmpty()) {
                            for (String str : MixedExpressionTermsSep) {
                                MyParenDecodedSep = MyParenDecodedSep + str;
                            }

                            if (MyParenDecodedSep.startsWith("-")) {
                                MyParenDecodedSep = MyParenDecodedSep.replaceFirst("\\-", "");
                            } else if (MyParenDecodedSep.startsWith("+")) {
                                MyParenDecodedSep = MyParenDecodedSep.replaceFirst("\\+", "");
                            } else if (MyParenDecodedSep.startsWith("*")) {
                                MyParenDecodedSep = MyParenDecodedSep.replaceFirst("\\*", "");
                            } else if (MyParenDecodedSep.startsWith("/")) {
                                MyParenDecodedSep = MyParenDecodedSep.replaceFirst("/", "");
                            }
                            MyParenEncodedSep = MyParenDecodedSep;
                            if ((DevelopmentDeepInfoFlagSep) || (GBLSilentDeepInfoSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Braces:Constant:String:" + StrDiff.substring(oldposition) + " MapType=" + MapType + " MyParenEncodedSep=" + MyParenEncodedSep + " MyParenDecodedSep=" + MyParenDecodedSep);
                            }
                        }
                        if (!ConstantTermsSep.isEmpty()) {
                            for (String str : ConstantTermsSep) {
                                MyParenDecodedSep = MyParenDecodedSep + str;
                            }

                            if (MyParenDecodedSep.startsWith("-")) {
                                MyParenDecodedSep = MyParenDecodedSep.replaceFirst("\\-", "");
                            } else if (MyParenDecodedSep.startsWith("+")) {
                                MyParenDecodedSep = MyParenDecodedSep.replaceFirst("\\+", "");
                            } else if (MyParenDecodedSep.startsWith("*")) {
                                MyParenDecodedSep = MyParenDecodedSep.replaceFirst("\\*", "");
                            } else if (MyParenDecodedSep.startsWith("/")) {
                                MyParenDecodedSep = MyParenDecodedSep.replaceFirst("/", "");
                            }
                            MyParenEncodedSep = MyParenDecodedSep;
                            if ((DevelopmentDeepInfoFlagSep) || (GBLSilentDeepInfoSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Braces:Constant:String:" + StrDiff.substring(oldposition) + " MapType=" + MapType + " MyParenEncodedSep=" + MyParenEncodedSep + " MyParenDecodedSep=" + MyParenDecodedSep);
                            }
                        }
                        xTermsSep.clear();
                        otherTermsSep.clear();
                        ConstantTermsSep.clear();
                        MixedExpressionTermsSep.clear();
                        log.info("Diff:parseBaseDiff:(: Expression=" + StrDiff.substring(startPos, posDiff) + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                        String TempExprn = MyParenDecodedSep;
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Diff:parseBaseDiff:Arg:TempExprn=" + TempExprn);
                        }
                        if (IsAConstant(TempExprn, DiffWithRespTo)) {
                            final String TempExprnFullFunc = TempExprn;
                            x = () -> "(" + TempExprnFullFunc + ")";
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:parseBaseDiff:Arg:NumberExpression:x.DiffExpr()=" + x.DiffExpr());
                            }
                        } else if ((IsAConstant(TempExprn, DiffWithRespTo))
                                && ((StrIsAConstant.equalsIgnoreCase("IndConstantExpression")) || (StrIsAConstant.equalsIgnoreCase("IndConstant")))) {
                            final String TempExprnFullFunc = TempExprn;
                            x = (() -> "(" + TempExprnFullFunc + ")" + "@" + "Function" + "@" + "(" + MyParenDecodedSep + ")");
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:parseBaseDiff:Arg:IndConstantExpression:MyParenEncoded=" + MyParenDecodedSep + " x.DiffExpr()=" + x.DiffExpr());
                            }
                        }
                        String Exprn = MyParenDecodedSep;
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Diff:parseBaseDiff:Arg:Exprn=" + Exprn + ":MyParenEncoded=" + MyParenDecodedSep + " x.DiffExpr()=" + x.DiffExpr());
                        }
                        DiffExpr arg = (() -> "");
                        if ((Exprn.contains(DiffWithRespTo)) && (!Exprn.equalsIgnoreCase("(" + DiffWithRespTo + ")"))) {
                            Map<String, String> variablesBackupState = new HashMap();
                            depthBackUpRestore++;
                            StrKeyBackUpRestore = FileSepBackUpRestore + "Diff:parseBaseDiff:Functions";
                            if (!AutoGenSilentFlag) {
                                System.out.println(ConsoleColors.GREEN + "Diff:parseBaseDiff:Diff:parseBaseDiff:Functions:Start:Exprn=" + Exprn + ConsoleColors.RESET);
                            }
                            BackupDiffIntegrStateAll(variablesBackupState);
                            MathsContxtLAv.ChaosPrevention();
                            arg = parseDiff(Exprn, variables, DiffWithRespTo, MapType, IntegrORDiffr);
                            InitState();
                            RestoreDiffIntegrStateAll(variablesBackupState);
                            if (!AutoGenSilentFlag) {
                                System.out.println(ConsoleColors.GREEN + "Diff:parseBaseDiff:Diff:parseBaseDiff:Functions:End:arg.DiffExpr()=" + arg.DiffExpr() + ConsoleColors.RESET);
                            }
                            depthBackUpRestore--;
                            StrKeyBackUpRestore = FileSepBackUpRestore;
                            argEndpos = posDiff;
                            if ((argEndpos > -1) && (argEndpos < StrDiff.length())) {
                                posDiff = argEndpos;
                                chDiff = StrDiff.charAt(posDiff);
                            } else {
                                if (StrDiff==null)
                                    StrDiff="";
                                posDiff = StrDiff.length();
                                chDiff = -1;
                            }
                        } else {
                            log.info("Diff:parseBaseDiff:Entered Functions & Variable:Got DiffWithRespTo Dependency:arg.DiffExpr()=" + arg.DiffExpr() + " chDiff=" + (char) chDiff);
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:parseBaseDiff:Else:Arg:Exprn=" + Exprn + ":MyParenEncoded=" + MyParenDecodedSep + " x.DiffExpr()=" + x.DiffExpr());
                            }
                        }
                        final String ArgDiff = arg.DiffExpr();
                        FuncArgFlag = false;
                        ParanExprFlag = false;
                        ParenthesisFlag = false;
                        ParanExprInProgressFlag = false;
                        String ArgTemp1 = splitBraces(Exprn);
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Diff:parseBaseDiff:Arg:Exprn=" + Exprn + " ArgTemp1=" + ArgTemp1 + ":MyParenEncoded=" + MyParenDecodedSep + " x.DiffExpr()=" + x.DiffExpr());
                        }
                        if ((ArgTemp1 != null) && (!ArgTemp1.equalsIgnoreCase(""))) {
                            final String name1 = name;
                            x = (() -> (name1 + "@" + "Function" + "@" + "Factor" + "@" + ArgTemp1 + "@" + ArgTemp1));
                            Split(x.DiffExpr(), DiffWithRespTo);
                            Expr_Func_Split(x.DiffExpr(), DiffWithRespTo);
                            //Code to handle Function Arguments
                            if ((!arg.DiffExpr().equalsIgnoreCase("")) && ((FunctionDiffExpr == null) || (FunctionDiffExpr.equalsIgnoreCase("")))) {
                                final String name2 = name;
                                final String finargStr = arg.DiffExpr();
                                x = (() -> (name2 + "@" + "Function" + "@" + "Factor" + "@" + (ArgTemp1) + "@" + finargStr));
                                if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Diff:parseBaseDiff:FSM1:x.DiffExpr()=" + x.DiffExpr());
                                }
                            } else if ((FunctionDiffExpr != null) && (!FunctionDiffExpr.equalsIgnoreCase(DiffWithRespTo)) && (!FunctionDiffExpr.equalsIgnoreCase("")) && (!FunctionDiffExpr.contains("+")) && (!FunctionDiffExpr.contains("-"))) {
                                final String name2 = name;
                                x = (() -> (name2 + "@" + "Function" + "@" + "Factor" + "@" + (ArgTemp1) + "@" + FunctionDiffExpr));
                                if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Diff:parseBaseDiff:FSM2:x.DiffExpr()=" + x.DiffExpr());
                                }
                            } else if ((FunctionDiffExpr != null) && (!FunctionDiffExpr.equalsIgnoreCase(""))) {
                                final String name2 = name;
                                x = (() -> (name2 + "@" + "Function" + "@" + "Factor" + "@" + (ArgTemp1) + "@" + FunctionDiffExpr));
                                if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Diff:parseBaseDiff:FSM3:x.DiffExpr()=" + x.DiffExpr());
                                }
                            }
                            posDiff = advanceOneFactor(StrDiff, posDiff);
                            if ((posDiff > -1) && (posDiff < StrDiff.length())) {
                                chDiff = StrDiff.charAt(posDiff);
                            } else {
                                chDiff = -1;
                                posDiff = StrDiff.length();
                            }
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:parseBaseDiff:Function:End:x.DiffExpr()=" + x.DiffExpr() + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                            }
                            return x;
                        } else {
                            final String MyName = name;
                            x = () -> (MyName + "@" + "Unknown" + "@" + (MyName));
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:parseBaseDiff:Function:Unknown:Return Value:x.DiffExpr()=" + x.DiffExpr());
                            }
                        }
                    } else if ((name.equalsIgnoreCase(DiffWithRespTo))) {
                        log.info("Diff:parseBaseDiff:Polynomial:posDiff=" + posDiff);
                        final String MyName = name;
                        x = () -> (MyName + "@" + "Polynomial" + "@" + (MyName));
                        ContainsXFlag = true;
                    } else if ((name.equalsIgnoreCase(DiffWithRespTo)) && (!name.contains("^"))) {
                        log.info("Diff:parseBaseDiff:Factor:posDiff=" + posDiff);
                        final String MyName = name;
                        x = () -> (MyName + "@" + "Factor" + "@" + (MyName));
                        ContainsXFlag = true;
                    } else if ((!name.equalsIgnoreCase(DiffWithRespTo)) && (!name.equalsIgnoreCase("Infinity")) && (!name.equalsIgnoreCase("Nan"))) {//Independent Variable
                        log.info("Diff:parseBaseDiff:IndependentFactor:posDiff=" + posDiff);
                        final String MyName = name;
                        x = () -> (MyName + "@" + "IndependentFactor" + "@" + (MyName));
                    } else if ((!name.equalsIgnoreCase(DiffWithRespTo)) && ((name.equalsIgnoreCase("Infinity")) || (name.equalsIgnoreCase("NaN")))) {//Extremity Variable
                        log.info("Diff:parseBaseDiff:ExtremityFactor:posDiff=" + posDiff);
                        final String MyName = name;
                        x = () -> (MyName + "@" + "ExtremityFactor" + "@" + (MyName));
                    }
                    log.info("Diff:parseBaseDiffr:Variable/Function:name=" + name + " x.DiffExpr()=" + x.DiffExpr());
                    if ((DevelopmentFlagSep == true) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                        System.out.println("Diff:parseBaseDiffr:Variable/Function:name=" + name + " x.DiffExpr()=" + x.DiffExpr());
                    }
                    return x;
                } else if (chDiff == '(') {
                    if ((DevelopmentDeepInfoFlagSep) || (GBLSilentDeepInfoSep.equalsIgnoreCase("Verbose"))) {
                        System.out.println("Diff:Braces:(:Entered:posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                    }
                    char ParenOperator = 0;
                    if (posDiff > 1) {
                        ParenOperator = StrDiff.charAt(posDiff - 1);
                    } else {
                        ParenOperator = '*';
                    }
                    int argstartpos = posDiff + 1;
                    int argEndpos = -1;
                    int numberofcharsread = 0;
                    int oldposition = posDiff + 1;
                    numberofcharsread = extractAndClassifyFactors(StrDiff.substring(posDiff), DiffWithRespTo, true);
                    MyParenDecodedSep = "";
                    MyParenEncodedSep = "";
                    if ((DevelopmentDeepInfoFlagSep) || (GBLSilentDeepInfoSep.equalsIgnoreCase("Verbose"))) {
                        System.out.println("otherTermsSep:");
                        otherTermsSep.forEach(System.out::println);
                    }
                    if (!otherTermsSep.isEmpty()) {
                        for (String str : otherTermsSep) {
                            MyParenDecodedSep = MyParenDecodedSep + str;
                        }
                        if (MyParenDecodedSep.startsWith("-")) {
                            MyParenDecodedSep = MyParenDecodedSep.replaceFirst("\\-", "");
                        } else if (MyParenDecodedSep.startsWith("+")) {
                            MyParenDecodedSep = MyParenDecodedSep.replaceFirst("\\+", "");
                        } else if (MyParenDecodedSep.startsWith("*")) {
                            MyParenDecodedSep = MyParenDecodedSep.replaceFirst("\\*", "");
                        } else if (MyParenDecodedSep.startsWith("/")) {
                            MyParenDecodedSep = MyParenDecodedSep.replaceFirst("/", "");
                        }
                        MyParenEncodedSep = MyParenDecodedSep;
                        if ((DevelopmentDeepInfoFlagSep) || (GBLSilentDeepInfoSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Braces:IndConst:String:" + StrDiff.substring(oldposition) + " MapType=" + MapType + " MyParenEncodedSep=" + MyParenEncodedSep + " MyParenDecodedSep=" + MyParenDecodedSep);
                        }
                    }
                    if ((DevelopmentDeepInfoFlagSep) || (GBLSilentDeepInfoSep.equalsIgnoreCase("Verbose"))) {
                        System.out.println("ConstantTermsSep:");
                        ConstantTermsSep.forEach(System.out::println);
                    }
                    if (!ConstantTermsSep.isEmpty()) {
                        for (String str : ConstantTermsSep) {
                            MyParenDecodedSep = MyParenDecodedSep + str;
                        }
                        if (MyParenDecodedSep.startsWith("-")) {
                            MyParenDecodedSep = MyParenDecodedSep.replaceFirst("\\-", "");
                        } else if (MyParenDecodedSep.startsWith("+")) {
                            MyParenDecodedSep = MyParenDecodedSep.replaceFirst("\\+", "");
                        } else if (MyParenDecodedSep.startsWith("*")) {
                            MyParenDecodedSep = MyParenDecodedSep.replaceFirst("\\*", "");
                        } else if (MyParenDecodedSep.startsWith("/")) {
                            MyParenDecodedSep = MyParenDecodedSep.replaceFirst("/", "");
                        }
                        MyParenEncodedSep = MyParenDecodedSep;
                        if ((DevelopmentDeepInfoFlagSep) || (GBLSilentDeepInfoSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Braces:Constant:String:" + StrDiff.substring(oldposition) + " MapType=" + MapType + " MyParenEncodedSep=" + MyParenEncodedSep + " MyParenDecodedSep=" + MyParenDecodedSep);
                        }

                    }
                    if ((DevelopmentDeepInfoFlagSep) || (GBLSilentDeepInfoSep.equalsIgnoreCase("Verbose"))) {
                        System.out.println("MixedExpressionTermsSep:");
                        MixedExpressionTermsSep.forEach(System.out::println);
                    }
                    if ((DevelopmentDeepInfoFlagSep) || (GBLSilentDeepInfoSep.equalsIgnoreCase("Verbose"))) {
                        System.out.println("xTermsSep:");
                        xTermsSep.forEach(System.out::println);
                    }
                    //xTermsSep.clear();
                    otherTermsSep.clear();
                    ConstantTermsSep.clear();
                    String TempExprn = MyParenDecodedSep;
                    String ProductDiff = "";
                    String QuotientDiff = "";
                    if ((MyParenEncodedSep == null) || (MyParenEncodedSep.equalsIgnoreCase(""))) {
                        if ((!MixedExpressionTermsSep.isEmpty()) && (MixedExpressionTermsSep.size() == 1)) {
                            MyParenEncodedSep = MixedExpressionTermsSep.getFirst();
                            if (ParenOperator == '*') {
                                ProductDiff = "*";
                            } else if (ParenOperator == '/') {
                                QuotientDiff = "/";
                            }
                        }
                        TempExprn = MyParenEncodedSep;

                        MixedExpressionTermsSep.clear();
                    } else if (((MyParenDecodedSep == null) || (MyParenDecodedSep.equalsIgnoreCase(""))) && (posDiff >= startPos) && (posDiff < StrDiff.length())) {
                        //TempExprn = StrDiff.substring(startPos, posDiff);
                        if ((!xTermsSep.isEmpty()) && (xTermsSep.size() == 2)) {
                            int j = 0;
                            for (String str : xTermsSep) {
                                if (j == 0) {
                                    MyParenDecodedSep = str;
                                } else if (j == 1) {
                                    MyParenEncodedSep = str;
                                    if (str.startsWith("*")) {
                                        ProductDiff = "*";
                                    } else if (str.startsWith("/")) {
                                        QuotientDiff = "/";
                                    }
                                }
                                j++;
                                if (j >= 2) {
                                    break;
                                }
                            }
                            if (MyParenDecodedSep.startsWith("-")) {
                                MyParenDecodedSep = MyParenDecodedSep.replaceFirst("\\-", "");
                            } else if (MyParenDecodedSep.startsWith("+")) {
                                MyParenDecodedSep = MyParenDecodedSep.replaceFirst("\\+", "");
                            }
                            if (j < 1) {
                                MyParenEncodedSep = MyParenDecodedSep;
                            }
                            if ((DevelopmentDeepInfoFlagSep) || (GBLSilentDeepInfoSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diffr:Braces:Variable:String:" + StrDiff.substring(oldposition) + " MapType=" + MapType + " MyParenEncodedSep=" + MyParenEncodedSep + " MyParenDecodedSep=" + MyParenDecodedSep);
                            }
                        }
                        TempExprn = MyParenEncodedSep;
                        xTermsSep.clear();
                    }
                    if (IsAConstant(TempExprn, DiffWithRespTo)) {
                        final String TempExprnFullFunc = TempExprn;
                        x = () -> "(" + TempExprnFullFunc + ")";
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Diff:parseBaseDiff:(:NumberExpression:x.DiffExpr()=" + x.DiffExpr());
                        }
                    } else if ((!IsAConstant(TempExprn, DiffWithRespTo))
                            && ((StrIsAConstant.equalsIgnoreCase("IndConstantExpression")) || (StrIsAConstant.equalsIgnoreCase("IndConstant")))) {
                        final String TempExprnFullFunc = TempExprn;
                        if ((TempExprn.contains("(")) && (TempExprn.contains(")"))) {
                            x = (() -> TempExprnFullFunc + "@" + "Parenthesis" + "@" + MyParenDecodedSep);
                        } else {
                            x = (() -> "(" + TempExprnFullFunc + ")" + "@" + "Parenthesis" + "@" + MyParenDecodedSep);
                        }
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Diff:parseBaseDiffr:(:IndConstantExpression:MyParenEncoded=" + MyParenDecodedSep + " x.DiffExpr()=" + x.DiffExpr());
                        }
                        log.info("Diff:parseBaseDiffr:(: Parenthesis:posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                    } else if ((!IsAConstant(TempExprn, DiffWithRespTo))
                            && (StrIsAConstant.equalsIgnoreCase("ParenthesisExpression"))) {
                        final String TempExprnFullFunc = TempExprn;
                        x = (() -> "(" + TempExprnFullFunc + ")" + "@" + "Parenthesis" + "@" + MyParenDecodedSep);
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Diff:parseBaseDiffr:(:ParenthesisExpression:MyParenEncoded=" + MyParenDecodedSep + " StrIsAConstant=" + StrIsAConstant + " TempExprn=" + TempExprn);
                        }
                        log.info("Diff:parseBaseDiff:(: Parenthesis:posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                    } else {
                        //throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "Parenthesis Expression:IS NULL:SimpleTerm:parseBaseSimple:Nested Parenthesis: StrTerm.length()=" + StrDiff.substring(oldposition).length() + " OpenBraces=" + OpenBracesCount + " CloseBraces=" + CloseBracesCount + " StrIsAConstant=" + StrIsAConstant);
                        System.out.println("Diff:parseBaseDiff:(:Exception:OpenBraces=" + OpenBraces + " CloseBraces=" + CloseBraces + " StrIsAConstant=" + StrIsAConstant + " MyParenDecodedSep=" + MyParenDecodedSep + " TempExprn=" + TempExprn);
                    }
                    String Exprn = "";
                    if ((ProductDiff.equalsIgnoreCase("*")) || (QuotientDiff.equalsIgnoreCase("/"))) {
                        Exprn = MyParenDecodedSep + MyParenEncodedSep;
                    } else {
                        Exprn = MyParenDecodedSep;
                    }
                    log.info("Diff:parseBaseDiff:Entered Parenthesis:Arg:Exprn=" + Exprn + " chDiff=" + (char) chDiff);
                    DiffExpr arg1 = (() -> "");
                    DiffExpr arg2 = (() -> "");
                    DiffExpr arg3 = (() -> "");
                    String LocalMyParenDecodedSep = MyParenDecodedSep;
                    String LocalMyParenEncodedSep = MyParenEncodedSep;
                    final String FinOrgLocalMyParenDecodedSep = MyParenDecodedSep;
                    final String FinOrgLocalMyParenEncodedSep = MyParenEncodedSep;
                    if (Exprn.contains(DiffWithRespTo)) {
                        log.info("Diff:parseBaseDiff:Parenthesis:Arg:Exprn=" + Exprn + " chDiff=" + (char) chDiff);
                        depthBackUpRestore++;
                        StrKeyBackUpRestore = FileSepBackUpRestore + "Diff:parseBaseDiff:Parenthesis";
                        if (!AutoGenSilentFlag) {
                            System.out.println(ConsoleColors.GREEN + "Diff:parseBaseDiff:Diff:parseBaseDiff:Parenthesis:Start:Exprn=" + Exprn + ConsoleColors.RESET);
                        }
                        Map<String, String> variablesBackupState = new HashMap();
                        BackupDiffIntegrStateAll(variablesBackupState);
                        //MathsContxtLAv.ChaosPrevention();
                        //InitState();
                        if ((LocalMyParenDecodedSep.contains("(")) && (LocalMyParenDecodedSep.contains(")"))) {
                            LocalMyParenDecodedSep = LocalMyParenDecodedSep.replaceFirst("\\(", "").replaceFirst("\\)", "");
                            System.out.println(ConsoleColors.BLUE + "Diff:parseBaseDiff:Diff:MyParenDecodedSep:LocalMyParenDecodedSep=" + LocalMyParenDecodedSep + ConsoleColors.RESET);
                        }
                        arg1 = parseDiff(LocalMyParenDecodedSep, variables, DiffWithRespTo, MapType, IntegrORDiffr);
                        if (!AutoGenSilentFlag) {
                            System.out.println(ConsoleColors.GREEN + "Diff:parseBaseDiff:Diff:MyParenDecodedSep:arg1.DiffExpr()=" + arg1.DiffExpr() + " LocalMyParenDecodedSep=" + LocalMyParenDecodedSep + ConsoleColors.RESET);
                        }
                        if ((LocalMyParenEncodedSep.contains("(")) && (LocalMyParenEncodedSep.contains(")"))) {
                            LocalMyParenEncodedSep = LocalMyParenEncodedSep.replaceFirst("\\(", "").replaceFirst("\\)", "");
                            System.out.println(ConsoleColors.BLUE + "Diff:parseBaseDiff:Diff:MyParenEncodedSep:LocalMyParenEncodedSep=" + LocalMyParenEncodedSep + ConsoleColors.RESET);
                        }
                        if (LocalMyParenEncodedSep.startsWith("*")) {
                            LocalMyParenEncodedSep = LocalMyParenEncodedSep.replaceFirst("\\*", "");
                            System.out.println(ConsoleColors.BLUE + "Diff:parseBaseDiff:Diff:MyParenEncodedSep:LocalMyParenEncodedSep=" + LocalMyParenEncodedSep + ConsoleColors.RESET);
                        } else if (LocalMyParenEncodedSep.startsWith("/")) {
                            LocalMyParenEncodedSep = LocalMyParenEncodedSep.replaceFirst("/", "");
                            System.out.println(ConsoleColors.BLUE + "Diff:parseBaseDiff:Diff:MyParenEncodedSep:LocalMyParenEncodedSep=" + LocalMyParenEncodedSep + ConsoleColors.RESET);
                        }
                        arg2 = parseDiff(LocalMyParenEncodedSep, variables, DiffWithRespTo, MapType, IntegrORDiffr);
                        System.out.println(ConsoleColors.GREEN + "Diff:parseBaseDiff:Diff:MyParenEncodedSep:arg2.DiffExpr()=" + arg2.DiffExpr() + " LocalMyParenEncodedSep=" + LocalMyParenEncodedSep + ConsoleColors.RESET);
                        RestoreDiffIntegrStateAll(variablesBackupState);
                        System.out.println(ConsoleColors.GREEN + "Diff:parseBaseDiff:Diff:parseBaseDiff:Parenthesis:End:arg1.DiffExpr()=" + arg1.DiffExpr() + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.GREEN + "Diff:parseBaseDiff:Diff:parseBaseDiff:Parenthesis:End:arg2.DiffExpr()=" + arg2.DiffExpr() + ConsoleColors.RESET);
                        depthBackUpRestore--;
                        StrKeyBackUpRestore = FileSepBackUpRestore;
                        log.info("Diff:parseBaseDiff:Parenthesis:Got DiffWithRespTo Dependency:arg.DiffExpr()=" + arg1.DiffExpr() + " chDiff=" + (char) chDiff);

                        final String MyTemp1 = arg1.DiffExpr();
                        final String MyTemp2 = arg2.DiffExpr();
                        final String MyTempProduct = ProductDiff;
                        final String MyTempQuotient = QuotientDiff;
                        final String finLocalMyParenDecodedSep = LocalMyParenDecodedSep;
                        final String finLocalMyParenEncodedSep = LocalMyParenEncodedSep;
                        if (ProductDiff.equalsIgnoreCase("*")) {
                            if ((MyTemp1 == null) || (MyTemp1.equalsIgnoreCase("")) && ((LocalMyParenDecodedSep == null) || (LocalMyParenDecodedSep.equalsIgnoreCase("")))) {
                                arg3 = (() -> FinOrgLocalMyParenEncodedSep + "@" + "Parenthesis" + "@" + FinOrgLocalMyParenDecodedSep + MyTemp2);
                            } else {
                                arg3 = (() -> FinOrgLocalMyParenDecodedSep + FinOrgLocalMyParenEncodedSep + "@" + "Parenthesis" + "@" + FinOrgLocalMyParenDecodedSep + "*" + MyTemp2 + "+" + finLocalMyParenEncodedSep + "*" + "(" + MyTemp1 + ")");
                            }
                            System.out.println(ConsoleColors.GREEN + "Diff:parseBaseDiff:Diff:MyParenEncodedSep:arg2.DiffExpr()=" + arg2.DiffExpr() + " LocalMyParenEncodedSep=" + LocalMyParenEncodedSep + ConsoleColors.RESET);
                        } else if (QuotientDiff.equalsIgnoreCase("/")) {
                            arg3 = (() -> FinOrgLocalMyParenDecodedSep + FinOrgLocalMyParenEncodedSep + "@" + "Parenthesis" + "@" + "(" + finLocalMyParenEncodedSep + "*" + "(" + MyTemp1 + ")" + "-" + FinOrgLocalMyParenDecodedSep + "*" + MyTemp2 + ")" + finLocalMyParenEncodedSep + "*" + finLocalMyParenEncodedSep);
                            System.out.println(ConsoleColors.GREEN + "Diff:parseBaseDiff:Diff:MyParenEncodedSep:arg2.DiffExpr()=" + arg2.DiffExpr() + " LocalMyParenEncodedSep=" + LocalMyParenEncodedSep + ConsoleColors.RESET);
                        }
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Diff:parseBaseDiff:(:ParenthesisExpression:arg:With DiffWithRespTo:Exprn=" + MyParenDecodedSep + MyParenEncodedSep + " arg3.DiffExpr()=" + arg3.DiffExpr());
                        }
                        ParanExprFlag = false;
                        ParenthesisFlag = false;
                        log.info("Diff:parseBaseDiff:Parenthesis:arg3.DiffExpr()=" + arg3.DiffExpr());
                        ParanExprInProgressFlag = false;
                        log.info("Diff:parseBaseDiff:Function Argument:argstartpos=" + argstartpos + " argEndpos=" + argEndpos + " Str.length()=" + StrDiff.length());
                        //(name + "@" + "Parenthesis" + "@" + ParanDiffExpr) )
                        if (arg3.DiffExpr().endsWith("@Parenthesis@")) {
                            final String MyTemp3 = Exprn;
                            x = (() -> MyTemp3 + "@" + "Parenthesis" + "@" + MyParenDecodedSep);
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:parseBaseDiff:(:ParenthesisExpression:arg:EndsWith:MyParenEncoded=" + MyParenDecodedSep + " arg.DiffExpr()=" + arg1.DiffExpr() + " x.DiffExpr()" + x.DiffExpr());
                            }
                        } else {
                            final String ParaDiff = arg3.DiffExpr();
                            if (IsAConstant(ParaDiff, DiffWithRespTo)) {
                                x = (() -> ParaDiff);
                                log.info("Diff:parseBaseDiff:Function Argument:x.DiffExpr()=" + x.DiffExpr() + " chDiff=" + (char) chDiff + " posDiff=" + posDiff);
                                if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Diff:parseBaseDiff:(:ParenthesisExpression:arg:With x:MyParenEncoded=" + MyParenDecodedSep + " arg.DiffExpr()=" + arg1.DiffExpr() + " x.DiffExpr()" + x.DiffExpr());
                                }
                            } else {
                                x = (() -> ParaDiff);
                                log.info("Diff:parseBaseDiff:Function Argument:x.DiffExpr()=" + x.DiffExpr() + " chDiff=" + (char) chDiff + " posDiff=" + posDiff);
                                if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Diff:parseBaseDiff:(1:ParenthesisExpression:MyParenEncoded=" + MyParenDecodedSep + " ParaDiff=" + ParaDiff + " StrIsAConstant=" + StrIsAConstant + " x.DiffExpr()=" + x.DiffExpr());
                                }
                            }
                        }
                    } else {
                        final String ParaDiff = arg3.DiffExpr();
                        final String ParaDiff1 = Exprn;
                        if (!ParaDiff.isBlank()) {
                            x = (() -> ParaDiff1 + "@" + "Parenthesis" + "@" + ParaDiff);
                        }
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Diff:parseBaseDiff:(2:ParenthesisExpression:MyParenDecodedSep=" + MyParenDecodedSep + " ParaDiff=" + ParaDiff + " StrIsAConstant=" + StrIsAConstant + " x.DiffExpr()=" + x.DiffExpr());
                        }
                    }
                    posDiff = advanceOneTerm(StrDiff, posDiff);
                    if ((posDiff > -1) && (posDiff < StrDiff.length())) {
                        chDiff = StrDiff.charAt(posDiff);
                    } else {
                        chDiff = -1;
                        posDiff = StrDiff.length();
                    }
                    if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                        System.out.println("Diff:parseBaseDiff:(3:ParenthesisExpression:MyParenEncodedSep=" + MyParenDecodedSep + " StrIsAConstant=" + StrIsAConstant + " x.DiffExpr()=" + x.DiffExpr() + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                    }
                    return x;
                } else {
                    if ((IsNotAnOperator(chDiff) && (IsNotANumber(chDiff))) && (chDiff != 0) && (chDiff != -1) && (chDiff != '(')) {
                        if ((chDiff != -1) && (chDiff != 0) && (posDiff >= 1) && (posDiff < StrDiff.length()) && (IsNumber(chDiff))) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "Diff:parseBase:Please Check Code:Should NOT reach Here:Unexpected: " + (char) chDiff + " int=" + (int) chDiff + " posDiff=" + posDiff + " StrDiff=" + StrDiff.substring(posDiff, StrDiff.length()));
                        } else if ((chDiff != -1) && (chDiff != 0) && (posDiff >= 1) && (posDiff < StrDiff.length()) && (IsOperator(chDiff))) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "Diff:parseBase:Please Check Equation Operators:Should NOT reach Here:Unexpected: " + (char) chDiff + " int=" + (int) chDiff + " posDiff=" + posDiff + " StrDiff=" + StrDiff.substring(posDiff, StrDiff.length()));
                        } else if ((chDiff != -1) && (chDiff != 0) && (posDiff >= 1) && (posDiff < StrDiff.length())) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "Diff:parseBase:Unexpected: " + (char) chDiff + " int=" + (int) chDiff + " posDiff=" + posDiff + " StrDiff=" + StrDiff.substring(posDiff, StrDiff.length()));
                        } else {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "Diff:parseBase:Unexpected char: " + (char) chDiff + " int=" + (int) chDiff + " posDiff=" + posDiff + " StrDiff=" + StrDiff.substring(posDiff, StrDiff.length()));
                        }
                    }
                }
                return x;
            }
        }.parseDiffExpr();
    }
//Created by Rajesh Pai
// Integrates F(x)
//Copyright (c) 2018 by Rajesh V. Pai

    @FunctionalInterface
    public interface IntegrExpr {

        String IntegrExpr();
    }

    public static IntegrExpr parseIntegr(String str, Map<String, Double> variables, String DiffWithRespTo, String MapType, String IntegrORDiffr) {

        return new Object() {

            IntegrExpr parseIntegrExpr() {
                IntegrExpr x = (() -> "");
                ResetVars("IntegrExpr");
                MyFuncIntegr();
                StrIntegr = str;
                if ((StrIntegr == null) || (StrIntegr.equalsIgnoreCase(""))) {
                    return x;
                }
                posIntegr = 0;
                chIntegr = StrIntegr.charAt(0);
                SavedOperator = 0;
                int oldch = chIntegr;
                if ((IsVariable(chIntegr)) || (IsNumber(chIntegr))) {
                    oldch = 0;
                } else if ((chIntegr == '-') || (chIntegr == '+')) {
                    posIntegr = posIntegr + 1;
                    if (StrIntegr.length() > 1) {
                        chIntegr = StrIntegr.charAt(1);
                    }
                }
                if ((StrIntegr != null) && (StrIntegr.length() > 0)
                        && (StrIntegr.length() < 2)
                        && ((chIntegr == '*')
                        || (chIntegr == '/')
                        || (chIntegr == '^'))) {
                    return x;
                } else {
                    x = parseExpressionIntegr();
                    if ((x.IntegrExpr().contains("@Unknown@")) || (x.IntegrExpr().contains("@"))) {
                        throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "Integr:parseIntegrExpr:Unknown in Integration Output:x.IntegrExpr()=" + x.IntegrExpr() + ":Unexpected: " + (char) chIntegr + " int=" + (int) chIntegr + " Cannot Format:" + StrIntegr.substring(posIntegr, StrIntegr.length()));
                    }
                }
                log.info("Integr:parseIntegr:Final:x.IntegrExpr()=" + x.IntegrExpr());
                if ((oldch == '-') && (x.IntegrExpr().startsWith("-"))) {
                    final String FinalOutput = x.IntegrExpr().replaceFirst("-", "");
                    x = (() -> FinalOutput);
                } else if ((oldch == '-') && (!x.IntegrExpr().startsWith("-"))) {
                    final String FinalOutput = x.IntegrExpr();
                    final int MySignInt = oldch;
                    x = (() -> (char) MySignInt + FinalOutput);
                }
//                if (x.IntegrExpr().contains("--")) {
//                    String OutputExprn = x.IntegrExpr().replaceAll("\\--", "-");
//                    final String FinalOutput = OutputExprn;
//                    x = (() -> FinalOutput);
//                }
//                if (x.IntegrExpr().contains("+-")) {
//                    String OutputExprn = x.IntegrExpr().replaceAll("\\+-", "-");
//                    final String FinalOutput = OutputExprn;
//                    x = (() -> FinalOutput);
//                }
//                if ((pos != -1)&&(str != null)&&(!str.equalsIgnoreCase(""))&&(pos <= str.length())) {
//                    throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "Integr:parse:Unexpected: " + (char) ch + " int=" + (int) ch + " pos=" + pos + " str=" + str.substring(pos, str.length()));
//                }
                if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                    ;//System.out.println("Integr:parseIntegrExpr:Final:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr + " StrIntegr=" + StrIntegr.substring(posIntegr));
                }
                return x;
            }

            //Grammar:
            //expression = term | expression '+' term |expression '-' term
            //term = factor | term '*' factor | term '/' factor
            //factor = base | base ^ base
            //base = '-' base | '+' base | number | identifier |function expression | '(' expression ')'
            //
            IntegrExpr parseExpressionIntegr() {
                log.info("Integr:parseExpressionIntegr:StrIntegr=" + StrIntegr + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                int ExprStartPos = posIntegr;
                int ExprEndPos = -1;
                int startpos = posIntegr;
                DiffTermOperator = -1;
                SavedOperator = 0;
                IntegrExpr x = parseTermIntegr();
                int endpos = posIntegr;
                String xExprn = "";
                String OutputExprn = "";
                if ((startpos != -1) && (endpos != -1) && (startpos < endpos) && (startpos <= StrIntegr.length()) && (startpos < StrIntegr.length()) && (endpos <= StrIntegr.length())) {
                    xExprn = StrIntegr.substring(startpos, endpos);
                }
                String xConst = "";
                OutputExprn = x.IntegrExpr();
                log.info("Integr:parseExpressionIntegr:Initial Call to parseTermIntegr:OutputExprn=" + OutputExprn);
                if (((IsAConstant(OutputExprn, DiffWithRespTo)) && (IsAConstant(xExprn, DiffWithRespTo))
                        || ((!IsAConstant(OutputExprn, DiffWithRespTo))
                        && ((StrIsAConstant.equalsIgnoreCase("IndConstantExpression"))
                        || (StrIsAConstant.equalsIgnoreCase("IndConstant")))
                        && ((!IsAConstant(xExprn, DiffWithRespTo))
                        && ((StrIsAConstant.equalsIgnoreCase("IndConstantExpression"))
                        || (StrIsAConstant.equalsIgnoreCase("IndConstant"))))))
                        && ((chIntegr == '+') || (chIntegr == '-') || (chIntegr == -1))) {
                    log.info("Integr:parseExpressionIntegr:Mapping 0.0:Got a Constant Value from parseTermIntegr:OutputExprn=" + OutputExprn);
                    OutputExprn = xExprn;
                    final String ConstCoeff = xExprn;
                    x = (() -> ConstCoeff + "*" + DiffWithRespTo);
                    xExprn = ConstCoeff + "*" + DiffWithRespTo;
                } else if ((OutputExprn.equalsIgnoreCase(DiffWithRespTo)) || (OutputExprn.equalsIgnoreCase("1.0")) && ((chIntegr == '+') || (chIntegr == '-') || (chIntegr == -1))) {
                    OutputExprn = "1.0/2.0*" + DiffWithRespTo + "^2.0";
                    final String Output = OutputExprn;
                    x = (() -> Output);
                    xExprn = Output;
                } else {
                    final String Output = OutputExprn;
                    x = (() -> Output);
                    xExprn = Output;
                }
                for (;;) {
                    DiffTermOperator = -1;
                    ContainsXFlag = false;
                    log.info("Integr:parseExpressionIntegr:posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                    if ((eatIntegr('+')) /*&& ((NormalExprnFlag == true) || (NormalNotPareFlag == true) || (ParenthesisFlag == true) || (FuncArgFlag == true)) */) {// addition
                        int bstartpos = posIntegr;
                        IntegrExpr a = x, b = parseTermIntegr();
                        String bExprn = "";
                        int bendpos = posIntegr;
                        if ((bstartpos != -1) && (bendpos != -1) && (bstartpos < bendpos) && (bstartpos <= StrIntegr.length()) && (bstartpos < StrIntegr.length()) && (bendpos <= StrIntegr.length())) {
                            bExprn = StrIntegr.substring(bstartpos, bendpos);
                        }
                        log.info("Integr:parseExpressionIntegr:b.IntegrExpr()=" + b.IntegrExpr());
                        if ((IsAConstant(b.IntegrExpr(), DiffWithRespTo)) && (b.IntegrExpr().equalsIgnoreCase(bExprn))) {
                            final String ConstCoeff = bExprn;
                            b = (() -> ConstCoeff + "*" + DiffWithRespTo);
                        } else if ((!b.IntegrExpr().equalsIgnoreCase(bExprn)) && ((b.IntegrExpr().equalsIgnoreCase(DiffWithRespTo)) || (b.IntegrExpr().equalsIgnoreCase("1.0"))))
                            ;//Do Nothing as b.DiffExpr() has the value(the Coeff of x)
                        else if ((b.IntegrExpr().equalsIgnoreCase(DiffWithRespTo)) || (b.IntegrExpr().equalsIgnoreCase("1.0"))) {
                            b = (() -> "1.0/2.0*" + DiffWithRespTo + "^2.0");
                        }
                        log.info("Integr:parseExpressionIntegr:a.IntegrExpr()=" + a.IntegrExpr());
                        log.info("Integr:parseExpressionIntegr:b.IntegrExpr()=" + b.IntegrExpr());
                        log.info("Integr:parseExpressionIntegr:x.IntegrExpr()=" + x.IntegrExpr());
                        log.info("Integr:parseExpressionIntegr:xExprn=" + xExprn);
                        if (a.IntegrExpr().contains("Parenthesis")) {
                            Expr_Func_Split_Integr(a.IntegrExpr(), DiffWithRespTo);
                            final String ParaExprA = ParanExpr;
                            final String ParaExprDiffExprA = ParanDiffExpr;
                            a = (() -> ParaExprDiffExprA);
                        }
                        if (b.IntegrExpr().contains("Parenthesis")) {
                            Expr_Func_Split_Integr(b.IntegrExpr(), DiffWithRespTo);
                            final String ParaExprB = ParanExpr;
                            final String ParaExprDiffExprB = ParanDiffExpr;
                            b = (() -> ParaExprDiffExprB);
                        }
                        //if(bExprn.contains(DiffWithRespTo+"^")) {
                        String CompltExprn = "";
                        if ((StrIntegr != null) && (posIntegr < StrIntegr.length()) && (startpos < posIntegr)) {
                            CompltExprn = StrIntegr.substring(startpos, posIntegr);
                        } else if ((StrIntegr != null) && (startpos < StrIntegr.length())) {
                            CompltExprn = StrIntegr.substring(startpos);
                        } else {
                            CompltExprn = StrIntegr;
                        }
                        x = ApplyLambdaRulesIntegr("parseExpressionIntegr0", CompltExprn, xExprn, a, bExprn, b, "", "", "+", "SumRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                        xExprn = ApplyLambdaStringIntegr("parseExpressionIntegr0", CompltExprn, xExprn, a, bExprn, b, "", "", "+", "SumRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);

                        log.info("Integr:parseExpressionIntegr:a.IntegrExpr()=" + a.IntegrExpr());
                        log.info("Integr:parseExpressionIntegr:b.IntegrExpr()=" + b.IntegrExpr());
                        log.info("Integr:parseExpressionIntegr:x.IntegrExpr()=" + x.IntegrExpr());
                        log.info("Integr:parseExpressionIntegr:xExprn=" + xExprn);
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            if ((StrIntegr.substring(posIntegr) != null) && (!StrIntegr.substring(posIntegr).equalsIgnoreCase(""))) {
                                System.out.println("Integr:parseExpressionIntegr0:+:Final:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr + " StrIntegr=" + StrIntegr.substring(posIntegr));
                            } else {
                                System.out.println("Integr:parseExpressionIntegr0:Null:+:Final:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                            }
                        }
                    } else if ((eatIntegr('-')) /*&& ((NormalExprnFlag == true) || (NormalNotPareFlag == true) || (ParenthesisFlag == true) || (FuncArgFlag == true))*/) { // subtraction
                        int bstartpos = posIntegr;
                        IntegrExpr a = x, b = parseTermIntegr();
                        int bendpos = posIntegr;
                        String bExprn = "";
                        if ((bstartpos != -1) && (bendpos != -1) && (bstartpos < bendpos) && (bstartpos <= StrIntegr.length()) && (bstartpos < StrIntegr.length()) && (bendpos <= StrIntegr.length())) {
                            bExprn = StrIntegr.substring(bstartpos, bendpos).trim();
                        }
                        log.info("Integr:parseExpressionIntegr:b.IntegrExpr()=" + b.IntegrExpr());
                        if ((IsAConstant(b.IntegrExpr(), DiffWithRespTo)) && (b.IntegrExpr().equalsIgnoreCase(bExprn))) {
                            final String ConstCoeff = bExprn;
                            b = (() -> ConstCoeff + "*" + DiffWithRespTo);
                        } else if ((!b.IntegrExpr().equalsIgnoreCase(bExprn)) && ((b.IntegrExpr().equalsIgnoreCase(DiffWithRespTo)) || (b.IntegrExpr().equalsIgnoreCase("1.0"))))
                            ;//Do Nothing
                        else if ((b.IntegrExpr().equalsIgnoreCase(DiffWithRespTo)) || (b.IntegrExpr().equalsIgnoreCase("1.0"))) {
                            b = (() -> "1.0/2.0*" + DiffWithRespTo + "^2.0");
                        }
                        log.info("Integr:parseExpressionIntegr:a.IntegrExpr()=" + a.IntegrExpr());
                        log.info("Integr:parseExpressionIntegr:b.IntegrExpr()=" + b.IntegrExpr());
                        log.info("Integr:parseExpressionIntegr:x.IntegrExpr()=" + x.IntegrExpr());
                        log.info("Integr:parseExpressionIntegr:xExprn=" + xExprn);
                        if (a.IntegrExpr().contains("Parenthesis")) {
                            Expr_Func_Split_Integr(a.IntegrExpr(), DiffWithRespTo);
                            final String ParaExprA = ParanExpr;
                            final String ParaExprDiffExprA = ParanDiffExpr;
                            a = (() -> ParaExprDiffExprA);
                        }
                        if (b.IntegrExpr().contains("Parenthesis")) {
                            Expr_Func_Split_Integr(b.IntegrExpr(), DiffWithRespTo);
                            final String ParaExprB = ParanExpr;
                            final String ParaExprDiffExprB = ParanDiffExpr;
                            b = (() -> ParaExprDiffExprB);
                        }
                        //if(bExprn.contains(DiffWithRespTo+"^")) {
                        String CompltExprn = StrIntegr.substring(startpos, posIntegr);
                        x = ApplyLambdaRulesIntegr("parseExpressionIntegr0", CompltExprn, xExprn, a, bExprn, b, "", "", "-", "SubtractionRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                        xExprn = ApplyLambdaStringIntegr("parseExpressionIntegr0", CompltExprn, xExprn, a, bExprn, b, "", "", "-", "SubtractionRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);

                        log.info("Integr:parseExpressionIntegr:a.IntegrExpr()=" + a.IntegrExpr());
                        log.info("Integr:parseExpressionIntegr:b.IntegrExpr()=" + b.IntegrExpr());
                        log.info("Integr:parseExpressionIntegr:x.IntegrExpr()=" + x.IntegrExpr());
                        log.info("Integr:parseExpressionIntegr:xExprn=" + xExprn);
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Integr:parseExpressionIntegr0:-:Final:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr + " StrIntegr=" + StrIntegr.substring(posIntegr));
                        }
                    } else if ((chIntegr != -1) && ((chIntegr != '+') || (chIntegr != '-'))) {
                        posIntegr = advanceOneTerm(StrIntegr, posIntegr);
                        if ((posIntegr > -1) && (posIntegr < StrIntegr.length())) {
                            chIntegr = StrIntegr.charAt(posIntegr);
                        } else if ((StrIntegr != null) && (posIntegr == -1)) {
                            posIntegr = StrIntegr.length();
                            chIntegr = -1;
                        } else {
                            posIntegr = -1;
                            chIntegr = -1;
                        }
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Integr:parseExpressionIntegr:advanceOneTerm:One Term Over:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                            System.out.println("Integr:parseExpressionIntegr:advanceOneTerm:One Term Over:xExprn=" + xExprn + " StrIntegr.length()=" + StrIntegr.length());
                        }
                    } else {
                        if ((StrIntegr != null) && (posIntegr < StrIntegr.length())) {
                            ExprEndPos = posIntegr;
                        } else if (StrIntegr != null) {
                            ExprEndPos = StrIntegr.length();
                        }
                        if (ExprStartPos < ExprEndPos) {
                            log.info("Integr:parseExpressionIntegr:Return Value parseExpressionIntegr:x.IntegrExpr()=" + x.IntegrExpr() + " Original Integrand=" + StrIntegr.substring(ExprStartPos, ExprEndPos) + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                        }
                        log.info("Integr:parseExpressionIntegr:Return Value parseExpressionIntegr:xExprn=" + xExprn);
                        ParseLog("Integr", "parseExpressionIntegr", "Initial", "StrIntegr", StrIntegr);
                        final String Temp = xExprn;
                        x = (() -> Temp);
                        ParseLog("Integr", "parseExpressionIntegr", "Final", "StrIntegr", StrIntegr);
                        return x;
                    }
                }
            }

            IntegrExpr parseTermIntegr() {
                log.info("Integr:parseTermIntegr:StrIntegr=" + StrIntegr + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                int TermStartPos = posIntegr;
                int TermEndPos = -1;
                int startpos = posIntegr;
                DiffTermOperator = -1;
                LADiffFactorOperator = -1;
                GotExpntNumFlag = false;
                IntegrExpr a = (() -> "");
                IntegrExpr b = (() -> "");
                IntegrExpr c = (() -> "");
                IntegrExpr x = (() -> "");
                int astartpos = posIntegr;
                x = parseFactorIntegr();
                c = x;
                int endpos = posIntegr;
                String OutputExprn = "";
                String MappedProduct = "";
                String aMappedProduct = "";
                String aOrginIntegr = "";
                String bOrginIntegr = "";
                String xExprn = "";

                String xConst = "";
                OutputExprn = x.IntegrExpr();
                log.info("Integr:parseTermIntegr:After Initial Call to FactorDiff:OutputExprn=" + OutputExprn);
                log.info("Integr:parseTermIntegr:After Initial Call to FactorDiff:xExprn=" + xExprn + " StrIntegr.length()=" + StrIntegr.length());
                log.info("Integr:parseTermIntegr:After Initial Call to FactorDiff:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr + " chIntegr=" + chIntegr);
                if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                    System.out.println("Integr:parseTermIntegr::After Initial Call to FactorDiff:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                }
                int aendpos = posIntegr;
                if ((astartpos != -1) && (astartpos < aendpos) && (astartpos <= StrIntegr.length()) && (astartpos < StrIntegr.length()) && (aendpos < StrIntegr.length())) {
                    aOrginIntegr = StrIntegr.substring(astartpos, aendpos);
                }
                if ((posIntegr == StrIntegr.length()) && (chIntegr == -1)) {
                    final String OutputExprn1 = OutputExprn;
                    x = (() -> OutputExprn1);
                    log.info("Integr:parseTermIntegr:Last Term:Return Value parseTermDiff:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                    if (TermStartPos < TermEndPos) {
                        log.info(":Last Term:Original Integrand=" + StrIntegr.substring(TermStartPos, TermEndPos));
                    }
                    log.info("Integr:parseTermIntegr:Last Term:Return Value parseTermDiff:xExprn=" + xExprn);
                    return x;
                } else if ((xConst.equalsIgnoreCase("")) && (!x.IntegrExpr().equalsIgnoreCase("")) && (!x.IntegrExpr().equalsIgnoreCase("0.0")) && (!OutputExprn.equalsIgnoreCase("1.0")) && (!x.IntegrExpr().equalsIgnoreCase("1.0"))) {
                    if ((!xExprn.equalsIgnoreCase("")) && (!aMappedProduct.equalsIgnoreCase("")) && (!xExprn.equalsIgnoreCase(DiffWithRespTo)) && (!aMappedProduct.equalsIgnoreCase(DiffWithRespTo))) {
                        aMappedProduct = xExprn;
                    }
                    log.info("Integr:parseTermIntegr:Original Integrand:xExprn=" + xExprn + " aMappedProduct=" + aMappedProduct + " aOrginIntegr=" + aOrginIntegr);
                    String CompltExprn = "";
                    if ((StrIntegr != null) && (startpos < posIntegr) && (posIntegr < StrIntegr.length())) {
                        CompltExprn = StrIntegr.substring(startpos, posIntegr);
                    } else if ((StrIntegr != null) && (startpos < StrIntegr.length())) {
                        CompltExprn = StrIntegr.substring(startpos);
                    } else {
                        CompltExprn = StrIntegr;
                    }
                    x = ApplyLambdaRulesIntegr("parseTermIntegr001", CompltExprn, OutputExprn, x, x.IntegrExpr(), x, "", aOrginIntegr, "*", "NoExponentRuleDiff", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                    xExprn = ApplyLambdaStringIntegr("parseTermIntegr001", CompltExprn, OutputExprn, c, c.IntegrExpr(), c, "", aOrginIntegr, "*", "NoExponentRuleDiff", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                } else if ((xConst.equalsIgnoreCase(OutputExprn)) && (!x.IntegrExpr().equalsIgnoreCase("")) && (!x.IntegrExpr().equalsIgnoreCase("0.0")) && (!OutputExprn.equalsIgnoreCase("1.0")) && (!x.IntegrExpr().equalsIgnoreCase("1.0"))) {
                    aMappedProduct = xExprn;
                    String CompltExprn = StrIntegr.substring(startpos, posIntegr);
                    x = ApplyLambdaRulesIntegr("parseTermIntegr002", CompltExprn, OutputExprn, x, x.IntegrExpr(), x, "", "", "*", "NoExponentRuleTerm", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                    xExprn = ApplyLambdaStringIntegr("parseTermIntegr002", CompltExprn, OutputExprn, c, c.IntegrExpr(), c, "", "", "*", "NoExponentRuleTerm", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                } else if ((!x.IntegrExpr().equalsIgnoreCase("")) && (!x.IntegrExpr().equalsIgnoreCase("0.0"))) {
                    aMappedProduct = xExprn;
                    String CompltExprn = StrIntegr.substring(startpos, posIntegr);
                    x = ApplyLambdaRulesIntegr("parseTermIntegr003", CompltExprn, OutputExprn, x, x.IntegrExpr(), x, "", "", "*", "CoeffExponentRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                    xExprn = ApplyLambdaStringIntegr("parseTermIntegr003", CompltExprn, OutputExprn, c, c.IntegrExpr(), c, "", "", "*", "CoeffExponentRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                } else if (x.IntegrExpr().equalsIgnoreCase("1.0")) {
                    aMappedProduct = xExprn;
                    xExprn = "1.0";
                } else if (x.IntegrExpr().equalsIgnoreCase("0.0")) {
                    aMappedProduct = xExprn;
                    xExprn = "0.0";
                } else if ((x.IntegrExpr().equalsIgnoreCase("")) && (!IsAConstant(xExprn, DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("Unknown")))) {
                    aMappedProduct = xExprn;
                    String CompltExprn = StrIntegr.substring(startpos, posIntegr);
                    x = ApplyLambdaRulesIntegr("parseTermIntegrInit", CompltExprn, xExprn, x, x.IntegrExpr(), x, "", "", "*", "ConstantRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                    xExprn = ApplyLambdaStringIntegr("parseTermIntegrInit", CompltExprn, OutputExprn, c, c.IntegrExpr(), c, "", "", "*", "ConstantRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                    log.info("Integr:parseTermIntegr:parseTermIntegrInit:x.IntegrExpr()=" + x.IntegrExpr());
                    log.info("Integr:parseTermIntegr:parseTermIntegrInit:xExprn=" + xExprn);

                }
                log.info("Integr:parseTermIntegr:After Co-efficient:x.IntegrExpr()=" + x.IntegrExpr());
                log.info("Integr:parseTermIntegr:After Co-efficient:xExprn=" + xExprn);
                log.info("Integr:parseTermIntegr:After Co-efficient:aMappedProduct=" + aMappedProduct);
                for (;;) {
                    if (eatIntegr('*')) { // multiplication
                        log.info("Integr:parseTermIntegr:Multiply:Entered" + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Integr:parseTermIntegr:Multiply:Entered" + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr + " StrIntegr=" + StrIntegr.substring(posIntegr));
                        }
                        if (DiffTermOperator == -1) {
                            DiffTermOperator = '*';
                        } else if (DiffTermOperator == '/') {
                            DiffTermOperator = '*';
                        }
                        log.info("Integr:parseTermIntegr:Multiply:OutputExprn=" + OutputExprn);
                        log.info("Integr:parseTermIntegr:Multiply:x.IntegrExpr()=" + x.IntegrExpr() + " DiffTermOperator=" + (char) DiffTermOperator);
                        int bstartpos = posIntegr;
                        a = x;
                        b = parseFactorIntegr();
                        int bendpos = posIntegr;
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Integr:parseTermIntegr:Multiply:After b:Before:bOrginIntegr=" + bOrginIntegr + " bstartpos=" + bstartpos + " bendpos=" + bendpos + " StrIntegr.length()=" + StrIntegr.length());
                        }
                        if ((bstartpos != -1) && (bstartpos < bendpos) && (bstartpos <= StrIntegr.length()) && (bstartpos < StrIntegr.length()) && (bendpos <= StrIntegr.length())) {
                            MappedProduct = StrIntegr.substring(bstartpos, bendpos);
                            bOrginIntegr = MappedProduct;
                            if ((!FuncName.equalsIgnoreCase("")) && (bOrginIntegr.equalsIgnoreCase(FuncName))) {
                                bOrginIntegr = FuncName + "(" + FactorsExpr + ")";
                            }
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Integr:parseTermIntegr:Multiply:After b:bOrginIntegr=" + bOrginIntegr);
                            }
                        }
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Integr:parseTermIntegr:Multiply:After b:b.IntegrExpr()=" + b.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr + " StrIntegr=" + StrIntegr.substring(posIntegr));
                        }
                        if (!b.IntegrExpr().contains("@Parenthesis@")) {
                            OutputExprn = b.IntegrExpr();
                        } else if (b.IntegrExpr().contains("@Parenthesis@")) {
                            String[] MyTemp = b.IntegrExpr().split("@Parenthesis@");
                            if (MyTemp.length > 1) {
                                OutputExprn = MyTemp[1];
                            }
                        }
                        if ((((b.IntegrExpr() == null)) || (b.IntegrExpr().equalsIgnoreCase("")) || (b.IntegrExpr().equalsIgnoreCase("0.0"))) && ((OutputExprn == null) || (OutputExprn.equalsIgnoreCase("")))) {
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Entered FSM 1:parseTermIntegr01");
                            }
                            String CompltExprn = StrIntegr.substring(startpos, posIntegr);
                            x = ApplyLambdaRulesIntegr("parseTermIntegr01", CompltExprn, OutputExprn, a, a.IntegrExpr(), b, "", "", "*", "ConstantRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            xExprn = ApplyLambdaStringIntegr("parseTermIntegr01", CompltExprn, OutputExprn, a, a.IntegrExpr(), b, "", "", "+", "ConstantRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            if ((!MappedProduct.equalsIgnoreCase("")) && (!MappedProduct.equalsIgnoreCase("1.0"))) {
                                aMappedProduct = aMappedProduct + "*" + MappedProduct;
                            }
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Exit FSM 1:parseTermIntegr01:x.IntegrExpr()=" + x.IntegrExpr());
                            }
                        } else if (xConst.equalsIgnoreCase(OutputExprn)) {
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Entered FSM 2:parseTermIntegr10");
                            }
                            String CompltExprn = StrIntegr.substring(startpos, posIntegr);
                            x = ApplyLambdaRulesIntegr("parseTermIntegr10", CompltExprn, OutputExprn, a, b.IntegrExpr(), b, "", "", "*", "ConstantRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            xExprn = ApplyLambdaStringIntegr("parseTermIntegr10", CompltExprn, OutputExprn, a, b.IntegrExpr(), b, "", "", "*", "ConstantRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            if ((!MappedProduct.equalsIgnoreCase("")) && (!MappedProduct.equalsIgnoreCase("1.0"))) {
                                aMappedProduct = aMappedProduct + "*" + MappedProduct;
                            }
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Exit FSM 2:parseTermIntegr10:x.IntegrExpr()=" + x.IntegrExpr());
                            }
                        } else if (b.IntegrExpr().contains("@Parenthesis@")) {
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Entered FSM 3:");
                            }
                            if ((!IsAConstant(MyParenDecodedSep, DiffWithRespTo))
                                    & ((StrIsAConstant.equalsIgnoreCase("IndConstantExpression"))
                                    || (StrIsAConstant.equalsIgnoreCase("VarExpression"))
                                    || (StrIsAConstant.equalsIgnoreCase("Expression")))) {
                                if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Entered FSM 3:Inner:StrIsAConstant=" + StrIsAConstant);
                                }
                                if (MyParenDecodedSep.contains(DiffWithRespTo)) {
                                    if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("Entered FSM 3.1:parseTermIntegr21");
                                    }

                                    String CompltExprn = "";
                                    if ((startpos < posIntegr) && (posIntegr < StrIntegr.length())) {
                                        CompltExprn = StrIntegr.substring(startpos, posIntegr);
                                    } else if (startpos < StrIntegr.length()) {
                                        CompltExprn = StrIntegr.substring(startpos);
                                    } else {
                                        CompltExprn = StrIntegr;
                                    }
                                    x = ApplyLambdaRulesIntegr("parseTermIntegr21", CompltExprn, MyParenEncodedSep, a, MappedProduct, b, bOrginIntegr, aOrginIntegr, "*", "IntegrationByParts", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                                    xExprn = ApplyLambdaStringIntegr("parseTermIntegr21", CompltExprn, MyParenEncodedSep, a, MappedProduct, b, bOrginIntegr, aOrginIntegr, "*", "IntegrationByParts", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                                    if ((!MappedProduct.equalsIgnoreCase("")) && (!MappedProduct.equalsIgnoreCase("1.0"))) {
                                        aMappedProduct = aMappedProduct + "*" + MappedProduct;
                                    }
                                    if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("Exit FSM 3.1:parseTermIntegr21:x.IntegrExpr()=" + x.IntegrExpr());
                                    }
                                } else {
                                    if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("Entered FSM 3.2:parseTermIntegr11");
                                    }
                                    String CompltExprn = StrIntegr.substring(startpos, posIntegr);
                                    x = ApplyLambdaRulesIntegr("parseTermIntegr11", CompltExprn, MyParenDecodedSep, a, MappedProduct, b, bOrginIntegr, aOrginIntegr, "*", "ProductRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                                    xExprn = ApplyLambdaStringIntegr("parseTermIntegr11", CompltExprn, MyParenDecodedSep, a, MappedProduct, b, bOrginIntegr, aOrginIntegr, "*", "ProductRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                                    if ((!MappedProduct.equalsIgnoreCase("")) && (!MappedProduct.equalsIgnoreCase("1.0"))) {
                                        aMappedProduct = aMappedProduct + "*" + MappedProduct;
                                    }
                                    if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("Exit FSM 3.2:parseTermIntegr11:x.IntegrExpr()=" + x.IntegrExpr());
                                    }
                                }
                            }
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Exit FSM 3:x.IntegrExpr()=" + x.IntegrExpr());
                            }
                        } else if (((a.IntegrExpr().contains(DiffWithRespTo)) && (b.IntegrExpr().contains(DiffWithRespTo))) && ((!a.IntegrExpr().contains("\\(")) && (!b.IntegrExpr().contains("\\(")))) {
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Entered FSM 4:parseTermIntegr14");
                            }
                            String CompltExprn = StrIntegr.substring(startpos, posIntegr);
                            if ((!FuncName.equalsIgnoreCase("")) && (CompltExprn.endsWith(FuncName))) {
                                CompltExprn = CompltExprn + "(" + FactorsExpr + ")";
                            }
                            if (DiffWithRespTo.equalsIgnoreCase(a.IntegrExpr())) {
                                a = (() -> "1.0");
                                x = ApplyLambdaRulesIntegr("parseTermIntegr23", CompltExprn, OutputExprn, a, MappedProduct, b, bOrginIntegr, aOrginIntegr, "*", "IntegrationByParts", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                                xExprn = ApplyLambdaStringIntegr("parseTermIntegr23", CompltExprn, OutputExprn, a, MappedProduct, b, bOrginIntegr, aOrginIntegr, "*", "IntegrationByParts", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                                if ((!MappedProduct.equalsIgnoreCase("")) && (!MappedProduct.equalsIgnoreCase("1.0"))) {
                                    aMappedProduct = aMappedProduct + "*" + MappedProduct;
                                }
                            } else {
                                x = ApplyLambdaRulesIntegr("parseTermIntegr14", CompltExprn, OutputExprn, a, MappedProduct, b, bOrginIntegr, aOrginIntegr, "*", "IntegrationByParts", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                                xExprn = ApplyLambdaStringIntegr("parseTermIntegr14", CompltExprn, OutputExprn, a, MappedProduct, b, bOrginIntegr, aOrginIntegr, "*", "IntegrationByParts", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                                if ((!MappedProduct.equalsIgnoreCase("")) && (!MappedProduct.equalsIgnoreCase("1.0"))) {
                                    aMappedProduct = aMappedProduct + "*" + MappedProduct;
                                }
                            }
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Exit FSM 4:parseTermIntegr14:x.IntegrExpr()=" + x.IntegrExpr());
                            }
                        } else if ((a.IntegrExpr().contains(DiffWithRespTo)) && (b.IntegrExpr().contains(DiffWithRespTo))) {
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Entered FSM 5:parseTermIntegr20");
                            }
                            if (b.IntegrExpr().contains(DiffWithRespTo)) {
                                String CompltExprn = StrIntegr.substring(startpos, posIntegr);
                                x = ApplyLambdaRulesIntegr("parseTermIntegr20", CompltExprn, OutputExprn, a, MappedProduct, b, "", aOrginIntegr, "*", "IntegrationByParts", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                                xExprn = ApplyLambdaStringIntegr("parseTermIntegr20", CompltExprn, OutputExprn, a, MappedProduct, b, "", aOrginIntegr, "*", "IntegrationByParts", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                                if ((!MappedProduct.equalsIgnoreCase("")) && (!MappedProduct.equalsIgnoreCase("1.0"))) {
                                    aMappedProduct = aMappedProduct + "*" + MappedProduct;
                                }
                            } else if (((a.IntegrExpr().contains(DiffWithRespTo)) && (b.IntegrExpr().contains(DiffWithRespTo))) && ((!a.IntegrExpr().contains("\\(")) && (!b.IntegrExpr().contains("\\(")))) {
                                String CompltExprn = StrIntegr.substring(startpos, posIntegr);
                                x = ApplyLambdaRulesIntegr("parseTermIntegr21", CompltExprn, OutputExprn, a, MappedProduct, b, bOrginIntegr, aOrginIntegr, "*", "IntegrationByParts", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                                xExprn = ApplyLambdaStringIntegr("parseTermIntegr21", CompltExprn, OutputExprn, a, MappedProduct, b, bOrginIntegr, aOrginIntegr, "*", "IntegrationByParts", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                                if ((!MappedProduct.equalsIgnoreCase("")) && (!MappedProduct.equalsIgnoreCase("1.0"))) {
                                    aMappedProduct = aMappedProduct + "*" + MappedProduct;
                                }
                            }
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Exit FSM 5:parseTermIntegr20:x.IntegrExpr()=" + x.IntegrExpr());
                            }
                        } else if ((!aMappedProduct.contains(DiffWithRespTo)) && (MappedProduct.contains(DiffWithRespTo)) && (!MappedProduct.equalsIgnoreCase(DiffWithRespTo))) {
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Entered FSM 6:parseTermIntegr12");
                            }
                            String CompltExprn = StrIntegr.substring(startpos, posIntegr);
                            x = ApplyLambdaRulesIntegr("parseTermIntegr12", CompltExprn, aMappedProduct, a, b.IntegrExpr(), b, "", "", "*", "ProductRule", DiffWithRespTo, LADiffIndConstOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            xExprn = ApplyLambdaStringIntegr("parseTermIntegr12", CompltExprn, aMappedProduct, a, b.IntegrExpr(), b, "", "", "*", "ProductRule", DiffWithRespTo, LADiffIndConstOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            if ((!MappedProduct.equalsIgnoreCase("")) && (!MappedProduct.equalsIgnoreCase("1.0"))) {
                                aMappedProduct = aMappedProduct + "*" + MappedProduct;
                            }
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Exit FSM 5:parseTermIntegr12:x.IntegrExpr()=" + x.IntegrExpr());
                            }
                        } else {
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Entered FSM 7:else:parseTermIntegr13");
                            }
                            String CompltExprn = StrIntegr.substring(startpos, posIntegr);
                            x = ApplyLambdaRulesIntegr("parseTermIntegr13", CompltExprn, OutputExprn, a, a.IntegrExpr(), b, aMappedProduct, "", "*", "ConstantRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            xExprn = ApplyLambdaStringIntegr("parseTermIntegr13", CompltExprn, OutputExprn, a, a.IntegrExpr(), b, aMappedProduct, "", "*", "ConstantRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            if ((!MappedProduct.equalsIgnoreCase("")) && (!MappedProduct.equalsIgnoreCase("1.0"))) {
                                aMappedProduct = aMappedProduct + "*" + MappedProduct;
                            }
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Exit FSM 7:parseTermIntegr13:x.IntegrExpr()=" + x.IntegrExpr());
                            }
                        }
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            //System.out.println("Integr:parseTermIntegr:Multiply:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr + " StrIntegr=" + StrIntegr.substring(posIntegr));
                        }
                    } else if (eatIntegr('/')) { // division
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Integr:parseTermIntegr:Divide:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr + " StrIntegr=" + StrIntegr.substring(posIntegr));
                        }
                        if (DiffTermOperator == -1) {
                            DiffTermOperator = '/';
                        } else if (DiffTermOperator == '*') {
                            DiffTermOperator = '/';
                        }
                        log.info("Integr:parseTermIntegr:Divide:OutputExprn=" + OutputExprn + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                        log.info("Integr:parseTermIntegr:Divide:x.IntegrExpr()=" + x.IntegrExpr() + " DiffTermOperator=" + (char) DiffTermOperator);
                        int bstartpos = posIntegr;
                        a = x;
                        b = parseFactorIntegr();
                        int bendpos = posIntegr;
                        if ((bstartpos != -1) && (bstartpos < bendpos) && (bstartpos <= StrIntegr.length()) && (bstartpos < StrIntegr.length()) && (bendpos < StrIntegr.length())) {
                            MappedProduct = StrIntegr.substring(bstartpos, bendpos);
                        }
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Integr:parseTermIntegr:Divide:After b:b.IntegrExpr()=" + b.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr + " StrIntegr=" + StrIntegr.substring(posIntegr));
                        }
                        OutputExprn = b.IntegrExpr();
                        if (((b.IntegrExpr() == null) || (b.IntegrExpr().equalsIgnoreCase("0.0"))) && ((OutputExprn == null) || (OutputExprn.equalsIgnoreCase("")))) {
                            String CompltExprn = StrIntegr.substring(startpos, posIntegr);
                            x = ApplyLambdaRulesIntegr("parseTermIntegr01", CompltExprn, OutputExprn, a, a.IntegrExpr(), b, "", "", "/", "ConstantRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            xExprn = ApplyLambdaStringIntegr("parseTermIntegr01", CompltExprn, OutputExprn, a, a.IntegrExpr(), b, "", "", "/", "ConstantRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            if ((!MappedProduct.equalsIgnoreCase("")) && (!MappedProduct.equalsIgnoreCase("1.0"))) {
                                aMappedProduct = aMappedProduct + "/" + MappedProduct;
                            }
                        } else if (xConst.equalsIgnoreCase(OutputExprn)) {
                            String CompltExprn = StrIntegr.substring(startpos, posIntegr);
                            x = ApplyLambdaRulesIntegr("parseTermIntegr10", CompltExprn, OutputExprn, a, b.IntegrExpr(), b, "", "", "/", "ConstantRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            xExprn = ApplyLambdaStringIntegr("parseTermIntegr10", CompltExprn, OutputExprn, a, b.IntegrExpr(), b, "", "", "/", "ConstantRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            if ((!MappedProduct.equalsIgnoreCase("")) && (!MappedProduct.equalsIgnoreCase("1.0"))) {
                                aMappedProduct = aMappedProduct + "/" + MappedProduct;
                            }
                        } else if ((a.IntegrExpr().contains("Parenthesis")) || (b.IntegrExpr().contains("Parenthesis"))) {
                            String CompltExprn = StrIntegr.substring(startpos, posIntegr);
                            x = ApplyLambdaRulesIntegr("parseTermIntegr11", CompltExprn, OutputExprn, a, MappedProduct, b, "", "", "/", "MappedQuotientRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            xExprn = ApplyLambdaStringIntegr("parseTermIntegr11", CompltExprn, OutputExprn, a, MappedProduct, b, "", "", "/", "MappedQuotientRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            if ((!MappedProduct.equalsIgnoreCase("")) && (!MappedProduct.equalsIgnoreCase("1.0"))) {
                                aMappedProduct = aMappedProduct + "/" + MappedProduct;
                            }
                        } else if ((!aMappedProduct.contains(DiffWithRespTo)) && (MappedProduct.contains(DiffWithRespTo)) && (!MappedProduct.equalsIgnoreCase(DiffWithRespTo))) {
                            String CompltExprn = StrIntegr.substring(startpos, posIntegr);
                            x = ApplyLambdaRulesIntegr("parseTermIntegr12", CompltExprn, aMappedProduct, a, b.IntegrExpr(), b, "", "", "/", "QuotientRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            xExprn = ApplyLambdaStringIntegr("parseTermIntegr12", CompltExprn, aMappedProduct, a, b.IntegrExpr(), b, "", "", "/", "QuotientRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            if ((!MappedProduct.equalsIgnoreCase("")) && (!MappedProduct.equalsIgnoreCase("1.0"))) {
                                aMappedProduct = aMappedProduct + "*" + MappedProduct;
                            }
                        } else {
                            String CompltExprn = StrIntegr.substring(startpos, posIntegr);
                            x = ApplyLambdaRulesIntegr("parseTermIntegr13", CompltExprn, OutputExprn, a, a.IntegrExpr(), b, aMappedProduct, "", "/", "ConstantRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            xExprn = ApplyLambdaStringIntegr("parseTermIntegr13", CompltExprn, OutputExprn, a, a.IntegrExpr(), b, aMappedProduct, "", "/", "ConstantRule", DiffWithRespTo, DiffTermOperator, "LowLevelRules", MapType, IntegrORDiffr);
                            if ((!MappedProduct.equalsIgnoreCase("")) && (!MappedProduct.equalsIgnoreCase("1.0"))) {
                                aMappedProduct = aMappedProduct + "/" + MappedProduct;
                            }
                        }

                        log.info("Integr:parseTermIntegr:Divide:x.IntegrExpr()=" + x.IntegrExpr() + " DiffTermOperator=" + (char) DiffTermOperator);
                        log.info("Integr:parseTermIntegr:Divide:xExprn=" + xExprn);
                        log.info("Integr:parseTermIntegr:Divide:aMappedProduct=" + aMappedProduct);
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Integr:parseTermIntegr:Divide:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                        }
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Integr:parseTermIntegr:Final:Divide:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr + " StrIntegr=" + StrIntegr.substring(posIntegr));
                        }
                    } else {
                        if ((StrIntegr != null) && (posIntegr < StrIntegr.length())) {
                            TermEndPos = posIntegr;
                        } else if (StrIntegr != null) {
                            TermEndPos = StrIntegr.length();
                        }
                        log.info("Integr:parseTermIntegr:Return Value parseTermDiff:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                        if (TermStartPos < TermEndPos) {
                            log.info(" Original Integrand=" + StrIntegr.substring(TermStartPos, TermEndPos));
                        }
                        log.info("Integr:parseTermIntegr:Return Value parseTermDiff:xExprn=" + xExprn);
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            //System.out.println("Integr:parseTermIntegr:Return Value:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr + " StrIntegr=" + StrIntegr.substring(posIntegr));
                        }
                        return x;
                    }
                }
            }

            IntegrExpr parseFactorIntegr() {
                log.info("Integr:parseFactorIntegr:StrIntegr=" + StrIntegr + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                    System.out.println("Integr:parseFactorIntegr:StrIntegr=" + StrIntegr + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                }
                int StartPos = posIntegr;
                int aStartPos = -1;
                int bStartPos = -1;
                int FactorStartPos = posIntegr;
                int FactorEndPos = -1;
                String Exprn = "";

                IntegrExpr x = parseBaseIntegr();
                if (aStartPos == -1) {
                    aStartPos = StartPos;
                }
                log.info("Integr:parseFactorIntegr:Initial:x.IntegrExpr()=" + x.IntegrExpr());
                if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                    System.out.println("Integr:parseFactorIntegr: After Initial:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr + " StrIntegr=" + StrIntegr.substring(posIntegr));
                }
                Split_Integr(x.IntegrExpr(), DiffWithRespTo);
                Expr_Func_Split_Integr(x.IntegrExpr(), DiffWithRespTo);
                if (x.IntegrExpr().contains("@Function@")) {
                    if ((FunctionExpr.equalsIgnoreCase("")) && (!FactorsExpr.equalsIgnoreCase("")) && (IsAConstant(FactorsExpr, DiffWithRespTo))) {
                        x = (() -> FunctionExpr);
                        Exprn = FunctionExpr;
                        log.info("Integr:parseFactorIntegr:@Function@:FunctionExpr=" + FunctionExpr);
                        log.info("Integr:parseFactorIntegr:@Function@:x.IntegrExpr()=" + x.IntegrExpr());
                        log.info("Integr:parseFactorIntegr:@Function@:Exprn=" + Exprn);

                    } else if ((FunctionDiffExpr != null) && (!FunctionDiffExpr.equalsIgnoreCase(""))) {
                        x = (() -> FunctionDiffExpr);
                        Exprn = FunctionDiffExpr;
                        log.info("Integr:parseFactorIntegr:@Function@:FunctionDiffExpr=" + FunctionDiffExpr);
                        log.info("Integr:parseFactorIntegr:@Function@:x.IntegrExpr()=" + x.IntegrExpr());
                        log.info("Integr:parseFactorIntegr:@Function@:Exprn=" + Exprn);
                    } else {
                        x = (() -> "Unknown");
                        Exprn = "Unknown";
                        log.info("Integr:parseFactorIntegr:@Function@:x.IntegrExpr()=" + x.IntegrExpr());
                        log.info("Integr:parseFactorIntegr:@Function@:Exprn=" + Exprn);

                    }
                    log.info("Integr:parseFactorIntegr:@Function@:x.IntegrExpr()=" + x.IntegrExpr());
                    log.info("Integr:parseFactorIntegr:@Function@:Exprn=" + Exprn);
                } else if (x.IntegrExpr().contains("@Polynomial@")) {
                    x = (() -> FactorsExpr);
                    Exprn = FactorsExpr;
                } else if (x.IntegrExpr().contains("@Factor@")) {
                    //Integral of x alone
                    x = (() -> "1.0/2.0*" + FactorsExpr);
                    Exprn = "1.0/2.0*" + FactorsExpr;
                } else if (x.IntegrExpr().contains("@IndependentFactor@")) {
                    String TempIndConsExpr = FactorsExpr;
                    String TempIndConstant = FactorsExpr;
                    log.info("Integr:parseFactorIntegr:Initial Call:TempIndConsExpr=" + TempIndConsExpr);
                    log.info("Integr:parseFactorIntegr:Initial Call:TempIndConstant=" + TempIndConstant);
                    log.info("Integr:parseFactorIntegr:Initial Call:FactorsDiffExpr=" + FactorsDiffExpr);
                    if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                        System.out.println("Integr:parseFactorIntegr:Initial Call:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                    }
                    x = (() -> FactorsExpr);
                    Exprn = FactorsExpr;
                } else if (x.IntegrExpr().contains("@ExtremityFactor@")) {
                    String TempIndConsExpr = FactorsExpr;
                    String TempIndConstant = FactorsExpr;
                    log.info("Integr:parseFactorIntegr:Initial Call:TempIndConsExpr=" + TempIndConsExpr);
                    log.info("Integr:parseFactorIntegr:Initial Call:TempIndConstant=" + TempIndConstant);
                    log.info("Integr:parseFactorIntegr:Initial Call:FactorsDiffExpr=" + FactorsDiffExpr);
                    x = (() -> FactorsExpr);
                    Exprn = FactorsExpr;
                } else if ((x.IntegrExpr().contains("@Constant@")) && ((chIntegr == -1) || (chIntegr == ')'))) {
                    x = (() -> FactorsExpr);
                    Exprn = FactorsExpr;
                } else if (x.IntegrExpr().contains("@Constant@")) {
                    x = (() -> FactorsExpr);
                    Exprn = FactorsExpr;
                }
                log.info("Integr:parseFactorIntegr:Initial Call:x.IntegrExpr()=" + x.IntegrExpr());
                log.info("Integr:parseFactorIntegr:Initial Call:Exprn=" + Exprn);
                for (;;) {
                    int aEndPos = posIntegr;
                    int bHighLvlMappos = 0;
                    if (eatIntegr('^')) { // exponentiation
                        GotExpntNumFlag = true;
                        if (bStartPos == -1) {
                            bStartPos = posIntegr;
                        }
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Integr:parseFactorIntegr:^:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr + " StrIntegr=" + StrIntegr.substring(posIntegr));
                        }
                        IntegrExpr a = x, b = parseBaseIntegr();
                        int bEndPos = posIntegr;
                        GotExpntNumFlag = false;
                        FactorsExpr = "";
                        FactorsDiffExpr = "";
                        log.info("Integr:parseFactorIntegr:Loop:aStartPos=" + aStartPos + " aEndPos=" + aEndPos);
                        log.info("Integr:parseFactorIntegr:Loop:bStartPos=" + bStartPos + " bEndPos=" + bEndPos);
                        if (bStartPos > bEndPos) {
                            log.info("Integr:parseFactorIntegr:Loop:bExprn(bStartPos)=" + StrIntegr.substring(bStartPos));
                            log.info("Integr:parseFactorIntegr:Loop:bExprn(bEndPos)=" + StrIntegr.substring(bEndPos));
                            bHighLvlMappos = bStartPos;
                            bStartPos = bEndPos;
                        }
                        log.info("Integr:parseFactorIntegr:Loop:b.IntegrExpr()=" + b.IntegrExpr() + " a.IntegrExpr()=" + a.IntegrExpr() + " SavedOperator=" + (char) SavedOperator);
                        log.info("Integr:parseFactorIntegr:Loop:Exprn=" + Exprn);
                        log.info("Integr:parseFactorIntegr:Loop:aExprn=" + StrIntegr.substring(aStartPos, aEndPos));
                        log.info("Integr:parseFactorIntegr:Loop:bExprn=" + StrIntegr.substring(bStartPos, bEndPos));
                        //Copied from LADiffConst
                        if ((IsAConstant(StrIntegr.substring(aStartPos, aEndPos), DiffWithRespTo))
                                && (IsAConstant(StrIntegr.substring(bStartPos, bEndPos), DiffWithRespTo))) {
                            // 2^3
                            //x = (() -> "" + (Math.pow(Double.parseDouble(a.eval()), Double.parseDouble(b.eval()))));
                            log.info("Integr:parseFactorIntegr:2^3:aExprn=" + StrIntegr.substring(aStartPos, aEndPos));
                            log.info("Integr:parseFactorIntegr:2^3:bExprn=" + StrIntegr.substring(bStartPos, bEndPos));
                            if (b.IntegrExpr().contains("@Constant@")) {
                                //(IsAConstant(x.IntegrExpr(),DiffWithRespTo)) 
                                log.info("Integr:parseFactorIntegr:Exponential Constant:Exprn=" + Exprn + " x.IntegrExpr()=" + x.IntegrExpr());
                                Split_Integr(b.IntegrExpr(), DiffWithRespTo);
                                log.info("Integr:parseFactorIntegr:Loop:FactorsExpr=" + FactorsExpr + " FactorsDiffExpr=" + FactorsDiffExpr + " DiffTermOperator=" + (char) DiffTermOperator);
                                String Temp = "";

                                if (DiffTermOperator == -1) {
                                    Temp = "1.0/" + (Double.parseDouble(FactorsExpr) + 1.0) + "*" + DiffWithRespTo + "^" + (Double.parseDouble(FactorsExpr) + 1.0);
                                } else {
                                    Temp = "1.0/" + (Double.parseDouble(FactorsExpr) + 1.0) + (char) DiffTermOperator + DiffWithRespTo + "^" + (Double.parseDouble(FactorsExpr) + 1.0);
                                }
                                log.info("Integr:parseFactorIntegr:Temp=" + Temp + " FactorsExpr=" + FactorsExpr + " DiffTermOperator=" + (char) DiffTermOperator);
                                final String MyTerm = Temp;
                                x = (() -> MyTerm);
                                Exprn = MyTerm;
                            }
                            log.info("Integr:parseFactorIntegr:x.IntegrExpr()=" + x.IntegrExpr() + " DiffTermOperator=" + (char) DiffTermOperator);
                            log.info("Integr:parseFactorIntegr:Exprn=" + Exprn);
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Integr:parseFactorIntegr:2^3:^:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                            }
                        } else if ((IsAConstant(StrIntegr.substring(aStartPos, aEndPos), DiffWithRespTo))
                                && (!IsAConstant(StrIntegr.substring(bStartPos, bEndPos), DiffWithRespTo))
                                && (StrIsAConstant.equalsIgnoreCase("IndConstant"))) {
                            // 2^a
                            final String aExprn = StrIntegr.substring(aStartPos, aEndPos);
                            final String bExprn = StrIntegr.substring(bStartPos, bEndPos);
                            x = (() -> aExprn + "^" + bExprn);
                            log.info("Integr:parseFactorIntegr:2^a:aExprn=" + StrIntegr.substring(aStartPos, aEndPos));
                            log.info("Integr:parseFactorIntegr:2^a:bExprn=" + StrIntegr.substring(bStartPos, bEndPos));
                            if (variables.containsKey(StrIntegr.substring(bStartPos, bEndPos))) {//Is a valid Independent Constant
                                log.info("Integr:parseFactorIntegr:Independent Variables:Exprn=" + Exprn + " SavedOperator=" + (char) SavedOperator);
//                                if ((SavedOperator == '+') || (SavedOperator == '-')) {
//                                    x = (() -> "0.0");
//                                    Exprn = "0.0";
//                                } else if ((SavedOperator == '*') || (SavedOperator == '/')) {
//                                    Split_Integr(b.IntegrExpr(), DiffWithRespTo);
//                                    final String MyTerm = Exprn + "^" + FactorsExpr;
//                                    x = (() -> MyTerm);
//                                    Exprn = MyTerm;
//                                }
                            }
                            log.info("Integr:parseFactorIntegr:x.IntegrExpr()=" + x.IntegrExpr() + " DiffTermOperator=" + (char) DiffTermOperator);
                            log.info("Integr:parseFactorIntegr:Exprn=" + Exprn);
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Integr:parseFactorIntegr:2^a:^:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                            }
                        } else if ((IsAConstant(StrIntegr.substring(aStartPos, aEndPos), DiffWithRespTo))
                                && (!IsAConstant(StrIntegr.substring(bStartPos, bEndPos), DiffWithRespTo))
                                && (StrIsAConstant.equalsIgnoreCase("Var"))) {
                            // 2^x
                            final String aExprn = StrIntegr.substring(aStartPos, aEndPos);
                            final String bExprn = StrIntegr.substring(bStartPos, bEndPos);
                            x = (() -> "1.0/" + "ln(" + aExprn + ")" + "*" + aExprn + "^" + bExprn);
                            log.info("Integr:parseFactorIntegr:2^x:aExprn=" + StrIntegr.substring(aStartPos, aEndPos));
                            log.info("Integr:parseFactorIntegr:2^x:bExprn=" + StrIntegr.substring(bStartPos, bEndPos));
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Integr:parseFactorIntegr:2^x:^:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                            }
                        } else if ((!IsAConstant(StrIntegr.substring(aStartPos, aEndPos), DiffWithRespTo))
                                && (StrIsAConstant.equalsIgnoreCase("IndConstant"))
                                && (!IsAConstant(StrIntegr.substring(bStartPos, bEndPos), DiffWithRespTo))
                                && (StrIsAConstant.equalsIgnoreCase("IndConstant"))) {
                            // a^b
                            final String aExprn = StrIntegr.substring(aStartPos, aEndPos);
                            final String bExprn = StrIntegr.substring(bStartPos, bEndPos);
                            x = (() -> aExprn + "^" + bExprn);
                            if ((aStartPos >= 1) && (StrIntegr.charAt(aStartPos - 1) == '*')) {
                                LADiffIndConstOperator = '*';
                            } else if ((aStartPos >= 1) && (StrIntegr.charAt(aStartPos - 1) == '/')) {
                                LADiffIndConstOperator = '/';
                            }
                            log.info("Integr:parseFactorIntegr:Independent Variables:Exprn=" + Exprn + " SavedOperator=" + (char) SavedOperator);
                            log.info("Integr:parseFactorIntegr:a^b:aExprn=" + StrIntegr.substring(aStartPos, aEndPos) + " LADiffIndConstOperator=" + (char) LADiffIndConstOperator);
                            log.info("Integr:parseFactorIntegr:a^b:bExprn=" + StrIntegr.substring(bStartPos, bEndPos));
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Integr:parseFactorIntegr:a^b:^:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                            }
                        } else if ((!IsAConstant(StrIntegr.substring(aStartPos, aEndPos), DiffWithRespTo))
                                && (StrIsAConstant.equalsIgnoreCase("Var"))
                                && (!IsAConstant(StrIntegr.substring(bStartPos, bEndPos), DiffWithRespTo))
                                && (StrIsAConstant.equalsIgnoreCase("IndConstant"))) {
                            // x^b
                            final String aExprn1 = StrIntegr.substring(aStartPos, aEndPos);
                            final String bExprn1 = StrIntegr.substring(bStartPos, bEndPos);
                            x = (() -> aExprn1 + "^" + "(" + (bExprn1 + "+" + "1.0") + ")" + "/" + "(" + (bExprn1 + "+" + "1.0" + ")"));
                            if ((aStartPos >= 1) && (StrIntegr.charAt(aStartPos - 1) == '*')) {
                                LADiffFactorOperator = '*';
                            } else if ((aStartPos >= 1) && (StrIntegr.charAt(aStartPos - 1) == '/')) {
                                LADiffFactorOperator = '/';
                            }
                            log.info("Integr:parseFactorIntegr:x^b:aExprn=" + StrIntegr.substring(aStartPos, aEndPos) + " LADiffFactorOperator=" + (char) LADiffFactorOperator);
                            log.info("Integr:parseFactorIntegr:x^b:bExprn=" + StrIntegr.substring(bStartPos, bEndPos));
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Integr:parseFactorIntegr:x^b:^:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                            }
                        } else if ((!IsAConstant(StrIntegr.substring(aStartPos, aEndPos), DiffWithRespTo))
                                && (StrIsAConstant.equalsIgnoreCase("IndConstant"))
                                && (!IsAConstant(StrIntegr.substring(bStartPos, bEndPos), DiffWithRespTo))
                                && (StrIsAConstant.equalsIgnoreCase("Var"))) {
                            // a^x
                            final String aExprn1 = StrIntegr.substring(aStartPos, aEndPos);
                            final String bExprn1 = StrIntegr.substring(bStartPos, bEndPos);
                            x = (() -> "1.0/" + "ln(" + aExprn1 + ")" + "*" + aExprn1 + "^" + bExprn1);
                            if ((aStartPos >= 1) && (StrIntegr.charAt(aStartPos - 1) == '*')) {
                                LADiffIndConstOperator = '*';
                            } else if ((aStartPos >= 1) && (StrIntegr.charAt(aStartPos - 1) == '/')) {
                                LADiffIndConstOperator = '/';
                            }
                            log.info("Integr:parseFactorIntegr:a^x:aExprn=" + StrIntegr.substring(aStartPos, aEndPos) + " LADiffIndConstOperator=" + (char) LADiffIndConstOperator);
                            log.info("Integr:parseFactorIntegr:a^x:bExprn=" + StrIntegr.substring(bStartPos, bEndPos));
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Integr:parseFactorIntegr:a^x:^:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                            }
                        } else if ((!IsAConstant(StrIntegr.substring(aStartPos, aEndPos), DiffWithRespTo))
                                && ((StrIsAConstant.equalsIgnoreCase("IndConstant"))
                                || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))
                                && (IsAConstant(StrIntegr.substring(bStartPos, bEndPos), DiffWithRespTo))) {
                            // a^2
                            final String aExprn1 = StrIntegr.substring(aStartPos, aEndPos);
                            final String bExprn1 = StrIntegr.substring(bStartPos, bEndPos);
                            if ((!IsAConstant(StrIntegr.substring(aStartPos, aEndPos), DiffWithRespTo))
                                    && (StrIsAConstant.equalsIgnoreCase("IndConstantExpression"))) {
                                //x = (() -> aExprn1);
                                x = (() -> aExprn1 + "^" + bExprn1);
                            } else {
                                x = (() -> aExprn1 + "^" + bExprn1);
                            }
                            if ((aStartPos >= 1) && (StrIntegr.charAt(aStartPos - 1) == '*')) {
                                LADiffIndConstOperator = '*';
                            } else if ((aStartPos >= 1) && (StrIntegr.charAt(aStartPos - 1) == '/')) {
                                LADiffIndConstOperator = '/';
                            }
                            log.info("Integr:parseFactorIntegr:a^2:aExprn=" + StrIntegr.substring(aStartPos, aEndPos) + " LADiffIndConstOperator=" + (char) LADiffIndConstOperator);
                            log.info("Integr:parseFactorIntegr:a^2:bExprn=" + StrIntegr.substring(bStartPos, bEndPos));
                            log.info("Integr:parseFactorIntegr:x.IntegrExpr()=" + x.IntegrExpr() + " DiffTermOperator=" + (char) DiffTermOperator);
                            log.info("Integr:parseFactorIntegr:Exprn=" + Exprn);
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Integr:parseFactorIntegr:a^2:^:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                            }
                        } else if ((!IsAConstant(StrIntegr.substring(aStartPos, aEndPos), DiffWithRespTo))
                                && ((StrIsAConstant.equalsIgnoreCase("Var"))
                                || (StrIsAConstant.equalsIgnoreCase("VarExpression")))
                                && ((IsAConstant(StrIntegr.substring(bStartPos, bEndPos), DiffWithRespTo)))
                                || (StrIntegr.substring(bStartPos, bEndPos).equalsIgnoreCase(""))) {
                            // x^2
//                            if ((aStartPos >= 1) && (StrIntegr.charAt(aStartPos - 1) == '*')) {
//                                LADiffFactorOperator = '*';
//                            } else if ((aStartPos >= 1) && (StrIntegr.charAt(aStartPos - 1) == '/')) {
//                                LADiffFactorOperator = '/';
//                            }
                            boolean StrIsAConstantVarExprFlag = false;
                            if ((!IsAConstant(StrIntegr.substring(aStartPos, aEndPos), DiffWithRespTo))
                                    && ((StrIsAConstant.equalsIgnoreCase("VarExpression")) || (StrIsAConstant.equalsIgnoreCase("Var")))) {
                                StrIsAConstantVarExprFlag = true;
                            }
                            log.info("Integr:parseFactorIntegr:x^2:aExprn=" + StrIntegr.substring(aStartPos, aEndPos) + " LADiffFactorOperator=" + (char) LADiffFactorOperator);
                            log.info("Integr:parseFactorIntegr:x^2:bExprn=" + StrIntegr.substring(bStartPos, bEndPos));
                            log.info("Integr:parseFactorIntegr:x^2:b.IntegrExpr()=" + b.IntegrExpr());
                            String DataConst = "";
                            String[] DataTemp = StrIntegr.substring(aStartPos, aEndPos).split(DiffWithRespTo);
                            if (DataTemp.length == 1) {
                                if (DataTemp[0].charAt(DataTemp[0].length() - 1) == '*') {
                                    DataConst = DataTemp[0].substring(0, DataTemp[0].length() - 1);
                                } else if (DataTemp[0].charAt(DataTemp[0].length() - 1) == '/') {
                                    DataConst = DataTemp[0].substring(0, DataTemp[0].length() - 1);
                                }
                            }
                            log.info("Integr:parseFactorIntegr:x^2:DataConst=" + DataConst);
                            if (b.IntegrExpr().contains("@Constant@")) {
                                log.info("Integr:parseFactorIntegr:Exponential Constant:Exprn=" + Exprn + " x.IntegrExpr()=" + x.IntegrExpr() + " StrIsAConstantVarExprFlag=" + StrIsAConstantVarExprFlag);
                                Split_Integr(b.IntegrExpr(), DiffWithRespTo);
                                log.info("Integr:parseFactorIntegr:Loop:FactorsExpr=" + FactorsExpr + " FactorsDiffExpr=" + FactorsDiffExpr + " DiffTermOperator=" + (char) DiffTermOperator + " LADiffFactorOperator=" + (char) LADiffFactorOperator + " StrIsAConstantVarExprFlag=" + StrIsAConstantVarExprFlag);
                                String Temp = "";
                                if (StrIsAConstantVarExprFlag == true) {
                                    if ((IsAConstant(DataConst, DiffWithRespTo))
                                            || ((!IsAConstant(DataConst, DiffWithRespTo))
                                            && ((StrIsAConstant.equalsIgnoreCase("Var"))
                                            || (StrIsAConstant.equalsIgnoreCase("IndConstant"))
                                            || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression"))
                                            || (StrIsAConstant.equalsIgnoreCase("Unknown"))))) {
                                        StrIsAConstantVarExprFlag = false;
                                    }
                                    log.info("Integr:parseFactorIntegr:StrIsAConstantVarExprFlag:StrIsAConstantVarExprFlag=" + StrIsAConstantVarExprFlag + " DataConst=" + DataConst + " LADiffFactorOperator=" + (char) LADiffFactorOperator + " DiffTermOperator=" + (char) DiffTermOperator + " DataTemp.length=" + DataTemp.length);
                                }
                                if (StrIsAConstantVarExprFlag == true) {
                                    if ((DiffTermOperator == -1) && (LADiffFactorOperator == '*')) {
                                        if (DataConst.equalsIgnoreCase("")) {
                                            Temp = "1.0/" + (Double.parseDouble(FactorsExpr) + 1.0) + "*" + DiffWithRespTo + "^" + (Double.parseDouble(FactorsExpr) + 1.0);
                                        } else {
                                            Temp = DataConst + "/" + (Double.parseDouble(FactorsExpr) + 1.0) + "*" + DiffWithRespTo + "^" + (Double.parseDouble(FactorsExpr) + 1.0);
                                        }
                                        log.info("Integr:parseFactorIntegr:If IndConstant:LADiffTermOperator:Rule1:Temp=" + Temp + " LADiffFactorOperator=" + (char) LADiffFactorOperator + " DiffTermOperator=" + (char) DiffTermOperator);
                                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                            System.out.println("Integr:parseFactorIntegr:^:LADiffFactorOperator:*:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                                        }
                                    } else if (LADiffFactorOperator == '*') {
                                        if (DataConst.equalsIgnoreCase("")) {
                                            Temp = "1.0/" + (Double.parseDouble(FactorsExpr) + 1.0) + (char) LADiffFactorOperator + DiffWithRespTo + "^" + (Double.parseDouble(FactorsExpr) + 1.0);
                                        } else {
                                            Temp = DataConst + "/" + (Double.parseDouble(FactorsExpr) + 1.0) + (char) LADiffFactorOperator + DiffWithRespTo + "^" + (Double.parseDouble(FactorsExpr) + 1.0);
                                        }
                                        log.info("Integr:parseFactorIntegr:If IndConstant:LADiffFactorOperator:Rule2:Temp=" + Temp + " LADiffFactorOperator=" + (char) LADiffFactorOperator + " DiffTermOperator=" + (char) DiffTermOperator);
                                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                            System.out.println("Integr:parseFactorIntegr:^:LADiffFactorOperator:else:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                                        }
                                    } else if ((LADiffFactorOperator == '/') && (Double.parseDouble(FactorsExpr) > 0)) {
                                        //Temp = "1.0/" + (-Double.parseDouble(FactorsExpr) + 1.0) + (char) LADiffFactorOperator + DiffWithRespTo + "^" + (Double.parseDouble(FactorsExpr) - 1.0);
                                        log.info("Integr:parseFactorIntegr:If IndConstant:LADiffFactorOperator:Rule3:Temp=" + Temp + " LADiffFactorOperator=" + (char) LADiffFactorOperator + " DiffTermOperator=" + (char) DiffTermOperator);
                                    } else if ((LADiffFactorOperator == '/') && (Double.parseDouble(FactorsExpr) < 0)) {
                                        //Temp = "1.0/" + (-Double.parseDouble(FactorsExpr) + 1.0) + "*" + DiffWithRespTo + "^" + (-(Double.parseDouble(FactorsExpr) - 1.0));
                                        log.info("Integr:parseFactorIntegr:If IndConstant:LADiffFactorOperator:Rule4:Temp=" + Temp + " LADiffFactorOperator=" + (char) LADiffFactorOperator + " DiffTermOperator=" + (char) DiffTermOperator);
                                    } else if ((DiffTermOperator == -1) && (LADiffFactorOperator == -1)) {
                                        if (DataConst.equalsIgnoreCase("")) {
                                            Temp = "1.0/" + (Double.parseDouble(FactorsExpr) + 1.0) + "*" + DiffWithRespTo + "^" + (Double.parseDouble(FactorsExpr) + 1.0);
                                        } else {
                                            Temp = DataConst + "/" + (Double.parseDouble(FactorsExpr) + 1.0) + "*" + DiffWithRespTo + "^" + (Double.parseDouble(FactorsExpr) + 1.0);
                                        }
                                        log.info("Integr:parseFactorIntegr:If IndConstant:LADiffTermOperator:Rule5:Temp=" + Temp + " LADiffFactorOperator=" + (char) LADiffFactorOperator + " DiffTermOperator=" + (char) DiffTermOperator);
                                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                            System.out.println("Integr:parseFactorIntegr:^:LADiffFactorOperator:/:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                                        }
                                    }
                                    log.info("Integr:parseFactorIntegr:If IndConstant:Temp=" + Temp + " LADiffFactorOperator=" + (char) LADiffFactorOperator + " DiffTermOperator=" + (char) DiffTermOperator);
                                } else {
                                    if ((DiffTermOperator == -1) && (LADiffFactorOperator == '*')) {
                                        if (DataConst.equalsIgnoreCase("")) {
                                            Temp = "1.0/" + (Double.parseDouble(FactorsExpr) + 1.0) + "*" + DiffWithRespTo + "^" + (Double.parseDouble(FactorsExpr) + 1.0);
                                        } else {
                                            Temp = DataConst + "/" + (Double.parseDouble(FactorsExpr) + 1.0) + "*" + DiffWithRespTo + "^" + (Double.parseDouble(FactorsExpr) + 1.0);
                                        }
                                        log.info("Integr:parseFactorIntegr:Else:Rule1:LADiffTermOperator:Temp=" + Temp + " LADiffFactorOperator=" + (char) LADiffFactorOperator + " DiffTermOperator=" + (char) DiffTermOperator);
                                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                            System.out.println("Integr:parseFactorIntegr:Else:Rule1:LADiffTermOperator:^:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                                        }
                                    } else if (LADiffFactorOperator == '*') {
                                        if (DataConst.equalsIgnoreCase("")) {
                                            Temp = "1.0/" + (Double.parseDouble(FactorsExpr) + 1.0) + (char) LADiffFactorOperator + DiffWithRespTo + "^" + (Double.parseDouble(FactorsExpr) + 1.0);
                                            log.info("Integr:parseFactorIntegr:Else:Rule2.1:DataConst=" + DataConst + " Temp=" + Temp + " x.IntegrExpr()=" + x.IntegrExpr() + " b.IntegrExpr()=" + b.IntegrExpr() + " LADiffFactorOperator=" + (char) LADiffFactorOperator + " DiffTermOperator=" + (char) DiffTermOperator);
                                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                                System.out.println("Integr:parseFactorIntegr:Else:Rule2.1:LADiffTermOperator:^:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                                            }
                                        } else if (IsAConstant(x.IntegrExpr(), DiffWithRespTo)) {
                                            Temp = DataConst + "/" + (Double.parseDouble(FactorsExpr) + 1.0) + (char) LADiffFactorOperator + DiffWithRespTo + "^" + (Double.parseDouble(FactorsExpr) + 1.0);
                                            log.info("Integr:parseFactorIntegr:Else:Rule2.2:DataConst=" + DataConst + " Temp=" + Temp + " x.IntegrExpr()=" + x.IntegrExpr() + " b.IntegrExpr()=" + b.IntegrExpr() + " LADiffFactorOperator=" + (char) LADiffFactorOperator + " DiffTermOperator=" + (char) DiffTermOperator);
                                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                                System.out.println("Integr:parseFactorIntegr:Else:Rule2.2:LADiffTermOperator:^:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                                            }
                                        } else {
                                            Temp = "/" + (Double.parseDouble(FactorsExpr) + 1.0) + (char) LADiffFactorOperator + DiffWithRespTo + "^" + (Double.parseDouble(FactorsExpr) + 1.0);
                                            log.info("Integr:parseFactorIntegr:Else:Rule2.3:DataConst=" + DataConst + " Temp=" + Temp + " x.IntegrExpr()=" + x.IntegrExpr() + " b.IntegrExpr()=" + b.IntegrExpr() + " LADiffFactorOperator=" + (char) LADiffFactorOperator + " DiffTermOperator=" + (char) DiffTermOperator);
                                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                                System.out.println("Integr:parseFactorIntegr:Else:Rule2.3:LADiffTermOperator:^:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                                            }
                                        }
                                        log.info("Integr:parseFactorIntegr:Else:Rule2:LADiffFactorOperator:Temp=" + Temp + " LADiffFactorOperator=" + (char) LADiffFactorOperator + " DiffTermOperator=" + (char) DiffTermOperator);
                                    } else if ((LADiffFactorOperator == '/') && (Double.parseDouble(FactorsExpr) > 0)) {
                                        if (DataConst.equalsIgnoreCase("")) {
                                            Temp = "1.0/" + (-Double.parseDouble(FactorsExpr) + 1.0) + (char) LADiffFactorOperator + DiffWithRespTo + "^" + (Double.parseDouble(FactorsExpr) - 1.0);
                                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                                System.out.println("Integr:parseFactorIntegr:Else:Rule3.1:LADiffTermOperator:^:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                                            }
                                        } else {
                                            Temp = DataConst + "/" + (-Double.parseDouble(FactorsExpr) + 1.0) + (char) LADiffFactorOperator + DiffWithRespTo + "^" + (Double.parseDouble(FactorsExpr) - 1.0);
                                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                                System.out.println("Integr:parseFactorIntegr:Else:Rule3.2:LADiffTermOperator:^:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                                            }
                                        }
                                        log.info("Integr:parseFactorIntegr:Else:Rule3:LADiffFactorOperator:Temp=" + Temp + " LADiffFactorOperator=" + (char) LADiffFactorOperator + " DiffTermOperator=" + (char) DiffTermOperator);
                                    } else if ((LADiffFactorOperator == '/') && (Double.parseDouble(FactorsExpr) < 0)) {
                                        if (DataConst.equalsIgnoreCase("")) {
                                            Temp = "1.0/" + (-Double.parseDouble(FactorsExpr) + 1.0) + "*" + DiffWithRespTo + "^" + (-(Double.parseDouble(FactorsExpr) - 1.0));
                                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                                System.out.println("Integr:parseFactorIntegr:Else:Rule4.1:LADiffTermOperator:^:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                                            }
                                        } else {
                                            Temp = DataConst + "/" + (-Double.parseDouble(FactorsExpr) + 1.0) + "*" + DiffWithRespTo + "^" + (-(Double.parseDouble(FactorsExpr) - 1.0));
                                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                                System.out.println("Integr:parseFactorIntegr:Else:Rule4.2:LADiffTermOperator:^:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                                            }
                                        }
                                        log.info("Integr:parseFactorIntegr:Else:Rule4:LADiffFactorOperator:Temp=" + Temp + " LADiffFactorOperator=" + (char) LADiffFactorOperator + " DiffTermOperator=" + (char) DiffTermOperator);
                                    } else if ((DiffTermOperator == -1) && (LADiffFactorOperator == -1)) {
                                        if (DataConst.equalsIgnoreCase("")) {
                                            Temp = "1.0/" + (Double.parseDouble(FactorsExpr) + 1.0) + "*" + DiffWithRespTo + "^" + (Double.parseDouble(FactorsExpr) + 1.0);
                                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                                System.out.println("Integr:parseFactorIntegr:Else:Rule5.1:LADiffTermOperator:^:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                                            }
                                        } else {
                                            Temp = DataConst + "/" + (Double.parseDouble(FactorsExpr) + 1.0) + "*" + DiffWithRespTo + "^" + (Double.parseDouble(FactorsExpr) + 1.0);
                                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                                System.out.println("Integr:parseFactorIntegr:Else:Rule5.2:LADiffTermOperator:^:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                                            }
                                        }
                                        log.info("Integr:parseFactorIntegr:Else:Rule5:LADiffTermOperator:Temp=" + Temp + " LADiffFactorOperator=" + (char) LADiffFactorOperator + " DiffTermOperator=" + (char) DiffTermOperator);
                                    } else if ((DiffTermOperator == '*') && (LADiffFactorOperator == -1)) {
                                        if (DataConst.equalsIgnoreCase("")) {
                                            Temp = "1.0/" + (Double.parseDouble(FactorsExpr) + 1.0) + "*" + DiffWithRespTo + "^" + (Double.parseDouble(FactorsExpr) + 1.0);
                                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                                System.out.println("Integr:parseFactorIntegr:Else:Rule6.1:LADiffTermOperator:^:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                                            }
                                        } else {
                                            Temp = DataConst + "/" + (Double.parseDouble(FactorsExpr) + 1.0) + "*" + DiffWithRespTo + "^" + (Double.parseDouble(FactorsExpr) + 1.0);
                                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                                System.out.println("Integr:parseFactorIntegr:Else:Rule6.2:LADiffTermOperator:^:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                                            }
                                        }
                                        log.info("Integr:parseFactorIntegr:Else:Rule6:LADiffTermOperator:Temp=" + Temp + " LADiffFactorOperator=" + (char) LADiffFactorOperator + " DiffTermOperator=" + (char) DiffTermOperator);
                                    } else if ((DiffTermOperator == '/') && (LADiffFactorOperator == -1)) {

                                        if ((DataConst.equalsIgnoreCase("")) && ((-Double.parseDouble(FactorsExpr) + 1.0) != 0.0)) {
                                            Temp = "1.0/" + (-Double.parseDouble(FactorsExpr) + 1.0) + (char) DiffTermOperator + DiffWithRespTo + "^" + (Double.parseDouble(FactorsExpr) - 1.0);
                                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                                System.out.println("Integr:parseFactorIntegr:Else:Rule7.1:LADiffTermOperator:^:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                                            }
                                        } else if ((-Double.parseDouble(FactorsExpr) + 1.0) != 0.0) {
                                            Temp = DataConst + "/" + (-Double.parseDouble(FactorsExpr) + 1.0) + (char) DiffTermOperator + DiffWithRespTo + "^" + (Double.parseDouble(FactorsExpr) - 1.0);
                                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                                System.out.println("Integr:parseFactorIntegr:Else:Rule7.2:LADiffTermOperator:^:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                                            }
                                        } else if ((DataConst.equalsIgnoreCase("")) && (-Double.parseDouble(FactorsExpr) + 1.0) == 0.0) {
                                            Temp = "ln" + "(" + DiffWithRespTo + ")";
                                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                                System.out.println("Integr:parseFactorIntegr:Else:Rule7.3:LADiffTermOperator:^:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                                            }
                                        } else if ((DataConst.equalsIgnoreCase("")) && (-Double.parseDouble(FactorsExpr) + 1.0) == 0.0) {
                                            Temp = DataConst + "*" + "ln" + "(" + DiffWithRespTo + ")";
                                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                                System.out.println("Integr:parseFactorIntegr:Else:Rule7.4:LADiffTermOperator:^:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                                            }
                                        }
                                        log.info("Integr:parseFactorIntegr:Else:Rule7:LADiffTermOperator:Temp=" + Temp + " LADiffFactorOperator=" + (char) LADiffFactorOperator + " DiffTermOperator=" + (char) DiffTermOperator);
                                    }
                                    log.info("Integr:parseFactorIntegr:Else:Temp=" + Temp + " LADiffFactorOperator=" + (char) LADiffFactorOperator + " DiffTermOperator=" + (char) DiffTermOperator);
                                }
                                //else if (LADiffTermOperator=='/') Temp="1.0/" + (Double.parseDouble(FactorsExpr) - 1.0) + (char)LADiffFactorOperator + DiffWithRespTo + "^" + (Double.parseDouble(FactorsExpr) - 1.0);
                                //else Temp="1.0/" + (Double.parseDouble(FactorsExpr) + 1.0) + (char)LADiffFactorOperator + DiffWithRespTo + "^" + (Double.parseDouble(FactorsExpr) + 1.0);
                                log.info("Integr:parseFactorIntegr:Temp=" + Temp + " FactorsExpr=" + FactorsExpr + " DiffTermOperator=" + (char) DiffTermOperator + " LADiffFactorOperator=" + (char) LADiffFactorOperator);
                                final String MyTerm = Temp;
                                x = (() -> MyTerm);
                                Exprn = "" + MyTerm;
                            }
                            if (bStartPos == bEndPos) {
                                log.info("Integr:parseFactorIntegr:Mapping Loop:StrIntegr=" + StrIntegr.substring(posIntegr));
                                posIntegr = bHighLvlMappos;
                                while ((IsNumber(StrIntegr.charAt(posIntegr))) || (IsVariable(StrIntegr.charAt(posIntegr)))) {
                                    nextCharIntegr();
                                }
                                log.info("Integr:parseFactorIntegr:Mapping Loop:StrIntegr=" + StrIntegr.substring(posIntegr));
                            }
                            log.info("Integr:parseFactorIntegr:x.IntegrExpr()=" + x.IntegrExpr() + " DiffTermOperator=" + (char) DiffTermOperator);
                            log.info("Integr:parseFactorIntegr:Exprn=" + Exprn);
                        }
                        //FactorsExpr = "";
                        //FactorsDiffExpr = "";
                        log.info("Integr:parseFactorIntegr:x.IntegrExpr()=" + x.IntegrExpr() + " DiffTermOperator=" + (char) DiffTermOperator);
                        log.info("Integr:parseFactorIntegr:Exprn=" + Exprn);
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Integr:parseFactorIntegr:Final:^:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                        }
                    } else {
                        if (posIntegr < StrIntegr.length()) {
                            FactorEndPos = posIntegr;
                        } else {
                            FactorEndPos = StrIntegr.length();
                        }
                        if (ParanExprInProgressFlag == true) {
                            if (FactorStartPos < FactorEndPos) {
                                log.info("Integr:parseFactorIntegr:ParanExprInProgressFlag:Return Value parseFactorIntegr:x.IntegrExpr()=" + x.IntegrExpr() + " Original Integrand=" + StrIntegr.substring(FactorStartPos, FactorEndPos));
                            }
                            log.info("Integr:parseFactorIntegr:ParanExprInProgressFlag:Return Value parseFactorIntegr:Exprn=" + Exprn);
                            final String ParaOutput = Exprn;
                            IntegrExpr y = (() -> ParaOutput);
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Integr:parseFactorIntegr:Return 1:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr + " StrIntegr=" + StrIntegr.substring(posIntegr));
                            }
                            return y;
                        } else {
                            if (FactorStartPos < FactorEndPos) {
                                log.info("Integr:parseFactorIntegr:Normal:Return Value parseFactorIntegr:x.IntegrExpr()=" + x.IntegrExpr() + " Original Integrand=" + StrIntegr.substring(FactorStartPos, FactorEndPos) + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                            }
                            log.info("Integr:parseFactorIntegr:Normal:Return Value parseFactorIntegr:Exprn=" + Exprn);
                            if ((FactorStartPos < FactorEndPos) && (StrIntegr.substring(FactorStartPos, FactorEndPos).contains("*" + DiffWithRespTo))
                                    && (!StrIntegr.substring(FactorStartPos, FactorEndPos).contains(DiffWithRespTo + "^"))
                                    && (!StrIntegr.substring(FactorStartPos, FactorEndPos).equalsIgnoreCase(DiffWithRespTo))) {
                                final String ParaOutput = x.IntegrExpr();
                                log.info("Integr:parseFactorIntegr:Normal:RuleA:ParaOutput=" + ParaOutput);
                                //2.0/2.0*x^2.0
                                if ((ParaOutput.equalsIgnoreCase("1.0/2.0"))) {
                                    x = (() -> DiffWithRespTo + "^2.0");
                                    log.info("Integr:parseFactorIntegr:Normal:RuleA:Rule 1:parseFactorIntegr:x.IntegrExpr()=" + x.IntegrExpr() + " ParaOutput=" + ParaOutput + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                                } else if ((!ParaOutput.contains("@Parenthesis@")) && (!ParaOutput.equalsIgnoreCase("2.0")) && (chIntegr != -1)) {
                                    x = (() -> ParaOutput + "/2.0*" + DiffWithRespTo + "^2.0");
                                    log.info("Integr:parseFactorIntegr:Normal:RuleA:Rule 2:parseFactorIntegr:x.IntegrExpr()=" + x.IntegrExpr() + " ParaOutput=" + ParaOutput + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                                } else if ((!ParaOutput.contains("@Parenthesis@")) && (!ParaOutput.equalsIgnoreCase("2.0")) && (chIntegr == -1)) {
                                    if ((Exprn.equalsIgnoreCase(ParaOutput)) && (IsAConstant(Exprn, DiffWithRespTo))) {
                                        final String MyExprn = Exprn;
                                        x = (() -> MyExprn + "/2.0*" + DiffWithRespTo + "^2.0");
                                        log.info("Integr:parseFactorIntegr:Normal:RuleA:Rule 3.1:parseFactorIntegr:x.IntegrExpr()=" + x.IntegrExpr() + " ParaOutput=" + ParaOutput + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                                    } else if ((Exprn.equalsIgnoreCase(ParaOutput)) && (!IsAConstant(Exprn, DiffWithRespTo))) {
                                        final String MyExprn = ParaOutput;
                                        x = (() -> MyExprn + "/2.0*" + DiffWithRespTo + "^2.0");
                                        log.info("Integr:parseFactorIntegr:Normal:RuleA:Rule 3.1:parseFactorIntegr:x.IntegrExpr()=" + x.IntegrExpr() + " ParaOutput=" + ParaOutput + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                                    } else {
                                        x = (() -> "1.0/2.0*" + DiffWithRespTo + "^2.0");
                                        log.info("Integr:parseFactorIntegr:Normal:RuleA:Rule 3.2:parseFactorIntegr:x.IntegrExpr()=" + x.IntegrExpr() + " ParaOutput=" + ParaOutput + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                                    }
                                    log.info("Integr:parseFactorIntegr:Normal:RuleA:Rule 3:parseFactorIntegr:x.IntegrExpr()=" + x.IntegrExpr() + " ParaOutput=" + ParaOutput + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                                } else if ((!ParaOutput.contains("@Parenthesis@"))) {
                                    x = (() -> DiffWithRespTo + "^2.0");
                                    log.info("Integr:parseFactorIntegr:Normal:RuleA:Rule 4:parseFactorIntegr:x.IntegrExpr()=" + x.IntegrExpr() + " ParaOutput=" + ParaOutput + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                                } else {
                                    x = (() -> ParaOutput);
                                    log.info("Integr:parseFactorIntegr:Normal:RuleA:Rule 5:parseFactorIntegr:x.IntegrExpr()=" + x.IntegrExpr() + " ParaOutput=" + ParaOutput + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                                }
                                log.info("Integr:parseFactorIntegr:Normal:Rule A :parseFactorIntegr:x.IntegrExpr()=" + x.IntegrExpr() + " ParaOutput=" + ParaOutput + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                            } else if ((FactorStartPos < FactorEndPos) && (StrIntegr.substring(FactorStartPos, FactorEndPos).contains("/" + DiffWithRespTo))
                                    && (!StrIntegr.substring(FactorStartPos, FactorEndPos).contains(DiffWithRespTo + "^"))
                                    && (!StrIntegr.substring(FactorStartPos, FactorEndPos).equalsIgnoreCase(DiffWithRespTo))) {
                                final String ParaOutput = x.IntegrExpr();
                                if (!ParaOutput.equalsIgnoreCase("1.0")) {
                                    x = (() -> ParaOutput + "*" + "ln(" + DiffWithRespTo + ")");
                                    log.info("Integr:parseFactorIntegr:Normal:Rule B 1:parseFactorIntegr:x.IntegrExpr()=" + x.IntegrExpr() + " ParaOutput=" + ParaOutput + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                                } else {
                                    x = (() -> "ln(" + DiffWithRespTo + ")");
                                    log.info("Integr:parseFactorIntegr:Normal:Rule B 2:parseFactorIntegr:x.IntegrExpr()=" + x.IntegrExpr() + " ParaOutput=" + ParaOutput + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                                }
                                log.info("Integr:parseFactorIntegr:Normal:Rule B :parseFactorIntegr:x.IntegrExpr()=" + x.IntegrExpr() + " ParaOutput=" + ParaOutput + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                            } else if ((IsAConstant(FactorsExpr, DiffWithRespTo)) && (IsAConstant(Exprn, DiffWithRespTo))) {
                                final String MyExprn = x.IntegrExpr();
                                x = (() -> FactorsExpr);
                                Exprn = FactorsExpr;
                                log.info("Integr:parseFactorIntegr:Normal:Rule C 1:parseFactorIntegr:x.IntegrExpr()=" + x.IntegrExpr() + " Exprn=" + Exprn + " FactorsExpr=" + FactorsExpr + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                            } else if ((IsAConstant(FactorsExpr, DiffWithRespTo)) && (!IsAConstant(Exprn, DiffWithRespTo)) && (!Exprn.startsWith("/")) && (!Exprn.startsWith("*"))) {
                                final String MyExprn = x.IntegrExpr();
                                x = (() -> MyExprn);
                                Exprn = MyExprn;
                                log.info("Integr:parseFactorIntegr:Normal:Rule D 1:parseFactorIntegr:x.IntegrExpr()=" + x.IntegrExpr() + " Exprn=" + Exprn + " FactorsExpr=" + FactorsExpr + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                            } else if ((IsAConstant(FactorsExpr, DiffWithRespTo)) && (!IsAConstant(Exprn, DiffWithRespTo)) && ((Exprn.startsWith("/")) || (Exprn.startsWith("*")))) {
                                final String MyExprn = x.IntegrExpr();
                                x = (() -> FactorsExpr + MyExprn);
                                Exprn = FactorsExpr + MyExprn;
                                log.info("Integr:parseFactorIntegr:Normal:Rule E 1:parseFactorIntegr:x.IntegrExpr()=" + x.IntegrExpr() + " Exprn=" + Exprn + " FactorsExpr=" + FactorsExpr + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                            }
                            if (FactorStartPos < FactorEndPos) {
                                log.info("Integr:parseFactorIntegr:Normal:Return Value parseFactorIntegr:x.IntegrExpr()=" + x.IntegrExpr() + " Original Integrand=" + StrIntegr.substring(FactorStartPos, FactorEndPos) + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                            }
                            log.info("Integr:parseFactorIntegr:Normal:Return Value parseFactorIntegr:Exprn=" + Exprn);
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Integr:parseFactorIntegr:Normal:Return Value parseFactorIntegr:x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr + " StrIntegr=" + StrIntegr.substring(posIntegr));
                            }
                            return x;
                        }

                    }
                }
            }

            IntegrExpr parseBaseIntegr() {
                boolean ConfirmedConstFlag = false;
                int startPos1 = posIntegr;
                IntegrExpr x = (() -> "");
                log.info("Integr:parseBaseIntegr:StrIntegr=" + StrIntegr + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                    System.out.println("Integr:parseBaseIntegr:StrIntegr=" + StrIntegr + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                }
                if (eatIntegr('-')) { // unary minus
                    IntegrExpr b = parseBaseIntegr();
                    //x = () -> "-" + xx;
                    x = (() -> "-" + b.IntegrExpr());
                    return x;
                } else if (eatIntegr('+')) { // unary plus
                    //x = parseBaseIntegr();
                    //return x;
                }
                log.info("Integr:parseBaseIntegr:Before Parenthesis: chIntegr=" + (char) chIntegr + " chIntegr=" + chIntegr + " StrIntegr.substring(posIntegr, StrIntegr.length())=" + StrIntegr.substring(posIntegr, StrIntegr.length()));
                if (IsNumber(chIntegr)) { //numbers
                    int startPos = posIntegr;
                    while (IsNumber(chIntegr)) {
                        nextCharIntegr();
                        if ((chIntegr == 'E') || (chIntegr == 'e')) {
                            nextCharIntegr();
                            if ((chIntegr == '-') || (chIntegr == '+')) {
                                nextCharIntegr();
                            }
                        }
                    }
                    if ((startPos1 >= 0) && (posIntegr >= 0)) {
                        log.info("Integr:parseBaseIntegr:Numbers: xx=" + StrIntegr.substring(startPos1, posIntegr));
                    }

                    String xConst = "";
                    String xx = "";
                    if ((startPos1 >= 0) && (posIntegr >= 0)
                            && (IsAConstant(StrIntegr.substring(startPos1, posIntegr), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                        xx = "" + Double.parseDouble(StrIntegr.substring(startPos1, posIntegr));
                    }
                    if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                        System.out.println("Integr:parseBaseIntegr:Numbers: xx=" + xx + " DiffTermOperator=" + (char) DiffTermOperator + " GotExpntNumFlag=" + GotExpntNumFlag + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr + " StrIntegr(posIntegr)=" + StrIntegr.substring(posIntegr));
                    }
                    log.info("Integr:parseBaseIntegr:Numbers: xx=" + xx + " DiffTermOperator=" + (char) DiffTermOperator + " GotExpntNumFlag=" + GotExpntNumFlag + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr + " StrIntegr(posIntegr)=" + StrIntegr.substring(posIntegr));
                    if (GotExpntNumFlag == false) {
                        LookAheadDiffConst MyCoeff;
                        int DiffIntLength = xx.length();
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Integr:parseBaseIntegr:Numbers:Before parseLADiff: xConst=" + xConst + " DiffTermOperator=" + (char) DiffTermOperator + " GotExpntNumFlag=" + GotExpntNumFlag + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr + " StrIntegr(posIntegr)=" + StrIntegr.substring(posIntegr));
                        }
                        log.info("Integr:parseBaseIntegr:Entered LookAheadDiffConst Number:xConst=" + xConst + " xx=" + xx + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                        MyCoeff = parseLADiff(StrIntegr.substring(startPos1), startPos, DiffIntLength, "Integration", DiffWithRespTo);
                        xConst = "" + MyCoeff.eval();
                        if (IsAConstant(xConst, DiffWithRespTo)) {
                            ConfirmedConstFlag = true;
                        }
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Integr:parseBaseIntegr:Numbers:After parseLADiff: xConst=" + xConst + " DiffTermOperator=" + (char) DiffTermOperator + " GotExpntNumFlag=" + GotExpntNumFlag + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr + " StrIntegr(posIntegr)=" + StrIntegr.substring(posIntegr));
                        }
                    } else {
                        xConst = xx;
                        ConfirmedConstFlag = true;
                        LastLADiffConstCoeffAidPos = -1;
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Integr:parseBaseIntegr:Numbers:GotExpntNumFlag:else:Before Mapped: xConst=" + xConst + " DiffTermOperator=" + (char) DiffTermOperator + " GotExpntNumFlag=" + GotExpntNumFlag + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr + " StrIntegr(posIntegr)=" + StrIntegr.substring(posIntegr));
                        }
                        ParseLog("Integr", "parseBaseIntegr", "BeforeMap", "StrIntegr", StrIntegr);
                        ParseMapAPI("LookAheadDiffConst:parseLADiff:Integration", StrIntegr.length(), 0, 0, DiffWithRespTo);
                        ParseLog("Integr", "parseBaseIntegr", "Final", "StrIntegr", StrIntegr);
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Integr:parseBaseIntegr:Numbers:GotExpntNumFlag:else:Mapped: xConst=" + xConst + " DiffTermOperator=" + (char) DiffTermOperator + " GotExpntNumFlag=" + GotExpntNumFlag + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr + " StrIntegr(posIntegr)=" + StrIntegr.substring(posIntegr));
                        }
                    }
                    log.info("Integr:parseBaseIntegr:NumberORConstant:xConst=" + xConst + " DiffTermOperator=" + (char) DiffTermOperator + " GotExpntNumFlag=" + GotExpntNumFlag + " ConfirmedConstFlag=" + ConfirmedConstFlag + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                    if (chIntegr != -1) {
                        //SavedOperator = chIntegr;
                        if ((SavedOperator == ')') && (posIntegr + 1) < StrIntegr.length()) {
                            LookAheadOperator = StrIntegr.charAt(posIntegr + 1);
                        }
                        if (IsNotAnOperator(LookAheadOperator)) {
                            LookAheadOperator = 0;
                        }
                    } else {
                        SavedOperator = 0;
                    }
                    if (ConfirmedConstFlag == true) {
                        final String ConsolidatedConstTerm = xConst;
                        x = () -> (ConsolidatedConstTerm + "@" + "Constant" + "@" + ConsolidatedConstTerm);
                        log.info("Integr:parseBaseIntegr:NumberORConstant:x.IntegrExpr()=" + x.IntegrExpr());
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Integr:parseBaseIntegr:Numbers:ConfirmedConstFlag:Return:x.IntegrExpr()=" + x.IntegrExpr() + " DiffTermOperator=" + (char) DiffTermOperator + " GotExpntNumFlag=" + GotExpntNumFlag + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr + " StrIntegr(posIntegr)=" + StrIntegr.substring(posIntegr));
                        }
                        return x;
                    } else {
                        final String ConsolidatedIndConstTerm = xConst;
                        x = () -> (ConsolidatedIndConstTerm + "@" + "IndependentFactor" + "@" + ConsolidatedIndConstTerm);
                        log.info("Integr:parseBaseIntegr:IndConstExpression:x.IntegrExpr()=" + x.IntegrExpr());
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Integr:parseBaseIntegr:Numbers:ConfirmedConstFlag:else:Return:x.IntegrExpr()=" + x.IntegrExpr() + " DiffTermOperator=" + (char) DiffTermOperator + " GotExpntNumFlag=" + GotExpntNumFlag + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr + " StrIntegr(posIntegr)=" + StrIntegr.substring(posIntegr));
                        }
                        return x;
                    }
                } else if (IsVariable(chIntegr)) {//functions & variables
                    if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                        System.out.println("Integr:parseBaseIntegr:Entered Functions & Variable:chIntegr=" + (char) chIntegr + " posIntegr=" + posIntegr);
                    }
                    while ((IsVariable(chIntegr)) || (IsNumber(chIntegr))) {
                        nextCharIntegr();
                    }
                    String name = "";
                    if ((startPos1 >= 0) && (posIntegr >= 0) && (startPos1 < StrIntegr.length())) {
                        name = StrIntegr.substring(startPos1, posIntegr).trim();
                    }
                    if (name.equalsIgnoreCase("")) {
                        log.fatal("Integr:parseBaseIntegr:name null:Name=" + name);
                    }
                    log.info("Integr:parseBaseIntegr:Before Function StrIntegr.substring(posIntegr,StrIntegr.length())=" + StrIntegr.substring(posIntegr, StrIntegr.length()) + " chIntegr=" + (char) chIntegr + " chIntegr=" + chIntegr);
                    //Code to handle Function
                    if (functionsIntegr.containsKey(name)) {
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Integr:parseBaseIntegr:Entered Functions:");
                        }
                        String func = name;
                        FuncName = name;
                        FuncArgFlag = true;
                        ParanExprFlag = false;
                        ParenthesisFlag = true;
                        String MyParenExpr = "";
                        int argstartpos = posIntegr;
                        int argEndpos = -1;
                        int numberofcharsread = 0;
                        int oldposition = posIntegr;
                        numberofcharsread = extractAndClassifyFactors(StrIntegr.substring(posIntegr), DiffWithRespTo, true);
                        MyParenDecodedSep = "";
                        MyParenEncodedSep = "";
                        if (!otherTermsSep.isEmpty()) {
                            if ((DevelopmentDeepInfoFlagSep) || (GBLSilentDeepInfoSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("otherTermsSep:");
                                otherTermsSep.forEach(System.out::println);
                            }
                            for (String str : otherTermsSep) {
                                if ((str.contains("(")) && (str.contains("("))) {
                                    MyParenDecodedSep = MyParenDecodedSep + str;
                                } else if (MyParenDecodedSep.equalsIgnoreCase("")) {
                                    MyParenDecodedSep = "";
                                }
                            }

                            if (MyParenDecodedSep.startsWith("-")) {
                                MyParenDecodedSep = MyParenDecodedSep.replaceFirst("\\-", "");
                            } else if (MyParenDecodedSep.startsWith("+")) {
                                MyParenDecodedSep = MyParenDecodedSep.replaceFirst("\\+", "");
                            } else if (MyParenDecodedSep.startsWith("*")) {
                                MyParenDecodedSep = MyParenDecodedSep.replaceFirst("\\*", "");
                            } else if (MyParenDecodedSep.startsWith("/")) {
                                MyParenDecodedSep = MyParenDecodedSep.replaceFirst("/", "");
                            }
                            MyParenEncodedSep = MyParenDecodedSep;
                            if ((DevelopmentDeepInfoFlagSep) || (GBLSilentDeepInfoSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Integre:Braces:IndConst:String:" + StrIntegr.substring(oldposition) + " MapType=" + MapType + " MyParenEncodedSep=" + MyParenEncodedSep + " MyParenDecodedSep=" + MyParenDecodedSep);
                                System.out.println("Integre:Braces:IndConst:numberofcharsread=" + numberofcharsread + " posTerm=" + posTerm + " chTerm=" + (char) chTerm);
                            }
                        }
                        if ((!xTermsSep.isEmpty())) {
                            if ((DevelopmentDeepInfoFlagSep) || (GBLSilentDeepInfoSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("xTermsSep:");
                                xTermsSep.forEach(System.out::println);
                            }
                            for (String str : xTermsSep) {
                                if ((str.contains("(")) && (str.contains("("))) {
                                    MyParenDecodedSep = MyParenDecodedSep + str;
                                } else if (MyParenDecodedSep.equalsIgnoreCase("")) {
                                    MyParenDecodedSep = "";
                                }
                            }
                            if (MyParenDecodedSep.startsWith("-")) {
                                MyParenDecodedSep = MyParenDecodedSep.replaceFirst("\\-", "");
                            } else if (MyParenDecodedSep.startsWith("+")) {
                                MyParenDecodedSep = MyParenDecodedSep.replaceFirst("\\+", "");
                            } else if (MyParenDecodedSep.startsWith("*")) {
                                MyParenDecodedSep = MyParenDecodedSep.replaceFirst("\\*", "");
                            } else if (MyParenDecodedSep.startsWith("/")) {
                                MyParenDecodedSep = MyParenDecodedSep.replaceFirst("/", "");
                            }
                            MyParenEncodedSep = MyParenDecodedSep;
                            if ((DevelopmentDeepInfoFlagSep) || (GBLSilentDeepInfoSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Integre:Braces:Variable:String:" + StrIntegr.substring(oldposition) + " MapType=" + MapType + " MyParenEncodedSep=" + MyParenEncodedSep + " MyParenDecodedSep=" + MyParenDecodedSep);
                                System.out.println("Integre:Braces:Variable:numberofcharsread=" + numberofcharsread + " posTerm=" + posTerm + " chTerm=" + (char) chTerm);
                            }
                        }
                        if (!ConstantTermsSep.isEmpty()) {
                            if ((DevelopmentDeepInfoFlagSep) || (GBLSilentDeepInfoSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("ConstantTermsSep:");
                                ConstantTermsSep.forEach(System.out::println);
                            }
                            for (String str : ConstantTermsSep) {
                                if ((str.contains("(")) && (str.contains("("))) {
                                    MyParenDecodedSep = MyParenDecodedSep + str;
                                } else if (MyParenDecodedSep.equalsIgnoreCase("")) {
                                    MyParenDecodedSep = "";
                                }
                            }

                            if (MyParenDecodedSep.startsWith("-")) {
                                MyParenDecodedSep = MyParenDecodedSep.replaceFirst("\\-", "");
                            } else if (MyParenDecodedSep.startsWith("+")) {
                                MyParenDecodedSep = MyParenDecodedSep.replaceFirst("\\+", "");
                            } else if (MyParenDecodedSep.startsWith("*")) {
                                MyParenDecodedSep = MyParenDecodedSep.replaceFirst("\\*", "");
                            } else if (MyParenDecodedSep.startsWith("/")) {
                                MyParenDecodedSep = MyParenDecodedSep.replaceFirst("/", "");
                            }
                            MyParenEncodedSep = MyParenDecodedSep;
                            if ((DevelopmentDeepInfoFlagSep) || (GBLSilentDeepInfoSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Integr:Braces:Constant:String:" + StrIntegr.substring(oldposition) + " MapType=" + MapType + " MyParenEncodedSep=" + MyParenEncodedSep + " MyParenDecodedSep=" + MyParenDecodedSep);
                                System.out.println("Integr:Braces:Constant:numberofcharsread=" + numberofcharsread + " posTerm=" + posTerm + " chTerm=" + (char) chTerm);
                            }
                            xTermsSep.clear();
                            otherTermsSep.clear();
                            ConstantTermsSep.clear();
                        }
                        String TempExprn = MyParenDecodedSep;
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Integr:parseBaseIntegr:Arg:TempExprn=" + TempExprn);
                        }
                        if (IsAConstant(TempExprn, DiffWithRespTo)) {
                            final String TempExprnFullFunc = TempExprn;
                            x = () -> "(" + TempExprnFullFunc + ")*" + DiffWithRespTo;
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Integr:parseBaseIntegr:Arg:NumberExpression:x.IntegrExpr()=" + x.IntegrExpr());
                            }
                        } else if ((IsAConstant(TempExprn, DiffWithRespTo))
                                && ((StrIsAConstant.equalsIgnoreCase("IndConstantExpression")) || (StrIsAConstant.equalsIgnoreCase("IndConstant")))) {
                            final String TempExprnFullFunc = TempExprn;
                            x = (() -> "(" + TempExprnFullFunc + ")" + "@" + "Function" + "@" + "(" + MyParenDecodedSep + ")");
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Integr:parseBaseIntegr:Arg:IndConstantExpression:MyParenEncoded=" + MyParenDecodedSep + " x.IntegrExpr()=" + x.IntegrExpr());
                            }
                        }
                        String Exprn = MyParenDecodedSep;
                        IntegrExpr arg = (() -> "");
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Integr:parseBaseIntegr:Arg:Exprn=" + Exprn + ":MyParenEncoded=" + MyParenDecodedSep + " x.IntegrExpr()=" + x.IntegrExpr());
                        }
                        if ((Exprn.contains(DiffWithRespTo)) && (!Exprn.equalsIgnoreCase("(" + DiffWithRespTo + ")"))) {
                            if (!AutoGenSilentFlag) {
                                System.out.println("Integr:parseBaseIntegr:Function:Backup:StrIntegr=" + StrIntegr + ":StrIntegr.length()=" + StrIntegr.substring(oldposition).length() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                            }
                            Map<String, String> variablesBackupState = new HashMap();
                            depthBackUpRestore++;
                            StrKeyBackUpRestore = FileSepBackUpRestore + ":Integr:parseBaseIntegr:Function Argument";
                            BackupDiffIntegrStateAll(variablesBackupState);
                            MathsContxtLAv.ChaosPrevention();
                            InitState();
                            arg = parseIntegr(MyParenExpr, variables, DiffWithRespTo, MapType, IntegrORDiffr);
                            RestoreDiffIntegrStateAll(variablesBackupState);
                            depthBackUpRestore--;
                            StrKeyBackUpRestore = FileSepBackUpRestore;
                            if (!AutoGenSilentFlag) {
                                System.out.println("Integr:parseBaseIntegr:Function:Restore:StrIntegr=" + StrIntegr + ":StrIntegr.length()=" + StrIntegr.substring(oldposition).length() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                            }
                            FuncArgFlag = false;
                            ParanExprFlag = false;
                            ParenthesisFlag = false;
                            log.info("Integr:parseBaseIntegr:Function Argument:arg.IntegrExpr()=" + arg.IntegrExpr());
                            System.out.println("Integr:parseBaseIntegr:Function:ReadExpr:arg.IntegrExpr()=" + arg.IntegrExpr());
                            ParanExprInProgressFlag = false;
                            log.info("Integr:parseBaseIntegr:Function Argument:StrIntegr.length()=" + StrIntegr.length());
                            argEndpos = posIntegr;
                            if ((argEndpos > -1) && (argEndpos < StrIntegr.length())) {
                                posIntegr = argEndpos;
                                chIntegr = StrIntegr.charAt(posIntegr);
                            } else {
                                posIntegr = StrIntegr.length();
                                chIntegr = -1;
                            }
                        } else {
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Integr:parseBaseIntegr:Else:Arg:Exprn=" + Exprn + ":MyParenEncoded=" + MyParenDecodedSep + " x.IntegrExpr()=" + x.IntegrExpr());
                            }
                        }
                        String ArgTemp1 = splitBraces(Exprn);
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Integr:parseBaseIntegr:Arg:Exprn=" + Exprn + " ArgTemp1=" + ArgTemp1 + ":MyParenEncoded=" + MyParenDecodedSep + " x.IntegrExpr()=" + x.IntegrExpr());
                        }
                        if ((ArgTemp1 != null) && (!ArgTemp1.equalsIgnoreCase(""))) {
                            final String name1 = name;
                            x = (() -> (name1 + "@" + "Function" + "@" + "Factor" + "@" + ArgTemp1 + "@" + ArgTemp1));
                            Split_Integr(x.IntegrExpr(), DiffWithRespTo);
                            Expr_Func_Split_Integr(x.IntegrExpr(), DiffWithRespTo);
                            //Code to handle Function Arguments
                            if ((!arg.IntegrExpr().equalsIgnoreCase("")) && ((FunctionDiffExpr == null) || (FunctionDiffExpr.equalsIgnoreCase("")))) {
                                final String name2 = name;
                                final String finargStr = arg.IntegrExpr();
                                x = (() -> (name2 + "@" + "Function" + "@" + "Factor" + "@" + (ArgTemp1) + "@" + finargStr));
                                if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Integr:parseBaseIntegr:FSM1:x.IntegrExpr()=" + x.IntegrExpr());
                                }
                            } else if ((FunctionDiffExpr != null) && (!FunctionDiffExpr.equalsIgnoreCase("")) && (!FunctionDiffExpr.contains("+")) && (!FunctionDiffExpr.contains("-"))) {
                                final String name2 = name;
                                x = (() -> (name2 + "@" + "Function" + "@" + "Factor" + "@" + (ArgTemp1) + "@" + FunctionDiffExpr));
                                if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Integr:parseBaseIntegr:FSM2:x.IntegrExpr()=" + x.IntegrExpr());
                                }
                            } else if ((FunctionDiffExpr != null) && (!FunctionDiffExpr.equalsIgnoreCase(""))) {
                                final String name2 = name;
                                x = (() -> (name2 + "@" + "Function" + "@" + "Factor" + "@" + (ArgTemp1) + "@" + "(" + FunctionDiffExpr + ")"));
                                if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Integr:parseBaseIntegr:FSM3:x.IntegrExpr()=" + x.IntegrExpr());
                                }
                            }
                        } else {
                            final String name4 = name;
                            x = () -> (name4 + "@" + "Unknown" + "@" + (name4));
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Integr:parseBaseIntegr:x.DiffExpr()=" + x.IntegrExpr());
                            }
                        }
                    } else if ((name.equalsIgnoreCase(DiffWithRespTo))) {
                        ContainsXFlag = true;
                        final String name5 = name;
                        x = () -> (name5 + "@" + "Polynomial" + "@" + (name5));
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Integr:parseBaseIntegr:x.DiffExpr()=" + x.IntegrExpr());
                        }
                    } else if ((name.equalsIgnoreCase(DiffWithRespTo)) && (!name.contains("^"))) {
                        ContainsXFlag = true;
                        log.info("Integr:parseBaseIntegr:Factor:posIntegr=" + posIntegr);
                        final String name6 = name;
                        x = () -> (name6 + "@" + "Factor" + "@" + (name6));
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Integr:parseBaseIntegr:x.DiffExpr()=" + x.IntegrExpr());
                        }
                    } else if ((!name.equalsIgnoreCase(DiffWithRespTo)) && (!name.equalsIgnoreCase("Infinity"))) {//Independent Variable
                        log.info("Integr:parseBaseIntegr:IndependentFactor:posIntegr=" + posIntegr);
                        final String name7 = name;
                        x = () -> (name7 + "@" + "IndependentFactor" + "@" + (name7));
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Integr:parseBaseIntegr:x.DiffExpr()=" + x.IntegrExpr());
                        }
                    } else if ((!name.equalsIgnoreCase(DiffWithRespTo)) && ((name.equalsIgnoreCase("Infinity")) || (name.equalsIgnoreCase("NaN")))) {//Extremity Variable
                        final String name4 = name;
                        x = (() -> (name4 + "@" + "ExtremityFactor" + "@" + (name4)));
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Integr:parseBaseIntegr:x.DiffExpr()=" + x.IntegrExpr());
                        }
                    }
                    log.info("Integr:parseBaseIntegr:Variable/Function:name=" + name + " x.IntegrExpr()=" + x.IntegrExpr());
                    if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                        System.out.println("Integr:parseBaseIntegr:Variable:Function:x.IntegrExpr()=" + x.IntegrExpr());
                    }
                    return x;
                } else if (chIntegr == '(') {
                    if ((DevelopmentDeepInfoFlagSep) || (GBLSilentDeepInfoSep.equalsIgnoreCase("Verbose"))) {
                        System.out.println("Integr:Braces:(:Entered:posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                    }
                    char ParenOperator = 0;
                    if (posIntegr > 1) {
                        ParenOperator = StrIntegr.charAt(posIntegr - 1);
                    } else {
                        ParenOperator = '*';
                    }
                    int argstartpos = posIntegr;
                    int argEndpos = -1;
                    int numberofcharsread = 0;
                    int oldposition = posIntegr;
                    int tempAlignCharRead = -1;
                    DiffExpr arg1 = (() -> "");
                    DiffExpr arg2 = (() -> "");
                    IntegrExpr arg3 = (() -> "");
                    String Exprn = "";
                    numberofcharsread = extractAndClassifyFactors(StrIntegr.substring(posIntegr), DiffWithRespTo, true);
                    log.info("Integr:parseBaseDiffExpr:(: Expression=" + StrIntegr.substring(startPos1, posIntegr) + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                    MyParenDecodedSep = "";
                    MyParenEncodedSep = "";
                    IntegreNeurtralMultiplier = "";
                    if ((DevelopmentDeepInfoFlagSep) || (GBLSilentDeepInfoSep.equalsIgnoreCase("Verbose"))) {
                        System.out.println("otherTermsSep");
                        otherTermsSep.forEach(System.out::println);
                    }
                    if (!otherTermsSep.isEmpty()) {
                        for (String str : otherTermsSep) {
                            MyParenDecodedSep = MyParenDecodedSep + str;
                        }
                        if (MyParenDecodedSep.startsWith("-")) {
                            MyParenDecodedSep = MyParenDecodedSep.replaceFirst("\\-", "");
                        } else if (MyParenDecodedSep.startsWith("+")) {
                            MyParenDecodedSep = MyParenDecodedSep.replaceFirst("\\+", "");
                        }
                        MyParenEncodedSep = MyParenDecodedSep;
                        if ((DevelopmentDeepInfoFlagSep) || (GBLSilentDeepInfoSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Braces:IndConst:String:" + StrIntegr.substring(oldposition) + " MapType=" + MapType + " MyParenEncodedSep=" + MyParenEncodedSep + " MyParenDecodedSep=" + MyParenDecodedSep);
                            System.out.println("Braces:IndConst:numberofcharsread=" + numberofcharsread + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " tempAlignCharRead=" + tempAlignCharRead);
                        }
                    }
                    if ((DevelopmentDeepInfoFlagSep) || (GBLSilentDeepInfoSep.equalsIgnoreCase("Verbose"))) {
                        System.out.println("ConstantTermsSep");
                        ConstantTermsSep.forEach(System.out::println);
                    }
                    if (!ConstantTermsSep.isEmpty()) {
                        for (String str : ConstantTermsSep) {
                            MyParenDecodedSep = MyParenDecodedSep + str;
                        }
                        if (MyParenDecodedSep.startsWith("-")) {
                            MyParenDecodedSep = MyParenDecodedSep.replaceFirst("\\-", "");
                        } else if (MyParenDecodedSep.startsWith("+")) {
                            MyParenDecodedSep = MyParenDecodedSep.replaceFirst("\\+", "");
                        }
                        MyParenEncodedSep = MyParenDecodedSep;
                        if ((DevelopmentDeepInfoFlagSep) || (GBLSilentDeepInfoSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Braces:Constant:String:" + StrIntegr.substring(oldposition) + " MapType=" + MapType + " MyParenEncodedSep=" + MyParenEncodedSep + " MyParenDecodedSep=" + MyParenDecodedSep);
                            System.out.println("Braces:Constant:numberofcharsread=" + numberofcharsread + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " tempAlignCharRead=" + tempAlignCharRead);
                        }
                    }
                    if ((DevelopmentDeepInfoFlagSep) || (GBLSilentDeepInfoSep.equalsIgnoreCase("Verbose"))) {
                        System.out.println("MixedExpressionTermsSep");
                        MixedExpressionTermsSep.forEach(System.out::println);
                    }
                    if (!MixedExpressionTermsSep.isEmpty()) {
                        if (!ConstantTermsSep.isEmpty()) {
                            for (String str : ConstantTermsSep) {
                                IntegreNeurtralMultiplier = IntegreNeurtralMultiplier + str;
                            }
                            MyParenEncodedSep = "";
                            MyParenDecodedSep = "";
                        }
                        if (!otherTermsSep.isEmpty()) {
                            for (String str : otherTermsSep) {
                                IntegreNeurtralMultiplier = IntegreNeurtralMultiplier + str;
                            }
                            MyParenEncodedSep = "";
                            MyParenDecodedSep = "";
                        }
                        if (IntegreNeurtralMultiplier.startsWith("*")) {
                            IntegreNeurtralMultiplier = IntegreNeurtralMultiplier.replaceFirst("\\*", "");
                        } else if (IntegreNeurtralMultiplier.startsWith("/")) {
                            IntegreNeurtralMultiplier = IntegreNeurtralMultiplier.replaceFirst("/", "");
                        }
                        if (!IntegreNeurtralMultiplier.isEmpty()) {
                            MyParenDecodedSep = IntegreNeurtralMultiplier + "*" + MyParenDecodedSep;
                        } else {
                            MyParenEncodedSep = MyParenDecodedSep;
                        }
                    }
                    otherTermsSep.clear();
                    ConstantTermsSep.clear();
                    if (!ConstantTermsSep.isEmpty() || (!otherTermsSep.isEmpty())) {
                        System.out.println("Integr:parseBaseIntegr:(:Exception:ConstantTermsSep.isEmpty()=" + ConstantTermsSep.isEmpty() + " otherTermsSep.isEmpty()=" + otherTermsSep.isEmpty());
                        throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "Parenthesis Expression:NOT EMPTY:SimpleTerm:parseBaseSimple:StrTerm.length()=" + StrIntegr.substring(oldposition).length());
                    } else {
                        for (String str : MixedExpressionTermsSep) {
                            MyParenDecodedSep = MyParenDecodedSep + str;
                        }

                    }
                    MyParenEncodedSep = MyParenDecodedSep;

                    if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                        System.out.println("Integr:parseBaseIntegr:(: MyParenDecodedSep=" + MyParenDecodedSep + " MyParenEncodedSep=" + MyParenEncodedSep + " IntegreNeurtralMultiplier=" + IntegreNeurtralMultiplier);
                        System.out.println("Integr:parseBaseIntegr:(: Expression=" + StrIntegr.substring(oldposition, posIntegr) + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                        System.out.println("Integr:parseBaseIntegr:(:IsAConstant: ExpressionFlag=" + IsAConstant(MyParenDecodedSep, DiffWithRespTo) + " StrIsAConstant=" + StrIsAConstant);
                    }
                    String TempExprn = MyParenEncodedSep;
                    if (IsAConstant(TempExprn, DiffWithRespTo)) {
                        final String TempExprnFullFunc = TempExprn;
                        x = () -> IntegreNeurtralMultiplier + "*" + "(" + TempExprnFullFunc + ")";
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Integr:parseBaseIntegr:(:NumberExpression:x.IntegrExpr()=" + x.IntegrExpr());
                        }
                        xTermsSep.clear();
                        otherTermsSep.clear();
                        ConstantTermsSep.clear();
                        MixedExpressionTermsSep.clear();
                        IntegreNeurtralMultiplier = "";
                        return x;
                    } else if ((!IsAConstant(TempExprn, DiffWithRespTo))
                            && ((StrIsAConstant.equalsIgnoreCase("IndConstantExpression")) || (StrIsAConstant.equalsIgnoreCase("IndConstant")))) {
                        final String TempExprnFullFunc = TempExprn;
                        if ((TempExprnFullFunc.contains("(")) && (TempExprnFullFunc.contains(")")) && (MyParenDecodedSep.contains("(")) && (MyParenDecodedSep.contains(")"))) {
                            x = (() -> IntegreNeurtralMultiplier + "*" + TempExprnFullFunc + "@" + "Parenthesis" + "@" + IntegreNeurtralMultiplier + "*" + MyParenDecodedSep);
                        } else {
                            x = (() -> IntegreNeurtralMultiplier + "*" + "(" + TempExprnFullFunc + ")" + "@" + "Parenthesis" + "@" + "(" + IntegreNeurtralMultiplier + "*" + MyParenDecodedSep + ")");
                        }
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Integr:parseBaseIntegr:(:IndConstantExpression:MyParenDecodedSep=" + MyParenDecodedSep + " x.IntegrExpr()=" + x.IntegrExpr());
                        }
                        log.info("Integr:parseBaseIntegr:(: Function:posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                        xTermsSep.clear();
                        otherTermsSep.clear();
                        ConstantTermsSep.clear();
                        MixedExpressionTermsSep.clear();
                        IntegreNeurtralMultiplier = "";
                        return x;
                    } else {
                        //throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "Parenthesis Expression:IS NULL:SimpleTerm:parseBaseSimple:Nested Parenthesis: StrTerm.length()=" + StrDiff.substring(oldposition).length() + " OpenBraces=" + OpenBracesCount + " CloseBraces=" + CloseBracesCount + " StrIsAConstant=" + StrIsAConstant);
                        System.out.println("Integr:parseBaseIntegr:(:Exception:OpenBraces=" + OpenBraces + " CloseBraces=" + CloseBraces + " StrIsAConstant=" + StrIsAConstant + " TempExprn=" + TempExprn);
                    }
                    String ProductDiff = "";
                    String QuotientDiff = "";
                    if (ParenOperator == '*') {
                        ProductDiff = "" + (char) ParenOperator;
                    } else if (ParenOperator == '/') {
                        QuotientDiff = "" + (char) ParenOperator;
                    }
                    if (((MyParenDecodedSep == null) || (MyParenDecodedSep.equalsIgnoreCase(""))) && (posIntegr >= startPos1) && (posIntegr < StrIntegr.length())) {
                        //TempExprn = StrDiff.substring(startPos, posDiff);
                        if (!xTermsSep.isEmpty()) {
                            int j = 0;
                            for (String str : xTermsSep) {
                                if (j == 0) {
                                    MyParenDecodedSep = str;
                                } else if (j == 1) {
                                    MyParenEncodedSep = str;
                                    if (str.startsWith("*")) {
                                        ProductDiff = "*";
                                    } else if (str.startsWith("/")) {
                                        QuotientDiff = "/";
                                    }
                                }
                                j++;
                                if (j >= 2) {
                                    break;
                                }
                            }
                            if (MyParenDecodedSep.startsWith("-")) {
                                MyParenDecodedSep = MyParenDecodedSep.replaceFirst("\\-", "");
                            } else if (MyParenDecodedSep.startsWith("+")) {
                                MyParenDecodedSep = MyParenDecodedSep.replaceFirst("\\+", "");
                            }
                            if (j < 1) {
                                MyParenEncodedSep = MyParenDecodedSep;
                            }
                            if ((DevelopmentDeepInfoFlagSep) || (GBLSilentDeepInfoSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Integre:Braces:Variable:String:" + StrIntegr.substring(oldposition) + " MapType=" + MapType + " MyParenEncodedSep=" + MyParenEncodedSep + " MyParenDecodedSep=" + MyParenDecodedSep);
                            }
                        }
                        if ((ProductDiff.equalsIgnoreCase("*")) || (QuotientDiff.equalsIgnoreCase("/"))) {
                            Exprn = MyParenDecodedSep + MyParenEncodedSep;
                        } else {
                            Exprn = MyParenDecodedSep;
                        }
                        String LocalMyParenDecodedSep = MyParenDecodedSep;
                        String LocalMyParenEncodedSep = MyParenEncodedSep;
                        final String FinOrgLocalMyParenDecodedSep = MyParenDecodedSep;
                        final String FinOrgLocalMyParenEncodedSep = MyParenEncodedSep;
                        Exprn = MyParenDecodedSep;//StrIntegr.substring(startcount, posDiff - 1);
                        Map<String, String> variablesBackupState = new HashMap();
                        depthBackUpRestore++;
                        StrKeyBackUpRestore = FileSepBackUpRestore + "Integr:parseBaseIntegr:Parenthesis:Argument";
                        BackupDiffIntegrStateAll(variablesBackupState);
                        MathsContxtLAv.ChaosPrevention();
                        InitState();
                        if ((LocalMyParenDecodedSep.contains("(")) && (LocalMyParenDecodedSep.contains(")"))) {
                            LocalMyParenDecodedSep = LocalMyParenDecodedSep.replaceFirst("\\(", "").replaceFirst("\\)", "");
                            System.out.println(ConsoleColors.BLUE + "Diff:parseBaseDiff:Diff:MyParenDecodedSep:LocalMyParenDecodedSep=" + LocalMyParenDecodedSep + ConsoleColors.RESET);
                        }
                        arg1 = parseDiff(LocalMyParenDecodedSep, variables, DiffWithRespTo, MapType, IntegrORDiffr);
                        if (!AutoGenSilentFlag) {
                            System.out.println(ConsoleColors.GREEN + "Diff:parseBaseDiff:Diff:MyParenDecodedSep:arg1.DiffExpr()=" + arg1.DiffExpr() + " LocalMyParenDecodedSep=" + LocalMyParenDecodedSep + ConsoleColors.RESET);
                        }

                        if ((LocalMyParenEncodedSep.contains("(")) && (LocalMyParenEncodedSep.contains(")"))) {
                            LocalMyParenEncodedSep = LocalMyParenEncodedSep.replaceFirst("\\(", "").replaceFirst("\\)", "");
                            System.out.println(ConsoleColors.BLUE + "Diff:parseBaseDiff:Diff:MyParenEncodedSep:LocalMyParenEncodedSep=" + LocalMyParenEncodedSep + ConsoleColors.RESET);
                        }
                        if (LocalMyParenEncodedSep.startsWith("*")) {
                            LocalMyParenEncodedSep = LocalMyParenEncodedSep.replaceFirst("\\*", "");
                            System.out.println(ConsoleColors.BLUE + "Diff:parseBaseDiff:Diff:MyParenEncodedSep:LocalMyParenEncodedSep=" + LocalMyParenEncodedSep + ConsoleColors.RESET);
                        } else if (LocalMyParenEncodedSep.startsWith("/")) {
                            LocalMyParenEncodedSep = LocalMyParenEncodedSep.replaceFirst("/", "");
                            System.out.println(ConsoleColors.BLUE + "Diff:parseBaseDiff:Diff:MyParenEncodedSep:LocalMyParenEncodedSep=" + LocalMyParenEncodedSep + ConsoleColors.RESET);
                        }
                        arg2 = parseDiff(LocalMyParenEncodedSep, variables, DiffWithRespTo, MapType, IntegrORDiffr);
                        if (!AutoGenSilentFlag) {
                            System.out.println(ConsoleColors.GREEN + "Diff:parseBaseDiff:Diff:MyParenEncodedSep:arg2.DiffExpr()=" + arg2.DiffExpr() + " LocalMyParenEncodedSep=" + LocalMyParenEncodedSep + ConsoleColors.RESET);
                        }
                        RestoreDiffIntegrStateAll(variablesBackupState);
                        depthBackUpRestore--;
                        StrKeyBackUpRestore = FileSepBackUpRestore;
                        final String MyTemp1 = arg1.DiffExpr();
                        final String MyTemp2 = arg2.DiffExpr();
                        final String MyTempProduct = ProductDiff;
                        final String MyTempQuotient = QuotientDiff;
                        final String finLocalMyParenDecodedSep = LocalMyParenDecodedSep;
                        final String finLocalMyParenEncodedSep = LocalMyParenEncodedSep;
                        if (ProductDiff.equalsIgnoreCase("*")) {
                            IntegrExpr arg4 = parseIntegr(finLocalMyParenEncodedSep, variables, DiffWithRespTo, MapType, IntegrORDiffr);
                            final String IntegrateMyTemp4 = arg4.IntegrExpr();

                            String IntegrateMyTemp3 = finLocalMyParenEncodedSep;
                            IntegrExpr arg5 = parseIntegr(MyTemp1 + "*" + IntegrateMyTemp4, variables, DiffWithRespTo, MapType, IntegrORDiffr);
                            final String IntegrateMyTemp5 = arg5.IntegrExpr();

                            arg3 = (() -> FinOrgLocalMyParenDecodedSep + FinOrgLocalMyParenEncodedSep + "@" + "Parenthesis" + "@" + IntegrateMyTemp4 + "+" + "(" + IntegrateMyTemp5 + ")");
                            System.out.println(ConsoleColors.GREEN + "Integr:parseBaseIntegr:MyParenEncodedSep:arg3.IntegrExpr()=" + arg3.IntegrExpr() + " LocalMyParenEncodedSep=" + LocalMyParenEncodedSep + ConsoleColors.RESET);
                        } else if (QuotientDiff.equalsIgnoreCase("/")) {
                            System.out.println(ConsoleColors.RED + "Integr:parseBaseIntegr:MyParenEncodedSep:Error:arg2.DiffExpr()=" + arg2.DiffExpr() + " LocalMyParenEncodedSep=" + LocalMyParenEncodedSep + ConsoleColors.RESET);
                        }
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Integr:parseBaseIntegr:(:ParenthesisExpression:arg:With DiffWithRespTo:Exprn=" + MyParenDecodedSep + MyParenEncodedSep + " arg3.DiffExpr()=" + arg3.IntegrExpr());
                            System.out.println("Integr:parseBaseIntegr:(:ParenthesisExpression:arg:With DiffWithRespTo:arg1.DiffExpr()=" + arg1.DiffExpr());
                            System.out.println("Integr:parseBaseIntegr:(:ParenthesisExpression:arg:With DiffWithRespTo:arg2.DiffExpr()=" + arg2.DiffExpr());
                        }
                        ParanExprFlag = false;
                        ParenthesisFlag = false;
                        log.info("Integr:parseBaseIntegr:Function Argument:arg.IntegrExpr()=" + arg3.IntegrExpr());
                        ParanExprInProgressFlag = false;
                        log.info("Integr:parseBaseIntegr:Function Argument:argstartpos=" + argstartpos + " argEndpos=" + argEndpos + " Str.length()=" + StrDiff.length());
                        //(name + "@" + "Parenthesis" + "@" + ParanDiffExpr) )
                        if (arg3.IntegrExpr().endsWith("@Parenthesis@")) {
                            final String MyTemp3 = Exprn;
                            x = (() -> MyTemp3 + "@" + "Parenthesis" + "@" + MyParenDecodedSep);
                            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Integr:parseBaseIntegr:(:ParenthesisExpression:arg:EndsWith:MyParenEncoded=" + MyParenDecodedSep + " arg.DiffExpr()=" + arg1.DiffExpr() + " x.DiffExpr()" + x.IntegrExpr());
                            }
                        } else {
                            final String ParaDiff = arg3.IntegrExpr();
                            if (IsAConstant(ParaDiff, DiffWithRespTo)) {
                                x = (() -> ParaDiff);
                                if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Integr:parseBaseIntegr:(:ParenthesisExpression:arg:With x:MyParenEncoded=" + MyParenDecodedSep + " arg.DiffExpr()=" + arg1.DiffExpr() + " x.DiffExpr()" + x.IntegrExpr());
                                }
                            } else {
                                x = (() -> ParaDiff);
                                if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Integr:parseBaseIntegr:(1:ParenthesisExpression:MyParenEncoded=" + MyParenDecodedSep + " ParaDiff=" + ParaDiff + " StrIsAConstant=" + StrIsAConstant + " x.DiffExpr()=" + x.IntegrExpr());
                                }
                            }
                        }
                    } else if ((!MyParenEncodedSep.equalsIgnoreCase("")) && (!MixedExpressionTermsSep.isEmpty())) {
                        String LocalMyParenEncodedSep = MyParenEncodedSep;
                        Map<String, String> variablesBackupState = new HashMap();
                        depthBackUpRestore++;
                        StrKeyBackUpRestore = FileSepBackUpRestore + "Integr:parseBaseIntegr:MixedExpressionTermsSep:Argument";
                        BackupDiffIntegrStateAll(variablesBackupState);
                        MathsContxtLAv.ChaosPrevention();
                        InitState();

                        if ((LocalMyParenEncodedSep.contains("(")) && (LocalMyParenEncodedSep.contains(")")) && (!LocalMyParenEncodedSep.startsWith("*")) && (!LocalMyParenEncodedSep.startsWith("/"))) {
                            LocalMyParenEncodedSep = LocalMyParenEncodedSep.replaceFirst("\\(", "").replaceFirst("\\)", "");
                            System.out.println(ConsoleColors.BLUE + "Diff:parseBaseDiff:Diff:MixedExpressionTermsSep:LocalMyParenEncodedSep=" + LocalMyParenEncodedSep + ConsoleColors.RESET);
                        }
                        arg1 = parseDiff(LocalMyParenEncodedSep, variables, DiffWithRespTo, MapType, "Diffr");
                        RestoreDiffIntegrStateAll(variablesBackupState);
                        depthBackUpRestore--;
                        StrKeyBackUpRestore = FileSepBackUpRestore;

                        final String MyTemp3 = LocalMyParenEncodedSep;
                        final String MyTemp4 = arg1.DiffExpr();
                        x = (() -> MyTemp3 + "@" + "Parenthesis" + "@" + MyTemp4);

                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Integr:parseBaseIntegr:MixedExpressionTermsSep:MyParenEncodedSep=" + MyParenEncodedSep + " StrIsAConstant=" + StrIsAConstant + " x.IntegrExpr()=" + x.IntegrExpr());
                        }
                    } else {
                        final String ParaDiff = arg3.IntegrExpr();
                        final String ParaDiff1 = Exprn;
                        if (!ParaDiff.isBlank()) {
                            x = (() -> ParaDiff1 + "@" + "Parenthesis" + "@" + ParaDiff);
                        }
                        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Integr:parseBaseIntegr:(2:ParenthesisExpression:MyParenDecodedSep=" + MyParenDecodedSep + " ParaDiff=" + ParaDiff + " StrIsAConstant=" + StrIsAConstant + " x.IntegrExpr()=" + x.IntegrExpr());
                        }
                    }
                    posIntegr = advanceOneTerm(StrIntegr, posIntegr);
                    if ((posIntegr > -1) && (posIntegr < StrIntegr.length())) {
                        chIntegr = StrIntegr.charAt(posIntegr);
                    } else {
                        chIntegr = -1;
                        posIntegr = StrIntegr.length();
                    }
                    if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                        System.out.println("Integr:parseBaseIntegr:(3:ParenthesisExpression:MyParenEncodedSep=" + MyParenDecodedSep + " StrIsAConstant=" + StrIsAConstant + " x.IntegrExpr()=" + x.IntegrExpr() + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
                    }
                } else {
                    if ((IsNotAnOperator(chIntegr) && (IsNotANumber(chIntegr))) && (chIntegr != 0) && (chIntegr != -1) && (chIntegr != '(')) {
                        if ((chIntegr != -1) && (chIntegr != 0) && (posIntegr >= 1) && (posIntegr < StrIntegr.length()) && (IsNumber(chIntegr))) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "Integr:parseBase:Please Check Code:Should NOT reach Here:Unexpected: " + (char) chIntegr + " int=" + (int) chIntegr + " posIntegr=" + posIntegr + " StrIntegr=" + StrIntegr.substring(posIntegr, StrIntegr.length()));
                        } else if ((chIntegr != -1) && (chIntegr != 0) && (chIntegr != '^') && (posIntegr >= 1) && (posIntegr < StrIntegr.length()) && (IsOperator(chIntegr))) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "Integr:parseBase:Please Check Equation Operators:Should NOT reach Here:Unexpected: " + (char) chIntegr + " int=" + (int) chIntegr + " posIntegr=" + posIntegr + " StrIntegr=" + StrIntegr.substring(posIntegr, StrIntegr.length()));
                        } else if ((chIntegr != -1) && (chIntegr != 0) && (chIntegr != '^') && (posIntegr >= 1) && (posIntegr < StrIntegr.length())) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "Integr:parseBase:Unexpected: " + (char) chIntegr + " int=" + (int) chIntegr + " posIntegr=" + posIntegr + " StrIntegr=" + StrIntegr.substring(posIntegr, StrIntegr.length()));
                        } else {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "Integr:parseBase:Unexpected char: " + (char) chIntegr + " int=" + (int) chIntegr + " posIntegr=" + posIntegr + " StrIntegr=" + StrIntegr.substring(posIntegr, StrIntegr.length()));
                        }
                    }
                }
                if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                    System.out.println("Integr:parseBaseIntegr:Return Value::x=" + x.IntegrExpr());
                }
                xTermsSep.clear();
                otherTermsSep.clear();
                ConstantTermsSep.clear();
                MixedExpressionTermsSep.clear();
                return x;
            }
        }.parseIntegrExpr();
    }

    static void Split(String MyString, String DiffWithRespTo) {
        log.info("Diff:Split:Initial LookAhead Stack: Start Context:MyString=" + MyString
                + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
        int Operator = 0;
        String Temp = "";
        String[] Factors = MyString.split("@");

        if ((Factors.length == 3) && (Factors[1].equalsIgnoreCase("Polynomial"))) {
            FactorsExpr = Factors[2];
            FactorsDiffExpr = Factors[0];
            log.info("Diff:Split:Polynomial: Start Context: FactorsExpr=" + FactorsExpr + " FactorsDiffExpr=" + FactorsDiffExpr + " Factors[0]=" + Factors[0] + " Factors[2]=" + Factors[2]);
        } else if ((Factors.length == 3) && (Factors[1].equalsIgnoreCase("Factor"))) {
            //FactorsExpr = Factors[0];
            FactorsExpr = "1.0/2.0*" + DiffWithRespTo + "^2.0";
            //FactorsDiffExpr = Factors[2];
            //Diff of x-> "1"
            FactorsDiffExpr = "1.0/2.0*" + DiffWithRespTo + "^2.0";
            log.info("Diff:Split:Factor: Start Context: FactorsExpr=" + FactorsExpr + " FactorsDiffExpr=" + FactorsDiffExpr + " Factors[0]=" + Factors[0] + " Factors[2]=" + Factors[2]);
        } else if ((Factors.length == 3) && (Factors[1].equalsIgnoreCase("Constant"))) {
            FactorsExpr = Factors[0];
            FactorsDiffExpr = Factors[2];
            log.info("Diff:Split:Generic Constant: Start Context: FactorsExpr=" + FactorsExpr + " FactorsDiffExpr=" + FactorsDiffExpr + " Factors[0]=" + Factors[0] + " Factors[2]=" + Factors[2]);
        } else if ((Factors.length == 3) && (Factors[1].equalsIgnoreCase("IndependentFactor"))) {
            FactorsExpr = Factors[0];
            FactorsDiffExpr = Factors[2];
            log.info("Diff:Split:IndependentFactor: Start Context: FactorsExpr=" + FactorsExpr + " FactorsDiffExpr=" + FactorsDiffExpr + " Factors[0]=" + Factors[0] + " Factors[2]=" + Factors[2]);
        } else if ((Factors.length == 3) && (Factors[1].equalsIgnoreCase("ExtremityFactor"))) {
            FactorsExpr = Factors[0];
            FactorsDiffExpr = Factors[2];
            log.info("Diff:Split:ExtremityFactor: Start Context: FactorsExpr=" + FactorsExpr + " FactorsDiffExpr=" + FactorsDiffExpr + " Factors[0]=" + Factors[0] + " Factors[2]=" + Factors[2]);
        } else if ((Factors.length == 3) && (Factors[1].equalsIgnoreCase("Unknown"))) {
            FactorsExpr = Factors[0];
            FactorsDiffExpr = Factors[2];
            log.info("Diff:Split:Unknown: Start Context: FactorsExpr=" + FactorsExpr + " FactorsDiffExpr=" + FactorsDiffExpr + " Factors[0]=" + Factors[0] + " Factors[2]=" + Factors[2]);
        }
        log.info("Diff:Split:Final:FactorsExpr=" + FactorsExpr);
        log.info("Diff:Split:Final:ParanExpr=" + ParanExpr);
        log.info("Diff:Split:Final:ParanDiffExpr=" + ParanDiffExpr);
        log.info("Diff:Split:Final:FactorsDiffExpr=" + FactorsDiffExpr);
    }

    static void Expr_Func_Split(String MyString, String DiffWithRespTo) {
        log.info("Diff:Expr_Func_Split:Initial LookAhead Stack: Start Context:MyString=" + MyString + " posDiff=" + posDiff + " chDiff=" + (char) chDiff);
        String[] Factors = MyString.split("@");
        String StrSignFactor0 = "";
        int Operator = 0;
        String Temp = "";
        log.info("Diff:Expr_Func_Split:@Input@:split:MyString=" + MyString);
        log.info("Diff:Expr_Func_Split:@Input@:split:Factors.length=" + Factors.length);
        if ((Factors.length == 6) && (Factors[1].equalsIgnoreCase("FunctionArgument"))) {
            //(name + "@" + "FunctionArgument" + "@" + "Factor" + "@" + name + "@" + "FactorDiff" + "@" +arg.evalDiffExpr()));
            String MyFactor = Factors[0];
            String MyFactorDiff = Factors[5];
            FactorsExpr = MyFactor;
            FactorsDiffExpr = MyFactorDiff;
            FunctionDiffExpr = MyFactorDiff;
        } else if ((Factors.length == 5) && (Factors[1].equalsIgnoreCase("Function"))) {
            log.info("Diff:Expr_Func_Split:Function:Factors.length=" + Factors.length);
            //name + "@" + "Function" + "@" + "Factor" + "@" + FactorsExpr + "@" + FunctionDiffExpr));
            //sin@Function@Factor@(2.0*x)@cos(2.0*x)*2.0
            FactorsExpr = Factors[3];
            StrSignFactor0 = Factors[0];
            if (Factors[0].startsWith("+")) {
                Factors[0] = Factors[0].replaceFirst("\\+", "");
            } else if (Factors[0].startsWith("-")) {
                Factors[0] = Factors[0].replaceFirst("-", "");
            }
            FunctionName = Factors[0];
            FunctionExpr = functionsDiff.get(Factors[0]) + "(" + Factors[3] + ")";
            FactorsDiffExpr = Factors[4];
            String[] StrMyTemp = new String[4];
            if ((FactorsDiffExpr != null) && (!FactorsDiffExpr.contains("\\(")) && (!FactorsDiffExpr.contains("\\)"))) {
                FunctionDiffExpr = FunctionExpr;
                FunctionName = Factors[0];
                MyParenEncodedSep = ParanDiffExpr;
                if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                    System.out.println("Diff:Expr_Func_Split:Middle Final:Factors.length=" + Factors.length + " MyString=" + MyString);
                    System.out.println("Diff:Expr_Func_Split:Middle Final:FactorsExpr=" + FactorsExpr);
                    System.out.println("Diff:Expr_Func_Split:Middle Final:FunctionExpr=" + FunctionExpr);
                    System.out.println("Diff:Expr_Func_Split:Middle Final:ParanExpr=" + ParanExpr);
                    System.out.println("Diff:Expr_Func_Split:Middle Final:ParanDiffExpr=" + ParanDiffExpr);
                    System.out.println("Diff:Expr_Func_Split:Middle Final:FactorsDiffExpr=" + FactorsDiffExpr);
                    System.out.println("Diff:Expr_Func_Split:Middle Final:FunctionDiffExpr=" + FunctionDiffExpr);
                    System.out.println("Diff:Expr_Func_Split:Middle Final:FunctionName=" + FunctionName);
                    System.out.println("Diff:Expr_Func_Split:Middle Final:Function:FunctionDiffExpr=" + FunctionDiffExpr);
                }
                return;
            }
            if ((StrMyTemp.length >= 2) && (StrMyTemp[1] != null) && (!StrMyTemp[1].contains("\\(")) && (!StrMyTemp[1].contains("\\)"))) {
                FactorsDiffExpr = StrMyTemp[1];
            }
            if (IsAConstant(FactorsDiffExpr, DiffWithRespTo)) {
                if (FactorsDiffExpr.equalsIgnoreCase("1.0")) {
                    FunctionDiffExpr = FunctionExpr;
                    log.info("Diff:Expr_Func_Split:@Function@:IsAConstant:FunctionDiffExpr=" + FunctionDiffExpr + " FunctionExpr=" + FunctionExpr);
                } else if ((FactorsDiffExpr.equalsIgnoreCase("-1.0")) && (FunctionExpr.startsWith("-")) && (StrSignFactor0.startsWith("-"))) {
                    FunctionDiffExpr = FunctionExpr;
                    log.info("Diff:Expr_Func_Split:@Function@:IsAConstant:FunctionDiffExpr=" + FunctionDiffExpr + " FunctionExpr=" + FunctionExpr);
                } else if ((FactorsDiffExpr.equalsIgnoreCase("-1.0")) && (FunctionExpr.startsWith("-"))) {
                    FunctionDiffExpr = FunctionExpr.replaceFirst("-", "");
                    log.info("Diff:Expr_Func_Split:@Function@:IsAConstant:FunctionDiffExpr=" + FunctionDiffExpr + " FunctionExpr=" + FunctionExpr);
                } else if (FactorsDiffExpr.equalsIgnoreCase("-1.0")) {
                    FunctionDiffExpr = "-" + FunctionExpr;
                    log.info("Diff:Expr_Func_Split:@Function@:IsAConstant:FunctionDiffExpr=" + FunctionDiffExpr + " FunctionExpr=" + FunctionExpr);
                } else if ((!FactorsDiffExpr.equalsIgnoreCase("-1.0")) && (!FactorsDiffExpr.equalsIgnoreCase("0.0"))) {
                    FunctionDiffExpr = "(" + FactorsDiffExpr + ")" + "*" + FunctionExpr;
                    log.info("Diff:Expr_Func_Split:@Function@:IsAConstant:FunctionDiffExpr=" + FunctionDiffExpr + " FunctionExpr=" + FunctionExpr);
                } else if (FactorsDiffExpr.equalsIgnoreCase("0.0")) {
                    FunctionDiffExpr = FunctionExpr;
                    log.info("Diff:Expr_Func_Split:@Function@:IsAConstant:FunctionDiffExpr=" + FunctionDiffExpr + " FunctionExpr=" + FunctionExpr);
                }
                if (FunctionDiffExpr.startsWith("-")) {
                    Operator = '-';
                    Temp = FunctionDiffExpr.replaceFirst("-", "");
                    FunctionDiffExpr = (char) Operator + Temp;
                    log.info("Diff:Expr_Func_Split:@Function@:IsAConstant:SignFlip-:FactorsDiffExpr=" + FactorsDiffExpr);
                    log.info("Diff:Expr_Func_Split:@Function@:else:SignFlip-:FunctionExpr=" + FunctionExpr);
                    log.info("Diff:Expr_Func_Split:@Function@:IsAConstant:SignFlip-:FunctionDiffExpr=" + FunctionDiffExpr);
                }
                log.info("Diff:Expr_Func_Split:@Function@:IsAConstant:FactorsDiffExpr=" + FactorsDiffExpr);
                log.info("Diff:Expr_Func_Split:@Function@:else:FunctionExpr=" + FunctionExpr);
                log.info("Diff:Expr_Func_Split:@Function@:IsAConstant:FunctionDiffExpr=" + FunctionDiffExpr);
            } else if ((!IsAConstant(FactorsDiffExpr, DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("Var")) || (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
                if (FactorsDiffExpr.equalsIgnoreCase(DiffWithRespTo)) {
                    FunctionDiffExpr = FunctionExpr;
                } else if (FactorsDiffExpr.equalsIgnoreCase("-" + DiffWithRespTo)) {
                    FunctionExpr = functionsIntegr.get(Factors[0]) + Factors[3];;
                    FunctionDiffExpr = FunctionExpr;
                } else if (FactorsDiffExpr.equalsIgnoreCase("+" + DiffWithRespTo)) {
                    FunctionDiffExpr = FunctionExpr;
                }
                if ((FunctionDiffExpr.startsWith("-")) && (FactorsDiffExpr.startsWith("-"))) {
                    Operator = '+';
                    Temp = FunctionDiffExpr.replaceFirst("-", "");
                    FunctionDiffExpr = Temp;
                    log.info("Diff:Expr_Func_Split:@Function@:if:FunctionDiffExpr=" + FunctionDiffExpr);
                } else if ((FunctionDiffExpr.startsWith("-")) && (!FactorsDiffExpr.startsWith("-"))) {
                    Operator = '-';
                    Temp = FunctionDiffExpr.replaceFirst("-", "");
                    FunctionDiffExpr = (char) Operator + Temp;
                    log.info("Diff:Expr_Func_Split:@Function@:else if:FunctionDiffExpr=" + FunctionDiffExpr);
                }
                log.info("Diff:Expr_Func_Split:@Function@:IsAVar OR VarExpression:FactorsDiffExpr=" + FactorsDiffExpr);
                log.info("Diff:Expr_Func_Split:@Function@:else:FunctionExpr=" + FunctionExpr);
                log.info("Diff:Expr_Func_Split:@Function@:IsAVar OR VarExpression:FunctionDiffExpr=" + FunctionDiffExpr);
            } else {
                log.info("Diff:Expr_Func_Split:@Function@:else:FactorsDiffExpr=" + FactorsDiffExpr);
                log.info("Diff:Expr_Func_Split:@Function@:else:FunctionExpr=" + FunctionExpr);
                log.info("Diff:Expr_Func_Split:@Function@:else:FunctionDiffExpr=" + FunctionDiffExpr);
                FunctionDiffExpr = FactorsDiffExpr + "*" + FunctionExpr;
//                if ((!FactorsDiffExpr.contains("+")) && (!FactorsDiffExpr.contains("+"))) {
//                    FunctionDiffExpr = FactorsDiffExpr + "*" + FunctionExpr;
//                    log.info("Diff:Expr_Func_Split:@Function@:else:FactorsDiffExpr=" + FactorsDiffExpr);
//                    log.info("Diff:Expr_Func_Split:@Function@:else:FunctionExpr=" + FunctionExpr);
//                    log.info("Diff:Expr_Func_Split:@Function@:else:FunctionDiffExpr=" + FunctionDiffExpr);
//                } else {
//                    FunctionDiffExpr = "(" + FactorsDiffExpr + ")" + "*" + FunctionExpr;
//                    log.info("Diff:Expr_Func_Split:@Function@:else:FunctionDiffExpr=" + FunctionDiffExpr);
//                }
                log.info("Diff:Expr_Func_Split:@Function@:else:FactorsDiffExpr=" + FactorsDiffExpr);
                log.info("Diff:Expr_Func_Split:@Function@:else:FunctionExpr=" + FunctionExpr);
                log.info("Diff:Expr_Func_Split:@Function@:else:FunctionDiffExpr=" + FunctionDiffExpr);
            }
        } else if ((Factors.length == 7) && (Factors[1].equalsIgnoreCase("Function"))) {
            //MyName + "@" + "Function" + "@" + "Factor" + "@" + (Factor)  + "@" + 0.0 + "@" + "ConstantExprn" + "@" +MyName+"("+Exprn + ")");
            FactorsExpr = Factors[0];
            ParanExpr = Factors[0];
            ParanDiffExpr = Factors[2];
            FunctionDiffExpr = Factors[6];
            log.info("Diff:Expr_Func_Split:@Parenthesis@:else:FactorsExpr=" + FactorsExpr);
            log.info("Diff:Expr_Func_Split:@Parenthesis@:else:ParanExpr=" + ParanExpr);
            log.info("Diff:Expr_Func_Split:@Parenthesis@:else:ParanDiffExpr=" + ParanDiffExpr);
            log.info("Diff:Expr_Func_Split:@Parenthesis@:else:FunctionDiffExpr=" + FunctionDiffExpr);
        } else if ((Factors.length == 3) && (Factors[1].equalsIgnoreCase("Parenthesis"))) {
            //(name + "@" + "Parenthesis" + "@" + ParanDiffExpr) );
            FactorsExpr = Factors[0];
            ParanExpr = Factors[0];
            ParanDiffExpr = Factors[2];
            log.info("Diff:Expr_Func_Split:@Parenthesis@:else:FactorsExpr=" + FactorsExpr);
            log.info("Diff:Expr_Func_Split:@Parenthesis@:else:ParanExpr=" + ParanExpr);
            log.info("Diff:Expr_Func_Split:@Parenthesis@:else:ParanDiffExpr=" + ParanDiffExpr);
            MyParenEncodedSep = ParanDiffExpr;
            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                System.out.println("Diff:Expr_Func_Split:@Parenthesis@:else:MyParenDecodedSep=" + MyParenDecodedSep);
                System.out.println("Diff:Expr_Func_Split:@Parenthesis@:else:MyParenEncodedSep=" + MyParenEncodedSep);
            }
        } else if ((Factors.length == 3) && (Factors[1].equalsIgnoreCase("Unknown"))) {
            FactorsExpr = Factors[0];
            FactorsDiffExpr = Factors[2];
        }
        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
            System.out.println("Diff:Expr_Func_Split:Final:Factors.length=" + Factors.length + " MyString=" + MyString);
            System.out.println("Diff:Expr_Func_Split:Final:FactorsExpr=" + FactorsExpr);
            System.out.println("Diff:Expr_Func_Split:Final:ParanExpr=" + ParanExpr);
            System.out.println("Diff:Expr_Func_Split:Final:ParanDiffExpr=" + ParanDiffExpr);
            System.out.println("Diff:Expr_Func_Split:Final:FactorsDiffExpr=" + FactorsDiffExpr);
            System.out.println("Diff:Expr_Func_Split:Final:FunctionDiffExpr=" + FunctionDiffExpr);
            System.out.println("Diff:Expr_Func_Split:Final:FunctionName=" + FunctionName);
        }
    }

    static void Split_Integr(String MyString, String DiffWithRespTo) {
        log.info("Integr:Split:Initial LookAhead Stack: Start Context:MyString=" + MyString + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
        int Operator = 0;
        String Temp = "";
        String[] Factors = MyString.split("@");
        FactorsExpr = "";
        ParanExpr = "";
        ParanDiffExpr = "";
        FactorsDiffExpr = "";
        FunctionDiffExpr = "";
        if ((Factors.length == 3) && (Factors[1].equalsIgnoreCase("Polynomial"))) {
            FactorsExpr = Factors[2];
            if ((Factors[0].equalsIgnoreCase(DiffWithRespTo)) && (FactorsExpr.equalsIgnoreCase(DiffWithRespTo))) {
                FactorsDiffExpr = "1.0";
            } else {
                FactorsDiffExpr = Factors[0];
            }
        } else if ((Factors.length == 3) && (Factors[1].equalsIgnoreCase("Factor"))) {
            //FactorsExpr = Factors[0];
            FactorsExpr = "1.0/2.0*" + DiffWithRespTo + "^2.0";
            //FactorsDiffExpr = Factors[2];
            //Diff of x-> "1"
            FactorsDiffExpr = "1.0/2.0*" + DiffWithRespTo + "^2.0";
        } else if ((Factors.length == 3) && (Factors[1].equalsIgnoreCase("Constant"))) {
            log.info("Integr:Split_Integr:Generic Constant: Start Context:posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
            FactorsExpr = Factors[0];
            FactorsDiffExpr = Factors[2];
        } else if ((Factors.length == 3) && (Factors[1].equalsIgnoreCase("IndependentFactor"))) {
            FactorsExpr = Factors[0];
            FactorsDiffExpr = Factors[2];
        } else if ((Factors.length == 3) && (Factors[1].equalsIgnoreCase("ExtremityFactor"))) {
            FactorsExpr = Factors[0];
            FactorsDiffExpr = Factors[2];
        } else if ((Factors.length == 3) && (Factors[1].equalsIgnoreCase("Unknown"))) {
            FactorsExpr = Factors[0];
            FactorsDiffExpr = Factors[2];
        }
        log.info("Integr:Split_Integr:Final:FactorsExpr=" + FactorsExpr);
        log.info("Integr:Split_Integr:Final:ParanExpr=" + ParanExpr);
        log.info("Integr:Split_Integr:Final:ParanDiffExpr=" + ParanDiffExpr);
        log.info("Integr:Split_Integr:Final:FactorsDiffExpr=" + FactorsDiffExpr);
        log.info("Integr:Split_Integr:Final:FunctionDiffExpr=" + FunctionDiffExpr);
        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
            System.out.println("Integr:Split_Integr:Final:FactorsExpr=" + FactorsExpr);
            System.out.println("Integr:Split_Integr:Final:ParanExpr=" + ParanExpr);
            System.out.println("Integr:Split_Integr:Final:ParanDiffExpr=" + ParanDiffExpr);
            System.out.println("Integr:Split_Integr:Final:FactorsDiffExpr=" + FactorsDiffExpr);
            System.out.println("Integr:Split_Integr:Final:FunctionDiffExpr=" + FunctionDiffExpr);
        }
    }

    static void Expr_Func_Split_Integr(String MyString, String DiffWithRespTo) {
        log.info("Integr:Expr_Func_Split_Integr:Initial LookAhead Stack: Start Context:MyString=" + MyString + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
        String[] Factors = MyString.split("@");
        String StrSignFactor0 = "";
        int Operator = 0;
        String Temp = "";
        if (Factors[0].startsWith("+")) {
            Factors[0] = Factors[0].replaceFirst("\\+", "");
        } else if (Factors[0].startsWith("-")) {
            Factors[0] = Factors[0].replaceFirst("-", "");
        }
        FunctionName = Factors[0];
        if ((Factors.length == 6) && (Factors[1].equalsIgnoreCase("FunctionArgument"))) {
            //(name + "@" + "FunctionArgument" + "@" + "Factor" + "@" + name + "@" + "FactorDiff" + "@" +arg.evalDiffExpr()));
            String MyFactor = Factors[0];
            String MyFactorDiff = Factors[5];
            FactorsExpr = MyFactor;
            FactorsDiffExpr = MyFactorDiff;
            FunctionDiffExpr = MyFactorDiff;
        } else if (((Factors.length == 5) || (Factors.length == 4)) && (Factors[1].equalsIgnoreCase("Function"))) {
            //name + "@" + "Function" + "@" + "Factor" + "@" + FactorsExpr + "@" + FunctionDiffExpr));
            //sin@Function@Factor@(2.0*x)@cos(2.0*x)*2.0
            FactorsExpr = Factors[3];
            if (Factors[0].startsWith("+")) {
                Factors[0] = Factors[0].replaceFirst("\\+", "");
            } else if (Factors[0].startsWith("-")) {
                Factors[0] = Factors[0].replaceFirst("\\-", "");
            }
            FunctionExpr = functionsIntegr.get(Factors[0]) + "(" + Factors[3] + ")";
            String[] StrMyTemp = new String[4];
            String StrTemp = "";
            if ((FactorsDiffExpr != null) && (!FactorsDiffExpr.contains("\\(")) && (!FactorsDiffExpr.contains("\\)"))) {
                //StrMyTemp = FactorsDiffExpr.split("[\\(\\)]");
                StrTemp = splitBraces(FactorsDiffExpr);
                log.info("Integr:Expr_Func_Split_Integr:@Function@:split:FactorsDiffExpr=" + FactorsDiffExpr + " StrMyTemp.length=" + StrMyTemp.length);
            }
            if ((StrTemp != null) && (!StrTemp.contains("\\(")) && (!StrTemp.contains("\\)"))) {
                FactorsDiffExpr = StrTemp;
            }
            if (IsAConstant(FactorsDiffExpr, DiffWithRespTo)) {
                if ((FactorsDiffExpr.contains("+")) || (FactorsDiffExpr.contains("-"))) {
                    FunctionDiffExpr = "(" + FactorsDiffExpr + ")" + "*" + FunctionExpr;
                } else {
                    FunctionDiffExpr = FactorsDiffExpr + "*" + FunctionExpr;
                }
                if (FunctionDiffExpr.contains("-")) {
                    Operator = '-';
                    Temp = FunctionDiffExpr.replace("-", "");
                    FunctionDiffExpr = (char) Operator + Temp;
                }
                log.info("Integr:Expr_Func_Split_Integr:@Function@:IsAConstant:FactorsDiffExpr=" + FactorsDiffExpr);
                log.info("Integr:Expr_Func_Split_Integr:@Function@:else:FunctionExpr=" + FunctionExpr);
                log.info("Integr:Expr_Func_Split_Integr:@Function@:IsAConstant:FunctionDiffExpr=" + FunctionDiffExpr);
            } else if ((!IsAConstant(FactorsDiffExpr, DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("Var")) || (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
                if (FactorsDiffExpr.equalsIgnoreCase(DiffWithRespTo)) {
                    FunctionDiffExpr = FunctionExpr;
                } else if (FactorsDiffExpr.equalsIgnoreCase("-" + DiffWithRespTo)) {
                    FunctionExpr = functionsIntegr.get(Factors[0]) + Factors[3];;
                    FunctionDiffExpr = FunctionExpr;
                } else if (FactorsDiffExpr.equalsIgnoreCase("+" + DiffWithRespTo)) {
                    FunctionDiffExpr = FunctionExpr;
                }
                if ((FunctionDiffExpr.startsWith("-")) && (FactorsDiffExpr.startsWith("-"))) {
                    Operator = '+';
                    Temp = FunctionDiffExpr.replaceFirst("-", "");
                    FunctionDiffExpr = Temp;
                } else if ((FunctionDiffExpr.startsWith("-")) && (!FactorsDiffExpr.startsWith("-"))) {
                    Operator = '-';
                    Temp = FunctionDiffExpr.replaceFirst("-", "");
                    FunctionDiffExpr = (char) Operator + Temp;
                }
                log.info("Integr:Expr_Func_Split_Integr:@Function@:IsAVar OR VarExpression:FactorsDiffExpr=" + FactorsDiffExpr);
                log.info("Integr:Expr_Func_Split_Integr:@Function@:else:FunctionExpr=" + FunctionExpr);
                log.info("Integr:Expr_Func_Split_Integr:@Function@:IsAVar OR VarExpression:FunctionDiffExpr=" + FunctionDiffExpr);
            } else {
                if ((FactorsDiffExpr != null) && (!FactorsDiffExpr.equalsIgnoreCase("")) && (!FactorsDiffExpr.equalsIgnoreCase(DiffWithRespTo))) {
                    FunctionDiffExpr = "(" + FactorsDiffExpr + ")" + "*" + FunctionExpr;
                } else {
                    log.info("Integr:Expr_Func_Split_Integr:@Function@:else:Cannot Integr:Function=" + FunctionExpr);
                    FunctionDiffExpr = FunctionExpr;
                }
                if (FunctionDiffExpr.contains("-")) {
                    Operator = '-';
                    Temp = FunctionDiffExpr.replace("-", "");
                    FunctionDiffExpr = (char) Operator + Temp;
                }
                log.info("Integr:Expr_Func_Split_Integr:@Function@:else:FactorsDiffExpr=" + FactorsDiffExpr);
                log.info("Integr:Expr_Func_Split_Integr:@Function@:else:FunctionExpr=" + FunctionExpr);
                log.info("Integr:Expr_Func_Split_Integr:@Function@:else:FunctionDiffExpr=" + FunctionDiffExpr);
            }
        } else if ((Factors.length == 3) && (Factors[1].equalsIgnoreCase("Parenthesis"))) {
            //(name + "@" + "Parenthesis" + "@" + ParanDiffExpr) );
            FactorsExpr = Factors[0];
            ParanExpr = Factors[0];
            ParanDiffExpr = Factors[2];
            if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                System.out.println("Integr:Expr_Func_Split_Integr:@Parenthesis@:else:FactorsExpr=" + FactorsExpr);
                System.out.println("Integr:Expr_Func_Split_Integr:@Parenthesis@:else:ParanExpr=" + ParanExpr);
                System.out.println("Integr:Expr_Func_Split_Integr:@Parenthesis@:else:ParanDiffExpr=" + ParanDiffExpr);
            }
        } else if ((Factors.length == 3) && (Factors[1].equalsIgnoreCase("Unknown"))) {
            FactorsExpr = Factors[0];
            FactorsDiffExpr = Factors[2];
        }
        if ((DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
            System.out.println("Integr:Expr_Func_Split_Integr:Final:Factors.length=" + Factors.length + " MyString=" + MyString);
            System.out.println("Integr:Expr_Func_Split_Integr:Final:FactorsExpr=" + FactorsExpr);
            System.out.println("Integr:Expr_Func_Split_Integr:Final:FunctionName=" + FunctionName);
            System.out.println("Integr:Expr_Func_Split_Integr:Final:ParanExpr=" + ParanExpr);
            System.out.println("Integr:Expr_Func_Split_Integr:Final:ParanDiffExpr=" + ParanDiffExpr);
            System.out.println("Integr:Expr_Func_Split_Integr:Final:FactorsDiffExpr=" + FactorsDiffExpr);
            System.out.println("Integr:Expr_Func_Split_Integr:Final:FunctionDiffExpr=" + FunctionDiffExpr);
        }
    }

    public static DiffExpr ApplyLambdaRules(String AlgoName, String CompleteExprn, String Term1, DiffExpr Diff1, String Term2, DiffExpr Diff2, String Term3, String Term4, String StrOperator, String Rule, String DiffWithRespTo, int TermOperator, String LowLevelRules, String MapType, String IntegrORDiffr) {
        log.info("Diff:ApplyLambdaRules:Initial :AlgoName(Calling Function)=" + AlgoName);
        log.info("Diff:ApplyLambdaRules:Initial :Term1=" + Term1);
        log.info("Diff:ApplyLambdaRules:Initial :Diff1.DiffExpr()=" + Diff1.DiffExpr());
        log.info("Diff:ApplyLambdaRules:Initial :Term2=" + Term2);
        log.info("Diff:ApplyLambdaRules:Initial :Diff2.DiffExpr()=" + Diff2.DiffExpr());
        log.info("Diff:ApplyLambdaRules:Initial :Term3=" + Term3);
        log.info("Diff:ApplyLambdaRules:Initial :Term4=" + Term4);
        log.info("Diff:ApplyLambdaRules:Initial :StrOperator=" + StrOperator);
        log.info("Diff:ApplyLambdaRules:Initial :Rule=" + Rule);
        log.info("Diff:ApplyLambdaRules:Initial :LowLevelRules=" + LowLevelRules);
        log.info("Diff:ApplyLambdaRules:Initial :SavedOperator=" + (char) SavedOperator);
        log.info("Diff:ApplyLambdaRules:Initial :TermOperator=" + (char) TermOperator);
        log.info("Diff:ApplyLambdaRules:Initial :DiffTermOperator=" + (char) DiffTermOperator);
        log.info("Diff:ApplyLambdaRules:Initial :");
        log.info("Diff:ApplyLambdaRules:Initial :");
        log.info("Diff:ApplyLambdaRules:Initial :");
        if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
            System.out.println("Diff:ApplyLambdaRules:Initial:AlgoName=" + AlgoName + " Rule=" + Rule + ":LowLevelRules=" + LowLevelRules + " StrIsAConstant=" + StrIsAConstant);
        }
        DiffExpr x = (() -> "");
        DiffrLambda y = (() -> "");
        boolean loadposDecrFlag = false;
        y = parseDiffExpr(AlgoName, CompleteExprn, Term1, Diff1, Term2, Diff2, Term3, Term4, StrOperator, Rule, DiffWithRespTo, TermOperator, LowLevelRules);
        final String MyString = y.Expr();
        x = (() -> "" + MyString);
        if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
            System.out.println("Diff:ApplyLambdaRules:Final:AlgoName=" + AlgoName + " Rule=" + Rule + ":LowLevelRules=" + LowLevelRules + " StrIsAConstant=" + StrIsAConstant + " x.DiffExpr()=" + x.DiffExpr() + " y.Expr()=" + y.Expr());
        }
        return x;
    }

    @FunctionalInterface
    public interface DiffrLambda {

        String Expr();
    }

    public static DiffrLambda parseDiffExpr(String AlgoName, String CompleteExprn, String Term1, DiffExpr Diff1, String Term2, DiffExpr Diff2, String Term3, String Term4, String StrOperator, String Rule, String DiffWithRespTo, int TermOperator, String LowLevelRules) {
        return new Object() {

            DiffrLambda parseDiff() {
                DiffrLambda x = (() -> "");
                final String Diff1DiffExpr = Diff1.DiffExpr();
                final String Diff2DiffExpr = Diff2.DiffExpr();
                if (Rule.equalsIgnoreCase("NoExponentRuleTerm")) {
                    x = parseNoExponentRuleTerm();
                    log.info("Diff:parseOper:NoExponentRuleTerm:x.Expr()=" + x.Expr());
                } else if (Rule.equalsIgnoreCase("NoExponentRuleDiff")) {
                    x = parseNoExponentRuleDiff();
                    log.info("Diff:parseOper:NoExponentRuleDiff:x.Expr()=" + x.Expr());
                } else if (Rule.equalsIgnoreCase("CoeffExponentRule")) {
                    x = parseCoeffExponentRule();
                    log.info("Diff:parseOper:CoeffExponentRule:x.Expr()=" + x.Expr());
                } else if (Rule.equalsIgnoreCase("ConstantRule")) {
                    x = parseConstantRule();
                    log.info("Diff:ApplyFuncRules:ConstantRule:x.Expr()=" + x.Expr());
                } else if ((Rule.equalsIgnoreCase("SumRule"))
                        || (Rule.equalsIgnoreCase("SubtractionRule"))) {
                    x = parseSumRule();
                    log.info("Diff:parseOper:SumRule OR SubtractionRule:x.Expr()=" + x.Expr());
                } else if (Rule.equalsIgnoreCase("ExponentRule")) {

                    log.info("Diff:parseOper:ExponentRule:x.Expr()=" + x.Expr());
                } else if (Rule.equalsIgnoreCase("MappedProductRule")) {
                    ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:MappedProductRule:Rule0:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());

                    if ((!Diff1DiffExpr.equalsIgnoreCase(Diff2DiffExpr)) && (StrOperator.equalsIgnoreCase("*"))) {
                        String Ux = "";
                        String UDashx = "";
                        String Vx = "";
                        String VDashx = "";
                        // Set Ux Parameters
                        if (Diff1DiffExpr.contains("Parenthesis")) {
                            Expr_Func_Split(Diff1DiffExpr, DiffWithRespTo);
                            Ux = ParanExpr;
                            UDashx = ParanDiffExpr;
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:Lambda:parseOper:MappedProductRule:FSM A:ParanExpr=" + ParanExpr + " ParanDiffExpr=" + ParanDiffExpr);
                                System.out.println("Diff:Lambda:parseOper:MappedProductRule:FSM A:Ux=" + Ux + " UDashx=" + UDashx);
                            }
                        } else if ((Diff1DiffExpr.contains("(")) && (Diff1DiffExpr.contains(")"))) {
                            Split(Diff1DiffExpr, DiffWithRespTo);
                            Ux = ParanExpr;
                            UDashx = ParanDiffExpr;
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:Lambda:parseOper:MappedProductRule:FSM B:ParanExpr=" + ParanExpr + " ParanDiffExpr=" + ParanDiffExpr);
                                System.out.println("Diff:Lambda:parseOper:MappedProductRule:FSM B:Ux=" + Ux + " UDashx=" + UDashx);
                            }
                        } else if ((!Diff1DiffExpr.contains("Parenthesis")) && (!IsAConstant(Diff1DiffExpr, DiffWithRespTo))) {
                            Ux = Term1;
                            UDashx = Diff1DiffExpr;
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:Lambda:parseOper:MappedProductRule:FSM C:ParanExpr=" + Term1 + " Diff1DiffExpr=" + Diff1DiffExpr);
                                System.out.println("Diff:Lambda:parseOper:MappedProductRule:FSM C:Ux=" + Ux + " UDashx=" + UDashx);
                            }
                        } else if ((!Diff1DiffExpr.contains("Parenthesis")) && (IsAConstant(Diff1DiffExpr, DiffWithRespTo))) {
                            Ux = Term1;
                            UDashx = Diff1DiffExpr;
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:Lambda:parseOper:MappedProductRule:FSM D:Term1=" + Term1 + " Diff1DiffExpr=" + Diff1DiffExpr);
                                System.out.println("Diff:Lambda:parseOper:MappedProductRule:FSM D:Ux=" + Ux + " UDashx=" + UDashx);
                            }
                        } else {
                            Ux = Term1;
                            UDashx = Diff1DiffExpr;
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:Lambda:parseOper:MappedProductRule:FSM E:Term1=" + Term1 + " Diff1DiffExpr=" + Diff1DiffExpr);
                                System.out.println("Diff:Lambda:parseOper:MappedProductRule:FSM E:Ux=" + Ux + " UDashx=" + UDashx);
                            }
                        }
                        // Set Vx Parameters
                        if (Diff2DiffExpr.contains("Parenthesis")) {
                            Split(Diff2DiffExpr, DiffWithRespTo);
                            Expr_Func_Split(Diff2DiffExpr, DiffWithRespTo);
                            Vx = ParanExpr;
                            VDashx = ParanDiffExpr;
                            if ((ParanExpr.equalsIgnoreCase("")) && (ParanDiffExpr.equalsIgnoreCase(""))) {
                                Vx = Term2;
                                VDashx = Diff2DiffExpr;
                                if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Diff:Lambda:parseOper:Internal:MappedProductRule:FSM 1:Term2=" + Vx + " Diff2DiffExpr=" + Diff2DiffExpr);
                                    System.out.println("Diff:Lambda:parseOper:Internal:MappedProductRule:FSM 1:Vx=" + Vx + " VDashx=" + VDashx);
                                }
                            }
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:Lambda:parseOper:MappedProductRule:FSM 1:Vx=" + Vx + " VDashx=" + VDashx);
                            }
                        } else if ((!Diff2DiffExpr.contains("Parenthesis")) && (!IsAConstant(Diff2DiffExpr, DiffWithRespTo))) {
                            Vx = Term2;
                            VDashx = Diff2DiffExpr;
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:Lambda:parseOper:MappedProductRule:FSM 2:Vx=" + Vx + " VDashx=" + VDashx);
                            }
                        } else if ((Diff2DiffExpr.contains("(")) && (Diff2DiffExpr.contains(")"))) {
                            Split(Diff2DiffExpr, DiffWithRespTo);
                            Expr_Func_Split(Diff2DiffExpr, DiffWithRespTo);
                            Vx = ParanExpr;
                            VDashx = ParanDiffExpr;
                            if ((ParanExpr.equalsIgnoreCase("")) && (ParanDiffExpr.equalsIgnoreCase(""))) {
                                Vx = Term2;
                                VDashx = Diff2DiffExpr;
                                if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Diff:Lambda:parseOper:Internal:MappedProductRule:FSM 3:Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr);
                                    System.out.println("Diff:Lambda:parseOper:Internal:MappedProductRule:FSM 3:Vx=" + Vx + " VDashx=" + VDashx);
                                }
                            }
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:Lambda:parseOper:Internal:MappedProductRule:FSM 3:ParanExpr=" + ParanExpr + " ParanDiffExpr=" + ParanDiffExpr);
                                System.out.println("Diff:Lambda:parseOper:MappedProductRule:FSM 3:Vx=" + Vx + " VDashx=" + VDashx);
                            }
                        } else if ((!Diff2DiffExpr.contains("Parenthesis")) && (IsAConstant(Diff2DiffExpr, DiffWithRespTo))) {
                            Vx = Term2;
                            VDashx = Diff2DiffExpr;
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:Lambda:parseOper:MappedProductRule:FSM 4:Vx=" + Vx + " VDashx=" + VDashx);
                            }
                        } else {
                            Vx = Term2;
                            VDashx = Diff2DiffExpr;
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:Lambda:parseOper:MappedProductRule:FSM 5:Vx=" + Vx + " VDashx=" + VDashx);
                            }
                        }
                        final String Vx1 = Vx;
                        final String UDashx1 = UDashx;
                        final String VDashx1 = VDashx;
                        final String Ux1 = Ux;
                        if ((IsAConstant(Diff1DiffExpr, DiffWithRespTo)) && (Diff2DiffExpr.contains("Parenthesis"))) {
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println(ConsoleColors.BLUE + "Diff:ApplyFuncRules:parseDiff:MappedProductRule:Rule1:Diff1DiffExpr=" + Diff1DiffExpr + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:ApplyFuncRules:parseDiff:MappedProductRule:Rule1:Diff2DiffExpr=" + Diff2DiffExpr + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:ApplyFuncRules:parseDiff:MappedProductRule:Rule1:Vx1=" + Vx1 + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:ApplyFuncRules:parseDiff:MappedProductRule:Rule1:UDashx1=" + UDashx1 + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:ApplyFuncRules:parseDiff:MappedProductRule:Rule1:VDashx1=" + VDashx1 + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:ApplyFuncRules:parseDiff:MappedProductRule:Rule1:Ux1=" + Ux1 + ConsoleColors.RESET);
                            }
                            x = (() -> UDashx1 + "*" + VDashx1);
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:ApplyFuncRules:parseDiff:MappedProductRule:Rule1:x.Expr()=" + x.Expr());
                            }
                        } else if ((IsAConstant(Diff2DiffExpr, DiffWithRespTo)) && (Diff1DiffExpr.contains("Parenthesis"))) {
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println(ConsoleColors.BLUE + "Diff:ApplyFuncRules:parseDiff:MappedProductRule:Rule2:Diff1DiffExpr=" + Diff1DiffExpr + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:ApplyFuncRules:parseDiff:MappedProductRule:Rule2:Diff2DiffExpr=" + Diff2DiffExpr + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:ApplyFuncRules:parseDiff:MappedProductRule:Rule2:Vx1=" + Vx1 + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:ApplyFuncRules:parseDiff:MappedProductRule:Rule2:UDashx1=" + UDashx1 + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:ApplyFuncRules:parseDiff:MappedProductRule:Rule2:VDashx1=" + VDashx1 + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:ApplyFuncRules:parseDiff:MappedProductRule:Rule2:Ux1=" + Ux1 + ConsoleColors.RESET);
                            }
                            x = (() -> Ux1 + "*" + VDashx1);
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:ApplyFuncRules:parseDiff:MappedProductRule:Rule2:x.Expr()=" + x.Expr());
                            }
                        } else if ((Vx1.contains("+")) || (Vx1.contains("-"))) {
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println(ConsoleColors.BLUE + "Diff:ApplyFuncRules:parseDiff:MappedProductRule:Rule3:Diff1DiffExpr=" + Diff1DiffExpr + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:ApplyFuncRules:parseDiff:MappedProductRule:Rule3:Diff2DiffExpr=" + Diff2DiffExpr + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:ApplyFuncRules:parseDiff:MappedProductRule:Rule3:Vx1=" + Vx1 + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:ApplyFuncRules:parseDiff:MappedProductRule:Rule3:UDashx1=" + UDashx1 + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:ApplyFuncRules:parseDiff:MappedProductRule:Rule3:VDashx1=" + VDashx1 + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:ApplyFuncRules:parseDiff:MappedProductRule:Rule3:Ux1=" + Ux1 + ConsoleColors.RESET);
                            }
                            if ((Vx1.startsWith("(")) && (Vx1.endsWith(")"))) {
                                x = (() -> Vx1 + "*" + UDashx1 + "+(" + VDashx1 + ")*" + Ux1);
                            } else {
                                x = (() -> "(" + Vx1 + ")*" + UDashx1 + "+(" + VDashx1 + ")*" + Ux1);
                            }
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:ApplyFuncRules:parseDiff:MappedProductRule:Rule3:x.Expr()=" + x.Expr());
                            }
                        } else {
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println(ConsoleColors.BLUE + "Diff:ApplyFuncRules:parseDiff:MappedProductRule:Rule4:Diff1DiffExpr=" + Diff1DiffExpr + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:ApplyFuncRules:parseDiff:MappedProductRule:Rule4:Diff2DiffExpr=" + Diff2DiffExpr + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:ApplyFuncRules:parseDiff:MappedProductRule:Rule4:Vx1=" + Vx1 + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:ApplyFuncRules:parseDiff:MappedProductRule:Rule4:UDashx1=" + UDashx1 + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:ApplyFuncRules:parseDiff:MappedProductRule:Rule4:VDashx1=" + VDashx1 + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:ApplyFuncRules:parseDiff:MappedProductRule:Rule4:Ux1=" + Ux1 + ConsoleColors.RESET);
                            }
                            x = (() -> Vx1 + "*" + UDashx1 + "+" + VDashx1 + "*" + Ux1);
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:ApplyFuncRules:parseDiff:MappedProductRule:Rule4:x.Expr()=" + x.Expr());
                            }
                        }
                    }
                    ReasoningLambdaDiffr a = parseReason(AlgoName, CompleteExprn, "Diff:MappedProductRule:Rule1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                    if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                        System.out.println("Diff:MappedProductRule:Rule1:x.Expr()=" + x.Expr());
                    }
                    log.info("Diff:ApplyFuncRules:parseDiff:MappedProductRule:x.Expr()=" + x.Expr());
                } else if (Rule.equalsIgnoreCase("ProductRule")) {
                    x = parseProductRule();
                    log.info("Diff:ApplyFuncRules:ProductRule:x.Expr()=" + x.Expr());
                } else if (Rule.equalsIgnoreCase("MappedQuotientRule")) {
                    if ((!Diff1DiffExpr.equalsIgnoreCase(Diff2DiffExpr)) && (StrOperator.equalsIgnoreCase("/"))) {
                        String Ux = "";
                        String UDashx = "";
                        String Vx = "";
                        String VDashx = "";
                        // Set Ux Parameters
                        if ((Diff1DiffExpr.contains("Parenthesis")) || (Diff1DiffExpr.contains("ExtremityFactor"))) {
                            Expr_Func_Split(Diff1DiffExpr, DiffWithRespTo);
                            Ux = ParanExpr;
                            UDashx = ParanDiffExpr;

                        } else if (!Diff1DiffExpr.contains("Parenthesis")) {
                            Ux = Term1;
                            UDashx = Diff1DiffExpr;
                        }
                        // Set Vx Parameters
                        if ((Diff2DiffExpr.contains("Parenthesis")) || (Diff2DiffExpr.contains("ExtremityFactor"))) {
                            Expr_Func_Split(Diff2DiffExpr, DiffWithRespTo);
                            Vx = ParanExpr;
                            VDashx = ParanDiffExpr;

                        } else if (!Diff2DiffExpr.contains("Parenthesis")) {
                            Vx = Term2;
                            VDashx = Diff2DiffExpr;
                        }
                        final String Vx1 = Vx;
                        final String UDashx1 = UDashx;
                        final String VDashx1 = VDashx;
                        final String Ux1 = Ux;
                        if ((IsAConstant(Diff1DiffExpr, DiffWithRespTo)) && (Diff2DiffExpr.contains("Parenthesis"))) {
                            x = (() -> UDashx1 + "/" + Vx1 + "^2" + "*" + VDashx1);
                            System.out.println("Diff:ApplyFuncRules:parseDiff:MappedQuotientRule:x.Expr()=" + x.Expr());
                        } else if ((IsAConstant(Diff2DiffExpr, DiffWithRespTo)) && (Diff1DiffExpr.contains("Parenthesis"))) {
                            x = (() -> Ux1 + "/" + Vx1 + "^2" + "*" + VDashx1);
                            System.out.println("Diff:ApplyFuncRules:parseDiff:MappedQuotientRule:x.Expr()=" + x.Expr());
                        } else {
                            x = (() -> "(" + Vx1 + "*" + UDashx1 + "-" + VDashx1 + "*" + Ux1 + ")" + "/" + Vx1 + "/" + Vx1);
                            System.out.println("Diff:ApplyFuncRules:parseDiff:MappedQuotientRule:x.Expr()=" + x.Expr());
                        }
                    }
                } else if (Rule.equalsIgnoreCase("QuotientRule")) {
                    x = parseQuotientRule();
                    log.info("Diff:parseOperQuotientRule:x.Expr()=" + x.Expr());
                }
                log.info("Diff:ApplyFuncRules:parseDiff:Final:x.Expr()=" + x.Expr());
                return x;
            }

            DiffrLambda parseNoExponentRuleTerm() {
                DiffrLambda x = (() -> "");
                final String Diff1DiffExpr = Diff1.DiffExpr();
                final String Diff2DiffExpr = Diff2.DiffExpr();
                if (Rule.equalsIgnoreCase("NoExponentRuleTerm")) {
                    x = (() -> Term1);
                }
                ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "OnlyRule", Rule, LowLevelRules, false, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                log.info("Diff:parseNoExponentRuleTerm:Final:x.Expr()=" + x.Expr());
                return x;
            }

            DiffrLambda parseNoExponentRuleDiff() {
                DiffrLambda x = (() -> "");
                final String Diff1DiffExpr = Diff1.DiffExpr();
                final String Diff2DiffExpr = Diff2.DiffExpr();
                if (Rule.equalsIgnoreCase("NoExponentRuleDiff")) {
                    if (Term1.equalsIgnoreCase("")) {
                        x = (() -> Diff1DiffExpr);
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseNoExponentRuleDiff:Rule 1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Diff:parseNoExponentRuleDiff:Rule 1:x.Expr()=" + x.Expr());
                    } else if (((StrOperator.equalsIgnoreCase("+")) || (StrOperator.equalsIgnoreCase("-"))) && (IsAConstant(Term1, DiffWithRespTo)) && ((IsAConstant(Diff1DiffExpr, DiffWithRespTo)))) {
                        x = (() -> "0.0");
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseNoExponentRuleDiff:Rule 2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Diff:parseNoExponentRuleDiff:Rule 2:x.Expr()=" + x.Expr());
                    } else if (((StrOperator.equalsIgnoreCase("+")) || (StrOperator.equalsIgnoreCase("-")))
                            && (!IsAConstant(Term1, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant"))
                            && ((!IsAConstant(Diff1DiffExpr, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant")))
                            && (!IsExtremity(Diff1DiffExpr))) {
                        if (!Term1.endsWith("*0.0")) {
                            x = (() -> Term1 + "*" + "0.0");
                        } else {
                            x = (() -> Term1);
                        }
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseNoExponentRuleDiff:Rule 3:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Diff:parseNoExponentRuleDiff:Rule 3:x.Expr()=" + x.Expr());
                    } else if ((((StrOperator.equalsIgnoreCase("*")) || (StrOperator.equalsIgnoreCase("/")))
                            && (!Diff1DiffExpr.equalsIgnoreCase(Diff2DiffExpr))
                            && (!IsExtremity(Diff1DiffExpr))
                            && (Term1.equalsIgnoreCase(Diff1DiffExpr))
                            && (Term1.equalsIgnoreCase(Term2))
                            && ((!IsAConstant(Diff1DiffExpr, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant"))))) {
                        x = (() -> Term1);
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseNoExponentRuleDiff:Rule 4:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Diff:parseNoExponentRuleDiff:Rule 4:x.Expr()=" + x.Expr());
                    } else if ((((StrOperator.equalsIgnoreCase("*")) || (StrOperator.equalsIgnoreCase("/")))
                            && (!Diff2DiffExpr.equalsIgnoreCase(""))
                            && (!Diff1DiffExpr.equalsIgnoreCase(Diff2DiffExpr))
                            && (!IsExtremity(Diff1DiffExpr))
                            && ((!IsAConstant(Diff1DiffExpr, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant"))))) {
                        x = (() -> Term1 + StrOperator + "0.0");
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseNoExponentRuleDiff:Rule 5:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Diff:parseNoExponentRuleDiff:Rule 5:x.Expr()=" + x.Expr());
                    } else if ((Term1.equalsIgnoreCase(Diff1DiffExpr)) && (!IsExtremity(Diff1DiffExpr)) && (!IsAConstant(Diff1DiffExpr, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant"))) {
                        if ((StrOperator.equalsIgnoreCase("*")) || (StrOperator.equalsIgnoreCase("/"))) {
                            x = (() -> Diff1DiffExpr + StrOperator + "0.0");
                        } else {
                            x = (() -> Diff1DiffExpr + "*" + "0.0");
                        }
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseNoExponentRuleDiff:Rule 6:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Diff:parseNoExponentRuleDiff:Rule 6:x.Expr()=" + x.Expr());
                    } else if (!Term1.contains("Parenthesis")) {
                        x = (() -> Diff1DiffExpr);
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseNoExponentRuleDiff:Rule 7:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Diff:parseNoExponentRuleDiff:Rule 7:x.Expr()=" + x.Expr());
                    } // Below Condition to be expanded:Rule 8
                    else if (!Term1.contains("Parenthesis")) {
                        x = (() -> Term1);
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseNoExponentRuleDiff:Rule 8:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Diff:parseNoExponentRuleDiff:Rule 8:x.Expr()=" + x.Expr());
                    } else if ((Term1.equalsIgnoreCase(Diff1DiffExpr)) && (IsExtremity(Diff1DiffExpr)) && (!IsAConstant(Diff1DiffExpr, DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                        x = (() -> Term1);
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseNoExponentRuleDiff:Rule 9:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Diff:parseNoExponentRuleDiff:Rule 8:x.Expr()=" + x.Expr());
                    }
                }
                log.info("Diff:parseNoExponentRuleDiff:Final:x.Expr()=" + x.Expr());
                return x;
            }

            DiffrLambda parseCoeffExponentRule() {
                DiffrLambda x = (() -> "");
                final String Diff1DiffExpr = Diff1.DiffExpr();
                final String Diff2DiffExpr = Diff2.DiffExpr();
                if (Rule.equalsIgnoreCase("CoeffExponentRule")) {
                    if (!Term4.equalsIgnoreCase("")) {
                        x = (() -> Term4 + "*" + Term3 + "^" + Term2);
                    } else if ((!Term3.equalsIgnoreCase("")) && (!Term3.equalsIgnoreCase("1.0"))) {
                        x = (() -> Term3 + "^" + Term2);
                    } else {
                        x = (() -> Term1);
                    }
                }
                ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseCoeffExponentRule:Only Rule:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                log.info("Diff:parseCoeffExponentRule:Final:x.Expr()=" + x.Expr());
                return x;
            }

            DiffrLambda parseConstantRule() {
                DiffrLambda x = (() -> "");
                final String Diff1DiffExpr = Diff1.DiffExpr();
                final String Diff2DiffExpr = Diff2.DiffExpr();
                if (Rule.equalsIgnoreCase("ConstantRule")) {
                    if (((Term1 != null) && (!Term1.equalsIgnoreCase("")))
                            && ((Term2 != null) && (!Term2.equalsIgnoreCase("")))
                            && (Term1.equalsIgnoreCase(Term2))
                            && (Diff1DiffExpr.equalsIgnoreCase(Diff2DiffExpr))
                            && (Term1.equalsIgnoreCase(Diff1DiffExpr))
                            && (Term1.equalsIgnoreCase(DiffWithRespTo)) && (!IsAConstant(Term1, DiffWithRespTo))) {
                        log.info("Diff:parseConstantRule:Rule1:Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                        x = (() -> "1.0");
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Diff:parseConstantRule:Rule1:x.Expr()=" + x.Expr());
                        }
                    } else if (((Term1 != null) && (!Term1.equalsIgnoreCase(""))) && (!IsAConstant(Term1, DiffWithRespTo)) && (Term2.equalsIgnoreCase(DiffWithRespTo)) && (StrOperator.equalsIgnoreCase("*"))) {
                        log.info("Diff:parseConstantRule:Rule2:Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                        x = (() -> Term1);
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Diff:parseConstantRule:Rule2:x.Expr()=" + x.Expr());
                        }
                    } else if (((Term1 != null) && (!Term1.equalsIgnoreCase(""))) && (!IsAConstant(Term1, DiffWithRespTo)) && (Term2.equalsIgnoreCase(DiffWithRespTo)) && (StrOperator.equalsIgnoreCase("/"))) {
                        log.info("Diff:parseConstantRule:Rule3:Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                        x = (() -> "-" + Term1 + "/" + DiffWithRespTo + "^2.0");
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule3:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Diff:parseConstantRule:Rule3:x.Expr()=" + x.Expr());
                        }
                    } else if (((Term1 != null) && (!Term1.equalsIgnoreCase(""))) && (!IsAConstant(Term1, DiffWithRespTo)) && ((Term2 != null) && (!Term2.equalsIgnoreCase("")))) {
                        log.info("Diff:parseConstantRule:Rule4:Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                        if (Term3.equalsIgnoreCase("")) {
                            if ((Term2.contains("@Parenthesis@")) && (!Diff1DiffExpr.equalsIgnoreCase(DiffWithRespTo))) {
                                Split(Term2, DiffWithRespTo);
                                Expr_Func_Split(Term2, DiffWithRespTo);
                                if ((!ParanExpr.equalsIgnoreCase("")) && (!ParanExpr.isBlank())) {
                                    x = (() -> Diff1DiffExpr + StrOperator + ParanExpr);
                                    ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule4.1.1.1.1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                } else if ((!FactorsExpr.equalsIgnoreCase("")) && (!FactorsExpr.isBlank())) {
                                    x = (() -> Diff1DiffExpr + StrOperator + FactorsExpr);
                                    ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule4.1.1.1.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                } else if (Term2.endsWith("@Parenthesis@")) {
                                    final String Temp = Diff2DiffExpr.replace("@Parenthesis@", "");
                                    x = (() -> Diff1DiffExpr + StrOperator + Temp);
                                    ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule4.1.1.3:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                } else {
                                    Split(Term2, DiffWithRespTo);
                                    Expr_Func_Split(Term2, DiffWithRespTo);
                                    x = (() -> Diff1DiffExpr + StrOperator + FactorsDiffExpr);
                                    ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule4.1.1.4:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());

                                }
                                //ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule4.1.1.1:", Rule, LowLevelRules, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Diff:parseConstantRule:Rule4.1.1.1:x.Expr()=" + x.Expr());
                                }
                            } else if ((Term2.contains("@Parenthesis@")) && (Diff1DiffExpr.equalsIgnoreCase(DiffWithRespTo)) && (!Term2.contains(DiffWithRespTo))) {
                                if (Term1.equalsIgnoreCase(Diff1DiffExpr)) {
                                    Split(Term2, DiffWithRespTo);
                                    Expr_Func_Split(Term2, DiffWithRespTo);
                                    if ((!ParanExpr.equalsIgnoreCase("")) && (!ParanExpr.isBlank())) {
                                        x = (() -> ParanExpr);
                                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule4.1.1.2.1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                    } else if ((!FactorsExpr.equalsIgnoreCase("")) && (!FactorsExpr.isBlank())) {
                                        x = (() -> FactorsExpr);
                                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule4.1.1.2.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                    } else if (Term2.endsWith("@Parenthesis@")) {
                                        final String Temp = Term2.replace("@Parenthesis@", "");
                                        x = (() -> Temp);
                                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule4.1.1.2.3:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                    } else {
                                        Split(Term2, DiffWithRespTo);
                                        Expr_Func_Split(Term2, DiffWithRespTo);
                                        x = (() -> FactorsDiffExpr);
                                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule4.1.1.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                    }
                                } else {
                                    Split(Term2, DiffWithRespTo);
                                    Expr_Func_Split(Term2, DiffWithRespTo);
                                    if ((!ParanExpr.equalsIgnoreCase("")) && (!ParanExpr.isBlank())) {
                                        x = (() -> Diff1DiffExpr + StrOperator + ParanExpr);
                                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule4.1.1.2.1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                    } else if ((!FactorsExpr.equalsIgnoreCase("")) && (!FactorsExpr.isBlank())) {
                                        x = (() -> Diff1DiffExpr + StrOperator + FactorsExpr);
                                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule4.1.1.2.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                    } else if (Term2.endsWith("@Parenthesis@")) {
                                        final String Temp = Term2.replace("@Parenthesis@", "");
                                        x = (() -> Temp);
                                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule4.1.1.2.3:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                    } else {
                                        Split(Term2, DiffWithRespTo);
                                        Expr_Func_Split(Term2, DiffWithRespTo);
                                        x = (() -> Diff1DiffExpr + StrOperator + FactorsDiffExpr);
                                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule4.1.1.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                    }
                                    ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule4.1.1.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                    if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("Diff:parseConstantRule:Rule4.1.1.2:x.Expr()=" + x.Expr());
                                    }
                                }
                            } else {
                                x = (() -> Term1 + StrOperator + Term2);
                                ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule4.1.1.3:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Diff:parseConstantRule:Rule4.1.1.3:x.Expr()=" + x.Expr());
                                }
                            }
                            log.info("Diff:parseConstantRule:Rule4.1:Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                            log.info("Diff:parseConstantRule:Rule4.1:x.Expr()=" + x.Expr());
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:parseConstantRule:Rule4.1:x.Expr()=" + x.Expr());
                            }
                        } else {
                            x = (() -> Term1 + StrOperator + Term3);
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule4.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            log.info("Diff:parseConstantRule:Rule4.2:Term3=" + Term3 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                            log.info("Diff:parseConstantRule:Rule4.2:x.Expr()=" + x.Expr());
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:parseConstantRule:Rule4.2:x.Expr()=" + x.Expr());
                            }
                        }
                    } else if (((Term1 != null) && (!Term1.equalsIgnoreCase(""))) && (Term2.equalsIgnoreCase(Diff2DiffExpr)) && (StrOperator.equalsIgnoreCase("/")) && (Term2.equalsIgnoreCase(DiffWithRespTo))) {
                        log.info("Diff:parseConstantRule:Rule5:Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                        if ((Diff1DiffExpr.equalsIgnoreCase("Infinity")) || (Diff1DiffExpr.equalsIgnoreCase("NaN"))) {
                            x = (() -> Diff1DiffExpr + StrOperator + DiffWithRespTo + "^2.0");
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule5.1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            log.info("Diff:parseConstantRule:Rule5.1:x.Expr()=" + x.Expr());
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:parseConstantRule:Rule5.1:x.Expr()=" + x.Expr());
                            }
                        } else {
                            if (StrOperator.equalsIgnoreCase("/")) //Map Sign with "-"
                            {
                                x = (() -> "-" + Term1 + StrOperator + DiffWithRespTo + "^2.0");
                                ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule5.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                log.info("Diff:parseConstantRule:Rule5.2:x.Expr()=" + x.Expr());
                                if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Diff:parseConstantRule:Rule5.2:x.Expr()=" + x.Expr());
                                }
                            } else if (StrOperator.equalsIgnoreCase("*")) {
                                x = (() -> Term1 + StrOperator + DiffWithRespTo + "^2.0");
                                ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule5.3:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                log.info("Diff:parseConstantRule:Rule5.3:x.Expr()=" + x.Expr());
                                if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Diff:parseConstantRule:Rule5.3:x.Expr()=" + x.Expr());
                                }
                            }
                        }
                    } else if (((Term1 != null) && (!Term1.equalsIgnoreCase(""))) && (Term2.equalsIgnoreCase(Diff2DiffExpr)) && (StrOperator.equalsIgnoreCase("/"))) {
                        log.info("Diff:parseConstantRule:Rule6:Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                        x = (() -> Term1 + StrOperator + Diff1DiffExpr);
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule6:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Diff:parseConstantRule:Rule6:x.Expr()=" + x.Expr());
                        }
                    } else if (((Term1 != null) && (!Term1.equalsIgnoreCase(""))) && (Term2.equalsIgnoreCase(Diff2DiffExpr))) {
                        log.info("Diff:parseConstantRule:Rule7:Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                        if ((Term1.equalsIgnoreCase("0.0")) || (Term1.equalsIgnoreCase("-0.0")) || (Term1.equalsIgnoreCase("+0.0"))
                                || (Term1.equalsIgnoreCase("0"))) {
                            x = (() -> "0.0");
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule7:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        } else if ((IsExtremity(Term1))
                                && (Diff1DiffExpr.equalsIgnoreCase(""))
                                && (Diff2DiffExpr.equalsIgnoreCase(""))
                                && (Term2.equalsIgnoreCase(""))) {
                            x = (() -> Term1);
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule7.1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            log.info("Diff:parseConstantRule:Rule7.1:x.Expr()=" + x.Expr());
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:parseConstantRule:Rule7.1:x.Expr()=" + x.Expr());
                            }
                        } else if ((!Diff2DiffExpr.equalsIgnoreCase(DiffWithRespTo)) && (Diff1DiffExpr.contains(Term1))) {
                            String Temp = "";
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:parseConstantRule:Rule7.2.1.1:Diff1DiffExpr=" + Diff1DiffExpr + " Term1=" + Term1);
                            }
                            Temp = Diff1DiffExpr.replaceFirst(Term1, "");
                            if (Temp.startsWith("*")) {
                                Temp = Temp.replaceFirst("\\*", "");
                            } else if (Temp.startsWith("/")) {
                                Temp = Temp.replaceFirst("/", "");
                            }
                            if ((functionsDiff.containsKey(Temp)) && (!Diff2DiffExpr.contains(Term1))) {
                                x = (() -> Term1 + StrOperator + Diff2DiffExpr);
                                ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule7.2.1.1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                log.info("Diff:parseConstantRule:Rule7.2.1.1:x.Expr()=" + x.Expr() + " Temp=" + Temp);
                                if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Diff:parseConstantRule:Rule7.2.1.1:x.Expr()=" + x.Expr() + " Temp=" + Temp);
                                }
                            } else if (functionsDiff.containsKey(Temp)) {
                                x = (() -> Diff2DiffExpr);
                                ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule7.2.1.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                log.info("Diff:parseConstantRule:Rule7.2.1.2:x.Expr()=" + x.Expr() + " Temp=" + Temp);
                                if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Diff:parseConstantRule:Rule7.2.1.2:x.Expr()=" + x.Expr() + " Temp=" + Temp);
                                }
                            } else {
                                x = (() -> Diff1DiffExpr + StrOperator + Diff2DiffExpr);
                                log.info("Diff:parseConstantRule:Rule7.2.1.3:x.Expr()=" + x.Expr() + " Temp=" + Temp);
                                ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule7.2.1.3:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Diff:parseConstantRule:Rule7.2.1.3:x.Expr()=" + x.Expr() + " Temp=" + Temp);
                                }
                            }
                            log.info("Diff:parseConstantRule:Rule7.2.1:x.Expr()=" + x.Expr() + " Temp=" + Temp);
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:parseConstantRule:Rule7.2.1:x.Expr()=" + x.Expr());
                            }
                        } else if (!Diff2DiffExpr.equalsIgnoreCase(DiffWithRespTo)) {
                            x = (() -> Diff1DiffExpr + StrOperator + Diff2DiffExpr);
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule7.2.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            log.info("Diff:parseConstantRule:Rule7.2.2:x.Expr()=" + x.Expr());
                        } else if ((Term2.equalsIgnoreCase(Diff2DiffExpr)) && (Diff2DiffExpr.equalsIgnoreCase(DiffWithRespTo)) && (IsAConstant(Term1, DiffWithRespTo))) {
                            x = (() -> Term1);
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule7.2.3:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            log.info("Diff:parseConstantRule:Rule7.2.3:x.Expr()=" + x.Expr());
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:parseConstantRule:Rule7.2.3:x.Expr()=" + x.Expr());
                            }
                        } else {
                            x = (() -> Diff1DiffExpr);
                            log.info("Diff:parseConstantRule:Rule7.3:x.Expr()=" + x.Expr());
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule7.3:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:parseConstantRule:Rule7.3:x.Expr()=" + x.Expr());
                            }
                        }
                    } else if (((Term1 != null) && (!Term1.equalsIgnoreCase(""))) && (!Term2.equalsIgnoreCase(Term1))) {
                        log.info("Diff:parseConstantRule:Rule8:Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                        if ((Term1.equalsIgnoreCase("0.0")) || (Term1.equalsIgnoreCase("-0.0")) || (Term1.equalsIgnoreCase("+0.0"))
                                || (Term1.equalsIgnoreCase("0"))) {
                            x = (() -> Term1 + StrOperator + "0.0");
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule7:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        } else if ((IsExtremity(Term1))
                                && (Diff1DiffExpr.equalsIgnoreCase(""))
                                && (Diff2DiffExpr.equalsIgnoreCase(""))
                                && (Term2.equalsIgnoreCase(""))) {
                            x = (() -> Term1);
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule8.1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            log.info("Diff:parseConstantRule:Rule8.1:x.Expr()=" + x.Expr());
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:parseConstantRule:Rule8.1:x.Expr()=" + x.Expr());
                            }
                        } else if ((!Diff2DiffExpr.equalsIgnoreCase(DiffWithRespTo)) && (Diff1DiffExpr.contains(Term1))) {
                            String Temp = "";
                            Temp = Diff1DiffExpr.replaceFirst(Term1, "");
                            if (Temp.startsWith("\\*")) {
                                Temp = Temp.replaceFirst("\\*", "");
                            } else if (Temp.startsWith("/")) {
                                Temp = Temp.replaceFirst("/", "");
                            }
                            if ((functionsDiff.containsKey(Temp)) && (!Diff2DiffExpr.contains(Term1))) {
                                x = (() -> Term1 + StrOperator + Diff2DiffExpr);
                                ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule8.2.1.1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                log.info("Diff:parseConstantRule:Rule8.2.1.1:x.Expr()=" + x.Expr() + " Temp=" + Temp);
                                if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Diff:parseConstantRule:Rule8.2.1.1:x.Expr()=" + x.Expr() + " Temp=" + Temp);
                                }
                            } else if (functionsDiff.containsKey(Temp)) {
                                x = (() -> Diff2DiffExpr);
                                ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule8.2.1.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                log.info("Diff:parseConstantRule:Rule8.2.1.2:x.Expr()=" + x.Expr() + " Temp=" + Temp);
                                if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Diff:parseConstantRule:Rule8.2.1.2:x.Expr()=" + x.Expr() + " Temp=" + Temp);
                                }
                            } else {
                                x = (() -> Term1 + StrOperator + Diff1DiffExpr);
                                log.info("Diff:parseConstantRule:Rule8.2.1.3:x.Expr()=" + x.Expr() + " Temp=" + Temp);
                                ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule8.2.1.3:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Diff:parseConstantRule:Rule8.2.1.3:x.Expr()=" + x.Expr() + " Temp=" + Temp);
                                }
                            }
                            log.info("Diff:parseConstantRule:Rule8.2.1:x.Expr()=" + x.Expr() + " Temp=" + Temp);
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:parseConstantRule:Rule8.2.1:x.Expr()=" + x.Expr());
                            }
                        } else if (!Diff2DiffExpr.equalsIgnoreCase(DiffWithRespTo)) {
                            x = (() -> Diff1DiffExpr + StrOperator + Diff2DiffExpr);
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule8.2.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            log.info("Diff:parseConstantRule:Rule8.2.2:x.Expr()=" + x.Expr());
                        } else if ((Term2.equalsIgnoreCase(Diff2DiffExpr)) && (Diff2DiffExpr.equalsIgnoreCase(DiffWithRespTo)) && (IsAConstant(Term1, DiffWithRespTo))) {
                            x = (() -> Term1);
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule8.2.3:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            log.info("Diff:parseConstantRule:Rule8.2.3:x.Expr()=" + x.Expr());
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:parseConstantRule:Rule8.2.3:x.Expr()=" + x.Expr());
                            }
                        } else {
                            x = (() -> Diff1DiffExpr);
                            log.info("Diff:parseConstantRule:Rule8.3:x.Expr()=" + x.Expr());
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule8.3:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:parseConstantRule:Rule8.3:x.Expr()=" + x.Expr());
                            }
                        }
                    } else {
                        log.info("Diff:parseConstantRule:Rule9:Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                        if ((Term2.equalsIgnoreCase(DiffWithRespTo)) && (Diff2DiffExpr.equalsIgnoreCase(DiffWithRespTo))) {
                            x = (() -> "-" + Diff1DiffExpr + "/" + DiffWithRespTo + "^2.0");
                        } else {
                            x = (() -> Term2);
                        }
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule9:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Diff:parseConstantRule:Rule9:x.Expr()=" + x.Expr());
                        if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Diff:parseConstantRule:Rule9:x.Expr()=" + x.Expr());
                        }
                    }
                }
                log.info("Diff:parseConstantRule:Final:x.Expr()=" + x.Expr());
                if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                    System.out.println("Diff:parseConstantRule:Final:x.Expr()=" + x.Expr());
                }
                return x;
            }

            DiffrLambda parseSumRule() {
                DiffrLambda x = (() -> "");
                final String Diff1DiffExpr = Diff1.DiffExpr();
                final String Diff2DiffExpr = Diff2.DiffExpr();
                if ((Rule.equalsIgnoreCase("SumRule"))
                        || (Rule.equalsIgnoreCase("SubtractionRule"))) {
                    if ((!Diff1DiffExpr.equalsIgnoreCase("")) && (!Diff2DiffExpr.equalsIgnoreCase("")) && (!Diff2DiffExpr.equalsIgnoreCase("0.0"))) {
                        log.info("Diff:parseSumRule:Rule1:Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                        if ((StrOperator.equalsIgnoreCase("+")) && ((!Diff2DiffExpr.startsWith("-")) && (!Diff2DiffExpr.startsWith("-")))) {
                            x = (() -> Diff1DiffExpr + StrOperator + Diff2DiffExpr);
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:SumRule:SubtractionRule:Rule1:", Rule, LowLevelRules, false, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        } else if ((StrOperator.equalsIgnoreCase("+")) && (Diff2DiffExpr.startsWith("-"))) {
                            x = (() -> Diff1DiffExpr + Diff2DiffExpr);
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:SumRule:SubtractionRule:Rule2:", Rule, LowLevelRules, false, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        } else if ((StrOperator.equalsIgnoreCase("-")) && (Diff2DiffExpr.startsWith("-"))) {
                            if (Diff2DiffExpr.length() > 1) {
                                //Mapped Sign
                                final String TempData = Diff2DiffExpr.substring(1);
                                x = (() -> Diff1DiffExpr + "+" + TempData);
                                ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:SumRule:SubtractionRule:Rule3:", Rule, LowLevelRules, false, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            }
                        } else {
                            x = (() -> Diff1DiffExpr + StrOperator + Diff2DiffExpr);
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:SumRule:SubtractionRule:Rule4:", Rule, LowLevelRules, false, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        }
                    } else if ((!Term1.equalsIgnoreCase("")) && (!Term2.equalsIgnoreCase("")) && (!Diff2DiffExpr.equalsIgnoreCase("0.0"))) {
                        log.info("Diff:parseSumRule:Got Term Expr:Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr);
                        x = (() -> Term1 + StrOperator + Term2);
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:SumRule:SubtractionRule:Rule5:", Rule, LowLevelRules, false, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                    } else if (((Term2 == null) || (Term2.equalsIgnoreCase(""))) || (Diff2DiffExpr.equalsIgnoreCase("0.0"))) {
                        log.info("Diff:parseSumRule:Got a Constant:Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr);
                        x = (() -> Term1 + StrOperator + Diff2DiffExpr);
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:SumRule:SubtractionRule:Rule6:", Rule, LowLevelRules, false, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                    } else {
                        log.info("Diff:parseSumRule:Else:Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1.DiffExpr=" + Diff1DiffExpr);
                        x = (() -> Diff1DiffExpr);
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:SumRule:SubtractionRule:Rule7:", Rule, LowLevelRules, false, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                    }

                }
                return x;
            }

            DiffrLambda parseProductRule() {
                DiffrLambda x = (() -> "");
                final String Diff1DiffExpr = Diff1.DiffExpr();
                final String Diff2DiffExpr = Diff2.DiffExpr();
                if (Rule.equalsIgnoreCase("ProductRule")) {
                    if (!Term3.equalsIgnoreCase("")) {
                        x = (() -> Diff1DiffExpr + "*" + Term3 + "+" + Term1 + "*" + "(" + Diff2DiffExpr + ")");
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:ProductRule:Rule1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Diff:parseProductRule:ProductRule:Rule1:x.Expr()=" + x.Expr());
                    } else if (Diff1DiffExpr.equalsIgnoreCase(DiffWithRespTo)) {
                        //Differentiation of x term:
                        x = (() -> Diff2DiffExpr);
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:ProductRule:Rule2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Diff:parseProductRule:ProductRule:Rule2:x.Expr()=" + x.Expr());
                    } else if (Diff2DiffExpr.equalsIgnoreCase(DiffWithRespTo)) {
                        //Differentiation of x term:
                        x = (() -> Diff1DiffExpr);
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:ProductRule:Rule3:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Diff:parseProductRule:ProductRule:Rule3:x.Expr()=" + x.Expr());
                    } else if ((Term1.equalsIgnoreCase(Term2)) && (Term1.equalsIgnoreCase(Diff2DiffExpr)) && (!Diff2DiffExpr.contains(DiffWithRespTo)) && (!IsAConstant(Term1, DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                        //Differentiation of IndConstant Expression term:
                        if ((!IsAConstant(Diff2DiffExpr, DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant")))) {
                            x = (() -> Diff1DiffExpr + "*" + Diff2DiffExpr);
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:ProductRule:Rule4.1.1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        } else if ((!IsAConstant(Diff2DiffExpr, DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                            //x = (() -> Diff1DiffExpr);
                            x = (() -> "1.0" + (char) TermOperator + Term1);
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:ProductRule:Rule4.1.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        } else {
                            x = (() -> Diff1DiffExpr);
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:ProductRule:Rule4.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        }
                        log.info("Diff:parseProductRule:ProductRule:Rule4:x.Expr()=" + x.Expr());
                    } else if ((Term1.equalsIgnoreCase(Term2)) && (Term1.equalsIgnoreCase(Diff2DiffExpr)) && (!Diff2DiffExpr.contains(DiffWithRespTo)) && (IsAConstant(Term1, DiffWithRespTo)) && (Diff1DiffExpr.contains(Term1)) && (Diff1DiffExpr.contains(DiffWithRespTo))) {
                        //Drop Trailing Constant(Duplicate) in Differentiation of IndConstant Expression term:
                        x = (() -> Diff1DiffExpr);
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:ProductRule:Rule5:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Diff:parseProductRule:ProductRule:Rule5:x.Expr()=" + x.Expr());
                    } else if ((!Diff1DiffExpr.equalsIgnoreCase("")) && ((!Diff1DiffExpr.equalsIgnoreCase("1.0")))) {
                        if ((!Diff1DiffExpr.contains("*")) && (!Diff1DiffExpr.contains("/")) && (!Diff2DiffExpr.equalsIgnoreCase("0.0")) && (Term1.equalsIgnoreCase(Term2)) && (Term1.equalsIgnoreCase(Diff2DiffExpr)) && (IsAConstant(Diff2DiffExpr, DiffWithRespTo)) && (Term1.equalsIgnoreCase(Diff2DiffExpr)) && (IsAConstant(Term1, DiffWithRespTo))) {
                            //x = (() -> Diff1DiffExpr + "*" + Term1);
                            //Term 1 NOT incorporated in Diff1DiffExpr
                            x = (() -> Diff1DiffExpr + (char) TermOperator + Term1);
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:ProductRule:Rule6.1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            log.info("Diff:parseProductRule:ProductRule:Rule6.1:x.Expr()=" + x.Expr());
                        } else if ((!Diff2DiffExpr.equalsIgnoreCase("0.0")) && (Term1.equalsIgnoreCase(Term2)) && (Term1.equalsIgnoreCase(Diff2DiffExpr)) && (IsAConstant(Diff2DiffExpr, DiffWithRespTo)) && (Term1.equalsIgnoreCase(Diff2DiffExpr)) && (IsAConstant(Term1, DiffWithRespTo))) {
                            //x = (() -> Diff1DiffExpr + "*" + Term1);
                            //Term 1 already incorporated in Diff1DiffExpr
                            x = (() -> Diff1DiffExpr);
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:ProductRule:Rule6.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            log.info("Diff:parseProductRule:ProductRule:Rule6.1:x.Expr()=" + x.Expr());
                        } else if ((!Diff2DiffExpr.equalsIgnoreCase("0.0")) && (Term1.equalsIgnoreCase(Term2)) && (Term1.equalsIgnoreCase(Diff2DiffExpr)) && (IsAConstant(Term1, DiffWithRespTo))) {
                            //x = (() -> Diff1DiffExpr + "*" + Term1);
                            //Term 1 already incorporated in Diff1DiffExpr
                            x = (() -> Diff1DiffExpr);
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:ProductRule:Rule6.3:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            log.info("Diff:parseProductRule:ProductRule:Rule6.1:x.Expr()=" + x.Expr());
                        } else if (!Diff2DiffExpr.equalsIgnoreCase("0.0")) {
                            if ((!Diff1DiffExpr.contains(DiffWithRespTo)) && (Diff2DiffExpr.isBlank())) {
                                x = (() -> "0.0");
                                ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseProductRule:ProductRule:Rule7.2.1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                log.info("Diff:parseProductRule:ProductRule:Rule7.2.1:x=" + x.Expr());
                            } else if (Diff1DiffExpr.contains("(")) {
                                x = (() -> Diff2DiffExpr + "*" + Diff1DiffExpr);
                                ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseProductRule:ProductRule:Rule7.2.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                log.info("Diff:parseProductRule:ProductRule:Rule7.2.2:x=" + x.Expr());
                            } else {
                                x = (() -> Diff1DiffExpr + "*" + Diff2DiffExpr);
                                ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseProductRule:ProductRule:Rule7.2.3:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                log.info("Diff:parseProductRule:ProductRule:Rule7.2.3:x=" + x.Expr());
                            }
                        } else if ((!IsAConstant(Term1, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant")) && (Diff2DiffExpr.equalsIgnoreCase("0.0"))) {
                            x = (() -> Term1 + "*" + Diff2DiffExpr);
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:ProductRule:Rule7.3:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            log.info("Diff:parseProductRule:ProductRule:Rule7.3:x.Expr()=" + x.Expr());
                        } else {
                            MathsContxtLAv.ProLambdaExtr y = MathsContxtLAv.parseExpr(AlgoName, Diff1.DiffExpr(), Diff2.DiffExpr(), "ProductRule", DiffWithRespTo, '*', LowLevelRules);
                            x = (() -> y.StrExpr());
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:ProductRule:Rule7.4:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            log.info("Diff:parseProductRule:ProductRule:Rule7.4:x.Expr()=" + x.Expr());
                        }
                    } else if (((Diff2DiffExpr.equalsIgnoreCase("")) || ((Diff2DiffExpr.equalsIgnoreCase("0.0"))))
                            && (!Term1.equalsIgnoreCase(Diff1DiffExpr))
                            && (IsAConstant(Diff2DiffExpr, DiffWithRespTo))
                            && (StrOperator.equalsIgnoreCase("*"))) {
                        x = (() -> "0.0");
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:ProductRule:Rule8:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Diff:parseProductRule:ProductRule:Rule8:x.Expr()=" + x.Expr());
                    } else if (((Diff1DiffExpr.equalsIgnoreCase("")) || ((Diff1DiffExpr.equalsIgnoreCase("1.0"))))
                            && (!Term1.equalsIgnoreCase(Diff1DiffExpr))
                            && (IsAConstant(Diff2DiffExpr, DiffWithRespTo))
                            && (StrOperator.equalsIgnoreCase("*")) && (DiffTermOperator == '/')) {
                        MathsContxtLAv.ProLambdaExtr y = MathsContxtLAv.parseExpr(AlgoName, Diff1.DiffExpr(), Diff2.DiffExpr(), "QuotientRule", DiffWithRespTo, DiffTermOperator, LowLevelRules);
                        x = (() -> y.StrExpr());
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:ProductRule:Rule9:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Diff:parseProductRule:ProductRule:Rule9:x.Expr()=" + x.Expr());
                    } else if (Diff1DiffExpr.equalsIgnoreCase("")) {
                        x = (() -> "0.0" + "*" + Diff2DiffExpr);
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:ProductRule:Rule10:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Diff:parseProductRule:ProductRule:Rule10:x.Expr()=" + x.Expr());
                    } else if (Diff1DiffExpr.equalsIgnoreCase("1.0")) {
                        x = (() -> Diff2DiffExpr);
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:ProductRule:Rule11:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Diff:parseProductRule:ProductRule:Rule11:x.Expr()=" + x.Expr());
                    } else {
                        MathsContxtLAv.ProLambdaExtr y = MathsContxtLAv.parseExpr(AlgoName, Diff1.DiffExpr(), Diff2.DiffExpr(), "ProductRule", DiffWithRespTo, TermOperator, LowLevelRules);
                        x = (() -> y.StrExpr());
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:ProductRule:Rule12:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Diff:parseProductRule:ProductRule:Rule12:x.Expr()=" + x.Expr());
                    }
                }
                log.info("Diff:parseProductRule:Final:x.Expr()=" + x.Expr());
                return x;
            }

            DiffrLambda parseQuotientRule() {
                DiffrLambda x = (() -> "");
                final String Diff1DiffExpr = Diff1.DiffExpr();
                final String Diff2DiffExpr = Diff2.DiffExpr();
                if (Rule.equalsIgnoreCase("QuotientRule")) {
                    if (!Term3.equalsIgnoreCase("")) {
                        x = (() -> ("(" + Term2 + "*" + Diff1DiffExpr + "-" + Term1 + "*" + Diff2DiffExpr) + "/" + "(" + Term2 + "*" + Term2 + ")" + ")");
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:QuotientRule:Rule1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Diff:parseQuotientRule:QuotientRule:Rule1:x.Expr()=" + x.Expr() + " Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                    } else if ((!Term2.equalsIgnoreCase("")) && (Term2.equalsIgnoreCase(DiffWithRespTo)) && (Diff1DiffExpr.equalsIgnoreCase("1.0"))) {
                        x = (() -> 1.0 + "/" + DiffWithRespTo + "^2.0");
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:QuotientRule:Rule2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Diff:parseQuotientRule:QuotientRule:Rule2:x.Expr()=" + x.Expr() + " Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                    } else if ((!Term1.equalsIgnoreCase("")) && (Diff1DiffExpr.equalsIgnoreCase("1.0"))) {
                        if (StrOperator.equalsIgnoreCase("*")) {
                            x = (() -> Term1);
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:QuotientRule:Rule3.1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        } else if ((StrOperator.equalsIgnoreCase("/")) && (!Term2.equalsIgnoreCase(Term1))) {
                            x = (() -> "1.0" + StrOperator + Term1);
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:QuotientRule:Rule3.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        } else if ((StrOperator.equalsIgnoreCase("/")) && (Term2.equalsIgnoreCase(Term1)) && (Diff2DiffExpr.equalsIgnoreCase(Term2)) && (!Term4.equalsIgnoreCase(""))) {
                            x = (() -> "1.0" + StrOperator + Term1);
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:QuotientRule:Rule3.3:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        } else if ((StrOperator.equalsIgnoreCase("/")) && (!Term4.equalsIgnoreCase(""))) {
                            x = (() -> "1.0" + StrOperator + Term1);
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:QuotientRule:Rule3.4:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        } else if ((StrOperator.equalsIgnoreCase("/"))) {
                            x = (() -> Term1);
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:QuotientRule:Rule3.5:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        }
                        log.info("Diff:parseQuotientRule:QuotientRule:Rule3:x.Expr()=" + x.Expr() + " Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                    } else if (Diff1DiffExpr.equalsIgnoreCase(DiffWithRespTo)) {
                        //Differentiation of x term:
                        x = (() -> Diff2DiffExpr);
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:QuotientRule:Rule4:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Diff:parseQuotientRule:QuotientRule:Rule4:x.Expr()=" + x.Expr() + " Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                    } else if (Diff2DiffExpr.equalsIgnoreCase(DiffWithRespTo)) {
                        //Differentiation of 1/x term:
                        x = (() -> Diff1DiffExpr + "/" + DiffWithRespTo + "^2.0");
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:QuotientRule:Rule5:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Diff:parseQuotientRule:QuotientRule:Rule5:x.Expr()=" + x.Expr() + " Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                    } else if ((!Diff1DiffExpr.equalsIgnoreCase("")) && (Term2.equalsIgnoreCase(Diff2DiffExpr))) {
                        if (!Diff2DiffExpr.equalsIgnoreCase("")) {
                            if (StrOperator.equalsIgnoreCase("/")) {
                                x = (() -> Diff1DiffExpr + "/" + Diff2DiffExpr);
                                ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:QuotientRule:Rule6.1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            } else {
                                x = (() -> Diff1DiffExpr);
                                ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:QuotientRule:Rule6.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            }
                        }
                        log.info("Diff:parseQuotientRule:QuotientRule:Rule6:x.Expr()=" + x.Expr() + " Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                    } else if ((!Diff1DiffExpr.equalsIgnoreCase(""))) {
                        x = (() -> Diff1DiffExpr + "/" + Diff2DiffExpr);
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:QuotientRule:Rule7:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Diff:parseQuotientRule:QuotientRule:Rule7:x.Expr()=" + x.Expr() + " Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                    } else if ((Diff1DiffExpr.equalsIgnoreCase(""))) {
                        x = (() -> Diff2DiffExpr);
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:QuotientRule:Rule8:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Diff:parseQuotientRule:QuotientRule:Rule8:x.Expr()=" + x.Expr() + " Term2=" + Term2 + " Diff2.DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                    } else {
                        MathsContxtLAv.ProLambdaExtr y = MathsContxtLAv.parseExpr(AlgoName, Diff1.DiffExpr(), Diff2.DiffExpr(), "QuotientRule", DiffWithRespTo, TermOperator, LowLevelRules);
                        x = (() -> y.StrExpr());
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:QuotientRule:Rule9:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Diff:parseQuotientRule:QuotientRule:Rule9:x.Expr()=" + x.Expr());
                    }
                }
                return x;
            }
        }.parseDiff();
    }

    public static String ApplyLambdaString(String AlgoName, String CompleteExprn, String Term1, DiffExpr Diff1, String Term2, DiffExpr Diff2, String Term3, String Term4, String StrOperator, String Rule, String DiffWithRespTo, int TermOperator, String LowLevelRules, String MapType, String IntegrORDiffr) {
        log.info("Diff:ApplyLambdaString:Initial :AlgoName(Calling Function)=" + AlgoName);
        log.info("Diff:ApplyLambdaString:Initial :Term1=" + Term1);
        log.info("Diff:ApplyLambdaString:Initial :Diff1.DiffExpr()=" + Diff1.DiffExpr());
        log.info("Diff:ApplyLambdaString:Initial :Term2=" + Term2);
        log.info("Diff:ApplyLambdaString:Initial :Diff2.DiffExpr()=" + Diff2.DiffExpr());
        log.info("Diff:ApplyLambdaString:Initial :Term3=" + Term3);
        log.info("Diff:ApplyLambdaString:Initial :Term4=" + Term4);
        log.info("Diff:ApplyLambdaString:Initial :StrOperator=" + StrOperator);
        log.info("Diff:ApplyLambdaString:Initial :Rule=" + Rule);
        log.info("Diff:ApplyLambdaString:Initial :LowLevelRules=" + LowLevelRules);
        log.info("Diff:ApplyLambdaString:Initial :SavedOperator=" + (char) SavedOperator);
        log.info("Diff:ApplyLambdaString:Initial :TermOperator=" + (char) TermOperator);
        log.info("Diff:ApplyLambdaString:Initial :DiffTermOperator=" + (char) DiffTermOperator);
        log.info("Diff:ApplyLambdaString:Initial :");
        log.info("Diff:ApplyLambdaString:Initial :");
        log.info("Diff:ApplyLambdaString:Initial :");
        if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
            System.out.println("Diff:ApplyLambdaString:Initial:AlgoName=" + AlgoName + " Rule=" + Rule + ":LowLevelRules=" + LowLevelRules + " StrIsAConstant=" + StrIsAConstant);
        }
        String x = "";
        DiffrLambdaStr y = (() -> "");
        y = parseDiffStr(AlgoName, CompleteExprn, Term1, Diff1, Term2, Diff2, Term3, Term4, StrOperator, Rule, DiffWithRespTo, TermOperator, LowLevelRules, MapType, IntegrORDiffr);
        x = y.StrExpr();
        if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
            System.out.println("Diff:ApplyLambdaString:Final:AlgoName=" + AlgoName + " Rule=" + Rule + ":LowLevelRules=" + LowLevelRules + " StrIsAConstant=" + StrIsAConstant + " x=" + x + " y.StrExpr()=" + y.StrExpr());
        }
        return x;
    }

    @FunctionalInterface
    public interface DiffrLambdaStr {

        String StrExpr();
    }

    public static DiffrLambdaStr parseDiffStr(String AlgoName, String CompleteExprn, String Term1, DiffExpr Diff1, String Term2, DiffExpr Diff2, String Term3, String Term4, String StrOperator, String Rule, String DiffWithRespTo, int TermOperator, String LowLevelRules, String MapType, String IntegrORDiffr) {
        return new Object() {

            DiffrLambdaStr parseDiffStr() {
                String x = "";
                final String Diff1DiffExpr = Diff1.DiffExpr();
                final String Diff2DiffExpr = Diff2.DiffExpr();
                if (Rule.equalsIgnoreCase("NoExponentRuleTerm")) {
                    x = parseNoExponentRuleTerm();
                    log.info("Diff:String:parseOper:NoExponentRuleTerm:x=" + x);
                } else if (Rule.equalsIgnoreCase("NoExponentRuleDiff")) {
                    x = parseNoExponentRuleDiff();
                    log.info("Diff:String:parseOper:NoExponentRuleDiff:x=" + x);
                } else if (Rule.equalsIgnoreCase("CoeffExponentRule")) {
                    x = parseCoeffExponentRule();
                    log.info("Diff:String:parseOper:CoeffExponentRule:x=" + x);
                } else if (Rule.equalsIgnoreCase("ConstantRule")) {
                    x = parseConstantRule();
                    log.info("Diff:String:ApplyFuncRules:ConstantRule:x=" + x);
                } else if ((Rule.equalsIgnoreCase("SumRule"))
                        || (Rule.equalsIgnoreCase("SubtractionRule"))) {
                    x = parseSumRule();
                    log.info("Diff:String:parseOper:SumRule OR SubtractionRule:x)=" + x);
                } else if (Rule.equalsIgnoreCase("ExponentRule")) {

                    log.info("Diff:String:parseOper:ExponentRule:x=" + x);
                } else if (Rule.equalsIgnoreCase("MappedProductRule")) {
                    if ((!Diff1DiffExpr.equalsIgnoreCase(Diff2DiffExpr)) && (StrOperator.equalsIgnoreCase("*"))) {
                        String Ux = "";
                        String UDashx = "";
                        String Vx = "";
                        String VDashx = "";
                        // Set Ux Parameters
                        if (Diff1DiffExpr.contains("Parenthesis")) {
                            Expr_Func_Split(Diff1DiffExpr, DiffWithRespTo);
                            Ux = ParanExpr;
                            UDashx = ParanDiffExpr;
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:String:parseOper:MappedProductRule:FSM A:Ux=" + Ux + " UDashx=" + UDashx);
                            }
                        } else if ((Diff1DiffExpr.contains("(")) && (Diff1DiffExpr.contains(")"))) {
                            Split(Diff1DiffExpr, DiffWithRespTo);
                            Ux = ParanExpr;
                            UDashx = ParanDiffExpr;
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:String:parseOper:MappedProductRule:FSM B:Ux=" + Ux + " UDashx=" + UDashx);
                            }
                        } else if ((!Diff1DiffExpr.contains("Parenthesis")) && (!IsAConstant(Diff1DiffExpr, DiffWithRespTo))) {
                            Ux = Term1;
                            UDashx = Diff1DiffExpr;
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:String:parseOper:MappedProductRule:FSM C:Ux=" + Ux + " UDashx=" + UDashx);
                            }
                        } else if ((!Diff1DiffExpr.contains("Parenthesis")) && (IsAConstant(Diff1DiffExpr, DiffWithRespTo))) {
                            Ux = Term1;
                            UDashx = Diff1DiffExpr;
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:String:parseOper:MappedProductRule:FSM D:Ux=" + Ux + " UDashx=" + UDashx);
                            }
                        } else {
                            Ux = Term1;
                            UDashx = Diff1DiffExpr;
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:String:parseOper:MappedProductRule:FSM E:Ux=" + Ux + " UDashx=" + UDashx);
                            }
                        }
                        // Set Vx Parameters
                        if (Diff2DiffExpr.contains("Parenthesis")) {
                            Split(Diff2DiffExpr, DiffWithRespTo);
                            Expr_Func_Split(Diff2DiffExpr, DiffWithRespTo);
                            Vx = ParanExpr;
                            VDashx = ParanDiffExpr;
                            if ((ParanExpr.equalsIgnoreCase("")) && (ParanDiffExpr.equalsIgnoreCase(""))) {
                                Vx = Term2;
                                VDashx = Diff2DiffExpr;
                                if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Diff:String:parseOper:MappedProductRule:Internal:FSM2:Vx=" + Vx + " VDashx=" + VDashx);
                                }
                            }
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:String:parseOper:MappedProductRule:FSM1:Vx=" + Vx + " VDashx=" + VDashx);
                            }
                        } else if ((Diff2DiffExpr.contains("(")) && (Diff2DiffExpr.contains(")"))) {
                            Split(Diff2DiffExpr, DiffWithRespTo);
                            Expr_Func_Split(Diff2DiffExpr, DiffWithRespTo);
                            Vx = ParanExpr;
                            VDashx = ParanDiffExpr;
                            if ((ParanExpr.equalsIgnoreCase("")) && (ParanDiffExpr.equalsIgnoreCase(""))) {
                                Vx = Term2;
                                VDashx = Diff2DiffExpr;
                                if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Diff:String:parseOper:MappedProductRule:Internal:FSM2:Vx=" + Vx + " VDashx=" + VDashx);
                                }
                            }
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:String:parseOper:MappedProductRule:FSM2:Vx=" + Vx + " VDashx=" + VDashx);
                            }
                        } else if ((!Diff2DiffExpr.contains("Parenthesis")) && (!IsAConstant(Diff2DiffExpr, DiffWithRespTo))) {
                            Vx = Term2;
                            VDashx = Diff2DiffExpr;
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:String:parseOper:MappedProductRule:FSM3:Vx=" + Vx + " VDashx=" + VDashx);
                            }
                        } else if ((!Diff2DiffExpr.contains("Parenthesis")) && (IsAConstant(Diff2DiffExpr, DiffWithRespTo))) {
                            Vx = Term2;
                            VDashx = Diff2DiffExpr;
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:String:parseOper:MappedProductRule:FSM4:Vx=" + Vx + " VDashx=" + VDashx);
                            }
                        } else {
                            Vx = Term2;
                            VDashx = Diff2DiffExpr;
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:String:parseOper:MappedProductRule:FSM5:Vx=" + Vx + " VDashx=" + VDashx);
                            }
                        }
                        final String Vx1 = Vx;
                        final String UDashx1 = UDashx;
                        final String VDashx1 = VDashx;
                        final String Ux1 = Ux;
                        if ((IsAConstant(Diff1DiffExpr, DiffWithRespTo)) && (Diff2DiffExpr.contains("Parenthesis"))) {
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println(ConsoleColors.BLUE + "Diff:String:parseOper:MappedProductRule:Rule1:Diff1DiffExpr=" + Diff1DiffExpr + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:String:parseOper:MappedProductRule:Rule1:Diff2DiffExpr=" + Diff2DiffExpr + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:String:parseOper:MappedProductRule:Rule1:Vx1=" + Vx1 + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:String:parseOper:MappedProductRule:Rule1:UDashx1=" + UDashx1 + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:String:parseOper:MappedProductRule:Rule1::VDashx1=" + VDashx1 + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:String:parseOper:MappedProductRule:Rule1::Ux1=" + Ux1 + ConsoleColors.RESET);
                            }
                            x = UDashx1 + "*" + VDashx1;
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:String:parseOper:MappedProductRule:Rule1:x=" + x);
                            }
                        } else if ((IsAConstant(Diff2DiffExpr, DiffWithRespTo)) && (Diff1DiffExpr.contains("Parenthesis"))) {
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println(ConsoleColors.BLUE + "Diff:String:parseOper:MappedProductRule:Rule2:Diff1DiffExpr=" + Diff1DiffExpr + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:String:parseOper:MappedProductRule:Rule2:Diff2DiffExpr=" + Diff2DiffExpr + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:String:parseOper:MappedProductRule:Rule2:Vx1=" + Vx1 + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:String:parseOper:MappedProductRule:Rule2:UDashx1=" + UDashx1 + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:String:parseOper:MappedProductRule:Rule2::VDashx1=" + VDashx1 + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:String:parseOper:MappedProductRule:Rule2::Ux1=" + Ux1 + ConsoleColors.RESET);
                            }
                            x = Ux1 + "*" + VDashx1;
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:String:parseOper:MappedProductRule:Rule2:x=" + x);
                            }
                        } else if ((Vx1.contains("+")) || (Vx1.contains("-"))) {
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println(ConsoleColors.BLUE + "Diff:String:parseOper:MappedProductRule:Rule3:Diff1DiffExpr=" + Diff1DiffExpr + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:String:parseOper:MappedProductRule:Rule3:Diff2DiffExpr=" + Diff2DiffExpr + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:String:parseOper:MappedProductRule:Rule3:Vx1=" + Vx1 + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:String:parseOper:MappedProductRule:Rule3:UDashx1=" + UDashx1 + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:String:parseOper:MappedProductRule:Rule3::VDashx1=" + VDashx1 + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:String:parseOper:MappedProductRule:Rule3::Ux1=" + Ux1 + ConsoleColors.RESET);
                            }
                            if ((Vx1.startsWith("(")) && (Vx1.endsWith(")"))) {
                                x = Vx1 + "*" + UDashx1 + "+(" + VDashx1 + ")*" + Ux1;
                            } else {
                                x = "(" + Vx1 + ")*" + UDashx1 + "+" + "(" + VDashx1 + ")*" + Ux1;
                            }
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:String:parseOper:MappedProductRule:Rule3:x=" + x);
                            }
                        } else {
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println(ConsoleColors.BLUE + "Diff:String:parseOper:MappedProductRule:Rule4:Diff1DiffExpr=" + Diff1DiffExpr + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:String:parseOper:MappedProductRule:Rule4:Diff2DiffExpr=" + Diff2DiffExpr + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:String:parseOper:MappedProductRule:Rule4:Vx1=" + Vx1 + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:String:parseOper:MappedProductRule:Rule4:UDashx1=" + UDashx1 + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:String:parseOper:MappedProductRule:Rule4::VDashx1=" + VDashx1 + ConsoleColors.RESET);
                                System.out.println(ConsoleColors.BLUE + "Diff:String:parseOper:MappedProductRule:Rule4::Ux1=" + Ux1 + ConsoleColors.RESET);
                            }
                            x = Vx1 + "*" + UDashx1 + "+" + VDashx1 + "*" + Ux1;
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:String:parseOper:MappedProductRule:Rule4:x=" + x);
                            }
                        }
                    }
                    ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:String:MappedProductRule:Rule1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                    if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                        System.out.println("Diff:String:MappedProductRule:Rule1:x.Expr()=" + x);
                    }
                    log.info("Diff:String:parseOper:MappedProductRule:x=" + x);
                } else if (Rule.equalsIgnoreCase("ProductRule")) {
                    x = parseProductRule();
                    log.info("Diff:String:parseOper:ProductRule:x=" + x);
                } else if (Rule.equalsIgnoreCase("MappedQuotientRule")) {
                    if ((!Diff1DiffExpr.equalsIgnoreCase(Diff2DiffExpr)) && (StrOperator.equalsIgnoreCase("/"))) {
                        String Ux = "";
                        String UDashx = "";
                        String Vx = "";
                        String VDashx = "";
                        // Set Ux Parameters
                        if (Diff1DiffExpr.contains("Parenthesis")) {
                            Expr_Func_Split(Diff1DiffExpr, DiffWithRespTo);
                            Ux = ParanExpr;
                            UDashx = ParanDiffExpr;

                        } else if (!Diff1DiffExpr.contains("Parenthesis")) {
                            Ux = Term1;
                            UDashx = Diff1DiffExpr;
                        }
                        // Set Vx Parameters
                        if (Diff2DiffExpr.contains("Parenthesis")) {
                            Expr_Func_Split(Diff2DiffExpr, DiffWithRespTo);
                            Vx = ParanExpr;
                            VDashx = ParanDiffExpr;

                        } else if (!Diff2DiffExpr.contains("Parenthesis")) {
                            Vx = Term2;
                            VDashx = Diff2DiffExpr;
                        }
                        final String Vx1 = Vx;
                        final String UDashx1 = UDashx;
                        final String VDashx1 = VDashx;
                        final String Ux1 = Ux;
                        if ((IsAConstant(Diff1DiffExpr, DiffWithRespTo)) && (Diff2DiffExpr.contains("Parenthesis"))) {
                            x = UDashx1 + "/" + Vx1 + "^2" + "*" + VDashx1;
                            log.info("Diff:String:parseOper:MappedQuotientRule:x=" + x);
                        } else if ((IsAConstant(Diff2DiffExpr, DiffWithRespTo)) && (Diff1DiffExpr.contains("Parenthesis"))) {
                            x = Ux1 + "/" + Vx1 + "^2" + "*" + VDashx1;
                            log.info("Diff:String:parseOper:MappedQuotientRule:x=" + x);
                        } else {
                            x = "(" + Vx1 + "*" + UDashx1 + "-" + VDashx1 + "*" + Ux1 + ")" + "/" + Vx1 + "/" + Vx1;
                            log.info("Diff:String:parseOper:MappedQuotientRule:x=" + x);
                        }
                    }
                    log.info("Diff:String:parseOper:MappedQuotientRule:x=" + x);
                } else if (Rule.equalsIgnoreCase("QuotientRule")) {
                    x = parseQuotientRule();
                    log.info("Diff:String:parseOperQuotientRule:x=" + x);
                }
                log.info("Diff:String:parseDiffStr:Final:x=" + x);
                final String y = x;
                return (() -> y);
            }

            String parseNoExponentRuleTerm() {
                String x = "";
                final String Diff1DiffExpr = Diff1.DiffExpr();
                final String Diff2DiffExpr = Diff2.DiffExpr();
                if (Rule.equalsIgnoreCase("NoExponentRuleTerm")) {
                    x = Term1;
                }
                ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:NoExponentRuleTerm:Only Rule:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                log.info("Diff:String:parseNoExponentRuleTerm:Final:x=" + x);
                return x;
            }

            String parseNoExponentRuleDiff() {
                String x = "";
                final String Diff1DiffExpr = Diff1.DiffExpr();
                final String Diff2DiffExpr = Diff2.DiffExpr();
                if (Rule.equalsIgnoreCase("NoExponentRuleDiff")) {
                    if (Term1.equalsIgnoreCase("")) {
                        x = Diff1DiffExpr;
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:NoExponentRuleTerm:Rule 1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        log.info("Diff:String:parseNoExponentRuleDiff:Rule 1:x=" + x);
                    } else if (((StrOperator.equalsIgnoreCase("+")) || (StrOperator.equalsIgnoreCase("-"))) && (IsAConstant(Term1, DiffWithRespTo)) && ((IsAConstant(Diff1DiffExpr, DiffWithRespTo)))) {
                        x = "0.0";
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:NoExponentRuleTerm:Rule 2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        log.info("Diff:String:parseNoExponentRuleDiff:Rule 2:x=" + x);
                    } else if (((StrOperator.equalsIgnoreCase("+")) || (StrOperator.equalsIgnoreCase("-")))
                            && (!IsAConstant(Term1, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant"))
                            && ((!IsAConstant(Diff1DiffExpr, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant")))
                            && (!IsExtremity(Diff1DiffExpr))) {
                        if (!Term1.endsWith("*0.0")) {
                            x = Term1 + "*" + "0.0";
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:NoExponentRuleTerm:Rule 3.1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        } else {
                            x = Term1;
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:NoExponentRuleTerm:Rule 3.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        }
                        log.info("Diff:String:parseNoExponentRuleDiff:Rule 3:x=" + x);
                    } else if ((((StrOperator.equalsIgnoreCase("*")) || (StrOperator.equalsIgnoreCase("/")))
                            && (!Diff1DiffExpr.equalsIgnoreCase(Diff2DiffExpr))
                            && (!IsExtremity(Diff1DiffExpr))
                            && (Term1.equalsIgnoreCase(Diff1DiffExpr))
                            && (Term1.equalsIgnoreCase(Term2))
                            && ((!IsAConstant(Diff1DiffExpr, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant"))))) {
                        x = Term1;
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:NoExponentRuleTerm:Rule 4:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        log.info("Diff:String:parseNoExponentRuleDiff:Rule 4:x=" + x);
                    } else if ((((StrOperator.equalsIgnoreCase("*")) || (StrOperator.equalsIgnoreCase("/")))
                            && (!Diff1DiffExpr.equalsIgnoreCase(Diff2DiffExpr))
                            && (!IsExtremity(Diff1DiffExpr))
                            && ((!IsAConstant(Diff1DiffExpr, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant"))))) {
                        x = Term1 + StrOperator + "0.0";
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:NoExponentRuleTerm:Rule 5:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        log.info("Diff:String:parseNoExponentRuleDiff:Rule 5:x=" + x);
                    } else if ((Term1.equalsIgnoreCase(Diff1DiffExpr)) && (!IsExtremity(Diff1DiffExpr)) && (!IsAConstant(Diff1DiffExpr, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant"))) {
                        if ((StrOperator.equalsIgnoreCase("*")) || (StrOperator.equalsIgnoreCase("/"))) {
                            x = Diff1DiffExpr + StrOperator + "0.0";
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:NoExponentRuleTerm:Rule 6.1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        } else {
                            x = Diff1DiffExpr + "*" + "0.0";
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:NoExponentRuleTerm:Rule 6.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        }
                        log.info("Diff:String:parseNoExponentRuleDiff:Rule 6:x=" + x);
                    } else if (!Term1.contains("Parenthesis")) {
                        x = Diff1DiffExpr;
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:NoExponentRuleTerm:Rule 7:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        log.info("Diff:String:parseNoExponentRuleDiff:Rule 7:x=" + x);
                    }// Below Condition to be expanded:Rule 8
                    else if (!Term1.contains("Parenthesis")) {
                        x = Term1;
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:NoExponentRuleTerm:Rule 8:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        log.info("Diff:String:parseNoExponentRuleDiff:Rule 8:x=" + x);
                    }
                }
                log.info("Diff:String:parseNoExponentRuleDiff:Final:x=" + x);
                return x;
            }

            String parseCoeffExponentRule() {
                String x = "";
                final String Diff1DiffExpr = Diff1.DiffExpr();
                final String Diff2DiffExpr = Diff2.DiffExpr();
                if (Rule.equalsIgnoreCase("CoeffExponentRule")) {
                    if (!Term4.equalsIgnoreCase("")) {
                        x = Term4 + "*" + Term3 + "^" + Term2;
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:CoeffExponentRule:Rule 1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                    } else if ((!Term3.equalsIgnoreCase("")) && (!Term3.equalsIgnoreCase("1.0"))) {
                        x = Term3 + "^" + Term2;
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:CoeffExponentRule:Rule 2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                    } else {
                        x = Term1;
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:CoeffExponentRule:Rule 3:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                    }
                }
                log.info("Diff:String:parseCoeffExponentRule:Final:x=" + x);
                return x;
            }

            String parseConstantRule() {
                String x = "";
                final String Diff1DiffExpr = Diff1.DiffExpr();
                final String Diff2DiffExpr = Diff2.DiffExpr();
                if (Rule.equalsIgnoreCase("ConstantRule")) {
                    if (((Term1 != null) && (!Term1.equalsIgnoreCase("")))
                            && ((Term2 != null) && (!Term2.equalsIgnoreCase("")))
                            && (Term1.equalsIgnoreCase(Term2))
                            && (Diff1DiffExpr.equalsIgnoreCase(Diff2DiffExpr))
                            && (Term1.equalsIgnoreCase(Diff1DiffExpr))
                            && (Term1.equalsIgnoreCase(DiffWithRespTo)) && (!IsAConstant(Term1, DiffWithRespTo))) {
                        log.info("Diff:String:parseConstantRule:Rule1:Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                        x = "1.0";
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseConstantRule:Rule 1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Diff:String:parseConstantRule:Rule1:x=" + x);
                        }
                    } else if (((Term1 != null) && (!Term1.equalsIgnoreCase(""))) && (!IsAConstant(Term1, DiffWithRespTo)) && (Term2.equalsIgnoreCase(DiffWithRespTo)) && (StrOperator.equalsIgnoreCase("*"))) {
                        log.info("Diff:String:parseConstantRule:Rule2:Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                        x = Term1;
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseConstantRule:Rule 2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Diff:String:parseConstantRule:Rule2:x=" + x);
                        }
                    } else if (((Term1 != null) && (!Term1.equalsIgnoreCase(""))) && (!IsAConstant(Term1, DiffWithRespTo)) && (Term2.equalsIgnoreCase(DiffWithRespTo)) && (StrOperator.equalsIgnoreCase("/"))) {
                        log.info("Diff:String:parseConstantRule:Rule3:Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                        x = "-" + Term1 + "/" + DiffWithRespTo + "^2.0";
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseConstantRule:Rule 3:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Diff:String:parseConstantRule:Rule3:x=" + x);
                        }
                    } else if (((Term1 != null) && (!Term1.equalsIgnoreCase(""))) && (!IsAConstant(Term1, DiffWithRespTo)) && (Term2 != null) && (!Term2.equalsIgnoreCase(""))) {
                        log.info("Diff:String:parseConstantRule:Rule4:Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                        if (Term3.equalsIgnoreCase("")) {
                            if ((Term2.contains("@Parenthesis@")) && (!Diff1DiffExpr.equalsIgnoreCase(DiffWithRespTo))) {
                                Split(Term2, DiffWithRespTo);
                                Expr_Func_Split(Term2, DiffWithRespTo);
                                if ((!ParanExpr.equalsIgnoreCase("")) && (!ParanExpr.isBlank())) {
                                    x = Diff1DiffExpr + StrOperator + ParanExpr;
                                    ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseConstantRule:Rule4.1.1.1.1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                                } else if ((!FactorsExpr.equalsIgnoreCase("")) && (!FactorsExpr.isBlank())) {
                                    x = Diff1DiffExpr + StrOperator + FactorsExpr;
                                    ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseConstantRule:Rule4.1.1.1.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                                } else if (Term2.endsWith("@Parenthesis@")) {
                                    final String Temp = Diff2DiffExpr.replace("@Parenthesis@", "");
                                    x = Diff1DiffExpr + StrOperator + Temp;
                                    ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseConstantRule:Rule4.1.1.3:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                                } else {
                                    Split(Term2, DiffWithRespTo);
                                    Expr_Func_Split(Term2, DiffWithRespTo);
                                    x = Diff1DiffExpr + StrOperator + FactorsDiffExpr;
                                    ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseConstantRule:Rule4.1.1.4:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);

                                }
                                //ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseConstantRule:Rule4.1.1.1:", Rule, LowLevelRules, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                                if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Diff:parseConstantRule:Rule4.1.1.1:x=" + x);
                                }
                            } else if ((Term2.contains("@Parenthesis@")) && (Diff1DiffExpr.equalsIgnoreCase(DiffWithRespTo)) && (!Term2.contains(DiffWithRespTo))) {
                                if (Term1.equalsIgnoreCase(Diff1DiffExpr)) {
                                    Split(Term2, DiffWithRespTo);
                                    Expr_Func_Split(Term2, DiffWithRespTo);
                                    if ((!ParanExpr.equalsIgnoreCase("")) && (!ParanExpr.isBlank())) {
                                        x = ParanExpr;
                                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseConstantRule:Rule4.1.1.2.1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                                    } else if ((!FactorsExpr.equalsIgnoreCase("")) && (!FactorsExpr.isBlank())) {
                                        x = FactorsExpr;
                                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseConstantRule:Rule4.1.1.2.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                                    } else if (Term2.endsWith("@Parenthesis@")) {
                                        final String Temp = Term2.replace("@Parenthesis@", "");
                                        x = Temp;
                                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseConstantRule:Rule4.1.1.2.3:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                                    } else {
                                        Split(Term2, DiffWithRespTo);
                                        Expr_Func_Split(Term2, DiffWithRespTo);
                                        x = FactorsDiffExpr;
                                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseConstantRule:Rule4.1.1.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                                    }
                                } else {
                                    Split(Term2, DiffWithRespTo);
                                    Expr_Func_Split(Term2, DiffWithRespTo);
                                    if ((!ParanExpr.equalsIgnoreCase("")) && (!ParanExpr.isBlank())) {
                                        x = Diff1DiffExpr + StrOperator + ParanExpr;
                                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseConstantRule:Rule4.1.1.2.1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                                    } else if ((!FactorsExpr.equalsIgnoreCase("")) && (!FactorsExpr.isBlank())) {
                                        x = Diff1DiffExpr + StrOperator + FactorsExpr;
                                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule4.1.1.2.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                                    } else if (Term2.endsWith("@Parenthesis@")) {
                                        final String Temp = Term2.replace("@Parenthesis@", "");
                                        x = Temp;
                                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule4.1.1.2.3:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                                    } else {
                                        Split(Term2, DiffWithRespTo);
                                        Expr_Func_Split(Term2, DiffWithRespTo);
                                        x = Diff1DiffExpr + StrOperator + FactorsDiffExpr;
                                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule4.1.1.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                                    }
                                    ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:parseConstantRule:Rule4.1.1.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                                    if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("Diff:parseConstantRule:Rule4.1.1.2:x=" + x);
                                    }
                                }
                            } else {
                                x = Term1 + StrOperator + Term2;
                                ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str::parseConstantRule:Rule4.1.1.3:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                                if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Diff:Str::parseConstantRule:Rule4.1.1.3:x=" + x);
                                }
                            }
                            log.info("Diff:Str::parseConstantRule:Rule4.1:Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                            log.info("Diff:Str::parseConstantRule:Rule4.1:x=" + x);
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:Str::parseConstantRule:Rule4.1:x=" + x);
                            }
                        } else {
                            x = Term1 + StrOperator + Term3;
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str::parseConstantRule:Rule4.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                            log.info("Diff:Str::parseConstantRule:Rule4.2:Term3=" + Term3 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                            log.info("Diff:Str::parseConstantRule:Rule4.2:x=" + x);
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:Str:parseConstantRule:Rule4.2:x=" + x);
                            }
                        }
                    } else if (((Term1 != null) && (!Term1.equalsIgnoreCase(""))) && (Term2.equalsIgnoreCase(Diff2DiffExpr)) && (StrOperator.equalsIgnoreCase("/")) && (Term2.equalsIgnoreCase(DiffWithRespTo))) {
                        log.info("Diff:String:parseConstantRule:Rule5:Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                        if ((Diff1DiffExpr.equalsIgnoreCase("Infinity")) || (Diff1DiffExpr.equalsIgnoreCase("NaN"))) {
                            x = Diff1DiffExpr + StrOperator + DiffWithRespTo + "^2.0";
                            log.info("Diff:String:parseConstantRule:Rule5.1:x=" + x);
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseConstantRule:Rule5.1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:String:parseConstantRule:Rule5.1:x=" + x);
                            }
                        } else {
                            if (StrOperator.equalsIgnoreCase("/")) //Map Sign with "-"
                            {
                                x = "-" + Term1 + StrOperator + DiffWithRespTo + "^2.0";
                                ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseConstantRule:Rule5.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                                log.info("Diff:String:parseConstantRule:Rule5.2:x=" + x);
                                if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Diff:String:parseConstantRule:Rule5.2:x=" + x);
                                }
                            } else if (StrOperator.equalsIgnoreCase("*")) {
                                x = Term1 + StrOperator + DiffWithRespTo + "^2.0";
                                ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseConstantRule:Rule5.3:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                                log.info("Diff:String:parseConstantRule:Rule5.3:x=" + x);
                                if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Diff:String:parseConstantRule:Rule5.3:x=" + x);
                                }
                            }
                        }
                    } else if (((Term1 != null) && (!Term1.equalsIgnoreCase(""))) && (Term2.equalsIgnoreCase(Diff2DiffExpr)) && (StrOperator.equalsIgnoreCase("/"))) {
                        log.info("Diff:String:parseConstantRule:Rule6:Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                        x = Term1 + StrOperator + Diff1DiffExpr;
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseConstantRule:Rule6:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("Diff:String:parseConstantRule:Rule6:x=" + x);
                        }
                    } else if (((Term1 != null) && (!Term1.equalsIgnoreCase(""))) && (Term2.equalsIgnoreCase(Diff2DiffExpr))) {
                        log.info("Diff:String:parseConstantRule:Rule7:Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                        if ((Term1.equalsIgnoreCase("0.0")) || (Term1.equalsIgnoreCase("-0.0")) || (Term1.equalsIgnoreCase("+0.0"))
                                || (Term1.equalsIgnoreCase("0"))) {
                            x = "0.0";
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseConstantRule:Rule7.1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        } else if ((IsExtremity(Term1))
                                && (Diff1DiffExpr.equalsIgnoreCase(""))
                                && (Diff2DiffExpr.equalsIgnoreCase(""))
                                && (Term2.equalsIgnoreCase(""))) {
                            x = Term1;
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseConstantRule:Rule7.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                            log.info("Diff:String:parseConstantRule:Rule7.2:x=" + x);
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:String:parseConstantRule:Rule7.2:x=" + x);
                            }
                        } else if ((!Diff2DiffExpr.equalsIgnoreCase(DiffWithRespTo)) && (Diff1DiffExpr.contains(Term1))) {
                            String Temp = Diff1DiffExpr.replaceFirst(Term1, "");
                            if (Temp.startsWith("*")) {
                                Temp = Temp.replaceFirst("\\*", "");
                            } else if (Temp.startsWith("/")) {
                                Temp = Temp.replaceFirst("/", "");
                            }
                            if ((functionsDiff.containsKey(Temp)) && (!Diff2DiffExpr.contains(Term1))) {
                                x = Term1 + StrOperator + Diff2DiffExpr;
                                ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseConstantRule:Rule7.2.1.1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                                log.info("Diff:String:parseConstantRule:Rule7.2.1.1:x=" + x + " Temp=" + Temp);
                                if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Diff:String::parseConstantRule:Rule7.2.1.1:x=" + x + " Temp=" + Temp);
                                }
                            } else if (functionsDiff.containsKey(Temp)) {
                                x = Diff2DiffExpr;
                                ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseConstantRule:Rule7.2.1.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                                log.info("Diff:String:parseConstantRule:Rule7.2.1.2:x=" + x + " Temp=" + Temp);
                                if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Diff:String::parseConstantRule:Rule7.2.1.2:x=" + x + " Temp=" + Temp);
                                }
                            } else {
                                x = Diff1DiffExpr + StrOperator + Diff2DiffExpr;
                                ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseConstantRule:Rule7.2.1.3:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                                log.info("Diff:String:parseConstantRule:Rule7.2.1.2:x=" + x + " Temp=" + Temp);
                                if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Diff:String:parseConstantRule:Rule7.2.1.2:x=" + x + " Temp=" + Temp);
                                }
                            }
                            log.info("Diff:String:parseConstantRule:Rule7.2.1:x=" + x + " Temp=" + Temp);
                        } else if (!Diff2DiffExpr.equalsIgnoreCase(DiffWithRespTo)) {
                            x = Diff1DiffExpr + StrOperator + Diff2DiffExpr;
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseConstantRule:Rule7.2.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                            log.info("Diff:String:parseConstantRule:Rule7.2.2:x=" + x);
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:String:parseConstantRule:Rule7.2.2:x=" + x);
                            }
                        } else if ((Term2.equalsIgnoreCase(Diff2DiffExpr)) && (Diff2DiffExpr.equalsIgnoreCase(DiffWithRespTo)) && (IsAConstant(Term1, DiffWithRespTo))) {
                            x = Term1;
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseConstantRule:Rule7.2.3:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                            log.info("Diff:String:parseConstantRule:Rule7.2.3:x=" + x);
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:String:parseConstantRule:Rule7.2.3:x=" + x);
                            }
                        } else {
                            x = Diff1DiffExpr;
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseConstantRule:Rule7.3:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                            log.info("Diff:String:parseConstantRule:Rule7.3:x=" + x);
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:String:parseConstantRule:Rule7.3:x=" + x);
                            }
                        }
                    } else if (((Term1 != null) && (!Term1.equalsIgnoreCase(""))) && (Term2.equalsIgnoreCase(Term1))) {
                        log.info("Diff:String:parseConstantRule:Rule8:Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                        if ((Term1.equalsIgnoreCase("0.0")) || (Term1.equalsIgnoreCase("-0.0")) || (Term1.equalsIgnoreCase("+0.0"))
                                || (Term1.equalsIgnoreCase("0"))) {
                            x = "0.0";
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseConstantRule:Rule8.1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        } else if ((IsExtremity(Term1))
                                && (Diff1DiffExpr.equalsIgnoreCase(""))
                                && (Diff2DiffExpr.equalsIgnoreCase(""))
                                && (Term2.equalsIgnoreCase(""))) {
                            x = Term1;
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseConstantRule:Rule8.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                            log.info("Diff:String:parseConstantRule:Rule8.2:x=" + x);
                            if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                                System.out.println("Diff:String:parseConstantRule:Rule8.2:x=" + x);
                            }
                        } else if ((!Diff2DiffExpr.equalsIgnoreCase(DiffWithRespTo)) && (Diff1DiffExpr.contains(Term1))) {
                            String Temp = Diff1DiffExpr.replaceFirst(Term1, "");
                            if (Temp.startsWith("*")) {
                                Temp = Temp.replaceFirst("\\*", "");
                            } else if (Temp.startsWith("/")) {
                                Temp = Temp.replaceFirst("/", "");
                            }
                            if ((functionsDiff.containsKey(Temp)) && (!Diff2DiffExpr.contains(Term1))) {
                                x = Term1 + StrOperator + Diff2DiffExpr;
                                ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseConstantRule:Rule8.2.1.1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                                log.info("Diff:String:parseConstantRule:Rule8.2.1.1:x=" + x + " Temp=" + Temp);
                            } else if (functionsDiff.containsKey(Temp)) {
                                x = Diff2DiffExpr;
                                ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseConstantRule:Rule8.2.1.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                                log.info("Diff:String:parseConstantRule:Rule8.2.1.2:x=" + x + " Temp=" + Temp);
                            } else {
                                x = Diff1DiffExpr + StrOperator + Diff2DiffExpr;
                                ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseConstantRule:Rule8.2.1.3:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                                log.info("Diff:String:parseConstantRule:Rule8.2.1.2:x=" + x + " Temp=" + Temp);
                            }
                            log.info("Diff:String:parseConstantRule:Rule8.2.1:x=" + x + " Temp=" + Temp);
                        } else if (!Diff2DiffExpr.equalsIgnoreCase(DiffWithRespTo)) {
                            x = Diff1DiffExpr + StrOperator + Diff2DiffExpr;
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseConstantRule:Rule8.2.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                            log.info("Diff:String:parseConstantRule:Rule8.2.2:x=" + x);
                        } else if ((Term2.equalsIgnoreCase(Diff2DiffExpr)) && (Diff2DiffExpr.equalsIgnoreCase(DiffWithRespTo)) && (IsAConstant(Term1, DiffWithRespTo))) {
                            x = Term1;
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseConstantRule:Rule8.2.3:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                            log.info("Diff:String:parseConstantRule:Rule8.2.3:x=" + x);
                        } else {
                            x = Diff1DiffExpr;
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseConstantRule:Rule8.3:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                            log.info("Diff:String:parseConstantRule:Rule8.3:x=" + x);
                        }
                    } else {
                        log.info("Diff:String:parseConstantRule:Rule9:Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                        if ((Term2.equalsIgnoreCase(DiffWithRespTo)) && (Diff2DiffExpr.equalsIgnoreCase(DiffWithRespTo))) {
                            x = "-" + Diff1DiffExpr + "/" + DiffWithRespTo + "^2.0";
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseConstantRule:Rule9.1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        } else {
                            x = Term2;
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseConstantRule:Rule9.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        }
                        log.info("Diff:String:parseConstantRule:Rule9:x=" + x);
                    }
                }
                log.info("Diff:String:parseConstantRule:Final:x=" + x);
                if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
                    System.out.println("Diff:String:parseConstantRule:Final:x=" + x);
                }
                return x;
            }

            String parseSumRule() {
                String x = "";
                final String Diff1DiffExpr = Diff1.DiffExpr();
                final String Diff2DiffExpr = Diff2.DiffExpr();
                if ((Rule.equalsIgnoreCase("SumRule"))
                        || (Rule.equalsIgnoreCase("SubtractionRule"))) {
                    if ((!Diff1DiffExpr.equalsIgnoreCase("")) && (!Diff2DiffExpr.equalsIgnoreCase("")) && (!Diff2DiffExpr.equalsIgnoreCase("0.0"))) {
                        log.info("Diff:String:parseSumRule:Rule1:Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                        if ((StrOperator.equalsIgnoreCase("+")) && ((!Diff2DiffExpr.startsWith("-")) && (!Diff2DiffExpr.startsWith("-")))) {
                            x = Diff1DiffExpr + StrOperator + Diff2DiffExpr;
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseSumRule:SumRule:SubtractionRule:Rule1:", Rule, LowLevelRules, false, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        } else if ((StrOperator.equalsIgnoreCase("+")) && (Diff2DiffExpr.startsWith("-"))) {
                            x = Diff1DiffExpr + Diff2DiffExpr;
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseSumRule:SumRule:SubtractionRule:Rule2:", Rule, LowLevelRules, false, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        } else if ((StrOperator.equalsIgnoreCase("-")) && (Diff2DiffExpr.startsWith("-"))) {
                            if (Diff2DiffExpr.length() > 1) {
                                final String TempData = Diff2DiffExpr.substring(1);
                                //Mapped Sign
                                x = Diff1DiffExpr + "+" + TempData;
                                ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseSumRule:SumRule:SubtractionRule:Rule3:", Rule, LowLevelRules, false, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                            }
                        } else {
                            x = Diff1DiffExpr + StrOperator + Diff2DiffExpr;
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseSumRule:SumRule:SubtractionRule:Rule4:", Rule, LowLevelRules, false, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        }
                    } else if ((!Term1.equalsIgnoreCase("")) && (!Term2.equalsIgnoreCase("")) && (!Diff2DiffExpr.equalsIgnoreCase("0.0"))) {
                        log.info("Diff:String:parseSumRule:Got Term Expr:Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr);
                        x = Term1 + StrOperator + Term2;
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseSumRule:SumRule:SubtractionRule:Rule5:", Rule, LowLevelRules, false, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                    } else if (((Term2 == null) || (Term2.equalsIgnoreCase(""))) || (Diff2DiffExpr.equalsIgnoreCase("0.0"))) {
                        log.info("Diff:String:parseSumRule:Got a Constant:Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr);
                        x = Term1 + StrOperator + Diff2DiffExpr;
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseSumRule:SumRule:SubtractionRule:Rule6:", Rule, LowLevelRules, false, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                    } else {
                        log.info("Diff:String:parseSumRule:Else:Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1.DiffExpr=" + Diff1DiffExpr);
                        x = Diff1DiffExpr;
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseSumRule:SumRule:SubtractionRule:Rule7:", Rule, LowLevelRules, false, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                    }

                }
                log.info("Diff:String:parseCoeffExponentRule:Final:x=" + x);
                return x;
            }

            String parseProductRule() {
                String x = "";
                final String Diff1DiffExpr = Diff1.DiffExpr();
                final String Diff2DiffExpr = Diff2.DiffExpr();
                if (Rule.equalsIgnoreCase("ProductRule")) {
                    if (!Term3.equalsIgnoreCase("")) {
                        x = Diff1DiffExpr + "*" + Term3 + "+" + Term1 + "*" + "(" + Diff2DiffExpr + ")";
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseProductRule:ProductRule:Rule1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        log.info("Diff:String:parseProductRule:ProductRule:Rule1:x=" + x);
                    } else if (Diff1DiffExpr.equalsIgnoreCase(DiffWithRespTo)) {
                        //Differentiation of x term:
                        x = Diff2DiffExpr;
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseProductRule:ProductRule:Rule2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        log.info("Diff:String:parseProductRule:ProductRule:Rule2:x=" + x);
                    } else if (Diff2DiffExpr.equalsIgnoreCase(DiffWithRespTo)) {
                        //Differentiation of x term:
                        x = Diff1DiffExpr;
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseProductRule:ProductRule:Rule3:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        log.info("Diff:String:parseProductRule:ProductRule:Rule3:x=" + x);
                    } else if ((Term1.equalsIgnoreCase(Term2)) && (Term1.equalsIgnoreCase(Diff2DiffExpr)) && (!Diff2DiffExpr.contains(DiffWithRespTo)) && (!IsAConstant(Term1, DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                        //Differentiation of IndConstant Expression term:
                        if ((!IsAConstant(Diff2DiffExpr, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant"))) {
                            x = Diff1DiffExpr + "*" + Diff2DiffExpr;
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseProductRule:ProductRule:Rule4.1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        } else if ((!IsAConstant(Diff2DiffExpr, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstantExpression"))) {
                            //x = Diff1DiffExpr;
                            x = "1.0" + (char) TermOperator + Term1;
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseProductRule:ProductRule:Rule4.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        } else {
                            x = Diff1DiffExpr;
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseProductRule:ProductRule:Rule5:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        }
                        log.info("Diff:String:parseProductRule:ProductRule:Rule4-5:x=" + x);
                    } else if ((Term1.equalsIgnoreCase(Term2)) && (Term1.equalsIgnoreCase(Diff2DiffExpr)) && (!Diff2DiffExpr.contains(DiffWithRespTo)) && (IsAConstant(Term1, DiffWithRespTo)) && (Diff1DiffExpr.contains(Term1)) && (Diff1DiffExpr.contains(DiffWithRespTo))) {
                        //Drop Trailing Constant(Duplicate) in Differentiation of IndConstant Expression term:
                        x = Diff1DiffExpr;
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseProductRule:ProductRule:Rule6:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        log.info("Diff:String:parseProductRule:ProductRule:Rule6:x=" + x);
                    } else if ((!Diff1DiffExpr.equalsIgnoreCase("")) && ((!Diff1DiffExpr.equalsIgnoreCase("1.0")))) {
                        if ((Diff1DiffExpr.contains("*")) && (Diff1DiffExpr.contains("/")) && (!Diff2DiffExpr.equalsIgnoreCase("0.0")) && (Term1.equalsIgnoreCase(Term2)) && (Term1.equalsIgnoreCase(Diff2DiffExpr)) && (IsAConstant(Diff2DiffExpr, DiffWithRespTo)) && (Term1.equalsIgnoreCase(Diff2DiffExpr)) && (IsAConstant(Term1, DiffWithRespTo))) {
                            //x = Diff1DiffExpr + "*" + Term1;
                            //Term1 NOT incorporated in Diff1DiffExpr
                            x = Diff1DiffExpr + (char) TermOperator + Term1;
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseProductRule:ProductRule:Rule7.1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                            log.info("Diff:String:parseProductRule:ProductRule:Rule7.1:x=" + x);
                        } else if ((!Diff2DiffExpr.equalsIgnoreCase("0.0")) && (Term1.equalsIgnoreCase(Term2)) && (Term1.equalsIgnoreCase(Diff2DiffExpr)) && (IsAConstant(Diff2DiffExpr, DiffWithRespTo)) && (Term1.equalsIgnoreCase(Diff2DiffExpr)) && (IsAConstant(Term1, DiffWithRespTo))) {
                            x = Diff1DiffExpr + (char) TermOperator + Term1;
                            //Term1 already incorporated in Diff1DiffExpr
                            //x = Diff1DiffExpr ;
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseProductRule:ProductRule:Rule7.1.1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                            log.info("Diff:String:parseProductRule:ProductRule:Rule7.1:x=" + x);
                        } else if ((!Diff2DiffExpr.equalsIgnoreCase("0.0")) && (Term1.equalsIgnoreCase(Term2)) && (Term1.equalsIgnoreCase(Diff2DiffExpr)) && (IsAConstant(Term1, DiffWithRespTo))) {
                            //x = Diff1DiffExpr + "*" + Term1;
                            //Term1 already incorporated in Diff1DiffExpr
                            x = Diff1DiffExpr;
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseProductRule:ProductRule:Rule7.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                            log.info("Diff:String:parseProductRule:ProductRule:Rule7.1:x=" + x);
                        } else if (!Diff2DiffExpr.equalsIgnoreCase("0.0")) {
                            if ((!Diff1DiffExpr.contains(DiffWithRespTo)) && (Diff2DiffExpr.isBlank())) {
                                x = "0.0";
                                ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseProductRule:ProductRule:Rule7.2.1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                                log.info("Diff:String:parseProductRule:ProductRule:Rule7.2:x=" + x);
                            } else if (Diff1DiffExpr.contains("(")) {
                                x = Diff1DiffExpr + "*" + Diff2DiffExpr;
                                ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseProductRule:ProductRule:Rule7.2.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                                log.info("Diff:String:parseProductRule:ProductRule:Rule7.2:x=" + x);
                            } else {
                                x = Diff1DiffExpr + "*" + Diff2DiffExpr;
                                ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseProductRule:ProductRule:Rule7.2.3:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                                log.info("Diff:String:parseProductRule:ProductRule:Rule7.3:x=" + x);
                            }
                        } else if ((!IsAConstant(Term1, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant")) && (Diff2DiffExpr.equalsIgnoreCase("0.0"))) {
                            x = Term1 + "*" + Diff2DiffExpr;
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseProductRule:ProductRule:Rule7.4:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                            log.info("Diff:parseProductRule:ProductRule:Rule7.4:x=" + x);
                        } else {
                            MathsContxtLAv.ProLambdaExtr y = MathsContxtLAv.parseExpr(AlgoName, Diff1.DiffExpr(), Diff2.DiffExpr(), "ProductRule", DiffWithRespTo, '*', LowLevelRules);
                            x = y.StrExpr();
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseProductRule:ProductRule:Rule7.5:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                            log.info("Diff:String:parseProductRule:ProductRule:Rule7.5:x=" + x);
                        }
                    } else if (((Diff2DiffExpr.equalsIgnoreCase("")) || ((Diff2DiffExpr.equalsIgnoreCase("0.0"))))
                            && (!Term1.equalsIgnoreCase(Diff1DiffExpr))
                            && (IsAConstant(Diff2DiffExpr, DiffWithRespTo))
                            && (StrOperator.equalsIgnoreCase("*"))) {
                        x = "0.0";
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseProductRule:ProductRule:Rule8:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        log.info("Diff:String:parseProductRule:ProductRule:Rule8:x=" + x);
                    } else if (((Diff1DiffExpr.equalsIgnoreCase("")) || ((Diff1DiffExpr.equalsIgnoreCase("1.0"))))
                            && (!Term1.equalsIgnoreCase(Diff1DiffExpr))
                            && (IsAConstant(Diff2DiffExpr, DiffWithRespTo))
                            && (StrOperator.equalsIgnoreCase("*")) && (DiffTermOperator == '/')) {
                        if (!Diff2DiffExpr.equalsIgnoreCase("0.0")) {
                            x = "1.0/" + Diff2DiffExpr;
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseProductRule:ProductRule:Rule9:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        } else {
                            MathsContxtLAv.ProLambdaExtr y = MathsContxtLAv.parseExpr(AlgoName, Diff1.DiffExpr(), Diff2.DiffExpr(), "QuotientRule", DiffWithRespTo, DiffTermOperator, LowLevelRules);
                            x = y.StrExpr();
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseProductRule:ProductRule:Rule10:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        }
                        log.info("Diff:String:parseProductRule:ProductRule:Rule9-10:x=" + x);
                    } else if (Diff1DiffExpr.equalsIgnoreCase("")) {
                        x = "0.0" + "*" + Diff2DiffExpr;
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseProductRule:ProductRule:Rule11:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        log.info("Diff:parseProductRule:ProductRule:Rule11:x=" + x);
                    } else if (Diff1DiffExpr.equalsIgnoreCase("1.0")) {
                        x = Diff2DiffExpr;
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseProductRule:ProductRule:Rule12:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        log.info("Diff:String:parseProductRule:ProductRule:Rule12:x=" + x);
                    } else {
                        MathsContxtLAv.ProLambdaExtr y = MathsContxtLAv.parseExpr(AlgoName, Diff1.DiffExpr(), Diff2.DiffExpr(), "ProductRule", DiffWithRespTo, TermOperator, LowLevelRules);
                        x = y.StrExpr();
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseProductRule:ProductRule:Rule13:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        log.info("Diff:String:parseProductRule:ProductRule:Rule13:x=" + x);
                    }
                }
                log.info("Diff:String:parseProductRule:Final:x=" + x);
                return x;
            }

            String parseQuotientRule() {
                String x = "";
                final String Diff1DiffExpr = Diff1.DiffExpr();
                final String Diff2DiffExpr = Diff2.DiffExpr();
                if (Rule.equalsIgnoreCase("QuotientRule")) {
                    if (!Term3.equalsIgnoreCase("")) {
                        x = ("(" + Term2 + "*" + Diff1DiffExpr + "-" + Term1 + "*" + Diff2DiffExpr) + "/" + "(" + Term2 + "*" + Term2 + ")" + ")";
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseQuotientRule:QuotientRule:Rule1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        log.info("Diff:String:parseQuotientRule:QuotientRule:Rule1:x=" + x + " Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                    } else if ((!Term2.equalsIgnoreCase("")) && (Term2.equalsIgnoreCase(DiffWithRespTo)) && (Diff1DiffExpr.equalsIgnoreCase("1.0"))) {
                        x = 1.0 + "/" + DiffWithRespTo + "^2.0";
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseQuotientRule:QuotientRule:Rule2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        log.info("Diff:String:parseQuotientRule:QuotientRule:Rule2:x)=" + x + " Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                    } else if ((!Term1.equalsIgnoreCase("")) && (Diff1DiffExpr.equalsIgnoreCase("1.0"))) {
                        if (StrOperator.equalsIgnoreCase("*")) {
                            x = Term1;
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseQuotientRule:QuotientRule:Rule3.1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        } else if ((StrOperator.equalsIgnoreCase("/")) && (!Term2.equalsIgnoreCase(Term1))) {
                            x = "1.0" + StrOperator + Term1;
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseQuotientRule:QuotientRule:Rule3.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        } else if ((StrOperator.equalsIgnoreCase("/")) && (Term2.equalsIgnoreCase(Term1)) && (Diff2DiffExpr.equalsIgnoreCase(Term2)) && (!Term4.equalsIgnoreCase(""))) {
                            x = "1.0" + StrOperator + Term1;
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseQuotientRule:QuotientRule:Rule3.3:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        } else if ((StrOperator.equalsIgnoreCase("/")) && (!Term4.equalsIgnoreCase(""))) {
                            x = "1.0" + StrOperator + Term1;
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseQuotientRule:QuotientRule:Rule3.4:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        } else if ((StrOperator.equalsIgnoreCase("/"))) {
                            x = Term1;
                            ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseQuotientRule:QuotientRule:Rule3.5:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        }
                        log.info("Diff:String:parseQuotientRule:QuotientRule:Rule3:x=" + x + " Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                    } else if (Diff1DiffExpr.equalsIgnoreCase(DiffWithRespTo)) {
                        //Differentiation of x term:
                        x = Diff2DiffExpr;
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseQuotientRule:QuotientRule:Rule4:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        log.info("Diff:String:parseQuotientRule:QuotientRule:Rule4:x=" + x + " Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                    } else if (Diff2DiffExpr.equalsIgnoreCase(DiffWithRespTo)) {
                        //Differentiation of 1/x term:
                        x = Diff1DiffExpr + "/" + DiffWithRespTo + "^2.0";
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseQuotientRule:QuotientRule:Rule5:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        log.info("Diff:String:parseQuotientRule:QuotientRule:Rule5:x=" + x + " Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                    } else if ((!Diff1DiffExpr.equalsIgnoreCase("")) && (Term2.equalsIgnoreCase(Diff2DiffExpr))) {
                        if ((!Diff2DiffExpr.contains(DiffWithRespTo)) && (!Term1.contains((DiffWithRespTo)))) {
                            if (StrOperator.equalsIgnoreCase("/")) {
                                x = Diff1DiffExpr + "/" + Diff2DiffExpr;
                                ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseQuotientRule:QuotientRule:Rule6.1:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                            } else {
                                x = Diff1DiffExpr;
                                ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseQuotientRule:QuotientRule:Rule6.2:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                            }
                        } else if (!Diff2DiffExpr.equalsIgnoreCase("")) {
                            if (StrOperator.equalsIgnoreCase("/")) {
                                x = Diff1DiffExpr + "/" + Diff2DiffExpr;
                                ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseQuotientRule:QuotientRule:Rule6.3:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                            } else {
                                x = Diff1DiffExpr + "*" + Diff2DiffExpr;
                                ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseQuotientRule:QuotientRule:Rule6.4:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                            }
                        }
                        log.info("Diff:String:parseQuotientRule:QuotientRule:Rule6:x=" + x + " Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                    } else if ((!Diff1DiffExpr.equalsIgnoreCase(""))) {
                        x = Diff1DiffExpr + "/" + Diff2DiffExpr;
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseQuotientRule:QuotientRule:Rule7:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        log.info("Diff:String:parseQuotientRule:QuotientRule:Rule7:x=" + x + " Term2=" + Term2 + " Diff2DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                    } else if ((Diff1DiffExpr.equalsIgnoreCase(""))) {
                        x = Diff2DiffExpr;
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseQuotientRule:QuotientRule:Rule8:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        log.info("Diff:String:parseQuotientRule:QuotientRule:Rule8:x=" + x + " Term2=" + Term2 + " Diff2.DiffExpr=" + Diff2DiffExpr + " Diff1DiffExpr=" + Diff1DiffExpr);
                    } else {
                        MathsContxtLAv.ProLambdaExtr y = MathsContxtLAv.parseExpr(AlgoName, Diff1.DiffExpr(), Diff2.DiffExpr(), "QuotientRule", DiffWithRespTo, TermOperator, LowLevelRules);
                        x = y.StrExpr();
                        ReasoningLambdaDiffr z = parseReason(AlgoName, CompleteExprn, "Diff:Str:parseQuotientRule:QuotientRule:Rule9:", Rule, LowLevelRules, true, Term1, Diff1DiffExpr, Term2, Diff2DiffExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        log.info("Diff:String:parseQuotientRule:QuotientRule:Rule9:x=" + x);
                    }
                }
                log.info("Diff:String:parseQuotientRule:Final:x=" + x);
                return x;
            }
        }.parseDiffStr();
    }

    @FunctionalInterface
    public interface ReasoningLambdaIntegr {

        String apply();
    }

    public static ReasoningLambdaIntegr parseReasonIntegr(String AlgoName, String CompleteExpression, String ActualRuleUsed, String HighLevelRule, String LowLevelRules, boolean LogORSkip, String Term1, String Diff1DiffExpr, String Term2, String Diff2DiffExpr, String Term3, String Term4, String StrOperator, String DiffWithRespTo, String TermOperator, String CompleteIntegral) {
        return new Object() {
            ReasoningLambdaIntegr Apply() {
                ReasoningLambdaIntegr x = () -> "";
                ActualStrRuleUsed += ActualRuleUsed + ",";
                ActualLambdaRuleUsed += ActualRuleUsed + ",";
                StringBuilder explanation = new StringBuilder("Integr:Reasoning Steps: Expr=" + CompleteExpression + "\n");
                int i = 0;
                explanation.append("AlgoName=" + AlgoName + "\n");
                if (ActualRuleUsed.contains("Integr:Str:")) {
                    if (LogORSkip) {
                        ruleAnalytics.recordReasoning("" + TestCase, EqnUnderTest, ActualRuleUsed, HighLevelRule, "String");
                    } else {
                        if (LogORSkip) {
                            ruleAnalytics.recordReasoning("" + TestCase, EqnUnderTest, ActualRuleUsed, HighLevelRule, "Lambda");
                        }
                    }
                }
                explanation.append("ActualRuleUsed=" + ActualRuleUsed + "\n");
                explanation.append("HighLevelRule=" + HighLevelRule + "\n");
                explanation.append("LowLevelRules=" + LowLevelRules + "\n");

                explanation.append("Term" + 1 + ":Term1").append(":=").append(Term1).append("\n");
                explanation.append("Term" + 2 + ":Diff1DiffExpr").append(":=").append(Diff1DiffExpr).append("\n");
                explanation.append("Term" + 3 + ":Term2").append(":=").append(Term2).append("\n");
                explanation.append("Term" + 4 + ":Diff2DiffExpr").append(":=").append(Diff2DiffExpr).append("\n");
                explanation.append("Term" + 5 + ":Term3").append(":=").append(Term3).append("\n");
                explanation.append("Term" + 6 + ":Term4").append(":=").append(Term4).append("\n");
                explanation.append("Term" + 7 + ":StrOperator").append(":=").append(StrOperator).append("\n");
                explanation.append("Term" + 8 + ":DiffWithRespTo").append(":=").append(DiffWithRespTo).append("\n");
                explanation.append("Term" + 9 + ":TermOperator").append(":=").append(TermOperator).append("\n");
                explanation.append("Term" + 10 + ":CompleteIntegral").append(":=").append(CompleteIntegral).append("\n");

                x = () -> (explanation.toString());
                if (DevelopmentReasoningLambdaFlagSep) {
                    System.out.println(x.apply());
                }
                return x;
            }
        }.Apply();
    }

    public static IntegrExpr ApplyLambdaRulesIntegr(String AlgoName, String CompleteExprn, String Term1, IntegrExpr Diff1, String Term2, IntegrExpr Diff2, String Term3, String Term4, String StrOperator, String Rule, String DiffWithRespTo, int TermOperator, String LowLevelRules, String MapType, String IntegrORDiffr) {
        log.info("Integr:ApplyLambdaRules:Initial :AlgoName(Calling Function)=" + AlgoName);
        log.info("Integr:ApplyLambdaRules:Initial :Term1=" + Term1);
        log.info("Integr:ApplyLambdaRules:Initial :Diff1.IntegrExpr()=" + Diff1.IntegrExpr());
        log.info("Integr:ApplyLambdaRules:Initial :Term2=" + Term2);
        log.info("Integr:ApplyLambdaRules:Initial :Diff2.IntegrExpr()=" + Diff2.IntegrExpr());
        log.info("Integr:ApplyLambdaRules:Initial :Term3=" + Term3);
        log.info("Integr:ApplyLambdaRules:Initial :Term4=" + Term4);
        log.info("Integr:ApplyLambdaRules:Initial :StrOperator=" + StrOperator);
        log.info("Integr:ApplyLambdaRules:Initial :Rule=" + Rule);
        log.info("Integr:ApplyLambdaRules:Initial :LowLevelRules=" + LowLevelRules);
        log.info("Integr:ApplyLambdaRules:Initial :SavedOperator=" + (char) SavedOperator);
        log.info("Integr:ApplyLambdaRules:Initial :TermOperator=" + (char) TermOperator);
        log.info("Integr:ApplyLambdaRules:Initial :DiffTermOperator=" + (char) DiffTermOperator);
        log.info("Integr:ApplyLambdaRules:Initial :");
        log.info("Integr:ApplyLambdaRules:Initial :");
        log.info("Integr:ApplyLambdaRules:Initial :");
        if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
            System.out.println("Integr:ApplyLambdaRulesIntegr:Initial:AlgoName=" + AlgoName + " Rule=" + Rule + " LowLevelRules=" + LowLevelRules + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
        }
        IntegrExpr x = (() -> "");
        IntegrLambda y = (() -> "");
        boolean loadposDecrFlag = false;
        String[] MyTemp = new String[2];
        if (Diff2.IntegrExpr().contains("@Parenthesis@")) {
            MyTemp = Diff2.IntegrExpr().split("@Parenthesis@");
            if (MyTemp.length > 1) {
                Term2 = MyTemp[1];
            }
        }
        y = parseIntegrExpr(AlgoName, CompleteExprn, Term1, Diff1, Term2, Diff2, Term3, Term4, StrOperator, Rule, DiffWithRespTo, TermOperator, LowLevelRules, MapType, IntegrORDiffr);
        final String MyString = y.Expr();
        x = (() -> "" + MyString);
        if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
            System.out.println("Integr:ApplyLambdaRulesIntegr:Final:AlgoName=" + AlgoName + " Rule=" + Rule + " LowLevelRules=" + LowLevelRules + " x.IntegrExpr()=" + x.IntegrExpr() + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
        }
        return x;
    }

    @FunctionalInterface
    public interface IntegrLambda {

        String Expr();
    }

    public static IntegrLambda parseIntegrExpr(String AlgoName, String CompleteExprn, String Term1, IntegrExpr Diff1, String Term2, IntegrExpr Diff2, String Term3, String Term4, String StrOperator, String Rule, String DiffWithRespTo, int TermOperator, String LowLevelRules, String MapType, String IntegrORDiffr) {
        return new Object() {

            IntegrLambda parseIntegr() {
                IntegrLambda x = (() -> "");
                final String Diff1IntegrExpr = Diff1.IntegrExpr();
                final String Diff2IntegrExpr = Diff2.IntegrExpr();
                int Supported = 1;
                if ((Diff1IntegrExpr.contains(DiffWithRespTo)) && (Diff2IntegrExpr.contains(DiffWithRespTo)) && (Rule.equalsIgnoreCase("MappedQuotientRule")) && (StrOperator.equalsIgnoreCase("/"))) {
                    Supported = 0;
                }
                if (Rule.equalsIgnoreCase("NoExponentRuleTerm")) {
                    x = parseNoExponentRuleTerm();
                    log.info("Integr:parseIntegr:NoExponentRuleTerm:x.Expr()=" + x.Expr());
                } else if (Rule.equalsIgnoreCase("NoExponentRuleDiff")) {
                    x = parseNoExponentRuleDiff();
                    log.info("Integr:parseIntegr:NoExponentRuleDiff:x.Expr()=" + x.Expr());
                } else if (Rule.equalsIgnoreCase("CoeffExponentRule")) {
                    x = parseCoeffExponentRule();
                    log.info("Integr:parseIntegr:CoeffExponentRule:x.Expr()=" + x.Expr());
                } else if (Rule.equalsIgnoreCase("ConstantRule")) {
                    x = parseConstantRule();
                    log.info("Integr:parseIntegr:ConstantRule:x.Expr()=" + x.Expr());
                } else if ((Rule.equalsIgnoreCase("SumRule"))
                        || (Rule.equalsIgnoreCase("SubtractionRule"))) {
                    x = parseSumRule();
                    log.info("Integr:parseIntegr:SumRule OR SubtractionRule:x.Expr()=" + x.Expr());
                } else if (Rule.equalsIgnoreCase("ExponentRule")) {

                    log.info("Integr:parseIntegr:ExponentRule:x.Expr()=" + x.Expr());
                } else if (Rule.equalsIgnoreCase("IntegrationByParts")) {
                    if (Supported == 1) {
                        // Integral u*Diffv= uv - Integral vDiff u
                        // Integral Ux*DiffV= Ux*IntegralDiffVx - Integral IntegralDiffVx*DiffUx
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseIntegr:IntegrationByParts:Rule1:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        System.out.println(ConsoleColors.GREEN + "Integr:ApplyFuncRules:IntegrationByParts:Diff1IntegrExpr=" + Diff1IntegrExpr + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.GREEN + "Integr:ApplyFuncRules:IntegrationByParts:Original 1st Function=" + Term4 + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.GREEN + "Integr:ApplyFuncRules:IntegrationByParts:Diff2IntegrExpr=" + Diff2IntegrExpr + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.GREEN + "Integr:ApplyFuncRules:IntegrationByParts:Original 2nd Function=" + Term3 + ConsoleColors.RESET);

                        if (StrOperator.equalsIgnoreCase("*")) {
                            String Ux = "";
                            String DiffUx = "";
                            String DiffUxSecndOrder = "";
                            String DiffVx = "";
                            String Vx = "";
                            //Choose Ux 
                            Ux = LIATEUx(Term4, Term3, DiffWithRespTo);
                            System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET:After LIATE: Ux=" + Ux + ConsoleColors.RESET);
                            String LocalDiff1IntegrExpr = LIATEDiff1IntegrExprUx(Term4, Term3, Diff1IntegrExpr, Diff2IntegrExpr, DiffWithRespTo);
                            DiffUx = DiffUxDifferentiation(Ux, DiffWithRespTo, MapType, IntegrORDiffr);
                            String LocalDiff2IntegrExpr = LIATEDiff2IntegrExprVx(Term4, Term3, Diff1IntegrExpr, Diff2IntegrExpr, DiffWithRespTo);
                            // Choose Vx
                            DiffVx = LIATEVx(Term4, Term3, DiffWithRespTo);
                            System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET:After LIATE: DiffVx=" + DiffVx + ConsoleColors.RESET);
                            Vx = IntegralDiffVxIntegration(DiffVx, DiffUx, DiffWithRespTo, MapType, IntegrORDiffr, LocalDiff1IntegrExpr, Term4, LocalDiff2IntegrExpr, Term3);
                            System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET: Vx=" + Vx + ConsoleColors.RESET);
                            System.out.println("Integr:ApplyFunc:IntegrationByParts:Ux=" + Ux);
                            System.out.println("Integr:ApplyFunc:IntegrationByParts:DiffUx=" + DiffUx);
                            System.out.println("Integr:ApplyFunc:IntegrationByParts:Vx=" + Vx);
                            System.out.println("Integr:ApplyFunc:IntegrationByParts:DiffVx=" + DiffVx);
                            final String Ux1 = Ux;
                            final String DiffUx1 = DiffUx;
                            final String Vx1 = DiffVx;
                            final String IntegralDiffVx1 = Vx;
                            if ((IntegralDiffVx1.isEmpty()) && (!Vx1.isEmpty())) {
                                System.out.println(ConsoleColors.RED + "Integr:ApplyFunc:IntegrationByParts:FORMULA WRONG:Vx" + ConsoleColors.RESET);
                            } else if ((Ux.isEmpty()) && (!DiffUx1.isEmpty())) {
                                System.out.println(ConsoleColors.RED + "Integr:ApplyFunc:IntegrationByParts:FORMULA WRONG:Ux" + ConsoleColors.RESET);
                            }
                            String MyTerm2Str = "";
                            if ((!Ux.equalsIgnoreCase(DiffWithRespTo)) && (Ux.contains(DiffWithRespTo))) {
                                MyTerm2Str = IntegrationFormula(IntegralDiffVx1, DiffUx1, DiffUxSecndOrder, Vx1, DiffWithRespTo, MapType, IntegrORDiffr, LocalDiff1IntegrExpr, Term4, LocalDiff2IntegrExpr, Term3);
                            } else {
                                MyTerm2Str = IntegrationFormula(IntegralDiffVx1, DiffUx1, DiffUxSecndOrder, Vx1, DiffWithRespTo, MapType, IntegrORDiffr, LocalDiff1IntegrExpr, Term4, LocalDiff2IntegrExpr, Term3);
                            }
                            final String FinMyTerm2Str = MyTerm2Str;
                            final String FinVx = LocalDiff2IntegrExpr;
                            // Integral u*Diffv= uv - Integral vDiffu
                            // Integral Ux*DiffV= Ux*Vx - Integral Vx*DiffUx

                            if ((Ux.equalsIgnoreCase(DiffWithRespTo)) && (!DiffUx1.contains(DiffWithRespTo))) {
                                if (IntegralDiffVx1.startsWith("-")) {
                                    final String TempIntegralDiffVx1 = IntegralDiffVx1.replaceFirst("\\-", "");
                                    x = (() -> Ux1 + "*" + FinVx + "+" + TempIntegralDiffVx1);
                                } else {
                                    x = (() -> Ux1 + "*" + FinVx + "-" + IntegralDiffVx1);
                                }
                            } else {
                                x = (() -> Ux1 + "*" + FinVx + "-" + FinMyTerm2Str);
                            }
                            //final String FormulaStr = FormulaSimplify(x, DiffWithRespTo, MapType, IntegrORDiffr);
                            //x = (() -> FormulaStr);
                            System.out.println(ConsoleColors.BLUE + "Integr:ApplyFunc:IntegrationByParts:Ux=" + Ux + ConsoleColors.RESET);
                            System.out.println(ConsoleColors.BLUE + "Integr:ApplyFunc:IntegrationByParts:DiffUx=" + DiffUx + ConsoleColors.RESET);
                            System.out.println(ConsoleColors.BLUE + "Integr:ApplyFunc:IntegrationByParts:Vx=" + Vx + ConsoleColors.RESET);
                            System.out.println(ConsoleColors.BLUE + "Integr:ApplyFunc:IntegrationByParts:DiffVx=" + DiffVx + ConsoleColors.RESET);
                            System.out.println(ConsoleColors.BLUE + "Integr:ApplyFunc:IntegrationByParts:MyTerm2Str=" + MyTerm2Str + ConsoleColors.RESET);
                            System.out.println(ConsoleColors.BLUE + "Integr:ApplyFunc:IntegrationByParts:Final Integration:x.Expr()=" + x.Expr() + ConsoleColors.RESET);
                        }
                    } else {
                        log.info("Integr:ApplyFuncRules:IntegrationByParts:Maths OR This Software does not support :(" + Diff1.IntegrExpr() + ") * (" + Diff2.IntegrExpr() + ")");
                    }
                    log.info("Integr:parseIntegr:IntegrationByParts:x.Expr()=" + x.Expr());
                } else if (Rule.equalsIgnoreCase("IntegrationByPartsBothContainX")) {
                    if (Supported == 1) {
                        if (((Term4.contains(DiffWithRespTo + "^")) && (!Term4.contains("*")) && (!Term4.contains("/")))
                                && ((Term2.contains(DiffWithRespTo + "^")) && (!Term2.contains("*")) && (!Term2.contains("/")))) {
                            IntegrExpr MyTemp2 = (() -> "");
                            if (!AutoGenSilentFlag) {
                                System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET: Recursivecall:Start:Integre:IntegrationByPartsBothContainX" + ConsoleColors.RESET);
                            }
                            Map<String, String> variablesBackupState = new HashMap();
                            depthBackUpRestore++;
                            StrKeyBackUpRestore = FileSepBackUpRestore + "Integr:ApplyFuncRules:IntegrationByPartsBothContainX:";
                            BackupDiffIntegrStateAll(variablesBackupState);
                            MathsContxtLAv.ChaosPrevention();

                            //MathsContxtLAv.SimpleExpression MyTemp = MathsContxtLAv.parseSimple(Term4 + "*" + Term2, variables, DiffWithRespTo);
                            //MyTemp2 = DiffrIntegrSep.parseIntegr(MyTemp.SimpleExpr(), variables, DiffWithRespTo);
                            //ExprSimpleStrSep.SimpleStr MyTempTerm1 = (() -> "");
                            Map<String, String> variablesStr = new HashMap<>();
                            //MyTempTerm1 = parseSimple(Term4 + "*" + Term2, variablesStr, DiffWithRespTo, "Silent", ExprSimpleStrSep.LogLevel.Info);
                            //MyTemp2 = DiffrIntegrSep.parseIntegr(MyTempTerm1.evalStr(), variables, DiffWithRespTo,MapType, IntegrORDiffr);

                            RestoreDiffIntegrStateAll(variablesBackupState);
                            depthBackUpRestore--;
                            StrKeyBackUpRestore = FileSepBackUpRestore;
                            log.info("Integr:ApplyFuncRules:IntegrationByPartsBothContainX:MyTemp2.IntegrExpr()=" + MyTemp2.IntegrExpr() + " Diff2IntegrExpr=" + Diff2IntegrExpr + " Diff1IntegrExpr=" + Diff1IntegrExpr);
                            final String MyTemp2Str = MyTemp2.IntegrExpr();
                            x = (() -> MyTemp2Str);
                            if (!AutoGenSilentFlag) {
                                System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET: Recursivecall:Start:Diff:IntegrationByPartsBothContainX" + ConsoleColors.RESET);
                            }
                            log.info("Integr:ApplyFuncRules:IntegrationByPartsBothContainX:x.Expr()=" + x.Expr());
                            log.info("Integr:ApplyFuncRules:IntegrationByPartsBothContainX:Term4=" + Term4);
                            log.info("Integr:ApplyFuncRules:IntegrationByPartsBothContainX:Term2=" + Term2);
                            //log.info("Integr:ApplyFuncRules:IntegrationByPartsBothContainX:MyTemp.SimpleExpr()=" + MyTempTerm1.evalStr());
                        } else {
                            log.info("Integr:ApplyFuncRules:IntegrationByPartsBothContainX:Maths OR This Software does not support :" + Term4 + " * " + Term2);
                        }
                    } else {
                        log.info("Integr:ApplyFuncRules:IntegrationByPartsBothContainX:Maths OR This Software does not support :" + Diff1.IntegrExpr() + " * " + Diff2.IntegrExpr());
                    }
                } else if (Rule.equalsIgnoreCase("ProductRule")) {
                    x = parseProductRule();
                    log.info("Integr:parseIntegr:ProductRule:x.Expr()=" + x.Expr());
                } else if (Rule.equalsIgnoreCase("MappedQuotientRule")) {
                    if (Supported == 1) {
                        if ((!Diff1IntegrExpr.equalsIgnoreCase(Diff2IntegrExpr)) && (StrOperator.equalsIgnoreCase("/"))) {
                            String Ux = "";
                            String UDashx = "";
                            String Vx = "";
                            String VDashx = "";
                            // Set Ux Parameters
                            if (Diff1IntegrExpr.contains("Parenthesis")) {
                                Expr_Func_Split_Integr(Diff1IntegrExpr, DiffWithRespTo);
                                Ux = ParanExpr;
                                UDashx = ParanDiffExpr;

                            } else if (!Diff1IntegrExpr.contains("Parenthesis")) {
                                Ux = Term1;
                                UDashx = Diff2IntegrExpr;
                            }
                            // Set Vx Parameters
                            if (Diff2IntegrExpr.contains("Parenthesis")) {
                                Expr_Func_Split_Integr(Diff2IntegrExpr, DiffWithRespTo);
                                Vx = ParanExpr;
                                VDashx = ParanDiffExpr;

                            } else if (!Diff2IntegrExpr.contains("Parenthesis")) {
                                Vx = Term2;
                                VDashx = Diff2IntegrExpr;
                            }
                            final String Vx1 = Vx;
                            final String UDashx1 = UDashx;
                            final String VDashx1 = VDashx;
                            final String Ux1 = Ux;
                            x = (() -> "(" + Vx1 + "*" + UDashx1 + "-" + VDashx1 + "*" + Ux1 + ")" + "/" + Vx1 + "/" + Vx1);
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseIntegr:MappedQuotientRule:Only Rule:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        }
                    } else {
                        log.info("Integr:ApplyFuncRules:MappedQuotientRule:Maths OR This Software does not support :(" + Diff1IntegrExpr + ") / (" + Diff2IntegrExpr + ")");
                    }
                } else if (Rule.equalsIgnoreCase("QuotientRule")) {
                    x = parseQuotientRule();
                    log.info("Integr:parseIntegr:QuotientRule:x.Expr()=" + x.Expr());
                }
                log.info("Integr:parseIntegr:Final:x.Expr()=" + x.Expr());
                return x;
            }

            IntegrLambda parseNoExponentRuleTerm() {
                IntegrLambda x = (() -> "");
                final String Diff1IntegrExpr = Diff1.IntegrExpr();
                final String Diff2IntegrExpr = Diff2.IntegrExpr();
                if (Rule.equalsIgnoreCase("NoExponentRuleTerm")) {
                    x = (() -> Term1);
                }
                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseNoExponentRuleTerm::NoExponentRuleTerm:Only Rule:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                log.info("Integr:parseNoExponentRuleTerm:Final:x.Expr()=" + x.Expr());
                return x;
            }

            IntegrLambda parseNoExponentRuleDiff() {
                IntegrLambda x = (() -> "");
                final String Diff1IntegrExpr = Diff1.IntegrExpr();
                final String Diff2IntegrExpr = Diff2.IntegrExpr();
                if (Rule.equalsIgnoreCase("NoExponentRuleDiff")) {
                    if (Term1.equalsIgnoreCase("")) {
                        x = (() -> Diff1IntegrExpr);
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseNoExponentRuleDiff:NoExponentRuleDiff:Rule1:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Integr:ApplyFuncRules:NoExponentRuleDiff:Rule1 :x.IntegrExpr()=" + x.Expr());
                    } else if ((Term1.contains(DiffWithRespTo)) && (Term1.contains("ln"))) {
                        x = (() -> Term1);
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseNoExponentRuleDiff:NoExponentRuleDiff:Rule2:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Integr:ApplyFuncRules:NoExponentRuleDiff:Rule2 :x.IntegrExpr()=" + x.Expr());
                    } else if ((Term1.contains(DiffWithRespTo)) && (!Term1.contains("^")) && (DiffTermOperator == '*')) {
                        x = (() -> "1.0/2.0" + StrOperator + Term1 + "^2.0");
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseNoExponentRuleDiff:NoExponentRuleDiff:Rule3:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Integr:ApplyFuncRules:NoExponentRuleDiff:Rule3 :x.IntegrExpr()=" + x.Expr());
                    } else if ((Term1.contains(DiffWithRespTo)) && (!Term1.contains("^")) && (DiffTermOperator == '/')) {
                        x = (() -> "ln(" + Term1 + ")");
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseNoExponentRuleDiff:NoExponentRuleDiff:Rule4:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Integr:ApplyFuncRules:NoExponentRuleDiff:Rule4 :x.IntegrExpr()=" + x.Expr());
                    } else if ((StrOperator.equalsIgnoreCase("/")) && (DiffTermOperator == '/')) {
                        x = (() -> Term1);
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseNoExponentRuleDiff:NoExponentRuleDiff:Rule5:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Integr:ApplyFuncRules:NoExponentRuleDiff:Rule5 :x=" + x);
                    } else if (Term1.contains("@Parenthesis@")) {
                        x = (() -> Term2);
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseNoExponentRuleDiff:NoExponentRuleDiff:Rule6:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Integr:ApplyFuncRules:NoExponentRuleDiff:Rule6 :x.IntegrExpr()=" + x.Expr());
                    } else if ((Term4.contains("^")) && (!Term1.contains("^"))) {
                        x = (() -> Term4);
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseNoExponentRuleDiff:NoExponentRuleDiff:Rule7:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Integr:ApplyFuncRules:NoExponentRuleDiff:Rule6 :x.IntegrExpr()=" + x.Expr());
                    } else {
                        x = (() -> Term1);
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseNoExponentRuleDiff:NoExponentRuleDiff:Rule8:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Integr:ApplyFuncRules:NoExponentRuleDiff:Rule6 :x.IntegrExpr()=" + x.Expr());
                    }
                }
                log.info("Integr:parseNoExponentRuleDiff:Final:x.Expr()=" + x.Expr());
                return x;
            }

            IntegrLambda parseCoeffExponentRule() {
                IntegrLambda x = (() -> "");
                final String Diff1IntegrExpr = Diff1.IntegrExpr();
                final String Diff2IntegrExpr = Diff2.IntegrExpr();
                if (Rule.equalsIgnoreCase("CoeffExponentRule")) {
                    if (!Term4.equalsIgnoreCase("")) {
                        x = (() -> Term4 + StrOperator + Term3 + "^" + Term2);
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseCoeffExponentRule:CoeffExponentRule:Rule1:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                    } else if ((!Term3.equalsIgnoreCase("")) && (!Term3.equalsIgnoreCase("1.0"))) {
                        x = (() -> Term3 + "^" + Term2);
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseCoeffExponentRule:CoeffExponentRule:Rule2:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                    } else {
                        x = (() -> Term1);
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseCoeffExponentRule:CoeffExponentRule:Rule3:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                    }
                }
                log.info("Integr:parseCoeffExponentRule:Final:x.Expr()=" + x.Expr());
                return x;
            }

            IntegrLambda parseConstantRule() {
                IntegrLambda x = (() -> "");
                final String Diff1IntegrExpr = Diff1.IntegrExpr();
                final String Diff2IntegrExpr = Diff2.IntegrExpr();
                if (Rule.equalsIgnoreCase("ConstantRule")) {
                    if (((Term1 != null) && (!Term1.equalsIgnoreCase("")))
                            && ((Term2 != null) && (!Term2.equalsIgnoreCase("")))
                            && (Term1.equalsIgnoreCase(Term2))
                            && (Diff1IntegrExpr.equalsIgnoreCase(Diff2IntegrExpr))
                            && (Term1.equalsIgnoreCase(Diff1IntegrExpr))
                            && (Term1.equalsIgnoreCase(DiffWithRespTo)) && (!IsAConstant(Term1, DiffWithRespTo))) {
                        x = (() -> "1.0");
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Rule1:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule1 :x.Expr()=" + x.Expr());
                    } else if (((Term1 != null) && (!Term1.equalsIgnoreCase(""))) && (!IsAConstant(Term1, DiffWithRespTo))) {
                        if (Term3.equalsIgnoreCase("")) {
                            log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule2.1 :SavedOperator=" + (char) SavedOperator);
                            if (((SavedOperator == '*') || (SavedOperator == 0) || (SavedOperator == -1)) && (!StrOperator.equalsIgnoreCase("\\+")) && (!StrOperator.equalsIgnoreCase("-"))) {
                                if ((SavedOperator == '*')) {
                                    x = (() -> Term1 + (char) SavedOperator + Term2);
                                    ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Rule2.1.1 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                    log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule2.1.1 :x.Expr()=" + x.Expr());
                                } else if (((SavedOperator == 0) || (SavedOperator == -1)) && (Term1.equalsIgnoreCase(DiffWithRespTo))) {
                                    if ((StrOperator.equalsIgnoreCase("*")) && (IsAConstant(Term2, DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("Number")) || (StrIsAConstant.equalsIgnoreCase("NumberExpression"))) && (Diff1IntegrExpr.equalsIgnoreCase(Term2))) {
                                        x = (() -> Term2 + "/2.0" + "*" + Term1 + "^2.0");
                                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Rule2.1.2.1.2 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                    } else if ((StrOperator.equalsIgnoreCase("*")) && (IsAConstant(Term2, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                                        x = (() -> Term2 + "*" + DiffWithRespTo);
                                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Rule2.1.2.1.3 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                    } else {
                                        if (Term2.equalsIgnoreCase("1.0")) {
                                            x = (() -> "ln(" + Term1 + ")");
                                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Rule2.1.2.4 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                        } else if ((Term1.equalsIgnoreCase(DiffWithRespTo)) && (StrOperator.equalsIgnoreCase("*"))) {
                                            x = (() -> Diff1IntegrExpr + "/2.0" + StrOperator + Term1 + "^2.0");
                                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Rule2.1.2.5 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                        } else {
                                            x = (() -> Term2 + "*" + "ln(" + Term1 + ")");
                                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Rule2.1.2.6 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                        }
                                    }
                                    log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule2.1.2 :x.Expr()=" + x.Expr());
                                } else {
                                    if (Term1.startsWith("1.0")) {
                                        final String Temp = Term1.replaceFirst("1.0", "");
                                        x = (() -> Term2 + Temp);
                                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Rule2.1.3.1 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                        log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule2.1.3.1 :x.Expr()=" + x.Expr());
                                    } else if (((SavedOperator == 0) || (SavedOperator == -1)) && (!Term1.equalsIgnoreCase(Diff2IntegrExpr))) {
                                        x = (() -> Diff1IntegrExpr);
                                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Rule2.1.3.2 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                        log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule2.1.3.2 :x.Expr()=" + x.Expr());
                                    } else if (((SavedOperator == 0) || (SavedOperator == -1))
                                            && (Term1.equalsIgnoreCase(Diff2IntegrExpr))
                                            && (!IsAConstant(Term1, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("VarExpression"))) {
                                        if (Term1.startsWith("/")) {
                                            x = (() -> Term2 + Term1);
                                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Rule2.1.3.3.1 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                            log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule2.1.3.3.1 :x.Expr()=" + x.Expr());
                                        } else if (StrOperator.equalsIgnoreCase("*")) {
                                            x = (() -> Term2 + StrOperator + Term1);
                                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Rule2.1.3.3.2 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                            log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule2.1.3.3 :x.Expr()=" + x.Expr());
                                        } else if (StrOperator.equalsIgnoreCase("/")) {
                                            x = (() -> Term2 + "/" + Term1);
                                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Rule2.1.3.3.3 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                            log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule2.1.3.3 :x.Expr()=" + x.Expr());
                                        } else {
                                            x = (() -> Term2 + "*" + Term1);
                                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Rule2.1.3.3.4 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                            log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule2.1.3.3 :x.Expr()=" + x.Expr());
                                        }
                                    } else if (((SavedOperator == 0) || (SavedOperator == -1)) && (Term1.equalsIgnoreCase(Diff2IntegrExpr)) && (!IsAConstant(Term1, DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                                        x = (() -> Term2 + StrOperator + Term1);
                                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Rule2.1.3.4 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                        log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule2.1.3.4 :x.Expr()=" + x.Expr());
                                    } else if (((SavedOperator == 0) || (SavedOperator == -1)) && (Term1.equalsIgnoreCase(Diff2IntegrExpr))) {
                                        x = (() -> Term2);
                                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Rule2.1.3.5 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                        log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule2.1.3.5 :x.Expr()=" + x.Expr());
                                    } else {
                                        x = (() -> Term2 + "*" + Term1);
                                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Rule2.1.3.6 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                        log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule2.1.3.6 :x.Expr()=" + x.Expr());
                                    }
                                    log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule2.1.3 :x.Expr()=" + x.Expr());
                                }
                            } else if ((!StrOperator.equalsIgnoreCase("\\+")) && (!StrOperator.equalsIgnoreCase("-"))) {
                                x = (() -> Term1 + StrOperator + Term2);
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Rule2.1.3.7 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            }
                            log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule2.1 :x.Expr()=" + x.Expr());
                        } else if (Term2.equalsIgnoreCase(DiffWithRespTo)) {
                            x = (() -> Diff1IntegrExpr + StrOperator + Term2 + "^2.0*1.0/2.0" + Term3);
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Rule2.2 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule2.2 :x.Expr()=" + x.Expr());
                        } else if (Diff1IntegrExpr.equalsIgnoreCase(Term2)) {
                            if ((Term1.equalsIgnoreCase(Diff2IntegrExpr)) && (Term1.equalsIgnoreCase(DiffWithRespTo))) {
                                if ((IsAConstant(Term3, DiffWithRespTo)) && (!Term2.contains(Term3))) {
                                    x = (() -> Diff1IntegrExpr + Term3 + StrOperator + Diff2IntegrExpr + "^2.0*1.0/2.0");
                                    ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Rule2.3.1.A :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                    log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule2.3.1.A :x.Expr()=" + x.Expr());
                                } else {
                                    x = (() -> Diff1IntegrExpr + StrOperator + Diff2IntegrExpr + "^2.0*1.0/2.0");
                                    ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Rule2.3.1.B :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                    log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule2.3.1.B :x.Expr()=" + x.Expr());
                                }
                                log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule2.3.1 :x.Expr()=" + x.Expr());
                            } else if (Term1.equalsIgnoreCase(Diff2IntegrExpr)) {
                                if (((Term3.startsWith("*")) || (Term3.startsWith("/")))
                                        && (Term2.equalsIgnoreCase(Diff1IntegrExpr))
                                        && (!IsAConstant(Term2, DiffWithRespTo))
                                        && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))
                                        && (!IsAConstant(Term1, DiffWithRespTo))
                                        && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                                    x = (() -> Term2 + StrOperator + Term1);
                                    ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Rule2.3.1.A.1 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                    log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule2.3.1.A.1 :x=" + x);
                                } else if ((Term1.equalsIgnoreCase("")) && ((Term3.startsWith("*")) || (Term3.startsWith("/")))
                                        && (Term2.equalsIgnoreCase(Diff1IntegrExpr))
                                        && (!IsAConstant(Term2, DiffWithRespTo))
                                        && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                                    x = (() -> "1.0" + Term3 + StrOperator + Diff2IntegrExpr);
                                    ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Rule2.3.1.A.2 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                    log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule2.3.1.A.2 :x=" + x);
                                } else if (((Term3.startsWith("*")) || (Term3.startsWith("/")))
                                        && (Term2.equalsIgnoreCase(Diff1IntegrExpr))
                                        && (!IsAConstant(Term2, DiffWithRespTo))
                                        && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))
                                        && (!IsAConstant(Term1, DiffWithRespTo))
                                        && ((StrIsAConstant.equalsIgnoreCase("Var")) || (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
                                    x = (() -> Term2 + StrOperator + Term1);
                                    ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Rule2.3.1.A.3 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                    log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule2.3.1.A.3 :x=" + x);
                                } else if ((!IsAConstant(Term3, DiffWithRespTo))
                                        && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))
                                        && (Term2.contains(Term3))) {
                                    x = (() -> Term2);
                                    ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Rule2.3.1.A.4 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                    log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule2.3.1.A.4 :x=" + x);
                                }
                                log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule2.3.1 :x.Expr()=" + x.Expr());
                            } else {
                                x = (() -> Diff1IntegrExpr + StrOperator + Diff2IntegrExpr);
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Rule2.3.2 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule2.3.2 :x.Expr()=" + x.Expr());
                            }
                        } else {
                            x = (() -> Diff1IntegrExpr + StrOperator + Term2 + Term3);
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Rule2.4 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule2.4 :x.Expr()=" + x.Expr());
                        }
                        log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule2 :x.Expr()=" + x.Expr());
                    } else if (((Term1 != null) && (!Term1.equalsIgnoreCase(""))) && (Term2.equalsIgnoreCase(Diff2IntegrExpr))) {
                        x = (() -> Diff1IntegrExpr);
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Rule3 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule3 :x.Expr()=" + x.Expr());
                    } else if ((((IsAConstant(Diff1IntegrExpr, DiffWithRespTo))
                            || ((!IsAConstant(Diff1IntegrExpr, DiffWithRespTo))
                            && ((StrIsAConstant.equalsIgnoreCase("IndConstant"))
                            || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))))) && (IsAConstant(Diff2IntegrExpr, DiffWithRespTo))) {
                        if (((SavedOperator == 0) || (SavedOperator == -1)) && (!IsAConstant(Diff2IntegrExpr, DiffWithRespTo))) {
                            x = (() -> Diff1IntegrExpr);
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Rule4.1 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule4.1 :x.Expr()=" + x.Expr());
                        } else if (((SavedOperator == 0) || (SavedOperator == -1))
                                && (Term1.equalsIgnoreCase(Diff2IntegrExpr))
                                && (IsAConstant(Diff2IntegrExpr, DiffWithRespTo))
                                && (!IsAConstant(Term2, DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))
                                && (Term2.contains(Term3)) && (Term2.contains(Term1))) {
                            if ((Diff1IntegrExpr.equalsIgnoreCase(Diff2IntegrExpr)) && (Term3.equalsIgnoreCase(""))) {
                                x = (() -> Term2);
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Rule4.2.1 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule4.2.1 :x.Expr()=" + x.Expr());
                            } else if (!Term3.equalsIgnoreCase("")) {
                                x = (() -> "1.0" + Term3 + StrOperator + Term1);
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Rule4.2.2 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule4.2.2 :x.Expr()=" + x.Expr());
                            } else if ((Term3.equalsIgnoreCase("")) && (!IsAConstant(Term2, DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression"))) && (Term2.contains(Diff2IntegrExpr))) {
                                x = (() -> Diff1IntegrExpr + StrOperator + DiffWithRespTo);
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Rule4.2.3 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule4.2.3 :x.Expr()=" + x.Expr());
                            }
                            log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule4.2 :x.Expr()=" + x.Expr());
                        } else if (((SavedOperator == 0) || (SavedOperator == -1)) && (Term1.equalsIgnoreCase(Diff2IntegrExpr)) && (IsAConstant(Diff2IntegrExpr, DiffWithRespTo)) && (!IsAConstant(Term2, DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                            if (Term1.equalsIgnoreCase("0.0")) {
                                x = (() -> Term1);
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Rule4.3 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule4.3 :x.Expr()=" + x.Expr());
                            } else if (!Term1.equalsIgnoreCase("0.0")) {
                                x = (() -> Term2 + StrOperator + Term1);
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Rule4.4 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule4.4 :x.Expr()=" + x.Expr());
                            }
                        } else if (((SavedOperator == 0) || (SavedOperator == -1)) && (Term1.equalsIgnoreCase(Diff2IntegrExpr)) && (IsAConstant(Diff2IntegrExpr, DiffWithRespTo))) {
                            x = (() -> "1.0" + Term3 + StrOperator + Term1);
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Rule4.5 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule4.5 :x.Expr()=" + x.Expr());
                        } else {
                            x = (() -> Diff1IntegrExpr + StrOperator + Diff2IntegrExpr);
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Rule4.6 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule4.6 :x.Expr()=" + x.Expr());
                        }
                        log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule4 :x.Expr()=" + x.Expr());
                    } else if ((((IsAConstant(Diff1IntegrExpr, DiffWithRespTo))
                            || ((!IsAConstant(Diff1IntegrExpr, DiffWithRespTo))
                            && ((StrIsAConstant.equalsIgnoreCase("IndConstant"))
                            || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))))) && (IsAConstant(Diff2IntegrExpr, DiffWithRespTo))) {
                        x = (() -> Diff1IntegrExpr + StrOperator + Diff2IntegrExpr);
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Rule5 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule5 :x.Expr()=" + x.Expr());
                    } else if ((!IsAConstant(Diff2IntegrExpr, DiffWithRespTo)) && (!StrIsAConstant.equalsIgnoreCase("Unknown"))) {
                        x = (() -> Term2);
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Rule6 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule6 :x.Expr()=" + x.Expr());
                    } else if ((!IsAConstant(Diff1IntegrExpr, DiffWithRespTo)) && (!StrIsAConstant.equalsIgnoreCase("Unknown"))) {
                        x = (() -> Diff1IntegrExpr);
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Rule7 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Integr:ApplyFunc_ConstantRules:ConstantRule :Rule7 :x.Expr()=" + x.Expr());
                    }
                }
                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseConstantRule:ConstantRule :Final:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                log.info("Integr:ApplyFuncRules:ConstantRule:x.Expr()=" + x.Expr());
                log.info("Integr:parseConstantRule:Final:x.Expr()=" + x.Expr());
                return x;
            }

            IntegrLambda parseSumRule() {
                IntegrLambda x = (() -> "");
                final String Diff1IntegrExpr = Diff1.IntegrExpr();
                final String Diff2IntegrExpr = Diff2.IntegrExpr();
                if ((Rule.equalsIgnoreCase("SumRule"))
                        || (Rule.equalsIgnoreCase("SubtractionRule"))) {
                    if ((!Diff1IntegrExpr.equalsIgnoreCase("")) && (!Diff2IntegrExpr.equalsIgnoreCase("")) && (!Diff2IntegrExpr.equalsIgnoreCase(Term2)) && (Term3.equalsIgnoreCase(""))) {
                        if (Diff2IntegrExpr.contains(DiffWithRespTo)) {
                            if ((Diff2IntegrExpr.startsWith("-"))) {
                                x = (() -> Diff1IntegrExpr + Diff2IntegrExpr);
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseSumRule:SumRule:SubtractionRule:Rule1.1.1:", Rule, LowLevelRules, false, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            } else if ((Diff2IntegrExpr.startsWith("+"))) {
                                x = (() -> Diff1IntegrExpr + Diff2IntegrExpr);
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseSumRule:SumRule:SubtractionRule:Rule1.1.2:", Rule, LowLevelRules, false, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            } else {
                                x = (() -> Diff1IntegrExpr + StrOperator + Diff2IntegrExpr);
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseSumRule:SumRule:SubtractionRule:Rule1.1.3:", Rule, LowLevelRules, false, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            }
                            log.info("Integr:ApplyFunc_SumSubRules:SumRule or SubtractionRule :Rule1.1 :x.Expr()=" + x.Expr());
                        } else if ((IsAConstant(Diff2IntegrExpr, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("NumberExpression"))) {
                            if (Diff2IntegrExpr.startsWith("1.0")) {
                                // Inserting Constant in the Middle of an Integral
                                final String TempDiff2IntegrExpr = Diff2IntegrExpr.replaceFirst("1.0", "");
                                String TempTerm2 = Term2;
                                if ((Term2.startsWith("1.0")) && (Term2.contains(DiffWithRespTo + "^"))) {
                                    String[] DataTempTerm2 = Term2.split("[\\*/]");
                                    if ((Term2.contains("\\*")) && (Term2.contains("*" + DataTempTerm2[1]))) {
                                        TempTerm2 = DataTempTerm2[0] + TempDiff2IntegrExpr + "*" + DataTempTerm2[1];
                                    }
                                    if ((Term2.contains("/")) && (Term2.contains("/" + DataTempTerm2[1]))) {
                                        TempTerm2 = DataTempTerm2[0] + TempDiff2IntegrExpr + "/" + DataTempTerm2[1];
                                    }
                                    if ((Term2.contains("*")) && (DataTempTerm2[2].contains(DiffWithRespTo + "^")) && (Term2.contains("*" + DataTempTerm2[2]))) {
                                        TempTerm2 = TempTerm2 + "*" + DataTempTerm2[2];
                                    }
                                    if ((Term2.contains("/")) && (DataTempTerm2[2].contains(DiffWithRespTo + "^")) && (Term2.contains("/" + DataTempTerm2[2]))) {
                                        TempTerm2 = TempTerm2 + "/" + DataTempTerm2[2];
                                    }
                                }
                                final String TempTerm3 = TempTerm2;
                                x = (() -> Diff1IntegrExpr + StrOperator + TempTerm3);
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseSumRule:SumRule:SubtractionRule:Rule1.2.1 :", Rule, LowLevelRules, false, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                log.info("Integr:ApplyFunc_SumSubRules:SumRule or SubtractionRule :Rule1.2 :x.Expr()=" + x.Expr());
                            } else {
                                x = (() -> Diff1IntegrExpr + StrOperator + Diff2IntegrExpr + "*" + DiffWithRespTo);
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseSumRule:SumRule:SubtractionRule:Rule1.2.2 :", Rule, LowLevelRules, false, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                log.info("Integr:ApplyFunc_SumSubRules:SumRule or SubtractionRule :Rule1.2 :x.Expr()=" + x.Expr());
                            }
                        } else {
                            x = (() -> Diff1IntegrExpr + StrOperator + Diff2IntegrExpr + "*" + DiffWithRespTo);
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseSumRule:SumRule:SubtractionRule:Rule1.2.3 :", Rule, LowLevelRules, false, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            log.info("Integr:ApplyFunc_SumSubRules:SumRule or SubtractionRule :Rule1.2 :x.Expr()=" + x.Expr());
                        }
                        log.info("Integr:ApplyFunc_SumSubRules:SumRule or SubtractionRule :Rule1 :x.Expr()=" + x.Expr());
                    } else if ((!Term1.equalsIgnoreCase("")) && (!Term2.equalsIgnoreCase("")) && (!Diff2IntegrExpr.equalsIgnoreCase(Term2)) && (Term3.equalsIgnoreCase(""))) {
                        x = (() -> Term1 + StrOperator + Term2);
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseSumRule:SumRule:SubtractionRule:Rule2 :", Rule, LowLevelRules, false, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Integr:ApplyFunc_SumSubRules:SumRule or SubtractionRule :Rule2 :x.Expr()=" + x.Expr());
                    } else if ((!Diff2IntegrExpr.equalsIgnoreCase(Term2)) && (Term3.equalsIgnoreCase(""))) {
                        x = (() -> Diff1IntegrExpr);
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseSumRule:SumRule:SubtractionRule:Rule3 :", Rule, LowLevelRules, false, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Integr:ApplyFunc_SumSubRules:SumRule or SubtractionRule :Rule3 :x.Expr()=" + x.Expr());
                    } else if ((!Term2.contains(DiffWithRespTo)) && (IsAConstant(Term2, DiffWithRespTo))) {
                        x = (() -> Diff1IntegrExpr + StrOperator + Diff2IntegrExpr);
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseSumRule:SumRule:SubtractionRule:Rule5 :", Rule, LowLevelRules, false, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Integr:ApplyFunc_SumSubRules:SumRule or SubtractionRule :Rule5 :x.Expr()=" + x.Expr());
                    } else if ((!IsAConstant(Diff2IntegrExpr, DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstantExpression")) || (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
                        if (Diff2IntegrExpr.equalsIgnoreCase(Term2 + "*" + DiffWithRespTo)) {
                            x = (() -> Diff1IntegrExpr + StrOperator + Term2 + "*" + DiffWithRespTo);
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseSumRule:SumRule:SubtractionRule:Rule6A :", Rule, LowLevelRules, false, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            log.info("Integr:ApplyFunc_SumSubRules:SumRule or SubtractionRule :Rule6A :x.Expr()=" + x.Expr());
                        } else if (Diff2IntegrExpr.equalsIgnoreCase(Term2 + "*" + DiffWithRespTo)) {
                            x = (() -> Diff1IntegrExpr + StrOperator + Term2 + "*" + DiffWithRespTo + "^2.0" + "*1.0/2.0");
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseSumRule:SumRule:SubtractionRule:Rule6B :", Rule, LowLevelRules, false, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            log.info("Integr:ApplyFunc_SumSubRules:SumRule or SubtractionRule :Rule6B :x.Expr()=" + x.Expr());
                        } else if (!Diff2IntegrExpr.contains(DiffWithRespTo)) {
                            x = (() -> Term1 + StrOperator + Diff2IntegrExpr + "*" + DiffWithRespTo);
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseSumRule:SumRule:SubtractionRule:Rule6C :", Rule, LowLevelRules, false, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            log.info("Integr:ApplyFunc_SumSubRules:SumRule or SubtractionRule :Rule6C :x.Expr()=" + x.Expr());
                        } else {
                            if ((IsAConstant(Diff2IntegrExpr, DiffWithRespTo)) || ((!IsAConstant(Diff2IntegrExpr, DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression"))))) {
                                x = (() -> Diff1IntegrExpr + StrOperator + Diff2IntegrExpr + "*" + DiffWithRespTo);
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseSumRule:SumRule:SubtractionRule:Rule6D.1 :", Rule, LowLevelRules, false, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                log.info("Integr:ApplyFunc_SumSubRules:SumRule or SubtractionRule :Rule6D.1 :x.Expr()=" + x.Expr());
                            } else {
                                x = (() -> Diff1IntegrExpr + StrOperator + Diff2IntegrExpr);
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseSumRule:SumRule:SubtractionRule:Rule6D.2 :", Rule, LowLevelRules, false, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                log.info("Integr:ApplyFunc_SumSubRules:SumRule or SubtractionRule :Rule6D.2 :x.Expr()=" + x.Expr());
                            }
                            log.info("Integr:ApplyFunc_SumSubRules:SumRule or SubtractionRule :Rule6D :x.Expr()=" + x.Expr());
                        }
                        log.info("Integr:ApplyFunc_SumSubRules:SumRule or SubtractionRule :Rule6 :x.Expr()=" + x.Expr());
                    } else if ((!Term1.equalsIgnoreCase("")) && (!Term2.equalsIgnoreCase(""))) {
                        if ((IsAConstant(Term2, DiffWithRespTo)) || ((!IsAConstant(Term2, DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression"))))) {
                            x = (() -> Term1 + StrOperator + Term2 + "*" + DiffWithRespTo);
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseSumRule:SumRule:SubtractionRule:Rule7A.1 :", Rule, LowLevelRules, false, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            log.info("Integr:ApplyFunc_SumSubRules:SumRule or SubtractionRule :Rule7A.1 :x.Expr()=" + x.Expr());
                        } else {
                            x = (() -> Term1 + StrOperator + Term2);
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseSumRule:SumRule:SubtractionRule:Rule7A.2 :", Rule, LowLevelRules, false, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            log.info("Integr:ApplyFunc_SumSubRules:SumRule or SubtractionRule :Rule7A.2 :x.Expr()=" + x.Expr());
                        }
                        log.info("Integr:ApplyFunc_SumSubRules:SumRule or SubtractionRule :Rule7 :x.Expr()=" + x.Expr());
                    }
                    //Drops Term2 && Diff2.IntegrExpr()
                    log.info("Integr:ApplyFuncRules:SumRule OR SubtractionRule:x.Expr()=" + x.Expr());
                }
                log.info("Integr:parseSumRule:Final:x.Expr()=" + x.Expr());
                return x;
            }

            IntegrLambda parseProductRule() {
                IntegrLambda x = (() -> "");
                final String Diff1IntegrExpr = Diff1.IntegrExpr();
                final String Diff2IntegrExpr = Diff2.IntegrExpr();
                if (Rule.equalsIgnoreCase("ProductRule")) {
                    if (!Term3.equalsIgnoreCase("")) {
                        ;//x = (() -> Term3 + "*" + Diff1.IntegrExpr() + "+" + Term1 + "*" + Diff2.IntegrExpr());
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseProductRule:ProductRule:Rule1 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Integr:ApplyFunc_ProductRules:ProductRule:Maths OR This Software does not support :" + Term3);
                        log.info("Integr:ApplyFunc_ProductRules:Rule1 :x.Expr()=" + x.Expr());
                    } else if ((Diff1IntegrExpr.equalsIgnoreCase(DiffWithRespTo)) && (Term2.equalsIgnoreCase("(" + Term1 + ")"))) {
                        //Differentiation of x term:
                        x = (() -> "1.0" + "/2.0" + "*" + Term2 + "*" + DiffWithRespTo + "^" + "2.0");
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseProductRule:ProductRule:Rule1.A :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Integr:ApplyFunc_ProductRules:Rule2 :x.Expr()=" + x.Expr());
                    } else if (Diff1IntegrExpr.equalsIgnoreCase(DiffWithRespTo)) {
                        //Differentiation of x term:
                        x = (() -> Diff2IntegrExpr);
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseProductRule:ProductRule:Rule2 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Integr:ApplyFunc_ProductRules:Rule2 :x.Expr()=" + x.Expr());
                    } else if ((Diff2IntegrExpr.equalsIgnoreCase(DiffWithRespTo)) && (IsAConstant(Diff1IntegrExpr, DiffWithRespTo))) {
                        //Differentiation of x term:
                        x = (() -> Diff1IntegrExpr + "/2.0" + "*" + DiffWithRespTo + "^" + "2.0");
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseProductRule:ProductRule:Rule3 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Integr:ApplyFunc_ProductRules:Rule3 :x.Expr()=" + x.Expr());
                    } else if ((Diff2IntegrExpr.equalsIgnoreCase(DiffWithRespTo)) && (IsAConstant(Diff1IntegrExpr, DiffWithRespTo))) {
                        //Differentiation of x term with Independent Constant:
                        x = (() -> Diff1IntegrExpr + "/2.0" + "*" + DiffWithRespTo + "^" + "2.0");
                        //x = (() -> Diff1.IntegrExpr());
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseProductRule:ProductRule:Rule4 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Integr:ApplyFunc_ProductRules:Rule4 :x.Expr()=" + x.Expr());
                    } else if (!Diff1IntegrExpr.equalsIgnoreCase("")) {
                        if ((((IsAConstant(Diff1IntegrExpr, DiffWithRespTo))
                                || ((!IsAConstant(Diff1IntegrExpr, DiffWithRespTo))
                                && ((StrIsAConstant.equalsIgnoreCase("IndConstant"))
                                || (StrIsAConstant.equalsIgnoreCase("Unknown")))))
                                && (IsAConstant(Diff2IntegrExpr, DiffWithRespTo))
                                || ((!IsAConstant(Diff2IntegrExpr, DiffWithRespTo))
                                && ((StrIsAConstant.equalsIgnoreCase("IndConstant"))
                                || (StrIsAConstant.equalsIgnoreCase("Unknown")))))) {
                            if (Diff1IntegrExpr.contains("@IndependentFactor@")) {
                                Split(Diff1IntegrExpr, DiffWithRespTo);
                                final String TempStrDiff1 = FactorsDiffExpr;
                                x = (() -> TempStrDiff1);
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseProductRule:ProductRule:Rule5A.A :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            } else if (Diff2IntegrExpr.equalsIgnoreCase(DiffWithRespTo)) {
                                x = (() -> Diff1IntegrExpr + "*" + Diff2IntegrExpr + "^2.0");
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseProductRule:ProductRule:Rule5A.B :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            } else if (Term2.equalsIgnoreCase("(" + Term1 + ")")) {
                                x = (() -> Diff1IntegrExpr + "*" + Term2);
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseProductRule:ProductRule:Rule5A.C :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            } else {
                                x = (() -> Diff1IntegrExpr + "*" + Diff2IntegrExpr + "*" + DiffWithRespTo);
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseProductRule:ProductRule:Rule5A.D :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            }
                            log.info("Integr:ApplyFunc_ProductRules:Rule5A :x.Expr()=" + x.Expr());
                        } else {
                            if ((Diff2IntegrExpr.startsWith("1.0*")) || (Diff2IntegrExpr.startsWith("1.0/"))) {
                                String Temp = Diff2IntegrExpr.replaceFirst("1.0", "");
                                if ((Diff1IntegrExpr.endsWith("/")) && (Term1.startsWith("/"))) {
                                    String Temp1 = Diff1IntegrExpr.replaceFirst("/", "");
                                    x = (() -> Temp1 + Term1 + Temp);
                                    ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseProductRule:ProductRule:Rule5B.1 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                    log.info("Integr:ApplyFunc_ProductRules:Rule5B.1 :x.Expr())=" + x.Expr());
                                } else if (Diff1IntegrExpr.endsWith("/")) {
                                    String Temp1 = Diff1IntegrExpr.replaceFirst("/", "");
                                    x = (() -> Temp1 + Temp);
                                    ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseProductRule:ProductRule:Rule5B.2 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                    log.info("Integr:ApplyFunc_ProductRules:Rule5B.2 :x.Expr()=" + x.Expr());
                                } //Need to uncomment below code
                                else {
                                    if ((Term1.startsWith("/")) && (Diff1IntegrExpr.startsWith("1.0" + Term1))) {
                                        if ((Temp.startsWith("/")) || (Temp.startsWith("*"))) {
                                            x = (() -> "1.0" + Term1 + Temp);
                                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseProductRule:ProductRule:Rule5B.3.1 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                        } else {
                                            x = (() -> "1.0" + Term1 + StrOperator + Temp);
                                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseProductRule:ProductRule:Rule5B.3.2 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                        }
                                    } else if ((!Term1.equalsIgnoreCase("")) && (!Diff1IntegrExpr.contains(Term1))) {
                                        x = (() -> Diff1IntegrExpr + Term1 + Temp);
                                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseProductRule:ProductRule:Rule5B.3.A :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                        log.info("Integr:ApplyFunc_ProductRules:Rule5B.3.A :x.Expr()=" + x.Expr());
                                    } else {
                                        if ((Temp.startsWith("/")) || (Temp.startsWith("*"))) {
                                            x = (() -> Diff1IntegrExpr + Temp);
                                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseProductRule:ProductRule:Rule5B.3.B.1:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                        } else {
                                            x = (() -> Diff1IntegrExpr + StrOperator + Temp);
                                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseProductRule:ProductRule:Rule5B.3.B.2:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                        }
                                        log.info("Integr:ApplyFunc_ProductRules:Rule5B.3.B :x.Expr()=" + x.Expr());
                                    }
                                    log.info("Integr:ApplyFunc_ProductRules:Rule5B.3 :x.Expr()=" + x.Expr());
                                }
                                log.info("Integr:ApplyFunc_ProductRules:Rule5B :x.Expr()=" + x.Expr());
                            } else if ((!IsAConstant(Diff1IntegrExpr, DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression"))) && (Term1.startsWith("/")) && (Diff2IntegrExpr.contains(DiffWithRespTo))) {
                                x = (() -> Diff1IntegrExpr + "*" + Diff2IntegrExpr);
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseProductRule:ProductRule:Rule5C:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                log.info("Integr:ApplyFunc_ProductRules:Rule5C :x.Expr()=" + x.Expr());
                            } else if ((Diff1IntegrExpr.contains("*2.0")) && (Diff2IntegrExpr.contains(DiffWithRespTo + "^2.0"))) {
                                x = (() -> Diff1IntegrExpr + "/2.0" + "*" + Diff2IntegrExpr);
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseProductRule:ProductRule:Rule5D:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                log.info("Integr:ApplyFunc_ProductRules:Rule5D :x.Expr()=" + x.Expr());
                            } else {
                                x = (() -> Diff1IntegrExpr + "*" + Diff2IntegrExpr);
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseProductRule:ProductRule:Rule5E:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                log.info("Integr:ApplyFunc_ProductRules:Rule5E :x.Expr()=" + x.Expr());
                            }
                        }
                        log.info("Integr:ApplyFunc_ProductRules:Rule5 :x.Expr()=" + x.Expr());
                    } else if (Diff1IntegrExpr.equalsIgnoreCase("")) {
                        x = (() -> Diff2IntegrExpr);
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseProductRule:ProductRule:Rule6:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Integr:ApplyFunc_ProductRules:Rule6 :x.Expr()=" + x.Expr());
                    }
                }
                log.info("Integr:parseProductRule:Final:x.Expr()=" + x.Expr());
                return x;
            }

            IntegrLambda parseQuotientRule() {
                IntegrLambda x = (() -> "");
                final String Diff1IntegrExpr = Diff1.IntegrExpr();
                final String Diff2IntegrExpr = Diff2.IntegrExpr();
                if (Rule.equalsIgnoreCase("QuotientRule")) {
                    if (!Term3.equalsIgnoreCase("")) {
                        x = (() -> ("(" + Term2 + "*" + Diff1IntegrExpr + "-" + Term1 + "*" + Diff2IntegrExpr) + "/" + "(" + Term2 + "*" + Term2 + ")" + ")");
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseQuotientRule:QuotientRule:Rule1:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Integr:ApplyFunc_QuotientRules:QuotientRule:Rule1 :x.Expr()=" + x.Expr());
                    } else if ((!Diff1IntegrExpr.equalsIgnoreCase("")) && (Diff2IntegrExpr.equalsIgnoreCase(DiffWithRespTo))) {
                        if (Diff1IntegrExpr.equalsIgnoreCase("1.0")) {
                            x = (() -> "ln(" + DiffWithRespTo + ")");
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseQuotientRule:QuotientRule:Rule2A:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            log.info("Integr:ApplyFunc_QuotientRules:QuotientRule:Rule2A :x.Expr()=" + x.Expr());
                        } else {
                            x = (() -> Diff1IntegrExpr + "*" + "ln(" + DiffWithRespTo + ")");
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseQuotientRule:QuotientRule:Rule2B:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            log.info("Integr:ApplyFunc_QuotientRules:QuotientRule:Rule2B :x.Expr()=" + x.Expr());
                        }
                        log.info("Integr:ApplyFunc_QuotientRules:QuotientRule:Rule2 :x.Expr()=" + x.Expr());
                    } else if ((!Diff1IntegrExpr.equalsIgnoreCase("")) && (!Diff1IntegrExpr.equalsIgnoreCase("1.0"))) {
                        if (Diff2IntegrExpr.startsWith("1.0")) {
                            String Temp = Diff2IntegrExpr.replaceFirst("1.0", "");
                            if ((Term2.equalsIgnoreCase(Diff2IntegrExpr)) && (!Term1.equalsIgnoreCase(""))) {
                                x = (() -> "1.0" + Term1 + Temp);
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseQuotientRule:QuotientRule:Rule3A.1:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            } else {
                                x = (() -> Diff1IntegrExpr + Temp);
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseQuotientRule:QuotientRule:Rule3A.2:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            }
                            log.info("Integr:ApplyFunc_QuotientRules:QuotientRule:Rule3A :x.Expr()=" + x.Expr());
                        } else if (!IsAConstant(Diff2IntegrExpr, DiffWithRespTo)) {
                            if (Diff2IntegrExpr.startsWith(StrOperator)) {
                                x = (() -> Diff1IntegrExpr + Diff2IntegrExpr);
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseQuotientRule:QuotientRule:Rule3B.1:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                log.info("Integr:ApplyFunc_QuotientRules:QuotientRule:Rule3B.1 :x.Expr()=" + x.Expr());
                            } else if (Diff2IntegrExpr.contains("ln(")) {
                                x = (() -> Diff1IntegrExpr + "*" + Diff2IntegrExpr);
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseQuotientRule:QuotientRule:Rule3B.2 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                log.info("Integr:ApplyFunc_QuotientRules:QuotientRule:Rule3B.2 :x.Expr()=" + x.Expr());
                            } else {
                                x = (() -> Diff1IntegrExpr + StrOperator + Diff2IntegrExpr);
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseQuotientRule:QuotientRule:Rule3B.3 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                                log.info("Integr:ApplyFunc_QuotientRules:QuotientRule:Rule3B.2 :x.Expr()=" + x.Expr());
                            }
                            log.info("Integr:ApplyFunc_QuotientRules:QuotientRule:Rule3B :x.Expr()=" + x.Expr());
                        } else {
                            x = (() -> Diff1IntegrExpr + StrOperator + Diff2IntegrExpr);
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseQuotientRule:QuotientRule:Rule3C :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            log.info("Integr:ApplyFunc_QuotientRules:QuotientRule:Rule3C :x.Expr()=" + x.Expr());
                        }
                        log.info("Integr:ApplyFunc_QuotientRules:QuotientRule:Rule3 :x.Expr()=" + x.Expr());
                    } else if ((!Diff1IntegrExpr.equalsIgnoreCase("")) && (!Diff2IntegrExpr.contains(Diff1IntegrExpr + "/"))) {
                        if (Diff2IntegrExpr.equalsIgnoreCase(DiffWithRespTo)) {
                            x = (() -> "ln(" + DiffWithRespTo + ")");
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseQuotientRule:QuotientRule:Rule4A :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            log.info("Integr:ApplyFunc_QuotientRules:QuotientRule:Rule4A :x.Expr()=" + x.Expr());
                        } else {
                            x = (() -> Diff1IntegrExpr + "/" + Diff2IntegrExpr);
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseQuotientRule:QuotientRule:Rule4B :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                            log.info("Integr:ApplyFunc_QuotientRules:QuotientRule:Rule4B :x.Expr()=" + x.Expr());
                        }
//                else {
//                    x = (() -> Diff2.IntegrExpr());
//                    log.info("Integr:ApplyFuncRules:QuotientRule:Rule4C :x.Expr()=" + x.Expr());
//                }
                    } else {
                        x = (() -> Diff2IntegrExpr);
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompleteExprn, "Integr:parseQuotientRule:QuotientRule:Rule4C :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x.Expr());
                        log.info("Integr:ApplyFunc_QuotientRules:QuotientRule:Rule4C :x.Expr()=" + x.Expr());
                    }
                }
                log.info("Integr:parseQuotientRule:Final:x.Expr()=" + x.Expr());
                return x;
            }
        }.parseIntegr();
    }

    public static String LIATEUx(String aTerm4, String bTerm3, String DiffWithRespTo) {
        //Logarithm
        if ((aTerm4.contains("ln")) || (aTerm4.contains("logn"))) {
            return aTerm4;
        } //Inverse Trignometric Functions
        else if ((aTerm4.contains("arctan")) || (aTerm4.contains("arcsin"))) {
            return aTerm4;
        } //Simple Parentheses
        else if ( /*((!bTerm3.contains("sin")) && (!bTerm3.contains("cos"))) &&*/(bTerm3.contains("(")) && (bTerm3.contains(")")) && (!bTerm3.contains(DiffWithRespTo + "^")) || (bTerm3.contains(DiffWithRespTo))) {
            if ((bTerm3.contains("sin")) || (bTerm3.contains("cos"))) {
                return aTerm4;
            } else {
                return bTerm3;
            }
        } //Algebraic Polynomials Functions
        else if ((aTerm4.contains(DiffWithRespTo + "^")) || (aTerm4.contains(DiffWithRespTo))) {
            return aTerm4;
        } //Trignometric Functions
        else if ((aTerm4.contains("sin")) || (aTerm4.contains("cos"))) {
            return aTerm4;
        } //Exponential Functions
        else if ((aTerm4.contains("^" + DiffWithRespTo))) {
            return aTerm4;
        }
        return bTerm3;
    }

    public static String LIATEVx(String aTerm4, String bTerm3, String DiffWithRespTo) {
        //Logarithm
        if ((aTerm4.contains("ln")) || (aTerm4.contains("logn"))) {
            return bTerm3;
        } //Inverse Trignometric Functions
        else if ((aTerm4.contains("arctan")) || (aTerm4.contains("arcsin"))) {
            return bTerm3;
        } //Simple Parentheses
        else if ( /*((!bTerm3.contains("sin")) && (!bTerm3.contains("cos"))) &&*/(bTerm3.contains("(")) && (bTerm3.contains(")")) && (!bTerm3.contains(DiffWithRespTo + "^")) || (bTerm3.contains(DiffWithRespTo))) {
            if ((bTerm3.contains("sin")) || (bTerm3.contains("cos"))) {
                return bTerm3;
            } else {
                return aTerm4;
            }
        } //Algebraic Polynomials Functions
        else if ((aTerm4.contains(DiffWithRespTo + "^")) || (aTerm4.contains(DiffWithRespTo))) {
            return bTerm3;
        } //Trignometric Functions
        else if ((aTerm4.contains("sin")) || (aTerm4.contains("cos"))) {
            return bTerm3;
        } //Exponential Functions
        else if ((aTerm4.contains("^" + DiffWithRespTo))) {
            return bTerm3;
        }
        return aTerm4;
    }

    public static String LIATEDiff1IntegrExprUx(String aTerm4, String bTerm3, String Diff1IntegrExpr, String Diff2IntegrExpr, String DiffWithRespTo) {
        //Logarithm
        if ((aTerm4.contains("ln")) || (aTerm4.contains("logn"))) {
            return Diff1IntegrExpr;
        } //Inverse Trignometric Functions
        else if ((aTerm4.contains("arctan")) || (aTerm4.contains("arcsin"))) {
            return Diff1IntegrExpr;
        }//Simple Parentheses
        else if ( /*((!bTerm3.contains("sin")) && (!bTerm3.contains("cos"))) &&*/(bTerm3.contains("(")) && (bTerm3.contains(")")) && (!bTerm3.contains(DiffWithRespTo + "^")) || (bTerm3.contains(DiffWithRespTo))) {
            if ((bTerm3.contains("sin")) || (bTerm3.contains("cos"))) {
                return Diff1IntegrExpr;
            } else {
                return Diff2IntegrExpr;
            }
        } //Algebraic Polynomials Functions
        else if ((aTerm4.contains(DiffWithRespTo + "^")) || (aTerm4.contains(DiffWithRespTo))) {
            return Diff1IntegrExpr;
        } //Trignometric Functions
        else if ((aTerm4.contains("sin")) || (aTerm4.contains("cos"))) {
            return Diff1IntegrExpr;
        } //Exponential Functions
        else if ((aTerm4.contains("^" + DiffWithRespTo))) {
            return Diff1IntegrExpr;
        }
        return Diff2IntegrExpr;
    }

    public static String LIATEDiff2IntegrExprVx(String aTerm4, String bTerm3, String Diff1IntegrExpr, String Diff2IntegrExpr, String DiffWithRespTo) {
        //Logarithm
        if ((aTerm4.contains("ln")) || (aTerm4.contains("logn"))) {
            return Diff2IntegrExpr;
        } //Inverse Trignometric Functions
        else if ((aTerm4.contains("arctan")) || (aTerm4.contains("arcsin"))) {
            return Diff2IntegrExpr;
        } //Simple Parentheses
        else if ( /*((!bTerm3.contains("sin")) && (!bTerm3.contains("cos"))) &&*/(bTerm3.contains("(")) && (bTerm3.contains(")")) && (!bTerm3.contains(DiffWithRespTo + "^")) || (bTerm3.contains(DiffWithRespTo))) {
            if ((bTerm3.contains("sin")) || (bTerm3.contains("cos"))) {
                return Diff2IntegrExpr;
            } else {
                return Diff1IntegrExpr;
            }
        } //Algebraic Polynomials Functions
        else if ((aTerm4.contains(DiffWithRespTo + "^")) || (aTerm4.contains(DiffWithRespTo))) {
            return Diff2IntegrExpr;
        } //Trignometric Functions
        else if ((aTerm4.contains("sin")) || (aTerm4.contains("cos"))) {
            return Diff2IntegrExpr;
        } //Exponential Functions
        else if ((aTerm4.contains("^" + DiffWithRespTo))) {
            return Diff2IntegrExpr;
        }
        return Diff1IntegrExpr;
    }

    public static String DiffUxDifferentiation(String Ux, String DiffWithRespTo, String MapType, String IntegrORDiffr) {
        System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET: Recursivecall:Start:DiffUxDifferentiation:IntegrationByParts" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET: Ux=" + Ux + ConsoleColors.RESET);
        depthBackUpRestore++;
        StrKeyBackUpRestore = FileSepBackUpRestore + "Integr:ApplyFuncRules:Parenthesis:Diff1IntegrExpr";
        Map<String, String> variablesBackupState = new HashMap();
        BackupDiffIntegrStateAll(variablesBackupState);
        MathsContxtLAv.ChaosPrevention();
        MathsContxtLAv.SimpleExpression MyTempTerm1 = (() -> "");
        Map<String, String> variablesStr = new HashMap<>();
        //MyTempTerm1 = parseSimple(Ux, variables, DiffWithRespTo, MapType, IntegrORDiffr, true, "Silent", MathsContxtLAv.LogLevel.Info);
        DiffExpr MyUxDash = parseDiff(Ux, variables, DiffWithRespTo, MapType, IntegrORDiffr);

        MathsContxtLAv.SimpleExpression MyTempTerm2 = MathsContxtLAv.parseSimple(MyUxDash.DiffExpr(), variables, DiffWithRespTo, MapType, IntegrORDiffr, false, "Silent", MathsContxtLAv.LogLevel.Info);

        RestoreDiffIntegrStateAll(variablesBackupState);
        depthBackUpRestore--;
        StrKeyBackUpRestore = FileSepBackUpRestore;
        String DiffUx = MyTempTerm2.SimpleExpr();
        System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET: Recursivecall:End:DiffUxDifferentiation:IntegrationByParts:DiffUx=" + DiffUx + ConsoleColors.RESET);
        return DiffUx;
    }

    public static String IntegralDiffVxIntegration(String DiffVx, String DiffUx, String DiffWithRespTo, String MapType, String IntegrORDiffr, String Diff1IntegrExpr, String OrigFirst, String Diff2IntegrExpr, String OrigSecnd) {
        System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET: Recursivecall:Start:IntegralDiffVxIntegration:IntegrationByParts" + ConsoleColors.RESET);
        Map<String, String> variablesBackupState = new HashMap();
        depthBackUpRestore++;
        StrKeyBackUpRestore = FileSepBackUpRestore + "Integr:ApplyFuncRules:Parenthesis:Diff2IntegrExpr";
        BackupDiffIntegrStateAll(variablesBackupState);
        MathsContxtLAv.ChaosPrevention();
        //MathsContxtLAv.SimpleExpression MyTempTerm1 = MathsContxtLAv.parseSimple(DiffUx +"*"+ Diff2IntegrExpr, variables, DiffWithRespTo, MapType, IntegrORDiffr, false, "Silent", MathsContxtLAv.LogLevel.Info);
        //ExprSimpleStrSep.SimpleStr MyTempTerm1 = (() -> "");
        Map<String, String> variablesStr = new HashMap<>();
        //MyTempTerm1 = parseSimple(DiffVx, variablesStr, DiffWithRespTo, "Silent", ExprSimpleStrSep.LogLevel.Info);
        System.out.println("Integr:ApplyFunc:IntegrationByParts:MyTempTerm1.SimpleExpr()=" + DiffVx + " DiffVx=" + DiffVx);
        //DiffrIntegrSep.IntegrExpr MyTemp2 = DiffrIntegrSep.parseIntegr(MyTempTerm1.SimpleExpr(), variables, DiffWithRespTo, MapType, IntegrORDiffr);
        final String FinDiffUx = DiffUx;
        DiffrIntegrSep.IntegrExpr MyTemp2 = (() -> "");
        if ((IsAConstant(DiffUx, DiffWithRespTo))
                && ((StrIsAConstant.equalsIgnoreCase("Number")) || (StrIsAConstant.equalsIgnoreCase("NumberExpression")))) {
            System.out.println(ConsoleColors.BLUE + "VERBOSE IF SET: Recursivecall:Start:IntegralDiffVxIntegration:Simple:NumberExpression:" + ConsoleColors.RESET);
            MyTemp2 = DiffrIntegrSep.parseIntegr(DiffVx, variables, DiffWithRespTo, MapType, IntegrORDiffr);
            final String FinMyTemp2 = MyTemp2.IntegrExpr();
            if (DiffUx.equalsIgnoreCase("1.0")) {
                MyTemp2 = (() -> FinMyTemp2);
            } else {
                MyTemp2 = (() -> FinMyTemp2 + "*" + DiffUx);
            }
            System.out.println(ConsoleColors.BLUE + "VERBOSE IF SET: Recursivecall:End:IntegralDiffVxIntegration:Simple:NumberExpression:MyTemp2.IntegrExpr()=" + MyTemp2.IntegrExpr() + ConsoleColors.RESET);
        } else if ((!IsAConstant(DiffUx, DiffWithRespTo))
                && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
            System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET: Recursivecall:Start:IntegralDiffVxIntegration:Simple:IndConstantExpression:" + ConsoleColors.RESET);
            MyTemp2 = DiffrIntegrSep.parseIntegr(DiffVx, variables, DiffWithRespTo, MapType, IntegrORDiffr);
            final String FinMyTemp2 = MyTemp2.IntegrExpr();
            if (DiffUx.equalsIgnoreCase("1.0")) {
                MyTemp2 = (() -> FinMyTemp2);
            } else {
                MyTemp2 = (() -> FinMyTemp2 + "*" + DiffUx);
            }
            System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET: Recursivecall:End:IntegralDiffVxIntegration:Simple:IndConstantExpression:MyTemp2.IntegrExpr()=" + MyTemp2.IntegrExpr() + ConsoleColors.RESET);
        } else if ((!IsAConstant(DiffUx, DiffWithRespTo))
                && ((StrIsAConstant.equalsIgnoreCase("Var")) || (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
            System.out.println(ConsoleColors.RED + "VERBOSE IF SET: Recursivecall:Start:IntegralDiffVxIntegration:NOT SUPPORTED:" + ConsoleColors.RESET);
            MyTemp2 = DiffrIntegrSep.parseIntegr(DiffVx, variables, DiffWithRespTo, MapType, IntegrORDiffr);
            System.out.println(ConsoleColors.RED + "VERBOSE IF SET: Recursivecall:End:IntegralDiffVxIntegration:NOT SUPPORTED:" + ConsoleColors.RESET);
        }
        System.out.println("Integr:ApplyFunc:IntegrationByParts:MyTempTerm1.IntegrExpr()=" + MyTemp2.IntegrExpr() + " DiffVx=" + DiffVx);
        RestoreDiffIntegrStateAll(variablesBackupState);
        depthBackUpRestore--;
        StrKeyBackUpRestore = FileSepBackUpRestore;
        String IntegralDiffVx = MyTemp2.IntegrExpr();
        System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET: Recursivecall:End:IntegralDiffVxIntegration:IntegrationByParts" + ConsoleColors.RESET);
        return IntegralDiffVx;

    }

    public static String ParenIntegralDiffVxIntegration(String DiffVx, String DiffWithRespTo, String MapType, String IntegrORDiffr, String Diff1IntegrExpr, String OrigFirst, String Diff2IntegrExpr, String OrigSecnd) {
        System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET: Recursivecall:Start:Integre:IntegrationByParts" + ConsoleColors.RESET);
        Map<String, String> variablesBackupState = new HashMap();
        depthBackUpRestore++;
        StrKeyBackUpRestore = FileSepBackUpRestore + "Integr:ApplyFuncRules:Parenthesis:Diff2IntegrExpr";
        BackupDiffIntegrStateAll(variablesBackupState);
        MathsContxtLAv.ChaosPrevention();
        //MathsContxtLAv.SimpleExpression MyTemp = MathsContxtLAv.parseSimple(DiffVx, variables, DiffWithRespTo, MapType, IntegrORDiffr, false, "Silent", MathsContxtLAv.LogLevel.Info);
        //ExprSimpleStrSep.SimpleStr MyTempTerm1 = (() -> "");
        Map<String, String> variablesStr = new HashMap<>();
        //MyTempTerm1 = parseSimple(DiffVx, variablesStr, DiffWithRespTo, "Silent", ExprSimpleStrSep.LogLevel.Info);
        DiffrIntegrSep.IntegrExpr MyTemp2 = DiffrIntegrSep.parseIntegr(DiffVx, variables, DiffWithRespTo, MapType, IntegrORDiffr);
        RestoreDiffIntegrStateAll(variablesBackupState);
        depthBackUpRestore--;
        StrKeyBackUpRestore = FileSepBackUpRestore;
        String IntegralDiffVx = MyTemp2.IntegrExpr();
        System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET: Recursivecall:End:Integre:IntegrationByParts" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.GREEN + "Integre:IntegrationByParts:ParenIntegralDiffVxIntegration:IntegralDiffVx=" + IntegralDiffVx + ConsoleColors.RESET);
        return IntegralDiffVx;
    }

    public static String IntegrationFormula(String IntegralDiffVx1, String DiffUx1, String DiffUxSecndOrder, String Vx1, String DiffWithRespTo, String MapType, String IntegrORDiffr, String Diff1IntegrExpr, String OrigFirst, String Diff2IntegrExpr, String OrigSecnd) {
        //if (!AutoGenSilentFlag) {
        System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET: Recursivecall:Start:Integre:IntegrationByParts:Formula" + ConsoleColors.RESET);
        //}
        String Equation = "";
        String[] TempEquation = IntegralDiffVx1.split("[\\+\\-]");
        Equation = DiffUx1 + "*" + Vx1;
        //if (!AutoGenSilentFlag) {
        System.out.println(ConsoleColors.BLUE + "Integr:ApplyFunc:IntegrationByParts:FORMULA:Equation=" + Equation + ConsoleColors.RESET);
        //}
        //return Equation;
        System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET: Recursivecall:Start:Integre:IntegrationByParts:FORMULA:Second Part:IntegralDiffVx1=" + IntegralDiffVx1 + ConsoleColors.RESET);
        Map<String, String> variablesBackupState = new HashMap();
        depthBackUpRestore++;
        StrKeyBackUpRestore = FileSepBackUpRestore + "Integr:ApplyFuncRules:Parenthesis:Diff2IntegrExpr";
        BackupDiffIntegrStateAll(variablesBackupState);
        MathsContxtLAv.ChaosPrevention();
        //MathsContxtLAv.SimpleExpression MyTemp = MathsContxtLAv.parseSimple(DiffVx, variables, DiffWithRespTo, MapType, IntegrORDiffr, false, "Silent", MathsContxtLAv.LogLevel.Info);
        //ExprSimpleStrSep.SimpleStr MyTempTerm1 = (() -> "");
        Map<String, String> variablesStr = new HashMap<>();
        //MyTempTerm1 = parseSimple(DiffVx, variablesStr, DiffWithRespTo, "Silent", ExprSimpleStrSep.LogLevel.Info);
        DiffrIntegrSep.IntegrExpr MyTemp2 = DiffrIntegrSep.parseIntegr(IntegralDiffVx1, variables, DiffWithRespTo, MapType, IntegrORDiffr);
        RestoreDiffIntegrStateAll(variablesBackupState);
        depthBackUpRestore--;
        StrKeyBackUpRestore = FileSepBackUpRestore;
        String IntegralDiffVx = MyTemp2.IntegrExpr();
        System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET: Recursivecall:End:Integre:IntegrationByParts:FORMULA:Second Part:" + ConsoleColors.RESET);
        String MyTerm2Str = IntegralDiffVx;
        System.out.println("Integr:ApplyFunc:IntegrationByParts:SimpleExpr=" + IntegralDiffVx1 + "*" + DiffUx1);
        System.out.println("Integr:ApplyFunc:IntegrationByParts:MyTerm2Str=" + MyTerm2Str);

        System.out.println("Integr:ApplyFunc:IntegrationByParts:Equation=" + Equation);
        System.out.println("Integr:ApplyFunc:IntegrationByParts:Diff1IntegrExpr=" + Diff1IntegrExpr);
        System.out.println("Integr:ApplyFunc:IntegrationByParts:OrigFirst=" + OrigFirst);
        System.out.println("Integr:ApplyFunc:IntegrationByParts:Diff2IntegrExpr=" + Diff2IntegrExpr);
        System.out.println("Integr:ApplyFunc:IntegrationByParts:OrigSecnd=" + OrigSecnd);

        System.out.println(ConsoleColors.BLUE + "Integr:ApplyFunc:IntegrationByParts:FORMULA:Final Integration:MyTerm2Str=" + MyTerm2Str + ConsoleColors.RESET);
        //if (!AutoGenSilentFlag) {
        System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET: Recursivecall:End:Integre:IntegrationByParts:Formula" + ConsoleColors.RESET);
        //}
        return MyTerm2Str;
    }

    public static String FormulaSimplify(IntegrLambda x, String DiffWithRespTo, String MapType, String IntegrORDiffr) {
        Map<String, String> variablesBackupState1 = new HashMap();
        if (!AutoGenSilentFlag) {
            System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET: Recursivecall:Start:Integre:IntegrationByParts:Simplify" + ConsoleColors.RESET);
        }
        depthBackUpRestore++;
        StrKeyBackUpRestore = FileSepBackUpRestore + "Integr:ApplyFuncRules:Parenthesis:Simplify";
        BackupDiffIntegrStateAll(variablesBackupState1);
        //MathsContxtLAv.ChaosPrevention();
        MathsContxtLAv.SimpleExpression MyTempTerm4 = MathsContxtLAv.parseSimple(x.Expr(), variables, DiffWithRespTo, MapType, IntegrORDiffr, false, "Silent", MathsContxtLAv.LogLevel.Info);
        System.out.println("Integr:ApplyFunc:IntegrationByParts:FORMULA:MyTempTerm4.SimpleExpr()=" + MyTempTerm4.SimpleExpr());
        RestoreDiffIntegrStateAll(variablesBackupState1);
        depthBackUpRestore--;
        StrKeyBackUpRestore = FileSepBackUpRestore;
        if (!AutoGenSilentFlag) {
            System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET: Recursivecall:End:Integre:IntegrationByParts:Simplify" + ConsoleColors.RESET);
        }
        return MyTempTerm4.SimpleExpr();
    }

    public static String ApplyLambdaStringIntegr(String AlgoName, String CompltExprn, String Term1, IntegrExpr Diff1, String Term2, IntegrExpr Diff2, String Term3, String Term4, String StrOperator, String Rule, String DiffWithRespTo, int TermOperator, String LowLevelRules, String MapType, String IntegrORDiffr) {
        log.info("Integr:ApplyLambdaString:Initial :AlgoName(Calling Function)=" + AlgoName);
        log.info("Integr:ApplyLambdaString:Initial :Term1=" + Term1);
        log.info("Integr:ApplyLambdaString:Initial :Diff1.IntegrExpr()=" + Diff1.IntegrExpr());
        log.info("Integr:ApplyLambdaString:Initial :Term2=" + Term2);
        log.info("Integr:ApplyLambdaString:Initial :Diff2.IntegrExpr()=" + Diff2.IntegrExpr());
        log.info("Integr:ApplyLambdaString:Initial :Term3=" + Term3);
        log.info("Integr:ApplyLambdaString:Initial :Term4=" + Term4);
        log.info("Integr:ApplyLambdaString:Initial :StrOperator=" + StrOperator);
        log.info("Integr:ApplyLambdaString:Initial :Rule=" + Rule);
        log.info("Integr:ApplyLambdaString:Initial :LowLevelRules=" + LowLevelRules);
        log.info("Integr:ApplyLambdaString:Initial :SavedOperator=" + (char) SavedOperator);
        log.info("Integr:ApplyLambdaString:Initial :TermOperator=" + (char) TermOperator);
        log.info("Integr:ApplyLambdaString:Initial :DiffTermOperator=" + (char) DiffTermOperator);
        log.info("Integr:ApplyLambdaString:Initial :");
        log.info("Integr:ApplyLambdaString:Initial :");
        log.info("Integr:ApplyLambdaString:Initial :");
        if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
            System.out.println("Integr:ApplyLambdaStringIntegr:Initial:AlgoName=" + AlgoName + " Rule=" + Rule + " LowLevelRules=" + LowLevelRules + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
        }
        String x = "";
        IntegrLambdaStr y = (() -> "");
        String[] MyTemp = null;
        if (Diff2.IntegrExpr().contains("@Parenthesis@")) {
            MyTemp = Diff2.IntegrExpr().split("@Parenthesis@");
            if ((MyTemp.length > 1)) {
                Term2 = MyTemp[1];
            }
        }
        y = parseIntegrStr(AlgoName, CompltExprn, Term1, Diff1, Term2, Diff2, Term3, Term4, StrOperator, Rule, DiffWithRespTo, TermOperator, LowLevelRules, MapType, IntegrORDiffr);
        x = y.StrExpr();
        if ((DevelopmentDeepInfoLambdaFlagSep) || (GBLSilentDeepInfoLambdaSep.equalsIgnoreCase("Verbose"))) {
            System.out.println("Integr:ApplyLambdaStringIntegr:Final:AlgoName=" + AlgoName + " Rule=" + Rule + " LowLevelRules=" + LowLevelRules + " x=" + x + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
        }
        return x;
    }

    @FunctionalInterface
    public interface IntegrLambdaStr {

        String StrExpr();
    }

    public static IntegrLambdaStr parseIntegrStr(String AlgoName, String CompltExprn, String Term1, IntegrExpr Diff1, String Term2, IntegrExpr Diff2, String Term3, String Term4, String StrOperator, String Rule, String DiffWithRespTo, int TermOperator, String LowLevelRules, String MapType, String IntegrORDiffr) {
        return new Object() {

            IntegrLambdaStr parseIntegrStr() {
                String x = "";
                final String Diff1IntegrExpr = Diff1.IntegrExpr();
                final String Diff2IntegrExpr = Diff2.IntegrExpr();
                int Supported = 0;
                if ((Diff1IntegrExpr.contains(DiffWithRespTo)) && (Diff2IntegrExpr.contains(DiffWithRespTo)) && (Rule.equalsIgnoreCase("MappedQuotientRule")) && (StrOperator.equalsIgnoreCase("/"))) {
                    Supported = 0;
                }
                if (Rule.equalsIgnoreCase("NoExponentRuleTerm")) {
                    x = parseNoExponentRuleTerm();
                    log.info("Integr:String:parseIntegrStr:NoExponentRuleTerm:x=" + x);
                } else if (Rule.equalsIgnoreCase("NoExponentRuleDiff")) {
                    x = parseNoExponentRuleDiff();
                    log.info("Integr:String:parseIntegrStr:NoExponentRuleDiff:x=" + x);
                } else if (Rule.equalsIgnoreCase("CoeffExponentRule")) {
                    x = parseCoeffExponentRule();
                    log.info("Integr:String:parseIntegrStr:CoeffExponentRule:x=" + x);
                } else if (Rule.equalsIgnoreCase("ConstantRule")) {
                    x = parseConstantRule();
                    log.info("Integr:String:parseIntegrStr:ConstantRule:x=" + x);
                } else if ((Rule.equalsIgnoreCase("SumRule"))
                        || (Rule.equalsIgnoreCase("SubtractionRule"))) {
                    x = parseSumRule();
                    log.info("Integr:String:parseIntegrStr:SumRule OR SubtractionRule:x)=" + x);
                } else if (Rule.equalsIgnoreCase("ExponentRule")) {

                    log.info("Integr:String:parseIntegrStr:ExponentRule:x=" + x);
                } else if (Rule.equalsIgnoreCase("IntegrationByParts")) {
                    if (Supported == 1) {
                        // Integral u*Diffv= uv - Integral vDiff u
                        // Integral Ux*DiffV= Ux*IntegralDiffVx - Integral IntegralDiffVx*DiffUx
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:parseIntegr:IntegrationByParts:Rule1:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        System.out.println(ConsoleColors.GREEN + "Integr:ApplyFuncRulesString:IntegrationByParts:Diff1IntegrExpr=" + Diff1IntegrExpr + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.GREEN + "Integr:ApplyFuncRulesString:IntegrationByParts:Original 1st Function=" + Term4 + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.GREEN + "Integr:ApplyFuncRulesString:IntegrationByParts:Diff2IntegrExpr=" + Diff2IntegrExpr + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.GREEN + "Integr:ApplyFuncRulesString:IntegrationByParts:Original 2nd Function=" + Term3 + ConsoleColors.RESET);

                        if (StrOperator.equalsIgnoreCase("*")) {
                            String Ux = "";
                            String DiffUx = "";
                            String DiffUxSecndOrder = "";
                            String DiffVx = "";
                            String Vx = "";
                            //Choose Ux 
                            Ux = LIATEUx(Term4, Term3, DiffWithRespTo);
                            System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET:After LIATE: Ux=" + Ux + ConsoleColors.RESET);
                            String LocalDiff1IntegrExpr = LIATEDiff1IntegrExprUx(Term4, Term3, Diff1IntegrExpr, Diff2IntegrExpr, DiffWithRespTo);
                            DiffUx = DiffUxDifferentiation(Ux, DiffWithRespTo, MapType, IntegrORDiffr);
                            String LocalDiff2IntegrExpr = LIATEDiff2IntegrExprVx(Term4, Term3, Diff1IntegrExpr, Diff2IntegrExpr, DiffWithRespTo);
                            // Choose Vx
                            DiffVx = LIATEVx(Term4, Term3, DiffWithRespTo);
                            System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET:After LIATE: DiffVx=" + DiffVx + ConsoleColors.RESET);
                            Vx = IntegralDiffVxIntegration(DiffVx, DiffUx, DiffWithRespTo, MapType, IntegrORDiffr, LocalDiff1IntegrExpr, Term4, LocalDiff2IntegrExpr, Term3);
                            System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET: Vx=" + Vx + ConsoleColors.RESET);
                            System.out.println("Integr:ApplyFuncRulesString:IntegrationByParts:Ux=" + Ux);
                            System.out.println("Integr:ApplyFuncRulesString:IntegrationByParts:DiffUx=" + DiffUx);
                            System.out.println("Integr:ApplyFuncRulesString:IntegrationByParts:Vx=" + Vx);
                            System.out.println("Integr:ApplyFuncRulesString:IntegrationByParts:DiffVx=" + DiffVx);
                            final String Ux1 = Ux;
                            final String DiffUx1 = DiffUx;
                            final String Vx1 = DiffVx;
                            final String IntegralDiffVx1 = Vx;
                            if ((IntegralDiffVx1.isEmpty()) && (!Vx1.isEmpty())) {
                                System.out.println(ConsoleColors.RED + "Integr:ApplyFuncRulesString:IntegrationByParts:FORMULA WRONG:Vx" + ConsoleColors.RESET);
                            } else if ((Ux.isEmpty()) && (!DiffUx1.isEmpty())) {
                                System.out.println(ConsoleColors.RED + "Integr:ApplyFuncRulesString:IntegrationByParts:FORMULA WRONG:Ux" + ConsoleColors.RESET);
                            }
                            String MyTerm2Str = "";
                            if ((!Ux.equalsIgnoreCase(DiffWithRespTo)) && (Ux.contains(DiffWithRespTo))) {
                                MyTerm2Str = IntegrationFormula(IntegralDiffVx1, DiffUx1, DiffUxSecndOrder, Vx1, DiffWithRespTo, MapType, IntegrORDiffr, LocalDiff1IntegrExpr, Term4, LocalDiff2IntegrExpr, Term3);
                            } else {
                                MyTerm2Str = IntegrationFormula(IntegralDiffVx1, DiffUx1, DiffUxSecndOrder, Vx1, DiffWithRespTo, MapType, IntegrORDiffr, LocalDiff1IntegrExpr, Term4, LocalDiff2IntegrExpr, Term3);
                            }
                            final String FinMyTerm2Str = MyTerm2Str;
                            final String FinVx = LocalDiff2IntegrExpr;
                            // Integral u*Diffv= uv - Integral vDiffu
                            // Integral Ux*DiffV= Ux*Vx - Integral Vx*DiffUx

                            if ((Ux.equalsIgnoreCase(DiffWithRespTo)) && (!DiffUx1.contains(DiffWithRespTo))) {
                                if (IntegralDiffVx1.startsWith("-")) {
                                    final String TempIntegralDiffVx1 = IntegralDiffVx1.replaceFirst("\\-", "");
                                    x = Ux1 + "*" + FinVx + "+" + TempIntegralDiffVx1;
                                } else {
                                    x = Ux1 + "*" + FinVx + "-" + IntegralDiffVx1;
                                }
                            } else {
                                x = Ux1 + "*" + FinVx + "-" + FinMyTerm2Str;
                            }
                            //final String FormulaStr = FormulaSimplify(x, DiffWithRespTo, MapType, IntegrORDiffr);
                            //x = (() -> FormulaStr);
                            System.out.println(ConsoleColors.BLUE + "Integr:ApplyFuncRulesString:IntegrationByParts:Ux=" + Ux + ConsoleColors.RESET);
                            System.out.println(ConsoleColors.BLUE + "Integr:ApplyFuncRulesString:IntegrationByParts:DiffUx=" + DiffUx + ConsoleColors.RESET);
                            System.out.println(ConsoleColors.BLUE + "Integr:ApplyFuncRulesString:IntegrationByParts:Vx=" + Vx + ConsoleColors.RESET);
                            System.out.println(ConsoleColors.BLUE + "Integr:ApplyFuncRulesString:IntegrationByParts:DiffVx=" + DiffVx + ConsoleColors.RESET);
                            System.out.println(ConsoleColors.BLUE + "Integr:ApplyFuncRulesString:IntegrationByParts:MyTerm2Str=" + MyTerm2Str + ConsoleColors.RESET);
                            System.out.println(ConsoleColors.BLUE + "Integr:ApplyFuncRulesString:IntegrationByParts:Final Integration:x=" + x + ConsoleColors.RESET);
                        }
                    } else {
                        log.info("Integr:ApplyFuncRulesString:IntegrationByParts:Maths OR This Software does not support :(" + Diff1.IntegrExpr() + ") * (" + Diff2.IntegrExpr() + ")");
                    }
                    log.info("Integr:parseIntegrStr:IntegrationByParts:x=" + x);
                } else if (Rule.equalsIgnoreCase("IntegrationByParts1")) {
                    if (Supported == 1) {
                        // Integral u*Diffv= uv - Integral vDiffu
                        // Integral Ux*DiffV= Ux*IntegralDiffVx - Integral IntegralDiffVx*DiffUx
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseIntegrStr:IntegrationByParts:Rule1 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                        if (StrOperator.equalsIgnoreCase("*")) {
                            String Ux = "";
                            String DiffUx = "";
                            String DiffVx = "";
                            String IntegralDiffVx = "";
                            //Choose Ux 
                            // Choose Vx
                            // Set Ux && Vx Parameters
                            if (Diff1IntegrExpr.contains("Parenthesis")) {
                                Expr_Func_Split_Integr(Diff1IntegrExpr, DiffWithRespTo);
                                Ux = ParanExpr;
                                DiffUx = FactorsDiffExpr;
                                DiffVx = Term4;
                            } else if ((!Diff1IntegrExpr.contains("Parenthesis")) /*&& (Diff1IntegrExpr.equalsIgnoreCase(Term1))*/) {
                                Ux = Term4;
                                //DiffUx=Diff1IntegrExpr;
                                if (!AutoGenSilentFlag) {
                                    System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET: Recursivecall:Start:Diff:IntegrationByParts" + ConsoleColors.RESET);
                                }
                                depthBackUpRestore++;
                                StrKeyBackUpRestore = FileSepBackUpRestore + "Integr:ApplyFuncRulesString:Parenthesis:Diff1IntegrExpr";
                                Map<String, String> variablesBackupState = new HashMap();
                                BackupDiffIntegrStateAll(variablesBackupState);
                                MathsContxtLAv.ChaosPrevention();
                                //MathsContxtLAv.SimpleExpression MyTempTerm1 = MathsContxtLAv.parseSimple(Term1, variables, DiffWithRespTo);
                                //DiffExpr MyUxDash = parseDiff(MyTempTerm1.SimpleExpr(), variables, DiffWithRespTo);
                                MathsContxtLAv.SimpleExpression MyTempTerm1 = (() -> "");
                                Map<String, String> variablesStr = new HashMap<>();
                                //MyTempTerm1 = parseSimple(Ux, variables, DiffWithRespTo, MapType, IntegrORDiffr, true, "Silent", MathsContxtLAv.LogLevel.Info);
                                //MyTempTerm1 = parseSimple(Term1, variablesStr, DiffWithRespTo, "Silent", ExprSimpleStrSep.LogLevel.Info);
                                DiffExpr MyUxDash = parseDiff(Ux, variables, DiffWithRespTo, MapType, IntegrORDiffr);
                                RestoreDiffIntegrStateAll(variablesBackupState);
                                depthBackUpRestore--;
                                StrKeyBackUpRestore = FileSepBackUpRestore;
                                DiffUx = MyUxDash.DiffExpr();
                                if (!AutoGenSilentFlag) {
                                    System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET: Recursivecall:End:Diff:IntegrationByParts" + ConsoleColors.RESET);
                                }
                                log.info("Integr:ApplyFuncRules:IntegrationByParts:Ux=" + Ux + " Term1=" + Term1);
                            }
                            // Set Ux && Vx Parameters
                            IntegrExpr MyTemp2 = (() -> "");
                            if (Diff2IntegrExpr.contains("Parenthesis")) {
                                Expr_Func_Split_Integr(Diff2IntegrExpr, DiffWithRespTo);
                                DiffVx = ParanExpr;
                                if (!AutoGenSilentFlag) {
                                    System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET: Recursivecall:Start:Integre:IntegrationByParts:Vx" + ConsoleColors.RESET);
                                }
                                Map<String, String> variablesBackupState = new HashMap();
                                depthBackUpRestore++;
                                StrKeyBackUpRestore = FileSepBackUpRestore + "Integr:ApplyFuncRulesString:Parenthesis:Vx";
                                BackupDiffIntegrStateAll(variablesBackupState);
                                MathsContxtLAv.ChaosPrevention();
                                //MathsContxtLAv.SimpleExpression MyTemp = MathsContxtLAv.parseSimple(DiffVx, variables, DiffWithRespTo, MapType, IntegrORDiffr, true, "Silent", MathsContxtLAv.LogLevel.Info);
                                //ExprSimpleStrSep.SimpleStr MyTempTerm1 = (() -> "");
                                Map<String, String> variablesStr = new HashMap<>();
                                //MyTempTerm1 = parseSimple(DiffVx, variablesStr, DiffWithRespTo, "Silent", ExprSimpleStrSep.LogLevel.Info);
                                MyTemp2 = DiffrIntegrSep.parseIntegr(DiffVx, variables, DiffWithRespTo, MapType, IntegrORDiffr);
                                RestoreDiffIntegrStateAll(variablesBackupState);
                                depthBackUpRestore--;
                                StrKeyBackUpRestore = FileSepBackUpRestore;
                                IntegralDiffVx = MyTemp2.IntegrExpr();
                                if (!AutoGenSilentFlag) {
                                    System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET: Recursivecall:End:Integre:IntegrationByParts:Vx" + ConsoleColors.RESET);
                                }
                            } else if (!Diff2IntegrExpr.contains("Parenthesis")) {
                                DiffVx = Term2;
                                if (!AutoGenSilentFlag) {
                                    System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET: Recursivecall:Start:Integre:IntegrationByParts:Vx" + ConsoleColors.RESET);
                                }
                                Map<String, String> variablesBackupState = new HashMap();
                                depthBackUpRestore++;
                                StrKeyBackUpRestore = FileSepBackUpRestore + "Integr:ApplyFuncRules:Parenthesis:Vx";
                                BackupDiffIntegrStateAll(variablesBackupState);
                                //MathsContxtLAv.ChaosPrevention();
                                //MathsContxtLAv.SimpleExpression MyTempTerm1 = MathsContxtLAv.parseSimple(DiffVx, variables, DiffWithRespTo, MapType, IntegrORDiffr, true, "Silent", MathsContxtLAv.LogLevel.Info);
                                //ExprSimpleStrSep.SimpleStr MyTempTerm1 = (() -> "");
                                Map<String, String> variablesStr = new HashMap<>();
                                //MyTempTerm1 = parseSimple(DiffVx, variablesStr, DiffWithRespTo, "Silent", ExprSimpleStrSep.LogLevel.Info);
                                MyTemp2 = DiffrIntegrSep.parseIntegr(DiffVx, variables, DiffWithRespTo, MapType, IntegrORDiffr);
                                RestoreDiffIntegrStateAll(variablesBackupState);
                                depthBackUpRestore--;
                                StrKeyBackUpRestore = FileSepBackUpRestore;
                                IntegralDiffVx = MyTemp2.IntegrExpr();
                                if (!AutoGenSilentFlag) {
                                    System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET: Recursivecall:End:Integre:IntegrationByParts:Vx" + ConsoleColors.RESET);
                                }
                            }
                            System.out.println("Integr:ApplyFunc:IntegrationByParts:Ux=" + Ux);
                            System.out.println("Integr:ApplyFunc:IntegrationByParts:DiffUx=" + DiffUx);
                            System.out.println("Integr:ApplyFunc:IntegrationByParts:IntegralDiffVx=" + IntegralDiffVx);
                            System.out.println("Integr:ApplyFunc:IntegrationByParts:DiffVx=" + DiffVx);
                            final String Ux1 = Ux;
                            final String DiffUx1 = DiffUx;
                            final String DiffVx1 = DiffVx;
                            final String IntegralDiffVx1 = IntegralDiffVx;
                            if ((IntegralDiffVx1.isEmpty()) && (!DiffVx1.isEmpty())) {
                                System.out.println(ConsoleColors.RED + "Integr:ApplyFuncString:IntegrationByParts:FORMULA WRONG:Vx" + ConsoleColors.RESET);
                            } else if ((Ux.isEmpty()) && (!DiffUx1.isEmpty())) {
                                System.out.println(ConsoleColors.RED + "Integr:ApplyFuncString:IntegrationByParts:FORMULA WRONG:Ux" + ConsoleColors.RESET);
                            }
                            if (!AutoGenSilentFlag) {
                                System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET: Recursivecall:Start:Integre:IntegrationByParts:Formula" + ConsoleColors.RESET);
                            }
                            Map<String, String> variablesBackupState = new HashMap();
                            depthBackUpRestore++;
                            StrKeyBackUpRestore = FileSepBackUpRestore + "Integr:ApplyFuncString:Parenthesis:Formula";
                            BackupDiffIntegrStateAll(variablesBackupState);
                            //MathsContxtLAv.ChaosPrevention();
                            //MathsContxtLAv.SimpleExpression MyTempTerm2 = MathsContxtLAv.parseSimple("(" + IntegralDiffVx + ")" + "*" + DiffUx1, variables, DiffWithRespTo, MapType, IntegrORDiffr, true, "Silent", MathsContxtLAv.LogLevel.Info);
                            //ExprSimpleStrSep.SimpleStr MyTempTerm1 = (() -> "");
                            //Map<String, String> variablesStr = new HashMap<>();
                            //MyTempTerm1 = parseSimple(DiffVx, variablesStr, DiffWithRespTo, "Silent", ExprSimpleStrSep.LogLevel.Info);
                            IntegrExpr MyTerm2 = (() -> "");
                            MyTemp2 = DiffrIntegrSep.parseIntegr("(" + IntegralDiffVx + ")" + "*" + DiffUx1, variables, DiffWithRespTo, MapType, IntegrORDiffr);
                            final String MyTerm2Str = MyTerm2.IntegrExpr();
                            System.out.println("Integr:ApplyFuncString:IntegrationByParts:SimpleExpr=" + "(" + IntegralDiffVx + ")" + "*" + DiffUx1);
                            //System.out.println("Integr:ApplyFuncString:IntegrationByParts:MyTempTerm2.SimpleExpr()=" + MyTempTerm2.SimpleExpr());
                            System.out.println(ConsoleColors.BLUE + "Integr:ApplyFuncString:IntegrationByParts:Final Formula:MyTerm2Str=" + MyTerm2Str + ConsoleColors.RESET);

                            RestoreDiffIntegrStateAll(variablesBackupState);
                            depthBackUpRestore--;
                            StrKeyBackUpRestore = FileSepBackUpRestore;
                            if (!AutoGenSilentFlag) {
                                System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET: Recursivecall:End:Integre:IntegrationByParts:Formula" + ConsoleColors.RESET);
                            }
                            // Integral u*Diffv= uv - Integral vDiffu
                            // Integral Ux*DiffV= Ux*IntegralDiffVx - Integral IntegralDiffVx*DiffUx

                            x = Ux1 + "*(" + IntegralDiffVx1 + ")-" + MyTerm2Str;
                            log.info("Integr:ApplyFuncString:IntegrationByParts:x=" + x);
                            log.info("Integr:ApplyFuncString:IntegrationByParts:Vx1=" + IntegralDiffVx1);
                            log.info("Integr:ApplyFuncString:IntegrationByParts:DiffUx1=" + DiffUx1);
                            log.info("Integr:ApplyFuncString:IntegrationByParts:DiffVx1=" + DiffVx1);
                            log.info("Integr:ApplyFuncString:IntegrationByParts:Ux1=" + Ux1);
                            System.out.println(ConsoleColors.BLUE + "Integr:ApplyFuncString:IntegrationByParts:Final Formula:x=" + x + ConsoleColors.RESET);

                        }
                    } else {
                        log.info("Integr:ApplyFuncRulesString:IntegrationByParts:Maths OR This Software does not support :(" + Diff1.IntegrExpr() + ") * (" + Diff2.IntegrExpr() + ")");
                    }
                    log.info("Integr:String:parseIntegrStr:IntegrationByParts:x=" + x);
                } else if (Rule.equalsIgnoreCase("IntegrationByPartsBothContainX")) {
                    if (Supported == 1) {
                        if (((Term4.contains(DiffWithRespTo + "^")) && (!Term4.contains("*")) && (!Term4.contains("/")))
                                && ((Term2.contains(DiffWithRespTo + "^")) && (!Term2.contains("*")) && (!Term2.contains("/")))) {
                            IntegrExpr MyTemp2 = (() -> "");
                            Map<String, String> variablesBackupState = new HashMap();
                            depthBackUpRestore++;
                            StrKeyBackUpRestore = FileSepBackUpRestore + "Integr:ApplyFuncRules:IntegrationByPartsBothContainX:";
                            BackupDiffIntegrStateAll(variablesBackupState);
                            MathsContxtLAv.ChaosPrevention();
                            //MathsContxtLAv.SimpleExpression MyTemp = MathsContxtLAv.parseSimple(Term4 + "*" + Term2, variables, DiffWithRespTo);
                            ExprSimpleStrSep.SimpleStr MyTempTerm1 = (() -> "");
                            Map<String, String> variablesStr = new HashMap<>();
                            MyTempTerm1 = parseSimple(Term4 + "*" + Term2, variablesStr, DiffWithRespTo, "Silent", ExprSimpleStrSep.LogLevel.Info);

                            MyTemp2 = DiffrIntegrSep.parseIntegr(MyTempTerm1.evalStr(), variables, DiffWithRespTo, MapType, IntegrORDiffr);
                            RestoreDiffIntegrStateAll(variablesBackupState);
                            depthBackUpRestore--;
                            StrKeyBackUpRestore = FileSepBackUpRestore;
                            log.info("Integr:ApplyFuncRules:IntegrationByPartsBothContainX:MyTemp2.IntegrExpr()=" + MyTemp2.IntegrExpr() + " Diff2IntegrExpr=" + Diff2IntegrExpr + " Diff1IntegrExpr=" + Diff1IntegrExpr);
                            final String MyTemp2Str = MyTemp2.IntegrExpr();
                            x = MyTemp2Str;
                            log.info("Integr:ApplyFuncString:IntegrationByPartsBothContainX:x=" + x);
                            log.info("Integr:ApplyFuncString:IntegrationByPartsBothContainX:Term4=" + Term4);
                            log.info("Integr:ApplyFuncString:IntegrationByPartsBothContainX:Term2=" + Term2);
                            //log.info("Integr:ApplyFuncString:IntegrationByPartsBothContainX:MyTemp.SimpleExpr()=" + MyTempTerm1.evalStr());
                        } else {
                            log.info("Integr:ApplyFuncString:IntegrationByPartsBothContainX:Maths OR This Software does not support :" + Term4 + " * " + Term2);
                        }
                    } else {
                        log.info("Integr:ApplyFuncString:IntegrationByPartsBothContainX:Maths OR This Software does not support :" + Diff1.IntegrExpr() + " * " + Diff2.IntegrExpr());
                    }
                } else if (Rule.equalsIgnoreCase("ProductRule")) {
                    x = parseProductRule();
                    log.info("Integr:String:parseIntegrStr:ProductRule:x=" + x);
                } else if (Rule.equalsIgnoreCase("MappedQuotientRule")) {
                    if (Supported == 1) {
                        if ((!Diff1.IntegrExpr().equalsIgnoreCase(Diff2.IntegrExpr())) && (StrOperator.equalsIgnoreCase("*"))) {
                            String Ux = "";
                            String UDashx = "";
                            String Vx = "";
                            String VDashx = "";
                            // Set Ux Parameters
                            if (Diff1.IntegrExpr().contains("Parenthesis")) {
                                Expr_Func_Split_Integr(Diff1.IntegrExpr(), DiffWithRespTo);
                                Ux = ParanExpr;
                                UDashx = ParanDiffExpr;

                            } else if (!Diff1.IntegrExpr().contains("Parenthesis")) {
                                Ux = Term1;
                                UDashx = Diff2.IntegrExpr();
                            }
                            // Set Vx Parameters
                            if (Diff2.IntegrExpr().contains("Parenthesis")) {
                                Expr_Func_Split_Integr(Diff2.IntegrExpr(), DiffWithRespTo);
                                Vx = ParanExpr;
                                VDashx = ParanDiffExpr;

                            } else if (!Diff2.IntegrExpr().contains("Parenthesis")) {
                                Vx = Term2;
                                VDashx = Diff2.IntegrExpr();
                            }
                            final String Vx1 = Vx;
                            final String UDashx1 = UDashx;
                            final String VDashx1 = VDashx;
                            final String Ux1 = Ux;

                            x = "(" + Vx1 + "*" + UDashx1 + "-" + VDashx1 + "*" + Ux1 + ")" + "/" + Vx1 + "/" + Vx1;
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseIntegrStr:MappedQuotientRule:Only Rule:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                        }
                    } else {
                        log.info("Integr:ApplyFuncRulesString:MappedQuotientRule:Maths OR This Software does not support :(" + Diff1.IntegrExpr() + ") / (" + Diff2.IntegrExpr() + ")");
                    }
                    log.info("Integr:String:parseIntegrStr:MappedQuotientRule:x=" + x);
                } else if (Rule.equalsIgnoreCase("QuotientRule")) {
                    x = parseQuotientRule();
                    log.info("Integr:String:parseIntegrStr:QuotientRule:x=" + x);
                }
                log.info("Integr:String:parseIntegrStr:Final:x=" + x);
                final String y = x;
                return (() -> y);
            }

            String parseNoExponentRuleTerm() {
                String x = "";
                final String Diff1IntegrExpr = Diff1.IntegrExpr();
                final String Diff2IntegrExpr = Diff2.IntegrExpr();
                if (Rule.equalsIgnoreCase("NoExponentRuleTerm")) {
                    if (Term1.equalsIgnoreCase("")) {
                        x = Diff1.IntegrExpr();
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseNoExponentRuleTerm:NoExponentRuleTerm:Rule1 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                    } else {
                        x = Term1;
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseNoExponentRuleTerm:NoExponentRuleTerm:Rule2 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                    }
                }
                log.info("Integr:String:parseNoExponentRuleTerm:Final:x=" + x);
                return x;
            }

            String parseNoExponentRuleDiff() {
                String x = "";
                final String Diff1IntegrExpr = Diff1.IntegrExpr();
                final String Diff2IntegrExpr = Diff2.IntegrExpr();
                if (Rule.equalsIgnoreCase("NoExponentRuleDiff")) {
                    if (Term1.equalsIgnoreCase("")) {
                        x = Diff1.IntegrExpr();
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseNoExponentRuleDiff:NoExponentRuleDiff:Rule1 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                        log.info("Integr:ApplyFuncRulesString:NoExponentRuleDiff:Rule1 :x=" + x);
                    } else if ((Term1.contains(DiffWithRespTo)) && (Term1.contains("ln"))) {
                        x = Term1;
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseNoExponentRuleDiff:NoExponentRuleDiff:Rule2 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                        log.info("Integr:ApplyFuncRulesString:NoExponentRuleDiff:Rule2 :x=" + x);
                    } else if ((Term1.contains(DiffWithRespTo)) && (!Term1.contains("^")) && (DiffTermOperator == '*')) {
                        x = "1.0/2.0" + StrOperator + Term1 + "^2.0";
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseNoExponentRuleDiff:NoExponentRuleDiff:Rule3 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                        log.info("Integr:ApplyFuncRulesString:NoExponentRuleDiff:Rule3 :x=" + x);
                    } else if ((Term1.contains(DiffWithRespTo)) && (!Term1.contains("^")) && (DiffTermOperator == '/')) {
                        x = "ln(" + Term1 + ")";
                        //LADiffTermOperator="*";
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseNoExponentRuleDiff:NoExponentRuleDiff:Rule4 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                        log.info("Integr:ApplyFuncRulesString:NoExponentRuleDiff:Rule4 :x=" + x);
                    } else if ((StrOperator.equalsIgnoreCase("/")) && (DiffTermOperator == '/')) {
                        x = Term1;
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseNoExponentRuleDiff:NoExponentRuleDiff:Rule5 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                        log.info("Integr:ApplyFuncRulesString:NoExponentRuleDiff:Rule5 :x=" + x);
                    } else if (Term1.contains("@Parenthesis@")) {
                        x = Term2;
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseNoExponentRuleDiff:NoExponentRuleDiff:Rule6 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                        log.info("Integr:ApplyFuncRulesString:NoExponentRuleDiff:Rule6 :x=" + x);
                    } else if ((Term4.contains("^")) && (!Term1.contains("^"))) {
                        x = Term4;
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseNoExponentRuleDiff:NoExponentRuleDiff:Rule7 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                        log.info("Integr:ApplyFuncRulesString:NoExponentRuleDiff:Rule6 :x=" + x);
                    } else {
                        x = Term1;
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseNoExponentRuleDiff:NoExponentRuleDiff:Rule8 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                        log.info("Integr:ApplyFuncRulesString:NoExponentRuleDiff:Rule6 :x=" + x);
                    }
                }
                log.info("Integr:String:parseNoExponentRuleDiff:Final:x=" + x);
                return x;
            }

            String parseCoeffExponentRule() {
                String x = "";
                final String Diff1IntegrExpr = Diff1.IntegrExpr();
                final String Diff2IntegrExpr = Diff2.IntegrExpr();
                if (Rule.equalsIgnoreCase("CoeffExponentRule")) {
                    if (!Term4.equalsIgnoreCase("")) {
                        if (Term2.equalsIgnoreCase("0.0")) // x^0.0 -> 1.0
                        {
                            x = Term4 + StrOperator + 1.0;
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseCoeffExponentRule:CoeffExponentRule:Rule1 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                        } else if (Term2.equalsIgnoreCase("1.0")) {
                            x = Term4 + StrOperator + Term3;// x^1.0 -> x
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseCoeffExponentRule:CoeffExponentRule:Rule2 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                        } else {
                            x = Term4 + StrOperator + Term3 + "^" + Term2;
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseCoeffExponentRule:CoeffExponentRule:Rule3 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                        }
                    } else if ((!Term3.equalsIgnoreCase("")) && (!Term3.equalsIgnoreCase("1.0"))) {
                        if (Term2.equalsIgnoreCase("0.0")) {
                            x = "1.0";
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseCoeffExponentRule:CoeffExponentRule:Rule4 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                        } else if (Term2.equalsIgnoreCase("1.0")) {
                            x = Term3;
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseCoeffExponentRule:CoeffExponentRule:Rule5 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                        } else {
                            x = Term3 + "^" + Term2;
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseCoeffExponentRule:CoeffExponentRule:Rule6 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                        }
                    } else {
                        x = Term1;
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseCoeffExponentRule:CoeffExponentRule:Rule7 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                    }
                }
                log.info("Integr:String:parseCoeffExponentRule:Final:x=" + x);
                return x;
            }

            String parseConstantRule() {
                String x = "";
                final String Diff1IntegrExpr = Diff1.IntegrExpr();
                final String Diff2IntegrExpr = Diff2.IntegrExpr();
                if (Rule.equalsIgnoreCase("ConstantRule")) {
                    if (((Term1 != null) && (!Term1.equalsIgnoreCase("")))
                            && ((Term2 != null) && (!Term2.equalsIgnoreCase("")))
                            && (Term1.equalsIgnoreCase(Term2))
                            && (Diff1.IntegrExpr().equalsIgnoreCase(Diff2.IntegrExpr()))
                            && (Term1.equalsIgnoreCase(Diff1.IntegrExpr()))
                            && (Term1.equalsIgnoreCase(DiffWithRespTo)) && (!IsAConstant(Term1, DiffWithRespTo))) {
                        x = "1.0";
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseConstantRule:ConstantRule:Rule1 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                        log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule1 :x=" + x);
                    } else if (((Term1 != null) && (!Term1.equalsIgnoreCase(""))) && (!IsAConstant(Term1, DiffWithRespTo))) {
                        if (Term3.equalsIgnoreCase("")) {
                            log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule2.1 :SavedOperator=" + (char) SavedOperator);
                            if (((SavedOperator == '*') || (SavedOperator == 0) || (SavedOperator == -1)) && (!StrOperator.equalsIgnoreCase("\\+")) && (!StrOperator.equalsIgnoreCase("-"))) {
                                if ((SavedOperator == '*')) {
                                    x = Term1 + (char) SavedOperator + Term2;
                                    ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseConstantRule:ConstantRule:Rule2.1.1 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                                    log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule2.1.1 :x=" + x);
                                } else if (((SavedOperator == 0) || (SavedOperator == -1)) && (Term1.equalsIgnoreCase(DiffWithRespTo))) {
                                    if ((StrOperator.equalsIgnoreCase("*")) && (!IsAConstant(Term2, DiffWithRespTo)) && (!StrIsAConstant.equalsIgnoreCase("Number"))) {
                                        x = Term2 + "/2.0" + "*" + Term1 + "^2.0";
                                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseConstantRule:ConstantRule:Rule2.1.2.1.1 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                                    } else if ((StrOperator.equalsIgnoreCase("*")) && (IsAConstant(Term2, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                                        x = Term2 + "*" + DiffWithRespTo;
                                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseConstantRule:ConstantRule:Rule2.1.2.1.2 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                                    } else {
                                        if (Term2.equalsIgnoreCase("1.0")) {
                                            x = "ln(" + Term1 + ")";
                                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseConstantRule:ConstantRule:Rule2.1.2.2 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                                        } else {
                                            x = Term2 + "*" + "ln(" + Term1 + ")";
                                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseConstantRule:ConstantRule:Rule2.1.2.3 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                                        }
                                    }
                                    log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule2.1.2 :x=" + x);
                                } else {
                                    if (Term1.startsWith("1.0")) {
                                        final String Temp = Term1.replaceFirst("1.0", "");
                                        x = Term2 + Temp;
                                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseConstantRule:ConstantRule:Rule2.1.3.1 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                                        log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule2.1.3.1 :x=" + x);
                                    } else if (((SavedOperator == 0) || (SavedOperator == -1)) && (!Term1.equalsIgnoreCase(Diff2.IntegrExpr()))) {
                                        x = Diff1.IntegrExpr();
                                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseConstantRule:ConstantRule:Rule2.1.3.2 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                                        log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule2.1.3.2 :x=" + x);
                                    } else if (((SavedOperator == 0) || (SavedOperator == -1))
                                            && (Term1.equalsIgnoreCase(Diff2.IntegrExpr()))
                                            && (!IsAConstant(Term1, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("VarExpression"))) {
                                        if (Term1.startsWith("/")) {
                                            x = Term2 + Term1;
                                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseConstantRule:ConstantRule:Rule2.1.3.3.2.1 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                                            log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule2.1.3.3.1 :x=" + x);
                                        } else if (StrOperator.equalsIgnoreCase("*")) {
                                            x = Term2 + "*" + Term1;
                                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseConstantRule:ConstantRule:Rule2.1.3.3.2.2 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                                            log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule2.1.3.3.2 :x=" + x);
                                        } else if (StrOperator.equalsIgnoreCase("/")) {
                                            x = Term2 + "/" + Term1;
                                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseConstantRule:ConstantRule:Rule2.1.3.3.2.3 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                                            log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule2.1.3.3.2 :x=" + x);
                                        } else {
                                            x = Term2 + "*" + Term1;
                                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseConstantRule:ConstantRule:Rule2.1.3.3.3.4 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                                            log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule2.1.3.3.2 :x=" + x);
                                        }
                                        log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule2.1.3.3 :x=" + x);
                                    } else if (((SavedOperator == 0) || (SavedOperator == -1)) && (Term1.equalsIgnoreCase(Diff2IntegrExpr)) && (!IsAConstant(Term1, DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                                        x = Term2 + StrOperator + Term1;
                                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseConstantRule:ConstantRule:Rule2.1.3.4 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                                        log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule2.1.3.4 :x=" + x);
                                    } else if (((SavedOperator == 0) || (SavedOperator == -1)) && (Term1.equalsIgnoreCase(Diff2IntegrExpr))) {
                                        x = Term2;
                                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseConstantRule:ConstantRule:Rule2.1.3.5 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                                        log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule2.1.3.5 :x=" + x);
                                    } else {
                                        x = Term2 + "*" + Term1;
                                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseConstantRule:ConstantRule:Rule2.1.3.6 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                                        log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule2.1.3.6 :x=" + x);
                                    }
                                    log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule2.1.3 :x=" + x);
                                }
                            } else if ((!StrOperator.equalsIgnoreCase("\\+")) && (!StrOperator.equalsIgnoreCase("-"))) {
                                x = Term1 + StrOperator + Term2;
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseConstantRule:ConstantRule:Rule2.1.3.7 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                            }
                            log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule2.1 :x=" + x);
                        } else if (Term2.equalsIgnoreCase(DiffWithRespTo)) {
                            x = Diff1.IntegrExpr() + StrOperator + Term2 + "^2.0*1.0/2.0" + Term3;
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseConstantRule:ConstantRule:Rule2.2 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                            log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule2.2 :x=" + x);
                        } else if (Diff1.IntegrExpr().equalsIgnoreCase(Term2)) {
                            if ((Term1.equalsIgnoreCase(Diff2.IntegrExpr())) && (Term1.equalsIgnoreCase(DiffWithRespTo))) {
                                if ((IsAConstant(Term3, DiffWithRespTo)) && (!Term2.contains(Term3))) {
                                    x = Diff1.IntegrExpr() + Term3 + StrOperator + Diff2.IntegrExpr() + "^2.0*1.0/2.0";
                                    ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseConstantRule:ConstantRule:Rule2.3.1.A :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                                    log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule2.3.1.A :x=" + x);
                                } else {
                                    x = Diff1.IntegrExpr() + StrOperator + Diff2.IntegrExpr() + "^2.0*1.0/2.0";
                                    ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseConstantRule:ConstantRule:Rule2.3.1.B :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                                    log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule2.3.1.B :x=" + x);
                                }
                            } else if (Term1.equalsIgnoreCase(Diff2IntegrExpr)) {
                                if (((Term3.startsWith("*")) || (Term3.startsWith("/")))
                                        && (Term2.equalsIgnoreCase(Diff1IntegrExpr))
                                        && (!IsAConstant(Term2, DiffWithRespTo))
                                        && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))
                                        && (!IsAConstant(Term1, DiffWithRespTo))
                                        && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                                    x = Term2 + StrOperator + Term1;
                                    ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseConstantRule:ConstantRule:Rule2.3.1.A.1 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                                    log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule2.3.1.A.1 :x=" + x);
                                } else if ((Term1.equalsIgnoreCase("")) && ((Term3.startsWith("*")) || (Term3.startsWith("/")))
                                        && (Term2.equalsIgnoreCase(Diff1IntegrExpr))
                                        && (!IsAConstant(Term2, DiffWithRespTo))
                                        && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                                    x = "1.0" + Term3 + StrOperator + Diff2IntegrExpr;
                                    ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseConstantRule:ConstantRule:Rule2.3.1.A.2 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                                    log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule2.3.1.A.2 :x=" + x);
                                } else if (((Term3.startsWith("*")) || (Term3.startsWith("/")))
                                        && (Term2.equalsIgnoreCase(Diff1IntegrExpr))
                                        && (!IsAConstant(Term2, DiffWithRespTo))
                                        && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))
                                        && (!IsAConstant(Term1, DiffWithRespTo))
                                        && ((StrIsAConstant.equalsIgnoreCase("Var")) || (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
                                    x = Term2 + StrOperator + Term1;
                                    ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseConstantRule:ConstantRule:Rule2.3.1.A.3 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                                    log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule2.3.1.A.3 :x=" + x);
                                } else if ((!IsAConstant(Term3, DiffWithRespTo))
                                        && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))
                                        && (Term2.contains(Term3))) {
                                    x = Term2;
                                    ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseConstantRule:ConstantRule:Rule2.3.1.A.3 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                                    log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule2.3.1.A.3 :x=" + x);
                                }
                                log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule2.3.1 :x=" + x);
                            } else {
                                x = Diff1.IntegrExpr() + StrOperator + Diff2.IntegrExpr();
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseConstantRule:ConstantRule:Rule2.3.2 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                                log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule2.3.2 :x=" + x);
                            }
                        } else {
                            x = Diff1.IntegrExpr() + StrOperator + Term2 + Term3;
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseConstantRule:ConstantRule:Rule2.4 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                            log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule2.4 :x=" + x);
                        }
                        log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule2 :x=" + x);
                    } else if (((Term1 != null) && (!Term1.equalsIgnoreCase(""))) && (Term2.equalsIgnoreCase(Diff2.IntegrExpr()))) {
                        x = Diff1.IntegrExpr();
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseConstantRule:ConstantRule:Rule3 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                        log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule3 :x=" + x);
                    } else if ((IsAConstant(Diff1.IntegrExpr(), DiffWithRespTo)) || ((!IsAConstant(Diff1.IntegrExpr(), DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) && (IsAConstant(Diff2.IntegrExpr(), DiffWithRespTo))) {
                        if (((SavedOperator == 0) || (SavedOperator == -1)) && (!IsAConstant(Diff2.IntegrExpr(), DiffWithRespTo))) {
                            x = Diff1.IntegrExpr();
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseConstantRule:ConstantRule:Rule4.1 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                            log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule4.1 :x=" + x);
                        } else if (((SavedOperator == 0) || (SavedOperator == -1))
                                && (Term1.equalsIgnoreCase(Diff2.IntegrExpr()))
                                && (IsAConstant(Diff2.IntegrExpr(), DiffWithRespTo))
                                && (!IsAConstant(Term2, DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))
                                && (Term2.contains(Term3)) && (Term2.contains(Term1))) {
                            if ((Diff1IntegrExpr.equalsIgnoreCase(Diff2IntegrExpr)) && (Term3.equalsIgnoreCase(""))) {
                                x = Term2;
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseConstantRule:ConstantRule:Rule4.2.1 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                                log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule4.2.1 :x=" + x);
                            } else if (!Term3.equalsIgnoreCase("")) {
                                x = "1.0" + Term3 + StrOperator + Term1;
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseConstantRule:ConstantRule:Rule4.2.2 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                                log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule4.2.2 :x=" + x);
                            } else if ((Term3.equalsIgnoreCase("")) && (!IsAConstant(Term2, DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression"))) && (Term2.contains(Diff2IntegrExpr))) {
                                x = Diff1IntegrExpr + StrOperator + DiffWithRespTo;
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseConstantRule:ConstantRule:Rule4.2.3 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                                log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule4.2.3 :x=" + x);
                            }
                            log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule4.2 :x=" + x);
                        } else if (((SavedOperator == 0) || (SavedOperator == -1)) && (Term1.equalsIgnoreCase(Diff2.IntegrExpr())) && (IsAConstant(Diff2.IntegrExpr(), DiffWithRespTo)) && (!IsAConstant(Term2, DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                            x = Term2 + StrOperator + Term1;
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseConstantRule:ConstantRule:Rule4.3 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                            log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule4.3 :x=" + x);
                        } else if (((SavedOperator == 0) || (SavedOperator == -1)) && (Term1.equalsIgnoreCase(Diff2.IntegrExpr())) && (IsAConstant(Diff2.IntegrExpr(), DiffWithRespTo))) {
                            x = "1.0" + Term3 + StrOperator + Term1;
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseConstantRule:ConstantRule:Rule4.4 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                            log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule4.4 :x=" + x);
                        } else {
                            x = Diff1.IntegrExpr() + StrOperator + Diff2.IntegrExpr();
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseConstantRule:ConstantRule:Rule4.5 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                            log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule4.5 :x=" + x);
                        }
                        log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule4 :x=" + x);
                    } else if ((IsAConstant(Diff1.IntegrExpr(), DiffWithRespTo)) || ((!IsAConstant(Diff1.IntegrExpr(), DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) && (IsAConstant(Diff2.IntegrExpr(), DiffWithRespTo))) {
                        x = Diff1.IntegrExpr() + StrOperator + Diff2.IntegrExpr();
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseConstantRule:ConstantRule:Rule5 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                        log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule5 :x=" + x);
                    } else if ((!IsAConstant(Diff2.IntegrExpr(), DiffWithRespTo)) && (!StrIsAConstant.equalsIgnoreCase("Unknown"))) {
                        x = Term2;
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseConstantRule:ConstantRule:Rule6 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                        log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule6 :x=" + x);
                    } else if ((!IsAConstant(Diff1.IntegrExpr(), DiffWithRespTo)) && (!StrIsAConstant.equalsIgnoreCase("Unknown"))) {
                        x = Diff1.IntegrExpr();
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseConstantRule:ConstantRule:Rule7 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                        log.info("Integr:ApplyFuncString_ConstantRules:ConstantRule :Rule7 :x=" + x);
                    }
                }
                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseConstantRule:ConstantRule:Final :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                log.info("Integr:String:parseConstantRule:Final:x=" + x);
                return x;
            }

            String parseSumRule() {
                String x = "";
                final String Diff1IntegrExpr = Diff1.IntegrExpr();
                final String Diff2IntegrExpr = Diff2.IntegrExpr();
                if ((Rule.equalsIgnoreCase("SumRule"))
                        || (Rule.equalsIgnoreCase("SubtractionRule"))) {
                    if ((!Diff1IntegrExpr.equalsIgnoreCase("")) && (!Diff2IntegrExpr.equalsIgnoreCase("")) && (!Diff2IntegrExpr.equalsIgnoreCase(Term2)) && (Term3.equalsIgnoreCase(""))) {
                        if (Diff2.IntegrExpr().contains(DiffWithRespTo)) {
                            if ((Diff2IntegrExpr.startsWith("-"))) {
                                x = Diff1IntegrExpr + Diff2IntegrExpr;
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseSumRule:SumRule:SubtractionRule:Rule1.1.1:", Rule, LowLevelRules, false, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                            } else if ((Diff2IntegrExpr.startsWith("+"))) {
                                x = Diff1IntegrExpr + Diff2IntegrExpr;
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseSumRule:SumRule:SubtractionRule:Rule1.1.2:", Rule, LowLevelRules, false, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                            } else {
                                x = Diff1IntegrExpr + StrOperator + Diff2IntegrExpr;
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseSumRule:SumRule:SubtractionRule:Rule1.1.3:", Rule, LowLevelRules, false, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                            }
                            log.info("Integr:ApplyFuncString_SumSubRules:SumRule or SubtractionRule :Rule1.1 :x=" + x);
                        } else if ((IsAConstant(Diff2IntegrExpr, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("NumberExpression"))) {
                            if (Diff2IntegrExpr.startsWith("1.0")) {
                                // Integrate Term
                                // Inserting Constant in the Middle of an Integral
                                final String TempDiff2IntegrExpr = Diff2IntegrExpr.replaceFirst("1.0", "");
                                String TempTerm2 = "";
                                if ((Term2.startsWith("1.0")) && (Term2.contains(DiffWithRespTo + "^"))) {
                                    String[] DataTempTerm2 = Term2.split("[\\*/]");
                                    System.out.println("Integr:ApplyFuncString_SumSubRules:SumRule or SubtractionRule :Rule1.2.1:DataTempTerm2[0]=" + DataTempTerm2[0] + " DataTempTerm2[1]=" + DataTempTerm2[1] + " DataTempTerm2[2]=" + DataTempTerm2[2]);
                                    if ((Term2.contains("\\*")) && (Term2.contains("*" + DataTempTerm2[1]))) {
                                        TempTerm2 = DataTempTerm2[0] + TempDiff2IntegrExpr + "*" + DataTempTerm2[1];
                                    }
                                    if ((Term2.contains("/")) && (Term2.contains("/" + DataTempTerm2[1]))) {
                                        TempTerm2 = DataTempTerm2[0] + TempDiff2IntegrExpr + "/" + DataTempTerm2[1];
                                    }
                                    if ((Term2.contains("*")) && (DataTempTerm2[2].contains(DiffWithRespTo + "^")) && (Term2.contains("*" + DataTempTerm2[2]))) {
                                        String StrDataTemp = DataTempTerm2[2].replaceFirst((DiffWithRespTo + "\\^"), "");
                                        System.out.println("Integr:ApplyFuncString_SumSubRules:SumRule or SubtractionRule :Rule1.2.1:StrDataTemp=" + StrDataTemp);
                                        double j = Double.parseDouble(StrDataTemp) + 1;
                                        TempTerm2 = TempTerm2 + "*" + DiffWithRespTo + "^" + j;
                                    }
                                    if ((Term2.contains("/")) && (DataTempTerm2[2].contains(DiffWithRespTo + "^")) && (Term2.contains("/" + DataTempTerm2[2]))) {
                                        String StrDataTemp = DataTempTerm2[2].replaceFirst((DiffWithRespTo + "\\^"), "");
                                        System.out.println("Integr:ApplyFuncString_SumSubRules:SumRule or SubtractionRule :Rule1.2.1:StrDataTemp=" + StrDataTemp);
                                        double j = Double.parseDouble(StrDataTemp) - 1;
                                        TempTerm2 = TempTerm2 + "/" + DiffWithRespTo + "^" + j;
                                    }
                                }
                                final String TempTerm3 = TempTerm2;
                                x = Diff1IntegrExpr + StrOperator + TempTerm3;
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseSumRule:SumRule:SubtractionRule:Rule1.2.1 :", Rule, LowLevelRules, false, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + (char) TermOperator, x);
                                log.info("Integr:ApplyFuncString_SumSubRules:SumRule or SubtractionRule :Rule1.2.1 :x=" + x);
                            }
                        } else {
                            x = Diff1IntegrExpr + StrOperator + Diff2IntegrExpr + "*" + DiffWithRespTo;
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseSumRule:SumRule:SubtractionRule:Rule1.2.2 :", Rule, LowLevelRules, false, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                            log.info("Integr:ApplyFuncString_SumSubRules:SumRule or SubtractionRule :Rule1.2.2 :x=" + x);
                        }
                        log.info("Integr:ApplyFuncString_SumSubRules:SumRule or SubtractionRule :Rule1 :x=" + x);
                    } else if ((!Term1.equalsIgnoreCase("")) && (!Term2.equalsIgnoreCase("")) && (!Diff2IntegrExpr.equalsIgnoreCase(Term2)) && (Term3.equalsIgnoreCase(""))) {
                        x = Term1 + StrOperator + Term2;
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseSumRule:SumRule:SubtractionRule:Rule2 :", Rule, LowLevelRules, false, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                        log.info("Integr:ApplyFuncString_SumSubRules:SumRule or SubtractionRule :Rule2 :x=" + x);
                    } else if ((!Diff2IntegrExpr.equalsIgnoreCase(Term2)) && (Term3.equalsIgnoreCase(""))) {
                        x = Diff1IntegrExpr;
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseSumRule:SumRule:SubtractionRule:Rule3 :", Rule, LowLevelRules, false, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                        log.info("Integr:ApplyFuncString_SumSubRules:SumRule or SubtractionRule :Rule3 :x=" + x);
                    } else if ((!Term2.contains(DiffWithRespTo)) && (IsAConstant(Term2, DiffWithRespTo))) {
                        x = Diff1IntegrExpr + StrOperator + Diff2IntegrExpr;
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseSumRule:SumRule:SubtractionRule:Rule5 :", Rule, LowLevelRules, false, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                        log.info("Integr:ApplyFuncString_SumSubRules:SumRule or SubtractionRule :Rule5 :x=" + x);
                    } else if ((!IsAConstant(Diff2IntegrExpr, DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstantExpression")) || (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
                        if (Diff2IntegrExpr.equalsIgnoreCase(Term2 + "*" + DiffWithRespTo)) {
                            x = Diff1IntegrExpr + StrOperator + Term2 + "*" + DiffWithRespTo;
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseSumRule:SumRule:SubtractionRule:Rule6A :", Rule, LowLevelRules, false, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                            log.info("Integr:ApplyFuncString_SumSubRules:SumRule or SubtractionRule :Rule6A :x=" + x);
                        } else if (Diff2IntegrExpr.equalsIgnoreCase(Term2 + "*" + DiffWithRespTo)) {
                            x = Diff1IntegrExpr + StrOperator + Term2 + "*" + DiffWithRespTo + "^2.0" + "*1.0/2.0";
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseSumRule:SumRule:SubtractionRule:Rule6B :", Rule, LowLevelRules, false, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                            log.info("Integr:ApplyFuncString_SumSubRules:SumRule or SubtractionRule :Rule6B :x=" + x);
                        } else if (!Diff2IntegrExpr.contains(DiffWithRespTo)) {
                            x = Term1 + StrOperator + Diff2IntegrExpr + "*" + DiffWithRespTo;
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseSumRule:SumRule:SubtractionRule:Rule6C :", Rule, LowLevelRules, false, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                            log.info("Integr:ApplyFuncString_SumSubRules:SumRule or SubtractionRule :Rule6C :x=" + x);
                        } else {
                            if ((IsAConstant(Diff2IntegrExpr, DiffWithRespTo)) || ((!IsAConstant(Diff2IntegrExpr, DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression"))))) {
                                x = Diff1IntegrExpr + StrOperator + Diff2IntegrExpr + "*" + DiffWithRespTo;
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseSumRule:SumRule:SubtractionRule:Rule6D.1 :", Rule, LowLevelRules, false, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                                log.info("Integr:ApplyFuncString_SumSubRules:SumRule or SubtractionRule :Rule6D.1 :x=" + x);
                            } else {
                                x = Diff1IntegrExpr + StrOperator + Diff2IntegrExpr;
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseSumRule:SumRule:SubtractionRule:Rule6D.2:", Rule, LowLevelRules, false, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                                log.info("Integr:ApplyFuncString_SumSubRules:SumRule or SubtractionRule :Rule6D.2 :x=" + x);
                            }
                            log.info("Integr:ApplyFuncString_SumSubRules:SumRule or SubtractionRule :Rule6D :x=" + x);
                        }
                        log.info("Integr:ApplyFuncString_SumSubRules:SumRule or SubtractionRule :Rule6 :x=" + x);
                    } else if ((!Term1.equalsIgnoreCase("")) && (!Term2.equalsIgnoreCase(""))) {
                        if ((IsAConstant(Term2, DiffWithRespTo)) || ((!IsAConstant(Term2, DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression"))))) {
                            x = Term1 + StrOperator + Term2 + "*" + DiffWithRespTo;
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseSumRule:SumRule:SubtractionRule:Rule7A.1:", Rule, LowLevelRules, false, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                            log.info("Integr:ApplyFuncString_SumSubRules:SumRule or SubtractionRule :Rule7A.1 :x=" + x);
                        } else {
                            x = Term1 + StrOperator + Term2;
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseSumRule:SumRule:SubtractionRule:Rule7A.2 :", Rule, LowLevelRules, false, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                            log.info("Integr:ApplyFuncString_SumSubRules:SumRule or SubtractionRule :Rule7A.2 :x=" + x);
                        }
                        log.info("Integr:ApplyFuncString_SumSubRules:SumRule or SubtractionRule :Rule7 :x=" + x);
                    }
                    //Drops Term2 && Diff2.IntegrExpr()
                }
                log.info("Integr:String:parseCoeffExponentRule:Final:x=" + x);
                return x;
            }

            String parseProductRule() {
                String x = "";
                final String Diff1IntegrExpr = Diff1.IntegrExpr();
                final String Diff2IntegrExpr = Diff2.IntegrExpr();
                if (Rule.equalsIgnoreCase("ProductRule")) {
                    if (!Term3.equalsIgnoreCase("")) {
                        ;//x = Term3 + "*" + Diff1.IntegrExpr() + "+" + Term1 + "*" + Diff2.IntegrExpr();
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseProductRule:ProductRule:Rule1:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                        log.info("Integr:ApplyFuncString_ProductRules:ProductRule:Maths OR This Software does not support :" + Term3);
                        log.info("Integr:ApplyFuncString_ProductRules:Rule1 :x=" + x);
                    } else if ((Diff1IntegrExpr.equalsIgnoreCase(DiffWithRespTo)) && (Term2.equalsIgnoreCase("(" + Term1 + ")"))) {
                        //Differentiation of x term:
                        x = Diff2IntegrExpr;
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseProductRule:ProductRule:Rule1.A:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                        log.info("Integr:ApplyFuncString_ProductRules:Rule2 :x=" + x);
                    } else if (Diff1IntegrExpr.equalsIgnoreCase(DiffWithRespTo)) {
                        //Differentiation of x term:
                        x = "1.0" + "/2.0" + "*" + Term2 + "*" + DiffWithRespTo + "^" + "2.0";
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseProductRule:ProductRule:Rule2:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                        log.info("Integr:ApplyFuncString_ProductRules:Rule2 :x=" + x);
                    } else if ((Diff2IntegrExpr.equalsIgnoreCase(DiffWithRespTo)) && (IsAConstant(Diff1IntegrExpr, DiffWithRespTo))) {
                        //Differentiation of x term:
                        x = Diff1IntegrExpr + "/2.0" + "*" + DiffWithRespTo + "^" + "2.0";
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseProductRule:ProductRule:Rule3:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                        log.info("Integr:ApplyFuncString_ProductRules:Rule3 :x=" + x);
                    } else if ((Diff2IntegrExpr.equalsIgnoreCase(DiffWithRespTo)) && (IsAConstant(Diff1IntegrExpr, DiffWithRespTo))) {
                        //Differentiation of x term with Independent Constant:
                        x = Diff1IntegrExpr + "/2.0" + "*" + DiffWithRespTo + "^" + "2.0";
                        //x = Diff1.IntegrExpr();
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseProductRule:ProductRule:Rule4:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                        log.info("Integr:ApplyFuncString_ProductRules:Rule4 :x=" + x);
                    } else if (!Diff1IntegrExpr.equalsIgnoreCase("")) {
                        if ((((IsAConstant(Diff1IntegrExpr, DiffWithRespTo))
                                || ((!IsAConstant(Diff1IntegrExpr, DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("Unknown")))))
                                && (IsAConstant(Diff2IntegrExpr, DiffWithRespTo))
                                || ((!IsAConstant(Diff2IntegrExpr, DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("Unknown")))))) {
                            if (Diff1IntegrExpr.contains("@IndependentFactor@")) {
                                Split(Diff1IntegrExpr, DiffWithRespTo);
                                final String TempStrDiff1 = FactorsDiffExpr;
                                x = TempStrDiff1;
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseProductRule:ProductRule:Rule5A.1:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                            } else if (Diff2IntegrExpr.equalsIgnoreCase(DiffWithRespTo)) {
                                x = Diff1IntegrExpr + "*" + Diff2IntegrExpr + "^2.0";
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseProductRule:ProductRule:Rule5A.2:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                            } else if (Term2.equalsIgnoreCase("(" + Term1 + ")")) {
                                x = Diff1IntegrExpr + "*" + Term2;
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseProductRule:ProductRule:Rule5A.3:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                            } else {
                                x = Diff1IntegrExpr + "*" + Diff2IntegrExpr + "*" + DiffWithRespTo;
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseProductRule:ProductRule:Rule5A.4:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                            }
                            log.info("Integr:ApplyFuncString_ProductRules:Rule5A :x=" + x);
                        } else {
                            if ((Diff2IntegrExpr.startsWith("1.0*")) || (Diff2IntegrExpr.startsWith("1.0/"))) {
                                String Temp = Diff2IntegrExpr.replaceFirst("1.0", "");
                                if ((Diff1.IntegrExpr().endsWith("/")) && (Term1.startsWith("/"))) {
                                    String Temp1 = Diff1IntegrExpr.replaceFirst("/", "");
                                    x = Temp1 + Term1 + Temp;
                                    ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseProductRule:ProductRule:Rule5B.1:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                                    log.info("Integr:ApplyFuncString_ProductRules:Rule5B.1 :x)=" + x);
                                } else if (Diff1IntegrExpr.endsWith("/")) {
                                    String Temp1 = Diff1IntegrExpr.replaceFirst("/", "");
                                    x = Temp1 + Temp;
                                    ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseProductRule:ProductRule:Rule5B.2:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                                    log.info("Integr:ApplyFuncString_ProductRules:Rule5B.2 :x=" + x);
                                } //Need to uncomment the below code
                                else {
                                    if ((Term1.startsWith("/")) && (Diff1IntegrExpr.startsWith("1.0" + Term1))) {
                                        x = "1.0" + Term1 + Temp;
                                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseProductRule:ProductRule:Rule5B.3.A.1:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                                    } else if ((!Term1.equalsIgnoreCase("")) && (!Diff1IntegrExpr.contains(Term1))) {
                                        x = Diff1IntegrExpr + Term1 + Temp;
                                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseProductRule:ProductRule:Rule5B.3.A:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                                        log.info("Integr:ApplyFuncString_ProductRules:Rule5B.3.A :x=" + x);
                                    } else {
                                        if ((Temp.startsWith("/")) || (Temp.startsWith("*"))) {
                                            x = Diff1IntegrExpr + Temp;
                                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseProductRule:ProductRule:Rule5B.3.B.1:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                                        } else {
                                            x = Diff1IntegrExpr + StrOperator + Temp;
                                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseProductRule:ProductRule:Rule5B.3.B.2:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                                        }
                                        log.info("Integr:ApplyFuncString_ProductRules:Rule5B.3.B :x=" + x);
                                    }
                                }
                            } else if ((!IsAConstant(Diff1IntegrExpr, DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression"))) && (Term1.startsWith("/")) && (Diff2IntegrExpr.contains(DiffWithRespTo))) {
                                x = Diff1IntegrExpr + "*" + Diff2IntegrExpr;
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseProductRule:ProductRule:Rule5C:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                                log.info("Integr:ApplyFuncString_ProductRules:Rule5C :x=" + x);
                            } else if ((Diff1IntegrExpr.contains("*2.0")) && (Diff2IntegrExpr.contains(DiffWithRespTo + "^2.0"))) {
                                x = Diff1IntegrExpr + "/2.0" + "*" + Diff2IntegrExpr;
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseProductRule:ProductRule:Rule5D:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                                log.info("Integr:ApplyFuncString_ProductRules:Rule5D :x=" + x);
                            } else {
                                x = Diff1IntegrExpr + "*" + Diff2IntegrExpr;
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseProductRule:ProductRule:Rule5E:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                                log.info("Integr:ApplyFuncString_ProductRules:Rule5E :x=" + x);
                            }
                        }
                        log.info("Integr:ApplyFuncString_ProductRules:Rule5 :x=" + x);
                    }
                }
                log.info("Integr:String:parseProductRule:Final:x=" + x);
                return x;
            }

            String parseQuotientRule() {
                String x = "";
                final String Diff1IntegrExpr = Diff1.IntegrExpr();
                final String Diff2IntegrExpr = Diff2.IntegrExpr();
                if (Rule.equalsIgnoreCase("QuotientRule")) {
                    if (!Term3.equalsIgnoreCase("")) {
                        x = "(" + Term2 + "*" + Diff1IntegrExpr + "-" + Term1 + "*" + Diff2IntegrExpr + "/" + "(" + Term2 + "*" + Term2 + ")" + ")";
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseQuotientRule:QuotientRule:Rule1:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                        log.info("Integr:ApplyFuncString_QuotientRules:QuotientRule:Rule1 :x=" + x);
                    } else if ((!Diff1IntegrExpr.equalsIgnoreCase("")) && (Diff2IntegrExpr.equalsIgnoreCase(DiffWithRespTo))) {
                        if (Diff1IntegrExpr.equalsIgnoreCase("1.0")) {
                            x = "ln(" + DiffWithRespTo + ")";
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseQuotientRule:QuotientRule:Rule2A:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                            log.info("Integr:ApplyFuncString_QuotientRules:QuotientRule:Rule2A :x)=" + x);
                        } else {
                            x = Diff1IntegrExpr + "*" + "ln(" + DiffWithRespTo + ")";
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseQuotientRule:QuotientRule:Rule2B:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                            log.info("Integr:ApplyFuncString_QuotientRules:QuotientRule:Rule2B :x=" + x);
                        }
                        log.info("Integr:ApplyFuncString_QuotientRules:QuotientRule:Rule2 :x=" + x);
                    } else if ((!Diff1IntegrExpr.equalsIgnoreCase("")) && (!Diff1IntegrExpr.equalsIgnoreCase("1.0"))) {
                        if (Diff2IntegrExpr.startsWith("1.0")) {
                            String Temp = Diff2IntegrExpr.replaceFirst("1.0", "");
                            if ((Term2.equalsIgnoreCase(Diff2IntegrExpr)) && (!Term1.equalsIgnoreCase(""))) {
                                x = "1.0" + Term1 + Temp;
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseQuotientRule:QuotientRule:Rule3A.1:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                            } else {
                                x = Diff1IntegrExpr + Temp;
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseQuotientRule:QuotientRule:Rule3A.2:", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                            }
                            log.info("Integr:ApplyFuncString_QuotientRules:QuotientRule:Rule3A :x=" + x);
                        } else if (!IsAConstant(Diff2IntegrExpr, DiffWithRespTo)) {
                            if (Diff2IntegrExpr.startsWith(StrOperator)) {
                                x = Diff1IntegrExpr + Diff2IntegrExpr;
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseQuotientRule:QuotientRule:Rule3B.1 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                                log.info("Integr:ApplyFuncString_QuotientRules:QuotientRule:Rule3B.1 :x=" + x);
                            } else if (Diff2IntegrExpr.contains("ln(")) {
                                x = Diff1IntegrExpr + "*" + Diff2IntegrExpr;
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseQuotientRule:QuotientRule:Rule3B.2 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                                log.info("Integr:ApplyFuncString_QuotientRules:QuotientRule:Rule3B.2 :x=" + x);
                            } else {
                                x = Diff1IntegrExpr + StrOperator + Diff2IntegrExpr;
                                ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseQuotientRule:QuotientRule:Rule3B.3 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                                log.info("Integr:ApplyFuncString_QuotientRules:QuotientRule:Rule3B.2 :x=" + x);
                            }
                            log.info("Integr:ApplyFuncString_QuotientRules:QuotientRule:Rule3B :x=" + x);
                        } else {
                            x = Diff1IntegrExpr + StrOperator + Diff2IntegrExpr;
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseQuotientRule:QuotientRule:Rule3C :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                            log.info("Integr:ApplyFuncString_QuotientRules:QuotientRule:Rule3C :x=" + x);
                        }
                        log.info("Integr:ApplyFuncString_QuotientRules:QuotientRule:Rule3 :x=" + x);
                    } else if ((!Diff1IntegrExpr.equalsIgnoreCase("")) && (!Diff2IntegrExpr.contains(Diff1IntegrExpr + "/"))) {
                        if (Diff2IntegrExpr.equalsIgnoreCase(DiffWithRespTo)) {
                            x = "ln(" + DiffWithRespTo + ")";
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseQuotientRule:QuotientRule:Rule4A :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                            log.info("Integr:ApplyFuncString_QuotientRules:QuotientRule:Rule4A :x=" + x);
                        } else {
                            x = Diff1IntegrExpr + "/" + Diff2IntegrExpr;
                            ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseQuotientRule:QuotientRule:Rule4B :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                            log.info("Integr:ApplyFuncString_QuotientRules:QuotientRule:Rule4B :x=" + x);
                        }
                    } else {
                        x = Diff2IntegrExpr;
                        ReasoningLambdaIntegr z = parseReasonIntegr(AlgoName, CompltExprn, "Integr:Str:parseQuotientRule:QuotientRule:Rule5 :", Rule, LowLevelRules, true, Term1, Diff1IntegrExpr, Term2, Diff2IntegrExpr, Term3, Term4, "" + StrOperator, DiffWithRespTo, "" + TermOperator, x);
                        log.info("Integr:ApplyFuncString_QuotientRules:QuotientRule:Rule5 :x=" + x);
                    }
                }
                log.info("Integr:String:parseQuotientRule:Final:x=" + x);
                return x;
            }
        }.parseIntegrStr();
    }

    public static int AlignWithOpenBraces1(int myPosTerm, int mychTerm, String MyStrTerm, boolean HideAllFlag) {
        int tempAlignCharRead = myPosTerm;
        if (tempAlignCharRead >= 0) ; else {
            tempAlignCharRead = 0;
        }
        int TempchTerm1 = MyStrTerm.charAt(tempAlignCharRead);
        mychTerm = TempchTerm1;
        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlagSep) || (GBLSilentDeepInfoSep.equalsIgnoreCase("Verbose"))) {
            //System.out.println("AlignWithOpenBraces:TempchTerm1=" + (char) TempchTerm1 + " mychTerm=" + mychTerm + " myPosTerm=" + myPosTerm);
        }
        while ((MyStrTerm.length() > 1) && (tempAlignCharRead < MyStrTerm.length())) {
            TempchTerm1 = MyStrTerm.charAt(tempAlignCharRead);
            tempAlignCharRead++;
            if (tempAlignCharRead >= MyStrTerm.length()) {
                tempAlignCharRead--;
                break;
            } else if (TempchTerm1 == '(') {
                TempchTerm1 = MyStrTerm.charAt(tempAlignCharRead + 1);
                mychTerm = TempchTerm1;
                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlagSep) || (GBLSilentDeepInfoSep.equalsIgnoreCase("Verbose"))) {
                    //System.out.println("AlignWithOpenBraces:TempchTerm1=" + (char) TempchTerm1 + " mychTerm=" + mychTerm + " myPosTerm=" + myPosTerm);
                }
                break;
            }
        }
        myPosTerm = tempAlignCharRead;
        return tempAlignCharRead;
    }

    public static int ProcessOpenBraces1(int myPosTerm, int mychTerm, String MyStrTerm, String DiffWithRespTo, boolean HideAllFlag) {
        int numberofcharsread = 0;
        int oldposition = myPosTerm;
        boolean NumberAggragationFlag = false;
        String NumStr = "";
        MyParenDecodedSep = "";
        MyParenEncodedSep = "";
        OpenBraces = 1;
        CloseBraces = 0;
        int TempchTerm = 0;
        if ((numberofcharsread < MyStrTerm.substring(oldposition).length()) && (MyStrTerm.substring(oldposition).length() > 0)) {
            TempchTerm = MyStrTerm.substring(oldposition).charAt(numberofcharsread);
        }
        while (((MyStrTerm.length() > 1) && (MyStrTerm.substring(oldposition).length() > 1) && (TempchTerm != 0) && (OpenBraces == (CloseBraces + 1)))
                || ((MyStrTerm.length() > 1) && (MyStrTerm.substring(oldposition, myPosTerm).length() > 1)) && (StringUtils.countMatches(MyStrTerm.substring(oldposition), ")") > 1) && (OpenBraces < (StringUtils.countMatches(MyStrTerm.substring(oldposition), "(")))) {
            if (OpenBraces >= CloseBraces + 1) {
                if (numberofcharsread < MyStrTerm.substring(oldposition).length()) {
                    TempchTerm = MyStrTerm.substring(oldposition).charAt(numberofcharsread);
                    if (IsIndConstantPlain(TempchTerm)) {
                        NumberAggragationFlag = false;
                        MyParenDecodedSep = MyParenDecodedSep + (char) TempchTerm;
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlagSep) || (GBLSilentDeepInfoSep.equalsIgnoreCase("Verbose"))) {
                            //System.out.println(" Got a IndConstant Variable");
                        }
                    } else if ((IsNumber(TempchTerm)) || (NumberAggragationFlag == true)) {
                        if (((TempchTerm >= '0') && (TempchTerm <= '9')) || (TempchTerm == '.') || (TempchTerm == 'E') || (TempchTerm == 'e')) {
                            NumStr = NumStr + (char) TempchTerm;
                            NumberAggragationFlag = true;
                        } else if ((IsAConstant(NumStr, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                            MyParenDecodedSep = MyParenDecodedSep + Double.parseDouble(NumStr);
                            NumberAggragationFlag = false;
                        }
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlagSep) || (GBLSilentDeepInfoSep.equalsIgnoreCase("Verbose"))) {
                            //System.out.println(" Got a Number");
                        }
                    }
                    if (IsOperator(TempchTerm)) {
                        if ((NumberAggragationFlag == true) && (!NumStr.equalsIgnoreCase("")) && (IsAConstant(NumStr, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                            MyParenDecodedSep = MyParenDecodedSep + Double.parseDouble(NumStr);
                            NumberAggragationFlag = false;
                        }
                        MyParenDecodedSep = MyParenDecodedSep + (char) TempchTerm;
                        NumberAggragationFlag = false;
                        if ((TempchTerm == '+') || (TempchTerm == '-')) {
                            NumStr = "";
                        }
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlagSep) || (GBLSilentDeepInfoSep.equalsIgnoreCase("Verbose"))) {
                            //System.out.println(" Got a Operator");
                        }
                    }
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlagSep) || (GBLSilentDeepInfoSep.equalsIgnoreCase("Verbose"))) {
                        //System.out.println("ProcessOpenBraces:MyParenDecodedSep=" + MyParenDecodedSep + " MyParenEncodedSep=" + MyParenEncodedSep);
                    }
                }
                if (TempchTerm == '(') {
                    OpenBraces++;
                } else if (TempchTerm == ')') {
                    if ((NumberAggragationFlag == true) && (!NumStr.equalsIgnoreCase("")) && (IsAConstant(NumStr, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                        MyParenDecodedSep = MyParenDecodedSep + Double.parseDouble(NumStr);
                        NumberAggragationFlag = false;
                    }
                    CloseBraces++;
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlagSep == true) || (GBLSilentDeepInfoSep.equalsIgnoreCase("Verbose"))) {
                        //System.out.println("ProcessOpenBraces:Read Close Brace:CloseBraces=" + CloseBraces);
                    }
                }
                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlagSep) || (GBLSilentDeepInfoSep.equalsIgnoreCase("Verbose"))) {
                    //System.out.println("ProcessOpenBraces:Read Char:TempchTerm=" + TempchTerm + " char=" + (char) TempchTerm + " OpenBraces=" + OpenBraces + " CloseBraces=" + CloseBraces + " myPosTerm=" + myPosTerm + " mychTerm=" + (char) mychTerm);
                }
                numberofcharsread++;
                if (numberofcharsread >= MyStrTerm.substring(oldposition).length()) {
                    numberofcharsread--;
                    break;
                }
            }
            if ((CloseBraces == 1) && (OpenBraces == 1)) {
                break;
            } else if ((CloseBraces > 1) && (CloseBraces == OpenBraces)) {
                break;
            } else if ((CloseBraces == OpenBraces) && (MyStrTerm.substring(oldposition).length() <= (numberofcharsread))) {
                break;
            }
        }
        if ((CloseBraces == OpenBraces) && (oldposition <= (oldposition + numberofcharsread))/*&&(StrTerm.substring(oldposition, oldposition + numberofcharsread - 1).length() > 0)*/) {
            //MyParenEncoded = StrTerm.substring(oldposition, oldposition + numberofcharsread - 1);
            MyParenEncodedSep = MyParenDecodedSep;
            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlagSep) || (GBLSilentDeepInfoSep.equalsIgnoreCase("Verbose"))) {
                System.out.println("ProcessOpenBraces:ReadExpr:MyParenEncodedSep=" + MyParenEncodedSep + " MyParenDecodedSep=" + MyParenDecodedSep);
            }
        } else {
            System.out.println("ProcessOpenBraces:ReadExpr:MyParenEncodedSep=" + MyParenEncodedSep + "Parenthesis Expression:IS NULL:StrTerm.length()=" + MyStrTerm.substring(oldposition).length() + " OpenBraces=" + OpenBraces + " CloseBraces=" + CloseBraces + " oldposition=" + oldposition + " numberofcharsread=" + numberofcharsread);
            System.out.println("ProcessOpenBraces:ReadExpr:MyParenEncodedSep=" + MyParenEncodedSep + "Parenthesis Expression:IS NULL:myPosTerm=" + myPosTerm + " mychTerm=" + (char) mychTerm);
            System.out.println("ProcessOpenBraces:ReadExpr:MyParenEncodedSep=" + MyParenEncodedSep + "Parenthesis Expression:IS NULL:StrTerm.substring(oldposition)=" + MyStrTerm.substring(oldposition));
            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "Parenthesis Expression:IS NULL:SimpleTerm:parseBaseSimple:Nested Parenthesis: StrTerm.length()=" + MyStrTerm.substring(oldposition).length() + " OpenBraces=" + OpenBraces + " CloseBraces=" + CloseBraces + " oldposition=" + oldposition + " numberofcharsread=" + numberofcharsread + " myPosTerm=" + myPosTerm + " mychTerm=" + (char) mychTerm);
        }

        return numberofcharsread;
    }

    public static int extractAndClassifyFactors(String expr, String DiffWithRespTo, boolean HideAllFlag) {
        xTermsSep.clear();
        otherTermsSep.clear();
        ConstantTermsSep.clear();
        MixedExpressionTermsSep.clear();
        if ((HideAllFlag == true) && (DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
            System.out.println("extractAndClassifyFactors:expr=" + expr);
        }
        if ((!expr.equalsIgnoreCase("")) && (expr.charAt(0) != '+') && (expr.charAt(0) != '-')) {
            expr = "+" + expr;
        } else if (expr.equalsIgnoreCase("")) {
            return -1;
        }

        int len = expr.length();
        StringBuilder term = new StringBuilder();
        int parenDepth = 0;
        int pos = 0;

        for (; pos < len; pos++) {
            char c = expr.charAt(pos);
            if ((c == '+' || c == '-') && pos != 0
                    && parenDepth == 0 && !isUnarySign(expr, pos)) {
                break;
            }
            if (c == '(') {
                parenDepth++;
            }
            if (c == ')') {
                parenDepth--;
            }
            term.append(c);
        }

        String rest = term.toString().substring(1);
        List<String> rawFactors = splitFactors(rest, DiffWithRespTo, HideAllFlag);
        List<String> finalFactors = new ArrayList<>();

        // Recursive split of embedded chains
        for (String f : rawFactors) {
            if ((f.contains("*") || f.contains("/")) && !f.startsWith("(")) {
                finalFactors.addAll(splitFactors(f, DiffWithRespTo, HideAllFlag));
            } else {
                finalFactors.add(f);
            }
        }

        // Classification with single FSM call per term
        for (String factor : finalFactors) {
            char op = "+-*/".indexOf(factor.charAt(0)) != -1
                    ? factor.charAt(0)
                    : '+';
            String bare1 = "";
            String bare = (op == factor.charAt(0))
                    ? factor.substring(1)
                    : factor;

            bare = normalizeExponentToDecimal(bare, DiffWithRespTo, HideAllFlag);

            String tagged = op + bare;
            //if ((bare.contains(DiffWithRespTo))&&(bare.contains("("))&&(bare.contains(")")) ){
            //    bare1=normalizeLongFormToDecimal(bare, DiffWithRespTo, HideAllFlag);
            //    tagged = op + bare1;
            //}
            boolean isConst = IsAConstant(tagged, DiffWithRespTo);
            String tagType = StrIsAConstant;
            if ((HideAllFlag == true) && (DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                System.out.println("extractAndClassifyFactors:1:finalFactors:factor=" + factor + " StrIsAConstant=" + StrIsAConstant + " bare1=" + bare1 + " DiffWithRespTo=" + DiffWithRespTo + " Expr=" + tagged);
            }
            // 1) Pure numeric forms
            if (isConst
                    && (tagType.equals("Number") || tagType.equals("NumberExpression"))) {
                //if ( (tagged.contains("(")) && (tagged.contains(")")) &&( (!tagged.contains("+)")) && (!tagged.contains("-)"))) )
                //    tagged=tagged.replaceAll("\\(", "").replaceAll("\\)", "");
                if ((tagged.startsWith("+")) || (tagged.startsWith("+"))) {
                    tagged = tagged.substring(1);
                }
                ConstantTermsSep.add(tagged);
                if ((HideAllFlag == true) && (DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                    System.out.println("extractAndClassifyFactors:2:Added:ConstantTerms=" + tagged + " StrIsAConstant=" + StrIsAConstant);
                }
                // 2) Variable expressions
            } else if (!isConst
                    && (tagType.equals("Var"))) {
                //if ( (tagged.contains("(")) && (tagged.contains(")")) &&( (!tagged.contains("+)")) && (!tagged.contains("-)"))) )
                //    tagged=tagged.replaceAll("\\(", "").replaceAll("\\)", "");
                boolean BracReplacedFlag = false;
                if ((tagged.startsWith("+")) || (tagged.startsWith("+"))) {
                    tagged = tagged.substring(1);
                }
                if ((tagged.contains("(")) && (tagged.contains(")")) && (StringUtils.countMatches(tagged, "(") == 1) && (StringUtils.countMatches(tagged, ")") == 1)) {
                    tagged = tagged.replaceFirst("\\(", "").replaceFirst("\\)", "");
                    BracReplacedFlag = true;
                }
                if (BracReplacedFlag == true) {
                    xTermsSep.add("(" + tagged + ")");
                } else {
                    xTermsSep.add(tagged);
                }
                if ((HideAllFlag == true) && (DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                    System.out.println("extractAndClassifyFactors:3:Added:xTerms=" + tagged + " StrIsAConstant=" + StrIsAConstant);
                }
                // 3) VarExpression
            } else if (!isConst
                    && (tagType.equals("VarExpression")) && (tagged.contains(DiffWithRespTo))) {

                //if ( (tagged.contains("(")) && (tagged.contains(")")) &&( (!tagged.contains("+)")) && (!tagged.contains("-)"))) )
                //    tagged=tagged.replaceAll("\\(", "").replaceAll("\\)", "");
                if ((tagged.startsWith("+")) || (tagged.startsWith("+"))) {
                    tagged = tagged.substring(1);
                }
                boolean BracReplacedFlag = false;
                boolean MixedExpressionFlag = false;
                boolean LongFormFlag = false;
                if ((tagged.contains("(")) && (tagged.contains(")")) && (StringUtils.countMatches(tagged, "(") == 1) && (StringUtils.countMatches(tagged, ")") == 1)) {
                    tagged = tagged.replaceFirst("\\(", "").replaceFirst("\\)", "");
                    BracReplacedFlag = true;
                }
                int numberofcharsread = 0;
                int kplus = tagged.indexOf("+");
                int kminus = tagged.indexOf("-");
                if (((kplus > -1) && (!isUnarySign(tagged, kplus))) || ((kminus > -1) && (!isUnarySign(tagged, kminus)))) {
                    MixedExpressionFlag = true;
                }
                if (!MixedExpressionFlag) {
                    LongFormFlag = true;
                    MixedExpressionFlag = false;
                }
                if (LongFormFlag == true) {
                    numberofcharsread = extractAndClassifyFactorsInner(tagged, DiffWithRespTo, HideAllFlag);
                } else if ((!tagged.equalsIgnoreCase("-" + DiffWithRespTo)) && (!tagged.equalsIgnoreCase("+" + DiffWithRespTo)) && (((kplus > -1) && (!isUnarySign(tagged, kplus))) || ((kminus > -1) && (!isUnarySign(tagged, kminus))))
                        && (MixedExpressionFlag == true) && (tagged.contains(DiffWithRespTo)) && (!IsAConstant(tagged, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("VarExpression"))
                        && (tagged.matches((".*[\\+\\-\\*/^]*[a-zA-Z]+[0-9]*.*")))) {
                    //&&(tagged.matches("\\b(?!" + DiffWithRespTo + "\b)[a-zA-Z]\\w*\\b")) ){
                    MixedExpressionTermsSep.add("(" + tagged + ")");
                    if ((HideAllFlag == true) && (DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                        System.out.println("extractAndClassifyFactors:3:Added:MixedExpressionTerms:tagged=" + "(" + tagged + ")" + " StrIsAConstant=" + StrIsAConstant);
                    }
                } else {
                    xTermsSep.add(tagged);
                    if ((HideAllFlag == true) && (DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                        System.out.println("extractAndClassifyFactors:3:Added:xTerms:tagged=" + "(" + tagged + ")" + " StrIsAConstant=" + StrIsAConstant);
                    }
                }
//                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
//                    System.out.println("extractAndClassifyFactors:3:Added:xTerms=" + tagged + " StrIsAConstant=" + StrIsAConstant);
//                }
                // 3) All other symbolic forms
            } else if ((!IsAConstant(tagged, DiffWithRespTo))
                    && ((StrIsAConstant.equals("IndConstant")) || StrIsAConstant.equals("IndConstantExpression"))) {
                //if ( (tagged.contains("(")) && (tagged.contains(")")) &&( (!tagged.contains("+)")) && (!tagged.contains("-)"))) )
                //    tagged=tagged.replaceAll("\\(", "").replaceAll("\\)", "");
                if ((tagged.startsWith("+")) || (tagged.startsWith("+"))) {
                    tagged = tagged.substring(1);
                }
                otherTermsSep.add(tagged);
                if ((HideAllFlag == true) && (DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                    System.out.println("extractAndClassifyFactors:4:Added:otherTerms=" + tagged + " StrIsAConstant=" + StrIsAConstant);
                }
            } else {
                if ((HideAllFlag == true) && (DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                    isConst = IsAConstant(tagged, DiffWithRespTo);
                    System.out.println("extractAndClassifyFactors:5:finalFactors:else:Dropped:tagged=" + tagged + " StrIsAConstant=" + StrIsAConstant);
                }
                if (factor.startsWith("*")) {
                    factor = factor.replaceFirst("\\*", "");
                } else if (factor.startsWith("/")) {
                    factor = factor.replaceFirst("/", "");
                } else if (factor.startsWith("+")) {
                    factor = factor.replaceFirst("\\+", "");
                } else if (factor.startsWith("-")) {
                    factor = factor.replaceFirst("\\-", "");
                } else if (factor.startsWith("^")) {
                    factor = factor.replaceFirst("\\^", "");
                }
                if (isConst
                        && (tagType.equals("Number") || tagType.equals("NumberExpression"))) {
                    //if ( (tagged.contains("(")) && (tagged.contains(")")) &&( (!tagged.contains("+)")) && (!tagged.contains("-)"))) )
                    //      tagged=tagged.replaceAll("\\(", "").replaceAll("\\)", "");
                    ConstantTermsSep.add(tagged);
                    if ((HideAllFlag == true) && (DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                        System.out.println("extractAndClassifyFactors:7:Recovered:Added:ConstantTerms:tagged=" + tagged + " StrIsAConstant=" + StrIsAConstant);
                    }
                    // 2) Variable expressions
                } else if (!isConst
                        && (tagType.equals("Var") || tagType.equals("VarExpression"))) {
                    //if ( (tagged.contains("(")) && (tagged.contains(")")) &&( (!tagged.contains("+)")) && (!tagged.contains("-)"))) )
                    //    tagged=tagged.replaceAll("\\(", "").replaceAll("\\)", "");
                    xTermsSep.add(tagged);
                    if ((HideAllFlag == true) && (DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                        System.out.println("extractAndClassifyFactors:8:Recovered:Added:xTerms:tagged=" + tagged + " StrIsAConstant=" + StrIsAConstant);
                    }
                    // 3) All other symbolic forms
                } else if ((!IsAConstant(factor, DiffWithRespTo))
                        && ((StrIsAConstant.equals("IndConstant")) || StrIsAConstant.equals("IndConstantExpression"))) {
                    //if ( (tagged.contains("(")) && (tagged.contains(")")) &&( (!tagged.contains("+)")) && (!tagged.contains("-)"))) )
                    //        tagged=tagged.replaceAll("\\(", "").replaceAll("\\)", "");
                    otherTermsSep.add(tagged);
                    IsAConstant(factor, DiffWithRespTo);
                    if ((HideAllFlag == true) && (DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                        System.out.println("extractAndClassifyFactors:9:Recovered:Added:otherTerms:tagged=" + tagged + " StrIsAConstant=" + StrIsAConstant);
                    }
                }
            }
        }
        return pos;
    }

    public static int extractAndClassifyFactorsInner(String expr, String DiffWithRespTo, boolean HideAllFlag) {
        if ((HideAllFlag == true) && (DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
            System.out.println("extractAndClassifyFactorsInner:expr=" + expr);
        }
        if ((!expr.equalsIgnoreCase("")) && (expr.charAt(0) != '+') && (expr.charAt(0) != '-')) {
            expr = "+" + expr;
        } else if (expr.equalsIgnoreCase("")) {
            return -1;
        }

        int len = expr.length();
        StringBuilder term = new StringBuilder();
        int parenDepth = 0;
        int pos = 0;

        for (; pos < len; pos++) {
            char c = expr.charAt(pos);
            if ((c == '+' || c == '-') && pos != 0
                    && parenDepth == 0 && !isUnarySign(expr, pos)) {
                break;
            }
            if (c == '(') {
                parenDepth++;
            }
            if (c == ')') {
                parenDepth--;
            }
            term.append(c);
        }

        String rest = term.toString().substring(1);
        List<String> rawFactors = splitFactors(rest, DiffWithRespTo, HideAllFlag);
        List<String> finalFactors = new ArrayList<>();

        // Recursive split of embedded chains
        for (String f : rawFactors) {
            if ((f.contains("*") || f.contains("/")) && !f.startsWith("(")) {
                finalFactors.addAll(splitFactors(f, DiffWithRespTo, HideAllFlag));
            } else {
                finalFactors.add(f);
            }
        }

        // Classification with single FSM call per term
        for (String factor : finalFactors) {
            char op = "+-*/".indexOf(factor.charAt(0)) != -1
                    ? factor.charAt(0)
                    : '+';
            String bare1 = "";
            String bare = (op == factor.charAt(0))
                    ? factor.substring(1)
                    : factor;

            bare = normalizeExponentToDecimal(bare, DiffWithRespTo, HideAllFlag);

            String tagged = op + bare;
            //if ((bare.contains(DiffWithRespTo))&&(bare.contains("("))&&(bare.contains(")")) ){
            //    bare1=normalizeLongFormToDecimal(bare, DiffWithRespTo, HideAllFlag);
            //    tagged = op + bare1;
            //}
            boolean isConst = IsAConstant(tagged, DiffWithRespTo);
            String tagType = StrIsAConstant;
            if ((HideAllFlag == true) && (DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                System.out.println("extractAndClassifyFactorsInner:1:finalFactors:factor=" + factor + " StrIsAConstant=" + StrIsAConstant + " bare1=" + bare1 + " DiffWithRespTo=" + DiffWithRespTo + " Expr=" + tagged);
            }
            // 1) Pure numeric forms
            if (isConst
                    && (tagType.equals("Number") || tagType.equals("NumberExpression"))) {
                //if ( (tagged.contains("(")) && (tagged.contains(")")) &&( (!tagged.contains("+)")) && (!tagged.contains("-)"))) )
                //    tagged=tagged.replaceAll("\\(", "").replaceAll("\\)", "");
                if ((tagged.startsWith("+")) || (tagged.startsWith("+"))) {
                    tagged = tagged.substring(1);
                }
                ConstantTermsSep.add(tagged);
                if ((HideAllFlag == true) && (DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                    System.out.println("extractAndClassifyFactorsInner:2:Added:ConstantTerms=" + tagged + " StrIsAConstant=" + StrIsAConstant);
                }
                // 2) Variable expressions
            } else if (!isConst
                    && (tagType.equals("Var"))) {
                //if ( (tagged.contains("(")) && (tagged.contains(")")) &&( (!tagged.contains("+)")) && (!tagged.contains("-)"))) )
                //    tagged=tagged.replaceAll("\\(", "").replaceAll("\\)", "");
                if ((tagged.startsWith("+")) || (tagged.startsWith("+"))) {
                    tagged = tagged.substring(1);
                }
                if ((tagged.contains("(")) && (tagged.contains(")")) && (StringUtils.countMatches(tagged, "(") == 1) && (StringUtils.countMatches(tagged, ")") == 1)) {
                    tagged = tagged.replaceFirst("\\(", "").replaceFirst("\\)", "");
                }
                xTermsSep.add(tagged);
                if ((HideAllFlag == true) && (DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                    System.out.println("extractAndClassifyFactorsInner:3:Added:xTerms=" + tagged + " StrIsAConstant=" + StrIsAConstant);
                }
                // 3) VarExpression
            } else if (!isConst
                    && tagType.equals("VarExpression")) {
                //if ( (tagged.contains("(")) && (tagged.contains(")")) &&( (!tagged.contains("+)")) && (!tagged.contains("-)"))) )
                //    tagged=tagged.replaceAll("\\(", "").replaceAll("\\)", "");
                if ((tagged.startsWith("+")) || (tagged.startsWith("+"))) {
                    tagged = tagged.substring(1);
                }
                if ((tagged.contains("(")) && (tagged.contains(")")) && (StringUtils.countMatches(tagged, "(") == 1) && (StringUtils.countMatches(tagged, ")") == 1)) {
                    tagged = tagged.replaceFirst("\\(", "").replaceFirst("\\)", "");
                }
                xTermsSep.add(tagged);
                if ((HideAllFlag == true) && (DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                    System.out.println("extractAndClassifyFactorsInner:3:Added:xTerms=" + tagged + " StrIsAConstant=" + StrIsAConstant);
                }
                // 3) All other symbolic forms
            } else if ((!IsAConstant(tagged, DiffWithRespTo))
                    && ((StrIsAConstant.equals("IndConstant")) || StrIsAConstant.equals("IndConstantExpression"))) {
                //if ( (tagged.contains("(")) && (tagged.contains(")")) &&( (!tagged.contains("+)")) && (!tagged.contains("-)"))) )
                //    tagged=tagged.replaceAll("\\(", "").replaceAll("\\)", "");
                if ((tagged.startsWith("+")) || (tagged.startsWith("+"))) {
                    tagged = tagged.substring(1);
                }
                otherTermsSep.add(tagged);
                if ((HideAllFlag == true) && (DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                    System.out.println("extractAndClassifyFactorsInner:4:Added:otherTerms=" + tagged + " StrIsAConstant=" + StrIsAConstant);
                }
            } else {
                if ((HideAllFlag == true) && (DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                    isConst = IsAConstant(tagged, DiffWithRespTo);
                    System.out.println("extractAndClassifyFactorsInner:5:finalFactors:else:Dropped:tagged=" + tagged + " StrIsAConstant=" + StrIsAConstant);
                }
                if (factor.startsWith("*")) {
                    factor = factor.replaceFirst("\\*", "");
                } else if (factor.startsWith("/")) {
                    factor = factor.replaceFirst("/", "");
                } else if (factor.startsWith("+")) {
                    factor = factor.replaceFirst("\\+", "");
                } else if (factor.startsWith("-")) {
                    factor = factor.replaceFirst("\\-", "");
                } else if (factor.startsWith("^")) {
                    factor = factor.replaceFirst("\\^", "");
                }
                if (isConst
                        && (tagType.equals("Number") || tagType.equals("NumberExpression"))) {
                    //if ( (tagged.contains("(")) && (tagged.contains(")")) &&( (!tagged.contains("+)")) && (!tagged.contains("-)"))) )
                    //      tagged=tagged.replaceAll("\\(", "").replaceAll("\\)", "");
                    ConstantTermsSep.add(tagged);
                    if ((HideAllFlag == true) && (DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                        System.out.println("extractAndClassifyFactorsInner:7:Recovered:Added:ConstantTerms:tagged=" + tagged + " StrIsAConstant=" + StrIsAConstant);
                    }
                    // 2) Variable expressions
                } else if (!isConst
                        && (tagType.equals("Var") || tagType.equals("VarExpression"))) {
                    //if ( (tagged.contains("(")) && (tagged.contains(")")) &&( (!tagged.contains("+)")) && (!tagged.contains("-)"))) )
                    //    tagged=tagged.replaceAll("\\(", "").replaceAll("\\)", "");
                    xTermsSep.add(tagged);
                    if ((HideAllFlag == true) && (DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                        System.out.println("extractAndClassifyFactorsInner:8:Recovered:Added:xTerms:tagged=" + tagged + " StrIsAConstant=" + StrIsAConstant);
                    }
                    // 3) All other symbolic forms
                } else if ((!IsAConstant(factor, DiffWithRespTo))
                        && ((StrIsAConstant.equals("IndConstant")) || StrIsAConstant.equals("IndConstantExpression"))) {
                    //if ( (tagged.contains("(")) && (tagged.contains(")")) &&( (!tagged.contains("+)")) && (!tagged.contains("-)"))) )
                    //        tagged=tagged.replaceAll("\\(", "").replaceAll("\\)", "");
                    otherTermsSep.add(tagged);
                    IsAConstant(factor, DiffWithRespTo);
                    if ((HideAllFlag == true) && (DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                        System.out.println("extractAndClassifyFactorsInner:9:Recovered:Added:otherTerms:tagged=" + tagged + " StrIsAConstant=" + StrIsAConstant);
                    }
                }
            }
        }
        return pos;
    }

    public static List<String> splitFactors(String expr, String DiffWithRespTo, boolean HideAllFlag) {
        List<String> factors = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        int parenDepth = 0;
        boolean inExponent = false;

        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);

            if (c == '(') {
                parenDepth++;
            } else if (c == ')') {
                parenDepth--;
            }

            // Enter exponent region
            if (c == '^' && parenDepth == 0) {
                inExponent = true;
                current.append(c);
                continue;
            }

            if (inExponent) {
                current.append(c);
                if (c == '(') {
                    int depth = 1;
                    i++;
                    while (i < expr.length() && depth > 0) {
                        char n = expr.charAt(i);
                        if (n == '(') {
                            depth++;
                        } else if (n == ')') {
                            depth--;
                        }
                        current.append(n);
                        i++;
                    }
                    i--;
                }
                inExponent = false;
                continue;
            }

            // Split on top-level * and /
            if ((c == '*' || c == '/') && parenDepth == 0) {
                if (current.length() > 0) {
                    factors.add(current.toString());
                    current.setLength(0);
                }
                current.append(c);
            } else {
                current.append(c);
            }
        }

        if (current.length() > 0) {
            factors.add(current.toString());
        }
        return factors;
    }

    public static String normalizeExponentToDecimal(String expr, String DiffWithRespTo, boolean HideAllFlag) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);
            if (c == '^') {
                sb.append(c);
                i++;
                if (i < expr.length() && expr.charAt(i) == '(') {
                    sb.append('(');
                    int depth = 1;
                    i++;
                    while (i < expr.length() && depth > 0) {
                        char n = expr.charAt(i);
                        if (n == '(') {
                            depth++;
                        } else if (n == ')') {
                            depth--;
                        }
                        sb.append(n);
                        i++;
                    }
                    i--;
                } else {
                    StringBuilder num = new StringBuilder();
                    while (i < expr.length() && Character.isDigit(expr.charAt(i))) {
                        num.append(expr.charAt(i));
                        i++;
                    }
//                    if ((num.length() > 0) && (!(num.toString().contains("\\.")) ) && (!(sb.toString().contains("\\.")) ) ) {
//                        sb.append(num).append(".0");
//                    }else if (num.length() > 0){
//                        sb.append(num);
//                    }

// Peek ahead for a decimal point
                    if (i < expr.length() && expr.charAt(i) == '.') {
                        num.append('.');
                        i++;
                        while (i < expr.length() && Character.isDigit(expr.charAt(i))) {
                            num.append(expr.charAt(i));
                            i++;
                        }
                    }

// Append final form
                    String numStr = num.toString();
                    if ((!numStr.equalsIgnoreCase("")) && (!numStr.contains("."))) {
                        if ((HideAllFlag == true) && (DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("extractAndClassifyFactors:normalizeExponentToDecimal:Recovered:numStr=" + numStr + " sb=" + sb.toString());
                        }
                        sb.append(numStr).append(".0");
                    } else if (!numStr.equalsIgnoreCase("")) {
                        sb.append(numStr);
                    }

                    i--;
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String normalizeLongFormToDecimal(String expr, String DiffWithRespTo, boolean HideAllFlag) {
        System.out.println("Reached 1:normalizeLongFormToDecimal:expr=" + expr);
        String mysb = "";
        StringBuilder sb = new StringBuilder();
        StringBuilder sbLongForm = new StringBuilder();
        Double MyTermOutput = 0.0;
        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);
            if (c == '^') {
                sb.append(c);
                i++;
                if (i < expr.length() && expr.charAt(i) == '(') {
                    sb.append('(');
                    int depth = 1;
                    i++;
                    while (i < expr.length() && depth > 0) {
                        char n = expr.charAt(i);
                        if (n == '(') {
                            depth++;
                        } else if (n == ')') {
                            depth--;
                        }
                        sb.append(n);
                        i++;
                    }
                    i--;
                } else {
                    StringBuilder num = new StringBuilder();
                    while (i < expr.length() && Character.isDigit(expr.charAt(i))) {
                        num.append(expr.charAt(i));
                        i++;
                    }
                    // Peek ahead for a decimal point
                    if (i < expr.length() && expr.charAt(i) == '.') {
                        num.append('.');
                        i++;
                        while (i < expr.length() && Character.isDigit(expr.charAt(i))) {
                            num.append(expr.charAt(i));
                            i++;
                        }
                    }

// Append final form
                    String numStr = num.toString();
                    if ((!numStr.equalsIgnoreCase("")) && (!numStr.contains("."))) {
                        if ((HideAllFlag == true) && (DevelopmentFlagSep) || (GBLSilentSep.equalsIgnoreCase("Verbose"))) {
                            System.out.println("extractAndClassifyFactors:normalizeLongFormToDecimal:Recovered:numStr=" + numStr + " sb=" + sb.toString());
                        }
                        MyTermOutput += Double.parseDouble(numStr);
                        sb.append(numStr).append(".0");
                        if ((i + 1 < expr.length()) && ((expr.charAt(i + 1) == '+') || (expr.charAt(i + 1) == '+'))) {
                            sbLongForm.append(DiffWithRespTo + "^" + MyTermOutput);
                        }
                        //System.out.println("Reached 0.1:sbLongForm="+sbLongForm.toString() + " MyTermOutput=" + MyTermOutput);
                    } else if (!numStr.equalsIgnoreCase("")) {
                        MyTermOutput += Double.parseDouble(numStr);
                        sb.append(numStr);
                        if ((i + 1 < expr.length()) && ((expr.charAt(i + 1) == '+') || (expr.charAt(i + 1) == '+'))) {
                            sbLongForm.append(DiffWithRespTo + "^" + MyTermOutput);
                        }
                        //System.out.println("Reached 0.2:sbLongForm="+sbLongForm.toString() + " MyTermOutput=" + MyTermOutput);
                    }
                    i--;
                }
            } else {
                sb.append(c);
                if ((sb.toString().endsWith("*" + DiffWithRespTo)) && (DiffWithRespTo.endsWith("" + c))) {
                    //System.out.println("Reached 2:sb=" + sb.toString());
                    MyTermOutput++;
                    mysb = sb.toString().replaceFirst("\\*" + DiffWithRespTo, "");
                    //System.out.println("Reached 2.1:sb=" + sb.toString() + " MyTermOutput=" + MyTermOutput);
                    sb = new StringBuilder(mysb);
                } else if ((sb.toString().endsWith("/" + DiffWithRespTo)) && (DiffWithRespTo.endsWith("" + c))) {
                    //System.out.println("Reached 3:sb=" + sb.toString());
                    MyTermOutput--;
                    mysb = sb.toString().replaceFirst("/" + DiffWithRespTo, "");
                    //System.out.println("Reached 3.1:sb=" + sb.toString() + " MyTermOutput=" + MyTermOutput);
                    sb = new StringBuilder(mysb);
                } else if ((sb.toString().endsWith(DiffWithRespTo)) && (DiffWithRespTo.endsWith("" + c)) && ((i + 1 < expr.length()) && (expr.charAt(i + 1) != '^'))) {
                    //System.out.println("Reached 4:sb=" + sb.toString());
                    MyTermOutput++;
                    mysb = sb.toString().replaceFirst(DiffWithRespTo, "");
                    //System.out.println("Reached 4.1:sb=" + sb.toString() + " MyTermOutput=" + MyTermOutput);
                    sb = new StringBuilder(mysb);
                }
                //System.out.println("Reached 6:sb=" + sb.toString());
            }
        }
//        if (MyTermOutput > 0.0) {
//            TermOutput += MyTermOutput;
//            sbLongForm.append(DiffWithRespTo + "^" + MyTermOutput);
//            return sbLongForm.toString();
//        } else if (sb.toString().equalsIgnoreCase(DiffWithRespTo)) {
//            TermOutput++;
//            sbLongForm.append(DiffWithRespTo);
//            return sbLongForm.toString();
//        }
        return sbLongForm.toString();
    }

    public static int advanceOneFactor(String expr, int startindex) {
        if (expr == null || expr.isEmpty()) {
            return -1;
        }

        expr = expr.trim();
        int length = expr.length();
        int index = 0;
        if ((startindex > -1) && (startindex < length)) {
            index = startindex;
        }

        // Parse first term (include unary if present)
        if (expr.charAt(index) == '+' || expr.charAt(index) == '-') {
            index++;
        }

        int parenDepth = 0;
        while (index < length) {
            char c = expr.charAt(index);

            // Update depth inside parentheses
            if (c == '(') {
                parenDepth++;
            } else if (c == ')') {
                parenDepth--;
            }
            // Stop at next Factor within the Term
            if ((c == '*' || c == '/') && (parenDepth == 0)) {
                break;
            } // Stop at top-level '+' or '-' only
            else if ((c == '+' || c == '-') && (parenDepth == 0) && (!isUnarySign(expr, index))) {
                break;
            }
            index++;
        }

        // Now index points to next top-level term’s sign
        if (index >= length) {
            return -1;
        }

        int nextStart = index;
        //index++; // move past '+' or '-' sign

//        parenDepth = 0;
//        while (index < length) {
//            char c = expr.charAt(index);
//            if (c == '(') parenDepth++;
//            else if (c == ')') parenDepth--;
//            if ((c == '+' || c == '-') && parenDepth == 0) break;
//            index++;
//        }
        //return expr.substring(nextStart, index).trim();
        return index;
    }

    public static int advanceOneTerm(String expr, int startindex) {
        if (expr == null || expr.isEmpty()) {
            return -1;
        }

        expr = expr.trim();
        int length = expr.length();
        int index = 0;
        if ((startindex > -1) && (startindex < length)) {
            index = startindex;
        }

        // Parse first term (include unary if present)
        if (expr.charAt(index) == '+' || expr.charAt(index) == '-') {
            index++;
        }

        int parenDepth = 0;
        while (index < length) {
            char c = expr.charAt(index);

            // Update depth inside parentheses
            if (c == '(') {
                parenDepth++;
            } else if (c == ')') {
                parenDepth--;
            }
            // Stop at top-level '+' or '-' only
            if ((c == '+' || c == '-') && (parenDepth == 0) && (!isUnarySign(expr, index))) {
                break;
            }
            index++;
        }

        // Now index points to next top-level term’s sign
        if (index >= length) {
            return -1;
        }

        int nextStart = index;
        //index++; // move past '+' or '-' sign

//        parenDepth = 0;
//        while (index < length) {
//            char c = expr.charAt(index);
//            if (c == '(') parenDepth++;
//            else if (c == ')') parenDepth--;
//            if ((c == '+' || c == '-') && parenDepth == 0) break;
//            index++;
//        }
        //return expr.substring(nextStart, index).trim();
        return index;
    }

    public static boolean DETAIL(String Term1, String Term2, String DiffWithRespTo) {
        //Logarithmic
        if ((Term1.contains("ln")) || (Term1.contains("log"))) {
            return true;
        } //Inverse trignometric
        else if ((Term1.contains("arctan")) || (Term1.contains("arcsec")) || (Term1.contains("arsinh"))) {
            return true;
        } //Algebraic
        else if (Term1.contains(DiffWithRespTo + "^")) {
            return true;
        } //trignometric
        else if ((Term1.contains("sin")) || (Term1.contains("cos")) || (Term1.contains("tan")) || (Term1.contains("sech"))) {
            return true;
        } //Exponential
        else if ((Term1.contains("exp")) || (Term1.contains("^" + DiffWithRespTo))) {
            return true;
        }
        return false;
    }

    public static void InitState() {
        posLADiff = -1;
        chLADiff = -1;
        //Diff Expression character Index and Character Variable
        posDiff = -1;
        chDiff = -1;
        //Diff Expression character Index and Character Variable
        posIntegr = -1;
        chIntegr = -1;
        // Global Variables && Functions
        // Maximum number of Double Fractional Digits displayed in Equation
        MaximumFractionDigits = 25;
        // Maximum number of Integer Digits displayed in Equation
        MaximumIntegerDigits = 50;

        ZeroTermSignFlag = false;
        ParanExprInProgressFlag = false;
    }

    public static void BackupDiffIntegrStateAll(Map<String, String> variablesBackupState) {
        BackupDiffIntegrParserState(variablesBackupState);
        BackupDiffIntegrControlStateVar(variablesBackupState);
        BackupMathsStateAll(variablesBackupState);
        if (!AutoGenSilentFlag) {
            System.out.println("BackupDiffIntegrStateAll:StrKeyBackUpRestore + depthBackUpRestore=" + StrKeyBackUpRestore + depthBackUpRestore);
        }
        //BackupRestoreStack.push(new HashMap<> (variablesBackupState));
    }

    public static void RestoreDiffIntegrStateAll(Map<String, String> variablesBackupState) {
        //variablesBackupState=BackupRestoreStack.pop();
        RestoreMathsStateAll(variablesBackupState);
        RestoreDiffIntegrControlStateVar(variablesBackupState);
        RestoreDiffIntegrParserState(variablesBackupState);
        if (!AutoGenSilentFlag) {
            System.out.println("RestoreDiffIntegrStateAll:StrKeyBackUpRestore + depthBackUpRestore=" + StrKeyBackUpRestore + depthBackUpRestore);
        }
    }

    public static void BackupDiffIntegrControlStateVar(Map<String, String> variablesBackupState) {
        //Boolean Variables
        variablesBackupState.put("GotExpntNumFlag" + StrKeyBackUpRestore + depthBackUpRestore, "" + GotExpntNumFlag);
        variablesBackupState.put("EnteredLAConstFlag" + StrKeyBackUpRestore + depthBackUpRestore, "" + EnteredLAConstFlag);
        variablesBackupState.put("ParanExprFlag" + StrKeyBackUpRestore + depthBackUpRestore, "" + ParanExprFlag);
        variablesBackupState.put("FuncArgFlag" + StrKeyBackUpRestore + depthBackUpRestore, "" + FuncArgFlag);
        variablesBackupState.put("ContainsXFlag" + StrKeyBackUpRestore + depthBackUpRestore, "" + ContainsXFlag);
        variablesBackupState.put("NormalExprnFlag" + StrKeyBackUpRestore + depthBackUpRestore, "" + NormalExprnFlag);
        variablesBackupState.put("TermOutputSetFlag" + StrKeyBackUpRestore + depthBackUpRestore, "" + TermOutputSetFlag);
        variablesBackupState.put("GotIndConstFlag" + StrKeyBackUpRestore + depthBackUpRestore, "" + GotIndConstFlag);
        variablesBackupState.put("GotExtremityFlag" + StrKeyBackUpRestore + depthBackUpRestore, "" + GotExtremityFlag);
        variablesBackupState.put("ComplexAssignFlag" + StrKeyBackUpRestore + depthBackUpRestore, "" + ComplexAssignFlag);
        variablesBackupState.put("ContainsIndConstFlag" + StrKeyBackUpRestore + depthBackUpRestore, "" + ContainsIndConstFlag);
        variablesBackupState.put("GotVariableFlag" + StrKeyBackUpRestore + depthBackUpRestore, "" + GotVariableFlag);
        variablesBackupState.put("NormalNotPareFlag" + StrKeyBackUpRestore + depthBackUpRestore, "" + NormalNotPareFlag);
        variablesBackupState.put("ParenthesisFlag" + StrKeyBackUpRestore + depthBackUpRestore, "" + ParenthesisFlag);
        variablesBackupState.put("ZeroTermSignFlag" + StrKeyBackUpRestore + depthBackUpRestore, "" + ZeroTermSignFlag);
        variablesBackupState.put("MyParenDecodedSep" + StrKeyBackUpRestore + depthBackUpRestore, "" + MyParenDecodedSep);
        variablesBackupState.put("MyParenEncodedSep" + StrKeyBackUpRestore + depthBackUpRestore, "" + MyParenEncodedSep);

        //Integer Variables
        variablesBackupState.put("LookAheadOperator" + StrKeyBackUpRestore + depthBackUpRestore, "" + LookAheadOperator);
        variablesBackupState.put("ParenthesisHighLvlNum" + StrKeyBackUpRestore + depthBackUpRestore, "" + ParenthesisHighLvlNum);
        variablesBackupState.put("ParenthesisCurrNum" + StrKeyBackUpRestore + depthBackUpRestore, "" + ParenthesisCurrNum);
        variablesBackupState.put("LastLADiffIndConstAidPos" + StrKeyBackUpRestore + depthBackUpRestore, "" + LastLADiffIndConstAidPos);
        variablesBackupState.put("GotIndConstPos" + StrKeyBackUpRestore + depthBackUpRestore, "" + GotIndConstPos);
        variablesBackupState.put("LADiffIndConstOperator" + StrKeyBackUpRestore + depthBackUpRestore, "" + LADiffIndConstOperator);
        variablesBackupState.put("LADiffFactorOperator" + StrKeyBackUpRestore + depthBackUpRestore, "" + LADiffFactorOperator);
        variablesBackupState.put("LastLADiffExtremityAidPos" + StrKeyBackUpRestore + depthBackUpRestore, "" + LastLADiffExtremityAidPos);
        variablesBackupState.put("DiffTermOperator" + StrKeyBackUpRestore + depthBackUpRestore, "" + DiffTermOperator);
        variablesBackupState.put("GotVariablePos" + StrKeyBackUpRestore + depthBackUpRestore, "" + GotVariablePos);
        variablesBackupState.put("SavedOperator" + StrKeyBackUpRestore + depthBackUpRestore, "" + SavedOperator);
        //variablesBackupState.put("TermOutputIndConst" + StrKeyBackUpRestore + depthBackUpRestore, "" +TermOutputIndConst);
    }

    public static void RestoreDiffIntegrControlStateVar(Map<String, String> variablesBackupState) {
        // Boolean Variable Flags
        ComplexAssignFlag = Boolean.parseBoolean(variablesBackupState.get("ComplexAssignFlag" + StrKeyBackUpRestore + depthBackUpRestore));
        GotExpntNumFlag = Boolean.parseBoolean(variablesBackupState.get("GotExpntNumFlag" + StrKeyBackUpRestore + depthBackUpRestore));
        EnteredLAConstFlag = Boolean.parseBoolean(variablesBackupState.get("GotExpntNumFlag" + StrKeyBackUpRestore + depthBackUpRestore));
        ParanExprFlag = Boolean.parseBoolean(variablesBackupState.get("ParanExprFlag" + StrKeyBackUpRestore + depthBackUpRestore));
        FuncArgFlag = Boolean.parseBoolean(variablesBackupState.get("FuncArgFlag" + StrKeyBackUpRestore + depthBackUpRestore));
        ContainsXFlag = Boolean.parseBoolean(variablesBackupState.get("ContainsXFlag" + StrKeyBackUpRestore + depthBackUpRestore));
        NormalExprnFlag = Boolean.parseBoolean(variablesBackupState.get("NormalExprnFlag" + StrKeyBackUpRestore + depthBackUpRestore));
        TermOutputSetFlag = Boolean.parseBoolean(variablesBackupState.get("TermOutputSetFlag" + StrKeyBackUpRestore + depthBackUpRestore));
        GotIndConstFlag = Boolean.parseBoolean(variablesBackupState.get("GotIndConstFlag" + StrKeyBackUpRestore + depthBackUpRestore));
        GotExtremityFlag = Boolean.parseBoolean(variablesBackupState.get("GotExtremityFlag" + StrKeyBackUpRestore + depthBackUpRestore));
        ComplexAssignFlag = Boolean.parseBoolean(variablesBackupState.get("ComplexAssignFlag" + StrKeyBackUpRestore + depthBackUpRestore));
        ContainsIndConstFlag = Boolean.parseBoolean(variablesBackupState.get("ContainsIndConstFlag" + StrKeyBackUpRestore + depthBackUpRestore));
        GotVariableFlag = Boolean.parseBoolean(variablesBackupState.get("GotVariableFlag" + StrKeyBackUpRestore + depthBackUpRestore));
        NormalNotPareFlag = Boolean.parseBoolean(variablesBackupState.get("NormalNotPareFlag" + StrKeyBackUpRestore + depthBackUpRestore));
        ParenthesisFlag = Boolean.parseBoolean(variablesBackupState.get("ParenthesisFlag" + StrKeyBackUpRestore + depthBackUpRestore));
        ZeroTermSignFlag = Boolean.parseBoolean(variablesBackupState.get("ZeroTermSignFlag" + StrKeyBackUpRestore + depthBackUpRestore));
        MyParenDecodedSep = variablesBackupState.get("MyParenDecodedSep" + StrKeyBackUpRestore + depthBackUpRestore);
        MyParenEncodedSep = variablesBackupState.get("MyParenEncodedSep" + StrKeyBackUpRestore + depthBackUpRestore);

        //Integer Variables
        LookAheadOperator = Integer.parseInt(IntegerNullCheck("LookAheadOperator", variablesBackupState));
        ParenthesisHighLvlNum = Integer.parseInt(IntegerNullCheck("ParenthesisHighLvlNum", variablesBackupState));
        ParenthesisCurrNum = Integer.parseInt(IntegerNullCheck("ParenthesisCurrNum", variablesBackupState));
        LastLADiffIndConstAidPos = Integer.parseInt(IntegerNullCheck("LastLADiffIndConstAidPos", variablesBackupState));
        GotIndConstPos = Integer.parseInt(IntegerNullCheck("GotIndConstPos", variablesBackupState));
        LADiffIndConstOperator = Integer.parseInt(IntegerNullCheck("LADiffIndConstOperator", variablesBackupState));
        LADiffFactorOperator = Integer.parseInt(IntegerNullCheck("LADiffFactorOperator", variablesBackupState));
        DiffTermOperator = Integer.parseInt(IntegerNullCheck("DiffTermOperator", variablesBackupState));
        LastLADiffExtremityAidPos = Integer.parseInt(IntegerNullCheck("LastLADiffExtremityAidPos", variablesBackupState));
        GotVariablePos = Integer.parseInt(IntegerNullCheck("GotVariablePos", variablesBackupState));
        SavedOperator = Integer.parseInt(IntegerNullCheck("SavedOperator", variablesBackupState));
        //TermOutputIndConst= Integer.parseInt(IntegerNullCheck("TermOutputIndConst",variablesBackupState));
    }

    public static String IntegerNullCheck(String IntegerName, Map<String, String> variablesBackupState) {
        if (((variablesBackupState.get(IntegerName + StrKeyBackUpRestore + depthBackUpRestore)) != null)
                && ((!variablesBackupState.get(IntegerName + StrKeyBackUpRestore + depthBackUpRestore).equalsIgnoreCase("")))) {
            return variablesBackupState.get(IntegerName + StrKeyBackUpRestore + depthBackUpRestore);
        } else {
            return "-1";
        }

    }

    public static String DoubleNullCheck(String IntegerName, Map<String, String> variablesBackupState) {
        if (((variablesBackupState.get(IntegerName + StrKeyBackUpRestore + depthBackUpRestore)) != null)
                && ((!variablesBackupState.get(IntegerName + StrKeyBackUpRestore + depthBackUpRestore).equalsIgnoreCase("")))) {
            return variablesBackupState.get(IntegerName + StrKeyBackUpRestore + depthBackUpRestore);
        } else {
            return "-1.0";
        }

    }

    public static void BackupDiffIntegrParserState(Map<String, String> variablesBackupState) {
        //Backup LoohAheadConstDiff
        variablesBackupState.put("posLADiff" + StrKeyBackUpRestore + depthBackUpRestore, "" + posLADiff);
        variablesBackupState.put("chLADiff" + StrKeyBackUpRestore + depthBackUpRestore, "" + chLADiff);
        variablesBackupState.put("StrLADiff" + StrKeyBackUpRestore + depthBackUpRestore, StrLADiff);

        //Backup Diffr
        variablesBackupState.put("posDiff" + StrKeyBackUpRestore + depthBackUpRestore, "" + posDiff);
        variablesBackupState.put("chDiff" + StrKeyBackUpRestore + depthBackUpRestore, "" + chDiff);
        variablesBackupState.put("StrDiff" + StrKeyBackUpRestore + depthBackUpRestore, StrDiff);

        //Backup Integr
        variablesBackupState.put("posIntegr" + StrKeyBackUpRestore + depthBackUpRestore, "" + posIntegr);
        variablesBackupState.put("chIntegr" + StrKeyBackUpRestore + depthBackUpRestore, "" + chIntegr);
        variablesBackupState.put("StrIntegr" + StrKeyBackUpRestore + depthBackUpRestore, StrIntegr);

        //String Variables
        variablesBackupState.put("FunctionDiffExpr" + StrKeyBackUpRestore + depthBackUpRestore, FunctionDiffExpr);
        variablesBackupState.put("FunctionExpr" + StrKeyBackUpRestore + depthBackUpRestore, FunctionExpr);
        variablesBackupState.put("FactorsDiffExpr" + StrKeyBackUpRestore + depthBackUpRestore, FactorsDiffExpr);
        variablesBackupState.put("ParanDiffExpr" + StrKeyBackUpRestore + depthBackUpRestore, ParanDiffExpr);
        variablesBackupState.put("ParanExpr" + StrKeyBackUpRestore + depthBackUpRestore, ParanExpr);
        variablesBackupState.put("StrIsAConstant" + StrKeyBackUpRestore + depthBackUpRestore, StrIsAConstant);
    }

    public static void RestoreDiffIntegrParserState(Map<String, String> variablesBackupState) {
        //Restore Simple Expression
        posLADiff = Integer.parseInt(IntegerNullCheck("posLADiff", variablesBackupState));
        chLADiff = Integer.parseInt(IntegerNullCheck("chLADiff", variablesBackupState));
        StrLADiff = variablesBackupState.get("StrLADiff" + StrKeyBackUpRestore + depthBackUpRestore);

        //Restore Diffr
        posDiff = Integer.parseInt(IntegerNullCheck("posDiff", variablesBackupState));
        chDiff = Integer.parseInt(IntegerNullCheck("chDiff", variablesBackupState));
        StrDiff = variablesBackupState.get("StrDiff" + StrKeyBackUpRestore + depthBackUpRestore);

        //Restore Integr
        posIntegr = Integer.parseInt(IntegerNullCheck("posIntegr", variablesBackupState));
        chIntegr = Integer.parseInt(IntegerNullCheck("chIntegr", variablesBackupState));
        StrIntegr = variablesBackupState.get("StrIntegr" + StrKeyBackUpRestore + depthBackUpRestore);

        //String Variables
        FunctionDiffExpr = variablesBackupState.get("FunctionDiffExpr" + StrKeyBackUpRestore + depthBackUpRestore);
        FunctionExpr = variablesBackupState.get("FunctionExpr" + StrKeyBackUpRestore + depthBackUpRestore);
        FactorsDiffExpr = variablesBackupState.get("FactorsDiffExpr" + StrKeyBackUpRestore + depthBackUpRestore);
        ParanDiffExpr = variablesBackupState.get("ParanDiffExpr" + StrKeyBackUpRestore + depthBackUpRestore);
        ParanExpr = variablesBackupState.get("ParanExpr" + StrKeyBackUpRestore + depthBackUpRestore);
        StrIsAConstant = variablesBackupState.get("StrIsAConstant" + StrKeyBackUpRestore + depthBackUpRestore);
    }

    public static void ParseLogDiffrIntegr(String ExprDesc, String HighLevelCallFunc, String InitialORFinal, String StrDesc, String MyStr) {
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLogDiffrIntegr:" + InitialORFinal + ":Parser State");

        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLogDiffrIntegr:" + InitialORFinal + ":" + StrDesc + "=" + MyStr);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLogDiffrIntegr:" + InitialORFinal + ":posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff + " chLADiff=" + chLADiff);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLogDiffrIntegr:" + InitialORFinal + ":posDiff=" + posDiff + " chDiff=" + (char) chDiff + " chDiff=" + chDiff);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLogDiffrIntegr:" + InitialORFinal + ":posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr + " chIntegr=" + chIntegr);

        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLogDiffrIntegr:" + InitialORFinal + ":Parser Control State");

        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLogDiffrIntegr:" + InitialORFinal + ":ComplexAssignFlag=" + ComplexAssignFlag + " ContainsXFlag=" + ContainsXFlag);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLogDiffrIntegr:" + InitialORFinal + ":GotVariableFlag=" + GotVariableFlag);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLogDiffrIntegr:" + InitialORFinal + ":GotExpntNumFlag=" + GotExpntNumFlag);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLogDiffrIntegr:" + InitialORFinal + ":EnteredLAConstFlag=" + EnteredLAConstFlag);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLogDiffrIntegr:" + InitialORFinal + ":ParanExprFlag=" + ParanExprFlag);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLogDiffrIntegr:" + InitialORFinal + ":FuncArgFlag=" + FuncArgFlag);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLogDiffrIntegr:" + InitialORFinal + ":ContainsXFlag=" + ContainsXFlag);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLogDiffrIntegr:" + InitialORFinal + ":NormalExprnFlag=" + NormalExprnFlag);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLogDiffrIntegr:" + InitialORFinal + ":TermOutputSetFlag=" + TermOutputSetFlag);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLogDiffrIntegr:" + InitialORFinal + ":GotIndConstFlag=" + GotIndConstFlag);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLogDiffrIntegr:" + InitialORFinal + ":GotExtremityFlag=" + GotExtremityFlag);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLogDiffrIntegr:" + InitialORFinal + ":ComplexAssignFlag=" + ComplexAssignFlag);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLogDiffrIntegr:" + InitialORFinal + ":ContainsIndConstFlag=" + ContainsIndConstFlag);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLogDiffrIntegr:" + InitialORFinal + ":GotVariableFlag=" + GotVariableFlag);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLogDiffrIntegr:" + InitialORFinal + ":NormalNotPareFlag=" + NormalNotPareFlag);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLogDiffrIntegr:" + InitialORFinal + ":ParenthesisFlag=" + ParenthesisFlag);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLogDiffrIntegr:" + InitialORFinal + " ParanExprInProgressFlag=" + ParanExprInProgressFlag);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLogDiffrIntegr:" + InitialORFinal + " ZeroTermSignFlag=" + ZeroTermSignFlag);

        // Diffr && Integr : Integer Control State
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLogDiffrIntegr:" + InitialORFinal + " LookAheadOperator=" + LookAheadOperator);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLogDiffrIntegr:" + InitialORFinal + " ParenthesisHighLvlNum=" + ParenthesisHighLvlNum);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLogDiffrIntegr:" + InitialORFinal + " ParenthesisCurrNum=" + ParenthesisCurrNum);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLogDiffrIntegr:" + InitialORFinal + " LastLADiffIndConstAidPos=" + LastLADiffIndConstAidPos);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLogDiffrIntegr:" + InitialORFinal + " GotIndConstPos=" + GotIndConstPos);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLogDiffrIntegr:" + InitialORFinal + " LADiffIndConstOperator=" + LADiffIndConstOperator);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLogDiffrIntegr:" + InitialORFinal + " LADiffFactorOperator=" + LADiffFactorOperator);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLogDiffrIntegr:" + InitialORFinal + " DiffTermOperator=" + DiffTermOperator);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLogDiffrIntegr:" + InitialORFinal + " LastLADiffExtremityAidPos=" + LastLADiffExtremityAidPos);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLogDiffrIntegr:" + InitialORFinal + " GotVariablePos=" + GotVariablePos);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLogDiffrIntegr:" + InitialORFinal + " SavedOperator=" + SavedOperator);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLogDiffrIntegr:" + InitialORFinal + " LastLADiffConstCoeffAidPos=" + LastLADiffConstCoeffAidPos);

        // Diffr && Integr : String Control State
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLogDiffrIntegr:" + InitialORFinal + " FuncName=" + FuncName);
    }

    public static void InitDiffIntegreSep() {
        ZeroTermSignFlag = false;
        ParanExprInProgressFlag = false;
        FuncName = "";
        MyParenDecodedSep = "";
        MyParenEncodedSep = "";
        NormalExprnFlag = true;
        FuncArgFlag = false;
    }

    public static void BackupDiffIntegreSep(Map<String, String> variablesBackupState) {
        variablesBackupState.put("ZeroTermSignFlag" + StrKeyBackUpRestore + depthBackUpRestore, "" + ZeroTermSignFlag);
        variablesBackupState.put("ParanExprInProgressFlag" + StrKeyBackUpRestore + depthBackUpRestore, "" + ParanExprInProgressFlag);
        variablesBackupState.put("FuncName" + StrKeyBackUpRestore + depthBackUpRestore, "" + FuncName);
        variablesBackupState.put("NormalExprnFlag" + StrKeyBackUpRestore + depthBackUpRestore, "" + NormalExprnFlag);
        variablesBackupState.put("FuncArgFlag" + StrKeyBackUpRestore + depthBackUpRestore, "" + FuncArgFlag);
    }

    public static void RestoreDiffIntegreSep(Map<String, String> variablesBackupState) {
        ZeroTermSignFlag = Boolean.parseBoolean(variablesBackupState.get("ZeroTermSignFlag" + StrKeyBackUpRestore + depthBackUpRestore));
        ParanExprInProgressFlag = Boolean.parseBoolean(variablesBackupState.get("ParanExprInProgressFlag" + StrKeyBackUpRestore + depthBackUpRestore));
        FuncName = variablesBackupState.get("FuncName" + StrKeyBackUpRestore + depthBackUpRestore);
        NormalExprnFlag = Boolean.parseBoolean(variablesBackupState.get("NormalExprnFlag" + StrKeyBackUpRestore + depthBackUpRestore));
        FuncArgFlag = Boolean.parseBoolean(variablesBackupState.get("FuncArgFlag" + StrKeyBackUpRestore + depthBackUpRestore));
    }
}
