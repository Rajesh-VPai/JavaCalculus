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
import org.apache.log4j.Logger;

/**
 *
 * @author Rajesh V Pai
 */
public class TestHarnessInfinityNaN {
   public static Logger log = Logger.getLogger(TestHarnessInfinityNaN.class.getName());
   
   //InfinityNaN Test Cases
    public static void InfinityNaNTestCases(String AlgoName,long j){
        if(((!RunAllTestCasesFlag)&&(IgnoreKnownIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainIntegrTest"))&&(IntegralGapInfinity(j)))
                ||((!RunAllTestCasesFlag)&&(IgnoreKnownIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainDiffTest"))&&(DifferentialGapInfinity(j))) )
        {
            KnownIssueTestCasesFlag=true;
            KnownIssues++;
            KnownIssuesTestCases.put(KnownIssues, "" + j);
            System.out.println(ConsoleColors.RED +"InfinityNaNTestCases TestCase:j= " + j  + ": Infinite Loop GAP" + ConsoleColors.RESET);
        }
        else if(((!RunAllTestCasesFlag)&&(IgnoreKnownIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainIntegrTest"))&&(IntegralGapException(j)))
                ||((!RunAllTestCasesFlag)&&(IgnoreKnownIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainDiffTest"))&&(DifferentialGapException(j))) )
        {
            KnownIssueTestCasesFlag=true;
            KnownIssues++;
            KnownIssuesTestCases.put(KnownIssues, "" + j);
            System.out.println(ConsoleColors.RED +"InfinityNaNTestCases TestCase:j= " + j  + ": Exception GAP" + ConsoleColors.RESET);
        }
        else {
            switch((int)j){
            case 6000:
                TestCaseDiff6000();
                break;
            case 6001:
                TestCaseDiff6001();
                break;
            case 6002:
                TestCaseDiff6002();
                break;
            case 6003:
                TestCaseDiff6003();
                break;
            case 6004:
                TestCaseDiff6004();
                break;
            case 6005:
                TestCaseDiff6005();
                break;
            case 6006:
                TestCaseDiff6006();
                break;
            case 6007:
                TestCaseDiff6007();
                break;
            case 6008:
                TestCaseDiff6008();
                break;
            case 6009:
                TestCaseDiff6009();
                break;
            case 6010:
                TestCaseDiff6010();
                break;
            case 6011:
                TestCaseDiff6011();
                break;
            case 6012:
                TestCaseDiff6012();
                break;
            case 6013:
                TestCaseDiff6013();
                break;
            case 6014:
                TestCaseDiff6014();
                break;
            case 6015:
                TestCaseDiff6015();
                break;
            case 6016:
                TestCaseDiff6016();
                break;
            case 6017:
                TestCaseDiff6017();
                break;
            case 6018:
                TestCaseDiff6018();
                break;
            case 6019:
                TestCaseDiff6019();
                break;
            default:
                System.out.println(ConsoleColors.RED +"Names TestCase:j= " + j  + ": Gap" + ConsoleColors.RESET);
                break;
        }
    }
}
    public static void TestCaseDiff6000() {
        //Test Case 6000
        UsageCalculus.TestCase = 6000;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0/-0/x^8 + 1.0/-0/x^5 + 1.0/-0/x^4 - 1.0/-0/x - 25/-0";
        UsageCalculus.TestCaseName = "Simple: Coefficients:0";
        UsageCalculus.TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-Infinity/x^8.0-Infinity/x^5.0-Infinity/x^4.0+Infinity/x+Infinity";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-Infinity*-8.0/x^9.0-Infinity*-5.0/x^6.0-Infinity*-4.0/x^5.0-Infinity/x^2.0+Infinity*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "Infinity*8.0/x^9.0+Infinity*5.0/x^6.0+Infinity*4.0/x^5.0-Infinity/x^2.0+Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="-Infinity/x^8.0-Infinity/x^5.0-Infinity/x^4.0+Infinity/x+Infinity";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-Infinity/-7.0/x^7.0-Infinity/-4.0/x^4.0-Infinity/-3.0/x^3.0+Infinity*ln(x)+Infinity*x";
        UsageCalculus.EqnSolArrayMap4[1]="Infinity/7.0/x^7.0+Infinity/4.0/x^4.0+Infinity/3.0/x^3.0+Infinity*ln(x)+Infinity*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "Infinity*8.0/x^9.0+Infinity*5.0/x^6.0+Infinity*4.0/x^5.0-Infinity/x^2.0+Infinity*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "Infinity*8.0*-9.0/x^10.0+Infinity*5.0*-6.0/x^7.0+Infinity*4.0*-5.0/x^6.0-Infinity*-2.0/x^3.0+Infinity*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-Infinity*72.0/x^10.0-Infinity*30.0/x^7.0-Infinity*20.0/x^6.0+Infinity*2.0/x^3.0+Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-Infinity*72.0/x^10.0-Infinity*30.0/x^7.0-Infinity*20.0/x^6.0+Infinity*2.0/x^3.0+Infinity*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-Infinity*72.0*-10.0/x^11.0-Infinity*30.0*-7.0/x^8.0-Infinity*20.0*-6.0/x^7.0+Infinity*2.0*-3.0/x^4.0+Infinity*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "Infinity*720.0/x^11.0+Infinity*210.0/x^8.0+Infinity*120.0/x^7.0-Infinity*6.0/x^4.0+Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "Infinity*720.0/x^11.0+Infinity*209.99999999999997/x^8.0+Infinity*120.0/x^7.0-Infinity*6.0/x^4.0+Infinity*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "Infinity*720.0*-11.0/x^12.0+Infinity*209.99999999999997*-8.0/x^9.0+Infinity*120.0*-7.0/x^8.0-Infinity*6.0*-4.0/x^5.0+Infinity*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-Infinity*7920.0/x^12.0-Infinity*1679.9999999999998/x^9.0-Infinity*840.0/x^8.0+Infinity*24.0/x^5.0+Infinity*0.0";
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
    public static void TestCaseDiff6001() {
        //Test Case 6001
        UsageCalculus.TestCase = 6001;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*Infinity/x^8 + 1.0*Infinity/x^5 + 1.0*Infinity/x^4 - 1.0*Infinity/x - 25*Infinity";
        UsageCalculus.TestCaseName = "Simple: Coefficients:Infinity";
        UsageCalculus.TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "Infinity/x^8.0+Infinity/x^5.0+Infinity/x^4.0-Infinity/x-Infinity*25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "Infinity*-8.0/x^9.0+Infinity*-5.0/x^6.0+Infinity*-4.0/x^5.0+Infinity/x^2.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-Infinity*8.0/x^9.0-Infinity*5.0/x^6.0-Infinity*4.0/x^5.0+Infinity/x^2.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="Infinity*x^8.0+Infinity*x^5.0+Infinity*x^4.0-Infinity*x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="Infinity/9.0*x^9.0+Infinity/6.0*x^6.0+Infinity/5.0*x^5.0-Infinity/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="Infinity/9.0*x^9.0+Infinity/6.0*x^6.0+Infinity/5.0*x^5.0-Infinity/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-Infinity*8.0/x^9.0-Infinity*5.0/x^6.0-Infinity*4.0/x^5.0+Infinity/x^2.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-Infinity*8.0*-9.0/x^10.0-Infinity*5.0*-6.0/x^7.0-Infinity*4.0*-5.0/x^6.0+Infinity*-2.0/x^3.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "Infinity*72.0/x^10.0+Infinity*30.0/x^7.0+Infinity*20.0/x^6.0-Infinity*2.0/x^3.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "Infinity*72.0/x^10.0+Infinity*30.0/x^7.0+Infinity*20.0/x^6.0-Infinity*2.0/x^3.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "Infinity*72.0*-10.0/x^11.0+Infinity*30.0*-7.0/x^8.0+Infinity*20.0*-6.0/x^7.0-Infinity*2.0*-3.0/x^4.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-Infinity*720.0/x^11.0-Infinity*210.0/x^8.0-Infinity*120.0/x^7.0+Infinity*6.0/x^4.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-Infinity*720.0/x^11.0-Infinity*210.0/x^8.0-Infinity*120.0/x^7.0+Infinity*6.0/x^4.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-Infinity*720.0*-11.0/x^12.0-Infinity*210.0*-8.0/x^9.0-Infinity*120.0*-7.0/x^8.0+Infinity*6.0*-4.0/x^5.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "Infinity*7920.0/x^12.0+Infinity*1680.0/x^9.0+Infinity*840.0/x^8.0-Infinity*24.0/x^5.0-Infinity*0.0";
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
    public static void TestCaseDiff6002() {
        //Test Case 6002
        UsageCalculus.TestCase = 6002;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0/Infinity/x^8 + 1.0/Infinity/x^5 + 1.0/Infinity/x^4 - 1.0/Infinity/x - 25/Infinity";
        UsageCalculus.TestCaseName = "Simple: Coefficients:Infinity";
        UsageCalculus.TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/Infinity/x^8.0+1.0/Infinity/x^5.0+1.0/Infinity/x^4.0-1.0/Infinity/x-25.0/Infinity";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/Infinity*-8.0/x^9.0+1.0/Infinity*-5.0/x^6.0+1.0/Infinity*-4.0/x^5.0+1.0/Infinity/x^2.0-25.0/Infinity";
        UsageCalculus.EqnSolArrayMap2[1] = "-8.0/Infinity/x^9.0-5.0/Infinity/x^6.0-4.0/Infinity/x^5.0+1.0/Infinity/x^2.0-25.0/Infinity";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/Infinity/x^8.0+1.0/Infinity/x^5.0+1.0/Infinity/x^4.0-1.0/Infinity/x-25.0/Infinity";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/Infinity/-7.0/x^7.0+1.0/Infinity/-4.0/x^4.0+1.0/Infinity/-3.0/x^3.0-1.0/Infinity*ln(x)-25.0/Infinity*x";
        UsageCalculus.EqnSolArrayMap4[1]="-7.0/Infinity/x^7.0-4.0/Infinity/x^4.0-3.0/Infinity/x^3.0-1.0/Infinity*ln(x)-25.0/Infinity*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-8.0/Infinity/x^9.0-5.0/Infinity/x^6.0-4.0/Infinity/x^5.0+1.0/Infinity/x^2.0-25.0/Infinity";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-8.0/Infinity*-9.0/x^10.0-5.0/Infinity*-6.0/x^7.0-4.0/Infinity*-5.0/x^6.0+1.0/Infinity*-2.0/x^3.0-25.0/Infinity";
        UsageCalculus.EqnSolArrayMap2[2] = "72.0/Infinity/x^10.0+30.0/Infinity/x^7.0+20.0/Infinity/x^6.0-2.0/Infinity/x^3.0-25.0/Infinity";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "72.0/Infinity/x^10.0+30.0/Infinity/x^7.0+20.0/Infinity/x^6.0-2.0/Infinity/x^3.0-25.0/Infinity";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "72.0/Infinity*-10.0/x^11.0+30.0/Infinity*-7.0/x^8.0+20.0/Infinity*-6.0/x^7.0-2.0/Infinity*-3.0/x^4.0-25.0/Infinity";
        UsageCalculus.EqnSolArrayMap2[3] = "-720.0/Infinity/x^11.0-210.0/Infinity/x^8.0-120.0/Infinity/x^7.0+6.0/Infinity/x^4.0-25.0/Infinity";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-720.0/Infinity/x^11.0-210.0/Infinity/x^8.0-120.0/Infinity/x^7.0+6.0/Infinity/x^4.0-25.0/Infinity";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-720.0/Infinity*-11.0/x^12.0-210.0/Infinity*-8.0/x^9.0-120.0/Infinity*-7.0/x^8.0+6.0/Infinity*-4.0/x^5.0-25.0/Infinity";
        UsageCalculus.EqnSolArrayMap2[4] = "7920.0/Infinity/x^12.0+1680.0/Infinity/x^9.0+840.0/Infinity/x^8.0-24.0/Infinity/x^5.0-25.0/Infinity";
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
    public static void TestCaseDiff6003() {
        //Test Case 6003
        UsageCalculus.TestCase = 6003;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*-Infinity/x^8 + 1.0*-Infinity/x^5 + 1.0*-Infinity/x^4 - 1.0*-Infinity/x - 25*-Infinity";
        UsageCalculus.TestCaseName = "Simple: Coefficients:-Infinity";
        UsageCalculus.TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-Infinity/x^8.0-Infinity/x^5.0-Infinity/x^4.0+Infinity/x+Infinity*25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-Infinity*-8.0/x^9.0-Infinity*-5.0/x^6.0-Infinity*-4.0/x^5.0-Infinity/x^2.0+Infinity*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "Infinity*8.0/x^9.0+Infinity*5.0/x^6.0+Infinity*4.0/x^5.0-Infinity/x^2.0+Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="-Infinity/x^8.0-Infinity/x^5.0-Infinity/x^4.0+Infinity/x+Infinity*25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-Infinity/-7.0/x^7.0-Infinity/-4.0/x^4.0-Infinity/-3.0/x^3.0+Infinity*ln(x)+Infinity*25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="Infinity/7.0/x^7.0+Infinity/4.0/x^4.0+Infinity/3.0/x^3.0+Infinity*ln(x)+Infinity*25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "Infinity*8.0/x^9.0+Infinity*5.0/x^6.0+Infinity*4.0/x^5.0-Infinity/x^2.0+Infinity*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "Infinity*8.0*-9.0/x^10.0+Infinity*5.0*-6.0/x^7.0+Infinity*4.0*-5.0/x^6.0-Infinity*-2.0/x^3.0+Infinity*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-Infinity*72.0/x^10.0-Infinity*30.0/x^7.0-Infinity*20.0/x^6.0+Infinity*2.0/x^3.0+Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-Infinity*72.0/x^10.0-Infinity*30.0/x^7.0-Infinity*20.0/x^6.0+Infinity*2.0/x^3.0+Infinity*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-Infinity*72.0*-10.0/x^11.0-Infinity*30.0*-7.0/x^8.0-Infinity*20.0*-6.0/x^7.0+Infinity*2.0*-3.0/x^4.0+Infinity*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "Infinity*720.0/x^11.0+Infinity*210.0/x^8.0+Infinity*120.0/x^7.0-Infinity*6.0/x^4.0+Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "Infinity*720.0/x^11.0+Infinity*210.0/x^8.0+Infinity*120.0/x^7.0-Infinity*6.0/x^4.0+Infinity*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "Infinity*720.0*-11.0/x^12.0+Infinity*210.0*-8.0/x^9.0+Infinity*120.0*-7.0/x^8.0-Infinity*6.0*-4.0/x^5.0+Infinity*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-Infinity*7920.0/x^12.0-Infinity*1680.0/x^9.0-Infinity*840.0/x^8.0+Infinity*24.0/x^5.0+Infinity*0.0";
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
    public static void TestCaseDiff6004() {
        //Test Case 6004
        UsageCalculus.TestCase = 6004;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0/-Infinity/x^8 + 1.0/-Infinity/x^5 + 1.0/-Infinity/x^4 - 1.0/-Infinity/x - 25/-Infinity";
        UsageCalculus.TestCaseName = "Simple: Coefficients:-Infinity";
        UsageCalculus.TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-1.0/Infinity/x^8.0-1.0/Infinity/x^5.0-1.0/Infinity/x^4.0+1.0/Infinity/x+25.0/Infinity";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-1.0/Infinity*-8.0/x^9.0-1.0/Infinity*-5.0/x^6.0-1.0/Infinity*-4.0/x^5.0-1.0/Infinity/x^2.0+25.0/Infinity";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0/Infinity/x^9.0+5.0/Infinity/x^6.0+4.0/Infinity/x^5.0-1.0/Infinity/x^2.0+25.0/Infinity";
        UsageCalculus.EqnSolArrayMap3[1]="-1.0/Infinity/x^8.0-1.0/Infinity/x^5.0-1.0/Infinity/x^4.0+1.0/Infinity/x+25.0/Infinity";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-1.0/Infinity/-7.0/x^7.0-1.0/Infinity/-4.0/x^4.0-1.0/Infinity/-3.0/x^3.0+1.0/Infinity*ln(x)+25.0/Infinity*x";
        UsageCalculus.EqnSolArrayMap4[1]="7.0/Infinity/x^7.0+4.0/Infinity/x^4.0+3.0/Infinity/x^3.0+1.0/Infinity*ln(x)+25.0/Infinity*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0/Infinity/x^9.0+5.0/Infinity/x^6.0+4.0/Infinity/x^5.0-1.0/Infinity/x^2.0+25.0/Infinity";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0/Infinity*-9.0/x^10.0+5.0/Infinity*-6.0/x^7.0+4.0/Infinity*-5.0/x^6.0-1.0/Infinity*-2.0/x^3.0+25.0/Infinity";
        UsageCalculus.EqnSolArrayMap2[2] = "-72.0/Infinity/x^10.0-30.0/Infinity/x^7.0-20.0/Infinity/x^6.0+2.0/Infinity/x^3.0+25.0/Infinity";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-72.0/Infinity/x^10.0-30.0/Infinity/x^7.0-20.0/Infinity/x^6.0+2.0/Infinity/x^3.0+25.0/Infinity";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-72.0/Infinity*-10.0/x^11.0-30.0/Infinity*-7.0/x^8.0-20.0/Infinity*-6.0/x^7.0+2.0/Infinity*-3.0/x^4.0+25.0/Infinity";
        UsageCalculus.EqnSolArrayMap2[3] = "720.0/Infinity/x^11.0+210.0/Infinity/x^8.0+120.0/Infinity/x^7.0-6.0/Infinity/x^4.0+25.0/Infinity";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "720.0/Infinity/x^11.0+210.0/Infinity/x^8.0+120.0/Infinity/x^7.0-6.0/Infinity/x^4.0+25.0/Infinity";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "720.0/Infinity*-11.0/x^12.0+210.0/Infinity*-8.0/x^9.0+120.0/Infinity*-7.0/x^8.0-6.0/Infinity*-4.0/x^5.0+25.0/Infinity";
        UsageCalculus.EqnSolArrayMap2[4] = "-7920.0/Infinity/x^12.0-1680.0/Infinity/x^9.0-840.0/Infinity/x^8.0+24.0/Infinity/x^5.0+25.0/Infinity";
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
    public static void TestCaseDiff6005() {
        //Test Case 6005
        UsageCalculus.TestCase = 6005;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*NaN/x^8 + 1.0*NaN/x^5 + 1.0*NaN/x^4 - 1.0*NaN/x - 25*NaN";
        UsageCalculus.TestCaseName = "Simple: Coefficients:NaN";
        UsageCalculus.TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "NaN/x^8.0+NaN/x^5.0+NaN/x^4.0-NaN/x-NaN*25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "NaN*-8.0/x^9.0+NaN*-5.0/x^6.0+NaN*-4.0/x^5.0+NaN/x^2.0-NaN*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-NaN*8.0/x^9.0-NaN*5.0/x^6.0-NaN*4.0/x^5.0+NaN/x^2.0-NaN*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="NaN/x^8.0+NaN/x^5.0+NaN/x^4.0-NaN/x-NaN*25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="NaN/-7.0/x^7.0+NaN/-4.0/x^4.0+NaN/-3.0/x^3.0-NaN*ln(x)-NaN*25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="-NaN/7.0/x^7.0-NaN/4.0/x^4.0-NaN/3.0/x^3.0-NaN*ln(x)-NaN*25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-NaN*8.0/x^9.0-NaN*5.0/x^6.0-NaN*4.0/x^5.0+NaN/x^2.0-NaN*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-NaN*8.0*-9.0/x^10.0-NaN*5.0*-6.0/x^7.0-NaN*4.0*-5.0/x^6.0+NaN*-2.0/x^3.0-NaN*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "NaN*72.0/x^10.0+NaN*30.0/x^7.0+NaN*20.0/x^6.0-NaN*2.0/x^3.0-NaN*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "NaN*72.0/x^10.0+NaN*30.0/x^7.0+NaN*20.0/x^6.0-NaN*2.0/x^3.0-NaN*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "NaN*72.0*-10.0/x^11.0+NaN*30.0*-7.0/x^8.0+NaN*20.0*-6.0/x^7.0-NaN*2.0*-3.0/x^4.0-NaN*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-NaN*720.0/x^11.0-NaN*210.0/x^8.0-NaN*120.0/x^7.0+NaN*6.0/x^4.0-NaN*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-NaN*720.0/x^11.0-NaN*210.0/x^8.0-NaN*120.0/x^7.0+NaN*6.0/x^4.0-NaN*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-NaN*720.0*-11.0/x^12.0-NaN*210.0*-8.0/x^9.0-NaN*120.0*-7.0/x^8.0+NaN*6.0*-4.0/x^5.0-NaN*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "NaN*7920.0/x^12.0+NaN*1680.0/x^9.0+NaN*840.0/x^8.0-NaN*24.0/x^5.0-NaN*0.0";
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
    public static void TestCaseDiff6006() {
        //Test Case 6006
        UsageCalculus.TestCase = 6006;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0/NaN/x^8 + 1.0/NaN/x^5 + 1.0/NaN/x^4 - 1.0/NaN/x - 25/NaN";
        UsageCalculus.TestCaseName = "Simple: Coefficients:NaN";
        UsageCalculus.TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/NaN/x^8.0+1.0/NaN/x^5.0+1.0/NaN/x^4.0-1.0/NaN/x-25.0/NaN";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/NaN*-8.0/x^9.0+1.0/NaN*-5.0/x^6.0+1.0/NaN*-4.0/x^5.0+1.0/NaN/x^2.0-25.0/NaN";
        UsageCalculus.EqnSolArrayMap2[1] = "-8.0/NaN/x^9.0-5.0/NaN/x^6.0-4.0/NaN/x^5.0+1.0/NaN/x^2.0-25.0/NaN";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/NaN/x^8.0+1.0/NaN/x^5.0+1.0/NaN/x^4.0-1.0/NaN/x-25.0/NaN";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/NaN/-7.0/x^7.0+1.0/NaN/-4.0/x^4.0+1.0/NaN/-3.0/x^3.0-1.0/NaN*ln(x)-25.0/NaN*x";
        UsageCalculus.EqnSolArrayMap4[1]="-7.0/NaN/x^7.0-4.0/NaN/x^4.0-3.0/NaN/x^3.0-1.0/NaN*ln(x)-25.0/NaN*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-8.0/NaN/x^9.0-5.0/NaN/x^6.0-4.0/NaN/x^5.0+1.0/NaN/x^2.0-25.0/NaN";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-8.0/NaN*-9.0/x^10.0-5.0/NaN*-6.0/x^7.0-4.0/NaN*-5.0/x^6.0+1.0/NaN*-2.0/x^3.0-25.0/NaN";
        UsageCalculus.EqnSolArrayMap2[2] = "72.0/NaN/x^10.0+30.0/NaN/x^7.0+20.0/NaN/x^6.0-2.0/NaN/x^3.0-25.0/NaN";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/NaN/x^8.0+1.0/NaN/x^5.0+1.0/NaN/x^4.0-1.0/NaN/x-1.0/NaN*25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/NaN/-7.0/x^7.0+1.0/NaN/-4.0/x^4.0+1.0/NaN/-3.0/x^3.0-1.0/NaN*ln(x)-1.0/NaN*25.0";
        UsageCalculus.EqnSolArrayMap4[2]="-1.0/NaN/7.0/x^7.0-1.0/NaN/4.0/x^4.0-1.0/NaN/3.0/x^3.0-1.0/NaN*ln(x)-1.0/NaN*25.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "72.0/NaN/x^10.0+30.0/NaN/x^7.0+20.0/NaN/x^6.0-2.0/NaN/x^3.0-25.0/NaN";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "72.0/NaN*-10.0/x^11.0+30.0/NaN*-7.0/x^8.0+20.0/NaN*-6.0/x^7.0-2.0/NaN*-3.0/x^4.0-25.0/NaN";
        UsageCalculus.EqnSolArrayMap2[3] = "-720.0/NaN/x^11.0-210.0/NaN/x^8.0-120.0/NaN/x^7.0+6.0/NaN/x^4.0-25.0/NaN";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-720.0/NaN/x^11.0-210.0/NaN/x^8.0-120.0/NaN/x^7.0+6.0/NaN/x^4.0-25.0/NaN";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-720.0/NaN*-11.0/x^12.0-210.0/NaN*-8.0/x^9.0-120.0/NaN*-7.0/x^8.0+6.0/NaN*-4.0/x^5.0-25.0/NaN";
        UsageCalculus.EqnSolArrayMap2[4] = "7920.0/NaN/x^12.0+1680.0/NaN/x^9.0+840.0/NaN/x^8.0-24.0/NaN/x^5.0-25.0/NaN";
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
    public static void TestCaseDiff6007() {
        //Test Case 6007
        UsageCalculus.TestCase = 6007;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*-NaN/x^8 + 1.0*-NaN/x^5 + 1.0*-NaN/x^4 - 1.0*-NaN/x - 25*-NaN";
        UsageCalculus.TestCaseName = "Simple: Coefficients:-NaN";
        UsageCalculus.TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-NaN/x^8.0-NaN/x^5.0-NaN/x^4.0+NaN/x+NaN*25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-NaN*-8.0/x^9.0-NaN*-5.0/x^6.0-NaN*-4.0/x^5.0-NaN/x^2.0+NaN*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "NaN*8.0/x^9.0+NaN*5.0/x^6.0+NaN*4.0/x^5.0-NaN/x^2.0+NaN*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="-NaN/x^8.0-NaN/x^5.0-NaN/x^4.0+NaN/x+NaN*25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-NaN/-7.0/x^7.0-NaN/-4.0/x^4.0-NaN/-3.0/x^3.0+NaN*ln(x)+NaN*25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="NaN/7.0/x^7.0+NaN/4.0/x^4.0+NaN/3.0/x^3.0+NaN*ln(x)+NaN*25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "NaN*8.0/x^9.0+NaN*5.0/x^6.0+NaN*4.0/x^5.0-NaN/x^2.0+NaN*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "NaN*8.0*-9.0/x^10.0+NaN*5.0*-6.0/x^7.0+NaN*4.0*-5.0/x^6.0-NaN*-2.0/x^3.0+NaN*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-NaN*72.0/x^10.0-NaN*30.0/x^7.0-NaN*20.0/x^6.0+NaN*2.0/x^3.0+NaN*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-NaN*72.0/x^10.0-NaN*30.0/x^7.0-NaN*20.0/x^6.0+NaN*2.0/x^3.0+NaN*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-NaN*72.0*-10.0/x^11.0-NaN*30.0*-7.0/x^8.0-NaN*20.0*-6.0/x^7.0+NaN*2.0*-3.0/x^4.0+NaN*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "NaN*720.0/x^11.0+NaN*210.0/x^8.0+NaN*120.0/x^7.0-NaN*6.0/x^4.0+NaN*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "NaN*720.0/x^11.0+NaN*210.0/x^8.0+NaN*120.0/x^7.0-NaN*6.0/x^4.0+NaN*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "NaN*720.0*-11.0/x^12.0+NaN*210.0*-8.0/x^9.0+NaN*120.0*-7.0/x^8.0-NaN*6.0*-4.0/x^5.0+NaN*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-NaN*7920.0/x^12.0-NaN*1680.0/x^9.0-NaN*840.0/x^8.0+NaN*24.0/x^5.0+NaN*0.0";
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
    public static void TestCaseDiff6008() {
        //Test Case 6008
        UsageCalculus.TestCase = 6008;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0/-NaN/x^8 + 1.0/-NaN/x^5 + 1.0/-NaN/x^4 - 1.0/-NaN/x - 25/-NaN";
        UsageCalculus.TestCaseName = "Simple: Coefficients:-NaN";
        UsageCalculus.TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-1.0/NaN/x^8.0-1.0/NaN/x^5.0-1.0/NaN/x^4.0+1.0/NaN/x+25.0/NaN";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-1.0/NaN*-8.0/x^9.0-1.0/NaN*-5.0/x^6.0-1.0/NaN*-4.0/x^5.0-1.0/NaN/x^2.0+25.0/NaN";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0/NaN/x^9.0+5.0/NaN/x^6.0+4.0/NaN/x^5.0-1.0/NaN/x^2.0+25.0/NaN";
        UsageCalculus.EqnSolArrayMap3[1]="-1.0/NaN/x^8.0-1.0/NaN/x^5.0-1.0/NaN/x^4.0+1.0/NaN/x+25.0/NaN";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-1.0/NaN/-7.0/x^7.0-1.0/NaN/-4.0/x^4.0-1.0/NaN/-3.0/x^3.0+1.0/NaN*ln(x)+25.0/NaN*x";
        UsageCalculus.EqnSolArrayMap4[1]="7.0/NaN/x^7.0+4.0/NaN/x^4.0+3.0/NaN/x^3.0+1.0/NaN*ln(x)+25.0/NaN*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0/NaN/x^9.0+5.0/NaN/x^6.0+4.0/NaN/x^5.0-1.0/NaN/x^2.0+25.0/NaN";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0/NaN*-9.0/x^10.0+5.0/NaN*-6.0/x^7.0+4.0/NaN*-5.0/x^6.0-1.0/NaN*-2.0/x^3.0+25.0/NaN";
        UsageCalculus.EqnSolArrayMap2[2] = "-72.0/NaN/x^10.0-30.0/NaN/x^7.0-20.0/NaN/x^6.0+2.0/NaN/x^3.0+25.0/NaN";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-72.0/NaN/x^10.0-30.0/NaN/x^7.0-20.0/NaN/x^6.0+2.0/NaN/x^3.0+25.0/NaN";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-72.0/NaN*-10.0/x^11.0-30.0/NaN*-7.0/x^8.0-20.0/NaN*-6.0/x^7.0+2.0/NaN*-3.0/x^4.0+25.0/NaN";
        UsageCalculus.EqnSolArrayMap2[3] = "720.0/NaN/x^11.0+210.0/NaN/x^8.0+120.0/NaN/x^7.0-6.0/NaN/x^4.0+25.0/NaN";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "720.0/NaN/x^11.0+210.0/NaN/x^8.0+120.0/NaN/x^7.0-6.0/NaN/x^4.0+25.0/NaN";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "720.0/NaN*-11.0/x^12.0+210.0/NaN*-8.0/x^9.0+120.0/NaN*-7.0/x^8.0-6.0/NaN*-4.0/x^5.0+25.0/NaN";
        UsageCalculus.EqnSolArrayMap2[4] = "-7920.0/NaN/x^12.0-1680.0/NaN/x^9.0-840.0/NaN/x^8.0+24.0/NaN/x^5.0+25.0/NaN";
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
    //1/25 Test Cases
    public static void TestCaseDiff6009() {
        //Test Case 6009
        UsageCalculus.TestCase = 6009;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*1/25/x^8 + 1.0*1/25/x^5 + 1.0*1/25/x^4 - 1.0*1/25/x - 25*1/25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:1/25";
        UsageCalculus.TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/25.0/x^8.0+1.0/25.0/x^5.0+1.0/25.0/x^4.0-1.0/25.0/x-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/25.0*-8.0/x^9.0+1.0/25.0*-5.0/x^6.0+1.0/25.0*-4.0/x^5.0+1.0/25.0/x^2.0-1.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-1.0/3.125/x^9.0-1.0/5.0/x^6.0-1.0/6.25/x^5.0+1.0/25.0/x^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/25.0/x^8.0+1.0/25.0/x^5.0+1.0/25.0/x^4.0-1.0/25.0/x-1.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/25.0/-7.0/x^7.0+1.0/25.0/-4.0/x^4.0+1.0/25.0/-3.0/x^3.0-1.0/25.0*ln(x)-1.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="-1.0/175.0/x^7.0-1.0/100.0/x^4.0-1.0/75.0/x^3.0-1.0/25.0*ln(x)-x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-1.0/3.125/x^9.0-1.0/5.0/x^6.0-1.0/6.25/x^5.0+1.0/25.0/x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-1.0/3.125*-9.0/x^10.0-1.0/5.0*-6.0/x^7.0-1.0/6.25*-5.0/x^6.0+1.0/25.0*-2.0/x^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "2.88/x^10.0+1.2/x^7.0+1.0/1.25/x^6.0-1.0/12.5/x^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "2.88/x^10.0+1.2/x^7.0+1.0/1.25/x^6.0-1.0/12.5/x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "2.88*-10.0/x^11.0+1.2*-7.0/x^8.0+1.0/1.25*-6.0/x^7.0-1.0/12.5*-3.0/x^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-28.799999999999997/x^11.0-8.4/x^8.0-4.8/x^7.0+1.0/4.166666666666667/x^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-28.799999999999997/x^11.0-8.4/x^8.0-4.8/x^7.0+1.0/4.166666666666667/x^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-28.799999999999997*-11.0/x^12.0-8.4*-8.0/x^9.0-4.8*-7.0/x^8.0+1.0/4.166666666666667*-4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "316.79999999999995/x^12.0+67.2/x^9.0+33.6/x^8.0-1.0/1.0416666666666667/x^5.0";
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
    public static void TestCaseDiff6010() {
        //Test Case 6010
        UsageCalculus.TestCase = 6010;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0/1/25/x^8 + 1.0/1/25/x^5 + 1.0/1/25/x^4 - 1.0/1/25/x - 25/1/25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:1/25";
        UsageCalculus.TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/25.0/x^8.0+1.0/25.0/x^5.0+1.0/25.0/x^4.0-1.0/25.0/x-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/25.0*-8.0/x^9.0+1.0/25.0*-5.0/x^6.0+1.0/25.0*-4.0/x^5.0+1.0/25.0/x^2.0-1.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-1.0/3.125/x^9.0-1.0/5.0/x^6.0-1.0/6.25/x^5.0+1.0/25.0/x^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/25.0/x^8.0+1.0/25.0/x^5.0+1.0/25.0/x^4.0-1.0/25.0/x-1.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/25.0/-7.0/x^7.0+1.0/25.0/-4.0/x^4.0+1.0/25.0/-3.0/x^3.0-1.0/25.0*ln(x)-1.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="-1.0/175.0/x^7.0-1.0/100.0/x^4.0-1.0/75.0/x^3.0-1.0/25.0*ln(x)-x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-1.0/3.125/x^9.0-1.0/5.0/x^6.0-1.0/6.25/x^5.0+1.0/25.0/x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-1.0/3.125*-9.0/x^10.0-1.0/5.0*-6.0/x^7.0-1.0/6.25*-5.0/x^6.0+1.0/25.0*-2.0/x^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "2.88/x^10.0+1.2/x^7.0+1.0/1.25/x^6.0-1.0/12.5/x^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "2.88/x^10.0+1.2/x^7.0+1.0/1.25/x^6.0-1.0/12.5/x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "2.88*-10.0/x^11.0+1.2*-7.0/x^8.0+1.0/1.25*-6.0/x^7.0-1.0/12.5*-3.0/x^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-28.799999999999997/x^11.0-8.4/x^8.0-4.8/x^7.0+1.0/4.166666666666667/x^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-28.799999999999997/x^11.0-8.4/x^8.0-4.8/x^7.0+1.0/4.166666666666667/x^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-28.799999999999997*-11.0/x^12.0-8.4*-8.0/x^9.0-4.8*-7.0/x^8.0+1.0/4.166666666666667*-4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "316.79999999999995/x^12.0+67.2/x^9.0+33.6/x^8.0-1.0/1.0416666666666667/x^5.0";
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
    public static void TestCaseDiff6011() {
        //Test Case 6011
        UsageCalculus.TestCase = 6011;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*-1/25/x^8 + 1.0*-1/25/x^5 + 1.0*-1/25/x^4 - 1.0*-1/25/x - 25*-1/25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:-1/25";
        UsageCalculus.TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-1.0/25.0/x^8.0-1.0/25.0/x^5.0-1.0/25.0/x^4.0+1.0/25.0/x+1.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-1.0/25.0*-8.0/x^9.0-1.0/25.0*-5.0/x^6.0-1.0/25.0*-4.0/x^5.0-1.0/25.0/x^2.0+1.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0/3.125/x^9.0+1.0/5.0/x^6.0+1.0/6.25/x^5.0-1.0/25.0/x^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="-1.0/25.0/x^8.0-1.0/25.0/x^5.0-1.0/25.0/x^4.0+1.0/25.0/x+1.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-1.0/25.0/-7.0/x^7.0-1.0/25.0/-4.0/x^4.0-1.0/25.0/-3.0/x^3.0+1.0/25.0*ln(x)+1.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/175.0/x^7.0+1.0/100.0/x^4.0+1.0/75.0/x^3.0+1.0/25.0*ln(x)+x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0/3.125/x^9.0+1.0/5.0/x^6.0+1.0/6.25/x^5.0-1.0/25.0/x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "1.0/3.125*-9.0/x^10.0+1.0/5.0*-6.0/x^7.0+1.0/6.25*-5.0/x^6.0-1.0/25.0*-2.0/x^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-2.88/x^10.0-1.2/x^7.0-1.0/1.25/x^6.0+1.0/12.5/x^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-2.88/x^10.0-1.2/x^7.0-1.0/1.25/x^6.0+1.0/12.5/x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-2.88*-10.0/x^11.0-1.2*-7.0/x^8.0-1.0/1.25*-6.0/x^7.0+1.0/12.5*-3.0/x^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "28.799999999999997/x^11.0+8.4/x^8.0+4.8/x^7.0-1.0/4.166666666666667/x^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "28.799999999999997/x^11.0+8.4/x^8.0+4.8/x^7.0-1.0/4.166666666666667/x^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "28.799999999999997*-11.0/x^12.0+8.4*-8.0/x^9.0+4.8*-7.0/x^8.0-1.0/4.166666666666667*-4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-316.79999999999995/x^12.0-67.2/x^9.0-33.6/x^8.0+1.0/1.0416666666666667/x^5.0";
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
    public static void TestCaseDiff6012() {
        //Test Case 6012
        UsageCalculus.TestCase = 6012;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0/-1/25/x^8 + 1.0/-1/25/x^5 + 1.0/-1/25/x^4 - 1.0/-1/25/x - 25/-1/25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:-1/25";
        UsageCalculus.TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-1.0/25.0/x^8.0-1.0/25.0/x^5.0-1.0/25.0/x^4.0+1.0/25.0/x+1.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-1.0/25.0*-8.0/x^9.0-1.0/25.0*-5.0/x^6.0-1.0/25.0*-4.0/x^5.0-1.0/25.0/x^2.0+1.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0/3.125/x^9.0+1.0/5.0/x^6.0+1.0/6.25/x^5.0-1.0/25.0/x^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="-1.0/25.0/x^8.0-1.0/25.0/x^5.0-1.0/25.0/x^4.0+1.0/25.0/x+1.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-1.0/25.0/-7.0/x^7.0-1.0/25.0/-4.0/x^4.0-1.0/25.0/-3.0/x^3.0+1.0/25.0*ln(x)+1.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/175.0/x^7.0+1.0/100.0/x^4.0+1.0/75.0/x^3.0+1.0/25.0*ln(x)+x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0/3.125/x^9.0+1.0/5.0/x^6.0+1.0/6.25/x^5.0-1.0/25.0/x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "1.0/3.125*-9.0/x^10.0+1.0/5.0*-6.0/x^7.0+1.0/6.25*-5.0/x^6.0-1.0/25.0*-2.0/x^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-2.88/x^10.0-1.2/x^7.0-1.0/1.25/x^6.0+1.0/12.5/x^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-2.88/x^10.0-1.2/x^7.0-1.0/1.25/x^6.0+1.0/12.5/x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-2.88*-10.0/x^11.0-1.2*-7.0/x^8.0-1.0/1.25*-6.0/x^7.0+1.0/12.5*-3.0/x^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "28.799999999999997/x^11.0+8.4/x^8.0+4.8/x^7.0-1.0/4.166666666666667/x^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "28.799999999999997/x^11.0+8.4/x^8.0+4.8/x^7.0-1.0/4.166666666666667/x^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "28.799999999999997*-11.0/x^12.0+8.4*-8.0/x^9.0+4.8*-7.0/x^8.0-1.0/4.166666666666667*-4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-316.79999999999995/x^12.0-67.2/x^9.0-33.6/x^8.0+1.0/1.0416666666666667/x^5.0";
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
    //1/0.0
    public static void TestCaseDiff6013() {
        //Test Case 6013
        UsageCalculus.TestCase = 6013;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*1/0.0/x^8 + 1.0*1/0.0/x^5 + 1.0*1/0.0/x^4 - 1.0*1/0.0/x - 25*1/0.0";
        UsageCalculus.TestCaseName = "Simple: Coefficients:1/0.0";
        UsageCalculus.TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "Infinity/x^8.0+Infinity/x^5.0+Infinity/x^4.0-Infinity/x-Infinity";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "Infinity*-8.0/x^9.0+Infinity*-5.0/x^6.0+Infinity*-4.0/x^5.0+Infinity/x^2.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-Infinity*8.0/x^9.0-Infinity*5.0/x^6.0-Infinity*4.0/x^5.0+Infinity/x^2.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="Infinity/x^8.0+Infinity/x^5.0+Infinity/x^4.0-Infinity/x-Infinity";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="Infinity/-7.0/x^7.0+Infinity/-4.0/x^4.0+Infinity/-3.0/x^3.0-Infinity*ln(x)-Infinity*x";
        UsageCalculus.EqnSolArrayMap4[1]="-Infinity/7.0/x^7.0-Infinity/4.0/x^4.0-Infinity/3.0/x^3.0-Infinity*ln(x)-Infinity*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-Infinity*8.0/x^9.0-Infinity*5.0/x^6.0-Infinity*4.0/x^5.0+Infinity/x^2.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-Infinity*8.0*-9.0/x^10.0-Infinity*5.0*-6.0/x^7.0-Infinity*4.0*-5.0/x^6.0+Infinity*-2.0/x^3.0-Infinity*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "Infinity*72.0/x^10.0+Infinity*30.0/x^7.0+Infinity*20.0/x^6.0-Infinity*2.0/x^3.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "Infinity*72.0/x^10.0+Infinity*30.0/x^7.0+Infinity*20.0/x^6.0-Infinity*2.0/x^3.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "Infinity*72.0*-10.0/x^11.0+Infinity*30.0*-7.0/x^8.0+Infinity*20.0*-6.0/x^7.0-Infinity*2.0*-3.0/x^4.0-Infinity*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-Infinity*720.0/x^11.0-Infinity*210.0/x^8.0-Infinity*120.0/x^7.0+Infinity*6.0/x^4.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-Infinity*720.0/x^11.0-Infinity*209.99999999999997/x^8.0-Infinity*120.0/x^7.0+Infinity*6.0/x^4.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-Infinity*720.0*-11.0/x^12.0-Infinity*209.99999999999997*-8.0/x^9.0-Infinity*120.0*-7.0/x^8.0+Infinity*6.0*-4.0/x^5.0-Infinity*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "Infinity*7920.0/x^12.0+Infinity*1679.9999999999998/x^9.0+Infinity*840.0/x^8.0-Infinity*24.0/x^5.0-Infinity*0.0";
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
    public static void TestCaseDiff6014() {
        //Test Case 6014
        UsageCalculus.TestCase = 6014;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0/1/0.0/x^8 + 1.0/1/0.0/x^5 + 1.0/1/0.0/x^4 - 1.0/1/0.0/x - 25/1/0.0";
        UsageCalculus.TestCaseName = "Simple: Coefficients:1/0.0";
        UsageCalculus.TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "Infinity/x^8.0+Infinity/x^5.0+Infinity/x^4.0-Infinity/x-Infinity";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "Infinity*-8.0/x^9.0+Infinity*-5.0/x^6.0+Infinity*-4.0/x^5.0+Infinity/x^2.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-Infinity*8.0/x^9.0-Infinity*5.0/x^6.0-Infinity*4.0/x^5.0+Infinity/x^2.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="Infinity/x^8.0+Infinity/x^5.0+Infinity/x^4.0-Infinity/x-Infinity";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="Infinity/-7.0/x^7.0+Infinity/-4.0/x^4.0+Infinity/-3.0/x^3.0-Infinity*ln(x)-Infinity*x";
        UsageCalculus.EqnSolArrayMap4[1]="-Infinity/7.0/x^7.0-Infinity/4.0/x^4.0-Infinity/3.0/x^3.0-Infinity*ln(x)-Infinity*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-Infinity*8.0/x^9.0-Infinity*5.0/x^6.0-Infinity*4.0/x^5.0+Infinity/x^2.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-Infinity*8.0*-9.0/x^10.0-Infinity*5.0*-6.0/x^7.0-Infinity*4.0*-5.0/x^6.0+Infinity*-2.0/x^3.0-Infinity*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "Infinity*72.0/x^10.0+Infinity*30.0/x^7.0+Infinity*20.0/x^6.0-Infinity*2.0/x^3.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "Infinity*72.0/x^10.0+Infinity*30.0/x^7.0+Infinity*20.0/x^6.0-Infinity*2.0/x^3.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "Infinity*72.0*-10.0/x^11.0+Infinity*30.0*-7.0/x^8.0+Infinity*20.0*-6.0/x^7.0-Infinity*2.0*-3.0/x^4.0-Infinity*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-Infinity*720.0/x^11.0-Infinity*210.0/x^8.0-Infinity*120.0/x^7.0+Infinity*6.0/x^4.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-Infinity*720.0/x^11.0-Infinity*209.99999999999997/x^8.0-Infinity*120.0/x^7.0+Infinity*6.0/x^4.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-Infinity*720.0*-11.0/x^12.0-Infinity*209.99999999999997*-8.0/x^9.0-Infinity*120.0*-7.0/x^8.0+Infinity*6.0*-4.0/x^5.0-Infinity*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "Infinity*7920.0/x^12.0+Infinity*1679.9999999999998/x^9.0+Infinity*840.0/x^8.0-Infinity*24.0/x^5.0-Infinity*0.0";
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
    public static void TestCaseDiff6015() {
        //Test Case 6015
        UsageCalculus.TestCase = 6015;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*-1/0.0/x^8 + 1.0*-1/0.0/x^5 + 1.0*-1/0.0/x^4 - 1.0*-1/0.0/x - 25*-1/0.0";
        UsageCalculus.TestCaseName = "Simple: Coefficients:-1/0.0";
        UsageCalculus.TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-Infinity/x^8.0-Infinity/x^5.0-Infinity/x^4.0+Infinity/x+Infinity";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-Infinity*-8.0/x^9.0-Infinity*-5.0/x^6.0-Infinity*-4.0/x^5.0-Infinity/x^2.0+Infinity*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "Infinity*8.0/x^9.0+Infinity*5.0/x^6.0+Infinity*4.0/x^5.0-Infinity/x^2.0+Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="-Infinity/x^8.0-Infinity/x^5.0-Infinity/x^4.0+Infinity/x+Infinity";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-Infinity/-7.0/x^7.0-Infinity/-4.0/x^4.0-Infinity/-3.0/x^3.0+Infinity*ln(x)+Infinity*x";
        UsageCalculus.EqnSolArrayMap4[1]="Infinity/7.0/x^7.0+Infinity/4.0/x^4.0+Infinity/3.0/x^3.0+Infinity*ln(x)+Infinity*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "Infinity*8.0/x^9.0+Infinity*5.0/x^6.0+Infinity*4.0/x^5.0-Infinity/x^2.0+Infinity*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "Infinity*8.0*-9.0/x^10.0+Infinity*5.0*-6.0/x^7.0+Infinity*4.0*-5.0/x^6.0-Infinity*-2.0/x^3.0+Infinity*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-Infinity*72.0/x^10.0-Infinity*30.0/x^7.0-Infinity*20.0/x^6.0+Infinity*2.0/x^3.0+Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-Infinity*72.0/x^10.0-Infinity*30.0/x^7.0-Infinity*20.0/x^6.0+Infinity*2.0/x^3.0+Infinity*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-Infinity*72.0*-10.0/x^11.0-Infinity*30.0*-7.0/x^8.0-Infinity*20.0*-6.0/x^7.0+Infinity*2.0*-3.0/x^4.0+Infinity*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "Infinity*720.0/x^11.0+Infinity*210.0/x^8.0+Infinity*120.0/x^7.0-Infinity*6.0/x^4.0+Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "Infinity*720.0/x^11.0+Infinity*209.99999999999997/x^8.0+Infinity*120.0/x^7.0-Infinity*6.0/x^4.0+Infinity*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "Infinity*720.0*-11.0/x^12.0+Infinity*209.99999999999997*-8.0/x^9.0+Infinity*120.0*-7.0/x^8.0-Infinity*6.0*-4.0/x^5.0+Infinity*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-Infinity*7920.0/x^12.0-Infinity*1679.9999999999998/x^9.0-Infinity*840.0/x^8.0+Infinity*24.0/x^5.0+Infinity*0.0";
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
    public static void TestCaseDiff6016() {
        //Test Case 6016
        UsageCalculus.TestCase = 6016;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0/-1/0.0/x^8 + 1.0/-1/0.0/x^5 + 1.0/-1/0.0/x^4 - 1.0/-1/0.0/x - 25/-1/0.0";
        UsageCalculus.TestCaseName = "Simple: Coefficients:-1/0.0";
        UsageCalculus.TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-Infinity/x^8.0-Infinity/x^5.0-Infinity/x^4.0+Infinity/x+Infinity";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-Infinity*-8.0/x^9.0-Infinity*-5.0/x^6.0-Infinity*-4.0/x^5.0-Infinity/x^2.0+Infinity*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "Infinity*8.0/x^9.0+Infinity*5.0/x^6.0+Infinity*4.0/x^5.0-Infinity/x^2.0+Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="-Infinity/x^8.0-Infinity/x^5.0-Infinity/x^4.0+Infinity/x+Infinity";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-Infinity/-7.0/x^7.0-Infinity/-4.0/x^4.0-Infinity/-3.0/x^3.0+Infinity*ln(x)+Infinity*x";
        UsageCalculus.EqnSolArrayMap4[1]="Infinity/7.0/x^7.0+Infinity/4.0/x^4.0+Infinity/3.0/x^3.0+Infinity*ln(x)+Infinity*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "Infinity*8.0/x^9.0+Infinity*5.0/x^6.0+Infinity*4.0/x^5.0-Infinity/x^2.0+Infinity*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "Infinity*8.0*-9.0/x^10.0+Infinity*5.0*-6.0/x^7.0+Infinity*4.0*-5.0/x^6.0-Infinity*-2.0/x^3.0+Infinity*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-Infinity*72.0/x^10.0-Infinity*30.0/x^7.0-Infinity*20.0/x^6.0+Infinity*2.0/x^3.0+Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-Infinity*72.0/x^10.0-Infinity*30.0/x^7.0-Infinity*20.0/x^6.0+Infinity*2.0/x^3.0+Infinity*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-Infinity*72.0*-10.0/x^11.0-Infinity*30.0*-7.0/x^8.0-Infinity*20.0*-6.0/x^7.0+Infinity*2.0*-3.0/x^4.0+Infinity*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "Infinity*720.0/x^11.0+Infinity*210.0/x^8.0+Infinity*120.0/x^7.0-Infinity*6.0/x^4.0+Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "Infinity*720.0/x^11.0+Infinity*209.99999999999997/x^8.0+Infinity*120.0/x^7.0-Infinity*6.0/x^4.0+Infinity*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "Infinity*720.0*-11.0/x^12.0+Infinity*209.99999999999997*-8.0/x^9.0+Infinity*120.0*-7.0/x^8.0-Infinity*6.0*-4.0/x^5.0+Infinity*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-Infinity*7920.0/x^12.0-Infinity*1679.9999999999998/x^9.0-Infinity*840.0/x^8.0+Infinity*24.0/x^5.0+Infinity*0.0";
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
    //0/0.0
    public static void TestCaseDiff6017() {
        //Test Case 6017
        UsageCalculus.TestCase = 6017;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*0/0.0/x^8 + 1.0*0/0.0/x^5 + 1.0*0/0.0/x^4 - 1.0*0/0.0/x - 25*0/0.0";
        UsageCalculus.TestCaseName = "Simple: Coefficients:0/0.0";
        UsageCalculus.TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "NaN/x^8.0+NaN/x^5.0+NaN/x^4.0-NaN/x-NaN";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "NaN*-8.0/x^9.0+NaN*-5.0/x^6.0+NaN*-4.0/x^5.0+NaN/x^2.0-NaN*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-NaN*8.0/x^9.0-NaN*5.0/x^6.0-NaN*4.0/x^5.0+NaN/x^2.0-NaN*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="NaN/x^8.0+NaN/x^5.0+NaN/x^4.0-NaN/x-NaN";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="NaN/-7.0/x^7.0+NaN/-4.0/x^4.0+NaN/-3.0/x^3.0-NaN*ln(x)-NaN*x";
        UsageCalculus.EqnSolArrayMap4[1]="-NaN/7.0/x^7.0-NaN/4.0/x^4.0-NaN/3.0/x^3.0-NaN*ln(x)-NaN*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-NaN*8.0/x^9.0-NaN*5.0/x^6.0-NaN*4.0/x^5.0+NaN/x^2.0-NaN*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-NaN*8.0*-9.0/x^10.0-NaN*5.0*-6.0/x^7.0-NaN*4.0*-5.0/x^6.0+NaN*-2.0/x^3.0-NaN*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "NaN*72.0/x^10.0+NaN*30.0/x^7.0+NaN*20.0/x^6.0-NaN*2.0/x^3.0-NaN*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "NaN*72.0/x^10.0+NaN*30.0/x^7.0+NaN*20.0/x^6.0-NaN*2.0/x^3.0-NaN*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "NaN*72.0*-10.0/x^11.0+NaN*30.0*-7.0/x^8.0+NaN*20.0*-6.0/x^7.0-NaN*2.0*-3.0/x^4.0-NaN*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-NaN*720.0/x^11.0-NaN*210.0/x^8.0-NaN*120.0/x^7.0+NaN*6.0/x^4.0-NaN*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-NaN*720.0/x^11.0-NaN*209.99999999999997/x^8.0-NaN*120.0/x^7.0+NaN*6.0/x^4.0-NaN*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-NaN*720.0*-11.0/x^12.0-NaN*209.99999999999997*-8.0/x^9.0-NaN*120.0*-7.0/x^8.0+NaN*6.0*-4.0/x^5.0-NaN*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "NaN*7920.0/x^12.0+NaN*1679.9999999999998/x^9.0+NaN*840.0/x^8.0-NaN*24.0/x^5.0-NaN*0.0";
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
    public static void TestCaseDiff6018() {
        //Test Case 6018
        UsageCalculus.TestCase = 6018;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0/0/0.0/x^8 + 1.0/0/0.0/x^5 + 1.0/0/0.0/x^4 - 1.0/0/0.0/x - 25/0/0.0";
        UsageCalculus.TestCaseName = "Simple: Coefficients:0/0.0";
        UsageCalculus.TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "Infinity/x^8.0+Infinity/x^5.0+Infinity/x^4.0-Infinity/x-Infinity";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "Infinity*-8.0/x^9.0+Infinity*-5.0/x^6.0+Infinity*-4.0/x^5.0+Infinity/x^2.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-Infinity*8.0/x^9.0-Infinity*5.0/x^6.0-Infinity*4.0/x^5.0+Infinity/x^2.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="Infinity/x^8.0+Infinity/x^5.0+Infinity/x^4.0-Infinity/x-Infinity";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="Infinity/-7.0/x^7.0+Infinity/-4.0/x^4.0+Infinity/-3.0/x^3.0-Infinity*ln(x)-Infinity*x";
        UsageCalculus.EqnSolArrayMap4[1]="-Infinity/7.0/x^7.0-Infinity/4.0/x^4.0-Infinity/3.0/x^3.0-Infinity*ln(x)-Infinity*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-Infinity*8.0/x^9.0-Infinity*5.0/x^6.0-Infinity*4.0/x^5.0+Infinity/x^2.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-Infinity*8.0*-9.0/x^10.0-Infinity*5.0*-6.0/x^7.0-Infinity*4.0*-5.0/x^6.0+Infinity*-2.0/x^3.0-Infinity*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "Infinity*72.0/x^10.0+Infinity*30.0/x^7.0+Infinity*20.0/x^6.0-Infinity*2.0/x^3.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "Infinity*72.0/x^10.0+Infinity*30.0/x^7.0+Infinity*20.0/x^6.0-Infinity*2.0/x^3.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "Infinity*72.0*-10.0/x^11.0+Infinity*30.0*-7.0/x^8.0+Infinity*20.0*-6.0/x^7.0-Infinity*2.0*-3.0/x^4.0-Infinity*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-Infinity*720.0/x^11.0-Infinity*210.0/x^8.0-Infinity*120.0/x^7.0+Infinity*6.0/x^4.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-Infinity*720.0/x^11.0-Infinity*209.99999999999997/x^8.0-Infinity*120.0/x^7.0+Infinity*6.0/x^4.0-Infinity*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-Infinity*720.0*-11.0/x^12.0-Infinity*209.99999999999997*-8.0/x^9.0-Infinity*120.0*-7.0/x^8.0+Infinity*6.0*-4.0/x^5.0-Infinity*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "Infinity*7920.0/x^12.0+Infinity*1679.9999999999998/x^9.0+Infinity*840.0/x^8.0-Infinity*24.0/x^5.0-Infinity*0.0";
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
    public static void TestCaseDiff6019() {
        //Test Case 6019
        UsageCalculus.TestCase = 6019;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*-0/0.0/x^8 + 1.0*-0/0.0/x^5 + 1.0*-0/0.0/x^4 - 1.0*-0/0.0/x - 25*-0/0.0";
        UsageCalculus.TestCaseName = "Simple: Coefficients:-0/0.0";
        UsageCalculus.TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-NaN/x^8.0-NaN/x^5.0-NaN/x^4.0+NaN/x+NaN";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-NaN*-8.0/x^9.0-NaN*-5.0/x^6.0-NaN*-4.0/x^5.0-NaN/x^2.0+NaN*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "NaN*8.0/x^9.0+NaN*5.0/x^6.0+NaN*4.0/x^5.0-NaN/x^2.0+NaN*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="-0.0/x^8.0-0.0/x^5.0-0.0/x^4.0+0.0/x";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-0.0/-7.0/x^7.0-0.0/-4.0/x^4.0-0.0/-3.0/x^3.0+0.0*ln(x)";
        UsageCalculus.EqnSolArrayMap4[1]="0.0/x^7.0+0.0/x^4.0+0.0/x^3.0+0.0*ln(x)";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "NaN*8.0/x^9.0+NaN*5.0/x^6.0+NaN*4.0/x^5.0-NaN/x^2.0+NaN*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "NaN*8.0*-9.0/x^10.0+NaN*5.0*-6.0/x^7.0+NaN*4.0*-5.0/x^6.0-NaN*-2.0/x^3.0+NaN*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-NaN*72.0/x^10.0-NaN*30.0/x^7.0-NaN*20.0/x^6.0+NaN*2.0/x^3.0+NaN*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-NaN*72.0/x^10.0-NaN*30.0/x^7.0-NaN*20.0/x^6.0+NaN*2.0/x^3.0+NaN*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-NaN*72.0*-10.0/x^11.0-NaN*30.0*-7.0/x^8.0-NaN*20.0*-6.0/x^7.0+NaN*2.0*-3.0/x^4.0+NaN*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "NaN*720.0/x^11.0+NaN*210.0/x^8.0+NaN*120.0/x^7.0-NaN*6.0/x^4.0+NaN*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "NaN*720.0/x^11.0+NaN*209.99999999999997/x^8.0+NaN*120.0/x^7.0-NaN*6.0/x^4.0+NaN*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "NaN*720.0*-11.0/x^12.0+NaN*209.99999999999997*-8.0/x^9.0+NaN*120.0*-7.0/x^8.0-NaN*6.0*-4.0/x^5.0+NaN*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-NaN*7920.0/x^12.0-NaN*1679.9999999999998/x^9.0-NaN*840.0/x^8.0+NaN*24.0/x^5.0+NaN*0.0";
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
}
