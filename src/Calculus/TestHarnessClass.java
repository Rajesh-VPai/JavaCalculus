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

import static Calculus.ExclusionTestCases.DifferentialGapException;
import static Calculus.ExclusionTestCases.DifferentialGapInfinity;
import static Calculus.ExclusionTestCases.IntegralGapException;
import static Calculus.ExclusionTestCases.IntegralGapInfinity;
import static Calculus.ExclusionTestCases.TrueDifferentialGapException;
import static Calculus.ExclusionTestCases.TrueDifferentialGapInfinity;
import static Calculus.ExclusionTestCases.TrueIntegralGapException;
import static Calculus.ExclusionTestCases.TrueIntegralGapInfinity;
import static Calculus.MathematicalTestHarness.AITestResultsGenFlag;
import static Calculus.MathematicalTestHarness.IgnoreCoreIssuesFlag;
import static Calculus.MathematicalTestHarness.IgnoreKnownIssuesFlag;
import Calculus.MathsExpressionParser.Expression;
import Calculus.MathsExpressionParser.LogLevel;
import static Calculus.MathsExpressionParser.parse;
import static Calculus.UsageCalculus.DiffWithRespTo;
import static Calculus.MathematicalTestHarness.RunAllTestCasesFlag;
import static Calculus.UsageCalculus.CoreKnownIssues;
import static Calculus.UsageCalculus.CoreKnownIssuesTestCasesFlag;
import static Calculus.UsageCalculus.FailAnsTestCases;
import static Calculus.UsageCalculus.FailAnswerCount;
import static Calculus.UsageCalculus.KnownIssueTestCasesFlag;
import static Calculus.UsageCalculus.KnownIssues;
import static Calculus.UsageCalculus.KnownIssuesTestCases;
import static Calculus.UsageCalculus.LowLevelSectionFailAnsCount;
import static Calculus.UsageCalculus.LowLevelSectionStaleAnsCount;
import static Calculus.UsageCalculus.MaxFailAns;
import static Calculus.UsageCalculus.MaxStaleAns;
import static Calculus.UsageCalculus.ReturnFlagDiff;
import static Calculus.UsageCalculus.ReturnFlagMap1;
import static Calculus.UsageCalculus.ReturnFlagMap2;
import static Calculus.UsageCalculus.SectionFailAnsCount;
import static Calculus.UsageCalculus.SectionStaleAnsCount;
import static Calculus.UsageCalculus.StaleAnsTestCases;
import static Calculus.UsageCalculus.StaleAnswerCount;
import static Calculus.UsageCalculus.TestCasePassValFlag;
import static Calculus.UsageCalculus.TestCasePassMap1StrCount;
import static Calculus.UsageCalculus.TestCaseFailMap1StrCount;
import static Calculus.UsageCalculus.TestCasePassCalcuStrCount;
import static Calculus.UsageCalculus.TestCaseFailCalcuStrCount;
import static Calculus.UsageCalculus.TestCasePassMap2StrCount;
import static Calculus.UsageCalculus.TestCaseFailMap2StrCount;
import static Calculus.UsageCalculus.TestCasePassHighLevelFlag;
import static Calculus.UsageCalculus.canA2Div;
import static Calculus.UsageCalculus.canA2Mult;
import static Calculus.UsageCalculus.canA3Div;
import static Calculus.UsageCalculus.canA3Mult;
import static Calculus.UsageCalculus.canA4Div;
import static Calculus.UsageCalculus.canA4Mult;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Map;
import org.apache.log4j.Logger;
//import org.junit.jupiter.api.*;
//import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Rajesh V Pai
 */
public class TestHarnessClass {

    public static Logger log = Logger.getLogger(TestHarnessClass.class.getName());
    // Maximum number of Double Fractional Digits displayed in Equation
    private static int MaximumCompFractionDigits = 5;

    TestHarnessClass(int MaxOrder, String All, String MyEndTestCase, String RegrORIndivORLimit) {
        UsageCalculus.EqnSolArrayMap1 = new String[MaxOrder + 1];
        UsageCalculus.EqnSolArrayDiffAlone = new String[MaxOrder + 1];
        UsageCalculus.EqnSolArrayMap2 = new String[MaxOrder + 1];
        UsageCalculus.EqnSolArrayMap3 = new String[MaxOrder + 1];
        UsageCalculus.EqnSolArrayIntegrAlone = new String[MaxOrder + 1];
        UsageCalculus.EqnSolArrayMap4 = new String[MaxOrder + 1];

        UsageCalculus.EqnSolOrder = new int[MaxOrder + 1];
        for (int i = 0; i <= MaxOrder; i++) {
            UsageCalculus.EqnSolArrayMap1[i] = "";
            UsageCalculus.EqnSolArrayDiffAlone[i] = "";
            UsageCalculus.EqnSolArrayMap2[i] = "";
            UsageCalculus.EqnSolArrayMap3[i] = "";
            UsageCalculus.EqnSolArrayIntegrAlone[i] = "";
            UsageCalculus.EqnSolArrayMap4[i] = "";
            UsageCalculus.EqnSolOrder[i] = 0;
        }
        if ((All.equalsIgnoreCase("All")) && (RegrORIndivORLimit.equalsIgnoreCase("Regression"))) {
            UsageCalculus.TestCase = 100;
        } else if ((All.equalsIgnoreCase("All")) && (RegrORIndivORLimit.equalsIgnoreCase("LimitedRegression"))) {
            UsageCalculus.TestCase = 100;
            //TestCaseLoopTimes = 80001;
            UsageCalculus.EndTestCase = Integer.parseInt(MyEndTestCase);
        } else if (RegrORIndivORLimit.equalsIgnoreCase("Individual")) {
            UsageCalculus.TestCase = Integer.parseInt(All);
            UsageCalculus.EndTestCase = Integer.parseInt(MyEndTestCase);
        } else if ((All.equalsIgnoreCase("All")) && (RegrORIndivORLimit.equalsIgnoreCase("Individual"))) {
            System.out.println(" Wrong Input :All & Individual");
            UsageCalculus.TestCase = 100;
            UsageCalculus.EndTestCase = Integer.parseInt(MyEndTestCase);
        } else if ((!All.equalsIgnoreCase("All")) && (RegrORIndivORLimit.equalsIgnoreCase("Regression"))) {
            UsageCalculus.TestCase = Integer.parseInt(All);
        } else if ((!All.equalsIgnoreCase("All")) && (RegrORIndivORLimit.equalsIgnoreCase("LimitedRegression")) && (!MyEndTestCase.equalsIgnoreCase("-1"))) {
            UsageCalculus.TestCase = Integer.parseInt(All);
            //Usage.TestCaseLoopTimes = Integer.parseInt(MyEndTestCase)-UsageCalculus.TestCase+1;
            UsageCalculus.EndTestCase = Integer.parseInt(MyEndTestCase);
        }

    }

    public static String TestPredicate() {
        //String Exprn = "0 < = x < 5 "; 
        //String Exprn = "(0 < = x)&&(x < 5 )"; //A&&B
        //String Exprn = "(!(0 > x))&&((5 > x )))";//(A'||B')&&(A||B)
        String Exprn = "(x^2+y^2 >= 4)";//(A'||B')&&(A||B)
        return Exprn;
    }

