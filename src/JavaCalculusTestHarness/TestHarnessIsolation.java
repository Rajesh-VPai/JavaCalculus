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
import static Calculus.ExclusionTestCases.TrueDifferentialGapInfinity;
import static Calculus.ExclusionTestCases.TrueDifferentialGapException;
import static Calculus.ExclusionTestCases.IntegralGapException;
import static Calculus.ExclusionTestCases.IntegralGapInfinity;
import static Calculus.ExclusionTestCases.TrueIntegralGapInfinity;
import static Calculus.ExclusionTestCases.TrueIntegralGapException;
import static Calculus.MathematicalTestHarness.IgnoreCoreIssuesFlag;
import static Calculus.MathematicalTestHarness.IgnoreKnownIssuesFlag;
import static Calculus.MathematicalTestHarness.RunAllTestCasesFlag;
import Calculus.UsageCalculus;
import static Calculus.UsageCalculus.CoreKnownIssues;
import static Calculus.UsageCalculus.CoreKnownIssuesTestCasesFlag;
import static Calculus.UsageCalculus.TestCase;
import static Calculus.UsageCalculus.EqnRegressionDiffStatus;
import static Calculus.UsageCalculus.EqnRegressionIntegreStatus;
import static Calculus.UsageCalculus.EqnUnderTest;
import static Calculus.UsageCalculus.TestCaseName;
import static Calculus.UsageCalculus.TestCaseMatrixID;
import static Calculus.UsageCalculus.DiffWithRespTo;
import static Calculus.UsageCalculus.MaxDiffOrder;
import static Calculus.UsageCalculus.MaxIntegreOrder;
import static Calculus.UsageCalculus.EqnSolArrayMap1;
import static Calculus.UsageCalculus.EqnSolArrayDiffAlone;
import static Calculus.UsageCalculus.EqnSolArrayMap2;
import static Calculus.UsageCalculus.EqnSolArrayMap3;
import static Calculus.UsageCalculus.EqnSolArrayIntegrAlone;
import static Calculus.UsageCalculus.EqnSolArrayMap4;
import static Calculus.UsageCalculus.EqnSolOrder;
import static Calculus.UsageCalculus.KnownIssueTestCasesFlag;
import static Calculus.UsageCalculus.KnownIssues;
import static Calculus.UsageCalculus.KnownIssuesTestCases;

import org.apache.log4j.Logger;

/**
 *
 * @author Rajesh V Pai
 */
