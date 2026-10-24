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
package JavaCalculusTestHarness;

import Calculus.ConsoleColors;
import static Calculus.ExclusionTestCases.DifferentialGapException;
import static Calculus.ExclusionTestCases.DifferentialGapInfinity;
import static Calculus.ExclusionTestCases.IntegralGapException;
import static Calculus.ExclusionTestCases.IntegralGapInfinity;
import static Calculus.ExclusionTestCases.TrueDifferentialGapException;
import static Calculus.ExclusionTestCases.TrueDifferentialGapInfinity;
import static Calculus.ExclusionTestCases.TrueIntegralGapException;
import static Calculus.ExclusionTestCases.TrueIntegralGapInfinity;
import static Calculus.MathematicalTestHarness.IgnoreCoreIssuesFlag;
import static Calculus.MathematicalTestHarness.IgnoreKnownIssuesFlag;
import static Calculus.MathematicalTestHarness.RunAllTestCasesFlag;
import Calculus.UsageCalculus;
import static Calculus.UsageCalculus.CoreKnownIssues;
import static Calculus.UsageCalculus.CoreKnownIssuesTestCasesFlag;
import static Calculus.UsageCalculus.KnownIssueTestCasesFlag;
import static Calculus.UsageCalculus.KnownIssues;
import static Calculus.UsageCalculus.KnownIssuesTestCases;

/**
 *
 * @author Rajesh V Pai
 */
