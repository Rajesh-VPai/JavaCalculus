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
import static Calculus.UsageCalculus.EqnSolArrayIntegrAlone;
import static Calculus.UsageCalculus.EqnSolArrayMap3;
import static Calculus.UsageCalculus.EqnSolArrayMap4;
import static Calculus.UsageCalculus.KnownIssueTestCasesFlag;
import static Calculus.UsageCalculus.KnownIssues;
import static Calculus.UsageCalculus.KnownIssuesTestCases;
import static Calculus.UsageCalculus.Order;
import static Calculus.UsageCalculus.TestCase;

/**
 *
 * @author Rajesh V Pai
 */
public class TestHarnessIndConstant {
    //Independent Constant Test Cases
    public static void IndConstant(String AlgoName, long j){
        if(((!RunAllTestCasesFlag)&&(IgnoreKnownIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainIntegrTest"))&&(IntegralGapInfinity(j)))
                ||((!RunAllTestCasesFlag)&&(IgnoreKnownIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainDiffTest"))&&(DifferentialGapInfinity(j))) )
        {
            KnownIssueTestCasesFlag=true;
            KnownIssues++;
            KnownIssuesTestCases.put(KnownIssues, "" + j);
            System.out.println(ConsoleColors.RED +"IndConstant TestCase:j= " + j  + ": Infinite Loop GAP" + ConsoleColors.RESET);
        }
        else if(((!RunAllTestCasesFlag)&&(IgnoreKnownIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainIntegrTest"))&&(IntegralGapException(j)))
                ||((!RunAllTestCasesFlag)&&(IgnoreKnownIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainDiffTest"))&&(DifferentialGapException(j))) )
        {
            KnownIssueTestCasesFlag=true;
            KnownIssues++;
            KnownIssuesTestCases.put(KnownIssues, "" + j);
            System.out.println(ConsoleColors.RED +"IndConstant TestCase:j= " + j  + ": Exception GAP" + ConsoleColors.RESET);
        }else if( ((!RunAllTestCasesFlag)&& (IgnoreCoreIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainIntegrTest"))&&(TrueIntegralGapInfinity(j)))
                ||((!RunAllTestCasesFlag)&& (IgnoreCoreIssuesFlag==false) && (AlgoName.equalsIgnoreCase("mainDiffTest"))&&(TrueDifferentialGapInfinity(j))) )
        {
            CoreKnownIssuesTestCasesFlag=true;
            CoreKnownIssues ++;
             System.out.println(ConsoleColors.RED +"IndConstant TestCase:j= " + j  + ": Infinite Loop GAP" + ConsoleColors.RESET);
        }
        else if(((!RunAllTestCasesFlag)&&(IgnoreCoreIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainIntegrTest"))&&(TrueIntegralGapException(j)))
                ||((!RunAllTestCasesFlag)&&(IgnoreCoreIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainDiffTest"))&&(TrueDifferentialGapException(j))) )
        {
             CoreKnownIssuesTestCasesFlag=true;
             CoreKnownIssues ++;
             System.out.println(ConsoleColors.RED +"IndConstant TestCase:j= " + j  + ": Exception GAP" + ConsoleColors.RESET);
        }
        else {
    switch((int)j)    
        {
            case 50001:
                TestCaseDiff50001();
                break;
            case 50002:
                TestCaseDiff50002();
                break;
            case 50003:
                TestCaseDiff50003();
                break;
            case 50004:
                TestCaseDiff50004();
                break;
            case 50005:
                TestCaseDiff50005();
                break;
            case 50006:
                TestCaseDiff50006();
                break;
            case 50007:
                TestCaseDiff50007();
                break;
            case 50008:
                TestCaseDiff50008();
                break;
            case 50009:
                TestCaseDiff50009();
                break;
            case 50010:
                TestCaseDiff50010();
                break;
            case 50011:
                TestCaseDiff50011();
                break;
            case 50012:
                TestCaseDiff50012();
                break;
            case 50013:
                TestCaseDiff50013();
                break;
            case 50014:
                TestCaseDiff50014();
                break;
            case 50015:
                TestCaseDiff50015();
                break;
            case 50016:
                TestCaseDiff50016();
                break;
            case 50017:
                TestCaseDiff50017();
                break;
            case 50018:
                TestCaseDiff50018();
                break;
            case 50019:
                TestCaseDiff50019();
                break;
            case 50020:
                TestCaseDiff50020();
                break;
            case 50021:
                TestCaseDiff50021();
                break;
            case 50022:
                TestCaseDiff50022();
                break;
            case 50023:
                TestCaseDiff50023();
                break;
            case 50024:
                TestCaseDiff50024();
                break;
            case 50025:
                TestCaseDiff50025();
                break;
            case 50026:
                TestCaseDiff50026();
                break;
            case 50027:
                TestCaseDiff50027();
                break;
            case 50028:
                TestCaseDiff50028();
                break;
            case 50029:
                TestCaseDiff50029();
                break;
            case 50030:
                TestCaseDiff50030();
                break;
            case 50031:
                TestCaseDiff50031();
                break;
            case 50032:
                TestCaseDiff50032();
                break;
            case 50033:
                TestCaseDiff50033();
                break;
            case 50034:
                TestCaseDiff50034();
                break;
            case 50035:
                TestCaseDiff50035();
                break;
            case 50036:
                TestCaseDiff50036();
                break;
            case 50037:
                TestCaseDiff50037();
                break;
            case 50038:
                TestCaseDiff50038();
                break;
            case 50039:
                TestCaseDiff50039();
                break;
            case 50040:
                TestCaseDiff50040();
                break;
            case 50041:
                TestCaseDiff50041();
                break;
            case 50042:
                TestCaseDiff50042();
                break;
//            case 50043:
//                TestCaseDiff50043();
//                break;
/* ********************************************************* */
/* *************************** a^x && x^a equations Begin ** */
/* ********************************************************* */
            case 50044:
                TestCaseDiff50044();
                break;
            case 50045:
                TestCaseDiff50045();
                break;
            case 50046:
                TestCaseDiff50046();
                break;
            case 50047:
                TestCaseDiff50047();
                break;
            case 50048:
                TestCaseDiff50048();
                break;
            case 50049:
                TestCaseDiff50049();
                break;
/* ********************************************************* */
/* *************************** a^x && x^a equations End ** */
/* ********************************************************* */
/* *************************** 2^a  equations Begin ** */                
            case 50050:
                TestCaseDiff50050();
                break;
            case 50051:
                TestCaseDiff50051();
                break;
            case 50052:
                TestCaseDiff50052();
                break;
            case 50053:
                TestCaseDiff50053();
                break;
            case 50054:
                TestCaseDiff50054();
                break;
            case 50055:
                TestCaseDiff50055();
                break;
            case 50056:
                TestCaseDiff50056();
                break;
            case 50057:
                TestCaseDiff50057();
                break;
            case 50058:
                TestCaseDiff50058();
                break;
            case 50059:
                TestCaseDiff50059();
                break;
            case 50060:
                TestCaseDiff50060();
                break;
            case 50061:
                TestCaseDiff50061();
                break;
            case 50062:
                TestCaseDiff50062();
                break;
            case 50063:
                TestCaseDiff50063();
                break;
            case 50064:
                TestCaseDiff50064();
                break;
            case 50065:
                TestCaseDiff50065();
                break;
            case 50066:
                TestCaseDiff50066();
                break;
            case 50067:
                TestCaseDiff50067();
                break;
            case 50068:
                TestCaseDiff50068();
                break;
            case 50069:
                TestCaseDiff50069();
                break;
            case 50070:
                TestCaseDiff50070();
                break;
            case 50071:
                TestCaseDiff50071();
                break;
            case 50072:
                TestCaseDiff50072();
                break;
            case 50073:
                TestCaseDiff50073();
                break;
            case 50074:
                TestCaseDiff50074();
                break;
            case 50075:
                TestCaseDiff50075();
                break;
            case 50076:
                TestCaseDiff50076();
                break;
            case 50077:
                TestCaseDiff50077();
                break;
            case 50078:
                TestCaseDiff50078();
                break;
            case 50079:
                TestCaseDiff50079();
                break;
            case 50080:
                TestCaseDiff50080();
                break;
            case 50081:
                TestCaseDiff50081();
                break;
            case 50082:
                TestCaseDiff50082();
                break;
            case 50083:
                TestCaseDiff50083();
                break;
            case 50084:
                TestCaseDiff50084();
                break;
            case 50085:
                TestCaseDiff50085();
                break;
            case 50086:
                TestCaseDiff50086();
                break;
            case 50087:
                TestCaseDiff50087();
                break;
            case 50088:
                TestCaseDiff50088();
                break;
            case 50089:
                TestCaseDiff50089();
                break;
            case 50090:
                TestCaseDiff50090();
                break;
            case 50091:
                TestCaseDiff50091();
                break;
//            case 50092:
//                TestCaseDiff50092();
//                break;
            /* *************************** 2^a  equations End ** */  
            case 50093:
                TestCaseDiff50093();
                break;
//            case 50094:
//                TestCaseDiff50094();
//                break;
//            case 50095:
//                TestCaseDiff50095();
//                break;
            default:
                System.out.println(ConsoleColors.RED +"IndConstant TestCase:j= " + j  + ": Gap" + ConsoleColors.RESET);
                break;
        }
     }
    }
    /* **************************************** */
    //Structured Testing
    /* **************************************** */
    
    /* **************************************** */
        /* ***************IndConstant Test Case***************** */
        /* **************************************** */
          public static void TestCaseDiff50001() {
        //Test Case 50001
        UsageCalculus.TestCase = 50001;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values Except 4th Order Integration";
        UsageCalculus.EqnUnderTest = "p/9.0*xyc1^9.0 + p*6.0*xyc1^6.0 + p/5.0*xyc1^5.0 + p*2.0*xyc1^2.0 + p*25.0*xyc1 + p*50.0";
        UsageCalculus.TestCaseName = "Standard:Independent Constant:Basic Equation:Divide Operator";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "p/9.0*xyc1^9.0+p*6.0*xyc1^6.0+p/5.0*xyc1^5.0+p*2.0*xyc1^2.0+p*25.0*xyc1+p*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "p/9.0*9.0*xyc1^8.0+p*6.0*6.0*xyc1^5.0+p/5.0*5.0*xyc1^4.0+p*2.0*2.0*xyc1^1.0+p*25.0+p*50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "p*xyc1^8.0+p*36.0*xyc1^5.0+p*xyc1^4.0+p*4.0*xyc1+p*25.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="p/9.0*xyc1^9.0+p*6.0*xyc1^6.0+p/5.0*xyc1^5.0+p*2.0*xyc1^2.0+p*25.0*xyc1+p*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="p/9.0/10.0*xyc1^10.0+p*6.0/7.0*xyc1^7.0+p/5.0/6.0*xyc1^6.0+p*2.0/3.0*xyc1^3.0+p*25.0/2.0*xyc1^2.0+p*50.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="p*0.011111111111111112*xyc1^10.0+p*0.8571428571428571*xyc1^7.0+p*0.03333333333333333*xyc1^6.0+p*0.6666666666666666*xyc1^3.0+p*12.5*xyc1^2.0+p*50.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "p*xyc1^8.0+p*36.0*xyc1^5.0+p*xyc1^4.0+p*4.0*xyc1+p*25.0+p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "p*8.0*xyc1^7.0+p*36.0*5.0*xyc1^4.0+p*4.0*xyc1^3.0+p*4.0+p*25.0*0.0+p*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "p*8.0*xyc1^7.0+p*180.0*xyc1^4.0+p*4.0*xyc1^3.0+p*4.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="p*0.011111111111111112*xyc1^10.0+p*0.8571428571428571*xyc1^7.0+p*0.03333333333333333*xyc1^6.0+p*0.6666666666666666*xyc1^3.0+p*12.5*xyc1^2.0+p*50.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="p*0.011111111111111112/11.0*xyc1^11.0+p*0.8571428571428571/8.0*xyc1^8.0+p*0.03333333333333333/7.0*xyc1^7.0+p*0.6666666666666666/4.0*xyc1^4.0+p*12.5/3.0*xyc1^3.0+p*50.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="p*0.00101010101010101*xyc1^11.0+p*0.10714285714285714*xyc1^8.0+p*0.0047619047619047615*xyc1^7.0+p*0.16666666666666666*xyc1^4.0+p*4.166666666666667*xyc1^3.0+p*25.0*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "p*8.0*xyc1^7.0+p*180.0*xyc1^4.0+p*4.0*xyc1^3.0+p*4.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "p*8.0*7.0*xyc1^6.0+p*180.0*4.0*xyc1^3.0+p*4.0*3.0*xyc1^2.0+p*4.0*0.0+p*0.0*0.0+p*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "p*56.0*xyc1^6.0+p*720.0*xyc1^3.0+p*12.0*xyc1^2.0+p*0.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="p*0.00101010101010101*xyc1^11.0+p*0.10714285714285714*xyc1^8.0+p*0.0047619047619047615*xyc1^7.0+p*0.16666666666666666*xyc1^4.0+p*4.166666666666667*xyc1^3.0+p*25.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="p*0.00101010101010101/12.0*xyc1^12.0+p*0.10714285714285714/9.0*xyc1^9.0+p*0.0047619047619047615/8.0*xyc1^8.0+p*0.16666666666666666/5.0*xyc1^5.0+p*4.166666666666667/4.0*xyc1^4.0+p*25.0/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="p*8.417508417508418E-5*xyc1^12.0+p*0.011904761904761904*xyc1^9.0+p*5.952380952380952E-4*xyc1^8.0+p*0.03333333333333333*xyc1^5.0+p*1.0416666666666667*xyc1^4.0+p*8.333333333333334*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "p*56.0*xyc1^6.0+p*720.0*xyc1^3.0+p*12.0*xyc1^2.0+p*0.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "p*56.0*6.0*xyc1^5.0+p*720.0*3.0*xyc1^2.0+p*12.0*2.0*xyc1^1.0+p*0.0*0.0+p*0.0*0.0+p*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "p*336.0*xyc1^5.0+p*2160.0*xyc1^2.0+p*24.0*xyc1+p*0.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="p*8.417508417508418E-5*xyc1^12.0+p*0.011904761904761904*xyc1^9.0+p*5.952380952380952E-4*xyc1^8.0+p*0.03333333333333333*xyc1^5.0+p*1.0416666666666667*xyc1^4.0+p*8.333333333333334*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="p*8.417508417508418E-5/13.0*xyc1^13.0+p*0.011904761904761904/10.0*xyc1^10.0+p*5.952380952380952E-4/9.0*xyc1^9.0+p*0.03333333333333333/6.0*xyc1^6.0+p*1.0416666666666667/5.0*xyc1^5.0+p*8.333333333333334/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="p*6.475006475006475E-6*xyc1^13.0+p*0.0011904761904761904*xyc1^10.0+p*6.613756613756613E-5*xyc1^9.0+p*0.005555555555555556*xyc1^6.0+p*0.20833333333333334*xyc1^5.0+p*2.0833333333333335*xyc1^4.0";
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
          public static void TestCaseDiff50002() {
        //Test Case 50002
        UsageCalculus.TestCase = 50002;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "a*x^8 + a*x^5 + a*x^4 - 2*a*x- 25*(2)";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a*x^8.0+a*x^5.0+a*x^4.0-a*2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a*8.0*x^7.0+a*5.0*x^4.0+a*4.0*x^3.0-a*2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a*8.0*x^7.0+a*5.0*x^4.0+a*4.0*x^3.0-a*2.0";
        UsageCalculus.EqnSolArrayMap3[1]="a*x^8.0+a*x^5.0+a*x^4.0-a*2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a/9.0*x^9.0+a/6.0*x^6.0+a/5.0*x^5.0-a*x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a/9.0*x^9.0+a/6.0*x^6.0+a/5.0*x^5.0-a*x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a*8.0*x^7.0+a*5.0*x^4.0+a*4.0*x^3.0-a*2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a*8.0*7.0*x^6.0+a*5.0*4.0*x^3.0+a*4.0*3.0*x^2.0-a*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a*56.0*x^6.0+a*20.0*x^3.0+a*12.0*x^2.0-a*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a/9.0*x^9.0+a/6.0*x^6.0+a/5.0*x^5.0-a*x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a/9.0/10.0*x^10.0+a/6.0/7.0*x^7.0+a/5.0/6.0*x^6.0-a/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a*0.011111111111111112*x^10.0+a*0.023809523809523808*x^7.0+a*0.03333333333333333*x^6.0-a/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a*56.0*x^6.0+a*20.0*x^3.0+a*12.0*x^2.0-a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a*56.0*6.0*x^5.0+a*20.0*3.0*x^2.0+a*12.0*2.0*x^1.0-a*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a*336.0*x^5.0+a*60.0*x^2.0+a*24.0*x-a*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a*0.011111111111111112*x^10.0+a*0.023809523809523808*x^7.0+a*0.03333333333333333*x^6.0-a/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a*0.011111111111111112/11.0*x^11.0+a*0.023809523809523808/8.0*x^8.0+a*0.03333333333333333/7.0*x^7.0-a/3.0/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a*0.00101010101010101*x^11.0+a*0.002976190476190476*x^8.0+a*0.0047619047619047615*x^7.0-a/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a*336.0*x^5.0+a*60.0*x^2.0+a*24.0*x-a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a*336.0*5.0*x^4.0+a*60.0*2.0*x^1.0+a*24.0-a*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a*1680.0*x^4.0+a*120.0*x+a*24.0-a*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a*0.00101010101010101*x^11.0+a*0.002976190476190476*x^8.0+a*0.0047619047619047615*x^7.0-a/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a*0.00101010101010101/12.0*x^12.0+a*0.002976190476190476/9.0*x^9.0+a*0.0047619047619047615/8.0*x^8.0-a/12.0/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a*8.417508417508418E-5*x^12.0+a*3.3068783068783067E-4*x^9.0+a*5.952380952380952E-4*x^8.0-a/60.0*x^5.0-2.0833333333333335*x^4.0";
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
       
       public static void TestCaseDiff50003() {
        //Test Case 50003
        UsageCalculus.TestCase = 50003;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*a*x^8 + a*x^5 + a*x^4 - 2*x*a- 25*2*a*1.0";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a*x^8.0+a*x^5.0+a*x^4.0-a*2.0*x-a*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a*8.0*x^7.0+a*5.0*x^4.0+a*4.0*x^3.0-a*2.0-a*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a*8.0*x^7.0+a*5.0*x^4.0+a*4.0*x^3.0-a*2.0-a*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="a*x^8.0+a*x^5.0+a*x^4.0-a*2.0*x-a*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a/9.0*x^9.0+a/6.0*x^6.0+a/5.0*x^5.0-a*x^2.0-a*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a/9.0*x^9.0+a/6.0*x^6.0+a/5.0*x^5.0-a*x^2.0-a*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a*8.0*x^7.0+a*5.0*x^4.0+a*4.0*x^3.0-a*2.0-a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a*8.0*7.0*x^6.0+a*5.0*4.0*x^3.0+a*4.0*3.0*x^2.0-a*2.0*0.0-a*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a*56.0*x^6.0+a*20.0*x^3.0+a*12.0*x^2.0-a*0.0-a*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a/9.0*x^9.0+a/6.0*x^6.0+a/5.0*x^5.0-a*x^2.0-a*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a/9.0/10.0*x^10.0+a/6.0/7.0*x^7.0+a/5.0/6.0*x^6.0-a/3.0*x^3.0-a*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a*0.011111111111111112*x^10.0+a*0.023809523809523808*x^7.0+a*0.03333333333333333*x^6.0-a/3.0*x^3.0-a*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a*56.0*x^6.0+a*20.0*x^3.0+a*12.0*x^2.0-a*0.0-a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a*56.0*6.0*x^5.0+a*20.0*3.0*x^2.0+a*12.0*2.0*x^1.0-a*0.0-a*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a*336.0*x^5.0+a*60.0*x^2.0+a*24.0*x-a*0.0-a*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a*0.011111111111111112*x^10.0+a*0.023809523809523808*x^7.0+a*0.03333333333333333*x^6.0-a/3.0*x^3.0-a*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a*0.011111111111111112/11.0*x^11.0+a*0.023809523809523808/8.0*x^8.0+a*0.03333333333333333/7.0*x^7.0-a/3.0/4.0*x^4.0-a*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a*0.00101010101010101*x^11.0+a*0.002976190476190476*x^8.0+a*0.0047619047619047615*x^7.0-a*0.08333333333333333*x^4.0-a*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a*336.0*x^5.0+a*60.0*x^2.0+a*24.0*x-a*0.0-a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a*336.0*5.0*x^4.0+a*60.0*2.0*x^1.0+a*24.0-a*0.0-a*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a*1680.0*x^4.0+a*120.0*x+a*24.0-a*0.0-a*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a*0.00101010101010101*x^11.0+a*0.002976190476190476*x^8.0+a*0.0047619047619047615*x^7.0-a*0.08333333333333333*x^4.0-a*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a*0.00101010101010101/12.0*x^12.0+a*0.002976190476190476/9.0*x^9.0+a*0.0047619047619047615/8.0*x^8.0-a*0.08333333333333333/5.0*x^5.0-a*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a*8.417508417508418E-5*x^12.0+a*3.3068783068783067E-4*x^9.0+a*5.952380952380952E-4*x^8.0-a*0.016666666666666666*x^5.0-a*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff50004() {
        //Test Case 50004
        UsageCalculus.TestCase = 50004;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*1.0*a^2*x^8 + a^2*x^5 + a^2*x^4 - 2*x*a^2- 25*2*a^3*1.0*1.0";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a^2.0*x^8.0+a^2.0*x^5.0+a^2.0*x^4.0-a^2.0*2.0*x-a^3.0*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a^2.0*8.0*x^7.0+a^2.0*5.0*x^4.0+a^2.0*4.0*x^3.0-a^2.0*2.0-a^3.0*50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a^2.0*8.0*x^7.0+a^2.0*5.0*x^4.0+a^2.0*4.0*x^3.0-a^2.0*2.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[1]=  "a^2.0*x^8.0+a^2.0*x^5.0+a^2.0*x^4.0-a^2.0*2.0*x-a^3.0*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a^2.0/9.0*x^9.0+a^2.0/6.0*x^6.0+a^2.0/5.0*x^5.0-a^2.0*x^2.0-a^3.0*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a^2.0/9.0*x^9.0+a^2.0/6.0*x^6.0+a^2.0/5.0*x^5.0-a^2.0*x^2.0-a^3.0*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a^2.0*8.0*x^7.0+a^2.0*5.0*x^4.0+a^2.0*4.0*x^3.0-a^2.0*2.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a^2.0*8.0*7.0*x^6.0+a^2.0*5.0*4.0*x^3.0+a^2.0*4.0*3.0*x^2.0-a^2.0*2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a^2.0*56.0*x^6.0+a^2.0*20.0*x^3.0+a^2.0*12.0*x^2.0-a^2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a^2.0/9.0*x^9.0+a^2.0/6.0*x^6.0+a^2.0/5.0*x^5.0-a^2.0*x^2.0-a^3.0*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a^2.0/9.0/10.0*x^10.0+a^2.0/6.0/7.0*x^7.0+a^2.0/5.0/6.0*x^6.0-a^2.0/3.0*x^3.0-a^3.0*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a^2.0*0.011111111111111112*x^10.0+a^2.0*0.023809523809523808*x^7.0+a^2.0*0.03333333333333333*x^6.0-a^2.0/3.0*x^3.0-a^3.0*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a^2.0*56.0*x^6.0+a^2.0*20.0*x^3.0+a^2.0*12.0*x^2.0-a^2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a^2.0*56.0*6.0*x^5.0+a^2.0*20.0*3.0*x^2.0+a^2.0*12.0*2.0*x^1.0-a^2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a^2.0*336.0*x^5.0+a^2.0*60.0*x^2.0+a^2.0*24.0*x-a^2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a^2.0*0.011111111111111112*x^10.0+a^2.0*0.023809523809523808*x^7.0+a^2.0*0.03333333333333333*x^6.0-a^2.0/3.0*x^3.0-a^3.0*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a^2.0*0.011111111111111112/11.0*x^11.0+a^2.0*0.023809523809523808/8.0*x^8.0+a^2.0*0.03333333333333333/7.0*x^7.0-a^2.0/3.0/4.0*x^4.0-a^3.0*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a^2.0*0.00101010101010101*x^11.0+a^2.0*0.002976190476190476*x^8.0+a^2.0*0.0047619047619047615*x^7.0-a^2.0*0.08333333333333333*x^4.0-a^3.0*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a^2.0*336.0*x^5.0+a^2.0*60.0*x^2.0+a^2.0*24.0*x-a^2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a^2.0*336.0*5.0*x^4.0+a^2.0*60.0*2.0*x^1.0+a^2.0*24.0-a^2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a^2.0*1680.0*x^4.0+a^2.0*120.0*x+a^2.0*24.0-a^2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a^2.0*0.00101010101010101*x^11.0+a^2.0*0.002976190476190476*x^8.0+a^2.0*0.0047619047619047615*x^7.0-a^2.0*0.08333333333333333*x^4.0-a^3.0*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a^2.0*0.00101010101010101/12.0*x^12.0+a^2.0*0.002976190476190476/9.0*x^9.0+a^2.0*0.0047619047619047615/8.0*x^8.0-a^2.0*0.08333333333333333/5.0*x^5.0-a^3.0*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a^2.0*8.417508417508418E-5*x^12.0+a^2.0*3.3068783068783067E-4*x^9.0+a^2.0*5.952380952380952E-4*x^8.0-a^2.0*0.016666666666666666*x^5.0-a^3.0*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff50005() {
        //Test Case 50005
        UsageCalculus.TestCase = 50005;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "2^x*x^8 + 2^x*x^5 + 2^x*x^4 - 2*x*2^x- 25*2*3^x";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 2;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^8.0*2.0^x+x^5.0*2.0^x+x^4.0*2.0^x-2.0*x*2.0^x-50.0*3.0^x";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "2.0^x*8.0*x^7.0+ln(2.0)*2.0^x*x^8.0+2.0^x*5.0*x^4.0+ln(2.0)*2.0^x*x^5.0+2.0^x*4.0*x^3.0+ln(2.0)*2.0^x*x^4.0-2.0^x*2.0+ln(2.0)*2.0^x*2.0*x-50.0*ln(3.0)*3.0^x";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*x^7.0*2.0^x+ln(2.0)*2.0^x*x^8.0+5.0*x^4.0*2.0^x+ln(2.0)*2.0^x*x^5.0+4.0*x^3.0*2.0^x+ln(2.0)*2.0^x*x^4.0-2.0*2.0^x+ln(2.0)*2.0*2.0^x*x-50.0*ln(3.0)*3.0^x";
        UsageCalculus.EqnSolArrayMap3[1]="x^8.0*2.0^x+x^5.0*2.0^x+x^4.0*2.0^x-2.0*x*2.0^x-50.0*3.0^x";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="2.0^x*x^8.0-1.0/9.0*x^9.0*ln(2.0)+2.0^x*x^5.0-1.0/6.0*x^6.0*ln(2.0)+2.0^x*x^4.0-1.0/5.0*x^5.0*ln(2.0)-x^2.0*1.0-1.0/ln(50.0*3.0)*50.0*3.0^x";
        UsageCalculus.EqnSolArrayMap4[1]="";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*x^7.0*2.0^x+ln(2.0)*2.0^x*x^8.0+5.0*x^4.0*2.0^x+ln(2.0)*2.0^x*x^5.0+4.0*x^3.0*2.0^x+ln(2.0)*2.0^x*x^4.0-2.0*2.0^x+ln(2.0)*2.0*2.0^x*x-50.0*ln(3.0)*3.0^x";
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
       
       
       public static void TestCaseDiff50006() {
        //Test Case 50006
        UsageCalculus.TestCase = 50006;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "a^b*x^8 + a^b*x^5 + a^b*x^4 - 2*x*a^b- 25*2*a^b";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a^b*x^8.0+a^b*x^5.0+a^b*x^4.0-a^b*2.0*x-a^b*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a^b*8.0*x^7.0+a^b*5.0*x^4.0+a^b*4.0*x^3.0-a^b*2.0-a^b*50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a^b*8.0*x^7.0+a^b*5.0*x^4.0+a^b*4.0*x^3.0-a^b*2.0-a^b*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="a^b*x^8.0+a^b*x^5.0+a^b*x^4.0-a^b*2.0*x-a^b*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a^b/9.0*x^9.0+a^b/6.0*x^6.0+a^b/5.0*x^5.0-a^b*x^2.0-a^b*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a^b/9.0*x^9.0+a^b/6.0*x^6.0+a^b/5.0*x^5.0-a^b*x^2.0-a^b*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a^b*8.0*x^7.0+a^b*5.0*x^4.0+a^b*4.0*x^3.0-a^b*2.0-a^b*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a^b*8.0*7.0*x^6.0+a^b*5.0*4.0*x^3.0+a^b*4.0*3.0*x^2.0-a^b*2.0*0.0-a^b*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a^b*56.0*x^6.0+a^b*20.0*x^3.0+a^b*12.0*x^2.0-a^b*0.0-a^b*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a^b/9.0*x^9.0+a^b/6.0*x^6.0+a^b/5.0*x^5.0-a^b*x^2.0-a^b*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a^b/9.0/10.0*x^10.0+a^b/6.0/7.0*x^7.0+a^b/5.0/6.0*x^6.0-a^b/3.0*x^3.0-a^b*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a^b*0.011111111111111112*x^10.0+a^b*0.023809523809523808*x^7.0+a^b*0.03333333333333333*x^6.0-a^b/3.0*x^3.0-a^b*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a^b*56.0*x^6.0+a^b*20.0*x^3.0+a^b*12.0*x^2.0-a^b*0.0-a^b*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a^b*56.0*6.0*x^5.0+a^b*20.0*3.0*x^2.0+a^b*12.0*2.0*x^1.0-a^b*0.0*0.0-a^b*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a^b*336.0*x^5.0+a^b*60.0*x^2.0+a^b*24.0*x-a^b*0.0-a^b*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a^b*0.011111111111111112*x^10.0+a^b*0.023809523809523808*x^7.0+a^b*0.03333333333333333*x^6.0-a^b/3.0*x^3.0-a^b*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a^b*0.011111111111111112/11.0*x^11.0+a^b*0.023809523809523808/8.0*x^8.0+a^b*0.03333333333333333/7.0*x^7.0-a^b/3.0/4.0*x^4.0-a^b*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a^b*0.00101010101010101*x^11.0+a^b*0.002976190476190476*x^8.0+a^b*0.0047619047619047615*x^7.0-a^b*0.08333333333333333*x^4.0-a^b*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a^b*336.0*x^5.0+a^b*60.0*x^2.0+a^b*24.0*x-a^b*0.0-a^b*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a^b*336.0*5.0*x^4.0+a^b*60.0*2.0*x^1.0+a^b*24.0-a^b*0.0*0.0-a^b*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a^b*1680.0*x^4.0+a^b*120.0*x+a^b*24.0-a^b*0.0-a^b*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a^b*0.00101010101010101*x^11.0+a^b*0.002976190476190476*x^8.0+a^b*0.0047619047619047615*x^7.0-a^b*0.08333333333333333*x^4.0-a^b*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a^b*0.00101010101010101/12.0*x^12.0+a^b*0.002976190476190476/9.0*x^9.0+a^b*0.0047619047619047615/8.0*x^8.0-a^b*0.08333333333333333/5.0*x^5.0-a^b*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a^b*8.417508417508418E-5*x^12.0+a^b*3.3068783068783067E-4*x^9.0+a^b*5.952380952380952E-4*x^8.0-a^b*0.016666666666666666*x^5.0-a^b*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff50007() {
        //Test Case 50007
        UsageCalculus.TestCase = 50007;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "a*b*c*x^8 + a*b*c*x^5 + a*b*c*x^4 - 2*x*a*b*c- 25*2*a*b*c";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a*b*c*x^8.0+a*b*c*x^5.0+a*b*c*x^4.0-a*b*c*2.0*x-a*b*c*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a*b*c*8.0*x^7.0+a*b*c*5.0*x^4.0+a*b*c*4.0*x^3.0-a*b*c*2.0-a*b*c*50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a*b*c*8.0*x^7.0+a*b*c*5.0*x^4.0+a*b*c*4.0*x^3.0-a*b*c*2.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayMap3[1] = "a*b*c*x^8.0+a*b*c*x^5.0+a*b*c*x^4.0-a*b*c*2.0*x-a*b*c*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a*b*c/9.0*x^9.0+a*b*c/6.0*x^6.0+a*b*c/5.0*x^5.0-a*b*c*x^2.0-a*b*c*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a*b*c/9.0*x^9.0+a*b*c/6.0*x^6.0+a*b*c/5.0*x^5.0-a*b*c*x^2.0-a*b*c*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a*b*c*8.0*x^7.0+a*b*c*5.0*x^4.0+a*b*c*4.0*x^3.0-a*b*c*2.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a*b*c*8.0*7.0*x^6.0+a*b*c*5.0*4.0*x^3.0+a*b*c*4.0*3.0*x^2.0-a*b*c*2.0*0.0-a*b*c*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a*b*c*56.0*x^6.0+a*b*c*20.0*x^3.0+a*b*c*12.0*x^2.0-a*b*c*0.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a*b*c/9.0*x^9.0+a*b*c/6.0*x^6.0+a*b*c/5.0*x^5.0-a*b*c*x^2.0-a*b*c*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a*b*c/9.0/10.0*x^10.0+a*b*c/6.0/7.0*x^7.0+a*b*c/5.0/6.0*x^6.0-a*b*c/3.0*x^3.0-a*b*c*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a*b*c*0.011111111111111112*x^10.0+a*b*c*0.023809523809523808*x^7.0+a*b*c*0.03333333333333333*x^6.0-a*b*c/3.0*x^3.0-a*b*c*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a*b*c*56.0*x^6.0+a*b*c*20.0*x^3.0+a*b*c*12.0*x^2.0-a*b*c*0.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a*b*c*56.0*6.0*x^5.0+a*b*c*20.0*3.0*x^2.0+a*b*c*12.0*2.0*x^1.0-a*b*c*0.0*0.0-a*b*c*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a*b*c*336.0*x^5.0+a*b*c*60.0*x^2.0+a*b*c*24.0*x-a*b*c*0.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a*b*c*0.011111111111111112*x^10.0+a*b*c*0.023809523809523808*x^7.0+a*b*c*0.03333333333333333*x^6.0-a*b*c/3.0*x^3.0-a*b*c*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a*b*c*0.011111111111111112/11.0*x^11.0+a*b*c*0.023809523809523808/8.0*x^8.0+a*b*c*0.03333333333333333/7.0*x^7.0-a*b*c/3.0/4.0*x^4.0-a*b*c*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a*b*c*0.00101010101010101*x^11.0+a*b*c*0.002976190476190476*x^8.0+a*b*c*0.0047619047619047615*x^7.0-a*b*c*0.08333333333333333*x^4.0-a*b*c*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a*b*c*336.0*x^5.0+a*b*c*60.0*x^2.0+a*b*c*24.0*x-a*b*c*0.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a*b*c*336.0*5.0*x^4.0+a*b*c*60.0*2.0*x^1.0+a*b*c*24.0-a*b*c*0.0*0.0-a*b*c*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a*b*c*1680.0*x^4.0+a*b*c*120.0*x+a*b*c*24.0-a*b*c*0.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a*b*c*0.00101010101010101*x^11.0+a*b*c*0.002976190476190476*x^8.0+a*b*c*0.0047619047619047615*x^7.0-a*b*c*0.08333333333333333*x^4.0-a*b*c*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a*b*c*0.00101010101010101/12.0*x^12.0+a*b*c*0.002976190476190476/9.0*x^9.0+a*b*c*0.0047619047619047615/8.0*x^8.0-a*b*c*0.08333333333333333/5.0*x^5.0-a*b*c*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a*b*c*8.417508417508418E-5*x^12.0+a*b*c*3.3068783068783067E-4*x^9.0+a*b*c*5.952380952380952E-4*x^8.0-a*b*c*0.016666666666666666*x^5.0-a*b*c*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff50008() {
        //Test Case 50008
        UsageCalculus.TestCase = 50008;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "a/b/c*x^8 + a/b/c*x^5 + a/b/c*x^4 - 2*x*a/b/c- 25*2*a/b/c";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a/b/c*x^8.0+a/b/c*x^5.0+a/b/c*x^4.0-a/b/c*2.0*x-a/b/c*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a/b/c*8.0*x^7.0+a/b/c*5.0*x^4.0+a/b/c*4.0*x^3.0-a/b/c*2.0-a/b/c*50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a/b/c*8.0*x^7.0+a/b/c*5.0*x^4.0+a/b/c*4.0*x^3.0-a/b/c*2.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="a/b/c*x^8.0+a/b/c*x^5.0+a/b/c*x^4.0-a/b/c*2.0*x-a/b/c*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a/b/c/9.0*x^9.0+a/b/c/6.0*x^6.0+a/b/c/5.0*x^5.0-a/b/c*x^2.0-a/b/c*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a/b/c/9.0*x^9.0+a/b/c/6.0*x^6.0+a/b/c/5.0*x^5.0-a/b/c*x^2.0-a/b/c*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a/b/c*8.0*x^7.0+a/b/c*5.0*x^4.0+a/b/c*4.0*x^3.0-a/b/c*2.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a/b/c*8.0*7.0*x^6.0+a/b/c*5.0*4.0*x^3.0+a/b/c*4.0*3.0*x^2.0-a/b/c*2.0*0.0-a/b/c*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a/b/c*56.0*x^6.0+a/b/c*20.0*x^3.0+a/b/c*12.0*x^2.0-a/b/c*0.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a/b/c/9.0*x^9.0+a/b/c/6.0*x^6.0+a/b/c/5.0*x^5.0-a/b/c*x^2.0-a/b/c*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a/b/c/9.0/10.0*x^10.0+a/b/c/6.0/7.0*x^7.0+a/b/c/5.0/6.0*x^6.0-a/b/c/3.0*x^3.0-a/b/c*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a/b/c*0.011111111111111112*x^10.0+a/b/c*0.023809523809523808*x^7.0+a/b/c*0.03333333333333333*x^6.0-a/b/c/3.0*x^3.0-a/b/c*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a/b/c*56.0*x^6.0+a/b/c*20.0*x^3.0+a/b/c*12.0*x^2.0-a/b/c*0.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a/b/c*56.0*6.0*x^5.0+a/b/c*20.0*3.0*x^2.0+a/b/c*12.0*2.0*x^1.0-a/b/c*0.0*0.0-a/b/c*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a/b/c*336.0*x^5.0+a/b/c*60.0*x^2.0+a/b/c*24.0*x-a/b/c*0.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a/b/c*0.011111111111111112*x^10.0+a/b/c*0.023809523809523808*x^7.0+a/b/c*0.03333333333333333*x^6.0-a/b/c/3.0*x^3.0-a/b/c*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a/b/c*0.011111111111111112/11.0*x^11.0+a/b/c*0.023809523809523808/8.0*x^8.0+a/b/c*0.03333333333333333/7.0*x^7.0-a/b/c/3.0/4.0*x^4.0-a/b/c*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a/b/c*0.00101010101010101*x^11.0+a/b/c*0.002976190476190476*x^8.0+a/b/c*0.0047619047619047615*x^7.0-a/b/c*0.08333333333333333*x^4.0-a/b/c*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a/b/c*336.0*x^5.0+a/b/c*60.0*x^2.0+a/b/c*24.0*x-a/b/c*0.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a/b/c*336.0*5.0*x^4.0+a/b/c*60.0*2.0*x^1.0+a/b/c*24.0-a/b/c*0.0*0.0-a/b/c*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a/b/c*1680.0*x^4.0+a/b/c*120.0*x+a/b/c*24.0-a/b/c*0.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a/b/c*0.00101010101010101*x^11.0+a/b/c*0.002976190476190476*x^8.0+a/b/c*0.0047619047619047615*x^7.0-a/b/c*0.08333333333333333*x^4.0-a/b/c*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a/b/c*0.00101010101010101/12.0*x^12.0+a/b/c*0.002976190476190476/9.0*x^9.0+a/b/c*0.0047619047619047615/8.0*x^8.0-a/b/c*0.08333333333333333/5.0*x^5.0-a/b/c*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a/b/c*8.417508417508418E-5*x^12.0+a/b/c*3.3068783068783067E-4*x^9.0+a/b/c*5.952380952380952E-4*x^8.0-a/b/c*0.016666666666666666*x^5.0-a/b/c*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff50009() {
        //Test Case 50009
        UsageCalculus.TestCase = 50009;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "a*b/c*x^8 + a*b/c*x^5 + a*b/c*x^4 - 2*x*a*b/c- 25*2*a*b/c";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a*b/c*x^8.0+a*b/c*x^5.0+a*b/c*x^4.0-a*b/c*2.0*x-a*b/c*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a*b/c*8.0*x^7.0+a*b/c*5.0*x^4.0+a*b/c*4.0*x^3.0-a*b/c*2.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a*b/c*8.0*x^7.0+a*b/c*5.0*x^4.0+a*b/c*4.0*x^3.0-a*b/c*2.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="a*b/c*x^8.0+a*b/c*x^5.0+a*b/c*x^4.0-a*b/c*2.0*x-a*b/c*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a*b/c/9.0*x^9.0+a*b/c/6.0*x^6.0+a*b/c/5.0*x^5.0-a*b/c*x^2.0-a*b/c*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a*b/c/9.0*x^9.0+a*b/c/6.0*x^6.0+a*b/c/5.0*x^5.0-a*b/c*x^2.0-a*b/c*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a*b/c*8.0*x^7.0+a*b/c*5.0*x^4.0+a*b/c*4.0*x^3.0-a*b/c*2.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a*b/c*8.0*7.0*x^6.0+a*b/c*5.0*4.0*x^3.0+a*b/c*4.0*3.0*x^2.0-a*b/c*2.0*0.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a*b/c*56.0*x^6.0+a*b/c*20.0*x^3.0+a*b/c*12.0*x^2.0-a*b/c*0.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a*b/c/9.0*x^9.0+a*b/c/6.0*x^6.0+a*b/c/5.0*x^5.0-a*b/c*x^2.0-a*b/c*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a*b/c/9.0/10.0*x^10.0+a*b/c/6.0/7.0*x^7.0+a*b/c/5.0/6.0*x^6.0-a*b/c/3.0*x^3.0-a*b/c*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a*b/c*0.011111111111111112*x^10.0+a*b/c*0.023809523809523808*x^7.0+a*b/c*0.03333333333333333*x^6.0-a*b/c/3.0*x^3.0-a*b/c*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a*b/c*56.0*x^6.0+a*b/c*20.0*x^3.0+a*b/c*12.0*x^2.0-a*b/c*0.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a*b/c*56.0*6.0*x^5.0+a*b/c*20.0*3.0*x^2.0+a*b/c*12.0*2.0*x^1.0-a*b/c*0.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a*b/c*336.0*x^5.0+a*b/c*60.0*x^2.0+a*b/c*24.0*x-a*b/c*0.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a*b/c*0.011111111111111112*x^10.0+a*b/c*0.023809523809523808*x^7.0+a*b/c*0.03333333333333333*x^6.0-a*b/c/3.0*x^3.0-a*b/c*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a*b/c*0.011111111111111112/11.0*x^11.0+a*b/c*0.023809523809523808/8.0*x^8.0+a*b/c*0.03333333333333333/7.0*x^7.0-a*b/c/3.0/4.0*x^4.0-a*b/c*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a*b/c*0.00101010101010101*x^11.0+a*b/c*0.002976190476190476*x^8.0+a*b/c*0.0047619047619047615*x^7.0-a*b/c*0.08333333333333333*x^4.0-a*b/c*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a*b/c*336.0*x^5.0+a*b/c*60.0*x^2.0+a*b/c*24.0*x-a*b/c*0.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a*b/c*336.0*5.0*x^4.0+a*b/c*60.0*2.0*x^1.0+a*b/c*24.0-a*b/c*0.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a*b/c*1680.0*x^4.0+a*b/c*120.0*x+a*b/c*24.0-a*b/c*0.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a*b/c*0.00101010101010101*x^11.0+a*b/c*0.002976190476190476*x^8.0+a*b/c*0.0047619047619047615*x^7.0-a*b/c*0.08333333333333333*x^4.0-a*b/c*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a*b/c*0.00101010101010101/12.0*x^12.0+a*b/c*0.002976190476190476/9.0*x^9.0+a*b/c*0.0047619047619047615/8.0*x^8.0-a*b/c*0.08333333333333333/5.0*x^5.0-a*b/c*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a*b/c*8.417508417508418E-5*x^12.0+a*b/c*3.3068783068783067E-4*x^9.0+a*b/c*5.952380952380952E-4*x^8.0-a*b/c*0.016666666666666666*x^5.0-a*b/c*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff50010() {
        //Test Case 50010
        UsageCalculus.TestCase = 50010;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All RED Including Values";        
        UsageCalculus.EqnUnderTest = "1.0*1.0*+p*xyc1^8 + 1.0*+p*xyc1^5 + 1.0*+p*xyc1^4 + 1.0*+p*xyc1 + 1.0*+p*25*1.0";
        UsageCalculus.TestCaseName = "Simple: Coefficients:+a";
        UsageCalculus.TestCaseMatrixID="Coefficients:+a:3 Letter with Numerics:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "p*xyc1^8.0+p*xyc1^5.0+p*xyc1^4.0+p*xyc1+p*25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "p*8.0*xyc1^7.0+p*5.0*xyc1^4.0+p*4.0*xyc1^3.0+p+p*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "p*8.0*xyc1^7.0+p*5.0*xyc1^4.0+p*4.0*xyc1^3.0+p+p*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="p*xyc1^8.0+p*xyc1^5.0+p*xyc1^4.0+p*xyc1+p*25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="p/9.0*xyc1^9.0+p/6.0*xyc1^6.0+p/5.0*xyc1^5.0+p/2.0*xyc1^2.0+p*25.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="p/9.0*xyc1^9.0+p/6.0*xyc1^6.0+p/5.0*xyc1^5.0+p/2.0*xyc1^2.0+p*25.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "p*8.0*xyc1^7.0+p*5.0*xyc1^4.0+p*4.0*xyc1^3.0+p+p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "p*8.0*7.0*xyc1^6.0+p*5.0*4.0*xyc1^3.0+p*4.0*3.0*xyc1^2.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "p*56.0*xyc1^6.0+p*20.0*xyc1^3.0+p*12.0*xyc1^2.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="p/9.0*xyc1^9.0+p/6.0*xyc1^6.0+p/5.0*xyc1^5.0+p/2.0*xyc1^2.0+p*25.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="p/9.0/10.0*xyc1^10.0+p/6.0/7.0*xyc1^7.0+p/5.0/6.0*xyc1^6.0+p/2.0/3.0*xyc1^3.0+p*25.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="p*0.011111111111111112*xyc1^10.0+p*0.023809523809523808*xyc1^7.0+p*0.03333333333333333*xyc1^6.0+p*0.16666666666666666*xyc1^3.0+p*12.5*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "p*56.0*xyc1^6.0+p*20.0*xyc1^3.0+p*12.0*xyc1^2.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "p*56.0*6.0*xyc1^5.0+p*20.0*3.0*xyc1^2.0+p*12.0*2.0*xyc1^1.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "p*336.0*xyc1^5.0+p*60.0*xyc1^2.0+p*24.0*xyc1+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="p*0.011111111111111112*xyc1^10.0+p*0.023809523809523808*xyc1^7.0+p*0.03333333333333333*xyc1^6.0+p*0.16666666666666666*xyc1^3.0+p*12.5*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="p*0.011111111111111112/11.0*xyc1^11.0+p*0.023809523809523808/8.0*xyc1^8.0+p*0.03333333333333333/7.0*xyc1^7.0+p*0.16666666666666666/4.0*xyc1^4.0+p*12.5/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="p*0.00101010101010101*xyc1^11.0+p*0.002976190476190476*xyc1^8.0+p*0.0047619047619047615*xyc1^7.0+p*0.041666666666666664*xyc1^4.0+p*4.166666666666667*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "p*336.0*xyc1^5.0+p*60.0*xyc1^2.0+p*24.0*xyc1+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "p*336.0*5.0*xyc1^4.0+p*60.0*2.0*xyc1^1.0+p*24.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "p*1680.0*xyc1^4.0+p*120.0*xyc1+p*24.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="p*0.00101010101010101*xyc1^11.0+p*0.002976190476190476*xyc1^8.0+p*0.0047619047619047615*xyc1^7.0+p*0.041666666666666664*xyc1^4.0+p*4.166666666666667*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="p/990.0/12.0*xyc1^12.0+p/336.0/9.0*xyc1^9.0+p/210.0/8.0*xyc1^8.0+p/24.0/5.0*xyc1^5.0+p*4.166666666666667/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="p*8.417508417508418E-5*xyc1^12.0+p*3.3068783068783067E-4*xyc1^9.0+p*5.952380952380952E-4*xyc1^8.0+p*0.008333333333333333*xyc1^5.0+p*1.0416666666666667*xyc1^4.0";
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
        public static void TestCaseDiff50011() {
        //Test Case 50011
        UsageCalculus.TestCase = 50011;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All RED Including Values";        
        UsageCalculus.EqnUnderTest = "1.0*1.0*1.0*+a*xyc1^8 + 1.0*+a*xyc1^5 + 1.0*+a*xyc1^4 + 1.0*+a*xyc1 + 1.0*+a*25*1.0*1.0";
        UsageCalculus.TestCaseName = "Simple: Coefficients:+a";
        UsageCalculus.TestCaseMatrixID="Coefficients:+a:3 Letter with Numerics:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a*xyc1^8.0+a*xyc1^5.0+a*xyc1^4.0+a*xyc1+a*25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a*8.0*xyc1^7.0+a*5.0*xyc1^4.0+a*4.0*xyc1^3.0+a+a*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a*8.0*xyc1^7.0+a*5.0*xyc1^4.0+a*4.0*xyc1^3.0+a+a*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="a*xyc1^8.0+a*xyc1^5.0+a*xyc1^4.0+a*xyc1+a*25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a/9.0*xyc1^9.0+a/6.0*xyc1^6.0+a/5.0*xyc1^5.0+a/2.0*xyc1^2.0+a*25.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="a/9.0*xyc1^9.0+a/6.0*xyc1^6.0+a/5.0*xyc1^5.0+a/2.0*xyc1^2.0+a*25.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a*8.0*xyc1^7.0+a*5.0*xyc1^4.0+a*4.0*xyc1^3.0+a+a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a*8.0*7.0*xyc1^6.0+a*5.0*4.0*xyc1^3.0+a*4.0*3.0*xyc1^2.0+a*0.0+a*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a*56.0*xyc1^6.0+a*20.0*xyc1^3.0+a*12.0*xyc1^2.0+a*0.0+a*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a/9.0*xyc1^9.0+a/6.0*xyc1^6.0+a/5.0*xyc1^5.0+a/2.0*xyc1^2.0+a*25.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a/9.0/10.0*xyc1^10.0+a/6.0/7.0*xyc1^7.0+a/5.0/6.0*xyc1^6.0+a/2.0/3.0*xyc1^3.0+a*25.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a*0.011111111111111112*xyc1^10.0+a*0.023809523809523808*xyc1^7.0+a*0.03333333333333333*xyc1^6.0+a*0.16666666666666666*xyc1^3.0+a*12.5*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a*56.0*xyc1^6.0+a*20.0*xyc1^3.0+a*12.0*xyc1^2.0+a*0.0+a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a*56.0*6.0*xyc1^5.0+a*20.0*3.0*xyc1^2.0+a*12.0*2.0*xyc1^1.0+a*0.0+a*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a*336.0*xyc1^5.0+a*60.0*xyc1^2.0+a*24.0*xyc1+a*0.0+a*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a*0.011111111111111112*xyc1^10.0+a*0.023809523809523808*xyc1^7.0+a*0.03333333333333333*xyc1^6.0+a*0.16666666666666666*xyc1^3.0+a*12.5*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a*0.011111111111111112/11.0*xyc1^11.0+a*0.023809523809523808/8.0*xyc1^8.0+a*0.03333333333333333/7.0*xyc1^7.0+a*0.16666666666666666/4.0*xyc1^4.0+a*12.5/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a*0.00101010101010101*xyc1^11.0+a*0.002976190476190476*xyc1^8.0+a*0.0047619047619047615*xyc1^7.0+a*0.041666666666666664*xyc1^4.0+a*4.166666666666667*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a*336.0*xyc1^5.0+a*60.0*xyc1^2.0+a*24.0*xyc1+a*0.0+a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a*336.0*5.0*xyc1^4.0+a*60.0*2.0*xyc1^1.0+a*24.0+a*0.0+a*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a*1680.0*xyc1^4.0+a*120.0*xyc1+a*24.0+a*0.0+a*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a*0.00101010101010101*xyc1^11.0+a*0.002976190476190476*xyc1^8.0+a*0.0047619047619047615*xyc1^7.0+a*0.041666666666666664*xyc1^4.0+a*4.166666666666667*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a*0.00101010101010101/12.0*xyc1^12.0+a*0.002976190476190476/9.0*xyc1^9.0+a*0.0047619047619047615/8.0*xyc1^8.0+a*0.041666666666666664/5.0*xyc1^5.0+a*4.166666666666667/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a*8.417508417508418E-5*xyc1^12.0+a*3.3068783068783067E-4*xyc1^9.0+a*5.952380952380952E-4*xyc1^8.0+a*0.008333333333333333*xyc1^5.0+a*1.0416666666666667*xyc1^4.0";
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
        public static void TestCaseDiff50012() {
        //Test Case 50012
        UsageCalculus.TestCase = 50012;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All RED Including Values";        
        UsageCalculus.EqnUnderTest = "1.0/+a*xyc1^8 + 1.0/+a*xyc1^5 + 1.0/+a*xyc1^4 + 1.0/+a*xyc1 + 1.0/+a*25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:+a";
        UsageCalculus.TestCaseMatrixID="Coefficients:+a:3 Letter with Numerics:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/a*xyc1^8.0+1.0/a*xyc1^5.0+1.0/a*xyc1^4.0+1.0/a*xyc1+1.0/a*25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/a*8.0*xyc1^7.0+1.0/a*5.0*xyc1^4.0+1.0/a*4.0*xyc1^3.0+1.0/a+1.0/a*25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0/a*8.0*xyc1^7.0+1.0/a*5.0*xyc1^4.0+1.0/a*4.0*xyc1^3.0+1.0/a+1.0/a*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/a*xyc1^8.0+1.0/a*xyc1^5.0+1.0/a*xyc1^4.0+1.0/a*xyc1+1.0/a*25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/a/9.0*xyc1^9.0+1.0/a/6.0*xyc1^6.0+1.0/a/5.0*xyc1^5.0+1.0/a/2.0*xyc1^2.0+1.0/a*25.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/a/9.0*xyc1^9.0+1.0/a/6.0*xyc1^6.0+1.0/a/5.0*xyc1^5.0+1.0/a/2.0*xyc1^2.0+1.0/a*25.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0/a*8.0*xyc1^7.0+1.0/a*5.0*xyc1^4.0+1.0/a*4.0*xyc1^3.0+1.0/a+1.0/a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "1.0/a*8.0*7.0*xyc1^6.0+1.0/a*5.0*4.0*xyc1^3.0+1.0/a*4.0*3.0*xyc1^2.0+1.0/a*0.0+1.0/a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "1.0/a*56.0*xyc1^6.0+1.0/a*20.0*xyc1^3.0+1.0/a*12.0*xyc1^2.0+1.0/a*0.0+1.0/a*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/a/9.0*xyc1^9.0+1.0/a/6.0*xyc1^6.0+1.0/a/5.0*xyc1^5.0+1.0/a/2.0*xyc1^2.0+1.0/a*25.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/a/9.0/10.0*xyc1^10.0+1.0/a/6.0/7.0*xyc1^7.0+1.0/a/5.0/6.0*xyc1^6.0+1.0/a/2.0/3.0*xyc1^3.0+1.0/a*25.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/a/90.0*xyc1^10.0+1.0/a/42.0*xyc1^7.0+1.0/a/30.0*xyc1^6.0+1.0/a/6.0*xyc1^3.0+1.0/a*12.5*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "1.0/a*56.0*xyc1^6.0+1.0/a*20.0*xyc1^3.0+1.0/a*12.0*xyc1^2.0+1.0/a*0.0+1.0/a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "1.0/a*56.0*6.0*xyc1^5.0+1.0/a*20.0*3.0*xyc1^2.0+1.0/a*12.0*2.0*xyc1^1.0+1.0/a*0.0*0.0+1.0/a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "1.0/a*336.0*xyc1^5.0+1.0/a*60.0*xyc1^2.0+1.0/a*24.0*xyc1+1.0/a*0.0+1.0/a*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/a/90.0*xyc1^10.0+1.0/a/42.0*xyc1^7.0+1.0/a/30.0*xyc1^6.0+1.0/a/6.0*xyc1^3.0+1.0/a*12.5*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/a/90.0/11.0*xyc1^11.0+1.0/a/42.0/8.0*xyc1^8.0+1.0/a/30.0/7.0*xyc1^7.0+1.0/a/6.0/4.0*xyc1^4.0+1.0/a*12.5/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/a/990.0*xyc1^11.0+1.0/a/336.0*xyc1^8.0+1.0/a/210.0*xyc1^7.0+1.0/a/24.0*xyc1^4.0+1.0/a*4.166666666666667*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "1.0/a*336.0*xyc1^5.0+1.0/a*60.0*xyc1^2.0+1.0/a*24.0*xyc1+1.0/a*0.0+1.0/a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "1.0/a*336.0*5.0*xyc1^4.0+1.0/a*60.0*2.0*xyc1^1.0+1.0/a*24.0+1.0/a*0.0*0.0+1.0/a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1.0/a*1680.0*xyc1^4.0+1.0/a*120.0*xyc1+1.0/a*24.0+1.0/a*0.0+1.0/a*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/a/990.0*xyc1^11.0+1.0/a/336.0*xyc1^8.0+1.0/a/210.0*xyc1^7.0+1.0/a/24.0*xyc1^4.0+1.0/a*4.166666666666667*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/a/990.0/12.0*xyc1^12.0+1.0/a/336.0/9.0*xyc1^9.0+1.0/a/210.0/8.0*xyc1^8.0+1.0/a/24.0/5.0*xyc1^5.0+1.0/a*4.166666666666667/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/a/11880.0*xyc1^12.0+1.0/a/3024.0*xyc1^9.0+1.0/a/1680.0*xyc1^8.0+1.0/a/120.0*xyc1^5.0+1.0/a*1.0416666666666667*xyc1^4.0";
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
        public static void TestCaseDiff50013() {
        //Test Case 50013
        UsageCalculus.TestCase = 50013;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All RED Including Values";        
        UsageCalculus.EqnUnderTest = "1.0/+b*a*xyc1^8 + 1.0/+b*a*xyc1^5 + 1.0/+b*a*xyc1^4 + 1.0/+b*a*xyc1 + 1.0/+b*a*25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:+b*a";
        UsageCalculus.TestCaseMatrixID="Coefficients:+b*a:3 Letter with Numerics:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 5;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/b*a*xyc1^8.0+1.0/b*a*xyc1^5.0+1.0/b*a*xyc1^4.0+1.0/b*a*xyc1+1.0/b*a*25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/b*a*8.0*xyc1^7.0+1.0/b*a*5.0*xyc1^4.0+1.0/b*a*4.0*xyc1^3.0+1.0/b*a+1.0/b*a*25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0/b*a*8.0*xyc1^7.0+1.0/b*a*5.0*xyc1^4.0+1.0/b*a*4.0*xyc1^3.0+1.0/b*a+1.0/b*a*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/b*a*xyc1^8.0+1.0/b*a*xyc1^5.0+1.0/b*a*xyc1^4.0+1.0/b*a*xyc1+1.0/b*a*25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/b*a/9.0*xyc1^9.0+1.0/b*a/6.0*xyc1^6.0+1.0/b*a/5.0*xyc1^5.0+1.0/b*a/2.0*xyc1^2.0+1.0/b*a*25.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/b*a/9.0*xyc1^9.0+1.0/b*a/6.0*xyc1^6.0+1.0/b*a/5.0*xyc1^5.0+1.0/b*a/2.0*xyc1^2.0+1.0/b*a*25.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0/b*a*8.0*xyc1^7.0+1.0/b*a*5.0*xyc1^4.0+1.0/b*a*4.0*xyc1^3.0+1.0/b*a+1.0/b*a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "1.0/b*a*8.0*7.0*xyc1^6.0+1.0/b*a*5.0*4.0*xyc1^3.0+1.0/b*a*4.0*3.0*xyc1^2.0+1.0/b*a*0.0+1.0/b*a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "1.0/b*a*56.0*xyc1^6.0+1.0/b*a*20.0*xyc1^3.0+1.0/b*a*12.0*xyc1^2.0+1.0/b*a*0.0+1.0/b*a*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/b*a/9.0*xyc1^9.0+1.0/b*a/6.0*xyc1^6.0+1.0/b*a/5.0*xyc1^5.0+1.0/b*a/2.0*xyc1^2.0+1.0/b*a*25.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/b*a/9.0/10.0*xyc1^10.0+1.0/b*a/6.0/7.0*xyc1^7.0+1.0/b*a/5.0/6.0*xyc1^6.0+1.0/b*a/2.0/3.0*xyc1^3.0+1.0/b*a*25.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/b*a/90.0*xyc1^10.0+1.0/b*a/42.0*xyc1^7.0+1.0/b*a/30.0*xyc1^6.0+1.0/b*a/6.0*xyc1^3.0+1.0/b*a*12.5*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "1.0/b*a*56.0*xyc1^6.0+1.0/b*a*20.0*xyc1^3.0+1.0/b*a*12.0*xyc1^2.0+1.0/b*a*0.0+1.0/b*a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "1.0/b*a*56.0*6.0*xyc1^5.0+1.0/b*a*20.0*3.0*xyc1^2.0+1.0/b*a*12.0*2.0*xyc1^1.0+1.0/b*a*0.0*0.0+1.0/b*a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "1.0/b*a*336.0*xyc1^5.0+1.0/b*a*60.0*xyc1^2.0+1.0/b*a*24.0*xyc1+1.0/b*a*0.0+1.0/b*a*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/b*a/90.0*xyc1^10.0+1.0/b*a/42.0*xyc1^7.0+1.0/b*a/30.0*xyc1^6.0+1.0/b*a/6.0*xyc1^3.0+1.0/b*a*12.5*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/b*a/90.0/11.0*xyc1^11.0+1.0/b*a/42.0/8.0*xyc1^8.0+1.0/b*a/30.0/7.0*xyc1^7.0+1.0/b*a/6.0/4.0*xyc1^4.0+1.0/b*a*12.5/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/b*a/990.0*xyc1^11.0+1.0/b*a/336.0*xyc1^8.0+1.0/b*a/210.0*xyc1^7.0+1.0/b*a/24.0*xyc1^4.0+1.0/b*a*4.166666666666667*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "1.0/b*a*336.0*xyc1^5.0+1.0/b*a*60.0*xyc1^2.0+1.0/b*a*24.0*xyc1+1.0/b*a*0.0+1.0/b*a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "1.0/b*a*336.0*5.0*xyc1^4.0+1.0/b*a*60.0*2.0*xyc1^1.0+1.0/b*a*24.0+1.0/b*a*0.0*0.0+1.0/b*a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1.0/b*a*1680.0*xyc1^4.0+1.0/b*a*120.0*xyc1+1.0/b*a*24.0+1.0/b*a*0.0+1.0/b*a*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/b*a/990.0*xyc1^11.0+1.0/b*a/336.0*xyc1^8.0+1.0/b*a/210.0*xyc1^7.0+1.0/b*a/24.0*xyc1^4.0+1.0/b*a*4.166666666666667*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/b*a/990.0/12.0*xyc1^12.0+1.0/b*a/336.0/9.0*xyc1^9.0+1.0/b*a/210.0/8.0*xyc1^8.0+1.0/b*a/24.0/5.0*xyc1^5.0+1.0/b*a*4.166666666666667/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/b*a/11880.0*xyc1^12.0+1.0/b*a/3024.0*xyc1^9.0+1.0/b*a/1680.0*xyc1^8.0+1.0/b*a/120.0*xyc1^5.0+1.0/b*a*1.0416666666666667*xyc1^4.0";
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
        public static void TestCaseDiff50014() {
        //Test Case 50014
        UsageCalculus.TestCase = 50014;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All RED Including Values";        
        UsageCalculus.EqnUnderTest = "1.0/+a*+a/+a/+5.0/+a/+a*xyc1^8 + 1.0/+a*+a/+a/+5.0/+a/+a*xyc1^5 + 1.0/+a*+a/+a*+5.0/+a/+a*xyc1^4 + 1.0/+a*b/c*xyc1 + 1.0/+a*+a/a*25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:+a,b,c";
        UsageCalculus.TestCaseMatrixID="Coefficients:+a:3 Letter with Numerics:Mixed(*,/) Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/a*a/a/a/a*5.0*xyc1^8.0+1.0/a*a/a/a/a*5.0*xyc1^5.0+1.0/a*a/a/a/a*5.0*xyc1^4.0+1.0/a*b/c*xyc1+1.0/a*a/a*25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/a*a/a/a/a*5.0*8.0*xyc1^7.0+1.0/a*a/a/a/a*5.0*5.0*xyc1^4.0+1.0/a*a/a/a/a*5.0*4.0*xyc1^3.0+1.0/a*b/c+1.0/a*a/a*25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0/a*a/a/a/a*40.0*xyc1^7.0+1.0/a*a/a/a/a*25.0*xyc1^4.0+1.0/a*a/a/a/a*20.0*xyc1^3.0+1.0/a*b/c+1.0/a*a/a*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/a*a/a/a/a*5.0*xyc1^8.0+1.0/a*a/a/a/a*5.0*xyc1^5.0+1.0/a*a/a/a/a*5.0*xyc1^4.0+1.0/a*b/c*xyc1+1.0/a*a/a*25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/a*a/a/a/a*5.0/9.0*xyc1^9.0+1.0/a*a/a/a/a*5.0/6.0*xyc1^6.0+1.0/a*a/a/a/a*5.0/5.0*xyc1^5.0+1.0/a*b/c/2.0*xyc1^2.0+1.0/a*a/a*25.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/a*a/a/a/a/1.8*xyc1^9.0+1.0/a*a/a/a/a/1.2*xyc1^6.0+1.0/a*a/a/a/a*xyc1^5.0+1.0/a*b/c/2.0*xyc1^2.0+1.0/a*a/a*25.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0/a*a/a/a/a*40.0*xyc1^7.0+1.0/a*a/a/a/a*25.0*xyc1^4.0+1.0/a*a/a/a/a*20.0*xyc1^3.0+1.0/a*b/c+1.0/a*a/a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "1.0/a*a/a/a/a*40.0*7.0*xyc1^6.0+1.0/a*a/a/a/a*25.0*4.0*xyc1^3.0+1.0/a*a/a/a/a*20.0*3.0*xyc1^2.0+1.0/a*b/c*0.0+1.0/a*a/a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "1.0/a*a/a/a/a*280.0*xyc1^6.0+1.0/a*a/a/a/a*100.0*xyc1^3.0+1.0/a*a/a/a/a*60.0*xyc1^2.0+1.0/a*b/c*0.0+1.0/a*a/a*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "1.0/a*a/a/a/a*280.0*xyc1^6.0+1.0/a*a/a/a/a*100.0*xyc1^3.0+1.0/a*a/a/a/a*60.0*xyc1^2.0+1.0/a*b/c*0.0+1.0/a*a/a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "1.0/a*a/a/a/a*280.0*6.0*xyc1^5.0+1.0/a*a/a/a/a*100.0*3.0*xyc1^2.0+1.0/a*a/a/a/a*60.0*2.0*xyc1^1.0+1.0/a*b/c*0.0*0.0+1.0/a*a/a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "1.0/a*a/a/a/a*1680.0*xyc1^5.0+1.0/a*a/a/a/a*300.0*xyc1^2.0+1.0/a*a/a/a/a*120.0*xyc1+1.0/a*b/c*0.0+1.0/a*a/a*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "1.0/a*a/a/a/a*1680.0*xyc1^5.0+1.0/a*a/a/a/a*300.0*xyc1^2.0+1.0/a*a/a/a/a*120.0*xyc1+1.0/a*b/c*0.0+1.0/a*a/a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "1.0/a*a/a/a/a*1680.0*5.0*xyc1^4.0+1.0/a*a/a/a/a*300.0*2.0*xyc1^1.0+1.0/a*a/a/a/a*120.0+1.0/a*b/c*0.0*0.0+1.0/a*a/a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1.0/a*a/a/a/a*8400.0*xyc1^4.0+1.0/a*a/a/a/a*600.0*xyc1+1.0/a*a/a/a/a*120.0+1.0/a*b/c*0.0+1.0/a*a/a*0.0";
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
        
        public static void TestCaseDiff50015() {
        //Test Case 50015
        UsageCalculus.TestCase = 50015;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "b/a*x^8 + b/a*x^5 + b/a*x^4 - 2*x*b/a- 25*2*b/a";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "b/a*x^8.0+b/a*x^5.0+b/a*x^4.0-b/a*2.0*x-b/a*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "b/a*8.0*x^7.0+b/a*5.0*x^4.0+b/a*4.0*x^3.0-b/a*2.0-b/a*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "b/a*8.0*x^7.0+b/a*5.0*x^4.0+b/a*4.0*x^3.0-b/a*2.0-b/a*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="b/a*x^8.0+b/a*x^5.0+b/a*x^4.0-b/a*2.0*x-b/a*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="b/a/9.0*x^9.0+b/a/6.0*x^6.0+b/a/5.0*x^5.0-b/a*x^2.0-b/a*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="b/a/9.0*x^9.0+b/a/6.0*x^6.0+b/a/5.0*x^5.0-b/a*x^2.0-b/a*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "b/a*8.0*x^7.0+b/a*5.0*x^4.0+b/a*4.0*x^3.0-b/a*2.0-b/a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "b/a*8.0*7.0*x^6.0+b/a*5.0*4.0*x^3.0+b/a*4.0*3.0*x^2.0-b/a*2.0*0.0-b/a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "b/a*56.0*x^6.0+b/a*20.0*x^3.0+b/a*12.0*x^2.0-b/a*0.0-b/a*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="b/a/9.0*x^9.0+b/a/6.0*x^6.0+b/a/5.0*x^5.0-b/a*x^2.0-b/a*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="b/a/9.0/10.0*x^10.0+b/a/6.0/7.0*x^7.0+b/a/5.0/6.0*x^6.0-b/a/3.0*x^3.0-b/a*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="b/a*0.011111111111111112*x^10.0+b/a*0.023809523809523808*x^7.0+b/a*0.03333333333333333*x^6.0-b/a/3.0*x^3.0-b/a*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "b/a*56.0*x^6.0+b/a*20.0*x^3.0+b/a*12.0*x^2.0-b/a*0.0-b/a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "b/a*56.0*6.0*x^5.0+b/a*20.0*3.0*x^2.0+b/a*12.0*2.0*x^1.0-b/a*0.0*0.0-b/a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "b/a*336.0*x^5.0+b/a*60.0*x^2.0+b/a*24.0*x-b/a*0.0-b/a*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="b/a*0.011111111111111112*x^10.0+b/a*0.023809523809523808*x^7.0+b/a*0.03333333333333333*x^6.0-b/a/3.0*x^3.0-b/a*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="b/a*0.011111111111111112/11.0*x^11.0+b/a*0.023809523809523808/8.0*x^8.0+b/a*0.03333333333333333/7.0*x^7.0-b/a/3.0/4.0*x^4.0-b/a*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="b/a*0.00101010101010101*x^11.0+b/a*0.002976190476190476*x^8.0+b/a*0.0047619047619047615*x^7.0-b/a*0.08333333333333333*x^4.0-b/a*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "b/a*336.0*x^5.0+b/a*60.0*x^2.0+b/a*24.0*x-b/a*0.0-b/a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "b/a*336.0*5.0*x^4.0+b/a*60.0*2.0*x^1.0+b/a*24.0-b/a*0.0*0.0-b/a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "b/a*1680.0*x^4.0+b/a*120.0*x+b/a*24.0-b/a*0.0-b/a*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="b/a*0.00101010101010101*x^11.0+b/a*0.002976190476190476*x^8.0+b/a*0.0047619047619047615*x^7.0-b/a*0.08333333333333333*x^4.0-b/a*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="b/a*0.00101010101010101/12.0*x^12.0+b/a*0.002976190476190476/9.0*x^9.0+b/a*0.0047619047619047615/8.0*x^8.0-b/a*0.08333333333333333/5.0*x^5.0-b/a*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="b/a*8.417508417508418E-5*x^12.0+b/a*3.3068783068783067E-4*x^9.0+b/a*5.952380952380952E-4*x^8.0-b/a*0.016666666666666666*x^5.0-b/a*2.0833333333333335*x^4.0";
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
    public static void TestCaseDiff50016() {
        //Test Case 50016
        UsageCalculus.TestCase = 50016;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "b/a*x^8 + b/a*x^5 + b/a*x^4 - 2*x*b/a- 25*(2)*b/a";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "b/a*x^8.0+b/a*x^5.0+b/a*x^4.0-b/a*2.0*x-b/a*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "b/a*8.0*x^7.0+b/a*5.0*x^4.0+b/a*4.0*x^3.0-b/a*2.0-b/a*50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "b/a*8.0*x^7.0+b/a*5.0*x^4.0+b/a*4.0*x^3.0-b/a*2.0-b/a*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="b/a*x^8.0+b/a*x^5.0+b/a*x^4.0-b/a*2.0*x-b/a*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="b/a/9.0*x^9.0+b/a/6.0*x^6.0+b/a/5.0*x^5.0-b/a*x^2.0-b/a*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="b/a/9.0*x^9.0+b/a/6.0*x^6.0+b/a/5.0*x^5.0-b/a*x^2.0-b/a*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "b/a*8.0*x^7.0+b/a*5.0*x^4.0+b/a*4.0*x^3.0-b/a*2.0-b/a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "b/a*8.0*7.0*x^6.0+b/a*5.0*4.0*x^3.0+b/a*4.0*3.0*x^2.0-b/a*2.0*0.0-b/a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "b/a*56.0*x^6.0+b/a*20.0*x^3.0+b/a*12.0*x^2.0-b/a*0.0-b/a*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="b/a/9.0*x^9.0+b/a/6.0*x^6.0+b/a/5.0*x^5.0-b/a*x^2.0-b/a*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="b/a/9.0/10.0*x^10.0+b/a/6.0/7.0*x^7.0+b/a/5.0/6.0*x^6.0-b/a/3.0*x^3.0-b/a*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="b/a*0.011111111111111112*x^10.0+b/a*0.023809523809523808*x^7.0+b/a*0.03333333333333333*x^6.0-b/a/3.0*x^3.0-b/a*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "b/a*56.0*x^6.0+b/a*20.0*x^3.0+b/a*12.0*x^2.0-b/a*0.0-b/a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "b/a*56.0*6.0*x^5.0+b/a*20.0*3.0*x^2.0+b/a*12.0*2.0*x^1.0-b/a*0.0*0.0-b/a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "b/a*336.0*x^5.0+b/a*60.0*x^2.0+b/a*24.0*x-b/a*0.0-b/a*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="b/a*0.011111111111111112*x^10.0+b/a*0.023809523809523808*x^7.0+b/a*0.03333333333333333*x^6.0-b/a/3.0*x^3.0-b/a*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="b/a*0.011111111111111112/11.0*x^11.0+b/a*0.023809523809523808/8.0*x^8.0+b/a*0.03333333333333333/7.0*x^7.0-b/a/3.0/4.0*x^4.0-b/a*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="b/a*0.00101010101010101*x^11.0+b/a*0.002976190476190476*x^8.0+b/a*0.0047619047619047615*x^7.0-b/a*0.08333333333333333*x^4.0-b/a*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "b/a*336.0*x^5.0+b/a*60.0*x^2.0+b/a*24.0*x-b/a*0.0-b/a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "b/a*336.0*5.0*x^4.0+b/a*60.0*2.0*x^1.0+b/a*24.0-b/a*0.0*0.0-b/a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "b/a*1680.0*x^4.0+b/a*120.0*x+b/a*24.0-b/a*0.0-b/a*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="b/a*0.00101010101010101*x^11.0+b/a*0.002976190476190476*x^8.0+b/a*0.0047619047619047615*x^7.0-b/a*0.08333333333333333*x^4.0-b/a*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="b/a*0.00101010101010101/12.0*x^12.0+b/a*0.002976190476190476/9.0*x^9.0+b/a*0.0047619047619047615/8.0*x^8.0-b/a*0.08333333333333333/5.0*x^5.0-b/a*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="b/a*8.417508417508418E-5*x^12.0+b/a*3.3068783068783067E-4*x^9.0+b/a*5.952380952380952E-4*x^8.0-b/a*0.016666666666666666*x^5.0-b/a*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff50017() {
        //Test Case 50017
        UsageCalculus.TestCase = 50017;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "a^2*x^8 + a^2*x^5 + a^2*x^4 - 2*x*a^2- 25*(2)*a^3";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a^2.0*x^8.0+a^2.0*x^5.0+a^2.0*x^4.0-a^2.0*2.0*x-a^3.0*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a^2.0*8.0*x^7.0+a^2.0*5.0*x^4.0+a^2.0*4.0*x^3.0-a^2.0*2.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a^2.0*8.0*x^7.0+a^2.0*5.0*x^4.0+a^2.0*4.0*x^3.0-a^2.0*2.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="a^2.0*x^8.0+a^2.0*x^5.0+a^2.0*x^4.0-a^2.0*2.0*x-a^3.0*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a^2.0/9.0*x^9.0+a^2.0/6.0*x^6.0+a^2.0/5.0*x^5.0-a^2.0*x^2.0-a^3.0*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a^2.0/9.0*x^9.0+a^2.0/6.0*x^6.0+a^2.0/5.0*x^5.0-a^2.0*x^2.0-a^3.0*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a^2.0*8.0*x^7.0+a^2.0*5.0*x^4.0+a^2.0*4.0*x^3.0-a^2.0*2.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a^2.0*8.0*7.0*x^6.0+a^2.0*5.0*4.0*x^3.0+a^2.0*4.0*3.0*x^2.0-a^2.0*2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a^2.0*56.0*x^6.0+a^2.0*20.0*x^3.0+a^2.0*12.0*x^2.0-a^2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a^2.0/9.0*x^9.0+a^2.0/6.0*x^6.0+a^2.0/5.0*x^5.0-a^2.0*x^2.0-a^3.0*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a^2.0/9.0/10.0*x^10.0+a^2.0/6.0/7.0*x^7.0+a^2.0/5.0/6.0*x^6.0-a^2.0/3.0*x^3.0-a^3.0*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a^2.0*0.011111111111111112*x^10.0+a^2.0*0.023809523809523808*x^7.0+a^2.0*0.03333333333333333*x^6.0-a^2.0/3.0*x^3.0-a^3.0*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a^2.0*56.0*x^6.0+a^2.0*20.0*x^3.0+a^2.0*12.0*x^2.0-a^2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a^2.0*56.0*6.0*x^5.0+a^2.0*20.0*3.0*x^2.0+a^2.0*12.0*2.0*x^1.0-a^2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a^2.0*336.0*x^5.0+a^2.0*60.0*x^2.0+a^2.0*24.0*x-a^2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a^2.0*0.011111111111111112*x^10.0+a^2.0*0.023809523809523808*x^7.0+a^2.0*0.03333333333333333*x^6.0-a^2.0/3.0*x^3.0-a^3.0*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a^2.0*0.011111111111111112/11.0*x^11.0+a^2.0*0.023809523809523808/8.0*x^8.0+a^2.0*0.03333333333333333/7.0*x^7.0-a^2.0/3.0/4.0*x^4.0-a^3.0*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a^2.0*0.00101010101010101*x^11.0+a^2.0*0.002976190476190476*x^8.0+a^2.0*0.0047619047619047615*x^7.0-a^2.0*0.08333333333333333*x^4.0-a^3.0*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a^2.0*336.0*x^5.0+a^2.0*60.0*x^2.0+a^2.0*24.0*x-a^2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a^2.0*336.0*5.0*x^4.0+a^2.0*60.0*2.0*x^1.0+a^2.0*24.0-a^2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a^2.0*1680.0*x^4.0+a^2.0*120.0*x+a^2.0*24.0-a^2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a^2.0*0.00101010101010101*x^11.0+a^2.0*0.002976190476190476*x^8.0+a^2.0*0.0047619047619047615*x^7.0-a^2.0*0.08333333333333333*x^4.0-a^3.0*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a^2.0*0.00101010101010101/12.0*x^12.0+a^2.0*0.002976190476190476/9.0*x^9.0+a^2.0*0.0047619047619047615/8.0*x^8.0-a^2.0*0.08333333333333333/5.0*x^5.0-a^3.0*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a^2.0*8.417508417508418E-5*x^12.0+a^2.0*3.3068783068783067E-4*x^9.0+a^2.0*5.952380952380952E-4*x^8.0-a^2.0*0.016666666666666666*x^5.0-a^3.0*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff50018() {
        //Test Case 50018
        UsageCalculus.TestCase = 50018;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "2^x*x^8 + 2^x*x^5 + 2^x*x^4 - 2*x*2^x- 25*(2)*3^x";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^8.0*2.0^x+x^5.0*2.0^x+x^4.0*2.0^x-2.0*x*2.0^x-50.0*3.0^x";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "2.0^x*8.0*x^7.0+ln(2.0)*2.0^x*x^8.0+2.0^x*5.0*x^4.0+ln(2.0)*2.0^x*x^5.0+2.0^x*4.0*x^3.0+ln(2.0)*2.0^x*x^4.0-2.0^x*2.0+ln(2.0)*2.0^x*2.0*x-50.0*ln(3.0)*3.0^x";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*x^7.0*2.0^x+ln(2.0)*2.0^x*x^8.0+5.0*x^4.0*2.0^x+ln(2.0)*2.0^x*x^5.0+4.0*x^3.0*2.0^x+ln(2.0)*2.0^x*x^4.0-2.0*2.0^x+ln(2.0)*2.0*2.0^x*x-50.0*ln(3.0)*3.0^x";
        UsageCalculus.EqnSolArrayMap3[1]="x^8.0*2.0^x+x^5.0*2.0^x+x^4.0*2.0^x-2.0*x*2.0^x-50.0*3.0^x";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="2.0^x*x^8.0-1.0/9.0*x^9.0*ln(2.0)+2.0^x*x^5.0-1.0/6.0*x^6.0*ln(2.0)+2.0^x*x^4.0-1.0/5.0*x^5.0*ln(2.0)-x^2.0*1.0-1.0/ln(50.0*3)*50.0*3^x";
        UsageCalculus.EqnSolArrayMap4[1]="";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*x^7.0*2.0^x+ln(2.0)*2.0^x*x^8.0+5.0*x^4.0*2.0^x+ln(2.0)*2.0^x*x^5.0+4.0*x^3.0*2.0^x+ln(2.0)*2.0^x*x^4.0-2.0*2.0^x+ln(2.0)*2.0*2.0^x*x-50.0*ln(3.0)*3.0^x";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "2.0^x*8.0*7.0*x^6.0+ln(2.0)*2.0^x*8.0*x^7.0+x^8.0*+8.0*x^7.0*+2.0^x*5.0*4.0*x^3.0+ln(2.0)*2.0^x*5.0*x^4.0+x^5.0*+5.0*x^4.0*+2.0^x*4.0*3.0*x^2.0+ln(2.0)*2.0^x*4.0*x^3.0+x^4.0*+4.0*x^3.0*-2.0*ln(2.0)*2.0^x+ln(2.0)*2.0*2.0^x-ln(3.0)*+ln(3.0)*3.0^x";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*x^6.0*2.0^x+ln(2.0)*8.0*2.0^x*x^7.0+160.0*x^18.0*2.0^x+ln(2.0)*5.0*2.0^x*x^4.0+60.0*x^11.0*2.0^x+ln(2.0)*4.0*2.0^x*x^3.0-8.0*x^7.0*ln(2.0)*2.0^x+ln(2.0)*2.0*2.0^x-ln(3.0)*3.0^x";
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
       
       public static void TestCaseDiff50019() {
        //Test Case 50019
        UsageCalculus.TestCase = 50019;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "a^b*x^8 + a^b*x^5 + a^b*x^4 - 2*x*a^b- 25*(2)*a^b";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a^b*x^8.0+a^b*x^5.0+a^b*x^4.0-a^b*2.0*x-a^b*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a^b*8.0*x^7.0+a^b*5.0*x^4.0+a^b*4.0*x^3.0-a^b*2.0-a^b*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a^b*8.0*x^7.0+a^b*5.0*x^4.0+a^b*4.0*x^3.0-a^b*2.0-a^b*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="a^b*x^8.0+a^b*x^5.0+a^b*x^4.0-a^b*2.0*x-a^b*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a^b/9.0*x^9.0+a^b/6.0*x^6.0+a^b/5.0*x^5.0-a^b*x^2.0-a^b*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a^b/9.0*x^9.0+a^b/6.0*x^6.0+a^b/5.0*x^5.0-a^b*x^2.0-a^b*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a^b*8.0*x^7.0+a^b*5.0*x^4.0+a^b*4.0*x^3.0-a^b*2.0-a^b*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a^b*8.0*7.0*x^6.0+a^b*5.0*4.0*x^3.0+a^b*4.0*3.0*x^2.0-a^b*2.0*0.0-a^b*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a^b*56.0*x^6.0+a^b*20.0*x^3.0+a^b*12.0*x^2.0-a^b*0.0-a^b*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a^b/9.0*x^9.0+a^b/6.0*x^6.0+a^b/5.0*x^5.0-a^b*x^2.0-a^b*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a^b/9.0/10.0*x^10.0+a^b/6.0/7.0*x^7.0+a^b/5.0/6.0*x^6.0-a^b/3.0*x^3.0-a^b*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a^b*0.011111111111111112*x^10.0+a^b*0.023809523809523808*x^7.0+a^b*0.03333333333333333*x^6.0-a^b/3.0*x^3.0-a^b*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a^b*56.0*x^6.0+a^b*20.0*x^3.0+a^b*12.0*x^2.0-a^b*0.0-a^b*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a^b*56.0*6.0*x^5.0+a^b*20.0*3.0*x^2.0+a^b*12.0*2.0*x^1.0-a^b*0.0*0.0-a^b*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a^b*336.0*x^5.0+a^b*60.0*x^2.0+a^b*24.0*x-a^b*0.0-a^b*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a^b*0.011111111111111112*x^10.0+a^b*0.023809523809523808*x^7.0+a^b*0.03333333333333333*x^6.0-a^b/3.0*x^3.0-a^b*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a^b*0.011111111111111112/11.0*x^11.0+a^b*0.023809523809523808/8.0*x^8.0+a^b*0.03333333333333333/7.0*x^7.0-a^b/3.0/4.0*x^4.0-a^b*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a^b*0.00101010101010101*x^11.0+a^b*0.002976190476190476*x^8.0+a^b*0.0047619047619047615*x^7.0-a^b*0.08333333333333333*x^4.0-a^b*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a^b*336.0*x^5.0+a^b*60.0*x^2.0+a^b*24.0*x-a^b*0.0-a^b*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a^b*336.0*5.0*x^4.0+a^b*60.0*2.0*x^1.0+a^b*24.0-a^b*0.0*0.0-a^b*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a^b*1680.0*x^4.0+a^b*120.0*x+a^b*24.0-a^b*0.0-a^b*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a^b*0.00101010101010101*x^11.0+a^b*0.002976190476190476*x^8.0+a^b*0.0047619047619047615*x^7.0-a^b*0.08333333333333333*x^4.0-a^b*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a^b*0.00101010101010101/12.0*x^12.0+a^b*0.002976190476190476/9.0*x^9.0+a^b*0.0047619047619047615/8.0*x^8.0-a^b*0.08333333333333333/5.0*x^5.0-a^b*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a^b*8.417508417508418E-5*x^12.0+a^b*3.3068783068783067E-4*x^9.0+a^b*5.952380952380952E-4*x^8.0-a^b*0.016666666666666666*x^5.0-a^b*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff50020() {
        //Test Case 50020
        UsageCalculus.TestCase = 50020;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "a*b*c*x^8 + a*b*c*x^5 + a*b*c*x^4 - 2*x*a*b*c- 25*(2)*a*b*c";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a*b*c*x^8.0+a*b*c*x^5.0+a*b*c*x^4.0-a*b*c*2.0*x-a*b*c*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a*b*c*8.0*x^7.0+a*b*c*5.0*x^4.0+a*b*c*4.0*x^3.0-a*b*c*2.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a*b*c*8.0*x^7.0+a*b*c*5.0*x^4.0+a*b*c*4.0*x^3.0-a*b*c*2.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="a*b*c*x^8.0+a*b*c*x^5.0+a*b*c*x^4.0-a*b*c*2.0*x-a*b*c*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a*b*c/9.0*x^9.0+a*b*c/6.0*x^6.0+a*b*c/5.0*x^5.0-a*b*c*x^2.0-a*b*c*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a*b*c/9.0*x^9.0+a*b*c/6.0*x^6.0+a*b*c/5.0*x^5.0-a*b*c*x^2.0-a*b*c*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a*b*c*8.0*x^7.0+a*b*c*5.0*x^4.0+a*b*c*4.0*x^3.0-a*b*c*2.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a*b*c*8.0*7.0*x^6.0+a*b*c*5.0*4.0*x^3.0+a*b*c*4.0*3.0*x^2.0-a*b*c*2.0*0.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a*b*c*56.0*x^6.0+a*b*c*20.0*x^3.0+a*b*c*12.0*x^2.0-a*b*c*0.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a*b*c/9.0*x^9.0+a*b*c/6.0*x^6.0+a*b*c/5.0*x^5.0-a*b*c*x^2.0-a*b*c*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a*b*c/9.0/10.0*x^10.0+a*b*c/6.0/7.0*x^7.0+a*b*c/5.0/6.0*x^6.0-a*b*c/3.0*x^3.0-a*b*c*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a*b*c*0.011111111111111112*x^10.0+a*b*c*0.023809523809523808*x^7.0+a*b*c*0.03333333333333333*x^6.0-a*b*c/3.0*x^3.0-a*b*c*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a*b*c*56.0*x^6.0+a*b*c*20.0*x^3.0+a*b*c*12.0*x^2.0-a*b*c*0.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a*b*c*56.0*6.0*x^5.0+a*b*c*20.0*3.0*x^2.0+a*b*c*12.0*2.0*x^1.0-a*b*c*0.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a*b*c*336.0*x^5.0+a*b*c*60.0*x^2.0+a*b*c*24.0*x-a*b*c*0.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a*b*c*0.011111111111111112*x^10.0+a*b*c*0.023809523809523808*x^7.0+a*b*c*0.03333333333333333*x^6.0-a*b*c/3.0*x^3.0-a*b*c*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a*b*c*0.011111111111111112/11.0*x^11.0+a*b*c*0.023809523809523808/8.0*x^8.0+a*b*c*0.03333333333333333/7.0*x^7.0-a*b*c/3.0/4.0*x^4.0-a*b*c*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a*b*c*0.00101010101010101*x^11.0+a*b*c*0.002976190476190476*x^8.0+a*b*c*0.0047619047619047615*x^7.0-a*b*c*0.08333333333333333*x^4.0-a*b*c*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a*b*c*336.0*x^5.0+a*b*c*60.0*x^2.0+a*b*c*24.0*x-a*b*c*0.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a*b*c*336.0*5.0*x^4.0+a*b*c*60.0*2.0*x^1.0+a*b*c*24.0-a*b*c*0.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a*b*c*1680.0*x^4.0+a*b*c*120.0*x+a*b*c*24.0-a*b*c*0.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a*b*c*0.00101010101010101*x^11.0+a*b*c*0.002976190476190476*x^8.0+a*b*c*0.0047619047619047615*x^7.0-a*b*c*0.08333333333333333*x^4.0-a*b*c*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a*b*c*0.00101010101010101/12.0*x^12.0+a*b*c*0.002976190476190476/9.0*x^9.0+a*b*c*0.0047619047619047615/8.0*x^8.0-a*b*c*0.08333333333333333/5.0*x^5.0-a*b*c*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a*b*c*8.417508417508418E-5*x^12.0+a*b*c*3.3068783068783067E-4*x^9.0+a*b*c*5.952380952380952E-4*x^8.0-a*b*c*0.016666666666666666*x^5.0-a*b*c*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff50021() {
        //Test Case 50021
        UsageCalculus.TestCase = 50021;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "a/b/c*x^8 + a/b/c*x^5 + a/b/c*x^4 - 2*x*a/b/c- 25*(2)*a/b/c";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a/b/c*x^8.0+a/b/c*x^5.0+a/b/c*x^4.0-a/b/c*2.0*x-a/b/c*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a/b/c*8.0*x^7.0+a/b/c*5.0*x^4.0+a/b/c*4.0*x^3.0-a/b/c*2.0-a/b/c*50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a/b/c*8.0*x^7.0+a/b/c*5.0*x^4.0+a/b/c*4.0*x^3.0-a/b/c*2.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="a/b/c*x^8.0+a/b/c*x^5.0+a/b/c*x^4.0-a/b/c*2.0*x-a/b/c*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a/b/c/9.0*x^9.0+a/b/c/6.0*x^6.0+a/b/c/5.0*x^5.0-a/b/c*x^2.0-a/b/c*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a/b/c/9.0*x^9.0+a/b/c/6.0*x^6.0+a/b/c/5.0*x^5.0-a/b/c*x^2.0-a/b/c*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a/b/c*8.0*x^7.0+a/b/c*5.0*x^4.0+a/b/c*4.0*x^3.0-a/b/c*2.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a/b/c*8.0*7.0*x^6.0+a/b/c*5.0*4.0*x^3.0+a/b/c*4.0*3.0*x^2.0-a/b/c*2.0*0.0-a/b/c*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a/b/c*56.0*x^6.0+a/b/c*20.0*x^3.0+a/b/c*12.0*x^2.0-a/b/c*0.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a/b/c/9.0*x^9.0+a/b/c/6.0*x^6.0+a/b/c/5.0*x^5.0-a/b/c*x^2.0-a/b/c*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a/b/c/9.0/10.0*x^10.0+a/b/c/6.0/7.0*x^7.0+a/b/c/5.0/6.0*x^6.0-a/b/c/3.0*x^3.0-a/b/c*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a/b/c*0.011111111111111112*x^10.0+a/b/c*0.023809523809523808*x^7.0+a/b/c*0.03333333333333333*x^6.0-a/b/c/3.0*x^3.0-a/b/c*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a/b/c*56.0*x^6.0+a/b/c*20.0*x^3.0+a/b/c*12.0*x^2.0-a/b/c*0.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a/b/c*56.0*6.0*x^5.0+a/b/c*20.0*3.0*x^2.0+a/b/c*12.0*2.0*x^1.0-a/b/c*0.0*0.0-a/b/c*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a/b/c*336.0*x^5.0+a/b/c*60.0*x^2.0+a/b/c*24.0*x-a/b/c*0.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a/b/c*0.011111111111111112*x^10.0+a/b/c*0.023809523809523808*x^7.0+a/b/c*0.03333333333333333*x^6.0-a/b/c/3.0*x^3.0-a/b/c*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a/b/c*0.011111111111111112/11.0*x^11.0+a/b/c*0.023809523809523808/8.0*x^8.0+a/b/c*0.03333333333333333/7.0*x^7.0-a/b/c/3.0/4.0*x^4.0-a/b/c*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a/b/c*0.00101010101010101*x^11.0+a/b/c*0.002976190476190476*x^8.0+a/b/c*0.0047619047619047615*x^7.0-a/b/c*0.08333333333333333*x^4.0-a/b/c*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a/b/c*336.0*x^5.0+a/b/c*60.0*x^2.0+a/b/c*24.0*x-a/b/c*0.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a/b/c*336.0*5.0*x^4.0+a/b/c*60.0*2.0*x^1.0+a/b/c*24.0-a/b/c*0.0*0.0-a/b/c*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a/b/c*1680.0*x^4.0+a/b/c*120.0*x+a/b/c*24.0-a/b/c*0.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a/b/c*0.00101010101010101*x^11.0+a/b/c*0.002976190476190476*x^8.0+a/b/c*0.0047619047619047615*x^7.0-a/b/c*0.08333333333333333*x^4.0-a/b/c*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a/b/c*0.00101010101010101/12.0*x^12.0+a/b/c*0.002976190476190476/9.0*x^9.0+a/b/c*0.0047619047619047615/8.0*x^8.0-a/b/c*0.08333333333333333/5.0*x^5.0-a/b/c*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a/b/c*8.417508417508418E-5*x^12.0+a/b/c*3.3068783068783067E-4*x^9.0+a/b/c*5.952380952380952E-4*x^8.0-a/b/c*0.016666666666666666*x^5.0-a/b/c*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff50022() {
        //Test Case 50022
        UsageCalculus.TestCase = 50022;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "a*b/c*x^8 + a*b/c*x^5 + a*b/c*x^4 - 2*x*a*b/c- 25*(2)*a*b/c";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a*b/c*x^8.0+a*b/c*x^5.0+a*b/c*x^4.0-a*b/c*2.0*x-a*b/c*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a*b/c*8.0*x^7.0+a*b/c*5.0*x^4.0+a*b/c*4.0*x^3.0-a*b/c*2.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a*b/c*8.0*x^7.0+a*b/c*5.0*x^4.0+a*b/c*4.0*x^3.0-a*b/c*2.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="a*b/c*x^8.0+a*b/c*x^5.0+a*b/c*x^4.0-a*b/c*2.0*x-a*b/c*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a*b/c/9.0*x^9.0+a*b/c/6.0*x^6.0+a*b/c/5.0*x^5.0-a*b/c*x^2.0-a*b/c*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a*b/c/9.0*x^9.0+a*b/c/6.0*x^6.0+a*b/c/5.0*x^5.0-a*b/c*x^2.0-a*b/c*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a*b/c*8.0*x^7.0+a*b/c*5.0*x^4.0+a*b/c*4.0*x^3.0-a*b/c*2.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a*b/c*8.0*7.0*x^6.0+a*b/c*5.0*4.0*x^3.0+a*b/c*4.0*3.0*x^2.0-a*b/c*2.0*0.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a*b/c*56.0*x^6.0+a*b/c*20.0*x^3.0+a*b/c*12.0*x^2.0-a*b/c*0.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a*b/c/9.0*x^9.0+a*b/c/6.0*x^6.0+a*b/c/5.0*x^5.0-a*b/c*x^2.0-a*b/c*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a*b/c/9.0/10.0*x^10.0+a*b/c/6.0/7.0*x^7.0+a*b/c/5.0/6.0*x^6.0-a*b/c/3.0*x^3.0-a*b/c*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a*b/c*0.011111111111111112*x^10.0+a*b/c*0.023809523809523808*x^7.0+a*b/c*0.03333333333333333*x^6.0-a*b/c/3.0*x^3.0-a*b/c*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a*b/c*56.0*x^6.0+a*b/c*20.0*x^3.0+a*b/c*12.0*x^2.0-a*b/c*0.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a*b/c*56.0*6.0*x^5.0+a*b/c*20.0*3.0*x^2.0+a*b/c*12.0*2.0*x^1.0-a*b/c*0.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a*b/c*336.0*x^5.0+a*b/c*60.0*x^2.0+a*b/c*24.0*x-a*b/c*0.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a*b/c*0.011111111111111112*x^10.0+a*b/c*0.023809523809523808*x^7.0+a*b/c*0.03333333333333333*x^6.0-a*b/c/3.0*x^3.0-a*b/c*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a*b/c*0.011111111111111112/11.0*x^11.0+a*b/c*0.023809523809523808/8.0*x^8.0+a*b/c*0.03333333333333333/7.0*x^7.0-a*b/c/3.0/4.0*x^4.0-a*b/c*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a*b/c*0.00101010101010101*x^11.0+a*b/c*0.002976190476190476*x^8.0+a*b/c*0.0047619047619047615*x^7.0-a*b/c*0.08333333333333333*x^4.0-a*b/c*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a*b/c*336.0*x^5.0+a*b/c*60.0*x^2.0+a*b/c*24.0*x-a*b/c*0.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a*b/c*336.0*5.0*x^4.0+a*b/c*60.0*2.0*x^1.0+a*b/c*24.0-a*b/c*0.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a*b/c*1680.0*x^4.0+a*b/c*120.0*x+a*b/c*24.0-a*b/c*0.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a*b/c*0.00101010101010101*x^11.0+a*b/c*0.002976190476190476*x^8.0+a*b/c*0.0047619047619047615*x^7.0-a*b/c*0.08333333333333333*x^4.0-a*b/c*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a*b/c*0.00101010101010101/12.0*x^12.0+a*b/c*0.002976190476190476/9.0*x^9.0+a*b/c*0.0047619047619047615/8.0*x^8.0-a*b/c*0.08333333333333333/5.0*x^5.0-a*b/c*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a*b/c*8.417508417508418E-5*x^12.0+a*b/c*3.3068783068783067E-4*x^9.0+a*b/c*5.952380952380952E-4*x^8.0-a*b/c*0.016666666666666666*x^5.0-a*b/c*2.0833333333333335*x^4.0";
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
              public static void TestCaseDiff50023() {
        //Test Case 50023
        UsageCalculus.TestCase = 50023;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0/a*x^8 + 1.0/a*x^5 + 1.0/a*x^4 - 2*x/a- 25*2/a";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/a*x^8.0+1.0/a*x^5.0+1.0/a*x^4.0-1.0/a*2.0*x-1.0/a*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/a*8.0*x^7.0+1.0/a*5.0*x^4.0+1.0/a*4.0*x^3.0-1.0/a*2.0-1.0/a*50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0/a*8.0*x^7.0+1.0/a*5.0*x^4.0+1.0/a*4.0*x^3.0-1.0/a*2.0-1.0/a*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/a*x^8.0+1.0/a*x^5.0+1.0/a*x^4.0-1.0/a*2.0*x-1.0/a*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/a/9.0*x^9.0+1.0/a/6.0*x^6.0+1.0/a/5.0*x^5.0-1.0/a*2.0/2.0*x^2.0-1.0/a*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/a/9.0*x^9.0+1.0/a/6.0*x^6.0+1.0/a/5.0*x^5.0-1.0/a*x^2.0-1.0/a*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0/a*8.0*x^7.0+1.0/a*5.0*x^4.0+1.0/a*4.0*x^3.0-1.0/a*2.0-1.0/a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "1.0/a*8.0*7.0*x^6.0+1.0/a*5.0*4.0*x^3.0+1.0/a*4.0*3.0*x^2.0-1.0/a*2.0*0.0-1.0/a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "1.0/a*56.0*x^6.0+1.0/a*20.0*x^3.0+1.0/a*12.0*x^2.0-1.0/a*0.0-1.0/a*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/a/9.0*x^9.0+1.0/a/6.0*x^6.0+1.0/a/5.0*x^5.0-1.0/a*x^2.0-1.0/a*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/a/9.0/10.0*x^10.0+1.0/a/6.0/7.0*x^7.0+1.0/a/5.0/6.0*x^6.0-1.0/a/3.0*x^3.0-1.0/a*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/a/90.0*x^10.0+1.0/a/42.0*x^7.0+1.0/a/30.0*x^6.0-1.0/a/3.0*x^3.0-1.0/a*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "1.0/a*56.0*x^6.0+1.0/a*20.0*x^3.0+1.0/a*12.0*x^2.0-1.0/a*0.0-1.0/a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "1.0/a*56.0*6.0*x^5.0+1.0/a*20.0*3.0*x^2.0+1.0/a*12.0*2.0*x^1.0-1.0/a*0.0*0.0-1.0/a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "1.0/a*336.0*x^5.0+1.0/a*60.0*x^2.0+1.0/a*24.0*x-1.0/a*0.0-1.0/a*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/a/90.0*x^10.0+1.0/a/42.0*x^7.0+1.0/a/30.0*x^6.0-1.0/a/3.0*x^3.0-1.0/a*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/a/90.0/11.0*x^11.0+1.0/a/42.0/8.0*x^8.0+1.0/a/30.0/7.0*x^7.0-1.0/a/3.0/4.0*x^4.0-1.0/a*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/a/990.0*x^11.0+1.0/a/336.0*x^8.0+1.0/a/210.0*x^7.0-1.0/a/12.0*x^4.0-1.0/a*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "1.0/a*336.0*x^5.0+1.0/a*60.0*x^2.0+1.0/a*24.0*x-1.0/a*0.0-1.0/a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "1.0/a*336.0*5.0*x^4.0+1.0/a*60.0*2.0*x^1.0+1.0/a*24.0-1.0/a*0.0*0.0-1.0/a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1.0/a*1680.0*x^4.0+1.0/a*120.0*x+1.0/a*24.0-1.0/a*0.0-1.0/a*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/a/990.0*x^11.0+1.0/a/336.0*x^8.0+1.0/a/210.0*x^7.0-1.0/a/12.0*x^4.0-1.0/a*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/a/990.0/12.0*x^12.0+1.0/a/336.0/9.0*x^9.0+1.0/a/210.0/8.0*x^8.0-1.0/a/12.0/5.0*x^5.0-1.0/a*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/a/11880.0*x^12.0+1.0/a/3024.0*x^9.0+1.0/a/1680.0*x^8.0-1.0/a/60.0*x^5.0-1.0/a*2.0833333333333335*x^4.0";
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
        public static void TestCaseDiff50024() {
        //Test Case 50024
        UsageCalculus.TestCase = 50024;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "a*b*c*d*x^8 + a*b*c*d*x^5 + a*b*c*d*x^4 - 2*x*a*b*c*d- 25*2*a*b*c*d";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a*b*c*d*x^8.0+a*b*c*d*x^5.0+a*b*c*d*x^4.0-a*b*c*d*2.0*x-a*b*c*d*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a*b*c*d*8.0*x^7.0+a*b*c*d*5.0*x^4.0+a*b*c*d*4.0*x^3.0-a*b*c*d*2.0-a*b*c*d*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a*b*c*d*8.0*x^7.0+a*b*c*d*5.0*x^4.0+a*b*c*d*4.0*x^3.0-a*b*c*d*2.0-a*b*c*d*0.0";
        UsageCalculus.EqnSolArrayMap3[1] = "a*b*c*d*x^8.0+a*b*c*d*x^5.0+a*b*c*d*x^4.0-a*b*c*d*2.0*x-a*b*c*d*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a*b*c*d/9.0*x^9.0+a*b*c*d/6.0*x^6.0+a*b*c*d/5.0*x^5.0-a*b*c*d*x^2.0-a*b*c*d*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a*b*c*d/9.0*x^9.0+a*b*c*d/6.0*x^6.0+a*b*c*d/5.0*x^5.0-a*b*c*d*x^2.0-a*b*c*d*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a*b*c*d*8.0*x^7.0+a*b*c*d*5.0*x^4.0+a*b*c*d*4.0*x^3.0-a*b*c*d*2.0-a*b*c*d*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a*b*c*d*8.0*7.0*x^6.0+a*b*c*d*5.0*4.0*x^3.0+a*b*c*d*4.0*3.0*x^2.0-a*b*c*d*2.0*0.0-a*b*c*d*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a*b*c*d*56.0*x^6.0+a*b*c*d*20.0*x^3.0+a*b*c*d*12.0*x^2.0-a*b*c*d*0.0-a*b*c*d*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a*b*c*d/9.0*x^9.0+a*b*c*d/6.0*x^6.0+a*b*c*d/5.0*x^5.0-a*b*c*d*x^2.0-a*b*c*d*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a*b*c*d/9.0/10.0*x^10.0+a*b*c*d/6.0/7.0*x^7.0+a*b*c*d/5.0/6.0*x^6.0-a*b*c*d/3.0*x^3.0-a*b*c*d*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a*b*c*d*0.011111111111111112*x^10.0+a*b*c*d*0.023809523809523808*x^7.0+a*b*c*d*0.03333333333333333*x^6.0-a*b*c*d/3.0*x^3.0-a*b*c*d*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a*b*c*d*56.0*x^6.0+a*b*c*d*20.0*x^3.0+a*b*c*d*12.0*x^2.0-a*b*c*d*0.0-a*b*c*d*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a*b*c*d*56.0*6.0*x^5.0+a*b*c*d*20.0*3.0*x^2.0+a*b*c*d*12.0*2.0*x^1.0-a*b*c*d*0.0-a*b*c*d*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a*b*c*d*336.0*x^5.0+a*b*c*d*60.0*x^2.0+a*b*c*d*24.0*x-a*b*c*d*0.0-a*b*c*d*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a*b*c*d*0.011111111111111112*x^10.0+a*b*c*d*0.023809523809523808*x^7.0+a*b*c*d*0.03333333333333333*x^6.0-a*b*c*d/3.0*x^3.0-a*b*c*d*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a*b*c*d*0.011111111111111112/11.0*x^11.0+a*b*c*d*0.023809523809523808/8.0*x^8.0+a*b*c*d*0.03333333333333333/7.0*x^7.0-a*b*c*d/3.0/4.0*x^4.0-a*b*c*d*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a*b*c*d*0.00101010101010101*x^11.0+a*b*c*d*0.002976190476190476*x^8.0+a*b*c*d*0.0047619047619047615*x^7.0-a*b*c*d*0.08333333333333333*x^4.0-a*b*c*d*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a*b*c*d*336.0*x^5.0+a*b*c*d*60.0*x^2.0+a*b*c*d*24.0*x-a*b*c*d*0.0-a*b*c*d*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a*b*c*d*336.0*5.0*x^4.0+a*b*c*d*60.0*2.0*x^1.0+a*b*c*d*24.0-a*b*c*d*0.0-a*b*c*d*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a*b*c*d*1680.0*x^4.0+a*b*c*d*120.0*x+a*b*c*d*24.0-a*b*c*d*0.0-a*b*c*d*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a*b*c*d*0.00101010101010101*x^11.0+a*b*c*d*0.002976190476190476*x^8.0+a*b*c*d*0.0047619047619047615*x^7.0-a*b*c*d*0.08333333333333333*x^4.0-a*b*c*d*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a*b*c*d*0.00101010101010101/12.0*x^12.0+a*b*c*d*0.002976190476190476/9.0*x^9.0+a*b*c*d*0.0047619047619047615/8.0*x^8.0-a*b*c*d*0.08333333333333333/5.0*x^5.0-a*b*c*d*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a*b*c*d*8.417508417508418E-5*x^12.0+a*b*c*d*3.3068783068783067E-4*x^9.0+a*b*c*d*5.952380952380952E-4*x^8.0-a*b*c*d*0.016666666666666666*x^5.0-a*b*c*d*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff50025() {
        //Test Case 50025
        UsageCalculus.TestCase = 50025;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "a/b/c/d*x^8 + a/b/c/d*x^5 + a/b/c/d*x^4 - 2*x*a/b/c/d- 25*2*a/b/c/d";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a/b/c/d*x^8.0+a/b/c/d*x^5.0+a/b/c/d*x^4.0-a/b/c/d*2.0*x-a/b/c/d*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a/b/c/d*8.0*x^7.0+a/b/c/d*5.0*x^4.0+a/b/c/d*4.0*x^3.0-a/b/c/d*2.0-a/b/c/d*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a/b/c/d*8.0*x^7.0+a/b/c/d*5.0*x^4.0+a/b/c/d*4.0*x^3.0-a/b/c/d*2.0-a/b/c/d*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="a/b/c/d*x^8.0+a/b/c/d*x^5.0+a/b/c/d*x^4.0-a/b/c/d*2.0*x-a/b/c/d*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a/b/c/d/9.0*x^9.0+a/b/c/d/6.0*x^6.0+a/b/c/d/5.0*x^5.0-a/b/c/d*x^2.0-a/b/c/d*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a/b/c/d/9.0*x^9.0+a/b/c/d/6.0*x^6.0+a/b/c/d/5.0*x^5.0-a/b/c/d*x^2.0-a/b/c/d*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a/b/c/d*8.0*x^7.0+a/b/c/d*5.0*x^4.0+a/b/c/d*4.0*x^3.0-a/b/c/d*2.0-a/b/c/d*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a/b/c/d*8.0*7.0*x^6.0+a/b/c/d*5.0*4.0*x^3.0+a/b/c/d*4.0*3.0*x^2.0-a/b/c/d*2.0*0.0-a/b/c/d*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a/b/c/d*56.0*x^6.0+a/b/c/d*20.0*x^3.0+a/b/c/d*12.0*x^2.0-a/b/c/d*0.0-a/b/c/d*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a/b/c/d/9.0*x^9.0+a/b/c/d/6.0*x^6.0+a/b/c/d/5.0*x^5.0-a/b/c/d*x^2.0-a/b/c/d*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a/b/c/d/9.0/10.0*x^10.0+a/b/c/d/6.0/7.0*x^7.0+a/b/c/d/5.0/6.0*x^6.0-a/b/c/d/3.0*x^3.0-a/b/c/d*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a/b/c/d*0.011111111111111112*x^10.0+a/b/c/d*0.023809523809523808*x^7.0+a/b/c/d*0.03333333333333333*x^6.0-a/b/c/d/3.0*x^3.0-a/b/c/d*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a/b/c/d*56.0*x^6.0+a/b/c/d*20.0*x^3.0+a/b/c/d*12.0*x^2.0-a/b/c/d*0.0-a/b/c/d*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a/b/c/d*56.0*6.0*x^5.0+a/b/c/d*20.0*3.0*x^2.0+a/b/c/d*12.0*2.0*x^1.0-a/b/c/d*0.0-a/b/c/d*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a/b/c/d*336.0*x^5.0+a/b/c/d*60.0*x^2.0+a/b/c/d*24.0*x-a/b/c/d*0.0-a/b/c/d*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a/b/c/d*0.011111111111111112*x^10.0+a/b/c/d*0.023809523809523808*x^7.0+a/b/c/d*0.03333333333333333*x^6.0-a/b/c/d/3.0*x^3.0-a/b/c/d*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a/b/c/d*0.011111111111111112/11.0*x^11.0+a/b/c/d*0.023809523809523808/8.0*x^8.0+a/b/c/d*0.03333333333333333/7.0*x^7.0-a/b/c/d/3.0/4.0*x^4.0-a/b/c/d*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a/b/c/d*0.00101010101010101*x^11.0+a/b/c/d*0.002976190476190476*x^8.0+a/b/c/d*0.0047619047619047615*x^7.0-a/b/c/d*0.08333333333333333*x^4.0-a/b/c/d*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a/b/c/d*336.0*x^5.0+a/b/c/d*60.0*x^2.0+a/b/c/d*24.0*x-a/b/c/d*0.0-a/b/c/d*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a/b/c/d*336.0*5.0*x^4.0+a/b/c/d*60.0*2.0*x^1.0+a/b/c/d*24.0-a/b/c/d*0.0-a/b/c/d*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a/b/c/d*1680.0*x^4.0+a/b/c/d*120.0*x+a/b/c/d*24.0-a/b/c/d*0.0-a/b/c/d*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a/b/c/d*0.00101010101010101*x^11.0+a/b/c/d*0.002976190476190476*x^8.0+a/b/c/d*0.0047619047619047615*x^7.0-a/b/c/d*0.08333333333333333*x^4.0-a/b/c/d*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a/b/c/d*0.00101010101010101/12.0*x^12.0+a/b/c/d*0.002976190476190476/9.0*x^9.0+a/b/c/d*0.0047619047619047615/8.0*x^8.0-a/b/c/d*0.08333333333333333/5.0*x^5.0-a/b/c/d*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a/b/c/d*8.417508417508418E-5*x^12.0+a/b/c/d*3.3068783068783067E-4*x^9.0+a/b/c/d*5.952380952380952E-4*x^8.0-a/b/c/d*0.016666666666666666*x^5.0-a/b/c/d*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff50026() {
        //Test Case 50026
        UsageCalculus.TestCase = 50026;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "a*b/c*d*x^8 + a*b/c*d*x^5 + a*b/c*d*x^4 - 2*x*a*b/c*d- 25*2*a*b/c*d";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a*b/c*d*x^8.0+a*b/c*d*x^5.0+a*b/c*d*x^4.0-a*b/c*d*2.0*x-a*b/c*d*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a*b/c*d*8.0*x^7.0+a*b/c*d*5.0*x^4.0+a*b/c*d*4.0*x^3.0-a*b/c*d*2.0-a*b/c*d*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a*b/c*d*8.0*x^7.0+a*b/c*d*5.0*x^4.0+a*b/c*d*4.0*x^3.0-a*b/c*d*2.0-a*b/c*d*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="a*b/c*d*x^8.0+a*b/c*d*x^5.0+a*b/c*d*x^4.0-a*b/c*d*2.0*x-a*b/c*d*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a*b/c*d/9.0*x^9.0+a*b/c*d/6.0*x^6.0+a*b/c*d/5.0*x^5.0-a*b/c*d*x^2.0-a*b/c*d*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a*b/c*d/9.0*x^9.0+a*b/c*d/6.0*x^6.0+a*b/c*d/5.0*x^5.0-a*b/c*d*x^2.0-a*b/c*d*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a*b/c*d*8.0*x^7.0+a*b/c*d*5.0*x^4.0+a*b/c*d*4.0*x^3.0-a*b/c*d*2.0-a*b/c*d*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a*b/c*d*8.0*7.0*x^6.0+a*b/c*d*5.0*4.0*x^3.0+a*b/c*d*4.0*3.0*x^2.0-a*b/c*d*2.0*0.0-a*b/c*d*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a*b/c*d*56.0*x^6.0+a*b/c*d*20.0*x^3.0+a*b/c*d*12.0*x^2.0-a*b/c*d*0.0-a*b/c*d*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a*b/c*d/9.0*x^9.0+a*b/c*d/6.0*x^6.0+a*b/c*d/5.0*x^5.0-a*b/c*d*x^2.0-a*b/c*d*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a*b/c*d/9.0/10.0*x^10.0+a*b/c*d/6.0/7.0*x^7.0+a*b/c*d/5.0/6.0*x^6.0-a*b/c*d/3.0*x^3.0-a*b/c*d*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a*b/c*d*0.011111111111111112*x^10.0+a*b/c*d*0.023809523809523808*x^7.0+a*b/c*d*0.03333333333333333*x^6.0-a*b/c*d/3.0*x^3.0-a*b/c*d*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a*b/c*d*56.0*x^6.0+a*b/c*d*20.0*x^3.0+a*b/c*d*12.0*x^2.0-a*b/c*d*0.0-a*b/c*d*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a*b/c*d*56.0*6.0*x^5.0+a*b/c*d*20.0*3.0*x^2.0+a*b/c*d*12.0*2.0*x^1.0-a*b/c*d*0.0-a*b/c*d*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a*b/c*d*336.0*x^5.0+a*b/c*d*60.0*x^2.0+a*b/c*d*24.0*x-a*b/c*d*0.0-a*b/c*d*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a*b/c*d*0.011111111111111112*x^10.0+a*b/c*d*0.023809523809523808*x^7.0+a*b/c*d*0.03333333333333333*x^6.0-a*b/c*d/3.0*x^3.0-a*b/c*d*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a*b/c*d*0.011111111111111112/11.0*x^11.0+a*b/c*d*0.023809523809523808/8.0*x^8.0+a*b/c*d*0.03333333333333333/7.0*x^7.0-a*b/c*d/3.0/4.0*x^4.0-a*b/c*d*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a*b/c*d*0.00101010101010101*x^11.0+a*b/c*d*0.002976190476190476*x^8.0+a*b/c*d*0.0047619047619047615*x^7.0-a*b/c*d*0.08333333333333333*x^4.0-a*b/c*d*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a*b/c*d*336.0*x^5.0+a*b/c*d*60.0*x^2.0+a*b/c*d*24.0*x-a*b/c*d*0.0-a*b/c*d*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a*b/c*d*336.0*5.0*x^4.0+a*b/c*d*60.0*2.0*x^1.0+a*b/c*d*24.0-a*b/c*d*0.0-a*b/c*d*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a*b/c*d*1680.0*x^4.0+a*b/c*d*120.0*x+a*b/c*d*24.0-a*b/c*d*0.0-a*b/c*d*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a*b/c*d*0.00101010101010101*x^11.0+a*b/c*d*0.002976190476190476*x^8.0+a*b/c*d*0.0047619047619047615*x^7.0-a*b/c*d*0.08333333333333333*x^4.0-a*b/c*d*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a*b/c*d*0.00101010101010101/12.0*x^12.0+a*b/c*d*0.002976190476190476/9.0*x^9.0+a*b/c*d*0.0047619047619047615/8.0*x^8.0-a*b/c*d*0.08333333333333333/5.0*x^5.0-a*b/c*d*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a*b/c*d*8.417508417508418E-5*x^12.0+a*b/c*d*3.3068783068783067E-4*x^9.0+a*b/c*d*5.952380952380952E-4*x^8.0-a*b/c*d*0.016666666666666666*x^5.0-a*b/c*d*2.0833333333333335*x^4.0";
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
      // Repeat Cycle of 50001 to 50004 :Operators: * & /
      
       public static void TestCaseDiff50027() {
        //Test Case 50027
        UsageCalculus.TestCase = 50027;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "a*b*c*d*p*x^8 + a*b*c*d*p*x^5 + a*b*c*d*p*x^4 - 2*x*a*b*c*d*p- 25*2*a*b*c*d*p";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a*b*c*d*p*x^8.0+a*b*c*d*p*x^5.0+a*b*c*d*p*x^4.0-a*b*c*d*p*2.0*x-a*b*c*d*p*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a*b*c*d*p*8.0*x^7.0+a*b*c*d*p*5.0*x^4.0+a*b*c*d*p*4.0*x^3.0-a*b*c*d*p*2.0-a*b*c*d*p*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a*b*c*d*p*8.0*x^7.0+a*b*c*d*p*5.0*x^4.0+a*b*c*d*p*4.0*x^3.0-a*b*c*d*p*2.0-a*b*c*d*p*0.0";
        UsageCalculus.EqnSolArrayMap3[1] = "a*b*c*d*p*x^8.0+a*b*c*d*p*x^5.0+a*b*c*d*p*x^4.0-a*b*c*d*p*2.0*x-a*b*c*d*p*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a*b*c*d*p/9.0*x^9.0+a*b*c*d*p/6.0*x^6.0+a*b*c*d*p/5.0*x^5.0-a*b*c*d*p*x^2.0-a*b*c*d*p*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a*b*c*d*p/9.0*x^9.0+a*b*c*d*p/6.0*x^6.0+a*b*c*d*p/5.0*x^5.0-a*b*c*d*p*x^2.0-a*b*c*d*p*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a*b*c*d*p*8.0*x^7.0+a*b*c*d*p*5.0*x^4.0+a*b*c*d*p*4.0*x^3.0-a*b*c*d*p*2.0-a*b*c*d*p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a*b*c*d*p*8.0*7.0*x^6.0+a*b*c*d*p*5.0*4.0*x^3.0+a*b*c*d*p*4.0*3.0*x^2.0-a*b*c*d*p*2.0*0.0-a*b*c*d*p*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a*b*c*d*p*56.0*x^6.0+a*b*c*d*p*20.0*x^3.0+a*b*c*d*p*12.0*x^2.0-a*b*c*d*p*0.0-a*b*c*d*p*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a*b*c*d*p/9.0*x^9.0+a*b*c*d*p/6.0*x^6.0+a*b*c*d*p/5.0*x^5.0-a*b*c*d*p*x^2.0-a*b*c*d*p*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a*b*c*d*p/9.0/10.0*x^10.0+a*b*c*d*p/6.0/7.0*x^7.0+a*b*c*d*p/5.0/6.0*x^6.0-a*b*c*d*p/3.0*x^3.0-a*b*c*d*p*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a*b*c*d*p*0.011111111111111112*x^10.0+a*b*c*d*p*0.023809523809523808*x^7.0+a*b*c*d*p*0.03333333333333333*x^6.0-a*b*c*d*p/3.0*x^3.0-a*b*c*d*p*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a*b*c*d*p*56.0*x^6.0+a*b*c*d*p*20.0*x^3.0+a*b*c*d*p*12.0*x^2.0-a*b*c*d*p*0.0-a*b*c*d*p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a*b*c*d*p*56.0*6.0*x^5.0+a*b*c*d*p*20.0*3.0*x^2.0+a*b*c*d*p*12.0*2.0*x^1.0-a*b*c*d*p*0.0-a*b*c*d*p*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a*b*c*d*p*336.0*x^5.0+a*b*c*d*p*60.0*x^2.0+a*b*c*d*p*24.0*x-a*b*c*d*p*0.0-a*b*c*d*p*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a*b*c*d*p*0.011111111111111112*x^10.0+a*b*c*d*p*0.023809523809523808*x^7.0+a*b*c*d*p*0.03333333333333333*x^6.0-a*b*c*d*p/3.0*x^3.0-a*b*c*d*p*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a*b*c*d*p*0.011111111111111112/11.0*x^11.0+a*b*c*d*p*0.023809523809523808/8.0*x^8.0+a*b*c*d*p*0.03333333333333333/7.0*x^7.0-a*b*c*d*p/3.0/4.0*x^4.0-a*b*c*d*p*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a*b*c*d*p*0.00101010101010101*x^11.0+a*b*c*d*p*0.002976190476190476*x^8.0+a*b*c*d*p*0.0047619047619047615*x^7.0-a*b*c*d*p*0.08333333333333333*x^4.0-a*b*c*d*p*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a*b*c*d*p*336.0*x^5.0+a*b*c*d*p*60.0*x^2.0+a*b*c*d*p*24.0*x-a*b*c*d*p*0.0-a*b*c*d*p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a*b*c*d*p*336.0*5.0*x^4.0+a*b*c*d*p*60.0*2.0*x^1.0+a*b*c*d*p*24.0-a*b*c*d*p*0.0-a*b*c*d*p*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a*b*c*d*p*1680.0*x^4.0+a*b*c*d*p*120.0*x+a*b*c*d*p*24.0-a*b*c*d*p*0.0-a*b*c*d*p*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a*b*c*d*p*0.00101010101010101*x^11.0+a*b*c*d*p*0.002976190476190476*x^8.0+a*b*c*d*p*0.0047619047619047615*x^7.0-a*b*c*d*p*0.08333333333333333*x^4.0-a*b*c*d*p*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a*b*c*d*p*0.00101010101010101/12.0*x^12.0+a*b*c*d*p*0.002976190476190476/9.0*x^9.0+a*b*c*d*p*0.0047619047619047615/8.0*x^8.0-a*b*c*d*p*0.08333333333333333/5.0*x^5.0-a*b*c*d*p*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a*b*c*d*p*8.417508417508418E-5*x^12.0+a*b*c*d*p*3.3068783068783067E-4*x^9.0+a*b*c*d*p*5.952380952380952E-4*x^8.0-a*b*c*d*p*0.016666666666666666*x^5.0-a*b*c*d*p*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff50028() {
        //Test Case 50028
        UsageCalculus.TestCase = 50028;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "a/b/c/d/p*x^8 + a/b/c/d/p*x^5 + a/b/c/d/p*x^4 - 2*x*a/b/c/d/p- 25*2*a/b/c/d/p";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a/b/c/d/p*x^8.0+a/b/c/d/p*x^5.0+a/b/c/d/p*x^4.0-a/b/c/d/p*2.0*x-a/b/c/d/p*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a/b/c/d/p*8.0*x^7.0+a/b/c/d/p*5.0*x^4.0+a/b/c/d/p*4.0*x^3.0-a/b/c/d/p*2.0-a/b/c/d/p*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a/b/c/d/p*8.0*x^7.0+a/b/c/d/p*5.0*x^4.0+a/b/c/d/p*4.0*x^3.0-a/b/c/d/p*2.0-a/b/c/d/p*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="a/b/c/d/p*x^8.0+a/b/c/d/p*x^5.0+a/b/c/d/p*x^4.0-a/b/c/d/p*2.0*x-a/b/c/d/p*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a/b/c/d/p/9.0*x^9.0+a/b/c/d/p/6.0*x^6.0+a/b/c/d/p/5.0*x^5.0-a/b/c/d/p*x^2.0-a/b/c/d/p*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a/b/c/d/p/9.0*x^9.0+a/b/c/d/p/6.0*x^6.0+a/b/c/d/p/5.0*x^5.0-a/b/c/d/p*x^2.0-a/b/c/d/p*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a/b/c/d/p*8.0*x^7.0+a/b/c/d/p*5.0*x^4.0+a/b/c/d/p*4.0*x^3.0-a/b/c/d/p*2.0-a/b/c/d/p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a/b/c/d/p*8.0*7.0*x^6.0+a/b/c/d/p*5.0*4.0*x^3.0+a/b/c/d/p*4.0*3.0*x^2.0-a/b/c/d/p*2.0*0.0-a/b/c/d/p*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a/b/c/d/p*56.0*x^6.0+a/b/c/d/p*20.0*x^3.0+a/b/c/d/p*12.0*x^2.0-a/b/c/d/p*0.0-a/b/c/d/p*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a/b/c/d/p/9.0*x^9.0+a/b/c/d/p/6.0*x^6.0+a/b/c/d/p/5.0*x^5.0-a/b/c/d/p*x^2.0-a/b/c/d/p*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a/b/c/d/p/9.0/10.0*x^10.0+a/b/c/d/p/6.0/7.0*x^7.0+a/b/c/d/p/5.0/6.0*x^6.0-a/b/c/d/p/3.0*x^3.0-a/b/c/d/p*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a/b/c/d/p*0.011111111111111112*x^10.0+a/b/c/d/p*0.023809523809523808*x^7.0+a/b/c/d/p*0.03333333333333333*x^6.0-a/b/c/d/p/3.0*x^3.0-a/b/c/d/p*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a/b/c/d/p*56.0*x^6.0+a/b/c/d/p*20.0*x^3.0+a/b/c/d/p*12.0*x^2.0-a/b/c/d/p*0.0-a/b/c/d/p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a/b/c/d/p*56.0*6.0*x^5.0+a/b/c/d/p*20.0*3.0*x^2.0+a/b/c/d/p*12.0*2.0*x^1.0-a/b/c/d/p*0.0-a/b/c/d/p*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a/b/c/d/p*336.0*x^5.0+a/b/c/d/p*60.0*x^2.0+a/b/c/d/p*24.0*x-a/b/c/d/p*0.0-a/b/c/d/p*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a/b/c/d/p*0.011111111111111112*x^10.0+a/b/c/d/p*0.023809523809523808*x^7.0+a/b/c/d/p*0.03333333333333333*x^6.0-a/b/c/d/p/3.0*x^3.0-a/b/c/d/p*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a/b/c/d/p*0.011111111111111112/11.0*x^11.0+a/b/c/d/p*0.023809523809523808/8.0*x^8.0+a/b/c/d/p*0.03333333333333333/7.0*x^7.0-a/b/c/d/p/3.0/4.0*x^4.0-a/b/c/d/p*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a/b/c/d/p*0.00101010101010101*x^11.0+a/b/c/d/p*0.002976190476190476*x^8.0+a/b/c/d/p*0.0047619047619047615*x^7.0-a/b/c/d/p*0.08333333333333333*x^4.0-a/b/c/d/p*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a/b/c/d/p*336.0*x^5.0+a/b/c/d/p*60.0*x^2.0+a/b/c/d/p*24.0*x-a/b/c/d/p*0.0-a/b/c/d/p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a/b/c/d/p*336.0*5.0*x^4.0+a/b/c/d/p*60.0*2.0*x^1.0+a/b/c/d/p*24.0-a/b/c/d/p*0.0-a/b/c/d/p*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a/b/c/d/p*1680.0*x^4.0+a/b/c/d/p*120.0*x+a/b/c/d/p*24.0-a/b/c/d/p*0.0-a/b/c/d/p*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a/b/c/d/p*0.00101010101010101*x^11.0+a/b/c/d/p*0.002976190476190476*x^8.0+a/b/c/d/p*0.0047619047619047615*x^7.0-a/b/c/d/p*0.08333333333333333*x^4.0-a/b/c/d/p*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a/b/c/d/p*0.00101010101010101/12.0*x^12.0+a/b/c/d/p*0.002976190476190476/9.0*x^9.0+a/b/c/d/p*0.0047619047619047615/8.0*x^8.0-a/b/c/d/p*0.08333333333333333/5.0*x^5.0-a/b/c/d/p*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a/b/c/d/p*8.417508417508418E-5*x^12.0+a/b/c/d/p*3.3068783068783067E-4*x^9.0+a/b/c/d/p*5.952380952380952E-4*x^8.0-a/b/c/d/p*0.016666666666666666*x^5.0-a/b/c/d/p*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff50029() {
        //Test Case 50029
        UsageCalculus.TestCase = 50029;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "2*a^2*x- 25*2/a^3 + a^2/x^8 + a^2/x^5 + a^2/x^4 ";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a^2.0*2.0*x-1.0/a^3.0*50.0+a^2.0/x^8.0+a^2.0/x^5.0+a^2.0/x^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a^2.0*2.0-1.0/a^3.0*50.0*0.0+a^2.0*-8.0/x^9.0+a^2.0*-5.0/x^6.0+a^2.0*-4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a^2.0*2.0-1.0/a^3.0*0.0-a^2.0*8.0/x^9.0-a^2.0*5.0/x^6.0-a^2.0*4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap3[1]="a^2.0*2.0*x-1.0/a^3.0*50.0+a^2.0/x^8.0+a^2.0/x^5.0+a^2.0/x^4.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a^2.0*x^2.0-1.0/a^3.0*50.0*x+a^2.0/-7.0/x^7.0+a^2.0/-4.0/x^4.0+a^2.0/-3.0/x^3.0";
        UsageCalculus.EqnSolArrayMap4[1]="a^2.0*x^2.0-1.0/a^3.0*50.0*x-a^2.0/7.0/x^7.0-a^2.0/4.0/x^4.0-a^2.0/3.0/x^3.0";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a^2.0*2.0-1.0/a^3.0*0.0-a^2.0*8.0/x^9.0-a^2.0*5.0/x^6.0-a^2.0*4.0/x^5.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a^2.0*2.0*0.0-1.0/a^3.0*0.0*0.0-a^2.0*8.0*-9.0/x^10.0-a^2.0*5.0*-6.0/x^7.0-a^2.0*4.0*-5.0/x^6.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a^2.0*0.0-1.0/a^3.0*0.0+a^2.0*72.0/x^10.0+a^2.0*30.0/x^7.0+a^2.0*20.0/x^6.0";
        UsageCalculus.EqnSolArrayMap3[2]="a^2.0*x^2.0-1.0/a^3.0*50.0*x-a^2.0/7.0/x^7.0-a^2.0/4.0/x^4.0-a^2.0/3.0/x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a^2.0/3.0*x^3.0-1.0/a^3.0*50.0/2.0*x^2.0-a^2.0/7.0/-6.0/x^6.0-a^2.0/4.0/-3.0/x^3.0-a^2.0/3.0/-2.0/x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a^2.0/3.0*x^3.0-1.0/a^3.0*25.0*x^2.0+a^2.0/42.0/x^6.0+a^2.0/12.0/x^3.0+a^2.0/6.0/x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a^2.0*0.0-1.0/a^3.0*0.0+a^2.0*72.0/x^10.0+a^2.0*30.0/x^7.0+a^2.0*20.0/x^6.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a^2.0*0.0-1.0/a^3.0*0.0*0.0+a^2.0*72.0*-10.0/x^11.0+a^2.0*30.0*-7.0/x^8.0+a^2.0*20.0*-6.0/x^7.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a^2.0*0.0-1.0/a^3.0*0.0-a^2.0*720.0/x^11.0-a^2.0*210.0/x^8.0-a^2.0*120.0/x^7.0";
        UsageCalculus.EqnSolArrayMap3[3]="a^2.0/3.0*x^3.0-1.0/a^3.0*25.0*x^2.0+a^2.0/42.0/x^6.0+a^2.0/12.0/x^3.0+a^2.0/6.0/x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a^2.0/3.0/4.0*x^4.0-1.0/a^3.0*25.0/3.0*x^3.0+a^2.0/42.0/-5.0/x^5.0+a^2.0/12.0/-2.0/x^2.0+a^2.0/6.0/-1.0/x^1.0";
        UsageCalculus.EqnSolArrayMap4[3]="a^2.0/12.0*x^4.0-1.0/a^3.0*8.333333333333334*x^3.0-a^2.0/210.0/x^5.0-a^2.0/24.0/x^2.0-a^2.0/6.0/x";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a^2.0*0.0-1.0/a^3.0*0.0-a^2.0*720.0/x^11.0-a^2.0*209.99999999999997/x^8.0-a^2.0*120.0/x^7.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a^2.0*0.0-1.0/a^3.0*0.0*0.0-a^2.0*720.0*-11.0/x^12.0-a^2.0*209.99999999999997*-8.0/x^9.0-a^2.0*120.0*-7.0/x^8.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a^2.0*0.0-1.0/a^3.0*0.0+a^2.0*7920.0/x^12.0+a^2.0*1679.9999999999998/x^9.0+a^2.0*840.0/x^8.0";
        UsageCalculus.EqnSolArrayMap3[4]="a^2.0/12.0*x^4.0-1.0/a^3.0*8.333333333333334*x^3.0-a^2.0/209.99999999999997/x^5.0-a^2.0/24.0/x^2.0-a^2.0/6.0/x";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a^2.0/12.0/5.0*x^5.0-1.0/a^3.0*8.333333333333334/4.0*x^4.0-a^2.0/209.99999999999997/-4.0/x^4.0-a^2.0/24.0/-1.0/x^1.0-a^2.0/6.0*ln(x)";
        UsageCalculus.EqnSolArrayMap4[4]="a^2.0/60.0*x^5.0-1.0/a^3.0*2.0833333333333335*x^4.0+a^2.0/839.9999999999999/x^4.0+a^2.0/24.0/x-a^2.0/6.0*ln(x)";
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
       public static void TestCaseDiff50030() {
        //Test Case 50030
        UsageCalculus.TestCase = 50030;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = " 25*2/a^3 -2*a^2*x+ a^2/x^8 + a^2/x^5 + a^2/x^4 ";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 5;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/a^3.0*50.0-a^2.0*2.0*x+a^2.0/x^8.0+a^2.0/x^5.0+a^2.0/x^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/a^3.0*50.0*0.0-a^2.0*2.0+a^2.0*-8.0/x^9.0+a^2.0*-5.0/x^6.0+a^2.0*-4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0/a^3.0*0.0-a^2.0*2.0-a^2.0*8.0/x^9.0-a^2.0*5.0/x^6.0-a^2.0*4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/a^3.0*50.0-a^2.0*2.0*x+a^2.0/x^8.0+a^2.0/x^5.0+a^2.0/x^4.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/a^3.0*50.0*x-a^2.0*x^2.0+a^2.0/-7.0/x^7.0+a^2.0/-4.0/x^4.0+a^2.0/-3.0/x^3.0";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/a^3.0*50.0*x-a^2.0*x^2.0-a^2.0/7.0/x^7.0-a^2.0/4.0/x^4.0-a^2.0/3.0/x^3.0";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0/a^3.0*0.0-a^2.0*2.0-a^2.0*8.0/x^9.0-a^2.0*5.0/x^6.0-a^2.0*4.0/x^5.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "1.0/a^3.0*0.0-a^2.0*2.0*0.0-a^2.0*8.0*-9.0/x^10.0-a^2.0*5.0*-6.0/x^7.0-a^2.0*4.0*-5.0/x^6.0";
        UsageCalculus.EqnSolArrayMap2[2] = "1.0/a^3.0*0.0-a^2.0*0.0+a^2.0*72.0/x^10.0+a^2.0*30.0/x^7.0+a^2.0*20.0/x^6.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/a^3.0*50.0*x-a^2.0*x^2.0-a^2.0/7.0/x^7.0-a^2.0/4.0/x^4.0-a^2.0/3.0/x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/a^3.0*50.0/2.0*x^2.0-a^2.0/3.0*x^3.0-a^2.0/7.0/-6.0/x^6.0-a^2.0/4.0/-3.0/x^3.0-a^2.0*3.0/-2.0/x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/a^3.0*25.0*x^2.0-a^2.0/3.0*x^3.0+a^2.0/42.0/x^6.0+a^2.0/12.0/x^3.0+a^2.0/6.0/x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "1.0/a^3.0*0.0-a^2.0*0.0+a^2.0*72.0/x^10.0+a^2.0*30.0/x^7.0+a^2.0*20.0/x^6.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "1.0/a^3.0*0.0-a^2.0*0.0+a^2.0*72.0*-10.0/x^11.0+a^2.0*30.0*-7.0/x^8.0+a^2.0*20.0*-6.0/x^7.0";
        UsageCalculus.EqnSolArrayMap2[3] = "1.0/a^3.0*0.0-a^2.0*0.0-a^2.0*720.0/x^11.0-a^2.0*210.0/x^8.0-a^2.0*120.0/x^7.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/a^3.0*25.0*x^2.0-a^2.0/3.0*x^3.0+a^2.0/42.0/x^6.0+a^2.0/12.0/x^3.0+a^2.0/6.0/x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/a^3.0*25.0/3.0*x^3.0-a^2.0/3.0/4.0*x^4.0+a^2.0/42.0/-5.0/x^5.0+a^2.0/12.0/-2.0/x^2.0+a^2.0/6.0/-1.0/x^1.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/a^3.0*8.333333333333334*x^3.0-a^2.0*0.08333333333333333*x^4.0-a^2.0/210.0/x^5.0-a^2.0/24.0/x^2.0-a^2.0/6.0/x";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "1.0/a^3.0*0.0-a^2.0*0.0-a^2.0*720.0/x^11.0-a^2.0*209.99999999999997/x^8.0-a^2.0*120.0/x^7.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "1.0/a^3.0*0.0-a^2.0*0.0*0.0-a^2.0*720.0*-11.0/x^12.0-a^2.0*209.99999999999997*-8.0/x^9.0-a^2.0*120.0*-7.0/x^8.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1.0/a^3.0*0.0-a^2.0*0.0+a^2.0*7920.0/x^12.0+a^2.0*1679.9999999999998/x^9.0+a^2.0*840.0/x^8.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/a^3.0*8.333333333333334*x^3.0-a^2.0*0.08333333333333333*x^4.0-a^2.0/209.99999999999997/x^5.0-a^2.0/24.0/x^2.0-a^2.0/6.0/x";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/a^3.0*8.333333333333334/4.0*x^4.0-a^2.0*0.08333333333333333/5.0*x^5.0-a^2.0/209.99999999999997/-4.0/x^4.0-a^2.0/24.0/-1.0/x^1.0-a^2.0/6.0*ln(x)";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/a^3.0*2.0833333333333335*x^4.0-a^2.0*0.016666666666666666*x^5.0+a^2.0/839.9999999999999/x^4.0+a^2.0/24.0/x-a^2.0/6.0*ln(x)";
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
              
       public static void TestCaseDiff50031() {
        //Test Case 50031
        UsageCalculus.TestCase = 50031;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "b/a/x^8 + b/a/x^5 + b/a/x^4 - 2/x/b/a- 25/2/b/a";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "b/a/x^8.0+b/a/x^5.0+b/a/x^4.0-1.0/b/a*2.0/x-1.0/b/a*12.5";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "b/a*-8.0/x^9.0+b/a*-5.0/x^6.0+b/a*-4.0/x^5.0+1.0/b/a*2.0/x^2.0-1.0/b/a*12.5*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-b/a*8.0/x^9.0-b/a*5.0/x^6.0-b/a*4.0/x^5.0+1.0/b/a*2.0/x^2.0-1.0/b/a*0.0";
        UsageCalculus.EqnSolArrayMap3[1] = "b/a*x^8.0+b/a*x^5.0+b/a*x^4.0-1.0/b/a*2.0/x-1.0/b/a*12.5";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="b/a/9.0*x^9.0+b/a/6.0*x^6.0+b/a/5.0*x^5.0-1.0/b/a*2.0*ln(x)-1.0/b/a*12.5*x";
        UsageCalculus.EqnSolArrayMap4[1]="b/a/9.0*x^9.0+b/a/6.0*x^6.0+b/a/5.0*x^5.0-1.0/b/a*2.0*ln(x)-1.0/b/a*12.5*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-b*8.0/x^9.0-b*5.0/x^6.0-b*4.0/x^5.0+1.0/b/a*2.0/x^2.0-1.0/b/a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-b*8.0*-9.0/x^10.0-b*5.0*-6.0/x^7.0-b*4.0*-5.0/x^6.0+1.0/b/a*2.0*-2.0/x^3.0-1.0/b/a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "b*72.0/x^10.0+b*30.0/x^7.0+b*20.0/x^6.0-1.0/b/a*4.0/x^3.0-1.0/b/a*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="-a^2.0/7.0/x^7.0-a^2.0/4.0/x^4.0-a^2.0/3.0/x^3.0-1.0/a^2.0*x^2.0-50.0/a*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "b*72.0/x^10.0+b*30.0/x^7.0+b*20.0/x^6.0-1.0/b/a*4.0/x^3.0-1.0/b/a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "b*72.0*-10.0/x^11.0+b*30.0*-7.0/x^8.0+b*20.0*-6.0/x^7.0-1.0/b/a*4.0*-3.0/x^4.0-1.0/b/a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-b*720.0/x^11.0-b*210.0/x^8.0-b*120.0/x^7.0+1.0/b/a*12.0/x^4.0-1.0/b/a*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-b*720.0/x^11.0-b*209.99999999999997/x^8.0-b*120.0/x^7.0+1.0/b/a*12.0/x^4.0-1.0/b/a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-b*720.0*-11.0/x^12.0-b*209.99999999999997*-8.0/x^9.0-b*120.0*-7.0/x^8.0+1.0/b/a*12.0*-4.0/x^5.0-1.0/b/a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "b*7920.0/x^12.0+b*1679.9999999999998/x^9.0+b*840.0/x^8.0-1.0/b/a*48.0/x^5.0-1.0/b/a*0.0";
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
       public static void TestCaseDiff50032() {
        //Test Case 50032
        UsageCalculus.TestCase = 50032;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "a^2/x^8 + a^2/x^5 + a^2/x^4 - 2*x/a^2- 25*2/a^3";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a^2.0/x^8.0+a^2.0/x^5.0+a^2.0/x^4.0-1.0/a^2.0*2.0*x-1.0/a^3.0*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a^2.0*-8.0/x^9.0+a^2.0*-5.0/x^6.0+a^2.0*-4.0/x^5.0-1.0/a^2.0*2.0-1.0/a^3.0*50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-a^2.0*8.0/x^9.0-a^2.0*5.0/x^6.0-a^2.0*4.0/x^5.0-1.0/a^2.0*2.0-1.0/a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="a^2.0/x^8.0+a^2.0/x^5.0+a^2.0/x^4.0-1.0/a^2.0*2.0*x-1.0/a^3.0*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a^2.0/-7.0/x^7.0+a^2.0/-4.0/x^4.0+a^2.0/-3.0/x^3.0-1.0/a^2.0*2.0/2.0*x^2.0-1.0/a^3.0*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="-a^2.0/7.0/x^7.0-a^2.0/4.0/x^4.0-a^2.0/3.0/x^3.0-1.0/a^2.0*x^2.0-1.0/a^3.0*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-a^2.0*8.0/x^9.0-a^2.0*5.0/x^6.0-a^2.0*4.0/x^5.0-1.0/a^2.0*2.0-1.0/a^3.0*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-a^2.0*8.0*-9.0/x^10.0-a^2.0*5.0*-6.0/x^7.0-a^2.0*4.0*-5.0/x^6.0-1.0/a^2.0*2.0*0.0-1.0/a^3.0*0";
        UsageCalculus.EqnSolArrayMap2[2] = "a^2.0*72.0/x^10.0+a^2.0*30.0/x^7.0+a^2.0*20.0/x^6.0-1.0/a^2.0*0.0-1.0/a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="-a^2.0/7.0/x^7.0-a^2.0/4.0/x^4.0-a^2.0/3.0/x^3.0-1.0/a^2.0*x^2.0-1.0/a^3.0*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-a^2.0/7.0/-6.0/x^6.0-a^2.0/4.0/-3.0/x^3.0-a^2.0/3.0/-2.0/x^2.0-1.0/a^2.0/3.0*x^3.0-1.0/a^3.0*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a^2.0/42.0/x^6.0+a^2.0/12.0/x^3.0+a^2.0/6.0/x^2.0-1.0/a^2.0/3.0*x^3.0-1.0/a^3.0*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a^2.0*72.0/x^10.0+a^2.0*30.0/x^7.0+a^2.0*20.0/x^6.0-1.0/a^2.0*0.0-1.0/a^3.0*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a^2.0*72.0*-10.0/x^11.0+a^2.0*30.0*-7.0/x^8.0+a^2.0*20.0*-6.0/x^7.0-1.0/a^2.0*0.0*0.0-1.0/a^3.0*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-a^2.0*720.0/x^11.0-a^2.0*210.0/x^8.0-a^2.0*120.0/x^7.0-1.0/a^2.0*0.0-1.0/a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a^2.0/42.0/x^6.0+a^2.0/12.0/x^3.0+a^2.0/6.0/x^2.0-1.0/a^2.0/3.0*x^3.0-1.0/a^3.0*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a^2.0/42.0/-5.0/x^5.0+a^2.0/12.0/-2.0/x^2.0+a^2.0/6.0/-1.0/x^1.0-1.0/a^2.0/3.0/4.0*x^4.0-1.0/a^3.0*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-a^2.0/210.0/x^5.0-a^2.0/24.0/x^2.0-a^2.0/6.0/x-1.0/a^2.0/12.0*x^4.0-1.0/a^3.0*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-a^2.0*720.0/x^11.0-a^2.0*209.99999999999997/x^8.0-a^2.0*120.0/x^7.0-1.0/a^2.0*0.0-1.0/a^3.0*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-a^2.0*720.0*-11.0/x^12.0-a^2.0*209.99999999999997*-8.0/x^9.0-a^2.0*120.0*-7.0/x^8.0-1.0/a^2.0*0.0*0.0-1.0/a^3.0*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a^2.0*7920.0/x^12.0+a^2.0*1679.9999999999998/x^9.0+a^2.0*840.0/x^8.0-1.0/a^2.0*0.0-1.0/a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="-a^2.0/209.99999999999997/x^5.0-a^2.0/24.0/x^2.0-a^2.0/6.0/x-1.0/a^2.0/12.0*x^4.0-1.0/a^3.0*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="-a^2.0/209.99999999999997/-4.0/x^4.0-a^2.0/24.0/-1.0/x^1.0-a^2.0*6.0*ln(x)-1.0/a^2.0/12.0/5.0*x^5.0-1.0/a^3.0*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a^2.0/839.9999999999999/x^4.0+a^2.0/24.0/x-a^2.0*6.0*ln(x)-1.0/a^2.0/60.0*x^5.0-1.0/a^3.0*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff50033() {
        //Test Case 50033
        UsageCalculus.TestCase = 50033;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "a^2/x^8 + a^2/x^5 + a^2/x^4 - 2*x*a^2- 25*2/a^3";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a^2.0/x^8.0+a^2.0/x^5.0+a^2.0/x^4.0-a^2.0*2.0*x-1.0/a^3.0*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a^2.0*-8.0/x^9.0+a^2.0*-5.0/x^6.0+a^2.0*-4.0/x^5.0-a^2.0*2.0-1.0/a^3.0*50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-a^2.0*8.0/x^9.0-a^2.0*5.0/x^6.0-a^2.0*4.0/x^5.0-a^2.0*2.0-1.0/a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="a^2.0/x^8.0+a^2.0/x^5.0+a^2.0/x^4.0-a^2.0*2.0*x-1.0/a^3.0*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a^2.0/-7.0/x^7.0+a^2.0/-4.0/x^4.0+a^2.0/-3.0/x^3.0-a^2.0*x^2.0-1.0/a^3.0*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="-a^2.0/7.0/x^7.0-a^2.0/4.0/x^4.0-a^2.0/3.0/x^3.0-a^2.0*x^2.0-1.0/a^3.0*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-a^2.0*8.0/x^9.0-a^2.0*5.0/x^6.0-a^2.0*4.0/x^5.0-a^2.0*2.0-1.0/a^3.0*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-a^2.0*8.0*-9.0/x^10.0-a^2.0*5.0*-6.0/x^7.0-a^2.0*4.0*-5.0/x^6.0-a^2.0*2.0*0.0-1.0/a^3.0*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a^2.0*72.0/x^10.0+a^2.0*30.0/x^7.0+a^2.0*20.0/x^6.0-a^2.0*0.0-1.0/a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="-a^2.0/7.0/x^7.0-a^2.0/4.0/x^4.0-a^2.0/3.0/x^3.0-a^2.0*x^2.0-1.0/a^3.0*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-a^2.0/7.0/-6.0/x^6.0-a^2.0/4.0/-3.0/x^3.0-a^2.0/3.0/-2.0/x^2.0-a^2.0/3.0*x^3.0-1.0/a^3.0*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a^2.0/42.0/x^6.0+a^2.0/12.0/x^3.0+a^2.0/6.0/x^2.0-a^2.0/3.0*x^3.0-1.0/a^3.0*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a^2.0*72.0/x^10.0+a^2.0*30.0/x^7.0+a^2.0*20.0/x^6.0-a^2.0*0.0-1.0/a^3.0*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a^2.0*72.0*-10.0/x^11.0+a^2.0*30.0*-7.0/x^8.0+a^2.0*20.0*-6.0/x^7.0-a^2.0*0.0*0.0-1.0/a^3.0*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-a^2.0*720.0/x^11.0-a^2.0*210.0/x^8.0-a^2.0*120.0/x^7.0-a^2.0*0.0-1.0/a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a^2.0/42.0/x^6.0+a^2.0/12.0/x^3.0+a^2.0/6.0/x^2.0-a^2.0/3.0*x^3.0-1.0/a^3.0*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a^2.0/42.0/-5.0/x^5.0+a^2.0/12.0/-2.0/x^2.0+a^2.0/6.0/-1.0/x^1.0-a^2.0/3.0/4.0*x^4.0-1.0/a^3.0*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-a^2.0/210.0/x^5.0-a^2.0/24.0/x^2.0-a^2.0/6.0/x-a^2.0/12.0*x^4.0-1.0/a^3.0*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-a^2.0*720.0/x^11.0-a^2.0*209.99999999999997/x^8.0-a^2.0*120.0/x^7.0-a^2.0*0.0-1.0/a^3.0*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-a^2.0*720.0*-11.0/x^12.0-a^2.0*209.99999999999997*-8.0/x^9.0-a^2.0*120.0*-7.0/x^8.0-a^2.0*0.0*0.0-1.0/a^3.0*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a^2.0*7920.0/x^12.0+a^2.0*1679.9999999999998/x^9.0+a^2.0*840.0/x^8.0-a^2.0*0.0-1.0/a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="-a^2.0/209.99999999999997/x^5.0-a^2.0/24.0/x^2.0-a^2.0/6.0/x-a^2.0/12.0*x^4.0-1.0/a^3.0*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="-a^2.0/209.99999999999997/-4.0/x^4.0-a^2.0/24.0/-1.0/x^1.0-a^2.0*6.0*ln(x)-a^2.0/12.0/5.0*x^5.0-1.0/a^3.0*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a^2.0/839.9999999999999/x^4.0+a^2.0/24.0/x-a^2.0*6.0*ln(x)-a^2.0/60.0*x^5.0-1.0/a^3.0*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff50034() {
        //Test Case 50034
        UsageCalculus.TestCase = 50034;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "2*x*a^2- 25*2/a^3 + a^2/x^8 + a^2/x^5 + a^2/x^4 ";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 3;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a^2.0*2.0*x-1.0/a^3.0*50.0+a^2.0/x^8.0+a^2.0/x^5.0+a^2.0/x^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a^2.0*2.0-1.0/a^3.0*50.0*0.0+a^2.0*-8.0/x^9.0+a^2.0*-5.0/x^6.0+a^2.0*-4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a^2.0*2.0-1.0/a^3.0*0.0-a^2.0*8.0/x^9.0-a^2.0*5.0/x^6.0-a^2.0*4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap3[1]="a^2.0*2.0*x-1.0/a^3.0*50.0+a^2.0/x^8.0+a^2.0/x^5.0+a^2.0/x^4.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a^2.0*x^2.0-1.0/a^3.0*50.0*x+a^2.0/-7.0/x^7.0+a^2.0/-4.0/x^4.0+a^2.0/-3.0/x^3.0";
        UsageCalculus.EqnSolArrayMap4[1]="a^2.0*x^2.0-1.0/a^3.0*50.0*x-a^2.0/7.0/x^7.0-a^2.0/4.0/x^4.0-a^2.0/3.0/x^3.0";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a^2.0*2.0-1.0/a^3.0*0.0-a^2.0*8.0/x^9.0-a^2.0*5.0/x^6.0-a^2.0*4.0/x^5.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a^2.0*2.0*0.0-1.0/a^3.0*0.0*0.0-a^2.0*8.0*-9.0/x^10.0-a^2.0*5.0*-6.0/x^7.0-a^2.0*4.0*-5.0/x^6.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a^2.0*0.0-1.0/a^3.0*0.0+a^2.0*72.0/x^10.0+a^2.0*30.0/x^7.0+a^2.0*20.0/x^6.0";
        UsageCalculus.EqnSolArrayMap3[2]="a^2.0*x^2.0-1.0/a^3.0*50.0*x-a^2.0/7.0/x^7.0-a^2.0/4.0/x^4.0-a^2.0/3.0/x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a^2.0/3.0*x^3.0-1.0/a^3.0*50.0/2.0*x^2.0-a^2.0/7.0/-6.0/x^6.0-a^2.0/4.0/-3.0/x^3.0-a^2.0/3.0/-2.0/x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a^2.0/3.0*x^3.0-1.0/a^3.0*25.0*x^2.0+a^2.0/42.0/x^6.0+a^2.0/12.0/x^3.0+a^2.0/6.0/x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a^2.0*0.0-1.0/a^3.0*0.0+a^2.0*72.0/x^10.0+a^2.0*30.0/x^7.0+a^2.0*20.0/x^6.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a^2.0*0.0-1.0/a^3.0*0.0*0.0+a^2.0*72.0*-10.0/x^11.0+a^2.0*30.0*-7.0/x^8.0+a^2.0*20.0*-6.0/x^7.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a^2.0*0.0-1.0/a^3.0*0.0-a^2.0*720.0/x^11.0-a^2.0*210.0/x^8.0-a^2.0*120.0/x^7.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a^2.0*0.0-1.0/a^3.0*0.0-a^2.0*720.0/x^11.0-a^2.0*209.99999999999997/x^8.0-a^2.0*120.0/x^7.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a^2.0*0.0-1.0/a^3.0*0.0*0.0-a^2.0*720.0*-11.0/x^12.0-a^2.0*209.99999999999997*-8.0/x^9.0-a^2.0*120.0*-7.0/x^8.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a^2.0*0.0-1.0/a^3.0*0.0+a^2.0*7920.0/x^12.0+a^2.0*1679.9999999999998/x^9.0+a^2.0*840.0/x^8.0";
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
       public static void TestCaseDiff50035() {
        //Test Case 50035
        UsageCalculus.TestCase = 50035;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = " 25*2/a^3 -2*x*a^2+ a^2/x^8 + a^2/x^5 + a^2/x^4 ";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/a^3.0*50.0-a^2.0*2.0*x+a^2.0/x^8.0+a^2.0/x^5.0+a^2.0/x^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/a^3.0*50.0*0.0-a^2.0*2.0+a^2.0*-8.0/x^9.0+a^2.0*-5.0/x^6.0+a^2.0*-4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0/a^3.0*0.0-a^2.0*2.0-a^2.0*8.0/x^9.0-a^2.0*5.0/x^6.0-a^2.0*4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/a^3.0*50.0-a^2.0*2.0*x+a^2.0/x^8.0+a^2.0/x^5.0+a^2.0/x^4.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/a^3.0*50.0*x-a^2.0*x^2.0+a^2.0/-7.0/x^7.0+a^2.0/-4.0/x^4.0+a^2.0/-3.0/x^3.0";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/a^3.0*50.0*x-a^2.0*x^2.0-a^2.0/7.0/x^7.0-a^2.0/4.0/x^4.0-a^2.0/3.0/x^3.0";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0/a^3.0*0.0-a^2.0*2.0-a^2.0*8.0/x^9.0-a^2.0*5.0/x^6.0-a^2.0*4.0/x^5.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "1.0/a^3.0*0.0-a^2.0*2.0*0.0-a^2.0*8.0*-9.0/x^10.0-a^2.0*5.0*-6.0/x^7.0-a^2.0*4.0*-5.0/x^6.0";
        UsageCalculus.EqnSolArrayMap2[2] = "1.0/a^3.0*0.0-a^2.0*0.0+a^2.0*72.0/x^10.0+a^2.0*30.0/x^7.0+a^2.0*20.0/x^6.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/a^3.0*50.0*x-a^2.0*x^2.0-a^2.0/7.0/x^7.0-a^2.0/4.0/x^4.0-a^2.0/3.0/x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/a^3.0*50.0/2.0*x^2.0-a^2.0/3.0*x^3.0-a^2.0/7.0/-6.0/x^6.0-a^2.0/4.0/-3.0/x^3.0-a^2.0*3.0/-2.0/x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/a^3.0*25.0*x^2.0-a^2.0/3.0*x^3.0+a^2.0/42.0/x^6.0+a^2.0/12.0/x^3.0+a^2.0/6.0/x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "1.0/a^3.0*0.0-a^2.0*0.0+a^2.0*72.0/x^10.0+a^2.0*30.0/x^7.0+a^2.0*20.0/x^6.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "1.0/a^3.0*0.0-a^2.0*0.0*0.0+a^2.0*72.0*-10.0/x^11.0+a^2.0*30.0*-7.0/x^8.0+a^2.0*20.0*-6.0/x^7.0";
        UsageCalculus.EqnSolArrayMap2[3] = "1.0/a^3.0*0.0-a^2.0*0.0-a^2.0*720.0/x^11.0-a^2.0*210.0/x^8.0-a^2.0*120.0/x^7.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/a^3.0*25.0*x^2.0-a^2.0/3.0*x^3.0+a^2.0/42.0/x^6.0+a^2.0/12.0/x^3.0+a^2.0/6.0/x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/a^3.0*25.0/3.0*x^3.0-a^2.0/3.0/4.0*x^4.0+a^2.0/42.0/-5.0/x^5.0+a^2.0/12.0/-2.0/x^2.0+a^2.0/6.0/-1.0/x^1.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/a^3.0*8.333333333333334*x^3.0-a^2.0*0.08333333333333333*x^4.0-a^2.0/210.0/x^5.0-a^2.0/24.0/x^2.0-a^2.0/6.0/x";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "1.0/a^3.0*0.0-a^2.0*0.0-a^2.0*720.0/x^11.0-a^2.0*209.99999999999997/x^8.0-a^2.0*120.0/x^7.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-a^2.0*720.0*-11.0/x^12.0-a^2.0*210.0*-8.0/x^9.0-a^2.0*120.0*-7.0/x^8.01.0/a^3.0*0.0-a^2.0*0.0*0.0-a^2.0*720.0*-11.0/x^12.0-a^2.0*209.99999999999997*-8.0/x^9.0-a^2.0*120.0*-7.0/x^8.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1.0/a^3.0*0.0-a^2.0*0.0+a^2.0*7920.0/x^12.0+a^2.0*1679.9999999999998/x^9.0+a^2.0*840.0/x^8.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/a^3.0*8.333333333333334*x^3.0-a^2.0*0.08333333333333333*x^4.0-a^2.0/209.99999999999997/x^5.0-a^2.0/24.0/x^2.0-a^2.0/6.0/x";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/a^3.0*8.333333333333334/4.0*x^4.0-a^2.0*0.08333333333333333/5.0*x^5.0-a^2.0/209.99999999999997/-4.0/x^4.0-a^2.0/24.0/-1.0/x^1.0-a^2.0/6.0*ln(x)";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/a^3.0*2.0833333333333335*x^4.0-a^2.0*0.016666666666666666*x^5.0+a^2.0/839.9999999999999/x^4.0+a^2.0/24.0/x-a^2.0/6.0*ln(x)";
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
       public static void TestCaseDiff50036() {
        //Test Case 50036
        UsageCalculus.TestCase = 50036;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = " 25*2/a^3 -2*a^2*x+ a^2/x^8 + a^2/x^5 + a^2/x^4 +25*2/a^3-2*a^2*x";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 5;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/a^3.0*50.0-a^2.0*2.0*x+a^2.0/x^8.0+a^2.0/x^5.0+a^2.0/x^4.0+1.0/a^3.0*50.0-a^2.0*2.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/a^3.0*50.0*0.0-a^2.0*2.0+a^2.0*-8.0/x^9.0+a^2.0*-5.0/x^6.0+a^2.0*-4.0/x^5.0+1.0/a^3.0*50.0*0.0-a^2.0*2.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0/a^3.0*0.0-a^2.0*2.0-a^2.0*8.0/x^9.0-a^2.0*5.0/x^6.0-a^2.0*4.0/x^5.0+1.0/a^3.0*0.0-a^2.0*2.0";
        UsageCalculus.EqnSolArrayMap3[1] = "1.0/a^3.0*50.0-a^2.0*2.0*x+a^2.0/x^8.0+a^2.0/x^5.0+a^2.0/x^4.0+1.0/a^3.0*50.0-a^2.0*2.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/a^3.0*50.0*x-a^2.0*x^2.0+a^2.0/-7.0/x^7.0+a^2.0/-4.0/x^4.0+a^2.0/-3.0/x^3.0+1.0/a^3.0*50.0*x-a^2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/a^3.0*50.0*x-a^2.0*x^2.0-a^2.0/7.0/x^7.0-a^2.0/4.0/x^4.0-a^2.0/3.0/x^3.0+1.0/a^3.0*50.0*x-a^2.0*x^2.0";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0/a^3.0*0.0-a^2.0*2.0-a^2.0*8.0/x^9.0-a^2.0*5.0/x^6.0-a^2.0*4.0/x^5.0+1.0/a^3.0*0.0-a^2.0*2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "1.0/a^3.0*0.0-a^2.0*2.0*0.0-a^2.0*8.0*-9.0/x^10.0-a^2.0*5.0*-6.0/x^7.0-a^2.0*4.0*-5.0/x^6.0+1.0/a^3.0*0.0*0.0-a^2.0*2.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "1.0/a^3.0*0.0-a^2.0*0.0+a^2.0*72.0/x^10.0+a^2.0*30.0/x^7.0+a^2.0*20.0/x^6.0+1.0/a^3.0*0.0-a^2.0*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/a^3.0*50.0*x-a^2.0*x^2.0-a^2.0/7.0/x^7.0-a^2.0/4.0/x^4.0-a^2.0/3.0/x^3.0+1.0/a^3.0*50.0*x-a^2.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/a^3.0*50.0/2.0*x^2.0-a^2.0/3.0*x^3.0-a^2.0/7.0/-6.0/x^6.0-a^2.0/4.0/-3.0/x^3.0-a^2.0/3.0/-2.0/x^2.0+1.0/a^3.0*50.0/2.0*x^2.0-a^2.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/a^3.0*25.0*x^2.0-a^2.0/3.0*x^3.0+a^2.0/42.0/x^6.0+a^2.0/12.0/x^3.0+a^2.0/6.0/x^2.0+1.0/a^3.0*25.0*x^2.0-a^2.0/3.0*x^3.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "1.0/a^3.0*0.0-a^2.0*0.0+a^2.0*72.0/x^10.0+a^2.0*30.0/x^7.0+a^2.0*20.0/x^6.0+1.0/a^3.0*0.0-a^2.0*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "1.0/a^3.0*0.0-a^2.0*0.0*0.0+a^2.0*72.0*-10.0/x^11.0+a^2.0*30.0*-7.0/x^8.0+a^2.0*20.0*-6.0/x^7.0+1.0/a^3.0*0.0*0.0-a^2.0*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "1.0/a^3.0*0.0-a^2.0*0.0-a^2.0*720.0/x^11.0-a^2.0*210.0/x^8.0-a^2.0*120.0/x^7.0+1.0/a^3.0*0.0-a^2.0*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/a^3.0*25.0*x^2.0-a^2.0/3.0*x^3.0+a^2.0/42.0/x^6.0+a^2.0/12.0/x^3.0+a^2.0/6.0/x^2.0+1.0/a^3.0*25.0*x^2.0-a^2.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/a^3.0*25.0/3.0*x^3.0-a^2.0/3.0/4.0*x^4.0+a^2.0/42.0/-5.0/x^5.0+a^2.0/12.0/-2.0/x^2.0+a^2.0/6.0/-1.0/x^1.0+1.0/a^3.0*25.0/3.0*x^3.0-a^2.0/3.0/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/a^3.0*8.333333333333334*x^3.0-a^2.0*0.08333333333333333*x^4.0-a^2.0/210.0/x^5.0-a^2.0/24.0/x^2.0-a^2.0/6.0/x+1.0/a^3.0*8.333333333333334*x^3.0-a^2.0/12.0*x^4.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "1.0/a^3.0*0.0-a^2.0*0.0-a^2.0*720.0/x^11.0-a^2.0*209.99999999999997/x^8.0-a^2.0*120.0/x^7.0+1.0/a^3.0*0.0-a^2.0*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "1.0/a^3.0*0.0-a^2.0*0.0*0.0-a^2.0*720.0*-11.0/x^12.0-a^2.0*209.99999999999997*-8.0/x^9.0-a^2.0*120.0*-7.0/x^8.0+1.0/a^3.0*0.0*0.0-a^2.0*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1.0/a^3.0*0.0-a^2.0*0.0+a^2.0*7920.0/x^12.0+a^2.0*1679.9999999999998/x^9.0+a^2.0*840.0/x^8.0+1.0/a^3.0*0.0-a^2.0*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/a^3.0*8.333333333333334*x^3.0-a^2.0*0.08333333333333333*x^4.0-a^2.0/209.99999999999997/x^5.0-a^2.0/24.0/x^2.0-a^2.0/6.0/x+1.0/a^3.0*8.333333333333334*x^3.0-a^2.0/12.0*x^4.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/a^3.0*8.333333333333334/4.0*x^4.0-a^2.0*0.08333333333333333/5.0*x^5.0-a^2.0/209.99999999999997/-4.0/x^4.0-a^2.0/24.0/-1.0/x^1.0-a^2.0*6.0*ln(x)+1.0/a^3.0*8.333333333333334/4.0*x^4.0-a^2.0/12.0/5.0*x^5.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/a^3.0*2.0833333333333335*x^4.0-a^2.0*0.016666666666666666*x^5.0+a^2.0/839.9999999999999/x^4.0+a^2.0/24.0/x-a^2.0*6.0*ln(x)+1.0/a^3.0*2.0833333333333335*x^4.0-a^2.0/60.0*x^5.0";
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
       public static void TestCaseDiff50037() {
        //Test Case 50037
        UsageCalculus.TestCase = 50037;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "- 25*(2) - 2/a/x + a/x^8 + a/x^5 + a/x^4 - 2/a/x- 25*(2)";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-50.0-1.0/a*2.0/x+a/x^8.0+a/x^5.0+a/x^4.0-1.0/a*2.0/x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0+1.0/a*2.0/x^2.0+a*-8.0/x^9.0+a*-5.0/x^6.0+a*-4.0/x^5.0+1.0/a*2.0/x^2.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0/a*2.0/x^2.0-a*8.0/x^9.0-a*5.0/x^6.0-a*4.0/x^5.0+1.0/a*2.0/x^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="-50.0-1.0/a*2.0/x+a/x^8.0+a/x^5.0+a/x^4.0-1.0/a*2.0/x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-50.0*x-1.0/a*2.0*ln(x)+a/-7.0/x^7.0+a/-4.0/x^4.0+a/-3.0/x^3.0-1.0/a*2.0*ln(x)-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="-50.0*x-1.0/a*2.0*ln(x)-a/7.0/x^7.0-a/4.0/x^4.0-a/3.0/x^3.0-1.0/a*2.0*ln(x)-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0/a*2.0/x^2.0-a*8.0/x^9.0-a*5.0/x^6.0-a*4.0/x^5.0+1.0/a*2.0/x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "1.0/a*2.0*-2.0/x^3.0-a*8.0*-9.0/x^10.0-a*5.0*-6.0/x^7.0-a*4.0*-5.0/x^6.0+1.0/a*2.0*-2.0/x^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-1.0/a*4.0/x^3.0+a*72.0/x^10.0+a*30.0/x^7.0+a*20.0/x^6.0-1.0/a*4.0/x^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-1.0/a*4.0/x^3.0+a*72.0/x^10.0+a*30.0/x^7.0+a*20.0/x^6.0-1.0/a*4.0/x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-1.0/a*4.0*-3.0/x^4.0+a*72.0*-10.0/x^11.0+a*30.0*-7.0/x^8.0+a*20.0*-6.0/x^7.0-1.0/a*4.0*-3.0/x^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "1.0/a*12.0/x^4.0-a*720.0/x^11.0-a*210.0/x^8.0-a*120.0/x^7.0+1.0/a*12.0/x^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "1.0/a*12.0/x^4.0-a*720.0/x^11.0-a*209.99999999999997/x^8.0-a*120.0/x^7.0+1.0/a*12.0/x^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "1.0/a*12.0*-4.0/x^5.0-a*720.0*-11.0/x^12.0-a*209.99999999999997*-8.0/x^9.0-a*120.0*-7.0/x^8.0+1.0/a*12.0*-4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-1.0/a*48.0/x^5.0+a*7920.0/x^12.0+a*1679.9999999999998/x^9.0+a*840.0/x^8.0-1.0/a*48.0/x^5.0";
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
       public static void TestCaseDiff50038() {
        //Test Case 50038
        UsageCalculus.TestCase = 50038;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "a*0.0-25";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a*0.0-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a*0.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="a*0.0-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="0.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a*0.0";
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
       public static void TestCaseDiff50039() {
        //Test Case 50039
        UsageCalculus.TestCase = 50039;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "a*1.0-25";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a*0.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="a-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a*x-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a*x-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a*x-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a/2.0*x^2.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a/2.0*x^2.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a/2.0*x^2.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a/2.0/3.0*x^3.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a/6.0*x^3.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a/6.0*x^3.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a/6.0/4.0*x^4.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a/24.0*x^4.0-1.0416666666666667*x^4.0";
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
       
       
       public static void TestCaseDiff50040() {
        //Test Case 50040
        UsageCalculus.TestCase = 50040;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "Xn^5+c";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "Xn";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "Xn^5.0+c";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "5.0*Xn^4.0+c*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "5.0*Xn^4.0+c*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="Xn^5.0+c";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/6.0*Xn^6.0+c*Xn";
        UsageCalculus.EqnSolArrayMap4[1]="0.16666666666666666*Xn^6.0+c*Xn";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "5.0*Xn^4.0+c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "5.0*4.0*Xn^3.0+c*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "20.0*Xn^3.0+c*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="0.16666666666666666*Xn^6.0+c*Xn";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="0.16666666666666666/7.0*Xn^7.0+c/2.0*Xn^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="0.023809523809523808*Xn^7.0+c/2.0*Xn^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "20.0*Xn^3.0+c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "20.0*3.0*Xn^2.0+c*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "60.0*Xn^2.0+c*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="0.023809523809523808*Xn^7.0+c/2.0*Xn^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="0.023809523809523808/8.0*Xn^8.0+c*2.0/3.0*Xn^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="0.002976190476190476*Xn^8.0+c/6.0*Xn^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "60.0*Xn^2.0+c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "60.0*2.0*Xn^1.0+c*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "120.0*Xn+c*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="0.002976190476190476*Xn^8.0+c/6.0*Xn^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="0.002976190476190476/9.0*Xn^9.0+c/6.0/4.0*Xn^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="3.3068783068783067E-4*Xn^9.0+c/24.0*Xn^4.0";
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
       public static void TestCaseDiff50041() {
        //Test Case 50041
        UsageCalculus.TestCase = 50041;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*Xn^5+c";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "Xn";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "Xn^5.0+c";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "5.0*Xn^4.0+c*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "5.0*Xn^4.0+c*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="Xn^5.0+c";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/6.0*Xn^6.0+c*Xn";
        UsageCalculus.EqnSolArrayMap4[1]="0.16666666666666666*Xn^6.0+c*Xn";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "5.0*Xn^4.0+c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "5.0*4.0*Xn^3.0+c*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "20.0*Xn^3.0+c*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="0.16666666666666666*Xn^6.0+c*Xn";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="0.16666666666666666/7.0*Xn^7.0+c/2.0*Xn^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="0.023809523809523808*Xn^7.0+c/2.0*Xn^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "20.0*Xn^3.0+c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "20.0*3.0*Xn^2.0+c*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "60.0*Xn^2.0+c*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="0.023809523809523808*Xn^7.0+c/2.0*Xn^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="0.023809523809523808/8.0*Xn^8.0+c/2.0/3.0*Xn^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="0.002976190476190476*Xn^8.0+c/6.0*Xn^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "60.0*Xn^2.0+c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "60.0*2.0*Xn^1.0+c*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "120.0*Xn+c*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="0.002976190476190476*Xn^8.0+c/6.0*Xn^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="0.002976190476190476/9.0*Xn^9.0+c/6.0/4.0*Xn^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="3.3068783068783067E-4*Xn^9.0+c/24.0*Xn^4.0";
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
       public static void TestCaseDiff50042() {
        //Test Case 50042
        UsageCalculus.TestCase = 50042;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "m*Xn+c";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "Xn";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "m*Xn+c";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "m+c*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "m+c*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="m*Xn+c";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="m/2.0*Xn^2.0+c*Xn";
        UsageCalculus.EqnSolArrayMap4[1]="m/2.0*Xn^2.0+c*Xn";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "m+c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "m*0.0+c*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "m*0.0+c*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="m/2.0*Xn^2.0+c*Xn";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="m/2.0/3.0*Xn^3.0+c/2.0*Xn^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="m*0.16666666666666666*Xn^3.0+c/2.0*Xn^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "m*0.0+c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "m*0.0+c*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "m*0.0+c*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="m*0.16666666666666666*Xn^3.0+c/2.0*Xn^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="m*0.16666666666666666/4.0*Xn^4.0+c/2.0/3.0*Xn^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="m*0.041666666666666664*Xn^4.0+c/6.0*Xn^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "m*0.0+c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "m*0.0+c*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "m*0.0+c*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="m*0.041666666666666664*Xn^4.0+c/6.0*Xn^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="m*0.041666666666666664/5.0*Xn^5.0+c/6.0/4.0*Xn^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="m*0.008333333333333333*Xn^5.0+c/24.0*Xn^4.0";
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
//           public static void TestCaseDiff50043() {
//        //Test Case 50043
//        UsageCalculus.TestCase = 50043;
//        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
//        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
//        UsageCalculus.EqnUnderTest = "(y/m-c/m)^0.2";
//        UsageCalculus.TestCaseName = "Simple: IndConstant";
//        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
//        
//        UsageCalculus.DiffWithRespTo = "y";
//        UsageCalculus.MaxDiffOrder = 14;
//        UsageCalculus.MaxIntegreOrder = 14;
//        
//        UsageCalculus.EqnSolArrayMap1[1] = "(y/m-c/m)^0.2";
//        UsageCalculus.EqnSolArrayDiffAlone[1] = "m+0.0";
//        UsageCalculus.EqnSolArrayMap2[1] = "m";
//        UsageCalculus.EqnSolArrayMap3[1]="m*Xn+c";
//        UsageCalculus.EqnSolArrayIntegrAlone[1]="m/2.0*Xn^2.0+c*Xn";
//        UsageCalculus.EqnSolArrayMap4[1]="m/2.0*Xn^2.0+c*Xn";
//        UsageCalculus.EqnSolOrder[1] = 1;
//
//        UsageCalculus.EqnSolArrayMap1[2] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
//        UsageCalculus.EqnSolArrayMap2[2] = "";
//        UsageCalculus.EqnSolArrayMap3[2]="";
//        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
//        UsageCalculus.EqnSolArrayMap4[2]="";
//        UsageCalculus.EqnSolOrder[2] = 2;
//
//        UsageCalculus.EqnSolArrayMap1[3] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
//        UsageCalculus.EqnSolArrayMap2[3] = "";
//        UsageCalculus.EqnSolArrayMap3[3]="";
//        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
//        UsageCalculus.EqnSolArrayMap4[3]="";
//        UsageCalculus.EqnSolOrder[3] = 3;
//
//        UsageCalculus.EqnSolArrayMap1[4] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
//        UsageCalculus.EqnSolArrayMap2[4] = "";
//        UsageCalculus.EqnSolArrayMap3[4]="";
//        UsageCalculus.EqnSolArrayIntegrAlone[4]="";
//        UsageCalculus.EqnSolArrayMap4[4]="";
//        UsageCalculus.EqnSolOrder[4] = 4;
//        
//        UsageCalculus.EqnSolArrayMap1[5] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[5] = "";
//        UsageCalculus.EqnSolArrayMap2[5] = "";
//        UsageCalculus.EqnSolArrayMap3[5]="";
//        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
//        UsageCalculus.EqnSolArrayMap4[5]="";
//        UsageCalculus.EqnSolOrder[5] = 5;
//
//        UsageCalculus.EqnSolArrayMap1[6] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[6] = "";
//        UsageCalculus.EqnSolArrayMap2[6] = "";
//        UsageCalculus.EqnSolArrayMap3[6]="";
//        UsageCalculus.EqnSolArrayIntegrAlone[6]="";
//        UsageCalculus.EqnSolArrayMap4[6]="";
//        UsageCalculus.EqnSolOrder[6] = 6;
//
//        UsageCalculus.EqnSolArrayMap1[7] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[7] = "";
//        UsageCalculus.EqnSolArrayMap2[7] = "";
//        UsageCalculus.EqnSolArrayMap3[7]="";
//        UsageCalculus.EqnSolArrayIntegrAlone[7]="";
//        UsageCalculus.EqnSolArrayMap4[7]="";
//        UsageCalculus.EqnSolOrder[7] = 7;
//
//        UsageCalculus.EqnSolArrayMap1[8] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[8] = "";
//        UsageCalculus.EqnSolArrayMap2[8] = "";
//        UsageCalculus.EqnSolOrder[8] = 8;
//
//        UsageCalculus.EqnSolArrayMap1[9] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[9] = "";
//        UsageCalculus.EqnSolArrayMap2[9] = "";
//        UsageCalculus.EqnSolOrder[9] = 9;
//
//        UsageCalculus.EqnSolArrayMap1[10] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[10] = "";
//        UsageCalculus.EqnSolArrayMap2[10] = "";
//        UsageCalculus.EqnSolOrder[10] = 10;
//
//        UsageCalculus.EqnSolArrayMap1[11] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[11] = "";
//        UsageCalculus.EqnSolArrayMap2[11] = "";
//        UsageCalculus.EqnSolOrder[11] = 11;
//
//        UsageCalculus.EqnSolArrayMap1[12] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[12] = "";
//        UsageCalculus.EqnSolArrayMap2[12] = "";
//        UsageCalculus.EqnSolOrder[12] = 12;
//
//        UsageCalculus.EqnSolArrayMap1[13] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[13] = "";
//        UsageCalculus.EqnSolArrayMap2[13] = "";
//        UsageCalculus.EqnSolOrder[13] = 13;
//
//        UsageCalculus.EqnSolArrayMap1[14] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[14] = "";
//        UsageCalculus.EqnSolArrayMap2[14] = "";
//        UsageCalculus.EqnSolOrder[14] = 14;
//    }   
/* ********************************************************* */
/* *************************** a^x && x^a equations Begin ** */
/* ********************************************************* */
           public static void TestCaseDiff50044() {
        //Test Case 50044
        UsageCalculus.TestCase = 50044;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^a*x^8 + x^a*x^5 + x^a*x^4 - 2*x*x^a- 25*2*x^a";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "";
        UsageCalculus.EqnSolArrayMap2[1] = "";
        UsageCalculus.EqnSolArrayMap3[1]="";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="";
        UsageCalculus.EqnSolArrayMap4[1]="";
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
           public static void TestCaseDiff50045() {
        //Test Case 50045
        UsageCalculus.TestCase = 50045;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "a^x*x^8 + a^x*x^5 + a^x*x^4 - 2*x*a^x- 25*(2)*a^x";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 3;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "";
        UsageCalculus.EqnSolArrayMap2[1] = "";
        UsageCalculus.EqnSolArrayMap3[1]="x^8.0*a^x+x^5.0*a^x+x^4.0*a^x-a*2.0*x-a*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="";
        UsageCalculus.EqnSolArrayMap4[1]="";
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
       public static void TestCaseDiff50046() {
        //Test Case 50046
        UsageCalculus.TestCase = 50046;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^a*x^8 + x^a*x^5 + x^a*x^4 - 2*x*x^a- 25*(2)*x^a";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "";
        UsageCalculus.EqnSolArrayMap2[1] = "";
        UsageCalculus.EqnSolArrayMap3[1]="";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="";
        UsageCalculus.EqnSolArrayMap4[1]="";
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
       public static void TestCaseDiff50047() {
        //Test Case 50047
        UsageCalculus.TestCase = 50047;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*a^x + x^5*a^x*x^5 + x^4*a^x - 2*a^x*x- a^x*25*(2)";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^8.0*a^x+x^10.0*a^x+x^4.0*a^x-1.0*2.0*x-2.0*a^x";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-25";
        UsageCalculus.EqnSolArrayMap2[1] = "-25";
        UsageCalculus.EqnSolArrayMap3[1]="-25";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-25";
        UsageCalculus.EqnSolArrayMap4[1]="-25";
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
       public static void TestCaseDiff50048() {
        //Test Case 50048
        UsageCalculus.TestCase = 50048;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*x^8*a^x + x^5*a^x*x^5 + x^4*a^x - 2*a^x*x- a^x*25*(2)*1.0";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "";
        UsageCalculus.EqnSolArrayMap2[1] = "";
        UsageCalculus.EqnSolArrayMap3[1]="";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="";
        UsageCalculus.EqnSolArrayMap4[1]="";
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
       public static void TestCaseDiff50049() {
        //Test Case 50049
        UsageCalculus.TestCase = 50049;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "a^x*x^8 + a^x*x^5 + a^x*x^4 - 2*x*a^x- 25*2*a^x";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 3;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^8.0*a^x+x^5.0*a^x+x^4.0*a^x-2.0*x*a^x-50.0*a^x";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "ln(x)*x^8.0*a^x+x^5.0*a^x+x^4.0*a^x-2.0*x*a^x-50.0*a^x";
        UsageCalculus.EqnSolArrayMap2[1] = "";
        UsageCalculus.EqnSolArrayMap3[1]="";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="";
        UsageCalculus.EqnSolArrayMap4[1]="";
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
/* ********************************************************* */
/* *************************** a^x && x^a equations End ** */
/* ********************************************************* */
/* ********************************************************* */
/* *************************** 2^a equations Begin ** */
/* ********************************************************* */
  public static void TestCaseDiff50050() {
        //Test Case 50050
        UsageCalculus.TestCase = 50050;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values Except 4th Order Integration";
        UsageCalculus.EqnUnderTest = "1.0/1.0*p/9.0*xyc1^9.0 + p*6.0*xyc1^6.0 + p/5.0*xyc1^5.0 + p*2.0*xyc1^2.0 + p*25.0*xyc1 + p*50.0";
        UsageCalculus.TestCaseName = "Standard:Independent Constant:Basic Equation:Divide Operator";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "p*0.1111111111111111*xyc1^9.0+p*6.0*xyc1^6.0+p/5.0*xyc1^5.0+p*2.0*xyc1^2.0+p*25.0*xyc1+p*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "p*0.1111111111111111*9.0*xyc1^8.0+p*6.0*6.0*xyc1^5.0+p/5.0*5.0*xyc1^4.0+p*2.0*2.0*xyc1^1.0+p*25.0+p*50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "p*xyc1^8.0+p*36.0*xyc1^5.0+p*xyc1^4.0+p*4.0*xyc1+p*25.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="p*0.1111111111111111*xyc1^9.0+p*6.0*xyc1^6.0+p/5.0*xyc1^5.0+p*2.0*xyc1^2.0+p*25.0*xyc1+p*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="p*0.1111111111111111/10.0*xyc1^10.0+p*6.0/7.0*xyc1^7.0+p/5.0/6.0*xyc1^6.0+p*2.0/3.0*xyc1^3.0+p*25.0/2.0*xyc1^2.0+p*50.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="p*0.01111111111111111*xyc1^10.0+p*0.8571428571428571*xyc1^7.0+p*0.03333333333333333*xyc1^6.0+p*0.6666666666666666*xyc1^3.0+p*12.5*xyc1^2.0+p*50.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "p*xyc1^8.0+p*36.0*xyc1^5.0+p*xyc1^4.0+p*4.0*xyc1+p*25.0+p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "p*8.0*xyc1^7.0+p*36.0*5.0*xyc1^4.0+p*4.0*xyc1^3.0+p*4.0+p*25.0*0.0+p*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "p*8.0*xyc1^7.0+p*180.0*xyc1^4.0+p*4.0*xyc1^3.0+p*4.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="p*0.01111111111111111*xyc1^10.0+p*0.8571428571428571*xyc1^7.0+p*0.03333333333333333*xyc1^6.0+p*0.6666666666666666*xyc1^3.0+p*12.5*xyc1^2.0+p*50.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="p*0.01111111111111111/11.0*xyc1^11.0+p*0.8571428571428571/8.0*xyc1^8.0+p*0.03333333333333333/7.0*xyc1^7.0+p*0.6666666666666666/4.0*xyc1^4.0+p*12.5/3.0*xyc1^3.0+p*50.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="p*0.0010101010101010099*xyc1^11.0+p*0.10714285714285714*xyc1^8.0+p*0.0047619047619047615*xyc1^7.0+p*0.16666666666666666*xyc1^4.0+p*4.166666666666667*xyc1^3.0+p*25.0*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "p*8.0*xyc1^7.0+p*180.0*xyc1^4.0+p*4.0*xyc1^3.0+p*4.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "p*8.0*7.0*xyc1^6.0+p*180.0*4.0*xyc1^3.0+p*4.0*3.0*xyc1^2.0+p*4.0*0.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "p*56.0*xyc1^6.0+p*720.0*xyc1^3.0+p*12.0*xyc1^2.0+p*0.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="p*0.0010101010101010099*xyc1^11.0+p*0.10714285714285714*xyc1^8.0+p*0.0047619047619047615*xyc1^7.0+p*0.16666666666666666*xyc1^4.0+p*4.166666666666667*xyc1^3.0+p*25.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="p*0.0010101010101010099/12.0*xyc1^12.0+p*0.10714285714285714/9.0*xyc1^9.0+p*0.0047619047619047615/8.0*xyc1^8.0+p*0.16666666666666666/5.0*xyc1^5.0+p*4.166666666666667/4.0*xyc1^4.0+p*25.0/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="p*8.417508417508415E-5*xyc1^12.0+p*0.011904761904761904*xyc1^9.0+p*5.952380952380952E-4*xyc1^8.0+p*0.03333333333333333*xyc1^5.0+p*1.0416666666666667*xyc1^4.0+p*8.333333333333334*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "p*56.0*xyc1^6.0+p*720.0*xyc1^3.0+p*12.0*xyc1^2.0+p*0.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "p*56.0*6.0*xyc1^5.0+p*720.0*3.0*xyc1^2.0+p*12.0*2.0*xyc1^1.0+p*0.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "p*336.0*xyc1^5.0+p*2160.0*xyc1^2.0+p*24.0*xyc1+p*0.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="p*8.417508417508415E-5*xyc1^12.0+p*0.011904761904761904*xyc1^9.0+p*5.952380952380952E-4*xyc1^8.0+p*0.03333333333333333*xyc1^5.0+p*1.0416666666666667*xyc1^4.0+p*8.333333333333334*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="p*8.417508417508415E-5/13.0*xyc1^13.0+p*0.011904761904761904/10.0*xyc1^10.0+p*5.952380952380952E-4/9.0*xyc1^9.0+p*0.03333333333333333/6.0*xyc1^6.0+p*1.0416666666666667/5.0*xyc1^5.0+p*8.333333333333334/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="p*6.475006475006474E-6*xyc1^13.0+p*0.0011904761904761904*xyc1^10.0+p*6.613756613756613E-5*xyc1^9.0+p*0.005555555555555556*xyc1^6.0+p*0.20833333333333334*xyc1^5.0+p*2.0833333333333335*xyc1^4.0";
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
          public static void TestCaseDiff50051() {
        //Test Case 50051
        UsageCalculus.TestCase = 50051;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0/1.0*a*x^8 + a*x^5 + a*x^4 - 2*a*x- 25*(2)";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a*x^8.0+a*x^5.0+a*x^4.0-a*2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a*8.0*x^7.0+a*5.0*x^4.0+a*4.0*x^3.0-a*2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a*8.0*x^7.0+a*5.0*x^4.0+a*4.0*x^3.0-a*2.0";
        UsageCalculus.EqnSolArrayMap3[1]="a*x^8.0+a*x^5.0+a*x^4.0-a*2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a/9.0*x^9.0+a/6.0*x^6.0+a/5.0*x^5.0-a*x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a/9.0*x^9.0+a/6.0*x^6.0+a/5.0*x^5.0-a*x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a*8.0*x^7.0+a*5.0*x^4.0+a*4.0*x^3.0-a*2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a*8.0*7.0*x^6.0+a*5.0*4.0*x^3.0+a*4.0*3.0*x^2.0-a*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a*56.0*x^6.0+a*20.0*x^3.0+a*12.0*x^2.0-a*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a/9.0*x^9.0+a/6.0*x^6.0+a/5.0*x^5.0-a*x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a/9.0/10.0*x^10.0+a/6.0/7.0*x^7.0+a/5.0/6.0*x^6.0-a/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a*0.011111111111111112*x^10.0+a*0.023809523809523808*x^7.0+a*0.03333333333333333*x^6.0-a/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a*56.0*x^6.0+a*20.0*x^3.0+a*12.0*x^2.0-a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a*56.0*6.0*x^5.0+a*20.0*3.0*x^2.0+a*12.0*2.0*x^1.0-a*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a*336.0*x^5.0+a*60.0*x^2.0+a*24.0*x-a*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a*0.011111111111111112*x^10.0+a*0.023809523809523808*x^7.0+a*0.03333333333333333*x^6.0-a/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a*0.011111111111111112/11.0*x^11.0+a*0.023809523809523808/8.0*x^8.0+a*0.03333333333333333/7.0*x^7.0-a/3.0/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a*0.00101010101010101*x^11.0+a*0.002976190476190476*x^8.0+a*0.0047619047619047615*x^7.0-a/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a*336.0*x^5.0+a*60.0*x^2.0+a*24.0*x-a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a*336.0*5.0*x^4.0+a*60.0*2.0*x^1.0+a*24.0-a*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a*1680.0*x^4.0+a*120.0*x+a*24.0-a*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a*0.00101010101010101*x^11.0+a*0.002976190476190476*x^8.0+a*0.0047619047619047615*x^7.0-a/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a*0.00101010101010101/12.0*x^12.0+a*0.002976190476190476/9.0*x^9.0+a*0.0047619047619047615/8.0*x^8.0-a/12.0/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a*8.417508417508418E-5*x^12.0+a*3.3068783068783067E-4*x^9.0+a*5.952380952380952E-4*x^8.0-a/60.0*x^5.0-2.0833333333333335*x^4.0";
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
       
       public static void TestCaseDiff50052() {
        //Test Case 50052
        UsageCalculus.TestCase = 50052;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*2^a*x^8 + 2^a*x^5 + 2^a*x^4 - 2*x*2^a- 25*2*3^a*1.0";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "2.0^a*x^8.0+2.0^a*x^5.0+2.0^a*x^4.0-2.0^a*2.0*x-3.0^a*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "2.0^a*8.0*x^7.0+2.0^a*5.0*x^4.0+2.0^a*4.0*x^3.0-2.0^a*2.0-3.0^a*50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "2.0^a*8.0*x^7.0+2.0^a*5.0*x^4.0+2.0^a*4.0*x^3.0-2.0^a*2.0-3.0^a*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="2.0^a*x^8.0+2.0^a*x^5.0+2.0^a*x^4.0-2.0^a*2.0*x-3.0^a*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="2.0^a/9.0*x^9.0+2.0^a/6.0*x^6.0+2.0^a/5.0*x^5.0-2.0^a*2.0/2.0*x^2.0-3.0^a*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="2.0^a/9.0*x^9.0+2.0^a/6.0*x^6.0+2.0^a/5.0*x^5.0-2.0^a*x^2.0-3.0^a*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "2.0^a*8.0*x^7.0+2.0^a*5.0*x^4.0+2.0^a*4.0*x^3.0-2.0^a*2.0-3.0^a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "2.0^a*8.0*7.0*x^6.0+2.0^a*5.0*4.0*x^3.0+2.0^a*4.0*3.0*x^2.0-2.0^a*2.0*0.0-3.0^a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "2.0^a*56.0*x^6.0+2.0^a*20.0*x^3.0+2.0^a*12.0*x^2.0-2.0^a*0.0-3.0^a*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="2.0^a/9.0*x^9.0+2.0^a/6.0*x^6.0+2.0^a/5.0*x^5.0-2.0^a*x^2.0-3.0^a*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="2.0^a/9.0/10.0*x^10.0+2.0^a/6.0/7.0*x^7.0+2.0^a/5.0/6.0*x^6.0-2.0^a/3.0*x^3.0-3.0^a*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="2.0^a/90.0*x^10.0+2.0^a/42.0*x^7.0+2.0^a/30.0*x^6.0-2.0^a/3.0*x^3.0-3.0^a*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "2.0^a*56.0*x^6.0+2.0^a*20.0*x^3.0+2.0^a*12.0*x^2.0-2.0^a*0.0-3.0^a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "2.0^a*56.0*6.0*x^5.0+2.0^a*20.0*3.0*x^2.0+2.0^a*12.0*2.0*x^1.0-2.0^a*0.0*0.0-3.0^a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "2.0^a*336.0*x^5.0+2.0^a*60.0*x^2.0+2.0^a*24.0*x-2.0^a*0.0-3.0^a*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="2.0^a/90.0*x^10.0+2.0^a/42.0*x^7.0+2.0^a/30.0*x^6.0-2.0^a/3.0*x^3.0-3.0^a*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="2.0^a/90.0/11.0*x^11.0+2.0^a/42.0/8.0*x^8.0+2.0^a/30.0/7.0*x^7.0-2.0^a/3.0/4.0*x^4.0-3.0^a*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="2.0^a/990.0*x^11.0+2.0^a/336.0*x^8.0+2.0^a/210.0*x^7.0-2.0^a/12.0*x^4.0-3.0^a*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "2.0^a*336.0*x^5.0+2.0^a*60.0*x^2.0+2.0^a*24.0*x-2.0^a*0.0-3.0^a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "2.0^a*336.0*5.0*x^4.0+2.0^a*60.0*2.0*x^1.0+2.0^a*24.0-2.0^a*0.0*0.0-3.0^a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "2.0^a*1680.0*x^4.0+2.0^a*120.0*x+2.0^a*24.0-2.0^a*0.0-3.0^a*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="2.0^a/990.0*x^11.0+2.0^a/336.0*x^8.0+2.0^a/210.0*x^7.0-2.0^a/12.0*x^4.0-3.0^a*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="2.0^a/990.0/12.0*x^12.0+2.0^a/336.0/9.0*x^9.0+2.0^a/210.0/8.0*x^8.0-2.0^a/12.0/5.0*x^5.0-3.0^a*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="2.0^a/11880.0*x^12.0+2.0^a/3024.0*x^9.0+2.0^a/1680.0*x^8.0-2.0^a/60.0*x^5.0-3.0^a*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff50053() {
        //Test Case 50053
        UsageCalculus.TestCase = 50053;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "2.0/2.0*1.0*1.0*a^2*x^8 + a^2*x^5 + a^2*x^4 - 2*x*a^2- 25*2*a^3*1.0*1.0*";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a^2.0*x^8.0+a^2.0*x^5.0+a^2.0*x^4.0-a^2.0*2.0*x-a^3.0*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a^2.0*8.0*x^7.0+a^2.0*5.0*x^4.0+a^2.0*4.0*x^3.0-a^2.0*2.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a^2.0*8.0*x^7.0+a^2.0*5.0*x^4.0+a^2.0*4.0*x^3.0-a^2.0*2.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[1]=  "a^2.0*x^8.0+a^2.0*x^5.0+a^2.0*x^4.0-a^2.0*2.0*x-a^3.0*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a^2.0/9.0*x^9.0+a^2.0/6.0*x^6.0+a^2.0/5.0*x^5.0-a^2.0*x^2.0-a^3.0*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a^2.0/9.0*x^9.0+a^2.0/6.0*x^6.0+a^2.0/5.0*x^5.0-a^2.0*x^2.0-a^3.0*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a^2.0*8.0*x^7.0+a^2.0*5.0*x^4.0+a^2.0*4.0*x^3.0-a^2.0*2.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a^2.0*8.0*7.0*x^6.0+a^2.0*5.0*4.0*x^3.0+a^2.0*4.0*3.0*x^2.0-a^2.0*2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a^2.0*56.0*x^6.0+a^2.0*20.0*x^3.0+a^2.0*12.0*x^2.0-a^2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a^2.0/9.0*x^9.0+a^2.0/6.0*x^6.0+a^2.0/5.0*x^5.0-a^2.0*x^2.0-a^3.0*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a^2.0/9.0/10.0*x^10.0+a^2.0/6.0/7.0*x^7.0+a^2.0/5.0/6.0*x^6.0-a^2.0/3.0*x^3.0-a^3.0*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a^2.0*0.011111111111111112*x^10.0+a^2.0*0.023809523809523808*x^7.0+a^2.0*0.03333333333333333*x^6.0-a^2.0/3.0*x^3.0-a^3.0*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a^2.0*56.0*x^6.0+a^2.0*20.0*x^3.0+a^2.0*12.0*x^2.0-a^2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a^2.0*56.0*6.0*x^5.0+a^2.0*20.0*3.0*x^2.0+a^2.0*12.0*2.0*x^1.0-a^2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a^2.0*336.0*x^5.0+a^2.0*60.0*x^2.0+a^2.0*24.0*x-a^2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a^2.0*0.011111111111111112*x^10.0+a^2.0*0.023809523809523808*x^7.0+a^2.0*0.03333333333333333*x^6.0-a^2.0/3.0*x^3.0-a^3.0*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a^2.0*0.011111111111111112/11.0*x^11.0+a^2.0*0.023809523809523808/8.0*x^8.0+a^2.0*0.03333333333333333/7.0*x^7.0-a^2.0/3.0/4.0*x^4.0-a^3.0*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a^2.0*0.00101010101010101*x^11.0+a^2.0*0.002976190476190476*x^8.0+a^2.0*0.0047619047619047615*x^7.0-a^2.0*0.08333333333333333*x^4.0-a^3.0*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a^2.0*336.0*x^5.0+a^2.0*60.0*x^2.0+a^2.0*24.0*x-a^2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a^2.0*336.0*5.0*x^4.0+a^2.0*60.0*2.0*x^1.0+a^2.0*24.0-a^2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a^2.0*1680.0*x^4.0+a^2.0*120.0*x+a^2.0*24.0-a^2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a^2.0*0.00101010101010101*x^11.0+a^2.0*0.002976190476190476*x^8.0+a^2.0*0.0047619047619047615*x^7.0-a^2.0*0.08333333333333333*x^4.0-a^3.0*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a^2.0*0.00101010101010101/12.0*x^12.0+a^2.0*0.002976190476190476/9.0*x^9.0+a^2.0*0.0047619047619047615/8.0*x^8.0-a^2.0*0.08333333333333333/5.0*x^5.0-a^3.0*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a^2.0*8.417508417508418E-5*x^12.0+a^2.0*3.3068783068783067E-4*x^9.0+a^2.0*5.952380952380952E-4*x^8.0-a^2.0*0.016666666666666666*x^5.0-a^3.0*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff50054() {
        //Test Case 50054
        UsageCalculus.TestCase = 50054;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "2.0/2.0*2^x*x^8 + 2^x*x^5 + 2^x*x^4 - 2*x*2^x- 25*2*3^x";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 2;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^8.0*2.0^x+x^5.0*2.0^x+x^4.0*2.0^x-2.0*x*2.0^x-50.0*3.0^x";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "2.0^x*8.0*x^7.0+ln(2.0)*2.0^x*x^8.0+2.0^x*5.0*x^4.0+ln(2.0)*2.0^x*x^5.0+2.0^x*4.0*x^3.0+ln(2.0)*2.0^x*x^4.0-2.0^x*2.0+ln(2.0)*2.0^x*2.0*x-50.0*ln(3.0)*3.0^x";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*x^7.0*2.0^x+ln(2.0)*2.0^x+5.0*x^4.0*2.0^x+ln(2.0)*2.0^x+4.0*x^3.0*2.0^x+ln(2.0)*2.0^x-2.0*2.0^x+2.0*ln(2.0)*2.0^x-50.0*ln(3.0)*3.0^x";
        UsageCalculus.EqnSolArrayMap3[1]="x^8.0*2.0^x+x^5.0*2.0^x+x^4.0*2.0^x-2.0*x*2.0^x-50.0*3.0^x";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="";
        UsageCalculus.EqnSolArrayMap4[1]="";
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
       
       
       public static void TestCaseDiff50055() {
        //Test Case 50055
        UsageCalculus.TestCase = 50055;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "2.0/2.0*a^b*x^8 + a^b*x^5 + a^b*x^4 - 2*x*a^b- 25*2*a^b";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a^b*x^8.0+a^b*x^5.0+a^b*x^4.0-a^b*2.0*x-a^b*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a^b*8.0*x^7.0+a^b*5.0*x^4.0+a^b*4.0*x^3.0-a^b*2.0-a^b*50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a^b*8.0*x^7.0+a^b*5.0*x^4.0+a^b*4.0*x^3.0-a^b*2.0-a^b*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="a^b*x^8.0+a^b*x^5.0+a^b*x^4.0-a^b*2.0*x-a^b*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a^b/9.0*x^9.0+a^b/6.0*x^6.0+a^b/5.0*x^5.0-a^b*x^2.0-a^b*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a^b/9.0*x^9.0+a^b/6.0*x^6.0+a^b/5.0*x^5.0-a^b*x^2.0-a^b*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a^b*8.0*x^7.0+a^b*5.0*x^4.0+a^b*4.0*x^3.0-a^b*2.0-a^b*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a^b*8.0*7.0*x^6.0+a^b*5.0*4.0*x^3.0+a^b*4.0*3.0*x^2.0-a^b*2.0*0.0-a^b*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a^b*56.0*x^6.0+a^b*20.0*x^3.0+a^b*12.0*x^2.0-a^b*0.0-a^b*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a^b/9.0*x^9.0+a^b/6.0*x^6.0+a^b/5.0*x^5.0-a^b*x^2.0-a^b*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a^b/9.0/10.0*x^10.0+a^b/6.0/7.0*x^7.0+a^b/5.0/6.0*x^6.0-a^b/3.0*x^3.0-a^b*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a^b*0.011111111111111112*x^10.0+a^b*0.023809523809523808*x^7.0+a^b*0.03333333333333333*x^6.0-a^b/3.0*x^3.0-a^b*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a^b*56.0*x^6.0+a^b*20.0*x^3.0+a^b*12.0*x^2.0-a^b*0.0-a^b*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a^b*56.0*6.0*x^5.0+a^b*20.0*3.0*x^2.0+a^b*12.0*2.0*x^1.0-a^b*0.0*0.0-a^b*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a^b*336.0*x^5.0+a^b*60.0*x^2.0+a^b*24.0*x-a^b*0.0-a^b*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a^b*0.011111111111111112*x^10.0+a^b*0.023809523809523808*x^7.0+a^b*0.03333333333333333*x^6.0-a^b/3.0*x^3.0-a^b*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a^b*0.011111111111111112/11.0*x^11.0+a^b*0.023809523809523808/8.0*x^8.0+a^b*0.03333333333333333/7.0*x^7.0-a^b/3.0/4.0*x^4.0-a^b*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a^b*0.00101010101010101*x^11.0+a^b*0.002976190476190476*x^8.0+a^b*0.0047619047619047615*x^7.0-a^b*0.08333333333333333*x^4.0-a^b*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a^b*336.0*x^5.0+a^b*60.0*x^2.0+a^b*24.0*x-a^b*0.0-a^b*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a^b*336.0*5.0*x^4.0+a^b*60.0*2.0*x^1.0+a^b*24.0-a^b*0.0*0.0-a^b*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a^b*1680.0*x^4.0+a^b*120.0*x+a^b*24.0-a^b*0.0-a^b*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a^b*0.00101010101010101*x^11.0+a^b*0.002976190476190476*x^8.0+a^b*0.0047619047619047615*x^7.0-a^b*0.08333333333333333*x^4.0-a^b*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a^b*0.00101010101010101/12.0*x^12.0+a^b*0.002976190476190476/9.0*x^9.0+a^b*0.0047619047619047615/8.0*x^8.0-a^b*0.08333333333333333/5.0*x^5.0-a^b*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a^b*8.417508417508418E-5*x^12.0+a^b*3.3068783068783067E-4*x^9.0+a^b*5.952380952380952E-4*x^8.0-a^b*0.016666666666666666*x^5.0-a^b*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff50056() {
        //Test Case 50056
        UsageCalculus.TestCase = 50056;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "2.0/2.0*a*b*c*x^8 + a*b*c*x^5 + a*b*c*x^4 - 2*x*a*b*c- 25*2*a*b*c";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a*b*c*x^8.0+a*b*c*x^5.0+a*b*c*x^4.0-a*b*c*2.0*x-a*b*c*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a*b*c*8.0*x^7.0+a*b*c*5.0*x^4.0+a*b*c*4.0*x^3.0-a*b*c*2.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a*b*c*8.0*x^7.0+a*b*c*5.0*x^4.0+a*b*c*4.0*x^3.0-a*b*c*2.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayMap3[1] = "a*b*c*x^8.0+a*b*c*x^5.0+a*b*c*x^4.0-a*b*c*2.0*x-a*b*c*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a*b*c/9.0*x^9.0+a*b*c/6.0*x^6.0+a*b*c/5.0*x^5.0-a*b*c*x^2.0-a*b*c*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a*b*c/9.0*x^9.0+a*b*c/6.0*x^6.0+a*b*c/5.0*x^5.0-a*b*c*x^2.0-a*b*c*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a*b*c*8.0*x^7.0+a*b*c*5.0*x^4.0+a*b*c*4.0*x^3.0-a*b*c*2.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a*b*c*8.0*7.0*x^6.0+a*b*c*5.0*4.0*x^3.0+a*b*c*4.0*3.0*x^2.0-a*b*c*2.0*0.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a*b*c*56.0*x^6.0+a*b*c*20.0*x^3.0+a*b*c*12.0*x^2.0-a*b*c*0.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a*b*c/9.0*x^9.0+a*b*c/6.0*x^6.0+a*b*c/5.0*x^5.0-a*b*c*x^2.0-a*b*c*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a*b*c/9.0/10.0*x^10.0+a*b*c/6.0/7.0*x^7.0+a*b*c/5.0/6.0*x^6.0-a*b*c/3.0*x^3.0-a*b*c*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a*b*c*0.011111111111111112*x^10.0+a*b*c*0.023809523809523808*x^7.0+a*b*c*0.03333333333333333*x^6.0-a*b*c/3.0*x^3.0-a*b*c*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a*b*c*56.0*x^6.0+a*b*c*20.0*x^3.0+a*b*c*12.0*x^2.0-a*b*c*0.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a*b*c*56.0*6.0*x^5.0+a*b*c*20.0*3.0*x^2.0+a*b*c*12.0*2.0*x^1.0-a*b*c*0.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a*b*c*336.0*x^5.0+a*b*c*60.0*x^2.0+a*b*c*24.0*x-a*b*c*0.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a*b*c*0.011111111111111112*x^10.0+a*b*c*0.023809523809523808*x^7.0+a*b*c*0.03333333333333333*x^6.0-a*b*c/3.0*x^3.0-a*b*c*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a*b*c*0.011111111111111112/11.0*x^11.0+a*b*c*0.023809523809523808/8.0*x^8.0+a*b*c*0.03333333333333333/7.0*x^7.0-a*b*c/3.0/4.0*x^4.0-a*b*c*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a*b*c*0.00101010101010101*x^11.0+a*b*c*0.002976190476190476*x^8.0+a*b*c*0.0047619047619047615*x^7.0-a*b*c*0.08333333333333333*x^4.0-a*b*c*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a*b*c*336.0*x^5.0+a*b*c*60.0*x^2.0+a*b*c*24.0*x-a*b*c*0.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a*b*c*336.0*5.0*x^4.0+a*b*c*60.0*2.0*x^1.0+a*b*c*24.0-a*b*c*0.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a*b*c*1680.0*x^4.0+a*b*c*120.0*x+a*b*c*24.0-a*b*c*0.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a*b*c*0.00101010101010101*x^11.0+a*b*c*0.002976190476190476*x^8.0+a*b*c*0.0047619047619047615*x^7.0-a*b*c*0.08333333333333333*x^4.0-a*b*c*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a*b*c*0.00101010101010101/12.0*x^12.0+a*b*c*0.002976190476190476/9.0*x^9.0+a*b*c*0.0047619047619047615/8.0*x^8.0-a*b*c*0.08333333333333333/5.0*x^5.0-a*b*c*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a*b*c*8.417508417508418E-5*x^12.0+a*b*c*3.3068783068783067E-4*x^9.0+a*b*c*5.952380952380952E-4*x^8.0-a*b*c*0.016666666666666666*x^5.0-a*b*c*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff50057() {
        //Test Case 50057
        UsageCalculus.TestCase = 50057;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "2.0/2.0*a/b/c*x^8 + a/b/c*x^5 + a/b/c*x^4 - 2*x*a/b/c- 25*2*a/b/c";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a/b/c*x^8.0+a/b/c*x^5.0+a/b/c*x^4.0-a/b/c*2.0*x-a/b/c*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a/b/c*8.0*x^7.0+a/b/c*5.0*x^4.0+a/b/c*4.0*x^3.0-a/b/c*2.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a/b/c*8.0*x^7.0+a/b/c*5.0*x^4.0+a/b/c*4.0*x^3.0-a/b/c*2.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="a/b/c*x^8.0+a/b/c*x^5.0+a/b/c*x^4.0-a/b/c*2.0*x-a/b/c*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a/b/c/9.0*x^9.0+a/b/c/6.0*x^6.0+a/b/c/5.0*x^5.0-a/b/c*x^2.0-a/b/c*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a/b/c/9.0*x^9.0+a/b/c/6.0*x^6.0+a/b/c/5.0*x^5.0-a/b/c*x^2.0-a/b/c*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a/b/c*8.0*x^7.0+a/b/c*5.0*x^4.0+a/b/c*4.0*x^3.0-a/b/c*2.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a/b/c*8.0*7.0*x^6.0+a/b/c*5.0*4.0*x^3.0+a/b/c*4.0*3.0*x^2.0-a/b/c*2.0*0.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a/b/c*56.0*x^6.0+a/b/c*20.0*x^3.0+a/b/c*12.0*x^2.0-a/b/c*0.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a/b/c/9.0*x^9.0+a/b/c/6.0*x^6.0+a/b/c/5.0*x^5.0-a/b/c*x^2.0-a/b/c*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a/b/c/9.0/10.0*x^10.0+a/b/c/6.0/7.0*x^7.0+a/b/c/5.0/6.0*x^6.0-a/b/c/3.0*x^3.0-a/b/c*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a/b/c*0.011111111111111112*x^10.0+a/b/c*0.023809523809523808*x^7.0+a/b/c*0.03333333333333333*x^6.0-a/b/c/3.0*x^3.0-a/b/c*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a/b/c*56.0*x^6.0+a/b/c*20.0*x^3.0+a/b/c*12.0*x^2.0-a/b/c*0.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a/b/c*56.0*6.0*x^5.0+a/b/c*20.0*3.0*x^2.0+a/b/c*12.0*2.0*x^1.0-a/b/c*0.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a/b/c*336.0*x^5.0+a/b/c*60.0*x^2.0+a/b/c*24.0*x-a/b/c*0.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a/b/c*0.011111111111111112*x^10.0+a/b/c*0.023809523809523808*x^7.0+a/b/c*0.03333333333333333*x^6.0-a/b/c/3.0*x^3.0-a/b/c*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a/b/c*0.011111111111111112/11.0*x^11.0+a/b/c*0.023809523809523808/8.0*x^8.0+a/b/c*0.03333333333333333/7.0*x^7.0-a/b/c/3.0/4.0*x^4.0-a/b/c*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a/b/c*0.00101010101010101*x^11.0+a/b/c*0.002976190476190476*x^8.0+a/b/c*0.0047619047619047615*x^7.0-a/b/c*0.08333333333333333*x^4.0-a/b/c*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a/b/c*336.0*x^5.0+a/b/c*60.0*x^2.0+a/b/c*24.0*x-a/b/c*0.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a/b/c*336.0*5.0*x^4.0+a/b/c*60.0*2.0*x^1.0+a/b/c*24.0-a/b/c*0.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a/b/c*1680.0*x^4.0+a/b/c*120.0*x+a/b/c*24.0-a/b/c*0.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a/b/c*0.00101010101010101*x^11.0+a/b/c*0.002976190476190476*x^8.0+a/b/c*0.0047619047619047615*x^7.0-a/b/c*0.08333333333333333*x^4.0-a/b/c*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a/b/c*0.00101010101010101/12.0*x^12.0+a/b/c*0.002976190476190476/9.0*x^9.0+a/b/c*0.0047619047619047615/8.0*x^8.0-a/b/c*0.08333333333333333/5.0*x^5.0-a/b/c*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a/b/c*8.417508417508418E-5*x^12.0+a/b/c*3.3068783068783067E-4*x^9.0+a/b/c*5.952380952380952E-4*x^8.0-a/b/c*0.016666666666666666*x^5.0-a/b/c*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff50058() {
        //Test Case 50058
        UsageCalculus.TestCase = 50058;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "2.0/2.0*a*b/c*x^8 + a*b/c*x^5 + a*b/c*x^4 - 2*x*a*b/c- 25*2*a*b/c";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a*b/c*x^8.0+a*b/c*x^5.0+a*b/c*x^4.0-a*b/c*2.0*x-a*b/c*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a*b/c*8.0*x^7.0+a*b/c*5.0*x^4.0+a*b/c*4.0*x^3.0-a*b/c*2.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a*b/c*8.0*x^7.0+a*b/c*5.0*x^4.0+a*b/c*4.0*x^3.0-a*b/c*2.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="a*b/c*x^8.0+a*b/c*x^5.0+a*b/c*x^4.0-a*b/c*2.0*x-a*b/c*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a*b/c/9.0*x^9.0+a*b/c/6.0*x^6.0+a*b/c/5.0*x^5.0-a*b/c*x^2.0-a*b/c*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a*b/c/9.0*x^9.0+a*b/c/6.0*x^6.0+a*b/c/5.0*x^5.0-a*b/c*x^2.0-a*b/c*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a*b/c*8.0*x^7.0+a*b/c*5.0*x^4.0+a*b/c*4.0*x^3.0-a*b/c*2.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a*b/c*8.0*7.0*x^6.0+a*b/c*5.0*4.0*x^3.0+a*b/c*4.0*3.0*x^2.0-a*b/c*2.0*0.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a*b/c*56.0*x^6.0+a*b/c*20.0*x^3.0+a*b/c*12.0*x^2.0-a*b/c*0.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a*b/c/9.0*x^9.0+a*b/c/6.0*x^6.0+a*b/c/5.0*x^5.0-a*b/c*x^2.0-a*b/c*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a*b/c/9.0/10.0*x^10.0+a*b/c/6.0/7.0*x^7.0+a*b/c/5.0/6.0*x^6.0-a*b/c/3.0*x^3.0-a*b/c*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a*b/c*0.011111111111111112*x^10.0+a*b/c*0.023809523809523808*x^7.0+a*b/c*0.03333333333333333*x^6.0-a*b/c/3.0*x^3.0-a*b/c*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a*b/c*56.0*x^6.0+a*b/c*20.0*x^3.0+a*b/c*12.0*x^2.0-a*b/c*0.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a*b/c*56.0*6.0*x^5.0+a*b/c*20.0*3.0*x^2.0+a*b/c*12.0*2.0*x^1.0-a*b/c*0.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a*b/c*336.0*x^5.0+a*b/c*60.0*x^2.0+a*b/c*24.0*x-a*b/c*0.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a*b/c*0.011111111111111112*x^10.0+a*b/c*0.023809523809523808*x^7.0+a*b/c*0.03333333333333333*x^6.0-a*b/c/3.0*x^3.0-a*b/c*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a*b/c*0.011111111111111112/11.0*x^11.0+a*b/c*0.023809523809523808/8.0*x^8.0+a*b/c*0.03333333333333333/7.0*x^7.0-a*b/c/3.0/4.0*x^4.0-a*b/c*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a*b/c*0.00101010101010101*x^11.0+a*b/c*0.002976190476190476*x^8.0+a*b/c*0.0047619047619047615*x^7.0-a*b/c*0.08333333333333333*x^4.0-a*b/c*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a*b/c*336.0*x^5.0+a*b/c*60.0*x^2.0+a*b/c*24.0*x-a*b/c*0.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a*b/c*336.0*5.0*x^4.0+a*b/c*60.0*2.0*x^1.0+a*b/c*24.0-a*0.0*b/c*0.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a*b/c*1680.0*x^4.0+a*b/c*120.0*x+a*b/c*24.0-a*b/c*0.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a*b/c*0.00101010101010101*x^11.0+a*b/c*0.002976190476190476*x^8.0+a*b/c*0.0047619047619047615*x^7.0-a*b/c*0.08333333333333333*x^4.0-a*b/c*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a*b/c*0.00101010101010101/12.0*x^12.0+a*b/c*0.002976190476190476/9.0*x^9.0+a*b/c*0.0047619047619047615/8.0*x^8.0-a*b/c*0.08333333333333333/5.0*x^5.0-a*b/c*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a*b/c*8.417508417508418E-5*x^12.0+a*b/c*3.3068783068783067E-4*x^9.0+a*b/c*5.952380952380952E-4*x^8.0-a*b/c*0.016666666666666666*x^5.0-a*b/c*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff50059() {
        //Test Case 50059
        UsageCalculus.TestCase = 50059;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All RED Including Values";        
        UsageCalculus.EqnUnderTest = "2.0/2.0*1.0*1.0*+p*xyc1^8 + 1.0*+p*xyc1^5 + 1.0*+p*xyc1^4 + 1.0*+p*xyc1 + 1.0*+p*25*1.0";
        UsageCalculus.TestCaseName = "Simple: Coefficients:+a";
        UsageCalculus.TestCaseMatrixID="Coefficients:+a:3 Letter with Numerics:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "p*xyc1^8.0+p*xyc1^5.0+p*xyc1^4.0+p*xyc1+p*25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "p*8.0*xyc1^7.0+p*5.0*xyc1^4.0+p*4.0*xyc1^3.0+p+p*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "p*8.0*xyc1^7.0+p*5.0*xyc1^4.0+p*4.0*xyc1^3.0+p+p*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="p*xyc1^8.0+p*xyc1^5.0+p*xyc1^4.0+p*xyc1+p*25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="p/9.0*xyc1^9.0+p/6.0*xyc1^6.0+p/5.0*xyc1^5.0+p/2.0*xyc1^2.0+p*25.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="p/9.0*xyc1^9.0+p/6.0*xyc1^6.0+p/5.0*xyc1^5.0+p/2.0*xyc1^2.0+p*25.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "p*8.0*xyc1^7.0+p*5.0*xyc1^4.0+p*4.0*xyc1^3.0+p+p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "p*8.0*7.0*xyc1^6.0+p*5.0*4.0*xyc1^3.0+p*4.0*3.0*xyc1^2.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "p*56.0*xyc1^6.0+p*20.0*xyc1^3.0+p*12.0*xyc1^2.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="p/9.0*xyc1^9.0+p/6.0*xyc1^6.0+p/5.0*xyc1^5.0+p/2.0*xyc1^2.0+p*25.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="p/9.0/10.0*xyc1^10.0+p/6.0/7.0*xyc1^7.0+p/5.0/6.0*xyc1^6.0+p/2.0/3.0*xyc1^3.0+p*25.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="p*0.011111111111111112*xyc1^10.0+p*0.023809523809523808*xyc1^7.0+p*0.03333333333333333*xyc1^6.0+p*0.16666666666666666*xyc1^3.0+p*12.5*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "p*56.0*xyc1^6.0+p*20.0*xyc1^3.0+p*12.0*xyc1^2.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "p*56.0*6.0*xyc1^5.0+p*20.0*3.0*xyc1^2.0+p*12.0*2.0*xyc1^1.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "p*336.0*xyc1^5.0+p*60.0*xyc1^2.0+p*24.0*xyc1+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="p*0.011111111111111112*xyc1^10.0+p*0.023809523809523808*xyc1^7.0+p*0.03333333333333333*xyc1^6.0+p*0.16666666666666666*xyc1^3.0+p*12.5*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="p*0.011111111111111112/11.0*xyc1^11.0+p*0.023809523809523808/8.0*xyc1^8.0+p*0.03333333333333333/7.0*xyc1^7.0+p*0.16666666666666666/4.0*xyc1^4.0+p*12.5/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="p*0.00101010101010101*xyc1^11.0+p*0.002976190476190476*xyc1^8.0+p*0.0047619047619047615*xyc1^7.0+p*0.041666666666666664*xyc1^4.0+p*4.166666666666667*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "p*336.0*xyc1^5.0+p*60.0*xyc1^2.0+p*24.0*xyc1+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "p*336.0*5.0*xyc1^4.0+p*60.0*2.0*xyc1^1.0+p*24.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "p*1680.0*xyc1^4.0+p*120.0*xyc1+p*24.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="p*0.00101010101010101*xyc1^11.0+p*0.002976190476190476*xyc1^8.0+p*0.0047619047619047615*xyc1^7.0+p*0.041666666666666664*xyc1^4.0+p*4.166666666666667*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="p*0.00101010101010101/12.0*xyc1^12.0+p*0.002976190476190476/9.0*xyc1^9.0+p*0.0047619047619047615/8.0*xyc1^8.0+p*0.041666666666666664/5.0*xyc1^5.0+p*4.166666666666667/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="p*8.417508417508418E-5*xyc1^12.0+p*3.3068783068783067E-4*xyc1^9.0+p*5.952380952380952E-4*xyc1^8.0+p*0.008333333333333333*xyc1^5.0+p*1.0416666666666667*xyc1^4.0";
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
        public static void TestCaseDiff50060() {
        //Test Case 50060
        UsageCalculus.TestCase = 50060;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All RED Including Values";        
        UsageCalculus.EqnUnderTest = "1.0*1.0*1.0*+2^a*xyc1^8 + 1.0*+2^a*xyc1^5 + 1.0*+2^a*xyc1^4 + 1.0*+2^a*xyc1 + 1.0*+2^a*25*1.0*1.0";
        UsageCalculus.TestCaseName = "Simple: Coefficients:+2^a";
        UsageCalculus.TestCaseMatrixID="Coefficients:+2^a:3 Letter with Numerics:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "2.0^a*xyc1^8.0+2.0^a*xyc1^5.0+2.0^a*xyc1^4.0+2.0^a*xyc1+2.0^a*25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "2.0^a*8.0*xyc1^7.0+2.0^a*5.0*xyc1^4.0+2.0^a*4.0*xyc1^3.0+2.0^a+2.0^a*25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "2.0^a*8.0*xyc1^7.0+2.0^a*5.0*xyc1^4.0+2.0^a*4.0*xyc1^3.0+2.0^a+2.0^a*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="2.0^a*xyc1^8.0+2.0^a*xyc1^5.0+2.0^a*xyc1^4.0+2.0^a*xyc1+2.0^a*25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="2.0^a/9.0*xyc1^9.0+2.0^a/6.0*xyc1^6.0+2.0^a/5.0*xyc1^5.0+2.0^a/2.0*xyc1^2.0+2.0^a*25.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="2.0^a/9.0*xyc1^9.0+2.0^a/6.0*xyc1^6.0+2.0^a/5.0*xyc1^5.0+2.0^a/2.0*xyc1^2.0+2.0^a*25.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "2.0^a*8.0*xyc1^7.0+2.0^a*5.0*xyc1^4.0+2.0^a*4.0*xyc1^3.0+2.0^a+2.0^a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "2.0^a*8.0*7.0*xyc1^6.0+2.0^a*5.0*4.0*xyc1^3.0+2.0^a*4.0*3.0*xyc1^2.0+2.0^a*0.0+2.0^a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "2.0^a*56.0*xyc1^6.0+2.0^a*20.0*xyc1^3.0+2.0^a*12.0*xyc1^2.0+2.0^a*0.0+2.0^a*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="2.0^a/9.0*xyc1^9.0+2.0^a/6.0*xyc1^6.0+2.0^a/5.0*xyc1^5.0+2.0^a/2.0*xyc1^2.0+2.0^a*25.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="2.0^a/9.0/10.0*xyc1^10.0+2.0^a/6.0/7.0*xyc1^7.0+2.0^a/5.0/6.0*xyc1^6.0+2.0^a/2.0/3.0*xyc1^3.0+2.0^a*25.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="2.0^a/90.0*xyc1^10.0+2.0^a/42.0*xyc1^7.0+2.0^a/30.0*xyc1^6.0+2.0^a/6.0*xyc1^3.0+2.0^a*12.5*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "2.0^a*56.0*xyc1^6.0+2.0^a*20.0*xyc1^3.0+2.0^a*12.0*xyc1^2.0+2.0^a*0.0+2.0^a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "2.0^a*56.0*6.0*xyc1^5.0+2.0^a*20.0*3.0*xyc1^2.0+2.0^a*12.0*2.0*xyc1^1.0+2.0^a*0.0*0.0+2.0^a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "2.0^a*336.0*xyc1^5.0+2.0^a*60.0*xyc1^2.0+2.0^a*24.0*xyc1+2.0^a*0.0+2.0^a*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="2.0^a/90.0*xyc1^10.0+2.0^a/42.0*xyc1^7.0+2.0^a/30.0*xyc1^6.0+2.0^a/6.0*xyc1^3.0+2.0^a*12.5*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="2.0^a/90.0/11.0*xyc1^11.0+2.0^a/42.0/8.0*xyc1^8.0+2.0^a/30.0/7.0*xyc1^7.0+2.0^a/6.0/4.0*xyc1^4.0+2.0^a*12.5/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="2.0^a/990.0*xyc1^11.0+2.0^a/336.0*xyc1^8.0+2.0^a/210.0*xyc1^7.0+2.0^a/24.0*xyc1^4.0+2.0^a*4.166666666666667*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "2.0^a*336.0*xyc1^5.0+2.0^a*60.0*xyc1^2.0+2.0^a*24.0*xyc1+2.0^a*0.0+2.0^a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "2.0^a*336.0*5.0*xyc1^4.0+2.0^a*60.0*2.0*xyc1^1.0+2.0^a*24.0+2.0^a*0.0*0.0+2.0^a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "2.0^a*1680.0*xyc1^4.0+2.0^a*120.0*xyc1+2.0^a*24.0+2.0^a*0.0+2.0^a*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="2.0^a/990.0*xyc1^11.0+2.0^a/336.0*xyc1^8.0+2.0^a/210.0*xyc1^7.0+2.0^a/24.0*xyc1^4.0+2.0^a*4.166666666666667*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="2.0^a/990.0/12.0*xyc1^12.0+2.0^a/336.0/9.0*xyc1^9.0+2.0^a/210.0/8.0*xyc1^8.0+2.0^a/24.0/5.0*xyc1^5.0+2.0^a*4.166666666666667/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="2.0^a/11880.0*xyc1^12.0+2.0^a/3024.0*xyc1^9.0+2.0^a/1680.0*xyc1^8.0+2.0^a/120.0*xyc1^5.0+2.0^a*1.0416666666666667*xyc1^4.0";
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
        public static void TestCaseDiff50061() {
        //Test Case 50061
        UsageCalculus.TestCase = 50061;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All RED Including Values";        
        UsageCalculus.EqnUnderTest = "2.0/2.0*1.0/+a*xyc1^8 + 1.0/+a*xyc1^5 + 1.0/+a*xyc1^4 + 1.0/+a*xyc1 + 1.0/+a*25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:+a";
        UsageCalculus.TestCaseMatrixID="Coefficients:+a:3 Letter with Numerics:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/a*xyc1^8.0+1.0/a*xyc1^5.0+1.0/a*xyc1^4.0+1.0/a*xyc1+1.0/a*25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/a*8.0*xyc1^7.0+1.0/a*5.0*xyc1^4.0+1.0/a*4.0*xyc1^3.0+1.0/a+1.0/a*25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0/a*8.0*xyc1^7.0+1.0/a*5.0*xyc1^4.0+1.0/a*4.0*xyc1^3.0+1.0/a+1.0/a*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/a*xyc1^8.0+1.0/a*xyc1^5.0+1.0/a*xyc1^4.0+1.0/a*xyc1+1.0/a*25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/a/9.0*xyc1^9.0+1.0/a/6.0*xyc1^6.0+1.0/a/5.0*xyc1^5.0+1.0/a/2.0*xyc1^2.0+1.0/a*25.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/a/9.0*xyc1^9.0+1.0/a/6.0*xyc1^6.0+1.0/a/5.0*xyc1^5.0+1.0/a/2.0*xyc1^2.0+1.0/a*25.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0/a*8.0*xyc1^7.0+1.0/a*5.0*xyc1^4.0+1.0/a*4.0*xyc1^3.0+1.0/a+1.0/a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "1.0/a*8.0*7.0*xyc1^6.0+1.0/a*5.0*4.0*xyc1^3.0+1.0/a*4.0*3.0*xyc1^2.0+1.0/a*0.0+1.0/a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "1.0/a*56.0*xyc1^6.0+1.0/a*20.0*xyc1^3.0+1.0/a*12.0*xyc1^2.0+1.0/a*0.0+1.0/a*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/a/9.0*xyc1^9.0+1.0/a/6.0*xyc1^6.0+1.0/a/5.0*xyc1^5.0+1.0/a/2.0*xyc1^2.0+1.0/a*25.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/a/9.0/10.0*xyc1^10.0+1.0/a/6.0/7.0*xyc1^7.0+1.0/a/5.0/6.0*xyc1^6.0+1.0/a/2.0/3.0*xyc1^3.0+1.0/a*25.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/a/90.0*xyc1^10.0+1.0/a/42.0*xyc1^7.0+1.0/a/30.0*xyc1^6.0+1.0/a/6.0*xyc1^3.0+1.0/a*12.5*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "1.0/a*56.0*xyc1^6.0+1.0/a*20.0*xyc1^3.0+1.0/a*12.0*xyc1^2.0+1.0/a*0.0+1.0/a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "1.0/a*56.0*6.0*xyc1^5.0+1.0/a*20.0*3.0*xyc1^2.0+1.0/a*12.0*2.0*xyc1^1.0+1.0/a*0.0*0.0+1.0/a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "1.0/a*336.0*xyc1^5.0+1.0/a*60.0*xyc1^2.0+1.0/a*24.0*xyc1+1.0/a*0.0+1.0/a*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/a/90.0*xyc1^10.0+1.0/a/42.0*xyc1^7.0+1.0/a/30.0*xyc1^6.0+1.0/a/6.0*xyc1^3.0+1.0/a*12.5*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/a/90.0/11.0*xyc1^11.0+1.0/a/42.0/8.0*xyc1^8.0+1.0/a/30.0/7.0*xyc1^7.0+1.0/a/6.0/4.0*xyc1^4.0+1.0/a*12.5/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/a/990.0*xyc1^11.0+1.0/a/336.0*xyc1^8.0+1.0/a/210.0*xyc1^7.0+1.0/a/24.0*xyc1^4.0+1.0/a*4.166666666666667*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "1.0/a*336.0*xyc1^5.0+1.0/a*60.0*xyc1^2.0+1.0/a*24.0*xyc1+1.0/a*0.0+1.0/a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "1.0/a*336.0*5.0*xyc1^4.0+1.0/a*60.0*2.0*xyc1^1.0+1.0/a*24.0+1.0/a*0.0*0.0+1.0/a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1.0/a*1680.0*xyc1^4.0+1.0/a*120.0*xyc1+1.0/a*24.0+1.0/a*0.0+1.0/a*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/a/990.0*xyc1^11.0+1.0/a/336.0*xyc1^8.0+1.0/a/210.0*xyc1^7.0+1.0/a/24.0*xyc1^4.0+1.0/a*4.166666666666667*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/a/990.0/12.0*xyc1^12.0+1.0/a/336.0/9.0*xyc1^9.0+1.0/a/210.0/8.0*xyc1^8.0+1.0/a/24.0/5.0*xyc1^5.0+1.0/a*4.166666666666667/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/a/11880.0*xyc1^12.0+1.0/a/3024.0*xyc1^9.0+1.0/a/1680.0*xyc1^8.0+1.0/a/120.0*xyc1^5.0+1.0/a*1.0416666666666667*xyc1^4.0";
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
        public static void TestCaseDiff50062() {
        //Test Case 50062
        UsageCalculus.TestCase = 50062;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All RED Including Values";        
        UsageCalculus.EqnUnderTest = "1.0/+2^a*xyc1^8 + 1.0/+2^a*xyc1^5 + 1.0/+2^a*xyc1^4 + 1.0/+2^a*xyc1 + 1.0/+2^a*25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:+2^a";
        UsageCalculus.TestCaseMatrixID="Coefficients:+2^a:3 Letter with Numerics:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/2.0^a*xyc1^8.0+1.0/2.0^a*xyc1^5.0+1.0/2.0^a*xyc1^4.0+1.0/2.0^a*xyc1+1.0/2.0^a*25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/2.0^a*8.0*xyc1^7.0+1.0/2.0^a*5.0*xyc1^4.0+1.0/2.0^a*4.0*xyc1^3.0+1.0/2.0^a+1.0/2.0^a*25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0/2.0^a*8.0*xyc1^7.0+1.0/2.0^a*5.0*xyc1^4.0+1.0/2.0^a*4.0*xyc1^3.0+1.0/2.0^a+1.0/2.0^a*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/2.0^a*xyc1^8.0+1.0/2.0^a*xyc1^5.0+1.0/2.0^a*xyc1^4.0+1.0/2.0^a*xyc1+1.0/2.0^a*25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/2.0^a/9.0*xyc1^9.0+1.0/2.0^a/6.0*xyc1^6.0+1.0/2.0^a/5.0*xyc1^5.0+1.0/2.0^a/2.0*xyc1^2.0+1.0/2.0^a*25.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/2.0^a/9.0*xyc1^9.0+1.0/2.0^a/6.0*xyc1^6.0+1.0/2.0^a/5.0*xyc1^5.0+1.0/2.0^a/2.0*xyc1^2.0+1.0/2.0^a*25.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0/2.0^a*8.0*xyc1^7.0+1.0/2.0^a*5.0*xyc1^4.0+1.0/2.0^a*4.0*xyc1^3.0+1.0/2.0^a+1.0/2.0^a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "1.0/2.0^a*8.0*7.0*xyc1^6.0+1.0/2.0^a*5.0*4.0*xyc1^3.0+1.0/2.0^a*4.0*3.0*xyc1^2.0+1.0/2.0^a*0.0+1.0/2.0^a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "1.0/2.0^a*56.0*xyc1^6.0+1.0/2.0^a*20.0*xyc1^3.0+1.0/2.0^a*12.0*xyc1^2.0+1.0/2.0^a*0.0+1.0/2.0^a*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "1.0/2.0^a*56.0*xyc1^6.0+1.0/2.0^a*20.0*xyc1^3.0+1.0/2.0^a*12.0*xyc1^2.0+1.0/2.0^a*0.0+1.0/2.0^a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "1.0/2.0^a*56.0*6.0*xyc1^5.0+1.0/2.0^a*20.0*3.0*xyc1^2.0+1.0/2.0^a*12.0*2.0*xyc1^1.0+1.0/2.0^a*0.0*0.0+1.0/2.0^a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "1.0/2.0^a*336.0*xyc1^5.0+1.0/2.0^a*60.0*xyc1^2.0+1.0/2.0^a*24.0*xyc1+1.0/2.0^a*0.0+1.0/2.0^a*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "1.0/2.0^a*336.0*xyc1^5.0+1.0/2.0^a*60.0*xyc1^2.0+1.0/2.0^a*24.0*xyc1+1.0/2.0^a*0.0+1.0/2.0^a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "1.0/2.0^a*336.0*5.0*xyc1^4.0+1.0/2.0^a*60.0*2.0*xyc1^1.0+1.0/2.0^a*24.0+1.0/2.0^a*0.0*0.0+1.0/2.0^a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1.0/2.0^a*1680.0*xyc1^4.0+1.0/2.0^a*120.0*xyc1+1.0/2.0^a*24.0+1.0/2.0^a*0.0+1.0/2.0^a*0.0";
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
        public static void TestCaseDiff50063() {
        //Test Case 50063
        UsageCalculus.TestCase = 50063;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All RED Including Values";        
        UsageCalculus.EqnUnderTest = "2/2*1.0/+a*+a/+a/+5.0/+a/+a*xyc1^8 + 1.0/+a*+a/+a/+5.0/+a/+a*xyc1^5 + 1.0/+a*+a/+a*+5.0/+a/+a*xyc1^4 + 1.0/+a*b/c*xyc1 + 1.0/+a*+a/a*25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:+a,b,c";
        UsageCalculus.TestCaseMatrixID="Coefficients:+a:3 Letter with Numerics:Mixed(*,/) Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/a*a/a/a/a*0.2*xyc1^8.0+1.0/a*a/a/a/a*0.2*xyc1^5.0+1.0/a*a/a/a/a*5.0*xyc1^4.0+1.0/a*b/c*xyc1+1.0/a*a/a*25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/a*a/a/a/a*0.2*8.0*xyc1^7.0+1.0/a*a/a/a/a*0.2*5.0*xyc1^4.0+1.0/a*a/a/a/a*5.0*4.0*xyc1^3.0+1.0/a*b/c+0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0/a*a/a/a/a*1.6*xyc1^7.0+1.0/a*a/a/a/a*xyc1^4.0+1.0/a*a/a/a/a*20.0*xyc1^3.0+1.0/a*b/c";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/a*a/a/a/a*5.0*xyc1^8.0+1.0/a*a/a/a/a*5.0*xyc1^5.0+1.0/a*a/a/a/a*5.0*xyc1^4.0+1.0/a*b/c*xyc1+1.0/a*a/a*25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/a*a/a/a/a*5.0/9.0*xyc1^9.0+1.0/a*a/a/a/a*5.0/6.0*xyc1^6.0+1.0/a*a/a/a/a*5.0/5.0*xyc1^5.0+1.0/a*b/c/2.0*xyc1^2.0+1.0/a*a/a*25.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/a*a/a/a/a/1.8*xyc1^9.0+1.0/a*a/a/a/a/1.2*xyc1^6.0+1.0/a*a/a/a/a*xyc1^5.0+1.0/a*b/c/2.0*xyc1^2.0+1.0/a*a/a*25.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0/a*a/a/a/a*1.6*xyc1^7.0+1.0/a*a/a/a/a*xyc1^4.0+1.0/a*a/a/a/a*20.0*xyc1^3.0+1.0/a*b/c";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "1.0/a*a/a/a/a*1.6*7.0*xyc1^6.0+1.0/a*a/a/a/a*4.0*xyc1^3.0+1.0/a*a/a/a/a*20.0*3.0*xyc1^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "1.0/a*a/a/a/a*11.200000000000001*xyc1^6.0+1.0/a*a/a/a/a*4.0*xyc1^3.0+1.0/a*a/a/a/a*60.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "1.0/a*a/a/a/a*11.200000000000001*xyc1^6.0+1.0/a*a/a/a/a*4.0*xyc1^3.0+1.0/a*a/a/a/a*60.0*xyc1^2.0+1.0/a*c*c";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "1.0/a*a/a/a/a*11.200000000000001*6.0*xyc1^5.0+1.0/a*a/a/a/a*4.0*3.0*xyc1^2.0+1.0/a*a/a/a/a*60.0*2.0*xyc1^1.0+0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "1.0/a*a/a/a/a*67.2*xyc1^5.0+1.0/a*a/a/a/a*12.0*xyc1^2.0+1.0/a*a/a/a/a*120.0*xyc1";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "1.0/a*a/a/a/a*67.2*xyc1^5.0+1.0/a*a/a/a/a*12.0*xyc1^2.0+1.0/a*a/a/a/a*120.0*xyc1";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "1.0/a*a/a/a/a*67.2*5.0*xyc1^4.0+1.0/a*a/a/a/a*12.0*2.0*xyc1^1.0+1.0/a*a/a/a/a*120.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1.0/a*a/a/a/a*336.0*xyc1^4.0+1.0/a*a/a/a/a*24.0*xyc1+1.0/a*a/a/a/a*120.0";
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
        
        public static void TestCaseDiff50064() {
        //Test Case 50064
        UsageCalculus.TestCase = 50064;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "2^a*x^8 + 2^a*x^5 + 2^a*x^4 - 2*x*2^a- 25*2*2^a";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "2.0^a*x^8.0+2.0^a*x^5.0+2.0^a*x^4.0-2.0^a*2.0*x-2.0^a*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "2.0^a*8.0*x^7.0+2.0^a*5.0*x^4.0+2.0^a*4.0*x^3.0-2.0^a*2.0-2.0^a*50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "2.0^a*8.0*x^7.0+2.0^a*5.0*x^4.0+2.0^a*4.0*x^3.0-2.0^a*2.0-2.0^a*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="2.0^a*x^8.0+2.0^a*x^5.0+2.0^a*x^4.0-2.0^a*2.0*x-2.0^a*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="2.0^a/9.0*x^9.0+2.0^a/6.0*x^6.0+2.0^a/5.0*x^5.0-2.0^a*2.0/2.0*x^2.0-2.0^a*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="2.0^a/9.0*x^9.0+2.0^a/6.0*x^6.0+2.0^a/5.0*x^5.0-2.0^a*x^2.0-2.0^a*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "2.0^a*8.0*x^7.0+2.0^a*5.0*x^4.0+2.0^a*4.0*x^3.0-2.0^a*2.0-2.0^a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "2.0^a*8.0*7.0*x^6.0+2.0^a*5.0*4.0*x^3.0+2.0^a*4.0*3.0*x^2.0-2.0^a*2.0*0.0-2.0^a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "2.0^a*56.0*x^6.0+2.0^a*20.0*x^3.0+2.0^a*12.0*x^2.0-2.0^a*0.0-2.0^a*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="2.0^a/9.0*x^9.0+2.0^a/6.0*x^6.0+2.0^a/5.0*x^5.0-2.0^a*x^2.0-2.0^a*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="2.0^a/9.0/10.0*x^10.0+2.0^a/6.0/7.0*x^7.0+2.0^a/5.0/6.0*x^6.0-2.0^a/3.0*x^3.0-2.0^a*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="2.0^a/90.0*x^10.0+2.0^a/42.0*x^7.0+2.0^a/30.0*x^6.0-2.0^a/3.0*x^3.0-2.0^a*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "2.0^a*56.0*x^6.0+2.0^a*20.0*x^3.0+2.0^a*12.0*x^2.0-2.0^a*0.0-2.0^a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "2.0^a*56.0*6.0*x^5.0+2.0^a*20.0*3.0*x^2.0+2.0^a*12.0*2.0*x^1.0-2.0^a*0.0*0.0-2.0^a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "2.0^a*336.0*x^5.0+2.0^a*60.0*x^2.0+2.0^a*24.0*x-2.0^a*0.0-2.0^a*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="2.0^a/90.0*x^10.0+2.0^a/42.0*x^7.0+2.0^a/30.0*x^6.0-2.0^a/3.0*x^3.0-2.0^a*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="2.0^a/90.0/11.0*x^11.0+2.0^a/42.0/8.0*x^8.0+2.0^a/30.0/7.0*x^7.0-2.0^a/3.0/4.0*x^4.0-2.0^a*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="2.0^a/990.0*x^11.0+2.0^a/336.0*x^8.0+2.0^a/210.0*x^7.0-2.0^a/12.0*x^4.0-2.0^a*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "2.0^a*336.0*x^5.0+2.0^a*60.0*x^2.0+2.0^a*24.0*x-2.0^a*0.0-2.0^a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "2.0^a*336.0*5.0*x^4.0+2.0^a*60.0*2.0*x^1.0+2.0^a*24.0-2.0^a*0.0*0.0-2.0^a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "2.0^a*1680.0*x^4.0+2.0^a*120.0*x+2.0^a*24.0-2.0^a*0.0-2.0^a*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="2.0^a/990.0*x^11.0+2.0^a/336.0*x^8.0+2.0^a/210.0*x^7.0-2.0^a/12.0*x^4.0-2.0^a*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="2.0^a/990.0/12.0*x^12.0+2.0^a/336.0/9.0*x^9.0+2.0^a/210.0/8.0*x^8.0-2.0^a/12.0/5.0*x^5.0-2.0^a*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="2.0^a/11880.0*x^12.0+2.0^a/3024.0*x^9.0+2.0^a/1680.0*x^8.0-2.0^a/60.0*x^5.0-2.0^a*2.0833333333333335*x^4.0";
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
    public static void TestCaseDiff50065() {
        //Test Case 50065
        UsageCalculus.TestCase = 50065;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "2^a*x^8 + 2^a*x^5 + 2^a*x^4 - 2*x*2^a- 25*(2)*3^a";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "2.0^a*x^8.0+2.0^a*x^5.0+2.0^a*x^4.0-2.0^a*2.0*x-3^a*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "2.0^a*8.0*x^7.0+2.0^a*5.0*x^4.0+2.0^a*4.0*x^3.0-2.0^a*2.0-3^a*50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "2.0^a*8.0*x^7.0+2.0^a*5.0*x^4.0+2.0^a*4.0*x^3.0-2.0^a*2.0-3.0^a*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="2.0^a*x^8.0+2.0^a*x^5.0+2.0^a*x^4.0-2.0^a*2.0*x-3^a*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="2.0^a/9.0*x^9.0+2.0^a/6.0*x^6.0+2.0^a/5.0*x^5.0-2.0^a*2.0/2.0*x^2.0-3^a*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="2.0^a/9.0*x^9.0+2.0^a/6.0*x^6.0+2.0^a/5.0*x^5.0-2.0^a*x^2.0-3.0^a*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "2.0^a*8.0*x^7.0+2.0^a*5.0*x^4.0+2.0^a*4.0*x^3.0-2.0^a*2.0-3.0^a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "2.0^a*8.0*7.0*x^6.0+2.0^a*5.0*4.0*x^3.0+2.0^a*4.0*3.0*x^2.0-2.0^a*2.0*0.0-3.0^a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "2.0^a*56.0*x^6.0+2.0^a*20.0*x^3.0+2.0^a*12.0*x^2.0-2.0^a*0.0-3.0^a*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="2.0^a/9.0*x^9.0+2.0^a/6.0*x^6.0+2.0^a/5.0*x^5.0-2.0^a*x^2.0-3.0^a*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="2.0^a/9.0/10.0*x^10.0+2.0^a/6.0/7.0*x^7.0+2.0^a/5.0/6.0*x^6.0-2.0^a/3.0*x^3.0-3.0^a*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="2.0^a/90.0*x^10.0+2.0^a/42.0*x^7.0+2.0^a/30.0*x^6.0-2.0^a/3.0*x^3.0-3.0^a*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "2.0^a*56.0*x^6.0+2.0^a*20.0*x^3.0+2.0^a*12.0*x^2.0-2.0^a*0.0-3.0^a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "2.0^a*56.0*6.0*x^5.0+2.0^a*20.0*3.0*x^2.0+2.0^a*12.0*2.0*x^1.0-2.0^a*0.0*0.0-3.0^a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "2.0^a*336.0*x^5.0+2.0^a*60.0*x^2.0+2.0^a*24.0*x-2.0^a*0.0-3.0^a*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="2.0^a/90.0*x^10.0+2.0^a/42.0*x^7.0+2.0^a/30.0*x^6.0-2.0^a/3.0*x^3.0-3.0^a*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="2.0^a/90.0/11.0*x^11.0+2.0^a/42.0/8.0*x^8.0+2.0^a/30.0/7.0*x^7.0-2.0^a/3.0/4.0*x^4.0-3.0^a*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="2.0^a/990.0*x^11.0+2.0^a/336.0*x^8.0+2.0^a/210.0*x^7.0-2.0^a/12.0*x^4.0-3.0^a*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "2.0^a*336.0*x^5.0+2.0^a*60.0*x^2.0+2.0^a*24.0*x-2.0^a*0.0-3.0^a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "2.0^a*336.0*5.0*x^4.0+2.0^a*60.0*2.0*x^1.0+2.0^a*24.0-2.0^a*0.0*0.0-3.0^a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "2.0^a*1680.0*x^4.0+2.0^a*120.0*x+2.0^a*24.0-2.0^a*0.0-3.0^a*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="2.0^a/990.0*x^11.0+2.0^a/336.0*x^8.0+2.0^a/210.0*x^7.0-2.0^a/12.0*x^4.0-3.0^a*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="2.0^a/990.0/12.0*x^12.0+2.0^a/336.0/9.0*x^9.0+2.0^a/210.0/8.0*x^8.0-2.0^a/12.0/5.0*x^5.0-3.0^a*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="2.0^a/11880.0*x^12.0+2.0^a/3024.0*x^9.0+2.0^a/1680.0*x^8.0-2.0^a/60.0*x^5.0-3.0^a*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff50066() {
        //Test Case 50066
        UsageCalculus.TestCase = 50066;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "2.0/2.0*a^2*x^8 + a^2*x^5 + a^2*x^4 - 2*x*a^2- 25*(2)*a^3";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a^2.0*x^8.0+a^2.0*x^5.0+a^2.0*x^4.0-a^2.0*2.0*x-a^3.0*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a^2.0*8.0*x^7.0+a^2.0*5.0*x^4.0+a^2.0*4.0*x^3.0-a^2.0*2.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a^2.0*8.0*x^7.0+a^2.0*5.0*x^4.0+a^2.0*4.0*x^3.0-a^2.0*2.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="a^2.0*x^8.0+a^2.0*x^5.0+a^2.0*x^4.0-a^2.0*2.0*x-a^3.0*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a^2.0/9.0*x^9.0+a^2.0/6.0*x^6.0+a^2.0/5.0*x^5.0-a^2.0*x^2.0-a^3.0*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a^2.0/9.0*x^9.0+a^2.0/6.0*x^6.0+a^2.0/5.0*x^5.0-a^2.0*x^2.0-a^3.0*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a^2.0*8.0*x^7.0+a^2.0*5.0*x^4.0+a^2.0*4.0*x^3.0-a^2.0*2.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a^2.0*8.0*7.0*x^6.0+a^2.0*5.0*4.0*x^3.0+a^2.0*4.0*3.0*x^2.0-a^2.0*2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a^2.0*56.0*x^6.0+a^2.0*20.0*x^3.0+a^2.0*12.0*x^2.0-a^2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a^2.0/9.0*x^9.0+a^2.0/6.0*x^6.0+a^2.0/5.0*x^5.0-a^2.0*x^2.0-a^3.0*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a^2.0/9.0/10.0*x^10.0+a^2.0/6.0/7.0*x^7.0+a^2.0/5.0/6.0*x^6.0-a^2.0/3.0*x^3.0-a^3.0*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a^2.0*0.011111111111111112*x^10.0+a^2.0*0.023809523809523808*x^7.0+a^2.0*0.03333333333333333*x^6.0-a^2.0/3.0*x^3.0-a^3.0*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a^2.0*56.0*x^6.0+a^2.0*20.0*x^3.0+a^2.0*12.0*x^2.0-a^2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a^2.0*56.0*6.0*x^5.0+a^2.0*20.0*3.0*x^2.0+a^2.0*12.0*2.0*x^1.0-a^2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a^2.0*336.0*x^5.0+a^2.0*60.0*x^2.0+a^2.0*24.0*x-a^2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a^2.0*0.011111111111111112*x^10.0+a^2.0*0.023809523809523808*x^7.0+a^2.0*0.03333333333333333*x^6.0-a^2.0/3.0*x^3.0-a^3.0*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a^2.0*0.011111111111111112/11.0*x^11.0+a^2.0*0.023809523809523808/8.0*x^8.0+a^2.0*0.03333333333333333/7.0*x^7.0-a^2.0/3.0/4.0*x^4.0-a^3.0*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a^2.0*0.00101010101010101*x^11.0+a^2.0*0.002976190476190476*x^8.0+a^2.0*0.0047619047619047615*x^7.0-a^2.0*0.08333333333333333*x^4.0-a^3.0*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a^2.0*336.0*x^5.0+a^2.0*60.0*x^2.0+a^2.0*24.0*x-a^2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a^2.0*336.0*5.0*x^4.0+a^2.0*60.0*2.0*x^1.0+a^2.0*24.0-a^2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a^2.0*1680.0*x^4.0+a^2.0*120.0*x+a^2.0*24.0-a^2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a^2.0*0.00101010101010101*x^11.0+a^2.0*0.002976190476190476*x^8.0+a^2.0*0.0047619047619047615*x^7.0-a^2.0*0.08333333333333333*x^4.0-a^3.0*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a^2.0*0.00101010101010101/12.0*x^12.0+a^2.0*0.002976190476190476/9.0*x^9.0+a^2.0*0.0047619047619047615/8.0*x^8.0-a^2.0*0.08333333333333333/5.0*x^5.0-a^3.0*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a^2.0*8.417508417508418E-5*x^12.0+a^2.0*3.3068783068783067E-4*x^9.0+a^2.0*5.952380952380952E-4*x^8.0-a^2.0*0.016666666666666666*x^5.0-a^3.0*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff50067() {
        //Test Case 50067
        UsageCalculus.TestCase = 50067;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "2/2*2^x*x^8 + 2^x*x^5 + 2^x*x^4 - 2*x*2^x- 25*(2)*3^x";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "";
        UsageCalculus.EqnSolArrayMap2[1] = "";
        UsageCalculus.EqnSolArrayMap3[1]="x^8.0*2.0^x+x^5.0*2.0^x+x^4.0*2.0^x-2.0*x*2.0^x-50.0*3.0^x";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="";
        UsageCalculus.EqnSolArrayMap4[1]="";
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
       
       public static void TestCaseDiff50068() {
        //Test Case 50068
        UsageCalculus.TestCase = 50068;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "2.0/2.0*a^b*x^8 + a^b*x^5 + a^b*x^4 - 2*x*a^b- 25*(2)*a^b";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a^b*x^8.0+a^b*x^5.0+a^b*x^4.0-a^b*2.0*x-a^b*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a^b*8.0*x^7.0+a^b*5.0*x^4.0+a^b*4.0*x^3.0-a^b*2.0-a^b*50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a^b*8.0*x^7.0+a^b*5.0*x^4.0+a^b*4.0*x^3.0-a^b*2.0-a^b*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="a^b*x^8.0+a^b*x^5.0+a^b*x^4.0-a^b*2.0*x-a^b*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a^b/9.0*x^9.0+a^b/6.0*x^6.0+a^b/5.0*x^5.0-a^b*x^2.0-a^b*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a^b/9.0*x^9.0+a^b/6.0*x^6.0+a^b/5.0*x^5.0-a^b*x^2.0-a^b*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a^b*8.0*x^7.0+a^b*5.0*x^4.0+a^b*4.0*x^3.0-a^b*2.0-a^b*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a^b*8.0*7.0*x^6.0+a^b*5.0*4.0*x^3.0+a^b*4.0*3.0*x^2.0-a^b*2.0*0.0-a^b*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a^b*56.0*x^6.0+a^b*20.0*x^3.0+a^b*12.0*x^2.0-a^b*0.0-a^b*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a^b/9.0*x^9.0+a^b/6.0*x^6.0+a^b/5.0*x^5.0-a^b*x^2.0-a^b*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a^b/9.0/10.0*x^10.0+a^b/6.0/7.0*x^7.0+a^b/5.0/6.0*x^6.0-a^b/3.0*x^3.0-a^b*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a^b*0.011111111111111112*x^10.0+a^b*0.023809523809523808*x^7.0+a^b*0.03333333333333333*x^6.0-a^b/3.0*x^3.0-a^b*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a^b*56.0*x^6.0+a^b*20.0*x^3.0+a^b*12.0*x^2.0-a^b*0.0-a^b*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a^b*56.0*6.0*x^5.0+a^b*20.0*3.0*x^2.0+a^b*12.0*2.0*x^1.0-a^b*0.0*0.0-a^b*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a^b*336.0*x^5.0+a^b*60.0*x^2.0+a^b*24.0*x-a^b*0.0-a^b*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a^b*0.011111111111111112*x^10.0+a^b*0.023809523809523808*x^7.0+a^b*0.03333333333333333*x^6.0-a^b/3.0*x^3.0-a^b*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a^b*0.011111111111111112/11.0*x^11.0+a^b*0.023809523809523808/8.0*x^8.0+a^b*0.03333333333333333/7.0*x^7.0-a^b/3.0/4.0*x^4.0-a^b*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a^b*0.00101010101010101*x^11.0+a^b*0.002976190476190476*x^8.0+a^b*0.0047619047619047615*x^7.0-a^b*0.08333333333333333*x^4.0-a^b*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a^b*336.0*x^5.0+a^b*60.0*x^2.0+a^b*24.0*x-a^b*0.0-a^b*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a^b*336.0*5.0*x^4.0+a^b*60.0*2.0*x^1.0+a^b*24.0-a^b*0.0*0.0-a^b*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a^b*1680.0*x^4.0+a^b*120.0*x+a^b*24.0-a^b*0.0-a^b*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a^b*0.00101010101010101*x^11.0+a^b*0.002976190476190476*x^8.0+a^b*0.0047619047619047615*x^7.0-a^b*0.08333333333333333*x^4.0-a^b*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a^b*0.00101010101010101/12.0*x^12.0+a^b*0.002976190476190476/9.0*x^9.0+a^b*0.0047619047619047615/8.0*x^8.0-a^b*0.08333333333333333/5.0*x^5.0-a^b*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a^b*8.417508417508418E-5*x^12.0+a^b*3.3068783068783067E-4*x^9.0+a^b*5.952380952380952E-4*x^8.0-a^b*0.016666666666666666*x^5.0-a^b*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff50069() {
        //Test Case 50069
        UsageCalculus.TestCase = 50069;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "2.0/2.0*a*b*c*x^8 + a*b*c*x^5 + a*b*c*x^4 - 2*x*a*b*c- 25*(2)*a*b*c";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a*b*c*x^8.0+a*b*c*x^5.0+a*b*c*x^4.0-a*b*c*2.0*x-a*b*c*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a*b*c*8.0*x^7.0+a*b*c*5.0*x^4.0+a*b*c*4.0*x^3.0-a*b*c*2.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a*b*c*8.0*x^7.0+a*b*c*5.0*x^4.0+a*b*c*4.0*x^3.0-a*b*c*2.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="a*b*c*x^8.0+a*b*c*x^5.0+a*b*c*x^4.0-a*b*c*2.0*x-a*b*c*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a*b*c/9.0*x^9.0+a*b*c/6.0*x^6.0+a*b*c/5.0*x^5.0-a*b*c*x^2.0-a*b*c*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a*b*c/9.0*x^9.0+a*b*c/6.0*x^6.0+a*b*c/5.0*x^5.0-a*b*c*x^2.0-a*b*c*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a*b*c*8.0*x^7.0+a*b*c*5.0*x^4.0+a*b*c*4.0*x^3.0-a*b*c*2.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a*b*c*8.0*7.0*x^6.0+a*b*c*5.0*4.0*x^3.0+a*b*c*4.0*3.0*x^2.0-a*b*c*2.0*0.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a*b*c*56.0*x^6.0+a*b*c*20.0*x^3.0+a*b*c*12.0*x^2.0-a*b*c*0.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a*b*c/9.0*x^9.0+a*b*c/6.0*x^6.0+a*b*c/5.0*x^5.0-a*b*c*x^2.0-a*b*c*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a*b*c/9.0/10.0*x^10.0+a*b*c/6.0/7.0*x^7.0+a*b*c/5.0/6.0*x^6.0-a*b*c/3.0*x^3.0-a*b*c*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a*b*c*0.011111111111111112*x^10.0+a*b*c*0.023809523809523808*x^7.0+a*b*c*0.03333333333333333*x^6.0-a*b*c/3.0*x^3.0-a*b*c*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a*b*c*56.0*x^6.0+a*b*c*20.0*x^3.0+a*b*c*12.0*x^2.0-a*b*c*0.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a*b*c*56.0*6.0*x^5.0+a*b*c*20.0*3.0*x^2.0+a*b*c*12.0*2.0*x^1.0-a*b*c*0.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a*b*c*336.0*x^5.0+a*b*c*60.0*x^2.0+a*b*c*24.0*x-a*b*c*0.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a*b*c*0.011111111111111112*x^10.0+a*b*c*0.023809523809523808*x^7.0+a*b*c*0.03333333333333333*x^6.0-a*b*c/3.0*x^3.0-a*b*c*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a*b*c*0.011111111111111112/11.0*x^11.0+a*b*c*0.023809523809523808/8.0*x^8.0+a*b*c*0.03333333333333333/7.0*x^7.0-a*b*c/3.0/4.0*x^4.0-a*b*c*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a*b*c*0.00101010101010101*x^11.0+a*b*c*0.002976190476190476*x^8.0+a*b*c*0.0047619047619047615*x^7.0-a*b*c*0.08333333333333333*x^4.0-a*b*c*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a*b*c*336.0*x^5.0+a*b*c*60.0*x^2.0+a*b*c*24.0*x-a*b*c*0.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a*b*c*336.0*5.0*x^4.0+a*b*c*60.0*2.0*x^1.0+a*b*c*24.0-a*b*c*0.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a*b*c*1680.0*x^4.0+a*b*c*120.0*x+a*b*c*24.0-a*b*c*0.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a*b*c*0.00101010101010101*x^11.0+a*b*c*0.002976190476190476*x^8.0+a*b*c*0.0047619047619047615*x^7.0-a*b*c*0.08333333333333333*x^4.0-a*b*c*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a*b*c*0.00101010101010101/12.0*x^12.0+a*b*c*0.002976190476190476/9.0*x^9.0+a*b*c*0.0047619047619047615/8.0*x^8.0-a*b*c*0.08333333333333333/5.0*x^5.0-a*b*c*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a*b*c*8.417508417508418E-5*x^12.0+a*b*c*3.3068783068783067E-4*x^9.0+a*b*c*5.952380952380952E-4*x^8.0-a*b*c*0.016666666666666666*x^5.0-a*b*c*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff50070() {
        //Test Case 50070
        UsageCalculus.TestCase = 50070;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "2/2*a/b/c*x^8 + a/b/c*x^5 + a/b/c*x^4 - 2*x*a/b/c- 25*(2)*a/b/c";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a/b/c*x^8.0+a/b/c*x^5.0+a/b/c*x^4.0-a/b/c*2.0*x-a/b/c*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a/b/c*8.0*x^7.0+a/b/c*5.0*x^4.0+a/b/c*4.0*x^3.0-a/b/c*2.0-a/b/c*50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a/b/c*8.0*x^7.0+a/b/c*5.0*x^4.0+a/b/c*4.0*x^3.0-a/b/c*2.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="a/b/c*x^8.0+a/b/c*x^5.0+a/b/c*x^4.0-a/b/c*2.0*x-a/b/c*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a/b/c/9.0*x^9.0+a/b/c/6.0*x^6.0+a/b/c/5.0*x^5.0-a/b/c*x^2.0-a/b/c*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a/b/c/9.0*x^9.0+a/b/c/6.0*x^6.0+a/b/c/5.0*x^5.0-a/b/c*x^2.0-a/b/c*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a/b/c*8.0*x^7.0+a/b/c*5.0*x^4.0+a/b/c*4.0*x^3.0-a/b/c*2.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a/b/c*8.0*7.0*x^6.0+a/b/c*5.0*4.0*x^3.0+a/b/c*4.0*3.0*x^2.0-a/b/c*2.0*0.0-a/b/c*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a/b/c*56.0*x^6.0+a/b/c*20.0*x^3.0+a/b/c*12.0*x^2.0-a/b/c*0.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a/b/c/9.0*x^9.0+a/b/c/6.0*x^6.0+a/b/c/5.0*x^5.0-a/b/c*x^2.0-a/b/c*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a/b/c/9.0/10.0*x^10.0+a/b/c/6.0/7.0*x^7.0+a/b/c/5.0/6.0*x^6.0-a/b/c/3.0*x^3.0-a/b/c*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a/b/c*0.011111111111111112*x^10.0+a/b/c*0.023809523809523808*x^7.0+a/b/c*0.03333333333333333*x^6.0-a/b/c/3.0*x^3.0-a/b/c*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a/b/c*56.0*x^6.0+a/b/c*20.0*x^3.0+a/b/c*12.0*x^2.0-a/b/c*0.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a/b/c*56.0*6.0*x^5.0+a/b/c*20.0*3.0*x^2.0+a/b/c*12.0*2.0*x^1.0-a/b/c*0.0*0.0-a/b/c*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a/b/c*336.0*x^5.0+a/b/c*60.0*x^2.0+a/b/c*24.0*x-a/b/c*0.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a/b/c*0.011111111111111112*x^10.0+a/b/c*0.023809523809523808*x^7.0+a/b/c*0.03333333333333333*x^6.0-a/b/c/3.0*x^3.0-a/b/c*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a/b/c*0.011111111111111112/11.0*x^11.0+a/b/c*0.023809523809523808/8.0*x^8.0+a/b/c*0.03333333333333333/7.0*x^7.0-a/b/c/3.0/4.0*x^4.0-a/b/c*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a/b/c*0.00101010101010101*x^11.0+a/b/c*0.002976190476190476*x^8.0+a/b/c*0.0047619047619047615*x^7.0-a/b/c*0.08333333333333333*x^4.0-a/b/c*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a/b/c*336.0*x^5.0+a/b/c*60.0*x^2.0+a/b/c*24.0*x-a/b/c*0.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a/b/c*336.0*5.0*x^4.0+a/b/c*60.0*2.0*x^1.0+a/b/c*24.0-a/b/c*0.0*0.0-a/b/c*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a/b/c*1680.0*x^4.0+a/b/c*120.0*x+a/b/c*24.0-a/b/c*0.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a/b/c*0.00101010101010101*x^11.0+a/b/c*0.002976190476190476*x^8.0+a/b/c*0.0047619047619047615*x^7.0-a/b/c*0.08333333333333333*x^4.0-a/b/c*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a/b/c*0.00101010101010101/12.0*x^12.0+a/b/c*0.002976190476190476/9.0*x^9.0+a/b/c*0.0047619047619047615/8.0*x^8.0-a/b/c*0.08333333333333333/5.0*x^5.0-a/b/c*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a/b/c*8.417508417508418E-5*x^12.0+a/b/c*3.3068783068783067E-4*x^9.0+a/b/c*5.952380952380952E-4*x^8.0-a/b/c*0.016666666666666666*x^5.0-a/b/c*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff50071() {
        //Test Case 50071
        UsageCalculus.TestCase = 50071;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "2.0/2.0*a*b/c*x^8 + a*b/c*x^5 + a*b/c*x^4 - 2*x*a*b/c- 25*(2)*a*b/c";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a*b/c*x^8.0+a*b/c*x^5.0+a*b/c*x^4.0-a*b/c*2.0*x-a*b/c*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a*b/c*8.0*x^7.0+a*b/c*5.0*x^4.0+a*b/c*4.0*x^3.0-a*b/c*2.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a*b/c*8.0*x^7.0+a*b/c*5.0*x^4.0+a*b/c*4.0*x^3.0-a*b/c*2.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="a*b/c*x^8.0+a*b/c*x^5.0+a*b/c*x^4.0-a*b/c*2.0*x-a*b/c*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a*b/c/9.0*x^9.0+a*b/c/6.0*x^6.0+a*b/c/5.0*x^5.0-a*b/c*x^2.0-a*b/c*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a*b/c/9.0*x^9.0+a*b/c/6.0*x^6.0+a*b/c/5.0*x^5.0-a*b/c*x^2.0-a*b/c*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a*b/c*8.0*x^7.0+a*b/c*5.0*x^4.0+a*b/c*4.0*x^3.0-a*b/c*2.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a*b/c*8.0*7.0*x^6.0+a*b/c*5.0*4.0*x^3.0+a*b/c*4.0*3.0*x^2.0-a*b/c*2.0*0.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a*b/c*56.0*x^6.0+a*b/c*20.0*x^3.0+a*b/c*12.0*x^2.0-a*b/c*0.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a*b/c/9.0*x^9.0+a*b/c/6.0*x^6.0+a*b/c/5.0*x^5.0-a*b/c*x^2.0-a*b/c*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a*b/c/9.0/10.0*x^10.0+a*b/c/6.0/7.0*x^7.0+a*b/c/5.0/6.0*x^6.0-a*b/c/3.0*x^3.0-a*b/c*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a*b/c*0.011111111111111112*x^10.0+a*b/c*0.023809523809523808*x^7.0+a*b/c*0.03333333333333333*x^6.0-a*b/c/3.0*x^3.0-a*b/c*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a*b/c*56.0*x^6.0+a*b/c*20.0*x^3.0+a*b/c*12.0*x^2.0-a*b/c*0.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a*b/c*56.0*6.0*x^5.0+a*b/c*20.0*3.0*x^2.0+a*b/c*12.0*2.0*x^1.0-a*b/c*0.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a*b/c*336.0*x^5.0+a*b/c*60.0*x^2.0+a*b/c*24.0*x-a*b/c*0.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a*b/c*0.011111111111111112*x^10.0+a*b/c*0.023809523809523808*x^7.0+a*b/c*0.03333333333333333*x^6.0-a*b/c/3.0*x^3.0-a*b/c*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a*b/c*0.011111111111111112/11.0*x^11.0+a*b/c*0.023809523809523808/8.0*x^8.0+a*b/c*0.03333333333333333/7.0*x^7.0-a*b/c/3.0/4.0*x^4.0-a*b/c*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a*b/c*0.00101010101010101*x^11.0+a*b/c*0.002976190476190476*x^8.0+a*b/c*0.0047619047619047615*x^7.0-a*b/c*0.08333333333333333*x^4.0-a*b/c*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a*b/c*336.0*x^5.0+a*b/c*60.0*x^2.0+a*b/c*24.0*x-a*b/c*0.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a*b/c*336.0*5.0*x^4.0+a*b/c*60.0*2.0*x^1.0+a*b/c*24.0-a*b/c*0.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a*b/c*1680.0*x^4.0+a*b/c*120.0*x+a*b/c*24.0-a*b/c*0.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a*b/c*0.00101010101010101*x^11.0+a*b/c*0.002976190476190476*x^8.0+a*b/c*0.0047619047619047615*x^7.0-a*b/c*0.08333333333333333*x^4.0-a*b/c*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a*b/c*0.00101010101010101/12.0*x^12.0+a*b/c*0.002976190476190476/9.0*x^9.0+a*b/c*0.0047619047619047615/8.0*x^8.0-a*b/c*0.08333333333333333/5.0*x^5.0-a*b/c*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a*b/c*8.417508417508418E-5*x^12.0+a*b/c*3.3068783068783067E-4*x^9.0+a*b/c*5.952380952380952E-4*x^8.0-a*b/c*0.016666666666666666*x^5.0-a*b/c*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff50072() {
        //Test Case 50072
        UsageCalculus.TestCase = 50072;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0/1.0*1.0/a*x^8 + 1.0/a*x^5 + 1.0/a*x^4 - 2*x/a- 25*2/a";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/a*x^8.0+1.0/a*x^5.0+1.0/a*x^4.0-1.0/a*2.0*x-1.0/a*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/a*8.0*x^7.0+1.0/a*5.0*x^4.0+1.0/a*4.0*x^3.0-1.0/a*2.0-1.0/a*50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0/a*8.0*x^7.0+1.0/a*5.0*x^4.0+1.0/a*4.0*x^3.0-1.0/a*2.0-1.0/a*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/a*x^8.0+1.0/a*x^5.0+1.0/a*x^4.0-1.0/a*2.0*x-1.0/a*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/a/9.0*x^9.0+1.0/a/6.0*x^6.0+1.0/a/5.0*x^5.0-1.0/a*2.0/2.0*x^2.0-1.0/a*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/a/9.0*x^9.0+1.0/a/6.0*x^6.0+1.0/a/5.0*x^5.0-1.0/a*x^2.0-1.0/a*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0/a*8.0*x^7.0+1.0/a*5.0*x^4.0+1.0/a*4.0*x^3.0-1.0/a*2.0-1.0/a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "1.0/a*8.0*7.0*x^6.0+1.0/a*5.0*4.0*x^3.0+1.0/a*4.0*3.0*x^2.0-1.0/a*2.0*0.0-1.0/a*0.0*0.00";
        UsageCalculus.EqnSolArrayMap2[2] = "1.0/a*56.0*x^6.0+1.0/a*20.0*x^3.0+1.0/a*12.0*x^2.0-1.0/a*0.0-1.0/a*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/a/9.0*x^9.0+1.0/a/6.0*x^6.0+1.0/a/5.0*x^5.0-1.0/a*x^2.0-1.0/a*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/a/9.0/10.0*x^10.0+1.0/a/6.0/7.0*x^7.0+1.0/a/5.0/6.0*x^6.0-1.0/a/3.0*x^3.0-1.0/a*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/a/90.0*x^10.0+1.0/a/42.0*x^7.0+1.0/a/30.0*x^6.0-1.0/a/3.0*x^3.0-1.0/a*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "1.0/a*56.0*x^6.0+1.0/a*20.0*x^3.0+1.0/a*12.0*x^2.0-1.0/a*0.0-1.0/a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "1.0/a*56.0*6.0*x^5.0+1.0/a*20.0*3.0*x^2.0+1.0/a*12.0*2.0*x^1.0-1.0/a*0.0*0.0-1.0/a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "1.0/a*336.0*x^5.0+1.0/a*60.0*x^2.0+1.0/a*24.0*x-1.0/a*0.0-1.0/a*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/a/90.0*x^10.0+1.0/a/42.0*x^7.0+1.0/a/30.0*x^6.0-1.0/a/3.0*x^3.0-1.0/a*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/a/90.0/11.0*x^11.0+1.0/a/42.0/8.0*x^8.0+1.0/a/30.0/7.0*x^7.0-1.0/a/3.0/4.0*x^4.0-1.0/a*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/a/990.0*x^11.0+1.0/a/336.0*x^8.0+1.0/a/210.0*x^7.0-1.0/a/12.0*x^4.0-1.0/a*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "1.0/a*336.0*x^5.0+1.0/a*60.0*x^2.0+1.0/a*24.0*x-1.0/a*0.0-1.0/a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "1.0/a*336.0*5.0*x^4.0+1.0/a*60.0*2.0*x^1.0+1.0/a*24.0-1.0/a*0.0*0.0-1.0/a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1.0/a*1680.0*x^4.0+1.0/a*120.0*x+1.0/a*24.0-1.0/a*0.0-1.0/a*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/a/990.0*x^11.0+1.0/a/336.0*x^8.0+1.0/a/210.0*x^7.0-1.0/a/12.0*x^4.0-1.0/a*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/a/990.0/12.0*x^12.0+1.0/a/336.0/9.0*x^9.0+1.0/a/210.0/8.0*x^8.0-1.0/a/12.0/5.0*x^5.0-1.0/a*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/a/11880.0*x^12.0+1.0/a/3024.0*x^9.0+1.0/a/1680.0*x^8.0-1.0/a/60.0*x^5.0-1.0/a*2.0833333333333335*x^4.0";
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
        public static void TestCaseDiff50073() {
        //Test Case 50073
        UsageCalculus.TestCase = 50073;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0/1.0*a*b*c*d*x^8 + a*b*c*d*x^5 + a*b*c*d*x^4 - 2*x*a*b*c*d- 25*2*a*b*c*d";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a*b*c*d*x^8.0+a*b*c*d*x^5.0+a*b*c*d*x^4.0-a*b*c*d*2.0*x-a*b*c*d*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a*b*c*d*8.0*x^7.0+a*b*c*d*5.0*x^4.0+a*b*c*d*4.0*x^3.0-a*b*c*d*2.0-a*b*c*d*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a*b*c*d*8.0*x^7.0+a*b*c*d*5.0*x^4.0+a*b*c*d*4.0*x^3.0-a*b*c*d*2.0-a*b*c*d*0.0";
        UsageCalculus.EqnSolArrayMap3[1] = "a*b*c*d*x^8.0+a*b*c*d*x^5.0+a*b*c*d*x^4.0-a*b*c*d*2.0*x-a*b*c*d*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a*b*c*d/9.0*x^9.0+a*b*c*d/6.0*x^6.0+a*b*c*d/5.0*x^5.0-a*b*c*d*x^2.0-a*b*c*d*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a*b*c*d/9.0*x^9.0+a*b*c*d/6.0*x^6.0+a*b*c*d/5.0*x^5.0-a*b*c*d*x^2.0-a*b*c*d*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a*b*c*d*8.0*x^7.0+a*b*c*d*5.0*x^4.0+a*b*c*d*4.0*x^3.0-a*b*c*d*2.0-a*b*c*d*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a*b*c*d*8.0*7.0*x^6.0+a*b*c*d*5.0*4.0*x^3.0+a*b*c*d*4.0*3.0*x^2.0-a*b*c*d*2.0*0.0-a*b*c*d*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a*b*c*d*56.0*x^6.0+a*b*c*d*20.0*x^3.0+a*b*c*d*12.0*x^2.0-a*b*c*d*0.0-a*b*c*d*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a*b*c*d/9.0*x^9.0+a*b*c*d/6.0*x^6.0+a*b*c*d/5.0*x^5.0-a*b*c*d*x^2.0-a*b*c*d*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a*b*c*d/9.0/10.0*x^10.0+a*b*c*d/6.0/7.0*x^7.0+a*b*c*d/5.0/6.0*x^6.0-a*b*c*d/3.0*x^3.0-a*b*c*d*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a*b*c*d*0.011111111111111112*x^10.0+a*b*c*d*0.023809523809523808*x^7.0+a*b*c*d*0.03333333333333333*x^6.0-a*b*c*d/3.0*x^3.0-a*b*c*d*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a*b*c*d*56.0*x^6.0+a*b*c*d*20.0*x^3.0+a*b*c*d*12.0*x^2.0-a*b*c*d*0.0-a*b*c*d*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a*b*c*d*56.0*6.0*x^5.0+a*b*c*d*20.0*3.0*x^2.0+a*b*c*d*12.0*2.0*x^1.0-a*b*c*d*0.0-a*b*c*d*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a*b*c*d*336.0*x^5.0+a*b*c*d*60.0*x^2.0+a*b*c*d*24.0*x-a*b*c*d*0.0-a*b*c*d*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a*b*c*d*0.011111111111111112*x^10.0+a*b*c*d*0.023809523809523808*x^7.0+a*b*c*d*0.03333333333333333*x^6.0-a*b*c*d/3.0*x^3.0-a*b*c*d*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a*b*c*d*0.011111111111111112/11.0*x^11.0+a*b*c*d*0.023809523809523808/8.0*x^8.0+a*b*c*d*0.03333333333333333/7.0*x^7.0-a*b*c*d/3.0/4.0*x^4.0-a*b*c*d*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a*b*c*d*0.00101010101010101*x^11.0+a*b*c*d*0.002976190476190476*x^8.0+a*b*c*d*0.0047619047619047615*x^7.0-a*b*c*d*0.08333333333333333*x^4.0-a*b*c*d*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a*b*c*d*336.0*x^5.0+a*b*c*d*60.0*x^2.0+a*b*c*d*24.0*x-a*b*c*d*0.0-a*b*c*d*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a*b*c*d*336.0*5.0*x^4.0+a*b*c*d*60.0*2.0*x^1.0+a*b*c*d*24.0-a*b*c*d*0.0-a*b*c*d*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a*b*c*d*1680.0*x^4.0+a*b*c*d*120.0*x+a*b*c*d*24.0-a*b*c*d*0.0-a*b*c*d*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a*b*c*d*0.00101010101010101*x^11.0+a*b*c*d*0.002976190476190476*x^8.0+a*b*c*d*0.0047619047619047615*x^7.0-a*b*c*d*0.08333333333333333*x^4.0-a*b*c*d*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a*b*c*d*0.00101010101010101/12.0*x^12.0+a*b*c*d*0.002976190476190476/9.0*x^9.0+a*b*c*d*0.0047619047619047615/8.0*x^8.0-a*b*c*d*0.08333333333333333/5.0*x^5.0-a*b*c*d*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a*b*c*d*8.417508417508418E-5*x^12.0+a*b*c*d*3.3068783068783067E-4*x^9.0+a*b*c*d*5.952380952380952E-4*x^8.0-a*b*c*d*0.016666666666666666*x^5.0-a*b*c*d*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff50074() {
        //Test Case 50074
        UsageCalculus.TestCase = 50074;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0/1.0*a/b/c/d*x^8 + a/b/c/d*x^5 + a/b/c/d*x^4 - 2*x*a/b/c/d- 25*2*a/b/c/d";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a/b/c/d*x^8.0+a/b/c/d*x^5.0+a/b/c/d*x^4.0-a/b/c/d*2.0*x-a/b/c/d*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a/b/c/d*8.0*x^7.0+a/b/c/d*5.0*x^4.0+a/b/c/d*4.0*x^3.0-a/b/c/d*2.0-a/b/c/d*50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a/b/c/d*8.0*x^7.0+a/b/c/d*5.0*x^4.0+a/b/c/d*4.0*x^3.0-a/b/c/d*2.0-a/b/c/d*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="a/b/c/d*x^8.0+a/b/c/d*x^5.0+a/b/c/d*x^4.0-a/b/c/d*2.0*x-a/b/c/d*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a/b/c/d/9.0*x^9.0+a/b/c/d/6.0*x^6.0+a/b/c/d/5.0*x^5.0-a/b/c/d*x^2.0-a/b/c/d*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a/b/c/d/9.0*x^9.0+a/b/c/d/6.0*x^6.0+a/b/c/d/5.0*x^5.0-a/b/c/d*x^2.0-a/b/c/d*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a/b/c/d*8.0*x^7.0+a/b/c/d*5.0*x^4.0+a/b/c/d*4.0*x^3.0-a/b/c/d*2.0-a/b/c/d*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a/b/c/d*8.0*7.0*x^6.0+a/b/c/d*5.0*4.0*x^3.0+a/b/c/d*4.0*3.0*x^2.0-a/b/c/d*2.0*0.0-a/b/c/d*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a/b/c/d*56.0*x^6.0+a/b/c/d*20.0*x^3.0+a/b/c/d*12.0*x^2.0-a/b/c/d*0.0-a/b/c/d*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a/b/c/d/9.0*x^9.0+a/b/c/d/6.0*x^6.0+a/b/c/d/5.0*x^5.0-a/b/c/d*x^2.0-a/b/c/d*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a/b/c/d/9.0/10.0*x^10.0+a/b/c/d/6.0/7.0*x^7.0+a/b/c/d/5.0/6.0*x^6.0-a/b/c/d/3.0*x^3.0-a/b/c/d*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a/b/c/d*0.011111111111111112*x^10.0+a/b/c/d*0.023809523809523808*x^7.0+a/b/c/d*0.03333333333333333*x^6.0-a/b/c/d/3.0*x^3.0-a/b/c/d*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a/b/c/d*56.0*x^6.0+a/b/c/d*20.0*x^3.0+a/b/c/d*12.0*x^2.0-a/b/c/d*0.0-a/b/c/d*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a/b/c/d*56.0*6.0*x^5.0+a/b/c/d*20.0*3.0*x^2.0+a/b/c/d*12.0*2.0*x^1.0-a/b/c/d*0.0*0.0-a/b/c/d*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a/b/c/d*336.0*x^5.0+a/b/c/d*60.0*x^2.0+a/b/c/d*24.0*x-a/b/c/d*0.0-a/b/c/d*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a/b/c/d*0.011111111111111112*x^10.0+a/b/c/d*0.023809523809523808*x^7.0+a/b/c/d*0.03333333333333333*x^6.0-a/b/c/d/3.0*x^3.0-a/b/c/d*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a/b/c/d*0.011111111111111112/11.0*x^11.0+a/b/c/d*0.023809523809523808/8.0*x^8.0+a/b/c/d*0.03333333333333333/7.0*x^7.0-a/b/c/d/3.0/4.0*x^4.0-a/b/c/d*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a/b/c/d*0.00101010101010101*x^11.0+a/b/c/d*0.002976190476190476*x^8.0+a/b/c/d*0.0047619047619047615*x^7.0-a/b/c/d*0.08333333333333333*x^4.0-a/b/c/d*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a/b/c/d*336.0*x^5.0+a/b/c/d*60.0*x^2.0+a/b/c/d*24.0*x-a/b/c/d*0.0-a/b/c/d*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a/b/c/d*336.0*5.0*x^4.0+a/b/c/d*60.0*2.0*x^1.0+a/b/c/d*24.0-a/b/c/d*0.0*0.0-a/b/c/d*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a/b/c/d*1680.0*x^4.0+a/b/c/d*120.0*x+a/b/c/d*24.0-a/b/c/d*0.0-a/b/c/d*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a/b/c/d*0.00101010101010101*x^11.0+a/b/c/d*0.002976190476190476*x^8.0+a/b/c/d*0.0047619047619047615*x^7.0-a/b/c/d*0.08333333333333333*x^4.0-a/b/c/d*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a/b/c/d*0.00101010101010101/12.0*x^12.0+a/b/c/d*0.002976190476190476/9.0*x^9.0+a/b/c/d*0.0047619047619047615/8.0*x^8.0-a/b/c/d*0.08333333333333333/5.0*x^5.0-a/b/c/d*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a/b/c/d*8.417508417508418E-5*x^12.0+a/b/c/d*3.3068783068783067E-4*x^9.0+a/b/c/d*5.952380952380952E-4*x^8.0-a/b/c/d*0.016666666666666666*x^5.0-a/b/c/d*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff50075() {
        //Test Case 50075
        UsageCalculus.TestCase = 50075;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0/1.0*a*b/c*d*x^8 + a*b/c*d*x^5 + a*b/c*d*x^4 - 2*x*a*b/c*d- 25*2*a*b/c*d";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a*b/c*d*x^8.0+a*b/c*d*x^5.0+a*b/c*d*x^4.0-a*b/c*d*2.0*x-a*b/c*d*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a*b/c*d*8.0*x^7.0+a*b/c*d*5.0*x^4.0+a*b/c*d*4.0*x^3.0-a*b/c*d*2.0-a*b/c*d*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a*b/c*d*8.0*x^7.0+a*b/c*d*5.0*x^4.0+a*b/c*d*4.0*x^3.0-a*b/c*d*2.0-a*b/c*d*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="a*b/c*d*x^8.0+a*b/c*d*x^5.0+a*b/c*d*x^4.0-a*b/c*d*2.0*x-a*b/c*d*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a*b/c*d/9.0*x^9.0+a*b/c*d/6.0*x^6.0+a*b/c*d/5.0*x^5.0-a*b/c*d*x^2.0-a*b/c*d*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a*b/c*d/9.0*x^9.0+a*b/c*d/6.0*x^6.0+a*b/c*d/5.0*x^5.0-a*b/c*d*x^2.0-a*b/c*d*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a*b/c*d*8.0*x^7.0+a*b/c*d*5.0*x^4.0+a*b/c*d*4.0*x^3.0-a*b/c*d*2.0-a*b/c*d*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a*b/c*d*8.0*7.0*x^6.0+a*b/c*d*5.0*4.0*x^3.0+a*b/c*d*4.0*3.0*x^2.0-a*b/c*d*2.0*0.0-a*b/c*d*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a*b/c*d*56.0*x^6.0+a*b/c*d*20.0*x^3.0+a*b/c*d*12.0*x^2.0-a*b/c*d*0.0-a*b/c*d*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a*b/c*d/9.0*x^9.0+a*b/c*d/6.0*x^6.0+a*b/c*d/5.0*x^5.0-a*b/c*d*x^2.0-a*b/c*d*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a*b/c*d/9.0/10.0*x^10.0+a*b/c*d/6.0/7.0*x^7.0+a*b/c*d/5.0/6.0*x^6.0-a*b/c*d/3.0*x^3.0-a*b/c*d*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a*b/c*d*0.011111111111111112*x^10.0+a*b/c*d*0.023809523809523808*x^7.0+a*b/c*d*0.03333333333333333*x^6.0-a*b/c*d/3.0*x^3.0-a*b/c*d*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a*b/c*d*56.0*x^6.0+a*b/c*d*20.0*x^3.0+a*b/c*d*12.0*x^2.0-a*b/c*d*0.0-a*b/c*d*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a*b/c*d*56.0*6.0*x^5.0+a*b/c*d*20.0*3.0*x^2.0+a*b/c*d*12.0*2.0*x^1.0-a*b/c*d*0.0-a*b/c*d*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a*b/c*d*336.0*x^5.0+a*b/c*d*60.0*x^2.0+a*b/c*d*24.0*x-a*b/c*d*0.0-a*b/c*d*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a*b/c*d*0.011111111111111112*x^10.0+a*b/c*d*0.023809523809523808*x^7.0+a*b/c*d*0.03333333333333333*x^6.0-a*b/c*d/3.0*x^3.0-a*b/c*d*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a*b/c*d*0.011111111111111112/11.0*x^11.0+a*b/c*d*0.023809523809523808/8.0*x^8.0+a*b/c*d*0.03333333333333333/7.0*x^7.0-a*b/c*d/3.0/4.0*x^4.0-a*b/c*d*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a*b/c*d*0.00101010101010101*x^11.0+a*b/c*d*0.002976190476190476*x^8.0+a*b/c*d*0.0047619047619047615*x^7.0-a*b/c*d*0.08333333333333333*x^4.0-a*b/c*d*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a*b/c*d*336.0*x^5.0+a*b/c*d*60.0*x^2.0+a*b/c*d*24.0*x-a*b/c*d*0.0-a*b/c*d*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a*b/c*d*336.0*5.0*x^4.0+a*b/c*d*60.0*2.0*x^1.0+a*b/c*d*24.0-a*b/c*d*0.0-a*b/c*d*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a*b/c*d*1680.0*x^4.0+a*b/c*d*120.0*x+a*b/c*d*24.0-a*b/c*d*0.0-a*b/c*d*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a*b/c*d*0.00101010101010101*x^11.0+a*b/c*d*0.002976190476190476*x^8.0+a*b/c*d*0.0047619047619047615*x^7.0-a*b/c*d*0.08333333333333333*x^4.0-a*b/c*d*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a*b/c*d*0.00101010101010101/12.0*x^12.0+a*b/c*d*0.002976190476190476/9.0*x^9.0+a*b/c*d*0.0047619047619047615/8.0*x^8.0-a*b/c*d*0.08333333333333333/5.0*x^5.0-a*b/c*d*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a*b/c*d*8.417508417508418E-5*x^12.0+a*b/c*d*3.3068783068783067E-4*x^9.0+a*b/c*d*5.952380952380952E-4*x^8.0-a*b/c*d*0.016666666666666666*x^5.0-a*b/c*d*2.0833333333333335*x^4.0";
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
      // Repeat Cycle of 50001 to 50004 :Operators: * & /
      
       public static void TestCaseDiff50076() {
        //Test Case 50076
        UsageCalculus.TestCase = 50076;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0/1.0*a*b*c*d*p*x^8 + a*b*c*d*p*x^5 + a*b*c*d*p*x^4 - 2*x*a*b*c*d*p- 25*2*a*b*c*d*p";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a*b*c*d*p*x^8.0+a*b*c*d*p*x^5.0+a*b*c*d*p*x^4.0-a*b*c*d*p*2.0*x-a*b*c*d*p*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a*b*c*d*p*8.0*x^7.0+a*b*c*d*p*5.0*x^4.0+a*b*c*d*p*4.0*x^3.0-a*b*c*d*p*2.0-a*b*c*d*p*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a*b*c*d*p*8.0*x^7.0+a*b*c*d*p*5.0*x^4.0+a*b*c*d*p*4.0*x^3.0-a*b*c*d*p*2.0-a*b*c*d*p*0.0";
        UsageCalculus.EqnSolArrayMap3[1] = "a*b*c*d*p*x^8.0+a*b*c*d*p*x^5.0+a*b*c*d*p*x^4.0-a*b*c*d*p*2.0*x-a*b*c*d*p*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a*b*c*d*p/9.0*x^9.0+a*b*c*d*p/6.0*x^6.0+a*b*c*d*p/5.0*x^5.0-a*b*c*d*p*x^2.0-a*b*c*d*p*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a*b*c*d*p/9.0*x^9.0+a*b*c*d*p/6.0*x^6.0+a*b*c*d*p/5.0*x^5.0-a*b*c*d*p*x^2.0-a*b*c*d*p*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a*b*c*d*p*8.0*x^7.0+a*b*c*d*p*5.0*x^4.0+a*b*c*d*p*4.0*x^3.0-a*b*c*d*p*2.0-a*b*c*d*p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a*b*c*d*p*8.0*7.0*x^6.0+a*b*c*d*p*5.0*4.0*x^3.0+a*b*c*d*p*4.0*3.0*x^2.0-a*b*c*d*p*2.0*0.0-a*b*c*d*p*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a*b*c*d*p*56.0*x^6.0+a*b*c*d*p*20.0*x^3.0+a*b*c*d*p*12.0*x^2.0-a*b*c*d*p*0.0-a*b*c*d*p*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a*b*c*d*p/9.0*x^9.0+a*b*c*d*p/6.0*x^6.0+a*b*c*d*p/5.0*x^5.0-a*b*c*d*p*x^2.0-a*b*c*d*p*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a*b*c*d*p/9.0/10.0*x^10.0+a*b*c*d*p/6.0/7.0*x^7.0+a*b*c*d*p/5.0/6.0*x^6.0-a*b*c*d*p/3.0*x^3.0-a*b*c*d*p*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a*b*c*d*p*0.011111111111111112*x^10.0+a*b*c*d*p*0.023809523809523808*x^7.0+a*b*c*d*p*0.03333333333333333*x^6.0-a*b*c*d*p/3.0*x^3.0-a*b*c*d*p*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a*b*c*d*p*56.0*x^6.0+a*b*c*d*p*20.0*x^3.0+a*b*c*d*p*12.0*x^2.0-a*b*c*d*p*0.0-a*b*c*d*p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a*b*c*d*p*56.0*6.0*x^5.0+a*b*c*d*p*20.0*3.0*x^2.0+a*b*c*d*p*12.0*2.0*x^1.0-a*b*c*d*p*0.0-a*b*c*d*p*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a*b*c*d*p*336.0*x^5.0+a*b*c*d*p*60.0*x^2.0+a*b*c*d*p*24.0*x-a*b*c*d*p*0.0-a*b*c*d*p*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a*b*c*d*p*0.011111111111111112*x^10.0+a*b*c*d*p*0.023809523809523808*x^7.0+a*b*c*d*p*0.03333333333333333*x^6.0-a*b*c*d*p/3.0*x^3.0-a*b*c*d*p*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a*b*c*d*p*0.011111111111111112/11.0*x^11.0+a*b*c*d*p*0.023809523809523808/8.0*x^8.0+a*b*c*d*p*0.03333333333333333/7.0*x^7.0-a*b*c*d*p/3.0/4.0*x^4.0-a*b*c*d*p*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a*b*c*d*p*0.00101010101010101*x^11.0+a*b*c*d*p*0.002976190476190476*x^8.0+a*b*c*d*p*0.0047619047619047615*x^7.0-a*b*c*d*p*0.08333333333333333*x^4.0-a*b*c*d*p*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a*b*c*d*p*336.0*x^5.0+a*b*c*d*p*60.0*x^2.0+a*b*c*d*p*24.0*x-a*b*c*d*p*0.0-a*b*c*d*p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a*b*c*d*p*336.0*5.0*x^4.0+a*b*c*d*p*60.0*2.0*x^1.0+a*b*c*d*p*24.0-a*b*c*d*p*0.0-a*b*c*d*p*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a*b*c*d*p*1680.0*x^4.0+a*b*c*d*p*120.0*x+a*b*c*d*p*24.0-a*b*c*d*p*0.0-a*b*c*d*p*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a*b*c*d*p*0.00101010101010101*x^11.0+a*b*c*d*p*0.002976190476190476*x^8.0+a*b*c*d*p*0.0047619047619047615*x^7.0-a*b*c*d*p*0.08333333333333333*x^4.0-a*b*c*d*p*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a*b*c*d*p*0.00101010101010101/12.0*x^12.0+a*b*c*d*p*0.002976190476190476/9.0*x^9.0+a*b*c*d*p*0.0047619047619047615/8.0*x^8.0-a*b*c*d*p*0.08333333333333333/5.0*x^5.0-a*b*c*d*p*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a*b*c*d*p*8.417508417508418E-5*x^12.0+a*b*c*d*p*3.3068783068783067E-4*x^9.0+a*b*c*d*p*5.952380952380952E-4*x^8.0-a*b*c*d*p*0.016666666666666666*x^5.0-a*b*c*d*p*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff50077() {
        //Test Case 50077
        UsageCalculus.TestCase = 50077;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0/1.0*a/b/c/d/p*x^8 + a/b/c/d/p*x^5 + a/b/c/d/p*x^4 - 2*x*a/b/c/d/p- 25*2*a/b/c/d/p";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a/b/c/d/p*x^8.0+a/b/c/d/p*x^5.0+a/b/c/d/p*x^4.0-a/b/c/d/p*2.0*x-a/b/c/d/p*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a/b/c/d/p*8.0*x^7.0+a/b/c/d/p*5.0*x^4.0+a/b/c/d/p*4.0*x^3.0-a/b/c/d/p*2.0-a/b/c/d/p*50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a/b/c/d/p*8.0*x^7.0+a/b/c/d/p*5.0*x^4.0+a/b/c/d/p*4.0*x^3.0-a/b/c/d/p*2.0-a/b/c/d/p*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="a/b/c/d/p*x^8.0+a/b/c/d/p*x^5.0+a/b/c/d/p*x^4.0-a/b/c/d/p*2.0*x-a/b/c/d/p*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a/b/c/d/p/9.0*x^9.0+a/b/c/d/p/6.0*x^6.0+a/b/c/d/p/5.0*x^5.0-a/b/c/d/p*x^2.0-a/b/c/d/p*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a/b/c/d/p/9.0*x^9.0+a/b/c/d/p/6.0*x^6.0+a/b/c/d/p/5.0*x^5.0-a/b/c/d/p*x^2.0-a/b/c/d/p*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a/b/c/d/p*8.0*x^7.0+a/b/c/d/p*5.0*x^4.0+a/b/c/d/p*4.0*x^3.0-a/b/c/d/p*2.0-a/b/c/d/p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a/b/c/d/p*8.0*7.0*x^6.0+a/b/c/d/p*5.0*4.0*x^3.0+a/b/c/d/p*4.0*3.0*x^2.0-a/b/c/d/p*2.0*0.0-a/b/c/d/p*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a/b/c/d/p*56.0*x^6.0+a/b/c/d/p*20.0*x^3.0+a/b/c/d/p*12.0*x^2.0-a/b/c/d/p*0.0-a/b/c/d/p*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a/b/c/d/p/9.0*x^9.0+a/b/c/d/p/6.0*x^6.0+a/b/c/d/p/5.0*x^5.0-a/b/c/d/p*x^2.0-a/b/c/d/p*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a/b/c/d/p/9.0/10.0*x^10.0+a/b/c/d/p/6.0/7.0*x^7.0+a/b/c/d/p/5.0/6.0*x^6.0-a/b/c/d/p/3.0*x^3.0-a/b/c/d/p*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a/b/c/d/p*0.011111111111111112*x^10.0+a/b/c/d/p*0.023809523809523808*x^7.0+a/b/c/d/p*0.03333333333333333*x^6.0-a/b/c/d/p/3.0*x^3.0-a/b/c/d/p*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a/b/c/d/p*56.0*x^6.0+a/b/c/d/p*20.0*x^3.0+a/b/c/d/p*12.0*x^2.0-a/b/c/d/p*0.0-a/b/c/d/p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a/b/c/d/p*56.0*6.0*x^5.0+a/b/c/d/p*20.0*3.0*x^2.0+a/b/c/d/p*12.0*2.0*x^1.0-a/b/c/d/p*0.0*0.0-a/b/c/d/p*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a/b/c/d/p*336.0*x^5.0+a/b/c/d/p*60.0*x^2.0+a/b/c/d/p*24.0*x-a/b/c/d/p*0.0-a/b/c/d/p*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a/b/c/d/p*0.011111111111111112*x^10.0+a/b/c/d/p*0.023809523809523808*x^7.0+a/b/c/d/p*0.03333333333333333*x^6.0-a/b/c/d/p/3.0*x^3.0-a/b/c/d/p*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a/b/c/d/p*0.011111111111111112/11.0*x^11.0+a/b/c/d/p*0.023809523809523808/8.0*x^8.0+a/b/c/d/p*0.03333333333333333/7.0*x^7.0-a/b/c/d/p/3.0/4.0*x^4.0-a/b/c/d/p*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a/b/c/d/p*0.00101010101010101*x^11.0+a/b/c/d/p*0.002976190476190476*x^8.0+a/b/c/d/p*0.0047619047619047615*x^7.0-a/b/c/d/p*0.08333333333333333*x^4.0-a/b/c/d/p*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a/b/c/d/p*336.0*x^5.0+a/b/c/d/p*60.0*x^2.0+a/b/c/d/p*24.0*x-a/b/c/d/p*0.0-a/b/c/d/p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a/b/c/d/p*336.0*5.0*x^4.0+a/b/c/d/p*60.0*2.0*x^1.0+a/b/c/d/p*24.0-a/b/c/d/p*0.0*0.0-a/b/c/d/p*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a/b/c/d/p*1680.0*x^4.0+a/b/c/d/p*120.0*x+a/b/c/d/p*24.0-a/b/c/d/p*0.0-a/b/c/d/p*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a/b/c/d/p*0.00101010101010101*x^11.0+a/b/c/d/p*0.002976190476190476*x^8.0+a/b/c/d/p*0.0047619047619047615*x^7.0-a/b/c/d/p*0.08333333333333333*x^4.0-a/b/c/d/p*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a/b/c/d/p*0.00101010101010101/12.0*x^12.0+a/b/c/d/p*0.002976190476190476/9.0*x^9.0+a/b/c/d/p*0.0047619047619047615/8.0*x^8.0-a/b/c/d/p*0.08333333333333333/5.0*x^5.0-a/b/c/d/p*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a/b/c/d/p*8.417508417508418E-5*x^12.0+a/b/c/d/p*3.3068783068783067E-4*x^9.0+a/b/c/d/p*5.952380952380952E-4*x^8.0-a/b/c/d/p*0.016666666666666666*x^5.0-a/b/c/d/p*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff50078() {
        //Test Case 50078
        UsageCalculus.TestCase = 50078;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1/1*2*a^2*x- 25*2/a^3 + a^2/x^8 + a^2/x^5 + a^2/x^4 ";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a^2.0*2.0*x-1.0/a^3.0*50.0+a^2.0/x^8.0+a^2.0/x^5.0+a^2.0/x^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a^2.0*2.0-1.0/a^3.0*50.0*0.0+a^2.0*-8.0/x^9.0+a^2.0*-5.0/x^6.0+a^2.0*-4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a^2.0*2.0-1.0/a^3.0*0.0-a^2.0*8.0/x^9.0-a^2.0*5.0/x^6.0-a^2.0*4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap3[1]="a^2.0*2.0*x-1.0/a^3.0*50.0+a^2.0/x^8.0+a^2.0/x^5.0+a^2.0/x^4.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a^2.0*x^2.0-1.0/a^3.0*50.0*x+a^2.0/-7.0/x^7.0+a^2.0/-4.0/x^4.0+a^2.0/-3.0/x^3.0";
        UsageCalculus.EqnSolArrayMap4[1]="a^2.0*x^2.0-1.0/a^3.0*50.0*x-a^2.0/7.0/x^7.0-a^2.0/4.0/x^4.0-a^2.0/3.0/x^3.0";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a^2.0*2.0-1.0/a^3.0*0.0-a^2.0*8.0/x^9.0-a^2.0*5.0/x^6.0-a^2.0*4.0/x^5.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a^2.0*2.0*0.0-1.0/a^3.0*0.0*0.0-a^2.0*8.0*-9.0/x^10.0-a^2.0*5.0*-6.0/x^7.0-a^2.0*4.0*-5.0/x^6.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a^2.0*0.0-1.0/a^3.0*0.0+a^2.0*72.0/x^10.0+a^2.0*30.0/x^7.0+a^2.0*20.0/x^6.0";
        UsageCalculus.EqnSolArrayMap3[2]="a^2.0*x^2.0-1.0/a^3.0*50.0*x-a^2.0/7.0/x^7.0-a^2.0/4.0/x^4.0-a^2.0/3.0/x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a^2.0/3.0*x^3.0-1.0/a^3.0*50.0/2.0*x^2.0-a^2.0/7.0/-6.0/x^6.0-a^2.0/4.0/-3.0/x^3.0-a^2.0/3.0/-2.0/x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a^2.0/3.0*x^3.0-1.0/a^3.0*25.0*x^2.0+a^2.0/42.0/x^6.0+a^2.0/12.0/x^3.0+a^2.0/6.0/x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a^2.0*0.0-1.0/a^3.0*0.0+a^2.0*72.0/x^10.0+a^2.0*30.0/x^7.0+a^2.0*20.0/x^6.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a^2.0*0.0-1.0/a^3.0*0.0*0.0+a^2.0*72.0*-10.0/x^11.0+a^2.0*30.0*-7.0/x^8.0+a^2.0*20.0*-6.0/x^7.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a^2.0*0.0-1.0/a^3.0*0.0-a^2.0*720.0/x^11.0-a^2.0*210.0/x^8.0-a^2.0*120.0/x^7.0";
        UsageCalculus.EqnSolArrayMap3[3]="a^2.0/3.0*x^3.0-1.0/a^3.0*25.0*x^2.0+a^2.0/42.0/x^6.0+a^2.0/12.0/x^3.0+a^2.0/6.0/x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a^2.0/3.0/4.0*x^4.0-1.0/a^3.0*25.0/3.0*x^3.0+a^2.0/42.0/-5.0/x^5.0+a^2.0/12.0/-2.0/x^2.0+a^2.0/6.0/-1.0/x^1.0";
        UsageCalculus.EqnSolArrayMap4[3]="a^2.0/12.0*x^4.0-1.0/a^3.0*8.333333333333334*x^3.0-a^2.0/210.0/x^5.0-a^2.0/24.0/x^2.0-a^2.0/6.0/x";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a^2.0*0.0-1.0/a^3.0*0.0-a^2.0*720.0/x^11.0-a^2.0*209.99999999999997/x^8.0-a^2.0*120.0/x^7.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a^2.0*0.0-1.0/a^3.0*0.0*0.0-a^2.0*720.0*-11.0/x^12.0-a^2.0*209.99999999999997*-8.0/x^9.0-a^2.0*120.0*-7.0/x^8.";
        UsageCalculus.EqnSolArrayMap2[4] = "a^2.0*0.0-1.0/a^3.0*0.0+a^2.0*7920.0/x^12.0+a^2.0*1679.9999999999998/x^9.0+a^2.0*840.0/x^8.0";
        UsageCalculus.EqnSolArrayMap3[4]="a^2.0/12.0*x^4.0-1.0/a^3.0*8.333333333333334*x^3.0-a^2.0/209.99999999999997/x^5.0-a^2.0/24.0/x^2.0-a^2.0/6.0/x";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a^2.0/12.0/5.0*x^5.0-1.0/a^3.0*8.333333333333334/4.0*x^4.0-a^2.0/209.99999999999997/-4.0/x^4.0-a^2.0/24.0/-1.0/x^1.0-a^2.0/6.0*ln(x)";
        UsageCalculus.EqnSolArrayMap4[4]="a^2.0/60.0*x^5.0-1.0/a^3.0*2.0833333333333335*x^4.0+a^2.0/839.9999999999999/x^4.0+a^2.0/24.0/x-a^2.0/6.0*ln(x)";
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
       public static void TestCaseDiff50079() {
        //Test Case 50079
        UsageCalculus.TestCase = 50079;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1/1* 25*2/a^3 -2*a^2*x+ a^2/x^8 + a^2/x^5 + a^2/x^4 ";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 5;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/a^3.0*50.0-a^2.0*2.0*x+a^2.0/x^8.0+a^2.0/x^5.0+a^2.0/x^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/a^3.0*50.0*0.0-a^2.0*2.0+a^2.0*-8.0/x^9.0+a^2.0*-5.0/x^6.0+a^2.0*-4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0/a^3.0*0.0-a^2.0*2.0-a^2.0*8.0/x^9.0-a^2.0*5.0/x^6.0-a^2.0*4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/a^3.0*50.0-a^2.0*2.0*x+a^2.0/x^8.0+a^2.0/x^5.0+a^2.0/x^4.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/a^3.0*50.0*x-a^2.0*x^2.0+a^2.0/-7.0/x^7.0+a^2.0/-4.0/x^4.0+a^2.0/-3.0/x^3.0";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/a^3.0*50.0*x-a^2.0*x^2.0-a^2.0/7.0/x^7.0-a^2.0/4.0/x^4.0-a^2.0/3.0/x^3.0";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0/a^3.0*0.0-a^2.0*2.0-a^2.0*8.0/x^9.0-a^2.0*5.0/x^6.0-a^2.0*4.0/x^5.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "1.0/a^3.0*0.0-a^2.0*2.0*0.0-a^2.0*8.0*-9.0/x^10.0-a^2.0*5.0*-6.0/x^7.0-a^2.0*4.0*-5.0/x^6.0";
        UsageCalculus.EqnSolArrayMap2[2] = "1.0/a^3.0*0.0-a^2.0*0.0+a^2.0*72.0/x^10.0+a^2.0*30.0/x^7.0+a^2.0*20.0/x^6.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/a^3.0*50.0*x-a^2.0*x^2.0-a^2.0/7.0/x^7.0-a^2.0/4.0/x^4.0-a^2.0/3.0/x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/a^3.0*50.0/2.0*x^2.0-a^2.0/3.0*x^3.0-a^2.0/7.0/-6.0/x^6.0-a^2.0/4.0/-3.0/x^3.0-a^2.0/3.0/-2.0/x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/a^3.0*25.0*x^2.0-a^2.0/3.0*x^3.0+a^2.0/42.0/x^6.0+a^2.0/12.0/x^3.0+a^2.0/6.0/x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "1.0/a^3.0*0.0-a^2.0*0.0+a^2.0*72.0/x^10.0+a^2.0*30.0/x^7.0+a^2.0*20.0/x^6.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "1.0/a^3.0*0.0-a^2.0*0.0*0.0+a^2.0*72.0*-10.0/x^11.0+a^2.0*30.0*-7.0/x^8.0+a^2.0*20.0*-6.0/x^7.0";
        UsageCalculus.EqnSolArrayMap2[3] = "1.0/a^3.0*0.0-a^2.0*0.0-a^2.0*720.0/x^11.0-a^2.0*210.0/x^8.0-a^2.0*120.0/x^7.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/a^3.0*25.0*x^2.0-a^2.0/3.0*x^3.0+a^2.0/42.0/x^6.0+a^2.0/12.0/x^3.0+a^2.0/6.0/x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/a^3.0*25.0/3.0*x^3.0-a^2.0/3.0/4.0*x^4.0+a^2.0/42.0/-5.0/x^5.0+a^2.0/12.0/-2.0/x^2.0+a^2.0/6.0/-1.0/x^1.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/a^3.0*8.333333333333334*x^3.0-a^2.0*0.08333333333333333*x^4.0-a^2.0/210.0/x^5.0-a^2.0/24.0/x^2.0-a^2.0/6.0/x";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "1.0/a^3.0*0.0-a^2.0*0.0-a^2.0*720.0/x^11.0-a^2.0*209.99999999999997/x^8.0-a^2.0*120.0/x^7.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "1.0/a^3.0*0.0-a^2.0*0.0*0.0-a^2.0*720.0*-11.0/x^12.0-a^2.0*209.99999999999997*-8.0/x^9.0-a^2.0*120.0*-7.0/x^8.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1.0/a^3.0*0.0-a^2.0*0.0+a^2.0*7920.0/x^12.0+a^2.0*1679.9999999999998/x^9.0+a^2.0*840.0/x^8.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/a^3.0*8.333333333333334*x^3.0-a^2.0*0.08333333333333333*x^4.0-a^2.0/209.99999999999997/x^5.0-a^2.0/24.0/x^2.0-a^2.0/6.0/x";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/a^3.0*8.333333333333334/4.0*x^4.0-a^2.0*0.08333333333333333/5.0*x^5.0-a^2.0/209.99999999999997/-4.0/x^4.0-a^2.0/24.0/-1.0/x^1.0-a^2.0/6.0*ln(x)";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/a^3.0*2.0833333333333335*x^4.0-a^2.0*0.016666666666666666*x^5.0+a^2.0/839.9999999999999/x^4.0+a^2.0/24.0/x-a^2.0/6.0*ln(x)";
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
              
       public static void TestCaseDiff50080() {
        //Test Case 50080
        UsageCalculus.TestCase = 50080;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "2^a/x^8 + 2^a/x^5 + 2^a/x^4 - 2/x/2^a- 25/2/3^a";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "2.0^a/x^8.0+2.0^a/x^5.0+2.0^a/x^4.0-1.0/2.0^a*2.0/x-1.0/3.0^a*12.5";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "2.0^a*-8.0/x^9.0+2.0^a*-5.0/x^6.0+2.0^a*-4.0/x^5.0+1.0/2.0^a*2.0/x^2.0-1.0/3.0^a*12.5*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-2.0^a*8.0/x^9.0-2.0^a*5.0/x^6.0-2.0^a*4.0/x^5.0+1.0/2.0^a*2.0/x^2.0-1.0/3.0^a*0.0";
        UsageCalculus.EqnSolArrayMap3[1] = "2.0^a/x^8.0+2.0^a/x^5.0+2.0^a/x^4.0-1.0/2.0^a*2.0/x-1.0/3.0^a*12.5";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="2.0^a/-7.0/x^7.0+2.0^a/-4.0/x^4.0+2.0^a/-3.0/x^3.0-1.0/2.0^a*2.0*ln(x)-1.0/3.0^a*12.5*x";
        UsageCalculus.EqnSolArrayMap4[1]="-2.0^a/7.0/x^7.0-2.0^a/4.0/x^4.0-2.0^a/3.0/x^3.0-1.0/2.0^a*2.0*ln(x)-1.0/3.0^a*12.5*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-2.0^a*8.0/x^9.0-2.0^a*5.0/x^6.0-2.0^a*4.0/x^5.0+1.0/2.0^a*2.0/x^2.0-1.0/3.0^a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-2.0^a*8.0*-9.0/x^10.0-2.0^a*5.0*-6.0/x^7.0-2.0^a*4.0*-5.0/x^6.0+1.0/2.0^a*2.0*2.0*-2.0/x^3.0-1.0/3.0^a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "2.0^a*72.0/x^10.0+2.0^a*30.0/x^7.0+2.0^a*20.0/x^6.0-1.0/2.0^a*4.0/x^3.0-1.0/3.0^a*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "2.0^a*72.0/x^10.0+2.0^a*30.0/x^7.0+2.0^a*20.0/x^6.0-1.0/2.0^a*4.0/x^3.0-1.0/3.0^a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "2.0^a*72.0*-10.0/x^11.0+2.0^a*30.0*-7.0/x^8.0+2.0^a*20.0*-6.0/x^7.0-1.0/2.0^a*4.0*-3.0/x^4.0-1.0/3.0^a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-2.0^a*720.0/x^11.0-2.0^a*210.0/x^8.0-2.0^a*120.0/x^7.0+1.0/2.0^a*12.0/x^4.0-1.0/3.0^a*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-2.0^a*720.0/x^11.0-2.0^a*210.0/x^8.0-2.0^a*120.0/x^7.0+1.0/2.0^a*12.0/x^4.0-1.0/3.0^a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-2.0^a*720.0*-11.0/x^12.0-2.0^a*210.0*-8.0/x^9.0-2.0^a*120.0*-7.0/x^8.0+1.0/2.0^a*12.0*-4.0/x^5.0-1.0/3.0^a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "2.0^a*7920.0/x^12.0+2.0^a*1680.0/x^9.0+2.0^a*840.0/x^8.0-1.0/2.0^a*48.0/x^5.0-1.0/3.0^a*0.0";
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
       public static void TestCaseDiff50081() {
        //Test Case 50081
        UsageCalculus.TestCase = 50081;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1/1*a^2/x^8 + a^2/x^5 + a^2/x^4 - 2*x/a^2- 25*2/a^3";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 5;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a^2.0/x^8.0+a^2.0/x^5.0+a^2.0/x^4.0-1.0/a^2.0*2.0*x-1.0/a^3.0*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a^2.0*-8.0/x^9.0+a^2.0*-5.0/x^6.0+a^2.0*-4.0/x^5.0-1.0/a^2.0*2.0-1.0/a^3.0*50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-a^2.0*8.0/x^9.0-a^2.0*5.0/x^6.0-a^2.0*4.0/x^5.0-1.0/a^2.0*2.0-1.0/a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="a^2.0/x^8.0+a^2.0/x^5.0+a^2.0/x^4.0-1.0/a^2.0*2.0*x-1.0/a^3.0*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a^2.0/-7.0/x^7.0+a^2.0/-4.0/x^4.0+a^2.0/-3.0/x^3.0-1.0/a^2.0*2.0/2.0*x^2.0-1.0/a^3.0*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="-a^2.0/7.0/x^7.0-a^2.0/4.0/x^4.0-a^2.0/3.0/x^3.0-1.0/a^2.0*x^2.0-1.0/a^3.0*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-a^2.0*8.0/x^9.0-a^2.0*5.0/x^6.0-a^2.0*4.0/x^5.0-2.0/a^2.0-0.0/a^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="-a^2.0/7.0/x^7.0-a^2.0/4.0/x^4.0-a^2.0/3.0/x^3.0-1.0/a^2.0*x^2.0-1.0/a^3.0*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-a^2.0/7.0/-6.0/x^6.0-a^2.0/4.0/-3.0/x^3.0-a^2.0/3.0/-2.0/x^2.0-1.0/a^2.0/3.0*x^3.0-1.0/a^3.0*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a^2.0/42.0/x^6.0+a^2.0/12.0/x^3.0+a^2.0/6.0/x^2.0-1.0/a^2.0/3.0*x^3.0-1.0/a^3.0*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="a^2.0/42.0/x^6.0+a^2.0/12.0/x^3.0+a^2.0/6.0/x^2.0-1.0/a^2.0/3.0*x^3.0-1.0/a^3.0*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a^2.0/42.0/-5.0/x^5.0+a^2.0/12.0/-2.0/x^2.0+a^2.0/6.0/-1.0/x^1.0-1.0/a^2.0/3.0/4.0*x^4.0-1.0/a^3.0*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-a^2.0/210.0/x^5.0-a^2.0/24.0/x^2.0-a^2.0/6.0/x-1.0/a^2.0/12.0*x^4.0-1.0/a^3.0*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4]="-a^2.0/209.99999999999997/x^5.0-a^2.0/24.0/x^2.0-a^2.0/6.0/x-1.0/a^2.0/12.0*x^4.0-1.0/a^3.0*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="-a^2.0/209.99999999999997/-4.0/x^4.0-a^2.0/24.0/-1.0/x^1.0-a^2.0*6.0*ln(x)-1.0/a^2.0/12.0/5.0*x^5.0-1.0/a^3.0*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a^2.0/839.9999999999999/x^4.0+a^2.0/24.0/x-a^2.0*6.0*ln(x)-1.0/a^2.0/60.0*x^5.0-1.0/a^3.0*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff50082() {
        //Test Case 50082
        UsageCalculus.TestCase = 50082;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1/1*a^2/x^8 + a^2/x^5 + a^2/x^4 - 2*x*a^2- 25*2/a^3";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a^2.0/x^8.0+a^2.0/x^5.0+a^2.0/x^4.0-a^2.0*2.0*x-1.0/a^3.0*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a^2.0*-8.0/x^9.0+a^2.0*-5.0/x^6.0+a^2.0*-4.0/x^5.0-a^2.0*2.0-1.0/a^3.0*50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-a^2.0*8.0/x^9.0-a^2.0*5.0/x^6.0-a^2.0*4.0/x^5.0-a^2.0*2.0-1.0/a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="a^2.0/x^8.0+a^2.0/x^5.0+a^2.0/x^4.0-a^2.0*2.0*x-1.0/a^3.0*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a^2.0/-7.0/x^7.0+a^2.0/-4.0/x^4.0+a^2.0/-3.0/x^3.0-a^2.0*x^2.0-1.0/a^3.0*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="-a^2.0/7.0/x^7.0-a^2.0/4.0/x^4.0-a^2.0/3.0/x^3.0-a^2.0*x^2.0-1.0/a^3.0*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-a^2.0*8.0/x^9.0-a^2.0*5.0/x^6.0-a^2.0*4.0/x^5.0-a^2.0*2.0-1.0/a^3.0*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-a^2.0*-9.0/x^10.0-a^2.0*-6.0/x^7.0-a^2.0*-5.0/x^6.0-a^2.0-1.0/a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a^2.0*9.0/x^10.0+a^2.0*6.0/x^7.0+a^2.0*5.0/x^6.0-a^2.0-1.0/a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="-a^2.0/7.0/x^7.0-a^2.0/4.0/x^4.0-a^2.0/3.0/x^3.0-a^2.0*x^2.0-1.0/a^3.0*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-a^2.0/7.0/-6.0/x^6.0-a^2.0/4.0/-3.0/x^3.0-a^2.0/3.0/-2.0/x^2.0-a^2.0/3.0*x^3.0-1.0/a^3.0*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a^2.0/42.0/x^6.0+a^2.0/12.0/x^3.0+a^2.0/6.0/x^2.0-a^2.0/3.0*x^3.0-1.0/a^3.0*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a^2.0*72.0/x^10.0+a^2.0*30.0/x^7.0+a^2.0*20.0/x^6.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a^2.0*72.0*-10.0/x^11.0+a^2.0*30.0*-7.0/x^8.0+a^2.0*20.0*-6.0/x^7.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-a^2.0*720.0/x^11.0-a^2.0*210.0/x^8.0-a^2.0*120.0/x^7.0";
        UsageCalculus.EqnSolArrayMap3[3]="a^2.0/42.0/x^6.0+a^2.0/12.0/x^3.0+a^2.0/6.0/x^2.0-a^2.0/3.0*x^3.0-1.0/a^3.0*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a^2.0/42.0/-5.0/x^5.0+a^2.0/12.0/-2.0/x^2.0+a^2.0/6.0/-1.0/x^1.0-a^2.0/3.0/4.0*x^4.0-1.0/a^3.0*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-a^2.0/210.0/x^5.0-a^2.0/24.0/x^2.0-a^2.0/6.0/x-a^2.0/12.0*x^4.0-1.0/a^3.0*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-a^2.0*720.0/x^11.0-a^2.0*210.0/x^8.0-a^2.0*120.0/x^7.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-a^2.0*720.0*-11.0/x^12.0-a^2.0*210.0*-8.0/x^9.0-a^2.0*120.0*-7.0/x^8.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a^2.0*7920.0/x^12.0+a^2.0*1680.0/x^9.0+a^2.0*840.0/x^8.0";
        UsageCalculus.EqnSolArrayMap3[4]="-a^2.0/209.99999999999997/x^5.0-a^2.0/24.0/x^2.0-a^2.0/6.0/x-a^2.0/12.0*x^4.0-1.0/a^3.0*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="-a^2.0/209.99999999999997/-4.0/x^4.0-a^2.0/24.0/-1.0/x^1.0-a^2.0*6.0*ln(x)-a^2.0/12.0/5.0*x^5.0-1.0/a^3.0*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a^2.0/839.9999999999999/x^4.0+a^2.0/24.0/x-a^2.0*6.0*ln(x)-a^2.0/60.0*x^5.0-1.0/a^3.0*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff50083() {
        //Test Case 50083
        UsageCalculus.TestCase = 50083;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1/1*2*x*a^2- 25*2/a^3 + a^2/x^8 + a^2/x^5 + a^2/x^4 ";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a^2.0*2.0*x-1.0/a^3.0*50.0+a^2.0/x^8.0+a^2.0/x^5.0+a^2.0/x^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a^2.0*2.0-1.0/a^3.0*50.0*0.0+a^2.0*-8.0/x^9.0+a^2.0*-5.0/x^6.0+a^2.0*-4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a^2.0*2.0-1.0/a^3.0*0.0-a^2.0*8.0/x^9.0-a^2.0*5.0/x^6.0-a^2.0*4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap3[1]="a^2.0*2.0*x-1.0/a^3.0*50.0+a^2.0/x^8.0+a^2.0/x^5.0+a^2.0/x^4.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a^2.0*x^2.0-1.0/a^3.0*50.0*x+a^2.0/-7.0/x^7.0+a^2.0/-4.0/x^4.0+a^2.0/-3.0/x^3.0";
        UsageCalculus.EqnSolArrayMap4[1]="a^2.0*x^2.0-1.0/a^3.0*50.0*x-a^2.0/7.0/x^7.0-a^2.0/4.0/x^4.0-a^2.0/3.0/x^3.0";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a^2.0*2.0-1.0/a^3.0*0.0-a^2.0*8.0/x^9.0-a^2.0*5.0/x^6.0-a^2.0*4.0/x^5.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a^2.0*2.0*0.0-1.0/a^3.0*0.0*0.0-a^2.0*8.0*-9.0/x^10.0-a^2.0*5.0*-6.0/x^7.0-a^2.0*4.0*-5.0/x^6.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a^2.0*0.0-1.0/a^3.0*0.0+a^2.0*72.0/x^10.0+a^2.0*30.0/x^7.0+a^2.0*20.0/x^6.0";
        UsageCalculus.EqnSolArrayMap3[2]="a^2.0*x^2.0-1.0/a^3.0*50.0*x-a^2.0/7.0/x^7.0-a^2.0/4.0/x^4.0-a^2.0/3.0/x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a^2.0/3.0*x^3.0-1.0/a^3.0*50.0/2.0*x^2.0-a^2.0/7.0/-6.0/x^6.0-a^2.0/4.0/-3.0/x^3.0-a^2.0/3.0/-2.0/x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a^2.0/3.0*x^3.0-1.0/a^3.0*25.0*x^2.0+a^2.0/42.0/x^6.0+a^2.0/12.0/x^3.0+a^2.0/6.0/x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a^2.0*0.0-1.0/a^3.0*0.0+a^2.0*72.0/x^10.0+a^2.0*30.0/x^7.0+a^2.0*20.0/x^6.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a^2.0*0.0-1.0/a^3.0*0.0*0.0+a^2.0*72.0*-10.0/x^11.0+a^2.0*30.0*-7.0/x^8.0+a^2.0*20.0*-6.0/x^7.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a^2.0*0.0-1.0/a^3.0*0.0-a^2.0*720.0/x^11.0-a^2.0*210.0/x^8.0-a^2.0*120.0/x^7.0";
        UsageCalculus.EqnSolArrayMap3[3]="a^2.0/3.0*x^3.0-1.0/a^3.0*25.0*x^2.0+a^2.0/42.0/x^6.0+a^2.0/12.0/x^3.0+a^2.0/6.0/x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a^2.0/3.0/4.0*x^4.0-1.0/a^3.0*25.0/3.0*x^3.0+a^2.0/42.0/-5.0/x^5.0+a^2.0/12.0/-2.0/x^2.0+a^2.0/6.0/-1.0/x^1.0";
        UsageCalculus.EqnSolArrayMap4[3]="a^2.0/12.0*x^4.0-1.0/a^3.0*8.333333333333334*x^3.0-a^2.0/210.0/x^5.0-a^2.0/24.0/x^2.0-a^2.0/6.0/x";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a^2.0*0.0-1.0/a^3.0*0.0-a^2.0*720.0/x^11.0-a^2.0*209.99999999999997/x^8.0-a^2.0*120.0/x^7.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a^2.0*0.0-1.0/a^3.0*0.0*0.0-a^2.0*720.0*-11.0/x^12.0-a^2.0*209.99999999999997*-8.0/x^9.0-a^2.0*120.0*-7.0/x^8.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a^2.0*0.0-1.0/a^3.0*0.0+a^2.0*7920.0/x^12.0+a^2.0*1679.9999999999998/x^9.0+a^2.0*840.0/x^8.0";
        UsageCalculus.EqnSolArrayMap3[4]="a^2.0/12.0*x^4.0-1.0/a^3.0*8.333333333333334*x^3.0-a^2.0/209.99999999999997/x^5.0-a^2.0/24.0/x^2.0-a^2.0/6.0/x";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a^2.0/12.0/5.0*x^5.0-1.0/a^3.0*8.333333333333334/4.0*x^4.0-a^2.0/209.99999999999997/-4.0/x^4.0-a^2.0/24.0/-1.0/x^1.0-a^2.0/6.0*ln(x)";
        UsageCalculus.EqnSolArrayMap4[4]="a^2.0/60.0*x^5.0-1.0/a^3.0*2.0833333333333335*x^4.0+a^2.0/839.9999999999999/x^4.0+a^2.0/24.0/x-a^2.0/6.0*ln(x)";
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
       public static void TestCaseDiff50084() {
        //Test Case 50084
        UsageCalculus.TestCase = 50084;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1/1* 25*2/a^3 -2*x*a^2+ a^2/x^8 + a^2/x^5 + a^2/x^4 ";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/a^3.0*50.0-a^2.0*2.0*x+a^2.0/x^8.0+a^2.0/x^5.0+a^2.0/x^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/a^3.0*50.0*0.0-a^2.0*2.0+a^2.0*-8.0/x^9.0+a^2.0*-5.0/x^6.0+a^2.0*-4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0/a^3.0*0.0-a^2.0*2.0-a^2.0*8.0/x^9.0-a^2.0*5.0/x^6.0-a^2.0*4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/a^3.0*50.0-a^2.0*2.0*x+a^2.0/x^8.0+a^2.0/x^5.0+a^2.0/x^4.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/a^3.0*50.0*x-a^2.0*x^2.0+a^2.0/-7.0/x^7.0+a^2.0/-4.0/x^4.0+a^2.0/-3.0/x^3.0";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/a^3.0*50.0*x-a^2.0*x^2.0-a^2.0/7.0/x^7.0-a^2.0/4.0/x^4.0-a^2.0/3.0/x^3.0";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0/a^3.0*0.0-a^2.0*2.0-a^2.0*8.0/x^9.0-a^2.0*5.0/x^6.0-a^2.0*4.0/x^5.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "1.0/a^3.0*0.0-a^2.0*2.0*0.0-a^2.0*8.0*-9.0/x^10.0-a^2.0*5.0*-6.0/x^7.0-a^2.0*4.0*-5.0/x^6.0";
        UsageCalculus.EqnSolArrayMap2[2] = "1.0/a^3.0*0.0-a^2.0*0.0+a^2.0*72.0/x^10.0+a^2.0*30.0/x^7.0+a^2.0*20.0/x^6.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/a^3.0*50.0*x-a^2.0*x^2.0-a^2.0/7.0/x^7.0-a^2.0/4.0/x^4.0-a^2.0/3.0/x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/a^3.0*50.0/2.0*x^2.0-a^2.0/3.0*x^3.0-a^2.0/7.0/-6.0/x^6.0-a^2.0/4.0/-3.0/x^3.0-a^2.0*3.0/-2.0/x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/a^3.0*25.0*x^2.0-a^2.0/3.0*x^3.0+a^2.0/42.0/x^6.0+a^2.0/12.0/x^3.0+a^2.0/6.0/x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "1.0/a^3.0*0.0-a^2.0*0.0+a^2.0*72.0/x^10.0+a^2.0*30.0/x^7.0+a^2.0*20.0/x^6.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "1.0/a^3.0*0.0-a^2.0*0.0*0.0+a^2.0*72.0*-10.0/x^11.0+a^2.0*30.0*-7.0/x^8.0+a^2.0*20.0*-6.0/x^7.0";
        UsageCalculus.EqnSolArrayMap2[3] = "1.0/a^3.0*0.0-a^2.0*0.0-a^2.0*720.0/x^11.0-a^2.0*210.0/x^8.0-a^2.0*120.0/x^7.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/a^3.0*25.0*x^2.0-a^2.0/3.0*x^3.0+a^2.0/42.0/x^6.0+a^2.0/12.0/x^3.0+a^2.0/6.0/x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/a^3.0*25.0/3.0*x^3.0-a^2.0/3.0/4.0*x^4.0+a^2.0/42.0/-5.0/x^5.0+a^2.0/12.0/-2.0/x^2.0+a^2.0*1.5/-1.0/x^1.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/a^3.0*8.333333333333334*x^3.0-a^2.0*0.08333333333333333*x^4.0-a^2.0/210.0/x^5.0-a^2.0/24.0/x^2.0-a^2.0/6.0/x";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "1.0/a^3.0*0.0-a^2.0*0.0-a^2.0*720.0/x^11.0-a^2.0*209.99999999999997/x^8.0-a^2.0*120.0/x^7.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "1.0/a^3.0*0.0-a^2.0*0.0*0.0-a^2.0*720.0*-11.0/x^12.0-a^2.0*209.99999999999997*-8.0/x^9.0-a^2.0*120.0*-7.0/x^8.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1.0/a^3.0*0.0-a^2.0*0.0+a^2.0*7920.0/x^12.0+a^2.0*1679.9999999999998/x^9.0+a^2.0*840.0/x^8.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/a^3.0*8.333333333333334*x^3.0-a^2.0*0.08333333333333333*x^4.0-a^2.0/209.99999999999997/x^5.0-a^2.0/24.0/x^2.0-a^2.0/6.0/x";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/a^3.0*8.333333333333334/4.0*x^4.0-a^2.0*0.08333333333333333/5.0*x^5.0-a^2.0/209.99999999999997/-4.0/x^4.0-a^2.0/24.0/-1.0/x^1.0-a^2.0/6.0*ln(x)";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/a^3.0*2.0833333333333335*x^4.0-a^2.0*0.016666666666666666*x^5.0+a^2.0/839.9999999999999/x^4.0+a^2.0/24.0/x-a^2.0/6.0*ln(x)";
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
       public static void TestCaseDiff50085() {
        //Test Case 50085
        UsageCalculus.TestCase = 50085;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1/1* 25*2/a^3 -2*a^2*x+ a^2/x^8 + a^2/x^5 + a^2/x^4 +25*2/a^3-2*a^2*x";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 5;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/a^3.0*50.0-a^2.0*2.0*x+a^2.0/x^8.0+a^2.0/x^5.0+a^2.0/x^4.0+1.0/a^3.0*50.0-a^2.0*2.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/a^3.0*50.0*0.0-a^2.0*2.0+a^2.0*-8.0/x^9.0+a^2.0*-5.0/x^6.0+a^2.0*-4.0/x^5.0+1.0/a^3.0*50.0*0.0-a^2.0*2.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0/a^3.0*0.0-a^2.0*2.0-a^2.0*8.0/x^9.0-a^2.0*5.0/x^6.0-a^2.0*4.0/x^5.0+1.0/a^3.0*0.0-a^2.0*2.0";
        UsageCalculus.EqnSolArrayMap3[1] = "1.0/a^3.0*50.0-a^2.0*2.0*x+a^2.0/x^8.0+a^2.0/x^5.0+a^2.0/x^4.0+1.0/a^3.0*50.0-a^2.0*2.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/a^3.0*50.0*x-a^2.0*x^2.0+a^2.0/-7.0/x^7.0+a^2.0/-4.0/x^4.0+a^2.0/-3.0/x^3.0+1.0/a^3.0*50.0*x-a^2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/a^3.0*50.0*x-a^2.0*x^2.0-a^2.0/7.0/x^7.0-a^2.0/4.0/x^4.0-a^2.0/3.0/x^3.0+1.0/a^3.0*50.0*x-a^2.0*x^2.0";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0/a^3.0*0.0-a^2.0*2.0-a^2.0*8.0/x^9.0-a^2.0*5.0/x^6.0-a^2.0*4.0/x^5.0+1.0/a^3.0*0.0-a^2.0*2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "1.0/a^3.0*0.0-a^2.0*2.0*0.0-a^2.0*8.0*-9.0/x^10.0-a^2.0*5.0*-6.0/x^7.0-a^2.0*4.0*-5.0/x^6.0+1.0/a^3.0*0.0*0.0-a^2.0*2.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "1.0/a^3.0*0.0-a^2.0*0.0+a^2.0*72.0/x^10.0+a^2.0*30.0/x^7.0+a^2.0*20.0/x^6.0+1.0/a^3.0*0.0-a^2.0*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/a^3.0*50.0*x-a^2.0*x^2.0-a^2.0/7.0/x^7.0-a^2.0/4.0/x^4.0-a^2.0/3.0/x^3.0+1.0/a^3.0*50.0*x-a^2.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/a^3.0*50.0/2.0*x^2.0-a^2.0/3.0*x^3.0-a^2.0/7.0/-6.0/x^6.0-a^2.0/4.0/-3.0/x^3.0-a^2.0/3.0/-2.0/x^2.0+1.0/a^3.0*50.0/2.0*x^2.0-a^2.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/a^3.0*25.0*x^2.0-a^2.0/3.0*x^3.0+a^2.0/42.0/x^6.0+a^2.0/12.0/x^3.0+a^2.0/6.0/x^2.0+1.0/a^3.0*25.0*x^2.0-a^2.0/3.0*x^3.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "1.0/a^3.0*0.0-a^2.0*0.0+a^2.0*72.0/x^10.0+a^2.0*30.0/x^7.0+a^2.0*20.0/x^6.0+1.0/a^3.0*0.0-a^2.0*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "1.0/a^3.0*0.0-a^2.0*0.0*0.0+a^2.0*72.0*-10.0/x^11.0+a^2.0*30.0*-7.0/x^8.0+a^2.0*20.0*-6.0/x^7.0+1.0/a^3.0*0.0*0.0-a^2.0*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "1.0/a^3.0*0.0-a^2.0*0.0-a^2.0*720.0/x^11.0-a^2.0*210.0/x^8.0-a^2.0*120.0/x^7.0+1.0/a^3.0*0.0-a^2.0*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/a^3.0*25.0*x^2.0-a^2.0/3.0*x^3.0+a^2.0/42.0/x^6.0+a^2.0/12.0/x^3.0+a^2.0/6.0/x^2.0+1.0/a^3.0*25.0*x^2.0-a^2.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/a^3.0*25.0/3.0*x^3.0-a^2.0/3.0/4.0*x^4.0+a^2.0/42.0/-5.0/x^5.0+a^2.0/12.0/-2.0/x^2.0+a^2.0/6.0/-1.0/x^1.0+1.0/a^3.0*25.0/3.0*x^3.0-a^2.0/3.0/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/a^3.0*8.333333333333334*x^3.0-a^2.0*0.08333333333333333*x^4.0-a^2.0/210.0/x^5.0-a^2.0/24.0/x^2.0-a^2.0/6.0/x+1.0/a^3.0*8.333333333333334*x^3.0-a^2.0/12.0*x^4.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "1.0/a^3.0*0.0-a^2.0*0.0-a^2.0*720.0/x^11.0-a^2.0*209.99999999999997/x^8.0-a^2.0*120.0/x^7.0+1.0/a^3.0*0.0-a^2.0*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "1.0/a^3.0*0.0-a^2.0*0.0*0.0-a^2.0*720.0*-11.0/x^12.0-a^2.0*209.99999999999997*-8.0/x^9.0-a^2.0*120.0*-7.0/x^8.0+1.0/a^3.0*0.0*0.0-a^2.0*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1.0/a^3.0*0.0-a^2.0*0.0+a^2.0*7920.0/x^12.0+a^2.0*1679.9999999999998/x^9.0+a^2.0*840.0/x^8.0+1.0/a^3.0*0.0-a^2.0*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/a^3.0*8.333333333333334*x^3.0-a^2.0*0.08333333333333333*x^4.0-a^2.0/209.99999999999997/x^5.0-a^2.0/24.0/x^2.0-a^2.0/6.0/x+1.0/a^3.0*8.333333333333334*x^3.0-a^2.0/12.0*x^4.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/a^3.0*8.333333333333334/4.0*x^4.0-a^2.0*0.08333333333333333/5.0*x^5.0-a^2.0/209.99999999999997/-4.0/x^4.0-a^2.0/24.0/-1.0/x^1.0-a^2.0*6.0*ln(x)+1.0/a^3.0*8.333333333333334/4.0*x^4.0-a^2.0/12.0/5.0*x^5.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/a^3.0*2.0833333333333335*x^4.0-a^2.0*0.016666666666666666*x^5.0+a^2.0/839.9999999999999/x^4.0+a^2.0/24.0/x-a^2.0*6.0*ln(x)+1.0/a^3.0*2.0833333333333335*x^4.0-a^2.0/60.0*x^5.0";
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
       public static void TestCaseDiff50086() {
        //Test Case 50086
        UsageCalculus.TestCase = 50086;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "-1/1* 25*(2) - 2/a/x + a/x^8 + a/x^5 + a/x^4 - 2/a/x- 25*(2)";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-50.0-1.0/a*2.0/x+a/x^8.0+a/x^5.0+a/x^4.0-1.0/a*2.0/x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0+1.0/a*2.0/x^2.0+a*-8.0/x^9.0+a*-5.0/x^6.0+a*-4.0/x^5.0+1.0/a*2.0/x^2.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0/a*2.0/x^2.0-a*8.0/x^9.0-a*5.0/x^6.0-a*4.0/x^5.0+1.0/a*2.0/x^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="-50.0-1.0/a*2.0/x+a/x^8.0+a/x^5.0+a/x^4.0-1.0/a*2.0/x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-50.0*x-1.0/a*2.0*ln(x)+a/-7.0/x^7.0+a/-4.0/x^4.0+a/-3.0/x^3.0-1.0/a*2.0*ln(x)-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="-50.0*x-1.0/a*2.0*ln(x)-a/7.0/x^7.0-a/4.0/x^4.0-a/3.0/x^3.0-1.0/a*2.0*ln(x)-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0/a*2.0/x^2.0-a*8.0/x^9.0-a*5.0/x^6.0-a*4.0/x^5.0+1.0/a*2.0/x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "1.0/a*2.0*2.0*-2.0/x^3.0-a*8.0*-9.0/x^10.0-a*5.0*-6.0/x^7.0-a*4.0*-5.0/x^6.0+1.0/a*2.0*2.0*-2.0/x^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-1.0/a*8.0/x^3.0+a*72.0/x^10.0+a*30.0/x^7.0+a*20.0/x^6.0-1.0/a*8.0/x^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-1.0/a*4.0/x^3.0+a*72.0/x^10.0+a*30.0/x^7.0+a*20.0/x^6.0-1.0/a*4.0/x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-1.0/a*4.0*-3.0/x^4.0+a*72.0*-10.0/x^11.0+a*30.0*-7.0/x^8.0+a*20.0*-6.0/x^7.0-1.0/a*4.0*-3.0/x^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "1.0/a*12.0/x^4.0-a*720.0/x^11.0-a*210.0/x^8.0-a*120.0/x^7.0+1.0/a*12.0/x^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "1.0/a*12.0/x^4.0-a*720.0/x^11.0-a*209.99999999999997/x^8.0-a*120.0/x^7.0+1.0/a*12.0/x^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "1.0/a*12.0*-4.0/x^5.0-a*720.0*-11.0/x^12.0-a*209.99999999999997*-8.0/x^9.0-a*120.0*-7.0/x^8.0+1.0/a*12.0*-4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-1.0/a*48.0/x^5.0+a*7920.0/x^12.0+a*1679.9999999999998/x^9.0+a*840.0/x^8.0-1.0/a*48.0/x^5.0";
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
       public static void TestCaseDiff50087() {
        //Test Case 50087
        UsageCalculus.TestCase = 50087;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "-1/-1*a*0.0-25";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a*0.0-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a*0.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="a*0.0-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="0.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a*0.0";
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
       public static void TestCaseDiff50088() {
        //Test Case 50088
        UsageCalculus.TestCase = 50088;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "-1/-1*a*1.0-25";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a*0.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="a-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a*x-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a*x-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a*x-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a/2.0*x^2.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a/2.0*x^2.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a/2.0*x^2.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a/2.0/3.0*x^3.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a/6.0*x^3.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a/6.0*x^3.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a/6.0/4.0*x^4.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a/24.0*x^4.0-1.0416666666666667*x^4.0";
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
       
       
       public static void TestCaseDiff50089() {
        //Test Case 50089
        UsageCalculus.TestCase = 50089;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "-1/-1*Xn^5+c";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "Xn";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "Xn^5.0+c";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "5.0*Xn^4.0+c*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "5.0*Xn^4.0+c*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="Xn^5.0+c";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/6.0*Xn^6.0+c*Xn";
        UsageCalculus.EqnSolArrayMap4[1]="0.16666666666666666*Xn^6.0+c*Xn";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "5.0*Xn^4.0+c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "5.0*4.0*Xn^3.0+c*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "20.0*Xn^3.0+c*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="0.16666666666666666*Xn^6.0+c*Xn";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="0.16666666666666666/7.0*Xn^7.0+c/2.0*Xn^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="0.023809523809523808*Xn^7.0+c/2.0*Xn^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "20.0*Xn^3.0+c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "20.0*3.0*Xn^2.0+c*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "60.0*Xn^2.0+c*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="0.023809523809523808*Xn^7.0+c/2.0*Xn^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="0.023809523809523808/8.0*Xn^8.0+c*2.0/3.0*Xn^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="0.002976190476190476*Xn^8.0+c/6.0*Xn^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "60.0*Xn^2.0+c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "60.0*2.0*Xn^1.0+c*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "120.0*Xn+c*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="0.002976190476190476*Xn^8.0+c/6.0*Xn^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="0.002976190476190476/9.0*Xn^9.0+c/6.0/4.0*Xn^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="3.3068783068783067E-4*Xn^9.0+c/24.0*Xn^4.0";
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
       public static void TestCaseDiff50090() {
        //Test Case 50090
        UsageCalculus.TestCase = 50090;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "-1/-1*1.0*Xn^5+c";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "Xn";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "Xn^5.0+c";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "5.0*Xn^4.0+c*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "5.0*Xn^4.0+c*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="Xn^5.0+c";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/6.0*Xn^6.0+c*Xn";
        UsageCalculus.EqnSolArrayMap4[1]="0.16666666666666666*Xn^6.0+c*Xn";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "5.0*Xn^4.0+c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "5.0*4.0*Xn^3.0+c*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "20.0*Xn^3.0+c*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="0.16666666666666666*Xn^6.0+c*Xn";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="0.16666666666666666/7.0*Xn^7.0+c/2.0*Xn^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="0.023809523809523808*Xn^7.0+c/2.0*Xn^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "20.0*Xn^3.0+c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "20.0*3.0*Xn^2.0+c*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "60.0*Xn^2.0+c*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="0.023809523809523808*Xn^7.0+c/2.0*Xn^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="0.023809523809523808/8.0*Xn^8.0+c/2.0/3.0*Xn^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="0.002976190476190476*Xn^8.0+c/6.0*Xn^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "60.0*Xn^2.0+c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "60.0*2.0*Xn^1.0+c*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "120.0*Xn+c*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="0.002976190476190476*Xn^8.0+c/6.0*Xn^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="0.002976190476190476/9.0*Xn^9.0+c/6.0/4.0*Xn^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="3.3068783068783067E-4*Xn^9.0+c/24.0*Xn^4.0";
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
       public static void TestCaseDiff50091() {
        //Test Case 50091
        UsageCalculus.TestCase = 50091;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "-1/-1*m*Xn+c";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "Xn";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "m*Xn+c";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "m+c*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "m+c*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="m*Xn+c";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="m/2.0*Xn^2.0+c*Xn";
        UsageCalculus.EqnSolArrayMap4[1]="m/2.0*Xn^2.0+c*Xn";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "m+c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "m*0.0+c*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "m*0.0+c*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="m/2.0*Xn^2.0+c*Xn";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="m/2.0/3.0*Xn^3.0+c/2.0*Xn^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="m*0.16666666666666666*Xn^3.0+c/2.0*Xn^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "m*0.0+c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "m*0.0+c*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "m*0.0+c*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="m*0.16666666666666666*Xn^3.0+c/2.0*Xn^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="m*0.16666666666666666/4.0*Xn^4.0+c/2.0/3.0*Xn^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="m*0.041666666666666664*Xn^4.0+c/6.0*Xn^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "m*0.0+c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "m*0.0+c*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "m*0.0+c*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="m*0.041666666666666664*Xn^4.0+c/6.0*Xn^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="m*0.041666666666666664/5.0*Xn^5.0+c/6.0/4.0*Xn^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="m*0.008333333333333333*Xn^5.0+c/24.0*Xn^4.0";
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
//           public static void TestCaseDiff50092() {
//        //Test Case 50092
//        UsageCalculus.TestCase = 50092;
//        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
//        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
//        UsageCalculus.EqnUnderTest = "-1/-1*(y/m-c/m)^0.2";
//        UsageCalculus.TestCaseName = "Simple: IndConstant";
//        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
//        
//        UsageCalculus.DiffWithRespTo = "y";
//        UsageCalculus.MaxDiffOrder = 14;
//        UsageCalculus.MaxIntegreOrder = 14;
//        
//        UsageCalculus.EqnSolArrayMap1[1] = "(y/m-c/m)^0.2";
//        UsageCalculus.EqnSolArrayDiffAlone[1] = "m+0.0";
//        UsageCalculus.EqnSolArrayMap2[1] = "m";
//        UsageCalculus.EqnSolArrayMap3[1]="(y/m-c/m)^0.2";
//        UsageCalculus.EqnSolArrayIntegrAlone[1]="m/2.0*y^2.0+c*y";
//        UsageCalculus.EqnSolArrayMap4[1]="m/2.0*y^2.0+c*y";
//        UsageCalculus.EqnSolOrder[1] = 1;
//
//        UsageCalculus.EqnSolArrayMap1[2] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
//        UsageCalculus.EqnSolArrayMap2[2] = "";
//        UsageCalculus.EqnSolArrayMap3[2]="";
//        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
//        UsageCalculus.EqnSolArrayMap4[2]="";
//        UsageCalculus.EqnSolOrder[2] = 2;
//
//        UsageCalculus.EqnSolArrayMap1[3] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
//        UsageCalculus.EqnSolArrayMap2[3] = "";
//        UsageCalculus.EqnSolArrayMap3[3]="";
//        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
//        UsageCalculus.EqnSolArrayMap4[3]="";
//        UsageCalculus.EqnSolOrder[3] = 3;
//
//        UsageCalculus.EqnSolArrayMap1[4] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
//        UsageCalculus.EqnSolArrayMap2[4] = "";
//        UsageCalculus.EqnSolArrayMap3[4]="";
//        UsageCalculus.EqnSolArrayIntegrAlone[4]="";
//        UsageCalculus.EqnSolArrayMap4[4]="";
//        UsageCalculus.EqnSolOrder[4] = 4;
//        
//        UsageCalculus.EqnSolArrayMap1[5] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[5] = "";
//        UsageCalculus.EqnSolArrayMap2[5] = "";
//        UsageCalculus.EqnSolArrayMap3[5]="";
//        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
//        UsageCalculus.EqnSolArrayMap4[5]="";
//        UsageCalculus.EqnSolOrder[5] = 5;
//
//        UsageCalculus.EqnSolArrayMap1[6] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[6] = "";
//        UsageCalculus.EqnSolArrayMap2[6] = "";
//        UsageCalculus.EqnSolArrayMap3[6]="";
//        UsageCalculus.EqnSolArrayIntegrAlone[6]="";
//        UsageCalculus.EqnSolArrayMap4[6]="";
//        UsageCalculus.EqnSolOrder[6] = 6;
//
//        UsageCalculus.EqnSolArrayMap1[7] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[7] = "";
//        UsageCalculus.EqnSolArrayMap2[7] = "";
//        UsageCalculus.EqnSolArrayMap3[7]="";
//        UsageCalculus.EqnSolArrayIntegrAlone[7]="";
//        UsageCalculus.EqnSolArrayMap4[7]="";
//        UsageCalculus.EqnSolOrder[7] = 7;
//
//        UsageCalculus.EqnSolArrayMap1[8] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[8] = "";
//        UsageCalculus.EqnSolArrayMap2[8] = "";
//        UsageCalculus.EqnSolOrder[8] = 8;
//
//        UsageCalculus.EqnSolArrayMap1[9] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[9] = "";
//        UsageCalculus.EqnSolArrayMap2[9] = "";
//        UsageCalculus.EqnSolOrder[9] = 9;
//
//        UsageCalculus.EqnSolArrayMap1[10] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[10] = "";
//        UsageCalculus.EqnSolArrayMap2[10] = "";
//        UsageCalculus.EqnSolOrder[10] = 10;
//
//        UsageCalculus.EqnSolArrayMap1[11] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[11] = "";
//        UsageCalculus.EqnSolArrayMap2[11] = "";
//        UsageCalculus.EqnSolOrder[11] = 11;
//
//        UsageCalculus.EqnSolArrayMap1[12] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[12] = "";
//        UsageCalculus.EqnSolArrayMap2[12] = "";
//        UsageCalculus.EqnSolOrder[12] = 12;
//
//        UsageCalculus.EqnSolArrayMap1[13] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[13] = "";
//        UsageCalculus.EqnSolArrayMap2[13] = "";
//        UsageCalculus.EqnSolOrder[13] = 13;
//
//        UsageCalculus.EqnSolArrayMap1[14] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[14] = "";
//        UsageCalculus.EqnSolArrayMap2[14] = "";
//        UsageCalculus.EqnSolOrder[14] = 14;
//    }   
           public static void TestCaseDiff50093() {
        //Test Case 50093
        UsageCalculus.TestCase = 50093;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "2^x*x^8 + 3^x*x^5 + 4^x*x^4 - 5*x*2^x- 25*2*6^x";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^8.0*2.0^x+x^5.0*3.0^x+x^4.0*4.0^x-5.0*x*2.0^x-50.0*6.0^x";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "2.0^x*8.0*x^7.0+ln(2.0)*2.0^x*x^8.0+3.0^x*5.0*x^4.0+ln(3.0)*3.0^x*x^5.0+4.0^x*4.0*x^3.0+ln(4.0)*4.0^x*x^4.0-2.0^x*5.0+ln(2.0)*2.0^x*5.0*x-50.0*ln(6.0)*6.0^x";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*x^7.0*2.0^x+x^8.0*ln(2.0)*2.0^x+5.0*x^4.0*3.0^x+x^5.0*ln(3.0)*3.0^x+4.0*x^3.0*4.0^x+x^4.0*ln(4.0)*4.0^x-5.0*2.0^x+5.0*x*ln(2.0)*2.0^x-50.0*ln(6.0)*6.0^x";
        UsageCalculus.EqnSolArrayMap3[1]="x^8.0*2.0^x+x^5.0*3.0^x+x^4.0*4.0^x-5.0*x*2.0^x-50.0*6.0^x";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="";
        UsageCalculus.EqnSolArrayMap4[1]="";
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
/* ********************************************************* */
/* *************************** 2^a equations End ** */
/* ********************************************************* */
//           public static void TestCaseDiff50094() {
//        //Test Case 50043
//        UsageCalculus.TestCase = 50094;
//        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
//        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
//        UsageCalculus.EqnUnderTest = "((y-c)/m)^0.2";
//        UsageCalculus.TestCaseName = "Simple: IndConstant";
//        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
//        
//        UsageCalculus.DiffWithRespTo = "y";
//        UsageCalculus.MaxDiffOrder = 14;
//        UsageCalculus.MaxIntegreOrder = 14;
//        
//        UsageCalculus.EqnSolArrayMap1[1] = "((y-c)/m)^0.2";
//        UsageCalculus.EqnSolArrayDiffAlone[1] = "m+0.0";
//        UsageCalculus.EqnSolArrayMap2[1] = "m";
//        UsageCalculus.EqnSolArrayMap3[1]="m*Xn+c";
//        UsageCalculus.EqnSolArrayIntegrAlone[1]="m/2.0*Xn^2.0+c*Xn";
//        UsageCalculus.EqnSolArrayMap4[1]="m/2.0*Xn^2.0+c*Xn";
//        UsageCalculus.EqnSolOrder[1] = 1;
//
//        UsageCalculus.EqnSolArrayMap1[2] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
//        UsageCalculus.EqnSolArrayMap2[2] = "";
//        UsageCalculus.EqnSolArrayMap3[2]="";
//        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
//        UsageCalculus.EqnSolArrayMap4[2]="";
//        UsageCalculus.EqnSolOrder[2] = 2;
//
//        UsageCalculus.EqnSolArrayMap1[3] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
//        UsageCalculus.EqnSolArrayMap2[3] = "";
//        UsageCalculus.EqnSolArrayMap3[3]="";
//        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
//        UsageCalculus.EqnSolArrayMap4[3]="";
//        UsageCalculus.EqnSolOrder[3] = 3;
//
//        UsageCalculus.EqnSolArrayMap1[4] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
//        UsageCalculus.EqnSolArrayMap2[4] = "";
//        UsageCalculus.EqnSolArrayMap3[4]="";
//        UsageCalculus.EqnSolArrayIntegrAlone[4]="";
//        UsageCalculus.EqnSolArrayMap4[4]="";
//        UsageCalculus.EqnSolOrder[4] = 4;
//        
//        UsageCalculus.EqnSolArrayMap1[5] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[5] = "";
//        UsageCalculus.EqnSolArrayMap2[5] = "";
//        UsageCalculus.EqnSolArrayMap3[5]="";
//        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
//        UsageCalculus.EqnSolArrayMap4[5]="";
//        UsageCalculus.EqnSolOrder[5] = 5;
//
//        UsageCalculus.EqnSolArrayMap1[6] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[6] = "";
//        UsageCalculus.EqnSolArrayMap2[6] = "";
//        UsageCalculus.EqnSolArrayMap3[6]="";
//        UsageCalculus.EqnSolArrayIntegrAlone[6]="";
//        UsageCalculus.EqnSolArrayMap4[6]="";
//        UsageCalculus.EqnSolOrder[6] = 6;
//
//        UsageCalculus.EqnSolArrayMap1[7] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[7] = "";
//        UsageCalculus.EqnSolArrayMap2[7] = "";
//        UsageCalculus.EqnSolArrayMap3[7]="";
//        UsageCalculus.EqnSolArrayIntegrAlone[7]="";
//        UsageCalculus.EqnSolArrayMap4[7]="";
//        UsageCalculus.EqnSolOrder[7] = 7;
//
//        UsageCalculus.EqnSolArrayMap1[8] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[8] = "";
//        UsageCalculus.EqnSolArrayMap2[8] = "";
//        UsageCalculus.EqnSolOrder[8] = 8;
//
//        UsageCalculus.EqnSolArrayMap1[9] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[9] = "";
//        UsageCalculus.EqnSolArrayMap2[9] = "";
//        UsageCalculus.EqnSolOrder[9] = 9;
//
//        UsageCalculus.EqnSolArrayMap1[10] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[10] = "";
//        UsageCalculus.EqnSolArrayMap2[10] = "";
//        UsageCalculus.EqnSolOrder[10] = 10;
//
//        UsageCalculus.EqnSolArrayMap1[11] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[11] = "";
//        UsageCalculus.EqnSolArrayMap2[11] = "";
//        UsageCalculus.EqnSolOrder[11] = 11;
//
//        UsageCalculus.EqnSolArrayMap1[12] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[12] = "";
//        UsageCalculus.EqnSolArrayMap2[12] = "";
//        UsageCalculus.EqnSolOrder[12] = 12;
//
//        UsageCalculus.EqnSolArrayMap1[13] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[13] = "";
//        UsageCalculus.EqnSolArrayMap2[13] = "";
//        UsageCalculus.EqnSolOrder[13] = 13;
//
//        UsageCalculus.EqnSolArrayMap1[14] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[14] = "";
//        UsageCalculus.EqnSolArrayMap2[14] = "";
//        UsageCalculus.EqnSolOrder[14] = 14;
//    }
//           public static void TestCaseDiff50095() {
//        //Test Case 50092
//        UsageCalculus.TestCase = 50095;
//        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
//        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
//        UsageCalculus.EqnUnderTest = "-1/-1*((y-c)/m)^0.2";
//        UsageCalculus.TestCaseName = "Simple: IndConstant";
//        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
//        
//        UsageCalculus.DiffWithRespTo = "y";
//        UsageCalculus.MaxDiffOrder = 14;
//        UsageCalculus.MaxIntegreOrder = 14;
//        
//        UsageCalculus.EqnSolArrayMap1[1] = "((y-c)/m)^0.2";
//        UsageCalculus.EqnSolArrayDiffAlone[1] = "m+0.0";
//        UsageCalculus.EqnSolArrayMap2[1] = "m";
//        UsageCalculus.EqnSolArrayMap3[1]="m*Xn+c";
//        UsageCalculus.EqnSolArrayIntegrAlone[1]="m/2.0*Xn^2.0+c*Xn";
//        UsageCalculus.EqnSolArrayMap4[1]="m/2.0*Xn^2.0+c*Xn";
//        UsageCalculus.EqnSolOrder[1] = 1;
//
//        UsageCalculus.EqnSolArrayMap1[2] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
//        UsageCalculus.EqnSolArrayMap2[2] = "";
//        UsageCalculus.EqnSolArrayMap3[2]="";
//        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
//        UsageCalculus.EqnSolArrayMap4[2]="";
//        UsageCalculus.EqnSolOrder[2] = 2;
//
//        UsageCalculus.EqnSolArrayMap1[3] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
//        UsageCalculus.EqnSolArrayMap2[3] = "";
//        UsageCalculus.EqnSolArrayMap3[3]="";
//        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
//        UsageCalculus.EqnSolArrayMap4[3]="";
//        UsageCalculus.EqnSolOrder[3] = 3;
//
//        UsageCalculus.EqnSolArrayMap1[4] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
//        UsageCalculus.EqnSolArrayMap2[4] = "";
//        UsageCalculus.EqnSolArrayMap3[4]="";
//        UsageCalculus.EqnSolArrayIntegrAlone[4]="";
//        UsageCalculus.EqnSolArrayMap4[4]="";
//        UsageCalculus.EqnSolOrder[4] = 4;
//        
//        UsageCalculus.EqnSolArrayMap1[5] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[5] = "";
//        UsageCalculus.EqnSolArrayMap2[5] = "";
//        UsageCalculus.EqnSolArrayMap3[5]="";
//        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
//        UsageCalculus.EqnSolArrayMap4[5]="";
//        UsageCalculus.EqnSolOrder[5] = 5;
//
//        UsageCalculus.EqnSolArrayMap1[6] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[6] = "";
//        UsageCalculus.EqnSolArrayMap2[6] = "";
//        UsageCalculus.EqnSolArrayMap3[6]="";
//        UsageCalculus.EqnSolArrayIntegrAlone[6]="";
//        UsageCalculus.EqnSolArrayMap4[6]="";
//        UsageCalculus.EqnSolOrder[6] = 6;
//
//        UsageCalculus.EqnSolArrayMap1[7] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[7] = "";
//        UsageCalculus.EqnSolArrayMap2[7] = "";
//        UsageCalculus.EqnSolArrayMap3[7]="";
//        UsageCalculus.EqnSolArrayIntegrAlone[7]="";
//        UsageCalculus.EqnSolArrayMap4[7]="";
//        UsageCalculus.EqnSolOrder[7] = 7;
//
//        UsageCalculus.EqnSolArrayMap1[8] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[8] = "";
//        UsageCalculus.EqnSolArrayMap2[8] = "";
//        UsageCalculus.EqnSolOrder[8] = 8;
//
//        UsageCalculus.EqnSolArrayMap1[9] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[9] = "";
//        UsageCalculus.EqnSolArrayMap2[9] = "";
//        UsageCalculus.EqnSolOrder[9] = 9;
//
//        UsageCalculus.EqnSolArrayMap1[10] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[10] = "";
//        UsageCalculus.EqnSolArrayMap2[10] = "";
//        UsageCalculus.EqnSolOrder[10] = 10;
//
//        UsageCalculus.EqnSolArrayMap1[11] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[11] = "";
//        UsageCalculus.EqnSolArrayMap2[11] = "";
//        UsageCalculus.EqnSolOrder[11] = 11;
//
//        UsageCalculus.EqnSolArrayMap1[12] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[12] = "";
//        UsageCalculus.EqnSolArrayMap2[12] = "";
//        UsageCalculus.EqnSolOrder[12] = 12;
//
//        UsageCalculus.EqnSolArrayMap1[13] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[13] = "";
//        UsageCalculus.EqnSolArrayMap2[13] = "";
//        UsageCalculus.EqnSolOrder[13] = 13;
//
//        UsageCalculus.EqnSolArrayMap1[14] = "";
//        UsageCalculus.EqnSolArrayDiffAlone[14] = "";
//        UsageCalculus.EqnSolArrayMap2[14] = "";
//        UsageCalculus.EqnSolOrder[14] = 14;
//    }
}
