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

import Calculus.ExprSimpleStrSep.SimpleStr;
import static Calculus.ExprSimpleStrSep.parseSimple;
import Calculus.MathsContxtLAv.*;
import static Calculus.MathsContxtLAv.MyFuncExpress;
import static Calculus.MathsExpressionParser.eatAll;
import static Calculus.MathsExpressionParser.parse;
import static Calculus.UsageCalculus.CheckAnsTestSummary;
import static Calculus.UsageCalculus.EndTestCase;
import static Calculus.UsageCalculus.FileBasedTest;
import static Calculus.UsageCalculus.UserTestPredicate;
import static Calculus.UsageCalculus.mainRegresssionHghLvlExprODETest;
import static Calculus.UsageCalculus.mainRegresssionPredicate;
import static Calculus.UsageCalculus.mainRegresssionTest;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import org.apache.log4j.Logger;

/**
 *
 * @author Rajesh V Pai
 */
public class MathematicalTestHarness {

    public static Logger log = Logger.getLogger(MathematicalTestHarness.class.getName());
    public static LogLevel GBLMyLogLevel = LogLevel.Off;
    public static boolean InvertAnsIfNecessaryFlag = false;
   
    
    public static boolean TestCaseFailCoarseReportingFlag = false;
    public static boolean RunAllTestCasesFlag = false;
    public static boolean IgnoreKnownIssuesFlag = false;
    public static boolean IgnoreCoreIssuesFlag = true;
    public static boolean HideInRecurseFlag = true;

    public static boolean AITestResultsGenFlag = false;
    public static boolean SuperDevelopmentFlag = false;
    public static boolean MarianaTrenchReasoningLambdaFlag = false;
    public static boolean DetailedFailureSummaryAloneFlag = false;

    public static boolean DevelopmentFlag = false;
    public static boolean TestingFlag = true;
    public static String GBLSilent = "Silent";// Silent, Verbose
    public static boolean DevelopmentDeepInfoFlag = false;
    public static String GBLSilentDeepInfo = "Silent";// Silent, Verbose
    public static boolean DevelopmentDeepInfoLambdaFlag = false;
    public static String GBLSilentDeepInfoLambda = "Silent";// Silent, Verbose
    public static boolean DevelopmentReasoningLambdaFlag = false;
    public static String GBLSilentReasoningLambda = "Silent";// Silent, Verbose

    public static boolean DevelopmentFlagSep = false;
    public static String GBLSilentSep = "Silent";// Silent, Verbose
    public static boolean DevelopmentDeepInfoFlagSep = false;
    public static String GBLSilentDeepInfoSep = "Silent";// Silent, Verbose
    public static boolean DevelopmentDeepInfoLambdaFlagSep = false;
    public static String GBLSilentDeepInfoLambdaSep = "Silent";// Silent, Verbose
    public static boolean DevelopmentReasoningLambdaFlagSep = false;
    public static String GBLSilentReasoningLambdaSep = "Silent";// Silent, Verbose
    public static boolean AutoGenSilentFlag = true;

    static Map<String, Double> variables = new HashMap<>();
    static Map<String, String> variablesStr = new HashMap<>();

    public static String TestDiffWithRespTo = "x";
    public static boolean LowInitFlagRecordTime = false;
    public static double CompletionTime = 0.0;
    public static boolean AnsGenAIDiagnosticFlag = false;
    public static String Trace = "None";//None//Map1Map2";
    public static boolean DoNoTRunAutoFlag = false;

