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

import static Calculus.DiffrIntegrSep.BackupDiffIntegreSep;
import static Calculus.DiffrIntegrSep.FuncName;
import static Calculus.DiffrIntegrSep.InitDiffIntegreSep;
import static Calculus.DiffrIntegrSep.ParanExprInProgressFlag;
import static Calculus.DiffrIntegrSep.RestoreDiffIntegreSep;
import static Calculus.DiffrIntegrSep.StrDiff;
import static Calculus.DiffrIntegrSep.StrIntegr;
import static Calculus.DiffrIntegrSep.StrLADiff;
import static Calculus.DiffrIntegrSep.advanceOneFactor;
import static Calculus.DiffrIntegrSep.chDiff;
import static Calculus.DiffrIntegrSep.chIntegr;
import static Calculus.DiffrIntegrSep.chLADiff;
import static Calculus.DiffrIntegrSep.nextCharDiff;
import static Calculus.DiffrIntegrSep.nextCharIntegr;
import static Calculus.DiffrIntegrSep.posDiff;
import static Calculus.DiffrIntegrSep.posIntegr;
import static Calculus.DiffrIntegrSep.posLADiff;
import static Calculus.DiffrIntegrSep.prevCharDiff;
import static Calculus.DiffrIntegrSep.prevCharIntegr;
import static Calculus.MathematicalTestHarness.AutoGenSilentFlag;
import static Calculus.MathematicalTestHarness.DevelopmentDeepInfoFlag;
import static Calculus.MathematicalTestHarness.DevelopmentDeepInfoLambdaFlag;
import static Calculus.MathematicalTestHarness.DevelopmentFlag;
import static Calculus.MathematicalTestHarness.DevelopmentReasoningLambdaFlag;
import static Calculus.MathematicalTestHarness.GBLMyLogLevel;
import static Calculus.MathematicalTestHarness.GBLSilent;
import static Calculus.MathematicalTestHarness.GBLSilentDeepInfo;
import static Calculus.MathematicalTestHarness.GBLSilentDeepInfoLambda;
import static Calculus.MathematicalTestHarness.GBLSilentReasoningLambda;
import static Calculus.MathematicalTestHarness.HideInRecurseFlag;
import static Calculus.MathematicalTestHarness.MarianaTrenchReasoningLambdaFlag;
import static Calculus.MathematicalTestHarness.SuperDevelopmentFlag;
import static Calculus.MathsExpressionParser.StrExpr;
import static Calculus.MathsExpressionParser.chExpr;
import static Calculus.MathsExpressionParser.posExpr;
import static Calculus.UsageCalculus.DiffWithRespTo;
import static Calculus.UsageCalculus.EqnUnderTest;
import static Calculus.UsageCalculus.Order;
import static Calculus.UsageCalculus.StageMapping;
import static Calculus.UsageCalculus.TestCase;
import static Calculus.UsageCalculus.mainRegresssionHghLvlExprODETest;
import static Calculus.UsageCalculus.ruleAnalytics;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleUnaryOperator;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

/**
 *
 * @author Rajesh V Pai
 */
// Taken from stackoverflow.com (Expression):Evaluating a math 
// expression with variables (java 8):Created by StackOverflow User:Boann 
// Taken from stackoverflow.com:Evaluating a math 
// expression given in string form [closed]
//http://stackoverflow.com/questions/3422673/evaluating-a-math-expression-given-in-string-form
// Taken from stackoverflow.com (Expression):Evaluating a math 
// expression with variables (java 8) Created by User :Mike Scholtes
//http://stackoverflow.com/questions/40975678/evaluating-a-math-expression-with-variables-java-8
//Grammar Microsoft CoPilot
//<expression> ::= <term> | <expression> "+" <term> | <expression> "-" <term> 
//<term>       ::= <factor> | <term> "*" <factor> | <term> "/" <factor> | <term> "^" <factor>
//<factor>     ::= <number> | <identifier> | <function> | "(" <expression> ")"
//<function>   ::= <identifier> "(" <arguments> ")"
//<arguments>  ::= <expression> | <expression> "," <arguments>
//<number>     ::= <digit> | <digit> <number>
//<digit>      ::= "0" | "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9"
//<identifier> ::= <letter> | <letter> <identifier>
//<letter>     ::= "a" | "b" | "c" | ... | "z" | "A" | "B" | "C" | ... | "Z"
public class MathsContxtLAv {

    public static Logger log = Logger.getLogger(MathsContxtLAv.class.getName());

    // BackUp && Restore Variable
    public static int depthBackUpRestore = 0;
    public static String FileMathsBackUpRestore = "Maths";
    public static String StrKeyBackUpRestore = "";
    public static Stack<HashMap<String, String>> BackupRestoreStack = new Stack<>();

    public static Map<String, Double> variables = new HashMap<>();
    static Map<String, String> variablesStr = new HashMap<>();
    public static Map<String, DoubleUnaryOperator> functions = new HashMap<>();
    public static Map<String, DoubleBinaryOperator> multiArgFunctions = new HashMap<>();

    static String BC_SplitterDiff = "[\\^\\(\\/\\*\\-\\+\\)]";
    public static Map<String, String> functionsSimple = new HashMap<>();

    // Maximum number of Double Fractional Digits displayed in Equation
    private static int MaximumFractionDigits = 25;
    // Maximum number of Integer Digits displayed in Equation
    private static int MaximumIntegerDigits = 50;

    public static enum LogLevel {
        All(7), Debug(6), Info(5), Warn(4), Error(3), Fatal(2), Off(1);
        int level = 0;

        LogLevel(int level1) {
            this.level = level1;
        }
    }

    

    // Simple Expression & Simple Term character Index and Character Variable    
    public static int pos = -1, ch = -1;
    public static int chTerm = -1, posTerm = -1;
    public static String Str = "";
    public static boolean PerfFLAG = false;
    public static String StrCurrentTimeTaken = null;

    // PUBLIC VARIABLES USED IN OTHER FILES
    //IsAConstant Return Type 
    public static String StrIsAConstant = "";
    public static String FSMNumber = "";
    public static String StrIsAConstHigh = "";

    public static int ParenthesisHighLvlNum = 0;
    public static int ParenthesisCurrNum = 0;
    public static int OpenBraces = 1;
    public static int CloseBraces = 0;

    // Algebra & AlgebraTerm character Index and Character Variable    
    public static int posFunF = -1, chFunF = -1, posFunFLocal = -1;
    public static int posFunG = -1, chFunG = -1, posFunGLocal = -1;
    public static String StrFunF = "";
    public static String StrFunG = "";
    public static String[] StrAlgeTermFunF;
    public static String[] StrAlgeTermFunG;

    public static boolean ParenthesisFlag = false;
    public static boolean NormalNotPareFlag = true;
    public static int SavedOperator = 0;
    public static int ParenthesisOperator = 0;
    public static String MyParenDecoded = "";
    public static String MyParenEncoded = "";

    public static int posLA = -1, chLA = -1;
    public static int posVar = -1, chVar = -1;
    public static int posSign = -1, chSign = -1, chTermSign = -1;
    public static int posOrder = -1, chOrder = -1;
    public static int posIndConst = -1, chIndConst = -1;

    public static int LookAheadOperator = 0;

    public static String StrTerm = "";
    public static String StrSign = "";
    public static String StrLA = "";
    public static String StrVar = "";
    public static String StrIndConst = "";
    public static String StrOrder = "";

    public static int NumCoeff = 0;
    private static int CoeffCoeff = 0;

    //Global Common Flags for each Interface
    public static boolean ParanExprFlag = false;
    // SimpleTerm Interface Variables 
    public static boolean ComplexAssignFlag = false;
    public static boolean GotVariableFlag = false;
    public static int GotVariablePos = 0;
    public static boolean GotExpntNumFlag = false;
    public static int TermOperatorPos = -1;
    public static double TermOutput = 0.0;
    public static double TermOutputIndConst = 0.0;
    public static boolean GotExtremityFlag = false;
    public static boolean GotIndConstFlag = false;
    public static int GotIndConstPos = 0;
    public static String TempIndConstBase = "";
    public static boolean TempIndConstStrSet = false;
    public static boolean TrailConstantFlag = false;
    public static int TrailConstantOperator = -1;
    public static int timesLoop = 0;
    public static boolean ContainsXFlag = false;
    public static boolean ContainsIndConstFlag = false;
    public static boolean TermOutputSetFlag = false;
    public static int TermOutputOperator = -1;
    public static int LATermOperatorBraces = -1;
    public static int LAPreTermOperator = -1;
    public static int LATermOperator = -1;
    public static int LAVarTermOperator = -1;
    public static int LAPreIndConstOperator = -1;
    public static int LAIndConstOperator = -1;
    public static int LAMAPOperator = -1;
    public static int LADyYByDxMAPOperator = -1;
    public static boolean LAVarSimpleMapFlag = false;
    public static boolean LAVarComplexMapFlag = false;
    public static int DiffTermOperator = -1;
    public static int LADiffFactorOperator = -1;
    public static int LADiffIndConstOperator = -1;
    public static String LastInvokedFlag = "";
    public static int LastInvokedPos = -1;
    public static int LastLADiffIndConstAidPos = -1;
    public static int LastLADiffExtremityAidPos = -1;
    public static int LastLADiffConstCoeffAidPos = -1;
    public static boolean ParseMapposModFlag = false;
    public static boolean ZeroTermSignFlag = false;
    public static String LastExpr = "";
    public static boolean TermOutputAddedOnceFlag = false;

    public static Stack<String> BracketStack = new Stack<String>();

    // Maximum Order of the Term or Expression
    public static double MaxTermOutput = 0.0;
    public static String FunctionStr = "";
    public static boolean ContainsFuncFlag = false;
    public static boolean LAConstSimpleMapFlag = false;
    public static boolean LAConstComplexMapFlag = false;

    //Function Argument Flag
    public static boolean GotBracesVarFlag = false;
    public static int GotParenPos = -1;
    public static int GotBracesCount = -1;
    public static int GotBracesCountCurr = -1;
    // Diff Interface Variables 
    public static String FactorsExpr = "";
    public static String FactorsDiffExpr = "";
    public static String FunctionExpr = "";
    public static String FunctionDiffExpr = "";
    public static String FunctionName = "";
    public static String ParanExpr = "";
    public static String ParanDiffExpr = "";
    public static boolean EnteredLAConstFlag = false;
    public static boolean DiffConstSimpleMapFlag = false;
    public static boolean DiffConstComplexMapFlag = false;

    public static boolean TerminateFlag = false;
    public static boolean SteadyStateFlag = false;
    public static boolean TermCompleteFlag = false;
    public static List<ParenWithOperator> extractresults = new ArrayList<>();
    public static List<String> xTerms = new ArrayList<>();
    public static List<String> otherTerms = new ArrayList<>();
    public static List<String> ConstantTerms = new ArrayList<>();
    public static List<String> MixedExpressionTerms = new ArrayList<>();

    /**
     * Simple pair of (preceding operator, content).
     */
    public static class ParenWithOperator {

        public final String operator; // "*", "/", "^" or null at start
        public final String content; // text inside the parentheses

        public ParenWithOperator(String content, String operator) {
            this.content = content;
            this.operator = operator;
        }

        @Override
        public String toString() {
            return "operator='" + operator + "', content='" + content + "'";
        }
    }

    public static void MyFuncExpress() {
//        functions.put("sqrt", x -> Math.sqrt(x));
//        functions.put("sin", x -> Math.sin(Math.toRadians(x)));
//        functions.put("cos", x -> Math.cos(Math.toRadians(x)));
//        functions.put("tan", x -> Math.tan(Math.toRadians(x)));
//        functions.put("round", x -> Math.round(x));
//        functions.put("abs", x -> Math.abs(x));
//        functions.put("ceil", x -> Math.ceil(x));
//        functions.put("floor", x -> Math.floor(x));
//        functions.put("log", x -> Math.log10(x));
//        functions.put("ln", x -> Math.log(x));
//        functions.put("exp", x -> Math.exp(x));
functions.put("sin", Math::sin);
functions.put("cos", Math::cos);
functions.put("tan", Math::tan);
functions.put("asin", Math::asin);
functions.put("acos", Math::acos);
functions.put("atan", Math::atan);
functions.put("sqrt", Math::sqrt);
functions.put("cbrt", Math::cbrt);
functions.put("abs", Math::abs);
functions.put("log", Math::log10); // base-10 logarithm
functions.put("ln", Math::log); // natural logarithm
functions.put("exp", Math::exp);
functions.put("ceil", Math::ceil);
functions.put("floor", Math::floor);
functions.put("round", x -> (double) Math.round(x));
functions.put("signum", Math::signum);
        // This is a bug workaround for CONFORMAL MAPPING
        // As we are doing Str.replaceall(DiffWithRespTo,"y")
//        functions.put("eyp", x -> Math.exp(x));
//        functions.put("le", x -> Math.log(x));
//        //TODO:More Unary Functions to be added
// Single-argument functions


// Multi-argument functions
multiArgFunctions.put("pow", Math::pow);
multiArgFunctions.put("max", Math::max);
multiArgFunctions.put("min", Math::min);

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

    static void nextChar() {
        ++pos;
        ch = (pos < Str.length()) ? Str.charAt(pos) : -1;
        if ((ch == -1) && (pos >= Str.length())) {
            pos = Str.length();
        } else if ((ch == -1) || ((ch == 0))) {
            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "nextChar:nextChar:Unexpected: " + (char) ch + " int=" + (int) ch + " Cannot Format:" + Str.substring(pos, Str.length()));
        }
    }

    static void prevChar() {
        --pos;
        ch = (pos >= 0) ? Str.charAt(pos) : -1;
        if ((ch == -1) && (pos < 0)) 
            ; else if ((ch == -1) || ((ch == 0))) {
            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "prevChar:prevChar:Unexpected: " + (char) ch + " int=" + (int) ch + " Cannot Format:" + Str.substring(pos, Str.length()));
        }
    }

    static boolean eat(int CharToEat) {
        while (ch == ' ') {
            nextChar();
        }
        if (ch == CharToEat) {
            nextChar();
            return true;
        }
        return false;
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

    void SyncChar() {
        if ((pos < Str.length())
                && (Str.charAt(pos) != ch)) {
            if (Str.charAt(pos + 1) == ch) {
                pos++;
            } else if (Str.charAt(pos - 1) == ch) {
                pos--;
            }
        }
    }

    static boolean FatalCharSet(int CurrChar, String CharSet) {
        CharSequence Temp = "" + CurrChar;
        if (!CharSet.contains(Temp)) {
            return true;
        }
        return false;
    }

    public static int Max(int a, int b) {
        if ((a < -1) && (b < -1)) {
            return -1;
        }
        if (a >= b) {
            return a;
        } else {
            return b;
        }

    }

    public static void ParseMapAPI(String AlgoName, int strlength, int StartPos, int DiffLength, String DiffWithRespTo) {
        if (AlgoName.equalsIgnoreCase("LookAheadVar:parseVar")) {
            if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                log.info("ParseMap:Initial:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA);
                log.info("ParseMap:Initial:AlgoName=" + AlgoName + " GotVariableFlag=" + GotVariableFlag + " ComplexAssignFlag=" + ComplexAssignFlag + " GotVariablePos=" + GotVariablePos + " TrailConstantFlag=" + TrailConstantFlag);
            }
            if ((TrailConstantFlag == false) && (ParenthesisFlag == false)) {
                if (posVar < (StrVar.length())) {
                    posTerm = posVar + 1;
                    chTerm = chVar;
                } else {
                    posTerm = -1;
                    chTerm = -1;
                }
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("ParseMap:Var:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA);
                }
            } else if ((ParenthesisFlag == false) && (ContainsFuncFlag == false)) {
                if ((TrailConstantFlag == true) && (GotVariableFlag == true) || (ComplexAssignFlag == true)) {
//                    posLA = GotVariablePos;
//                    if (posLA < StrVar.length()) {
//                        posTerm = posLA;
//                        chTerm = StrTerm.charAt(posTerm);
//                        chLA = chTerm;
//                    } else {
//                        posTerm = -1;
//                        chTerm = -1;
//                    }
                }
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("ParseMap:Var:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA);
                }
                ContainsFuncFlag = false;
            }
//            else {
//                StrParen = Str;
//                posParen = pos;
//                chParen = StrParen.charAt(posParen);
//              if (GBLMyLogLevel.level >= LogLevel.Info.level) {
//                log.info("ParseMap:Var:Braces:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA + " posParen=" + posParen + " chParen=" + (char) chParen);
//              }
//            }
            if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                log.info("ParseMap:Final:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA);
                log.info("ParseMap:Final:AlgoName=" + AlgoName + " GotVariableFlag=" + GotVariableFlag + " ComplexAssignFlag=" + ComplexAssignFlag + " GotVariablePos=" + GotVariablePos + " TrailConstantFlag=" + TrailConstantFlag);
            }

        } else if (AlgoName.equalsIgnoreCase("LookAheadConst:parseLA")) {
            if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                log.info("ParseMap:Initial:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA + " LATermOperator=" + (char) LATermOperator);
                log.info("ParseMap:Initial:AlgoName=" + AlgoName + " GotVariableFlag=" + GotVariableFlag + " ComplexAssignFlag=" + ComplexAssignFlag + " GotVariablePos=" + GotVariablePos + " TrailConstantFlag=" + TrailConstantFlag);
            }
            if ((GotVariableFlag == true) || (ComplexAssignFlag == true)) {
                posVar = GotVariablePos;
                if ((posVar >= 0) && (posVar < StrLA.length())) {
                    chTerm = StrLA.charAt(posVar);
                } else {
                    posTerm = -1;
                    chTerm = -1;
                }
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("ParseMap:GotVariableFlag:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA + " LATermOperator=" + (char) LATermOperator);
                }
            } else if ((TrailConstantFlag == true) && (ContainsIndConstFlag == false)) {
                if (ComplexAssignFlag == true) {
                    if (posLA < StrLA.length()) {
                        posTerm = posLA + 1;
                        chTerm = StrTerm.charAt(posTerm);
                        chLA = chTerm;
                    } else {
                        posTerm = -1;
                        chTerm = -1;
                    }
                }
                //TrailConstantFlag=false;
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("ParseMap:ContainsIndConstFlag:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA + " LATermOperator=" + (char) LATermOperator);
                }
            } else if ((TrailConstantFlag == true) && (ContainsIndConstFlag == true)) {
                if (posLA < StrLA.length()) {
                    posTerm = pos;
                    StrTerm = Str;
                    chTerm = StrTerm.charAt(posTerm);
                } else {
                    posTerm = -1;
                    chTerm = -1;
                }
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("ParseMap:TrailConstantFlag:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA + " LATermOperator=" + (char) LATermOperator);
                }
            } else if (ContainsIndConstFlag == true) {
                if (posLA < StrLA.length()) {
                    posTerm = pos;
                    StrTerm = Str;
                    chTerm = StrTerm.charAt(posTerm);
                } else {
                    posTerm = -1;
                    chTerm = -1;
                }
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("ParseMap:ContainsIndConstFlag:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA);
                }
            } else if (chLA == -1) {
                posTerm = -1;
                chTerm = -1;
                pos = -1;
                ch = -1;
                Str = "";
                StrTerm = "";
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("ParseMap:Last Char:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA);
                }
            }
            if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                log.info("ParseMap:Final:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA + " LATermOperator=" + (char) LATermOperator);
                log.info("ParseMap:Final:AlgoName=" + AlgoName + " GotVariableFlag=" + GotVariableFlag + " ComplexAssignFlag=" + ComplexAssignFlag + " GotVariablePos=" + GotVariablePos + " TrailConstantFlag=" + TrailConstantFlag);
            }

        } else if (AlgoName.equalsIgnoreCase("SimpleTerm:Max:parseSimple")) {
            if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                log.info("ParseMap:Initial:AlgoName=" + AlgoName + " Str.length()=" + Str.length() + " pos=" + pos + " ch=" + (char) ch + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA + " posSign=" + posSign + " chSign=" + (char) chSign);
            }
            if ((DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                System.out.println("ParseMap:SimpleTerm:Max:parseSimple:Initial:AlgoName=" + AlgoName + " Str.length()=" + Str.length() + " pos=" + pos + " ch=" + (char) ch + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA + " posSign=" + posSign + " chSign=" + (char) chSign);
            }
            if (pos >= 0) {
                pos = advanceOneTerm(Str, pos);
                if (pos > -1) {
                    ch = Str.charAt(pos);
                } else {
                    ch = -1;
                }
            } else {
                pos = -1;
                ch = -1;
            }
            resetSimpleTermParsers();
            if ((DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                System.out.println("ParseMap:SimpleTerm:Max:parseSimple:Final:AlgoName=" + AlgoName + " Str.length()=" + Str.length() + " pos=" + pos + " ch=" + (char) ch + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA + " posSign=" + posSign + " chSign=" + (char) chSign);
            }
            return;
        } else if (AlgoName.equalsIgnoreCase("LookAheadSign:parseSign")) {
            if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                log.info("ParseMap:Initial:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA + " chTermSign=" + (char) chTermSign + " chSign=" + (char) chSign + " strlength=" + strlength);
            }
            if ((strlength == -1) && (chTermSign == 0) && (chTerm == '+')) {
                chTermSign = '-';
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("ParseMap:Rule1:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA + " chTermSign=" + (char) chTermSign + " chSign=" + (char) chSign + " strlength=" + strlength);
                }
                ReasoningSignLambda x = parseReasonSign(StrSign, AlgoName, "Sign:Rule1:", (StrSign.substring(StartPos)), strlength, chTermSign, chTerm, DiffWithRespTo);
            } else if ((strlength == 1) && (chTermSign == 0) && (chTerm == '+')) {
                chTermSign = '+';
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("ParseMap:Rule2:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA + " chTermSign=" + (char) chTermSign + " chSign=" + (char) chSign + " strlength=" + strlength);
                }
                ReasoningSignLambda x = parseReasonSign(StrSign, AlgoName, "Sign:Rule2:", (StrSign.substring(StartPos)), strlength, chTermSign, chTerm, DiffWithRespTo);
            } else if ((strlength == 0) && (chSign == '+')) {
                chTermSign = '+';
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("ParseMap:Rule3:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA + " chTermSign=" + (char) chTermSign + " chSign=" + (char) chSign + " strlength=" + strlength);
                }
                ReasoningSignLambda x = parseReasonSign(StrSign, AlgoName, "Sign:Rule3:", (StrSign.substring(StartPos)), strlength, chTermSign, chTerm, DiffWithRespTo);
            } else if ((strlength == 0) && (chSign == '-')) {
                chTermSign = '-';
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("ParseMap:Rule4:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA + " chTermSign=" + (char) chTermSign + " chSign=" + (char) chSign + " strlength=" + strlength);
                }
                ReasoningSignLambda x = parseReasonSign(StrSign, AlgoName, "Sign:Rule4:", (StrSign.substring(StartPos)), strlength, chTermSign, chTerm, DiffWithRespTo);
            } //First Term Code for Sign Computation
            else if ((strlength == 1) && (chTermSign == 0) && (pos == 0) && (chTerm == '-')) {
                chTermSign = '-';
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("ParseMap:Rule5.1:First Term Rule:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA + " chTermSign=" + (char) chTermSign + " chSign=" + (char) chSign + " strlength=" + strlength);
                }
                ReasoningSignLambda x = parseReasonSign(StrSign, AlgoName, "Sign:Rule5.1:", (StrSign.substring(StartPos)), strlength, chTermSign, chTerm, DiffWithRespTo);
            } else if ((strlength == 1) && (chTermSign == 0) && (pos == 0)) {
                chTermSign = '+';
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("ParseMap:Rule5.2:First Term Rule:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA + " chTermSign=" + (char) chTermSign + " chSign=" + (char) chSign + " strlength=" + strlength);
                }
                ReasoningSignLambda x = parseReasonSign(StrSign, AlgoName, "Sign:Rule5.2:", (StrSign.substring(StartPos)), strlength, chTermSign, chTerm, DiffWithRespTo);
            } //Last Term Code for Sign Computation
            else if ((strlength == 1) && (chTermSign == 0) && (chTerm == '-')) {
                chTermSign = '-';
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("ParseMap:Rule6:Last Term Rule:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA + " chTermSign=" + (char) chTermSign + " chSign=" + (char) chSign + " strlength=" + strlength);
                }
                ReasoningSignLambda x = parseReasonSign(StrSign, AlgoName, "Sign:Rule6:", (StrSign.substring(StartPos)), strlength, chTermSign, chTerm, DiffWithRespTo);
            } else if (((chLA != 0) && (chLA != -1)) && (StrSign != null) && (!StrSign.equalsIgnoreCase("")) && (StartPos > 0) && ((StrSign.charAt(0) != '+') && (StrSign.charAt(0) != '-'))) {
                chTermSign = chLA;
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("ParseMap:Rule7:Last Term Rule:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA + " chTermSign=" + (char) chTermSign + " chSign=" + (char) chSign + " strlength=" + strlength);
                }
                ReasoningSignLambda x = parseReasonSign(StrSign, AlgoName, "Sign:Rule7:", (StrSign.substring(StartPos)), strlength, chTermSign, chTerm, DiffWithRespTo);
            } else if (((chVar != 0) && (chVar != -1)) && (StrSign != null) && (!StrSign.equalsIgnoreCase("")) && (StartPos > 0) && ((StrSign.charAt(0) != '+') && (StrSign.charAt(0) != '-'))) {
                chTermSign = chVar;
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("ParseMap:Rule8:Last Term Rule:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA + " chTermSign=" + (char) chTermSign + " chSign=" + (char) chSign + " strlength=" + strlength);
                }
                ReasoningSignLambda x = parseReasonSign(StrSign, AlgoName, "Sign:Rule8:", (StrSign.substring(StartPos)), strlength, chTermSign, chTerm, DiffWithRespTo);
            } //Middle Terms Code for Sign Computation
            else if ((strlength == 1) && (chTermSign == 0) && (chTerm == '-') && (chSign != 0) & (chSign != -1)) {
                chTermSign = '-';
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("ParseMap:Rule9:Middle Term Rule:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA + " chTermSign=" + (char) chTermSign + " chSign=" + (char) chSign + " strlength=" + strlength);
                }
                ReasoningSignLambda x = parseReasonSign(StrSign, AlgoName, "Sign:Rule9:", (StrSign.substring(StartPos)), strlength, chTermSign, chTerm, DiffWithRespTo);
            } else if ((strlength == 1) && (chTermSign == 0) && (chTerm == '+')) {
                chTermSign = '+';
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("ParseMap:Rule10:Middle Term Rule:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA + " chTermSign=" + (char) chTermSign + " chSign=" + (char) chSign + " strlength=" + strlength);
                }
                ReasoningSignLambda x = parseReasonSign(StrSign, AlgoName, "Sign:Rule10:", (StrSign.substring(StartPos)), strlength, chTermSign, chTerm, DiffWithRespTo);
            } else if ((strlength == -1) && (chTermSign == 0) && (ch == '-') && (pos == 0)) {
                chTermSign = '+';
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("ParseMap:Rule11:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA + " chTermSign=" + (char) chTermSign + " chSign=" + (char) chSign + " strlength=" + strlength);
                }
                ReasoningSignLambda x = parseReasonSign(StrSign, AlgoName, "Sign:Rule11:", (StrSign.substring(StartPos)), strlength, chTermSign, chTerm, DiffWithRespTo);
            } else if ((strlength == -1) && (chTermSign == 0) && (ch == '-') && (chTerm == '-')) {
                chTermSign = '+';
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("ParseMap:Rule12:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA + " chTermSign=" + (char) chTermSign + " chSign=" + (char) chSign + " strlength=" + strlength);
                }
                ReasoningSignLambda x = parseReasonSign(StrSign, AlgoName, "Sign:Rule12:", (StrSign.substring(StartPos)), strlength, chTermSign, chTerm, DiffWithRespTo);
            } else if ((strlength == -1) && (chTermSign == 0) && (chTerm == '-')) {
                chTermSign = '+';
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("ParseMap:Rule13:Last Term Rule:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA + " chTermSign=" + (char) chTermSign + " chSign=" + (char) chSign + " strlength=" + strlength);
                }
                ReasoningSignLambda x = parseReasonSign(StrSign, AlgoName, "Sign:Rule13:", (StrSign.substring(StartPos)), strlength, chTermSign, chTerm, DiffWithRespTo);
            } else if ((strlength == -1) && (chTermSign == 0)) {
                chTermSign = '-';
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("ParseMap:Rule14:Last Term Rule:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA + " chTermSign=" + (char) chTermSign + " chSign=" + (char) chSign + " strlength=" + strlength);
                }
                ReasoningSignLambda x = parseReasonSign(StrSign, AlgoName, "Sign:Rule14:", (StrSign.substring(StartPos)), strlength, chTermSign, chTerm, DiffWithRespTo);
            } else if ((strlength == 1) && (chTerm == '-')) {
                chTermSign = '-';
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("ParseMap:Rule15:Last Term Rule:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA + " chTermSign=" + (char) chTermSign + " chSign=" + (char) chSign + " strlength=" + strlength);
                }
                ReasoningSignLambda x = parseReasonSign(StrSign, AlgoName, "Sign:Rule15:", (StrSign.substring(StartPos)), strlength, chTermSign, chTerm, DiffWithRespTo);
            }
            if ((chTermSign == 0) && (strlength == -1)) {
                chTermSign = '-';
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("ParseMap:Rule16:Last Term Rule:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA + " chTermSign=" + (char) chTermSign + " chSign=" + (char) chSign + " strlength=" + strlength);
                }
                ReasoningSignLambda x = parseReasonSign(StrSign, AlgoName, "Sign:Rule16:", (StrSign.substring(StartPos)), strlength, chTermSign, chTerm, DiffWithRespTo);
            } else if ((chTermSign == 0) && (strlength == 1)) {
                chTermSign = '+';
                if ((posTerm == -1) && (pos < Str.length()) && (pos > -1)) {
                    pos = pos - 1;
                    chTermSign = Str.charAt(pos);
                }
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("ParseMap:Rule17:Last Term Rule:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA + " chTermSign=" + (char) chTermSign + " chSign=" + (char) chSign + " strlength=" + strlength);
                }
                ReasoningSignLambda x = parseReasonSign(StrSign, AlgoName, "Sign:Rule17:", (StrSign.substring(StartPos)), strlength, chTermSign, chTerm, DiffWithRespTo);
            }
            if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                log.info("ParseMap:Final:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA + " chTermSign=" + (char) chTermSign + " chSign=" + (char) chSign + " strlength=" + strlength);
            }

        } else if (AlgoName.equalsIgnoreCase("LookAheadDiffConst:parseLADiff:Diff")) {
            if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                log.info("ParseMap:Initial:AlgoName=" + AlgoName + " posDiff=" + posDiff + " chDiff=" + (char) chDiff + " posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff + " GotVariablePos=" + GotVariablePos + " GotIndConstPos=" + GotIndConstPos + " DiffLength=" + DiffLength + " LastLADiffIndConstAidPos=" + LastLADiffIndConstAidPos);
                log.info("ParseMap:Final:AlgoName=" + AlgoName + " GotVariableFlag=" + GotVariableFlag + " ComplexAssignFlag=" + ComplexAssignFlag + " GotVariablePos=" + GotVariablePos + " TrailConstantFlag=" + TrailConstantFlag + " ContainsIndConstFlag=" + ContainsIndConstFlag);
                log.info("ParseMap:Initial:AlgoName=" + AlgoName + " StrLADiff=" + StrLADiff.substring(posLADiff));
                log.info("ParseMap:Initial:AlgoName=" + AlgoName + " StrDiff=" + StrDiff.substring(posDiff) + " ContainsIndConstFlag=" + ContainsIndConstFlag + " LastLADiffIndConstAidPos=" + LastLADiffIndConstAidPos + " LastLADiffExtremityAidPos=" + LastLADiffExtremityAidPos + " GotExtremityFlag=" + GotExtremityFlag);
            }
            if ((DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                System.out.println("ParseMap:Initial:AlgoName=" + AlgoName + " StrDiff.length()=" + StrDiff.length() + " posLADiff=" + posLADiff + " posDiff=" + posDiff + " pos=" + pos + " ch=" + (char) ch + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA + " posSign=" + posSign + " chSign=" + (char) chSign);
            }
            if (posDiff >= 0) {
                posDiff = advanceOneFactor(StrDiff, posDiff);
                if (posDiff > -1) {
                    chDiff = StrDiff.charAt(posDiff);
                } else {
                    chDiff = -1;
                }
            } else {
                posDiff = -1;
                chDiff = -1;
            }
        } else if (AlgoName.equalsIgnoreCase("LookAheadDiffConst:parseLADiff:Integration")) {
            if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                log.info("ParseMap:Initial:AlgoName=" + AlgoName + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr + " posLADiff=" + posLADiff + " chLA=" + (char) chLADiff + " GotVariablePos=" + GotVariablePos + " GotIndConstPos=" + GotIndConstPos + " DiffLength=" + DiffLength + " LastLADiffIndConstAidPos=" + LastLADiffIndConstAidPos + " LastLADiffConstCoeffAidPos=" + LastLADiffConstCoeffAidPos);
                log.info("ParseMap:Initial:AlgoName=" + AlgoName + " GotExpntNumFlag=" + GotExpntNumFlag + " ContainsIndConstFlag=" + ContainsIndConstFlag + " ContainsXFlag=" + ContainsXFlag);
                log.info("ParseMap:Initial:AlgoName=" + AlgoName + " StrIntegr=" + StrIntegr.substring(posIntegr));
            }
            if ((ContainsIndConstFlag == true) && (posIntegr < StrIntegr.length()) && (LastLADiffIndConstAidPos >= 0)) {
                if (ComplexAssignFlag == false) {
                    posIntegr = posIntegr + LastLADiffIndConstAidPos - 1;
                    if ((posIntegr >= 0) && (posIntegr < StrIntegr.length())) {
                        if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                            log.info("ParseMap:ContainsIndConstFlag:ComplexAssignFlag:AlgoName=" + AlgoName + " StrIntegr=" + StrIntegr.substring(posIntegr));
                        }
                    }
                } else if ((ComplexAssignFlag == true) && (GotVariablePos >= 0)) {
                    posIntegr = posIntegr + GotVariablePos - 1;
                    if ((posIntegr >= 0) && (posIntegr < StrIntegr.length())) {
                        if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                            log.info("ParseMap:ContainsIndConstFlag:ComplexAssignFlag:AlgoName=" + AlgoName + " StrIntegr=" + StrIntegr.substring(posIntegr));
                        }
                    }
                }
                while ((posIntegr < StrIntegr.length()) && (!IsOperator(StrIntegr.charAt(posIntegr)))) {
                    prevCharIntegr();
                    if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                        log.info("ParseMap:Loop:AlgoName=" + AlgoName + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr + " posLA=" + posLA + " chLA=" + (char) chLA + " GotVariablePos=" + GotVariablePos + " GotIndConstPos=" + GotIndConstPos + " DiffLength=" + DiffLength + " LastLADiffIndConstAidPos=" + LastLADiffIndConstAidPos + " LastLADiffConstCoeffAidPos=" + LastLADiffConstCoeffAidPos);
                    }
                }
                if (posIntegr < StrIntegr.length()) {
                    chIntegr = StrIntegr.charAt(posIntegr);
                } else {
                    posIntegr = StrIntegr.length();
                    chIntegr = -1;
                }
                if (posIntegr < StrIntegr.length()) {
                    chIntegr = StrIntegr.charAt(posIntegr);
                }
                ContainsIndConstFlag = false;
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("ParseMap:ContainsIndConstFlag == true:AlgoName=" + AlgoName + " StrIntegr=" + StrIntegr.substring(posIntegr));
                    log.info("ParseMap:ContainsIndConstFlag == true:AlgoName=" + AlgoName + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr + " posLA=" + posLA + " chLA=" + (char) chLA + " GotVariablePos=" + GotVariablePos + " GotIndConstPos=" + GotIndConstPos + " DiffLength=" + DiffLength + " LastLADiffIndConstAidPos=" + LastLADiffIndConstAidPos + " LastLADiffConstCoeffAidPos=" + LastLADiffConstCoeffAidPos);
                }
            } else if ((LastLADiffConstCoeffAidPos >= 0)) {
                posIntegr++;
                while ((posIntegr >= 0) && (posIntegr < StrIntegr.length())
                        && (!IsOperator(StrIntegr.charAt(posIntegr)))) {
                    nextCharIntegr();
                }
                if ((posIntegr >= 0) && (posIntegr < StrIntegr.length())) {
                    chIntegr = StrIntegr.charAt(posIntegr);
                    if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                        log.info("ParseMap:LastLADiffConstCoeffAidPos>0:If:posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                    }
                } else if ((posIntegr == -1)) {
                    posIntegr = StrIntegr.length();
                    chIntegr = -1;
                    if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                        log.info("ParseMap:LastLADiffConstCoeffAidPos>0:Else If:posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                    }
                } else if (posIntegr >= StrIntegr.length()) {
                    if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                        log.info("ParseMap:LastLADiffConstCoeffAidPos>0:Else If:posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                    }
                    posIntegr = StrIntegr.length();
                    chIntegr = -1;
                    if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                        log.info("ParseMap:LastLADiffIndConstAidPos>0:Else If:posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                    }
                } else {
                    if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                        log.info("ParseMap:LastLADiffConstCoeffAidPos>0:Else:posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                    }
                    chIntegr = StrIntegr.charAt(posIntegr);
                    if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                        log.info("ParseMap:LastLADiffConstCoeffAidPos>0:Else:posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                    }
                }
                ParseMapposModFlag = true;
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("ParseMap:LastLADiffConstCoeffAidPos>0:AlgoName=" + AlgoName + " StrIntegr=" + StrIntegr.substring(posIntegr));
                    log.info("ParseMap:LastLADiffConstCoeffAidPos:AlgoName=" + AlgoName + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr + " posLA=" + posLA + " chLA=" + (char) chLA + " GotVariablePos=" + GotVariablePos + " GotIndConstPos=" + GotIndConstPos + " DiffLength=" + DiffLength + " LastLADiffIndConstAidPos=" + LastLADiffIndConstAidPos + " LastLADiffConstCoeffAidPos=" + LastLADiffConstCoeffAidPos);
                }
            } else if ((LastLADiffIndConstAidPos >= 0)) {
                if ((posIntegr >= 0) && (posIntegr < StrIntegr.length())) {
                    chIntegr = StrIntegr.charAt(posIntegr);
                    if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                        log.info("ParseMap:LastLADiffIndConstAidPos>0:If:posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                    }
                } else if ((posIntegr == -1)) {
                    posIntegr = StrIntegr.length();
                    chIntegr = -1;
                    if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                        log.info("ParseMap:LastLADiffIndConstAidPos>0:Else If:posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                    }
                } else if (posIntegr >= StrIntegr.length()) {
                    if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                        log.info("ParseMap:LastLADiffIndConstAidPos>0:Else If:posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                    }
                    posIntegr = StrIntegr.length();
                    chIntegr = -1;
                    if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                        log.info("ParseMap:LastLADiffIndConstAidPos>0:Else If:posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                    }
                } else {
                    if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                        log.info("ParseMap:LastLADiffIndConstAidPos>0:Else:posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                    }
                    chIntegr = StrIntegr.charAt(posIntegr);
                    if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                        log.info("ParseMap:LastLADiffIndConstAidPos>0:Else:posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                    }
                }
                ParseMapposModFlag = true;
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("ParseMap:LastLADiffIndConstAidPos>0:AlgoName=" + AlgoName + " StrIntegr=" + StrIntegr.substring(posIntegr));
                    log.info("ParseMap:LastLADiffIndConstAidPos:AlgoName=" + AlgoName + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr + " posLA=" + posLA + " chLA=" + (char) chLA + " GotVariablePos=" + GotVariablePos + " GotIndConstPos=" + GotIndConstPos + " DiffLength=" + DiffLength + " LastLADiffIndConstAidPos=" + LastLADiffIndConstAidPos + " LastLADiffConstCoeffAidPos=" + LastLADiffConstCoeffAidPos);
                }
            } else {
                if (posIntegr < StrIntegr.length()) {
                    chIntegr = StrIntegr.charAt(posIntegr);
                } else {
                    posIntegr = StrIntegr.length();
                    chIntegr = -1;
                }
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("ParseMap:Else:AlgoName=" + AlgoName + " StrIntegr=" + StrIntegr.substring(posIntegr));
                    log.info("ParseMap:Else:AlgoName=" + AlgoName + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr + " posLA=" + posLA + " chLA=" + (char) chLA + " GotVariablePos=" + GotVariablePos + " GotIndConstPos=" + GotIndConstPos + " DiffLength=" + DiffLength + " LastLADiffIndConstAidPos=" + LastLADiffIndConstAidPos + " LastLADiffConstCoeffAidPos=" + LastLADiffConstCoeffAidPos);
                }
            }
            if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                log.info("ParseMap:Final:AlgoName=" + AlgoName + " GotExpntNumFlag=" + GotExpntNumFlag + " ContainsIndConstFlag=" + ContainsIndConstFlag);
                log.info("ParseMap:Final:AlgoName=" + AlgoName + " GotVariableFlag=" + GotVariableFlag + " ComplexAssignFlag=" + ComplexAssignFlag + " GotVariablePos=" + GotVariablePos + " TrailConstantFlag=" + TrailConstantFlag + " ContainsIndConstFlag=" + ContainsIndConstFlag);
                log.info("ParseMap:Final:AlgoName=" + AlgoName + " StrIntegr=" + StrIntegr.substring(posIntegr));
                log.info("ParseMap:Final:AlgoName=" + AlgoName + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr + " posLA=" + posLA + " chLA=" + (char) chLA + " GotVariablePos=" + GotVariablePos + " GotIndConstPos=" + GotIndConstPos + " DiffLength=" + DiffLength + " LastLADiffIndConstAidPos=" + LastLADiffIndConstAidPos + " LastLADiffConstCoeffAidPos=" + LastLADiffConstCoeffAidPos);
            }
        } else if (AlgoName.equalsIgnoreCase("LookAheadDiffConst:Max:parseLADiff:Integration")) {
            if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                log.info("ParseMap:Initial:AlgoName=" + AlgoName + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr + " posLADiff=" + posLADiff + " chLA=" + (char) chLADiff + " GotVariablePos=" + GotVariablePos + " GotIndConstPos=" + GotIndConstPos + " DiffLength=" + DiffLength + " LastLADiffIndConstAidPos=" + LastLADiffIndConstAidPos + " LastLADiffConstCoeffAidPos=" + LastLADiffConstCoeffAidPos);
                log.info("ParseMap:Initial:AlgoName=" + AlgoName + " GotExpntNumFlag=" + GotExpntNumFlag + " ContainsIndConstFlag=" + ContainsIndConstFlag + " ContainsXFlag=" + ContainsXFlag);
                log.info("ParseMap:Initial:AlgoName=" + AlgoName + " StrIntegr=" + StrIntegr.substring(posIntegr));
            }
            int MyposMax = -1;
            boolean Flag = false;
            MyposMax = Max(posLADiff, posIntegr);
            if (MyposMax > -1) {
                posIntegr = posIntegr + MyposMax;
                if ((posIntegr > -1) && (posIntegr < StrIntegr.length())) {
                    chIntegr = StrIntegr.charAt(posIntegr);
                } else {
                    chIntegr = -1;
                }
            } else {
                posIntegr = -1;
                chIntegr = -1;
            }
            if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                log.info("ParseMap:Final:AlgoName=" + AlgoName + " GotExpntNumFlag=" + GotExpntNumFlag + " ContainsIndConstFlag=" + ContainsIndConstFlag);
                log.info("ParseMap:Final:AlgoName=" + AlgoName + " GotVariableFlag=" + GotVariableFlag + " ComplexAssignFlag=" + ComplexAssignFlag + " GotVariablePos=" + GotVariablePos + " TrailConstantFlag=" + TrailConstantFlag + " ContainsIndConstFlag=" + ContainsIndConstFlag);
                log.info("ParseMap:Final:AlgoName=" + AlgoName + " StrIntegr=" + StrIntegr.substring(posIntegr));
                log.info("ParseMap:Final:AlgoName=" + AlgoName + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr + " posLA=" + posLA + " chLA=" + (char) chLA + " GotVariablePos=" + GotVariablePos + " GotIndConstPos=" + GotIndConstPos + " DiffLength=" + DiffLength + " LastLADiffIndConstAidPos=" + LastLADiffIndConstAidPos + " LastLADiffConstCoeffAidPos=" + LastLADiffConstCoeffAidPos);
            }
        } else if (AlgoName.equalsIgnoreCase("Integr:parseTermIntegr:")) {
            if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                log.info("ParseMap:Initial:AlgoName=" + AlgoName + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr + " posLADiff=" + posLADiff + " chLA=" + (char) chLADiff + " GotVariablePos=" + GotVariablePos + " GotIndConstPos=" + GotIndConstPos + " DiffLength=" + DiffLength + " LastLADiffIndConstAidPos=" + LastLADiffIndConstAidPos + " LastLADiffConstCoeffAidPos=" + LastLADiffConstCoeffAidPos);
                log.info("ParseMap:Initial:AlgoName=" + AlgoName + " StrIntegr(posIntegr)=" + StrIntegr.substring(posIntegr));
            }
            if (posIntegr == -1) {
                chIntegr = StrIntegr.charAt(0);
            } else {
                chIntegr = StrIntegr.charAt(posIntegr - 1);
            }
            if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                log.info("ParseMap:Final:AlgoName=" + AlgoName + " StrIntegr(posIntegr)=" + StrIntegr.substring(posIntegr) + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
                log.info("ParseMap:Final:AlgoName=" + AlgoName + " posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr + " posLA=" + posLA + " chLA=" + (char) chLA + " GotVariablePos=" + GotVariablePos + " GotIndConstPos=" + GotIndConstPos + " DiffLength=" + DiffLength + " LastLADiffIndConstAidPos=" + LastLADiffIndConstAidPos + " LastLADiffConstCoeffAidPos=" + LastLADiffConstCoeffAidPos);
            }
        } else if (AlgoName.equalsIgnoreCase("SimpleAlgebra:parseSimple:StrFunF")) {
            if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                log.info("ParseMap:Initial:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posFunF=" + posFunF + " chFunF=" + (char) chFunF);
            }
            pos = posFunF;
            Str = StrFunF;
            if ((pos >= 0) && (pos < Str.length())) {
                ch = Str.charAt(pos);
            } else {
                ch = -1;
            }
            if (GBLMyLogLevel.level >= LogLevel.Fatal.level) {
                log.fatal("ParseMap:Final:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posFunF=" + posFunF + " chFunF=" + (char) chFunF);
            }
        } else if (AlgoName.equalsIgnoreCase("SimpleAlgebra:parseSimple:StrFunF-SteadyState")) {
            if (GBLMyLogLevel.level >= LogLevel.Fatal.level) {
                log.fatal("ParseMap:Initial:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posFunF=" + posFunF + " chFunF=" + (char) chFunF);
            }
            pos = posFunF;
            Str = StrFunF;
            if ((pos >= 0) && (pos < Str.length())) {
                ch = Str.charAt(pos);
            } else {
                ch = -1;
            }
            if (GBLMyLogLevel.level >= LogLevel.Fatal.level) {
                log.fatal("ParseMap:Final:AlgoName=" + AlgoName + " StrFunF=" + StrFunF + " pos=" + pos + " posFunF=" + posFunF + " posFunFLocal=" + posFunFLocal);
                log.fatal("ParseMap:Final:AlgoName=" + AlgoName + " StrFunG=" + StrFunG + " posFunG=" + posFunG);
                log.fatal("ParseMap:Final:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posFunF=" + posFunF + " chFunF=" + (char) chFunF);
            }
        } else if (AlgoName.equalsIgnoreCase("SimpleAlgebra:parseSimple:StrFunG")) {
            if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                log.info("ParseMap:Initial:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posFunG=" + posFunG + " chFunG=" + (char) chFunG);
            }
            if ((posFunG == StrFunG.length() - 1) && (posFunF == StrFunF.length() - 1)) {
                pos = -1;
                posFunF = -1;
                posFunG = -1;
                Str = "";
            } else {
                pos = posFunG;
                Str = StrFunG;
            }
            if ((pos >= 0) && (pos < Str.length())) {
                ch = Str.charAt(pos);
            } else if (!Str.equalsIgnoreCase("")) {
                ch = Str.charAt(0);
            }
            if (GBLMyLogLevel.level >= LogLevel.Fatal.level) {
                log.fatal("ParseMap:Final:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posFunG=" + posFunG + " chFunG=" + (char) chFunG);
            }
        }
        if ((DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
            System.out.println("ParseMap:Final:AlgoName=" + AlgoName + " posLADiff=" + posLADiff + " posDiff=" + posDiff + " pos=" + pos + " ch=" + (char) ch + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA + " posSign=" + posSign + " chSign=" + (char) chSign);
        }
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

    public static void resetSimpleTermParsers() {
        posIndConst = -1;
        posVar = -1;
        posLA = -1;
        posSign = -1;
        chLA = -1;
        chVar = -1;
        chIndConst = -1;
        chSign = -1;
        resetOperatorControlSet();
    }

    public static void resetOperatorControlSet() {
        TrailConstantFlag = false;
        TrailConstantOperator = -1;
        LATermOperator = -1;
        LATermOperatorBraces = -1;
        LAPreIndConstOperator = -1;
        LAIndConstOperator = -1;
        LAVarTermOperator = -1;
        LAPreTermOperator = -1;
        LAMAPOperator = -1;
        LADyYByDxMAPOperator = -1;
        LAConstSimpleMapFlag = false;
        LAConstComplexMapFlag = false;
        LAVarSimpleMapFlag = false;
        LAVarComplexMapFlag = false;
    }

    public static void ParseStore(String AlgoName) {
        if (AlgoName.equalsIgnoreCase("StrFunF")) {
            if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                log.info("ParseStore:Initial:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posFunF=" + posFunF + " chFunF=" + (char) chFunF);
            }
            if ((pos != -1) && (posFunF >= 0) && ((pos >= 0) && (pos < Str.length()))) {
                chFunF = StrFunF.charAt(0);
                Str = StrFunF;
                posFunF = pos;
                ch = Str.charAt(pos);
            } else {
                chFunF = StrFunF.charAt(0);
                Str = StrFunF;
                pos = 0;
                posFunF = 0;
                ch = Str.charAt(0);
            }
            StrFunF = Str;
            chFunF = Str.charAt(pos);
            if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                log.info("ParseStore:Final:AlgoName=" + AlgoName + " Str=" + Str.substring(pos));
                log.info("ParseStore:Final:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posFunF=" + posFunF + " chFunF=" + (char) chFunF + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA);
            }
        } else if (AlgoName.equalsIgnoreCase("StrFunG")) {
            if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                log.info("ParseStore:Initial:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posFunG=" + posFunG + " chFunG=" + (char) chFunG);
            }
            if ((pos != -1) && (posFunG >= 0) && ((pos >= 0) && (pos < Str.length()))) {
                chFunG = StrFunG.charAt(0);
                Str = StrFunG;
                posFunG = pos;
                ch = Str.charAt(pos);
            } else {
                if (!StrFunG.equalsIgnoreCase("")) {
                    chFunG = StrFunG.charAt(0);
                }
                if (!StrFunG.equalsIgnoreCase("")) {
                    Str = StrFunG;
                }
                pos = 0;
                posFunG = 0;
                if (!Str.equalsIgnoreCase("")) {
                    ch = Str.charAt(pos);
                }
            }
            StrFunG = Str;
            if (!Str.equalsIgnoreCase("")) {
                chFunG = Str.charAt(pos);
            }
            if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                log.info("ParseStore:Final:AlgoName=" + AlgoName + " Str=" + Str.substring(pos));
                log.info("ParseStore:Final:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posFunG=" + posFunG + " chFunG=" + (char) chFunG + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA);
            }
        } else if (AlgoName.equalsIgnoreCase("StrFunF-Inf")) {
            if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                log.info("ParseStore:Initial:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posFunF=" + posFunF + " chFunF=" + (char) chFunF);
            }
            if ((pos != -1) && (posFunF >= 0) && ((pos >= 0) && (pos < Str.length()))) {
                chFunF = StrFunF.charAt(0);
                Str = StrFunF;
                pos = posFunF;
                ch = Str.charAt(pos);
            } else {
                chFunF = StrFunF.charAt(0);
                Str = StrFunF;
                pos = posFunF;
                ch = Str.charAt(pos);
            }
            StrFunF = Str;
            chFunF = Str.charAt(pos);
            if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                log.info("ParseStore:Final:AlgoName=" + AlgoName + " Str=" + Str.substring(pos));
                log.info("ParseStore:Final:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posFunF=" + posFunF + " chFunF=" + (char) chFunF + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA);
            }
        } else if (AlgoName.equalsIgnoreCase("StrFunG-Inf")) {
            if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                log.info("ParseStore:Initial:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posFunG=" + posFunG + " chFunG=" + (char) chFunG);
            }
            if ((pos != -1) && (posFunG >= 0) && ((pos >= 0) && (pos < Str.length()))) {
                chFunG = StrFunG.charAt(0);
                Str = StrFunG;
                pos = posFunG;
                ch = Str.charAt(pos);
            } else {
                if (!StrFunG.equalsIgnoreCase("")) {
                    chFunG = StrFunG.charAt(0);
                }
                Str = StrFunG;
                pos = posFunG;
                if (!Str.equalsIgnoreCase("")) {
                    ch = Str.charAt(pos);
                }
            }
            StrFunG = Str;
            if (!Str.equalsIgnoreCase("")) {
                chFunG = Str.charAt(pos);
            }
            if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                log.info("ParseStore:Final:AlgoName=" + AlgoName + " Str=" + Str.substring(pos));
                log.info("ParseStore:Final:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posFunG=" + posFunG + " chFunG=" + (char) chFunG + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA);
            }
        } else if (AlgoName.equalsIgnoreCase("StrFunG-Inf-SteadyState")) {
            if (GBLMyLogLevel.level >= LogLevel.Fatal.level) {
                log.fatal("ParseStore:Initial:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posFunG=" + posFunG + " chFunG=" + (char) chFunG);
            }
            if ((pos != -1) && (posFunG >= 0) && ((pos >= 0) && (pos < StrFunG.length()))) {
                if (GBLMyLogLevel.level >= LogLevel.Fatal.level) {
                    log.fatal("ParseStore:Initial:AlgoName=" + AlgoName + "Rule1");
                }
                chFunG = StrFunG.charAt(posFunG);
                Str = StrFunG;
                posFunG = pos;
                ch = Str.charAt(pos);
            } else if (pos == -1) {
                if (GBLMyLogLevel.level >= LogLevel.Fatal.level) {
                    log.fatal("ParseStore:Initial:AlgoName=" + AlgoName + "Rule2");
                }
                Str = StrFunG;
                ch = Str.charAt(posFunG);
                pos = posFunG;
            } else if ((posFunG == -1) && (pos != -1)) {
                if (GBLMyLogLevel.level >= LogLevel.Fatal.level) {
                    log.fatal("ParseStore:Initial:AlgoName=" + AlgoName + "Rule3");
                }
                Str = StrFunG;
                ch = Str.charAt(pos);
                posFunG = pos;
                chFunG = StrFunG.charAt(posFunG);
            } else {
                pos = 0;
                posFunG = 0;
                Str = StrFunG;
            }
            if (GBLMyLogLevel.level >= LogLevel.Fatal.level) {
                log.fatal("ParseStore:Final:AlgoName=" + AlgoName + " Str=" + Str.substring(pos));
                log.fatal("ParseStore:Final:AlgoName=" + AlgoName + " pos=" + pos + " ch=" + (char) ch + " posFunG=" + posFunG + " chFunG=" + (char) chFunG + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " posVar=" + posVar + " chVar=" + (char) chVar + " posLA=" + posLA + " chLA=" + (char) chLA);
            }
        }
    }

    public static String RemoveEDbl(double Number) {
        String StrNumber = "" + Number;
        if ((StrNumber.contains("E")) || (StrNumber.contains("e"))) {
            NumberFormat formatter = new DecimalFormat();
            formatter.setMaximumFractionDigits(MaximumFractionDigits);
            formatter.setMaximumIntegerDigits(MaximumIntegerDigits);
            if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                log.info("RemoveEDbl:Number=" + Number);
                log.info("RemoveEDbl:Formatted Number=" + formatter.format(Number));
            }
            return formatter.format(Number);
        }
        return (StrNumber);
    }

    public static String StrRemoveEDbl(String Number) {
        if ((Number.contains("E")) || (Number.contains("e"))) {
            NumberFormat formatter = new DecimalFormat("#.##");
            formatter.setMaximumFractionDigits(MaximumFractionDigits);
            formatter.setMaximumIntegerDigits(MaximumIntegerDigits);
            if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                log.info("StrRemoveEDbl:Number=" + Number);
                log.info("StrRemoveEDbl:Formatted Number=" + formatter.format(Number));
            }
            return formatter.format(Number);
        }
        return Number;
    }

    public static boolean IsAConstant(String StrX1, String DiffWithRespTo) {
        FSMNumber = "";
        try {
            StrIsAConstant = "Unknown";
            if ((StrX1.contains("(")) && (StrX1.contains(")"))) {
                StrX1 = StrX1.replaceAll("\\(", "").replaceAll("\\)", "");
            }
            if ((StrX1.startsWith("+")) || (StrX1.startsWith("-"))) {
                StrX1 = StrX1.replaceAll("\\+", "").replaceAll("\\-", "");
            }
            String StrX = StrX1;
            if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant);
                log.info("IsAConstant:StrX=" + StrX);
                log.info("IsAConstant:DiffWithRespTo=" + DiffWithRespTo);
            }
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
                    && (StrX.matches("[\\-\\+]*[0-9\\.]+[Ee]*[\\-\\+]*[0-9]*"))
                    //&& (!StrX.matches("[\\-\\+]*[a-zA-Z0-9]+"))
                    && (Double.isFinite(Double.valueOf(StrX)))) {
                StrIsAConstant = "Number";
                FSMNumber = "1";
                //if ((DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) 
                //System.out.println("IsAConstant:FSMNumber=" + FSMNumber + " StrIsAConstant=" + StrIsAConstant);
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                }
                return true;
            } else if ((StrX != null)
                    && (!StrX.equalsIgnoreCase(""))
                    && (!StrX.contains(DiffWithRespTo))
                    && (StrX.matches("[\\+\\-\\*/^]*[a-zA-Z]+[0-9]*"))) {
                StrIsAConstant = "IndConstant";
                FSMNumber = "2";
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                }
                //if ((DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose")))
                //System.out.println("IsAConstant:FSMNumber=" + FSMNumber + " StrIsAConstant=" + StrIsAConstant);
                return false;
            } else if ((StrX != null)
                    && (!StrX.equalsIgnoreCase(""))
                    && (!StrX.contains(DiffWithRespTo))
                    && ((StrX.matches("[\\-\\+\\*/^]*[0-9\\.]+[Ee]*[\\-\\+\\*/^]*[0-9\\.]+"))
                    || (StrX.matches("^[+-]?(?:\\d+(?:\\.\\d*)?|\\.\\d+)(?:\\s*[-+*/^]\\s*[+-]?(?:\\d+(?:\\.\\d*)?|\\.\\d+))*$"))) //&& (StrX.matches("[-+]?(?:\d*\.\d+|\d+)")) 
                    ) {
                StrIsAConstant = "NumberExpression";
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                }
                FSMNumber = "3";
                if ((DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                    System.out.println("IsAConstant:FSMNumber=" + FSMNumber + " StrIsAConstant=" + StrIsAConstant);
                }
                return true;
            } else if ((StrX != null)
                    && (!StrX.equalsIgnoreCase(""))
                    && (!StrX.contains(DiffWithRespTo))
                    && (StrX.matches("^[+-]?([0-9]+(\\\\.[0-9]*)?|\\\\.[0-9]+)([-+*/^][+-]?([0-9]+(\\\\.[0-9]*)?|\\\\.[0-9]+))*([Ee][+-]?[0-9]+)?$")) //&&(StrX.matches("^[+-]?(?:\\d+(?:\\.\\d*)?|\\.\\d+)(?:\\s*[-+*/^]\\s*[+-]?(?:\\d+(?:\\.\\d*)?|\\.\\d+))*$")) ){
                    //&& (StrX.matches("[-+]?(?:\d*\.\d+|\d+)")) 
                    ) {
                StrIsAConstant = "NumberExpression";
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                }
                FSMNumber = "4";
                if ((DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                    System.out.println("IsAConstant:FSMNumber=" + FSMNumber + " StrIsAConstant=" + StrIsAConstant);
                }
                return true;
            } else if ((StrX != null)
                    && (!StrX.equalsIgnoreCase(""))
                    && (!StrX.equalsIgnoreCase(DiffWithRespTo))
                    && (!StrX.contains(DiffWithRespTo))
                    && (StrX.matches("[\\+\\-\\*/\\^]*[a-zA-Z]+[0-9]*[\\^]*[0-9\\.]+"))) {
                StrIsAConstant = "IndConstantExpression";
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                }
                FSMNumber = "5";
                if ((DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                    System.out.println("IsAConstant:FSMNumber=" + FSMNumber + " StrIsAConstant=" + StrIsAConstant);
                }
                return false;
            } else if ((StrX != null)
                    && (!StrX.equalsIgnoreCase(""))
                    && (StrX.equalsIgnoreCase(DiffWithRespTo))
                    && (StringUtils.countMatches(StrX, DiffWithRespTo) == 1)
                    && (StrX.matches("[\\+\\-\\*\\^/]*[a-zA-Z0-9]+"))) {
                StrIsAConstant = "Var";
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                }
                FSMNumber = "6";
//                /if ((DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose")))
                //System.out.println("IsAConstant:FSMNumber=" + FSMNumber + " StrIsAConstant=" + StrIsAConstant);
                return false;
            } else if ((StrX != null)
                    && (!StrX.equalsIgnoreCase(""))
                    && (((StrX.contains(DiffWithRespTo)) && (StringUtils.countMatches(StrX, DiffWithRespTo) == 1))
                    || ((StrX.contains(DiffWithRespTo)) && (StringUtils.countMatches(StrX, DiffWithRespTo) > 1))) //&& (StrX.matches("[\\+\\-\\*\\^/]*[a-zA-Z0-9]+"))
                    ) {
                StrIsAConstant = "VarExpression";
                FSMNumber = "7";
                if ((DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                    System.out.println("IsAConstant:FSMNumber=" + FSMNumber + " StrIsAConstant=" + StrIsAConstant);
                }
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                }
                return false;
            } else if ((StrX != null)
                    && (!StrX.equalsIgnoreCase(""))
                    && (StrX.contains(DiffWithRespTo))
                    && (StrX.equalsIgnoreCase(DiffWithRespTo))) {
                StrIsAConstant = "VarExpression";
                FSMNumber = "8";
                if ((DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                    System.out.println("IsAConstant:FSMNumber=" + FSMNumber + " StrIsAConstant=" + StrIsAConstant);
                }
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                }
                return false;
            } else if ((StrIsAConstant.equalsIgnoreCase("Unknown")) && (StrX != null)
                    && (!StrX.equalsIgnoreCase(""))
                    && (!StrX.contains(DiffWithRespTo))
                    && ((StrX.contains("E-")) || (StrX.contains("E+")) || (StrX.contains("e+")) || (StrX.contains("e-")))
                    && (Double.isFinite(Double.valueOf(StrX)))) {
                StrIsAConstant = "Number";
                FSMNumber = "9";
                //if ((DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose")))
                //System.out.println("IsAConstant:FSMNumber=" + FSMNumber + " StrIsAConstant=" + StrIsAConstant);
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                }
                return true;
            } else if (StrIsAConstant.equalsIgnoreCase("Unknown") && (StrX != null)
                    && (!StrX.equalsIgnoreCase(""))
                    && (StrX.matches("[\\+\\-]*[a-zA-Z0-9\\.]+"))
                    && (StrX.matches(DiffWithRespTo))) {
                StrIsAConstant = "VarExpression";
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                }
                FSMNumber = "10";
                //if ((DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose")))
                //System.out.println("IsAConstant:FSMNumber=" + FSMNumber + " StrIsAConstant=" + StrIsAConstant);
                return false;
            } else if ((StrX != null)
                    && (!StrX.equalsIgnoreCase(""))
                    && (!StrX.contains(DiffWithRespTo))
                    && ((StrX.matches("[\\+\\-]*[0-9\\.\\+\\-\\*\\^/]+[0-9\\.\\+\\-*\\^/]*"))
                    || (StrX.matches("[\\+\\-]*[0-9\\.\\*/]*\\^[0-9\\.\\*\\^/]+")))) {
                StrIsAConstant = "NumberExpression";
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                }
                FSMNumber = "11";
                if ((DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                    System.out.println("IsAConstant:FSMNumber=" + FSMNumber + " StrIsAConstant=" + StrIsAConstant);
                }
                return true;
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
                FSMNumber = "12";
                //if ((DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose")))
                //System.out.println("IsAConstant:FSMNumber=" + FSMNumber + " StrIsAConstant=" + StrIsAConstant);
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
                FSMNumber = "13";
                //if ((DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose")))
                //System.out.println("IsAConstant:FSMNumber=" + FSMNumber + " StrIsAConstant=" + StrIsAConstant);
                log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                return false;
            } else if ((StrIsAConstant.equalsIgnoreCase("Unknown") && (StrX != null)
                    && (!StrX.equalsIgnoreCase(""))
                    && (!StrX.contains(DiffWithRespTo))
                    && ((StrX.matches("[\\+\\-]*[a-zA-Z0-9\\.\\*\\^/]+[\\+\\-]*[0-9\\.]*"))
                    || (StrX.matches("[\\+\\-]*[0-9\\.\\*/]*\\^[a-zA-Z]+[0-9\\.\\*\\^/]+"))))) {
                StrIsAConstant = "IndConstantExpression";
                FSMNumber = "14";
                if ((DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                    System.out.println("IsAConstant:FSMNumber=" + FSMNumber + " StrIsAConstant=" + StrIsAConstant);
                }
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                }
                return false;
            } else if ((StrIsAConstant.equalsIgnoreCase("Unknown")) && (StrX != null)
                    && (!StrX.equalsIgnoreCase(""))
                    && (!StrX.contains(DiffWithRespTo))
                    && ((StrX.matches("[\\+\\-]*[a-zA-Z0-9\\.\\*\\^/]+[\\+\\-]*[0-9\\.]*"))
                    || (StrX.matches("[\\+\\-]*[0-9\\.\\*/]*\\^[a-zA-Z]+[0-9\\.\\*\\^/]+"))
                    || (StrX.matches("^([a-zA-Z_][a-zA-Z0-9_]*|[\\+\\-]?(?:[0-9]+(?:\\\\.[0-9]*)?|\\.[0-9]+))([\\+\\-*/^]([a-zA-Z_][a-zA-Z0-9_]*|[\\+\\-]?(?:[0-9]+(?:\\.[0-9]*)?|\\.[0-9]+)))*$")))) {
                StrIsAConstant = "IndConstantExpression";
                FSMNumber = "15";
                if ((DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                    System.out.println("IsAConstant:FSMNumber=" + FSMNumber + " StrIsAConstant=" + StrIsAConstant + " StrX=" + StrX);
                }
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                }
                return false;
            } else if ((StrX != null)
                    && (!StrX.equalsIgnoreCase(""))
                    && (!StrX.contains(DiffWithRespTo))
                    && ((StrX.matches("[\\+\\-]*[a-zA-Z0-9\\.\\+\\-\\*\\^/]+[\\+\\-]*[0-9\\.]*"))
                    || (StrX.matches("[\\+\\-]*[0-9\\.\\*/\\^]*\\^[a-zA-Z0-9\\.\\+\\-\\*\\^/]*")))
                    && (!StrX.contains("\\("))
                    && (!StrX.contains("\\)"))) {
                StrIsAConstant = "Expression";
                FSMNumber = "16";
                if ((DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                    System.out.println("IsAConstant:FSMNumber=" + FSMNumber + " StrIsAConstant=" + StrIsAConstant);
                }
                log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                return false;
            } else if ((StrX != null)
                    && (!StrX.equalsIgnoreCase(""))
                    && (StrX.contains(DiffWithRespTo))
                    && (StringUtils.countMatches(StrX, ")") == 1)) {
                StrIsAConstant = "VarExpressionFunction:1";
                FSMNumber = "17";
                //if ((DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose")))
                //System.out.println("IsAConstant:FSMNumber=" + FSMNumber + " StrIsAConstant=" + StrIsAConstant);
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                }
                return false;
            } else if ((StrX != null)
                    && (!StrX.equalsIgnoreCase(""))
                    && (StrX.contains(DiffWithRespTo))
                    && (StringUtils.countMatches(StrX, ")") > 1)) {
                StrIsAConstant = "VarExpressionFunction";
                FSMNumber = "18";
                //if ((DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose")))
                //System.out.println("IsAConstant:FSMNumber=" + FSMNumber + " StrIsAConstant=" + StrIsAConstant);
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
                }
                return false;
            }
//                boolean NumericFlag=false;
//                boolean IndConstantFlag=false;
//                char c=0;
//                char prevC=0;
//                int i=0;
//                for (i=0; i < StrX.length(); i++){
//                    c=StrX.charAt(i);
//                    if (Character.isSpaceChar(c)){
//                        StrX=eatAll(StrX,' ');
//                        i=-1;
//                        continue;
//                    }
//                    //System.out.println("IsAConstant:ForLoop:c=" + c);
//                    if ((Character.isDigit(c)) ||( (NumericFlag)&&(Character.isDigit(prevC)&&(IsOperator(c))) ) ){
//                        NumericFlag=true;
//                        IndConstantFlag=false;
//                    }else if ((Character.isLetter(c)) || ( (IndConstantFlag)&&(Character.isLetter(prevC)&&(IsOperator(c))) ) ){
//                        NumericFlag=false;
//                        IndConstantFlag=true;
//                    }
//                    else if ((c != '(' )&&(c != ')' )&&(!IsOperator(c))){
//                        NumericFlag=false;
//                        IndConstantFlag=false;
//                    }
//                    prevC=c;
//                    }
//                if ((NumericFlag)&&(i == StrX.length()) ){
//                    StrIsAConstant = "NumberExpression";
//                    FSMNumber="17";
            //if ((DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose")))
//                    System.out.println("IsAConstant:FSMNumber=" + FSMNumber + " StrIsAConstant=" + StrIsAConstant + " StrX=" + "t"+StrX+"t");
//                    return true;
//                }else if ( (IndConstantFlag)&&(i == StrX.length()) ){
//                    StrIsAConstant = "IndConstantExpression";
//                    FSMNumber="18";
            //if ((DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose")))
//                    System.out.println("IsAConstant:FSMNumber=" + FSMNumber + " StrIsAConstant=" + StrIsAConstant + " StrX=" + "t"+StrX+"t");
//                    return false;
//                }
        } catch (NumberFormatException ConstExp) {
            if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                log.info("IsAConstant:Exception:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
            }
        }
        if (GBLMyLogLevel.level >= LogLevel.Info.level) {
            log.info("IsAConstant:StrIsAConstant=" + StrIsAConstant + " DiffWithRespTo=" + DiffWithRespTo);
        }
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

    public static boolean IsAlphaNumberSpecial(int Mych) {
        return ((((Mych >= 'a') && (Mych <= 'z')) || ((Mych >= 'A') && (Mych <= 'Z')))
                || ((Mych >= '0') && (Mych <= '9'))
                || ((Mych == '_') || (Mych == '@') || (Mych == '$') || (Mych == '#') || (Mych == '#')));
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
        if ( (mypos > 1) && (prev == 'e' || prev == 'E')
                ) {
            return true;
        }
        return false;
    }

    /**
     * Returns true if character at expr[pos] is within a term: either a
     * digit/letter/dot, or a unary '+' or '-'.
     */
    private static boolean isWithinTerm(String Expr, int mypos) {
        //if (mypos < 0 || mypos >= Expr.length()) return false;

        char c = Expr.charAt(mypos);
        return (Character.isLetterOrDigit(c) || c == '.'
                || ((c == '+' || c == '-') && isUnarySign(Expr, mypos)));
    }

    private static boolean isNextCharWithinTerm(String Expr, int mypos) {
        if (Expr == null || mypos + 1 >= Expr.length()) {
            return false;
        }
        return isWithinTerm(Expr, mypos + 1);
    }

    public static void ResetVars(String MyExpr) {
        if (MyExpr.equalsIgnoreCase("ResetSimpleExpr")) {
            //Simple Expression
            pos = -1;
            ch = -1;
            NumCoeff = 0;
            ParenthesisFlag = false;
            NormalNotPareFlag = true;
            SavedOperator = 0;
            ContainsFuncFlag = false;
            ContainsXFlag = false;
            ContainsXFlag = false;
            ContainsIndConstFlag = false;
            GotIndConstFlag = false;
        } else if (MyExpr.equalsIgnoreCase("ResetSimpleTerm")) {
            //Simple SimpleTerm
            ParenthesisFlag = false;
            NormalNotPareFlag = true;
            SavedOperator = 0;
            ComplexAssignFlag = false;
            TrailConstantFlag = false;
            timesLoop = 0;
            GotVariableFlag = false;
            GotExpntNumFlag = false;
            LastInvokedFlag = "";
            GotExtremityFlag = false;
            TrailConstantOperator = -1;
            LATermOperatorBraces = -1;
            LATermOperator = -1;
            LAVarTermOperator = -1;
            LAIndConstOperator = -1;
            LAPreTermOperator = -1;
            LAMAPOperator = -1;
            LADyYByDxMAPOperator = -1;
            ContainsFuncFlag = false;
            ContainsXFlag = false;
            ContainsIndConstFlag = false;
            GotIndConstFlag = false;
        } else if (MyExpr.equalsIgnoreCase("DiffExpr")) {
            //Diff Expression
            posDiff = 0;
            chDiff = 0;
            NumCoeff = 0;
            ParenthesisFlag = false;
            NormalNotPareFlag = true;
            SavedOperator = 0;
            ParenthesisOperator = 0;
            DiffTermOperator = -1;
            LastLADiffIndConstAidPos = -1;
            LastLADiffConstCoeffAidPos = -1;
            ContainsIndConstFlag = false;
            GotExtremityFlag = false;
            ContainsFuncFlag = false;
            ContainsXFlag = false;
        } else if (MyExpr.equalsIgnoreCase("IntegrExpr")) {
            //Integre Expression
            posIntegr = 0;
            chIntegr = 0;
            NumCoeff = 0;

            ParenthesisFlag = false;
            NormalNotPareFlag = true;
            SavedOperator = 0;
            DiffTermOperator = -1;
            LastLADiffIndConstAidPos = -1;
            LastLADiffConstCoeffAidPos = -1;
            ContainsIndConstFlag = false;
            GotExtremityFlag = false;
            GotExpntNumFlag = false;
            ParseMapposModFlag = false;
            ContainsFuncFlag = false;
            ContainsXFlag = false;
        } else if (MyExpr.equalsIgnoreCase("ResetControlVars")) {
            //End Of Simple Term Reset;
            ComplexAssignFlag = false;
            TrailConstantFlag = false;
            timesLoop = 0;
            GotVariableFlag = false;
            GotExpntNumFlag = false;
            LastInvokedFlag = "";
            GotExtremityFlag = false;
            TrailConstantOperator = -1;
            LATermOperatorBraces = -1;
            LATermOperator = -1;
            LAVarTermOperator = -1;
            LAIndConstOperator = -1;
            LAPreTermOperator = -1;
            LAMAPOperator = -1;
            LADyYByDxMAPOperator = -1;
            ContainsFuncFlag = false;
            LastExpr = "";
            TermOutputAddedOnceFlag = false;
        }
    }




//Created by Rajesh Pai
    @FunctionalInterface
    public interface LookAheadSign {

        int eval();
    }

    public static LookAheadSign parseSign(String str, int StartPos, String DiffWithRespTo, Boolean HideAllFlag) {

        return new Object() {
            void nextCharSign() {
                ++posSign;
                chSign = (posSign < StrSign.length()) ? StrSign.charAt(posSign) : -1;
                if ((chSign == -1) && (posSign >= StrSign.length())) {
                    posSign = StrSign.length();
                } else if ((chSign == -1) || ((chSign == 0))) {
                    throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "LookAheadSign:nextCharSign:Unexpected: " + (char) chSign + " int=" + (int) chSign + " Cannot Format:" + StrSign.substring(posSign, StrSign.length()));
                }
            }

            boolean eatSign(int CharToEat) {
                while (chSign == ' ') {
                    nextCharSign();
                }
                if (chSign == CharToEat) {
                    nextCharSign();
                    return true;
                }
                return false;
            }
            LookAheadSign parseSign() {
                LookAheadSign x = (() -> 1);
                StrSign = str;
                chTermSign = 0;
                ParenthesisFlag = false;
                NormalNotPareFlag = true;
                ParenthesisOperator = 0;
                GotBracesVarFlag = false;
                if (LastExpr.equalsIgnoreCase("LookAheadParen")) {
                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadSign:parseSign:LastExpr=" + LastExpr + " StrTerm=" + StrTerm);
                        System.out.println("LookAheadSign:parseSign:chSign=" + (char) chSign + " StrSign=" + StrSign);
                    }
                    posSign = 0;
                    if (StrSign.length() >= 1) {
                        chSign = StrSign.charAt(posSign);
                    }
                } else if (posTerm == -1) {
                    posSign = 0;
                    if (StrSign.length() >= 1) {
                        chSign = StrSign.charAt(posSign);
                    }
                } else if ((pos == -1)) {
                    posSign = 0;
                    chSign = StrSign.charAt(posSign);
                } else if ((StrSign.length() > 0) && (pos > 0)) {
                    posSign = 0;
                    chSign = StrSign.charAt(posSign);
                } else {
                    posSign = 0;
                    chSign = StrSign.charAt(posSign);
                }
                int startpos = posSign;
                if ((chSign == '+') || (chSign == '-')) {
                    nextCharSign();
                }
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("LookAheadSign:parseSign:StartPos=" + StartPos + " startpos=" + startpos);
                }
                ParseLog("LookAheadSign", "parseSign", "Initial", "StrSign", StrSign);
                if ((StrSign != null) && (StrSign.length() > 0)
                        && (StrSign.length() < 2)
                        && ((chSign == '*')
                        || (chSign == '/')
                        || (chSign == '^'))) {
                    return x;
                } else {
                    x = parseTerm();
                }
                if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                    log.info("LookAheadSign:parseSign:Number:x.eval()=" + x.eval() + " posSign=" + posSign + " chSign=" + (char) chSign);
                }
                ParseLog("LookAheadSign", "parseSign", "BeforeMap", "StrSign", StrSign);
                if (!LastExpr.equalsIgnoreCase("LookAheadParen")) {
                    ParseMapAPI("LookAheadSign:parseSign", x.eval(), startpos, 0, DiffWithRespTo);
                }
                ParseLog("LookAheadSign", "parseSign", "Final", "StrSign", StrSign);
                return x;
            }

            LookAheadSign parseTerm() {
                LookAheadSign x = (() -> 1);
                x = parseFactor();
                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                    System.out.println("LookAheadSign:parseTerm:Initial:x.eval()=" + x.eval());
                    System.out.println("LookAheadSign:parseTerm:Initial:chSign=" + (char) chSign + " posSign=" + posSign + " StrSign=" + StrSign);
                }
                for (;;) {
                    if (eatSign('*')) { // multiplication
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadSign:parseTerm:*:Entered:x.eval()=" + x.eval());
                            System.out.println("LookAheadSign:parseTerm:*:Entered:chSign=" + (char) chSign + " posSign=" + posSign + " StrSign=" + StrSign);
                        }
                        LookAheadSign a = x, b = parseFactor();
                        if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                            log.info("LookAheadSign:parseTerm:b.eval()=" + b.eval() + " posSign=" + posSign + " chSign=" + (char) chSign);
                        }
                        x = (() -> (a.eval() * b.eval()));
                        if (GBLMyLogLevel.level >= LogLevel.Info.level) {
                            log.info("LookAheadSign:parseTerm:x.eval()=" + x.eval() + " posSign=" + posSign + " chSign=" + (char) chSign);
                        }
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadSign:parseTerm:*:x.eval()=" + x.eval());
                            System.out.println("LookAheadSign:parseTerm:*:chSign=" + (char) chSign + " posSign=" + posSign + " StrSign=" + StrSign);
                        }
                    } else if (eatSign('/')) { // division
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadSign:parseTerm:/:Entered:x.eval()=" + x.eval());
                            System.out.println("LookAheadSign:parseTerm:/:Entered:chSign=" + (char) chSign + " posSign=" + posSign + " StrSign=" + StrSign);
                        }
                        LookAheadSign a = x, b = parseFactor();
                        log.info("LookAheadSign:parseTerm:b.eval()=" + b.eval() + " posSign=" + posSign + " chSign=" + (char) chSign);
                        x = (() -> a.eval() / b.eval());
                        log.info("LookAheadSign:parseTerm:x.eval()=" + x.eval() + " posSign=" + posSign + " chSign=" + (char) chSign);
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadSign:parseTerm:/:x.eval()=" + x.eval());
                            System.out.println("LookAheadSign:parseTerm:/:chSign=" + (char) chSign + " posSign=" + posSign + " StrSign=" + StrSign);
                        }
                    } else {
                        log.info("LookAheadSign:parseTerm:Return:x.eval()=" + x.eval() + " posSign=" + posSign + " chSign=" + (char) chSign);
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadSign:parseTerm:Return:x.eval()=" + x.eval());
                            System.out.println("LookAheadSign:parseTerm:Return:chSign=" + (char) chSign + " posSign=" + posSign + " StrSign=" + StrSign);
                        }
                        return x;
                    }
                }
            }

            LookAheadSign parseFactor() {
                int startPos = posSign;
                String Exponent = "";
                LookAheadSign x = (() -> 1);
                x = parseBase();
                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                    System.out.println("LookAheadSign:parseFactor:Initial:x.eval()=" + x.eval());
                    System.out.println("LookAheadSign:parseFactor:Initial:chSign=" + (char) chSign + " posSign=" + posSign + " StrSign=" + StrSign);
                }
                log.info("LookAheadSign:parseFactor:x.eval()=" + x.eval() + " posSign=" + posSign + " chSign=" + (char) chSign);
                for (;;) {
                    if (eatSign('^')) { // exponentiation
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadSign:parseTerm:^:Entered:x.eval()=" + x.eval());
                            System.out.println("LookAheadSign:parseTerm:^:Entered:chSign=" + (char) chSign + " posSign=" + posSign + " StrSign=" + StrSign);
                        }
                        LookAheadSign b = parseBase();
                        LookAheadSign y = x;
                        log.info("LookAheadSign:parseFactor:b.eval()=" + b.eval() + " posSign=" + posSign + " chSign=" + (char) chSign);
                        if ((posSign >= 0) && (posSign < StrSign.length())) {
                            Exponent = StrSign.substring(startPos, posSign);
                        }
                        if ((IsAConstant(Exponent, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                            final Double MySign = Math.pow(y.eval(), Double.parseDouble(Exponent));
                            y = (() -> MySign.intValue());
                        }
                        log.info("LookAheadSign:parseFactor:x.eval()=" + x.eval() + " posSign=" + posSign + " chSign=" + (char) chSign);
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadSign:parseFactor:^:x.eval()=" + x.eval() + " y.eval()=" + y.eval());
                            System.out.println("LookAheadSign:parseFactor:^:chSign=" + (char) chSign + " posSign=" + posSign + " StrSign=" + StrSign);
                        }
                        x = y;
                    } else {
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadSign:parseFactor:Return:x.eval()=" + x.eval());
                            System.out.println("LookAheadSign:parseFactor:Return:chSign=" + (char) chSign + " posSign=" + posSign + " StrSign=" + StrSign);
                        }
                        return x;
                    }
                }
            }

            LookAheadSign parseBase() {
                int startPos = posSign;
                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                    System.out.println("LookAheadSign:parseBase:Initial:chSign=" + (char) chSign + " posSign=" + posSign + " StrSign=" + StrSign);
                }
                log.info("LookAheadSign:parseBase:Entered parseBase:posSign=" + posSign + " startPos=" + startPos + " chSign=" + (char) chSign);
                LookAheadSign x = (() -> 1);
                if ((chSign == '(')&&(posSign < StrSign.length())&& (StrSign.substring(posSign).length() > 0) ) {
                    int tempAlignCharRead = posSign;
                    int oldposition = posSign;
                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadSign:parseBase:Before ProcessOpenBraces:chSign=" + (char) chSign + " posSign=" + posSign + " StrSign=" + StrSign.substring(posSign));
                    }
                    int numberofcharsread = 0;
                    MyParenEncoded = "";
                    MyParenDecoded = "";
                    numberofcharsread = extractAndClassifyFactors(StrSign.substring(posSign), DiffWithRespTo, HideAllFlag);
                    posSign = advanceOneTerm(StrSign, posSign);
                    if ((posSign >= 0) && (posSign < StrSign.length())) {
                        chSign = StrSign.charAt(posSign);
                    } else {
                        chSign = -1;
                    }
                    final Integer Fxeval=x.eval();
                    if (!xTerms.isEmpty()) {
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("xTerms:");
                            xTerms.forEach(System.out::println);
                        }
                        for (String str : xTerms) {
                            if( (str.contains("("))&&(str.contains(")"))&&(str.startsWith("("))&&( (str.substring(1).startsWith("-")) ) )
                                x = () -> Fxeval*-1;
                            else if( (str.contains("("))&&(str.contains(")"))&&(str.startsWith("("))&&( (str.substring(1).startsWith("+")) ) )
                                x = () -> Fxeval*+1;
                            else if( (!str.contains("("))&&(!str.contains(")"))&&(str.startsWith("*")) &&( (str.substring(1).startsWith("-")) ) )
                                x = () -> Fxeval*-1;
                            else if( (!str.contains("("))&&(!str.contains(")"))&&(str.startsWith("*"))&&( (str.substring(1).startsWith("+")) ) )
                                x = () -> Fxeval*+1;
                            else if( (!str.contains("("))&&(!str.contains(")"))&&(str.startsWith("/")) &&( (str.substring(1).startsWith("-")) ) )
                                x = () -> Fxeval*-1;
                            else if( (!str.contains("("))&&(!str.contains(")"))&&(str.startsWith("/"))&&( (str.substring(1).startsWith("+")) ) )
                                x = () -> Fxeval*+1;
                        }
                        MyParenEncoded = MyParenDecoded;
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadSign:Var:String:FunctionArg:" + StrSign.substring(oldposition) + " MyParenEncoded=" + MyParenEncoded + " MyParenDecoded=" + MyParenDecoded + " StrIsAConstant=" + StrIsAConstant);
                            System.out.println("LookAheadSign:Var:FunctionArg:numberofcharsread=" + numberofcharsread + " posTerm=" + posTerm + " chTerm=" + (char) chTerm);
                        }
                    final Integer Fxeval1=x.eval();
                    if (!otherTerms.isEmpty()) {
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("otherTerms:");
                            otherTerms.forEach(System.out::println);
                        }
                        for (String str : otherTerms) {
                            if( (str.contains("("))&&(str.contains(")"))&&(str.startsWith("("))&&( (str.substring(1).startsWith("-")) ) )
                                x = () -> Fxeval1*-1;
                            else if( (str.contains("("))&&(str.contains(")"))&&(str.startsWith("("))&&( (str.substring(1).startsWith("+")) ) )
                                x = () -> Fxeval1*+1;
                            else if( (!str.contains("("))&&(!str.contains(")"))&&(str.startsWith("*")) &&( (str.substring(1).startsWith("-")) ) )
                                x = () -> Fxeval1*-1;
                            else if( (!str.contains("("))&&(!str.contains(")"))&&(str.startsWith("*"))&&( (str.substring(1).startsWith("+")) ) )
                                x = () -> Fxeval1*+1;
                            else if( (!str.contains("("))&&(!str.contains(")"))&&(str.startsWith("/")) &&( (str.substring(1).startsWith("-")) ) )
                                x = () -> Fxeval1*-1;
                            else if( (!str.contains("("))&&(!str.contains(")"))&&(str.startsWith("/"))&&( (str.substring(1).startsWith("+")) ) )
                                x = () -> Fxeval1*+1;
                         }
                    }
                    MyParenEncoded = MyParenDecoded;
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadSign:otherTerms:FunctionArg:" + StrSign.substring(oldposition) + " MyParenEncoded=" + MyParenEncoded + " MyParenDecoded=" + MyParenDecoded + " StrIsAConstant=" + StrIsAConstant);
                        System.out.println("LookAheadSign:otherTerms:numberofcharsread=" + numberofcharsread + " posTerm=" + posTerm + " chTerm=" + (char) chTerm);
                    }
                    final Integer Fxeval2=x.eval();
                    if (!ConstantTerms.isEmpty()) {
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("ConstantTerms:");
                            ConstantTerms.forEach(System.out::println);
                        }
                        for (String str : ConstantTerms) {
                            if( (str.contains("("))&&(str.contains(")"))&&(str.startsWith("("))&&( (str.substring(1).startsWith("-")) ) )
                                x = () -> Fxeval2*-1;
                            else if( (str.contains("("))&&(str.contains(")"))&&(str.startsWith("("))&&( (str.substring(1).startsWith("+")) ) )
                                x = () -> Fxeval2*+1;
                            else if( (!str.contains("("))&&(!str.contains(")"))&&(str.startsWith("*")) &&( (str.substring(1).startsWith("-")) ) )
                                x = () -> Fxeval2*-1;
                            else if( (!str.contains("("))&&(!str.contains(")"))&&(str.startsWith("*"))&&( (str.substring(1).startsWith("+")) ) )
                                x = () -> Fxeval2*+1;
                            else if( (!str.contains("("))&&(!str.contains(")"))&&(str.startsWith("/")) &&( (str.substring(1).startsWith("-")) ) )
                                x = () -> Fxeval2*-1;
                            else if( (!str.contains("("))&&(!str.contains(")"))&&(str.startsWith("/"))&&( (str.substring(1).startsWith("+")) ) )
                                x = () -> Fxeval2*+1;
                        }
                    }
                    final Integer Fxeval3=x.eval();
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadSign:ConstantTerms:FunctionArg:" + StrSign.substring(oldposition) + " MyParenEncoded=" + MyParenEncoded + " MyParenDecoded=" + MyParenDecoded + " StrIsAConstant=" + StrIsAConstant);
                        System.out.println("LookAheadSign:ConstantTerms:numberofcharsread=" + numberofcharsread + " posTerm=" + posTerm + " chTerm=" + (char) chTerm);
                    }
                    MyParenEncoded = MyParenDecoded;
                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadSign:parseBase:(:After extractAndClassifyFactors:MyParenEncoded=" + MyParenEncoded + " chSign=" + (char) chSign + " posSign=" + posSign /*+ " StrSign=" + StrSign.substring(posSign)*/);
                    }
                    if ((!MyParenEncoded.equalsIgnoreCase(""))&&(MyParenDecoded.startsWith("-")) ) {
                        x = () -> Fxeval3*-1;
                    } else if ((!MyParenEncoded.equalsIgnoreCase(""))&&(MyParenDecoded.startsWith("+")) ) {
                        x = () -> Fxeval3*1;
                    } else if ((!MyParenEncoded.equalsIgnoreCase("")) ){
                        x = () -> Fxeval3*1;
                    }
                if (!MixedExpressionTerms.isEmpty()){
                         if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("MixedExpressionTerms:");
                            MixedExpressionTerms.forEach(System.out::println);
                        }   
                         for (String str : MixedExpressionTerms) {
                            if( (str.contains("("))&&(str.contains(")"))&&(str.startsWith("("))&&( (str.substring(1).startsWith("-")) ) )
                                x = () -> Fxeval*-1;
                            else if( (str.contains("("))&&(str.contains(")"))&&(str.startsWith("("))&&( (str.substring(1).startsWith("+")) ) )
                                x = () -> Fxeval*+1;
                            else if( (!str.contains("("))&&(!str.contains(")"))&&(str.startsWith("*")) &&( (str.substring(1).startsWith("-")) ) )
                                x = () -> Fxeval*-1;
                            else if( (!str.contains("("))&&(!str.contains(")"))&&(str.startsWith("*"))&&( (str.substring(1).startsWith("+")) ) )
                                x = () -> Fxeval*+1;
                            else if( (!str.contains("("))&&(!str.contains(")"))&&(str.startsWith("/")) &&( (str.substring(1).startsWith("-")) ) )
                                x = () -> Fxeval*-1;
                            else if( (!str.contains("("))&&(!str.contains(")"))&&(str.startsWith("/"))&&( (str.substring(1).startsWith("+")) ) )
                                x = () -> Fxeval*+1;
                        }
                        MyParenEncoded = MyParenDecoded;
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadSign:parseBase:(:After extractAndClassifyFactors:MyParenEncoded=" + MyParenEncoded + " chSign=" + (char) chSign + " posSign=" + posSign /*+ " StrSign=" + StrSign.substring(posSign)*/);
                    }
                    final Integer Fxeval4=x.eval();
                    if ((!MyParenEncoded.equalsIgnoreCase(""))&&(MyParenDecoded.startsWith("-")) ) {
                        x = () -> Fxeval4*-1;
                    } else if ((!MyParenEncoded.equalsIgnoreCase(""))&&(MyParenDecoded.startsWith("+")) ) {
                        x = () -> Fxeval4*1;
                    } else if ((!MyParenEncoded.equalsIgnoreCase("")) ){
                        x = () -> Fxeval4*1;
                    }
                        }
                    }
                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadSign:parseBase:(:Return:x.eval()=" + x.eval());
                        System.out.println("LookAheadSign:parseBase:(:Return:chSign=" + (char) chSign + " posSign=" + posSign + " StrSign=" + StrSign);
                    }
                
                    //log.info("LookAheadSign:parseBase:(: Expression=" + StrSign.substring(oldposition, posSign) + " :x.eval()=" + x.eval() + " posSign=" + posSign + " chSign=" + (char) chSign);
                    
                    return x;
                }
                if (eatSign('-')) { // unary minus
                    if ((IsNumber(chSign))) { //numbers
                        log.info("LookAheadSign:parseBase:-:Entered Numbers:posSign=" + posSign + " startPos=" + startPos + " chSign=" + (char) chSign);
                        while ((IsNumber(chSign)) && (chSign != -1)) {
                            nextCharSign();
                            if ((chSign == 'E') || (chSign == 'e')) {
                                nextCharSign();
                                if ((chSign == '-') || (chSign == '+')) {
                                    nextCharSign();
                                }
                            }
                        }
                        x = () -> -1;
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadSign:parseBase:-:Number:x.eval()=" + x.eval());
                            System.out.println("LookAheadSign:parseBase:-:Number:chSign=" + (char) chSign + " posSign=" + posSign + " StrSign=" + StrSign);
                        }
                        log.info("LookAheadSign:parseBase:-:Number=" + StrSign.substring(startPos, posSign) + " :x.eval()=" + x.eval() + " posSign=" + posSign + " chSign=" + (char) chSign);
                    } else if (IsVariable(chSign)) {//functions & variables
                        while (((IsVariable(chSign)) || (IsNumber(chSign))) && (chSign != -1)) {
                            nextCharSign();
                        }
                        x = () -> -1;
                        String FuncStr = StrSign.substring(startPos, posSign);
                        if (functionsSimple.containsKey(FuncStr)) {
                            x = parseBase();
                        }
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadSign:parseBase:-:Variable:x.eval()=" + x.eval());
                            System.out.println("LookAheadSign:parseBase:-:Variable:chSign=" + (char) chSign + " posSign=" + posSign + " StrSign=" + StrSign);
                        }
                        log.info("LookAheadSign:parseBase:-:Variable=" + StrSign.substring(startPos, posSign) + " :x.eval()=" + x.eval() + " posSign=" + posSign + " chSign=" + (char) chSign);
                    }
                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadSign:parseBase:-:Return:x.eval()=" + x.eval());
                        System.out.println("LookAheadSign:parseBase:-:Return:chSign=" + (char) chSign + " posSign=" + posSign + " StrSign=" + StrSign);
                    }
                    return x;
                } else if ((eatSign('+')) || (IsNumber(chSign)) || (IsVariable(chSign))) { // unary plus
                    if ((IsNumber(chSign))) { //numbers
                        log.info("LookAheadSign:parseBase:+:Entered Numbers:posSign=" + posSign + " startPos=" + startPos + " chSign=" + (char) chSign);
                        while ((IsNumber(chSign)) && (chSign != -1)) {
                            nextCharSign();
                            if ((chSign == 'E') || (chSign == 'e')) {
                                nextCharSign();
                                if ((chSign == '-') || (chSign == '+')) {
                                    nextCharSign();
                                }
                            }
                        }
                        x = () -> 1;
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadSign:parseBase:+:Number:x.eval()=" + x.eval());
                            System.out.println("LookAheadSign:parseBase:+:Number:chSign=" + (char) chSign + " posSign=" + posSign + " StrSign=" + StrSign);
                        }
                        log.info("LookAheadSign:parseBase:+:Number=" + StrSign.substring(startPos, posSign) + " :x.eval()=" + x.eval() + " posSign=" + posSign + " chSign=" + (char) chSign);
                    } else if (IsVariable(chSign)) {//functions & variables
                        while (((IsVariable(chSign)) || (IsNumber(chSign))) && (chSign != -1)) {
                            nextCharSign();
                        }
                        x = () -> 1;
                        String FuncStr = StrSign.substring(startPos, posSign);
                        if (functionsSimple.containsKey(FuncStr)) {
                            //eatSign('(');
                            if ((HideAllFlag == true) && (DevelopmentFlag == true) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                ;//System.out.println("SimpleTerm:parseBaseSimple::Entered LookAheadParen Processing Zone:StrTerm=" + StrTerm + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " StrCurLoc=" + StrTerm.substring(posTerm));
                            }
                            int oldposition = posSign;
                            int numberofcharsread = 0;
                            MyParenDecoded = "";
                            MyParenEncoded = "";
                            if ((chSign == '(')&&(posSign < StrSign.length())&& (StrSign.substring(posSign).length() > 0) )
                                numberofcharsread = extractAndClassifyFactors(StrSign.substring(posSign), DiffWithRespTo, HideAllFlag);
                            MyParenDecoded = MyParenEncoded;
                            posSign = advanceOneTerm(StrSign, posSign);
                            if ((posSign >= 0) && (posSign < StrSign.length())) {
                                chSign = StrSign.charAt(posSign);
                            } else {
                                chSign = -1;
                            }
                            if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadSign:parseBase:(:functionsSimple:After ProcessOpenBraces:MyParenEncoded=" + MyParenEncoded + " chSign=" + (char) chSign + " posSign=" + posSign /*+ " StrSign=" + StrSign.substring(posSign)*/);
                            }
                            if (!xTerms.isEmpty()) {
                                for (String str : xTerms) {
                                    MyParenDecoded = MyParenDecoded + str;
                                }
                                MyParenEncoded = MyParenDecoded;
                                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("LookAheadSign:Var:String:FunctionArg:" + StrSign.substring(oldposition) + " MyParenEncoded=" + MyParenEncoded + " MyParenDecoded=" + MyParenDecoded + " StrIsAConstant=" + StrIsAConstant);
                                    System.out.println("LookAheadSign:Var:FunctionArg:numberofcharsread=" + numberofcharsread + " posTerm=" + posTerm + " chTerm=" + (char) chTerm);
                                }
                            }
                            if (!otherTerms.isEmpty()) {
                                for (String str : otherTerms) {
                                    MyParenDecoded = MyParenDecoded + str;
                                }
                                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("LookAheadSign:Var:otherTerms:FunctionArg:" + StrSign.substring(oldposition) + " MyParenEncoded=" + MyParenEncoded + " MyParenDecoded=" + MyParenDecoded + " StrIsAConstant=" + StrIsAConstant);
                                    System.out.println("LookAheadSign:Var:otherTerms:numberofcharsread=" + numberofcharsread + " posTerm=" + posTerm + " chTerm=" + (char) chTerm);
                                }
                            }
                            MyParenEncoded = MyParenDecoded;
                            if (!ConstantTerms.isEmpty()) {
                                for (String str : ConstantTerms) {
                                    MyParenDecoded = MyParenDecoded + str;
                                }
                                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("LookAheadSign:ConstantTerms:FunctionArg:" + StrSign.substring(oldposition) + " MyParenEncoded=" + MyParenEncoded + " MyParenDecoded=" + MyParenDecoded + " StrIsAConstant=" + StrIsAConstant);
                                    System.out.println("LookAheadSign:ConstantTerms:numberofcharsread=" + numberofcharsread + " posTerm=" + posTerm + " chTerm=" + (char) chTerm);
                                }
                            }
                            MyParenEncoded = MyParenDecoded;
                            if (MyParenDecoded.startsWith("-")) {
                                x = () -> -1;
                            } else if (MyParenDecoded.startsWith("+")) {
                                x = () -> 1;
                            } else {
                                x = () -> 1;
                            }
                            if ((HideAllFlag == true) && (DevelopmentFlag == true) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadSign:parseBase:StrSign=" + StrSign + " posSign=" + posSign);
                            }
                            if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadSign:parseBase:+:Variable:x.eval()=" + x.eval());
                                System.out.println("LookAheadSign:parseBase:+:Variable:chSign=" + (char) chSign + " posSign=" + posSign + " StrSign=" + StrSign);
                            }
                            //log.info("LookAheadSign:parseBase:+:Variable=" + StrSign.substring(startPos, posSign) + " :x.eval()=" + x.eval() + " posSign=" + posSign + " chSign=" + (char) chSign);
                        }
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadSign:parseBase:+:Return:x.eval()=" + x.eval());
                            System.out.println("LookAheadSign:parseBase:+:Return:chSign=" + (char) chSign + " posSign=" + posSign + " StrSign=" + StrSign);
                        }
                        return x;
                    }
                } else {

                    log.info("LookAheadSign:parseBase:Exception Entered:parseBase:posSign=" + posSign + " startPos=" + startPos + " chSign=" + (char) chSign);
                    if (((IsNotAnOperator(chSign)) && ((!IsNumber(chSign)) && (!IsVariable(chSign)))) && (chSign != 0) && (chSign != -1) && (chSign != '(')) {
                        log.info("LookAheadSign:parseBase:Exception Entered:Inner:parseBase:posSign=" + posSign + " startPos=" + startPos + " chSign=" + (char) chSign);
                        if ((str != null) && (startPos < StrSign.length()) && (startPos < posSign) && (chSign != -1) && (chSign != 0)) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "LookAheadSign:parseBase:Unexpected: " + (char) chSign + " int=" + (int) chSign + " Cannot Format:" + StrSign.substring(posSign, StrSign.length()));
                        } else if ((chSign != -1) && (chSign != 0) && (posSign >= 1) && (posSign < StrSign.length()) && (IsNumber(chSign))) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "LookAheadSign:parseBase:Please Check Code:Should not reach Here:Unexpected: " + (char) chSign + " int=" + (int) chSign + " Cannot Format:" + StrSign.substring(posSign, StrSign.length()));
                        } else if ((chSign != -1) && (chSign != 0) && (posSign >= 1) && (posSign < StrSign.length()) && (IsOperator(chSign))) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "LookAheadSign:parseBase:Please Check Equation Operators:Should not reach Here:Unexpected: " + (char) chSign + " int=" + (int) chSign + " Cannot Format:" + StrSign.substring(posSign, StrSign.length()));
                        } else if ((chSign != -1) && (chSign != 0) && (posSign >= 1) && (posSign < StrSign.length())) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "LookAheadSign:parseBase:Unexpected: " + (char) chSign + " int=" + (int) chSign + " Cannot Format:" + StrSign.substring(posSign, StrSign.length()));
                        } else {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "LookAheadSign:parseBase:Unexpected char: " + (char) chSign + " int=" + (int) chSign + " Cannot Format:" + StrSign.substring(posSign, StrSign.length()));
                        }
                    }
                    return x;
                }
                return x;
            }
        }.parseSign();
    }
//Created by Rajesh Pai
// Gets Maximum Exponent of a  Variables of a Term for Integration by Parts

    @FunctionalInterface
    public interface OrderVar {

        String eval();
    }

    public static OrderVar parseOrder(String str, String DiffWithRespTo, String Silent, MathsContxtLAv.LogLevel MyLogLevel) {

        return new Object() {
            void nextCharOrder() {
                ++posOrder;
                chOrder = (posOrder < StrOrder.length()) ? StrOrder.charAt(posOrder) : -1;
                if ((chOrder == -1) && (posOrder >= StrOrder.length())) {
                    posOrder = StrOrder.length();
                } else if ((chOrder == -1) || ((chOrder == 0))) {
                    throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "OrderVar:nextCharOrder:Unexpected: " + (char) chOrder + " int=" + (int) chOrder + " Cannot Format:" + StrOrder.substring(posOrder, StrOrder.length()));
                }
            }

            boolean eatOrder(int CharToEat) {
                while (chOrder == ' ') {
                    nextCharOrder();
                }
                if (chOrder == CharToEat) {
                    nextCharOrder();
                    return true;
                }
                return false;
            }

            void SyncOrder() {
                if ((posOrder < StrOrder.length())
                        && (StrOrder.charAt(posOrder) != chOrder)) {
                    if (StrOrder.charAt(posOrder + 1) == chOrder) {
                        posOrder++;
                    } else if (StrOrder.charAt(posOrder - 1) == chOrder) {
                        posOrder--;
                    }
                }
            }

            OrderVar parseOrder() {
                ParenthesisFlag = false;
                NormalNotPareFlag = true;
                ParenthesisOperator = 0;
                StrOrder = str;
                posOrder = 0;
                OrderVar x = (() -> "");
                if ((StrOrder != null) && (!StrOrder.equalsIgnoreCase(""))) {
                    chOrder = StrOrder.charAt(posOrder);
                } else {
                    return x;
                }
                MaxTermOutput = 0;
                int StartPos = posOrder;
                if (MyLogLevel.level >= LogLevel.Info.level) {
                    log.info("OrderVar:parseVar:StartPos=" + StartPos + " posOrder=" + posOrder + " chOrder=" + (char) chOrder);
                    ParseLog("OrderVar", "parseOrder", "Initial", "StrOrder", StrOrder);
                }
                if ((StrOrder != null) && (StrOrder.length() > 0)
                        && (StrOrder.length() < 2)
                        && ((chOrder == '*')
                        || (chOrder == '/')
                        || (chOrder == '^'))) {
                    return x;
                } else {
                    x = parseExpression();
                }
                if ((MaxTermOutput != 1.0) && (MaxTermOutput != 0.0)) {
                    x = (() -> RemoveEDbl(MaxTermOutput));
                } else {
                    x = (() -> "" + 1);
                }
                if (MyLogLevel.level >= LogLevel.Info.level) {
                    log.info("OrderVar:parseOrder:x.eval()=" + x.eval());
                    log.info("OrderVar:parseOrder:posOrder=" + posOrder + " chOrder=" + (char) chOrder);
                    ParseLog("OrderVar", "parseOrder", "Final", "StrOrder", StrOrder);
                }
                return x;
            }

            OrderVar parseExpression() {
                OrderVar x = (() -> "");
                for (;;) {
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("OrderVar:parseExpression:Top:Inside Loop: parseExpression:ParenthesisFlag=" + ParenthesisFlag + " NormalNotPareFlag=" + NormalNotPareFlag + " chOrder=" + (char) chOrder + " x.eval()=" + x.eval());
                    }
                    if ((posOrder >= 1) && (posOrder < StrOrder.length())) {
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("OrderVar:parseExpression:StrOrder=" + StrOrder.substring(posOrder));
                        }
                    }
                    if (eatOrder(')')) {
                        return x;
                    } else if (((eatOrder('+')) || ((NormalNotPareFlag == true) && (ParenthesisFlag == true))) || (posOrder == 0)) {// addition
                        //if (ParenthesisFlag == false) {
                        TermOutput = 0.0;
                        //}
                        OrderVar a = x, b = parseTerm();
                        x = b;
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("OrderVar:parseExpression:MaxTermOutput=" + MaxTermOutput + " TermOutput=" + TermOutput);
                            log.info("OrderVar:parseExpression:x.eval=" + x.eval() + " a.eval()=" + a.eval() + "+ b.eval()=" + b.eval());
                        }
                    } else if ((eatOrder('-')) || ((NormalNotPareFlag == true) && (ParenthesisFlag == true))) { // subtraction
                        //if (ParenthesisFlag == false) {
                        TermOutput = 0.0;
                        //}
                        OrderVar a = x, b = parseTerm();
                        x = b;
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("OrderVar:parseExpression:MaxTermOutput=" + MaxTermOutput + " TermOutput=" + TermOutput);
                            log.info("OrderVar:parseExpression:x.eval=" + x.eval() + " a.eval()=" + a.eval() + "- b.eval()=" + b.eval());
                        }
                    } else if ((ParenthesisFlag == true) && (ParenthesisOperator == '+')) {
                        OrderVar a = x, b = parseTerm();
                        x = b;
                    } else if ((ParenthesisFlag == true) && (ParenthesisOperator == '-')) {
                        OrderVar a = x, b = parseTerm();
                        x = b;
                    } else {
                        return x;
                    }
                }
            }

            OrderVar parseTerm() {
                OrderVar x = (() -> "");
                x = parseFactor();
                if (MyLogLevel.level >= LogLevel.Info.level) {
                    log.info("OrderVar:parseTerm:x.eval()=" + x.eval());
                }
                for (;;) {
                    if ((posOrder >= 1) && (posOrder < StrOrder.length())) {
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("OrderVar:parseTerm:StrOrder=" + StrOrder.substring(posOrder));
                        }
                    }
                    if ((eatOrder('*')) || (posOrder == 0)) { // multiplication
                        OrderVar a = x, b = parseFactor();
                        if ((TermOutputSetFlag == false) && (!b.eval().equalsIgnoreCase(DiffWithRespTo))) {
                            x = b;
                            if (MyLogLevel.level >= LogLevel.Info.level) {
                                log.info("OrderVar:parseTerm:x.eval()=" + x.eval());
                            }
                        } else if (b.eval().equalsIgnoreCase(DiffWithRespTo)) {
                            if (TermOutputSetFlag == false) {
                                TermOutput += 1.0;
                                if ((TermOutput >= 0) && (MaxTermOutput < TermOutput)) {
                                    MaxTermOutput = TermOutput;
                                } else if ((TermOutput <= 0) && (MaxTermOutput > TermOutput)) {
                                    MaxTermOutput = TermOutput;
                                }
                            }
                            x = b;
                            if (MyLogLevel.level >= LogLevel.Info.level) {
                                log.info("OrderVar:parseTerm:x.eval()=" + x.eval());
                            }
                        } else if (!b.eval().equalsIgnoreCase(DiffWithRespTo)) {
                            if (TermOutputSetFlag == false) {
                                TermOutput += 1.0;
                                if ((TermOutput >= 0) && (MaxTermOutput < TermOutput)) {
                                    MaxTermOutput = TermOutput;
                                } else if ((TermOutput <= 0) && (MaxTermOutput > TermOutput)) {
                                    MaxTermOutput = TermOutput;
                                }
                            }
                            x = b;
                            if (MyLogLevel.level >= LogLevel.Info.level) {
                                log.info("OrderVar:parseTerm:x.eval()=" + x.eval());
                            }
                        }
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("OrderVar:parseTerm:Multiply:x.eval()=" + x.eval() + " TermOutput=" + TermOutput);
                        }
                    } else if (eatOrder('/')) { // division
                        OrderVar a = x, b = parseFactor();
                        if ((TermOutputSetFlag == false) && (!b.eval().equalsIgnoreCase(DiffWithRespTo))) {
                            x = b;
                            if (MyLogLevel.level >= LogLevel.Info.level) {
                                log.info("OrderVar:parseTerm:x.eval()=" + x.eval());
                            }
                        } else if (b.eval().equalsIgnoreCase(DiffWithRespTo)) {
                            if (TermOutputSetFlag == false) {
                                TermOutput -= 1.0;
                                if ((TermOutput >= 0) && (MaxTermOutput < TermOutput)) {
                                    MaxTermOutput = TermOutput;
                                } else if ((TermOutput <= 0) && (MaxTermOutput > TermOutput)) {
                                    MaxTermOutput = TermOutput;
                                }
                            }
                            x = b;
                            if (MyLogLevel.level >= LogLevel.Info.level) {
                                log.info("OrderVar:parseTerm:x.eval()=" + x.eval());
                            }
                        } else if (!b.eval().equalsIgnoreCase(DiffWithRespTo)) {
                            if (TermOutputSetFlag == false) {
                                TermOutput -= 1.0;
                                if ((TermOutput >= 0) && (MaxTermOutput < TermOutput)) {
                                    MaxTermOutput = TermOutput;
                                } else if ((TermOutput <= 0) && (MaxTermOutput > TermOutput)) {
                                    MaxTermOutput = TermOutput;
                                }
                            }
                            x = b;
                            if (MyLogLevel.level >= LogLevel.Info.level) {
                                log.info("OrderVar:parseTerm:x.eval()=" + x.eval());
                            }
                        }
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("OrderVar:parseTerm:Divide:x.eval()=" + x.eval() + " TermOutput=" + TermOutput);
                        }

                    } else if ((ParenthesisFlag == true) && (ParenthesisOperator == '*')) {
                        OrderVar a = x, b = parseFactor();
                        x = (() -> a.eval() + "*" + b.eval());
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("OrderVar:parseTerm:ParenthesisFlag:*:x.eval()=" + x.eval());
                        }
                    } else if ((ParenthesisFlag == true) && (ParenthesisOperator == '/')) {
                        OrderVar a = x, b = parseFactor();
                        x = (() -> a.eval() + "/" + b.eval());
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("OrderVar:parseTerm:ParenthesisFlag:/:x.eval()=" + x.eval());
                        }
                    } else {
                        return x;
                    }
                }
            }

            OrderVar parseFactor() {
                TermOutputSetFlag = false;
                GotExpntNumFlag = false;
                if ((posOrder >= 1) && (posOrder < StrOrder.length())) {
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("OrderVar:parseFactor:Initial:StrOrder=" + StrOrder.substring(posOrder));
                    }
                }
                OrderVar x = parseBase();
                if (MyLogLevel.level >= LogLevel.Info.level) {
                    log.info("OrderVar:parseFactor:x.eval()=" + x.eval());
                }
                for (;;) {
                    if ((posOrder >= 1) && (posOrder < StrOrder.length())) {
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("OrderVar:parseFactor:Loop:StrOrder=" + StrOrder.substring(posOrder));
                        }
                    }
                    if (eatOrder('^')) { // exponentiation
                        GotExpntNumFlag = true;
                        OrderVar a = x, b = parseBase();
                        GotExpntNumFlag = false;
                        if (!b.eval().equalsIgnoreCase("")) {
                            if (IsAConstant(b.eval(), DiffWithRespTo)) {
                                if (Double.parseDouble(b.eval()) >= TermOutput) {
                                    TermOutput = Double.parseDouble(b.eval());
                                } else {
                                    TermOutput += Double.parseDouble(b.eval());
                                }
                                if ((TermOutput >= 0) && (MaxTermOutput < TermOutput)) {
                                    MaxTermOutput = TermOutput;
                                } else if ((TermOutput <= 0) && (MaxTermOutput > TermOutput)) {
                                    MaxTermOutput = TermOutput;
                                }
                                TermOutputSetFlag = true;
                            }
                        } else {
                            x = a;
                        }
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("OrderVar:parseFactor:Exponent:x.eval()=" + x.eval() + " TermOutput=" + TermOutput);
                        }
                    } else if ((ParenthesisFlag == true) && (ParenthesisOperator == '^')) {
                        OrderVar a = x, b = parseBase();
                        if (!b.eval().equalsIgnoreCase("")) {
                            if (IsAConstant(b.eval(), DiffWithRespTo)) {
                                TermOutput = Double.parseDouble(b.eval());
                                if ((TermOutput >= 0) && (MaxTermOutput < TermOutput)) {
                                    MaxTermOutput = TermOutput;
                                } else if ((TermOutput <= 0) && (MaxTermOutput > TermOutput)) {
                                    MaxTermOutput = TermOutput;
                                }
                                TermOutputSetFlag = true;
                            }
                        } else {
                            x = a;
                        }
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("OrderVar:parseFactor:ParenthesisFlag:x.eval()=" + x.eval() + " TermOutput=" + TermOutput);
                        }
                    } else {
                        return x;
                    }
                }
            }

            OrderVar parseBase() {
                int startPos = posOrder;
                if (startPos >= 0) ; else {
                    startPos = 0;
                }
                OrderVar x = (() -> "");
                if (eatOrder('-')) { // unary minus
                    OrderVar b = parseBase();
                    if (GotExpntNumFlag == true) {
                        if (IsAConstant(b.eval(), DiffWithRespTo)) {
                            x = (() -> "-" + (RemoveEDbl(Double.parseDouble(b.eval()))));
                        } else {
                            x = (() -> "-" + b.eval());
                        }
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("OrderVar:parseBase:Number:x.eval()=" + x.eval() + " posOrder=" + posOrder + " chOrder=" + (char) chOrder);
                        }
                    } else {
                        if (IsAConstant(b.eval(), DiffWithRespTo)) {
                            x = (() -> "" + (RemoveEDbl(Double.parseDouble(b.eval()))));
                        } else {
                            x = (() -> b.eval());
                        }
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("OrderVar:parseBase:Number:x.eval()=" + x.eval() + " posOrder=" + posOrder + " chOrder=" + (char) chOrder);
                        }
                    }
                    return x;
                } else if (eatOrder('+')) { // unary plus
                    x = parseBase();
                    return x;
                }
                if ((IsNumber(chOrder))) { //numbers
                    while ((IsNumber(chOrder)) && (chOrder != -1)) {
                        nextCharOrder();
                        if ((chOrder == 'E') || (chOrder == 'e')) {
                            nextCharOrder();
                            if ((chOrder == '-') || (chOrder == '+')) {
                                nextCharOrder();
                            }
                        }
                    }
                    double xx = 1.0;
                    if ((GotExpntNumFlag == true) && (posOrder != -1) && (StrOrder != null) && (!StrOrder.equalsIgnoreCase("")) && (!StrOrder.equalsIgnoreCase("NaN"))) {
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("OrderVar:parseBase:Expnt Num:Number:xx=" + xx + " posOrder=" + posOrder + " chOrder=" + (char) chOrder);
                        }
                        if ((IsAConstant(StrOrder.substring(startPos, posOrder), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                            xx = Double.parseDouble(StrOrder.substring(startPos, posOrder));
                        }
                    } else if ((GotExpntNumFlag == true) && (StrOrder != null)
                            && (!StrOrder.equalsIgnoreCase(""))
                            && (!StrOrder.equalsIgnoreCase("NaN"))) {
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("OrderVar:parseBase:Expnt Num:Number:xx=" + xx + " posOrder=" + posOrder + " chOrder=" + (char) chOrder);
                        }
                        xx = Double.parseDouble(StrOrder.substring(startPos));
                    } else if ((GotExpntNumFlag == false) && (TrailConstantFlag == false)
                            && (timesLoop == 0) && (startPos != posOrder) && (posOrder != -1)
                            && (StrOrder != null) && (!StrOrder.equalsIgnoreCase(""))
                            && (!StrOrder.equalsIgnoreCase("NaN"))) {
                        xx = Double.parseDouble(StrOrder.substring(startPos, posOrder));
                        if (MyLogLevel.level >= LogLevel.Info.level) {
                            log.info("OrderVar:parseBase:Trailing Constant:Number:xx=" + xx + " posOrder=" + posOrder + " chOrder=" + (char) chOrder);
                        }
                    } else {
                        xx = 1.0;
                    }
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("OrderVar:parseBase:Number:xx=" + xx + " posOrder=" + posOrder + " chOrder=" + (char) chOrder);
                    }
                    final Double XX = xx;
                    if (XX >= 1.0) {
                        final String MyDBL = RemoveEDbl(XX);
                        x = () -> MyDBL;
                    } else if (XX > 0.0) {
                        final String MyDBL = RemoveEDbl(XX);
                        x = () -> MyDBL;
                    } else if ((XX < 0.0) && (XX > -1)) {
                        final String MyDBL = RemoveEDbl(XX);
                        x = () -> MyDBL;
                    } else {
                        x = () -> "";
                    }
                    if ((chOrder == ')') && (posOrder == (StrOrder.length() - 1))) {
                        chOrder = -1;
                        posOrder++;
                        ParenthesisOperator = 0;
                        ParenthesisFlag = false;
                    } else if (chOrder == ')') {
                        nextCharOrder();
                        ParenthesisOperator = 0;
                        ParenthesisFlag = false;
                    }
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("OrderVar:parseBase:Number:xx=" + xx + " posOrder=" + posOrder + " chOrder=" + (char) chOrder);
                    }
                    return x;
                } else if (IsVariable(chOrder)) {//functions & variables
                    while (((IsVariable(chOrder)) || (IsNumber(chOrder))) && (chOrder != -1)) {
                        nextCharOrder();
                    }
                    String name = "";
                    if (posOrder != -1) {
                        name = StrOrder.substring(startPos, posOrder).trim();
                    } else {
                        name = StrOrder.substring(startPos).trim();
                    }
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("OrderVar:parseBase:Variable:name=" + name + " posOrder=" + posOrder + " chOrder=" + (char) chOrder);
                    }
                    if ((name != null) && (!name.equalsIgnoreCase("")) && (!name.equalsIgnoreCase("NaN"))) {
                        final String MyStr = name;
                        x = () -> MyStr;
                    }
                    if ((chOrder == ')') && (posOrder == (StrOrder.length() - 1))) {
                        chOrder = -1;
                        posOrder++;
                        ParenthesisOperator = 0;
                        ParenthesisFlag = false;
                    } else if (chOrder == ')') {
                        nextCharOrder();
                        ParenthesisOperator = 0;
                        ParenthesisFlag = false;
                    }
                    if (MyLogLevel.level >= LogLevel.Info.level) {
                        log.info("OrderVar:parseBase:Variable:name=" + name + " posOrder=" + posOrder + " chOrder=" + (char) chOrder);
                    }
                    return x;
                } else if (chOrder == '(') {
                    ParenthesisFlag = true;
                    nextCharOrder();
                    ParenthesisOperator = chOrder;
                    x = parseExpression();//parseBase();
                    return x;
                } else if (chOrder == ')') {
                    ParenthesisOperator = 0;
                    ParenthesisFlag = false;
                    nextCharOrder();
                    return x;
                } else {
                    if (((IsNotAnOperator(chOrder)) && ((!IsNumber(chOrder)) && (!IsVariable(chOrder)))) && (chOrder != 0) && (chOrder != -1) && (chOrder != '(')) {
                        if ((StrOrder != null) && (startPos < StrOrder.length()) && (startPos < posOrder) && (chOrder != -1) && (chOrder != 0)) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "OrderVar:parseBase:Unexpected: " + (char) chOrder + " int=" + (int) chOrder + " Cannot Format:" + StrOrder.substring(posOrder, StrOrder.length()));
                        } else if ((chOrder != -1) && (chOrder != 0) && (posOrder >= 1) && (posOrder < StrOrder.length()) && (IsNumber(chOrder))) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "OrderVar:parseBase:Please Check Code:Should NOT reach Here:Unexpected: " + (char) chOrder + " int=" + (int) chOrder + " Cannot Format:" + StrOrder.substring(posOrder, StrOrder.length()));
                        } else if ((chOrder != -1) && (chOrder != 0) && (posOrder >= 1) && (posOrder < StrOrder.length()) && (IsOperator(chOrder))) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "OrderVar:parseBase:Please Check Equation Operators:Should NOT reach Here:Unexpected: " + (char) chOrder + " int=" + (int) chOrder + " Cannot Format:" + StrOrder.substring(posOrder, StrOrder.length()));
                        } else if ((chOrder != -1) && (chOrder != 0) && (posOrder >= 1) && (posOrder < StrOrder.length())) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "OrderVar:parseBase:Unexpected: " + (char) chOrder + " int=" + (int) chOrder + " Cannot Format:" + StrOrder.substring(posOrder, StrOrder.length()));
                        } else {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "OrderVar:parseBase:Unexpected char: " + (char) chOrder + " int=" + (int) chOrder + " Cannot Format:" + StrOrder.substring(posOrder, StrOrder.length()));
                        }
                    }
                    return x;
                }
            }
        }.parseOrder();
    }

//Created by Rajesh Pai
// Converts Coefficients of a Term to a Single Value
    @FunctionalInterface
    public interface LookAheadConst {

        double eval();
    }

    public static LookAheadConst parseLA(String str, int StartPos, Map<String, Double> variables, String DiffWithRespTo, boolean MapFlag, boolean HideAllFlag) {

        return new Object() {
            void nextCharLA() {
                ++posLA;
                chLA = (posLA < StrLA.length()) ? StrLA.charAt(posLA) : -1;
                if ((chLA == -1) && (posLA >= StrLA.length())) {
                    posLA = StrLA.length();
                } else if ((chLA == -1) || ((chLA == 0))) {
                    throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "LookAheadConst:nextCharLA:Unexpected: " + (char) chLA + " int=" + (int) chLA + " Cannot Format:" + StrLA.substring(posLA, StrLA.length()));
                }
            }

            boolean eatLA(int CharToEat) {
                while (chLA == ' ') {
                    nextCharLA();
                }
                if (chLA == CharToEat) {
                    nextCharLA();
                    return true;
                }
                return false;
            }

            void SyncLA() {
                if ((posLA < StrLA.length())
                        && (StrLA.charAt(posLA) != chLA)) {
                    if (StrLA.charAt(posLA + 1) == chLA) {
                        posLA++;
                    } else if (StrLA.charAt(posLA - 1) == chLA) {
                        posLA--;
                    }
                }
            }

            LookAheadConst parseLAExpr() {
                StrLA = str;
                LookAheadConst x = (() -> 0.0);
                LAConstSimpleMapFlag = false;
                LAConstComplexMapFlag = false;
                if (ComplexAssignFlag == true) {
                    ComplexAssignFlag = false;
                    GotVariableFlag = false;
                    StrLA = StrVar;
                    posLA = GotVariablePos;
                    if (GotVariablePos < StrLA.length()) {
                        chLA = StrLA.charAt(GotVariablePos);
                        if (GotVariablePos >= 1) {
                            LATermOperator = StrLA.charAt(GotVariablePos - 1);
                            if ((IsOperator(LATermOperator)) && (LATermOperator != '*') && (LATermOperator != '/') && (isUnarySign(StrLA, (GotVariablePos - 1)))) {
                                LATermOperator = StrLA.charAt(GotVariablePos - 2);
                                if ((IsOperator(LATermOperator)) && ((LATermOperator == '*') || (LATermOperator == '/')) && (!isUnarySign(StrLA, (GotVariablePos - 2)))) {
                                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("LookAheadConst:parseLA:LATermOperator:1:StrLA=" + StrLA + " ComplexAssignFlag=" + ComplexAssignFlag + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator);
                                    }
                                } else {
                                    System.out.println(ConsoleColors.RED + "LookAheadConst:parseLA:2:LATermOperator:StrLA=" + StrLA + " ComplexAssignFlag=" + ComplexAssignFlag + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + ConsoleColors.RESET);
                                }
                            } else {
                                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("LookAheadConst:parseLA:LATermOperator:3:StrLA=" + StrLA + " ComplexAssignFlag=" + ComplexAssignFlag + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator);
                                }
                            }
                        }
                    }
                    if ((posLA > 0) && (posLA < StrLA.length()) && (StrLA.charAt(posLA - 1) != '/') && (StrLA.charAt(posLA - 1) != '*')) {
                        LAPreTermOperator = -1;
                        log.info("LookAheadConst:parseLA:StartPos=" + StartPos + " posLA=" + posLA + " chLA=" + (char) chLA + " ComplexAssignFlag=" + ComplexAssignFlag + " ContainsIndConstFlag=" + ContainsIndConstFlag + " GotBracesVarFlag=" + GotBracesVarFlag);
                    } else if ((posLA >= 1) && (StrLA.charAt(posLA - 1) == '/')) {
                        LAPreTermOperator = '/';
                        LATermOperator = '/';
                        log.info("LookAheadConst:parseLA:StartPos=" + StartPos + " posLA=" + posLA + " chLA=" + (char) chLA + " ComplexAssignFlag=" + ComplexAssignFlag + " ContainsIndConstFlag=" + ContainsIndConstFlag + " GotBracesVarFlag=" + GotBracesVarFlag);
                    } else if ((posLA >= 1) && (StrLA.charAt(posLA - 1) == '*')) {
                        LAPreTermOperator = '*';
                        LATermOperator = '*';
                        log.info("LookAheadConst:parseLA:StartPos=" + StartPos + " posLA=" + posLA + " chLA=" + (char) chLA + " ComplexAssignFlag=" + ComplexAssignFlag + " ContainsIndConstFlag=" + ContainsIndConstFlag + " GotBracesVarFlag=" + GotBracesVarFlag);
                    }
                } else if ((pos == -1)) {
                    GotVariableFlag = false;
                    GotIndConstFlag = false;
                    posLA = -1;
                    if (StrLA.length() >= 1) {
                        chLA = StrLA.charAt(0);
                    } else {
                        chLA = -1;
                    }
                } else {
                    //posTerm=StartPos;
                    posLA = -1;
                    if (StrLA.length() >= 1) {
                        chLA = StrLA.charAt(0);
                    } else {
                        chLA = -1;
                    }
                }
                int startpos = posLA;
                if ((posLA == -1) && (IsNumber(chLA))) {
                    LATermOperator = '*';
                    LAPreTermOperator = '*';
                }
                log.info("LookAheadConst:parseLA:StartPos=" + StartPos + " startpos=" + startpos + " posLA=" + posLA + " chLA=" + (char) chLA + " ComplexAssignFlag=" + ComplexAssignFlag + " ContainsIndConstFlag=" + ContainsIndConstFlag + " GotBracesVarFlag=" + GotBracesVarFlag);
                ParseLog("LookAheadConst", "parseLA", "Initial", "StrLA", StrLA);
                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                    System.out.println("LookAheadConst:parseLA:Reached1:StrLA=" + StrLA + " ComplexAssignFlag=" + ComplexAssignFlag + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator);
                }
                if ((StrLA != null) && (StrLA.length() > 0)
                        && (StrLA.length() < 2)
                        && ((chLA == '*')
                        || (chLA == '/')
                        || (chLA == '^'))) {
                    return x;
                } else if ((StrLA != null) && (StrLA.length() >= 0)
                        && (StrLA.length() <= 1)) {
                    if ((IsAConstant(StrLA, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                        x = (() -> Double.parseDouble(StrLA));
                    }
                    return x;
                }
                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                    System.out.println("LookAheadConst:parseLA:End:Reached1.1:x.eval()=" + x.eval() + " ComplexAssignFlag=" + ComplexAssignFlag + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                }
                if ((posLA >= 0) && (StrLA.length() > 1) && (posLA < StrLA.length())) {
                    chLA = StrLA.charAt(posLA);
                }
                if (posLA <= -1) {
                    posLA = 0;
                }
                for (int i = posLA; i >= 0; i--) {
                    if (IsVariable(StrLA.charAt(i)))
                            ; else if (IsNumber(StrLA.charAt(i)))
                            ; else if (isUnarySign(StrLA, i))
                                ; else if (i == posLA) {
                        i--;
                    }
                    if ((i >= 0) && (IsOperator(StrLA.charAt(i)))) {
                        LATermOperator = StrLA.charAt(i);
                    }
                    if (i == 0) {
                        LAPreTermOperator = '*';
                        posLA = i;
                    } else if ((IsOperator(LAPreTermOperator)) && (LAPreTermOperator != '^')) {
                        posLA = i;
                        break;
                    }
                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadConst:parseLA:End:Reached1.1.1:x.eval()=" + x.eval() + " ComplexAssignFlag=" + ComplexAssignFlag + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                    }
                }
                LATermOperator = LAPreTermOperator;
                if ((posLA >= 0) && (StrLA.length() > 1) && (posLA < StrLA.length())) {
                    chLA = StrLA.charAt(posLA);
                }
                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                    System.out.println("LookAheadConst:parseLA:End:Reached1.2:x.eval()=" + x.eval() + " ComplexAssignFlag=" + ComplexAssignFlag + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                }
                x = parseTerm();
                log.info("LookAheadConst:parseLA:Overall Number:x.eval()=" + x.eval() + " LAPreTermOperator=" + (char) LAPreTermOperator + " LATermOperator=" + (char) LATermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                if (MapFlag == true) {
                    ParseLog("LookAheadConst", "parseLA", "BeforeMap", "StrLA", StrLA);
                    //ParseMapAPI("LookAheadConst:parseLA", StrLA.length(), 0, 0, DiffWithRespTo);
                    ParseLog("LookAheadConst", "parseLA", "Final", "StrLA", StrLA);
                }
//                if ((posLA != -1)&&(str != null)&&(!str.equalsIgnoreCase(""))&&(str.substring(posLA, str.length()).equalsIgnoreCase(""))&&(posLA <= str.length())) {
//                    throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "LookAheadConst:parse:Unexpected: " + (char) chLA + " int=" + (int) chLA + " posLA=" + posLA + " str=" + str.substring(posLA, str.length()));
//                }

                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                    System.out.println("LookAheadConst:parseLA:End:Reached2:x.eval()=" + x.eval() + " ComplexAssignFlag=" + ComplexAssignFlag + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator);
                    System.out.println("LookAheadConst:parseLA:Return Value:End:ComplexAssignFlag=" + ComplexAssignFlag + " GotVariableFlag=" + GotVariableFlag + " GotVariablePos=" + GotVariablePos + " GotIndConstFlag=" + GotIndConstFlag + " ContainsIndConstFlag=" + ContainsIndConstFlag);
                }
                return x;
            }

            LookAheadConst parseExpr() {
                double Output = 1.0;
                int StartPos = posLA;
                boolean InitialTermOp = true;
                boolean InitialHighLvlMapOp = false;
                boolean InitialHighLvlDyDxMapOp = false;
                double HighLvlMapOutputNum = 1.0;
                double HighLvlMapOutputFirstDeno = 1.0;
                double HighLvlMapOutputDeno = 1.0;
                double HighLvlMapOutput = 1.0;
                LookAheadConst x = (() -> 1.0);
                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                    System.out.println("LookAheadConst:parseExpr:Reached1:StrLA=" + StrLA + " posLA=" + posLA + " chLA=" + (char) chLA + " ParenthesisFlag" + ParenthesisFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator);
                }
                x = parseTerm();
                int HPStartPos1 = posLA;
                log.info("LookAheadConst:parseExpr:Initial:0:x.eval()=" + x.eval() + " GotVariableFlag=" + GotVariableFlag + " LATermOperator=" + (char) LATermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                if ((InitialTermOp == true) && (StartPos >= 1) && (StrLA.charAt(StartPos - 1) == '/')) {
                    log.info("LookAheadConst:parseExpr:Initial:HighLvlMapOutput=" + HighLvlMapOutput + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutputFirstDeno=" + HighLvlMapOutputFirstDeno + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " GotBracesVarFlag=" + GotBracesVarFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                    log.info("LookAheadConst:parseExpr:Initial:x.eval()=" + x.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                    HighLvlMapOutputFirstDeno = x.eval();
                    HighLvlMapOutput = x.eval();
                    final Double Temp = x.eval();
                    x = (() -> 1.0 / Temp);
                    InitialTermOp = false;
                    InitialHighLvlMapOp = true;
                    InitialHighLvlDyDxMapOp = true;
                    log.info("LookAheadConst:parseExpr:Initial:HighLvlMapOutput=" + HighLvlMapOutput + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutputFirstDeno=" + HighLvlMapOutputFirstDeno + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " GotBracesVarFlag=" + GotBracesVarFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                    log.info("LookAheadConst:parseExpr:Initial:x.eval()=" + x.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadConst:parseExpr:Initial:Inner:x.eval()=" + x.eval() + " Temp=" + Temp);
                    }
                }
                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                    System.out.println("LookAheadConst:parseExpr:Initial:Reached2:x.eval()=" + x.eval() + " ComplexAssignFlag=" + ComplexAssignFlag + " GotVariableFlag=" + GotVariableFlag + " GotVariablePos=" + GotVariablePos + " GotIndConstFlag=" + GotIndConstFlag + " ContainsIndConstFlag=" + ContainsIndConstFlag);
                }
                log.info("LookAheadConst:parseExpr:Initial:1:x.eval()=" + x.eval() + " InitialHighLvlMapOp=" + InitialHighLvlMapOp + " InitialHighLvlDyDxMapOp=" + InitialHighLvlDyDxMapOp + " GotVariableFlag=" + GotVariableFlag + " LATermOperator=" + (char) LATermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                int LATermOperatorInternal = -1;
                for (;;) {
                    GotIndConstFlag = false;
                    GotVariableFlag = false;
                    if ((GotVariableFlag == false) && (eatLA('+'))) { // addition in braces
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadConst:parseExpr:+:x.eval()=" + x.eval() + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperatorInternal=" + (char) LATermOperatorInternal + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator);
                        }
                        LookAheadConst a = x, b = parseTerm();
                        log.info("LookAheadConst:parseExpr:Divide:a.eval()=" + a.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                        log.info("LookAheadConst:parseExpr:Divide:b.eval()=" + b.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                        String Temp = "" + b.eval();
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadConst:parseExpr:+:x.eval()=" + x.eval() + " b.eval()=" + b.eval() + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperatorInternal=" + (char) LATermOperatorInternal + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator);
                        }
                        if (GotVariableFlag == true) {
                            LATermOperator = '/';
                            GotVariableFlag = false;

                        } else if (GotIndConstFlag == true) {
                            GotIndConstFlag = false;
                        } else if ((IsAConstant("" + b.eval(), DiffWithRespTo)) || (Temp.contains("E-")) || (Temp.contains("E+"))) {
                            x = (() -> a.eval() + b.eval());
                            InitialHighLvlMapOp = false;
                        }
                        if (((IsAConstant("" + b.eval(), DiffWithRespTo)) || (Temp.contains("E-")) || (Temp.contains("E+"))) && (timesLoop == 0) && (LATermOperator == -1)) {
                            if ((chLA == '*') || (chLA == '/')) {
                                LAPreTermOperator = chLA;
                            }
                        }
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadConst:parseExpr:+:End:x.eval()=" + x.eval() + " b.eval()=" + b.eval() + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperatorInternal=" + (char) LATermOperatorInternal + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator);
                        }
                        log.info("LookAheadConst:parseExpr:+:x.eval()=" + x.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " InitialHighLvlMapOp=" + InitialHighLvlMapOp + " InitialHighLvlDyDxMapOp=" + InitialHighLvlDyDxMapOp + " GotVariableFlag=" + GotVariableFlag + " LATermOperator=" + (char) LATermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                        log.info("LookAheadConst:parseExpr:+:x.eval()=" + x.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " InitialHighLvlMapOp=" + InitialHighLvlMapOp + " InitialHighLvlDyDxMapOp=" + InitialHighLvlDyDxMapOp + " GotVariableFlag=" + GotVariableFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                    } else if ((GotVariableFlag == false) && (eatLA('-'))) {// subtraction in braces
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadConst:parseExpr:-:Reached3:StrLA=" + StrLA.substring(posLA) + " ParenthesisFlag" + ParenthesisFlag);
                        }
                        LookAheadConst a = x, b = parseTerm();
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadConst:parseExpr:-:After:x.eval()=" + x.eval() + " b.eval()=" + b.eval() + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperatorInternal=" + (char) LATermOperatorInternal + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator);
                        }
                        log.info("LookAheadConst:parseExpr:Divide:a.eval()=" + a.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                        log.info("LookAheadConst:parseExpr:Divide:b.eval()=" + b.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                        String Temp = "" + b.eval();
                        if (GotVariableFlag == true) {
                            LATermOperator = '/';
                            GotVariableFlag = false;

                        } else if (GotIndConstFlag == true) {
                            GotIndConstFlag = false;
                        } else if ((IsAConstant("" + b.eval(), DiffWithRespTo)) || (Temp.contains("E-")) || (Temp.contains("E+"))) {
                            x = (() -> a.eval() - b.eval());
                            InitialHighLvlMapOp = false;
                        }
                        if (((IsAConstant("" + b.eval(), DiffWithRespTo)) || (Temp.contains("E-")) || (Temp.contains("E+"))) && (timesLoop == 0) && (LATermOperator == -1)) {
                            if ((chLA == '*') || (chLA == '/')) {
                                LAPreTermOperator = chLA;
                            }
                        }
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadConst:parseExpr:-:End:x.eval()=" + x.eval() + " b.eval()=" + b.eval() + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperatorInternal=" + (char) LATermOperatorInternal + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator);
                        }
                        log.info("LookAheadConst:parseExpr:-:x.eval()=" + x.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " InitialHighLvlMapOp=" + InitialHighLvlMapOp + " InitialHighLvlDyDxMapOp=" + InitialHighLvlDyDxMapOp + " GotVariableFlag=" + GotVariableFlag + " LATermOperator=" + (char) LATermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                        log.info("LookAheadConst:parseExpr:-:x.eval()=" + x.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " InitialHighLvlMapOp=" + InitialHighLvlMapOp + " InitialHighLvlDyDxMapOp=" + InitialHighLvlDyDxMapOp + " GotVariableFlag=" + GotVariableFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                    } else {
                        log.info("LookAheadConst:parseExpr:Else:Pre-Final:x.eval()=" + x.eval() + " InitialHighLvlMapOp=" + InitialHighLvlMapOp + " InitialHighLvlDyDxMapOp=" + InitialHighLvlDyDxMapOp + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutput=" + HighLvlMapOutput + " HighLvlMapOutputFirstDeno=" + HighLvlMapOutputFirstDeno + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                        if ((InitialHighLvlMapOp == true) && (x.eval() == (1.0 / HighLvlMapOutput))) {
                            final Double Temp1 = HighLvlMapOutput;
                            x = (() -> Temp1);
                        } else if ((InitialHighLvlDyDxMapOp == true) && (InitialHighLvlMapOp == false)) {
                            final Double Temp1 = 1.0 / x.eval();
                            x = (() -> Temp1);
                        }
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadConst:parseExpr:Return Value:End:x.eval()=" + x.eval() + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperatorInternal=" + (char) LATermOperatorInternal + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator);
                            System.out.println("LookAheadConst:parseExpr:Return Value:End:ComplexAssignFlag=" + ComplexAssignFlag + " GotVariableFlag=" + GotVariableFlag + " GotVariablePos=" + GotVariablePos + " GotIndConstFlag=" + GotIndConstFlag + " ContainsIndConstFlag=" + ContainsIndConstFlag);
                        }
                        log.info("LookAheadConst:parseExpr:Else:Final:x.eval()=" + x.eval() + " InitialHighLvlMapOp=" + InitialHighLvlMapOp + " InitialHighLvlDyDxMapOp=" + InitialHighLvlDyDxMapOp + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutput=" + HighLvlMapOutput + " HighLvlMapOutputFirstDeno=" + HighLvlMapOutputFirstDeno + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                        return x;
                    }
                }
            }

            LookAheadConst parseTerm() {
                double Output = 1.0;
                int StartPos = posLA;
                boolean InitialTermOp = true;
                boolean InitialHighLvlMapOp = false;
                boolean InitialHighLvlDyDxMapOp = false;
                double HighLvlMapOutputNum = 1.0;
                double HighLvlMapOutputFirstDeno = 1.0;
                double HighLvlMapOutputDeno = 1.0;
                double HighLvlMapOutput = 1.0;
                int LATermOperatorInternal = -1;

                LookAheadConst x = (() -> 1.0);
                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                    System.out.println("LookAheadConst:parseTerm:Before:StrLA=" + StrLA + " posLA=" + posLA + " chLA=" + (char) chLA);
                    System.out.println("LookAheadConst:parseTerm:Before:x.eval()=" + x.eval() + " ComplexAssignFlag=" + ComplexAssignFlag + " GotVariableFlag=" + GotVariableFlag + " GotVariablePos=" + GotVariablePos + " GotIndConstFlag=" + GotIndConstFlag + " ContainsIndConstFlag=" + ContainsIndConstFlag);
                }
                GotIndConstFlag = false;
                GotVariableFlag = false;
                x = parseFactor();
                int HPStartPos1 = posLA;
                log.info("LookAheadConst:parseTerm:Initial:0:x.eval()=" + x.eval() + " GotVariableFlag=" + GotVariableFlag + " LATermOperator=" + (char) LATermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                if ((InitialTermOp == true) && (StartPos >= 1) && (StartPos < StrLA.length()) && (StrLA.charAt(StartPos - 1) == '/')) {
                    log.info("LookAheadConst:parseTerm:Divide:HighLvlMapOutput=" + HighLvlMapOutput + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutputFirstDeno=" + HighLvlMapOutputFirstDeno + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " GotBracesVarFlag=" + GotBracesVarFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                    log.info("LookAheadConst:parseTerm:Divide:x.eval()=" + x.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                    HighLvlMapOutputFirstDeno = x.eval();
                    HighLvlMapOutput = x.eval();
                    final Double Temp = x.eval();
                    x = (() -> Temp);
                    InitialTermOp = false;
                    InitialHighLvlMapOp = true;
                    InitialHighLvlDyDxMapOp = true;
                    LATermOperatorInternal = StrLA.charAt(StartPos - 1);
                    LATermOperator = '/';
                    LAPreTermOperator = '/';
                    log.info("LookAheadConst:parseTerm:Divide:HighLvlMapOutput=" + HighLvlMapOutput + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutputFirstDeno=" + HighLvlMapOutputFirstDeno + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " GotBracesVarFlag=" + GotBracesVarFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                    log.info("LookAheadConst:parseTerm:Divide:x.eval()=" + x.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadConst:parseTerm:Initial:Inner:x.eval()=" + x.eval() + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperatorInternal=" + (char) LATermOperatorInternal + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator);
                    }
                } else if ((InitialTermOp == true) && (StartPos >= 1) && (StartPos < StrLA.length()) && (StrLA.charAt(StartPos - 1) == '*')) {
                    log.info("LookAheadConst:parseTerm:Divide:HighLvlMapOutput=" + HighLvlMapOutput + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutputFirstDeno=" + HighLvlMapOutputFirstDeno + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " GotBracesVarFlag=" + GotBracesVarFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                    log.info("LookAheadConst:parseTerm:Divide:x.eval()=" + x.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                    HighLvlMapOutput = x.eval();
                    final Double Temp = x.eval();
                    x = (() -> Temp);
                    InitialTermOp = false;
                    InitialHighLvlMapOp = true;
                    InitialHighLvlDyDxMapOp = true;
                    LATermOperatorInternal = StrLA.charAt(StartPos - 1);
                    LATermOperator = LATermOperatorInternal;
                    LAPreTermOperator = LATermOperatorInternal;
                    log.info("LookAheadConst:parseTerm:Divide:HighLvlMapOutput=" + HighLvlMapOutput + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutputFirstDeno=" + HighLvlMapOutputFirstDeno + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " GotBracesVarFlag=" + GotBracesVarFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                    log.info("LookAheadConst:parseTerm:Divide:x.eval()=" + x.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadConst:parseTerm:Initial:Inner:x.eval()=" + x.eval() + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperatorInternal=" + (char) LATermOperatorInternal + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator);
                    }
                }
                HighLvlMapOutputNum = x.eval();
                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                    System.out.println("LookAheadConst:parseTerm:Reached2:x.eval()=" + x.eval() + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperatorInternal=" + (char) LATermOperatorInternal + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator);
                    System.out.println("LookAheadConst:parseTerm:Reached2:GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag);
                }
                log.info("LookAheadConst:parseTerm:Initial:1:x.eval()=" + x.eval() + " InitialHighLvlMapOp=" + InitialHighLvlMapOp + " InitialHighLvlDyDxMapOp=" + InitialHighLvlDyDxMapOp + " GotVariableFlag=" + GotVariableFlag + " LATermOperator=" + (char) LATermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                for (;;) {
                    if (eatLA('*')) { // multiplication
                        GotVariableFlag = false;
                        GotIndConstFlag = false;
                        LookAheadConst a = x, b = parseFactor();
                        HPStartPos1 = posLA;
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadConst:parseTerm:*:After parseFactor:b.eval()=" + b.eval() + " x.eval()=" + x.eval() + " ComplexAssignFlag=" + ComplexAssignFlag + " TrailConstantFlag=" + TrailConstantFlag + " HighLvlMapOutput=" + HighLvlMapOutput + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperatorInternal=" + (char) LATermOperatorInternal + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator);
                        }
                        log.info("LookAheadConst:parseTerm:Multiply:a.eval()=" + a.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                        log.info("LookAheadConst:parseTerm:Multiply:b.eval()=" + b.eval() + " GotVariableFlag=" + GotVariableFlag + " LATermOperator=" + (char) LATermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                        String Temp = "" + b.eval();
                        if ((HighLvlMapOutput != 1.0) && (LATermOperatorInternal == '/')) {
                            if ((b.eval() != 1.0) && (LATermOperatorInternal == '/') && ((InitialHighLvlMapOp == true))) {
                                final double FinHighLvlMapOutput = HighLvlMapOutput;
                                final double FinHighLvlb1 = b.eval();
                                x = () -> FinHighLvlb1 / FinHighLvlMapOutput;
                                HighLvlMapOutputNum = x.eval();
                                HighLvlMapOutputDeno = x.eval();
                                final double FinHighLvlb2 = x.eval();
                                b = () -> FinHighLvlb2;
                                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("LookAheadConst:parseTerm:*:Inner:if:b.eval()=" + b.eval() + " x.eval()=" + x.eval() + " HighLvlMapOutput=" + HighLvlMapOutput + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " ParenthesisFlag=" + ParenthesisFlag + " LAPreTermOperator=" + (char) LAPreTermOperator + " LATermOperator=" + (char) LATermOperator);
                                }
                                InitialHighLvlMapOp = false;
                                LATermOperatorInternal = -1;
                                LAConstSimpleMapFlag = false;
                                ComplexAssignFlag = false;
                                TrailConstantFlag = false;
                                LAMAPOperator = -1;
                                LAPreTermOperator = '*';
                                LATermOperator = '*';
                                InitialHighLvlDyDxMapOp = false;
                            }
                        } else if (b.eval() != 1.0) {
                            HighLvlMapOutputNum = HighLvlMapOutputNum * b.eval();
                            final double finHighLvlMapOutputNum = HighLvlMapOutputNum;
                            x = () -> finHighLvlMapOutputNum;
                            log.info("LookAheadConst:parseTerm:Multiply:a.eval()=" + a.eval() + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutput=" + HighLvlMapOutput + " HighLvlMapOutputFirstDeno=" + HighLvlMapOutputFirstDeno + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " GotBracesVarFlag=" + GotBracesVarFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                            log.info("LookAheadConst:parseTerm:Multiply:b.eval()=" + b.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                            if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadConst:parseTerm:*:Inner:else if:b.eval()=" + b.eval() + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " ParenthesisFlag=" + ParenthesisFlag + " LAPreTermOperator=" + (char) LAPreTermOperator + " LATermOperator=" + (char) LATermOperator);
                            }
                        }
                        if ((a.eval() != 0.0) && (IsAConstant("" + b.eval(), DiffWithRespTo)) || (Temp.contains("E-")) || (Temp.contains("E+"))) {
                            if (LATermOperatorInternal == -1) {
                                //final double FinHighLvlb3=b.eval();
                                //x = (() -> (a.eval() * FinHighLvlb3));
                                LAPreTermOperator = '*';
                                LATermOperator = '*';
                                HighLvlMapOutput = HighLvlMapOutputNum / HighLvlMapOutputDeno;
                                final Double TempHighLvlMapOutput = HighLvlMapOutput;
                                x = (() -> TempHighLvlMapOutput);
                                log.info("LookAheadConst:parseTerm:Multiply:x.eval()=" + x.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " InitialHighLvlMapOp=" + InitialHighLvlMapOp + " InitialHighLvlDyDxMapOp=" + InitialHighLvlDyDxMapOp + " GotVariableFlag=" + GotVariableFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("LookAheadConst:parseTerm:*:FSM Value2:b.eval()=" + b.eval() + " x.eval=" + x.eval() + " ComplexAssignFlag=" + ComplexAssignFlag + " TrailConstantFlag=" + TrailConstantFlag + " HighLvlMapOutput=" + HighLvlMapOutput + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " LATermOperatorInternal=" + LATermOperatorInternal);
                                }
                            } else if (LATermOperatorInternal == '/') {
                                if ((b.eval() != 1.0) && (HighLvlMapOutputNum == 1.0)) {
                                    HighLvlMapOutputNum = b.eval();
                                    final double FinHighLvlb3 = b.eval();
                                    x = (() -> FinHighLvlb3 / a.eval());
                                    LATermOperatorInternal = -1;
                                    LAConstSimpleMapFlag = false;
                                    LAMAPOperator = -1;
                                    LAPreTermOperator = '*';
                                    log.info("LookAheadConst:parseTerm:Multiply:x.eval()=" + x.eval() + " b.eval()=" + b.eval() + " a.eval()=" + a.eval() + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " InitialHighLvlMapOp=" + InitialHighLvlMapOp + " InitialHighLvlDyDxMapOp=" + InitialHighLvlDyDxMapOp + " GotVariableFlag=" + GotVariableFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("LookAheadConst:parseTerm:*:LATermOperatorInternal:b.eval()=" + b.eval() + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " ParenthesisFlag=" + ParenthesisFlag);
                                    }
                                } else if ((b.eval() != 1.0) && (HighLvlMapOutputNum != 1.0) && (HighLvlMapOutput == 1.0)) {
                                    if ((HighLvlMapOutputNum % HighLvlMapOutputDeno) == 0) {
                                        HighLvlMapOutputNum = HighLvlMapOutputNum / HighLvlMapOutputDeno;
                                        HighLvlMapOutputDeno = 1.0;
                                        LATermOperatorInternal = -1;
                                        LAConstSimpleMapFlag = false;
                                        LAMAPOperator = -1;
                                        LAPreTermOperator = '*';
                                        LATermOperator = '*';
                                        final Double DblFinHighLvlMapOutputNum = HighLvlMapOutputNum;
                                        b = (() -> DblFinHighLvlMapOutputNum);
                                        x = b;
                                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                            System.out.println("LookAheadConst:parseTerm:*:LATermOperatorInternal:if:b.eval()=" + b.eval() + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " ParenthesisFlag=" + ParenthesisFlag);
                                        }
                                    } else
                                        ;//Do Nothing
                                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("LookAheadConst:parseTerm:*:LATermOperatorInternal:b.eval()=" + b.eval() + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " ParenthesisFlag=" + ParenthesisFlag);
                                    }
                                } else if ((b.eval() == 1.0) && (LAConstSimpleMapFlag == true)) {
                                    x = (() -> a.eval());
                                    LATermOperator = LAPreTermOperator;
                                    log.info("LookAheadConst:parseTerm:Multiply:x.eval()=" + x.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " InitialHighLvlMapOp=" + InitialHighLvlMapOp + " InitialHighLvlDyDxMapOp=" + InitialHighLvlDyDxMapOp + " GotVariableFlag=" + GotVariableFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("LookAheadConst:parseTerm:*:FSM Value1:b.eval()=" + b.eval() + " x.eval=" + x.eval() + " ComplexAssignFlag=" + ComplexAssignFlag + " TrailConstantFlag=" + TrailConstantFlag + " HighLvlMapOutput=" + HighLvlMapOutput + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator);
                                    }
                                } else {
                                    if ((HighLvlMapOutputFirstDeno == HighLvlMapOutput) && (HighLvlMapOutputNum == HighLvlMapOutput) && (LATermOperatorInternal == '/') && (ComplexAssignFlag == true) && (TrailConstantFlag == true)) {
                                        final double FinHighLvlMapOutput = HighLvlMapOutput;
                                        x = (() -> 1.0 / FinHighLvlMapOutput);
                                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                            System.out.println("LookAheadConst:parseTerm:*:else:else:b.eval()=" + b.eval() + " x.eval()=" + x.eval() + " HighLvlMapOutput=" + HighLvlMapOutput + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " ParenthesisFlag=" + ParenthesisFlag + " LAPreTermOperator=" + (char) LAPreTermOperator + " LATermOperator=" + (char) LATermOperator);
                                        }
                                    }
                                }
                            }
                            InitialHighLvlMapOp = false;
                            log.info("LookAheadConst:parseTerm:Multiply:x.eval()=" + x.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " InitialHighLvlMapOp=" + InitialHighLvlMapOp + " InitialHighLvlDyDxMapOp=" + InitialHighLvlDyDxMapOp + " GotVariableFlag=" + GotVariableFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                        }
                        if (((IsAConstant("" + b.eval(), DiffWithRespTo)) || (Temp.contains("E-")) || (Temp.contains("E+"))) && (LATermOperator == -1)) {
                            if ((chLA == '*') || (chLA == '/')) {
                                ;//LAPreTermOperator = chLA;
                            }
                        }
                        log.info("LookAheadConst:parseTerm:Multiply:x.eval()=" + x.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " InitialHighLvlMapOp=" + InitialHighLvlMapOp + " InitialHighLvlDyDxMapOp=" + InitialHighLvlDyDxMapOp + " GotVariableFlag=" + GotVariableFlag + " GotBracesVarFlag=" + GotBracesVarFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                        if ((GotBracesVarFlag == false) && ((chLA == '+') || (chLA == '-')) && (!isUnarySign(StrLA, posLA))) {
                            if ((posLA < (StrLA.length() - 1)) && (!IsNumber(StrLA.charAt(posLA + 1)))) {
                                log.info("LookAheadConst:parseTerm:Multiply:Pre-Final:x.eval()=" + x.eval() + " InitialHighLvlMapOp=" + InitialHighLvlMapOp + " InitialHighLvlDyDxMapOp=" + InitialHighLvlDyDxMapOp + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutput=" + HighLvlMapOutput + " HighLvlMapOutputFirstDeno=" + HighLvlMapOutputFirstDeno + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                                if ((InitialHighLvlMapOp == true) && (x.eval() == (1.0 / HighLvlMapOutput))) {
                                    final Double Temp1 = HighLvlMapOutput;
                                    x = (() -> Temp1);
                                    LAPreTermOperator = '*';
                                    LATermOperator = '*';
                                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("LookAheadConst:parseTerm:*:Pre-Final0:Initial Only:b.eval()=" + b.eval() + " x.eval=" + x.eval() + " ComplexAssignFlag=" + ComplexAssignFlag + " TrailConstantFlag=" + TrailConstantFlag + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator);
                                    }
                                } else if ((InitialHighLvlMapOp == false) && ((HighLvlMapOutputFirstDeno == HighLvlMapOutput) || (HighLvlMapOutput == x.eval())) && (HighLvlMapOutputDeno == 1.0) && (LAPreTermOperator == '/') && (b.eval() != 1.0) && (IsAConstant("" + b.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                                    final Double Temp1 = HighLvlMapOutputFirstDeno / b.eval();
                                    x = (() -> Temp1);
                                    LAPreTermOperator = '*';
                                    LATermOperator = '*';
                                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("LookAheadConst:parseTerm:*:Pre-Final1:Multiply:b.eval()=" + b.eval() + " x.eval=" + x.eval() + " ComplexAssignFlag=" + ComplexAssignFlag + " TrailConstantFlag=" + TrailConstantFlag + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator);
                                    }
                                } else if ((InitialHighLvlMapOp == false) && ((HighLvlMapOutputFirstDeno == HighLvlMapOutput) || (HighLvlMapOutput == x.eval())) && (LAPreTermOperator == '/')) {
                                    final Double Temp1 = HighLvlMapOutput;
                                    x = (() -> Temp1);
                                    LAPreTermOperator = '/';
                                    LATermOperator = '/';
                                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("LookAheadConst:parseTerm:*:Pre-Final2:Initial Only:b.eval()=" + b.eval() + " x.eval=" + x.eval() + " ComplexAssignFlag=" + ComplexAssignFlag + " TrailConstantFlag=" + TrailConstantFlag + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator);
                                    }
                                } else if ((InitialHighLvlMapOp == false) && ((HighLvlMapOutputFirstDeno == HighLvlMapOutput) || (HighLvlMapOutput == x.eval())) && (LAPreTermOperator == '*')) {
                                    final Double Temp1 = HighLvlMapOutput;
                                    x = (() -> Temp1);
                                    LAPreTermOperator = '*';
                                    LATermOperator = '*';
                                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("LookAheadConst:parseTerm:*:Pre-Final3:Initial Only:b.eval()=" + b.eval() + " x.eval=" + x.eval() + " ComplexAssignFlag=" + ComplexAssignFlag + " TrailConstantFlag=" + TrailConstantFlag + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator);
                                    }
                                } else if ((b.eval() == 1.0) && (HighLvlMapOutputFirstDeno == HighLvlMapOutput) && (HighLvlMapOutputDeno == 1.0) && (LAPreTermOperator == '/')) {
                                    x = (() -> 1.0);
                                    log.info("LookAheadConst:parseTerm:Multiply:Pre-Final:x.eval()=" + x.eval() + " a.eval()=" + a.eval() + " b.eval()=" + b.eval() + " InitialHighLvlMapOp=" + InitialHighLvlMapOp + " InitialHighLvlDyDxMapOp=" + InitialHighLvlDyDxMapOp + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutput=" + HighLvlMapOutput + " HighLvlMapOutputFirstDeno=" + HighLvlMapOutputFirstDeno + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("LookAheadConst:parseTerm:*:Pre-Final4:b.eval()=" + b.eval() + " x.eval=" + x.eval() + " ComplexAssignFlag=" + ComplexAssignFlag + " TrailConstantFlag=" + TrailConstantFlag + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator);
                                    }
                                } else if ((InitialHighLvlDyDxMapOp == true) && (InitialHighLvlMapOp == false) && ((LATermOperator == '/') || (LATermOperator == -1)) && (IsAConstant("" + b.eval(), DiffWithRespTo))) {
                                    log.info("LookAheadConst:parseTerm:Multiply:Pre-Final4:x.eval()=" + x.eval() + " a.eval()=" + a.eval() + " b.eval()=" + b.eval() + " InitialHighLvlMapOp=" + InitialHighLvlMapOp + " InitialHighLvlDyDxMapOp=" + InitialHighLvlDyDxMapOp + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutput=" + HighLvlMapOutput + " HighLvlMapOutputFirstDeno=" + HighLvlMapOutputFirstDeno + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                                    final Double Temp1 = HighLvlMapOutputFirstDeno * HighLvlMapOutputDeno;
                                    x = (() -> Temp1);
                                    LAPreTermOperator = '/';
                                    LATermOperator = '/';
                                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("LookAheadConst:parseTerm:*:Pre-Final5:else:/:b.eval()=" + b.eval() + " x.eval=" + x.eval() + " ComplexAssignFlag=" + ComplexAssignFlag + " TrailConstantFlag=" + TrailConstantFlag + " HighLvlMapOutput=" + HighLvlMapOutput + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator);
                                    }
                                } else if ((InitialHighLvlDyDxMapOp == true) && (InitialHighLvlMapOp == false) && (IsAConstant("" + b.eval(), DiffWithRespTo))) {
                                    log.info("LookAheadConst:parseTerm:Multiply:Pre-Final6:x.eval()=" + x.eval() + " a.eval()=" + a.eval() + " b.eval()=" + b.eval() + " InitialHighLvlMapOp=" + InitialHighLvlMapOp + " InitialHighLvlDyDxMapOp=" + InitialHighLvlDyDxMapOp + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutput=" + HighLvlMapOutput + " HighLvlMapOutputFirstDeno=" + HighLvlMapOutputFirstDeno + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                                    final Double Temp1 = HighLvlMapOutputNum / HighLvlMapOutputDeno;
                                    x = (() -> Temp1);
                                    LAPreTermOperator = '*';
                                    LATermOperator = '*';
                                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("LookAheadConst:parseTerm:*:Pre-Final6:else:*:b.eval()=" + b.eval() + " x.eval=" + x.eval() + " ComplexAssignFlag=" + ComplexAssignFlag + " TrailConstantFlag=" + TrailConstantFlag + " HighLvlMapOutput=" + HighLvlMapOutput + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator);
                                    }
                                }
                                log.info("LookAheadConst:parseTerm:Multiply:Final:x.eval()=" + x.eval() + " InitialHighLvlMapOp=" + " InitialHighLvlMapOp=" + InitialHighLvlMapOp + " InitialHighLvlDyDxMapOp=" + InitialHighLvlDyDxMapOp + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("LookAheadConst:parseTerm:*:Pre-Final:Return Value:b.eval()=" + b.eval() + " x.eval=" + x.eval() + " InitialHighLvlMapOp=" + InitialHighLvlMapOp + " ComplexAssignFlag=" + ComplexAssignFlag + " TrailConstantFlag=" + TrailConstantFlag + " HighLvlMapOutput=" + HighLvlMapOutput + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator);
                                }
                                GotIndConstFlag = false;
                                GotVariableFlag = false;
                                return x;
                            }
                            if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadConst:parseTerm:*:End Value1:b.eval()=" + b.eval() + " x.eval=" + x.eval() + " ComplexAssignFlag=" + ComplexAssignFlag + " TrailConstantFlag=" + TrailConstantFlag + " HighLvlMapOutput=" + HighLvlMapOutput + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " LATermOperatorInternal=" + LATermOperatorInternal);
                            }
                        }
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadConst:parseTerm:*:End Value2:b.eval()=" + b.eval() + " x.eval=" + x.eval() + " ComplexAssignFlag=" + ComplexAssignFlag + " TrailConstantFlag=" + TrailConstantFlag + " HighLvlMapOutput=" + HighLvlMapOutput + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " LATermOperatorInternal=" + LATermOperatorInternal);
                        }
                        GotIndConstFlag = false;
                        GotVariableFlag = false;
                        log.info("LookAheadConst:parseTerm:Multiply:x.eval()=" + x.eval() + " InitialHighLvlMapOp=" + InitialHighLvlMapOp + " InitialHighLvlDyDxMapOp=" + InitialHighLvlDyDxMapOp + " GotVariableFlag=" + GotVariableFlag + " LATermOperator=" + (char) LATermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                    } else if (eatLA('/')) { // division
                        GotVariableFlag = false;
                        GotIndConstFlag = false;
                        LookAheadConst a = x, b = parseFactor();
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadConst:parseTerm:/:After parseFactor:b.eval()=" + b.eval() + " x.eval()=" + x.eval() + " ComplexAssignFlag=" + ComplexAssignFlag + " TrailConstantFlag=" + TrailConstantFlag + " HighLvlMapOutput=" + HighLvlMapOutput + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator);
                        }
                        HPStartPos1 = posLA;
                        log.info("LookAheadConst:parseTerm:Divide:a.eval()=" + a.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " GotBracesVarFlag=" + GotBracesVarFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                        log.info("LookAheadConst:parseTerm:Divide:b.eval()=" + b.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                        String Temp = "" + b.eval();
                        if (b.eval() != 1.0) {
                            HighLvlMapOutputDeno = HighLvlMapOutputDeno * b.eval();
                            log.info("LookAheadConst:parseTerm:Divide:a.eval()=" + a.eval() + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutput=" + HighLvlMapOutput + " HighLvlMapOutputFirstDeno=" + HighLvlMapOutputFirstDeno + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " GotBracesVarFlag=" + GotBracesVarFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                            log.info("LookAheadConst:parseTerm:Divide:b.eval()=" + b.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                        }
                        if (GotVariableFlag == true) {
                            if (b.eval() != 1.0) {
                                LATermOperator = '/';
                                LAPreTermOperator = '/';
                            }
                            if ((LATermOperatorInternal == '/') && (b.eval() != 1.0)) {
                                x = (() -> (a.eval() * b.eval()));
                                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("LookAheadConst:parseTerm:/:After LATermOperatorInternal:b.eval()=" + b.eval() + " x.eval()=" + x.eval() + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " HighLvlMapOutput=" + HighLvlMapOutput + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno);
                                }
                                log.info("LookAheadConst:parseTerm:Divide:x.eval()=" + x.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " InitialHighLvlMapOp=" + InitialHighLvlMapOp + " InitialHighLvlDyDxMapOp=" + InitialHighLvlDyDxMapOp + " GotVariableFlag=" + GotVariableFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                            } else if ((a.eval() != 0.0) && ((a.eval() != 1.0)) && (IsAConstant("" + b.eval(), DiffWithRespTo)) || (Temp.contains("E-")) || (Temp.contains("E+"))) {
                                x = (() -> a.eval() / b.eval());
                                InitialHighLvlMapOp = false;
                                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("LookAheadConst:parseTerm:/:After InitialHighLvlMapOp:b.eval()=" + b.eval() + " x.eval()=" + x.eval() + " HighLvlMapOutput=" + HighLvlMapOutput + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno);
                                }
                                log.info("LookAheadConst:parseTerm:Divide:x.eval()=" + x.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " InitialHighLvlMapOp=" + InitialHighLvlMapOp + " InitialHighLvlDyDxMapOp=" + InitialHighLvlDyDxMapOp + " GotVariableFlag=" + GotVariableFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                            } else if (((a.eval() == 1.0) && (IsAConstant("" + b.eval(), DiffWithRespTo)) && (b.eval() != 0.0)) || (Temp.contains("E-")) || (Temp.contains("E+"))) {
                                x = (() -> b.eval());
                                if ((b.eval() != 1.0)) {
                                    LAConstSimpleMapFlag = true;
                                    LAPreTermOperator = '/';
                                    LATermOperator = '/';
                                    LATermOperatorInternal = '/';
                                }
                                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("LookAheadConst:parseTerm:/:After IsAConstant:b.eval()=" + b.eval() + " x.eval()=" + x.eval() + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " LAMAPOperator=" + (char) LAMAPOperator + " LATermOperatorInternal=" + LATermOperatorInternal);
                                }
                                log.info("LookAheadConst:parseTerm:Divide:x.eval()=" + x.eval() + " LAConstSimpleMapFlag=" + LAConstSimpleMapFlag + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " InitialHighLvlMapOp=" + InitialHighLvlMapOp + " InitialHighLvlDyDxMapOp=" + InitialHighLvlDyDxMapOp + " GotVariableFlag=" + GotVariableFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " LAMAPOperator=" + (char) LAMAPOperator + " LATermOperatorInternal=" + LATermOperatorInternal + " posLA=" + posLA + " chLA=" + (char) chLA);
                            } else if ((a.eval() == 1.0) && (b.eval() == 0.0)) {
                                x = (() -> Double.POSITIVE_INFINITY);
                            } else if ((a.eval() == -1.0) && (b.eval() == 0.0)) {
                                x = (() -> Double.NEGATIVE_INFINITY);
                            } else if ((a.eval() == 0.0) && (b.eval() == 0.0)) {
                                x = (() -> Double.NaN);
                            }

                            if (((IsAConstant("" + b.eval(), DiffWithRespTo)) || (Temp.contains("E-")) || (Temp.contains("E+"))) && (LATermOperator == -1) && (LAPreTermOperator == -1)) {
                                if ((chLA == '*') || (chLA == '/')) {
                                    //LAPreTermOperator = chLA;
                                    log.info("LookAheadConst:parseTerm:Divide:x.eval()=" + x.eval() + " b.eval()=" + b.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " InitialHighLvlMapOp=" + InitialHighLvlMapOp + " InitialHighLvlDyDxMapOp=" + InitialHighLvlDyDxMapOp + " GotVariableFlag=" + GotVariableFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                                }
                            }
                            log.info("LookAheadConst:parseTerm:Divide:x.eval()=" + x.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " InitialHighLvlMapOp=" + InitialHighLvlMapOp + " InitialHighLvlDyDxMapOp=" + InitialHighLvlDyDxMapOp + " GotVariableFlag=" + GotVariableFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                            if ((GotBracesVarFlag == false) && ((chLA == '+') || (chLA == '-'))) {
                                if ((posLA < (StrLA.length() - 1)) && (!IsNumber(StrLA.charAt(posLA + 1)))) {
                                    log.info("LookAheadConst:parseTerm:Divide:Pre-Final:x.eval()=" + x.eval() + " InitialHighLvlMapOp=" + InitialHighLvlMapOp + " InitialHighLvlDyDxMapOp=" + InitialHighLvlDyDxMapOp + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutput=" + HighLvlMapOutput + " HighLvlMapOutputFirstDeno=" + HighLvlMapOutputFirstDeno + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                                    if ((InitialHighLvlMapOp == true) && (x.eval() == (1.0 / HighLvlMapOutput))) {
                                        final Double Temp1 = HighLvlMapOutput;
                                        x = (() -> Temp1);
                                    } else if ((InitialHighLvlDyDxMapOp == true) && (InitialHighLvlMapOp == false) && (IsAConstant("" + b.eval(), DiffWithRespTo))) {
                                        final Double Temp1 = 1.0 / x.eval();
                                        x = (() -> Temp1);
                                    }
                                    log.info("LookAheadConst:parseTerm:Divide:Final:x.eval()=" + x.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " InitialHighLvlMapOp=" + InitialHighLvlMapOp + " InitialHighLvlDyDxMapOp=" + InitialHighLvlDyDxMapOp + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutput=" + HighLvlMapOutput + " HighLvlMapOutputFirstDeno=" + HighLvlMapOutputFirstDeno + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                                    if ((InitialHighLvlMapOp == true) && (x.eval() == (1.0 / HighLvlMapOutput))) {
                                        final Double Temp1 = HighLvlMapOutput;
                                        x = (() -> Temp1);
                                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                            System.out.println("LookAheadConst:parseTerm:End:InitialHighLvlMapOp:x.eval()=" + x.eval());
                                        }
                                    } else if ((InitialHighLvlDyDxMapOp == true) && (InitialHighLvlMapOp == false)) {
                                        final Double Temp1 = 1.0 / x.eval();
                                        x = (() -> Temp1);
                                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                            System.out.println("LookAheadConst:parseTerm:End:InitialHighLvlDyDxMapOp:x.eval()=" + x.eval());
                                        }
                                    } else if ((LAConstSimpleMapFlag == true) && (LAPreTermOperator == '/') && (HighLvlMapOutputNum < HighLvlMapOutputDeno) && (HighLvlMapOutputNum == 1.0)) {
                                        final Double Temp1 = HighLvlMapOutputDeno;
                                        x = (() -> Temp1);
                                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                            System.out.println("LookAheadConst:parseTerm:End:HighLvlMapOutputNum:1.0:x.eval()=" + x.eval() + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno);
                                        }
                                    } else if ((LAConstSimpleMapFlag == true) && (LAPreTermOperator == '/') && (HighLvlMapOutputNum < HighLvlMapOutputDeno)) {
                                        final Double Temp1 = HighLvlMapOutputDeno / HighLvlMapOutputNum;
                                        x = (() -> Temp1);
                                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                            System.out.println("LookAheadConst:parseTerm:End:HighLvlMapOutputDeno:x.eval()=" + x.eval() + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno);
                                        }
                                    } else if ((HighLvlMapOutputDeno > 1.0) && (HighLvlMapOutputNum > 1.0) && (x.eval() == 1.0)) {
                                        final Double Temp1 = HighLvlMapOutputDeno / HighLvlMapOutputNum;
                                        x = (() -> Temp1);
                                        LAConstSimpleMapFlag = true;
                                        LAPreTermOperator = '/';
                                        LATermOperator = '/';
                                        LATermOperatorInternal = '/';
                                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                            System.out.println("LookAheadConst:parseTerm:/:x.eval()==1:Return:b.eval()=" + b.eval() + " x.eval()=" + x.eval() + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno);
                                        }
                                    } else if ((HighLvlMapOutputDeno > 1.0) && (HighLvlMapOutputNum > 1.0) && (HighLvlMapOutputNum > HighLvlMapOutputDeno) && (x.eval() != 1.0)) {
                                        final Double Temp1 = HighLvlMapOutputNum / HighLvlMapOutputDeno;
                                        x = (() -> Temp1);
                                        LAConstSimpleMapFlag = true;
                                        LAPreTermOperator = '*';
                                        LATermOperator = '*';
                                        LATermOperatorInternal = '*';
                                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                            System.out.println("LookAheadConst:parseTerm:/:x.eval()!=1:HighLvlMapOutputNum:Return:b.eval()=" + b.eval() + " x.eval()=" + x.eval() + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno);
                                        }
                                    } else if ((HighLvlMapOutputDeno > 1.0) && (HighLvlMapOutputNum == 1.0) && (HighLvlMapOutputDeno > HighLvlMapOutputNum) && (x.eval() == 1.0)) {
                                        final Double Temp1 = HighLvlMapOutputDeno;
                                        x = (() -> Temp1);
                                        LAConstSimpleMapFlag = true;
                                        LAPreTermOperator = '/';
                                        LATermOperator = '/';
                                        LATermOperatorInternal = '/';
                                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                            System.out.println("LookAheadConst:parseTerm:/:x.eval()==1:HighLvlMapOutputNum:Return:b.eval()=" + b.eval() + " x.eval()=" + x.eval() + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno);
                                        }
                                    }
                                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("LookAheadConst:parseTerm:/:false:1:Return GotBracesVarFlag:b.eval()=" + b.eval() + " x.eval()=" + x.eval() + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno);
                                    }
                                    GotIndConstFlag = false;
                                    GotVariableFlag = false;
                                    return x;
                                }
                            }
                        } else if ((GotBracesVarFlag == true) && ((chLA == '+') || (chLA == '-'))) {
                            log.info("LookAheadConst:parseTerm:Divide:Pre-Final:x.eval()=" + x.eval() + " InitialHighLvlMapOp=" + InitialHighLvlMapOp + " InitialHighLvlDyDxMapOp=" + InitialHighLvlDyDxMapOp + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutput=" + HighLvlMapOutput + " HighLvlMapOutputFirstDeno=" + HighLvlMapOutputFirstDeno + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                            log.info("LookAheadConst:parseTerm:Divide:Final:x.eval()=" + x.eval() + " InitialHighLvlMapOp=" + " InitialHighLvlMapOp=" + InitialHighLvlMapOp + " InitialHighLvlDyDxMapOp=" + InitialHighLvlDyDxMapOp + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                            if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadConst:parseTerm:/:true:Return GotBracesVarFlag:b.eval()=" + b.eval() + " x.eval()=" + x.eval() + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno);
                            }
                            if ((InitialHighLvlMapOp == true) && (x.eval() == (1.0 / HighLvlMapOutput))) {
                                final Double Temp1 = HighLvlMapOutput;
                                x = (() -> Temp1);
                                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("LookAheadConst:parseTerm:End:InitialHighLvlMapOp:x.eval()=" + x.eval());
                                }
                            } else if ((InitialHighLvlDyDxMapOp == true) && (InitialHighLvlMapOp == false)) {
                                final Double Temp1 = 1.0 / x.eval();
                                x = (() -> Temp1);
                                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("LookAheadConst:parseTerm:End:InitialHighLvlDyDxMapOp:x.eval()=" + x.eval());
                                }
                            } else if ((LAConstSimpleMapFlag == true) && (LAPreTermOperator == '/') && (HighLvlMapOutputNum < HighLvlMapOutputDeno) && (HighLvlMapOutputNum == 1.0)) {
                                final Double Temp1 = HighLvlMapOutputDeno;
                                x = (() -> Temp1);
                                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("LookAheadConst:parseTerm:End:HighLvlMapOutputNum:1.0:x.eval()=" + x.eval() + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno);
                                }
                            } else if ((LAConstSimpleMapFlag == true) && (LAPreTermOperator == '/') && (HighLvlMapOutputNum < HighLvlMapOutputDeno)) {
                                final Double Temp1 = HighLvlMapOutputDeno / HighLvlMapOutputNum;
                                x = (() -> Temp1);
                                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("LookAheadConst:parseTerm:End:HighLvlMapOutputDeno:x.eval()=" + x.eval() + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " ParenthesisFlag=" + ParenthesisFlag);
                                }
                            } else if ((HighLvlMapOutputNum != 1.0) && (HighLvlMapOutputDeno != 1.0)) {
                                final Double Temp1 = HighLvlMapOutputNum / HighLvlMapOutputDeno;
                                x = (() -> Temp1);
                                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("LookAheadConst:parseTerm:Straight Case :End:" + (char) LAPreTermOperator + ":HighLvlMapOutputDeno:x.eval()=" + x.eval() + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " ParenthesisFlag=" + ParenthesisFlag);
                                }
                            }
                            if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadConst:parseTerm:/:1:Return Value:b.eval()=" + b.eval() + " ComplexAssignFlag=" + ComplexAssignFlag + " TrailConstantFlag=" + TrailConstantFlag + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator);
                            }
                            GotIndConstFlag = false;
                            GotVariableFlag = false;
                            return x;
                        } else if ((GotBracesVarFlag == false) && ((chLA != '+') && (chLA != '-'))) {
                            if ((posLA < (StrLA.length() - 1)) && (!IsNumber(StrLA.charAt(posLA + 1)))) {
                                log.info("LookAheadConst:parseTerm:Divide:Pre-Final:x.eval()=" + x.eval() + " InitialHighLvlMapOp=" + InitialHighLvlMapOp + " InitialHighLvlDyDxMapOp=" + InitialHighLvlDyDxMapOp + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutput=" + HighLvlMapOutput + " HighLvlMapOutputFirstDeno=" + HighLvlMapOutputFirstDeno + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                                if ((InitialHighLvlMapOp == true) && (x.eval() == (1.0 / HighLvlMapOutput))) {
                                    final Double Temp1 = HighLvlMapOutput;
                                    x = (() -> Temp1);
                                } else if ((InitialHighLvlDyDxMapOp == true) && (InitialHighLvlMapOp == false) && (IsAConstant("" + b.eval(), DiffWithRespTo))) {
                                    final Double Temp1 = 1.0 / x.eval();
                                    x = (() -> Temp1);
                                }
                                log.info("LookAheadConst:parseTerm:Divide:Final:x.eval()=" + x.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " InitialHighLvlMapOp=" + InitialHighLvlMapOp + " InitialHighLvlDyDxMapOp=" + InitialHighLvlDyDxMapOp + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutput=" + HighLvlMapOutput + " HighLvlMapOutputFirstDeno=" + HighLvlMapOutputFirstDeno + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                                if ((InitialHighLvlMapOp == true) && (x.eval() == (1.0 / HighLvlMapOutput))) {
                                    final Double Temp1 = HighLvlMapOutput;
                                    x = (() -> Temp1);
                                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("LookAheadConst:parseTerm:End:!=:InitialHighLvlMapOp:x.eval()=" + x.eval());
                                    }
                                } else if ((InitialHighLvlDyDxMapOp == true) && (InitialHighLvlMapOp == false)) {
                                    final Double Temp1 = 1.0 / x.eval();
                                    x = (() -> Temp1);
                                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("LookAheadConst:parseTerm:End:!=:InitialHighLvlDyDxMapOp:x.eval()=" + x.eval());
                                    }
                                } else if ((LAConstSimpleMapFlag == true) && (LAPreTermOperator == '/') && (HighLvlMapOutputNum < HighLvlMapOutputDeno) && (HighLvlMapOutputNum == 1.0)) {
                                    final Double Temp1 = HighLvlMapOutputDeno;
                                    x = (() -> Temp1);
                                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("LookAheadConst:parseTerm:End:!=:HighLvlMapOutputNum:1.0:x.eval()=" + x.eval() + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno);
                                    }
                                } else if ((LAConstSimpleMapFlag == true) && (LAPreTermOperator == '/') && (HighLvlMapOutputNum < HighLvlMapOutputDeno)) {
                                    final Double Temp1 = HighLvlMapOutputDeno / HighLvlMapOutputNum;
                                    x = (() -> Temp1);
                                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("LookAheadConst:parseTerm:End:!=:HighLvlMapOutputDeno:x.eval()=" + x.eval() + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno);
                                    }
                                } else {
                                    HighLvlMapOutput = HighLvlMapOutput / b.eval();
                                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("LookAheadConst:parseTerm:End:!=:Else:HighLvlMapOutputDeno:x.eval()=" + x.eval() + " HighLvlMapOutput=" + HighLvlMapOutput + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno);
                                    }
                                }
                                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("LookAheadConst:parseTerm:/:false:1:!=:Return GotBracesVarFlag:b.eval()=" + b.eval() + " x.eval()=" + x.eval() + " HighLvlMapOutput=" + HighLvlMapOutput + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno);
                                }
                            }
                        } else if ((GotBracesVarFlag == true) && ((chLA != '+') && (chLA != '-'))) {
                            log.info("LookAheadConst:parseTerm:Divide:Pre-Final:x.eval()=" + x.eval() + " InitialHighLvlMapOp=" + InitialHighLvlMapOp + " InitialHighLvlDyDxMapOp=" + InitialHighLvlDyDxMapOp + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutput=" + HighLvlMapOutput + " HighLvlMapOutputFirstDeno=" + HighLvlMapOutputFirstDeno + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                            log.info("LookAheadConst:parseTerm:Divide:Final:x.eval()=" + x.eval() + " InitialHighLvlMapOp=" + " InitialHighLvlMapOp=" + InitialHighLvlMapOp + " InitialHighLvlDyDxMapOp=" + InitialHighLvlDyDxMapOp + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                            if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadConst:parseTerm:/:true:!=:Return GotBracesVarFlag:b.eval()=" + b.eval() + " x.eval()=" + x.eval() + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno);
                            }
                            if ((InitialHighLvlMapOp == true) && (x.eval() == (1.0 / HighLvlMapOutput))) {
                                final Double Temp1 = HighLvlMapOutput;
                                x = (() -> Temp1);
                                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("LookAheadConst:parseTerm:End:!=:InitialHighLvlMapOp:x.eval()=" + x.eval());
                                }
                            } else if ((InitialHighLvlDyDxMapOp == true) && (InitialHighLvlMapOp == false)) {
                                final Double Temp1 = 1.0 / x.eval();
                                x = (() -> Temp1);
                                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("LookAheadConst:parseTerm:End:!=:InitialHighLvlDyDxMapOp:x.eval()=" + x.eval());
                                }
                            } else if ((LAConstSimpleMapFlag == true) && (LAPreTermOperator == '/') && (HighLvlMapOutputNum < HighLvlMapOutputDeno) && (HighLvlMapOutputNum == 1.0)) {
                                final Double Temp1 = HighLvlMapOutputDeno;
                                x = (() -> Temp1);
                                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("LookAheadConst:parseTerm:End:!=:HighLvlMapOutputNum:1.0:x.eval()=" + x.eval() + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno);
                                }
                            } else if ((LAConstSimpleMapFlag == true) && (LAPreTermOperator == '/') && (HighLvlMapOutputNum < HighLvlMapOutputDeno)) {
                                final Double Temp1 = HighLvlMapOutputDeno / HighLvlMapOutputNum;
                                x = (() -> Temp1);
                                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("LookAheadConst:parseTerm:End:!=:HighLvlMapOutputDeno:x.eval()=" + x.eval() + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " ParenthesisFlag=" + ParenthesisFlag);
                                }
                            }
                            if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadConst:parseTerm:/:1:Return Value:!=:b.eval()=" + b.eval() + " ComplexAssignFlag=" + ComplexAssignFlag + " TrailConstantFlag=" + TrailConstantFlag + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator);
                            }
                        }
                        if (HighLvlMapOutput > 1.0) {
                            HighLvlMapOutput = HighLvlMapOutputNum / HighLvlMapOutputDeno;
                        }
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadConst:parseTerm:/:Next:!=:b.eval()=" + b.eval() + " x.eval()=" + x.eval() + " HighLvlMapOutput=" + HighLvlMapOutput + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno);
                        }
                        GotIndConstFlag = false;
                        GotVariableFlag = false;
                        log.info("LookAheadConst:parseTerm:Divide:x.eval()=" + x.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " GotBracesVarFlag=" + GotBracesVarFlag + " InitialHighLvlMapOp=" + InitialHighLvlMapOp + " InitialHighLvlDyDxMapOp=" + InitialHighLvlDyDxMapOp + " GotVariableFlag=" + GotVariableFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                    } else if (eatLA('^')) {// exponent in braces
                        LookAheadConst a = x, b = parseFactor();
                        log.info("LookAheadConst:parseTerm:Exponent:a.eval()=" + a.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                        log.info("LookAheadConst:parseTerm:Exponent:b.eval()=" + b.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                        String Temp = "" + b.eval();
                        if (GotVariableFlag == true) {
                            LATermOperator = '/';
                        } else if ((IsAConstant("" + b.eval(), DiffWithRespTo)) || (Temp.contains("E-")) || (Temp.contains("E+"))) {
                            x = (() -> Math.pow(a.eval(), b.eval()));
                            InitialHighLvlMapOp = false;
                        }
                        if (((IsAConstant("" + b.eval(), DiffWithRespTo)) || (Temp.contains("E-")) || (Temp.contains("E+"))) && (timesLoop == 0) && (LATermOperator == -1)) {
                            if ((chLA == '*') || (chLA == '/')) {
                                LAPreTermOperator = chLA;
                            }
                        }
                        log.info("LookAheadConst:parseTerm:Exponent:x.eval()=" + x.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " InitialHighLvlMapOp=" + InitialHighLvlMapOp + " InitialHighLvlDyDxMapOp=" + InitialHighLvlDyDxMapOp + " GotVariableFlag=" + GotVariableFlag + " LATermOperator=" + (char) LATermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);

                        log.info("LookAheadConst:parseTerm:Exponent:x.eval()=" + x.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " InitialHighLvlMapOp=" + InitialHighLvlMapOp + " InitialHighLvlDyDxMapOp=" + InitialHighLvlDyDxMapOp + " GotVariableFlag=" + GotVariableFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                    } else {
                        log.info("LookAheadConst:parseTerm:Else:Pre-Final:x.eval()=" + x.eval() + " InitialHighLvlMapOp=" + InitialHighLvlMapOp + " InitialHighLvlDyDxMapOp=" + InitialHighLvlDyDxMapOp + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutput=" + HighLvlMapOutput + " HighLvlMapOutputFirstDeno=" + HighLvlMapOutputFirstDeno + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                        if ((InitialHighLvlMapOp == true) && (x.eval() == (1.0 / HighLvlMapOutput))) {
                            final Double Temp1 = HighLvlMapOutput;
                            x = (() -> Temp1);
                            if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadConst:parseTerm:End:InitialHighLvlMapOp:x.eval()=" + x.eval());
                            }
                        } else if ((InitialHighLvlDyDxMapOp == true) && (InitialHighLvlMapOp == false)) {
                            final Double Temp1 = HighLvlMapOutput;
                            x = (() -> Temp1);
                            if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadConst:parseTerm:End:InitialHighLvlDyDxMapOp:x.eval()=" + x.eval());
                            }
                        } else if ((LAConstSimpleMapFlag == true) && (LAPreTermOperator == '/') && (HighLvlMapOutputNum < HighLvlMapOutputDeno) && (HighLvlMapOutputNum == 1.0)) {
                            final Double Temp1 = HighLvlMapOutputDeno;
                            x = (() -> Temp1);
                            if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadConst:parseTerm:End:HighLvlMapOutputNum:1.0:x.eval()=" + x.eval() + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno);
                            }
                        } else if ((LAConstSimpleMapFlag == true) && (LAPreTermOperator == '/') && (HighLvlMapOutputNum < HighLvlMapOutputDeno)) {
                            final Double Temp1 = HighLvlMapOutputNum / HighLvlMapOutputDeno;
                            x = (() -> Temp1);
                            LAPreTermOperator = '*';
                            LATermOperator = '*';
                            if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadConst:parseTerm:End:HighLvlMapOutputDeno:x.eval()=" + x.eval() + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " ComplexAssignFlag=" + ComplexAssignFlag + " TrailConstantFlag=" + TrailConstantFlag + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator);
                            }
                        } else {
                            final Double Temp1 = HighLvlMapOutputNum / HighLvlMapOutputDeno;
                            x = (() -> Temp1);
                            if (LATermOperatorInternal == '*') {
                                LAPreTermOperator = '*';
                                LATermOperator = '*';
                            } else if (LATermOperatorInternal == '/') {
                                LAPreTermOperator = '/';
                                LATermOperator = '/';
                            }
                            if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadConst:parseTerm:End:Else:x.eval()=" + x.eval() + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " ComplexAssignFlag=" + ComplexAssignFlag + " TrailConstantFlag=" + TrailConstantFlag + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator);
                            }
                        }
                        if ((LATermOperator == '*') && (((x.eval() < 1.0) && (x.eval() > 0.0)) || ((x.eval() > -1.0) && (x.eval() < 0.0)))) {
                            LATermOperator = '/';
                            LAPreTermOperator = '/';
                            if ((HighLvlMapOutputNum > 1.0) && (HighLvlMapOutputNum < HighLvlMapOutputDeno) && (HighLvlMapOutputDeno % HighLvlMapOutputNum == 0)) {
                                final Double finHighLvlMapOutputDeno = HighLvlMapOutputDeno / HighLvlMapOutputNum;
                                x = (() -> finHighLvlMapOutputDeno);
                            } else if (HighLvlMapOutputNum == 1.0) {
                                final Double finHighLvlMapOutputDeno = HighLvlMapOutputDeno;
                                x = (() -> finHighLvlMapOutputDeno);
                            } else {
                                final Double finHighLvlMapOutputDeno = HighLvlMapOutputDeno / HighLvlMapOutputNum;
                                x = (() -> finHighLvlMapOutputDeno);
                            }
                        }
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadConst:parseTerm:End:Reached5:x.eval()=" + x.eval() + " ParenthesisFlag=" + ParenthesisFlag + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " ComplexAssignFlag=" + ComplexAssignFlag + " TrailConstantFlag=" + TrailConstantFlag + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator);
                        }
                        log.info("LookAheadConst:parseTerm:Else:Final:x.eval()=" + x.eval() + " InitialHighLvlMapOp=" + InitialHighLvlMapOp + " InitialHighLvlDyDxMapOp=" + InitialHighLvlDyDxMapOp + " HighLvlMapOutputNum=" + HighLvlMapOutputNum + " HighLvlMapOutput=" + HighLvlMapOutput + " HighLvlMapOutputFirstDeno=" + HighLvlMapOutputFirstDeno + " HighLvlMapOutputDeno=" + HighLvlMapOutputDeno + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                        return x;
                    }
                }
            }

            LookAheadConst parseFactor() {
                int StartPos1 = posLA;
                LookAheadConst x = (() -> 1.0);
                x = parseBase();
                log.info("LookAheadConst:parseFactor:x.eval()=" + x.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " GotBracesVarFlag=" + GotBracesVarFlag + " posLA=" + posLA + " chLA=" + (char) chLA);
                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                    System.out.println("LookAheadConst:parseFactor:Initial:StrLA=" + StrLA + " x.eval()=" + x.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " ComplexAssignFlag=" + ComplexAssignFlag + " TrailConstantFlag=" + TrailConstantFlag + " ParenthesisFlag" + ParenthesisFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator);
                }
                for (;;) {
                    if (eatLA('^')) { // exponentiation
                        LookAheadConst a = x, b = parseBase();
                        StartPos1 = posLA;
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadConst:parseFactor:^:Initial:StrLA=" + StrLA + " x.eval()=" + x.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator);
                        }
                        log.info("LookAheadConst:parseFactor:b.eval()=" + b.eval() + " posLA=" + posLA + " chLA=" + (char) chLA);
                        if ((GotVariableFlag == true)) {
                            x = (() -> 1.0);
                            a = (() -> 1.0);
                        } else if ((GotIndConstFlag == true)) {
                            x = (() -> 1.0);
                            a = (() -> 1.0);
                        } else {
                            //2^3
                            final double TempA = a.eval();
                            x = (() -> Math.pow(TempA, b.eval()));
                        }
                        log.info("LookAheadConst:parseFactor:x.eval()=" + x.eval() + " posLA=" + posLA + " chLA=" + (char) chLA);
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadConst:parseFactor:^:End:StrLA=" + StrLA + " x.eval()=" + x.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator);
                        }
                    } else {
                        if ((GotIndConstFlag == true)) {
                            x = (() -> 1.0);
                        } else if ((GotVariableFlag == true)) {
                            x = (() -> 1.0);
                        }
                        log.info("LookAheadConst:parseFactor:Return Value:x.eval()=" + x.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " posLA=" + posLA + " chLA=" + (char) chLA);
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadConst:parseFactor:Return:StrLA=" + StrLA + " x.eval()=" + x.eval() + " ComplexAssignFlag=" + ComplexAssignFlag + " TrailConstantFlag=" + TrailConstantFlag + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " ComplexAssignFlag=" + ComplexAssignFlag + " GotVariableFlag=" + GotVariableFlag + " GotVariablePos=" + GotVariablePos + " GotIndConstFlag=" + GotIndConstFlag + " ContainsIndConstFlag=" + ContainsIndConstFlag);
                        }
                        return x;
                    }
                }
            }

            LookAheadConst parseBase() {
                int startPos = posLA;
                LookAheadConst x = (() -> 1.0);
                if (eatLA('-')) { // unary minus
                    startPos = posLA;
                    LookAheadConst b = parseBase();
                    // IGNORING THE SIGN HERE AS LOOKAHEADSIGN ALREADY FACTORS IN THE SIGN
                    x = (() -> b.eval());
                    return x;
                } else if (eatLA('+')) { // unary plus
                    startPos = posLA;
                    x = parseBase();
                    return x;
                }
                if ((IsNumber(chLA))) { //numbers
                    log.info("LookAheadConst:parseBase:Entered Numbers:posLA=" + posLA + " startPos=" + startPos + " chLA=" + (char) chLA);
                    int startPos1 = posLA;
                    if (startPos1 >= 0) ; else {
                        startPos1 = 0;
                    }
                    while ((IsNumber(chLA)) && (chLA != -1)) {
                        nextCharLA();
                        if ((chLA == 'E') || (chLA == 'e')) {
                            nextCharLA();
                            if ((chLA == '-') || (chLA == '+')) {
                                nextCharLA();
                            }
                        }
                    }
                    double xx = 1.0;
                    if ((posLA != -1) && (chLA != -1)) {
                        if ((IsAConstant(StrLA.substring(startPos1, posLA), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                            xx = Double.parseDouble(StrLA.substring(startPos1, posLA));
                        }
                        log.info("LookAheadConst:parseBase:if:Number:x.eval()=" + x.eval() + " xx=" + xx + " posLA=" + posLA + " chLA=" + (char) chLA);
                    } else if ((IsAConstant(StrLA.substring(startPos1, posLA), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                        xx = Double.parseDouble(StrLA.substring(startPos1));
                        log.info("LookAheadConst:parseBase:Else:Number:x.eval()=" + x.eval() + " xx=" + xx + " posLA=" + posLA + " chLA=" + (char) chLA);
                    }

                    log.info("LookAheadConst:parseBase:0:Number:x.eval()=" + x.eval() + " xx=" + xx + " posLA=" + posLA + " chLA=" + (char) chLA);
                    final Double XX = xx;
                    x = () -> XX;
                    log.info("LookAheadConst:parseBase:1:Number:x.eval()=" + x.eval() + " xx=" + xx + " posLA=" + posLA + " chLA=" + (char) chLA);
                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadConst:parseBase:Numbers:XX=" + XX + ":StrLA=" + StrLA + " x.eval()=" + x.eval() + " ParenthesisFlag" + ParenthesisFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator);
                    }
                    return x;
                } else if (IsVariable(chLA)) {//functions & variables
                    int startPos1 = posLA;
                    if (startPos1 >= 0) ; else {
                        startPos1 = 0;
                    }
                    while (((IsVariable(chLA)) || (IsNumber(chLA))) && (chLA != -1)) {
                        nextCharLA();
                    }
                    String TempVar = StrLA.substring(startPos1, posLA);
                    log.info("LookAheadConst:parseBase:TempVar:TempVar=" + TempVar);
                    if ((!TempVar.equalsIgnoreCase(DiffWithRespTo)) && (variables.containsKey(TempVar)) && (GotIndConstFlag == false) && (GotIndConstPos == -1)) {
                        ContainsIndConstFlag = true;
                        GotIndConstFlag = true;
                        GotIndConstPos = startPos1;
                        if ((startPos1 > 0) && ((StrLA.charAt(startPos1 - 1) == '+') || (StrLA.charAt(startPos1 - 1) == '-'))) {
                            TermOperatorPos = startPos1 - 2;
                            log.info("LookAheadConst:parseBase:TempVar:startPos1 - 2:TermOperatorPos=" + TermOperatorPos + " GotIndConstPos=" + GotIndConstPos + " GotIndConstFlag=" + GotIndConstFlag + " ContainsIndConstFlag=" + ContainsIndConstFlag);
                        } else if (startPos1 > 0) {
                            TermOperatorPos = startPos1 - 1;
                            log.info("LookAheadConst:parseBase:TempVar:startPos1 - 1:TermOperatorPos=" + TermOperatorPos + " GotIndConstPos=" + GotIndConstPos + " GotIndConstFlag=" + GotIndConstFlag + " ContainsIndConstFlag=" + ContainsIndConstFlag);
                        }
                        log.info("LookAheadConst:parseBase:TempVar:TermOperatorPos=" + TermOperatorPos + " GotIndConstPos=" + GotIndConstPos + " GotIndConstFlag=" + GotIndConstFlag + " ContainsIndConstFlag=" + ContainsIndConstFlag);
                    } else if (ComplexAssignFlag == false) {
                        GotVariablePos = startPos1;
                        if ((startPos1 > 0) && ((StrLA.charAt(startPos1 - 1) == '+') || (StrLA.charAt(startPos1 - 1) == '-'))) {
                            TermOperatorPos = startPos1 - 2;
                        } else if (startPos1 > 0) {
                            TermOperatorPos = startPos1 - 1;
                        }
                        //ComplexAssignFlag = true;
                        log.info("LookAheadConst:parseBase:TempVar:TermOperatorPos=" + TermOperatorPos + " GotIndConstPos=" + GotIndConstPos + " GotIndConstFlag=" + GotIndConstFlag + " ContainsIndConstFlag=" + ContainsIndConstFlag);
                    }
                    log.info("LookAheadConst:parseBase:Variable:x.eval()=" + x.eval() + " TempVar=" + TempVar + " posLA=" + posLA + " chLA=" + (char) chLA + " ComplexAssignFlag=" + ComplexAssignFlag + " GotVariableFlag=" + GotVariableFlag + " GotVariablePos=" + GotVariablePos + " GotIndConstFlag=" + GotIndConstFlag + " ContainsIndConstFlag=" + ContainsIndConstFlag);
                    if (TempVar.equalsIgnoreCase(DiffWithRespTo)) {
                        GotVariableFlag = true;
                        x = () -> 1.0;
                        log.info("LookAheadConst:parseBase:Variable:x.eval()=" + x.eval() + " posLA=" + posLA + " chLA=" + (char) chLA + " ComplexAssignFlag=" + ComplexAssignFlag + " GotVariableFlag=" + GotVariableFlag + " GotVariablePos=" + GotVariablePos + " GotIndConstFlag=" + GotIndConstFlag + " ContainsIndConstFlag=" + ContainsIndConstFlag);
                    } else if ((TempVar.equalsIgnoreCase("Infinity")) || (TempVar.equalsIgnoreCase("NaN"))) {
                        // Extremities
                        //ProLambdaExtr y=parseExpr("LookAheadVar",  TempVar, "1.0",  "ProductRule",  DiffWithRespTo,  '*', "LowLevelRules");
                        //final String MyStr = y.StrExpr();
                        //x = () -> Double.parseDouble(MyStr);
                        x = (() -> 1.0);
                        log.info("LookAheadConst:parseBase:Variable:NaN:name=" + TempVar + " x.eval()=" + x.eval());
                    } else {
                        //Independent Constant
                        GotIndConstFlag = true;
                        ContainsIndConstFlag = true;
                        x = () -> 1.0;
                    }
                    log.info("LookAheadConst:parseBase:Variable:x.eval()=" + x.eval() + " posLA=" + posLA + " chLA=" + (char) chLA + " ComplexAssignFlag=" + ComplexAssignFlag + " GotVariableFlag=" + GotVariableFlag + " GotVariablePos=" + GotVariablePos + " GotIndConstFlag=" + GotIndConstFlag + " ContainsIndConstFlag=" + ContainsIndConstFlag);
                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadConst:parseBase:Variable:StrLA=" + StrLA + " x.eval()=" + x.eval() + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " ParenthesisFlag" + ParenthesisFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " ComplexAssignFlag=" + ComplexAssignFlag + " GotVariablePos=" + GotVariablePos + " ContainsIndConstFlag=" + ContainsIndConstFlag);
                    }
                    return x;
                } else if ((chLA == '(')&&(posLA < StrLA.length())&& (StrLA.substring(posLA).length() > 0) ){
                    //eatLA('(');
                    ParenthesisFlag = true;
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadConst:parseBase:(:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag);
                    }
                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadConst:parseBase:(:Before extractAndClassifyFactors:chLA=" + (char) chLA + " posLA=" + posLA + " StrLA=" + StrLA.substring(posLA));
                    }
                    int numberofcharsread = 0;
                    numberofcharsread = extractAndClassifyFactors(StrLA.substring(posLA), DiffWithRespTo, HideAllFlag);
                    //eatVar(')');
                    //posVar = numberofcharsread;
                    posLA = advanceOneTerm(StrLA, posLA);
                    if ((posLA >= 0) && (posLA < StrLA.length())) {
                        chLA = StrLA.charAt(posLA);
                    }
                    MyParenDecoded = "";
                    MyParenEncoded = "";
                    if (!ConstantTerms.isEmpty()) {
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("ConstantTerms:");
                            ConstantTerms.forEach(System.out::println);
                        }
                        for (String str : ConstantTerms) {
                            int kpara = -1;
                            kpara = str.indexOf("(");
                            int kplus = -1;
                            kplus = str.indexOf("+");
                            int kminus = -1;
                            kminus = str.indexOf("-");
                            boolean Multflag = false;
                            boolean Divflag = false;
                            if ((str.startsWith("*")) && (str.contains("(")) && (str.contains(")")) && ((str.contains("+")) || (str.contains("-")))) {
                                str = str.replaceFirst("\\*", "");
                                Multflag = true;
                            } else if ((str.startsWith("/")) && (str.contains("(")) && (str.contains(")")) && ((str.contains("+")) || (str.contains("-")))) {
                                str = str.replaceFirst("/", "");
                                Divflag = true;
                            }else if ((str.startsWith("*")) && (str.contains("(")) && (str.contains(")")) && ((!str.contains("+")) && (!str.contains("-")))) {
                                //str = str.replaceFirst("\\*", "");
                                Multflag = true;
                            }else if ((str.startsWith("/")) && (str.contains("(")) && (str.contains(")")) && ((!str.contains("+")) && (!str.contains("-")))) {
                                //str = str.replaceFirst("/", "");
                                //Percolate '/' to all '*' operators
                                str=str.replaceAll("\\*", "/");
                                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadConst:Constant:Percolate:String:(:str=t" + str + "t MyParenDecoded=" + MyParenDecoded + " StrIsAConstant=" + StrIsAConstant);
                            }
                                Divflag = true;
                            }
                            if ((str.contains("(")) && (str.contains(")")) && (!str.contains("+")) && (!str.contains("-"))) {
                                str = str.replaceFirst("\\(", "").replaceFirst("\\)", "");
                            } else if ((str.contains("(")) && (str.contains(")")) && ((str.contains("+")) && (isUnarySign(str, kplus)))) {
                                str = str.replaceFirst("\\(", "").replaceFirst("\\)", "").replaceFirst("\\+", "");
                            } else if ((str.contains("(")) && (str.contains(")")) && ((str.contains("-")) && (isUnarySign(str, kminus)))) {
                                str = str.replaceFirst("\\(", "").replaceFirst("\\)", "").replaceFirst("\\-", "");
                            }
                            String str1 = eatAll(str, ' ');
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                IsAConstant(str1, DiffWithRespTo);
                                System.out.println("LookAheadConst:Constant:Start:String:(:str1=t" + str1 + "t MyParenDecoded=" + MyParenDecoded + " StrIsAConstant=" + StrIsAConstant);
                            }
                            if (((str1.contains("+")) || (str1.contains("-"))) && (!str1.contains(DiffWithRespTo)) && (!(str1.matches("[\\+\\-\\*/^]*[a-zA-Z]+[0-9]*")))) {
                                depthBackUpRestore++;
                                StrKeyBackUpRestore = FileMathsBackUpRestore + "LookAheadConst:parseBase:Paran";
                                System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET: LookAheadConst:Recursivecall:Start:Maths:parseBase" + " depthBackUpRestore=" + depthBackUpRestore + ConsoleColors.RESET);
                                Map<String, String> variablesBackupState = new HashMap<>();
                                BackupMathsStateAll(variablesBackupState);
                                String Temp1 = str1.replaceFirst("\\(", "").replaceFirst("\\)", "");
                                MathsExpressionParser.Expression MyMappedArg = MathsExpressionParser.parse(Temp1, variables, DiffWithRespTo, HideAllFlag, "Silent", MathsExpressionParser.LogLevel.Info);
                                RestoreMathsStateAll(variablesBackupState);
                                depthBackUpRestore--;
                                StrKeyBackUpRestore = FileMathsBackUpRestore;
                                Double MySimpleExprn = MyMappedArg.eval();
                                if (Multflag == true) {
                                    str = "*" + MySimpleExprn;
                                } else if (Divflag == true) {
                                    str = "/" + MySimpleExprn;
                                } else {
                                    str = "" + MySimpleExprn;
                                }
                            }
                            MyParenDecoded = MyParenDecoded + str;
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadConst:Constant:String:(:str=" + str + " MyParenDecoded=" + MyParenDecoded + " StrIsAConstant=" + StrIsAConstant);
                            }
                        }

                        if ((LATermOperator == -1) && (MyParenDecoded.startsWith("/"))) {
                            LATermOperator = '/';
                            LAPreTermOperator = '/';
                        } else if ((LATermOperator == -1) && (MyParenDecoded.startsWith("*"))) {
                            LATermOperator = '*';
                            LAPreTermOperator = '*';
                        } else if ((MyParenDecoded.startsWith("/"))) {
                            LATermOperator = '/';
                            LAPreTermOperator = '/';
                        } else if ((MyParenDecoded.startsWith("*"))) {
                            LATermOperator = '*';
                            LAPreTermOperator = '*';
                        } else {
                            LATermOperator = '*';
                            LAPreTermOperator = '*';
                        }
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadConst:Middle:String:(:MyParenDecoded=" + MyParenDecoded);
                        }
                        if (MyParenDecoded.startsWith("-")) {
                            MyParenDecoded = MyParenDecoded.replaceFirst("\\-", "");
                        } else if (MyParenDecoded.startsWith("+")) {
                            MyParenDecoded = MyParenDecoded.replaceFirst("\\+", "");
                        } else if (MyParenDecoded.startsWith("*")) {
                            MyParenDecoded = MyParenDecoded.replaceFirst("\\*", "");
                        } else if (MyParenDecoded.startsWith("/")) {
                            MyParenDecoded = MyParenDecoded.replaceFirst("/", "");
                        } else if ((MyParenDecoded.contains("(")) && (MyParenDecoded.contains(")")) && (!MyParenDecoded.contains("+")) && (!MyParenDecoded.contains("-"))) {
                            MyParenDecoded = MyParenDecoded.replaceFirst("\\(", "");
                            MyParenDecoded = MyParenDecoded.replaceFirst("\\)", "");
                        }
                    }
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadConst:End:String:(:MyParenDecoded=" + MyParenDecoded);
                    }
                    MyParenEncoded = MyParenDecoded;
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadConst:Constant:String:(:MyParenEncoded=" + MyParenEncoded + " MyParenDecoded=" + MyParenDecoded + " StrIsAConstant=" + StrIsAConstant);
                        System.out.println("LookAheadConst:Constant:(:numberofcharsread=" + numberofcharsread + " posLA=" + posLA + " chLA=" + (char) chLA);
                    }
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        if ((posLA > -1) && (posLA < StrVar.length())) {
                            System.out.println("LookAheadConst:Constant:(:String:" + StrLA.substring(posLA) + " MyParenEncoded=" + MyParenEncoded + " MyParenDecoded=" + MyParenDecoded + " StrIsAConstant=" + StrIsAConstant);
                        } else {
                            System.out.println("LookAheadConst:Constant:(:String:MyParenEncoded=" + MyParenEncoded + " MyParenDecoded=" + MyParenDecoded + " StrIsAConstant=" + StrIsAConstant);
                        }
                        System.out.println("LookAheadConst:Constant:(:numberofcharsread=" + numberofcharsread + " posLA=" + posLA + " chLA=" + (char) chLA);
                    }
                    String Exprn = MyParenEncoded;//StrLA.substring(startcount, posLA);
                    //eatLA(')');
                    final String MyStr = Exprn;
                    log.info("LookAheadConst:parseBase:Paran:posLA=" + posLA + " chLA=" + (char) chLA);
                    if ((IsAConstant(Exprn, DiffWithRespTo))
                            && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                        x = (() -> Double.parseDouble(MyStr));
                        log.info("LookAheadConst:parseBase:Paran:Constant:MyStr=" + MyStr + " posLA=" + posLA + " chLA=" + (char) chLA);
                    } else if ((!IsAConstant(Exprn, DiffWithRespTo))
                            && (StrIsAConstant.equalsIgnoreCase("Var"))) {
                        log.info("LookAheadConst:parseBase:Paran:Var:arg.eval()=" + MyStr + " posLA=" + posLA + " chLA=" + (char) chLA);
                    } else if ((IsAConstant(Exprn, DiffWithRespTo))
                            && (StrIsAConstant.equalsIgnoreCase("NumberExpression"))) {
                        depthBackUpRestore++;
                        StrKeyBackUpRestore = FileMathsBackUpRestore + "LookAheadConst:parseBase:Paran";
                        System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET: LookAheadConst:Recursivecall:Start:Maths:parseBase" + " depthBackUpRestore=" + depthBackUpRestore + ConsoleColors.RESET);
                        Map<String, String> variablesBackupState = new HashMap<>();
                        BackupMathsStateAll(variablesBackupState);
                        String Temp1 = Exprn.replaceFirst("\\(", "").replaceFirst("\\)", "");
                        //SimpleExpression MyMappedArg = parseSimple(StrLA.substring(startcount, posLA), variables, variablesDiff, DiffWithRespTo);
                        //LookAheadConst MyMappedArg = parseLA(StrLA.substring(startcount, posLA), startcount, variables, DiffWithRespTo, true, HideAllFlag);
                        MathsExpressionParser.Expression MyMappedArg = MathsExpressionParser.parse(Temp1, variables, DiffWithRespTo, HideAllFlag, "Silent", MathsExpressionParser.LogLevel.Info);
                        RestoreMathsStateAll(variablesBackupState);
                        depthBackUpRestore--;
                        StrKeyBackUpRestore = FileMathsBackUpRestore;
                        final Double MySimpleExprn = MyMappedArg.eval();
                        System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET: LookAheadConst:Recursivecall:End:Maths:parseBase" + " depthBackUpRestore=" + depthBackUpRestore + ConsoleColors.RESET);

                        log.info("LookAheadConst:parseBase:Paran:arg.eval()=" + MyStr + " MySimpleExprn=" + MySimpleExprn + " posLA=" + posLA + " chLA=" + (char) chLA);
                        x = (() -> MySimpleExprn);
                        log.info("LookAheadConst:parseBase:Complete Paran String:x.eval()=" + x.eval() + " posLA=" + posLA + " chLA=" + (char) chLA);
                    }
                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadConst:parseBase:(:StrLA=" + StrLA + " x.eval()=" + x.eval() + " ParenthesisFlag" + ParenthesisFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator);
                    }
                    xTerms.clear();
                    otherTerms.clear();
                    ConstantTerms.clear();
                    return x;
                } else {
                    if (((IsNotAnOperator(chLA)) && ((!IsNumber(chLA)) && (!IsVariable(chLA)))) && (chLA != 0) && (chLA != -1) && (chLA != '(')) {
                        if ((StrLA != null) && (startPos < StrLA.length()) && (startPos < posLA) && (chLA != -1) && (chLA != 0)) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "LookAheadConst:parseBase:Unexpected: " + (char) chLA + " int=" + (int) chLA + " Cannot Format:" + StrLA.substring(posLA, StrLA.length()));
                        } else if ((chLA != -1) && (chLA != 0) && (posLA >= 1) && (posLA < StrLA.length()) && (IsNumber(chLA))) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "LookAheadConst:parseBase:Please Check Code:Should NOT reach Here:Unexpected: " + (char) chLA + " int=" + (int) chLA + " Cannot Format:" + StrLA.substring(posLA, StrLA.length()));
                        } else if ((chLA != -1) && (chLA != 0) && (IsOperator(chLA)) && (posLA >= 0) && (posLA < StrLA.length())) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "LookAheadConst:parseBase:Please Check Equation Operators:Should NOT reach Here:Unexpected: " + (char) chLA + " int=" + (int) chLA + " Cannot Format:" + StrLA.substring(posLA));
                        } else if ((chLA != -1) && (chLA != 0) && (posLA >= 0) && (posLA < StrLA.length())) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "LookAheadConst:parseBase:Unexpected: " + (char) chLA + " int=" + (int) chLA + " Cannot Format:" + StrLA.substring(posLA));
                        } else {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "LookAheadConst:parseBase:Unexpected char: " + (char) chLA + " int=" + (int) chLA + " Cannot Format:" + StrLA.substring(posLA));
                        }
                    }
                    return x;
                }
            }
        }.parseLAExpr();
    }

//Created by Rajesh Pai
// Converts Coefficients of a Term to a Single Value
    @FunctionalInterface
    public interface LookAheadVar {

        String eval();
    }

    public static LookAheadVar parseVar(String str, Map<String, Double> variables, String DiffWithRespTo, String MapType, String IntegrORDiffr, boolean HideAllFlag) {

        return new Object() {
            void nextCharVar() {
                ++posVar;
                chVar = (posVar < StrVar.length()) ? StrVar.charAt(posVar) : -1;
                if ((chVar == -1) && (posVar >= StrVar.length())) {
                    posVar = StrVar.length();
                } else if ((chVar == -1) || ((chVar == 0))) {
                    throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "LookAheadVar:nextCharVar:Unexpected: " + (char) chVar + " int=" + (int) chVar + " Cannot Format:" + StrVar.substring(posVar, StrVar.length()));
                }
            }

            boolean eatVar(int CharToEat) {
                while (chVar == ' ') {
                    nextCharVar();
                }
                if (chVar == CharToEat) {
                    nextCharVar();
                    return true;
                }
                return false;
            }

            void SyncVar() {
                if ((posVar < StrVar.length())
                        && (StrVar.charAt(posVar) != chVar)) {
                    if (StrVar.charAt(posVar + 1) == chVar) {
                        posVar++;
                    } else if (StrVar.charAt(posVar - 1) == chVar) {
                        posVar--;
                    }
                }
            }

            LookAheadVar parseVar() {
                LookAheadVar x = (() -> "");
                LookAheadVar y = (() -> "");
                StrVar = str;
                FunctionStr = "";
                LAVarTermOperator = -1;
                TermOutput = 0;
                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                    System.out.println("LookAheadVar:parseVar:Reached1.0:TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " posVar=" + posVar + " chVar=" + (char) chVar + " StrVar=" + StrVar);
                }
                if (posVar < 0) {
                    posVar = 0;
                }
                if ((posVar >= 0) && (StrVar.length() > 1) && (posVar < StrVar.length())) {
                    chIndConst = StrVar.charAt(posVar);
                }
                for (int i = posVar; (StrVar != null) && (!StrVar.equalsIgnoreCase("")) && (i >= 0) && (i < StrVar.length()); i--) {
                    if (IsVariable(StrVar.charAt(i)))
                            ; else if (IsNumber(StrVar.charAt(i)))
                            ; else if (isUnarySign(StrVar, i))
                                ; else if (i == posVar) {
                        i--;
                    }
                    if ((i >= 0) && (IsOperator(StrVar.charAt(i))) && (!isUnarySign(StrVar, i))) {
                        LAVarTermOperator = StrVar.charAt(i);
                    }
                    if (i == 0) {
                        LAVarTermOperator = '*';
                        posIndConst = i;
                    } else if ((IsOperator(LAVarTermOperator)) && (LAVarTermOperator != '^') && (!isUnarySign(StrVar, i))) {
                        posVar = i;
                        break;
                    }
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseVar:Reached1.1.1:TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " posVar=" + posVar + " chVar=" + (char) chVar + " StrVar=" + StrVar);
                    }
                }
                if ((posVar >= 0) && (StrVar.length() > 1) && (posVar < StrVar.length())) {
                    chIndConst = StrVar.charAt(posVar);
                }

                LAVarSimpleMapFlag = false;
                LAVarComplexMapFlag = false;
                ContainsXFlag = false;
                TempIndConstStrSet = false;
                TermOutput = 0.0;
                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                    System.out.println("LookAheadVar:parseVar:Initial:TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " posVar=" + posVar + " chVar=" + (char) chVar + " StrVar=" + StrVar);
                }
                if (ComplexAssignFlag == false) {
                    GotIndConstFlag = false;
                    GotIndConstPos = -1;
                }
                ParseLog("LookAheadVar", "parseVar", "Initial0", "StrVar", StrVar);
                if ((GotVariablePos > 1) && (StrLA.length() > GotVariablePos) && (ComplexAssignFlag == true) && (StrLA.charAt(GotVariablePos - 1) != '^')) {
                    ComplexAssignFlag = false;
                    GotVariableFlag = false;
                    StrVar = StrLA;
                    posVar = 0;//GotVariablePos;
                    chVar = StrVar.charAt(posVar);//StrVar.charAt(GotVariablePos);
                    //TermOperatorPos = GotVariablePos - 1;
                    TermOutput = 0.0;
                    log.info("LookAheadVar:parseVar: posVar=" + posVar + " chVar=" + (char) chVar + " ComplexAssignFlag=" + ComplexAssignFlag);
                } else if ((GotVariablePos > 1) && (StrLA.length() > GotVariablePos) && (ComplexAssignFlag == true) && (StrLA.charAt(GotVariablePos - 1) == '^')) {
                    ComplexAssignFlag = false;
                    GotVariableFlag = false;
                    posVar = 0;
                    StrVar = StrLA;
                    chVar = StrVar.charAt(posVar);
                    TermOutput = 0.0;
                    log.info("LookAheadVar:parseVar:posVar=" + posVar + " chVar=" + (char) chVar + " ComplexAssignFlag=" + ComplexAssignFlag);
                } else if ((StrVar != null) && (!StrVar.isBlank())) {
                    posVar = 0;
                    chVar = StrVar.charAt(posVar);
                    TermOperatorPos = -1;
                    TermOutput = 0.0;
                    log.info("LookAheadVar:parseVar:posVar=" + posVar + " chVar=" + (char) chVar + " TermOperatorPos=" + TermOperatorPos + " ComplexAssignFlag=" + ComplexAssignFlag);
                }
                int StartPos = posVar;
                log.info("LookAheadVar:parseVar:StartPos=" + StartPos + " posVar=" + posVar + " chVar=" + (char) chVar + " ComplexAssignFlag=" + ComplexAssignFlag);
                if (TermOperatorPos != -1) {
                    log.info("LookAheadVar:parseVar:TermOperatorPos=" + TermOperatorPos + " chVar=" + (char) chVar);
                }
                ParseLog("LookAheadVar", "parseVar", "Initial", "StrVar", StrVar);
                if ((StrVar != null) && (StrVar.length() > 0)
                        && (StrVar.length() < 2)
                        && ((chVar == '*')
                        || (chVar == '/')
                        || (chVar == '^'))) {
                    return x;
                } else {
                    x = parseTerm();
                }
                y = x;
                if ( (!x.eval().equalsIgnoreCase(DiffWithRespTo)) && (FunctionStr.equalsIgnoreCase("")) ) {
                    FunctionStr = x.eval();
                }
                if ((TrailConstantFlag == true) && (GotVariableFlag == true) || (ComplexAssignFlag == true)) {
                    ParseLog("LookAheadVar", "parseVar", "BeforeMap", "StrVar", StrVar);
                    ParseMapAPI("LookAheadVar:parseVar", StrVar.length(), 0, 0, DiffWithRespTo);
                }
                log.info("LookAheadVar:parseVar:Variable:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                log.info("LookAheadVar:parseVar:Initial :LATermOperator=" + (char) LATermOperator);
                log.info("LookAheadVar:parseVar:Initial :LATermOperatorBraces=" + (char) LATermOperatorBraces);
                log.info("LookAheadVar:parseVar:Initial :LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                log.info("LookAheadVar:parseVar:Initial :LAIndConstOperator=" + (char) LAIndConstOperator);
                log.info("LookAheadVar:parseVar:Initial :LAVarTermOperator=" + (char) LAVarTermOperator);
                log.info("LookAheadVar:parseVar:Initial :LAPreTermOperator=" + (char) LAPreTermOperator);
                log.info("LookAheadVar:parseVar:Initial :LAMAPOperator=" + (char) LAMAPOperator);
                log.info("LookAheadVar:parseVar:Initial :LADyYByDxMAPOperator=" + (char) LADyYByDxMAPOperator);
                log.info("LookAheadVar:parseVar:Initial :LAVarSimpleMapFlag=" + LAVarSimpleMapFlag);
                log.info("LookAheadVar:parseVar:Initial :LAVarComplexMapFlag=" + LAVarComplexMapFlag);
                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                    System.out.println("LookAheadVar:parseVar:Variable:x.eval()=" + x.eval() + " FunctionStr=" + FunctionStr + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " LAVarComplexMapFlag=" + LAVarComplexMapFlag + " LAVarSimpleMapFlag=" + LAVarSimpleMapFlag + " LAMAPOperator=" + LAMAPOperator + " LADyYByDxMAPOperator=" + LADyYByDxMAPOperator);
                }

                if ((x.eval().contains("(")) || ( (FunctionStr.equalsIgnoreCase(""))&& (x.eval().contains(DiffWithRespTo + "^"))) && (TermOutput > 0)) {
                    FunctionStr = x.eval();//Do Nothing as eval already is finished with function & Argument
                    final String FuncStr = x.eval();
                    if ((x.eval().contains(DiffWithRespTo + "^")) && (ContainsIndConstFlag == true)) {
                        ContainsIndConstFlag = false;
                    }
                    if ((x.eval().equalsIgnoreCase("Infinity")) || (x.eval().equalsIgnoreCase("NaN"))) {
                        ;//Do Nothing as e.eval() is already mapped 
                    } else if (TermOutput > 1.0) {
                        x = (() -> DiffWithRespTo + "^" + TermOutput);
                        if (LAVarTermOperator == '/') {
                            LAVarTermOperator = '*';
                        }
                        log.info("LookAheadVar:parseVar:Variable Mapping:Rule4:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule4:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " ParenthesisFlag=" + ParenthesisFlag);
                        }
                    } //FormSimpleTermParse:VarConstantRules:Mapping : No negative Exponent
                    else if ((TermOutput == -1.0) && ((LATermOperator == -1)) && (LAVarTermOperator == -1) && (LAMAPOperator == -1)) {
                        //Mapping /x to OR *x^-1 to *x OR /x  : No negative Exponent
                        x = (() -> "1.0" + "/" + DiffWithRespTo);
                        log.info("LookAheadVar:parseVar:Variable Mapping:Rule2:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule2:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                        }
                    } else if ((TermOutput == -1.0) && (LAVarSimpleMapFlag == true) && ((LATermOperator == '*') || (LADyYByDxMAPOperator == -1) || (LATermOperator == -1)) && (LAMAPOperator == -1)) {
                        //Mapping /x to *x OR x^-1 to *x
                        //FormSimpleTermParse:DIV:Rules:Mapping:Div Rule:2.1 to 2.8 
                        x = (() -> DiffWithRespTo);
                        if ((LATermOperator == '*')) {
                            LAVarTermOperator = '/';
                            log.info("LookAheadVar:parseVar:Variable Mapping:Rule3.1:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule3.1:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                            }
                        } else if ((LATermOperator == -1) && (LAVarTermOperator == '/')) {
                            LAVarTermOperator = '/';
                            LATermOperator = '/';
                            LAMAPOperator = '*';
                            LADyYByDxMAPOperator = '*';
                            log.info("LookAheadVar:parseVar:Variable Mapping:Rule3.2:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule3.2:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                            }
                        } else if ((LATermOperator == -1) && (LAVarTermOperator == '*')) {
                            LAVarTermOperator = '*';
                            LATermOperator = '*';
                            LAMAPOperator = '*';
                            LADyYByDxMAPOperator = '/';
                            log.info("LookAheadVar:parseVar:Variable Mapping:Rule3.3:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                        }
                        log.info("LookAheadVar:parseVar:Variable Mapping:Rule3:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule3:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                        }
                    } //FormSimpleTermParse:DIV:Rules:Mapping:Div Rule:2.9 to 2.13 : With negative Exponent
                    else if ((TermOutput == -1.0) && (LAVarComplexMapFlag == true) && (LAVarTermOperator == '/') && (LAMAPOperator == -1)) {
                        //Mapping /x to *x OR x^-1 to *x
                        LAMAPOperator = '/';
                        LADyYByDxMAPOperator = '/';
                        x = (() -> DiffWithRespTo);
                        log.info("LookAheadVar:parseVar:Variable Mapping:Rule4:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " LAMAPOperator=" + (char) LAMAPOperator + " LADyYByDxMAPOperator=" + (char) LADyYByDxMAPOperator);
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule4:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " LAMAPOperator=" + (char) LAMAPOperator + " LADyYByDxMAPOperator=" + (char) LADyYByDxMAPOperator);
                        }
                    } else if ((TermOutput == -1.0) && (LAVarComplexMapFlag == true) && (LAMAPOperator == 0) && (LADyYByDxMAPOperator != -1)) {
                        //Mapping /x to *x OR x^-1 to *x
                        if ((LATermOperator == '*')) {
                            LAVarTermOperator = '/';
                            log.info("LookAheadVar:parseVar:Variable Mapping:Rule4.1:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                        } //Straight Case Mapping
                        else if ((LATermOperator == -1) && (LAVarTermOperator == '/') && (LAMAPOperator != -1) && (LADyYByDxMAPOperator != -1)) {
                            LAVarTermOperator = '/';
                            LATermOperator = '/';
                            LAMAPOperator = '*';
                            LADyYByDxMAPOperator = '*';
                            log.info("LookAheadVar:parseVar:Variable Mapping:Rule4.2:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule4.2:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                            }
                        } //1st Order DyByDx Mapping Rule
                        else if ((LATermOperator == -1) && (LAVarTermOperator == '*')) {
                            LAVarTermOperator = '*';
                            LATermOperator = '/';
                            LAMAPOperator = -1;
                            LADyYByDxMAPOperator = -1;
                            log.info("LookAheadVar:parseVar:Variable Mapping:Rule4.3:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule4.3:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                            }
                        } else {
                            LAVarTermOperator = '*';
                            LATermOperator = '/';
                            LAMAPOperator = -1;
                            LADyYByDxMAPOperator = '/';
                            LAPreTermOperator = -1;
                            log.info("LookAheadVar:parseVar:Variable Mapping:Rule4.4:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule4.4:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                            }
                        }
                        x = (() -> DiffWithRespTo);
                        log.info("LookAheadVar:parseVar:Variable Mapping:Rule4A:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " LAMAPOperator=" + (char) LAMAPOperator + " LADyYByDxMAPOperator=" + (char) LADyYByDxMAPOperator);
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule4A:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " LAMAPOperator=" + (char) LAMAPOperator + " LADyYByDxMAPOperator=" + (char) LADyYByDxMAPOperator);
                        }
                    } else if ((TermOutput == -1.0) && (LAVarSimpleMapFlag == true) && (LADyYByDxMAPOperator == -1) && (LAPreTermOperator == -1) && (LATermOperator == -1)) {
                        //Mapping of x^-1 term alone (with No Operand)
                        x = (() -> 1.0 + "/" + DiffWithRespTo);
                        log.info("LookAheadVar:parseVar:Variable Mapping:Rule4B:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " LAMAPOperator=" + (char) LAMAPOperator + " LADyYByDxMAPOperator=" + (char) LADyYByDxMAPOperator);
                        if ((DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule4B:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " LAMAPOperator=" + (char) LAMAPOperator + " LADyYByDxMAPOperator=" + (char) LADyYByDxMAPOperator);
                        }
                    } else if ((TermOutput == -1.0) && (LADyYByDxMAPOperator == -1)) {
                        x = (() -> DiffWithRespTo);
                        LAVarSimpleMapFlag = true;
                        LAVarTermOperator = '/';
                        log.info("LookAheadVar:parseVar:Variable Mapping:Rule4C:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " LAMAPOperator=" + (char) LAMAPOperator + " LADyYByDxMAPOperator=" + (char) LADyYByDxMAPOperator);
                        if ((DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule4C:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " LAMAPOperator=" + (char) LAMAPOperator + " LADyYByDxMAPOperator=" + (char) LADyYByDxMAPOperator);
                        }
                    } else if ((TermOutput == -1.0) && (LAVarComplexMapFlag == true) && (LADyYByDxMAPOperator == -1)) {
                        x = (() -> DiffWithRespTo);
                        log.info("LookAheadVar:parseVar:Variable Mapping:Rule4D:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " LAMAPOperator=" + (char) LAMAPOperator + " LADyYByDxMAPOperator=" + (char) LADyYByDxMAPOperator);
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule4D:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " LAMAPOperator=" + (char) LAMAPOperator + " LADyYByDxMAPOperator=" + (char) LADyYByDxMAPOperator);
                        }
                    } else if ((TermOutput == -1.0) && (LADyYByDxMAPOperator == -1) && (LAPreTermOperator == '/')) {
                        x = (() -> 1.0 + "/" + DiffWithRespTo);
                        log.info("LookAheadVar:parseVar:Variable Mapping:Rule4E:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " LAMAPOperator=" + (char) LAMAPOperator + " LADyYByDxMAPOperator=" + (char) LADyYByDxMAPOperator);
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule4E:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " LAMAPOperator=" + (char) LAMAPOperator + " LADyYByDxMAPOperator=" + (char) LADyYByDxMAPOperator);
                        }
                    } else if ((TermOutput == 1.0) && ((LATermOperator == '*') || (LATermOperator == -1))) {
                        x = (() -> DiffWithRespTo);
                        log.info("LookAheadVar:parseVar:Variable Mapping:Rule5:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule5:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                        }
                    } else if ((TermOutput == 1.0) && (LATermOperator == '/')) {
                        x = (() -> DiffWithRespTo);
                        log.info("LookAheadVar:parseVar:Variable Mapping:Rule6:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule6:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                        }
                    } else if ((TermOutput == 0.0) && ((x.eval().equalsIgnoreCase(DiffWithRespTo)))) {
                        x = (() -> DiffWithRespTo);
                        log.info("LookAheadVar:parseVar:Variable Mapping:Rule7:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule7:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                        }
                    } else if ((TermOutput == 0.0) && (!x.eval().equalsIgnoreCase(DiffWithRespTo)) && (!x.eval().equalsIgnoreCase(""))) {
                        if ((TermOutput == 0.0) && (!x.eval().equalsIgnoreCase("1.0"))) {
                            x = (() -> "");
                            log.info("LookAheadVar:parseVar:Variable Mapping:Rule8.0:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule8.0:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                            }
                        } else if (ContainsXFlag == true) {
                            x = (() -> DiffWithRespTo + "^0.0");
                            log.info("LookAheadVar:parseVar:Variable Mapping:Rule8.1:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule8.1:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                            }
                        }
                        log.info("LookAheadVar:parseVar:Variable Mapping:Rule8:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    } else if (TermOutput < -1.0) {
                        //TermOutput = -1.0 * TermOutput;
                        x = (() -> DiffWithRespTo + "^" + TermOutput);
                        log.info("LookAheadVar:parseVar:Variable Mapping:Rule9:Initial:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule9:Initial:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                        }
                    } else {
                        throw new RuntimeException("LookAheadVar:IF NOT SATISFIED:LOOP:parseVar:");
                    }
                    final String FuncStr1 = x.eval();
                    x = () -> FuncStr1;
                    log.info("LookAheadVar:parseVar:Variable Mapping:Rule A:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule A:DIV Operator:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " ParenthesisFlag=" + ParenthesisFlag);
                    }
                } else if (((x.eval().contains("(")) && (x.eval().contains(DiffWithRespTo))) || (x.eval().contains(DiffWithRespTo + "^"))) {
                    FunctionStr = x.eval();//Do Nothing as eval already is finished with function & Argument
                    if ((x.eval().contains(DiffWithRespTo + "^")) && (ContainsIndConstFlag == true)) {
                        ContainsIndConstFlag = false;
                    }
                    log.info("LookAheadVar:parseVar:Variable Mapping:Rule A:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule A:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    }
                } else if ((x.eval().equalsIgnoreCase("Infinity")) || (x.eval().equalsIgnoreCase("NaN"))) {
                    ;//Do Nothing as e.eval() is already mapped 
                } else if (TermOutput > 1.0) {
                    x = (() -> DiffWithRespTo + "^" + TermOutput);
                    if (LAVarTermOperator == '/') {
                        LAVarTermOperator = '*';
                    }
                    log.info("LookAheadVar:parseVar:Variable Mapping:Rule2:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule2:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " ParenthesisFlag=" + ParenthesisFlag);
                    }
                } //FormSimpleTermParse:VarConstantRules:Mapping : No negative Exponent
                else if ((TermOutput == -1.0) && ((LATermOperator == -1)) && (LAVarTermOperator == -1) && (LAMAPOperator == -1)) {
                    //Mapping /x to OR *x^-1 to *x OR /x  : No negative Exponent
                    x = (() -> "1.0" + "/" + DiffWithRespTo);
                    log.info("LookAheadVar:parseVar:Variable Mapping:Rule2:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule2.1:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " ParenthesisFlag=" + ParenthesisFlag);
                    }
                } else if ((TermOutput == -1.0) && (LAVarSimpleMapFlag == true) && ((LATermOperator == '*') || (LADyYByDxMAPOperator == -1) || (LATermOperator == -1)) && (LAMAPOperator == -1)) {
                    //Mapping /x to *x OR x^-1 to *x
                    //FormSimpleTermParse:DIV:Rules:Mapping:Div Rule:2.1 to 2.8 
                    x = (() -> DiffWithRespTo);
                    if ((LAVarTermOperator == '/')) {
                        LAVarTermOperator = '/';
                        LAMAPOperator = '*';
                        LADyYByDxMAPOperator = '*';
                        log.info("LookAheadVar:parseVar:Variable Mapping:Rule3.2:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    } else if ((LAVarTermOperator == '*')) {
                        LAVarTermOperator = '*';
                        LAMAPOperator = '*';
                        LADyYByDxMAPOperator = '/';
                        log.info("LookAheadVar:parseVar:Variable Mapping:Rule3.3:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    }
                    log.info("LookAheadVar:parseVar:Variable Mapping:Rule3:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule2.2:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " ParenthesisFlag=" + ParenthesisFlag);
                    }
                } //FormSimpleTermParse:DIV:Rules:Mapping:Div Rule:2.9 to 2.13 : With negative Exponent
                else if ((TermOutput == -1.0) && (LAVarComplexMapFlag == true) && (LATermOperator == '/') && (LAMAPOperator == -1)) {
                    //Mapping /x to *x OR x^-1 to *x
                    LAMAPOperator = '/';
                    LADyYByDxMAPOperator = '/';
                    x = (() -> DiffWithRespTo);
                    log.info("LookAheadVar:parseVar:Variable Mapping:Rule4:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " LAMAPOperator=" + (char) LAMAPOperator + " LADyYByDxMAPOperator=" + (char) LADyYByDxMAPOperator);
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule2.3:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " ParenthesisFlag=" + ParenthesisFlag);
                    }
                } else if ((TermOutput == -1.0) && (LAVarComplexMapFlag == true) && (LAMAPOperator == 0) && (LADyYByDxMAPOperator != -1)) {
                    //Mapping /x to *x OR x^-1 to *x
                    if ((LATermOperator == '*')) {
                        LAVarTermOperator = '/';
                        log.info("LookAheadVar:parseVar:Variable Mapping:Rule4.1:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    } //Straight Case Mapping
                    else if ((LATermOperator == -1) && (LAVarTermOperator == '/') && (LAMAPOperator != -1) && (LADyYByDxMAPOperator != -1)) {
                        LAVarTermOperator = '/';
                        LATermOperator = '/';
                        LAMAPOperator = '*';
                        LADyYByDxMAPOperator = '*';
                        log.info("LookAheadVar:parseVar:Variable Mapping:Rule4.2:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    } //1st Order DyByDx Mapping Rule
                    else if ((LATermOperator == -1) && (LAVarTermOperator == '*')) {
                        LAVarTermOperator = '*';
                        LATermOperator = '/';
                        LAMAPOperator = -1;
                        LADyYByDxMAPOperator = -1;
                        log.info("LookAheadVar:parseVar:Variable Mapping:Rule4.3:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    } else {
                        LAVarTermOperator = '*';
                        LATermOperator = '/';
                        LAMAPOperator = -1;
                        LADyYByDxMAPOperator = '/';
                        LAPreTermOperator = -1;
                        log.info("LookAheadVar:parseVar:Variable Mapping:Rule4.4:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    }
                    x = (() -> DiffWithRespTo);
                    log.info("LookAheadVar:parseVar:Variable Mapping:Rule4A:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " LAMAPOperator=" + (char) LAMAPOperator + " LADyYByDxMAPOperator=" + (char) LADyYByDxMAPOperator);
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule4A:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " LAMAPOperator=" + (char) LAMAPOperator + " LADyYByDxMAPOperator=" + (char) LADyYByDxMAPOperator);
                    }
                } else if ((TermOutput == -1.0) && (LAVarSimpleMapFlag == true) && (LADyYByDxMAPOperator == -1) && (LAPreTermOperator == -1) && (LATermOperator == -1)) {
                    //Mapping of x^-1 term alone (with No Operand)
                    x = (() -> 1.0 + "/" + DiffWithRespTo);
                    log.info("LookAheadVar:parseVar:Variable Mapping:Rule4B:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " LAMAPOperator=" + (char) LAMAPOperator + " LADyYByDxMAPOperator=" + (char) LADyYByDxMAPOperator);
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule4B:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " ParenthesisFlag=" + ParenthesisFlag);
                    }
                } else if ((TermOutput == -1.0) && (LADyYByDxMAPOperator == -1) && (LAPreTermOperator != '/')) {
                    x = (() -> DiffWithRespTo);
                    LAVarSimpleMapFlag = true;
                    LAVarTermOperator = '/';
                    log.info("LookAheadVar:parseVar:Variable Mapping:Rule4C:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " LAMAPOperator=" + (char) LAMAPOperator + " LADyYByDxMAPOperator=" + (char) LADyYByDxMAPOperator);
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule4C:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " ParenthesisFlag=" + ParenthesisFlag);
                    }
                } else if ((TermOutput == -1.0) && (LAVarComplexMapFlag == true) && (LADyYByDxMAPOperator == -1) && (LAPreTermOperator == '/') && (LATermOperator == -1)) {
                    x = (() -> DiffWithRespTo);
                    log.info("LookAheadVar:parseVar:Variable Mapping:Rule4D:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " LAMAPOperator=" + (char) LAMAPOperator + " LADyYByDxMAPOperator=" + (char) LADyYByDxMAPOperator);
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule4D:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " ParenthesisFlag=" + ParenthesisFlag);
                    }
                } else if ((TermOutput == -1.0) && (LADyYByDxMAPOperator == -1) && ((LAPreTermOperator == '/') || (LAVarTermOperator == '/'))) {
                    x = (() -> 1.0 + "/" + DiffWithRespTo);
                    log.info("LookAheadVar:parseVar:Variable Mapping:Rule4E:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " LAMAPOperator=" + (char) LAMAPOperator + " LADyYByDxMAPOperator=" + (char) LADyYByDxMAPOperator);
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule4E:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " ParenthesisFlag=" + ParenthesisFlag);
                    }
                } else if ((TermOutput == 1.0) && ((LATermOperator == '*') || (LATermOperator == -1))) {
                    x = (() -> DiffWithRespTo);
                    log.info("LookAheadVar:parseVar:Variable Mapping:Rule5:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule5:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " ParenthesisFlag=" + ParenthesisFlag);
                    }
                } else if ((TermOutput == 1.0) && (LATermOperator == '/')) {
                    x = (() -> DiffWithRespTo);
                    log.info("LookAheadVar:parseVar:Variable Mapping:Rule6:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule6:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " ParenthesisFlag=" + ParenthesisFlag);
                    }
                } else if ((TermOutput == 0.0) && ((x.eval().equalsIgnoreCase(DiffWithRespTo)))) {
                    x = (() -> DiffWithRespTo);
                    log.info("LookAheadVar:parseVar:Variable Mapping:Rule7:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule7:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " ParenthesisFlag=" + ParenthesisFlag);
                    }
                } else if ((TermOutput == 0.0) && (!x.eval().equalsIgnoreCase(DiffWithRespTo)) && (!x.eval().equalsIgnoreCase("")) && (!x.eval().contains(DiffWithRespTo))) {
                    if ((TermOutput == 0.0) && (!x.eval().equalsIgnoreCase("1.0"))) {
                        x = (() -> "");
                        if (!FunctionStr.contains(DiffWithRespTo)) {
                            FunctionStr = "";
                        }
                        log.info("LookAheadVar:parseVar:Variable Mapping:Rule8.0:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    } else if (ContainsXFlag == true) {
                        x = (() -> DiffWithRespTo + "^0.0");
                        log.info("LookAheadVar:parseVar:Variable Mapping:Rule8.1:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    } else {
                        x = (() -> "");
                        if (!FunctionStr.contains(DiffWithRespTo)) {
                            FunctionStr = "";
                        }
                    }
                    log.info("LookAheadVar:parseVar:Variable Mapping:Rule8:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule8:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    }
                } else if (TermOutput < -1.0) {
                    if ((LAVarTermOperator == '*') && (LAVarComplexMapFlag == false)) {
                        LAVarSimpleMapFlag = true;
                        if ((LAMAPOperator == -1) || (LAMAPOperator == '*')) {
                            LAMAPOperator = '/';
                            LAVarTermOperator = '/';
                        } else if (LAMAPOperator == '/') {
                            LAMAPOperator = '*';
                            LAVarTermOperator = '*';
                        }
                        // Flip the Operator
                        TermOutput = -1.0 * TermOutput;
                        x = (() -> DiffWithRespTo + "^" + TermOutput);
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule9.1:Final:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " LAMAPOperator=" + (char) LAMAPOperator + " LAVarComplexMapFlag=" + LAVarComplexMapFlag);
                        }
                    } else if ((LAVarTermOperator == '/') && (LAVarComplexMapFlag == false)) {
                        LAVarSimpleMapFlag = true;
                        if ((LAMAPOperator == -1) || (LAMAPOperator == '*')) {
                            LAMAPOperator = '/';
                        } else if (LAMAPOperator == '/') {
                            LAMAPOperator = '*';
                        }
                        // Flip the Operator
                        TermOutput = -1.0 * TermOutput;
                        x = (() -> DiffWithRespTo + "^" + TermOutput);
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule9.2:Final:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " LAMAPOperator=" + (char) LAMAPOperator + " LAVarComplexMapFlag=" + LAVarComplexMapFlag);
                        }
                    } else if ((LAVarTermOperator == '/') && (TermOutput < 0)) {
                        TermOutput = -1.0 * TermOutput;
                        x = (() -> DiffWithRespTo + "^" + TermOutput);
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule9.3:Final:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " LAMAPOperator=" + (char) LAMAPOperator + " LAVarComplexMapFlag=" + LAVarComplexMapFlag);
                        }
                    } else if ((LAVarTermOperator == '*') && (TermOutput < 0)) {
                        TermOutput = -1.0 * TermOutput;
                        LAVarTermOperator = '/';
                        x = (() -> DiffWithRespTo + "^" + TermOutput);
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule9.3:Final:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " LAMAPOperator=" + (char) LAMAPOperator + " LAVarComplexMapFlag=" + LAVarComplexMapFlag);
                        }
                    }
                    log.info("LookAheadVar:parseVar:Variable Mapping:Rule9:Final:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule9:Final:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " LAMAPOperator=" + (char) LAMAPOperator + " LAVarComplexMapFlag=" + LAVarComplexMapFlag);
                    }
                } else if (TermOutput > 0.0) {
                    x = (() -> DiffWithRespTo + "^" + TermOutput);
                    log.info("LookAheadVar:parseVar:Variable Mapping:Rule2:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule2:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " ParenthesisFlag=" + ParenthesisFlag);
                    }
                } else if (TermOutput < 0.0) {
                    x = (() -> DiffWithRespTo + "^" + TermOutput);
                    log.info("LookAheadVar:parseVar:Variable Mapping:Rule3:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule3:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " ParenthesisFlag=" + ParenthesisFlag);
                    }
                } else if ((TermOutput == -1.0) && (LAVarTermOperator == -1)) {
                    x = (() -> DiffWithRespTo);
                    LAVarTermOperator = '/';
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseVar:Variable Mapping:else:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " ParenthesisFlag=" + ParenthesisFlag);
                    }
                }
                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                    System.out.println("LookAheadVar:parseVar:Variable Mapping:Rule A:DIV Operator:Outside FSM Block:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " ParenthesisFlag=" + ParenthesisFlag);
                }
                log.info("LookAheadVar:parseVar:Final:Variable:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                log.info("LookAheadVar:parseVar:Final :LATermOperator=" + (char) LATermOperator);
                log.info("LookAheadVar:parseVar:Final :LATermOperatorBraces=" + (char) LATermOperatorBraces);
                log.info("LookAheadVar:parseVar:Final :LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                log.info("LookAheadVar:parseVar:Final :LAIndConstOperator=" + (char) LAIndConstOperator);
                log.info("LookAheadVar:parseVar:Final :LAVarTermOperator=" + (char) LAVarTermOperator);
                log.info("LookAheadVar:parseVar:Final :LAPreTermOperator=" + (char) LAPreTermOperator);
                log.info("LookAheadVar:parseVar:Final :LAMAPOperator=" + (char) LAMAPOperator);
                log.info("LookAheadVar:parseVar:Final :LADyYByDxMAPOperator=" + (char) LADyYByDxMAPOperator);
                log.info("LookAheadVar:parseVar:Final :LAVarSimpleMapFlag=" + LAVarSimpleMapFlag);
                log.info("LookAheadVar:parseVar:Final :LAVarComplexMapFlag=" + LAVarComplexMapFlag);
                if ((!FunctionStr.equalsIgnoreCase("")) && (!FunctionStr.contains(DiffWithRespTo))) {
                    FunctionStr = x.eval();
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseVar:Variable Mapping:PreFinal:Rule1:x.eval()=" + x.eval() + " FunctionStr=" + FunctionStr + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    }
                } else if ((FunctionStr.equalsIgnoreCase("")) && ((x.eval().contains(DiffWithRespTo + "^")) || (x.eval().equalsIgnoreCase(DiffWithRespTo)))) {
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseVar:Variable Mapping:PreFinal:Rule2:x.eval()=" + x.eval() + " FunctionStr=" + FunctionStr + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    }
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseVar:Variable Mapping:Final:0:x.eval()=" + x.eval() + " FunctionStr=" + FunctionStr + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    }
                    ContainsXFlag = true;
                    return x;
                } else if ((FunctionStr.equalsIgnoreCase("")) && ((y.eval().contains("(")) || (y.eval().contains("^" + DiffWithRespTo))) && (!y.eval().equalsIgnoreCase(x.eval()))) {
                    if ((LAVarTermOperator == -1) && (x.eval().equalsIgnoreCase("0.0"))) {
                        FunctionStr = y.eval();//Do Nothing as eval already is finished with function & Argument
                    } else if (!x.eval().equalsIgnoreCase("")) {
                        //Do Nothing as eval already is finished with function & Argument
                        if (LAVarTermOperator == -1) {
                            FunctionStr = x.eval() + (char) '*' + y.eval();
                        } else {
                            FunctionStr = x.eval() + (char) LAVarTermOperator + y.eval();
                        }
                        log.info("LookAheadVar:parseVar:FunctionStr:0:Variable:x.eval()=" + x.eval() + " FunctionStr=" + FunctionStr + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    } else if (x.eval().equalsIgnoreCase("")) {
                        if ((!y.eval().contains(DiffWithRespTo)) && (TermOutput == 0.0))
                            ; else {
                            FunctionStr = y.eval();//Do Nothing 
                        }
                    }
                    if ((y.eval().contains("^" + DiffWithRespTo)) && (ContainsIndConstFlag == true)) {
                        ContainsIndConstFlag = false;
                    }
                    log.info("LookAheadVar:parseVar:FunctionStr:0:Variable:x.eval()=" + x.eval() + " FunctionStr=" + FunctionStr + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseVar:Variable Mapping:PreFinal:Rule3:x.eval()=" + x.eval() + " FunctionStr=" + FunctionStr + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    }
                } else if ((!y.eval().equalsIgnoreCase(x.eval())) && (!FunctionStr.equalsIgnoreCase("")) && (!x.eval().equalsIgnoreCase("1.0")) && (!x.eval().equalsIgnoreCase(DiffWithRespTo)) && (!x.eval().contains(DiffWithRespTo + "^")) && (!x.eval().contains("("))) {
                    if (!x.eval().equalsIgnoreCase(""))
                        FunctionStr = x.eval() + "*" + FunctionStr;
                    else
                        x=(()-> FunctionStr);
                    log.info("LookAheadVar:parseVar:FunctionStr:1:Variable:x.eval()=" + x.eval() + " FunctionStr=" + FunctionStr + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseVar:Variable Mapping:PreFinal:Rule4:x.eval()=" + x.eval() + " FunctionStr=" + FunctionStr + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    }
                } else if ((!FunctionStr.equalsIgnoreCase("")) && (!x.eval().equalsIgnoreCase("1.0")) && (x.eval().equalsIgnoreCase(DiffWithRespTo))) {
                    if (!x.eval().equalsIgnoreCase(""))
                        FunctionStr = x.eval() + "*" + FunctionStr;
                    else
                        x=(()-> FunctionStr);
                    log.info("LookAheadVar:parseVar:FunctionStr:2:Variable:x.eval()=" + x.eval() + " FunctionStr=" + FunctionStr + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseVar:Variable Mapping:PreFinal:Rule5:x.eval()=" + x.eval() + " FunctionStr=" + FunctionStr + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    }
                } else if ((!FunctionStr.equalsIgnoreCase("")) && (x.eval().equalsIgnoreCase("1.0"))) {
                    FunctionStr = FunctionStr;
                    log.info("LookAheadVar:parseVar:FunctionStr:3:Variable:x.eval()=" + x.eval() + " FunctionStr=" + FunctionStr + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseVar:Variable Mapping:PreFinal:Rule6:x.eval()=" + x.eval() + " FunctionStr=" + FunctionStr + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    }
                } else if ((x.eval().equalsIgnoreCase(DiffWithRespTo)) && (TermOutput == 1.0)) {
                    FunctionStr = "1.0";
                    log.info("LookAheadVar:parseVar:FunctionStr:4:Variable:x.eval()=" + x.eval() + " FunctionStr=" + FunctionStr + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseVar:Variable Mapping:PreFinal:Rule7:x.eval()=" + x.eval() + " FunctionStr=" + FunctionStr + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    }
                } else if (((x.eval().equalsIgnoreCase(DiffWithRespTo)) || (x.eval().equalsIgnoreCase("1.0/" + DiffWithRespTo))) && (TermOutput == -1.0)) {
                    FunctionStr = "1.0";
                    if ((x.eval().equalsIgnoreCase("1.0/" + DiffWithRespTo)) && (TermOutput == -1.0)) {
                        LAVarTermOperator = '/';
                    }
                    x = () -> "1.0";
                    log.info("LookAheadVar:parseVar:FunctionStr:4:Variable:x.eval()=" + x.eval() + " FunctionStr=" + FunctionStr + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseVar:Variable Mapping:PreFinal:Rule7.1:x.eval()=" + x.eval() + " FunctionStr=" + FunctionStr + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    }
                } else if (!FunctionStr.contains(DiffWithRespTo)) {
                    FunctionStr = "";
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseVar:Variable Mapping:PreFinal:Rule8:x.eval()=" + x.eval() + " FunctionStr=" + FunctionStr + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    }
                } else if (FunctionStr.equalsIgnoreCase("")) {
                    FunctionStr = x.eval();
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseVar:Variable Mapping:PreFinal:Rule9:x.eval()=" + x.eval() + " FunctionStr=" + FunctionStr + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    }
                } else if (!FunctionStr.equalsIgnoreCase(x.eval())) {
                    if ( (!FunctionStr.startsWith("+")) &&(FunctionStr.contains("+")) )
                        FunctionStr="(" + FunctionStr + ")";
                    else if ( (!FunctionStr.startsWith("-")) &&(FunctionStr.contains("-")) )
                        FunctionStr="(" + FunctionStr + ")";
                    if (!x.eval().equalsIgnoreCase(""))
                        FunctionStr = x.eval() + "*" + FunctionStr;
                    else
                        x=(()-> FunctionStr);
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseVar:Variable Mapping:PreFinal:Rule10:x.eval()=" + x.eval() + " FunctionStr=" + FunctionStr + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    }
                }
                
                final String MyString = FunctionStr;
                x = (() -> MyString);
                if ((!IsAConstant(MyString, DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("Var")) || (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
                    ContainsXFlag = true;
                }
                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag == true) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                    System.out.println("LookAheadVar:parseVar:Variable Mapping:Final:x.eval()=" + x.eval() + " FunctionStr=" + FunctionStr + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                }
                log.info("LookAheadVar:parseVar:FINAL:2:Variable:x.eval()=" + x.eval() + " FunctionStr=" + FunctionStr + " TermOutput=" + TermOutput + " LATermOperator=" + (char) LATermOperator + " LAVarTermOperator=" + (char) LAVarTermOperator);
                ParseLog("LookAheadVar", "parseVar", "Final", "StrVar", StrVar);
                return x;
            }

            LookAheadVar parseTerm() {
                int StartPos = posVar;
                LookAheadVar x = (() -> "");
                TermOutputSetFlag = false;
                GotExpntNumFlag = false;
                TermOutputAddedOnceFlag = false;
                log.info("LookAheadVar:parseTerm:TermOutput=" + TermOutput);
                //System.out.println("LookAheadVar:parseTerm:TermOperatorPos=" + TermOperatorPos);
                for (;;) {
                    if ((eatVar('*')) || (TermOperatorPos == -1) || ((!StrVar.isBlank()) && (StrVar.charAt(TermOperatorPos) == '*')) || ((!StrVar.isBlank()) && (StrVar.charAt(TermOperatorPos) == '^'))) { // multiplication
                        log.info("LookAheadVar:parseTerm:Multiply:Entered:TermOperatorPos:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar + " StrVar.length=" + StrVar.length());
                        TermOutputOperator = '*';
                        TermOutputAddedOnceFlag = false;
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadVar:parseTerm:*:Start:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator);
                        }
                        TermOutputSetFlag = false;
                        GotExpntNumFlag = false;
                        LookAheadVar a = x, b = parseFactor();
                        if (TermOperatorPos == -1) {
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadVar:parseTerm:*:Rule1:Start:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " b.eval()=" + b.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator);
                            }
                            if (TermOutput == -1.0) {
                                LAVarSimpleMapFlag = true;
                            }
                            if ((TermOutputSetFlag == false) || ((StrVar != null) && (posVar < (StrVar.length() - 1)) && ((StrVar.charAt(posVar + 1) == '*') || (StrVar.charAt(posVar + 1) == '/')))) {
                                if ((!b.eval().contains("("))
                                        && (((posVar + 1) < StrVar.length())
                                        && ((StrVar.charAt(posVar + 1) == '*')
                                        || (StrVar.charAt(posVar + 1) == '/')))) {
                                    TermOutput += 1.0;
                                    TermOutputSetFlag = true;
                                    TermOutputAddedOnceFlag = true;
                                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("LookAheadVar:parseTerm:*:Rule1:if:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator);
                                    }
                                } else if ((TermOutputSetFlag == false) && (b.eval().equalsIgnoreCase(DiffWithRespTo))) {
                                    TermOutput += 1.0;
                                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("LookAheadVar:parseTerm:*:Rule1:Else:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator);
                                    }
                                }
                                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("LookAheadVar:parseTerm:*:Rule1:if:End:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator);
                                }
                            }
                            x = b;
                            log.info("LookAheadVar:parseTerm:Multiply:Rule1:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar);
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadVar:parseTerm:*:Rule1:Middle:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator);
                            }
                            if ((LAVarTermOperator == -1) && (TermOutput < 0.0)) {
                                LAVarTermOperator = '/';
                            } else if ((LAVarTermOperator == -1) && (TermOutput > 0.0)) {
                                LAVarTermOperator = '*';
                            }
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadVar:parseTerm:*:Rule1.1:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator);
                            }
                        } // Mapping x^-1.0 OR x^1.0
                        else if ((IsAConstant(b.eval(), DiffWithRespTo)) && ((b.eval().equalsIgnoreCase("-1.0")) || (b.eval().equalsIgnoreCase("1.0")))) {
                            x = a;
                            log.info("LookAheadVar:parseTerm:Multiply:Rule2:IsAConstant:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " chVar=" + (char) chVar);
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadVar:parseTerm:*:Rule2:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator);
                            }
                        } // Mapping x^2.0 OR x^-2.0 Onwards
                        else if (IsAConstant(b.eval(), DiffWithRespTo)) {
                            x = a;
                            log.info("LookAheadVar:parseTerm:Multiply:Rule3:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar);
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadVar:parseTerm:*:Rule3:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " b.eval()=" + b.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator);
                            }
                        } else if (b.eval().equalsIgnoreCase(DiffWithRespTo)) {
                            if ((TermOutputSetFlag == false) || ((posVar < StrVar.length()) && ((posVar + 1) < StrVar.length()) && ((StrVar.charAt(posVar + 1) == '*') || (StrVar.charAt(posVar + 1) == '/')))) {
                                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("LookAheadVar:parseTerm:*:Rule4:Start:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " b.eval()=" + b.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " TermOutputAddedOnceFlag=" + TermOutputAddedOnceFlag + " posVar=" + posVar + " chVar=" + (char) chVar + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator);
                                }
                                if ((TermOutput == 0.0) && (LAVarTermOperator == -1)) {
                                    LAVarTermOperator = '*';
                                }
                                //Already Added
                                if (TermOutputAddedOnceFlag == true)
                                    ; else {
                                    TermOutput += 1.0;
                                }
                                if (GotBracesVarFlag == true) {
                                    GotBracesVarFlag = false;
                                    nextCharVar();
                                }
                            }
                            if ((IsAConstant(a.eval(), DiffWithRespTo)) || (a.eval().equalsIgnoreCase(DiffWithRespTo))) {
                                x = (() -> DiffWithRespTo);
                            } else {
                                x = a;
                            }
                            log.info("LookAheadVar:parseTerm:Multiply:Rule4:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar);
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadVar:parseTerm:*:Rule4:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " b.eval()=" + b.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " TermOutputAddedOnceFlag=" + TermOutputAddedOnceFlag + " posVar=" + posVar + " chVar=" + (char) chVar + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator);
                            }
                        } else if ((!b.eval().equalsIgnoreCase(DiffWithRespTo)) && (!b.eval().equalsIgnoreCase("") && (!b.eval().contains("(")))) {
                            log.info("LookAheadVar:parseTerm:Multiply:Rule5:a.eval()=" + a.eval() + " b.eval()=" + b.eval() + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar);
                            if ((!a.eval().equalsIgnoreCase("0.0")) && (!IsAConstant(b.eval(), DiffWithRespTo)) && (!StrIsAConstant.equalsIgnoreCase("VarExpression")) && (!StrIsAConstant.equalsIgnoreCase("Var"))) {
                                if ((a.eval() != null) && (!a.eval().equalsIgnoreCase("")) && (!IsAConstant(b.eval(), DiffWithRespTo)) && (!StrIsAConstant.equalsIgnoreCase("IndConstExpression")) && (!StrIsAConstant.equalsIgnoreCase("IndConstant"))) {
                                    x = (() -> (a.eval() + "*" + b.eval()));
                                } else // 5^xyc1
                                {
                                    x = (() -> b.eval());
                                }
                                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("LookAheadVar:Reached Here11:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " b.eval()=" + b.eval() + " StrIsAConstant=" + StrIsAConstant);
                                }
                                log.info("LookAheadVar:parseTerm:Multiply:Rule5:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar);
                                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("LookAheadVar:parseTerm:*:Rule5:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator);
                                }
                            } else if ((!a.eval().equalsIgnoreCase("")) && (!IsAConstant(a.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Unknown"))
                                    && (!IsAConstant(b.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("VarExpression"))) {
                                //ln(2.0)*2^x
                                x = (() -> (a.eval() + "*" + b.eval()));
                                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("LookAheadVar:Reached Here10:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval());
                                }
                                log.info("LookAheadVar:parseTerm:Multiply:Rule5:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar);
                                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("LookAheadVar:parseTerm:*:Rule5:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator);
                                }
                            } else {
                                x = b;
                            }
                            log.info("LookAheadVar:parseTerm:Multiply:Rule5:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar);
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadVar:parseTerm:*:Rule5:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator);
                            }
                        } else if ((!b.eval().equalsIgnoreCase(DiffWithRespTo)) && (!b.eval().equalsIgnoreCase("") && (b.eval().contains("(")))) {
//                            if ((IsAConstant(a.eval(), DiffWithRespTo)) || (a.eval().equalsIgnoreCase(DiffWithRespTo))) {
//                                if ((IsAConstant(b.eval(), DiffWithRespTo)) || (b.eval().equalsIgnoreCase(DiffWithRespTo))) {
//                                    x = b;
//                                } else {
//                                    x = (() -> (a.eval() + "*" + b.eval()));
//                                }
//                                //x = (() -> b.eval());
//                            } else {
//                                x = b;
//                            }
                            x = (() -> b.eval());
                            log.info("LookAheadVar:parseTerm:Multiply:Rule6:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar);
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadVar:parseTerm:*:Rule6:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator);
                            }
                        }
                        TermOperatorPos = 0;//Should never Enter again
                        if ((x.eval().contains("(")) && (FunctionStr.equalsIgnoreCase(""))) {
                            FunctionStr = x.eval();
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadVar:parseTerm:Reached Here7:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval());
                            }
                            log.info("LookAheadVar:parseTerm:Multiply:Rule7:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar);
                        } else if ((x.eval().contains("(")) && (!FunctionStr.equalsIgnoreCase("")) && (!FunctionStr.equalsIgnoreCase(x.eval()))) {
                            FunctionStr = x.eval() + "*" + FunctionStr;
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadVar:Reached Here8:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval());
                            }
                            log.info("LookAheadVar:parseTerm:Multiply:Rule8:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar);
                        }
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadVar:parseTerm:*:End:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator);
                        }
                        if (x.eval().contains("^" + DiffWithRespTo)) {
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadVar:parseTerm:*:^DiffWithRespTo:Return Value:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator);
                            }
                            FunctionStr = x.eval();
                            //return x;
                        }
                        log.info("LookAheadVar:parseTerm:Multiply:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar);
                    } else if ((eatVar('/')) || ((!StrVar.isBlank()) && (StrVar.charAt(TermOperatorPos) == '/'))) { // division
                        log.info("LookAheadVar:parseTerm:Divide:Entered:TermOperatorPos:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar + " StrVar.length=" + StrVar.length());
                        TermOutputSetFlag = false;
                        GotExpntNumFlag = false;
                        TermOutputOperator = '/';
                        TermOutputAddedOnceFlag = false;
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadVar:parseTerm:/:Start:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator);
                        }
                        LookAheadVar a = x, b = parseFactor();
                        if (TermOperatorPos == -1) {
                            if ((TermOutputSetFlag == false) || ((posVar < StrVar.length()) && ((StrVar.charAt(posVar + 1) == '*') || (StrVar.charAt(posVar + 1) == '/')))) {
                                if ((!b.eval().contains("("))
                                        && ((posVar < StrVar.length())
                                        && ((StrVar.charAt(posVar + 1) == '*')
                                        || (StrVar.charAt(posVar + 1) == '/')))) {
                                    TermOutput -= 1.0;
                                    TermOutputSetFlag = true;
                                    TermOutputAddedOnceFlag = true;
                                }
                            }
                            if ((IsAConstant(a.eval(), DiffWithRespTo)) || (a.eval().equalsIgnoreCase(DiffWithRespTo))) {
                                x = (() -> DiffWithRespTo);
                            } else {
                                x = a;
                            }
                            //x = (() -> b.eval());
                            log.info("LookAheadVar:parseTerm:Divide:Rule1:TermOperatorPos:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " chVar=" + (char) chVar);
                        }// Mapping x^-1.0 OR x^1.0
                        else if ((IsAConstant(b.eval(), DiffWithRespTo)) && ((b.eval().equalsIgnoreCase("-1.0")) || (b.eval().equalsIgnoreCase("1.0")))) {
                            x = (() -> a.eval());
                            LAVarComplexMapFlag = true;
                            log.info("LookAheadVar:parseTerm:Divide:Rule2:IsAConstant:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " chVar=" + (char) chVar);
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadVar:parseTerm:/:1.0:Rule2:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar + " ParenthesisFlag=" + ParenthesisFlag);
                            }
                        } // Mapping x^2.0 OR x^-2.0 Onwards
                        else if (IsAConstant(b.eval(), DiffWithRespTo)) {
                            x = (() -> a.eval());
                            log.info("LookAheadVar:parseTerm:Divide:Rule3:IsAConstant:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " chVar=" + (char) chVar);
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadVar:parseTerm:/:IsAConstant:Rule3:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " b.eval()=" + b.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator + " TermOutputOperator=" + (char) TermOutputOperator);
                            }
                        } else if (b.eval().equalsIgnoreCase(DiffWithRespTo)) {
                            if (TermOutput == 1.0) {
                                TermOutput = -1.0;
                                LAVarSimpleMapFlag = true;
                            } else if ((TermOutputSetFlag == false) || ((posVar < StrVar.length()) && ((StrVar.charAt(posVar + 1) == '*') || (StrVar.charAt(posVar + 1) == '/')))) {
                                TermOutput -= 1.0;
                                if (GotBracesVarFlag == true) {
                                    GotBracesVarFlag = false;
                                    nextCharVar();
                                }
                            }
                            x = (() -> DiffWithRespTo);
                            // Exponent Inversion
                            if ((LAVarTermOperator == -1) && (TermOutput < 0.0) && (TermOutputOperator == '/')) {
                                LAVarTermOperator = '*';
                            } else if ((LAVarTermOperator == -1) && (TermOutput > 0.0) && (TermOutputOperator == '*')) {
                                LAVarTermOperator = '/';
                            }
                            if ((LAVarTermOperator == -1) && (TermOutput < 0.0) && (TermOutputOperator == '*')) {
                                LAVarTermOperator = '*';
                            } else if ((LAVarTermOperator == -1) && (TermOutput > 0.0) && (TermOutputOperator == '/')) {
                                LAVarTermOperator = '/';
                            }
                            if (TermOutput == 0.0) {
                                x = (() -> "0.0");
                            }
                            log.info("LookAheadVar:parseTerm:Divide:Rule4:DiffWithRespTo:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " chVar=" + (char) chVar);
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadVar:parseTerm:/:TermOutputSetFlag:false:Rule4:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " b.eval()=" + b.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator + " TermOutputOperator=" + (char) TermOutputOperator);
                            }
                        } else if ((!b.eval().equalsIgnoreCase(DiffWithRespTo)) && (!b.eval().equalsIgnoreCase("") && (!b.eval().contains("(")))) {
                            if ((!a.eval().equalsIgnoreCase("0.0")) && ((!IsAConstant(b.eval(), DiffWithRespTo))) && (!StrIsAConstant.equalsIgnoreCase("VarExpression"))) {
                                x = (() -> (a.eval() + "/" + b.eval()));
                            } else if ((!a.eval().equalsIgnoreCase("")) && (!IsAConstant(a.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Unknown"))
                                    && (!IsAConstant(b.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("VarExpression"))) {
                                //ln(2.0)/2^x
                                x = (() -> (a.eval() + "/" + b.eval()));
                                log.info("LookAheadVar:parseTerm:Divide:Rule5:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar);
                            } else {
                                x = (() -> b.eval());
                            }
                            log.info("LookAheadVar:parseTerm:Divide:Rule5:!DiffWithRespTo:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " chVar=" + (char) chVar);
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadVar:parseTerm:/:DiffWithRespTo:Rule5:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " b.eval()=" + b.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar + " ParenthesisFlag=" + ParenthesisFlag + " TermOutputOperator=" + (char) TermOutputOperator);
                            }
                        } else if ((!b.eval().equalsIgnoreCase(DiffWithRespTo)) && (!b.eval().equalsIgnoreCase("") && (b.eval().contains("(")))) {
//                            if ((IsAConstant(a.eval(), DiffWithRespTo)) || (a.eval().equalsIgnoreCase(DiffWithRespTo))) {
//                                if ((IsAConstant(b.eval(), DiffWithRespTo)) || (b.eval().equalsIgnoreCase(DiffWithRespTo))) {
//                                    x = b;
//                                } else {
//                                    x = (() -> (a.eval() + "/" + b.eval()));
//                                }
//                                //x = (() -> b.eval());
//                            } else {
//                                x = b;
//                            }
                            x = (() -> b.eval());
                        }
                        TermOperatorPos = 0;//Should never Enter again
                        log.info("LookAheadVar:parseTerm:Divide:Rule6:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " chVar=" + (char) chVar);
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadVar:parseTerm:/:Rule6:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " b.eval()=" + b.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar + " ParenthesisFlag=" + ParenthesisFlag + " TermOutputOperator=" + (char) TermOutputOperator);
                        }
                        if ((x.eval().contains("(")) && (FunctionStr.equalsIgnoreCase(""))) {
                            FunctionStr = x.eval();
                            log.info("LookAheadVar:parseTerm:Divide:Rule7:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " chVar=" + (char) chVar);
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadVar:parseTerm:/:Rule7:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " b.eval()=" + b.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar + " ParenthesisFlag=" + ParenthesisFlag);
                            }
                        } else if ((x.eval().contains("(")) && (!FunctionStr.equalsIgnoreCase(""))) {
                            FunctionStr = FunctionStr + "/" + x.eval();
                            log.info("LookAheadVar:parseTerm:Divide:Rule8:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " chVar=" + (char) chVar);
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadVar:parseTerm:/:Rule8:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar + " ParenthesisFlag=" + ParenthesisFlag);
                            }
                        }
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadVar:parseTerm:/:End:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar + " ParenthesisFlag=" + ParenthesisFlag);
                        }
                        if ((chVar == '+') || (chVar == '-')) {
                            posVar--;
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadVar:parseTerm:/:Returning:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar);
                            }
                            // Unset MapOperator if Overall TerOutput for the Term is not -1
                            if ((LAMAPOperator == 0) && (TermOutput != -1.0)) {
                                LAMAPOperator = -1;
                            }
                            if (TermOutput == -1.0) {
                                LAVarTermOperator = '/';
                            } else if (LAVarTermOperator == -1) {
                                LAVarTermOperator = TermOutputOperator;
                            }
                            log.info("LookAheadVar:parseTerm:Return Value:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LAMAPOperator=" + LAMAPOperator + " chVar=" + (char) chVar);
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadVar:parseTerm:Return Value:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " LAVarTermOperator=" + (char) LAVarTermOperator + " TermOutputOperator=" + (char) TermOutputOperator);
                            }
                            return x;
                        }
                    } else {
                        // Unset MapOperator if Overall TerOutput for the Term is not -1
                        if ((LAMAPOperator == 0) && (TermOutput != -1.0)) {
                            LAMAPOperator = -1;
                        }
                        log.info("LookAheadVar:parseTerm:Return Value:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LAMAPOperator=" + LAMAPOperator + " chVar=" + (char) chVar);
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadVar:parseTerm:Return Value:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator + " TermOutputOperator=" + (char) TermOutputOperator);
                        }
                        return x;
                    }
                }
            }

            LookAheadVar parseFactor() {
                int StartPos = posVar;
                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                    System.out.println("LookAheadVar:parseFactor:Initial:0:FunctionStr=" + FunctionStr + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator + " TermOutputOperator=" + (char) TermOutputOperator);
                }
                LookAheadVar x = parseBase();
                log.info("LookAheadVar:parseFactor:x.eval()=" + x.eval() + " TermOutput=" + TermOutput);
                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                    System.out.println("LookAheadVar:parseFactor:Initial:After:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator + " TermOutputOperator=" + (char) TermOutputOperator);
                }
                for (;;) {
                    if (eatVar('^')) { // exponentiation
                        GotExpntNumFlag = true;
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadVar:parseFactor:^:Entered:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag);
                        }
                        LookAheadVar a = x, b = parseBase();
                        StartPos = posVar;
                        log.info("LookAheadVar:parseFactor:Exponent:a.eval()=" + a.eval() + " TermOutput=" + TermOutput);
                        log.info("LookAheadVar:parseFactor:Exponent:b.eval()=" + b.eval() + " TermOutput=" + TermOutput);
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadVar:parseFactor:^:Initial:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " b.eval()=" + b.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag);
                        }
                        if (b.eval().equalsIgnoreCase("0.0")) {
                            //x^0 or x^0.0
                            x = (() -> "1.0");
                            GotExpntNumFlag = false;
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadVar:parseFactor:Return Value:0.0:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator + " TermOutputOperator=" + (char) TermOutputOperator);
                            }
                            return x;
                        } else if (!b.eval().equalsIgnoreCase("")) {
                            if ((IsAConstant(a.eval(), DiffWithRespTo)) && (IsAConstant(b.eval(), DiffWithRespTo))) {
                                // 2^3
                                x = (() -> "1.0");
                                log.info("LookAheadVar:parseFactor:2^3:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
                            } else if ((IsAConstant(a.eval(), DiffWithRespTo)) && (!IsAConstant(b.eval(), DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                                // 2^a
                                x = (() -> "1.0");
                                TermOutputSetFlag = true;
                                TempIndConstStrSet = true;
                                log.info("LookAheadVar:parseFactor:2^a:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
                            } else if ((IsAConstant(a.eval(), DiffWithRespTo)) && (!IsAConstant(b.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Var"))) {
                                // 2^x
                                x = (() -> a.eval() + "^" + b.eval());
                                TermOutputSetFlag = true;
                                TempIndConstStrSet = false;
                                log.info("LookAheadVar:parseFactor:2^x:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
                            } else if ((!IsAConstant(a.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant")) && (!IsAConstant(b.eval(), DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                                // a^b
                                x = (() -> "1.0");
                                TermOutputSetFlag = true;
                                TempIndConstStrSet = true;
                                log.info("LookAheadVar:parseFactor:a^b:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
                            } else if ((!IsAConstant(a.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Var"))
                                    && (!IsAConstant(b.eval(), DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant"))
                                    || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                                // x^b
                                x = (() -> a.eval() + "^" + b.eval());
                                TermOutputSetFlag = true;
                                TempIndConstStrSet = true;
                                log.info("LookAheadVar:parseFactor:x^b:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
                                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("LookAheadVar:parseFactor:^:else:x^b:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator);
                                }
                            } else if ((!IsAConstant(a.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant")) && (!IsAConstant(b.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Var"))) {
                                // a^x
                                x = (() -> a.eval() + "^" + b.eval());
                                TermOutputSetFlag = true;
                                TempIndConstStrSet = true;
                                log.info("LookAheadVar:parseFactor:a^x:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
                                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("LookAheadVar:parseFactor:^:a^x:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator);
                                }
                            } else if ((!IsAConstant(a.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant")) && (IsAConstant(b.eval(), DiffWithRespTo))) {
                                // a^2
                                //x = (() -> a.eval() + "^" + b.eval());
                                x = (() -> "");
                                TermOutputSetFlag = true;
                                TempIndConstStrSet = true;
                                log.info("LookAheadVar:parseFactor:a^2:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
                                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("LookAheadVar:parseFactor:^:a^2:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator);
                                }
                            } else if ((!IsAConstant(a.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Var"))
                                    && (IsAConstant(b.eval(), DiffWithRespTo)) && (!b.eval().equalsIgnoreCase("0.0"))) {
                                //x^2  
                                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("LookAheadVar:parseFactor:^:x^2:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator);
                                }
                                if (((b.eval().equalsIgnoreCase(DiffWithRespTo)) || (b.eval().equalsIgnoreCase("1.0")))) {
                                    if (TermOutputOperator == '/') {
                                        TermOutput -= 1.0;
                                    } else if (TermOutputOperator == '*') {
                                        TermOutput += 1.0;
                                    }
                                    TermOutputSetFlag = true;
                                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("LookAheadVar:parseFactor:^:x^2:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator);
                                    }
                                } else if ((IsAConstant(b.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")) && ((Double.parseDouble(b.eval()) == -1) || (Double.parseDouble(b.eval()) == 1))) {
                                    if ((TermOutputOperator == '*') && (IsAConstant(b.eval(), DiffWithRespTo)) && (Double.parseDouble(b.eval()) == -1)) {
                                        TermOutput += Double.parseDouble(b.eval());
                                        log.info("LookAheadVar:parseFactor:x^2:TermOutput 0.0:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " TermOutputOperator=" + TermOutputOperator + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
                                    } else if ((TermOutputOperator == '*') && (IsAConstant(b.eval(), DiffWithRespTo)) && (Double.parseDouble(b.eval()) == 1)) {
                                        TermOutput += Double.parseDouble(b.eval());
                                        log.info("LookAheadVar:parseFactor:x^2:TermOutput 0.0:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " TermOutputOperator=" + TermOutputOperator + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
                                    } else if ((TermOutputOperator == '/') && (IsAConstant(b.eval(), DiffWithRespTo)) && (Double.parseDouble(b.eval()) == -1)) {
                                        TermOutput -= Double.parseDouble(b.eval());
                                        log.info("LookAheadVar:parseFactor:x^2:TermOutput 0.0:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " TermOutputOperator=" + TermOutputOperator + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
                                    } else if ((TermOutputOperator == '/') && (IsAConstant(b.eval(), DiffWithRespTo)) && (Double.parseDouble(b.eval()) == 1)) {
                                        TermOutput -= Double.parseDouble(b.eval());
                                        log.info("LookAheadVar:parseFactor:x^2:TermOutput 0.0:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " TermOutputOperator=" + TermOutputOperator + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
                                    } else if (IsAConstant(b.eval(), DiffWithRespTo)) {
                                        TermOutput += Double.parseDouble(b.eval());
                                        log.info("LookAheadVar:parseFactor:x^2:TermOutput 0.0:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " TermOutputOperator=" + TermOutputOperator + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
                                    }
                                    TermOutputSetFlag = true;
                                } else if ((IsAConstant(b.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")) && (Double.parseDouble(b.eval()) < -1) && (TermOutputOperator == '/')) {
                                    TermOutput -= Double.parseDouble(b.eval());
                                    TermOutputSetFlag = true;
                                    log.info("LookAheadVar:parseFactor:x^2:TermOutput 0.0:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " TermOutputOperator=" + TermOutputOperator + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
                                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("LookAheadVar:parseFactor:^:x^2:< -1:/:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag);
                                    }
                                } else if ((IsAConstant(b.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")) && (Double.parseDouble(b.eval()) < -1)) {
                                    if (TermOutputOperator == '/') {
                                        TermOutput -= Double.parseDouble(b.eval());
                                    } else if (TermOutputOperator == '*') {
                                        TermOutput += Double.parseDouble(b.eval());
                                    }
                                    TermOutputSetFlag = true;
                                    log.info("LookAheadVar:parseFactor:x^2:TermOutput 0.0:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " TermOutputOperator=" + TermOutputOperator + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
                                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("LookAheadVar:parseFactor:^:x^2:< -1:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator);
                                    }
                                } else if ((IsAConstant(b.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")) && (Double.parseDouble(b.eval()) > 1) && (TermOutputOperator == '/')) {
                                    TermOutput -= Double.parseDouble(b.eval());
                                    TermOutputSetFlag = true;
                                    log.info("LookAheadVar:parseFactor:x^2:TermOutput 0.0:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " TermOutputOperator=" + TermOutputOperator + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
                                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("LookAheadVar:parseFactor:^:x^2:> 1:/:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator);
                                    }
                                } else if ((IsAConstant(b.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")) && (Double.parseDouble(b.eval()) > 1)) {
                                    TermOutput += Double.parseDouble(b.eval());
                                    TermOutputSetFlag = true;
                                    log.info("LookAheadVar:parseFactor:x^2:TermOutput 0.0:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " TermOutputOperator=" + TermOutputOperator + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
                                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("LookAheadVar:parseFactor:^:x^2:> 1:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator);
                                    }
                                } else if ((IsAConstant(b.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")) && (Double.parseDouble(b.eval()) > -1) && (Double.parseDouble(b.eval()) < 0)) {
                                    TermOutput += Double.parseDouble(b.eval());
                                    TermOutputSetFlag = true;
                                    log.info("LookAheadVar:parseFactor:x^2:TermOutput 0.0:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " TermOutputOperator=" + TermOutputOperator + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
                                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("LookAheadVar:parseFactor:^:x^2:<0:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator);
                                    }
                                } else if ((IsAConstant(b.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")) && (Double.parseDouble(b.eval()) > 0) && (Double.parseDouble(b.eval()) < 1)) {
                                    TermOutput += Double.parseDouble(b.eval());
                                    TermOutputSetFlag = true;
                                    log.info("LookAheadVar:parseFactor:x^2:TermOutput 0.0:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " TermOutputOperator=" + TermOutputOperator + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
                                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("LookAheadVar:parseFactor:^:x^2:<1:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag);
                                    }
                                } else if ((IsAConstant(b.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")) && (Double.parseDouble(b.eval()) > -1) && (Double.parseDouble(b.eval()) < 0) && (TermOutputOperator == '/')) {
                                    TermOutput += Double.parseDouble(b.eval());
                                    TermOutputSetFlag = true;
                                    log.info("LookAheadVar:parseFactor:x^2:TermOutput 0.0:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " TermOutputOperator=" + TermOutputOperator + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
                                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("LookAheadVar:parseFactor:^:x^2:> -1:/:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag);
                                    }
                                } else if ((IsAConstant(b.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")) && (Double.parseDouble(b.eval()) > 0) && (Double.parseDouble(b.eval()) < 1) && (TermOutputOperator == '/')) {
                                    TermOutput += Double.parseDouble(b.eval());
                                    TermOutputSetFlag = true;
                                    log.info("LookAheadVar:parseFactor:x^2:TermOutput 0.0:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " TermOutputOperator=" + TermOutputOperator + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
                                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("LookAheadVar:parseFactor:^:x^2:> 0:/:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag);
                                    }
                                } else {
                                    x = b;
                                    log.info("LookAheadVar:parseFactor:x^2:TermOutput 0.0:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " TermOutputOperator=" + TermOutputOperator + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
                                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                        System.out.println("LookAheadVar:parseFactor:^:x^2:x=b:else:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag);
                                    }
                                }
                                // Needs to be mapped set
                                if (TermOutput == -1.0) {
                                    LAMAPOperator = 0;
                                }
                                log.info("LookAheadVar:parseFactor:x^2:TermOutput 0.0:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
                            } else if ((!IsAConstant(a.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Var")) && (IsAConstant(b.eval(), DiffWithRespTo)) && (!b.eval().equalsIgnoreCase("0.0"))) {
                                //x^2  
                                if ((Double.parseDouble(b.eval()) == -1) || (Double.parseDouble(b.eval()) == 1)) {
                                    if ((TermOutputOperator == '*') && (Double.parseDouble(b.eval()) == -1)) {
                                        TermOutput += Double.parseDouble(b.eval());
                                        log.info("LookAheadVar:parseFactor:x^2:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " TermOutputOperator=" + TermOutputOperator + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
                                    } else if ((TermOutputOperator == '*') && (Double.parseDouble(b.eval()) == 1)) {
                                        TermOutput += Double.parseDouble(b.eval());
                                        log.info("LookAheadVar:parseFactor:x^2:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " TermOutputOperator=" + TermOutputOperator + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
                                    } else if ((TermOutputOperator == '/') && (Double.parseDouble(b.eval()) == -1)) {
                                        TermOutput -= Double.parseDouble(b.eval());
                                        log.info("LookAheadVar:parseFactor:x^2:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " TermOutputOperator=" + TermOutputOperator + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
                                    } else if ((TermOutputOperator == '/') && (Double.parseDouble(b.eval()) == 1)) {
                                        TermOutput -= Double.parseDouble(b.eval());
                                        log.info("LookAheadVar:parseFactor:x^2:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " TermOutputOperator=" + TermOutputOperator + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
                                    } else {
                                        TermOutput += Double.parseDouble(b.eval());
                                        log.info("LookAheadVar:parseFactor:x^2:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " TermOutputOperator=" + TermOutputOperator + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
                                    }
                                    TermOutputSetFlag = true;
                                } else if ((Double.parseDouble(b.eval()) < -1) && (TermOutputOperator == '/')) {
                                    TermOutput -= Double.parseDouble(b.eval());
                                    TermOutputSetFlag = true;
                                    log.info("LookAheadVar:parseFactor:x^2:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " TermOutputOperator=" + TermOutputOperator + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
                                } else if ((Double.parseDouble(b.eval()) < -1)) {
                                    TermOutput += Double.parseDouble(b.eval());
                                    TermOutputSetFlag = true;
                                    log.info("LookAheadVar:parseFactor:x^2:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " TermOutputOperator=" + TermOutputOperator + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
                                } else if ((Double.parseDouble(b.eval()) > 1) && (TermOutputOperator == '/')) {
                                    TermOutput -= Double.parseDouble(b.eval());
                                    TermOutputSetFlag = true;
                                    log.info("LookAheadVar:parseFactor:x^2:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " TermOutputOperator=" + TermOutputOperator + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
                                } else if ((Double.parseDouble(b.eval()) > 1)) {
                                    TermOutput += Double.parseDouble(b.eval());
                                    TermOutputSetFlag = true;
                                    log.info("LookAheadVar:parseFactor:x^2:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " TermOutputOperator=" + TermOutputOperator + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
                                } else {
                                    x = b;
                                    log.info("LookAheadVar:parseFactor:x^2:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " TermOutputOperator=" + TermOutputOperator + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
                                }
                                // Needs to be mapped set
                                if (TermOutput == -1.0) {
                                    LAMAPOperator = 0;
                                }
                                log.info("LookAheadVar:parseFactor:x^2:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
                                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("LookAheadVar:parseFactor:^:else::x^2:b:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag);
                                }
                            } else if ((!IsAConstant(a.eval(), DiffWithRespTo))
                                    && ((StrIsAConstant.equalsIgnoreCase("Var"))
                                    || (StrIsAConstant.equalsIgnoreCase("VarExpression")))
                                    && (!IsAConstant(b.eval(), DiffWithRespTo))
                                    && ((StrIsAConstant.equalsIgnoreCase("Unknown"))
                                    || (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
                                if (a.eval().contains(b.eval()))
                                        ; else {
                                    x = (() -> b.eval());
                                }
                                TermOutputSetFlag = false;
                                log.info("LookAheadVar:parseFactor:x=b:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
                                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("LookAheadVar:parseFactor:^:else:else:b:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag);
                                }
                            } else if (!b.eval().equalsIgnoreCase("0.0")) {
                                x = (() -> "1.0");
                                TermOutputSetFlag = true;
                                log.info("LookAheadVar:parseFactor:x=1:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
                                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("LookAheadVar:parseFactor:^:else:else:1.0:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " b.eval()=" + b.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag);
                                }
                            }
                            TermOutputAddedOnceFlag = true;
                        } else {
                            x = a;
                            log.info("LookAheadVar:parseFactor:x=a:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadVar:parseFactor:^:else:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag);
                            }
                        }
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadVar:parseFactor:^:End:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag);
                        }
                        log.info("LookAheadVar:parseFactor:Exponent:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LAMAPOperator=" + LAMAPOperator);
                    } else {
                        log.info("LookAheadVar:parseFactor:x=x:x.eval()=" + x.eval() + " chVar=" + (char) chVar + " chVar=" + chVar + " TermOutput=" + TermOutput + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
//                        if ( (GotExpntNumFlag == false)
//                                && (x.eval().equalsIgnoreCase(DiffWithRespTo))
//                                && (TermOutput == 0.0)
//                                && (posVar < StrVar.length())
//                                && ((StrVar.charAt(posVar) == '*')
//                                || (StrVar.charAt(posVar) == '/')) 
//                                || (chVar == -1) || (chVar == '-') || (chVar == '+') ) {
//                            TermOutput = 1.0;
//                            TermOutputSetFlag = true;
//                            x = (() -> "1.0");
//                            log.info("LookAheadVar:parseFactor:x=x:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
//                        }
                        // Needs to be mapped set
                        if ((TermOutput == -1.0) || ((TermOutput == 0.0) && (StartPos >= 1) && (StrVar.charAt(StartPos - 1) == '/'))) {
                            LAMAPOperator = 0;
                        }
                        log.info("LookAheadVar:parseFactor:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LAMAPOperator=" + LAMAPOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
                        GotExpntNumFlag = false;
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadVar:parseFactor:End:Return Value:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator + " TermOutputOperator=" + (char) TermOutputOperator);
                        }
                        return x;
                    }
                }
            }

            LookAheadVar parseBase() {
                int startPos = posVar;
                if ((posVar >= 0) && (posVar < StrVar.length())) {
                    log.info("LookAheadVar:parseBase:Entered:GotExpntNumFlag=" + GotExpntNumFlag + " posVar=" + posVar + " chVar=" + (char) chVar + " StrVar=" + StrVar.substring(startPos) + " LAVarTermOperator=" + (char) LAVarTermOperator);
                }
                if (startPos >= 0) ; else {
                    startPos = 0;
                }
                LookAheadVar x = (() -> "");
                if (eatVar('-')) { // unary minus
                    LookAheadVar b = parseBase();
                    if (GotExpntNumFlag == true) {
                        if (IsAConstant(b.eval(), DiffWithRespTo)) {
                            x = (() -> "-" + (Double.parseDouble(b.eval())));
                            log.info("LookAheadVar:parseBase:Entered:GotExpntNumFlag=" + GotExpntNumFlag + " posVar=" + posVar + " chVar=" + (char) chVar + " x.eval()=" + x.eval());
                        } else {
                            x = (() -> "-" + b.eval());
                            log.info("LookAheadVar:parseBase:Entered:GotExpntNumFlag=" + GotExpntNumFlag + " posVar=" + posVar + " chVar=" + (char) chVar + " x.eval()=" + x.eval());
                        }
                        log.info("LookAheadVar:parseBase:Number:x.eval()=" + x.eval() + " posVar=" + posVar + " chVar=" + (char) chVar);
                    } else {
                        if (IsAConstant(b.eval(), DiffWithRespTo)) {
                            x = (() -> "" + (Double.parseDouble(b.eval())));
                        } else {
                            x = (() -> b.eval());
                        }
                        log.info("LookAheadVar:parseBase:Number:x.eval()=" + x.eval() + " posVar=" + posVar + " chVar=" + (char) chVar);
                    }
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseFactor:-:Return Value:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput);
                    }
                    return x;
                } else if (eatVar('+')) { // unary plus
                    startPos = posVar;
                }
                if ((IsNumber(chVar))) { //numbers
                    log.info("LookAheadVar:parseBase:Exponent:Number:posVar=" + posVar + " chVar=" + (char) chVar + " StrVar=" + StrVar.substring(startPos));
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseBase:Numbers:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " TrailConstantFlag=" + TrailConstantFlag + " TrailConstantOperator=" + (char) TrailConstantOperator + " ComplexAssignFlag=" + ComplexAssignFlag);
                    }
                    while ((IsNumber(chVar)) && (chVar != -1)) {
                        nextCharVar();
                        if ((chVar == 'E') || (chVar == 'e')) {
                            nextCharVar();
                            if ((chVar == '-') || (chVar == '+')) {
                                nextCharVar();
                            }
                        }

                    }
                    double xx = 0.0;
                    if ((GotExpntNumFlag == true) && (posVar != -1) && (StrVar != null) && (!StrVar.equalsIgnoreCase("")) && (!StrVar.equalsIgnoreCase("NaN"))) {
                        log.info("LookAheadVar:parseBase:Expnt Num:Number:xx=" + xx + " posVar=" + posVar + " chVar=" + (char) chVar + " TrailConstantFlag=" + TrailConstantFlag + " ComplexAssignFlag=" + ComplexAssignFlag + " GotVariableFlag=" + GotVariableFlag);
                        if ((IsAConstant(StrVar.substring(startPos, posVar), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                            xx = Double.parseDouble(StrVar.substring(startPos, posVar));
                        }
                    } else if ((GotExpntNumFlag == true) && (StrVar != null) && (!StrVar.equalsIgnoreCase("")) && (!StrVar.equalsIgnoreCase("NaN"))) {
                        log.info("LookAheadVar:parseBase:Expnt Num:Number:xx=" + xx + " posVar=" + posVar + " chVar=" + (char) chVar + " TrailConstantFlag=" + TrailConstantFlag + " ComplexAssignFlag=" + ComplexAssignFlag + " GotVariableFlag=" + GotVariableFlag);
                        if ((IsAConstant(StrVar.substring(startPos), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                            xx = Double.parseDouble(StrVar.substring(startPos));
                        }
                    } else if ((GotExpntNumFlag == false) && (TrailConstantFlag == false) && (posVar != -1) && (StrVar != null) && (!StrVar.equalsIgnoreCase("")) && (!StrVar.equalsIgnoreCase("NaN"))) {
                        if ((IsAConstant(StrVar.substring(startPos, posVar), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                            xx = Double.parseDouble(StrVar.substring(startPos, posVar));
                        }
                        log.info("LookAheadVar:parseBase:Exponent:Number:xx=" + xx + " posVar=" + posVar + " chVar=" + (char) chVar + " TrailConstantFlag=" + TrailConstantFlag + " ComplexAssignFlag=" + ComplexAssignFlag + " GotVariableFlag=" + GotVariableFlag);
                        TrailConstantFlag = true;
                        GotVariablePos = startPos;
                        GotVariableFlag = true;
                        if ((startPos >= 1) && ((StrVar.charAt(startPos - 1) == '*') || (StrVar.charAt(startPos - 1) == '/'))) {
                            TrailConstantOperator = StrVar.charAt(startPos - 1);
                        }
                        if (ComplexAssignFlag == false) {
                            ComplexAssignFlag = true;
                        }
                    } else {
                        xx = Double.parseDouble(StrVar.substring(startPos, posVar));
                        TrailConstantFlag = true;
                        ComplexAssignFlag = false;
                    }
                    log.info("LookAheadVar:parseBase:Number:xx=" + xx + " posVar=" + posVar + " chVar=" + (char) chVar + " GotExpntNumFlag=" + GotExpntNumFlag + " TrailConstantFlag=" + TrailConstantFlag + " ComplexAssignFlag=" + ComplexAssignFlag + " GotVariableFlag=" + GotVariableFlag + " TrailConstantOperator=" + (char) TrailConstantOperator);
                    final Double XX = xx;
                    if ((XX >= 0.0)) {
                        x = () -> "" + XX;
                    } else {
                        x = () -> "";
                    }
                    log.info("LookAheadVar:parseBase:Number:xx=" + xx + " posVar=" + posVar + " chVar=" + (char) chVar + " TrailConstantFlag=" + TrailConstantFlag + " ComplexAssignFlag=" + ComplexAssignFlag + " GotVariableFlag=" + GotVariableFlag + " TrailConstantOperator=" + (char) TrailConstantOperator);
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseBase:Numbers:Return Value:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " TrailConstantFlag=" + TrailConstantFlag + " TrailConstantOperator=" + (char) TrailConstantOperator + " ComplexAssignFlag=" + ComplexAssignFlag + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    }
                    return x;
                } else if (IsVariable(chVar)) {//functions & variables
                    while (((IsVariable(chVar)) || (IsNumber(chVar))) && (chVar != -1)) {
                        nextCharVar();
                    }
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseBase:Variables:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    }
                    String name = "";
                    if (posVar != -1) {
                        name = StrVar.substring(startPos, posVar).trim();
//                        if ((name.equalsIgnoreCase(DiffWithRespTo)) && (startPos >= 1) && ((StrVar.charAt(startPos - 1) == '*') || (StrVar.charAt(startPos - 1) == '/'))) {
//                            LAVarTermOperator = StrVar.charAt(startPos - 1);
//                        } else if ((name.equalsIgnoreCase(DiffWithRespTo)) && (startPos >= 2) && ((StrVar.charAt(startPos - 1) == '+') || (StrVar.charAt(startPos - 1) == '-'))) {
//                            LAVarTermOperator = StrVar.charAt(startPos - 2);
//                        }
                    } else {
                        name = StrVar.substring(startPos).trim();
                    }
                    if ((LAVarTermOperator == -1) && (startPos >= 2) && (name.contains(DiffWithRespTo))) {
                        LAVarTermOperator = StrVar.charAt(startPos - 1);
                    }
                    log.info("LookAheadVar:parseBase:Variable:name=" + name + " posVar=" + posVar + " chVar=" + (char) chVar);
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseBase:Variable:name=" + name + " posVar=" + posVar + " chVar=" + (char) chVar + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    }
                    if ((functionsSimple.containsKey(name)) && (!name.equalsIgnoreCase(DiffWithRespTo))) {
                        LookAheadVar arg = (() -> "");
                        log.info("LookAheadVar:parseBase:Function:name=" + name + " posVar=" + posVar + " chVar=" + (char) chVar);
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadVar:parseBase:Function:name=" + name + " posVar=" + posVar + " chVar=" + (char) chVar + " LAVarTermOperator=" + (char) LAVarTermOperator);
                        }
                        //eatVar('(');
                        ParenthesisFlag = true;
                        int tempAlignCharRead = posVar;
                        //tempAlignCharRead = AlignWithOpenBraces(posVar, chVar, StrVar, HideAllFlag);
                        int oldposition = posVar;
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadVar:parseBase:Before ProcessOpenBraces:chVar=" + (char) chVar + " posVar=" + posVar + " StrVar=" + StrVar.substring(posVar));
                        }
                        int numberofcharsread = 0;
                        if ((chVar == '(')&&(posVar < StrVar.length())&& (StrVar.substring(posVar).length() > 0) )
                        numberofcharsread = extractAndClassifyFactors(StrVar.substring(posVar), DiffWithRespTo, HideAllFlag);
                        posVar = advanceOneTerm(StrVar, posVar);
                        //posVar = numberofcharsread;
                        if ((posVar >= 0) && (posVar < StrVar.length())) {
                            chVar = StrVar.charAt(posVar);
                        }
                        //eatVar(')');
                        MyParenDecoded = "";
                        MyParenEncoded = "";
                        if (!xTerms.isEmpty()) {
                            for (String str : xTerms) {
                                MyParenDecoded = MyParenDecoded + str;
                            }
                            if ((LAVarTermOperator == -1) && (MyParenDecoded.startsWith("/"))) {
                                LAVarTermOperator = '/';
                            } else if ((LAVarTermOperator == -1) && (MyParenDecoded.startsWith("*"))) {
                                LAVarTermOperator = '*';
                            } else {
                                LAVarTermOperator = '*';
                            }

                            if (MyParenDecoded.startsWith("-")) {
                                MyParenDecoded = MyParenDecoded.replaceFirst("\\-", "");
                            } else if (MyParenDecoded.startsWith("+")) {
                                MyParenDecoded = MyParenDecoded.replaceFirst("\\+", "");
                            }
                            MyParenEncoded = MyParenDecoded;
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadVar:Var:String:FunctionArg:" + StrVar.substring(oldposition) + " MapType=" + MapType + " MyParenEncoded=" + MyParenEncoded + " MyParenDecoded=" + MyParenDecoded + " StrIsAConstant=" + StrIsAConstant);
                                System.out.println("LookAheadVar:Var:FunctionArg:numberofcharsread=" + numberofcharsread + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " tempAlignCharRead=" + tempAlignCharRead);
                            }
                        }
                        if (!otherTerms.isEmpty()) {
                            for (String str : otherTerms) {
                                MyParenDecoded = MyParenDecoded + str;
                            }
                            if ((LAIndConstOperator == -1) && (MyParenDecoded.startsWith("/"))) {
                                LAIndConstOperator = '/';
                            } else if ((LAIndConstOperator == -1) && (MyParenDecoded.startsWith("*"))) {
                                LAIndConstOperator = '*';
                            } else {
                                LAIndConstOperator = '*';
                            }

                            if (MyParenDecoded.startsWith("-")) {
                                MyParenDecoded = MyParenDecoded.replaceFirst("\\-", "");
                            } else if (MyParenDecoded.startsWith("+")) {
                                MyParenDecoded = MyParenDecoded.replaceFirst("\\+", "");
                            }
                        }
                        MyParenEncoded = MyParenDecoded;
                        if (!ConstantTerms.isEmpty()) {
                            for (String str : ConstantTerms) {
                                MyParenDecoded = MyParenDecoded + str;
                            }
                            if ((LATermOperator == -1) && (MyParenDecoded.startsWith("/"))) {
                                LATermOperator = '/';
                            } else if ((LATermOperator == -1) && (MyParenDecoded.startsWith("*"))) {
                                LATermOperator = '*';
                            }

                            if (MyParenDecoded.startsWith("-")) {
                                MyParenDecoded = MyParenDecoded.replaceFirst("\\-", "");
                            } else if (MyParenDecoded.startsWith("+")) {
                                MyParenDecoded = MyParenDecoded.replaceFirst("\\+", "");
                            }
                        }
                        MyParenEncoded = MyParenDecoded;

                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadVar:Constant:String:FunctionArg:" + StrVar.substring(oldposition) + " MapType=" + MapType + " MyParenEncoded=" + MyParenEncoded + " MyParenDecoded=" + MyParenDecoded + " StrIsAConstant=" + StrIsAConstant);
                            System.out.println("LookAheadVar:Constant:FunctionArg:numberofcharsread=" + numberofcharsread + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " tempAlignCharRead=" + tempAlignCharRead);
                        }
                        xTerms.clear();
                        otherTerms.clear();
                        ConstantTerms.clear();
                        String Exprn = MyParenEncoded;
                        String MyArgFinal = "";
                        if ((Exprn.contains("("))) {
                            String[] TempData = Exprn.split("\\(");
                            MyArgFinal = "(" + TempData[1];
                            MyParenEncoded = TempData[0];
                            Exprn = MyParenEncoded;
                            System.out.println("LookAheadVar:parseBase:Function:Exprn=" + Exprn + " MyParenEncoded=" + MyParenEncoded + " MyArgFinal=" + MyArgFinal);
                        }
                        final String FinalMyArgFinal = MyArgFinal;
                        arg = (() -> FinalMyArgFinal);
                        //name = MyParenEncoded;
                        ParenthesisFlag = false;
                        final String MyFnStr = name;
                        final String MyStr = arg.eval();
                        log.info("LookAheadVar:parseBase:Function:arg.eval()=" + arg.eval() + " posVar=" + posVar + " chVar=" + (char) chVar);
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadVar:parseBase:Function:arg.eval()=" + arg.eval() + " posVar=" + posVar + " chVar=" + (char) chVar);
                        }

                        if ((IsAConstant(Exprn, DiffWithRespTo))
                                && ((StrIsAConstant.equalsIgnoreCase("Number"))
                                || (StrIsAConstant.equalsIgnoreCase("NumberExpression")))) {
                            //x = (() -> MyFnStr + "(" + MyStr + ")");
                            depthBackUpRestore++;
                            StrKeyBackUpRestore = FileMathsBackUpRestore + "LookAheadVar:parseBase:Expression";
                            System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET: LookAheadVar:Recursivecall:Start:Maths:Expression" + " depthBackUpRestore=" + depthBackUpRestore + ConsoleColors.RESET);
                            Map<String, String> variablesBackupState = new HashMap<>();
                            BackupMathsStateAll(variablesBackupState);
                            ChaosPrevention();
                            MathsExpressionParser.Expression MyMappedSimple = MathsExpressionParser.parse(Exprn, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                            System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET: LookAheadVar:Recursivecall:Start:Maths:Expression" + " depthBackUpRestore=" + depthBackUpRestore + ConsoleColors.RESET);
                            RestoreMathsStateAll(variablesBackupState);
                            depthBackUpRestore--;
                            StrKeyBackUpRestore = FileMathsBackUpRestore;
                            x = (() -> MyFnStr + "(" + MyMappedSimple.eval() + ")");
                            log.info("LookAheadVar:parseBase:Function:Constant:arg.eval()=" + MyStr + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar);
                            //GotBracesVarFlag = true;
                            ContainsFuncFlag = true;
                        } else if ((!IsAConstant(Exprn, DiffWithRespTo))
                                && ((StrIsAConstant.equalsIgnoreCase("Var"))
                                || (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
                            x = (() -> MyFnStr + "(" + MyStr + ")");
                            log.info("LookAheadVar:parseBase:Function:Var:arg.eval()=" + MyStr + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar);
                            //GotBracesVarFlag = true;
                            ContainsFuncFlag = true;
                        }
                        final String FinExprn = Exprn;
                        if ((!FinalMyArgFinal.equalsIgnoreCase("")) && (FinalMyArgFinal.contains("("))) {
                            x = (() -> MyFnStr + FinalMyArgFinal + FinExprn);
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadVar:parseBase:Variable:FSM1:name=" + name + " FinalMyArgFinal=" + FinalMyArgFinal + " FinExprn=" + FinExprn + " FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator);
                            }
                        } else if (!FinExprn.contains("(")) {
                            x = (() -> MyFnStr + "(" + FinExprn + ")");
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadVar:parseBase:Variable:FSM2:name=" + name + " FinalMyArgFinal=" + FinalMyArgFinal + " FinExprn=" + FinExprn + " FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator);
                            }
                        } else if (FinExprn.contains("(")) {
                            x = (() -> MyFnStr + FinExprn);
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadVar:parseBase:Variable:FSM3:name=" + name + " FinalMyArgFinal=" + FinalMyArgFinal + " FinExprn=" + FinExprn + " FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator);
                            }
                        }
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadVar:parseBase:Variable:else:IndConstant:name=" + name + " FinalMyArgFinal=" + FinalMyArgFinal + " FinExprn=" + FinExprn + " FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator);
                        }
                    } else if ((name != null) && (!name.equalsIgnoreCase("")) && (!name.equalsIgnoreCase("NaN")) && (!name.equalsIgnoreCase("Infinity")) && (name.equalsIgnoreCase(DiffWithRespTo))) {
                        final String MyStr = name;
                        x = () -> MyStr;
                        ContainsXFlag = true;
                        log.info("LookAheadVar:parseBase:Variable:DiffWithRespTo:name=" + name + " x.eval()=" + x.eval());
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadVar:parseBase:Variable:DiffWithRespTo:name=" + name + " FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator);
                        }
                    } else if ((name.equalsIgnoreCase("NaN")) || (name.equalsIgnoreCase("Infinity")) && (GotIndConstFlag == false) && (GotIndConstPos == -1)) {
                        //ProLambdaExtr y=parseExpr("LookAheadVar",  name, "1.0",  "ProductRule",  DiffWithRespTo,  '*', "LowLevelRules");
                        //final String MyStr = y.StrExpr();
                        x = () -> "0.0";
                        ContainsIndConstFlag = true;
                        GotIndConstFlag = true;
                        GotIndConstPos = startPos - 2;
                        log.info("LookAheadVar:parseBase:Variable:Extremity:name=" + name + " x.eval()=" + x.eval());
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadVar:parseBase:Variable:Extremity:name=" + name + " FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator);
                        }
                    } else if ((!name.equalsIgnoreCase(DiffWithRespTo)) && (!IsAConstant(name, DiffWithRespTo)) && (GotIndConstFlag == false) && (GotIndConstPos == -1)) {
                        ContainsIndConstFlag = true;
                        GotIndConstFlag = true;
                        GotIndConstPos = startPos - 2;
                        if (GotExpntNumFlag == true) {
                            final String finname = name;
                            x = () -> finname;
                        }
                        log.info("LookAheadVar:parseBase:Variable:Independent Constant:name=" + name + " x.eval()=" + x.eval() + " ContainsIndConstFlag=" + ContainsIndConstFlag + " GotIndConstPos=" + GotIndConstPos);
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadVar:parseBase:Variable:Independent Constant:name=" + name + " FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " GotIndConstFlag=" + GotIndConstFlag + " GotIndConstPos=" + GotIndConstPos + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator);
                        }
                    }
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseBase:Variables:Return Value:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    }

                    return x;
                } else if ((chVar == '(')&&(posVar < StrVar.length()) && (!StrVar.substring(posVar).isEmpty()) ){
                    ParenthesisFlag = true;
                    GotParenPos = posVar;
                    //eatVar('(');
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseBase:(:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag);
                    }
                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseBase:(:Before extractAndClassifyFactors:chVar=" + (char) chVar + " posVar=" + posVar + " StrVar=" + StrVar.substring(posVar));
                    }
                    int numberofcharsread = 0;
                    numberofcharsread = extractAndClassifyFactors(StrVar.substring(posVar), DiffWithRespTo, HideAllFlag);
                    //eatVar(')');
                    //posVar = numberofcharsread;
                    posVar = advanceOneTerm(StrVar, posVar);
                    if ((posVar >= 0) && (posVar < StrVar.length())) {
                        chVar = StrVar.charAt(posVar);
                    }
                    MyParenDecoded = "";
                    MyParenEncoded = "";
                    FunctionStr = "";
                    if (!xTerms.isEmpty()) {
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("xTerms:");
                            xTerms.forEach(System.out::println);
                        }
                        for (String str : xTerms) {
                            int kpara = -1;
                            kpara = str.indexOf("(");
                            int kplus = -1;
                            kplus = str.indexOf("+");
                            int kminus = -1;
                            kminus = str.indexOf("-");
                            if ((str.contains("(")) && (str.contains(")")) && (!str.contains("+")) && (!str.contains("-"))) {
                                str = str.replaceFirst("\\(", "").replaceFirst("\\)", "");
                            } else if ((str.contains("(")) && (str.contains(")")) && ((str.contains("+")) && (isUnarySign(str, kplus)))) {
                                str = str.replaceFirst("\\(", "").replaceFirst("\\)", "").replaceFirst("\\+", "");
                            } else if ((str.contains("(")) && (str.contains(")")) && ((str.contains("-")) && (isUnarySign(str, kminus)))) {
                                str = str.replaceFirst("\\(", "").replaceFirst("\\)", "").replaceFirst("\\-", "");
                            }
                            Double Exponent = 0.0;
                            if (str.contains(DiffWithRespTo + "^")) {
                                String MyTemp = str.replaceFirst(DiffWithRespTo + "\\^", "");
                                try {
                                    Exponent = Double.parseDouble(MyTemp);
                                } catch (NumberFormatException e) {
                                    if (MyTemp.startsWith("*")) {
                                        String MyTemp1 = MyTemp.replaceFirst("\\*", "");
                                        try {
                                            Exponent = Double.parseDouble(MyTemp1);
                                        } catch (NumberFormatException e1) {
                                            // Starts with a Letter   
                                        };
                                    } else if (MyTemp.startsWith("/")) {
                                        String MyTemp1 = MyTemp.replaceFirst("/", "");
                                        try {
                                            Exponent = Double.parseDouble(MyTemp1);
                                        } catch (NumberFormatException e1) {
                                            // Starts with a Letter   
                                        }
                                    }
                                }
                                if ((str.startsWith(DiffWithRespTo)) || (str.startsWith("*" + DiffWithRespTo))) {
                                    TermOutput += Exponent;
                                } else if (str.startsWith("/" + DiffWithRespTo)) {
                                    TermOutput -= Exponent;
                                }
                            } else if ((str.equalsIgnoreCase("*" + DiffWithRespTo))) {
                                TermOutput += 1;
                            } else if (str.equalsIgnoreCase("/" + DiffWithRespTo)) {
                                TermOutput -= 1;
                            } else if (str.equalsIgnoreCase(DiffWithRespTo)) {
                                TermOutput += 1;
                            }
                            if (str.startsWith("-"))
                                str=str.replaceFirst("\\-", "");
                            else if (str.startsWith("+"))
                                str=str.replaceFirst("\\+", "");
                            MyParenDecoded = MyParenDecoded + str;
                        }
                        for (String str : xTerms) {
                            if ((str.contains("("))&&(str.contains(")")))
                                FunctionStr = FunctionStr + str;
                        }
                    }
                    if (!MixedExpressionTerms.isEmpty()) {
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("MixedExpressionTerms:");
                            MixedExpressionTerms.forEach(System.out::println);
                        }
                        for (String str : MixedExpressionTerms) {
                            FunctionStr = FunctionStr + str;
                        }
                    }

                    if ((LAVarTermOperator == -1) && (MyParenDecoded.startsWith("/"))) {
                        LAVarTermOperator = '/';
                    } else if ((LAVarTermOperator == -1) && (MyParenDecoded.startsWith("*"))) {
                        LAVarTermOperator = '*';
                    } else {
                        LAVarTermOperator = '*';
                    }
                    MyParenEncoded = MyParenDecoded;
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:Variable:String:(:MapType=" + MapType + " MyParenEncoded=" + MyParenEncoded + " MyParenDecoded=" + MyParenDecoded + " StrIsAConstant=" + StrIsAConstant);
                        System.out.println("LookAheadVar:Variable:(:numberofcharsread=" + numberofcharsread + " posVar=" + posVar + " chVar=" + (char) chVar);
                    }
                    if (!otherTerms.isEmpty()) {
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("otherTerms:");
                            otherTerms.forEach(System.out::println);
                        }
                        for (String str : otherTerms) {
                            int kpara = -1;
                            kpara = str.indexOf("(");
                            int kplus = -1;
                            kplus = str.indexOf("+");
                            int kminus = -1;
                            kminus = str.indexOf("-");
                            if ((str.contains("(")) && (str.contains(")")) && (!str.contains("+")) && (!str.contains("-"))) {
                                str = str.replaceFirst("\\(", "").replaceFirst("\\)", "");
                            } else if ((str.contains("(")) && (str.contains(")")) && ((str.contains("+")) && (isUnarySign(str, kplus)))) {
                                str = str.replaceFirst("\\(", "").replaceFirst("\\)", "").replaceFirst("\\+", "");
                            } else if ((str.contains("(")) && (str.contains(")")) && ((str.contains("-")) && (isUnarySign(str, kminus)))) {
                                str = str.replaceFirst("\\(", "").replaceFirst("\\)", "").replaceFirst("\\-", "");
                            }
                            MyParenDecoded = MyParenDecoded + str;
                        }
                        if ((LAVarTermOperator == -1) && (MyParenDecoded.startsWith("/"))) {
                            LAVarTermOperator = '/';
                        } else if ((LAVarTermOperator == -1) && (MyParenDecoded.startsWith("*"))) {
                            LAVarTermOperator = '*';
                        } else {
                            LAVarTermOperator = '*';
                        }
                        if (MyParenDecoded.startsWith("-")) {
                            MyParenDecoded = MyParenDecoded.replaceFirst("\\-", "");
                        } else if (MyParenDecoded.startsWith("+")) {
                            MyParenDecoded = MyParenDecoded.replaceFirst("\\+", "");
                        } else if (MyParenDecoded.startsWith("*")) {
                            MyParenDecoded = MyParenDecoded.replaceFirst("\\*", "");
                            if (MyParenDecoded.startsWith("^")) {
                                LAVarTermOperator = '^';
                            } else {
                                LAVarTermOperator = '*';
                            }
                        } else if (MyParenDecoded.startsWith("/")) {
                            MyParenDecoded = MyParenDecoded.replaceFirst("/", "");
                            if (MyParenDecoded.startsWith("^")) {
                                LAVarTermOperator = '^';
                            } else {
                                LAVarTermOperator = '/';
                            }
                        }
                        MyParenEncoded = MyParenDecoded;
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            if ((posVar > -1) && (posVar < StrVar.length())) {
                                System.out.println("LookAheadVar:Variable:(:String:otherTerms:" + StrVar.substring(posVar) + " MapType=" + MapType + " MyParenEncoded=" + MyParenEncoded + " MyParenDecoded=" + MyParenDecoded + " StrIsAConstant=" + StrIsAConstant);
                            } else {
                                System.out.println("LookAheadVar:Variable:(:String:otherTerms:MapType=" + MapType + " MyParenEncoded=" + MyParenEncoded + " MyParenDecoded=" + MyParenDecoded + " StrIsAConstant=" + StrIsAConstant);
                            }
                            System.out.println("LookAheadVar:Variable:(:otherTerms:numberofcharsread=" + numberofcharsread + " posVar=" + posVar + " chVar=" + (char) chVar);
                        }
                    }
                    if ((GotExpntNumFlag)&&(!ConstantTerms.isEmpty()) ) {
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("ConstantTerms:");
                            ConstantTerms.forEach(System.out::println);
                        }
                        for (String str : ConstantTerms) {
                            int kpara = -1;
                            kpara = str.indexOf("(");
                            int kplus = -1;
                            kplus = str.indexOf("+");
                            int kminus = -1;
                            kminus = str.indexOf("-");
                            if ((str.contains("(")) && (str.contains(")")) && (!str.contains("+")) && (!str.contains("-"))) {
                                str = str.replaceFirst("\\(", "").replaceFirst("\\)", "");
                            } else if ((str.contains("(")) && (str.contains(")")) && ((str.contains("+")) && (isUnarySign(str, kplus)))) {
                                str = str.replaceFirst("\\(", "").replaceFirst("\\)", "").replaceFirst("\\+", "");
                            } else if ((str.contains("(")) && (str.contains(")")) && ((str.contains("-")) && (isUnarySign(str, kminus)))) {
                                str = str.replaceFirst("\\(", "").replaceFirst("\\)", "").replaceFirst("\\-", "");
                            }
                            MyParenDecoded = MyParenDecoded + str;
                        }
                        MyParenEncoded = MyParenDecoded;
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            if ((posVar > -1) && (posVar < StrVar.length())) {
                                System.out.println("LookAheadVar:Constant:(:String:ConstantTerms:" + StrVar.substring(posVar) + " MapType=" + MapType + " MyParenEncoded=" + MyParenEncoded + " MyParenDecoded=" + MyParenDecoded + " StrIsAConstant=" + StrIsAConstant);
                            } else {
                                System.out.println("LookAheadVar:Constant:(:String:ConstantTerms:MapType=" + MapType + " MyParenEncoded=" + MyParenEncoded + " MyParenDecoded=" + MyParenDecoded + " StrIsAConstant=" + StrIsAConstant);
                            }
                            System.out.println("LookAheadVar:Variable:(:ConstantTerms:numberofcharsread=" + numberofcharsread + " posVar=" + posVar + " chVar=" + (char) chVar);
                        }
                    }
                    String Exprn = MyParenEncoded;//StrVar.substring(startPos, posVar);
                    //eatVar(')');
                    log.info("LookAheadVar:parseBase:Parenthesis:Function:Exprn=" + Exprn + " posVar=" + posVar + " chVar=" + (char) chVar);
                    if ((IsAConstant(Exprn, DiffWithRespTo))
                            && ((StrIsAConstant.equalsIgnoreCase("Number"))
                            || (StrIsAConstant.equalsIgnoreCase("NumberExpression")))) {
                        //x = (() -> Exprn);
                        log.info("LookAheadVar:parseBase:NumberExpression:Calling Simple:x.eval()=" + x.eval() + " Exprn=" + Exprn + " StrIsAConstant=" + StrIsAConstant);
                        log.info("LookAheadVar:parseBase:NumberExpression:Exprn=" + Exprn);
                        depthBackUpRestore++;
                        StrKeyBackUpRestore = FileMathsBackUpRestore + "LookAheadVar:parseBase:NumberExpression:";
                        System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET: LookAheadVar:Recursivecall:Start:Maths:Expression" + " depthBackUpRestore=" + depthBackUpRestore + ConsoleColors.RESET);
                        Map<String, String> variablesBackupState = new HashMap<>();
                        BackupMathsStateAll(variablesBackupState);
                        ChaosPrevention();
                        MathsExpressionParser.Expression MyMappedSimple = MathsExpressionParser.parse(Exprn, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                        RestoreMathsStateAll(variablesBackupState);
                        System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET: LookAheadVar:Recursivecall:End:Maths:Expression" + " depthBackUpRestore=" + depthBackUpRestore + ConsoleColors.RESET);
                        depthBackUpRestore--;
                        StrKeyBackUpRestore = FileMathsBackUpRestore;
                        final String MySimpleExprn = "" + MyMappedSimple.eval();
                        log.info("LookAheadVar:parseBase:NumberExpression:MySimpleExprn=" + MySimpleExprn);
                        if (((Exprn.contains("+")) || (Exprn.contains("-"))) && (IsAConstant(MySimpleExprn, DiffWithRespTo))) {
                            log.info("LookAheadVar:parseBase:NumberExpression:Function:Exprn=" + Exprn);
                            x = (() -> MySimpleExprn);
                        } else if (((Exprn.contains("+")) || (Exprn.contains("-"))) && (MySimpleExprn.equalsIgnoreCase(Exprn))) {
                            log.info("LookAheadVar:parseBase:NumberExpression:Function:Exprn=" + Exprn);
                            x = (() -> Exprn);
                        } else {
                            x = (() -> MySimpleExprn);
                        }
                        log.info("LookAheadVar:parseBase:NumberExpression:Complete Function String:x.eval()=" + x.eval() + " Exprn=" + Exprn);
                        log.info("LookAheadVar:parseBase:Parenthesis:Function:Constant:Exprn=" + Exprn + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar);
                        if (timesLoop == 0) {
                            GotBracesVarFlag = true;
                        }
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadVar:parseBase:(:NumberExpression:Return Value:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag);
                        }
                    } else if ((!IsAConstant(Exprn, DiffWithRespTo))
                            && ((StrIsAConstant.equalsIgnoreCase("IndConstantExpression"))
                            || (StrIsAConstant.equalsIgnoreCase("IndConstant")))) {
                        x = (() -> Exprn);
                        log.info("LookAheadVar:parseBase:Parenthesis:Function:Var:Exprn=" + Exprn + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar);
                        GotBracesVarFlag = true;
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadVar:parseBase:(:IndConstantExpression:Return Value:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag);
                        }
                    } else {
                        if ((FunctionStr.equalsIgnoreCase(""))&&(TermOutput==0.0))
                                x = (() -> "1.0");
                        else if (!FunctionStr.equalsIgnoreCase("")){
                            if ( ( ( (TermOutput==1.0) || (TermOutput==-1.0)))&& (FunctionStr.equalsIgnoreCase("("+ DiffWithRespTo + ")" )) )
                                TermOutput=0.0;
                            if ( (FunctionStr.startsWith("("))&&(FunctionStr.endsWith(")")) )
                                FunctionStr=FunctionStr.replaceFirst("\\(", "").replaceFirst("\\)", "");
                            if(FunctionStr.startsWith("-"))
                                FunctionStr=FunctionStr.replaceFirst("\\-", "");
                            else if(FunctionStr.startsWith("+"))
                                FunctionStr=FunctionStr.replaceFirst("\\+", "");
                        }
                        log.info("LookAheadVar:parseBase:Parenthesis:Else:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar);
                        //GotBracesVarFlag = true;
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadVar:parseBase:(:Else:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " Exprn=" + Exprn + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag);
                        }
                    }
                    GotVariablePos = startPos;
                    TrailConstantFlag = true;
                    if ((startPos >= 1) && ((StrVar.charAt(startPos - 1) == '*') || (StrVar.charAt(startPos - 1) == '/'))) {
                        TrailConstantOperator = StrVar.charAt(startPos - 1);
                    }
                    if (ComplexAssignFlag == false) {
                        ComplexAssignFlag = true;
                    }
                    log.info("LookAheadVar:parseBase:BraceExpression:Exprn=" + Exprn + " x.eval()=" + x.eval() + " ContainsIndConstFlag=" + ContainsIndConstFlag + " GotBracesVarFlag=" + GotBracesVarFlag + " TermOutput=" + TermOutput + " chVar=" + (char) chVar + " posVar=" + posVar);
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadVar:parseBase:(:Return Value:FunctionStr=" + FunctionStr + " x.eval()=" + x.eval() + " TermOperatorPos=" + TermOperatorPos + " TermOutput=" + TermOutput + " ParenthesisFlag=" + ParenthesisFlag);
                    }
                    return x;
                } else if (chVar == ')') {
                    eatVar(')');
                    ParenthesisFlag = true;
                    return x;
                } else {
                    if (((IsNotAnOperator(chVar)) && ((!IsNumber(chVar)) || (!IsVariable(chVar)))) && (chVar != 0) && (chVar != -1) && (chVar != '(')) {
                        if ((StrVar != null) && (startPos < StrVar.length()) && (startPos < posVar) && (chVar != -1) && (chVar != 0)) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "LookAheadVar:parseBase:Unexpected: " + (char) chVar + " int=" + (int) chVar + " Cannot Format:" + StrVar.substring(posVar, StrVar.length()));
                        } else if ((chVar != -1) && (chVar != 0) && (posVar >= 1) && (posVar < StrVar.length()) && (IsNumber(chVar))) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "LookAheadVar:parseBase:Please Check Code:Should NOT reach Here:Unexpected: " + (char) chVar + " int=" + (int) chVar + " Cannot Format:" + StrVar.substring(posVar, StrVar.length()));
                        } else if ((chVar != -1) && (chVar != 0) && (posVar >= 1) && (posVar < StrVar.length()) && (IsOperator(chVar))) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "LookAheadVar:parseBase:Please Check Equation Operators:Should NOT reach Here:Unexpected: " + (char) chVar + " int=" + (int) chVar + " Cannot Format:" + StrVar.substring(posVar, StrVar.length()));
                        } else if ((chVar != -1) && (chVar != 0) && (posVar >= 1) && (posVar < StrVar.length())) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "LookAheadVar:parseBase:Unexpected: " + (char) chVar + " int=" + (int) chVar + " Cannot Format:" + StrVar.substring(posVar, StrVar.length()));
                        } else {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "LookAheadVar:parseBase:Unexpected char: " + (char) chVar + " int=" + (int) chVar + " Cannot Format:" + StrVar.substring(posVar, StrVar.length()));
                        }
                    }
                    return x;
                }
            }
        }.parseVar();
    }
//Created by Rajesh Pai
// Converts Coefficients of a Term to a Single Value

    @FunctionalInterface
    public interface LookAheadIndConst {

        String eval();
    }

    public static LookAheadIndConst parseIndConst(String str, String DiffWithRespTo, String MapType, String IntegrORDiffr, boolean HideAllFlag) {

        return new Object() {
            void nextCharIndConst() {
                ++posIndConst;
                chIndConst = (posIndConst < StrIndConst.length()) ? StrIndConst.charAt(posIndConst) : -1;
                if ((chIndConst == -1) && (posIndConst >= StrIndConst.length())) {
                    posIndConst = StrIndConst.length();
                } else if ((chIndConst == -1) || ((chIndConst == 0))) {
                    throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "LookAheadIndConst:nextCharIndConst:Unexpected: " + (char) chIndConst + " int=" + (int) chIndConst + " Cannot Format:" + StrIndConst.substring(posIndConst, StrIndConst.length()));
                }
            }

            boolean eatVar(int CharToEat) {
                while (chIndConst == ' ') {
                    nextCharIndConst();
                }
                if (chIndConst == CharToEat) {
                    nextCharIndConst();
                    return true;
                }
                return false;
            }

            LookAheadIndConst parseIndConst() {
                GotBracesVarFlag = false;
                LookAheadIndConst x = (() -> "");
                if (Str.equalsIgnoreCase("")) {
                    return x;
                } else {
                    StrIndConst = str;
                }
                String CompleteStr = "";
                LAIndConstOperator = -1;
                if ((HideAllFlag == true) && (DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                    System.out.println("LookAheadIndConst:parseIndConst:Rule 0:GotIndConstPos=" + GotIndConstPos + " posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator + " LAIndConstOperator=" + (char) LAIndConstOperator + " ContainsIndConstFlag=" + ContainsIndConstFlag + " GotIndConstFlag=" + GotIndConstFlag);
                }
                if ((ContainsIndConstFlag == true) || ((GotIndConstFlag == true) && (GotIndConstPos >= 0))) {
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadIndConst:parseIndConst:Rule 1:Start:GotIndConstPos=" + GotIndConstPos + " posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator + " LAIndConstOperator=" + (char) LAIndConstOperator + " StrIndConst=" + StrIndConst);
                    }
                    log.info("LookAheadIndConst:parseIndConst:GotIndConstPos=" + GotIndConstPos + " TermOperatorPos=" + TermOperatorPos);
                    log.info("LookAheadIndConst:parseIndConst:posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst + " ComplexAssignFlag=" + ComplexAssignFlag);
                    ContainsIndConstFlag = false;
                    GotIndConstFlag = false;
                    StrIndConst = str;//Str.substring(pos);
                    if ((GotIndConstPos >= 0) && (IsVariable(StrIndConst.charAt(GotIndConstPos)))) {
                        posIndConst = GotIndConstPos;
                        chIndConst = StrIndConst.charAt(posIndConst);
                    } else {
                        for (int i = 0; i < 6; i++) {
                            if (((GotIndConstPos >= 0) && (GotIndConstPos + i) < StrIndConst.length()) && (IsVariable(StrIndConst.charAt(GotIndConstPos + i)))) {
                                posIndConst = GotIndConstPos + i;
                                break;
                            } else if (((GotIndConstPos >= 0) && (GotIndConstPos - i) >= 0) && (IsVariable(StrIndConst.charAt(GotIndConstPos - i)))) {
                                posIndConst = GotIndConstPos - i;
                                break;
                            }
                        }
                    }
                    TermOperatorPos = -1;
                    TermOutputIndConst = 0.0;
                    TempIndConstBase = "";
                    if (posIndConst < 0) {
                        posIndConst = 0;
                    }
                    if ((posIndConst >= 0) && (StrIndConst.length() > 1) && (posIndConst < StrIndConst.length())) {
                        chIndConst = StrIndConst.charAt(posIndConst);
                    }
                    for (int i = posIndConst; i >= 0; i--) {
                        if (IsVariable(StrIndConst.charAt(i)))
                            ; else if (IsNumber(StrIndConst.charAt(i)))
                            ; else if (isUnarySign(StrIndConst, i))
                                ; else if (i == posIndConst) {
                            i--;
                        }
                        if ((i >= 0) && (IsOperator(StrIndConst.charAt(i))) && (!isUnarySign(StrIndConst, i))) {
                            LAIndConstOperator = StrIndConst.charAt(i);
                        }
                        if (i == 0) {
                            LAIndConstOperator = '*';
                            LAPreIndConstOperator = '*';
                            posIndConst = i;
                        } else if ((IsOperator(LAIndConstOperator)) && (LAIndConstOperator != '^') && (!isUnarySign(StrIndConst, i))) {
                            posIndConst = i;
                            break;
                        }
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadConst:parseLA:End:Reached1.1.1:x.eval()=" + x.eval() + " ComplexAssignFlag=" + ComplexAssignFlag + " ParenthesisFlag=" + ParenthesisFlag + " LATermOperator=" + (char) LATermOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " posLA=" + posLA + " chLA=" + (char) chLA);
                        }
                    }
                    LAPreIndConstOperator = LAIndConstOperator;
                    if ((posIndConst >= 0) && (StrIndConst.length() >= 1) && (posIndConst < StrIndConst.length())) {
                        chIndConst = StrIndConst.charAt(posIndConst);
                    }
                    log.info("LookAheadIndConst:parseIndConst:GotIndConstPos=" + GotIndConstPos + " TermOperatorPos=" + TermOperatorPos);
                    log.info("LookAheadIndConst:parseIndConst:posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst + " ComplexAssignFlag=" + ComplexAssignFlag);
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadIndConst:parseIndConst:Rule 1.2:End:GotIndConstPos=" + GotIndConstPos + " posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator + " LAIndConstOperator=" + (char) LAIndConstOperator + " StrIndConst=" + StrIndConst);
                    }
                } else {
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadIndConst:parseIndConst:Rule 2:Start:GotIndConstPos=" + GotIndConstPos + " posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator + " LAIndConstOperator=" + (char) LAIndConstOperator);
                    }
                    log.info("LookAheadIndConst:parseIndConst:GotIndConstPos=" + GotIndConstPos + " TermOperatorPos=" + TermOperatorPos);
                    log.info("LookAheadIndConst:parseIndConst:posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst + " ComplexAssignFlag=" + ComplexAssignFlag);
                    posIndConst = 0;//GotIndConstPos;
                    if (StrIndConst.length() > 1) {
                        chIndConst = StrIndConst.charAt(posIndConst);
                    }
                    TermOperatorPos = -1;
                    TermOutputIndConst = 0.0;
                    TempIndConstBase = "";
                    log.info("LookAheadIndConst:parseIndConst:GotIndConstPos=" + GotIndConstPos + " TermOperatorPos=" + TermOperatorPos);
                    log.info("LookAheadIndConst:parseIndConst:posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst + " ComplexAssignFlag=" + ComplexAssignFlag);
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadIndConst:parseIndConst:Rule 2:End:GotIndConstPos=" + GotIndConstPos + " posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator + " LAIndConstOperator=" + (char) LAIndConstOperator);
                    }
                }
                int StartPos = posIndConst;
                log.info("LookAheadIndConst:parseIndConst:StartPos=" + StartPos + " posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst + " ComplexAssignFlag=" + ComplexAssignFlag);
                if ((TermOperatorPos > -1) && (TermOperatorPos < StrIndConst.length())) {
                    log.info("LookAheadIndConst:parseIndConst:TermOperatorPos=" + TermOperatorPos + " TermOperator=" + (char) StrIndConst.charAt(TermOperatorPos) + " chIndConst=" + (char) chIndConst);
                }
                ParseLog("LookAheadIndConst", "parseIndConst", "Initial", "StrIndConst", StrIndConst);
                if ((StrIndConst != null) && (StrIndConst.length() > 0)
                        && (StrIndConst.length() < 2)
                        && ((chIndConst == '*')
                        || (chIndConst == '/')
                        || (chIndConst == '^'))) {
                    log.info("LookAheadIndConst:parseIndConst:Before parseTerm:Final:x.eval()=" + x.eval());
                    return x;
                } else {
                    x = parseTerm();
                }
                //if ((TrailConstantFlag == true) && (GotVariableFlag == true) || (ComplexAssignFlag == true)) {
                //    ParseLog("LookAheadIndConst","parseIndConst", "BeforeMap","StrIndConst", StrIndConst);
                //    ParseMap("LookAheadIndConst:parseIndConst", StrIndConst.length(), 0, DiffWithRespTo);
                //}
                log.info("LookAheadIndConst:parseIndConst:Variable:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LAIndConstOperator=" + (char) LAIndConstOperator + " LAPreTermOperator=" + (char) LAPreTermOperator);
                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                    System.out.println("LookAheadIndConst:parseIndConst:Variable:x.eval()=" + x.eval() + " TermOutput=" + TermOutput + " LAIndConstOperator=" + (char) LAIndConstOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                }
                if (x.eval().contains("(")) {
                    CompleteStr = x.eval();//Do Nothing as eval already is finished with function & Argument
                }
                if ((x.eval().equalsIgnoreCase("Infinity")) || (x.eval().equalsIgnoreCase("NaN"))) {
                    ;//Do Nothing as e.eval() is already mapped 
                }
                if (x.eval().startsWith("1.0\\*")) {
                    final String TempStr = x.eval().replaceFirst("1.0\\*", "");
                    x = (() -> TempStr);
                }
                log.info("LookAheadIndConst:parseIndConst:PreFinal:Variable:x.eval()=" + x.eval());
                if ((!CompleteStr.equalsIgnoreCase("")) && (!x.eval().equalsIgnoreCase("1.0")) && (!CompleteStr.equalsIgnoreCase(x.eval()))) {
                    CompleteStr = CompleteStr + "*" + x.eval();
                } else if ((!CompleteStr.equalsIgnoreCase("")) && (x.eval().equalsIgnoreCase("1.0"))) {
                    CompleteStr = CompleteStr;
                } else {
                    CompleteStr = x.eval();
                }
                log.info("LookAheadIndConst:parseIndConst:Final:CompleteStr=" + CompleteStr + " x.eval()=" + x.eval());
                final String MyString = CompleteStr;
                if ((posIndConst < (StrIndConst.length() - 1)) && (chIndConst != -1) && (chIndConst != 0)) {
                    x = (() -> MyString);
                } else if (posIndConst < (StrIndConst.length() - 1)) {
                    x = (() -> MyString);
                } else {
                    x = (() -> MyString);
                }
                log.info("LookAheadIndConst:parseIndConst:Final:x.eval()=" + x.eval());
                ParseLog("LookAheadIndConst", "parseIndConst", "Final", "StrIndConst", StrIndConst);
//                if ((posVar != -1)&&(str != null)&&(!str.equalsIgnoreCase(""))&&(str.substring(posVar, str.length()).equalsIgnoreCase(""))&&(posVar <= str.length())) {
//                    throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "LookAheadVar:parse:Unexpected: " + (char) chVar + " int=" + (int) chVar + " posVar=" + posVar + " str=" + str.substring(posVar, str.length()));
//                }
                ComplexAssignFlag = false;
                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                    System.out.println("LookAheadIndConst:parseIndConst:Final:x.eval()=" + x.eval());
                }
                return x;
            }

            LookAheadIndConst parseTerm() {
                int StartPos = posIndConst;
                LookAheadIndConst x = (() -> "");
                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                    System.out.println("LookAheadIndConst:parseTerm:Initial:x.eval()=" + x.eval() + " posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator + " LAIndConstOperator=" + (char) LAIndConstOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " LATermOperator=" + (char) LATermOperator);
                }
                x = parseFactor();
                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                    System.out.println("LookAheadIndConst:parseTerm:Initial:x.eval()=" + x.eval());
                }
                if ((IsAConstant(x.eval(), DiffWithRespTo))) {
                    x = (() -> "");
                } else if ((!IsAConstant(x.eval(), DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("Var")) || (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
                    x = (() -> "");
                } else if ((!IsAConstant(x.eval(), DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                    ;
                }
                for (;;) {
                    if (eatVar('*')) { // multiplication
                        log.info("LookAheadIndConst:parseTerm:Multiply:Initial Value:x.eval()=" + x.eval() + " TermOutputIndConst=" + TermOutputIndConst + " TermOperatorPos=" + TermOperatorPos + " posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst);
                        LookAheadIndConst a = x, b = parseFactor();
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadIndConst:parseTerm:*:x.eval()=" + x.eval());
                        }
                        if ((TermOperatorPos == -1) && (!x.eval().contains("^"))) {
//                            if (TermOutputSetFlag == false) {
//                                TermOutputIndConst += 1.0;
//                                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
//                            System.out.println("LookAheadIndConst:parseTerm:*:x.eval()=" + x.eval() + " TermOutputIndConst=" + TermOutputIndConst);
//                        }
//                            }
                            if ((IsAConstant(b.eval(), DiffWithRespTo)) && (a.eval().equalsIgnoreCase("1.0"))) {
                                x = (() -> "1.0");
                            } else if ((IsAConstant(b.eval(), DiffWithRespTo)) && (a.eval().equalsIgnoreCase(""))) {
                                x = (() -> "1.0");
                            } else if ((!IsAConstant(b.eval(), DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                                if ((!IsAConstant(x.eval(), DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                                    final String Tempxeval = x.eval();
                                    x = (() -> Tempxeval + "*" + b.eval());
                                } else {
                                    x = (() -> b.eval());
                                }
                            }
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadIndConst:parseTerm:*:After FSM1:x.eval()=" + x.eval() + " TermOutputIndConst=" + TermOutputIndConst);
                            }
                            if ((!IsAConstant(b.eval(), DiffWithRespTo)) && (!b.eval().equalsIgnoreCase(DiffWithRespTo))) {
                                if ((chIndConst == '*') || (chIndConst == '/')) {
                                    LAIndConstOperator = chIndConst;
                                    log.info("LookAheadIndConst:parseTerm:Multiply:TermOperatorPos:x.eval()=" + x.eval() + " LAIndConstOperator=" + (char) LAIndConstOperator + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator + " TermOutputIndConst=" + TermOutputIndConst + " chIndConst=" + (char) chIndConst);
                                }
                            }
                            log.info("LookAheadIndConst:parseTerm:Multiply:TermOperatorPos:x.eval()=" + x.eval() + " LAIndConstOperator=" + (char) LAIndConstOperator + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator + " TermOutputIndConst=" + TermOutputIndConst + " chIndConst=" + (char) chIndConst);
                        } else if ((IsAConstant(b.eval(), DiffWithRespTo)) && (a.eval().equalsIgnoreCase("1.0"))) {
                            x = (() -> "1.0");
                            log.info("LookAheadIndConst:parseTerm:Multiply:IsAConstant:x.eval()=" + x.eval() + " LAIndConstOperator=" + (char) LAIndConstOperator + " TermOutputIndConst=" + TermOutputIndConst + " chIndConst=" + (char) chIndConst);
                        } else if (b.eval().equalsIgnoreCase(DiffWithRespTo)) {
                            if (TermOutputSetFlag == false) {
                                TermOutputIndConst += 1.0;
                            }
                            x = (() -> a.eval());

                            log.info("LookAheadIndConst:parseTerm:Multiply:DiffWithRespTo:x.eval()=" + x.eval() + " LAIndConstOperator=" + (char) LAIndConstOperator + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator + " TermOutputIndConst=" + TermOutputIndConst + " chIndConst=" + (char) chIndConst);
                        } else if ((!b.eval().equalsIgnoreCase(DiffWithRespTo)) && (!b.eval().equalsIgnoreCase("") && (!b.eval().contains("(")))) {
                            if (TermOutputSetFlag == false) {
                                TermOutputIndConst += 1.0;
                            }
                            if (a.eval().equalsIgnoreCase("1.0")) {
                                x = (() -> (b.eval()));

                            } else if ((!a.eval().equalsIgnoreCase("")) && (!IsAConstant(b.eval(), DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (!StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                                x = (() -> (a.eval() + "*" + b.eval()));

                            } else if ((!a.eval().equalsIgnoreCase("")) && (IsAConstant(b.eval(), DiffWithRespTo))) {
                                x = (() -> a.eval());

                            } else if ((!a.eval().equalsIgnoreCase("")) && (!IsAConstant(b.eval(), DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                                x = (() -> a.eval());
                            } else {
                                x = (() -> b.eval());

                            }
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadIndConst:parseTerm:*:After FSM2:x.eval()=" + x.eval() + " TermOutputIndConst=" + TermOutputIndConst);
                            }
                            if ((!IsAConstant(b.eval(), DiffWithRespTo)) && (!b.eval().equalsIgnoreCase(DiffWithRespTo))) {
                                if ((chIndConst == '*') || (chIndConst == '/')) {
                                    LAIndConstOperator = chIndConst;
                                }
                            }
                            log.info("LookAheadIndConst:parseTerm:Multiply:!DiffWithRespTo:x.eval()=" + x.eval() + " LAIndConstOperator=" + (char) LAIndConstOperator + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator + " TermOutputIndConst=" + TermOutputIndConst + " chIndConst=" + (char) chIndConst);
                        } else if ((!b.eval().equalsIgnoreCase(DiffWithRespTo)) && (!b.eval().equalsIgnoreCase("") && (b.eval().contains("(")))) {
                            if ((!a.eval().equalsIgnoreCase("")) && (!IsAConstant(b.eval(), DiffWithRespTo))) {
                                x = (() -> (a.eval() + "*" + b.eval()));
                            }
                            if ((!IsAConstant(b.eval(), DiffWithRespTo)) && (!b.eval().equalsIgnoreCase(DiffWithRespTo))) {
                                if ((chIndConst == '*') || (chIndConst == '/')) {
                                    LAIndConstOperator = chIndConst;
                                }
                            }
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadIndConst:parseTerm:*:After FSM3:x.eval()=" + x.eval() + " TermOutputIndConst=" + TermOutputIndConst);
                            }
                            log.info("LookAheadIndConst:parseTerm:Multiply:!DiffWithRespTo:x.eval()=" + x.eval() + " LAIndConstOperator=" + (char) LAIndConstOperator + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator + " TermOutputIndConst=" + TermOutputIndConst + " chIndConst=" + (char) chIndConst);
                        } else if ((!b.eval().equalsIgnoreCase(DiffWithRespTo)) && (!b.eval().equalsIgnoreCase("") && (b.eval().contains("(")))) {
                            x = (() -> b.eval());
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadIndConst:parseTerm:*:After FSM4:x.eval()=" + x.eval() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator + " LAIndConstOperator=" + (char) LAIndConstOperator + " TermOutputIndConst=" + TermOutputIndConst);
                            }
                            log.info("LookAheadIndConst:parseTerm:Multiply:!DiffWithRespTo:IsAConstant:x.eval()=" + x.eval() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator + " LAIndConstOperator=" + (char) LAIndConstOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " LATermOperator=" + (char) LATermOperator + " TermOutputIndConst=" + TermOutputIndConst + " chIndConst=" + (char) chIndConst);
                        }
                        TermOperatorPos = 0;//Should never Enter again
                        GotVariablePos = -1;
                        if ((!IsAConstant(x.eval(), DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                            ;// DO Nothing as this is a IndConstant Expression
                        } else {
                            x = (() -> "");
                        }
                        log.info("LookAheadIndConst:parseTerm:Multiply:x.eval()=" + x.eval() + " LAIndConstOperator=" + (char) LAIndConstOperator + " TermOutput=" + TermOutput + " chVar=" + (char) chVar);
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadIndConst:parseTerm:*:End Value:x.eval()=" + x.eval() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator + " LAIndConstOperator=" + (char) LAIndConstOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " LATermOperator=" + (char) LATermOperator);
                        }
                    } else if ((eatVar('/'))) { // division
                        log.info("LookAheadIndConst:parseTerm:Divide:Initial Value:x.eval()=" + x.eval() + " TermOutputIndConst=" + TermOutputIndConst + " TermOperatorPos=" + TermOperatorPos + " posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst);
                        LookAheadIndConst a = x, b = parseFactor();
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadIndConst:parseTerm:/:Initial:x.eval()=" + x.eval());
                        }
                        if (TermOperatorPos == -1) {
//                            if (TermOutputSetFlag == false) {
//                                TermOutputIndConst -= 1.0;
//                            }
                            if ((IsAConstant(b.eval(), DiffWithRespTo)) && (a.eval().equalsIgnoreCase("1.0"))) {
                                x = (() -> "1.0");
                            } else if ((IsAConstant(b.eval(), DiffWithRespTo)) && (a.eval().equalsIgnoreCase(""))) {
                                x = (() -> "");
                            } else if ((!IsAConstant(b.eval(), DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                                if ((!IsAConstant(x.eval(), DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant")) || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
                                    final String Tempxeval = x.eval();
                                    x = (() -> Tempxeval + "/" + b.eval());
                                } else {
                                    x = (() -> "1.0/" + b.eval());
                                }
                            }
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadIndConst:parseTerm:/:After FSM1:x.eval()=" + x.eval() + " TermOutputIndConst=" + TermOutputIndConst);
                            }
                            if ((!IsAConstant(b.eval(), DiffWithRespTo)) && (!b.eval().equalsIgnoreCase(DiffWithRespTo))) {
                                if ((chIndConst == '*') || (chIndConst == '/')) {
                                    LAIndConstOperator = chIndConst;
                                    log.info("LookAheadIndConst:parseTerm:Divide:TermOperatorPos:x.eval()=" + x.eval() + " LAIndConstOperator=" + (char) LAIndConstOperator + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator + " TermOutputIndConst=" + TermOutputIndConst + " chIndConst=" + (char) chIndConst);
                                }
                            }
                            log.info("LookAheadIndConst:parseTerm:Divide:TermOperatorPos:x.eval()=" + x.eval() + " LAIndConstOperator=" + (char) LAIndConstOperator + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator + " TermOutputIndConst=" + TermOutputIndConst + " chIndConst=" + (char) chIndConst);
                        } else if ((IsAConstant(b.eval(), DiffWithRespTo)) && (a.eval().equalsIgnoreCase("1.0"))) {
                            x = (() -> "1.0");
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadIndConst:parseTerm:/:After FSM2:x.eval()=" + x.eval() + " TermOutputIndConst=" + TermOutputIndConst);
                            }
                            log.info("LookAheadIndConst:parseTerm:Divide:IsAConstant:x.eval()=" + x.eval() + " LAIndConstOperator=" + (char) LAIndConstOperator + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator + " TermOutputIndConst=" + TermOutputIndConst + " chIndConst=" + (char) chIndConst);
                        } else if (b.eval().equalsIgnoreCase(DiffWithRespTo)) {
                            if (TermOutputSetFlag == false) {
                                TermOutputIndConst -= 1.0;
                            }
                            x = (() -> a.eval());
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadIndConst:parseTerm:/:After FSM3:x.eval()=" + x.eval() + " TermOutputIndConst=" + TermOutputIndConst);
                            }
                            log.info("LookAheadIndConst:parseTerm:Divide:DiffWithRespTo:x.eval()=" + x.eval() + " LAIndConstOperator=" + (char) LAIndConstOperator + " TermOutputIndConst=" + TermOutputIndConst + " chIndConst=" + (char) chIndConst);
                        } else if ((!b.eval().equalsIgnoreCase(DiffWithRespTo)) && (!b.eval().equalsIgnoreCase("") && (!b.eval().contains("(")))) {
                            if (TermOutputSetFlag == false) {
                                TermOutputIndConst -= 1.0;
                            }
                            if ((!a.eval().equalsIgnoreCase("")) && (!IsAConstant(b.eval(), DiffWithRespTo))) {
                                x = (() -> (a.eval() + "/" + b.eval()));

                            } else if (IsAConstant(b.eval(), DiffWithRespTo)) {
                                x = (() -> a.eval());

                            } else {
                                x = (() -> ("1.0/" + b.eval()));

                            }
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadIndConst:parseTerm:/:After FSM4:x.eval()=" + x.eval() + " TermOutputIndConst=" + TermOutputIndConst);
                            }
                            if ((!IsAConstant(b.eval(), DiffWithRespTo)) && (!b.eval().equalsIgnoreCase(DiffWithRespTo))) {
                                if ((chIndConst == '*') || (chIndConst == '/')) {
                                    LAIndConstOperator = chIndConst;
                                }
                            }
                            log.info("LookAheadIndConst:parseTerm:Divide:!DiffWithRespTo:x.eval()=" + x.eval() + " LAIndConstOperator=" + (char) LAIndConstOperator + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator + " TermOutputIndConst=" + TermOutputIndConst + " chIndConst=" + (char) chIndConst);
                        } else if ((!b.eval().equalsIgnoreCase(DiffWithRespTo)) && (!b.eval().equalsIgnoreCase("") && (b.eval().contains("(")))) {
                            x = (() -> b.eval());

                        }
                        TermOperatorPos = 0;//Should never Enter again
                        GotVariablePos = -1;
                        log.info("LookAheadIndConst:parseTerm:Divide:x.eval()=" + x.eval() + " LAIndConstOperator=" + (char) LAIndConstOperator + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator + " TermOutputIndConst=" + TermOutputIndConst + " chIndConst=" + (char) chIndConst);
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadIndConst:parseTerm:/:End Value:x.eval()=" + x.eval() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator + " LAIndConstOperator=" + (char) LAIndConstOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " LATermOperator=" + (char) LATermOperator);
                        }
                    } else {
                        log.info("LookAheadIndConst:parseTerm:Return Value:Initial Value:TermOperatorPos=" + TermOperatorPos + " posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst);
                        log.info("LookAheadIndConst:parseTerm:Return Value:x.eval()=" + x.eval() + " TermOutputIndConst=" + TermOutputIndConst);
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadIndConst:parseTerm:Return Value:x.eval()=" + x.eval() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator + " LAIndConstOperator=" + (char) LAIndConstOperator + " LAPreTermOperator=" + (char) LAPreTermOperator + " LATermOperator=" + (char) LATermOperator);
                        }
                        return x;
                    }
                }
            }

            LookAheadIndConst parseFactor() {
                TermOutputSetFlag = false;
                GotExpntNumFlag = false;
                TempIndConstBase = "";
                int StartPos = posIndConst;
                LookAheadIndConst x = parseBase();
                log.info("LookAheadIndConst:parseFactor:x.eval()=" + x.eval());
                if ((!x.eval().equalsIgnoreCase(""))
                        && (!x.eval().equalsIgnoreCase(DiffWithRespTo))) {
                    TempIndConstBase = x.eval();
                }
                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                    System.out.println("LookAheadIndConst:parseFactor:Initial Value:x.eval()=" + x.eval());
                }
                log.info("LookAheadIndConst:parseFactor:x.eval()=" + x.eval() + " TempIndConstBase=" + TempIndConstBase);
                for (;;) {
                    if (eatVar('^')) { // exponentiation
                        GotExpntNumFlag = true;
                        LookAheadIndConst a = x, b = parseBase();
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadIndConst:parseFactor:^:Initial Value:x.eval()=" + x.eval());
                        }
                        StartPos = posIndConst;
                        GotExpntNumFlag = false;
                        log.info("LookAheadIndConst:parseFactor:Exponent:b.eval()=" + b.eval() + " TermOutputIndConst=" + TermOutputIndConst);
                        if ((!b.eval().equalsIgnoreCase("")) && (!TempIndConstBase.equalsIgnoreCase(""))) {
                            if ((IsAConstant(a.eval(), DiffWithRespTo)) && (IsAConstant(b.eval(), DiffWithRespTo))) {
                                // 2^3
                                x = (() -> "1.0");
                            } //                            else if ((IsAConstant(a.eval(), DiffWithRespTo))&&(IsAConstant(b.eval(), DiffWithRespTo)) && (!b.eval().equalsIgnoreCase("0.0"))) {
                            //                                TermOutputIndConst += Double.parseDouble(b.eval());
                            //                                TermOutputSetFlag = true;
                            //                                x = b;
                            //                            } 
                            else if ((IsAConstant(a.eval(), DiffWithRespTo)) && (!IsAConstant(b.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant"))) {
                                // 2^a
                                TermOutputSetFlag = true;
                                x = (() -> a.eval() + "^" + b.eval());
                                TempIndConstStrSet = true;
                            } else if ((IsAConstant(a.eval(), DiffWithRespTo)) && (!IsAConstant(b.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Var"))) {
                                // 2^x
                                x = (() -> "1.0");
                                TermOutputSetFlag = true;
                                TempIndConstStrSet = false;
                            } else if ((!IsAConstant(a.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant")) && (!IsAConstant(b.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant"))) {
                                // a^b
                                TermOutputSetFlag = true;
                                x = (() -> a.eval() + "^" + b.eval());
                                TempIndConstStrSet = true;
                            } else if ((!IsAConstant(a.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Var")) && (!IsAConstant(b.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant"))) {
                                // x^b
                                x = (() -> "1.0");
                                TermOutputSetFlag = true;
                                TempIndConstStrSet = false;
                            } else if ((!IsAConstant(a.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant")) && (!IsAConstant(b.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Var"))) {
                                // a^x
                                x = (() -> "1.0");
                                TermOutputSetFlag = true;
                                TempIndConstStrSet = false;
                            } else if ((!IsAConstant(a.eval(), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("IndConstant")) && (IsAConstant(b.eval(), DiffWithRespTo))) {
                                // a^2
                                TermOutputIndConst += Double.parseDouble(b.eval());
                                x = (() -> a.eval() + "^" + b.eval());
                                TermOutputSetFlag = true;
                            } else {
                                x = (() -> "1.0");
                                TermOutputSetFlag = true;
                                TempIndConstStrSet = false;
                            }

                        } else {
                            x = a;
                        }
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadIndConst:parseFactor:^:End Value:x.eval()=" + x.eval());
                        }
                        log.info("LookAheadIndConst:parseFactor:Exponent:x.eval()=" + x.eval() + " TermOutputIndConst=" + TermOutputIndConst);
                    } else {
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadIndConst:parseFactor:^:Return Value:x.eval()=" + x.eval());
                        }
                        log.info("LookAheadIndConst:parseFactor:Return Value:x.eval()=" + x.eval() + " TermOutputIndConst=" + TermOutputIndConst);
                        return x;
                    }
                }
            }

            LookAheadIndConst parseBase() {
                int startPos = posIndConst;
                if ((posIndConst >= 0) && (posIndConst < StrIndConst.length())) {
                    log.info("LookAheadIndConst:parseBase:Entered:posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst + " StrIndConst=" + StrIndConst.substring(startPos));
                }
                if (startPos >= 0) ; else {
                    startPos = 0;
                }
                LookAheadIndConst x = (() -> "");
                if (eatVar('-')) { // unary minus
                    LookAheadIndConst b = parseBase();
                    if (GotExpntNumFlag == true) {
                        if (IsAConstant(b.eval(), DiffWithRespTo)) {
                            x = (() -> "-" + (Double.parseDouble(b.eval())));
                        } else {
                            x = (() -> "-" + b.eval());
                        }
                        log.info("LookAheadIndConst:parseBase:Number:x.eval()=" + x.eval() + " posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst);
                    } else {
                        if (IsAConstant(b.eval(), DiffWithRespTo)) {
                            x = (() -> "" + (Double.parseDouble(b.eval())));
                        } else {
                            x = (() -> b.eval());
                        }
                        log.info("LookAheadIndConst:parseBase:Number:x.eval()=" + x.eval() + " posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst);
                    }
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadIndConst:parseBase:-:Return Value:x.eval()=" + x.eval());
                    }
                    return x;
                } else if (eatVar('+')) { // unary plus
                    //x = parseBase();
                    startPos = posIndConst;
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadIndConst:parseBase:+:Inside Value:x.eval()=" + x.eval());
                    }
                    //return x;
                }
                if ((IsNumber(chIndConst))) { //numbers
                    log.info("LookAheadIndConst:parseBase:Exponent:Number:posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst + " StrIndConst=" + StrIndConst.substring(startPos));
                    while ((IsNumber(chIndConst)) && (chIndConst != -1)) {
                        nextCharIndConst();
                        if ((chIndConst == 'E') || (chIndConst == 'e')) {
                            nextCharIndConst();
                            if ((chIndConst == '-') || (chIndConst == '+')) {
                                nextCharIndConst();
                            }
                        }

                    }
                    double xx = 1.0;
                    if ((GotExpntNumFlag == true) && (!TempIndConstBase.equalsIgnoreCase("")) && (posIndConst != -1) && (StrIndConst != null) && (!StrIndConst.equalsIgnoreCase("")) && (!StrIndConst.equalsIgnoreCase("NaN"))) {
                        log.info("LookAheadIndConst:parseBase:Expnt Num:Number:xx=" + xx + " posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst + " TrailConstantFlag=" + TrailConstantFlag + " ComplexAssignFlag=" + ComplexAssignFlag + " GotVariableFlag=" + GotVariableFlag);
                        if ((IsAConstant(StrIndConst.substring(startPos, posIndConst), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                            xx = Double.parseDouble(StrIndConst.substring(startPos, posIndConst));
                        }
                    } else if ((GotExpntNumFlag == true) && (!TempIndConstBase.equalsIgnoreCase("")) && (StrIndConst != null) && (!StrIndConst.equalsIgnoreCase("")) && (!StrIndConst.equalsIgnoreCase("NaN"))) {
                        log.info("LookAheadIndConst:parseBase:Expnt Num:Number:xx=" + xx + " posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst + " TrailConstantFlag=" + TrailConstantFlag + " ComplexAssignFlag=" + ComplexAssignFlag + " GotVariableFlag=" + GotVariableFlag);
                        if ((IsAConstant(StrIndConst.substring(startPos, posIndConst), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                            xx = Double.parseDouble(StrIndConst.substring(startPos));
                        }
                    } else if ((GotExpntNumFlag == false) && (TrailConstantFlag == false) && (startPos != posIndConst) && (posIndConst != -1) && (StrIndConst != null) && (!StrIndConst.equalsIgnoreCase("")) && (!StrIndConst.equalsIgnoreCase("NaN"))) {
                        if ((IsAConstant(StrIndConst.substring(startPos, posIndConst), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                            xx = Double.parseDouble(StrIndConst.substring(startPos, posIndConst));
                        }
                        log.info("LookAheadIndConst:parseBase:Trailing Constant:Number:xx=" + xx + " posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst + " TrailConstantFlag=" + TrailConstantFlag + " ComplexAssignFlag=" + ComplexAssignFlag + " GotVariableFlag=" + GotVariableFlag);
                    } else if ((GotExpntNumFlag == false) && (TrailConstantFlag == false) && (TempIndConstStrSet == false) && (startPos != posIndConst) && (posIndConst != -1) && (StrIndConst != null) && (!StrIndConst.equalsIgnoreCase("")) && (!StrIndConst.equalsIgnoreCase("NaN"))) {
                        if ((IsAConstant(StrIndConst.substring(startPos, posIndConst), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                            xx = Double.parseDouble(StrIndConst.substring(startPos, posIndConst));
                        }
                        log.info("LookAheadIndConst:parseBase:Base^:Number:xx=" + xx + " posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst + " TrailConstantFlag=" + TrailConstantFlag + " ComplexAssignFlag=" + ComplexAssignFlag + " GotVariableFlag=" + GotVariableFlag);
                    } else if ((GotExpntNumFlag == false) && (startPos != posIndConst) && (posIndConst != -1) && (StrIndConst != null) && (!StrIndConst.equalsIgnoreCase("")) && (!StrIndConst.equalsIgnoreCase("NaN"))) {
                        if ((IsAConstant(StrIndConst.substring(startPos, posIndConst), DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                            xx = Double.parseDouble(StrIndConst.substring(startPos, posIndConst));
                        }
                        log.info("LookAheadIndConst:parseBase:Base^:Number:xx=" + xx + " posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst + " TrailConstantFlag=" + TrailConstantFlag + " ComplexAssignFlag=" + ComplexAssignFlag + " GotVariableFlag=" + GotVariableFlag);
                    } else {
                        xx = 1.0;
                    }
                    log.info("LookAheadIndConst:parseBase:Number:xx=" + xx + " posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst + " GotExpntNumFlag=" + GotExpntNumFlag + " TrailConstantFlag=" + TrailConstantFlag + " ComplexAssignFlag=" + ComplexAssignFlag + " GotVariableFlag=" + GotVariableFlag);
                    final Double XX = xx;
                    if (XX >= 1.0) {
                        x = () -> "" + XX;
                    } else {
                        x = () -> "";
                    }
                    log.info("LookAheadIndConst:parseBase:Number:xx=" + xx + " posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst + " TrailConstantFlag=" + TrailConstantFlag + " ComplexAssignFlag=" + ComplexAssignFlag + " GotVariableFlag=" + GotVariableFlag);
                    if ((DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadIndConst:parseBase:Number:xx=" + xx + " posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst + " TrailConstantFlag=" + TrailConstantFlag + " ComplexAssignFlag=" + ComplexAssignFlag + " GotVariableFlag=" + GotVariableFlag);
                    }
                    return x;
                } else if (IsVariable(chIndConst)) {//functions & variables
                    int startPos1 = posIndConst;
                    if (startPos1 >= 0) ; else {
                        startPos1 = 0;
                    }
                    while (((IsVariable(chIndConst)) || (IsNumber(chIndConst))) && (chIndConst != -1)) {
                        nextCharIndConst();
                    }
                    String name = "";
                    boolean NumberAggragationFlag = false;
                    int TempstartPos = startPos;
                    if (posIndConst != -1) {
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadIndConst:parseBase:Variable:if:name=" + name + " startPos=" + startPos + " posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst);
                        }
                        if ((startPos >= 1) && (StrIndConst.charAt(startPos - 1) == '^')) {
                            while ((startPos >= 1) && (StrIndConst.charAt(startPos - 1) != '*') && (StrIndConst.charAt(startPos - 1) != '/')) {
                                startPos--;
                                if (IsNumber(StrIndConst.charAt(startPos))) {
                                    NumberAggragationFlag = true;
                                } else if ((NumberAggragationFlag) && (IsOperator(StrIndConst.charAt(startPos)) && (LAPreIndConstOperator == '^'))) {
                                    name = "" + Double.parseDouble(StrIndConst.substring(startPos + 1, TempstartPos - 1).trim()) + "^" + StrIndConst.charAt(TempstartPos);
                                }
                            }
                            if (name.equalsIgnoreCase("")) {
                                name = StrIndConst.substring(TempstartPos, posIndConst).trim();
                            }
                        }
                        if (name.equalsIgnoreCase("")) {
                            name = StrIndConst.substring(TempstartPos, posIndConst).trim();
                        }
                        //name = name + StrIndConst.substring(TempstartPos, posIndConst).trim();
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadIndConst:parseBase:Variable:if:End:name=" + name + " startPos=" + startPos + " posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst);
                        }
                    } else {
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadIndConst:parseBase:Variable:else:name=" + name + " startPos=" + startPos + " posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst);
                        }
                        if ((startPos >= 1) && (StrIndConst.charAt(startPos - 1) == '^')) {
                            while ((startPos >= 1) && (StrIndConst.charAt(startPos - 1) != '*') && (StrIndConst.charAt(startPos - 1) != '/')) {
                                startPos--;
                            }
                        }
                        name = StrIndConst.substring(startPos).trim();
                    }

                    log.info("LookAheadIndConst:parseBase:Variable:name=" + name + " posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst);
                    if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadIndConst:parseBase:Variable:name=" + name + " posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst);
                    }
                    if ((functionsSimple.containsKey(name)) && (!name.equalsIgnoreCase(DiffWithRespTo))) {
                        LookAheadIndConst arg = (() -> "");
                        log.info("LookAheadIndConst:parseBase:Function:name=" + name + " posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst);
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadIndConst:parseBase:Function:name=" + name + " posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst);
                        }
                        //eatVar('(');
                        ParenthesisFlag = true;
                        int tempAlignCharRead = posIndConst;
                        int oldposition = posIndConst;
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadIndConst:parseBase:Before extractAndClassifyFactors:chIndConst=" + (char) chIndConst + " posIndConst=" + posIndConst + " StrIndConst=" + StrIndConst.substring(posIndConst));
                        }
                        int numberofcharsread = 0;
                        if ((chIndConst == '(')&&(posIndConst < StrIndConst.length())&& (StrIndConst.substring(posIndConst).length() > 0) )
                            numberofcharsread=extractAndClassifyFactors(StrIndConst.substring(posIndConst), DiffWithRespTo, HideAllFlag);
                        //eatVar(')');
                        //posIndConst = posIndConst + numberofcharsread;
                        posIndConst = advanceOneTerm(StrIndConst, posIndConst);
                        if ((posIndConst >= 0) && (posIndConst < StrIndConst.length())) {
                            chIndConst = StrIndConst.charAt(posIndConst);
                        }
                        MyParenDecoded = "";
                        MyParenEncoded = "";
                        if (!otherTerms.isEmpty()) {
                            for (String str : otherTerms) {
                                int kpara = -1;
                                kpara = str.indexOf("(");
                                int kplus = -1;
                                kplus = str.indexOf("+");
                                int kminus = -1;
                                kminus = str.indexOf("-");
                                if ((str.contains("(")) && (str.contains(")")) && (!str.contains("+")) && (!str.contains("-"))) {
                                    str = str.replaceFirst("\\(", "").replaceFirst("\\)", "");
                                } else if ((str.contains("(")) && (str.contains(")")) && ((str.contains("+")) && (isUnarySign(str, kplus)))) {
                                    str = str.replaceFirst("\\(", "").replaceFirst("\\)", "").replaceFirst("\\+", "");
                                } else if ((str.contains("(")) && (str.contains(")")) && ((str.contains("-")) && (isUnarySign(str, kminus)))) {
                                    str = str.replaceFirst("\\(", "").replaceFirst("\\)", "").replaceFirst("\\-", "");
                                }
                                MyParenDecoded = MyParenDecoded + str;
                            }
                            if ((LAIndConstOperator == -1) && (MyParenDecoded.startsWith("/"))) {
                                LAIndConstOperator = '/';
                            } else if ((LAIndConstOperator == -1) && (MyParenDecoded.startsWith("*"))) {
                                LAIndConstOperator = '*';
                            } else {
                                LAIndConstOperator = '*';
                            }

                            if (MyParenDecoded.startsWith("-")) {
                                MyParenDecoded = MyParenDecoded.replaceFirst("\\-", "");
                            } else if (MyParenDecoded.startsWith("+")) {
                                MyParenDecoded = MyParenDecoded.replaceFirst("\\+", "");
                            } else if (MyParenDecoded.startsWith("*")) {
                                MyParenDecoded = MyParenDecoded.replaceFirst("\\*", "");
                            } else if (MyParenDecoded.startsWith("/")) {
                                MyParenDecoded = MyParenDecoded.replaceFirst("/", "");
                            }
                            if ((MyParenDecoded.contains("(")) && (MyParenDecoded.contains(")"))) {
                                MyParenDecoded = MyParenDecoded.replace("(", "").replace(")", "");
                            }
                            MyParenEncoded = MyParenDecoded;
                            if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                System.out.println("LookAheadIndConst:IndConst:String:" + StrIndConst.substring(oldposition) + " MapType=" + MapType + " MyParenEncoded=" + MyParenEncoded + " MyParenDecoded=" + MyParenDecoded + " StrIsAConstant=" + StrIsAConstant);
                                System.out.println("LookAheadIndConst:IndConst:numberofcharsread=" + numberofcharsread + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " tempAlignCharRead=" + tempAlignCharRead);
                            }
                        }
                        String Exprn = MyParenEncoded;//StrIndConst.substring(startPos1, posIndConst);
                        arg = (() -> Exprn);
                        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                            System.out.println("LookAheadIndConst:parseBase:Function:name=" + name + " Exprn=" + Exprn + " posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst);
                        }
                        //eatVar(')');
                        xTerms.clear();
                        otherTerms.clear();
                        ConstantTerms.clear();

                        final String MyFnStr = name;
                        final String MyStr = arg.eval();
                        log.info("LookAheadIndConst:parseBase:Function:arg.eval()=" + arg.eval() + " posVar=" + posVar + " chVar=" + (char) chVar);
                        if ((IsAConstant(Exprn, DiffWithRespTo))
                                && ((StrIsAConstant.equalsIgnoreCase("Number"))
                                || (StrIsAConstant.equalsIgnoreCase("NumberExpression")))) {
                            //x = (() -> MyFnStr + "(" + MyStr + ")");
                            depthBackUpRestore++;
                            StrKeyBackUpRestore = FileMathsBackUpRestore + "LookAheadIndConst:parseBase:NumberExpression";
                            System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET: LookAheadIndConst:Recursivecall:Start:Maths:Expression:Function" + " depthBackUpRestore=" + depthBackUpRestore + ConsoleColors.RESET);
                            Map<String, String> variablesBackupState = new HashMap<>();
                            BackupMathsStateAll(variablesBackupState);
                            ChaosPrevention();
                            MathsExpressionParser.Expression MyMappedSimple = MathsExpressionParser.parse(Exprn, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                            RestoreMathsStateAll(variablesBackupState);
                            System.out.println(ConsoleColors.GREEN + "VERBOSE IF SET: LookAheadIndConst:Recursivecall:Start:Maths:Expression:Function" + " depthBackUpRestore=" + depthBackUpRestore + ConsoleColors.RESET);
                            depthBackUpRestore--;
                            StrKeyBackUpRestore = FileMathsBackUpRestore;
                            x = (() -> MyFnStr + "(" + MyMappedSimple.eval() + ")");
                            log.info("LookAheadIndConst:parseBase:Function:Constant:arg.eval()=" + MyStr + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar);
                            //GotBracesVarFlag = true;
                            //ContainsFuncFlag = true;
                        } else if ((!IsAConstant(Exprn, DiffWithRespTo))
                                && ((StrIsAConstant.equalsIgnoreCase("Var"))
                                || (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {

                            log.info("LookAheadIndConst:parseBase:Function:Var:arg.eval()=" + MyStr + " TermOutput=" + TermOutput + " posVar=" + posVar + " chVar=" + (char) chVar);
                            //GotBracesVarFlag = true;
                            //ContainsFuncFlag = true;
                        } else if ((!IsAConstant(Exprn, DiffWithRespTo))
                                && ((StrIsAConstant.equalsIgnoreCase("IndConstant"))
                                || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {

                            if (!MyStr.equalsIgnoreCase("")) {
                                x = (() -> MyFnStr + "(" + Exprn + ")");
                            }
                        }
                    } else if ((name != null) && (!name.equalsIgnoreCase("")) && (!name.equalsIgnoreCase("NaN")) && (!name.equalsIgnoreCase("Infinity")) && (!name.equalsIgnoreCase(DiffWithRespTo))) {
                        final String MyStr = name;
                        x = () -> MyStr;
                    } else if ((name.equalsIgnoreCase("NaN")) || (name.equalsIgnoreCase("Infinity"))) {
                        ProLambdaExtr y = parseExpr("LookAheadIndConst", name, "1.0", "ProductRule", DiffWithRespTo, '*', "LowLevelRules");
                        final String MyStr = y.StrExpr();
                        x = () -> MyStr;
                    }
                    if ((!name.equalsIgnoreCase(DiffWithRespTo)) && (variables.containsKey(name))) {
                        //ContainsIndConstFlag = true;
                        //GotIndConstFlag = true;
                        //GotIndConstPos = startPos1;
                    } else if (ComplexAssignFlag == false) {
                        GotVariablePos = startPos1;
                        if ((startPos1 >= 2) && ((StrIndConst.charAt(startPos1 - 1) == '+') || (StrIndConst.charAt(startPos1 - 1) == '-'))) {
                            TermOperatorPos = startPos1 - 2;
                        } else if (startPos1 >= 1) {
                            TermOperatorPos = startPos1 - 1;
                        }
                        GotVariableFlag = true;
                        ComplexAssignFlag = true;
                    }
                    if ((DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                        System.out.println("LookAheadIndConst:parseBase:Variables:End:x.eval()=" + x.eval() + " posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst + " TrailConstantFlag=" + TrailConstantFlag + " ComplexAssignFlag=" + ComplexAssignFlag + " GotVariableFlag=" + GotVariableFlag);
                    }
                    return x;
                } else {
                    if (((IsNotAnOperator(chIndConst)) && ((!IsNumber(chIndConst)) && (!IsVariable(chIndConst)))) && (chIndConst != 0) && (chIndConst != -1) && (chIndConst != '(')) {
                        if ((StrIndConst != null) && (startPos < StrIndConst.length()) && (startPos < posIndConst) && (chIndConst != -1) && (chIndConst != 0)) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "LookAheadIndConst:parseBase:Unexpected: " + (char) chIndConst + " int=" + (int) chIndConst + " Cannot Format:" + StrIndConst.substring(posIndConst, StrIndConst.length()));
                        } else if ((chIndConst != -1) && (chIndConst != 0) && (posIndConst >= 1) && (posIndConst < StrIndConst.length()) && (IsNumber(chIndConst))) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "LookAheadIndConst:parseBase:Please Check Code:Should NOT reach Here:Unexpected: " + (char) chIndConst + " int=" + (int) chIndConst + " Cannot Format:" + StrIndConst.substring(posIndConst, StrIndConst.length()));
                        } else if ((chIndConst != -1) && (chIndConst != 0) && (posIndConst >= 1) && (posIndConst < StrIndConst.length()) && (IsOperator(chIndConst))) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "LookAheadIndConst:parseBase:Please Check Equation Operators:Should NOT reach Here:Unexpected: " + (char) chIndConst + " int=" + (int) chIndConst + " Cannot Format:" + StrIndConst.substring(posIndConst, StrIndConst.length()));
                        } else if ((chIndConst != -1) && (chIndConst != 0) && (posIndConst >= 1) && (posIndConst < StrIndConst.length())) {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "LookAheadIndConst:parseBase:Unexpected: " + (char) chIndConst + " int=" + (int) chIndConst + " Cannot Format:" + StrIndConst.substring(posIndConst, StrIndConst.length()));
                        } else {
                            throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "LookAheadIndConst:parseBase:Unexpected char: " + (char) chIndConst + " int=" + (int) chIndConst + " Cannot Format:" + StrIndConst.substring(posIndConst, StrIndConst.length()));
                        }
                    }
                    return x;
                }
            }
        }.parseIndConst();
    }
//Created by Rajesh Pai
// Simplifies Terms with multiplication by Zero: x*0.0=0 OR/And One:x*1.0 = x And/OR addition of Zero: x+0.0=x
//Copyright (c) 2018 by Rajesh V. Pai

    @FunctionalInterface
    public interface SimpleExpression {

        String SimpleExpr();
    }

    public static SimpleExpression parseSimple(String str, Map<String, Double> variables, String DiffWithRespTo, String MapType, String IntegrORDiffr, boolean HideAllFlag, String Silent, LogLevel MyLogLevel) {

        return new Object() {

            SimpleExpression parseSimple() {
                ResetVars("ResetSimpleExpr");
                MyFuncSimple();
                ResetVars("ResetControlVars");
                Str = str;
                pos = -1;
                ch = -1;
                if ((pos >= 0) && (pos < Str.length())) {
                    ch = Str.charAt(pos);
                }
                NumCoeff = 0;

                ParenthesisFlag = false;
                NormalNotPareFlag = true;
                SavedOperator = 0;
                SimpleExpression x = (() -> "");
                if ((str == null) || (str.equalsIgnoreCase(""))) {
                    return x;
                }
                if ((ch == 0) || (ch == -1)) {
                    ch = str.charAt(0);
                    pos = 0;
                }
                String OutputExprn = "";
                int startpos = pos;
                if ((Str != null) && (Str.length() > 0)
                        && (Str.length() < 2)
                        && ((ch == '*')
                        || (ch == '/')
                        || (ch == '^'))) {
                    return x;
                } else {
                    x = parseTermSimple();
                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                        System.out.println("Simple:parseSimple:Final Before Map:x.eval()=" + x.SimpleExpr() + " chTermSign=" + chTermSign + " StrTerm=" + StrTerm);
                        System.out.println("Simple:parseSimple:Final Before Map:chSign=" + (char) chSign + " posSign=" + posSign + " StrSign=" + StrSign);
                    }
                }
                log.info("Simple:parseSimple:x.SimpleExpr()=" + x.SimpleExpr());
                if (x.SimpleExpr().contains("--")) {
                    OutputExprn = x.SimpleExpr().replaceAll("--", "-");
                    final String FinalOutput = OutputExprn;
                    x = (() -> FinalOutput);
                }
                if (x.SimpleExpr().contains("++")) {
                    OutputExprn = x.SimpleExpr().replaceAll("\\+\\+", "+");
                    final String FinalOutput = OutputExprn;
                    x = (() -> FinalOutput);
                }
                if (x.SimpleExpr().contains("+-")) {
                    OutputExprn = x.SimpleExpr().replaceAll("\\+-", "-");
                    final String FinalOutput = OutputExprn;
                    x = (() -> FinalOutput);
                }
                if (x.SimpleExpr().startsWith("+")) {
                    OutputExprn = x.SimpleExpr().replaceFirst("\\+", "");
                    final String FinalOutput = OutputExprn;
                    x = (() -> FinalOutput);
                }
                if (x.SimpleExpr().contains(" ")) {
                    OutputExprn = x.SimpleExpr().replaceAll("\\s", "");
                    final String FinalOutput = OutputExprn;
                    x = (() -> FinalOutput);
                }
                log.info("Simple:parseSimple:x.SimpleExpr()=" + x.SimpleExpr());
//                if ((pos != -1)&&(str != null)&&(!str.equalsIgnoreCase(""))&&(pos <= str.length())) {
//                    throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "Simple:parse:Unexpected: " + (char) ch + " int=" + (int) ch + " pos=" + pos + " str=" + str.substring(pos, str.length()));
//                }
                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                    System.out.println("Simple:parseSimple:Final Map:x.eval()=" + x.SimpleExpr() + " chTermSign=" + chTermSign + " StrTerm=" + StrTerm);
                    System.out.println("Simple:parseSimple:Final Map:chSign=" + (char) chSign + " posSign=" + posSign + " StrSign=" + StrSign);
                }
                return x;
            }

            //Grammar:
            //Parenthesis = '(' expression ')' | function '(' expression ')'
            //expression = term | expression '+' term |expression '-' term
            //term = factor | term '*' factor | term '/' factor
            //factor = base | base ^ base
            //base = '-' base | '+' base | number | identifier |function expression | '(' expression ')'
            //
            SimpleExpression parseTermSimple() {
                log.info("SimpleExpression:parseTermSimple:Topmost:pos=" + pos + " ch=" + (char) ch + " ch=" + ch);
                SimpleExpression x = (() -> "");
                String xExprn = "";
                SimpleExpression a = (() -> "");
                SimpleExpression b = (() -> "");
                SimpleTerm u = (() -> "");

                for (;;) {
                    if ((ch != -1) && (ch != 0)) {
                        a = x;
                        if ((pos >= 0) && (pos < Str.length())) {
                            log.info("Simple:parseTermSimple:Begining:Str=" + Str.substring(pos) + " pos=" + pos + " ch=" + (char) ch);
                        }
                        String Exprn = "";
                        if ((pos >= 0) && (pos < Str.length())) {
                            Exprn = Str.substring(pos, Str.length());
                        }
                        u = parseSimpleTerm(Exprn, pos, variables, DiffWithRespTo, MapType, IntegrORDiffr, HideAllFlag);
                        final String Term1 = a.SimpleExpr();
                        final String Term2 = u.SimpleTerm();
                        log.info("Simple:parseTermSimple:a.SimpleTerm()=" + Term1);
                        log.info("Simple:parseTermSimple:u.SimpleTerm()=" + Term2);
                        if ((Term1.equalsIgnoreCase("")) || (Term1.equalsIgnoreCase("0.0")) || (Term1.equalsIgnoreCase("0")) || (Term1.equalsIgnoreCase("-0.0")) || (Term1.equalsIgnoreCase("-0")) || (Term1.equalsIgnoreCase("+0.0")) || (Term1.equalsIgnoreCase("+0"))) {
                            if ((!Term2.equalsIgnoreCase("0.0")) && (!Term2.equalsIgnoreCase("-0.0")) && (!Term2.equalsIgnoreCase("+0.0")) && (!Term2.equalsIgnoreCase("0")) && (!Term2.equalsIgnoreCase("-0")) && (!Term2.equalsIgnoreCase("+0"))) {
                                x = (() -> Term2);
                            } else {
                                x = (() -> "");
                            }
                            log.info("Simple:parseTermSimple:if:x.SimpleExpr()=" + x.SimpleExpr() + " pos=" + pos + " ch=" + (char) ch + " SavedOperator=" + (char) SavedOperator);
                        } else if (((!Term1.equalsIgnoreCase("")) && (!Term1.equalsIgnoreCase("0.0")) && (!Term1.equalsIgnoreCase("0")) && (!Term1.equalsIgnoreCase("-0.0")) && (!Term1.equalsIgnoreCase("-0")) && (!Term1.equalsIgnoreCase("+0.0")) && (!Term1.equalsIgnoreCase("+0")))
                                && ((!Term2.equalsIgnoreCase("0.0")) && (!Term2.equalsIgnoreCase("-0.0")) && (!Term2.equalsIgnoreCase("+0.0")) && (!Term2.equalsIgnoreCase("0")) && (!Term2.equalsIgnoreCase("-0")) && (!Term2.equalsIgnoreCase("+0")))) {
                            x = (() -> Term1 + Term2);
                            log.info("Simple:parseTermSimple:elseif:x.SimpleExpr()=" + x.SimpleExpr() + " pos=" + pos + " ch=" + (char) ch + " SavedOperator=" + (char) SavedOperator);
                        }
                        log.info("Simple:parseTermSimple:Return From Inside Loop parseTermSimple:x.SimpleExpr()=" + x.SimpleExpr() + " pos=" + pos + " ch=" + (char) ch);
                        log.info("Simple:parseTermSimple:Return From Inside Loop parseTermSimple:Term1=" + Term1);
                        log.info("Simple:parseTermSimple:Return From Inside Loop parseTermSimple:Term2=" + Term2);
                        if (SuperDevelopmentFlag) {
                            //if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println(ConsoleColors.BLUE + "Simple:parseTermSimple:Return From Inside Loop parseTermSimple:x.SimpleExpr()=" + x.SimpleExpr() + " pos=" + pos + " ch=" + (char) ch + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + ConsoleColors.RESET);
                            System.out.println(ConsoleColors.BLUE + "Simple:parseTermSimple:Return From Inside Loop parseTermSimple:Term1=" + Term1 + ConsoleColors.RESET);
                            System.out.println(ConsoleColors.BLUE + "Simple:parseTermSimple:Return From Inside Loop parseTermSimple:Term2=" + Term2 + ConsoleColors.RESET);
                        }
                    } else {
                        log.info("Simple:parseTermSimple:Return Value:x.SimpleExpr()=" + x.SimpleExpr() + " pos=" + pos + " ch=" + (char) ch + " ch=" + ch + " SavedOperator=" + (char) SavedOperator + " SavedOperator=" + SavedOperator);
                        log.info("Simple:parseTermSimple:Return Value:xExprn=" + xExprn);
                        return x;
                    }
                }
            }

        }.parseSimple();
    }
//Created by Rajesh Pai
// Simplifies Terms with multiplication/division :
//Copyright (c) 2018 by Rajesh V. Pai

    @FunctionalInterface
    public interface SimpleTerm {

        String SimpleTerm();
    }

    public static SimpleTerm parseSimpleTerm(String strTerm, int StartPos, Map<String, Double> variables, String DiffWithRespTo, String MapType, String IntegrORDiffr, boolean HideAllFlag) {
        return new Object() {
            public void nextCharTerm() {
                ++posTerm;
                chTerm = (posTerm < StrTerm.length()) ? StrTerm.charAt(posTerm) : -1;
                if ((chTerm == -1) && (posTerm >= StrTerm.length())) {
                    posTerm = StrTerm.length();
                } else if ((chTerm == -1) || ((chTerm == 0))) {
                    throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "SimpleTerm:nextCharTerm:Unexpected: " + (char) chTerm + " int=" + (int) chTerm + " Cannot Format:" + StrTerm.substring(posTerm, StrTerm.length()));
                }
            }

            boolean eatTerm(int CharToEat) {
                while (chTerm == ' ') {
                    nextCharTerm();
                }
                if (chTerm == CharToEat) {
                    nextCharTerm();
                    return true;
                }
                return false;
            }

            String eatTermAll(String Temp, int CharToEat) {
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

            SimpleTerm parsesimpleterm() {
                ResetVars("ResetSimpleTerm");
                MyFuncSimple();
                ParenthesisFlag = false;
                NormalNotPareFlag = true;
                SavedOperator = 0;
                ComplexAssignFlag = false;
                TrailConstantFlag = false;
                timesLoop = 0;
                StrTerm = strTerm;
                LastExpr = "";
                log.info("SimpleTerm:parseSimpleTerm:Topmost:pos=" + pos + " ch=" + (char) ch + " ch=" + ch + " StrTerm=" + StrTerm);
                String OutputExprn = "";
                int startpos = pos;
                SimpleTerm x = (() -> "");
                if ((Str != null) && (pos < Str.length())) {
                    posTerm = -1;
                    if (strTerm.length() >= 1) {
                        chTerm = strTerm.charAt(0);
                    }
                    posVar = -1;
                    chVar = -1;
                    posLA = -1;
                    chLA = -1;
                    GotVariablePos = -1;
                    GotIndConstPos = -1;
                    GotBracesVarFlag = false;
                    GotIndConstFlag = false;
                    TrailConstantFlag = false;
                    ContainsIndConstFlag = false;
                    FunctionStr = "";
                } else {
                    posTerm = -1;
                    chTerm = -1;
                    pos = -1;
                    ch = -1;
                    posVar = -1;
                    chVar = -1;
                    posLA = -1;
                    chLA = -1;
                    GotVariablePos = -1;
                    GotIndConstPos = -1;
                    GotBracesVarFlag = false;
                    GotIndConstFlag = false;
                    TrailConstantFlag = false;
                    ContainsIndConstFlag = false;
                    FunctionStr = "";
                    x = (() -> "");
                    return x;
                }
                if (posTerm >= 0) {
                    log.info("SimpleTerm:parseSimple:StrTerm=" + StrTerm.substring(posTerm) + " posTerm=" + posTerm + " chTerm=" + (char) chTerm);
                }
                log.info("SimpleTerm:parseSimpleTerm:Before LookAheadSign:pos=" + pos + " ch=" + (char) ch + " ch=" + ch + " StrTerm=" + StrTerm);
                ParseLog("SimpleTerm", "parseSimple", "Initial", "StrTerm", StrTerm);
                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                    System.out.println("SimpleTerm:parseTermSimple:parseSign:Entered parseSign Processing Zone:");
                }
                LookAheadSign y = parseSign(StrTerm, startpos, DiffWithRespTo, HideAllFlag);
                ParseLog("SimpleTerm", "parseSimple", "Initial", "StrTerm", StrTerm);
                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                    System.out.println("SimpleTerm:parseTermSimple:parseSign:Exit parseSign Processing Zone:");
                    System.out.println("SimpleTerm:parseSimpleTerm:Entered Atomic Term Processing Zone:StrTerm=" + StrTerm);
                }
                x = parseExpressionSimple();
                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                    System.out.println(ConsoleColors.BLUE + "SimpleTerm:parseTermSimple:Exit parseTermSimple:InputExpression:Atomic Term:strTerm=" + strTerm + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.BLUE + "SimpleTerm:parseTermSimple:Exit parseTermSimple:OutputExpression:Atomic Term:parseTermSimple=" + x.SimpleTerm() + ConsoleColors.RESET);
                }
                if ((LastExpr != null) && (!LastExpr.equalsIgnoreCase("LookAheadParen"))) {
                    ParseMapAPI("SimpleTerm:Max:parseSimple", StrTerm.length(), 0, 0, DiffWithRespTo);
                    ParseLog("SimpleTerm", "parseSimple", "Final", "StrTerm", StrTerm);
                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                        System.out.println(ConsoleColors.BLUE + "SimpleTerm:parseTermSimple:LastExpr:ParseMapAPI:posTerm=" + posTerm + " chTerm=" + (char) chTerm + ConsoleColors.RESET);
                    }
                }
                if ((startpos == 0) && (chTermSign == '+') && (!x.SimpleTerm().equalsIgnoreCase(""))) {
                    final String FinalOutput = x.SimpleTerm();
                    x = (() -> FinalOutput);
                } else if (!x.SimpleTerm().equalsIgnoreCase("")) {
                    final String FinalOutput = x.SimpleTerm();
                    if ((chTermSign != -1) && (chTermSign != 0) && ((chTermSign == '+') || (chTermSign == '-'))) {
                        x = (() -> (char) chTermSign + FinalOutput);
                    } else if ((chTermSign == -1) || (chTermSign == 0)) {
                        x = (() -> "+" + FinalOutput);
                    }//Need Better logic to handle '*' && '/' in chTermSign
                    else {
                        x = (() -> "");
                    }
                } else {
                    x = (() -> "");
                }
                GotVariablePos = -1;
                GotIndConstPos = -1;
                TrailConstantFlag = false;
                GotIndConstFlag = false;
                GotVariableFlag = false;
                ContainsIndConstFlag = false;
                log.info("SimpleTerm:parseSimple:With Sign:x.SimpleTerm()=" + x.SimpleTerm());
                if (x.SimpleTerm().contains("--")) {
                    OutputExprn = x.SimpleTerm().replaceAll("--", "-");
                    final String FinalOutput = OutputExprn;
                    x = (() -> FinalOutput);
                }
                if (x.SimpleTerm().contains("++")) {
                    OutputExprn = x.SimpleTerm().replaceAll("\\+\\+", "+");
                    final String FinalOutput = OutputExprn;
                    x = (() -> FinalOutput);
                }
                log.info("SimpleTerm:parseSimple:Final:posTerm=" + posTerm + " startpos=" + startpos + " chTerm=" + (char) chTerm + " ComplexAssignFlag=" + ComplexAssignFlag);
                log.info("SimpleTerm:parseSimple:Final:pos=" + pos + " ch=" + (char) ch);
                log.info("SimpleTerm:parseSimple:strTerm=" + strTerm);
                log.info("SimpleTerm:parseSimple:x.SimpleTerm()=" + x.SimpleTerm());

                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                    System.out.println(ConsoleColors.BLUE + "SimpleTerm:parseSimple:Atomic Final:strTerm=" + strTerm + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.BLUE + "SimpleTerm:parseSimple:Atomic Final:x.SimpleTerm()=" + x.SimpleTerm() + ConsoleColors.RESET);
                }
//                if ((pos != -1)&&(str != null)&&(!str.equalsIgnoreCase(""))&&(pos <= str.length())) {
//                    throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "SimpleTerm:Simple:parse:Unexpected: " + (char) ch + " int=" + (int) ch + " pos=" + pos + " str=" + str.substring(pos, str.length()));
//                }
                return x;
            }

            SimpleTerm parseExpressionSimple() {
                log.info("SimpleTerm:parseExpressionSimple:Topmost:posTerm=" + posTerm + " chTerm=" + (char) chTerm + " chTerm=" + chTerm);
                String xExprn = "";
                String OutputExprn = "";
                log.info("SimpleTerm:parseExpressionSimple:Initial:posTerm=" + posTerm + " chTerm=" + (char) chTerm + " chTerm=" + chTerm);
                SimpleTerm x = (() -> "");
                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                    System.out.println("SimpleTerm:parseExpressionSimple:Entered Atomic Expression Processing Zone:");
                }
                x = parseTermSimple();
                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                    System.out.println("SimpleTerm:parseExpressionSimple:Exited Atomic Expression Processing Zone:x=" + x.SimpleTerm());
                }
                log.info("SimpleTerm:parseExpressionSimple:x.SimpleTerm()=" + x.SimpleTerm());
                log.info("SimpleTerm:parseExpressionSimple:Return From Inside Loop parseExpressionSimple:x.SimpleTerm()=" + x.SimpleTerm() + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " SavedOperator=" + (char) SavedOperator);
                log.info("SimpleTerm:parseExpressionSimple:Return From Inside Loop parseExpressionSimple:ParenthesisFlag=" + ParenthesisFlag + " NormalNotPareFlag=" + NormalNotPareFlag + " chTerm=" + (char) chTerm);
                log.info("SimpleTerm:parseExpressionSimple:Return From Inside Loop parseExpressionSimple:x.SimpleTerm()=" + x.SimpleTerm() + " xExprn=" + xExprn);
                return x;
            }

            SimpleTerm parseTermSimple() {
                log.info("SimpleTerm:parseTermSimple:Topmost:posTerm=" + posTerm + " ch=" + (char) chTerm + " chTerm=" + chTerm);
                int TermStartPos = -1;
                int TermEndPos = 0;
                if (posTerm >= 0) {
                    TermStartPos = posTerm;
                } else if (posTerm < 0) {
                    TermStartPos = 0;
                }
                SimpleTerm x = (() -> "");
                SimpleTerm a = (() -> "");
                SimpleTerm b = (() -> "");
                MyParenEncoded = "";
                MyParenDecoded = "";
                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                    System.out.println("SimpleTerm:parseTermSimple:Entered Term Processing Zone:");
                }
                x = parseBaseSimpleOld();
                IsAConstant(x.SimpleTerm(), DiffWithRespTo);
                if (SuperDevelopmentFlag) {
                    System.out.println(ConsoleColors.BLUE + "SimpleTerm:parseTermSimple:Initial:StrIsAConstant=" + StrIsAConstant + " x.SimpleTerm()=" + x.SimpleTerm() + ConsoleColors.RESET);
                }
                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                    System.out.println("SimpleTerm:parseTermSimple:Exit Term Processing Zone:");
                }
                return x;
            }

            SimpleTerm parseBaseSimpleOld() {
                log.info("SimpleTerm:parseBaseSimpleOld:Topmost:posTerm=" + posTerm + " chTerm=" + (char) chTerm + " chTerm=" + chTerm);
                int startPos = posTerm;
                if (startPos >= 0) ; else {
                    startPos = 0;
                }
                boolean ConstantFlag = false;
                boolean VariableFlag = false;
                boolean IndConstFlag = false;
                boolean BracesFlag = false;
                MyParenDecoded = "";
                MyParenEncoded = "";
                LastExpr = "";
                SimpleTerm x = (() -> "0.0");
                SimpleTerm Const = (() -> "0.0");
                SimpleTerm Variable = (() -> "0.0");
                SimpleTerm IndConst = (() -> "0.0");
                SimpleTerm Braces = (() -> "");
                String ConstStr = "0.0";
                String VarStr = "0.0";
                String IndConstStr = "0.0";
                String BracesStr = "";
                //SimpleExpression BraceSimplified = (() -> "");

                if ((chTerm == '-')) { // unary minus
                    if (posTerm == -1) {
                        log.info("SimpleTerm:parseBaseSimpleOld:-:BracesFlag=" + BracesFlag + " GotBracesVarFlag=" + GotBracesVarFlag + " chTerm=" + (char) chTerm + " startPos=" + startPos + " posTerm=" + posTerm + " GotBracesCount=" + GotBracesCount + " GotBracesCountCurr=" + GotBracesCountCurr);
                        nextCharTerm();
                        nextCharTerm();
                        log.info("SimpleTerm:parseBaseSimpleOld:-:BracesFlag=" + BracesFlag + " GotBracesVarFlag=" + GotBracesVarFlag + " chTerm=" + (char) chTerm + " startPos=" + startPos + " posTerm=" + posTerm + " GotBracesCount=" + GotBracesCount + " GotBracesCountCurr=" + GotBracesCountCurr);

                    } else {
                        log.info("SimpleTerm:parseBaseSimpleOld:-:BracesFlag=" + BracesFlag + " GotBracesVarFlag=" + GotBracesVarFlag + " chTerm=" + (char) chTerm + " startPos=" + startPos + " posTerm=" + posTerm + " GotBracesCount=" + GotBracesCount + " GotBracesCountCurr=" + GotBracesCountCurr);
                        nextCharTerm();

                    }
                    log.info("SimpleTerm:parseBaseSimpleOld:-:chTerm=" + (char) chTerm + " startPos=" + startPos + " posTerm=" + posTerm);
                    SimpleTerm b = (() -> "0.0");
                    b = parseBaseSimpleOld();
                    final String MyStr = b.SimpleTerm();
                    if ((IsAConstant(MyStr, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number"))) {
                        x = (() -> "" + (Double.parseDouble(MyStr)));
                    } else {
                        x = (() -> MyStr);
                    }
                    log.info("SimpleTerm:parseBaseSimpleOld:-:startPos=" + startPos + " x.SimpleTerm()=" + x.SimpleTerm() + " chTerm=" + (char) chTerm + " posTerm=" + posTerm);
                    return x;
                } else if ((chTerm == '+')) { // unary plus
                    log.info("SimpleTerm:parseBaseSimpleOld:+:chTerm=" + (char) chTerm + " posTerm=" + posTerm);
                    if (posTerm == -1) {
                        log.info("SimpleTerm:parseBaseSimpleOld:+:BracesFlag=" + BracesFlag + " GotBracesVarFlag=" + GotBracesVarFlag + " chTerm=" + (char) chTerm + " startPos=" + startPos + " posTerm=" + posTerm + " GotBracesCount=" + GotBracesCount + " GotBracesCountCurr=" + GotBracesCountCurr);
                        nextCharTerm();
                        nextCharTerm();
                        log.info("SimpleTerm:parseBaseSimpleOld:+:BracesFlag=" + BracesFlag + " GotBracesVarFlag=" + GotBracesVarFlag + " chTerm=" + (char) chTerm + " startPos=" + startPos + " posTerm=" + posTerm + " GotBracesCount=" + GotBracesCount + " GotBracesCountCurr=" + GotBracesCountCurr);
                    } else {
                        log.info("SimpleTerm:parseBaseSimpleOld:+:BracesFlag=" + BracesFlag + " GotBracesVarFlag=" + GotBracesVarFlag + " chTerm=" + (char) chTerm + " startPos=" + startPos + " posTerm=" + posTerm + " GotBracesCount=" + GotBracesCount + " GotBracesCountCurr=" + GotBracesCountCurr);
                        nextCharTerm();
                    }
                    log.info("SimpleTerm:parseBaseSimpleOld:+:chTerm=" + (char) chTerm + " posTerm=" + posTerm);
                    startPos = posTerm;
                    if (startPos >= 0) ; else {
                        startPos = 0;
                    }
                }
                timesLoop = 0;
                int NoFSMFlag = 0;
                log.info("SimpleTerm:parseBaseSimpleOld:Begining while Loop:Number:timesLoop=" + timesLoop + " startPos=" + startPos + " posTerm=" + posTerm + " strTerm.length()=" + strTerm.length());
                while ((timesLoop <= 3) && (StrTerm.length() > 0)) {
                    if (SuperDevelopmentFlag) {
                        System.out.println(ConsoleColors.BLUE + "SimpleTerm:parseBaseSimpleOld:Loop Begining:StrTerm=" + StrTerm + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " timesLoop=" + timesLoop + ConsoleColors.RESET);
                    }
                    if ((chTerm == '*') || (chTerm == '/') || (chTerm == '^')) {
                        nextCharTerm();
                        if ((DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println(ConsoleColors.BLUE + "SimpleTerm:parseBaseSimpleOld:Operator:Loop Begining:Should Enter Constant OR Var OR IndConstant Processing Zone:Con=" + IsNumber(chTerm) + ":Var=" + (IsVariable(chTerm)) + ":IndConstant=" + IsIndConstant(chTerm) + " BracesFlag=" + BracesFlag + " chTerm=" + (char) chTerm + " posTerm=" + posTerm + " timesLoop=" + timesLoop + ConsoleColors.RESET);
                        }
                    }
                    if ((posTerm >= 0) && (posTerm < StrTerm.length())) {
                        log.info("SimpleTerm:parseBaseSimpleOld:Loop Begining:StrTerm(posTerm)=" + StrTerm.substring(posTerm) + " posTerm=" + posTerm + " chTerm=" + (char) chTerm);
                        log.info("SimpleTerm:parseBaseSimpleOld:Loop Begining:chTerm=" + (char) chTerm + " posTerm=" + posTerm + " timesLoop=" + timesLoop + " BracesFlag=" + BracesFlag + " ConstantFlag=" + ConstantFlag + " VariableFlag=" + VariableFlag + " ComplexAssignFlag=" + ComplexAssignFlag + " TrailConstantFlag=" + TrailConstantFlag);
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println(ConsoleColors.BLUE + "SimpleTerm:parseBaseSimpleOld:Loop Begining:StrTerm(posTerm)=" + StrTerm.substring(posTerm) + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " timesLoop=" + timesLoop + ConsoleColors.RESET);
                            System.out.println(ConsoleColors.BLUE + "SimpleTerm:parseBaseSimpleOld:Loop Begining:chTerm=" + (char) chTerm + " posTerm=" + posTerm + " timesLoop=" + timesLoop + " ParenthesisFlag=" + ParenthesisFlag + " BracesFlag=" + BracesFlag + " ConstantFlag=" + ConstantFlag + " VariableFlag=" + VariableFlag + " ComplexAssignFlag=" + ComplexAssignFlag + " TrailConstantFlag=" + TrailConstantFlag + ConsoleColors.RESET);
                        }
                    }

                    //Numbers -> LookAheadConst
                    if ((ConstantFlag == false) && (NumberSearch(MapType, ConstantFlag, VariableFlag, BracesFlag))) { //numbers
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("SimpleTerm:parseBaseSimpleOld:Initial:Entered Constant Processing Zone:posTerm=" + posTerm + " chTerm=" + (char) chTerm + " timesLoop=" + timesLoop + " LastExpr=" + LastExpr);
                        }
                        int startPos1 = posTerm;
                        if (startPos1 >= 0) ; else {
                            startPos1 = 0;
                        }
                        //if((startPos1 > -1)&&(startPos1 < strTerm.length())){
                        log.info("SimpleTerm:parseBaseSimpleOld:Begining while Loop:Number:StrTerm=" + StrTerm.substring(startPos1) + " startPos1=" + startPos1 + " startPos=" + startPos + " posTerm=" + posTerm + " StrTerm.length()=" + StrTerm.length());

                        log.info("SimpleTerm:parseBaseSimpleOld:Number:xx=" + StrTerm.substring(startPos1) + " startPos1=" + startPos1 + " posTerm=" + posTerm);
                        //}
                        LookAheadConst MyCoeff;
                        String xConst = "";
                        MyCoeff = parseLA(StrTerm.substring(startPos1), startPos1, variables, DiffWithRespTo, true, HideAllFlag);
                        xConst = "" + MyCoeff.eval();
                        log.info("SimpleTerm:parseBaseSimpleOld:Number:MyCoeff=" + xConst + " timesLoop=" + timesLoop + " ContainsIndConstFlag=" + ContainsIndConstFlag);
                        final String ConsolidatedConstTerm = xConst;
                        Const = () -> ConsolidatedConstTerm;
                        ConstantFlag = true;

                        if (ConstantFlag) {
                            ConstStr = Const.SimpleTerm();
                        }
                        log.info("SimpleTerm:parseBaseSimpleOld:Number:Constant:Const.SimpleTerm()=" + Const.SimpleTerm() + " LATermOperator=" + (char) LATermOperator + " pos=" + pos + " ch=" + (char) ch + " SavedOperator=" + (char) SavedOperator + " ComplexAssignFlag=" + ComplexAssignFlag);
                        LastExpr = "LookAheadConst";
                        TrailConstantFlag = false;
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("SimpleTerm:parseBaseSimpleOld::Exit Constant Processing Zone:Const=" + Const.SimpleTerm());
                        }
                    } //Variables -> LookAheadVar
                    else if ((VariableFlag == false) && (VarSearch(ConstantFlag, VariableFlag, BracesFlag))) {//functions & variables
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("SimpleTerm:parseBaseSimpleOld::Entered LookAheadVar Processing Zone:posTerm=" + posTerm + " chTerm=" + (char) chTerm + " timesLoop=" + timesLoop + " LastExpr=" + LastExpr);
                        }
                        int startPos1 = posTerm;
                        if (startPos1 >= 0) ; else {
                            startPos1 = 0;
                        }
                        log.info("SimpleTerm:parseBaseSimpleOld:Begining while Loop:Variable:StrTerm=" + StrTerm.substring(startPos) + " startPos=" + startPos + " posTerm=" + posTerm + " StrTerm.length()=" + StrTerm.length());
                        log.info("SimpleTerm:parseBaseSimpleOld:Variable:StrTerm=" + StrTerm.substring(startPos) + " startPos=" + startPos + " posTerm=" + posTerm + " StrTerm.length()=" + StrTerm.length());

                        LookAheadVar MyCoeff;
                        MyCoeff = parseVar(StrTerm.substring(startPos1), variables, DiffWithRespTo, MapType, IntegrORDiffr, HideAllFlag);
                        String name = MyCoeff.eval();
                        log.info("SimpleTerm:parseBaseSimpleOld:Variable:name=" + name + " timesLoop=" + timesLoop + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " SavedOperator=" + (char) SavedOperator + " LookAheadOperator=" + (char) LookAheadOperator + " ComplexAssignFlag=" + ComplexAssignFlag);
                        if (!name.equalsIgnoreCase("")) {
                            Variable = () -> (name);
                            VariableFlag = true;
                            if (VariableFlag) {
                                VarStr = Variable.SimpleTerm();
                                if (VarStr.equalsIgnoreCase(DiffWithRespTo)) {
                                    VarStr = "1.0";
                                }
                            }
                        } else {
                            Variable = () -> "";
                            VarStr = "";
                            VariableFlag = false;
                        }
                        log.info("SimpleTerm:parseBaseSimpleOld:Variable:Variable.SimpleTerm()=" + Variable.SimpleTerm() + " LATermOperator=" + (char) LATermOperator + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " SavedOperator=" + (char) SavedOperator + " ComplexAssignFlag=" + ComplexAssignFlag);

                        LastExpr = "LookAheadVar";
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("SimpleTerm:parseBaseSimpleOld::Exit LookAheadVar Processing Zone:Var=" + Variable.SimpleTerm() + " name=" + name);
                        }
                    } //Independent Constant -> LookAheadIndConst
                    else if (((IsIndConstant(chTerm)) && (timesLoop == 0) && (ContainsIndConstFlag == true) && (IndConstFlag == false))
                            || ((IsIndConstant(chTerm)) && (timesLoop == 1) && (ContainsIndConstFlag == true) && (IndConstFlag == false))
                            || ((timesLoop == 2) && (ContainsIndConstFlag == true) && (IndConstFlag == false))
                            || ((timesLoop == 3) && (ContainsIndConstFlag == true) && (IndConstFlag == false))
                            || ((IsIndConstant(chTerm)) /*&& (LastExpr.equalsIgnoreCase("LookAheadVar"))*/)) {//Independent Constant variables
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("SimpleTerm:parseBaseSimpleOld::Entered LookAheadIndConst Processing Zone:posTerm=" + posTerm + " chTerm=" + (char) chTerm + " timesLoop=" + timesLoop + " LastExpr=" + LastExpr);
                        }
                        int startPos1 = posTerm;
                        if (startPos1 >= 0) ; else {
                            startPos1 = 0;
                        }
                        log.info("SimpleTerm:parseBaseSimpleOld:Begining while Loop:IndConst:StrTerm=" + StrTerm.substring(startPos1) + " startPos1=" + startPos1 + " posTerm=" + posTerm + " StrTerm.length()=" + StrTerm.length());

                        log.info("SimpleTerm:parseBaseSimpleOld:IndConst:StrTerm=" + StrTerm.substring(startPos1) + " startPos1=" + startPos1 + " posTerm=" + posTerm + " StrTerm.length()=" + StrTerm.length());

                        LookAheadIndConst MyCoeff;
                        //variables.put(DiffWithRespTo, DiffWithRespTo);
                        MyCoeff = parseIndConst(StrTerm.substring(startPos1), DiffWithRespTo, MapType, IntegrORDiffr, HideAllFlag);
                        String name = MyCoeff.eval();
                        log.info("SimpleTerm:parseBaseSimpleOld:IndConst:name=" + name + " timesLoop=" + timesLoop + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " SavedOperator=" + (char) SavedOperator + " LookAheadOperator=" + (char) LookAheadOperator + " ComplexAssignFlag=" + ComplexAssignFlag);

                        if (!name.equalsIgnoreCase("")) {
                            IndConst = () -> (name);
                            IndConstFlag = true;
                            if (IndConstFlag) {
                                IndConstStr = IndConst.SimpleTerm();
                            }
                        } else {
                            IndConst = () -> "";
                            IndConstStr = "";
                            IndConstFlag = false;
                        }
                        LastExpr = "LookAheadIndparseBaseSimpleOldConst";
                        log.info("SimpleTerm::IndConst:IndConst.SimpleTerm()=" + IndConst.SimpleTerm() + " LAIndConstOperator=" + (char) LAIndConstOperator + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " ContainsIndConstFlag=" + ContainsIndConstFlag + " IndConstFlag=" + IndConstFlag);
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("SimpleTerm:parseBaseSimpleOld::Exit LookAheadIndConst Processing Zone:IndConst=" + IndConst.SimpleTerm() + " name=" + name);
                        }
                    } //Braces
                    else if ((!LastExpr.equalsIgnoreCase("LookAheadParen"))
                            && ((ParenthesisFlag == false) && (BracesFlag == false) && ((posTerm >= 1) && (StrTerm != null) && (StrTerm.length() > 1) && (posTerm < StrTerm.length()) && (StrTerm.charAt(posTerm - 1) == '('))
                            || ((posTerm >= 0) && (StrTerm != null) && (StrTerm.length() > 1) && (posTerm < StrTerm.length()) && (StrTerm.charAt(posTerm) == '(')))
                            || (ParenthesisFlag == true)) {
                        if ((HideAllFlag == true) && (DevelopmentFlag == true) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("SimpleTerm:parseBaseSimpleOld::Entered LookAheadParen Processing Zone:posTerm=" + posTerm + " chTerm=" + (char) chTerm + " timesLoop=" + timesLoop + " LastExpr=" + LastExpr);
                        }
                        int startPos1 = posTerm;
                        if (startPos1 >= 0) ; else {
                            startPos1 = 0;
                        }
                        variablesStr.put(DiffWithRespTo, DiffWithRespTo);
                        int tempAlignCharRead = 0;
                        int numberofcharsread = 0;
                        int oldposition = 0;
                        if (MapType.equalsIgnoreCase("Map1")) {
                            //numberofcharsread = extractParensWithOperatorsInFirstTerm(StrTerm, DiffWithRespTo,HideAllFlag);
                            numberofcharsread = extractAndClassifyFactors(StrTerm, DiffWithRespTo, HideAllFlag);
                            MyParenDecoded = "";
                            MyParenEncoded = "";
                            if ((IndConstFlag == false) && (!otherTerms.isEmpty())) {
                                for (String str : otherTerms) {
                                    int kpara = -1;
                                    kpara = str.indexOf("(");
                                    int kplus = -1;
                                    kplus = str.indexOf("+");
                                    int kminus = -1;
                                    kminus = str.indexOf("-");
                                    if ((str.contains("(")) && (str.contains(")")) && ((str.contains("sin")) || (str.contains("cos")) || (str.contains("tan")) || (str.contains("log")) || (str.contains("ln")) || (str.contains("exp")))) {
                                        str = "";
                                        System.out.println("Braces:IndConst:str NULLIFIED:str=" + str);
                                    } else if ((str.contains("(")) && (str.contains(")")) && (!str.contains("+")) && (!str.contains("-"))) {
                                        str = str.replaceFirst("\\(", "").replaceFirst("\\)", "");
                                    } else if ((str.contains("(")) && (str.contains(")")) && ((str.contains("+")) && (isUnarySign(str, kplus)))) {
                                        str = str.replaceFirst("\\(", "").replaceFirst("\\)", "").replaceFirst("\\+", "");
                                    } else if ((str.contains("(")) && (str.contains(")")) && ((str.contains("-")) && (isUnarySign(str, kminus)))) {
                                        str = str.replaceFirst("\\(", "").replaceFirst("\\)", "").replaceFirst("\\-", "");
                                    }
                                    MyParenDecoded = MyParenDecoded + str;
                                }
                                if ((LAPreIndConstOperator == -1) && (MyParenDecoded.startsWith("/"))) {
                                    LAPreIndConstOperator = '/';
                                    LAIndConstOperator = '/';
                                } else if ((LAPreIndConstOperator == -1) && (MyParenDecoded.startsWith("*"))) {
                                    LAPreIndConstOperator = '*';
                                    LAIndConstOperator = '*';
                                } else {
                                    LAPreIndConstOperator = '*';
                                    LAIndConstOperator = '*';
                                }
                                if (MyParenDecoded.startsWith("-")) {
                                    MyParenDecoded = MyParenDecoded.replaceFirst("\\-", "");
                                } else if (MyParenDecoded.startsWith("+")) {
                                    MyParenDecoded = MyParenDecoded.replaceFirst("\\+", "");
                                } else if (MyParenDecoded.startsWith("*")) {
                                    MyParenDecoded = MyParenDecoded.replaceFirst("\\*", "");
                                } else if (MyParenDecoded.startsWith("/")) {
                                    MyParenDecoded = MyParenDecoded.replaceFirst("/", "");
                                }
                                MyParenEncoded = MyParenDecoded;
                                IndConst = (() -> MyParenEncoded);
                                IndConstFlag = true;
                                if (IndConstFlag) {
                                    IndConstStr = IndConst.SimpleTerm();

                                }
                                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Braces:IndConst:String:" + StrTerm.substring(oldposition) + " MapType=" + MapType + " MyParenEncoded=" + MyParenEncoded + " MyParenDecoded=" + MyParenDecoded + " IndConst.SimpleTerm()=" + IndConst.SimpleTerm() + " StrIsAConstant=" + StrIsAConstant);
                                    System.out.println("Braces:IndConst:numberofcharsread=" + numberofcharsread + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " tempAlignCharRead=" + tempAlignCharRead);
                                }
                                GotBracesVarFlag = false;
                                BracesFlag = false;
                            }
                            MyParenDecoded = "";
                            MyParenEncoded = "";
                            if ((VariableFlag == false) && (!xTerms.isEmpty())) {
                                for (String str : xTerms) {
                                    int kpara = -1;
                                    kpara = str.indexOf("(");
                                    int kplus = -1;
                                    kplus = str.indexOf("+");
                                    int kminus = -1;
                                    kminus = str.indexOf("-");
                                    if ((str.contains("(")) && (str.contains(")")) && ((str.contains("sin")) || (str.contains("cos")) || (str.contains("tan")) || (str.contains("log")) || (str.contains("ln")) || (str.contains("exp"))))
                                        ; else if ((str.contains("(")) && (str.contains(")")) && (!str.contains("+")) && (!str.contains("-"))) {
                                        str = str.replaceFirst("\\(", "").replaceFirst("\\)", "");
                                    } else if ((str.contains("(")) && (str.contains(")")) && ((str.contains("+")) && (isUnarySign(str, kplus)))) {
                                        str = str.replaceFirst("\\(", "").replaceFirst("\\)", "").replaceFirst("\\+", "");
                                    } else if ((str.contains("(")) && (str.contains(")")) && ((str.contains("-")) && (isUnarySign(str, kminus)))) {
                                        str = str.replaceFirst("\\(", "").replaceFirst("\\)", "").replaceFirst("\\-", "");
                                    }
                                    MyParenDecoded = MyParenDecoded + str;
                                }
                                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("After extractAndClassifyFactors:Variable:MyParenDecoded:MapType=" + MapType + " MyParenEncoded=" + MyParenEncoded + " MyParenDecoded=" + MyParenDecoded + " Variable.SimpleTerm()=" + Variable.SimpleTerm() + " StrIsAConstant=" + StrIsAConstant + " LAVarTermOperator=" + (char) LAVarTermOperator);
                                }
                                if ((LAVarTermOperator == -1) && (MyParenDecoded.startsWith("/"))) {
                                    LAVarTermOperator = '/';
                                } else if ((LAVarTermOperator == -1) && (MyParenDecoded.startsWith("*"))) {
                                    LAVarTermOperator = '*';
                                }
                                if (MyParenDecoded.startsWith("-")) {
                                    MyParenDecoded = MyParenDecoded.replaceFirst("\\-", "");
                                } else if (MyParenDecoded.startsWith("+")) {
                                    MyParenDecoded = MyParenDecoded.replaceFirst("\\+", "");
                                } else if (MyParenDecoded.startsWith("*")) {
                                    MyParenDecoded = MyParenDecoded.replaceFirst("\\*", "");
                                } else if (MyParenDecoded.startsWith("/")) {
                                    MyParenDecoded = MyParenDecoded.replaceFirst("/", "");
                                } else if ((MyParenDecoded.startsWith("(")) && (MyParenDecoded.endsWith(")"))) {
                                    MyParenDecoded = MyParenDecoded.replaceFirst("\\(", "");
                                    MyParenDecoded = MyParenDecoded.replaceFirst("\\)", "");
                                } else if ((MyParenDecoded.contains("(")) && (MyParenDecoded.contains(")")) && (!MyParenDecoded.contains("\\+")) && (!MyParenDecoded.contains("\\-"))) {
                                    MyParenDecoded = MyParenDecoded.replaceFirst("\\(", "");
                                    MyParenDecoded = MyParenDecoded.replaceFirst("\\)", "");
                                }
                                MyParenEncoded = MyParenDecoded;
                                if (MyParenDecoded.equalsIgnoreCase(DiffWithRespTo)) {
                                    Variable = (() -> "1.0");
                                } else if (MyParenDecoded.equalsIgnoreCase("+" + DiffWithRespTo)) {
                                    Variable = (() -> "1.0");
                                } else if (MyParenDecoded.equalsIgnoreCase("-" + DiffWithRespTo)) {
                                    Variable = (() -> "1.0");
                                } else {
                                    Variable = (() -> MyParenEncoded);
                                }
                                VariableFlag = true;
                                if (VariableFlag) {
                                    VarStr = Variable.SimpleTerm();
                                    if (VarStr.equalsIgnoreCase(DiffWithRespTo)) {
                                        VarStr = "1.0";
                                    }
                                }
                                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Braces:Variable:String:" + StrTerm.substring(oldposition) + " MapType=" + MapType + " MyParenEncoded=" + MyParenEncoded + " MyParenDecoded=" + MyParenDecoded + " Variable.SimpleTerm()=" + Variable.SimpleTerm() + " StrIsAConstant=" + StrIsAConstant);
                                    System.out.println("Braces:Variable:numberofcharsread=" + numberofcharsread + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " tempAlignCharRead=" + tempAlignCharRead);
                                }
                                GotBracesVarFlag = false;
                                BracesFlag = false;
                            }
                            MyParenDecoded = "";
                            MyParenEncoded = "";
                            if ((ConstantFlag == false) && (!ConstantTerms.isEmpty())) {
                                for (String str : ConstantTerms) {
                                    int kpara = -1;
                                    kpara = str.indexOf("(");
                                    int kplus = -1;
                                    kplus = str.indexOf("+");
                                    int kminus = -1;
                                    kminus = str.indexOf("-");
                                    if ((str.contains("(")) && (str.contains(")")) && ((str.contains("sin")) || (str.contains("cos")) || (str.contains("tan")) || (str.contains("log")) || (str.contains("ln")) || (str.contains("exp"))))
                                        ; else if ((str.contains("(")) && (str.contains(")")) && (!str.contains("+")) && (!str.contains("-"))) {
                                        str = str.replaceFirst("\\(", "").replaceFirst("\\)", "");
                                    } else if ((str.contains("(")) && (str.contains(")")) && ((str.contains("+")) && (isUnarySign(str, kplus)))) {
                                        str = str.replaceFirst("\\(", "").replaceFirst("\\)", "").replaceFirst("\\+", "");
                                    } else if ((str.contains("(")) && (str.contains(")")) && ((str.contains("-")) && (isUnarySign(str, kminus)))) {
                                        str = str.replaceFirst("\\(", "").replaceFirst("\\)", "").replaceFirst("\\-", "");
                                    }
                                    MyParenDecoded = MyParenDecoded + str;
                                }
                                if ((LATermOperator == -1) && (MyParenDecoded.startsWith("/"))) {
                                    LATermOperator = '/';
                                } else if ((LATermOperator == -1) && (MyParenDecoded.startsWith("*"))) {
                                    LATermOperator = '*';
                                } else {
                                    LATermOperator = '*';
                                }
                                if (MyParenDecoded.startsWith("-")) {
                                    MyParenDecoded = MyParenDecoded.replaceFirst("\\-", "");
                                } else if (MyParenDecoded.startsWith("+")) {
                                    MyParenDecoded = MyParenDecoded.replaceFirst("\\+", "");
                                } else if (MyParenDecoded.startsWith("*")) {
                                    MyParenDecoded = MyParenDecoded.replaceFirst("\\*", "");
                                } else if (MyParenDecoded.startsWith("/")) {
                                    MyParenDecoded = MyParenDecoded.replaceFirst("/", "");
                                }
                                MyParenEncoded = MyParenDecoded;
                                MathsExpressionParser.Expression TempObj = (() -> 0.0);
                                String TempStr = "";
                                TempObj = MathsExpressionParser.parse(MyParenEncoded, variables, DiffWithRespTo, HideAllFlag, "Silent", MathsExpressionParser.LogLevel.Info);
                                if (TempObj.eval() < 0) {
                                    TempStr = "" + (-TempObj.eval());
                                } else if (TempObj.eval() >= 0) {
                                    TempStr = "" + (TempObj.eval());
                                }
                                final String MyTempStr = TempStr;
                                Const = (() -> MyTempStr);
                                ConstantFlag = true;
                                if (ConstantFlag) {
                                    ConstStr = Const.SimpleTerm();
                                }
                                LastExpr = "LookAheadConst";
                                TrailConstantFlag = false;
                                LastInvokedPos = posTerm + numberofcharsread;
                                ParenthesisFlag = false;
                                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Braces:Constant:String:" + StrTerm.substring(oldposition) + " MapType=" + MapType + " MyParenEncoded=" + MyParenEncoded + " MyParenDecoded=" + MyParenDecoded + " Const.SimpleTerm()=" + Const.SimpleTerm() + " StrIsAConstant=" + StrIsAConstant);
                                    System.out.println("Braces:Constant:numberofcharsread=" + numberofcharsread + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " tempAlignCharRead=" + tempAlignCharRead);
                                }
                                GotBracesVarFlag = false;
                                BracesFlag = false;
                                MyParenDecoded = "";
                                MyParenEncoded = "";
                                xTerms.clear();
                                otherTerms.clear();
                                ConstantTerms.clear();
                            }
                        } else if (MapType.equalsIgnoreCase("Map2")) {
                            numberofcharsread = extractAndClassifyFactors(StrTerm, DiffWithRespTo, HideAllFlag);
                            MyParenDecoded = "";
                            MyParenEncoded = "";

                            if ((IndConstFlag == false) && (!otherTerms.isEmpty())) {
                                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("otherTerms:");
                                    otherTerms.forEach(System.out::println);
                                }
                                for (String str : otherTerms) {
                                    int kpara = -1;
                                    kpara = str.indexOf("(");
                                    int kplus = -1;
                                    kplus = str.indexOf("+");
                                    int kminus = -1;
                                    kminus = str.indexOf("-");
                                    if ((str.contains("(")) && (str.contains(")")) && ((str.contains("sin")) || (str.contains("cos")) || (str.contains("tan")) || (str.contains("log")) || (str.contains("ln")) || (str.contains("exp")))) {
                                        str = "";
                                        System.out.println("Braces:IndConst:str NULLIFIED:str=" + str);
                                    } else if ((str.contains("(")) && (str.contains(")")) && (!str.contains("+")) && (!str.contains("-"))) {
                                        str = str.replaceFirst("\\(", "").replaceFirst("\\)", "");
                                    } else if ((str.contains("(")) && (str.contains(")")) && ((str.contains("+")) && (isUnarySign(str, kplus)))) {
                                        str = str.replaceFirst("\\(", "").replaceFirst("\\)", "").replaceFirst("\\+", "");
                                    } else if ((str.contains("(")) && (str.contains(")")) && ((str.contains("-")) && (isUnarySign(str, kminus)))) {
                                        str = str.replaceFirst("\\(", "").replaceFirst("\\)", "").replaceFirst("\\-", "");
                                    }
                                    MyParenDecoded = MyParenDecoded + str;
                                }
                                if ((LAPreIndConstOperator == -1) && (MyParenDecoded.startsWith("/"))) {
                                    LAPreIndConstOperator = '/';
                                } else if ((LAPreIndConstOperator == -1) && (MyParenDecoded.startsWith("*"))) {
                                    LAPreIndConstOperator = '*';
                                } else {
                                    LAPreIndConstOperator = '*';
                                }
                                if (MyParenDecoded.startsWith("-")) {
                                    MyParenDecoded = MyParenDecoded.replaceFirst("\\-", "");
                                } else if (MyParenDecoded.startsWith("+")) {
                                    MyParenDecoded = MyParenDecoded.replaceFirst("\\+", "");
                                } else if (MyParenDecoded.startsWith("*")) {
                                    MyParenDecoded = MyParenDecoded.replaceFirst("\\*", "");
                                } else if (MyParenDecoded.startsWith("/")) {
                                    MyParenDecoded = MyParenDecoded.replaceFirst("/", "");
                                }
                                MyParenEncoded = MyParenDecoded;
                                IndConst = (() -> MyParenEncoded);
                                IndConstFlag = true;
                                if (IndConstFlag) {
                                    IndConstStr = IndConst.SimpleTerm();
                                }
                                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Braces:IndConst:String:" + StrTerm.substring(oldposition) + " MapType=" + MapType + " MyParenEncoded=" + MyParenEncoded + " MyParenDecoded=" + MyParenDecoded + " IndConst.SimpleTerm()=" + IndConst.SimpleTerm() + " StrIsAConstant=" + StrIsAConstant);
                                    System.out.println("Braces:IndConst:numberofcharsread=" + numberofcharsread + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " tempAlignCharRead=" + tempAlignCharRead);
                                }
                                GotBracesVarFlag = false;
                                BracesFlag = false;
                            }
                            MyParenDecoded = "";
                            MyParenEncoded = "";
                            if ((VariableFlag == false) && (!xTerms.isEmpty())) {
                                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("xTerms:");
                                    xTerms.forEach(System.out::println);
                                }
                                for (String str : xTerms) {
                                    int kpara = -1;
                                    kpara = str.indexOf("(");
                                    int kplus = -1;
                                    kplus = str.indexOf("+");
                                    int kminus = -1;
                                    kminus = str.indexOf("-");
                                    if ((str.contains("(")) && (str.contains(")")) && (!str.contains("+")) && (!str.contains("-"))) {
                                        str = str.replaceFirst("\\(", "").replaceFirst("\\)", "");
                                    } else if ((str.contains("(")) && (str.contains(")")) && ((str.contains("+")) && (isUnarySign(str, kplus)))) {
                                        str = str.replaceFirst("\\(", "").replaceFirst("\\)", "").replaceFirst("\\+", "");
                                    } else if ((str.contains("(")) && (str.contains(")")) && ((str.contains("-")) && (isUnarySign(str, kminus)))) {
                                        str = str.replaceFirst("\\(", "").replaceFirst("\\)", "").replaceFirst("\\-", "");
                                    }
                                    MyParenDecoded = MyParenDecoded + str;
                                }

                                if ((LAVarTermOperator == -1) && (MyParenDecoded.startsWith("/"))) {
                                    LAVarTermOperator = '/';
                                } else if ((LAVarTermOperator == -1) && (MyParenDecoded.startsWith("*"))) {
                                    LAVarTermOperator = '*';
                                } else {
                                    LAVarTermOperator = '*';
                                }
                                if (MyParenDecoded.startsWith("-")) {
                                    MyParenDecoded = MyParenDecoded.replaceFirst("\\-", "");
                                } else if (MyParenDecoded.startsWith("+")) {
                                    MyParenDecoded = MyParenDecoded.replaceFirst("\\+", "");
                                } else if (MyParenDecoded.startsWith("*")) {
                                    MyParenDecoded = MyParenDecoded.replaceFirst("\\*", "");
                                } else if (MyParenDecoded.startsWith("/")) {
                                    MyParenDecoded = MyParenDecoded.replaceFirst("/", "");
                                }
                                MyParenEncoded = MyParenDecoded;
                                if (MyParenEncoded.equalsIgnoreCase(DiffWithRespTo)) {
                                    Variable = (() -> "1.0");
                                    VariableFlag = true;
                                } else if (MyParenEncoded.equalsIgnoreCase("+" + DiffWithRespTo)) {
                                    Variable = (() -> "1.0");
                                    VariableFlag = true;
                                } else if (MyParenEncoded.equalsIgnoreCase("-" + DiffWithRespTo)) {
                                    Variable = (() -> "1.0");
                                    VariableFlag = true;
                                } else if (MyParenEncoded.contains(DiffWithRespTo)) {
                                    Variable = (() -> MyParenEncoded);
                                    VariableFlag = true;
                                } else {
                                    Variable = (() -> "");
                                    VariableFlag = false;
                                }
                                if (VariableFlag) {
                                    VarStr = Variable.SimpleTerm();
                                    if (VarStr.equalsIgnoreCase(DiffWithRespTo)) {
                                        VarStr = "1.0";
                                    }
                                }
                                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Braces:Variable:String:" + StrTerm.substring(oldposition) + " MapType=" + MapType + " MyParenEncoded=" + MyParenEncoded + " MyParenDecoded=" + MyParenDecoded + " Variable.SimpleTerm()=" + Variable.SimpleTerm() + " StrIsAConstant=" + StrIsAConstant);
                                    System.out.println("Braces:Variable:numberofcharsread=" + numberofcharsread + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " tempAlignCharRead=" + tempAlignCharRead);
                                }
                                GotBracesVarFlag = false;
                                BracesFlag = false;
                            }
                            MyParenDecoded = "";
                            MyParenEncoded = "";
                            if ((ConstantFlag == false) && (!ConstantTerms.isEmpty())) {
                                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("ConstantTerms:");
                                    ConstantTerms.forEach(System.out::println);
                                }
                                for (String str : ConstantTerms) {
                                    int kpara = -1;
                                    kpara = str.indexOf("(");
                                    int kplus = -1;
                                    kplus = str.indexOf("+");
                                    int kminus = -1;
                                    kminus = str.indexOf("-");
                                    if ((str.contains("(")) && (str.contains(")")) && (!str.contains("+")) && (!str.contains("-"))) {
                                        str = str.replaceFirst("\\(", "").replaceFirst("\\)", "");
                                    } else if ((str.contains("(")) && (str.contains(")")) && ((str.contains("+")) && (isUnarySign(str, kplus)))) {
                                        str = str.replaceFirst("\\(", "").replaceFirst("\\)", "").replaceFirst("\\+", "");
                                    } else if ((str.contains("(")) && (str.contains(")")) && ((str.contains("-")) && (isUnarySign(str, kminus)))) {
                                        str = str.replaceFirst("\\(", "").replaceFirst("\\)", "").replaceFirst("\\-", "");
                                    }
                                    if ((IsAConstant(str, DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("Number")) || (StrIsAConstant.equalsIgnoreCase("NumberExpression")))) {
                                        MyParenDecoded = MyParenDecoded + str;
                                    }
                                }
                                if ((LATermOperator == -1) && (MyParenDecoded.startsWith("/"))) {
                                    LATermOperator = '/';
                                } else if ((LATermOperator == -1) && (MyParenDecoded.startsWith("*"))) {
                                    LATermOperator = '*';
                                } else {
                                    LATermOperator = '*';
                                }
                                if (MyParenDecoded.startsWith("-")) {
                                    MyParenDecoded = MyParenDecoded.replaceFirst("\\-", "");
                                } else if (MyParenDecoded.startsWith("+")) {
                                    MyParenDecoded = MyParenDecoded.replaceFirst("\\+", "");
                                } else if (MyParenDecoded.startsWith("*")) {
                                    MyParenDecoded = MyParenDecoded.replaceFirst("\\*", "");
                                } else if (MyParenDecoded.startsWith("/")) {
                                    MyParenDecoded = MyParenDecoded.replaceFirst("/", "");
                                }
                                MyParenEncoded = MyParenDecoded;
                                MathsExpressionParser.Expression TempObj = (() -> 0.0);
                                String TempStr = "";
                                TempObj = MathsExpressionParser.parse(MyParenEncoded, variables, DiffWithRespTo, HideAllFlag, "Silent", MathsExpressionParser.LogLevel.Info);
                                if (TempObj.eval() < 0) {
                                    TempStr = "" + (-TempObj.eval());
                                } else if (TempObj.eval() >= 0) {
                                    TempStr = "" + (TempObj.eval());
                                }
                                final String MyTempStr = TempStr;
                                Const = (() -> MyTempStr);
                                ConstantFlag = true;
                                if (ConstantFlag) {
                                    ConstStr = Const.SimpleTerm();
                                }
                                LastExpr = "LookAheadConst";
                                TrailConstantFlag = false;
                                LastInvokedPos = posTerm + numberofcharsread;
                                ParenthesisFlag = false;
                                if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("Braces:Constant:String:" + StrTerm.substring(oldposition) + " MapType=" + MapType + " MyParenEncoded=" + MyParenEncoded + " Const.SimpleTerm()=" + Const.SimpleTerm() + " StrIsAConstant=" + StrIsAConstant);
                                    System.out.println("Braces:Constant:numberofcharsread=" + numberofcharsread + " posTerm=" + posTerm + " chTerm=" + (char) chTerm + " tempAlignCharRead=" + tempAlignCharRead);
                                }
                                MyParenDecoded = "";
                                MyParenEncoded = "";
                            }
                            GotBracesVarFlag = false;
                            BracesFlag = false;
                            MyParenDecoded = "";
                            MyParenEncoded = "";
                        }
                        MyParenDecoded = "";
                        MyParenEncoded = "";
                        if (!AutoGenSilentFlag) {
                            System.out.println(ConsoleColors.RED + "Braces:parseBaseSimpleOld:Got Braces Only:" + ConsoleColors.RESET);
                        }
                        if (posTerm == -1) {
                            posTerm = 0;
                        }
                        //posTerm = numberofcharsread;
                        if ((posTerm > 0) && (posTerm < StrTerm.length()) && (numberofcharsread >= 1)) {
                            chTerm = StrTerm.charAt(posTerm);
                        }
                        GotBracesVarFlag = false;
                        BracesFlag = false;
                        LastInvokedFlag = "LookAheadParen";
                        LastInvokedPos = numberofcharsread;
                        LastExpr = "LookAheadParen";
                        ParenthesisFlag = false;
                        xTerms.clear();
                        otherTerms.clear();
                        ConstantTerms.clear();
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("SimpleTerm:parseBaseSimpleOld:Exit LookAheadParen Processing Zone:posTerm=" + posTerm + " chTerm=" + (char) chTerm);
                        }
                    } else {
                        NoFSMFlag++;
                    }
                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                        IsAConstant(ConstStr, DiffWithRespTo);
                        System.out.println("SimpleTerm:parseBaseSimpleOld:Breaking LOOP:0:Const.SimpleTerm()=" + Const.SimpleTerm() + " ConstStr=" + ConstStr + " ConstantFlag=" + ConstantFlag + " StrIsAConstant=" + StrIsAConstant + " timesLoop=" + timesLoop + " chTerm=" + (char) chTerm + " posTerm=" + posTerm);
                        IsAConstant(VarStr, DiffWithRespTo);
                        System.out.println("SimpleTerm:parseBaseSimpleOld:Breaking LOOP:0:Variable.SimpleTerm()=" + Variable.SimpleTerm() + " VarStr=" + VarStr + " VariableFlag=" + VariableFlag + " StrIsAConstant=" + StrIsAConstant);
                        IsAConstant(IndConstStr, DiffWithRespTo);
                        System.out.println("SimpleTerm:parseBaseSimpleOld:Breaking LOOP:0:IndConst.SimpleTerm()=" + IndConst.SimpleTerm() + " IndConstStr=" + IndConstStr + " IndConstant=" + IndConstFlag + " StrIsAConstant=" + StrIsAConstant);
                        IsAConstant(BracesStr, DiffWithRespTo);
                        System.out.println("SimpleTerm:parseBaseSimpleOld:Breaking LOOP:0:Braces.SimpleTerm()=" + Braces.SimpleTerm() + " BracesStr=" + BracesStr + " BracesFlag=" + BracesFlag + " StrIsAConstant=" + StrIsAConstant);
                    }
                    timesLoop++;
                    if ((IsNumber(chTerm)) || (IsVariable(chTerm)) || (IsIndConstant(chTerm) || (chTerm == '(')) || (BracesFlag)) {
                        if ((DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println(ConsoleColors.BLUE + "SimpleTerm:parseBaseSimpleOld:Prediction:Should Enter Constant OR Var OR IndConstant Processing Zone:Con=" + IsNumber(chTerm) + ":Var=" + (IsVariable(chTerm)) + ":IndConstant=" + IsIndConstant(chTerm) + " BracesFlag=" + BracesFlag + " chTerm=" + (char) chTerm + " posTerm=" + posTerm + " timesLoop=" + timesLoop + ConsoleColors.RESET);
                        }
                    } else {
                        if ((DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                            System.out.println("SimpleTerm:parseBaseSimpleOld:Prediction:Some Error:chTerm=" + chTerm + " char=" + (char) chTerm + " posTerm=" + posTerm + " timesLoop=" + timesLoop);
                        }
                    }
                }

                //final String CompleteString = FormTermLambda("parseBaseSimpleOld", IndConstStr,  VarStr, ConstStr, DiffWithRespTo,  VariableFlag, ConstantFlag, IndConstFlag);
                final String CompleteString = FormTermLambda("parseBaseSimpleOld", "", IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, MapType, IntegrORDiffr);
                x = (() -> CompleteString);
                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                    System.out.println(ConsoleColors.BLUE + "SimpleTerm:parseBaseSimpleOld:Atomic Complete String:ConstantFlag=" + ConstantFlag + " VariableFlag=" + VariableFlag + " IndConstFlag=" + IndConstFlag + " BracesFlag=" + BracesFlag + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.BLUE + "SimpleTerm:parseBaseSimpleOld:Atomic Complete String:ConstStr=" + Const.SimpleTerm() + " VarStr=" + Variable.SimpleTerm() + " IndConstStr=" + IndConst.SimpleTerm() + " BracesStr=" + Braces.SimpleTerm() + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.BLUE + "SimpleTerm:parseBaseSimpleOld:Atomic Complete String:x.SimpleTerm()=" + x.SimpleTerm() + ConsoleColors.RESET);
                }

                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                    System.out.println("parseBaseSimpleOld:Loop:General:String:timesLoop=" + timesLoop + " chTerm=" + (char) chTerm + ":posTerm=" + posTerm);
                    System.out.println("parseBaseSimpleOld:Loop:General:ConstantFlag=" + ConstantFlag + " VariableFlag=" + VariableFlag + " IndConstFlag=" + IndConstFlag + " BracesFlag=" + BracesFlag + " ParenthesisFlag=" + ParenthesisFlag);
                    System.out.println("parseBaseSimpleOld:Loop:General:ConstStr=" + Const.SimpleTerm() + " VarStr=" + Variable.SimpleTerm() + " IndConstStr=" + IndConst.SimpleTerm() + " BracesStr=" + Braces.SimpleTerm());
                    System.out.println("parseBaseSimpleOld:Loop:General:ParenthesisFlag=" + ParenthesisFlag + " ContainsIndConstFlag=" + ContainsIndConstFlag + " GotIndConstFlag=" + GotIndConstFlag + " ContainsFuncFlag=" + ContainsFuncFlag + " ContainsXFlag=" + ContainsXFlag);

                }
                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                    System.out.println("SimpleTerm:parseBaseSimpleOld::ConstantFlag=" + ConstantFlag + " VariableFlag=" + VariableFlag + " IndConstFlag=" + IndConstFlag + " BracesFlag=" + BracesFlag);
                    System.out.println("SimpleTerm:parseBaseSimpleOld::ConstStr=" + Const.SimpleTerm() + " VarStr=" + Variable.SimpleTerm() + " IndConstStr=" + IndConst.SimpleTerm() + " BracesStr=" + Braces.SimpleTerm());
                }

                log.info("SimpleTerm:parseBaseSimpleOld:Formed Complete Term:parseBaseSimpleOld:Normal Return:CompleteString=" + CompleteString + " VarStr=" + VarStr + " ConstStr=" + ConstStr + " posTerm=" + posTerm + " chTerm=" + (char) chTerm);
                ResetVars("ResetControlVars");
                ConstantFlag = false;
                VariableFlag = false;
                IndConstFlag = false;
                BracesFlag = false;
                ParenthesisFlag = false;
                MyParenDecoded = "";
                MyParenEncoded = "";
//                if ((IsNotAnOperator(chTerm) ) && (chTerm != 0) && (chTerm != -1) && (chTerm != '(')&& (posTerm != -1)) {
//                    if ((strTerm != null) && (startPos < StrTerm.length()) && (startPos > posTerm) && (chTerm != -1) && (chTerm != 0)) {
//                        throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "SimpleTerm::parseBase:Unexpected: " + (char) chTerm + " int=" + (int) chTerm + " Cannot Format:" + strTerm.substring(posTerm, strTerm.length()));
//                    } else if ((chTerm != -1) && (chTerm != 0) && (chTerm != ')') && (posTerm >= 1) && (posTerm < strTerm.length()) && (IsNumber(chTerm))) {
//                        throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "SimpleTerm::parseBase:Please Check Code:Should NOT reach Here:Unexpected: " + (char) chTerm + " int=" + (int) chTerm + " Cannot Format:" + strTerm.substring(posTerm, strTerm.length()));
//                    } else if ((chTerm != -1) && (chTerm != 0) && (chTerm != ')') && (posTerm >= 1) && (posTerm < strTerm.length()) && (IsOperator(chTerm))) {
//                        throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "SimpleTerm::parseBase:Please Check Equation Operators:Should NOT reach Here:Unexpected: " + (char) chTerm + " int=" + (int) chTerm + " Cannot Format:" + strTerm.substring(posTerm, strTerm.length()));
//                    } else if ((chTerm != -1) && (chTerm != 0) && (chTerm != ')') && (posTerm >= 1) && (posTerm < strTerm.length())) {
//                        throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "SimpleTerm::parseBase:Unexpected: " + (char) chTerm + " int=" + (int) chTerm + " Cannot Format:" + strTerm.substring(posTerm, strTerm.length()));
//                    }
//                    log.info("SimpleTerm:parseBaseSimpleOld:Return From Inside Loop parseBaseSimpleOld:Junk:CompleteString=" + CompleteString + " VarStr=" + VarStr + " ConstStr=" + ConstStr + " posTerm=" + posTerm + " chTerm=" + (char) chTerm);
//                    return x;
//                }
                log.info("SimpleTerm:parseBaseSimpleOld:Return From Inside Loop parseBaseSimpleOld:Valid Return:CompleteString=" + CompleteString + " VarStr=" + VarStr + " ConstStr=" + ConstStr + " posTerm=" + posTerm + " chTerm=" + (char) chTerm);
                return x;
            }
        }.parsesimpleterm();
    }

    public static boolean NumberSearch(String MapType, boolean ConstantFlag, boolean VariableFlag, boolean BracesFlag) {
        if (((IsNumber(chTerm)) && (timesLoop == 0) && (posTerm >= -1) && (chTerm == '(') && (IsNumber(StrTerm.charAt(posTerm + 1))) && (ParenthesisFlag == false)
                && (ConstantFlag == false) && (VariableFlag == false))
                || ((IsNumber(chTerm)) && (timesLoop == 0) && (ParenthesisFlag == false) && (ConstantFlag == false) && (VariableFlag == false))
                || ((IsNumber(chTerm)) && (timesLoop == 0) && (ParenthesisFlag == false)
                && ((ComplexAssignFlag == true) && (ConstantFlag == false) && (VariableFlag == true)))
                || ((timesLoop == 1) && (TrailConstantFlag == true) && (ConstantFlag == false) && (VariableFlag == true))
                || ((timesLoop == 1) && (posTerm >= 1) && (posTerm < StrTerm.length()) && (IsNumber(StrTerm.charAt(posTerm)))
                && (ConstantFlag == false) && (VariableFlag == true) && (ParenthesisFlag == false) && (BracesFlag == false))
                //|| ((ConstantFlag == false) && (timesLoop == 1) && (IsNumber(chTerm))
                //&& (BracesFlag == true))
                //|| ((timesLoop == 2) && (TrailConstantFlag == true)
                //&& (ConstantFlag == false) && (VariableFlag == true) && (ParenthesisFlag == false))
                //|| ((timesLoop == 2) && (TrailConstantFlag == true)
                //&& (ConstantFlag == false) && (ParenthesisFlag == false))
                //|| ((timesLoop == 2) && (((IsNumber(chTerm)) && (posTerm >= 1) && (posTerm < StrTerm.length()) && (StrTerm.charAt(posTerm - 1) != '('))
                //    || ((BracesFlag == true) && ((StrParen == null) || (StrParen.equalsIgnoreCase(""))))))

                || ((ConstantFlag == false) && (IsNumber(chTerm)) && (timesLoop == 3) && (posTerm >= 1) && (posTerm < StrTerm.length()) && (StrTerm.charAt(posTerm - 1) != '('))
                || ((ConstantFlag == false) && (posTerm >= 0) && (posTerm < StrTerm.length()) && (IsNumber(StrTerm.charAt(posTerm))) && (timesLoop == 3))
                //|| (TrailConstantFlag == true) //|| ( ( MapType.equalsIgnoreCase("Map2"))&& (ParenthesisFlag == false)&&(TrailConstantFlag==true))
                || ((ConstantFlag == true) && (LastExpr.equalsIgnoreCase("LookAheadParen")) && (IsNumber(StrTerm.charAt(posTerm)))) //|| ((ConstantFlag == false) && (posTerm >= 0) && (posTerm + 2 < StrTerm.length()) && (IsNumber(StrTerm.charAt(posTerm + 2))) && (timesLoop == 3))
                || ((LastExpr.equalsIgnoreCase("LookAheadVar")) && (TrailConstantFlag == true))) {
            return true;
        }
        return false;
    }

    public static boolean VarSearch(boolean ConstantFlag, boolean VariableFlag, boolean BracesFlag) {
        if ((((!LastExpr.equalsIgnoreCase("LookAheadVar")) && (((IsVariable(chTerm)) && (VariableFlag == false) && (ContainsIndConstFlag == false)
                && (posTerm > 1) && (StrTerm.charAt(posTerm - 1) != '(') && (chTerm != '('))
                || ((timesLoop == 1) && (ConstantFlag == false) && (IsVariable(chTerm)) && (StrTerm.length() > 1) && (StrTerm.charAt(0) == '('))
                || ((timesLoop == 1) && (ConstantFlag == true) && (StrTerm.contains(DiffWithRespTo)))
                || ((timesLoop == 1) && (ConstantFlag == false) && (IsVariable(chTerm)) && (BracesFlag == true))
                || ((timesLoop == 0) && (posTerm != 0) && (StrTerm.length() > 1) && (StrTerm.charAt(0) == '('))
                || ((IsVariable(chTerm)) && (timesLoop == 0) && (VariableFlag == false) && (ContainsIndConstFlag == false)
                && (ConstantFlag == false) && (StrTerm.length() > 1) && (StrTerm.charAt(0) != '(')
                && ((Str.length() > 1) && (Str.charAt(0) != '+') && (Str.charAt(0) != '-'))
                && (BracesFlag == true)) //                            || ( (IsVariable(chTerm)) && (timesLoop == 1) && (VariableFlag == false) && (ContainsIndConstFlag == false)
                ))
                || ((posTerm >= 0) && ((posTerm + 1) < StrTerm.length()) && (IsVariable(StrTerm.charAt(posTerm + 1))) && (timesLoop == 1))
                || ((timesLoop == 1) && (VariableFlag == false) && (ContainsIndConstFlag == false)
                && (ComplexAssignFlag == true) && (ConstantFlag == true))
                || ((timesLoop == 1) && (VariableFlag == false) && (ContainsIndConstFlag == true)
                && ((ComplexAssignFlag == true) && (ConstantFlag == true)))
                || ((IsVariable(chTerm)) && (timesLoop == 1) && (VariableFlag == false) && (ContainsIndConstFlag == false)
                && ((ConstantFlag == false)))
                || ((IsVariable(chTerm)) && (timesLoop == 1) && (VariableFlag == false)
                && (ConstantFlag == true) && (ContainsIndConstFlag == false) && ((ComplexAssignFlag == false)))
                || ((IsVariable(chTerm)) && (timesLoop == 2) && (VariableFlag == false) && (ConstantFlag == true) && (BracesFlag == true) && (ContainsIndConstFlag == false)
                && (ComplexAssignFlag == true))
                || ((IsVariable(chTerm)) && (timesLoop == 3) && (VariableFlag == false) && (ConstantFlag == true) && (BracesFlag == true) && (ContainsIndConstFlag == false)
                && (ComplexAssignFlag == true))) //|| ((!LastExpr.equalsIgnoreCase("LookAheadVar")) &&(timesLoop >= 0)&& ((posTerm + 1) < StrTerm.length()) && (StrTerm.length() > 1) && (IsVariable(StrTerm.charAt(posTerm+1)) ))
                || ((LastExpr.equalsIgnoreCase("")))) {
            return true;
        }
        return false;
    }

    public static boolean IndConstSearch(boolean ConstantFlag, boolean IndConstFlag, boolean VariableFlag, boolean BracesFlag) {
        if (((IsIndConstant(chTerm)) && (!DiffWithRespTo.equalsIgnoreCase("" + chTerm)) && (timesLoop == 0) && (ContainsIndConstFlag == true) && (IndConstFlag == false))
                || ((IsIndConstant(chTerm)) && (timesLoop == 1) && (ContainsIndConstFlag == true) && (IndConstFlag == false))
                || ((timesLoop == 2) && (ContainsIndConstFlag == true) && (IndConstFlag == false))
                || ((timesLoop == 3) && (ContainsIndConstFlag == true) && (IndConstFlag == false))
                || ((IsIndConstant(chTerm)))) {
            return true;
        }
        return false;
    }

    public static int extractAndClassifyFactors(String expr, String DiffWithRespTo, boolean HideAllFlag) {
        xTerms.clear();
        otherTerms.clear();
        ConstantTerms.clear();
        MixedExpressionTerms.clear();
        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
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
                finalFactors.addAll(splitFactors1(f, DiffWithRespTo, HideAllFlag));
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
            if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
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
                ConstantTerms.add(tagged);
                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
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
                    BracReplacedFlag=true;
                }
                if (BracReplacedFlag == true)
                        xTerms.add("(" + tagged + ")");
                    else
                        xTerms.add(tagged);
               if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
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
                boolean ProperExpressionFlag = false;
                boolean LongFormFlag = false;
                if ((tagged.contains("(")) && (tagged.contains(")")) && (StringUtils.countMatches(tagged, "(") == 1) && (StringUtils.countMatches(tagged, ")") == 1)) {
                    if ((!tagged.contains("sin")) &&(!tagged.contains("cos"))&&(!tagged.contains("ln")) &&(!tagged.contains("tan")) &&(!tagged.contains("sqrt")) &&(!tagged.contains("exp"))){
                        tagged = tagged.replaceFirst("\\(", "").replaceFirst("\\)", "");
                        BracReplacedFlag = true;
                    }
                }
                int numberofcharsread = 0;
                int kplus = tagged.indexOf("+");
                int kminus = tagged.indexOf("-");
                if ((BracReplacedFlag == true) && (tagged.contains(DiffWithRespTo)) && (!tagged.matches("[\\+\\-]*"))) {
                    LongFormFlag = true;
                    ProperExpressionFlag = false;
                    MixedExpressionFlag = false;
                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                        System.out.println("extractAndClassifyFactors:1:Identified:LongFormFlag:tagged=" + tagged + " StrIsAConstant=" + StrIsAConstant);
                    }
                }
                if ((BracReplacedFlag == true) && (LongFormFlag == false) && ((kplus > -1) && (!isUnarySign(tagged, kplus))) || ((kminus > -1) && (!isUnarySign(tagged, kminus)))) {
                    if ((tagged.matches("[\\+\\-\\*/^]*[a-zA-Z]+[0-9\\.]*"))) {
                        MixedExpressionFlag = true;
                    }
                    ProperExpressionFlag = false;
                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                        System.out.println("extractAndClassifyFactors:2:Identified:MixedExpression:tagged=" + tagged + " StrIsAConstant=" + StrIsAConstant);
                    }
                }
                if ((BracReplacedFlag == true) && (LongFormFlag == false) && (tagged.contains(DiffWithRespTo)) && (!tagged.matches("[\\+\\-\\*/^]*[a-zA-Z]+[0-9]*"))) {
                    ProperExpressionFlag = true;
                    MixedExpressionFlag = false;
                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                        System.out.println("extractAndClassifyFactors:2:Identified:ProperExpression:tagged=" + tagged + " StrIsAConstant=" + StrIsAConstant);
                    }
                }
                if ((BracReplacedFlag == true) && (tagged.contains(DiffWithRespTo)) && (!tagged.matches("[\\+\\-\\*/^]*[a-zA-Z]+[0-9]*"))) {
                    ProperExpressionFlag = true;
                    MixedExpressionFlag = false;
                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                        System.out.println("extractAndClassifyFactors:2:Identified:ProperExpression:tagged=" + tagged + " StrIsAConstant=" + StrIsAConstant);
                    }
                }

                if ((LongFormFlag == true) && ((!((kplus > -1) && (!isUnarySign(tagged, kplus)))) && (!((kminus > -1) && (!isUnarySign(tagged, kminus)))))) {
                    numberofcharsread = extractAndClassifyFactorsInner(tagged, DiffWithRespTo, HideAllFlag);
                } // Proper Expressions
                else if ((((kplus > -1) && (!isUnarySign(tagged, kplus))) || ((kminus > -1) && (!isUnarySign(tagged, kminus))))
                        && (ProperExpressionFlag == true) && (tagged.contains(DiffWithRespTo)) && (!IsAConstant(tagged, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("VarExpression"))) {
                    //&&(tagged.matches("\\b(?!" + DiffWithRespTo + "\b)[a-zA-Z]\\w*\\b")) ){
                    xTerms.add("(" + tagged + ")");
                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                        System.out.println("extractAndClassifyFactors:4:Added:ProperExpressions:tagged=" + tagged + " StrIsAConstant=" + StrIsAConstant);
                    }
                }// Mixed Expressions
                else if ((!tagged.equalsIgnoreCase("-" + DiffWithRespTo)) && (!tagged.equalsIgnoreCase("+" + DiffWithRespTo)) && (((kplus > -1) && (!isUnarySign(tagged, kplus))) || ((kminus > -1) && (!isUnarySign(tagged, kminus))))
                        && (MixedExpressionFlag == true) && (tagged.contains(DiffWithRespTo)) && (!IsAConstant(tagged, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("VarExpression"))
                        && (tagged.matches((".*[\\+\\-\\*/^]*[a-zA-Z]+[0-9]*.*")))) {
                    //&&(tagged.matches("\\b(?!" + DiffWithRespTo + "\b)[a-zA-Z]\\w*\\b")) ){
                    MixedExpressionTerms.add("(" + tagged + ")");
                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                        System.out.println("extractAndClassifyFactors:3:Added:MixedExpressionTerms:tagged=" + tagged + " StrIsAConstant=" + StrIsAConstant);
                    }
                } else {
                    if (BracReplacedFlag == true)
                        xTerms.add("(" + tagged + ")");
                    else
                        xTerms.add(tagged);
                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                        System.out.println("extractAndClassifyFactors:5:Added:xTerms:tagged=" + tagged + " StrIsAConstant=" + StrIsAConstant);
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
                otherTerms.add(tagged);
                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                    System.out.println("extractAndClassifyFactors:6:Added:otherTerms=" + tagged + " StrIsAConstant=" + StrIsAConstant);
                }
            } else {
                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                    isConst = IsAConstant(tagged, DiffWithRespTo);
                    System.out.println("extractAndClassifyFactors:7:finalFactors:else:Dropped:tagged=" + tagged + " StrIsAConstant=" + StrIsAConstant);
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
                    ConstantTerms.add(tagged);
                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                        System.out.println("extractAndClassifyFactors:8:Recovered:Added:ConstantTerms:tagged=" + tagged + " StrIsAConstant=" + StrIsAConstant);
                    }
                    // 2) Variable expressions
                } else if (!isConst
                        && (tagType.equals("Var") || tagType.equals("VarExpression"))) {
                    //if ( (tagged.contains("(")) && (tagged.contains(")")) &&( (!tagged.contains("+)")) && (!tagged.contains("-)"))) )
                    //    tagged=tagged.replaceAll("\\(", "").replaceAll("\\)", "");
                    xTerms.add(tagged);
                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                        System.out.println("extractAndClassifyFactors:9:Recovered:Added:xTerms:tagged=" + tagged + " StrIsAConstant=" + StrIsAConstant);
                    }
                    // 3) All other symbolic forms
                } else if ((!IsAConstant(factor, DiffWithRespTo))
                        && ((StrIsAConstant.equals("IndConstant")) || StrIsAConstant.equals("IndConstantExpression"))) {
                    //if ( (tagged.contains("(")) && (tagged.contains(")")) &&( (!tagged.contains("+)")) && (!tagged.contains("-)"))) )
                    //        tagged=tagged.replaceAll("\\(", "").replaceAll("\\)", "");
                    otherTerms.add(tagged);
                    IsAConstant(factor, DiffWithRespTo);
                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                        System.out.println("extractAndClassifyFactors:10:Recovered:Added:otherTerms:tagged=" + tagged + " StrIsAConstant=" + StrIsAConstant);
                    }
                } else if ((!IsAConstant(factor, DiffWithRespTo))
                        && (StrIsAConstant.equals("Expression"))) {
                    //if ( (tagged.contains("(")) && (tagged.contains(")")) &&( (!tagged.contains("+)")) && (!tagged.contains("-)"))) )
                    //        tagged=tagged.replaceAll("\\(", "").replaceAll("\\)", "");
                    otherTerms.add(tagged);
                    IsAConstant(factor, DiffWithRespTo);
                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                        System.out.println("extractAndClassifyFactors:11:Recovered:Added:otherTerms:tagged=" + tagged + " StrIsAConstant=" + StrIsAConstant);
                    }
                }
            }
        }
        return pos;
    }

    public static int extractAndClassifyFactorsInner(String expr, String DiffWithRespTo, boolean HideAllFlag) {
        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
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
            if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
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
                ConstantTerms.add(tagged);
                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
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
                xTerms.add(tagged);
                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
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
//                if ( (tagged.startsWith("*")) || (tagged.startsWith("/")) ) {
//                    tagged = tagged.substring(1);
//                }
//                if ((tagged.startsWith("+")) || (tagged.startsWith("+"))) {
//                    tagged = tagged.substring(1);
//                }
                xTerms.add(tagged);
                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
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
                otherTerms.add(tagged);
                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                    System.out.println("extractAndClassifyFactorsInner:4:Added:otherTerms=" + tagged + " StrIsAConstant=" + StrIsAConstant);
                }
            } else {
                if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
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
                    ConstantTerms.add(tagged);
                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                        System.out.println("extractAndClassifyFactorsInner:7:Recovered:Added:ConstantTerms:tagged=" + tagged + " StrIsAConstant=" + StrIsAConstant);
                    }
                    // 2) Variable expressions
                } else if (!isConst
                        && (tagType.equals("Var") || tagType.equals("VarExpression"))) {
                    //if ( (tagged.contains("(")) && (tagged.contains(")")) &&( (!tagged.contains("+)")) && (!tagged.contains("-)"))) )
                    //    tagged=tagged.replaceAll("\\(", "").replaceAll("\\)", "");
                    xTerms.add(tagged);
                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                        System.out.println("extractAndClassifyFactorsInner:8:Recovered:Added:xTerms:tagged=" + tagged + " StrIsAConstant=" + StrIsAConstant);
                    }
                    // 3) All other symbolic forms
                } else if ((!IsAConstant(factor, DiffWithRespTo))
                        && ((StrIsAConstant.equals("IndConstant")) || StrIsAConstant.equals("IndConstantExpression"))) {
                    //if ( (tagged.contains("(")) && (tagged.contains(")")) &&( (!tagged.contains("+)")) && (!tagged.contains("-)"))) )
                    //        tagged=tagged.replaceAll("\\(", "").replaceAll("\\)", "");
                    otherTerms.add(tagged);
                    IsAConstant(factor, DiffWithRespTo);
                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                        System.out.println("extractAndClassifyFactorsInner:9:Recovered:Added:otherTerms:tagged=" + tagged + " StrIsAConstant=" + StrIsAConstant);
                    }
                }
            }
        }
        return pos;
    }

    public static List<String> splitFactors(String expr, String DiffWithRespTo, boolean HideAllFlag) {
        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
            System.out.println("splitFactors:expr=" + expr);
        }
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
        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
            System.out.println("splitFactors:Return Value:expr=" + expr);
        }
        return factors;
    }
public static List<String> splitFactors1(String expr, String DiffWithRespTo, boolean HideAllFlag) {
        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
            System.out.println("splitFactors1:expr=" + expr);
        }
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
            if (!inExponent) {
                 if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                        System.out.println("splitFactors1:Possible Base:expr=" + expr);
                    }
                // Base
                String MyTemp=current.toString()+c;
                if ((MyTemp.startsWith("*"))||(MyTemp.startsWith("/"))||(MyTemp.startsWith("+"))||(MyTemp.startsWith("-")))
                    MyTemp=MyTemp.substring(1);
                if ( (IsAConstant(MyTemp, DiffWithRespTo)) &&(StrIsAConstant.equalsIgnoreCase("Number")) && (!MyTemp.contains(".")) &&( i+1 < expr.length())&&(expr.charAt(i+1)=='^') ) {
                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                        System.out.println("splitFactors1:Definite Numeric Integer Base:MyTemp=" + MyTemp);
                    }
                    current.append(MyTemp + ".0");
                    if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
                        System.out.println("splitFactors1:Base:expr=" + expr);
                    }
                    continue;
                }
            } else if (inExponent) {
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
        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
            System.out.println("splitFactors1:Return Value:expr=" + expr);
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
                    }else {
                        
                    }

// Append final form
                    String numStr = num.toString();
                    if ((!numStr.equalsIgnoreCase("")) && (!numStr.contains("."))) {
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
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
                        if ((HideAllFlag == true) && (DevelopmentFlag) || (GBLSilent.equalsIgnoreCase("Verbose"))) {
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
        if (MyTermOutput > 0.0) {
            TermOutput += MyTermOutput;
            sbLongForm.append(DiffWithRespTo + "^" + MyTermOutput);
            return sbLongForm.toString();
        } else if (sb.toString().equalsIgnoreCase(DiffWithRespTo)) {
            TermOutput++;
            sbLongForm.append(DiffWithRespTo);
            return sbLongForm.toString();
        }
        return sbLongForm.toString();
    }

    /**
     * Classify a single term into xTerms, numericFactors, or otherTerms.
     */
    public static void classifyFactors(String bare, String cleaned, String factor, String DiffWithRespTo, boolean ContainsParenFlag, boolean ContainsPlusMinusFlag, boolean HideAllFlag) {
        if ((HideAllFlag == true) && (DevelopmentDeepInfoFlag) || (GBLSilentDeepInfo.equalsIgnoreCase("Verbose"))) {
            IsAConstant(bare, DiffWithRespTo);
            System.out.println("classifyFactors: IsAConstant:" + IsAConstant(bare, DiffWithRespTo) + " StrIsAConstant=" + StrIsAConstant + " bare=" + bare + " ContainsPlusMinusFlag=" + ContainsPlusMinusFlag);
            System.out.println("classifyFactors: IsAConstant:" + IsAConstant(cleaned, DiffWithRespTo) + " StrIsAConstant=" + StrIsAConstant + " cleaned=" + cleaned + " ContainsParenFlag=" + ContainsParenFlag);
            System.out.println("classifyFactors: IsAConstant:" + IsAConstant(factor, DiffWithRespTo) + " StrIsAConstant=" + StrIsAConstant + " factor=" + factor);
        }
        if ((factor.contains(DiffWithRespTo)) && (!IsAConstant(factor, DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("Var"))
                || (StrIsAConstant.equalsIgnoreCase("VarExpression")))) {
            if ((ContainsParenFlag) && (ContainsPlusMinusFlag))
                       ; else if ((!ContainsParenFlag) && (!ContainsPlusMinusFlag))
                       ; else {
                factor = factor.replace("(", "").replace(")", "");
            }
            xTerms.add(factor);
            System.out.println("classifyFactors:Added xTerms:factor=" + factor);
        } else if ((IsAConstant(factor, DiffWithRespTo))
                && ((StrIsAConstant.equalsIgnoreCase("Number")) || (StrIsAConstant.equalsIgnoreCase("NumberExpression")))) {
            if ((ContainsParenFlag) && (ContainsPlusMinusFlag)) {
                //Expression TempObj = (() -> 0.0);
                String TempStr = "";
                char opCode = factor.substring(0).charAt(0);
                MathsExpressionParser.Expression TempObj = MathsExpressionParser.parse(bare, variables, DiffWithRespTo, true, "Verbose", MathsExpressionParser.LogLevel.Info);
                if (TempObj.eval() < 0) {
                    TempStr = "" + (-TempObj.eval());
                } else if (TempObj.eval() > 0) {
                    TempStr = "" + (TempObj.eval());
                } else if (TempObj.eval() == 0.0) {
                    TempStr = "" + (TempObj.eval());
                }
                //System.out.println("classifyFactors:Expression:Added:TempStr=" + TempStr + " TempObj.eval()=" + TempObj.eval() + " factor=" + factor);             
                if (ConstantTerms.isEmpty()) {
                    String TempStr1 = "";
                    TempStr1 = factor.substring(1);
                    ConstantTerms.add(TempStr1);
                } else {
                    ConstantTerms.add(opCode + TempStr);
                }
                //System.out.println("classifyFactors:Expression:Added:factor=" + factor);
            } else {
                if (ContainsParenFlag) {
                    factor = factor.replace("(", "").replace(")", "");
                }
                if (ConstantTerms.isEmpty()) {
                    String TempStr = "";
                    TempStr = factor.substring(1);
                    ConstantTerms.add(TempStr);
                } else {
                    ConstantTerms.add(factor);
                }
                //System.out.println("classifyFactors:Else:Added:factor=" + factor);
            }
        } else if ((!IsAConstant(factor, DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant"))
                || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
            if ((ContainsParenFlag) && (ContainsPlusMinusFlag))
                       ; else if ((!ContainsParenFlag) && (!ContainsPlusMinusFlag))
                       ; else {
                factor = factor.replace("(", "").replace(")", "");
            }
            otherTerms.add(factor);
            System.out.println("classifyFactors:Added otherTerms:factor=" + factor);
        } else if ((!IsAConstant(bare, DiffWithRespTo)) && ((StrIsAConstant.equalsIgnoreCase("IndConstant"))
                || (StrIsAConstant.equalsIgnoreCase("IndConstantExpression")))) {
            if ((ContainsParenFlag) && (ContainsPlusMinusFlag))
                       ; else if ((!ContainsParenFlag) && (!ContainsPlusMinusFlag))
                       ; else {
                factor = factor.replace("(", "").replace(")", "");
            }
            otherTerms.add(factor);
            System.out.println("classifyFactors:Added otherTerms:factor=" + factor);
        }
    }

    /**
     * ************************************************************
     */
    /**
     * ************* Lambda Low Level Mapping Functions *****
     */
    /**
     * ************************************************************
     */
    @FunctionalInterface
    public interface ReasoningSignLambda {

        String apply();
    }

    public static ReasoningSignLambda parseReasonSign(String CompleteTerm, String AlgoName, String ActualRuleUsed, String CompleteStr, int strlength, int Term1, int Term2, String DiffWithRespTo) {
        return new Object() {
            ReasoningSignLambda Apply() {
                ReasoningSignLambda x = () -> "";
                StringBuilder explanation = new StringBuilder("Reasoning Steps:");
                int i = 0;
                explanation.append("AlgoName=" + AlgoName + " Sign" + "\n");
                explanation.append("ActualRuleUsed=" + ActualRuleUsed + "\n");
                explanation.append("Complete String=" + CompleteTerm + "\n");
                if (strlength == 1) {
                    explanation.append("Mapped(Output)").append(":=").append("+" + (char) ('0' + strlength)).append("\n");
                } else if (strlength == 0) {
                    explanation.append("Mapped(Output)").append(":=").append("No Sign)").append("\n");
                } else if (strlength == -1) {
                    explanation.append("Mapped(Output)").append(":=").append("-1").append("\n");
                }
                explanation.append("Term1(Output)").append(":=").append((char) Term1).append("\n");
                explanation.append("Term2(Input)").append(":=").append((char) Term2).append("\n");
                explanation.append("DiffWithRespTo").append(":=").append(DiffWithRespTo).append("\n");
                explanation.append("Complete Term=").append(":=").append(CompleteStr).append("\n");
                final String MyComplete = CompleteTerm.replace(CompleteStr, "");
                if ((MyComplete.startsWith("+")) || (MyComplete.startsWith("-"))) {
                    explanation.append("Complete Term with Sign=").append(MyComplete).append("\n");
                } else {
                    if ((posSign > -1) && (posSign < CompleteTerm.length())) {
                        explanation.append("Complete Term with Sign=").append((char) Term1).append(CompleteTerm.substring(0, posSign)).append("\n");
                    } else {
                        explanation.append("Complete Term with Sign=").append((char) Term1).append(CompleteTerm.substring(0)).append("\n");
                    }
                }
                x = () -> (explanation.toString());
                if ((DevelopmentReasoningLambdaFlag) || (GBLSilentReasoningLambda.equalsIgnoreCase("Verbose"))) {
                    System.out.println(x.apply());
                }
                return x;
            }
        }.Apply();
    }

    @FunctionalInterface
    public interface ReasoningLambda {

        String apply();
    }

    public static ReasoningLambda parseReason(String MapType, String IntegrORDiffr, String ActualRuleUsed, String CompleteStr, String IndConstStr, String BracesStr, String VarStr, String ConstStr, String DiffWithRespTo) {
        return new Object() {
            ReasoningLambda Apply() {
                ReasoningLambda x = () -> "";
                StringBuilder explanation = new StringBuilder("Reasoning Steps:");
                ruleAnalytics.recordReasoning("" + TestCase, EqnUnderTest, ActualRuleUsed, "AlgebraicConformalMapping", "AlgebraicConformalMapping:" + MapType + ":FormLambda");
                int i = 0;
                explanation.append("AlgoName=" + "FormLambda");
                explanation.append(" MapType=" + MapType);
                explanation.append(" IntegrORDiffr=" + IntegrORDiffr + "\n");
                explanation.append(" ActualRuleUsed=" + ActualRuleUsed + "\n");

                explanation.append("Term" + i++ + ":IndConstStr").append(":=").append(IndConstStr).append("\n");
                explanation.append("Term" + i++ + ":BracesStr").append(":=").append(BracesStr).append("\n");
                explanation.append("Term" + i++ + ":VarStr").append(":=").append(VarStr).append("\n");
                explanation.append("Term" + i++ + ":ConstStr").append(":=").append(ConstStr).append("\n");

                explanation.append("CompleteStr=" + CompleteStr + "\n");
                x = () -> (explanation.toString());
                if (DevelopmentReasoningLambdaFlag) {
                    System.out.println(x.apply());
                }
                return x;
            }
        }.Apply();
    }

    public static String FormTermLambda(String AlgoName, String CompleteTerm, String IndConstStr, String BracesStr, String VarStr, String ConstStr, String DiffWithRespTo, boolean BracesFlag, boolean VariableFlag, boolean ConstantFlag, boolean IndConstFlag, String MapType, String IntegrORDiffr) {
        log.info("SimpleTerm:FormTermLambda:Initial :AlgoName(Calling Function)=" + AlgoName);
        log.info("SimpleTerm:FormTermLambda:Initial :IndConstStr=" + IndConstStr);
        log.info("SimpleTerm:FormTermLambda:Initial :BracesStr=" + BracesStr);
        log.info("SimpleTerm:FormTermLambda:Initial :VarStr=" + VarStr);
        log.info("SimpleTerm:FormTermLambda:Initial :ConstStr=" + ConstStr);
        log.info("SimpleTerm:FormTermLambda:Initial :DiffWithRespTo=" + DiffWithRespTo);
        log.info("SimpleTerm:FormTermLambda:Initial :BracesFlag=" + BracesFlag);
        log.info("SimpleTerm:FormTermLambda:Initial :VariableFlag=" + VariableFlag);
        log.info("SimpleTerm:FormTermLambda:Initial :ConstantFlag=" + ConstantFlag);
        log.info("SimpleTerm:FormTermLambda:Initial :IndConstFlag=" + IndConstFlag);
        log.info("SimpleTerm:FormTermLambda:Initial :TrailConstantFlag=" + TrailConstantFlag);
        log.info("SimpleTerm:FormTermLambda:Initial :TrailConstantOperator=" + (char) TrailConstantOperator);
        log.info("SimpleTerm:FormTermLambda:Initial :LATermOperator=" + (char) LATermOperator);
        log.info("SimpleTerm:FormTermLambda:Initial :LATermOperatorBraces=" + (char) LATermOperatorBraces);
        log.info("SimpleTerm:FormTermLambda:Initial :LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
        log.info("SimpleTerm:FormTermLambda:Initial :LAIndConstOperator=" + (char) LAIndConstOperator);
        log.info("SimpleTerm:FormTermLambda:Initial :LAVarTermOperator=" + (char) LAVarTermOperator);
        log.info("SimpleTerm:FormTermLambda:Initial :LAPreTermOperator=" + (char) LAPreTermOperator);
        log.info("SimpleTerm:FormTermLambda:Initial :LAMAPOperator=" + (char) LAMAPOperator);
        log.info("SimpleTerm:FormTermLambda:Initial :LADyYByDxMAPOperator=" + (char) LADyYByDxMAPOperator);
        log.info("SimpleTerm:FormTermLambda:Initial :LAConstSimpleMapFlag=" + LAConstSimpleMapFlag);
        log.info("SimpleTerm:FormTermLambda:Initial :LAConstComplexMapFlag=" + LAConstComplexMapFlag);
        log.info("SimpleTerm:FormTermLambda:Initial :LAVarSimpleMapFlag=" + LAVarSimpleMapFlag);
        log.info("SimpleTerm:FormTermLambda:Initial :LAVarComplexMapFlag=" + LAVarComplexMapFlag);
        String CompleteStr = "";
        OperatorLambda Operator = (() -> 0);
        FormLambdaIndConstRules y = (() -> "");
        FormLambdaConstRules z = (() -> "");
        FormLambdaVarExprRules a = (() -> "");
        FormLambdaBracerExprRules b = (() -> "");

        if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
            System.out.println("SimpleTerm:FormTermLambda:Initial :IndConstStr=" + IndConstStr);
            System.out.println("SimpleTerm:FormTermLambda:Initial :BracesStr=" + BracesStr);
            System.out.println("SimpleTerm:FormTermLambda:Initial :VarStr=" + VarStr);
            System.out.println("SimpleTerm:FormTermLambda:Initial :ConstStr=" + ConstStr);
            System.out.println("SimpleTerm:FormTermLambda:Initial :DiffWithRespTo=" + DiffWithRespTo);
            System.out.println("SimpleTerm:FormTermLambda:Initial :BracesFlag=" + BracesFlag);
            System.out.println("SimpleTerm:FormTermLambda:Initial :VariableFlag=" + VariableFlag);
            System.out.println("SimpleTerm:FormTermLambda:Initial :ConstantFlag=" + ConstantFlag);
            System.out.println("SimpleTerm:FormTermLambda:Initial :IndConstFlag=" + IndConstFlag);
            System.out.println("SimpleTerm:FormTermLambda:Initial :TrailConstantFlag=" + TrailConstantFlag);
            System.out.println("SimpleTerm:FormTermLambda:Initial :TrailConstantOperator=" + (char) TrailConstantOperator);
            System.out.println("SimpleTerm:FormTermLambda:Initial :LATermOperator=" + (char) LATermOperator);
            System.out.println("SimpleTerm:FormTermLambda:Initial :LATermOperatorBraces=" + (char) LATermOperatorBraces);
            System.out.println("SimpleTerm:FormTermLambda:Initial :LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
            System.out.println("SimpleTerm:FormTermLambda:Initial :LAIndConstOperator=" + (char) LAIndConstOperator);
            System.out.println("SimpleTerm:FormTermLambda:Initial :LAVarTermOperator=" + (char) LAVarTermOperator);
            System.out.println("SimpleTerm:FormTermLambda:Initial :LAPreTermOperator=" + (char) LAPreTermOperator);
            System.out.println("SimpleTerm:FormTermLambda:Initial :LAMAPOperator=" + (char) LAMAPOperator);
            System.out.println("SimpleTerm:FormTermLambda:Initial :LADyYByDxMAPOperator=" + (char) LADyYByDxMAPOperator);
            System.out.println("SimpleTerm:FormTermLambda:Initial :LAConstSimpleMapFlag=" + LAConstSimpleMapFlag);
            System.out.println("SimpleTerm:FormTermLambda:Initial :LAConstComplexMapFlag=" + LAConstComplexMapFlag);
            System.out.println("SimpleTerm:FormTermLambda:Initial :LAVarSimpleMapFlag=" + LAVarSimpleMapFlag);
            System.out.println("SimpleTerm:FormTermLambda:Initial :LAVarComplexMapFlag=" + LAVarComplexMapFlag);
        }

        if ((BracesFlag == true) && (IndConstFlag == false) && (VariableFlag == false) && (ConstantFlag == false)) {
            CompleteStr = "(" + BracesStr + ")";
            if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                System.out.println("SimpleTerm:FormTermLambda:IndConst Mapping:Rule:0:CompleteStr=" + CompleteStr + " LAVarTermOperator=" + (char) LAVarTermOperator);
            }
            ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":BracesStr Mapping:Rule:0:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
            return CompleteStr;
        }
        if (IndConstFlag) {
            y = parseFormLambdaIndConst(AlgoName, CompleteStr, CompleteTerm, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, MapType, IntegrORDiffr);
            CompleteStr = CompleteStr + y.MappedTerm();
            if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                System.out.println("SimpleTerm:FormTermLambda:IndCons Mapping:CompleteStr=" + CompleteStr + " y.MappedTerm()=" + y.MappedTerm());
            }
        }
        if (ConstantFlag) {
            z = parseFormLambdaConst(AlgoName, CompleteStr, CompleteTerm, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, MapType, IntegrORDiffr);
            CompleteStr = CompleteStr + z.MappedTerm();
            if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                System.out.println("SimpleTerm:FormTermLambda:Const Mapping:CompleteStr=" + CompleteStr + " z.MappedTerm()=" + z.MappedTerm());
            }
        }
        if (VariableFlag) {
            a = parseFormLambdaVarExpr(AlgoName, CompleteStr, CompleteTerm, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, MapType, IntegrORDiffr);
            CompleteStr = CompleteStr + a.MappedTerm();
            if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                System.out.println("SimpleTerm:FormTermLambda:VarExpr Mapping:CompleteStr=" + CompleteStr + " a.MappedTerm()=" + a.MappedTerm());
            }
        }
        if (BracesFlag) {
            b = parseFormLambdaBracerExpr(AlgoName, CompleteStr, CompleteTerm, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, MapType, IntegrORDiffr);
            CompleteStr = CompleteStr + b.MappedTerm();
        }
        log.info("SimpleTerm:FormTermLambda:Pre Final:CompleteStr=" + CompleteStr);
        if (CompleteStr.startsWith("/")) {
            CompleteStr = "1.0" + CompleteStr;
            ReasoningLambda x = parseReason(MapType, IntegrORDiffr, "FormTermLambda:Pre Final:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
        } else if (CompleteStr.startsWith("\\*")) {
            CompleteStr = CompleteStr.replaceFirst("\\*", "");
            ReasoningLambda x = parseReason(MapType, IntegrORDiffr, "FormTermLambda:Pre Final:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
        }
        log.info("SimpleTerm:FormTermLambda:Final:CompleteStr=" + CompleteStr);
        if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
            System.out.println("SimpleTerm:FormTermLambda:Final:CompleteStr=" + CompleteStr);
        }
        //return CompleteStr;
        return y.MappedTerm() + z.MappedTerm() + a.MappedTerm() + b.MappedTerm();
    }

    @FunctionalInterface
    public interface ReasoningLambdaOper {

        String apply();
    }

    public static ReasoningLambdaOper parseReasonOper(String MapType, String IntegrORDiffr, String AlgoName, String str, String ActualRuleUsed, String CompleteStr, String IndConstStr, String BracesStr, String VarStr, String ConstStr, String DiffWithRespTo, boolean BracesFlag, boolean VariableFlag, boolean ConstantFlag, boolean IndConstFlag, int NullOperator, OperatorLambda z) {
        return new Object() {
            ReasoningLambdaOper Apply() {
                ReasoningLambdaOper x = () -> "";
                StringBuilder explanation = new StringBuilder("Reasoning Steps:");
                int i = 0;
                explanation.append("AlgoName=" + AlgoName + ":" + str);
                explanation.append(" MapType=" + MapType);
                explanation.append(" IntegrORDiffr=" + IntegrORDiffr + "\n");
                explanation.append(" ActualRuleUsed=" + ActualRuleUsed + "\n");

                explanation.append("Term" + i++ + ":IndConstFlag").append(":=").append(IndConstFlag).append("\n");
                explanation.append("Term" + i++ + ":IndConstStr").append(":=").append(IndConstStr).append("\n");
                explanation.append("Term" + i++ + ":BracesFlag").append(":=").append(BracesFlag).append("\n");
                explanation.append("Term" + i++ + ":BracesStr").append(":=").append(BracesStr).append("\n");
                explanation.append("Term" + i++ + ":VariableFlag").append(":=").append(VariableFlag).append("\n");
                explanation.append("Term" + i++ + ":VarStr").append(":=").append(VarStr).append("\n");
                explanation.append("Term" + i++ + ":ConstantFlag").append(":=").append(ConstantFlag).append("\n");
                explanation.append("Term" + i++ + ":ConstStr").append(":=").append(ConstStr).append("\n");
                explanation.append("Term" + i++ + ":NullOperator").append(":=").append("" + (char) NullOperator).append("\n");

                i = 0;
                explanation.append("Term" + i++ + ":TrailConstantFlag").append(":=").append(TrailConstantFlag).append("\n");
                explanation.append("Term" + i++ + ":TrailConstantOperator").append(":=").append((char) TrailConstantOperator).append("\n");
                explanation.append("Term" + i++ + ":LATermOperator").append(":=").append((char) LATermOperator).append("\n");
                explanation.append("Term" + i++ + ":LATermOperatorBraces").append(":=").append((char) LATermOperatorBraces).append("\n");
                explanation.append("Term" + i++ + ":LAPreIndConstOperator").append(":=").append((char) LAPreIndConstOperator).append("\n");
                explanation.append("Term" + i++ + ":LAIndConstOperator").append(":=").append((char) LAIndConstOperator).append("\n");
                explanation.append("Term" + i++ + ":LAVarTermOperator").append(":=").append((char) LAVarTermOperator).append("\n");
                explanation.append("Term" + i++ + ":LAPreTermOperator").append(":=").append((char) LAPreTermOperator).append("\n");
                explanation.append("Term" + i++ + ":LATermOperator").append(":=").append((char) LATermOperator).append("\n");

                explanation.append("Term" + i++ + ":LAMAPOperator").append(":=").append((char) LAMAPOperator).append("\n");
                explanation.append("Term" + i++ + ":LADyYByDxMAPOperator").append(":=").append((char) LADyYByDxMAPOperator).append("\n");
                explanation.append("Term" + i++ + ":LAConstSimpleMapFlag").append(":=").append(LAConstSimpleMapFlag).append("\n");
                explanation.append("Term" + i++ + ":LAConstComplexMapFlag").append(":=").append(LAConstComplexMapFlag).append("\n");
                explanation.append("Term" + i++ + ":LAVarSimpleMapFlag").append(":=").append(LAVarSimpleMapFlag).append("\n");
                explanation.append("Term" + i++ + ":LAVarComplexMapFlag").append(":=").append(LAVarComplexMapFlag).append("\n");

                explanation.append("Final Operator=" + "" + (char) z.Operator() + "\n");
                x = () -> (explanation.toString());
                if (MarianaTrenchReasoningLambdaFlag) {
                    System.out.println(x.apply());
                }
                return x;
            }
        }.Apply();
    }

    @FunctionalInterface
    public interface OperatorLambda {

        int Operator();
    }

    public static OperatorLambda parseOper(String MapType, String IntegrORDiffr, String AlgoName, String str, int LastOper, String CompleteStr, String IndConstStr, String BracesStr, String VarStr, String ConstStr, String DiffWithRespTo, boolean BracesFlag, boolean VariableFlag, boolean ConstantFlag, boolean IndConstFlag, int NullOperator) {
        return new Object() {

            OperatorLambda parseOper() {
                OperatorLambda x = (() -> '*');
                if ((str.equalsIgnoreCase("PreLAIndConstOperator"))
                        && (IndConstFlag == true) && (!IndConstStr.equalsIgnoreCase(""))) {
                    x = parsePreIndConstant();
                    log.info("OperatorLambda:parseOper:IndConstantRules:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseOper:parseIndConstant:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                    }
                } else if ((str.equalsIgnoreCase("LAIndConstOperator"))
                        && (IndConstFlag == true) && (!IndConstStr.equalsIgnoreCase(""))) {
                    x = parseIndConstant();
                    log.info("OperatorLambda:parseOper:IndConstantRules:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseOper:parseIndConstant:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                    }
                } else if ((str.equalsIgnoreCase("PreConstOperator"))
                        && (ConstantFlag == true) && (!ConstStr.equalsIgnoreCase(""))) {
                    x = parsePreConstant();
                    log.info("OperatorLambda:parseOper:PreConstantRules:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseOper:parsePreConstant:parsePreConstant:x.Operator()=" + (char) x.Operator());
                    }
                } else if ((str.equalsIgnoreCase("PreVarOperator"))
                        && (VariableFlag == true) && (!VarStr.equalsIgnoreCase(""))) {
                    x = parsePreVar();
                    log.info("OperatorLambda:parseOper:parsePreVar:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseOper:parsePreVar:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                    }
                }
                if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                    System.out.println("OperatorLambda:parseOper:Final:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                }
                return x;
            }

            OperatorLambda parsePreIndConstant() {
                OperatorLambda x = (() -> '*');
                if (LAPreIndConstOperator == '/') {
                    if (IndConstStr.startsWith("1.0")) {
                        x = (() -> LAIndConstOperator);
                    } else {
                        x = (() -> LAIndConstOperator);
                    }
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseIndConstant:IndConstantRules:Rule1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parseIndConstant:IndConstantRules:Rule1:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseIndConstant:IndConstantRules:Rule1:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                    }
                } else if (((LAIndConstOperator == '*') && (LATermOperator == -1)) || ((LAPreTermOperator == -1) && (IndConstFlag == true))) {
                    x = (() -> LAIndConstOperator);
                    log.info("OperatorLambda:parseIndConstant:IndConstantRules:Rule2:x.Operator()=" + (char) x.Operator());
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseIndConstant:IndConstantRules:Rule2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseIndConstant:IndConstantRules:Rule2:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                    }
                } else if ((LAIndConstOperator == '/') && (LATermOperator == -1) && (LAPreTermOperator == '*')) {
                    x = (() -> LAPreTermOperator);
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseIndConstant:IndConstantRules:Rule3:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parseIndConstant:IndConstantRules:Rule3:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseIndConstant:IndConstantRules:Rule3:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                    }
                } else if ((LAIndConstOperator == '/') && (LATermOperator == -1) && (LAPreIndConstOperator == '/')) {
                    x = (() -> '*');
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseIndConstant:IndConstantRules:Rule4.1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.1:Map:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.1:Map:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                    }
                } else if ((LAIndConstOperator == '/') && (LAPreIndConstOperator == '/')) {
                    x = (() -> LAIndConstOperator);
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseIndConstant:IndConstantRules:Rule4.2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.2:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.2:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                    }
                } else if ((LAIndConstOperator == '/') && (LAPreIndConstOperator == '*')) {
                    x = (() -> LAIndConstOperator);
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseIndConstant:IndConstantRules:Rule4.3:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.3:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.3:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                    }
                } else if (LAPreIndConstOperator == -1) {
                    x = (() -> LAIndConstOperator);
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseIndConstant:IndConstantRules:Rule4.5:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.5:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.5:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                    }
                } else {
                    x = (() -> LATermOperator);
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseIndConstant:IndConstantRules:Rule4.6:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.6:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.6:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                    }
                }
                log.info("OperatorLambda:parseIndConstant:Final:x.Operator()=" + (char) x.Operator());
                if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                    System.out.println("OperatorLambda:parseIndConstant:Final:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                }
                return x;
            }

            OperatorLambda parseIndConstant() {
                OperatorLambda x = (() -> '*');
                if (LAPreIndConstOperator == '/') {
                    if (IndConstStr.startsWith("1.0")) {
                        x = (() -> LAIndConstOperator);
                    } else {
                        x = (() -> LAIndConstOperator);
                    }
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseIndConstant:IndConstantRules:Rule1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parseIndConstant:IndConstantRules:Rule1:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseIndConstant:IndConstantRules:Rule1:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                    }
                } else if (((LAIndConstOperator == '*') && (LATermOperator == -1)) || ((LAPreTermOperator == -1) && (IndConstFlag == true))) {
                    x = (() -> LAIndConstOperator);
                    log.info("OperatorLambda:parseIndConstant:IndConstantRules:Rule2:x.Operator()=" + (char) x.Operator());
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseIndConstant:IndConstantRules:Rule2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseIndConstant:IndConstantRules:Rule2:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                    }
                } else if ((LAIndConstOperator == '/') && (LATermOperator == -1) && (LAPreTermOperator == '*')) {
                    x = (() -> LAPreTermOperator);
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseIndConstant:IndConstantRules:Rule3:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parseIndConstant:IndConstantRules:Rule3:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseIndConstant:IndConstantRules:Rule3:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                    }
                } else if ((LAIndConstOperator == '/') && (LATermOperator == -1) && (LAPreIndConstOperator == '/')) {
                    x = (() -> '*');
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseIndConstant:IndConstantRules:Rule4.1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.1:Map:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.1:Map:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                    }
                } else if ((LAIndConstOperator == '/') && (LAPreIndConstOperator == '/')) {
                    x = (() -> LAIndConstOperator);
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseIndConstant:IndConstantRules:Rule4.2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.2:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.2:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                    }
                } else if ((LAIndConstOperator == '/') && (LAPreIndConstOperator == '*')) {
                    x = (() -> LAIndConstOperator);
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseIndConstant:IndConstantRules:Rule4.3:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.3:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.3:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                    }
                } else if (LAPreIndConstOperator == -1) {
                    x = (() -> LAIndConstOperator);
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseIndConstant:IndConstantRules:Rule4.5:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.5:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.5:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                    }
                } else {
                    x = (() -> LATermOperator);
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseIndConstant:IndConstantRules:Rule4.6:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.6:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.6:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                    }
                }
                log.info("OperatorLambda:parseIndConstant:Final:x.Operator()=" + (char) x.Operator());
                if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                    System.out.println("OperatorLambda:parseIndConstant:Final:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                }
                return x;
            }

            OperatorLambda parsePreConstant() {
                OperatorLambda x = (() -> '*');
                boolean DivMapFlag = false;
                if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                    System.out.println("OperatorLambda:parsePreConstant:Initial:x.Operator()=" + (char) x.Operator());
                }
                if ((LATermOperator != LAVarTermOperator) && (LATermOperator != -1) && (LAVarTermOperator != -1)) {
                    if (VarStr.equalsIgnoreCase("1.0")) {
                        x = (() -> LAVarTermOperator);
                    } else {
                        x = (() -> LAVarTermOperator);
                    }
                    log.info("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.3::x.Operator()=" + (char) x.Operator());
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreConstant:VarConstantRules:Rule1.3:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.3::x.Operator()=" + (char) x.Operator());
                    }
                } else if ((LATermOperator == LAVarTermOperator) && (LATermOperator != -1) && (LAVarTermOperator != -1) && (LAIndConstOperator == '/')) {
                    x = (() -> LAIndConstOperator);
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreConstant:VarConstantRules:Rule1.4.1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.4.1:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.4.1:x.Operator()=" + (char) x.Operator());
                    }
                } else if ((LATermOperator == LAVarTermOperator) && (LATermOperator != -1) && (LAVarTermOperator != -1)) {
                    if (VarStr.equalsIgnoreCase("1.0")) {
                        x = (() -> LATermOperator);
                    } else {
                        x = (() -> LATermOperator);
                    }
                    DivMapFlag = true;
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreConstant:VarConstantRules:Rule1.4.2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.4.2:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.4.2:x.Operator()=" + (char) x.Operator());
                    }
                } else if ((LATermOperator == -1) && (TrailConstantFlag == true) && (TrailConstantOperator == '*')) {
                    if (VarStr.equalsIgnoreCase("1.0")) {
                        x = (() -> TrailConstantOperator);
                    } else {
                        x = (() -> TrailConstantOperator);
                    }
                    DivMapFlag = true;
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreConstant:VarConstantRules:Rule1.5:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.5:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.5:x.Operator()=" + (char) x.Operator());
                    }
                } else if ((LATermOperator == -1) && (TrailConstantFlag == true) && (TrailConstantOperator == '/')) {
                    // COMMENT:BE CAREFUL OF ROUNDING UP OF DOUBLE
                    if (CompleteStr.endsWith("/")) {
                        x = (() -> '/');
                        ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                        log.info("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.1:x.Operator()=" + (char) x.Operator());
                    } else if (CompleteStr.endsWith("*")) {
                        x = (() -> '*');
                        DivMapFlag = true;
                        ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                        log.info("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.2:x.Operator()=" + (char) x.Operator());
                    } else if (!CompleteStr.equalsIgnoreCase("")) {
                        x = (() -> '/');
                        //DivMapFlag = true;
                        ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.3:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                        log.info("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.3:x.Operator()=" + (char) x.Operator());
                    } else if ((CompleteStr.equalsIgnoreCase("")) && (VarStr.equalsIgnoreCase("1.0"))) {
                        x = (() -> '/');
                        ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.4:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                        log.info("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.4:x.Operator()=" + (char) x.Operator());
                    } else {
                        x = (() -> '/');
                        DivMapFlag = true;
                        ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.5:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                        log.info("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.5:x.Operator()=" + (char) x.Operator());
                    }
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6:x.Operator()=" + (char) x.Operator());
                    }
                } else if ((ConstantFlag == true) && (!ConstStr.equalsIgnoreCase("")) && (((LAPreTermOperator == '/') && (LAConstSimpleMapFlag == true) && (LATermOperator == -1)) || ((LAVarSimpleMapFlag == false) && (LAMAPOperator == '/')))) {
                    x = (() -> '/');
                    DivMapFlag = true;
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.6:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.6:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.6:x.Operator()=" + (char) x.Operator());
                    }
                } else if ((ConstantFlag == true) && (!ConstStr.equalsIgnoreCase("")) && (LAPreTermOperator == '/') && (LAVarSimpleMapFlag == false) && (LATermOperator == -1)) {
                    x = (() -> '/');
                    DivMapFlag = true;
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.7:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.7:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.7:x.Operator()=" + (char) x.Operator());
                    }
                } else if ((ConstantFlag == true) && (!ConstStr.equalsIgnoreCase("")) && (LAPreTermOperator == '/') && (LAVarSimpleMapFlag == false)) {
                    x = (() -> NullOperator);
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.8:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.8:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.8:x.Operator()=" + (char) x.Operator());
                    }
                } else if ((ConstantFlag == true) && (!ConstStr.equalsIgnoreCase("")) && (IndConstStr.equalsIgnoreCase(""))) {
                    x = (() -> NullOperator);
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.9:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.9:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.9:x.Operator()=" + (char) x.Operator());
                    }
                } else if ((ConstantFlag == true) && (!ConstStr.equalsIgnoreCase("")) && (!IndConstStr.equalsIgnoreCase("")) && (LAPreIndConstOperator != -1) && (LAPreIndConstOperator == '*') && (LAIndConstOperator != '*')) {
                    x = (() -> LAIndConstOperator);
                    DivMapFlag = true;
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.10:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.10:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.9:x.Operator()=" + (char) x.Operator());
                    }
                } else if ((ConstantFlag == true) && (!ConstStr.equalsIgnoreCase("")) && (!IndConstStr.equalsIgnoreCase("")) && (LAPreIndConstOperator != -1) && (IndConstFlag == true)) {
                    if ((LAPreIndConstOperator == '*') || (LAPreIndConstOperator == '/')) {
                        x = (() -> LAPreIndConstOperator);
                    } else if ((LAVarTermOperator == '*') || (LAVarTermOperator == '/')) {
                        x = (() -> LAVarTermOperator);
                    } else {
                        x = (() -> '*');
                    }
                    DivMapFlag = true;
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.11:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.11:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.11:x.Operator()=" + (char) x.Operator());
                    }
                } else {
                    DivMapFlag = true;
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.11:x.Operator()=" + (char) x.Operator());
                    }
                }
                if ((LastOper > 0) && (LastOper != x.Operator()) && (DivMapFlag == false) && (x.Operator() != NullOperator) && (LastOper != NullOperator)) {
                    int temp = x.Operator();
                    throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "OperatorLambda:parsePreConstant:Unexpected LastOper: " + (char) LastOper + " NullOperator=" + (char) NullOperator + " int=" + (int) LastOper + " Pre and Post Operator Not Matching:" + (char) temp);
                }
                log.info("OperatorLambda:parsePreConstant:Final:x.Operator()=" + (char) x.Operator());
                if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                    System.out.println("OperatorLambda:parsePreConstant:Final:x.Operator()=" + (char) x.Operator());
                }
                return x;
            }

            OperatorLambda parseConstantPost() {
                OperatorLambda x = (() -> '*');

                return x;
            }

            OperatorLambda parsePreVar() {
                OperatorLambda x = (() -> '*');
                boolean DivMapFlag = false;
                if ((LATermOperator == -1) && (LAVarTermOperator != '/') && (VariableFlag == true) && (ConstantFlag == true)) {
                    //CompleteStr = CompleteStr + ConstStr + "*" + VarStr;
                    if ((LAMAPOperator == -1) && (LADyYByDxMAPOperator == -1)) {
                        x = (() -> '*');
                        ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:VarConstantRules:Normal:Rule1.7.1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                        log.info("OperatorLambda:parsePreVar:VarConstantRules:Normal:Rule1.7.1:x.Operator()=" + (char) x.Operator());
                    } else {
                        x = (() -> LAVarTermOperator);
                        ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:VarConstantRules:MAP-:Rule1.7.2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                        log.info("OperatorLambda:parsePreVar:VarConstantRules:MAP-:Rule1.7.2:x.Operator()=" + (char) x.Operator());
                    }
                    log.info("OperatorLambda:parsePreVar:VarConstantRules:Rule1.7:x.Operator()=" + (char) x.Operator());
                } else if ((LATermOperator == -1) && (LAVarTermOperator == '/') && (VariableFlag == true) && (ConstantFlag == true)) {
                    if ((LAMAPOperator == -1) && (LADyYByDxMAPOperator == -1)) {
                        if ((!ConstStr.equalsIgnoreCase("1.0")) && (LAVarTermOperator == '/')) {
                            x = (() -> '/');
                            ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:VarConstantRules:Normal:Rule1.8.2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                            log.info("OperatorLambda:parsePreVar:VarConstantRules:Normal:Rule1.8.2:x.Operator()=" + (char) x.Operator());
                        } else if ((!CompleteStr.equalsIgnoreCase("")) && (ConstStr.equalsIgnoreCase("1.0")) && (LAVarTermOperator == '/')) {
                            x = (() -> LAVarTermOperator);
                            ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:VarConstantRules:Normal:Rule1.8.3:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                            log.info("OperatorLambda:parsePreVar:VarConstantRules:Normal:Rule1.8.3:x.Operator()=" + (char) x.Operator());
                        } else if ((CompleteStr.equalsIgnoreCase("")) && (ConstStr.equalsIgnoreCase("1.0")) && (LAVarTermOperator == '/')) {
                            x = (() -> '/');
                            ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:VarConstantRules:Normal:Rule1.8.4:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                            log.info("OperatorLambda:parsePreVar:VarConstantRules:Normal:Rule1.8.4:x.Operator()=" + (char) x.Operator());
                        } else if ((CompleteStr.equalsIgnoreCase("")) && (ConstStr.equalsIgnoreCase("1.0")) && (LAVarTermOperator == '/')) {
                            x = (() -> '*');
                            ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:VarConstantRules:Normal:Rule1.8.5:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                            log.info("OperatorLambda:parsePreVar:VarConstantRules:Normal:Rule1.8.5:x.Operator()=" + (char) x.Operator());
                        } else {
                            x = (() -> NullOperator);
                            ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:VarConstantRules:Normal:Rule1.8.6:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                            log.info("OperatorLambda:parsePreVar:VarConstantRules:Normal:Rule1.8.6:x.Operator()=" + (char) x.Operator());
                        }

                        log.info("OperatorLambda:parsePreVar:VarConstantRules:Normal:Rule1.8:x.Operator()=" + (char) x.Operator());
                    } else {
                        if ((VarStr.startsWith("1.0")) && (ConstStr.equalsIgnoreCase("1.0"))) {
                            x = (() -> NullOperator);
                            ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:VarConstantRules:MAP-:Rule1.9:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                            log.info("OperatorLambda:parsePreVar:VarConstantRules:MAP-:Rule1.9:x.Operator()=" + (char) x.Operator());
                        } else if (LAPreTermOperator != -1) {
                            String Temp = VarStr.replaceFirst("1.0", "");
                            if (Temp.startsWith("/")) {
                                x = (() -> LAPreTermOperator);
                                ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:VarConstantRules:MAP-:Rule1.10:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                                log.info("OperatorLambda:parsePreVar:VarConstantRules:MAP-:Rule1.10:x.Operator()=" + (char) x.Operator());
                            } else if (LAVarComplexMapFlag == true) {
                                x = (() -> '*');
                                ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:VarConstantRules:MAP-:Rule1.11:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                                log.info("OperatorLambda:parsePreVar:VarConstantRules:MAP-:Rule1.11:x.Operator()=" + (char) x.Operator());
                            } else if (LAVarSimpleMapFlag == true) {
                                x = (() -> LAVarTermOperator);
                                ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:VarConstantRules:MAP-:Rule1.11.1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                                log.info("OperatorLambda:parsePreVar:VarConstantRules:MAP-:Rule1.11.1:x.Operator()=" + (char) x.Operator());
                            } else {
                                x = (() -> LAPreTermOperator);
                                ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:VarConstantRules:MAP-:Rule1.12:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                                log.info("OperatorLambda:parsePreVar:VarConstantRules:MAP-:Rule1.12:x.Operator()=" + (char) x.Operator());
                            }
                        } else {
                            if (VarStr.startsWith("1.0")) {
                                String Temp = VarStr.replaceFirst("1.0", "");
                                x = (() -> NullOperator);
                            } else {
                                x = (() -> '/');
                            }
                            ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:VarConstantRules:MAP-:Rule1.13:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                            log.info("OperatorLambda:parsePreVar:VarConstantRules:MAP-:Rule1.13:x.Operator()=" + (char) x.Operator());
                        }
                        log.info("OperatorLambda:parsePreVar:VarConstantRules:MAP-:Rule1.9:x.Operator()=" + (char) x.Operator());
                    }
                } else if ((LATermOperator == -1) && (LAVarTermOperator == '*') && (VariableFlag == true) && (ConstantFlag == true)) {
                    if ((ConstStr.equalsIgnoreCase("1.0"))) {
                        x = (() -> NullOperator);
                        ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:Normal:Rule1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                        log.info("OperatorLambda:parsePreVar:Normal:Rule1:x.Operator()=" + x.Operator());
                    }
                } else if ((TrailConstantFlag != true) && (VariableFlag == true) && (!VarStr.equalsIgnoreCase("")) && (!VarStr.equalsIgnoreCase("1.0")) && (!ConstStr.equalsIgnoreCase("0.0"))) {
                    log.info("OperatorLambda:parsePreVar:Normal Variable:Final:End Context:ConstStr=" + ConstStr + " TrailConstantOperator=" + (char) TrailConstantOperator + " VarStr=" + VarStr);
                    x = (() -> LAVarTermOperator);
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:End:Rule11.3:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parsePreVar:End:Rule11.3:Final:x.Operator()=" + (char) x.Operator());
                } else if ((ConstantFlag == true) && (ConstStr.equalsIgnoreCase("0.0"))) {
                    x = (() -> NullOperator);
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:End:Rule11.4:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parsePreVar:End:Rule11.4:Final:x.Operator()=" + (char) x.Operator());
                } else if ((ConstantFlag == true) || ((VariableFlag == true) && ((LAPreTermOperator == '/') || (LAMAPOperator == '/')))) {
                    if ((VariableFlag == true) && (LAPreTermOperator == '/') && (LAVarSimpleMapFlag == false)) {
                        x = (() -> '*');
                        ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:End:Rule11.5:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    } else if ((VariableFlag == true) && (LAMAPOperator == '/') && (LAVarSimpleMapFlag == true)) {
                        x = (() -> LAMAPOperator);
                        ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:End:Rule11.6:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    } else if ((VariableFlag == true) && (LAMAPOperator == '*') && (LAVarSimpleMapFlag == true)) {
                        x = (() -> LAMAPOperator);
                        ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:End:Rule11.7:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    } else {
                        if (LAVarTermOperator == -1) {
                            LAVarTermOperator = '*';
                        }
                        x = (() -> LAVarTermOperator);
                        ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:End:Rule11.8:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    }
                    log.info("OperatorLambda:parsePreVar:End:Rule11.5:Final:x.Operator()=" + (char) x.Operator());
                } else if (VariableFlag == true) {
                    x = (() -> NullOperator);
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:End:Rule11.5::", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parsePreVar:End:Rule11.5:Final:x.Operator()=" + (char) x.Operator());
                }
                log.info("OperatorLambda:parsePreVar:Final:x.Operator()=" + (char) x.Operator());
                if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                    System.out.println("OperatorLambda:parsePreVar:Final:x.Operator()=" + (char) x.Operator());
                }
                return x;
            }

            OperatorLambda parseBracesOper() {
                OperatorLambda x = (() -> '*');
                boolean DivMapFlag = false;
                if (((!CompleteStr.equalsIgnoreCase("1.0")) && ((LATermOperatorBraces == '*')))) {
                    x = (() -> LATermOperatorBraces);
                    DivMapFlag = true;
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseBracesOper:BraceStr Mapping:Rule 1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parseBracesOper:BraceStr Mapping:Rule 1:x.Operator()=" + (char) x.Operator());
                } else if (((!CompleteStr.equalsIgnoreCase("1.0")) || ((LATermOperatorBraces == '/')))) {
                    x = (() -> NullOperator);
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseBracesOper:BraceStr Mapping:Rule 2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parseBracesOper:BraceStr Mapping:Rule 2:x.Operator()=" + (char) x.Operator());
                } else if (((!CompleteStr.equalsIgnoreCase("1.0")) || ((LATermOperatorBraces == '/')))) {
                    x = (() -> LATermOperatorBraces);
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseBracesOper:BraceStr Mapping:Rule 3:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parseBracesOper:BraceStr Mapping:Rule 3:x.Operator()=" + (char) x.Operator());
                } else if ((!CompleteStr.equalsIgnoreCase("1.0")) || ((LATermOperatorBraces == '/'))) {
                    x = (() -> LATermOperatorBraces);
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseBracesOper:BraceStr Mapping:Rule 4:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parseBracesOper:BraceStr Mapping:Rule 4:x.Operator()=" + (char) x.Operator());
                } else if ((CompleteStr.equalsIgnoreCase("1.0")) && (LATermOperatorBraces == '*')) {
                    x = (() -> '*');
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseBracesOper:BraceStr Mapping:Rule 5:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parseBracesOper:BraceStr Mapping:Rule 5:x.Operator()=" + (char) x.Operator());
                }
                if ((LastOper != x.Operator()) && (DivMapFlag == false) && (x.Operator() != NullOperator) && (LastOper != NullOperator)) {
                    int temp = x.Operator();
                    throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "OperatorLambda:parsePreConstant:Unexpected LastOper: " + (char) LastOper + " int=" + (int) LastOper + " Pre and Post Operator Not Matching:" + (char) temp);
                }
                log.info("OperatorLambda:parseBracesOper:BraceStr Mapping:Final:x.Operator()=" + (char) x.Operator());
                if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                    System.out.println("OperatorLambda:parseBracesOper:BraceStr Mapping:Final:x.Operator()=" + (char) x.Operator());
                }
                return x;
            }
        }.parseOper();
    }

    @FunctionalInterface
    public interface ProLambdaExtr {

        String StrExpr();
    }

    public static ProLambdaExtr parseExpr(String AlgoName, String Diff1, String Diff2, String Rule, String DiffWithRespTo, int TermOperator, String LowLevelRules) {
        return new Object() {

            ProLambdaExtr parseExtreme() {
                ProLambdaExtr x = (() -> "");
                if (Rule.equalsIgnoreCase("ProductRule")) {
                    x = parseProductRule();
                    log.info("ProExtr:String:parseIntegrStr:NoExponentRuleTerm:x.StrExpr()=" + x.StrExpr());
                } else if (Rule.equalsIgnoreCase("QuotientRule")) {
                    x = parseQuotientRule();
                    log.info("ProExtr:String:parseIntegrStr:NoExponentRuleDiff:x.StrExpr()=" + x.StrExpr());
                }

                log.info("ProExtr:parseExtreme:Final:x.StrExpr()=" + x.StrExpr());
                return x;
            }

            ProLambdaExtr parseProductRule() {
                ProLambdaExtr x = (() -> "");
                final String Diff1Expr = Diff1;
                final String Diff2Expr = Diff2;
                if (Rule.equalsIgnoreCase("ProductRule")) {
                    if (TermOperator == '*') {
                        if ((IsAConstant(Diff1Expr, DiffWithRespTo)
                                && (StrIsAConstant.equalsIgnoreCase("Number")))
                                && ((Diff2Expr.equalsIgnoreCase("Infinity"))
                                || (Diff2Expr.equalsIgnoreCase("NaN")))) {
                            if ((Diff1Expr.equalsIgnoreCase("0.0"))
                                    && (Diff2Expr.equalsIgnoreCase("Infinity"))) {
                                //0.0*Infinity
                                x = (() -> "" + Double.NaN);
                                log.info("ProExtr:parseProductRule:Rule1:x.StrExpr()=" + x.StrExpr());
                            } else if ((Diff1Expr.equalsIgnoreCase("0.0"))
                                    && (Diff2Expr.equalsIgnoreCase("NaN"))) {
                                //0.0*NaN 
                                x = (() -> "" + Double.NaN);
                                log.info("ProExtr:parseProductRule:Rule2:x.StrExpr()=" + x.StrExpr());
                            } else if ((Diff1Expr.equalsIgnoreCase("1.0"))
                                    && (Diff2Expr.equalsIgnoreCase("Infinity"))) {
                                //1.0*Infinity 
                                x = (() -> "" + Double.POSITIVE_INFINITY);
                                log.info("ProExtr:parseProductRule:Rule3:x.StrExpr()=" + x.StrExpr());
                            } else if ((Diff1Expr.equalsIgnoreCase("1.0"))
                                    && (Diff2Expr.equalsIgnoreCase("NaN"))) {
                                //1.0*NaN
                                x = (() -> "" + Double.NaN);
                                log.info("ProExtr:parseProductRule:Rule4:x.StrExpr()=" + x.StrExpr());
                            } else if ((!Diff1Expr.equalsIgnoreCase("1.0")) && (Double.isFinite(Double.parseDouble(Diff1Expr)))
                                    && (Diff2Expr.equalsIgnoreCase("Infinity"))) {
                                //25.0*Infinity
                                x = (() -> "" + Double.POSITIVE_INFINITY);
                                log.info("ProExtr:parseProductRule:Rule5:x.StrExpr()=" + x.StrExpr());
                            } else if ((!Diff1Expr.equalsIgnoreCase("1.0")) && (Double.isFinite(Double.parseDouble(Diff1Expr)))
                                    && (Diff2Expr.equalsIgnoreCase("NaN"))) {
                                //25.0*NaN
                                x = (() -> "" + Double.NaN);
                                log.info("ProExtr:parseProductRule:Rule6:x.StrExpr()=" + x.StrExpr());
                            }
                        } else if ((!IsAConstant(Diff1Expr, DiffWithRespTo))
                                && ((Diff2Expr.equalsIgnoreCase("Infinity"))
                                || (Diff2Expr.equalsIgnoreCase("NaN")))) {
                            //String * Extr
                            if (Diff2Expr.equalsIgnoreCase("NaN")) {
                                //String * NaN
                                x = (() -> Diff1Expr + "*" + Double.NaN);
                                log.info("ProExtr:parseProductRule:Rule7:x.StrExpr()=" + x.StrExpr());
                            } else if (Diff2Expr.equalsIgnoreCase("Infinity")) {
                                //String * Infinity
                                x = (() -> Diff1Expr + "*" + Double.POSITIVE_INFINITY);
                                log.info("ProExtr:parseProductRule:Rule8:x.StrExpr()=" + x.StrExpr());
                            }
                        } else if ((IsAConstant(Diff2Expr, DiffWithRespTo)
                                && (StrIsAConstant.equalsIgnoreCase("Number")))
                                && ((Diff1Expr.equalsIgnoreCase("Infinity"))
                                || (Diff1Expr.equalsIgnoreCase("NaN")))) {
                            if ((Diff1Expr.equalsIgnoreCase("Infinity"))
                                    && (Diff2Expr.equalsIgnoreCase("0.0"))) {
                                //Infinity*0.0
                                x = (() -> "" + Double.POSITIVE_INFINITY);
                                log.info("ProExtr:parseProductRule:Rule9:x.StrExpr()=" + x.StrExpr());
                            } else if ((Diff1Expr.equalsIgnoreCase("NaN"))
                                    && (Diff2Expr.equalsIgnoreCase("0.0"))) {
                                //NaN*0.0 
                                x = (() -> "" + Double.NaN);
                                log.info("ProExtr:parseProductRule:Rule10:x.StrExpr()=" + x.StrExpr());
                            } else if ((Diff1Expr.equalsIgnoreCase("Infinity"))
                                    && (Diff2Expr.equalsIgnoreCase("1.0"))) {
                                //Infinity*1.0 
                                x = (() -> "" + Double.POSITIVE_INFINITY);
                                log.info("ProExtr:parseProductRule:Rule11:x.StrExpr()=" + x.StrExpr());
                            } else if ((Diff1Expr.equalsIgnoreCase("NaN"))
                                    && (Diff2Expr.equalsIgnoreCase("1.0"))) {
                                //NaN*1.0
                                x = (() -> "" + Double.NaN);
                                log.info("ProExtr:parseProductRule:Rule12:x.StrExpr()=" + x.StrExpr());
                            } else if ((Diff1Expr.equalsIgnoreCase("Infinity"))
                                    && ((!Diff2Expr.equalsIgnoreCase("1.0")) && (Double.isFinite(Double.parseDouble(Diff2Expr))))) {
                                //Infinity*25.0
                                x = (() -> "" + Double.POSITIVE_INFINITY);
                                log.info("ProExtr:parseProductRule:Rule13:x.StrExpr()=" + x.StrExpr());
                            } else if ((Diff1Expr.equalsIgnoreCase("NaN"))
                                    && ((!Diff2Expr.equalsIgnoreCase("1.0")) && (Double.isFinite(Double.parseDouble(Diff2Expr))))) {
                                //NaN*25.0
                                x = (() -> "" + Double.NaN);
                                log.info("ProExtr:parseProductRule:Rule14:x.StrExpr()=" + x.StrExpr());
                            }
                        } else if ((!IsAConstant(Diff2Expr, DiffWithRespTo))
                                && ((Diff1Expr.equalsIgnoreCase("Infinity"))
                                || (Diff1Expr.equalsIgnoreCase("NaN")))) {
                            //Extr * String
                            if (Diff1Expr.equalsIgnoreCase("NaN")) {
                                //NaN *String
                                x = (() -> "" + Double.NaN + "*" + Diff2Expr);
                                log.info("ProExtr:parseProductRule:Rule15:x.StrExpr()=" + x.StrExpr());
                            } else if (Diff1Expr.equalsIgnoreCase("Infinity")) {
                                //Infinity * String
                                x = (() -> "" + Double.POSITIVE_INFINITY + "*" + Diff2Expr);
                                log.info("ProExtr:parseProductRule:Rule16:x.StrExpr()=" + x.StrExpr());
                            }
                        } // Positive Test Casee
                        // Non Extremity
                        else {
                            if (!Diff1Expr.endsWith("*0.0")) {
                                x = (() -> Diff1Expr + "*" + Diff2Expr);
                            } else {
                                x = (() -> Diff1Expr);
                            }
                            log.info("ProExtr:parseProductRule:Rule17:x.StrExpr()=" + x.StrExpr());
                        }
                    }
                    log.info("ProExtr:parseProductRule:TermOperator=" + (char) TermOperator);
                    log.info("ProExtr:parseProductRule:Diff1Expr=" + Diff1Expr);
                    log.info("ProExtr:parseProductRule:Diff2Expr=" + Diff2Expr);
                    log.info("ProExtr:parseProductRule:x.StrExpr()=" + x.StrExpr());
                }
                log.info("ProExtr:parseExtreme:Final:x.StrExpr()=" + x.StrExpr());
                return x;
            }

            ProLambdaExtr parseQuotientRule() {
                ProLambdaExtr x = (() -> "");
                final String Diff1Expr = Diff1;
                final String Diff2Expr = Diff2;
                if (Rule.equalsIgnoreCase("QuotientRule")) {
                    if (TermOperator == '/') {
                        if ((IsAConstant(Diff1Expr, DiffWithRespTo)
                                && (StrIsAConstant.equalsIgnoreCase("Number")))
                                && ((Diff2Expr.equalsIgnoreCase("Infinity"))
                                || (Diff2Expr.equalsIgnoreCase("NaN")))) {
                            if ((Diff1Expr.equalsIgnoreCase("0.0"))
                                    && (Diff2Expr.equalsIgnoreCase("Infinity"))) {
                                //0.0/Infinity
                                x = (() -> "" + Double.NaN);
                                log.info("ProExtr:parseQuotientRule:Rule1:x.StrExpr()=" + x.StrExpr());
                            } else if ((Diff1Expr.equalsIgnoreCase("0.0"))
                                    && (Diff2Expr.equalsIgnoreCase("NaN"))) {
                                //0.0/NaN 
                                x = (() -> "" + Double.NaN);
                                log.info("ProExtr:parseQuotientRule:Rule2:x.StrExpr()=" + x.StrExpr());
                            } else if ((Diff1Expr.equalsIgnoreCase("1.0"))
                                    && (Diff2Expr.equalsIgnoreCase("Infinity"))) {
                                //1.0/Infinity 
                                x = (() -> "" + Double.POSITIVE_INFINITY);
                                log.info("ProExtr:parseQuotientRule:Rule3:x.StrExpr()=" + x.StrExpr());
                            } else if ((Diff1Expr.equalsIgnoreCase("1.0"))
                                    && (Diff2Expr.equalsIgnoreCase("NaN"))) {
                                //1.0/NaN
                                x = (() -> "" + Double.NaN);
                                log.info("ProExtr:parseQuotientRule:Rule4:x.StrExpr()=" + x.StrExpr());
                            } else if ((!Diff1Expr.equalsIgnoreCase("1.0")) && (Double.isFinite(Double.parseDouble(Diff1Expr)))
                                    && (Diff2Expr.equalsIgnoreCase("Infinity"))) {
                                //25.0/Infinity
                                x = (() -> "" + Double.POSITIVE_INFINITY);
                                log.info("ProExtr:parseQuotientRule:Rule5:x.StrExpr()=" + x.StrExpr());
                            } else if ((!Diff1Expr.equalsIgnoreCase("1.0")) && (Double.isFinite(Double.parseDouble(Diff1Expr)))
                                    && (Diff2Expr.equalsIgnoreCase("NaN"))) {
                                //25.0/NaN
                                x = (() -> "" + Double.NaN);
                                log.info("ProExtr:parseQuotientRule:Rule6:x.StrExpr()=" + x.StrExpr());
                            }
                        } else if ((!IsAConstant(Diff1Expr, DiffWithRespTo))
                                && ((Diff2Expr.equalsIgnoreCase("Infinity"))
                                || (Diff2Expr.equalsIgnoreCase("NaN")))) {
                            //String / Extr
                            if (Diff2Expr.equalsIgnoreCase("NaN")) {
                                //String / NaN
                                x = (() -> Diff1Expr + "/" + Double.NaN);
                                log.info("ProExtr:parseQuotientRule:Rule7:x.StrExpr()=" + x.StrExpr());
                            } else if (Diff2Expr.equalsIgnoreCase("Infinity")) {
                                //String / Infinity
                                x = (() -> Diff1Expr + "/" + Double.POSITIVE_INFINITY);
                                log.info("ProExtr:parseQuotientRule:Rule8:x.StrExpr()=" + x.StrExpr());
                            }
                        } else if ((IsAConstant(Diff2Expr, DiffWithRespTo)
                                && (StrIsAConstant.equalsIgnoreCase("Number")))
                                && ((Diff1Expr.equalsIgnoreCase("Infinity"))
                                || (Diff1Expr.equalsIgnoreCase("NaN")))) {
                            if ((Diff1Expr.equalsIgnoreCase("Infinity"))
                                    && (Diff2Expr.equalsIgnoreCase("0.0"))) {
                                //Infinity/0.0
                                x = (() -> "" + Double.NaN);
                                log.info("ProExtr:parseQuotientRule:Rule9:x.StrExpr()=" + x.StrExpr());
                            } else if ((Diff1Expr.equalsIgnoreCase("NaN"))
                                    && (Diff2Expr.equalsIgnoreCase("0.0"))) {
                                //NaN/0.0 
                                x = (() -> "" + Double.NaN);
                                log.info("ProExtr:parseQuotientRule:Rule10:x.StrExpr()=" + x.StrExpr());
                            } else if ((Diff1Expr.equalsIgnoreCase("Infinity"))
                                    && (Diff2Expr.equalsIgnoreCase("1.0"))) {
                                //Infinity/1.0 
                                x = (() -> "" + Double.POSITIVE_INFINITY);
                                log.info("ProExtr:parseQuotientRule:Rule11:x.StrExpr()=" + x.StrExpr());
                            } else if ((Diff1Expr.equalsIgnoreCase("NaN"))
                                    && (Diff2Expr.equalsIgnoreCase("1.0"))) {
                                //NaN/1.0
                                x = (() -> "" + Double.NaN);
                                log.info("ProExtr:parseQuotientRule:Rule12:x.StrExpr()=" + x.StrExpr());
                            } else if ((Diff1Expr.equalsIgnoreCase("Infinity"))
                                    && ((!Diff2Expr.equalsIgnoreCase("1.0")) && (Double.isFinite(Double.parseDouble(Diff2Expr))))) {
                                //Infinity/25.0
                                x = (() -> "" + Double.POSITIVE_INFINITY);
                                log.info("ProExtr:parseQuotientRule:Rule13:x.StrExpr()=" + x.StrExpr());
                            } else if ((Diff1Expr.equalsIgnoreCase("NaN"))
                                    && ((!Diff2Expr.equalsIgnoreCase("1.0")) && (Double.isFinite(Double.parseDouble(Diff2Expr))))) {
                                //NaN/25.0
                                x = (() -> "" + Double.NaN);
                                log.info("ProExtr:parseQuotientRule:Rule14:x.StrExpr()=" + x.StrExpr());
                            }
                        } else if ((!IsAConstant(Diff2Expr, DiffWithRespTo))
                                && ((Diff1Expr.equalsIgnoreCase("Infinity"))
                                || (Diff1Expr.equalsIgnoreCase("NaN")))) {
                            //Extr / String
                            if (Diff1Expr.equalsIgnoreCase("NaN")) {
                                //NaN / String
                                x = (() -> "" + Double.NaN + "/" + Diff2Expr);
                                log.info("ProExtr:parseQuotientRule:Rule15:x.StrExpr()=" + x.StrExpr());
                            } else if (Diff1Expr.equalsIgnoreCase("Infinity")) {
                                //Infinity / String
                                x = (() -> "" + Double.POSITIVE_INFINITY + "/" + Diff2Expr);
                                log.info("ProExtr:parseQuotientRule:Rule16:x.StrExpr()=" + x.StrExpr());
                            }
                        } // Positive Test Casee
                        // Non Extremity
                        else {
                            x = (() -> Diff1Expr + "/" + Diff2Expr);
                            log.info("ProExtr:parseQuotientRule:Rule17:x.StrExpr()=" + x.StrExpr());
                        }
                    }
                    log.info("ProExtr:parseQuotientRule:x.StrExpr()=" + x.StrExpr());
                }
                log.info("ProExtr:parseQuotientRule:TermOperator=" + (char) TermOperator);
                log.info("ProExtr:parseQuotientRule:Diff1Expr=" + Diff1Expr);
                log.info("ProExtr:parseQuotientRule:Diff2Expr=" + Diff2Expr);
                log.info("ProExtr:parseQuotientRule:Final:x.StrExpr()=" + x.StrExpr());
                return x;
            }
        }.parseExtreme();
    }

    @FunctionalInterface
    public interface FormLambdaIndConstRules {

        String MappedTerm();
    }

    public static FormLambdaIndConstRules parseFormLambdaIndConst(String AlgoName, String MyTermCompleteStr, String CompleteTerm, String IndConstStr, String BracesStr, String VarStr, String ConstStr, String DiffWithRespTo, boolean BracesFlag, boolean VariableFlag, boolean ConstantFlag, boolean IndConstFlag, String MapType, String IntegrORDiffr) {
        return new Object() {

            FormLambdaIndConstRules parseIndConst() {
                FormLambdaIndConstRules x = (() -> "");
                if (MapType.equalsIgnoreCase("Map1")) {
                    x = Map1IndConstRules();
                } else if (MapType.equalsIgnoreCase("Map2")) {
                    x = Map2IndConstRules();
                }
                return x;
            }

            FormLambdaIndConstRules Map1IndConstRules() {
                FormLambdaIndConstRules y = (() -> "");
                String CompleteStr = MyTermCompleteStr;
                LookAheadOperAI.OperatorLambda Operator = (() -> 0);
                LookAheadOperAI.OperatorLambda PreOperator = (() -> 0);

                if ((IndConstFlag == true) && (!IndConstStr.equalsIgnoreCase(""))) {
                    PreOperator = LookAheadOperAI.parseOper(MapType, IntegrORDiffr, AlgoName, "PreLAIndConstOperator", PreOperator.Operator(), CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, ' ');
                    Operator = LookAheadOperAI.parseOper(MapType, IntegrORDiffr, AlgoName, "LAIndConstOperator", Operator.Operator(), CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, ' ');
                    if ((Operator.Operator() != 0) && (((VariableFlag == true) && (!VarStr.equalsIgnoreCase(""))) || (ConstantFlag == true) || (BracesFlag == true))) {
                        if ((VariableFlag == true) && (ConstantFlag == true) && (!ConstStr.equalsIgnoreCase("1.0")) && (LATermOperator == '*')) {
                            if ((LAPreIndConstOperator == '/') && (LATermOperator == '*')) {
                                if (IndConstStr.startsWith("1.0/")) {
                                    CompleteStr = IndConstStr + (char) LATermOperator;
                                    ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.1.1.1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                } else {
                                    CompleteStr = "1.0/" + IndConstStr + (char) LATermOperator;
                                    ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.1.1.2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                }
                            } else if ((LAPreIndConstOperator == '*') && (LATermOperator == '*')) {
                                CompleteStr = IndConstStr + (char) LATermOperator;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.1.2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            } else if ((LAPreIndConstOperator == '/') && (LATermOperator == '/')) {
                                CompleteStr = "1.0/" + IndConstStr + (char) LATermOperator;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.1.3:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            } else if ((LAPreIndConstOperator == '*') && (LATermOperator == '/')) {
                                CompleteStr = "1.0*" + IndConstStr + (char) LATermOperator;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.1.4:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            } else {
                                CompleteStr = IndConstStr + (char) Operator.Operator();
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.1.5:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            }
                            log.info("SimpleTerm:FormTermLambda:IndConst Mapping:Rule:1.1.1:CompleteStr=" + CompleteStr);
                            ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                        } else if ((VariableFlag == true) && (ConstantFlag == true) && (!ConstStr.equalsIgnoreCase("1.0")) && (LAVarTermOperator == '*')) {
//                            if ( (LAIndConstOperator=='/') &&(LAPreTermOperator=='/')&&(LAPreIndConstOperator=='*') ){
//                                CompleteStr = IndConstStr ;
//                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.2", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, CompleteStr);
//                                log.info("SimpleTerm:FormTermLambda:IndConst Mapping:Rule:1.1.2:CompleteStr=" + CompleteStr);
//                            }else {
                            if ((ConstantFlag == true) && (!ConstStr.equalsIgnoreCase("1.0")) && (LAPreIndConstOperator != LATermOperator) && (LATermOperator != -1)) {
                                CompleteStr = IndConstStr + (char) LATermOperator;
                            } else if (Operator.Operator() != -1) {
                                CompleteStr = IndConstStr + (char) Operator.Operator();
                            }
                            ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.3", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            log.info("SimpleTerm:FormTermLambda:IndConst Mapping:Rule:1.1.3:CompleteStr=" + CompleteStr);
                            //}
                        } else if (((ConstantFlag == true)) && ((Operator.Operator() == LAVarTermOperator) && (LAVarTermOperator != -1))) {
                            if ((ConstantFlag == true) && (LAPreIndConstOperator == '/')) {
                                if (IndConstStr.startsWith("1.0" + LAPreIndConstOperator)) {
                                    CompleteStr = IndConstStr;
                                    ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.4.1", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                } else if ((IndConstStr.startsWith("" + (char) LAPreIndConstOperator)) && (LAPreIndConstOperator == '/')) {
                                    CompleteStr = "1.0" + (char) LAPreIndConstOperator + IndConstStr;
                                    ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.4.2", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                } else if ((IsVariable(IndConstStr.charAt(0))) && (LAPreIndConstOperator == '*')) {
                                    CompleteStr = "1.0" + (char) LAPreIndConstOperator + IndConstStr;
                                    ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.4.2", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                } else {
                                    if ((VariableFlag == true) && (!VarStr.equalsIgnoreCase(""))) {
                                        CompleteStr = IndConstStr + (char) LATermOperator;
                                        ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.4.2.1", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                    } else {
                                        CompleteStr = IndConstStr;
                                        ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.4.2.2", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                    }
                                }
                            } else if ((VariableFlag == true) && (ConstantFlag == true) && (LAIndConstOperator == '/') && ((LATermOperator == '/') || (LAPreTermOperator == '/'))) {
                                CompleteStr = IndConstStr + (char) LAIndConstOperator;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.4.3", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            } else if ((VariableFlag == true) && (ConstantFlag == true) && (LAIndConstOperator == '/') && ((LATermOperator == '*') || (LAPreTermOperator == '*'))) {
                                if((ConstStr.equalsIgnoreCase("1.0"))&&(VariableFlag == true)){
                                    CompleteStr = IndConstStr + (char) LAVarTermOperator;
                                    ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.4.4.A", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                }else if (!ConstStr.equalsIgnoreCase("1.0")){
                                    CompleteStr = IndConstStr + (char) LATermOperator;
                                    ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.4.4.B", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                }
                            } else if ((ConstantFlag == true) && (!ConstStr.equalsIgnoreCase("1.0")) && (LAIndConstOperator == '*') && ((LATermOperator == '*') || (LAPreTermOperator == '*'))) {
                                CompleteStr = IndConstStr + (char) LATermOperator;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.4.5", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            } else if ((ConstantFlag == true) && (Operator.Operator() == '*') && ((LATermOperator == '*') || (LAPreTermOperator == '*'))) {
                                if ((VariableFlag == false) && ((VarStr == null) || (VarStr.equalsIgnoreCase("")))) {
                                    CompleteStr = IndConstStr;
                                    ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.4.6.1", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                } else {
                                    CompleteStr = IndConstStr + (char) Operator.Operator();
                                    ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.4.6.2", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                }
                            } else if ((ConstantFlag == true) && (Operator.Operator() == '/') && ((LATermOperator == '*') && (LAPreTermOperator == '*'))) {
                                CompleteStr = IndConstStr + (char) Operator.Operator();
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.4.7", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            } else if ((ConstantFlag == true) && (Operator.Operator() == '/') && ((LATermOperator == '/') && (LAPreTermOperator == '/'))) {
                                CompleteStr = IndConstStr + (char) Operator.Operator();
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.4.8", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            } else {
                                CompleteStr = IndConstStr;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.4.9", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            }
                            log.info("SimpleTerm:FormTermLambda:IndConst Mapping:Rule:1.1.4:CompleteStr=" + CompleteStr);
                        } else if ((VariableFlag == true) && (LAVarTermOperator == '/')) {
                            if ((VariableFlag == true) && (IndConstFlag == true) && (VarStr.contains(IndConstStr))) {
                                CompleteStr = "";
                            } else {
                                CompleteStr = IndConstStr + (char) LAVarTermOperator;
                            }
                            ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.5", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            log.info("SimpleTerm:FormTermLambda:IndConst Mapping:Rule:1.1.5:CompleteStr=" + CompleteStr);
                        } else {
                            if ((ConstantFlag == true) && (!ConstStr.equalsIgnoreCase("1.0")) && (Operator.Operator() != -1)) {
                                CompleteStr = IndConstStr + (char) LATermOperator;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.6.1", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            } else if ((VariableFlag == true) && (Operator.Operator() != LAVarTermOperator) && (Operator.Operator() != -1)) {
                                CompleteStr = IndConstStr + (char) LAVarTermOperator;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.6.1", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            } else if (LAPreIndConstOperator == '/') {
                                if (IndConstStr.startsWith("1.0" + (char) LAPreIndConstOperator)) {
                                    CompleteStr = IndConstStr;
                                    ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.6.2.1", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                } else {
                                    CompleteStr = "1.0/" + IndConstStr;
                                    ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.6.2.2", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                }
                            } else if (((ConstantFlag == true) && (!ConstStr.equalsIgnoreCase("1.0"))) && ((LAPreIndConstOperator == '*') || (LAPreIndConstOperator == -1))) {
                                CompleteStr = IndConstStr + (char) LATermOperator;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.6.3", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            } else if (((ConstantFlag == true) && (ConstStr.equalsIgnoreCase("1.0"))) && ((LAPreIndConstOperator == '*') || (LAPreIndConstOperator == -1))) {
                                CompleteStr = IndConstStr;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.6.3", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            } else if (VariableFlag == true) {
                                CompleteStr = IndConstStr;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.6.3", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            }
                            ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.6", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            log.info("SimpleTerm:FormTermLambda:IndConst Mapping:Rule:1.1.5:CompleteStr=" + CompleteStr);
                        }
                    } else {
                        CompleteStr = IndConstStr;
                        ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1:else", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                    }
                    log.info("SimpleTerm:FormTermLambda:IndConst Mapping:Rule:1:CompleteStr=" + CompleteStr);
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("SimpleTerm:FormTermLambda:IndConst Mapping:Rule:1:CompleteStr=" + CompleteStr + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    }
                }
                final String MyCompleteStr = CompleteStr;
                y = (() -> MyCompleteStr);
                return y;
            }

            FormLambdaIndConstRules Map2IndConstRules() {
                FormLambdaIndConstRules y = (() -> "");
                String CompleteStr = MyTermCompleteStr;
                LookAheadOperAI.OperatorLambda Operator = (() -> 0);
                if ((IndConstFlag == true) && (!IndConstStr.equalsIgnoreCase(""))) {
                    Operator = LookAheadOperAI.parseOper(MapType, IntegrORDiffr, AlgoName, "LAIndConstOperator", Operator.Operator(), CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, ' ');
                    if ((Operator.Operator() != 0) && (((VariableFlag == true) && (!VarStr.equalsIgnoreCase(""))) || (ConstantFlag == true) || (BracesFlag == true))) {
                        if ((VariableFlag == true) && (ConstantFlag == true) && (!ConstStr.equalsIgnoreCase("1.0")) && (LATermOperator == '/')) {
                            if ((LAPreIndConstOperator == '/') && (LATermOperator == '*')) {
                                CompleteStr = "1.0/" + IndConstStr + (char) LATermOperator;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.1.1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            } else if ((LAPreIndConstOperator == '*') && (LATermOperator == '*')) {
                                CompleteStr = IndConstStr + (char) LATermOperator;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.1.2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            } else if ((LAPreIndConstOperator == '/') && (LATermOperator == '/') && (!IndConstStr.startsWith("1.0" + (char) LAPreIndConstOperator))) {
                                CompleteStr = "1.0/" + IndConstStr + (char) LATermOperator;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.1.3:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            } else if ((LAPreIndConstOperator == '/') && (LATermOperator == '/') && (IndConstStr.startsWith("1.0" + (char) LAPreIndConstOperator))) {
                                CompleteStr = IndConstStr + (char) LATermOperator;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.1.4:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            } else if ((LAPreIndConstOperator == '*') && (LATermOperator == '/')) {
                                CompleteStr = IndConstStr + (char) LATermOperator;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.1.5:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            } else {
                                CompleteStr = IndConstStr + (char) Operator.Operator();
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.1.6:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            }
                            log.info("SimpleTerm:FormTermLambda:IndConst Mapping:Rule:1.1.1:CompleteStr=" + CompleteStr);
                            ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                        } else if ((VariableFlag == true) && (ConstantFlag == true) && (!ConstStr.equalsIgnoreCase("1.0")) && (LAVarTermOperator == '*')) {
                            if ((LAIndConstOperator == '/') && (LAPreTermOperator == '/') && (LAPreIndConstOperator == '*')) {
                                CompleteStr = IndConstStr;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.2.1", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:IndConst Mapping:Rule:1.1.2:CompleteStr=" + CompleteStr);
                            } else {
                                if ((Operator.Operator() == -1) && (LAPreIndConstOperator == '*') && (ConstantFlag == true) && (!ConstStr.equalsIgnoreCase("1.0")) && (LATermOperator != LAPreIndConstOperator)) {
                                    CompleteStr = IndConstStr + (char) LATermOperator;
                                    ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.2.2.1", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                } else if (Operator.Operator() == -1) {
                                    CompleteStr = "1.0" + (char) LAPreIndConstOperator + IndConstStr;
                                    ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.2.2.2", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                } else if (LAPreIndConstOperator == '/') {
                                    if (IndConstStr.startsWith("1.0" + (char) LAPreIndConstOperator)) {
                                        CompleteStr = IndConstStr + (char) LATermOperator;
                                        ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.2.2.3.1", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                    } else {
                                        CompleteStr = "1.0" + (char) LAPreIndConstOperator + IndConstStr + (char) LATermOperator;
                                        ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.2.2.3.2", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                    }
                                } else if (LAPreIndConstOperator == '*') {
                                    CompleteStr = IndConstStr + (char) LATermOperator;
                                    ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.2.2.3.3", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                }
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.2.2", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:IndConst Mapping:Rule:1.1.2:CompleteStr=" + CompleteStr);
                            }
                        } else if (((VariableFlag == true)) && ((Operator.Operator() == LAVarTermOperator))) {
                            CompleteStr = IndConstStr + (char) Operator.Operator();
                            ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.3", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            log.info("SimpleTerm:FormTermLambda:IndConst Mapping:Rule:1.1.3:CompleteStr=" + CompleteStr);
                        } else {
                            if ((ConstantFlag == true) && (LAPreIndConstOperator == '/')) {
                                if (IndConstStr.startsWith("1.0" + LAPreIndConstOperator)) {
                                    CompleteStr = IndConstStr;
                                    ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.4.1.1", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                } else if ((IndConstStr.startsWith("" + (char) LAPreIndConstOperator)) && (LAPreIndConstOperator == '/')) {
                                    CompleteStr = "1.0" + (char) LAPreIndConstOperator + IndConstStr;
                                    ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.4.1.2", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                } else if ((IsVariable(IndConstStr.charAt(0))) && (LAPreIndConstOperator == '*')) {
                                    CompleteStr = "1.0" + (char) LAPreIndConstOperator + IndConstStr;
                                    ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.4.1.3", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                } else {
                                    if ((VariableFlag == true) && (!VarStr.equalsIgnoreCase(""))) {
                                        CompleteStr = IndConstStr + (char) LATermOperator;
                                        ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.4.2.1", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                    } else {
                                        CompleteStr = IndConstStr;
                                        ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.4.2.2", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                    }
                                }
                            } else if ((VariableFlag == true) && (ConstantFlag == true) && (LAIndConstOperator == '/') && ((LATermOperator == '/') || (LAPreTermOperator == '/'))) {
                                CompleteStr = IndConstStr + (char) LAIndConstOperator;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.4.3", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            } else if ((VariableFlag == true) && (ConstantFlag == true) && (LAIndConstOperator == '/') && ((LATermOperator == '*') || (LAPreTermOperator == '*'))) {
                                CompleteStr = IndConstStr + (char) LATermOperator;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.4.4", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            } else if ((ConstantFlag == true) && (LAIndConstOperator == '*') && ((LATermOperator == '*') || (LAPreTermOperator == '*'))) {
                                if ((VariableFlag == true) && (ConstStr.equalsIgnoreCase("1.0")) && ((LAVarTermOperator == '*') || (LAVarTermOperator == '/'))) {
                                    CompleteStr = IndConstStr;
                                } else if ((VariableFlag == false) && (ConstStr.equalsIgnoreCase("1.0"))) {
                                    CompleteStr = IndConstStr;
                                } else {
                                    CompleteStr = IndConstStr + (char) LATermOperator;

                                }
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.4.5", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            } else if ((ConstantFlag == true) && (Operator.Operator() == '*') && ((LATermOperator == '*') || (LAPreTermOperator == '*'))) {
                                CompleteStr = IndConstStr + (char) Operator.Operator();
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.4.6", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            } else if ((ConstantFlag == true) && (Operator.Operator() == '/') && ((LATermOperator == '*') && (LAPreTermOperator == '*'))) {
                                if ((ConstStr.equalsIgnoreCase("1.0")) && (LAPreIndConstOperator == '*')) {
                                    CompleteStr = IndConstStr;
                                } else {
                                    CompleteStr = IndConstStr + (char) Operator.Operator();
                                }
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.4.7", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            } else if ((ConstantFlag == true) && (Operator.Operator() == '/') && ((LATermOperator == '/') && (LAPreTermOperator == '/'))) {
                                CompleteStr = IndConstStr + (char) Operator.Operator();
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.4.8", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            } else {
                                CompleteStr = IndConstStr;
                            }
                            ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1.1.4", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            log.info("SimpleTerm:FormTermLambda:IndConst Mapping:Rule:1.1.4:CompleteStr=" + CompleteStr);
                        }
                    } else {
                        CompleteStr = IndConstStr;
                        ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":IndConst Mapping:Rule:1:else", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                    }
                    log.info("SimpleTerm:FormTermLambda:IndConst Mapping:Rule:1:CompleteStr=" + CompleteStr);
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("SimpleTerm:FormTermLambda:IndConst Mapping:Rule:1:CompleteStr=" + CompleteStr + " LAVarTermOperator=" + (char) LAVarTermOperator);
                    }
                }
                final String MyCompleteStr = CompleteStr;
                y = (() -> MyCompleteStr);
                return y;
            }
        }.parseIndConst();
    }

    @FunctionalInterface
    public interface FormLambdaConstRules {

        String MappedTerm();
    }

    public static FormLambdaConstRules parseFormLambdaConst(String AlgoName, String MyTermCompleteStr, String CompleteTerm, String IndConstStr, String BracesStr, String VarStr, String ConstStr, String DiffWithRespTo, boolean BracesFlag, boolean VariableFlag, boolean ConstantFlag, boolean IndConstFlag, String MapType, String IntegrORDiffr) {
        return new Object() {
            FormLambdaConstRules parseConst() {
                FormLambdaConstRules x = (() -> "");
                if (MapType.equalsIgnoreCase("Map1")) {
                    x = Map1ConstRules();
                } else if (MapType.equalsIgnoreCase("Map2")) {
                    x = Map2ConstRules();
                }
                return x;
            }

            FormLambdaConstRules Map1ConstRules() {
                FormLambdaConstRules y = (() -> "");
                String CompleteStr = MyTermCompleteStr;
                LookAheadOperAI.OperatorLambda Operator = (() -> 0);

                if ((ConstantFlag == true) && (!ConstStr.equalsIgnoreCase(""))) {
                    Operator = LookAheadOperAI.parseOper(MapType, IntegrORDiffr, AlgoName, "PreConstOperator", Operator.Operator(), CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, ' ');
                    if ((Operator.Operator() != 0) && (Operator.Operator() == '/')) {
                        if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                            System.out.println("SimpleTerm:FormTermLambda:PreConstOperator Mapping:Rule:1:CompleteStr=" + CompleteStr + " LAVarTermOperator=" + (char) LAVarTermOperator);
                        }
                        if (!CompleteStr.equalsIgnoreCase("")) {
                            if ((ConstStr.equalsIgnoreCase("1.0")) && (LAPreIndConstOperator == '*')) {
                                CompleteStr = "";
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:1.1.1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:1.1.1:CompleteStr=" + CompleteStr);
                            } //                            else if ((ConstStr.equalsIgnoreCase("1.0")) && (LAPreIndConstOperator == '/')) {
                            //                                CompleteStr = "";
                            //                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:1.1.2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            //                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:1.1.2:CompleteStr=" + CompleteStr);
                            //                            } 
                            else if ((!ConstStr.equalsIgnoreCase("1.0")) && (LAPreIndConstOperator == '*') && (LAPreTermOperator == '*')) {
                                CompleteStr = ConstStr;
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:1.1.3:CompleteStr=" + CompleteStr);
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:1.1.3:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            } else if ((!ConstStr.equalsIgnoreCase("1.0")) && (LAPreIndConstOperator == '*') && (LAPreTermOperator == '/')) {
                                CompleteStr = ConstStr;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:1.1.4.2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:1.1.4:CompleteStr=" + CompleteStr);
                            } else if ((!ConstStr.equalsIgnoreCase("1.0")) && (LAPreTermOperator == '/')) {
                                CompleteStr = (char) LAPreTermOperator + ConstStr;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:1.1.5:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:1.1.5:CompleteStr=" + CompleteStr);
                            } else if (!ConstStr.equalsIgnoreCase("1.0")) {
                                if ((LAPreTermOperator != -1) && (LAIndConstOperator == '/') && ((CompleteStr.endsWith("/")) || (CompleteStr.endsWith("*")))) {
                                    CompleteStr = ConstStr;
                                } else if ((LAPreTermOperator != -1) && (LAIndConstOperator == '/')) {
                                    CompleteStr = (char) LAPreTermOperator + ConstStr;
                                } else {
                                    CompleteStr = ConstStr;
                                }
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:1.1.6:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:1.1.6:CompleteStr=" + CompleteStr);
                            } else {
                                CompleteStr = "";
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:1.1.7:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            }
                            log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:1:CompleteStr=" + CompleteStr);
                            if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                                System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:Rule:1:CompleteStr=" + CompleteStr);
                            }
                        } else {
                            if ((IndConstFlag == true) && (ConstStr.equalsIgnoreCase("1.0"))) {
                                CompleteStr = IndConstStr + "*";
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:2.1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:2.1:CompleteStr=" + CompleteStr);
                            } else if ((IndConstFlag == false) && (ConstStr.equalsIgnoreCase("1.0"))) {
                                // Divide by 1.0 is dropped
                                if ((Operator.Operator() == '/')) {
                                    CompleteStr = "";
                                    ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:2.2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                    log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:2.2:CompleteStr=" + CompleteStr);
                                }
                            } else if ((TrailConstantFlag == true) && (ConstStr.equalsIgnoreCase("1.0"))) {
                                if ((Operator.Operator() != '/')) {
                                    CompleteStr = "";
                                    ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:2.4:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                } else {
                                    CompleteStr = ConstStr;
                                    ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:2.5:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                    log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:2.5:CompleteStr=" + CompleteStr);
                                }
                            } else if ((TrailConstantFlag == true) && (LATermOperator != -1) && (LAPreTermOperator != -1) && (!ConstStr.equalsIgnoreCase("1.0")) && (TrailConstantOperator == Operator.Operator()) && (TrailConstantOperator == '*')) {
                                CompleteStr = ConstStr;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:2.6:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:2.6:CompleteStr=" + CompleteStr);
                            } else if ((TrailConstantFlag == true) && (LATermOperator == -1) && (LAPreTermOperator == -1) && (!ConstStr.equalsIgnoreCase("1.0")) && (TrailConstantOperator == Operator.Operator()) && (TrailConstantOperator == '/')) {
                                // Tweak in Code for Unable to map 
                                CompleteStr = CompleteStr + ConstStr;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:2.6:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:2.6:CompleteStr=" + CompleteStr);
                            } else if ((TrailConstantFlag == true) && (LATermOperator == -1) && (LAPreTermOperator == '*') && (!ConstStr.equalsIgnoreCase("1.0")) && (TrailConstantOperator == Operator.Operator()) && (TrailConstantOperator == '/')) {
                                // Tweak in Code for Unable to map 
                                CompleteStr = CompleteStr + ConstStr;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:2.7:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:2.7:CompleteStr=" + CompleteStr);
                            } else if ((LATermOperator == '*') && (LAPreTermOperator == '*') && (!ConstStr.equalsIgnoreCase("1.0"))) {
                                // Tweak in Code for Unable to map 
                                CompleteStr = ConstStr;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:2.7.1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:2.7:CompleteStr=" + CompleteStr);
                            } else {
                                if ((Operator.Operator() == '/') && (LATermOperator == '/')) {
                                    CompleteStr = "1.0/" + ConstStr;
                                } else if ((Operator.Operator() == '*') && (LATermOperator == '*')) {
                                    CompleteStr = CompleteStr + ConstStr;
                                } else {
                                    CompleteStr = ConstStr;
                                }
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:2.8:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:2.8:CompleteStr=" + CompleteStr);
                            }
                            log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:2:CompleteStr=" + CompleteStr);
                            if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                                System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:Rule:2:CompleteStr=" + CompleteStr);
                            }
                        }
                        if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                            System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:Final:CompleteStr=" + CompleteStr + " LAVarTermOperator=" + (char) LAVarTermOperator);
                        }
                    } else if ((Operator.Operator() != 0)) {
                        if (!CompleteStr.equalsIgnoreCase("")) {
                            if ((!ConstStr.equalsIgnoreCase("1.0")) && (CompleteStr.endsWith("" + (char) Operator.Operator()))) {
                                CompleteStr = ConstStr;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:3.1.1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.1.1:CompleteStr=" + CompleteStr);
                                if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.1.1:CompleteStr=" + CompleteStr);
                                }
                            } else if ((ConstStr.equalsIgnoreCase("1.0")) && (CompleteStr.endsWith("" + (char) Operator.Operator()))) {
                                CompleteStr = "";
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:3.1.2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.1.2:CompleteStr=" + CompleteStr);
                                if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.1.2:CompleteStr=" + CompleteStr);
                                }
                            } else if ((ConstStr.equalsIgnoreCase("1.0")) && (ConstantFlag == true)) {
                                CompleteStr = "";
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:3.1.3:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.1.3:CompleteStr=" + CompleteStr);
                                if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.1.3:CompleteStr=" + CompleteStr);
                                }
                            } else if ((ConstStr.equalsIgnoreCase("0.0")) && (ConstantFlag == true)) {
                                if ((Operator.Operator() == -1) || (Operator.Operator() == '?')) {
                                    CompleteStr = "*" + ConstStr;
                                } else if ((Operator.Operator() == '*') || (Operator.Operator() == '/')) {
                                    CompleteStr = (char) Operator.Operator() + ConstStr;
                                }
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:3.1.4.1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.1.4:CompleteStr=" + CompleteStr);
                                if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.1.3:CompleteStr=" + CompleteStr);
                                }
                            } else {
                                CompleteStr = ConstStr;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:3.1.5:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.1.4.2:CompleteStr=" + CompleteStr);
                                if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.1.5:CompleteStr=" + CompleteStr);
                                }
                            }
                            log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.1:CompleteStr=" + CompleteStr);
                            if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                                System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.1:CompleteStr=" + CompleteStr);
                            }
                        } else {
//                    CompleteStr = ConstStr;
//                    ReasoningLambda x = parseReason(MapType, IntegrORDiffr,":Constant Mapping:Rule:3.2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
//                    log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.2:CompleteStr=" + CompleteStr);
//                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
//                        System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.2:CompleteStr=" + CompleteStr);
//                    }
                            if (!ConstStr.equalsIgnoreCase("1.0")) {
                                if ((LAPreTermOperator == '/') || (LATermOperator == '/')) {
                                    CompleteStr = "1.0/" + ConstStr;
                                } else {
                                    CompleteStr = ConstStr;
                                }
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:3.2.1.1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.2.1.1:CompleteStr=" + CompleteStr);
                                if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.2.1.1:CompleteStr=" + CompleteStr);
                                }
                            } else if (ConstStr.equalsIgnoreCase("1.0")) {
                                if ((CompleteStr.equalsIgnoreCase(""))
                                        && (BracesFlag == false) && (VariableFlag == false) && (IndConstFlag == false)) {
                                    CompleteStr = ConstStr;
                                } else if (((VariableFlag == true) && (LAVarTermOperator == '/'))
                                        || ((IndConstFlag == true) && (LAIndConstOperator == '/'))) {
                                    CompleteStr = ConstStr;
                                } else {
                                    CompleteStr = "";
                                }
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:3.2.1.2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.2.1.2:CompleteStr=" + CompleteStr);
                                if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.2.1.2:CompleteStr=" + CompleteStr);
                                }
                            } else if ((IndConstFlag == true) && (ConstStr.equalsIgnoreCase("1.0")) && (CompleteStr.endsWith("" + (char) Operator.Operator()))) {
                                CompleteStr = IndConstStr;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:3.2.2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.2.2:CompleteStr=" + CompleteStr);
                                if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.2.2:CompleteStr=" + CompleteStr);
                                }
                            } else if ((IndConstFlag == true) && (ConstStr.equalsIgnoreCase("1.0")) && (ConstantFlag == true)) {
                                CompleteStr = IndConstStr;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:3.2.3:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.2.3:CompleteStr=" + CompleteStr);
                                if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.2.3:CompleteStr=" + CompleteStr);
                                }
                            } else if ((IndConstFlag == true) && (ConstStr.equalsIgnoreCase("0.0")) && (ConstantFlag == true)) {
                                if ((Operator.Operator() == -1) || (Operator.Operator() == '?')) {
                                    CompleteStr = IndConstStr + "*" + ConstStr;
                                } else if ((Operator.Operator() == '*') || (Operator.Operator() == '/')) {
                                    CompleteStr = IndConstStr + (char) Operator.Operator() + ConstStr;
                                }
                                CompleteStr = IndConstStr + (char) Operator.Operator() + ConstStr;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:3.2.4:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.2.4:CompleteStr=" + CompleteStr);
                                if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.2.3:CompleteStr=" + CompleteStr);
                                }
                            } else if (IndConstFlag == true) {
                                CompleteStr = IndConstStr + (char) Operator.Operator() + ConstStr;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:3.2.4:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.2.4:CompleteStr=" + CompleteStr);
                                if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.2.4:CompleteStr=" + CompleteStr);
                                }
                            }
                            log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.2:CompleteStr=" + CompleteStr);
                            if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                                System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.2:CompleteStr=" + CompleteStr);
                            }
                        }
                        log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3:CompleteStr=" + CompleteStr);
                        if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                            System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3:CompleteStr=" + CompleteStr);
                        }
                    } else {
                        CompleteStr = CompleteStr + ConstStr;
                        log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:4:CompleteStr=" + CompleteStr);
                        ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:4:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                        if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                            System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:Rule:4:CompleteStr=" + CompleteStr);
                        }
                    }
                    log.info("SimpleTerm:FormTermLambda:Constant Mapping:CompleteStr=" + CompleteStr);
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:CompleteStr=" + CompleteStr);
                    }
                }
                final String MyCompleteStr = CompleteStr;
                y = (() -> MyCompleteStr);
                return y;
            }

            FormLambdaConstRules Map2ConstRules() {
                FormLambdaConstRules y = (() -> "");
                String CompleteStr = MyTermCompleteStr;
                LookAheadOperAI.OperatorLambda Operator = (() -> 0);
                if ((ConstantFlag == true) && (!ConstStr.equalsIgnoreCase(""))) {
                    Operator = LookAheadOperAI.parseOper(MapType, IntegrORDiffr, AlgoName, "PreConstOperator", Operator.Operator(), CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, ' ');
                    if ((Operator.Operator() != 0) && (Operator.Operator() == '/')) {
                        if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                            System.out.println("SimpleTerm:FormTermLambda:PreConstOperator Mapping:Rule:1:CompleteStr=" + CompleteStr + " LAVarTermOperator=" + (char) LAVarTermOperator);
                        }
                        if (!CompleteStr.equalsIgnoreCase("")) {
                            if ((ConstStr.equalsIgnoreCase("1.0")) && (LAPreIndConstOperator == '*')) {
                                CompleteStr = "";
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:1.1.1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:1.1.1:CompleteStr=" + CompleteStr);
                            } else if (ConstStr.equalsIgnoreCase("1.0")) {
                                CompleteStr = "";
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:1.1.2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:1.1.2:CompleteStr=" + CompleteStr);
                            } else if ((!ConstStr.equalsIgnoreCase("1.0")) && (!CompleteStr.endsWith("*")) && (!CompleteStr.endsWith("/")) && (LAPreTermOperator == '*')) {
                                CompleteStr = (char) LATermOperator + ConstStr;
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:1.1.3:CompleteStr=" + CompleteStr);
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:1.1.3:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            } else if ((!ConstStr.equalsIgnoreCase("1.0")) && (LAPreTermOperator == '/')) {
                                if ((IndConstFlag == true) && (!IndConstStr.equalsIgnoreCase(""))) {
                                    CompleteStr = ConstStr;
                                    ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:1.1.4.1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                    log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:1.1.4:CompleteStr=" + CompleteStr);
                                } else {
                                    CompleteStr = ConstStr;
                                    ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:1.1.4.2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                    log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:1.1.4:CompleteStr=" + CompleteStr);
                                }
                            } else if ((!ConstStr.equalsIgnoreCase("1.0")) && (LAPreIndConstOperator == '/')) {
                                CompleteStr = ConstStr;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:1.1.5:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:1.1.5:CompleteStr=" + CompleteStr);
                            } else if (!ConstStr.equalsIgnoreCase("1.0")) {
                                CompleteStr = ConstStr;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:1.1.6:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:1.1.6:CompleteStr=" + CompleteStr);
                            }
                            log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:1:CompleteStr=" + CompleteStr);
                            if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                                System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:Rule:1:CompleteStr=" + CompleteStr);
                            }
                        } else {
                            if ((IndConstFlag == true) && (ConstStr.equalsIgnoreCase("1.0"))) {
                                CompleteStr = IndConstStr + "*";
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:2.1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:2.1:CompleteStr=" + CompleteStr);
                            } else if ((IndConstFlag == false) && (ConstStr.equalsIgnoreCase("1.0"))) {
                                // Divide by 1.0 is dropped
                                if ((Operator.Operator() == '/')) {
                                    CompleteStr = "";
                                    ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:2.2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                    log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:2.2:CompleteStr=" + CompleteStr);
                                }
                            } else if ((TrailConstantFlag == true) && (ConstStr.equalsIgnoreCase("1.0"))) {
                                CompleteStr = ConstStr;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:2.4:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:2.4:CompleteStr=" + CompleteStr);
                            } else if ((TrailConstantFlag == true) && (LATermOperator != -1) && (LAPreTermOperator != -1) && (!ConstStr.equalsIgnoreCase("1.0")) && (TrailConstantOperator == Operator.Operator()) && (TrailConstantOperator == '*')) {
                                CompleteStr = ConstStr;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:2.5:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:2.4:CompleteStr=" + CompleteStr);
                            } else if ((TrailConstantFlag == true) && (LATermOperator == -1) && (LAPreTermOperator == -1) && (!ConstStr.equalsIgnoreCase("1.0")) && (TrailConstantOperator == Operator.Operator()) && (TrailConstantOperator == '/')) {
                                // Tweak in Code for Unable to map 
                                CompleteStr = CompleteStr + ConstStr;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:2.6", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:2.5:CompleteStr=" + CompleteStr);
                            } else if ((TrailConstantFlag == true) && (LATermOperator == -1) && (LAPreTermOperator == '*') && (!ConstStr.equalsIgnoreCase("1.0")) && (TrailConstantOperator == Operator.Operator()) && (TrailConstantOperator == '/')) {
                                // Tweak in Code for Unable to map 
                                CompleteStr = CompleteStr + ConstStr;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:2.7:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:2.6:CompleteStr=" + CompleteStr);
                            } else {
                                if ((LATermOperator == '*')) {
                                    CompleteStr = ConstStr;
                                    ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:2.8.1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                } else if (Operator.Operator() == '/') {
                                    CompleteStr = "1.0/" + ConstStr;
                                    ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:2.8.2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                } else if (Operator.Operator() == '*') {
                                    CompleteStr = CompleteStr + ConstStr;
                                    ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:2.8.3:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                }
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:2.8:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:2.7:CompleteStr=" + CompleteStr);
                            }
                            log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:2:CompleteStr=" + CompleteStr);
                            if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                                System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:Rule:2:CompleteStr=" + CompleteStr);
                            }
                        }
                        if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                            System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:Final:CompleteStr=" + CompleteStr + " LAVarTermOperator=" + (char) LAVarTermOperator);
                        }
                    } else if ((Operator.Operator() != 0)) {
                        if (!CompleteStr.equalsIgnoreCase("")) {
                            if ((!ConstStr.equalsIgnoreCase("1.0")) && (CompleteStr.endsWith("" + (char) Operator.Operator()))) {
                                CompleteStr = ConstStr;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:3.1.1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.1.1:CompleteStr=" + CompleteStr);
                                if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.1.1:CompleteStr=" + CompleteStr);
                                }
                            } else if ((ConstStr.equalsIgnoreCase("1.0")) && (CompleteStr.endsWith("" + (char) Operator.Operator()))) {
                                CompleteStr = "";
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:3.1.2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.1.2:CompleteStr=" + CompleteStr);
                                if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.1.2:CompleteStr=" + CompleteStr);
                                }
                            } else if ((ConstStr.equalsIgnoreCase("1.0")) && (ConstantFlag == true)) {
                                CompleteStr = "";
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:3.1.3:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.1.3:CompleteStr=" + CompleteStr);
                                if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.1.3:CompleteStr=" + CompleteStr);
                                }
                            } else if ((ConstStr.equalsIgnoreCase("0.0")) && (ConstantFlag == true)) {
                                if ((Operator.Operator() == -1) || (Operator.Operator() == '?')) {
                                    CompleteStr = "*" + ConstStr;
                                } else if ((Operator.Operator() == '*') || (Operator.Operator() == '/')) {
                                    CompleteStr = (char) Operator.Operator() + ConstStr;
                                }
                                CompleteStr = (char) Operator.Operator() + ConstStr;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:3.1.4:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.1.4:CompleteStr=" + CompleteStr);
                                if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.1.3:CompleteStr=" + CompleteStr);
                                }
                            } else {
                                if ((LAPreTermOperator == -1) && (LATermOperator != -1) && (IndConstFlag == true) && (!IndConstStr.equalsIgnoreCase("")) && (LATermOperator != LAPreIndConstOperator)) {
                                    CompleteStr = ConstStr;
                                } //                                else if ((LAPreTermOperator==-1)&&(LATermOperator != -1)){
                                //                                     CompleteStr = (char) LATermOperator + ConstStr;
                                //                                }
                                //                                else 
                                //                                    CompleteStr = (char) LATermOperator + ConstStr;
                                else {
                                    CompleteStr = ConstStr;
                                }
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:3.1.5:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.1.5:CompleteStr=" + CompleteStr);
                                if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.1.5:CompleteStr=" + CompleteStr);
                                }
                            }
                            log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.1:CompleteStr=" + CompleteStr);
                            if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                                System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.1:CompleteStr=" + CompleteStr);
                            }
                        } else {
//                    CompleteStr = ConstStr;
//                    ReasoningLambda x = parseReason(MapType, IntegrORDiffr,":Constant Mapping:Rule:3.2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
//                    log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.2:CompleteStr=" + CompleteStr);
//                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
//                        System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.2:CompleteStr=" + CompleteStr);
//                    }
                            if (!ConstStr.equalsIgnoreCase("1.0")) {
                                if (LAPreTermOperator == '/') {
                                    CompleteStr = "1.0/" + ConstStr;
                                } else {
                                    CompleteStr = CompleteStr + ConstStr;
                                }
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:3.2.1.1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.2.1.1:CompleteStr=" + CompleteStr);
                                if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.2.1.1:CompleteStr=" + CompleteStr);
                                }
                            } else if (ConstStr.equalsIgnoreCase("1.0")) {
                                if ((CompleteStr.equalsIgnoreCase(""))
                                        && (BracesFlag == false) && (VariableFlag == false) && (IndConstFlag == false)) {
                                    CompleteStr = ConstStr;
                                } else {
                                    CompleteStr = "";
                                }
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:3.2.1.2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.2.1.2:CompleteStr=" + CompleteStr);
                                if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.2.1.2:CompleteStr=" + CompleteStr);
                                }
                            } else if ((IndConstFlag == true) && (ConstStr.equalsIgnoreCase("1.0")) && (CompleteStr.endsWith("" + (char) Operator.Operator()))) {
                                CompleteStr = IndConstStr;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:3.2.2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.2.2:CompleteStr=" + CompleteStr);
                                if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.2.2:CompleteStr=" + CompleteStr);
                                }
                            } else if ((IndConstFlag == true) && (ConstStr.equalsIgnoreCase("1.0")) && (ConstantFlag == true)) {
                                CompleteStr = IndConstStr;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:3.2.3:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.2.3:CompleteStr=" + CompleteStr);
                                if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.2.3:CompleteStr=" + CompleteStr);
                                }
                            } else if ((IndConstFlag == true) && (ConstStr.equalsIgnoreCase("0.0")) && (ConstantFlag == true)) {
                                if ((Operator.Operator() == -1) || (Operator.Operator() == '?')) {
                                    CompleteStr = IndConstStr + "*" + ConstStr;
                                } else if ((Operator.Operator() == '*') || (Operator.Operator() == '/')) {
                                    CompleteStr = IndConstStr + (char) Operator.Operator() + ConstStr;
                                }
                                CompleteStr = IndConstStr + (char) Operator.Operator() + ConstStr;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:3.2.4:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.2.4:CompleteStr=" + CompleteStr);
                                if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.2.3:CompleteStr=" + CompleteStr);
                                }
                            } else if (IndConstFlag == true) {
                                CompleteStr = IndConstStr + (char) Operator.Operator() + ConstStr;
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:3.2.4:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.2.4:CompleteStr=" + CompleteStr);
                                if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                                    System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.2.4:CompleteStr=" + CompleteStr);
                                }
                            }
                            log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.2:CompleteStr=" + CompleteStr);
                            if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                                System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3.2:CompleteStr=" + CompleteStr);
                            }
                        }
                        log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3:CompleteStr=" + CompleteStr);
                        if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                            System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:Rule:3:CompleteStr=" + CompleteStr);
                        }
                    } else {
                        CompleteStr = CompleteStr + ConstStr;
                        log.info("SimpleTerm:FormTermLambda:Constant Mapping:Rule:4:CompleteStr=" + CompleteStr);
                        ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Constant Mapping:Rule:4:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                        if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                            System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:Rule:4:CompleteStr=" + CompleteStr);
                        }
                    }
                    log.info("SimpleTerm:FormTermLambda:Constant Mapping:CompleteStr=" + CompleteStr);
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("SimpleTerm:FormTermLambda:Constant Mapping:CompleteStr=" + CompleteStr);
                    }
                }
                final String MyCompleteStr = CompleteStr;
                y = (() -> MyCompleteStr);
                return y;
            }
        }.parseConst();
    }

    @FunctionalInterface
    public interface FormLambdaVarExprRules {

        String MappedTerm();
    }

    public static FormLambdaVarExprRules parseFormLambdaVarExpr(String AlgoName, String MyTermCompleteStr, String CompleteTerm, String IndConstStr, String BracesStr, String VarStr, String ConstStr, String DiffWithRespTo, boolean BracesFlag, boolean VariableFlag, boolean ConstantFlag, boolean IndConstFlag, String MapType, String IntegrORDiffr) {
        return new Object() {

            FormLambdaVarExprRules parseVarExpr() {
                FormLambdaVarExprRules x = (() -> "");
                if (MapType.equalsIgnoreCase("Map1")) {
                    x = Map1VarExprRules();
                } else if (MapType.equalsIgnoreCase("Map2")) {
                    x = Map2VarExprRules();
                }
                return x;
            }

            FormLambdaVarExprRules Map1VarExprRules() {
                FormLambdaVarExprRules y = (() -> "");
                String CompleteStr = MyTermCompleteStr;
                LookAheadOperAI.OperatorLambda Operator = (() -> 0);
                if ((VariableFlag == true) && (!VarStr.equalsIgnoreCase(""))) {
                    Operator = LookAheadOperAI.parseOper(MapType, IntegrORDiffr, AlgoName, "PreVarOperator", Operator.Operator(), CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, ' ');
                    if ((Operator.Operator() != 0)) {
                        boolean Flag = false;
                        if (CompleteStr.equalsIgnoreCase("1.0") && (Operator.Operator() == '*')) {
                            if (VarStr.equalsIgnoreCase("1.0")) {
                                CompleteStr = DiffWithRespTo;
                            } else {
                                CompleteStr = VarStr;
                            }
                            ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            log.info("SimpleTerm:FormTermLambda:Var Mapping:CompleteStr=" + CompleteStr);
                        } else {
                            if ((CompleteStr.endsWith("*")) || (CompleteStr.endsWith("/"))) {
                                if (VarStr.equalsIgnoreCase("1.0")) {
                                    CompleteStr = DiffWithRespTo;
                                } else {
                                    CompleteStr = VarStr;
                                }
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping:1.0:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Var Mapping:CompleteStr=" + CompleteStr);
                            } else {
                                if (VarStr.equalsIgnoreCase("1.0")) {
                                    if (Operator.Operator() == 0) {
                                        CompleteStr = CompleteStr + "*" + DiffWithRespTo;
                                        ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping:1.1.A:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                    } else if ((Operator.Operator() == ' ') && ((LAVarTermOperator == '*') || (LAVarTermOperator == '/'))) {
                                        if ((ConstantFlag == false) && (IndConstFlag == false)) {
                                            CompleteStr = DiffWithRespTo;
                                        } else {
                                            CompleteStr = (char) LAVarTermOperator + DiffWithRespTo;
                                        }
                                        ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping:1.1.B:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                    } else if ((Operator.Operator() == ' ') && (LAVarTermOperator == -1) && (CompleteStr.equalsIgnoreCase(""))) {
                                        CompleteStr = DiffWithRespTo;
                                        ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping:1.1.C:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                    } else {
                                        if ((CompleteStr.equalsIgnoreCase("")) && (ConstStr.equalsIgnoreCase("1.0")) && (Operator.Operator() == '*')) {
                                            CompleteStr = DiffWithRespTo;
                                        } else if ((CompleteStr.equalsIgnoreCase("")) && (ConstStr.equalsIgnoreCase("1.0")) && (Operator.Operator() == '/')) {
                                            CompleteStr = "1.0" + (char) Operator.Operator() + DiffWithRespTo;
                                        } else {
                                            CompleteStr = (char) LAVarTermOperator + DiffWithRespTo;
                                        }
                                        ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping:1.1.D:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                    }
                                } else {
                                    if ((CompleteStr.equalsIgnoreCase("")) && (ConstStr.equalsIgnoreCase("1.0")) && (VarStr.startsWith("1.0")) && (Operator.Operator() == '*') && (LAVarTermOperator == '/')) {
                                        CompleteStr = VarStr;
                                        ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping:1.1.E.1.A:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                    } else if ((CompleteStr.equalsIgnoreCase("")) && (ConstStr.equalsIgnoreCase("1.0")) && (Operator.Operator() == '*') && (LAVarTermOperator == '/')) {
                                        CompleteStr = ConstStr + (char) LAVarTermOperator + VarStr;
                                        ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping:1.1.E.1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                    } else if ((CompleteStr.equalsIgnoreCase("")) && (ConstStr.equalsIgnoreCase("1.0")) && (Operator.Operator() == '/')) {
                                        CompleteStr = "1.0" + (char) Operator.Operator() + VarStr;
                                        ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping:1.1.E.2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                    } else {
                                        if ((VarStr.startsWith("1.0/"))&& ( (Operator.Operator()==-1)||(Operator.Operator()==0)||(Operator.Operator()==' ')) ) {
                                            if (ConstantFlag==true){
                                                CompleteStr =  (char) LATermOperator + VarStr;
                                                if (CompleteStr.startsWith("*1.0"))
                                                       CompleteStr=CompleteStr.replaceFirst("\\*1.0", "");
                                                else if (CompleteStr.startsWith("/1.0"))
                                                       CompleteStr=CompleteStr.replaceFirst("/1.0", "");
                                            } else
                                                CompleteStr =  VarStr;
                                            ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping:1.1.E.3.A:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                        } else if (VarStr.startsWith("1.0/")) {
                                            String VarStr1 = VarStr.replaceFirst("1.0/", "");
                                            CompleteStr = (char) Operator.Operator() + VarStr1;
                                            ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping:1.1.E.3.B:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                        } else if ((VarStr.startsWith("1.0*"))&& ( (Operator.Operator()==-1)||(Operator.Operator()==0)||(Operator.Operator()==' ')) ) {
                                            if (ConstantFlag==true)
                                                CompleteStr =  (char) LATermOperator + VarStr;
                                            else
                                                CompleteStr =  VarStr;
                                            ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping:1.1.E.4.A:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                        } else if ((VarStr.startsWith("1.0*"))) {
                                            String VarStr1 = VarStr.replaceFirst("1.0*", "");
                                            CompleteStr = (char) Operator.Operator() + VarStr1;
                                            ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping:1.1.E.4.B:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                        }else if ((ConstantFlag == true) && (!ConstStr.equalsIgnoreCase("1.0")) && (VariableFlag == true) && (LAVarTermOperator != -1)) {
                                            CompleteStr = (char) LAVarTermOperator + VarStr;
                                            ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping:1.1.E.5:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                        } else if ((ConstantFlag == true) && (!ConstStr.equalsIgnoreCase("1.0")) && (IsAConstant(ConstStr, DiffWithRespTo)) && (StrIsAConstant.equalsIgnoreCase("Number")) && (!CompleteStr.endsWith("/")) && (!CompleteStr.endsWith("*")) && (LAVarTermOperator == -1)) {
                                            CompleteStr = (char) '*' + VarStr;
                                            ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping:1.1.E.6:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                        } else if ((ConstantFlag == true) && (ConstStr.equalsIgnoreCase("1.0")) && (!CompleteStr.endsWith("/")) && (!CompleteStr.endsWith("*")) && (LAVarTermOperator == -1)) {
                                            CompleteStr = VarStr;
                                            ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping:1.1.E.7:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                        } else if ((ConstantFlag == true) && (ConstStr.equalsIgnoreCase("1.0")) && (!CompleteStr.equalsIgnoreCase("")) && (!CompleteStr.endsWith("/")) && (!CompleteStr.endsWith("*"))) {
                                            CompleteStr = (char) LAVarTermOperator + VarStr;
                                            ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping:1.1.E.8:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                        } else if ((IndConstFlag == true) && ((LAVarTermOperator == '*') || (LAVarTermOperator == '/'))) {
                                            CompleteStr = (char) LAVarTermOperator + VarStr;
                                            ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping:1.1.E.9:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                        } else if ((IndConstFlag == false)) {
                                            CompleteStr = VarStr;
                                            ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping:1.1.E.10:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                        }
                                    }
                                    ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping:1.1.E:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                }
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping:1.1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                //System.out.println("SimpleTerm:FormTermLambda:Var Mapping:Operator.Operator()=" +Operator.Operator() + " Operator.Operator()=" + (char) Operator.Operator() );
                                log.info("SimpleTerm:FormTermLambda:Var Mapping:CompleteStr=" + CompleteStr);
                            }
                            log.info("SimpleTerm:FormTermLambda:Var Mapping:CompleteStr=" + CompleteStr);
                        }
                    } else {
                        if (VarStr.equalsIgnoreCase("1.0")) {
                            CompleteStr = CompleteStr + DiffWithRespTo;
                        } else if (VarStr.equalsIgnoreCase(DiffWithRespTo + "^0.0")) {
                            CompleteStr = CompleteStr + "1.0";
                        } else {
                            CompleteStr = CompleteStr + VarStr;
                        }
                    }
                    ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping:1.0:else:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                    log.info("SimpleTerm:FormTermLambda:Var Mapping:CompleteStr=" + CompleteStr);
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("SimpleTerm:FormTermLambda:Var Mapping:CompleteStr=" + CompleteStr);
                    }
                }
                final String MyCompleteStr = CompleteStr;
                y = (() -> MyCompleteStr);
                return y;
            }

            FormLambdaVarExprRules Map2VarExprRules() {
                FormLambdaVarExprRules y = (() -> "");
                String CompleteStr = MyTermCompleteStr;
                LookAheadOperAI.OperatorLambda Operator = (() -> 0);
                if ((VariableFlag == true) && (!VarStr.equalsIgnoreCase(""))) {
                    Operator = LookAheadOperAI.parseOper(MapType, IntegrORDiffr, AlgoName, "PreVarOperator", Operator.Operator(), CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, ' ');
                    if ((Operator.Operator() != 0)) {
                        boolean Flag = false;
                        if (CompleteStr.equalsIgnoreCase("1.0") && (Operator.Operator() == '*')) {
                            if (VarStr.equalsIgnoreCase("1.0")) {
                                CompleteStr = DiffWithRespTo;
                            } else {
                                CompleteStr = VarStr;
                            }
                            ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            log.info("SimpleTerm:FormTermLambda:Var Mapping:CompleteStr=" + CompleteStr);
                        } else {
                            if ((CompleteStr.endsWith("*")) || (CompleteStr.endsWith("/"))) {
                                if ((VarStr.equalsIgnoreCase("1.0")) && (Operator.Operator() == '*')) {
                                    CompleteStr = DiffWithRespTo;
                                } else if ((VarStr.equalsIgnoreCase("1.0")) && (Operator.Operator() == '/')) {
                                    CompleteStr = DiffWithRespTo;
                                } else if (VarStr.equalsIgnoreCase("1.0")) {
                                    CompleteStr = DiffWithRespTo;
                                } else {
                                    CompleteStr = VarStr;
                                }
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping:1.0:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                log.info("SimpleTerm:FormTermLambda:Var Mapping:CompleteStr=" + CompleteStr);
                            } else {
                                if (VarStr.equalsIgnoreCase("1.0")) {
                                    if (Operator.Operator() == 0) {
                                        CompleteStr = CompleteStr + "*" + DiffWithRespTo;
                                        ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping:1.1.A:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                    } else if ((Operator.Operator() == ' ') && ((LAVarTermOperator == '*') || (LAVarTermOperator == '/'))) {
                                        CompleteStr = (char) LAVarTermOperator + DiffWithRespTo;
                                        ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping:1.1.B:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                    } else if ((Operator.Operator() == ' ') && (LAVarTermOperator == -1) && (CompleteStr.equalsIgnoreCase(""))) {
                                        CompleteStr = DiffWithRespTo;
                                        ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping:1.1.C:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                    } else {
                                        if ((CompleteStr.equalsIgnoreCase("")) && (ConstStr.equalsIgnoreCase("1.0")) && (Operator.Operator() == '*')) {
                                            CompleteStr = DiffWithRespTo;
                                        } else if ((CompleteStr.equalsIgnoreCase("")) && (ConstStr.equalsIgnoreCase("1.0")) && (Operator.Operator() == '/')) {
                                            CompleteStr = "1.0" + (char) Operator.Operator() + DiffWithRespTo;
                                        } else if (LAVarTermOperator == '/') {
                                            CompleteStr = (char) LAVarTermOperator + DiffWithRespTo;
                                        } else {
                                            CompleteStr = (char) Operator.Operator() + DiffWithRespTo;
                                        }
                                        ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping:1.1.D:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                    }
                                } else {
                                    if ((CompleteStr.equalsIgnoreCase("")) && (ConstStr.equalsIgnoreCase("1.0")) && (Operator.Operator() == '*')) {
                                        CompleteStr = VarStr;
                                        ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping:1.1.E.1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                    } else if ((CompleteStr.equalsIgnoreCase("")) && (ConstStr.equalsIgnoreCase("1.0")) && (Operator.Operator() == '/')) {
                                        CompleteStr = "1.0" + (char) Operator.Operator() + VarStr;
                                        ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping:1.1.E.2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                    } else if ((VarStr.startsWith("1.0/")) && ((Operator.Operator() == '*') || (Operator.Operator() == '/'))) {
                                        String VarStr1 = VarStr.replaceFirst("1.0/", "");
                                        CompleteStr = (char) Operator.Operator() + VarStr1;
                                        ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping:1.1.E,3:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                    } else if ((VarStr.startsWith("1.0*")) && ((Operator.Operator() == '*') || (Operator.Operator() == '/'))) {
                                        String VarStr1 = VarStr.replaceFirst("1.0\\*", "");
                                        CompleteStr = (char) Operator.Operator() + VarStr1;
                                        ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping:1.1.E.4:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                    } else if ((Operator.Operator() == -1) && (LAVarTermOperator == '/')) {
                                        CompleteStr = (char) LAVarTermOperator + VarStr;
                                        ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping:1.1.E.5:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                    } else if (((IndConstFlag == true) || (ConstantFlag == true)) && (LAVarTermOperator == '*')) {
                                        CompleteStr = (char) LAVarTermOperator + VarStr;
                                        ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping:1.1.E.6:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                    } else if (((IndConstFlag == true) || (ConstantFlag == true)) && (LAVarTermOperator == '/')) {
                                        CompleteStr = (char) LAVarTermOperator + VarStr;
                                        ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping:1.1.E.6:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                    } else if (((IndConstFlag == true) || (ConstantFlag == true)) && (LAVarTermOperator == -1)) {
                                        CompleteStr = (char) '*' + VarStr;
                                        ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping:1.1.E.7:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                    } else if ((IndConstFlag == false) && (ConstantFlag == false)) {
                                        CompleteStr = VarStr;
                                        ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping:1.1.E.7:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                    }
                                }
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping:1.1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                                //System.out.println("SimpleTerm:FormTermLambda:Var Mapping:Operator.Operator()=" +Operator.Operator() + " Operator.Operator()=" + (char) Operator.Operator() );
                                log.info("SimpleTerm:FormTermLambda:Var Mapping:CompleteStr=" + CompleteStr);
                            }
                            log.info("SimpleTerm:FormTermLambda:Var Mapping:CompleteStr=" + CompleteStr);
                        }
                    } else {
                        if (VarStr.equalsIgnoreCase("1.0")) {
                            CompleteStr = CompleteStr + DiffWithRespTo;
                        } else if (VarStr.equalsIgnoreCase(DiffWithRespTo + "^0.0")) {
                            CompleteStr = CompleteStr + "1.0";
                        } else {
                            CompleteStr = CompleteStr + VarStr;
                        }
                    }
                    ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Var Mapping:1.0:else:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                    log.info("SimpleTerm:FormTermLambda:Var Mapping:CompleteStr=" + CompleteStr);
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("SimpleTerm:FormTermLambda:Var Mapping:CompleteStr=" + CompleteStr);
                    }
                }
                final String MyCompleteStr = CompleteStr;
                y = (() -> MyCompleteStr);
                return y;
            }
        }.parseVarExpr();
    }

    @FunctionalInterface
    public interface FormLambdaBracerExprRules {

        String MappedTerm();
    }

    public static FormLambdaBracerExprRules parseFormLambdaBracerExpr(String AlgoName, String MyTermCompleteStr, String CompleteTerm, String IndConstStr, String BracesStr, String VarStr, String ConstStr, String DiffWithRespTo, boolean BracesFlag, boolean VariableFlag, boolean ConstantFlag, boolean IndConstFlag, String MapType, String IntegrORDiffr) {
        return new Object() {
            FormLambdaBracerExprRules parseBraceExpr() {
                FormLambdaBracerExprRules x = (() -> "");
                if (MapType.equalsIgnoreCase("Map1")) {
                    x = Map1ParenExprRules();
                } else if (MapType.equalsIgnoreCase("Map2")) {
                    x = Map2ParenExprRules();
                }
                return x;
            }

            FormLambdaBracerExprRules Map1ParenExprRules() {
                FormLambdaBracerExprRules y = (() -> "");
                String CompleteStr = MyTermCompleteStr;
                LookAheadOperAI.OperatorLambda Operator = (() -> 0);
                if ((BracesFlag == true) && (!BracesStr.equalsIgnoreCase(""))) {
                    Operator = LookAheadOperAI.parseOper(MapType, IntegrORDiffr, AlgoName, "BracesPre", Operator.Operator(), CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, LATermOperatorBraces);
                    if ((Operator.Operator() != 0)) {
                        if ((BracesStr.contains("+")) || (BracesStr.contains("-"))) {
                            CompleteStr = (char) Operator.Operator() + "(" + BracesStr + ")";
                            ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":BracesPre Mapping:1.1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                        } else if ((VariableFlag == true) && (VarStr.contains("(" + BracesStr + ")"))) {
                            CompleteStr = "";
                            ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":BracesPre Mapping:1.2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                        } else {
                            CompleteStr = (char) Operator.Operator() + BracesStr;
                            ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":BracesPre Mapping:1.3:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                        }
                    } else if ((BracesFlag == true) && (!BracesStr.equalsIgnoreCase(""))) {
                        CompleteStr = BracesStr;
                        ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Braces Mapping:1.1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                    }
                    log.info("SimpleTerm:FormTermLambda:Braces Mapping:CompleteStr=" + CompleteStr);
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("SimpleTerm:FormTermLambda:Braces Mapping:CompleteStr=" + CompleteStr);
                    }
                }
                final String MyCompleteStr = CompleteStr;
                y = (() -> MyCompleteStr);
                return y;
            }

            FormLambdaBracerExprRules Map2ParenExprRules() {
                FormLambdaBracerExprRules y = (() -> "");
                String CompleteStr = MyTermCompleteStr;
                LookAheadOperAI.OperatorLambda Operator = (() -> 0);
                if ((BracesFlag == true) && (!BracesStr.equalsIgnoreCase(""))) {
                    Operator = LookAheadOperAI.parseOper(MapType, IntegrORDiffr, AlgoName, "BracesPre", Operator.Operator(), CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, LATermOperatorBraces);
                    if ((Operator.Operator() != 0)) {
                        if ((ConstantFlag == true) && (ConstStr.equalsIgnoreCase("1.0"))) {
                            if ((VariableFlag == true) && (VarStr.contains("(" + BracesStr + ")"))) {
                                CompleteStr = "";
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":BracesPre Mapping:1.0:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            } else {
                                CompleteStr = "(" + BracesStr + ")";
                                ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":BracesPre Mapping:1.1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                            }
                        } else if ((BracesStr.contains("+")) || (BracesStr.contains("-"))) {
                            CompleteStr = (char) Operator.Operator() + "(" + BracesStr + ")";
                            ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":BracesPre Mapping:1.2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                        } else if ((VariableFlag == true) && (VarStr.contains("(" + BracesStr + ")"))) {
                            CompleteStr = "";
                            ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":BracesPre Mapping:1.3:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                        } else {
                            CompleteStr = (char) Operator.Operator() + BracesStr;
                            ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":BracesPre Mapping:1.4:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                        }
                    } else if ((BracesFlag == true) && (!BracesStr.equalsIgnoreCase(""))) {
                        CompleteStr = CompleteStr + BracesStr;
                        ReasoningLambda x = parseReason(MapType, IntegrORDiffr, ":Braces Mapping:1.1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo);
                    }
                    log.info("SimpleTerm:FormTermLambda:Braces Mapping:CompleteStr=" + CompleteStr);
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("SimpleTerm:FormTermLambda:Braces Mapping:CompleteStr=" + CompleteStr);
                    }
                }
                final String MyCompleteStr = CompleteStr;
                y = (() -> MyCompleteStr);
                return y;
            }
        }.parseBraceExpr();
    }

    /**
     * ************************************************************
     */
    /**
     * ************* Lambda Low Level Mapping Functions End*****
     */
    /**
     * ************************************************************
     */
    public static void BackupMathsStateAll(Map<String, String> variablesBackupState) {
        BackupParserState(variablesBackupState);
        BackupControlStateVar(variablesBackupState);
        BackupDiffIntegreSep(variablesBackupState);
        //BackupRestoreStack.push(new HashMap<> (variablesBackupState));
    }

    public static void RestoreMathsStateAll(Map<String, String> variablesBackupState) {
        //variablesBackupState=BackupRestoreStack.pop();
        RestoreDiffIntegreSep(variablesBackupState);
        RestoreControlStateVar(variablesBackupState);
        RestoreParserState(variablesBackupState);
    }

    public static void BackupControlStateVar(Map<String, String> variablesBackupState) {
        // Boolean Variable Flags
        variablesBackupState.put("ContainsIndConstFlag" + StrKeyBackUpRestore + depthBackUpRestore, "" + ContainsIndConstFlag);
        variablesBackupState.put("ComplexAssignFlag" + StrKeyBackUpRestore + depthBackUpRestore, "" + ComplexAssignFlag);
        variablesBackupState.put("ContainsXFlag" + StrKeyBackUpRestore + depthBackUpRestore, "" + ContainsXFlag);
        variablesBackupState.put("TrailConstantFlag" + StrKeyBackUpRestore + depthBackUpRestore, "" + TrailConstantFlag);
        variablesBackupState.put("GotVariableFlag" + StrKeyBackUpRestore + depthBackUpRestore, "" + GotVariableFlag);
        variablesBackupState.put("GotIndConstFlag" + StrKeyBackUpRestore + depthBackUpRestore, "" + GotIndConstFlag);
        variablesBackupState.put("GotExpntNumFlag" + StrKeyBackUpRestore + depthBackUpRestore, "" + GotExpntNumFlag);
        variablesBackupState.put("TempIndConstStrSet" + StrKeyBackUpRestore + depthBackUpRestore, "" + TempIndConstStrSet);
        //Integer Variables
        variablesBackupState.put("GotVariablePos" + StrKeyBackUpRestore + depthBackUpRestore, "" + GotVariablePos);
        variablesBackupState.put("GotIndConstPos" + StrKeyBackUpRestore + depthBackUpRestore, "" + GotIndConstPos);
        variablesBackupState.put("TermOperatorPos" + StrKeyBackUpRestore + depthBackUpRestore, "" + TermOperatorPos);
        variablesBackupState.put("TermOutputOperator" + StrKeyBackUpRestore + depthBackUpRestore, "" + TermOutputOperator);
        variablesBackupState.put("LATermOperator" + StrKeyBackUpRestore + depthBackUpRestore, "" + LATermOperator);
        variablesBackupState.put("LATermOperatorBraces" + StrKeyBackUpRestore + depthBackUpRestore, "" + LATermOperatorBraces);
        variablesBackupState.put("LAIndConstOperator" + StrKeyBackUpRestore + depthBackUpRestore, "" + LAIndConstOperator);
        variablesBackupState.put("LAPreIndConstOperator" + StrKeyBackUpRestore + depthBackUpRestore, "" + LAPreIndConstOperator);
        variablesBackupState.put("LAVarTermOperator" + StrKeyBackUpRestore + depthBackUpRestore, "" + LAVarTermOperator);
        variablesBackupState.put("TrailConstantOperator" + StrKeyBackUpRestore + depthBackUpRestore, "" + TrailConstantOperator);
        variablesBackupState.put("LAPreTermOperator" + StrKeyBackUpRestore + depthBackUpRestore, "" + LAPreTermOperator);
        variablesBackupState.put("LAMAPOperator" + StrKeyBackUpRestore + depthBackUpRestore, "" + LAMAPOperator);
        variablesBackupState.put("LADyYByDxMAPOperator" + StrKeyBackUpRestore + depthBackUpRestore, "" + LADyYByDxMAPOperator);
        variablesBackupState.put("DiffTermOperator" + StrKeyBackUpRestore + depthBackUpRestore, "" + DiffTermOperator);
        variablesBackupState.put("LADiffFactorOperator" + StrKeyBackUpRestore + depthBackUpRestore, "" + LADiffFactorOperator);
        variablesBackupState.put("LADiffIndConstOperator" + StrKeyBackUpRestore + depthBackUpRestore, "" + LADiffIndConstOperator);
        variablesBackupState.put("LAConstSimpleMapFlag" + StrKeyBackUpRestore + depthBackUpRestore, "" + LAConstSimpleMapFlag);
        variablesBackupState.put("LAConstComplexMapFlag" + StrKeyBackUpRestore + depthBackUpRestore, "" + LAConstComplexMapFlag);
        variablesBackupState.put("LAVarSimpleMapFlag" + StrKeyBackUpRestore + depthBackUpRestore, "" + LAVarSimpleMapFlag);
        variablesBackupState.put("LAVarComplexMapFlag" + StrKeyBackUpRestore + depthBackUpRestore, "" + LAVarComplexMapFlag);
        variablesBackupState.put("DiffConstSimpleMapFlag" + StrKeyBackUpRestore + depthBackUpRestore, "" + DiffConstSimpleMapFlag);
        variablesBackupState.put("DiffConstComplexMapFlag" + StrKeyBackUpRestore + depthBackUpRestore, "" + DiffConstComplexMapFlag);
        variablesBackupState.put("LastLADiffIndConstAidPos" + StrKeyBackUpRestore + depthBackUpRestore, "" + LastLADiffIndConstAidPos);
        variablesBackupState.put("LastLADiffConstCoeffAidPos" + StrKeyBackUpRestore + depthBackUpRestore, "" + LastLADiffConstCoeffAidPos);
        variablesBackupState.put("GotBracesVarFlag" + StrKeyBackUpRestore + depthBackUpRestore, "" + GotBracesVarFlag);
        variablesBackupState.put("posIndConst" + StrKeyBackUpRestore + depthBackUpRestore, "" + posIndConst);
        variablesBackupState.put("ContainsFuncFlag" + StrKeyBackUpRestore + depthBackUpRestore, "" + ContainsFuncFlag);
        variablesBackupState.put("FunctionStr" + StrKeyBackUpRestore + depthBackUpRestore, FunctionStr);
        variablesBackupState.put("ParenthesisFlag" + StrKeyBackUpRestore + depthBackUpRestore, "" + ParenthesisFlag);
        variablesBackupState.put("GotBracesCount" + StrKeyBackUpRestore + depthBackUpRestore, "" + GotBracesCount);
        variablesBackupState.put("GotBracesCountCurr" + StrKeyBackUpRestore + depthBackUpRestore, "" + GotBracesCountCurr);

        variablesBackupState.put("timesLoop" + StrKeyBackUpRestore + depthBackUpRestore, "" + timesLoop);
        variablesBackupState.put("LastExpr" + StrKeyBackUpRestore + depthBackUpRestore, "" + LastExpr);
        variablesBackupState.put("TermOutput" + StrKeyBackUpRestore + depthBackUpRestore, "" + TermOutput);
        variablesBackupState.put("TermOutputIndConst" + StrKeyBackUpRestore + depthBackUpRestore, "" + TermOutputIndConst);
        variablesBackupState.put("TermOutputAddedOnceFlag" + StrKeyBackUpRestore + depthBackUpRestore, "" + TermOutputAddedOnceFlag);

    }

    public static void RestoreControlStateVar(Map<String, String> variablesBackupState) {
        // Boolean Variable Flags
        ContainsIndConstFlag = Boolean.parseBoolean(variablesBackupState.get("ContainsIndConstFlag" + StrKeyBackUpRestore + depthBackUpRestore));
        ComplexAssignFlag = Boolean.parseBoolean(variablesBackupState.get("ComplexAssignFlag" + StrKeyBackUpRestore + depthBackUpRestore));
        ContainsXFlag = Boolean.parseBoolean(variablesBackupState.get("ContainsXFlag" + StrKeyBackUpRestore + depthBackUpRestore));
        TrailConstantFlag = Boolean.parseBoolean(variablesBackupState.get("TrailConstantFlag" + StrKeyBackUpRestore + depthBackUpRestore));
        GotVariableFlag = Boolean.parseBoolean(variablesBackupState.get("GotVariableFlag" + StrKeyBackUpRestore + depthBackUpRestore));
        GotIndConstFlag = Boolean.parseBoolean(variablesBackupState.get("GotIndConstFlag" + StrKeyBackUpRestore + depthBackUpRestore));
        GotExpntNumFlag = Boolean.parseBoolean(variablesBackupState.get("GotExpntNumFlag" + StrKeyBackUpRestore + depthBackUpRestore));
        TempIndConstStrSet = Boolean.parseBoolean(variablesBackupState.get("TempIndConstStrSet" + StrKeyBackUpRestore + depthBackUpRestore));
        //Integer Variables
        GotVariablePos = Integer.parseInt(IntegerNullCheck("GotVariablePos", variablesBackupState));
        GotIndConstPos = Integer.parseInt(IntegerNullCheck("GotIndConstPos", variablesBackupState));
        TermOperatorPos = Integer.parseInt(IntegerNullCheck("TermOperatorPos", variablesBackupState));
        TermOutputOperator = Integer.parseInt(IntegerNullCheck("TermOutputOperator", variablesBackupState));
        LATermOperator = Integer.parseInt(IntegerNullCheck("LATermOperator", variablesBackupState));
        LATermOperatorBraces = Integer.parseInt(IntegerNullCheck("LATermOperatorBraces", variablesBackupState));
        LAIndConstOperator = Integer.parseInt(IntegerNullCheck("LAIndConstOperator", variablesBackupState));
        LAPreIndConstOperator = Integer.parseInt(IntegerNullCheck("LAPreIndConstOperator", variablesBackupState));
        LAVarTermOperator = Integer.parseInt(IntegerNullCheck("LAVarTermOperator", variablesBackupState));
        TrailConstantOperator = Integer.parseInt(IntegerNullCheck("TrailConstantOperator", variablesBackupState));
        LAPreTermOperator = Integer.parseInt(IntegerNullCheck("LAPreTermOperator", variablesBackupState));
        LAMAPOperator = Integer.parseInt(IntegerNullCheck("LAMAPOperator", variablesBackupState));
        LADyYByDxMAPOperator = Integer.parseInt(IntegerNullCheck("LADyYByDxMAPOperator", variablesBackupState));
        DiffTermOperator = Integer.parseInt(IntegerNullCheck("DiffTermOperator", variablesBackupState));
        LADiffFactorOperator = Integer.parseInt(IntegerNullCheck("LADiffFactorOperator", variablesBackupState));
        LADiffIndConstOperator = Integer.parseInt(IntegerNullCheck("LADiffIndConstOperator", variablesBackupState));

        LAConstSimpleMapFlag = Boolean.parseBoolean(variablesBackupState.get("LAConstSimpleMapFlag" + StrKeyBackUpRestore + depthBackUpRestore));
        LAConstComplexMapFlag = Boolean.parseBoolean(variablesBackupState.get("LAConstComplexMapFlag" + StrKeyBackUpRestore + depthBackUpRestore));
        LAVarSimpleMapFlag = Boolean.parseBoolean(variablesBackupState.get("LAVarSimpleMapFlag" + StrKeyBackUpRestore + depthBackUpRestore));
        LAVarComplexMapFlag = Boolean.parseBoolean(variablesBackupState.get("LAVarComplexMapFlag" + StrKeyBackUpRestore + depthBackUpRestore));
        DiffConstSimpleMapFlag = Boolean.parseBoolean(variablesBackupState.get("DiffConstSimpleMapFlag" + StrKeyBackUpRestore + depthBackUpRestore));
        DiffConstComplexMapFlag = Boolean.parseBoolean(variablesBackupState.get("DiffConstComplexMapFlag" + StrKeyBackUpRestore + depthBackUpRestore));

        LastLADiffIndConstAidPos = Integer.parseInt(IntegerNullCheck("LastLADiffIndConstAidPos", variablesBackupState));
        LastLADiffConstCoeffAidPos = Integer.parseInt(IntegerNullCheck("LastLADiffConstCoeffAidPos", variablesBackupState));

        GotBracesVarFlag = Boolean.parseBoolean(variablesBackupState.get("GotBracesVarFlag" + StrKeyBackUpRestore + depthBackUpRestore));
        posIndConst = Integer.parseInt(IntegerNullCheck("posIndConst", variablesBackupState));
        ContainsFuncFlag = Boolean.parseBoolean(variablesBackupState.get("ContainsFuncFlag" + StrKeyBackUpRestore + depthBackUpRestore));
        FunctionStr = variablesBackupState.get("FunctionStr" + StrKeyBackUpRestore + depthBackUpRestore);
        ParenthesisFlag = Boolean.parseBoolean(variablesBackupState.get("ParenthesisFlag" + StrKeyBackUpRestore + depthBackUpRestore));

        GotBracesCount = Integer.parseInt(IntegerNullCheck("GotBracesCount", variablesBackupState));
        GotBracesCountCurr = Integer.parseInt(IntegerNullCheck("GotBracesCountCurr", variablesBackupState));

        timesLoop = Integer.parseInt(IntegerNullCheck("timesLoop", variablesBackupState));
        LastExpr = variablesBackupState.get("LastExpr" + StrKeyBackUpRestore + depthBackUpRestore);
        TermOutput = Double.parseDouble(DoubleNullCheck("TermOutput", variablesBackupState));
        TermOutputIndConst = Double.parseDouble(DoubleNullCheck("TermOutputIndConst", variablesBackupState));
        TermOutputAddedOnceFlag = Boolean.parseBoolean(variablesBackupState.get("TermOutputAddedOnceFlag" + StrKeyBackUpRestore + depthBackUpRestore));
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

    public static void BackupParserState(Map<String, String> variablesBackupState) {
        //Backup Expression
        variablesBackupState.put("posExpr" + StrKeyBackUpRestore + depthBackUpRestore, "" + posExpr);
        variablesBackupState.put("chExpr" + StrKeyBackUpRestore + depthBackUpRestore, "" + chExpr);
        variablesBackupState.put("StrExpr" + StrKeyBackUpRestore + depthBackUpRestore, StrExpr);
        //Backup Simple Expression
        variablesBackupState.put("pos" + StrKeyBackUpRestore + depthBackUpRestore, "" + pos);
        variablesBackupState.put("ch" + StrKeyBackUpRestore + depthBackUpRestore, "" + ch);
        variablesBackupState.put("Str" + StrKeyBackUpRestore + depthBackUpRestore, Str);

        //Backup Simple Term
        variablesBackupState.put("posTerm" + StrKeyBackUpRestore + depthBackUpRestore, "" + posTerm);
        variablesBackupState.put("chTerm" + StrKeyBackUpRestore + depthBackUpRestore, "" + chTerm);
        variablesBackupState.put("StrTerm" + StrKeyBackUpRestore + depthBackUpRestore, StrTerm);

        //Backup OrderVar
        variablesBackupState.put("posOrder" + StrKeyBackUpRestore + depthBackUpRestore, "" + posOrder);
        variablesBackupState.put("chOrder", "" + chOrder);
        variablesBackupState.put("StrOrder", StrOrder);

        //Backup LookAheadSign
        variablesBackupState.put("posSign" + StrKeyBackUpRestore + depthBackUpRestore, "" + posSign);
        variablesBackupState.put("chSign" + StrKeyBackUpRestore + depthBackUpRestore, "" + chSign);
        variablesBackupState.put("chTermSign" + StrKeyBackUpRestore + depthBackUpRestore, "" + chTermSign);
        variablesBackupState.put("StrSign" + StrKeyBackUpRestore + depthBackUpRestore, StrSign);

        //Backup LoohAheadConst
        variablesBackupState.put("posLA" + StrKeyBackUpRestore + depthBackUpRestore, "" + posLA);
        variablesBackupState.put("chLA" + StrKeyBackUpRestore + depthBackUpRestore, "" + chLA);
        variablesBackupState.put("StrLA" + StrKeyBackUpRestore + depthBackUpRestore, StrLA);

        //Backup LoohAheadVar
        variablesBackupState.put("posVar" + StrKeyBackUpRestore + depthBackUpRestore, "" + posVar);
        variablesBackupState.put("chVar" + StrKeyBackUpRestore + depthBackUpRestore, "" + chVar);
        variablesBackupState.put("StrVar" + StrKeyBackUpRestore + depthBackUpRestore, StrVar);

        //Backup LookAheadIndConst
        variablesBackupState.put("posIndConst" + StrKeyBackUpRestore + depthBackUpRestore, "" + posIndConst);
        variablesBackupState.put("chIndConst" + StrKeyBackUpRestore + depthBackUpRestore, "" + chIndConst);
        variablesBackupState.put("StrIndConst" + StrKeyBackUpRestore + depthBackUpRestore, StrIndConst);

    }

    public static void RestoreParserState(Map<String, String> variablesBackupState) {
        //Restore Expression
        posExpr = Integer.parseInt(IntegerNullCheck("posExpr", variablesBackupState));
        chExpr = Integer.parseInt(IntegerNullCheck("chExpr", variablesBackupState));
        StrExpr = variablesBackupState.get("StrExpr" + StrKeyBackUpRestore + depthBackUpRestore);

        //Restore Simple Expression
        pos = Integer.parseInt(IntegerNullCheck("pos", variablesBackupState));
        ch = Integer.parseInt(IntegerNullCheck("ch", variablesBackupState));
        Str = variablesBackupState.get("Str" + StrKeyBackUpRestore + depthBackUpRestore);

        //Restore Simple Term
        posTerm = Integer.parseInt(IntegerNullCheck("posTerm", variablesBackupState));
        chTerm = Integer.parseInt(IntegerNullCheck("chTerm", variablesBackupState));
        StrTerm = variablesBackupState.get("StrTerm" + StrKeyBackUpRestore + depthBackUpRestore);

        //Restore OrderVar
        posOrder = Integer.parseInt(IntegerNullCheck("posOrder", variablesBackupState));
        chOrder = Integer.parseInt(IntegerNullCheck("chOrder", variablesBackupState));;
        StrOrder = variablesBackupState.get("StrOrder" + StrKeyBackUpRestore + depthBackUpRestore);

        //Restore LookAheadSign
        posSign = Integer.parseInt(IntegerNullCheck("posSign", variablesBackupState));
        chSign = Integer.parseInt(IntegerNullCheck("chSign", variablesBackupState));
        chTermSign = Integer.parseInt(IntegerNullCheck("chTermSign", variablesBackupState));
        StrSign = variablesBackupState.get("StrSign" + StrKeyBackUpRestore + depthBackUpRestore);

        //Restore LoohAheadConst
        posLA = Integer.parseInt(IntegerNullCheck("posLA", variablesBackupState));
        chLA = Integer.parseInt(IntegerNullCheck("chLA", variablesBackupState));
        StrLA = variablesBackupState.get("StrLA" + StrKeyBackUpRestore + depthBackUpRestore);

        //Restore LoohAheadVar
        posVar = Integer.parseInt(IntegerNullCheck("posVar", variablesBackupState));
        chVar = Integer.parseInt(IntegerNullCheck("chVar", variablesBackupState));
        StrVar = variablesBackupState.get("StrVar" + StrKeyBackUpRestore + depthBackUpRestore);

        //Restore LookAheadIndConst
        posIndConst = Integer.parseInt(IntegerNullCheck("posIndConst", variablesBackupState));
        chIndConst = Integer.parseInt(IntegerNullCheck("chIndConst", variablesBackupState));
        StrIndConst = variablesBackupState.get("StrIndConst" + StrKeyBackUpRestore + depthBackUpRestore);

    }

    public static void ChaosPrevention() {
        // Need to Debug which variable is causing 
        // the unpredictability
        //ChaosDebuger("ChaosPrevention", "ChaosPrevention", "Initial", "Str", Str);
        InitParserState();
        //ChaosDebuger("ChaosPrevention", "ChaosPrevention", "FinalParserState", "Str", Str); 
        InitTestCase();
        InitState();
        InitDiffIntegreSep();
    }

    public static void InitParserState() {
        //  Expression character Index and Character Variable    
        posExpr = -1;
        chExpr = -1;
        StrExpr = "";

        // Simple Expression & Simple Term character Index and Character Variable    
        pos = -1;
        ch = -1;
        chTerm = -1;
        posTerm = -1;
        Str = "";
        // LookAheadConst character Index and Character Variable    
        posLA = -1;
        chLA = -1;
        // LookAheadVar character Index and Character Variable 
        posVar = -1;
        chVar = -1;
        // Sign character Index and Character Variable 
        posSign = -1;
        chSign = -1;
        chTermSign = -1;
        // Order character Index and Character Variable
        posOrder = -1;
        chOrder = -1;
        // LookAheadIndConst character Index and Character Variable
        posIndConst = -1;
        chIndConst = -1;
        LookAheadOperator = 0;

        StrTerm = "";
        StrSign = "";
        StrLA = "";
        StrVar = "";
        StrIndConst = "";
        StrOrder = "";

        //LAConstDiff Expression character Index and Character Variable
        posLADiff = -1;
        chLADiff = -1;
        StrLADiff = "";
        //Diff Expression character Index and Character Variable
        posDiff = -1;
        chDiff = -1;
        StrDiff = "";
        //Diff Expression character Index and Character Variable
        posIntegr = -1;
        chIntegr = -1;
        StrIntegr = "";
        //Parse State Variables
        // PUBLIC VARIABLES USED IN OTHER FILES
        //IsAConstant Return Type 
        StrIsAConstant = "";
    }

    public static void InitTestCase() {

        ParenthesisHighLvlNum = 0;
        ParenthesisCurrNum = 0;

        ParenthesisFlag = false;
        NormalNotPareFlag = true;
        SavedOperator = 0;
        ParenthesisOperator = 0;
        NumCoeff = 0;
        CoeffCoeff = 0;

        //Global Common Flags for each Interface
        ParanExprFlag = false;

        // SimpleTerm Interface Variables 
        ComplexAssignFlag = false;
        GotVariableFlag = false;
        GotVariablePos = 0;
        GotExpntNumFlag = false;
        TermOperatorPos = -1;
        TermOutputOperator = -1;
        TermOutput = 0.0;
        TermOutputIndConst = 0.0;
        GotExtremityFlag = false;
        GotIndConstFlag = false;
        GotIndConstPos = 0;
        TempIndConstBase = "";
        TempIndConstStrSet = false;
        TrailConstantFlag = false;
        TrailConstantOperator = -1;
        timesLoop = 0;
        ContainsXFlag = false;
        ContainsIndConstFlag = false;
        TermOutputSetFlag = false;
        TermOutputOperator = -1;
        LATermOperatorBraces = -1;
        LAPreTermOperator = -1;
        LATermOperator = -1;
        LAVarTermOperator = -1;
        LAPreIndConstOperator = -1;
        LAIndConstOperator = -1;
        LAMAPOperator = -1;
        LADyYByDxMAPOperator = -1;
        LAVarSimpleMapFlag = false;
        LAVarComplexMapFlag = false;
        DiffTermOperator = -1;
        LADiffFactorOperator = -1;
        LADiffIndConstOperator = -1;
        LastInvokedFlag = "";
        LastInvokedPos = -1;
        LastLADiffIndConstAidPos = -1;
        LastLADiffExtremityAidPos = -1;
        LastLADiffConstCoeffAidPos = -1;
        ParseMapposModFlag = false;
        ZeroTermSignFlag = false;
        // Maximum Order of the Term or Expression
        MaxTermOutput = 0.0;
        FunctionStr = "";
        ContainsFuncFlag = false;
        LAConstSimpleMapFlag = false;
        LAConstComplexMapFlag = false;

        //Function Argument Flag
        GotBracesVarFlag = false;
        GotParenPos = -1;
        GotBracesCount = -1;
        GotBracesCountCurr = -1;
        // Diff Interface Variables 
        FactorsExpr = "";
        FactorsDiffExpr = "";
        FunctionExpr = "";
        FunctionDiffExpr = "";
        ParanExpr = "";
        ParanDiffExpr = "";
        EnteredLAConstFlag = false;
        DiffConstSimpleMapFlag = false;
        DiffConstComplexMapFlag = false;
    }

    public static void ParseLog(String ExprDesc, String HighLevelCallFunc, String InitialORFinal, String StrDesc, String MyStr) {
        if ((pos > 0) && (pos < Str.length()) && (Str != null) && (!Str.equalsIgnoreCase(""))) {
            log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLog:" + InitialORFinal + ":" + "Str" + "=" + Str.substring(pos));
        }
        if ((posTerm > 0) && (posTerm < StrTerm.length()) && (StrTerm != null) && (!StrTerm.equalsIgnoreCase(""))) {
            log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLog:" + InitialORFinal + ":" + "StrTerm" + "=" + StrTerm.substring(posTerm));
        }
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLog:" + InitialORFinal + ":" + StrDesc + "=" + MyStr);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLog:" + InitialORFinal + ":StrExpr=" + StrExpr);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLog:" + InitialORFinal + ":StrLA=" + StrLA);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLog:" + InitialORFinal + ":StrVar=" + StrVar);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLog:" + InitialORFinal + ":StrIndConst=" + StrIndConst);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLog:" + InitialORFinal + ":posSign=" + posSign + " chSign=" + (char) chSign + " chSign=" + chSign + " chTermSign=" + (char) chTermSign + " chTermSign=" + chTermSign);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLog:" + InitialORFinal + ":posLA=" + posLA + " chLA=" + (char) chLA);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLog:" + InitialORFinal + ":posVar=" + posVar + " chVar=" + (char) chVar + " TermOutputOperator=" + (char) TermOutputOperator);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLog:" + InitialORFinal + ":posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLog:" + InitialORFinal + ":posTerm=" + posTerm + " chTerm=" + (char) chTerm);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLog:" + InitialORFinal + ":posExpr=" + posExpr + " chExpr=" + (char) chExpr);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLog:" + InitialORFinal + ":pos=" + pos + " ch=" + (char) ch);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLog:" + InitialORFinal + ":posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLog:" + InitialORFinal + ":posDiff=" + posDiff + " chDiff=" + (char) chDiff);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLog:" + InitialORFinal + ":posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLog:" + InitialORFinal + ":ContainsIndConstFlag=" + ContainsIndConstFlag + " ComplexAssignFlag=" + ComplexAssignFlag + " ContainsXFlag=" + ContainsXFlag);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLog:" + InitialORFinal + ":TrailConstantFlag=" + TrailConstantFlag + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " GotExpntNumFlag=" + GotExpntNumFlag);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLog:" + InitialORFinal + ":TempIndConstStrSet=" + TempIndConstStrSet);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLog:" + InitialORFinal + ":GotVariablePos=" + GotVariablePos + " GotIndConstPos=" + GotIndConstPos + " TermOperatorPos=" + TermOperatorPos);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLog:" + InitialORFinal + ":LATermOperator=" + (char) LATermOperator + " LATermOperatorBraces=" + (char) LATermOperatorBraces);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLog:" + InitialORFinal + ":LAIndConstOperator=" + (char) LAIndConstOperator + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " TrailConstantOperator=" + (char) TrailConstantOperator);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLog:" + InitialORFinal + " LAPreTermOperator=" + (char) LAPreTermOperator);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLog:" + InitialORFinal + " LAMAPOperator=" + (char) LAMAPOperator + " LADyYByDxMAPOperator=" + (char) LADyYByDxMAPOperator);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLog:" + InitialORFinal + " DiffTermOperator=" + (char) DiffTermOperator + " GotExpntNumFlag=" + GotExpntNumFlag);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLog:" + InitialORFinal + " LADiffFactorOperator=" + (char) LADiffFactorOperator);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLog:" + InitialORFinal + " LADiffIndConstOperator=" + (char) LADiffIndConstOperator);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLog:" + InitialORFinal + " LAConstSimpleMapFlag=" + LAConstSimpleMapFlag + " LAConstComplexMapFlag=" + LAConstComplexMapFlag);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLog:" + InitialORFinal + " LAVarSimpleMapFlag=" + LAVarSimpleMapFlag + " LAVarComplexMapFlag=" + LAVarComplexMapFlag);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLog:" + InitialORFinal + " DiffConstSimpleMapFlag=" + DiffConstSimpleMapFlag + " DiffConstComplexMapFlag=" + DiffConstComplexMapFlag);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLog:" + InitialORFinal + " LastLADiffIndConstAidPos=" + LastLADiffIndConstAidPos + " LastLADiffConstCoeffAidPos=" + LastLADiffConstCoeffAidPos);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLog:" + InitialORFinal + " GotBracesVarFlag=" + GotBracesVarFlag + " ParenthesisFlag=" + ParenthesisFlag);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLog:" + InitialORFinal + " GotBracesCount=" + GotBracesCount + " GotBracesCountCurr=" + GotBracesCountCurr);
        // Integer Parser && Control State
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLog:" + InitialORFinal + " ParanExprFlag=" + ParanExprFlag);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLog:" + InitialORFinal + " LastLADiffConstCoeffAidPos=" + LastLADiffConstCoeffAidPos);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLog:" + InitialORFinal + " ParanExprFlag=" + ParanExprFlag + " ParanExprInProgressFlag=" + ParanExprInProgressFlag);
        log.info(ExprDesc + ":" + HighLevelCallFunc + ":ParseLog:" + InitialORFinal + " FuncName=" + FuncName + " timesLoop=" + timesLoop);
    }

    public static void ChaosDebuger(String ExprDesc, String HighLevelCallFunc, String InitialORFinal, String StrDesc, String MyStr) {
        if ((pos > 0) && (pos < Str.length()) && (Str != null) && (!Str.equalsIgnoreCase(""))) {
            System.out.println(ExprDesc + ":" + HighLevelCallFunc + ":ChaosDebuger:" + InitialORFinal + ":" + "Str" + "=" + Str.substring(pos));
        }
        if ((posTerm > 0) && (posTerm < StrTerm.length()) && (StrTerm != null) && (!StrTerm.equalsIgnoreCase(""))) {
            System.out.println(ExprDesc + ":" + HighLevelCallFunc + ":ChaosDebuger:" + InitialORFinal + ":" + "StrTerm" + "=" + StrTerm.substring(posTerm));
        }
        System.out.println(ExprDesc + ":" + HighLevelCallFunc + ":ChaosDebuger:" + InitialORFinal + ":" + StrDesc + "=" + MyStr);
        System.out.println(ExprDesc + ":" + HighLevelCallFunc + ":ChaosDebuger:" + InitialORFinal + ":StrExpr=" + StrExpr);
        System.out.println(ExprDesc + ":" + HighLevelCallFunc + ":ChaosDebuger:" + InitialORFinal + ":posSign=" + posSign + " chSign=" + (char) chSign + " chSign=" + chSign + " chTermSign=" + (char) chTermSign + " chTermSign=" + chTermSign);
        System.out.println(ExprDesc + ":" + HighLevelCallFunc + ":ChaosDebuger:" + InitialORFinal + ":posLA=" + posLA + " chLA=" + (char) chLA);
        System.out.println(ExprDesc + ":" + HighLevelCallFunc + ":ChaosDebuger:" + InitialORFinal + ":posVar=" + posVar + " chVar=" + (char) chVar);
        System.out.println(ExprDesc + ":" + HighLevelCallFunc + ":ChaosDebuger:" + InitialORFinal + ":posIndConst=" + posIndConst + " chIndConst=" + (char) chIndConst);
        System.out.println(ExprDesc + ":" + HighLevelCallFunc + ":ChaosDebuger:" + InitialORFinal + ":posTerm=" + posTerm + " chTerm=" + (char) chTerm);
        System.out.println(ExprDesc + ":" + HighLevelCallFunc + ":ChaosDebuger:" + InitialORFinal + ":posExpr=" + posExpr + " chExpr=" + (char) chExpr);
        System.out.println(ExprDesc + ":" + HighLevelCallFunc + ":ChaosDebuger:" + InitialORFinal + ":pos=" + pos + " ch=" + (char) ch);
        System.out.println(ExprDesc + ":" + HighLevelCallFunc + ":ChaosDebuger:" + InitialORFinal + ":posIntegr=" + posIntegr + " chIntegr=" + (char) chIntegr);
        System.out.println(ExprDesc + ":" + HighLevelCallFunc + ":ChaosDebuger:" + InitialORFinal + ":posDiff=" + posDiff + " chDiff=" + (char) chDiff);
        System.out.println(ExprDesc + ":" + HighLevelCallFunc + ":ChaosDebuger:" + InitialORFinal + ":posLADiff=" + posLADiff + " chLADiff=" + (char) chLADiff);
        System.out.println(ExprDesc + ":" + HighLevelCallFunc + ":ChaosDebuger:" + InitialORFinal + ":ContainsIndConstFlag=" + ContainsIndConstFlag + " ComplexAssignFlag=" + ComplexAssignFlag + " ContainsXFlag=" + ContainsXFlag);
        System.out.println(ExprDesc + ":" + HighLevelCallFunc + ":ChaosDebuger:" + InitialORFinal + ":TrailConstantFlag=" + TrailConstantFlag + " GotVariableFlag=" + GotVariableFlag + " GotIndConstFlag=" + GotIndConstFlag + " GotExpntNumFlag=" + GotExpntNumFlag);
        System.out.println(ExprDesc + ":" + HighLevelCallFunc + ":ChaosDebuger:" + InitialORFinal + ":GotVariablePos=" + GotVariablePos + " GotIndConstPos=" + GotIndConstPos + " TermOperatorPos=" + TermOperatorPos);
        System.out.println(ExprDesc + ":" + HighLevelCallFunc + ":ChaosDebuger:" + InitialORFinal + ":LATermOperator=" + (char) LATermOperator + " LATermOperatorBraces=" + (char) LATermOperatorBraces);
        System.out.println(ExprDesc + ":" + HighLevelCallFunc + ":ChaosDebuger:" + InitialORFinal + ":LAIndConstOperator=" + (char) LAIndConstOperator + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator + " LAVarTermOperator=" + (char) LAVarTermOperator + " TrailConstantOperator=" + (char) TrailConstantOperator);
        System.out.println(ExprDesc + ":" + HighLevelCallFunc + ":ChaosDebuger:" + InitialORFinal + " LAPreTermOperator=" + (char) LAPreTermOperator);
        System.out.println(ExprDesc + ":" + HighLevelCallFunc + ":ChaosDebuger:" + InitialORFinal + " LAMAPOperator=" + (char) LAMAPOperator + " LADyYByDxMAPOperator=" + (char) LADyYByDxMAPOperator);
        System.out.println(ExprDesc + ":" + HighLevelCallFunc + ":ChaosDebuger:" + InitialORFinal + " DiffTermOperator=" + (char) DiffTermOperator);
        System.out.println(ExprDesc + ":" + HighLevelCallFunc + ":ChaosDebuger:" + InitialORFinal + " LADiffFactorOperator=" + (char) LADiffFactorOperator);
        System.out.println(ExprDesc + ":" + HighLevelCallFunc + ":ChaosDebuger:" + InitialORFinal + " LADiffIndConstOperator=" + (char) LADiffIndConstOperator);
        System.out.println(ExprDesc + ":" + HighLevelCallFunc + ":ChaosDebuger:" + InitialORFinal + " LAConstSimpleMapFlag=" + LAConstSimpleMapFlag + " LAConstComplexMapFlag=" + LAConstComplexMapFlag);
        System.out.println(ExprDesc + ":" + HighLevelCallFunc + ":ChaosDebuger:" + InitialORFinal + " LAVarSimpleMapFlag=" + LAVarSimpleMapFlag + " LAVarComplexMapFlag=" + LAVarComplexMapFlag);
        System.out.println(ExprDesc + ":" + HighLevelCallFunc + ":ChaosDebuger:" + InitialORFinal + " DiffConstSimpleMapFlag=" + DiffConstSimpleMapFlag + " DiffConstComplexMapFlag=" + DiffConstComplexMapFlag);
        System.out.println(ExprDesc + ":" + HighLevelCallFunc + ":ChaosDebuger:" + InitialORFinal + " LastLADiffIndConstAidPos=" + LastLADiffIndConstAidPos + " LastLADiffConstCoeffAidPos=" + LastLADiffConstCoeffAidPos);
        System.out.println(ExprDesc + ":" + HighLevelCallFunc + ":ChaosDebuger:" + InitialORFinal + " GotBracesVarFlag=" + GotBracesVarFlag + " ParenthesisFlag=" + ParenthesisFlag);
        System.out.println(ExprDesc + ":" + HighLevelCallFunc + ":ChaosDebuger:" + InitialORFinal + " GotBracesCount=" + GotBracesCount + " GotBracesCountCurr=" + GotBracesCountCurr);
    }

    public static void ChaosPreventionLowLevel() {
        posLA = -1;
        posVar = -1;
        posIndConst = -1;
        chLA = -1;
        chVar = -1;
        chIndConst = -1;
        GotIndConstPos = -1;
    }

    public static boolean HaltingProblem(String AlgoName, int DifferencePosTerm, int Mych, String StrDesc, String MyStr, int MyStrStart, int OldStart) {
        if (OldStart == -1) {
            OldStart = 0;
        }
        if (MyStrStart == -1) {
            MyStrStart = 0;
        }
        if ((DifferencePosTerm <= 1) && (IsNotAnOperator(Mych)) && (Mych > -1) && (Mych != ')') && (Mych != '(') && (!MyStr.equalsIgnoreCase(""))) {
            //throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + " : " + AlgoName + " HaltingProblem:Infinite Loop:DifferencePosTerm=" + DifferencePosTerm + " Unexpected: " + (char) Mych + " int=" + (int) Mych + " Cannot Format:" + StrDesc + " : " + MyStr.substring(MyStrStart, MyStr.length()) + " at position=" + MyStrStart + " OldStart=" + OldStart);
        }
        return false;
    }

    public static void xmain(String... args) {
        //Uncomment Below Lines for Production Or Release version
        mainProdUser(args);
    }

    public static void mainHghRegression() {
        String StartMyTestCase = "1000";//Test Case Number : Options :All or a Single Number
        String EndMyTestCase = "110023";//Test Case Number : Options :All or a Single Number
        int MaxDiffOrder = 5; // Maximum Differentiation Order (with Answers): 5 :Integration Order (with Answers): 5;
        String TestCaseType = "LimitedRegression";//Test Suite Type:Individual OR LimitedRegression OR Regression
        TestHarnessClass MyTestData = new TestHarnessClass(14, StartMyTestCase, EndMyTestCase, TestCaseType);
        System.out.println(ConsoleColors.BLUE + "Starting Test Case:100 End TestCase 110007 " + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Sanity Test Cases: 100 to 125 " + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Unit Test Cases: 5019 to 5042 " + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Names Test Cases: 10001 to 10005 " + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Coefficients Test Case: 20001 to 20092 " + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Exponent Test Case: 30001 to 30011 " + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "SignedX Case: 40001 to 40034 " + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Independent Constants Case: 50001 to 50044 " + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Parenthesis Test Case: 80001 to 80012 " + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Function Test Case: 90001 " + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Function Argument Test Case: 100001 " + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Software Engg Test Case: 110001 to 110007" + ConsoleColors.RESET);
        //Uncomment Below Lines for Stand Alone Differentiation Regression Suite
        System.out.println(ConsoleColors.BLUE + "Regression Test Suite (Differentiation)" + ConsoleColors.RESET);
        //mainRegresssionDiffTest(MaxDiffOrder, MyTestData);

        //Uncomment Below Lines for Stand Alone Integration Regression Suite
        System.out.println(ConsoleColors.BLUE + "Regression Test Suite(Integration)" + ConsoleColors.RESET);
        MyTestData = new TestHarnessClass(14, StartMyTestCase, EndMyTestCase, TestCaseType);
        //mainRegressionIntegrTest(MaxDiffOrder, MyTestData);
        System.out.println(ConsoleColors.BLUE + "Regression Test Suite(Algebra)" + ConsoleColors.RESET);
        StartMyTestCase = "100";
        EndMyTestCase = "225";
        MyTestData = new TestHarnessClass(14, StartMyTestCase, EndMyTestCase, TestCaseType);
        //mainRegresssionAlgebra(MyTestData);
        StartMyTestCase = "100";
        EndMyTestCase = "225";
        MyTestData = new TestHarnessClass(14, StartMyTestCase, EndMyTestCase, TestCaseType);
        mainRegresssionHghLvlExprODETest(MaxDiffOrder, MyTestData);
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

        System.out.println(ConsoleColors.BLUE + "User Basic ODE Solver Demo" + ConsoleColors.RESET);
        //CalculusApplication.SchrodingerEquationMethod1();
        System.out.println(ConsoleColors.BLUE + "User Basic ODE Solver Demo" + ConsoleColors.RESET);
        //CalculusApplication.SchrodingerEquationMethod2();
    }

    public static void InitState() {
        // Expression Term character Index and Character Variable    
        posExpr = -1;
        chExpr = 0;
        StrExpr = "";

        // Simple Expression & Simple Term character Index and Character Variable    
        pos = -1;
        ch = 0;
        chTerm = 0;
        posTerm = -1;
        Str = "";
        StrCurrentTimeTaken = null;
    }
}
