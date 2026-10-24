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
import Calculus.UsageCalculus;
import static Calculus.MathematicalTestHarness.IgnoreKnownIssuesFlag;
import static Calculus.MathematicalTestHarness.RunAllTestCasesFlag;
import static Calculus.UsageCalculus.KnownIssueTestCasesFlag;
import static Calculus.UsageCalculus.KnownIssues;
import static Calculus.UsageCalculus.KnownIssuesTestCases;

/**
 *
 * @author Rajesh V Pai
 */
public class TestHarnessUnitTest {
    //UnitTestCases Test Cases
    public static void UnitTestCases(String AlgoName,long j){
        if(((!RunAllTestCasesFlag)&&(IgnoreKnownIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainIntegrTest"))&&(IntegralGapInfinity(j)))
                ||((!RunAllTestCasesFlag)&&(IgnoreKnownIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainDiffTest"))&&(DifferentialGapInfinity(j))) )
        {
            KnownIssueTestCasesFlag=true;
            KnownIssues++;
            KnownIssuesTestCases.put(KnownIssues, "" + j);
            System.out.println(ConsoleColors.RED +"UnitTest TestCase:j= " + j  + ": Infinite Loop GAP" + ConsoleColors.RESET);
        }
        else if(((!RunAllTestCasesFlag)&&(IgnoreKnownIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainIntegrTest"))&&(IntegralGapException(j)))
                ||((!RunAllTestCasesFlag)&&(IgnoreKnownIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainDiffTest"))&&(DifferentialGapException(j))) )
        {
            KnownIssueTestCasesFlag=true;
            KnownIssues++;
            KnownIssuesTestCases.put(KnownIssues, "" + j);
            System.out.println(ConsoleColors.RED +"UnitTest TestCase:j= " + j  + ": Exception GAP" + ConsoleColors.RESET);
        }
        else {switch ((int)j) {
            //Unstructured Testing
             case 5000:
                TestCaseDiff5000();
                break;
             case 5001:
                TestCaseDiff5001();
                break;
             case 5002:
                TestCaseDiff5002();
                break;
            case 5003:
                TestCaseDiff5003();
                break;
            case 5004:
                TestCaseDiff5004();
                break;
            case 5005:
                TestCaseDiff5005();
                break;
            case 5006:
                TestCaseDiff5006();
                break;
            case 5007:
                TestCaseDiff5007();
                break;
            //Palindromic String-Equation Test
            case 5008:
                TestCaseDiff5008();
                break;
            case 5009:
                TestCaseDiff5009();
                break;
            case 5010:
                TestCaseDiff5010();
                break;
            case 5011:
                TestCaseDiff5011();
                break;
            //Palindromic String-Equation Test-Rearranged
            case 5012:
                TestCaseDiff5012();
                break;
            case 5013:
                TestCaseDiff5013();
                break;
            //Test for LookAheadFuncMultDiv
            //Straight Numbers Leading + Trailing Co-eff :(LookAheadFuncMultDiv & ConstExprn)
            case 5014:
                TestCaseDiff5014();
                break;
            case 5015:
                TestCaseDiff5015();
                break;
            case 5016:
                TestCaseDiff5016();
                //System.out.println(ConsoleColors.BLUE + "Bypassing Test Case 35 :Infinite Loop UsageCalculus.EqnUnderTest=" + UsageCalculus.EqnUnderTest + ConsoleColors.RESET);
                break;
            case 5017:
                TestCaseDiff5017();
                break;
            case 5018:
                TestCaseDiff5018();
                break;
            case 5019:
                TestCaseDiff5019();
                break;
            case 5020:
                TestCaseDiff5020();
                break;
            case 5021:
                TestCaseDiff5021();
                break;
            case 5022:
                TestCaseDiff5022();
                break;
            case 5023:
                TestCaseDiff5023();
                break;
            case 5024:
                TestCaseDiff5024();
                break;
            case 5025:
                TestCaseDiff5025();
                break;
            case 5026:
                TestCaseDiff5026();
                //System.out.println(ConsoleColors.BLUE + "Bypassing Test Case 35 :Infinite Loop UsageCalculus.EqnUnderTest=" + UsageCalculus.EqnUnderTest + ConsoleColors.RESET);
                break;
            case 5027:
                TestCaseDiff5027();
                break;
            case 5028:
                TestCaseDiff5028();
                break;
            case 5029:
                TestCaseDiff5029();
                break;
            case 5030:
                TestCaseDiff5030();
                break;
            case 5031:
                TestCaseDiff5031();
                break;
            case 5032:
                TestCaseDiff5032();
                break;
            case 5033:
                TestCaseDiff5033();
                break;
            default:
                System.out.println(ConsoleColors.RED +"Unit TestCase:j= " + j  + ": Gap" + ConsoleColors.RESET);
                break;
        }
        }
    }
    /* **************************************** */
    //Structured Testing
    /* **************************************** */
    public static void TestCaseDiff5000() {
        //Only Trailing Constant
        //Test Case 5000
        UsageCalculus.TestCase = 5000;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values Trailing Constant Dropped";
        UsageCalculus.EqnRegressionIntegreStatus = "All RED Including Values Trailing Constant Dropped";
        UsageCalculus.EqnUnderTest = "x^7.0/8.0-x^7.0/8.0+x^4.0/5.0-x^4.0/5.0+x^3.0-x^3.0/4.0";
        UsageCalculus.TestCaseName = "Standard:Basic Equation:With  Trailing Coefficients alone";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/8.0*x^7.0-1.0/8.0*x^7.0+1.0/5.0*x^4.0-1.0/5.0*x^4.0+x^3.0-1.0/4.0*x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/8.0*7.0*x^6.0-1.0/8.0*7.0*x^6.0+1.0/5.0*4.0*x^3.0-1.0/5.0*4.0*x^3.0+3.0*x^2.0-1.0/4.0*3.0*x^2.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0/1.1428571428571428*x^6.0-1.0/1.1428571428571428*x^6.0+1.0/1.25*x^3.0-1.0/1.25*x^3.0+3.0*x^2.0-1.0/1.3333333333333333*x^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/8.0*x^7.0-1.0/8.0*x^7.0+1.0/5.0*x^4.0-1.0/5.0*x^4.0+x^3.0-1.0/4.0*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/8.0/8.0*x^8.0-1.0/8.0/8.0*x^8.0+1.0/5.0/5.0*x^5.0-1.0/5.0/5.0*x^5.0+1.0/4.0*x^4.0-1.0/4.0/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/64.0*x^8.0-1.0/64.0*x^8.0+1.0/25.0*x^5.0-1.0/25.0*x^5.0+1.0/4.0*x^4.0-1.0/16.0*x^4.0";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0/1.1428571428571428*x^6.0-1.0/1.1428571428571428*x^6.0+1.0/1.25*x^3.0-1.0/1.25*x^3.0+3.0*x^2.0-1.0/1.3333333333333333*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "1.0/1.1428571428571428*6.0*x^5.0-1.0/1.1428571428571428*6.0*x^5.0+1.0/1.25*3.0*x^2.0-1.0/1.25*3.0*x^2.0+3.0*2.0*x^1.0-1.0/1.3333333333333333*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[2] = "5.25*x^5.0-5.25*x^5.0+2.4*x^2.0-2.4*x^2.0+6.0*x-1.5*x";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/64.0*x^8.0-1.0/64.0*x^8.0+1.0/25.0*x^5.0-1.0/25.0*x^5.0+1.0/4.0*x^4.0-1.0/16.0*x^4.0";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/64.0/9.0*x^9.0-1.0/64.0/9.0*x^9.0+1.0/25.0/6.0*x^6.0-1.0/25.0/6.0*x^6.0+1.0/4.0/5.0*x^5.0-1.0/16.0/5.0*x^5.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/576.0*x^9.0-1.0/576.0*x^9.0+1.0/150.0*x^6.0-1.0/150.0*x^6.0+1.0/20.0*x^5.0-1.0/80.0*x^5.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "5.25*x^5.0-5.25*x^5.0+2.4*x^2.0-2.4*x^2.0+6.0*x-1.5*x";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "5.25*5.0*x^4.0-5.25*5.0*x^4.0+2.4*2.0*x^1.0-2.4*2.0*x^1.0+6.0-1.5";
        UsageCalculus.EqnSolArrayMap2[3] = "26.25*x^4.0-26.25*x^4.0+4.8*x-4.8*x+6.0-1.5";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/576.0*x^9.0-1.0/576.0*x^9.0+1.0/150.0*x^6.0-1.0/150.0*x^6.0+1.0/20.0*x^5.0-1.0/80.0*x^5.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/576.0/10.0*x^10.0-1.0/576.0/10.0*x^10.0+1.0/150.0/7.0*x^7.0-1.0/150.0/7.0*x^7.0+1.0/20.0/6.0*x^6.0-1.0/80.0/6.0*x^6.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/5760.0*x^10.0-1.0/5760.0*x^10.0+1.0/1050.0*x^7.0-1.0/1050.0*x^7.0+1.0/120.0*x^6.0-1.0/480.0*x^6.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "26.25*x^4.0-26.25*x^4.0+4.8*x-4.8*x+6.0-1.5";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "26.25*4.0*x^3.0-26.25*4.0*x^3.0+4.8-4.8+6.0*0.0-1.5*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "105.0*x^3.0-105.0*x^3.0+4.8-4.8";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/5760.0*x^10.0-1.0/5760.0*x^10.0+1.0/1050.0*x^7.0-1.0/1050.0*x^7.0+1.0/120.0*x^6.0-1.0/480.0*x^6.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/5760.0/11.0*x^11.0-1.0/5760.0/11.0*x^11.0+1.0/1050.0/8.0*x^8.0-1.0/1050.0/8.0*x^8.0+1.0/120.0/7.0*x^7.0-1.0/480.0/7.0*x^7.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/63360.0*x^11.0-1.0/63360.0*x^11.0+1.0/8400.0*x^8.0-1.0/8400.0*x^8.0+1.0/840.0*x^7.0-1.0/3360.0*x^7.0";
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
    public static void TestCaseDiff5001() {
        //Test Case 5001
        UsageCalculus.TestCase = 5001;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values Except 4th Order Integration";
        UsageCalculus.EqnUnderTest = "9.0*xyc1^9.0 + 6.0*xyc1^6.0 + 5.0*xyc1^5.0 + 2.0*xyc1^2.0 + 25.0*xyc1 + 50.0";
        UsageCalculus.TestCaseName = "Standard:Independent Constant:Basic Equation:Divide Operator";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "9.0*xyc1^9.0+6.0*xyc1^6.0+5.0*xyc1^5.0+2.0*xyc1^2.0+25.0*xyc1+50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "9.0*9.0*xyc1^8.0+6.0*6.0*xyc1^5.0+5.0*5.0*xyc1^4.0+2.0*2.0*xyc1^1.0+25.0+0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "81.0*xyc1^8.0+36.0*xyc1^5.0+25.0*xyc1^4.0+4.0*xyc1+25.0";
        UsageCalculus.EqnSolArrayMap3[1]=  "9.0*xyc1^9.0+6.0*xyc1^6.0+5.0*xyc1^5.0+2.0*xyc1^2.0+25.0*xyc1+50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="9.0/10.0*xyc1^10.0+6.0/7.0*xyc1^7.0+5.0/6.0*xyc1^6.0+2.0/3.0*xyc1^3.0+25.0/2.0*xyc1^2.0+50.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1.1111111111111112*xyc1^10.0+1.0/1.1666666666666667*xyc1^7.0+1.0/1.2*xyc1^6.0+1.0/1.5*xyc1^3.0+12.5*xyc1^2.0+50.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "81.0*xyc1^8.0+36.0*xyc1^5.0+25.0*xyc1^4.0+4.0*xyc1+25.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "81.0*8.0*xyc1^7.0+36.0*5.0*xyc1^4.0+25.0*4.0*xyc1^3.0+4.0+0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "648.0*xyc1^7.0+180.0*xyc1^4.0+100.0*xyc1^3.0+4.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/1.1111111111111112*xyc1^10.0+1.0/1.1666666666666667*xyc1^7.0+1.0/1.2*xyc1^6.0+1.0/1.5*xyc1^3.0+12.5*xyc1^2.0+50.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/1.1111111111111112/11.0*xyc1^11.0+1.0/1.1666666666666667/8.0*xyc1^8.0+1.0/1.2/7.0*xyc1^7.0+1.0/1.5/4.0*xyc1^4.0+12.5/3.0*xyc1^3.0+50.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/12.222222222222223*xyc1^11.0+1.0/9.333333333333334*xyc1^8.0+1.0/8.4*xyc1^7.0+1.0/6.0*xyc1^4.0+4.166666666666667*xyc1^3.0+25.0*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "648.0*xyc1^7.0+180.0*xyc1^4.0+100.0*xyc1^3.0+4.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "648.0*7.0*xyc1^6.0+180.0*4.0*xyc1^3.0+100.0*3.0*xyc1^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "4536.0*xyc1^6.0+720.0*xyc1^3.0+300.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/12.222222222222223*xyc1^11.0+1.0/9.333333333333334*xyc1^8.0+1.0/8.4*xyc1^7.0+1.0/6.0*xyc1^4.0+4.166666666666667*xyc1^3.0+25.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/12.222222222222223/12.0*xyc1^12.0+1.0/9.333333333333334/9.0*xyc1^9.0+1.0/8.4/8.0*xyc1^8.0+1.0/6.0/5.0*xyc1^5.0+4.166666666666667/4.0*xyc1^4.0+25.0/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/146.66666666666669*xyc1^12.0+1.0/84.0*xyc1^9.0+1.0/67.2*xyc1^8.0+1.0/30.0*xyc1^5.0+1.0416666666666667*xyc1^4.0+8.333333333333334*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "4536.0*xyc1^6.0+720.0*xyc1^3.0+300.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "4536.0*6.0*xyc1^5.0+720.0*3.0*xyc1^2.0+300.0*2.0*xyc1^1.0";
        UsageCalculus.EqnSolArrayMap2[4] = "27216.0*xyc1^5.0+2160.0*xyc1^2.0+600.0*xyc1";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/146.66666666666669*xyc1^12.0+1.0/84.0*xyc1^9.0+1.0/67.2*xyc1^8.0+1.0/30.0*xyc1^5.0+1.0416666666666667*xyc1^4.0+8.333333333333334*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/146.66666666666669/13.0*xyc1^13.0+1.0/84.0/10.0*xyc1^10.0+1.0/67.2/9.0*xyc1^9.0+1.0/30.0/6.0*xyc1^6.0+1.0416666666666667/5.0*xyc1^5.0+8.333333333333334/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/1906.666666666667*xyc1^13.0+1.0/840.0*xyc1^10.0+1.0/604.8000000000001*xyc1^9.0+1.0/180.0*xyc1^6.0+1.0/4.8*xyc1^5.0+2.0833333333333335*xyc1^4.0";
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
    
    public static void TestCaseDiff5002() {
        //Test Case 5002
        UsageCalculus.TestCase = 5002;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8 + x^5 + x^4 - x - 25.0";
        UsageCalculus.TestCaseName = "Standard:No Coefficients:Basic Equation";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
       
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        //Usage.EqnUnderTest="8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-1.0-0.0";
        UsageCalculus.EqnSolArrayMap1[1] = "x^8.0+x^5.0+x^4.0-x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-1.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-1.0";
        UsageCalculus.EqnSolArrayMap3[1]="x^8.0+x^5.0+x^4.0-x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/9.0/10.0*x^10.0+1.0/6.0/7.0*x^7.0+1.0/5.0/6.0*x^6.0-1.0/2.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/90.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*x^5.0+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/90.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/90.0/11.0*x^11.0+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-1.0/6.0/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/990.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*x^4.0+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/990.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/990.0/12.0*x^12.0+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/24.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/11880.0*x^12.0+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0-1.0/120.0*x^5.0-1.0416666666666667*x^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;

        UsageCalculus.EqnSolArrayMap1[5] = "1680.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "1680.0*4.0*x^3.0+120.0+0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "6720.0*x^3.0+120.0";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "6720.0*x^3.0+120.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "6720.0*3.0*x^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "20160.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[6]="";
        UsageCalculus.EqnSolArrayIntegrAlone[6]="";
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
        UsageCalculus.EqnSolArrayIntegrAlone[8]="";
        UsageCalculus.EqnSolOrder[8] = 8;

        UsageCalculus.EqnSolArrayMap1[9] = "";
        UsageCalculus.EqnSolArrayDiffAlone[9] = "";
        UsageCalculus.EqnSolArrayMap2[9] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[9]="";
        UsageCalculus.EqnSolOrder[9] = 9;

        UsageCalculus.EqnSolArrayMap1[10] = "";
        UsageCalculus.EqnSolArrayDiffAlone[10] = "";
        UsageCalculus.EqnSolArrayMap2[10] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[10]="";
        UsageCalculus.EqnSolOrder[10] = 10;

        UsageCalculus.EqnSolArrayMap1[11] = "";
        UsageCalculus.EqnSolArrayDiffAlone[11] = "";
        UsageCalculus.EqnSolArrayMap2[11] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[11]="";
        UsageCalculus.EqnSolOrder[11] = 11;

        UsageCalculus.EqnSolArrayMap1[12] = "";
        UsageCalculus.EqnSolArrayDiffAlone[12] = "";
        UsageCalculus.EqnSolArrayMap2[12] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[12]="";
        UsageCalculus.EqnSolOrder[12] = 12;

        UsageCalculus.EqnSolArrayMap1[13] = "";
        UsageCalculus.EqnSolArrayDiffAlone[13] = "";
        UsageCalculus.EqnSolArrayMap2[13] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[13]="";
        UsageCalculus.EqnSolOrder[13] = 13;

        UsageCalculus.EqnSolArrayMap1[14] = "";
        UsageCalculus.EqnSolArrayDiffAlone[14] = "";
        UsageCalculus.EqnSolArrayMap2[14] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[14]="";
        UsageCalculus.EqnSolOrder[14] = 14;
    }

    public static void TestCaseDiff5003() {
        //Test Case 5003
        UsageCalculus.TestCase = 5003;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values Except 4th Order Integration";
        UsageCalculus.EqnUnderTest = "1/x^8 + 1/x^5 + 1/x^4 - 25.0";
        UsageCalculus.TestCaseName = "Standard:No Coefficients:Basic Equation:Divide Operator";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/x^8.0+1.0/x^5.0+1.0/x^4.0-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-8.0/x^9.0-5.0/x^6.0-4.0/x^5.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-8.0/x^9.0-5.0/x^6.0-4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/x^8.0+1.0/x^5.0+1.0/x^4.0-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/-7.0/x^7.0+1.0/-4.0/x^4.0+1.0/-3.0/x^3.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="-1.0/7.0/x^7.0-1.0/4.0/x^4.0-1.0/3.0/x^3.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-8.0/x^9.0-5.0/x^6.0-4.0/x^5.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-8.0*-9.0/x^10.0-5.0*-6.0/x^7.0-4.0*-5.0/x^6.0";
        UsageCalculus.EqnSolArrayMap2[2] = "72.0/x^10.0+30.0/x^7.0+20.0/x^6.0";
        UsageCalculus.EqnSolArrayMap3[2]="-1.0/7.0/x^7.0-1.0/4.0/x^4.0-1.0/3.0/x^3.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-1.0/7.0/-6.0/x^6.0-1.0/4.0/-3.0/x^3.0-1.0/3.0/-2.0/x^2.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/42.0/x^6.0+1.0/12.0/x^3.0+1.0/6.0/x^2.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "72.0/x^10.0+30.0/x^7.0+20.0/x^6.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "72.0*-10.0/x^11.0+30.0*-7.0/x^8.0+20.0*-6.0/x^7.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-720.0/x^11.0-210.0/x^8.0-120.0/x^7.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/42.0/x^6.0+1.0/12.0/x^3.0+1.0/6.0/x^2.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/42.0/-5.0/x^5.0+1.0/12.0/-2.0/x^2.0+1.0/6.0/-1.0/x^1.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-1.0/210.0/x^5.0-1.0/24.0/x^2.0-1.0/6.0/x-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-720.0/x^11.0-210.0/x^8.0-120.0/x^7.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-720.0*-11.0/x^12.0-210.0*-8.0/x^9.0-120.0*-7.0/x^8.0";
        UsageCalculus.EqnSolArrayMap2[4] = "7920.0/x^12.0+1680.0/x^9.0+840.0/x^8.0";
        UsageCalculus.EqnSolArrayMap3[4]="-1.0/210.0/x^5.0-1.0/24.0/x^2.0-1.0/6.0/x-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="-1.0/210.0/-4.0/x^4.0-1.0/24.0/-1.0/x^1.0-1.0/6.0*ln(x)-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/840.0/x^4.0+1.0/24.0/x-1.0/6.0*ln(x)-1.0416666666666667*x^4.0";
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

    public static void TestCaseDiff5004() {
        //Test Case 5004
        UsageCalculus.TestCase = 5004;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values(Except 6th Order Values) :Negative Exponent Dropped";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^-8 + x^-5 + x^-4 - x - 25.0";
        UsageCalculus.TestCaseName = "Standard:No Coefficients:Basic Equation:Negative Exponent";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/x^8.0+1.0/x^5.0+1.0/x^4.0-x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-8.0/x^9.0-5.0/x^6.0-4.0/x^5.0-1.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-8.0/x^9.0-5.0/x^6.0-4.0/x^5.0-1.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/x^8.0+1.0/x^5.0+1.0/x^4.0-x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/-7.0/x^7.0+1.0/-4.0/x^4.0+1.0/-3.0/x^3.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="-1.0/7.0/x^7.0-1.0/4.0/x^4.0-1.0/3.0/x^3.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-8.0/x^9.0-5.0/x^6.0-4.0/x^5.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-8.0*-9.0/x^10.0-5.0*-6.0/x^7.0-4.0*-5.0/x^6.0-1.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "72.0/x^10.0+30.0/x^7.0+20.0/x^6.0";
        UsageCalculus.EqnSolArrayMap3[2]="-1.0/7.0/x^7.0-1.0/4.0/x^4.0-1.0/3.0/x^3.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-1.0/7.0/-6.0/x^6.0-1.0/4.0/-3.0/x^3.0-1.0/3.0/-2.0/x^2.0-1.0/2.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/42.0/x^6.0+1.0/12.0/x^3.0+1.0/6.0/x^2.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "72.0/x^10.0+30.0/x^7.0+20.0/x^6.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "72.0*-10.0/x^11.0+30.0*-7.0/x^8.0+20.0*-6.0/x^7.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-720.0/x^11.0-210.0/x^8.0-120.0/x^7.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/42.0/x^6.0+1.0/12.0/x^3.0+1.0/6.0/x^2.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/42.0/-5.0/x^5.0+1.0/12.0/-2.0/x^2.0+1.0/6.0/-1.0/x^1.0-1.0/6.0/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-1.0/210.0/x^5.0-1.0/24.0/x^2.0-1.0/6.0/x-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-720.0/x^11.0-210.0/x^8.0-120.0/x^7.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-720.0*-11.0/x^12.0-210.0*-8.0/x^9.0-120.0*-7.0/x^8.0";
        UsageCalculus.EqnSolArrayMap2[4] = "7920.0/x^12.0+1680.0/x^9.0+840.0/x^8.0";
        UsageCalculus.EqnSolArrayMap3[4]="-1.0/210.0/x^5.0-1.0/24.0/x^2.0-1.0/6.0/x-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="-1.0/210.0/-4.0/x^4.0-1.0/24.0/-1.0/x^1.0-1.0/6.0*ln(x)-1.0/24.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/840.0/x^4.0+1.0/24.0/x-1.0/6.0*ln(x)-1.0/120.0*x^5.0-1.0416666666666667*x^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;

        UsageCalculus.EqnSolArrayMap1[5] = "7920.0*x^-12.0+1680.0*x^-9.0+840.0*x^-8.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "7920.0*-12.0*x^-13.0+1680.0*-9.0*x^-10.0+840.0*-8.0*x^-9.0";
        UsageCalculus.EqnSolArrayMap2[5] = "-95040.0*x^-13.0-15120.0*x^-10.0-6720.0*x^-9.0";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "-95040.0*x^-13.0-15120.0*x^-10.0-6720.0*x^-9.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "-95040.0*-13.0*x^-14.0-15120.0*-10.0*x^-11.0-6720.0*-9.0*x^-10.0";
        UsageCalculus.EqnSolArrayMap2[6] = "1235520.0*x^-14.0+151200.0*x^-11.0+60480.0*x^-10.0";
        UsageCalculus.EqnSolArrayMap3[6]="";
        UsageCalculus.EqnSolArrayIntegrAlone[6]="";
        UsageCalculus.EqnSolArrayMap4[6]="";
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

    public static void TestCaseDiff5005() {
        //Test Case 5005
        UsageCalculus.TestCase= 5005;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values :Negative Exponent Dropped";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1/x^-8 + 1/x^-5 + 1/x^-4 - 25.0";
        UsageCalculus.TestCaseName = "Standard:No Coefficients:Basic Equation:Negative Exponent & Divide Operator";
        UsageCalculus.TestCaseMatrixID="Complex:Unit TestCase:Mapping of -ve Exponent & Division";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 5;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^8.0+x^5.0+x^4.0-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0";
        UsageCalculus.EqnSolArrayMap3[1]="x^8.0+x^5.0+x^4.0-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/9.0/10.0*x^10.0+1.0/6.0/7.0*x^7.0+1.0/5.0/6.0*x^6.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/90.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*x^5.0+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/90.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/90.0/11.0*x^11.0+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/990.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*x^4.0+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/990.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/990.0/12.0*x^12.0+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/11880.0*x^12.0+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0-1.0416666666666667*x^4.0";
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

    public static void TestCaseDiff5006() {
        //Test Case 5006
        UsageCalculus.TestCase = 5006;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*x^8 + 1.0*x^5 + 1.0*x^4 - x - 25.0";
        UsageCalculus.TestCaseName = "Standard:Coefficients=1.0 Explicit:Basic Equation:Coefficients=1.0 Explicit";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^8.0+x^5.0+x^4.0-x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-1.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-1.0";
        UsageCalculus.EqnSolArrayMap3[1]="x^8.0+x^5.0+x^4.0-x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/9.0/10.0*x^10.0+1.0/6.0/7.0*x^7.0+1.0/5.0/6.0*x^6.0-1.0/2.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/90.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*x^5.0+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/90.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/90.0/11.0*x^11.0+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-1.0/6.0/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/990.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*x^4.0+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/990.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/990.0/12.0*x^12.0+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/24.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/11880.0*x^12.0+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0-1.0/120.0*x^5.0-1.0416666666666667*x^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;

        UsageCalculus.EqnSolArrayMap1[5] = "1680.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "1680.0*4.0*x^3.0+120.0+0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "6720.0*x^3.0+120.0";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "6720.0*x^3.0+120.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "6720.0*3.0*x^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "20160.0*x^2.0+";
        UsageCalculus.EqnSolArrayMap3[6]="";
        UsageCalculus.EqnSolArrayIntegrAlone[6]="";
        UsageCalculus.EqnSolArrayMap4[6]="";
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

    public static void TestCaseDiff5007() {
        //Test Case 5007
        UsageCalculus.TestCase = 5007;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*x^8 + 1.0*x^5 + 1.0*x^4 - 1.0*x - 25.0";
        UsageCalculus.TestCaseName = "Complex:Coefficients=1.0 Explicit:Basic Equation:Coefficients=1.0 Explicit";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^8.0+x^5.0+x^4.0-x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-1.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-1.0";
        UsageCalculus.EqnSolArrayMap3[1]="x^8.0+x^5.0+x^4.0-x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/9.0/10.0*x^10.0+1.0/6.0/7.0*x^7.0+1.0/5.0/6.0*x^6.0-1.0/2.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/90.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*x^5.0+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/90.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/90.0/11.0*x^11.0+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-1.0/6.0/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/990.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*x^4.0+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/990.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/990.0/12.0*x^12.0+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/24.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/11880.0*x^12.0+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0-1.0/120.0*x^5.0-1.0416666666666667*x^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;

        UsageCalculus.EqnSolArrayMap1[5] = "1680.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "1680.0*4.0*x^3.0+120.0+0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "6720.0*x^3.0+120.0";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "6720.0*x^3.0+120.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "6720.0*3.0*x^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "20160.0*x^2.0+";
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

    //Palindromic String-Equation Test
    public static void TestCaseDiff5008() {
        //Palindromic String-Equation Test
        //Test Case 5008
        UsageCalculus.TestCase = 5008;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values Except 6th Order Onwards";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        //Usage.EqnUnderTest = " 25.0 + x - x^4 -x^5 -x^8 + x^8 + x^5 + x^4 - x - 25.0";
        UsageCalculus.EqnUnderTest = " -25.0+x+x^4 -x^5 -x^8 + x^8 + x^5 + x^4 - x - 25.0";
        //Usage.EqnUnderTest="-120.0-480.0*x^3.0+6720.0*x^3.0+120.0";
        UsageCalculus.TestCaseName = "Standard:Palindromic String Equation:";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-25.0+x+x^4.0-x^5.0-x^8.0+x^8.0+x^5.0+x^4.0-x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0+1.0+4.0*x^3.0-5.0*x^4.0-8.0*x^7.0+8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-1.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0+4.0*x^3.0-5.0*x^4.0-8.0*x^7.0+8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-1.0";
        UsageCalculus.EqnSolArrayMap3[1]="-25.0+x+x^4.0-x^5.0-x^8.0+x^8.0+x^5.0+x^4.0-x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-25.0*x+1.0/2.0*x^2.0+1.0/5.0*x^5.0-1.0/6.0*x^6.0-1.0/9.0*x^9.0+1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="-25.0*x+1.0/2.0*x^2.0+1.0/5.0*x^5.0-1.0/6.0*x^6.0-1.0/9.0*x^9.0+1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0+4.0*x^3.0-5.0*x^4.0-8.0*x^7.0+8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "0.0+4.0*3.0*x^2.0-5.0*4.0*x^3.0-8.0*7.0*x^6.0+8.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "12.0*x^2.0-20.0*x^3.0-56.0*x^6.0+56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="-25.0*x+1.0/2.0*x^2.0+1.0/5.0*x^5.0-1.0/6.0*x^6.0-1.0/9.0*x^9.0+1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-25.0/2.0*x^2.0+1.0/2.0/3.0*x^3.0+1.0/5.0/6.0*x^6.0-1.0/6.0/7.0*x^7.0-1.0/9.0/10.0*x^10.0+1.0/9.0/10.0*x^10.0+1.0/6.0/7.0*x^7.0+1.0/5.0/6.0*x^6.0-1.0/2.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="-12.5*x^2.0+1.0/6.0*x^3.0+1.0/30.0*x^6.0-1.0/42.0*x^7.0-1.0/90.0*x^10.0+1.0/90.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "12.0*x^2.0-20.0*x^3.0-56.0*x^6.0+56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "12.0*2.0*x^1.0-20.0*3.0*x^2.0-56.0*6.0*x^5.0+56.0*6.0*x^5.0+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "24.0*x-60.0*x^2.0-336.0*x^5.0+336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="-12.5*x^2.0+1.0/6.0*x^3.0+1.0/30.0*x^6.0-1.0/42.0*x^7.0-1.0/90.0*x^10.0+1.0/90.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="-12.5/3.0*x^3.0+1.0/6.0/4.0*x^4.0+1.0/30.0/7.0*x^7.0-1.0/42.0/8.0*x^8.0-1.0/90.0/11.0*x^11.0+1.0/90.0/11.0*x^11.0+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-1.0/6.0/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-4.166666666666667*x^3.0+1.0/24.0*x^4.0+1.0/210.0*x^7.0-1.0/336.0*x^8.0-1.0/990.0*x^11.0+1.0/990.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "24.0*x-60.0*x^2.0-336.0*x^5.0+336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "24.0-60.0*2.0*x^1.0-336.0*5.0*x^4.0+336.0*5.0*x^4.0+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "24.0-120.0*x-1680.0*x^4.0+1680.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="-4.166666666666667*x^3.0+1.0/24.0*x^4.0+1.0/210.0*x^7.0-1.0/336.0*x^8.0-1.0/990.0*x^11.0+1.0/990.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="-4.166666666666667/4.0*x^4.0+1.0/24.0/5.0*x^5.0+1.0/210.0/8.0*x^8.0-1.0/336.0/9.0*x^9.0-1.0/990.0/12.0*x^12.0+1.0/990.0/12.0*x^12.0+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/24.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="-1.0416666666666667*x^4.0+1.0/120.0*x^5.0+1.0/1680.0*x^8.0-1.0/3024.0*x^9.0-1.0/11880.0*x^12.0+1.0/11880.0*x^12.0+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0-1.0/120.0*x^5.0-1.0416666666666667*x^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;

        UsageCalculus.EqnSolArrayMap1[5] = "24.0-120.0*x-1680.0*x^4.0+1680.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "0.0-120.0-1680.0*4.0*x^3.0+1680.0*4.0*x^3.0+120.0+0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "-120.0-6720.0*x^3.0+6720.0*x^3.0+120.0";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "-120.0-6720.0*x^3.0+6720.0*x^3.0+120.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "0.0-6720.0*3.0*x^2.0+6720.0*3.0^x^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "-20160.0*x^2.0+20160.0*x^2.0+";
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

    public static void TestCaseDiff5009() {
        //Test Case 5009
        UsageCalculus.TestCase = 5009;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All RED Including Values";
        UsageCalculus.EqnUnderTest = " -25.0 + x - x^4 -x^5 -x^8 + x^8 + x^5 + x^4 - 1.0*x - 25.0";
        //Usage.EqnUnderTest = " 25.0 + 1.0*x - x^4 -x^5 -x^8 + x^8 + x^5 + x^4 - 1.0*x - 25.0";
        UsageCalculus.TestCaseName = "Standard:Palindromic String Equation:Coefficient=1.0 Explicit";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-25.0+x-x^4.0-x^5.0-x^8.0+x^8.0+x^5.0+x^4.0-x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0+1.0-4.0*x^3.0-5.0*x^4.0-8.0*x^7.0+8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-1.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0-4.0*x^3.0-5.0*x^4.0-8.0*x^7.0+8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-1.0";
        UsageCalculus.EqnSolArrayMap3[1]="-25.0+x-x^4.0-x^5.0-x^8.0+x^8.0+x^5.0+x^4.0-x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-25.0*x+1.0/2.0*x^2.0-1.0/5.0*x^5.0-1.0/6.0*x^6.0-1.0/9.0*x^9.0+1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="-25.0*x+1.0/2.0*x^2.0-1.0/5.0*x^5.0-1.0/6.0*x^6.0-1.0/9.0*x^9.0+1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0-4.0*x^3.0-5.0*x^4.0-8.0*x^7.0+8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "0.0-4.0*3.0*x^2.0-5.0*4.0*x^3.0-8.0*7.0*x^6.0+8.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-12.0*x^2.0-20.0*x^3.0-56.0*x^6.0+56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="-25.0*x+1.0/2.0*x^2.0-1.0/5.0*x^5.0-1.0/6.0*x^6.0-1.0/9.0*x^9.0+1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-25.0/2.0*x^2.0+1.0/2.0/3.0*x^3.0-1.0/5.0/6.0*x^6.0-1.0/6.0/7.0*x^7.0-1.0/9.0/10.0*x^10.0+1.0/9.0/10.0*x^10.0+1.0/6.0/7.0*x^7.0+1.0/5.0/6.0*x^6.0-1.0/2.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="-12.5*x^2.0+1.0/6.0*x^3.0-1.0/30.0*x^6.0-1.0/42.0*x^7.0-1.0/90.0*x^10.0+1.0/90.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-12.0*x^2.0-20.0*x^3.0-56.0*x^6.0+56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-12.0*2.0*x^1.0-20.0*3.0*x^2.0-56.0*6.0*x^5.0+56.0*6.0*x^5.0+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-24.0*x-60.0*x^2.0-336.0*x^5.0+336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="-12.5*x^2.0+1.0/6.0*x^3.0-1.0/30.0*x^6.0-1.0/42.0*x^7.0-1.0/90.0*x^10.0+1.0/90.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="-12.5/3.0*x^3.0+1.0/6.0/4.0*x^4.0-1.0/30.0/7.0*x^7.0-1.0/42.0/8.0*x^8.0-1.0/90.0/11.0*x^11.0+1.0/90.0/11.0*x^11.0+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-1.0/6.0/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-4.166666666666667*x^3.0+1.0/24.0*x^4.0-1.0/210.0*x^7.0-1.0/336.0*x^8.0-1.0/990.0*x^11.0+1.0/990.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-24.0*x-60.0*x^2.0-336.0*x^5.0+336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-24.0-60.0*2.0*x^1.0-336.0*5.0*x^4.0+336.0*5.0*x^4.0+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-24.0-120.0*x-1680.0*x^4.0+1680.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="-4.166666666666667*x^3.0+1.0/24.0*x^4.0-1.0/210.0*x^7.0-1.0/336.0*x^8.0-1.0/990.0*x^11.0+1.0/990.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="-4.166666666666667/4.0*x^4.0+1.0/24.0/5.0*x^5.0-1.0/210.0/8.0*x^8.0-1.0/336.0/9.0*x^9.0-1.0/990.0/12.0*x^12.0+1.0/990.0/12.0*x^12.0+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/24.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="-1.0416666666666667*x^4.0+1.0/120.0*x^5.0-1.0/1680.0*x^8.0-1.0/3024.0*x^9.0-1.0/11880.0*x^12.0+1.0/11880.0*x^12.0+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0-1.0/120.0*x^5.0-1.0416666666666667*x^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;

        UsageCalculus.EqnSolArrayMap1[5] = "-24.0-120.0*x-1680.0*x^4.0+1680.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "0.0-120.0-1680.0*4.0*x^3.0+1680.0*4.0*x^3.0+120.0+0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "-120.0-6720.0*x^3.0+6720.0*x^3.0+120.0+";
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

    public static void TestCaseDiff5010() {
        //Test Case 5010
        UsageCalculus.TestCase = 5010;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values Except 5th Order Onwards";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "20.0*3.0*x^2.0-56.0*6.0*x^5.0+56.0*6.0*x^5.0+20.0*3.0*x^2.0+12.0*2.0*x";
        UsageCalculus.TestCaseName = "Standard:Basic Equation: With Coefficient";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "60.0*x^2.0-336.0*x^5.0+336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "60.0*2.0*x^1.0-336.0*5.0*x^4.0+336.0*5.0*x^4.0+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[1] = "120.0*x-1680.0*x^4.0+1680.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[1]="60.0*x^2.0-336.0*x^5.0+336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="60.0/3.0*x^3.0-336.0/6.0*x^6.0+336.0/6.0*x^6.0+60.0/3.0*x^3.0+24.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[1]="20.0*x^3.0-56.0*x^6.0+56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "120.0*x-1680.0*x^4.0+1680.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "120.0-1680.0*4.0*x^3.0+1680.0*4.0*x^3.0+120.0+0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "120.0-6720.0*x^3.0+6720.0*x^3.0+120.0";
        UsageCalculus.EqnSolArrayMap3[2]="20.0*x^3.0-56.0*x^6.0+56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="20.0/4.0*x^4.0-56.0/7.0*x^7.0+56.0/7.0*x^7.0+20.0/4.0*x^4.0+12.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[2]="5.0*x^4.0-8.0*x^7.0+8.0*x^7.0+5.0*x^4.0+4.0*x^3.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "120.0-6720.0*x^3.0+6720.0*x^3.0+120.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "0.0-6720.0*3.0*x^2.0+6720.0*3.0*x^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-20160.0*x^2.0+20160.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[3]="5.0*x^4.0-8.0*x^7.0+8.0*x^7.0+5.0*x^4.0+4.0*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="5.0/5.0*x^5.0-8.0/8.0*x^8.0+8.0/8.0*x^8.0+5.0/5.0*x^5.0+4.0/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[3]="x^5.0-x^8.0+x^8.0+x^5.0+x^4.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-20160.0*x^2.0+20160.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-20160.0*2.0*x^1.0+20160.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-40320.0*x+40320.0*x";
        UsageCalculus.EqnSolArrayMap3[4]="x^5.0-x^8.0+x^8.0+x^5.0+x^4.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/6.0*x^6.0-1.0/9.0*x^9.0+1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/6.0*x^6.0-1.0/9.0*x^9.0+1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0";
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

    public static void TestCaseDiff5011() {
        //Test Case 5011
        UsageCalculus.TestCase = 5011;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "40320.0*x +40320.0*x -25";
        UsageCalculus.TestCaseName = "Simple:Basic Equation: With Coefficient";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "40320.0*x+40320.0*x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "40320.0+40320.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "40320.0+40320.0";
        UsageCalculus.EqnSolArrayMap3[1]="40320.0*x+40320.0*x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="40320.0/2.0*x^2.0+40320.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="20160.0*x^2.0+20160.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "40320.0+40320.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "0.0+0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="20160.0*x^2.0+20160.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="20160.0/3.0*x^3.0+20160.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="6720.0*x^3.0+6720.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="6720.0*x^3.0+6720.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="6720.0/4.0*x^4.0+6720.0/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1680.0*x^4.0+1680.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4]="1680.0*x^4.0+1680.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1680.0/5.0*x^5.0+1680.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="336.0*x^5.0+336.0*x^5.0-1.0416666666666667*x^4.0";
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

    //Palindromic String-Equation Test-Rearranged
    public static void TestCaseDiff5012() {
        //Palindromic String-Equation Test-Rearranged
        //Test Case 5012
        UsageCalculus.TestCase = 5012;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values Constant Dropped";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = " x^8 -x^8 + x^5 -x^5 + x^4 - x^4 + 25.0 + x - x - 25.0";
        UsageCalculus.TestCaseName = "Standard:Basic Equation: With Constants in the Middle";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^8.0-x^8.0+x^5.0-x^5.0+x^4.0-x^4.0+25.0+x-x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*x^7.0-8.0*x^7.0+5.0*x^4.0-5.0*x^4.0+4.0*x^3.0-4.0*x^3.0+0.0+1.0-1.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*x^7.0-8.0*x^7.0+5.0*x^4.0-5.0*x^4.0+4.0*x^3.0-4.0*x^3.0+1.0-1.0";
        UsageCalculus.EqnSolArrayMap3[1]="x^8.0-x^8.0+x^5.0-x^5.0+x^4.0-x^4.0+25.0+x-x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/9.0*x^9.0-1.0/9.0*x^9.0+1.0/6.0*x^6.0-1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/5.0*x^5.0+25.0*x+1.0/2.0*x^2.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/9.0*x^9.0-1.0/9.0*x^9.0+1.0/6.0*x^6.0-1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/5.0*x^5.0+25.0*x+1.0/2.0*x^2.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*x^7.0-8.0*x^7.0+5.0*x^4.0-5.0*x^4.0+4.0*x^3.0-4.0*x^3.0+1.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*7.0*x^6.0-8.0*7.0*x^6.0+5.0*4.0*x^3.0-5.0*4.0*x^3.0+4.0*3.0*x^2.0-4.0*3.0*x^2.0+0.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*x^6.0-56.0*x^6.0+20.0*x^3.0-20.0*x^3.0+12.0*x^2.0-12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/9.0*x^9.0-1.0/9.0*x^9.0+1.0/6.0*x^6.0-1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/5.0*x^5.0+25.0*x+1.0/2.0*x^2.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/9.0/10.0*x^10.0-1.0/9.0/10.0*x^10.0+1.0/6.0/7.0*x^7.0-1.0/6.0/7.0*x^7.0+1.0/5.0/6.0*x^6.0-1.0/5.0/6.0*x^6.0+25.0/2.0*x^2.0+1.0/2.0/3.0*x^3.0-1.0/2.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/90.0*x^10.0-1.0/90.0*x^10.0+1.0/42.0*x^7.0-1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.0/30.0*x^6.0+12.5*x^2.0+1.0/6.0*x^3.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*x^6.0-56.0*x^6.0+20.0*x^3.0-20.0*x^3.0+12.0*x^2.0-12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*x^5.0-56.0*6.0*x^5.0+20.0*3.0*x^2.0-20.0*3.0*x^2.0+12.0*2.0*x^1.0-12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*x^5.0-336.0*x^5.0+60.0*x^2.0-60.0*x^2.0+24.0*x-24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/90.0*x^10.0-1.0/90.0*x^10.0+1.0/42.0*x^7.0-1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.0/30.0*x^6.0+12.5*x^2.0+1.0/6.0*x^3.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/90.0/11.0*x^11.0-1.0/90.0/11.0*x^11.0+1.0/42.0/8.0*x^8.0-1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-1.0/30.0/7.0*x^7.0+12.5/3.0*x^3.0+1.0/6.0/4.0*x^4.0-1.0/6.0/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/990.0*x^11.0-1.0/990.0*x^11.0+1.0/336.0*x^8.0-1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/210.0*x^7.0+4.166666666666667*x^3.0+1.0/24.0*x^4.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*x^5.0-336.0*x^5.0+60.0*x^2.0-60.0*x^2.0+24.0*x-24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*x^4.0-336.0*5.0*x^4.0+60.0*2.0*x^1.0-60.0*2.0*x^1.0+24.0-24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*x^4.0-1680.0*x^4.0+120.0*x-120.0*x+24.0-24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/990.0*x^11.0-1.0/990.0*x^11.0+1.0/336.0*x^8.0-1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/210.0*x^7.0+4.166666666666667*x^3.0+1.0/24.0*x^4.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/990.0/12.0*x^12.0-1.0/990.0/12.0*x^12.0+1.0/336.0/9.0*x^9.0-1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/210.0/8.0*x^8.0+4.166666666666667/4.0*x^4.0+1.0/24.0/5.0*x^5.0-1.0/24.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/11880.0*x^12.0-1.0/11880.0*x^12.0+1.0/3024.0*x^9.0-1.0/3024.0*x^9.0+1.0/1680.0*x^8.0-1.0/1680.0*x^8.0+1.0416666666666667*x^4.0+1.0/120.0*x^5.0-1.0/120.0*x^5.0-1.0416666666666667*x^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;

        UsageCalculus.EqnSolArrayMap1[5] = "1680.0*x^4.0-1680.0*x^4.0+120.0*x-120.0*x+24.0-24.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "1680.0*4.0*x^3.0-1680.0*4.0*x^3.0+120.0-120.0+0.0-0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "6720.0*x^3.0-6720.0*x^3.0+120.0-120.0+-";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "6720.0*x^3.0-6720.0*x^3.0+120.0-120.0+";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "6720.0*3.0*x^2.0-6720.0*3.0*x^2.0+0.0-0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "20160.0*x^2.0-20160.0*x^2.0-";
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

    public static void TestCaseDiff5013() {
        //Test Case 5013
        UsageCalculus.TestCase = 5013;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "8.0*x^7.0-8.0*x^7.0+5.0*x^4.0-5.0*x^4.0+4.0*x^3.0-4.0*x^3.0";
        UsageCalculus.TestCaseName = "Standard:Basic Equation:";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "8.0*x^7.0-8.0*x^7.0+5.0*x^4.0-5.0*x^4.0+4.0*x^3.0-4.0*x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*7.0*x^6.0-8.0*7.0*x^6.0+5.0*4.0*x^3.0-5.0*4.0*x^3.0+4.0*3.0*x^2.0-4.0*3.0*x^2.0";
        UsageCalculus.EqnSolArrayMap2[1] = "56.0*x^6.0-56.0*x^6.0+20.0*x^3.0-20.0*x^3.0+12.0*x^2.0-12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="8.0*x^7.0-8.0*x^7.0+5.0*x^4.0-5.0*x^4.0+4.0*x^3.0-4.0*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="8.0/8.0*x^8.0-8.0/8.0*x^8.0+5.0/5.0*x^5.0-5.0/5.0*x^5.0+4.0/4.0*x^4.0-4.0/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[1]="x^8.0-x^8.0+x^5.0-x^5.0+x^4.0-x^4.0";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "56.0*x^6.0-56.0*x^6.0+20.0*x^3.0-20.0*x^3.0+12.0*x^2.0-12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "56.0*6.0*x^5.0-56.0*6.0*x^5.0+20.0*3.0*x^2.0-20.0*3.0*x^2.0+12.0*2.0*x^1.0-12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[2] = "336.0*x^5.0-336.0*x^5.0+60.0*x^2.0-60.0*x^2.0+24.0*x-24.0*x";
        UsageCalculus.EqnSolArrayMap3[2]="x^8.0-x^8.0+x^5.0-x^5.0+x^4.0-x^4.0";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/9.0*x^9.0-1.0/9.0*x^9.0+1.0/6.0*x^6.0-1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/5.0*x^5.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/9.0*x^9.0-1.0/9.0*x^9.0+1.0/6.0*x^6.0-1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/5.0*x^5.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "336.0*x^5.0-336.0*x^5.0+60.0*x^2.0-60.0*x^2.0+24.0*x-24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "336.0*5.0*x^4.0-336.0*5.0*x^4.0+60.0*2.0*x^1.0-60.0*2.0*x^1.0+24.0-24.0";
        UsageCalculus.EqnSolArrayMap2[3] = "1680.0*x^4.0-1680.0*x^4.0+120.0*x-120.0*x+24.0-24.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/9.0*x^9.0-1.0/9.0*x^9.0+1.0/6.0*x^6.0-1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/5.0*x^5.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/9.0/10.0*x^10.0-1.0/9.0/10.0*x^10.0+1.0/6.0/7.0*x^7.0-1.0/6.0/7.0*x^7.0+1.0/5.0/6.0*x^6.0-1.0/5.0/6.0*x^6.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/90.0*x^10.0-1.0/90.0*x^10.0+1.0/42.0*x^7.0-1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.0/30.0*x^6.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "1680.0*x^4.0-1680.0*x^4.0+120.0*x-120.0*x+24.0-24.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "1680.0*4.0*x^3.0-1680.0*4.0*x^3.0+120.0-120.0+0.0-0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "6720.0*x^3.0-6720.0*x^3.0+120.0-120.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/90.0*x^10.0-1.0/90.0*x^10.0+1.0/42.0*x^7.0-1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.0/30.0*x^6.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/90.0/11.0*x^11.0-1.0/90.0/11.0*x^11.0+1.0/42.0/8.0*x^8.0-1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-1.0/30.0/7.0*x^7.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/990.0*x^11.0-1.0/990.0*x^11.0+1.0/336.0*x^8.0-1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/210.0*x^7.0";
        UsageCalculus.EqnSolOrder[4] = 4;

        UsageCalculus.EqnSolArrayMap1[5] = "6720.0*x^3.0-6720.0*x^3.0+120.0-120.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "6720.0*3.0*x^2.0-6720.0*3.0*x^2.0+0.0-0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "20160.0*x^2.0-20160.0*x^2.0-";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "20160.0*x^2.0-20160.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "20160.0*2.0*x^1.0-20160.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[6] = "40320.0*x-40320.0*x";
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

    public static void TestCaseDiff5014() {
        //Leading & Trailing Constant
        //Test Case 5014
        UsageCalculus.TestCase = 5014;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = " 2*x^8*5 -3*x^8*6 + 4*x^5 -5*x^5*7 + 6*x^4*6 - 7*x^4*9 + 25.0 + 8*x*9 - 9*x*10 - 25.0";
        UsageCalculus.TestCaseName = "Standard:Basic Equation:With Leading and Trailing Coefficients";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "10.0*x^8.0-18.0*x^8.0+4.0*x^5.0-35.0*x^5.0+36.0*x^4.0-63.0*x^4.0+25.0+72.0*x-90.0*x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "10.0*8.0*x^7.0-18.0*8.0*x^7.0+4.0*5.0*x^4.0-35.0*5.0*x^4.0+36.0*4.0*x^3.0-63.0*4.0*x^3.0+0.0+72.0-90.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "80.0*x^7.0-144.0*x^7.0+20.0*x^4.0-175.0*x^4.0+144.0*x^3.0-252.0*x^3.0+72.0-90.0";
        UsageCalculus.EqnSolArrayMap3[1]="10.0*x^8.0-18.0*x^8.0+4.0*x^5.0-35.0*x^5.0+36.0*x^4.0-63.0*x^4.0+25.0+72.0*x-90.0*x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="10.0/9.0*x^9.0-18.0/9.0*x^9.0+4.0/6.0*x^6.0-35.0/6.0*x^6.0+36.0/5.0*x^5.0-63.0/5.0*x^5.0+25.0*x+72.0/2.0*x^2.0-90.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.1111111111111112*x^9.0-2.0*x^9.0+1.0/1.5*x^6.0-5.833333333333333*x^6.0+7.2*x^5.0-12.6*x^5.0+25.0*x+36.0*x^2.0-45.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "80.0*x^7.0-144.0*x^7.0+20.0*x^4.0-175.0*x^4.0+144.0*x^3.0-252.0*x^3.0+72.0-90.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "80.0*7.0*x^6.0-144.0*7.0*x^6.0+20.0*4.0*x^3.0-175.0*4.0*x^3.0+144.0*3.0*x^2.0-252.0*3.0*x^2.0+0.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "560.0*x^6.0-1008.0*x^6.0+80.0*x^3.0-700.0*x^3.0+432.0*x^2.0-756.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.1111111111111112*x^9.0-2.0*x^9.0+1.0/1.5*x^6.0-5.833333333333333*x^6.0+7.2*x^5.0-12.6*x^5.0+25.0*x+36.0*x^2.0-45.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.1111111111111112/10.0*x^10.0-2.0/10.0*x^10.0+1.0/1.5/7.0*x^7.0-5.833333333333333/7.0*x^7.0+7.2/6.0*x^6.0-12.6/6.0*x^6.0+25.0/2.0*x^2.0+36.0/3.0*x^3.0-45.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/9.0*x^10.0-1.0/5.0*x^10.0+1.0/10.5*x^7.0-1.0/1.2*x^7.0+1.2*x^6.0-2.1*x^6.0+12.5*x^2.0+12.0*x^3.0-15.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "560.0*x^6.0-1008.0*x^6.0+80.0*x^3.0-700.0*x^3.0+432.0*x^2.0-756.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "560.0*6.0*x^5.0-1008.0*6.0*x^5.0+80.0*3.0*x^2.0-700.0*3.0*x^2.0+432.0*2.0*x^1.0-756.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "3360.0*x^5.0-6048.0*x^5.0+240.0*x^2.0-2100.0*x^2.0+864.0*x-1512.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/9.0*x^10.0-1.0/5.0*x^10.0+1.0/10.5*x^7.0-1.0/1.2*x^7.0+1.2*x^6.0-2.1*x^6.0+12.5*x^2.0+12.0*x^3.0-15.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/9.0/11.0*x^11.0-1.0/5.0/11.0*x^11.0+1.0/10.5/8.0*x^8.0-1.0/1.2/8.0*x^8.0+1.2/7.0*x^7.0-2.1/7.0*x^7.0+12.5/3.0*x^3.0+12.0/4.0*x^4.0-15.0/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/99.0*x^11.0-1.0/55.0*x^11.0+1.0/84.0*x^8.0-1.0/9.6*x^8.0+1.0/5.833333333333334*x^7.0-1.0/3.333333333333333*x^7.0+4.166666666666667*x^3.0+3.0*x^4.0-3.75*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "3360.0*x^5.0-6048.0*x^5.0+240.0*x^2.0-2100.0*x^2.0+864.0*x-1512.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "3360.0*5.0*x^4.0-6048.0*5.0*x^4.0+240.0*2.0*x^1.0-2100.0*2.0*x^1.0+864.0-1512.0";
        UsageCalculus.EqnSolArrayMap2[4] = "16800.0*x^4.0-30240.0*x^4.0+480.0*x-4200.0*x+864.0-1512.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/99.0*x^11.0-1.0/55.0*x^11.0+1.0/84.0*x^8.0-1.0/9.6*x^8.0+1.0/5.833333333333334*x^7.0-1.0/3.333333333333333*x^7.0+4.166666666666667*x^3.0+3.0*x^4.0-3.75*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/99.0/12.0*x^12.0-1.0/55.0/12.0*x^12.0+1.0/84.0/9.0*x^9.0-1.0/9.6/9.0*x^9.0+1.0/5.833333333333334/8.0*x^8.0-1.0/3.333333333333333/8.0*x^8.0+4.166666666666667/4.0*x^4.0+3.0/5.0*x^5.0-3.75/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/1188.0*x^12.0-1.0/660.0*x^12.0+1.0/756.0*x^9.0-1.0/86.39999999999999*x^9.0+1.0/46.66666666666667*x^8.0-1.0/26.666666666666664*x^8.0+1.0416666666666667*x^4.0+1.0/1.6666666666666667*x^5.0-1.0/1.3333333333333333*x^5.0-1.0416666666666667*x^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;

        UsageCalculus.EqnSolArrayMap1[5] = "16800.0*x^4.0-30240.0*x^4.0+480.0*x-4200.0*x+864.0-1512.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "16800.0*4.0*x^3.0-30240.0*4.0*x^3.0+480.0-4200.0+0.0-0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "67200.0*x^3.0-120960.0*x^3.0+480.0-4200.0-";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "67200.0*x^3.0-120960.0*x^3.0+480.0-4200.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "67200.0*3.0*x^2.0-120960.0*3.0*x^2.0+0.0-0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "201600.0*x^2.0-362880.0*x^2.0-";
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

    public static void TestCaseDiff5015() {
        //Only Trailing Constant
        //Test Case 5015
        UsageCalculus.TestCase = 5015;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values Trailing Constant Dropped";
        UsageCalculus.EqnRegressionIntegreStatus = "All RED Including Values Trailing Constant Dropped";
        UsageCalculus.EqnUnderTest = "x^7.0*8.0-x^7.0*8.0+x^4.0*5.0-x^4.0*5.0+x^3.0-x^3.0*4.0";
        UsageCalculus.TestCaseName = "Standard:Basic Equation:With  Trailing Coefficients alone";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "8.0*x^7.0-8.0*x^7.0+5.0*x^4.0-5.0*x^4.0+x^3.0-4.0*x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*7.0*x^6.0-8.0*7.0*x^6.0+5.0*4.0*x^3.0-5.0*4.0*x^3.0+3.0*x^2.0-4.0*3.0*x^2.0";
        UsageCalculus.EqnSolArrayMap2[1] = "56.0*x^6.0-56.0*x^6.0+20.0*x^3.0-20.0*x^3.0+3.0*x^2.0-12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="8.0*x^7.0-8.0*x^7.0+5.0*x^4.0-5.0*x^4.0+x^3.0-4.0*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="8.0/8.0*x^8.0-8.0/8.0*x^8.0+5.0/5.0*x^5.0-5.0/5.0*x^5.0+1.0/4.0*x^4.0-4.0/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[1]="x^8.0-x^8.0+x^5.0-x^5.0+1.0/4.0*x^4.0-x^4.0";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "56.0*x^6.0-56.0*x^6.0+20.0*x^3.0-20.0*x^3.0+3.0*x^2.0-12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "56.0*6.0*x^5.0-56.0*6.0*x^5.0+20.0*3.0*x^2.0-20.0*3.0*x^2.0+3.0*2.0*x^1.0-12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[2] = "336.0*x^5.0-336.0*x^5.0+60.0*x^2.0-60.0*x^2.0+6.0*x-24.0*x";
        UsageCalculus.EqnSolArrayMap3[2]="x^8.0-x^8.0+x^5.0-x^5.0+0.25*x^4.0-x^4.0";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/9.0*x^9.0-1.0/9.0*x^9.0+1.0/6.0*x^6.0-1.0/6.0*x^6.0+0.25/5.0*x^5.0-1.0/5.0*x^5.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/9.0*x^9.0-1.0/9.0*x^9.0+1.0/6.0*x^6.0-1.0/6.0*x^6.0+1.0/20.0*x^5.0-1.0/5.0*x^5.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "336.0*x^5.0-336.0*x^5.0+60.0*x^2.0-60.0*x^2.0+6.0*x-24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "336.0*5.0*x^4.0-336.0*5.0*x^4.0+60.0*2.0*x^1.0-60.0*2.0*x^1.0+6.0-24.0";
        UsageCalculus.EqnSolArrayMap2[3] = "1680.0*x^4.0-1680.0*x^4.0+120.0*x-120.0*x+6.0-24.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/9.0*x^9.0-1.0/9.0*x^9.0+1.0/6.0*x^6.0-1.0/6.0*x^6.0+1.0/20.0*x^5.0-1.0/5.0*x^5.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/9.0/10.0*x^10.0-1.0/9.0/10.0*x^10.0+1.0/6.0/7.0*x^7.0-1.0/6.0/7.0*x^7.0+1.0/20.0/6.0*x^6.0-1.0/5.0/6.0*x^6.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/90.0*x^10.0-1.0/90.0*x^10.0+1.0/42.0*x^7.0-1.0/42.0*x^7.0+1.0/120.0*x^6.0-1.0/30.0*x^6.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "1680.0*x^4.0-1680.0*x^4.0+120.0*x-120.0*x+6.0-24.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "1680.0*4.0*x^3.0-1680.0*4.0*x^3.0+120.0-120.0+0.0-0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "6720.0*x^3.0-6720.0*x^3.0+120.0-120.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/90.0*x^10.0-1.0/90.0*x^10.0+1.0/42.0*x^7.0-1.0/42.0*x^7.0+1.0/120.0*x^6.0-1.0/30.0*x^6.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/90.0/11.0*x^11.0-1.0/90.0/11.0*x^11.0+1.0/42.0/8.0*x^8.0-1.0/42.0/8.0*x^8.0+1.0/120.0/7.0*x^7.0-1.0/30.0/7.0*x^7.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/990.0*x^11.0-1.0/990.0*x^11.0+1.0/336.0*x^8.0-1.0/336.0*x^8.0+1.0/840.0*x^7.0-1.0/210.0*x^7.0";
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

       
    //
    //
    //
    public static void TestCaseDiff5016() {
        //Test Case 5016
        UsageCalculus.TestCase = 5016;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All RED Including Values";
        //Usage.EqnUnderTest = "x^9+ x^8*x*x + x*x*x^5 + x*2*x^4 - x - 25.0";
        UsageCalculus.EqnUnderTest = "x^9+ x^8*x*x + x*x*x^5 + x*x^4 - x - 25.0";
        UsageCalculus.TestCaseName = "Simple: Multiple x variables in 1 term";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^9.0+x^10.0+x^7.0+x^5.0-x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "9.0*x^8.0+10.0*x^9.0+7.0*x^6.0+5.0*x^4.0-1.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "9.0*x^8.0+10.0*x^9.0+7.0*x^6.0+5.0*x^4.0-1.0";
        UsageCalculus.EqnSolArrayMap3[1] = "x^9.0+x^10.0+x^7.0+x^5.0-x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/10.0*x^10.0+1.0/11.0*x^11.0+1.0/8.0*x^8.0+1.0/6.0*x^6.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/10.0*x^10.0+1.0/11.0*x^11.0+1.0/8.0*x^8.0+1.0/6.0*x^6.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "9.0*x^8.0+10.0*x^9.0+7.0*x^6.0+5.0*x^4.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "9.0*8.0*x^7.0+10.0*9.0*x^8.0+7.0*6.0*x^5.0+5.0*4.0*x^3.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "72.0*x^7.0+90.0*x^8.0+42.0*x^5.0+20.0*x^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/10.0*x^10.0+1.0/11.0*x^11.0+1.0/8.0*x^8.0+1.0/6.0*x^6.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/10.0/11.0*x^11.0+1.0/11.0/12.0*x^12.0+1.0/8.0/9.0*x^9.0+1.0/6.0/7.0*x^7.0-1.0/2.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/110.0*x^11.0+1.0/132.0*x^12.0+1.0/72.0*x^9.0+1.0/42.0*x^7.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "72.0*x^7.0+90.0*x^8.0+42.0*x^5.0+20.0*x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "72.0*7.0*x^6.0+90.0*8.0*x^7.0+42.0*5.0*x^4.0+20.0*3.0*x^2.0";
        UsageCalculus.EqnSolArrayMap2[3] = "504.0*x^6.0+720.0*x^7.0+210.0*x^4.0+60.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/110.0*x^11.0+1.0/132.0*x^12.0+1.0/72.0*x^9.0+1.0/42.0*x^7.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/110.0/12.0*x^12.0+1.0/132.0/13.0*x^13.0+1.0/72.0/10.0*x^10.0+1.0/42.0/8.0*x^8.0-1.0/6.0/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/1320.0*x^12.0+1.0/1716.0*x^13.0+1.0/720.0*x^10.0+1.0/336.0*x^8.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "504.0*x^6.0+720.0*x^7.0+210.0*x^4.0+60.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "504.0*6.0*x^5.0+720.0*7.0*x^6.0+210.0*4.0*x^3.0+60.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[4] = "3024.0*x^5.0+5040.0*x^6.0+840.0*x^3.0+120.0*x";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/1320.0*x^12.0+1.0/1716.0*x^13.0+1.0/720.0*x^10.0+1.0/336.0*x^8.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/1320.0/13.0*x^13.0+1.0/1716.0/14.0*x^14.0+1.0/720.0/11.0*x^11.0+1.0/336.0/9.0*x^9.0-1.0/24.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/17160.0*x^13.0+1.0/24024.0*x^14.0+1.0/7920.0*x^11.0+1.0/3024.0*x^9.0-1.0/120.0*x^5.0-1.0416666666666667*x^4.0";
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
    public static void TestCaseDiff5017() {
        //Test Case 5017
        UsageCalculus.TestCase = 5017;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All RED Including Values";
        UsageCalculus.EqnUnderTest = "x^9*x+ x^8*x*x + x*x*x^5 + x*2*x^4 - x - 25.0";
        UsageCalculus.TestCaseName = "Complex: Multiple x variables in 1 term with Starting Term";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^10.0+x^10.0+x^7.0+2.0*x^5.0-x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "10.0*x^9.0+10.0*x^9.0+7.0*x^6.0+2.0*5.0*x^4.0-1.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "10.0*x^9.0+10.0*x^9.0+7.0*x^6.0+10.0*x^4.0-1.0";
        UsageCalculus.EqnSolArrayMap3[1]="x^10.0+x^10.0+x^7.0+2.0*x^5.0-x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/11.0*x^11.0+1.0/11.0*x^11.0+1.0/8.0*x^8.0+2.0/6.0*x^6.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/11.0*x^11.0+1.0/11.0*x^11.0+1.0/8.0*x^8.0+1.0/3.0*x^6.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "10.0*x^9.0+10.0*x^9.0+7.0*x^6.0+10.0*x^4.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "10.0*9.0*x^8.0+10.0*9.0*x^8.0+7.0*6.0*x^5.0+10.0*4.0*x^3.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "90.0*x^8.0+90.0*x^8.0+42.0*x^5.0+40.0*x^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/11.0*x^11.0+1.0/11.0*x^11.0+1.0/8.0*x^8.0+1.0/3.0*x^6.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/11.0/12.0*x^12.0+1.0/11.0/12.0*x^12.0+1.0/8.0/9.0*x^9.0+1.0/3.0/7.0*x^7.0-1.0/2.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/132.0*x^12.0+1.0/132.0*x^12.0+1.0/72.0*x^9.0+1.0/21.0*x^7.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "90.0*x^8.0+90.0*x^8.0+42.0*x^5.0+40.0*x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "90.0*8.0*x^7.0+90.0*8.0*x^7.0+42.0*5.0*x^4.0+40.0*3.0*x^2.0";
        UsageCalculus.EqnSolArrayMap2[3] = "720.0*x^7.0+720.0*x^7.0+210.0*x^4.0+120.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/132.0*x^12.0+1.0/132.0*x^12.0+1.0/72.0*x^9.0+1.0/21.0*x^7.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/132.0/13.0*x^13.0+1.0/132.0/13.0*x^13.0+1.0/72.0/10.0*x^10.0+1.0/21.0/8.0*x^8.0-1.0/6.0/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/1716.0*x^13.0+1.0/1716.0*x^13.0+1.0/720.0*x^10.0+1.0/168.0*x^8.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "720.0*x^7.0+720.0*x^7.0+210.0*x^4.0+120.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "720.0*7.0*x^6.0+720.0*7.0*x^6.0+210.0*4.0*x^3.0+120.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[4] = "5040.0*x^6.0+5040.0*x^6.0+840.0*x^3.0+240.0*x";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/1716.0*x^13.0+1.0/1716.0*x^13.0+1.0/720.0*x^10.0+1.0/168.0*x^8.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/1716.0/14.0*x^14.0+1.0/1716.0/14.0*x^14.0+1.0/720.0/11.0*x^11.0+1.0/168.0/9.0*x^9.0-1.0/24.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/24024.0*x^14.0+1.0/24024.0*x^14.0+1.0/7920.0*x^11.0+1.0/1512.0*x^9.0-1.0/120.0*x^5.0-1.0416666666666667*x^4.0";
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
    public static void TestCaseDiff5018() {
        //Test Case 5018
        UsageCalculus.TestCase = 5018;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All RED Including Values";
        UsageCalculus.EqnUnderTest = "x^9+ x^8*x*x + x*x*x^5 + x*2*x^4 - x - 25.0";
        UsageCalculus.TestCaseName = "Simple: Multiple x variables in 1 term";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 4;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^9.0+x^10.0+x^7.0+2.0*x^5.0-x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "9.0*x^8.0+10.0*x^9.0+7.0*x^6.0+2.0*5.0*x^4.0-1.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "9.0*x^8.0+10.0*x^9.0+7.0*x^6.0+10.0*x^4.0-1.0";
        UsageCalculus.EqnSolArrayMap3[1]="x^9.0+x^10.0+x^7.0+2.0*x^5.0-x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/10.0*x^10.0+1.0/11.0*x^11.0+1.0/8.0*x^8.0+2.0/6.0*x^6.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/10.0*x^10.0+1.0/11.0*x^11.0+1.0/8.0*x^8.0+1.0/3.0*x^6.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "9.0*x^8.0+10.0*x^9.0+7.0*x^6.0+10.0*x^4.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "9.0*8.0*x^7.0+10.0*9.0*x^8.0+7.0*6.0*x^5.0+10.0*4.0*x^3.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "72.0*x^7.0+90.0*x^8.0+42.0*x^5.0+40.0*x^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/10.0*x^10.0+1.0/11.0*x^11.0+1.0/8.0*x^8.0+1.0/3.0*x^6.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/10.0/11.0*x^11.0+1.0/11.0/12.0*x^12.0+1.0/8.0/9.0*x^9.0+1.0/3.0/7.0*x^7.0-1.0/2.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/110.0*x^11.0+1.0/132.0*x^12.0+1.0/72.0*x^9.0+1.0/21.0*x^7.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "72.0*x^7.0+90.0*x^8.0+42.0*x^5.0+40.0*x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "72.0*7.0*x^6.0+90.0*8.0*x^7.0+42.0*5.0*x^4.0+40.0*3.0*x^2.0";
        UsageCalculus.EqnSolArrayMap2[3] = "504.0*x^6.0+720.0*x^7.0+210.0*x^4.0+120.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/110.0*x^11.0+1.0/132.0*x^12.0+1.0/72.0*x^9.0+1.0/21.0*x^7.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/110.0/12.0*x^12.0+1.0/132.0/13.0*x^13.0+1.0/72.0/10.0*x^10.0+1.0/21.0/8.0*x^8.0-1.0/6.0/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/1320.0*x^12.0+1.0/1716.0*x^13.0+1.0/720.0*x^10.0+1.0/168.0*x^8.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "504.0*x^6.0+720.0*x^7.0+210.0*x^4.0+120.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "504.0*6.0*x^5.0+720.0*7.0*x^6.0+210.0*4.0*x^3.0+120.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[4] = "3024.0*x^5.0+5040.0*x^6.0+840.0*x^3.0+240.0*x";
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
    public static void TestCaseDiff5019() {
        //Test Case 5019
        UsageCalculus.TestCase = 5019;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All RED Including Values";
        UsageCalculus.EqnUnderTest = "1.0/1.0*x^9*x+ x^8*x*x + 2.0/2.0*x*x*x^5 + x*2*x^4 - x - 25.0";
        UsageCalculus.TestCaseName = "Complex: Multiple x variables in 1 term with Starting Term";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 4;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^10.0+x^10.0+x^7.0+2.0*x^5.0-x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "10.0*x^9.0+10.0*x^9.0+7.0*x^6.0+2.0*5.0*x^4.0-1.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "10.0*x^9.0+10.0*x^9.0+7.0*x^6.0+10.0*x^4.0-1.0";
        UsageCalculus.EqnSolArrayMap3[1]="x^10.0+x^10.0+x^7.0+2.0*x^5.0-x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/11.0*x^11.0+1.0/11.0*x^11.0+1.0/8.0*x^8.0+2.0/6.0*x^6.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/11.0*x^11.0+1.0/11.0*x^11.0+1.0/8.0*x^8.0+1.0/3.0*x^6.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "10.0*x^9.0+10.0*x^9.0+7.0*x^6.0+10.0*x^4.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "10.0*9.0*x^8.0+10.0*9.0*x^8.0+7.0*6.0*x^5.0+10.0*4.0*x^3.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "90.0*x^8.0+90.0*x^8.0+42.0*x^5.0+40.0*x^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/11.0*x^11.0+1.0/11.0*x^11.0+1.0/8.0*x^8.0+1.0/3.0*x^6.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/11.0/12.0*x^12.0+1.0/11.0/12.0*x^12.0+1.0/8.0/9.0*x^9.0+1.0/3.0/7.0*x^7.0-1.0/2.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/132.0*x^12.0+1.0/132.0*x^12.0+1.0/72.0*x^9.0+1.0/21.0*x^7.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "90.0*x^8.0+90.0*x^8.0+42.0*x^5.0+40.0*x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "90.0*8.0*x^7.0+90.0*8.0*x^7.0+42.0*5.0*x^4.0+40.0*3.0*x^2.0";
        UsageCalculus.EqnSolArrayMap2[3] = "720.0*x^7.0+720.0*x^7.0+210.0*x^4.0+120.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/132.0*x^12.0+1.0/132.0*x^12.0+1.0/72.0*x^9.0+1.0/21.0*x^7.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/132.0/13.0*x^13.0+1.0/132.0/13.0*x^13.0+1.0/72.0/10.0*x^10.0+1.0/21.0/8.0*x^8.0-1.0/6.0/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/1716.0*x^13.0+1.0/1716.0*x^13.0+1.0/720.0*x^10.0+1.0/168.0*x^8.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "720.0*x^7.0+720.0*x^7.0+210.0*x^4.0+120.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "720.0*7.0*x^6.0+720.0*7.0*x^6.0+210.0*4.0*x^3.0+120.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[4] = "5040.0*x^6.0+5040.0*x^6.0+840.0*x^3.0+240.0*x";
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
    public static void TestCaseDiff5020() {
        //Test Case 5020
        UsageCalculus.TestCase = 5020;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*x^8*5.0 + 2*x^5 + 3*x^4*5 - 2*x*3 - 25.0*24*23";
        UsageCalculus.TestCaseName = "Simple: Multiple Coeffiecients in 1 term";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "5.0*x^8.0+2.0*x^5.0+15.0*x^4.0-6.0*x-13800.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "5.0*8.0*x^7.0+2.0*5.0*x^4.0+15.0*4.0*x^3.0-6.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "40.0*x^7.0+10.0*x^4.0+60.0*x^3.0-6.0";
        UsageCalculus.EqnSolArrayMap3[1]="5.0*x^8.0+2.0*x^5.0+15.0*x^4.0-6.0*x-13800.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="5.0/9.0*x^9.0+2.0/6.0*x^6.0+15.0/5.0*x^5.0-6.0/2.0*x^2.0-13800.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1.8*x^9.0+1.0/3.0*x^6.0+3.0*x^5.0-3.0*x^2.0-13800.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "40.0*x^7.0+10.0*x^4.0+60.0*x^3.0-6.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "40.0*7.0*x^6.0+10.0*4.0*x^3.0+60.0*3.0*x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "280.0*x^6.0+40.0*x^3.0+180.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/1.8*x^9.0+1.0/3.0*x^6.0+3.0*x^5.0-3.0*x^2.0-13800.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/1.8/10.0*x^10.0+1.0/3.0/7.0*x^7.0+3.0/6.0*x^6.0-3.0/3.0*x^3.0-13800.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/18.0*x^10.0+1.0/21.0*x^7.0+1.0/2.0*x^6.0-x^3.0-6900.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "280.0*x^6.0+40.0*x^3.0+180.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "280.0*6.0*x^5.0+40.0*3.0*x^2.0+180.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "1680.0*x^5.0+120.0*x^2.0+360.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/18.0*x^10.0+1.0/21.0*x^7.0+0.5*x^6.0-x^3.0-6900.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/18.0/11.0*x^11.0+1.0/21.0/8.0*x^8.0+0.5/7.0*x^7.0-1.0/4.0*x^4.0-6900.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/198.0*x^11.0+1.0/168.0*x^8.0+1.0/14.0*x^7.0-1.0/4.0*x^4.0-2300.0*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "1680.0*x^5.0+120.0*x^2.0+360.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "1680.0*5.0*x^4.0+120.0*2.0*x^1.0+360.0";
        UsageCalculus.EqnSolArrayMap2[4] = "8400.0*x^4.0+240.0*x+360.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/198.0*x^11.0+1.0/168.0*x^8.0+1.0/14.0*x^7.0-1.0/4.0*x^4.0-2300.0*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/198.0/12.0*x^12.0+1.0/168.0/9.0*x^9.0+1.0/14.0/8.0*x^8.0-1.0/4.0/5.0*x^5.0-2300.0/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/2376.0*x^12.0+1.0/1512.0*x^9.0+1.0/112.0*x^8.0-1.0/20.0*x^5.0-575.0*x^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;
        
        UsageCalculus.EqnSolArrayMap1[5] = "8400.0*x^4.0+240.0*x+360.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "8400.0*4.0*x^3.0+240.0+0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "33600.0*x^3.0+240.0+";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "33600.0*x^3.0+240.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "33600.0*3.0*x^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "100800.0*x^2.0+";
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
    public static void TestCaseDiff5021() {
        //Test Case 5021
        UsageCalculus.TestCase = 5021;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "-1.0*x^8*5.0 + 2*x^5 -3*x^4*5 - 2*x*3 - 25.0*-24*23";
        UsageCalculus.TestCaseName = "Complex: Multiple Coeffiecients in 1 term";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-5.0*x^8.0+2.0*x^5.0-15.0*x^4.0-6.0*x+13800.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-5.0*8.0*x^7.0+2.0*5.0*x^4.0-15.0*4.0*x^3.0-6.0+0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-40.0*x^7.0+10.0*x^4.0-60.0*x^3.0-6.0";
        UsageCalculus.EqnSolArrayMap3[1]="-5.0*x^8.0+2.0*x^5.0-15.0*x^4.0-6.0*x+13800.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-5.0/9.0*x^9.0+2.0/6.0*x^6.0-15.0/5.0*x^5.0-6.0/2.0*x^2.0+13800.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="-1.0/1.8*x^9.0+1.0/3.0*x^6.0-3.0*x^5.0-3.0*x^2.0+13800.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-40.0*x^7.0+10.0*x^4.0-60.0*x^3.0-6.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-40.0*7.0*x^6.0+10.0*4.0*x^3.0-60.0*3.0*x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-280.0*x^6.0+40.0*x^3.0-180.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="-1.0/1.8*x^9.0+1.0/3.0*x^6.0-3.0*x^5.0-3.0*x^2.0+13800.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-1.0/1.8/10.0*x^10.0+1.0/3.0/7.0*x^7.0-3.0/6.0*x^6.0-3.0/3.0*x^3.0+13800.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="-1.0/18.0*x^10.0+1.0/21.0*x^7.0-1.0/2.0*x^6.0-x^3.0+6900.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-280.0*x^6.0+40.0*x^3.0-180.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-280.0*6.0*x^5.0+40.0*3.0*x^2.0-180.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-1680.0*x^5.0+120.0*x^2.0-360.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="-1.0/18.0*x^10.0+1.0/21.0*x^7.0-0.5*x^6.0-x^3.0+6900.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="-1.0/18.0/11.0*x^11.0+1.0/21.0/8.0*x^8.0-0.5/7.0*x^7.0-1.0/4.0*x^4.0+6900.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-1.0/198.0*x^11.0+1.0/168.0*x^8.0-1.0/14.0*x^7.0-1.0/4.0*x^4.0+2300.0*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-1680.0*x^5.0+120.0*x^2.0-360.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-1680.0*5.0*x^4.0+120.0*2.0*x^1.0-360.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-8400.0*x^4.0+240.0*x-360.0";
        UsageCalculus.EqnSolArrayMap3[4]="-1.0/198.0*x^11.0+1.0/168.0*x^8.0-1.0/14.0*x^7.0-1.0/4.0*x^4.0+2300.0*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="-1.0/198.0/12.0*x^12.0+1.0/168.0/9.0*x^9.0-1.0/14.0/8.0*x^8.0-1.0/4.0/5.0*x^5.0+2300.0/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="-1.0/2376.0*x^12.0+1.0/1512.0*x^9.0-1.0/112.0*x^8.0-1.0/20.0*x^5.0+575.0*x^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;
        
        UsageCalculus.EqnSolArrayMap1[5] = "-8400.0*x^4.0+240.0*x-360.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "-8400.0*4.0*x^3.0+240.0-0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "-33600.0*x^3.0+240.0";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "-33600.0*x^3.0+240.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "-33600.0*3.0*x^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "-100800.0*x^2.0";
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
    public static void TestCaseDiff5022() {
        //Test Case 5022
        UsageCalculus.TestCase = 5022;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        //Usage.EqnUnderTest = "-1.0*x^8*(-5.0) + 2*x^5 + -3*x^4*(-5) - +2*x*+3 - 25.0*(-24)*+23";
        UsageCalculus.EqnUnderTest = "-1.0*x^8*-5.0 + 2*x^5 + 3*x^4*-5 - 2*x*3 - 25.0*-24*+23";
        UsageCalculus.TestCaseName = "Complex: Multiple Coeffiecients in 1 term";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "5.0*x^8.0+2.0*x^5.0-15.0*x^4.0-6.0*x+13800.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "5.0*8.0*x^7.0+2.0*5.0*x^4.0-15.0*4.0*x^3.0-6.0+0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "40.0*x^7.0+10.0*x^4.0-60.0*x^3.0-6.0";
        UsageCalculus.EqnSolArrayMap3[1]="5.0*x^8.0+2.0*x^5.0-15.0*x^4.0-6.0*x+13800.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="5.0/9.0*x^9.0+2.0/6.0*x^6.0-15.0/5.0*x^5.0-6.0/2.0*x^2.0+13800.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1.8*x^9.0+1.0/3.0*x^6.0-3.0*x^5.0-3.0*x^2.0+13800.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "40.0*x^7.0+10.0*x^4.0-60.0*x^3.0-6.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "40.0*7.0*x^6.0+10.0*4.0*x^3.0-60.0*3.0*x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "280.0*x^6.0+40.0*x^3.0-180.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/1.8*x^9.0+1.0/3.0*x^6.0-3.0*x^5.0-3.0*x^2.0+13800.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/1.8/10.0*x^10.0+1.0/3.0/7.0*x^7.0-3.0/6.0*x^6.0-3.0/3.0*x^3.0+13800.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/18.0*x^10.0+1.0/21.0*x^7.0-1.0/2.0*x^6.0-x^3.0+6900.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "280.0*x^6.0+40.0*x^3.0-180.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "280.0*6.0*x^5.0+40.0*3.0*x^2.0-180.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "1680.0*x^5.0+120.0*x^2.0-360.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/18.0*x^10.0+1.0/21.0*x^7.0-0.5*x^6.0-x^3.0+6900.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/18.0/11.0*x^11.0+1.0/21.0/8.0*x^8.0-0.5/7.0*x^7.0-1.0/4.0*x^4.0+6900.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/198.0*x^11.0+1.0/168.0*x^8.0-1.0/14.0*x^7.0-1.0/4.0*x^4.0+2300.0*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "1680.0*x^5.0+120.0*x^2.0-360.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "1680.0*5.0*x^4.0+120.0*2.0*x^1.0-360.0";
        UsageCalculus.EqnSolArrayMap2[4] = "8400.0*x^4.0+240.0*x-360.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/198.0*x^11.0+1.0/168.0*x^8.0-1.0/14.0*x^7.0-1.0/4.0*x^4.0+2300.0*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/198.0/12.0*x^12.0+1.0/168.0/9.0*x^9.0-1.0/14.0/8.0*x^8.0-1.0/4.0/5.0*x^5.0+2300.0/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/2376.0*x^12.0+1.0/1512.0*x^9.0-1.0/112.0*x^8.0-1.0/20.0*x^5.0+575.0*x^4.0";
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
    public static void TestCaseDiff5023() {
        //Test Case 5023
        UsageCalculus.TestCase = 5023;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All RED Including Values";
        UsageCalculus.EqnUnderTest = "1.0/1.0*x^9+ x^8*x*x + 2.0/2.0*x*x*x^5 + x*2*x^4 - x - 25.0";
        UsageCalculus.TestCaseName = "Simple: Multiple x variables in 1 term";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 4;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^9.0+x^10.0+x^7.0+2.0*x^5.0-x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "9.0*x^8.0+10.0*x^9.0+7.0*x^6.0+2.0*5.0*x^4.0-1.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "9.0*x^8.0+10.0*x^9.0+7.0*x^6.0+10.0*x^4.0-1.0";
        UsageCalculus.EqnSolArrayMap3[1]="x^9.0+x^10.0+x^7.0+2.0*x^5.0-x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/10.0*x^10.0+1.0/11.0*x^11.0+1.0/8.0*x^8.0+2.0/6.0*x^6.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/10.0*x^10.0+1.0/11.0*x^11.0+1.0/8.0*x^8.0+1.0/3.0*x^6.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "9.0*x^8.0+10.0*x^9.0+7.0*x^6.0+10.0*x^4.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "9.0*8.0*x^7.0+10.0*9.0*x^8.0+7.0*6.0*x^5.0+10.0*4.0*x^3.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "72.0*x^7.0+90.0*x^8.0+42.0*x^5.0+40.0*x^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/10.0*x^10.0+1.0/11.0*x^11.0+1.0/8.0*x^8.0+1.0/3.0*x^6.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/10.0/11.0*x^11.0+1.0/11.0/12.0*x^12.0+1.0/8.0/9.0*x^9.0+1.0/3.0/7.0*x^7.0-1.0/2.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/110.0*x^11.0+1.0/132.0*x^12.0+1.0/72.0*x^9.0+1.0/21.0*x^7.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "72.0*x^7.0+90.0*x^8.0+42.0*x^5.0+40.0*x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "72.0*7.0*x^6.0+90.0*8.0*x^7.0+42.0*5.0*x^4.0+40.0*3.0*x^2.0";
        UsageCalculus.EqnSolArrayMap2[3] = "504.0*x^6.0+720.0*x^7.0+210.0*x^4.0+120.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/110.0*x^11.0+1.0/132.0*x^12.0+1.0/72.0*x^9.0+1.0/21.0*x^7.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/110.0/12.0*x^12.0+1.0/132.0/13.0*x^13.0+1.0/72.0/10.0*x^10.0+1.0/21.0/8.0*x^8.0-1.0/6.0/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/1320.0*x^12.0+1.0/1716.0*x^13.0+1.0/720.0*x^10.0+1.0/168.0*x^8.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "504.0*x^6.0+720.0*x^7.0+210.0*x^4.0+120.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "504.0*6.0*x^5.0+720.0*7.0*x^6.0+210.0*4.0*x^3.0+120.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[4] = "3024.0*x^5.0+5040.0*x^6.0+840.0*x^3.0+240.0*x";
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
    public static void TestCaseDiff5024() {
        //Test Case 5024
        UsageCalculus.TestCase = 5024;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All RED Including Values";
        UsageCalculus.EqnUnderTest = "Infinity*x^9+ Infinity*x^8*x*x + Infinity*x*x*x^5 + Infinity*x*2*x^4 - Infinity*x - Infinity*25.0";
        UsageCalculus.TestCaseName = "Simple: Multiple x variables in 1 term";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "Infinity*x^9.0+Infinity*x^10.0+Infinity*x^7.0+Infinity*2.0*x^5.0-Infinity*x-Infinity*25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "Infinity*9.0*x^8.0+Infinity*10.0*x^9.0+Infinity*7.0*x^6.0+Infinity*2.0*5.0*x^4.0-Infinity-Infinity*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "Infinity*9.0*x^8.0+Infinity*10.0*x^9.0+Infinity*7.0*x^6.0+Infinity*10.0*x^4.0-Infinity-Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="Infinity*x^9.0+Infinity*x^10.0+Infinity*x^7.0+Infinity*2.0*x^5.0-Infinity*x-Infinity*25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="Infinity/10.0*x^10.0+Infinity/11.0*x^11.0+Infinity/8.0*x^8.0+Infinity*2.0/6.0*x^6.0-Infinity/2.0*x^2.0-Infinity*25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="Infinity/10.0*x^10.0+Infinity/11.0*x^11.0+Infinity/8.0*x^8.0+Infinity*0.3333333333333333*x^6.0-Infinity/2.0*x^2.0-Infinity*25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "Infinity*9.0*x^8.0+Infinity*10.0*x^9.0+Infinity*7.0*x^6.0+Infinity*10.0*x^4.0-Infinity-Infinity*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "Infinity*9.0*8.0*x^7.0+Infinity*10.0*9.0*x^8.0+Infinity*7.0*6.0*x^5.0+Infinity*10.0*4.0*x^3.0-Infinity*0.0-Infinity*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "Infinity*72.0*x^7.0+Infinity*90.0*x^8.0+Infinity*42.0*x^5.0+Infinity*40.0*x^3.0-Infinity*0.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="Infinity/10.0*x^10.0+Infinity/11.0*x^11.0+Infinity/8.0*x^8.0+Infinity*0.3333333333333333*x^6.0-Infinity/2.0*x^2.0-Infinity*25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="Infinity/10.0/11.0*x^11.0+Infinity/11.0/12.0*x^12.0+Infinity/8.0/9.0*x^9.0+Infinity*0.3333333333333333/7.0*x^7.0-Infinity/2.0/3.0*x^3.0-Infinity*25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="Infinity*0.00909090909090909*x^11.0+Infinity*0.007575757575757576*x^12.0+Infinity*0.013888888888888888*x^9.0+Infinity*0.047619047619047616*x^7.0-Infinity*0.16666666666666666*x^3.0-Infinity*12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "Infinity*72.0*x^7.0+Infinity*90.0*x^8.0+Infinity*42.0*x^5.0+Infinity*40.0*x^3.0-Infinity*0.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "Infinity*72.0*7.0*x^6.0+Infinity*90.0*8.0*x^7.0+Infinity*42.0*5.0*x^4.0+Infinity*40.0*3.0*x^2.0-Infinity*0.0*0.0-Infinity*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "Infinity*504.0*x^6.0+Infinity*720.0*x^7.0+Infinity*210.0*x^4.0+Infinity*120.0*x^2.0-Infinity*0.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="Infinity*0.00909090909090909*x^11.0+Infinity*0.007575757575757576*x^12.0+Infinity*0.013888888888888888*x^9.0+Infinity*0.047619047619047616*x^7.0-Infinity*0.16666666666666666*x^3.0-Infinity*12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="Infinity*0.00909090909090909/12.0*x^12.0+Infinity*0.007575757575757576/13.0*x^13.0+Infinity*0.013888888888888888/10.0*x^10.0+Infinity*0.047619047619047616/8.0*x^8.0-Infinity*0.16666666666666666/4.0*x^4.0-Infinity*12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="Infinity*7.575757575757576E-4*x^12.0+Infinity*5.827505827505828E-4*x^13.0+Infinity*0.0013888888888888887*x^10.0+Infinity*0.005952380952380952*x^8.0-Infinity*0.041666666666666664*x^4.0-Infinity*4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "Infinity*504.0*x^6.0+Infinity*720.0*x^7.0+Infinity*210.0*x^4.0+Infinity*120.0*x^2.0-Infinity*0.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "Infinity*504.0*6.0*x^5.0+Infinity*720.0*7.0*x^6.0+Infinity*210.0*4.0*x^3.0+Infinity*120.0*2.0*x^1.0-Infinity*0.0*0.0-Infinity*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "Infinity*3024.0*x^5.0+Infinity*5040.0*x^6.0+Infinity*840.0*x^3.0+Infinity*240.0*x-Infinity*0.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="Infinity*7.575757575757576E-4*x^12.0+Infinity*5.827505827505828E-4*x^13.0+Infinity*0.0013888888888888887*x^10.0+Infinity*0.005952380952380952*x^8.0-Infinity*0.041666666666666664*x^4.0-Infinity*4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="Infinity*7.575757575757576E-4/13.0*x^13.0+Infinity*5.827505827505828E-4/14.0*x^14.0+Infinity*0.0013888888888888887/11.0*x^11.0+Infinity*0.005952380952380952/9.0*x^9.0-Infinity*0.041666666666666664/5.0*x^5.0-Infinity*4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="Infinity*5.8275058275058275E-5*x^13.0+Infinity*4.1625041625041625E-5*x^14.0+Infinity*1.2626262626262624E-4*x^11.0+Infinity*6.613756613756613E-4*x^9.0-Infinity*0.008333333333333333*x^5.0-Infinity*1.0416666666666667*x^4.0";
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
    public static void TestCaseDiff5025() {
        //Test Case 5025
        UsageCalculus.TestCase = 5025;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All RED Including Values";
        UsageCalculus.EqnUnderTest = "Infinity/x^9+ Infinity/x^8*x*x + Infinity/x*x*x^5 + Infinity/x*2*x^4 - Infinity/x - Infinity/25.0";
        UsageCalculus.TestCaseName = "Simple: Multiple x variables in 1 term";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "Infinity/x^9.0+Infinity/x^6.0+Infinity*x^5.0+Infinity*2.0*x^3.0-Infinity/x-Infinity/25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "Infinity*-9.0/x^10.0+Infinity*-6.0/x^7.0+Infinity*5.0*x^4.0+Infinity*2.0*3.0*x^2.0+Infinity/x^2.0-Infinity/25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-Infinity*9.0/x^10.0-Infinity*6.0/x^7.0+Infinity*5.0*x^4.0+Infinity*6.0*x^2.0+Infinity/x^2.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="Infinity/x^9.0+Infinity/x^6.0+Infinity*x^5.0+Infinity*2.0*x^3.0-Infinity/x-Infinity/25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="Infinity/-8.0/x^8.0+Infinity/-5.0/x^5.0+Infinity/6.0*x^6.0+Infinity*2.0/4.0*x^4.0-Infinity*ln(x)-Infinity/25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="-Infinity/8.0/x^8.0-Infinity/5.0/x^5.0+Infinity/6.0*x^6.0+Infinity*0.5*x^4.0-Infinity*ln(x)-Infinity/25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-Infinity*9.0/x^10.0-Infinity*6.0/x^7.0+Infinity*5.0*x^4.0+Infinity*6.0*x^2.0+Infinity/x^2.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-Infinity*9.0*-10.0/x^11.0-Infinity*6.0*-7.0/x^8.0+Infinity*5.0*4.0*x^3.0+Infinity*6.0*2.0*x^1.0+Infinity*-2.0/x^3.0-Infinity*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "Infinity*90.0/x^11.0+Infinity*42.0/x^8.0+Infinity*20.0*x^3.0+Infinity*12.0*x-Infinity*2.0/x^3.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "Infinity*90.0/x^11.0+Infinity*42.0/x^8.0+Infinity*20.0*x^3.0+Infinity*12.0*x-Infinity*2.0/x^3.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "Infinity*90.0*-11.0/x^12.0+Infinity*42.0*-8.0/x^9.0+Infinity*20.0*3.0*x^2.0+Infinity*12.0-Infinity*2.0*-3.0/x^4.0-Infinity*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-Infinity*990.0/x^12.0-Infinity*336.0/x^9.0+Infinity*60.0*x^2.0+Infinity*12.0+Infinity*6.0/x^4.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-Infinity*990.0/x^12.0-Infinity*336.0/x^9.0+Infinity*60.0*x^2.0+Infinity*12.0+Infinity*6.0/x^4.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-Infinity*990.0*-12.0/x^13.0-Infinity*336.0*-9.0/x^10.0+Infinity*60.0*2.0*x^1.0+Infinity*12.0*0.0+Infinity*6.0*-4.0/x^5.0-Infinity*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "Infinity*11880.0/x^13.0+Infinity*3024.0/x^10.0+Infinity*120.0*x+Infinity*0.0-Infinity*24.0/x^5.0-Infinity*0.0";
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
    public static void TestCaseDiff5026() {
        //Test Case 5026
        UsageCalculus.TestCase = 5026;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All RED Including Values";
        UsageCalculus.EqnUnderTest = "NaN/x^9+ NaN/x^8*x*x + NaN/x*x*x^5 + NaN/x*2*x^4 - NaN/x - NaN/25.0";
        UsageCalculus.TestCaseName = "Simple: Multiple x variables in 1 term";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "NaN/x^9.0+NaN/x^6.0+NaN*x^5.0+NaN*2.0*x^3.0-NaN/x-NaN/25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "NaN*-9.0/x^10.0+NaN*-6.0/x^7.0+NaN*5.0*x^4.0+NaN*2.0*3.0*x^2.0+NaN/x^2.0-NaN/25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-NaN*9.0/x^10.0-NaN*6.0/x^7.0+NaN*5.0*x^4.0+NaN*6.0*x^2.0+NaN/x^2.0-NaN*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="NaN/x^9.0+NaN/x^6.0+NaN*x^5.0+NaN*2.0*x^3.0-NaN/x-NaN/25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="NaN/-8.0/x^8.0+NaN/-5.0/x^5.0+NaN/6.0*x^6.0+NaN*2.0/4.0*x^4.0-NaN*ln(x)-NaN/25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="-NaN/8.0/x^8.0-NaN/5.0/x^5.0+NaN/6.0*x^6.0+NaN*0.5*x^4.0-NaN*ln(x)-NaN/25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-NaN*9.0/x^10.0-NaN*6.0/x^7.0+NaN*5.0*x^4.0+NaN*6.0*x^2.0+NaN/x^2.0-NaN*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-NaN*9.0*-10.0/x^11.0-NaN*6.0*-7.0/x^8.0+NaN*5.0*4.0*x^3.0+NaN*6.0*2.0*x^1.0+NaN*-2.0/x^3.0-NaN*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "NaN*90.0/x^11.0+NaN*42.0/x^8.0+NaN*20.0*x^3.0+NaN*12.0*x-NaN*2.0/x^3.0-NaN*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "NaN*90.0/x^11.0+NaN*42.0/x^8.0+NaN*20.0*x^3.0+NaN*12.0*x-NaN*2.0/x^3.0-NaN*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "NaN*90.0*-11.0/x^12.0+NaN*42.0*-8.0/x^9.0+NaN*20.0*3.0*x^2.0+NaN*12.0-NaN*2.0*-3.0/x^4.0-NaN*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-NaN*990.0/x^12.0-NaN*336.0/x^9.0+NaN*60.0*x^2.0+NaN*12.0+NaN*6.0/x^4.0-NaN*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-NaN*990.0/x^12.0-NaN*336.0/x^9.0+NaN*60.0*x^2.0+NaN*12.0+NaN*6.0/x^4.0-NaN*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-NaN*990.0*-12.0/x^13.0-NaN*336.0*-9.0/x^10.0+NaN*60.0*2.0*x^1.0+NaN*12.0*0.0+NaN*6.0*-4.0/x^5.0-NaN*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "NaN*11880.0/x^13.0+NaN*3024.0/x^10.0+NaN*120.0*x+NaN*0.0-NaN*24.0/x^5.0-NaN*0.0";
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
    public static void TestCaseDiff5027() {
        //Test Case 5027
        UsageCalculus.TestCase = 5027;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All RED Including Values";
        UsageCalculus.EqnUnderTest = "NaN*x^9+ NaN*x^8*x*x + NaN*x*x*x^5 + NaN*x*2*x^4 - NaN*x - NaN*25.0";
        UsageCalculus.TestCaseName = "Simple: Multiple x variables in 1 term";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "NaN*x^9.0+NaN*x^10.0+NaN*x^7.0+NaN*2.0*x^5.0-NaN*x-NaN*25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "NaN*9.0*x^8.0+NaN*10.0*x^9.0+NaN*7.0*x^6.0+NaN*2.0*5.0*x^4.0-NaN-NaN*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "NaN*9.0*x^8.0+NaN*10.0*x^9.0+NaN*7.0*x^6.0+NaN*10.0*x^4.0-NaN-NaN*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="NaN*x^9.0+NaN*x^10.0+NaN*x^7.0+NaN*2.0*x^5.0-NaN*x-NaN*25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="NaN/10.0*x^10.0+NaN/11.0*x^11.0+NaN/8.0*x^8.0+NaN*2.0/6.0*x^6.0-NaN/2.0*x^2.0-NaN*25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="NaN/10.0*x^10.0+NaN/11.0*x^11.0+NaN/8.0*x^8.0+NaN*0.3333333333333333*x^6.0-NaN/2.0*x^2.0-NaN*25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "NaN*9.0*x^8.0+NaN*10.0*x^9.0+NaN*7.0*x^6.0+NaN*10.0*x^4.0-NaN-NaN*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "NaN*9.0*8.0*x^7.0+NaN*10.0*9.0*x^8.0+NaN*7.0*6.0*x^5.0+NaN*10.0*4.0*x^3.0-NaN*0.0-NaN*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "NaN*72.0*x^7.0+NaN*90.0*x^8.0+NaN*42.0*x^5.0+NaN*40.0*x^3.0-NaN*0.0-NaN*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="NaN/10.0*x^10.0+NaN/11.0*x^11.0+NaN/8.0*x^8.0+NaN*0.3333333333333333*x^6.0-NaN/2.0*x^2.0-NaN*25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="NaN/10.0/11.0*x^11.0+NaN/11.0/12.0*x^12.0+NaN/8.0/9.0*x^9.0+NaN*0.3333333333333333/7.0*x^7.0-NaN/2.0/3.0*x^3.0-NaN*25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="NaN*0.00909090909090909*x^11.0+NaN*0.007575757575757576*x^12.0+NaN*0.013888888888888888*x^9.0+NaN*0.047619047619047616*x^7.0-NaN*0.16666666666666666*x^3.0-NaN*12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "NaN*72.0*x^7.0+NaN*90.0*x^8.0+NaN*42.0*x^5.0+NaN*40.0*x^3.0-NaN*0.0-NaN*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "NaN*72.0*7.0*x^6.0+NaN*90.0*8.0*x^7.0+NaN*42.0*5.0*x^4.0+NaN*40.0*3.0*x^2.0-NaN*0.0*0.0-NaN*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "NaN*504.0*x^6.0+NaN*720.0*x^7.0+NaN*210.0*x^4.0+NaN*120.0*x^2.0-NaN*0.0-NaN*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="NaN*0.00909090909090909*x^11.0+NaN*0.007575757575757576*x^12.0+NaN*0.013888888888888888*x^9.0+NaN*0.047619047619047616*x^7.0-NaN*0.16666666666666666*x^3.0-NaN*12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="NaN*0.00909090909090909/12.0*x^12.0+NaN*0.007575757575757576/13.0*x^13.0+NaN*0.013888888888888888/10.0*x^10.0+NaN*0.047619047619047616/8.0*x^8.0-NaN*0.16666666666666666/4.0*x^4.0-NaN*12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="NaN*7.575757575757576E-4*x^12.0+NaN*5.827505827505828E-4*x^13.0+NaN*0.0013888888888888887*x^10.0+NaN*0.005952380952380952*x^8.0-NaN*0.041666666666666664*x^4.0-NaN*4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "NaN*504.0*x^6.0+NaN*720.0*x^7.0+NaN*210.0*x^4.0+NaN*120.0*x^2.0-NaN*0.0-NaN*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "NaN*504.0*6.0*x^5.0+NaN*720.0*7.0*x^6.0+NaN*210.0*4.0*x^3.0+NaN*120.0*2.0*x^1.0-NaN*0.0*0.0-NaN*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "NaN*3024.0*x^5.0+NaN*5040.0*x^6.0+NaN*840.0*x^3.0+NaN*240.0*x-NaN*0.0-NaN*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="NaN*7.575757575757576E-4*x^12.0+NaN*5.827505827505828E-4*x^13.0+NaN*0.0013888888888888887*x^10.0+NaN*0.005952380952380952*x^8.0-NaN*0.041666666666666664*x^4.0-NaN*4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="NaN*7.575757575757576E-4/13.0*x^13.0+NaN*5.827505827505828E-4/14.0*x^14.0+NaN*0.0013888888888888887/11.0*x^11.0+NaN*0.005952380952380952/9.0*x^9.0-NaN*0.041666666666666664/5.0*x^5.0-NaN*4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="NaN*5.8275058275058275E-5*x^13.0+NaN*4.1625041625041625E-5*x^14.0+NaN*1.2626262626262624E-4*x^11.0+NaN*6.613756613756613E-4*x^9.0-NaN*0.008333333333333333*x^5.0-NaN*1.0416666666666667*x^4.0";
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
    public static void TestCaseDiff5028() {
        //Test Case 5028
        UsageCalculus.TestCase = 5028;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All RED Including Values";
        UsageCalculus.EqnUnderTest = "NaN*x^9*Infinity+ NaN*x^8*x*x*Infinity + NaN*x*x*x^5*Infinity + NaN*x*2*x^4*Infinity - NaN*x*Infinity - NaN*25.0*Infinity";
        UsageCalculus.TestCaseName = "Simple: Multiple x variables in 1 term";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "NaN*Infinity*x^9.0+NaN*Infinity*x^10.0+NaN*Infinity*x^7.0+NaN*Infinity*2.0*x^5.0-NaN*Infinity*x-NaN*Infinity*25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "NaN*Infinity*9.0*x^8.0+NaN*Infinity*10.0*x^9.0+NaN*Infinity*7.0*x^6.0+NaN*Infinity*2.0*5.0*x^4.0-NaN*Infinity-NaN*Infinity*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "NaN*Infinity*9.0*x^8.0+NaN*Infinity*10.0*x^9.0+NaN*Infinity*7.0*x^6.0+NaN*Infinity*10.0*x^4.0-NaN*Infinity-NaN*Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="NaN*Infinity*x^9.0+NaN*Infinity*x^10.0+NaN*Infinity*x^7.0+NaN*Infinity*2.0*x^5.0-NaN*Infinity*x-NaN*Infinity*25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="NaN*Infinity/10.0*x^10.0+NaN*Infinity/11.0*x^11.0+NaN*Infinity/8.0*x^8.0+NaN*Infinity*2.0/6.0*x^6.0-NaN*Infinity*x^2.0*1.0/2.0-NaN*Infinity*25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="NaN*Infinity/10.0*x^10.0+NaN*Infinity/11.0*x^11.0+NaN*Infinity/8.0*x^8.0+NaN*Infinity*0.3333333333333333*x^6.0-NaN*Infinity/2.0*x^2.0-NaN*Infinity*25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "NaN*Infinity*9.0*x^8.0+NaN*Infinity*10.0*x^9.0+NaN*Infinity*7.0*x^6.0+NaN*Infinity*10.0*x^4.0-NaN*Infinity-NaN*Infinity*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "NaN*Infinity*9.0*8.0*x^7.0+NaN*Infinity*10.0*9.0*x^8.0+NaN*Infinity*7.0*6.0*x^5.0+NaN*Infinity*10.0*4.0*x^3.0-NaN*Infinity*0.0-NaN*Infinity*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "NaN*Infinity*72.0*x^7.0+NaN*Infinity*90.0*x^8.0+NaN*Infinity*42.0*x^5.0+NaN*Infinity*40.0*x^3.0-NaN*Infinity*0.0-NaN*Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="NaN*Infinity/10.0*x^10.0+NaN*Infinity/11.0*x^11.0+NaN*Infinity/8.0*x^8.0+NaN*Infinity*0.3333333333333333*x^6.0-NaN*Infinity/2.0*x^2.0-NaN*Infinity*25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="NaN*Infinity/10.0/11.0*x^11.0+NaN*Infinity/11.0/12.0*x^12.0+NaN*Infinity/8.0/9.0*x^9.0+NaN*Infinity*0.3333333333333333/7.0*x^7.0-NaN*Infinity/2.0/3.0*x^3.0-NaN*Infinity*25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="NaN*Infinity*0.00909090909090909*x^11.0+NaN*Infinity*0.007575757575757576*x^12.0+NaN*Infinity*0.013888888888888888*x^9.0+NaN*Infinity*0.047619047619047616*x^7.0-NaN*Infinity*0.16666666666666666*x^3.0-NaN*Infinity*12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "NaN*Infinity*72.0*x^7.0+NaN*Infinity*90.0*x^8.0+NaN*Infinity*42.0*x^5.0+NaN*Infinity*40.0*x^3.0-NaN*Infinity*0.0-NaN*Infinity*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "NaN*Infinity*72.0*7.0*x^6.0+NaN*Infinity*90.0*8.0*x^7.0+NaN*Infinity*42.0*5.0*x^4.0+NaN*Infinity*40.0*3.0*x^2.0-NaN*Infinity*0.0*0.0-NaN*Infinity*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "NaN*Infinity*504.0*x^6.0+NaN*Infinity*720.0*x^7.0+NaN*Infinity*210.0*x^4.0+NaN*Infinity*120.0*x^2.0-NaN*Infinity*0.0-NaN*Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="NaN*Infinity*0.00909090909090909*x^11.0+NaN*Infinity*0.007575757575757576*x^12.0+NaN*Infinity*0.013888888888888888*x^9.0+NaN*Infinity*0.047619047619047616*x^7.0-NaN*Infinity*0.16666666666666666*x^3.0-NaN*Infinity*12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="NaN*Infinity*0.00909090909090909/12.0*x^12.0+NaN*Infinity*0.007575757575757576/13.0*x^13.0+NaN*Infinity*0.013888888888888888/10.0*x^10.0+NaN*Infinity*0.047619047619047616/8.0*x^8.0-NaN*Infinity*0.16666666666666666/4.0*x^4.0-NaN*Infinity*12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="NaN*Infinity*7.575757575757576E-4*x^12.0+NaN*Infinity*5.827505827505828E-4*x^13.0+NaN*Infinity*0.0013888888888888887*x^10.0+NaN*Infinity*0.005952380952380952*x^8.0-NaN*Infinity*0.041666666666666664*x^4.0-NaN*Infinity*4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "NaN*Infinity*504.0*x^6.0+NaN*Infinity*720.0*x^7.0+NaN*Infinity*210.0*x^4.0+NaN*Infinity*120.0*x^2.0-NaN*Infinity*0.0-NaN*Infinity*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "NaN*Infinity*504.0*6.0*x^5.0+NaN*Infinity*720.0*7.0*x^6.0+NaN*Infinity*210.0*4.0*x^3.0+NaN*Infinity*120.0*2.0*x^1.0-NaN*Infinity*0.0*0.0-NaN*Infinity*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "NaN*Infinity*3024.0*x^5.0+NaN*Infinity*5040.0*x^6.0+NaN*Infinity*840.0*x^3.0+NaN*Infinity*240.0*x-NaN*Infinity*0.0-NaN*Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="NaN*Infinity*7.575757575757576E-4*x^12.0+NaN*Infinity*5.827505827505828E-4*x^13.0+NaN*Infinity*0.0013888888888888887*x^10.0+NaN*Infinity*0.005952380952380952*x^8.0-NaN*Infinity*0.041666666666666664*x^4.0-NaN*Infinity*4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="NaN*Infinity*7.575757575757576E-4/13.0*x^13.0+NaN*Infinity*5.827505827505828E-4/14.0*x^14.0+NaN*Infinity*0.0013888888888888887/11.0*x^11.0+NaN*Infinity*0.005952380952380952/9.0*x^9.0-NaN*Infinity*0.041666666666666664/5.0*x^5.0-NaN*Infinity*4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="NaN*Infinity*5.8275058275058275E-5*x^13.0+NaN*Infinity*4.1625041625041625E-5*x^14.0+NaN*Infinity*1.2626262626262624E-4*x^11.0+NaN*Infinity*6.613756613756613E-4*x^9.0-NaN*Infinity*0.008333333333333333*x^5.0-NaN*Infinity*1.0416666666666667*x^4.0";
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
    public static void TestCaseDiff5029() {
        //Test Case 5029
        UsageCalculus.TestCase = 5029;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values Fails for Unknown Reasons";
        UsageCalculus.EqnRegressionIntegreStatus = "All RED Including Values Fails for Unknown Reasons";
        UsageCalculus.EqnUnderTest = "2.0*NaN*x^9*Infinity+ 3.0/NaN*x^8*x*x*Infinity + 4.0*NaN*x*x*x^5*Infinity + NaN*x*2*x^4*Infinity*3.0 - NaN*x*Infinity/25.0 - NaN*25.0*Infinity/25";
        UsageCalculus.TestCaseName = "Simple: Multiple x variables in 1 term";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 2;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "NaN*Infinity*2.0*x^9.0+1.0/NaN*Infinity*3.0*x^10.0+NaN*Infinity*4.0*x^7.0+NaN*Infinity*6.0*x^5.0-NaN*Infinity/25.0*x-NaN*Infinity";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "NaN*Infinity*2.0*9.0*x^8.0+1.0/NaN*Infinity*3.0*10.0*x^9.0+NaN*Infinity*4.0*7.0*x^6.0+NaN*Infinity*6.0*5.0*x^4.0-NaN*Infinity/25.0-NaN*Infinity*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "NaN*Infinity*18.0*x^8.0+1.0/NaN*Infinity*30.0*x^9.0+NaN*Infinity*28.0*x^6.0+NaN*Infinity*30.0*x^4.0-NaN*Infinity/25.0-NaN*Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="NaN*Infinity*2.0*x^9.0+1.0/NaN*Infinity*3.0*x^10.0+NaN*Infinity*4.0*x^7.0+NaN*Infinity*6.0*x^5.0-NaN*Infinity/25.0*x-NaN*Infinity";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="NaN*Infinity*2.0/10.0*x^10.0+1.0/NaN*Infinity*3.0*Infinity*3.0/11.0*x^11.0+NaN*Infinity*4.0/8.0*x^8.0+NaN*Infinity*6.0/6.0*x^6.0-NaN*Infinity/25.0/2.0*x^2.0-NaN*Infinity*x";
        UsageCalculus.EqnSolArrayMap4[1]="NaN*Infinity/5.0*x^10.0+1.0/NaN*Infinity*Infinity*0.8181818181818182*x^11.0+NaN*Infinity*0.5*x^8.0+NaN*Infinity*x^6.0-NaN*Infinity*0.02*x^2.0-NaN*Infinity*x";
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
    public static void TestCaseDiff5030() {
    //CoPilotEqnBasic 3082
 UsageCalculus.TestCase = 5030;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1.0/1.0*0.0+18/xyzxyzxyzxyzxyzxyz^83-17*xyzxyzxyzxyzxyzxy^-84+16*xyzxyzxyzxyzxyzx^85+15/xyzxyzxyzxyzxyz^86-14*xyzxyzxyzxyzxy^-87+13+12/xyzxyzxyzxyz^89-11*xyzxyzxyzxy^-90+10*xyzxyzxyzx^91+9/xyzxyzxyz^92-8*xyzxyzxy^-93+7+6/xyzxyz^95-5*xyzxy^-96+4*xyzx^97+3/xyz^98-2*xy^-99";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyzx";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "18.0-17.0+16.0+15.0-14.0+13.0+12.0-11.0+10.0+9.0-8.0+7.0+6.0-5.0+4.0*xyzx^97.0+1.0/xyz^98.0*3.0-xy^-99.0*2.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0-17.0*0.0+16.0*0.0+15.0*0.0-14.0*0.0+13.0*0.0+12.0*0.0-11.0*0.0+10.0*0.0+9.0*0.0-8.0*0.0+7.0*0.0+6.0*0.0-5.0*0.0+4.0*97.0*xyzx^96.0+1.0/xyz^98.0*3.0*0.0-xy^-99.0*2.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "388.0*xyzx^96.0+1.0/xyz^98.0*0.0-xy^-99.0*0.0";
 UsageCalculus.EqnSolArrayMap3[1] = "18.0-17.0+16.0+15.0-14.0+13.0+12.0-11.0+10.0+9.0-8.0+7.0+6.0-5.0+4.0*xyzx^97.0+1.0/xyz^98.0*3.0-xy^-99.0*2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "18.0*xyzx-17.0*xyzx+16.0*xyzx+15.0*xyzx-14.0*xyzx+13.0*xyzx+12.0*xyzx-11.0*xyzx+10.0*xyzx+9.0*xyzx-8.0*xyzx+7.0*xyzx+6.0*xyzx-5.0*xyzx+4.0/98.0*xyzx^98.0+1.0/xyz^98.0*3.0*xyzx-xy^-99.0*2.0*xyzx";
 UsageCalculus.EqnSolArrayMap4[1] = "18.0*xyzx-17.0*xyzx+16.0*xyzx+15.0*xyzx-14.0*xyzx+13.0*xyzx+12.0*xyzx-11.0*xyzx+10.0*xyzx+9.0*xyzx-8.0*xyzx+7.0*xyzx+6.0*xyzx-5.0*xyzx+1.0/24.5*xyzx^98.0+1.0/xyz^98.0*3.0*xyzx-xy^-99.0*2.0*xyzx";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "388.0*xyzx^96.0+1.0/xyz^98.0*0.0-xy^-99.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "388.0*96.0*xyzx^95.0+1.0/xyz^98.0*0.0*0.0-xy^-99.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[2] = "37248.0*xyzx^95.0+1.0/xyz^98.0*0.0-xy^-99.0*0.0";
 UsageCalculus.EqnSolArrayMap3[2] = "18.0*xyzx-17.0*xyzx+16.0*xyzx+15.0*xyzx-14.0*xyzx+13.0*xyzx+12.0*xyzx-11.0*xyzx+10.0*xyzx+9.0*xyzx-8.0*xyzx+7.0*xyzx+6.0*xyzx-5.0*xyzx+1.0/24.5*xyzx^98.0+1.0/xyz^98.0*3.0*xyzx-xy^-99.0*2.0*xyzx";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "18.0/2.0*xyzx^2.0-17.0/2.0*xyzx^2.0+16.0/2.0*xyzx^2.0+15.0/2.0*xyzx^2.0-14.0/2.0*xyzx^2.0+13.0/2.0*xyzx^2.0+12.0/2.0*xyzx^2.0-11.0/2.0*xyzx^2.0+10.0/2.0*xyzx^2.0+9.0/2.0*xyzx^2.0-8.0/2.0*xyzx^2.0+7.0/2.0*xyzx^2.0+6.0/2.0*xyzx^2.0-5.0/2.0*xyzx^2.0+1.0/24.5/99.0*xyzx^99.0+1.0/xyz^98.0*3.0/2.0*xyzx^2.0-xy^-99.0*xyzx^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "9.0*xyzx^2.0-8.5*xyzx^2.0+8.0*xyzx^2.0+7.5*xyzx^2.0-7.0*xyzx^2.0+6.5*xyzx^2.0+6.0*xyzx^2.0-5.5*xyzx^2.0+5.0*xyzx^2.0+4.5*xyzx^2.0-4.0*xyzx^2.0+3.5*xyzx^2.0+3.0*xyzx^2.0-2.5*xyzx^2.0+1.0/2425.5*xyzx^99.0+1.0/xyz^98.0*1.5*xyzx^2.0-xy^-99.0*xyzx^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "37248.0*xyzx^95.0+1.0/xyz^98.0*0.0-xy^-99.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "37248.0*95.0*xyzx^94.0+1.0/xyz^98.0*0.0*0.0-xy^-99.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[3] = "3538560.0*xyzx^94.0+1.0/xyz^98.0*0.0-xy^-99.0*0.0";
 UsageCalculus.EqnSolArrayMap3[3] = "9.0*xyzx^2.0-8.5*xyzx^2.0+8.0*xyzx^2.0+7.5*xyzx^2.0-7.0*xyzx^2.0+6.5*xyzx^2.0+6.0*xyzx^2.0-5.5*xyzx^2.0+5.0*xyzx^2.0+4.5*xyzx^2.0-4.0*xyzx^2.0+3.5*xyzx^2.0+3.0*xyzx^2.0-2.5*xyzx^2.0+1.0/2425.5*xyzx^99.0+1.0/xyz^98.0*1.5*xyzx^2.0-xy^-99.0*xyzx^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "9.0/3.0*xyzx^3.0-8.5/3.0*xyzx^3.0+8.0/3.0*xyzx^3.0+7.5/3.0*xyzx^3.0-7.0/3.0*xyzx^3.0+6.5/3.0*xyzx^3.0+6.0/3.0*xyzx^3.0-5.5/3.0*xyzx^3.0+5.0/3.0*xyzx^3.0+4.5/3.0*xyzx^3.0-4.0/3.0*xyzx^3.0+3.5/3.0*xyzx^3.0+3.0/3.0*xyzx^3.0-2.5/3.0*xyzx^3.0+1.0/2425.5/100.0*xyzx^100.0+1.0/xyz^98.0*1.5/3.0*xyzx^3.0-xy^-99.0/3.0*xyzx^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "3.0*xyzx^3.0-2.8333333333333335*xyzx^3.0+2.6666666666666665*xyzx^3.0+2.5*xyzx^3.0-2.3333333333333335*xyzx^3.0+2.1666666666666665*xyzx^3.0+2.0*xyzx^3.0-1.8333333333333333*xyzx^3.0+1.6666666666666667*xyzx^3.0+1.5*xyzx^3.0-1.3333333333333333*xyzx^3.0+1.1666666666666667*xyzx^3.0+xyzx^3.0-1.0/1.2*xyzx^3.0+1.0/242550.0*xyzx^100.0+1.0/xyz^98.0*0.5*xyzx^3.0-xy^-99.0/3.0*xyzx^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "3538560.0*xyzx^94.0+1.0/xyz^98.0*0.0-xy^-99.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "3538560.0*94.0*xyzx^93.0+1.0/xyz^98.0*0.0*0.0-xy^-99.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "3.3262464E8*xyzx^93.0+1.0/xyz^98.0*0.0-xy^-99.0*0.0";
 UsageCalculus.EqnSolArrayMap3[4] = "3.0*xyzx^3.0-2.8333333333333335*xyzx^3.0+2.6666666666666665*xyzx^3.0+2.5*xyzx^3.0-2.3333333333333335*xyzx^3.0+2.1666666666666665*xyzx^3.0+2.0*xyzx^3.0-1.8333333333333333*xyzx^3.0+1.6666666666666667*xyzx^3.0+1.5*xyzx^3.0-1.3333333333333333*xyzx^3.0+1.1666666666666667*xyzx^3.0+xyzx^3.0-1.0/1.2*xyzx^3.0+1.0/242550.0*xyzx^100.0+1.0/xyz^98.0*0.5*xyzx^3.0-xy^-99.0/3.0*xyzx^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "3.0/4.0*xyzx^4.0-2.8333333333333335/4.0*xyzx^4.0+2.6666666666666665/4.0*xyzx^4.0+2.5/4.0*xyzx^4.0-2.3333333333333335/4.0*xyzx^4.0+2.1666666666666665/4.0*xyzx^4.0+2.0/4.0*xyzx^4.0-1.8333333333333333/4.0*xyzx^4.0+1.6666666666666667/4.0*xyzx^4.0+1.5/4.0*xyzx^4.0-1.3333333333333333/4.0*xyzx^4.0+1.1666666666666667/4.0*xyzx^4.0+1.0/4.0*xyzx^4.0-1.0/1.2/4.0*xyzx^4.0+1.0/242550.0/101.0*xyzx^101.0+1.0/xyz^98.0*0.5/4.0*xyzx^4.0-xy^-99.0*3.0/4.0*xyzx^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/1.3333333333333333*xyzx^4.0-1.0/1.4117647058823528*xyzx^4.0+1.0/1.5*xyzx^4.0+1.0/1.6*xyzx^4.0-1.0/1.7142857142857142*xyzx^4.0+1.0/1.8461538461538463*xyzx^4.0+1.0/2.0*xyzx^4.0-1.0/2.181818181818182*xyzx^4.0+1.0/2.4*xyzx^4.0+1.0/2.6666666666666665*xyzx^4.0-1.0/3.0*xyzx^4.0+1.0/3.4285714285714284*xyzx^4.0+1.0/4.0*xyzx^4.0-1.0/4.8*xyzx^4.0+1.0/2.449755E7*xyzx^101.0+1.0/xyz^98.0*0.125*xyzx^4.0-xy^-99.0/12.0*xyzx^4.0";
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
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}
    public static void TestCaseDiff5031() {
 UsageCalculus.TestCase = 5031;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+18.0/xyzxyzxyzxyzxyzxyz^83-17*xyzxyzxyzxyzxyzxy^-84+16*xyzxyzxyzxyzxyzx^85+15/xyzxyzxyzxyzxyz^86-14*xyzxyzxyzxyzxy^-87+13+12/xyzxyzxyzxyz^89-11*xyzxyzxyzxy^-90+10*xyzxyzxyzx^91+9/xyzxyzxyz^92-8*xyzxyzxy^-93+7";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyzx";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "18.0-17.0+16.0+15.0-14.0+13.0+12.0-11.0+10.0+9.0-8.0+7.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0-17.0*0.0+16.0*0.0+15.0*0.0-14.0*0.0+13.0*0.0+12.0*0.0-11.0*0.0+10.0*0.0+9.0*0.0-8.0*0.0+7.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "18.0-17.0+16.0+15.0-14.0+13.0+12.0-11.0+10.0+9.0-8.0+7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "18.0*xyzx-17.0*xyzx+16.0*xyzx+15.0*xyzx-14.0*xyzx+13.0*xyzx+12.0*xyzx-11.0*xyzx+10.0*xyzx+9.0*xyzx-8.0*xyzx+7.0*xyzx";
 UsageCalculus.EqnSolArrayMap4[1] = "18.0*xyzx-17.0*xyzx+16.0*xyzx+15.0*xyzx-14.0*xyzx+13.0*xyzx+12.0*xyzx-11.0*xyzx+10.0*xyzx+9.0*xyzx-8.0*xyzx+7.0*xyzx";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "18.0*xyzx-17.0*xyzx+16.0*xyzx+15.0*xyzx-14.0*xyzx+13.0*xyzx+12.0*xyzx-11.0*xyzx+10.0*xyzx+9.0*xyzx-8.0*xyzx+7.0*xyzx";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "18.0/2.0*xyzx^2.0-17.0/2.0*xyzx^2.0+16.0/2.0*xyzx^2.0+15.0/2.0*xyzx^2.0-14.0/2.0*xyzx^2.0+13.0/2.0*xyzx^2.0+12.0/2.0*xyzx^2.0-11.0/2.0*xyzx^2.0+10.0/2.0*xyzx^2.0+9.0/2.0*xyzx^2.0-8.0/2.0*xyzx^2.0+7.0/2.0*xyzx^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "9.0*xyzx^2.0-8.5*xyzx^2.0+8.0*xyzx^2.0+7.5*xyzx^2.0-7.0*xyzx^2.0+6.5*xyzx^2.0+6.0*xyzx^2.0-5.5*xyzx^2.0+5.0*xyzx^2.0+4.5*xyzx^2.0-4.0*xyzx^2.0+3.5*xyzx^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "9.0*xyzx^2.0-8.5*xyzx^2.0+8.0*xyzx^2.0+7.5*xyzx^2.0-7.0*xyzx^2.0+6.5*xyzx^2.0+6.0*xyzx^2.0-5.5*xyzx^2.0+5.0*xyzx^2.0+4.5*xyzx^2.0-4.0*xyzx^2.0+3.5*xyzx^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "9.0/3.0*xyzx^3.0-8.5/3.0*xyzx^3.0+8.0/3.0*xyzx^3.0+7.5/3.0*xyzx^3.0-7.0/3.0*xyzx^3.0+6.5/3.0*xyzx^3.0+6.0/3.0*xyzx^3.0-5.5/3.0*xyzx^3.0+5.0/3.0*xyzx^3.0+4.5/3.0*xyzx^3.0-4.0/3.0*xyzx^3.0+3.5/3.0*xyzx^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "3.0*xyzx^3.0-2.8333333333333335*xyzx^3.0+2.6666666666666665*xyzx^3.0+2.5*xyzx^3.0-2.3333333333333335*xyzx^3.0+2.1666666666666665*xyzx^3.0+2.0*xyzx^3.0-1.8333333333333333*xyzx^3.0+1.6666666666666667*xyzx^3.0+1.5*xyzx^3.0-1.3333333333333333*xyzx^3.0+1.1666666666666667*xyzx^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "3.0*xyzx^3.0-2.8333333333333335*xyzx^3.0+2.6666666666666665*xyzx^3.0+2.5*xyzx^3.0-2.3333333333333335*xyzx^3.0+2.1666666666666665*xyzx^3.0+2.0*xyzx^3.0-1.8333333333333333*xyzx^3.0+1.6666666666666667*xyzx^3.0+1.5*xyzx^3.0-1.3333333333333333*xyzx^3.0+1.1666666666666667*xyzx^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "3.0/4.0*xyzx^4.0-2.8333333333333335/4.0*xyzx^4.0+2.6666666666666665/4.0*xyzx^4.0+2.5/4.0*xyzx^4.0-2.3333333333333335/4.0*xyzx^4.0+2.1666666666666665/4.0*xyzx^4.0+2.0/4.0*xyzx^4.0-1.8333333333333333/4.0*xyzx^4.0+1.6666666666666667/4.0*xyzx^4.0+1.5/4.0*xyzx^4.0-1.3333333333333333/4.0*xyzx^4.0+1.1666666666666667/4.0*xyzx^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/1.3333333333333333*xyzx^4.0-1.0/1.4117647058823528*xyzx^4.0+1.0/1.5*xyzx^4.0+1.0/1.6*xyzx^4.0-1.0/1.7142857142857142*xyzx^4.0+1.0/1.8461538461538463*xyzx^4.0+1.0/2.0*xyzx^4.0-1.0/2.181818181818182*xyzx^4.0+1.0/2.4*xyzx^4.0+1.0/2.6666666666666665*xyzx^4.0-1.0/3.0*xyzx^4.0+1.0/3.4285714285714284*xyzx^4.0";
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
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}
    public static void TestCaseDiff5032() {
 UsageCalculus.TestCase = 5032;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-14.0*xyzxyzxyzxyzxy^-87+13+12/xyzxyzxyzxyz^89-11*xyzxyzxyzxy^-90+10*xyzxyzxyzx^91+9/xyzxyzxyz^92-8*xyzxyzxy^-93+7+6/xyzxyz^95-5*xyzxy^-96+4*xyzx^97+3/xyz^98";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyzx";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-14.0+13.0+12.0-11.0+10.0+9.0-8.0+7.0+6.0-5.0+4.0*xyzx^97.0+1.0/xyz^98.0*3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0+13.0*0.0+12.0*0.0-11.0*0.0+10.0*0.0+9.0*0.0-8.0*0.0+7.0*0.0+6.0*0.0-5.0*0.0+4.0*97.0*xyzx^96.0+1.0/xyz^98.0*3.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "388.0*xyzx^96.0+1.0/xyz^98.0*0.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-14.0+13.0+12.0-11.0+10.0+9.0-8.0+7.0+6.0-5.0+4.0*xyzx^97.0+1.0/xyz^98.0*3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-14.0*xyzx+13.0*xyzx+12.0*xyzx-11.0*xyzx+10.0*xyzx+9.0*xyzx-8.0*xyzx+7.0*xyzx+6.0*xyzx-5.0*xyzx+4.0/98.0*xyzx^98.0+1.0/xyz^98.0*3.0*xyzx";
 UsageCalculus.EqnSolArrayMap4[1] = "-14.0*xyzx+13.0*xyzx+12.0*xyzx-11.0*xyzx+10.0*xyzx+9.0*xyzx-8.0*xyzx+7.0*xyzx+6.0*xyzx-5.0*xyzx+1.0/24.5*xyzx^98.0+1.0/xyz^98.0*3.0*xyzx";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "388.0*xyzx^96.0+1.0/xyz^98.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "388.0*96.0*xyzx^95.0+1.0/xyz^98.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[2] = "37248.0*xyzx^95.0+1.0/xyz^98.0*0.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-14.0*xyzx+13.0*xyzx+12.0*xyzx-11.0*xyzx+10.0*xyzx+9.0*xyzx-8.0*xyzx+7.0*xyzx+6.0*xyzx-5.0*xyzx+1.0/24.5*xyzx^98.0+1.0/xyz^98.0*3.0*xyzx";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-14.0/2.0*xyzx^2.0+13.0/2.0*xyzx^2.0+12.0/2.0*xyzx^2.0-11.0/2.0*xyzx^2.0+10.0/2.0*xyzx^2.0+9.0/2.0*xyzx^2.0-8.0/2.0*xyzx^2.0+7.0/2.0*xyzx^2.0+6.0/2.0*xyzx^2.0-5.0/2.0*xyzx^2.0+1.0/24.5/99.0*xyzx^99.0+1.0/xyz^98.0*3.0/2.0*xyzx^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-7.0*xyzx^2.0+6.5*xyzx^2.0+6.0*xyzx^2.0-5.5*xyzx^2.0+5.0*xyzx^2.0+4.5*xyzx^2.0-4.0*xyzx^2.0+3.5*xyzx^2.0+3.0*xyzx^2.0-2.5*xyzx^2.0+1.0/2425.5*xyzx^99.0+1.0/xyz^98.0*1.5*xyzx^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "37248.0*xyzx^95.0+1.0/xyz^98.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "37248.0*95.0*xyzx^94.0+1.0/xyz^98.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[3] = "3538560.0*xyzx^94.0+1.0/xyz^98.0*0.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-7.0*xyzx^2.0+6.5*xyzx^2.0+6.0*xyzx^2.0-5.5*xyzx^2.0+5.0*xyzx^2.0+4.5*xyzx^2.0-4.0*xyzx^2.0+3.5*xyzx^2.0+3.0*xyzx^2.0-2.5*xyzx^2.0+1.0/2425.5*xyzx^99.0+1.0/xyz^98.0*1.5*xyzx^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-7.0/3.0*xyzx^3.0+6.5/3.0*xyzx^3.0+6.0/3.0*xyzx^3.0-5.5/3.0*xyzx^3.0+5.0/3.0*xyzx^3.0+4.5/3.0*xyzx^3.0-4.0/3.0*xyzx^3.0+3.5/3.0*xyzx^3.0+3.0/3.0*xyzx^3.0-2.5/3.0*xyzx^3.0+1.0/2425.5/100.0*xyzx^100.0+1.0/xyz^98.0*1.5/3.0*xyzx^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-2.3333333333333335*xyzx^3.0+2.1666666666666665*xyzx^3.0+2.0*xyzx^3.0-1.8333333333333333*xyzx^3.0+1.6666666666666667*xyzx^3.0+1.5*xyzx^3.0-1.3333333333333333*xyzx^3.0+1.1666666666666667*xyzx^3.0+xyzx^3.0-1.0/1.2*xyzx^3.0+1.0/242550.0*xyzx^100.0+1.0/xyz^98.0/2.0*xyzx^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "3538560.0*xyzx^94.0+1.0/xyz^98.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "3538560.0*94.0*xyzx^93.0+1.0/xyz^98.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "3.3262464E8*xyzx^93.0+1.0/xyz^98.0*0.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-2.3333333333333335*xyzx^3.0+2.1666666666666665*xyzx^3.0+2.0*xyzx^3.0-1.8333333333333333*xyzx^3.0+1.6666666666666667*xyzx^3.0+1.5*xyzx^3.0-1.3333333333333333*xyzx^3.0+1.1666666666666667*xyzx^3.0+xyzx^3.0-1.0/1.2*xyzx^3.0+1.0/242550.0*xyzx^100.0+1.0/xyz^98.0/2.0*xyzx^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-2.3333333333333335/4.0*xyzx^4.0+2.1666666666666665/4.0*xyzx^4.0+2.0/4.0*xyzx^4.0-1.8333333333333333/4.0*xyzx^4.0+1.6666666666666667/4.0*xyzx^4.0+1.5/4.0*xyzx^4.0-1.3333333333333333/4.0*xyzx^4.0+1.1666666666666667/4.0*xyzx^4.0+1.0/4.0*xyzx^4.0-1.0/1.2/4.0*xyzx^4.0+1.0/242550.0/101.0*xyzx^101.0+1.0/xyz^98.0/2.0/4.0*xyzx^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/1.7142857142857142*xyzx^4.0+1.0/1.8461538461538463*xyzx^4.0+1.0/2.0*xyzx^4.0-1.0/2.181818181818182*xyzx^4.0+1.0/2.4*xyzx^4.0+1.0/2.6666666666666665*xyzx^4.0-1.0/3.0*xyzx^4.0+1.0/3.4285714285714284*xyzx^4.0+1.0/4.0*xyzx^4.0-1.0/4.8*xyzx^4.0+1.0/2.449755E7*xyzx^101.0+1.0/xyz^98.0/8.0*xyzx^4.0";
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
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}
    public static void TestCaseDiff5033() {
 UsageCalculus.TestCase = 5033;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+10.0*xyzxyzxyzx^91+9/xyzxyzxyz^92-8*xyzxyzxy^-93+7+6/xyzxyz^95-5*xyzxy^-96+4*xyzx^97+3/xyz^98-2*xy^-99";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyzx";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "10.0+9.0-8.0+7.0+6.0-5.0+4.0*xyzx^97.0+1.0/xyz^98.0*3.0-xy^-99.0*2.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+9.0*0.0-8.0*0.0+7.0*0.0+6.0*0.0-5.0*0.0+4.0*97.0*xyzx^96.0+1.0/xyz^98.0*3.0*0.0-xy^-99.0*2.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "388.0*xyzx^96.0+1.0/xyz^98.0*0.0-xy^-99.0*0.0";
 UsageCalculus.EqnSolArrayMap3[1] = "10.0+9.0-8.0+7.0+6.0-5.0+4.0*xyzx^97.0+1.0/xyz^98.0*3.0-xy^-99.0*2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "10.0*xyzx+9.0*xyzx-8.0*xyzx+7.0*xyzx+6.0*xyzx-5.0*xyzx+4.0/98.0*xyzx^98.0+1.0/xyz^98.0*3.0*xyzx-xy^-99.0*2.0*xyzx";
 UsageCalculus.EqnSolArrayMap4[1] = "10.0*xyzx+9.0*xyzx-8.0*xyzx+7.0*xyzx+6.0*xyzx-5.0*xyzx+1.0/24.5*xyzx^98.0+1.0/xyz^98.0*3.0*xyzx-xy^-99.0*2.0*xyzx";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "388.0*xyzx^96.0+1.0/xyz^98.0*0.0-xy^-99.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "388.0*96.0*xyzx^95.0+1.0/xyz^98.0*0.0*0.0-xy^-99.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[2] = "37248.0*xyzx^95.0+1.0/xyz^98.0*0.0-xy^-99.0*0.0";
 UsageCalculus.EqnSolArrayMap3[2] = "10.0*xyzx+9.0*xyzx-8.0*xyzx+7.0*xyzx+6.0*xyzx-5.0*xyzx+1.0/24.5*xyzx^98.0+1.0/xyz^98.0*3.0*xyzx-xy^-99.0*2.0*xyzx";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "10.0/2.0*xyzx^2.0+9.0/2.0*xyzx^2.0-8.0/2.0*xyzx^2.0+7.0/2.0*xyzx^2.0+6.0/2.0*xyzx^2.0-5.0/2.0*xyzx^2.0+1.0/24.5/99.0*xyzx^99.0+1.0/xyz^98.0*3.0/2.0*xyzx^2.0-xy^-99.0*xyzx^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "5.0*xyzx^2.0+4.5*xyzx^2.0-4.0*xyzx^2.0+3.5*xyzx^2.0+3.0*xyzx^2.0-2.5*xyzx^2.0+1.0/2425.5*xyzx^99.0+1.0/xyz^98.0*1.5*xyzx^2.0-xy^-99.0*xyzx^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "37248.0*xyzx^95.0+1.0/xyz^98.0*0.0-xy^-99.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "37248.0*95.0*xyzx^94.0+1.0/xyz^98.0*0.0*0.0-xy^-99.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[3] = "3538560.0*xyzx^94.0+1.0/xyz^98.0*0.0-xy^-99.0*0.0";
 UsageCalculus.EqnSolArrayMap3[3] = "5.0*xyzx^2.0+4.5*xyzx^2.0-4.0*xyzx^2.0+3.5*xyzx^2.0+3.0*xyzx^2.0-2.5*xyzx^2.0+1.0/2425.5*xyzx^99.0+1.0/xyz^98.0*1.5*xyzx^2.0-xy^-99.0*xyzx^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "5.0/3.0*xyzx^3.0+4.5/3.0*xyzx^3.0-4.0/3.0*xyzx^3.0+3.5/3.0*xyzx^3.0+3.0/3.0*xyzx^3.0-2.5/3.0*xyzx^3.0+1.0/2425.5/100.0*xyzx^100.0+1.0/xyz^98.0*1.5/3.0*xyzx^3.0-xy^-99.0/3.0*xyzx^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.6666666666666667*xyzx^3.0+1.5*xyzx^3.0-1.3333333333333333*xyzx^3.0+1.1666666666666667*xyzx^3.0+xyzx^3.0-1.0/1.2*xyzx^3.0+1.0/242550.0*xyzx^100.0+1.0/xyz^98.0*0.5*xyzx^3.0-xy^-99.0/3.0*xyzx^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "3538560.0*xyzx^94.0+1.0/xyz^98.0*0.0-xy^-99.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "3538560.0*94.0*xyzx^93.0+1.0/xyz^98.0*0.0*0.0-xy^-99.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "3.3262464E8*xyzx^93.0+1.0/xyz^98.0*0.0-xy^-99.0*0.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.6666666666666667*xyzx^3.0+1.5*xyzx^3.0-1.3333333333333333*xyzx^3.0+1.1666666666666667*xyzx^3.0+xyzx^3.0-1.0/1.2*xyzx^3.0+1.0/242550.0*xyzx^100.0+1.0/xyz^98.0*0.5*xyzx^3.0-xy^-99.0/3.0*xyzx^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.6666666666666667/4.0*xyzx^4.0+1.5/4.0*xyzx^4.0-1.3333333333333333/4.0*xyzx^4.0+1.1666666666666667/4.0*xyzx^4.0+1.0/4.0*xyzx^4.0-1.0/1.2/4.0*xyzx^4.0+1.0/242550.0/101.0*xyzx^101.0+1.0/xyz^98.0*0.5/4.0*xyzx^4.0-xy^-99.0/3.0/4.0*xyzx^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/2.4*xyzx^4.0+1.0/2.6666666666666665*xyzx^4.0-1.0/3.0*xyzx^4.0+1.0/3.4285714285714284*xyzx^4.0+1.0/4.0*xyzx^4.0-1.0/4.8*xyzx^4.0+1.0/2.449755E7*xyzx^101.0+1.0/xyz^98.0*0.125*xyzx^4.0-xy^-99.0/12.0*xyzx^4.0";
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
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}
}
