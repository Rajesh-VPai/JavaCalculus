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

import static Calculus.ChatGPTIntegration.buildPrompt;
import static Calculus.ChatGPTIntegration.chatGPT;
import static Calculus.DiffrIntegrSep.ActualStrRuleUsed;
import static Calculus.MathsContxtLAv.ChaosPrevention;
import Calculus.MathsExpressionParser.Expression;
import static Calculus.DiffrIntegrSep.MyFuncDiff;
import static Calculus.MathsContxtLAv.MyFuncExpress;
import static Calculus.DiffrIntegrSep.MyFuncIntegr;
import static Calculus.MathematicalTestHarness.InvertAnsIfNecessaryFlag;
import static Calculus.MathematicalTestHarness.AITestResultsGenFlag;
import static Calculus.MathematicalTestHarness.DetailedFailureSummaryAloneFlag;
import static Calculus.MathematicalTestHarness.DoNoTRunAutoFlag;
import static Calculus.MathematicalTestHarness.GBLMyLogLevel;
import static Calculus.MathematicalTestHarness.GBLSilent;
import static Calculus.MathematicalTestHarness.HideInRecurseFlag;
import static Calculus.MathematicalTestHarness.TestCaseFailCoarseReportingFlag;
import static Calculus.MathematicalTestHarness.IgnoreKnownIssuesFlag;
import static Calculus.MathematicalTestHarness.SetDevFlags;
import static Calculus.MathematicalTestHarness.SetDevFlagsAI;
import static Calculus.MathematicalTestHarness.Trace;
import static Calculus.MathsContxtLAv.InitState;
import static Calculus.MathsContxtLAv.InitTestCase;
import static Calculus.MathsContxtLAv.MyFuncSimple;
import Calculus.MathsContxtLAv.OrderVar;
import Calculus.MathsContxtLAv.SimpleExpression;
import static Calculus.MathsExpressionParser.eatAll;
import static Calculus.MathsExpressionParser.parse;
import static Calculus.MathsContxtLAv.parseOrder;
import static Calculus.MathsContxtLAv.parseSimple;
import static Calculus.MathsContxtLAv.variables;
import static Calculus.RuleAnalytics.sectionRanges;
import static Calculus.RuleAnalytics.sortedTestCases;
import static Calculus.RuleAnalytics.testCaseStatus;
import static Calculus.SummariesPrint.SummariesPrintAns;
import static Calculus.SummariesPrint.SummariesPrintmain;
import static Calculus.TestHarnessClass.ConformalMapTestCaseDiff;
import static Calculus.TestHarnessClass.ConformalMapTestCaseIntegr;
import static Calculus.TestHarnessClass.FailTestCaseStringDiagnostic;
import Calculus.TestHarnessClass.FlipUtils;
import static Calculus.TestHarnessClass.PassFailIdempotentString;
import static Calculus.TestHarnessClass.PassFailInvertAnsString;
import static Calculus.TestHarnessClass.PassFailTestCaseString;
import static Calculus.TestHarnessClass.PassFailTestCaseStringPalinSame;
import static Calculus.TestHarnessClass.PassFailTestCaseValueEasy;
import static Calculus.TestHarnessClass.PassFailTestCaseValuePalinSame;
import static Calculus.TestHarnessClass.PassFailTestCaseValueStrict;
import static Calculus.TestHarnessClass.PassFailTestCaseValueStrict2;
import JavaCalculusTestHarness.CoPilotEqnBasic;
import JavaCalculusTestHarness.CoPilotEqnBothFiles;
import JavaCalculusTestHarness.CoPilotEqnDOE0;
import JavaCalculusTestHarness.CoPilotEqnDOE1;
import JavaCalculusTestHarness.CoPilotEqnDOE2;
import JavaCalculusTestHarness.CoPilotEqnDOE3;
import JavaCalculusTestHarness.CoPilotEqnDOE4;
import JavaCalculusTestHarness.CoPilotEqnDOE5;
import JavaCalculusTestHarness.CoPilotEqnDOE6;
import JavaCalculusTestHarness.CoPilotEqnDOE7;
import JavaCalculusTestHarness.CoPilotEqnDOE8;
import JavaCalculusTestHarness.CoPilotEqnDOE9;
import JavaCalculusTestHarness.CoPilotEqnFisher0;
import JavaCalculusTestHarness.CoPilotEqnFisher1;
import JavaCalculusTestHarness.CoPilotEqnFisher2;
import JavaCalculusTestHarness.CoPilotEqnFisher3;
import JavaCalculusTestHarness.CoPilotEqnHadammard0;
import JavaCalculusTestHarness.CoPilotEqnHadammard1;
import JavaCalculusTestHarness.CoPilotEqnHadammard2;
import JavaCalculusTestHarness.CoPilotEqnHadammard3;
import JavaCalculusTestHarness.CoPilotEqnHadammard4;
import JavaCalculusTestHarness.CoPilotEqnHadammard5;
import JavaCalculusTestHarness.CoPilotEqnHadammard6;
import JavaCalculusTestHarness.CoPilotEqnHadammard7;
import JavaCalculusTestHarness.CoPilotEqnHadammard8;
import JavaCalculusTestHarness.CoPilotEqnHadammard9;
import JavaCalculusTestHarness.CoPilotHadammard0;
import JavaCalculusTestHarness.CoPilotHadammard1;
import JavaCalculusTestHarness.CoPilotHadammard2;
import JavaCalculusTestHarness.CoPilotHadammard3;
import JavaCalculusTestHarness.HghLvlExprODE;
import JavaCalculusTestHarness.TestHarnessCoefficients;
import JavaCalculusTestHarness.TestHarnessIndConstant;
import JavaCalculusTestHarness.TestHarnessInfinityNaN;
import JavaCalculusTestHarness.TestHarnessNames;
import JavaCalculusTestHarness.TestHarnessSignedX;
import JavaCalculusTestHarness.TestHarnessUnitTest;
import JavaCalculusTestHarness.TestHarnessPredicate;
import JavaCalculusTestHarness.TestHarnessAlgebra;
import JavaCalculusTestHarness.TestHarnessFInverse;
import JavaCalculusTestHarness.TestHarnessExpression;
import JavaCalculusTestHarness.TestHarnessFunctions;
import JavaCalculusTestHarness.TestHarnessInfiniteLoops;
import JavaCalculusTestHarness.TestHarnessIsolation;
import JavaCalculusTestHarness.TestHarnessMixedIsolation;
import JavaCalculusTestHarness.TestHarnessParenthesisNew;
import JavaCalculusTestHarness.TestHarnessSanity;
import JavaCalculusTestHarness.TestHarnessSoftwareEngg;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import org.apache.log4j.Logger;

/**
 *
 * @author Administrator
 */
public class UsageCalculus {

    public static Logger log = Logger.getLogger(UsageCalculus.class.getName());

    public static RuleAnalytics ruleAnalytics = null;
    //public static RuleAnalytics ruleAnalytics = null;
    public static String DiffWithRespTo = "x";
    public static int MaxDiffOrder = 6;
    public static int MaxIntegreOrder = 6;
    public static String UserEquation = "";
    public static String UserTestPredicate = "";
    public static String UserTestAnswer = "";

    public static String EqnUnderTest;
    public static String FInverseEqn;
    public static String EqnUnderTest2;

    // Differentiation Mapping
    public static String[] EqnSolArrayMap1;
    public static String[] EqnSolArrayDiffAlone;
    public static String[] EqnSolArrayMap2;

    // Integration Mapping
    public static String[] EqnSolArrayMap3;
    public static String[] EqnSolArrayIntegrAlone;
    public static String[] EqnSolArrayMap4;

    public static int[] EqnSolOrder;
    public static String StageMapping = "";
    public static int Order = 1;
    public static long TestCase = 0;
    public static int TestCaseIndexFBT = 0;
    public static long StartTestCase = 0;
    public static long EndTestCase = 0;
    public static long LastTestCaseHarness = 131400;//110029;//121000;//131000;//131400
    public static String EqnRegressionDiffStatus = "All RED";
    public static String EqnRegressionIntegreStatus = "All RED";
    public static String TestCaseName = "Standard";
    public static String TestCaseMatrixID = "Standard";
    public static String EquationComment = "";

    public static String Pragma = "Easy";// Strict OR Easy
    public static boolean TestCasePassStrFlag = false;
    public static boolean TestCasePassValFlag = false;
    public static boolean TestCasePassConformalValFlag = false;
    public static boolean TestCasePassHighLevelFlag = false;
    public static int TestCasePassMap1StrCount = 0;
    public static int TestCaseFailMap1StrCount = 0;
    public static int TestCasePassCalcuStrCount = 0;
    public static int TestCaseFailCalcuStrCount = 0;
    public static int TestCasePassMap2StrCount = 0;
    public static int TestCaseFailMap2StrCount = 0;
    public static int InvertAnsFlippedCount = 0;
    public static int InvertAnsBothFlippedCount = 0;
    public static boolean InvertAnsFlag = false;
    public static boolean InvertAnsBothFlag = false;

    public static int InvertAnsFlippedMap1StrCount = 0;
    public static int InvertAnsFlippedCalcuStrCount = 0;
    public static int InvertAnsFlippedMap2StrCount = 0;

    public static int InvertAnsBothFlippedMap1StrCount = 0;
    public static int InvertAnsBothFlippedCalcuStrCount = 0;
    public static int InvertAnsBothFlippedMap2StrCount = 0;

    public static int StaleAnswerCount = 0;
    public static int FailAnswerCount = 0;
    public static int SectionStaleAnsCount = 0;
    public static int SectionFailAnsCount = 0;
    public static int LowLevelSectionStaleAnsCount = 0;
    public static int LowLevelSectionFailAnsCount = 0;
    public static int MaxStaleAns = 0;
    public static int MaxFailAns = 0;
    public static HashMap<Integer, String> StaleAnsTestCases = new HashMap<Integer, String>();
    public static HashMap<Integer, String> FailAnsTestCases = new HashMap<Integer, String>();

    public static HashMap<Integer, String> FailedTestCases = new HashMap<Integer, String>();
    public static HashMap<Integer, String> FlippedBothTestCases = new HashMap<Integer, String>();
    public static HashMap<Integer, String> FlippedInvTestCases = new HashMap<Integer, String>();

    public static HashMap<Integer, String> ExceptionTestCases = new HashMap<Integer, String>();
    public static HashMap<Integer, String> ExceptionStringDB = new HashMap<Integer, String>();

    public static HashMap<Integer, String> WrongAnsTestCasesMap1 = new HashMap<Integer, String>();
    public static HashMap<Integer, String> WrongAnsTestCasesMap2 = new HashMap<Integer, String>();
    public static HashMap<Integer, String> WrongAnsTestCasesCalculus1 = new HashMap<Integer, String>();
    public static HashMap<Integer, String> ByPassed = new HashMap<Integer, String>();
    public static HashMap<Integer, String> MissedNumber = new HashMap<Integer, String>();
    public static HashMap<Integer, String> NULLStrTestCases = new HashMap<Integer, String>();
    public static HashMap<Integer, String> KnownIssuesTestCases = new HashMap<Integer, String>();
    public static HashMap<Integer, String> FailedCurrRun = new HashMap<Integer, String>();

    public static Throwable cause = new Throwable();
    public static int MaxIndexExcept = 0;
    public static int MaxIndexWrongAnsMap1 = 0;
    public static int MaxIndexWrongAnsCalculus1 = 0;
    public static int MaxIndexWrongAnsMap2 = 0;
    public static int TotalTestCases = 0;
    public static int NullTestCases = 0;
    public static int KnownIssues = 0;
    public static int CoreKnownIssues = 0;
    public static boolean NullTestCasesFlag = false;
    public static boolean KnownIssueTestCasesFlag = false;
    public static boolean CoreKnownIssuesTestCasesFlag = false;
    public static int ByPassedTestCases = 0;
    public static int MaxIndexByPassedTest = 0;
    public static int MissedNumberTestCases = 0;
    public static int MaxIndexMissedNumberTest = 0;
    public static int MissedTestCasesInfinity = 0;
    public static int MissedTestCasesException = 0;

    public static int MaxIndexFail = 0;
    public static int SectionIndexFail = 1;
    public static String TestCaseFile = "";
    public static String Section = "";
    public static int FailedTestCount = 0;
    public static int PassedTestCount = 0;
    public static int TestNOTRUNCount = 0;
    public static long SectionStart = 0;
    public static long SectionTestCaseStart = 0;
    public static long SectionTestCaseEnd = 0;
    public static boolean DoNOTSkipSectionFlag = false;
    public static int MaxBothFlipIndexPass = 0;
    public static int MaxAnsFlipIndexPass = 0;
    public static int SectionAnsFlippedCount = 0;
    public static int SectionAnsBothFlippedCount = 0;
    public static int SectionTCFlippedCount = 0;
    public static int SectionTCBothFlippedCount = 0;

    public static boolean ReturnFlagMap1 = false;
    public static boolean ReturnFlagDiff = false;
    public static boolean ReturnFlagMap2 = false;
    public static String canA2Mult = "";
    public static String canA3Mult = "";
    public static String canA4Mult = "";
    public static String canA2Div = "";
    public static String canA3Div = "";
    public static String canA4Div = "";

    public static Map<Integer, String> EqnDB = new HashMap<>();
    public static Map<String, String> EqnUnderTestDB = new HashMap<>();
    public static Map<String, Integer> OrderTestDB = new HashMap<>();
    public static Map<String, String> DiffWithRespToDB = new HashMap<>();
    public static Map<String, String> EqnExprnDB = new HashMap<>();
    public static Map<String, String> EqnActualMap1DB = new HashMap<>();
    public static Map<String, String> EqnExpectedMap1DB = new HashMap<>();
    public static Map<String, String> EqnActualCalcuDB = new HashMap<>();
    public static Map<String, String> EqnExpectedCalcuDB = new HashMap<>();
    public static Map<String, String> EqnActualMap2DB = new HashMap<>();
    public static Map<String, String> EqnExpectedMap2DB = new HashMap<>();
    public static Map<String, Boolean> TestCasesHighLevelDB = new HashMap<>();
    public static Map<String, Boolean> TestCaseStrDB = new HashMap<>();
    public static Map<String, Boolean> TestCaseValDB = new HashMap<>();
    public static Map<String, Boolean> TestCaseConformalValDB = new HashMap<>();
    public static int EqnDBIndex = 0;
    public static int EqnDBDupCount = 0;

    public static int WrongAnswerCountMap1 = 0;
    public static int WrongAnswerCountMap2 = 0;
    public static int WrongAnswerCountCalculus1 = 0;
    public static boolean WrongAnswerFlagMap1 = false;
    public static boolean WrongAnswerFlagMap2 = false;
    public static boolean WrongAnswerFlagCalculus1 = false;
    public static String[] KnownIssuesCSV = null;

    public static String FailingLowLevelUnitTestCases() {
        //UnStructured Testing Test Cases
        //String Exprn="x^2 - x +2 + y^3 + y + 4";

        //HighLevel Unit Test for Whole Program 
        //14th Order Diff
        /* ************************************************************************ */
        //Failing Test Cases: Low Level Analysed/Debugged Failure
        //Simple Basic Equation
        //String Exprn = ;
        //Simple Basic Equation
        String Exprn = "x^8 + x^5 + x^4 - x - 25.0";
        //Palindromic String-Equation Test
        //String Exprn = " 25.0 + x - x^4 -x^5 -x^8 + x^8 + x^5 + x^4 - x - 25.0";
        //Palindromic String-Equation Test-Rearranged
        //String Exprn = " x^8 -x^8 + x^5 -x^5 + x^4 - x^4 + 25.0 + x - x - 25.0";
        //Test for LookAheadFuncMultDiv
        //Straight Numbers Leading + Trailing Co-eff :(LookAheadFuncMultDiv & ConstExprn)
        //(Polynomials)
        //String Exprn = "1/x^8 + 1/x^5 + 1/x^4 - 25.0";
        //Functions 
        //String Exprn = "(2*x+1)*x^9 + x^7 + x^5 + x^2 - sin(x^2)- sin(2*x+5) ";
        //String Exprn = "sin(2.0*7.0*x)+25.0";
        //Parenthesis
        //String Exprn = "(x^8+2*x+1) + x^7  - sin(x^4+ 2*x+ 5) ";
        //Parenthesis with Constants
        //String Exprn="(114.70000000000073*(x-11)+28843.09)*(x-1)*(x-2)*(x-3)*(x-4)*(x-5)*(x-6)*(x-7)*(x-8)*(x-9)*(x-10)*(1.0)*(x-12)*(x-13)*(x-14)*(x-15)*(x-16)*(x-17)*(x-18)*(x-19)*(x-20)*(x-21)";
        //Addition Subtraction
        //String Exprn = "(x^8+2*x+1) + x^7  - (x^4+ 2*x+ 5) ";
        //Multiplication Division
        //String Exprn = "(x^8+2*x+1) + x^7  - (x^4+ 2*x+ 5) ";
        //Parenthesis within Parenthesis
        //Add Operation
        //Subtraction
        //Divide Operation
        //Multiplication
        //Constants
        //String Exprn="11.0*12.0*x*13.0*14.0";
        return Exprn;
    }

    public static String TestHarnessDiff(String AlgoName, long j, String xExprnOptionSelected) {
//Equation Component Testing
//1)	Variables :L=3:Single Letter, Multi Letter, with Numerics
//2)	Coefficient:L=9:0.0,0,1.0,1,-1.0,-1,5,-5,-5.0
//3)	Exponent:L=6: +ve,-ve,0,1,Independent Constants, Long Form (x * x*x)
//4)	Operator:L=2: *,/
//5)	Constants:L=3: Start of Expr, Middle (2-5) Terms, End Term
//6)	Independent Constants:L=3:Single Letter, Multi Letter, with Numerics
//7)	Expression
//8)	Term:L=3: Start Term, Middle (2-5) Terms, End Term
//9)	Term Sign:L=3: +ve, -ve, No Sign
//10)	Exponent Sign:L=3: +ve, -ve, No Sign
//11)	Coefficient Sign:L=3: +ve, -ve, No Sign
//12)	Variable Sign:L=3: +ve, -ve, No Sign
//13)	Parentheses:L=3 : 1st Term, 2nd Term , 3-5 Terms
//14)	Functions:L5: Sin, Cos, Tan, Log, Ln
//15)	Argument of Functions:L=4: Expr Alone(3 types), Expr with Inner Function
        if ((j >= 1000) && (j <= 1015)) {
            Section = "IsolationTestCases";
            SectionTestCaseStart = 1000;
            SectionTestCaseEnd = 1015;
            TestCaseFile = "TestHarnessIsolation";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                TestHarnessIsolation.IsolationTestCases(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 2000) && (j <= 2082)) {
            Section = "MixedIsolationTestCases";
            SectionTestCaseStart = 2000;
            SectionTestCaseEnd = 2082;
            TestCaseFile = "TestHarnessMixedIsolation";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                TestHarnessMixedIsolation.MixedIsolationTestCases(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 3000) && (j <= 3498)) {
            Section = "CoPilotEqnBasic";
            SectionTestCaseStart = 3000;
            SectionTestCaseEnd = 3498;
            TestCaseFile = "CoPilotEqnBasic";
            DoNOTSkipSectionFlag = DoNoTRunAutoFlag;
            if (DoNOTSkipSectionFlag == true) {
                CoPilotEqnBasic.CoPilotEqnBasic(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            } 
        }else if ((j >= 3500) && (j <= 3748)) {
                Section = "CoPilotEqnBothFilesDOE";
            SectionTestCaseStart = 3500;
            SectionTestCaseEnd = 3748;
            TestCaseFile = "CoPilotEqnBothFilesDOE";
            DoNOTSkipSectionFlag = DoNoTRunAutoFlag;
            if (DoNOTSkipSectionFlag == true) {
                CoPilotEqnBothFiles.CoPilotEqnBothFiles(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        }else if ((j >= 3750) && (j <= 3998)) {
                Section = "CoPilotEqnBothFilesHadammard";
            SectionTestCaseStart = 3750;
            SectionTestCaseEnd = 3998;
            TestCaseFile = "CoPilotEqnBothFilesHadammard";
            DoNOTSkipSectionFlag = DoNoTRunAutoFlag;
            if (DoNOTSkipSectionFlag == true) {
                CoPilotEqnBothFiles.CoPilotEqnBothFiles(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 4000) && (j <= 4033)) {
            Section = "SanityTestCases";
            SectionTestCaseStart = 4000;
            SectionTestCaseEnd = 4033;
            TestCaseFile = "TestHarnessClass";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                TestHarnessSanity.SanityTestCases(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 5000) && (j <= 5033)) {
            Section = "UnitTestCases";
            SectionTestCaseStart = 5000;
            SectionTestCaseEnd = 5033;
            TestCaseFile = "TestHarnessUnitTest";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                TestHarnessUnitTest.UnitTestCases(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 6000) && (j <= 6019)) {
            Section = "InfinityNaNTestCases";
            SectionTestCaseStart = 6000;
            SectionTestCaseEnd = 6019;
            TestCaseFile = "TestHarnessInfinityNaN";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                TestHarnessInfinityNaN.InfinityNaNTestCases(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 7000) && (j <= 7005)) {
            Section = "InfiniteLoops";
            SectionTestCaseStart = 7000;
            SectionTestCaseEnd = 7005;
            TestCaseFile = "TestHarnessInfiniteLoops";
            if (xExprnOptionSelected.equalsIgnoreCase("Regression2")) {
                DoNOTSkipSectionFlag = false;
            } else if (xExprnOptionSelected.equalsIgnoreCase("Regression")) {
                DoNOTSkipSectionFlag = false;
            } else {
                DoNOTSkipSectionFlag = true;
            }
            if (DoNOTSkipSectionFlag == true) {
                TestHarnessInfiniteLoops.InfiniteLoops(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } //
        // Variants
        //
        else if ((j >= 10001) && (j <= 10010)) {
            Section = "Names";
            SectionTestCaseStart = 10001;
            SectionTestCaseEnd = 10010;
            TestCaseFile = "TestHarnessNames";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                TestHarnessNames.Names(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 20001) && (j <= 20069)) {
            Section = "Coefficients";
            SectionTestCaseStart = 20001;
            SectionTestCaseEnd = 20069;
            TestCaseFile = "TestHarnessCoefficients";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                TestHarnessCoefficients.Coefficients(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 30001) && (j <= 30011)) {
            Section = "Exponent";
            SectionTestCaseStart = 30001;
            SectionTestCaseEnd = 30011;
            TestCaseFile = "TestHarnessClass";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                TestHarnessClass.Exponent(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 40001) && (j <= 40037)) {
            Section = "SignedX";
            SectionTestCaseStart = 40001;
            SectionTestCaseEnd = 40037;
            TestCaseFile = "TestHarnessSignedX";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                TestHarnessSignedX.SignedX(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 50001) && (j <= 50093)) {
            Section = "IndConstant";
            SectionTestCaseStart = 50001;
            SectionTestCaseEnd = 50093;
            TestCaseFile = "TestHarnessIndConstant";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                TestHarnessIndConstant.IndConstant(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 80000) && (j <= 80132)) {
            Section = "Parentheses";
            SectionTestCaseStart = 80000;
            SectionTestCaseEnd = 80132;
            TestCaseFile = "TestHarnessParenthesis";
            if (xExprnOptionSelected.equalsIgnoreCase("Regression2")) {
                DoNOTSkipSectionFlag = false;
            } else {
                DoNOTSkipSectionFlag = true;
            }
            if (DoNOTSkipSectionFlag == true) {
                TestHarnessParenthesisNew.Parenthesis(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 90000) && (j <= 90022)) {
            //Function Test Cases
            Section = "Function Test Cases";
            SectionTestCaseStart = 90000;
            SectionTestCaseEnd = 90022;
            TestCaseFile = "TestHarnessFunctions";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                TestHarnessFunctions.Functions(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 100000) && (j <= 100009)) {
            //Function Argument Test Cases
            Section = "Function Argument Test Cases";
            SectionTestCaseStart = 100000;
            SectionTestCaseEnd = 100009;
            TestCaseFile = "TestHarnessFunctions";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                TestHarnessFunctions.FunctionsArgs(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 110001) && (j <= 110029)) {
            Section = "SoftwareEngg";
            SectionTestCaseStart = 110001;
            SectionTestCaseEnd = 110029;
            TestCaseFile = "TestHarnessSoftwareEngg";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                TestHarnessSoftwareEngg.SoftwareEngg(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 120001) && (j <= 121400)) {
            j = HadammardControl(AlgoName, j);
        } else if ((j >= 130001) && (j <= 131400)) {
            j = DOEControl(AlgoName, j);
        } else {
            SectionTestCaseStart = -1;
            SectionTestCaseEnd = -1;
            System.out.println(ConsoleColors.RED + "TestHarnessDiff:j= " + j + ": NOT Executed Loop" + ConsoleColors.RESET);
            ResetTestCase();
        }
        System.out.println("TestHarnessDiff:EqnUnderTest=" + EqnUnderTest);
        return EqnUnderTest;
    }

    public static long HadammardControl(String AlgoName, long j) {
        if ((j >= 120001) && (j <= 120100)) {
            Section = "CoPilotEqnHadammard0";
            SectionTestCaseStart = 120001;
            SectionTestCaseEnd = 120100;
            TestCaseFile = "CoPilotEqnHadammard0";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                CoPilotEqnHadammard0.CoPilotEqnHadammard(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 120101) && (j <= 120200)) {
            Section = "CoPilotEqnHadammard1";
            SectionTestCaseStart = 120101;
            SectionTestCaseEnd = 120200;
            TestCaseFile = "CoPilotEqnHadammard1";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                CoPilotEqnHadammard1.CoPilotEqnHadammard(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 120201) && (j <= 120300)) {
            Section = "CoPilotEqnHadammard2";
            SectionTestCaseStart = 120201;
            SectionTestCaseEnd = 120300;
            TestCaseFile = "CoPilotEqnHadammard2";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                CoPilotEqnHadammard2.CoPilotEqnHadammard(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 120301) && (j <= 120400)) {
            Section = "CoPilotEqnHadammard3";
            SectionTestCaseStart = 120301;
            SectionTestCaseEnd = 120400;
            TestCaseFile = "CoPilotEqnHadammard3";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                CoPilotEqnHadammard3.CoPilotEqnHadammard(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 120401) && (j <= 120500)) {
            Section = "CoPilotEqnHadammard4";
            SectionTestCaseStart = 120401;
            SectionTestCaseEnd = 120500;
            TestCaseFile = "CoPilotEqnHadammard4";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                CoPilotEqnHadammard4.CoPilotEqnHadammard(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 120501) && (j <= 120600)) {
            Section = "CoPilotEqnHadammard5";
            SectionTestCaseStart = 120501;
            SectionTestCaseEnd = 120600;
            TestCaseFile = "CoPilotEqnHadammard5";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                CoPilotEqnHadammard5.CoPilotEqnHadammard(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 120601) && (j <= 120700)) {
            Section = "CoPilotEqnHadammard6";
            SectionTestCaseStart = 120601;
            SectionTestCaseEnd = 120700;
            TestCaseFile = "CoPilotEqnHadammard6";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                CoPilotEqnHadammard6.CoPilotEqnHadammard(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 120701) && (j <= 120800)) {
            Section = "CoPilotEqnHadammard7";
            SectionTestCaseStart = 120701;
            SectionTestCaseEnd = 120800;
            TestCaseFile = "CoPilotEqnHadammard7";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                CoPilotEqnHadammard7.CoPilotEqnHadammard(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 120801) && (j <= 120900)) {
            Section = "CoPilotEqnHadammard8";
            SectionTestCaseStart = 120801;
            SectionTestCaseEnd = 120900;
            TestCaseFile = "CoPilotEqnHadammard8";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                CoPilotEqnHadammard8.CoPilotEqnHadammard(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 120901) && (j <= 121000)) {
            Section = "CoPilotEqnHadammard9";
            SectionTestCaseStart = 120901;
            SectionTestCaseEnd = 121000;
            TestCaseFile = "CoPilotEqnHadammard9";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                CoPilotEqnHadammard9.CoPilotEqnHadammard(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 121001) && (j <= 121100)) {
            Section = "CoPilotHadammard0";
            SectionTestCaseStart = 121001;
            SectionTestCaseEnd = 121100;
            TestCaseFile = "CoPilotHadammard0";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                CoPilotHadammard0.CoPilotEqnHadammard(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 121101) && (j <= 121200)) {
            Section = "CoPilotHadammard1";
            SectionTestCaseStart = 121101;
            SectionTestCaseEnd = 121200;
            TestCaseFile = "CoPilotHadammard1";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                CoPilotHadammard1.CoPilotEqnHadammard(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 121201) && (j <= 121300)) {
            Section = "CoPilotHadammard2";
            SectionTestCaseStart = 121201;
            SectionTestCaseEnd = 121300;
            TestCaseFile = "CoPilotHadammard2";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                CoPilotHadammard2.CoPilotEqnHadammard(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 121301) && (j <= 121400)) {
            Section = "CoPilotHadammard3";
            SectionTestCaseStart = 121301;
            SectionTestCaseEnd = 121400;
            TestCaseFile = "CoPilotHadammard3";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                CoPilotHadammard3.CoPilotEqnHadammard(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        }
        return j;
    }

    public static long DOEControl(String AlgoName, long j) {
        if ((j >= 130001) && (j <= 130100)) {
            Section = "CoPilotEqnDOE0";
            SectionTestCaseStart = 130001;
            SectionTestCaseEnd = 130100;
            TestCaseFile = "CoPilotEqnDOE0";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                CoPilotEqnDOE0.CoPilotEqnDOE(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 130101) && (j <= 130200)) {
            Section = "CoPilotEqnDOE1";
            SectionTestCaseStart = 130101;
            SectionTestCaseEnd = 130200;
            TestCaseFile = "CoPilotEqnDOE1";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                CoPilotEqnDOE1.CoPilotEqnDOE(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 130201) && (j <= 130300)) {
            Section = "CoPilotEqnDOE2";
            SectionTestCaseStart = 130201;
            SectionTestCaseEnd = 130300;
            TestCaseFile = "CoPilotEqnDOE2";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                CoPilotEqnDOE2.CoPilotEqnDOE(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 130301) && (j <= 130400)) {
            Section = "CoPilotEqnDOE3";
            SectionTestCaseStart = 130301;
            SectionTestCaseEnd = 130400;
            TestCaseFile = "CoPilotEqnDOE3";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                CoPilotEqnDOE3.CoPilotEqnDOE(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 130401) && (j <= 130500)) {
            Section = "CoPilotEqnDOE4";
            SectionTestCaseStart = 130401;
            SectionTestCaseEnd = 130500;
            TestCaseFile = "CoPilotEqnDOE4";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                CoPilotEqnDOE4.CoPilotEqnDOE(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 130501) && (j <= 130600)) {
            Section = "CoPilotEqnDOE5";
            SectionTestCaseStart = 130501;
            SectionTestCaseEnd = 130600;
            TestCaseFile = "CoPilotEqnDOE5";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                CoPilotEqnDOE5.CoPilotEqnDOE(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 130601) && (j <= 130700)) {
            Section = "CoPilotEqnDOE6";
            SectionTestCaseStart = 130601;
            SectionTestCaseEnd = 130700;
            TestCaseFile = "CoPilotEqnDOE6";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                CoPilotEqnDOE6.CoPilotEqnDOE(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 130701) && (j <= 130800)) {
            Section = "CoPilotEqnDOE7";
            SectionTestCaseStart = 130701;
            SectionTestCaseEnd = 130800;
            TestCaseFile = "CoPilotEqnDOE7";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                CoPilotEqnDOE7.CoPilotEqnDOE(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 130801) && (j <= 130900)) {
            Section = "CoPilotEqnDOE8";
            SectionTestCaseStart = 130801;
            SectionTestCaseEnd = 130900;
            TestCaseFile = "CoPilotEqnDOE8";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                CoPilotEqnDOE8.CoPilotEqnDOE(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 130901) && (j <= 131000)) {
            Section = "CoPilotEqnDOE9";
            SectionTestCaseStart = 130901;
            SectionTestCaseEnd = 131000;
            TestCaseFile = "CoPilotEqnDOE9";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                CoPilotEqnDOE9.CoPilotEqnDOE(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 131001) && (j <= 131100)) {
            Section = "CoPilotEqnFisher0";
            SectionTestCaseStart = 131001;
            SectionTestCaseEnd = 131100;
            TestCaseFile = "CoPilotEqnFisher0";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                CoPilotEqnFisher0.CoPilotEqnDOE(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 131101) && (j <= 131200)) {
            Section = "CoPilotEqnFisher1";
            SectionTestCaseStart = 131101;
            SectionTestCaseEnd = 131200;
            TestCaseFile = "CoPilotEqnFisher1";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                CoPilotEqnFisher1.CoPilotEqnDOE(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 131201) && (j <= 131300)) {
            Section = "CoPilotEqnFisher2";
            SectionTestCaseStart = 131201;
            SectionTestCaseEnd = 131300;
            TestCaseFile = "CoPilotEqnFisher2";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                CoPilotEqnFisher2.CoPilotEqnDOE(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        } else if ((j >= 131301) && (j <= 131400)) {
            Section = "CoPilotEqnFisher3";
            SectionTestCaseStart = 131301;
            SectionTestCaseEnd = 131400;
            TestCaseFile = "CoPilotEqnFisher3";
            DoNOTSkipSectionFlag = true;
            if (DoNOTSkipSectionFlag == true) {
                CoPilotEqnFisher3.CoPilotEqnDOE(AlgoName, j);
            } else {
                j = SectionTestCaseEnd;
                TestNOTRUNCount++;
            }
        }
        return j;
    }

    public static void mainPredicate(String... args) {
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
            System.out.println("main: x=" + x + " Exprn=" + Exprn);
            expValue = PredicateSep.parsePredicate(Exprn, variables, "Silent", MathsContxtLAv.LogLevel.Off);
            System.out.println(" main:Result(Logical Value)=" + expValue.eval());
            System.out.print(System.lineSeparator());
        }
    }

    public static void mainDiff(String... args) {
        Map<String, Double> variables = new HashMap<>();
        Map<String, String> variablesDiff = new HashMap<>();
        String Exprn = UsageCalculus.UserEquation;
        Exprn = eatAll(Exprn, ' ');
        SimpleExpression expSimple;
        Expression expValue;
        DiffrIntegrSep.DiffExpr exp;

        MyFuncExpress();
        MyFuncDiff();
        MyFuncSimple();

        String DiffWithRespTo = UsageCalculus.DiffWithRespTo;
        String Constant = "C";
        //String DiffWithRespTo = "Xn";
        variablesDiff.put(DiffWithRespTo, DiffWithRespTo);

        String StrexpSimpleExpress = "";
        String MapType = "Map1";
        String IntegrORDiffr = "Diffr";
        int i = 1;
        for (double x = 1, y = 7; i < UsageCalculus.MaxDiffOrder; y++, x++, i++) {
            variables.put(DiffWithRespTo, x);
            variables.put("y", y);
            variables.put("a", 1.0);
            variables.put("b", 2.0);//variables.put("b", 0.0);
            variables.put("c", -1.0);
            variables.put("d", 2.0);
            variables.put("p", 3.0);
            variables.put("q", 0.0);
            variables.put("r", -1.0);
            variables.put("s", 2.0);
            variables.put(Constant, 5.0);
            ChaosPrevention();
            System.out.println("main: x=" + x + " Exprn=" + Exprn);
            expSimple = parseSimple(Exprn, variables, DiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
            expValue = parse(Exprn, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
            System.out.println(" main:Result(Expn Value)=" + expValue.eval() + " DiffWithRespTo=" + DiffWithRespTo + " Exprn=" + Exprn);

            StrexpSimpleExpress = expSimple.SimpleExpr();

            System.out.println("main: x=" + x + " Basic Simple Exprn=" + StrexpSimpleExpress + " StrexpSimpleExpress=" + StrexpSimpleExpress);
            expValue = parse(StrexpSimpleExpress, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
            System.out.println("main: x=" + x + " Basic Simple (Exprn Value)=" + expValue.eval());

            exp = DiffrIntegrSep.parseDiff(StrexpSimpleExpress, variables, DiffWithRespTo, MapType, IntegrORDiffr);
            StrexpSimpleExpress = exp.DiffExpr();
            System.out.println(" main:Result(Diff Equation)(" + i + " th order)=> " + StrexpSimpleExpress);
            expValue = parse(StrexpSimpleExpress, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
            System.out.println(" main:Result(Diff Value)=" + expValue.eval());

            ChaosPrevention();
            expSimple = parseSimple(StrexpSimpleExpress, variables, DiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
            StrexpSimpleExpress = expSimple.SimpleExpr();
            System.out.println(" main:Result(Simplified Diff Equation)(" + i + " th order)=> " + StrexpSimpleExpress);
            expValue = parse(StrexpSimpleExpress, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
            System.out.println(" main:Result(Simplified Diff Value)=" + expValue.eval());
            System.out.print(System.lineSeparator());
            expValue = parse(Exprn, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
            System.out.println(" main:Result(Expn Value)=" + expValue.eval());
            Exprn = StrexpSimpleExpress;
        }
    }

    public static void mainIntegral(String... args) {
        Map<String, Double> variables = new HashMap<>();
        String Exprn = UsageCalculus.UserEquation;
        Exprn = eatAll(Exprn, ' ');
        SimpleExpression expSimple;
        Expression expValue;
        DiffrIntegrSep.IntegrExpr expIntgr;
        String MapType = "Map1";
        String IntegrORDiffr = "Integre";
        MyFuncExpress();
        MyFuncSimple();
        MyFuncIntegr();

        String DiffWithRespTo = UsageCalculus.DiffWithRespTo;
        String Constant = "C";
        //String DiffWithRespTo = "Xn";
        String StrexpIntegrExpress = "";
        String StrexpSimpleExpress = "";
        int i = 1;
        for (double x = -20, y = 7; i < UsageCalculus.MaxIntegreOrder; y++, x++, i++) {
            variables.put(DiffWithRespTo, x);
            variables.put("y", y);
            variables.put("a", 1.0);
            variables.put("b", 2.0);//variables.put("b", 0.0);
            variables.put("c", -1.0);
            variables.put("d", 2.0);
            variables.put("p", 3.0);
            variables.put("q", 0.0);
            variables.put("r", -1.0);
            variables.put("s", 2.0);
            variables.put(Constant, 5.0);
            System.out.println("main: x=" + x + " Exprn=" + Exprn);
            ChaosPrevention();
            expSimple = parseSimple(Exprn, variables, DiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
            expValue = parse(Exprn, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
            System.out.println(" main:Result(Expn Value)=" + expValue.eval() + " DiffWithRespTo=" + DiffWithRespTo);

            StrexpSimpleExpress = expSimple.SimpleExpr();

            expIntgr = DiffrIntegrSep.parseIntegr(StrexpSimpleExpress, variables, DiffWithRespTo, MapType, IntegrORDiffr);
            StrexpIntegrExpress = expIntgr.IntegrExpr();
            System.out.println(" main:Result(Integral Equation)(" + i + " th order)=> " + StrexpIntegrExpress);
            expValue = parse(StrexpIntegrExpress, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
            System.out.println(" main:Result(Integral Value)=" + expValue.eval());

            ChaosPrevention();
            expSimple = parseSimple(StrexpIntegrExpress, variables, DiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
            StrexpSimpleExpress = expSimple.SimpleExpr();
            System.out.println(" main:Result(Simplified Diff Equation)(" + i + " th order)=> " + StrexpSimpleExpress);
            expValue = parse(StrexpSimpleExpress, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
            System.out.println(" main:Result(Simplified Diff Value)=" + expValue.eval());
            System.out.print(System.lineSeparator());
            expValue = parse(StrexpSimpleExpress, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
            System.out.println(" main:Result(Expn Value)=" + expValue.eval());
            Exprn = StrexpSimpleExpress;
        }
    }

    public static String RandomEquation(String a, String c, String RandVar) {
        String Exprn = a + " * " + RandVar + "^7" + " + " + RandVar + "^5" + " + " + RandVar + "^2" + " - " + RandVar + " + " + c;
        Exprn = eatAll(Exprn, ' ');
        return Exprn;
    }

    public static String FormEquation(long Xn, long MgtACoeff, long Mgtc, long MgtbCoeff, String TechDiffWithRespTo, int MgtMaxExponent) {
        //if(Xn==0) MaxExponent=5;
        //else MaxExponent=(int)Xn;
        long bCoeffStore = MgtbCoeff;
        //log.fatal("FormEquation: MgtbCoeff=" + MgtbCoeff );
        String Exprn = MgtACoeff + " * " + TechDiffWithRespTo + "^" + (MgtMaxExponent);
        for (int i = MgtMaxExponent - 1; i > 1; i--) {
            if (MgtbCoeff > 2) {
                Exprn = Exprn + " + " + MgtbCoeff + "*" + TechDiffWithRespTo + "^" + i;
            } else {
                Exprn = Exprn + " + " + MgtbCoeff + "*" + TechDiffWithRespTo + "^" + i;
                MgtbCoeff = bCoeffStore;
            }
            //MgtbCoeff=GetPrimeNumber(MgtbCoeff,i);
            MgtbCoeff++;
            //log.fatal("FormEquation: MgtbCoeff=" + MgtbCoeff + " i=" + i);
        }
        if (MgtbCoeff > 2) {
            Exprn = Exprn + " + " + MgtbCoeff + "*" + TechDiffWithRespTo;
        } else {
            Exprn = Exprn + " + " + TechDiffWithRespTo;
        }
        Exprn = Exprn + " + " + Mgtc;
        Exprn = eatAll(Exprn, ' ');
        log.warn("FormEquation:Exprn=" + Exprn);
        return Exprn;
    }

    public static void mainRegresssionTest(int MaxOrder, TestHarnessClass TestData, String IntegrORDiffr, String xExprnOptionSelected) {
        String AlgoDispStr = "";
        String AlgoDispIntegrORDiffr = "";
        ruleAnalytics = new RuleAnalytics();
        ruleAnalytics.Init();
        //ruleAnalyticsPassed = new RuleAnalytics();
        //testResultsPassed = new HashMap<>();
        //testResultsFailed = new HashMap<>();
        if (IntegrORDiffr.equalsIgnoreCase("Integr")) {
            AlgoDispStr = "mainIntegrTest";
        } else if (IntegrORDiffr.equalsIgnoreCase("Diffr")) {
            AlgoDispStr = "mainDiffTest";
        }
        if (IntegrORDiffr.equalsIgnoreCase("Integr")) {
            AlgoDispIntegrORDiffr = "Integral";
        } else if (IntegrORDiffr.equalsIgnoreCase("Diffr")) {
            AlgoDispIntegrORDiffr = "Diffrentiation";
        }
        String MapType = "Map1";
        int AllTestCaseOrderPassed = 0;

        WrongAnswerFlagMap1 = false;
        WrongAnswerCountMap1 = 0;
        WrongAnswerFlagMap2 = false;
        WrongAnswerCountMap2 = 0;
        WrongAnswerFlagCalculus1 = false;
        WrongAnswerCountCalculus1 = 0;
        TestCasePassMap1StrCount = 0;
        TestCaseFailMap1StrCount = 0;
        TestCasePassCalcuStrCount = 0;
        TestCaseFailCalcuStrCount = 0;
        TestCasePassMap2StrCount = 0;
        TestCaseFailMap2StrCount = 0;

        InvertAnsFlippedCount = 0;
        InvertAnsBothFlippedCount = 0;

        InvertAnsFlippedMap1StrCount = 0;
        InvertAnsFlippedCalcuStrCount = 0;
        InvertAnsFlippedMap2StrCount = 0;

        InvertAnsBothFlippedMap1StrCount = 0;
        InvertAnsBothFlippedCalcuStrCount = 0;
        InvertAnsBothFlippedMap2StrCount = 0;

        int MaxOrder1 = MaxOrder;
        int OldKnwnI = 0;
        int OldKnwnIStartSection = 0;
        String Exprn = "";
        String OverallRegressionStatus = AlgoDispIntegrORDiffr + " : Pass All (4000 to 110023) Except Test Cases: "
                + "\n" + "TestCases:Unit Test Cases" + " All Passing"
                + "\n" + "TestCases:Names " + " All Passing"
                + "\n" + "TestCases:Coefficients " + " 20016 , 20017"
                + "\n" + "TestCases:Exponent " + " 30006 to 30008"
                + "\n" + "TestCases:Parentheses " + " 80001 to 80024";
        System.out.print(ConsoleColors.BLUE + AlgoDispIntegrORDiffr + " : Overall Regression Status" + OverallRegressionStatus + ConsoleColors.RESET);
        System.out.print(System.lineSeparator());
        if (EndTestCase > LastTestCaseHarness) {
            EndTestCase = LastTestCaseHarness;
        }
        System.out.print(ConsoleColors.BLUE + AlgoDispIntegrORDiffr + " EndTestCase=" + EndTestCase + " LastTestCaseHarness=" + LastTestCaseHarness + ConsoleColors.RESET);
        System.out.print(System.lineSeparator());
        if (EndTestCase < TestCase) {
            EndTestCase = TestCase;
        }
        long j = TestCase;
        EqnDB = new HashMap<>();
        EqnUnderTestDB = new HashMap<>();
        OrderTestDB = new HashMap<>();
        DiffWithRespToDB = new HashMap<>();
        EqnExprnDB = new HashMap<>();
        EqnActualMap1DB = new HashMap<>();
        EqnExpectedMap1DB = new HashMap<>();
        EqnActualCalcuDB = new HashMap<>();
        EqnExpectedCalcuDB = new HashMap<>();
        EqnActualMap2DB = new HashMap<>();
        EqnExpectedMap2DB = new HashMap<>();
        FailedTestCases = new HashMap<Integer, String>();
        ExceptionTestCases = new HashMap<Integer, String>();
        ExceptionStringDB = new HashMap<Integer, String>();

        FlippedBothTestCases = new HashMap<Integer, String>();
        StaleAnsTestCases = new HashMap<Integer, String>();
        FailAnsTestCases = new HashMap<Integer, String>();

        cause = new Throwable();
        TotalTestCases = 0;
        NullTestCases = 0;
        KnownIssues = 0;
        CoreKnownIssues = 0;

        EqnDB.clear();
        EqnUnderTestDB.clear();
        OrderTestDB.clear();
        DiffWithRespToDB.clear();
        EqnExprnDB.clear();
        EqnActualMap1DB.clear();
        EqnExpectedMap1DB.clear();
        EqnActualCalcuDB.clear();
        EqnExpectedCalcuDB.clear();
        EqnActualMap2DB.clear();
        EqnExpectedMap2DB.clear();

        TestCasesHighLevelDB.clear();
        TestCaseStrDB.clear();
        TestCaseValDB.clear();
        TestCaseConformalValDB.clear();

        FailedTestCases.clear();
        ExceptionTestCases.clear();
        WrongAnsTestCasesMap1.clear();
        WrongAnsTestCasesMap2.clear();
        WrongAnsTestCasesCalculus1.clear();
        ByPassed.clear();
        MissedNumber.clear();
        NULLStrTestCases.clear();
        KnownIssuesTestCases.clear();
        FailedCurrRun.clear();
        FlippedBothTestCases.clear();
        FlippedInvTestCases.clear();
        StaleAnsTestCases.clear();
        FailAnsTestCases.clear();

        ByPassedTestCases = 0;
        MissedNumberTestCases = 0;
        MaxIndexByPassedTest = 0;
        MaxIndexMissedNumberTest = 0;

        MissedTestCasesInfinity = 0;
        MissedTestCasesException = 0;

        MaxIndexExcept = 0;
        MaxIndexWrongAnsMap1 = 0;
        MaxIndexWrongAnsCalculus1 = 0;
        MaxIndexWrongAnsMap2 = 0;

        MaxIndexFail = 0;
        SectionIndexFail = 1;
        FailedTestCount = 0;
        PassedTestCount = 0;
        TestNOTRUNCount = 0;
        int OldFailedTestCount = FailedTestCount;
        SectionStart = TestCase;
        SectionAnsFlippedCount = 0;
        SectionAnsBothFlippedCount = 0;
        SectionTCFlippedCount = 0;
        SectionTCBothFlippedCount = 0;

        StaleAnswerCount = 0;
        FailAnswerCount = 0;

        EqnDBIndex = 0;
        EqnDBDupCount = 0;
        int OldDups = EqnDBDupCount;
        long OldTestCase = j;
        int OldMaxIndexFail = 0;
        int OldTotalTestCases = 0;
        int OldInvertAnsBothFlippedCount = 0;
        int OldInvertAnsFlippedCount = 0;

        boolean DupFlag = false;
        while (j <= EndTestCase) {
            EqnUnderTest = "";
            KnownIssueTestCasesFlag = false;
            CoreKnownIssuesTestCasesFlag = false;
            InvertAnsFlag = false;
            InvertAnsBothFlag = false;
            DupFlag = false;
            String TempExprn = "";
            TempExprn = TestHarnessDiff(AlgoDispStr, j, xExprnOptionSelected);
            if ((j == SectionTestCaseStart)) {
                OldKnwnIStartSection = KnownIssues;
                if (KnownIssueTestCasesFlag == true) {
                    OldKnwnIStartSection--;
                }
                //System.out.println("UsageCalculus:mainRegresssionTest:Start:" + AlgoDispStr + ":OldKnwnI=" + OldKnwnI + " KnownIssues=" + KnownIssues + " OldKnwnIStartSection=" + OldKnwnIStartSection);
            }
            Exprn = eatAll(TempExprn, ' ');
            DupFlag = DupChecknInsert(j);
            TestCasePassHighLevelFlag = false;
            if (IntegrORDiffr.equalsIgnoreCase("Diffr")) {
                if (MaxOrder == -1) {
                    MaxOrder1 = MaxDiffOrder; //From Test Case
                } else if (MaxOrder >= MaxDiffOrder) {
                    MaxOrder1 = MaxDiffOrder;
                } else {
                    MaxOrder1 = MaxOrder;
                }
            } else if (IntegrORDiffr.equalsIgnoreCase("Integr")) {
                if (MaxOrder == -1) {
                    MaxOrder1 = MaxIntegreOrder; //From Test Case
                } else if (MaxOrder >= MaxIntegreOrder) {
                    MaxOrder1 = MaxIntegreOrder;
                } else {
                    MaxOrder1 = MaxOrder;
                }
            }
            Order = 1;
            OldMaxIndexFail = MaxIndexFail;
            if (/*(!Exprn.equalsIgnoreCase("")) && */((DupFlag == false))) {
                if ((xExprnOptionSelected.equalsIgnoreCase("Regression")) && (IntegrORDiffr.equalsIgnoreCase("Diffr"))) {
                    if (!Exprn.equalsIgnoreCase("")) {
                        ChaosPrevention();
                        if (AITestResultsGenFlag) {
                            AIDiffSingleHighTestCase(MaxOrder1, Exprn, MapType, IntegrORDiffr, xExprnOptionSelected);
                        } else {
                            DiffSingleHighTestCase(MaxOrder1, Exprn, MapType, IntegrORDiffr, xExprnOptionSelected);
                            if (InvertAnsFlag == true) {
                                SectionTCFlippedCount++;
                            }
                            if (InvertAnsBothFlag == true) {
                                SectionTCBothFlippedCount++;
                            }
                            InvertAnsFlag = false;
                            InvertAnsBothFlag = false;
                        }
                        System.out.println(ConsoleColors.RED + AlgoDispStr + ": j=" + j + " TestCase=" + TestCase + " Order=" + Order + " TestCasePassHighLevelFlag=" + TestCasePassHighLevelFlag);
                    } else {
                        ;
                    }
                    if (TestCasePassHighLevelFlag) {
                        TotalTestCases++;
                        PassedTestCount++;
                        ruleAnalytics.setTestCaseStatus("" + TestCase, true);
                    } else if ((DoNOTSkipSectionFlag) && (TestCasePassHighLevelFlag == false) && (KnownIssueTestCasesFlag == false) && (CoreKnownIssuesTestCasesFlag == false)
                            &&(EqnUnderTest != null)&&(!EqnUnderTest.equalsIgnoreCase(""))
                            ) {
                        FailedTestCases.put(MaxIndexFail, "" + TestCase + " Order=" + Order + ",");
                        FailedCurrRun.put(FailedTestCount, "" + TestCase);
                        MaxIndexFail++;
                        FailedTestCount++;
                        ruleAnalytics.setTestCaseStatus("" + TestCase, false);
                        TotalTestCases++;
                    } else {
                        TotalTestCases++;
                    }
                    if ( /*&&(!Exprn.equalsIgnoreCase(""))*/(!EqnSolArrayMap2[Order - 1].equalsIgnoreCase("")) && (!EqnSolArrayMap1[Order - 1].equalsIgnoreCase(""))) {

                    } else if ((DoNOTSkipSectionFlag) && (TestCasePassHighLevelFlag == false) && (Order == MaxOrder1)
                            && (EqnSolArrayMap4[Order - 1].equalsIgnoreCase("")) && (EqnSolArrayMap3[Order - 1].equalsIgnoreCase(""))
                            && (KnownIssueTestCasesFlag == false) && (CoreKnownIssuesTestCasesFlag == false)) {
                        NullTestCasesFlag = true;
                        if (!NullTestCasesFlag) {
                            FailedTestCount++;
                        }
                        TestCasePassHighLevelFlag = false;
                        NullTestCases++;
                        NULLStrTestCases.put(NullTestCases, "" + TestCase);
                        NullTestCasesFlag = false;
                    }
                } else if ((xExprnOptionSelected.equalsIgnoreCase("Regression")) && (IntegrORDiffr.equalsIgnoreCase("Integr"))) {
                    if (!Exprn.equalsIgnoreCase("")) {
                        ChaosPrevention();
                        if (AITestResultsGenFlag) {
                            AIIntegralHighSingleTest(MaxOrder1, Exprn, MapType, IntegrORDiffr, xExprnOptionSelected);
                        } else {
                            IntegralHighSingleTest(MaxOrder1, Exprn, MapType, IntegrORDiffr, xExprnOptionSelected);
                            if (InvertAnsFlag == true) {
                                SectionTCFlippedCount++;
                            }
                            if (InvertAnsBothFlag == true) {
                                SectionTCBothFlippedCount++;
                            }
                        }
                        System.out.println(ConsoleColors.RED + AlgoDispStr + ": j=" + j + " TestCase=" + TestCase + " Order=" + Order + " TestCasePassHighLevelFlag=" + TestCasePassHighLevelFlag);
                    } else {
                        ;
                    }
                    if (TestCasePassHighLevelFlag) {
                        TotalTestCases++;
                        PassedTestCount++;
                        ruleAnalytics.setTestCaseStatus("" + TestCase, TestCasePassHighLevelFlag);

                    } else if ((DoNOTSkipSectionFlag) && (TestCasePassHighLevelFlag == false) && (KnownIssueTestCasesFlag == false) && (CoreKnownIssuesTestCasesFlag == false)
                            &&(EqnUnderTest != null)&&(!EqnUnderTest.equalsIgnoreCase(""))
                            ) {
                        FailedTestCases.put(MaxIndexFail, "" + TestCase + " Order=" + Order + ",");
                        FailedCurrRun.put(FailedTestCount, "" + TestCase);
                        MaxIndexFail++;
                        FailedTestCount++;
                        ruleAnalytics.setTestCaseStatus("" + TestCase, TestCasePassHighLevelFlag);
                        TotalTestCases++;
                    } else {
                        TotalTestCases++;
                    }
                    if (/*(!Exprn.equalsIgnoreCase(""))*/(!EqnSolArrayMap4[Order - 1].equalsIgnoreCase("")) && (!EqnSolArrayMap3[Order - 1].equalsIgnoreCase(""))) {

                    } else if ((DoNOTSkipSectionFlag) && (TestCasePassHighLevelFlag == false) && (Order == MaxOrder1)
                            && (EqnSolArrayMap4[Order - 1].equalsIgnoreCase("")) && (EqnSolArrayMap3[Order - 1].equalsIgnoreCase(""))
                            && (KnownIssueTestCasesFlag == false) && (CoreKnownIssuesTestCasesFlag == false)) {
                        NullTestCasesFlag = true;
                        if (!NullTestCasesFlag) {
                            FailedTestCount++;
                        }
                        TestCasePassHighLevelFlag = false;
                        NullTestCases++;
                        NULLStrTestCases.put(NullTestCases, "" + TestCase);
                        NullTestCasesFlag = false;
                    }
                } else if ((xExprnOptionSelected.equalsIgnoreCase("Regression2")) && (IntegrORDiffr.equalsIgnoreCase("Diffr"))) {
                    if (!Exprn.equalsIgnoreCase("")) {
                        ChaosPrevention();
                        if (AITestResultsGenFlag) {
                            AIDiffSingleHighTestCase2(MaxOrder1, Exprn, MapType, IntegrORDiffr, xExprnOptionSelected);
                        } else {
                            DiffSingleHighTestCase2(MaxOrder1, Exprn, MapType, IntegrORDiffr, xExprnOptionSelected);
                            if (InvertAnsFlag == true) {
                                SectionTCFlippedCount++;
                            }
                            if (InvertAnsBothFlag == true) {
                                SectionTCBothFlippedCount++;
                            }
                            InvertAnsFlag = false;
                            InvertAnsBothFlag = false;
                        }
                        System.out.println(ConsoleColors.RED + AlgoDispStr + ": j=" + j + " TestCase=" + TestCase + " Order=" + Order + " TestCasePassHighLevelFlag=" + TestCasePassHighLevelFlag);
                    } else {
                        ;
                    }
                    if (TestCasePassHighLevelFlag) {
                        TotalTestCases++;
                        PassedTestCount++;
                        ruleAnalytics.setTestCaseStatus("" + TestCase, true);
                    } else if ((DoNOTSkipSectionFlag) && (TestCasePassHighLevelFlag == false) && (KnownIssueTestCasesFlag == false) && (CoreKnownIssuesTestCasesFlag == false)
                            &&(EqnUnderTest != null)&&(!EqnUnderTest.equalsIgnoreCase(""))
                            ) {
                        FailedTestCases.put(MaxIndexFail, "" + TestCase + " Order=" + Order + ",");
                        FailedCurrRun.put(FailedTestCount, "" + TestCase);
                        MaxIndexFail++;
                        FailedTestCount++;
                        ruleAnalytics.setTestCaseStatus("" + TestCase, false);
                        TotalTestCases++;
                    } else {
                        TotalTestCases++;
                    }
                    if ( /*&&(!Exprn.equalsIgnoreCase(""))*/(!EqnSolArrayMap2[Order - 1].equalsIgnoreCase("")) && (!EqnSolArrayMap1[Order - 1].equalsIgnoreCase(""))) {

                    } else if ((DoNOTSkipSectionFlag) && (TestCasePassHighLevelFlag == false) && (Order == MaxOrder1)
                            && (EqnSolArrayMap4[Order - 1].equalsIgnoreCase("")) && (EqnSolArrayMap3[Order - 1].equalsIgnoreCase(""))
                            && (KnownIssueTestCasesFlag == false) && (CoreKnownIssuesTestCasesFlag == false)) {
                        NullTestCasesFlag = true;
                        if (!NullTestCasesFlag) {
                            FailedTestCount++;
                        }
                        TestCasePassHighLevelFlag = false;
                        NullTestCases++;
                        NULLStrTestCases.put(NullTestCases, "" + TestCase);
                        NullTestCasesFlag = false;
                    }
                } else if ((xExprnOptionSelected.equalsIgnoreCase("Regression2")) && (IntegrORDiffr.equalsIgnoreCase("Integr"))) {
                    if (!Exprn.equalsIgnoreCase("")) {
                        ChaosPrevention();
                        if (AITestResultsGenFlag) {
                            AIIntegralHighSingleTest2(MaxOrder1, Exprn, MapType, IntegrORDiffr, xExprnOptionSelected);
                        } else {
                            IntegralHighSingleTest2(MaxOrder1, Exprn, MapType, IntegrORDiffr, xExprnOptionSelected);
                            if (InvertAnsFlag == true) {
                                SectionTCFlippedCount++;
                            }
                            if (InvertAnsBothFlag == true) {
                                SectionTCBothFlippedCount++;
                            }
                        }
                        System.out.println(ConsoleColors.RED + AlgoDispStr + ": j=" + j + " TestCase=" + TestCase + " Order=" + Order + " TestCasePassHighLevelFlag=" + TestCasePassHighLevelFlag);
                    } else {
                        ;
                    }
                    if (TestCasePassHighLevelFlag) {
                        TotalTestCases++;
                        PassedTestCount++;
                        ruleAnalytics.setTestCaseStatus("" + TestCase, TestCasePassHighLevelFlag);

                    } else if ((DoNOTSkipSectionFlag) && (TestCasePassHighLevelFlag == false) && (KnownIssueTestCasesFlag == false) && (CoreKnownIssuesTestCasesFlag == false)
                                &&(EqnUnderTest != null)&&(!EqnUnderTest.equalsIgnoreCase(""))
                            ) {
                        FailedTestCases.put(MaxIndexFail, "" + TestCase + " Order=" + Order + ",");
                        FailedCurrRun.put(FailedTestCount, "" + TestCase);
                        MaxIndexFail++;
                        FailedTestCount++;
                        ruleAnalytics.setTestCaseStatus("" + TestCase, TestCasePassHighLevelFlag);
                        TotalTestCases++;
                    } else {
                        TotalTestCases++;
                    }
                    if (/*(!Exprn.equalsIgnoreCase(""))*/(!EqnSolArrayMap4[Order - 1].equalsIgnoreCase("")) && (!EqnSolArrayMap3[Order - 1].equalsIgnoreCase(""))) {

                    } else if ((DoNOTSkipSectionFlag) && (TestCasePassHighLevelFlag == false) && (Order == MaxOrder1)
                            && (EqnSolArrayMap4[Order - 1].equalsIgnoreCase("")) && (EqnSolArrayMap3[Order - 1].equalsIgnoreCase(""))
                            && (KnownIssueTestCasesFlag == false) && (CoreKnownIssuesTestCasesFlag == false)) {
                        NullTestCasesFlag = true;
                        if (!NullTestCasesFlag) {
                            FailedTestCount++;
                        }
                        TestCasePassHighLevelFlag = false;
                        NullTestCases++;
                        NULLStrTestCases.put(NullTestCases, "" + TestCase);
                        NullTestCasesFlag = false;
                    }
                }
                System.out.println(ConsoleColors.RED + AlgoDispStr + ": j=" + j + " TestCase=" + TestCase + " Order=" + Order + " TestCasePassHighLevelFlag=" + TestCasePassHighLevelFlag);
            } else if (DupFlag == true) {
                System.out.println(ConsoleColors.RED + AlgoDispStr + ": j=" + j + " TestCase=" + TestCase + " Dup. Hence NOT Executing.");

            }
            OldTestCase = j;
            if (j == SectionTestCaseEnd) {
                OldKnwnI = KnownIssues - OldKnwnIStartSection;
                //System.out.println("UsageCalculus:mainRegresssionTest:End:" + AlgoDispStr + ":OldKnwnI=" + OldKnwnI + " KnownIssues=" + KnownIssues + " OldKnwnIStartSection=" + OldKnwnIStartSection);
            }
            j = RegressionControl(j);
            if ( ((j < 120000L)&&(j - OldTestCase) > 1) ||((j > 120000L)&&(OldTestCase ==SectionTestCaseEnd) ) ) {
                GapProcess(AlgoDispStr, j, OldTotalTestCases, OldTestCase, OldMaxIndexFail, OldFailedTestCount, OldDups, OldKnwnI, EqnDBDupCount, OldInvertAnsBothFlippedCount, OldInvertAnsFlippedCount);
                OldFailedTestCount = FailedTestCount;
                OldDups = EqnDBDupCount;
                OldTotalTestCases = TotalTestCases;
                if (j == SectionTestCaseEnd) {
                    OldInvertAnsBothFlippedCount = InvertAnsBothFlippedCount;
                    OldInvertAnsFlippedCount = InvertAnsFlippedCount;
                    SectionAnsBothFlippedCount = 0;
                    SectionAnsFlippedCount = 0;
                }
            }
            TestCase = j;
        }
        GapProcess(AlgoDispStr, j, OldTotalTestCases, OldTestCase, OldMaxIndexFail, OldFailedTestCount, OldDups, OldKnwnI, EqnDBDupCount, OldInvertAnsBothFlippedCount, OldInvertAnsFlippedCount);
        int k = 0;
        for (int y = 0; (y < EqnDB.size()); y++) {
            String Temp = EqnDB.get(y);
            if ((Temp != null) && (Temp.contains(":Dup with"))) {
                k++;
            }
        }
        System.out.println(ConsoleColors.RED + AlgoDispStr + ": TestCase  Final Summary : Total Failed=" + FailedTestCount + " Out of Run TestCases-Dups=" + (TotalTestCases) + " Passed Count=" + PassedTestCount/*(TotalTestCases - FailedTestCount)*/ + " NullTestCases=" + NullTestCases + " KnownIssues=" + KnownIssues + " CoreKnownIssues=" + CoreKnownIssues + ConsoleColors.RESET);
        System.out.println(ConsoleColors.RED + AlgoDispStr + ": TestCase Summary : DupCount=" + k + " Total Exceptions=" + MaxIndexExcept + " Test NOT RUN Count=" + TestNOTRUNCount /*+ " WrongAnswerCountCalculus1=" + WrongAnswerCountCalculus1 + " WrongAnswerCountMap2=" + WrongAnswerCountMap2 */ + ConsoleColors.RESET);
        SummariesPrintmain(AlgoDispStr);

        ruleAnalytics = null;
        //ruleAnalyticsFailed = null;
//        testResultsPassed = null;
//        testResultsFailed = null;
    }

    public static long RegressionControl(long j) {
        if (((j >= SectionTestCaseStart) && (j < SectionTestCaseEnd) && (SectionTestCaseStart >= 0) && (SectionTestCaseEnd >= 0))
                || (SectionTestCaseStart == 0) && (SectionTestCaseEnd == 0)) {
            j++;
        } else if ((j < 1000)) {
            j = 1000;
        } else if ((SectionTestCaseEnd == 1015)) {
            j = 2000;
        } else if ((SectionTestCaseEnd == 2082)) {
            j = 3000;
        } else if ((SectionTestCaseEnd == 3498)) {
            j = 3500;
        }else if ((SectionTestCaseEnd == 3748)) {
            j = 3750;
        }else if ((SectionTestCaseEnd == 3998)) {
            j = 4000;
        } else if ((SectionTestCaseEnd == 4033)) {
            j = 5000;
        } else if ((SectionTestCaseEnd == 5033)) {
            j = 6000;
        } else if ((SectionTestCaseEnd == 6019)) {
            j = 7000;
        } else if (SectionTestCaseEnd == 7005) {
            j = 10001;
        } else if (SectionTestCaseEnd == 10010) {
            j = 20001;
        } else if (SectionTestCaseEnd == 20069) {
            j = 30001;
        } else if (SectionTestCaseEnd == 30011) {
            j = 40001;
        } else if (SectionTestCaseEnd == 40037) {
            j = 50001;
        } else if (SectionTestCaseEnd == 50093) {
            j = 80000;
        } else if (SectionTestCaseEnd == 80132) {
            j = 90000;
        } else if (SectionTestCaseEnd == 90022) {
            j = 100000;
        } else if (SectionTestCaseEnd == 100009) {
            j = 110001;
        } else if (SectionTestCaseEnd == 110029) {
            j = 120001;
        } else if (SectionTestCaseEnd == 120100) {
            j = 120101;
        } else if (SectionTestCaseEnd == 120200) {
            j = 120201;
        } else if (SectionTestCaseEnd == 120300) {
            j = 120301;
        } else if (SectionTestCaseEnd == 120400) {
            j = 120401;
        } else if (SectionTestCaseEnd == 120500) {
            j = 120501;
        } else if (SectionTestCaseEnd == 120600) {
            j = 120601;
        } else if (SectionTestCaseEnd == 120700) {
            j = 120701;
        } else if (SectionTestCaseEnd == 120800) {
            j = 120801;
        } else if (SectionTestCaseEnd == 120900) {
            j = 120901;
        } else if (SectionTestCaseEnd == 121000) {
            j = 121001;
        } else if (SectionTestCaseEnd == 121100) {
            j = 121101;
        } else if (SectionTestCaseEnd == 121200) {
            j = 121201;
        } else if (SectionTestCaseEnd == 121300) {
            j = 121301;
        } else if (SectionTestCaseEnd == 121400) {
            j = 130001;
        } else if (SectionTestCaseEnd == 130100) {
            j = 130101;
        } else if (SectionTestCaseEnd == 130200) {
            j = 130201;
        } else if (SectionTestCaseEnd == 130300) {
            j = 130301;
        } else if (SectionTestCaseEnd == 130400) {
            j = 130401;
        } else if (SectionTestCaseEnd == 130500) {
            j = 130501;
        } else if (SectionTestCaseEnd == 130600) {
            j = 130601;
        } else if (SectionTestCaseEnd == 130700) {
            j = 130701;
        } else if (SectionTestCaseEnd == 130800) {
            j = 130801;
        } else if (SectionTestCaseEnd == 130900) {
            j = 130901;
        } else if (SectionTestCaseEnd == 131000) {
            j = 131001;
        } else if (SectionTestCaseEnd == 131100) {
            j = 131101;
        } else if (SectionTestCaseEnd == 131200) {
            j = 131201;
        } else if (SectionTestCaseEnd == 131300) {
            j = 131301;
        } else if (SectionTestCaseEnd == 131400) {
            j = 140000;
        } else {
            System.out.println(ConsoleColors.RED + "RegressionControl:j= " + j + ": Infinite Loop" + ConsoleColors.RESET);
        }
        return j;

    }

    public static void mainUser(String... args) {
        System.out.println(ConsoleColors.BLUE + "Differentiation / Integration:" + ConsoleColors.RESET);
        String TechDiffWithRespTo = DiffWithRespTo;
        String xExprn = "Enter*Your*Equation/Here:x^8 + x^5 + x^4 - x - 25:";
        Scanner scanner = new Scanner(System.in);
        xExprn = xExprn.trim();
        System.out.print(xExprn);
        xExprn = scanner.nextLine();
        xExprn = xExprn.trim();
        xExprn = eatAll(xExprn, ' ');

        System.out.print("You Entered Equation:Example:x^8 + x^5 + x^4 - x - 25:" + xExprn);
        System.out.print(System.lineSeparator());

        System.out.print("DiffWithRespTo:[" + TechDiffWithRespTo + "]:");
        TechDiffWithRespTo = scanner.nextLine();

        if (TechDiffWithRespTo.equalsIgnoreCase("")) {
            TechDiffWithRespTo = DiffWithRespTo;
        }
        TechDiffWithRespTo = TechDiffWithRespTo.trim();
        TechDiffWithRespTo = eatAll(TechDiffWithRespTo, ' ');

        if (xExprn.contains(TechDiffWithRespTo)) {
            System.out.print("You Entered Primary Variable:" + TechDiffWithRespTo);
            System.out.print(System.lineSeparator());
        } else {
            System.out.println("You Entered Equation:" + xExprn);
            System.out.println("You Entered Primary Variable:" + TechDiffWithRespTo + " but Equation entered does not contain " + TechDiffWithRespTo);
            System.out.println("Proceeding with Entered Values");
        }
        System.out.print("Diff And Integration Order:");
        String Temp = scanner.nextLine();
        int TechDiffOrder = 2;
        if (!Temp.equalsIgnoreCase("")) {
            TechDiffOrder = Integer.parseInt(Temp);
        }
        System.out.print("You Entered Diff And Integration Order:" + (TechDiffOrder));
        System.out.print(System.lineSeparator());

        System.out.println(ConsoleColors.BLUE + "Differentiation Started:" + ConsoleColors.RESET);

        UserDiff(xExprn, "mainUser", TechDiffOrder, TechDiffWithRespTo);
        System.out.print(System.lineSeparator());
        System.out.print(System.lineSeparator());
        System.out.print(System.lineSeparator());

        System.out.println(ConsoleColors.BLUE + "Integration Started:" + ConsoleColors.RESET);
        UserIntegr(xExprn, "mainUser", TechDiffOrder, TechDiffWithRespTo);

    }

    public static String UserDiff(String Exprn, String AlgoName, int TechDiffOrder, String TechDiffWithRespTo) {
        Map<String, Double> variables = new HashMap<>();
        MyFuncExpress();
        MyFuncDiff();
        MyFuncSimple();
        SimpleExpression expSimple;
        Expression expValue;
        String StrexpSimpleExpress = "";
        String StrexpDiffExpress = "";
        int TechDiffOrderIndex = 1;
        String MapType = "Map1";
        String IntegrORDiffr = "Diffr";
        System.out.println("UserDiff: TechDiffWithRespTo=" + TechDiffWithRespTo + " Basic Simple Exprn=" + Exprn);

        expValue = parse(Exprn, variables, TechDiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
        for (; (TechDiffOrderIndex <= TechDiffOrder); TechDiffOrderIndex++) {
            variables.put(TechDiffWithRespTo, 1.0);

            ChaosPrevention();
            expSimple = parseSimple(Exprn, variables, TechDiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
            StrexpSimpleExpress = expSimple.SimpleExpr();
            System.out.println("UserDiff: TechDiffWithRespTo=" + TechDiffWithRespTo + " Basic Simple Exprn=" + StrexpSimpleExpress);

            DiffrIntegrSep.DiffExpr exp = DiffrIntegrSep.parseDiff(StrexpSimpleExpress, variables, TechDiffWithRespTo, MapType, IntegrORDiffr);
            StrexpDiffExpress = exp.DiffExpr();
            System.out.println("UserDiff:Result(Diff Equation)(" + TechDiffOrderIndex + " th order)=> " + StrexpDiffExpress);

            ChaosPrevention();
            expSimple = parseSimple(StrexpDiffExpress, variables, TechDiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
            StrexpSimpleExpress = expSimple.SimpleExpr();
            System.out.println("UserDiff: TechDiffWithRespTo=" + TechDiffWithRespTo + " Basic Simple Exprn=" + StrexpSimpleExpress);
            expValue = parse(StrexpSimpleExpress, variables, TechDiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
            System.out.println("UserDiff:Result(Value)(" + TechDiffWithRespTo + "=" + variables.get(TechDiffWithRespTo) + ")=" + expValue.eval());
            Exprn = StrexpSimpleExpress;

        }
        return StrexpSimpleExpress;
    }

    public static String UserIntegr(String Exprn, String AlgoName, int TechDiffOrder, String TechDiffWithRespTo) {
        Map<String, Double> variables = new HashMap<>();
        Map<String, String> variablesDiff = new HashMap<>();
        MyFuncExpress();
        MyFuncDiff();
        MyFuncSimple();
        variablesDiff.put(TechDiffWithRespTo, TechDiffWithRespTo);
        SimpleExpression expSimple;
        Expression expValue;
        DiffrIntegrSep.IntegrExpr exp;
        String StrexpSimpleExpress = "";
        String StrexpDiffExpress = "";
        int TechDiffOrderIndex = 1;
        String MapType = "MAP1";
        String IntegrORDiffr = "Integre";
        System.out.println("UserIntegr: TechDiffWithRespTo=" + TechDiffWithRespTo + " Basic Simple Exprn=" + Exprn);

        expValue = parse(Exprn, variables, TechDiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
        for (; (TechDiffOrderIndex <= TechDiffOrder); TechDiffOrderIndex++) {
            variables.put(TechDiffWithRespTo, 1.0);

            ChaosPrevention();
            expSimple = parseSimple(Exprn, variables, TechDiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
            StrexpSimpleExpress = expSimple.SimpleExpr();
            System.out.println("UserIntegr: TechDiffWithRespTo=" + TechDiffWithRespTo + " Basic Simple Exprn=" + StrexpSimpleExpress);

            exp = DiffrIntegrSep.parseIntegr(StrexpSimpleExpress, variables, TechDiffWithRespTo, MapType, IntegrORDiffr);
            StrexpDiffExpress = exp.IntegrExpr();
            System.out.println("UserIntegr:Result(Integr Equation)(" + TechDiffOrderIndex + " th order)=> " + StrexpDiffExpress);

            ChaosPrevention();
            expSimple = parseSimple(StrexpDiffExpress, variables, TechDiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
            StrexpSimpleExpress = expSimple.SimpleExpr();
            System.out.println("UserIntegr: TechDiffWithRespTo=" + TechDiffWithRespTo + " Basic Simple Exprn=" + StrexpSimpleExpress);
            expValue = parse(StrexpSimpleExpress, variables, TechDiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
            System.out.println("UserIntegr:Result(Value)(" + TechDiffWithRespTo + "=" + variables.get(TechDiffWithRespTo) + ")=" + expValue.eval());
            Exprn = StrexpSimpleExpress;

        }
        return StrexpSimpleExpress;
    }

//    public static void mainAlgebraUser(String... args) {
//        Map<String, Double> variables = new HashMap<>();
//        Map<String, String> variablesDiff = new HashMap<>();
//        String StrexpSimpleExpress = "";
//        SimpleExpression expSimple;
//        String FuncF = "x^2+25";
//
//        String FuncG = "2*x+98";
//        //SimpleAlgebraSep.SimpleAlgebra F;
//        //SimpleAlgebraHghLvl F;
//        SimpleAlgebraSep.FoG FuncComp;
//        //FoGLowLvL FuncComp;
//
//        String TechDiffWithRespTo = DiffWithRespTo;
//        String MapType="Map1";
//        String IntegrORDiffr="Diffr";
//        
//        System.out.println(ConsoleColors.BLUE + "Algebra / Function Composition:" + ConsoleColors.RESET);
//        System.out.print("Enter*Your* First Equation/Here:x^2+25:");
//
//        Scanner scanner = new Scanner(System.in);
//
//        FuncF = scanner.nextLine();
//        FuncF = eatAll(FuncF, ' ');
//        System.out.println("You Entered First Equation:Example:x^2+25:" + FuncF);
//        System.out.print(System.lineSeparator());
//        System.out.print("Enter*Your* Second Equation/Here:x^2+25:");
//        FuncG = scanner.nextLine();
//        FuncG = eatAll(FuncG, ' ');
//
//        System.out.println("You Entered Second Equation:Example:x^2+25:" + FuncG);
//        System.out.print(System.lineSeparator());
//
//        System.out.print("DiffWithRespTo:[" + TechDiffWithRespTo + "]:");
//        TechDiffWithRespTo = scanner.nextLine();
//
//        if (TechDiffWithRespTo.equalsIgnoreCase("")) {
//            TechDiffWithRespTo = DiffWithRespTo;
//        }
//        TechDiffWithRespTo = eatAll(TechDiffWithRespTo, ' ');
//
//        if ((FuncF.contains(TechDiffWithRespTo)) && (FuncF.contains(TechDiffWithRespTo))) {
//            System.out.print("You Entered Primary Variable:" + TechDiffWithRespTo);
//            System.out.print(System.lineSeparator());
//        } else {
//            System.out.println("You Entered First Equation:" + FuncF);
//            System.out.println("You Entered Second Equation:" + FuncG);
//            System.out.println("You Entered Primary Variable:" + TechDiffWithRespTo + " but Equation entered does not contain " + TechDiffWithRespTo);
//            System.out.println("Proceeding with Entered Values");
//        }
//        variables.put(TechDiffWithRespTo, 1.0);
//        F = SimpleAlgebraSep.parseAlgebra(FuncF, FuncG, "*", variables, TechDiffWithRespTo);
//        //F = parseAlgebraHghLvl(FuncF, FuncG, "*", variables, TechDiffWithRespTo);
//
//        expSimple = parseSimple(F.Algebra(), variables, TechDiffWithRespTo, MapType, IntegrORDiffr,HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
//        StrexpSimpleExpress = expSimple.SimpleExpr();
//        System.out.println("mainAlgebra: TechDiffWithRespTo=" + TechDiffWithRespTo + " Basic Simple Algebraic Exprn=" + StrexpSimpleExpress);
//
//        FuncComp = SimpleAlgebraSep.parseFoG(FuncF, FuncG, variables, TechDiffWithRespTo);
//
//        //FuncComp=parseFoGLowLvL(FuncF, FuncG, variables, TechDiffWithRespTo);
//        if (!FuncComp.Substitute().contains("(")) {
//            expSimple = parseSimple(FuncComp.Substitute(), variables, TechDiffWithRespTo, MapType, IntegrORDiffr,HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
//            StrexpSimpleExpress = expSimple.SimpleExpr();
//        } else {
//            StrexpSimpleExpress = FuncComp.Substitute();
//        }
//        System.out.println("mainAlgebra: TechDiffWithRespTo=" + TechDiffWithRespTo + " Basic Function Composition FoG=" + StrexpSimpleExpress);
//
//    }
    public static boolean ValidateGivenAnswer(int TestCase, int Order, String OrigExprn, double x, double y, String OrigOperation) {
        String Exprn = "";
        String Exprn1 = "";
        SimpleExpression expSimple;
        Map<String, Double> variables = new HashMap<>();
        String MapType = "Map1";
        String IntegrORDiffr = "Diffr";
        variables.put(DiffWithRespTo, x);
        variables.put("y", y);
        variables.put("a", 1.0);
        variables.put("b", 2.0);//variables.put("b", 0.0);
        variables.put("c", -1.0);
        variables.put("d", 2.0);
        variables.put("p", 1.0);
        variables.put("q", 0.0);
        variables.put("r", -1.0);
        variables.put("s", 2.0);
        if (OrigOperation.equalsIgnoreCase("Diff")) {
            DiffrIntegrSep.IntegrExpr exp;
            exp = DiffrIntegrSep.parseIntegr(UsageCalculus.EqnSolArrayMap2[Order], variables, DiffWithRespTo, MapType, IntegrORDiffr);
            Exprn = exp.IntegrExpr();
            expSimple = parseSimple(Exprn, variables, DiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
            Exprn = expSimple.SimpleExpr();
            expSimple = parseSimple(EqnSolArrayMap1[Order], variables, DiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
            Exprn1 = expSimple.SimpleExpr();
            if ((Exprn.equalsIgnoreCase(Exprn1) || (Exprn1.contains(Exprn)))) {
                return true;
            }
            System.out.println(ConsoleColors.RED + "ValidateGivenAnswer:Exprn(Integral)=" + Exprn + ConsoleColors.RESET);
            System.out.println(ConsoleColors.RED + "ValidateGivenAnswer:Exprn(Answer)  =" + Exprn1 + ConsoleColors.RESET);
        } else if (OrigOperation.equalsIgnoreCase("Integre")) {
            DiffrIntegrSep.DiffExpr exp;
            exp = DiffrIntegrSep.parseDiff(UsageCalculus.EqnSolArrayMap4[Order], variables, DiffWithRespTo, MapType, IntegrORDiffr);
            Exprn = exp.DiffExpr();
            expSimple = parseSimple(Exprn, variables, DiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
            Exprn = expSimple.SimpleExpr();
            expSimple = parseSimple(EqnSolArrayMap3[Order], variables, DiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
            Exprn1 = expSimple.SimpleExpr();
            if ((Exprn.equalsIgnoreCase(Exprn1))) {
                return true;
            }
            System.out.println(ConsoleColors.RED + "ValidateGivenAnswer:Exprn(Diff)  =" + Exprn + ConsoleColors.RESET);
            System.out.println(ConsoleColors.RED + "ValidateGivenAnswer:Exprn(Answer)=" + Exprn1 + ConsoleColors.RESET);
        }
        return false;
    }

    public static void DiffSingleHighTestCase(int MaxOrder1, String Exprn, String MapType, String IntegrORDiffr, String xExprnOptionSelected) {
        Map<String, Double> variables = new HashMap<>();
        MathsContxtLAv.SimpleExpression expSimpleMap1 = (() -> "");
        MathsExpressionParser.Expression expValue = (() -> Double.NaN);
        MathsContxtLAv.SimpleExpression expSimpleMap2 = (() -> "");
        DiffrIntegrSep.DiffExpr exp = (() -> "");
        MyFuncExpress();
        MyFuncDiff();
        MyFuncSimple();

        String Constant = "C";

        String StrexpSimpleExpressMap1 = "";
        String StrexpDiffExpress = "";
        String StrexpSimpleExpressMap2 = "";
        String myOrder = "";

        double ExprnexpValue = 0;
        double ExprnexpValue1 = 0;
        double DblexpValueMap1 = 0;
        double DblexpDiffValue = 0;
        double DblexpValueMap2 = 0;
        double DblexpValueMap3 = 0;

        StageMapping = "";
        Order = 1;

        System.out.println(ConsoleColors.YELLOW + "Test Case " + TestCase + " EndTestCase=" + EndTestCase + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case " + TestCase + " TestCaseFile=" + TestCaseFile + " Section=" + Section + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Exprn=" + Exprn + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case Name=" + TestCaseName + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case Name=" + TestCaseMatrixID + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Regression Status : Test Case should be " + EqnRegressionDiffStatus + ConsoleColors.RESET);

        for (double x = 1.0, y = 7.0; (Order < MaxOrder1); y++, /*x++,*/ Order++) {
            try {
                TestCasePassStrFlag = false;
                TestCasePassValFlag = false;
                TestCasePassConformalValFlag = false;
                ReturnFlagMap1 = false;
                ReturnFlagDiff = false;
                ReturnFlagMap2 = false;
                Exprn = eatAll(Exprn, ' ');
                variables.put(DiffWithRespTo, x);
                variables.put("y", y);
                SetVariablesAll();
                variables.put(Constant, 5.0);
                StageMapping = "Basic Mapping";
                MapType = "Map1";
                if (Trace.contains("Map1")) {
                    SetDevFlags(true, "Silent", false);
                } else {
                    SetDevFlags(false, "Silent", false);
                }
                //if (!DetailedFailureSummaryAloneFlag) {
                //System.out.println("main: " + DiffWithRespTo + "=" + x + " Exprn=" + Exprn + " Order=" + myOrder);
                //}
                ChaosPrevention();
                //if (!DetailedFailureSummaryAloneFlag) {
                System.out.println(ConsoleColors.BLUE + "main:MAP1 START VERBOSE IF SET" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.BLUE + "main:MAP1 START VERBOSE IF SET" + ConsoleColors.RESET);
                //}
                expSimpleMap1 = parseSimple(Exprn, variables, DiffWithRespTo, "Map1", IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
                StrexpSimpleExpressMap1 = expSimpleMap1.SimpleExpr();
                //if (!DetailedFailureSummaryAloneFlag) {
                //System.out.println("main: " + DiffWithRespTo + "=" + x + " After Map1:Basic Simple Exprn=" + StrexpSimpleExpressMap1);
                System.out.println(ConsoleColors.BLUE + "main:MAP1 END VERBOSE IF SET" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.BLUE + "main:MAP1 END VERBOSE IF SET" + ConsoleColors.RESET);
                //}
                expValue = parse(Exprn, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                ExprnexpValue = expValue.eval();
                System.out.println(" main:Result(Expn Value)=" + ExprnexpValue + "  x=" + x + " " + DiffWithRespTo + "=" + x);
                //System.out.println(" main:Expn Value=" + ExprnexpValue + "  x=" + x + " " + DiffWithRespTo + "=" + x + " Exprn=" + Exprn);
                expValue = parse(StrexpSimpleExpressMap1, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpValueMap1 = expValue.eval();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Basic Simple (Exprn Value)=" + DblexpValueMap1);
                
                //' Convert Both Answers to POSITIVE DOMAIN as For Nominal Answer of -23.0 , -24 or -22 is allowed
                if ((DblexpValueMap1 < 0) && (ExprnexpValue < 0)) {
                    DblexpValueMap3 = DblexpValueMap1 * -1.0;
                    ExprnexpValue1 = ExprnexpValue * -1.0;
                }
                ///WrongAnsDiffrMap1(MaxOrder1);
                //System.out.println("main: " + DiffWithRespTo + "=" + x + " Basic Simple (Result) (Exprn Value)=" + DblexpValueMap1 + " StrexpSimpleExpressMap1=" + StrexpSimpleExpressMap1);
                StageMapping = "Differentiation";
                System.out.println(ConsoleColors.BLUE + "main:Differentiation VERBOSE IF SET" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.BLUE + "main:Differentiation VERBOSE IF SET" + ConsoleColors.RESET);
                exp = DiffrIntegrSep.parseDiff(StrexpSimpleExpressMap1, variables, DiffWithRespTo, MapType, IntegrORDiffr);
                StrexpDiffExpress = exp.DiffExpr();
                //System.out.println(" main:Result(Diff Equation)(" + Order + " th order)=> " + StrexpDiffExpress);
                StageMapping = "Differentiation Mapping";
                MapType = "Map2";
                ChaosPrevention();
                System.out.println(ConsoleColors.BLUE + " main:Test Case Status=" + " MAP2 START VERBOSE IF SET" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.BLUE + " main:Test Case Status=" + " MAP2 START VERBOSE IF SET" + ConsoleColors.RESET);
                if (Trace.contains("Map2")) {
                    SetDevFlags(true, "Silent", false);
                } else {
                    SetDevFlags(false, "Silent", false);
                }
                //System.out.println(ConsoleColors.BLUE + " main:Test Case Status=" + " StrexpDiffExpress=" + StrexpDiffExpress + ConsoleColors.RESET);
                expSimpleMap2 = parseSimple(StrexpDiffExpress, variables, DiffWithRespTo, "Map2", IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
                StrexpSimpleExpressMap2 = expSimpleMap2.SimpleExpr();
                System.out.println(ConsoleColors.BLUE + " main:Test Case Status=" + " MAP2 END VERBOSE IF SET" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.BLUE + " main:Test Case Status=" + " MAP2 END VERBOSE IF SET" + ConsoleColors.RESET);
                expValue = parse(StrexpDiffExpress, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpDiffValue = expValue.eval();
//                WrongAnswerFlagCalculus1 = false;
//                if (Order == 1) {
//                    WrongAnswerCalculus1(EqnSolArrayDiffAlone[Order], variables, EqnSolArrayMap2[Order]);
//                    if ((WrongAnswerFlagCalculus1 == true)) {
//                        WrongAnswerCountCalculus1++;
//                        System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "WRONG ANSWER MAP2" + ConsoleColors.RESET);
//                        System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given Answe2(EqnSolArrayDiffAlone[Order])=" + EqnSolArrayDiffAlone[Order] + ConsoleColors.RESET);
//                        System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given AnswerMap(EqnSolArrayMap2[Order])=" + EqnSolArrayMap2[Order] + ConsoleColors.RESET);
//                        WrongAnsTestCasesCalculus1.put(MaxIndexWrongAnsCalculus1, TestCase + " ,");
//                        MaxIndexWrongAnsCalculus1++;
//                    }
//                }
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Result(Diff Value)=" + DblexpDiffValue);
                System.out.println(" main:Result(Simplified Diff Equation)(" + Order + " th order)=> " + StrexpSimpleExpressMap2);
                expValue = parse(StrexpSimpleExpressMap2, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpValueMap2 = expValue.eval();
                //WrongAnsDiffrMap2();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Result(Simplified Diff Value)=" + expValue.eval());
                System.out.print(System.lineSeparator());

//                if ((StrexpSimpleExpressMap1==null) ||(StrexpSimpleExpressMap1.equalsIgnoreCase(""))||((StrexpDiffExpress==null) ||(StrexpDiffExpress.equalsIgnoreCase("")) ) ||(StrexpSimpleExpressMap2==null) ||(StrexpSimpleExpressMap2.equalsIgnoreCase("")) ){
//                    TestCasePassHighLevelFlag = false;
//                }else 
                if (PassFailTestCaseString(TestCase, Order, "Diff", Exprn, StrexpSimpleExpressMap1, StrexpDiffExpress, StrexpSimpleExpressMap2, EqnUnderTest, EqnSolArrayMap1[Order], EqnSolArrayDiffAlone[Order], EqnSolArrayMap2[Order], "", "", xExprnOptionSelected)) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass STRING TEST Complete" + ConsoleColors.RESET);
                    TestCasePassStrFlag = true;
                } else if ((ReturnFlagMap1 == true) && (ReturnFlagMap2 == true) && (ReturnFlagDiff == false)) {
                    System.out.println(ConsoleColors.BLUE + " main:Test Case Status=" + "Pass STRING TEST Weak Pass" + ConsoleColors.RESET);
                    TestCasePassStrFlag = true;
                } else if ((InvertAnsIfNecessaryFlag) && (FlipUtils.PassFailInvertAnsString(TestCase, Order, MaxOrder1, "Diff", DiffWithRespTo, Exprn, StrexpSimpleExpressMap1, StrexpDiffExpress, StrexpSimpleExpressMap2, EqnUnderTest, EqnSolArrayMap1[Order], EqnSolArrayDiffAlone[Order], EqnSolArrayMap2[Order], ReturnFlagMap1, ReturnFlagDiff, ReturnFlagMap2))) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass STRING TEST Complete" + ConsoleColors.RESET);
                    TestCasePassStrFlag = true;
                    FlippedBothTestCases.put(MaxBothFlipIndexPass, "" + TestCase + " Order=" + Order + ",");
                    MaxBothFlipIndexPass++;
                    SectionAnsBothFlippedCount++;
                    InvertAnsBothFlag = true;
                    if (Order == (MaxOrder1 - 1)) {
                        InvertAnsBothFlippedCount++;
                    }
                } else {
                    String input=Exprn;
                    //String prompt = buildPrompt(input, "Differentiation", DiffWithRespTo);
                    //String gptAnswer = chatGPT(prompt); //ChatGptClient.query(prompt);
                    //cache.put(key, gptAnswer);
                    
                    TestCasePassStrFlag = false;
                    if (TestCasePassHighLevelFlag == true) {
                        TestCasePassHighLevelFlag = false;
                    }
                    System.out.println(ConsoleColors.RED + " ReturnFlagMap1=" + ReturnFlagMap1 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " ReturnFlagDiff=" + ReturnFlagDiff + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " ReturnFlagMap2=" + ReturnFlagMap2 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " TestCasePassStrFlag=" + TestCasePassStrFlag + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " TestCasePassHighLevelFlag=" + ReturnFlagMap2 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "FAIL STRING TEST Complete" + ConsoleColors.RESET);

                }
                variables.put(DiffWithRespTo, x);
                variables.put("y", y);
                variables.put("a", 1.0);
                variables.put("b", 2.0);//variables.put("b", 0.0);
                variables.put("c", -1.0);
                variables.put("d", 2.0);
                variables.put("m", -1.0);
                variables.put("p", 3.0);
                variables.put("q", 0.0);
                variables.put("r", -1.0);
                variables.put("s", 2.0);
                variables.put("i", 1.0);
                variables.put("E1", 1.0);
                variables.put("ab", 2.0);
                variables.put("ac", 3.0);
                variables.put("ad", 3.1);
                variables.put("am", 2.1);
                variables.put("ap", 7.0);
                variables.put("aq", 9.0);
                variables.put("ar", 5.0);
                variables.put("as", 6.1);
                variables.put("ai", 1.0);
                if (PassFailTestCaseValueStrict(TestCase, Order, MaxOrder1, "Diff", Exprn, ExprnexpValue, DblexpValueMap1, DblexpDiffValue, DblexpValueMap2, StrexpDiffExpress, variables, x)) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass VALUE TEST Strict Complete:Pragma:" + Pragma + ConsoleColors.RESET);
                    TestCasePassValFlag = true;
                    //TestCasePassHighLevelFlag = true;
                } else {
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Fail VALUE TEST Strict Complete" + " Stale Answer" + ConsoleColors.RESET);
                    TestCasePassValFlag = false;
                    TestCasePassHighLevelFlag = false;
                }
                if ((TestCasePassStrFlag == true) || (TestCasePassValFlag == true)) {
                    variables.put(DiffWithRespTo, x);
                    variables.put("y", y);
                    variables.put("a", 1.0);
                    variables.put("b", 2.0);//variables.put("b", 0.0);
                    variables.put("c", -1.0);
                    variables.put("d", 2.0);
                    variables.put("m", -1.0);
                    variables.put("p", 3.0);
                    variables.put("q", 0.0);
                    variables.put("r", -1.0);
                    variables.put("s", 2.0);
                    variables.put("i", 1.0);
                    variables.put("E1", 1.0);
                    variables.put("ab",2.0);
        variables.put("ac",3.0);
        variables.put("ad",3.1);
        variables.put("am",2.1);
        variables.put("ap",7.0);
        variables.put("aq",9.0);
        variables.put("ar",5.0);
        variables.put("as",6.1);
        variables.put("ai",1.0);
                    TestCasePassConformalValFlag = ConformalMapTestCaseDiff(TestCase, Order, Exprn, expSimpleMap1.SimpleExpr(), exp.DiffExpr(), expSimpleMap2.SimpleExpr(), EqnSolArrayMap1[Order], EqnSolArrayDiffAlone[Order], EqnSolArrayMap2[Order], variables, DiffWithRespTo);
                }
//                if ((TestCasePassValFlag != true) && (PassFailTestCaseValueEasy(TestCase, Order, "Diff", Exprn, ExprnexpValue, DblexpValueMap1, DblexpDiffValue, DblexpValueMap2, StrexpDiffExpress, variables, x))) {
//                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass VALUE TEST Complete:Pragma:Loose" + ConsoleColors.RESET);
//                    TestCasePassValFlag = true;
//                }
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
                } else if (!((TestCasePassStrFlag == true) && (TestCasePassValFlag == true) && (TestCasePassConformalValFlag == true))) {
                    String Temp = FailedTestCases.get(MaxIndexFail);
                    String HashVal = "";
                    String HashVal1 = "";
                    if ((Temp != null) && (!Temp.equalsIgnoreCase(""))) {
                        HashVal1 = Temp + "," + ":Order=" + (Order);
                    } else {
                        HashVal1 = "TestCase=" + TestCase + ":Order=" + (Order);
                    }
                    FailedTestCases.put(MaxIndexFail, HashVal1);
                    //i=MaxOrder1;
                    TestCasePassHighLevelFlag = false;
                } else if ((Pragma.equalsIgnoreCase("Easy"))) {
                    TestCasePassHighLevelFlag = true;
                }
                if (!FailTestCaseStringDiagnostic(TestCase, Order, MaxOrder1, "Diff", Exprn, StrexpSimpleExpressMap1, StrexpDiffExpress, StrexpSimpleExpressMap2, EqnUnderTest, EqnSolArrayMap1[Order], EqnSolArrayDiffAlone[Order], EqnSolArrayMap2[Order])) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Diagnostic Complete" + ConsoleColors.RESET);
                }
                if ((TestCasePassHighLevelFlag == false) && (Order == (MaxOrder1 - 1))
                        && (EqnSolArrayMap1[Order - 1].equalsIgnoreCase("")) && (EqnSolArrayMap2[Order - 1].equalsIgnoreCase(""))
                        && ((StrexpSimpleExpressMap1.equalsIgnoreCase("")) || (StrexpDiffExpress.equalsIgnoreCase("")) || (StrexpSimpleExpressMap2.equalsIgnoreCase("")))
                        && (KnownIssueTestCasesFlag == false) && (CoreKnownIssuesTestCasesFlag == false)) {
                    NullTestCasesFlag = true;
                    if (!NullTestCasesFlag) {
                        FailedTestCount++;
                    }
                    TestCasePassHighLevelFlag = false;
                    NullTestCases++;
                    NULLStrTestCases.put(NullTestCases, "" + TestCase);
                    NullTestCasesFlag = false;
                }
                if (TestCasePassHighLevelFlag == false) {
                    ruleAnalytics.recordSummary("" + TestCase, Order, EqnUnderTest, Exprn, StrexpSimpleExpressMap1, EqnSolArrayMap1[Order], StrexpDiffExpress, EqnSolArrayDiffAlone[Order], StrexpSimpleExpressMap2, EqnSolArrayMap2[Order], TestCasePassHighLevelFlag, TestCasePassStrFlag, TestCasePassValFlag, TestCasePassConformalValFlag);
                    break;
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
                if ((TestCaseFailCoarseReportingFlag == false) && (Temp != null) && (!Temp.equalsIgnoreCase("")) && (!Temp.contains("Section"))) {
                    HashVal = Temp + "," + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag;
                } else if (TestCaseFailCoarseReportingFlag == false) {
                    HashVal = "TestCase=" + TestCase + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag;
                } else if ((TestCaseFailCoarseReportingFlag == true) && (Order == 1)) {
                    HashVal = Temp;
                } else if ((TestCaseFailCoarseReportingFlag == true)) {
                    HashVal = Temp;
                }
                FailedTestCases.put(MaxIndexFail, HashVal);
                String Temp1 = ExceptionTestCases.get(MaxIndexExcept);
                String HashVal1 = "";
                if ((Temp1 != null) && (!Temp1.equalsIgnoreCase(""))) {
                    HashVal1 = Temp1 + "," + ":Order=" + (Order);
                } else {
                    HashVal1 = "TestCase=" + TestCase + ":Order=" + (Order);
                }
                ExceptionTestCases.put(MaxIndexExcept, HashVal1);
                MaxIndexExcept++;
                TestCasePassHighLevelFlag = false;
                break;
            }
        }
        System.out.print(System.lineSeparator());

    }

    public static void IntegralHighSingleTest(int MaxOrder1, String Exprn, String MapType, String IntegrORDiffr, String xExprnOptionSelected) {
        Map<String, Double> variables = new HashMap<>();
        SimpleExpression expSimpleMap1 = (() -> "");
        Expression expValue = (() -> Double.NaN);;
        SimpleExpression expSimpleMap2 = (() -> "");
        DiffrIntegrSep.IntegrExpr exp = (() -> "");
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
        for (double x = 1.0, y = 7; Order < MaxOrder1; y++, Order++) {
            try {
                TestCasePassStrFlag = false;
                TestCasePassValFlag = false;
                TestCasePassConformalValFlag = false;
                ReturnFlagMap1 = false;
                ReturnFlagDiff = false;
                ReturnFlagMap2 = false;
                //Exprn="x*2.0^x"; //2035
                //Exprn= "x^2.0*sin(x)"; // 80034
                //Exprn="x^8.0*(5*x+2)"; //80058
                //Exprn= "x*sin(x)" ;//80062
                //Exprn= "x^2.0*sin(x)" ;//80062
                Exprn = eatAll(Exprn, ' ');
                variables.put(DiffWithRespTo, x);
                variables.put("y", y);
                SetVariablesAll();
                variables.put(Constant, 5.0);
                StageMapping = "Basic Mapping";
                MapType = "Map1";
                //System.out.println("main: " + DiffWithRespTo + "=" + x + " Exprn=" + Exprn + " Order=" + myOrder);
                ChaosPrevention();
                System.out.println(ConsoleColors.BLUE + "main:MAP1 START VERBOSE IF SET" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.BLUE + "main:MAP1 START VERBOSE IF SET" + ConsoleColors.RESET);
                if (Trace.contains("Map1")) {
                    SetDevFlags(true, "Silent", false);
                } else {
                    SetDevFlags(false, "Silent", false);
                }
                if ((Trace.contains("Map1")) && (AITestResultsGenFlag)) {
                    SetDevFlagsAI(true, "Silent", false);
                } else if (AITestResultsGenFlag) {
                    SetDevFlagsAI(false, "Silent", false);
                }
                expSimpleMap1 = parseSimple(Exprn, variables, DiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
                StrexpSimpleExpressMap1 = expSimpleMap1.SimpleExpr();
                //System.out.println("main: " + DiffWithRespTo + "=" + x + " After Map1:Basic Simple Exprn=" + StrexpSimpleExpressMap1);
                System.out.println(ConsoleColors.BLUE + "main:MAP1 END VERBOSE IF SET" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.BLUE + "main:MAP1 END VERBOSE IF SET" + ConsoleColors.RESET);
                expValue = parse(Exprn, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                ExprnexpValue = expValue.eval();
                System.out.println(" main:Result(Expn Value)=" + ExprnexpValue + "  x=" + x + " " + DiffWithRespTo + "=" + x);
                expValue = parse(StrexpSimpleExpressMap1, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpValueMap1 = expValue.eval();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Basic Simple (Exprn Value)=" + DblexpValueMap1);
                //WrongAnsProcessIntegreMap1(Exprn);

                StageMapping = "Integration";
                System.out.println(ConsoleColors.BLUE + "main:Integration VERBOSE IF SET" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.BLUE + "main:Integration VERBOSE IF SET" + ConsoleColors.RESET);
                exp = DiffrIntegrSep.parseIntegr(StrexpSimpleExpressMap1, variables, DiffWithRespTo, MapType, IntegrORDiffr);
                StrexpDiffExpress = exp.IntegrExpr();
                //System.out.println(" main:Result(Integral Equation)(" + Order + " th order)=> " + StrexpDiffExpress);
                //' Convert Both Answers to POSITIVE DOMAIN as For Nominal Answer of -23.0 , -24 or -22 is allowed
                if ((DblexpValueMap1 < 0) && (ExprnexpValue < 0)) {
                    DblexpValueMap1 = DblexpValueMap1 * -1.0;
                    ExprnexpValue = ExprnexpValue * -1.0;
                }
                StageMapping = "Integration Mapping";
                MapType = "Map2";
                ChaosPrevention();
                System.out.println(ConsoleColors.BLUE + "main:MAP2 START VERBOSE IF SET" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.BLUE + "main:MAP2 START VERBOSE IF SET" + ConsoleColors.RESET);
                if (Trace.contains("Map2")) {
                    SetDevFlags(true, "Silent", false);
                } else {
                    SetDevFlags(false, "Silent", false);
                }
                if ((Trace.contains("Map2")) && (AITestResultsGenFlag)) {
                    SetDevFlagsAI(true, "Silent", false);
                } else if (AITestResultsGenFlag) {
                    SetDevFlagsAI(false, "Silent", false);
                }
                expSimpleMap2 = parseSimple(StrexpDiffExpress, variables, DiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
                StrexpSimpleExpressMap2 = expSimpleMap2.SimpleExpr();
                //System.out.println(" main:Result(Simplified Integral Equation)(" + Order + " th order)=> " + StrexpSimpleExpressMap2);
                System.out.println(ConsoleColors.BLUE + "main:MAP2 END VERBOSE IF SET" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.BLUE + "main:MAP2 END VERBOSE IF SET" + ConsoleColors.RESET);
                expValue = parse(StrexpDiffExpress, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Info);
                DblexpDiffValue = expValue.eval();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Result(Integral Value)=" + DblexpDiffValue);
                expValue = parse(StrexpSimpleExpressMap2, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Info);
                DblexpValueMap2 = expValue.eval();
                //WrongAnsProcessIntegreMap2();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Result(Simplified Integral Value)=" + expValue.eval());
                if (PassFailTestCaseString(TestCase, Order, "Integre", Exprn, StrexpSimpleExpressMap1, StrexpDiffExpress, StrexpSimpleExpressMap2, EqnUnderTest, EqnSolArrayMap3[Order], EqnSolArrayIntegrAlone[Order], EqnSolArrayMap4[Order], "", "", xExprnOptionSelected)) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass STRING TEST Complete" + ConsoleColors.RESET);
                    TestCasePassStrFlag = true;
                } else if ((ReturnFlagMap1 == true) && (ReturnFlagMap2 == true) && (ReturnFlagDiff == false)) {
                    System.out.println(ConsoleColors.BLUE + " main:Test Case Status=" + "Pass STRING TEST Weak Pass" + ConsoleColors.RESET);
                    TestCasePassStrFlag = true;
                } else if ((InvertAnsIfNecessaryFlag) && (FlipUtils.PassFailInvertAnsString(TestCase, Order, MaxOrder1, "Integre", DiffWithRespTo, Exprn, StrexpSimpleExpressMap1, StrexpDiffExpress, StrexpSimpleExpressMap2, EqnUnderTest, EqnSolArrayMap3[Order], EqnSolArrayIntegrAlone[Order], EqnSolArrayMap4[Order], ReturnFlagMap1, ReturnFlagDiff, ReturnFlagMap2))) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass STRING TEST Complete" + ConsoleColors.RESET);
                    TestCasePassStrFlag = true;
                    FlippedBothTestCases.put(MaxBothFlipIndexPass, "" + TestCase + " Order=" + Order + ",");
                    MaxBothFlipIndexPass++;
                    if (Order == (MaxOrder1 - 1)) {
                        InvertAnsBothFlippedCount++;
                        SectionAnsBothFlippedCount++;
                    }
                } else {
                    TestCasePassStrFlag = false;
                    if (TestCasePassHighLevelFlag == true) {
                        TestCasePassHighLevelFlag = false;
                    }
                    System.out.println(ConsoleColors.RED + " ReturnFlagMap1=" + ReturnFlagMap1 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " ReturnFlagDiff=" + ReturnFlagDiff + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " ReturnFlagMap2=" + ReturnFlagMap2 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " TestCasePassStrFlag=" + TestCasePassStrFlag + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " TestCasePassHighLevelFlag=" + TestCasePassHighLevelFlag + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Fail STRING TEST Complete" + ConsoleColors.RESET);

                }

                if (PassFailTestCaseValueStrict(TestCase, Order, MaxOrder1, "Integre", Exprn, ExprnexpValue, DblexpValueMap1, DblexpDiffValue, DblexpValueMap2, StrexpDiffExpress, variables, x)) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass VALUE TEST CompletePragma:Strict" + ConsoleColors.RESET);
                    TestCasePassValFlag = true;
                    //TestCasePassHighLevelFlag = true;
                } else {
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Fail VALUE TEST Strict Complete" + ConsoleColors.RESET);
                }
                //if ((TestCasePassStrFlag == true) || (TestCasePassValFlag == true)) {
                TestCasePassConformalValFlag = ConformalMapTestCaseIntegr(TestCase, Order, Exprn, expSimpleMap1.SimpleExpr(), exp.IntegrExpr(), expSimpleMap2.SimpleExpr(), EqnSolArrayMap3[Order], EqnSolArrayIntegrAlone[Order], EqnSolArrayMap4[Order], variables, DiffWithRespTo);
                //}
                //                if ((TestCasePassValFlag != true) && (PassFailTestCaseValueEasy(TestCase, Order, "Integre", Exprn, ExprnexpValue, DblexpValueMap1, DblexpDiffValue, DblexpValueMap2, StrexpDiffExpress, variables, x))) {
//                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass VALUE TEST Complete:Pragma:Loose" + ConsoleColors.RESET);
//                    TestCasePassValFlag = true;
//                }
                if (TestCasePassConformalValFlag == true) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass Conformal Map TEST" + ConsoleColors.RESET);
                } else if ((TestCasePassStrFlag != true) || (TestCasePassValFlag != true)) {
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Conformal Map TEST Not Executed" + ConsoleColors.RESET);
                } else if (TestCasePassConformalValFlag == false) {
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "FAIL Conformal Map TEST " + ConsoleColors.RESET);
                }
                if ((TestCasePassStrFlag == true) /* && (TestCasePassValFlag == true) && (TestCasePassConformalValFlag == true)*/) {
                    TestCasePassHighLevelFlag = true;//DO Nothing as Test Cases Passes
                } else if (!((TestCasePassStrFlag == true) && (TestCasePassValFlag == true) && (TestCasePassConformalValFlag == true))) {
                    String Temp = FailedTestCases.get(MaxIndexFail);
                    String HashVal = "";
                    String HashVal1 = "";
                    if ((Temp != null) && (!Temp.equalsIgnoreCase(""))) {
                        HashVal1 = Temp + "," + ":Order=" + (Order);
                    } else {
                        HashVal1 = "TestCase=" + TestCase + ":Order=" + (Order);
                    }
                    FailedTestCases.put(MaxIndexFail, HashVal1);
                    //i=MaxOrder1;
                    TestCasePassHighLevelFlag = false;
                } else if (Pragma.equalsIgnoreCase("Easy")) {
                    TestCasePassHighLevelFlag = true;
                }
                if (!FailTestCaseStringDiagnostic(TestCase, Order, MaxOrder1, "Integre", Exprn, StrexpSimpleExpressMap1, StrexpDiffExpress, StrexpSimpleExpressMap2, EqnUnderTest, EqnSolArrayMap3[Order], EqnSolArrayIntegrAlone[Order], EqnSolArrayMap4[Order])) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Diagnostic Complete" + ConsoleColors.RESET);
                }
                if ((TestCasePassHighLevelFlag == false) && (Order == (MaxOrder1 - 1))
                        && (EqnSolArrayMap4[Order - 1].equalsIgnoreCase("")) && (EqnSolArrayMap3[Order - 1].equalsIgnoreCase(""))
                        && ((StrexpSimpleExpressMap1.equalsIgnoreCase("")) || (StrexpDiffExpress.equalsIgnoreCase("")) || (StrexpSimpleExpressMap2.equalsIgnoreCase("")))
                        && (KnownIssueTestCasesFlag == false) && (CoreKnownIssuesTestCasesFlag == false)) {
                    NullTestCasesFlag = true;
                    if (!NullTestCasesFlag) {
                        FailedTestCount++;
                    }
                    TestCasePassHighLevelFlag = false;
                    NullTestCases++;
                    NULLStrTestCases.put(NullTestCases, "" + TestCase);
                    NullTestCasesFlag = false;
                }
                if (TestCasePassHighLevelFlag == false) {
                    ruleAnalytics.recordSummary("" + TestCase, Order, EqnUnderTest, Exprn, StrexpSimpleExpressMap1, EqnSolArrayMap3[Order], StrexpDiffExpress, EqnSolArrayIntegrAlone[Order], StrexpSimpleExpressMap2, EqnSolArrayMap4[Order], TestCasePassHighLevelFlag, TestCasePassStrFlag, TestCasePassValFlag, TestCasePassConformalValFlag);
                    break;
                }
                if ((StrexpSimpleExpressMap2.contains("ln")) && ((Order + 1) < MaxOrder1) && (UsageCalculus.MaxIntegreOrder > (Order + 1))) {
                    Order = MaxOrder1;
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
                if ((TestCaseFailCoarseReportingFlag == false) && (Temp != null) && (!Temp.equalsIgnoreCase("")) && (!Temp.contains("Section"))) {
                    HashVal = Temp + "," + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag;
                } else if ((TestCaseFailCoarseReportingFlag == false)) {
                    HashVal = "TestCase=" + TestCase + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag;
                } else if ((TestCaseFailCoarseReportingFlag == true) && (Order == 1)) {
                    HashVal = Temp;
                } else {
                    HashVal = Temp;
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
                TestCasePassHighLevelFlag = false;
                break;
            }
        }
        System.out.print(System.lineSeparator());
    }

    public static void DiffSingleHighTestCase2(int MaxOrder1, String Exprn, String MapType, String IntegrORDiffr, String xExprnOptionSelected) {
        Map<String, Double> variables = new HashMap<>();
        MathsContxtLAv.SimpleExpression expSimpleMap1 = (() -> "");
        MathsExpressionParser.Expression expValue = (() -> Double.NaN);
        MathsContxtLAv.SimpleExpression expSimpleMap2 = (() -> "");
        DiffrIntegrSep.DiffExpr exp = (() -> "");
        DiffrIntegrSep.IntegrExpr expIntegre = (() -> "");
        MyFuncExpress();
        MyFuncDiff();
        MyFuncSimple();

        String Constant = "C";

        String StrexpSimpleExpressMap1 = "";
        String StrexpDiffExpress = "";
        String StrexpIntegreExpress = "";
        String StrexpSimpleExpressMap2 = "";
        String myOrder = "";

        double ExprnexpValue = 0;
        double ExprnexpValue1 = 0;
        double DblexpValueMap1 = 0;
        double DblexpDiffValue = 0;
        double DblexpValueMap2 = 0;
        double DblexpValueMap3 = 0;

        StageMapping = "";
        Order = 1;

        System.out.println(ConsoleColors.YELLOW + "Test Case " + TestCase + " EndTestCase=" + EndTestCase + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case " + TestCase + " TestCaseFile=" + TestCaseFile + " Section=" + Section + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Exprn=" + Exprn + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case Name=" + TestCaseName + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case Name=" + TestCaseMatrixID + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Regression Status : Test Case should be " + EqnRegressionDiffStatus + ConsoleColors.RESET);

        for (double x = 1.0, y = 7.0; (Order < MaxOrder1) && (Order < 2); y++, /*x++,*/ Order++) {
            try {
                TestCasePassStrFlag = false;
                TestCasePassValFlag = false;
                TestCasePassConformalValFlag = false;
                ReturnFlagMap1 = false;
                ReturnFlagDiff = false;
                ReturnFlagMap2 = false;
                Exprn = eatAll(Exprn, ' ');
                variables.put(DiffWithRespTo, x);
                variables.put("y", y);
                SetVariablesAll();
                variables.put(Constant, 5.0);
                StageMapping = "Basic Mapping";
                MapType = "Map1";
                if (Trace.contains("Map1")) {
                    SetDevFlags(true, "Silent", false);
                } else {
                    SetDevFlags(false, "Silent", false);
                }
                //if (!DetailedFailureSummaryAloneFlag) {
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Exprn=" + Exprn + " Order=" + myOrder);
                //}
                ChaosPrevention();
                //if (!DetailedFailureSummaryAloneFlag) {
                System.out.println(ConsoleColors.BLUE + "main:MAP1 START VERBOSE IF SET" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.BLUE + "main:MAP1 START VERBOSE IF SET" + ConsoleColors.RESET);
                //}
                expSimpleMap1 = parseSimple(Exprn, variables, DiffWithRespTo, "Map1", IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
                StrexpSimpleExpressMap1 = expSimpleMap1.SimpleExpr();
                //if (!DetailedFailureSummaryAloneFlag) {
                System.out.println("main: " + DiffWithRespTo + "=" + x + " After Map1:Basic Simple Exprn=" + StrexpSimpleExpressMap1);
                System.out.println(ConsoleColors.BLUE + "main:MAP1 END VERBOSE IF SET" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.BLUE + "main:MAP1 END VERBOSE IF SET" + ConsoleColors.RESET);
                //}
                expValue = parse(Exprn, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                ExprnexpValue = expValue.eval();
                System.out.println(" main:Expn Value=" + ExprnexpValue + "  x=" + x + " " + DiffWithRespTo + "=" + x + " Exprn=" + Exprn);
                expValue = parse(StrexpSimpleExpressMap1, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpValueMap1 = expValue.eval();
                //' Convert Both Answers to POSITIVE DOMAIN as For Nominal Answer of -23.0 , -24 or -22 is allowed
                if ((DblexpValueMap1 < 0) && (ExprnexpValue < 0)) {
                    DblexpValueMap3 = DblexpValueMap1 * -1.0;
                    ExprnexpValue1 = ExprnexpValue * -1.0;
                }
                ///WrongAnsDiffrMap1(MaxOrder1);
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Basic Simple (Result) (Exprn Value)=" + DblexpValueMap1 + " StrexpSimpleExpressMap1=" + StrexpSimpleExpressMap1);
                StageMapping = "Differentiation";
                System.out.println(ConsoleColors.BLUE + "main:Differentiation VERBOSE IF SET" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.BLUE + "main:Differentiation VERBOSE IF SET" + ConsoleColors.RESET);
                exp = DiffrIntegrSep.parseDiff(StrexpSimpleExpressMap1, variables, DiffWithRespTo, MapType, IntegrORDiffr);
                StrexpDiffExpress = exp.DiffExpr();
                System.out.println(" main:Result(Diff Equation)(" + Order + " th order)=> " + StrexpDiffExpress);
                StageMapping = "Integration";
                System.out.println(ConsoleColors.BLUE + "main:Integration VERBOSE IF SET" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.BLUE + "main:Integration VERBOSE IF SET" + ConsoleColors.RESET);
                expIntegre = DiffrIntegrSep.parseIntegr(StrexpSimpleExpressMap1, variables, DiffWithRespTo, MapType, IntegrORDiffr);
                StrexpIntegreExpress = expIntegre.IntegrExpr();
                System.out.println(" main:Result(Diff Equation)(" + Order + " th order)=> " + StrexpDiffExpress);
                StageMapping = "Differentiation Mapping";
                MapType = "Map2";
                ChaosPrevention();
                System.out.println(ConsoleColors.BLUE + " main:Test Case Status=" + " MAP2 START VERBOSE IF SET" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.BLUE + " main:Test Case Status=" + " MAP2 START VERBOSE IF SET" + ConsoleColors.RESET);
                if (Trace.contains("Map2")) {
                    SetDevFlags(true, "Silent", false);
                } else {
                    SetDevFlags(false, "Silent", false);
                }
                System.out.println(ConsoleColors.BLUE + " main:Test Case Status=" + " StrexpDiffExpress=" + StrexpDiffExpress + ConsoleColors.RESET);
                expSimpleMap2 = parseSimple(StrexpDiffExpress, variables, DiffWithRespTo, "Map2", IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
                StrexpSimpleExpressMap2 = expSimpleMap2.SimpleExpr();
                System.out.println(ConsoleColors.BLUE + " main:Test Case Status=" + " MAP2 END VERBOSE IF SET" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.BLUE + " main:Test Case Status=" + " MAP2 END VERBOSE IF SET" + ConsoleColors.RESET);
                expValue = parse(StrexpDiffExpress, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpDiffValue = expValue.eval();
//                WrongAnswerFlagCalculus1 = false;
//                if (Order == 1) {
//                    WrongAnswerCalculus1(EqnSolArrayDiffAlone[Order], variables, EqnSolArrayMap2[Order]);
//                    if ((WrongAnswerFlagCalculus1 == true)) {
//                        WrongAnswerCountCalculus1++;
//                        System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "WRONG ANSWER MAP2" + ConsoleColors.RESET);
//                        System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given Answe2(EqnSolArrayDiffAlone[Order])=" + EqnSolArrayDiffAlone[Order] + ConsoleColors.RESET);
//                        System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given AnswerMap(EqnSolArrayMap2[Order])=" + EqnSolArrayMap2[Order] + ConsoleColors.RESET);
//                        WrongAnsTestCasesCalculus1.put(MaxIndexWrongAnsCalculus1, TestCase + " ,");
//                        MaxIndexWrongAnsCalculus1++;
//                    }
//                }
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Result(Diff Value)=" + DblexpDiffValue);
                //System.out.println(" main:Result(Simplified Diff Equation)(" + Order + " th order)=> " + StrexpSimpleExpressMap2);
                expValue = parse(StrexpSimpleExpressMap2, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpValueMap2 = expValue.eval();
                //WrongAnsDiffrMap2();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Result(Simplified Diff Value)=" + expValue.eval());
                System.out.print(System.lineSeparator());

//                if ((StrexpSimpleExpressMap1==null) ||(StrexpSimpleExpressMap1.equalsIgnoreCase(""))||((StrexpDiffExpress==null) ||(StrexpDiffExpress.equalsIgnoreCase("")) ) ||(StrexpSimpleExpressMap2==null) ||(StrexpSimpleExpressMap2.equalsIgnoreCase("")) ){
//                    TestCasePassHighLevelFlag = false;
//                }else 
                if (PassFailTestCaseString(TestCase, Order, "Diff", Exprn, StrexpSimpleExpressMap1, StrexpDiffExpress, StrexpSimpleExpressMap2, EqnUnderTest, EqnSolArrayMap1[Order], EqnSolArrayDiffAlone[Order], EqnSolArrayMap2[Order], StrexpIntegreExpress, EqnSolArrayIntegrAlone[Order], xExprnOptionSelected)) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass STRING TEST Complete" + ConsoleColors.RESET);
                    TestCasePassStrFlag = true;
                } else if ((ReturnFlagMap1 == true) && (ReturnFlagMap2 == true) && (ReturnFlagDiff == false)) {
                    System.out.println(ConsoleColors.BLUE + " main:Test Case Status=" + "Pass STRING TEST Weak Pass" + ConsoleColors.RESET);
                    TestCasePassStrFlag = true;
                } else if ((InvertAnsIfNecessaryFlag) && (FlipUtils.PassFailInvertAnsString(TestCase, Order, MaxOrder1, "Diff", DiffWithRespTo, Exprn, StrexpSimpleExpressMap1, StrexpDiffExpress, StrexpSimpleExpressMap2, EqnUnderTest, EqnSolArrayMap1[Order], EqnSolArrayDiffAlone[Order], EqnSolArrayMap2[Order], ReturnFlagMap1, ReturnFlagDiff, ReturnFlagMap2))) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass STRING TEST Complete" + ConsoleColors.RESET);
                    TestCasePassStrFlag = true;
                    FlippedBothTestCases.put(MaxBothFlipIndexPass, "" + TestCase + " Order=" + Order + ",");
                    MaxBothFlipIndexPass++;
                    SectionAnsBothFlippedCount++;
                    InvertAnsBothFlag = true;
                    if (Order == (MaxOrder1 - 1)) {
                        InvertAnsBothFlippedCount++;
                    }
                } else {
                    TestCasePassStrFlag = false;
                    if (TestCasePassHighLevelFlag == true) {
                        TestCasePassHighLevelFlag = false;
                    }
                    System.out.println(ConsoleColors.RED + " ReturnFlagMap1=" + ReturnFlagMap1 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " ReturnFlagDiff=" + ReturnFlagDiff + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " ReturnFlagMap2=" + ReturnFlagMap2 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " TestCasePassStrFlag=" + TestCasePassStrFlag + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " TestCasePassHighLevelFlag=" + ReturnFlagMap2 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "FAIL STRING TEST Complete" + ConsoleColors.RESET);

                }
                variables.put(DiffWithRespTo, x);
                variables.put("y", y);
                variables.put("a", 1.0);
                variables.put("b", 2.0);//variables.put("b", 0.0);
                variables.put("c", -1.0);
                variables.put("d", 2.0);
                variables.put("m", -1.0);
                variables.put("p", 3.0);
                variables.put("q", 0.0);
                variables.put("r", -1.0);
                variables.put("s", 2.0);
                variables.put("i", 1.0);
                variables.put("E1", 1.0);
                if (PassFailTestCaseValueStrict2(TestCase, Order, MaxOrder1, "Diff", Exprn, ExprnexpValue, DblexpValueMap1, DblexpDiffValue, DblexpValueMap2, StrexpDiffExpress, variables, x)) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass VALUE TEST Strict Complete:Pragma:" + Pragma + ConsoleColors.RESET);
                    TestCasePassValFlag = true;
                    //TestCasePassHighLevelFlag = true;
                } else {

                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Fail VALUE TEST Strict Complete" + " Stale Answer" + ConsoleColors.RESET);
                    TestCasePassValFlag = false;
                    TestCasePassHighLevelFlag = false;
                }
                if ((TestCasePassStrFlag == true) || (TestCasePassValFlag == true)) {
                    variables.put(DiffWithRespTo, x);
                    variables.put("y", y);
                    variables.put("a", 1.0);
                    variables.put("b", 2.0);//variables.put("b", 0.0);
                    variables.put("c", -1.0);
                    variables.put("d", 2.0);
                    variables.put("m", -1.0);
                    variables.put("p", 3.0);
                    variables.put("q", 0.0);
                    variables.put("r", -1.0);
                    variables.put("s", 2.0);
                    variables.put("i", 1.0);
                    variables.put("E1", 1.0);
                    TestCasePassConformalValFlag = ConformalMapTestCaseDiff(TestCase, Order, Exprn, expSimpleMap1.SimpleExpr(), exp.DiffExpr(), expSimpleMap2.SimpleExpr(), EqnSolArrayMap1[Order], EqnSolArrayDiffAlone[Order], EqnSolArrayMap1[Order], variables, DiffWithRespTo);
                }
//                if ((TestCasePassValFlag != true) && (PassFailTestCaseValueEasy(TestCase, Order, "Diff", Exprn, ExprnexpValue, DblexpValueMap1, DblexpDiffValue, DblexpValueMap2, StrexpDiffExpress, variables, x))) {
//                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass VALUE TEST Complete:Pragma:Loose" + ConsoleColors.RESET);
//                    TestCasePassValFlag = true;
//                }
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
                } else if (!((TestCasePassStrFlag == true) && (TestCasePassValFlag == true) && (TestCasePassConformalValFlag == true))) {
                    String Temp = FailedTestCases.get(MaxIndexFail);
                    String HashVal = "";
                    String HashVal1 = "";
                    if ((Temp != null) && (!Temp.equalsIgnoreCase(""))) {
                        HashVal1 = Temp + "," + ":Order=" + (Order);
                    } else {
                        HashVal1 = "TestCase=" + TestCase + ":Order=" + (Order);
                    }
                    FailedTestCases.put(MaxIndexFail, HashVal1);
                    //i=MaxOrder1;
                    TestCasePassHighLevelFlag = false;
                } else if ((Pragma.equalsIgnoreCase("Easy"))) {
                    TestCasePassHighLevelFlag = true;
                }
                if (!FailTestCaseStringDiagnostic(TestCase, Order, MaxOrder1, "Diff", Exprn, StrexpSimpleExpressMap1, StrexpDiffExpress, StrexpSimpleExpressMap2, EqnUnderTest, EqnSolArrayMap1[Order], EqnSolArrayDiffAlone[Order], EqnSolArrayMap2[Order])) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Diagnostic Complete" + ConsoleColors.RESET);
                }
                if ((TestCasePassHighLevelFlag == false) && (Order == (MaxOrder1 - 1))
                        && (EqnSolArrayMap1[Order - 1].equalsIgnoreCase("")) && (EqnSolArrayMap2[Order - 1].equalsIgnoreCase(""))
                        && ((StrexpSimpleExpressMap1.equalsIgnoreCase("")) || (StrexpDiffExpress.equalsIgnoreCase("")) || (StrexpSimpleExpressMap2.equalsIgnoreCase("")))
                        && (KnownIssueTestCasesFlag == false) && (CoreKnownIssuesTestCasesFlag == false)) {
                    NullTestCasesFlag = true;
                    if (!NullTestCasesFlag) {
                        FailedTestCount++;
                    }
                    TestCasePassHighLevelFlag = false;
                    NullTestCases++;
                    NULLStrTestCases.put(NullTestCases, "" + TestCase);
                    NullTestCasesFlag = false;
                }
                if (TestCasePassHighLevelFlag == false) {
                    ruleAnalytics.recordSummary("" + TestCase, Order, EqnUnderTest, Exprn, StrexpSimpleExpressMap1, EqnSolArrayMap1[Order], StrexpDiffExpress, EqnSolArrayDiffAlone[Order], StrexpSimpleExpressMap2, EqnSolArrayMap2[Order], TestCasePassHighLevelFlag, TestCasePassStrFlag, TestCasePassValFlag, TestCasePassConformalValFlag);
                    break;
                }
                Exprn = EqnSolArrayMap1[Order + 1];

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
                if ((TestCaseFailCoarseReportingFlag == false) && (Temp != null) && (!Temp.equalsIgnoreCase("")) && (!Temp.contains("Section"))) {
                    HashVal = Temp + "," + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag;
                } else if (TestCaseFailCoarseReportingFlag == false) {
                    HashVal = "TestCase=" + TestCase + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag;
                } else if ((TestCaseFailCoarseReportingFlag == true) && (Order == 1)) {
                    HashVal = Temp;
                } else if ((TestCaseFailCoarseReportingFlag == true)) {
                    HashVal = Temp;
                }
                FailedTestCases.put(MaxIndexFail, HashVal);
                String Temp1 = ExceptionTestCases.get(MaxIndexExcept);
                String HashVal1 = "";
                if ((Temp1 != null) && (!Temp1.equalsIgnoreCase(""))) {
                    HashVal1 = Temp1 + "," + ":Order=" + (Order);
                } else {
                    HashVal1 = "TestCase=" + TestCase + ":Order=" + (Order);
                }
                ExceptionTestCases.put(MaxIndexExcept, HashVal1);
                MaxIndexExcept++;
                TestCasePassHighLevelFlag = false;
                break;
            }
        }
        System.out.print(System.lineSeparator());

    }

    public static void IntegralHighSingleTest2(int MaxOrder1, String Exprn, String MapType, String IntegrORDiffr, String xExprnOptionSelected) {
        Map<String, Double> variables = new HashMap<>();
        SimpleExpression expSimpleMap1 = (() -> "");
        Expression expValue = (() -> Double.NaN);;
        SimpleExpression expSimpleMap2 = (() -> "");
        DiffrIntegrSep.IntegrExpr exp = (() -> "");
        DiffrIntegrSep.DiffExpr expDiffrExpr = (() -> "");
        MyFuncExpress();
        MyFuncIntegr();
        MyFuncSimple();

        String Constant = "C";
        String StrexpSimpleExpressMap1 = "";
        String StrexpDiffExpress = "";
        String StrexpIntegreExpress = "";
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
        for (double x = 1.0, y = 7; (Order < MaxOrder1) && (Order < 2); y++, Order++) {
            try {
                TestCasePassStrFlag = false;
                TestCasePassValFlag = false;
                TestCasePassConformalValFlag = false;
                ReturnFlagMap1 = false;
                ReturnFlagDiff = false;
                ReturnFlagMap2 = false;
                Exprn = eatAll(Exprn, ' ');
                variables.put(DiffWithRespTo, x);
                variables.put("y", y);
                SetVariablesAll();
                variables.put(Constant, 5.0);
                StageMapping = "Basic Mapping";
                MapType = "Map1";
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Exprn=" + Exprn + " Order=" + myOrder);
                ChaosPrevention();
                System.out.println(ConsoleColors.BLUE + "main:MAP1 START VERBOSE IF SET" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.BLUE + "main:MAP1 START VERBOSE IF SET" + ConsoleColors.RESET);
                if (Trace.contains("Map1")) {
                    SetDevFlags(true, "Silent", false);
                } else {
                    SetDevFlags(false, "Silent", false);
                }
                if ((Trace.contains("Map1")) && (AITestResultsGenFlag)) {
                    SetDevFlagsAI(true, "Silent", false);
                } else if (AITestResultsGenFlag) {
                    SetDevFlagsAI(false, "Silent", false);
                }
                expSimpleMap1 = parseSimple(Exprn, variables, DiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
                StrexpSimpleExpressMap1 = expSimpleMap1.SimpleExpr();
                //System.out.println("main: " + DiffWithRespTo + "=" + x + " After Map1:Basic Simple Exprn=" + StrexpSimpleExpressMap1);
                System.out.println(ConsoleColors.BLUE + "main:MAP1 END VERBOSE IF SET" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.BLUE + "main:MAP1 END VERBOSE IF SET" + ConsoleColors.RESET);
                expValue = parse(Exprn, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                ExprnexpValue = expValue.eval();
                System.out.println(" main:Result(Expn Value)=" + ExprnexpValue + "  x=" + x + " " + DiffWithRespTo + "=" + x);
                expValue = parse(StrexpSimpleExpressMap1, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpValueMap1 = expValue.eval();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Basic Simple (Exprn Value)=" + DblexpValueMap1);
                //WrongAnsProcessIntegreMap1(Exprn);

                StageMapping = "Integration";
                System.out.println(ConsoleColors.BLUE + "main:Integration VERBOSE IF SET" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.BLUE + "main:Integration VERBOSE IF SET" + ConsoleColors.RESET);
                exp = DiffrIntegrSep.parseIntegr(StrexpSimpleExpressMap1, variables, DiffWithRespTo, MapType, IntegrORDiffr);
                StrexpDiffExpress = exp.IntegrExpr();
                System.out.println(" main:Result(Integral Equation)(" + Order + " th order)=> " + StrexpDiffExpress);
                //' Convert Both Answers to POSITIVE DOMAIN as For Nominal Answer of -23.0 , -24 or -22 is allowed
                if ((DblexpValueMap1 < 0) && (ExprnexpValue < 0)) {
                    DblexpValueMap1 = DblexpValueMap1 * -1.0;
                    ExprnexpValue = ExprnexpValue * -1.0;
                }
                StageMapping = "Differentiation";
                System.out.println(ConsoleColors.BLUE + "main:Differentiation VERBOSE IF SET" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.BLUE + "main:Differentiation VERBOSE IF SET" + ConsoleColors.RESET);
                expDiffrExpr = DiffrIntegrSep.parseDiff(StrexpSimpleExpressMap1, variables, DiffWithRespTo, MapType, IntegrORDiffr);
                StrexpIntegreExpress = expDiffrExpr.DiffExpr();
                System.out.println(" main:Result(Diff Equation)(" + Order + " th order)=> " + StrexpDiffExpress);
                StageMapping = "Differentiation Mapping";
                MapType = "Map2";
                ChaosPrevention();
                System.out.println(ConsoleColors.BLUE + "main:MAP2 START VERBOSE IF SET" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.BLUE + "main:MAP2 START VERBOSE IF SET" + ConsoleColors.RESET);
                if (Trace.contains("Map2")) {
                    SetDevFlags(true, "Silent", false);
                } else {
                    SetDevFlags(false, "Silent", false);
                }
                if ((Trace.contains("Map2")) && (AITestResultsGenFlag)) {
                    SetDevFlagsAI(true, "Silent", false);
                } else if (AITestResultsGenFlag) {
                    SetDevFlagsAI(false, "Silent", false);
                }
                expSimpleMap2 = parseSimple(StrexpDiffExpress, variables, DiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
                StrexpSimpleExpressMap2 = expSimpleMap2.SimpleExpr();
                System.out.println(" main:Result(Simplified Integral Equation)(" + Order + " th order)=> " + StrexpSimpleExpressMap2);
                System.out.println(ConsoleColors.BLUE + "main:MAP2 END VERBOSE IF SET" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.BLUE + "main:MAP2 END VERBOSE IF SET" + ConsoleColors.RESET);
                expValue = parse(StrexpDiffExpress, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Info);
                DblexpDiffValue = expValue.eval();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Result(Integral Value)=" + DblexpDiffValue);
                expValue = parse(StrexpSimpleExpressMap2, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Info);
                DblexpValueMap2 = expValue.eval();
                //WrongAnsProcessIntegreMap2();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Result(Simplified Integral Value)=" + expValue.eval());
                if (PassFailTestCaseString(TestCase, Order, "Integre", Exprn, StrexpSimpleExpressMap1, StrexpDiffExpress, StrexpSimpleExpressMap2, EqnUnderTest, EqnSolArrayMap3[Order], EqnSolArrayIntegrAlone[Order], EqnSolArrayMap4[Order], StrexpIntegreExpress, EqnSolArrayDiffAlone[Order], xExprnOptionSelected)) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass STRING TEST Complete" + ConsoleColors.RESET);
                    TestCasePassStrFlag = true;
                } else if ((ReturnFlagMap1 == true) && (ReturnFlagMap2 == true) && (ReturnFlagDiff == false)) {
                    System.out.println(ConsoleColors.BLUE + " main:Test Case Status=" + "Pass STRING TEST Weak Pass" + ConsoleColors.RESET);
                    TestCasePassStrFlag = true;
                } else if ((InvertAnsIfNecessaryFlag) && (FlipUtils.PassFailInvertAnsString(TestCase, Order, MaxOrder1, "Integre", DiffWithRespTo, Exprn, StrexpSimpleExpressMap1, StrexpDiffExpress, StrexpSimpleExpressMap2, EqnUnderTest, EqnSolArrayMap3[Order], EqnSolArrayIntegrAlone[Order], EqnSolArrayMap4[Order], ReturnFlagMap1, ReturnFlagDiff, ReturnFlagMap2))) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass STRING TEST Complete" + ConsoleColors.RESET);
                    TestCasePassStrFlag = true;
                    FlippedBothTestCases.put(MaxBothFlipIndexPass, "" + TestCase + " Order=" + Order + ",");
                    MaxBothFlipIndexPass++;
                    if (Order == (MaxOrder1 - 1)) {
                        InvertAnsBothFlippedCount++;
                        SectionAnsBothFlippedCount++;
                    }
                } else {
                    TestCasePassStrFlag = false;
                    if (TestCasePassHighLevelFlag == true) {
                        TestCasePassHighLevelFlag = false;
                    }
                    System.out.println(ConsoleColors.RED + " ReturnFlagMap1=" + ReturnFlagMap1 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " ReturnFlagDiff=" + ReturnFlagDiff + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " ReturnFlagMap2=" + ReturnFlagMap2 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " TestCasePassStrFlag=" + TestCasePassStrFlag + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " TestCasePassHighLevelFlag=" + TestCasePassHighLevelFlag + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Fail STRING TEST Complete" + ConsoleColors.RESET);

                }

                if (PassFailTestCaseValueStrict2(TestCase, Order, MaxOrder1, "Integre", Exprn, ExprnexpValue, DblexpValueMap1, DblexpDiffValue, DblexpValueMap2, StrexpDiffExpress, variables, x)) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass VALUE TEST CompletePragma:Strict" + ConsoleColors.RESET);
                    TestCasePassValFlag = true;
                    //TestCasePassHighLevelFlag = true;
                } else {
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Fail VALUE TEST Strict Complete" + ConsoleColors.RESET);
                }
                //if ((TestCasePassStrFlag == true) || (TestCasePassValFlag == true)) {
                TestCasePassConformalValFlag = ConformalMapTestCaseIntegr(TestCase, Order, Exprn, expSimpleMap1.SimpleExpr(), exp.IntegrExpr(), expSimpleMap2.SimpleExpr(), EqnSolArrayMap3[Order], EqnSolArrayIntegrAlone[Order], EqnSolArrayMap3[Order], variables, DiffWithRespTo);
                //}
                //                if ((TestCasePassValFlag != true) && (PassFailTestCaseValueEasy(TestCase, Order, "Integre", Exprn, ExprnexpValue, DblexpValueMap1, DblexpDiffValue, DblexpValueMap2, StrexpDiffExpress, variables, x))) {
//                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass VALUE TEST Complete:Pragma:Loose" + ConsoleColors.RESET);
//                    TestCasePassValFlag = true;
//                }
                if (TestCasePassConformalValFlag == true) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass Conformal Map TEST" + ConsoleColors.RESET);
                } else if ((TestCasePassStrFlag != true) || (TestCasePassValFlag != true)) {
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Conformal Map TEST Not Executed" + ConsoleColors.RESET);
                } else if (TestCasePassConformalValFlag == false) {
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "FAIL Conformal Map TEST " + ConsoleColors.RESET);
                }
                if ((TestCasePassStrFlag == true) /* && (TestCasePassValFlag == true) && (TestCasePassConformalValFlag == true)*/) {
                    TestCasePassHighLevelFlag = true;//DO Nothing as Test Cases Passes
                } else if (!((TestCasePassStrFlag == true) && (TestCasePassValFlag == true) && (TestCasePassConformalValFlag == true))) {
                    String Temp = FailedTestCases.get(MaxIndexFail);
                    String HashVal = "";
                    String HashVal1 = "";
                    if ((Temp != null) && (!Temp.equalsIgnoreCase(""))) {
                        HashVal1 = Temp + "," + ":Order=" + (Order);
                    } else {
                        HashVal1 = "TestCase=" + TestCase + ":Order=" + (Order);
                    }
                    FailedTestCases.put(MaxIndexFail, HashVal1);
                    //i=MaxOrder1;
                    TestCasePassHighLevelFlag = false;
                } else if (Pragma.equalsIgnoreCase("Easy")) {
                    TestCasePassHighLevelFlag = true;
                }
                if (!FailTestCaseStringDiagnostic(TestCase, Order, MaxOrder1, "Integre", Exprn, StrexpSimpleExpressMap1, StrexpDiffExpress, StrexpSimpleExpressMap2, EqnUnderTest, EqnSolArrayMap3[Order], EqnSolArrayIntegrAlone[Order], EqnSolArrayMap4[Order])) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Diagnostic Complete" + ConsoleColors.RESET);
                }
                if ((TestCasePassHighLevelFlag == false) && (Order == (MaxOrder1 - 1))
                        && (EqnSolArrayMap4[Order - 1].equalsIgnoreCase("")) && (EqnSolArrayMap3[Order - 1].equalsIgnoreCase(""))
                        && ((StrexpSimpleExpressMap1.equalsIgnoreCase("")) || (StrexpDiffExpress.equalsIgnoreCase("")) || (StrexpSimpleExpressMap2.equalsIgnoreCase("")))
                        && (KnownIssueTestCasesFlag == false) && (CoreKnownIssuesTestCasesFlag == false)) {
                    NullTestCasesFlag = true;
                    if (!NullTestCasesFlag) {
                        FailedTestCount++;
                    }
                    TestCasePassHighLevelFlag = false;
                    NullTestCases++;
                    NULLStrTestCases.put(NullTestCases, "" + TestCase);
                    NullTestCasesFlag = false;
                }
                if (TestCasePassHighLevelFlag == false) {
                    ruleAnalytics.recordSummary("" + TestCase, Order, EqnUnderTest, Exprn, StrexpSimpleExpressMap1, EqnSolArrayMap3[Order], StrexpDiffExpress, EqnSolArrayIntegrAlone[Order], StrexpSimpleExpressMap2, EqnSolArrayMap4[Order], TestCasePassHighLevelFlag, TestCasePassStrFlag, TestCasePassValFlag, TestCasePassConformalValFlag);
                    break;
                }
                if ((StrexpSimpleExpressMap2.contains("ln")) && ((Order + 1) < MaxOrder1) && (UsageCalculus.MaxIntegreOrder > (Order + 1))) {
                    Order = MaxOrder1;
                }
                Exprn = EqnSolArrayMap3[Order + 1];
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
                if ((TestCaseFailCoarseReportingFlag == false) && (Temp != null) && (!Temp.equalsIgnoreCase("")) && (!Temp.contains("Section"))) {
                    HashVal = Temp + "," + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag;
                } else if ((TestCaseFailCoarseReportingFlag == false)) {
                    HashVal = "TestCase=" + TestCase + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag;
                } else if ((TestCaseFailCoarseReportingFlag == true) && (Order == 1)) {
                    HashVal = Temp;
                } else {
                    HashVal = Temp;
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
                TestCasePassHighLevelFlag = false;
                break;
            }
        }
        System.out.print(System.lineSeparator());
    }

    public static void SetVariablesAll() {
        variables.put("a", 1.0);
        variables.put("b", 2.0);//variables.put("b", 0.0);
        variables.put("c", -1.0);
        variables.put("d", 2.0);
        variables.put("m", -1.0);
        variables.put("p", 3.0);
        variables.put("q", 0.0);
        variables.put("r", -1.0);
        variables.put("s", 2.0);
        variables.put("i", 1.0);
        variables.put("E1", 1.0);
        variables.put("ab",2.0);
        variables.put("ac",3.0);
        variables.put("ad",3.1);
        variables.put("am",2.1);
        variables.put("ap",7.0);
        variables.put("aq",9.0);
        variables.put("ar",5.0);
        variables.put("as",6.1);
        variables.put("ai",1.0);
    }

    public static void SetVariablesAllAutomatic() {
        variables.put("zy6", 6.0);
        variables.put("a20", 3.0);
        variables.put("x5", 7.0);
        variables.put("cc3", 1.0);
        variables.put("xyx", 3.0);
        variables.put("b3", 8.0);
        variables.put("z2", 2.0);
        variables.put("zy44", 6.0);
        variables.put("a", 4.0);
        variables.put("aa8", 5.0);
        variables.put("xz6", 4.0);
        variables.put("z8", 2.0);
        variables.put("cdd38", 8.0);
        variables.put("a27", 1.0);
        variables.put("x8", 5.0);
        variables.put("xz22", 8.0);
        variables.put("cc7", 9.0);
        variables.put("ab",2.0);
        variables.put("ac",3.0);
        variables.put("ad",3.1);
        variables.put("am",2.1);
        variables.put("ap",7.0);
        variables.put("aq",9.0);
        variables.put("ar",5.0);
        variables.put("as",6.1);
        variables.put("ai",1.0);
    }

    public static void mainRegresssionPredicate(TestHarnessClass TestData) {
        String Exprn = "";
        String OverallRegressionStatus = "Diff:Pass All (100 to 110007) Except Test Cases: "
                + "\n" + "TestCases:Unit Test Cases" + " All Passing"
                + "\n" + "TestCases:Names " + " All Passing"
                + "\n" + "TestCases:Coefficients " + " 20016 , 20017"
                + "\n" + "TestCases:Exponent " + " 30006 to 30008"
                + "\n" + "TestCases:Parentheses " + " 80001 to 80024";
        System.out.print(ConsoleColors.BLUE + "Diff Overall Regression Status" + OverallRegressionStatus + ConsoleColors.RESET);
        System.out.print(System.lineSeparator());
        long j = TestCase;
        FailedTestCases = new HashMap<Integer, String>();
        ExceptionTestCases = new HashMap<Integer, String>();
        TotalTestCases = 0;
        MaxIndexExcept = 0;
        MaxIndexFail = 0;
        SectionIndexFail = 1;
        FailedTestCount = 0;
        while (j <= EndTestCase) {
            EqnUnderTest = "";
            String TempExprn = "";
            TempExprn = TestHarnessPredicate("Predicate", (int) j);
            if ((!UserTestPredicate.equalsIgnoreCase("")) && (TempExprn != null) && (!TempExprn.equalsIgnoreCase(""))) {
                Exprn = eatAll(TempExprn, ' ');
            }
            TotalTestCases++;
            Exprn = eatAll(Exprn, ' ');
            TestCasePassHighLevelFlag = true;
            PredicateSingleHighTestCase(Exprn);
            j = RegressionControlPredicate(j);
            TestCase = j;
            //System.out.println(ConsoleColors.RED +"mainDiffTest: j="+ j + " TestCase=" + TestCase);
            if (TestCasePassHighLevelFlag == false) {
                MaxIndexFail++;
                FailedTestCount++;
            }
        }
        System.out.println(ConsoleColors.RED + "mainRegresssionPredicate: TestCase Summary : Total Failed=" + FailedTestCount + " Out of Run TestCases=" + TotalTestCases + " Failed Test Cases are:" + ConsoleColors.RESET);
        for (int y = 0; y < MaxIndexFail; y++) {
            System.out.print(ConsoleColors.RED + " " + FailedTestCases.get(y) + ", " + ConsoleColors.RESET);
            if ((y != 0) && (y % 5 == 0)) {
                System.out.print(System.lineSeparator());
            }
        }
        System.out.print(System.lineSeparator());
        System.out.println(ConsoleColors.RED + "mainRegresssionPredicate: Exception TestCase Summary : Total Exceptions=" + MaxIndexExcept + " Exception Test Cases are:" + ConsoleColors.RESET);
        for (int y = 0; y < MaxIndexExcept; y++) {
            System.out.print(ConsoleColors.RED + " " + ExceptionTestCases.get(y) + ", " + ConsoleColors.RESET);
            if ((y != 0) && (y % 5 == 0)) {
                System.out.print(System.lineSeparator());
            }
        }
        System.out.print(System.lineSeparator());
    }

    public static void PredicateSingleHighTestCase(String Exprn) {
        Map<String, Double> variables = new HashMap<>();
        //String Exprn = TestPredicate();
        String DiffWithRespTo = "x";
        PredicateSep.PredicateBool expValue;

        MyFuncExpress();
        Exprn = eatAll(Exprn, ' ');

        String StageMapping = "";
        int Order = 1;
        System.out.println(ConsoleColors.YELLOW + "Test Case " + TestCase + " EndTestCase=" + EndTestCase + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case " + TestCase + " Exprn=" + Exprn + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case Name=" + TestCaseName + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case Name=" + TestCaseMatrixID + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Regression Status : Test Case should be " + EqnRegressionDiffStatus + ConsoleColors.RESET);

        for (double x = 0, y = 0; Order < 10; y++, x++, Order++) {
            try {
                TestCasePassStrFlag = false;
                TestCasePassValFlag = false;
                variables.put(DiffWithRespTo, x);
                variables.put("y", y);
                variables.put("a", 1.0);
                variables.put("b", 2.0);//variables.put("b", 0.0);
                variables.put("c", -1.0);
                variables.put("d", 2.0);
                variables.put("p", 3.0);
                variables.put("q", 0.0);
                variables.put("r", -1.0);
                variables.put("s", 2.0);
                StageMapping = "Basic Mapping";
                System.out.println("mainMathPredicate: x=" + x + " y=" + y + " Exprn=" + Exprn);
                expValue = PredicateSep.parsePredicate(Exprn, variables, "Silent", MathsContxtLAv.LogLevel.Off);
                System.out.println(" mainMathPredicate:Result(Logical Value)=" + expValue.eval());
                System.out.print(System.lineSeparator());

            } catch (Exception MyException) {

            }
        }
        System.out.print(System.lineSeparator());

    }

    public static String TestHarnessPredicate(String AlgoName, int j) {
        if ((j >= 100) && (j <= 107)) {
            TestHarnessPredicate.SanityTestCases(AlgoName, j);
        } else if ((j >= 200) && (j <= 227)) {
            TestHarnessPredicate.UnitTestCases(AlgoName, j);
        }

        return UserTestPredicate;
    }

    public static long RegressionControlPredicate(long j) {
        if ((j >= 100) && (j < 107)) {
            j++;
        } else if ((j >= 200) && (j < 228)) {
            j++;
        } //Bypass Gaps Section
        else if ((j < 100)) {
            j = 100;
        } else if ((j == 107)) {
            j = 200;
        } else if ((j == 228)) {
            j = 5019;
        } else {
            System.out.println(ConsoleColors.RED + "RegressionControlPredicate:j= " + j + ": Infinite Loop" + ConsoleColors.RESET);
        }
        return j;

    }

    public static void GapProcess(String AlgoName, long CurrentTestCase, long OldTotalTestCases, long OldTestCase, int OldMaxIndexFail, int OldFailedTestCount, int OldDups, int OldKnwnI, int DupsCur, int OldInvertAnsBothFlippedCount,int OldInvertAnsFlippedCount) {
        String SpacePad = "";
        int i = 0;
        for (; (i < Section.length()); i++) {
            if ((Section != null) && (Section.charAt(i) != ' ')) {
                SpacePad = SpacePad + (char) Section.charAt(i);
            } else {
                SpacePad = SpacePad + (char) ' ';
            }
        }
        for (; i < 28; i++) {
            SpacePad += (char) ' ';
        }
        if (TestCase == SectionTestCaseEnd) {
            String Temp = FailedTestCases.get(MaxIndexFail);
            FailedTestCases.put(MaxIndexFail, Temp + "\n");
            if (DoNOTSkipSectionFlag==true){
            FailedTestCases.put(MaxIndexFail + 1, "Section " + SpacePad + " Complete" + " # of Failures=" + (FailedTestCount - OldFailedTestCount) 
                    + " Out of=" + (SectionTestCaseEnd - SectionTestCaseStart + 1) + " Test Cases. KnwnI=" + (OldKnwnI) + " Dups=" + (DupsCur - OldDups) 
                    + ":Start=" + SectionTestCaseStart + ":End=" + SectionTestCaseEnd + ": TestCaseFile=" + TestCaseFile + " in Section "
                    //+ " FlipMap1=" + InvertAnsFlippedMap1StrCount 
                    //+ " FlipCalcu=" + InvertAnsFlippedCalcuStrCount 
                    //+ " FlipMap2=" + InvertAnsFlippedMap2StrCount
                    //+ " BothFlipdMap1=" + InvertAnsBothFlippedMap1StrCount 
                    //+ " BothFlipCalcu=" + InvertAnsBothFlippedCalcuStrCount 
                    //+ " BothFlipMap2=" + InvertAnsBothFlippedMap2StrCount
                    + " \n");
            }else {
                FailedTestCases.put(MaxIndexFail + 1, "Section " + SpacePad + " Complete" + " # of Failures=" + (FailedTestCount - OldFailedTestCount) 
                    + " Out of=" + (SectionTestCaseEnd - SectionTestCaseStart + 1) + " Test Cases. KnwnI=" + (OldKnwnI) + " Dups=" + (DupsCur - OldDups) 
                    + ":Start=" + SectionTestCaseStart + ":End=" + SectionTestCaseEnd + ": TestCaseFile=" + TestCaseFile + " in Section "
                    + " SECTION DID NOT RUN \n");
            }
            MaxIndexFail++;
            MaxIndexFail++;
            Temp = FlippedBothTestCases.get(MaxBothFlipIndexPass);
            FlippedBothTestCases.put(MaxBothFlipIndexPass, Temp + "\n");
            FlippedBothTestCases.put(MaxBothFlipIndexPass + 1, "Section " + SpacePad + " Complete # of Both Flips=" + (SectionAnsBothFlippedCount) 
                    + " TestCase=" + SectionTCBothFlippedCount
                    + " Out of=" + (SectionTestCaseEnd - SectionTestCaseStart + 1) + " Test Cases. \n");
            MaxBothFlipIndexPass++;
            MaxBothFlipIndexPass++;
            
            Temp = FlippedInvTestCases.get(MaxAnsFlipIndexPass);
            FlippedInvTestCases.put(MaxAnsFlipIndexPass, Temp + "\n");
            FlippedInvTestCases.put(MaxAnsFlipIndexPass + 1, "Section " + SpacePad + " Complete" + " # of Flips=" + (SectionAnsFlippedCount ) 
                    + " TestCase=" + SectionTCFlippedCount
                    + " Out of=" + (SectionTestCaseEnd - SectionTestCaseStart + 1) + " Test Cases. \n");
            MaxAnsFlipIndexPass++;
            MaxAnsFlipIndexPass++;
            
            SectionAnsFlippedCount=0;
            SectionAnsBothFlippedCount=0;
            
            SectionTCFlippedCount=0;
            SectionTCBothFlippedCount=0;
        
            InvertAnsFlippedMap1StrCount = 0;
            InvertAnsFlippedCalcuStrCount = 0;
            InvertAnsFlippedMap2StrCount = 0;
    
            InvertAnsBothFlippedMap1StrCount = 0;
            InvertAnsBothFlippedCalcuStrCount = 0;
            InvertAnsBothFlippedMap2StrCount = 0;
            
            Temp = StaleAnsTestCases.get(MaxStaleAns);
            StaleAnsTestCases.put(MaxStaleAns, Temp + "\n");
            if (DoNOTSkipSectionFlag==true){
            StaleAnsTestCases.put(MaxStaleAns + 1, "Section " + SpacePad + " Complete # of Stale Ans=" + (LowLevelSectionStaleAnsCount) 
                    + " TestCase=" + SectionStaleAnsCount
                    + " Out of=" + (SectionTestCaseEnd - SectionTestCaseStart + 1) + " Test Cases. \n" );
            }else {
             StaleAnsTestCases.put(MaxStaleAns + 1, "Section " + SpacePad + " Complete # of Stale Ans=" + (LowLevelSectionStaleAnsCount) 
                    + " TestCase=" + SectionStaleAnsCount
                    + " Out of=" + (SectionTestCaseEnd - SectionTestCaseStart + 1) + " Test Cases." + " SECTION DID NOT RUN.\n" );
            }
            MaxStaleAns++;
            MaxStaleAns++;
            SectionStaleAnsCount=0;
            LowLevelSectionStaleAnsCount=0;
            
            Temp = FailAnsTestCases.get(MaxFailAns);
            FailAnsTestCases.put(MaxFailAns, Temp + "\n");
            if (DoNOTSkipSectionFlag==true){
            FailAnsTestCases.put(MaxStaleAns + 1, "Section " + SpacePad + " Complete # of Stale Ans=" + (LowLevelSectionStaleAnsCount) 
                    + " TestCase=" + SectionStaleAnsCount
                    + " Out of=" + (SectionTestCaseEnd - SectionTestCaseStart + 1) + " Test Cases. \n" );
            }else {
             FailAnsTestCases.put(MaxStaleAns + 1, "Section " + SpacePad + " Complete # of Stale Ans=" + (LowLevelSectionStaleAnsCount) 
                    + " TestCase=" + SectionStaleAnsCount
                    + " Out of=" + (SectionTestCaseEnd - SectionTestCaseStart + 1) + " Test Cases." + " SECTION DID NOT RUN.\n" );
            }
            MaxFailAns++;
            MaxFailAns++;
            SectionFailAnsCount=0;
            LowLevelSectionFailAnsCount=0;
        }
    }


    public static void mainRegresssionAlgebra(TestHarnessClass TestData) {
        String Exprn = "";
        long j = TestCase;
        FailedTestCases = new HashMap<Integer, String>();
        ExceptionTestCases = new HashMap<Integer, String>();
        TotalTestCases = 0;
        MaxIndexExcept = 0;
        MaxIndexFail = 0;
        SectionIndexFail = 1;
        FailedTestCount = 0;
        while (j <= EndTestCase) {
            EqnUnderTest = "";
            String TempExprn = "";
            Exprn = "";
            TempExprn = TestHarnessAlgebra("Algebra", (int) j);
            if ((!EqnUnderTest.equalsIgnoreCase("")) && (TempExprn != null) && (!TempExprn.equalsIgnoreCase(""))) {
                Exprn = eatAll(TempExprn, ' ');
            }
            TotalTestCases++;
            Exprn = eatAll(Exprn, ' ');
            TestCasePassHighLevelFlag = true;
            AlgebraSingleHighTestCase(Exprn);
            j = RegressionControlAlgebra((int) j);
            TestCase = j;
            //System.out.println(ConsoleColors.RED +"mainDiffTest: j="+ j + " TestCase=" + TestCase);
            if (TestCasePassHighLevelFlag == false) {
                MaxIndexFail++;
                FailedTestCount++;
            }
        }
        System.out.println(ConsoleColors.RED + "mainRegresssionAlgebra: TestCase Summary : Total Failed=" + FailedTestCount + " Out of Run TestCases=" + TotalTestCases + " Failed Test Cases are:" + ConsoleColors.RESET);
        for (int y = 0; y < MaxIndexFail; y++) {
            System.out.print(ConsoleColors.RED + " " + FailedTestCases.get(y) + ", " + ConsoleColors.RESET);
            if ((y != 0) && (y % 5 == 0)) {
                System.out.print(System.lineSeparator());
            }
        }
        System.out.print(System.lineSeparator());
        System.out.println(ConsoleColors.RED + "mainRegresssionAlgebra: Exception TestCase Summary : Total Exceptions=" + MaxIndexExcept + " Exception Test Cases are:" + ConsoleColors.RESET);
        for (int y = 0; y < MaxIndexExcept; y++) {
            System.out.print(ConsoleColors.RED + " " + ExceptionTestCases.get(y) + ", " + ConsoleColors.RESET);
            if ((y != 0) && (y % 5 == 0)) {
                System.out.print(System.lineSeparator());
            }
        }
        System.out.print(System.lineSeparator());
    }

    public static void AlgebraSingleHighTestCase(String Exprn) {
        Map<String, Double> variables = new HashMap<>();
        String DiffWithRespTo = "x";
        SimpleAlgebraSep.SimpleAlgebra expValue;
        SimpleExpression expSimple;
        MyFuncExpress();
        String MapType = "Map1";
        String IntegrORDiffr = "Diffr";
        Exprn = eatAll(Exprn, ' ');
        EqnUnderTest2 = eatAll(EqnUnderTest2, ' ');
        String StageMapping = "";
        System.out.println(ConsoleColors.YELLOW + "Test Case " + TestCase + " EndTestCase=" + EndTestCase + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case " + TestCase + " Exprn=" + Exprn + " Exprn2=" + EqnUnderTest2 + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case Name=" + TestCaseName + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case Name=" + TestCaseMatrixID + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Regression Status : Test Case should be " + EqnRegressionDiffStatus + ConsoleColors.RESET);
        Double x = 0.0;
        Double y = 0.0;
        try {
            TestCasePassStrFlag = false;
            TestCasePassValFlag = false;
            variables.put(DiffWithRespTo, x);
            variables.put("y", y);
            variables.put("a", 1.0);
            variables.put("b", 2.0);//variables.put("b", 0.0);
            variables.put("c", -1.0);
            variables.put("d", 2.0);
            variables.put("p", 3.0);
            variables.put("q", 0.0);
            variables.put("r", -1.0);
            variables.put("s", 2.0);
            StageMapping = "Basic Mapping";
            System.out.println("mainMathAlgebra: Exprn=" + Exprn + " EqnUnderTest2=" + UsageCalculus.EqnUnderTest2);
            expValue = SimpleAlgebraSep.parseAlgebra(Exprn, UsageCalculus.EqnUnderTest2, "*", variables, DiffWithRespTo);
            expSimple = parseSimple(expValue.Algebra(), variables, DiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
            if (expSimple.SimpleExpr().equalsIgnoreCase(UsageCalculus.UserTestAnswer)) {
                TestCasePassStrFlag = true;
                TestCasePassHighLevelFlag = true;
                System.out.println(ConsoleColors.GREEN + " mainMathAlgebra:Result=" + expSimple.SimpleExpr() + ConsoleColors.RESET);
                System.out.println(ConsoleColors.GREEN + " mainMathAlgebra:Answer=" + UsageCalculus.UserTestAnswer + ConsoleColors.RESET);
            } else {
                System.out.println(ConsoleColors.RED + " mainMathAlgebra:Result=" + expSimple.SimpleExpr() + ConsoleColors.RESET);
                System.out.println(ConsoleColors.RED + " mainMathAlgebra:Answer=" + UsageCalculus.UserTestAnswer + ConsoleColors.RESET);
                TestCasePassStrFlag = false;
                TestCasePassHighLevelFlag = false;
            }
            System.out.print(System.lineSeparator());

        } catch (Exception MyException) {
        }
        System.out.print(System.lineSeparator());

    }

    public static String TestHarnessAlgebra(String AlgoName, int j) {
        if ((j >= 100) && (j <= 107)) {
            TestHarnessAlgebra.SanityTestCases(AlgoName, j);
        } else if ((j >= 200) && (j <= 225)) {
            TestHarnessAlgebra.UnitTestCases(AlgoName, j);
        }

        return EqnUnderTest;
    }

    public static int RegressionControlAlgebra(int j) {
        if ((j >= 100) && (j < 107)) {
            j++;
        } else if ((j >= 200) && (j < 225)) {
            j++;
        } //Bypass Gaps Section
        else if ((j < 100)) {
            j = 100;
        } else if ((j == 107)) {
            j = 200;
        } else if ((j == 225)) {
            j = 5019;
        } else {
            System.out.println(ConsoleColors.RED + "RegressionControlPredicate:j= " + j + ": Infinite Loop" + ConsoleColors.RESET);
        }
        return j;

    }

    public static void ResetTestCase() {

        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "";
        UsageCalculus.TestCaseName = "";
        UsageCalculus.TestCaseMatrixID = "";

        UsageCalculus.DiffWithRespTo = "";
        UsageCalculus.MaxDiffOrder = 0;
        UsageCalculus.MaxIntegreOrder = 0;

        UsageCalculus.EqnSolArrayMap1[1] = "";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "";
        UsageCalculus.EqnSolArrayMap2[1] = "";
        UsageCalculus.EqnSolArrayMap3[1] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "";
        UsageCalculus.EqnSolArrayMap4[1] = "";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "";
        UsageCalculus.EqnSolArrayMap4[2] = "";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "";
        UsageCalculus.EqnSolArrayMap4[3] = "";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "";
        UsageCalculus.EqnSolArrayMap4[4] = "";
        UsageCalculus.EqnSolOrder[4] = 4;

        UsageCalculus.EqnSolArrayMap1[5] = "";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "";
        UsageCalculus.EqnSolArrayMap2[5] = "";
        UsageCalculus.EqnSolArrayMap3[5] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
        UsageCalculus.EqnSolArrayMap4[5] = "";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "";
        UsageCalculus.EqnSolArrayMap2[6] = "";
        UsageCalculus.EqnSolArrayMap3[6] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
        UsageCalculus.EqnSolArrayMap4[6] = "";
        UsageCalculus.EqnSolOrder[6] = 6;

        UsageCalculus.EqnSolArrayMap1[7] = "";
        UsageCalculus.EqnSolArrayDiffAlone[7] = "";
        UsageCalculus.EqnSolArrayMap2[7] = "";
        UsageCalculus.EqnSolArrayMap3[7] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
        UsageCalculus.EqnSolArrayMap4[7] = "";
        UsageCalculus.EqnSolOrder[7] = 7;

        UsageCalculus.EqnSolArrayMap1[8] = "";
        UsageCalculus.EqnSolArrayDiffAlone[8] = "";
        UsageCalculus.EqnSolArrayMap2[8] = "";
        UsageCalculus.EqnSolOrder[8] = 8;

        UsageCalculus.EqnSolArrayMap1[9] = "";
        UsageCalculus.EqnSolArrayDiffAlone[9] = "";
        UsageCalculus.EqnSolArrayMap2[9] = "";
        UsageCalculus.EqnSolOrder[9] = 9;

        UsageCalculus.EqnSolArrayMap1[10] = "";
        UsageCalculus.EqnSolArrayDiffAlone[10] = "";
        UsageCalculus.EqnSolArrayMap2[10] = "";
        UsageCalculus.EqnSolOrder[10] = 10;

        UsageCalculus.EqnSolArrayMap1[11] = "";
        UsageCalculus.EqnSolArrayDiffAlone[11] = "";
        UsageCalculus.EqnSolArrayMap2[11] = "";
        UsageCalculus.EqnSolOrder[11] = 11;

        UsageCalculus.EqnSolArrayMap1[12] = "";
        UsageCalculus.EqnSolArrayDiffAlone[12] = "";
        UsageCalculus.EqnSolArrayMap2[12] = "";
        UsageCalculus.EqnSolOrder[12] = 12;

        UsageCalculus.EqnSolArrayMap1[13] = "";
        UsageCalculus.EqnSolArrayDiffAlone[13] = "";
        UsageCalculus.EqnSolArrayMap2[13] = "";
        UsageCalculus.EqnSolOrder[13] = 13;

        UsageCalculus.EqnSolArrayMap1[14] = "";
        UsageCalculus.EqnSolArrayDiffAlone[14] = "";
        UsageCalculus.EqnSolArrayMap2[14] = "";
        UsageCalculus.EqnSolOrder[14] = 14;
    }

    public static void PalinDiffSingleHighTestCase(int MaxOrder1, String Exprn, int TestCase1, int TestCase2, int Operator) {
        Map<String, Double> variables = new HashMap<>();
        Map<String, String> variablesDiff = new HashMap<>();
        Exprn = eatAll(Exprn, ' ');
        SimpleExpression expSimple;
        Expression expValue;
        DiffrIntegrSep.DiffExpr exp;
        OrderVar expOrder;

        MyFuncExpress();
        MyFuncDiff();
        MyFuncSimple();
        String MapType = "Map1";
        String IntegrORDiffr = "Diffr";
        String Constant = "C";

        String StrexpSimpleExpressMap1 = "";
        String StrexpDiffExpress = "";
        String StrexpSimpleExpressMap2 = "";
        String myOrder = "";

        double ExprnexpValue = 0;
        double DblexpValueMap1 = 0;
        double DblexpDiffValue = 0;
        double DblexpValueMap2 = 0;

        String StageMapping = "";
        int Order = 1;
        System.out.println(ConsoleColors.YELLOW + "Test Case " + TestCase1 + " TestCase2=" + TestCase2 + " Operator=" + (char) Operator + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + " Exprn=" + Exprn + ConsoleColors.RESET);

        for (double x = 0, y = 7; Order < MaxOrder1; y++, x++, Order++) {
            try {
                TestCasePassStrFlag = false;
                TestCasePassValFlag = false;
                variables.put(DiffWithRespTo, x);
                variables.put("y", y);
                variables.put("a", 1.0);
                variables.put("b", 2.0);//variables.put("b", 0.0);
                variables.put("c", -1.0);
                variables.put("d", 2.0);
                variables.put("p", 3.0);
                variables.put("q", 0.0);
                variables.put("r", -1.0);
                variables.put("s", 2.0);
                variables.put(Constant, 5.0);
                StageMapping = "Basic Mapping";
                expOrder = parseOrder(Exprn, DiffWithRespTo, "Silent", MathsContxtLAv.LogLevel.Info);
                myOrder = expOrder.eval();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Exprn=" + Exprn + " Order=" + myOrder);
                expSimple = parseSimple(Exprn, variables, DiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
                StrexpSimpleExpressMap1 = expSimple.SimpleExpr();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Basic Simple Exprn=" + StrexpSimpleExpressMap1);

                expValue = parse(StrexpSimpleExpressMap1, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                ExprnexpValue = expValue.eval();
                System.out.println(" main:Result(Expn Value)=" + ExprnexpValue);

                expValue = parse(StrexpSimpleExpressMap1, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpValueMap1 = expValue.eval();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Basic Simple (Exprn Value)=" + DblexpValueMap1);
                StageMapping = "Differentiation";
                exp = DiffrIntegrSep.parseDiff(StrexpSimpleExpressMap1, variables, DiffWithRespTo, MapType, IntegrORDiffr);
                StrexpDiffExpress = exp.DiffExpr();
                System.out.println(" main:Result(Diff Equation)(" + Order + " th order)=> " + StrexpDiffExpress);
                StageMapping = "Differentiation Mapping";
                expSimple = parseSimple(StrexpDiffExpress, variables, DiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
                StrexpSimpleExpressMap2 = expSimple.SimpleExpr();
                expValue = parse(StrexpDiffExpress, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpDiffValue = expValue.eval();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Result(Diff Value)=" + DblexpDiffValue);
                System.out.println(" main:Result(Simplified Diff Equation)(" + Order + " th order)=> " + StrexpSimpleExpressMap2);
                expValue = parse(StrexpSimpleExpressMap2, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpValueMap2 = expValue.eval();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Result(Simplified Diff Value)=" + expValue.eval());
                //Usage.FInverseEqn=FInverseLagrangeBurmann( Exprn, DiffWithRespTo, MaxOrder1,x, "",  "", '/', 12);

                //Usage.FInverseEqn = FInverseLagrangeBurmannLowLevel(Exprn, DiffWithRespTo, MaxOrder1, x, 10.0, "", "", '/', 4);
                //System.out.println("main: FInverse:" + "x" + "=" + UsageCalculus.FInverseEqn);
                System.out.print(System.lineSeparator());
                if (PassFailTestCaseStringPalinSame(TestCase1, Order, "Diff", Exprn, Operator, StrexpSimpleExpressMap1, StrexpDiffExpress, StrexpSimpleExpressMap2, EqnUnderTest, EqnSolArrayMap1[Order], EqnSolArrayDiffAlone[Order], EqnSolArrayMap2[Order])) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass STRING TEST Complete" + ConsoleColors.RESET);
                    TestCasePassStrFlag = true;
                } else {
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "FAIL STRING TEST Complete" + ConsoleColors.RESET);
                    if (TestCasePassHighLevelFlag == true) {
                        TestCasePassHighLevelFlag = false;
                    }
                }

                if (PassFailTestCaseValuePalinSame(TestCase1, Order, "Diff", Exprn, Operator, ExprnexpValue, DblexpValueMap1, DblexpDiffValue, DblexpValueMap2, variables)) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass VALUE TEST Complete" + ConsoleColors.RESET);
                    TestCasePassValFlag = true;
                } else {
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "FAIL VALUE TEST Complete" + ConsoleColors.RESET);
                    if (TestCasePassHighLevelFlag == true) {
                        TestCasePassHighLevelFlag = false;
                    }
                }
                if ((TestCasePassStrFlag == true) && (TestCasePassValFlag == true)) {
                    System.out.println(ConsoleColors.BLUE + "Super Test Answer Checks" + ConsoleColors.RESET);
                }
                if ((TestCasePassStrFlag == true) && (TestCasePassValFlag == true)) {
                    ;//DO Nothing as Test Cases Passes
                } else {
                    String Temp = FailedTestCases.get(MaxIndexFail);
                    String HashVal = "";
                    if ((Temp != null) && (!Temp.equalsIgnoreCase("")) && (!Temp.contains("Section"))) {
                        HashVal = Temp + "," + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag;
                    } else {
                        HashVal = "TestCase=" + TestCase + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag;
                    }
                    FailedTestCases.put(MaxIndexFail, HashVal);
                    //i=MaxOrder1;
                    TestCasePassHighLevelFlag = false;
                }
                Exprn = StrexpSimpleExpressMap2;
                System.out.print(System.lineSeparator());
            } catch (Exception MyException) {
                System.out.print(System.lineSeparator());
                System.out.print(System.lineSeparator());
                MyException.printStackTrace();
                System.out.println(ConsoleColors.RED + "TestCase " + TestCase + " Failed at Order=" + Order + " due to Exception at Stage=" + StageMapping + "." + ConsoleColors.RESET);
                System.out.print(System.lineSeparator());
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

    public static void PalinIntegralSingleHighTestCase(int MaxOrder1, String Exprn, int TestCase1, int TestCase2, int Operator) {
        Map<String, Double> variables = new HashMap<>();
        Map<String, String> variablesDiff = new HashMap<>();
        Exprn = eatAll(Exprn, ' ');
        SimpleExpression expSimple;
        Expression expValue;
        DiffrIntegrSep.IntegrExpr exp;
        OrderVar expOrder;

        MyFuncExpress();
        MyFuncDiff();
        MyFuncSimple();
        String MapType = "Map1";
        String IntegrORDiffr = "Diffr";
        String Constant = "C";
        String StrexpSimpleExpressMap1 = "";
        String StrexpDiffExpress = "";
        String StrexpSimpleExpressMap2 = "";
        String myOrder = "";
        double ExprnexpValue = 0;
        double DblexpValueMap1 = 0;
        double DblexpDiffValue = 0;
        double DblexpValueMap2 = 0;
        int Order = 1;
        System.out.println(ConsoleColors.BLUE + "Test Case " + TestCase + " Exprn=" + Exprn + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case Name=" + TestCaseName + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case Name=" + TestCaseMatrixID + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Integral Regression Status : Test Case should be " + EqnRegressionIntegreStatus + ConsoleColors.RESET);
        Order = 1;
        String StageMapping = "";
        variablesDiff.put(DiffWithRespTo, DiffWithRespTo);

        for (double x = 0, y = 7; Order < MaxOrder1; y++, /*x++,*/ Order++) {
            try {
                TestCasePassStrFlag = false;
                TestCasePassValFlag = false;
                variables.put(DiffWithRespTo, x);
                variables.put("y", y);
                variables.put("a", 1.0);
                variables.put("b", 2.0);//variables.put("b", 0.0);
                variables.put("c", -1.0);
                variables.put("d", 2.0);
                variables.put("p", 1.0);
                variables.put("q", 0.0);
                variables.put("r", -1.0);
                variables.put("s", 2.0);
                variables.put(Constant, 5.0);
                StageMapping = "Basic Mapping";
                expOrder = parseOrder(Exprn, DiffWithRespTo, "Silent", MathsContxtLAv.LogLevel.Info);
                myOrder = expOrder.eval();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Exprn=" + Exprn + " Order=" + myOrder);
                expSimple = parseSimple(Exprn, variables, DiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
                StrexpSimpleExpressMap1 = expSimple.SimpleExpr();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Basic Simple Exprn=" + StrexpSimpleExpressMap1);

                expValue = parse(StrexpSimpleExpressMap1, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                ExprnexpValue = expValue.eval();
                System.out.println(" main:Result(Expn Value)=" + ExprnexpValue);

                expValue = parse(StrexpSimpleExpressMap1, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpValueMap1 = expValue.eval();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Basic Simple (Exprn Value)=" + DblexpValueMap1);

                StageMapping = "Integration";
                exp = DiffrIntegrSep.parseIntegr(StrexpSimpleExpressMap1, variables, DiffWithRespTo, MapType, IntegrORDiffr);
                StrexpDiffExpress = exp.IntegrExpr();
                System.out.println(" main:Result(Integral Equation)(" + Order + " th order)=> " + StrexpDiffExpress);

                StageMapping = "Integration Mapping";
                expSimple = parseSimple(StrexpDiffExpress, variables, DiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
                StrexpSimpleExpressMap2 = expSimple.SimpleExpr();
                System.out.println(" main:Result(Simplified Integral Equation)(" + Order + " th order)=> " + StrexpSimpleExpressMap2);
                expValue = parse(StrexpDiffExpress, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpDiffValue = expValue.eval();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Result(Integral Value)=" + DblexpDiffValue);
                expValue = parse(StrexpSimpleExpressMap2, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpValueMap2 = expValue.eval();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Result(Simplified Integral Value)=" + expValue.eval());
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Result(Simplified Diff Value)=" + expValue.eval());
                //Usage.FInverseEqn=FInverseLagrangeBurmann( Exprn, DiffWithRespTo, MaxOrder1,x, "",  "", '/', 12);
                //Usage.FInverseEqn = FInverseLagrangeBurmannLowLevel(Exprn, DiffWithRespTo, MaxOrder1, x, (x +(10 - x) / 10), "", "", '/', 4);
                //System.out.println("main: FInverse:" + "x" + "=" + UsageCalculus.FInverseEqn);

                System.out.print(System.lineSeparator());

                if (PassFailTestCaseString(TestCase, Order, "Integre", Exprn, StrexpSimpleExpressMap1, StrexpDiffExpress, StrexpSimpleExpressMap2, EqnUnderTest, EqnSolArrayMap3[Order], EqnSolArrayIntegrAlone[Order], EqnSolArrayMap4[Order], "", "", "")) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass STRING TEST Complete" + ConsoleColors.RESET);
                    TestCasePassStrFlag = true;
                } else {
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "FAIL STRING TEST Complete" + ConsoleColors.RESET);
                    if (TestCasePassHighLevelFlag == true) {
                        TestCasePassHighLevelFlag = false;
                    }
                }

                if (PassFailTestCaseValueStrict(TestCase, Order, MaxOrder1, "Integre", Exprn, ExprnexpValue, DblexpValueMap1, DblexpDiffValue, DblexpValueMap2, StrexpDiffExpress, variables, x)) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass VALUE TEST CompletePragma:Strict" + ConsoleColors.RESET);
                    TestCasePassValFlag = true;
                    TestCasePassHighLevelFlag = true;
                } else if (PassFailTestCaseValueEasy(TestCase, Order, "Integre", Exprn, ExprnexpValue, DblexpValueMap1, DblexpDiffValue, DblexpValueMap2, StrexpDiffExpress, variables, x)) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass VALUE TEST Complete:Pragma:Loose" + ConsoleColors.RESET);
                } else {
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Fail VALUE TEST Complete" + ConsoleColors.RESET);
                }

                if ((TestCasePassStrFlag == true) && (TestCasePassValFlag == true)) {
                    System.out.println(ConsoleColors.BLUE + "Super Test Answer Checks" + ConsoleColors.RESET);
                }
                if ((TestCasePassStrFlag == true) && (TestCasePassValFlag == true)) {
                    ;//DO Nothing as Test Cases Passes
                } else {
                    String Temp = FailedTestCases.get(MaxIndexFail);
                    String HashVal = "";
                    if ((Temp != null) && (!Temp.equalsIgnoreCase("")) && (!Temp.contains("Section"))) {
                        HashVal = Temp + "," + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag;
                    } else {
                        HashVal = "TestCase=" + TestCase + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag;
                    }
                    FailedTestCases.put(MaxIndexFail, HashVal);
                    //i=MaxOrder1;
                    TestCasePassHighLevelFlag = false;
                }
                Exprn = StrexpSimpleExpressMap2;
                System.out.print(System.lineSeparator());
            } catch (Exception MyException) {
                System.out.print(System.lineSeparator());
                System.out.print(System.lineSeparator());
                MyException.printStackTrace();
                System.out.println(ConsoleColors.RED + "TestCase " + TestCase + " Failed at Order=" + Order + " due to Exception at Stage=" + StageMapping + "." + ConsoleColors.RESET);
                System.out.print(System.lineSeparator());
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

    public static void PalinController(int MaxOrder, String StartMyTestCase, String EndMyTestCase, String IntegreOrDiff) {
        System.out.println("PalinController:Start:" + IntegreOrDiff);
        double NumTestExecu = Math.round(Math.sqrt(287));
        double Start = Double.parseDouble(StartMyTestCase);
        double End = Double.parseDouble(EndMyTestCase);
        String Exprn1 = "";
        String Exprn2 = "";
        String DiffWithRespToExprn1 = "";
        String DiffWithRespToExprn2 = "";
        String Exprn = "";
        for (int i = 0; i <= 1; i++) {
            int TestCase1 = (int) (Math.random() * (End));
            int TestCase2 = (int) (Math.random() * (End));
            int NoOfAttemps = 0;
            boolean NOTinGAPTestCase1 = false;
            boolean NOTinGAPTestCase2 = false;
            while (NoOfAttemps < 2) {
                if ((TestCaseInGap(TestCase1))) {
                    TestCase1 = (int) (Math.random() * ((int) SectionTestCaseEnd - (int) SectionTestCaseStart)) + (int) SectionTestCaseStart;
                    NOTinGAPTestCase1 = !TestCaseInGap(TestCase1);
                } else {
                    NOTinGAPTestCase1 = true;
                }
                SectionTestCaseStart = 0;
                SectionTestCaseEnd = 0;
                if (TestCaseInGap(TestCase2)) {
                    TestCase2 = (int) (Math.random() * ((int) SectionTestCaseEnd - (int) SectionTestCaseStart)) + (int) SectionTestCaseStart;
                    NOTinGAPTestCase2 = !TestCaseInGap(TestCase2);
                } else {
                    NOTinGAPTestCase2 = true;
                }
                if ((NOTinGAPTestCase1) && (NOTinGAPTestCase2)) {
                    break;
                }
                NoOfAttemps++;
            }
            if ((NOTinGAPTestCase1) && (NOTinGAPTestCase2)) {
                double SignRand = Math.random();
                int Operator = -1;
                if (SignRand >= 0.5) {
                    Operator = '+';
                } else {
                    Operator = '-';
                }
                System.out.print(System.lineSeparator());
                System.out.println("PalinController:" + IntegreOrDiff + ":TestCase1=" + TestCase1);
                System.out.println("PalinController:" + IntegreOrDiff + ":TestCase2=" + TestCase2);
                if (IntegreOrDiff.equalsIgnoreCase("Diff")) {
                    Exprn1 = TestHarnessDiff("mainDiffTest", TestCase1, "");
                    DiffWithRespToExprn1 = DiffWithRespTo;
                    Exprn2 = TestHarnessDiff("mainDiffTest", TestCase2, "");
                    DiffWithRespToExprn2 = DiffWithRespTo;
                    if (DiffWithRespToExprn1.equalsIgnoreCase(DiffWithRespToExprn2)) {
                        Exprn = Exprn1 + (char) Operator + Exprn2;
                        PalinDiffSingleHighTestCase(MaxOrder, Exprn, TestCase1, TestCase2, Operator);
                    }
                } else if (IntegreOrDiff.equalsIgnoreCase("Integral")) {
                    Exprn1 = TestHarnessDiff("mainIntegrTest", TestCase1, "");
                    DiffWithRespToExprn1 = DiffWithRespTo;
                    Exprn2 = TestHarnessDiff("mainIntegrTest", TestCase2, "");
                    DiffWithRespToExprn2 = DiffWithRespTo;
                    if (DiffWithRespToExprn1.equalsIgnoreCase(DiffWithRespToExprn2)) {
                        Exprn = Exprn1 + (char) Operator + Exprn2;
                        PalinIntegralSingleHighTestCase(MaxOrder, Exprn, TestCase1, TestCase2, Operator);
                    }
                }
            }
        }
        System.out.println("PalinController:End:" + IntegreOrDiff);
    }

    public static boolean TestCaseInGap(int TestCaseCur) {
        if ((SectionTestCaseStart <= TestCaseCur) && (TestCaseCur <= SectionTestCaseEnd)) {
            return false;
        } else if ((SectionTestCaseStart == 0) && (SectionTestCaseEnd == 0)) {
            if (((TestCaseCur >= 100) && (TestCaseCur <= 125)) || (TestCaseCur < 1000)) {
                SectionTestCaseStart = 100;
                SectionTestCaseEnd = 125;
            } else if ((TestCaseCur >= 5019) && (TestCaseCur <= 5042) || (TestCaseCur < 10000)) {
                SectionTestCaseStart = 5019;
                SectionTestCaseEnd = 5042;
            } //
            // Variants
            //
            else if ((TestCaseCur >= 10001) && (TestCaseCur <= 10005) || (TestCaseCur < 20000)) {
                SectionTestCaseStart = 10001;
                SectionTestCaseEnd = 10005;
            } else if ((TestCaseCur >= 20001) && (TestCaseCur <= 20092) || (TestCaseCur < 30000)) {
                SectionTestCaseStart = 20001;
                SectionTestCaseEnd = 20092;
            } else if ((TestCaseCur >= 30001) && (TestCaseCur <= 30011) || (TestCaseCur < 40000)) {
                SectionTestCaseStart = 30001;
                SectionTestCaseEnd = 30011;
            } else if ((TestCaseCur >= 40001) && (TestCaseCur <= 40034) || (TestCaseCur < 50000)) {
                SectionTestCaseStart = 40001;
                SectionTestCaseEnd = 40034;
            } else if ((TestCaseCur >= 50001) && (TestCaseCur <= 50046) || (TestCaseCur < 80000)) {
                SectionTestCaseStart = 50001;
                SectionTestCaseEnd = 50046;
            } else if ((TestCaseCur >= 80000) && (TestCaseCur <= 80049) || (TestCaseCur < 90000)) {
                SectionTestCaseStart = 80000;
                SectionTestCaseEnd = 80049;
            } else if ((TestCaseCur >= 110001) && (TestCaseCur <= 110015) || (TestCaseCur < 120000)) {
                SectionTestCaseStart = 110001;
                SectionTestCaseEnd = 110015;
            } else {
                switch (TestCaseCur) {
                    //Function Test Cases
                    case 90001:
                        SectionTestCaseStart = 90001;
                        SectionTestCaseEnd = 90001;
                        break;
                    //Function Argument Test Cases
                    case 100001:
                        SectionTestCaseStart = 100001;
                        SectionTestCaseEnd = 100001;
                        break;
                    default:

                        break;
                }
            }
        }
        return true;
    }

    public static void mainRegresssionSubs(TestHarnessClass MyTestData) {
        Map<String, Double> variables = new HashMap<>();
        //String Exprn = TestPredicate();
        String Exprn = "x+3";
        String DiffWithRespTo = "x";
        SubsStrSep.Substitute expValue;

        MyFuncExpress();
        Exprn = eatAll(Exprn, ' ');

        int i = 1;
        for (double x = 0, y = 0; i < 10; y++, x++, i++) {
            variables.put("x", x);
            variables.put("y", y);
            System.out.println("mainRegresssionSubs: x=" + x + " y=" + y + " Exprn=" + Exprn);
            expValue = SubsStrSep.parseSubsStr(Exprn, "x-2", variables, DiffWithRespTo);
            System.out.println(" mainRegresssionSubs:Result(Logical Value)=" + expValue.SubsStr());
            System.out.print(System.lineSeparator());
        }
    }

    public static boolean DupChecknInsert(long j) {
        boolean DupFlag = false;
        int i = 0;
        String DupList = "";
        String[] TempDataStr = new String[3];
        MathsExpressionParser.Expression expValue = (() -> Double.NaN);
        MathsExpressionParser.Expression expValue1 = (() -> Double.NaN);
        SetVariablesAll();
        expValue = parse(EqnUnderTest, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
        double ExprnexpValue = 0;
        ExprnexpValue = expValue.eval();
        double DBExprnexpValue = 0;
        for (i = 0; (i < EqnDB.size()) && (!EqnDB.isEmpty()); i++) {
            String Temp = EqnDB.get(i);
            if ((Temp != null) && (!Temp.equalsIgnoreCase(""))) {
                TempDataStr = Temp.split("@");
            }
            String Exprn = "";
            String ExprnDiffWithRespTo="";
            if (TempDataStr.length >= 4) {
                Exprn = TempDataStr[2];
                ExprnDiffWithRespTo= TempDataStr[3];
            }
            if ((TempDataStr.length >= 4)  && (!Exprn.contains("@:Dup with "))) {
                Exprn = eatAll(Exprn, ' ');
                SetVariablesAll();
                expValue1 = parse(Exprn, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
            }
            DBExprnexpValue = expValue1.eval();
            if ( (EqnUnderTest != null) && (!EqnUnderTest.equalsIgnoreCase("")) && (Exprn != null)
                    && ( (Exprn.equalsIgnoreCase(EqnUnderTest)) &&(ExprnDiffWithRespTo.equalsIgnoreCase(DiffWithRespTo)) )) { //&&(ExprnDiffWithRespTo.equalsIgnoreCase(DiffWithRespTo))) )) { 
                    //||((!ExprnDiffWithRespTo.equalsIgnoreCase(DiffWithRespTo))&&(DBExprnexpValue == ExprnexpValue)) ) ){
                DupFlag = true;
                String[] DataTemp = Temp.split("@");
                if ((Integer.parseInt(DataTemp[1])) > 100) {
                    DupList = DupList + ":" + Integer.parseInt(DataTemp[1]);
                }
            }
            DBExprnexpValue = Double.NaN;
        }
        if ((!EqnUnderTest.equalsIgnoreCase("")) && (((DupFlag == false) && (i == EqnDB.size())) || (EqnDB.isEmpty()) || (DupList.equalsIgnoreCase("")))) {
            System.out.println("DupChecknInsert:Inserting TestCase=" + j + " DupList=" + DupList + " EqnUnderTest=" + EqnUnderTest);
            EqnDB.put(i, "TestCase@" + j + "@" + EqnUnderTest + "@" + DiffWithRespTo);
            EqnDBIndex++;
        } else if ((!EqnUnderTest.equalsIgnoreCase(""))) {
            EqnDB.put(EqnDBIndex, "TestCase@" + j + "@" + ":Dup with " + DupList + ":");
            EqnDBDupCount++;
            EqnDBIndex++;
        }
        return DupFlag;
    }


    public static void mainRegresssionFInverse(TestHarnessClass TestData) {
        String Exprn = "";
        String OverallRegressionStatus = "Diff:Pass All (100 to 110007) Except Test Cases: "
                + "\n" + "TestCases:Unit Test Cases" + " All Passing"
                + "\n" + "TestCases:Names " + " All Passing"
                + "\n" + "TestCases:Coefficients " + " 20016 , 20017"
                + "\n" + "TestCases:Exponent " + " 30006 to 30008"
                + "\n" + "TestCases:Parentheses " + " 80001 to 80024";
        System.out.print(ConsoleColors.BLUE + "Diff Overall Regression Status" + OverallRegressionStatus + ConsoleColors.RESET);
        System.out.print(System.lineSeparator());
        int j = (int) TestCase;
        FailedTestCases = new HashMap<Integer, String>();
        ExceptionTestCases = new HashMap<Integer, String>();
        TotalTestCases = 0;
        MaxIndexExcept = 0;
        MaxIndexFail = 0;
        SectionIndexFail = 1;
        FailedTestCount = 0;
        while (j <= EndTestCase) {
            EqnUnderTest = "";
            String TempExprn = "";
            Exprn = "";
            TempExprn = TestHarnessFInverse("FunctionInverse", j);
            if ((!EqnUnderTest.equalsIgnoreCase("")) && (TempExprn != null) && (!TempExprn.equalsIgnoreCase(""))) {
                Exprn = eatAll(TempExprn, ' ');
            }
            TotalTestCases++;
            Exprn = eatAll(Exprn, ' ');
            TestCasePassHighLevelFlag = true;
            FInvSingleHighTestCase(Exprn);
            j = RegressionControlFInv(j);
            TestCase = j;
            //System.out.println(ConsoleColors.RED +"mainDiffTest: j="+ j + " TestCase=" + TestCase);
            if (TestCasePassHighLevelFlag == false) {
                MaxIndexFail++;
                FailedTestCount++;
            }
        }
        System.out.println(ConsoleColors.RED + "mainRegresssionFInverse: TestCase Summary : Total Failed=" + FailedTestCount + " Out of Run TestCases=" + TotalTestCases + " Failed Test Cases are:" + ConsoleColors.RESET);
        for (int y = 0; y < MaxIndexFail; y++) {
            System.out.print(ConsoleColors.RED + " " + FailedTestCases.get(y) + ", " + ConsoleColors.RESET);
            if ((y != 0) && (y % 5 == 0)) {
                System.out.print(System.lineSeparator());
            }
        }
        System.out.print(System.lineSeparator());
        System.out.println(ConsoleColors.RED + "mainRegresssionFInverse: Exception TestCase Summary : Total Exceptions=" + MaxIndexExcept + " Exception Test Cases are:" + ConsoleColors.RESET);
        for (int y = 0; y < MaxIndexExcept; y++) {
            System.out.print(ConsoleColors.RED + " " + ExceptionTestCases.get(y) + ", " + ConsoleColors.RESET);
            if ((y != 0) && (y % 5 == 0)) {
                System.out.print(System.lineSeparator());
            }
        }
        System.out.print(System.lineSeparator());
    }

    public static void FInvSingleHighTestCase(String Exprn) {
        Map<String, Double> variables = new HashMap<>();
        String DiffWithRespTo = "x";
        FuncInvSep.FuncInv expValue;
        SimpleExpression expSimple;
        MyFuncExpress();
        String MapType = "Map1";
        String IntegrORDiffr = "Diffr";
        Exprn = eatAll(Exprn, ' ');
        String StageMapping = "";
        System.out.println(ConsoleColors.YELLOW + "Test Case " + TestCase + " EndTestCase=" + EndTestCase + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case " + TestCase + " Exprn=" + Exprn + " Exprn2=" + EqnUnderTest2 + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case Name=" + TestCaseName + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case Name=" + TestCaseMatrixID + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Regression Status : Test Case should be " + EqnRegressionDiffStatus + ConsoleColors.RESET);
        Double x = 0.0;
        Double y = 0.0;
        try {
            TestCasePassStrFlag = false;
            TestCasePassValFlag = false;
            variables.put(DiffWithRespTo, x);
            variables.put("y", y);
            variables.put("a", 1.0);
            variables.put("b", 2.0);//variables.put("b", 0.0);
            variables.put("c", -1.0);
            variables.put("d", 2.0);
            variables.put("p", 3.0);
            variables.put("q", 0.0);
            variables.put("r", -1.0);
            variables.put("s", 2.0);
            StageMapping = "Basic Mapping";
            System.out.println("FInvSingleHighTestCase: Exprn=" + Exprn + " EqnUnderTest2=" + UsageCalculus.EqnUnderTest2);
            expValue = FuncInvSep.parseFInverse(Exprn, variables, DiffWithRespTo, "y", "Neither");
            expSimple = parseSimple(expValue.evalStr(), variables, DiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
            if (expSimple.SimpleExpr().equalsIgnoreCase(UsageCalculus.UserTestAnswer)) {
                TestCasePassStrFlag = true;
                TestCasePassHighLevelFlag = true;
                System.out.println(ConsoleColors.GREEN + " FInvSingleHighTestCase:Result=" + expSimple.SimpleExpr() + ConsoleColors.RESET);
                System.out.println(ConsoleColors.GREEN + " FInvSingleHighTestCase:Answer=" + UsageCalculus.UserTestAnswer + ConsoleColors.RESET);
            } else {
                System.out.println(ConsoleColors.RED + " FInvSingleHighTestCase:Result=" + expSimple.SimpleExpr() + ConsoleColors.RESET);
                System.out.println(ConsoleColors.RED + " FInvSingleHighTestCase:Answer=" + UsageCalculus.UserTestAnswer + ConsoleColors.RESET);
                TestCasePassStrFlag = false;
                TestCasePassHighLevelFlag = false;
            }
            System.out.print(System.lineSeparator());

        } catch (Exception MyException) {
        }
        System.out.print(System.lineSeparator());

    }

    public static String TestHarnessFInverse(String AlgoName, int j) {
        if ((j >= 100) && (j <= 115)) {
            TestHarnessFInverse.SanityTestCases(AlgoName, j);
        } else if ((j >= 200) && (j <= 225)) {
            TestHarnessFInverse.UnitTestCases(AlgoName, j);
        }

        return EqnUnderTest;
    }

    public static void DiffLimitTestCase(int MaxOrder1, String Exprn) {
        Map<String, Double> variables = new HashMap<>();
        Map<String, String> variablesDiff = new HashMap<>();
        //String Exprn = eatAll(TestCases(), ' ');
        //String Exprn = eatAll(HighLevelUnitTestCases(), ' ');
        //String Exprn = eatAll(FailingHighLevelUnitTestCases(), ' ');
        //String Exprn = eatAll(FailingLowLevelUnitTestCases(), ' ');
        //Exprn = eatAll(Exprn, ' ');
        SimpleExpression expSimple;
        Expression expValue;
        DiffrIntegrSep.DiffExpr exp;
        OrderVar expOrder;

        MyFuncExpress();
        MyFuncDiff();
        MyFuncSimple();
        String MapType = "Map1";
        String IntegrORDiffr = "Diffr";
        String Constant = "C";

        String StrexpSimpleExpressMap1 = "";
        String StrexpDiffExpress = "";
        String StrexpSimpleExpressMap2 = "";
        String myOrder = "";

        double ExprnexpValue = 0;
        double DblexpValueMap1 = 0;
        double DblexpDiffValue = 0;
        double DblexpValueMap2 = 0;

        String StageMapping = "";
        int Order = 1;
        System.out.println(ConsoleColors.YELLOW + "Test Case " + TestCase + " EndTestCase=" + EndTestCase + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case " + TestCase + " Exprn=" + Exprn + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case Name=" + TestCaseName + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case Name=" + TestCaseMatrixID + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Regression Status : Test Case should be " + EqnRegressionDiffStatus + ConsoleColors.RESET);

        for (double x = 0, y = 7; Order < MaxOrder1; y++, x++, Order++) {
            try {
                TestCasePassStrFlag = false;
                TestCasePassValFlag = false;
                variables.put(DiffWithRespTo, x);
                variables.put("y", y);
                variables.put("a", 1.0);
                variables.put("b", 2.0);//variables.put("b", 0.0);
                variables.put("c", -1.0);
                variables.put("d", 2.0);
                variables.put("p", 3.0);
                variables.put("q", 0.0);
                variables.put("r", -1.0);
                variables.put("s", 2.0);
                variables.put(Constant, 5.0);
                StageMapping = "Basic Mapping";
                expOrder = parseOrder(Exprn, DiffWithRespTo, "Silent", MathsContxtLAv.LogLevel.Info);
                myOrder = expOrder.eval();
                //System.out.println("main: " + DiffWithRespTo + "=" + x + " Exprn=" + Exprn + " Order=" + myOrder);
                expSimple = parseSimple(Exprn, variables, DiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
                StrexpSimpleExpressMap1 = expSimple.SimpleExpr();
                //System.out.println("main: " + DiffWithRespTo + "=" + x + " Basic Simple Exprn=" + StrexpSimpleExpressMap1);

                expValue = parse(StrexpSimpleExpressMap1, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                ExprnexpValue = expValue.eval();
                System.out.println(" main:Result(Expn Value)=" + ExprnexpValue);

                expValue = parse(StrexpSimpleExpressMap1, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpValueMap1 = expValue.eval();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Basic Simple (Exprn Value)=" + DblexpValueMap1);
                StageMapping = "Differentiation";
                exp = DiffrIntegrSep.parseDiff(StrexpSimpleExpressMap1, variables, DiffWithRespTo, MapType, IntegrORDiffr);
                StrexpDiffExpress = exp.DiffExpr();
                System.out.println(" main:Result(Diff Equation)(" + Order + " th order)=> " + StrexpDiffExpress);
                StageMapping = "Differentiation Mapping";
                expSimple = parseSimple(StrexpDiffExpress, variables, DiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
                StrexpSimpleExpressMap2 = expSimple.SimpleExpr();
                expValue = parse(StrexpDiffExpress, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpDiffValue = expValue.eval();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Result(Diff Value)=" + DblexpDiffValue);
                System.out.println(" main:Result(Simplified Diff Equation)(" + Order + " th order)=> " + StrexpSimpleExpressMap2);
                expValue = parse(StrexpSimpleExpressMap2, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpValueMap2 = expValue.eval();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Result(Simplified Diff Value)=" + expValue.eval());
                //Usage.FInverseEqn=FInverseLagrangeBurmann( Exprn, DiffWithRespTo, MaxOrder1,x, "",  "", '/', 12);

                //Usage.FInverseEqn = FInverseLagrangeBurmannLowLevel(Exprn, DiffWithRespTo, MaxOrder1, x, 10.0, "", "", '/', 4);
                //System.out.println("main: FInverse:" + "x" + "=" + UsageCalculus.FInverseEqn);
                System.out.print(System.lineSeparator());

                Exprn = StrexpSimpleExpressMap2;
                System.out.print(System.lineSeparator());
            } catch (Exception MyException) {
                System.out.print(System.lineSeparator());
                System.out.print(System.lineSeparator());
                MyException.printStackTrace();
                System.out.println(ConsoleColors.RED + "TestCase " + TestCase + " Failed at Order=" + Order + " due to Exception at Stage=" + StageMapping + "." + ConsoleColors.RESET);
                System.out.print(System.lineSeparator());
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

    public static void IntegralLimitTest(int MaxOrder1, String Exprn) {
        Map<String, Double> variables = new HashMap<>();
        Map<String, String> variablesDiff = new HashMap<>();
        SimpleExpression expSimple;
        Expression expValue;
        DiffrIntegrSep.IntegrExpr exp;
        OrderVar expOrder;

        MyFuncExpress();
        MyFuncDiff();
        MyFuncSimple();
        String MapType = "Map1";
        String IntegrORDiffr = "Integre";
        String Constant = "C";
        String StrexpSimpleExpressMap1 = "";
        String StrexpDiffExpress = "";
        String StrexpSimpleExpressMap2 = "";
        String myOrder = "";
        double ExprnexpValue = 0;
        double DblexpValueMap1 = 0;
        double DblexpDiffValue = 0;
        double DblexpValueMap2 = 0;
        int Order = 1;
        System.out.println(ConsoleColors.BLUE + "Test Case " + TestCase + " Exprn=" + Exprn + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case Name=" + TestCaseName + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case Name=" + TestCaseMatrixID + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Integral Regression Status : Test Case should be " + EqnRegressionIntegreStatus + ConsoleColors.RESET);
        Order = 1;
        String StageMapping = "";
        variablesDiff.put(DiffWithRespTo, DiffWithRespTo);

        for (double x = 0, y = 7; Order < MaxOrder1; y++, x++, Order++) {
            try {
                TestCasePassStrFlag = false;
                TestCasePassValFlag = false;
                variables.put(DiffWithRespTo, x);
                variables.put("y", y);
                variables.put("a", 1.0);
                variables.put("b", 2.0);//variables.put("b", 0.0);
                variables.put("c", -1.0);
                variables.put("d", 2.0);
                variables.put("p", 1.0);
                variables.put("q", 0.0);
                variables.put("r", -1.0);
                variables.put("s", 2.0);
                variables.put(Constant, 5.0);
                StageMapping = "Basic Mapping";
                expOrder = parseOrder(Exprn, DiffWithRespTo, "Silent", MathsContxtLAv.LogLevel.Info);
                myOrder = expOrder.eval();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Exprn=" + Exprn + " Order=" + myOrder);
                expSimple = parseSimple(Exprn, variables, DiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
                StrexpSimpleExpressMap1 = expSimple.SimpleExpr();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Basic Simple Exprn=" + StrexpSimpleExpressMap1);

                expValue = parse(StrexpSimpleExpressMap1, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                ExprnexpValue = expValue.eval();
                System.out.println(" main:Result(Expn Value)=" + ExprnexpValue);

                expValue = parse(StrexpSimpleExpressMap1, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpValueMap1 = expValue.eval();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Basic Simple (Exprn Value)=" + DblexpValueMap1);

                StageMapping = "Integration";
                exp = DiffrIntegrSep.parseIntegr(StrexpSimpleExpressMap1, variables, DiffWithRespTo, MapType, IntegrORDiffr);
                StrexpDiffExpress = exp.IntegrExpr();
                System.out.println(" main:Result(Integral Equation)(" + Order + " th order)=> " + StrexpDiffExpress);

                StageMapping = "Integration Mapping";
                expSimple = parseSimple(StrexpDiffExpress, variables, DiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
                StrexpSimpleExpressMap2 = expSimple.SimpleExpr();
                System.out.println(" main:Result(Simplified Integral Equation)(" + Order + " th order)=> " + StrexpSimpleExpressMap2);
                expValue = parse(StrexpDiffExpress, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpDiffValue = expValue.eval();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Result(Integral Value)=" + DblexpDiffValue);
                expValue = parse(StrexpSimpleExpressMap2, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpValueMap2 = expValue.eval();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Result(Simplified Integral Value)=" + expValue.eval());
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Result(Simplified Diff Value)=" + expValue.eval());
                //Usage.FInverseEqn=FInverseLagrangeBurmann( Exprn, DiffWithRespTo, MaxOrder1,x, "",  "", '/', 12);
                //Usage.FInverseEqn = FInverseLagrangeBurmannLowLevel(Exprn, DiffWithRespTo, MaxOrder1, x, (x +(10 - x) / 10), "", "", '/', 4);
                //System.out.println("main: FInverse:" + "x" + "=" + UsageCalculus.FInverseEqn);

                System.out.print(System.lineSeparator());
                Exprn = StrexpSimpleExpressMap2;
                System.out.print(System.lineSeparator());
            } catch (Exception MyException) {
                System.out.print(System.lineSeparator());
                System.out.print(System.lineSeparator());
                MyException.printStackTrace();
                System.out.println(ConsoleColors.RED + "TestCase " + TestCase + " Failed at Order=" + Order + " due to Exception at Stage=" + StageMapping + "." + ConsoleColors.RESET);
                System.out.print(System.lineSeparator());
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

    public static int RegressionControlFInv(int j) {
        if ((j >= 100) && (j <= 115)) {
            j++;
        } else if ((j >= 200) && (j < 225)) {
            j++;
        } //Bypass Gaps Section
        else if ((j < 100)) {
            j = 100;
        } else if ((j == 115)) {
            j = 200;
        } else if ((j == 225)) {
            j = 5019;
        } else {
            System.out.println(ConsoleColors.RED + "RegressionControlPredicate:j= " + j + ": Infinite Loop" + ConsoleColors.RESET);
        }
        return j;

    }

    public static void mainRegresssionExpr(TestHarnessClass TestData) {
        String Exprn = "";
        int j = (int) TestCase;
        FailedTestCases = new HashMap<Integer, String>();
        ExceptionTestCases = new HashMap<Integer, String>();
        TotalTestCases = 0;
        MaxIndexExcept = 0;
        MaxIndexFail = 0;
        SectionIndexFail = 1;
        FailedTestCount = 0;
        while (j <= EndTestCase) {
            EqnUnderTest = "";
            String TempExprn = "";
            Exprn = "";
            TempExprn = TestHarnessExpr("Expr", j);
            if ((!EqnUnderTest.equalsIgnoreCase("")) && (TempExprn != null) && (!TempExprn.equalsIgnoreCase(""))) {
                Exprn = eatAll(TempExprn, ' ');
            }
            TotalTestCases++;
            Exprn = eatAll(Exprn, ' ');
            TestCasePassHighLevelFlag = true;
            ExprSingleHighTestCase(Exprn);
            j = RegressionControlExpr(j);
            TestCase = j;
            //System.out.println(ConsoleColors.RED +"mainDiffTest: j="+ j + " TestCase=" + TestCase);
            if (TestCasePassHighLevelFlag == false) {
                MaxIndexFail++;
                FailedTestCount++;
            }
        }
        System.out.println(ConsoleColors.RED + "mainRegresssionAlgebra: TestCase Summary : Total Failed=" + FailedTestCount + " Out of Run TestCases=" + TotalTestCases + " Failed Test Cases are:" + ConsoleColors.RESET);
        for (int y = 0; y < MaxIndexFail; y++) {
            System.out.print(ConsoleColors.RED + " " + FailedTestCases.get(y) + ", " + ConsoleColors.RESET);
            if ((y != 0) && (y % 5 == 0)) {
                System.out.print(System.lineSeparator());
            }
        }
        System.out.print(System.lineSeparator());
        System.out.println(ConsoleColors.RED + "mainRegresssionAlgebra: Exception TestCase Summary : Total Exceptions=" + MaxIndexExcept + " Exception Test Cases are:" + ConsoleColors.RESET);
        for (int y = 0; y < MaxIndexExcept; y++) {
            System.out.print(ConsoleColors.RED + " " + ExceptionTestCases.get(y) + ", " + ConsoleColors.RESET);
            if ((y != 0) && (y % 5 == 0)) {
                System.out.print(System.lineSeparator());
            }
        }
        System.out.print(System.lineSeparator());
    }

    public static void ExprSingleHighTestCase(String Exprn) {
        Map<String, Double> variables = new HashMap<>();
        String DiffWithRespTo = "x";
        Expression expValue;
        SimpleExpression expSimple;
        MyFuncExpress();
        Exprn = eatAll(Exprn, ' ');
        String StageMapping = "";
        System.out.println(ConsoleColors.YELLOW + "Test Case " + TestCase + " EndTestCase=" + EndTestCase + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case " + TestCase + " Exprn=" + Exprn + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case Name=" + TestCaseName + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case Name=" + TestCaseMatrixID + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Regression Status : Test Case should be " + EqnRegressionDiffStatus + ConsoleColors.RESET);
        Double x = 2.0;
        try {
            TestCasePassStrFlag = false;
            TestCasePassValFlag = false;
            variables.put(DiffWithRespTo, x);
            variables.put("a", 1.0);
            variables.put("b", 2.0);//variables.put("b", 0.0);
            variables.put("c", -1.0);
            variables.put("d", 2.0);
            variables.put("p", 3.0);
            variables.put("q", 0.0);
            variables.put("r", -1.0);
            variables.put("s", 2.0);
            StageMapping = "Basic Mapping";
            System.out.println("mainMathAlgebra: Exprn=" + Exprn);
            expValue = parse(Exprn, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
            System.out.println("mainMathAlgebra: x=" + x + " expValue.eval()(y)=" + expValue.eval());
            System.out.print(System.lineSeparator());

        } catch (Exception MyException) {
        }
        System.out.print(System.lineSeparator());

    }

    public static String TestHarnessExpr(String AlgoName, int j) {
        if ((j >= 100) && (j <= 107)) {
            TestHarnessExpression.SanityTestCases(AlgoName, j);
        } else if ((j >= 200) && (j <= 225)) {
            TestHarnessExpression.UnitTestCases(AlgoName, j);
        }

        return EqnUnderTest;
    }

    public static int RegressionControlExpr(int j) {
        if ((j >= 100) && (j < 107)) {
            j++;
        } else if ((j >= 200) && (j < 225)) {
            j++;
        } //Bypass Gaps Section
        else if ((j < 100)) {
            j = 100;
        } else if ((j == 107)) {
            j = 200;
        } else if ((j == 225)) {
            j = 5019;
        } else {
            System.out.println(ConsoleColors.RED + "RegressionControlPredicate:j= " + j + ": Infinite Loop" + ConsoleColors.RESET);
        }
        return j;

    }

    public static void PalinControllerSame(int MaxOrder, String StartMyTestCase, String EndMyTestCase, String IntegreOrDiff) {
        System.out.println("PalinController:Start:" + IntegreOrDiff);
        double NumTestExecu = Math.round(Math.sqrt(287));
        double Start = Double.parseDouble(StartMyTestCase);
        double End = Double.parseDouble(EndMyTestCase);
        String Exprn1 = "";
        String Exprn2 = "";
        String Exprn = "";
        for (int i = 0; i <= 1; i++) {
            int TestCase1 = (int) (Math.random() * (End));
            int NoOfAttemps = 0;
            boolean NOTinGAPTestCase1 = false;
            if ((TestCaseInGap(TestCase1))) {
                TestCase1 = (int) (Math.random() * ((int) SectionTestCaseEnd - (int) SectionTestCaseStart)) + (int) SectionTestCaseStart;
                NOTinGAPTestCase1 = !TestCaseInGap(TestCase1);
            } else {
                NOTinGAPTestCase1 = true;
            }
            SectionTestCaseStart = 0;
            SectionTestCaseEnd = 0;
            NoOfAttemps++;
            if (NOTinGAPTestCase1) {
                double SignRand = Math.random();
                int Operator = '+';
//                if (SignRand >= 0.5) {
//                    Operator = '+';
//                } else {
//                    Operator = '-';
//                }
                System.out.print(System.lineSeparator());
                System.out.println("PalinController:" + IntegreOrDiff + ":TestCase1=" + TestCase1);
                System.out.println("PalinController:" + IntegreOrDiff + ":TestCase2=" + TestCase1);
                if (IntegreOrDiff.equalsIgnoreCase("Diff")) {
                    Exprn1 = TestHarnessDiff("mainDiffTest", TestCase1, "");
                    Exprn2 = TestHarnessDiff("mainDiffTest", TestCase1, "");
                    Exprn = Exprn1 + (char) Operator + Exprn2;
                    PalinDiffSingleHighTestCase(MaxOrder, Exprn, TestCase1, TestCase1, Operator);
                } else if (IntegreOrDiff.equalsIgnoreCase("Integral")) {
                    Exprn1 = TestHarnessDiff("mainIntegrTest", TestCase1, "");
                    Exprn2 = TestHarnessDiff("mainIntegrTest", TestCase1, "");
                    Exprn = Exprn1 + (char) Operator + Exprn2;
                    PalinIntegralSingleHighTestCase(MaxOrder, Exprn, TestCase1, TestCase1, Operator);
                }
            }
        }
        System.out.println("PalinController:End:" + IntegreOrDiff);
    }

    public static void mainRegresssionHghLvlExprODETest(int MaxOrder, TestHarnessClass TestData) {
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
        int j = (int) TestCase;
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
        int OldKnwnI = 0;
        int OldInvertAnsBothFlippedCount = 0;
        int OldInvertAnsFlippedCount = 0;
        boolean DupFlag = false;
        while (j <= EndTestCase) {
            EqnUnderTest = "";
            DupFlag = false;
            String TempExprn = "";

            TempExprn = TestHarnessHghLvlExprODE("HghLvlExpr", j);
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
                HghLvlExprODESingleHighTestCase(MaxOrder1, Exprn);
                System.out.println(ConsoleColors.RED + "HghLvlExpr: j=" + j + " TestCase=" + TestCase);
                if (DupFlag == false) {
                    TotalTestCases++;
                }
            } else if (DupFlag == true) {
                System.out.println(ConsoleColors.RED + "HghLvlExpr: j=" + j + " TestCase=" + TestCase + " Dup. Hence NOT Executing.");

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
            OldKnwnI = KnownIssues;
            TestHarnessHghLvlExprODE(j);
            if (((j - OldTestCase) > 1)) {
                GapProcess("HghLvlExpr", j, OldTotalTestCases, OldTestCase, OldMaxIndexFail, OldFailedTestCount, OldDups, OldKnwnI, EqnDBDupCount, OldInvertAnsBothFlippedCount, OldInvertAnsFlippedCount);
                OldFailedTestCount = FailedTestCount;
                OldDups = EqnDBDupCount;
                SectionStart = j;
                OldTotalTestCases = TotalTestCases;
            }
            TestCase = j;
        }
        GapProcess("HghLvlExpr", j, OldTotalTestCases, OldTestCase, OldMaxIndexFail, OldFailedTestCount, OldDups, OldKnwnI, EqnDBDupCount, OldInvertAnsBothFlippedCount, OldInvertAnsFlippedCount);

        int k = 0;
        for (int y = 0; (y < EqnDB.size()); y++) {
            String Temp = EqnDB.get(y);
            if ((Temp != null) && (Temp.contains(":Dup with"))) {
                k++;
            }
        }
        System.out.println(ConsoleColors.RED + "HghLvlExpr: TestCase Summary : Total Failed=" + FailedTestCount + " Out of Run TestCases-Dups=" + (TotalTestCases) + " Passed Count=" + (TotalTestCases - FailedTestCount) + ConsoleColors.RESET);
        System.out.println(ConsoleColors.RED + "HghLvlExpr: TestCase Summary : DupCount=" + k + " Total Exceptions=" + MaxIndexExcept + ConsoleColors.RESET);
        System.out.println(ConsoleColors.RED + "HghLvlExpr: TestCase Summary : ByPassedTestCases=" + ByPassedTestCases + " MissedNumberTestCases=" + MissedNumberTestCases + " MissedTestCasesInfinity=" + MissedTestCasesInfinity + " MissedTestCasesException=" + MissedTestCasesException + ConsoleColors.RESET);
        for (int y = 0; (MaxIndexFail >= 0) && (FailedTestCases != null) && (y < FailedTestCases.size()); y++) {
            if ((FailedTestCases.get(y).contains("Section")) && (FailedTestCases.get(y).contains("Complete # of Failures="))) {
                System.out.print(ConsoleColors.GREEN + FailedTestCases.get(y) + ConsoleColors.RESET);
            }
        }
        System.out.print(System.lineSeparator());
        System.out.println(ConsoleColors.RED + "HghLvlExpr: TestCase Summary : " + " Failed Test Cases are:" + ConsoleColors.RESET);

        for (int y = 0; y < MaxIndexFail; y++) {
            System.out.print(ConsoleColors.RED + " " + FailedTestCases.get(y) + ", " + ConsoleColors.RESET);
            if ((y != 0) && (y % 5 == 0)) {
                System.out.print(System.lineSeparator());
            }
        }
        System.out.print(System.lineSeparator());
        System.out.println(ConsoleColors.RED + "HghLvlExpr: Exception TestCase Summary : Total Exceptions=" + MaxIndexExcept + " Exception Test Cases are:" + ConsoleColors.RESET);
        for (int y = 0; y < MaxIndexExcept; y++) {
            System.out.print(ConsoleColors.RED + " " + ExceptionTestCases.get(y) + ", " + ConsoleColors.RESET);
            if ((y != 0) && (y % 5 == 0)) {
                System.out.print(System.lineSeparator());
            }
        }
        System.out.print(System.lineSeparator());
        System.out.println(ConsoleColors.RED + "HghLvlExpr: TestCase Duplicate Summary : " + " EqnDBIndex=" + EqnDBIndex + ConsoleColors.RESET);
        for (int y = 0; (y < EqnDB.size()); y++) {
            String Temp = EqnDB.get(y);
            if ((Temp != null) && (Temp.contains(":Dup with"))) {
                System.out.print(ConsoleColors.GREEN + EqnDB.get(y) + ConsoleColors.RESET);
                System.out.print(System.lineSeparator());
            }
        }
        System.out.println(ConsoleColors.RED + "HghLvlExpr: TestCase Duplicate Summary : Total Dups=" + k + ConsoleColors.RESET);
        System.out.print(System.lineSeparator());
        for (int y = 0; y < MaxIndexExcept; y++) {
            System.out.println(ConsoleColors.RED + " " + ExceptionStringDB.get(y) + ", " + ConsoleColors.RESET);
        }
        System.out.print(System.lineSeparator());
    }

    public static void HghLvlExprODESingleHighTestCase(int MaxOrder1, String Exprn) {
        Map<String, Double> variables = new HashMap<>();
        //String Exprn = eatAll(TestCases(), ' ');
        //String Exprn = eatAll(HighLevelUnitTestCases(), ' ');
        //String Exprn = eatAll(FailingHighLevelUnitTestCases(), ' ');
        //String Exprn = eatAll(FailingLowLevelUnitTestCases(), ' ');
        //Exprn = eatAll(Exprn, ' ');
        MathsContxtLAv.SimpleExpression expSimpleMap1 = (() -> "");
        MathsExpressionParser.Expression expValue = (() -> Double.NaN);
        MathsContxtLAv.SimpleExpression expSimpleMap2 = (() -> "");
        DiffrIntegrSep.DiffExpr exp = (() -> "");
        MathsContxtLAv.OrderVar expOrder = (() -> "");

        MyFuncExpress();
        MyFuncDiff();
        MyFuncSimple();

        String Constant = "C";
        String MapType = "Map1";
        String IntegrORDiffr = "Diffr";
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
                variables.put(DiffWithRespTo, x);
                variables.put("y", y);
                variables.put("a", 1.0);
                variables.put("b", 2.0);//variables.put("b", 0.0);
                variables.put("c", -1.0);
                variables.put("d", 2.0);
                variables.put("m", -1.0);
                variables.put("p", 3.0);
                variables.put("q", 0.0);
                variables.put("r", -1.0);
                variables.put("s", 2.0);
                variables.put(Constant, 5.0);
                StageMapping = "Basic Mapping";
                expOrder = parseOrder(Exprn, DiffWithRespTo, "Silent", MathsContxtLAv.LogLevel.Info);
                myOrder = expOrder.eval();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Exprn=" + Exprn + " Order=" + myOrder);
                ChaosPrevention();
                expSimpleMap1 = parseSimple(Exprn, variables, DiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
                StrexpSimpleExpressMap1 = expSimpleMap1.SimpleExpr();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Basic Simple Exprn=" + StrexpSimpleExpressMap1);

                expValue = parse(StrexpSimpleExpressMap1, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                ExprnexpValue = expValue.eval();
                System.out.println(" main:Result(Expn Value)=" + ExprnexpValue + "  x=" + x + DiffWithRespTo + "=" + x);

                expValue = parse(StrexpSimpleExpressMap1, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpValueMap1 = expValue.eval();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Basic Simple (Exprn Value)=" + DblexpValueMap1);
                StageMapping = "Differentiation";
                exp = DiffrIntegrSep.parseDiff(StrexpSimpleExpressMap1, variables, DiffWithRespTo, MapType, IntegrORDiffr);
                StrexpDiffExpress = exp.DiffExpr();
                System.out.println(" main:Result(Diff Equation)(" + Order + " th order)=> " + StrexpDiffExpress);
                StageMapping = "Differentiation Mapping";
                ChaosPrevention();
                expSimpleMap2 = parseSimple(StrexpDiffExpress, variables, DiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
                StrexpSimpleExpressMap2 = expSimpleMap2.SimpleExpr();
                expValue = parse(StrexpDiffExpress, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpDiffValue = expValue.eval();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Result(Diff Value)=" + DblexpDiffValue);
                System.out.println(" main:Result(Simplified Diff Equation)(" + Order + " th order)=> " + StrexpSimpleExpressMap2);
                expValue = parse(StrexpSimpleExpressMap2, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpValueMap2 = expValue.eval();
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Result(Simplified Diff Value)=" + expValue.eval());
                //Usage.FInverseEqn=FInverseLagrangeBurmann( Exprn, DiffWithRespTo, MaxOrder1,x, "",  "", '/', 12);

                //Usage.FInverseEqn = FInverseLagrangeBurmannLowLevel(Exprn, DiffWithRespTo, MaxOrder1, x, 10.0, "", "", '/', 4);
                //System.out.println("main: FInverse:" + "x" + "=" + UsageCalculus.FInverseEqn);
                System.out.print(System.lineSeparator());
                if (PassFailTestCaseString(TestCase, Order, "Diff", Exprn, StrexpSimpleExpressMap1, StrexpDiffExpress, StrexpSimpleExpressMap2, EqnUnderTest, EqnSolArrayMap1[Order], EqnSolArrayDiffAlone[Order], EqnSolArrayMap2[Order], "", "", "")) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass STRING TEST Complete" + ConsoleColors.RESET);
                    TestCasePassStrFlag = true;
                } else {
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "FAIL STRING TEST Complete" + ConsoleColors.RESET);
                    if (TestCasePassHighLevelFlag == true) {
                        TestCasePassHighLevelFlag = false;
                    }
                }

                if (PassFailTestCaseValueStrict(TestCase, Order, MaxOrder1, "Integre", Exprn, ExprnexpValue, DblexpValueMap1, DblexpDiffValue, DblexpValueMap2, StrexpDiffExpress, variables, x)) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass VALUE TEST CompletePragma:Strict" + ConsoleColors.RESET);
                    TestCasePassValFlag = true;
                    TestCasePassHighLevelFlag = true;
                } else if (PassFailTestCaseValueEasy(TestCase, Order, "Integre", Exprn, ExprnexpValue, DblexpValueMap1, DblexpDiffValue, DblexpValueMap2, StrexpDiffExpress, variables, x)) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass VALUE TEST Complete:Pragma:Loose" + ConsoleColors.RESET);
                } else {
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Fail VALUE TEST Complete" + ConsoleColors.RESET);
                }
                if ((TestCasePassStrFlag == true) || (TestCasePassValFlag == true)) {
                    TestCasePassConformalValFlag = ConformalMapTestCaseDiff(TestCase, Order, Exprn, expSimpleMap1, exp, expSimpleMap2, EqnSolArrayMap1[Order], EqnSolArrayDiffAlone[Order], EqnSolArrayMap2[Order], variables, DiffWithRespTo);
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
                } else {
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

    public static int TestHarnessHghLvlExprODE(int j) {
        if ((j >= 100) && (j <= 107)) {
            j++;
        } else if ((j >= 200) && (j <= 225)) {
            j++;
        } //Bypass Gaps Section
        else if ((j < 100)) {
            j = 100;
        } else if ((j == 107)) {
            j = 200;
        } else if ((j == 226)) {
            j = 300;
        } else {
            System.out.println(ConsoleColors.RED + "RegressionControl:j= " + j + ": Infinite Loop" + ConsoleColors.RESET);
        }
        return j;
    }

    public static String TestHarnessHghLvlExprODE(String AlgoName, int j) {
        if ((j >= 100) && (j <= 107)) {
            Section = "SanityTest";
            SectionTestCaseStart = 100;
            SectionTestCaseEnd = 107;
            TestCaseFile = "HghLvlExprODE";
            HghLvlExprODE.SanityTestCases(AlgoName, j);
        } else if ((j >= 200) && (j <= 225)) {
            Section = "UnitTest";
            SectionTestCaseStart = 200;
            SectionTestCaseEnd = 225;
            TestCaseFile = "HghLvlExprODE";
            HghLvlExprODE.UnitTestCases(AlgoName, j);
        } else {
            SectionTestCaseStart = -1;
            SectionTestCaseEnd = -1;
            System.out.println(ConsoleColors.RED + "TestHarnessHghLvlExprODE:j= " + j + ": NOT Executed Loop" + ConsoleColors.RESET);
            ResetTestCase();
        }
        return EqnUnderTest;
    }

    public static void WrongAnswerMap1(String Exprn, Map<String, Double> variables, String AnswerMap1, int MaxOrder1) {
        MathsExpressionParser.Expression expValue = (() -> Double.NaN);
        MathsExpressionParser.Expression AnswerValue = (() -> Double.NaN);
        Double StatedAnswer = 0.0;
        Double GivenAnswerValue = 0.0;
        //System.out.println(ConsoleColors.RED +"Parsing:Exprn" + Exprn + ConsoleColors.RESET);
        if (!Exprn.equalsIgnoreCase("")) {
            expValue = parse(Exprn, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Info);
        } else if ((Order <= MaxOrder1 - 1) && (Order == 1)) {
            System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "TOP:WRONG ANSWER MAP1 Value Order=" + Order + " Exprn NULL STRING" + ConsoleColors.RESET);
            System.out.println("Exprn=" + Exprn);
            System.out.println("AnswerMap1=" + AnswerMap1);
            WrongAnswerFlagMap1 = true;
        }
        //System.out.println(ConsoleColors.RED +"Parsing:AnswerMap1" + AnswerMap1 + ConsoleColors.RESET);
        if (!AnswerMap1.equalsIgnoreCase("")) {
            AnswerValue = parse(AnswerMap1, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
        } else if ((!AnswerMap1.equalsIgnoreCase("")) && (!Exprn.equalsIgnoreCase(""))) {
            System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Bottom:WRONG ANSWER MAP1 Value Order=" + Order + " Given Answer NULL STRING" + ConsoleColors.RESET);
            System.out.println("Exprn=" + Exprn);
            System.out.println("AnswerMap1=" + AnswerMap1);
            WrongAnswerFlagMap1 = true;
        }
        System.out.println(ConsoleColors.BLUE + " Map1:Computed expValue=" + expValue.eval().doubleValue() + " Given Answer Value=" + AnswerValue.eval().doubleValue() + " Exprn=" + Exprn + " GivenAnswer=" + AnswerMap1 + ConsoleColors.RESET);
        //' Convert Both Answers to POSITIVE DOMAIN as For Nominal Answer of -23.0 , -24 or -22 is allowed
        if ((expValue.eval().doubleValue() < 0) && (AnswerValue.eval().doubleValue() < 0)) {
            StatedAnswer = expValue.eval().doubleValue() * -1.0;
            GivenAnswerValue = AnswerValue.eval().doubleValue() * -1.0;
        }
        if (expValue.eval().doubleValue() == AnswerValue.eval().doubleValue()) {
            WrongAnswerFlagMap1 = false;
        } else if ((expValue.eval().doubleValue() == Double.NaN) || (AnswerValue.eval().doubleValue() == Double.NaN)) {
            WrongAnswerFlagMap1 = false;
        }
        if ((StatedAnswer >= 0.9 * GivenAnswerValue) && (StatedAnswer <= 1.01 * GivenAnswerValue))
             ; else if ((GivenAnswerValue >= 0.9 * StatedAnswer) && (GivenAnswerValue <= 1.01 * StatedAnswer))
             ; else {
            WrongAnswerFlagMap1 = true;
        }
        if ((WrongAnswerFlagMap1 == true) && (StatedAnswer != 0.0) && (GivenAnswerValue != 0.0)) {
            System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Final:WRONG ANSWER MAP1 Value Order=" + Order + ConsoleColors.RESET);
            System.out.println(ConsoleColors.RED + " Map1:Computed expValue=" + expValue.eval().doubleValue() + " Given Answer Value=" + AnswerValue.eval().doubleValue() + " DiffWithRespTo=" + DiffWithRespTo + ConsoleColors.RESET);
            System.out.println(ConsoleColors.RED + " Map1:Computed StatedAnswer=" + StatedAnswer + " GivenAnswerValue=" + GivenAnswerValue + ConsoleColors.RESET);
            System.out.println(ConsoleColors.RED + " Map1:Computed Exprn=" + Exprn + ConsoleColors.RESET);
            System.out.println(ConsoleColors.RED + " Map1:Given Answer: AnswerMap1=" + AnswerMap1 + ConsoleColors.RESET);
        }
    }

    public static void WrongAnswerCalculus1(String Exprn, Map<String, Double> variables, String AnswerMap2) {
        MathsExpressionParser.Expression expValue = (() -> Double.NaN);
        MathsExpressionParser.Expression AnswerValue = (() -> Double.NaN);
        Double StatedAnswer = 0.0;
        Double GivenAnswerValue = 0.0;
        expValue = parse(Exprn, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
        AnswerValue = parse(AnswerMap2, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
        System.out.println(ConsoleColors.BLUE + " Calculus1:Computed expValue=" + expValue.eval().doubleValue() + " Given Answer Value=" + AnswerValue.eval().doubleValue() + " Exprn=" + Exprn + " GivenAnswer=" + AnswerMap2 + ConsoleColors.RESET);
        //' Convert Both Answers to POSITIVE DOMAIN as For Nominal Answer of -23.0 , -24 or -22 is allowed
        if ((expValue.eval().doubleValue() < 0) && (AnswerValue.eval().doubleValue() < 0)) {
            StatedAnswer = expValue.eval().doubleValue() * -1.0;
            GivenAnswerValue = AnswerValue.eval().doubleValue() * -1.0;
        }

        if ((StatedAnswer >= 0.99 * GivenAnswerValue) && (StatedAnswer <= 1.01 * GivenAnswerValue))
             ; else if ((GivenAnswerValue >= 0.99 * StatedAnswer) && (GivenAnswerValue <= 1.01 * StatedAnswer))
             ; else {
            WrongAnswerFlagCalculus1 = true;
            System.out.println("Exprn=" + Exprn);
            System.out.println("AnswerMap2=" + AnswerMap2);
        }
        if (WrongAnswerFlagCalculus1 == true) {
            System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "WRONG ANSWER MAP1 Value:Order=" + Order + ConsoleColors.RESET);
            System.out.println(ConsoleColors.RED + " Calculus1:Computed expValue=" + expValue.eval().doubleValue() + " Given Answer Value=" + AnswerValue.eval().doubleValue() + " Exprn=" + Exprn + " GivenAnswer=" + AnswerMap2 + ConsoleColors.RESET);
        }

    }

    public static void WrongAnswerMap2(String Exprn, Map<String, Double> variables, String AnswerMap2, int MaxOrder1) {
        MathsExpressionParser.Expression expValue = (() -> Double.NaN);
        MathsExpressionParser.Expression AnswerValue = (() -> Double.NaN);
        Double StatedAnswer = 0.0;
        Double GivenAnswerValue = 0.0;
        if (!Exprn.equalsIgnoreCase("")) {
            expValue = parse(Exprn, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
        } else if ((Order <= MaxOrder1 - 1) && (Order == 1)) {
            System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "TOP:WRONG ANSWER MAP2 Value Order=" + Order + " Exprn NULL STRING" + ConsoleColors.RESET);
            System.out.println("Exprn=" + Exprn);
            System.out.println("AnswerMap2=" + AnswerMap2);
            WrongAnswerFlagMap2 = true;
        }
        if (!AnswerMap2.equalsIgnoreCase("")) {
            AnswerValue = parse(AnswerMap2, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
        } else if ((!AnswerMap2.equalsIgnoreCase("")) && (!Exprn.equalsIgnoreCase(""))) {
            System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Bottom:WRONG ANSWER MAP2 Value Order=" + Order + " Exprn NULL STRING" + ConsoleColors.RESET);
            System.out.println("Exprn=" + Exprn);
            System.out.println("AnswerMap2=" + AnswerMap2);
            WrongAnswerFlagMap2 = true;
        }
        System.out.println(ConsoleColors.BLUE + " Map2:Computed expValue=" + expValue.eval().doubleValue() + " Given Answer Value=" + AnswerValue.eval().doubleValue() + " Exprn=" + Exprn + " GivenAnswer=" + AnswerMap2 + ConsoleColors.RESET);
        //' Convert Both Answers to POSITIVE DOMAIN as For Nominal Answer of -23.0 , -24 or -22 is allowed
        if ((expValue.eval().doubleValue() < 0) && (AnswerValue.eval().doubleValue() < 0)) {
            StatedAnswer = expValue.eval().doubleValue() * -1.0;
            GivenAnswerValue = AnswerValue.eval().doubleValue() * -1.0;
        }
        if (expValue.eval().doubleValue() == AnswerValue.eval().doubleValue()) {
            WrongAnswerFlagMap2 = false;
        } else if ((expValue.eval().doubleValue() == Double.NaN) || (AnswerValue.eval().doubleValue() == Double.NaN)) {
            WrongAnswerFlagMap2 = false;
        }
        if ((StatedAnswer >= 0.99 * GivenAnswerValue) && (StatedAnswer <= 1.01 * GivenAnswerValue))
             ; else if ((GivenAnswerValue >= 0.99 * StatedAnswer) && (GivenAnswerValue <= 1.01 * StatedAnswer))
             ; else {
            WrongAnswerFlagMap2 = false;
        }
        if ((WrongAnswerFlagMap2 == true) && (StatedAnswer != 0.0) && (GivenAnswerValue != 0.0)) {
            System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Final:WRONG ANSWER MAP2 Value:Order=" + Order + ConsoleColors.RESET);
            System.out.println(ConsoleColors.RED + " Map2:Computed expValue=" + expValue.eval().doubleValue() + " Given Answer Value=" + AnswerValue.eval().doubleValue() + ConsoleColors.RESET);
            System.out.println(ConsoleColors.RED + " Map2:Computed StatedAnswer=" + StatedAnswer + " GivenAnswerValue=" + GivenAnswerValue + ConsoleColors.RESET);
            System.out.println(ConsoleColors.RED + " Map2:Computed Exprn=" + Exprn + ConsoleColors.RESET);
            System.out.println(ConsoleColors.RED + " Map2:Given Answer: AnswerMap2=" + AnswerMap2 + ConsoleColors.RESET);
        }

    }

    public static void WrongAnswerStringMap1(int Order, String Exprn, Map<String, Double> variables, String AnswerMap1, String MapType, String IntegrORDiffr) {
        //MathsContxtLAv.Expression expValue = (() -> Double.NaN);
        //MathsContxtLAv.Expression AnswerValue = (() -> Double.NaN);
        MathsContxtLAv.SimpleExpression expSimple = (() -> "");
        MathsContxtLAv.SimpleExpression AnswerValueexpSimple = (() -> "");

        Exprn = eatAll(Exprn, ' ');
        AnswerMap1 = eatAll(AnswerMap1, ' ');
        // Simplest Form of JavaCalculus Regresssion
        //expSimple = parseSimple(Exprn, variables, DiffWithRespTo, GBLSilent, GBLMyLogLevel);
//        if ( (expSimple.SimpleExpr().equalsIgnoreCase(AnswerMap1)) ){
//            
//        }else {
//            WrongAnswerFlagMap1 = true;
//        }
        //Simplest Conformal String Answer MAPS ONTO ITSELF
        if (!AnswerMap1.equalsIgnoreCase("")) {
            AnswerValueexpSimple = parseSimple(AnswerMap1, variables, DiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
        } else {
            System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "WRONG ANSWER String MAP1 Order=" + Order + " NULL STRING" + ConsoleColors.RESET);
            WrongAnswerFlagMap1 = true;
        }
        if ((AnswerValueexpSimple.SimpleExpr().equalsIgnoreCase(AnswerMap1))) {
            WrongAnswerFlagMap1 = false;
        } else {
            WrongAnswerFlagMap1 = true;
        }
        if (WrongAnswerFlagMap1 == true) {
            System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "WRONG ANSWER String MAP1 Order=" + Order + ConsoleColors.RESET);
            System.out.println(ConsoleColors.RED + " StringMap1:Answer=" + AnswerValueexpSimple.SimpleExpr() + ConsoleColors.RESET);
            System.out.println(ConsoleColors.RED + "         Given Ans=" + AnswerMap1 + ConsoleColors.RESET);
        }
    }

    public static void CheckAnsTestSummary(int MaxOrder, TestHarnessClass TestData, String IntegrORDiffr, String xExprnOptionSelected) {
        ruleAnalytics = new RuleAnalytics();
        //ruleAnalyticsFailed = new RuleAnalytics();
//        testResultsPassed = new HashMap<>();
//        testResultsFailed = new HashMap<>();
        WrongAnswerFlagMap1 = false;
        WrongAnswerCountMap1 = 0;
        WrongAnswerFlagMap2 = false;
        WrongAnswerCountMap2 = 0;
        WrongAnswerFlagCalculus1 = false;
        WrongAnswerCountCalculus1 = 0;
        TestCasePassMap1StrCount = 0;
        TestCaseFailMap1StrCount = 0;
        TestCasePassCalcuStrCount = 0;
        TestCaseFailCalcuStrCount = 0;
        TestCasePassMap2StrCount = 0;
        TestCaseFailMap2StrCount = 0;
        String AlgoDispStr = "";
        String AlgoDispIntegrORDiffr = "";

        if (IntegrORDiffr.equalsIgnoreCase("Integr")) {
            AlgoDispStr = "mainIntegrTest";
        } else if (IntegrORDiffr.equalsIgnoreCase("Diffr")) {
            AlgoDispStr = "mainDiffTest";
        }
        if (IntegrORDiffr.equalsIgnoreCase("Integr")) {
            AlgoDispIntegrORDiffr = "Integral";
        } else if (IntegrORDiffr.equalsIgnoreCase("Diffr")) {
            AlgoDispIntegrORDiffr = "Diffrentiation";
        }
        int AllTestCaseOrderPassed = 0;
        int MaxOrder1 = MaxOrder;
        String Exprn = "";
        String OverallRegressionStatus = "Pass All (100 to 110023) Except Test Cases: "
                + "\n" + "TestCases:Unit Test Cases" + " All Passing"
                + "\n" + "TestCases:Names " + " All Passing"
                + "\n" + "TestCases:Coefficients " + " 20016 , 20017"
                + "\n" + "TestCases:Exponent " + " 30006 to 30008"
                + "\n" + "TestCases:Parentheses " + " 80001 to 80024";
        System.out.print(ConsoleColors.BLUE + AlgoDispIntegrORDiffr + " : Overall Regression Status" + OverallRegressionStatus + ConsoleColors.RESET);
        System.out.print(System.lineSeparator());
        if (EndTestCase > LastTestCaseHarness) {
            EndTestCase = LastTestCaseHarness;
        }
        System.out.println(ConsoleColors.BLUE + AlgoDispStr + "EndTestCase=" + EndTestCase + " LastTestCaseHarness=" + LastTestCaseHarness + ConsoleColors.RESET);
        if (EndTestCase < TestCase) {
            EndTestCase = TestCase;
        }
        long j = TestCase;
        EqnDB.clear();
        FailedTestCases.clear();
        ExceptionTestCases.clear();
        WrongAnsTestCasesMap1.clear();
        WrongAnsTestCasesMap2.clear();
        WrongAnsTestCasesCalculus1.clear();
        ByPassed.clear();
        MissedNumber.clear();
        NULLStrTestCases.clear();
        KnownIssuesTestCases.clear();
        FailedCurrRun.clear();

        TotalTestCases = 0;
        NullTestCases = 0;
        KnownIssues = 0;
        CoreKnownIssues = 0;

        ByPassedTestCases = 0;
        MissedNumberTestCases = 0;
        MaxIndexByPassedTest = 0;
        MaxIndexMissedNumberTest = 0;

        MissedTestCasesInfinity = 0;
        MissedTestCasesException = 0;

        MaxIndexExcept = 0;
        MaxIndexWrongAnsMap1 = 0;
        MaxIndexWrongAnsCalculus1 = 0;
        MaxIndexWrongAnsMap2 = 0;

        MaxIndexFail = 0;
        SectionIndexFail = 1;
        FailedTestCount = 0;
        PassedTestCount = 0;
        int OldFailedTestCount = FailedTestCount;
        SectionStart = TestCase;
        ExceptionStringDB.clear();

        cause = new Throwable();
        EqnDBIndex = 0;
        EqnDBDupCount = 0;
        int OldDups = EqnDBDupCount;
        long OldTestCase = j;
        int OldMaxIndexFail = 0;
        int OldTotalTestCases = 0;
        int OldKnwnI = 0;
        int OldKnwnISectionStart = 0;
        int OldInvertAnsBothFlippedCount = 0;
        int OldInvertAnsFlippedCount = 0;
        boolean DupFlag = false;
        while (j <= EndTestCase) {
            EqnUnderTest = "";
            Order = 1;
            DupFlag = false;
            KnownIssueTestCasesFlag = false;
            CoreKnownIssuesTestCasesFlag = false;
            if (j == SectionTestCaseStart) {
                OldKnwnI = KnownIssues - OldKnwnI;
            }
            String TempExprn = "";

            TempExprn = TestHarnessDiff(AlgoDispStr, j, xExprnOptionSelected);
            Exprn = eatAll(TempExprn, ' ');
            DupFlag = DupChecknInsert(j);
            TestCasePassHighLevelFlag = false;
            if (AlgoDispStr.equalsIgnoreCase("mainIntegrTest")) {
                if (MaxOrder == -1) {
                    MaxOrder1 = MaxIntegreOrder; //From Test Case
                } else if (MaxOrder >= MaxIntegreOrder) {
                    MaxOrder1 = MaxIntegreOrder;
                } else {
                    MaxOrder1 = MaxOrder;
                }
            } else if (AlgoDispStr.equalsIgnoreCase("mainDiffTest")) {
                if (MaxOrder == -1) {
                    MaxOrder1 = MaxDiffOrder; //From Test Case
                } else if (MaxOrder >= MaxDiffOrder) {
                    MaxOrder1 = MaxDiffOrder;
                } else {
                    MaxOrder1 = MaxOrder;
                }
            }
            OldMaxIndexFail = MaxIndexFail;
            if (AlgoDispStr.equalsIgnoreCase("mainIntegrTest")) {
                if (xExprnOptionSelected.equalsIgnoreCase("CheckAnswersValue")) {
                    CheckValueOrderLoop(MaxOrder1, j, Exprn, DupFlag, IntegrORDiffr);
                } else if (xExprnOptionSelected.equalsIgnoreCase("CheckAnswersString")) {
                    CheckStrAnsOrderLoop(MaxOrder1, j, Exprn, DupFlag, IntegrORDiffr);
                } else if (xExprnOptionSelected.equalsIgnoreCase("Idempontency")) {
                    CheckIdempontencyOrderLoop(MaxOrder1, j, Exprn, DupFlag, IntegrORDiffr, AlgoDispStr);
                }
                if ((TestCasePassHighLevelFlag) /*&& (Order == MaxOrder1)*/) {
                    TotalTestCases++;
                    PassedTestCount++;
                    ruleAnalytics.setTestCaseStatus("" + TestCase, true);
                    //ruleAnalyticsFailed.recordReasoningDelete();
                } else if ((KnownIssueTestCasesFlag == false) && (CoreKnownIssuesTestCasesFlag == false)) {
                    FailedCurrRun.put(FailedTestCount, "" + TestCase);
                    ruleAnalytics.setTestCaseStatus("" + TestCase, false);
                    //ruleAnalyticsPassed.recordReasoningDelete();
                    FailedTestCount++;
                    TotalTestCases++;
                } else {
                    TotalTestCases++;
                }
                if (/*(!Exprn.equalsIgnoreCase("")) &&*/(!EqnSolArrayMap4[Order].equalsIgnoreCase("")) && (!EqnSolArrayMap3[Order].equalsIgnoreCase(""))) {

                } else if ((TestCasePassHighLevelFlag == false) && ((KnownIssueTestCasesFlag == false) || (CoreKnownIssuesTestCasesFlag == false))) {
                    NullTestCasesFlag = true;
                    if (!NullTestCasesFlag) {
                        FailedTestCount++;
                    }
                    TestCasePassHighLevelFlag = false;
                    NullTestCases++;
                    NULLStrTestCases.put(NullTestCases, "" + TestCase);
                    NullTestCasesFlag = false;
                }
            } else if (AlgoDispStr.equalsIgnoreCase("mainDiffTest")) {
                if (xExprnOptionSelected.equalsIgnoreCase("CheckAnswersValue")) {
                    CheckValueOrderLoop(MaxOrder1, j, Exprn, DupFlag, IntegrORDiffr);
                } else if (xExprnOptionSelected.equalsIgnoreCase("CheckAnswersString")) {
                    CheckStrAnsOrderLoop(MaxOrder1, j, Exprn, DupFlag, IntegrORDiffr);
                } else if (xExprnOptionSelected.equalsIgnoreCase("Idempontency")) {
                    CheckIdempontencyOrderLoop(MaxOrder1, j, Exprn, DupFlag, IntegrORDiffr, AlgoDispStr);
                }
                if ((TestCasePassHighLevelFlag)) {
                    TotalTestCases++;
                    PassedTestCount++;
                    ruleAnalytics.setTestCaseStatus("" + TestCase, false);
                    //ruleAnalyticsFailed.recordReasoningDelete();
                } else if ((KnownIssueTestCasesFlag == false) || (CoreKnownIssuesTestCasesFlag == false)) {
                    FailedCurrRun.put(FailedTestCount, "" + TestCase);
                    FailedTestCount++;
                    TotalTestCases++;
                    ruleAnalytics.setTestCaseStatus("" + TestCase, false);
                    //ruleAnalyticsPassed.recordReasoningDelete();
                } else {
                    TotalTestCases++;
                }
                if (/*(!Exprn.equalsIgnoreCase("")) &&*/(!EqnSolArrayMap2[Order].equalsIgnoreCase("")) && (!EqnSolArrayMap1[Order].equalsIgnoreCase(""))) {

                } else if ((TestCasePassHighLevelFlag == false) && ((KnownIssueTestCasesFlag == false) || (CoreKnownIssuesTestCasesFlag == false))) {
                    NullTestCasesFlag = true;
                    if (!NullTestCasesFlag) {
                        FailedTestCount++;
                    }
                    TestCasePassHighLevelFlag = false;
                    NullTestCases++;
                    NULLStrTestCases.put(NullTestCases, "" + TestCase);
                    NullTestCasesFlag = false;
                }
            }
            OldTestCase = j;
            j = RegressionControl(j);
            if (((j - OldTestCase) > 1)) {
                if (j == SectionTestCaseEnd) {
                    OldKnwnI = KnownIssues - OldKnwnISectionStart;
                }
                GapProcess(AlgoDispStr, j, OldTotalTestCases, OldTestCase, OldMaxIndexFail, OldFailedTestCount, OldDups, OldKnwnI, EqnDBDupCount, OldInvertAnsBothFlippedCount, OldInvertAnsFlippedCount);
                OldFailedTestCount = FailedTestCount;
                OldDups = EqnDBDupCount;
                SectionStart = j;
                OldTotalTestCases = TotalTestCases;
            }
            TestCase = j;
            //System.out.println(ConsoleColors.RED +"mainIntegrTest: j="+ j + " TestCase=" + TestCase);
        }
        GapProcess(AlgoDispStr, j, OldTotalTestCases, OldTestCase, OldMaxIndexFail, OldFailedTestCount, OldDups, OldKnwnI, EqnDBDupCount, OldInvertAnsBothFlippedCount, OldInvertAnsFlippedCount);
        int k = 0;
        for (int y = 0; (y < EqnDB.size()); y++) {
            String Temp = EqnDB.get(y);
            if ((Temp != null) && (Temp.contains(":Dup with"))) {
                k++;
            }
        }
        System.out.println(ConsoleColors.RED + AlgoDispStr + ": TestCase  Final Summary : Total Failed=" + FailedTestCount + " Out of Run TestCases-Dups=" + (TotalTestCases) + " Passed Count=" + PassedTestCount/*(TotalTestCases - FailedTestCount)*/ + " NullTestCases=" + NullTestCases + " KnownIssues=" + KnownIssues + " CoreKnownIssues=" + CoreKnownIssues + ConsoleColors.RESET);
        System.out.println(ConsoleColors.RED + AlgoDispStr + ": TestCase Summary : DupCount=" + k + " Total Exceptions=" + MaxIndexExcept /*+ " WrongAnswerCountMap1=" + WrongAnswerCountMap1 + " WrongAnswerCountCalculus1=" + WrongAnswerCountCalculus1 + " WrongAnswerCountMap2=" + WrongAnswerCountMap2 */ + ConsoleColors.RESET);
        System.out.println(ConsoleColors.RED + AlgoDispStr + ": TestCase Summary : InvertAnsFlippedCount=" + InvertAnsFlippedCount + " InvertAnsBothFlippedCount=" + InvertAnsBothFlippedCount + " StaleAnswerCount=" + StaleAnswerCount + " FailAnswerCount=" + FailAnswerCount + ConsoleColors.RESET);
        SummariesPrintAns(AlgoDispStr);
        ruleAnalytics = null;
        //ruleAnalyticsFailed = null;
//        testResultsPassed = null;
//        testResultsFailed = null;
    }

    public static void CheckValueOrderLoop(int MaxOrder1, long j, String Exprn, boolean DupFlag, String IntegrORDiffr) {
        String AlgoDispStr = "";
        boolean OldTestCasePassHighLevelFlag = false;

        if (IntegrORDiffr.equalsIgnoreCase("Integr")) {
            AlgoDispStr = "mainIntegrTest";
        } else if (IntegrORDiffr.equalsIgnoreCase("Diffr")) {
            AlgoDispStr = "mainDiffrTest";
        }
        int AllTestCaseOrderPassed = 0;
        for (double x = 1.0, y = 7.0; Order < MaxOrder1; y++, /*x++,*/ Order++) {
            if ((IntegrORDiffr.equalsIgnoreCase("Integr")) && (Order > 1)) {
                Exprn = EqnSolArrayMap4[Order - 1];
            } else if ((IntegrORDiffr.equalsIgnoreCase("Diffr")) && (Order > 1)) {
                Exprn = EqnSolArrayMap2[Order - 1];
            }
            variables.put(DiffWithRespTo, x);
            variables.put("y", y);
            variables.put("a", 1.0);
            variables.put("b", 2.0);//variables.put("b", 0.0);
            variables.put("c", -1.0);
            variables.put("d", 2.0);
            variables.put("m", -1.0);
            variables.put("p", 3.0);
            variables.put("q", 0.0);
            variables.put("r", -1.0);
            variables.put("s", 2.0);
            variables.put("i", 1.0);
            variables.put("E1", 1.0);
            if (/*(!Exprn.equalsIgnoreCase("")) && */((DupFlag == false))) {
                WrongAnswerFlagMap1 = true;
                if (IntegrORDiffr.equalsIgnoreCase("Integr")) {
                    WrongAnswerMap1(Exprn, variables, EqnSolArrayMap3[Order], MaxOrder1);
                } else if (IntegrORDiffr.equalsIgnoreCase("Diffr")) {
                    WrongAnswerMap1(Exprn, variables, EqnSolArrayMap1[Order], MaxOrder1);
                }
                System.out.println(IntegrORDiffr + " WrongAnswerFlagMap1=" + WrongAnswerFlagMap1 + " TestCasePassHighLevelFlag=" + TestCasePassHighLevelFlag + " Exprn=" + Exprn);
                if ((WrongAnswerFlagMap1 == true) /*&& (Order == 1)*/) {
                    if (Order == 1) {
                        WrongAnswerCountMap1++;
                    }
                    WrongAnsTestCasesMap1.put(MaxIndexWrongAnsMap1, TestCase + " ;");
                    if (Order == 1) {
                        MaxIndexWrongAnsMap1++;
                    }
                    TestCasePassHighLevelFlag = false;
                    TestCasePassValFlag = false;
                }
                //}
                WrongAnswerFlagMap2 = true;
                if (IntegrORDiffr.equalsIgnoreCase("Integr")) {
                    WrongAnswerMap2(EqnSolArrayIntegrAlone[Order], variables, EqnSolArrayMap4[Order], MaxOrder1);
                } else if (IntegrORDiffr.equalsIgnoreCase("Diffr")) {
                    WrongAnswerMap2(EqnSolArrayDiffAlone[Order], variables, EqnSolArrayMap2[Order], MaxOrder1);
                }
                if ((WrongAnswerFlagMap1 == false) && (WrongAnswerFlagMap2 == false)) {
                    TestCasePassHighLevelFlag = true;
                }
                System.out.println(IntegrORDiffr + " WrongAnswerFlagMap2=" + WrongAnswerFlagMap2 + " TestCasePassHighLevelFlag=" + TestCasePassHighLevelFlag + " Exprn=" + Exprn);
                if ((WrongAnswerFlagMap2 == true) /*&& (Order == 1)*/) {
                    if (Order == MaxOrder1) {
                        WrongAnswerCountMap2++;
                    }
                    WrongAnsTestCasesMap2.put(MaxIndexWrongAnsMap2, TestCase + " ;");
                    if (Order == MaxOrder1) {
                        MaxIndexWrongAnsMap2++;
                    }
                    TestCasePassHighLevelFlag = false;
                    TestCasePassValFlag = false;
                }

                if (((WrongAnswerFlagMap1 == true) || (WrongAnswerFlagMap2 == true)) && (TestCasePassHighLevelFlag == false)) {
                    String Temp = FailedTestCases.get(MaxIndexFail);
                    String HashVal = "";
                    if ((TestCaseFailCoarseReportingFlag == false) && (Temp != null) && (Order >= 2) && (!Temp.equalsIgnoreCase("")) && (!Temp.contains("Section"))) {
                        HashVal = Temp + "TestCase=" + TestCase + "," + ":Order=" + (Order) + " ,";
                    } else if (TestCaseFailCoarseReportingFlag == false) {
                        HashVal = "TestCase=" + TestCase + ":Order=" + (Order) + " ,";
                    } else if ((TestCaseFailCoarseReportingFlag == true) && (Order == 1) && (Temp != null)) {
                        //HashVal = "TestCase=" + TestCase + "," + ":Order=" + (Order) ;
                        HashVal = Temp + "," + "|| (j==" + TestCase + ") || ";
                    } else if ((TestCaseFailCoarseReportingFlag == true) && (Temp != null)) {
                        //HashVal = Temp +"," + ":Order=" + (Order) ;
                        HashVal = Temp;
                    } else {
                        HashVal = "(j==" + TestCase + ")";
                    }
                    FailedTestCases.put(MaxIndexFail, HashVal);
                    TestCasePassHighLevelFlag = false;
                }

                System.out.println(ConsoleColors.RED + AlgoDispStr + ": j=" + j + " TestCase=" + TestCase + " Order=" + Order);
                if ((OldTestCasePassHighLevelFlag == true) && (TestCasePassHighLevelFlag == false) && (Order < MaxOrder1)) {
                    Order = MaxOrder1 - 1;
                    TestCasePassHighLevelFlag = OldTestCasePassHighLevelFlag;
                    System.out.println(ConsoleColors.BLUE + " Getting First Failure but previous pass. Passing the TestCase." + AlgoDispStr + ": j=" + j + " TestCase=" + TestCase + " Order=" + Order);
                    break;
                } else if ((OldTestCasePassHighLevelFlag == false) && (TestCasePassHighLevelFlag == false) && (Order < MaxOrder1)) {
                    Order = MaxOrder1 - 1;
                    TestCasePassHighLevelFlag = false;
                    System.out.println(ConsoleColors.RED + " Getting First Failure but previous FAIL. Failing the TestCase." + AlgoDispStr + ": j=" + j + " TestCase=" + TestCase + " Order=" + Order);
                    break;
                } else if ((OldTestCasePassHighLevelFlag == false) && (TestCasePassHighLevelFlag == true) && (Order < MaxOrder1)) {
                    OldTestCasePassHighLevelFlag = TestCasePassHighLevelFlag;
                }
            } else if (DupFlag == true) {
                System.out.println(ConsoleColors.RED + AlgoDispStr + ": j=" + j + " TestCase=" + TestCase + " Dup. Hence NOT Executing.");

            }
            if ((WrongAnswerFlagMap1 == false) && (WrongAnswerFlagMap2 == false)) {
                AllTestCaseOrderPassed++;
            }
        }
        if ((WrongAnswerFlagMap1 == false) && (WrongAnswerFlagMap2 == false) && (AllTestCaseOrderPassed == (Order - 1))) {
            TestCasePassHighLevelFlag = true;
        }
        if (TestCasePassHighLevelFlag == false) {
            if (Order == MaxOrder1) {
                MaxIndexFail++;
            }
        }
    }

    public static void CheckStrAnsOrderLoop(int MaxOrder1, long j, String Exprn, boolean DupFlag, String IntegrORDiffr) {
        String AlgoDispStr = "";
        if (IntegrORDiffr.equalsIgnoreCase("Integr")) {
            AlgoDispStr = "mainIntegrTest";
        } else if (IntegrORDiffr.equalsIgnoreCase("Diffr")) {
            AlgoDispStr = "mainDiffrTest";
        }
        int AllTestCaseOrderPassed = 0;
        String MapType = "Map1";
        for (double x = 1.0, y = 7.0; Order < MaxOrder1; y++, /*x++,*/ Order++) {
            if ((IntegrORDiffr.equalsIgnoreCase("Integr")) && (Order > 1)) {
                Exprn = EqnSolArrayMap4[Order - 1];
            } else if ((IntegrORDiffr.equalsIgnoreCase("Diffr")) && (Order > 1)) {
                Exprn = EqnSolArrayMap2[Order - 1];
            }
            variables.put(DiffWithRespTo, x);
            variables.put("y", y);
            variables.put("a", 1.0);
            variables.put("b", 2.0);//variables.put("b", 0.0);
            variables.put("c", -1.0);
            variables.put("d", 2.0);
            variables.put("m", -1.0);
            variables.put("p", 3.0);
            variables.put("q", 0.0);
            variables.put("r", -1.0);
            variables.put("s", 2.0);
            variables.put("i", 1.0);
            variables.put("E1", 1.0);
            if (/*(!Exprn.equalsIgnoreCase("")) && */((DupFlag == false))) {
                WrongAnswerFlagMap1 = false;
                //if (Order == 1) {
                if (IntegrORDiffr.equalsIgnoreCase("Integr")) {
                    WrongAnswerStringMap1(Order, Exprn, variables, EqnSolArrayMap3[Order], MapType, IntegrORDiffr);
                } else if (IntegrORDiffr.equalsIgnoreCase("Diffr")) {
                    WrongAnswerStringMap1(Order, Exprn, variables, EqnSolArrayMap1[Order], MapType, IntegrORDiffr);
                }
                if ((WrongAnswerFlagMap1 == true)) {
                    WrongAnswerCountMap1++;
                    WrongAnsTestCasesMap1.put(MaxIndexWrongAnsMap1, TestCase + " ;");
                    MaxIndexWrongAnsMap1++;
                    TestCasePassHighLevelFlag = false;
                }
                //}
                if (TestCasePassHighLevelFlag == false) {
                    String Temp = FailedTestCases.get(MaxIndexFail);
                    String HashVal = "";
                    if ((TestCaseFailCoarseReportingFlag == false) && (Temp != null) && (Order >= 2) && (!Temp.equalsIgnoreCase("")) && (!Temp.contains("Section"))) {
                        HashVal = Temp + "," + ":Order=" + (Order);
                    } else if (TestCaseFailCoarseReportingFlag == false) {
                        HashVal = "TestCase=" + TestCase + ":Order=" + (Order);
                    } else if ((TestCaseFailCoarseReportingFlag == true) && (Order == 1) && (Temp != null)) {
                        //HashVal = "TestCase=" + TestCase + "," + ":Order=" + (Order) ;
                        HashVal = Temp + "," + "(j==" + TestCase + ")";
                    } else if ((TestCaseFailCoarseReportingFlag == true) && (Temp != null)) {
                        //HashVal = Temp +"," + ":Order=" + (Order) ;
                        HashVal = Temp;
                    } else {
                        HashVal = "(j==" + TestCase + ")";
                    }
                    FailedTestCases.put(MaxIndexFail, HashVal);
                    //i=MaxOrder1;
                    TestCasePassHighLevelFlag = false;
                }
            } else if (DupFlag == true) {
                System.out.println(ConsoleColors.RED + "mainValue:" + AlgoDispStr + ": j=" + j + " TestCase=" + TestCase + " Dup. Hence NOT Executing.");
            }
            if ((WrongAnswerFlagMap1 == false)) {
                AllTestCaseOrderPassed++;
            }
        }
        if ((WrongAnswerFlagMap1 == false) && (AllTestCaseOrderPassed == (Order - 1))) {
            TestCasePassHighLevelFlag = true;
        }
        if (TestCasePassHighLevelFlag == false) {
            if (Order == MaxOrder1) {
                MaxIndexFail++;
            }
        }
    }

    public static void FileBasedTest(int MaxOrder, TestHarnessClass TestData, String IntegrORDiffr, String xExprnOptionSelected) {
        ruleAnalytics = new RuleAnalytics();
        //ruleAnalyticsFailed = new RuleAnalytics();
//        testResultsPassed = new HashMap<>();
//        testResultsFailed = new HashMap<>();
        String AlgoDispStr = "";
        String AlgoDispIntegrORDiffr = "";

        if (IntegrORDiffr.equalsIgnoreCase("Integr")) {
            AlgoDispStr = "mainIntegrTest";
        } else if (IntegrORDiffr.equalsIgnoreCase("Diffr")) {
            AlgoDispStr = "mainDiffTest";
        }
        if (IntegrORDiffr.equalsIgnoreCase("Integr")) {
            AlgoDispIntegrORDiffr = "Integral";
        } else if (IntegrORDiffr.equalsIgnoreCase("Diffr")) {
            AlgoDispIntegrORDiffr = "Diffrentiation";
        }
        String MapType = "Map1";
        int AllTestCaseOrderPassed = 0;

        WrongAnswerFlagMap1 = false;
        WrongAnswerCountMap1 = 0;
        WrongAnswerFlagMap2 = false;
        WrongAnswerCountMap2 = 0;
        WrongAnswerFlagCalculus1 = false;
        WrongAnswerCountCalculus1 = 0;
        TestCasePassMap1StrCount = 0;
        TestCaseFailMap1StrCount = 0;
        TestCasePassCalcuStrCount = 0;
        TestCaseFailCalcuStrCount = 0;
        TestCasePassMap2StrCount = 0;
        TestCaseFailMap2StrCount = 0;
        int MaxOrder1 = MaxOrder;
        String Exprn = "";
        String OverallRegressionStatus = AlgoDispIntegrORDiffr + " : Pass All (4000 to 110023) Except Test Cases: "
                + "\n" + "TestCases:Unit Test Cases" + " All Passing"
                + "\n" + "TestCases:Names " + " All Passing"
                + "\n" + "TestCases:Coefficients " + " 20016 , 20017"
                + "\n" + "TestCases:Exponent " + " 30006 to 30008"
                + "\n" + "TestCases:Parentheses " + " 80001 to 80024";
        System.out.print(ConsoleColors.BLUE + AlgoDispIntegrORDiffr + " : Overall Regression Status" + OverallRegressionStatus + ConsoleColors.RESET);
        System.out.print(System.lineSeparator());
        if (EndTestCase > LastTestCaseHarness) {
            EndTestCase = LastTestCaseHarness;
        }
        System.out.print(ConsoleColors.BLUE + AlgoDispIntegrORDiffr + " EndTestCase=" + EndTestCase + " LastTestCaseHarness=" + LastTestCaseHarness + ConsoleColors.RESET);
        System.out.print(System.lineSeparator());
        if (EndTestCase < TestCase) {
            EndTestCase = TestCase;
        }
        int j = 0;
        FailedTestCases = new HashMap<Integer, String>();
        ExceptionTestCases = new HashMap<Integer, String>();
        ExceptionStringDB = new HashMap<Integer, String>();
        cause = new Throwable();
        TotalTestCases = 0;
        NullTestCases = 0;
        KnownIssues = 0;

        FailedTestCases.clear();
        ExceptionTestCases.clear();
        WrongAnsTestCasesMap1.clear();
        WrongAnsTestCasesMap2.clear();
        WrongAnsTestCasesCalculus1.clear();
        ByPassed.clear();
        MissedNumber.clear();
        NULLStrTestCases.clear();
        KnownIssuesTestCases.clear();
        FailedCurrRun.clear();

        ByPassedTestCases = 0;
        MissedNumberTestCases = 0;
        MaxIndexByPassedTest = 0;
        MaxIndexMissedNumberTest = 0;

        MissedTestCasesInfinity = 0;
        MissedTestCasesException = 0;

        MaxIndexExcept = 0;
        MaxIndexWrongAnsMap1 = 0;
        MaxIndexWrongAnsCalculus1 = 0;
        MaxIndexWrongAnsMap2 = 0;

        MaxIndexFail = 0;
        SectionIndexFail = 1;
        FailedTestCount = 0;
        PassedTestCount = 0;
        int OldFailedTestCount = FailedTestCount;
        SectionStart = TestCase;
        EqnDB = new HashMap<>();

        EqnDBIndex = 0;
        EqnDBDupCount = 0;
        int OldDups = EqnDBDupCount;
        int OldTestCase = j;
        int OldMaxIndexFail = 0;
        int OldTotalTestCases = 0;
        boolean DupFlag = false;
        IgnoreKnownIssuesFlag = true;
        FileInputStream fpinput = null;
        if (j == 0) {
            fpinput = File_fopen(IntegrORDiffr, xExprnOptionSelected);
            Myfscanf(fpinput);
        }
        TestCaseIndexFBT = 0;
        while ((TestCaseIndexFBT < KnownIssuesCSV.length)) {
            EqnUnderTest = "";
            KnownIssueTestCasesFlag = false;
            DupFlag = false;
            String TempExprn = "";
            // Get the next Test Case from File
            String TempTestCase = "";
            if (TestCaseIndexFBT < KnownIssuesCSV.length) {
                TempTestCase = KnownIssuesCSV[TestCaseIndexFBT++];
            }
            //System.out.println("FileBasedTest:j="+j);

            j = Integer.parseInt(TempTestCase);
            TestCase = j;
            TempExprn = TestHarnessDiff(AlgoDispStr, j, xExprnOptionSelected);
            Exprn = eatAll(TempExprn, ' ');
            DupFlag = DupChecknInsert(j);

            TestCasePassHighLevelFlag = false;
            if (IntegrORDiffr.equalsIgnoreCase("Diffr")) {
                if (MaxOrder == -1) {
                    MaxOrder1 = MaxDiffOrder; //From Test Case
                } else if (MaxOrder >= MaxDiffOrder) {
                    MaxOrder1 = MaxDiffOrder;
                } else {
                    MaxOrder1 = MaxOrder;
                }
            } else if (IntegrORDiffr.equalsIgnoreCase("Integr")) {
                if (MaxOrder == -1) {
                    MaxOrder1 = MaxIntegreOrder; //From Test Case
                } else if (MaxOrder >= MaxIntegreOrder) {
                    MaxOrder1 = MaxIntegreOrder;
                } else {
                    MaxOrder1 = MaxOrder;
                }
            }
            Order = 1;
            OldMaxIndexFail = MaxIndexFail;
            if (/*(!Exprn.equalsIgnoreCase("")) && */((DupFlag == false))) {
                if (IntegrORDiffr.equalsIgnoreCase("Diffr")) {
                    {
                        if ((KnownIssueTestCasesFlag == false) && (!Exprn.equalsIgnoreCase("")) && (!EqnSolArrayMap2[Order].equalsIgnoreCase("")) && (!EqnSolArrayMap1[Order].equalsIgnoreCase(""))) {
                            if (AITestResultsGenFlag) {
                                AIDiffSingleHighTestCase(MaxOrder1, Exprn, MapType, IntegrORDiffr, xExprnOptionSelected);
                            } else {
                                DiffSingleHighTestCase(MaxOrder1, Exprn, MapType, IntegrORDiffr, xExprnOptionSelected);
                            }
                        }
                        if (TestCasePassHighLevelFlag) {
                            TotalTestCases++;
                            PassedTestCount++;
                        } else {
                            FailedTestCases.put(MaxIndexFail, "" + TestCase + " Order=" + Order + ",");
                            FailedCurrRun.put(FailedTestCount, "" + TestCase);
                            MaxIndexFail++;
                            FailedTestCount++;
                            TotalTestCases++;
                        }
                    }
//                    } else if (KnownIssueTestCasesFlag == false) {
//                        NullTestCasesFlag = true;
//                        if (!NullTestCasesFlag) {
//                            FailedTestCount++;
//                        }
//                        TestCasePassHighLevelFlag = false;
//                        TotalTestCases++;
//                        NullTestCases++;
//                        NULLStrTestCases.put(NullTestCases, "" + TestCase );
//                        NullTestCasesFlag = false;
//                    } 
//                    else {
//                        TotalTestCases++;
//                    }
                } else if (IntegrORDiffr.equalsIgnoreCase("Integr")) {
                    {
                        if ((KnownIssueTestCasesFlag == false) && (!Exprn.equalsIgnoreCase("")) && (!EqnSolArrayMap4[Order].equalsIgnoreCase("")) && (!EqnSolArrayMap3[Order].equalsIgnoreCase(""))) {
                            if (AITestResultsGenFlag) {
                                AIIntegralHighSingleTest(MaxOrder1, Exprn, MapType, IntegrORDiffr, xExprnOptionSelected);
                            } else {
                                IntegralHighSingleTest(MaxOrder1, Exprn, MapType, IntegrORDiffr, xExprnOptionSelected);
                            }
                        }
                        if (TestCasePassHighLevelFlag) {
                            TotalTestCases++;
                            PassedTestCount++;
                        } else {
                            FailedTestCases.put(MaxIndexFail, "" + TestCase + " Order=" + Order + ",");
                            FailedCurrRun.put(FailedTestCount, "" + TestCase);
                            MaxIndexFail++;
                            FailedTestCount++;
                            TotalTestCases++;
                        }
                    }
//                    } else if (KnownIssueTestCasesFlag == false) {
//                        NullTestCasesFlag = true;
//                        if (!NullTestCasesFlag) {
//                            FailedTestCount++;
//                        }
//                        TestCasePassHighLevelFlag = false;
//                        TotalTestCases++;
//                        NullTestCases++;
//                        NULLStrTestCases.put(NullTestCases, "" + TestCase );
//                        NullTestCasesFlag = false;
//                    } else {
//                        TotalTestCases++;
//                    }
                }
                System.out.println(ConsoleColors.RED + AlgoDispStr + ": j=" + j + " TestCase=" + TestCase);
            } else if (DupFlag == true) {
                System.out.println(ConsoleColors.RED + AlgoDispStr + ": j=" + j + " TestCase=" + TestCase + " Dup. Hence NOT Executing.");

            }
        }
        int k = 0;
        for (int y = 0; (y < EqnDB.size()); y++) {
            String Temp = EqnDB.get(y);
            if ((Temp != null) && (Temp.contains(":Dup with"))) {
                k++;
            }
        }
        System.out.println(ConsoleColors.RED + AlgoDispStr + ": TestCase Final Summary : Total Failed=" + FailedTestCount + " Out of Run TestCases-Dups=" + (TotalTestCases) + " Passed Count=" + PassedTestCount/*(TotalTestCases - FailedTestCount)*/ + " NullTestCases=" + NullTestCases + " KnownIssues=" + KnownIssues + ConsoleColors.RESET);
        System.out.println(ConsoleColors.RED + AlgoDispStr + ": TestCase Summary : DupCount=" + k + " Total Exceptions=" + MaxIndexExcept + " WrongAnswerCountMap1=" + WrongAnswerCountMap1 + " WrongAnswerCountCalculus1=" + WrongAnswerCountCalculus1 + " WrongAnswerCountMap2=" + WrongAnswerCountMap2 + ConsoleColors.RESET);
        System.out.println(ConsoleColors.RED + AlgoDispStr + ": TestCase Summary : ByPassedTestCases=" + ByPassedTestCases + " MissedNumberTestCases=" + MissedNumberTestCases + " MissedTestCasesInfinity=" + MissedTestCasesInfinity + " MissedTestCasesException=" + MissedTestCasesException + ConsoleColors.RESET);
        System.out.println(ConsoleColors.RED + AlgoDispStr + ": TestCase Summary : Map1:PassMap1Count=" + TestCasePassMap1StrCount + " Fail=" + TestCaseFailMap1StrCount + ConsoleColors.RESET);
        System.out.println(ConsoleColors.RED + AlgoDispStr + ": TestCase Summary : Calcu:PassCalcuCount=" + TestCasePassCalcuStrCount + " Fail=" + TestCaseFailCalcuStrCount + ConsoleColors.RESET);
        System.out.println(ConsoleColors.RED + AlgoDispStr + ": TestCase Summary : Map2:PassMap2Count=" + TestCasePassMap2StrCount + " Fail=" + TestCaseFailMap2StrCount + ConsoleColors.RESET);
        for (int y = 0; (FailedTestCases != null) && (y <= FailedTestCases.size()); y++) {
            if ((y <= FailedTestCases.size()) && (FailedTestCases.get(y) != null)) {
                if ((FailedTestCases.get(y).contains("Section")) && (FailedTestCases.get(y).contains("Complete # of Failures="))) {
                    System.out.print(ConsoleColors.GREEN + FailedTestCases.get(y) + ConsoleColors.RESET);
                }
            }
        }
        System.out.print(System.lineSeparator());
        System.out.println(ConsoleColors.RED + AlgoDispStr + ": TestCase Summary : " + " Failed Test Cases are:" + ConsoleColors.RESET);

        for (int y = 0; (y <= FailedTestCases.size()); y++) {
            if (FailedTestCases.get(y) != null) {
                System.out.print(ConsoleColors.RED + " " + FailedTestCases.get(y) + ", " + ConsoleColors.RESET);
                if ((y != 0) && (y % 5 == 0)) {
                    System.out.print(System.lineSeparator());
                }
            }
        }
        System.out.print(System.lineSeparator());
        System.out.println(ConsoleColors.RED + AlgoDispStr + ": Exception TestCase Summary : Total Exceptions=" + MaxIndexExcept + " Exception Test Cases are:" + ConsoleColors.RESET);
        for (int y = 0; y < MaxIndexExcept; y++) {
            System.out.print(ConsoleColors.RED + " " + ExceptionTestCases.get(y) + ", " + ConsoleColors.RESET);
            if ((y != 0) && (y % 5 == 0)) {
                System.out.print(System.lineSeparator());
            }
        }

        System.out.println(ConsoleColors.RED + AlgoDispStr + ": TestCase Duplicate Summary : " + " EqnDBIndex=" + EqnDBIndex + ConsoleColors.RESET);
        for (int y = 0; (y <= EqnDB.size()); y++) {
            String Temp = EqnDB.get(y);
            if ((Temp != null) && (Temp.contains(":Dup with"))) {
                System.out.print(ConsoleColors.GREEN + EqnDB.get(y) + ConsoleColors.RESET);
                System.out.print(System.lineSeparator());
            }
        }
        System.out.println(ConsoleColors.RED + AlgoDispStr + ": TestCase Duplicate Summary : Total Dups=" + k + ConsoleColors.RESET);
        System.out.print(System.lineSeparator());
        for (int y = 0; y < MaxIndexExcept; y++) {
            System.out.println(ConsoleColors.RED + " " + ExceptionStringDB.get(y) + ", " + ConsoleColors.RESET);
        }
        System.out.print(System.lineSeparator());
        System.out.print(System.lineSeparator());
        System.out.println(ConsoleColors.BLUE + AlgoDispStr + ": Wrong Answer TestCase Summary :Map1: Total Wrong=" + MaxIndexWrongAnsMap1 + " Wrong Answer Test Cases are:" + ConsoleColors.RESET);
        for (int y = 0; y < MaxIndexWrongAnsMap1; y++) {
            System.out.print(ConsoleColors.RED + " " + WrongAnsTestCasesMap1.get(y) + ", " + ConsoleColors.RESET);
            if ((y != 0) && (y % 5 == 0)) {
                System.out.print(System.lineSeparator());
            }
        }
        System.out.print(System.lineSeparator());
        System.out.println(ConsoleColors.BLUE + AlgoDispStr + ": Wrong Answer TestCase Summary :Calculus1: Total Wrong=" + MaxIndexWrongAnsCalculus1 + " Wrong Answer Test Cases are:" + ConsoleColors.RESET);
        for (int y = 0; y < MaxIndexWrongAnsCalculus1; y++) {
            System.out.print(ConsoleColors.RED + " " + WrongAnsTestCasesCalculus1.get(y) + ", " + ConsoleColors.RESET);
            if ((y != 0) && (y % 5 == 0)) {
                System.out.print(System.lineSeparator());
            }
        }
        System.out.print(System.lineSeparator());
        System.out.println(ConsoleColors.BLUE + AlgoDispStr + ": Wrong Answer TestCase Summary :Map2: Total Wrong=" + MaxIndexWrongAnsMap2 + " Wrong Answer Test Cases are:" + ConsoleColors.RESET);
        for (int y = 0; y < MaxIndexWrongAnsMap2; y++) {
            System.out.print(ConsoleColors.RED + " " + WrongAnsTestCasesMap2.get(y) + ", " + ConsoleColors.RESET);
            if ((y != 0) && (y % 5 == 0)) {
                System.out.print(System.lineSeparator());
            }
        }
        System.out.print(System.lineSeparator());
        System.out.println(ConsoleColors.BLUE + AlgoDispStr + ": ByPassedTestCases TestCase Summary : Total ByPassed=" + MaxIndexByPassedTest + " ByPassed Test Cases are:" + ConsoleColors.RESET);
        for (int y = 0; y < MaxIndexByPassedTest; y++) {
            System.out.print(ConsoleColors.RED + " " + ByPassed.get(y) + ", " + ConsoleColors.RESET);
            if ((y != 0) && (y % 5 == 0)) {
                System.out.print(System.lineSeparator());
            }
        }
        System.out.print(System.lineSeparator());
        System.out.println(ConsoleColors.BLUE + AlgoDispStr + ": MissedNumberTestCases TestCase Summary : Total MissedNumber=" + MaxIndexMissedNumberTest + " MissedNumber Test Cases are:" + ConsoleColors.RESET);
        for (int y = 0; (y < MaxIndexMissedNumberTest); y++) {
            if (MissedNumber.get(y) != null) {
                System.out.print(ConsoleColors.RED + " " + MissedNumber.get(y) + ", " + ConsoleColors.RESET);
                if ((y != 0) && (y % 5 == 0)) {
                    System.out.print(System.lineSeparator());
                }
            }
        }
        System.out.print(System.lineSeparator());
        System.out.println(ConsoleColors.BLUE + AlgoDispStr + ": NULL STRING TestCase Summary : Total NULL STRING=" + NullTestCases + " Test Cases are:" + ConsoleColors.RESET);
        for (int y = 0; (y < NullTestCases); y++) {
            if ((NULLStrTestCases.get(y) != null)) {
                System.out.print(ConsoleColors.RED + " " + NULLStrTestCases.get(y) + ", " + ConsoleColors.RESET);
                if ((y != 0) && (y % 5 == 0)) {
                    System.out.print(System.lineSeparator());
                }
            }
        }
        System.out.print(System.lineSeparator());
        System.out.println(ConsoleColors.BLUE + AlgoDispStr + ": KnownIssues TestCase Summary : Total KnownIssues=" + KnownIssues + " Test Cases are:" + ConsoleColors.RESET);
        for (int y = 0; (y <= KnownIssuesTestCases.size()); y++) {
            if ((KnownIssuesTestCases.get(y) != null)) {
                System.out.print(ConsoleColors.RED + " " + KnownIssuesTestCases.get(y) + ", " + ConsoleColors.RESET);
                if ((y != 0) && (y % 5 == 0)) {
                    System.out.print(System.lineSeparator());
                }
            }
        }
        System.out.print(System.lineSeparator());
        System.out.println(ConsoleColors.BLUE + AlgoDispStr + ": Failure in Curr Run Summary : Total Fail in Curr Run=" + FailedTestCount + " Test Cases are:" + ConsoleColors.RESET);
        for (int y = 0; (y <= FailedCurrRun.size()); y++) {
            if ((FailedCurrRun.get(y) != null)) {
                System.out.print(ConsoleColors.RED + " " + FailedCurrRun.get(y) + ", " + ConsoleColors.RESET);
                if ((y != 0) && (y % 5 == 0)) {
                    System.out.print(System.lineSeparator());
                }
            }
        }
        System.out.print(System.lineSeparator());
        // Generate and print the summary
//        System.out.println("===== Passed Rule Summary =====");
//        Map<String, Map<String, Integer>> summary = ruleAnalytics.generateRuleSummary(true);
//        for (Map.Entry<String, Map<String, Integer>> entry : summary.entrySet()) {
//            String rule = entry.getKey();
//            Map<String, Integer> details = entry.getValue();
//            System.out.println("Rule: " + rule);
//            System.out.println(" Frequency: " + details.get("Frequency"));
//            System.out.println(" Passed: " + details.get("Passed"));
//            System.out.println("--------------------------");
//        }
//        System.out.print(System.lineSeparator());
        // Generate and print the summary
//        System.out.println("===== Failed Rule Summary =====");
//        Map<String, Map<String, Integer>> summaryFail = ruleAnalyticsFailed.generateRuleSummary(false);
//        for (Map.Entry<String, Map<String, Integer>> entry : summaryFail.entrySet()) {
//            String rule = entry.getKey();
//            Map<String, Integer> details = entry.getValue();
//            System.out.println("Rule: " + rule);
//            System.out.println(" Frequency: " + details.get("Frequency"));
//            System.out.println(" Failures: " + details.get("Failures"));
//            System.out.println("--------------------------");
//        }
        System.out.println("===== Rule Summary =====");
        // 3️⃣ Generate analytics summary after all test cases are processed
        Map<String, Map<String, Object>> summary = ruleAnalytics.generateRuleSummary();
        for (String rule : summary.keySet()) {
            Map<String, Object> stats = summary.get(rule);
            System.out.println("Rule: " + rule);
            System.out.println(" Frequency: " + stats.get("Frequency"));
            System.out.println(" Passes : " + stats.get("Passes"));
            System.out.println(" Failures : " + stats.get("Failures"));
            System.out.println("--------------------------");
        }
        System.out.print(System.lineSeparator());
        ruleAnalytics = null;
        //ruleAnalyticsFailed = null;
//        testResultsPassed = null;
//        testResultsFailed = null;
    }

    public static FileInputStream File_fopen(String IntegrORDiffr, String NullStrORKnwnI) {
        try {
            FileInputStream fpinput = null;
            String Path = "data\\";
            String msg = "";
            String Inputfile = Path + "JavaCalculusFBT" + IntegrORDiffr + NullStrORKnwnI + ".txt";
            if ((fpinput = new FileInputStream(Inputfile)) == null) {
                msg = "Input: can't open " + Inputfile;
                System.out.println(msg);
                log.error(msg);
            } else {
                System.out.println("FileLocateTestCase:Opened File:Inputfile=" + Inputfile);
            }
            return fpinput;
        } catch (Exception MyExcept) {
            System.out.println(MyExcept.getStackTrace());
            System.out.println(MyExcept.getMessage());
            MyExcept.printStackTrace();
        }
        return null;
    }

    public static void Myfscanf(FileInputStream fp) {
        String s = new String();
        int param = 0;
        String[] sTemp = null;
        int exp = 0;
        int Index = 0;
        String[] TempKnownIssuesCSV = new String[200];
        try {
            //DataInputStream din=new DataInputStream(fp);
            BufferedReader din = new BufferedReader(new InputStreamReader(fp));
            s = din.readLine();
            for (int i = 0; s != null; s = din.readLine(), i++) {
                if ((s != null) && (!s.isEmpty()) && (!s.equalsIgnoreCase("")) && (s.contains(","))) {
                    sTemp = s.split(",");
                }
                for (int j = 0; (sTemp != null) && (j < (sTemp.length)); j++) {
                    sTemp[j] = sTemp[j].trim();
                    if ((sTemp[j] != null) && (!sTemp[j].equalsIgnoreCase(""))) {
                        if (sTemp[j].contains("\"")) {
                            sTemp[j] = sTemp[j].replaceAll("\"", "");
                        }
                        if (sTemp[j].contains("\n")) {
                            sTemp[j] = sTemp[j].replaceAll("\n", "");
                        }
                        if ((sTemp[j] != null) && (!sTemp[j].equalsIgnoreCase("")) && (!sTemp[j].isBlank()) && (!sTemp[j].isEmpty())) {
                            TempKnownIssuesCSV[Index++] = sTemp[j];
                        }
                        //System.out.println("Myfscanf:Read:TestCase="+TempKnownIssuesCSV[Index-1]);
                    }
                }
            }
            KnownIssuesCSV = new String[Index];
            for (int z = 0, b = 0; z <= Index; z++) {
                if ((TempKnownIssuesCSV[z] != null) && (!TempKnownIssuesCSV[z].equalsIgnoreCase("")) && (!TempKnownIssuesCSV[z].isBlank()) && (!TempKnownIssuesCSV[z].isEmpty())) {
                    KnownIssuesCSV[b++] = TempKnownIssuesCSV[z].trim();
                    //System.out.println("Myfscanf:Processed:" + KnownIssuesCSV[b-1]);
                }
            }
            s = null;
            fp.close();
        } catch (Exception MyExcept) {
            System.out.println(MyExcept.getStackTrace());
            System.out.println(MyExcept.getMessage());
            MyExcept.printStackTrace();
        }
    }

    public static void AIDiffSingleHighTestCase(int MaxOrder1, String Exprn, String MapType, String IntegrORDiffr, String xExprnOptionSelected) {
        Map<String, Double> variables = new HashMap<>();
        MathsContxtLAv.SimpleExpression expSimpleMap1 = (() -> "");
        MathsExpressionParser.Expression expValue = (() -> Double.NaN);
        MathsContxtLAv.SimpleExpression expSimpleMap2 = (() -> "");
        DiffrIntegrSep.DiffExpr exp = (() -> "");

        MyFuncExpress();
        MyFuncDiff();
        MyFuncSimple();

        String Constant = "C";

        String StrexpSimpleExpressMap1 = "";
        String StrexpDiffExpress = "";
        String StrexpSimpleExpressMap2 = "";
        String myOrder = "";

        double ExprnexpValue = 0;
        double ExprnexpValue1 = 0;
        double DblexpValueMap1 = 0;
        double DblexpDiffValue = 0;
        double DblexpValueMap2 = 0;
        double DblexpValueMap3 = 0;

        StageMapping = "";
        Order = 1;

        //System.out.println(ConsoleColors.YELLOW + "Test Case " + TestCase + " EndTestCase=" + EndTestCase + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test_ID " + TestCase + " TestCaseFile=" + TestCaseFile + " Section=" + Section + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test_DATA_Exprn=" + Exprn + ConsoleColors.RESET);
        //System.out.println(ConsoleColors.BLUE + "Test Case Name=" + TestCaseName + ConsoleColors.RESET);
        //System.out.println(ConsoleColors.BLUE + "Test Case Name=" + TestCaseMatrixID + ConsoleColors.RESET);
        //System.out.println(ConsoleColors.BLUE + "Regression Status : Test Case should be " + EqnRegressionDiffStatus + ConsoleColors.RESET);

        for (double x = 1.0, y = 7.0; Order < MaxOrder1; y++, /*x++,*/ Order++) {
            try {
                TestCasePassStrFlag = false;
                TestCasePassValFlag = false;
                TestCasePassConformalValFlag = false;
                variables.put(DiffWithRespTo, x);
                variables.put("y", y);
                variables.put("a", 1.0);
                variables.put("b", 2.0);//variables.put("b", 0.0);
                variables.put("c", -1.0);
                variables.put("d", 2.0);
                variables.put("m", -1.0);
                variables.put("p", 3.0);
                variables.put("q", 0.0);
                variables.put("r", -1.0);
                variables.put("s", 2.0);
                variables.put("i", 1.0);
                variables.put("E1", 1.0);
                variables.put(Constant, 5.0);
                StageMapping = "Basic Mapping";
                MapType = "Map1";

                System.out.println("main: " + DiffWithRespTo + "=" + x + " Test_DATA_Exprn=" + Exprn + " Order=" + myOrder);
                ChaosPrevention();
                //System.out.println(ConsoleColors.BLUE + "main:MAP1 START VERBOSE IF SET" + ConsoleColors.RESET);
                //System.out.println(ConsoleColors.BLUE + "main:MAP1 START VERBOSE IF SET" + ConsoleColors.RESET);
                expSimpleMap1 = parseSimple(Exprn, variables, DiffWithRespTo, "Map1", IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
                StrexpSimpleExpressMap1 = expSimpleMap1.SimpleExpr();
                //System.out.println("main: " + DiffWithRespTo + "=" + x + " After Map1:Basic Simple Exprn=" + StrexpSimpleExpressMap1);
                //System.out.println(ConsoleColors.BLUE + "main:MAP1 END VERBOSE IF SET" + ConsoleColors.RESET);
                //System.out.println(ConsoleColors.BLUE + "main:MAP1 END VERBOSE IF SET" + ConsoleColors.RESET);

                expValue = parse(Exprn, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                ExprnexpValue = expValue.eval();
                //System.out.println(" main:Expn Value=" + ExprnexpValue + "  x=" + x + " " + DiffWithRespTo + "=" + x + " Exprn=" + Exprn);

                expValue = parse(StrexpSimpleExpressMap1, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpValueMap1 = expValue.eval();
                //' Convert Both Answers to POSITIVE DOMAIN as For Nominal Answer of -23.0 , -24 or -22 is allowed
                if ((DblexpValueMap1 < 0) && (ExprnexpValue < 0)) {
                    DblexpValueMap3 = DblexpValueMap1 * -1.0;
                    ExprnexpValue1 = ExprnexpValue * -1.0;
                }
                WrongAnswerFlagMap1 = false;
                if (Order == 1) {
                    WrongAnswerMap1(EqnUnderTest, variables, EqnSolArrayMap1[Order], MaxOrder1);
                    if ((WrongAnswerFlagMap1 == true) && (Order == 1)) {
                        WrongAnswerCountMap1++;
                        //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "WRONG ANSWER MAP1" + ConsoleColors.RESET);
                        //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given Answer1(EqnUnderTest)=" + EqnUnderTest + ConsoleColors.RESET);
                        //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given Answer Map(EqnSolArrayMap1[Order])=" + EqnSolArrayMap1[Order] + ConsoleColors.RESET);
                        WrongAnsTestCasesMap1.put(MaxIndexWrongAnsMap1, TestCase + " ;");
                        MaxIndexWrongAnsMap1++;
                    }
                }
                //System.out.println("main: " + DiffWithRespTo + "=" + x + " Basic Simple (Result) (Exprn Value)=" + DblexpValueMap1 + " StrexpSimpleExpressMap1=" + StrexpSimpleExpressMap1);
                StageMapping = "Differentiation";
                //System.out.println(ConsoleColors.BLUE + "main:Differentiation VERBOSE IF SET" + ConsoleColors.RESET);
                //System.out.println(ConsoleColors.BLUE + "main:Differentiation VERBOSE IF SET" + ConsoleColors.RESET);
                exp = DiffrIntegrSep.parseDiff(StrexpSimpleExpressMap1, variables, DiffWithRespTo, MapType, IntegrORDiffr);
                StrexpDiffExpress = exp.DiffExpr();
                //System.out.println(" main:Result(Diff Equation)(" + Order + " th order)=> " + StrexpDiffExpress);
                StageMapping = "Differentiation Mapping";
                //MapType="Map2";
                ChaosPrevention();
                //System.out.println(ConsoleColors.BLUE + " main:Test Case Status=" + " MAP2 START VERBOSE IF SET" + ConsoleColors.RESET);
                //System.out.println(ConsoleColors.BLUE + " main:Test Case Status=" + " MAP2 START VERBOSE IF SET" + ConsoleColors.RESET);
                //System.out.println(ConsoleColors.BLUE + " main:Test Case Status=" + " StrexpDiffExpress=" + StrexpDiffExpress + ConsoleColors.RESET);
                expSimpleMap2 = parseSimple(StrexpDiffExpress, variables, DiffWithRespTo, "Map2", IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
                StrexpSimpleExpressMap2 = expSimpleMap2.SimpleExpr();
                //System.out.println(ConsoleColors.BLUE + " main:Test Case Status=" + " MAP2 END VERBOSE IF SET" + ConsoleColors.RESET);
                //System.out.println(ConsoleColors.BLUE + " main:Test Case Status=" + " MAP2 END VERBOSE IF SET" + ConsoleColors.RESET);
                expValue = parse(StrexpDiffExpress, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpDiffValue = expValue.eval();
                WrongAnswerFlagCalculus1 = false;
                if (Order == 1) {
                    WrongAnswerCalculus1(EqnSolArrayDiffAlone[Order], variables, EqnSolArrayMap2[Order]);
                    if ((WrongAnswerFlagCalculus1 == true)) {
                        WrongAnswerCountCalculus1++;
                        //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "WRONG ANSWER MAP2" + ConsoleColors.RESET);
                        //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given Answe2(EqnSolArrayDiffAlone[Order])=" + EqnSolArrayDiffAlone[Order] + ConsoleColors.RESET);
                        //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given AnswerMap(EqnSolArrayMap2[Order])=" + EqnSolArrayMap2[Order] + ConsoleColors.RESET);
                        WrongAnsTestCasesCalculus1.put(MaxIndexWrongAnsCalculus1, TestCase + " ,");
                        MaxIndexWrongAnsCalculus1++;
                    }
                }
                //System.out.println("main: " + DiffWithRespTo + "=" + x + " Result(Diff Value)=" + DblexpDiffValue);
                //System.out.println(" main:Result(Simplified Diff Equation)(" + Order + " th order)=> " + StrexpSimpleExpressMap2);
                expValue = parse(StrexpSimpleExpressMap2, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpValueMap2 = expValue.eval();
                WrongAnswerFlagMap2 = false;
                if (Order == 1) {
                    WrongAnswerMap2(EqnSolArrayDiffAlone[Order], variables, EqnSolArrayMap2[Order], MaxOrder1);
                    if ((WrongAnswerFlagMap2 == true)) {
                        WrongAnswerCountMap2++;
                        //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "WRONG ANSWER MAP2" + ConsoleColors.RESET);
                        //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given Answer3(EqnSolArrayDiffAlone[Order])=" + EqnSolArrayDiffAlone[Order] + ConsoleColors.RESET);
                        //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given AnswerMap(EqnSolArrayMap2[Order])=" + EqnSolArrayMap2[Order] + ConsoleColors.RESET);
                        WrongAnsTestCasesMap2.put(MaxIndexWrongAnsMap2, TestCase + " ,");
                        MaxIndexWrongAnsMap2++;
                    }
                }
                //System.out.println("main: " + DiffWithRespTo + "=" + x + " Result(Simplified Diff Value)=" + expValue.eval());
                //Usage.FInverseEqn=FInverseLagrangeBurmann( Exprn, DiffWithRespTo, MaxOrder1,x, "",  "", '/', 12);

                //Usage.FInverseEqn = FInverseLagrangeBurmannLowLevel(Exprn, DiffWithRespTo, MaxOrder1, x, 10.0, "", "", '/', 4);
                //System.out.println("main: FInverse:" + "x" + "=" + UsageCalculus.FInverseEqn);
                //System.out.print(System.lineSeparator());
                if (PassFailTestCaseString(TestCase, Order, "Diff", Exprn, StrexpSimpleExpressMap1, StrexpDiffExpress, StrexpSimpleExpressMap2, EqnUnderTest, EqnSolArrayMap1[Order], EqnSolArrayDiffAlone[Order], EqnSolArrayMap2[Order], "", "", xExprnOptionSelected)) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass STRING TEST Complete" + ConsoleColors.RESET);
                    TestCasePassStrFlag = true;
                } else {
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "FAIL STRING TEST Complete" + ConsoleColors.RESET);
                    if (TestCasePassHighLevelFlag == true) {
                        TestCasePassHighLevelFlag = false;
                    }
                }

//                if (PassFailTestCaseValueStrict(TestCase, Order, "Diff", Exprn, ExprnexpValue, DblexpValueMap1, DblexpDiffValue, DblexpValueMap2, StrexpDiffExpress, variables, x)) {
//                    //System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass VALUE TEST Complete:Pragma:" + Pragma + ConsoleColors.RESET);
//                    TestCasePassValFlag = true;
//                    TestCasePassHighLevelFlag = true;
//                } else {
//                    //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Fail VALUE TEST Complete" + ConsoleColors.RESET);
//                    TestCasePassValFlag = false;
//                    TestCasePassHighLevelFlag = false;
//                }
                if ((TestCasePassStrFlag == true) || (TestCasePassValFlag == true)) {
                    //TestCasePassConformalValFlag = ConformalMapTestCaseDiff(TestCase, Order, Exprn, expSimpleMap1, exp, expSimpleMap2, EqnSolArrayMap1[Order], EqnSolArrayDiffAlone[Order], EqnSolArrayMap2[Order], variables, DiffWithRespTo);
                }
//                if ((TestCasePassValFlag != true) && (PassFailTestCaseValueEasy(TestCase, Order, "Diff", Exprn, ExprnexpValue, DblexpValueMap1, DblexpDiffValue, DblexpValueMap2, StrexpDiffExpress, variables, x))) {
//                    //System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass VALUE TEST Complete:Pragma:Loose" + ConsoleColors.RESET);
//                    TestCasePassValFlag = true;
//                    TestCasePassHighLevelFlag = true;
//                }
                if (TestCasePassConformalValFlag == true) {
                    //System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass Conformal Map TEST" + ConsoleColors.RESET);
                } else if ((TestCasePassStrFlag != true) || (TestCasePassValFlag != true)) {
                    //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Conformal Map TEST Not Executed" + ConsoleColors.RESET);
                } else {
                    //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "FAIL Conformal Map TEST " + ConsoleColors.RESET);
                }
                if ((TestCasePassStrFlag == true) && (TestCasePassValFlag == true)) {
                    //System.out.println(ConsoleColors.BLUE + "Super Test Answer Checks" + ConsoleColors.RESET);
                }
                if ((TestCasePassStrFlag == true) /* && (TestCasePassValFlag == true) && (TestCasePassConformalValFlag == true)*/) {
                    TestCasePassHighLevelFlag = true;//DO Nothing as Test Cases Passes
                } else if (!((TestCasePassValFlag == true) && (TestCasePassConformalValFlag == true))) {
                    String Temp = FailedTestCases.get(MaxIndexFail);
                    String HashVal = "";
                    if ((TestCaseFailCoarseReportingFlag == false) && (Temp != null) && (Order >= 2) && (!Temp.equalsIgnoreCase("")) && (!Temp.contains("Section"))) {
                        HashVal = Temp + "," + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag + ":ConfValFlag=" + TestCasePassConformalValFlag;
                    } else if (TestCaseFailCoarseReportingFlag == false) {
                        HashVal = "TestCase=" + TestCase + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag + ":ConfValFlag=" + TestCasePassConformalValFlag;
                    } else if ((TestCaseFailCoarseReportingFlag == true) && (Order == 1) && (Temp != null)) {
                        //HashVal = "TestCase=" + TestCase + "," + ":Order=" + (Order) ;
                        HashVal = Temp + "," + "(j==" + TestCase + ")";
                    } else if ((TestCaseFailCoarseReportingFlag == true) && (Temp != null)) {
                        //HashVal = Temp +"," + ":Order=" + (Order) ;
                        HashVal = Temp;
                    } else {
                        HashVal = "(j==" + TestCase + ")";
                    }
                    FailedTestCases.put(MaxIndexFail, HashVal);
                    //i=MaxOrder1;
                    TestCasePassHighLevelFlag = false;
                } else {
                    TestCasePassHighLevelFlag = true;
                }
                if (!FailTestCaseStringDiagnostic(TestCase, Order, MaxOrder1, "Diff", Exprn, StrexpSimpleExpressMap1, StrexpDiffExpress, StrexpSimpleExpressMap2, EqnUnderTest, EqnSolArrayMap1[Order], EqnSolArrayDiffAlone[Order], EqnSolArrayMap2[Order])) {
                    //System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Diagnostic Complete" + ConsoleColors.RESET);
                }
                if (TestCasePassHighLevelFlag == false) {
                    ruleAnalytics.recordSummary("" + TestCase, Order, EqnUnderTest, Exprn, StrexpSimpleExpressMap1, EqnSolArrayMap1[Order], StrexpDiffExpress, EqnSolArrayDiffAlone[Order], StrexpSimpleExpressMap2, EqnSolArrayMap2[Order], TestCasePassHighLevelFlag, TestCasePassStrFlag, TestCasePassValFlag, TestCasePassConformalValFlag);
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
                if ((TestCaseFailCoarseReportingFlag == false) && (Temp != null) && (!Temp.equalsIgnoreCase("")) && (!Temp.contains("Section"))) {
                    HashVal = Temp + "," + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag;
                } else if (TestCaseFailCoarseReportingFlag == false) {
                    HashVal = "TestCase=" + TestCase + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag;
                } else if ((TestCaseFailCoarseReportingFlag == true) && (Order == 1)) {
                    HashVal = Temp;
                } else if ((TestCaseFailCoarseReportingFlag == true)) {
                    HashVal = Temp;
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
                //Order = MaxOrder1;
                TestCasePassHighLevelFlag = false;
            }
        }
        System.out.print(System.lineSeparator());

    }

    public static void AIIntegralHighSingleTest(int MaxOrder1, String Exprn, String MapType, String IntegrORDiffr, String xExprnOptionSelected) {
        Map<String, Double> variables = new HashMap<>();
        SimpleExpression expSimpleMap1 = (() -> "");
        Expression expValue = (() -> Double.NaN);;
        SimpleExpression expSimpleMap2 = (() -> "");
        DiffrIntegrSep.IntegrExpr exp = (() -> "");

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
                variables.put(DiffWithRespTo, x);
                variables.put("y", y);
                variables.put("a", 1.0);
                variables.put("b", 2.0);//variables.put("b", 0.0);
                variables.put("c", -1.0);
                variables.put("d", 2.0);
                variables.put("p", 1.0);
                variables.put("q", 0.0);
                variables.put("r", -1.0);
                variables.put("s", 2.0);
                variables.put("i", 1.0);
                variables.put("E1", 1.0);
                variables.put(Constant, 5.0);
                StageMapping = "Basic Mapping";
                MapType = "Map1";

                System.out.println("main: " + DiffWithRespTo + "=" + x + " Exprn=" + Exprn + " Order=" + myOrder);
                ChaosPrevention();
                //System.out.println(ConsoleColors.BLUE + "main:MAP1 START VERBOSE IF SET" + ConsoleColors.RESET);
                //System.out.println(ConsoleColors.BLUE + "main:MAP1 START VERBOSE IF SET" + ConsoleColors.RESET);
                expSimpleMap1 = parseSimple(Exprn, variables, DiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
                StrexpSimpleExpressMap1 = expSimpleMap1.SimpleExpr();
                //System.out.println(ConsoleColors.BLUE + " main:Test Case Status=" + "NO Infinite LOOP " + ":Map1 Complete" + " StageMapping:" + StageMapping + ConsoleColors.RESET);

                //System.out.println("main: " + DiffWithRespTo + "=" + x + " After Map1:Basic Simple Exprn=" + StrexpSimpleExpressMap1);
                //System.out.println(ConsoleColors.BLUE + "main:MAP1 END VERBOSE IF SET" + ConsoleColors.RESET);
                //System.out.println(ConsoleColors.BLUE + "main:MAP1 END VERBOSE IF SET" + ConsoleColors.RESET);
                expValue = parse(Exprn, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                ExprnexpValue = expValue.eval();
                //System.out.println(" main:Result(Expn Value)=" + ExprnexpValue + "  x=" + x + " " + DiffWithRespTo + "=" + x);

                expValue = parse(StrexpSimpleExpressMap1, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpValueMap1 = expValue.eval();
                //System.out.println("main: " + DiffWithRespTo + "=" + x + " Basic Simple (Exprn Value)=" + DblexpValueMap1);

                StageMapping = "Integration";
                //System.out.println(ConsoleColors.BLUE + "main:Integration VERBOSE IF SET" + ConsoleColors.RESET);
                //System.out.println(ConsoleColors.BLUE + "main:Integration VERBOSE IF SET" + ConsoleColors.RESET);
                exp = DiffrIntegrSep.parseIntegr(StrexpSimpleExpressMap1, variables, DiffWithRespTo, MapType, IntegrORDiffr);
                StrexpDiffExpress = exp.IntegrExpr();
                //System.out.println(" main:Result(Integral Equation)(" + Order + " th order)=> " + StrexpDiffExpress);
                //' Convert Both Answers to POSITIVE DOMAIN as For Nominal Answer of -23.0 , -24 or -22 is allowed
                if ((DblexpValueMap1 < 0) && (ExprnexpValue < 0)) {
                    DblexpValueMap1 = DblexpValueMap1 * -1.0;
                    ExprnexpValue = ExprnexpValue * -1.0;
                }
                WrongAnswerFlagMap1 = false;
                //System.out.println(ConsoleColors.BLUE + " main:Test Case Status=" + "NO Infinite LOOP " + ":Integration Complete" + " StageMapping:" + StageMapping + ConsoleColors.RESET);
                WrongAnswerMap1(Exprn, variables, EqnSolArrayMap3[Order], MaxOrder1);
                if ((WrongAnswerFlagMap1 == true) && (Order == 1)) {
                    WrongAnswerCountMap1++;
                    //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "WRONG ANSWER MAP3" + ConsoleColors.RESET);
                    //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given Answer1(EqnUnderTest)=" + EqnUnderTest + ConsoleColors.RESET);
                    //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given Answer(EqnSolArrayMap3[Order])=" + EqnSolArrayMap3[Order] + ConsoleColors.RESET);
                    WrongAnsTestCasesMap1.put(MaxIndexWrongAnsMap1, TestCase + " ,");
                    MaxIndexWrongAnsMap1++;
                }
                //System.out.println(ConsoleColors.BLUE + " main:Test Case Status=" + "NO Infinite LOOP " + ":WrongAnswerMap1 Complete" + " StageMapping:" + StageMapping + ConsoleColors.RESET);
                StageMapping = "Integration Mapping";
                MapType = "Map2";
                ChaosPrevention();
                //System.out.println(ConsoleColors.BLUE + "main:MAP2 START VERBOSE IF SET" + ConsoleColors.RESET);
                //System.out.println(ConsoleColors.BLUE + "main:MAP2 START VERBOSE IF SET" + ConsoleColors.RESET);
                expSimpleMap2 = parseSimple(StrexpDiffExpress, variables, DiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
                StrexpSimpleExpressMap2 = expSimpleMap2.SimpleExpr();
                //System.out.println(ConsoleColors.BLUE + " main:Test Case Status=" + "NO Infinite LOOP " + ":Map2 Proper Complete" + " StageMapping:" + StageMapping + ConsoleColors.RESET);

                //System.out.println(" main:Result(Simplified Integral Equation)(" + Order + " th order)=> " + StrexpSimpleExpressMap2);
                //System.out.println(ConsoleColors.BLUE + "main:MAP2 END VERBOSE IF SET" + ConsoleColors.RESET);
                //System.out.println(ConsoleColors.BLUE + "main:MAP2 END VERBOSE IF SET" + ConsoleColors.RESET);
                expValue = parse(StrexpDiffExpress, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Info);
                DblexpDiffValue = expValue.eval();
                //System.out.println("main: " + DiffWithRespTo + "=" + x + " Result(Integral Value)=" + DblexpDiffValue);
                expValue = parse(StrexpSimpleExpressMap2, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Info);
                DblexpValueMap2 = expValue.eval();
                WrongAnswerFlagCalculus1 = false;
                //System.out.println(ConsoleColors.BLUE + " main:Test Case Status=" + "NO Infinite LOOP " + ":Map2 Completed Sucessfully" + " StageMapping:" + StageMapping + ConsoleColors.RESET);

                if (Order == 1) {
                    WrongAnswerCalculus1(EqnSolArrayIntegrAlone[Order], variables, EqnSolArrayMap4[Order]);
                    if ((WrongAnswerFlagCalculus1 == true)) {
                        WrongAnswerCountCalculus1++;
                        //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "WRONG ANSWER MAP2" + ConsoleColors.RESET);
                        //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given Answer2(EqnSolArrayIntegrAlone[Order])=" + EqnSolArrayIntegrAlone[Order] + ConsoleColors.RESET);
                        //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given AnswerMap(EqnSolArrayMap4[Order])=" + EqnSolArrayMap4[Order] + ConsoleColors.RESET);
                        WrongAnsTestCasesCalculus1.put(MaxIndexWrongAnsCalculus1, TestCase + " ,");
                        MaxIndexWrongAnsCalculus1++;
                    }
                }
                WrongAnswerFlagMap2 = false;
                WrongAnswerMap2(EqnSolArrayIntegrAlone[Order], variables, EqnSolArrayMap4[Order], MaxOrder1);
                if ((WrongAnswerFlagMap2 == true) && (Order == 1)) {
                    WrongAnswerCountMap2++;
                    //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "WRONG ANSWER MAP4" + ConsoleColors.RESET);
                    //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given Answer2(EqnSolArrayIntegrAlone[Order])=" + EqnSolArrayIntegrAlone[Order] + ConsoleColors.RESET);
                    //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given AnswerMap(EqnSolArrayMap4[Order])=" + EqnSolArrayMap4[Order] + ConsoleColors.RESET);
                    WrongAnsTestCasesMap2.put(MaxIndexWrongAnsMap2, TestCase + " ,");
                    MaxIndexWrongAnsMap2++;
                }

                if (PassFailTestCaseString(TestCase, Order, "Integre", Exprn, StrexpSimpleExpressMap1, StrexpDiffExpress, StrexpSimpleExpressMap2, EqnUnderTest, EqnSolArrayMap3[Order], EqnSolArrayIntegrAlone[Order], EqnSolArrayMap4[Order], "", "", xExprnOptionSelected)) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass STRING TEST Complete" + ConsoleColors.RESET);
                    TestCasePassStrFlag = true;
                } else {
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Fail STRING TEST Complete" + ConsoleColors.RESET);
                    TestCasePassStrFlag = false;
                }

//                if (PassFailTestCaseValueStrict(TestCase, Order, "Integre", Exprn, ExprnexpValue, DblexpValueMap1, DblexpDiffValue, DblexpValueMap2, StrexpDiffExpress, variables, x)) {
//                    //System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass VALUE TEST CompletePragma:Strict" + ConsoleColors.RESET);
//                    TestCasePassValFlag = true;
//                    TestCasePassHighLevelFlag = true;
//                } else {
//                    //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Fail VALUE TEST Complete" + ConsoleColors.RESET);
//                }
                if ((TestCasePassStrFlag == true) || (TestCasePassValFlag == true)) {
                    //TestCasePassConformalValFlag = ConformalMapTestCaseIntegr(TestCase, Order, Exprn, expSimpleMap1, exp, expSimpleMap2, EqnSolArrayMap3[Order], EqnSolArrayIntegrAlone[Order], EqnSolArrayMap4[Order], variables, DiffWithRespTo);
                }
//                if ((TestCasePassValFlag != true) && (PassFailTestCaseValueEasy(TestCase, Order, "Integre", Exprn, ExprnexpValue, DblexpValueMap1, DblexpDiffValue, DblexpValueMap2, StrexpDiffExpress, variables, x))) {
//                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass VALUE TEST Complete:Pragma:Loose" + ConsoleColors.RESET);
//                    TestCasePassValFlag = true;
//                    TestCasePassHighLevelFlag = true;
//                }
                if (TestCasePassConformalValFlag == true) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass Conformal Map TEST" + ConsoleColors.RESET);
                } else if ((TestCasePassStrFlag != true) || (TestCasePassValFlag != true)) {
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Conformal Map TEST Not Executed" + ConsoleColors.RESET);
                } else {
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "FAIL Conformal Map TEST " + ConsoleColors.RESET);
                }
                if ((TestCasePassStrFlag == true) && (TestCasePassValFlag == true)) {
                    //System.out.println(ConsoleColors.BLUE + "Super Test Answer Checks" + ConsoleColors.RESET);
                }
                if ((TestCasePassStrFlag == true) /* && (TestCasePassValFlag == true) && (TestCasePassConformalValFlag == true)*/) {
                    TestCasePassHighLevelFlag = true;//DO Nothing as Test Cases Passes
                } else if (!((TestCasePassValFlag == true) && (TestCasePassConformalValFlag == true))) {
                    String Temp = FailedTestCases.get(MaxIndexFail);
                    String HashVal = "";
                    if ((TestCaseFailCoarseReportingFlag == false) && (Temp != null) && (Order >= 2) && (!Temp.equalsIgnoreCase("")) && (!Temp.contains("Section"))) {
                        HashVal = Temp + "," + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag + ":ConfValFlag=" + TestCasePassConformalValFlag;
                    } else if (TestCaseFailCoarseReportingFlag == false) {
                        HashVal = "TestCase=" + TestCase + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag + ":ConfValFlag=" + TestCasePassConformalValFlag;
                    } else if ((TestCaseFailCoarseReportingFlag == true) && (Order == 1) && (Temp != null)) {
                        //HashVal = "TestCase=" + TestCase + "," + ":Order=" + (Order) ;
                        HashVal = Temp + "(j==" + TestCase + ")";
                    } else if ((TestCaseFailCoarseReportingFlag == true) && (Temp != null)) {
                        //HashVal = Temp +"," + ":Order=" + (Order) ;
                        HashVal = Temp;
                    } else {
                        HashVal = "(j==" + TestCase + ")";
                    }
                    FailedTestCases.put(MaxIndexFail, HashVal);
                    //i=MaxOrder1;
                    TestCasePassHighLevelFlag = false;
                } else {
                    TestCasePassHighLevelFlag = true;
                }
                if (!FailTestCaseStringDiagnostic(TestCase, Order, MaxOrder1, "Integre", Exprn, StrexpSimpleExpressMap1, StrexpDiffExpress, StrexpSimpleExpressMap2, EqnUnderTest, EqnSolArrayMap3[Order], EqnSolArrayIntegrAlone[Order], EqnSolArrayMap4[Order])) {
                    //System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Diagnostic Complete" + ConsoleColors.RESET);
                }
                if (TestCasePassHighLevelFlag == false) {
                    ruleAnalytics.recordSummary("" + TestCase, Order, EqnUnderTest, Exprn, StrexpSimpleExpressMap1, EqnSolArrayMap3[Order], StrexpDiffExpress, EqnSolArrayIntegrAlone[Order], StrexpSimpleExpressMap2, EqnSolArrayMap4[Order], TestCasePassHighLevelFlag, TestCasePassStrFlag, TestCasePassValFlag, TestCasePassConformalValFlag);
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
                if ((TestCaseFailCoarseReportingFlag == false) && (Temp != null) && (!Temp.equalsIgnoreCase("")) && (!Temp.contains("Section"))) {
                    HashVal = Temp + "," + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag;
                } else if ((TestCaseFailCoarseReportingFlag == false)) {
                    HashVal = "TestCase=" + TestCase + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag;
                } else if ((TestCaseFailCoarseReportingFlag == true) && (Order == 1)) {
                    HashVal = Temp;
                } else {
                    HashVal = Temp;
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

    public static void AIDiffSingleHighTestCase2(int MaxOrder1, String Exprn, String MapType, String IntegrORDiffr, String xExprnOptionSelected) {
        Map<String, Double> variables = new HashMap<>();
        MathsContxtLAv.SimpleExpression expSimpleMap1 = (() -> "");
        MathsExpressionParser.Expression expValue = (() -> Double.NaN);
        MathsContxtLAv.SimpleExpression expSimpleMap2 = (() -> "");
        DiffrIntegrSep.DiffExpr exp = (() -> "");
        DiffrIntegrSep.IntegrExpr expIntegrExpr = (() -> "");

        MyFuncExpress();
        MyFuncDiff();
        MyFuncSimple();

        String Constant = "C";

        String StrexpSimpleExpressMap1 = "";
        String StrexpDiffExpress = "";
        String StrexpIntegreExpress = "";
        String StrexpSimpleExpressMap2 = "";
        String myOrder = "";

        double ExprnexpValue = 0;
        double ExprnexpValue1 = 0;
        double DblexpValueMap1 = 0;
        double DblexpDiffValue = 0;
        double DblexpValueMap2 = 0;
        double DblexpValueMap3 = 0;

        StageMapping = "";
        Order = 1;

        //System.out.println(ConsoleColors.YELLOW + "Test Case " + TestCase + " EndTestCase=" + EndTestCase + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test_ID " + TestCase + " TestCaseFile=" + TestCaseFile + " Section=" + Section + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test_DATA_Exprn=" + Exprn + ConsoleColors.RESET);
        //System.out.println(ConsoleColors.BLUE + "Test Case Name=" + TestCaseName + ConsoleColors.RESET);
        //System.out.println(ConsoleColors.BLUE + "Test Case Name=" + TestCaseMatrixID + ConsoleColors.RESET);
        //System.out.println(ConsoleColors.BLUE + "Regression Status : Test Case should be " + EqnRegressionDiffStatus + ConsoleColors.RESET);

        for (double x = 1.0, y = 7.0; (Order < MaxOrder1) && (Order < 2); y++, /*x++,*/ Order++) {
            try {
                TestCasePassStrFlag = false;
                TestCasePassValFlag = false;
                TestCasePassConformalValFlag = false;
                variables.put(DiffWithRespTo, x);
                variables.put("y", y);
                variables.put("a", 1.0);
                variables.put("b", 2.0);//variables.put("b", 0.0);
                variables.put("c", -1.0);
                variables.put("d", 2.0);
                variables.put("m", -1.0);
                variables.put("p", 3.0);
                variables.put("q", 0.0);
                variables.put("r", -1.0);
                variables.put("s", 2.0);
                variables.put("i", 1.0);
                variables.put("E1", 1.0);
                variables.put(Constant, 5.0);
                StageMapping = "Basic Mapping";
                MapType = "Map1";

                System.out.println("main: " + DiffWithRespTo + "=" + x + " Test_DATA_Exprn=" + Exprn + " Order=" + myOrder);
                ChaosPrevention();
                //System.out.println(ConsoleColors.BLUE + "main:MAP1 START VERBOSE IF SET" + ConsoleColors.RESET);
                //System.out.println(ConsoleColors.BLUE + "main:MAP1 START VERBOSE IF SET" + ConsoleColors.RESET);
                expSimpleMap1 = parseSimple(Exprn, variables, DiffWithRespTo, "Map1", IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
                StrexpSimpleExpressMap1 = expSimpleMap1.SimpleExpr();
                //System.out.println("main: " + DiffWithRespTo + "=" + x + " After Map1:Basic Simple Exprn=" + StrexpSimpleExpressMap1);
                //System.out.println(ConsoleColors.BLUE + "main:MAP1 END VERBOSE IF SET" + ConsoleColors.RESET);
                //System.out.println(ConsoleColors.BLUE + "main:MAP1 END VERBOSE IF SET" + ConsoleColors.RESET);

                expValue = parse(Exprn, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                ExprnexpValue = expValue.eval();
                //System.out.println(" main:Expn Value=" + ExprnexpValue + "  x=" + x + " " + DiffWithRespTo + "=" + x + " Exprn=" + Exprn);

                expValue = parse(StrexpSimpleExpressMap1, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpValueMap1 = expValue.eval();
                //' Convert Both Answers to POSITIVE DOMAIN as For Nominal Answer of -23.0 , -24 or -22 is allowed
                if ((DblexpValueMap1 < 0) && (ExprnexpValue < 0)) {
                    DblexpValueMap3 = DblexpValueMap1 * -1.0;
                    ExprnexpValue1 = ExprnexpValue * -1.0;
                }
                WrongAnswerFlagMap1 = false;
                if (Order == 1) {
                    WrongAnswerMap1(EqnUnderTest, variables, EqnSolArrayMap1[Order], MaxOrder1);
                    if ((WrongAnswerFlagMap1 == true) && (Order == 1)) {
                        WrongAnswerCountMap1++;
                        //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "WRONG ANSWER MAP1" + ConsoleColors.RESET);
                        //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given Answer1(EqnUnderTest)=" + EqnUnderTest + ConsoleColors.RESET);
                        //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given Answer Map(EqnSolArrayMap1[Order])=" + EqnSolArrayMap1[Order] + ConsoleColors.RESET);
                        WrongAnsTestCasesMap1.put(MaxIndexWrongAnsMap1, TestCase + " ;");
                        MaxIndexWrongAnsMap1++;
                    }
                }
                //System.out.println("main: " + DiffWithRespTo + "=" + x + " Basic Simple (Result) (Exprn Value)=" + DblexpValueMap1 + " StrexpSimpleExpressMap1=" + StrexpSimpleExpressMap1);
                StageMapping = "Differentiation";
                //System.out.println(ConsoleColors.BLUE + "main:Differentiation VERBOSE IF SET" + ConsoleColors.RESET);
                //System.out.println(ConsoleColors.BLUE + "main:Differentiation VERBOSE IF SET" + ConsoleColors.RESET);
                exp = DiffrIntegrSep.parseDiff(StrexpSimpleExpressMap1, variables, DiffWithRespTo, MapType, IntegrORDiffr);
                StrexpDiffExpress = exp.DiffExpr();
                //System.out.println(" main:Result(Diff Equation)(" + Order + " th order)=> " + StrexpDiffExpress);
                StageMapping = "Integration";
                //System.out.println(ConsoleColors.BLUE + "main:Integration VERBOSE IF SET" + ConsoleColors.RESET);
                //System.out.println(ConsoleColors.BLUE + "main:Integration VERBOSE IF SET" + ConsoleColors.RESET);
                expIntegrExpr = DiffrIntegrSep.parseIntegr(StrexpSimpleExpressMap1, variables, DiffWithRespTo, MapType, IntegrORDiffr);
                StrexpIntegreExpress = expIntegrExpr.IntegrExpr();
                //System.out.println(" main:Result(Integral Equation)(" + Order + " th order)=> " + StrexpDiffExpress);
                //' Convert Both Answers to POSITIVE DOMAIN as For Nominal Answer of -23.0 , -24 or -22 is allowed
                if ((DblexpValueMap1 < 0) && (ExprnexpValue < 0)) {
                    DblexpValueMap1 = DblexpValueMap1 * -1.0;
                    ExprnexpValue = ExprnexpValue * -1.0;
                }
                WrongAnswerFlagMap1 = false;
                WrongAnswerMap1(Exprn, variables, EqnSolArrayMap3[Order], MaxOrder1);
                if ((WrongAnswerFlagMap1 == true) && (Order == 1)) {
                    WrongAnswerCountMap1++;
                    //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "WRONG ANSWER MAP3" + ConsoleColors.RESET);
                    //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given Answer1(EqnUnderTest)=" + EqnUnderTest + ConsoleColors.RESET);
                    //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given Answer(EqnSolArrayMap3[Order])=" + EqnSolArrayMap3[Order] + ConsoleColors.RESET);
                    WrongAnsTestCasesMap1.put(MaxIndexWrongAnsMap1, TestCase + " ,");
                    MaxIndexWrongAnsMap1++;
                }
                StageMapping = "Integration Mapping";
                //MapType="Map2";
                ChaosPrevention();
                //System.out.println(ConsoleColors.BLUE + " main:Test Case Status=" + " MAP2 START VERBOSE IF SET" + ConsoleColors.RESET);
                //System.out.println(ConsoleColors.BLUE + " main:Test Case Status=" + " MAP2 START VERBOSE IF SET" + ConsoleColors.RESET);
                //System.out.println(ConsoleColors.BLUE + " main:Test Case Status=" + " StrexpDiffExpress=" + StrexpDiffExpress + ConsoleColors.RESET);
                expSimpleMap2 = parseSimple(StrexpDiffExpress, variables, DiffWithRespTo, "Map2", IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
                StrexpSimpleExpressMap2 = expSimpleMap2.SimpleExpr();
                //System.out.println(ConsoleColors.BLUE + " main:Test Case Status=" + " MAP2 END VERBOSE IF SET" + ConsoleColors.RESET);
                //System.out.println(ConsoleColors.BLUE + " main:Test Case Status=" + " MAP2 END VERBOSE IF SET" + ConsoleColors.RESET);
                expValue = parse(StrexpDiffExpress, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpDiffValue = expValue.eval();
                WrongAnswerFlagCalculus1 = false;
                if (Order == 1) {
                    WrongAnswerCalculus1(EqnSolArrayDiffAlone[Order], variables, EqnSolArrayMap2[Order]);
                    if ((WrongAnswerFlagCalculus1 == true)) {
                        WrongAnswerCountCalculus1++;
                        //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "WRONG ANSWER MAP2" + ConsoleColors.RESET);
                        //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given Answe2(EqnSolArrayDiffAlone[Order])=" + EqnSolArrayDiffAlone[Order] + ConsoleColors.RESET);
                        //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given AnswerMap(EqnSolArrayMap2[Order])=" + EqnSolArrayMap2[Order] + ConsoleColors.RESET);
                        WrongAnsTestCasesCalculus1.put(MaxIndexWrongAnsCalculus1, TestCase + " ,");
                        MaxIndexWrongAnsCalculus1++;
                    }
                }
                //System.out.println("main: " + DiffWithRespTo + "=" + x + " Result(Diff Value)=" + DblexpDiffValue);
                //System.out.println(" main:Result(Simplified Diff Equation)(" + Order + " th order)=> " + StrexpSimpleExpressMap2);
                expValue = parse(StrexpSimpleExpressMap2, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpValueMap2 = expValue.eval();
                WrongAnswerFlagMap2 = false;
                if (Order == 1) {
                    WrongAnswerMap2(EqnSolArrayDiffAlone[Order], variables, EqnSolArrayMap2[Order], MaxOrder1);
                    if ((WrongAnswerFlagMap2 == true)) {
                        WrongAnswerCountMap2++;
                        //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "WRONG ANSWER MAP2" + ConsoleColors.RESET);
                        //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given Answer3(EqnSolArrayDiffAlone[Order])=" + EqnSolArrayDiffAlone[Order] + ConsoleColors.RESET);
                        //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given AnswerMap(EqnSolArrayMap2[Order])=" + EqnSolArrayMap2[Order] + ConsoleColors.RESET);
                        WrongAnsTestCasesMap2.put(MaxIndexWrongAnsMap2, TestCase + " ,");
                        MaxIndexWrongAnsMap2++;
                    }
                }
                //System.out.println("main: " + DiffWithRespTo + "=" + x + " Result(Simplified Diff Value)=" + expValue.eval());
                //Usage.FInverseEqn=FInverseLagrangeBurmann( Exprn, DiffWithRespTo, MaxOrder1,x, "",  "", '/', 12);

                //Usage.FInverseEqn = FInverseLagrangeBurmannLowLevel(Exprn, DiffWithRespTo, MaxOrder1, x, 10.0, "", "", '/', 4);
                //System.out.println("main: FInverse:" + "x" + "=" + UsageCalculus.FInverseEqn);
                //System.out.print(System.lineSeparator());
                if (PassFailTestCaseString(TestCase, Order, "Diff", Exprn, StrexpSimpleExpressMap1, StrexpDiffExpress, StrexpSimpleExpressMap2, EqnUnderTest, EqnSolArrayMap1[Order], EqnSolArrayDiffAlone[Order], EqnSolArrayMap2[Order], StrexpIntegreExpress, EqnSolArrayIntegrAlone[Order], xExprnOptionSelected)) {
                    //System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass STRING TEST Complete" + ConsoleColors.RESET);
                    TestCasePassStrFlag = true;
                } else {
                    //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "FAIL STRING TEST Complete" + ConsoleColors.RESET);
                    if (TestCasePassHighLevelFlag == true) {
                        TestCasePassHighLevelFlag = false;
                    }
                }

//                if (PassFailTestCaseValueStrict(TestCase, Order, "Diff", Exprn, ExprnexpValue, DblexpValueMap1, DblexpDiffValue, DblexpValueMap2, StrexpDiffExpress, variables, x)) {
//                    //System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass VALUE TEST Complete:Pragma:" + Pragma + ConsoleColors.RESET);
//                    TestCasePassValFlag = true;
//                    TestCasePassHighLevelFlag = true;
//                } else {
//                    //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Fail VALUE TEST Complete" + ConsoleColors.RESET);
//                    TestCasePassValFlag = false;
//                    TestCasePassHighLevelFlag = false;
//                }
                if ((TestCasePassStrFlag == true) || (TestCasePassValFlag == true)) {
                    //TestCasePassConformalValFlag = ConformalMapTestCaseDiff(TestCase, Order, Exprn, expSimpleMap1, exp, expSimpleMap2, EqnSolArrayMap1[Order], EqnSolArrayDiffAlone[Order], EqnSolArrayMap2[Order], variables, DiffWithRespTo);
                }
                if ((TestCasePassValFlag != true) && (PassFailTestCaseValueEasy(TestCase, Order, "Diff", Exprn, ExprnexpValue, DblexpValueMap1, DblexpDiffValue, DblexpValueMap2, StrexpDiffExpress, variables, x))) {
                    //System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass VALUE TEST Complete:Pragma:Loose" + ConsoleColors.RESET);
                    TestCasePassValFlag = true;
                    TestCasePassHighLevelFlag = true;
                }
                if (TestCasePassConformalValFlag == true) {
                    //System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass Conformal Map TEST" + ConsoleColors.RESET);
                } else if ((TestCasePassStrFlag != true) || (TestCasePassValFlag != true)) {
                    //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Conformal Map TEST Not Executed" + ConsoleColors.RESET);
                } else {
                    //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "FAIL Conformal Map TEST " + ConsoleColors.RESET);
                }
                if ((TestCasePassStrFlag == true) && (TestCasePassValFlag == true)) {
                    //System.out.println(ConsoleColors.BLUE + "Super Test Answer Checks" + ConsoleColors.RESET);
                }
                if ((TestCasePassStrFlag == true) /* && (TestCasePassValFlag == true) && (TestCasePassConformalValFlag == true)*/) {
                    TestCasePassHighLevelFlag = true;//DO Nothing as Test Cases Passes
                } else if (!((TestCasePassValFlag == true) && (TestCasePassConformalValFlag == true))) {
                    String Temp = FailedTestCases.get(MaxIndexFail);
                    String HashVal = "";
                    if ((TestCaseFailCoarseReportingFlag == false) && (Temp != null) && (Order >= 2) && (!Temp.equalsIgnoreCase("")) && (!Temp.contains("Section"))) {
                        HashVal = Temp + "," + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag + ":ConfValFlag=" + TestCasePassConformalValFlag;
                    } else if (TestCaseFailCoarseReportingFlag == false) {
                        HashVal = "TestCase=" + TestCase + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag + ":ConfValFlag=" + TestCasePassConformalValFlag;
                    } else if ((TestCaseFailCoarseReportingFlag == true) && (Order == 1) && (Temp != null)) {
                        //HashVal = "TestCase=" + TestCase + "," + ":Order=" + (Order) ;
                        HashVal = Temp + "," + "(j==" + TestCase + ")";
                    } else if ((TestCaseFailCoarseReportingFlag == true) && (Temp != null)) {
                        //HashVal = Temp +"," + ":Order=" + (Order) ;
                        HashVal = Temp;
                    } else {
                        HashVal = "(j==" + TestCase + ")";
                    }
                    FailedTestCases.put(MaxIndexFail, HashVal);
                    //i=MaxOrder1;
                    TestCasePassHighLevelFlag = false;
                } else {
                    TestCasePassHighLevelFlag = true;
                }
                if (!FailTestCaseStringDiagnostic(TestCase, Order, MaxOrder1, "Diff", Exprn, StrexpSimpleExpressMap1, StrexpDiffExpress, StrexpSimpleExpressMap2, EqnUnderTest, EqnSolArrayMap1[Order], EqnSolArrayDiffAlone[Order], EqnSolArrayMap2[Order])) {
                    //System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Diagnostic Complete" + ConsoleColors.RESET);
                }
                if (TestCasePassHighLevelFlag == false) {
                    ruleAnalytics.recordSummary("" + TestCase, Order, EqnUnderTest, Exprn, StrexpSimpleExpressMap1, EqnSolArrayMap1[Order], StrexpDiffExpress, EqnSolArrayDiffAlone[Order], StrexpSimpleExpressMap2, EqnSolArrayMap2[Order], TestCasePassHighLevelFlag, TestCasePassStrFlag, TestCasePassValFlag, TestCasePassConformalValFlag);
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
                if ((TestCaseFailCoarseReportingFlag == false) && (Temp != null) && (!Temp.equalsIgnoreCase("")) && (!Temp.contains("Section"))) {
                    HashVal = Temp + "," + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag;
                } else if (TestCaseFailCoarseReportingFlag == false) {
                    HashVal = "TestCase=" + TestCase + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag;
                } else if ((TestCaseFailCoarseReportingFlag == true) && (Order == 1)) {
                    HashVal = Temp;
                } else if ((TestCaseFailCoarseReportingFlag == true)) {
                    HashVal = Temp;
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
                //Order = MaxOrder1;
                TestCasePassHighLevelFlag = false;
            }
        }
        System.out.print(System.lineSeparator());

    }

    public static void AIIntegralHighSingleTest2(int MaxOrder1, String Exprn, String MapType, String IntegrORDiffr, String xExprnOptionSelected) {
        Map<String, Double> variables = new HashMap<>();
        SimpleExpression expSimpleMap1 = (() -> "");
        Expression expValue = (() -> Double.NaN);;
        SimpleExpression expSimpleMap2 = (() -> "");
        DiffrIntegrSep.IntegrExpr exp = (() -> "");
        DiffrIntegrSep.DiffExpr expDiffExpr = (() -> "");

        MyFuncExpress();
        MyFuncIntegr();
        MyFuncSimple();

        String Constant = "C";
        String StrexpSimpleExpressMap1 = "";
        String StrexpDiffExpress = "";
        String StrexpIntegreExpress = "";
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
        for (double x = 1.0, y = 7; (Order < MaxOrder1) && (Order < 2); y++, /*x++,*/ Order++) {
            try {
                TestCasePassStrFlag = false;
                TestCasePassValFlag = false;
                TestCasePassConformalValFlag = false;
                variables.put(DiffWithRespTo, x);
                variables.put("y", y);
                variables.put("a", 1.0);
                variables.put("b", 2.0);//variables.put("b", 0.0);
                variables.put("c", -1.0);
                variables.put("d", 2.0);
                variables.put("p", 1.0);
                variables.put("q", 0.0);
                variables.put("r", -1.0);
                variables.put("s", 2.0);
                variables.put("i", 1.0);
                variables.put("E1", 1.0);
                variables.put(Constant, 5.0);
                StageMapping = "Basic Mapping";
                MapType = "Map1";

                System.out.println("main: " + DiffWithRespTo + "=" + x + " Exprn=" + Exprn + " Order=" + myOrder);
                ChaosPrevention();
                //System.out.println(ConsoleColors.BLUE + "main:MAP1 START VERBOSE IF SET" + ConsoleColors.RESET);
                //System.out.println(ConsoleColors.BLUE + "main:MAP1 START VERBOSE IF SET" + ConsoleColors.RESET);
                expSimpleMap1 = parseSimple(Exprn, variables, DiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
                StrexpSimpleExpressMap1 = expSimpleMap1.SimpleExpr();
                //System.out.println("main: " + DiffWithRespTo + "=" + x + " After Map1:Basic Simple Exprn=" + StrexpSimpleExpressMap1);
                //System.out.println(ConsoleColors.BLUE + "main:MAP1 END VERBOSE IF SET" + ConsoleColors.RESET);
                //System.out.println(ConsoleColors.BLUE + "main:MAP1 END VERBOSE IF SET" + ConsoleColors.RESET);
                expValue = parse(Exprn, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                ExprnexpValue = expValue.eval();
                //System.out.println(" main:Result(Expn Value)=" + ExprnexpValue + "  x=" + x + " " + DiffWithRespTo + "=" + x);

                expValue = parse(StrexpSimpleExpressMap1, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpValueMap1 = expValue.eval();
                //System.out.println("main: " + DiffWithRespTo + "=" + x + " Basic Simple (Exprn Value)=" + DblexpValueMap1);

                StageMapping = "Integration";
                //System.out.println(ConsoleColors.BLUE + "main:Integration VERBOSE IF SET" + ConsoleColors.RESET);
                //System.out.println(ConsoleColors.BLUE + "main:Integration VERBOSE IF SET" + ConsoleColors.RESET);
                exp = DiffrIntegrSep.parseIntegr(StrexpSimpleExpressMap1, variables, DiffWithRespTo, MapType, IntegrORDiffr);
                StrexpDiffExpress = exp.IntegrExpr();
                //System.out.println(" main:Result(Integral Equation)(" + Order + " th order)=> " + StrexpDiffExpress);
                //' Convert Both Answers to POSITIVE DOMAIN as For Nominal Answer of -23.0 , -24 or -22 is allowed
                if ((DblexpValueMap1 < 0) && (ExprnexpValue < 0)) {
                    DblexpValueMap1 = DblexpValueMap1 * -1.0;
                    ExprnexpValue = ExprnexpValue * -1.0;
                }
                WrongAnswerFlagMap1 = false;
                WrongAnswerMap1(Exprn, variables, EqnSolArrayMap3[Order], MaxOrder1);
                if ((WrongAnswerFlagMap1 == true) && (Order == 1)) {
                    WrongAnswerCountMap1++;
                    //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "WRONG ANSWER MAP3" + ConsoleColors.RESET);
                    //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given Answer1(EqnUnderTest)=" + EqnUnderTest + ConsoleColors.RESET);
                    //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given Answer(EqnSolArrayMap3[Order])=" + EqnSolArrayMap3[Order] + ConsoleColors.RESET);
                    WrongAnsTestCasesMap1.put(MaxIndexWrongAnsMap1, TestCase + " ,");
                    MaxIndexWrongAnsMap1++;
                }
                System.out.println(ConsoleColors.BLUE + " main:Test Case Status=" + "NO Infinite LOOP " + ":Integration Complete" + ConsoleColors.RESET);
                StageMapping = "Differentiation";
                //System.out.println(ConsoleColors.BLUE + "main:Differentiation VERBOSE IF SET" + ConsoleColors.RESET);
                //System.out.println(ConsoleColors.BLUE + "main:Differentiation VERBOSE IF SET" + ConsoleColors.RESET);
                expDiffExpr = DiffrIntegrSep.parseDiff(StrexpSimpleExpressMap1, variables, DiffWithRespTo, MapType, IntegrORDiffr);
                StrexpIntegreExpress = expDiffExpr.DiffExpr();
                //System.out.println(" main:Result(Diff Equation)(" + Order + " th order)=> " + StrexpDiffExpress);
                System.out.println(ConsoleColors.BLUE + " main:Test Case Status=" + "NO Infinite LOOP " + ":Differentiation Complete" + ConsoleColors.RESET);
                StageMapping = "Differentiation Mapping";
                MapType = "Map2";
                ChaosPrevention();
                //System.out.println(ConsoleColors.BLUE + "main:MAP2 START VERBOSE IF SET" + ConsoleColors.RESET);
                //System.out.println(ConsoleColors.BLUE + "main:MAP2 START VERBOSE IF SET" + ConsoleColors.RESET);
                expSimpleMap2 = parseSimple(StrexpDiffExpress, variables, DiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
                StrexpSimpleExpressMap2 = expSimpleMap2.SimpleExpr();
                //System.out.println(" main:Result(Simplified Integral Equation)(" + Order + " th order)=> " + StrexpSimpleExpressMap2);
                //System.out.println(ConsoleColors.BLUE + "main:MAP2 END VERBOSE IF SET" + ConsoleColors.RESET);
                //System.out.println(ConsoleColors.BLUE + "main:MAP2 END VERBOSE IF SET" + ConsoleColors.RESET);
                expValue = parse(StrexpDiffExpress, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Info);
                DblexpDiffValue = expValue.eval();
                //System.out.println("main: " + DiffWithRespTo + "=" + x + " Result(Integral Value)=" + DblexpDiffValue);
                expValue = parse(StrexpSimpleExpressMap2, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Info);
                DblexpValueMap2 = expValue.eval();
                WrongAnswerFlagCalculus1 = false;
                if (Order == 1) {
                    WrongAnswerCalculus1(EqnSolArrayIntegrAlone[Order], variables, EqnSolArrayMap4[Order]);
                    if ((WrongAnswerFlagCalculus1 == true)) {
                        WrongAnswerCountCalculus1++;
                        //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "WRONG ANSWER MAP2" + ConsoleColors.RESET);
                        //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given Answer2(EqnSolArrayIntegrAlone[Order])=" + EqnSolArrayIntegrAlone[Order] + ConsoleColors.RESET);
                        //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given AnswerMap(EqnSolArrayMap4[Order])=" + EqnSolArrayMap4[Order] + ConsoleColors.RESET);
                        WrongAnsTestCasesCalculus1.put(MaxIndexWrongAnsCalculus1, TestCase + " ,");
                        MaxIndexWrongAnsCalculus1++;
                    }
                }
                WrongAnswerFlagMap2 = false;
                WrongAnswerMap2(EqnSolArrayIntegrAlone[Order], variables, EqnSolArrayMap4[Order], MaxOrder1);
                System.out.println(ConsoleColors.BLUE + " main:Test Case Status=" + "NO Infinite LOOP " + ":Differentiation Complete" + ConsoleColors.RESET);
                if ((WrongAnswerFlagMap2 == true) && (Order == 1)) {
                    WrongAnswerCountMap2++;
                    //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "WRONG ANSWER MAP4" + ConsoleColors.RESET);
                    //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given Answer2(EqnSolArrayIntegrAlone[Order])=" + EqnSolArrayIntegrAlone[Order] + ConsoleColors.RESET);
                    //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given AnswerMap(EqnSolArrayMap4[Order])=" + EqnSolArrayMap4[Order] + ConsoleColors.RESET);
                    WrongAnsTestCasesMap2.put(MaxIndexWrongAnsMap2, TestCase + " ,");
                    MaxIndexWrongAnsMap2++;
                }

                if (PassFailTestCaseString(TestCase, Order, "Integre", Exprn, StrexpSimpleExpressMap1, StrexpDiffExpress, StrexpSimpleExpressMap2, EqnUnderTest, EqnSolArrayMap3[Order], EqnSolArrayIntegrAlone[Order], EqnSolArrayMap4[Order], StrexpIntegreExpress, EqnSolArrayDiffAlone[Order], xExprnOptionSelected)) {
                    //System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass STRING TEST Complete" + ConsoleColors.RESET);
                    TestCasePassStrFlag = true;
                } else {
                    //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Fail STRING TEST Complete" + ConsoleColors.RESET);
                    TestCasePassStrFlag = false;
                }
                System.out.println(ConsoleColors.BLUE + " main:Test Case Status=" + "NO Infinite LOOP " + ":Differentiation Complete" + ConsoleColors.RESET);

//                if (PassFailTestCaseValueStrict(TestCase, Order, "Integre", Exprn, ExprnexpValue, DblexpValueMap1, DblexpDiffValue, DblexpValueMap2, StrexpDiffExpress, variables, x)) {
//                    //System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass VALUE TEST CompletePragma:Strict" + ConsoleColors.RESET);
//                    TestCasePassValFlag = true;
//                    TestCasePassHighLevelFlag = true;
//                } else {
//                    //System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Fail VALUE TEST Complete" + ConsoleColors.RESET);
//                }
                if ((TestCasePassStrFlag == true) || (TestCasePassValFlag == true)) {
                    //TestCasePassConformalValFlag = ConformalMapTestCaseIntegr(TestCase, Order, Exprn, expSimpleMap1, exp, expSimpleMap2, EqnSolArrayMap3[Order], EqnSolArrayIntegrAlone[Order], EqnSolArrayMap4[Order], variables, DiffWithRespTo);
                }
                if ((TestCasePassValFlag != true) && (PassFailTestCaseValueEasy(TestCase, Order, "Integre", Exprn, ExprnexpValue, DblexpValueMap1, DblexpDiffValue, DblexpValueMap2, StrexpDiffExpress, variables, x))) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass VALUE TEST Complete:Pragma:Loose" + ConsoleColors.RESET);
                    TestCasePassValFlag = true;
                    TestCasePassHighLevelFlag = true;
                }
                if (TestCasePassConformalValFlag == true) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass Conformal Map TEST" + ConsoleColors.RESET);
                } else if ((TestCasePassStrFlag != true) || (TestCasePassValFlag != true)) {
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Conformal Map TEST Not Executed" + ConsoleColors.RESET);
                } else {
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "FAIL Conformal Map TEST " + ConsoleColors.RESET);
                }
                if ((TestCasePassStrFlag == true) && (TestCasePassValFlag == true)) {
                    //System.out.println(ConsoleColors.BLUE + "Super Test Answer Checks" + ConsoleColors.RESET);
                }
                if ((TestCasePassStrFlag == true) /* && (TestCasePassValFlag == true) && (TestCasePassConformalValFlag == true)*/) {
                    TestCasePassHighLevelFlag = true;//DO Nothing as Test Cases Passes
                } else if (!((TestCasePassValFlag == true) && (TestCasePassConformalValFlag == true))) {
                    String Temp = FailedTestCases.get(MaxIndexFail);
                    String HashVal = "";
                    if ((TestCaseFailCoarseReportingFlag == false) && (Temp != null) && (Order >= 2) && (!Temp.equalsIgnoreCase("")) && (!Temp.contains("Section"))) {
                        HashVal = Temp + "," + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag + ":ConfValFlag=" + TestCasePassConformalValFlag;
                    } else if (TestCaseFailCoarseReportingFlag == false) {
                        HashVal = "TestCase=" + TestCase + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag + ":ConfValFlag=" + TestCasePassConformalValFlag;
                    } else if ((TestCaseFailCoarseReportingFlag == true) && (Order == 1) && (Temp != null)) {
                        //HashVal = "TestCase=" + TestCase + "," + ":Order=" + (Order) ;
                        HashVal = Temp + "(j==" + TestCase + ")";
                    } else if ((TestCaseFailCoarseReportingFlag == true) && (Temp != null)) {
                        //HashVal = Temp +"," + ":Order=" + (Order) ;
                        HashVal = Temp;
                    } else {
                        HashVal = "(j==" + TestCase + ")";
                    }
                    FailedTestCases.put(MaxIndexFail, HashVal);
                    //i=MaxOrder1;
                    TestCasePassHighLevelFlag = false;
                } else {
                    TestCasePassHighLevelFlag = true;
                }
                if (!FailTestCaseStringDiagnostic(TestCase, Order, MaxOrder1, "Integre", Exprn, StrexpSimpleExpressMap1, StrexpDiffExpress, StrexpSimpleExpressMap2, EqnUnderTest, EqnSolArrayMap3[Order], EqnSolArrayIntegrAlone[Order], EqnSolArrayMap4[Order])) {
                    //System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Diagnostic Complete" + ConsoleColors.RESET);
                }
                if (TestCasePassHighLevelFlag == false) {
                    ruleAnalytics.recordSummary("" + TestCase, Order, EqnUnderTest, Exprn, StrexpSimpleExpressMap1, EqnSolArrayMap3[Order], StrexpDiffExpress, EqnSolArrayIntegrAlone[Order], StrexpSimpleExpressMap2, EqnSolArrayMap4[Order], TestCasePassHighLevelFlag, TestCasePassStrFlag, TestCasePassValFlag, TestCasePassConformalValFlag);
                }

                Exprn = EqnSolArrayMap3[Order + 1];
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
                if ((TestCaseFailCoarseReportingFlag == false) && (Temp != null) && (!Temp.equalsIgnoreCase("")) && (!Temp.contains("Section"))) {
                    HashVal = Temp + "," + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag;
                } else if ((TestCaseFailCoarseReportingFlag == false)) {
                    HashVal = "TestCase=" + TestCase + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag;
                } else if ((TestCaseFailCoarseReportingFlag == true) && (Order == 1)) {
                    HashVal = Temp;
                } else {
                    HashVal = Temp;
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
                //Order = MaxOrder1;
                TestCasePassHighLevelFlag = false;
            }
        }
        System.out.print(System.lineSeparator());
    }

    public static void CheckIdempontencyOrderLoop(int MaxOrder1, long j, String Exprn, boolean DupFlag, String IntegrORDiffr, String AlgoDispStr) {
        int AllTestCaseOrderPassed = 0;
        String MapType = "Map1";
        System.out.println(ConsoleColors.YELLOW + "Test Case " + TestCase + " EndTestCase=" + EndTestCase + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case " + TestCase + " TestCaseFile=" + TestCaseFile + " Section=" + Section + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Exprn=" + Exprn + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case Name=" + TestCaseName + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case Name=" + TestCaseMatrixID + ConsoleColors.RESET);

        if (Exprn.equalsIgnoreCase("")) {
            return;
        }

        if (IntegrORDiffr.equalsIgnoreCase("Integr")) {
            System.out.println(ConsoleColors.BLUE + "Integral Regression Status : Test Case should be " + EqnRegressionIntegreStatus + ConsoleColors.RESET);
        } else if (IntegrORDiffr.equalsIgnoreCase("Diffr")) {
            System.out.println(ConsoleColors.BLUE + "Regression Status : Test Case should be " + EqnRegressionDiffStatus + ConsoleColors.RESET);
        }
        for (double x = 1.0, y = 7.0; Order < MaxOrder1; y++, /*x++,*/ Order++) {
            if ((IntegrORDiffr.equalsIgnoreCase("Integr")) && (Order > 1)) {
                Exprn = eatAll(EqnSolArrayMap4[Order - 1], ' ');
            } else if ((IntegrORDiffr.equalsIgnoreCase("Diffr")) && (Order > 1)) {
                Exprn = eatAll(EqnSolArrayMap2[Order - 1], ' ');
            } else if ((Order == 1) && ((IntegrORDiffr.equalsIgnoreCase("Integr")) || (IntegrORDiffr.equalsIgnoreCase("Diffr")))) {
                Exprn = eatAll(EqnUnderTest, ' ');
            }

            variables.put(DiffWithRespTo, x);
            variables.put("y", y);
            variables.put("a", 1.0);
            variables.put("b", 2.0);//variables.put("b", 0.0);
            variables.put("c", -1.0);
            variables.put("d", 2.0);
            variables.put("m", -1.0);
            variables.put("p", 3.0);
            variables.put("q", 0.0);
            variables.put("r", -1.0);
            variables.put("s", 2.0);
            variables.put("i", 1.0);
            variables.put("E1", 1.0);
            if (/*(!Exprn.equalsIgnoreCase("")) && */((DupFlag == false))) {
                if ((IntegrORDiffr.equalsIgnoreCase("Integr"))) {
                    IdempontencyIntegreTest(Exprn, MapType, IntegrORDiffr);
                } else if ((IntegrORDiffr.equalsIgnoreCase("Diffr"))) {
                    IdempontencyDiffrTest(Exprn, MapType, IntegrORDiffr);
                }
                //}
                if (TestCasePassHighLevelFlag == false) {
                    String Temp = FailedTestCases.get(MaxIndexFail);
                    String HashVal = "";
                    if ((TestCaseFailCoarseReportingFlag == false) && (Temp != null) && (Order >= 2) && (!Temp.equalsIgnoreCase("")) && (!Temp.contains("Section"))) {
                        HashVal = Temp + "," + ":Order=" + (Order);
                    } else if (TestCaseFailCoarseReportingFlag == false) {
                        HashVal = "TestCase=" + TestCase + ":Order=" + (Order);
                    } else if ((TestCaseFailCoarseReportingFlag == true) && (Order == 1) && (Temp != null)) {
                        //HashVal = "TestCase=" + TestCase + "," + ":Order=" + (Order) ;
                        HashVal = Temp + "," + "(j==" + TestCase + ")";
                    } else if ((TestCaseFailCoarseReportingFlag == true) && (Temp != null)) {
                        //HashVal = Temp +"," + ":Order=" + (Order) ;
                        HashVal = Temp;
                    } else {
                        HashVal = "(j==" + TestCase + ")";
                    }
                    FailedTestCases.put(MaxIndexFail, HashVal);
                    //i=MaxOrder1;
                    TestCasePassHighLevelFlag = false;
                }
            } else if (DupFlag == true) {
                System.out.println(ConsoleColors.RED + "mainValue:" + AlgoDispStr + ": j=" + j + " TestCase=" + TestCase + " Dup. Hence NOT Executing.");
            }
            if ((WrongAnswerFlagMap1 == false)) {
                AllTestCaseOrderPassed++;
            }
        }
        if ((WrongAnswerFlagMap1 == false) && (AllTestCaseOrderPassed == (Order - 1))) {
            TestCasePassHighLevelFlag = true;
        }
        if (TestCasePassHighLevelFlag == false) {
            if (Order == MaxOrder1) {
                MaxIndexFail++;
            }
        }
    }

    public static void IdempontencyDiffrTest(String Exprn, String MapType, String IntegrORDiffr) {
        Map<String, Double> variables = new HashMap<>();
        SimpleExpression expSimpleMap1 = (() -> "");
        Expression expValue = (() -> Double.NaN);;
        SimpleExpression expSimpleMap2 = (() -> "");
        DiffrIntegrSep.DiffExpr exp = (() -> "");

        MyFuncExpress();
        MyFuncDiff();
        MyFuncSimple();

        String StrexpSimpleExpressMap1 = "";
        String StrexpDiffExpress = "";
        String StrexpSimpleExpressMap2 = "";
        String myOrder = "";
        double ExprnexpValue = 0;
        double DblexpValueMap1 = 0;
        double DblexpDiffValue = 0;
        double DblexpValueMap2 = 0;
        try {
            StageMapping = "Basic Mapping";
            MapType = "Map1";
            System.out.println(ConsoleColors.BLUE + "main:MAP1 START VERBOSE IF SET" + ConsoleColors.RESET);
            System.out.println(ConsoleColors.BLUE + "main:MAP1 START VERBOSE IF SET" + ConsoleColors.RESET);
            if (Trace.contains("Map1")) {
                SetDevFlags(true, "Silent", false);
            } else {
                SetDevFlags(false, "Silent", false);
            }
            if ((Trace.contains("Map1")) && (AITestResultsGenFlag)) {
                SetDevFlagsAI(true, "Silent", false);
            } else if (AITestResultsGenFlag) {
                SetDevFlagsAI(false, "Silent", false);
            }
            expSimpleMap1 = parseSimple(Exprn, variables, DiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
            StrexpSimpleExpressMap1 = expSimpleMap1.SimpleExpr();
            System.out.println("main: After Map1:Basic Simple Exprn=" + StrexpSimpleExpressMap1);
            System.out.println(ConsoleColors.BLUE + "main:MAP1 END VERBOSE IF SET" + ConsoleColors.RESET);
            System.out.println(ConsoleColors.BLUE + "main:MAP1 END VERBOSE IF SET" + ConsoleColors.RESET);

            StageMapping = "Basic Mapping";
            MapType = "Map1";
            System.out.println(ConsoleColors.BLUE + "main:MAP2(Map1) START VERBOSE IF SET" + ConsoleColors.RESET);
            System.out.println(ConsoleColors.BLUE + "main:MAP2(Map1) START VERBOSE IF SET" + ConsoleColors.RESET);
            if (Trace.contains("Map1")) {
                SetDevFlags(true, "Silent", false);
            } else {
                SetDevFlags(false, "Silent", false);
            }
            if ((Trace.contains("Map1")) && (AITestResultsGenFlag)) {
                SetDevFlagsAI(true, "Silent", false);
            } else if (AITestResultsGenFlag) {
                SetDevFlagsAI(false, "Silent", false);
            }
            expSimpleMap1 = parseSimple(Exprn, variables, DiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
            StrexpSimpleExpressMap2 = expSimpleMap1.SimpleExpr();
            System.out.println("main: After MAP2(Map1):Basic Simple Exprn=" + StrexpSimpleExpressMap2);
            System.out.println(ConsoleColors.BLUE + "main:MAP2(Map1) END VERBOSE IF SET" + ConsoleColors.RESET);
            System.out.println(ConsoleColors.BLUE + "main:MAP2(Map1) END VERBOSE IF SET" + ConsoleColors.RESET);

            StageMapping = "Differentiation";
            System.out.println(ConsoleColors.BLUE + "main:Differentiation VERBOSE IF SET" + ConsoleColors.RESET);
            System.out.println(ConsoleColors.BLUE + "main:Differentiation VERBOSE IF SET" + ConsoleColors.RESET);
            exp = DiffrIntegrSep.parseDiff(StrexpSimpleExpressMap1, variables, DiffWithRespTo, MapType, IntegrORDiffr);
            StrexpDiffExpress = exp.DiffExpr();
            System.out.println(" main:Result(Diff Equation)(" + Order + " th order)=> " + StrexpDiffExpress);

            System.out.print(System.lineSeparator());
            if (PassFailIdempotentString(TestCase, Order, "Diff", Exprn, StrexpSimpleExpressMap1, StrexpDiffExpress, StrexpSimpleExpressMap2, EqnUnderTest, EqnSolArrayMap1[Order], EqnSolArrayDiffAlone[Order], EqnSolArrayMap2[Order])) {
                System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass STRING TEST Complete" + ConsoleColors.RESET);
                TestCasePassStrFlag = true;
            } else {
                System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "FAIL STRING TEST Complete" + ConsoleColors.RESET);
                if (TestCasePassHighLevelFlag == true) {
                    TestCasePassHighLevelFlag = false;
                }
            }
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
        }
    }

    public static void IdempontencyIntegreTest(String Exprn, String MapType, String IntegrORDiffr) {
        Map<String, Double> variables = new HashMap<>();
        SimpleExpression expSimpleMap1 = (() -> "");
        Expression expValue = (() -> Double.NaN);;
        SimpleExpression expSimpleMap2 = (() -> "");
        DiffrIntegrSep.IntegrExpr exp = (() -> "");

        MyFuncExpress();
        MyFuncIntegr();
        MyFuncSimple();

        String StrexpSimpleExpressMap1 = "";
        String StrexpDiffExpress = "";
        String StrexpSimpleExpressMap2 = "";
        String myOrder = "";
        double ExprnexpValue = 0;
        double DblexpValueMap1 = 0;
        double DblexpDiffValue = 0;
        double DblexpValueMap2 = 0;
        try {
            StageMapping = "Basic Mapping";
            MapType = "Map1";
            System.out.println(ConsoleColors.BLUE + "main:MAP1 START VERBOSE IF SET" + ConsoleColors.RESET);
            System.out.println(ConsoleColors.BLUE + "main:MAP1 START VERBOSE IF SET" + ConsoleColors.RESET);
            if (Trace.contains("Map1")) {
                SetDevFlags(true, "Silent", false);
            } else {
                SetDevFlags(false, "Silent", false);
            }
            if ((Trace.contains("Map1")) && (AITestResultsGenFlag)) {
                SetDevFlagsAI(true, "Silent", false);
            } else if (AITestResultsGenFlag) {
                SetDevFlagsAI(false, "Silent", false);
            }
            expSimpleMap1 = parseSimple(Exprn, variables, DiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
            StrexpSimpleExpressMap1 = expSimpleMap1.SimpleExpr();
            System.out.println("main: After Map1:Basic Simple Exprn=" + StrexpSimpleExpressMap1);
            System.out.println(ConsoleColors.BLUE + "main:MAP1 END VERBOSE IF SET" + ConsoleColors.RESET);
            System.out.println(ConsoleColors.BLUE + "main:MAP1 END VERBOSE IF SET" + ConsoleColors.RESET);

            System.out.println(ConsoleColors.BLUE + "main:MAP2(MAP1) START VERBOSE IF SET" + ConsoleColors.RESET);
            System.out.println(ConsoleColors.BLUE + "main:MAP2(MAP1) START VERBOSE IF SET" + ConsoleColors.RESET);
            if (Trace.contains("Map1")) {
                SetDevFlags(true, "Silent", false);
            } else {
                SetDevFlags(false, "Silent", false);
            }
            if ((Trace.contains("Map1")) && (AITestResultsGenFlag)) {
                SetDevFlagsAI(true, "Silent", false);
            } else if (AITestResultsGenFlag) {
                SetDevFlagsAI(false, "Silent", false);
            }
            expSimpleMap1 = parseSimple(StrexpSimpleExpressMap1, variables, DiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
            StrexpSimpleExpressMap2 = expSimpleMap1.SimpleExpr();
            System.out.println("main: After MAP2(MAP1):Basic Simple Exprn=" + StrexpSimpleExpressMap2);
            System.out.println(ConsoleColors.BLUE + "main:MAP1(MAP1) END VERBOSE IF SET" + ConsoleColors.RESET);
            System.out.println(ConsoleColors.BLUE + "main:MAP1(MAP1) END VERBOSE IF SET" + ConsoleColors.RESET);

            StageMapping = "Integration";
            System.out.println(ConsoleColors.BLUE + "main:Integration VERBOSE IF SET" + ConsoleColors.RESET);
            System.out.println(ConsoleColors.BLUE + "main:Integration VERBOSE IF SET" + ConsoleColors.RESET);
            exp = DiffrIntegrSep.parseIntegr(StrexpSimpleExpressMap1, variables, DiffWithRespTo, MapType, IntegrORDiffr);
            StrexpDiffExpress = exp.IntegrExpr();
            System.out.println(" main:Result(Integral Equation)(" + Order + " th order)=> " + StrexpDiffExpress);

            if (PassFailIdempotentString(TestCase, Order, "Integre", Exprn, StrexpSimpleExpressMap1, StrexpDiffExpress, StrexpSimpleExpressMap2, EqnUnderTest, EqnSolArrayMap3[Order], EqnSolArrayIntegrAlone[Order], EqnSolArrayMap4[Order])) {
                System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass STRING TEST Complete" + ConsoleColors.RESET);
                TestCasePassStrFlag = true;
            } else {
                System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Fail STRING TEST Complete" + ConsoleColors.RESET);
                TestCasePassStrFlag = false;
            }
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
        }
    }

    public static void WrongAnsProcessIntegreMap2(int MaxOrder1) {
        WrongAnswerFlagCalculus1 = false;
        if (Order == 1) {
            WrongAnswerCalculus1(EqnSolArrayIntegrAlone[Order], variables, EqnSolArrayMap4[Order]);
            if ((WrongAnswerFlagCalculus1 == true)) {
                WrongAnswerCountCalculus1++;
                //if (!DetailedFailureSummaryAloneFlag) {
                System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "WRONG ANSWER MAP2" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given Answer2(EqnSolArrayIntegrAlone[Order])=" + EqnSolArrayIntegrAlone[Order] + ConsoleColors.RESET);
                System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given AnswerMap(EqnSolArrayMap4[Order])=" + EqnSolArrayMap4[Order] + ConsoleColors.RESET);
                //}
                WrongAnsTestCasesCalculus1.put(MaxIndexWrongAnsCalculus1, TestCase + " ,");
                MaxIndexWrongAnsCalculus1++;
            }
        }
        WrongAnswerFlagMap2 = false;
        WrongAnswerMap2(EqnSolArrayIntegrAlone[Order], variables, EqnSolArrayMap4[Order], MaxOrder1);
        if ((WrongAnswerFlagMap2 == true) && (Order == 1)) {
            WrongAnswerCountMap2++;
            //if (!DetailedFailureSummaryAloneFlag) {
            System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "WRONG ANSWER MAP4" + ConsoleColors.RESET);
            System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given Answer2(EqnSolArrayIntegrAlone[Order])=" + EqnSolArrayIntegrAlone[Order] + ConsoleColors.RESET);
            System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given AnswerMap(EqnSolArrayMap4[Order])=" + EqnSolArrayMap4[Order] + ConsoleColors.RESET);
            //}
            WrongAnsTestCasesMap2.put(MaxIndexWrongAnsMap2, TestCase + " ,");
            MaxIndexWrongAnsMap2++;
        }
    }

    public static void WrongAnsProcessIntegreMap1(String Exprn, int MaxOrder1) {
        WrongAnswerFlagMap1 = false;
        WrongAnswerMap1(Exprn, variables, EqnSolArrayMap3[Order], MaxOrder1);
        if ((WrongAnswerFlagMap1 == true) && (Order == 1)) {
            WrongAnswerCountMap1++;
            //if (!DetailedFailureSummaryAloneFlag) {
            System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "WRONG ANSWER MAP3" + ConsoleColors.RESET);
            System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given Answer1(EqnUnderTest)=" + EqnUnderTest + ConsoleColors.RESET);
            System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given Answer(EqnSolArrayMap3[Order])=" + EqnSolArrayMap3[Order] + ConsoleColors.RESET);
            //}
            WrongAnsTestCasesMap1.put(MaxIndexWrongAnsMap1, TestCase + " ,");
            MaxIndexWrongAnsMap1++;
        }
    }

    public static void WrongAnsDiffrMap1(int MaxOrder1) {
        WrongAnswerFlagMap1 = false;
        if (Order == 1) {
            WrongAnswerMap1(EqnUnderTest, variables, EqnSolArrayMap1[Order], MaxOrder1);
            if ((WrongAnswerFlagMap1 == true) && (Order == 1)) {
                WrongAnswerCountMap1++;
                //if (!DetailedFailureSummaryAloneFlag) {
                System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "WRONG ANSWER MAP1" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given Answer1(EqnUnderTest)=" + EqnUnderTest + ConsoleColors.RESET);
                System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given Answer Map(EqnSolArrayMap1[Order])=" + EqnSolArrayMap1[Order] + ConsoleColors.RESET);
                //}
                WrongAnsTestCasesMap1.put(MaxIndexWrongAnsMap1, TestCase + " ;");
                MaxIndexWrongAnsMap1++;
            }
        }
    }

    public static void WrongAnsDiffrMap2(int MaxOrder1) {
        WrongAnswerFlagMap2 = false;
        if (Order == 1) {
            WrongAnswerMap2(EqnSolArrayDiffAlone[Order], variables, EqnSolArrayMap2[Order], MaxOrder1);
            if ((WrongAnswerFlagMap2 == true)) {
                WrongAnswerCountMap2++;
                //if (!DetailedFailureSummaryAloneFlag) {
                System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "WRONG ANSWER MAP2" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given Answer3(EqnSolArrayDiffAlone[Order])=" + EqnSolArrayDiffAlone[Order] + ConsoleColors.RESET);
                System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given AnswerMap(EqnSolArrayMap2[Order])=" + EqnSolArrayMap2[Order] + ConsoleColors.RESET);
                //}
                WrongAnsTestCasesMap2.put(MaxIndexWrongAnsMap2, TestCase + " ,");
                MaxIndexWrongAnsMap2++;
            }
        }
    }
}