public class TestHarnessIsolation {
    public static Logger log = Logger.getLogger(TestHarnessIsolation.class.getName());
    //Isolation Test Cases
    public static void IsolationTestCases(String AlgoName,long j){
        if( ((!RunAllTestCasesFlag)&& (IgnoreKnownIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainIntegrTest"))&&(IntegralGapInfinity(j)))
                ||((!RunAllTestCasesFlag)&& (IgnoreKnownIssuesFlag==false) && (AlgoName.equalsIgnoreCase("mainDiffTest"))&&(DifferentialGapInfinity(j))) )
        {
            KnownIssueTestCasesFlag=true;
            KnownIssues++;
            KnownIssuesTestCases.put(KnownIssues, "" + j);
            System.out.println(ConsoleColors.RED +"Isolation TestCase:j= " + j  + ": Infinite Loop GAP" + ConsoleColors.RESET);
        }
        else if(((!RunAllTestCasesFlag)&&(IgnoreKnownIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainIntegrTest"))&&(IntegralGapException(j)))
                ||((!RunAllTestCasesFlag)&&(IgnoreKnownIssuesFlag==false)&(AlgoName.equalsIgnoreCase("mainDiffTest"))&&(DifferentialGapException(j))) )
        {
            KnownIssueTestCasesFlag=true;
            KnownIssues++;
            KnownIssuesTestCases.put(KnownIssues, "" + j);
            System.out.println(ConsoleColors.RED +"Isolation TestCase:j= " + j  + ": Exception GAP" + ConsoleColors.RESET);
        }else if( ((!RunAllTestCasesFlag)&& (IgnoreCoreIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainIntegrTest"))&&(TrueIntegralGapInfinity(j)))
                ||( (!RunAllTestCasesFlag)&&(IgnoreCoreIssuesFlag==false) && (AlgoName.equalsIgnoreCase("mainDiffTest"))&&(TrueDifferentialGapInfinity(j))) )
        {
             CoreKnownIssuesTestCasesFlag=true;
             CoreKnownIssues ++;
             System.out.println(ConsoleColors.RED +"Isolation TestCase:j= " + j  + ": Infinite Loop GAP" + ConsoleColors.RESET);
        }
        else if(((!RunAllTestCasesFlag)&&(IgnoreCoreIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainIntegrTest"))&&(TrueIntegralGapException(j)))
                ||((!RunAllTestCasesFlag)&&(IgnoreCoreIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainDiffTest"))&&(TrueDifferentialGapException(j))) )
        {
             CoreKnownIssuesTestCasesFlag=true;
             CoreKnownIssues ++;
             System.out.println(ConsoleColors.RED +"Isolation TestCase:j= " + j  + ": Exception GAP" + ConsoleColors.RESET);
        }
        else{
            switch((int)j){
            case 1000:
                TestCaseDiff1000();
                break;
            case 1001:
                TestCaseDiff1001();
                break;
            case 1002:
                TestCaseDiff1002();
                break;
            case 1003:
                TestCaseDiff1003();
                break;
            case 1004:
                TestCaseDiff1004();
                break;
            case 1005:
                TestCaseDiff1005();
                break;
            case 1006:
                TestCaseDiff1006();
                break;
            case 1007:
                TestCaseDiff1007();
                break;
            case 1008:
                TestCaseDiff1008();
                break;
            case 1009:
                TestCaseDiff1009();
                break;
            case 1010:
                TestCaseDiff1010();
                break;
            case 1011:
                TestCaseDiff1011();
                break;
            case 1012:
                TestCaseDiff1012();
                break;
            case 1013:
                TestCaseDiff1013();
                break;
            case 1014:
                TestCaseDiff1014();
                break;
            case 1015:
                TestCaseDiff1015();
                break;
            default:
                System.out.println(ConsoleColors.RED +"Isolation TestCase:j= " + j  + ": Gap" + ConsoleColors.RESET);
                break;
        }
    }
}
    //Equation Types Test Cases
    
    public static void TestCaseDiff1000() {
        //Test Case 1000
        TestCase = 1000;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";
        EqnUnderTest = "x^8 + x^5 + x^4 - x - 25";
        TestCaseName = "Simple: Coefficients:";
        TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        DiffWithRespTo = "x";
        MaxDiffOrder = 14;
        MaxIntegreOrder = 5;
        
        EqnSolArrayMap1[1] = "x^8.0+x^5.0+x^4.0-x-25.0";
        EqnSolArrayDiffAlone[1] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-1.0-25.0*0.0";
        EqnSolArrayMap2[1] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-1.0";
        EqnSolArrayMap3[1]="x^8.0+x^5.0+x^4.0-x-25.0";
        EqnSolArrayIntegrAlone[1]="1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        EqnSolArrayMap4[1]="1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        EqnSolOrder[1] = 1;

        EqnSolArrayMap1[2] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-1.0";
        EqnSolArrayDiffAlone[2] = "8.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0-1.0*0.0";
        EqnSolArrayMap2[2] = "56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        EqnSolArrayMap3[2]="1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        EqnSolArrayIntegrAlone[2]="1.0/9.0/10.0*x^10.0+1.0/6.0/7.0*x^7.0+1.0/5.0/6.0*x^6.0-1.0/2.0/3.0*x^3.0-25.0/2.0*x^2.0";
        EqnSolArrayMap4[2]="1.0/90.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.0/6.0*x^3.0-12.5*x^2.0";
        EqnSolOrder[2] = 2;

        EqnSolArrayMap1[3] = "56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        EqnSolArrayDiffAlone[3] = "56.0*6.0*x^5.0+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        EqnSolArrayMap2[3] = "336.0*x^5.0+60.0*x^2.0+24.0*x";
        EqnSolArrayMap3[3]="1.0/90.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.0/6.0*x^3.0-12.5*x^2.0";
        EqnSolArrayIntegrAlone[3]="1.0/90.0/11.0*x^11.0+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-1.0/6.0/4.0*x^4.0-12.5/3.0*x^3.0";
        EqnSolArrayMap4[3]="1.0/990.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        EqnSolOrder[3] = 3;

        EqnSolArrayMap1[4] = "336.0*x^5.0+60.0*x^2.0+24.0*x";
        EqnSolArrayDiffAlone[4] = "336.0*5.0*x^4.0+60.0*2.0*x^1.0+24.0";
        EqnSolArrayMap2[4] = "1680.0*x^4.0+120.0*x+24.0";
        EqnSolArrayMap3[4]="1.0/990.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        EqnSolArrayIntegrAlone[4]="1.0/990.0/12.0*x^12.0+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/24.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        EqnSolArrayMap4[4]="1.0/11880.0*x^12.0+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0-1.0/120.0*x^5.0-1.0416666666666667*x^4.0";
        EqnSolOrder[4] = 4;
        
        EqnSolArrayMap1[5] = "";
        EqnSolArrayDiffAlone[5] = "";
        EqnSolArrayMap2[5] = "";
        EqnSolArrayMap3[5]="";
        EqnSolArrayIntegrAlone[5]="";
        EqnSolArrayMap4[5]="";
        EqnSolOrder[5] = 5;

        EqnSolArrayMap1[6] = "";
        EqnSolArrayDiffAlone[6] = "";
        EqnSolArrayMap2[6] = "";
        EqnSolArrayMap3[6]="";
        EqnSolArrayIntegrAlone[6]="";
        EqnSolArrayMap4[6]="";
        EqnSolOrder[6] = 6;

        EqnSolArrayMap1[7] = "";
        EqnSolArrayDiffAlone[7] = "";
        EqnSolArrayMap2[7] = "";
        EqnSolArrayMap3[7]="";
        EqnSolArrayIntegrAlone[7]="";
        EqnSolArrayMap4[7]="";
        EqnSolOrder[7] = 7;

        EqnSolArrayMap1[8] = "";
        EqnSolArrayDiffAlone[8] = "";
        EqnSolArrayMap2[8] = "";
        EqnSolOrder[8] = 8;

        EqnSolArrayMap1[9] = "";
        EqnSolArrayDiffAlone[9] = "";
        EqnSolArrayMap2[9] = "";
        EqnSolOrder[9] = 9;

        EqnSolArrayMap1[10] = "";
        EqnSolArrayDiffAlone[10] = "";
        EqnSolArrayMap2[10] = "";
        EqnSolOrder[10] = 10;

        EqnSolArrayMap1[11] = "";
        EqnSolArrayDiffAlone[11] = "";
        EqnSolArrayMap2[11] = "";
        EqnSolOrder[11] = 11;

        EqnSolArrayMap1[12] = "";
        EqnSolArrayDiffAlone[12] = "";
        EqnSolArrayMap2[12] = "";
        EqnSolOrder[12] = 12;

        EqnSolArrayMap1[13] = "";
        EqnSolArrayDiffAlone[13] = "";
        EqnSolArrayMap2[13] = "";
        EqnSolOrder[13] = 13;

        EqnSolArrayMap1[14] = "";
        EqnSolArrayDiffAlone[14] = "";
        EqnSolArrayMap2[14] = "";
        EqnSolOrder[14] = 14;
    }
    public static void TestCaseDiff1001() {
        //Test Case 1001
        TestCase = 1001;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";
        EqnUnderTest = "8*x^8 + 5*x^5 + 4*x^4 - 1.0*x - 25";
        TestCaseName = "Simple: Coefficients:";
        TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        DiffWithRespTo = "x";
        MaxDiffOrder = 14;
        MaxIntegreOrder = 14;
        
        EqnSolArrayMap1[1] = "8.0*x^8.0+5.0*x^5.0+4.0*x^4.0-x-25.0";
        EqnSolArrayDiffAlone[1] = "8.0*8.0*x^7.0+5.0*5.0*x^4.0+4.0*4.0*x^3.0-1.0-25.0*0.0";
        EqnSolArrayMap2[1] = "64.0*x^7.0+25.0*x^4.0+16.0*x^3.0-1.0";
        EqnSolArrayMap3[1]="8.0*x^8.0+5.0*x^5.0+4.0*x^4.0-x-25.0";
        EqnSolArrayIntegrAlone[1]="8.0/9.0*x^9.0+5.0/6.0*x^6.0+4.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        EqnSolArrayMap4[1]="1.0/1.125*x^9.0+1.0/1.2*x^6.0+1.0/1.25*x^5.0-1.0/2.0*x^2.0-25.0*x";
        EqnSolOrder[1] = 1;

        EqnSolArrayMap1[2] = "64.0*x^7.0+25.0*x^4.0+16.0*x^3.0-1.0";
        EqnSolArrayDiffAlone[2] = "64.0*7.0*x^6.0+25.0*4.0*x^3.0+16.0*3.0*x^2.0-1.0*0.0";
        EqnSolArrayMap2[2] = "448.0*x^6.0+100.0*x^3.0+48.0*x^2.0";
        EqnSolArrayMap3[2]="1.0/1.125*x^9.0+1.0/1.2*x^6.0+1.0/1.25*x^5.0-1.0/2.0*x^2.0-25.0*x";
        EqnSolArrayIntegrAlone[2]="1.0/1.125/10.0*x^10.0+1.0/1.2/7.0*x^7.0+1.0/1.25/6.0*x^6.0-1.0/2.0/3.0*x^3.0-25.0/2.0*x^2.0";
        EqnSolArrayMap4[2]="1.0/11.25*x^10.0+1.0/8.4*x^7.0+1.0/7.5*x^6.0-1.0/6.0*x^3.0-12.5*x^2.0";
        EqnSolOrder[2] = 2;

        EqnSolArrayMap1[3] = "448.0*x^6.0+100.0*x^3.0+48.0*x^2.0";
        EqnSolArrayDiffAlone[3] = "448.0*6.0*x^5.0+100.0*3.0*x^2.0+48.0*2.0*x^1.0";
        EqnSolArrayMap2[3] = "2688.0*x^5.0+300.0*x^2.0+96.0*x";
        EqnSolArrayMap3[3]="1.0/11.25*x^10.0+1.0/8.4*x^7.0+1.0/7.5*x^6.0-1.0/6.0*x^3.0-12.5*x^2.0";
        EqnSolArrayIntegrAlone[3]="1.0/11.25/11.0*x^11.0+1.0/8.4/8.0*x^8.0+1.0/7.5/7.0*x^7.0-1.0/6.0/4.0*x^4.0-12.5/3.0*x^3.0";
        EqnSolArrayMap4[3]="1.0/123.75*x^11.0+1.0/67.2*x^8.0+1.0/52.5*x^7.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        EqnSolOrder[3] = 3;

        EqnSolArrayMap1[4] = "2688.0*x^5.0+300.0*x^2.0+96.0*x";
        EqnSolArrayDiffAlone[4] = "2688.0*5.0*x^4.0+300.0*2.0*x^1.0+96.0";
        EqnSolArrayMap2[4] = "13440.0*x^4.0+600.0*x+96.0";
        EqnSolArrayMap3[4]="1.0/123.75*x^11.0+1.0/67.2*x^8.0+1.0/52.5*x^7.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        EqnSolArrayIntegrAlone[4]="1.0/123.75/12.0*x^12.0+1.0/67.2/9.0*x^9.0+1.0/52.5/8.0*x^8.0-1.0/24.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        EqnSolArrayMap4[4]="1.0/1485.0*x^12.0+1.0/604.8000000000001*x^9.0+1.0/420.0*x^8.0-1.0/120.0*x^5.0-1.0416666666666667*x^4.0";
        EqnSolOrder[4] = 4;
        
        EqnSolArrayMap1[5] = "";
        EqnSolArrayDiffAlone[5] = "";
        EqnSolArrayMap2[5] = "";
        EqnSolArrayMap3[5]="";
        EqnSolArrayIntegrAlone[5]="";
        EqnSolArrayMap4[5]="";
        EqnSolOrder[5] = 5;

        EqnSolArrayMap1[6] = "";
        EqnSolArrayDiffAlone[6] = "";
        EqnSolArrayMap2[6] = "";
        EqnSolArrayMap3[6]="";
        EqnSolArrayIntegrAlone[6]="";
        EqnSolArrayMap4[6]="";
        EqnSolOrder[6] = 6;

        EqnSolArrayMap1[7] = "";
        EqnSolArrayDiffAlone[7] = "";
        EqnSolArrayMap2[7] = "";
        EqnSolArrayMap3[7]="";
        EqnSolArrayIntegrAlone[7]="";
        EqnSolArrayMap4[7]="";
        EqnSolOrder[7] = 7;

        EqnSolArrayMap1[8] = "";
        EqnSolArrayDiffAlone[8] = "";
        EqnSolArrayMap2[8] = "";
        EqnSolOrder[8] = 8;

        EqnSolArrayMap1[9] = "";
        EqnSolArrayDiffAlone[9] = "";
        EqnSolArrayMap2[9] = "";
        EqnSolOrder[9] = 9;

        EqnSolArrayMap1[10] = "";
        EqnSolArrayDiffAlone[10] = "";
        EqnSolArrayMap2[10] = "";
        EqnSolOrder[10] = 10;

        EqnSolArrayMap1[11] = "";
        EqnSolArrayDiffAlone[11] = "";
        EqnSolArrayMap2[11] = "";
        EqnSolOrder[11] = 11;

        EqnSolArrayMap1[12] = "";
        EqnSolArrayDiffAlone[12] = "";
        EqnSolArrayMap2[12] = "";
        EqnSolOrder[12] = 12;

        EqnSolArrayMap1[13] = "";
        EqnSolArrayDiffAlone[13] = "";
        EqnSolArrayMap2[13] = "";
        EqnSolOrder[13] = 13;

        EqnSolArrayMap1[14] = "";
        EqnSolArrayDiffAlone[14] = "";
        EqnSolArrayMap2[14] = "";
        EqnSolOrder[14] = 14;
    }
    public static void TestCaseDiff1002() {
        //Test Case 1002
        TestCase = 1002;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";
        EqnUnderTest = "a*8*x^8 + a*5.0*x^5 + a*4*x^4 - a*x - 25*a";
        TestCaseName = "Simple: Coefficients:";
        TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        DiffWithRespTo = "x";
        MaxDiffOrder = 14;
        MaxIntegreOrder = 14;
        
        EqnSolArrayMap1[1] = "a*8.0*x^8.0+a*5.0*x^5.0+a*4.0*x^4.0-a*x-a*25.0";
        EqnSolArrayDiffAlone[1] = "a*8.0*8.0*x^7.0+a*5.0*5.0*x^4.0+a*4.0*4.0*x^3.0-a-a*25.0*0.0";
        EqnSolArrayMap2[1] = "a*64.0*x^7.0+a*25.0*x^4.0+a*16.0*x^3.0-a-a*0.0";
        EqnSolArrayMap3[1]="a*8.0*x^8.0+a*5.0*x^5.0+a*4.0*x^4.0-a*x-a*25.0";
        EqnSolArrayIntegrAlone[1]="a*8.0/9.0*x^9.0+a*5.0/6.0*x^6.0+a*4.0/5.0*x^5.0-a/2.0*x^2.0-a*25.0*x";
        EqnSolArrayMap4[1]="a*0.8888888888888888*x^9.0+a*0.8333333333333334*x^6.0+a*0.8*x^5.0-a/2.0*x^2.0-a*25.0*x";
        EqnSolOrder[1] = 1;

        EqnSolArrayMap1[2] = "a*64.0*x^7.0+a*25.0*x^4.0+a*16.0*x^3.0-a-a*0.0";
        EqnSolArrayDiffAlone[2] = "a*64.0*7.0*x^6.0+a*25.0*4.0*x^3.0+a*16.0*3.0*x^2.0-a*0.0-a*0.0*0.0";
        EqnSolArrayMap2[2] = "a*448.0*x^6.0+a*100.0*x^3.0+a*48.0*x^2.0-a*0.0-a*0.0";
        EqnSolArrayMap3[2]="a*0.8888888888888888*x^9.0+a*0.8333333333333334*x^6.0+a*0.8*x^5.0-a/2.0*x^2.0-a*25.0*x";
        EqnSolArrayIntegrAlone[2]="a*0.8888888888888888/10.0*x^10.0+a*0.8333333333333334/7.0*x^7.0+a*0.8/6.0*x^6.0-a/2.0/3.0*x^3.0-a*25.0/2.0*x^2.0";
        EqnSolArrayMap4[2]="a*0.08888888888888888*x^10.0+a*0.11904761904761905*x^7.0+a*0.13333333333333333*x^6.0-a*0.16666666666666666*x^3.0-a*12.5*x^2.0";
        EqnSolOrder[2] = 2;

        EqnSolArrayMap1[3] = "a*448.0*x^6.0+a*100.0*x^3.0+a*48.0*x^2.0-a*0.0-a*0.0";
        EqnSolArrayDiffAlone[3] = "a*448.0*6.0*x^5.0+a*100.0*3.0*x^2.0+a*48.0*2.0*x^1.0-a*0.0*0.0-a*0.0*0.0";
        EqnSolArrayMap2[3] = "a*2688.0*x^5.0+a*300.0*x^2.0+a*96.0*x-a*0.0-a*0.0";
        EqnSolArrayMap3[3]="a*0.08888888888888888*x^10.0+a*0.11904761904761905*x^7.0+a*0.13333333333333333*x^6.0-a*0.16666666666666666*x^3.0-a*12.5*x^2.0";
        EqnSolArrayIntegrAlone[3]="a*0.08888888888888888/11.0*x^11.0+a*0.11904761904761905/8.0*x^8.0+a*0.13333333333333333/7.0*x^7.0-a*0.16666666666666666/4.0*x^4.0-a*12.5/3.0*x^3.0";
        EqnSolArrayMap4[3]="a*0.008080808080808079*x^11.0+a*0.014880952380952382*x^8.0+a*0.019047619047619046*x^7.0-a*0.041666666666666664*x^4.0-a*4.166666666666667*x^3.0";
        EqnSolOrder[3] = 3;

        EqnSolArrayMap1[4] = "a*2688.0*x^5.0+a*300.0*x^2.0+a*96.0*x-a*0.0-a*0.0";
        EqnSolArrayDiffAlone[4] = "a*2688.0*5.0*x^4.0+a*300.0*2.0*x^1.0+a*96.0-a*0.0*0.0-a*0.0*0.0";
        EqnSolArrayMap2[4] = "a*13440.0*x^4.0+a*600.0*x+a*96.0-a*0.0-a*0.0";
        EqnSolArrayMap3[4]="a*0.008080808080808079*x^11.0+a*0.014880952380952382*x^8.0+a*0.019047619047619046*x^7.0-a*0.041666666666666664*x^4.0-a*4.166666666666667*x^3.0";
        EqnSolArrayIntegrAlone[4]="a*0.008080808080808079/12.0*x^12.0+a*0.014880952380952382/9.0*x^9.0+a*0.019047619047619046/8.0*x^8.0-a*0.041666666666666664/5.0*x^5.0-a*4.166666666666667/4.0*x^4.0";
        EqnSolArrayMap4[4]="a*6.734006734006732E-4*x^12.0+a*0.0016534391534391536*x^9.0+a*0.0023809523809523807*x^8.0-a*0.008333333333333333*x^5.0-a*1.0416666666666667*x^4.0";
        EqnSolOrder[4] = 4;
        
        EqnSolArrayMap1[5] = "";
        EqnSolArrayDiffAlone[5] = "";
        EqnSolArrayMap2[5] = "";
        EqnSolArrayMap3[5]="";
        EqnSolArrayIntegrAlone[5]="";
        EqnSolArrayMap4[5]="";
        EqnSolOrder[5] = 5;

        EqnSolArrayMap1[6] = "";
        EqnSolArrayDiffAlone[6] = "";
        EqnSolArrayMap2[6] = "";
        EqnSolArrayMap3[6]="";
        EqnSolArrayIntegrAlone[6]="";
        EqnSolArrayMap4[6]="";
        EqnSolOrder[6] = 6;

        EqnSolArrayMap1[7] = "";
        EqnSolArrayDiffAlone[7] = "";
        EqnSolArrayMap2[7] = "";
        EqnSolArrayMap3[7]="";
        EqnSolArrayIntegrAlone[7]="";
        EqnSolArrayMap4[7]="";
        EqnSolOrder[7] = 7;

        EqnSolArrayMap1[8] = "";
        EqnSolArrayDiffAlone[8] = "";
        EqnSolArrayMap2[8] = "";
        EqnSolOrder[8] = 8;

        EqnSolArrayMap1[9] = "";
        EqnSolArrayDiffAlone[9] = "";
        EqnSolArrayMap2[9] = "";
        EqnSolOrder[9] = 9;

        EqnSolArrayMap1[10] = "";
        EqnSolArrayDiffAlone[10] = "";
        EqnSolArrayMap2[10] = "";
        EqnSolOrder[10] = 10;

        EqnSolArrayMap1[11] = "";
        EqnSolArrayDiffAlone[11] = "";
        EqnSolArrayMap2[11] = "";
        EqnSolOrder[11] = 11;

        EqnSolArrayMap1[12] = "";
        EqnSolArrayDiffAlone[12] = "";
        EqnSolArrayMap2[12] = "";
        EqnSolOrder[12] = 12;

        EqnSolArrayMap1[13] = "";
        EqnSolArrayDiffAlone[13] = "";
        EqnSolArrayMap2[13] = "";
        EqnSolOrder[13] = 13;

        EqnSolArrayMap1[14] = "";
        EqnSolArrayDiffAlone[14] = "";
        EqnSolArrayMap2[14] = "";
        EqnSolOrder[14] = 14;
    }
    public static void TestCaseDiff1003() {
        //Test Case 1003
        TestCase = 1003;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";
        EqnUnderTest = "a*x^8 + a*x^5 + a*x^4 - x - 25.0";
        TestCaseName = "Simple: Coefficients:";
        TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        DiffWithRespTo = "x";
        MaxDiffOrder = 14;
        MaxIntegreOrder = 14;
        
        EqnSolArrayMap1[1] = "a*x^8.0+a*x^5.0+a*x^4.0-x-25.0";
        EqnSolArrayDiffAlone[1] = "a*8.0*x^7.0+a*5.0*x^4.0+a*4.0*x^3.0-1.0-25.0*0.0";
        EqnSolArrayMap2[1] = "a*8.0*x^7.0+a*5.0*x^4.0+a*4.0*x^3.0-1.0";
        EqnSolArrayMap3[1]="a*x^8.0+a*x^5.0+a*x^4.0-x-25.0";
        EqnSolArrayIntegrAlone[1]="a/9.0*x^9.0+a/6.0*x^6.0+a/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        EqnSolArrayMap4[1]="a/9.0*x^9.0+a/6.0*x^6.0+a/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        EqnSolOrder[1] = 1;

        EqnSolArrayMap1[2] = "a*8.0*x^7.0+a*5.0*x^4.0+a*4.0*x^3.0-1.0";
        EqnSolArrayDiffAlone[2] = "a*8.0*7.0*x^6.0+a*5.0*4.0*x^3.0+a*4.0*3.0*x^2.0-1.0*0.0";
        EqnSolArrayMap2[2] = "a*56.0*x^6.0+a*20.0*x^3.0+a*12.0*x^2.0";
        EqnSolArrayMap3[2]="a/9.0*x^9.0+a/6.0*x^6.0+a/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        EqnSolArrayIntegrAlone[2]="a/9.0/10.0*x^10.0+a/6.0/7.0*x^7.0+a/5.0/6.0*x^6.0-1.0/2.0/3.0*x^3.0-25.0/2.0*x^2.0";
        EqnSolArrayMap4[2]="a*0.011111111111111112*x^10.0+a*0.023809523809523808*x^7.0+a/30.0*x^6.0-1.0/6.0*x^3.0-12.5*x^2.0";
        EqnSolOrder[2] = 2;

        EqnSolArrayMap1[3] = "a*56.0*x^6.0+a*20.0*x^3.0+a*12.0*x^2.0";
        EqnSolArrayDiffAlone[3] = "a*56.0*6.0*x^5.0+a*20.0*3.0*x^2.0+a*12.0*2.0*x^1.0";
        EqnSolArrayMap2[3] = "a*336.0*x^5.0+a*60.0*x^2.0+a*24.0*x";
        EqnSolArrayMap3[3]="a*0.011111111111111112*x^10.0+a*0.023809523809523808*x^7.0+a/30.0*x^6.0-1.0/6.0*x^3.0-12.5*x^2.0";
        EqnSolArrayIntegrAlone[3]="a*0.011111111111111112/11.0*x^11.0+a*0.023809523809523808/8.0*x^8.0+a/30.0/7.0*x^7.0-1.0/6.0/4.0*x^4.0-12.5/3.0*x^3.0";
        EqnSolArrayMap4[3]="a*0.00101010101010101*x^11.0+a*0.002976190476190476*x^8.0+a/210.0*x^7.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        EqnSolOrder[3] = 3;

        EqnSolArrayMap1[4] = "a*336.0*x^5.0+a*60.0*x^2.0+a*24.0*x";
        EqnSolArrayDiffAlone[4] = "a*336.0*5.0*x^4.0+a*60.0*2.0*x^1.0+a*24.0";
        EqnSolArrayMap2[4] = "a*1680.0*x^4.0+a*120.0*x+a*24.0";
        EqnSolArrayMap3[4]="a*0.00101010101010101*x^11.0+a*0.002976190476190476*x^8.0+a/210.0*x^7.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        EqnSolArrayIntegrAlone[4]="a*0.00101010101010101/12.0*x^12.0+a*0.002976190476190476/9.0*x^9.0+a/210.0/8.0*x^8.0-1.0/24.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        EqnSolArrayMap4[4]="a*8.417508417508418E-5*x^12.0+a*3.3068783068783067E-4*x^9.0+a/1680.0*x^8.0-1.0/120.0*x^5.0-1.0416666666666667*x^4.0";
        EqnSolOrder[4] = 4;
        
        EqnSolArrayMap1[5] = "";
        EqnSolArrayDiffAlone[5] = "";
        EqnSolArrayMap2[5] = "";
        EqnSolArrayMap3[5]="";
        EqnSolArrayIntegrAlone[5]="";
        EqnSolArrayMap4[5]="";
        EqnSolOrder[5] = 5;

        EqnSolArrayMap1[6] = "";
        EqnSolArrayDiffAlone[6] = "";
        EqnSolArrayMap2[6] = "";
        EqnSolArrayMap3[6]="";
        EqnSolArrayIntegrAlone[6]="";
        EqnSolArrayMap4[6]="";
        EqnSolOrder[6] = 6;

        EqnSolArrayMap1[7] = "";
        EqnSolArrayDiffAlone[7] = "";
        EqnSolArrayMap2[7] = "";
        EqnSolArrayMap3[7]="";
        EqnSolArrayIntegrAlone[7]="";
        EqnSolArrayMap4[7]="";
        EqnSolOrder[7] = 7;

        EqnSolArrayMap1[8] = "";
        EqnSolArrayDiffAlone[8] = "";
        EqnSolArrayMap2[8] = "";
        EqnSolOrder[8] = 8;

        EqnSolArrayMap1[9] = "";
        EqnSolArrayDiffAlone[9] = "";
        EqnSolArrayMap2[9] = "";
        EqnSolOrder[9] = 9;

        EqnSolArrayMap1[10] = "";
        EqnSolArrayDiffAlone[10] = "";
        EqnSolArrayMap2[10] = "";
        EqnSolOrder[10] = 10;

        EqnSolArrayMap1[11] = "";
        EqnSolArrayDiffAlone[11] = "";
        EqnSolArrayMap2[11] = "";
        EqnSolOrder[11] = 11;

        EqnSolArrayMap1[12] = "";
        EqnSolArrayDiffAlone[12] = "";
        EqnSolArrayMap2[12] = "";
        EqnSolOrder[12] = 12;

        EqnSolArrayMap1[13] = "";
        EqnSolArrayDiffAlone[13] = "";
        EqnSolArrayMap2[13] = "";
        EqnSolOrder[13] = 13;

        EqnSolArrayMap1[14] = "";
        EqnSolArrayDiffAlone[14] = "";
        EqnSolArrayMap2[14] = "";
        EqnSolOrder[14] = 14;
    }
    public static void TestCaseDiff1004() {
        //Test Case 50002
        UsageCalculus.TestCase = 1004;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "a*x^8 + a*x^5 + a*x^4 - 2*a*x- 25*(2.0)";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a*x^8.0+a*x^5.0+a*x^4.0-a*2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a*8.0*x^7.0+a*5.0*x^4.0+a*4.0*x^3.0-a*2.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a*8.0*x^7.0+a*5.0*x^4.0+a*4.0*x^3.0-a*2.0";
        UsageCalculus.EqnSolArrayMap3[1]="a*x^8.0+a*x^5.0+a*x^4.0-a*2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a/9.0*x^9.0+a/6.0*x^6.0+a/5.0*x^5.0-a*x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a/9.0*x^9.0+a/6.0*x^6.0+a/5.0*x^5.0-a*x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a*8.0*x^7.0+a*5.0*x^4.0+a*4.0*x^3.0-a*2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a*8.0*7.0*x^6.0+a*5.0*4.0*x^3.0+a*4.0*3.0*x^2.0-a*2.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a*56.0*x^6.0+a*20.0*x^3.0+a*12.0*x^2.0-a*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a/9.0*x^9.0+a/6.0*x^6.0+a/5.0*x^5.0-a*x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a/9.0/10.0*x^10.0+a/6.0/7.0*x^7.0+a/5.0/6.0*x^6.0-a/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a*0.011111111111111112*x^10.0+a*0.023809523809523808*x^7.0+a*0.03333333333333333*x^6.0-a/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a*56.0*x^6.0+a*20.0*x^3.0+a*12.0*x^2.0-a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a*56.0*6.0*x^5.0+a*20.0*3.0*x^2.0+a*12.0*2.0*x^1.0-a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a*336.0*x^5.0+a*60.0*x^2.0+a*24.0*x-a*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a*0.011111111111111112*x^10.0+a*0.023809523809523808*x^7.0+a*0.03333333333333333*x^6.0-a/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a*0.011111111111111112/11.0*x^11.0+a*0.023809523809523808/8.0*x^8.0+a*0.03333333333333333/7.0*x^7.0-a/3.0/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a*0.00101010101010101*x^11.0+a*0.002976190476190476*x^8.0+a*0.0047619047619047615*x^7.0-a/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a*336.0*x^5.0+a*60.0*x^2.0+a*24.0*x-a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a*336.0*5.0*x^4.0+a*60.0*2.0*x^1.0+a*24.0-a*0.0*0.0";
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
    public static void TestCaseDiff1005() {
        //Test Case 50001
        UsageCalculus.TestCase = 1005;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values Except 4th Order Integration";
        UsageCalculus.EqnUnderTest = "p/9.0*xyc1^9.0 + p*6.0*xyc1^6.0 + p/5.0*xyc1^5.0 + p*2.0*xyc1^2.0 + p*25.0*xyc1 + p*50.0*1.0";
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
    public static void TestCaseDiff1006() {
        //Test Case 50001
        UsageCalculus.TestCase = 1006;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values Except 4th Order Integration";
        UsageCalculus.EqnUnderTest = "xyc1^9.0 + xyc1^6.0 + xyc1^5.0 + xyc1^2.0 + xyc1 + 50.0*1.0";
        UsageCalculus.TestCaseName = "Standard:Independent Constant:Basic Equation:Divide Operator";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "xyc1^9.0+xyc1^6.0+xyc1^5.0+xyc1^2.0+xyc1+50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "9.0*xyc1^8.0+6.0*xyc1^5.0+5.0*xyc1^4.0+2.0*xyc1^1.0+1.0+50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "9.0*xyc1^8.0+6.0*xyc1^5.0+5.0*xyc1^4.0+2.0*xyc1+1.0";
        UsageCalculus.EqnSolArrayMap3[1]="xyc1^9.0+xyc1^6.0+xyc1^5.0+xyc1^2.0+xyc1+50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/10.0*xyc1^10.0+1.0/7.0*xyc1^7.0+1.0/6.0*xyc1^6.0+1.0/3.0*xyc1^3.0+1.0/2.0*xyc1^2.0+50.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/10.0*xyc1^10.0+1.0/7.0*xyc1^7.0+1.0/6.0*xyc1^6.0+1.0/3.0*xyc1^3.0+1.0/2.0*xyc1^2.0+50.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "9.0*xyc1^8.0+6.0*xyc1^5.0+5.0*xyc1^4.0+2.0*xyc1+1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "9.0*8.0*xyc1^7.0+6.0*5.0*xyc1^4.0+5.0*4.0*xyc1^3.0+2.0+1.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "72.0*xyc1^7.0+30.0*xyc1^4.0+20.0*xyc1^3.0+2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/10.0*xyc1^10.0+1.0/7.0*xyc1^7.0+1.0/6.0*xyc1^6.0+1.0/3.0*xyc1^3.0+1.0/2.0*xyc1^2.0+50.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/10.0/11.0*xyc1^11.0+1.0/7.0/8.0*xyc1^8.0+1.0/6.0/7.0*xyc1^7.0+1.0/3.0/4.0*xyc1^4.0+1.0/2.0/3.0*xyc1^3.0+50.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/110.0*xyc1^11.0+1.0/56.0*xyc1^8.0+1.0/42.0*xyc1^7.0+1.0/12.0*xyc1^4.0+1.0/6.0*xyc1^3.0+25.0*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "72.0*xyc1^7.0+30.0*xyc1^4.0+20.0*xyc1^3.0+2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "72.0*7.0*xyc1^6.0+30.0*4.0*xyc1^3.0+20.0*3.0*xyc1^2.0+2.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "504.0*xyc1^6.0+120.0*xyc1^3.0+60.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/110.0*xyc1^11.0+1.0/56.0*xyc1^8.0+1.0/42.0*xyc1^7.0+1.0/12.0*xyc1^4.0+1.0/6.0*xyc1^3.0+25.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/110.0/12.0*xyc1^12.0+1.0/56.0/9.0*xyc1^9.0+1.0/42.0/8.0*xyc1^8.0+1.0/12.0/5.0*xyc1^5.0+1.0/6.0/4.0*xyc1^4.0+25.0/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/1320.0*xyc1^12.0+1.0/504.0*xyc1^9.0+1.0/336.0*xyc1^8.0+1.0/60.0*xyc1^5.0+1.0/24.0*xyc1^4.0+8.333333333333334*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "504.0*xyc1^6.0+120.0*xyc1^3.0+60.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "504.0*6.0*xyc1^5.0+120.0*3.0*xyc1^2.0+60.0*2.0*xyc1^1.0";
        UsageCalculus.EqnSolArrayMap2[4] = "3024.0*xyc1^5.0+360.0*xyc1^2.0+120.0*xyc1";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/1320.0*xyc1^12.0+1.0/504.0*xyc1^9.0+1.0/336.0*xyc1^8.0+1.0/60.0*xyc1^5.0+1.0/24.0*xyc1^4.0+8.333333333333334*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/1320.0/13.0*xyc1^13.0+1.0/504.0/10.0*xyc1^10.0+1.0/336.0/9.0*xyc1^9.0+1.0/60.0/6.0*xyc1^6.0+1.0/24.0/5.0*xyc1^5.0+8.333333333333334/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/17160.0*xyc1^13.0+1.0/5040.0*xyc1^10.0+1.0/3024.0*xyc1^9.0+1.0/360.0*xyc1^6.0+1.0/120.0*xyc1^5.0+2.0833333333333335*xyc1^4.0";
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
    public static void TestCaseDiff1007() {
        //Test Case 1007
        UsageCalculus.TestCase = 1007;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values Except 4th Order Integration";
        UsageCalculus.EqnUnderTest = "1/xyc1^2.0/xyc1^0 + 1/xyc1/xyc1^0 + 1/xyc1^2.0 + 1/xyc1 + 50.0*1.0";
        UsageCalculus.TestCaseName = "Standard:Independent Constant:Basic Equation:Divide Operator";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/xyc1^2.0+1.0/xyc1+1.0/xyc1^2.0+1.0/xyc1+50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-2.0/xyc1^3.0-1.0/xyc1^2.0-2.0/xyc1^3.0-1.0/xyc1^2.0+50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-2.0/xyc1^3.0-1.0/xyc1^2.0-2.0/xyc1^3.0-1.0/xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/xyc1^2.0+1.0/xyc1+1.0/xyc1^2.0+1.0/xyc1+50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/-1.0/xyc1^1.0+ln(xyc1)+1.0/-1.0/xyc1^1.0+ln(xyc1)+50.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="-1.0/xyc1+ln(xyc1)-1.0/xyc1+ln(xyc1)+50.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-2.0/xyc1^3.0-1.0/xyc1^2.0-2.0/xyc1^3.0-1.0/xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-2.0*-3.0/xyc1^4.0+2.0/xyc1^3.0-2.0*-3.0/xyc1^4.0+2.0/xyc1^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "6.0/xyc1^4.0+2.0/xyc1^3.0+6.0/xyc1^4.0+2.0/xyc1^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "6.0/xyc1^4.0+2.0/xyc1^3.0+6.0/xyc1^4.0+2.0/xyc1^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "6.0*-4.0/xyc1^5.0+2.0*-3.0/xyc1^4.0+6.0*-4.0/xyc1^5.0+2.0*-3.0/xyc1^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-24.0/xyc1^5.0-6.0/xyc1^4.0-24.0/xyc1^5.0-6.0/xyc1^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-24.0/xyc1^5.0-6.0/xyc1^4.0-24.0/xyc1^5.0-6.0/xyc1^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-24.0*-5.0/xyc1^6.0-6.0*-4.0/xyc1^5.0-24.0*-5.0/xyc1^6.0-6.0*-4.0/xyc1^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "120.0/xyc1^6.0+24.0/xyc1^5.0+120.0/xyc1^6.0+24.0/xyc1^5.0";
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
        public static void TestCaseDiff1008() {
        //Test Case 1008
        UsageCalculus.TestCase = 1008;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values Except 4th Order Integration";
        UsageCalculus.EqnUnderTest = "1*xyc1^2.0*xyc1^0 + 1*xyc1*xyc1^0 + 1*xyc1^2.0 + 1/xyc1 + 50.0*1.0";
        UsageCalculus.TestCaseName = "Standard:Independent Constant:Basic Equation:Divide Operator";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "xyc1^2.0+xyc1+xyc1^2.0+1.0/xyc1+50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "2.0*xyc1^1.0+1.0+2.0*xyc1^1.0-1.0/xyc1^2.0+50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "2.0*xyc1+1.0+2.0*xyc1-1.0/xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="xyc1^2.0+xyc1+xyc1^2.0+1.0/xyc1+50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/3.0*xyc1^3.0+1.0/2.0*xyc1^2.0+1.0/3.0*xyc1^3.0+ln(xyc1)+50.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/3.0*xyc1^3.0+1.0/2.0*xyc1^2.0+0.3333333333333333*xyc1^3.0+ln(xyc1)+50.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "2.0*xyc1+1.0+2.0*xyc1-1.0/xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "2.0+1.0*0.0+2.0+2.0/xyc1^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "2.0+2.0+2.0/xyc1^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "2.0+2.0+2.0/xyc1^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "0.0+2.0*0.0+2.0*-3.0/xyc1^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-6.0/xyc1^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-6.0/xyc1^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-6.0*-4.0/xyc1^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "24.0/xyc1^5.0";
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
        public static void TestCaseDiff1009() {
        //Test Case 1009
        UsageCalculus.TestCase = 1009;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values Except 4th Order Integration";
        UsageCalculus.EqnUnderTest = "xyc1^9 + xyc1^6.0 + xyc1^5.0 + xyc1^2.0 + xyc1 + 50.0*1.0";
        UsageCalculus.TestCaseName = "Standard:Independent Constant:Basic Equation:Divide Operator";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "xyc1^9.0+xyc1^6.0+xyc1^5.0+xyc1^2.0+xyc1+50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "9.0*xyc1^8.0+6.0*xyc1^5.0+5.0*xyc1^4.0+2.0*xyc1^1.0+1.0+50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "9.0*xyc1^8.0+6.0*xyc1^5.0+5.0*xyc1^4.0+2.0*xyc1+1.0";
        UsageCalculus.EqnSolArrayMap3[1]="xyc1^9.0+xyc1^6.0+xyc1^5.0+xyc1^2.0+xyc1+50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/10.0*xyc1^10.0+1.0/7.0*xyc1^7.0+1.0/6.0*xyc1^6.0+1.0/3.0*xyc1^3.0+1.0/2.0*xyc1^2.0+50.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/10.0*xyc1^10.0+1.0/7.0*xyc1^7.0+1.0/6.0*xyc1^6.0+1.0/3.0*xyc1^3.0+1.0/2.0*xyc1^2.0+50.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "9.0*xyc1^8.0+6.0*xyc1^5.0+5.0*xyc1^4.0+2.0*xyc1+1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "9.0*8.0*xyc1^7.0+6.0*5.0*xyc1^4.0+5.0*4.0*xyc1^3.0+2.0+1.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "72.0*xyc1^7.0+30.0*xyc1^4.0+20.0*xyc1^3.0+2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/10.0*xyc1^10.0+1.0/7.0*xyc1^7.0+1.0/6.0*xyc1^6.0+1.0/3.0*xyc1^3.0+1.0/2.0*xyc1^2.0+50.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/10.0/11.0*xyc1^11.0+1.0/7.0/8.0*xyc1^8.0+1.0/6.0/7.0*xyc1^7.0+1.0/3.0/4.0*xyc1^4.0+1.0/2.0/3.0*xyc1^3.0+50.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/110.0*xyc1^11.0+1.0/56.0*xyc1^8.0+1.0/42.0*xyc1^7.0+1.0/12.0*xyc1^4.0+1.0/6.0*xyc1^3.0+25.0*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "72.0*xyc1^7.0+30.0*xyc1^4.0+20.0*xyc1^3.0+2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "72.0*7.0*xyc1^6.0+30.0*4.0*xyc1^3.0+20.0*3.0*xyc1^2.0+2.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "504.0*xyc1^6.0+120.0*xyc1^3.0+60.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/110.0*xyc1^11.0+1.0/56.0*xyc1^8.0+1.0/42.0*xyc1^7.0+1.0/12.0*xyc1^4.0+1.0/6.0*xyc1^3.0+25.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/110.0/12.0*xyc1^12.0+1.0/56.0/9.0*xyc1^9.0+1.0/42.0/8.0*xyc1^8.0+1.0/12.0/5.0*xyc1^5.0+1.0/6.0/4.0*xyc1^4.0+25.0/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/1320.0*xyc1^12.0+1.0/504.0*xyc1^9.0+1.0/336.0*xyc1^8.0+1.0/60.0*xyc1^5.0+1.0/24.0*xyc1^4.0+8.333333333333334*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "504.0*xyc1^6.0+120.0*xyc1^3.0+60.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "504.0*6.0*xyc1^5.0+120.0*3.0*xyc1^2.0+60.0*2.0*xyc1^1.0";
        UsageCalculus.EqnSolArrayMap2[4] = "3024.0*xyc1^5.0+360.0*xyc1^2.0+120.0*xyc1";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/1320.0*xyc1^12.0+1.0/504.0*xyc1^9.0+1.0/336.0*xyc1^8.0+1.0/60.0*xyc1^5.0+1.0/24.0*xyc1^4.0+8.333333333333334*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/1320.0/13.0*xyc1^13.0+1.0/504.0/10.0*xyc1^10.0+1.0/336.0/9.0*xyc1^9.0+1.0/60.0/6.0*xyc1^6.0+1.0/24.0/5.0*xyc1^5.0+8.333333333333334/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/17160.0*xyc1^13.0+1.0/5040.0*xyc1^10.0+1.0/3024.0*xyc1^9.0+1.0/360.0*xyc1^6.0+1.0/120.0*xyc1^5.0+2.0833333333333335*xyc1^4.0";
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
    public static void TestCaseDiff1010() {
        //Test Case 1007
        UsageCalculus.TestCase = 1010;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values Except 4th Order Integration";
        UsageCalculus.EqnUnderTest = "p*1/xyc1^2.0/xyc1^0 + p*1/xyc1/xyc1^0 + p*1/xyc1^2.0 + p*1/xyc1 + p*50.0*1.0";
        UsageCalculus.TestCaseName = "Standard:Independent Constant:Basic Equation:Divide Operator";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "p/xyc1^2.0+p/xyc1+p/xyc1^2.0+p/xyc1+p*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "p*-2.0/xyc1^3.0-p/xyc1^2.0+p*-2.0/xyc1^3.0-p/xyc1^2.0+p*50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-p*2.0/xyc1^3.0-p/xyc1^2.0-p*2.0/xyc1^3.0-p/xyc1^2.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="p/xyc1^2.0+p/xyc1+p/xyc1^2.0+p/xyc1+p*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="p/-1.0/xyc1^1.0+p*ln(xyc1)+p/-1.0/xyc1^1.0+p*ln(xyc1)+p*50.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="-p/xyc1+p*ln(xyc1)-p/xyc1+p*ln(xyc1)+p*50.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-p*2.0/xyc1^3.0-p/xyc1^2.0-p*2.0/xyc1^3.0-p/xyc1^2.0+p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-p*2.0*-3.0/xyc1^4.0-p*-2.0/xyc1^3.0-p*2.0*-3.0/xyc1^4.0-p*-2.0/xyc1^3.0+p*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "p*6.0/xyc1^4.0+p*2.0/xyc1^3.0+p*6.0/xyc1^4.0+p*2.0/xyc1^3.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "p*6.0/xyc1^4.0+p*2.0/xyc1^3.0+p*6.0/xyc1^4.0+p*2.0/xyc1^3.0+p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "p*6.0*-4.0/xyc1^5.0+p*2.0*-3.0/xyc1^4.0+p*6.0*-4.0/xyc1^5.0+p*2.0*-3.0/xyc1^4.0+p*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-p*24.0/xyc1^5.0-p*6.0/xyc1^4.0-p*24.0/xyc1^5.0-p*6.0/xyc1^4.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-p*24.0/xyc1^5.0-p*6.0/xyc1^4.0-p*24.0/xyc1^5.0-p*6.0/xyc1^4.0+p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-p*24.0*-5.0/xyc1^6.0-p*6.0*-4.0/xyc1^5.0-p*24.0*-5.0/xyc1^6.0-p*6.0*-4.0/xyc1^5.0+p*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "p*120.0/xyc1^6.0+p*24.0/xyc1^5.0+p*120.0/xyc1^6.0+p*24.0/xyc1^5.0+p*0.0";
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
        public static void TestCaseDiff1011() {
        //Test Case 1011
        UsageCalculus.TestCase = 1011;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values Except 4th Order Integration";
        UsageCalculus.EqnUnderTest = "p*xyc1^2.0*xyc1^0 + p*xyc1*xyc1^0 + p*xyc1^2.0 + p/xyc1 + p/50.0*1.0";
        UsageCalculus.TestCaseName = "Standard:Independent Constant:Basic Equation:Divide Operator";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "p*xyc1^2.0+p*xyc1+p*xyc1^2.0+p/xyc1+p/50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "p*2.0*xyc1^1.0+p+p*2.0*xyc1^1.0-p/xyc1^2.0+p/50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "p*2.0*xyc1+p+p*2.0*xyc1-p/xyc1^2.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="p*xyc1^2.0+p*xyc1+p*xyc1^2.0+p/xyc1+p/50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="p/3.0*xyc1^3.0+p/2.0*xyc1^2.0+p/3.0*xyc1^3.0+p*ln(xyc1)+p/50.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="p/3.0*xyc1^3.0+p/2.0*xyc1^2.0+p/3.0*xyc1^3.0+p*ln(xyc1)+p/50.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "p*2.0*xyc1+p+p*2.0*xyc1-p/xyc1^2.0+p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "p*2.0+p*0.0+p*2.0-p*-2.0/xyc1^3.0+p*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "p*2.0+p*0.0+p*2.0+p*2.0/xyc1^3.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "p*2.0+p*0.0+p*2.0+p*2.0/xyc1^3.0+p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "p*2.0*0.0+p*0.0*0.0+p*2.0*0.0+p*2.0*-3.0/xyc1^4.0+p*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "p*0.0+p*0.0+p*0.0-p*6.0/xyc1^4.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "p*0.0+p*0.0+p*0.0-p*6.0/xyc1^4.0+p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "p*0.0+p*0.0*0.0+p*0.0*0.0-p*6.0*-4.0/xyc1^5.0+p*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "p*0.0+p*0.0+p*0.0+p*24.0/xyc1^5.0+p*0.0";
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
    public static void TestCaseDiff1012() {
        //Test Case 1012
        UsageCalculus.TestCase = 1012;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values Except 4th Order Integration";
        UsageCalculus.EqnUnderTest = "(p/9.0)*xyc1^9.0 + (p*6.0)*xyc1^6.0 + (p/5.0)*xyc1^5.0 + (p*2.0)*xyc1^2.0 + (p*25.0)*xyc1 + (p*50.0)*1.0";
        UsageCalculus.TestCaseName = "Standard:Independent Constant:Basic Equation:Divide Operator";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "p/9.0*xyc1^9.0+p*6.0*xyc1^6.0+p/5.0*xyc1^5.0+p*2.0*xyc1^2.0+p*25.0*xyc1+p*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "p/9.0*9.0*xyc1^8.0+p*6.0*6.0*xyc1^5.0+p/5.0*5.0*xyc1^4.0+p*2.0*2.0*xyc1^1.0+p*25.0+p*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "p*xyc1^8.0+p*36.0*xyc1^5.0+p*xyc1^4.0+p*4.0*xyc1+p*25.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="p/9.0*xyc1^9.0+p*6.0*xyc1^6.0+p/5.0*xyc1^5.0+p*2.0*xyc1^2.0+p*25.0*xyc1+p*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="p/9.0/10.0*xyc1^10.0+p*6.0/7.0*xyc1^7.0+p/5.0/6.0*xyc1^6.0+p*2.0/3.0*xyc1^3.0+p*25.0/2.0*xyc1^2.0+p*50.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="p*0.011111111111111112*xyc1^10.0+p*0.8571428571428571*xyc1^7.0+p*0.03333333333333333*xyc1^6.0+p*0.6666666666666666*xyc1^3.0+p*12.5*xyc1^2.0+p*50.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "p*xyc1^8.0+p*36.0*xyc1^5.0+p*xyc1^4.0+p*4.0*xyc1+p*25.0+p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "p*8.0*xyc1^7.0+p*36.0*5.0*xyc1^4.0+p*4.0*xyc1^3.0+p*4.0+p*25.0*0.0+p*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "p*8.0*xyc1^7.0+p*180.0*xyc1^4.0+p*4.0*xyc1^3.0+p*4.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="p*0.011111111111111112*xyc1^10.0+p*0.8571428571428571*xyc1^7.0+p*0.03333333333333333*xyc1^6.0+p*0.6666666666666666*xyc1^3.0+p*12.5*xyc1^2.0+p*50.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="p*0.011111111111111112/11.0*xyc1^11.0+p*0.8571428571428571/8.0*xyc1^8.0+p*0.03333333333333333/7.0*xyc1^7.0+p*0.6666666666666666/4.0*xyc1^4.0+p*12.5/3.0*xyc1^3.0+p*50.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="p*0.00101010101010101*xyc1^11.0+p*0.10714285714285714*xyc1^8.0+p*0.0047619047619047615*xyc1^7.0+p*0.16666666666666666*xyc1^4.0+p*4.166666666666667*xyc1^3.0+p*25.0*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "p*8.0*xyc1^7.0+p*180.0*xyc1^4.0+p*4.0*xyc1^3.0+p*4.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "p*8.0*7.0*xyc1^6.0+p*180.0*4.0*xyc1^3.0+p*4.0*3.0*xyc1^2.0+p*4.0*0.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "p*56.0*xyc1^6.0+p*720.0*xyc1^3.0+p*12.0*xyc1^2.0+p*0.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="p*0.00101010101010101*xyc1^11.0+p*0.10714285714285714*xyc1^8.0+p*0.0047619047619047615*xyc1^7.0+p*0.16666666666666666*xyc1^4.0+p*4.166666666666667*xyc1^3.0+p*25.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="p*0.00101010101010101/12.0*xyc1^12.0+p*0.10714285714285714/9.0*xyc1^9.0+p*0.0047619047619047615/8.0*xyc1^8.0+p*0.16666666666666666/5.0*xyc1^5.0+p*4.166666666666667/4.0*xyc1^4.0+p*25.0/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="p*8.417508417508418E-5*xyc1^12.0+p*0.011904761904761904*xyc1^9.0+p*5.952380952380952E-4*xyc1^8.0+p*0.03333333333333333*xyc1^5.0+p*1.0416666666666667*xyc1^4.0+p*8.333333333333334*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "p*56.0*xyc1^6.0+p*720.0*xyc1^3.0+p*12.0*xyc1^2.0+p*0.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "p*56.0*6.0*xyc1^5.0+p*720.0*3.0*xyc1^2.0+p*12.0*2.0*xyc1^1.0+p*0.0+p*0.0+p*0.0";
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
    public static void TestCaseDiff1013() {
        //Test Case 1012
        UsageCalculus.TestCase = 1013;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values Except 4th Order Integration";
        UsageCalculus.EqnUnderTest = "(p/9.0)*xyc1^9.0 + (p*6.0)*xyc1^6.0 + (p/5.0)/xyc1^5.0 + (p*2.0)/xyc1^2.0 + (p*25.0)/xyc1 + (p*50.0)*1.0";
        UsageCalculus.TestCaseName = "Standard:Independent Constant:Basic Equation:Divide Operator";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 3;
        
        UsageCalculus.EqnSolArrayMap1[1] = "p/9.0*xyc1^9.0+p*6.0*xyc1^6.0+p/5.0*xyc1^5.0+p*2.0*xyc1^2.0+p*25.0/xyc1+p*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "p/9.0*9.0*xyc1^8.0+p*6.0*6.0*xyc1^5.0+p/5.0*5.0*xyc1^4.0+p*2.0*2.0*xyc1^1.0+p*25.0+p*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "p*xyc1^8.0+p*36.0*xyc1^5.0+p*xyc1^4.0+p*4.0*xyc1+p*25.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="p/9.0*xyc1^9.0+p*6.0*xyc1^6.0+p/5.0/xyc1^5.0+p*2.0/xyc1^2.0+p*25.0/xyc1+p*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="p/9.0/10.0*xyc1^10.0+p*6.0/7.0*xyc1^7.0+p/5.0/-4.0/xyc1^4.0+p*2.0/-1.0/xyc1^1.0+p*25.0*ln(xyc1)+p*50.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="p*0.011111111111111112*xyc1^10.0+p*0.8571428571428571*xyc1^7.0-p/20.0/xyc1^4.0-p*2.0/xyc1+p*25.0*ln(xyc1)+p*50.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "p*xyc1^8.0+p*36.0*xyc1^5.0+p*xyc1^4.0+p*4.0*xyc1+p*25.0+p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "p*8.0*xyc1^7.0+p*36.0*5.0*xyc1^4.0+p*4.0*xyc1^3.0+p*4.0+p*25.0*0.0+p*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "p*8.0*xyc1^7.0+p*180.0*xyc1^4.0+p*4.0*xyc1^3.0+p*4.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "p*8.0*xyc1^7.0+p*180.0*xyc1^4.0+p*4.0*xyc1^3.0+p*4.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "p*8.0*7.0*xyc1^6.0+p*180.0*4.0*xyc1^3.0+p*4.0*3.0*xyc1^2.0+p*4.0*0.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "p*56.0*xyc1^6.0+p*720.0*xyc1^3.0+p*12.0*xyc1^2.0+p*0.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "p*56.0*xyc1^6.0+p*720.0*xyc1^3.0+p*12.0*xyc1^2.0+p*0.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "p*56.0*6.0*xyc1^5.0+p*720.0*3.0*xyc1^2.0+p*12.0*2.0*xyc1^1.0+p*0.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "p*336.0*xyc1^5.0+p*2160.0*xyc1^2.0+p*24.0*xyc1+p*0.0+p*0.0+p*0.0";
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
    public static void TestCaseDiff1014() {
        //Test Case 1007
        UsageCalculus.TestCase = 1014;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values Except 4th Order Integration";
        //+ p*1/xyc1^2.0 + p*1/xyc1 + p*50.0*1.0
        UsageCalculus.EqnUnderTest = "p*1/xyc1^2.0/xyc1^0 + p*1/xyc1/xyc1^0 ";
        UsageCalculus.TestCaseName = "Standard:Independent Constant:Basic Equation:Divide Operator";
        UsageCalculus.TestCaseMatrixID="Unit TestCase";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "p/xyc1^2.0+p/xyc1";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "p*-2.0/xyc1^3.0-p/xyc1^2.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-p*2.0/xyc1^3.0-p/xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="p/xyc1^2.0+p/xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="p/-1.0/xyc1^1.0+p*ln(xyc1)";
        UsageCalculus.EqnSolArrayMap4[1]="-p/xyc1+p*ln(xyc1)";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-p*2.0/xyc1^3.0-p/xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-p*2.0*-3.0/xyc1^4.0-p*-2.0/xyc1^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "p*6.0/xyc1^4.0+p*2.0/xyc1^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "p*6.0/xyc1^4.0+p*2.0/xyc1^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "p*6.0*-4.0/xyc1^5.0+p*2.0*-3.0/xyc1^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-p*24.0/xyc1^5.0-p*6.0/xyc1^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-p*24.0/xyc1^5.0-p*6.0/xyc1^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-p*24.0*-5.0/xyc1^6.0-p*6.0*-4.0/xyc1^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "p*120.0/xyc1^6.0+p*24.0/xyc1^5.0";
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
    public static void TestCaseDiff1015() {
        //Test Case 20017
        UsageCalculus.TestCase = 1015;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "3.0/3.0*1.0*+2*xyc1^8*5^2 + 1.0*+2*xyc1^5*5^2 + 1.0*+2*xyc1^4*5^2 + 1.0*+2*xyc1*5^2 + 1.0*+2*25*5";
        UsageCalculus.TestCaseName = "Simple: Coefficients:5^2:";
        UsageCalculus.TestCaseMatrixID="Coefficients:5^2:3 Letter with Numerics:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "50.0*xyc1^8.0+50.0*xyc1^5.0+50.0*xyc1^4.0+50.0*xyc1+250.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "50.0*8.0*xyc1^7.0+50.0*5.0*xyc1^4.0+50.0*4.0*xyc1^3.0+50.0+250.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "400.0*xyc1^7.0+250.0*xyc1^4.0+200.0*xyc1^3.0+50.0";
        UsageCalculus.EqnSolArrayMap3[1]="50.0*xyc1^8.0+50.0*xyc1^5.0+50.0*xyc1^4.0+50.0*xyc1+250.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="50.0/9.0*xyc1^9.0+50.0/6.0*xyc1^6.0+50.0/5.0*xyc1^5.0+50.0/2.0*xyc1^2.0+250.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="5.555555555555555*xyc1^9.0+8.333333333333334*xyc1^6.0+10.0*xyc1^5.0+25.0*xyc1^2.0+250.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "400.0*xyc1^7.0+250.0*xyc1^4.0+200.0*xyc1^3.0+50.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "400.0*7.0*xyc1^6.0+250.0*4.0*xyc1^3.0+200.0*3.0*xyc1^2.0+50.0*0.0";
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
}
