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
import static Calculus.UsageCalculus.KnownIssueTestCasesFlag;
import static Calculus.UsageCalculus.CoreKnownIssuesTestCasesFlag;
import static Calculus.UsageCalculus.KnownIssues;
import static Calculus.UsageCalculus.KnownIssuesTestCases;

/**
 *
 * @author Rajesh V Pai
 */
public class TestHarnessCoefficients {
    //Coefficients Test Cases
    public static void Coefficients(String AlgoName,long j){
        if(((!RunAllTestCasesFlag)&&(IgnoreKnownIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainIntegrTest"))&&(IntegralGapInfinity(j)))
                ||((!RunAllTestCasesFlag)&&(IgnoreKnownIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainDiffTest"))&&(DifferentialGapInfinity(j))) )
        {
            KnownIssueTestCasesFlag=true;
            KnownIssues++;
            KnownIssuesTestCases.put(KnownIssues, "" + j);
            System.out.println(ConsoleColors.RED +"Coefficients TestCase:j= " + j  + ": Infinite Loop GAP" + ConsoleColors.RESET);
        }
        else if(((!RunAllTestCasesFlag)&&(IgnoreKnownIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainIntegrTest"))&&(IntegralGapException(j)))
                ||((!RunAllTestCasesFlag)&&(IgnoreKnownIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainDiffTest"))&&(DifferentialGapException(j))) )
        {
            KnownIssueTestCasesFlag=true;
            KnownIssues++;
            KnownIssuesTestCases.put(KnownIssues, "" + j);
            System.out.println(ConsoleColors.RED +"Coefficients TestCase:j= " + j  + ": Exception GAP" + ConsoleColors.RESET);
        }else if( ( (!RunAllTestCasesFlag)&&(IgnoreCoreIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainIntegrTest"))&&(TrueIntegralGapInfinity(j)))
                ||( (!RunAllTestCasesFlag)&&(IgnoreCoreIssuesFlag==false) && (AlgoName.equalsIgnoreCase("mainDiffTest"))&&(TrueDifferentialGapInfinity(j))) )
        {
             CoreKnownIssuesTestCasesFlag=true;
             CoreKnownIssues ++;
             System.out.println(ConsoleColors.RED +"Coefficients TestCase:j= " + j  + ": Infinite Loop GAP" + ConsoleColors.RESET);
        }
        else if(((!RunAllTestCasesFlag)&&(IgnoreCoreIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainIntegrTest"))&&(TrueIntegralGapException(j)))
                ||((!RunAllTestCasesFlag)&&(IgnoreCoreIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainDiffTest"))&&(TrueDifferentialGapException(j))) )
        {   
             CoreKnownIssuesTestCasesFlag=true;
             CoreKnownIssues ++;
             System.out.println(ConsoleColors.RED +"Coefficients TestCase:j= " + j  + ": Exception GAP" + ConsoleColors.RESET);
        }
        else {
        switch((int)j){
            case 20001:
                TestCaseDiff20001();
                break;
            case 20002:
                TestCaseDiff20002();
                break;
            case 20003:
                TestCaseDiff20003();
                break;
            case 20004:
                TestCaseDiff20004();
                break;
            case 20005:
                TestCaseDiff20005();
                break;
            case 20006:
                TestCaseDiff20006();
                break;
            case 20007:
                TestCaseDiff20007();
                break;
            case 20008:
                TestCaseDiff20008();
                break;
            case 20009:
                TestCaseDiff20009();
                break;
            case 20010:
                TestCaseDiff20010();
                break;
            case 20011:
                TestCaseDiff20011();
                break;
            case 20012:
                TestCaseDiff20012();
                break;
            case 20013:
                TestCaseDiff20013();
                break;
            case 20014:
                TestCaseDiff20014();
                break;
            case 20015:
                TestCaseDiff20015();
                break;
            case 20016:
                TestCaseDiff20016();
                break;
            case 20017:
                TestCaseDiff20017();
                break;
            case 20018:
                TestCaseDiff20018();
                break;
            case 20019:
                TestCaseDiff20019();
                break;
            case 20020:
                TestCaseDiff20020();
                break;
            case 20021:
                TestCaseDiff20021();
                break;
            case 20022:
                TestCaseDiff20022();
                break;
            case 20023:
                TestCaseDiff20023();
                break;
            case 20024:
                TestCaseDiff20024();
                break;
            case 20025:
                TestCaseDiff20025();
                break;
            case 20026:
                TestCaseDiff20026();
                break;
            case 20027:
                TestCaseDiff20027();
                break;
            case 20028:
                TestCaseDiff20028();
                break;
            case 20029:
                TestCaseDiff20029();
                break;
            case 20030:
                TestCaseDiff20030();
                break;
            case 20031:
                TestCaseDiff20031();
                break;
            case 20032:
                TestCaseDiff20032();
                break;
            case 20033:
                TestCaseDiff20033();
                break;
            case 20034:
                TestCaseDiff20034();
                break;
            case 20035:
                TestCaseDiff20035();
                break;
            case 20036:
                TestCaseDiff20036();
                break;
            case 20037:
                TestCaseDiff20037();
                break;
            case 20038:
                TestCaseDiff20038();
                break;
            case 20039:
                TestCaseDiff20039();
                break;
            case 20040:
                TestCaseDiff20040();
                break;
            case 20041:
                TestCaseDiff20041();
                break;
            case 20042:
                TestCaseDiff20042();
                break;
            case 20043:
                TestCaseDiff20043();
                break;
            case 20044:
                TestCaseDiff20044();
                break;
            case 20045:
                TestCaseDiff20045();
                break;
            case 20046:
                TestCaseDiff20046();
                break;
            case 20047:
                TestCaseDiff20047();
                break;
            case 20048:
                TestCaseDiff20048();
                break;
            case 20049:
                TestCaseDiff20049();
                break;
            case 20050:
                TestCaseDiff20050();
                break;
            case 20051:
                TestCaseDiff20051();
                break;
            case 20052:
                TestCaseDiff20052();
                break;
            case 20053:
                TestCaseDiff20053();
                break;
            case 20054:
                TestCaseDiff20054();
                break;
            case 20055:
                TestCaseDiff20055();
                break;
            case 20056:
                TestCaseDiff20056();
                break;
            case 20057:
                TestCaseDiff20057();
                break;
            case 20058:
                TestCaseDiff20058();
                break;
            case 20059:
               TestCaseDiff20059();
               break;
            case 20060:
                TestCaseDiff20060();
                break;    
            case 20061:
                TestCaseDiff20061();
                break;
            case 20062:
                TestCaseDiff20062();
                break;
            case 20063:
                TestCaseDiff20063();
                break;
            case 20064:
                TestCaseDiff20064();
                break;
            case 20065:
                TestCaseDiff20065();
                break;
            case 20066:
                TestCaseDiff20066();
                break;
            case 20067:
                TestCaseDiff20067();
                break;
            case 20068:
                TestCaseDiff20068();
                break;
            case 20069:
                TestCaseDiff20069();
                break;
            default:
                System.out.println(ConsoleColors.RED +"Coefficients TestCase:j= " + j  + ": Gap" + ConsoleColors.RESET);
                break;
    }
        }
    }
    /* **************************************** */
    //Structured Testing
    /* **************************************** */
    /* **************************************** */
    /* ***************Coefficients***************** */
    /* **************************************** */
        
        public static void TestCaseDiff20001() {
        //Test Case 20001
        UsageCalculus.TestCase = 20001;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*0.0*x^8 + 0.0*x^5 + 0.0*x^4 - 0.0*x- 25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:0.0";
        UsageCalculus.TestCaseMatrixID="Coefficients:0.0:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "0.0*x^8.0+0.0*x^5.0+0.0*x^4.0-0.0*x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+0.0+0.0-0.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "";
        UsageCalculus.EqnSolArrayMap3[1]="0.0*x^8.0+0.0*x^5.0+0.0*x^4.0-0.0*x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="0.0/9.0*x^9.0+0.0/6.0*x^6.0+0.0/5.0*x^5.0-0.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="0.0*x^9.0+0.0*x^6.0+0.0*x^5.0-0.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="0.0*x^9.0+0.0*x^6.0+0.0*x^5.0-0.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="0.0/10.0*x^10.0+0.0/7.0*x^7.0+0.0/6.0*x^6.0-0.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="0.0*x^10.0+0.0*x^7.0+0.0*x^6.0-0.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="0.0*x^10.0+0.0*x^7.0+0.0*x^6.0-0.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="0.0/11.0*x^11.0+0.0/8.0*x^8.0+0.0/7.0*x^7.0-0.0/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="0.0*x^11.0+0.0*x^8.0+0.0*x^7.0-0.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4]="0.0*x^11.0+0.0*x^8.0+0.0*x^7.0-0.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="0.0/12.0*x^12.0+0.0/9.0*x^9.0+0.0/8.0*x^8.0-0.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="0.0*x^12.0+0.0*x^9.0+0.0*x^8.0-0.0*x^5.0-1.0416666666666667*x^4.0";
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
        public static void TestCaseDiff20002() {
        //Test Case 20002
        UsageCalculus.TestCase = 20002;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "0*xy^8 + 0*xy^5 + 0*xy^4 - 0*xy - 25*0";
        UsageCalculus.TestCaseName = "Simple: Coefficients:0";
        UsageCalculus.TestCaseMatrixID="Coefficients:0:2 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xy";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "0.0*xy^8.0+0.0*xy^5.0+0.0*xy^4.0-0.0*xy";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+0.0+0.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "";
        UsageCalculus.EqnSolArrayMap3[1]="0.0*xy^8.0+0.0*xy^5.0+0.0*xy^4.0-0.0*xy";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="0.0/9.0*xy^9.0+0.0/6.0*xy^6.0+0.0/5.0*xy^5.0-0.0/2.0*xy^2.0";
        UsageCalculus.EqnSolArrayMap4[1]="0.0*xy^9.0+0.0*xy^6.0+0.0*xy^5.0-0.0*xy^2.0";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="0.0*xy^9.0+0.0*xy^6.0+0.0*xy^5.0-0.0*xy^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="0.0/10.0*xy^10.0+0.0/7.0*xy^7.0+0.0/6.0*xy^6.0-0.0/3.0*xy^3.0";
        UsageCalculus.EqnSolArrayMap4[2]="0.0*xy^10.0+0.0*xy^7.0+0.0*xy^6.0-0.0*xy^3.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="0.0*xy^10.0+0.0*xy^7.0+0.0*xy^6.0-0.0*xy^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="0.0/11.0*xy^11.0+0.0/8.0*xy^8.0+0.0/7.0*xy^7.0-0.0/4.0*xy^4.0";
        UsageCalculus.EqnSolArrayMap4[3]="0.0*xy^11.0+0.0*xy^8.0+0.0*xy^7.0-0.0*xy^4.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4]="0.0*xy^11.0+0.0*xy^8.0+0.0*xy^7.0-0.0*xy^4.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="0.0/12.0*xy^12.0+0.0/9.0*xy^9.0+0.0/8.0*xy^8.0-0.0/5.0*xy^5.0";
        UsageCalculus.EqnSolArrayMap4[4]="0.0*xy^12.0+0.0*xy^9.0+0.0*xy^8.0-0.0*xy^5.0";
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
        public static void TestCaseDiff20003() {
        //Test Case 20003
        UsageCalculus.TestCase = 20003;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1*xyc^8 + 1*xyc^5 + 1*xyc^4 - 1*xyc - 1*25";
        UsageCalculus.TestCaseName = "Simple: Variables:3 Letter";
        UsageCalculus.TestCaseMatrixID="Coefficients:1:3 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "xyc^8.0+xyc^5.0+xyc^4.0-xyc-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*xyc^7.0+5.0*xyc^4.0+4.0*xyc^3.0-1.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*xyc^7.0+5.0*xyc^4.0+4.0*xyc^3.0-1.0";
        UsageCalculus.EqnSolArrayMap3[1]="xyc^8.0+xyc^5.0+xyc^4.0-xyc-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/9.0*xyc^9.0+1.0/6.0*xyc^6.0+1.0/5.0*xyc^5.0-1.0/2.0*xyc^2.0-25.0*xyc";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/9.0*xyc^9.0+1.0/6.0*xyc^6.0+1.0/5.0*xyc^5.0-1.0/2.0*xyc^2.0-25.0*xyc";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*xyc^7.0+5.0*xyc^4.0+4.0*xyc^3.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*7.0*xyc^6.0+5.0*4.0*xyc^3.0+4.0*3.0*xyc^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*xyc^6.0+20.0*xyc^3.0+12.0*xyc^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/9.0*xyc^9.0+1.0/6.0*xyc^6.0+1.0/5.0*xyc^5.0-1.0/2.0*xyc^2.0-25.0*xyc";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/9.0/10.0*xyc^10.0+1.0/6.0/7.0*xyc^7.0+1.0/5.0/6.0*xyc^6.0-1.0/2.0/3.0*xyc^3.0-25.0/2.0*xyc^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/90.0*xyc^10.0+1.0/42.0*xyc^7.0+1.0/30.0*xyc^6.0-1.0/6.0*xyc^3.0-12.5*xyc^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*xyc^6.0+20.0*xyc^3.0+12.0*xyc^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*xyc^5.0+20.0*3.0*xyc^2.0+12.0*2.0*xyc^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*xyc^5.0+60.0*xyc^2.0+24.0*xyc";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/90.0*xyc^10.0+1.0/42.0*xyc^7.0+1.0/30.0*xyc^6.0-1.0/6.0*xyc^3.0-12.5*xyc^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/90.0/11.0*xyc^11.0+1.0/42.0/8.0*xyc^8.0+1.0/30.0/7.0*xyc^7.0-1.0/6.0/4.0*xyc^4.0-12.5/3.0*xyc^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/990.0*xyc^11.0+1.0/336.0*xyc^8.0+1.0/210.0*xyc^7.0-1.0/24.0*xyc^4.0-4.166666666666667*xyc^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*xyc^5.0+60.0*xyc^2.0+24.0*xyc";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*xyc^4.0+60.0*2.0*xyc^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*xyc^4.0+120.0*xyc+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/990.0*xyc^11.0+1.0/336.0*xyc^8.0+1.0/210.0*xyc^7.0-1.0/24.0*xyc^4.0-4.166666666666667*xyc^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/990.0/12.0*xyc^12.0+1.0/336.0/9.0*xyc^9.0+1.0/210.0/8.0*xyc^8.0-1.0/24.0/5.0*xyc^5.0-4.166666666666667/4.0*xyc^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/11880.0*xyc^12.0+1.0/3024.0*xyc^9.0+1.0/1680.0*xyc^8.0-1.0/120.0*xyc^5.0-1.0416666666666667*xyc^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;
        
        UsageCalculus.EqnSolArrayMap1[5] = "1680.0*xyc^4.0+120.0*xyc+24.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "1680.0*4.0*xyc^3.0+120.0+0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "6720.0*xyc^3.0+120.0";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "6720.0*xyc^3.0+120.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "6720.0*3.0*xyc^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "20160.0*xyc^2.0+";
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
        public static void TestCaseDiff20004() {
        //Test Case 20004
        UsageCalculus.TestCase = 20004;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*xyc1^8 + 1.0*xyc1^5 + 1.0*xyc1^4 - 1.0*xyc1 - 1.0*25";
        UsageCalculus.TestCaseName = "Simple: Variables:3 Letter with Numerics";
        UsageCalculus.TestCaseMatrixID="Coefficients:1.0:3 Letter with Numerics:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "xyc1^8.0+xyc1^5.0+xyc1^4.0-xyc1-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*xyc1^7.0+5.0*xyc1^4.0+4.0*xyc1^3.0-1.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*xyc1^7.0+5.0*xyc1^4.0+4.0*xyc1^3.0-1.0";
        UsageCalculus.EqnSolArrayMap3[1]="xyc1^8.0+xyc1^5.0+xyc1^4.0-xyc1-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/9.0*xyc1^9.0+1.0/6.0*xyc1^6.0+1.0/5.0*xyc1^5.0-1.0/2.0*xyc1^2.0-25.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/9.0*xyc1^9.0+1.0/6.0*xyc1^6.0+1.0/5.0*xyc1^5.0-1.0/2.0*xyc1^2.0-25.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*xyc1^7.0+5.0*xyc1^4.0+4.0*xyc1^3.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*7.0*xyc1^6.0+5.0*4.0*xyc1^3.0+4.0*3.0*xyc1^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*xyc1^6.0+20.0*xyc1^3.0+12.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/9.0*xyc1^9.0+1.0/6.0*xyc1^6.0+1.0/5.0*xyc1^5.0-1.0/2.0*xyc1^2.0-25.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/9.0/10.0*xyc1^10.0+1.0/6.0/7.0*xyc1^7.0+1.0/5.0/6.0*xyc1^6.0-1.0/2.0/3.0*xyc1^3.0-25.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/90.0*xyc1^10.0+1.0/42.0*xyc1^7.0+1.0/30.0*xyc1^6.0-1.0/6.0*xyc1^3.0-12.5*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*xyc1^6.0+20.0*xyc1^3.0+12.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*xyc1^5.0+20.0*3.0*xyc1^2.0+12.0*2.0*xyc1^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*xyc1^5.0+60.0*xyc1^2.0+24.0*xyc1";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/90.0*xyc1^10.0+1.0/42.0*xyc1^7.0+1.0/30.0*xyc1^6.0-1.0/6.0*xyc1^3.0-12.5*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/90.0/11.0*xyc1^11.0+1.0/42.0/8.0*xyc1^8.0+1.0/30.0/7.0*xyc1^7.0-1.0/6.0/4.0*xyc1^4.0-12.5/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/990.0*xyc1^11.0+1.0/336.0*xyc1^8.0+1.0/210.0*xyc1^7.0-1.0/24.0*xyc1^4.0-4.166666666666667*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*xyc1^5.0+60.0*xyc1^2.0+24.0*xyc1";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*xyc1^4.0+60.0*2.0*xyc1^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*xyc1^4.0+120.0*xyc1+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/990.0*xyc1^11.0+1.0/336.0*xyc1^8.0+1.0/210.0*xyc1^7.0-1.0/24.0*xyc1^4.0-4.166666666666667*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/990.0/12.0*xyc1^12.0+1.0/336.0/9.0*xyc1^9.0+1.0/210.0/8.0*xyc1^8.0-1.0/24.0/5.0*xyc1^5.0-4.166666666666667/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/11880.0*xyc1^12.0+1.0/3024.0*xyc1^9.0+1.0/1680.0*xyc1^8.0-1.0/120.0*xyc1^5.0-1.0416666666666667*xyc1^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;
        
        UsageCalculus.EqnSolArrayMap1[5] = "1680.0*xyc1^4.0+120.0*xyc1+24.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "1680.0*4.0*xyc1^3.0+120.0+0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "6720.0*xyc1^3.0+120.0+";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "6720.0*xyc1^3.0+120.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "6720.0*3.0*xyc1^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "20160.0*xyc1^2.0+";
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
    public static void TestCaseDiff20005() {
        //Test Case 20005
        UsageCalculus.TestCase = 20005;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "-1.0*x^8 -1.0*x^5 -1.0*x^4 -1.0*x- 25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:-1.0";
        UsageCalculus.TestCaseMatrixID="Coefficients:-1.0:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-x^8.0-x^5.0-x^4.0-x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-8.0*x^7.0-5.0*x^4.0-4.0*x^3.0-1.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-8.0*x^7.0-5.0*x^4.0-4.0*x^3.0-1.0";
        UsageCalculus.EqnSolArrayMap3[1]="-x^8.0-x^5.0-x^4.0-x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-1.0/9.0*x^9.0-1.0/6.0*x^6.0-1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="-1.0/9.0*x^9.0-1.0/6.0*x^6.0-1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-8.0*x^7.0-5.0*x^4.0-4.0*x^3.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-8.0*7.0*x^6.0-5.0*4.0*x^3.0-4.0*3.0*x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-56.0*x^6.0-20.0*x^3.0-12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="-1.0/9.0*x^9.0-1.0/6.0*x^6.0-1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-1.0/9.0/10.0*x^10.0-1.0/6.0/7.0*x^7.0-1.0/5.0/6.0*x^6.0-1.0/2.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="-1.0/90.0*x^10.0-1.0/42.0*x^7.0-1.0/30.0*x^6.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-56.0*x^6.0-20.0*x^3.0-12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-56.0*6.0*x^5.0-20.0*3.0*x^2.0-12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-336.0*x^5.0-60.0*x^2.0-24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="-1.0/90.0*x^10.0-1.0/42.0*x^7.0-1.0/30.0*x^6.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="-1.0/90.0/11.0*x^11.0-1.0/42.0/8.0*x^8.0-1.0/30.0/7.0*x^7.0-1.0/6.0/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-1.0/990.0*x^11.0-1.0/336.0*x^8.0-1.0/210.0*x^7.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-336.0*x^5.0-60.0*x^2.0-24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-336.0*5.0*x^4.0-60.0*2.0*x^1.0-24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-1680.0*x^4.0-120.0*x-24.0";
        UsageCalculus.EqnSolArrayMap3[4]="-1.0/990.0*x^11.0-1.0/336.0*x^8.0-1.0/210.0*x^7.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="-1.0/990.0/12.0*x^12.0-1.0/336.0/9.0*x^9.0-1.0/210.0/8.0*x^8.0-1.0/24.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="-1.0/11880.0*x^12.0-1.0/3024.0*x^9.0-1.0/1680.0*x^8.0-1.0/120.0*x^5.0-1.0416666666666667*x^4.0";
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
        public static void TestCaseDiff20006() {
        //Test Case 20006
        UsageCalculus.TestCase = 20006;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "-1*xy^8 -1*xy^5 -1*xy^4 -1*xy - 25*-1";
        UsageCalculus.TestCaseName = "Simple: Coefficients:-1";
        UsageCalculus.TestCaseMatrixID="Coefficients:-1:2 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xy";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-xy^8.0-xy^5.0-xy^4.0-xy+25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-8.0*xy^7.0-5.0*xy^4.0-4.0*xy^3.0-1.0+0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-8.0*xy^7.0-5.0*xy^4.0-4.0*xy^3.0-1.0";
        UsageCalculus.EqnSolArrayMap3[1]="-xy^8.0-xy^5.0-xy^4.0-xy+25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-1.0/9.0*xy^9.0-1.0/6.0*xy^6.0-1.0/5.0*xy^5.0-1.0/2.0*xy^2.0+25.0*xy";
        UsageCalculus.EqnSolArrayMap4[1]="-1.0/9.0*xy^9.0-1.0/6.0*xy^6.0-1.0/5.0*xy^5.0-1.0/2.0*xy^2.0+25.0*xy";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-8.0*xy^7.0-5.0*xy^4.0-4.0*xy^3.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-8.0*7.0*xy^6.0-5.0*4.0*xy^3.0-4.0*3.0*xy^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-56.0*xy^6.0-20.0*xy^3.0-12.0*xy^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="-1.0/9.0*xy^9.0-1.0/6.0*xy^6.0-1.0/5.0*xy^5.0-1.0/2.0*xy^2.0+25.0*xy";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-1.0/9.0/10.0*xy^10.0-1.0/6.0/7.0*xy^7.0-1.0/5.0/6.0*xy^6.0-1.0/2.0/3.0*xy^3.0+25.0/2.0*xy^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="-1.0/90.0*xy^10.0-1.0/42.0*xy^7.0-1.0/30.0*xy^6.0-1.0/6.0*xy^3.0+12.5*xy^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-56.0*xy^6.0-20.0*xy^3.0-12.0*xy^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-56.0*6.0*xy^5.0-20.0*3.0*xy^2.0-12.0*2.0*xy^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-336.0*xy^5.0-60.0*xy^2.0-24.0*xy";
        UsageCalculus.EqnSolArrayMap3[3]="-1.0/90.0*xy^10.0-1.0/42.0*xy^7.0-1.0/30.0*xy^6.0-1.0/6.0*xy^3.0+12.5*xy^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="-1.0/90.0/11.0*xy^11.0-1.0/42.0/8.0*xy^8.0-1.0/30.0/7.0*xy^7.0-1.0/6.0/4.0*xy^4.0+12.5/3.0*xy^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-1.0/990.0*xy^11.0-1.0/336.0*xy^8.0-1.0/210.0*xy^7.0-1.0/24.0*xy^4.0+4.166666666666667*xy^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-336.0*xy^5.0-60.0*xy^2.0-24.0*xy";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-336.0*5.0*xy^4.0-60.0*2.0*xy^1.0-24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-1680.0*xy^4.0-120.0*xy-24.0";
        UsageCalculus.EqnSolArrayMap3[4]="-1.0/990.0*xy^11.0-1.0/336.0*xy^8.0-1.0/210.0*xy^7.0-1.0/24.0*xy^4.0+4.166666666666667*xy^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="-1.0/990.0/12.0*xy^12.0-1.0/336.0/9.0*xy^9.0-1.0/210.0/8.0*xy^8.0-1.0/24.0/5.0*xy^5.0+4.166666666666667/4.0*xy^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="-1.0/11880.0*xy^12.0-1.0/3024.0*xy^9.0-1.0/1680.0*xy^8.0-1.0/120.0*xy^5.0+1.0416666666666667*xy^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;
        
        UsageCalculus.EqnSolArrayMap1[5] = "-1680.0*xy^4.0-120.0*xy-24.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "-1680.0*4.0*xy^3.0-120.0-0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "-1680.0*4.0*xy^3.0-120.0-0.0";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "-6720.0*xy^3.0-120.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "-6720.0*3.0*xy^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "-6720.0*3.0*xy^2.0-0.0";
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
        public static void TestCaseDiff20007() {
        //Test Case 20007
        UsageCalculus.TestCase = 20007;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "5*x^8 + 5*x^5 + 5*x^4 - 5*x- 25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:5";
        UsageCalculus.TestCaseMatrixID="Coefficients:5:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "5.0*x^8.0+5.0*x^5.0+5.0*x^4.0-5.0*x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "5.0*8.0*x^7.0+5.0*5.0*x^4.0+5.0*4.0*x^3.0-5.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "40.0*x^7.0+25.0*x^4.0+20.0*x^3.0-5.0";
        UsageCalculus.EqnSolArrayMap3[1]="5.0*x^8.0+5.0*x^5.0+5.0*x^4.0-5.0*x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="5.0/9.0*x^9.0+5.0/6.0*x^6.0+5.0/5.0*x^5.0-5.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1.8*x^9.0+1.0/1.2*x^6.0+x^5.0-2.5*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "40.0*x^7.0+25.0*x^4.0+20.0*x^3.0-5.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "40.0*7.0*x^6.0+25.0*4.0*x^3.0+20.0*3.0*x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "280.0*x^6.0+100.0*x^3.0+60.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/1.8*x^9.0+0.8333333333333334*x^6.0+x^5.0-2.5*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/1.8/10.0*x^10.0+0.8333333333333334/7.0*x^7.0+1.0/6.0*x^6.0-2.5/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/18.0*x^10.0+1.0/8.4*x^7.0+1.0/6.0*x^6.0-1.0/1.2*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "280.0*x^6.0+100.0*x^3.0+60.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "280.0*6.0*x^5.0+100.0*3.0*x^2.0+60.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "1680.0*x^5.0+300.0*x^2.0+120.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/18.0*x^10.0+1.0/8.4*x^7.0+1.0/6.0*x^6.0-1.0/1.2*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/18.0/11.0*x^11.0+1.0/8.4/8.0*x^8.0+1.0/6.0/7.0*x^7.0-1.0/1.2/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/198.0*x^11.0+1.0/67.2*x^8.0+1.0/42.0*x^7.0-1.0/4.8*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "1680.0*x^5.0+300.0*x^2.0+120.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "1680.0*5.0*x^4.0+300.0*2.0*x^1.0+120.0";
        UsageCalculus.EqnSolArrayMap2[4] = "8400.0*x^4.0+600.0*x+120.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/198.0*x^11.0+1.0/67.2*x^8.0+1.0/42.0*x^7.0-1.0/4.8*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/198.0/12.0*x^12.0+1.0/67.2/9.0*x^9.0+1.0/42.0/8.0*x^8.0-1.0/4.8/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/2376.0*x^12.0+1.0/604.8000000000001*x^9.0+1.0/336.0*x^8.0-1.0/24.0*x^5.0-1.0416666666666667*x^4.0";
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
        public static void TestCaseDiff20008() {
        //Test Case 20008
        UsageCalculus.TestCase = 20008;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "-5*xy^8 - 5*xy^5 - 5*xy^4 - 5*xy - 25*-5";
        UsageCalculus.TestCaseName = "Simple: Coefficients:-5";
        UsageCalculus.TestCaseMatrixID="Coefficients:-5:2 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xy";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-5.0*xy^8.0-5.0*xy^5.0-5.0*xy^4.0-5.0*xy+125.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-5.0*8.0*xy^7.0-5.0*5.0*xy^4.0-5.0*4.0*xy^3.0-5.0+0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-40.0*xy^7.0-25.0*xy^4.0-20.0*xy^3.0-5.0";
        UsageCalculus.EqnSolArrayMap3[1]="-5.0*xy^8.0-5.0*xy^5.0-5.0*xy^4.0-5.0*xy+125.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-5.0/9.0*xy^9.0-5.0/6.0*xy^6.0-5.0/5.0*xy^5.0-5.0/2.0*xy^2.0+125.0*xy";
        UsageCalculus.EqnSolArrayMap4[1]="-1.0/1.8*xy^9.0-1.0/1.2*xy^6.0-xy^5.0-2.5*xy^2.0+125.0*xy";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-40.0*xy^7.0-25.0*xy^4.0-20.0*xy^3.0-5.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-40.0*7.0*xy^6.0-25.0*4.0*xy^3.0-20.0*3.0*xy^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-280.0*xy^6.0-100.0*xy^3.0-60.0*xy^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="-1.0/1.8*xy^9.0-0.8333333333333334*xy^6.0-xy^5.0-2.5*xy^2.0+125.0*xy";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-1.0/1.8/10.0*xy^10.0-0.8333333333333334/7.0*xy^7.0-1.0/6.0*xy^6.0-2.5/3.0*xy^3.0+125.0/2.0*xy^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="-1.0/18.0*xy^10.0-1.0/8.4*xy^7.0-1.0/6.0*xy^6.0-1.0/1.2*xy^3.0+62.5*xy^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-280.0*xy^6.0-100.0*xy^3.0-60.0*xy^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-280.0*6.0*xy^5.0-100.0*3.0*xy^2.0-60.0*2.0*xy^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-1680.0*xy^5.0-300.0*xy^2.0-120.0*xy";
        UsageCalculus.EqnSolArrayMap3[3]="-1.0/18.0*xy^10.0-1.0/8.4*xy^7.0-1.0/6.0*xy^6.0-1.0/1.2*xy^3.0+62.5*xy^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="-1.0/18.0/11.0*xy^11.0-1.0/8.4/8.0*xy^8.0-1.0/6.0/7.0*xy^7.0-1.0/1.2/4.0*xy^4.0+62.5/3.0*xy^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-1.0/198.0*xy^11.0-1.0/67.2*xy^8.0-1.0/42.0*xy^7.0-1.0/4.8*xy^4.0+20.833333333333332*xy^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-1680.0*xy^5.0-300.0*xy^2.0-120.0*xy";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-1680.0*5.0*xy^4.0-300.0*2.0*xy^1.0-120.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-8400.0*xy^4.0-600.0*xy-120.0";
        UsageCalculus.EqnSolArrayMap3[4]="-1.0/198.0*xy^11.0-1.0/67.2*xy^8.0-1.0/42.0*xy^7.0-1.0/4.8*xy^4.0+20.833333333333332*xy^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="-1.0/198.0/12.0*xy^12.0-1.0/67.2/9.0*xy^9.0-1.0/42.0/8.0*xy^8.0-1.0/4.8/5.0*xy^5.0+20.833333333333332/4.0*xy^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="-1.0/2376.0*xy^12.0-1.0/604.8000000000001*xy^9.0-1.0/336.0*xy^8.0-1.0/24.0*xy^5.0+5.208333333333333*xy^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;
        
        UsageCalculus.EqnSolArrayMap1[5] = "-8400.0*xy^4.0-600.0*xy-120.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "-8400.0*4.0*xy^3.0-600.0-0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "-33600.0*xy^3.0-600.0";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "-33600.0*xy^3.0-600.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "-33600.0*3.0*xy^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "-100800.0*xy^2.0-";
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
        public static void TestCaseDiff20009() {
        //Test Case 20009
        UsageCalculus.TestCase = 20009;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "-5.0*xyc1^8 - 5.0*xyc1^5 - 5.0*xyc1^4 - 5.0*xyc1 - 5.0*25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:-5.0";
        UsageCalculus.TestCaseMatrixID="Coefficients:-5.0:3 Letter with Numerics:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-5.0*xyc1^8.0-5.0*xyc1^5.0-5.0*xyc1^4.0-5.0*xyc1-125.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-5.0*8.0*xyc1^7.0-5.0*5.0*xyc1^4.0-5.0*4.0*xyc1^3.0-5.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-40.0*xyc1^7.0-25.0*xyc1^4.0-20.0*xyc1^3.0-5.0";
        UsageCalculus.EqnSolArrayMap3[1]="-5.0*xyc1^8.0-5.0*xyc1^5.0-5.0*xyc1^4.0-5.0*xyc1-125.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-5.0/9.0*xyc1^9.0-5.0/6.0*xyc1^6.0-5.0/5.0*xyc1^5.0-5.0/2.0*xyc1^2.0-125.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="-1.0/1.8*xyc1^9.0-1.0/1.2*xyc1^6.0-xyc1^5.0-2.5*xyc1^2.0-125.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-40.0*xyc1^7.0-25.0*xyc1^4.0-20.0*xyc1^3.0-5.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-40.0*7.0*xyc1^6.0-25.0*4.0*xyc1^3.0-20.0*3.0*xyc1^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-280.0*xyc1^6.0-100.0*xyc1^3.0-60.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="-1.0/1.8*xyc1^9.0-0.8333333333333334*xyc1^6.0-xyc1^5.0-2.5*xyc1^2.0-125.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-1.0/1.8/10.0*xyc1^10.0-0.8333333333333334/7.0*xyc1^7.0-1.0/6.0*xyc1^6.0-2.5/3.0*xyc1^3.0-125.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="-1.0/18.0*xyc1^10.0-1.0/8.4*xyc1^7.0-1.0/6.0*xyc1^6.0-1.0/1.2*xyc1^3.0-62.5*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-280.0*xyc1^6.0-100.0*xyc1^3.0-60.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-280.0*6.0*xyc1^5.0-100.0*3.0*xyc1^2.0-60.0*2.0*xyc1^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-1680.0*xyc1^5.0-300.0*xyc1^2.0-120.0*xyc1";
        UsageCalculus.EqnSolArrayMap3[3]="-1.0/18.0*xyc1^10.0-1.0/8.4*xyc1^7.0-1.0/6.0*xyc1^6.0-1.0/1.2*xyc1^3.0-62.5*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="-1.0/18.0/11.0*xyc1^11.0-1.0/8.4/8.0*xyc1^8.0-1.0/6.0/7.0*xyc1^7.0-1.0/1.2/4.0*xyc1^4.0-62.5/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-1.0/198.0*xyc1^11.0-1.0/67.2*xyc1^8.0-1.0/42.0*xyc1^7.0-1.0/4.8*xyc1^4.0-20.833333333333332*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-1680.0*xyc1^5.0-300.0*xyc1^2.0-120.0*xyc1";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-1680.0*5.0*xyc1^4.0-300.0*2.0*xyc1^1.0-120.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-8400.0*xyc1^4.0-600.0*xyc1-120.0";
        UsageCalculus.EqnSolArrayMap3[4]="-1.0/198.0*xyc1^11.0-1.0/67.2*xyc1^8.0-1.0/42.0*xyc1^7.0-1.0/4.8*xyc1^4.0-20.833333333333332*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="-1.0/198.0/12.0*xyc1^12.0-1.0/67.2/9.0*xyc1^9.0-1.0/42.0/8.0*xyc1^8.0-1.0/4.8/5.0*xyc1^5.0-20.833333333333332/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="-1.0/2376.0*xyc1^12.0-1.0/604.8000000000001*xyc1^9.0-1.0/336.0*xyc1^8.0-1.0/24.0*xyc1^5.0-5.208333333333333*xyc1^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;
        
        UsageCalculus.EqnSolArrayMap1[5] = "-8400.0*xyc1^4.0-600.0*xyc1-120.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "-8400.0*4.0*xyc1^3.0-600.0-0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "-33600.0*xyc1^3.0-600.0";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "-33600.0*xyc1^3.0-600.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "-33600.0*3.0*xyc1^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "-100800.0*xyc1^2.0";
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
        public static void TestCaseDiff20010() {
        //Test Case 20010
        UsageCalculus.TestCase = 20010;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "1.0*+5.0*xyc1^8 + 1.0*+5.0*xyc1^5 + 1.0*+5.0*xyc1^4 + 1.0*+5.0*xyc1 + 1.0*+5.0*25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:+5.0";
        UsageCalculus.TestCaseMatrixID="Coefficients:+5.0:3 Letter with Numerics:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 5;
        
        UsageCalculus.EqnSolArrayMap1[1] = "5.0*xyc1^8.0+5.0*xyc1^5.0+5.0*xyc1^4.0+5.0*xyc1+125.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "5.0*8.0*xyc1^7.0+5.0*5.0*xyc1^4.0+5.0*4.0*xyc1^3.0+5.0+0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "40.0*xyc1^7.0+25.0*xyc1^4.0+20.0*xyc1^3.0+5.0";
        UsageCalculus.EqnSolArrayMap3[1]="5.0*xyc1^8.0+5.0*xyc1^5.0+5.0*xyc1^4.0+5.0*xyc1+125.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="5.0/9.0*xyc1^9.0+5.0/6.0*xyc1^6.0+5.0/5.0*xyc1^5.0+5.0/2.0*xyc1^2.0+125.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1.8*xyc1^9.0+1.0/1.2*xyc1^6.0+xyc1^5.0+2.5*xyc1^2.0+125.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "40.0*xyc1^7.0+25.0*xyc1^4.0+20.0*xyc1^3.0+5.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "40.0*7.0*xyc1^6.0+25.0*4.0*xyc1^3.0+20.0*3.0*xyc1^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "280.0*xyc1^6.0+100.0*xyc1^3.0+60.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/1.8*xyc1^9.0+0.8333333333333334*xyc1^6.0+xyc1^5.0+2.5*xyc1^2.0+125.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/1.8/10.0*xyc1^10.0+0.8333333333333334/7.0*xyc1^7.0+1.0/6.0*xyc1^6.0+2.5/3.0*xyc1^3.0+125.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/18.0*xyc1^10.0+1.0/8.4*xyc1^7.0+1.0/6.0*xyc1^6.0+1.0/1.2*xyc1^3.0+62.5*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "280.0*xyc1^6.0+100.0*xyc1^3.0+60.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "280.0*6.0*xyc1^5.0+100.0*3.0*xyc1^2.0+60.0*2.0*xyc1^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "1680.0*xyc1^5.0+300.0*xyc1^2.0+120.0*xyc1";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/18.0*xyc1^10.0+1.0/8.4*xyc1^7.0+1.0/6.0*xyc1^6.0+1.0/1.2*xyc1^3.0+62.5*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/18.0/11.0*xyc1^11.0+1.0/8.4/8.0*xyc1^8.0+1.0/6.0/7.0*xyc1^7.0+1.0/1.2/4.0*xyc1^4.0+62.5/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/198.0*xyc1^11.0+1.0/67.2*xyc1^8.0+1.0/42.0*xyc1^7.0+1.0/4.8*xyc1^4.0+20.833333333333332*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "1680.0*xyc1^5.0+300.0*xyc1^2.0+120.0*xyc1";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "1680.0*5.0*xyc1^4.0+300.0*2.0*xyc1^1.0+120.0";
        UsageCalculus.EqnSolArrayMap2[4] = "8400.0*xyc1^4.0+600.0*xyc1+120.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/198.0*xyc1^11.0+1.0/67.2*xyc1^8.0+1.0/42.0*xyc1^7.0+1.0/4.8*xyc1^4.0+20.833333333333332*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/198.0/12.0*xyc1^12.0+1.0/67.2/9.0*xyc1^9.0+1.0/42.0/8.0*xyc1^8.0+1.0/4.8/5.0*xyc1^5.0+20.833333333333332/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/2376.0*xyc1^12.0+1.0/604.8000000000001*xyc1^9.0+1.0/336.0*xyc1^8.0+1.0/24.0*xyc1^5.0+5.208333333333333*xyc1^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;
        
        UsageCalculus.EqnSolArrayMap1[5] = "-8400.0*xyc1^4.0-600.0*xyc1-120.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "-8400.0*4.0*xyc1^3.0-600.0-0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "-33600.0*xyc1^3.0-600.0";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "-33600.0*xyc1^3.0-600.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "-33600.0*3.0*xyc1^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "-100800.0*xyc1^2.0";
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
        public static void TestCaseDiff20011() {
        //Test Case 20011
        UsageCalculus.TestCase = 20011;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "1.0*+1*xyc1^8 + 1.0*+1*xyc1^5 + 1.0*+1*xyc1^4 + 1.0*+1*xyc1 + 1.0*+1*25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:+1";
        UsageCalculus.TestCaseMatrixID="Coefficients:+1:3 Letter with Numerics:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 5;
        
        UsageCalculus.EqnSolArrayMap1[1] = "xyc1^8.0+xyc1^5.0+xyc1^4.0+xyc1+25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*xyc1^7.0+5.0*xyc1^4.0+4.0*xyc1^3.0+1.0+0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*xyc1^7.0+5.0*xyc1^4.0+4.0*xyc1^3.0+1.0";
        UsageCalculus.EqnSolArrayMap3[1]="xyc1^8.0+xyc1^5.0+xyc1^4.0+xyc1+25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/9.0*xyc1^9.0+1.0/6.0*xyc1^6.0+1.0/5.0*xyc1^5.0+1.0/2.0*xyc1^2.0+25.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/9.0*xyc1^9.0+1.0/6.0*xyc1^6.0+1.0/5.0*xyc1^5.0+1.0/2.0*xyc1^2.0+25.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*xyc1^7.0+5.0*xyc1^4.0+4.0*xyc1^3.0+1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*7.0*xyc1^6.0+5.0*4.0*xyc1^3.0+4.0*3.0*xyc1^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*xyc1^6.0+20.0*xyc1^3.0+12.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/9.0*xyc1^9.0+1.0/6.0*xyc1^6.0+1.0/5.0*xyc1^5.0+1.0/2.0*xyc1^2.0+25.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/9.0/10.0*xyc1^10.0+1.0/6.0/7.0*xyc1^7.0+1.0/5.0/6.0*xyc1^6.0+1.0/2.0/3.0*xyc1^3.0+25.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/90.0*xyc1^10.0+1.0/42.0*xyc1^7.0+1.0/30.0*xyc1^6.0+1.0/6.0*xyc1^3.0+12.5*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*xyc1^6.0+20.0*xyc1^3.0+12.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*xyc1^5.0+20.0*3.0*xyc1^2.0+12.0*2.0*xyc1^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*xyc1^5.0+60.0*xyc1^2.0+24.0*xyc1";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/90.0*xyc1^10.0+1.0/42.0*xyc1^7.0+1.0/30.0*xyc1^6.0+1.0/6.0*xyc1^3.0+12.5*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/90.0/11.0*xyc1^11.0+1.0/42.0/8.0*xyc1^8.0+1.0/30.0/7.0*xyc1^7.0+1.0/6.0/4.0*xyc1^4.0+12.5/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/990.0*xyc1^11.0+1.0/336.0*xyc1^8.0+1.0/210.0*xyc1^7.0+1.0/24.0*xyc1^4.0+4.166666666666667*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*xyc1^5.0+60.0*xyc1^2.0+24.0*xyc1";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*xyc1^4.0+60.0*2.0*xyc1^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*xyc1^4.0+120.0*xyc1+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/990.0*xyc1^11.0+1.0/336.0*xyc1^8.0+1.0/210.0*xyc1^7.0+1.0/24.0*xyc1^4.0+4.166666666666667*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/990.0/12.0*xyc1^12.0+1.0/336.0/9.0*xyc1^9.0+1.0/210.0/8.0*xyc1^8.0+1.0/24.0/5.0*xyc1^5.0+4.166666666666667/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/11880.0*xyc1^12.0+1.0/3024.0*xyc1^9.0+1.0/1680.0*xyc1^8.0+1.0/120.0*xyc1^5.0+1.0416666666666667*xyc1^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;
        
        UsageCalculus.EqnSolArrayMap1[5] = "-8400.0*xyc1^4.0-600.0*xyc1-120.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "-8400.0*4.0*xyc1^3.0-600.0-0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "-33600.0*xyc1^3.0-600.0";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "-33600.0*xyc1^3.0-600.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "-33600.0*3.0*xyc1^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "-100800.0*xyc1^2.0";
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
        public static void TestCaseDiff20012() {
        //Test Case 20012
        UsageCalculus.TestCase = 20012;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "1.0*+1.0*xyc1^8 + 1.0*+1.0*xyc1^5 + 1.0*+1.0*xyc1^4 + 1.0*+1.0*xyc1 + 1.0*+1.0*25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:+1.0";
        UsageCalculus.TestCaseMatrixID="Coefficients:+1.0:3 Letter with Numerics:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 5;
        
        UsageCalculus.EqnSolArrayMap1[1] = "xyc1^8.0+xyc1^5.0+xyc1^4.0+xyc1+25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*xyc1^7.0+5.0*xyc1^4.0+4.0*xyc1^3.0+1.0+0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*xyc1^7.0+5.0*xyc1^4.0+4.0*xyc1^3.0+1.0";
        UsageCalculus.EqnSolArrayMap3[1]="xyc1^8.0+xyc1^5.0+xyc1^4.0+xyc1+25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/9.0*xyc1^9.0+1.0/6.0*xyc1^6.0+1.0/5.0*xyc1^5.0+1.0/2.0*xyc1^2.0+25.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/9.0*xyc1^9.0+1.0/6.0*xyc1^6.0+1.0/5.0*xyc1^5.0+1.0/2.0*xyc1^2.0+25.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*xyc1^7.0+5.0*xyc1^4.0+4.0*xyc1^3.0+1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*7.0*xyc1^6.0+5.0*4.0*xyc1^3.0+4.0*3.0*xyc1^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*xyc1^6.0+20.0*xyc1^3.0+12.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/9.0*xyc1^9.0+1.0/6.0*xyc1^6.0+1.0/5.0*xyc1^5.0+1.0/2.0*xyc1^2.0+25.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/9.0/10.0*xyc1^10.0+1.0/6.0/7.0*xyc1^7.0+1.0/5.0/6.0*xyc1^6.0+1.0/2.0/3.0*xyc1^3.0+25.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/90.0*xyc1^10.0+1.0/42.0*xyc1^7.0+1.0/30.0*xyc1^6.0+1.0/6.0*xyc1^3.0+12.5*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*xyc1^6.0+20.0*xyc1^3.0+12.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*xyc1^5.0+20.0*3.0*xyc1^2.0+12.0*2.0*xyc1^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*xyc1^5.0+60.0*xyc1^2.0+24.0*xyc1";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/90.0*xyc1^10.0+1.0/42.0*xyc1^7.0+1.0/30.0*xyc1^6.0+1.0/6.0*xyc1^3.0+12.5*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/90.0/11.0*xyc1^11.0+1.0/42.0/8.0*xyc1^8.0+1.0/30.0/7.0*xyc1^7.0+1.0/6.0/4.0*xyc1^4.0+12.5/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/990.0*xyc1^11.0+1.0/336.0*xyc1^8.0+1.0/210.0*xyc1^7.0+1.0/24.0*xyc1^4.0+4.166666666666667*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*xyc1^5.0+60.0*xyc1^2.0+24.0*xyc1";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*xyc1^4.0+60.0*2.0*xyc1^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*xyc1^4.0+120.0*xyc1+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/990.0*xyc1^11.0+1.0/336.0*xyc1^8.0+1.0/210.0*xyc1^7.0+1.0/24.0*xyc1^4.0+4.166666666666667*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/990.0/12.0*xyc1^12.0+1.0/336.0/9.0*xyc1^9.0+1.0/210.0/8.0*xyc1^8.0+1.0/24.0/5.0*xyc1^5.0+4.166666666666667/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/11880.0*xyc1^12.0+1.0/3024.0*xyc1^9.0+1.0/1680.0*xyc1^8.0+1.0/120.0*xyc1^5.0+1.0416666666666667*xyc1^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;
        
        UsageCalculus.EqnSolArrayMap1[5] = "-8400.0*xyc1^4.0-600.0*xyc1-120.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "-8400.0*4.0*xyc1^3.0-600.0-0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "-33600.0*xyc1^3.0-600.0";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "-33600.0*xyc1^3.0-600.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "-33600.0*3.0*xyc1^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "-100800.0*xyc1^2.0";
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
                
        public static void TestCaseDiff20013() {
        //Test Case 20013
        UsageCalculus.TestCase = 20013;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "1.0*+5*xyc1^8 + 1.0*+5*xyc1^5 + 1.0*+5*xyc1^4 + 1.0*+5*xyc1 + 1.0*+5*25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:+5";
        UsageCalculus.TestCaseMatrixID="Coefficients:+5:3 Letter with Numerics:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 5;
        
        UsageCalculus.EqnSolArrayMap1[1] = "5.0*xyc1^8.0+5.0*xyc1^5.0+5.0*xyc1^4.0+5.0*xyc1+125.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "5.0*8.0*xyc1^7.0+5.0*5.0*xyc1^4.0+5.0*4.0*xyc1^3.0+5.0+0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "40.0*xyc1^7.0+25.0*xyc1^4.0+20.0*xyc1^3.0+5.0";
        UsageCalculus.EqnSolArrayMap3[1]="5.0*xyc1^8.0+5.0*xyc1^5.0+5.0*xyc1^4.0+5.0*xyc1+125.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="5.0/9.0*xyc1^9.0+5.0/6.0*xyc1^6.0+5.0/5.0*xyc1^5.0+5.0/2.0*xyc1^2.0+125.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1.8*xyc1^9.0+1.0/1.2*xyc1^6.0+xyc1^5.0+2.5*xyc1^2.0+125.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "40.0*xyc1^7.0+25.0*xyc1^4.0+20.0*xyc1^3.0+5.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "40.0*7.0*xyc1^6.0+25.0*4.0*xyc1^3.0+20.0*3.0*xyc1^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "280.0*xyc1^6.0+100.0*xyc1^3.0+60.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/1.8*xyc1^9.0+0.8333333333333334*xyc1^6.0+xyc1^5.0+2.5*xyc1^2.0+125.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/1.8/10.0*xyc1^10.0+0.8333333333333334/7.0*xyc1^7.0+1.0/6.0*xyc1^6.0+2.5/3.0*xyc1^3.0+125.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/18.0*xyc1^10.0+1.0/8.4*xyc1^7.0+1.0/6.0*xyc1^6.0+1.0/1.2*xyc1^3.0+62.5*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "280.0*xyc1^6.0+100.0*xyc1^3.0+60.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "280.0*6.0*xyc1^5.0+100.0*3.0*xyc1^2.0+60.0*2.0*xyc1^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "1680.0*xyc1^5.0+300.0*xyc1^2.0+120.0*xyc1";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/18.0*xyc1^10.0+1.0/8.4*xyc1^7.0+1.0/6.0*xyc1^6.0+1.0/1.2*xyc1^3.0+62.5*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/18.0/11.0*xyc1^11.0+1.0/8.4/8.0*xyc1^8.0+1.0/6.0/7.0*xyc1^7.0+1.0/1.2/4.0*xyc1^4.0+62.5/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/198.0*xyc1^11.0+1.0/67.2*xyc1^8.0+1.0/42.0*xyc1^7.0+1.0/4.8*xyc1^4.0+20.833333333333332*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "1680.0*xyc1^5.0+300.0*xyc1^2.0+120.0*xyc1";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "1680.0*5.0*xyc1^4.0+300.0*2.0*xyc1^1.0+120.0";
        UsageCalculus.EqnSolArrayMap2[4] = "8400.0*xyc1^4.0+600.0*xyc1+120.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/198.0*xyc1^11.0+1.0/67.2*xyc1^8.0+1.0/42.0*xyc1^7.0+1.0/4.8*xyc1^4.0+20.833333333333332*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/198.0/12.0*xyc1^12.0+1.0/67.2/9.0*xyc1^9.0+1.0/42.0/8.0*xyc1^8.0+1.0/4.8/5.0*xyc1^5.0+20.833333333333332/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/2376.0*xyc1^12.0+1.0/604.8000000000001*xyc1^9.0+1.0/336.0*xyc1^8.0+1.0/24.0*xyc1^5.0+5.208333333333333*xyc1^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;
        
        UsageCalculus.EqnSolArrayMap1[5] = "-8400.0*xyc1^4.0-600.0*xyc1-120.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "-8400.0*4.0*xyc1^3.0-600.0-0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "-33600.0*xyc1^3.0-600.0";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "-33600.0*xyc1^3.0-600.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "-33600.0*3.0*xyc1^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "-100800.0*xyc1^2.0";
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
        public static void TestCaseDiff20014() {
        //Test Case 20014
        UsageCalculus.TestCase = 20014;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "1.0*+235*xyc1^8 + 1.0*+2355*xyc1^5 + 1.0*+235*xyc1^4 + 1.0*+235*xyc1 + 1.0*+235*25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:+235";
        UsageCalculus.TestCaseMatrixID="Coefficients:+235:3 Letter with Numerics:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 5;
        
        UsageCalculus.EqnSolArrayMap1[1] = "235.0*xyc1^8.0+2355.0*xyc1^5.0+235.0*xyc1^4.0+235.0*xyc1+5875.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "235.0*8.0*xyc1^7.0+2355.0*5.0*xyc1^4.0+235.0*4.0*xyc1^3.0+235.0+0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1880.0*xyc1^7.0+11775.0*xyc1^4.0+940.0*xyc1^3.0+235.0";
        UsageCalculus.EqnSolArrayMap3[1]="235.0*xyc1^8.0+2355.0*xyc1^5.0+235.0*xyc1^4.0+235.0*xyc1+5875.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="235.0/9.0*xyc1^9.0+2355.0/6.0*xyc1^6.0+235.0/5.0*xyc1^5.0+235.0/2.0*xyc1^2.0+5875.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="26.11111111111111*xyc1^9.0+392.5*xyc1^6.0+47.0*xyc1^5.0+117.5*xyc1^2.0+5875.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1880.0*xyc1^7.0+11775.0*xyc1^4.0+940.0*xyc1^3.0+235.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "1880.0*7.0*xyc1^6.0+11775.0*4.0*xyc1^3.0+940.0*3.0*xyc1^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "13160.0*xyc1^6.0+47100.0*xyc1^3.0+2820.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="26.11111111111111*xyc1^9.0+392.5*xyc1^6.0+47.0*xyc1^5.0+117.5*xyc1^2.0+5875.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="26.11111111111111/10.0*xyc1^10.0+392.5/7.0*xyc1^7.0+47.0/6.0*xyc1^6.0+117.5/3.0*xyc1^3.0+5875.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="2.611111111111111*xyc1^10.0+56.07142857142857*xyc1^7.0+7.833333333333333*xyc1^6.0+39.166666666666664*xyc1^3.0+2937.5*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "13160.0*xyc1^6.0+47100.0*xyc1^3.0+2820.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "13160.0*6.0*xyc1^5.0+47100.0*3.0*xyc1^2.0+2820.0*2.0*xyc1^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "78960.0*xyc1^5.0+141300.0*xyc1^2.0+5640.0*xyc1";
        UsageCalculus.EqnSolArrayMap3[3]="2.611111111111111*xyc1^10.0+56.07142857142857*xyc1^7.0+7.833333333333333*xyc1^6.0+39.166666666666664*xyc1^3.0+2937.5*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="2.611111111111111/11.0*xyc1^11.0+56.07142857142857/8.0*xyc1^8.0+7.833333333333333/7.0*xyc1^7.0+39.166666666666664/4.0*xyc1^4.0+2937.5/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/4.212765957446808*xyc1^11.0+7.008928571428571*xyc1^8.0+1.119047619047619*xyc1^7.0+9.791666666666666*xyc1^4.0+979.1666666666666*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "78960.0*xyc1^5.0+141300.0*xyc1^2.0+5640.0*xyc1";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "78960.0*5.0*xyc1^4.0+141300.0*2.0*xyc1^1.0+5640.0";
        UsageCalculus.EqnSolArrayMap2[4] = "394800.0*xyc1^4.0+282600.0*xyc1+5640.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/4.212765957446808*xyc1^11.0+7.008928571428571*xyc1^8.0+1.119047619047619*xyc1^7.0+9.791666666666666*xyc1^4.0+979.1666666666666*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/4.212765957446808/12.0*xyc1^12.0+7.008928571428571/9.0*xyc1^9.0+1.119047619047619/8.0*xyc1^8.0+9.791666666666666/5.0*xyc1^5.0+979.1666666666666/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/50.553191489361694*xyc1^12.0+1.0/1.284076433121019*xyc1^9.0+1.0/7.148936170212766*xyc1^8.0+1.9583333333333333*xyc1^5.0+244.79166666666666*xyc1^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;
        
        UsageCalculus.EqnSolArrayMap1[5] = "-8400.0*xyc1^4.0-600.0*xyc1-120.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "-8400.0*4.0*xyc1^3.0-600.0-0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "-33600.0*xyc1^3.0-600.0";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "-33600.0*xyc1^3.0-600.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "-33600.0*3.0*xyc1^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "-100800.0*xyc1^2.0";
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
       public static void TestCaseDiff20015() {
        //Test Case 20015
        UsageCalculus.TestCase = 20015;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "1.0*+2*xyc1^8*5 + 1.0*+2*xyc1^5*5 + 1.0*+2*xyc1^4*5 + 1.0*+2*xyc1*5 + 1.0*+2*25*5";
        UsageCalculus.TestCaseName = "Simple: Coefficients:5:Trailing Constant:End Term";
        UsageCalculus.TestCaseMatrixID="Coefficients:5:3 Letter with Numerics:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 5;
        
        UsageCalculus.EqnSolArrayMap1[1] = "10.0*xyc1^8.0+10.0*xyc1^5.0+10.0*xyc1^4.0+10.0*xyc1+250.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "10.0*8.0*xyc1^7.0+10.0*5.0*xyc1^4.0+10.0*4.0*xyc1^3.0+10.0+0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "80.0*xyc1^7.0+50.0*xyc1^4.0+40.0*xyc1^3.0+10.0";
        UsageCalculus.EqnSolArrayMap3[1]="10.0*xyc1^8.0+10.0*xyc1^5.0+10.0*xyc1^4.0+10.0*xyc1+250.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="10.0/9.0*xyc1^9.0+10.0/6.0*xyc1^6.0+10.0/5.0*xyc1^5.0+10.0/2.0*xyc1^2.0+250.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="1.1111111111111112*xyc1^9.0+1.6666666666666667*xyc1^6.0+2.0*xyc1^5.0+5.0*xyc1^2.0+250.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "80.0*xyc1^7.0+50.0*xyc1^4.0+40.0*xyc1^3.0+10.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "80.0*7.0*xyc1^6.0+50.0*4.0*xyc1^3.0+40.0*3.0*xyc1^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "560.0*xyc1^6.0+200.0*xyc1^3.0+120.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.1111111111111112*xyc1^9.0+1.6666666666666667*xyc1^6.0+2.0*xyc1^5.0+5.0*xyc1^2.0+250.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.1111111111111112/10.0*xyc1^10.0+1.6666666666666667/7.0*xyc1^7.0+2.0/6.0*xyc1^6.0+5.0/3.0*xyc1^3.0+250.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/9.0*xyc1^10.0+1.0/4.2*xyc1^7.0+1.0/3.0*xyc1^6.0+1.6666666666666667*xyc1^3.0+125.0*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "560.0*xyc1^6.0+200.0*xyc1^3.0+120.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "560.0*6.0*xyc1^5.0+200.0*3.0*xyc1^2.0+120.0*2.0*xyc1^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "3360.0*xyc1^5.0+600.0*xyc1^2.0+240.0*xyc1";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/9.0*xyc1^10.0+1.0/4.2*xyc1^7.0+1.0/3.0*xyc1^6.0+1.6666666666666667*xyc1^3.0+125.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/9.0/11.0*xyc1^11.0+1.0/4.2/8.0*xyc1^8.0+1.0/3.0/7.0*xyc1^7.0+1.6666666666666667/4.0*xyc1^4.0+125.0/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/99.0*xyc1^11.0+1.0/33.6*xyc1^8.0+1.0/21.0*xyc1^7.0+1.0/2.4*xyc1^4.0+41.666666666666664*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "3360.0*xyc1^5.0+600.0*xyc1^2.0+240.0*xyc1";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "3360.0*5.0*xyc1^4.0+600.0*2.0*xyc1^1.0+240.0";
        UsageCalculus.EqnSolArrayMap2[4] = "16800.0*xyc1^4.0+1200.0*xyc1+240.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/99.0*xyc1^11.0+1.0/33.6*xyc1^8.0+1.0/21.0*xyc1^7.0+1.0/2.4*xyc1^4.0+41.666666666666664*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/99.0/12.0*xyc1^12.0+1.0/33.6/9.0*xyc1^9.0+1.0/21.0/8.0*xyc1^8.0+1.0/2.4/5.0*xyc1^5.0+41.666666666666664/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/1188.0*xyc1^12.0+1.0/302.40000000000003*xyc1^9.0+1.0/168.0*xyc1^8.0+1.0/12.0*xyc1^5.0+10.416666666666666*xyc1^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;
        
        UsageCalculus.EqnSolArrayMap1[5] = "-8400.0*xyc1^4.0-600.0*xyc1-120.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "-8400.0*4.0*xyc1^3.0-600.0-0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "-33600.0*xyc1^3.0-600.0";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "-33600.0*xyc1^3.0-600.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "-33600.0*3.0*xyc1^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "-100800.0*xyc1^2.0-";
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
       public static void TestCaseDiff20016() {
        //Test Case 20016
        UsageCalculus.TestCase = 20016;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "1.0*+2*xyc1^8*5*xyc1*7 + 1.0*+2*xyc1^5*5*xyc1*7 + 1.0*+2*xyc1^4*5*xyc1*7 + 1.0*+2*xyc1*5*xyc1*7 + 1.0*+2*25*5";
        UsageCalculus.TestCaseName = "Simple: Coefficients:5*xyc1*7:Trailing Constant:Middle Term";
        UsageCalculus.TestCaseMatrixID="Coefficients:5*xyc1*7:3 Letter with Numerics:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 5;
        
        UsageCalculus.EqnSolArrayMap1[1] = "70.0*xyc1^9.0+70.0*xyc1^6.0+70.0*xyc1^5.0+70.0*xyc1^2.0+250.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "70.0*9.0*xyc1^8.0+70.0*6.0*xyc1^5.0+70.0*5.0*xyc1^4.0+70.0*2.0*xyc1^1.0+0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "630.0*xyc1^8.0+420.0*xyc1^5.0+350.0*xyc1^4.0+140.0*xyc1";
        UsageCalculus.EqnSolArrayMap3[1]="70.0*xyc1^9.0+70.0*xyc1^6.0+70.0*xyc1^5.0+70.0*xyc1^2.0+250.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="70.0/10.0*xyc1^10.0+70.0/7.0*xyc1^7.0+70.0/6.0*xyc1^6.0+70.0/3.0*xyc1^3.0+250.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="7.0*xyc1^10.0+10.0*xyc1^7.0+11.666666666666666*xyc1^6.0+23.333333333333332*xyc1^3.0+250.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "630.0*xyc1^8.0+420.0*xyc1^5.0+350.0*xyc1^4.0+140.0*xyc1";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "630.0*8.0*xyc1^7.0+420.0*5.0*xyc1^4.0+350.0*4.0*xyc1^3.0+140.0";
        UsageCalculus.EqnSolArrayMap2[2] = "5040.0*xyc1^7.0+2100.0*xyc1^4.0+1400.0*xyc1^3.0+140.0";
        UsageCalculus.EqnSolArrayMap3[2]="7.0*xyc1^10.0+10.0*xyc1^7.0+11.666666666666666*xyc1^6.0+23.333333333333332*xyc1^3.0+250.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="7.0/11.0*xyc1^11.0+10.0/8.0*xyc1^8.0+11.666666666666666/7.0*xyc1^7.0+23.333333333333332/4.0*xyc1^4.0+250.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/1.5714285714285714*xyc1^11.0+1.25*xyc1^8.0+1.6666666666666665*xyc1^7.0+5.833333333333333*xyc1^4.0+125.0*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "5040.0*xyc1^7.0+2100.0*xyc1^4.0+1400.0*xyc1^3.0+140.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "5040.0*7.0*xyc1^6.0+2100.0*4.0*xyc1^3.0+1400.0*3.0*xyc1^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "35280.0*xyc1^6.0+8400.0*xyc1^3.0+4200.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/1.5714285714285714*xyc1^11.0+1.25*xyc1^8.0+1.6666666666666665*xyc1^7.0+5.833333333333333*xyc1^4.0+125.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/1.5714285714285714/12.0*xyc1^12.0+1.25/9.0*xyc1^9.0+1.6666666666666665/8.0*xyc1^8.0+5.833333333333333/5.0*xyc1^5.0+125.0/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/18.857142857142858*xyc1^12.0+1.0/7.2*xyc1^9.0+1.0/4.800000000000001*xyc1^8.0+1.1666666666666665*xyc1^5.0+41.666666666666664*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "35280.0*xyc1^6.0+8400.0*xyc1^3.0+4200.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "35280.0*6.0*xyc1^5.0+8400.0*3.0*xyc1^2.0+4200.0*2.0*xyc1^1.0";
        UsageCalculus.EqnSolArrayMap2[4] = "211680.0*xyc1^5.0+25200.0*xyc1^2.0+8400.0*xyc1";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/18.857142857142858*xyc1^12.0+1.0/7.2*xyc1^9.0+1.0/4.800000000000001*xyc1^8.0+1.1666666666666665*xyc1^5.0+41.666666666666664*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/18.857142857142858/13.0*xyc1^13.0+1.0/7.2/10.0*xyc1^10.0+1.0/4.800000000000001/9.0*xyc1^9.0+1.1666666666666665/6.0*xyc1^6.0+41.666666666666664/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/245.14285714285714*xyc1^13.0+1.0/72.0*xyc1^10.0+1.0/43.2*xyc1^9.0+1.0/5.142857142857143*xyc1^6.0+10.416666666666666*xyc1^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;
        
        UsageCalculus.EqnSolArrayMap1[5] = "-8400.0*xyc1^4.0-600.0*xyc1-120.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "-8400.0*4.0*xyc1^3.0-600.0-0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "-33600.0*xyc1^3.0-600.0-";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "-33600.0*xyc1^3.0-600.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "-33600.0*3.0*xyc1^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "-100800.0*xyc1^2.0-";
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
       public static void TestCaseDiff20017() {
        //Test Case 20017
        UsageCalculus.TestCase = 20017;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "2.0/2.0*1.0*+2*xyc1^8*5^2 + 1.0*+2*xyc1^5*5^2 + 1.0*+2*xyc1^4*5^2 + 1.0*+2*xyc1*5^2 + 1.0*+2*25*5";
        UsageCalculus.TestCaseName = "Simple: Coefficients:5^xyc1:";
        UsageCalculus.TestCaseMatrixID="Coefficients:5^xyc1:3 Letter with Numerics:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "50.0*xyc1^8.0+50.0*xyc1^5.0+50.0*xyc1^4.0+50.0*xyc1+250.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "50.0*8.0*xyc1^7.0+50.0*5.0*xyc1^4.0+50.0*4.0*xyc1^3.0+50.0+0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "400.0*xyc1^7.0+250.0*xyc1^4.0+200.0*xyc1^3.0+50.0";
        UsageCalculus.EqnSolArrayMap3[1]="50.0*xyc1^8.0+50.0*xyc1^5.0+50.0*xyc1^4.0+50.0*xyc1+250.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="50.0/9.0*xyc1^9.0+50.0/6.0*xyc1^6.0+50.0/5.0*xyc1^5.0+50.0/2.0*xyc1^2.0+250.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="5.555555555555555*xyc1^9.0+8.333333333333334*xyc1^6.0+10.0*xyc1^5.0+25.0*xyc1^2.0+250.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "400.0*xyc1^7.0+250.0*xyc1^4.0+200.0*xyc1^3.0+50.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "400.0*7.0*xyc1^6.0+250.0*4.0*xyc1^3.0+200.0*3.0*xyc1^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "2800.0*xyc1^6.0+1000.0*xyc1^3.0+600.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="5.555555555555555*xyc1^9.0+8.333333333333334*xyc1^6.0+10.0*xyc1^5.0+25.0*xyc1^2.0+250.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="5.555555555555555/10.0*xyc1^10.0+8.333333333333334/7.0*xyc1^7.0+10.0/6.0*xyc1^6.0+25.0/3.0*xyc1^3.0+250.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/1.8*xyc1^10.0+1.1904761904761905*xyc1^7.0+1.6666666666666667*xyc1^6.0+8.333333333333334*xyc1^3.0+125.0*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "2800.0*xyc1^6.0+1000.0*xyc1^3.0+600.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "2800.0*6.0*xyc1^5.0+1000.0*3.0*xyc1^2.0+600.0*2.0*xyc1^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "16800.0*xyc1^5.0+3000.0*xyc1^2.0+1200.0*xyc1";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/1.8*xyc1^10.0+1.1904761904761905*xyc1^7.0+1.6666666666666667*xyc1^6.0+8.333333333333334*xyc1^3.0+125.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/1.8/11.0*xyc1^11.0+1.1904761904761905/8.0*xyc1^8.0+1.6666666666666667/7.0*xyc1^7.0+8.333333333333334/4.0*xyc1^4.0+125.0/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/19.8*xyc1^11.0+1.0/6.72*xyc1^8.0+1.0/4.2*xyc1^7.0+2.0833333333333335*xyc1^4.0+41.666666666666664*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "16800.0*xyc1^5.0+3000.0*xyc1^2.0+1200.0*xyc1";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "16800.0*5.0*xyc1^4.0+3000.0*2.0*xyc1^1.0+1200.0";
        UsageCalculus.EqnSolArrayMap2[4] = "84000.0*xyc1^4.0+6000.0*xyc1+1200.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/19.8*xyc1^11.0+1.0/6.72*xyc1^8.0+1.0/4.2*xyc1^7.0+2.0833333333333335*xyc1^4.0+41.666666666666664*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/19.8/12.0*xyc1^12.0+1.0/6.72/9.0*xyc1^9.0+1.0/4.2/8.0*xyc1^8.0+2.0833333333333335/5.0*xyc1^5.0+41.666666666666664/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/237.60000000000002*xyc1^12.0+1.0/60.48*xyc1^9.0+1.0/33.6*xyc1^8.0+1.0/2.4*xyc1^5.0+10.416666666666666*xyc1^4.0";
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
       /*********************************************/
       /************ Missed Out Test Cases **********/
       /*********************************************/
       public static void TestCaseDiff20018() {
        //Test Case 20018
        UsageCalculus.TestCase = 20018;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "-0.0/x^8 + 1.0*-0.0/x^5 + 1.0*-0.0/x^4 - 1.0*-0.0/x- 25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:-0.0";
        UsageCalculus.TestCaseMatrixID="Coefficients:-0.0:1 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-0.0/x^8.0-0.0/x^5.0-0.0/x^4.0+0.0/x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0*-8.0/x^9.0-0.0*-5.0/x^6.0-0.0*-4.0/x^5.0-0.0/x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "0.0/x^9.0+0.0/x^6.0+0.0/x^5.0-0.0/x^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="-0.0/x^8.0-0.0/x^5.0-0.0/x^4.0+0.0/x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-0.0/-7.0/x^7.0-0.0/-4.0/x^4.0-0.0/-3.0/x^3.0+0.0*ln(x)-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="0.0/x^7.0+0.0/x^4.0+0.0/x^3.0+0.0*ln(x)-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "0.0/x^9.0+0.0/x^6.0+0.0/x^5.0-0.0/x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "0.0*-9.0/x^10.0+0.0*-6.0/x^7.0+0.0*-5.0/x^6.0-0.0*-2.0/x^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-0.0/x^10.0-0.0/x^7.0-0.0/x^6.0+0.0/x^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-0.0/x^10.0-0.0/x^7.0-0.0/x^6.0+0.0/x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-0.0*-10.0/x^11.0-0.0*-7.0/x^8.0-0.0*-6.0/x^7.0+0.0*-3.0/x^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "0.0/x^11.0+0.0/x^8.0+0.0/x^7.0-0.0/x^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "0.0/x^11.0+0.0/x^8.0+0.0/x^7.0-0.0/x^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "0.0*-11.0/x^12.0+0.0*-8.0/x^9.0+0.0*-7.0/x^8.0-0.0*-4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-0.0/x^12.0-0.0/x^9.0-0.0/x^8.0+0.0/x^5.0";
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
        public static void TestCaseDiff20019() {
        //Test Case 20019
        UsageCalculus.TestCase = 20019;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "2.0/2.0*1.0*-0/xy^8 + 1.0*-0/xy^5 + 1.0*-0/xy^4 - 1.0*-0/xy - 25*-0";
        UsageCalculus.TestCaseName = "Simple: Coefficients:0";
        UsageCalculus.TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xy";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-0.0/xy^8.0-0.0/xy^5.0-0.0/xy^4.0+0.0/xy";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0*-8.0/xy^9.0-0.0*-5.0/xy^6.0-0.0*-4.0/xy^5.0-0.0/xy^2.0";
        UsageCalculus.EqnSolArrayMap2[1] = "0.0/xy^9.0+0.0/xy^6.0+0.0/xy^5.0-0.0/xy^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="-0.0/xy^8.0-0.0/xy^5.0-0.0/xy^4.0+0.0/xy";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-0.0/-7.0/xy^7.0-0.0/-4.0/xy^4.0-0.0/-3.0/xy^3.0+0.0*ln(xy)";
        UsageCalculus.EqnSolArrayMap4[1]="0.0/xy^7.0+0.0/xy^4.0+0.0/xy^3.0+0.0*ln(xy)";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "0.0/xy^9.0+0.0/xy^6.0+0.0/xy^5.0-0.0/xy^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "0.0*-9.0/xy^10.0+0.0*-6.0/xy^7.0+0.0*-5.0/xy^6.0-0.0*-2.0/xy^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-0.0/xy^10.0-0.0/xy^7.0-0.0/xy^6.0+0.0/xy^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-0.0/xy^10.0-0.0/xy^7.0-0.0/xy^6.0+0.0/xy^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-0.0*-10.0/xy^11.0-0.0*-7.0/xy^8.0-0.0*-6.0/xy^7.0+0.0*-3.0/xy^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "0.0/xy^11.0+0.0/xy^8.0+0.0/xy^7.0-0.0/xy^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "0.0/xy^11.0+0.0/xy^8.0+0.0/xy^7.0-0.0/xy^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "0.0*-11.0/xy^12.0+0.0*-8.0/xy^9.0+0.0*-7.0/xy^8.0-0.0*-4.0/xy^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-0.0/xy^12.0-0.0/xy^9.0-0.0/xy^8.0+0.0/xy^5.0";
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
        public static void TestCaseDiff20020() {
        //Test Case 20020
        UsageCalculus.TestCase = 20020;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "3.0/3.0*1.0*+1/xyc^8 + 1.0*+1/xyc^5 + 1*+1/xyc^4 - 1*+1/xyc - 1*+1/25";
        UsageCalculus.TestCaseName = "Simple: Variables:3 Letter :Coefficients:+1:MAP";
        UsageCalculus.TestCaseMatrixID="Coefficients:+1:3 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc";
        UsageCalculus.MaxDiffOrder = 5;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/xyc^8.0+1.0/xyc^5.0+1.0/xyc^4.0-1.0/xyc-1.0/25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-8.0/xyc^9.0-5.0/xyc^6.0-4.0/xyc^5.0+1.0/xyc^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-8.0/xyc^9.0-5.0/xyc^6.0-4.0/xyc^5.0+1.0/xyc^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/xyc^8.0+1.0/xyc^5.0+1.0/xyc^4.0-1.0/xyc-1.0/25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/-7.0/xyc^7.0+1.0/-4.0/xyc^4.0+1.0/-3.0/xyc^3.0-ln(xyc)-1.0/25.0*xyc";
        UsageCalculus.EqnSolArrayMap4[1]="-1.0/7.0/xyc^7.0-1.0/4.0/xyc^4.0-1.0/3.0/xyc^3.0-ln(xyc)-1.0/25.0*xyc";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-8.0/xyc^9.0-5.0/xyc^6.0-4.0/xyc^5.0+1.0/xyc^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-8.0*-9.0/xyc^10.0-5.0*-6.0/xyc^7.0-4.0*-5.0/xyc^6.0-2.0/xyc^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "72.0/xyc^10.0+30.0/xyc^7.0+20.0/xyc^6.0-2.0/xyc^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "72.0/xyc^10.0+30.0/xyc^7.0+20.0/xyc^6.0-2.0/xyc^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "72.0*-10.0/xyc^11.0+30.0*-7.0/xyc^8.0+20.0*-6.0/xyc^7.0-2.0*-3.0/xyc^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-720.0/xyc^11.0-210.0/xyc^8.0-120.0/xyc^7.0+6.0/xyc^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-720.0/xyc^11.0-210.0/xyc^8.0-120.0/xyc^7.0+6.0/xyc^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-720.0*-11.0/xyc^12.0-210.0*-8.0/xyc^9.0-120.0*-7.0/xyc^8.0+6.0*-4.0/xyc^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "7920.0/xyc^12.0+1680.0/xyc^9.0+840.0/xyc^8.0-24.0/xyc^5.0";
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
        public static void TestCaseDiff20021() {
        //Test Case 20021
        UsageCalculus.TestCase = 20021;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1*+1.0/xyc1^8 + 1*+1.0/xyc1^5 + 1*+1.0/xyc1^4 - 1*+1.0/xyc1 - 1*+1.0/25";
        UsageCalculus.TestCaseName = "Simple: Variables:3 Letter with Numerics :Co-efficients:+1.0:MAP";
        UsageCalculus.TestCaseMatrixID="Coefficients:+1.0:3 Letter with Numerics:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/xyc1^8.0+1.0/xyc1^5.0+1.0/xyc1^4.0-1.0/xyc1-1.0/25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-8.0/xyc1^9.0-5.0/xyc1^6.0-4.0/xyc1^5.0+1.0/xyc1^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-8.0/xyc1^9.0-5.0/xyc1^6.0-4.0/xyc1^5.0+1.0/xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/xyc1^8.0+1.0/xyc1^5.0+1.0/xyc1^4.0-1.0/xyc1-1.0/25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/-7.0/xyc1^7.0+1.0/-4.0/xyc1^4.0+1.0/-3.0/xyc1^3.0-ln(xyc1)-1.0/25.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="-1.0/7.0/xyc1^7.0-1.0/4.0/xyc1^4.0-1.0/3.0/xyc1^3.0-ln(xyc1)-1.0/25.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-8.0/xyc1^9.0-5.0/xyc1^6.0-4.0/xyc1^5.0+1.0/xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-8.0*-9.0/xyc1^10.0-5.0*-6.0/xyc1^7.0-4.0*-5.0/xyc1^6.0-2.0/xyc1^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "72.0/xyc1^10.0+30.0/xyc1^7.0+20.0/xyc1^6.0-2.0/xyc1^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "72.0/xyc1^10.0+30.0/xyc1^7.0+20.0/xyc1^6.0-2.0/xyc1^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "72.0*-10.0/xyc1^11.0+30.0*-7.0/xyc1^8.0+20.0*-6.0/xyc1^7.0-2.0*-3.0/xyc1^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-720.0/xyc1^11.0-210.0/xyc1^8.0-120.0/xyc1^7.0+6.0/xyc1^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-720.0/xyc1^11.0-210.0/xyc1^8.0-120.0/xyc1^7.0+6.0/xyc1^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-720.0*-11.0/xyc1^12.0-210.0*-8.0/xyc1^9.0-120.0*-7.0/xyc1^8.0+6.0*-4.0/xyc1^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "7920.0/xyc1^12.0+1680.0/xyc1^9.0+840.0/xyc1^8.0-24.0/xyc1^5.0";
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
        public static void TestCaseDiff20022() {
        //Test Case 20022
        UsageCalculus.TestCase = 20022;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "1.0/+5/xyc1^8 + 1.0/+5*xyc1^5 + 1/+5*xyc1^4 + 1.0/+5*xyc1 + 1.0/+5/25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:+5";
        UsageCalculus.TestCaseMatrixID="Coefficients:+5:3 Letter with Numerics:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/5.0/xyc1^8.0+1.0/5.0*xyc1^5.0+1.0/5.0*xyc1^4.0+1.0/5.0*xyc1+1.0/125.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/5.0*-8.0/xyc1^9.0+1.0/5.0*5.0*xyc1^4.0+1.0/5.0*4.0*xyc1^3.0+1.0/5.0+1.0/125.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-1.6/xyc1^9.0+xyc1^4.0+1.0/1.25*xyc1^3.0+1.0/5.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/5.0/xyc1^8.0+1.0/5.0*xyc1^5.0+1.0/5.0*xyc1^4.0+1.0/5.0*xyc1+1.0/125.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/5.0/-7.0/xyc1^7.0+1.0/5.0/6.0*xyc1^6.0+1.0/5.0/5.0*xyc1^5.0+1.0/5.0/2.0*xyc1^2.0+1.0/125.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="-1.0/35.0/xyc1^7.0+1.0/30.0*xyc1^6.0+1.0/25.0*xyc1^5.0+1.0/10.0*xyc1^2.0+1.0/125.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-1.6/xyc1^9.0+xyc1^4.0+1.0/1.25*xyc1^3.0+1.0/5.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-1.6*-9.0/xyc1^10.0+4.0*xyc1^3.0+1.0/1.25*3.0*xyc1^2.0+1.0/5.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "14.4/xyc1^10.0+4.0*xyc1^3.0+2.4*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="-1.0/35.0/xyc1^7.0+1.0/30.0*xyc1^6.0+1.0/25.0*xyc1^5.0+1.0/10.0*xyc1^2.0+1.0/125.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-1.0/35.0/-6.0/xyc1^6.0+1.0/30.0/7.0*xyc1^7.0+1.0/25.0/6.0*xyc1^6.0+1.0/10.0/3.0*xyc1^3.0+1.0/125.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/210.0/xyc1^6.0+1.0/210.0*xyc1^7.0+1.0/150.0*xyc1^6.0+1.0/30.0*xyc1^3.0+1.0/250.0*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "14.4/xyc1^10.0+4.0*xyc1^3.0+2.4*xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "14.4*-10.0/xyc1^11.0+4.0*3.0*xyc1^2.0+2.4*2.0*xyc1^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-144.0/xyc1^11.0+12.0*xyc1^2.0+4.8*xyc1";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/210.0/xyc1^6.0+1.0/210.0*xyc1^7.0+1.0/150.0*xyc1^6.0+1.0/30.0*xyc1^3.0+1.0/250.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/210.0/-5.0/xyc1^5.0+1.0/210.0/8.0*xyc1^8.0+1.0/150.0/7.0*xyc1^7.0+1.0/30.0/4.0*xyc1^4.0+1.0/250.0/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-1.0/1050.0/xyc1^5.0+1.0/1680.0*xyc1^8.0+1.0/1050.0*xyc1^7.0+1.0/120.0*xyc1^4.0+1.0/750.0*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-144.0/xyc1^11.0+12.0*xyc1^2.0+4.8*xyc1";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-144.0*-11.0/xyc1^12.0+12.0*2.0*xyc1^1.0+4.8";
        UsageCalculus.EqnSolArrayMap2[4] = "1584.0/xyc1^12.0+24.0*xyc1+4.8";
        UsageCalculus.EqnSolArrayMap3[4]="-1.0/1050.0/xyc1^5.0+1.0/1680.0*xyc1^8.0+1.0/1050.0*xyc1^7.0+1.0/120.0*xyc1^4.0+1.0/750.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="-1.0/1050.0/-4.0/xyc1^4.0+1.0/1680.0/9.0*xyc1^9.0+1.0/1050.0/8.0*xyc1^8.0+1.0/120.0/5.0*xyc1^5.0+1.0/750.0/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/4200.0/xyc1^4.0+1.0/15120.0*xyc1^9.0+1.0/8400.0*xyc1^8.0+1.0/600.0*xyc1^5.0+1.0/3000.0*xyc1^4.0";
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
        public static void TestCaseDiff20023() {
        //Test Case 20023
        UsageCalculus.TestCase = 20023;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "-0.0/x^8 + (-0.0)/x^5 + (-0.0)/x^4 - (-0.0)/x- 25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:-0.0";
        UsageCalculus.TestCaseMatrixID="Coefficients:-0.0:1 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-0.0/x^8.0-0.0/x^5.0-0.0/x^4.0+0.0/x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0*-8.0/x^9.0-0.0*-5.0/x^6.0-0.0*-4.0/x^5.0-0.0/x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "0.0/x^9.0+0.0/x^6.0+0.0/x^5.0-0.0/x^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="-0.0/x^8.0-0.0/x^5.0-0.0/x^4.0+0.0/x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-0.0/-7.0/x^7.0-0.0/-4.0/x^4.0-0.0/-3.0/x^3.0+0.0*ln(x)-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="0.0/x^7.0+0.0/x^4.0+0.0/x^3.0+0.0*ln(x)-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "0.0/x^9.0+0.0/x^6.0+0.0/x^5.0-0.0/x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "0.0*-9.0/x^10.0+0.0*-6.0/x^7.0+0.0*-5.0/x^6.0-0.0*-2.0/x^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-0.0/x^10.0-0.0/x^7.0-0.0/x^6.0+0.0/x^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-0.0/x^10.0-0.0/x^7.0-0.0/x^6.0+0.0/x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-0.0*-10.0/x^11.0-0.0*-7.0/x^8.0-0.0*-6.0/x^7.0+0.0*-3.0/x^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "0.0/x^11.0+0.0/x^8.0+0.0/x^7.0-0.0/x^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "0.0/x^11.0+0.0/x^8.0+0.0/x^7.0-0.0/x^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "0.0*-11.0/x^12.0+0.0*-8.0/x^9.0+0.0*-7.0/x^8.0-0.0*-4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-0.0/x^12.0-0.0/x^9.0-0.0/x^8.0+0.0/x^5.0";
        UsageCalculus.EqnSolArrayMap3[4]="-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="-1.0416666666666667*x^4.0";
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
        public static void TestCaseDiff20024() {
        //Test Case 20024
        UsageCalculus.TestCase = 20024;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(-0)/xy^8 + (-0)/xy^5 + (-0)/xy^4 - (-0)/xy - 25*(-0)";
        UsageCalculus.TestCaseName = "Simple: Coefficients:0";
        UsageCalculus.TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xy";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-0.0/xy^8.0-0.0/xy^5.0-0.0/xy^4.0+0.0/xy";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0*-8.0/xy^9.0-0.0*-5.0/xy^6.0-0.0*-4.0/xy^5.0-0.0/xy^2.0";
        UsageCalculus.EqnSolArrayMap2[1] = "0.0/xy^9.0+0.0/xy^6.0+0.0/xy^5.0-0.0/xy^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="-0.0/xy^8.0-0.0/xy^5.0-0.0/xy^4.0+0.0/xy";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-0.0/-7.0/xy^7.0-0.0/-4.0/xy^4.0-0.0/-3.0/xy^3.0+0.0*ln(xy)";
        UsageCalculus.EqnSolArrayMap4[1]="0.0/xy^7.0+0.0/xy^4.0+0.0/xy^3.0+0.0*ln(xy)";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "0.0/xy^9.0+0.0/xy^6.0+0.0/xy^5.0-0.0/xy^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "0.0*-9.0/xy^10.0+0.0*-6.0/xy^7.0+0.0*-5.0/xy^6.0-0.0*-2.0/xy^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-0.0/xy^10.0-0.0/xy^7.0-0.0/xy^6.0+0.0/xy^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-0.0/xy^10.0-0.0/xy^7.0-0.0/xy^6.0+0.0/xy^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-0.0*-10.0/xy^11.0-0.0*-7.0/xy^8.0-0.0*-6.0/xy^7.0+0.0*-3.0/xy^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "0.0/xy^11.0+0.0/xy^8.0+0.0/xy^7.0-0.0/xy^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "0.0/xy^11.0+0.0/xy^8.0+0.0/xy^7.0-0.0/xy^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "0.0*-11.0/xy^12.0+0.0*-8.0/xy^9.0+0.0*-7.0/xy^8.0-0.0*-4.0/xy^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-0.0/xy^12.0-0.0/xy^9.0-0.0/xy^8.0+0.0/xy^5.0";
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
        public static void TestCaseDiff20025() {
        //Test Case 20025
        UsageCalculus.TestCase = 20025;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "+1/xyc^8 + 1/xyc^5 + 1/xyc^4 - 1/xyc - 1/25";
        //Usage.EqnUnderTest = "1/xyc^8 + 1/xyc^5 + 1/xyc^4 - 1/xyc - 1/25";
        UsageCalculus.TestCaseName = "Simple: Variables:3 Letter :Coefficients:+1:MAP";
        UsageCalculus.TestCaseMatrixID="Coefficients:+1:3 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/xyc^8.0+1.0/xyc^5.0+1.0/xyc^4.0-1.0/xyc-1.0/25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-8.0/xyc^9.0-5.0/xyc^6.0-4.0/xyc^5.0+1.0/xyc^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-8.0/xyc^9.0-5.0/xyc^6.0-4.0/xyc^5.0+1.0/xyc^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/xyc^8.0+1.0/xyc^5.0+1.0/xyc^4.0-1.0/xyc-1.0/25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/-7.0/xyc^7.0+1.0/-4.0/xyc^4.0+1.0/-3.0/xyc^3.0-ln(xyc)-1.0/25.0*xyc";
        UsageCalculus.EqnSolArrayMap4[1]="-1.0/7.0/xyc^7.0-1.0/4.0/xyc^4.0-1.0/3.0/xyc^3.0-ln(xyc)-1.0/25.0*xyc";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-8.0/xyc^9.0-5.0/xyc^6.0-4.0/xyc^5.0+1.0/xyc^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-8.0*-9.0/xyc^10.0-5.0*-6.0/xyc^7.0-4.0*-5.0/xyc^6.0-2.0/xyc^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "72.0/xyc^10.0+30.0/xyc^7.0+20.0/xyc^6.0-2.0/xyc^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "72.0/xyc^10.0+30.0/xyc^7.0+20.0/xyc^6.0-2.0/xyc^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "72.0*-10.0/xyc^11.0+30.0*-7.0/xyc^8.0+20.0*-6.0/xyc^7.0-2.0*-3.0/xyc^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-720.0/xyc^11.0-210.0/xyc^8.0-120.0/xyc^7.0+6.0/xyc^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-720.0/xyc^11.0-210.0/xyc^8.0-120.0/xyc^7.0+6.0/xyc^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-720.0*-11.0/xyc^12.0-210.0*-8.0/xyc^9.0-120.0*-7.0/xyc^8.0+6.0*-4.0/xyc^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "7920.0/xyc^12.0+1680.0/xyc^9.0+840.0/xyc^8.0-24.0/xyc^5.0";
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
        public static void TestCaseDiff20026() {
        //Test Case 20026
        UsageCalculus.TestCase = 20026;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "+1.0/xyc1^8 + 1.0/xyc1^5 + 1.0/xyc1^4 - 1.0/xyc1 - 1.0/25";
        UsageCalculus.TestCaseName = "Simple: Variables:3 Letter with Numerics :Co-efficients:+1.0:MAP";
        UsageCalculus.TestCaseMatrixID="Coefficients:+1.0:3 Letter with Numerics:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/xyc1^8.0+1.0/xyc1^5.0+1.0/xyc1^4.0-1.0/xyc1-1.0/25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-8.0/xyc1^9.0-5.0/xyc1^6.0-4.0/xyc1^5.0+1.0/xyc1^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-8.0/xyc1^9.0-5.0/xyc1^6.0-4.0/xyc1^5.0+1.0/xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/xyc1^8.0+1.0/xyc1^5.0+1.0/xyc1^4.0-1.0/xyc1-1.0/25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/-7.0/xyc1^7.0+1.0/-4.0/xyc1^4.0+1.0/-3.0/xyc1^3.0-ln(xyc1)-1.0/25.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="-1.0/7.0/xyc1^7.0-1.0/4.0/xyc1^4.0-1.0/3.0/xyc1^3.0-ln(xyc1)-1.0/25.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-8.0/xyc1^9.0-5.0/xyc1^6.0-4.0/xyc1^5.0+1.0/xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-8.0*-9.0/xyc1^10.0-5.0*-6.0/xyc1^7.0-4.0*-5.0/xyc1^6.0-2.0/xyc1^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "72.0/xyc1^10.0+30.0/xyc1^7.0+20.0/xyc1^6.0-2.0/xyc1^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "72.0/xyc1^10.0+30.0/xyc1^7.0+20.0/xyc1^6.0-2.0/xyc1^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "72.0*-10.0/xyc1^11.0+30.0*-7.0/xyc1^8.0+20.0*-6.0/xyc1^7.0-2.0*-3.0/xyc1^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-720.0/xyc1^11.0-210.0/xyc1^8.0-120.0/xyc1^7.0+6.0/xyc1^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-720.0/xyc1^11.0-210.0/xyc1^8.0-120.0/xyc1^7.0+6.0/xyc1^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-720.0*-11.0/xyc1^12.0-210.0*-8.0/xyc1^9.0-120.0*-7.0/xyc1^8.0+6.0*-4.0/xyc1^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "7920.0/xyc1^12.0+1680.0/xyc1^9.0+840.0/xyc1^8.0-24.0/xyc1^5.0";
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
       /*********************************************/
       /************ Missed Out Test Cases **********/
       /*********************************************/
       public static void TestCaseDiff20027() {
        //Test Case 20027
        UsageCalculus.TestCase = 20027;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "4.0/4.0*0.0/x^8 + 0.0/x^5 + 0.0/x^4 - 0.0/x- 25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:0.0";
        UsageCalculus.TestCaseMatrixID="Coefficients:0.0:1 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "0.0/x^8.0+0.0/x^5.0+0.0/x^4.0-0.0/x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0*-8.0/x^9.0+0.0*-5.0/x^6.0+0.0*-4.0/x^5.0+0.0/x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-0.0/x^9.0-0.0/x^6.0-0.0/x^5.0+0.0/x^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="0.0/x^8.0+0.0/x^5.0+0.0/x^4.0-0.0/x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="0.0/-7.0/x^7.0+0.0/-4.0/x^4.0+0.0/-3.0/x^3.0-0.0*ln(x)-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="-0.0/x^7.0-0.0/x^4.0-0.0/x^3.0-0.0*ln(x)-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-0.0/x^9.0-0.0/x^6.0-0.0/x^5.0+0.0/x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-0.0*-9.0/x^10.0-0.0*-6.0/x^7.0-0.0*-5.0/x^6.0+0.0*-2.0/x^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "0.0/x^10.0+0.0/x^7.0+0.0/x^6.0-0.0/x^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "0.0/x^10.0+0.0/x^7.0+0.0/x^6.0-0.0/x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "0.0*-10.0/x^11.0+0.0*-7.0/x^8.0+0.0*-6.0/x^7.0-0.0*-3.0/x^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-0.0/x^11.0-0.0/x^8.0-0.0/x^7.0+0.0/x^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-0.0/x^11.0-0.0/x^8.0-0.0/x^7.0+0.0/x^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*-11.0/x^12.0-0.0*-8.0/x^9.0-0.0*-7.0/x^8.0+0.0*-4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "0.0/x^12.0+0.0/x^9.0+0.0/x^8.0-0.0/x^5.0";
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
        public static void TestCaseDiff20028() {
        //Test Case 20028
        UsageCalculus.TestCase = 20028;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "0/xy^8 + 0/xy^5 + 0/xy^4 - 0/xy - 25/0";
        UsageCalculus.TestCaseName = "Simple: Coefficients:0";
        UsageCalculus.TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xy";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "0.0/xy^8.0+0.0/xy^5.0+0.0/xy^4.0-0.0/xy-Infinity";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0*-8.0/xy^9.0+0.0*-5.0/xy^6.0+0.0*-4.0/xy^5.0+0.0/xy^2.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-0.0/xy^9.0-0.0/xy^6.0-0.0/xy^5.0+0.0/xy^2.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="0.0/xy^8.0+0.0/xy^5.0+0.0/xy^4.0-0.0/xy-Infinity";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="0.0/-7.0/xy^7.0+0.0/-4.0/xy^4.0+0.0/-3.0/xy^3.0-0.0*ln(xy)-Infinity*xy";
        UsageCalculus.EqnSolArrayMap4[1]="-0.0/xy^7.0-0.0/xy^4.0-0.0/xy^3.0-0.0*ln(xy)-Infinity*xy";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-0.0/xy^9.0-0.0/xy^6.0-0.0/xy^5.0+0.0/xy^2.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-0.0*-9.0/xy^10.0-0.0*-6.0/xy^7.0-0.0*-5.0/xy^6.0+0.0*-2.0/xy^3.0-Infinity*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "0.0/xy^10.0+0.0/xy^7.0+0.0/xy^6.0-0.0/xy^3.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "0.0/xy^10.0+0.0/xy^7.0+0.0/xy^6.0-0.0/xy^3.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "0.0*-10.0/xy^11.0+0.0*-7.0/xy^8.0+0.0*-6.0/xy^7.0-0.0*-3.0/xy^4.0-Infinity*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-0.0/xy^11.0-0.0/xy^8.0-0.0/xy^7.0+0.0/xy^4.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-0.0/xy^11.0-0.0/xy^8.0-0.0/xy^7.0+0.0/xy^4.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*-11.0/xy^12.0-0.0*-8.0/xy^9.0-0.0*-7.0/xy^8.0+0.0*-4.0/xy^5.0-Infinity*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "0.0/xy^12.0+0.0/xy^9.0+0.0/xy^8.0-0.0/xy^5.0-Infinity*0.0";
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
        public static void TestCaseDiff20029() {
        //Test Case 20029
        UsageCalculus.TestCase = 20029;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1/xyc^8 + 1/xyc^5 + 1/xyc^4 - 1/xyc - 1/25";
        UsageCalculus.TestCaseName = "Simple: Variables:3 Letter:MAP";
        UsageCalculus.TestCaseMatrixID="Coefficients:1:3 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/xyc^8.0+1.0/xyc^5.0+1.0/xyc^4.0-1.0/xyc-1.0/25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-8.0/xyc^9.0-5.0/xyc^6.0-4.0/xyc^5.0+1.0/xyc^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-8.0/xyc^9.0-5.0/xyc^6.0-4.0/xyc^5.0+1.0/xyc^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/xyc^8.0+1.0/xyc^5.0+1.0/xyc^4.0-1.0/xyc-1.0/25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/-7.0/xyc^7.0+1.0/-4.0/xyc^4.0+1.0/-3.0/xyc^3.0-ln(xyc)-1.0/25.0*xyc";
        UsageCalculus.EqnSolArrayMap4[1]="-1.0/7.0/xyc^7.0-1.0/4.0/xyc^4.0-1.0/3.0/xyc^3.0-ln(xyc)-1.0/25.0*xyc";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-8.0/xyc^9.0-5.0/xyc^6.0-4.0/xyc^5.0+1.0/xyc^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-8.0*-9.0/xyc^10.0-5.0*-6.0/xyc^7.0-4.0*-5.0/xyc^6.0-2.0/xyc^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "72.0/xyc^10.0+30.0/xyc^7.0+20.0/xyc^6.0-2.0/xyc^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "72.0/xyc^10.0+30.0/xyc^7.0+20.0/xyc^6.0-2.0/xyc^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "72.0*-10.0/xyc^11.0+30.0*-7.0/xyc^8.0+20.0*-6.0/xyc^7.0-2.0*-3.0/xyc^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-720.0/xyc^11.0-210.0/xyc^8.0-120.0/xyc^7.0+6.0/xyc^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-720.0/xyc^11.0-210.0/xyc^8.0-120.0/xyc^7.0+6.0/xyc^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-720.0*-11.0/xyc^12.0-210.0*-8.0/xyc^9.0-120.0*-7.0/xyc^8.0+6.0*-4.0/xyc^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "7920.0/xyc^12.0+1680.0/xyc^9.0+840.0/xyc^8.0-24.0/xyc^5.0";
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
        public static void TestCaseDiff20030() {
        //Test Case 20030
        UsageCalculus.TestCase = 20030;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0/xyc1^8 + 1.0/xyc1^5 + 1.0/xyc1^4 - 1.0/xyc1 - 1.0/25";
        UsageCalculus.TestCaseName = "Simple: Variables:3 Letter with Numerics:MAP";
        UsageCalculus.TestCaseMatrixID="Coefficients:1.0:3 Letter with Numerics:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/xyc1^8.0+1.0/xyc1^5.0+1.0/xyc1^4.0-1.0/xyc1-1.0/25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-8.0/xyc1^9.0-5.0/xyc1^6.0-4.0/xyc1^5.0+1.0/xyc1^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-8.0/xyc1^9.0-5.0/xyc1^6.0-4.0/xyc1^5.0+1.0/xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/xyc1^8.0+1.0/xyc1^5.0+1.0/xyc1^4.0-1.0/xyc1-1.0/25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/-7.0/xyc1^7.0+1.0/-4.0/xyc1^4.0+1.0/-3.0/xyc1^3.0-ln(xyc1)-1.0/25.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="-1.0/7.0/xyc1^7.0-1.0/4.0/xyc1^4.0-1.0/3.0/xyc1^3.0-ln(xyc1)-1.0/25.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-8.0/xyc1^9.0-5.0/xyc1^6.0-4.0/xyc1^5.0+1.0/xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-8.0*-9.0/xyc1^10.0-5.0*-6.0/xyc1^7.0-4.0*-5.0/xyc1^6.0-2.0/xyc1^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "72.0/xyc1^10.0+30.0/xyc1^7.0+20.0/xyc1^6.0-2.0/xyc1^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "72.0/xyc1^10.0+30.0/xyc1^7.0+20.0/xyc1^6.0-2.0/xyc1^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "72.0*-10.0/xyc1^11.0+30.0*-7.0/xyc1^8.0+20.0*-6.0/xyc1^7.0-2.0*-3.0/xyc1^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-720.0/xyc1^11.0-210.0/xyc1^8.0-120.0/xyc1^7.0+6.0/xyc1^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-720.0/xyc1^11.0-210.0/xyc1^8.0-120.0/xyc1^7.0+6.0/xyc1^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-720.0*-11.0/xyc1^12.0-210.0*-8.0/xyc1^9.0-120.0*-7.0/xyc1^8.0+6.0*-4.0/xyc1^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "7920.0/xyc1^12.0+1680.0/xyc1^9.0+840.0/xyc1^8.0-24.0/xyc1^5.0";
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
    public static void TestCaseDiff20031() {
        //Test Case 20031
        UsageCalculus.TestCase = 20031;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "-1.0/x^8 -1.0/x^5 -1.0/x^4 -1.0/x- 25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:-1.0:MAP";
        UsageCalculus.TestCaseMatrixID="Coefficients:-1.0:1 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-1.0/x^8.0-1.0/x^5.0-1.0/x^4.0-1.0/x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0/x^9.0+5.0/x^6.0+4.0/x^5.0+1.0/x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0/x^9.0+5.0/x^6.0+4.0/x^5.0+1.0/x^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="-1.0/x^8.0-1.0/x^5.0-1.0/x^4.0-1.0/x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-1.0/-7.0/x^7.0-1.0/-4.0/x^4.0-1.0/-3.0/x^3.0-ln(x)-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/7.0/x^7.0+1.0/4.0/x^4.0+1.0/3.0/x^3.0-ln(x)-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0/x^9.0+5.0/x^6.0+4.0/x^5.0+1.0/x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*-9.0/x^10.0+5.0*-6.0/x^7.0+4.0*-5.0/x^6.0-2.0/x^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-72.0/x^10.0-30.0/x^7.0-20.0/x^6.0-2.0/x^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-72.0/x^10.0-30.0/x^7.0-20.0/x^6.0-2.0/x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-72.0*-10.0/x^11.0-30.0*-7.0/x^8.0-20.0*-6.0/x^7.0-2.0*-3.0/x^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "720.0/x^11.0+210.0/x^8.0+120.0/x^7.0+6.0/x^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "720.0/x^11.0+210.0/x^8.0+120.0/x^7.0+6.0/x^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "720.0*-11.0/x^12.0+210.0*-8.0/x^9.0+120.0*-7.0/x^8.0+6.0*-4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-7920.0/x^12.0-1680.0/x^9.0-840.0/x^8.0-24.0/x^5.0";
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
        public static void TestCaseDiff20032() {
        //Test Case 20032
        UsageCalculus.TestCase = 20032;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "-1/xy^8 -1/xy^5 -1/xy^4 -1/xy - 25/-1";
        UsageCalculus.TestCaseName = "Simple: Coefficients:-1";
        UsageCalculus.TestCaseMatrixID="Coefficients:-1:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xy";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-1.0/xy^8.0-1.0/xy^5.0-1.0/xy^4.0-1.0/xy+25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0/xy^9.0+5.0/xy^6.0+4.0/xy^5.0+1.0/xy^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0/xy^9.0+5.0/xy^6.0+4.0/xy^5.0+1.0/xy^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="-1.0/xy^8.0-1.0/xy^5.0-1.0/xy^4.0-1.0/xy+25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-1.0/-7.0/xy^7.0-1.0/-4.0/xy^4.0-1.0/-3.0/xy^3.0-ln(xy)+25.0*xy";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/7.0/xy^7.0+1.0/4.0/xy^4.0+1.0/3.0/xy^3.0-ln(xy)+25.0*xy";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0/xy^9.0+5.0/xy^6.0+4.0/xy^5.0+1.0/xy^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*-9.0/xy^10.0+5.0*-6.0/xy^7.0+4.0*-5.0/xy^6.0-2.0/xy^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-72.0/xy^10.0-30.0/xy^7.0-20.0/xy^6.0-2.0/xy^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-72.0/xy^10.0-30.0/xy^7.0-20.0/xy^6.0-2.0/xy^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-72.0*-10.0/xy^11.0-30.0*-7.0/xy^8.0-20.0*-6.0/xy^7.0-2.0*-3.0/xy^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "720.0/xy^11.0+210.0/xy^8.0+120.0/xy^7.0+6.0/xy^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "720.0/xy^11.0+210.0/xy^8.0+120.0/xy^7.0+6.0/xy^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "720.0*-11.0/xy^12.0+210.0*-8.0/xy^9.0+120.0*-7.0/xy^8.0+6.0*-4.0/xy^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-7920.0/xy^12.0-1680.0/xy^9.0-840.0/xy^8.0-24.0/xy^5.0";
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
        public static void TestCaseDiff20033() {
        //Test Case 20033
        UsageCalculus.TestCase = 20033;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "5/x^8 + 5/x^5 + 5/x^4 - 5/x- 25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:5";
        UsageCalculus.TestCaseMatrixID="Coefficients:5:1 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "5.0/x^8.0+5.0/x^5.0+5.0/x^4.0-5.0/x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "5.0*-8.0/x^9.0+5.0*-5.0/x^6.0+5.0*-4.0/x^5.0+5.0/x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-40.0/x^9.0-25.0/x^6.0-20.0/x^5.0+5.0/x^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="5.0/x^8.0+5.0/x^5.0+5.0/x^4.0-5.0/x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="5.0/-7.0/x^7.0+5.0/-4.0/x^4.0+5.0/-3.0/x^3.0-5.0*ln(x)-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="-1.0/1.4/x^7.0-1.25/x^4.0-1.6666666666666667/x^3.0-5.0*ln(x)-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-40.0/x^9.0-25.0/x^6.0-20.0/x^5.0+5.0/x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-40.0*-9.0/x^10.0-25.0*-6.0/x^7.0-20.0*-5.0/x^6.0+5.0*-2.0/x^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "360.0/x^10.0+150.0/x^7.0+100.0/x^6.0-10.0/x^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "360.0/x^10.0+150.0/x^7.0+100.0/x^6.0-10.0/x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "360.0*-10.0/x^11.0+150.0*-7.0/x^8.0+100.0*-6.0/x^7.0-10.0*-3.0/x^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-3600.0/x^11.0-1050.0/x^8.0-600.0/x^7.0+30.0/x^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-3600.0/x^11.0-1050.0/x^8.0-600.0/x^7.0+30.0/x^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-3600.0*-11.0/x^12.0-1050.0*-8.0/x^9.0-600.0*-7.0/x^8.0+30.0*-4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "39600.0/x^12.0+8400.0/x^9.0+4200.0/x^8.0-120.0/x^5.0";
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
        public static void TestCaseDiff20034() {
        //Test Case 20034
        UsageCalculus.TestCase = 20034;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "-5/xy^8 - 5/xy^5 - 5/xy^4 - 5/xy - 25/-5";
        UsageCalculus.TestCaseName = "Simple: Coefficients:-5";
        UsageCalculus.TestCaseMatrixID="Coefficients:-5:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xy";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-5.0/xy^8.0-5.0/xy^5.0-5.0/xy^4.0-5.0/xy+5.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-5.0*-8.0/xy^9.0-5.0*-5.0/xy^6.0-5.0*-4.0/xy^5.0+5.0/xy^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "40.0/xy^9.0+25.0/xy^6.0+20.0/xy^5.0+5.0/xy^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="-5.0/xy^8.0-5.0/xy^5.0-5.0/xy^4.0-5.0/xy+5.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-5.0/-7.0/xy^7.0-5.0/-4.0/xy^4.0-5.0/-3.0/xy^3.0-5.0*ln(xy)+5.0*xy";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1.4/xy^7.0+1.25/xy^4.0+1.6666666666666667/xy^3.0-5.0*ln(xy)+5.0*xy";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "40.0/xy^9.0+25.0/xy^6.0+20.0/xy^5.0+5.0/xy^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "40.0*-9.0/xy^10.0+25.0*-6.0/xy^7.0+20.0*-5.0/xy^6.0+5.0*-2.0/xy^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-360.0/xy^10.0-150.0/xy^7.0-100.0/xy^6.0-10.0/xy^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-360.0/xy^10.0-150.0/xy^7.0-100.0/xy^6.0-10.0/xy^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-360.0*-10.0/xy^11.0-150.0*-7.0/xy^8.0-100.0*-6.0/xy^7.0-10.0*-3.0/xy^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "3600.0/xy^11.0+1050.0/xy^8.0+600.0/xy^7.0+30.0/xy^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "3600.0/xy^11.0+1050.0/xy^8.0+600.0/xy^7.0+30.0/xy^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "3600.0*-11.0/xy^12.0+1050.0*-8.0/xy^9.0+600.0*-7.0/xy^8.0+30.0*-4.0/xy^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-39600.0/xy^12.0-8400.0/xy^9.0-4200.0/xy^8.0-120.0/xy^5.0";
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
        public static void TestCaseDiff20035() {
        //Test Case 20035
        UsageCalculus.TestCase = 20035;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "-5.0/xyc1^8 - 5.0/xyc1^5 - 5.0/xyc1^4 - 5.0/xyc1 - 5.0/25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:-5.0";
        UsageCalculus.TestCaseMatrixID="Coefficients:-5.0:3 Letter with Numerics:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-5.0/xyc1^8.0-5.0/xyc1^5.0-5.0/xyc1^4.0-5.0/xyc1-1.0/5.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-5.0*-8.0/xyc1^9.0-5.0*-5.0/xyc1^6.0-5.0*-4.0/xyc1^5.0+5.0/xyc1^2.0-1.0/5.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "40.0/xyc1^9.0+25.0/xyc1^6.0+20.0/xyc1^5.0+5.0/xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="-5.0/xyc1^8.0-5.0/xyc1^5.0-5.0/xyc1^4.0-5.0/xyc1-1.0/5.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-5.0/-7.0/xyc1^7.0-5.0/-4.0/xyc1^4.0-5.0/-3.0/xyc1^3.0-5.0*ln(xyc1)-1.0/5.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1.4/xyc1^7.0+1.25/xyc1^4.0+1.6666666666666667/xyc1^3.0-5.0*ln(xyc1)-1.0/5.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "40.0/xyc1^9.0+25.0/xyc1^6.0+20.0/xyc1^5.0+5.0/xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "40.0*-9.0/xyc1^10.0+25.0*-6.0/xyc1^7.0+20.0*-5.0/xyc1^6.0+5.0*-2.0/xyc1^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-360.0/xyc1^10.0-150.0/xyc1^7.0-100.0/xyc1^6.0-10.0/xyc1^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-360.0/xyc1^10.0-150.0/xyc1^7.0-100.0/xyc1^6.0-10.0/xyc1^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-360.0*-10.0/xyc1^11.0-150.0*-7.0/xyc1^8.0-100.0*-6.0/xyc1^7.0-10.0*-3.0/xyc1^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "3600.0/xyc1^11.0+1050.0/xyc1^8.0+600.0/xyc1^7.0+30.0/xyc1^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "3600.0/xyc1^11.0+1050.0/xyc1^8.0+600.0/xyc1^7.0+30.0/xyc1^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "3600.0*-11.0/xyc1^12.0+1050.0*-8.0/xyc1^9.0+600.0*-7.0/xyc1^8.0+30.0*-4.0/xyc1^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-39600.0/xyc1^12.0-8400.0/xyc1^9.0-4200.0/xyc1^8.0-120.0/xyc1^5.0";
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
        public static void TestCaseDiff20036() {
        //Test Case 20036
        UsageCalculus.TestCase = 20036;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "1.0/+5.0/xyc1^8 + 1.0/+5.0*xyc1^5 + 1.0/+5.0*xyc1^4 + 1.0/+5.0*xyc1 + 1.0/+5.0/25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:+5.0";
        UsageCalculus.TestCaseMatrixID="Coefficients:+5.0:3 Letter with Numerics:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 5;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/5.0/xyc1^8.0+1.0/5.0*xyc1^5.0+1.0/5.0*xyc1^4.0+1.0/5.0*xyc1+1.0/125.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/5.0*-8.0/xyc1^9.0+1.0/5.0*5.0*xyc1^4.0+1.0/5.0*4.0*xyc1^3.0+1.0/5.0+1.0/125.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-1.6/xyc1^9.0+xyc1^4.0+1.0/1.25*xyc1^3.0+1.0/5.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/5.0/xyc1^8.0+1.0/5.0*xyc1^5.0+1.0/5.0*xyc1^4.0+1.0/5.0*xyc1+1.0/125.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/5.0/-7.0/xyc1^7.0+1.0/5.0/6.0*xyc1^6.0+1.0/5.0/5.0*xyc1^5.0+1.0/5.0/2.0*xyc1^2.0+1.0/125.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="-1.0/35.0/xyc1^7.0+1.0/30.0*xyc1^6.0+1.0/25.0*xyc1^5.0+1.0/10.0*xyc1^2.0+1.0/125.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-1.6/xyc1^9.0+xyc1^4.0+1.0/1.25*xyc1^3.0+1.0/5.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-1.6*-9.0/xyc1^10.0+4.0*xyc1^3.0+1.0/1.25*3.0*xyc1^2.0+1.0/5.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "14.4/xyc1^10.0+4.0*xyc1^3.0+2.4*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="-1.0/35.0/xyc1^7.0+1.0/30.0*xyc1^6.0+1.0/25.0*xyc1^5.0+1.0/10.0*xyc1^2.0+1.0/125.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-1.0/35.0/-6.0/xyc1^6.0+1.0/30.0/7.0*xyc1^7.0+1.0/25.0/6.0*xyc1^6.0+1.0/10.0/3.0*xyc1^3.0+1.0/125.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/210.0/xyc1^6.0+1.0/210.0*xyc1^7.0+1.0/150.0*xyc1^6.0+1.0/30.0*xyc1^3.0+1.0/250.0*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "14.4/xyc1^10.0+4.0*xyc1^3.0+2.4*xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "14.4*-10.0/xyc1^11.0+4.0*3.0*xyc1^2.0+2.4*2.0*xyc1^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-144.0/xyc1^11.0+12.0*xyc1^2.0+4.8*xyc1";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/210.0/xyc1^6.0+1.0/210.0*xyc1^7.0+1.0/150.0*xyc1^6.0+1.0/30.0*xyc1^3.0+1.0/250.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/210.0/-5.0/xyc1^5.0+1.0/210.0/8.0*xyc1^8.0+1.0/150.0/7.0*xyc1^7.0+1.0/30.0/4.0*xyc1^4.0+1.0/250.0/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-1.0/1050.0/xyc1^5.0+1.0/1680.0*xyc1^8.0+1.0/1050.0*xyc1^7.0+1.0/120.0*xyc1^4.0+1.0/750.0*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-144.0/xyc1^11.0+12.0*xyc1^2.0+4.8*xyc1";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-144.0*-11.0/xyc1^12.0+12.0*2.0*xyc1^1.0+4.8";
        UsageCalculus.EqnSolArrayMap2[4] = "1584.0/xyc1^12.0+24.0*xyc1+4.8";
        UsageCalculus.EqnSolArrayMap3[4]="-1.0/1050.0/xyc1^5.0+1.0/1680.0*xyc1^8.0+1.0/1050.0*xyc1^7.0+1.0/120.0*xyc1^4.0+1.0/750.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="-1.0/1050.0/-4.0/xyc1^4.0+1.0/1680.0/9.0*xyc1^9.0+1.0/1050.0/8.0*xyc1^8.0+1.0/120.0/5.0*xyc1^5.0+1.0/750.0/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/4200.0/xyc1^4.0+1.0/15120.0*xyc1^9.0+1.0/8400.0*xyc1^8.0+1.0/600.0*xyc1^5.0+1.0/3000.0*xyc1^4.0";
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
        public static void TestCaseDiff20037() {
        //Test Case 20037
        UsageCalculus.TestCase = 20037;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "1.0/+1*xyc1^8 + 1.0/+1*xyc1^5 + 1.0/+1*xyc1^4 + 1.0/+1*xyc1 + 1.0/+1*25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:+1";
        UsageCalculus.TestCaseMatrixID="Coefficients:+1:3 Letter with Numerics:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "xyc1^8.0+xyc1^5.0+xyc1^4.0+xyc1+25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*xyc1^7.0+5.0*xyc1^4.0+4.0*xyc1^3.0+1.0+0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*xyc1^7.0+5.0*xyc1^4.0+4.0*xyc1^3.0+1.0";
        UsageCalculus.EqnSolArrayMap3[1]="xyc1^8.0+xyc1^5.0+xyc1^4.0+xyc1+25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/9.0*xyc1^9.0+1.0/6.0*xyc1^6.0+1.0/5.0*xyc1^5.0+1.0/2.0*xyc1^2.0+25.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/9.0*xyc1^9.0+1.0/6.0*xyc1^6.0+1.0/5.0*xyc1^5.0+1.0/2.0*xyc1^2.0+25.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*xyc1^7.0+5.0*xyc1^4.0+4.0*xyc1^3.0+1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*7.0*xyc1^6.0+5.0*4.0*xyc1^3.0+4.0*3.0*xyc1^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*xyc1^6.0+20.0*xyc1^3.0+12.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/9.0*xyc1^9.0+1.0/6.0*xyc1^6.0+1.0/5.0*xyc1^5.0+1.0/2.0*xyc1^2.0+25.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/9.0/10.0*xyc1^10.0+1.0/6.0/7.0*xyc1^7.0+1.0/5.0/6.0*xyc1^6.0+1.0/2.0/3.0*xyc1^3.0+25.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/90.0*xyc1^10.0+1.0/42.0*xyc1^7.0+1.0/30.0*xyc1^6.0+1.0/6.0*xyc1^3.0+12.5*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*xyc1^6.0+20.0*xyc1^3.0+12.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*xyc1^5.0+20.0*3.0*xyc1^2.0+12.0*2.0*xyc1^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*xyc1^5.0+60.0*xyc1^2.0+24.0*xyc1";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/90.0*xyc1^10.0+1.0/42.0*xyc1^7.0+1.0/30.0*xyc1^6.0+1.0/6.0*xyc1^3.0+12.5*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/90.0/11.0*xyc1^11.0+1.0/42.0/8.0*xyc1^8.0+1.0/30.0/7.0*xyc1^7.0+1.0/6.0/4.0*xyc1^4.0+12.5/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/990.0*xyc1^11.0+1.0/336.0*xyc1^8.0+1.0/210.0*xyc1^7.0+1.0/24.0*xyc1^4.0+4.166666666666667*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*xyc1^5.0+60.0*xyc1^2.0+24.0*xyc1";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*xyc1^4.0+60.0*2.0*xyc1^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*xyc1^4.0+120.0*xyc1+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/990.0*xyc1^11.0+1.0/336.0*xyc1^8.0+1.0/210.0*xyc1^7.0+1.0/24.0*xyc1^4.0+4.166666666666667*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/990.0/12.0*xyc1^12.0+1.0/336.0/9.0*xyc1^9.0+1.0/210.0/8.0*xyc1^8.0+1.0/24.0/5.0*xyc1^5.0+4.166666666666667/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/11880.0*xyc1^12.0+1.0/3024.0*xyc1^9.0+1.0/1680.0*xyc1^8.0+1.0/120.0*xyc1^5.0+1.0416666666666667*xyc1^4.0";
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
        public static void TestCaseDiff20038() {
        //Test Case 20038
        UsageCalculus.TestCase = 20038;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "1.0/+1.0*xyc1^8 + 1.0/+1.0*xyc1^5 + 1.0/+1.0*xyc1^4 + 1.0/+1.0/xyc1 + 1.0/+1.0/25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:+1.0:MAP";
        UsageCalculus.TestCaseMatrixID="Coefficients:+1.0:3 Letter with Numerics:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "xyc1^8.0+xyc1^5.0+xyc1^4.0+1.0/xyc1+1.0/25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*xyc1^7.0+5.0*xyc1^4.0+4.0*xyc1^3.0-1.0/xyc1^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*xyc1^7.0+5.0*xyc1^4.0+4.0*xyc1^3.0-1.0/xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="xyc1^8.0+xyc1^5.0+xyc1^4.0+1.0/xyc1+1.0/25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/9.0*xyc1^9.0+1.0/6.0*xyc1^6.0+1.0/5.0*xyc1^5.0+ln(xyc1)+1.0/25.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/9.0*xyc1^9.0+1.0/6.0*xyc1^6.0+0.2*xyc1^5.0+ln(xyc1)+1.0/25.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*xyc1^7.0+5.0*xyc1^4.0+4.0*xyc1^3.0-1.0/xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*7.0*xyc1^6.0+5.0*4.0*xyc1^3.0+4.0*3.0*xyc1^2.0+2.0/xyc1^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*xyc1^6.0+20.0*xyc1^3.0+12.0*xyc1^2.0+2.0/xyc1^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*xyc1^6.0+20.0*xyc1^3.0+12.0*xyc1^2.0+2.0/xyc1^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*xyc1^5.0+20.0*3.0*xyc1^2.0+12.0*2.0*xyc1^1.0+2.0*-3.0/xyc1^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*xyc1^5.0+60.0*xyc1^2.0+24.0*xyc1-6.0/xyc1^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*xyc1^5.0+60.0*xyc1^2.0+24.0*xyc1-6.0/xyc1^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*xyc1^4.0+60.0*2.0*xyc1^1.0+24.0-6.0*-4.0/xyc1^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*xyc1^4.0+120.0*xyc1+24.0+24.0/xyc1^5.0";
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
        public static void TestCaseDiff20039() {
        //Test Case 20039
        UsageCalculus.TestCase = 20039;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "1.0/+5.0/xyc1^8 + 1.0/+5.0/xyc1^5 + 1.0/+5.0*xyc1^4 + 1.0/+5.0*xyc1 + 1.0/+5.0*25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:+5.0";
        UsageCalculus.TestCaseMatrixID="Coefficients:+5.0:3 Letter with Numerics:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/5.0/xyc1^8.0+1.0/5.0/xyc1^5.0+1.0/5.0*xyc1^4.0+1.0/5.0*xyc1+5.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/5.0*-8.0/xyc1^9.0+1.0/5.0*-5.0/xyc1^6.0+1.0/5.0*4.0*xyc1^3.0+1.0/5.0+5.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-1.6/xyc1^9.0-1.0/xyc1^6.0+1.0/1.25*xyc1^3.0+1.0/5.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/5.0/xyc1^8.0+1.0/5.0/xyc1^5.0+1.0/5.0*xyc1^4.0+1.0/5.0*xyc1+5.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/5.0/-7.0/xyc1^7.0+1.0/5.0/-4.0/xyc1^4.0+1.0/5.0/5.0*xyc1^5.0+1.0/5.0/2.0*xyc1^2.0+5.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="-1.0/35.0/xyc1^7.0-1.0/20.0/xyc1^4.0+1.0/25.0*xyc1^5.0+1.0/10.0*xyc1^2.0+5.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-1.6/xyc1^9.0-1.0/xyc1^6.0+1.0/1.25*xyc1^3.0+1.0/5.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-1.6*-9.0/xyc1^10.0+6.0/xyc1^7.0+1.0/1.25*3.0*xyc1^2.0+1.0/5.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "14.4/xyc1^10.0+6.0/xyc1^7.0+2.4*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="-1.0/35.0/xyc1^7.0-1.0/20.0/xyc1^4.0+1.0/25.0*xyc1^5.0+1.0/10.0*xyc1^2.0+5.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-1.0/35.0/-6.0/xyc1^6.0-1.0/20.0/-3.0/xyc1^3.0+1.0/25.0/6.0*xyc1^6.0+1.0/10.0/3.0*xyc1^3.0+5.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/210.0/xyc1^6.0+1.0/60.0/xyc1^3.0+1.0/150.0*xyc1^6.0+1.0/30.0*xyc1^3.0+2.5*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "14.4/xyc1^10.0+6.0/xyc1^7.0+2.4*xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "14.4*-10.0/xyc1^11.0+6.0*-7.0/xyc1^8.0+2.4*2.0*xyc1^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-144.0/xyc1^11.0-42.0/xyc1^8.0+4.8*xyc1";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/210.0/xyc1^6.0+1.0/60.0/xyc1^3.0+1.0/150.0*xyc1^6.0+1.0/30.0*xyc1^3.0+2.5*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/210.0/-5.0/xyc1^5.0+1.0/60.0/-2.0/xyc1^2.0+1.0/150.0/7.0*xyc1^7.0+1.0/30.0/4.0*xyc1^4.0+2.5/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-1.0/1050.0/xyc1^5.0-1.0/120.0/xyc1^2.0+1.0/1050.0*xyc1^7.0+1.0/120.0*xyc1^4.0+1.0/1.2*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-144.0/xyc1^11.0-42.0/xyc1^8.0+4.8*xyc1";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-144.0*-11.0/xyc1^12.0-42.0*-8.0/xyc1^9.0+4.8";
        UsageCalculus.EqnSolArrayMap2[4] = "1584.0/xyc1^12.0+336.0/xyc1^9.0+4.8";
        UsageCalculus.EqnSolArrayMap3[4]="-1.0/1050.0/xyc1^5.0-1.0/120.0/xyc1^2.0+1.0/1050.0*xyc1^7.0+1.0/120.0*xyc1^4.0+1.0/1.2*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="-1.0/1050.0/-4.0/xyc1^4.0-1.0/120.0/-1.0/xyc1^1.0+1.0/1050.0/8.0*xyc1^8.0+1.0/120.0/5.0*xyc1^5.0+1.0/1.2/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/4200.0/xyc1^4.0+1.0/120.0/xyc1+1.0/8400.0*xyc1^8.0+1.0/600.0*xyc1^5.0+1.0/4.8*xyc1^4.0";
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
        public static void TestCaseDiff20040() {
        //Test Case 20040
        UsageCalculus.TestCase = 20040;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "1.0/+5*xyc1^8 + 1.0/+5*xyc1^5 + 1.0/+5*xyc1^4 + 1.0/+5*xyc1 + 1.0/+5*25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:+5";
        UsageCalculus.TestCaseMatrixID="Coefficients:+5:3 Letter with Numerics:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 4;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/5.0*xyc1^8.0+1.0/5.0*xyc1^5.0+1.0/5.0*xyc1^4.0+1.0/5.0*xyc1+5.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/5.0*8.0*xyc1^7.0+1.0/5.0*5.0*xyc1^4.0+1.0/5.0*4.0*xyc1^3.0+1.0/5.0+5.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.6*xyc1^7.0+xyc1^4.0+1.0/1.25*xyc1^3.0+1.0/5.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/5.0*xyc1^8.0+1.0/5.0*xyc1^5.0+1.0/5.0*xyc1^4.0+1.0/5.0*xyc1+5.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/5.0/9.0*xyc1^9.0+1.0/5.0/6.0*xyc1^6.0+1.0/5.0/5.0*xyc1^5.0+1.0/5.0/2.0*xyc1^2.0+5.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/45.0*xyc1^9.0+1.0/30.0*xyc1^6.0+1.0/25.0*xyc1^5.0+1.0/10.0*xyc1^2.0+5.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.6*xyc1^7.0+xyc1^4.0+1.0/1.25*xyc1^3.0+1.0/5.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "1.6*7.0*xyc1^6.0+4.0*xyc1^3.0+1.0/1.25*3.0*xyc1^2.0+1.0/5.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "11.200000000000001*xyc1^6.0+4.0*xyc1^3.0+2.4*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/45.0*xyc1^9.0+1.0/30.0*xyc1^6.0+1.0/25.0*xyc1^5.0+1.0/10.0*xyc1^2.0+5.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/45.0/10.0*xyc1^10.0+1.0/30.0/7.0*xyc1^7.0+1.0/25.0/6.0*xyc1^6.0+1.0/10.0/3.0*xyc1^3.0+5.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/450.0*xyc1^10.0+1.0/210.0*xyc1^7.0+1.0/150.0*xyc1^6.0+1.0/30.0*xyc1^3.0+2.5*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "11.200000000000001*xyc1^6.0+4.0*xyc1^3.0+2.4*xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "11.200000000000001*6.0*xyc1^5.0+4.0*3.0*xyc1^2.0+2.4*2.0*xyc1^1.00";
        UsageCalculus.EqnSolArrayMap2[3] = "67.2*xyc1^5.0+12.0*xyc1^2.0+4.8*xyc1";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/450.0*xyc1^10.0+1.0/210.0*xyc1^7.0+1.0/150.0*xyc1^6.0+1.0/30.0*xyc1^3.0+2.5*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/450.0/11.0*xyc1^11.0+1.0/210.0/8.0*xyc1^8.0+1.0/150.0/7.0*xyc1^7.0+1.0/30.0/4.0*xyc1^4.0+2.5/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/4950.0*xyc1^11.0+1.0/1680.0*xyc1^8.0+1.0/1050.0*xyc1^7.0+1.0/120.0*xyc1^4.0+1.0/1.2*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "67.2*xyc1^5.0+12.0*xyc1^2.0+4.8*xyc1";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "67.2*5.0*xyc1^4.0+12.0*2.0*xyc1^1.0+4.8";
        UsageCalculus.EqnSolArrayMap2[4] = "336.0*xyc1^4.0+24.0*xyc1+4.8";
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
        public static void TestCaseDiff20041() {
        //Test Case 20041
        UsageCalculus.TestCase = 20041;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "1.0/+235/xyc1^8 + 1.0/+2355/xyc1^5 + 1.0/+235*xyc1^4 + 1.0/+235*xyc1 + 1.0/+235*25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:+235";
        UsageCalculus.TestCaseMatrixID="Coefficients:+235:3 Letter with Numerics:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/235.0/xyc1^8.0+1.0/2355.0/xyc1^5.0+1.0/235.0*xyc1^4.0+1.0/235.0*xyc1+1.0/9.4";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/235.0*-8.0/xyc1^9.0+1.0/2355.0*-5.0/xyc1^6.0+1.0/235.0*4.0*xyc1^3.0+1.0/235.0+1.0/9.4*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-1.0/29.375/xyc1^9.0-1.0/471.0/xyc1^6.0+1.0/58.75*xyc1^3.0+1.0/235.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/235.0/xyc1^8.0+1.0/2355.0/xyc1^5.0+1.0/235.0*xyc1^4.0+1.0/235.0*xyc1+1.0/9.4";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/235.0/-7.0/xyc1^7.0+1.0/2355.0/-4.0/xyc1^4.0+1.0/235.0/5.0*xyc1^5.0+1.0/235.0/2.0*xyc1^2.0+1.0/9.4*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="-1.0/1645.0/xyc1^7.0-1.0/9420.0/xyc1^4.0+1.0/1175.0*xyc1^5.0+1.0/470.0*xyc1^2.0+1.0/9.4*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-1.0/29.375/xyc1^9.0-1.0/471.0/xyc1^6.0+1.0/58.75*xyc1^3.0+1.0/235.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-1.0/29.375*-9.0/xyc1^10.0-1.0/471.0*-6.0/xyc1^7.0+1.0/58.75*3.0*xyc1^2.0+1.0/235.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "1.0/3.263888888888889/xyc1^10.0+1.0/78.5/xyc1^7.0+1.0/19.583333333333332*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="-1.0/1645.0/xyc1^7.0-1.0/9420.0/xyc1^4.0+1.0/1175.0*xyc1^5.0+1.0/470.0*xyc1^2.0+1.0/9.4*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-1.0/1645.0/-6.0/xyc1^6.0-1.0/9420.0/-3.0/xyc1^3.0+1.0/1175.0/6.0*xyc1^6.0+1.0/470.0/3.0*xyc1^3.0+1.0/9.4/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/9870.0/xyc1^6.0+1.0/28260.0/xyc1^3.0+1.0/7050.0*xyc1^6.0+1.0/1410.0*xyc1^3.0+1.0/18.8*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "1.0/3.263888888888889/xyc1^10.0+1.0/78.5/xyc1^7.0+1.0/19.583333333333332*xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "1.0/3.263888888888889*-10.0/xyc1^11.0+1.0/78.5*-7.0/xyc1^8.0+1.0/19.583333333333332*2.0*xyc1^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-3.0638297872340425/xyc1^11.0-1.0/11.214285714285714/xyc1^8.0+1.0/9.791666666666666*xyc1";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/9870.0/xyc1^6.0+1.0/28260.0/xyc1^3.0+1.0/7050.0*xyc1^6.0+1.0/1410.0*xyc1^3.0+1.0/18.8*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/9870.0/-5.0/xyc1^5.0+1.0/28260.0/-2.0/xyc1^2.0+1.0/7050.0/7.0*xyc1^7.0+1.0/1410.0/4.0*xyc1^4.0+1.0/18.8/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-1.0/49350.0/xyc1^5.0-1.0/56520.0/xyc1^2.0+1.0/49350.0*xyc1^7.0+1.0/5640.0*xyc1^4.0+1.0/56.400000000000006*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-3.0638297872340425/xyc1^11.0-1.0/11.214285714285714/xyc1^8.0+1.0/9.791666666666666*xyc1";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-3.0638297872340425*-11.0/xyc1^12.0-1.0/11.214285714285714*-8.0/xyc1^9.0+1.0/9.791666666666666";
        UsageCalculus.EqnSolArrayMap2[4] = "33.702127659574465/xyc1^12.0+1.0/1.4017857142857142/xyc1^9.0+1.0/9.791666666666666";
        UsageCalculus.EqnSolArrayMap3[4]="-1.0/49350.0/xyc1^5.0-1.0/56520.0/xyc1^2.0+1.0/49350.0*xyc1^7.0+1.0/5640.0*xyc1^4.0+1.0/56.400000000000006*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="-1.0/49350.0/-4.0/xyc1^4.0-1.0/56520.0/-1.0/xyc1^1.0+1.0/49350.0/8.0*xyc1^8.0+1.0/5640.0/5.0*xyc1^5.0+1.0/56.400000000000006/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/197400.0/xyc1^4.0+1.0/56520.0/xyc1+1.0/394800.0*xyc1^8.0+1.0/28200.0*xyc1^5.0+1.0/225.60000000000002*xyc1^4.0";
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
        
       public static void TestCaseDiff20042() {
        //Test Case 20042
        UsageCalculus.TestCase = 20042;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "1.0/+2*xyc1^8/5 + 1.0/+2*xyc1^5/5 + 1.0/+2*xyc1^4/5 + 1.0*+2/xyc1/5 + 1.0/+2/25/5";
        UsageCalculus.TestCaseName = "Simple: Coefficients:5:Trailing Constant:End Term:MAP";
        UsageCalculus.TestCaseMatrixID="Coefficients:5:3 Letter with Numerics:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/10.0*xyc1^8.0+1.0/10.0*xyc1^5.0+1.0/10.0*xyc1^4.0+1.0/2.5/xyc1+1.0/250.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/10.0*8.0*xyc1^7.0+1.0/10.0*5.0*xyc1^4.0+1.0/10.0*4.0*xyc1^3.0-1.0/2.5/xyc1^2.0+1.0/250.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0/1.25*xyc1^7.0+1.0/2.0*xyc1^4.0+1.0/2.5*xyc1^3.0-1.0/2.5/xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/10.0*xyc1^8.0+1.0/10.0*xyc1^5.0+1.0/10.0*xyc1^4.0+1.0/2.5/xyc1+1.0/250.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/10.0/9.0*xyc1^9.0+1.0/10.0/6.0*xyc1^6.0+1.0/10.0/5.0*xyc1^5.0+1.0/2.5*ln(xyc1)+1.0/250.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/90.0*xyc1^9.0+1.0/60.0*xyc1^6.0+1.0/50.0*xyc1^5.0+1.0/2.5*ln(xyc1)+1.0/250.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0/1.25*xyc1^7.0+1.0/2.0*xyc1^4.0+1.0/2.5*xyc1^3.0-1.0/2.5/xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "1.0/1.25*7.0*xyc1^6.0+1.0/2.0*4.0*xyc1^3.0+1.0/2.5*3.0*xyc1^2.0-1.0/2.5*-2.0/xyc1^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "5.6*xyc1^6.0+2.0*xyc1^3.0+1.2*xyc1^2.0+1.0/1.25/xyc1^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "5.6*xyc1^6.0+2.0*xyc1^3.0+1.2*xyc1^2.0+1.0/1.25/xyc1^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "5.6*6.0*xyc1^5.0+2.0*3.0*xyc1^2.0+1.2*2.0*xyc1^1.0+1.0/1.25*-3.0/xyc1^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "33.599999999999994*xyc1^5.0+6.0*xyc1^2.0+2.4*xyc1-2.4/xyc1^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "33.599999999999994*xyc1^5.0+6.0*xyc1^2.0+2.4*xyc1-2.4/xyc1^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "33.599999999999994*5.0*xyc1^4.0+6.0*2.0*xyc1^1.0+2.4-2.4*-4.0/xyc1^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "167.99999999999997*xyc1^4.0+12.0*xyc1+2.4+9.6/xyc1^5.0";
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
       public static void TestCaseDiff20043() {
        //Test Case 20043
        UsageCalculus.TestCase = 20043;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "1.0/+2*xyc1^8/5*xyc1/7 + 1.0/+2*xyc1^5/5/xyc1/7 + 1.0/+2*xyc1^4/5/xyc1/7 + 1.0/+2/xyc1/5/xyc1/7 + 1.0/+2/25/5";
        UsageCalculus.TestCaseName = "Simple: Coefficients:5*xyc1*7:Trailing Constant:Middle Term";
        UsageCalculus.TestCaseMatrixID="Coefficients:5*xyc1*7:3 Letter with Numerics:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 3;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/70.0*xyc1^9.0+1.0/70.0*xyc1^4.0+1.0/70.0*xyc1^3.0+1.0/70.0/xyc1^2.0+1.0/250.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/70.0*9.0*xyc1^8.0+1.0/70.0*4.0*xyc1^3.0+1.0/70.0*3.0*xyc1^2.0+1.0/70.0*-2.0/xyc1^3.0+1.0/250.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0/7.777777777777778*xyc1^8.0+1.0/17.5*xyc1^3.0+1.0/23.333333333333332*xyc1^2.0-1.0/35.0/xyc1^3.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/70.0*xyc1^9.0+1.0/70.0*xyc1^4.0+1.0/70.0*xyc1^3.0+1.0/70.0/xyc1^2.0+1.0/250.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/70.0/10.0*xyc1^10.0+1.0/70.0/5.0*xyc1^5.0+1.0/70.0/4.0*xyc1^4.0+1.0/70.0/-1.0/xyc1^1.0+1.0/250.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/700.0*xyc1^10.0+1.0/350.0*xyc1^5.0+1.0/280.0*xyc1^4.0-1.0/70.0/xyc1+1.0/250.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0/7.777777777777778*xyc1^8.0+1.0/17.5*xyc1^3.0+1.0/23.333333333333332*xyc1^2.0-1.0/35.0/xyc1^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "1.0/7.777777777777778*8.0*xyc1^7.0+1.0/17.5*3.0*xyc1^2.0+1.0/23.333333333333332*2.0*xyc1^1.0-1.0/35.0*-3.0/xyc1^4.0";
        UsageCalculus.EqnSolArrayMap2[2] = "1.0285714285714287*xyc1^7.0+1.0/5.833333333333333*xyc1^2.0+1.0/11.666666666666666*xyc1+1.0/11.666666666666666/xyc1^4.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/700.0*xyc1^10.0+1.0/350.0*xyc1^5.0+1.0/280.0*xyc1^4.0-1.0/70.0/xyc1+1.0/250.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/700.0/11.0*xyc1^11.0+1.0/350.0/6.0*xyc1^6.0+1.0/280.0/5.0*xyc1^5.0-1.0/70.0*ln(xyc1)+1.0/250.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/7700.0*xyc1^11.0+1.0/2100.0*xyc1^6.0+1.0/1400.0*xyc1^5.0-1.0/70.0*ln(xyc1)+1.0/500.0*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "1.0285714285714287*xyc1^7.0+1.0/5.833333333333333*xyc1^2.0+1.0/11.666666666666666*xyc1+1.0/11.666666666666666/xyc1^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "1.0285714285714287*7.0*xyc1^6.0+1.0/5.833333333333333*2.0*xyc1^1.0+1.0/11.666666666666666+1.0/11.666666666666666*-4.0/xyc1^5.0";
        UsageCalculus.EqnSolArrayMap2[3] = "7.200000000000001*xyc1^6.0+1.0/2.9166666666666665*xyc1+1.0/11.666666666666666-1.0/2.9166666666666665/xyc1^5.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "7.200000000000001*xyc1^6.0+1.0/2.9166666666666665*xyc1+1.0/11.666666666666666-1.0/2.9166666666666665/xyc1^5.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "7.200000000000001*6.0*xyc1^5.0+1.0/2.9166666666666665+1.0/11.666666666666666*0.0-1.0/2.9166666666666665*-5.0/xyc1^6.0";
        UsageCalculus.EqnSolArrayMap2[4] = "43.2*xyc1^5.0+1.0/2.9166666666666665+1.7142857142857144/xyc1^6.0";
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
       public static void TestCaseDiff20044() {
        //Test Case 20044
        UsageCalculus.TestCase = 20044;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "1.0/+2/xyc1^8/5^xyc1 + 1.0/+2/xyc1^5/5^xyc1 + 1.0/+2/xyc1^4/5^xyc1 + 1.0/+2*xyc1*5^xyc1 + 1.0/+2/25/5";
        UsageCalculus.TestCaseName = "Simple: Coefficients:5^xyc1:";
        UsageCalculus.TestCaseMatrixID="Coefficients:5^xyc1:3 Letter with Numerics:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 2;
        UsageCalculus.MaxIntegreOrder = 5;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/2.0/xyc1^8.0*5.0^xyc1+1.0/2.0/xyc1^5.0*5.0^xyc1+1.0/2.0/xyc1^4.0*5.0^xyc1+1.0/2.0*xyc1*5.0^xyc1+1.0/250.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "5.0^xyc1*1.0/2.0*-8.0/xyc1^9.0+ln(5.0)*5.0^xyc1*1.0/2.0/xyc1^8.0+5.0^xyc1*1.0/2.0*-5.0/xyc1^6.0+ln(5.0)*5.0^xyc1*1.0/2.0/xyc1^5.0+5.0^xyc1*1.0/2.0*-4.0/xyc1^5.0+ln(5.0)*5.0^xyc1*1.0/2.0/xyc1^4.0+5.0^xyc1*1.0/2.0+ln(5.0)*5.0^xyc1*1.0/2.0*xyc1+1.0/250.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "5.0^xyc1*1.0/2.0*-8.0/xyc1^9.0+ln(5.0)*5.0^xyc1*1.0/2.0/xyc1^8.0+5.0^xyc1*1.0/2.0*-5.0/xyc1^6.0+ln(5.0)*5.0^xyc1*1.0/2.0/xyc1^5.0+5.0^xyc1*1.0/2.0*-4.0/xyc1^5.0+ln(5.0)*5.0^xyc1*1.0/2.0/xyc1^4.0+5.0^xyc1*1.0/2.0+ln(5.0)*5.0^xyc1*1.0/2.0*xyc1+1.0/250.0*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/2.0/xyc1^8.0/5.0^xyc1+1.0/2.0/xyc1^5.0/5.0^xyc1+1.0/2.0/xyc1^4.0/5.0^xyc1+1.0/2.0*xyc1*5.0^xyc1+1.0/250.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="0.1/-7.0/xyc1^7.0+0.1/-4.0/xyc1^4.0+0.1/-3.0/xyc1^3.0+2.5/2.0*xyc1^2.0+0.004*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="-0.014285714285714287/xyc1^7.0-0.025/xyc1^4.0-0.03333333333333333/xyc1^3.0+1.25*xyc1^2.0+0.004*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-0.8/xyc1^9.0-0.5/xyc1^6.0-0.4/xyc1^5.0+2.5";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-0.8*-9.0/xyc1^10.0-0.5*-6.0/xyc1^7.0-0.4*-5.0/xyc1^6.0+0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "7.2/xyc1^10.0+3.0/xyc1^7.0+2.0/xyc1^6.0";
        UsageCalculus.EqnSolArrayMap3[2]="-0.014285714285714287/xyc1^7.0-0.025/xyc1^4.0-0.03333333333333333/xyc1^3.0+1.25*xyc1^2.0+0.004*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-0.014285714285714287/-6.0/xyc1^6.0-0.025/-3.0/xyc1^3.0-0.03333333333333333/-2.0/xyc1^2.0+1.25/3.0*xyc1^3.0+0.004/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="0.002380952380952381/xyc1^6.0+0.008333333333333333/xyc1^3.0+0.016666666666666666/xyc1^2.0+0.4166666666666667*xyc1^3.0+0.002*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "7.2/xyc1^10.0+3.0/xyc1^7.0+2.0/xyc1^6.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "7.2*-10.0/xyc1^11.0+3.0*-7.0/xyc1^8.0+2.0*-6.0/xyc1^7.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-72.0/xyc1^11.0-21.0/xyc1^8.0-12.0/xyc1^7.0";
        UsageCalculus.EqnSolArrayMap3[3]="0.002380952380952381/xyc1^6.0+0.008333333333333333/xyc1^3.0+0.016666666666666666/xyc1^2.0+0.4166666666666667*xyc1^3.0+0.002*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="0.002380952380952381/-5.0/xyc1^5.0+0.008333333333333333/-2.0/xyc1^2.0+0.016666666666666666/-1.0/xyc1^1.0+0.4166666666666667/4.0*xyc1^4.0+0.002/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-4.7619047619047624E-4/xyc1^5.0-0.004166666666666667/xyc1^2.0-0.016666666666666666/xyc1+0.10416666666666667*xyc1^4.0+6.666666666666666E-4*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-72.0/xyc1^11.0-21.0/xyc1^8.0-12.0/xyc1^7.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-72.0*-11.0/xyc1^12.0-21.0*-8.0/xyc1^9.0-12.0*-7.0/xyc1^8.0";
        UsageCalculus.EqnSolArrayMap2[4] = "792.0/xyc1^12.0+168.0/xyc1^9.0+84.0/xyc1^8.0";
        UsageCalculus.EqnSolArrayMap3[4]="-4.7619047619047624E-4/xyc1^5.0-0.004166666666666667/xyc1^2.0-0.016666666666666666/xyc1+0.10416666666666667*xyc1^4.0+6.666666666666666E-4*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="-4.7619047619047624E-4/-4.0/xyc1^4.0-0.004166666666666667/-1.0/xyc1^1.0-0.016666666666666666*ln(xyc1)+0.10416666666666667/5.0*xyc1^5.0+6.666666666666666E-4/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.1904761904761906E-4/xyc1^4.0+0.004166666666666667/xyc1-0.016666666666666666*ln(xyc1)+0.020833333333333336*xyc1^5.0+1.6666666666666666E-4*xyc1^4.0";
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
       /*********************************************/
       /************ Missed Out Test Cases **********/
       /*********************************************/
       public static void TestCaseDiff20045() {
        //Test Case 20045
        UsageCalculus.TestCase = 20045;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "-0.0/x^8 + 1*-0.0/x^5 + 1*-0.0/x^4 - 1*-0.0/x- 25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:-0.0";
        UsageCalculus.TestCaseMatrixID="Coefficients:-0.0:1 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-0.0/x^8.0-0.0/x^5.0-0.0/x^4.0+0.0/x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0*-8.0/x^9.0-0.0*-5.0/x^6.0-0.0*-4.0/x^5.0-0.0/x^2.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "0.0/x^9.0+0.0/x^6.0+0.0/x^5.0-0.0/x^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="-0.0/x^8.0-0.0/x^5.0-0.0/x^4.0+0.0/x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-0.0/-7.0/x^7.0-0.0/-4.0/x^4.0-0.0/-3.0/x^3.0+0.0*ln(x)-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="0.0/x^7.0+0.0/x^4.0+0.0/x^3.0+0.0*ln(x)-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "0.0/x^9.0+0.0/x^6.0+0.0/x^5.0-0.0/x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "0.0*-9.0/x^10.0+0.0*-6.0/x^7.0+0.0*-5.0/x^6.0-0.0*-2.0/x^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-0.0/x^10.0-0.0/x^7.0-0.0/x^6.0+0.0/x^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-0.0/x^10.0-0.0/x^7.0-0.0/x^6.0+0.0/x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-0.0*-10.0/x^11.0-0.0*-7.0/x^8.0-0.0*-6.0/x^7.0+0.0*-3.0/x^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "0.0/x^11.0+0.0/x^8.0+0.0/x^7.0-0.0/x^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "0.0/x^11.0+0.0/x^8.0+0.0/x^7.0-0.0/x^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "0.0*-11.0/x^12.0+0.0*-8.0/x^9.0+0.0*-7.0/x^8.0-0.0*-4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-0.0/x^12.0-0.0/x^9.0-0.0/x^8.0+0.0/x^5.0";
        UsageCalculus.EqnSolArrayMap3[4]="-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="-1.0416666666666667*x^4.0";
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
        public static void TestCaseDiff20046() {
        //Test Case 20046
        UsageCalculus.TestCase = 20046;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1*-0/xy^8 + 1*-0/xy^5 + 1*-0/xy^4 - 1*-0/xy - 25*-0";
        UsageCalculus.TestCaseName = "Simple: Coefficients:0";
        UsageCalculus.TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xy";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-0.0/xy^8.0-0.0/xy^5.0-0.0/xy^4.0+0.0/xy";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0*-8.0/xy^9.0-0.0*-5.0/xy^6.0-0.0*-4.0/xy^5.0-0.0/xy^2.0";
        UsageCalculus.EqnSolArrayMap2[1] = "0.0/xy^9.0+0.0/xy^6.0+0.0/xy^5.0-0.0/xy^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="-0.0/xy^8.0-0.0/xy^5.0-0.0/xy^4.0+0.0/xy";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-0.0/-7.0/xy^7.0-0.0/-4.0/xy^4.0-0.0/-3.0/xy^3.0+0.0*ln(xy)";
        UsageCalculus.EqnSolArrayMap4[1]="0.0/xy^7.0+0.0/xy^4.0+0.0/xy^3.0+0.0*ln(xy)";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "0.0/xy^9.0+0.0/xy^6.0+0.0/xy^5.0-0.0/xy^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "0.0*-9.0/xy^10.0+0.0*-6.0/xy^7.0+0.0*-5.0/xy^6.0-0.0*-2.0/xy^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-0.0/xy^10.0-0.0/xy^7.0-0.0/xy^6.0+0.0/xy^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-0.0/xy^10.0-0.0/xy^7.0-0.0/xy^6.0+0.0/xy^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-0.0*-10.0/xy^11.0-0.0*-7.0/xy^8.0-0.0*-6.0/xy^7.0+0.0*-3.0/xy^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "0.0/xy^11.0+0.0/xy^8.0+0.0/xy^7.0-0.0/xy^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "0.0/xy^11.0+0.0/xy^8.0+0.0/xy^7.0-0.0/xy^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "0.0*-11.0/xy^12.0+0.0*-8.0/xy^9.0+0.0*-7.0/xy^8.0-0.0*-4.0/xy^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-0.0/xy^12.0-0.0/xy^9.0-0.0/xy^8.0+0.0/xy^5.0";
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
        public static void TestCaseDiff20047() {
        //Test Case 20047
        UsageCalculus.TestCase = 20047;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1*+1/xyc^8 + 1*+1/xyc^5 + 1*+1/xyc^4 - 1*+1/xyc - 1*+1/25";
        UsageCalculus.TestCaseName = "Simple: Variables:3 Letter :Coefficients:+1:MAP";
        UsageCalculus.TestCaseMatrixID="Coefficients:+1:3 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/xyc^8.0+1.0/xyc^5.0+1.0/xyc^4.0-1.0/xyc-1.0/25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-8.0/xyc^9.0-5.0/xyc^6.0-4.0/xyc^5.0+1.0/xyc^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-8.0/xyc^9.0-5.0/xyc^6.0-4.0/xyc^5.0+1.0/xyc^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/xyc^8.0+1.0/xyc^5.0+1.0/xyc^4.0-1.0/xyc-1.0/25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/-7.0/xyc^7.0+1.0/-4.0/xyc^4.0+1.0/-3.0/xyc^3.0-ln(xyc)-1.0/25.0*xyc";
        UsageCalculus.EqnSolArrayMap4[1]="-1.0/7.0/xyc^7.0-1.0/4.0/xyc^4.0-1.0/3.0/xyc^3.0-ln(xyc)-1.0/25.0*xyc";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-8.0/xyc^9.0-5.0/xyc^6.0-4.0/xyc^5.0+1.0/xyc^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-8.0*-9.0/xyc^10.0-5.0*-6.0/xyc^7.0-4.0*-5.0/xyc^6.0-2.0/xyc^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "72.0/xyc^10.0+30.0/xyc^7.0+20.0/xyc^6.0-2.0/xyc^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "72.0/xyc^10.0+30.0/xyc^7.0+20.0/xyc^6.0-2.0/xyc^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "72.0*-10.0/xyc^11.0+30.0*-7.0/xyc^8.0+20.0*-6.0/xyc^7.0-2.0*-3.0/xyc^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-720.0/xyc^11.0-210.0/xyc^8.0-120.0/xyc^7.0+6.0/xyc^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-720.0/xyc^11.0-210.0/xyc^8.0-120.0/xyc^7.0+6.0/xyc^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-720.0*-11.0/xyc^12.0-210.0*-8.0/xyc^9.0-120.0*-7.0/xyc^8.0+6.0*-4.0/xyc^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "7920.0/xyc^12.0+1680.0/xyc^9.0+840.0/xyc^8.0-24.0/xyc^5.0";
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
       
       /*********************************************/
       /************ Missed Out Test Cases **********/
       /*********************************************/
       public static void TestCaseDiff20048() {
        //Test Case 20048
        UsageCalculus.TestCase = 20048;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "0.0/x^8*0/0 + 0.0/x^5*0/0 + 0.0/x^4*0/0 - 0.0/x*0/0- 25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:0.0";
        UsageCalculus.TestCaseMatrixID="Coefficients:0.0:1 Letter:Mixed(*,/) Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "NaN/x^8.0+NaN/x^5.0+NaN/x^4.0-NaN/x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "NaN*-8.0/x^9.0+NaN*-5.0/x^6.0+NaN*-4.0/x^5.0+NaN/x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-NaN*8.0/x^9.0-NaN*5.0/x^6.0-NaN*4.0/x^5.0+NaN/x^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="NaN/x^8.0+NaN/x^5.0+NaN/x^4.0-NaN/x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="NaN/-7.0/x^7.0+NaN/-4.0/x^4.0+NaN/-3.0/x^3.0-NaN*ln(x)-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="-NaN/7.0/x^7.0-NaN/4.0/x^4.0-NaN/3.0/x^3.0-NaN*ln(x)-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-NaN*8.0/x^9.0-NaN*5.0/x^6.0-NaN*4.0/x^5.0+NaN/x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-NaN*8.0*-9.0/x^10.0-NaN*5.0*-6.0/x^7.0-NaN*4.0*-5.0/x^6.0+NaN*-2.0/x^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "NaN*72.0/x^10.0+NaN*30.0/x^7.0+NaN*20.0/x^6.0-NaN*2.0/x^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "NaN*72.0/x^10.0+NaN*30.0/x^7.0+NaN*20.0/x^6.0-NaN*2.0/x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "NaN*72.0*-10.0/x^11.0+NaN*30.0*-7.0/x^8.0+NaN*20.0*-6.0/x^7.0-NaN*2.0*-3.0/x^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-NaN*720.0/x^11.0-NaN*210.0/x^8.0-NaN*120.0/x^7.0+NaN*6.0/x^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-NaN*720.0/x^11.0-NaN*209.99999999999997/x^8.0-NaN*120.0/x^7.0+NaN*6.0/x^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-NaN*720.0*-11.0/x^12.0-NaN*209.99999999999997*-8.0/x^9.0-NaN*120.0*-7.0/x^8.0+NaN*6.0*-4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "NaN*7920.0/x^12.0+NaN*1679.9999999999998/x^9.0+NaN*840.0/x^8.0-NaN*24.0/x^5.0";
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
        public static void TestCaseDiff20049() {
        //Test Case 20049
        UsageCalculus.TestCase = 20049;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "0/xy^8*0/1 + 0/xy^5*0/1 + 0/xy^4*0/1 - 0/xy*0/0 - 25/0*0";
        UsageCalculus.TestCaseName = "Simple: Coefficients:0";
        UsageCalculus.TestCaseMatrixID="Coefficients:0:2 Letter:Mixed(*,/) Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xy";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "0.0/xy^8.0+0.0/xy^5.0+0.0/xy^4.0-NaN/xy-NaN";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0*-8.0/xy^9.0+0.0*-5.0/xy^6.0+0.0*-4.0/xy^5.0+NaN/xy^2.0-NaN*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-0.0/xy^9.0-0.0/xy^6.0-0.0/xy^5.0+NaN/xy^2.0-NaN*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="0.0/xy^8.0+0.0/xy^5.0+0.0/xy^4.0-NaN/xy-NaN";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="0.0/-7.0/xy^7.0+0.0/-4.0/xy^4.0+0.0/-3.0/xy^3.0-NaN*ln(xy)-NaN*xy";
        UsageCalculus.EqnSolArrayMap4[1]="-0.0/xy^7.0-0.0/xy^4.0-0.0/xy^3.0-NaN*ln(xy)-NaN*xy";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-0.0/xy^9.0-0.0/xy^6.0-0.0/xy^5.0+NaN/xy^2.0-NaN*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-0.0*-9.0/xy^10.0-0.0*-6.0/xy^7.0-0.0*-5.0/xy^6.0+NaN*-2.0/xy^3.0-NaN*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "0.0/xy^10.0+0.0/xy^7.0+0.0/xy^6.0-NaN*2.0/xy^3.0-NaN*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "0.0/xy^10.0+0.0/xy^7.0+0.0/xy^6.0-NaN*2.0/xy^3.0-NaN*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "0.0*-10.0/xy^11.0+0.0*-7.0/xy^8.0+0.0*-6.0/xy^7.0-NaN*2.0*-3.0/xy^4.0-NaN*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-0.0/xy^11.0-0.0/xy^8.0-0.0/xy^7.0+NaN*6.0/xy^4.0-NaN*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-0.0/xy^11.0-0.0/xy^8.0-0.0/xy^7.0+NaN*6.0/xy^4.0-NaN*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*-11.0/xy^12.0-0.0*-8.0/xy^9.0-0.0*-7.0/xy^8.0+NaN*6.0*-4.0/xy^5.0-NaN*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "0.0/xy^12.0+0.0/xy^9.0+0.0/xy^8.0-NaN*24.0/xy^5.0-NaN*0.0";
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
        public static void TestCaseDiff20050() {
        //Test Case 20050
        UsageCalculus.TestCase = 20050;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1/1/1/xyc^8 + 1/1*1/xyc^5 + 1/1/1/xyc^4 - 1/1*1/xyc - 1/1*1/25";
        UsageCalculus.TestCaseName = "Simple: Variables:3 Letter:MAP";
        UsageCalculus.TestCaseMatrixID="Coefficients:1:3 Letter:Mixed(*,/) Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/xyc^8.0+1.0/xyc^5.0+1.0/xyc^4.0-1.0/xyc-1.0/25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-8.0/xyc^9.0-5.0/xyc^6.0-4.0/xyc^5.0+1.0/xyc^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-8.0/xyc^9.0-5.0/xyc^6.0-4.0/xyc^5.0+1.0/xyc^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/xyc^8.0+1.0/xyc^5.0+1.0/xyc^4.0-1.0/xyc-1.0/25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/-7.0/xyc^7.0+1.0/-4.0/xyc^4.0+1.0/-3.0/xyc^3.0-ln(xyc)-1.0/25.0*xyc";
        UsageCalculus.EqnSolArrayMap4[1]="-1.0/7.0/xyc^7.0-1.0/4.0/xyc^4.0-1.0/3.0/xyc^3.0-ln(xyc)-1.0/25.0*xyc";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-8.0/xyc^9.0-5.0/xyc^6.0-4.0/xyc^5.0+1.0/xyc^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-8.0*-9.0/xyc^10.0-5.0*-6.0/xyc^7.0-4.0*-5.0/xyc^6.0-2.0/xyc^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "72.0/xyc^10.0+30.0/xyc^7.0+20.0/xyc^6.0-2.0/xyc^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "72.0/xyc^10.0+30.0/xyc^7.0+20.0/xyc^6.0-2.0/xyc^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "72.0*-10.0/xyc^11.0+30.0*-7.0/xyc^8.0+20.0*-6.0/xyc^7.0-2.0*-3.0/xyc^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-720.0/xyc^11.0-210.0/xyc^8.0-120.0/xyc^7.0+6.0/xyc^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-720.0/xyc^11.0-210.0/xyc^8.0-120.0/xyc^7.0+6.0/xyc^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-720.0*-11.0/xyc^12.0-210.0*-8.0/xyc^9.0-120.0*-7.0/xyc^8.0+6.0*-4.0/xyc^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "7920.0/xyc^12.0+1680.0/xyc^9.0+840.0/xyc^8.0-24.0/xyc^5.0";
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
        public static void TestCaseDiff20051() {
        //Test Case 20051
        UsageCalculus.TestCase = 20051;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0/xyc1^8 + 1.0/1.0/xyc1^5 + 1.0/xyc1^4 - 1.0/1.0/xyc1 - 1.0/25";
        UsageCalculus.TestCaseName = "Simple: Variables:3 Letter with Numerics:MAP";
        UsageCalculus.TestCaseMatrixID="Coefficients:1.0:3 Letter with Numerics:Mixed(*,/) Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/xyc1^8.0+1.0/xyc1^5.0+1.0/xyc1^4.0-1.0/xyc1-1.0/25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-8.0/xyc1^9.0-5.0/xyc1^6.0-4.0/xyc1^5.0+1.0/xyc1^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-8.0/xyc1^9.0-5.0/xyc1^6.0-4.0/xyc1^5.0+1.0/xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/xyc1^8.0+1.0/xyc1^5.0+1.0/xyc1^4.0-1.0/xyc1-1.0/25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/-7.0/xyc1^7.0+1.0/-4.0/xyc1^4.0+1.0/-3.0/xyc1^3.0-ln(xyc1)-1.0/25.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="-1.0/7.0/xyc1^7.0-1.0/4.0/xyc1^4.0-1.0/3.0/xyc1^3.0-ln(xyc1)-1.0/25.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-8.0/xyc1^9.0-5.0/xyc1^6.0-4.0/xyc1^5.0+1.0/xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-8.0*-9.0/xyc1^10.0-5.0*-6.0/xyc1^7.0-4.0*-5.0/xyc1^6.0-2.0/xyc1^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "72.0/xyc1^10.0+30.0/xyc1^7.0+20.0/xyc1^6.0-2.0/xyc1^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "72.0/xyc1^10.0+30.0/xyc1^7.0+20.0/xyc1^6.0-2.0/xyc1^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "72.0*-10.0/xyc1^11.0+30.0*-7.0/xyc1^8.0+20.0*-6.0/xyc1^7.0-2.0*-3.0/xyc1^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-720.0/xyc1^11.0-210.0/xyc1^8.0-120.0/xyc1^7.0+6.0/xyc1^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-720.0/xyc1^11.0-210.0/xyc1^8.0-120.0/xyc1^7.0+6.0/xyc1^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-720.0*-11.0/xyc1^12.0-210.0*-8.0/xyc1^9.0-120.0*-7.0/xyc1^8.0+6.0*-4.0/xyc1^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "7920.0/xyc1^12.0+1680.0/xyc1^9.0+840.0/xyc1^8.0-24.0/xyc1^5.0";
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
    public static void TestCaseDiff20052() {
        //Test Case 20052
        UsageCalculus.TestCase = 20052;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "-1.0/-1.0*-1.0/x^8 -1.0/-1.0/-1.0*x^5 -1.0/-1.0*-1.0*x^4 -1.0/-1.0/-1.0*x- 25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:-1.0";
        UsageCalculus.TestCaseMatrixID="Coefficients:-1.0:1 Letter:Mixed(*,/) Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 5;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-1.0/x^8.0-x^5.0-x^4.0-x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0/x^9.0-5.0*x^4.0-4.0*x^3.0-1.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0/x^9.0-5.0*x^4.0-4.0*x^3.0-1.0";
        UsageCalculus.EqnSolArrayMap3[1]="-1.0/x^8.0-x^5.0-x^4.0-x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-1.0/-7.0/x^7.0-1.0/6.0*x^6.0-1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/7.0/x^7.0-1.0/6.0*x^6.0-1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0/x^9.0-5.0*x^4.0-4.0*x^3.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*-9.0/x^10.0-5.0*4.0*x^3.0-4.0*3.0*x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-72.0/x^10.0-20.0*x^3.0-12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/7.0/x^7.0-1.0/6.0*x^6.0-1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/7.0/-6.0/x^6.0-1.0/6.0/7.0*x^7.0-1.0/5.0/6.0*x^6.0-1.0/2.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="-1.0/42.0/x^6.0-1.0/42.0*x^7.0-1.0/30.0*x^6.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-72.0/x^10.0-20.0*x^3.0-12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-72.0*-10.0/x^11.0-20.0*3.0*x^2.0-12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "720.0/x^11.0-60.0*x^2.0-24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="-1.0/42.0/x^6.0-1.0/42.0*x^7.0-1.0/30.0*x^6.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="-1.0/42.0/-5.0/x^5.0-1.0/42.0/8.0*x^8.0-1.0/30.0/7.0*x^7.0-1.0/6.0/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/210.0/x^5.0-1.0/336.0*x^8.0-1.0/210.0*x^7.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "720.0/x^11.0-60.0*x^2.0-24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "720.0*-11.0/x^12.0-60.0*2.0*x^1.0-24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-7920.0/x^12.0-120.0*x-24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/210.0/x^5.0-1.0/336.0*x^8.0-1.0/210.0*x^7.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/210.0/-4.0/x^4.0-1.0/336.0/9.0*x^9.0-1.0/210.0/8.0*x^8.0-1.0/24.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="-1.0/840.0/x^4.0-1.0/3024.0*x^9.0-1.0/1680.0*x^8.0-1.0/120.0*x^5.0-1.0416666666666667*x^4.0";
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
        public static void TestCaseDiff20053() {
        //Test Case 20053
        UsageCalculus.TestCase = 20053;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "-1/-1*-1*xy^8 -1/-1*-1*xy^5 -1/-1*-1*xy^4 -1/-1*-1*xy - 25/-1/-1*-1*";
        UsageCalculus.TestCaseName = "Simple: Coefficients:-1";
        UsageCalculus.TestCaseMatrixID="Coefficients:-1:2 Letter:Mixed(*,/) Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xy";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 5;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-xy^8.0-xy^5.0-xy^4.0-xy+25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-8.0*xy^7.0-5.0*xy^4.0-4.0*xy^3.0-1.0+0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-8.0*xy^7.0-5.0*xy^4.0-4.0*xy^3.0-1.0";
        UsageCalculus.EqnSolArrayMap3[1]="-xy^8.0-xy^5.0-xy^4.0-xy+25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-1.0/9.0*xy^9.0-1.0/6.0*xy^6.0-1.0/5.0*xy^5.0-1.0/2.0*xy^2.0+25.0*xy";
        UsageCalculus.EqnSolArrayMap4[1]="-1.0/9.0*xy^9.0-1.0/6.0*xy^6.0-1.0/5.0*xy^5.0-1.0/2.0*xy^2.0+25.0*xy";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-8.0*xy^7.0-5.0*xy^4.0-4.0*xy^3.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-8.0*7.0*xy^6.0-5.0*4.0*xy^3.0-4.0*3.0*xy^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-56.0*xy^6.0-20.0*xy^3.0-12.0*xy^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="-1.0/9.0*xy^9.0-1.0/6.0*xy^6.0-1.0/5.0*xy^5.0-1.0/2.0*xy^2.0+25.0*xy";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-1.0/9.0/10.0*xy^10.0-1.0/6.0/7.0*xy^7.0-1.0/5.0/6.0*xy^6.0-1.0/2.0/3.0*xy^3.0+25.0/2.0*xy^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="-1.0/90.0*xy^10.0-1.0/42.0*xy^7.0-1.0/30.0*xy^6.0-1.0/6.0*xy^3.0+12.5*xy^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-56.0*xy^6.0-20.0*xy^3.0-12.0*xy^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-56.0*6.0*xy^5.0-20.0*3.0*xy^2.0-12.0*2.0*xy^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-336.0*xy^5.0-60.0*xy^2.0-24.0*xy";
        UsageCalculus.EqnSolArrayMap3[3]="-1.0/90.0*xy^10.0-1.0/42.0*xy^7.0-1.0/30.0*xy^6.0-1.0/6.0*xy^3.0+12.5*xy^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="-1.0/90.0/11.0*xy^11.0-1.0/42.0/8.0*xy^8.0-1.0/30.0/7.0*xy^7.0-1.0/6.0/4.0*xy^4.0+12.5/3.0*xy^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-1.0/990.0*xy^11.0-1.0/336.0*xy^8.0-1.0/210.0*xy^7.0-1.0/24.0*xy^4.0+4.166666666666667*xy^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-336.0*xy^5.0-60.0*xy^2.0-24.0*xy";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-336.0*5.0*xy^4.0-60.0*2.0*xy^1.0-24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-1680.0*xy^4.0-120.0*xy-24.0";
        UsageCalculus.EqnSolArrayMap3[4]="-1.0/990.0*xy^11.0-1.0/336.0*xy^8.0-1.0/210.0*xy^7.0-1.0/24.0*xy^4.0+4.166666666666667*xy^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="-1.0/990.0/12.0*xy^12.0-1.0/336.0/9.0*xy^9.0-1.0/210.0/8.0*xy^8.0-1.0/24.0/5.0*xy^5.0+4.166666666666667/4.0*xy^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="-1.0/11880.0*xy^12.0-1.0/3024.0*xy^9.0-1.0/1680.0*xy^8.0-1.0/120.0*xy^5.0+1.0416666666666667*xy^4.0";
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
        public static void TestCaseDiff20054() {
        //Test Case 20054
        UsageCalculus.TestCase = 20054;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "5/5*5*x^8 + 5/5*5*x^5 + 5/5*5*x^4 - 5/5*5*x- 25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:5";
        UsageCalculus.TestCaseMatrixID="Coefficients:5:1 Letter:Mixed(*,/) Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "5.0*x^8.0+5.0*x^5.0+5.0*x^4.0-5.0*x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "5.0*8.0*x^7.0+5.0*5.0*x^4.0+5.0*4.0*x^3.0-5.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "40.0*x^7.0+25.0*x^4.0+20.0*x^3.0-5.0";
        UsageCalculus.EqnSolArrayMap3[1]="5.0*x^8.0+5.0*x^5.0+5.0*x^4.0-5.0*x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="5.0/9.0*x^9.0+5.0/6.0*x^6.0+5.0/5.0*x^5.0-5.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1.8*x^9.0+1.0/1.2*x^6.0+x^5.0-2.5*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "40.0*x^7.0+25.0*x^4.0+20.0*x^3.0-5.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "40.0*7.0*x^6.0+25.0*4.0*x^3.0+20.0*3.0*x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "280.0*x^6.0+100.0*x^3.0+60.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/1.8*x^9.0+0.8333333333333334*x^6.0+x^5.0-2.5*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/1.8/10.0*x^10.0+0.8333333333333334/7.0*x^7.0+1.0/6.0*x^6.0-2.5/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/18.0*x^10.0+1.0/8.4*x^7.0+1.0/6.0*x^6.0-1.0/1.2*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "280.0*x^6.0+100.0*x^3.0+60.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "280.0*6.0*x^5.0+100.0*3.0*x^2.0+60.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "1680.0*x^5.0+300.0*x^2.0+120.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/18.0*x^10.0+1.0/8.4*x^7.0+1.0/6.0*x^6.0-1.0/1.2*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/18.0/11.0*x^11.0+1.0/8.4/8.0*x^8.0+1.0/6.0/7.0*x^7.0-1.0/1.2/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/198.0*x^11.0+1.0/67.2*x^8.0+1.0/42.0*x^7.0-1.0/4.8*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "1680.0*x^5.0+300.0*x^2.0+120.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "1680.0*5.0*x^4.0+300.0*2.0*x^1.0+120.0";
        UsageCalculus.EqnSolArrayMap2[4] = "8400.0*x^4.0+600.0*x+120.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/198.0*x^11.0+1.0/67.2*x^8.0+1.0/42.0*x^7.0-1.0/4.8*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/198.0/12.0*x^12.0+1.0/67.2/9.0*x^9.0+1.0/42.0/8.0*x^8.0-1.0/4.8/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/2376.0*x^12.0+1.0/604.8000000000001*x^9.0+1.0/336.0*x^8.0-1.0/24.0*x^5.0-1.0416666666666667*x^4.0";
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
        public static void TestCaseDiff20055() {
        //Test Case 20055
        UsageCalculus.TestCase = 20055;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "-5/-5*-5*xy^8 - (-5)/-5*-5*xy^5 - (-5)/-5*-5*xy^4 - (-5)/-5*-5*xy - 25/-5/-5*-5*";
        UsageCalculus.TestCaseName = "Simple: Coefficients:-5";
        UsageCalculus.TestCaseMatrixID="Coefficients:-5:2 Letter:Mixed(*,/) Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xy";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-5.0*xy^8.0+5.0*xy^5.0+5.0*xy^4.0+5.0*xy+5.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-5.0*8.0*xy^7.0+5.0*5.0*xy^4.0+5.0*4.0*xy^3.0+5.0+5.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-40.0*xy^7.0+25.0*xy^4.0+20.0*xy^3.0+5.0";
        UsageCalculus.EqnSolArrayMap3[1]="-5.0*xy^8.0+5.0*xy^5.0+5.0*xy^4.0+5.0*xy+5.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-5.0/9.0*xy^9.0+5.0/6.0*xy^6.0+5.0/5.0*xy^5.0+5.0/2.0*xy^2.0+5.0*xy";
        UsageCalculus.EqnSolArrayMap4[1]="-1.0/1.8*xy^9.0+1.0/1.2*xy^6.0+xy^5.0+2.5*xy^2.0+5.0*xy";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-40.0*xy^7.0+25.0*xy^4.0+20.0*xy^3.0+5.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-40.0*7.0*xy^6.0+25.0*4.0*xy^3.0+20.0*3.0*xy^2.0+5.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-280.0*xy^6.0+100.0*xy^3.0+60.0*xy^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="-1.0/1.8*xy^9.0+0.8333333333333334*xy^6.0+xy^5.0+2.5*xy^2.0+5.0*xy";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-1.0/1.8/10.0*xy^10.0+0.8333333333333334/7.0*xy^7.0+1.0/6.0*xy^6.0+2.5/3.0*xy^3.0+5.0/2.0*xy^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="-1.0/18.0*xy^10.0+1.0/8.4*xy^7.0+1.0/6.0*xy^6.0+1.0/1.2*xy^3.0+2.5*xy^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-280.0*xy^6.0+100.0*xy^3.0+60.0*xy^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-280.0*6.0*xy^5.0+100.0*3.0*xy^2.0+60.0*2.0*xy^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-1680.0*xy^5.0+300.0*xy^2.0+120.0*xy";
        UsageCalculus.EqnSolArrayMap3[3]="-1.0/18.0*xy^10.0+1.0/8.4*xy^7.0+1.0/6.0*xy^6.0+1.0/1.2*xy^3.0+2.5*xy^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="-1.0/18.0/11.0*xy^11.0+1.0/8.4/8.0*xy^8.0+1.0/6.0/7.0*xy^7.0+1.0/1.2/4.0*xy^4.0+2.5/3.0*xy^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-1.0/198.0*xy^11.0+1.0/67.2*xy^8.0+1.0/42.0*xy^7.0+1.0/4.8*xy^4.0+1.0/1.2*xy^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-1680.0*xy^5.0+300.0*xy^2.0+120.0*xy";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-1680.0*5.0*xy^4.0+300.0*2.0*xy^1.0+120.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-8400.0*xy^4.0+600.0*xy+120.0";
        UsageCalculus.EqnSolArrayMap3[4]="-1.0/198.0*xy^11.0+1.0/67.2*xy^8.0+1.0/42.0*xy^7.0+1.0/4.8*xy^4.0+1.0/1.2*xy^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="-1.0/198.0/12.0*xy^12.0+1.0/67.2/9.0*xy^9.0+1.0/42.0/8.0*xy^8.0+1.0/4.8/5.0*xy^5.0+1.0/1.2/4.0*xy^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="-1.0/2376.0*xy^12.0+1.0/604.8000000000001*xy^9.0+1.0/336.0*xy^8.0+1.0/24.0*xy^5.0+1.0/4.8*xy^4.0";
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
        public static void TestCaseDiff20056() {
        //Test Case 20056
        UsageCalculus.TestCase = 20056;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "-5.0/-5.0/-5.0*-5.0*xyc1^8 - 5.0/-5.0/-5.0*-5.0*xyc1^5 - 5.0/-5.0/-5.0*-5.0*xyc1^4 - 5.0/-5.0/-5.0*-5.0*xyc1 - 5.0/-5.0/-5.0*-5.0*25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:-5.0";
        UsageCalculus.TestCaseMatrixID="Coefficients:-5.0:3 Letter with Numerics:Mixed(*,/) Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 5;
        
        UsageCalculus.EqnSolArrayMap1[1] = "xyc1^8.0+xyc1^5.0+xyc1^4.0+xyc1+25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*xyc1^7.0+5.0*xyc1^4.0+4.0*xyc1^3.0+1.0+25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*xyc1^7.0+5.0*xyc1^4.0+4.0*xyc1^3.0+1.0";
        UsageCalculus.EqnSolArrayMap3[1]="xyc1^8.0+xyc1^5.0+xyc1^4.0+xyc1+25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/9.0*xyc1^9.0+1.0/6.0*xyc1^6.0+1.0/5.0*xyc1^5.0+1.0/2.0*xyc1^2.0+25.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/9.0*xyc1^9.0+1.0/6.0*xyc1^6.0+1.0/5.0*xyc1^5.0+1.0/2.0*xyc1^2.0+25.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*xyc1^7.0+5.0*xyc1^4.0+4.0*xyc1^3.0+1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*7.0*xyc1^6.0+5.0*4.0*xyc1^3.0+4.0*3.0*xyc1^2.0+1.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*xyc1^6.0+20.0*xyc1^3.0+12.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/9.0*xyc1^9.0+1.0/6.0*xyc1^6.0+1.0/5.0*xyc1^5.0+1.0/2.0*xyc1^2.0+25.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/9.0/10.0*xyc1^10.0+1.0/6.0/7.0*xyc1^7.0+1.0/5.0/6.0*xyc1^6.0+1.0/2.0/3.0*xyc1^3.0+25.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/90.0*xyc1^10.0+1.0/42.0*xyc1^7.0+1.0/30.0*xyc1^6.0+1.0/6.0*xyc1^3.0+12.5*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*xyc1^6.0+20.0*xyc1^3.0+12.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*xyc1^5.0+20.0*3.0*xyc1^2.0+12.0*2.0*xyc1^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*xyc1^5.0+60.0*xyc1^2.0+24.0*xyc1";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/90.0*xyc1^10.0+1.0/42.0*xyc1^7.0+1.0/30.0*xyc1^6.0+1.0/6.0*xyc1^3.0+12.5*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/90.0/11.0*xyc1^11.0+1.0/42.0/8.0*xyc1^8.0+1.0/30.0/7.0*xyc1^7.0+1.0/6.0/4.0*xyc1^4.0+12.5/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/990.0*xyc1^11.0+1.0/336.0*xyc1^8.0+1.0/210.0*xyc1^7.0+1.0/24.0*xyc1^4.0+4.166666666666667*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*xyc1^5.0+60.0*xyc1^2.0+24.0*xyc1";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*xyc1^4.0+60.0*2.0*xyc1^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*xyc1^4.0+120.0*xyc1+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/990.0*xyc1^11.0+1.0/336.0*xyc1^8.0+1.0/210.0*xyc1^7.0+1.0/24.0*xyc1^4.0+4.166666666666667*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/990.0/12.0*xyc1^12.0+1.0/336.0/9.0*xyc1^9.0+1.0/210.0/8.0*xyc1^8.0+1.0/24.0/5.0*xyc1^5.0+4.166666666666667/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/11880.0*xyc1^12.0+1.0/3024.0*xyc1^9.0+1.0/1680.0*xyc1^8.0+1.0/120.0*xyc1^5.0+1.0416666666666667*xyc1^4.0";
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
        public static void TestCaseDiff20057() {
        //Test Case 20057
        UsageCalculus.TestCase = 20057;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "1.0/+5.0*+5.0/+5.0/xyc1^8 + 1.0/+5.0*+5.0/+5.0/xyc1^5 + 1.0/+5.0*+5.0/+5.0/xyc1^4 + 1.0/+5.0*+5.0/+5.0/xyc1 + 1.0/+5.0*+5.0/+5.0/+5.0/25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:+5.0:MAP";
        UsageCalculus.TestCaseMatrixID="Coefficients:+5.0:3 Letter with Numerics:Mixed(*,/) Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/5.0/xyc1^8.0+1.0/5.0/xyc1^5.0+1.0/5.0/xyc1^4.0+1.0/5.0/xyc1+1.0/625.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/5.0*-8.0/xyc1^9.0+1.0/5.0*-5.0/xyc1^6.0+1.0/5.0*-4.0/xyc1^5.0-1.0/5.0/xyc1^2.0+1.0/625.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-1.6/xyc1^9.0-1.0/xyc1^6.0-1.0/1.25/xyc1^5.0-1.0/5.0/xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/5.0/xyc1^8.0+1.0/5.0/xyc1^5.0+1.0/5.0/xyc1^4.0+1.0/5.0/xyc1+1.0/625.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/5.0/-7.0/xyc1^7.0+1.0/5.0/-4.0/xyc1^4.0+1.0/5.0/-3.0/xyc1^3.0+1.0/5.0*ln(xyc1)+1.0/625.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="-1.0/35.0/xyc1^7.0-1.0/20.0/xyc1^4.0-1.0/15.0/xyc1^3.0+1.0/5.0*ln(xyc1)+1.0/625.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-1.6/xyc1^9.0-1.0/xyc1^6.0-1.0/1.25/xyc1^5.0-1.0/5.0/xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-1.6*-9.0/xyc1^10.0+6.0/xyc1^7.0-1.0/1.25*-5.0/xyc1^6.0-1.0/5.0*-2.0/xyc1^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "14.4/xyc1^10.0+6.0/xyc1^7.0+4.0/xyc1^6.0+1.0/2.5/xyc1^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "14.4/xyc1^10.0+6.0/xyc1^7.0+4.0/xyc1^6.0+1.0/2.5/xyc1^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "14.4*-10.0/xyc1^11.0+6.0*-7.0/xyc1^8.0+4.0*-6.0/xyc1^7.0+1.0/2.5*-3.0/xyc1^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-144.0/xyc1^11.0-42.0/xyc1^8.0-24.0/xyc1^7.0-1.2/xyc1^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-144.0/xyc1^11.0-42.0/xyc1^8.0-24.0/xyc1^7.0-1.2/xyc1^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-144.0*-11.0/xyc1^12.0-42.0*-8.0/xyc1^9.0-24.0*-7.0/xyc1^8.0-1.2*-4.0/xyc1^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1584.0/xyc1^12.0+336.0/xyc1^9.0+168.0/xyc1^8.0+4.8/xyc1^5.0";
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
        public static void TestCaseDiff20058() {
        //Test Case 20058
        UsageCalculus.TestCase = 20058;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "1.0/+1*+1/+1*xyc1^8 + 1.0/+1*+1/+1*xyc1^5 + 1.0/+1*+1/+1*xyc1^4 + 1.0/+1*+1/+1*1*xyc1 + 1.0/+1*+1/+1*+1*25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:+1";
        UsageCalculus.TestCaseMatrixID="Coefficients:+1:3 Letter with Numerics:Mixed(*,/) Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 5;
        
        UsageCalculus.EqnSolArrayMap1[1] = "xyc1^8.0+xyc1^5.0+xyc1^4.0+xyc1+25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*xyc1^7.0+5.0*xyc1^4.0+4.0*xyc1^3.0+1.0+0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*xyc1^7.0+5.0*xyc1^4.0+4.0*xyc1^3.0+1.0";
        UsageCalculus.EqnSolArrayMap3[1]="xyc1^8.0+xyc1^5.0+xyc1^4.0+xyc1+25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/9.0*xyc1^9.0+1.0/6.0*xyc1^6.0+1.0/5.0*xyc1^5.0+1.0/2.0*xyc1^2.0+25.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/9.0*xyc1^9.0+1.0/6.0*xyc1^6.0+1.0/5.0*xyc1^5.0+1.0/2.0*xyc1^2.0+25.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*xyc1^7.0+5.0*xyc1^4.0+4.0*xyc1^3.0+1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*7.0*xyc1^6.0+5.0*4.0*xyc1^3.0+4.0*3.0*xyc1^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*xyc1^6.0+20.0*xyc1^3.0+12.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/9.0*xyc1^9.0+1.0/6.0*xyc1^6.0+1.0/5.0*xyc1^5.0+1.0/2.0*xyc1^2.0+25.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/9.0/10.0*xyc1^10.0+1.0/6.0/7.0*xyc1^7.0+1.0/5.0/6.0*xyc1^6.0+1.0/2.0/3.0*xyc1^3.0+25.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/90.0*xyc1^10.0+1.0/42.0*xyc1^7.0+1.0/30.0*xyc1^6.0+1.0/6.0*xyc1^3.0+12.5*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*xyc1^6.0+20.0*xyc1^3.0+12.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*xyc1^5.0+20.0*3.0*xyc1^2.0+12.0*2.0*xyc1^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*xyc1^5.0+60.0*xyc1^2.0+24.0*xyc1";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/90.0*xyc1^10.0+1.0/42.0*xyc1^7.0+1.0/30.0*xyc1^6.0+1.0/6.0*xyc1^3.0+12.5*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/90.0/11.0*xyc1^11.0+1.0/42.0/8.0*xyc1^8.0+1.0/30.0/7.0*xyc1^7.0+1.0/6.0/4.0*xyc1^4.0+12.5/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/990.0*xyc1^11.0+1.0/336.0*xyc1^8.0+1.0/210.0*xyc1^7.0+1.0/24.0*xyc1^4.0+4.166666666666667*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*xyc1^5.0+60.0*xyc1^2.0+24.0*xyc1";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*xyc1^4.0+60.0*2.0*xyc1^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*xyc1^4.0+120.0*xyc1+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/990.0*xyc1^11.0+1.0/336.0*xyc1^8.0+1.0/210.0*xyc1^7.0+1.0/24.0*xyc1^4.0+4.166666666666667*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/990.0/12.0*xyc1^12.0+1.0/336.0/9.0*xyc1^9.0+1.0/210.0/8.0*xyc1^8.0+1.0/24.0/5.0*xyc1^5.0+4.166666666666667/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/11880.0*xyc1^12.0+1.0/3024.0*xyc1^9.0+1.0/1680.0*xyc1^8.0+1.0/120.0*xyc1^5.0+1.0416666666666667*xyc1^4.0";
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
        public static void TestCaseDiff20059() {
        //Test Case 20059
        UsageCalculus.TestCase = 20059;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "1.0/+1.0*+1.0/+1.0*xyc1^8 +1.0/+1.0*+1.0/+1.0*+1.0*xyc1^5 + 1.0/+1.0*+1.0/+1.0/+1.0*xyc1^4 + 1.0/+1.0*+1.0/+1.0/+1.0/xyc1 + 1.0/+1.0*+1.0/+1.0/+1.0/25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:+1.0:MAP";
        UsageCalculus.TestCaseMatrixID="Coefficients:+1.0:3 Letter with Numerics:Mixed(*,/) Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "xyc1^8.0+xyc1^5.0+xyc1^4.0+1.0/xyc1+1.0/25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*xyc1^7.0+5.0*xyc1^4.0+4.0*xyc1^3.0-1.0/xyc1^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*xyc1^7.0+5.0*xyc1^4.0+4.0*xyc1^3.0-1.0/xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="xyc1^8.0+xyc1^5.0+xyc1^4.0+1.0/xyc1+1.0/25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/9.0*xyc1^9.0+1.0/6.0*xyc1^6.0+1.0/5.0*xyc1^5.0+ln(xyc1)+1.0/25.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/9.0*xyc1^9.0+1.0/6.0*xyc1^6.0+0.2*xyc1^5.0+ln(xyc1)+1.0/25.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*xyc1^7.0+5.0*xyc1^4.0+4.0*xyc1^3.0-1.0/xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*7.0*xyc1^6.0+5.0*4.0*xyc1^3.0+4.0*3.0*xyc1^2.0+2.0/xyc1^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*xyc1^6.0+20.0*xyc1^3.0+12.0*xyc1^2.0+2.0/xyc1^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*xyc1^6.0+20.0*xyc1^3.0+12.0*xyc1^2.0+2.0/xyc1^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*xyc1^5.0+20.0*3.0*xyc1^2.0+12.0*2.0*xyc1^1.0+2.0*-3.0/xyc1^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*xyc1^5.0+60.0*xyc1^2.0+24.0*xyc1-6.0/xyc1^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*xyc1^5.0+60.0*xyc1^2.0+24.0*xyc1-6.0/xyc1^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*xyc1^4.0+60.0*2.0*xyc1^1.0+24.0-6.0*-4.0/xyc1^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*xyc1^4.0+120.0*xyc1+24.0+24.0/xyc1^5.0";
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
        public static void TestCaseDiff20060() {
        //Test Case 20060
        UsageCalculus.TestCase = 20060;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "1.0/+5.0*+5.0/+5.0*+5.0/xyc1^8 + 1.0/+5.0*+5.0/+5.0/+5.0*xyc1^5 + 1.0/+5.0*+5.0/+5.0*+5.0*xyc1^4 + 1.0/+5.0*+5.0/+5.0/+5.0/+5.0*xyc1 + 1.0/+5.0*+5.0/+5.0*+5.0/+5.0*25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:+5.0";
        UsageCalculus.TestCaseMatrixID="Coefficients:+5.0:3 Letter with Numerics:Mixed(*,/) Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/xyc1^8.0+1.0/25.0*xyc1^5.0+xyc1^4.0+1.0/125.0*xyc1+5.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-8.0/xyc1^9.0+1.0/25.0*5.0*xyc1^4.0+4.0*xyc1^3.0+1.0/125.0+5.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-8.0/xyc1^9.0+1.0/5.0*xyc1^4.0+4.0*xyc1^3.0+1.0/125.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/xyc1^8.0+1.0/25.0*xyc1^5.0+xyc1^4.0+1.0/125.0*xyc1+5.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/-7.0/xyc1^7.0+1.0/25.0/6.0*xyc1^6.0+1.0/5.0*xyc1^5.0+1.0/125.0/2.0*xyc1^2.0+5.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="-1.0/7.0/xyc1^7.0+1.0/150.0*xyc1^6.0+1.0/5.0*xyc1^5.0+1.0/250.0*xyc1^2.0+5.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-8.0/xyc1^9.0+1.0/5.0*xyc1^4.0+4.0*xyc1^3.0+1.0/125.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-8.0*-9.0/xyc1^10.0+1.0/5.0*4.0*xyc1^3.0+4.0*3.0*xyc1^2.0+1.0/125.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "72.0/xyc1^10.0+1.0/1.25*xyc1^3.0+12.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="-1.0/7.0/xyc1^7.0+1.0/150.0*xyc1^6.0+1.0/5.0*xyc1^5.0+1.0/250.0*xyc1^2.0+5.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-1.0/7.0/-6.0/xyc1^6.0+1.0/150.0/7.0*xyc1^7.0+1.0/5.0/6.0*xyc1^6.0+1.0/250.0/3.0*xyc1^3.0+5.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/42.0/xyc1^6.0+1.0/1050.0*xyc1^7.0+1.0/30.0*xyc1^6.0+1.0/750.0*xyc1^3.0+2.5*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "72.0/xyc1^10.0+1.0/1.25*xyc1^3.0+12.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "72.0*-10.0/xyc1^11.0+1.0/1.25*3.0*xyc1^2.0+12.0*2.0*xyc1^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-720.0/xyc1^11.0+2.4*xyc1^2.0+24.0*xyc1";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/42.0/xyc1^6.0+1.0/1050.0*xyc1^7.0+1.0/30.0*xyc1^6.0+1.0/750.0*xyc1^3.0+2.5*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/42.0/-5.0/xyc1^5.0+1.0/1050.0/8.0*xyc1^8.0+1.0/30.0/7.0*xyc1^7.0+1.0/750.0/4.0*xyc1^4.0+2.5/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-1.0/210.0/xyc1^5.0+1.0/8400.0*xyc1^8.0+1.0/210.0*xyc1^7.0+1.0/3000.0*xyc1^4.0+1.0/1.2*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-720.0/xyc1^11.0+2.4*xyc1^2.0+24.0*xyc1";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-720.0*-11.0/xyc1^12.0+2.4*2.0*xyc1^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "7920.0/xyc1^12.0+4.8*xyc1+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="-1.0/210.0/xyc1^5.0+1.0/8400.0*xyc1^8.0+1.0/210.0*xyc1^7.0+1.0/3000.0*xyc1^4.0+1.0/1.2*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="-1.0/210.0/-4.0/xyc1^4.0+1.0/8400.0/9.0*xyc1^9.0+1.0/210.0/8.0*xyc1^8.0+1.0/3000.0/5.0*xyc1^5.0+1.0/1.2/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/840.0/xyc1^4.0+1.0/75600.0*xyc1^9.0+1.0/1680.0*xyc1^8.0+1.0/15000.0*xyc1^5.0+1.0/4.8*xyc1^4.0";
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
        public static void TestCaseDiff20061() {
        //Test Case 20061
        UsageCalculus.TestCase = 20061;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "1.0/+5.0*+5.0/+5.0/+5.0/+5*xyc1^8 + 1.0/+5.0*+5.0/+5.0/+5.0/+5*xyc1^5 + 1.0/+5.0*+5.0/+5.0*+5.0/+5*xyc1^4 + 1.0/+5.0*+5.0/+5.0/+5.0/+5*xyc1 + 1.0/+5.0*+5.0/+5.0*+5.0/+5*25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:+5";
        UsageCalculus.TestCaseMatrixID="Coefficients:+5:3 Letter with Numerics:Mixed(*,/) Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 5;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/125.0*xyc1^8.0+1.0/125.0*xyc1^5.0+1.0/5.0*xyc1^4.0+1.0/125.0*xyc1+5.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/125.0*8.0*xyc1^7.0+1.0/125.0*5.0*xyc1^4.0+1.0/5.0*4.0*xyc1^3.0+1.0/125.0+5.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0/15.625*xyc1^7.0+1.0/25.0*xyc1^4.0+1.0/1.25*xyc1^3.0+1.0/125.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/125.0*xyc1^8.0+1.0/125.0*xyc1^5.0+1.0/5.0*xyc1^4.0+1.0/125.0*xyc1+5.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/125.0/9.0*xyc1^9.0+1.0/125.0/6.0*xyc1^6.0+1.0/5.0/5.0*xyc1^5.0+1.0/125.0/2.0*xyc1^2.0+5.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1125.0*xyc1^9.0+1.0/750.0*xyc1^6.0+1.0/25.0*xyc1^5.0+1.0/250.0*xyc1^2.0+5.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0/15.625*xyc1^7.0+1.0/25.0*xyc1^4.0+1.0/1.25*xyc1^3.0+1.0/125.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "1.0/15.625*7.0*xyc1^6.0+1.0/25.0*4.0*xyc1^3.0+1.0/1.25*3.0*xyc1^2.0+1.0/125.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "1.0/2.232142857142857*xyc1^6.0+1.0/6.25*xyc1^3.0+2.4*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/1125.0*xyc1^9.0+1.0/750.0*xyc1^6.0+1.0/25.0*xyc1^5.0+1.0/250.0*xyc1^2.0+5.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/1125.0/10.0*xyc1^10.0+1.0/750.0/7.0*xyc1^7.0+1.0/25.0/6.0*xyc1^6.0+1.0/250.0/3.0*xyc1^3.0+5.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/11250.0*xyc1^10.0+1.0/5250.0*xyc1^7.0+1.0/150.0*xyc1^6.0+1.0/750.0*xyc1^3.0+2.5*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "1.0/2.232142857142857*xyc1^6.0+1.0/6.25*xyc1^3.0+2.4*xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "1.0/2.232142857142857*6.0*xyc1^5.0+1.0/6.25*3.0*xyc1^2.0+2.4*2.0*xyc1^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "2.6879999999999997*xyc1^5.0+1.0/2.0833333333333335*xyc1^2.0+4.8*xyc1";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/11250.0*xyc1^10.0+1.0/5250.0*xyc1^7.0+1.0/150.0*xyc1^6.0+1.0/750.0*xyc1^3.0+2.5*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/11250.0/11.0*xyc1^11.0+1.0/5250.0/8.0*xyc1^8.0+1.0/150.0/7.0*xyc1^7.0+1.0/750.0/4.0*xyc1^4.0+2.5/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/123750.0*xyc1^11.0+1.0/42000.0*xyc1^8.0+1.0/1050.0*xyc1^7.0+1.0/3000.0*xyc1^4.0+1.0/1.2*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "2.6879999999999997*xyc1^5.0+1.0/2.0833333333333335*xyc1^2.0+4.8*xyc1";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "2.6879999999999997*5.0*xyc1^4.0+1.0/2.0833333333333335*2.0*xyc1^1.0+4.8";
        UsageCalculus.EqnSolArrayMap2[4] = "13.439999999999998*xyc1^4.0+1.0/1.0416666666666667*xyc1+4.8";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/123750.0*xyc1^11.0+1.0/42000.0*xyc1^8.0+1.0/1050.0*xyc1^7.0+1.0/3000.0*xyc1^4.0+1.0/1.2*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/123750.0/12.0*xyc1^12.0+1.0/42000.0/9.0*xyc1^9.0+1.0/1050.0/8.0*xyc1^8.0+1.0/3000.0/5.0*xyc1^5.0+1.0/1.2/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/1485000.0*xyc1^12.0+1.0/378000.0*xyc1^9.0+1.0/8400.0*xyc1^8.0+1.0/15000.0*xyc1^5.0+1.0/4.8*xyc1^4.0";
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
        public static void TestCaseDiff20062() {
        //Test Case 20062
        UsageCalculus.TestCase = 20062;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "1.0/+235.0*+235.0/+235.0/+5.0/+235/xyc1^8 + 1.0/+235.0*+235.0/+235.0*+5.0/+235/xyc1^5 + 1.0/+235.0*+235.0/+235.0/+5.0/+235*xyc1^4 + 1.0/+235.0*+235.0/+235.0*+5.0/+235/xyc1 + 1.0/+235.0*+235.0/+235.0/+5.0/+235/25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:+235:MAP";
        UsageCalculus.TestCaseMatrixID="Coefficients:+235:3 Letter with Numerics:Mixed(*,/) Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/276125.0/xyc1^8.0+1.0/11045.0/xyc1^5.0+1.0/276125.0*xyc1^4.0+1.0/11045.0/xyc1+1.0/6903125.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/276125.0*-8.0/xyc1^9.0+1.0/11045.0*-5.0/xyc1^6.0+1.0/276125.0*4.0*xyc1^3.0-1.0/11045.0/xyc1^2.0+1.0/6903125.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-1.0/34515.625/xyc1^9.0-1.0/2209.0/xyc1^6.0+1.0/69031.25*xyc1^3.0-1.0/11045.0/xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/276125.0/xyc1^8.0+1.0/11045.0/xyc1^5.0+1.0/276125.0*xyc1^4.0+1.0/11045.0/xyc1+1.0/6903125.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/276125.0/-7.0/xyc1^7.0+1.0/11045.0/-4.0/xyc1^4.0+1.0/276125.0/5.0*xyc1^5.0+1.0/11045.0*ln(xyc1)+1.0/6903125.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="-1.0/1932875.0/xyc1^7.0-1.0/44180.0/xyc1^4.0+1.0/1380625.0*xyc1^5.0+1.0/11045.0*ln(xyc1)+1.0/6903125.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-1.0/34515.625/xyc1^9.0-1.0/2209.0/xyc1^6.0+1.0/69031.25*xyc1^3.0-1.0/11045.0/xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-1.0/34515.625*-9.0/xyc1^10.0-1.0/2209.0*-6.0/xyc1^7.0+1.0/69031.25*3.0*xyc1^2.0-1.0/11045.0*-2.0/xyc1^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "1.0/3835.0694444444443/xyc1^10.0+1.0/368.1666666666667/xyc1^7.0+1.0/23010.416666666668*xyc1^2.0+1.0/5522.5/xyc1^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "1.0/3835.0694444444443/xyc1^10.0+1.0/368.1666666666667/xyc1^7.0+1.0/23010.416666666668*xyc1^2.0+1.0/5522.5/xyc1^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "1.0/3835.0694444444443*-10.0/xyc1^11.0+1.0/368.1666666666667*-7.0/xyc1^8.0+1.0/23010.416666666668*2.0*xyc1^1.0+1.0/5522.5*-3.0/xyc1^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-1.0/383.50694444444446/xyc1^11.0-1.0/52.595238095238095/xyc1^8.0+1.0/11505.208333333334*xyc1-1.0/1840.8333333333333/xyc1^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-1.0/383.50694444444446/xyc1^11.0-1.0/52.595238095238095/xyc1^8.0+1.0/11505.208333333334*xyc1-1.0/1840.8333333333333/xyc1^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-1.0/383.50694444444446*-11.0/xyc1^12.0-1.0/52.595238095238095*-8.0/xyc1^9.0+1.0/11505.208333333334-1.0/1840.8333333333333*-4.0/xyc1^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1.0/34.864267676767675/xyc1^12.0+1.0/6.574404761904762/xyc1^9.0+1.0/11505.208333333334+1.0/460.2083333333333/xyc1^5.0";
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
        
       public static void TestCaseDiff20063() {
        //Test Case 20063
        UsageCalculus.TestCase = 20063;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "1.0/+2*xyc1^8/5*7/4 + 1.0/+2*xyc1^5/5*7/4 + 1.0/+2*xyc1^4/5*7/4 + 1.0*+2/xyc1/5*7/4 + 1.0/+2/25/5*7/4";
        UsageCalculus.TestCaseName = "Simple: Coefficients:5:Trailing Constant:End Term:MAP";
        UsageCalculus.TestCaseMatrixID="Coefficients:5:3 Letter with Numerics:Mixed(*,/) Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/5.714285714285714*xyc1^8.0+1.0/5.714285714285714*xyc1^5.0+1.0/5.714285714285714*xyc1^4.0+1.0/1.4285714285714286/xyc1+1.0/142.85714285714286";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/5.714285714285714*8.0*xyc1^7.0+1.0/5.714285714285714*5.0*xyc1^4.0+1.0/5.714285714285714*4.0*xyc1^3.0-1.0/1.4285714285714286/xyc1^2.0+1.0/142.85714285714286*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.4*xyc1^7.0+1.0/1.1428571428571428*xyc1^4.0+1.0/1.4285714285714286*xyc1^3.0-1.0/1.4285714285714286/xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/5.714285714285714*xyc1^8.0+1.0/5.714285714285714*xyc1^5.0+1.0/5.714285714285714*xyc1^4.0+1.0/1.4285714285714286/xyc1+1.0/142.85714285714286";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/5.714285714285714/9.0*xyc1^9.0+1.0/5.714285714285714/6.0*xyc1^6.0+1.0/5.714285714285714/5.0*xyc1^5.0+1.0/1.4285714285714286*ln(xyc1)+1.0/142.85714285714286*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/51.42857142857143*xyc1^9.0+1.0/34.285714285714285*xyc1^6.0+1.0/28.571428571428573*xyc1^5.0+1.0/1.4285714285714286*ln(xyc1)+1.0/142.85714285714286*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.4*xyc1^7.0+1.0/1.1428571428571428*xyc1^4.0+1.0/1.4285714285714286*xyc1^3.0-1.0/1.4285714285714286/xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "1.4*7.0*xyc1^6.0+1.0/1.1428571428571428*4.0*xyc1^3.0+1.0/1.4285714285714286*3.0*xyc1^2.0-1.0/1.4285714285714286*-2.0/xyc1^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "9.799999999999999*xyc1^6.0+3.5*xyc1^3.0+2.1*xyc1^2.0+1.4/xyc1^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "9.799999999999999*xyc1^6.0+3.5*xyc1^3.0+2.1*xyc1^2.0+1.4/xyc1^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "9.799999999999999*6.0*xyc1^5.0+3.5*3.0*xyc1^2.0+2.1*2.0*xyc1^1.0+1.4*-3.0/xyc1^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "58.8*xyc1^5.0+10.5*xyc1^2.0+4.2*xyc1-4.199999999999999/xyc1^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "58.8*xyc1^5.0+10.5*xyc1^2.0+4.2*xyc1-4.199999999999999/xyc1^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "58.8*5.0*xyc1^4.0+10.5*2.0*xyc1^1.0+4.2-4.199999999999999*-4.0/xyc1^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "294.0*xyc1^4.0+21.0*xyc1+4.2+16.799999999999997/xyc1^5.0";
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
      
       /*********************************************/
       /************ Missed Out Test Cases **********/
       /*********************************************/
       public static void TestCaseDiff20064() {
        //Test Case 20064
        UsageCalculus.TestCase = 20064;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1*-0.0/x^8 + 1*-0.0/x^5 + 1*-0.0/x^4 - 11*-0.0/x- 25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:-0.0";
        UsageCalculus.TestCaseMatrixID="Coefficients:-0.0:1 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-0.0/x^8.0-0.0/x^5.0-0.0/x^4.0+0.0/x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0*-8.0/x^9.0-0.0*-5.0/x^6.0-0.0*-4.0/x^5.0-0.0/x^2.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "0.0/x^9.0+0.0/x^6.0+0.0/x^5.0-0.0/x^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="-0.0/x^8.0-0.0/x^5.0-0.0/x^4.0+0.0/x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-0.0/-7.0/x^7.0-0.0/-4.0/x^4.0-0.0/-3.0/x^3.0+0.0*ln(x)-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="0.0/x^7.0+0.0/x^4.0+0.0/x^3.0+0.0*ln(x)-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "0.0/x^9.0+0.0/x^6.0+0.0/x^5.0-0.0/x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "0.0*-9.0/x^10.0+0.0*-6.0/x^7.0+0.0*-5.0/x^6.0-0.0*-2.0/x^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-0.0/x^10.0-0.0/x^7.0-0.0/x^6.0+0.0/x^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-0.0/x^10.0-0.0/x^7.0-0.0/x^6.0+0.0/x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-0.0*-10.0/x^11.0-0.0*-7.0/x^8.0-0.0*-6.0/x^7.0+0.0*-3.0/x^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "0.0/x^11.0+0.0/x^8.0+0.0/x^7.0-0.0/x^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "0.0/x^11.0+0.0/x^8.0+0.0/x^7.0-0.0/x^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "0.0*-11.0/x^12.0+0.0*-8.0/x^9.0+0.0*-7.0/x^8.0-0.0*-4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-0.0/x^12.0-0.0/x^9.0-0.0/x^8.0+0.0/x^5.0";
        UsageCalculus.EqnSolArrayMap3[4]="-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="-1.0416666666666667*x^4.0";
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
      
       /*********************************************/
       /************ Missed Out Test Cases **********/
       /*********************************************/
       public static void TestCaseDiff20065() {
        //Test Case 20065
        UsageCalculus.TestCase = 20065;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "8.417508417508415E-5*xyc1^12.0+3.3068783068783067E-4*xyc1^9.0+5.952380952380952E-4*xyc1^8.0-0.008333333333333333*xyc1^5.0-1.0416666666666667*xyc1^4.0";
        UsageCalculus.TestCaseName = "Simple: Coefficients:Exp Form";
        UsageCalculus.TestCaseMatrixID="Coefficients:Exp Form:3 Letter with Numerics:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 5;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/11880.000000000004*xyc1^12.0-5.0*xyc1^12.0+1.0/3024.0*xyc1^9.0-4.0*xyc1^9.0+1.0/1680.0000000000002*xyc1^8.0-4.0*xyc1^8.0-1.0/120.0*xyc1^5.0-1.0416666666666667*xyc1^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/11880.000000000004*12.0*xyc1^11.0-5.0*12.0*xyc1^11.0+1.0/3024.0*9.0*xyc1^8.0-4.0*9.0*xyc1^8.0+1.0/1680.0000000000002*8.0*xyc1^7.0-4.0*8.0*xyc1^7.0-1.0/120.0*5.0*xyc1^4.0-1.0416666666666667*4.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0/990.0000000000003*xyc1^11.0-60.0*xyc1^11.0+1.0/336.0*xyc1^8.0-36.0*xyc1^8.0+1.0/210.00000000000003*xyc1^7.0-32.0*xyc1^7.0-1.0/24.0*xyc1^4.0-4.166666666666667*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/11880.000000000004*xyc1^12.0+1.0/3024.0*xyc1^9.0+1.0/1680.0000000000002*xyc1^8.0-1.0/120.0*xyc1^5.0-1.0416666666666667*xyc1^4.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/11880.000000000004/13.0*xyc1^13.0+1.0/3024.0/10.0*xyc1^10.0+1.0/1680.0000000000002/9.0*xyc1^9.0-1.0/120.0/6.0*xyc1^6.0-1.0416666666666667/5.0*xyc1^5.0";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/154440.00000000006*xyc1^13.0+1.0/30240.0*xyc1^10.0+1.0/15120.000000000002*xyc1^9.0-1.0/720.0*xyc1^6.0-1.0/4.8*xyc1^5.0";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0/990.0000000000003*xyc1^11.0-60.0*xyc1^11.0+1.0/336.0*xyc1^8.0-36.0*xyc1^8.0+1.0/210.00000000000003*xyc1^7.0-32.0*xyc1^7.0-1.0/24.0*xyc1^4.0-4.166666666666667*xyc1^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "1.0/990.0000000000003*11.0*xyc1^10.0-60.0*11.0*xyc1^10.0+1.0/336.0*8.0*xyc1^7.0-36.0*8.0*xyc1^7.0+1.0/210.00000000000003*7.0*xyc1^6.0-32.0*7.0*xyc1^6.0-1.0/24.0*4.0*xyc1^3.0-4.166666666666667*3.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap2[2] = "1.0/90.00000000000003*xyc1^10.0-660.0*xyc1^10.0+1.0/42.0*xyc1^7.0-288.0*xyc1^7.0+1.0/30.000000000000004*xyc1^6.0-224.0*xyc1^6.0-1.0/6.0*xyc1^3.0-12.5*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/154440.00000000006*xyc1^13.0+1.0/30240.0*xyc1^10.0+1.0/15120.000000000002*xyc1^9.0-1.0/720.0*xyc1^6.0-1.0/4.8*xyc1^5.0";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/154440.00000000006/14.0*xyc1^14.0+1.0/30240.0/11.0*xyc1^11.0+1.0/15120.000000000002/10.0*xyc1^10.0-1.0/720.0/7.0*xyc1^7.0-1.0/4.8/6.0*xyc1^6.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/2162160.000000001*xyc1^14.0+1.0/332640.0*xyc1^11.0+1.0/151200.00000000003*xyc1^10.0-1.0/5040.0*xyc1^7.0-1.0/28.799999999999997*xyc1^6.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "1.0/90.00000000000003*xyc1^10.0-660.0*xyc1^10.0+1.0/42.0*xyc1^7.0-288.0*xyc1^7.0+1.0/30.000000000000004*xyc1^6.0-224.0*xyc1^6.0-1.0/6.0*xyc1^3.0-12.5*xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "1.0/90.00000000000003*10.0*xyc1^9.0-660.0*10.0*xyc1^9.0+1.0/42.0*7.0*xyc1^6.0-288.0*7.0*xyc1^6.0+1.0/30.000000000000004*6.0*xyc1^5.0-224.0*6.0*xyc1^5.0-1.0/6.0*3.0*xyc1^2.0-12.5*2.0*xyc1^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "1.0/9.000000000000004*xyc1^9.0-6600.0*xyc1^9.0+1.0/6.0*xyc1^6.0-2016.0*xyc1^6.0+1.0/5.000000000000001*xyc1^5.0-1344.0*xyc1^5.0-1.0/2.0*xyc1^2.0-25.0*xyc1";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/2162160.000000001*xyc1^14.0+1.0/332640.0*xyc1^11.0+1.0/151200.00000000003*xyc1^10.0-1.0/5040.0*xyc1^7.0-1.0/28.799999999999997*xyc1^6.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/2162160.000000001/15.0*xyc1^15.0+1.0/332640.0/12.0*xyc1^12.0+1.0/151200.00000000003/11.0*xyc1^11.0-1.0/5040.0/8.0*xyc1^8.0-1.0/28.799999999999997/7.0*xyc1^7.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/3.2432400000000015E7*xyc1^15.0+1.0/3991680.0*xyc1^12.0+1.0/1663200.0000000002*xyc1^11.0-1.0/40320.0*xyc1^8.0-1.0/201.59999999999997*xyc1^7.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "1.0/9.000000000000004*xyc1^9.0-6600.0*xyc1^9.0+1.0/6.0*xyc1^6.0-2016.0*xyc1^6.0+1.0/5.000000000000001*xyc1^5.0-1344.0*xyc1^5.0-1.0/2.0*xyc1^2.0-25.0*xyc1";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "1.0/9.000000000000004*9.0*xyc1^8.0-6600.0*9.0*xyc1^8.0+1.0/6.0*6.0*xyc1^5.0-2016.0*6.0*xyc1^5.0+1.0/5.000000000000001*5.0*xyc1^4.0-1344.0*5.0*xyc1^4.0-1.0/2.0*2.0*xyc1^1.0-25.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1.0/1.0000000000000004*xyc1^8.0-59400.0*xyc1^8.0+xyc1^5.0-12096.0*xyc1^5.0+1.0/1.0000000000000002*xyc1^4.0-6720.0*xyc1^4.0-xyc1-25.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/3.2432400000000015E7*xyc1^15.0+1.0/3991680.0*xyc1^12.0+1.0/1663200.0000000002*xyc1^11.0-1.0/40320.0*xyc1^8.0-1.0/201.59999999999997*xyc1^7.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/16.0*xyc1^16.0+1.0/3991680.0/13.0*xyc1^13.0+1.0/1663200.0000000002/12.0*xyc1^12.0-1.0/40320.0/9.0*xyc1^9.0-1.0/201.59999999999997/8.0*xyc1^8.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/16.0*xyc1^16.0+1.0/5.189184E7*xyc1^13.0+1.0/1.9958400000000004E7*xyc1^12.0-1.0/362880.0*xyc1^9.0-1.0/1612.7999999999997*xyc1^8.0";
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
       public static void TestCaseDiff20066() {
        //Test Case 20066
        UsageCalculus.TestCase = 20066;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "1/9.0*9.0*xyc1^8.0+1*6.0*6.0*xyc1^5.0+1/5.0*5.0*xyc1^4.0+1*2.0*2.0*xyc1^1.0+1*25.0";
        UsageCalculus.TestCaseName = "Simple: Coefficients:1/9.0*9.0";
        UsageCalculus.TestCaseMatrixID="Coefficients:1/9.0*9.0:3 Letter with Numerics:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 5;
        
        UsageCalculus.EqnSolArrayMap1[1] = "xyc1^8.0+36.0*xyc1^5.0+xyc1^4.0+4.0*xyc1+25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*xyc1^7.0+36.0*5.0*xyc1^4.0+4.0*xyc1^3.0+4.0+25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*xyc1^7.0+180.0*xyc1^4.0+4.0*xyc1^3.0+4.0";
        UsageCalculus.EqnSolArrayMap3[1]="xyc1^8.0+36.0*xyc1^5.0+xyc1^4.0+4.0*xyc1+25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/9.0*xyc1^9.0+36.0/6.0*xyc1^6.0+1.0/5.0*xyc1^5.0+4.0/2.0*xyc1^2.0+25.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/9.0*xyc1^9.0+6.0*xyc1^6.0+1.0/5.0*xyc1^5.0+2.0*xyc1^2.0+25.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*xyc1^7.0+180.0*xyc1^4.0+4.0*xyc1^3.0+4.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*7.0*xyc1^6.0+180.0*4.0*xyc1^3.0+4.0*3.0*xyc1^2.0+4.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*xyc1^6.0+720.0*xyc1^3.0+12.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/9.0*xyc1^9.0+6.0*xyc1^6.0+1.0/5.0*xyc1^5.0+2.0*xyc1^2.0+25.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/9.0/10.0*xyc1^10.0+6.0/7.0*xyc1^7.0+1.0/5.0/6.0*xyc1^6.0+2.0/3.0*xyc1^3.0+25.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/90.0*xyc1^10.0+1.0/1.1666666666666667*xyc1^7.0+1.0/30.0*xyc1^6.0+1.0/1.5*xyc1^3.0+12.5*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*xyc1^6.0+720.0*xyc1^3.0+12.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*xyc1^5.0+720.0*3.0*xyc1^2.0+12.0*2.0*xyc1^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*xyc1^5.0+2160.0*xyc1^2.0+24.0*xyc1";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/90.0*xyc1^10.0+1.0/1.1666666666666667*xyc1^7.0+1.0/30.0*xyc1^6.0+1.0/1.5*xyc1^3.0+12.5*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/90.0/11.0*xyc1^11.0+1.0/1.1666666666666667/8.0*xyc1^8.0+1.0/30.0/7.0*xyc1^7.0+1.0/1.5/4.0*xyc1^4.0+12.5/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/990.0*xyc1^11.0+1.0/9.333333333333334*xyc1^8.0+1.0/210.0*xyc1^7.0+1.0/6.0*xyc1^4.0+4.166666666666667*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*xyc1^5.0+2160.0*xyc1^2.0+24.0*xyc1";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*xyc1^4.0+2160.0*2.0*xyc1^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*xyc1^4.0+4320.0*xyc1+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/990.0*xyc1^11.0+1.0/9.333333333333334*xyc1^8.0+1.0/210.0*xyc1^7.0+1.0/6.0*xyc1^4.0+4.166666666666667*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/990.0/12.0*xyc1^12.0+1.0/9.333333333333334/9.0*xyc1^9.0+1.0/210.0/8.0*xyc1^8.0+1.0/6.0/5.0*xyc1^5.0+4.166666666666667/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/11880.0*xyc1^12.0+1.0/84.0*xyc1^9.0+1.0/1680.0*xyc1^8.0+1.0/30.0*xyc1^5.0+1.0416666666666667*xyc1^4.0";
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
       public static void TestCaseDiff20067() {
        //Test Case 20067
        UsageCalculus.TestCase = 20067;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "5.0/5.0*0.0*x^8 + 0.0*x^5 + 0.0*x^4 - 0.0*x- 25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:0.0:Negative TestCase";
        UsageCalculus.TestCaseMatrixID="Coefficients:0.0:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "0.0*x^8.0+0.0*x^5.0+0.0*x^4.0-0.0*x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+0.0+0.0-0.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "";
        UsageCalculus.EqnSolArrayMap3[1]="0.0*x^8.0+0.0*x^5.0+0.0*x^4.0-0.0*x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="0.0/9.0*x^9.0+0.0/6.0*x^6.0+0.0/5.0*x^5.0-0.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="0.0*x^9.0+0.0*x^6.0+0.0*x^5.0-0.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="0.0*x^9.0+0.0*x^6.0+0.0*x^5.0-0.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="0.0/10.0*x^10.0+0.0/7.0*x^7.0+0.0/6.0*x^6.0-0.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="0.0*x^10.0+0.0*x^7.0+0.0*x^6.0-0.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="0.0*x^10.0+0.0*x^7.0+0.0*x^6.0-0.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="0.0/11.0*x^11.0+0.0/8.0*x^8.0+0.0/7.0*x^7.0-0.0/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="0.0*x^11.0+0.0*x^8.0+0.0*x^7.0-0.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4]="0.0*x^11.0+0.0*x^8.0+0.0*x^7.0-0.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="0.0/12.0*x^12.0+0.0/9.0*x^9.0+0.0/8.0*x^8.0-0.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="0.0*x^12.0+0.0*x^9.0+0.0*x^8.0-0.0*x^5.0-1.0416666666666667*x^4.0";
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
       public static void TestCaseDiff20068() {
        //Test Case 20068
        UsageCalculus.TestCase = 20068;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "1/9.0*9.0/6.0/6.0*xyc1^8.0+1*6.0*6.0/6.0/6.0*xyc1^5.0+1/5.0*5.0/6.0/6.0*xyc1^4.0+1*2.0*2.0/6.0/6.0*xyc1^1.0+1*25.0/6.0/6.0";
        UsageCalculus.TestCaseName = "Simple: Coefficients:1/9.0*9.0";
        UsageCalculus.TestCaseMatrixID="Coefficients:1/9.0*9.0:3 Letter with Numerics:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 5;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/36.0*xyc1^8.0+xyc1^5.0+1.0/36.0*xyc1^4.0+1.0/9.0*xyc1+1.0/1.44";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/36.0*8.0*xyc1^7.0+5.0*xyc1^4.0+1.0/36.0*4.0*xyc1^3.0+1.0/9.0+1.0/1.44*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0/4.5*xyc1^7.0+5.0*xyc1^4.0+1.0/9.0*xyc1^3.0+1.0/9.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/36.0*xyc1^8.0+xyc1^5.0+1.0/36.0*xyc1^4.0+1.0/9.0*xyc1+1.0/1.44";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/36.0/9.0*xyc1^9.0+1.0/6.0*xyc1^6.0+1.0/36.0/5.0*xyc1^5.0+1.0/9.0/2.0*xyc1^2.0+1.0/1.44*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/324.0*xyc1^9.0+1.0/6.0*xyc1^6.0+1.0/180.0*xyc1^5.0+1.0/18.0*xyc1^2.0+1.0/1.44*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0/4.5*xyc1^7.0+5.0*xyc1^4.0+1.0/9.0*xyc1^3.0+1.0/9.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "1.0/4.5*7.0*xyc1^6.0+5.0*4.0*xyc1^3.0+1.0/9.0*3.0*xyc1^2.0+1.0/9.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "1.5555555555555556*xyc1^6.0+20.0*xyc1^3.0+1.0/3.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/324.0*xyc1^9.0+1.0/6.0*xyc1^6.0+1.0/180.0*xyc1^5.0+1.0/18.0*xyc1^2.0+1.0/1.44*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/324.0/10.0*xyc1^10.0+1.0/6.0/7.0*xyc1^7.0+1.0/180.0/6.0*xyc1^6.0+1.0/18.0/3.0*xyc1^3.0+1.0/1.44/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/3240.0*xyc1^10.0+1.0/42.0*xyc1^7.0+1.0/1080.0*xyc1^6.0+1.0/54.0*xyc1^3.0+1.0/2.88*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "1.5555555555555556*xyc1^6.0+20.0*xyc1^3.0+1.0/3.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "1.5555555555555556*6.0*xyc1^5.0+20.0*3.0*xyc1^2.0+1.0/3.0*2.0*xyc1^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "9.333333333333334*xyc1^5.0+60.0*xyc1^2.0+1.0/1.5*xyc1";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/3240.0*xyc1^10.0+1.0/42.0*xyc1^7.0+1.0/1080.0*xyc1^6.0+1.0/54.0*xyc1^3.0+1.0/2.88*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/3240.0/11.0*xyc1^11.0+1.0/42.0/8.0*xyc1^8.0+1.0/1080.0/7.0*xyc1^7.0+1.0/54.0/4.0*xyc1^4.0+1.0/2.88/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/35640.0*xyc1^11.0+1.0/336.0*xyc1^8.0+1.0/7560.0*xyc1^7.0+1.0/216.0*xyc1^4.0+1.0/8.64*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "9.333333333333334*xyc1^5.0+60.0*xyc1^2.0+1.0/1.5*xyc1";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "9.333333333333334*5.0*xyc1^4.0+60.0*2.0*xyc1^1.0+1.0/1.5";
        UsageCalculus.EqnSolArrayMap2[4] = "46.66666666666667*xyc1^4.0+120.0*xyc1+1.0/1.5";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/35640.0*xyc1^11.0+1.0/336.0*xyc1^8.0+1.0/7560.0*xyc1^7.0+1.0/216.0*xyc1^4.0+1.0/8.64*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/35640.0/12.0*xyc1^12.0+1.0/336.0/9.0*xyc1^9.0+1.0/7560.0/8.0*xyc1^8.0+1.0/216.0/5.0*xyc1^5.0+1.0/8.64/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/427680.0*xyc1^12.0+1.0/3024.0*xyc1^9.0+1.0/60480.0*xyc1^8.0+1.0/1080.0*xyc1^5.0+1.0/34.56*xyc1^4.0";
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
       public static void TestCaseDiff20069() {
        //Test Case 20069
        UsageCalculus.TestCase = 20069;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "1/9.0*9.0/6.0/6.0*6.0/6.0*xyc1^8.0+1*6.0*6.0*6.0/6.0*xyc1^5.0+1/5.0*5.0/6.0/6.0*6.0/6.0*xyc1^4.0+1*2.0*2.0/6.0/6.0*6.0/6.0*xyc1^1.0+1*25.0/6.0/6.0*6.0/6.0";
        UsageCalculus.TestCaseName = "Simple: Coefficients:1/9.0*9.0";
        UsageCalculus.TestCaseMatrixID="Coefficients:1/9.0*9.0:3 Letter with Numerics:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 5;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/36.0*xyc1^8.0+36.0*xyc1^5.0+1.0/36.0*xyc1^4.0+1.0/9.0*xyc1+1.0/1.44";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/36.0*8.0*xyc1^7.0+36.0*5.0*xyc1^4.0+1.0/36.0*4.0*xyc1^3.0+1.0/9.0+1.0/1.44*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0/4.5*xyc1^7.0+180.0*xyc1^4.0+1.0/9.0*xyc1^3.0+1.0/9.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/36.0*xyc1^8.0+36.0*xyc1^5.0+1.0/36.0*xyc1^4.0+1.0/9.0*xyc1+1.0/1.44";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/36.0/9.0*xyc1^9.0+36.0/6.0*xyc1^6.0+1.0/36.0/5.0*xyc1^5.0+1.0/9.0/2.0*xyc1^2.0+1.0/1.44*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/324.0*xyc1^9.0+6.0*xyc1^6.0+1.0/180.0*xyc1^5.0+1.0/18.0*xyc1^2.0+1.0/1.44*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0/4.5*xyc1^7.0+180.0*xyc1^4.0+1.0/9.0*xyc1^3.0+1.0/9.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "1.0/4.5*7.0*xyc1^6.0+180.0*4.0*xyc1^3.0+1.0/9.0*3.0*xyc1^2.0+1.0/9.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "1.5555555555555556*xyc1^6.0+720.0*xyc1^3.0+1.0/3.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/324.0*xyc1^9.0+6.0*xyc1^6.0+1.0/180.0*xyc1^5.0+1.0/18.0*xyc1^2.0+1.0/1.44*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/324.0/10.0*xyc1^10.0+6.0/7.0*xyc1^7.0+1.0/180.0/6.0*xyc1^6.0+1.0/18.0/3.0*xyc1^3.0+1.0/1.44/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/3240.0*xyc1^10.0+1.0/1.1666666666666667*xyc1^7.0+1.0/1080.0*xyc1^6.0+1.0/54.0*xyc1^3.0+1.0/2.88*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "1.5555555555555556*xyc1^6.0+720.0*xyc1^3.0+1.0/3.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "1.5555555555555556*6.0*xyc1^5.0+720.0*3.0*xyc1^2.0+1.0/3.0*2.0*xyc1^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "9.333333333333334*xyc1^5.0+2160.0*xyc1^2.0+1.0/1.5*xyc1";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/3240.0*xyc1^10.0+1.0/1.1666666666666667*xyc1^7.0+1.0/1080.0*xyc1^6.0+1.0/54.0*xyc1^3.0+1.0/2.88*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/3240.0/11.0*xyc1^11.0+1.0/1.1666666666666667/8.0*xyc1^8.0+1.0/1080.0/7.0*xyc1^7.0+1.0/54.0/4.0*xyc1^4.0+1.0/2.88/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/35640.0*xyc1^11.0+1.0/9.333333333333334*xyc1^8.0+1.0/7560.0*xyc1^7.0+1.0/216.0*xyc1^4.0+1.0/8.64*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "9.333333333333334*xyc1^5.0+2160.0*xyc1^2.0+1.0/1.5*xyc1";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "9.333333333333334*5.0*xyc1^4.0+2160.0*2.0*xyc1^1.0+1.0/1.5";
        UsageCalculus.EqnSolArrayMap2[4] = "46.66666666666667*xyc1^4.0+4320.0*xyc1+1.0/1.5";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/35640.0*xyc1^11.0+1.0/9.333333333333334*xyc1^8.0+1.0/7560.0*xyc1^7.0+1.0/216.0*xyc1^4.0+1.0/8.64*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/35640.0/12.0*xyc1^12.0+1.0/9.333333333333334/9.0*xyc1^9.0+1.0/7560.0/8.0*xyc1^8.0+1.0/216.0/5.0*xyc1^5.0+1.0/8.64/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/427680.0*xyc1^12.0+1.0/84.0*xyc1^9.0+1.0/60480.0*xyc1^8.0+1.0/1080.0*xyc1^5.0+1.0/34.56*xyc1^4.0";
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
}