    public static void main(String... args) {
       
        if (LowInitFlagRecordTime == false) {
            LocalDateTime current = LocalDateTime.now();
            String[] TimeTaken = current.toString().split(":");
            CompletionTime = Double.parseDouble(TimeTaken[1]);
            System.out.println("MathematicalTestHarness:Started:MathsContxtLAv:Run Started Time:" + current + " ");
        }
        Trace = "None";//None//Map1Map2";
        SetDevFlags(false, "Silent", false);
        SetDiffrIntegrFlags(false, "Silent");
        DoNoTRunAutoFlag = true;
        //DevelopmentReasoningLambdaFlag=true;
        //DevelopmentDeepInfoLambdaFlag=true;
        String StartMyTestCase = "1000";//131001;//121001//100000//90000//80000;//50001;3000;//1000;  //Test Case Number : Options :All or a Single Number
        String EndMyTestCase = "110029";//131400;//121400;//100009//90022//80132;//50095;3499;131400//110029; //Test Case Number : Options :All or a Single Number
        //80036//80045//80096//80011//100003
        //2035//80034//80058//80064
        int MaxDiffOrder = 5; // Maximum Differentiation Order (with Answers): 5 :Integration Order (with Answers): 5;
        double NumberOfTestCases = Double.parseDouble(EndMyTestCase) - Double.parseDouble(StartMyTestCase);

        variables.put(TestDiffWithRespTo, 0.0);
        variables.put("Index", 1.0);
        variables.put("StartMyTestCase", Double.parseDouble(StartMyTestCase));
        String Exprn = "Index*x+StartMyTestCase";
        System.out.println(" MathematicalTestHarness:TestHarness Equation=" + Exprn);

        MathsExpressionParser.Expression expValue;
        expValue = parse(Exprn, variables, TestDiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
        StartMyTestCase = "" + Math.round(expValue.eval());
        System.out.println(" MathematicalTestHarness:Result(Expn Value:StartMyTestCase)=" + expValue.eval());
        variables.put(TestDiffWithRespTo, NumberOfTestCases);
        expValue = parse(Exprn, variables, TestDiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
        EndMyTestCase = "" + Math.round(expValue.eval());
        System.out.println(" MathematicalTestHarness:Result(Expn Value:EndMyTestCase)=" + expValue.eval());

        String TestCaseType = "LimitedRegression";//Test Suite Type:Individual OR LimitedRegression OR Regression
        //Options( MaxDiffOrder, StartMyTestCase, EndMyTestCase , TestCaseType);
        String xExprn = "Regression";
        System.out.println("0) Check Answers Value OR ");
        System.out.println("1) Check Answers String OR ");
        System.out.println("2) Run Regression OR ");
        System.out.println("3) Run Regression2 OR ");
        System.out.println("4) Run File Based Testing OR ");
        System.out.println("5) Run Idempotency Test OR ");
        System.out.println("8) 1 Equation Demo(UserInteractive)(Demo) OR ");
        System.out.println("9) HghLvlExprODE (ODE)");
        System.out.println("10) Schrodinger(Schro) OR ");
        System.out.println("11) FunctionComposition(FOG) OR ");
        System.out.print("12) String Vibration(String)(StringVibration): [" + xExprn + "]:");
        Scanner scanner = new Scanner(System.in);
        String TempxExprn = xExprn.trim();
        String TempxExprn2 = "Failures";
        TempxExprn = scanner.nextLine();
        if (TempxExprn.equalsIgnoreCase("")) {
            ;
        } else if ((TempxExprn.equalsIgnoreCase("CheckAnswersValue")) || (TempxExprn.equalsIgnoreCase("Check Answers Value")) || (TempxExprn.equalsIgnoreCase("0"))) {
            xExprn = "CheckAnswersValue";
        } else if ((TempxExprn.equalsIgnoreCase("CheckAnswersString")) || (TempxExprn.equalsIgnoreCase("Check AnswersString")) || (TempxExprn.equalsIgnoreCase("1"))) {
            xExprn = "CheckAnswersString";
        } else if ((TempxExprn.equalsIgnoreCase("Regression")) || (TempxExprn.equalsIgnoreCase("2"))) {
            ;
        } else if ((TempxExprn.equalsIgnoreCase("Regression2")) || (TempxExprn.equalsIgnoreCase("3"))) {
            xExprn = "Regression2";
        }else if ((TempxExprn.equalsIgnoreCase("FileBasedTest")) || (TempxExprn.equalsIgnoreCase("File Based Testing")) || (TempxExprn.equalsIgnoreCase("4"))) {
            xExprn = "FileBasedTest";
            System.out.println("    0) Run Null String Value (NullStr)OR ");
            System.out.println("    1) Run Failures (Fail)OR ");
            System.out.println("    2) Run Known Issues(KnwnI):");
            System.out.println("    3) Run Core Issues(CI):");
            System.out.println("    4) Run Wrong Ans Map1:");
            System.out.print("    5) Run Wrong Ans Map2: [" + TempxExprn2 + "]:");
            scanner = new Scanner(System.in);
            TempxExprn2 = scanner.nextLine();
            if ((TempxExprn2.equalsIgnoreCase("0")) || (TempxExprn2.equalsIgnoreCase("NullString")) || (TempxExprn2.equalsIgnoreCase("Null String"))) {
                TempxExprn2 = "NullStr";
            } else if ((TempxExprn2.equalsIgnoreCase("1")) || (TempxExprn2.equalsIgnoreCase("Failures")) || (TempxExprn2.equalsIgnoreCase("Failures in Curr Run"))) {
                TempxExprn2 = "Failures";
            } else if ((TempxExprn2.equalsIgnoreCase("2")) || (TempxExprn2.equalsIgnoreCase("KnwnI")) || (TempxExprn2.equalsIgnoreCase("Known Issues"))) {
                TempxExprn2 = "KnwnI";
            } else if ((TempxExprn2.equalsIgnoreCase("3")) || (TempxExprn2.equalsIgnoreCase("CI")) || (TempxExprn2.equalsIgnoreCase("Core Issues"))) {
                TempxExprn2 = "CI";
            } else if ((TempxExprn2.equalsIgnoreCase("4")) || (TempxExprn2.equalsIgnoreCase("WAMap1")) || (TempxExprn2.equalsIgnoreCase("Wrong Ans Map1"))) {
                TempxExprn2 = "WAMap1";
            } else if ((TempxExprn2.equalsIgnoreCase("5")) || (TempxExprn2.equalsIgnoreCase("WAMap2")) || (TempxExprn2.equalsIgnoreCase("Wrong Ans Map2"))) {
                TempxExprn2 = "WAMap2";
            } else if (TempxExprn2.equalsIgnoreCase("")) {
                TempxExprn2 = "Failures";
            } else {
                TempxExprn2 = "Failures";
            }
            System.out.println("You chose:" + TempxExprn2);
        } else if ((TempxExprn.equalsIgnoreCase("Idempontency")) || (TempxExprn.equalsIgnoreCase("Idemp")) || (TempxExprn.equalsIgnoreCase("5"))) {
            xExprn = "Idempontency";
        }else if ((TempxExprn.equalsIgnoreCase("8")) || (TempxExprn.equalsIgnoreCase("Demo")) || (TempxExprn.equalsIgnoreCase("UserInteractive"))) {
            xExprn = "UserInteractive";
        } else if ((TempxExprn.equalsIgnoreCase("HghLvlExprODE")) || (TempxExprn.equalsIgnoreCase("ODE")) || (TempxExprn.equalsIgnoreCase("9"))) {
            xExprn = "HghLvlExprODE";
        } else if ((TempxExprn.equalsIgnoreCase("Schrodinger")) || (TempxExprn.equalsIgnoreCase("Schro")) || (TempxExprn.equalsIgnoreCase("10"))) {
            xExprn = "Schrodinger";
        } else if ((TempxExprn.equalsIgnoreCase("FOG")) || (TempxExprn.equalsIgnoreCase("FunctionComposition")) || (TempxExprn.equalsIgnoreCase("11"))) {
            xExprn = "FOG";
        } else if ((TempxExprn.equalsIgnoreCase("String")) || (TempxExprn.equalsIgnoreCase("StringVibration")) || (TempxExprn.equalsIgnoreCase("12"))) {
            xExprn = "StringVibration";
        }
        xExprn = xExprn.trim();
        xExprn = eatAll(xExprn, ' ');
        if (AITestResultsGenFlag)
            System.out.println("You Entered:" + xExprn + " AI:" + AITestResultsGenFlag);
        else
            System.out.println("You Entered:" + xExprn + " Normal:" + AITestResultsGenFlag);

        if (xExprn.equalsIgnoreCase("CheckAnswersValue")) {
            System.out.println(" MathematicalTestHarness:MaxDiffOrder=" + MaxDiffOrder);
            TestHarnessClass MyTestData = new TestHarnessClass(14, StartMyTestCase, EndMyTestCase, TestCaseType);
            CheckAnsTestSummary(MaxDiffOrder, MyTestData, "Diffr", xExprn);
            MyTestData = new TestHarnessClass(14, StartMyTestCase, EndMyTestCase, TestCaseType);
            CheckAnsTestSummary(MaxDiffOrder, MyTestData, "Integr", xExprn);
        } else if (xExprn.equalsIgnoreCase("Idempontency")) {
            System.out.println(" MathematicalTestHarness:MaxDiffOrder=" + MaxDiffOrder);
            TestHarnessClass MyTestData = new TestHarnessClass(14, StartMyTestCase, EndMyTestCase, TestCaseType);
            CheckAnsTestSummary(MaxDiffOrder, MyTestData, "Diffr", xExprn);
            MyTestData = new TestHarnessClass(14, StartMyTestCase, EndMyTestCase, TestCaseType);
            CheckAnsTestSummary(MaxDiffOrder, MyTestData, "Integr", xExprn);
        } else if (xExprn.equalsIgnoreCase("CheckAnswersString")) {
            System.out.println(" MathematicalTestHarness:MaxDiffOrder=" + MaxDiffOrder);
            TestHarnessClass MyTestData = new TestHarnessClass(14, StartMyTestCase, EndMyTestCase, TestCaseType);
            CheckAnsTestSummary(MaxDiffOrder, MyTestData, "Diffr", xExprn);
            System.out.println(ConsoleColors.RED + "TEST FAILS WHEN CONFORMAL MAPPING 1 DOES SOME WORK:i.e F(x) != Conformal Map( F(x) ) " + ConsoleColors.RESET);
            MyTestData = new TestHarnessClass(14, StartMyTestCase, EndMyTestCase, TestCaseType);
            CheckAnsTestSummary(MaxDiffOrder, MyTestData, "Integr", xExprn);
            System.out.println(ConsoleColors.RED + "TEST FAILS WHEN CONFORMAL MAPPING 1 DOES SOME WORK:i.e F(x) != Conformal Map( F(x) ) " + ConsoleColors.RESET);
        } else if (xExprn.equalsIgnoreCase("Regression")) {
            System.out.println(" MathematicalTestHarness:MaxDiffOrder=" + MaxDiffOrder);
            TestHarnessClass MyTestData = new TestHarnessClass(14, StartMyTestCase, EndMyTestCase, TestCaseType);
            //JavaAiGen.mainRegresssionTest(MaxDiffOrder, MyTestData, "Diffr", xExprn);
            //mainRegresssionTest(MaxDiffOrder, MyTestData, "Diffr", xExprn);
            //System.out.println("Differentiation Complete");
            if (AITestResultsGenFlag) {
                System.out.println("You Entered:" + xExprn + " AI:" + AITestResultsGenFlag);
            } else {
                System.out.println("You Entered:" + xExprn + " Normal:" + AITestResultsGenFlag);
            }
            MyTestData = new TestHarnessClass(14, StartMyTestCase, EndMyTestCase, TestCaseType);
            //JavaAiGen.mainRegresssionTest(MaxDiffOrder, MyTestData, "Integr", xExprn);
            mainRegresssionTest(MaxDiffOrder, MyTestData, "Integr", xExprn);
            System.out.println("Integration Complete");
        } 
        else if (xExprn.equalsIgnoreCase("Regression2")) {
            System.out.println(" MathematicalTestHarness:MaxDiffOrder=" + MaxDiffOrder);
            TestHarnessClass MyTestData = new TestHarnessClass(14, StartMyTestCase, EndMyTestCase, TestCaseType);
            //JavaAiGen.mainRegresssionTest(MaxDiffOrder, MyTestData, "Diffr", xExprn);
            //mainRegresssionTest(MaxDiffOrder, MyTestData, "Diffr", xExprn);
            if (AITestResultsGenFlag)
            System.out.println("You Entered:" + xExprn + " AI:" + AITestResultsGenFlag);
        else
            System.out.println("You Entered:" + xExprn + " Normal:" + AITestResultsGenFlag);

            MyTestData = new TestHarnessClass(14, StartMyTestCase, EndMyTestCase, TestCaseType);
            //JavaAiGen.mainRegresssionTest(MaxDiffOrder, MyTestData, "Integr", xExprn);
            mainRegresssionTest(MaxDiffOrder, MyTestData, "Integr", xExprn);
        }
        else if (xExprn.equalsIgnoreCase("FileBasedTest")) {
            System.out.println(" MathematicalTestHarness:MaxDiffOrder=" + MaxDiffOrder);
            TestHarnessClass MyTestData = new TestHarnessClass(14, StartMyTestCase, EndMyTestCase, TestCaseType);
            FileBasedTest(MaxDiffOrder, MyTestData, "Diffr", TempxExprn2);
            MyTestData = new TestHarnessClass(14, StartMyTestCase, EndMyTestCase, TestCaseType);
            //FileBasedTest(MaxDiffOrder, MyTestData, "Integr", TempxExprn2);
            //TestPredicateMisc();
        } else if (xExprn.equalsIgnoreCase("UserInteractive")) {
            MathsContxtLAv.xmain();
        } else if (xExprn.equalsIgnoreCase("HghLvlExprODE")) {
            TestHarnessClass MyTestData = new TestHarnessClass(14, StartMyTestCase, EndMyTestCase, TestCaseType);
            mainRegresssionHghLvlExprODETest(MaxDiffOrder, MyTestData);
        } else if (xExprn.equalsIgnoreCase("Schrodinger")) {
            CalculusApplication.mainSchrodinger();
        } else if (xExprn.equalsIgnoreCase("FOG")) {
            VerifyInverse("x+5", "x", "y-5", "y");
            String xExprn1 = "";
            Scanner scanner1 = new Scanner(System.in);
            String TempxExprn1 = xExprn1.trim();
            TempxExprn1 = scanner1.nextLine();
        } else if (xExprn.equalsIgnoreCase("StringVibration")) {
            CalculusApplication.mainSchrodinger();
        }
        if (LowInitFlagRecordTime == false) {
            LocalDateTime current = LocalDateTime.now();
            String[] TimeTaken = current.toString().split(":");
            CompletionTime = Double.parseDouble(TimeTaken[1]) - CompletionTime;
            System.out.println("MathematicalTestHarness:Completed:Run Completed Time:" + current + " " + " CompletionTime=" + CompletionTime + " minutes");
            LowInitFlagRecordTime = true;
        }
    }

    public static void mainMathPredicate(String... args) {
        Map<String, Double> variables = new HashMap<>();
        //String Exprn = TestPredicate();
        String Exprn = UserTestPredicate;
        String DiffWithRespTo = "x";
        PredicateSep.PredicateBool expValue;

        MyFuncExpress();
        Exprn = eatAll(Exprn, ' ');

        int i = 1;
        for (double x = 0, y = 0; i < 10; y++, x++, i++) {
            variables.put("x", x);
            variables.put("y", y);
            System.out.println("mainMathPredicate: x=" + x + " y=" + y + " Exprn=" + Exprn);
            expValue = PredicateSep.parsePredicate(Exprn, variables, "Silent", MathsContxtLAv.LogLevel.Off);
            System.out.println(" mainMathPredicate:Result(Logical Value)=" + expValue.eval());
            System.out.print(System.lineSeparator());
        }
    }

    public static void TestPredicateMisc() {
        String StartMyTestCase = "100";//100;  // Test Case Number : Options :All or a Single Number
        String EndMyTestCase = "227";//227; // Test Case Number : Options :All or a Single Number
        String TestCaseType = "LimitedRegression";//Test Suite Type:Individual OR LimitedRegression OR Regression
        TestHarnessClass MyTestData = new TestHarnessClass(14, StartMyTestCase, EndMyTestCase, TestCaseType);

        StartMyTestCase = "100";
        EndTestCase = 227;
        MyTestData = new TestHarnessClass(14, StartMyTestCase, EndMyTestCase, TestCaseType);
        EndTestCase = 227;
        //mainMathPredicate(args);
        mainRegresssionPredicate(MyTestData);

        StartMyTestCase = "100";
        EndTestCase = 225;
        MyTestData = new TestHarnessClass(14, StartMyTestCase, EndMyTestCase, TestCaseType);
        EndTestCase = 225;
        //mainRegresssionExpr(MyTestData);
        StartMyTestCase = "100";
        EndTestCase = 225;
        MyTestData = new TestHarnessClass(14, StartMyTestCase, EndMyTestCase, TestCaseType);
        EndTestCase = 225;
        //mainRegresssionAlgebra(MyTestData);
        StartMyTestCase = "100";
        EndTestCase = 225;
        MyTestData = new TestHarnessClass(14, StartMyTestCase, EndMyTestCase, TestCaseType);
        EndTestCase = 225;
        //mainRegresssionSubs(MyTestData);
        StartMyTestCase = "102";
        EndTestCase = 102;
        MyTestData = new TestHarnessClass(14, StartMyTestCase, EndMyTestCase, TestCaseType);
        EndTestCase = 102;
        //mainRegresssionFInverse(MyTestData);
    }

    public static void Options(int MaxDiffOrder, String StartMyTestCase, String EndMyTestCase, String TestCaseType) {
        String xExprn = "Regression";
        System.out.print("Do you want to run Regression OR 1 Equation Demo(UserInteractive): [" + xExprn + "]:");
        Scanner scanner = new Scanner(System.in);
        String TempxExprn = xExprn.trim();
        TempxExprn = scanner.nextLine();
        if (TempxExprn.equalsIgnoreCase("")) {
            ;
        } else if (TempxExprn.equalsIgnoreCase("Regression")) {
            ;
        } else if ((TempxExprn.equalsIgnoreCase("Demo")) || (TempxExprn.equalsIgnoreCase("UserInteractive"))) {
            xExprn = "UserInteractive";
        }
        xExprn = xExprn.trim();
        xExprn = eatAll(xExprn, ' ');
        System.out.println("You Entered:" + xExprn);
        if (xExprn.equalsIgnoreCase("Regression")) {
            TestHarnessClass MyTestData = new TestHarnessClass(14, StartMyTestCase, EndMyTestCase, TestCaseType);
            mainRegresssionTest(MaxDiffOrder, MyTestData, "Diffr", xExprn);
            MyTestData = new TestHarnessClass(14, StartMyTestCase, EndMyTestCase, TestCaseType);
            mainRegresssionTest(MaxDiffOrder, MyTestData, "Integr", xExprn);
        } else if (xExprn.equalsIgnoreCase("UserInteractive")) {
            MathsContxtLAv.xmain();
        }
    }

    public static boolean VerifyInverse(String FunctionF, String DiffWithF, String FunctionG, String DiffWithG) {

        variables.put(DiffWithG, 2.0);
        variables.put(DiffWithF, 4.0);
        variablesStr.put(DiffWithG, DiffWithG);
        variablesStr.put(DiffWithF, DiffWithF);
        String FunctionG1 = FunctionG;
        FunctionG1 = FunctionG1.replaceAll(DiffWithG, DiffWithF);
        System.out.println(" FunctionF=" + FunctionF);
        System.out.println(" FunctionG=" + FunctionG1);
        SimpleStr SimpleString = parseSimple(FunctionF, variablesStr, DiffWithF, "Silent", ExprSimpleStrSep.LogLevel.Info);
        String IdX = SimpleString.evalStr().replaceAll(DiffWithF, FunctionG1);
        System.out.println(" SimpleString.evalStr()=" + SimpleString.evalStr());
        System.out.println(" IdX=" + IdX);

        String FunctionF1 = FunctionF.replaceAll(DiffWithF, DiffWithG);
        System.out.println(" FunctionF=" + FunctionF1);
        System.out.println(" FunctionG=" + FunctionG);
        SimpleStr SimpleString1 = parseSimple(FunctionG, variablesStr, DiffWithF, "Silent", ExprSimpleStrSep.LogLevel.Info);
        String IdY = SimpleString1.evalStr().replaceAll(DiffWithG, FunctionF1);
        System.out.println(" SimpleString1.evalStr()=" + SimpleString1.evalStr());
        System.out.println(" IdY=" + IdY);

        String xExprn = "";
        Scanner scanner = new Scanner(System.in);
        String TempxExprn = xExprn.trim();
        TempxExprn = scanner.nextLine();

        variables.clear();
        return false;
    }

    public static void SetDevFlags(boolean Value, String ValueStr, boolean MarianaFlag) {
        DevelopmentFlag = Value;
        TestingFlag = true;
        GBLSilent = ValueStr;// Silent, Verbose
        DevelopmentDeepInfoFlag = Value;
        GBLSilentDeepInfo = ValueStr;// Silent, Verbose
        DevelopmentDeepInfoLambdaFlag = Value;
        GBLSilentDeepInfoLambda = ValueStr;// Silent, Verbose
        DevelopmentReasoningLambdaFlag = Value;
        GBLSilentReasoningLambda = ValueStr;// Silent, Verbose
        MarianaTrenchReasoningLambdaFlag = MarianaFlag;
    }

    public static void SetDevFlagsAI(boolean Value, String ValueStr, boolean MarianaFlag) {
        DevelopmentFlag = false;
        TestingFlag = true;
        GBLSilent = ValueStr;// Silent, Verbose
        DevelopmentDeepInfoFlag = false;
        GBLSilentDeepInfo = ValueStr;// Silent, Verbose
        DevelopmentDeepInfoLambdaFlag = false;
        GBLSilentDeepInfoLambda = ValueStr;// Silent, Verbose
        DevelopmentReasoningLambdaFlag = Value;
        GBLSilentReasoningLambda = ValueStr;// Silent, Verbose
        MarianaTrenchReasoningLambdaFlag = MarianaFlag;
    }

    public static void SetDiffrIntegrFlags(boolean Value, String ValueStr) {

        DevelopmentFlagSep = Value;
        GBLSilentSep = ValueStr;// Silent, Verbose
        DevelopmentDeepInfoFlagSep = Value;
        GBLSilentDeepInfoSep = ValueStr;// Silent, Verbose
        DevelopmentDeepInfoLambdaFlagSep = Value;
        GBLSilentDeepInfoLambdaSep = ValueStr;// Silent, Verbose
        DevelopmentReasoningLambdaFlagSep = Value;
        GBLSilentReasoningLambdaSep = ValueStr;// Silent, Verbose 
    }
}
