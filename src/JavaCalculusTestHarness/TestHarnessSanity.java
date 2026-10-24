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
import static Calculus.MathematicalTestHarness.IgnoreKnownIssuesFlag;
import static Calculus.MathematicalTestHarness.RunAllTestCasesFlag;
import Calculus.UsageCalculus;
import static Calculus.UsageCalculus.KnownIssueTestCasesFlag;
import static Calculus.UsageCalculus.KnownIssues;
import static Calculus.UsageCalculus.KnownIssuesTestCases;

/**
 *
 * @author Rajesh V Pai
 */
public class TestHarnessSanity {
    //Sanity Test Cases
    public static void SanityTestCases(String AlgoName, long j) {
        if (((!RunAllTestCasesFlag)&&(IgnoreKnownIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainIntegrTest")) && (IntegralGapInfinity(j))) 
                || ((!RunAllTestCasesFlag)&&(IgnoreKnownIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainDiffTest")) && (DifferentialGapInfinity(j)))) {
            KnownIssueTestCasesFlag=true;
            KnownIssues++;
            KnownIssuesTestCases.put(KnownIssues, "" + j);
            System.out.println(ConsoleColors.RED + "Infinity SanityTestCases TestCase:j= " + j + ": Infinite Loop GAP" + ConsoleColors.RESET);
        } else if (((!RunAllTestCasesFlag)&&(IgnoreKnownIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainIntegrTest")) && (IntegralGapException(j))) 
                || ((!RunAllTestCasesFlag)&&(IgnoreKnownIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainDiffTest")) && (DifferentialGapException(j)))) {
            KnownIssueTestCasesFlag=true;
            KnownIssuesTestCases.put(KnownIssues, "" + j);
            System.out.println(ConsoleColors.RED + "Exception SanityTestCases TestCase:j= " + j + ": Exception GAP" + ConsoleColors.RESET);
        } else {
            switch ((int)j) {
                case 4000:
                    TestCaseDiff4000();
                    break;
                case 4001:
                    TestCaseDiff4001();
                    break;
                case 4002:
                    TestCaseDiff4002();
                    break;
                case 4003:
                    TestCaseDiff4003();
                    break;
                case 4004:
                    TestCaseDiff4004();
                    break;
                case 4005:
                    TestCaseDiff4005();
                    break;
                case 4006:
                    TestCaseDiff4006();
                    break;
                case 4007:
                    TestCaseDiff4007();
                    break;
                case 4008:
                    TestCaseDiff4008();
                    break;
                case 4009:
                    TestCaseDiff4009();
                    break;
                case 4010:
                    TestCaseDiff4010();
                    break;
                case 4011:
                    TestCaseDiff4011();
                    break;
                case 4012:
                    TestCaseDiff4012();
                    break;
                case 4013:
                    TestCaseDiff4013();
                    break;
                case 4014:
                    TestCaseDiff4014();
                    break;
                case 4015:
                    TestCaseDiff4015();
                    break;
                case 4016:
                    TestCaseDiff4016();
                    break;
                case 4017:
                    TestCaseDiff4017();
                    break;
                case 4018:
                    TestCaseDiff4018();
                    break;
                case 4019:
                    TestCaseDiff4019();
                    break;
                case 4020:
                    TestCaseDiff4020();
                    break;
                case 4021:
                    TestCaseDiff4021();
                    break;
                case 4022:
                    TestCaseDiff4022();
                    break;
                case 4023:
                    TestCaseDiff4023();
                    break;
                case 4024:
                    TestCaseDiff4024();
                    break;
                case 4025:
                    TestCaseDiff4025();
                    break;
                case 4026:
                    TestCaseDiff4026();
                    break;
                case 4027:
                    TestCaseDiff4027();
                    break;
                case 4028:
                    TestCaseDiff4028();
                    break;
                case 4029:
                    TestCaseDiff4029();
                    break;
                case 4030:
                    TestCaseDiff4030();
                    break;
                case 4031:
                    TestCaseDiff4031();
                    break;
                case 4032:
                    TestCaseDiff4032();
                    break;
                case 4033:
                    TestCaseDiff4033();
                    break;
                default:
                    System.out.println(ConsoleColors.RED + "Names TestCase:j= " + j + ": Gap" + ConsoleColors.RESET);
                    break;
            }
        }
    }
    public static void TestCaseDiff4000() {
        //Test Case 4000
        UsageCalculus.TestCase = 4000;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0/1.0*x^8 + x^5 + x^4 - x - 25.0";
        UsageCalculus.FInverseEqn = "Not Computed";
        UsageCalculus.TestCaseName = "Standard:No Coefficients:Basic Equation";
        UsageCalculus.TestCaseMatrixID = "Sanity TestCase";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

        //Usage.EqnUnderTest="8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-1.0-0.0";
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

        UsageCalculus.EqnSolArrayMap1[5] = "1680.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "1680.0*4.0*x^3.0+120.0+0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "6720.0*x^3.0+120.0";
        UsageCalculus.EqnSolArrayMap3[5] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
        UsageCalculus.EqnSolArrayMap4[5] = "";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "6720.0*x^3.0+120.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "6720.0*3.0*x^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "20160.0*x^2.0";
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
        UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
        UsageCalculus.EqnSolOrder[8] = 8;

        UsageCalculus.EqnSolArrayMap1[9] = "";
        UsageCalculus.EqnSolArrayDiffAlone[9] = "";
        UsageCalculus.EqnSolArrayMap2[9] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
        UsageCalculus.EqnSolOrder[9] = 9;

        UsageCalculus.EqnSolArrayMap1[10] = "";
        UsageCalculus.EqnSolArrayDiffAlone[10] = "";
        UsageCalculus.EqnSolArrayMap2[10] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
        UsageCalculus.EqnSolOrder[10] = 10;

        UsageCalculus.EqnSolArrayMap1[11] = "";
        UsageCalculus.EqnSolArrayDiffAlone[11] = "";
        UsageCalculus.EqnSolArrayMap2[11] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
        UsageCalculus.EqnSolOrder[11] = 11;

        UsageCalculus.EqnSolArrayMap1[12] = "";
        UsageCalculus.EqnSolArrayDiffAlone[12] = "";
        UsageCalculus.EqnSolArrayMap2[12] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
        UsageCalculus.EqnSolOrder[12] = 12;

        UsageCalculus.EqnSolArrayMap1[13] = "";
        UsageCalculus.EqnSolArrayDiffAlone[13] = "";
        UsageCalculus.EqnSolArrayMap2[13] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
        UsageCalculus.EqnSolOrder[13] = 13;

        UsageCalculus.EqnSolArrayMap1[14] = "";
        UsageCalculus.EqnSolArrayDiffAlone[14] = "";
        UsageCalculus.EqnSolArrayMap2[14] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
        UsageCalculus.EqnSolOrder[14] = 14;
    }

    //Palindromic String-Equation Test
    public static void TestCaseDiff4001() {
        //Palindromic String-Equation Test
        //Test Case 4001
        UsageCalculus.TestCase = 4001;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values Except 6th Order Onwards";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        //Usage.EqnUnderTest = " 25.0 + x - x^4 -x^5 -x^8 + x^8 + x^5 + x^4 - x - 25.0";
        UsageCalculus.EqnUnderTest = " -25.0+1.0/1.0*x+x^4 -x^5 -x^8 + x^8 + x^5 + x^4 - x - 25.0";
        //Usage.EqnUnderTest="-120.0-480.0*x^3.0+6720.0*x^3.0+120.0";
        UsageCalculus.TestCaseName = "Standard:Palindromic String Equation:";
        UsageCalculus.TestCaseMatrixID = "Sanity TestCase";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "-25.0+x+x^4.0-x^5.0-x^8.0+x^8.0+x^5.0+x^4.0-x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0+1.0+4.0*x^3.0-5.0*x^4.0-8.0*x^7.0+8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-1.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0+4.0*x^3.0-5.0*x^4.0-8.0*x^7.0+8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-1.0";
        UsageCalculus.EqnSolArrayMap3[1] = "-25.0+x+x^4.0-x^5.0-x^8.0+x^8.0+x^5.0+x^4.0-x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "-25.0*x+1.0/2.0*x^2.0+1.0/5.0*x^5.0-1.0/6.0*x^6.0-1.0/9.0*x^9.0+1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "-25.0*x+1.0/2.0*x^2.0+1.0/5.0*x^5.0-1.0/6.0*x^6.0-1.0/9.0*x^9.0+1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0+4.0*x^3.0-5.0*x^4.0-8.0*x^7.0+8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "0.0+4.0*3.0*x^2.0-5.0*4.0*x^3.0-8.0*7.0*x^6.0+8.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0-1.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "12.0*x^2.0-20.0*x^3.0-56.0*x^6.0+56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2] = "-25.0*x+1.0/2.0*x^2.0+1.0/5.0*x^5.0-1.0/6.0*x^6.0-1.0/9.0*x^9.0+1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "-25.0/2.0*x^2.0+1.0/2.0/3.0*x^3.0+1.0/5.0/6.0*x^6.0-1.0/6.0/7.0*x^7.0-1.0/9.0/10.0*x^10.0+1.0/9.0/10.0*x^10.0+1.0/6.0/7.0*x^7.0+1.0/5.0/6.0*x^6.0-1.0/2.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "-12.5*x^2.0+1.0/6.0*x^3.0+1.0/30.0*x^6.0-1.0/42.0*x^7.0-1.0/90.0*x^10.0+1.0/90.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "12.0*x^2.0-20.0*x^3.0-56.0*x^6.0+56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "12.0*2.0*x^1.0-20.0*3.0*x^2.0-56.0*6.0*x^5.0+56.0*6.0*x^5.0+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "24.0*x-60.0*x^2.0-336.0*x^5.0+336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3] = "-12.5*x^2.0+1.0/6.0*x^3.0+1.0/30.0*x^6.0-1.0/42.0*x^7.0-1.0/90.0*x^10.0+1.0/90.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "-12.5/3.0*x^3.0+1.0/6.0/4.0*x^4.0+1.0/30.0/7.0*x^7.0-1.0/42.0/8.0*x^8.0-1.0/90.0/11.0*x^11.0+1.0/90.0/11.0*x^11.0+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-1.0/6.0/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "-4.166666666666667*x^3.0+1.0/24.0*x^4.0+1.0/210.0*x^7.0-1.0/336.0*x^8.0-1.0/990.0*x^11.0+1.0/990.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "24.0*x-60.0*x^2.0-336.0*x^5.0+336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "24.0-60.0*2.0*x^1.0-336.0*5.0*x^4.0+336.0*5.0*x^4.0+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "24.0-120.0*x-1680.0*x^4.0+1680.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4] = "-4.166666666666667*x^3.0+1.0/24.0*x^4.0+1.0/210.0*x^7.0-1.0/336.0*x^8.0-1.0/990.0*x^11.0+1.0/990.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "-4.166666666666667/4.0*x^4.0+1.0/24.0/5.0*x^5.0+1.0/210.0/8.0*x^8.0-1.0/336.0/9.0*x^9.0-1.0/990.0/12.0*x^12.0+1.0/990.0/12.0*x^12.0+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/24.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "-1.0416666666666667*x^4.0+1.0/120.0*x^5.0+1.0/1680.0*x^8.0-1.0/3024.0*x^9.0-1.0/11880.0*x^12.0+1.0/11880.0*x^12.0+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0-1.0/120.0*x^5.0-1.0416666666666667*x^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;

        UsageCalculus.EqnSolArrayMap1[5] = "24.0-120.0*x-1680.0*x^4.0+1680.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "0.0-120.0-1680.0*4.0*x^3.0+1680.0*4.0*x^3.0+120.0+0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "-120.0-6720.0*x^3.0+6720.0*x^3.0+120.0";
        UsageCalculus.EqnSolArrayMap3[5] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
        UsageCalculus.EqnSolArrayMap4[5] = "";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "-120.0-6720.0*x^3.0+6720.0*x^3.0+120.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "0.0-6720.0*3.0*x^2.0+6720.0*3.0^x^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "-20160.0*x^2.0+20160.0*x^2.0+";
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

    public static void TestCaseDiff4002() {
        //Test Case 4002
        UsageCalculus.TestCase = 4002;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "9*x^8 + 7*x^5 + 6*x^4 - 4*x - 25.0";
        UsageCalculus.TestCaseName = "Standard:No Coefficients:Basic Equation";
        UsageCalculus.TestCaseMatrixID = "Sanity TestCase";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "9.0*x^8.0+7.0*x^5.0+6.0*x^4.0-4.0*x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "9.0*8.0*x^7.0+7.0*5.0*x^4.0+6.0*4.0*x^3.0-4.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "72.0*x^7.0+35.0*x^4.0+24.0*x^3.0-4.0";
        UsageCalculus.EqnSolArrayMap3[1] = "9.0*x^8.0+7.0*x^5.0+6.0*x^4.0-4.0*x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "9.0/9.0*x^9.0+7.0/6.0*x^6.0+6.0/5.0*x^5.0-4.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "x^9.0+1.1666666666666667*x^6.0+1.2*x^5.0-2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "72.0*x^7.0+35.0*x^4.0+24.0*x^3.0-4.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "72.0*7.0*x^6.0+35.0*4.0*x^3.0+24.0*3.0*x^2.0-4.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "504.0*x^6.0+140.0*x^3.0+72.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2] = "x^9.0+1.1666666666666667*x^6.0+1.2*x^5.0-2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/10.0*x^10.0+1.1666666666666667/7.0*x^7.0+1.2/6.0*x^6.0-2.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "1.0/10.0*x^10.0+1.0/6.0*x^7.0+1.0/5.0*x^6.0-1.0/1.5*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "504.0*x^6.0+140.0*x^3.0+72.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "504.0*6.0*x^5.0+140.0*3.0*x^2.0+72.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "3024.0*x^5.0+420.0*x^2.0+144.0*x";
        UsageCalculus.EqnSolArrayMap3[3] = "1.0/10.0*x^10.0+1.0/6.0*x^7.0+1.0/5.0*x^6.0-1.0/1.5*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/10.0/11.0*x^11.0+1.0/6.0/8.0*x^8.0+1.0/5.0/7.0*x^7.0-1.0/1.5/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "1.0/110.0*x^11.0+1.0/48.0*x^8.0+1.0/35.0*x^7.0-1.0/6.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "3024.0*x^5.0+420.0*x^2.0+144.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "3024.0*5.0*x^4.0+420.0*2.0*x^1.0+144.0";
        UsageCalculus.EqnSolArrayMap2[4] = "15120.0*x^4.0+840.0*x+144.0";
        UsageCalculus.EqnSolArrayMap3[4] = "1.0/110.0*x^11.0+1.0/48.0*x^8.0+1.0/35.0*x^7.0-1.0/6.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/110.0/12.0*x^12.0+1.0/48.0/9.0*x^9.0+1.0/35.0/8.0*x^8.0-1.0/6.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "1.0/1320.0*x^12.0+1.0/432.0*x^9.0+1.0/280.0*x^8.0-1.0/30.0*x^5.0-1.0416666666666667*x^4.0";
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
        UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
        UsageCalculus.EqnSolOrder[8] = 8;

        UsageCalculus.EqnSolArrayMap1[9] = "";
        UsageCalculus.EqnSolArrayDiffAlone[9] = "";
        UsageCalculus.EqnSolArrayMap2[9] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
        UsageCalculus.EqnSolOrder[9] = 9;

        UsageCalculus.EqnSolArrayMap1[10] = "";
        UsageCalculus.EqnSolArrayDiffAlone[10] = "";
        UsageCalculus.EqnSolArrayMap2[10] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
        UsageCalculus.EqnSolOrder[10] = 10;

        UsageCalculus.EqnSolArrayMap1[11] = "";
        UsageCalculus.EqnSolArrayDiffAlone[11] = "";
        UsageCalculus.EqnSolArrayMap2[11] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
        UsageCalculus.EqnSolOrder[11] = 11;

        UsageCalculus.EqnSolArrayMap1[12] = "";
        UsageCalculus.EqnSolArrayDiffAlone[12] = "";
        UsageCalculus.EqnSolArrayMap2[12] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
        UsageCalculus.EqnSolOrder[12] = 12;

        UsageCalculus.EqnSolArrayMap1[13] = "";
        UsageCalculus.EqnSolArrayDiffAlone[13] = "";
        UsageCalculus.EqnSolArrayMap2[13] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
        UsageCalculus.EqnSolOrder[13] = 13;

        UsageCalculus.EqnSolArrayMap1[14] = "";
        UsageCalculus.EqnSolArrayDiffAlone[14] = "";
        UsageCalculus.EqnSolArrayMap2[14] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
        UsageCalculus.EqnSolOrder[14] = 14;
    }

    public static void TestCaseDiff4003() {
        //Test Case 4003
        UsageCalculus.TestCase = 4003;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values Except 4th Order Integration";
        UsageCalculus.EqnUnderTest = "1.0/1.0*1/x^8 + 1/x^5 + 1/x^4 - 25.0";
        UsageCalculus.TestCaseName = "Standard:No Coefficients:Basic Equation:Divide Operator";
        UsageCalculus.TestCaseMatrixID = "Sanity TestCase";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 5;

        UsageCalculus.EqnSolArrayMap1[1] = "1.0/x^8.0+1.0/x^5.0+1.0/x^4.0-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-8.0/x^9.0-5.0/x^6.0-4.0/x^5.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-8.0/x^9.0-5.0/x^6.0-4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap3[1] = "1.0/x^8.0+1.0/x^5.0+1.0/x^4.0-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0/-7.0/x^7.0+1.0/-4.0/x^4.0+1.0/-3.0/x^3.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "-1.0/7.0/x^7.0-1.0/4.0/x^4.0-1.0/3.0/x^3.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-8.0/x^9.0-5.0/x^6.0-4.0/x^5.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-8.0*-9.0/x^10.0-5.0*-6.0/x^7.0-4.0*-5.0/x^6.0";
        UsageCalculus.EqnSolArrayMap2[2] = "72.0/x^10.0+30.0/x^7.0+20.0/x^6.0";
        UsageCalculus.EqnSolArrayMap3[2] = "-1.0/7.0/x^7.0-1.0/4.0/x^4.0-1.0/3.0/x^3.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/7.0/-6.0/x^6.0-1.0/4.0/-3.0/x^3.0-1.0/3.0/-2.0/x^2.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "1.0/42.0/x^6.0+1.0/12.0/x^3.0+1.0/6.0/x^2.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "72.0/x^10.0+30.0/x^7.0+20.0/x^6.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "72.0*-10.0/x^11.0+30.0*-7.0/x^8.0+20.0*-6.0/x^7.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-720.0/x^11.0-210.0/x^8.0-120.0/x^7.0";
        UsageCalculus.EqnSolArrayMap3[3] = "1.0/42.0/x^6.0+1.0/12.0/x^3.0+1.0/6.0/x^2.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/42.0/-5.0/x^5.0+1.0/12.0/-2.0/x^2.0+1.0/6.0/-1.0/x^1.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "-1.0/210.0/x^5.0-1.0/24.0/x^2.0-1.0/6.0/x-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-720.0/x^11.0-210.0/x^8.0-120.0/x^7.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-720.0*-11.0/x^12.0-210.0*-8.0/x^9.0-120.0*-7.0/x^8.0";
        UsageCalculus.EqnSolArrayMap2[4] = "7920.0/x^12.0+1680.0/x^9.0+840.0/x^8.0";
        UsageCalculus.EqnSolArrayMap3[4] = "-1.0/210.0/x^5.0-1.0/24.0/x^2.0-1.0/6.0/x-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/210.0/-4.0/x^4.0-1.0/24.0/-1.0/x^1.0-1.0/6.0*ln(x)-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "1.0/840.0/x^4.0+1.0/24.0/x-1.0/6.0*ln(x)-1.0416666666666667*x^4.0";
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
        UsageCalculus.EqnSolOrder[6] = 6;

        UsageCalculus.EqnSolArrayMap1[7] = "";
        UsageCalculus.EqnSolArrayDiffAlone[7] = "";
        UsageCalculus.EqnSolArrayMap2[7] = "";
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

    public static void TestCaseDiff4004() {
        //Only Trailing Constant
        //Test Case 4004
        UsageCalculus.TestCase = 4004;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values Trailing Constant Dropped";
        UsageCalculus.EqnRegressionIntegreStatus = "All RED Including Values Trailing Constant Dropped";
        UsageCalculus.EqnUnderTest = "1.0/1.0*x^7.0/8.0-x^7.0/8.0+x^4.0/5.0-x^4.0/5.0+x^3.0-x^3.0/4.0";
        UsageCalculus.TestCaseName = "Standard:Basic Equation:With  Trailing Coefficients alone";
        UsageCalculus.TestCaseMatrixID = "Sanity TestCase";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "1.0/8.0*x^7.0-1.0/8.0*x^7.0+1.0/5.0*x^4.0-1.0/5.0*x^4.0+x^3.0-1.0/4.0*x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/8.0*7.0*x^6.0-1.0/8.0*7.0*x^6.0+1.0/5.0*4.0*x^3.0-1.0/5.0*4.0*x^3.0+3.0*x^2.0-1.0/4.0*3.0*x^2.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0/1.1428571428571428*x^6.0-1.0/1.1428571428571428*x^6.0+1.0/1.25*x^3.0-1.0/1.25*x^3.0+3.0*x^2.0-1.0/1.3333333333333333*x^2.0";
        UsageCalculus.EqnSolArrayMap3[1] = "1.0/8.0*x^7.0-1.0/8.0*x^7.0+1.0/5.0*x^4.0-1.0/5.0*x^4.0+x^3.0-1.0/4.0*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0/8.0/8.0*x^8.0-1.0/8.0/8.0*x^8.0+1.0/5.0/5.0*x^5.0-1.0/5.0/5.0*x^5.0+1.0/4.0*x^4.0-1.0/4.0/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[1] = "1.0/64.0*x^8.0-1.0/64.0*x^8.0+1.0/25.0*x^5.0-1.0/25.0*x^5.0+1.0/4.0*x^4.0-1.0/16.0*x^4.0";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0/1.1428571428571428*x^6.0-1.0/1.1428571428571428*x^6.0+1.0/1.25*x^3.0-1.0/1.25*x^3.0+3.0*x^2.0-1.0/1.3333333333333333*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "1.0/1.1428571428571428*6.0*x^5.0-1.0/1.1428571428571428*6.0*x^5.0+1.0/1.25*3.0*x^2.0-1.0/1.25*3.0*x^2.0+3.0*2.0*x^1.0-1.0/1.3333333333333333*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[2] = "5.25*x^5.0-5.25*x^5.0+2.4*x^2.0-2.4*x^2.0+6.0*x-1.5*x";
        UsageCalculus.EqnSolArrayMap3[2] = "1.0/64.0*x^8.0-1.0/64.0*x^8.0+1.0/25.0*x^5.0-1.0/25.0*x^5.0+1.0/4.0*x^4.0-1.0/16.0*x^4.0";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/64.0/9.0*x^9.0-1.0/64.0/9.0*x^9.0+1.0/25.0/6.0*x^6.0-1.0/25.0/6.0*x^6.0+1.0/4.0/5.0*x^5.0-1.0/16.0/5.0*x^5.0";
        UsageCalculus.EqnSolArrayMap4[2] = "1.0/576.0*x^9.0-1.0/576.0*x^9.0+1.0/150.0*x^6.0-1.0/150.0*x^6.0+1.0/20.0*x^5.0-1.0/80.0*x^5.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "5.25*x^5.0-5.25*x^5.0+2.4*x^2.0-2.4*x^2.0+6.0*x-1.5*x";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "5.25*5.0*x^4.0-5.25*5.0*x^4.0+2.4*2.0*x^1.0-2.4*2.0*x^1.0+6.0-1.5";
        UsageCalculus.EqnSolArrayMap2[3] = "26.25*x^4.0-26.25*x^4.0+4.8*x-4.8*x+6.0-1.5";
        UsageCalculus.EqnSolArrayMap3[3] = "1.0/576.0*x^9.0-1.0/576.0*x^9.0+1.0/150.0*x^6.0-1.0/150.0*x^6.0+1.0/20.0*x^5.0-1.0/80.0*x^5.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/576.0/10.0*x^10.0-1.0/576.0/10.0*x^10.0+1.0/150.0/7.0*x^7.0-1.0/150.0/7.0*x^7.0+1.0/20.0/6.0*x^6.0-1.0/80.0/6.0*x^6.0";
        UsageCalculus.EqnSolArrayMap4[3] = "1.0/5760.0*x^10.0-1.0/5760.0*x^10.0+1.0/1050.0*x^7.0-1.0/1050.0*x^7.0+1.0/120.0*x^6.0-1.0/480.0*x^6.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "26.25*x^4.0-26.25*x^4.0+4.8*x-4.8*x+6.0-1.5";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "26.25*4.0*x^3.0-26.25*4.0*x^3.0+4.8-4.8+6.0*0.0-1.5*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "105.0*x^3.0-105.0*x^3.0+4.8-4.8";
        UsageCalculus.EqnSolArrayMap3[4] = "1.0/5760.0*x^10.0-1.0/5760.0*x^10.0+1.0/1050.0*x^7.0-1.0/1050.0*x^7.0+1.0/120.0*x^6.0-1.0/480.0*x^6.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/5760.0/11.0*x^11.0-1.0/5760.0/11.0*x^11.0+1.0/1050.0/8.0*x^8.0-1.0/1050.0/8.0*x^8.0+1.0/120.0/7.0*x^7.0-1.0/480.0/7.0*x^7.0";
        UsageCalculus.EqnSolArrayMap4[4] = "1.0/63360.0*x^11.0-1.0/63360.0*x^11.0+1.0/8400.0*x^8.0-1.0/8400.0*x^8.0+1.0/840.0*x^7.0-1.0/3360.0*x^7.0";
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

    public static void TestCaseDiff4005() {
        //Test Case 4005
        UsageCalculus.TestCase = 4005;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values :Negative Exponent Dropped";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1/x^-8 + 1.0/1.0*1/x^-5 + 1/x^-4 - 25.0";
        UsageCalculus.TestCaseName = "Standard:No Coefficients:Basic Equation:Negative Exponent & Divide Operator";
        UsageCalculus.TestCaseMatrixID = "Complex:Sanity TestCase:Mapping of -ve Exponent & Division";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 5;

        UsageCalculus.EqnSolArrayMap1[1] = "x^8.0+x^5.0+x^4.0-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0";
        UsageCalculus.EqnSolArrayMap3[1] = "x^8.0+x^5.0+x^4.0-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2] = "1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/9.0/10.0*x^10.0+1.0/6.0/7.0*x^7.0+1.0/5.0/6.0*x^6.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "1.0/90.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*x^5.0+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3] = "1.0/90.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/90.0/11.0*x^11.0+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "1.0/990.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*x^4.0+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4] = "1.0/990.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/990.0/12.0*x^12.0+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "1.0/11880.0*x^12.0+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0-1.0416666666666667*x^4.0";
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

    // x-25 Test Cases: Last 2 Terms put at the Begining
    public static void TestCaseDiff4006() {
        //Test Case 4006
        UsageCalculus.TestCase = 4006;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values :Negative Exponent Dropped";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "+ 1/x^-4 - 25.0-1/x^-8 + 1/x^-5 ";
        UsageCalculus.TestCaseName = "Standard:No Coefficients:Basic Equation:Negative Exponent & Divide Operator";
        UsageCalculus.TestCaseMatrixID = "Complex:Sanity TestCase:Mapping of -ve Exponent & Division";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 5;

        UsageCalculus.EqnSolArrayMap1[1] = "x^4.0-25.0-x^8.0+x^5.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "4.0*x^3.0-25.0*0.0-8.0*x^7.0+5.0*x^4.0";
        UsageCalculus.EqnSolArrayMap2[1] = "4.0*x^3.0-8.0*x^7.0+5.0*x^4.0";
        UsageCalculus.EqnSolArrayMap3[1] = "x^4.0-25.0-x^8.0+x^5.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0/5.0*x^5.0-25.0*x-1.0/9.0*x^9.0+1.0/6.0*x^6.0";
        UsageCalculus.EqnSolArrayMap4[1] = "1.0/5.0*x^5.0-25.0*x-1.0/9.0*x^9.0+1.0/6.0*x^6.0";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "4.0*x^3.0-8.0*x^7.0+5.0*x^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "4.0*3.0*x^2.0-8.0*7.0*x^6.0+5.0*4.0*x^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "12.0*x^2.0-56.0*x^6.0+20.0*x^3.0";
        UsageCalculus.EqnSolArrayMap3[2] = "1.0/5.0*x^5.0-25.0*x-1.0/9.0*x^9.0+1.0/6.0*x^6.0";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/5.0/6.0*x^6.0-25.0/2.0*x^2.0-1.0/9.0/10.0*x^10.0+1.0/6.0/7.0*x^7.0";
        UsageCalculus.EqnSolArrayMap4[2] = "1.0/30.0*x^6.0-12.5*x^2.0-1.0/90.0*x^10.0+1.0/42.0*x^7.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "12.0*x^2.0-56.0*x^6.0+20.0*x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "12.0*2.0*x^1.0-56.0*6.0*x^5.0+20.0*3.0*x^2.0";
        UsageCalculus.EqnSolArrayMap2[3] = "24.0*x-336.0*x^5.0+60.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[3] = "1.0/30.0*x^6.0-12.5*x^2.0-1.0/90.0*x^10.0+1.0/42.0*x^7.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/30.0/7.0*x^7.0-12.5/3.0*x^3.0-1.0/90.0/11.0*x^11.0+1.0/42.0/8.0*x^8.0";
        UsageCalculus.EqnSolArrayMap4[3] = "1.0/210.0*x^7.0-4.166666666666667*x^3.0-1.0/990.0*x^11.0+1.0/336.0*x^8.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "24.0*x-336.0*x^5.0+60.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "24.0-336.0*5.0*x^4.0+60.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[4] = "24.0-1680.0*x^4.0+120.0*x";
        UsageCalculus.EqnSolArrayMap3[4] = "1.0/210.0*x^7.0-4.166666666666667*x^3.0-1.0/990.0*x^11.0+1.0/336.0*x^8.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/210.0/8.0*x^8.0-4.166666666666667/4.0*x^4.0-1.0/990.0/12.0*x^12.0+1.0/336.0/9.0*x^9.0";
        UsageCalculus.EqnSolArrayMap4[4] = "1.0/1680.0*x^8.0-1.0416666666666667*x^4.0-1.0/11880.0*x^12.0+1.0/3024.0*x^9.0";
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

    public static void TestCaseDiff4007() {
        //Test Case 4007
        UsageCalculus.TestCase = 4007;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values :Negative Exponent Dropped";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "+ 1/x^-4 - 25.0 +1/x^-8 + 1/x^-5 ";
        UsageCalculus.TestCaseName = "Standard:No Coefficients:Basic Equation:Negative Exponent & Divide Operator";
        UsageCalculus.TestCaseMatrixID = "Complex:Sanity TestCase:Mapping of -ve Exponent & Division";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 5;

        UsageCalculus.EqnSolArrayMap1[1] = "x^4.0-25.0+x^8.0+x^5.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "4.0*x^3.0-25.0*0.0+8.0*x^7.0+5.0*x^4.0";
        UsageCalculus.EqnSolArrayMap2[1] = "4.0*x^3.0+8.0*x^7.0+5.0*x^4.0";
        UsageCalculus.EqnSolArrayMap3[1] = "x^4.0-25.0+x^8.0+x^5.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0/5.0*x^5.0-25.0*x+1.0/9.0*x^9.0+1.0/6.0*x^6.0";
        UsageCalculus.EqnSolArrayMap4[1] = "1.0/5.0*x^5.0-25.0*x+1.0/9.0*x^9.0+1.0/6.0*x^6.0";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "4.0*x^3.0+8.0*x^7.0+5.0*x^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "4.0*3.0*x^2.0+8.0*7.0*x^6.0+5.0*4.0*x^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "12.0*x^2.0+56.0*x^6.0+20.0*x^3.0";
        UsageCalculus.EqnSolArrayMap3[2] = "1.0/5.0*x^5.0-25.0*x+1.0/9.0*x^9.0+1.0/6.0*x^6.0";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/5.0/6.0*x^6.0-25.0/2.0*x^2.0+1.0/9.0/10.0*x^10.0+1.0/6.0/7.0*x^7.0";
        UsageCalculus.EqnSolArrayMap4[2] = "1.0/30.0*x^6.0-12.5*x^2.0+1.0/90.0*x^10.0+1.0/42.0*x^7.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "12.0*x^2.0+56.0*x^6.0+20.0*x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "12.0*2.0*x^1.0+56.0*6.0*x^5.0+20.0*3.0*x^2.0";
        UsageCalculus.EqnSolArrayMap2[3] = "24.0*x+336.0*x^5.0+60.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[3] = "1.0/30.0*x^6.0-12.5*x^2.0+1.0/90.0*x^10.0+1.0/42.0*x^7.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/30.0/7.0*x^7.0-12.5/3.0*x^3.0+1.0/90.0/11.0*x^11.0+1.0/42.0/8.0*x^8.0";
        UsageCalculus.EqnSolArrayMap4[3] = "1.0/210.0*x^7.0-4.166666666666667*x^3.0+1.0/990.0*x^11.0+1.0/336.0*x^8.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "24.0*x+336.0*x^5.0+60.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "24.0+336.0*5.0*x^4.0+60.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[4] = "24.0+1680.0*x^4.0+120.0*x";
        UsageCalculus.EqnSolArrayMap3[4] = "1.0/210.0*x^7.0-4.166666666666667*x^3.0+1.0/990.0*x^11.0+1.0/336.0*x^8.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/210.0/8.0*x^8.0-4.166666666666667/4.0*x^4.0+1.0/990.0/12.0*x^12.0+1.0/336.0/9.0*x^9.0";
        UsageCalculus.EqnSolArrayMap4[4] = "1.0/1680.0*x^8.0-1.0416666666666667*x^4.0+1.0/11880.0*x^12.0+1.0/3024.0*x^9.0";
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

    public static void TestCaseDiff4008() {
        //Test Case 4008
        UsageCalculus.TestCase = 4008;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "- x - 25.0 +x^8 + x^5 + x^4 ";
        UsageCalculus.TestCaseName = "Standard:No Coefficients:Basic Equation";
        UsageCalculus.TestCaseMatrixID = "Sanity TestCase";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "-x-25.0+x^8.0+x^5.0+x^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-1.0-25.0*0.0+8.0*x^7.0+5.0*x^4.0+4.0*x^3.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-1.0+8.0*x^7.0+5.0*x^4.0+4.0*x^3.0";
        UsageCalculus.EqnSolArrayMap3[1] = "-x-25.0+x^8.0+x^5.0+x^4.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.0/2.0*x^2.0-25.0*x+1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0";
        UsageCalculus.EqnSolArrayMap4[1] = "-1.0/2.0*x^2.0-25.0*x+1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-1.0+8.0*x^7.0+5.0*x^4.0+4.0*x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-0.0+8.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2] = "-1.0/2.0*x^2.0-25.0*x+1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/2.0/3.0*x^3.0-25.0/2.0*x^2.0+1.0/9.0/10.0*x^10.0+1.0/6.0/7.0*x^7.0+1.0/5.0/6.0*x^6.0";
        UsageCalculus.EqnSolArrayMap4[2] = "-1.0/6.0*x^3.0-12.5*x^2.0+1.0/90.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*x^5.0+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3] = "-1.0/6.0*x^3.0-12.5*x^2.0+1.0/90.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/6.0/4.0*x^4.0-12.5/3.0*x^3.0+1.0/90.0/11.0*x^11.0+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0";
        UsageCalculus.EqnSolArrayMap4[3] = "-1.0/24.0*x^4.0-4.166666666666667*x^3.0+1.0/990.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*x^4.0+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4] = "-1.0/24.0*x^4.0-4.166666666666667*x^3.0+1.0/990.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/24.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0+1.0/990.0/12.0*x^12.0+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0";
        UsageCalculus.EqnSolArrayMap4[4] = "-1.0/120.0*x^5.0-1.0416666666666667*x^4.0+1.0/11880.0*x^12.0+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0";
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
        UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
        UsageCalculus.EqnSolOrder[8] = 8;

        UsageCalculus.EqnSolArrayMap1[9] = "";
        UsageCalculus.EqnSolArrayDiffAlone[9] = "";
        UsageCalculus.EqnSolArrayMap2[9] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
        UsageCalculus.EqnSolOrder[9] = 9;

        UsageCalculus.EqnSolArrayMap1[10] = "";
        UsageCalculus.EqnSolArrayDiffAlone[10] = "";
        UsageCalculus.EqnSolArrayMap2[10] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
        UsageCalculus.EqnSolOrder[10] = 10;

        UsageCalculus.EqnSolArrayMap1[11] = "";
        UsageCalculus.EqnSolArrayDiffAlone[11] = "";
        UsageCalculus.EqnSolArrayMap2[11] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
        UsageCalculus.EqnSolOrder[11] = 11;

        UsageCalculus.EqnSolArrayMap1[12] = "";
        UsageCalculus.EqnSolArrayDiffAlone[12] = "";
        UsageCalculus.EqnSolArrayMap2[12] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
        UsageCalculus.EqnSolOrder[12] = 12;

        UsageCalculus.EqnSolArrayMap1[13] = "";
        UsageCalculus.EqnSolArrayDiffAlone[13] = "";
        UsageCalculus.EqnSolArrayMap2[13] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
        UsageCalculus.EqnSolOrder[13] = 13;

        UsageCalculus.EqnSolArrayMap1[14] = "";
        UsageCalculus.EqnSolArrayDiffAlone[14] = "";
        UsageCalculus.EqnSolArrayMap2[14] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
        UsageCalculus.EqnSolOrder[14] = 14;
    }

    public static void TestCaseDiff4009() {
        //Test Case 4009
        UsageCalculus.TestCase = 4009;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "- x - 25.0 -x^8 + x^5 + x^4 ";
        UsageCalculus.TestCaseName = "Standard:No Coefficients:Basic Equation";
        UsageCalculus.TestCaseMatrixID = "Sanity TestCase";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "-x-25.0-x^8.0+x^5.0+x^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-1.0-25.0*0.0-8.0*x^7.0+5.0*x^4.0+4.0*x^3.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-1.0-8.0*x^7.0+5.0*x^4.0+4.0*x^3.0";
        UsageCalculus.EqnSolArrayMap3[1] = "-x-25.0-x^8.0+x^5.0+x^4.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.0/2.0*x^2.0-25.0*x-1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0";
        UsageCalculus.EqnSolArrayMap4[1] = "-1.0/2.0*x^2.0-25.0*x-1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-1.0-8.0*x^7.0+5.0*x^4.0+4.0*x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-0.0-8.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2] = "-1.0/2.0*x^2.0-25.0*x-1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/2.0/3.0*x^3.0-25.0/2.0*x^2.0-1.0/9.0/10.0*x^10.0+1.0/6.0/7.0*x^7.0+1.0/5.0/6.0*x^6.0";
        UsageCalculus.EqnSolArrayMap4[2] = "-1.0/6.0*x^3.0-12.5*x^2.0-1.0/90.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-56.0*6.0*x^5.0+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3] = "-1.0/6.0*x^3.0-12.5*x^2.0-1.0/90.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/6.0/4.0*x^4.0-12.5/3.0*x^3.0-1.0/90.0/11.0*x^11.0+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0";
        UsageCalculus.EqnSolArrayMap4[3] = "-1.0/24.0*x^4.0-4.166666666666667*x^3.0-1.0/990.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-336.0*5.0*x^4.0+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-1680.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4] = "-1.0/24.0*x^4.0-4.166666666666667*x^3.0-1.0/990.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/24.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0-1.0/990.0/12.0*x^12.0+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0";
        UsageCalculus.EqnSolArrayMap4[4] = "-1.0/120.0*x^5.0-1.0416666666666667*x^4.0-1.0/11880.0*x^12.0+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0";
        UsageCalculus.EqnSolOrder[4] = 4;

        UsageCalculus.EqnSolArrayMap1[5] = "-1680.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "-1680.0*4.0*x^3.0+120.0+0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "-6720.0*x^3.0+120.0";
        UsageCalculus.EqnSolArrayMap3[5] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
        UsageCalculus.EqnSolArrayMap4[5] = "";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "-6720.0*x^3.0+120.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "-6720.0*3.0*x^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "-20160.0*x^2.0";
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
        UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
        UsageCalculus.EqnSolOrder[8] = 8;

        UsageCalculus.EqnSolArrayMap1[9] = "";
        UsageCalculus.EqnSolArrayDiffAlone[9] = "";
        UsageCalculus.EqnSolArrayMap2[9] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
        UsageCalculus.EqnSolOrder[9] = 9;

        UsageCalculus.EqnSolArrayMap1[10] = "";
        UsageCalculus.EqnSolArrayDiffAlone[10] = "";
        UsageCalculus.EqnSolArrayMap2[10] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
        UsageCalculus.EqnSolOrder[10] = 10;

        UsageCalculus.EqnSolArrayMap1[11] = "";
        UsageCalculus.EqnSolArrayDiffAlone[11] = "";
        UsageCalculus.EqnSolArrayMap2[11] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
        UsageCalculus.EqnSolOrder[11] = 11;

        UsageCalculus.EqnSolArrayMap1[12] = "";
        UsageCalculus.EqnSolArrayDiffAlone[12] = "";
        UsageCalculus.EqnSolArrayMap2[12] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
        UsageCalculus.EqnSolOrder[12] = 12;

        UsageCalculus.EqnSolArrayMap1[13] = "";
        UsageCalculus.EqnSolArrayDiffAlone[13] = "";
        UsageCalculus.EqnSolArrayMap2[13] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
        UsageCalculus.EqnSolOrder[13] = 13;

        UsageCalculus.EqnSolArrayMap1[14] = "";
        UsageCalculus.EqnSolArrayDiffAlone[14] = "";
        UsageCalculus.EqnSolArrayMap2[14] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
        UsageCalculus.EqnSolOrder[14] = 14;
    }

    //Palindromic String-Equation Test Start
    public static void TestCaseDiff4010() {
        //Test Case 4010
        UsageCalculus.TestCase = 4010;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "- 25.0- 4*x+ 6*x^4+ 7*x^5+9*x^8+9*x^8 + 7*x^5 + 6*x^4 - 4*x - 25.0";
        UsageCalculus.TestCaseName = "Standard:No Coefficients:Basic Equation";
        UsageCalculus.TestCaseMatrixID = "Sanity TestCase";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "-25.0-4.0*x+6.0*x^4.0+7.0*x^5.0+9.0*x^8.0+9.0*x^8.0+7.0*x^5.0+6.0*x^4.0-4.0*x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0-4.0+6.0*4.0*x^3.0+7.0*5.0*x^4.0+9.0*8.0*x^7.0+9.0*8.0*x^7.0+7.0*5.0*x^4.0+6.0*4.0*x^3.0-4.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-4.0+24.0*x^3.0+35.0*x^4.0+72.0*x^7.0+72.0*x^7.0+35.0*x^4.0+24.0*x^3.0-4.0";
        UsageCalculus.EqnSolArrayMap3[1] = "-25.0-4.0*x+6.0*x^4.0+7.0*x^5.0+9.0*x^8.0+9.0*x^8.0+7.0*x^5.0+6.0*x^4.0-4.0*x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "-25.0*x-4.0/2.0*x^2.0+6.0/5.0*x^5.0+7.0/6.0*x^6.0+9.0/9.0*x^9.0+9.0/9.0*x^9.0+7.0/6.0*x^6.0+6.0/5.0*x^5.0-4.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "-25.0*x-2.0*x^2.0+1.2*x^5.0+1.1666666666666667*x^6.0+x^9.0+x^9.0+1.1666666666666667*x^6.0+1.2*x^5.0-2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-4.0+24.0*x^3.0+35.0*x^4.0+72.0*x^7.0+72.0*x^7.0+35.0*x^4.0+24.0*x^3.0-4.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-0.0+24.0*3.0*x^2.0+35.0*4.0*x^3.0+72.0*7.0*x^6.0+72.0*7.0*x^6.0+35.0*4.0*x^3.0+24.0*3.0*x^2.0-4.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "72.0*x^2.0+140.0*x^3.0+504.0*x^6.0+504.0*x^6.0+140.0*x^3.0+72.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2] = "-25.0*x-2.0*x^2.0+1.2*x^5.0+1.1666666666666667*x^6.0+x^9.0+x^9.0+1.1666666666666667*x^6.0+1.2*x^5.0-2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "-25.0/2.0*x^2.0-2.0/3.0*x^3.0+1.2/6.0*x^6.0+1.1666666666666667/7.0*x^7.0+1.0/10.0*x^10.0+1.0/10.0*x^10.0+1.1666666666666667/7.0*x^7.0+1.2/6.0*x^6.0-2.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "-12.5*x^2.0-1.0/1.5*x^3.0+1.0/5.0*x^6.0+1.0/6.0*x^7.0+1.0/10.0*x^10.0+1.0/10.0*x^10.0+1.0/6.0*x^7.0+1.0/5.0*x^6.0-1.0/1.5*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "72.0*x^2.0+140.0*x^3.0+504.0*x^6.0+504.0*x^6.0+140.0*x^3.0+72.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "72.0*2.0*x^1.0+140.0*3.0*x^2.0+504.0*6.0*x^5.0+504.0*6.0*x^5.0+140.0*3.0*x^2.0+72.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "144.0*x+420.0*x^2.0+3024.0*x^5.0+3024.0*x^5.0+420.0*x^2.0+144.0*x";
        UsageCalculus.EqnSolArrayMap3[3] = "-12.5*x^2.0-1.0/1.5*x^3.0+1.0/5.0*x^6.0+1.0/6.0*x^7.0+1.0/10.0*x^10.0+1.0/10.0*x^10.0+1.0/6.0*x^7.0+1.0/5.0*x^6.0-1.0/1.5*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "-12.5/3.0*x^3.0-1.0/1.5/4.0*x^4.0+1.0/5.0/7.0*x^7.0+1.0/6.0/8.0*x^8.0+1.0/10.0/11.0*x^11.0+1.0/10.0/11.0*x^11.0+1.0/6.0/8.0*x^8.0+1.0/5.0/7.0*x^7.0-1.0/1.5/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "-4.166666666666667*x^3.0-1.0/6.0*x^4.0+1.0/35.0*x^7.0+1.0/48.0*x^8.0+1.0/110.0*x^11.0+1.0/110.0*x^11.0+1.0/48.0*x^8.0+1.0/35.0*x^7.0-1.0/6.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "144.0*x+420.0*x^2.0+3024.0*x^5.0+3024.0*x^5.0+420.0*x^2.0+144.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "144.0+420.0*2.0*x^1.0+3024.0*5.0*x^4.0+3024.0*5.0*x^4.0+420.0*2.0*x^1.0+144.0";
        UsageCalculus.EqnSolArrayMap2[4] = "144.0+840.0*x+15120.0*x^4.0+15120.0*x^4.0+840.0*x+144.0";
        UsageCalculus.EqnSolArrayMap3[4] = "-4.166666666666667*x^3.0-1.0/6.0*x^4.0+1.0/35.0*x^7.0+1.0/48.0*x^8.0+1.0/110.0*x^11.0+1.0/110.0*x^11.0+1.0/48.0*x^8.0+1.0/35.0*x^7.0-1.0/6.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "-4.166666666666667/4.0*x^4.0-1.0/6.0/5.0*x^5.0+1.0/35.0/8.0*x^8.0+1.0/48.0/9.0*x^9.0+1.0/110.0/12.0*x^12.0+1.0/110.0/12.0*x^12.0+1.0/48.0/9.0*x^9.0+1.0/35.0/8.0*x^8.0-1.0/6.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "-1.0416666666666667*x^4.0-1.0/30.0*x^5.0+1.0/280.0*x^8.0+1.0/432.0*x^9.0+1.0/1320.0*x^12.0+1.0/1320.0*x^12.0+1.0/432.0*x^9.0+1.0/280.0*x^8.0-1.0/30.0*x^5.0-1.0416666666666667*x^4.0";
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
        UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
        UsageCalculus.EqnSolOrder[8] = 8;

        UsageCalculus.EqnSolArrayMap1[9] = "";
        UsageCalculus.EqnSolArrayDiffAlone[9] = "";
        UsageCalculus.EqnSolArrayMap2[9] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
        UsageCalculus.EqnSolOrder[9] = 9;

        UsageCalculus.EqnSolArrayMap1[10] = "";
        UsageCalculus.EqnSolArrayDiffAlone[10] = "";
        UsageCalculus.EqnSolArrayMap2[10] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
        UsageCalculus.EqnSolOrder[10] = 10;

        UsageCalculus.EqnSolArrayMap1[11] = "";
        UsageCalculus.EqnSolArrayDiffAlone[11] = "";
        UsageCalculus.EqnSolArrayMap2[11] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
        UsageCalculus.EqnSolOrder[11] = 11;

        UsageCalculus.EqnSolArrayMap1[12] = "";
        UsageCalculus.EqnSolArrayDiffAlone[12] = "";
        UsageCalculus.EqnSolArrayMap2[12] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
        UsageCalculus.EqnSolOrder[12] = 12;

        UsageCalculus.EqnSolArrayMap1[13] = "";
        UsageCalculus.EqnSolArrayDiffAlone[13] = "";
        UsageCalculus.EqnSolArrayMap2[13] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
        UsageCalculus.EqnSolOrder[13] = 13;

        UsageCalculus.EqnSolArrayMap1[14] = "";
        UsageCalculus.EqnSolArrayDiffAlone[14] = "";
        UsageCalculus.EqnSolArrayMap2[14] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
        UsageCalculus.EqnSolOrder[14] = 14;
    }

    public static void TestCaseDiff4011() {
        //Test Case 4011
        UsageCalculus.TestCase = 4011;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "- 4*x- 25.0- 4*x+ 6*x^4+ 7*x^5+9*x^8+9*x^8 + 7*x^5 + 6*x^4 - 4*x - 25.0";
        UsageCalculus.TestCaseName = "Standard:No Coefficients:Basic Equation";
        UsageCalculus.TestCaseMatrixID = "Sanity TestCase";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "-4.0*x-25.0-4.0*x+6.0*x^4.0+7.0*x^5.0+9.0*x^8.0+9.0*x^8.0+7.0*x^5.0+6.0*x^4.0-4.0*x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-4.0-25.0*0.0-4.0+6.0*4.0*x^3.0+7.0*5.0*x^4.0+9.0*8.0*x^7.0+9.0*8.0*x^7.0+7.0*5.0*x^4.0+6.0*4.0*x^3.0-4.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-4.0-4.0+24.0*x^3.0+35.0*x^4.0+72.0*x^7.0+72.0*x^7.0+35.0*x^4.0+24.0*x^3.0-4.0";
        UsageCalculus.EqnSolArrayMap3[1] = "-4.0*x-25.0-4.0*x+6.0*x^4.0+7.0*x^5.0+9.0*x^8.0+9.0*x^8.0+7.0*x^5.0+6.0*x^4.0-4.0*x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "-4.0/2.0*x^2.0-25.0/2.0*x^2.0+6.0/5.0*x^5.0+7.0/6.0*x^6.0+9.0/9.0*x^9.0+9.0/9.0*x^9.0+7.0/6.0*x^6.0+6.0/5.0*x^5.0-4.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "-2.0*x^2.0-12.5*x^2.0+1.2*x^5.0+1.1666666666666667*x^6.0+x^9.0+x^9.0+1.1666666666666667*x^6.0+1.2*x^5.0-2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-4.0-4.0+24.0*x^3.0+35.0*x^4.0+72.0*x^7.0+72.0*x^7.0+35.0*x^4.0+24.0*x^3.0-4.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-0.0-4.0*0.0+24.0*3.0*x^2.0+35.0*4.0*x^3.0+72.0*7.0*x^6.0+72.0*7.0*x^6.0+35.0*4.0*x^3.0+24.0*3.0*x^2.0-4.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "72.0*x^2.0+140.0*x^3.0+504.0*x^6.0+504.0*x^6.0+140.0*x^3.0+72.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2] = "-2.0*x^2.0-12.5*x^2.0+1.2*x^5.0+1.1666666666666667*x^6.0+x^9.0+x^9.0+1.1666666666666667*x^6.0+1.2*x^5.0-2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "-2.0/3.0*x^3.0-12.5/3.0*x^3.0+1.2/6.0*x^6.0+1.1666666666666667/7.0*x^7.0+1.0/10.0*x^10.0+1.0/10.0*x^10.0+1.1666666666666667/7.0*x^7.0+1.2/6.0*x^6.0-2.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "-1.0/1.5*x^3.0-4.166666666666667*x^3.0+1.0/5.0*x^6.0+1.0/6.0*x^7.0+1.0/10.0*x^10.0+1.0/10.0*x^10.0+1.0/6.0*x^7.0+1.0/5.0*x^6.0-1.0/1.5*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "72.0*x^2.0+140.0*x^3.0+504.0*x^6.0+504.0*x^6.0+140.0*x^3.0+72.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "72.0*2.0*x^1.0+140.0*3.0*x^2.0+504.0*6.0*x^5.0+504.0*6.0*x^5.0+140.0*3.0*x^2.0+72.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "144.0*x+420.0*x^2.0+3024.0*x^5.0+3024.0*x^5.0+420.0*x^2.0+144.0*x";
        UsageCalculus.EqnSolArrayMap3[3] = "-1.0/1.5*x^3.0-4.166666666666667*x^3.0+1.0/5.0*x^6.0+1.0/6.0*x^7.0+1.0/10.0*x^10.0+1.0/10.0*x^10.0+1.0/6.0*x^7.0+1.0/5.0*x^6.0-1.0/1.5*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/1.5/4.0*x^4.0-4.166666666666667/4.0*x^4.0+1.0/5.0/7.0*x^7.0+1.0/6.0/8.0*x^8.0+1.0/10.0/11.0*x^11.0+1.0/10.0/11.0*x^11.0+1.0/6.0/8.0*x^8.0+1.0/5.0/7.0*x^7.0-1.0/1.5/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "-1.0/6.0*x^4.0-1.0416666666666667*x^4.0+1.0/35.0*x^7.0+1.0/48.0*x^8.0+1.0/110.0*x^11.0+1.0/110.0*x^11.0+1.0/48.0*x^8.0+1.0/35.0*x^7.0-1.0/6.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "144.0*x+420.0*x^2.0+3024.0*x^5.0+3024.0*x^5.0+420.0*x^2.0+144.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "144.0+420.0*2.0*x^1.0+3024.0*5.0*x^4.0+3024.0*5.0*x^4.0+420.0*2.0*x^1.0+144.0";
        UsageCalculus.EqnSolArrayMap2[4] = "144.0+840.0*x+15120.0*x^4.0+15120.0*x^4.0+840.0*x+144.0";
        UsageCalculus.EqnSolArrayMap3[4] = "-1.0/6.0*x^4.0-1.0416666666666667*x^4.0+1.0/35.0*x^7.0+1.0/48.0*x^8.0+1.0/110.0*x^11.0+1.0/110.0*x^11.0+1.0/48.0*x^8.0+1.0/35.0*x^7.0-1.0/6.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/6.0/5.0*x^5.0-1.0416666666666667/5.0*x^5.0+1.0/35.0/8.0*x^8.0+1.0/48.0/9.0*x^9.0+1.0/110.0/12.0*x^12.0+1.0/110.0/12.0*x^12.0+1.0/48.0/9.0*x^9.0+1.0/35.0/8.0*x^8.0-1.0/6.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "-1.0/30.0*x^5.0-1.0/4.8*x^5.0+1.0/280.0*x^8.0+1.0/432.0*x^9.0+1.0/1320.0*x^12.0+1.0/1320.0*x^12.0+1.0/432.0*x^9.0+1.0/280.0*x^8.0-1.0/30.0*x^5.0-1.0416666666666667*x^4.0";
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
        UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
        UsageCalculus.EqnSolOrder[8] = 8;

        UsageCalculus.EqnSolArrayMap1[9] = "";
        UsageCalculus.EqnSolArrayDiffAlone[9] = "";
        UsageCalculus.EqnSolArrayMap2[9] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
        UsageCalculus.EqnSolOrder[9] = 9;

        UsageCalculus.EqnSolArrayMap1[10] = "";
        UsageCalculus.EqnSolArrayDiffAlone[10] = "";
        UsageCalculus.EqnSolArrayMap2[10] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
        UsageCalculus.EqnSolOrder[10] = 10;

        UsageCalculus.EqnSolArrayMap1[11] = "";
        UsageCalculus.EqnSolArrayDiffAlone[11] = "";
        UsageCalculus.EqnSolArrayMap2[11] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
        UsageCalculus.EqnSolOrder[11] = 11;

        UsageCalculus.EqnSolArrayMap1[12] = "";
        UsageCalculus.EqnSolArrayDiffAlone[12] = "";
        UsageCalculus.EqnSolArrayMap2[12] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
        UsageCalculus.EqnSolOrder[12] = 12;

        UsageCalculus.EqnSolArrayMap1[13] = "";
        UsageCalculus.EqnSolArrayDiffAlone[13] = "";
        UsageCalculus.EqnSolArrayMap2[13] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
        UsageCalculus.EqnSolOrder[13] = 13;

        UsageCalculus.EqnSolArrayMap1[14] = "";
        UsageCalculus.EqnSolArrayDiffAlone[14] = "";
        UsageCalculus.EqnSolArrayMap2[14] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
        UsageCalculus.EqnSolOrder[14] = 14;
    }

    public static void TestCaseDiff4012() {
        //Test Case 4012
        UsageCalculus.TestCase = 4012;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values Except 4th Order Integration";
        UsageCalculus.EqnUnderTest = "- 25.0-1/x + 1/x^4 + 1/x^5 + 1/x^8 + 1/x^8 + 1/x^5 + 1/x^4 - 25.0";
        UsageCalculus.TestCaseName = "Standard:No Coefficients:Basic Equation:Divide Operator";
        UsageCalculus.TestCaseMatrixID = "Sanity TestCase";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;

        UsageCalculus.EqnSolArrayMap1[1] = "-25.0-1.0/x+1.0/x^4.0+1.0/x^5.0+1.0/x^8.0+1.0/x^8.0+1.0/x^5.0+1.0/x^4.0-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0+1.0/x^2.0-4.0/x^5.0-5.0/x^6.0-8.0/x^9.0-8.0/x^9.0-5.0/x^6.0-4.0/x^5.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0/x^2.0-4.0/x^5.0-5.0/x^6.0-8.0/x^9.0-8.0/x^9.0-5.0/x^6.0-4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap3[1] = "-25.0-1.0/x+1.0/x^4.0+1.0/x^5.0+1.0/x^8.0+1.0/x^8.0+1.0/x^5.0+1.0/x^4.0-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "-25.0*x-ln(x)+1.0/-3.0/x^3.0+1.0/-4.0/x^4.0+1.0/-7.0/x^7.0+1.0/-7.0/x^7.0+1.0/-4.0/x^4.0+1.0/-3.0/x^3.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "-25.0*x-ln(x)-1.0/3.0/x^3.0-1.0/4.0/x^4.0-1.0/7.0/x^7.0-1.0/7.0/x^7.0-1.0/4.0/x^4.0-1.0/3.0/x^3.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0/x^2.0-4.0/x^5.0-5.0/x^6.0-8.0/x^9.0-8.0/x^9.0-5.0/x^6.0-4.0/x^5.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-2.0/x^3.0-4.0*-5.0/x^6.0-5.0*-6.0/x^7.0-8.0*-9.0/x^10.0-8.0*-9.0/x^10.0-5.0*-6.0/x^7.0-4.0*-5.0/x^6.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-2.0/x^3.0+20.0/x^6.0+30.0/x^7.0+72.0/x^10.0+72.0/x^10.0+30.0/x^7.0+20.0/x^6.0";
        UsageCalculus.EqnSolArrayMap3[2] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "";
        UsageCalculus.EqnSolArrayMap4[2] = "";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-2.0/x^3.0+20.0/x^6.0+30.0/x^7.0+72.0/x^10.0+72.0/x^10.0+30.0/x^7.0+20.0/x^6.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-2.0*-3.0/x^4.0+20.0*-6.0/x^7.0+30.0*-7.0/x^8.0+72.0*-10.0/x^11.0+72.0*-10.0/x^11.0+30.0*-7.0/x^8.0+20.0*-6.0/x^7.0";
        UsageCalculus.EqnSolArrayMap2[3] = "6.0/x^4.0-120.0/x^7.0-210.0/x^8.0-720.0/x^11.0-720.0/x^11.0-210.0/x^8.0-120.0/x^7.0";
        UsageCalculus.EqnSolArrayMap3[3] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "";
        UsageCalculus.EqnSolArrayMap4[3] = "";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "6.0/x^4.0-120.0/x^7.0-210.0/x^8.0-720.0/x^11.0-720.0/x^11.0-210.0/x^8.0-120.0/x^7.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "6.0*-4.0/x^5.0-120.0*-7.0/x^8.0-210.0*-8.0/x^9.0-720.0*-11.0/x^12.0-720.0*-11.0/x^12.0-210.0*-8.0/x^9.0-120.0*-7.0/x^8.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-24.0/x^5.0+840.0/x^8.0+1680.0/x^9.0+7920.0/x^12.0+7920.0/x^12.0+1680.0/x^9.0+840.0/x^8.0";
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
        UsageCalculus.EqnSolOrder[6] = 6;

        UsageCalculus.EqnSolArrayMap1[7] = "";
        UsageCalculus.EqnSolArrayDiffAlone[7] = "";
        UsageCalculus.EqnSolArrayMap2[7] = "";
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

    public static void TestCaseDiff4013() {
        //Test Case 4013
        UsageCalculus.TestCase = 4013;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values Except 4th Order Integration";
        UsageCalculus.EqnUnderTest = "- 25.0-1/x^-1 + 1/x^-4 + 1/x^-5 + 1/x^-8 + 1/x^-8 + 1/x^-5 + 1/x^-4 - 25.0";
        UsageCalculus.TestCaseName = "Standard:No Coefficients:Basic Equation:Divide Operator";
        UsageCalculus.TestCaseMatrixID = "Sanity TestCase";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;

        UsageCalculus.EqnSolArrayMap1[1] = "-25.0-x+x^4.0+x^5.0+x^8.0+x^8.0+x^5.0+x^4.0-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0-1.0+4.0*x^3.0+5.0*x^4.0+8.0*x^7.0+8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-1.0+4.0*x^3.0+5.0*x^4.0+8.0*x^7.0+8.0*x^7.0+5.0*x^4.0+4.0*x^3.0";
        UsageCalculus.EqnSolArrayMap3[1] = "-25.0-x+x^4.0+x^5.0+x^8.0+x^8.0+x^5.0+x^4.0-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "-25.0*x-1.0/2.0*x^2.0+1.0/5.0*x^5.0+1.0/6.0*x^6.0+1.0/9.0*x^9.0+1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "-25.0*x-1.0/2.0*x^2.0+1.0/5.0*x^5.0+1.0/6.0*x^6.0+1.0/9.0*x^9.0+1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-1.0+4.0*x^3.0+5.0*x^4.0+8.0*x^7.0+8.0*x^7.0+5.0*x^4.0+4.0*x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-0.0+4.0*3.0*x^2.0+5.0*4.0*x^3.0+8.0*7.0*x^6.0+8.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0";
        UsageCalculus.EqnSolArrayMap2[2] = "12.0*x^2.0+20.0*x^3.0+56.0*x^6.0+56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "";
        UsageCalculus.EqnSolArrayMap4[2] = "";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "12.0*x^2.0+20.0*x^3.0+56.0*x^6.0+56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "12.0*2.0*x^1.0+20.0*3.0*x^2.0+56.0*6.0*x^5.0+56.0*6.0*x^5.0+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "24.0*x+60.0*x^2.0+336.0*x^5.0+336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "";
        UsageCalculus.EqnSolArrayMap4[3] = "";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "24.0*x+60.0*x^2.0+336.0*x^5.0+336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "24.0+60.0*2.0*x^1.0+336.0*5.0*x^4.0+336.0*5.0*x^4.0+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "24.0+120.0*x+1680.0*x^4.0+1680.0*x^4.0+120.0*x+24.0";
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
        UsageCalculus.EqnSolOrder[6] = 6;

        UsageCalculus.EqnSolArrayMap1[7] = "";
        UsageCalculus.EqnSolArrayDiffAlone[7] = "";
        UsageCalculus.EqnSolArrayMap2[7] = "";
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

    public static void TestCaseDiff4014() {
        //Only Trailing Constant
        //Test Case 4014
        UsageCalculus.TestCase = 4014;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values Trailing Constant Dropped";
        UsageCalculus.EqnRegressionIntegreStatus = "All RED Including Values Trailing Constant Dropped";
        UsageCalculus.EqnUnderTest = "x^7.0/8.0-x^7.0/8.0+x^4.0/5.0-x^4.0/5.0+x^3.0-x^3.0/4.0 + x^7.0/8.0-x^7.0/8.0+x^4.0/5.0-x^4.0/5.0+x^3.0-x^3.0/4.0";
        UsageCalculus.TestCaseName = "Standard:Basic Equation:With  Trailing Coefficients alone";
        UsageCalculus.TestCaseMatrixID = "Sanity TestCase";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "1.0/8.0*x^7.0-1.0/8.0*x^7.0+1.0/5.0*x^4.0-1.0/5.0*x^4.0+x^3.0-1.0/4.0*x^3.0+1.0/8.0*x^7.0-1.0/8.0*x^7.0+1.0/5.0*x^4.0-1.0/5.0*x^4.0+x^3.0-1.0/4.0*x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/8.0*7.0*x^6.0-1.0/8.0*7.0*x^6.0+1.0/5.0*4.0*x^3.0-1.0/5.0*4.0*x^3.0+3.0*x^2.0-1.0/4.0*3.0*x^2.0+1.0/8.0*7.0*x^6.0-1.0/8.0*7.0*x^6.0+1.0/5.0*4.0*x^3.0-1.0/5.0*4.0*x^3.0+3.0*x^2.0-1.0/4.0*3.0*x^2.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0/1.1428571428571428*x^6.0-1.0/1.1428571428571428*x^6.0+1.0/1.25*x^3.0-1.0/1.25*x^3.0+3.0*x^2.0-1.0/1.3333333333333333*x^2.0+1.0/1.1428571428571428*x^6.0-1.0/1.1428571428571428*x^6.0+1.0/1.25*x^3.0-1.0/1.25*x^3.0+3.0*x^2.0-1.0/1.3333333333333333*x^2.0";
        UsageCalculus.EqnSolArrayMap3[1] = "1.0/8.0*x^7.0-1.0/8.0*x^7.0+1.0/5.0*x^4.0-1.0/5.0*x^4.0+x^3.0-1.0/4.0*x^3.0+1.0/8.0*x^7.0-1.0/8.0*x^7.0+1.0/5.0*x^4.0-1.0/5.0*x^4.0+x^3.0-1.0/4.0*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0/8.0/8.0*x^8.0-1.0/8.0/8.0*x^8.0+1.0/5.0/5.0*x^5.0-1.0/5.0/5.0*x^5.0+1.0/4.0*x^4.0-1.0/4.0/4.0*x^4.0+1.0/8.0/8.0*x^8.0-1.0/8.0/8.0*x^8.0+1.0/5.0/5.0*x^5.0-1.0/5.0/5.0*x^5.0+1.0/4.0*x^4.0-1.0/4.0/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[1] = "1.0/64.0*x^8.0-1.0/64.0*x^8.0+1.0/25.0*x^5.0-1.0/25.0*x^5.0+1.0/4.0*x^4.0-1.0/16.0*x^4.0+1.0/64.0*x^8.0-1.0/64.0*x^8.0+1.0/25.0*x^5.0-1.0/25.0*x^5.0+1.0/4.0*x^4.0-1.0/16.0*x^4.0";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0/1.1428571428571428*x^6.0-1.0/1.1428571428571428*x^6.0+1.0/1.25*x^3.0-1.0/1.25*x^3.0+3.0*x^2.0-1.0/1.3333333333333333*x^2.0+1.0/1.1428571428571428*x^6.0-1.0/1.1428571428571428*x^6.0+1.0/1.25*x^3.0-1.0/1.25*x^3.0+3.0*x^2.0-1.0/1.3333333333333333*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "1.0/1.1428571428571428*6.0*x^5.0-1.0/1.1428571428571428*6.0*x^5.0+1.0/1.25*3.0*x^2.0-1.0/1.25*3.0*x^2.0+3.0*2.0*x^1.0-1.0/1.3333333333333333*2.0*x^1.0+1.0/1.1428571428571428*6.0*x^5.0-1.0/1.1428571428571428*6.0*x^5.0+1.0/1.25*3.0*x^2.0-1.0/1.25*3.0*x^2.0+3.0*2.0*x^1.0-1.0/1.3333333333333333*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[2] = "5.25*x^5.0-5.25*x^5.0+2.4*x^2.0-2.4*x^2.0+6.0*x-1.5*x+5.25*x^5.0-5.25*x^5.0+2.4*x^2.0-2.4*x^2.0+6.0*x-1.5*x";
        UsageCalculus.EqnSolArrayMap3[2] = "1.0/64.0*x^8.0-1.0/64.0*x^8.0+1.0/25.0*x^5.0-1.0/25.0*x^5.0+1.0/4.0*x^4.0-1.0/16.0*x^4.0+1.0/64.0*x^8.0-1.0/64.0*x^8.0+1.0/25.0*x^5.0-1.0/25.0*x^5.0+1.0/4.0*x^4.0-1.0/16.0*x^4.0";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/64.0/9.0*x^9.0-1.0/64.0/9.0*x^9.0+1.0/25.0/6.0*x^6.0-1.0/25.0/6.0*x^6.0+1.0/4.0/5.0*x^5.0-1.0/16.0/5.0*x^5.0+1.0/64.0/9.0*x^9.0-1.0/64.0/9.0*x^9.0+1.0/25.0/6.0*x^6.0-1.0/25.0/6.0*x^6.0+1.0/4.0/5.0*x^5.0-1.0/16.0/5.0*x^5.0";
        UsageCalculus.EqnSolArrayMap4[2] = "1.0/576.0*x^9.0-1.0/576.0*x^9.0+1.0/150.0*x^6.0-1.0/150.0*x^6.0+1.0/20.0*x^5.0-1.0/80.0*x^5.0+1.0/576.0*x^9.0-1.0/576.0*x^9.0+1.0/150.0*x^6.0-1.0/150.0*x^6.0+1.0/20.0*x^5.0-1.0/80.0*x^5.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "5.25*x^5.0-5.25*x^5.0+2.4*x^2.0-2.4*x^2.0+6.0*x-1.5*x+5.25*x^5.0-5.25*x^5.0+2.4*x^2.0-2.4*x^2.0+6.0*x-1.5*x";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "5.25*5.0*x^4.0-5.25*5.0*x^4.0+2.4*2.0*x^1.0-2.4*2.0*x^1.0+6.0-1.5+5.25*5.0*x^4.0-5.25*5.0*x^4.0+2.4*2.0*x^1.0-2.4*2.0*x^1.0+6.0-1.5";
        UsageCalculus.EqnSolArrayMap2[3] = "26.25*x^4.0-26.25*x^4.0+4.8*x-4.8*x+6.0-1.5+26.25*x^4.0-26.25*x^4.0+4.8*x-4.8*x+6.0-1.5";
        UsageCalculus.EqnSolArrayMap3[3] = "1.0/576.0*x^9.0-1.0/576.0*x^9.0+1.0/150.0*x^6.0-1.0/150.0*x^6.0+1.0/20.0*x^5.0-1.0/80.0*x^5.0+1.0/576.0*x^9.0-1.0/576.0*x^9.0+1.0/150.0*x^6.0-1.0/150.0*x^6.0+1.0/20.0*x^5.0-1.0/80.0*x^5.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/576.0/10.0*x^10.0-1.0/576.0/10.0*x^10.0+1.0/150.0/7.0*x^7.0-1.0/150.0/7.0*x^7.0+1.0/20.0/6.0*x^6.0-1.0/80.0/6.0*x^6.0+1.0/576.0/10.0*x^10.0-1.0/576.0/10.0*x^10.0+1.0/150.0/7.0*x^7.0-1.0/150.0/7.0*x^7.0+1.0/20.0/6.0*x^6.0-1.0/80.0/6.0*x^6.0";
        UsageCalculus.EqnSolArrayMap4[3] = "1.0/5760.0*x^10.0-1.0/5760.0*x^10.0+1.0/1050.0*x^7.0-1.0/1050.0*x^7.0+1.0/120.0*x^6.0-1.0/480.0*x^6.0+1.0/5760.0*x^10.0-1.0/5760.0*x^10.0+1.0/1050.0*x^7.0-1.0/1050.0*x^7.0+1.0/120.0*x^6.0-1.0/480.0*x^6.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "26.25*x^4.0-26.25*x^4.0+4.8*x-4.8*x+6.0-1.5+26.25*x^4.0-26.25*x^4.0+4.8*x-4.8*x+6.0-1.5";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "26.25*4.0*x^3.0-26.25*4.0*x^3.0+4.8-4.8+6.0*0.0-1.5*0.0+26.25*4.0*x^3.0-26.25*4.0*x^3.0+4.8-4.8+6.0*0.0-1.5*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "105.0*x^3.0-105.0*x^3.0+4.8-4.8+105.0*x^3.0-105.0*x^3.0+4.8-4.8";
        UsageCalculus.EqnSolArrayMap3[4] = "1.0/5760.0*x^10.0-1.0/5760.0*x^10.0+1.0/1050.0*x^7.0-1.0/1050.0*x^7.0+1.0/120.0*x^6.0-1.0/480.0*x^6.0+1.0/5760.0*x^10.0-1.0/5760.0*x^10.0+1.0/1050.0*x^7.0-1.0/1050.0*x^7.0+1.0/120.0*x^6.0-1.0/480.0*x^6.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/5760.0/11.0*x^11.0-1.0/5760.0/11.0*x^11.0+1.0/1050.0/8.0*x^8.0-1.0/1050.0/8.0*x^8.0+1.0/120.0/7.0*x^7.0-1.0/480.0/7.0*x^7.0+1.0/5760.0/11.0*x^11.0-1.0/5760.0/11.0*x^11.0+1.0/1050.0/8.0*x^8.0-1.0/1050.0/8.0*x^8.0+1.0/120.0/7.0*x^7.0-1.0/480.0/7.0*x^7.0";
        UsageCalculus.EqnSolArrayMap4[4] = "1.0/63360.0*x^11.0-1.0/63360.0*x^11.0+1.0/8400.0*x^8.0-1.0/8400.0*x^8.0+1.0/840.0*x^7.0-1.0/3360.0*x^7.0+1.0/63360.0*x^11.0-1.0/63360.0*x^11.0+1.0/8400.0*x^8.0-1.0/8400.0*x^8.0+1.0/840.0*x^7.0-1.0/3360.0*x^7.0";
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

    public static void TestCaseDiff4015() {
        //Test Case 4015
        UsageCalculus.TestCase = 4015;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values Except 4th Order Integration";
        UsageCalculus.EqnUnderTest = "- 25.0 + 1/x^4 + 1/x^5 + 1/x^8 + 1/x^8 + 1/x^5 + 1/x^4 - 25.0";
        UsageCalculus.TestCaseName = "Standard:No Coefficients:Basic Equation:Divide Operator";
        UsageCalculus.TestCaseMatrixID = "Sanity TestCase";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 5;

        UsageCalculus.EqnSolArrayMap1[1] = "-25.0+1.0/x^4.0+1.0/x^5.0+1.0/x^8.0+1.0/x^8.0+1.0/x^5.0+1.0/x^4.0-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0-4.0/x^5.0-5.0/x^6.0-8.0/x^9.0-8.0/x^9.0-5.0/x^6.0-4.0/x^5.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-4.0/x^5.0-5.0/x^6.0-8.0/x^9.0-8.0/x^9.0-5.0/x^6.0-4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap3[1] = "-25.0+1.0/x^4.0+1.0/x^5.0+1.0/x^8.0+1.0/x^8.0+1.0/x^5.0+1.0/x^4.0-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "-25.0*x+1.0/-3.0/x^3.0+1.0/-4.0/x^4.0+1.0/-7.0/x^7.0+1.0/-7.0/x^7.0+1.0/-4.0/x^4.0+1.0/-3.0/x^3.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "-25.0*x-1.0/3.0/x^3.0-1.0/4.0/x^4.0-1.0/7.0/x^7.0-1.0/7.0/x^7.0-1.0/4.0/x^4.0-1.0/3.0/x^3.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-4.0/x^5.0-5.0/x^6.0-8.0/x^9.0-8.0/x^9.0-5.0/x^6.0-4.0/x^5.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-4.0*-5.0/x^6.0-5.0*-6.0/x^7.0-8.0*-9.0/x^10.0-8.0*-9.0/x^10.0-5.0*-6.0/x^7.0-4.0*-5.0/x^6.0";
        UsageCalculus.EqnSolArrayMap2[2] = "20.0/x^6.0+30.0/x^7.0+72.0/x^10.0+72.0/x^10.0+30.0/x^7.0+20.0/x^6.0";
        UsageCalculus.EqnSolArrayMap3[2] = "-25.0*x-1.0/3.0/x^3.0-1.0/4.0/x^4.0-1.0/7.0/x^7.0-1.0/7.0/x^7.0-1.0/4.0/x^4.0-1.0/3.0/x^3.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "-25.0/2.0*x^2.0-1.0/3.0/-2.0/x^2.0-1.0/4.0/-3.0/x^3.0-1.0/7.0/-6.0/x^6.0-1.0/7.0/-6.0/x^6.0-1.0/4.0/-3.0/x^3.0-1.0/3.0/-2.0/x^2.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "-12.5*x^2.0+1.0/6.0/x^2.0+1.0/12.0/x^3.0+1.0/42.0/x^6.0+1.0/42.0/x^6.0+1.0/12.0/x^3.0+1.0/6.0/x^2.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "20.0/x^6.0+30.0/x^7.0+72.0/x^10.0+72.0/x^10.0+30.0/x^7.0+20.0/x^6.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "20.0*-6.0/x^7.0+30.0*-7.0/x^8.0+72.0*-10.0/x^11.0+72.0*-10.0/x^11.0+30.0*-7.0/x^8.0+20.0*-6.0/x^7.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-120.0/x^7.0-210.0/x^8.0-720.0/x^11.0-720.0/x^11.0-210.0/x^8.0-120.0/x^7.0";
        UsageCalculus.EqnSolArrayMap3[3] = "-12.5*x^2.0+1.0/6.0/x^2.0+1.0/12.0/x^3.0+1.0/42.0/x^6.0+1.0/42.0/x^6.0+1.0/12.0/x^3.0+1.0/6.0/x^2.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "-12.5/3.0*x^3.0+1.0/6.0/-1.0/x^1.0+1.0/12.0/-2.0/x^2.0+1.0/42.0/-5.0/x^5.0+1.0/42.0/-5.0/x^5.0+1.0/12.0/-2.0/x^2.0+1.0/6.0/-1.0/x^1.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "-4.166666666666667*x^3.0-1.0/6.0/x-1.0/24.0/x^2.0-1.0/210.0/x^5.0-1.0/210.0/x^5.0-1.0/24.0/x^2.0-1.0/6.0/x-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-120.0/x^7.0-210.0/x^8.0-720.0/x^11.0-720.0/x^11.0-210.0/x^8.0-120.0/x^7.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-120.0*-7.0/x^8.0-210.0*-8.0/x^9.0-720.0*-11.0/x^12.0-720.0*-11.0/x^12.0-210.0*-8.0/x^9.0-120.0*-7.0/x^8.0";
        UsageCalculus.EqnSolArrayMap2[4] = "840.0/x^8.0+1680.0/x^9.0+7920.0/x^12.0+7920.0/x^12.0+1680.0/x^9.0+840.0/x^8.0";
        UsageCalculus.EqnSolArrayMap3[4] = "-4.166666666666667*x^3.0-1.0/6.0/x-1.0/24.0/x^2.0-1.0/210.0/x^5.0-1.0/210.0/x^5.0-1.0/24.0/x^2.0-1.0/6.0/x-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "-4.166666666666667/4.0*x^4.0-1.0/6.0*ln(x)-1.0/24.0/-1.0/x^1.0-1.0/210.0/-4.0/x^4.0-1.0/210.0/-4.0/x^4.0-1.0/24.0/-1.0/x^1.0-1.0/6.0*ln(x)-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "-1.0416666666666667*x^4.0-1.0/6.0*ln(x)+1.0/24.0/x+1.0/840.0/x^4.0+1.0/840.0/x^4.0+1.0/24.0/x-1.0/6.0*ln(x)-1.0416666666666667*x^4.0";
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
        UsageCalculus.EqnSolOrder[6] = 6;

        UsageCalculus.EqnSolArrayMap1[7] = "";
        UsageCalculus.EqnSolArrayDiffAlone[7] = "";
        UsageCalculus.EqnSolArrayMap2[7] = "";
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

    public static void TestCaseDiff4016() {
        //Test Case 4016
        UsageCalculus.TestCase = 4016;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values Except 4th Order Integration";
        UsageCalculus.EqnUnderTest = "- 25.0 + 1/x^-4 + 1/x^-5 + 1/x^-8 + 1/x^-8 + 1/x^-5 + 1/x^-4 - 25.0";
        UsageCalculus.TestCaseName = "Standard:No Coefficients:Basic Equation:Divide Operator";
        UsageCalculus.TestCaseMatrixID = "Sanity TestCase";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "-25.0+x^4.0+x^5.0+x^8.0+x^8.0+x^5.0+x^4.0-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0+4.0*x^3.0+5.0*x^4.0+8.0*x^7.0+8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "4.0*x^3.0+5.0*x^4.0+8.0*x^7.0+8.0*x^7.0+5.0*x^4.0+4.0*x^3.0";
        UsageCalculus.EqnSolArrayMap3[1] = "-25.0+x^4.0+x^5.0+x^8.0+x^8.0+x^5.0+x^4.0-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "-25.0*x+1.0/5.0*x^5.0+1.0/6.0*x^6.0+1.0/9.0*x^9.0+1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "-25.0*x+1.0/5.0*x^5.0+1.0/6.0*x^6.0+1.0/9.0*x^9.0+1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "4.0*x^3.0+5.0*x^4.0+8.0*x^7.0+8.0*x^7.0+5.0*x^4.0+4.0*x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "4.0*3.0*x^2.0+5.0*4.0*x^3.0+8.0*7.0*x^6.0+8.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0";
        UsageCalculus.EqnSolArrayMap2[2] = "12.0*x^2.0+20.0*x^3.0+56.0*x^6.0+56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2] = "-25.0*x+1.0/5.0*x^5.0+1.0/6.0*x^6.0+1.0/9.0*x^9.0+1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "-25.0/2.0*x^2.0+1.0/5.0/6.0*x^6.0+1.0/6.0/7.0*x^7.0+1.0/9.0/10.0*x^10.0+1.0/9.0/10.0*x^10.0+1.0/6.0/7.0*x^7.0+1.0/5.0/6.0*x^6.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "-12.5*x^2.0+1.0/30.0*x^6.0+1.0/42.0*x^7.0+1.0/90.0*x^10.0+1.0/90.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "12.0*x^2.0+20.0*x^3.0+56.0*x^6.0+56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "12.0*2.0*x^1.0+20.0*3.0*x^2.0+56.0*6.0*x^5.0+56.0*6.0*x^5.0+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "24.0*x+60.0*x^2.0+336.0*x^5.0+336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3] = "-12.5*x^2.0+1.0/30.0*x^6.0+1.0/42.0*x^7.0+1.0/90.0*x^10.0+1.0/90.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "-12.5/3.0*x^3.0+1.0/30.0/7.0*x^7.0+1.0/42.0/8.0*x^8.0+1.0/90.0/11.0*x^11.0+1.0/90.0/11.0*x^11.0+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "-4.166666666666667*x^3.0+1.0/210.0*x^7.0+1.0/336.0*x^8.0+1.0/990.0*x^11.0+1.0/990.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "24.0*x+60.0*x^2.0+336.0*x^5.0+336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "24.0+60.0*2.0*x^1.0+336.0*5.0*x^4.0+336.0*5.0*x^4.0+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "24.0+120.0*x+1680.0*x^4.0+1680.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4] = "-4.166666666666667*x^3.0+1.0/210.0*x^7.0+1.0/336.0*x^8.0+1.0/990.0*x^11.0+1.0/990.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "-4.166666666666667/4.0*x^4.0+1.0/210.0/8.0*x^8.0+1.0/336.0/9.0*x^9.0+1.0/990.0/12.0*x^12.0+1.0/990.0/12.0*x^12.0+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "-1.0416666666666667*x^4.0+1.0/1680.0*x^8.0+1.0/3024.0*x^9.0+1.0/11880.0*x^12.0+1.0/11880.0*x^12.0+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0-1.0416666666666667*x^4.0";
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
        UsageCalculus.EqnSolOrder[6] = 6;

        UsageCalculus.EqnSolArrayMap1[7] = "";
        UsageCalculus.EqnSolArrayDiffAlone[7] = "";
        UsageCalculus.EqnSolArrayMap2[7] = "";
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
    //Palindromic String-Equation Test End

    /* **************************************** */
 /* ***************IndConstant Test Case***************** */
 /* **************************************** */
    public static void TestCaseDiff4017() {
        //Test Case 4017
        UsageCalculus.TestCase = 4017;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values Except 4th Order Integration";
        UsageCalculus.EqnUnderTest = "1.0/1.0*p/9.0*xyc1^9.0 + 2.0/2.0*p*6.0*xyc1^6.0 + p/5.0*xyc1^5.0 + p*2.0*xyc1^2.0 + p*25.0*xyc1 + p*50.0";
        UsageCalculus.TestCaseName = "Standard:Independent Constant:Basic Equation:Divide Operator";
        UsageCalculus.TestCaseMatrixID = "Unit TestCase";

        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "p/9.0*xyc1^9.0+p*6.0*xyc1^6.0+p/5.0*xyc1^5.0+p*2.0*xyc1^2.0+p*25.0*xyc1+p*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "p/9.0*9.0*xyc1^8.0+p*6.0*6.0*xyc1^5.0+p/5.0*5.0*xyc1^4.0+p*2.0*2.0*xyc1^1.0+p*25.0+p*50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "p*xyc1^8.0+p*36.0*xyc1^5.0+p*xyc1^4.0+p*4.0*xyc1+p*25.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[1] = "p/9.0*xyc1^9.0+p*6.0*xyc1^6.0+p/5.0*xyc1^5.0+p*2.0*xyc1^2.0+p*25.0*xyc1+p*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "p/9.0/10.0*xyc1^10.0+p*6.0/7.0*xyc1^7.0+p/5.0/6.0*xyc1^6.0+p*2.0/3.0*xyc1^3.0+p*25.0/2.0*xyc1^2.0+p*50.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1] = "p*0.011111111111111112*xyc1^10.0+p*0.8571428571428571*xyc1^7.0+p*0.03333333333333333*xyc1^6.0+p*0.6666666666666666*xyc1^3.0+p*12.5*xyc1^2.0+p*50.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "p*xyc1^8.0+p*36.0*xyc1^5.0+p*xyc1^4.0+p*4.0*xyc1+p*25.0+p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "p*8.0*xyc1^7.0+p*36.0*5.0*xyc1^4.0+p*4.0*xyc1^3.0+p*4.0+p*25.0*0.0+p*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "p*8.0*xyc1^7.0+p*180.0*xyc1^4.0+p*4.0*xyc1^3.0+p*4.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[2] = "p*0.011111111111111112*xyc1^10.0+p*0.8571428571428571*xyc1^7.0+p*0.03333333333333333*xyc1^6.0+p*0.6666666666666666*xyc1^3.0+p*12.5*xyc1^2.0+p*50.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "p*0.011111111111111112/11.0*xyc1^11.0+p*0.8571428571428571/8.0*xyc1^8.0+p*0.03333333333333333/7.0*xyc1^7.0+p*0.6666666666666666/4.0*xyc1^4.0+p*12.5/3.0*xyc1^3.0+p*50.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "p*0.00101010101010101*xyc1^11.0+p*0.10714285714285714*xyc1^8.0+p*0.0047619047619047615*xyc1^7.0+p*0.16666666666666666*xyc1^4.0+p*4.166666666666667*xyc1^3.0+p*25.0*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "p*8.0*xyc1^7.0+p*180.0*xyc1^4.0+p*4.0*xyc1^3.0+p*4.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "p*8.0*7.0*xyc1^6.0+p*180.0*4.0*xyc1^3.0+p*4.0*3.0*xyc1^2.0+p*4.0*0.0+p*0.0*0.0+p*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "p*56.0*xyc1^6.0+p*720.0*xyc1^3.0+p*12.0*xyc1^2.0+p*0.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[3] = "p*0.00101010101010101*xyc1^11.0+p*0.10714285714285714*xyc1^8.0+p*0.0047619047619047615*xyc1^7.0+p*0.16666666666666666*xyc1^4.0+p*4.166666666666667*xyc1^3.0+p*25.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "p*0.00101010101010101/12.0*xyc1^12.0+p*0.10714285714285714/9.0*xyc1^9.0+p*0.0047619047619047615/8.0*xyc1^8.0+p*0.16666666666666666/5.0*xyc1^5.0+p*4.166666666666667/4.0*xyc1^4.0+p*25.0/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "p*8.417508417508418E-5*xyc1^12.0+p*0.011904761904761904*xyc1^9.0+p*5.952380952380952E-4*xyc1^8.0+p*0.03333333333333333*xyc1^5.0+p*1.0416666666666667*xyc1^4.0+p*8.333333333333334*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "p*56.0*xyc1^6.0+p*720.0*xyc1^3.0+p*12.0*xyc1^2.0+p*0.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "p*56.0*6.0*xyc1^5.0+p*720.0*3.0*xyc1^2.0+p*12.0*2.0*xyc1^1.0+p*0.0*0.0+p*0.0*0.0+p*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "p*336.0*xyc1^5.0+p*2160.0*xyc1^2.0+p*24.0*xyc1+p*0.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[4] = "p*8.417508417508418E-5*xyc1^12.0+p*0.011904761904761904*xyc1^9.0+p*5.952380952380952E-4*xyc1^8.0+p*0.03333333333333333*xyc1^5.0+p*1.0416666666666667*xyc1^4.0+p*8.333333333333334*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "p*8.417508417508418E-5/13.0*xyc1^13.0+p*0.011904761904761904/10.0*xyc1^10.0+p*5.952380952380952E-4/9.0*xyc1^9.0+p*0.03333333333333333/6.0*xyc1^6.0+p*1.0416666666666667/5.0*xyc1^5.0+p*8.333333333333334/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "p*6.475006475006475E-6*xyc1^13.0+p*0.0011904761904761904*xyc1^10.0+p*6.613756613756613E-5*xyc1^9.0+p*0.005555555555555556*xyc1^6.0+p*0.20833333333333334*xyc1^5.0+p*2.0833333333333335*xyc1^4.0";
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
        UsageCalculus.EqnSolOrder[6] = 6;

        UsageCalculus.EqnSolArrayMap1[7] = "";
        UsageCalculus.EqnSolArrayDiffAlone[7] = "";
        UsageCalculus.EqnSolArrayMap2[7] = "";
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

    public static void TestCaseDiff4018() {
        //Test Case 4018
        UsageCalculus.TestCase = 4018;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0/1.0*a*x^8 + a*x^5 + 2.0/2.0*a*x^4 - 2*a*x- 25*(2)";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID = "IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "a*x^8.0+a*x^5.0+a*x^4.0-a*2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a*8.0*x^7.0+a*5.0*x^4.0+a*4.0*x^3.0-a*2.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a*8.0*x^7.0+a*5.0*x^4.0+a*4.0*x^3.0-a*2.0";
        UsageCalculus.EqnSolArrayMap3[1] = "a*x^8.0+a*x^5.0+a*x^4.0-a*2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "a/9.0*x^9.0+a/6.0*x^6.0+a/5.0*x^5.0-a*x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "a/9.0*x^9.0+a/6.0*x^6.0+a/5.0*x^5.0-a*x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a*8.0*x^7.0+a*5.0*x^4.0+a*4.0*x^3.0-a*2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a*8.0*7.0*x^6.0+a*5.0*4.0*x^3.0+a*4.0*3.0*x^2.0-a*2.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a*56.0*x^6.0+a*20.0*x^3.0+a*12.0*x^2.0-a*0.0";
        UsageCalculus.EqnSolArrayMap3[2] = "a/9.0*x^9.0+a/6.0*x^6.0+a/5.0*x^5.0-a*x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "a/9.0/10.0*x^10.0+a/6.0/7.0*x^7.0+a/5.0/6.0*x^6.0-a/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "a*0.011111111111111112*x^10.0+a*0.023809523809523808*x^7.0+a*0.03333333333333333*x^6.0-a/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a*56.0*x^6.0+a*20.0*x^3.0+a*12.0*x^2.0-a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a*56.0*6.0*x^5.0+a*20.0*3.0*x^2.0+a*12.0*2.0*x^1.0-a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a*336.0*x^5.0+a*60.0*x^2.0+a*24.0*x-a*0.0";
        UsageCalculus.EqnSolArrayMap3[3] = "a*0.011111111111111112*x^10.0+a*0.023809523809523808*x^7.0+a*0.03333333333333333*x^6.0-a/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "a*0.011111111111111112/11.0*x^11.0+a*0.023809523809523808/8.0*x^8.0+a*0.03333333333333333/7.0*x^7.0-a/3.0/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "a*0.00101010101010101*x^11.0+a*0.002976190476190476*x^8.0+a*0.0047619047619047615*x^7.0-a/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a*336.0*x^5.0+a*60.0*x^2.0+a*24.0*x-a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a*336.0*5.0*x^4.0+a*60.0*2.0*x^1.0+a*24.0-a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a*1680.0*x^4.0+a*120.0*x+a*24.0-a*0.0";
        UsageCalculus.EqnSolArrayMap3[4] = "a*0.00101010101010101*x^11.0+a*0.002976190476190476*x^8.0+a*0.0047619047619047615*x^7.0-a/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "a*0.00101010101010101/12.0*x^12.0+a*0.002976190476190476/9.0*x^9.0+a*0.0047619047619047615/8.0*x^8.0-a/12.0/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "a*8.417508417508418E-5*x^12.0+a*3.3068783068783067E-4*x^9.0+a*5.952380952380952E-4*x^8.0-a/60.0*x^5.0-2.0833333333333335*x^4.0";
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

    public static void TestCaseDiff4019() {
        //Test Case 4019
        UsageCalculus.TestCase = 4019;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "2^a*x^8 + 2^a*x^5 + 2^a*x^4 - 2*x*2^a- 25*2*3^a";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID = "IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "2.0^a*x^8.0+2.0^a*x^5.0+2.0^a*x^4.0-2.0^a*2.0*x-3.0^a*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "2.0^a*8.0*x^7.0+2.0^a*5.0*x^4.0+2.0^a*4.0*x^3.0-2.0^a*2.0-3.0^a*50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "2.0^a*8.0*x^7.0+2.0^a*5.0*x^4.0+2.0^a*4.0*x^3.0-2.0^a*2.0-3.0^a*0.0";
        UsageCalculus.EqnSolArrayMap3[1] = "2.0^a*x^8.0+2.0^a*x^5.0+2.0^a*x^4.0-2.0^a*2.0*x-3.0^a*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "2.0^a/9.0*x^9.0+2.0^a/6.0*x^6.0+2.0^a/5.0*x^5.0-2.0^a*2.0/2.0*x^2.0-3.0^a*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "2.0^a/9.0*x^9.0+2.0^a/6.0*x^6.0+2.0^a/5.0*x^5.0-2.0^a*x^2.0-3.0^a*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "2.0^a*8.0*x^7.0+2.0^a*5.0*x^4.0+2.0^a*4.0*x^3.0-2.0^a*2.0-3.0^a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "2.0^a*8.0*7.0*x^6.0+2.0^a*5.0*4.0*x^3.0+2.0^a*4.0*3.0*x^2.0-2.0^a*2.0*0.0-3.0^a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "2.0^a*56.0*x^6.0+2.0^a*20.0*x^3.0+2.0^a*12.0*x^2.0-2.0^a*0.0-3.0^a*0.0";
        UsageCalculus.EqnSolArrayMap3[2] = "2.0^a/9.0*x^9.0+2.0^a/6.0*x^6.0+2.0^a/5.0*x^5.0-2.0^a*x^2.0-3.0^a*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "2.0^a/9.0/10.0*x^10.0+2.0^a/6.0/7.0*x^7.0+2.0^a/5.0/6.0*x^6.0-2.0^a/3.0*x^3.0-3.0^a*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "2.0^a/90.0*x^10.0+2.0^a/42.0*x^7.0+2.0^a/30.0*x^6.0-2.0^a/3.0*x^3.0-3.0^a*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "2.0^a*56.0*x^6.0+2.0^a*20.0*x^3.0+2.0^a*12.0*x^2.0-2.0^a*0.0-3.0^a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "2.0^a*56.0*6.0*x^5.0+2.0^a*20.0*3.0*x^2.0+2.0^a*12.0*2.0*x^1.0-2.0^a*0.0*0.0-3.0^a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "2.0^a*336.0*x^5.0+2.0^a*60.0*x^2.0+2.0^a*24.0*x-2.0^a*0.0-3.0^a*0.0";
        UsageCalculus.EqnSolArrayMap3[3] = "2.0^a/90.0*x^10.0+2.0^a/42.0*x^7.0+2.0^a/30.0*x^6.0-2.0^a/3.0*x^3.0-3.0^a*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "2.0^a/90.0/11.0*x^11.0+2.0^a/42.0/8.0*x^8.0+2.0^a/30.0/7.0*x^7.0-2.0^a/3.0/4.0*x^4.0-3.0^a*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "2.0^a/990.0*x^11.0+2.0^a/336.0*x^8.0+2.0^a/210.0*x^7.0-2.0^a/12.0*x^4.0-3.0^a*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "2.0^a*336.0*x^5.0+2.0^a*60.0*x^2.0+2.0^a*24.0*x-2.0^a*0.0-3.0^a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "2.0^a*336.0*5.0*x^4.0+2.0^a*60.0*2.0*x^1.0+2.0^a*24.0-2.0^a*0.0*0.0-3.0^a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "2.0^a*1680.0*x^4.0+2.0^a*120.0*x+2.0^a*24.0-2.0^a*0.0-3.0^a*0.0";
        UsageCalculus.EqnSolArrayMap3[4] = "2.0^a/990.0*x^11.0+2.0^a/336.0*x^8.0+2.0^a/210.0*x^7.0-2.0^a/12.0*x^4.0-3.0^a*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "2.0^a/990.0/12.0*x^12.0+2.0^a/336.0/9.0*x^9.0+2.0^a/210.0/8.0*x^8.0-2.0^a/12.0/5.0*x^5.0-3.0^a*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "2.0^a/11880.0*x^12.0+2.0^a/3024.0*x^9.0+2.0^a/1680.0*x^8.0-2.0^a/60.0*x^5.0-3.0^a*2.0833333333333335*x^4.0";
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

    public static void TestCaseDiff4020() {
        //Test Case 4020
        UsageCalculus.TestCase = 4020;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "a^2*x^8 + a^2*x^5 + a^2*x^4 - 2*x*a^2- 25*2*a^3";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID = "IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "a^2.0*x^8.0+a^2.0*x^5.0+a^2.0*x^4.0-a^2.0*2.0*x-a^3.0*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a^2.0*8.0*x^7.0+a^2.0*5.0*x^4.0+a^2.0*4.0*x^3.0-a^2.0*2.0-a^3.0*50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a^2.0*8.0*x^7.0+a^2.0*5.0*x^4.0+a^2.0*4.0*x^3.0-a^2.0*2.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[1] = "a^2.0*x^8.0+a^2.0*x^5.0+a^2.0*x^4.0-a^2.0*2.0*x-a^3.0*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "a^2.0/9.0*x^9.0+a^2.0/6.0*x^6.0+a^2.0/5.0*x^5.0-a^2.0*x^2.0-a^3.0*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "a^2.0/9.0*x^9.0+a^2.0/6.0*x^6.0+a^2.0/5.0*x^5.0-a^2.0*x^2.0-a^3.0*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a^2.0*8.0*x^7.0+a^2.0*5.0*x^4.0+a^2.0*4.0*x^3.0-a^2.0*2.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a^2.0*8.0*7.0*x^6.0+a^2.0*5.0*4.0*x^3.0+a^2.0*4.0*3.0*x^2.0-a^2.0*2.0*0.0-a^3.0*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a^2.0*56.0*x^6.0+a^2.0*20.0*x^3.0+a^2.0*12.0*x^2.0-a^2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[2] = "a^2.0/9.0*x^9.0+a^2.0/6.0*x^6.0+a^2.0/5.0*x^5.0-a^2.0*x^2.0-a^3.0*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "a^2.0/9.0/10.0*x^10.0+a^2.0/6.0/7.0*x^7.0+a^2.0/5.0/6.0*x^6.0-a^2.0/3.0*x^3.0-a^3.0*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "a^2.0*0.011111111111111112*x^10.0+a^2.0*0.023809523809523808*x^7.0+a^2.0*0.03333333333333333*x^6.0-a^2.0/3.0*x^3.0-a^3.0*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a^2.0*56.0*x^6.0+a^2.0*20.0*x^3.0+a^2.0*12.0*x^2.0-a^2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a^2.0*56.0*6.0*x^5.0+a^2.0*20.0*3.0*x^2.0+a^2.0*12.0*2.0*x^1.0-a^2.0*0.0*0.0-a^3.0*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a^2.0*336.0*x^5.0+a^2.0*60.0*x^2.0+a^2.0*24.0*x-a^2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[3] = "a^2.0*0.011111111111111112*x^10.0+a^2.0*0.023809523809523808*x^7.0+a^2.0*0.03333333333333333*x^6.0-a^2.0/3.0*x^3.0-a^3.0*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "a^2.0*0.011111111111111112/11.0*x^11.0+a^2.0*0.023809523809523808/8.0*x^8.0+a^2.0*0.03333333333333333/7.0*x^7.0-a^2.0/3.0/4.0*x^4.0-a^3.0*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "a^2.0*0.00101010101010101*x^11.0+a^2.0*0.002976190476190476*x^8.0+a^2.0*0.0047619047619047615*x^7.0-a^2.0*0.08333333333333333*x^4.0-a^3.0*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a^2.0*336.0*x^5.0+a^2.0*60.0*x^2.0+a^2.0*24.0*x-a^2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a^2.0*336.0*5.0*x^4.0+a^2.0*60.0*2.0*x^1.0+a^2.0*24.0-a^2.0*0.0*0.0-a^3.0*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a^2.0*1680.0*x^4.0+a^2.0*120.0*x+a^2.0*24.0-a^2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[4] = "a^2.0*0.00101010101010101*x^11.0+a^2.0*0.002976190476190476*x^8.0+a^2.0*0.0047619047619047615*x^7.0-a^2.0*0.08333333333333333*x^4.0-a^3.0*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "a^2.0*0.00101010101010101/12.0*x^12.0+a^2.0*0.002976190476190476/9.0*x^9.0+a^2.0*0.0047619047619047615/8.0*x^8.0-a^2.0*0.08333333333333333/5.0*x^5.0-a^3.0*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "a^2.0*8.417508417508418E-5*x^12.0+a^2.0*3.3068783068783067E-4*x^9.0+a^2.0*5.952380952380952E-4*x^8.0-a^2.0*0.016666666666666666*x^5.0-a^3.0*2.0833333333333335*x^4.0";
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

    // Repeat Cycle of 117 to 120 :Operators: * & /
    public static void TestCaseDiff4021() {
        //Test Case 4021
        UsageCalculus.TestCase = 4021;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values Except 4th Order Integration";
        UsageCalculus.EqnUnderTest = "p*9.0/xyc1^9.0 + p/6.0/xyc1^6.0 + p*5.0*xyc1^5.0 + p/xyc1^2.0 + p/xyc1 + p*50.0";
        UsageCalculus.TestCaseName = "Standard:Independent Constant:Basic Equation:Divide Operator";
        UsageCalculus.TestCaseMatrixID = "Unit TestCase";

        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;

        UsageCalculus.EqnSolArrayMap1[1] = "p*9.0/xyc1^9.0+p/6.0/xyc1^6.0+p*5.0*xyc1^5.0+p/xyc1^2.0+p/xyc1+p*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "p*9.0*-9.0/xyc1^10.0+p/6.0*-6.0/xyc1^7.0+p*5.0*5.0*xyc1^4.0+p*-2.0/xyc1^3.0-p/xyc1^2.0+p*50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-p*81.0/xyc1^10.0-p/xyc1^7.0+p*25.0*xyc1^4.0-p*2.0/xyc1^3.0-p/xyc1^2.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[1] = "p*9.0/xyc1^9.0+p/6.0/xyc1^6.0+p*5.0*xyc1^5.0+p/xyc1^2.0+p/xyc1+p*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "p*9.0/-8.0/xyc1^8.0+p/6.0/-5.0/xyc1^5.0+p*5.0/6.0*xyc1^6.0+p/-1.0/xyc1^1.0+p*ln(xyc1)+p*50.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1] = "-p*1.125/xyc1^8.0-p/30.0/xyc1^5.0+p*0.8333333333333334*xyc1^6.0-p/xyc1+p*ln(xyc1)+p*50.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-p*81.0/xyc1^10.0-p/xyc1^7.0+p*25.0*xyc1^4.0-p*2.0/xyc1^3.0-p/xyc1^2.0+p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-p*81.0*-10.0/xyc1^11.0-p*-7.0/xyc1^8.0+p*25.0*4.0*xyc1^3.0-p*2.0*-3.0/xyc1^4.0-p*-2.0/xyc1^3.0+p*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "p*810.0/xyc1^11.0+p*7.0/xyc1^8.0+p*100.0*xyc1^3.0+p*6.0/xyc1^4.0+p*2.0/xyc1^3.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[2] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "";
        UsageCalculus.EqnSolArrayMap4[2] = "";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "p*810.0/xyc1^11.0+p*7.0/xyc1^8.0+p*100.0*xyc1^3.0+p*6.0/xyc1^4.0+p*2.0/xyc1^3.0+p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "p*810.0*-11.0/xyc1^12.0+p*7.0*-8.0/xyc1^9.0+p*100.0*3.0*xyc1^2.0+p*6.0*-4.0/xyc1^5.0+p*2.0*-3.0/xyc1^4.0+p*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-p*8910.0/xyc1^12.0-p*56.0/xyc1^9.0+p*300.0*xyc1^2.0-p*24.0/xyc1^5.0-p*6.0/xyc1^4.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[3] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "";
        UsageCalculus.EqnSolArrayMap4[3] = "";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-p*8910.0/xyc1^12.0-p*56.0/xyc1^9.0+p*300.0*xyc1^2.0-p*24.0/xyc1^5.0-p*6.0/xyc1^4.0+p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-p*8910.0*-12.0/xyc1^13.0-p*56.0*-9.0/xyc1^10.0+p*300.0*2.0*xyc1^1.0-p*24.0*-5.0/xyc1^6.0-p*6.0*-4.0/xyc1^5.0+p*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "p*106920.0/xyc1^13.0+p*504.0/xyc1^10.0+p*600.0*xyc1+p*120.0/xyc1^6.0+p*24.0/xyc1^5.0+p*0.0";
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
        UsageCalculus.EqnSolOrder[6] = 6;

        UsageCalculus.EqnSolArrayMap1[7] = "";
        UsageCalculus.EqnSolArrayDiffAlone[7] = "";
        UsageCalculus.EqnSolArrayMap2[7] = "";
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

    public static void TestCaseDiff4022() {
        //Test Case 4022
        UsageCalculus.TestCase = 4022;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "a/x^8.0 + a/x^5 + a/x^4 - 2/a/x- 25*(2)";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID = "IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;

        UsageCalculus.EqnSolArrayMap1[1] = "a/x^8.0+a/x^5.0+a/x^4.0-1.0/a*2.0/x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a*-8.0/x^9.0+a*-5.0/x^6.0+a*-4.0/x^5.0+1.0/a*2.0/x^2.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-a*8.0/x^9.0-a*5.0/x^6.0-a*4.0/x^5.0+1.0/a*2.0/x^2.0";
        UsageCalculus.EqnSolArrayMap3[1] = "a/x^8.0+a/x^5.0+a/x^4.0-1.0/a*2.0/x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "a/-7.0/x^7.0+a/-4.0/x^4.0+a/-3.0/x^3.0-1.0/a*2.0*ln(x)-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "-a/7.0/x^7.0-a/4.0/x^4.0-a/3.0/x^3.0-1.0/a*2.0*ln(x)-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-a*8.0/x^9.0-a*5.0/x^6.0-a*4.0/x^5.0+1.0/a*2.0/x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-a*8.0*-9.0/x^10.0-a*5.0*-6.0/x^7.0-a*4.0*-5.0/x^6.0+1.0/a*2.0*-2.0/x^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a*72.0/x^10.0+a*30.0/x^7.0+a*20.0/x^6.0-1.0/a*4.0/x^3.0";
        UsageCalculus.EqnSolArrayMap3[2] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "";
        UsageCalculus.EqnSolArrayMap4[2] = "";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a*72.0/x^10.0+a*30.0/x^7.0+a*20.0/x^6.0-1.0/a*4.0/x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a*72.0*-10.0/x^11.0+a*30.0*-7.0/x^8.0+a*20.0*-6.0/x^7.0-1.0/a*4.0*-3.0/x^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-a*720.0/x^11.0-a*210.0/x^8.0-a*120.0/x^7.0+1.0/a*12.0/x^4.0";
        UsageCalculus.EqnSolArrayMap3[3] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "";
        UsageCalculus.EqnSolArrayMap4[3] = "";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-a*720.0/x^11.0-a*209.99999999999997/x^8.0-a*120.0/x^7.0+1.0/a*12.0/x^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-a*720.0*-11.0/x^12.0-a*209.99999999999997*-8.0/x^9.0-a*120.0*-7.0/x^8.0+1.0/a*12.0*-4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a*7920.0/x^12.0+a*1679.9999999999998/x^9.0+a*840.0/x^8.0-1.0/a*48.0/x^5.0";
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

    public static void TestCaseDiff4023() {
        //Test Case 4023
        UsageCalculus.TestCase = 4023;
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
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-2.0^a*8.0*-9.0/x^10.0-2.0^a*5.0*-6.0/x^7.0-2.0^a*4.0*-5.0/x^6.0+1.0/2.0^a*2.0*-2.0/x^3.0-1.0/3.0^a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "2.0^a*72.0/x^10.0+2.0^a*30.0/x^7.0+2.0^a*20.0/x^6.0-1.0/2.0^a*4.0/x^3.0-1.0/3.0^a*0.0";
        UsageCalculus.EqnSolArrayMap3[2] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "";
        UsageCalculus.EqnSolArrayMap4[2] = "";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "2.0^a*72.0/x^10.0+2.0^a*30.0/x^7.0+2.0^a*20.0/x^6.0-1.0/2.0^a*4.0/x^3.0-1.0/3.0^a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "2.0^a*72.0*-10.0/x^11.0+2.0^a*30.0*-7.0/x^8.0+2.0^a*20.0*-6.0/x^7.0-1.0/2.0^a*4.0*-3.0/x^4.0-1.0/3.0^a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-2.0^a*720.0/x^11.0-2.0^a*210.0/x^8.0-2.0^a*120.0/x^7.0+1.0/2.0^a*12.0/x^4.0-1.0/3.0^a*0.0";
        UsageCalculus.EqnSolArrayMap3[3] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "";
        UsageCalculus.EqnSolArrayMap4[3] = "";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-2.0^a*720.0/x^11.0-2.0^a*210.0/x^8.0-2.0^a*120.0/x^7.0+1.0/2.0^a*12.0/x^4.0-1.0/3.0^a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-2.0^a*720.0*-11.0/x^12.0-2.0^a*210.0*-8.0/x^9.0-2.0^a*120.0*-7.0/x^8.0+1.0/2.0^a*12.0*-4.0/x^5.0-1.0/3.0^a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "2.0^a*7920.0/x^12.0+2.0^a*1680.0/x^9.0+2.0^a*840.0/x^8.0-1.0/2.0^a*48.0/x^5.0-1.0/3.0^a*0.0";
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

    public static void TestCaseDiff4024() {
        //Test Case 4024
        UsageCalculus.TestCase = 4024;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "a^2/x^8 + a^2/x^5 + a^2/x^4 - 2/a^2*x- 25*2/a^3";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID = "IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "a^2.0/x^8.0+a^2.0/x^5.0+a^2.0/x^4.0-1.0/a^2.0*2.0*x-1.0/a^3.0*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a^2.0*-8.0/x^9.0+a^2.0*-5.0/x^6.0+a^2.0*-4.0/x^5.0-1.0/a^2.0*2.0-1.0/a^3.0*50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-a^2.0*8.0/x^9.0-a^2.0*5.0/x^6.0-a^2.0*4.0/x^5.0-1.0/a^2.0*2.0-1.0/a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[1] = "a^2.0/x^8.0+a^2.0/x^5.0+a^2.0/x^4.0-1.0/a^2.0*2.0*x-1.0/a^3.0*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "a^2.0/-7.0/x^7.0+a^2.0/-4.0/x^4.0+a^2.0/-3.0/x^3.0-1.0/a^2.0*2.0/2.0*x^2.0-1.0/a^3.0*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "-a^2.0/7.0/x^7.0-a^2.0/4.0/x^4.0-a^2.0/3.0/x^3.0-1.0/a^2.0*x^2.0-1.0/a^3.0*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-a^2.0*8.0/x^9.0-a^2.0*5.0/x^6.0-a^2.0*4.0/x^5.0-1.0/a^2.0*2.0-1.0/a^3.0*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-a^2.0*8.0*-9.0/x^10.0-a^2.0*5.0*-6.0/x^7.0-a^2.0*4.0*-5.0/x^6.0-1.0/a^2.0*2.0*0.0-1.0/a^3.0*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a^2.0*72.0/x^10.0+a^2.0*30.0/x^7.0+a^2.0*20.0/x^6.0-1.0/a^2.0*0.0-1.0/a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[2] = "-a^2.0/7.0/x^7.0-a^2.0/4.0/x^4.0-a^2.0/3.0/x^3.0-1.0/a^2.0*x^2.0-1.0/a^3.0*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "-a^2.0/7.0/-6.0/x^6.0-a^2.0/4.0/-3.0/x^3.0-a^2.0/3.0/-2.0/x^2.0-1.0/a^2.0/3.0*x^3.0-1.0/a^3.0*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "a^2.0/42.0/x^6.0+a^2.0/12.0/x^3.0+a^2.0/6.0/x^2.0-1.0/a^2.0/3.0*x^3.0-1.0/a^3.0*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a^2.0*72.0/x^10.0+a^2.0*30.0/x^7.0+a^2.0*20.0/x^6.0-1.0/a^2.0*0.0-1.0/a^3.0*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a^2.0*72.0*-10.0/x^11.0+a^2.0*30.0*-7.0/x^8.0+a^2.0*20.0*-6.0/x^7.0-1.0/a^2.0*0.0*0.0-1.0/a^3.0*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-a^2.0*720.0/x^11.0-a^2.0*210.0/x^8.0-a^2.0*120.0/x^7.0-1.0/a^2.0*0.0-1.0/a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[3] = "a^2.0/42.0/x^6.0+a^2.0/12.0/x^3.0+a^2.0/6.0/x^2.0-1.0/a^2.0/3.0*x^3.0-1.0/a^3.0*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "a^2.0/42.0/-5.0/x^5.0+a^2.0/12.0/-2.0/x^2.0+a^2.0/6.0/-1.0/x^1.0-1.0/a^2.0/3.0/4.0*x^4.0-1.0/a^3.0*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "-a^2.0/210.0/x^5.0-a^2.0/24.0/x^2.0-a^2.0/6.0/x-1.0/a^2.0/12.0*x^4.0-1.0/a^3.0*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-a^2.0*720.0/x^11.0-a^2.0*209.99999999999997/x^8.0-a^2.0*120.0/x^7.0-1.0/a^2.0*0.0-1.0/a^3.0*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-a^2.0*720.0*-11.0/x^12.0-a^2.0*209.99999999999997*-8.0/x^9.0-a^2.0*120.0*-7.0/x^8.0-1.0/a^2.0*0.0*0.0-1.0/a^3.0*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a^2.0*7920.0/x^12.0+a^2.0*1679.9999999999998/x^9.0+a^2.0*840.0/x^8.0-1.0/a^2.0*0.0-1.0/a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[4] = "-a^2.0/209.99999999999997/x^5.0-a^2.0/24.0/x^2.0-a^2.0/6.0/x-1.0/a^2.0/12.0*x^4.0-1.0/a^3.0*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "-a^2.0/209.99999999999997/-4.0/x^4.0-a^2.0/24.0/-1.0/x^1.0-a^2.0*6.0*ln(x)-1.0/a^2.0/12.0/5.0*x^5.0-1.0/a^3.0*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "a^2.0/839.9999999999999/x^4.0+a^2.0/24.0/x-a^2.0*6.0*ln(x)-1.0/a^2.0/60.0*x^5.0-1.0/a^3.0*2.0833333333333335*x^4.0";
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

    public static void TestCaseDiff4025() {
        //Test Case 4025
        UsageCalculus.TestCase = 4025;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "a^2/x^8 + a^2/x^5 + a^2/x^4 - 2*a^2*x- 25*2/a^3";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID = "IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "a^2.0/x^8.0+a^2.0/x^5.0+a^2.0/x^4.0-a^2.0*2.0*x-1.0/a^3.0*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a^2.0*-8.0/x^9.0+a^2.0*-5.0/x^6.0+a^2.0*-4.0/x^5.0-a^2.0*2.0-1.0/a^3.0*50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-a^2.0*8.0/x^9.0-a^2.0*5.0/x^6.0-a^2.0*4.0/x^5.0-a^2.0*2.0-1.0/a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[1] = "a^2.0/x^8.0+a^2.0/x^5.0+a^2.0/x^4.0-a^2.0*2.0*x-1.0/a^3.0*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "a^2.0/-7.0/x^7.0+a^2.0/-4.0/x^4.0+a^2.0/-3.0/x^3.0-a^2.0*x^2.0-1.0/a^3.0*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "-a^2.0/7.0/x^7.0-a^2.0/4.0/x^4.0-a^2.0/3.0/x^3.0-a^2.0*x^2.0-1.0/a^3.0*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-a^2.0*8.0/x^9.0-a^2.0*5.0/x^6.0-a^2.0*4.0/x^5.0-a^2.0*2.0-1.0/a^3.0*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-a^2.0*8.0*-9.0/x^10.0-a^2.0*5.0*-6.0/x^7.0-a^2.0*4.0*-5.0/x^6.0-a^2.0*2.0*0.0-1.0/a^3.0*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a^2.0*72.0/x^10.0+a^2.0*30.0/x^7.0+a^2.0*20.0/x^6.0-a^2.0*0.0-1.0/a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[2] = "-a^2.0/7.0/x^7.0-a^2.0/4.0/x^4.0-a^2.0/3.0/x^3.0-a^2.0*x^2.0-1.0/a^3.0*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "-a^2.0/7.0/-6.0/x^6.0-a^2.0/4.0/-3.0/x^3.0-a^2.0/3.0/-2.0/x^2.0-a^2.0/3.0*x^3.0-1.0/a^3.0*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "a^2.0/42.0/x^6.0+a^2.0/12.0/x^3.0+a^2.0/6.0/x^2.0-a^2.0/3.0*x^3.0-1.0/a^3.0*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a^2.0*72.0/x^10.0+a^2.0*30.0/x^7.0+a^2.0*20.0/x^6.0-a^2.0*0.0-1.0/a^3.0*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a^2.0*72.0*-10.0/x^11.0+a^2.0*30.0*-7.0/x^8.0+a^2.0*20.0*-6.0/x^7.0-a^2.0*0.0*0.0-1.0/a^3.0*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-a^2.0*720.0/x^11.0-a^2.0*210.0/x^8.0-a^2.0*120.0/x^7.0-a^2.0*0.0-1.0/a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[3] = "a^2.0/42.0/x^6.0+a^2.0/12.0/x^3.0+a^2.0/6.0/x^2.0-a^2.0/3.0*x^3.0-1.0/a^3.0*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "a^2.0/42.0/-5.0/x^5.0+a^2.0/12.0/-2.0/x^2.0+a^2.0/6.0/-1.0/x^1.0-a^2.0/3.0/4.0*x^4.0-1.0/a^3.0*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "-a^2.0/210.0/x^5.0-a^2.0/24.0/x^2.0-a^2.0/6.0/x-a^2.0/12.0*x^4.0-1.0/a^3.0*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-a^2.0*720.0/x^11.0-a^2.0*209.99999999999997/x^8.0-a^2.0*120.0/x^7.0-a^2.0*0.0-1.0/a^3.0*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-a^2.0*720.0*-11.0/x^12.0-a^2.0*209.99999999999997*-8.0/x^9.0-a^2.0*120.0*-7.0/x^8.0-a^2.0*0.0*0.0-1.0/a^3.0*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a^2.0*7920.0/x^12.0+a^2.0*1679.9999999999998/x^9.0+a^2.0*840.0/x^8.0-a^2.0*0.0-1.0/a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[4] = "-a^2.0/209.99999999999997/x^5.0-a^2.0/24.0/x^2.0-a^2.0/6.0/x-a^2.0/12.0*x^4.0-1.0/a^3.0*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "-a^2.0/209.99999999999997/-4.0/x^4.0-a^2.0/24.0/-1.0/x^1.0-a^2.0*6.0*ln(x)-a^2.0/12.0/5.0*x^5.0-1.0/a^3.0*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "a^2.0/839.9999999999999/x^4.0+a^2.0/24.0/x-a^2.0*6.0*ln(x)-a^2.0/60.0*x^5.0-1.0/a^3.0*2.0833333333333335*x^4.0";
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

    public static void TestCaseDiff4026() {
        //Test Case 4026
        UsageCalculus.TestCase = 4026;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "0.0*x^8 + 0.0*x^5 + 0.0*x^4 - 0.0*x- 25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:0.0";
        UsageCalculus.TestCaseMatrixID = "Coefficients:0.0:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "0.0*x^8.0+0.0*x^5.0+0.0*x^4.0-0.0*x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+0.0+0.0-0.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "";
        UsageCalculus.EqnSolArrayMap3[1] = "0.0*x^8.0+0.0*x^5.0+0.0*x^4.0-0.0*x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "0.0/9.0*x^9.0+0.0/6.0*x^6.0+0.0/5.0*x^5.0-0.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "0.0*x^9.0+0.0*x^6.0+0.0*x^5.0-0.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2] = "0.0*x^9.0+0.0*x^6.0+0.0*x^5.0-0.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "0.0/10.0*x^10.0+0.0/7.0*x^7.0+0.0/6.0*x^6.0-0.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "0.0*x^10.0+0.0*x^7.0+0.0*x^6.0-0.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3] = "0.0*x^10.0+0.0*x^7.0+0.0*x^6.0-0.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "0.0/11.0*x^11.0+0.0/8.0*x^8.0+0.0/7.0*x^7.0-0.0/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "0.0*x^11.0+0.0*x^8.0+0.0*x^7.0-0.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4] = "0.0*x^11.0+0.0*x^8.0+0.0*x^7.0-0.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "0.0/12.0*x^12.0+0.0/9.0*x^9.0+0.0/8.0*x^8.0-0.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "0.0*x^12.0+0.0*x^9.0+0.0*x^8.0-0.0*x^5.0-1.0416666666666667*x^4.0";
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

    public static void TestCaseDiff4027() {
        //Test Case 4027
        UsageCalculus.TestCase = 4027;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "0.0/x^8 + 0.0/x^5 + 0.0/x^4 - 0.0/x- 25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:0.0";
        UsageCalculus.TestCaseMatrixID = "Coefficients:0.0:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;

        UsageCalculus.EqnSolArrayMap1[1] = "0.0/x^8.0+0.0/x^5.0+0.0/x^4.0-0.0/x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0*-8.0/x^9.0+0.0*-5.0/x^6.0+0.0*-4.0/x^5.0+0.0/x^2.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-0.0/x^9.0-0.0/x^6.0-0.0/x^5.0+0.0/x^2.0";
        UsageCalculus.EqnSolArrayMap3[1] = "0.0/x^8.0+0.0/x^5.0+0.0/x^4.0-0.0/x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "0.0/-7.0/x^7.0+0.0/-4.0/x^4.0+0.0/-3.0/x^3.0-0.0*ln(x)-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "-0.0/x^7.0-0.0/x^4.0-0.0/x^3.0-0.0*ln(x)-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-0.0/x^9.0-0.0/x^6.0-0.0/x^5.0+0.0/x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-0.0*-9.0/x^10.0-0.0*-6.0/x^7.0-0.0*-5.0/x^6.0+0.0*-2.0/x^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "0.0/x^10.0+0.0/x^7.0+0.0/x^6.0-0.0/x^3.0";
        UsageCalculus.EqnSolArrayMap3[2] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "";
        UsageCalculus.EqnSolArrayMap4[2] = "";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "0.0/x^10.0+0.0/x^7.0+0.0/x^6.0-0.0/x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "0.0*-10.0/x^11.0+0.0*-7.0/x^8.0+0.0*-6.0/x^7.0-0.0*-3.0/x^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-0.0/x^11.0-0.0/x^8.0-0.0/x^7.0+0.0/x^4.0";
        UsageCalculus.EqnSolArrayMap3[3] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "";
        UsageCalculus.EqnSolArrayMap4[3] = "";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-0.0/x^11.0-0.0/x^8.0-0.0/x^7.0+0.0/x^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*-11.0/x^12.0-0.0*-8.0/x^9.0-0.0*-7.0/x^8.0+0.0*-4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "0.0/x^12.0+0.0/x^9.0+0.0/x^8.0-0.0/x^5.0";
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

    public static void TestCaseDiff4028() {
        //Test Case 4028
        UsageCalculus.TestCase = 4028;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*x^8 + 1.0*x^5 + 1.0*x^4 - 1.0*x- 25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:0.0";
        UsageCalculus.TestCaseMatrixID = "Coefficients:0.0:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-";

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

    public static void TestCaseDiff4029() {
        //Test Case 4029
        UsageCalculus.TestCase = 4029;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0/x^8 + 1.0/x^5 + 1.0/x^4 - 1.0/x- 25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:0.0";
        UsageCalculus.TestCaseMatrixID = "Coefficients:0.0:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-";

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

    public static void TestCaseDiff4030() {
        //Test Case 4030
        UsageCalculus.TestCase = 4030;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*+2*xyc1^8*xyc1^2 + 1.0*+2*xyc1^5*xyc1^2 + 1.0*+2*xyc1^4*xyc1^2 + 1.0*+2*xyc1*xyc1^2 + 1.0*+2*25*5";
        UsageCalculus.TestCaseName = "Simple: Coefficients:5^xyc1:";
        UsageCalculus.TestCaseMatrixID = "Coefficients:5^xyc1:3 Letter with Numerics:* Operator:No Exponent Sign:Constant End:Term Sign +&-";

        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;

        UsageCalculus.EqnSolArrayMap1[1] = "2.0*xyc1^10.0+2.0*xyc1^7.0+2.0*xyc1^6.0+2.0*xyc1^3.0+250.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "2.0*10.0*xyc1^9.0+2.0*7.0*xyc1^6.0+2.0*6.0*xyc1^5.0+2.0*3.0*xyc1^2.0+250.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "20.0*xyc1^9.0+14.0*xyc1^6.0+12.0*xyc1^5.0+6.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[1] = "2.0*xyc1^10.0+2.0*xyc1^7.0+2.0*xyc1^6.0+2.0*xyc1^3.0+250.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "2.0/11.0*xyc1^11.0+2.0/8.0*xyc1^8.0+2.0/7.0*xyc1^7.0+2.0/4.0*xyc1^4.0+250.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1] = "1.0/5.5*xyc1^11.0+1.0/4.0*xyc1^8.0+1.0/3.5*xyc1^7.0+1.0/2.0*xyc1^4.0+250.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "20.0*xyc1^9.0+14.0*xyc1^6.0+12.0*xyc1^5.0+6.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "20.0*9.0*xyc1^8.0+14.0*6.0*xyc1^5.0+12.0*5.0*xyc1^4.0+6.0*2.0*xyc1^1.0";
        UsageCalculus.EqnSolArrayMap2[2] = "180.0*xyc1^8.0+84.0*xyc1^5.0+60.0*xyc1^4.0+12.0*xyc1";
        UsageCalculus.EqnSolArrayMap3[2] = "1.0/5.5*xyc1^11.0+1.0/4.0*xyc1^8.0+1.0/3.5*xyc1^7.0+1.0/2.0*xyc1^4.0+250.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/5.5/12.0*xyc1^12.0+1.0/4.0/9.0*xyc1^9.0+1.0/3.5/8.0*xyc1^8.0+1.0/2.0/5.0*xyc1^5.0+250.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2] = "1.0/66.0*xyc1^12.0+1.0/36.0*xyc1^9.0+1.0/28.0*xyc1^8.0+1.0/10.0*xyc1^5.0+125.0*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "180.0*xyc1^8.0+84.0*xyc1^5.0+60.0*xyc1^4.0+12.0*xyc1";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "180.0*8.0*xyc1^7.0+84.0*5.0*xyc1^4.0+60.0*4.0*xyc1^3.0+12.0";
        UsageCalculus.EqnSolArrayMap2[3] = "1440.0*xyc1^7.0+420.0*xyc1^4.0+240.0*xyc1^3.0+12.0";
        UsageCalculus.EqnSolArrayMap3[3] = "1.0/66.0*xyc1^12.0+1.0/36.0*xyc1^9.0+1.0/28.0*xyc1^8.0+1.0/10.0*xyc1^5.0+125.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/66.0/13.0*xyc1^13.0+1.0/36.0/10.0*xyc1^10.0+1.0/28.0/9.0*xyc1^9.0+1.0/10.0/6.0*xyc1^6.0+125.0/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3] = "1.0/858.0*xyc1^13.0+1.0/360.0*xyc1^10.0+1.0/252.0*xyc1^9.0+1.0/60.0*xyc1^6.0+41.666666666666664*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "1440.0*xyc1^7.0+420.0*xyc1^4.0+240.0*xyc1^3.0+12.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "1440.0*7.0*xyc1^6.0+420.0*4.0*xyc1^3.0+240.0*3.0*xyc1^2.0+12.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "10080.0*xyc1^6.0+1680.0*xyc1^3.0+720.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[4] = "1.0/858.0*xyc1^13.0+1.0/360.0*xyc1^10.0+1.0/252.0*xyc1^9.0+1.0/60.0*xyc1^6.0+41.666666666666664*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/858.0/14.0*xyc1^14.0+1.0/360.0/11.0*xyc1^11.0+1.0/252.0/10.0*xyc1^10.0+1.0/60.0/7.0*xyc1^7.0+41.666666666666664/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4] = "1.0/12012.0*xyc1^14.0+1.0/3960.0*xyc1^11.0+1.0/2520.0*xyc1^10.0+1.0/420.0*xyc1^7.0+10.416666666666666*xyc1^4.0";
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

    public static void TestCaseDiff4031() {
        //Test Case 4031
        UsageCalculus.TestCase = 4031;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*-0/xy^8 + 1.0*-0/xy^5 + 1.0*-0/xy^4 - 1.0*-0/xy - 25*-0";
        UsageCalculus.TestCaseName = "Simple: Coefficients:0";
        UsageCalculus.TestCaseMatrixID = "Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";

        UsageCalculus.DiffWithRespTo = "xy";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;

        UsageCalculus.EqnSolArrayMap1[1] = "-0.0/xy^8.0-0.0/xy^5.0-0.0/xy^4.0+0.0/xy";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0*-8.0/xy^9.0-0.0*-5.0/xy^6.0-0.0*-4.0/xy^5.0-0.0/xy^2.0";
        UsageCalculus.EqnSolArrayMap2[1] = "0.0/xy^9.0+0.0/xy^6.0+0.0/xy^5.0-0.0/xy^2.0";
        UsageCalculus.EqnSolArrayMap3[1] = "-0.0/xy^8.0-0.0/xy^5.0-0.0/xy^4.0+0.0/xy";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "-0.0/-7.0/xy^7.0-0.0/-4.0/xy^4.0-0.0/-3.0/xy^3.0+0.0*ln(xy)";
        UsageCalculus.EqnSolArrayMap4[1] = "0.0/xy^7.0+0.0/xy^4.0+0.0/xy^3.0+0.0*ln(xy)";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "0.0/xy^9.0+0.0/xy^6.0+0.0/xy^5.0-0.0/xy^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "0.0*-9.0/xy^10.0+0.0*-6.0/xy^7.0+0.0*-5.0/xy^6.0-0.0*-2.0/xy^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-0.0/xy^10.0-0.0/xy^7.0-0.0/xy^6.0+0.0/xy^3.0";
        UsageCalculus.EqnSolArrayMap3[2] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "";
        UsageCalculus.EqnSolArrayMap4[2] = "";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-0.0/xy^10.0-0.0/xy^7.0-0.0/xy^6.0+0.0/xy^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-0.0*-10.0/xy^11.0-0.0*-7.0/xy^8.0-0.0*-6.0/xy^7.0+0.0*-3.0/xy^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "0.0/xy^11.0+0.0/xy^8.0+0.0/xy^7.0-0.0/xy^4.0";
        UsageCalculus.EqnSolArrayMap3[3] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "";
        UsageCalculus.EqnSolArrayMap4[3] = "";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "0.0/xy^11.0+0.0/xy^8.0+0.0/xy^7.0-0.0/xy^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "0.0*-11.0/xy^12.0+0.0*-8.0/xy^9.0+0.0*-7.0/xy^8.0-0.0*-4.0/xy^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-0.0/xy^12.0-0.0/xy^9.0-0.0/xy^8.0+0.0/xy^5.0";
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

    public static void TestCaseDiff4032() {
        //Test Case 4032
        UsageCalculus.TestCase = 4032;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*+1/xyc^8 + 1.0*+1/xyc^5 + 1*+1/xyc^4 - 1*+1/xyc - 1*+1/25";
        UsageCalculus.TestCaseName = "Simple: Variables:3 Letter :Coefficients:+1:MAP";
        UsageCalculus.TestCaseMatrixID = "Coefficients:+1:3 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";

        UsageCalculus.DiffWithRespTo = "xyc";
        UsageCalculus.MaxDiffOrder = 5;
        UsageCalculus.MaxIntegreOrder = 2;

        UsageCalculus.EqnSolArrayMap1[1] = "1.0/xyc^8.0+1.0/xyc^5.0+1.0/xyc^4.0-1.0/xyc-1.0/25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-8.0/xyc^9.0-5.0/xyc^6.0-4.0/xyc^5.0+1.0/xyc^2.0-1.0/25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-8.0/xyc^9.0-5.0/xyc^6.0-4.0/xyc^5.0+1.0/xyc^2.0";
        UsageCalculus.EqnSolArrayMap3[1] = "1.0/xyc^8.0+1.0/xyc^5.0+1.0/xyc^4.0-1.0/xyc-1.0/25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0/-7.0/xyc^7.0+1.0/-4.0/xyc^4.0+1.0/-3.0/xyc^3.0-ln(xyc)-1.0/25.0*xyc";
        UsageCalculus.EqnSolArrayMap4[1] = "-1.0/7.0/xyc^7.0-1.0/4.0/xyc^4.0-1.0/3.0/xyc^3.0-ln(xyc)-1.0/25.0*xyc";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-8.0/xyc^9.0-5.0/xyc^6.0-4.0/xyc^5.0+1.0/xyc^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-8.0*-9.0/xyc^10.0-5.0*-6.0/xyc^7.0-4.0*-5.0/xyc^6.0-2.0/xyc^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "72.0/xyc^10.0+30.0/xyc^7.0+20.0/xyc^6.0-2.0/xyc^3.0";
        UsageCalculus.EqnSolArrayMap3[2] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "";
        UsageCalculus.EqnSolArrayMap4[2] = "";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "72.0/xyc^10.0+30.0/xyc^7.0+20.0/xyc^6.0-2.0/xyc^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "72.0*-10.0/xyc^11.0+30.0*-7.0/xyc^8.0+20.0*-6.0/xyc^7.0-2.0*-3.0/xyc^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-720.0/xyc^11.0-210.0/xyc^8.0-120.0/xyc^7.0+6.0/xyc^4.0";
        UsageCalculus.EqnSolArrayMap3[3] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "";
        UsageCalculus.EqnSolArrayMap4[3] = "";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-720.0/xyc^11.0-210.0/xyc^8.0-120.0/xyc^7.0+6.0/xyc^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-720.0*-11.0/xyc^12.0-210.0*-8.0/xyc^9.0-120.0*-7.0/xyc^8.0+6.0*-4.0/xyc^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "7920.0/xyc^12.0+1680.0/xyc^9.0+840.0/xyc^8.0-24.0/xyc^5.0";
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
public static void TestCaseDiff4033() {
        //Test Case 4033
        UsageCalculus.TestCase = 4033;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*+2*xyc1^8*5^xyc1 + 1.0*+2*xyc1^5*5^xyc1 + 1.0*+2*xyc1^4*5^xyc1 + 1.0*+2*xyc1*5^xyc1 + 1.0*+2*25*5";
        UsageCalculus.TestCaseName = "Simple: Coefficients:5^xyc1:";
        UsageCalculus.TestCaseMatrixID = "Coefficients:5^xyc1:3 Letter with Numerics:* Operator:No Exponent Sign:Constant End:Term Sign +&-";

        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 4;
        UsageCalculus.MaxIntegreOrder = 2;

        UsageCalculus.EqnSolArrayMap1[1] = "2.0*xyc1^8.0*5.0^xyc1+2.0*xyc1^5.0*5.0^xyc1+2.0*xyc1^4.0*5.0^xyc1+2.0*xyc1*5.0^xyc1+250.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "5.0^xyc1*2.0*8.0*xyc1^7.0+ln(5.0)*5.0^xyc1*2.0*xyc1^8.0+5.0^xyc1*2.0*5.0*xyc1^4.0+ln(5.0)*5.0^xyc1*2.0*xyc1^5.0+5.0^xyc1*2.0*4.0*xyc1^3.0+ln(5.0)*5.0^xyc1*2.0*xyc1^4.0+5.0^xyc1*2.0+ln(5.0)*5.0^xyc1*2.0*xyc1+250.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "16.0*xyc1^7.0*5.0^xyc1+ln(5.0)*2.0*5.0^xyc1*xyc1^8.0+10.0*xyc1^4.0*5.0^xyc1+ln(5.0)*2.0*5.0^xyc1*xyc1^5.0+8.0*xyc1^3.0*5.0^xyc1+ln(5.0)*2.0*5.0^xyc1*xyc1^4.0+2.0*5.0^xyc1+ln(5.0)*2.0*5.0^xyc1*xyc1";
        UsageCalculus.EqnSolArrayMap3[1] = "2.0*xyc1^8.0*5.0^xyc1+2.0*xyc1^5.0*5.0^xyc1+2.0*xyc1^4.0*5.0^xyc1+2.0*xyc1*5.0^xyc1+250.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "2.0/9.0*xyc1^9.0/ln(5.0)*5.0^xyc1+2.0/6.0*xyc1^6.0/ln(5.0)*5.0^xyc1+2.0/5.0*xyc1^5.0/ln(5.0)*5.0^xyc1+10.0/2.0*xyc1^2.0/ln(5.0)*5.0^xyc1+250.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1] = "0.2222222222222222/ln(5.0)*5.0^xyc1*xyc1^9.0+0.3333333333333333/ln(5.0)*5.0^xyc1*xyc1^6.0+0.4/ln(5.0)*5.0^xyc1*xyc1^5.0+5.0/ln(5.0)*5.0^xyc1*xyc1^2.0+250.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "16.0*xyc1^7.0*5.0^xyc1+ln(5.0)*2.0*5.0^xyc1*xyc1^8.0+10.0*xyc1^4.0*5.0^xyc1+ln(5.0)*2.0*5.0^xyc1*xyc1^5.0+8.0*xyc1^3.0*5.0^xyc1+ln(5.0)*2.0*5.0^xyc1*xyc1^4.0+2.0*5.0^xyc1+ln(5.0)*2.0*5.0^xyc1*xyc1";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "5.0^xyc1*16.0*7.0*xyc1^6.0+ln(5.0)*5.0^xyc1*16.0*xyc1^7.0+xyc1^8.0*+8.0*xyc1^7.0*+5.0^xyc1*10.0*4.0*xyc1^3.0+ln(5.0)*5.0^xyc1*10.0*xyc1^4.0+xyc1^5.0*+5.0*xyc1^4.0*+5.0^xyc1*8.0*3.0*xyc1^2.0+ln(5.0)*5.0^xyc1*8.0*xyc1^3.0+xyc1^4.0*+4.0*xyc1^3.0*+2.0*ln(5.0)*5.0^xyc1+ln(5.0)*2.0*5.0^xyc1";
        UsageCalculus.EqnSolArrayMap2[2] = "112.0*xyc1^6.0*5.0^xyc1+ln(5.0)*16.0*5.0^xyc1*xyc1^7.0+320.0*xyc1^18.0*5.0^xyc1+ln(5.0)*10.0*5.0^xyc1*xyc1^4.0+120.0*xyc1^11.0*5.0^xyc1+ln(5.0)*8.0*5.0^xyc1*xyc1^3.0+8.0*xyc1^7.0*ln(5.0)*5.0^xyc1+ln(5.0)*2.0*5.0^xyc1";
        UsageCalculus.EqnSolArrayMap3[2] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "";
        UsageCalculus.EqnSolArrayMap4[2] = "";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "112.0*xyc1^6.0*5.0^xyc1+ln(5.0)*16.0*5.0^xyc1*xyc1^7.0+320.0*xyc1^18.0*5.0^xyc1+ln(5.0)*10.0*5.0^xyc1*xyc1^4.0+120.0*xyc1^11.0*5.0^xyc1+ln(5.0)*8.0*5.0^xyc1*xyc1^3.0+8.0*xyc1^7.0*ln(5.0)*5.0^xyc1+ln(5.0)*2.0*5.0^xyc1";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "5.0^xyc1*112.0*6.0*xyc1^5.0+ln(5.0)*5.0^xyc1*112.0*xyc1^6.0+xyc1^7.0*+7.0*xyc1^6.0*+5.0^xyc1*320.0*18.0*xyc1^17.0+ln(5.0)*5.0^xyc1*320.0*xyc1^18.0+xyc1^4.0*+4.0*xyc1^3.0*+5.0^xyc1*120.0*11.0*xyc1^10.0+ln(5.0)*5.0^xyc1*120.0*xyc1^11.0+xyc1^3.0*+3.0*xyc1^2.0*+5.0^xyc1*+ln(5.0)*5.0^xyc1*+2.0*+ln(5.0)*5.0^xyc1";
        UsageCalculus.EqnSolArrayMap2[3] = "672.0*xyc1^5.0*5.0^xyc1+ln(5.0)*112.0*5.0^xyc1*xyc1^6.0+40320.0*xyc1^30.0*5.0^xyc1+ln(5.0)*320.0*5.0^xyc1*xyc1^18.0+5280.0*xyc1^17.0*5.0^xyc1+ln(5.0)*120.0*5.0^xyc1*xyc1^11.0+3.0*xyc1^5.0*ln(5.0)*5.0^xyc1*5.0^xyc1*+ln";
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
}