    public static boolean PassFailTestCaseString(long myTestCase, int Order, String DiffORIntegre, String Exprn, String StrMap1, String StrDiff, String StrMap2, String Answer1, String Answer2, String Answer3, String Answer4, String StrDiff1, String Answer5, String xExprnOptionSelected) {

        long TestCase = UsageCalculus.TestCase;
        if (TestCase == myTestCase) {
            // Assumption :New String is bigger than the Actual Result ONLY DIFF being last '-' OR last '+'
            if (StrMap1.equalsIgnoreCase(Answer2)) {
                if (!AITestResultsGenFlag) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Exprn=" + Exprn + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " StrMap1=" + StrMap1 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass STRING TEST Map1" + ConsoleColors.RESET);
                } else {
                    System.out.println(ConsoleColors.GREEN + " main:EXPECTED_OUTPUT MAP1:" + TestCase + " Exprn=" + Exprn + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:ACTUAL_OUTPUT MAP1:" + TestCase + " StrMap1=" + StrMap1 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:PASS_STATUS MAP1:" + TestCase + " Status=" + "Pass STRING TEST Map1" + ConsoleColors.RESET);
                }
                ReturnFlagMap1 = true;
            } //            else if ((Answer2 != null) && (!Answer2.equalsIgnoreCase("")) && ((StrMap1.contains(Answer2)))) {
            //                System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass STRING TEST (Reduced) Map1" + ConsoleColors.RESET);
            //                ReturnFlag = true;
            //            } 
            else {
                if (!AITestResultsGenFlag) {
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Exprn=" + Exprn + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Status=" + "FAIL STRING TEST Map1" + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.BLUE + " main:StrMap1=" + StrMap1 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.BLUE + " main:Answer2=" + Answer2 + ConsoleColors.RESET);
                } else {
                    System.out.println(ConsoleColors.RED + " main:EXPECTED_OUTPUT MAP1:" + TestCase + " Exprn=" + Exprn + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:ACTUAL_OUTPUT MAP1:" + TestCase + " StrMap1=" + StrMap1 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:PASS_STATUS MAP1:" + TestCase + " Status=" + "FAIL STRING TEST Map1" + ConsoleColors.RESET);
                }
                ReturnFlagMap1 = false;
            }
            // Assumption :New String is bigger than the Actual Result ONLY DIFF being last '-' OR last '+'
            if (StrDiff.equalsIgnoreCase(Answer3)) {
                if (!AITestResultsGenFlag) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Order=" + Order + " StrDiff=" + StrDiff + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Order=" + Order + " Status=" + "Pass STRING TEST " + DiffORIntegre + ConsoleColors.RESET);
                } else {
                    System.out.println(ConsoleColors.GREEN + " main:EXPECTED_OUTPUT " + DiffORIntegre + ":" + TestCase + " Order=" + Order + " StrDiff=" + StrDiff + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:ACTUAL_OUTPUT " + DiffORIntegre + ":" + TestCase + " Order=" + Order + " StrDiff=" + Answer3 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:PASS_STATUS " + DiffORIntegre + ":" + TestCase + " Order=" + Order + " Status=" + "Pass STRING TEST " + DiffORIntegre + ConsoleColors.RESET);
                }
                ReturnFlagDiff = true;
            } //            else if ((Answer3 != null) && (!Answer3.equalsIgnoreCase("")) && ((StrDiff.contains(Answer3)))) {
            //                System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass STRING TEST (Reduced) Diff" + ConsoleColors.RESET);
            //                ReturnFlag = true;
            //            } 
            else {
                if (!AITestResultsGenFlag) {
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Order=" + Order + " Status=" + "FAIL STRING TEST " + DiffORIntegre + ConsoleColors.RESET);
                    if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                        System.out.println(ConsoleColors.BLUE + " main:Test Case " + TestCase + " StrDiff  =" + StrDiff + ConsoleColors.RESET);
                    } else {
                        System.out.println(ConsoleColors.BLUE + " main:Test Case " + TestCase + " StrIntegr=" + StrDiff + ConsoleColors.RESET);
                    }
                    System.out.println(ConsoleColors.BLUE + " main:Test Case " + TestCase + " Answer3  =" + Answer3 + ConsoleColors.RESET);
                } else {
                    System.out.println(ConsoleColors.RED + " main:ACTUAL_OUTPUT " + DiffORIntegre + ":" + TestCase + " Order=" + Order + " StrDiff=" + StrDiff + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:EXPECTED_OUTPUT " + DiffORIntegre + ":" + TestCase + " Order=" + Order + " StrDiff=" + Answer3 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:PASS_STATUS " + DiffORIntegre + ":" + TestCase + " Order=" + Order + " Status=" + "FAIL STRING TEST " + DiffORIntegre + ConsoleColors.RESET);
                }
                if (xExprnOptionSelected.equalsIgnoreCase("Regression2"))
                    ; else {
                    ReturnFlagDiff = false;
                }
            }
            // Assumption :New String is bigger than the Actual Result ONLY DIFF being last '-' OR last '+'
            if (StrMap2.equalsIgnoreCase(Answer4)) {
                if (!AITestResultsGenFlag) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass STRING TEST Map2" + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " StrMap2=" + StrMap2 + ConsoleColors.RESET);
                } else {
                    System.out.println(ConsoleColors.GREEN + " main:ACTUAL_OUTPUT Map2:" + TestCase + " Order=" + Order + " StrMap2=" + StrMap2 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:EXPECTED_OUTPUT Map2:" + TestCase + " Order=" + Order + " StrMap2=" + Answer4 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:PASS_STATUS Map2:" + TestCase + " Order=" + Order + " Status=" + "Pass STRING TEST " + DiffORIntegre + ConsoleColors.RESET);
                }
                ReturnFlagMap2 = true;
            } else {
                if (!AITestResultsGenFlag) {
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Status=" + "FAIL STRING TEST Map2" + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.BLUE + " main:Test Case " + TestCase + " StrMap2=" + StrMap2 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.BLUE + " main:Test Case " + TestCase + " Answer4=" + Answer4 + ConsoleColors.RESET);
                } else {
                    System.out.println(ConsoleColors.RED + " main:ACTUAL_OUTPUT Map2:" + TestCase + " Order=" + Order + " StrMap2=" + StrMap2 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:EXPECTED_OUTPUT Map2:" + TestCase + " Order=" + Order + " Answer4=" + Answer4 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:PASS_STATUS Map2:" + TestCase + " Order=" + Order + " Status=" + "FAIL STRING TEST " + DiffORIntegre + ConsoleColors.RESET);
                }
                ReturnFlagMap2 = false;
            }
            if ((xExprnOptionSelected.equalsIgnoreCase("Regression2")) && (DiffORIntegre.equalsIgnoreCase("Diff"))) {
                DiffORIntegre = "Integre";
            } else if ((xExprnOptionSelected.equalsIgnoreCase("Regression2")) && (DiffORIntegre.equalsIgnoreCase("Integre"))) {
                DiffORIntegre = "Diff";
            }
            if (StrDiff1.equalsIgnoreCase(Answer5)) {
                if (!AITestResultsGenFlag) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Order=" + Order + " StrDiff1=" + StrDiff1 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Order=" + Order + " Status=" + "Pass STRING TEST " + DiffORIntegre + ConsoleColors.RESET);
                } else {
                    System.out.println(ConsoleColors.GREEN + " main:EXPECTED_OUTPUT " + DiffORIntegre + ":" + TestCase + " Order=" + Order + " StrDiff1=" + StrDiff1 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:ACTUAL_OUTPUT " + DiffORIntegre + ":" + TestCase + " Order=" + Order + " Answer5=" + Answer5 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:PASS_STATUS " + DiffORIntegre + ":" + TestCase + " Order=" + Order + " Status=" + "Pass STRING TEST " + DiffORIntegre + ConsoleColors.RESET);
                }
                ReturnFlagDiff = true;
            } //            else if ((Answer3 != null) && (!Answer3.equalsIgnoreCase("")) && ((StrDiff.contains(Answer3)))) {
            //                System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass STRING TEST (Reduced) Diff" + ConsoleColors.RESET);
            //                ReturnFlag = true;
            //            } 
            else {
                if (!AITestResultsGenFlag) {
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Order=" + Order + " Status=" + "FAIL STRING TEST " + DiffORIntegre + ConsoleColors.RESET);
                    if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                        System.out.println(ConsoleColors.BLUE + " main:Test Case " + TestCase + " StrDiff1  =" + StrDiff1 + ConsoleColors.RESET);
                    } else {
                        System.out.println(ConsoleColors.BLUE + " main:Test Case " + TestCase + " StrIntegr=" + StrDiff1 + ConsoleColors.RESET);
                    }
                    System.out.println(ConsoleColors.BLUE + " main:Test Case " + TestCase + " Answer5  =" + Answer5 + ConsoleColors.RESET);
                } else {
                    System.out.println(ConsoleColors.RED + " main:ACTUAL_OUTPUT " + DiffORIntegre + ":" + TestCase + " Order=" + Order + " StrDiff1=" + StrDiff1 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:EXPECTED_OUTPUT " + DiffORIntegre + ":" + TestCase + " Order=" + Order + " Answer5=" + Answer5 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:PASS_STATUS " + DiffORIntegre + ":" + TestCase + " Order=" + Order + " Status=" + "FAIL STRING TEST " + DiffORIntegre + ConsoleColors.RESET);
                }
                if (xExprnOptionSelected.equalsIgnoreCase("Regression2"))
                    ; else {
                    ReturnFlagDiff = false;
                }
            }
            return ((ReturnFlagMap1) && (ReturnFlagDiff) && (ReturnFlagMap2));
        }
        return false;
    }

    public static boolean PassFailIdempotentString(long myTestCase, int Order, String DiffORIntegre, String Exprn, String StrMap1, String StrDiff, String StrMap2, String Answer1, String Answer2, String Answer3, String Answer4) {
        boolean ReturnFlagMap1 = false;
        boolean ReturnFlagDiff = false;
        boolean ReturnFlagMap2 = false;
        long TestCase = UsageCalculus.TestCase;
        if (TestCase == myTestCase) {
            // Assumption :New String is bigger than the Actual Result ONLY DIFF being last '-' OR last '+'
            if (StrMap1.equalsIgnoreCase(Answer2)) {
                if (!AITestResultsGenFlag) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Exprn=" + Exprn + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " StrMap1=" + StrMap1 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass STRING TEST Map1" + ConsoleColors.RESET);
                } else {
                    System.out.println(ConsoleColors.GREEN + " main:EXPECTED_OUTPUT MAP1:" + TestCase + " Exprn=" + Exprn + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:ACTUAL_OUTPUT MAP1:" + TestCase + " StrMap1=" + StrMap1 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:PASS_STATUS MAP1:" + TestCase + " Status=" + "Pass STRING TEST Map1" + ConsoleColors.RESET);
                }
                ReturnFlagMap1 = true;
            } //            else if ((Answer2 != null) && (!Answer2.equalsIgnoreCase("")) && ((StrMap1.contains(Answer2)))) {
            //                System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass STRING TEST (Reduced) Map1" + ConsoleColors.RESET);
            //                ReturnFlag = true;
            //            } 
            else {
                if (!AITestResultsGenFlag) {
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Exprn=" + Exprn + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Status=" + "FAIL STRING TEST Map1" + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.YELLOW + " main:StrMap1=" + StrMap1 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.YELLOW + " main:Answer2=" + Answer2 + ConsoleColors.RESET);
                } else {
                    System.out.println(ConsoleColors.RED + " main:EXPECTED_OUTPUT MAP1:" + TestCase + " Exprn=" + Exprn + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:ACTUAL_OUTPUT MAP1:" + TestCase + " StrMap1=" + StrMap1 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:PASS_STATUS MAP1:" + TestCase + " Status=" + "FAIL STRING TEST Map1" + ConsoleColors.RESET);
                }
                ReturnFlagMap1 = false;
            }

            // Assumption :New String is bigger than the Actual Result ONLY DIFF being last '-' OR last '+'
            if (StrMap2.equalsIgnoreCase(StrMap1)) {
                if (!AITestResultsGenFlag) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass STRING TEST Map2" + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " StrMap2=" + StrMap2 + ConsoleColors.RESET);
                } else {
                    System.out.println(ConsoleColors.GREEN + " main:ACTUAL_OUTPUT Map2:" + TestCase + " Order=" + Order + " StrMap2=" + StrMap2 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:EXPECTED_OUTPUT Map2:" + TestCase + " Order=" + Order + " StrMap1=" + StrMap1 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:PASS_STATUS Map2:" + TestCase + " Order=" + Order + " Status=" + "Pass STRING TEST " + DiffORIntegre + ConsoleColors.RESET);
                }
                ReturnFlagMap2 = true;
            } else {
                if (!AITestResultsGenFlag) {
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Status=" + "FAIL STRING TEST Map2" + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.YELLOW + " main:Test Case " + TestCase + " StrMap2=" + StrMap2 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.YELLOW + " main:Test Case " + TestCase + " StrMap1=" + StrMap1 + ConsoleColors.RESET);
                } else {
                    System.out.println(ConsoleColors.RED + " main:ACTUAL_OUTPUT Map2:" + TestCase + " Order=" + Order + " StrMap2=" + StrMap2 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:EXPECTED_OUTPUT Map2:" + TestCase + " Order=" + Order + " StrMap1=" + StrMap1 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:PASS_STATUS Map2:" + TestCase + " Order=" + Order + " Status=" + "FAIL STRING TEST " + DiffORIntegre + ConsoleColors.RESET);
                }
                ReturnFlagMap2 = false;
            }
            // Assumption :New String is bigger than the Actual Result ONLY DIFF being last '-' OR last '+'
            if (StrDiff.equalsIgnoreCase(Answer3)) {
                if (!AITestResultsGenFlag) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Order=" + Order + " StrDiff=" + StrDiff + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Order=" + Order + " Status=" + "Pass STRING TEST " + DiffORIntegre + ConsoleColors.RESET);
                } else {
                    System.out.println(ConsoleColors.GREEN + " main:EXPECTED_OUTPUT " + DiffORIntegre + ":" + TestCase + " Order=" + Order + " StrDiff=" + StrDiff + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:ACTUAL_OUTPUT " + DiffORIntegre + ":" + TestCase + " Order=" + Order + " StrDiff=" + Answer3 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:PASS_STATUS " + DiffORIntegre + ":" + TestCase + " Order=" + Order + " Status=" + "Pass STRING TEST " + DiffORIntegre + ConsoleColors.RESET);
                }
                ReturnFlagDiff = true;
            } //            else if ((Answer3 != null) && (!Answer3.equalsIgnoreCase("")) && ((StrDiff.contains(Answer3)))) {
            //                System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass STRING TEST (Reduced) Diff" + ConsoleColors.RESET);
            //                ReturnFlag = true;
            //            } 
            else {
                if (!AITestResultsGenFlag) {
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Order=" + Order + " Status=" + "FAIL STRING TEST " + DiffORIntegre + ConsoleColors.RESET);
                    if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                        System.out.println(ConsoleColors.YELLOW + " main:Test Case " + TestCase + " StrDiff  =" + StrDiff + ConsoleColors.RESET);
                    } else {
                        System.out.println(ConsoleColors.YELLOW + " main:Test Case " + TestCase + " StrIntegr=" + StrDiff + ConsoleColors.RESET);
                    }
                    System.out.println(ConsoleColors.YELLOW + " main:Test Case " + TestCase + " Answer3  =" + Answer3 + ConsoleColors.RESET);
                } else {
                    System.out.println(ConsoleColors.RED + " main:ACTUAL_OUTPUT " + DiffORIntegre + ":" + TestCase + " Order=" + Order + " StrDiff=" + StrDiff + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:EXPECTED_OUTPUT " + DiffORIntegre + ":" + TestCase + " Order=" + Order + " StrDiff=" + Answer3 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:PASS_STATUS " + DiffORIntegre + ":" + TestCase + " Order=" + Order + " Status=" + "FAIL STRING TEST " + DiffORIntegre + ConsoleColors.RESET);
                }
                ReturnFlagDiff = false;
            }
            return ((ReturnFlagMap1) && (ReturnFlagDiff) && (ReturnFlagMap2));
        }
        return false;
    }

    public static boolean PassFailTestCaseValueStrict(long myTestCase, int Order, int MaxOrder1, String DiffORIntegre, String Exprn, Double ExprnexpValue, Double DblexpValueMap1, Double DblexpDiffValue, Double DblexpValueMap2, String StrexpDiffExpress, Map<String, Double> variables, Double x) {
        boolean ReturnFlag = false;
        Double Number = ExprnexpValue.doubleValue();
        Double NumberAnsMap2 = 0.0;
        Double NumberEqnSol = 0.0;
        Double NumberDiff = 0.0;

        Expression expValueExprn;
        String DblexpValueAnswerExprn = "";
        String DblexpValueAnswerExprnIntegrity = "";
        String TestAnsVal0Exprn = "";
        String TestAnsVal5Diff = "";
        String TestAnsVal6Map2 = "";
        String TestAnsVal7 = "";
        variables.put(DiffWithRespTo, x);
        if (DiffORIntegre.equalsIgnoreCase("Diff")) {
            expValueExprn = parse(UsageCalculus.EqnSolArrayMap1[Order], variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
            DblexpValueAnswerExprn = "" + expValueExprn.eval();
            Number = expValueExprn.eval();
            //formatter.setMaximumFractionDigits(MaximumCompFractionDigits);
            TestAnsVal0Exprn = "" + Number.doubleValue();
        } else {
            expValueExprn = parse(UsageCalculus.EqnSolArrayMap3[Order], variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
            DblexpValueAnswerExprn = "" + expValueExprn.eval();
            Number = expValueExprn.eval();
            TestAnsVal0Exprn = "" + Number.doubleValue();
        }
        Expression expValueMap2;
        Expression expValueDiffExprn;
        String DblexpValueAnswer3 = "";
        if (DiffORIntegre.equalsIgnoreCase("Diff")) {
            expValueMap2 = parse(UsageCalculus.EqnSolArrayDiffAlone[Order], variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
            DblexpValueAnswer3 = "" + expValueMap2.eval();
            Number = expValueMap2.eval();
            TestAnsVal5Diff = "" + Number.doubleValue();
        } else {
            expValueMap2 = parse(UsageCalculus.EqnSolArrayIntegrAlone[Order], variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
            DblexpValueAnswer3 = "" + expValueMap2.eval();
            Number = expValueMap2.eval();
            TestAnsVal5Diff = "" + Number.doubleValue();
        }

        //Answer System
        if (DiffORIntegre.equalsIgnoreCase("Diff")) {
            expValueExprn = parse(UsageCalculus.EqnSolArrayMap2[Order], variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
            DblexpValueAnswerExprnIntegrity = "" + expValueExprn.eval();
            NumberAnsMap2 = expValueExprn.eval();
            TestAnsVal6Map2 = "" + NumberAnsMap2.doubleValue();
        } else {
            expValueExprn = parse(UsageCalculus.EqnSolArrayMap4[Order], variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
            DblexpValueAnswerExprnIntegrity = "" + expValueExprn.eval();
            NumberAnsMap2 = expValueExprn.eval();
            TestAnsVal6Map2 = "" + NumberAnsMap2.doubleValue();
            System.out.println("PassFailTestCaseValue:NumberAnsMap2=" + NumberAnsMap2 + " TestAnsVal6Map2=" + TestAnsVal6Map2);
        }
        //Diff System
        if (DiffORIntegre.equalsIgnoreCase("Diff")) {
            expValueDiffExprn = parse(UsageCalculus.EqnSolArrayDiffAlone[Order], variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
            DblexpValueAnswerExprnIntegrity = "" + expValueDiffExprn.eval();
            NumberEqnSol = expValueDiffExprn.eval();
            TestAnsVal7 = "" + NumberEqnSol.doubleValue();
        } else {
            expValueDiffExprn = parse(UsageCalculus.EqnSolArrayIntegrAlone[Order], variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
            DblexpValueAnswerExprnIntegrity = "" + expValueDiffExprn.eval();
            NumberEqnSol = expValueDiffExprn.eval();
            TestAnsVal7 = "" + NumberEqnSol.doubleValue();
            System.out.println("PassFailTestCaseValue:NumberEqnSol=" + NumberEqnSol + " TestAnsVal7=" + TestAnsVal7);
        }
        Number = ExprnexpValue.doubleValue();
        String TestVal1 = "" + Number;
        Number = DblexpValueMap1.doubleValue();
        String TestVal2 = "" + Number;

        NumberDiff = DblexpDiffValue.doubleValue();
        String DiffVal3 = "" + NumberDiff.doubleValue();
        Number = DblexpValueMap2.doubleValue();
        // TestCase 4023 
        String SimpleVal4 = "" + NumberDiff.doubleValue();
        String Temp = "";
        long TestCase = UsageCalculus.TestCase;
        if (TestCase == myTestCase) {
            //Value Check with Exprn & Map1
            if ((TestVal1.equalsIgnoreCase(TestVal2))
                    || ((NumberAnsMap2.doubleValue() == NumberEqnSol.doubleValue()) //&& TestAnsVal6Map2.equalsIgnoreCase(TestAnsVal7)
                    )) {
                if (!AITestResultsGenFlag) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Order=" + Order + " " + DiffWithRespTo + "=" + variables.get(DiffWithRespTo) + " Status=" + "Pass VALUE TEST Exprn Map1" + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " TestVal1=" + TestVal1 + " ExprnexpValue=" + ExprnexpValue.doubleValue() + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " TestVal2=" + TestVal2 + " DblexpValueMap1=" + DblexpValueMap1.doubleValue() + ConsoleColors.RESET);
                }
                ReturnFlag = true;
            } else {

                if (!AITestResultsGenFlag) {
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Order=" + Order + " " + DiffWithRespTo + "=" + variables.get(DiffWithRespTo) + " Status=" + "FAIL VALUE TEST Exprn Map1" + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " TestVal1=" + TestVal1 + " ExprnexpValue=" + ExprnexpValue.doubleValue() + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " TestVal2=" + TestVal2 + " DblexpValueMap1=" + DblexpValueMap1.doubleValue() + " :Check if there is E or e in Double Coefficient" + ConsoleColors.RESET);
                }
                ReturnFlag = false;
            }
            //Value Check with Exprn & Answer(Map1)
            if ((TestVal1.equalsIgnoreCase(TestAnsVal0Exprn))
                    //Zero Integrity Pass Through Check:0.0, -0.0 ,+0.0,-0,+0
                    || (((TestVal1.equalsIgnoreCase("0.0")) || (TestVal1.equalsIgnoreCase("-0.0")) || (TestVal1.equalsIgnoreCase("+0.0"))
                    || (TestVal1.equalsIgnoreCase("-0")) || (TestVal1.equalsIgnoreCase("+0")))
                    && ((TestAnsVal0Exprn.equalsIgnoreCase("0.0")) || (TestAnsVal0Exprn.equalsIgnoreCase("0")) || (TestAnsVal0Exprn.equalsIgnoreCase("-0.0")) || (TestAnsVal0Exprn.equalsIgnoreCase("+0.0"))
                    || (TestAnsVal0Exprn.equalsIgnoreCase("-0")) || (TestAnsVal0Exprn.equalsIgnoreCase("+0"))))
                    || ((NumberAnsMap2.doubleValue() == NumberEqnSol.doubleValue()))) {
                if (!AITestResultsGenFlag) {
                    if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Order=" + Order + " Status=" + "Pass VALUE TEST Answer Exprn " + ConsoleColors.RESET);
                    } else {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Order=" + Order + " Status=" + "Pass VALUE TEST Answer Exprn " + ConsoleColors.RESET);
                    }
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " DblexpValueAnswerExprn=" + DblexpValueAnswerExprn + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " DblexpValueMap1=" + DblexpValueMap1.doubleValue() + ConsoleColors.RESET);
                }
                ReturnFlag = true;
            } else {
                if (!AITestResultsGenFlag) {
                    if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                        System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Order=" + Order + " Status=" + "FAIL VALUE TEST Answer Exprn" + ConsoleColors.RESET);
                    } else {
                        System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Order=" + Order + " Status=" + "FAIL VALUE TEST Answer Exprn" + ConsoleColors.RESET);
                    }
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " DblexpValueAnswerExprn=" + DblexpValueAnswerExprn + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " DblexpValueMap1=" + DblexpValueMap1.doubleValue() + " :Check if there is E or e or Rounding Of in Double Coefficient" + ConsoleColors.RESET);
                }
                ReturnFlag = false;
            }
            //Value Check with Diff Exprn & Map2
            if ((DiffVal3.equalsIgnoreCase(SimpleVal4))
                    //Zero Integrity Pass Through Check:0.0, -0.0 ,+0.0,-0,+0
                    || (((DiffVal3.equalsIgnoreCase("0.0")) || (DiffVal3.equalsIgnoreCase("-0.0")) || (DiffVal3.equalsIgnoreCase("+0.0"))
                    || (DiffVal3.equalsIgnoreCase("0")) || (DiffVal3.equalsIgnoreCase("-0")) || (DiffVal3.equalsIgnoreCase("+0")))
                    && ((SimpleVal4.equalsIgnoreCase("0.0")) || (SimpleVal4.equalsIgnoreCase("0")) || (SimpleVal4.equalsIgnoreCase("-0.0")) || (SimpleVal4.equalsIgnoreCase("+0.0"))
                    || (SimpleVal4.equalsIgnoreCase("-0")) || (SimpleVal4.equalsIgnoreCase("+0"))))) {
                if (!AITestResultsGenFlag) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass VALUE TEST " + DiffORIntegre + " Map2" + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " DiffVal3=" + DiffVal3 + " DblexpDiffValue=" + DblexpDiffValue.doubleValue() + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " SimpleVal4=" + SimpleVal4 + " DblexpValueMap2=" + DblexpValueMap2.doubleValue() + ConsoleColors.RESET);
                }
                ReturnFlag = true;
            } else {
                if (!AITestResultsGenFlag) {
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Status=" + "FAIL VALUE TEST " + DiffORIntegre + " Map2" + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " DiffVal3=" + DiffVal3 + " DblexpDiffValue=" + DblexpDiffValue.doubleValue() + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " SimpleVal4=" + SimpleVal4 + " DblexpValueMap2=" + DblexpValueMap2.doubleValue() + " :Check if there is E or e in Double Coefficient" + ConsoleColors.RESET);
                }
                ReturnFlag = false;
            }
            //Value Check with Diff Exprn & Diff Answer(Map2)
            if ((DiffVal3.equalsIgnoreCase(TestAnsVal5Diff))
                    //Zero Integrity Pass Through Check:0.0, -0.0 ,+0.0,-0,+0
                    || (((DiffVal3.equalsIgnoreCase("0.0")) || (DiffVal3.equalsIgnoreCase("-0.0")) || (DiffVal3.equalsIgnoreCase("+0.0"))
                    || (DiffVal3.equalsIgnoreCase("-0")) || (DiffVal3.equalsIgnoreCase("+0")))
                    && ((TestAnsVal5Diff.equalsIgnoreCase("0.0")) || (TestAnsVal5Diff.equalsIgnoreCase("0")) || (TestAnsVal5Diff.equalsIgnoreCase("-0.0")) || (TestAnsVal5Diff.equalsIgnoreCase("+0.0"))
                    || (TestAnsVal5Diff.equalsIgnoreCase("-0")) || (TestAnsVal5Diff.equalsIgnoreCase("+0"))))) {
                if (!AITestResultsGenFlag) {
                    if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass VALUE TEST Answer " + DiffORIntegre + " Usage.EqnSolArrayDiffAlone " + ConsoleColors.RESET);
                    } else {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass VALUE TEST Answer " + DiffORIntegre + " Usage.EqnSolArrayIntegrAlone " + ConsoleColors.RESET);
                    }
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " DiffVal3=" + DiffVal3 + " TestAnsVal5Diff=" + TestAnsVal5Diff + " TestAnsVal6Map2=" + TestAnsVal6Map2 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " DblexpValueAnswer3=" + DblexpValueAnswer3 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " DblexpValueMap2=" + DblexpValueMap2.doubleValue() + ConsoleColors.RESET);
                }
                ReturnFlag = true;
            } else {
                if (!AITestResultsGenFlag) {
                    if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                        System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Status=" + "FAIL VALUE TEST " + DiffORIntegre + " Usage.EqnSolArrayDiffAlone" + ConsoleColors.RESET);
                    } else {
                        System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Status=" + "FAIL VALUE TEST " + DiffORIntegre + " Usage.EqnSolArrayIntegrAlone" + ConsoleColors.RESET);
                    }
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " DiffVal3=" + DiffVal3 + " TestAnsVal5Diff=" + TestAnsVal5Diff + " TestAnsVal6Map2=" + TestAnsVal6Map2 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " DblexpValueAnswer3=" + DblexpValueAnswer3 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " DblexpValueMap2=" + DblexpValueMap2.doubleValue() + " :Check if there is E or e or Rounding Of in Double Coefficient" + ConsoleColors.RESET);
                }
                ReturnFlag = false;
            }//Value (Answer) Integrity Check with Ans Diff Exprn & Answer(Map2)
            if (((TestAnsVal6Map2.equalsIgnoreCase(DiffVal3))
                    && ((TestAnsVal6Map2.equalsIgnoreCase(SimpleVal4))
                    && ((DblexpValueMap2.doubleValue() == expValueExprn.eval())
                    && ((DblexpValueMap2.doubleValue() == NumberAnsMap2)
                    && (DblexpDiffValue.doubleValue() == NumberDiff)))))
                    //Zero Integrity Pass Through Check:0.0, -0.0 ,+0.0,-0,+0
                    || (((DiffVal3.equalsIgnoreCase("0.0")) || (DiffVal3.equalsIgnoreCase("-0.0")) || (DiffVal3.equalsIgnoreCase("+0.0"))
                    || (DiffVal3.equalsIgnoreCase("0")) || (DiffVal3.equalsIgnoreCase("-0")) || (DiffVal3.equalsIgnoreCase("+0")))
                    && ((SimpleVal4.equalsIgnoreCase("0.0")) || (SimpleVal4.equalsIgnoreCase("0")) || (SimpleVal4.equalsIgnoreCase("-0.0")) || (SimpleVal4.equalsIgnoreCase("+0.0"))
                    || (SimpleVal4.equalsIgnoreCase("-0")) || (SimpleVal4.equalsIgnoreCase("+0")))
                    && ((TestAnsVal6Map2.equalsIgnoreCase("0.0")) || (TestAnsVal6Map2.equalsIgnoreCase("0")) || (TestAnsVal6Map2.equalsIgnoreCase("-0.0")) || (TestAnsVal6Map2.equalsIgnoreCase("+0.0"))
                    || (TestAnsVal6Map2.equalsIgnoreCase("-0")) || (TestAnsVal6Map2.equalsIgnoreCase("+0"))))) {
                if (!AITestResultsGenFlag) {
                    if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass VALUE TEST Answer Integrity Check" + DiffORIntegre + " Usage.EqnSolArrayDiffAlone " + ConsoleColors.RESET);
                    } else {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass VALUE TEST Answer Integrity Check" + DiffORIntegre + " Usage.EqnSolArrayIntegrAlone " + ConsoleColors.RESET);
                    }
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " DiffVal3=" + DiffVal3 + " TestAnsVal5Diff=" + TestAnsVal5Diff + " TestAnsVal6Map2=" + TestAnsVal6Map2 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Integrity TestAnsVal6Map2=" + TestAnsVal6Map2 + " SimpleVal4=" + SimpleVal4 + " DblexpValueAnswerExprnIntegrity=" + DblexpValueAnswerExprnIntegrity + ConsoleColors.RESET);
                    if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Integrity Usage.EqnSolArrayDiffAlone[Order]=" + UsageCalculus.EqnSolArrayDiffAlone[Order]);
                    } else {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Integrity Usage.EqnSolArrayIntegrAlone[Order]=" + UsageCalculus.EqnSolArrayIntegrAlone[Order]);
                    }
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Integrity DblexpValueAnswer3=" + DblexpValueAnswer3 + " NumberAnsMap2=" + NumberAnsMap2 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Integrity DblexpDiffValue=" + DblexpDiffValue + " NumberDiff=" + NumberDiff + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Integrity DblexpValueMap2=" + DblexpValueMap2.doubleValue() + " expValueExprn.eval()=" + expValueExprn.eval() + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " DblexpValueMap2=" + DblexpValueMap2.doubleValue() + ConsoleColors.RESET);
                }
                ReturnFlag = true;
            } else if ((DiffVal3.equalsIgnoreCase(SimpleVal4))
                    //Zero Integrity Pass Through Check:0.0, -0.0 ,+0.0,-0,+0
                    || (((DiffVal3.equalsIgnoreCase("0.0")) || (DiffVal3.equalsIgnoreCase("-0.0")) || (DiffVal3.equalsIgnoreCase("+0.0"))
                    || (DiffVal3.equalsIgnoreCase("0")) || (DiffVal3.equalsIgnoreCase("-0")) || (DiffVal3.equalsIgnoreCase("+0")))
                    && ((SimpleVal4.equalsIgnoreCase("0.0")) || (SimpleVal4.equalsIgnoreCase("0")) || (SimpleVal4.equalsIgnoreCase("-0.0")) || (SimpleVal4.equalsIgnoreCase("+0.0"))
                    || (SimpleVal4.equalsIgnoreCase("-0")) || (SimpleVal4.equalsIgnoreCase("+0")))
                    && ((TestAnsVal6Map2.equalsIgnoreCase("0.0")) || (TestAnsVal6Map2.equalsIgnoreCase("0")) || (TestAnsVal6Map2.equalsIgnoreCase("-0.0")) || (TestAnsVal6Map2.equalsIgnoreCase("+0.0"))
                    || (TestAnsVal6Map2.equalsIgnoreCase("-0")) || (TestAnsVal6Map2.equalsIgnoreCase("+0"))))) {
                if (!AITestResultsGenFlag) {
                    if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass REDUCED VALUE TEST Answer Integrity Check " + DiffORIntegre + " Usage.EqnSolArrayDiffAlone " + ConsoleColors.RESET);
                    } else {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass REDUCED VALUE TEST Answer Integrity Check " + DiffORIntegre + " Usage.EqnSolArrayIntegrAlone " + ConsoleColors.RESET);
                    }
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " DiffVal3=" + DiffVal3 + " TestAnsVal5Diff=" + TestAnsVal5Diff + " TestAnsVal6Map2=" + TestAnsVal6Map2 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Integrity TestAnsVal6Map2=" + TestAnsVal6Map2 + " SimpleVal4=" + SimpleVal4 + " DblexpValueAnswerExprnIntegrity=" + DblexpValueAnswerExprnIntegrity + ConsoleColors.RESET);
                    if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Integrity Usage.EqnSolArrayDiffAlone[Order]=" + UsageCalculus.EqnSolArrayDiffAlone[Order]);
                    } else {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Integrity Usage.EqnSolArrayIntegrAlone[Order]=" + UsageCalculus.EqnSolArrayIntegrAlone[Order]);
                    }
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Integrity DblexpValueAnswer3=" + DblexpValueAnswer3 + " NumberAnsMap2=" + NumberAnsMap2 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Integrity DblexpDiffValue=" + DblexpDiffValue + " NumberDiff=" + NumberDiff + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Integrity DblexpValueMap2=" + DblexpValueMap2.doubleValue() + " expValueExprn.eval()=" + expValueExprn.eval() + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " DblexpValueMap2=" + DblexpValueMap2.doubleValue() + ConsoleColors.RESET);
                }
                ReturnFlag = true;
            } else {
                if (!AITestResultsGenFlag) {
                    if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                        System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Status=" + "FAIL Integrity Check TEST Integrity Check " + DiffORIntegre + " Usage.EqnSolArrayDiffAlone" + ConsoleColors.RESET);
                    } else {
                        System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Status=" + "FAIL Integrity Check TEST Integrity Check " + DiffORIntegre + " Usage.EqnSolArrayIntegrAlone" + ConsoleColors.RESET);
                    }
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " DiffVal3=" + DiffVal3 + " TestAnsVal5Diff=" + TestAnsVal5Diff + " TestAnsVal6Map2=" + TestAnsVal6Map2 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Integrity TestAnsVal6Map2=" + TestAnsVal6Map2 + " SimpleVal4=" + SimpleVal4 + " DblexpValueAnswerExprnIntegrity=" + DblexpValueAnswerExprnIntegrity + ConsoleColors.RESET);
                    if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                        System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Integrity Usage.EqnSolArrayDiffAlone[Order]=" + UsageCalculus.EqnSolArrayDiffAlone[Order]);
                    } else {
                        System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Integrity Usage.EqnSolArrayIntegrAlone[Order]=" + UsageCalculus.EqnSolArrayIntegrAlone[Order]);
                    }
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Integrity DblexpValueAnswer3=" + DblexpValueAnswer3 + " NumberAnsMap2=" + NumberAnsMap2 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Integrity DblexpDiffValue=" + DblexpDiffValue + " NumberDiff=" + NumberDiff + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Integrity DblexpValueMap2=" + DblexpValueMap2.doubleValue() + " expValueExprn.eval()=" + expValueExprn.eval() + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " DblexpValueMap2=" + DblexpValueMap2.doubleValue() + " :Check if there is E or e or Rounding Of in Double Coefficient" + ConsoleColors.RESET);
                    System.out.println("PassFailTestCaseValue:NumberAnsMap2=" + NumberAnsMap2 + " TestAnsVal6Map2=" + TestAnsVal6Map2);
                    System.out.println("PassFailTestCaseValue:NumberEqnSol=" + NumberEqnSol + " TestAnsVal7=" + TestAnsVal7);
                }
                ReturnFlag = false;
            }
            //Value (Answer-Diff System) Integrity Check with Ans Diff Exprn & Answer(Map2)
            if (((TestAnsVal7.equalsIgnoreCase(DiffVal3))
                    && ((TestAnsVal7.equalsIgnoreCase(SimpleVal4))
                    && ((DblexpValueMap2.doubleValue() == expValueExprn.eval())
                    && ((DblexpValueMap2.doubleValue() == NumberEqnSol)
                    && (DblexpDiffValue.doubleValue() == NumberEqnSol)))))
                    //Zero Integrity Pass Through Check:0.0, -0.0 ,+0.0,-0,+0
                    || (((DiffVal3.equalsIgnoreCase("0.0")) || (DiffVal3.equalsIgnoreCase("-0.0")) || (DiffVal3.equalsIgnoreCase("+0.0"))
                    || (DiffVal3.equalsIgnoreCase("0")) || (DiffVal3.equalsIgnoreCase("-0")) || (DiffVal3.equalsIgnoreCase("+0")))
                    && ((SimpleVal4.equalsIgnoreCase("0.0")) || (SimpleVal4.equalsIgnoreCase("0")) || (SimpleVal4.equalsIgnoreCase("-0")) || (SimpleVal4.equalsIgnoreCase("-0.0")) || (SimpleVal4.equalsIgnoreCase("+0.0"))
                    || (SimpleVal4.equalsIgnoreCase("-0")) || (SimpleVal4.equalsIgnoreCase("+0")))
                    && ((TestAnsVal7.equalsIgnoreCase("0.0")) || (TestAnsVal7.equalsIgnoreCase("0")) || (TestAnsVal7.equalsIgnoreCase("-0.0")) || (TestAnsVal7.equalsIgnoreCase("+0.0"))
                    || (TestAnsVal7.equalsIgnoreCase("-0")) || (TestAnsVal7.equalsIgnoreCase("+0"))))) {
                if (!AITestResultsGenFlag) {
                    if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass VALUE TEST Diff System Integrity Check" + DiffORIntegre + " Usage.EqnSolArrayDiffAlone " + ConsoleColors.RESET);
                    } else {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass VALUE TEST Diff System Integrity Check" + DiffORIntegre + " Usage.EqnSolArrayIntegrAlone " + ConsoleColors.RESET);
                    }
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " DiffVal3=" + DiffVal3 + " TestAnsVal5Diff=" + TestAnsVal5Diff + " TestAnsVal6Map2=" + TestAnsVal6Map2 + " TestAnsVal7=" + TestAnsVal7 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Diff System Integrity TestAnsVal6Map2=" + TestAnsVal6Map2 + " SimpleVal4=" + SimpleVal4 + " DblexpValueAnswerExprnIntegrity=" + DblexpValueAnswerExprnIntegrity + ConsoleColors.RESET);
                    if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Diff System Integrity Usage.EqnSolArrayDiffAlone[Order]=" + UsageCalculus.EqnSolArrayDiffAlone[Order]);
                    } else {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Diff System Integrity Usage.EqnSolArrayIntegrAlone[Order]=" + UsageCalculus.EqnSolArrayIntegrAlone[Order]);
                    }
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Diff System Integrity DblexpValueAnswer3=" + DblexpValueAnswer3 + " Number=" + Number + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Diff System Integrity DblexpDiffValue=" + DblexpDiffValue + " NumberUsage.EqnSol=" + NumberEqnSol + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Diff System Integrity DblexpValueMap2=" + DblexpValueMap2.doubleValue() + " expValueExprn.eval()=" + expValueExprn.eval() + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " DblexpValueMap2=" + DblexpValueMap2.doubleValue() + ConsoleColors.RESET);
                }
                ReturnFlag = true;
            } else if (((TestAnsVal7.equalsIgnoreCase(DiffVal3))
                    && ((TestAnsVal7.equalsIgnoreCase(SimpleVal4))))
                    //Zero Integrity Pass Through Check:0.0, -0.0 ,+0.0,-0,+0
                    || (((DiffVal3.equalsIgnoreCase("0.0")) || (DiffVal3.equalsIgnoreCase("-0.0")) || (DiffVal3.equalsIgnoreCase("+0.0"))
                    || (DiffVal3.equalsIgnoreCase("0")) || (DiffVal3.equalsIgnoreCase("-0")) || (DiffVal3.equalsIgnoreCase("+0")))
                    && ((SimpleVal4.equalsIgnoreCase("0.0")) || (SimpleVal4.equalsIgnoreCase("0")) || (SimpleVal4.equalsIgnoreCase("-0")) || (SimpleVal4.equalsIgnoreCase("-0.0")) || (SimpleVal4.equalsIgnoreCase("+0.0"))
                    || (SimpleVal4.equalsIgnoreCase("-0")) || (SimpleVal4.equalsIgnoreCase("+0")))
                    && ((TestAnsVal7.equalsIgnoreCase("0.0")) || (TestAnsVal7.equalsIgnoreCase("0")) || (TestAnsVal7.equalsIgnoreCase("-0.0")) || (TestAnsVal7.equalsIgnoreCase("+0.0"))
                    || (TestAnsVal7.equalsIgnoreCase("-0")) || (TestAnsVal7.equalsIgnoreCase("+0"))))) {
                if (!AITestResultsGenFlag) {
                    if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass REDUCED VALUE TEST Diff System Integrity Check" + DiffORIntegre + " Usage.EqnSolArrayDiffAlone " + ConsoleColors.RESET);
                    } else {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass REDUCED VALUE TEST Diff System Integrity Check" + DiffORIntegre + " Usage.EqnSolArrayIntegrAlone " + ConsoleColors.RESET);
                    }
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " DiffVal3=" + DiffVal3 + " TestAnsVal5Diff=" + TestAnsVal5Diff + " TestAnsVal6Map2=" + TestAnsVal6Map2 + " TestAnsVal7=" + TestAnsVal7 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Diff System Integrity TestAnsVal6Map2=" + TestAnsVal6Map2 + " SimpleVal4=" + SimpleVal4 + " DblexpValueAnswerExprnIntegrity=" + DblexpValueAnswerExprnIntegrity + ConsoleColors.RESET);
                    if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Diff System Integrity Usage.EqnSolArrayDiffAlone[Order]=" + UsageCalculus.EqnSolArrayDiffAlone[Order]);
                    } else {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Diff System Integrity Usage.EqnSolArrayIntegrAlone[Order]=" + UsageCalculus.EqnSolArrayIntegrAlone[Order]);
                    }
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Diff System Integrity DblexpValueAnswer3=" + DblexpValueAnswer3 + " Number=" + Number + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Diff System Integrity DblexpDiffValue=" + DblexpDiffValue + " NumberUsage.EqnSol=" + NumberEqnSol + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Diff System Integrity DblexpValueMap2=" + DblexpValueMap2.doubleValue() + " expValueExprn.eval()=" + expValueExprn.eval() + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " DblexpValueMap2=" + DblexpValueMap2.doubleValue() + ConsoleColors.RESET);
                }
                ReturnFlag = true;
            } else {
                if (!AITestResultsGenFlag) {
                    if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                        System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Status=" + "FAIL Integrity Check TEST Integrity Check" + DiffORIntegre + " Usage.EqnSolArrayDiffAlone" + ConsoleColors.RESET);
                    } else {
                        System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Status=" + "FAIL Integrity Check TEST Integrity Check" + DiffORIntegre + " Usage.EqnSolArrayIntegrAlone" + ConsoleColors.RESET);
                    }
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " DiffVal3=" + DiffVal3 + " TestAnsVal5Diff=" + TestAnsVal5Diff + " TestAnsVal6Map2=" + TestAnsVal6Map2 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Diff System Integrity TestAnsVal6Map2=" + TestAnsVal6Map2 + " TestAnsVal7=" + TestAnsVal7 + " SimpleVal4=" + SimpleVal4 + " DblexpValueAnswerExprnIntegrity=" + DblexpValueAnswerExprnIntegrity + ConsoleColors.RESET);
                    if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                        System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Diff System Integrity Usage.EqnSolArrayDiffAlone[Order]=" + UsageCalculus.EqnSolArrayDiffAlone[Order]);
                    } else {
                        System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Diff System Integrity Usage.EqnSolArrayIntegrAlone[Order]=" + UsageCalculus.EqnSolArrayIntegrAlone[Order]);
                    }
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Diff System Integrity DblexpValueAnswer3=" + DblexpValueAnswer3 + " Number=" + Number + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Diff System Integrity DblexpDiffValue=" + DblexpDiffValue + " NumberUsage.EqnSol=" + NumberEqnSol + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Diff System Integrity DblexpValueMap2=" + DblexpValueMap2.doubleValue() + " expValueExprn.eval()=" + expValueExprn.eval() + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " DblexpValueMap2=" + DblexpValueMap2.doubleValue() + " :Check if there is E or e or Rounding Of in Double Coefficient" + ConsoleColors.RESET);
                    System.out.println("PassFailTestCaseValue:NumberAnsMap2=" + NumberAnsMap2 + " TestAnsVal6Map2=" + TestAnsVal6Map2);
                    System.out.println("PassFailTestCaseValue:NumberEqnSol=" + NumberEqnSol + " TestAnsVal7=" + TestAnsVal7);
                }
                ReturnFlag = false;
            }
            // Need to check Diff Value with Map2 Value in Answer
            if (ReturnFlag == true) {

            }
            if ((!ReturnFlag) && (ExprnexpValue.doubleValue() == expValueExprn.eval()) && (DblexpDiffValue.doubleValue() == expValueMap2.eval()) && (DblexpValueMap2.doubleValue() == expValueExprn.eval())) {
                StaleAnsTestCases.put(MaxStaleAns, "" + TestCase + " Order=" + Order + ",");
                StaleAnswerCount++;
                MaxStaleAns++;
                LowLevelSectionStaleAnsCount++;
                if (Order == MaxOrder1 - 1) {
                    SectionStaleAnsCount++;
                }
            } else if (!ReturnFlag) {
                FailAnsTestCases.put(MaxFailAns, "" + TestCase + " Order=" + Order + ",");
                FailAnswerCount++;
                MaxFailAns++;
                LowLevelSectionFailAnsCount++;
                if (Order == MaxOrder1 - 1) {
                    SectionFailAnsCount++;
                }
            }

            return ReturnFlag;
        }
        return false;
    }

    public static boolean PassFailTestCaseValueStrict2(long myTestCase, int Order, int MaxOrder1, String DiffORIntegre, String Exprn, Double ExprnexpValue, Double DblexpValueMap1, Double DblexpDiffValue, Double DblexpValueMap2, String StrexpDiffExpress, Map<String, Double> variables, Double x) {
        boolean ReturnFlag = false;
        Double Number = ExprnexpValue.doubleValue();
        Double NumberAnsMap2 = 0.0;
        Double NumberEqnSol = 0.0;
        Double NumberDiff = 0.0;

        Expression expValueExprn;
        String DblexpValueAnswerExprn = "";
        String DblexpValueAnswerExprnIntegrity = "";
        String TestAnsVal0Exprn = "";
        String TestAnsVal5Diff = "";
        String TestAnsVal6Map2 = "";
        String TestAnsVal7 = "";
        variables.put(DiffWithRespTo, x);
        if (DiffORIntegre.equalsIgnoreCase("Diff")) {
            expValueExprn = parse(UsageCalculus.EqnSolArrayMap1[Order], variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
            DblexpValueAnswerExprn = "" + expValueExprn.eval();
            Number = expValueExprn.eval();
            //formatter.setMaximumFractionDigits(MaximumCompFractionDigits);
            TestAnsVal0Exprn = "" + Number.doubleValue();
        } else {
            expValueExprn = parse(UsageCalculus.EqnSolArrayMap3[Order], variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
            DblexpValueAnswerExprn = "" + expValueExprn.eval();
            Number = expValueExprn.eval();
            TestAnsVal0Exprn = "" + Number.doubleValue();
        }
        Expression expValueMap2;
        Expression expValueDiffExprn;
        String DblexpValueAnswer3 = "";
        if (DiffORIntegre.equalsIgnoreCase("Diff")) {
            expValueMap2 = parse(UsageCalculus.EqnSolArrayDiffAlone[Order], variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
            DblexpValueAnswer3 = "" + expValueMap2.eval();
            Number = expValueMap2.eval();
            TestAnsVal5Diff = "" + Number.doubleValue();
        } else {
            expValueMap2 = parse(UsageCalculus.EqnSolArrayIntegrAlone[Order], variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
            DblexpValueAnswer3 = "" + expValueMap2.eval();
            Number = expValueMap2.eval();
            TestAnsVal5Diff = "" + Number.doubleValue();
        }

        //Answer System
        if (DiffORIntegre.equalsIgnoreCase("Diff")) {
            expValueExprn = parse(UsageCalculus.EqnSolArrayMap1[Order], variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
            DblexpValueAnswerExprnIntegrity = "" + expValueExprn.eval();
            NumberAnsMap2 = expValueExprn.eval();
            TestAnsVal6Map2 = "" + NumberAnsMap2.doubleValue();
        } else {
            expValueExprn = parse(UsageCalculus.EqnSolArrayMap3[Order], variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
            DblexpValueAnswerExprnIntegrity = "" + expValueExprn.eval();
            NumberAnsMap2 = expValueExprn.eval();
            TestAnsVal6Map2 = "" + NumberAnsMap2.doubleValue();
            System.out.println("PassFailTestCaseValue:NumberAnsMap2=" + NumberAnsMap2 + " TestAnsVal6Map2=" + TestAnsVal6Map2);
        }
        //Diff System
        if (DiffORIntegre.equalsIgnoreCase("Diff")) {
            expValueDiffExprn = parse(UsageCalculus.EqnSolArrayDiffAlone[Order], variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
            DblexpValueAnswerExprnIntegrity = "" + expValueDiffExprn.eval();
            NumberEqnSol = expValueDiffExprn.eval();
            TestAnsVal7 = "" + NumberEqnSol.doubleValue();
        } else {
            expValueDiffExprn = parse(UsageCalculus.EqnSolArrayIntegrAlone[Order], variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
            DblexpValueAnswerExprnIntegrity = "" + expValueDiffExprn.eval();
            NumberEqnSol = expValueDiffExprn.eval();
            TestAnsVal7 = "" + NumberEqnSol.doubleValue();
            System.out.println("PassFailTestCaseValue:NumberEqnSol=" + NumberEqnSol + " TestAnsVal7=" + TestAnsVal7);
        }
        Number = ExprnexpValue.doubleValue();
        String TestVal1 = "" + Number;
        Number = DblexpValueMap1.doubleValue();
        String TestVal2 = "" + Number;

        NumberDiff = DblexpDiffValue.doubleValue();
        String DiffVal3 = "" + NumberDiff.doubleValue();
        Number = DblexpValueMap2.doubleValue();
        // TestCase 4023 
        String SimpleVal4 = "" + NumberDiff.doubleValue();
        String Temp = "";
        long TestCase = UsageCalculus.TestCase;
        if (TestCase == myTestCase) {
            //Value Check with Exprn & Map1
            if ((TestVal1.equalsIgnoreCase(TestVal2))
                    || ((NumberAnsMap2.doubleValue() == NumberEqnSol.doubleValue()) //&& TestAnsVal6Map2.equalsIgnoreCase(TestAnsVal7)
                    )) {
                if (!AITestResultsGenFlag) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Order=" + Order + " " + DiffWithRespTo + "=" + variables.get(DiffWithRespTo) + " Status=" + "Pass VALUE TEST Exprn Map1" + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " TestVal1=" + TestVal1 + " ExprnexpValue=" + ExprnexpValue.doubleValue() + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " TestVal2=" + TestVal2 + " DblexpValueMap1=" + DblexpValueMap1.doubleValue() + ConsoleColors.RESET);
                }
                ReturnFlag = true;
            } else {

                if (!AITestResultsGenFlag) {
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Order=" + Order + " " + DiffWithRespTo + "=" + variables.get(DiffWithRespTo) + " Status=" + "FAIL VALUE TEST Exprn Map1" + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " TestVal1=" + TestVal1 + " ExprnexpValue=" + ExprnexpValue.doubleValue() + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " TestVal2=" + TestVal2 + " DblexpValueMap1=" + DblexpValueMap1.doubleValue() + " :Check if there is E or e in Double Coefficient" + ConsoleColors.RESET);
                }
                ReturnFlag = false;
            }
            //Value Check with Exprn & Answer(Map1)
            if ((TestVal1.equalsIgnoreCase(TestAnsVal0Exprn))
                    //Zero Integrity Pass Through Check:0.0, -0.0 ,+0.0,-0,+0
                    || (((TestVal1.equalsIgnoreCase("0.0")) || (TestVal1.equalsIgnoreCase("-0.0")) || (TestVal1.equalsIgnoreCase("+0.0"))
                    || (TestVal1.equalsIgnoreCase("-0")) || (TestVal1.equalsIgnoreCase("+0")))
                    && ((TestAnsVal0Exprn.equalsIgnoreCase("0.0")) || (TestAnsVal0Exprn.equalsIgnoreCase("0")) || (TestAnsVal0Exprn.equalsIgnoreCase("-0.0")) || (TestAnsVal0Exprn.equalsIgnoreCase("+0.0"))
                    || (TestAnsVal0Exprn.equalsIgnoreCase("-0")) || (TestAnsVal0Exprn.equalsIgnoreCase("+0"))))
                    || ((NumberAnsMap2.doubleValue() == NumberEqnSol.doubleValue()))) {
                if (!AITestResultsGenFlag) {
                    if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Order=" + Order + " Status=" + "Pass VALUE TEST Answer Exprn " + ConsoleColors.RESET);
                    } else {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Order=" + Order + " Status=" + "Pass VALUE TEST Answer Exprn " + ConsoleColors.RESET);
                    }
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " DblexpValueAnswerExprn=" + DblexpValueAnswerExprn + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " DblexpValueMap1=" + DblexpValueMap1.doubleValue() + ConsoleColors.RESET);
                }
                ReturnFlag = true;
            } else {
                if (!AITestResultsGenFlag) {
                    if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                        System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Order=" + Order + " Status=" + "FAIL VALUE TEST Answer Exprn" + ConsoleColors.RESET);
                    } else {
                        System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Order=" + Order + " Status=" + "FAIL VALUE TEST Answer Exprn" + ConsoleColors.RESET);
                    }
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " DblexpValueAnswerExprn=" + DblexpValueAnswerExprn + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " DblexpValueMap1=" + DblexpValueMap1.doubleValue() + " :Check if there is E or e or Rounding Of in Double Coefficient" + ConsoleColors.RESET);
                }
                ReturnFlag = false;
            }
            //Value Check with Diff Exprn & Map2
            if ((DiffVal3.equalsIgnoreCase(SimpleVal4))
                    //Zero Integrity Pass Through Check:0.0, -0.0 ,+0.0,-0,+0
                    || (((DiffVal3.equalsIgnoreCase("0.0")) || (DiffVal3.equalsIgnoreCase("-0.0")) || (DiffVal3.equalsIgnoreCase("+0.0"))
                    || (DiffVal3.equalsIgnoreCase("0")) || (DiffVal3.equalsIgnoreCase("-0")) || (DiffVal3.equalsIgnoreCase("+0")))
                    && ((SimpleVal4.equalsIgnoreCase("0.0")) || (SimpleVal4.equalsIgnoreCase("0")) || (SimpleVal4.equalsIgnoreCase("-0.0")) || (SimpleVal4.equalsIgnoreCase("+0.0"))
                    || (SimpleVal4.equalsIgnoreCase("-0")) || (SimpleVal4.equalsIgnoreCase("+0"))))) {
                if (!AITestResultsGenFlag) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass VALUE TEST " + DiffORIntegre + " Map2" + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " DiffVal3=" + DiffVal3 + " DblexpDiffValue=" + DblexpDiffValue.doubleValue() + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " SimpleVal4=" + SimpleVal4 + " DblexpValueMap2=" + DblexpValueMap2.doubleValue() + ConsoleColors.RESET);
                }
                ReturnFlag = true;
            } else {
                if (!AITestResultsGenFlag) {
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Status=" + "FAIL VALUE TEST " + DiffORIntegre + " Map2" + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " DiffVal3=" + DiffVal3 + " DblexpDiffValue=" + DblexpDiffValue.doubleValue() + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " SimpleVal4=" + SimpleVal4 + " DblexpValueMap2=" + DblexpValueMap2.doubleValue() + " :Check if there is E or e in Double Coefficient" + ConsoleColors.RESET);
                }
                ReturnFlag = false;
            }
            //Value Check with Diff Exprn & Diff Answer(Map2)
            if ((DiffVal3.equalsIgnoreCase(TestAnsVal5Diff))
                    //Zero Integrity Pass Through Check:0.0, -0.0 ,+0.0,-0,+0
                    || (((DiffVal3.equalsIgnoreCase("0.0")) || (DiffVal3.equalsIgnoreCase("-0.0")) || (DiffVal3.equalsIgnoreCase("+0.0"))
                    || (DiffVal3.equalsIgnoreCase("-0")) || (DiffVal3.equalsIgnoreCase("+0")))
                    && ((TestAnsVal5Diff.equalsIgnoreCase("0.0")) || (TestAnsVal5Diff.equalsIgnoreCase("0")) || (TestAnsVal5Diff.equalsIgnoreCase("-0.0")) || (TestAnsVal5Diff.equalsIgnoreCase("+0.0"))
                    || (TestAnsVal5Diff.equalsIgnoreCase("-0")) || (TestAnsVal5Diff.equalsIgnoreCase("+0"))))) {
                if (!AITestResultsGenFlag) {
                    if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass VALUE TEST Answer " + DiffORIntegre + " Usage.EqnSolArrayDiffAlone " + ConsoleColors.RESET);
                    } else {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass VALUE TEST Answer " + DiffORIntegre + " Usage.EqnSolArrayIntegrAlone " + ConsoleColors.RESET);
                    }
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " DiffVal3=" + DiffVal3 + " TestAnsVal5Diff=" + TestAnsVal5Diff + " TestAnsVal6Map2=" + TestAnsVal6Map2 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " DblexpValueAnswer3=" + DblexpValueAnswer3 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " DblexpValueMap2=" + DblexpValueMap2.doubleValue() + ConsoleColors.RESET);
                }
                ReturnFlag = true;
            } else {
                if (!AITestResultsGenFlag) {
                    if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                        System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Status=" + "FAIL VALUE TEST " + DiffORIntegre + " Usage.EqnSolArrayDiffAlone" + ConsoleColors.RESET);
                    } else {
                        System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Status=" + "FAIL VALUE TEST " + DiffORIntegre + " Usage.EqnSolArrayIntegrAlone" + ConsoleColors.RESET);
                    }
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " DiffVal3=" + DiffVal3 + " TestAnsVal5Diff=" + TestAnsVal5Diff + " TestAnsVal6Map2=" + TestAnsVal6Map2 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " DblexpValueAnswer3=" + DblexpValueAnswer3 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " DblexpValueMap2=" + DblexpValueMap2.doubleValue() + " :Check if there is E or e or Rounding Of in Double Coefficient" + ConsoleColors.RESET);
                }
                ReturnFlag = false;
            }//Value (Answer) Integrity Check with Ans Diff Exprn & Answer(Map2)
            if (((TestAnsVal6Map2.equalsIgnoreCase(DiffVal3))
                    && ((TestAnsVal6Map2.equalsIgnoreCase(SimpleVal4))
                    && ((DblexpValueMap2.doubleValue() == expValueExprn.eval())
                    && ((DblexpValueMap2.doubleValue() == NumberAnsMap2)
                    && (DblexpDiffValue.doubleValue() == NumberDiff)))))
                    //Zero Integrity Pass Through Check:0.0, -0.0 ,+0.0,-0,+0
                    || (((DiffVal3.equalsIgnoreCase("0.0")) || (DiffVal3.equalsIgnoreCase("-0.0")) || (DiffVal3.equalsIgnoreCase("+0.0"))
                    || (DiffVal3.equalsIgnoreCase("0")) || (DiffVal3.equalsIgnoreCase("-0")) || (DiffVal3.equalsIgnoreCase("+0")))
                    && ((SimpleVal4.equalsIgnoreCase("0.0")) || (SimpleVal4.equalsIgnoreCase("0")) || (SimpleVal4.equalsIgnoreCase("-0.0")) || (SimpleVal4.equalsIgnoreCase("+0.0"))
                    || (SimpleVal4.equalsIgnoreCase("-0")) || (SimpleVal4.equalsIgnoreCase("+0")))
                    && ((TestAnsVal6Map2.equalsIgnoreCase("0.0")) || (TestAnsVal6Map2.equalsIgnoreCase("0")) || (TestAnsVal6Map2.equalsIgnoreCase("-0.0")) || (TestAnsVal6Map2.equalsIgnoreCase("+0.0"))
                    || (TestAnsVal6Map2.equalsIgnoreCase("-0")) || (TestAnsVal6Map2.equalsIgnoreCase("+0"))))) {
                if (!AITestResultsGenFlag) {
                    if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass VALUE TEST Answer Integrity Check" + DiffORIntegre + " Usage.EqnSolArrayDiffAlone " + ConsoleColors.RESET);
                    } else {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass VALUE TEST Answer Integrity Check" + DiffORIntegre + " Usage.EqnSolArrayIntegrAlone " + ConsoleColors.RESET);
                    }
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " DiffVal3=" + DiffVal3 + " TestAnsVal5Diff=" + TestAnsVal5Diff + " TestAnsVal6Map2=" + TestAnsVal6Map2 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Integrity TestAnsVal6Map2=" + TestAnsVal6Map2 + " SimpleVal4=" + SimpleVal4 + " DblexpValueAnswerExprnIntegrity=" + DblexpValueAnswerExprnIntegrity + ConsoleColors.RESET);
                    if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Integrity Usage.EqnSolArrayDiffAlone[Order]=" + UsageCalculus.EqnSolArrayDiffAlone[Order]);
                    } else {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Integrity Usage.EqnSolArrayIntegrAlone[Order]=" + UsageCalculus.EqnSolArrayIntegrAlone[Order]);
                    }
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Integrity DblexpValueAnswer3=" + DblexpValueAnswer3 + " NumberAnsMap2=" + NumberAnsMap2 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Integrity DblexpDiffValue=" + DblexpDiffValue + " NumberDiff=" + NumberDiff + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Integrity DblexpValueMap2=" + DblexpValueMap2.doubleValue() + " expValueExprn.eval()=" + expValueExprn.eval() + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " DblexpValueMap2=" + DblexpValueMap2.doubleValue() + ConsoleColors.RESET);
                }
                ReturnFlag = true;
            } else if ((DiffVal3.equalsIgnoreCase(SimpleVal4))
                    //Zero Integrity Pass Through Check:0.0, -0.0 ,+0.0,-0,+0
                    || (((DiffVal3.equalsIgnoreCase("0.0")) || (DiffVal3.equalsIgnoreCase("-0.0")) || (DiffVal3.equalsIgnoreCase("+0.0"))
                    || (DiffVal3.equalsIgnoreCase("0")) || (DiffVal3.equalsIgnoreCase("-0")) || (DiffVal3.equalsIgnoreCase("+0")))
                    && ((SimpleVal4.equalsIgnoreCase("0.0")) || (SimpleVal4.equalsIgnoreCase("0")) || (SimpleVal4.equalsIgnoreCase("-0.0")) || (SimpleVal4.equalsIgnoreCase("+0.0"))
                    || (SimpleVal4.equalsIgnoreCase("-0")) || (SimpleVal4.equalsIgnoreCase("+0")))
                    && ((TestAnsVal6Map2.equalsIgnoreCase("0.0")) || (TestAnsVal6Map2.equalsIgnoreCase("0")) || (TestAnsVal6Map2.equalsIgnoreCase("-0.0")) || (TestAnsVal6Map2.equalsIgnoreCase("+0.0"))
                    || (TestAnsVal6Map2.equalsIgnoreCase("-0")) || (TestAnsVal6Map2.equalsIgnoreCase("+0"))))) {
                if (!AITestResultsGenFlag) {
                    if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass REDUCED VALUE TEST Answer Integrity Check " + DiffORIntegre + " Usage.EqnSolArrayDiffAlone " + ConsoleColors.RESET);
                    } else {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass REDUCED VALUE TEST Answer Integrity Check " + DiffORIntegre + " Usage.EqnSolArrayIntegrAlone " + ConsoleColors.RESET);
                    }
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " DiffVal3=" + DiffVal3 + " TestAnsVal5Diff=" + TestAnsVal5Diff + " TestAnsVal6Map2=" + TestAnsVal6Map2 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Integrity TestAnsVal6Map2=" + TestAnsVal6Map2 + " SimpleVal4=" + SimpleVal4 + " DblexpValueAnswerExprnIntegrity=" + DblexpValueAnswerExprnIntegrity + ConsoleColors.RESET);
                    if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Integrity Usage.EqnSolArrayDiffAlone[Order]=" + UsageCalculus.EqnSolArrayDiffAlone[Order]);
                    } else {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Integrity Usage.EqnSolArrayIntegrAlone[Order]=" + UsageCalculus.EqnSolArrayIntegrAlone[Order]);
                    }
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Integrity DblexpValueAnswer3=" + DblexpValueAnswer3 + " NumberAnsMap2=" + NumberAnsMap2 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Integrity DblexpDiffValue=" + DblexpDiffValue + " NumberDiff=" + NumberDiff + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Integrity DblexpValueMap2=" + DblexpValueMap2.doubleValue() + " expValueExprn.eval()=" + expValueExprn.eval() + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " DblexpValueMap2=" + DblexpValueMap2.doubleValue() + ConsoleColors.RESET);
                }
                ReturnFlag = true;
            } else {
                if (!AITestResultsGenFlag) {
                    if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                        System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Status=" + "FAIL Integrity Check TEST Integrity Check " + DiffORIntegre + " Usage.EqnSolArrayDiffAlone" + ConsoleColors.RESET);
                    } else {
                        System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Status=" + "FAIL Integrity Check TEST Integrity Check " + DiffORIntegre + " Usage.EqnSolArrayIntegrAlone" + ConsoleColors.RESET);
                    }
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " DiffVal3=" + DiffVal3 + " TestAnsVal5Diff=" + TestAnsVal5Diff + " TestAnsVal6Map2=" + TestAnsVal6Map2 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Integrity TestAnsVal6Map2=" + TestAnsVal6Map2 + " SimpleVal4=" + SimpleVal4 + " DblexpValueAnswerExprnIntegrity=" + DblexpValueAnswerExprnIntegrity + ConsoleColors.RESET);
                    if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                        System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Integrity Usage.EqnSolArrayDiffAlone[Order]=" + UsageCalculus.EqnSolArrayDiffAlone[Order]);
                    } else {
                        System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Integrity Usage.EqnSolArrayIntegrAlone[Order]=" + UsageCalculus.EqnSolArrayIntegrAlone[Order]);
                    }
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Integrity DblexpValueAnswer3=" + DblexpValueAnswer3 + " NumberAnsMap2=" + NumberAnsMap2 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Integrity DblexpDiffValue=" + DblexpDiffValue + " NumberDiff=" + NumberDiff + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Integrity DblexpValueMap2=" + DblexpValueMap2.doubleValue() + " expValueExprn.eval()=" + expValueExprn.eval() + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " DblexpValueMap2=" + DblexpValueMap2.doubleValue() + " :Check if there is E or e or Rounding Of in Double Coefficient" + ConsoleColors.RESET);
                    System.out.println("PassFailTestCaseValue:NumberAnsMap2=" + NumberAnsMap2 + " TestAnsVal6Map2=" + TestAnsVal6Map2);
                    System.out.println("PassFailTestCaseValue:NumberEqnSol=" + NumberEqnSol + " TestAnsVal7=" + TestAnsVal7);
                }
                ReturnFlag = false;
            }
            //Value (Answer-Diff System) Integrity Check with Ans Diff Exprn & Answer(Map2)
            if (((TestAnsVal7.equalsIgnoreCase(DiffVal3))
                    && ((TestAnsVal7.equalsIgnoreCase(SimpleVal4))
                    && ((DblexpValueMap2.doubleValue() == expValueExprn.eval())
                    && ((DblexpValueMap2.doubleValue() == NumberEqnSol)
                    && (DblexpDiffValue.doubleValue() == NumberEqnSol)))))
                    //Zero Integrity Pass Through Check:0.0, -0.0 ,+0.0,-0,+0
                    || (((DiffVal3.equalsIgnoreCase("0.0")) || (DiffVal3.equalsIgnoreCase("-0.0")) || (DiffVal3.equalsIgnoreCase("+0.0"))
                    || (DiffVal3.equalsIgnoreCase("0")) || (DiffVal3.equalsIgnoreCase("-0")) || (DiffVal3.equalsIgnoreCase("+0")))
                    && ((SimpleVal4.equalsIgnoreCase("0.0")) || (SimpleVal4.equalsIgnoreCase("0")) || (SimpleVal4.equalsIgnoreCase("-0")) || (SimpleVal4.equalsIgnoreCase("-0.0")) || (SimpleVal4.equalsIgnoreCase("+0.0"))
                    || (SimpleVal4.equalsIgnoreCase("-0")) || (SimpleVal4.equalsIgnoreCase("+0")))
                    && ((TestAnsVal7.equalsIgnoreCase("0.0")) || (TestAnsVal7.equalsIgnoreCase("0")) || (TestAnsVal7.equalsIgnoreCase("-0.0")) || (TestAnsVal7.equalsIgnoreCase("+0.0"))
                    || (TestAnsVal7.equalsIgnoreCase("-0")) || (TestAnsVal7.equalsIgnoreCase("+0"))))) {
                if (!AITestResultsGenFlag) {
                    if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass VALUE TEST Diff System Integrity Check" + DiffORIntegre + " Usage.EqnSolArrayDiffAlone " + ConsoleColors.RESET);
                    } else {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass VALUE TEST Diff System Integrity Check" + DiffORIntegre + " Usage.EqnSolArrayIntegrAlone " + ConsoleColors.RESET);
                    }
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " DiffVal3=" + DiffVal3 + " TestAnsVal5Diff=" + TestAnsVal5Diff + " TestAnsVal6Map2=" + TestAnsVal6Map2 + " TestAnsVal7=" + TestAnsVal7 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Diff System Integrity TestAnsVal6Map2=" + TestAnsVal6Map2 + " SimpleVal4=" + SimpleVal4 + " DblexpValueAnswerExprnIntegrity=" + DblexpValueAnswerExprnIntegrity + ConsoleColors.RESET);
                    if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Diff System Integrity Usage.EqnSolArrayDiffAlone[Order]=" + UsageCalculus.EqnSolArrayDiffAlone[Order]);
                    } else {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Diff System Integrity Usage.EqnSolArrayIntegrAlone[Order]=" + UsageCalculus.EqnSolArrayIntegrAlone[Order]);
                    }
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Diff System Integrity DblexpValueAnswer3=" + DblexpValueAnswer3 + " Number=" + Number + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Diff System Integrity DblexpDiffValue=" + DblexpDiffValue + " NumberUsage.EqnSol=" + NumberEqnSol + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Diff System Integrity DblexpValueMap2=" + DblexpValueMap2.doubleValue() + " expValueExprn.eval()=" + expValueExprn.eval() + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " DblexpValueMap2=" + DblexpValueMap2.doubleValue() + ConsoleColors.RESET);
                }
                ReturnFlag = true;
            } else if (((TestAnsVal7.equalsIgnoreCase(DiffVal3))
                    && ((TestAnsVal7.equalsIgnoreCase(SimpleVal4))))
                    //Zero Integrity Pass Through Check:0.0, -0.0 ,+0.0,-0,+0
                    || (((DiffVal3.equalsIgnoreCase("0.0")) || (DiffVal3.equalsIgnoreCase("-0.0")) || (DiffVal3.equalsIgnoreCase("+0.0"))
                    || (DiffVal3.equalsIgnoreCase("0")) || (DiffVal3.equalsIgnoreCase("-0")) || (DiffVal3.equalsIgnoreCase("+0")))
                    && ((SimpleVal4.equalsIgnoreCase("0.0")) || (SimpleVal4.equalsIgnoreCase("0")) || (SimpleVal4.equalsIgnoreCase("-0")) || (SimpleVal4.equalsIgnoreCase("-0.0")) || (SimpleVal4.equalsIgnoreCase("+0.0"))
                    || (SimpleVal4.equalsIgnoreCase("-0")) || (SimpleVal4.equalsIgnoreCase("+0")))
                    && ((TestAnsVal7.equalsIgnoreCase("0.0")) || (TestAnsVal7.equalsIgnoreCase("0")) || (TestAnsVal7.equalsIgnoreCase("-0.0")) || (TestAnsVal7.equalsIgnoreCase("+0.0"))
                    || (TestAnsVal7.equalsIgnoreCase("-0")) || (TestAnsVal7.equalsIgnoreCase("+0"))))) {
                if (!AITestResultsGenFlag) {
                    if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass REDUCED VALUE TEST Diff System Integrity Check" + DiffORIntegre + " Usage.EqnSolArrayDiffAlone " + ConsoleColors.RESET);
                    } else {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass REDUCED VALUE TEST Diff System Integrity Check" + DiffORIntegre + " Usage.EqnSolArrayIntegrAlone " + ConsoleColors.RESET);
                    }
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " DiffVal3=" + DiffVal3 + " TestAnsVal5Diff=" + TestAnsVal5Diff + " TestAnsVal6Map2=" + TestAnsVal6Map2 + " TestAnsVal7=" + TestAnsVal7 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Diff System Integrity TestAnsVal6Map2=" + TestAnsVal6Map2 + " SimpleVal4=" + SimpleVal4 + " DblexpValueAnswerExprnIntegrity=" + DblexpValueAnswerExprnIntegrity + ConsoleColors.RESET);
                    if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Diff System Integrity Usage.EqnSolArrayDiffAlone[Order]=" + UsageCalculus.EqnSolArrayDiffAlone[Order]);
                    } else {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Diff System Integrity Usage.EqnSolArrayIntegrAlone[Order]=" + UsageCalculus.EqnSolArrayIntegrAlone[Order]);
                    }
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Diff System Integrity DblexpValueAnswer3=" + DblexpValueAnswer3 + " Number=" + Number + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Diff System Integrity DblexpDiffValue=" + DblexpDiffValue + " NumberUsage.EqnSol=" + NumberEqnSol + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Diff System Integrity DblexpValueMap2=" + DblexpValueMap2.doubleValue() + " expValueExprn.eval()=" + expValueExprn.eval() + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " DblexpValueMap2=" + DblexpValueMap2.doubleValue() + ConsoleColors.RESET);
                }
                ReturnFlag = true;
            } else {
                if (!AITestResultsGenFlag) {
                    if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                        System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Status=" + "FAIL Integrity Check TEST Integrity Check" + DiffORIntegre + " Usage.EqnSolArrayDiffAlone" + ConsoleColors.RESET);
                    } else {
                        System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Status=" + "FAIL Integrity Check TEST Integrity Check" + DiffORIntegre + " Usage.EqnSolArrayIntegrAlone" + ConsoleColors.RESET);
                    }
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " DiffVal3=" + DiffVal3 + " TestAnsVal5Diff=" + TestAnsVal5Diff + " TestAnsVal6Map2=" + TestAnsVal6Map2 + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Diff System Integrity TestAnsVal6Map2=" + TestAnsVal6Map2 + " TestAnsVal7=" + TestAnsVal7 + " SimpleVal4=" + SimpleVal4 + " DblexpValueAnswerExprnIntegrity=" + DblexpValueAnswerExprnIntegrity + ConsoleColors.RESET);
                    if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                        System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Diff System Integrity Usage.EqnSolArrayDiffAlone[Order]=" + UsageCalculus.EqnSolArrayDiffAlone[Order]);
                    } else {
                        System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Diff System Integrity Usage.EqnSolArrayIntegrAlone[Order]=" + UsageCalculus.EqnSolArrayIntegrAlone[Order]);
                    }
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Diff System Integrity DblexpValueAnswer3=" + DblexpValueAnswer3 + " Number=" + Number + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Diff System Integrity DblexpDiffValue=" + DblexpDiffValue + " NumberUsage.EqnSol=" + NumberEqnSol + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Diff System Integrity DblexpValueMap2=" + DblexpValueMap2.doubleValue() + " expValueExprn.eval()=" + expValueExprn.eval() + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " DblexpValueMap2=" + DblexpValueMap2.doubleValue() + " :Check if there is E or e or Rounding Of in Double Coefficient" + ConsoleColors.RESET);
                    System.out.println("PassFailTestCaseValue:NumberAnsMap2=" + NumberAnsMap2 + " TestAnsVal6Map2=" + TestAnsVal6Map2);
                    System.out.println("PassFailTestCaseValue:NumberEqnSol=" + NumberEqnSol + " TestAnsVal7=" + TestAnsVal7);
                }
                ReturnFlag = false;
            }
            // Need to check Diff Value with Map2 Value in Answer
            if (ReturnFlag == true) {

            }
            if ((!ReturnFlag) && (ExprnexpValue.doubleValue() == expValueExprn.eval()) && (DblexpDiffValue.doubleValue() == expValueMap2.eval()) && (DblexpValueMap2.doubleValue() == expValueExprn.eval())) {
                StaleAnsTestCases.put(MaxStaleAns, "" + TestCase + " Order=" + Order + ",");
                StaleAnswerCount++;
                MaxStaleAns++;
                LowLevelSectionStaleAnsCount++;
                if (Order == MaxOrder1 - 1) {
                    SectionStaleAnsCount++;
                }
            } else if (!ReturnFlag) {
                FailAnsTestCases.put(MaxFailAns, "" + TestCase + " Order=" + Order + ",");
                FailAnswerCount++;
                MaxFailAns++;
                LowLevelSectionFailAnsCount++;
                if (Order == MaxOrder1 - 1) {
                    SectionFailAnsCount++;
                }
            }

            return ReturnFlag;
        }
        return false;
    }

    public static boolean PassFailTestCaseValueEasy(long myTestCase, int Order, String DiffORIntegre, String Exprn, Double ExprnexpValue, Double DblexpValueMap1, Double DblexpDiffValue, Double DblexpValueMap2, String StrexpDiffExpress, Map<String, Double> variables, Double x) {
        System.out.println("PassFailTestCaseValueEasy:Delta Error:Order=" + Order);
        String myOrder = "";
        //if ((Pragma.equalsIgnoreCase("Strict"))&&(TestCasePassValFlag==false)&&(TestCasePassStrFlag==false) )
        //    return TestCasePassValFlag;
        if ((Order >= 4) /*&&((TestCasePassStrFlag==true)||(TestCasePassConformalValFlag==true) )*/) {
            System.out.println("PassFailTestCaseValueEasy:Delta Error:myOrder=" + myOrder);
            if ((myOrder != null) && (!myOrder.equalsIgnoreCase("")) && (Double.parseDouble(myOrder) >= 4.0)) {
                TestCasePassValFlag = true;
                System.out.println(ConsoleColors.GREEN + " PassFailTestCaseValueEasy:Delta Error:Test Case Status=" + "Pass VALUE TEST Complete :(Order of Eqn > 4)=" + myOrder + ConsoleColors.RESET);
            } else {
                System.out.println(ConsoleColors.RED + " PassFailTestCaseValueEasy:Delta Error:Test Case Status=" + "FAIL VALUE TEST Complete" + ConsoleColors.RESET);
            }
        }
        return TestCasePassValFlag;
    }

    public static boolean PassFailTestCaseStringPalinSame(int myTestCase, int Order, String DiffORIntegre, String Exprn, int Operator, String StrMap1, String StrDiff, String StrMap2, String Answer1, String Answer2, String Answer3, String Answer4) {
        boolean ReturnFlagMap1 = false;
        boolean ReturnFlagDiff = false;
        boolean ReturnFlagMap2 = false;
        long TestCase = UsageCalculus.TestCase;
        if (TestCase == myTestCase) {
            // Assumption :New String is bigger than the Actual Result ONLY DIFF being last '-' OR last '+'
            if (StrMap1.equalsIgnoreCase(Answer2 + (char) Operator + Answer2)) {
                System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Exprn=" + Exprn + ConsoleColors.RESET);
                System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " StrMap1=" + StrMap1 + ConsoleColors.RESET);
                System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass STRING TEST Map1" + ConsoleColors.RESET);
                ReturnFlagMap1 = true;
            } else {
                System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Exprn=" + Exprn + ConsoleColors.RESET);
                System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Status=" + "FAIL STRING TEST Map1" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.YELLOW + " main:StrMap1=" + StrMap1 + ConsoleColors.RESET);
                System.out.println(ConsoleColors.YELLOW + " main:Answer2=" + (Answer2 + (char) Operator + Answer2) + ConsoleColors.RESET);
                ReturnFlagMap1 = false;
            }
            // Assumption :New String is bigger than the Actual Result ONLY DIFF being last '-' OR last '+'
            if (StrDiff.equalsIgnoreCase(Answer3 + (char) Operator + Answer3)) {
                System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Order=" + Order + " StrDiff=" + StrDiff + ConsoleColors.RESET);
                System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Order=" + Order + " Status=" + "Pass STRING TEST " + DiffORIntegre + ConsoleColors.RESET);
                ReturnFlagDiff = true;
            } else {
                System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Order=" + Order + " Status=" + "Pass STRING TEST " + DiffORIntegre + ConsoleColors.RESET);
                if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                    System.out.println(ConsoleColors.YELLOW + " main:Test Case " + TestCase + " StrDiff  =" + StrDiff + ConsoleColors.RESET);
                } else {
                    System.out.println(ConsoleColors.YELLOW + " main:Test Case " + TestCase + " StrIntegr=" + StrDiff + ConsoleColors.RESET);
                }
                System.out.println(ConsoleColors.YELLOW + " main:Test Case " + TestCase + " Answer3  =" + (Answer3 + (char) Operator + Answer3) + ConsoleColors.RESET);
                ReturnFlagDiff = false;
            }
            // Assumption :New String is bigger than the Actual Result ONLY DIFF being last '-' OR last '+'
            if (StrMap2.equalsIgnoreCase(Answer4 + (char) Operator + Answer4)) {
                System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass STRING TEST Map2" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " StrMap2=" + StrMap2 + ConsoleColors.RESET);
                ReturnFlagMap2 = true;
            } else {
                System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Status=" + "FAIL STRING TEST Map2" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.YELLOW + " main:Test Case " + TestCase + " StrMap2=" + StrMap2 + ConsoleColors.RESET);
                System.out.println(ConsoleColors.YELLOW + " main:Test Case " + TestCase + " Answer4=" + (Answer4 + (char) Operator + Answer4) + ConsoleColors.RESET);
                ReturnFlagMap2 = false;
            }

            return ((ReturnFlagMap1) && (ReturnFlagDiff) && (ReturnFlagMap2));
        }
        return false;
    }

    public static boolean PassFailTestCaseValuePalinSame(int myTestCase, int Order, String DiffORIntegre, String Exprn, int Operator, Double ExprnexpValue, Double DblexpValueMap1, Double DblexpDiffValue, Double DblexpValueMap2, Map<String, Double> variables) {
        boolean ReturnFlag = false;
        Double Number = ExprnexpValue.doubleValue();
        Double NumberAnsMap2 = 0.0;
        Double NumberEqnSol = 0.0;
        Double NumberDiff = 0.0;

        NumberFormat formatter = new DecimalFormat();
        Expression expValueExprn;
        String DblexpValueAnswerExprn = "";
        String DblexpValueAnswerExprnIntegrity = "";
        String TestAnsVal0 = "";
        String TestAnsVal5 = "";
        String TestAnsVal6 = "";
        String TestAnsVal7 = "";

        if (DiffORIntegre.equalsIgnoreCase("Diff")) {
            expValueExprn = parse(UsageCalculus.EqnSolArrayMap1[Order], variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
            if (Operator == '+') {
                DblexpValueAnswerExprn = "" + (expValueExprn.eval() + expValueExprn.eval());
            } else {
                DblexpValueAnswerExprn = "" + (expValueExprn.eval() - expValueExprn.eval());
            }
            Number = (expValueExprn.eval() + expValueExprn.eval());
            formatter.setMaximumFractionDigits(MaximumCompFractionDigits);
            TestAnsVal0 = formatter.format(Number);
        } else {
            expValueExprn = parse(UsageCalculus.EqnSolArrayMap3[Order], variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
            if (Operator == '+') {
                DblexpValueAnswerExprn = "" + (expValueExprn.eval() + expValueExprn.eval());
            } else {
                DblexpValueAnswerExprn = "" + (expValueExprn.eval() - expValueExprn.eval());
            }
            Number = Double.parseDouble(DblexpValueAnswerExprn);
            formatter.setMaximumFractionDigits(MaximumCompFractionDigits);
            TestAnsVal0 = formatter.format(Number);
        }
        Expression expValueMap2;
        Expression expValueDiffExprn;
        String DblexpValueAnswer3 = "";
        if (DiffORIntegre.equalsIgnoreCase("Diff")) {
            expValueMap2 = parse(UsageCalculus.EqnSolArrayDiffAlone[Order], variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
            if (Operator == '+') {
                DblexpValueAnswer3 = "" + (expValueMap2.eval() + expValueMap2.eval());
            } else {
                DblexpValueAnswer3 = "" + (expValueMap2.eval() - expValueMap2.eval());
            }
            Number = Double.parseDouble(DblexpValueAnswer3);
            formatter.setMaximumFractionDigits(MaximumCompFractionDigits);
            TestAnsVal5 = formatter.format(Number);
        } else {
            expValueMap2 = parse(UsageCalculus.EqnSolArrayIntegrAlone[Order], variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
            if (Operator == '+') {
                DblexpValueAnswer3 = "" + (expValueMap2.eval() + expValueMap2.eval());
            } else {
                DblexpValueAnswer3 = "" + (expValueMap2.eval() - expValueMap2.eval());
            }
            Number = Double.parseDouble(DblexpValueAnswer3);
            formatter.setMaximumFractionDigits(MaximumCompFractionDigits);
            TestAnsVal5 = formatter.format(Number);
        }

        //Answer System
        if (DiffORIntegre.equalsIgnoreCase("Diff")) {
            expValueExprn = parse(UsageCalculus.EqnSolArrayMap2[Order], variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
            if (Operator == '+') {
                DblexpValueAnswerExprnIntegrity = "" + (expValueExprn.eval() + expValueExprn.eval());
            } else {
                DblexpValueAnswerExprnIntegrity = "" + (expValueExprn.eval() - expValueExprn.eval());
            }
            NumberAnsMap2 = Double.parseDouble(DblexpValueAnswerExprnIntegrity);
            formatter.setMaximumFractionDigits(MaximumCompFractionDigits);
            TestAnsVal6 = formatter.format(NumberAnsMap2);
        } else {
            expValueExprn = parse(UsageCalculus.EqnSolArrayMap4[Order], variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
            if (Operator == '+') {
                DblexpValueAnswerExprnIntegrity = "" + (expValueExprn.eval() + expValueExprn.eval());
            } else {
                DblexpValueAnswerExprnIntegrity = "" + (expValueExprn.eval() - expValueExprn.eval());
            }
            NumberAnsMap2 = Double.parseDouble(DblexpValueAnswerExprnIntegrity);
            formatter.setMaximumFractionDigits(MaximumCompFractionDigits);
            TestAnsVal6 = formatter.format(NumberAnsMap2);
        }
        //Diff System
        if (DiffORIntegre.equalsIgnoreCase("Diff")) {
            expValueDiffExprn = parse(UsageCalculus.EqnSolArrayDiffAlone[Order], variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
            if (Operator == '+') {
                DblexpValueAnswerExprnIntegrity = "" + (expValueDiffExprn.eval() + expValueDiffExprn.eval());
            } else {
                DblexpValueAnswerExprnIntegrity = "" + (expValueDiffExprn.eval() - expValueDiffExprn.eval());
            }
            NumberEqnSol = Double.parseDouble(DblexpValueAnswerExprnIntegrity);;
            formatter.setMaximumFractionDigits(MaximumCompFractionDigits);
            TestAnsVal7 = formatter.format(NumberEqnSol);
        } else {
            expValueDiffExprn = parse(UsageCalculus.EqnSolArrayIntegrAlone[Order], variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
            if (Operator == '+') {
                DblexpValueAnswerExprnIntegrity = "" + (expValueDiffExprn.eval() + expValueDiffExprn.eval());
            } else {
                DblexpValueAnswerExprnIntegrity = "" + (expValueDiffExprn.eval() - expValueDiffExprn.eval());
            }
            NumberEqnSol = Double.parseDouble(DblexpValueAnswerExprnIntegrity);
            formatter.setMaximumFractionDigits(MaximumCompFractionDigits);
            TestAnsVal7 = formatter.format(NumberEqnSol);
        }
        Number = ExprnexpValue.doubleValue() + ExprnexpValue.doubleValue();
        formatter.setMaximumFractionDigits(MaximumCompFractionDigits);
        String TestVal1 = formatter.format(Number);
        Number = DblexpValueMap1.doubleValue() + DblexpValueMap1.doubleValue();
        formatter.setMaximumFractionDigits(MaximumCompFractionDigits);
        String TestVal2 = formatter.format(Number);

        NumberDiff = DblexpDiffValue.doubleValue() + DblexpDiffValue.doubleValue();
        formatter.setMaximumFractionDigits(MaximumCompFractionDigits);
        String DiffVal3 = formatter.format(NumberDiff);
        Number = DblexpValueMap2.doubleValue() + DblexpValueMap2.doubleValue();
        formatter.setMaximumFractionDigits(MaximumCompFractionDigits);
        String SimpleVal4 = formatter.format(Number);
        String Temp = "";
        long TestCase = UsageCalculus.TestCase;
        if (TestCase == myTestCase) {
            //Value Check with Exprn & Map1
            if (TestVal1.equalsIgnoreCase(TestVal2)) {
                System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Order=" + Order + " " + DiffWithRespTo + "=" + variables.get(DiffWithRespTo) + " Status=" + "Pass VALUE TEST Exprn Map1" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " TestVal1=" + TestVal1 + " ExprnexpValue=" + ExprnexpValue.doubleValue() + ConsoleColors.RESET);
                System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " TestVal2=" + TestVal2 + " DblexpValueMap1=" + DblexpValueMap1.doubleValue() + ConsoleColors.RESET);

                ReturnFlag = true;
            } else {
                System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Order=" + Order + " " + DiffWithRespTo + "=" + variables.get(DiffWithRespTo) + " Status=" + "FAIL VALUE TEST Exprn Map1" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " TestVal1=" + TestVal1 + " ExprnexpValue=" + ExprnexpValue.doubleValue() + ConsoleColors.RESET);
                System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " TestVal2=" + TestVal2 + " DblexpValueMap1=" + DblexpValueMap1.doubleValue() + " :Check if there is E or e in Double Coefficient" + ConsoleColors.RESET);
                ReturnFlag = false;
            }
            //Value Check with Exprn & Answer(Map1)
            if ((TestVal1.equalsIgnoreCase(TestAnsVal0))
                    //Zero Integrity Pass Through Check:0.0, -0.0 ,+0.0,-0,+0
                    || (((TestVal1.equalsIgnoreCase("0.0")) || (TestVal1.equalsIgnoreCase("-0.0")) || (TestVal1.equalsIgnoreCase("+0.0"))
                    || (TestVal1.equalsIgnoreCase("-0")) || (TestVal1.equalsIgnoreCase("+0")))
                    && ((TestAnsVal0.equalsIgnoreCase("0.0")) || (TestAnsVal0.equalsIgnoreCase("0")) || (TestAnsVal0.equalsIgnoreCase("-0.0")) || (TestAnsVal0.equalsIgnoreCase("+0.0"))
                    || (TestAnsVal0.equalsIgnoreCase("-0")) || (TestAnsVal0.equalsIgnoreCase("+0"))))) {
                if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Order=" + Order + " Status=" + "Pass VALUE TEST Answer Exprn " + ConsoleColors.RESET);
                } else {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Order=" + Order + " Status=" + "Pass VALUE TEST Answer Exprn " + ConsoleColors.RESET);
                }
                System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " DblexpValueAnswerExprn=" + DblexpValueAnswerExprn + ConsoleColors.RESET);
                System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " DblexpValueMap1=" + DblexpValueMap1.doubleValue() + ConsoleColors.RESET);

                ReturnFlag = true;
            } else {
                if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Order=" + Order + " Status=" + "FAIL VALUE TEST Answer Exprn" + ConsoleColors.RESET);
                } else {
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Order=" + Order + " Status=" + "FAIL VALUE TEST Answer Exprn" + ConsoleColors.RESET);
                }
                System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " DblexpValueAnswerExprn=" + DblexpValueAnswerExprn + ConsoleColors.RESET);
                System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " DblexpValueMap1=" + DblexpValueMap1.doubleValue() + " :Check if there is E or e or Rounding Of in Double Coefficient" + ConsoleColors.RESET);
                ReturnFlag = false;
            }
            //Value Check with Diff Exprn & Map2
            if ((DiffVal3.equalsIgnoreCase(SimpleVal4))
                    //Zero Integrity Pass Through Check:0.0, -0.0 ,+0.0,-0,+0
                    || (((DiffVal3.equalsIgnoreCase("0.0")) || (DiffVal3.equalsIgnoreCase("-0.0")) || (DiffVal3.equalsIgnoreCase("+0.0"))
                    || (DiffVal3.equalsIgnoreCase("0")) || (DiffVal3.equalsIgnoreCase("-0")) || (DiffVal3.equalsIgnoreCase("+0")))
                    && ((SimpleVal4.equalsIgnoreCase("0.0")) || (SimpleVal4.equalsIgnoreCase("0")) || (SimpleVal4.equalsIgnoreCase("-0.0")) || (SimpleVal4.equalsIgnoreCase("+0.0"))
                    || (SimpleVal4.equalsIgnoreCase("-0")) || (SimpleVal4.equalsIgnoreCase("+0"))))) {
                System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass VALUE TEST " + DiffORIntegre + " Map2" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " DiffVal3=" + DiffVal3 + " DblexpDiffValue=" + DblexpDiffValue.doubleValue() + ConsoleColors.RESET);
                System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " SimpleVal4=" + SimpleVal4 + " DblexpValueMap2=" + DblexpValueMap2.doubleValue() + ConsoleColors.RESET);

                ReturnFlag = true;
            } else {
                System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Status=" + "FAIL VALUE TEST " + DiffORIntegre + " Map2" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " DiffVal3=" + DiffVal3 + " DblexpDiffValue=" + DblexpDiffValue.doubleValue() + ConsoleColors.RESET);
                System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " SimpleVal4=" + SimpleVal4 + " DblexpValueMap2=" + DblexpValueMap2.doubleValue() + " :Check if there is E or e in Double Coefficient" + ConsoleColors.RESET);
                ReturnFlag = false;
            }
            //Value Check with Diff Exprn & Diff Answer(Map2)
            if ((DiffVal3.equalsIgnoreCase(TestAnsVal5))
                    //Zero Integrity Pass Through Check:0.0, -0.0 ,+0.0,-0,+0
                    || (((DiffVal3.equalsIgnoreCase("0.0")) || (DiffVal3.equalsIgnoreCase("-0.0")) || (DiffVal3.equalsIgnoreCase("+0.0"))
                    || (DiffVal3.equalsIgnoreCase("-0")) || (DiffVal3.equalsIgnoreCase("+0")))
                    && ((TestAnsVal5.equalsIgnoreCase("0.0")) || (TestAnsVal5.equalsIgnoreCase("0")) || (TestAnsVal5.equalsIgnoreCase("-0.0")) || (TestAnsVal5.equalsIgnoreCase("+0.0"))
                    || (TestAnsVal5.equalsIgnoreCase("-0")) || (TestAnsVal5.equalsIgnoreCase("+0"))))) {
                if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass VALUE TEST Answer " + DiffORIntegre + " Usage.EqnSolArrayDiffAlone " + ConsoleColors.RESET);
                } else {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass VALUE TEST Answer " + DiffORIntegre + " Usage.EqnSolArrayIntegrAlone " + ConsoleColors.RESET);
                }
                System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " DiffVal3=" + DiffVal3 + ConsoleColors.RESET);
                System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " DblexpValueAnswer3=" + DblexpValueAnswer3 + ConsoleColors.RESET);
                System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " DblexpValueMap2=" + DblexpValueMap2.doubleValue() + ConsoleColors.RESET);

                ReturnFlag = true;
            } else {
                if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Status=" + "FAIL VALUE TEST " + DiffORIntegre + " Usage.EqnSolArrayDiffAlone" + ConsoleColors.RESET);
                } else {
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Status=" + "FAIL VALUE TEST " + DiffORIntegre + " Usage.EqnSolArrayIntegrAlone" + ConsoleColors.RESET);
                }
                System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " DiffVal3=" + DiffVal3 + ConsoleColors.RESET);
                System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " DblexpValueAnswer3=" + DblexpValueAnswer3 + ConsoleColors.RESET);
                System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " DblexpValueMap2=" + DblexpValueMap2.doubleValue() + " :Check if there is E or e or Rounding Of in Double Coefficient" + ConsoleColors.RESET);
                ReturnFlag = false;
            }//Value (Answer) Integrity Check with Ans Diff Exprn & Answer(Map2)
            if (((TestAnsVal6.equalsIgnoreCase(DiffVal3))
                    && ((TestAnsVal6.equalsIgnoreCase(SimpleVal4))
                    && ((DblexpValueMap2.doubleValue() == expValueExprn.eval())
                    && ((DblexpValueMap2.doubleValue() == NumberAnsMap2)
                    && (DblexpDiffValue.doubleValue() == NumberDiff)))))
                    //Zero Integrity Pass Through Check:0.0, -0.0 ,+0.0,-0,+0
                    || (((DiffVal3.equalsIgnoreCase("0.0")) || (DiffVal3.equalsIgnoreCase("-0.0")) || (DiffVal3.equalsIgnoreCase("+0.0"))
                    || (DiffVal3.equalsIgnoreCase("0")) || (DiffVal3.equalsIgnoreCase("-0")) || (DiffVal3.equalsIgnoreCase("+0")))
                    && ((SimpleVal4.equalsIgnoreCase("0.0")) || (SimpleVal4.equalsIgnoreCase("0")) || (SimpleVal4.equalsIgnoreCase("-0.0")) || (SimpleVal4.equalsIgnoreCase("+0.0"))
                    || (SimpleVal4.equalsIgnoreCase("-0")) || (SimpleVal4.equalsIgnoreCase("+0")))
                    && ((TestAnsVal6.equalsIgnoreCase("0.0")) || (TestAnsVal6.equalsIgnoreCase("0")) || (TestAnsVal6.equalsIgnoreCase("-0.0")) || (TestAnsVal6.equalsIgnoreCase("+0.0"))
                    || (TestAnsVal6.equalsIgnoreCase("-0")) || (TestAnsVal6.equalsIgnoreCase("+0"))))) {
                if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass VALUE TEST Answer Integrity Check" + DiffORIntegre + " Usage.EqnSolArrayDiffAlone " + ConsoleColors.RESET);
                } else {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass VALUE TEST Answer Integrity Check" + DiffORIntegre + " Usage.EqnSolArrayIntegrAlone " + ConsoleColors.RESET);
                }
                System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " DiffVal3=" + DiffVal3 + " TestAnsVal6=" + TestAnsVal6 + ConsoleColors.RESET);
                System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Integrity TestAnsVal6=" + TestAnsVal6 + " SimpleVal4=" + SimpleVal4 + " DblexpValueAnswerExprnIntegrity=" + DblexpValueAnswerExprnIntegrity + ConsoleColors.RESET);
                if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Integrity Usage.EqnSolArrayDiffAlone[Order]=" + UsageCalculus.EqnSolArrayDiffAlone[Order]);
                } else {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Integrity Usage.EqnSolArrayIntegrAlone[Order]=" + UsageCalculus.EqnSolArrayIntegrAlone[Order]);
                }
                System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Integrity DblexpValueAnswer3=" + DblexpValueAnswer3 + " NumberAnsMap2=" + NumberAnsMap2 + ConsoleColors.RESET);
                System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Integrity DblexpDiffValue=" + DblexpDiffValue + " NumberDiff=" + NumberDiff + ConsoleColors.RESET);
                System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Integrity DblexpValueMap2=" + DblexpValueMap2.doubleValue() + " expValueExprn.eval()=" + expValueExprn.eval() + ConsoleColors.RESET);
                System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " DblexpValueMap2=" + DblexpValueMap2.doubleValue() + ConsoleColors.RESET);

                ReturnFlag = true;
            } else {
                if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Status=" + "FAIL Integrity Check TEST Integrity Check" + DiffORIntegre + " Usage.EqnSolArrayDiffAlone" + ConsoleColors.RESET);
                } else {
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Status=" + "FAIL Integrity Check TEST Integrity Check" + DiffORIntegre + " Usage.EqnSolArrayIntegrAlone" + ConsoleColors.RESET);
                }
                System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " DiffVal3=" + DiffVal3 + " TestAnsVal6=" + TestAnsVal6 + ConsoleColors.RESET);
                System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Integrity TestAnsVal6=" + TestAnsVal6 + " SimpleVal4=" + SimpleVal4 + " DblexpValueAnswerExprnIntegrity=" + DblexpValueAnswerExprnIntegrity + ConsoleColors.RESET);
                if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Integrity Usage.EqnSolArrayDiffAlone[Order]=" + UsageCalculus.EqnSolArrayDiffAlone[Order]);
                } else {
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Integrity Usage.EqnSolArrayIntegrAlone[Order]=" + UsageCalculus.EqnSolArrayIntegrAlone[Order]);
                }
                System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Integrity DblexpValueAnswer3=" + DblexpValueAnswer3 + " NumberAnsMap2=" + NumberAnsMap2 + ConsoleColors.RESET);
                System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Integrity DblexpDiffValue=" + DblexpDiffValue + " NumberDiff=" + NumberDiff + ConsoleColors.RESET);
                System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Integrity DblexpValueMap2=" + DblexpValueMap2.doubleValue() + " expValueExprn.eval()=" + expValueExprn.eval() + ConsoleColors.RESET);
                System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " DblexpValueMap2=" + DblexpValueMap2.doubleValue() + " :Check if there is E or e or Rounding Of in Double Coefficient" + ConsoleColors.RESET);
                ReturnFlag = false;
            }
            //Value (Answer-Diff System) Integrity Check with Ans Diff Exprn & Answer(Map2)
            if (((TestAnsVal7.equalsIgnoreCase(DiffVal3))
                    && ((TestAnsVal7.equalsIgnoreCase(SimpleVal4))
                    && ((DblexpValueMap2.doubleValue() == expValueExprn.eval())
                    && ((DblexpValueMap2.doubleValue() == NumberEqnSol)
                    && (DblexpDiffValue.doubleValue() == NumberEqnSol)))))
                    //Zero Integrity Pass Through Check:0.0, -0.0 ,+0.0,-0,+0
                    || (((DiffVal3.equalsIgnoreCase("0.0")) || (DiffVal3.equalsIgnoreCase("-0.0")) || (DiffVal3.equalsIgnoreCase("+0.0"))
                    || (DiffVal3.equalsIgnoreCase("0")) || (DiffVal3.equalsIgnoreCase("-0")) || (DiffVal3.equalsIgnoreCase("+0")))
                    && ((SimpleVal4.equalsIgnoreCase("0.0")) || (SimpleVal4.equalsIgnoreCase("0")) || (SimpleVal4.equalsIgnoreCase("-0")) || (SimpleVal4.equalsIgnoreCase("-0.0")) || (SimpleVal4.equalsIgnoreCase("+0.0"))
                    || (SimpleVal4.equalsIgnoreCase("-0")) || (SimpleVal4.equalsIgnoreCase("+0")))
                    && ((TestAnsVal7.equalsIgnoreCase("0.0")) || (TestAnsVal7.equalsIgnoreCase("0")) || (TestAnsVal7.equalsIgnoreCase("-0.0")) || (TestAnsVal7.equalsIgnoreCase("+0.0"))
                    || (TestAnsVal7.equalsIgnoreCase("-0")) || (TestAnsVal7.equalsIgnoreCase("+0"))))) {
                if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass VALUE TEST Diff System Integrity Check" + DiffORIntegre + " Usage.EqnSolArrayDiffAlone " + ConsoleColors.RESET);
                } else {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Status=" + "Pass VALUE TEST Diff System Integrity Check" + DiffORIntegre + " Usage.EqnSolArrayIntegrAlone " + ConsoleColors.RESET);
                }
                System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " DiffVal3=" + DiffVal3 + " TestAnsVal6=" + TestAnsVal6 + " TestAnsVal7=" + TestAnsVal7 + ConsoleColors.RESET);
                System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Diff System Integrity TestAnsVal6=" + TestAnsVal6 + " SimpleVal4=" + SimpleVal4 + " DblexpValueAnswerExprnIntegrity=" + DblexpValueAnswerExprnIntegrity + ConsoleColors.RESET);
                if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Diff System Integrity Usage.EqnSolArrayDiffAlone[Order]=" + UsageCalculus.EqnSolArrayDiffAlone[Order]);
                } else {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Diff System Integrity Usage.EqnSolArrayIntegrAlone[Order]=" + UsageCalculus.EqnSolArrayIntegrAlone[Order]);
                }
                System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Diff System Integrity DblexpValueAnswer3=" + DblexpValueAnswer3 + " Number=" + Number + ConsoleColors.RESET);
                System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Diff System Integrity DblexpDiffValue=" + DblexpDiffValue + " NumberUsage.EqnSol=" + NumberEqnSol + ConsoleColors.RESET);
                System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " Diff System Integrity DblexpValueMap2=" + DblexpValueMap2.doubleValue() + " expValueExprn.eval()=" + expValueExprn.eval() + ConsoleColors.RESET);
                System.out.println(ConsoleColors.GREEN + " main:Test Case " + TestCase + " DblexpValueMap2=" + DblexpValueMap2.doubleValue() + ConsoleColors.RESET);

                ReturnFlag = true;
            } else {
                if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Status=" + "FAIL Integrity Check TEST Integrity Check" + DiffORIntegre + " Usage.EqnSolArrayDiffAlone" + ConsoleColors.RESET);
                } else {
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Status=" + "FAIL Integrity Check TEST Integrity Check" + DiffORIntegre + " Usage.EqnSolArrayIntegrAlone" + ConsoleColors.RESET);
                }
                System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " DiffVal3=" + DiffVal3 + " TestAnsVal6=" + TestAnsVal6 + ConsoleColors.RESET);
                System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Diff System Integrity TestAnsVal6=" + TestAnsVal6 + " TestAnsVal7=" + TestAnsVal7 + " SimpleVal4=" + SimpleVal4 + " DblexpValueAnswerExprnIntegrity=" + DblexpValueAnswerExprnIntegrity + ConsoleColors.RESET);
                if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Diff System Integrity Usage.EqnSolArrayDiffAlone[Order]=" + UsageCalculus.EqnSolArrayDiffAlone[Order]);
                } else {
                    System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Diff System Integrity Usage.EqnSolArrayIntegrAlone[Order]=" + UsageCalculus.EqnSolArrayIntegrAlone[Order]);
                }
                System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Diff System Integrity DblexpValueAnswer3=" + DblexpValueAnswer3 + " Number=" + Number + ConsoleColors.RESET);
                System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Diff System Integrity DblexpDiffValue=" + DblexpDiffValue + " NumberUsage.EqnSol=" + NumberEqnSol + ConsoleColors.RESET);
                System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " Diff System Integrity DblexpValueMap2=" + DblexpValueMap2.doubleValue() + " expValueExprn.eval()=" + expValueExprn.eval() + ConsoleColors.RESET);
                System.out.println(ConsoleColors.RED + " main:Test Case " + TestCase + " DblexpValueMap2=" + DblexpValueMap2.doubleValue() + " :Check if there is E or e or Rounding Of in Double Coefficient" + ConsoleColors.RESET);
                ReturnFlag = false;
            }
            return ReturnFlag;
        }
        return false;
    }

    public static boolean ConformalMapTestCaseDiff(long myTestCase, int Order, String Exprn, MathsContxtLAv.SimpleExpression expSimpleMap1, Calculus.DiffrIntegrSep.DiffExpr exp, MathsContxtLAv.SimpleExpression expSimpleMap2, String AnsMap1, String DiffAlone, String AnsMap2, Map<String, Double> variables, String DiffWithRespTo) {
        boolean ReturnFlag = false;
        boolean failFlag = false;
        boolean PassFlag = false;
        int ControlInt = 0;
        Expression expValue;
        Double[] DblexpValueOrg = new Double[8];
        Double[] DblexpValueMap1 = new Double[8];
        //String F(x) -> String F(y)
        String StrExprn = Exprn;
        String StrConMap1 = expSimpleMap1.SimpleExpr();
        String StrDiff = exp.DiffExpr();
        String StrConMap2 = expSimpleMap2.SimpleExpr();
        //F(x) -> F(y)
        String MappedExprn = Exprn.replaceAll(DiffWithRespTo, "y");
        String MappedConMap1 = StrConMap1.replaceAll(DiffWithRespTo, "y");
        String MappedDiff = StrDiff.replaceAll(DiffWithRespTo, "y");
        String MappedConMap2 = StrConMap2.replaceAll(DiffWithRespTo, "y");

        // Compare Value of Exprn with Mapped Exprn
        Double DELTA = 0.000001;
        Double valBase = -3.0;
        Double val = valBase;
        ControlInt = 1;
        for (int i = 0; i <= 7; i++) {
            switch (i) {
                case 0:
                    val = -3.0;
                    break;
                case 1:
                    valBase++;
                    break;
                case 2:
                    valBase++;
                    break;
                case 3:
                    valBase++;
                    break;
                case 4:
                    valBase++;
                    break;
                case 5:
                    valBase++;
                    break;
                case 6:
                    valBase++;
                    break;
                case 7:
                    valBase++;
                    break;
            }
            for (int j = 0; j < 3; j++) {
                switch (j) {
                    case 0:
                        val = valBase;
                        break;
                    case 1:
                        val = valBase - DELTA;
                        break;
                    case 2:
                        val = valBase + DELTA;
                        break;
                }
                variables.put(DiffWithRespTo, val * 1.0);
                expValue = parse(Exprn, variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
                DblexpValueOrg[i] = expValue.eval();

                variables.put("y", val * 1.0);
                expValue = parse(MappedExprn, variables, "y", false, "Silent", LogLevel.Off);
                DblexpValueMap1[i] = expValue.eval();
                if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                        && (DblexpValueOrg[i].doubleValue() != DblexpValueMap1[i].doubleValue())) {
                    System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Exprn MappedExprn" + " Exprn=" + Exprn + " val=" + val + " x=" + variables.get("x") + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Exprn MappedExprn" + " MappedExprn=" + MappedExprn + " val=" + val + " y=" + variables.get("y") + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Exprn MappedExprn" + " DblexpValueOrg[i]=" + DblexpValueOrg[i].doubleValue() + " DblexpValueMap1[i]=" + DblexpValueMap1[i].doubleValue() + " val=" + val + " DELTA=" + DELTA + ConsoleColors.RESET);
                    failFlag = true;
                    break;
                } else if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                        && (DblexpValueOrg[i].doubleValue() == DblexpValueMap1[i].doubleValue())) {
                    PassFlag = true;
                }
            }
        }
        if ((PassFlag == true) && (failFlag == false)) {
            // Compare Value of Exprn with Mapped expSimpleMap1.SimpleExpr():Infer expSimpleMap1 Answer is RIGHT
            valBase = -3.0;
            val = valBase;
            ControlInt = 2;
            for (int i = 0; i <= 7; i++) {
                switch (i) {
                    case 0:
                        val = -3.0;
                        break;
                    case 1:
                        valBase++;
                        break;
                    case 2:
                        valBase++;
                        break;
                    case 3:
                        valBase++;
                        break;
                    case 4:
                        valBase++;
                        break;
                    case 5:
                        valBase++;
                        break;
                    case 6:
                        valBase++;
                        break;
                    case 7:
                        valBase++;
                        break;
                }
                for (int j = 0; j < 3; j++) {
                    switch (j) {
                        case 0:
                            val = valBase;
                            break;
                        case 1:
                            val = valBase - DELTA;
                            break;
                        case 2:
                            val = valBase + DELTA;
                            break;
                    }
                    variables.put(DiffWithRespTo, val * 1.0);
                    expValue = parse(Exprn, variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
                    DblexpValueOrg[i] = expValue.eval();
                    variables.put("y", val * 1.0);
                    expValue = parse(StrConMap1.replaceAll(DiffWithRespTo, "y"), variables, "y", false, "Silent", LogLevel.Off);
                    DblexpValueMap1[i] = expValue.eval();

                    Double Number = 0.0;
                    Double NumberDiff = 0.0;
                    NumberFormat formatter = new DecimalFormat();
                    Number = expValue.eval().doubleValue();
                    formatter.setMaximumFractionDigits(MaximumCompFractionDigits);
                    String DiffVal = formatter.format(Number);
                    Number = expValue.eval().doubleValue();
                    formatter.setMaximumFractionDigits(MaximumCompFractionDigits);
                    String Simple = formatter.format(Number);

                    if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() != DblexpValueMap1[i].doubleValue())
                            && (!DiffVal.equalsIgnoreCase(Simple))) {
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Exprn expSimpleMap1" + " Exprn=" + Exprn + " val=" + val + " x=" + variables.get(DiffWithRespTo) + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Exprn expSimpleMap1" + " expSimpleMap1=" + StrConMap1.replaceAll(DiffWithRespTo, "y") + " val=" + val + " y=" + variables.get("y") + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Exprn expSimpleMap1" + " DblexpValueOrg[i]=" + DblexpValueOrg[i].doubleValue() + " DblexpValueMap1[i]=" + DblexpValueMap1[i].doubleValue() + " DiffVal=" + DiffVal + " Simple=" + Simple + " val=" + val + " DELTA=" + DELTA + ConsoleColors.RESET);
                        failFlag = true;
                        break;
                    } else if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() == DblexpValueMap1[i].doubleValue())) {
                        PassFlag = true;
                    }
                }
            }
        }
        if ((PassFlag == true) && (failFlag == false)) {
            // Compare Value of expSimpleMap1 with Mapped MappedConMap1
            valBase = -3.0;
            val = valBase;
            ControlInt = 3;
            for (int i = 0; i <= 7; i++) {
                switch (i) {
                    case 0:
                        val = -3.0;
                        break;
                    case 1:
                        valBase++;
                        break;
                    case 2:
                        valBase++;
                        break;
                    case 3:
                        valBase++;
                        break;
                    case 4:
                        valBase++;
                        break;
                    case 5:
                        valBase++;
                        break;
                    case 6:
                        valBase++;
                        break;
                    case 7:
                        valBase++;
                        break;
                }
                for (int j = 0; j < 3; j++) {
                    switch (j) {
                        case 0:
                            val = valBase;
                            break;
                        case 1:
                            val = valBase - DELTA;
                            break;
                        case 2:
                            val = valBase + DELTA;
                            break;
                    }
                    variables.put(DiffWithRespTo, val * 1.0);
                    expValue = parse(expSimpleMap1.SimpleExpr(), variables, DiffWithRespTo, false, "Silent", LogLevel.Off);;
                    DblexpValueOrg[i] = expValue.eval();
                    variables.put("y", val * 1.0);
                    expValue = parse(MappedConMap1, variables, "y", false, "Silent", LogLevel.Off);
                    DblexpValueMap1[i] = expValue.eval();

                    if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() != DblexpValueMap1[i].doubleValue())) {
                        System.out.println(ConsoleColors.RED + "Simple Exprn Map1" + " expSimpleMap1.SimpleExpr()=" + expSimpleMap1.SimpleExpr() + " val=" + val + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "Simple Exprn Map1" + " MappedConMap1=" + MappedConMap1 + " val=" + val + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "Simple Exprn Map1" + " DblexpValueOrg[i]=" + DblexpValueOrg[i].doubleValue() + " DblexpValueMap1[i]=" + DblexpValueMap1[i].doubleValue() + " val=" + val + ConsoleColors.RESET);
                        failFlag = true;
                        break;
                    } else if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() == DblexpValueMap1[i].doubleValue())) {
                        PassFlag = true;
                    }
                }
            }
        }
        if ((PassFlag == true) && (failFlag == false)) {
            // Compare Value of Diff exp.DiffExpr() with Mapped MappedDiff
            valBase = -3.0;
            val = valBase;
            ControlInt = 4;
            for (int i = 0; i <= 7; i++) {
                switch (i) {
                    case 0:
                        val = -3.0;
                        break;
                    case 1:
                        valBase++;
                        break;
                    case 2:
                        valBase++;
                        break;
                    case 3:
                        valBase++;
                        break;
                    case 4:
                        valBase++;
                        break;
                    case 5:
                        valBase++;
                        break;
                    case 6:
                        valBase++;
                        break;
                    case 7:
                        valBase++;
                        break;
                }
                for (int j = 0; j < 3; j++) {
                    switch (j) {
                        case 0:
                            val = valBase;
                            break;
                        case 1:
                            val = valBase - DELTA;
                            break;
                        case 2:
                            val = valBase + DELTA;
                            break;
                    }
                    variables.put(DiffWithRespTo, val * 1.0);
                    expValue = parse(exp.DiffExpr(), variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
                    DblexpValueOrg[i] = expValue.eval();
                    variables.put("y", val * 1.0);
                    expValue = parse(MappedDiff, variables, "y", false, "Silent", LogLevel.Off);
                    DblexpValueMap1[i] = expValue.eval();
                    if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() != DblexpValueMap1[i].doubleValue())) {
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Diffr MappedDiff" + " exp.DiffExpr()=" + exp.DiffExpr() + " val=" + val + " x=" + variables.get(DiffWithRespTo) + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Diffr MappedDiff" + " MappedDiff=" + MappedDiff + " val=" + val + " y=" + variables.get("y") + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Diffr MappedDiff" + " DblexpValueOrg[i]=" + DblexpValueOrg[i].doubleValue() + " DblexpValueMap1[i]=" + DblexpValueMap1[i].doubleValue() + " val=" + val + " DELTA=" + DELTA + ConsoleColors.RESET);
                        failFlag = true;
                        break;
                    } else if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() == DblexpValueMap1[i].doubleValue())) {
                        PassFlag = true;
                    }
                }
            }
        }
        if ((PassFlag == true) && (failFlag == false)) {
            // Compare Value of expSimpleMap2 with Mapped MappedConMap2
            valBase = -3.0;
            val = valBase;
            ControlInt = 5;
            for (int i = 0; i <= 7; i++) {
                switch (i) {
                    case 0:
                        val = -3.0;
                        break;
                    case 1:
                        valBase++;
                        break;
                    case 2:
                        valBase++;
                        break;
                    case 3:
                        valBase++;
                        break;
                    case 4:
                        valBase++;
                        break;
                    case 5:
                        valBase++;
                        break;
                    case 6:
                        valBase++;
                        break;
                    case 7:
                        valBase++;
                        break;
                }
                for (int j = 0; j < 3; j++) {
                    switch (j) {
                        case 0:
                            val = valBase;
                            break;
                        case 1:
                            val = valBase - DELTA;
                            break;
                        case 2:
                            val = valBase + DELTA;
                            break;
                    }
                    variables.put(DiffWithRespTo, val * 1.0);
                    expValue = parse(expSimpleMap2.SimpleExpr(), variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
                    DblexpValueOrg[i] = expValue.eval();
                    variables.put("y", val * 1.0);
                    expValue = parse(MappedConMap2, variables, "y", false, "Silent", LogLevel.Off);
                    DblexpValueMap1[i] = expValue.eval();

                    if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() != DblexpValueMap1[i].doubleValue())) {
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Simple Map2 MappedConMap2" + " expSimpleMap2.SimpleExpr()=" + expSimpleMap2.SimpleExpr() + " val=" + val + " x=" + variables.get(DiffWithRespTo) + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Simple Map2 MappedConMap2" + " MappedConMap2=" + MappedConMap2 + " val=" + val + " y=" + variables.get("y") + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Simple Map2 MappedConMap2" + " DblexpValueOrg[i]=" + DblexpValueOrg[i].doubleValue() + " DblexpValueMap1[i]=" + DblexpValueMap1[i].doubleValue() + " val=" + val + " DELTA=" + DELTA + ConsoleColors.RESET);
                        failFlag = true;
                        break;
                    } else if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() == DblexpValueMap1[i].doubleValue())) {
                        PassFlag = true;
                    }
                }
            }
        }
        if ((PassFlag == true) && (failFlag == false)) {
            // Compare Value of AnsMap1 with Mapped expSimpleMap1
            valBase = -3.0;
            val = valBase;
            ControlInt = 6;
            for (int i = 0; i <= 7; i++) {
                switch (i) {
                    case 0:
                        val = -3.0;
                        break;
                    case 1:
                        valBase++;
                        break;
                    case 2:
                        valBase++;
                        break;
                    case 3:
                        valBase++;
                        break;
                    case 4:
                        valBase++;
                        break;
                    case 5:
                        valBase++;
                        break;
                    case 6:
                        valBase++;
                        break;
                    case 7:
                        valBase++;
                        break;
                }
                for (int j = 0; j < 3; j++) {
                    switch (j) {
                        case 0:
                            val = valBase;
                            break;
                        case 1:
                            val = valBase - DELTA;
                            break;
                        case 2:
                            val = valBase + DELTA;
                            break;
                    }
                    variables.put(DiffWithRespTo, val * 1.0);
                    expValue = parse(AnsMap1, variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
                    DblexpValueOrg[i] = expValue.eval();
                    variables.put("y", val * 1.0);
                    expValue = parse(MappedConMap1, variables, "y", false, "Silent", LogLevel.Off);
                    DblexpValueMap1[i] = expValue.eval();

                    if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() != DblexpValueMap1[i].doubleValue())
                            && (AnsMap1.contains(DiffWithRespTo))
                            && (MappedConMap1.contains("y"))) {
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal Ans1 Map1  " + " AnsMap1=" + AnsMap1 + " val=" + val + " x=" + variables.get(DiffWithRespTo) + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal Ans1 Map1  " + " MappedConMap1=" + MappedConMap1 + " val=" + val + " y=" + variables.get("y") + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal Ans1 Map1  " + " DblexpValueOrg[i]=" + DblexpValueOrg[i].doubleValue() + " DblexpValueMap1[i]=" + DblexpValueMap1[i].doubleValue() + " val=" + val + " DELTA=" + DELTA + ConsoleColors.RESET);
                        failFlag = true;
                        break;
                    } else if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() == DblexpValueMap1[i].doubleValue())) {
                        PassFlag = true;
                    }
                }
            }
        }
        if ((PassFlag == true) && (failFlag == false)) {
            // Compare Value of DiffAlone with Mapped exp.DiffExpr():Infer Diff Answer is RIGHT
            valBase = -3.0;
            val = valBase;
            ControlInt = 7;
            for (int i = 0; i <= 7; i++) {
                switch (i) {
                    case 0:
                        val = -3.0;
                        break;
                    case 1:
                        valBase++;
                        break;
                    case 2:
                        valBase++;
                        break;
                    case 3:
                        valBase++;
                        break;
                    case 4:
                        valBase++;
                        break;
                    case 5:
                        valBase++;
                        break;
                    case 6:
                        valBase++;
                        break;
                    case 7:
                        valBase++;
                        break;
                }
                for (int j = 0; j < 3; j++) {
                    switch (j) {
                        case 0:
                            val = valBase;
                            break;
                        case 1:
                            val = valBase - DELTA;
                            break;
                        case 2:
                            val = valBase + DELTA;
                            break;
                    }
                    variables.put(DiffWithRespTo, val * 1.0);
                    expValue = parse(DiffAlone, variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
                    DblexpValueOrg[i] = expValue.eval();
                    variables.put("y", val * 1.0);
                    expValue = parse(StrDiff.replaceAll(DiffWithRespTo, "y"), variables, "y", false, "Silent", LogLevel.Off);
                    DblexpValueMap1[i] = expValue.eval();

                    Double Number = 0.0;
                    Double NumberDiff = 0.0;
                    NumberFormat formatter = new DecimalFormat();
                    Number = expValue.eval().doubleValue();
                    formatter.setMaximumFractionDigits(MaximumCompFractionDigits);
                    String DiffVal = formatter.format(Number);
                    Number = expValue.eval().doubleValue();
                    formatter.setMaximumFractionDigits(MaximumCompFractionDigits);
                    String Simple = formatter.format(Number);

                    if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() != DblexpValueMap1[i].doubleValue())
                            && (!DiffVal.equalsIgnoreCase(Simple))) {
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal DiffAlone Diff" + " DiffAlone=" + DiffAlone + " val=" + val + " x=" + variables.get(DiffWithRespTo) + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal DiffAlone Diff" + " StrDiff.replaceAll()=" + StrDiff.replaceAll(DiffWithRespTo, "y") + " val=" + val + " y=" + variables.get("y") + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal DiffAlone Diff" + " DblexpValueOrg[i]=" + DblexpValueOrg[i].doubleValue() + " DblexpValueMap1[i]=" + DblexpValueMap1[i].doubleValue() + " DiffVal=" + DiffVal + " Simple=" + Simple + " val=" + val + " DELTA=" + DELTA + ConsoleColors.RESET);
                        failFlag = true;
                        break;
                    } else if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() == DblexpValueMap1[i].doubleValue())) {
                        PassFlag = true;
                    }
                }
            }
        }
        if ((PassFlag == true) && (failFlag == false)) {
            // Compare Value of DiffAlone with Mapped exp
            valBase = -3.0;
            val = valBase;
            ControlInt = 8;
            for (int i = 0; i <= 7; i++) {
                switch (i) {
                    case 0:
                        val = -3.0;
                        break;
                    case 1:
                        valBase++;
                        break;
                    case 2:
                        valBase++;
                        break;
                    case 3:
                        valBase++;
                        break;
                    case 4:
                        valBase++;
                        break;
                    case 5:
                        valBase++;
                        break;
                    case 6:
                        valBase++;
                        break;
                    case 7:
                        valBase++;
                        break;
                }
                for (int j = 0; j < 3; j++) {
                    switch (j) {
                        case 0:
                            val = valBase;
                            break;
                        case 1:
                            val = valBase - DELTA;
                            break;
                        case 2:
                            val = valBase + DELTA;
                            break;
                    }
                    variables.put(DiffWithRespTo, val * 1.0);
                    expValue = parse(DiffAlone, variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
                    DblexpValueOrg[i] = expValue.eval();
                    variables.put("y", val * 1.0);
                    expValue = parse(MappedDiff, variables, "y", false, "Silent", LogLevel.Off);
                    DblexpValueMap1[i] = expValue.eval();
                    if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() != DblexpValueMap1[i].doubleValue())) {
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal DiffAlone MappedDiff" + " DiffAlone=" + DiffAlone + " val=" + val + " x=" + variables.get(DiffWithRespTo) + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal DiffAlone MappedDiff" + " MappedDiff=" + MappedDiff + " val=" + val + " y=" + variables.get("y") + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal DiffAlone MappedDiff" + " DblexpValueOrg[i]=" + DblexpValueOrg[i].doubleValue() + " DblexpValueMap1[i]=" + DblexpValueMap1[i].doubleValue() + " val=" + val + " DELTA=" + DELTA + ConsoleColors.RESET);
                        failFlag = true;
                        break;
                    } else if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() == DblexpValueMap1[i].doubleValue())) {
                        PassFlag = true;
                    }
                }
            }
        }
        if ((PassFlag == true) && (failFlag == false)) {
            // Compare Value of AnsMap2 with Mapped expSimpleMap2
            valBase = -3.0;
            val = valBase;
            ControlInt = 9;
            for (int i = 0; i <= 7; i++) {
                switch (i) {
                    case 0:
                        val = -3.0;
                        break;
                    case 1:
                        valBase++;
                        break;
                    case 2:
                        valBase++;
                        break;
                    case 3:
                        valBase++;
                        break;
                    case 4:
                        valBase++;
                        break;
                    case 5:
                        valBase++;
                        break;
                    case 6:
                        valBase++;
                        break;
                    case 7:
                        valBase++;
                        break;
                }
                for (int j = 0; j < 3; j++) {
                    switch (j) {
                        case 0:
                            val = valBase;
                            break;
                        case 1:
                            val = valBase - DELTA;
                            break;
                        case 2:
                            val = valBase + DELTA;
                            break;
                    }
                    variables.put(DiffWithRespTo, val * 1.0);
                    expValue = parse(AnsMap2, variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
                    DblexpValueOrg[i] = expValue.eval();
                    variables.put("y", val * 1.0);
                    expValue = parse(MappedConMap2, variables, "y", false, "Silent", LogLevel.Off);
                    DblexpValueMap1[i] = expValue.eval();

                    if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() != DblexpValueMap1[i].doubleValue())) {
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal Ans2 MappedConMap2" + " AnsMap2=" + AnsMap2 + " val=" + val + " x=" + variables.get(DiffWithRespTo) + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal Ans2 MappedConMap2" + " MappedConMap2=" + MappedConMap2 + " val=" + val + " y=" + variables.get("y") + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal Ans2 MappedConMap2" + " DblexpValueOrg[i]=" + DblexpValueOrg[i].doubleValue() + " DblexpValueMap1[i]=" + DblexpValueMap1[i].doubleValue() + " val=" + val + " DELTA=" + DELTA + ConsoleColors.RESET);
                        failFlag = true;
                        break;
                    } else if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() == DblexpValueMap1[i].doubleValue())) {
                        PassFlag = true;
                    }
                }
            }
        }
        ReturnFlag = (!failFlag);
        return ReturnFlag;
    }

    public static boolean FailTestCaseStringDiagnostic(long myTestCase, int Order, int MaxOrder1, String DiffORIntegre, String Exprn, String StrMap1, String StrDiff, String StrMap2, String Answer1, String Answer2, String Answer3, String Answer4) {
        boolean ReturnFlagMap1 = false;
        boolean ReturnFlagDiff = false;
        boolean ReturnFlagMap2 = false;
        long TestCase = UsageCalculus.TestCase;
        if (TestCase == myTestCase) {
            // Assumption :New String is bigger than the Actual Result ONLY DIFF being last '-' OR last '+'
            if (StrMap1.equalsIgnoreCase(Answer2)) {
                ReturnFlagMap1 = true;
                if ((Order == (MaxOrder1 - 1)) && (TestCasePassHighLevelFlag == false)) {
                    TestCasePassMap1StrCount++;
                }

            } else {
                if ((Order == (MaxOrder1 - 1)) && (TestCasePassHighLevelFlag == false)) {
                    TestCaseFailMap1StrCount++;
                }
                ReturnFlagMap1 = false;
            }
            // Assumption :New String is bigger than the Actual Result ONLY DIFF being last '-' OR last '+'
            if (StrDiff.equalsIgnoreCase(Answer3)) {
                ReturnFlagDiff = true;
                if ((Order == (MaxOrder1 - 1)) && (TestCasePassHighLevelFlag == false)) {
                    TestCasePassCalcuStrCount++;
                }
            } else {
                if (DiffORIntegre.equalsIgnoreCase("Diff")) {
                } else {
                }
                ReturnFlagDiff = false;
                if ((Order == (MaxOrder1 - 1)) && (TestCasePassHighLevelFlag == false)) {
                    TestCaseFailCalcuStrCount++;
                }
            }
            // Assumption :New String is bigger than the Actual Result ONLY DIFF being last '-' OR last '+'
            if (StrMap2.equalsIgnoreCase(Answer4)) {
                ReturnFlagMap2 = true;
                if ((Order == (MaxOrder1 - 1)) && (TestCasePassHighLevelFlag == false)) {
                    TestCasePassMap2StrCount++;
                }
            } else {
                ReturnFlagMap2 = false;
                if ((Order == (MaxOrder1 - 1)) && (TestCasePassHighLevelFlag == false)) {
                    TestCaseFailMap2StrCount++;
                }
            }

            return ((ReturnFlagMap1) && (ReturnFlagDiff) && (ReturnFlagMap2));
        }
        return false;
    }

    public static boolean ConformalMapTestCaseIntegr(long myTestCase, int Order, String Exprn, String expSimpleMap1, String exp, String expSimpleMap2, String AnsMap3, String IntegrAlone, String AnsMap4, Map<String, Double> variables, String DiffWithRespTo) {
        boolean ReturnFlag = false;
        boolean failFlag = false;
        boolean PassFlag = false;
        int ControlInt = 0;
        Expression expValue;
        Double[] DblexpValueOrg = new Double[8];
        Double[] DblexpValueMap1 = new Double[8];
        //String F(x) -> String F(y)
        String StrExprn = Exprn;
        String StrConMap1 = expSimpleMap1;
        String StrIntegr = exp;
        String StrConMap2 = expSimpleMap2;
        //F(x) -> F(y)
        String MappedExprn = Exprn.replaceAll(DiffWithRespTo, "y");
        String MappedConMap1 = StrConMap1.replaceAll(DiffWithRespTo, "y");
        String MappedIntegr = StrIntegr.replaceAll(DiffWithRespTo, "y");
        String MappedConMap2 = StrConMap2.replaceAll(DiffWithRespTo, "y");
        // Compare Value of Exprn with Mapped Exprn
        //Double DELTA = 0.0000000001;
        Double DELTA = 0.000001;
        Double valBase = -3.0;
        Double val = valBase;
        ControlInt = 1;
        for (int i = 0; i <= 7; i++) {
            switch (i) {
                case 0:
                    val = valBase;
                    break;
                case 1:
                    valBase++;
                    break;
                case 2:
                    valBase++;
                    break;
                case 3:
                    valBase++;
                    break;
                case 4:
                    valBase++;
                    break;
                case 5:
                    valBase++;
                    break;
                case 6:
                    valBase++;
                    break;
                case 7:
                    valBase++;
                    break;
            }
            for (int j = 0; j < 3; j++) {
                switch (j) {
                    case 0:
                        val = valBase;
                        break;
                    case 1:
                        val = valBase - DELTA;
                        break;
                    case 2:
                        val = valBase + DELTA;
                        break;
                }
                variables.put(DiffWithRespTo, val * 1.0);
                expValue = parse(Exprn, variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
                DblexpValueOrg[i] = expValue.eval();
                variables.put("y", val * 1.0);
                expValue = parse(MappedExprn, variables, "y", false, "Silent", LogLevel.Off);
                DblexpValueMap1[i] = expValue.eval();
                if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                        && (DblexpValueOrg[i].doubleValue() != DblexpValueMap1[i].doubleValue())) {
                    System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Exprn MappedExprn" + " Exprn=" + Exprn + " val=" + val + " x=" + variables.get(DiffWithRespTo) + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Exprn MappedExprn" + " MappedExprn=" + MappedExprn + " val=" + val + " y=" + variables.get("y") + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Exprn MappedExprn" + " DblexpValueOrg[i]=" + DblexpValueOrg[i].doubleValue() + " DblexpValueMap1[i]=" + DblexpValueMap1[i].doubleValue() + " val=" + val + " DELTA=" + DELTA + ConsoleColors.RESET);
                    failFlag = true;
                    break;
                } else if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                        && (DblexpValueOrg[i].doubleValue() == DblexpValueMap1[i].doubleValue())) {
                    PassFlag = true;
                }
            }
        }
        if ((PassFlag == true) && (failFlag == false)) {
            // Compare Value of Exprn with Mapped expSimpleMap1.SimpleExpr():Infer expSimpleMap1 Answer is RIGHT
            valBase = -3.0;
            val = valBase;
            ControlInt = 2;
            for (int i = 0; i <= 7; i++) {
                switch (i) {
                    case 0:
                        val = -3.0;
                        break;
                    case 1:
                        valBase++;
                        break;
                    case 2:
                        valBase++;
                        break;
                    case 3:
                        valBase++;
                        break;
                    case 4:
                        valBase++;
                        break;
                    case 5:
                        valBase++;
                        break;
                    case 6:
                        valBase++;
                        break;
                    case 7:
                        valBase++;
                        break;
                }
                for (int j = 0; j < 3; j++) {
                    switch (j) {
                        case 0:
                            val = valBase;
                            break;
                        case 1:
                            val = valBase - DELTA;
                            break;
                        case 2:
                            val = valBase + DELTA;
                            break;
                    }
                    variables.put(DiffWithRespTo, val * 1.0);
                    expValue = parse(Exprn, variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
                    DblexpValueOrg[i] = expValue.eval();

                    variables.put("y", val * 1.0);
                    expValue = parse(StrConMap1.replaceAll(DiffWithRespTo, "y"), variables, "y", false, "Silent", LogLevel.Off);
                    DblexpValueMap1[i] = expValue.eval();
                    if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() != DblexpValueMap1[i].doubleValue())) {
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Exprn expSimpleMap1" + " Exprn=" + Exprn + " val=" + val + " x=" + variables.get(DiffWithRespTo) + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Exprn expSimpleMap1" + " StrConMap1.replaceAll()=" + StrConMap1.replaceAll(DiffWithRespTo, "y") + " val=" + val + " y=" + variables.get("y") + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Exprn expSimpleMap1" + " DblexpValueOrg[i]=" + DblexpValueOrg[i].doubleValue() + " DblexpValueMap1[i]=" + DblexpValueMap1[i].doubleValue() + " val=" + val + " DELTA=" + DELTA + ConsoleColors.RESET);
                        failFlag = true;
                        break;
                    } else if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() == DblexpValueMap1[i].doubleValue())) {
                        PassFlag = true;
                    }
                }
            }
        }
        if ((PassFlag == true) && (failFlag == false)) {
            // Compare Value of expSimpleMap1 with Mapped MappedConMap1
            valBase = -3.0;
            val = valBase;
            ControlInt = 3;
            for (int i = 0; i <= 7; i++) {
                switch (i) {
                    case 0:
                        val = -3.0;
                        break;
                    case 1:
                        valBase++;
                        break;
                    case 2:
                        valBase++;
                        break;
                    case 3:
                        valBase++;
                        break;
                    case 4:
                        valBase++;
                        break;
                    case 5:
                        valBase++;
                        break;
                    case 6:
                        valBase++;
                        break;
                    case 7:
                        valBase++;
                        break;
                }
                for (int j = 0; j < 3; j++) {
                    switch (j) {
                        case 0:
                            val = valBase;
                            break;
                        case 1:
                            val = valBase - DELTA;
                            break;
                        case 2:
                            val = valBase + DELTA;
                            break;
                    }
                    variables.put(DiffWithRespTo, val * 1.0);
                    expValue = parse(expSimpleMap1, variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
                    DblexpValueOrg[i] = expValue.eval();

                    variables.put("y", val * 1.0);
                    expValue = parse(MappedConMap1, variables, "y", false, "Silent", LogLevel.Off);
                    DblexpValueMap1[i] = expValue.eval();
                    if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() != DblexpValueMap1[i].doubleValue())) {
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Simple Exprn Map1 MappedConMap1" + " expSimpleMap1.SimpleExpr()=" + expSimpleMap1 + " val=" + val + " x=" + variables.get(DiffWithRespTo) + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Simple Exprn Map1 MappedConMap1" + " MappedConMap1=" + MappedConMap1 + " val=" + val + " y=" + variables.get("y") + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Simple Exprn Map1 MappedConMap1" + " DblexpValueOrg[i]=" + DblexpValueOrg[i].doubleValue() + " DblexpValueMap1[i]=" + DblexpValueMap1[i].doubleValue() + " val=" + val + " DELTA=" + DELTA + ConsoleColors.RESET);
                        failFlag = true;
                        break;
                    } else if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() == DblexpValueMap1[i].doubleValue())) {
                        PassFlag = true;
                    }
                }
            }
        }
        if ((PassFlag == true) && (failFlag == false)) {
            // Compare Value of Integr exp.IntegrExpr() with Mapped MappedIntegr
            valBase = -3.0;
            val = valBase;
            ControlInt = 4;
            for (int i = 0; i <= 7; i++) {
                switch (i) {
                    case 0:
                        val = -3.0;
                        break;
                    case 1:
                        valBase++;
                        break;
                    case 2:
                        valBase++;
                        break;
                    case 3:
                        valBase++;
                        break;
                    case 4:
                        valBase++;
                        break;
                    case 5:
                        valBase++;
                        break;
                    case 6:
                        valBase++;
                        break;
                    case 7:
                        valBase++;
                        break;
                }
                for (int j = 0; j < 3; j++) {
                    switch (j) {
                        case 0:
                            val = valBase;
                            break;
                        case 1:
                            val = valBase - DELTA;
                            break;
                        case 2:
                            val = valBase + DELTA;
                            break;
                    }
                    variables.put(DiffWithRespTo, val * 1.0);
                    expValue = parse(exp, variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
                    DblexpValueOrg[i] = expValue.eval();

                    variables.put("y", val * 1.0);
                    expValue = parse(MappedIntegr, variables, "y", false, "Silent", LogLevel.Off);
                    DblexpValueMap1[i] = expValue.eval();
                    if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() != DblexpValueMap1[i].doubleValue())) {
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Integration MappedIntegr" + " exp.IntegrExpr()=" + exp + " val=" + val + " x=" + variables.get(DiffWithRespTo) + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Integration MappedIntegr" + " MappedIntegr=" + MappedIntegr + " val=" + val + " y=" + variables.get("y") + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Integration MappedIntegr" + " DblexpValueOrg[i]=" + DblexpValueOrg[i].doubleValue() + " DblexpValueMap1[i]=" + DblexpValueMap1[i].doubleValue() + " val=" + val + " DELTA=" + DELTA + ConsoleColors.RESET);
                        failFlag = true;
                        break;
                    } else if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() == DblexpValueMap1[i].doubleValue())) {
                        PassFlag = true;
                    }
                }
            }
        }
        if ((PassFlag == true) && (failFlag == false)) {
            // Compare Value of expSimpleMap2 with Mapped MappedConMap2
            valBase = -3.0;
            val = valBase;
            ControlInt = 5;
            for (int i = 0; i <= 7; i++) {
                switch (i) {
                    case 0:
                        val = -3.0;
                        break;
                    case 1:
                        valBase++;
                        break;
                    case 2:
                        valBase++;
                        break;
                    case 3:
                        valBase++;
                        break;
                    case 4:
                        valBase++;
                        break;
                    case 5:
                        valBase++;
                        break;
                    case 6:
                        valBase++;
                        break;
                    case 7:
                        valBase++;
                        break;
                }
                for (int j = 0; j < 3; j++) {
                    switch (j) {
                        case 0:
                            val = valBase;
                            break;
                        case 1:
                            val = valBase - DELTA;
                            break;
                        case 2:
                            val = valBase + DELTA;
                            break;
                    }
                    variables.put(DiffWithRespTo, val * 1.0);
                    expValue = parse(expSimpleMap2, variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
                    DblexpValueOrg[i] = expValue.eval();

                    variables.put("y", val * 1.0);
                    expValue = parse(MappedConMap2, variables, "y", false, "Silent", LogLevel.Off);
                    DblexpValueMap1[i] = expValue.eval();
                    if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() != DblexpValueMap1[i].doubleValue())) {
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Simple Exprn expSimpleMap2 MappedConMap2" + " expSimpleMap2.SimpleExpr()=" + expSimpleMap2 + " val=" + val + " x=" + variables.get(DiffWithRespTo) + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Simple Exprn expSimpleMap2 MappedConMap2" + " MappedConMap2=" + MappedConMap2 + " val=" + val + " y=" + variables.get("y") + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Simple Exprn expSimpleMap2 MappedConMap2" + " DblexpValueOrg[i]=" + DblexpValueOrg[i].doubleValue() + " DblexpValueMap1[i]=" + DblexpValueMap1[i].doubleValue() + " val=" + val + " DELTA=" + DELTA + ConsoleColors.RESET);
                        failFlag = true;
                        break;
                    } else if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() == DblexpValueMap1[i].doubleValue())) {
                        PassFlag = true;
                    }
                }
            }
        }
        if ((PassFlag == true) && (failFlag == false)) {
            // Compare Value of AnsMap3 with Mapped expSimpleMap1
            valBase = -3.0;
            val = valBase;
            ControlInt = 6;
            for (int i = 0; i <= 7; i++) {
                switch (i) {
                    case 0:
                        val = -3.0;
                        break;
                    case 1:
                        valBase++;
                        break;
                    case 2:
                        valBase++;
                        break;
                    case 3:
                        valBase++;
                        break;
                    case 4:
                        valBase++;
                        break;
                    case 5:
                        valBase++;
                        break;
                    case 6:
                        valBase++;
                        break;
                    case 7:
                        valBase++;
                        break;
                }
                for (int j = 0; j < 3; j++) {
                    switch (j) {
                        case 0:
                            val = valBase;
                            break;
                        case 1:
                            val = valBase - DELTA;
                            break;
                        case 2:
                            val = valBase + DELTA;
                            break;
                    }
                    variables.put(DiffWithRespTo, val * 1.0);
                    expValue = parse(AnsMap3, variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
                    DblexpValueOrg[i] = expValue.eval();

                    variables.put("y", val * 1.0);
                    expValue = parse(MappedConMap1, variables, "y", false, "Silent", LogLevel.Off);
                    DblexpValueMap1[i] = expValue.eval();

                    if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() != DblexpValueMap1[i].doubleValue())) {
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal AnsMap3 MappedConMap1 " + " AnsMap3=" + AnsMap3 + " val=" + val + " x=" + variables.get(DiffWithRespTo) + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal AnsMap3 MappedConMap1 " + " MappedConMap1=" + MappedConMap1 + " val=" + val + " y=" + variables.get("y") + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal AnsMap3 MappedConMap1 " + " DblexpValueOrg[i]=" + DblexpValueOrg[i].doubleValue() + " DblexpValueMap1[i]=" + DblexpValueMap1[i].doubleValue() + " val=" + val + " DELTA=" + DELTA + ConsoleColors.RESET);
                        failFlag = true;
                        break;
                    } else if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() == DblexpValueMap1[i].doubleValue())) {
                        PassFlag = true;
                    }
                }
            }
        }
        if ((PassFlag == true) && (failFlag == false)) {
            // Compare Value of IntegrAlone with Mapped exp
            valBase = -3.0;
            val = valBase;
            ControlInt = 7;
            for (int i = 0; i <= 7; i++) {
                switch (i) {
                    case 0:
                        val = -3.0;
                        break;
                    case 1:
                        valBase++;
                        break;
                    case 2:
                        valBase++;
                        break;
                    case 3:
                        valBase++;
                        break;
                    case 4:
                        valBase++;
                        break;
                    case 5:
                        valBase++;
                        break;
                    case 6:
                        valBase++;
                        break;
                    case 7:
                        valBase++;
                        break;
                }
                for (int j = 0; j < 3; j++) {
                    switch (j) {
                        case 0:
                            val = valBase;
                            break;
                        case 1:
                            val = valBase - DELTA;
                            break;
                        case 2:
                            val = valBase + DELTA;
                            break;
                    }
                    variables.put(DiffWithRespTo, val * 1.0);
                    expValue = parse(IntegrAlone, variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
                    DblexpValueOrg[i] = expValue.eval();

                    variables.put("y", val * 1.0);
                    expValue = parse(MappedIntegr, variables, "y", false, "Silent", LogLevel.Off);
                    DblexpValueMap1[i] = expValue.eval();
                    if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() != DblexpValueMap1[i].doubleValue())) {
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal IntegrAlone MappedIntegr" + " IntegrAlone=" + IntegrAlone + " val=" + val + " x=" + variables.get(DiffWithRespTo) + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal IntegrAlone MappedIntegr" + " MappedIntegr=" + MappedIntegr + " val=" + val + " y=" + variables.get("y") + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal IntegrAlone MappedIntegr" + " DblexpValueOrg[i]=" + DblexpValueOrg[i].doubleValue() + " DblexpValueMap1[i]=" + DblexpValueMap1[i].doubleValue() + " val=" + val + " DELTA=" + DELTA + ConsoleColors.RESET);
                        failFlag = true;
                        break;
                    } else if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() == DblexpValueMap1[i].doubleValue())) {
                        PassFlag = true;
                    }
                }
            }
        }
        if ((PassFlag == true) && (failFlag == false)) {
            // Compare Value of IntegrAlone with Mapped exp.IntegrExpr():Infer Integr Answer is RIGHT
            valBase = -3.0;
            val = valBase;
            ControlInt = 8;
            for (int i = 0; i <= 7; i++) {
                switch (i) {
                    case 0:
                        val = -3.0;
                        break;
                    case 1:
                        valBase++;
                        break;
                    case 2:
                        valBase++;
                        break;
                    case 3:
                        valBase++;
                        break;
                    case 4:
                        valBase++;
                        break;
                    case 5:
                        valBase++;
                        break;
                    case 6:
                        valBase++;
                        break;
                    case 7:
                        valBase++;
                        break;
                }
                for (int j = 0; j < 3; j++) {
                    switch (j) {
                        case 0:
                            val = valBase;
                            break;
                        case 1:
                            val = valBase - DELTA;
                            break;
                        case 2:
                            val = valBase + DELTA;
                            break;
                    }
                    variables.put(DiffWithRespTo, val * 1.0);
                    expValue = parse(IntegrAlone, variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
                    DblexpValueOrg[i] = expValue.eval();

                    expValue = parse(exp, variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
                    DblexpValueMap1[i] = expValue.eval();
                    if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() != DblexpValueMap1[i].doubleValue())) {
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal IntegrAlone exp.IntegrExpr()" + " IntegrAlone=" + IntegrAlone + " val=" + val + " x=" + variables.get(DiffWithRespTo) + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal IntegrAlone exp.IntegrExpr()" + " exp.IntegrExpr()=" + exp + " val=" + val + " y=" + variables.get("y") + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal IntegrAlone exp.IntegrExpr()" + " DblexpValueOrg[i]=" + DblexpValueOrg[i].doubleValue() + " DblexpValueMap1[i]=" + DblexpValueMap1[i].doubleValue() + " val=" + val + " DELTA=" + DELTA + ConsoleColors.RESET);
                        failFlag = true;
                        break;
                    } else if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() == DblexpValueMap1[i].doubleValue())) {
                        PassFlag = true;
                    }
                }
            }
        }
        if ((PassFlag == true) && (failFlag == false)) {
            // Compare Value of AnsMap2 with Mapped expSimpleMap2
            valBase = -3.0;
            val = valBase;
            ControlInt = 9;
            for (int i = 0; i <= 7; i++) {
                switch (i) {
                    case 0:
                        val = -3.0;
                        break;
                    case 1:
                        valBase++;
                        break;
                    case 2:
                        valBase++;
                        break;
                    case 3:
                        valBase++;
                        break;
                    case 4:
                        valBase++;
                        break;
                    case 5:
                        valBase++;
                        break;
                    case 6:
                        valBase++;
                        break;
                    case 7:
                        valBase++;
                        break;
                }
                for (int j = 0; j < 3; j++) {
                    switch (j) {
                        case 0:
                            val = valBase;
                            break;
                        case 1:
                            val = valBase - DELTA;
                            break;
                        case 2:
                            val = valBase + DELTA;
                            break;
                    }
                    variables.put(DiffWithRespTo, val * 1.0);
                    expValue = parse(AnsMap4, variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
                    DblexpValueOrg[i] = expValue.eval();

                    variables.put("y", val * 1.0);
                    expValue = parse(MappedConMap2, variables, "y", false, "Silent", LogLevel.Off);
                    DblexpValueMap1[i] = expValue.eval();

                    if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() != DblexpValueMap1[i].doubleValue())) {
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal Ans4 MappedConMap2" + " AnsMap4=" + AnsMap4 + " val=" + val + " x=" + variables.get(DiffWithRespTo) + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal Ans4 MappedConMap2" + " MappedConMap2=" + MappedConMap2 + " val=" + val + " y=" + variables.get("y") + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal Ans4 MappedConMap2" + " DblexpValueOrg[i]=" + DblexpValueOrg[i].doubleValue() + " DblexpValueMap1[i]=" + DblexpValueMap1[i].doubleValue() + " val=" + val + " DELTA=" + DELTA + ConsoleColors.RESET);
                        failFlag = true;
                        break;
                    } else if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() == DblexpValueMap1[i].doubleValue())) {
                        PassFlag = true;
                    }
                }
            }
        }
        if ((ControlInt < 9) && (ControlInt < 6) && (failFlag == false)) {
            ReturnFlag = (!failFlag);
        } else {
            ReturnFlag = PassFlag;
        }
        System.out.println("ConformalMapTestCaseIntegr:ReturnFlag=" + ReturnFlag + " ControlInt=" + ControlInt);
        return ReturnFlag;
    }

    public static boolean ConformalMapTestCaseDiff(long myTestCase, int Order, String Exprn, String expSimpleMap1, String exp, String expSimpleMap2, String AnsMap1, String DiffAlone, String AnsMap2, Map<String, Double> variables, String DiffWithRespTo) {
        boolean ReturnFlag = false;
        boolean failFlag = false;
        boolean PassFlag = false;
        int ControlInt = 0;
        Expression expValue;
        Double[] DblexpValueOrg = new Double[8];
        Double[] DblexpValueMap1 = new Double[8];
        //String F(x) -> String F(y)
        String StrExprn = Exprn;
        String StrConMap1 = expSimpleMap1;
        String StrDiff = exp;
        String StrConMap2 = expSimpleMap2;
        //F(x) -> F(y)
        String MappedExprn = Exprn.replaceAll(DiffWithRespTo, "y");
        String MappedConMap1 = StrConMap1.replaceAll(DiffWithRespTo, "y");
        String MappedDiff = StrDiff.replaceAll(DiffWithRespTo, "y");
        String MappedConMap2 = StrConMap2.replaceAll(DiffWithRespTo, "y");

        // Compare Value of Exprn with Mapped Exprn
        Double DELTA = 0.000001;
        Double valBase = -3.0;
        Double val = valBase;
        ControlInt = 1;
        for (int i = 0; i <= 7; i++) {
            switch (i) {
                case 0:
                    val = -3.0;
                    break;
                case 1:
                    valBase++;
                    break;
                case 2:
                    valBase++;
                    break;
                case 3:
                    valBase++;
                    break;
                case 4:
                    valBase++;
                    break;
                case 5:
                    valBase++;
                    break;
                case 6:
                    valBase++;
                    break;
                case 7:
                    valBase++;
                    break;
            }
            for (int j = 0; j < 3; j++) {
                switch (j) {
                    case 0:
                        val = valBase;
                        break;
                    case 1:
                        val = valBase - DELTA;
                        break;
                    case 2:
                        val = valBase + DELTA;
                        break;
                }
                variables.put(DiffWithRespTo, val * 1.0);
                expValue = parse(Exprn, variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
                DblexpValueOrg[i] = expValue.eval();

                variables.put("y", val * 1.0);
                expValue = parse(MappedExprn, variables, "y", false, "Silent", LogLevel.Off);
                DblexpValueMap1[i] = expValue.eval();
                if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                        && (DblexpValueOrg[i].doubleValue() != DblexpValueMap1[i].doubleValue())) {
                    System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Exprn MappedExprn" + " Exprn=" + Exprn + " val=" + val + " x=" + variables.get("x") + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Exprn MappedExprn" + " MappedExprn=" + MappedExprn + " val=" + val + " y=" + variables.get("y") + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Exprn MappedExprn" + " DblexpValueOrg[i]=" + DblexpValueOrg[i].doubleValue() + " DblexpValueMap1[i]=" + DblexpValueMap1[i].doubleValue() + " val=" + val + " DELTA=" + DELTA + ConsoleColors.RESET);
                    failFlag = true;
                    break;
                } else if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                        && (DblexpValueOrg[i].doubleValue() == DblexpValueMap1[i].doubleValue())) {
                    PassFlag = true;
                }
            }
        }
        if ((PassFlag == true) && (failFlag == false)) {
            // Compare Value of Exprn with Mapped expSimpleMap1.SimpleExpr():Infer expSimpleMap1 Answer is RIGHT
            valBase = -3.0;
            val = valBase;
            ControlInt = 2;
            for (int i = 0; i <= 7; i++) {
                switch (i) {
                    case 0:
                        val = -3.0;
                        break;
                    case 1:
                        valBase++;
                        break;
                    case 2:
                        valBase++;
                        break;
                    case 3:
                        valBase++;
                        break;
                    case 4:
                        valBase++;
                        break;
                    case 5:
                        valBase++;
                        break;
                    case 6:
                        valBase++;
                        break;
                    case 7:
                        valBase++;
                        break;
                }
                for (int j = 0; j < 3; j++) {
                    switch (j) {
                        case 0:
                            val = valBase;
                            break;
                        case 1:
                            val = valBase - DELTA;
                            break;
                        case 2:
                            val = valBase + DELTA;
                            break;
                    }
                    variables.put(DiffWithRespTo, val * 1.0);
                    expValue = parse(Exprn, variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
                    DblexpValueOrg[i] = expValue.eval();
                    variables.put("y", val * 1.0);
                    expValue = parse(StrConMap1.replaceAll(DiffWithRespTo, "y"), variables, "y", false, "Silent", LogLevel.Off);
                    DblexpValueMap1[i] = expValue.eval();

                    Double Number = 0.0;
                    Double NumberDiff = 0.0;
                    NumberFormat formatter = new DecimalFormat();
                    Number = expValue.eval().doubleValue();
                    formatter.setMaximumFractionDigits(MaximumCompFractionDigits);
                    String DiffVal = formatter.format(Number);
                    Number = expValue.eval().doubleValue();
                    formatter.setMaximumFractionDigits(MaximumCompFractionDigits);
                    String Simple = formatter.format(Number);

                    if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() != DblexpValueMap1[i].doubleValue())
                            && (!DiffVal.equalsIgnoreCase(Simple))) {
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Exprn expSimpleMap1" + " Exprn=" + Exprn + " val=" + val + " x=" + variables.get(DiffWithRespTo) + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Exprn expSimpleMap1" + " expSimpleMap1=" + StrConMap1.replaceAll(DiffWithRespTo, "y") + " val=" + val + " y=" + variables.get("y") + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Exprn expSimpleMap1" + " DblexpValueOrg[i]=" + DblexpValueOrg[i].doubleValue() + " DblexpValueMap1[i]=" + DblexpValueMap1[i].doubleValue() + " DiffVal=" + DiffVal + " Simple=" + Simple + " val=" + val + " DELTA=" + DELTA + ConsoleColors.RESET);
                        failFlag = true;
                        break;
                    } else if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() == DblexpValueMap1[i].doubleValue())) {
                        PassFlag = true;
                    }
                }
            }
        }
        if ((PassFlag == true) && (failFlag == false)) {
            // Compare Value of expSimpleMap1 with Mapped MappedConMap1
            valBase = -3.0;
            val = valBase;
            ControlInt = 3;
            for (int i = 0; i <= 7; i++) {
                switch (i) {
                    case 0:
                        val = -3.0;
                        break;
                    case 1:
                        valBase++;
                        break;
                    case 2:
                        valBase++;
                        break;
                    case 3:
                        valBase++;
                        break;
                    case 4:
                        valBase++;
                        break;
                    case 5:
                        valBase++;
                        break;
                    case 6:
                        valBase++;
                        break;
                    case 7:
                        valBase++;
                        break;
                }
                for (int j = 0; j < 3; j++) {
                    switch (j) {
                        case 0:
                            val = valBase;
                            break;
                        case 1:
                            val = valBase - DELTA;
                            break;
                        case 2:
                            val = valBase + DELTA;
                            break;
                    }
                    variables.put(DiffWithRespTo, val * 1.0);
                    expValue = parse(expSimpleMap1, variables, DiffWithRespTo, false, "Silent", LogLevel.Off);;
                    DblexpValueOrg[i] = expValue.eval();
                    variables.put("y", val * 1.0);
                    expValue = parse(MappedConMap1, variables, "y", false, "Silent", LogLevel.Off);
                    DblexpValueMap1[i] = expValue.eval();

                    if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() != DblexpValueMap1[i].doubleValue())) {
                        System.out.println(ConsoleColors.RED + "Simple Exprn Map1" + " expSimpleMap1.SimpleExpr()=" + expSimpleMap1 + " val=" + val + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "Simple Exprn Map1" + " MappedConMap1=" + MappedConMap1 + " val=" + val + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "Simple Exprn Map1" + " DblexpValueOrg[i]=" + DblexpValueOrg[i].doubleValue() + " DblexpValueMap1[i]=" + DblexpValueMap1[i].doubleValue() + " val=" + val + " DELTA=" + DELTA + ConsoleColors.RESET);
                        failFlag = true;
                        break;
                    } else if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() == DblexpValueMap1[i].doubleValue())) {
                        PassFlag = true;
                    }
                }
            }
        }
        if ((PassFlag == true) && (failFlag == false)) {
            // Compare Value of Diff exp.DiffExpr() with Mapped MappedDiff
            valBase = -3.0;
            val = valBase;
            ControlInt = 4;
            for (int i = 0; i <= 7; i++) {
                switch (i) {
                    case 0:
                        val = -3.0;
                        break;
                    case 1:
                        valBase++;
                        break;
                    case 2:
                        valBase++;
                        break;
                    case 3:
                        valBase++;
                        break;
                    case 4:
                        valBase++;
                        break;
                    case 5:
                        valBase++;
                        break;
                    case 6:
                        valBase++;
                        break;
                    case 7:
                        valBase++;
                        break;
                }
                for (int j = 0; j < 3; j++) {
                    switch (j) {
                        case 0:
                            val = valBase;
                            break;
                        case 1:
                            val = valBase - DELTA;
                            break;
                        case 2:
                            val = valBase + DELTA;
                            break;
                    }
                    variables.put(DiffWithRespTo, val * 1.0);
                    expValue = parse(exp, variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
                    DblexpValueOrg[i] = expValue.eval();
                    variables.put("y", val * 1.0);
                    expValue = parse(MappedDiff, variables, "y", false, "Silent", LogLevel.Off);
                    DblexpValueMap1[i] = expValue.eval();
                    if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() != DblexpValueMap1[i].doubleValue())) {
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Diffr MappedDiff" + " exp.DiffExpr()=" + exp + " val=" + val + " x=" + variables.get(DiffWithRespTo) + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Diffr MappedDiff" + " MappedDiff=" + MappedDiff + " val=" + val + " y=" + variables.get("y") + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Diffr MappedDiff" + " DblexpValueOrg[i]=" + DblexpValueOrg[i].doubleValue() + " DblexpValueMap1[i]=" + DblexpValueMap1[i].doubleValue() + " val=" + val + " DELTA=" + DELTA + ConsoleColors.RESET);
                        failFlag = true;
                        break;
                    } else if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() == DblexpValueMap1[i].doubleValue())) {
                        PassFlag = true;
                    }
                }
            }
        }
        if ((PassFlag == true) && (failFlag == false)) {
            // Compare Value of expSimpleMap2 with Mapped MappedConMap2
            valBase = -3.0;
            val = valBase;
            ControlInt = 5;
            for (int i = 0; i <= 7; i++) {
                switch (i) {
                    case 0:
                        val = -3.0;
                        break;
                    case 1:
                        valBase++;
                        break;
                    case 2:
                        valBase++;
                        break;
                    case 3:
                        valBase++;
                        break;
                    case 4:
                        valBase++;
                        break;
                    case 5:
                        valBase++;
                        break;
                    case 6:
                        valBase++;
                        break;
                    case 7:
                        valBase++;
                        break;
                }
                for (int j = 0; j < 3; j++) {
                    switch (j) {
                        case 0:
                            val = valBase;
                            break;
                        case 1:
                            val = valBase - DELTA;
                            break;
                        case 2:
                            val = valBase + DELTA;
                            break;
                    }
                    variables.put(DiffWithRespTo, val * 1.0);
                    expValue = parse(expSimpleMap2, variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
                    DblexpValueOrg[i] = expValue.eval();
                    variables.put("y", val * 1.0);
                    expValue = parse(MappedConMap2, variables, "y", false, "Silent", LogLevel.Off);
                    DblexpValueMap1[i] = expValue.eval();

                    if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() != DblexpValueMap1[i].doubleValue())) {
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Simple Map2 MappedConMap2" + " expSimpleMap2.SimpleExpr()=" + expSimpleMap2 + " val=" + val + " x=" + variables.get(DiffWithRespTo) + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Simple Map2 MappedConMap2" + " MappedConMap2=" + MappedConMap2 + " val=" + val + " y=" + variables.get("y") + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Simple Map2 MappedConMap2" + " DblexpValueOrg[i]=" + DblexpValueOrg[i].doubleValue() + " DblexpValueMap1[i]=" + DblexpValueMap1[i].doubleValue() + " val=" + val + " DELTA=" + DELTA + ConsoleColors.RESET);
                        failFlag = true;
                        break;
                    } else if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() == DblexpValueMap1[i].doubleValue())) {
                        PassFlag = true;
                    }
                }
            }
        }
        if ((PassFlag == true) && (failFlag == false)) {
            // Compare Value of AnsMap1 with Mapped expSimpleMap1
            valBase = -3.0;
            val = valBase;
            ControlInt = 6;
            for (int i = 0; i <= 7; i++) {
                switch (i) {
                    case 0:
                        val = -3.0;
                        break;
                    case 1:
                        valBase++;
                        break;
                    case 2:
                        valBase++;
                        break;
                    case 3:
                        valBase++;
                        break;
                    case 4:
                        valBase++;
                        break;
                    case 5:
                        valBase++;
                        break;
                    case 6:
                        valBase++;
                        break;
                    case 7:
                        valBase++;
                        break;
                }
                for (int j = 0; j < 3; j++) {
                    switch (j) {
                        case 0:
                            val = valBase;
                            break;
                        case 1:
                            val = valBase - DELTA;
                            break;
                        case 2:
                            val = valBase + DELTA;
                            break;
                    }
                    variables.put(DiffWithRespTo, val * 1.0);
                    expValue = parse(AnsMap1, variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
                    DblexpValueOrg[i] = expValue.eval();
                    variables.put("y", val * 1.0);
                    expValue = parse(MappedConMap1, variables, "y", false, "Silent", LogLevel.Off);
                    DblexpValueMap1[i] = expValue.eval();

                    if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() != DblexpValueMap1[i].doubleValue())) {
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal Ans1 Map1  " + " AnsMap1=" + AnsMap1 + " val=" + val + " x=" + variables.get(DiffWithRespTo) + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal Ans1 Map1  " + " MappedConMap1=" + MappedConMap1 + " val=" + val + " y=" + variables.get("y") + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal Ans1 Map1  " + " DblexpValueOrg[i]=" + DblexpValueOrg[i].doubleValue() + " DblexpValueMap1[i]=" + DblexpValueMap1[i].doubleValue() + " val=" + val + " DELTA=" + DELTA + ConsoleColors.RESET);
                        failFlag = true;
                        break;
                    } else if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() == DblexpValueMap1[i].doubleValue())) {
                        PassFlag = true;
                    }
                }
            }
        }
        if ((PassFlag == true) && (failFlag == false)) {
            // Compare Value of DiffAlone with Mapped exp.DiffExpr():Infer Diff Answer is RIGHT
            valBase = -3.0;
            val = valBase;
            ControlInt = 7;
            for (int i = 0; i <= 7; i++) {
                switch (i) {
                    case 0:
                        val = -3.0;
                        break;
                    case 1:
                        valBase++;
                        break;
                    case 2:
                        valBase++;
                        break;
                    case 3:
                        valBase++;
                        break;
                    case 4:
                        valBase++;
                        break;
                    case 5:
                        valBase++;
                        break;
                    case 6:
                        valBase++;
                        break;
                    case 7:
                        valBase++;
                        break;
                }
                for (int j = 0; j < 3; j++) {
                    switch (j) {
                        case 0:
                            val = valBase;
                            break;
                        case 1:
                            val = valBase - DELTA;
                            break;
                        case 2:
                            val = valBase + DELTA;
                            break;
                    }
                    variables.put(DiffWithRespTo, val * 1.0);
                    expValue = parse(DiffAlone, variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
                    DblexpValueOrg[i] = expValue.eval();
                    variables.put("y", val * 1.0);
                    expValue = parse(StrDiff.replaceAll(DiffWithRespTo, "y"), variables, "y", false, "Silent", LogLevel.Off);
                    DblexpValueMap1[i] = expValue.eval();

                    Double Number = 0.0;
                    Double NumberDiff = 0.0;
                    NumberFormat formatter = new DecimalFormat();
                    Number = expValue.eval().doubleValue();
                    formatter.setMaximumFractionDigits(MaximumCompFractionDigits);
                    String DiffVal = formatter.format(Number);
                    Number = expValue.eval().doubleValue();
                    formatter.setMaximumFractionDigits(MaximumCompFractionDigits);
                    String Simple = formatter.format(Number);

                    if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() != DblexpValueMap1[i].doubleValue())
                            && (!DiffVal.equalsIgnoreCase(Simple))) {
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal DiffAlone Diff" + " DiffAlone=" + DiffAlone + " val=" + val + " x=" + variables.get(DiffWithRespTo) + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal DiffAlone Diff" + " StrDiff.replaceAll()=" + StrDiff.replaceAll(DiffWithRespTo, "y") + " val=" + val + " y=" + variables.get("y") + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal DiffAlone Diff" + " DblexpValueOrg[i]=" + DblexpValueOrg[i].doubleValue() + " DblexpValueMap1[i]=" + DblexpValueMap1[i].doubleValue() + " DiffVal=" + DiffVal + " Simple=" + Simple + " val=" + val + " DELTA=" + DELTA + ConsoleColors.RESET);
                        failFlag = true;
                        break;
                    } else if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() == DblexpValueMap1[i].doubleValue())) {
                        PassFlag = true;
                    }
                }
            }
        }
        if ((PassFlag == true) && (failFlag == false)) {
            // Compare Value of DiffAlone with Mapped exp
            valBase = -3.0;
            val = valBase;
            ControlInt = 8;
            for (int i = 0; i <= 7; i++) {
                switch (i) {
                    case 0:
                        val = -3.0;
                        break;
                    case 1:
                        valBase++;
                        break;
                    case 2:
                        valBase++;
                        break;
                    case 3:
                        valBase++;
                        break;
                    case 4:
                        valBase++;
                        break;
                    case 5:
                        valBase++;
                        break;
                    case 6:
                        valBase++;
                        break;
                    case 7:
                        valBase++;
                        break;
                }
                for (int j = 0; j < 3; j++) {
                    switch (j) {
                        case 0:
                            val = valBase;
                            break;
                        case 1:
                            val = valBase - DELTA;
                            break;
                        case 2:
                            val = valBase + DELTA;
                            break;
                    }
                    variables.put(DiffWithRespTo, val * 1.0);
                    expValue = parse(DiffAlone, variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
                    DblexpValueOrg[i] = expValue.eval();
                    variables.put("y", val * 1.0);
                    expValue = parse(MappedDiff, variables, "y", false, "Silent", LogLevel.Off);
                    DblexpValueMap1[i] = expValue.eval();
                    if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() != DblexpValueMap1[i].doubleValue())) {
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal DiffAlone MappedDiff" + " DiffAlone=" + DiffAlone + " val=" + val + " x=" + variables.get(DiffWithRespTo) + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal DiffAlone MappedDiff" + " MappedDiff=" + MappedDiff + " val=" + val + " y=" + variables.get("y") + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal DiffAlone MappedDiff" + " DblexpValueOrg[i]=" + DblexpValueOrg[i].doubleValue() + " DblexpValueMap1[i]=" + DblexpValueMap1[i].doubleValue() + " val=" + val + " DELTA=" + DELTA + ConsoleColors.RESET);
                        failFlag = true;
                        break;
                    } else if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() == DblexpValueMap1[i].doubleValue())) {
                        PassFlag = true;
                    }
                }
            }
        }
        if ((PassFlag == true) && (failFlag == false)) {
            // Compare Value of AnsMap2 with Mapped expSimpleMap2
            valBase = -3.0;
            val = valBase;
            ControlInt = 9;
            for (int i = 0; i <= 7; i++) {
                switch (i) {
                    case 0:
                        val = -3.0;
                        break;
                    case 1:
                        valBase++;
                        break;
                    case 2:
                        valBase++;
                        break;
                    case 3:
                        valBase++;
                        break;
                    case 4:
                        valBase++;
                        break;
                    case 5:
                        valBase++;
                        break;
                    case 6:
                        valBase++;
                        break;
                    case 7:
                        valBase++;
                        break;
                }
                for (int j = 0; j < 3; j++) {
                    switch (j) {
                        case 0:
                            val = valBase;
                            break;
                        case 1:
                            val = valBase - DELTA;
                            break;
                        case 2:
                            val = valBase + DELTA;
                            break;
                    }
                    variables.put(DiffWithRespTo, val * 1.0);
                    expValue = parse(AnsMap2, variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
                    DblexpValueOrg[i] = expValue.eval();
                    variables.put("y", val * 1.0);
                    expValue = parse(MappedConMap2, variables, "y", false, "Silent", LogLevel.Off);
                    DblexpValueMap1[i] = expValue.eval();

                    if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() != DblexpValueMap1[i].doubleValue())) {
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal Ans2 MappedConMap2" + " AnsMap2=" + AnsMap2 + " val=" + val + " x=" + variables.get(DiffWithRespTo) + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal Ans2 MappedConMap2" + " MappedConMap2=" + MappedConMap2 + " val=" + val + " y=" + variables.get("y") + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal Ans2 MappedConMap2" + " DblexpValueOrg[i]=" + DblexpValueOrg[i].doubleValue() + " DblexpValueMap1[i]=" + DblexpValueMap1[i].doubleValue() + " val=" + val + " DELTA=" + DELTA + ConsoleColors.RESET);
                        failFlag = true;
                        break;
                    } else if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() == DblexpValueMap1[i].doubleValue())) {
                        PassFlag = true;
                    }
                }
            }
        }
        if ((ControlInt < 9) && (ControlInt < 6) && (failFlag == false)) {
            ReturnFlag = (!failFlag);
        } else {
            ReturnFlag = PassFlag;
        }
        System.out.println("ConformalMapTestCaseDiff:ReturnFlag=" + ReturnFlag + " ControlInt=" + ControlInt);
        return ReturnFlag;
    }

    public static boolean ConformalMapTestCaseIntegr(int myTestCase, int Order, String Exprn, ExprSimpleStrSep.SimpleStr expSimpleMap1, Calculus.DiffrIntegrSep.IntegrExpr exp, ExprSimpleStrSep.SimpleStr expSimpleMap2, String AnsMap3, String IntegrAlone, String AnsMap4, Map<String, Double> variables, String DiffWithRespTo) {
        boolean ReturnFlag = false;
        boolean failFlag = false;
        boolean PassFlag = false;
        int ControlInt = 0;
        Expression expValue;
        Double[] DblexpValueOrg = new Double[8];
        Double[] DblexpValueMap1 = new Double[8];
        //String F(x) -> String F(y)
        String StrExprn = Exprn;
        String StrConMap1 = expSimpleMap1.evalStr();
        String StrIntegr = exp.IntegrExpr();
        String StrConMap2 = expSimpleMap2.evalStr();
        //F(x) -> F(y)
        String MappedExprn = Exprn.replaceAll(DiffWithRespTo, "y");
        String MappedConMap1 = StrConMap1.replaceAll(DiffWithRespTo, "y");
        String MappedIntegr = StrIntegr.replaceAll(DiffWithRespTo, "y");
        String MappedConMap2 = StrConMap2.replaceAll(DiffWithRespTo, "y");
        // Compare Value of Exprn with Mapped Exprn
        //Double DELTA = 0.0000000001;
        Double DELTA = 0.000001;
        Double valBase = -3.0;
        Double val = valBase;
        ControlInt = 1;
        for (int i = 0; i <= 7; i++) {
            switch (i) {
                case 0:
                    val = valBase;
                    break;
                case 1:
                    valBase++;
                    break;
                case 2:
                    valBase++;
                    break;
                case 3:
                    valBase++;
                    break;
                case 4:
                    valBase++;
                    break;
                case 5:
                    valBase++;
                    break;
                case 6:
                    valBase++;
                    break;
                case 7:
                    valBase++;
                    break;
            }
            for (int j = 0; j < 3; j++) {
                switch (j) {
                    case 0:
                        val = valBase;
                        break;
                    case 1:
                        val = valBase - DELTA;
                        break;
                    case 2:
                        val = valBase + DELTA;
                        break;
                }
                variables.put(DiffWithRespTo, val * 1.0);
                expValue = parse(Exprn, variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
                DblexpValueOrg[i] = expValue.eval();
                variables.put("y", val * 1.0);
                expValue = parse(MappedExprn, variables, "y", false, "Silent", LogLevel.Off);
                DblexpValueMap1[i] = expValue.eval();
                if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                        && (DblexpValueOrg[i].doubleValue() != DblexpValueMap1[i].doubleValue())) {
                    System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Exprn MappedExprn" + " Exprn=" + Exprn + " val=" + val + " x=" + variables.get(DiffWithRespTo) + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Exprn MappedExprn" + " MappedExprn=" + MappedExprn + " val=" + val + " y=" + variables.get("y") + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Exprn MappedExprn" + " DblexpValueOrg[i]=" + DblexpValueOrg[i].doubleValue() + " DblexpValueMap1[i]=" + DblexpValueMap1[i].doubleValue() + " val=" + val + " DELTA=" + DELTA + ConsoleColors.RESET);
                    failFlag = true;
                    break;
                } else if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                        && (DblexpValueOrg[i].doubleValue() == DblexpValueMap1[i].doubleValue())) {
                    PassFlag = true;
                }
            }
        }
        if ((PassFlag == true) && (failFlag == false)) {
            // Compare Value of Exprn with Mapped expSimpleMap1.SimpleExpr():Infer expSimpleMap1 Answer is RIGHT
            valBase = -3.0;
            val = valBase;
            ControlInt = 2;
            for (int i = 0; i <= 7; i++) {
                switch (i) {
                    case 0:
                        val = -3.0;
                        break;
                    case 1:
                        valBase++;
                        break;
                    case 2:
                        valBase++;
                        break;
                    case 3:
                        valBase++;
                        break;
                    case 4:
                        valBase++;
                        break;
                    case 5:
                        valBase++;
                        break;
                    case 6:
                        valBase++;
                        break;
                    case 7:
                        valBase++;
                        break;
                }
                for (int j = 0; j < 3; j++) {
                    switch (j) {
                        case 0:
                            val = valBase;
                            break;
                        case 1:
                            val = valBase - DELTA;
                            break;
                        case 2:
                            val = valBase + DELTA;
                            break;
                    }
                    variables.put(DiffWithRespTo, val * 1.0);
                    expValue = parse(Exprn, variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
                    DblexpValueOrg[i] = expValue.eval();

                    variables.put("y", val * 1.0);
                    expValue = parse(StrConMap1.replaceAll(DiffWithRespTo, "y"), variables, "y", false, "Silent", LogLevel.Off);
                    DblexpValueMap1[i] = expValue.eval();
                    if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() != DblexpValueMap1[i].doubleValue())) {
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Exprn expSimpleMap1" + " Exprn=" + Exprn + " val=" + val + " x=" + variables.get(DiffWithRespTo) + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Exprn expSimpleMap1" + " StrConMap1.replaceAll()=" + StrConMap1.replaceAll(DiffWithRespTo, "y") + " val=" + val + " y=" + variables.get("y") + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Exprn expSimpleMap1" + " DblexpValueOrg[i]=" + DblexpValueOrg[i].doubleValue() + " DblexpValueMap1[i]=" + DblexpValueMap1[i].doubleValue() + " val=" + val + " DELTA=" + DELTA + ConsoleColors.RESET);
                        failFlag = true;
                        break;
                    } else if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() == DblexpValueMap1[i].doubleValue())) {
                        PassFlag = true;
                    }
                }
            }
        }
        if ((PassFlag == true) && (failFlag == false)) {
            // Compare Value of expSimpleMap1 with Mapped MappedConMap1
            valBase = -3.0;
            val = valBase;
            ControlInt = 3;
            for (int i = 0; i <= 7; i++) {
                switch (i) {
                    case 0:
                        val = -3.0;
                        break;
                    case 1:
                        valBase++;
                        break;
                    case 2:
                        valBase++;
                        break;
                    case 3:
                        valBase++;
                        break;
                    case 4:
                        valBase++;
                        break;
                    case 5:
                        valBase++;
                        break;
                    case 6:
                        valBase++;
                        break;
                    case 7:
                        valBase++;
                        break;
                }
                for (int j = 0; j < 3; j++) {
                    switch (j) {
                        case 0:
                            val = valBase;
                            break;
                        case 1:
                            val = valBase - DELTA;
                            break;
                        case 2:
                            val = valBase + DELTA;
                            break;
                    }
                    variables.put(DiffWithRespTo, val * 1.0);
                    expValue = parse(expSimpleMap1.evalStr(), variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
                    DblexpValueOrg[i] = expValue.eval();

                    variables.put("y", val * 1.0);
                    expValue = parse(MappedConMap1, variables, "y", false, "Silent", LogLevel.Off);
                    DblexpValueMap1[i] = expValue.eval();
                    if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() != DblexpValueMap1[i].doubleValue())) {
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Simple Exprn Map1 MappedConMap1" + " expSimpleMap1.SimpleExpr()=" + expSimpleMap1.evalStr() + " val=" + val + " x=" + variables.get(DiffWithRespTo) + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Simple Exprn Map1 MappedConMap1" + " MappedConMap1=" + MappedConMap1 + " val=" + val + " y=" + variables.get("y") + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Simple Exprn Map1 MappedConMap1" + " DblexpValueOrg[i]=" + DblexpValueOrg[i].doubleValue() + " DblexpValueMap1[i]=" + DblexpValueMap1[i].doubleValue() + " val=" + val + " DELTA=" + DELTA + ConsoleColors.RESET);
                        failFlag = true;
                        break;
                    } else if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() == DblexpValueMap1[i].doubleValue())) {
                        PassFlag = true;
                    }
                }
            }
        }
        if ((PassFlag == true) && (failFlag == false)) {
            // Compare Value of Integr exp.IntegrExpr() with Mapped MappedIntegr
            valBase = -3.0;
            val = valBase;
            ControlInt = 4;
            for (int i = 0; i <= 7; i++) {
                switch (i) {
                    case 0:
                        val = -3.0;
                        break;
                    case 1:
                        valBase++;
                        break;
                    case 2:
                        valBase++;
                        break;
                    case 3:
                        valBase++;
                        break;
                    case 4:
                        valBase++;
                        break;
                    case 5:
                        valBase++;
                        break;
                    case 6:
                        valBase++;
                        break;
                    case 7:
                        valBase++;
                        break;
                }
                for (int j = 0; j < 3; j++) {
                    switch (j) {
                        case 0:
                            val = valBase;
                            break;
                        case 1:
                            val = valBase - DELTA;
                            break;
                        case 2:
                            val = valBase + DELTA;
                            break;
                    }
                    variables.put(DiffWithRespTo, val * 1.0);
                    expValue = parse(exp.IntegrExpr(), variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
                    DblexpValueOrg[i] = expValue.eval();

                    variables.put("y", val * 1.0);
                    expValue = parse(MappedIntegr, variables, "y", false, "Silent", LogLevel.Off);
                    DblexpValueMap1[i] = expValue.eval();
                    if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() != DblexpValueMap1[i].doubleValue())) {
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Integration MappedIntegr" + " exp.IntegrExpr()=" + exp.IntegrExpr() + " val=" + val + " x=" + variables.get(DiffWithRespTo) + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Integration MappedIntegr" + " MappedIntegr=" + MappedIntegr + " val=" + val + " y=" + variables.get("y") + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Integration MappedIntegr" + " DblexpValueOrg[i]=" + DblexpValueOrg[i].doubleValue() + " DblexpValueMap1[i]=" + DblexpValueMap1[i].doubleValue() + " val=" + val + " DELTA=" + DELTA + ConsoleColors.RESET);
                        failFlag = true;
                        break;
                    } else if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() == DblexpValueMap1[i].doubleValue())) {
                        PassFlag = true;
                    }
                }
            }
        }
        if ((PassFlag == true) && (failFlag == false)) {
            // Compare Value of expSimpleMap2 with Mapped MappedConMap2
            valBase = -3.0;
            val = valBase;
            ControlInt = 5;
            for (int i = 0; i <= 7; i++) {
                switch (i) {
                    case 0:
                        val = -3.0;
                        break;
                    case 1:
                        valBase++;
                        break;
                    case 2:
                        valBase++;
                        break;
                    case 3:
                        valBase++;
                        break;
                    case 4:
                        valBase++;
                        break;
                    case 5:
                        valBase++;
                        break;
                    case 6:
                        valBase++;
                        break;
                    case 7:
                        valBase++;
                        break;
                }
                for (int j = 0; j < 3; j++) {
                    switch (j) {
                        case 0:
                            val = valBase;
                            break;
                        case 1:
                            val = valBase - DELTA;
                            break;
                        case 2:
                            val = valBase + DELTA;
                            break;
                    }
                    variables.put(DiffWithRespTo, val * 1.0);
                    expValue = parse(expSimpleMap2.evalStr(), variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
                    DblexpValueOrg[i] = expValue.eval();

                    variables.put("y", val * 1.0);
                    expValue = parse(MappedConMap2, variables, "y", false, "Silent", LogLevel.Off);
                    DblexpValueMap1[i] = expValue.eval();
                    if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() != DblexpValueMap1[i].doubleValue())) {
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Simple Exprn expSimpleMap2 MappedConMap2" + " expSimpleMap2.SimpleExpr()=" + expSimpleMap2.evalStr() + " val=" + val + " x=" + variables.get(DiffWithRespTo) + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Simple Exprn expSimpleMap2 MappedConMap2" + " MappedConMap2=" + MappedConMap2 + " val=" + val + " y=" + variables.get("y") + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Simple Exprn expSimpleMap2 MappedConMap2" + " DblexpValueOrg[i]=" + DblexpValueOrg[i].doubleValue() + " DblexpValueMap1[i]=" + DblexpValueMap1[i].doubleValue() + " val=" + val + " DELTA=" + DELTA + ConsoleColors.RESET);
                        failFlag = true;
                        break;
                    } else if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() == DblexpValueMap1[i].doubleValue())) {
                        PassFlag = true;
                    }
                }
            }
        }
        if ((PassFlag == true) && (failFlag == false)) {
            // Compare Value of AnsMap3 with Mapped expSimpleMap1
            valBase = -3.0;
            val = valBase;
            ControlInt = 6;
            for (int i = 0; i <= 7; i++) {
                switch (i) {
                    case 0:
                        val = -3.0;
                        break;
                    case 1:
                        valBase++;
                        break;
                    case 2:
                        valBase++;
                        break;
                    case 3:
                        valBase++;
                        break;
                    case 4:
                        valBase++;
                        break;
                    case 5:
                        valBase++;
                        break;
                    case 6:
                        valBase++;
                        break;
                    case 7:
                        valBase++;
                        break;
                }
                for (int j = 0; j < 3; j++) {
                    switch (j) {
                        case 0:
                            val = valBase;
                            break;
                        case 1:
                            val = valBase - DELTA;
                            break;
                        case 2:
                            val = valBase + DELTA;
                            break;
                    }
                    variables.put(DiffWithRespTo, val * 1.0);
                    expValue = parse(AnsMap3, variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
                    DblexpValueOrg[i] = expValue.eval();

                    variables.put("y", val * 1.0);
                    expValue = parse(MappedConMap1, variables, "y", false, "Silent", LogLevel.Off);
                    DblexpValueMap1[i] = expValue.eval();

                    if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() != DblexpValueMap1[i].doubleValue())) {
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal AnsMap3 MappedConMap1 " + " AnsMap3=" + AnsMap3 + " val=" + val + " x=" + variables.get(DiffWithRespTo) + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal AnsMap3 MappedConMap1 " + " MappedConMap1=" + MappedConMap1 + " val=" + val + " y=" + variables.get("y") + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal AnsMap3 MappedConMap1 " + " DblexpValueOrg[i]=" + DblexpValueOrg[i].doubleValue() + " DblexpValueMap1[i]=" + DblexpValueMap1[i].doubleValue() + " val=" + val + " DELTA=" + DELTA + ConsoleColors.RESET);
                        failFlag = true;
                        break;
                    } else if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() == DblexpValueMap1[i].doubleValue())) {
                        PassFlag = true;
                    }
                }
            }
        }
        if ((PassFlag == true) && (failFlag == false)) {
            // Compare Value of IntegrAlone with Mapped exp
            valBase = -3.0;
            val = valBase;
            ControlInt = 7;
            for (int i = 0; i <= 7; i++) {
                switch (i) {
                    case 0:
                        val = -3.0;
                        break;
                    case 1:
                        valBase++;
                        break;
                    case 2:
                        valBase++;
                        break;
                    case 3:
                        valBase++;
                        break;
                    case 4:
                        valBase++;
                        break;
                    case 5:
                        valBase++;
                        break;
                    case 6:
                        valBase++;
                        break;
                    case 7:
                        valBase++;
                        break;
                }
                for (int j = 0; j < 3; j++) {
                    switch (j) {
                        case 0:
                            val = valBase;
                            break;
                        case 1:
                            val = valBase - DELTA;
                            break;
                        case 2:
                            val = valBase + DELTA;
                            break;
                    }
                    variables.put(DiffWithRespTo, val * 1.0);
                    expValue = parse(IntegrAlone, variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
                    DblexpValueOrg[i] = expValue.eval();

                    variables.put("y", val * 1.0);
                    expValue = parse(MappedIntegr, variables, "y", false, "Silent", LogLevel.Off);
                    DblexpValueMap1[i] = expValue.eval();
                    if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() != DblexpValueMap1[i].doubleValue())) {
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal IntegrAlone MappedIntegr" + " IntegrAlone=" + IntegrAlone + " val=" + val + " x=" + variables.get(DiffWithRespTo) + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal IntegrAlone MappedIntegr" + " MappedIntegr=" + MappedIntegr + " val=" + val + " y=" + variables.get("y") + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal IntegrAlone MappedIntegr" + " DblexpValueOrg[i]=" + DblexpValueOrg[i].doubleValue() + " DblexpValueMap1[i]=" + DblexpValueMap1[i].doubleValue() + " val=" + val + " DELTA=" + DELTA + ConsoleColors.RESET);
                        failFlag = true;
                        break;
                    } else if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() == DblexpValueMap1[i].doubleValue())) {
                        PassFlag = true;
                    }
                }
            }
        }
        if ((PassFlag == true) && (failFlag == false)) {
            // Compare Value of IntegrAlone with Mapped exp.IntegrExpr():Infer Integr Answer is RIGHT
            valBase = -3.0;
            val = valBase;
            ControlInt = 8;
            for (int i = 0; i <= 7; i++) {
                switch (i) {
                    case 0:
                        val = -3.0;
                        break;
                    case 1:
                        valBase++;
                        break;
                    case 2:
                        valBase++;
                        break;
                    case 3:
                        valBase++;
                        break;
                    case 4:
                        valBase++;
                        break;
                    case 5:
                        valBase++;
                        break;
                    case 6:
                        valBase++;
                        break;
                    case 7:
                        valBase++;
                        break;
                }
                for (int j = 0; j < 3; j++) {
                    switch (j) {
                        case 0:
                            val = valBase;
                            break;
                        case 1:
                            val = valBase - DELTA;
                            break;
                        case 2:
                            val = valBase + DELTA;
                            break;
                    }
                    variables.put(DiffWithRespTo, val * 1.0);
                    expValue = parse(IntegrAlone, variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
                    DblexpValueOrg[i] = expValue.eval();

                    expValue = parse(exp.IntegrExpr(), variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
                    DblexpValueMap1[i] = expValue.eval();
                    if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() != DblexpValueMap1[i].doubleValue())) {
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal IntegrAlone exp.IntegrExpr()" + " IntegrAlone=" + IntegrAlone + " val=" + val + " x=" + variables.get(DiffWithRespTo) + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal IntegrAlone exp.IntegrExpr()" + " exp.IntegrExpr()=" + exp.IntegrExpr() + " val=" + val + " y=" + variables.get("y") + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal IntegrAlone exp.IntegrExpr()" + " DblexpValueOrg[i]=" + DblexpValueOrg[i].doubleValue() + " DblexpValueMap1[i]=" + DblexpValueMap1[i].doubleValue() + " val=" + val + " DELTA=" + DELTA + ConsoleColors.RESET);
                        failFlag = true;
                        break;
                    } else if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() == DblexpValueMap1[i].doubleValue())) {
                        PassFlag = true;
                    }
                }
            }
        }
        if ((PassFlag == true) && (failFlag == false)) {
            // Compare Value of AnsMap2 with Mapped expSimpleMap2
            valBase = -3.0;
            val = valBase;
            ControlInt = 9;
            for (int i = 0; i <= 7; i++) {
                switch (i) {
                    case 0:
                        val = -3.0;
                        break;
                    case 1:
                        valBase++;
                        break;
                    case 2:
                        valBase++;
                        break;
                    case 3:
                        valBase++;
                        break;
                    case 4:
                        valBase++;
                        break;
                    case 5:
                        valBase++;
                        break;
                    case 6:
                        valBase++;
                        break;
                    case 7:
                        valBase++;
                        break;
                }
                for (int j = 0; j < 3; j++) {
                    switch (j) {
                        case 0:
                            val = valBase;
                            break;
                        case 1:
                            val = valBase - DELTA;
                            break;
                        case 2:
                            val = valBase + DELTA;
                            break;
                    }
                    variables.put(DiffWithRespTo, val * 1.0);
                    expValue = parse(AnsMap4, variables, DiffWithRespTo, false, "Silent", LogLevel.Off);
                    DblexpValueOrg[i] = expValue.eval();

                    variables.put("y", val * 1.0);
                    expValue = parse(MappedConMap2, variables, "y", false, "Silent", LogLevel.Off);
                    DblexpValueMap1[i] = expValue.eval();

                    if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() != DblexpValueMap1[i].doubleValue())) {
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal Ans4 MappedConMap2" + " AnsMap4=" + AnsMap4 + " val=" + val + " x=" + variables.get(DiffWithRespTo) + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal Ans4 MappedConMap2" + " MappedConMap2=" + MappedConMap2 + " val=" + val + " y=" + variables.get("y") + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "ControlInt=" + ControlInt + " Conformal Ans4 MappedConMap2" + " DblexpValueOrg[i]=" + DblexpValueOrg[i].doubleValue() + " DblexpValueMap1[i]=" + DblexpValueMap1[i].doubleValue() + " val=" + val + " DELTA=" + DELTA + ConsoleColors.RESET);
                        failFlag = true;
                        break;
                    } else if ((!DblexpValueOrg[i].isInfinite()) && (!DblexpValueOrg[i].isNaN())
                            && (DblexpValueOrg[i].doubleValue() == DblexpValueMap1[i].doubleValue())) {
                        PassFlag = true;
                    }
                }
            }
        }
        if ((ControlInt < 9) && (ControlInt < 6) && (failFlag == false)) {
            ReturnFlag = (!failFlag);
        } else {
            ReturnFlag = PassFlag;
        }
        return ReturnFlag;
    }

    public class FlipUtils {
        // --- FlipResult and comparers (string-only) ---

        public static class FlipResult {

            public final boolean map1Ok;
            public final boolean diffOk;
            public final boolean map2Ok;

            public FlipResult(boolean m1, boolean d, boolean m2) {
                this.map1Ok = m1;
                this.diffOk = d;
                this.map2Ok = m2;
            }
        }

        enum Verdict {
            PASS, STALE_ANSWER, FAIL
        }
        // Multiplication-form check (string-based)

        public static FlipResult PassFailInvertAnsStringMult(
                String StrMap1,
                String StrDiff,
                String StrMap2,
                String Answer2,
                String Answer3,
                String Answer4,
                String var) {

            canA2Mult = FlipNormalizer.toMultiplicationForm(Answer2);
            boolean passMap1 = StrMap1.equals(canA2Mult);
            System.out.println(ConsoleColors.BLUE + "PassFailInvertAnsStringMult:  StrMap1=" + StrMap1 + ConsoleColors.RESET);
            System.out.println(ConsoleColors.BLUE + "PassFailInvertAnsStringMult:canA2Mult=" + canA2Mult + ConsoleColors.RESET);
            System.out.println(ConsoleColors.BLUE + "PassFailInvertAnsStringMult:passMap1=" + passMap1 + ConsoleColors.RESET);
            canA3Mult = FlipNormalizer.toMultiplicationForm(Answer3);
            boolean passDiff = StrDiff.equals(canA3Mult);
            System.out.println(ConsoleColors.BLUE + "PassFailInvertAnsStringMult:  StrDiff=" + StrDiff + ConsoleColors.RESET);
            System.out.println(ConsoleColors.BLUE + "PassFailInvertAnsStringMult:canA3Mult=" + canA3Mult + ConsoleColors.RESET);
            System.out.println(ConsoleColors.BLUE + "PassFailInvertAnsStringMult:passDiff=" + passDiff + ConsoleColors.RESET);
            canA4Mult = FlipNormalizer.toMultiplicationForm(Answer4);
            boolean passMap2 = StrMap2.equals(canA4Mult);
            System.out.println(ConsoleColors.BLUE + "PassFailInvertAnsStringMult:  StrMap2=" + StrMap2 + ConsoleColors.RESET);
            System.out.println(ConsoleColors.BLUE + "PassFailInvertAnsStringMult:canA4Mult=" + canA4Mult + ConsoleColors.RESET);
            System.out.println(ConsoleColors.BLUE + "PassFailInvertAnsStringMult:passMap2=" + passMap2 + ConsoleColors.RESET);
            return new FlipResult(passMap1, passDiff, passMap2);
        }

        // Division-form check (string-based)
        public static FlipResult PassFailInvertAnsStringDiv(
                String StrMap1,
                String StrDiff,
                String StrMap2,
                String Answer2,
                String Answer3,
                String Answer4,
                String var) {

            canA2Div = FlipNormalizer.toDivisionForm(Answer2);
            boolean passMap1 = StrMap1.equals(canA2Div);
            System.out.println(ConsoleColors.BLUE + "PassFailInvertAnsStringDiv: StrMap1=" + StrMap1 + ConsoleColors.RESET);
            System.out.println(ConsoleColors.BLUE + "PassFailInvertAnsStringDiv:canA2Div=" + canA2Div + ConsoleColors.RESET);
            System.out.println(ConsoleColors.BLUE + "PassFailInvertAnsStringDiv:passMap1=" + passMap1 + ConsoleColors.RESET);

            canA3Div = FlipNormalizer.toDivisionForm(Answer3);
            boolean passDiff = StrDiff.equals(canA3Div);
            System.out.println(ConsoleColors.BLUE + "PassFailInvertAnsStringDiv: StrDiff=" + StrDiff + ConsoleColors.RESET);
            System.out.println(ConsoleColors.BLUE + "PassFailInvertAnsStringDiv:canA3Div=" + canA3Div + ConsoleColors.RESET);
            System.out.println(ConsoleColors.BLUE + "PassFailInvertAnsStringDiv:passDiff=" + passDiff + ConsoleColors.RESET);

            canA4Div = FlipNormalizer.toDivisionForm(Answer4);
            boolean passMap2 = StrMap2.equals(canA4Div);
            System.out.println(ConsoleColors.BLUE + "PassFailInvertAnsStringDiv: StrMap2=" + StrMap2 + ConsoleColors.RESET);
            System.out.println(ConsoleColors.BLUE + "PassFailInvertAnsStringDiv:canA4Div=" + canA4Div + ConsoleColors.RESET);
            System.out.println(ConsoleColors.BLUE + "PassFailInvertAnsStringDiv:passMap2=" + passMap2 + ConsoleColors.RESET);

            return new FlipResult(passMap1, passDiff, passMap2);
        }

        // Combined harness entry (tries both forms)
        public static boolean PassFailInvertAnsString(
                long myTestCase,
                int Order,
                int MaxOrder1,
                String DiffORIntegre,
                String DiffWithRespTo,
                String Exprn,
                String StrMap1,
                String StrDiff,
                String StrMap2,
                String Answer1,
                String Answer2,
                String Answer3,
                String Answer4,
                boolean Map1, boolean Diff, boolean Map2
        ) {
            FlipResult res = PassFailInvertAnsStringMult(
                    StrMap1, StrDiff, StrMap2, Answer2, Answer3, Answer4, DiffWithRespTo
            );
            FlipResult res1 = PassFailInvertAnsStringDiv(
                    StrMap1, StrDiff, StrMap2, Answer2, Answer3, Answer4, DiffWithRespTo
            );

            if (!ReturnFlagMap1) {
                System.out.println("FlipNormalizer:Map1 OK? StrMap1=" + StrMap1);
                System.out.println("FlipNormalizer:Map1 OK? " + (res.map1Ok) + " RAW ANSWER2:Answer2=" + Answer2);
                System.out.println("FlipNormalizer:Map1 OK? canA2Mult=" + canA2Mult);
                System.out.println("FlipNormalizer:Map1 OK? " + (res1.map1Ok) + " canA2Div=" + canA2Div);
            }
            if (!ReturnFlagDiff) {
                System.out.println("FlipNormalizer:Diff OK? StrDiff=" + StrDiff);
                System.out.println("FlipNormalizer:Diff OK? " + res.diffOk + " RAW ANSWER3:Answer3=" + Answer3);
                System.out.println("FlipNormalizer:Diff canonical mult=" + canA3Mult);
                System.out.println("FlipNormalizer:Diff canonical div=" + canA3Div);
            }
            if (!ReturnFlagMap2) {
                System.out.println("FlipNormalizer:Map2 OK? StrMap2=" + StrMap2);
                System.out.println("FlipNormalizer:Map2 OK? " + res.map2Ok + " RAW ANSWER4:ANSWER4=" + Answer4);
                System.out.println("FlipNormalizer:Map2 OK? canA4Mult=" + canA4Mult);
                System.out.println("FlipNormalizer:Map2 OK? " + res1.map2Ok + " canA4Div=" + canA4Div);
            }

            return (((ReturnFlagMap1 || res.map1Ok) && ((ReturnFlagDiff || res.diffOk)) && (ReturnFlagMap2 || res.map2Ok))
                    || ((ReturnFlagMap1 || res1.map1Ok) && ((ReturnFlagDiff || res1.diffOk)) && (ReturnFlagMap2 || res1.map2Ok)));
        }
    }

    public static boolean PassFailInvertAnsString(
            long myTestCase,
            int Order,
            int MaxOrder1,
            String DiffORIntegre,
            String DiffWithRespTo,
            String Exprn,
            String StrMap1,
            String StrDiff,
            String StrMap2,
            String Answer1,
            String Answer2,
            String Answer3,
            String Answer4,
            boolean Map1, boolean Diff, boolean Map2
    ) {
        FlipUtils.FlipResult res = FlipUtils.PassFailInvertAnsStringMult(
                StrMap1,
                StrDiff,
                StrMap2,
                Answer2,
                Answer3,
                Answer4,
                DiffWithRespTo
        );
        FlipUtils.FlipResult res1 = FlipUtils.PassFailInvertAnsStringDiv(
                StrMap1,
                StrDiff,
                StrMap2,
                Answer2,
                Answer3,
                Answer4,
                DiffWithRespTo
        );

        if (!ReturnFlagMap1) {
            System.out.println("Map1 OK?      StrMap1=" + StrMap1);
            System.out.println("Map1 OK? " + (res.map1Ok) + " RAW ANSWER4:Answer2=" + Answer2);
            System.out.println("Map1 OK? canA2Mult=" + canA2Mult);
            System.out.println("Map1 OK? " + (res1.map1Ok) + " canA2Div=" + canA2Div);
        }
        if ((!ReturnFlagDiff)) {
            System.out.println("Diff OK?      StrDiff=" + StrDiff);
            System.out.println("Diff OK? " + res.diffOk + " RAW ANSWER4:Answer3=" + Answer3);
            System.out.println("Map1 OK? canA2Mult=" + canA3Mult);
            System.out.println("Diff OK? " + res1.diffOk + " canA3Div=" + canA3Div);
        }
        if ((!ReturnFlagMap2)) {
            System.out.println("Map2 OK?       StrMap2=" + StrMap2);
            System.out.println("Map2 OK? " + res.map2Ok + " RAW ANSWER4:Answer4=" + Answer4);
            System.out.println("Map2 OK? canA4Mult=" + canA4Mult);
            System.out.println("Map2 OK? " + res1.map2Ok + " canA4Div=" + canA4Div);
        }

//        Verdict vMult = FlipComparer.compareMultiplication(StrMap2, Answer4);
//        Verdict vDiv = FlipComparer.compareDivision(StrMap2, Answer4);
//        Verdict vAny = FlipComparer.compareEither(StrMap2, Answer4);
//
//        System.out.println("Mul-form verdict: " + vMult);
//        System.out.println("Div-form verdict: " + vDiv);
//        System.out.println("Either verdict: " + vAny);
        return (((ReturnFlagMap1 || res.map1Ok) && ((ReturnFlagDiff || res.diffOk)) && (ReturnFlagMap2 || res.map2Ok)) || ((ReturnFlagMap1 || res1.map1Ok) && ((ReturnFlagDiff || res1.diffOk)) && (ReturnFlagMap2 || res1.map2Ok)));
    }

    public static void main(String[] args) {
        TestHarness.main(args);
    }