public class TestHarnessSoftwareEngg {
    public static void SoftwareEngg(String AlgoName, long j) {
        if (((!RunAllTestCasesFlag)&&(IgnoreKnownIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainIntegrTest")) && (IntegralGapInfinity(j))) 
                || ((!RunAllTestCasesFlag)&&(IgnoreKnownIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainDiffTest")) && (DifferentialGapInfinity(j)))) {
            KnownIssueTestCasesFlag=true;
            KnownIssues++;
            KnownIssuesTestCases.put(KnownIssues, "" + j);
            System.out.println(ConsoleColors.RED + "SoftwareEngg TestCase:j= " + j + ": Infinite Loop GAP" + ConsoleColors.RESET);
        } else if (((!RunAllTestCasesFlag)&&(IgnoreKnownIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainIntegrTest")) && (IntegralGapException(j))) 
                || ((!RunAllTestCasesFlag)&&(IgnoreKnownIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainDiffTest")) && (DifferentialGapException(j)))) {
            KnownIssueTestCasesFlag=true;
            KnownIssues++;
            KnownIssuesTestCases.put(KnownIssues, "" + j);
            System.out.println(ConsoleColors.RED + "SoftwareEngg TestCase:j= " + j + ": Exception GAP" + ConsoleColors.RESET);
        } else if( ( (!RunAllTestCasesFlag)&&(IgnoreCoreIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainIntegrTest"))&&(TrueIntegralGapInfinity(j)))
                ||((!RunAllTestCasesFlag)&& (IgnoreCoreIssuesFlag==false) && (AlgoName.equalsIgnoreCase("mainDiffTest"))&&(TrueDifferentialGapInfinity(j))) )
        {
             CoreKnownIssuesTestCasesFlag=true;
             CoreKnownIssues ++;
             System.out.println(ConsoleColors.RED +"SoftwareEngg TestCase:j= " + j  + ": Infinite Loop GAP" + ConsoleColors.RESET);
        }
        else if(((!RunAllTestCasesFlag)&&(IgnoreCoreIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainIntegrTest"))&&(TrueIntegralGapException(j)))
                ||((!RunAllTestCasesFlag)&&(IgnoreCoreIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainDiffTest"))&&(TrueDifferentialGapException(j))) )
        {
             CoreKnownIssuesTestCasesFlag=true;
             CoreKnownIssues ++;
             System.out.println(ConsoleColors.RED +"SoftwareEngg TestCase:j= " + j  + ": Exception GAP" + ConsoleColors.RESET);
        }else {
            switch (j) {

                case 110001L:
                    TestCaseDiff110001();
                    break;
                case 110002L:
                    TestCaseDiff110002();
                    break;
                case 110003L:
                    TestCaseDiff110003();
                    break;
                case 110004L:
                    TestCaseDiff110004();
                    break;
                case 110005L:
                    TestCaseDiff110005();
                    break;
                case 110006L:
                    TestCaseDiff110006();
                    break;
                case 110007L:
                    TestCaseDiff110007();
                    break;
                case 110008L:
                    TestCaseDiff110008();
                    break;
                case 110009L:
                    TestCaseDiff110009();
                    break;
                case 110010L:
                    TestCaseDiff110010();
                    break;
                case 110011L:
                    TestCaseDiff110011();
                    break;
                case 110012L:
                    TestCaseDiff110012();
                    break;
                case 110013L:
                    TestCaseDiff110013();
                    break;
                case 110014L:
                    TestCaseDiff110014();
                    break;
                case 110015L:
                    TestCaseDiff110015();
                    break;
                case 110016L:
                    TestCaseDiff110016();
                    break;
                case 110017L:
                    TestCaseDiff110017();
                    break;
                case 110018L:
                    TestCaseDiff110018();
                    break;
                case 110019L:
                    TestCaseDiff110019();
                    break;
                case 110020L:
                    TestCaseDiff110020();
                    break;
                case 110021L:
                    TestCaseDiff110021();
                    break;
                case 110022L:
                    TestCaseDiff110022();
                    break;
                case 110023L:
                    TestCaseDiff110023();
                    break;
                case 110024L:
                    TestCaseDiff110024();
                    break;
                case 110025L:
                    TestCaseDiff110025();
                    break;
                case 110026L:
                    TestCaseDiff110026();
                    break;
                case 110027L:
                    TestCaseDiff110027();
                    break;
                case 110028L:
                    TestCaseDiff110028();
                    break;
                case 110029L:
                    TestCaseDiff110029();
                    break;
                default:
                    System.out.println(ConsoleColors.RED + "Parenthesis TestCase:j= " + j + ": Gap" + ConsoleColors.RESET);
                    break;
            }
        }
    }
        /* **************************************** */
 /* ***************Software Engg Test Case***************** */
 /* **************************************** */
    public static void TestCaseDiff110001() {
        //Test Case 110001
        UsageCalculus.TestCase = 110001;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^2";
        UsageCalculus.TestCaseName = "Simple: Product Integration";
        UsageCalculus.TestCaseMatrixID = "Coefficients:0.0:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Function";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[1] = "2.0*x";
        UsageCalculus.EqnSolArrayMap3[1] = "x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[1] = "1.0/3.0*x^3.0";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "2.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "2.0";
        UsageCalculus.EqnSolArrayMap2[2] = "2.0";
        UsageCalculus.EqnSolArrayMap3[2] = "1.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/3.0/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[2] = "1.0/12.0*x^4.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3] = "1.0/12.0*x^4.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/12.0/5.0*x^5.0";
        UsageCalculus.EqnSolArrayMap4[3] = "1.0/60.0*x^5.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4] = "1.0/60.0*x^5.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/60.0/6.0*x^6.0";
        UsageCalculus.EqnSolArrayMap4[4] = "1.0/360.0*x^6.0";
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

    public static void TestCaseDiff110002() {
        //Test Case 110002
        UsageCalculus.TestCase = 110002;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x";
        UsageCalculus.TestCaseName = "Simple: Product Integration";
        UsageCalculus.TestCaseMatrixID = "Coefficients:0.0:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Function";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "x";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0";
        UsageCalculus.EqnSolArrayMap3[1] = "x";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[1] = "1.0/2.0*x^2.0";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2] = "1.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/2.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[2] = "1.0/6.0*x^3.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3] = "1.0/6.0*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/6.0/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[3] = "1.0/24.0*x^4.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4] = "1.0/24.0*x^4.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/24.0/5.0*x^5.0";
        UsageCalculus.EqnSolArrayMap4[4] = "1.0/120.0*x^5.0";
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

    public static void TestCaseDiff110003() {
        //Test Case 110003
        UsageCalculus.TestCase = 110003;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "2.0";
        UsageCalculus.TestCaseName = "Simple: Product Integration";
        UsageCalculus.TestCaseMatrixID = "Coefficients:0.0:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Function";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "2.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "";
        UsageCalculus.EqnSolArrayMap3[1] = "2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "2.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "2.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2] = "2.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "x^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3] = "x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "1.0/3.0*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4] = "1.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/3.0/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "1.0/12.0*x^4.0";
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

    public static void TestCaseDiff110004() {
        //Test Case 110004
        UsageCalculus.TestCase = 110004;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0";
        UsageCalculus.TestCaseName = "Simple: Product Integration";
        UsageCalculus.TestCaseMatrixID = "Coefficients:0.0:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Function";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "1.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "";
        UsageCalculus.EqnSolArrayMap3[1] = "1.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2] = "x";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "1.0/2.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3] = "1.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/2.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "1.0/6.0*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4] = "1.0/6.0*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/6.0/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "1.0/24.0*x^4.0";
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

    public static void TestCaseDiff110005() {
        //Test Case 110005
        UsageCalculus.TestCase = 110005;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "0.0";
        UsageCalculus.TestCaseName = "Simple: Product Integration";
        UsageCalculus.TestCaseMatrixID = "Coefficients:0.0:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Function";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

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

    public static void TestCaseDiff110006() {
        //Test Case 110006
        UsageCalculus.TestCase = 110006;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1";
        UsageCalculus.TestCaseName = "Simple: Product Integration";
        UsageCalculus.TestCaseMatrixID = "Coefficients:0.0:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Function";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "1.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "";
        UsageCalculus.EqnSolArrayMap3[1] = "1.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2] = "x";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "1.0/2.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3] = "1.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/2.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "1.0/6.0*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4] = "1.0/6.0*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/6.0/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "1.0/24.0*x^4.0";
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

    public static void TestCaseDiff110007() {
        //Test Case 110007
        UsageCalculus.TestCase = 110007;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "0";
        UsageCalculus.TestCaseName = "Simple: Product Integration";
        UsageCalculus.TestCaseMatrixID = "Coefficients:0.0:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Function";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

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

    public static void TestCaseDiff110008() {
        //Test Case 110008
        UsageCalculus.TestCase = 110008;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "-";
        UsageCalculus.TestCaseName = "Simple: Product Integration";
        UsageCalculus.TestCaseMatrixID = "Coefficients:0.0:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Function";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

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

    public static void TestCaseDiff110009() {
        //Test Case 110009
        UsageCalculus.TestCase = 110009;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "+";
        UsageCalculus.TestCaseName = "Simple: Product Integration";
        UsageCalculus.TestCaseMatrixID = "Coefficients:0.0:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Function";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

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

    public static void TestCaseDiff110010() {
        //Test Case 110010
        UsageCalculus.TestCase = 110010;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "*";
        UsageCalculus.TestCaseName = "Simple: Product Integration";
        UsageCalculus.TestCaseMatrixID = "Coefficients:0.0:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Function";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

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

    public static void TestCaseDiff110011() {
        //Test Case 110011
        UsageCalculus.TestCase = 110011;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "/";
        UsageCalculus.TestCaseName = "Simple: Product Integration";
        UsageCalculus.TestCaseMatrixID = "Coefficients:0.0:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Function";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

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

    public static void TestCaseDiff110012() {
        //Test Case 110012
        UsageCalculus.TestCase = 110012;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "^";
        UsageCalculus.TestCaseName = "Simple: Product Integration";
        UsageCalculus.TestCaseMatrixID = "Coefficients:0.0:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Function";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

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

    public static void TestCaseDiff110013() {
        //Test Case 110013
        UsageCalculus.TestCase = 110013;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "5*x^8 + 5/x^5 + 6*x^4 - 2*x - 26.0";
        UsageCalculus.TestCaseName = "Simple: Product Integration";
        UsageCalculus.TestCaseMatrixID = "Coefficients:0.0:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Function";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "5.0*x^8.0+5.0/x^5.0+6.0*x^4.0-2.0*x-26.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "5.0*8.0*x^7.0+5.0*-5.0/x^6.0+6.0*4.0*x^3.0-2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "40.0*x^7.0-25.0/x^6.0+24.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1] = "5.0*x^8.0+5.0/x^5.0+6.0*x^4.0-2.0*x-26.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "5.0/9.0*x^9.0+5.0/-4.0/x^4.0+6.0/5.0*x^5.0-x^2.0-26.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "1.0/1.8*x^9.0-1.25/x^4.0+1.2*x^5.0-x^2.0-26.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "40.0*x^7.0-25.0/x^6.0+24.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "40.0*7.0*x^6.0-25.0*-6.0/x^7.0+24.0*3.0*x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "280.0*x^6.0+150.0/x^7.0+72.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2] = "1.0/1.8*x^9.0-1.25/x^4.0+1.2*x^5.0-x^2.0-26.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/1.8/10.0*x^10.0-1.25/-3.0/x^3.0+1.2/6.0*x^6.0-1.0/3.0*x^3.0-26.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "1.0/18.0*x^10.0+1.0/2.4/x^3.0+1.0/5.0*x^6.0-1.0/3.0*x^3.0-13.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "280.0*x^6.0+150.0/x^7.0+72.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "280.0*6.0*x^5.0+150.0*-7.0/x^8.0+72.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "1680.0*x^5.0-1050.0/x^8.0+144.0*x";
        UsageCalculus.EqnSolArrayMap3[3] = "1.0/18.0*x^10.0+1.0/2.4/x^3.0+1.0/5.0*x^6.0-1.0/3.0*x^3.0-13.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/18.0/11.0*x^11.0+1.0/2.4/-2.0/x^2.0+1.0/5.0/7.0*x^7.0-1.0/3.0/4.0*x^4.0-13.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "1.0/198.0*x^11.0-1.0/4.8/x^2.0+1.0/35.0*x^7.0-1.0/12.0*x^4.0-4.333333333333333*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "1680.0*x^5.0-1050.0/x^8.0+144.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "1680.0*5.0*x^4.0-1050.0*-8.0/x^9.0+144.0";
        UsageCalculus.EqnSolArrayMap2[4] = "8400.0*x^4.0+8400.0/x^9.0+144.0";
        UsageCalculus.EqnSolArrayMap3[4] = "1.0/198.0*x^11.0-1.0/4.8/x^2.0+1.0/35.0*x^7.0-1.0/12.0*x^4.0-4.333333333333333*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/198.0/12.0*x^12.0-1.0/4.8/-1.0/x^1.0+1.0/35.0/8.0*x^8.0-1.0/12.0/5.0*x^5.0-4.333333333333333/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "1.0/2376.0*x^12.0+1.0/4.8/x+1.0/280.0*x^8.0-1.0/60.0*x^5.0-1.0833333333333333*x^4.0";
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

    public static void TestCaseDiff110014() {
        //Test Case 110014
        UsageCalculus.TestCase = 110014;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "a*x^8 + a/x^5 + a*x^4 - a*x - 26.0";
        UsageCalculus.TestCaseName = "Simple: Product Integration";
        UsageCalculus.TestCaseMatrixID = "Coefficients:0.0:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Function";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "a*x^8.0+a/x^5.0+a*x^4.0-a*x-26.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a*8.0*x^7.0+a*-5.0/x^6.0+a*4.0*x^3.0-a-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a*8.0*x^7.0-a*5.0/x^6.0+a*4.0*x^3.0-a";
        UsageCalculus.EqnSolArrayMap3[1] = "a*x^8.0+a/x^5.0+a*x^4.0-a*x-26.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "a/9.0*x^9.0+a/-4.0/x^4.0+a/5.0*x^5.0-a/2.0*x^2.0-26.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "a/9.0*x^9.0-a/4.0/x^4.0+a/5.0*x^5.0-a/2.0*x^2.0-26.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a*8.0*x^7.0-a*5.0/x^6.0+a*4.0*x^3.0-a";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a*8.0*7.0*x^6.0-a*5.0*-6.0/x^7.0+a*4.0*3.0*x^2.0-a*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a*56.0*x^6.0+a*30.0/x^7.0+a*12.0*x^2.0-a*0.0";
        UsageCalculus.EqnSolArrayMap3[2] = "a/9.0*x^9.0-a/4.0/x^4.0+a/5.0*x^5.0-a/2.0*x^2.0-26.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "a/9.0/10.0*x^10.0-a/4.0/-3.0/x^3.0+a/5.0/6.0*x^6.0-a/2.0/3.0*x^3.0-26.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "a*0.011111111111111112*x^10.0+a/12.0/x^3.0+a*0.03333333333333333*x^6.0-a/6.0*x^3.0-13.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a*56.0*x^6.0+a*30.0/x^7.0+a*12.0*x^2.0-a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a*56.0*6.0*x^5.0+a*30.0*-7.0/x^8.0+a*12.0*2.0*x^1.0-a*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a*336.0*x^5.0-a*210.0/x^8.0+a*24.0*x-a*0.0";
        UsageCalculus.EqnSolArrayMap3[3] = "a*0.011111111111111112*x^10.0+a/12.0/x^3.0+a*0.03333333333333333*x^6.0-a/6.0*x^3.0-13.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "a*0.011111111111111112/11.0*x^11.0+a/12.0/-2.0/x^2.0+a*0.03333333333333333/7.0*x^7.0-a/6.0/4.0*x^4.0-13.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "a*0.00101010101010101*x^11.0-a/24.0/x^2.0+a*0.0047619047619047615*x^7.0-a/24.0*x^4.0-4.333333333333333*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a*336.0*x^5.0-a*209.99999999999997/x^8.0+a*24.0*x-a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a*336.0*5.0*x^4.0-a*209.99999999999997*-8.0/x^9.0+a*24.0-a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a*1680.0*x^4.0+a*1679.9999999999998/x^9.0+a*24.0-a*0.0";
        UsageCalculus.EqnSolArrayMap3[4] = "a*0.00101010101010101*x^11.0-a/24.0/x^2.0+a*0.0047619047619047615*x^7.0-a/24.0*x^4.0-4.333333333333333*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "a*0.00101010101010101/12.0*x^12.0-a/24.0/-1.0/x^1.0+a*0.0047619047619047615/8.0*x^8.0-a/24.0/5.0*x^5.0-4.333333333333333/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "a*8.417508417508418E-5*x^12.0+a/24.0/x+a*5.952380952380952E-4*x^8.0-a/120.0*x^5.0-1.0833333333333333*x^4.0";
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

    public static void TestCaseDiff110015() {
        //Test Case 110015
        UsageCalculus.TestCase = 110015;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^80.0-x^5.0+x-a";
        UsageCalculus.TestCaseName = "Simple: Product Integration";
        UsageCalculus.TestCaseMatrixID = "Coefficients:0.0:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Function";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "x^80.0-x^5.0+x-a";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "80.0*x^79.0-5.0*x^4.0+1.0-a*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "80.0*x^79.0-5.0*x^4.0+1.0-a*0.0";
        UsageCalculus.EqnSolArrayMap3[1] = "x^80.0-x^5.0+x-a";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0/81.0*x^81.0-1.0/6.0*x^6.0+1.0/2.0*x^2.0-a*x";
        UsageCalculus.EqnSolArrayMap4[1] = "1.0/81.0*x^81.0-1.0/6.0*x^6.0+0.5*x^2.0-a*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "80.0*x^79.0-5.0*x^4.0+1.0-a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "80.0*79.0*x^78.0-5.0*4.0*x^3.0+0.0-a*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "6320.0*x^78.0-20.0*x^3.0-a*0.0";
        UsageCalculus.EqnSolArrayMap3[2] = "1.0/81.0*x^81.0-1.0/6.0*x^6.0+0.5*x^2.0-a*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/81.0/82.0*x^82.0-1.0/6.0/7.0*x^7.0+0.5/3.0*x^3.0-a/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "1.0/6642.0*x^82.0-1.0/42.0*x^7.0+0.16666666666666666*x^3.0-a/2.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "6320.0*x^78.0-20.0*x^3.0-a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "6320.0*78.0*x^77.0-20.0*3.0*x^2.0-a*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "492960.0*x^77.0-60.0*x^2.0-a*0.0";
        UsageCalculus.EqnSolArrayMap3[3] = "1.0/6642.0*x^82.0-1.0/42.0*x^7.0+0.16666666666666666*x^3.0-a/2.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/6642.0/83.0*x^83.0-1.0/42.0/8.0*x^8.0+0.16666666666666666/4.0*x^4.0-a/2.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "1.0/551286.0*x^83.0-1.0/336.0*x^8.0+0.041666666666666664*x^4.0-a/6.0*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "492960.0*x^77.0-60.0*x^2.0-a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "492960.0*77.0*x^76.0-60.0*2.0*x^1.0-a*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "3.795792E7*x^76.0-120.0*x-a*0.0";
        UsageCalculus.EqnSolArrayMap3[4] = "1.0/551286.0*x^83.0-1.0/336.0*x^8.0+0.041666666666666664*x^4.0-a/6.0*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/551286.0/84.0*x^84.0-1.0/336.0/9.0*x^9.0+0.041666666666666664/5.0*x^5.0-a/6.0/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "1.0/4.6308024E7*x^84.0-1.0/3024.0*x^9.0+0.008333333333333333*x^5.0-a/24.0*x^4.0";
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

    public static void TestCaseDiff110016() {
        //Test Case 110016
        UsageCalculus.TestCase = 110016;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^870.0-x^15.0-2.0*x-a";
        UsageCalculus.TestCaseName = "Simple: Product Integration";
        UsageCalculus.TestCaseMatrixID = "Coefficients:0.0:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Function";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "x^870.0-x^15.0-2.0*x-a";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "870.0*x^869.0-15.0*x^14.0-2.0-a*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "870.0*x^869.0-15.0*x^14.0-2.0-a*0.0";
        UsageCalculus.EqnSolArrayMap3[1] = "x^870.0-x^15.0-2.0*x-a";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0/871.0*x^871.0-1.0/16.0*x^16.0-x^2.0-a*x";
        UsageCalculus.EqnSolArrayMap4[1] = "1.0/871.0*x^871.0-0.0625*x^16.0-x^2.0-a*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "870.0*x^869.0-15.0*x^14.0-2.0-a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "870.0*869.0*x^868.0-15.0*14.0*x^13.0-0.0-a*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "756030.0*x^868.0-210.0*x^13.0-a*0.0";
        UsageCalculus.EqnSolArrayMap3[2] = "1.0/871.0*x^871.0-0.0625*x^16.0-x^2.0-a*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/871.0/872.0*x^872.0-0.0625/17.0*x^17.0-1.0/3.0*x^3.0-a/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "1.0/759512.0*x^872.0-1.0/272.0*x^17.0-0.3333333333333333*x^3.0-a/2.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "756030.0*x^868.0-210.0*x^13.0-a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "756030.0*868.0*x^867.0-210.0*13.0*x^12.0-a*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "6.5623404E8*x^867.0-2730.0*x^12.0-a*0.0";
        UsageCalculus.EqnSolArrayMap3[3] = "1.0/759512.0*x^872.0-1.0/272.0*x^17.0-0.3333333333333333*x^3.0-a/2.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/759512.0/873.0*x^873.0-1.0/272.0/18.0*x^18.0-0.3333333333333333/4.0*x^4.0-a/2.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "1.0/6.63053976E8*x^873.0-1.0/4896.0*x^18.0-0.08333333333333333*x^4.0-a/6.0*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "6.5623404E8*x^867.0-2730.0*x^12.0-a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "6.5623404E8*867.0*x^866.0-2730.0*12.0*x^11.0-a*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "5.6895491268E11*x^866.0-32760.0*x^11.0-a*0.0";
        UsageCalculus.EqnSolArrayMap3[4] = "1.0/6.63053976E8*x^873.0-1.0/4896.0*x^18.0-0.08333333333333333*x^4.0-a/6.0*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/874.0*x^874.0-1.0/4896.0/19.0*x^19.0-0.08333333333333333/5.0*x^5.0-a/6.0/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "1.0/874.0*x^874.0-1.0/93024.0*x^19.0-0.016666666666666666*x^5.0-a/24.0*x^4.0";
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

    public static void TestCaseDiff110017() {
        //Test Case 110017
        UsageCalculus.TestCase = 110017;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^87.0-x^1.0-2.0/x-25";
        UsageCalculus.TestCaseName = "Simple: Product Integration";
        UsageCalculus.TestCaseMatrixID = "Coefficients:0.0:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Function";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;

        UsageCalculus.EqnSolArrayMap1[1] = "x^87.0-x-2.0/x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "87.0*x^86.0-1.0+2.0/x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "87.0*x^86.0-1.0+2.0/x^2.0";
        UsageCalculus.EqnSolArrayMap3[1] = "x^87.0-x-2.0/x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0/88.0*x^88.0-1.0/2.0*x^2.0-2.0*ln(x)-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "1.0/88.0*x^88.0-1.0/2.0*x^2.0-2.0*ln(x)-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "87.0*x^86.0-1.0+2.0/x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "87.0*86.0*x^85.0-0.0+2.0*-2.0/x^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "7482.0*x^85.0-4.0/x^3.0";
        UsageCalculus.EqnSolArrayMap3[2] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "";
        UsageCalculus.EqnSolArrayMap4[2] = "";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "7482.0*x^85.0-4.0/x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "7482.0*85.0*x^84.0-4.0*-3.0/x^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "635970.0*x^84.0+12.0/x^4.0";
        UsageCalculus.EqnSolArrayMap3[3] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "";
        UsageCalculus.EqnSolArrayMap4[3] = "";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "635970.0*x^84.0+12.0/x^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "635970.0*84.0*x^83.0+12.0*-4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "5.342148E7*x^83.0-48.0/x^5.0";
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

    public static void TestCaseDiff110018() {
        //Test Case 110018
        UsageCalculus.TestCase = 110018;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^87.0-x^1.0+a*x-b";
        UsageCalculus.TestCaseName = "Simple: Product Integration";
        UsageCalculus.TestCaseMatrixID = "Coefficients:0.0:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Function";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "x^87.0-x+a*x-b";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "87.0*x^86.0-1.0+a-b*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "87.0*x^86.0-1.0+a-b*0.0";
        UsageCalculus.EqnSolArrayMap3[1] = "x^87.0-x+a*x-b";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0/88.0*x^88.0-1.0/2.0*x^2.0+a/2.0*x^2.0-b*x";
        UsageCalculus.EqnSolArrayMap4[1] = "1.0/88.0*x^88.0-0.5*x^2.0+a/2.0*x^2.0-b*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "87.0*x^86.0-1.0+a-b*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "87.0*86.0*x^85.0-0.0+a*0.0-b*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "7482.0*x^85.0+a*0.0-b*0.0";
        UsageCalculus.EqnSolArrayMap3[2] = "1.0/88.0*x^88.0-0.5*x^2.0+a/2.0*x^2.0-b*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/88.0/89.0*x^89.0-0.5/3.0*x^3.0+a/2.0/3.0*x^3.0-b/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "1.0/7832.0*x^89.0-0.16666666666666666*x^3.0+a*0.16666666666666666*x^3.0-b/2.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "7482.0*x^85.0+a*0.0-b*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "7482.0*85.0*x^84.0+a*0.0-b*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "635970.0*x^84.0+a*0.0-b*0.0";
        UsageCalculus.EqnSolArrayMap3[3] = "1.0/7832.0*x^89.0-0.16666666666666666*x^3.0+a*0.16666666666666666*x^3.0-b/2.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/7832.0/90.0*x^90.0-0.16666666666666666/4.0*x^4.0+a*0.16666666666666666/4.0*x^4.0-b/2.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "1.0/704880.0*x^90.0-0.041666666666666664*x^4.0+a*0.041666666666666664*x^4.0-b/6.0*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "635970.0*x^84.0+a*0.0-b*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "635970.0*84.0*x^83.0+a*0.0-b*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "5.342148E7*x^83.0+a*0.0-b*0.0";
        UsageCalculus.EqnSolArrayMap3[4] = "1.0/704880.0*x^90.0-0.041666666666666664*x^4.0+a*0.041666666666666664*x^4.0-b/6.0*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/704880.0/91.0*x^91.0-0.041666666666666664/5.0*x^5.0+a*0.041666666666666664/5.0*x^5.0-b/6.0/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "1.0/6.414408E7*x^91.0-0.008333333333333333*x^5.0+a*0.008333333333333333*x^5.0-b/24.0*x^4.0";
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

    public static void TestCaseDiff110019() {
        //Test Case 110019
        UsageCalculus.TestCase = 110019;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^87.0-x^1.0-x^8*x-19";
        UsageCalculus.TestCaseName = "Simple: Product Integration";
        UsageCalculus.TestCaseMatrixID = "Coefficients:0.0:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Function";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "x^87.0-x-x^9.0-19.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "87.0*x^86.0-1.0-9.0*x^8.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "87.0*x^86.0-1.0-9.0*x^8.0";
        UsageCalculus.EqnSolArrayMap3[1] = "x^87.0-x-x^9.0-19.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0/88.0*x^88.0-1.0/2.0*x^2.0-1.0/10.0*x^10.0-19.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "1.0/88.0*x^88.0-1.0/2.0*x^2.0-1.0/10.0*x^10.0-19.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "87.0*x^86.0-1.0-9.0*x^8.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "87.0*86.0*x^85.0-0.0-9.0*8.0*x^7.0";
        UsageCalculus.EqnSolArrayMap2[2] = "7482.0*x^85.0-72.0*x^7.0";
        UsageCalculus.EqnSolArrayMap3[2] = "1.0/88.0*x^88.0-1.0/2.0*x^2.0-1.0/10.0*x^10.0-19.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/88.0/89.0*x^89.0-1.0/2.0/3.0*x^3.0-1.0/10.0/11.0*x^11.0-19.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "1.0/7832.0*x^89.0-1.0/6.0*x^3.0-1.0/110.0*x^11.0-9.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "7482.0*x^85.0-72.0*x^7.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "7482.0*85.0*x^84.0-72.0*7.0*x^6.0";
        UsageCalculus.EqnSolArrayMap2[3] = "635970.0*x^84.0-504.0*x^6.0";
        UsageCalculus.EqnSolArrayMap3[3] = "1.0/7832.0*x^89.0-1.0/6.0*x^3.0-1.0/110.0*x^11.0-9.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/7832.0/90.0*x^90.0-1.0/6.0/4.0*x^4.0-1.0/110.0/12.0*x^12.0-9.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "1.0/704880.0*x^90.0-1.0/24.0*x^4.0-1.0/1320.0*x^12.0-3.1666666666666665*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "635970.0*x^84.0-504.0*x^6.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "635970.0*84.0*x^83.0-504.0*6.0*x^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "5.342148E7*x^83.0-3024.0*x^5.0";
        UsageCalculus.EqnSolArrayMap3[4] = "1.0/704880.0*x^90.0-1.0/24.0*x^4.0-1.0/1320.0*x^12.0-3.1666666666666665*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/704880.0/91.0*x^91.0-1.0/24.0/5.0*x^5.0-1.0/1320.0/13.0*x^13.0-3.1666666666666665/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "1.0/6.414408E7*x^91.0-1.0/120.0*x^5.0-1.0/17160.0*x^13.0-1.0/1.2631578947368423*x^4.0";
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

    public static void TestCaseDiff110020() {
        //Test Case 110020
        UsageCalculus.TestCase = 110020;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^87.0-x^1.0-x^0*x-25";
        UsageCalculus.TestCaseName = "Simple: Product Integration";
        UsageCalculus.TestCaseMatrixID = "Coefficients:0.0:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Function";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "x^87.0-x-x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "87.0*x^86.0-1.0-1.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "87.0*x^86.0-1.0-1.0";
        UsageCalculus.EqnSolArrayMap3[1] = "x^87.0-x-x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0/88.0*x^88.0-1.0/2.0*x^2.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "1.0/88.0*x^88.0-1.0/2.0*x^2.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "87.0*x^86.0-1.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "87.0*86.0*x^85.0-0.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "7482.0*x^85.0";
        UsageCalculus.EqnSolArrayMap3[2] = "1.0/88.0*x^88.0-1.0/2.0*x^2.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/88.0/89.0*x^89.0-1.0/2.0/3.0*x^3.0-1.0/2.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "1.0/7832.0*x^89.0-1.0/6.0*x^3.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "7482.0*x^85.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "7482.0*85.0*x^84.0";
        UsageCalculus.EqnSolArrayMap2[3] = "635970.0*x^84.0";
        UsageCalculus.EqnSolArrayMap3[3] = "1.0/7832.0*x^89.0-1.0/6.0*x^3.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/7832.0/90.0*x^90.0-1.0/6.0/4.0*x^4.0-1.0/6.0/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "1.0/704880.0*x^90.0-1.0/24.0*x^4.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "635970.0*x^84.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "635970.0*84.0*x^83.0";
        UsageCalculus.EqnSolArrayMap2[4] = "5.342148E7*x^83.0";
        UsageCalculus.EqnSolArrayMap3[4] = "1.0/704880.0*x^90.0-1.0/24.0*x^4.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/704880.0/91.0*x^91.0-1.0/24.0/5.0*x^5.0-1.0/24.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "1.0/6.414408E7*x^91.0-1.0/120.0*x^5.0-1.0/120.0*x^5.0-1.0416666666666667*x^4.0";
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

    public static void TestCaseDiff110021() {
        //Test Case 110021
        UsageCalculus.TestCase = 110021;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^87.0-x^1.0-x^1.0*x-25";
        UsageCalculus.TestCaseName = "Simple: Product Integration";
        UsageCalculus.TestCaseMatrixID = "Coefficients:0.0:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Function";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "x^87.0-x-x^2.0-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "87.0*x^86.0-1.0-2.0*x^1.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "87.0*x^86.0-1.0-2.0*x";
        UsageCalculus.EqnSolArrayMap3[1] = "x^87.0-x-x^2.0-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0/88.0*x^88.0-1.0/2.0*x^2.0-1.0/3.0*x^3.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "1.0/88.0*x^88.0-1.0/2.0*x^2.0-1.0/3.0*x^3.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "87.0*x^86.0-1.0-2.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "87.0*86.0*x^85.0-0.0-2.0";
        UsageCalculus.EqnSolArrayMap2[2] = "7482.0*x^85.0-2.0";
        UsageCalculus.EqnSolArrayMap3[2] = "1.0/88.0*x^88.0-1.0/2.0*x^2.0-1.0/3.0*x^3.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/88.0/89.0*x^89.0-1.0/2.0/3.0*x^3.0-1.0/3.0/4.0*x^4.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "1.0/7832.0*x^89.0-1.0/6.0*x^3.0-1.0/12.0*x^4.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "7482.0*x^85.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "7482.0*85.0*x^84.0-0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "635970.0*x^84.0";
        UsageCalculus.EqnSolArrayMap3[3] = "1.0/7832.0*x^89.0-1.0/6.0*x^3.0-1.0/12.0*x^4.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/7832.0/90.0*x^90.0-1.0/6.0/4.0*x^4.0-1.0/12.0/5.0*x^5.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "1.0/704880.0*x^90.0-1.0/24.0*x^4.0-1.0/60.0*x^5.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "635970.0*x^84.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "635970.0*84.0*x^83.0";
        UsageCalculus.EqnSolArrayMap2[4] = "5.342148E7*x^83.0";
        UsageCalculus.EqnSolArrayMap3[4] = "1.0/704880.0*x^90.0-1.0/24.0*x^4.0-1.0/60.0*x^5.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/704880.0/91.0*x^91.0-1.0/24.0/5.0*x^5.0-1.0/60.0/6.0*x^6.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "1.0/6.414408E7*x^91.0-1.0/120.0*x^5.0-1.0/360.0*x^6.0-1.0416666666666667*x^4.0";
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

    public static void TestCaseDiff110022() {
        //Test Case 110022
        UsageCalculus.TestCase = 110022;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^87.0-x^1.0-x^1.0*x-25+0.0";
        UsageCalculus.TestCaseName = "Simple: Product Integration";
        UsageCalculus.TestCaseMatrixID = "Coefficients:0.0:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Function";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "x^87.0-x-x^2.0-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "87.0*x^86.0-1.0-2.0*x^1.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "87.0*x^86.0-1.0-2.0*x";
        UsageCalculus.EqnSolArrayMap3[1] = "x^87.0-x-x^2.0-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0/88.0*x^88.0-1.0/2.0*x^2.0-1.0/3.0*x^3.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "1.0/88.0*x^88.0-1.0/2.0*x^2.0-1.0/3.0*x^3.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "87.0*x^86.0-1.0-2.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "87.0*86.0*x^85.0-0.0-2.0";
        UsageCalculus.EqnSolArrayMap2[2] = "7482.0*x^85.0-2.0";
        UsageCalculus.EqnSolArrayMap3[2] = "1.0/88.0*x^88.0-1.0/2.0*x^2.0-1.0/3.0*x^3.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/88.0/89.0*x^89.0-1.0/2.0/3.0*x^3.0-1.0/3.0/4.0*x^4.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "1.0/7832.0*x^89.0-1.0/6.0*x^3.0-1.0/12.0*x^4.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "7482.0*x^85.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "7482.0*85.0*x^84.0-0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "635970.0*x^84.0";
        UsageCalculus.EqnSolArrayMap3[3] = "1.0/7832.0*x^89.0-1.0/6.0*x^3.0-1.0/12.0*x^4.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/7832.0/90.0*x^90.0-1.0/6.0/4.0*x^4.0-1.0/12.0/5.0*x^5.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "1.0/704880.0*x^90.0-1.0/24.0*x^4.0-1.0/60.0*x^5.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "635970.0*x^84.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "635970.0*84.0*x^83.0";
        UsageCalculus.EqnSolArrayMap2[4] = "5.342148E7*x^83.0";
        UsageCalculus.EqnSolArrayMap3[4] = "1.0/704880.0*x^90.0-1.0/24.0*x^4.0-1.0/60.0*x^5.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/704880.0/91.0*x^91.0-1.0/24.0/5.0*x^5.0-1.0/60.0/6.0*x^6.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "1.0/6.414408E7*x^91.0-1.0/120.0*x^5.0-1.0/360.0*x^6.0-1.0416666666666667*x^4.0";
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

    public static void TestCaseDiff110023() {
        //Test Case 110023
        UsageCalculus.TestCase = 110023;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "-a-a*0.0";
        UsageCalculus.TestCaseName = "Simple: Product Integration";
        UsageCalculus.TestCaseMatrixID = "Coefficients:0.0:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Function";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "-a-a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-a*0.0-a*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-a*0.0-a*0.0";
        UsageCalculus.EqnSolArrayMap3[1] = "-a-a*0.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "-a*x-0.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "-a*x-0.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-a*0.0-a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-a*0.0-a*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-a*0.0-a*0.0";
        UsageCalculus.EqnSolArrayMap3[2] = "-a*x-0.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "-a/2.0*x^2.0-0.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "-a/2.0*x^2.0-0.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-a*0.0-a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-a*0.0-a*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-a*0.0-a*0.0";
        UsageCalculus.EqnSolArrayMap3[3] = "-a/2.0*x^2.0-0.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "-a/2.0/3.0*x^3.0-0.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "-a/6.0*x^3.0-0.0*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-a*0.0-a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-a*0.0-a*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-a*0.0-a*0.0";
        UsageCalculus.EqnSolArrayMap3[4] = "-a/6.0*x^3.0-0.0*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "-a/6.0/4.0*x^4.0-0.0/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "-a/24.0*x^4.0-0.0*x^4.0";
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
    public static void TestCaseDiff110024() {
        //Test Case 1005
        UsageCalculus.TestCase = 110024;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(a+b+c^2)*x^8 + (a+b+c^2)*x^5 + (a+b+c^2)/x^4 - (a+b+c^2)*x - 25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:";
        UsageCalculus.TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^8.0*(a+b+c^2.0)+x^5.0*(a+b+c^2.0)+x^4.0*(a+b+c^2.0)-x*(a+b+c^2.0)-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*x^7.0*(a+b+c^2.0)+5.0*x^4.0*(a+b+c^2.0)+4.0*x^3.0*(a+b+c^2.0)-(a+b+c^2.0)-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*x^7.0*(a+b+c^2.0)+5.0*x^4.0*(a+b+c^2.0)+4.0*x^3.0*(a+b+c^2.0)-(a+b+c^2.0)";
        UsageCalculus.EqnSolArrayMap3[1]="x^8.0*(a+b+c^2.0)+x^5.0*(a+b+c^2.0)+x^-4.0*(a+b+c^2.0)-x*(a+b+c^2.0)-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="x^8.0*(a+b+c^2.0)+x^5.0*(a+b+c^2.0)+x^-4.0*(a+b+c^2.0)-x*(a+b+c^2.0)-25.0";
        UsageCalculus.EqnSolArrayMap4[1]="x^8.0*(a+b+c^2.0)+x^5.0*(a+b+c^2.0)+x^-4.0*(a+b+c^2.0)-x*(a+b+c^2.0)-25.0";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4]="";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="";
        UsageCalculus.EqnSolArrayMap4[4]="";
        UsageCalculus.EqnSolOrder[4] = 4;
        
        UsageCalculus.EqnSolArrayMap1[5] = "";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "";
        UsageCalculus.EqnSolArrayMap2[5] = "";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "";
        UsageCalculus.EqnSolArrayMap2[6] = "";
        UsageCalculus.EqnSolArrayMap3[6]="";
        UsageCalculus.EqnSolArrayIntegrAlone[6]="";
        UsageCalculus.EqnSolArrayMap4[6]="";
        UsageCalculus.EqnSolOrder[6] = 6;

        UsageCalculus.EqnSolArrayMap1[7] = "";
        UsageCalculus.EqnSolArrayDiffAlone[7] = "";
        UsageCalculus.EqnSolArrayMap2[7] = "";
        UsageCalculus.EqnSolArrayMap3[7]="";
        UsageCalculus.EqnSolArrayIntegrAlone[7]="";
        UsageCalculus.EqnSolArrayMap4[7]="";
        UsageCalculus.EqnSolOrder[7] = 7;

        UsageCalculus.EqnSolArrayMap1[8] = "";
        UsageCalculus.EqnSolArrayDiffAlone[8] = "";
        UsageCalculus.EqnSolArrayMap2[8] = "";
        UsageCalculus.EqnSolArrayMap3[8]="";
        UsageCalculus.EqnSolArrayIntegrAlone[8]="";
        UsageCalculus.EqnSolArrayMap4[8]="";
        UsageCalculus.EqnSolOrder[8] = 8;

        UsageCalculus.EqnSolArrayMap1[9] = "";
        UsageCalculus.EqnSolArrayDiffAlone[9] = "";
        UsageCalculus.EqnSolArrayMap2[9] = "";
        UsageCalculus.EqnSolArrayMap3[9]="";
        UsageCalculus.EqnSolArrayIntegrAlone[9]="";
        UsageCalculus.EqnSolArrayMap4[9]="";
        UsageCalculus.EqnSolOrder[9] = 9;

        UsageCalculus.EqnSolArrayMap1[10] = "";
        UsageCalculus.EqnSolArrayDiffAlone[10] = "";
        UsageCalculus.EqnSolArrayMap2[10] = "";
        UsageCalculus.EqnSolArrayMap3[10]="";
        UsageCalculus.EqnSolArrayIntegrAlone[10]="";
        UsageCalculus.EqnSolArrayMap4[10]="";
        UsageCalculus.EqnSolOrder[10] = 10;

        UsageCalculus.EqnSolArrayMap1[11] = "";
        UsageCalculus.EqnSolArrayDiffAlone[11] = "";
        UsageCalculus.EqnSolArrayMap2[11] = "";
        UsageCalculus.EqnSolArrayMap3[11]="";
        UsageCalculus.EqnSolArrayIntegrAlone[11]="";
        UsageCalculus.EqnSolArrayMap4[11]="";
        UsageCalculus.EqnSolOrder[11] = 11;

        UsageCalculus.EqnSolArrayMap1[12] = "";
        UsageCalculus.EqnSolArrayDiffAlone[12] = "";
        UsageCalculus.EqnSolArrayMap2[12] = "";
        UsageCalculus.EqnSolArrayMap3[12]="";
        UsageCalculus.EqnSolArrayIntegrAlone[12]="";
        UsageCalculus.EqnSolArrayMap4[12]="";
        UsageCalculus.EqnSolOrder[12] = 12;

        UsageCalculus.EqnSolArrayMap1[13] = "";
        UsageCalculus.EqnSolArrayDiffAlone[13] = "";
        UsageCalculus.EqnSolArrayMap2[13] = "";
        UsageCalculus.EqnSolArrayMap3[13]="";
        UsageCalculus.EqnSolArrayIntegrAlone[13]="";
        UsageCalculus.EqnSolArrayMap4[13]="";
        UsageCalculus.EqnSolOrder[13] = 13;

        UsageCalculus.EqnSolArrayMap1[14] = "";
        UsageCalculus.EqnSolArrayDiffAlone[14] = "";
        UsageCalculus.EqnSolArrayMap2[14] = "";
        UsageCalculus.EqnSolArrayMap3[14]="";
        UsageCalculus.EqnSolArrayIntegrAlone[14]="";
        UsageCalculus.EqnSolArrayMap4[14]="";
        UsageCalculus.EqnSolOrder[14] = 14;
    }
    public static void TestCaseDiff110025() {
        //Test Case 1005
        UsageCalculus.TestCase = 110025;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(a+b+x*c^2)*x^8 + (a+b+x*c^2)*x^5 + (a+b+x*c^2)/x^4 - (a+b+x*c^2)*x - 25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:";
        UsageCalculus.TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^8.0*(a+b+x*c^2.0)+x^5.0*(a+b+x*c^2.0)+x^4.0*(a+b+x*c^2.0)-x*(a+b+x*c^2.0)-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*x^7.0*(a+b+c^2.0)+5.0*x^4.0*(a+b+c^2.0)+4.0*x^3.0*(a+b+c^2.0)-(a+b+c^2.0)-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*x^7.0*(a+b+c^2.0)+5.0*x^4.0*(a+b+c^2.0)+4.0*x^3.0*(a+b+c^2.0)-(a+b+c^2.0)";
        UsageCalculus.EqnSolArrayMap3[1]="x^8.0*(a+b+c^2.0)+x^5.0*(a+b+c^2.0)+x^-4.0*(a+b+c^2.0)-x*(a+b+c^2.0)-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="x^8.0*(a+b+c^2.0)+x^5.0*(a+b+c^2.0)+x^-4.0*(a+b+c^2.0)-x*(a+b+c^2.0)-25.0";
        UsageCalculus.EqnSolArrayMap4[1]="x^8.0*(a+b+c^2.0)+x^5.0*(a+b+c^2.0)+x^-4.0*(a+b+c^2.0)-x*(a+b+c^2.0)-25.0";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4]="";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="";
        UsageCalculus.EqnSolArrayMap4[4]="";
        UsageCalculus.EqnSolOrder[4] = 4;
        
        UsageCalculus.EqnSolArrayMap1[5] = "";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "";
        UsageCalculus.EqnSolArrayMap2[5] = "";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "";
        UsageCalculus.EqnSolArrayMap2[6] = "";
        UsageCalculus.EqnSolArrayMap3[6]="";
        UsageCalculus.EqnSolArrayIntegrAlone[6]="";
        UsageCalculus.EqnSolArrayMap4[6]="";
        UsageCalculus.EqnSolOrder[6] = 6;

        UsageCalculus.EqnSolArrayMap1[7] = "";
        UsageCalculus.EqnSolArrayDiffAlone[7] = "";
        UsageCalculus.EqnSolArrayMap2[7] = "";
        UsageCalculus.EqnSolArrayMap3[7]="";
        UsageCalculus.EqnSolArrayIntegrAlone[7]="";
        UsageCalculus.EqnSolArrayMap4[7]="";
        UsageCalculus.EqnSolOrder[7] = 7;

        UsageCalculus.EqnSolArrayMap1[8] = "";
        UsageCalculus.EqnSolArrayDiffAlone[8] = "";
        UsageCalculus.EqnSolArrayMap2[8] = "";
        UsageCalculus.EqnSolArrayMap3[8]="";
        UsageCalculus.EqnSolArrayIntegrAlone[8]="";
        UsageCalculus.EqnSolArrayMap4[8]="";
        UsageCalculus.EqnSolOrder[8] = 8;

        UsageCalculus.EqnSolArrayMap1[9] = "";
        UsageCalculus.EqnSolArrayDiffAlone[9] = "";
        UsageCalculus.EqnSolArrayMap2[9] = "";
        UsageCalculus.EqnSolArrayMap3[9]="";
        UsageCalculus.EqnSolArrayIntegrAlone[9]="";
        UsageCalculus.EqnSolArrayMap4[9]="";
        UsageCalculus.EqnSolOrder[9] = 9;

        UsageCalculus.EqnSolArrayMap1[10] = "";
        UsageCalculus.EqnSolArrayDiffAlone[10] = "";
        UsageCalculus.EqnSolArrayMap2[10] = "";
        UsageCalculus.EqnSolArrayMap3[10]="";
        UsageCalculus.EqnSolArrayIntegrAlone[10]="";
        UsageCalculus.EqnSolArrayMap4[10]="";
        UsageCalculus.EqnSolOrder[10] = 10;

        UsageCalculus.EqnSolArrayMap1[11] = "";
        UsageCalculus.EqnSolArrayDiffAlone[11] = "";
        UsageCalculus.EqnSolArrayMap2[11] = "";
        UsageCalculus.EqnSolArrayMap3[11]="";
        UsageCalculus.EqnSolArrayIntegrAlone[11]="";
        UsageCalculus.EqnSolArrayMap4[11]="";
        UsageCalculus.EqnSolOrder[11] = 11;

        UsageCalculus.EqnSolArrayMap1[12] = "";
        UsageCalculus.EqnSolArrayDiffAlone[12] = "";
        UsageCalculus.EqnSolArrayMap2[12] = "";
        UsageCalculus.EqnSolArrayMap3[12]="";
        UsageCalculus.EqnSolArrayIntegrAlone[12]="";
        UsageCalculus.EqnSolArrayMap4[12]="";
        UsageCalculus.EqnSolOrder[12] = 12;

        UsageCalculus.EqnSolArrayMap1[13] = "";
        UsageCalculus.EqnSolArrayDiffAlone[13] = "";
        UsageCalculus.EqnSolArrayMap2[13] = "";
        UsageCalculus.EqnSolArrayMap3[13]="";
        UsageCalculus.EqnSolArrayIntegrAlone[13]="";
        UsageCalculus.EqnSolArrayMap4[13]="";
        UsageCalculus.EqnSolOrder[13] = 13;

        UsageCalculus.EqnSolArrayMap1[14] = "";
        UsageCalculus.EqnSolArrayDiffAlone[14] = "";
        UsageCalculus.EqnSolArrayMap2[14] = "";
        UsageCalculus.EqnSolArrayMap3[14]="";
        UsageCalculus.EqnSolArrayIntegrAlone[14]="";
        UsageCalculus.EqnSolArrayMap4[14]="";
        UsageCalculus.EqnSolOrder[14] = 14;
    }
        public static void TestCaseDiff110026() {
        //Test Case 1005
        UsageCalculus.TestCase = 110026;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "-(a+b+a^2.0)-0.0";
        UsageCalculus.TestCaseName = "Simple: Coefficients:";
        UsageCalculus.TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-(a+b+a^2.0)-0.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*x^7.0*(a+b+c^2.0)+5.0*x^4.0*(a+b+c^2.0)+4.0*x^3.0*(a+b+c^2.0)-(a+b+c^2.0)-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*x^7.0*(a+b+c^2.0)+5.0*x^4.0*(a+b+c^2.0)+4.0*x^3.0*(a+b+c^2.0)-(a+b+c^2.0)";
        UsageCalculus.EqnSolArrayMap3[1]="-(a+b+a^2.0)-0.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="x^8.0*(a+b+c^2.0)+x^5.0*(a+b+c^2.0)+x^-4.0*(a+b+c^2.0)-x*(a+b+c^2.0)-25.0";
        UsageCalculus.EqnSolArrayMap4[1]="x^8.0*(a+b+c^2.0)+x^5.0*(a+b+c^2.0)+x^-4.0*(a+b+c^2.0)-x*(a+b+c^2.0)-25.0";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4]="";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="";
        UsageCalculus.EqnSolArrayMap4[4]="";
        UsageCalculus.EqnSolOrder[4] = 4;
        
        UsageCalculus.EqnSolArrayMap1[5] = "";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "";
        UsageCalculus.EqnSolArrayMap2[5] = "";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "";
        UsageCalculus.EqnSolArrayMap2[6] = "";
        UsageCalculus.EqnSolArrayMap3[6]="";
        UsageCalculus.EqnSolArrayIntegrAlone[6]="";
        UsageCalculus.EqnSolArrayMap4[6]="";
        UsageCalculus.EqnSolOrder[6] = 6;

        UsageCalculus.EqnSolArrayMap1[7] = "";
        UsageCalculus.EqnSolArrayDiffAlone[7] = "";
        UsageCalculus.EqnSolArrayMap2[7] = "";
        UsageCalculus.EqnSolArrayMap3[7]="";
        UsageCalculus.EqnSolArrayIntegrAlone[7]="";
        UsageCalculus.EqnSolArrayMap4[7]="";
        UsageCalculus.EqnSolOrder[7] = 7;

        UsageCalculus.EqnSolArrayMap1[8] = "";
        UsageCalculus.EqnSolArrayDiffAlone[8] = "";
        UsageCalculus.EqnSolArrayMap2[8] = "";
        UsageCalculus.EqnSolArrayMap3[8]="";
        UsageCalculus.EqnSolArrayIntegrAlone[8]="";
        UsageCalculus.EqnSolArrayMap4[8]="";
        UsageCalculus.EqnSolOrder[8] = 8;

        UsageCalculus.EqnSolArrayMap1[9] = "";
        UsageCalculus.EqnSolArrayDiffAlone[9] = "";
        UsageCalculus.EqnSolArrayMap2[9] = "";
        UsageCalculus.EqnSolArrayMap3[9]="";
        UsageCalculus.EqnSolArrayIntegrAlone[9]="";
        UsageCalculus.EqnSolArrayMap4[9]="";
        UsageCalculus.EqnSolOrder[9] = 9;

        UsageCalculus.EqnSolArrayMap1[10] = "";
        UsageCalculus.EqnSolArrayDiffAlone[10] = "";
        UsageCalculus.EqnSolArrayMap2[10] = "";
        UsageCalculus.EqnSolArrayMap3[10]="";
        UsageCalculus.EqnSolArrayIntegrAlone[10]="";
        UsageCalculus.EqnSolArrayMap4[10]="";
        UsageCalculus.EqnSolOrder[10] = 10;

        UsageCalculus.EqnSolArrayMap1[11] = "";
        UsageCalculus.EqnSolArrayDiffAlone[11] = "";
        UsageCalculus.EqnSolArrayMap2[11] = "";
        UsageCalculus.EqnSolArrayMap3[11]="";
        UsageCalculus.EqnSolArrayIntegrAlone[11]="";
        UsageCalculus.EqnSolArrayMap4[11]="";
        UsageCalculus.EqnSolOrder[11] = 11;

        UsageCalculus.EqnSolArrayMap1[12] = "";
        UsageCalculus.EqnSolArrayDiffAlone[12] = "";
        UsageCalculus.EqnSolArrayMap2[12] = "";
        UsageCalculus.EqnSolArrayMap3[12]="";
        UsageCalculus.EqnSolArrayIntegrAlone[12]="";
        UsageCalculus.EqnSolArrayMap4[12]="";
        UsageCalculus.EqnSolOrder[12] = 12;

        UsageCalculus.EqnSolArrayMap1[13] = "";
        UsageCalculus.EqnSolArrayDiffAlone[13] = "";
        UsageCalculus.EqnSolArrayMap2[13] = "";
        UsageCalculus.EqnSolArrayMap3[13]="";
        UsageCalculus.EqnSolArrayIntegrAlone[13]="";
        UsageCalculus.EqnSolArrayMap4[13]="";
        UsageCalculus.EqnSolOrder[13] = 13;

        UsageCalculus.EqnSolArrayMap1[14] = "";
        UsageCalculus.EqnSolArrayDiffAlone[14] = "";
        UsageCalculus.EqnSolArrayMap2[14] = "";
        UsageCalculus.EqnSolArrayMap3[14]="";
        UsageCalculus.EqnSolArrayIntegrAlone[14]="";
        UsageCalculus.EqnSolArrayMap4[14]="";
        UsageCalculus.EqnSolOrder[14] = 14;
    }
        public static void TestCaseDiff110027() {
        //Test Case 1005
        UsageCalculus.TestCase = 110027;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x + x + x - x - 25*2";
        UsageCalculus.TestCaseName = "Simple: Coefficients:";
        UsageCalculus.TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 3;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x+x+x-x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0+1.0+1.0-1.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0+1.0+1.0-1.0";
        UsageCalculus.EqnSolArrayMap3[1]="x+x+x-x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/2.0*x^2.0+1.0/2.0*x^2.0+1.0/2.0*x^2.0-1.0/2.0*x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/2.0*x^2.0+1.0/2.0*x^2.0+1.0/2.0*x^2.0-1.0/2.0*x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0+1.0+1.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "0.0+1.0*0.0+1.0*0.0-1.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/2.0*x^2.0+1.0/2.0*x^2.0+1.0/2.0*x^2.0-1.0/2.0*x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/2.0/3.0*x^3.0+1.0/2.0/3.0*x^3.0+1.0/2.0/3.0*x^3.0-1.0/2.0/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/6.0*x^3.0+1.0/6.0*x^3.0+1.0/6.0*x^3.0-1.0/6.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/6.0*x^3.0+1.0/6.0*x^3.0+1.0/6.0*x^3.0-1.0/6.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/6.0/4.0*x^4.0+1.0/6.0/4.0*x^4.0+1.0/6.0/4.0*x^4.0-1.0/6.0/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/24.0*x^4.0+1.0/24.0*x^4.0+1.0/24.0*x^4.0-1.0/24.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/24.0*x^4.0+1.0/24.0*x^4.0+1.0/24.0*x^4.0-1.0/24.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/24.0/5.0*x^5.0+1.0/24.0/5.0*x^5.0+1.0/24.0/5.0*x^5.0-1.0/24.0/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/120.0*x^5.0+1.0/120.0*x^5.0+1.0/120.0*x^5.0-1.0/120.0*x^5.0-2.0833333333333335*x^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;
            
        UsageCalculus.EqnSolArrayMap1[5] = "";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "";
        UsageCalculus.EqnSolArrayMap2[5] = "";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "";
        UsageCalculus.EqnSolArrayMap2[6] = "";
        UsageCalculus.EqnSolArrayMap3[6]="";
        UsageCalculus.EqnSolArrayIntegrAlone[6]="";
        UsageCalculus.EqnSolArrayMap4[6]="";
        UsageCalculus.EqnSolOrder[6] = 6;

        UsageCalculus.EqnSolArrayMap1[7] = "";
        UsageCalculus.EqnSolArrayDiffAlone[7] = "";
        UsageCalculus.EqnSolArrayMap2[7] = "";
        UsageCalculus.EqnSolArrayMap3[7]="";
        UsageCalculus.EqnSolArrayIntegrAlone[7]="";
        UsageCalculus.EqnSolArrayMap4[7]="";
        UsageCalculus.EqnSolOrder[7] = 7;

        UsageCalculus.EqnSolArrayMap1[8] = "";
        UsageCalculus.EqnSolArrayDiffAlone[8] = "";
        UsageCalculus.EqnSolArrayMap2[8] = "";
        UsageCalculus.EqnSolArrayMap3[8]="";
        UsageCalculus.EqnSolArrayIntegrAlone[8]="";
        UsageCalculus.EqnSolArrayMap4[8]="";
        UsageCalculus.EqnSolOrder[8] = 8;

        UsageCalculus.EqnSolArrayMap1[9] = "";
        UsageCalculus.EqnSolArrayDiffAlone[9] = "";
        UsageCalculus.EqnSolArrayMap2[9] = "";
        UsageCalculus.EqnSolArrayMap3[9]="";
        UsageCalculus.EqnSolArrayIntegrAlone[9]="";
        UsageCalculus.EqnSolArrayMap4[9]="";
        UsageCalculus.EqnSolOrder[9] = 9;

        UsageCalculus.EqnSolArrayMap1[10] = "";
        UsageCalculus.EqnSolArrayDiffAlone[10] = "";
        UsageCalculus.EqnSolArrayMap2[10] = "";
        UsageCalculus.EqnSolArrayMap3[10]="";
        UsageCalculus.EqnSolArrayIntegrAlone[10]="";
        UsageCalculus.EqnSolArrayMap4[10]="";
        UsageCalculus.EqnSolOrder[10] = 10;

        UsageCalculus.EqnSolArrayMap1[11] = "";
        UsageCalculus.EqnSolArrayDiffAlone[11] = "";
        UsageCalculus.EqnSolArrayMap2[11] = "";
        UsageCalculus.EqnSolArrayMap3[11]="";
        UsageCalculus.EqnSolArrayIntegrAlone[11]="";
        UsageCalculus.EqnSolArrayMap4[11]="";
        UsageCalculus.EqnSolOrder[11] = 11;

        UsageCalculus.EqnSolArrayMap1[12] = "";
        UsageCalculus.EqnSolArrayDiffAlone[12] = "";
        UsageCalculus.EqnSolArrayMap2[12] = "";
        UsageCalculus.EqnSolArrayMap3[12]="";
        UsageCalculus.EqnSolArrayIntegrAlone[12]="";
        UsageCalculus.EqnSolArrayMap4[12]="";
        UsageCalculus.EqnSolOrder[12] = 12;

        UsageCalculus.EqnSolArrayMap1[13] = "";
        UsageCalculus.EqnSolArrayDiffAlone[13] = "";
        UsageCalculus.EqnSolArrayMap2[13] = "";
        UsageCalculus.EqnSolArrayMap3[13]="";
        UsageCalculus.EqnSolArrayIntegrAlone[13]="";
        UsageCalculus.EqnSolArrayMap4[13]="";
        UsageCalculus.EqnSolOrder[13] = 13;

        UsageCalculus.EqnSolArrayMap1[14] = "";
        UsageCalculus.EqnSolArrayDiffAlone[14] = "";
        UsageCalculus.EqnSolArrayMap2[14] = "";
        UsageCalculus.EqnSolArrayMap3[14]="";
        UsageCalculus.EqnSolArrayIntegrAlone[14]="";
        UsageCalculus.EqnSolArrayMap4[14]="";
        UsageCalculus.EqnSolOrder[14] = 14;
    }
     public static void TestCaseDiff110028() {
        //Test Case 1005
        UsageCalculus.TestCase = 110028;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0 + 2.0 + 3.0 - 4.0 - 25*3";
        UsageCalculus.TestCaseName = "Simple: Coefficients:";
        UsageCalculus.TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 3;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0+2.0+3.0-4.0-75.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+2.0*0.0+3.0*0.0-4.0*0.0-75.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "";
        UsageCalculus.EqnSolArrayMap3[1]="1.0+2.0+3.0-4.0-75.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0*x+2.0*x+3.0*x-4.0*x-75.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="x+2.0*x+3.0*x-4.0*x-75.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="x+2.0*x+3.0*x-4.0*x-75.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/2.0*x^2.0+x^2.0+3.0/2.0*x^2.0-4.0/2.0*x^2.0-75.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="0.5*x^2.0+x^2.0+1.5*x^2.0-2.0*x^2.0-37.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="0.5*x^2.0+x^2.0+1.5*x^2.0-2.0*x^2.0-37.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="0.5/3.0*x^3.0+1.0/3.0*x^3.0+1.5/3.0*x^3.0-2.0/3.0*x^3.0-37.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/6.0*x^3.0+1.0/3.0*x^3.0+1.0/2.0*x^3.0-1.0/1.5*x^3.0-12.5*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/6.0*x^3.0+1.0/3.0*x^3.0+1.0/2.0*x^3.0-1.0/1.5*x^3.0-12.5*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/6.0/4.0*x^4.0+1.0/3.0/4.0*x^4.0+1.0/2.0/4.0*x^4.0-1.0/1.5/4.0*x^4.0-12.5/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/24.0*x^4.0+1.0/12.0*x^4.0+1.0/8.0*x^4.0-1.0/6.0*x^4.0-3.125*x^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;
        
        UsageCalculus.EqnSolArrayMap1[5] = "";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "";
        UsageCalculus.EqnSolArrayMap2[5] = "";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "";
        UsageCalculus.EqnSolArrayMap2[6] = "";
        UsageCalculus.EqnSolArrayMap3[6]="";
        UsageCalculus.EqnSolArrayIntegrAlone[6]="";
        UsageCalculus.EqnSolArrayMap4[6]="";
        UsageCalculus.EqnSolOrder[6] = 6;

        UsageCalculus.EqnSolArrayMap1[7] = "";
        UsageCalculus.EqnSolArrayDiffAlone[7] = "";
        UsageCalculus.EqnSolArrayMap2[7] = "";
        UsageCalculus.EqnSolArrayMap3[7]="";
        UsageCalculus.EqnSolArrayIntegrAlone[7]="";
        UsageCalculus.EqnSolArrayMap4[7]="";
        UsageCalculus.EqnSolOrder[7] = 7;

        UsageCalculus.EqnSolArrayMap1[8] = "";
        UsageCalculus.EqnSolArrayDiffAlone[8] = "";
        UsageCalculus.EqnSolArrayMap2[8] = "";
        UsageCalculus.EqnSolArrayMap3[8]="";
        UsageCalculus.EqnSolArrayIntegrAlone[8]="";
        UsageCalculus.EqnSolArrayMap4[8]="";
        UsageCalculus.EqnSolOrder[8] = 8;

        UsageCalculus.EqnSolArrayMap1[9] = "";
        UsageCalculus.EqnSolArrayDiffAlone[9] = "";
        UsageCalculus.EqnSolArrayMap2[9] = "";
        UsageCalculus.EqnSolArrayMap3[9]="";
        UsageCalculus.EqnSolArrayIntegrAlone[9]="";
        UsageCalculus.EqnSolArrayMap4[9]="";
        UsageCalculus.EqnSolOrder[9] = 9;

        UsageCalculus.EqnSolArrayMap1[10] = "";
        UsageCalculus.EqnSolArrayDiffAlone[10] = "";
        UsageCalculus.EqnSolArrayMap2[10] = "";
        UsageCalculus.EqnSolArrayMap3[10]="";
        UsageCalculus.EqnSolArrayIntegrAlone[10]="";
        UsageCalculus.EqnSolArrayMap4[10]="";
        UsageCalculus.EqnSolOrder[10] = 10;

        UsageCalculus.EqnSolArrayMap1[11] = "";
        UsageCalculus.EqnSolArrayDiffAlone[11] = "";
        UsageCalculus.EqnSolArrayMap2[11] = "";
        UsageCalculus.EqnSolArrayMap3[11]="";
        UsageCalculus.EqnSolArrayIntegrAlone[11]="";
        UsageCalculus.EqnSolArrayMap4[11]="";
        UsageCalculus.EqnSolOrder[11] = 11;

        UsageCalculus.EqnSolArrayMap1[12] = "";
        UsageCalculus.EqnSolArrayDiffAlone[12] = "";
        UsageCalculus.EqnSolArrayMap2[12] = "";
        UsageCalculus.EqnSolArrayMap3[12]="";
        UsageCalculus.EqnSolArrayIntegrAlone[12]="";
        UsageCalculus.EqnSolArrayMap4[12]="";
        UsageCalculus.EqnSolOrder[12] = 12;

        UsageCalculus.EqnSolArrayMap1[13] = "";
        UsageCalculus.EqnSolArrayDiffAlone[13] = "";
        UsageCalculus.EqnSolArrayMap2[13] = "";
        UsageCalculus.EqnSolArrayMap3[13]="";
        UsageCalculus.EqnSolArrayIntegrAlone[13]="";
        UsageCalculus.EqnSolArrayMap4[13]="";
        UsageCalculus.EqnSolOrder[13] = 13;

        UsageCalculus.EqnSolArrayMap1[14] = "";
        UsageCalculus.EqnSolArrayDiffAlone[14] = "";
        UsageCalculus.EqnSolArrayMap2[14] = "";
        UsageCalculus.EqnSolArrayMap3[14]="";
        UsageCalculus.EqnSolArrayIntegrAlone[14]="";
        UsageCalculus.EqnSolArrayMap4[14]="";
        UsageCalculus.EqnSolOrder[14] = 14;
   }
     public static void TestCaseDiff110029() {
        //Test Case 4023
        UsageCalculus.TestCase = 110029;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "2^a/x^8 + 2^a/x^5 + 2^a/x^4 - 2/2^a/x- 25/2/3^a";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID = "IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;

        UsageCalculus.EqnSolArrayMap1[1] = "2.0^a/x^8.0+2.0^a/x^5.0+2.0^a/x^4.0-1.0/2.0^a*2.0/x-1.0/3.0^a*12.5";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "2.0^a*-8.0/x^9.0+2.0^a*-5.0/x^6.0+2.0^a*-4.0/x^5.0+1.0/2.0^a*2.0/x^2.0-1.0/3.0^a*12.5*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-2.0^a*8.0/x^9.0-2.0^a*5.0/x^6.0-2.0^a*4.0/x^5.0+1.0/2.0^a*2.0/x^2.0-1.0/3.0^a*0.0";
        UsageCalculus.EqnSolArrayMap3[1] = "2.0^a/x^8.0+2.0^a/x^5.0+2.0^a/x^4.0-1.0/2.0^a*2.0/x-1.0/3.0^a*12.5";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "2.0^a/-7.0/x^7.0+2.0^a/-4.0/x^4.0+2.0^a/-3.0/x^3.0-1.0/2.0^a*2.0*ln(x)-1.0/3.0^a*12.5*x";
        UsageCalculus.EqnSolArrayMap4[1] = "-2.0^a/7.0/x^7.0-2.0^a/4.0/x^4.0-2.0^a/3.0/x^3.0-1.0/2.0^a*2.0*ln(x)-1.0/3.0^a*12.5*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-2.0^a*8.0/x^9.0-2.0^a*5.0/x^6.0-2.0^a*4.0/x^5.0+1.0/2.0^a*2.0/x^2.0-1.0/3.0^a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-2.0^a*8.0*-9.0/x^10.0-2.0^a*5.0*-6.0/x^7.0-2.0^a*4.0*-5.0/x^6.0+1.0/2.0^a*2.0*2.0*-2.0/x^3.0-1.0/3.0^a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "2.0^a*72.0/x^10.0+2.0^a*30.0/x^7.0+2.0^a*20.0/x^6.0-1.0/2.0^a*8.0/x^3.0-1.0/3.0^a*0.0";
        UsageCalculus.EqnSolArrayMap3[2] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "";
        UsageCalculus.EqnSolArrayMap4[2] = "";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "2.0^a*72.0/x^10.0+2.0^a*30.0/x^7.0+2.0^a*20.0/x^6.0-1.0/2.0^a*8.0/x^3.0-1.0/3.0^a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "2.0^a*72.0*-10.0/x^11.0+2.0^a*30.0*-7.0/x^8.0+2.0^a*20.0*-6.0/x^7.0-1.0/2.0^a*8.0*8.0*-3.0/x^4.0-1.0/3.0^a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-2.0^a*720.0/x^11.0-2.0^a*210.0/x^8.0-2.0^a*120.0/x^7.0+1.0/2.0^a*192.0/x^4.0-1.0/3.0^a*0.0";
        UsageCalculus.EqnSolArrayMap3[3] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "";
        UsageCalculus.EqnSolArrayMap4[3] = "";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-2.0^a*720.0/x^11.0-2.0^a*210.0/x^8.0-2.0^a*120.0/x^7.0+1.0/2.0^a*192.0/x^4.0-1.0/3.0^a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-2.0^a*720.0*-11.0/x^12.0-2.0^a*210.0*-8.0/x^9.0-2.0^a*120.0*-7.0/x^8.0+1.0/2.0^a*192.0*192.0*-4.0/x^5.0-1.0/3.0^a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "2.0^a*7920.0/x^12.0+2.0^a*1680.0/x^9.0+2.0^a*840.0/x^8.0-1.0/2.0^a*147456.0/x^5.0-1.0/3.0^a*0.0";
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
    /* **************************************** */
 /* ***************SoftwareEngg Test Case***************** */
 /* **************************************** */
}