//Exponent Test Cases
    public static void Exponent(String AlgoName, long j) {
        if (((!RunAllTestCasesFlag) && (IgnoreKnownIssuesFlag == false) && (AlgoName.equalsIgnoreCase("mainIntegrTest")) && (IntegralGapInfinity(j)))
                || ((!RunAllTestCasesFlag) && (IgnoreKnownIssuesFlag == false) && (AlgoName.equalsIgnoreCase("mainDiffTest")) && (DifferentialGapInfinity(j)))) {
            KnownIssueTestCasesFlag = true;
            KnownIssues++;
            KnownIssuesTestCases.put(KnownIssues, "" + j);
            System.out.println(ConsoleColors.RED + "Exponent TestCase:j= " + j + ": Infinite Loop GAP" + ConsoleColors.RESET);
        } else if (((!RunAllTestCasesFlag) && (IgnoreKnownIssuesFlag == false) && (AlgoName.equalsIgnoreCase("mainIntegrTest")) && (IntegralGapException(j)))
                || ((!RunAllTestCasesFlag) && (IgnoreKnownIssuesFlag == false) && (AlgoName.equalsIgnoreCase("mainDiffTest")) && (DifferentialGapException(j)))) {
            KnownIssueTestCasesFlag = true;
            KnownIssues++;
            KnownIssuesTestCases.put(KnownIssues, "" + j);
            System.out.println(ConsoleColors.RED + "Exponent TestCase:j= " + j + ": Exception GAP" + ConsoleColors.RESET);
        } else if (((!RunAllTestCasesFlag) && (IgnoreCoreIssuesFlag == false) && (AlgoName.equalsIgnoreCase("mainIntegrTest")) && (TrueIntegralGapInfinity(j)))
                || ((!RunAllTestCasesFlag) && (IgnoreCoreIssuesFlag == false) && (AlgoName.equalsIgnoreCase("mainDiffTest")) && (TrueDifferentialGapInfinity(j)))) {
            CoreKnownIssuesTestCasesFlag = true;
            CoreKnownIssues++;
            System.out.println(ConsoleColors.RED + "Exponent TestCase:j= " + j + ": Infinite Loop GAP" + ConsoleColors.RESET);
        } else if (((!RunAllTestCasesFlag) && (IgnoreCoreIssuesFlag == false) && (AlgoName.equalsIgnoreCase("mainIntegrTest")) && (TrueIntegralGapException(j)))
                || ((!RunAllTestCasesFlag) && (IgnoreCoreIssuesFlag == false) && (AlgoName.equalsIgnoreCase("mainDiffTest")) && (TrueDifferentialGapException(j)))) {
            CoreKnownIssuesTestCasesFlag = true;
            CoreKnownIssues++;
            System.out.println(ConsoleColors.RED + "Exponent TestCase:j= " + j + ": Exception GAP" + ConsoleColors.RESET);
        } else {
            switch ((int) j) {
                case 30001:
                    TestCaseDiff30001();
                    break;
                case 30002:
                    TestCaseDiff30002();
                    break;
                case 30003:
                    TestCaseDiff30003();
                    break;
                case 30004:
                    TestCaseDiff30004();
                    break;
                case 30005:
                    TestCaseDiff30005();
                    break;
                case 30006:
                    TestCaseDiff30006();
                    break;
                case 30007:
                    TestCaseDiff30007();
                    break;
                case 30008:
                    TestCaseDiff30008();
                    break;
                case 30009:
                    TestCaseDiff30009();
                    break;
                case 30010:
                    TestCaseDiff30010();
                    break;
                case 30011:
                    TestCaseDiff30011();
                    break;
                default:
                    System.out.println(ConsoleColors.RED + "Exponent TestCase:j= " + j + ": Gap" + ConsoleColors.RESET);
                    break;
            }
        }
    }

    //IndConstant Test End
    /* **************************************** */
 /* ***************Exponent Test Case***************** */
 /* **************************************** */
    public static void TestCaseDiff30001() {
        //Test Case 30001
        UsageCalculus.TestCase = 30001;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8 + x^5 + x^4 - x- 25";
        UsageCalculus.TestCaseName = "Simple: Exponent";
        UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "x^8.0+x^5.0+x^4.0-x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-1.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-1.0";
        UsageCalculus.EqnSolArrayMap3[1] = "x^8.0+x^5.0+x^4.0-x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0-1.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2] = "1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/9.0/10.0*x^10.0+1.0/6.0/7.0*x^7.0+1.0/5.0/6.0*x^6.0-1.0/2.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "1.0/90.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*x^5.0+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3] = "1.0/90.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/90.0/11.0*x^11.0+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-1.0/6.0/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "1.0/990.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*x^4.0+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4] = "1.0/990.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/990.0/12.0*x^12.0+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/24.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "1.0/11880.0*x^12.0+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0-1.0/120.0*x^5.0-1.0416666666666667*x^4.0";
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

    public static void TestCaseDiff30002() {
        //Test Case 30002
        UsageCalculus.TestCase = 30002;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^-8 + x^-5 + x^-4 - x^-1- 25";
        UsageCalculus.TestCaseName = "Simple: Exponent";
        UsageCalculus.TestCaseMatrixID = "Exponent:-ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;

        UsageCalculus.EqnSolArrayMap1[1] = "1.0/x^8.0+1.0/x^5.0+1.0/x^4.0-1.0/x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-8.0/x^9.0-5.0/x^6.0-4.0/x^5.0+1.0/x^2.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-8.0/x^9.0-5.0/x^6.0-4.0/x^5.0+1.0/x^2.0";
        UsageCalculus.EqnSolArrayMap3[1] = "1.0/x^8.0+1.0/x^5.0+1.0/x^4.0-1.0/x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0/-7.0/x^7.0+1.0/-4.0/x^4.0+1.0/-3.0/x^3.0-ln(x)-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "-1.0/7.0/x^7.0-1.0/4.0/x^4.0-1.0/3.0/x^3.0-ln(x)-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-8.0/x^9.0-5.0/x^6.0-4.0/x^5.0+1.0/x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-8.0*-9.0/x^10.0-5.0*-6.0/x^7.0-4.0*-5.0/x^6.0-2.0/x^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "72.0/x^10.0+30.0/x^7.0+20.0/x^6.0-2.0/x^3.0";
        UsageCalculus.EqnSolArrayMap3[2] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "";
        UsageCalculus.EqnSolArrayMap4[2] = "";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "72.0/x^10.0+30.0/x^7.0+20.0/x^6.0-2.0/x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "72.0*-10.0/x^11.0+30.0*-7.0/x^8.0+20.0*-6.0/x^7.0-2.0*-3.0/x^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-720.0/x^11.0-210.0/x^8.0-120.0/x^7.0+6.0/x^4.0";
        UsageCalculus.EqnSolArrayMap3[3] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "";
        UsageCalculus.EqnSolArrayMap4[3] = "";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-720.0/x^11.0-210.0/x^8.0-120.0/x^7.0+6.0/x^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-720.0*-11.0/x^12.0-210.0*-8.0/x^9.0-120.0*-7.0/x^8.0+6.0*-4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "7920.0/x^12.0+1680.0/x^9.0+840.0/x^8.0-24.0/x^5.0";
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

    public static void TestCaseDiff30003() {
        //Test Case 30003
        UsageCalculus.TestCase = 30003;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^0 + x^0 + x^0 - x^0- 25^0";
        UsageCalculus.TestCaseName = "Simple: Exponent";
        UsageCalculus.TestCaseMatrixID = "Exponent:0:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 2;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "x^0.0+x^0.0+x^0.0-x^0.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+0.0+0.0-0.0-1.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "";
        UsageCalculus.EqnSolArrayMap3[1] = "x^0.0+x^0.0+x^0.0-x^0.0-1.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0/1.0*x^1.0+1.0/1.0*x^1.0+1.0/1.0*x^1.0-1.0/1.0*x^1.0-1.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "x+x+x-x-x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2] = "x+x+x-x-x";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/2.0*x^2.0+1.0/2.0*x^2.0+1.0/2.0*x^2.0-1.0/2.0*x^2.0-1.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "1.0/2.0*x^2.0+1.0/2.0*x^2.0+1.0/2.0*x^2.0-1.0/2.0*x^2.0-1.0/2.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3] = "1.0/2.0*x^2.0+1.0/2.0*x^2.0+1.0/2.0*x^2.0-1.0/2.0*x^2.0-1.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/2.0/3.0*x^3.0+1.0/2.0/3.0*x^3.0+1.0/2.0/3.0*x^3.0-1.0/2.0/3.0*x^3.0-1.0/2.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "1.0/6.0*x^3.0+1.0/6.0*x^3.0+1.0/6.0*x^3.0-1.0/6.0*x^3.0-1.0/6.0*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4] = "1.0/6.0*x^3.0+1.0/6.0*x^3.0+1.0/6.0*x^3.0-1.0/6.0*x^3.0-1.0/6.0*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/6.0/4.0*x^4.0+1.0/6.0/4.0*x^4.0+1.0/6.0/4.0*x^4.0-1.0/6.0/4.0*x^4.0-1.0/6.0/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "1.0/24.0*x^4.0+1.0/24.0*x^4.0+1.0/24.0*x^4.0-1.0/24.0*x^4.0-1.0/24.0*x^4.0";
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

    public static void TestCaseDiff30004() {
        //Test Case 30004
        UsageCalculus.TestCase = 30004;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^1 + x^1 + x^1 - x^1- 25^1";
        UsageCalculus.TestCaseName = "Simple: Exponent";
        UsageCalculus.TestCaseMatrixID = "Exponent:1:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 3;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "x+x+x-x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0+1.0+1.0-1.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0+1.0+1.0-1.0";
        UsageCalculus.EqnSolArrayMap3[1] = "x+x+x-x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0/2.0*x^2.0+1.0/2.0*x^2.0+1.0/2.0*x^2.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "1.0/2.0*x^2.0+1.0/2.0*x^2.0+1.0/2.0*x^2.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0+1.0+1.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "0.0+1.0*0.0+1.0*0.0-1.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2] = "1.0/2.0*x^2.0+1.0/2.0*x^2.0+1.0/2.0*x^2.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/2.0/3.0*x^3.0+1.0/2.0/3.0*x^3.0+1.0/2.0/3.0*x^3.0-1.0/2.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "1.0/6.0*x^3.0+1.0/6.0*x^3.0+1.0/6.0*x^3.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3] = "1.0/6.0*x^3.0+1.0/6.0*x^3.0+1.0/6.0*x^3.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/6.0/4.0*x^4.0+1.0/6.0/4.0*x^4.0+1.0/6.0/4.0*x^4.0-1.0/6.0/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "1.0/24.0*x^4.0+1.0/24.0*x^4.0+1.0/24.0*x^4.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4] = "1.0/24.0*x^4.0+1.0/24.0*x^4.0+1.0/24.0*x^4.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/24.0/5.0*x^5.0+1.0/24.0/5.0*x^5.0+1.0/24.0/5.0*x^5.0-1.0/24.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "1.0/120.0*x^5.0+1.0/120.0*x^5.0+1.0/120.0*x^5.0-1.0/120.0*x^5.0-1.0416666666666667*x^4.0";
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

    public static void TestCaseDiff30005() {
        //Test Case 30005
        UsageCalculus.TestCase = 30005;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^-1 + x^-1 + x^-1 - x^-1- 25^-1";
        UsageCalculus.TestCaseName = "Simple: Exponent";
        UsageCalculus.TestCaseMatrixID = "Exponent:-1:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;

        UsageCalculus.EqnSolArrayMap1[1] = "1.0/x+1.0/x+1.0/x-1.0/x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-1.0/x^2.0-1.0/x^2.0-1.0/x^2.0+1.0/x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-1.0/x^2.0-1.0/x^2.0-1.0/x^2.0+1.0/x^2.0";
        UsageCalculus.EqnSolArrayMap3[1] = "1.0/x+1.0/x+1.0/x-1.0/x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "ln(x)+ln(x)+ln(x)-ln(x)-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "ln(x)+ln(x)+ln(x)-ln(x)-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-1.0/x^2.0-1.0/x^2.0-1.0/x^2.0+1.0/x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "2.0/x^3.0+2.0/x^3.0+2.0/x^3.0-2.0/x^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "2.0/x^3.0+2.0/x^3.0+2.0/x^3.0-2.0/x^3.0";
        UsageCalculus.EqnSolArrayMap3[2] = "-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "2.0/x^3.0+2.0/x^3.0+2.0/x^3.0-2.0/x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "2.0*-3.0/x^4.0+2.0*-3.0/x^4.0+2.0*-3.0/x^4.0-2.0*-3.0/x^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-6.0/x^4.0-6.0/x^4.0-6.0/x^4.0+6.0/x^4.0";
        UsageCalculus.EqnSolArrayMap3[3] = "-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-6.0/x^4.0-6.0/x^4.0-6.0/x^4.0+6.0/x^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-6.0*-4.0/x^5.0-6.0*-4.0/x^5.0-6.0*-4.0/x^5.0+6.0*-4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "24.0/x^5.0+24.0/x^5.0+24.0/x^5.0-24.0/x^5.0";
        UsageCalculus.EqnSolArrayMap3[4] = "-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "-1.0416666666666667*x^4.0";
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

    public static void TestCaseDiff30006() {
        //Test Case 30006
        UsageCalculus.TestCase = 30006;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^a + x^a + x^a - x^a- 25^a";
        UsageCalculus.TestCaseName = "Simple: Exponent";
        UsageCalculus.TestCaseMatrixID = "Exponent:a:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 2;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "x^a+x^a+x^a-x^a-25.0^a";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a*x^(a-1.0)+a*x^(a-1.0)+a*x^(a-1.0)-a*x^(a-1.0)-25.0^a*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a*x^(a-1.0)+a*x^(a-1.0)+a*x^(a-1.0)-a*x^(a-1.0)-25.0^a*0.0";
        UsageCalculus.EqnSolArrayMap3[1] = "x^a+x^a+x^a-x^a-25.0^a";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "x^(a+1.0)/(a+1.0)+x^(a+1.0)/(a+1.0)+x^(a+1.0)/(a+1.0)-x^(a+1.0)/(a+1.0)-25.0^a*x";
        UsageCalculus.EqnSolArrayMap4[1] = "1.0/(a+1.0)*x^(a+1.0)+1.0/(a+1.0)*x^(a+1.0)+1.0/(a+1.0)*x^(a+1.0)-1.0/(a+1.0)*x^(a+1.0)-25.0^a*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2] = "-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3] = "-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4] = "-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "-1.0416666666666667*x^4.0";
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

    public static void TestCaseDiff30007() {
        //Test Case 30007
        UsageCalculus.TestCase = 30007;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^-a + x^-a + x^-a - x^-a- 25^-a";
        UsageCalculus.TestCaseName = "Simple: Exponent";
        UsageCalculus.TestCaseMatrixID = "Exponent:a:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 2;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "x^-a+x^-a+x^-a-x^-a-25.0^-a";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-a*x^(-a-1.0)-a*x^(-a-1.0)-a*x^(-a-1.0)+a*x^(-a-1.0)-25.0^-a*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "";
        UsageCalculus.EqnSolArrayMap3[1] = "x^-a+x^-a+x^-a-x^-a-25.0^-a";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "x^(-a+1.0)/(-a+1.0)+x^(-a+1.0)/(-a+1.0)+x^(-a+1.0)/(-a+1.0)-x^(-a+1.0)/(-a+1.0)-25.0^a*x";
        UsageCalculus.EqnSolArrayMap4[1] = "-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2] = "-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3] = "-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4] = "-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "-1.0416666666666667*x^4.0";
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

    public static void TestCaseDiff30008() {
        //Test Case 30008
        UsageCalculus.TestCase = 30008;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^a^2 + x^-a + x^-a^-2 - x^a^0- 25^a^0";
        UsageCalculus.TestCaseName = "Simple: Exponent";
        UsageCalculus.TestCaseMatrixID = "Exponent:a:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "";
        UsageCalculus.EqnSolArrayMap2[1] = "";
        UsageCalculus.EqnSolArrayMap3[1] = "-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2] = "-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3] = "-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4] = "-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "-1.0416666666666667*x^4.0";
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

    public static void TestCaseDiff30009() {
        //Test Case 30009
        UsageCalculus.TestCase = 30009;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^+1 + x^+1 + x^+1 - x^+1- 25^+1";
        UsageCalculus.TestCaseName = "Simple: Exponent";
        UsageCalculus.TestCaseMatrixID = "Exponent:+1:* Operator:Constant End:Term Sign +&-:Exponent";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "x+x+x-x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0+1.0+1.0-1.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0+1.0+1.0-1.0";
        UsageCalculus.EqnSolArrayMap3[1] = "x+x+x-x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0/2.0*x^2.0+1.0/2.0*x^2.0+1.0/2.0*x^2.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "1.0/2.0*x^2.0+1.0/2.0*x^2.0+1.0/2.0*x^2.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0+1.0+1.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "0.0+0.0+0.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2] = "1.0/2.0*x^2.0+1.0/2.0*x^2.0+1.0/2.0*x^2.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/2.0/3.0*x^3.0+1.0/2.0/3.0*x^3.0+1.0/2.0/3.0*x^3.0-1.0/2.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "1.0/6.0*x^3.0+1.0/6.0*x^3.0+1.0/6.0*x^3.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3] = "1.0/6.0*x^3.0+1.0/6.0*x^3.0+1.0/6.0*x^3.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/6.0/4.0*x^4.0+1.0/6.0/4.0*x^4.0+1.0/6.0/4.0*x^4.0-1.0/6.0/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "1.0/24.0*x^4.0+1.0/24.0*x^4.0+1.0/24.0*x^4.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4] = "1.0/24.0*x^4.0+1.0/24.0*x^4.0+1.0/24.0*x^4.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/24.0/5.0*x^5.0+1.0/24.0/5.0*x^5.0+1.0/24.0/5.0*x^5.0-1.0/24.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "1.0/120.0*x^5.0+1.0/120.0*x^5.0+1.0/120.0*x^5.0-1.0/120.0*x^5.0-1.0416666666666667*x^4.0";
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

    public static void TestCaseDiff30010() {
        //Test Case 30009
        UsageCalculus.TestCase = 30010;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^+1.0 + x^+1.0 + x^+1.0 - x^+1.0- 25^+1.0";
        UsageCalculus.TestCaseName = "Simple: Exponent";
        UsageCalculus.TestCaseMatrixID = "Exponent:+1.0:* Operator:Constant End:Term Sign +&-:Exponent";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "x+x+x-x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0+1.0+1.0-1.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0+1.0+1.0-1.0";
        UsageCalculus.EqnSolArrayMap3[1] = "x+x+x-x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0/2.0*x^2.0+1.0/2.0*x^2.0+1.0/2.0*x^2.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "1.0/2.0*x^2.0+1.0/2.0*x^2.0+1.0/2.0*x^2.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0+1.0+1.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "0.0+0.0+0.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2] = "1.0/2.0*x^2.0+1.0/2.0*x^2.0+1.0/2.0*x^2.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/2.0/3.0*x^3.0+1.0/2.0/3.0*x^3.0+1.0/2.0/3.0*x^3.0-1.0/2.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "1.0/6.0*x^3.0+1.0/6.0*x^3.0+1.0/6.0*x^3.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3] = "1.0/6.0*x^3.0+1.0/6.0*x^3.0+1.0/6.0*x^3.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/6.0/4.0*x^4.0+1.0/6.0/4.0*x^4.0+1.0/6.0/4.0*x^4.0-1.0/6.0/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "1.0/24.0*x^4.0+1.0/24.0*x^4.0+1.0/24.0*x^4.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4] = "1.0/24.0*x^4.0+1.0/24.0*x^4.0+1.0/24.0*x^4.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/24.0/5.0*x^5.0+1.0/24.0/5.0*x^5.0+1.0/24.0/5.0*x^5.0-1.0/24.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "1.0/120.0*x^5.0+1.0/120.0*x^5.0+1.0/120.0*x^5.0-1.0/120.0*x^5.0-1.0416666666666667*x^4.0";
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

    public static void TestCaseDiff30011() {
        //Test Case 30011
        UsageCalculus.TestCase = 30011;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^+5 + x^+5 + x^+5 - x^+5- 25^+5";
        UsageCalculus.TestCaseName = "Simple: Exponent";
        UsageCalculus.TestCaseMatrixID = "Exponent:+5:* Operator:Constant End:Term Sign +&-:Exponent";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "x^5.0+x^5.0+x^5.0-x^5.0-9765625.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "5.0*x^4.0+5.0*x^4.0+5.0*x^4.0-5.0*x^4.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "5.0*x^4.0+5.0*x^4.0+5.0*x^4.0-5.0*x^4.0";
        UsageCalculus.EqnSolArrayMap3[1] = "x^5.0+x^5.0+x^5.0-x^5.0-9765625.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0/6.0*x^6.0+1.0/6.0*x^6.0+1.0/6.0*x^6.0-1.0/6.0*x^6.0-9765625.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "1.0/6.0*x^6.0+1.0/6.0*x^6.0+1.0/6.0*x^6.0-1.0/6.0*x^6.0-9765625.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "5.0*x^4.0+5.0*x^4.0+5.0*x^4.0-5.0*x^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "5.0*4.0*x^3.0+5.0*4.0*x^3.0+5.0*4.0*x^3.0-5.0*4.0*x^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "20.0*x^3.0+20.0*x^3.0+20.0*x^3.0-20.0*x^3.0";
        UsageCalculus.EqnSolArrayMap3[2] = "1.0/6.0*x^6.0+1.0/6.0*x^6.0+1.0/6.0*x^6.0-1.0/6.0*x^6.0-9765625.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/6.0/7.0*x^7.0+1.0/6.0/7.0*x^7.0+1.0/6.0/7.0*x^7.0-1.0/6.0/7.0*x^7.0-9765625.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "1.0/42.0*x^7.0+1.0/42.0*x^7.0+1.0/42.0*x^7.0-1.0/42.0*x^7.0-4882812.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "20.0*x^3.0+20.0*x^3.0+20.0*x^3.0-20.0*x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "20.0*3.0*x^2.0+20.0*3.0*x^2.0+20.0*3.0*x^2.0-20.0*3.0*x^2.0";
        UsageCalculus.EqnSolArrayMap2[3] = "60.0*x^2.0+60.0*x^2.0+60.0*x^2.0-60.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[3] = "1.0/42.0*x^7.0+1.0/42.0*x^7.0+1.0/42.0*x^7.0-1.0/42.0*x^7.0-4882812.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/42.0/8.0*x^8.0+1.0/42.0/8.0*x^8.0+1.0/42.0/8.0*x^8.0-1.0/42.0/8.0*x^8.0-4882812.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "1.0/336.0*x^8.0+1.0/336.0*x^8.0+1.0/336.0*x^8.0-1.0/336.0*x^8.0-1627604.1666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "60.0*x^2.0+60.0*x^2.0+60.0*x^2.0-60.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "60.0*2.0*x^1.0+60.0*2.0*x^1.0+60.0*2.0*x^1.0-60.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[4] = "120.0*x+120.0*x+120.0*x-120.0*x";
        UsageCalculus.EqnSolArrayMap3[4] = "1.0/336.0*x^8.0+1.0/336.0*x^8.0+1.0/336.0*x^8.0-1.0/336.0*x^8.0-1627604.1666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/336.0/9.0*x^9.0+1.0/336.0/9.0*x^9.0+1.0/336.0/9.0*x^9.0-1.0/336.0/9.0*x^9.0-1627604.1666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "1.0/3024.0*x^9.0+1.0/3024.0*x^9.0+1.0/3024.0*x^9.0-1.0/3024.0*x^9.0-406901.0416666667*x^4.0";
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

}
