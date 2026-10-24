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
import org.apache.log4j.Logger;

/**
 *
 * @author Rajesh V Pai
 */
public class TestHarnessParenthesisNew {
    public static Logger log = Logger.getLogger(TestHarnessParenthesisNew.class.getName());
        
        /* **************************************** */
    
    //Parenthesis Test Cases
    public static void Parenthesis(String AlgoName, long j) {
        if (((!RunAllTestCasesFlag)&&(IgnoreKnownIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainIntegrTest")) && (IntegralGapInfinity(j))) 
                || ((!RunAllTestCasesFlag)&&(IgnoreKnownIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainDiffTest")) && (DifferentialGapInfinity(j)))) {
            KnownIssueTestCasesFlag=true;
            KnownIssues++;
            KnownIssuesTestCases.put(KnownIssues, "" + j);
            System.out.println(ConsoleColors.RED + "Parenthesis TestCase:j= " + j + ": Infinite Loop GAP" + ConsoleColors.RESET);
        } else if ((!RunAllTestCasesFlag)&&((IgnoreKnownIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainIntegrTest")) && (IntegralGapException(j))) 
                || ((!RunAllTestCasesFlag)&&(IgnoreKnownIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainDiffTest")) && (DifferentialGapException(j)))) {
            KnownIssueTestCasesFlag=true;
            KnownIssues++;
            KnownIssuesTestCases.put(KnownIssues, "" + j);
            System.out.println(ConsoleColors.RED + "Parenthesis TestCase:j= " + j + ": Exception GAP" + ConsoleColors.RESET);
        } else if( ( (!RunAllTestCasesFlag)&&(IgnoreCoreIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainIntegrTest"))&&(TrueIntegralGapInfinity(j)))
                ||( (!RunAllTestCasesFlag)&&(IgnoreCoreIssuesFlag==false) && (AlgoName.equalsIgnoreCase("mainDiffTest"))&&(TrueDifferentialGapInfinity(j))) )
        {
             CoreKnownIssuesTestCasesFlag=true;
             CoreKnownIssues ++;
             System.out.println(ConsoleColors.RED +"Parenthesis TestCase:j= " + j  + ": Infinite Loop GAP" + ConsoleColors.RESET);
        }
        else if(((!RunAllTestCasesFlag)&&(IgnoreCoreIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainIntegrTest"))&&(TrueIntegralGapException(j)))
                ||((!RunAllTestCasesFlag)&&(IgnoreCoreIssuesFlag==false)&&(AlgoName.equalsIgnoreCase("mainDiffTest"))&&(TrueDifferentialGapException(j))) )
        {
             CoreKnownIssuesTestCasesFlag=true;
             CoreKnownIssues ++;
             System.out.println(ConsoleColors.RED +"Parenthesis TestCase:j= " + j  + ": Exception GAP" + ConsoleColors.RESET);
        }else {
            switch ((int)j) {
                /* ******************* Constants, Variable, Ind Constant ********************* */
                case 80000:
                    TestCaseDiff80000();
                    break;
                case 80001:
                    TestCaseDiff80001();
                    break;
                case 80002:
                    TestCaseDiff80002();
                    break;
                case 80003:
                    TestCaseDiff80003();
                    break;
                case 80004:
                    TestCaseDiff80004();
                    break;
                case 80005:
                    TestCaseDiff80005();
                    break;
                case 80006:
                    TestCaseDiff80006();
                    break;
                case 80007:
                    TestCaseDiff80007();
                    break;
                case 80008:
                    TestCaseDiff80008();
                    break;
                case 80009:
                    TestCaseDiff80009();
                    break;
                case 80010:
                    TestCaseDiff80010();
                    break;
                case 80011:
                    TestCaseDiff80011();
                    break;
                case 80012:
                    TestCaseDiff80012();
                    break;
                case 80013:
                    TestCaseDiff80013();
                    break;
                case 80014:
                    TestCaseDiff80014();
                    break;
                case 80015:
                    TestCaseDiff80015();
                    break;
                case 80016:
                    TestCaseDiff80016();
                    break;
                case 80017:
                    TestCaseDiff80017();
                    break;
                case 80018:
                    TestCaseDiff80018();
                    break;
                case 80019:
                    TestCaseDiff80019();
                    break;
                case 80020:
                    TestCaseDiff80020();
                    break;
                case 80021:
                    TestCaseDiff80021();
                    break;
                case 80022:
                    TestCaseDiff80022();
                    break;
                case 80023:
                    TestCaseDiff80023();
                    break;
                case 80024:
                    TestCaseDiff80024();
                    break;
                case 80025:
                    TestCaseDiff80025();
                    break;
                case 80026:
                    TestCaseDiff80026();
                    break;
                case 80027:
                    TestCaseDiff80027();
                    break;
                case 80028:
                    TestCaseDiff80028();
                    break;
                case 80029:
                    TestCaseDiff80029();
                    break;
                case 80030:
                    TestCaseDiff80030();
                    break;
                case 80031:
                    TestCaseDiff80031();
                    break;
                case 80032:
                    TestCaseDiff80032();
                    break;
                case 80033:
                    TestCaseDiff80033();
                    break;
                case 80035:
                    TestCaseDiff80035();
                    break;
                case 80036:
                    TestCaseDiff80036();
                    break;
                case 80037:
                    TestCaseDiff80037();
                    break;
                case 80038:
                    TestCaseDiff80038();
                    break;
                case 80039:
                    TestCaseDiff80039();
                    break;
                case 80040:
                    TestCaseDiff80040();
                    break;
                case 80045:
                    TestCaseDiff80045();
                    break;
                case 80046:
                    TestCaseDiff80046();
                    break;
                case 80047:
                    TestCaseDiff80047();
                    break;
                /* ******************* Expressions ********************* */    
                case 80048:
                    TestCaseDiff80048();
                    break;
                case 80049:
                    TestCaseDiff80049();
                    break;
                case 80050:
                    TestCaseDiff80050();
                    break;
                case 80051:
                    TestCaseDiff80051();
                    break;
                case 80052:
                    TestCaseDiff80052();
                    break;
                case 80053:
                    TestCaseDiff80053();
                    break;
                case 80054:
                    TestCaseDiff80054();
                    break;
                case 80055:
                    TestCaseDiff80055();
                    break;
                case 80056:
                    TestCaseDiff80056();
                    break;
                case 80057:
                    TestCaseDiff80057();
                    break;
                case 80058:
                    TestCaseDiff80058();
                    break;
                case 80059:
                    TestCaseDiff80059();
                    break;
                case 80060:
                    TestCaseDiff80060();
                    break;
                case 80061:
                    TestCaseDiff80061();
                    break;
                case 80062:
                    TestCaseDiff80062();
                    break;
                case 80063:
                    TestCaseDiff80063();
                    break;
                case 80064:
                    TestCaseDiff80064();
                    break;
                case 80065:
                    TestCaseDiff80065();
                    break;
                case 80066:
                    TestCaseDiff80066();
                    break;
                case 80067:
                    TestCaseDiff80067();
                    break;
                case 80068:
                    TestCaseDiff80068();
                    break;
                case 80069:
                    TestCaseDiff80069();
                    break;
                case 80070:
                    TestCaseDiff80070();
                    break;
                case 80071:
                    TestCaseDiff80071();
                    break;
                case 80072:
                    TestCaseDiff80072();
                    break;
                case 80073:
                    TestCaseDiff80073();
                    break;
                case 80074:
                    TestCaseDiff80074();
                    break;
                case 80075:
                    TestCaseDiff80075();
                    break;
                case 80076:
                    TestCaseDiff80076();
                    break;
                case 80077:
                    TestCaseDiff80077();
                    break;
                case 80078:
                    TestCaseDiff80078();
                    break;
                case 80079:
                    TestCaseDiff80079();
                    break;
                case 80080:
                    TestCaseDiff80080();
                    break;
                case 80081:
                    TestCaseDiff80081();
                    break;
                case 80082:
                    TestCaseDiff80082();
                    break;
                case 80083:
                    TestCaseDiff80083();
                    break;
                case 80084:
                    TestCaseDiff80084();
                    break;
                case 80085:
                    TestCaseDiff80085();
                    break;
                case 80086:
                    TestCaseDiff80086();
                    break;
                case 80087:
                    TestCaseDiff80087();
                    break;
                case 80093:
                    TestCaseDiff80093();
                    break;
                case 80094:
                    TestCaseDiff80094();
                    break;
                case 80095:
                    TestCaseDiff80095();
                    break;
                case 80096:
                    TestCaseDiff80096();
                    break;
                case 80097:
                    TestCaseDiff80097();
                    break;
                case 80098:
                    TestCaseDiff80098();
                    break;
                case 80099:
                    TestCaseDiff80099();
                    break;
                case 80100:
                    TestCaseDiff80100();
                    break;
                case 80101:
                    TestCaseDiff80101();
                    break;
                case 80102:
                    TestCaseDiff80102();
                    break;
                case 80103:
                    TestCaseDiff80103();
                    break;
                case 80104:
                    TestCaseDiff80104();
                    break;
                case 80105:
                    TestCaseDiff80105();
                    break;
                case 80106:
                    TestCaseDiff80106();
                    break;
                case 80107:
                    TestCaseDiff80107();
                    break;
                case 80108:
                    TestCaseDiff80108();
                    break;
                case 80109:
                    TestCaseDiff80109();
                    break;
                case 80110:
                    TestCaseDiff80110();
                    break;
                case 80111:
                    TestCaseDiff80111();
                    break;
                case 80112:
                    TestCaseDiff80112();
                    break;
                case 80113:
                    TestCaseDiff80113();
                    break;
                case 80114:
                    TestCaseDiff80114();
                    break;
                case 80115:
                    TestCaseDiff80115();
                    break;
                case 80116:
                    TestCaseDiff80116();
                    break;
                case 80117:
                    TestCaseDiff80117();
                    break;
                case 80118:
                    TestCaseDiff80118();
                    break;
                case 80119:
                    TestCaseDiff80119();
                    break;
                case 80120:
                    TestCaseDiff80120();
                    break;
                case 80123:
                    TestCaseDiff80123();
                    break;
                case 80124:
                    TestCaseDiff80124();
                    break;
                case 80125:
                    TestCaseDiff80125();
                    break;
                case 80126:
                    TestCaseDiff80126();
                    break;
                case 80127:
                    TestCaseDiff80127();
                    break;
                case 80128:
                    TestCaseDiff80128();
                    break;
                case 80129:
                    TestCaseDiff80129();
                    break;
                case 80132:
                    TestCaseDiff80132();
                    break;
                default:
                    System.out.println(ConsoleColors.RED + "Parenthesis TestCase:j= " + j + ": Gap" + ConsoleColors.RESET);
                    break;
            }
        }
    }
        /* **************************************** */
    /* ***************CoPilot Parenthesis Test Case***************** */
        /* ******************* Constants, Variable, Ind Constant ********************* */
        /* **************************************** */
    public static void TestCaseDiff80000() {
        //Test Case 80000
        UsageCalculus.TestCase = 80000;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(0) + (0) + (0) - (0)- 25*(2)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 3;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "";
        UsageCalculus.EqnSolArrayMap3[1]="-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4]="-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="-2.0833333333333335*x^4.0";
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
    public static void TestCaseDiff80001() {
        //Test Case 80001
        UsageCalculus.TestCase = 80001;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(1)+(1)+(2)+(3)+50*(2)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 3;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0+1.0+2.0+3.0+100.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+1.0*0.0+2.0*0.0+3.0*0.0+100.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "";
        UsageCalculus.EqnSolArrayMap3[1]="1.0+1.0+2.0+3.0+100.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0*x+1.0*x+2.0*x+3.0*x+100.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="x+x+2.0*x+3.0*x+100.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="x+x+2.0*x+3.0*x+100.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/2.0*x^2.0+1.0/2.0*x^2.0+x^2.0+3.0/2.0*x^2.0+100.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/2.0*x^2.0+0.5*x^2.0+x^2.0+1.5*x^2.0+50.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/2.0*x^2.0+0.5*x^2.0+x^2.0+1.5*x^2.0+50.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/2.0/3.0*x^3.0+0.5/3.0*x^3.0+1.0/3.0*x^3.0+1.5/3.0*x^3.0+50.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/6.0*x^3.0+1.0/6.0*x^3.0+1.0/3.0*x^3.0+1.0/2.0*x^3.0+16.666666666666668*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/6.0*x^3.0+1.0/6.0*x^3.0+1.0/3.0*x^3.0+1.0/2.0*x^3.0+16.666666666666668*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/6.0/4.0*x^4.0+1.0/6.0/4.0*x^4.0+1.0/3.0/4.0*x^4.0+1.0/2.0/4.0*x^4.0+16.666666666666668/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/24.0*x^4.0+1.0/24.0*x^4.0+1.0/12.0*x^4.0+1.0/8.0*x^4.0+4.166666666666667*x^4.0";
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
        
        public static void TestCaseDiff80002() {
        //Test Case 80002
        UsageCalculus.TestCase = 80002;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(2*4) + (2*3) + 1 - 1*(2/1)- 25*(2)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "8.0+6.0+1.0-2.0-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+6.0*0.0+1.0*0.0-2.0*0.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "";
        UsageCalculus.EqnSolArrayMap3[1] = "8.0+6.0+1.0-2.0-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="8.0*x+6.0*x+1.0*x-2.0*x-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="8.0*x+6.0*x+x-2.0*x-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="8.0*x+6.0*x+x-2.0*x-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="8.0/2.0*x^2.0+6.0/2.0*x^2.0+1.0/2.0*x^2.0-x^2.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="4.0*x^2.0+3.0*x^2.0+0.5*x^2.0-x^2.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="4.0*x^2.0+3.0*x^2.0+0.5*x^2.0-x^2.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="4.0/3.0*x^3.0+3.0/3.0*x^3.0+0.5/3.0*x^3.0-1.0/3.0*x^3.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.3333333333333333*x^3.0+x^3.0+1.0/6.0*x^3.0-1.0/3.0*x^3.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4]="1.3333333333333333*x^3.0+x^3.0+1.0/6.0*x^3.0-1.0/3.0*x^3.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.3333333333333333/4.0*x^4.0+1.0/4.0*x^4.0+1.0/6.0/4.0*x^4.0-1.0/3.0/4.0*x^4.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/3.0*x^4.0+1.0/4.0*x^4.0+1.0/24.0*x^4.0-1.0/12.0*x^4.0-2.0833333333333335*x^4.0";
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
        public static void TestCaseDiff80003() {
        //Test Case 80003
        UsageCalculus.TestCase = 80003;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(22/7) + (22/7) + (22/7) - (22/7)- 1.0*(22/7)*25";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "3.142857142857143+3.142857142857143+3.142857142857143-3.142857142857143-78.57142857142857";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+3.142857142857143*0.0+3.142857142857143*0.0-3.142857142857143*0.0-78.57142857142857*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "";
        UsageCalculus.EqnSolArrayMap3[1]="3.142857142857143+3.142857142857143+3.142857142857143-3.142857142857143-78.57142857142857";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="3.142857142857143*x+3.142857142857143*x+3.142857142857143*x-3.142857142857143*x-78.57142857142857*x";
        UsageCalculus.EqnSolArrayMap4[1]="3.142857142857143*x+3.142857142857143*x+3.142857142857143*x-3.142857142857143*x-78.57142857142857*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="3.142857142857143*x+3.142857142857143*x+3.142857142857143*x-3.142857142857143*x-78.57142857142857*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="3.142857142857143/2.0*x^2.0+3.142857142857143/2.0*x^2.0+3.142857142857143/2.0*x^2.0-3.142857142857143/2.0*x^2.0-78.57142857142857/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.5714285714285714*x^2.0+1.5714285714285714*x^2.0+1.5714285714285714*x^2.0-1.5714285714285714*x^2.0-39.285714285714285*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="1.5714285714285714*x^2.0+1.5714285714285714*x^2.0+1.5714285714285714*x^2.0-1.5714285714285714*x^2.0-39.285714285714285*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.5714285714285714/3.0*x^3.0+1.5714285714285714/3.0*x^3.0+1.5714285714285714/3.0*x^3.0-1.5714285714285714/3.0*x^3.0-39.285714285714285/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/1.9090909090909092*x^3.0+1.0/1.9090909090909092*x^3.0+1.0/1.9090909090909092*x^3.0-1.0/1.9090909090909092*x^3.0-13.095238095238095*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/1.9090909090909092*x^3.0+1.0/1.9090909090909092*x^3.0+1.0/1.9090909090909092*x^3.0-1.0/1.9090909090909092*x^3.0-13.095238095238095*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/1.9090909090909092/4.0*x^4.0+1.0/1.9090909090909092/4.0*x^4.0+1.0/1.9090909090909092/4.0*x^4.0-1.0/1.9090909090909092/4.0*x^4.0-13.095238095238095/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/7.636363636363637*x^4.0+1.0/7.636363636363637*x^4.0+1.0/7.636363636363637*x^4.0-1.0/7.636363636363637*x^4.0-3.2738095238095237*x^4.0";
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
         public static void TestCaseDiff80004() {
        //Test Case 80004
        UsageCalculus.TestCase = 80004;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(10)+(10)-25*2*(3.12)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "10.0+10.0-156.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+10.0*0.0-156.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "";
        UsageCalculus.EqnSolArrayMap3[1]="10.0+10.0-156.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="10.0*x+10.0*x-156.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="10.0*x+10.0*x-156.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="10.0*x+10.0*x-156.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="10.0/2.0*x^2.0+10.0/2.0*x^2.0-156.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="5.0*x^2.0+5.0*x^2.0-78.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="5.0*x^2.0+5.0*x^2.0-78.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="5.0/3.0*x^3.0+5.0/3.0*x^3.0-78.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.6666666666666667*x^3.0+1.6666666666666667*x^3.0-26.0*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4]="1.6666666666666667*x^3.0+1.6666666666666667*x^3.0-26.0*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.6666666666666667/4.0*x^4.0+1.6666666666666667/4.0*x^4.0-26.0/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/2.4*x^4.0+1.0/2.4*x^4.0-6.5*x^4.0";
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
        public static void TestCaseDiff80005() {
        //Test Case 80005
        UsageCalculus.TestCase = 80005;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(x) + (x) + (x) - 2*(x)*7- 1.0*(3*9)*25";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x+x+x-14.0*x-675.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0+1.0+1.0-14.0-675.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0+1.0+1.0-14.0";
        UsageCalculus.EqnSolArrayMap3[1]="x+x+x-14.0*x-675.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/2.0*x^2.0+1.0/2.0*x^2.0+1.0/2.0*x^2.0-14.0/2.0*x^2.0-675.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/2.0*x^2.0+1.0/2.0*x^2.0+1.0/2.0*x^2.0-7.0*x^2.0-675.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0+1.0+1.0-14.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "0.0+1.0*0.0+1.0*0.0-14.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/2.0*x^2.0+1.0/2.0*x^2.0+1.0/2.0*x^2.0-7.0*x^2.0-675.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/2.0/3.0*x^3.0+1.0/2.0/3.0*x^3.0+1.0/2.0/3.0*x^3.0-7.0/3.0*x^3.0-675.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/6.0*x^3.0+1.0/6.0*x^3.0+1.0/6.0*x^3.0-2.3333333333333335*x^3.0-337.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/6.0*x^3.0+1.0/6.0*x^3.0+1.0/6.0*x^3.0-2.3333333333333335*x^3.0-337.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/6.0/4.0*x^4.0+1.0/6.0/4.0*x^4.0+1.0/6.0/4.0*x^4.0-2.3333333333333335/4.0*x^4.0-337.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/24.0*x^4.0+1.0/24.0*x^4.0+1.0/24.0*x^4.0-1.0/1.7142857142857142*x^4.0-112.5*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/24.0*x^4.0+1.0/24.0*x^4.0+1.0/24.0*x^4.0-1.0/1.7142857142857142*x^4.0-112.5*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/24.0/5.0*x^5.0+1.0/24.0/5.0*x^5.0+1.0/24.0/5.0*x^5.0-1.0/1.7142857142857142/5.0*x^5.0-112.5/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/120.0*x^5.0+1.0/120.0*x^5.0+1.0/120.0*x^5.0-1.0/8.571428571428571*x^5.0-28.125*x^4.0";
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
      public static void TestCaseDiff80006() {
        //Test Case 80006
        UsageCalculus.TestCase = 80006;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(y) + (y) + (y) - 2*(y)*7- 1.0*(3*9)*25";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "y";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "y+y+y-14.0*y-675.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0+1.0+1.0-14.0-675.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0+1.0+1.0-14.0";
        UsageCalculus.EqnSolArrayMap3[1]="y+y+y-14.0*y-675.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/2.0*y^2.0+1.0/2.0*y^2.0+1.0/2.0*y^2.0-14.0/2.0*y^2.0-675.0*y";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/2.0*y^2.0+1.0/2.0*y^2.0+1.0/2.0*y^2.0-7.0*y^2.0-675.0*y";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0+1.0+1.0-14.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "0.0+1.0*0.0+1.0*0.0-14.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/2.0*y^2.0+1.0/2.0*y^2.0+1.0/2.0*y^2.0-7.0*y^2.0-675.0*y";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/2.0/3.0*y^3.0+1.0/2.0/3.0*y^3.0+1.0/2.0/3.0*y^3.0-7.0/3.0*y^3.0-675.0/2.0*y^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/6.0*y^3.0+1.0/6.0*y^3.0+1.0/6.0*y^3.0-2.3333333333333335*y^3.0-337.5*y^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/6.0*y^3.0+1.0/6.0*y^3.0+1.0/6.0*y^3.0-2.3333333333333335*y^3.0-337.5*y^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/6.0/4.0*y^4.0+1.0/6.0/4.0*y^4.0+1.0/6.0/4.0*y^4.0-2.3333333333333335/4.0*y^4.0-337.5/3.0*y^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/24.0*y^4.0+1.0/24.0*y^4.0+1.0/24.0*y^4.0-1.0/1.7142857142857142*y^4.0-112.5*y^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/24.0*y^4.0+1.0/24.0*y^4.0+1.0/24.0*y^4.0-1.0/1.7142857142857142*y^4.0-112.5*y^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/24.0/5.0*y^5.0+1.0/24.0/5.0*y^5.0+1.0/24.0/5.0*y^5.0-1.0/1.7142857142857142/5.0*y^5.0-112.5/4.0*y^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/120.0*y^5.0+1.0/120.0*y^5.0+1.0/120.0*y^5.0-1.0/8.571428571428571*y^5.0-28.125*y^4.0";
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
      
        public static void TestCaseDiff80007() {
        //Test Case 80007
        UsageCalculus.TestCase = 80007;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(z) + (z) + (z) - 2*(z)*7- 1.0*(3*9)*25";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "z+z+z-z*14.0-675.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "z*0.0+z*0.0+z*0.0-z*14.0*0.0-675.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "z*0.0+z*0.0+z*0.0-z*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="z+z+z-z*14.0-675.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="z*x+z*x+z*x-z*14.0*x-675.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="z*x+z*x+z*x-z*14.0*x-675.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "z*0.0+z*0.0+z*0.0-z*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "z*0.0+z*0.0*0.0+z*0.0*0.0-z*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "z*0.0+z*0.0+z*0.0-z*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="z*x+z*x+z*x-z*14.0*x-675.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="z/2.0*x^2.0+z/2.0*x^2.0+z/2.0*x^2.0-z*14.0/2.0*x^2.0-675.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="z/2.0*x^2.0+z/2.0*x^2.0+z/2.0*x^2.0-z*7.0*x^2.0-337.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "z*0.0+z*0.0+z*0.0-z*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "z*0.0+z*0.0*0.0+z*0.0*0.0-z*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "z*0.0+z*0.0+z*0.0-z*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="z/2.0*x^2.0+z/2.0*x^2.0+z/2.0*x^2.0-z*7.0*x^2.0-337.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="z/2.0/3.0*x^3.0+z/2.0/3.0*x^3.0+z/2.0/3.0*x^3.0-z*7.0/3.0*x^3.0-337.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="z*0.16666666666666666*x^3.0+z*0.16666666666666666*x^3.0+z*0.16666666666666666*x^3.0-z*2.3333333333333335*x^3.0-112.5*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "z*0.0+z*0.0+z*0.0-z*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "z*0.0+z*0.0*0.0+z*0.0*0.0-z*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "z*0.0+z*0.0+z*0.0-z*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="z*0.16666666666666666*x^3.0+z*0.16666666666666666*x^3.0+z*0.16666666666666666*x^3.0-z*2.3333333333333335*x^3.0-112.5*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="z*0.16666666666666666/4.0*x^4.0+z*0.16666666666666666/4.0*x^4.0+z*0.16666666666666666/4.0*x^4.0-z*2.3333333333333335/4.0*x^4.0-112.5/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="z*0.041666666666666664*x^4.0+z*0.041666666666666664*x^4.0+z*0.041666666666666664*x^4.0-z/1.7142857142857142*x^4.0-28.125*x^4.0";
        
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
        public static void TestCaseDiff80008() {
        //Test Case 80008
        UsageCalculus.TestCase = 80008;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(-xy) + (-xy) + (-xy) - 2*(-xy)*7- 1.0*(3*9)*25";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Coefficients:0.0:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis";
        
        UsageCalculus.DiffWithRespTo = "xy";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-xy-xy-xy+14.0*xy-675.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-1.0-1.0-1.0+14.0-675.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-1.0-1.0-1.0+14.0";
        UsageCalculus.EqnSolArrayMap3[1]="-xy-xy-xy+14.0*xy-675.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-1.0/2.0*xy^2.0-1.0/2.0*xy^2.0-1.0/2.0*xy^2.0+14.0/2.0*xy^2.0-675.0*xy";
        UsageCalculus.EqnSolArrayMap4[1]="-1.0/2.0*xy^2.0-1.0/2.0*xy^2.0-1.0/2.0*xy^2.0+7.0*xy^2.0-675.0*xy";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-1.0-1.0-1.0+14.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-0.0-1.0*0.0-1.0*0.0+14.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="-1.0/2.0*xy^2.0-1.0/2.0*xy^2.0-1.0/2.0*xy^2.0+7.0*xy^2.0-675.0*xy";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-1.0/2.0/3.0*xy^3.0-1.0/2.0/3.0*xy^3.0-1.0/2.0/3.0*xy^3.0+7.0/3.0*xy^3.0-675.0/2.0*xy^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="-1.0/6.0*xy^3.0-1.0/6.0*xy^3.0-1.0/6.0*xy^3.0+2.3333333333333335*xy^3.0-337.5*xy^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="-1.0/6.0*xy^3.0-1.0/6.0*xy^3.0-1.0/6.0*xy^3.0+2.3333333333333335*xy^3.0-337.5*xy^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="-1.0/6.0/4.0*xy^4.0-1.0/6.0/4.0*xy^4.0-1.0/6.0/4.0*xy^4.0+2.3333333333333335/4.0*xy^4.0-337.5/3.0*xy^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-1.0/24.0*xy^4.0-1.0/24.0*xy^4.0-1.0/24.0*xy^4.0+1.0/1.7142857142857142*xy^4.0-112.5*xy^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4]="-1.0/24.0*xy^4.0-1.0/24.0*xy^4.0-1.0/24.0*xy^4.0+1.0/1.7142857142857142*xy^4.0-112.5*xy^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="-1.0/24.0/5.0*xy^5.0-1.0/24.0/5.0*xy^5.0-1.0/24.0/5.0*xy^5.0+1.0/1.7142857142857142/5.0*xy^5.0-112.5/4.0*xy^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="-1.0/120.0*xy^5.0-1.0/120.0*xy^5.0-1.0/120.0*xy^5.0+1.0/8.571428571428571*xy^5.0-28.125*xy^4.0";
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
        // Parenthesis Test Case
        public static void TestCaseDiff80009() {
        //Test Case 80009
        UsageCalculus.TestCase = 80009;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(+y) + (+y) + (+y) - (2)*(+y)- 25*(1)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "y+y+y-y*2.0-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "y*0.0+y*0.0+y*0.0-y*2.0*0.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "y*0.0+y*0.0+y*0.0-y*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="y+y+y-y*2.0-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="y*x+y*x+y*x-y*2.0*x-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="y*x+y*x+y*x-y*2.0*x-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "y*0.0+y*0.0+y*0.0-y*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "y*0.0+y*0.0*0.0+y*0.0*0.0-y*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "y*0.0+y*0.0+y*0.0-y*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="y*x+y*x+y*x-y*2.0*x-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="y/2.0*x^2.0+y/2.0*x^2.0+y/2.0*x^2.0-y*x^2.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="y/2.0*x^2.0+y/2.0*x^2.0+y/2.0*x^2.0-y*x^2.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "y*0.0+y*0.0+y*0.0-y*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "y*0.0+y*0.0*0.0+y*0.0*0.0-y*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "y*0.0+y*0.0+y*0.0-y*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="y/2.0*x^2.0+y/2.0*x^2.0+y/2.0*x^2.0-y*x^2.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="y/2.0/3.0*x^3.0+y/2.0/3.0*x^3.0+y/2.0/3.0*x^3.0-y/3.0*x^3.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="y*0.16666666666666666*x^3.0+y*0.16666666666666666*x^3.0+y*0.16666666666666666*x^3.0-y/3.0*x^3.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "y*0.0+y*0.0+y*0.0-y*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "y*0.0+y*0.0*0.0+y*0.0*0.0-y*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "y*0.0+y*0.0+y*0.0-y*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="y*0.16666666666666666*x^3.0+y*0.16666666666666666*x^3.0+y*0.16666666666666666*x^3.0-y/3.0*x^3.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="y*0.16666666666666666/4.0*x^4.0+y*0.16666666666666666/4.0*x^4.0+y*0.16666666666666666/4.0*x^4.0-y/3.0/4.0*x^4.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="y*0.041666666666666664*x^4.0+y*0.041666666666666664*x^4.0+y*0.041666666666666664*x^4.0-y/12.0*x^4.0-1.0416666666666667*x^4.0";
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
        public static void TestCaseDiff80010() {
        //Test Case 80010
        UsageCalculus.TestCase = 80010;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(a+b) + (a+b) + (a+b) - (a+b)- 2*(a+b)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "(a+b)+(a+b)+(a+b)-(a+b)-(a+b)*2.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "(a+b)*0.0+(a+b)*0.0+(a+b)*0.0-(a+b)*0.0-(a+b)*2.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "(a+b)*0.0+(a+b)*0.0+(a+b)*0.0-(a+b)*0.0-(a+b)*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="(a+b)+(a+b)+(a+b)-(a+b)-(a+b)*2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="(a+b)*x+(a+b)*x+(a+b)*x-(a+b)*x-(a+b)*2.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="(a+b)*x+(a+b)*x+(a+b)*x-(a+b)*x-(a+b)*2.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "(a+b)*0.0+(a+b)*0.0+(a+b)*0.0-(a+b)*0.0-(a+b)*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "(a+b)*0.0+(a+b)*0.0*0.0+(a+b)*0.0*0.0-(a+b)*0.0*0.0-(a+b)*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "(a+b)*0.0+(a+b)*0.0+(a+b)*0.0-(a+b)*0.0-(a+b)*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="(a+b)*x+(a+b)*x+(a+b)*x-(a+b)*x-(a+b)*2.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="(a+b)/2.0*x^2.0+(a+b)/2.0*x^2.0+(a+b)/2.0*x^2.0-(a+b)/2.0*x^2.0-(a+b)*2.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="(a+b)/2.0*x^2.0+(a+b)/2.0*x^2.0+(a+b)/2.0*x^2.0-(a+b)/2.0*x^2.0-(a+b)*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "(a+b)*0.0+(a+b)*0.0+(a+b)*0.0-(a+b)*0.0-(a+b)*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "(a+b)*0.0+(a+b)*0.0*0.0+(a+b)*0.0*0.0-(a+b)*0.0*0.0-(a+b)*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "(a+b)*0.0+(a+b)*0.0+(a+b)*0.0-(a+b)*0.0-(a+b)*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="(a+b)/2.0*x^2.0+(a+b)/2.0*x^2.0+(a+b)/2.0*x^2.0-(a+b)/2.0*x^2.0-(a+b)*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "(a+b)*0.0+(a+b)*0.0+(a+b)*0.0-(a+b)*0.0-(a+b)*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "(a+b)*0.0+(a+b)*0.0*0.0+(a+b)*0.0*0.0-(a+b)*0.0*0.0-(a+b)*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "(a+b)*0.0+(a+b)*0.0+(a+b)*0.0-(a+b)*0.0-(a+b)*0.0";
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
        public static void TestCaseDiff80011() {
        //Test Case 80011
        UsageCalculus.TestCase = 80011;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(a-b) + (a-b) + (a-b) - (a-b)- 2*(a-b)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "(a-b)+(a-b)+(a-b)-(a-b)-(a-b)*2.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "(a-b)*0.0+(a-b)*0.0+(a-b)*0.0-(a-b)*0.0-(a-b)*2.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "(a-b)*0.0+(a-b)*0.0+(a-b)*0.0-(a-b)*0.0-(a-b)*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="(a-b)+(a-b)+(a-b)-(a-b)-(a-b)*2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="";
        UsageCalculus.EqnSolArrayMap4[1]="";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "(a-b)*0.0+(a-b)*0.0+(a-b)*0.0-(a-b)*0.0-(a-b)*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "(a-b)*0.0+(a-b)*0.0*0.0+(a-b)*0.0*0.0-(a-b)*0.0*0.0-(a-b)*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "(a-b)*0.0+(a-b)*0.0+(a-b)*0.0-(a-b)*0.0-(a-b)*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "(a-b)*0.0+(a-b)*0.0+(a-b)*0.0-(a-b)*0.0-(a-b)*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "(a-b)*0.0+(a-b)*0.0*0.0+(a-b)*0.0*0.0-(a-b)*0.0*0.0-(a-b)*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "(a-b)*0.0+(a-b)*0.0+(a-b)*0.0-(a-b)*0.0-(a-b)*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "(a-b)*0.0+(a-b)*0.0+(a-b)*0.0-(a-b)*0.0-(a-b)*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "(a-b)*0.0+(a-b)*0.0*0.0+(a-b)*0.0*0.0-(a-b)*0.0*0.0-(a-b)*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "(a-b)*0.0+(a-b)*0.0+(a-b)*0.0-(a-b)*0.0-(a-b)*0.0";
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
    public static void TestCaseDiff80012() {
        //Test Case 80012
        UsageCalculus.TestCase = 80012;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(a*b) + (a*b) + (a*+b) - (a*b)- 2*(a*b)";
        UsageCalculus.TestCaseName = "Simple: Variables:3 Letter :Coefficients:+1";
        UsageCalculus.TestCaseMatrixID="Coefficients:+1:3 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a*b+a*b+a*b-a*b-a*b*2.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a*b*0.0+a*b*0.0+a*b*0.0-a*b*0.0-a*b*2.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a*b*0.0+a*b*0.0+a*b*0.0-a*b*0.0-a*b*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="a*b+a*b+a*b-a*b-a*b*2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a*b*xyc+a*b*xyc+a*b*xyc-a*b*xyc-a*b*2.0*xyc";
        UsageCalculus.EqnSolArrayMap4[1]="a*b*xyc+a*b*xyc+a*b*xyc-a*b*xyc-a*b*2.0*xyc";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a*b*0.0+a*b*0.0+a*b*0.0-a*b*0.0-a*b*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a*b*0.0+a*b*0.0*0.0+a*b*0.0*0.0-a*b*0.0*0.0-a*b*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a*b*0.0+a*b*0.0+a*b*0.0-a*b*0.0-a*b*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a*b*xyc+a*b*xyc+a*b*xyc-a*b*xyc-a*b*2.0*xyc";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a*b*xyc^2.0*1.0/2.0+a*b*xyc^2.0*1.0/2.0+a*b*xyc^2.0*1.0/2.0-a*b*xyc^2.0*1.0/2.0-a*b*xyc^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a*b/2.0*xyc^2.0+a*b/2.0*xyc^2.0+a*b/2.0*xyc^2.0-a*b/2.0*xyc^2.0-a*b*xyc^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a*b*0.0+a*b*0.0+a*b*0.0-a*b*0.0-a*b*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a*b*0.0+a*b*0.0*0.0+a*b*0.0*0.0-a*b*0.0*0.0-a*b*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a*b*0.0+a*b*0.0+a*b*0.0-a*b*0.0-a*b*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a*b/2.0*xyc^2.0+a*b/2.0*xyc^2.0+a*b/2.0*xyc^2.0-a*b/2.0*xyc^2.0-a*b*xyc^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a*b/2.0/3.0*xyc^3.0+a*b/2.0/3.0*xyc^3.0+a*b/2.0/3.0*xyc^3.0-a*b/2.0/3.0*xyc^3.0-a*b*1.0/3.0*xyc^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a*b*0.16666666666666666*xyc^3.0+a*b*0.16666666666666666*xyc^3.0+a*b*0.16666666666666666*xyc^3.0-a*b*0.16666666666666666*xyc^3.0-a*b/3.0*xyc^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a*b*0.0+a*b*0.0+a*b*0.0-a*b*0.0-a*b*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a*b*0.0+a*b*0.0*0.0+a*b*0.0*0.0-a*b*0.0*0.0-a*b*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a*b*0.0+a*b*0.0+a*b*0.0-a*b*0.0-a*b*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a*b*0.16666666666666666*xyc^3.0+a*b*0.16666666666666666*xyc^3.0+a*b*0.16666666666666666*xyc^3.0-a*b*0.16666666666666666*xyc^3.0-a*b/3.0*xyc^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a*b*0.16666666666666666/4.0*xyc^4.0+a*b*0.16666666666666666/4.0*xyc^4.0+a*b*0.16666666666666666/4.0*xyc^4.0-a*b*0.16666666666666666/4.0*xyc^4.0-a*b/3.0/4.0*xyc^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a*b*0.041666666666666664*xyc^4.0+a*b*0.041666666666666664*xyc^4.0+a*b*0.041666666666666664*xyc^4.0-a*b*0.041666666666666664*xyc^4.0-a*b/12.0*xyc^4.0";
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
    
        public static void TestCaseDiff80013() {
        //Test Case 80013
        UsageCalculus.TestCase = 80013;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(a/b) + (a/b) + (a/b) - (a/b)- 2*(a/b)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a/b+a/b+a/b-a/b-a/b*2.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a/b*0.0+a/b*0.0+a/b*0.0-a/b*0.0-a/b*2.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a/b*0.0+a/b*0.0+a/b*0.0-a/b*0.0-a/b*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="a/b+a/b+a/b-a/b-a/b*2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a/b*x+a/b*x+a/b*x-a/b*x-a/b*2.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a/b*x+a/b*x+a/b*x-a/b*x-a/b*2.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a/b*0.0+a/b*0.0+a/b*0.0-a/b*0.0-a/b*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a/b*0.0+a/b*0.0*0.0+a/b*0.0*0.0-a/b*0.0*0.0-a/b*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a/b*0.0+a/b*0.0+a/b*0.0-a/b*0.0-a/b*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a/b*x+a/b*x+a/b*x-a/b*x-a/b*2.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a/b*x^2.0*1.0/2.0+a/b*x^2.0*1.0/2.0+a/b*x^2.0*1.0/2.0-a/b*x^2.0*1.0/2.0-a/b*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a/b/2.0*x^2.0+a/b/2.0*x^2.0+a/b/2.0*x^2.0-a/b/2.0*x^2.0-a/b*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a/b*0.0+a/b*0.0+a/b*0.0-a/b*0.0-a/b*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a/b*0.0+a/b*0.0*0.0+a/b*0.0*0.0-a/b*0.0*0.0-a/b*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a/b*0.0+a/b*0.0+a/b*0.0-a/b*0.0-a/b*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a/b/2.0*x^2.0+a/b/2.0*x^2.0+a/b/2.0*x^2.0-a/b/2.0*x^2.0-a/b*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a/b/2.0/3.0*x^3.0+a/b/2.0/3.0*x^3.0+a/b/2.0/3.0*x^3.0-a/b/2.0/3.0*x^3.0-a/b*1.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a/b*0.16666666666666666*x^3.0+a/b*0.16666666666666666*x^3.0+a/b*0.16666666666666666*x^3.0-a/b*0.16666666666666666*x^3.0-a/b/3.0*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a/b*0.0+a/b*0.0+a/b*0.0-a/b*0.0-a/b*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a/b*0.0+a/b*0.0*0.0+a/b*0.0*0.0-a/b*0.0*0.0-a/b*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a/b*0.0+a/b*0.0+a/b*0.0-a/b*0.0-a/b*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a/b*0.16666666666666666*x^3.0+a/b*0.16666666666666666*x^3.0+a/b*0.16666666666666666*x^3.0-a/b*0.16666666666666666*x^3.0-a/b/3.0*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a/b*0.16666666666666666/4.0*x^4.0+a/b*0.16666666666666666/4.0*x^4.0+a/b*0.16666666666666666/4.0*x^4.0-a/b*0.16666666666666666/4.0*x^4.0-a/b/3.0/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a/b*0.041666666666666664*x^4.0+a/b*0.041666666666666664*x^4.0+a/b*0.041666666666666664*x^4.0-a/b*0.041666666666666664*x^4.0-a/b/12.0*x^4.0";
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
        public static void TestCaseDiff80014() {
        //Test Case 80014
        UsageCalculus.TestCase = 80014;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(2*x) + (3*x) + (4*x) - (2)*x- 25*(2)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "2.0*x+3.0*x+4.0*x-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "2.0+3.0+4.0-2.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "2.0+3.0+4.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="2.0*x+3.0*x+4.0*x-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="x^2.0+3.0/2.0*x^2.0+4.0/2.0*x^2.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="x^2.0+1.5*x^2.0+2.0*x^2.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "2.0+3.0+4.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "0.0+3.0*0.0+4.0*0.0-2.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="x^2.0+1.5*x^2.0+2.0*x^2.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/3.0*x^3.0+1.5/3.0*x^3.0+2.0/3.0*x^3.0-1.0/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/3.0*x^3.0+1.0/2.0*x^3.0+1.0/1.5*x^3.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/3.0*x^3.0+1.0/2.0*x^3.0+1.0/1.5*x^3.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/3.0/4.0*x^4.0+1.0/2.0/4.0*x^4.0+1.0/1.5/4.0*x^4.0-1.0/3.0/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/12.0*x^4.0+1.0/8.0*x^4.0+1.0/6.0*x^4.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/12.0*x^4.0+1.0/8.0*x^4.0+1.0/6.0*x^4.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/12.0/5.0*x^5.0+1.0/8.0/5.0*x^5.0+1.0/6.0/5.0*x^5.0-1.0/12.0/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/60.0*x^5.0+1.0/40.0*x^5.0+1.0/30.0*x^5.0-1.0/60.0*x^5.0-2.0833333333333335*x^4.0";
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
        
        public static void TestCaseDiff80015() {
        //Test Case 80015
        UsageCalculus.TestCase = 80015;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(3*y) + (3*y) + (3*y) - (2)*x- 25*(2)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "y";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "3.0*y+3.0*y+3.0*y-x*2.0-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "3.0+3.0+3.0-x*2.0*0.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "3.0+3.0+3.0-x*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="3.0*y+3.0*y+3.0*y-x*2.0-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="3.0/2.0*y^2.0+3.0/2.0*y^2.0+3.0/2.0*y^2.0-x*2.0*y";
        UsageCalculus.EqnSolArrayMap4[1]="1.5*y^2.0+1.5*y^2.0+1.5*y^2.0-x*2.0*y";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "3.0+3.0+3.0-x*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "0.0+3.0*0.0+3.0*0.0-x*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-x*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.5*y^2.0+1.5*y^2.0+1.5*y^2.0-x*2.0*y";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.5/3.0*y^3.0+1.5/3.0*y^3.0+1.5/3.0*y^3.0-x*y^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/2.0*y^3.0+1.0/2.0*y^3.0+0.5*y^3.0-x*y^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-x*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-x*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-x*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/2.0*y^3.0+1.0/2.0*y^3.0+0.5*y^3.0-x*y^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/2.0/4.0*y^4.0+1.0/2.0/4.0*y^4.0+0.5/4.0*y^4.0-x/3.0*y^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/8.0*y^4.0+1.0/8.0*y^4.0+0.125*y^4.0-x/3.0*y^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-x*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-x*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-x*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/8.0*y^4.0+1.0/8.0*y^4.0+0.125*y^4.0-x/3.0*y^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/8.0/5.0*y^5.0+1.0/8.0/5.0*y^5.0+0.125/5.0*y^5.0-x/3.0/4.0*y^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/40.0*y^5.0+1.0/40.0*y^5.0+0.025*y^5.0-x/12.0*y^4.0";
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
        
        public static void TestCaseDiff80016() {
        //Test Case 80016
        UsageCalculus.TestCase = 80016;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(x^2) + (x^2) + (x^2) - (2/1*x^2 /1)*x- 25*(2)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^2.0+x^2.0+x^2.0-2.0*x^3.0-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "2.0*x^1.0+2.0*x^1.0+2.0*x^1.0-2.0*3.0*x^2.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "2.0*x+2.0*x+2.0*x-6.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[1] = "x^2.0+x^2.0+x^2.0-2.0*x^3.0-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/3.0*x^3.0+1.0/3.0*x^3.0+1.0/3.0*x^3.0-2.0/4.0*x^4.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/3.0*x^3.0+1.0/3.0*x^3.0+1.0/3.0*x^3.0-1.0/2.0*x^4.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "2.0*x+2.0*x+2.0*x-6.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "2.0+2.0+2.0-6.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[2] = "2.0+2.0+2.0-12.0*x";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/3.0*x^3.0+1.0/3.0*x^3.0+1.0/3.0*x^3.0-1.0/2.0*x^4.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/3.0/4.0*x^4.0+1.0/3.0/4.0*x^4.0+1.0/3.0/4.0*x^4.0-1.0/2.0/5.0*x^5.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/12.0*x^4.0+1.0/12.0*x^4.0+1.0/12.0*x^4.0-1.0/10.0*x^5.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "2.0+2.0+2.0-12.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "0.0+2.0*0.0+2.0*0.0-12.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-12.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/12.0*x^4.0+1.0/12.0*x^4.0+1.0/12.0*x^4.0-1.0/10.0*x^5.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/12.0/5.0*x^5.0+1.0/12.0/5.0*x^5.0+1.0/12.0/5.0*x^5.0-1.0/10.0/6.0*x^6.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/60.0*x^5.0+1.0/60.0*x^5.0+1.0/60.0*x^5.0-1.0/60.0*x^6.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-12.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-4.0";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/60.0*x^5.0+1.0/60.0*x^5.0+1.0/60.0*x^5.0-1.0/60.0*x^6.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/60.0/6.0*x^6.0+1.0/60.0/6.0*x^6.0+1.0/60.0/6.0*x^6.0-1.0/60.0/7.0*x^7.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/360.0*x^6.0+1.0/360.0*x^6.0+1.0/360.0*x^6.0-1.0/420.0*x^7.0-2.0833333333333335*x^4.0";
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
        public static void TestCaseDiff80017() {
        //Test Case 80017
        UsageCalculus.TestCase = 80017;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(y^3) + (y^3) + (y^3) - 2/1/1*(y^3)- 25*(2)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "y";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "y^3.0+y^3.0+y^3.0-2.0*y^3.0-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "3.0*y^2.0+3.0*y^2.0+3.0*y^2.0-2.0*3.0*y^2.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "3.0*y^2.0+3.0*y^2.0+3.0*y^2.0-6.0*y^2.0";
        UsageCalculus.EqnSolArrayMap3[1] = "y^3.0+y^3.0+y^3.0-2.0*y^3.0-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/4.0*y^4.0+1.0/4.0*y^4.0+1.0/4.0*y^4.0-2.0/4.0*y^4.0-50.0*y";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/4.0*y^4.0+1.0/4.0*y^4.0+1.0/4.0*y^4.0-1.0/2.0*y^4.0-50.0*y";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "3.0*y^2.0+3.0*y^2.0+3.0*y^2.0-6.0*y^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "3.0*2.0*y^1.0+3.0*2.0*y^1.0+3.0*2.0*y^1.0-6.0*2.0*y^1.0";
        UsageCalculus.EqnSolArrayMap2[2] = "6.0*y+6.0*y+6.0*y-12.0*y";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/4.0*y^4.0+1.0/4.0*y^4.0+1.0/4.0*y^4.0-1.0/2.0*y^4.0-50.0*y";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/4.0/5.0*y^5.0+1.0/4.0/5.0*y^5.0+1.0/4.0/5.0*y^5.0-1.0/2.0/5.0*y^5.0-50.0/2.0*y^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/20.0*y^5.0+1.0/20.0*y^5.0+1.0/20.0*y^5.0-1.0/10.0*y^5.0-25.0*y^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "6.0*y+6.0*y+6.0*y-12.0*y";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "6.0+6.0+6.0-12.0";
        UsageCalculus.EqnSolArrayMap2[3] = "6.0+6.0+6.0-12.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/20.0*y^5.0+1.0/20.0*y^5.0+1.0/20.0*y^5.0-1.0/10.0*y^5.0-25.0*y^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/20.0/6.0*y^6.0+1.0/20.0/6.0*y^6.0+1.0/20.0/6.0*y^6.0-1.0/10.0/6.0*y^6.0-25.0/3.0*y^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/120.0*y^6.0+1.0/120.0*y^6.0+1.0/120.0*y^6.0-1.0/60.0*y^6.0-8.333333333333334*y^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "6.0+6.0+6.0-12.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "0.0+6.0*0.0+6.0*0.0-12.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/120.0*y^6.0+1.0/120.0*y^6.0+1.0/120.0*y^6.0-1.0/60.0*y^6.0-8.333333333333334*y^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/120.0/7.0*y^7.0+1.0/120.0/7.0*y^7.0+1.0/120.0/7.0*y^7.0-1.0/60.0/7.0*y^7.0-8.333333333333334/4.0*y^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/840.0*y^7.0+1.0/840.0*y^7.0+1.0/840.0*y^7.0-1.0/420.0*y^7.0-2.0833333333333335*y^4.0";
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
        public static void TestCaseDiff80018() {
        //Test Case 80018
        UsageCalculus.TestCase = 80018;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^(2)+x^(2)-x^(2)-25*2*(3)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 4;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^2.0+x^2.0-x^2.0-150.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "2.0*x^1.0+2.0*x^1.0-2.0*x^1.0-150.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "2.0*x+2.0*x-2.0*x";
        UsageCalculus.EqnSolArrayMap3[1] = "x^2.0+x^2.0-x^2.0-150.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/3.0*x^3.0+1.0/3.0*x^3.0-1.0/3.0*x^3.0-150.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/3.0*x^3.0+1.0/3.0*x^3.0-1.0/3.0*x^3.0-150.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "2.0*x+2.0*x-2.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "2.0+2.0-2.0";
        UsageCalculus.EqnSolArrayMap2[2] = "2.0+2.0-2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/3.0*x^3.0+1.0/3.0*x^3.0-1.0/3.0*x^3.0-150.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/3.0/4.0*x^4.0+1.0/3.0/4.0*x^4.0-1.0/3.0/4.0*x^4.0-150.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/12.0*x^4.0+1.0/12.0*x^4.0-1.0/12.0*x^4.0-75.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "2.0+2.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "0.0+2.0*0.0-2.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/12.0*x^4.0+1.0/12.0*x^4.0-1.0/12.0*x^4.0-75.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/12.0/5.0*x^5.0+1.0/12.0/5.0*x^5.0-1.0/12.0/5.0*x^5.0-75.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/60.0*x^5.0+1.0/60.0*x^5.0-1.0/60.0*x^5.0-25.0*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/60.0*x^5.0+1.0/60.0*x^5.0-1.0/60.0*x^5.0-25.0*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/60.0/6.0*x^6.0+1.0/60.0/6.0*x^6.0-1.0/60.0/6.0*x^6.0-25.0/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/360.0*x^6.0+1.0/360.0*x^6.0-1.0/360.0*x^6.0-6.25*x^4.0";
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
        public static void TestCaseDiff80019() {
        //Test Case 80019
        UsageCalculus.TestCase = 80019;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "y^(2)+y^(2)-y^(2)-25*2*(3)";
        UsageCalculus.TestCaseName = "Simple: Variables:3 Letter :Coefficients:+1:MAP";
        UsageCalculus.TestCaseMatrixID="Coefficients:+1:3 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "y";
        UsageCalculus.MaxDiffOrder = 4;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "y^2.0+y^2.0-y^2.0-150.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "2.0*y^1.0+2.0*y^1.0-2.0*y^1.0-150.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "2.0*y+2.0*y-2.0*y";
        UsageCalculus.EqnSolArrayMap3[1]="y^2.0+y^2.0-y^2.0-150.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/3.0*y^3.0+1.0/3.0*y^3.0-1.0/3.0*y^3.0-150.0*y";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/3.0*y^3.0+1.0/3.0*y^3.0-1.0/3.0*y^3.0-150.0*y";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "2.0*y+2.0*y-2.0*y";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "2.0+2.0-2.0";
        UsageCalculus.EqnSolArrayMap2[2] = "2.0+2.0-2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/3.0*y^3.0+1.0/3.0*y^3.0-1.0/3.0*y^3.0-150.0*y";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/3.0/4.0*y^4.0+1.0/3.0/4.0*y^4.0-1.0/3.0/4.0*y^4.0-150.0/2.0*y^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/12.0*y^4.0+1.0/12.0*y^4.0-1.0/12.0*y^4.0-75.0*y^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "2.0+2.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "0.0+2.0*0.0-2.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/12.0*y^4.0+1.0/12.0*y^4.0-1.0/12.0*y^4.0-75.0*y^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/12.0/5.0*y^5.0+1.0/12.0/5.0*y^5.0-1.0/12.0/5.0*y^5.0-75.0/3.0*y^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/60.0*y^5.0+1.0/60.0*y^5.0-1.0/60.0*y^5.0-25.0*y^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/60.0*y^5.0+1.0/60.0*y^5.0-1.0/60.0*y^5.0-25.0*y^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/60.0/6.0*y^6.0+1.0/60.0/6.0*y^6.0-1.0/60.0/6.0*y^6.0-25.0/4.0*y^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/360.0*y^6.0+1.0/360.0*y^6.0-1.0/360.0*y^6.0-6.25*y^4.0";
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
    
    
        /* ***************Parenthesis Test Case***************** */
        /* ******************* Constants, Variable, Ind Constant ********************* */
        /* **************************************** */
    public static void TestCaseDiff80020() {
        //Test Case 80020
        UsageCalculus.TestCase = 80020;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8 + x^5 + x^4 - 2*x- 25*(2)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^8.0+x^5.0+x^4.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="x^8.0+x^5.0+x^4.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/9.0*x^9.0+1.0/6.0*x^6.0+0.2*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/9.0*x^9.0+1.0/6.0*x^6.0+0.2*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/9.0/10.0*x^10.0+1.0/6.0/7.0*x^7.0+0.2/6.0*x^6.0-1.0/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/90.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*x^5.0+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/90.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/90.0/11.0*x^11.0+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-1.0/3.0/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/990.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*x^4.0+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/990.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/990.0/12.0*x^12.0+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/12.0/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/11880.0*x^12.0+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0-1.0/60.0*x^5.0-2.0833333333333335*x^4.0";
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
    public static void TestCaseDiff80021() {
        //Test Case 80021
        UsageCalculus.TestCase = 80021;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(x)/5";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 3;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/5.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/5.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0/5.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/5.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/5.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/10.0*x^2.0";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0/5.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/10.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/10.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/30.0*x^3.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/30.0*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/30.0/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/120.0*x^4.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/120.0*x^4.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/120.0/5.0*x^5.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/600.0*x^5.0";
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
        public static void TestCaseDiff80022() {
        //Test Case 80022
        UsageCalculus.TestCase = 80022;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(6) + x^5 + x^4 - 2*x*(7)- 1.0*(3*10)*25";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "6.0*x^8.0+x^5.0+x^4.0-14.0*x-750.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "6.0*8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "48.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0";
        UsageCalculus.EqnSolArrayMap3[1]="6.0*x^8.0+x^5.0+x^4.0-14.0*x-750.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="6.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-14.0/2.0*x^2.0-750.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1.5*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-7.0*x^2.0-750.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "48.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "48.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "336.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/1.5*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-7.0*x^2.0-750.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/1.5/10.0*x^10.0+1.0/6.0/7.0*x^7.0+1.0/5.0/6.0*x^6.0-7.0/3.0*x^3.0-750.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/15.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-2.3333333333333335*x^3.0-375.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "336.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "336.0*6.0*x^5.0+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "2016.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/15.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-2.3333333333333335*x^3.0-375.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/15.0/11.0*x^11.0+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-2.3333333333333335/4.0*x^4.0-375.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/165.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/1.7142857142857142*x^4.0-125.0*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "2016.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "2016.0*5.0*x^4.0+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "10080.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/165.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/1.7142857142857142*x^4.0-125.0*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/165.0/12.0*x^12.0+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/1.7142857142857142/5.0*x^5.0-125.0/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/1980.0*x^12.0+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0-1.0/8.571428571428571*x^5.0-31.25*x^4.0";
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
        public static void TestCaseDiff80023() {
        //Test Case 80023
        UsageCalculus.TestCase = 80023;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(2*4) + x^5*(2*3) + x^4 - x*(2/1)- 25*(2)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "8.0*x^8.0+6.0*x^5.0+x^4.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*8.0*x^7.0+6.0*5.0*x^4.0+4.0*x^3.0-2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "64.0*x^7.0+30.0*x^4.0+4.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1] = "8.0*x^8.0+6.0*x^5.0+x^4.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="8.0/9.0*x^9.0+6.0/6.0*x^6.0+1.0/5.0*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1.125*x^9.0+x^6.0+0.2*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "64.0*x^7.0+30.0*x^4.0+4.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "64.0*7.0*x^6.0+30.0*4.0*x^3.0+4.0*3.0*x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "448.0*x^6.0+120.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="0.8888888888888888*x^9.0+x^6.0+0.2*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="0.8888888888888888/10.0*x^10.0+1.0/7.0*x^7.0+0.2/6.0*x^6.0-1.0/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/11.25*x^10.0+1.0/7.0*x^7.0+1.0/30.0*x^6.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "448.0*x^6.0+120.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "448.0*6.0*x^5.0+120.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "2688.0*x^5.0+360.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/11.25*x^10.0+1.0/7.0*x^7.0+1.0/30.0*x^6.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/11.25/11.0*x^11.0+1.0/7.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-1.0/3.0/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/123.75*x^11.0+1.0/56.0*x^8.0+1.0/210.0*x^7.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "2688.0*x^5.0+360.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "2688.0*5.0*x^4.0+360.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "13440.0*x^4.0+720.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/123.75*x^11.0+1.0/56.0*x^8.0+1.0/210.0*x^7.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/123.75/12.0*x^12.0+1.0/56.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/12.0/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/1485.0*x^12.0+1.0/504.0*x^9.0+1.0/1680.0*x^8.0-1.0/60.0*x^5.0-2.0833333333333335*x^4.0";
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
         public static void TestCaseDiff80024() {
        //Test Case 80024
        UsageCalculus.TestCase = 80024;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(6)*x^8 + x^5 + x^4 - 2*x*(7)- 3*25*(9)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "6.0*x^8.0+x^5.0+x^4.0-14.0*x-675.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "6.0*8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "48.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0";
        UsageCalculus.EqnSolArrayMap3[1]="6.0*x^8.0+x^5.0+x^4.0-14.0*x-675.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="6.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-14.0/2.0*x^2.0-675.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1.5*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-7.0*x^2.0-675.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "48.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "48.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "336.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/1.5*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-7.0*x^2.0-675.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/1.5/10.0*x^10.0+1.0/6.0/7.0*x^7.0+1.0/5.0/6.0*x^6.0-7.0/3.0*x^3.0-675.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/15.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-2.3333333333333335*x^3.0-337.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "336.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "336.0*6.0*x^5.0+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "2016.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/15.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-2.3333333333333335*x^3.0-337.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/15.0/11.0*x^11.0+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-2.3333333333333335/4.0*x^4.0-337.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/165.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/1.7142857142857142*x^4.0-112.5*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "2016.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "2016.0*5.0*x^4.0+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "10080.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/165.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/1.7142857142857142*x^4.0-112.5*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/165.0/12.0*x^12.0+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/1.7142857142857142/5.0*x^5.0-112.5/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/1980.0*x^12.0+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0-1.0/8.571428571428571*x^5.0-28.125*x^4.0";
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
        public static void TestCaseDiff80025() {
        //Test Case 80025
        UsageCalculus.TestCase = 80025;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(6) + x^5 + x^4 - 2*x*(7)- 1.0*(3*9)*25";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "6.0*x^8.0+x^5.0+x^4.0-14.0*x-675.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "6.0*8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "48.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0";
        UsageCalculus.EqnSolArrayMap3[1]="6.0*x^8.0+x^5.0+x^4.0-14.0*x-675.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="6.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-14.0/2.0*x^2.0-675.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1.5*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-7.0*x^2.0-675.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "48.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "48.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "336.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/1.5*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-7.0*x^2.0-675.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/1.5/10.0*x^10.0+1.0/6.0/7.0*x^7.0+1.0/5.0/6.0*x^6.0-7.0/3.0*x^3.0-675.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/15.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-2.3333333333333335*x^3.0-337.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "336.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "336.0*6.0*x^5.0+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "2016.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/15.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-2.3333333333333335*x^3.0-337.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/15.0/11.0*x^11.0+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-2.3333333333333335/4.0*x^4.0-337.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/165.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/1.7142857142857142*x^4.0-112.5*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "2016.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "2016.0*5.0*x^4.0+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "10080.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/165.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/1.7142857142857142*x^4.0-112.5*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/165.0/12.0*x^12.0+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/1.7142857142857142/5.0*x^5.0-112.5/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/1980.0*x^12.0+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0-1.0/8.571428571428571*x^5.0-28.125*x^4.0";
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
      public static void TestCaseDiff80026() {
        //Test Case 80026
        UsageCalculus.TestCase = 80026;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(6)*x^8 + x^5 + x^4 - 1.0*(2)*x*(7)- 1.0*(3)*25*(9)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "6.0*x^8.0+x^5.0+x^4.0-14.0*x-675.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "6.0*8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "48.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0";
        UsageCalculus.EqnSolArrayMap3[1]="6.0*x^8.0+x^5.0+x^4.0-14.0*x-675.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="6.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-14.0/2.0*x^2.0-675.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1.5*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-7.0*x^2.0-675.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "48.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "48.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "336.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/1.5*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-7.0*x^2.0-675.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/1.5/10.0*x^10.0+1.0/6.0/7.0*x^7.0+1.0/5.0/6.0*x^6.0-7.0/3.0*x^3.0-675.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/15.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-2.3333333333333335*x^3.0-337.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "336.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "336.0*6.0*x^5.0+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "2016.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/15.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-2.3333333333333335*x^3.0-337.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/15.0/11.0*x^11.0+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-2.3333333333333335/4.0*x^4.0-337.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/165.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/1.7142857142857142*x^4.0-112.5*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "2016.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "2016.0*5.0*x^4.0+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "10080.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/165.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/1.7142857142857142*x^4.0-112.5*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/165.0/12.0*x^12.0+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/1.7142857142857142/5.0*x^5.0-112.5/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/1980.0*x^12.0+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0-1.0/8.571428571428571*x^5.0-28.125*x^4.0";
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
      
        public static void TestCaseDiff80027() {
        //Test Case 80027
        UsageCalculus.TestCase = 80027;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8/x*(5*2) + x^5/x + x^4/x - 1.0*x*5/5*(2)- 1.0*(2)*25*(2)/2";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "10.0*x^7.0+x^4.0+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "10.0*7.0*x^6.0+4.0*x^3.0+3.0*x^2.0-2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "70.0*x^6.0+4.0*x^3.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="10.0*x^7.0+x^4.0+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="10.0/8.0*x^8.0+1.0/5.0*x^5.0+1.0/4.0*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.25*x^8.0+1.0/5.0*x^5.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "70.0*x^6.0+4.0*x^3.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "70.0*6.0*x^5.0+4.0*3.0*x^2.0+3.0*2.0*x^1.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "420.0*x^5.0+12.0*x^2.0+6.0*x";
        UsageCalculus.EqnSolArrayMap3[2]="1.25*x^8.0+1.0/5.0*x^5.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.25/9.0*x^9.0+1.0/5.0/6.0*x^6.0+0.25/5.0*x^5.0-1.0/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/7.2*x^9.0+1.0/30.0*x^6.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "420.0*x^5.0+12.0*x^2.0+6.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "420.0*5.0*x^4.0+12.0*2.0*x^1.0+6.0";
        UsageCalculus.EqnSolArrayMap2[3] = "2100.0*x^4.0+24.0*x+6.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/7.2*x^9.0+1.0/30.0*x^6.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/7.2/10.0*x^10.0+1.0/30.0/7.0*x^7.0+1.0/20.0/6.0*x^6.0-1.0/3.0/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/72.0*x^10.0+1.0/210.0*x^7.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "2100.0*x^4.0+24.0*x+6.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "2100.0*4.0*x^3.0+24.0+0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "8400.0*x^3.0+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/72.0*x^10.0+1.0/210.0*x^7.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/72.0/11.0*x^11.0+1.0/210.0/8.0*x^8.0+1.0/120.0/7.0*x^7.0-1.0/12.0/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/792.0*x^11.0+1.0/1680.0*x^8.0+1.0/840.0*x^7.0-1.0/60.0*x^5.0-2.0833333333333335*x^4.0";
        
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
        public static void TestCaseDiff80028() {
        //Test Case 80028
        UsageCalculus.TestCase = 80028;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8 + sin(x) + x^5 + x^4 - x- 25";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Coefficients:0.0:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^8.0+sin(x)+x^5.0+x^4.0-x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*x^7.0+1.0*cos(x)+5.0*x^4.0+4.0*x^3.0-1.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*x^7.0+cos(x)+5.0*x^4.0+4.0*x^3.0-1.0";
        UsageCalculus.EqnSolArrayMap3[1]="x^8.0+sin(x)+x^5.0+x^4.0-x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/9.0*x^9.0-cos(x)+1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="0.1111111111111111*x^9.0-cos(x)+1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*x^7.0+cos(x)+5.0*x^4.0+4.0*x^3.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*7.0*x^6.0+1.0*-sin(x)+5.0*4.0*x^3.0+4.0*3.0*x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*x^6.0-sin(x)+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="0.1111111111111111*x^9.0-cos(x)+1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="0.1111111111111111/10.0*x^10.0-sin(x)+1.0/6.0/7.0*x^7.0+1.0/5.0/6.0*x^6.0-1.0/2.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="0.01111111111111111*x^10.0-sin(x)+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*x^6.0-sin(x)+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*x^5.0-1.0*cos(x)+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*x^5.0-cos(x)+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="0.01111111111111111*x^10.0-sin(x)+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="0.01111111111111111/11.0*x^11.0-cos(x)+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-1.0/6.0/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="0.0010101010101010099*x^11.0-cos(x)+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*x^5.0-cos(x)+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*x^4.0-1.0*-sin(x)+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*x^4.0+sin(x)+120.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="0.0010101010101010099*x^11.0-cos(x)+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="0.0010101010101010099/12.0*x^12.0-sin(x)+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/24.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="8.417508417508415E-5*x^12.0-sin(x)+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0-1.0/120.0*x^5.0-1.0416666666666667*x^4.0";
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
        // Parenthesis Test Case
        public static void TestCaseDiff80029() {
        //Test Case 80029
        UsageCalculus.TestCase = 80029;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(7) + x^5*(4*5) + x^4*(3*4) - (2)*x- 25*(1)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "7.0*x^8.0+20.0*x^5.0+12.0*x^4.0-2.0*x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "7.0*8.0*x^7.0+20.0*5.0*x^4.0+12.0*4.0*x^3.0-2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "56.0*x^7.0+100.0*x^4.0+48.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="7.0*x^8.0+20.0*x^5.0+12.0*x^4.0-2.0*x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="7.0/9.0*x^9.0+20.0/6.0*x^6.0+12.0/5.0*x^5.0-x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1.2857142857142858*x^9.0+3.3333333333333335*x^6.0+2.4*x^5.0-x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "56.0*x^7.0+100.0*x^4.0+48.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "56.0*7.0*x^6.0+100.0*4.0*x^3.0+48.0*3.0*x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "392.0*x^6.0+400.0*x^3.0+144.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/1.2857142857142858*x^9.0+3.3333333333333335*x^6.0+2.4*x^5.0-x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/1.2857142857142858/10.0*x^10.0+3.3333333333333335/7.0*x^7.0+2.4/6.0*x^6.0-1.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/12.857142857142858*x^10.0+1.0/2.1*x^7.0+1.0/2.5*x^6.0-1.0/3.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "392.0*x^6.0+400.0*x^3.0+144.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "392.0*6.0*x^5.0+400.0*3.0*x^2.0+144.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "2352.0*x^5.0+1200.0*x^2.0+288.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/12.857142857142858*x^10.0+1.0/2.1*x^7.0+1.0/2.5*x^6.0-1.0/3.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/12.857142857142858/11.0*x^11.0+1.0/2.1/8.0*x^8.0+1.0/2.5/7.0*x^7.0-1.0/3.0/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/141.42857142857144*x^11.0+1.0/16.8*x^8.0+1.0/17.5*x^7.0-1.0/12.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "2352.0*x^5.0+1200.0*x^2.0+288.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "2352.0*5.0*x^4.0+1200.0*2.0*x^1.0+288.0";
        UsageCalculus.EqnSolArrayMap2[4] = "11760.0*x^4.0+2400.0*x+288.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/141.42857142857144*x^11.0+1.0/16.8*x^8.0+1.0/17.5*x^7.0-1.0/12.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/141.42857142857144/12.0*x^12.0+1.0/16.8/9.0*x^9.0+1.0/17.5/8.0*x^8.0-1.0/12.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/1697.1428571428573*x^12.0+1.0/151.20000000000002*x^9.0+1.0/140.0*x^8.0-1.0/60.0*x^5.0-1.0416666666666667*x^4.0";
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
        public static void TestCaseDiff80030() {
        //Test Case 80030
        UsageCalculus.TestCase = 80030;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(5*3+2) + x^5 + x^4 - 2*x*5- 2*(25*2)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 2;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "17.0*x^8.0+x^5.0+x^4.0-10.0*x-100.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "17.0*8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-10.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "136.0*x^7.0+5.0*x^4.0+4.0*x^3.0-10.0";
        UsageCalculus.EqnSolArrayMap3[1]="17.0*x^8.0+x^5.0+x^4.0-10.0*x-100.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="17.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-10.0/2.0*x^2.0-100.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.8888888888888888*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-5.0*x^2.0-100.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="1.8888888888888888*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-5.0*x^2.0-100.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.8888888888888888/10.0*x^10.0+1.0/6.0/7.0*x^7.0+1.0/5.0/6.0*x^6.0-5.0/3.0*x^3.0-100.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/5.294117647058823*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.6666666666666667*x^3.0-50.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/5.294117647058823*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.6666666666666667*x^3.0-50.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/5.294117647058823/11.0*x^11.0+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-1.6666666666666667/4.0*x^4.0-50.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/58.23529411764706*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/2.4*x^4.0-16.666666666666668*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/58.23529411764706*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/2.4*x^4.0-16.666666666666668*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/58.23529411764706/12.0*x^12.0+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/2.4/5.0*x^5.0-16.666666666666668/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/698.8235294117646*x^12.0+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0-1.0/12.0*x^5.0-4.166666666666667*x^4.0";
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
        public static void TestCaseDiff80031() {
        //Test Case 80031
        UsageCalculus.TestCase = 80031;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8/x*(5*3) + x^5/x + x^4/x - (2)*x*5/5- (2)*25*(2)/2";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "15.0*x^7.0+x^4.0+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "15.0*7.0*x^6.0+4.0*x^3.0+3.0*x^2.0-2.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "105.0*x^6.0+4.0*x^3.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="15.0*x^7.0+x^4.0+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="15.0/8.0*x^8.0+1.0/5.0*x^5.0+1.0/4.0*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.875*x^8.0+1.0/5.0*x^5.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "105.0*x^6.0+4.0*x^3.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "105.0*6.0*x^5.0+4.0*3.0*x^2.0+3.0*2.0*x^1.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "630.0*x^5.0+12.0*x^2.0+6.0*x";
        UsageCalculus.EqnSolArrayMap3[2]="1.875*x^8.0+1.0/5.0*x^5.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.875/9.0*x^9.0+1.0/5.0/6.0*x^6.0+0.25/5.0*x^5.0-1.0/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/4.8*x^9.0+1.0/30.0*x^6.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "630.0*x^5.0+12.0*x^2.0+6.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "630.0*5.0*x^4.0+12.0*2.0*x^1.0+6.0";
        UsageCalculus.EqnSolArrayMap2[3] = "3150.0*x^4.0+24.0*x+6.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/4.8*x^9.0+1.0/30.0*x^6.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/4.8/10.0*x^10.0+1.0/30.0/7.0*x^7.0+1.0/20.0/6.0*x^6.0-1.0/3.0/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/48.0*x^10.0+1.0/210.0*x^7.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "3150.0*x^4.0+24.0*x+6.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "3150.0*4.0*x^3.0+24.0+0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "12600.0*x^3.0+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/48.0*x^10.0+1.0/210.0*x^7.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/48.0/11.0*x^11.0+1.0/210.0/8.0*x^8.0+1.0/120.0/7.0*x^7.0-1.0/12.0/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/528.0*x^11.0+1.0/1680.0*x^8.0+1.0/840.0*x^7.0-1.0/60.0*x^5.0-2.0833333333333335*x^4.0";
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
    public static void TestCaseDiff80032() {
        //Test Case 80032
        UsageCalculus.TestCase = 80032;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1*+1/xyc - 1*+1/25";
        UsageCalculus.TestCaseName = "Simple: Variables:3 Letter :Coefficients:+1";
        UsageCalculus.TestCaseMatrixID="Coefficients:+1:3 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/xyc-1.0/25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-1.0/xyc^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-1.0/xyc^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/xyc-1.0/25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="ln(xyc)-1.0/25.0*xyc";
        UsageCalculus.EqnSolArrayMap4[1]="ln(xyc)-1.0/25.0*xyc";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-1.0/xyc^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "2.0/xyc^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "2.0/xyc^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "2.0/xyc^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "2.0*-3.0/xyc^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-6.0/xyc^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-6.0/xyc^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-6.0*-4.0/xyc^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "24.0/xyc^5.0";
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
    
        public static void TestCaseDiff80033() {
        //Test Case 80033
        UsageCalculus.TestCase = 80033;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8 + (2*4+1)*x^5 + (2*6+1)/x^4 - (2*7+1)/2*x- 25*2/(2*7+1)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^8.0+9.0*x^5.0+13.0/x^4.0-7.5*x-3.3333333333333335";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*x^7.0+9.0*5.0*x^4.0+13.0*-4.0/x^5.0-7.5-3.3333333333333335*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*x^7.0+45.0*x^4.0-52.0/x^5.0-7.5";
        UsageCalculus.EqnSolArrayMap3[1]="x^8.0+9.0*x^5.0+13.0/x^4.0-7.5*x-3.3333333333333335";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/9.0*x^9.0+9.0/6.0*x^6.0+13.0/-3.0/x^3.0-7.5/2.0*x^2.0-3.3333333333333335*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/9.0*x^9.0+1.5*x^6.0-4.333333333333333/x^3.0-3.75*x^2.0-3.3333333333333335*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*x^7.0+45.0*x^4.0-52.0/x^5.0-7.5";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*7.0*x^6.0+45.0*4.0*x^3.0-52.0*-5.0/x^6.0-7.5*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*x^6.0+180.0*x^3.0+260.0/x^6.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/9.0*x^9.0+1.5*x^6.0-4.333333333333333/x^3.0-3.75*x^2.0-3.3333333333333335*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/9.0/10.0*x^10.0+1.5/7.0*x^7.0-4.333333333333333/-2.0/x^2.0-3.75/3.0*x^3.0-3.3333333333333335/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/90.0*x^10.0+1.0/4.666666666666667*x^7.0+2.1666666666666665/x^2.0-1.25*x^3.0-1.6666666666666667*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*x^6.0+180.0*x^3.0+260.0/x^6.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*x^5.0+180.0*3.0*x^2.0+260.0*-6.0/x^7.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*x^5.0+540.0*x^2.0-1560.0/x^7.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/90.0*x^10.0+1.0/4.666666666666667*x^7.0+2.1666666666666665/x^2.0-1.25*x^3.0-1.6666666666666667*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/90.0/11.0*x^11.0+1.0/4.666666666666667/8.0*x^8.0+2.1666666666666665/-1.0/x^1.0-1.25/4.0*x^4.0-1.6666666666666667/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/990.0*x^11.0+1.0/37.333333333333336*x^8.0-2.1666666666666665/x-1.0/3.2*x^4.0-1.0/1.7999999999999998*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*x^5.0+540.0*x^2.0-1560.0/x^7.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*x^4.0+540.0*2.0*x^1.0-1560.0*-7.0/x^8.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*x^4.0+1080.0*x+10920.0/x^8.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/990.0*x^11.0+1.0/37.333333333333336*x^8.0-2.1666666666666665/x-1.0/3.2*x^4.0-1.0/1.7999999999999998*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/990.0/12.0*x^12.0+1.0/37.333333333333336/9.0*x^9.0-2.1666666666666665*ln(x)-1.0/3.2/5.0*x^5.0-1.0/1.7999999999999998/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/11880.0*x^12.0+1.0/336.0*x^9.0-2.1666666666666665*ln(x)-1.0/16.0*x^5.0-1.0/7.199999999999999*x^4.0";
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
                
        public static void TestCaseDiff80035() {
        //Test Case 80035
        UsageCalculus.TestCase = 80035;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8 + (2*x*x)*x^5 + x^4 - (2)*x- 25*(2)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^8.0+2.0*x^7.0+x^4.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*x^7.0+2.0*7.0*x^6.0+4.0*x^3.0-2.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*x^7.0+14.0*x^6.0+4.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="x^8.0+2.0*x^7.0+x^4.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/9.0*x^9.0+2.0/8.0*x^8.0+1.0/5.0*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/9.0*x^9.0+1.0/4.0*x^8.0+0.2*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*x^7.0+14.0*x^6.0+4.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*7.0*x^6.0+14.0*6.0*x^5.0+4.0*3.0*x^2.0-2.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*x^6.0+84.0*x^5.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/9.0*x^9.0+1.0/4.0*x^8.0+0.2*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/9.0/10.0*x^10.0+1.0/4.0/9.0*x^9.0+0.2/6.0*x^6.0-1.0/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/90.0*x^10.0+1.0/36.0*x^9.0+1.0/30.0*x^6.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*x^6.0+84.0*x^5.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*x^5.0+84.0*5.0*x^4.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*x^5.0+420.0*x^4.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/90.0*x^10.0+1.0/36.0*x^9.0+1.0/30.0*x^6.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/90.0/11.0*x^11.0+1.0/36.0/10.0*x^10.0+1.0/30.0/7.0*x^7.0-1.0/3.0/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/990.0*x^11.0+1.0/360.0*x^10.0+1.0/210.0*x^7.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*x^5.0+420.0*x^4.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*x^4.0+420.0*4.0*x^3.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*x^4.0+1680.0*x^3.0+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/990.0*x^11.0+1.0/360.0*x^10.0+1.0/210.0*x^7.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/990.0/12.0*x^12.0+1.0/360.0/11.0*x^11.0+1.0/210.0/8.0*x^8.0-1.0/12.0/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/11880.0*x^12.0+1.0/3960.0*x^11.0+1.0/1680.0*x^8.0-1.0/60.0*x^5.0-2.0833333333333335*x^4.0";
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
        
        public static void TestCaseDiff80036() {
        //Test Case 80036
        UsageCalculus.TestCase = 80036;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(x^2*x * x)*x^8 + (x^2/x*1)*x^5 + x^4 - (2/1*x^2 /1)*x- 25*(2)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^12.0+x^6.0+x^4.0-2.0*x^3.0-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "12.0*x^11.0+6.0*x^5.0+4.0*x^3.0-2.0*3.0*x^2.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "12.0*x^11.0+6.0*x^5.0+4.0*x^3.0-6.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[1] = "x^12.0+x^6.0+x^4.0-2.0*x^3.0-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/13.0*x^13.0+1.0/7.0*x^7.0+1.0/5.0*x^5.0-2.0/4.0*x^4.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/13.0*x^13.0+1.0/7.0*x^7.0+1.0/5.0*x^5.0-1.0/2.0*x^4.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "12.0*x^11.0+6.0*x^5.0+4.0*x^3.0-6.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "12.0*11.0*x^10.0+6.0*5.0*x^4.0+4.0*3.0*x^2.0-6.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[2] = "132.0*x^10.0+30.0*x^4.0+12.0*x^2.0-12.0*x";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/13.0*x^13.0+1.0/7.0*x^7.0+1.0/5.0*x^5.0-1.0/2.0*x^4.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/13.0/14.0*x^14.0+1.0/7.0/8.0*x^8.0+1.0/5.0/6.0*x^6.0-1.0/2.0/5.0*x^5.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/182.0*x^14.0+1.0/56.0*x^8.0+1.0/30.0*x^6.0-1.0/10.0*x^5.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "132.0*x^10.0+30.0*x^4.0+12.0*x^2.0-12.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "132.0*10.0*x^9.0+30.0*4.0*x^3.0+12.0*2.0*x^1.0-12.0";
        UsageCalculus.EqnSolArrayMap2[3] = "1320.0*x^9.0+120.0*x^3.0+24.0*x-12.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/182.0*x^14.0+1.0/56.0*x^8.0+1.0/30.0*x^6.0-1.0/10.0*x^5.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/182.0/15.0*x^15.0+1.0/56.0/9.0*x^9.0+1.0/30.0/7.0*x^7.0-1.0/10.0/6.0*x^6.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/2730.0*x^15.0+1.0/504.0*x^9.0+1.0/210.0*x^7.0-1.0/60.0*x^6.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "1320.0*x^9.0+120.0*x^3.0+24.0*x-12.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "1320.0*9.0*x^8.0+120.0*3.0*x^2.0+24.0-12.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "11880.0*x^8.0+360.0*x^2.0+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/2730.0*x^15.0+1.0/504.0*x^9.0+1.0/210.0*x^7.0-1.0/60.0*x^6.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/2730.0/16.0*x^16.0+1.0/504.0/10.0*x^10.0+1.0/210.0/8.0*x^8.0-1.0/60.0/7.0*x^7.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/43680.0*x^16.0+1.0/5040.0*x^10.0+1.0/1680.0*x^8.0-1.0/420.0*x^7.0-2.0833333333333335*x^4.0";
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
        public static void TestCaseDiff80037() {
        //Test Case 80037
        UsageCalculus.TestCase = 80037;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(x^0*1)*x^8 + (x^1/1)*x^5 + x^4 - (2/1/1)*x- 25*(2)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^8.0+x^6.0+x^4.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*x^7.0+6.0*x^5.0+4.0*x^3.0-2.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*x^7.0+6.0*x^5.0+4.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1] = "x^8.0+x^6.0+x^4.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/9.0*x^9.0+1.0/7.0*x^7.0+1.0/5.0*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/9.0*x^9.0+1.0/7.0*x^7.0+0.2*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*x^7.0+6.0*x^5.0+4.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*7.0*x^6.0+6.0*5.0*x^4.0+4.0*3.0*x^2.0-2.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*x^6.0+30.0*x^4.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/9.0*x^9.0+1.0/7.0*x^7.0+0.2*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/9.0/10.0*x^10.0+1.0/7.0/8.0*x^8.0+0.2/6.0*x^6.0-1.0/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/90.0*x^10.0+1.0/56.0*x^8.0+1.0/30.0*x^6.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*x^6.0+30.0*x^4.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*x^5.0+30.0*4.0*x^3.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*x^5.0+120.0*x^3.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/90.0*x^10.0+1.0/56.0*x^8.0+1.0/30.0*x^6.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/90.0/11.0*x^11.0+1.0/56.0/9.0*x^9.0+1.0/30.0/7.0*x^7.0-1.0/3.0/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/990.0*x^11.0+1.0/504.0*x^9.0+1.0/210.0*x^7.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*x^5.0+120.0*x^3.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*x^4.0+120.0*3.0*x^2.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*x^4.0+360.0*x^2.0+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/990.0*x^11.0+1.0/504.0*x^9.0+1.0/210.0*x^7.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/990.0/12.0*x^12.0+1.0/504.0/10.0*x^10.0+1.0/210.0/8.0*x^8.0-1.0/12.0/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/11880.0*x^12.0+1.0/5040.0*x^10.0+1.0/1680.0*x^8.0-1.0/60.0*x^5.0-2.0833333333333335*x^4.0";
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
        public static void TestCaseDiff80038() {
        //Test Case 80038
        UsageCalculus.TestCase = 80038;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(x^3*x)*x^8 + (x^4*x^2)*x^5 + x^4 - (x^2)*x- 25*(2)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^12.0+x^11.0+x^4.0-x^3.0-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "12.0*x^11.0+11.0*x^10.0+4.0*x^3.0-3.0*x^2.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "12.0*x^11.0+11.0*x^10.0+4.0*x^3.0-3.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[1] = "x^12.0+x^11.0+x^4.0-x^3.0-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/13.0*x^13.0+1.0/12.0*x^12.0+1.0/5.0*x^5.0-1.0/4.0*x^4.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/13.0*x^13.0+1.0/12.0*x^12.0+1.0/5.0*x^5.0-1.0/4.0*x^4.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "12.0*x^11.0+11.0*x^10.0+4.0*x^3.0-3.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "12.0*11.0*x^10.0+11.0*10.0*x^9.0+4.0*3.0*x^2.0-3.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[2] = "132.0*x^10.0+110.0*x^9.0+12.0*x^2.0-6.0*x";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/13.0*x^13.0+1.0/12.0*x^12.0+1.0/5.0*x^5.0-1.0/4.0*x^4.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/13.0/14.0*x^14.0+1.0/12.0/13.0*x^13.0+1.0/5.0/6.0*x^6.0-1.0/4.0/5.0*x^5.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/182.0*x^14.0+1.0/156.0*x^13.0+1.0/30.0*x^6.0-1.0/20.0*x^5.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "132.0*x^10.0+110.0*x^9.0+12.0*x^2.0-6.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "132.0*10.0*x^9.0+110.0*9.0*x^8.0+12.0*2.0*x^1.0-6.0";
        UsageCalculus.EqnSolArrayMap2[3] = "1320.0*x^9.0+990.0*x^8.0+24.0*x-6.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/182.0*x^14.0+1.0/156.0*x^13.0+1.0/30.0*x^6.0-1.0/20.0*x^5.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/182.0/15.0*x^15.0+1.0/156.0/14.0*x^14.0+1.0/30.0/7.0*x^7.0-1.0/20.0/6.0*x^6.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/2730.0*x^15.0+1.0/2184.0*x^14.0+1.0/210.0*x^7.0-1.0/120.0*x^6.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "1320.0*x^9.0+990.0*x^8.0+24.0*x-6.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "1320.0*9.0*x^8.0+990.0*8.0*x^7.0+24.0-6.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "11880.0*x^8.0+7920.0*x^7.0+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/2730.0*x^15.0+1.0/2184.0*x^14.0+1.0/210.0*x^7.0-1.0/120.0*x^6.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/2730.0/16.0*x^16.0+1.0/2184.0/15.0*x^15.0+1.0/210.0/8.0*x^8.0-1.0/120.0/7.0*x^7.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/43680.0*x^16.0+1.0/32760.0*x^15.0+1.0/1680.0*x^8.0-1.0/840.0*x^7.0-2.0833333333333335*x^4.0";
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
        public static void TestCaseDiff80039() {
        //Test Case 80039
        UsageCalculus.TestCase = 80039;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(+1)/xyc^8 + (+1)/xyc^5 + (+1)/xyc^4 - (+1)/xyc - (+1)/25";
        UsageCalculus.TestCaseName = "Simple: Variables:3 Letter :Coefficients:+1:MAP";
        UsageCalculus.TestCaseMatrixID="Coefficients:+1:3 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/xyc^8.0+1.0/xyc^5.0+1.0/xyc^4.0-1.0/xyc-1.0/25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-8.0/xyc^9.0-5.0/xyc^6.0-4.0/xyc^5.0+1.0/xyc^2.0-1.0/25.0*0.0";
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
        public static void TestCaseDiff80040() {
        //Test Case 80040
        UsageCalculus.TestCase = 80040;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(+1.0)/xyc1^8 + (+1.0)/xyc1^5 + (+1.0)/xyc1^4 - (+1.0)/xyc1 - (+1.0)/25";
        UsageCalculus.TestCaseName = "Simple: Variables:3 Letter with Numerics :Co-efficients:+1.0:MAP";
        UsageCalculus.TestCaseMatrixID="Coefficients:+1.0:3 Letter with Numerics:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/xyc1^8.0+1.0/xyc1^5.0+1.0/xyc1^4.0-1.0/xyc1-1.0/25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-8.0/xyc1^9.0-5.0/xyc1^6.0-4.0/xyc1^5.0+1.0/xyc1^2.0-1.0/25.0*0.0";
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
    public static void TestCaseDiff80045() {
        //Test Case 80045
        UsageCalculus.TestCase = 80045;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(6+5*x+a)*4*x*5*x + x^5*x*(7+2*x+a)*2*6*x^2 + x^4*x - (2)*x*(5)/5- (2)*25*(2)/2";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "20.0*x^10.0*(6+5*x+a)+12.0*x^8.0*(7+2*x+a)+x^5.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "20.0*10.0*x^9.0*(6+5*x+a)+20.0*x^10.0*(0.0+5+a*0.0)+12.0*8.0*x^7.0*(7+2*x+a)+12.0*x^8.0*(0.0+2+a*0.0)+5.0*x^4.0-2.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "200.0*x^9.0*(6+5*x+a)+(0.0+5+a*0.0)*20.0*x^10.0+96.0*x^7.0*(7+2*x+a)+(0.0+2+a*0.0)*12.0*x^8.0+5.0*x^4.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="20.0*x^10.0*(6+5*x+a)+12.0*x^8.0*(7+2*x+a)+x^5.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="20.0*x^10.0*6*x+5.0/2.0*x^2.0+a*x-1200.0/11.0*x^11.0+500.0/12.0*x^12.0+a*200.0/11.0*x^11.0+12.0*x^8.0*7*x+x^2.0+a*x-672.0/9.0*x^9.0+96.0/10.0*x^10.0+a*96.0/9.0*x^9.0+1.0/6.0*x^6.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="120.0*x^11.0+2.5*x^2.0+a*x-109.0909090909091*x^11.0+41.666666666666664*x^12.0+a*18.181818181818183*x^11.0+84.0*x^9.0+x^2.0+a*x-74.66666666666667*x^9.0+9.6*x^10.0+a*10.666666666666666*x^9.0+0.16666666666666666*x^6.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "200.0*x^9.0*(6+5*x+a)+(0.0+5+a*0.0)*20.0*x^10.0+96.0*x^7.0*(7+2*x+a)+(0.0+2+a*0.0)*12.0*x^8.0+5.0*x^4.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "200.0*9.0*x^8.0*(6+5*x+a)+200.0*x^9.0*(0.0+5+a*0.0)+(0.0+5+a*0.0)*20.0+96.0*7.0*x^6.0*(7+2*x+a)+96.0*x^7.0*(0.0+2+a*0.0)+(0.0+2+a*0.0)*12.0+5.0*4.0*x^3.0-2.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "1800.0*x^8.0*(6+5*x+a)+(0.0+5+a*0.0)*200.0*x^9.0+(0.0+5+a*0.0)*20.0+672.0*x^6.0*(7+2*x+a)+(0.0+2+a*0.0)*96.0*x^7.0+(0.0+2+a*0.0)*12.0+20.0*x^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "1800.0*x^8.0*(6+5*x+a)+(0.0+5+a*0.0)*200.0*x^9.0+(0.0+5+a*0.0)*20.0+672.0*x^6.0*(7+2*x+a)+(0.0+2+a*0.0)*96.0*x^7.0+(0.0+2+a*0.0)*12.0+20.0*x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "1800.0*8.0*x^7.0*(6+5*x+a)+1800.0*x^8.0*(0.0+5+a*0.0)+(0.0+5+a*0.0)*200.0+(0.0+5+a*0.0)*20.0*0.0+672.0*6.0*x^5.0*(7+2*x+a)+672.0*x^6.0*(0.0+2+a*0.0)+(0.0+2+a*0.0)*96.0+(0.0+2+a*0.0)*12.0*0.0+20.0*3.0*x^2.0";
        UsageCalculus.EqnSolArrayMap2[3] = "14400.0*x^7.0*(6+5*x+a)+(0.0+5+a*0.0)*1800.0*x^8.0+(0.0+5+a*0.0)*200.0+(0.0+5+a*0.0)*0.0+4032.0*x^5.0*(7+2*x+a)+(0.0+2+a*0.0)*672.0*x^6.0+(0.0+2+a*0.0)*96.0+(0.0+2+a*0.0)*0.0+60.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[3]="-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "14400.0*x^7.0*(6+5*x+a)+(0.0+5+a*0.0)*1800.0*x^8.0+(0.0+5+a*0.0)*200.0+(0.0+5+a*0.0)*0.0+4032.0*x^5.0*(7+2*x+a)+(0.0+2+a*0.0)*672.0*x^6.0+(0.0+2+a*0.0)*96.0+(0.0+2+a*0.0)*0.0+60.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "14400.0*7.0*x^6.0*(6+5*x+a)+14400.0*x^7.0*(0.0+5+a*0.0)+(0.0+5+a*0.0)*1800.0+(0.0+5+a*0.0)*200.0*0.0+(0.0+5+a*0.0)*0.0*0.0+4032.0*5.0*x^4.0*(7+2*x+a)+4032.0*x^5.0*(0.0+2+a*0.0)+(0.0+2+a*0.0)*672.0+(0.0+2+a*0.0)*96.0*0.0+(0.0+2+a*0.0)*0.0*0.0+60.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[4] = "100800.0*x^6.0*(6+5*x+a)+(0.0+5+a*0.0)*14400.0*x^7.0+(0.0+5+a*0.0)*1800.0+(0.0+5+a*0.0)*0.0+(0.0+5+a*0.0)*0.0+20160.0*x^4.0*(7+2*x+a)+(0.0+2+a*0.0)*4032.0*x^5.0+(0.0+2+a*0.0)*672.0+(0.0+2+a*0.0)*0.0+(0.0+2+a*0.0)*0.0+120.0*x";
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
  
      public static void TestCaseDiff80046() {
        //Test Case 80046
        UsageCalculus.TestCase = 80046;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(6.0+5.0*x+a)*20.0*9.0*x^8.0+(0.0+5.0+a)*20.0*x^9.0+a+(7.0+2.0*x+a)*12.0*8.0*x^7.0+(0.0+2.0+a)*12.0*x^8.0+a+5.0*x^4.0-2.0-0.0";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "180.0*x^8.0*(6.0+5.0*x+a)+20.0*x^9.0*(0.0+5.0+a)+a+96.0*x^7.0*(7.0+2.0*x+a)+12.0*x^8.0*(0.0+2.0+a)+a+5.0*x^4.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "5.0*8.0*x^7.0+4.0*x^3.0+3.0*x^2.0-2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "40.0*x^7.0+4.0*x^3.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="180.0*x^8.0*(6.0+5.0*x+a)+20.0*x^9.0*(0.0+5.0+a)+a+96.0*x^7.0*(7.0+2.0*x+a)+12.0*x^8.0*(0.0+2.0+a)+a+5.0*x^4.0-2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
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
      public static void TestCaseDiff80047() {
        //Test Case 80047
        UsageCalculus.TestCase = 80047;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(6) + x^5 + x^4 - (2)*x*(7)- (3)*25*(9)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "6.0*x^8.0+x^5.0+x^4.0-14.0*x-675.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "6.0*8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "48.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0";
        UsageCalculus.EqnSolArrayMap3[1]="6.0*x^8.0+x^5.0+x^4.0-14.0*x-675.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="6.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-14.0/2.0*x^2.0-675.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1.5*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-7.0*x^2.0-675.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "48.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "48.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "336.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/1.5*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-7.0*x^2.0-675.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/1.5/10.0*x^10.0+1.0/6.0/7.0*x^7.0+1.0/5.0/6.0*x^6.0-7.0/3.0*x^3.0-675.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/15.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-2.3333333333333335*x^3.0-337.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "336.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "336.0*6.0*x^5.0+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "2016.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/15.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-2.3333333333333335*x^3.0-337.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/15.0/11.0*x^11.0+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-2.3333333333333335/4.0*x^4.0-337.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/165.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/1.7142857142857142*x^4.0-112.5*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "2016.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "2016.0*5.0*x^4.0+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "10080.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/165.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/1.7142857142857142*x^4.0-112.5*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/165.0/12.0*x^12.0+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/1.7142857142857142/5.0*x^5.0-112.5/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/1980.0*x^12.0+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0-1.0/8.571428571428571*x^5.0-28.125*x^4.0";
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
      /* **************************************** */
      /* ******************* Expressions ********************* */
      /* **************************************** */
    public static void TestCaseDiff80048() {
        //Test Case 80048
        UsageCalculus.TestCase = 80048;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(2.0/2.0) + x^5/(2.0/2.0) + x^4*(2.0/2.0) - 2*x- 25*(2)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^8.0+x^5.0+x^4.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="x^8.0+x^5.0+x^4.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/9.0*x^9.0+1.0/6.0*x^6.0+0.2*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/9.0*x^9.0+1.0/6.0*x^6.0+0.2*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/9.0/10.0*x^10.0+1.0/6.0/7.0*x^7.0+0.2/6.0*x^6.0-1.0/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/90.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*x^5.0+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/90.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/90.0/11.0*x^11.0+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-1.0/3.0/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/990.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*x^4.0+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/990.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/990.0/12.0*x^12.0+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/12.0/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/11880.0*x^12.0+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0-1.0/60.0*x^5.0-2.0833333333333335*x^4.0";
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
    public static void TestCaseDiff80049() {
        //Test Case 80049
        UsageCalculus.TestCase = 80049;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(x*25)/5";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "5.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "5.0";
        UsageCalculus.EqnSolArrayMap2[1] = "5.0";
        UsageCalculus.EqnSolArrayMap3[1]="5.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="5.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[1]="2.5*x^2.0";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "5.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="2.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="2.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/1.2*x^3.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/1.2*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/1.2/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/4.8*x^4.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/4.8*x^4.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/4.8/5.0*x^5.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/24.0*x^5.0";
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
        public static void TestCaseDiff80050() {
        //Test Case 80050
        UsageCalculus.TestCase = 80050;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(4) + x^5 + x^4 - (3)*x*(7)- (3*7)*25/(7*3)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "4.0*x^8.0+x^5.0+x^4.0-21.0*x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "4.0*8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-21.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "32.0*x^7.0+5.0*x^4.0+4.0*x^3.0-21.0";
        UsageCalculus.EqnSolArrayMap3[1]="4.0*x^8.0+x^5.0+x^4.0-21.0*x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="4.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-21.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/2.25*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-10.5*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "32.0*x^7.0+5.0*x^4.0+4.0*x^3.0-21.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "32.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0-21.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "224.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/2.25*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-10.5*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/2.25/10.0*x^10.0+1.0/6.0/7.0*x^7.0+1.0/5.0/6.0*x^6.0-10.5/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/22.5*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-3.5*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "224.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "224.0*6.0*x^5.0+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "1344.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/22.5*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-3.5*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/22.5/11.0*x^11.0+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-3.5/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/247.5*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/1.1428571428571428*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "1344.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "1344.0*5.0*x^4.0+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "6720.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/247.5*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/1.1428571428571428*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/247.5/12.0*x^12.0+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/1.1428571428571428/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/2970.0*x^12.0+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0-1.0/5.7142857142857135*x^5.0-1.0416666666666667*x^4.0";
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
        public static void TestCaseDiff80051() {
        //Test Case 80051
        UsageCalculus.TestCase = 80051;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(2*4)*x^8 + (2*5)*x^5 + x^4 - (2/1.0)*x- 25*(2)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "8.0*x^8.0+10.0*x^5.0+x^4.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*8.0*x^7.0+10.0*5.0*x^4.0+4.0*x^3.0-2.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "64.0*x^7.0+50.0*x^4.0+4.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1] = "8.0*x^8.0+10.0*x^5.0+x^4.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="8.0/9.0*x^9.0+10.0/6.0*x^6.0+1.0/5.0*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1.125*x^9.0+1.6666666666666667*x^6.0+0.2*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "64.0*x^7.0+50.0*x^4.0+4.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "64.0*7.0*x^6.0+50.0*4.0*x^3.0+4.0*3.0*x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "448.0*x^6.0+200.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/1.125*x^9.0+1.6666666666666667*x^6.0+0.2*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/1.125/10.0*x^10.0+1.6666666666666667/7.0*x^7.0+0.2/6.0*x^6.0-1.0/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/11.25*x^10.0+1.0/4.2*x^7.0+1.0/30.0*x^6.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "448.0*x^6.0+200.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "448.0*6.0*x^5.0+200.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "2688.0*x^5.0+600.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/11.25*x^10.0+1.0/4.2*x^7.0+1.0/30.0*x^6.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/11.25/11.0*x^11.0+1.0/4.2/8.0*x^8.0+1.0/30.0/7.0*x^7.0-1.0/3.0/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/123.75*x^11.0+1.0/33.6*x^8.0+1.0/210.0*x^7.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "2688.0*x^5.0+600.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "2688.0*5.0*x^4.0+600.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "13440.0*x^4.0+1200.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/123.75*x^11.0+1.0/33.6*x^8.0+1.0/210.0*x^7.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/123.75/12.0*x^12.0+1.0/33.6/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/12.0/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/1485.0*x^12.0+1.0/302.40000000000003*x^9.0+1.0/1680.0*x^8.0-1.0/60.0*x^5.0-2.0833333333333335*x^4.0";
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
         public static void TestCaseDiff80052() {
        //Test Case 80052
        UsageCalculus.TestCase = 80052;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*(4)*x^8 + x^5 + x^4 - (2)*x*(7)- (3)*25*(9)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "4.0*x^8.0+x^5.0+x^4.0-14.0*x-675.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "4.0*8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0-675.0*0.";
        UsageCalculus.EqnSolArrayMap2[1] = "32.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0";
        UsageCalculus.EqnSolArrayMap3[1]="4.0*x^8.0+x^5.0+x^4.0-14.0*x-675.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="4.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-14.0/2.0*x^2.0-675.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/2.25*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-7.0*x^2.0-675.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "32.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "32.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0-14.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "224.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/2.25*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-7.0*x^2.0-675.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/2.25/10.0*x^10.0+1.0/6.0/7.0*x^7.0+1.0/5.0/6.0*x^6.0-7.0/3.0*x^3.0-675.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/22.5*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-2.3333333333333335*x^3.0-337.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "224.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "224.0*6.0*x^5.0+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "1344.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/22.5*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-2.3333333333333335*x^3.0-337.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/22.5/11.0*x^11.0+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-2.3333333333333335/4.0*x^4.0-337.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/247.5*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/1.7142857142857142*x^4.0-112.5*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "1344.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "1344.0*5.0*x^4.0+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "6720.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/247.5*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/1.7142857142857142*x^4.0-112.5*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/247.5/12.0*x^12.0+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/1.7142857142857142/5.0*x^5.0-112.5/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/2970.0*x^12.0+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0-1.0/8.571428571428571*x^5.0-28.125*x^4.0";
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
    public static void TestCaseDiff80053() {
        //Test Case 80053
        UsageCalculus.TestCase = 80053;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*x^8*(5+2) + x^5 + x^4 - (2+3)*x*(5)- (2*5)*25*(2-1)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "7.0*x^8.0+x^5.0+x^4.0-25.0*x-250.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "7.0*8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-25.0-250.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "56.0*x^7.0+5.0*x^4.0+4.0*x^3.0-25.0";
        UsageCalculus.EqnSolArrayMap3[1]="7.0*x^8.0+x^5.0+x^4.0-25.0*x-250.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="7.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-25.0/2.0*x^2.0-250.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1.2857142857142858*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-12.5*x^2.0-250.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "56.0*x^7.0+5.0*x^4.0+4.0*x^3.0-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "56.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "392.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/1.2857142857142858*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-12.5*x^2.0-250.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/1.2857142857142858/10.0*x^10.0+1.0/6.0/7.0*x^7.0+1.0/5.0/6.0*x^6.0-12.5/3.0*x^3.0-250.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/12.857142857142858*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-4.166666666666667*x^3.0-125.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "392.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "392.0*6.0*x^5.0+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "2352.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/12.857142857142858*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-4.166666666666667*x^3.0-125.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/12.857142857142858/11.0*x^11.0+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-4.166666666666667/4.0*x^4.0-125.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/141.42857142857144*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0416666666666667*x^4.0-41.666666666666664*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "2352.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "2352.0*5.0*x^4.0+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "11760.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/141.42857142857144*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0416666666666667*x^4.0-41.666666666666664*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/141.42857142857144/12.0*x^12.0+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0416666666666667/5.0*x^5.0-41.666666666666664/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/1697.1428571428573*x^12.0+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0-1.0/4.8*x^5.0-10.416666666666666*x^4.0";
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
        public static void TestCaseDiff80054() {
        //Test Case 80054
        UsageCalculus.TestCase = 80054;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(x-1.0)*(x-1.0)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "5.0*x^9.0+x^5.0+x^4.0-10.0*x-100.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "5.0*9.0*x^8.0+5.0*x^4.0+4.0*x^3.0-10.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "45.0*x^8.0+5.0*x^4.0+4.0*x^3.0-10.0-";
        UsageCalculus.EqnSolArrayMap3[1]="-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
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
        public static void TestCaseDiff80055() {
        //Test Case 80055
        UsageCalculus.TestCase = 80055;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(5*x)/x + x^5/x + x^4/x - (2)*x*5/5- (2)*25*(2)/2";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "5.0*x^8.0+x^4.0+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "5.0*8.0*x^7.0+4.0*x^3.0+3.0*x^2.0-2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "40.0*x^7.0+4.0*x^3.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="5.0*x^8.0+x^4.0+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="5.0/9.0*x^9.0+1.0/5.0*x^5.0+1.0/4.0*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1.8*x^9.0+1.0/5.0*x^5.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "40.0*x^7.0+4.0*x^3.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "40.0*7.0*x^6.0+4.0*3.0*x^2.0+3.0*2.0*x^1.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "280.0*x^6.0+12.0*x^2.0+6.0*x";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/1.8*x^9.0+1.0/5.0*x^5.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/1.8/10.0*x^10.0+1.0/5.0/6.0*x^6.0+0.25/5.0*x^5.0-1.0/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/18.0*x^10.0+1.0/30.0*x^6.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "280.0*x^6.0+12.0*x^2.0+6.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "280.0*6.0*x^5.0+12.0*2.0*x^1.0+6.0";
        UsageCalculus.EqnSolArrayMap2[3] = "1680.0*x^5.0+24.0*x+6.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/18.0*x^10.0+1.0/30.0*x^6.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/18.0/11.0*x^11.0+1.0/30.0/7.0*x^7.0+1.0/20.0/6.0*x^6.0-1.0/3.0/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/198.0*x^11.0+1.0/210.0*x^7.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "1680.0*x^5.0+24.0*x+6.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "1680.0*5.0*x^4.0+24.0+0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "8400.0*x^4.0+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/198.0*x^11.0+1.0/210.0*x^7.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/198.0/12.0*x^12.0+1.0/210.0/8.0*x^8.0+1.0/120.0/7.0*x^7.0-1.0/12.0/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/2376.0*x^12.0+1.0/1680.0*x^8.0+1.0/840.0*x^7.0-1.0/60.0*x^5.0-2.0833333333333335*x^4.0";
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
        public static void TestCaseDiff80056() {
        //Test Case 80056
        UsageCalculus.TestCase = 80056;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*x^8 + sin(x) + x^5 + x^4 - x- 25";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Coefficients:0.0:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^8.0+sin(x)+x^5.0+x^4.0-x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*x^7.0+cos(x)+5.0*x^4.0+4.0*x^3.0-1.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*x^7.0+cos(x)+5.0*x^4.0+4.0*x^3.0-1.0";
        UsageCalculus.EqnSolArrayMap3[1]="x^8.0+sin(x)+x^5.0+x^4.0-x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/9.0*x^9.0-cos(x)+1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="0.1111111111111111*x^9.0-cos(x)+1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*x^7.0+cos(x)+5.0*x^4.0+4.0*x^3.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*7.0*x^6.0-sin(x)+5.0*4.0*x^3.0+4.0*3.0*x^2.0-1.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*x^6.0-sin(x)+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="0.1111111111111111*x^9.0-cos(x)+1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="0.1111111111111111/10.0*x^10.0-sin(x)+1.0/6.0/7.0*x^7.0+1.0/5.0/6.0*x^6.0-1.0/2.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="0.01111111111111111*x^10.0-sin(x)+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*x^6.0-sin(x)+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*x^5.0-cos(x)+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*x^5.0-cos(x)+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="0.01111111111111111*x^10.0-sin(x)+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="0.01111111111111111/11.0*x^11.0-cos(x)+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-1.0/6.0/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="0.0010101010101010099*x^11.0-cos(x)+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*x^5.0-cos(x)+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*x^4.0+sin(x)+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*x^4.0+sin(x)+120.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="0.0010101010101010099*x^11.0-cos(x)+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="0.0010101010101010099/12.0*x^12.0-sin(x)+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/24.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="8.417508417508415E-5*x^12.0-sin(x)+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0-1.0/120.0*x^5.0-1.0416666666666667*x^4.0";
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
        // Parenthesis Test Case
        public static void TestCaseDiff80057() {
        //Test Case 80057
        UsageCalculus.TestCase = 80057;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*1*x^(8) + x^(5) + x^(4) - (2)*x- 25*(1)*1.0*1";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^8.0+x^5.0+x^4.0-2.0*x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-2.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="x^8.0+x^5.0+x^4.0-2.0*x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/9.0*x^9.0+1.0/6.0*x^6.0+0.2*x^5.0-x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0-2.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/9.0*x^9.0+1.0/6.0*x^6.0+0.2*x^5.0-x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/9.0/10.0*x^10.0+1.0/6.0/7.0*x^7.0+0.2/6.0*x^6.0-1.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/90.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.0/3.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*x^5.0+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/90.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.0/3.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/90.0/11.0*x^11.0+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-1.0/3.0/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/990.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/12.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*x^4.0+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/990.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/12.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/990.0/12.0*x^12.0+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/12.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/11880.0*x^12.0+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0-1.0/60.0*x^5.0-1.0416666666666667*x^4.0";
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
        public static void TestCaseDiff80058() {
        //Test Case 80058
        UsageCalculus.TestCase = 80058;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(5*x+2) + x^5 + x^4 - 2*x*5- 2*25*2";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 2;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^8.0*(5*x+2)+x^5.0+x^4.0-10.0*x-100.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*x^7.0*(5*x+2)+x^8.0*(5+2*0.0)+5.0*x^4.0+4.0*x^3.0-10.0-100.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*x^7.0*(5*x+2)+5.0*x^8.0+5.0*x^4.0+4.0*x^3.0-10.0";
        UsageCalculus.EqnSolArrayMap3[1]="x^8.0*(5*x+2)+x^5.0+x^4.0-10.0*x-100.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="x^8.0*5.0/2.0*x^2.0+2.0*x-20.0/10.0*x^10.0+16.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-10.0/2.0*x^2.0-100.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="2.5*x^10.0+2.0*x-2.0*x^10.0+1.7777777777777777*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-5.0*x^2.0-100.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="2.5*x^10.0+2.0*x-2.0*x^10.0+1.7777777777777777*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-5.0*x^2.0-100.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="2.5/11.0*x^11.0+x^2.0-2.0/11.0*x^11.0+1.7777777777777777/10.0*x^10.0+1.0/6.0/7.0*x^7.0+1.0/5.0/6.0*x^6.0-5.0/3.0*x^3.0-100.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="0.22727272727272727*x^11.0+x^2.0-1.0/5.5*x^11.0+1.0/5.625*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.6666666666666667*x^3.0-50.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="0.22727272727272727*x^11.0+x^2.0-1.0/5.5*x^11.0+1.0/5.625*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.6666666666666667*x^3.0-50.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="0.22727272727272727/12.0*x^12.0+1.0/3.0*x^3.0-1.0/5.5/12.0*x^12.0+1.0/5.625/11.0*x^11.0+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-1.6666666666666667/4.0*x^4.0-50.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/52.800000000000004*x^12.0+1.0/3.0*x^3.0-1.0/66.0*x^12.0+1.0/61.875*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/2.4*x^4.0-16.666666666666668*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/52.800000000000004*x^12.0+1.0/3.0*x^3.0-1.0/66.0*x^12.0+1.0/61.875*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/2.4*x^4.0-16.666666666666668*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/52.800000000000004/13.0*x^13.0+1.0/3.0/4.0*x^4.0-1.0/66.0/13.0*x^13.0+1.0/61.875/12.0*x^12.0+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/2.4/5.0*x^5.0-16.666666666666668/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/686.4000000000001*x^13.0+1.0/12.0*x^4.0-1.0/858.0*x^13.0+1.0/742.5*x^12.0+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0-1.0/12.0*x^5.0-4.166666666666667*x^4.0";
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
        public static void TestCaseDiff80059() {
        //Test Case 80059
        UsageCalculus.TestCase = 80059;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(5*x)/x + x^5/x + x^4/x - (2)*x*(5)/5- (2)*25*(2)/2";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "5.0*x^8.0+x^4.0+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "5.0*8.0*x^7.0+4.0*x^3.0+3.0*x^2.0-2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "40.0*x^7.0+4.0*x^3.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="5.0*x^8.0+x^4.0+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="5.0/9.0*x^9.0+1.0/5.0*x^5.0+1.0/4.0*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1.8*x^9.0+1.0/5.0*x^5.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "40.0*x^7.0+4.0*x^3.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "40.0*7.0*x^6.0+4.0*3.0*x^2.0+3.0*2.0*x^1.0-2.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "280.0*x^6.0+12.0*x^2.0+6.0*x";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/1.8*x^9.0+1.0/5.0*x^5.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/1.8/10.0*x^10.0+1.0/5.0/6.0*x^6.0+0.25/5.0*x^5.0-1.0/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/18.0*x^10.0+1.0/30.0*x^6.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "280.0*x^6.0+12.0*x^2.0+6.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "280.0*6.0*x^5.0+12.0*2.0*x^1.0+6.0";
        UsageCalculus.EqnSolArrayMap2[3] = "1680.0*x^5.0+24.0*x+6.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/18.0*x^10.0+1.0/30.0*x^6.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/18.0/11.0*x^11.0+1.0/30.0/7.0*x^7.0+1.0/20.0/6.0*x^6.0-1.0/3.0/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/198.0*x^11.0+1.0/210.0*x^7.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "1680.0*x^5.0+24.0*x+6.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "1680.0*5.0*x^4.0+24.0+6.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "8400.0*x^4.0+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/198.0*x^11.0+1.0/210.0*x^7.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/198.0/12.0*x^12.0+1.0/210.0/8.0*x^8.0+1.0/120.0/7.0*x^7.0-1.0/12.0/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/2376.0*x^12.0+1.0/1680.0*x^8.0+1.0/840.0*x^7.0-1.0/60.0*x^5.0-2.0833333333333335*x^4.0";
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
    public static void TestCaseDiff80060() {
        //Test Case 80060
        UsageCalculus.TestCase = 80060;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1*+1/xyc - 1*+1/25*2.0/2.0";
        UsageCalculus.TestCaseName = "Simple: Variables:3 Letter :Coefficients:+1";
        UsageCalculus.TestCaseMatrixID="Coefficients:+1:3 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc";
        UsageCalculus.MaxDiffOrder = 2;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/xyc-1.0/25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-1.0/xyc^2.0-1.0/25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-1.0/xyc^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="1.0/xyc-1.0/25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="ln(xyc)-1.0/25.0*xyc";
        UsageCalculus.EqnSolArrayMap4[1]="ln(xyc)-1.0/25.0*xyc";
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
    
        public static void TestCaseDiff80061() {
        //Test Case 80061
        UsageCalculus.TestCase = 80061;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8 + (2*x+1)*x^5 + x^4 - 2*x- 25*2";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^8.0+x^5.0+x^4.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0-2.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*x^5.0+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*x^4.0+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*x^4.0+120.0*x+24.0";
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
        public static void TestCaseDiff80062() {
        //Test Case 80062
        UsageCalculus.TestCase = 80062;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*1*x*sin(x) + x^5 + x^4 - (2)*x- 25*(2)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x*sin(x)+x^5.0+x^4.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "sin(x)*1.0+cos(x)*x+5.0*x^4.0+4.0*x^3.0-2.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "sin(x)*1.0+cos(x)*x+5.0*x^4.0+4.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="x*sin(x)+x^5.0+x^4.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="x*-cos(x)+cos(x)+1.0/6.0*x^6.0+1.0/5.0*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="-x*cos(x)+cos(x)+1.0/6.0*x^6.0+0.2*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "sin(x)*1.0+cos(x)*x+5.0*x^4.0+4.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "1.0*cos(x)+cos(x)+5.0*4.0*x^3.0+4.0*3.0*x^2.0-2.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "cos(x)+cos(x)+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="-x*cos(x)+cos(x)+1.0/6.0*x^6.0+0.2*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-x*sin(x)-sin(x)+sin(x)+1.0/6.0/7.0*x^7.0+0.2/6.0*x^6.0-1.0/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="-x*sin(x)-sin(x)+sin(x)+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "cos(x)+cos(x)+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-sin(x)-sin(x)+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-sin(x)-sin(x)+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="-x*sin(x)-sin(x)+sin(x)+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="-x*-cos(x)+cos(x)-cos(x)-cos(x)+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-1.0/3.0/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="x*cos(x)+cos(x)-cos(x)-cos(x)+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-sin(x)-sin(x)+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-cos(x)-cos(x)+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-cos(x)-cos(x)+120.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="x*cos(x)+cos(x)-cos(x)-cos(x)+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="x*sin(x)-sin(x)+sin(x)-sin(x)-sin(x)+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/12.0/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="x*sin(x)-sin(x)+sin(x)-sin(x)-sin(x)+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0-1.0/60.0*x^5.0-2.0833333333333335*x^4.0";
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
        
        public static void TestCaseDiff80063() {
        //Test Case 80063
        UsageCalculus.TestCase = 80063;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8 + (2*x+1)*x^5 + x^4 - (2)*x- 25*(2)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "";
        UsageCalculus.EqnSolArrayMap2[1] = "";
        UsageCalculus.EqnSolArrayMap3[1]="-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
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
        
        public static void TestCaseDiff80064() {
        //Test Case 80064
        UsageCalculus.TestCase = 80064;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(2*4*x + 1)*x^8 + (2*3/x-1)*x^5 + x^4 - (2/1*x^2 -1)*x- 25*(2)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^8.0*(2*4*x+1)+x^5.0*(2*3/x-1)+x^4.0-x*(2/1*x^2.0-1)-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*x^7.0*(2*4*x+1)+x^8.0*(2*4+1*0.0)+(2*3/x-1)*5.0*x^4.0+(-2*3/x^2.0-1*0.0)*x^5.0+4.0*x^3.0-(2/1*x^2.0-1)*x+(2.0/1.0*2.0*x^1.0-1*0.0)*x-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*x^7.0*(2*4*x+1)+8.0*x^8.0+5.0*x^4.0*(2*3/x-1)+6.0*x^3.0+4.0*x^3.0-x*(2/1*x^2.0-1)+x*(2.0/1.0*2.0*x^1.0-1*0.0)";
        UsageCalculus.EqnSolArrayMap3[1] = "x^8.0*(2*4*x+1)+x^5.0*(2*3/x-1)+x^4.0-x*(2/1*x^2.0-1)-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="8.0/9.0*x^9.0+6.0/6.0*x^6.0+1.0/5.0*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="0.8888888888888888*x^9.0+x^6.0+0.2*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*x^7.0*(2*4*x+1)+8.0*x^8.0+5.0*x^4.0*(2*3/x-1)+6.0*x^3.0+4.0*x^3.0-x*(2/1*x^2.0-1)+x*(2.0/1.0*2.0*x^1.0-1*0.0)";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*7.0*x^6.0*(2*4*x+1)+8.0*x^7.0*(2*4+1*0.0)+8.0*8.0*x^7.0+(2*3/x-1)*5.0*4.0*x^3.0+(-2*3/x^2.0-1*0.0)*5.0*x^4.0+6.0*3.0*x^2.0+4.0*3.0*x^2.0-(2/1*x^2.0-1)*x+(2.0/1.0*2.0*x^1.0-1*0.0)*x+*x+2.0/1.0*2.0*1.0*x^0.0-1*0.0*0.0*x";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*x^6.0*(2*4*x+1)+64.0*x^7.0+64.0*x^7.0+20.0*x^3.0*(2*3/x-1)+30.0*x^2.0+18.0*x^2.0+12.0*x^2.0-x*(2/1*x^2.0-1)+x^2.0*(2.0/1.0*2.0*x^1.0-1*0.0)+*x+4.0-0.0*x";
        UsageCalculus.EqnSolArrayMap3[2]="0.8888888888888888*x^9.0+x^6.0+0.2*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="0.8888888888888888/10.0*x^10.0+1.0/7.0*x^7.0+0.2/6.0*x^6.0-1.0/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="0.08888888888888888*x^10.0+0.14285714285714285*x^7.0+0.03333333333333333*x^6.0-0.3333333333333333*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*x^6.0*(2*4*x+1)+64.0*x^7.0+64.0*x^7.0+20.0*x^3.0*(2*3/x-1)+30.0*x^2.0+18.0*x^2.0+12.0*x^2.0-x*(2/1*x^2.0-1)+x^2.0*(2.0/1.0*2.0*x^1.0-1*0.0)+x+4.0-0.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*x^5.0*(2*4*x+1)+56.0*x^6.0*(2*4+1*0.0)+64.0*7.0*x^6.0+64.0*7.0*x^6.0+(2*3/x-1)*20.0*3.0*x^2.0+(-2*3/x^2.0-1*0.0)*20.0*x^3.0+30.0*2.0*x^1.0+18.0*2.0*x^1.0+12.0*2.0*x^1.0-(2/1*x^2.0-1)*x+(2.0/1.0*2.0*x^1.0-1*0.0)*x+(2.0/1.0*2.0*x^1.0-1*0.0)*2.0*x^1.0+(2.0/1.0*2.0*1.0*x^0.0-1*0.0*0.0)*x^2.0+1.0+4.0*0.0-0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*x^5.0*(2*4*x+1)+448.0*x^6.0+448.0*x^6.0+448.0*x^6.0+60.0*x^2.0*(2*3/x-1)+120.0/x+60.0*x+36.0*x+24.0*x-x*(2/1*x^2.0-1)+x*(2.0/1.0*2.0*x^1.0-1*0.0)+2.0*x*(2.0/1.0*2.0*x^1.0-1*0.0)+x^2.0*(2.0/1.0*2.0*1.0*x^0.0-1*0.0*0.0)+1.0";
        UsageCalculus.EqnSolArrayMap3[3]="0.08888888888888888*x^10.0+0.14285714285714285*x^7.0+0.03333333333333333*x^6.0-0.3333333333333333*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="0.08888888888888888/11.0*x^11.0+0.14285714285714285/8.0*x^8.0+0.03333333333333333/7.0*x^7.0-0.3333333333333333/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="0.008080808080808079*x^11.0+0.017857142857142856*x^8.0+0.0047619047619047615*x^7.0-0.08333333333333333*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*x^5.0*(2*4*x+1)+448.0*x^6.0+448.0*x^6.0+448.0*x^6.0+60.0*x^2.0*(2*3/x-1)+120.0/x+60.0*x+36.0*x+24.0*x-x*(2/1*x^2.0-1)+x*(2.0/1.0*2.0*x^1.0-1*0.0)+2.0*x*(2.0/1.0*2.0*x^1.0-1*0.0)+x^2.0*(2.0/1.0*2.0*1.0*x^0.0-1*0.0*0.0)+1.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*x^4.0*(2*4*x+1)+336.0*x^5.0*(2*4+1*0.0)+448.0*6.0*x^5.0+448.0*6.0*x^5.0+448.0*6.0*x^5.0+(2*3/x-1)*60.0*2.0*x^1.0+(-2*3/x^2.0-1*0.0)*60.0*x^2.0-120.0/x^2.0+60.0+36.0+24.0-(2/1*x^2.0-1)*x+(2.0/1.0*2.0*x^1.0-1*0.0)*x+(2.0/1.0*2.0*x^1.0-1*0.0)*x+(2.0/1.0*2.0*1.0*x^0.0-1*0.0*0.0)*x+(2.0/1.0*2.0*x^1.0-1*0.0)*2.0+(2.0/1.0*2.0*1.0*x^0.0-1*0.0*0.0)*2.0*x+2.0*x^1.0*(2.0/1.0*2.0*1.0*x^0.0-1*0.0*0.0)+x^2.0*(2.0/1.0*2.0*1.0*-1*0.0*0.0*0.0)+1.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*x^4.0*(2*4*x+1)+2688.0*x^5.0+2688.0*x^5.0+2688.0*x^5.0+2688.0*x^5.0+120.0*x*(2*3/x-1)+360.0*x^2.0*x^2.0-120.0/x^2.0+60.0+36.0+24.0-x*(2/1*x^2.0-1)+x*(2.0/1.0*2.0*x^1.0-1*0.0)+x*(2.0/1.0*2.0*x^1.0-1*0.0)+x*(2.0/1.0*2.0*1.0*x^0.0-1*0.0*0.0)+2.0**(2.0/1.0*2.0*x^1.0-1*0.0)+2.0*x*(2.0/1.0*2.0*1.0*x^0.0-1*0.0*0.0)+2.0*x*(2.0/1.0*2.0*1.0*x^0.0-1*0.0*0.0)+0.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[4]="0.008080808080808079*x^11.0+0.017857142857142856*x^8.0+0.0047619047619047615*x^7.0-0.08333333333333333*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="0.008080808080808079/12.0*x^12.0+0.017857142857142856/9.0*x^9.0+0.0047619047619047615/8.0*x^8.0-0.08333333333333333/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="6.734006734006732E-4*x^12.0+0.001984126984126984*x^9.0+5.952380952380952E-4*x^8.0-0.016666666666666666*x^5.0-2.0833333333333335*x^4.0";
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
        public static void TestCaseDiff80065() {
        //Test Case 80065
        UsageCalculus.TestCase = 80065;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(2*4+1)*x^8 + (2*3+1)*x^5 + x^4 - (2/1-1)*x- 25*(2)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "9.0*x^8.0+7.0*x^5.0+x^4.0-x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "9.0*8.0*x^7.0+7.0*5.0*x^4.0+4.0*x^3.0-1.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "72.0*x^7.0+35.0*x^4.0+4.0*x^3.0-1.0";
        UsageCalculus.EqnSolArrayMap3[1] = "9.0*x^8.0+7.0*x^5.0+x^4.0-x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="9.0/9.0*x^9.0+7.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/2.0*x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="x^9.0+1.1666666666666667*x^6.0+1.0/5.0*x^5.0-1.0/2.0*x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "72.0*x^7.0+35.0*x^4.0+4.0*x^3.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "72.0*7.0*x^6.0+35.0*4.0*x^3.0+4.0*3.0*x^2.0-1.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "504.0*x^6.0+140.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="x^9.0+1.1666666666666667*x^6.0+1.0/5.0*x^5.0-1.0/2.0*x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/10.0*x^10.0+1.1666666666666667/7.0*x^7.0+1.0/5.0/6.0*x^6.0-1.0/2.0/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/10.0*x^10.0+1.0/6.0*x^7.0+1.0/30.0*x^6.0-1.0/6.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "504.0*x^6.0+140.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "504.0*6.0*x^5.0+140.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "3024.0*x^5.0+420.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/10.0*x^10.0+1.0/6.0*x^7.0+1.0/30.0*x^6.0-1.0/6.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/10.0/11.0*x^11.0+1.0/6.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-1.0/6.0/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/110.0*x^11.0+1.0/48.0*x^8.0+1.0/210.0*x^7.0-1.0/24.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "3024.0*x^5.0+420.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "3024.0*5.0*x^4.0+420.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "15120.0*x^4.0+840.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/110.0*x^11.0+1.0/48.0*x^8.0+1.0/210.0*x^7.0-1.0/24.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/110.0/12.0*x^12.0+1.0/48.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/24.0/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/1320.0*x^12.0+1.0/432.0*x^9.0+1.0/1680.0*x^8.0-1.0/120.0*x^5.0-2.0833333333333335*x^4.0";
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
        public static void TestCaseDiff80066() {
        //Test Case 80066
        UsageCalculus.TestCase = 80066;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(2*4^2+x)*x^8 + (2*3+x)*x^5 + x^4 - (2/1-x)*x- 25*(2)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "8.0*x^8.0+6.0*x^5.0+x^4.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*8.0*x^7.0+6.0*5.0*x^4.0+4.0*x^3.0-2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "64.0*x^7.0+30.0*x^4.0+4.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1] = "8.0*x^8.0+6.0*x^5.0+x^4.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="8.0/9.0*x^9.0+6.0/6.0*x^6.0+1.0/5.0*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="0.8888888888888888*x^9.0+x^6.0+0.2*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "64.0*x^7.0+30.0*x^4.0+4.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "64.0*7.0*x^6.0+30.0*4.0*x^3.0+4.0*3.0*x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "448.0*x^6.0+120.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="0.8888888888888888*x^9.0+x^6.0+0.2*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="0.8888888888888888/10.0*x^10.0+1.0/7.0*x^7.0+0.2/6.0*x^6.0-1.0/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="0.08888888888888888*x^10.0+0.14285714285714285*x^7.0+0.03333333333333333*x^6.0-0.3333333333333333*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "448.0*x^6.0+120.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "448.0*6.0*x^5.0+120.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "2688.0*x^5.0+360.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="0.08888888888888888*x^10.0+0.14285714285714285*x^7.0+0.03333333333333333*x^6.0-0.3333333333333333*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="0.08888888888888888/11.0*x^11.0+0.14285714285714285/8.0*x^8.0+0.03333333333333333/7.0*x^7.0-0.3333333333333333/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="0.008080808080808079*x^11.0+0.017857142857142856*x^8.0+0.0047619047619047615*x^7.0-0.08333333333333333*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "2688.0*x^5.0+360.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "2688.0*5.0*x^4.0+360.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "13440.0*x^4.0+720.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="0.008080808080808079*x^11.0+0.017857142857142856*x^8.0+0.0047619047619047615*x^7.0-0.08333333333333333*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="0.008080808080808079/12.0*x^12.0+0.017857142857142856/9.0*x^9.0+0.0047619047619047615/8.0*x^8.0-0.08333333333333333/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="6.734006734006732E-4*x^12.0+0.001984126984126984*x^9.0+5.952380952380952E-4*x^8.0-0.016666666666666666*x^5.0-2.0833333333333335*x^4.0";
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
        public static void TestCaseDiff80067() {
        //Test Case 80067
        UsageCalculus.TestCase = 80067;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*1*(+1)/xyc^8 + (+1)/xyc^5 + (+1)/xyc^4 - (+1)/xyc - (+1)/25";
        UsageCalculus.TestCaseName = "Simple: Variables:3 Letter :Coefficients:+1:MAP";
        UsageCalculus.TestCaseMatrixID="Coefficients:+1:3 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/xyc^8.0+1.0/xyc^5.0+1.0/xyc^4.0-1.0/xyc-1.0/25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-8.0/xyc^9.0-5.0/xyc^6.0-4.0/xyc^5.0+1.0/xyc^2.0-1.0/25.0*0.0";
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
        public static void TestCaseDiff80068() {
        //Test Case 80068
        UsageCalculus.TestCase = 80068;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*1*(+1.0)/xyc1^8 + (+1.0)/xyc1^5 + (+1.0)/xyc1^4 - (+1.0)/xyc1 - (+1.0)/25";
        UsageCalculus.TestCaseName = "Simple: Variables:3 Letter with Numerics :Co-efficients:+1.0:MAP";
        UsageCalculus.TestCaseMatrixID="Coefficients:+1.0:3 Letter with Numerics:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "1.0/xyc1^8.0+1.0/xyc1^5.0+1.0/xyc1^4.0-1.0/xyc1-1.0/25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-8.0/xyc1^9.0-5.0/xyc1^6.0-4.0/xyc1^5.0+1.0/xyc1^2.0-1.0/25.0*0.0";
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

       public static void TestCaseDiff80069() {
        //Test Case 80069
        UsageCalculus.TestCase = 80069;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*1*x^8*(2*4) + (2*3)*x^5 + x^4 - x*(2/1)- 25*(2)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "8.0*x^8.0+6.0*x^5.0+x^4.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*8.0*x^7.0+6.0*5.0*x^4.0+4.0*x^3.0-2.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "64.0*x^7.0+30.0*x^4.0+4.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1] = "8.0*x^8.0+6.0*x^5.0+x^4.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="8.0/9.0*x^9.0+6.0/6.0*x^6.0+1.0/5.0*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1.125*x^9.0+x^6.0+0.2*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "64.0*x^7.0+30.0*x^4.0+4.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "64.0*7.0*x^6.0+30.0*4.0*x^3.0+4.0*3.0*x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "448.0*x^6.0+120.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="0.8888888888888888*x^9.0+x^6.0+0.2*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="0.8888888888888888/10.0*x^10.0+1.0/7.0*x^7.0+0.2/6.0*x^6.0-1.0/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/11.25*x^10.0+1.0/7.0*x^7.0+1.0/30.0*x^6.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "448.0*x^6.0+120.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "448.0*6.0*x^5.0+120.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "2688.0*x^5.0+360.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/11.25*x^10.0+1.0/7.0*x^7.0+1.0/30.0*x^6.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/11.25/11.0*x^11.0+1.0/7.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-1.0/3.0/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/123.75*x^11.0+1.0/56.0*x^8.0+1.0/210.0*x^7.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "2688.0*x^5.0+360.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "2688.0*5.0*x^4.0+360.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "13440.0*x^4.0+720.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/123.75*x^11.0+1.0/56.0*x^8.0+1.0/210.0*x^7.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/123.75/12.0*x^12.0+1.0/56.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/12.0/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/1485.0*x^12.0+1.0/504.0*x^9.0+1.0/1680.0*x^8.0-1.0/60.0*x^5.0-2.0833333333333335*x^4.0";
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
      
    public static void TestCaseDiff80070() {
        //Test Case 80070
        UsageCalculus.TestCase = 80070;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(5*x) + x^5 + x^4 - (2)*x*(5)- (2)*25*(2)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "5.0*x^9.0+x^5.0+x^4.0-10.0*x-100.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "5.0*9.0*x^8.0+5.0*x^4.0+4.0*x^3.0-10.0-100.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "45.0*x^8.0+5.0*x^4.0+4.0*x^3.0-10.0";
        UsageCalculus.EqnSolArrayMap3[1]="5.0*x^9.0+x^5.0+x^4.0-10.0*x-100.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="5.0/10.0*x^10.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-10.0/2.0*x^2.0-100.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/2.0*x^10.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-5.0*x^2.0-100.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "45.0*x^8.0+5.0*x^4.0+4.0*x^3.0-10.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "45.0*8.0*x^7.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0-10.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "360.0*x^7.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/2.0*x^10.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-5.0*x^2.0-100.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/2.0/11.0*x^11.0+1.0/6.0/7.0*x^7.0+1.0/5.0/6.0*x^6.0-5.0/3.0*x^3.0-100.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/22.0*x^11.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.6666666666666667*x^3.0-50.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "360.0*x^7.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "360.0*7.0*x^6.0+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "2520.0*x^6.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/22.0*x^11.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.6666666666666667*x^3.0-50.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/22.0/12.0*x^12.0+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-1.6666666666666667/4.0*x^4.0-50.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/264.0*x^12.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/2.4*x^4.0-16.666666666666668*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "2520.0*x^6.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "2520.0*6.0*x^5.0+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "15120.0*x^5.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/264.0*x^12.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/2.4*x^4.0-16.666666666666668*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/264.0/13.0*x^13.0+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/2.4/5.0*x^5.0-16.666666666666668/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/3432.0*x^13.0+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0-1.0/12.0*x^5.0-4.166666666666667*x^4.0";
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
       public static void TestCaseDiff80071() {
        //Test Case 80071
        UsageCalculus.TestCase = 80071;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(3-5*x) + x^5*(3+5*x) + x^4 - 2*x*5- 2*25*2";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 2;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^8.0*(3-5*x)+x^5.0*(3+5*x)+x^4.0-10.0*x-100.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*x^7.0*(3-5*x)+x^8.0*(0.0-5)+5.0*x^4.0*(3+5*x)+x^5.0*(0.0+5)+4.0*x^3.0-10.0-100.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*x^7.0*(3-5*x)+5.0*x^8.0+5.0*x^4.0*(3+5*x)+5.0*x^5.0+4.0*x^3.0-10.0";
        UsageCalculus.EqnSolArrayMap3[1]="x^8.0*(3-5*x)+x^5.0*(3+5*x)+x^4.0-10.0*x-100.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="x^8.0*3*x-5.0/2.0*x^2.0-24.0/9.0*x^9.0-20.0/10.0*x^10.0+x^5.0*3*x+5.0/2.0*x^2.0-15.0/6.0*x^6.0+12.5/7.0*x^7.0+1.0/5.0*x^5.0-10.0/2.0*x^2.0-100.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="3.0*x^9.0-2.5*x^2.0-2.6666666666666665*x^9.0-2.0*x^10.0+3.0*x^6.0+2.5*x^2.0-2.5*x^6.0+1.7857142857142858*x^7.0+1.0/5.0*x^5.0-5.0*x^2.0-100.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="3.0*x^9.0-2.5*x^2.0-2.6666666666666665*x^9.0-2.0*x^10.0+3.0*x^6.0+2.5*x^2.0-2.5*x^6.0+1.7857142857142858*x^7.0+1.0/5.0*x^5.0-5.0*x^2.0-100.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="3.0/10.0*x^10.0-2.5/3.0*x^3.0-2.6666666666666665/10.0*x^10.0-2.0/11.0*x^11.0+3.0/7.0*x^7.0+2.5/3.0*x^3.0-2.5/7.0*x^7.0+1.7857142857142858/8.0*x^8.0+1.0/5.0/6.0*x^6.0-5.0/3.0*x^3.0-100.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/3.3333333333333335*x^10.0-1.0/1.2*x^3.0-1.0/3.75*x^10.0-1.0/5.5*x^11.0+1.0/2.3333333333333335*x^7.0+1.0/1.2*x^3.0-1.0/2.8*x^7.0+1.0/4.4799999999999995*x^8.0+1.0/30.0*x^6.0-1.6666666666666667*x^3.0-50.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/3.3333333333333335*x^10.0-1.0/1.2*x^3.0-1.0/3.75*x^10.0-1.0/5.5*x^11.0+1.0/2.3333333333333335*x^7.0+1.0/1.2*x^3.0-1.0/2.8*x^7.0+1.0/4.4799999999999995*x^8.0+1.0/30.0*x^6.0-1.6666666666666667*x^3.0-50.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/3.3333333333333335/11.0*x^11.0-1.0/1.2/4.0*x^4.0-1.0/3.75/11.0*x^11.0-1.0/5.5/12.0*x^12.0+1.0/2.3333333333333335/8.0*x^8.0+1.0/1.2/4.0*x^4.0-1.0/2.8/8.0*x^8.0+1.0/4.4799999999999995/9.0*x^9.0+1.0/30.0/7.0*x^7.0-1.6666666666666667/4.0*x^4.0-50.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/36.66666666666667*x^11.0-1.0/4.8*x^4.0-1.0/41.25*x^11.0-1.0/66.0*x^12.0+1.0/18.666666666666668*x^8.0+1.0/4.8*x^4.0-1.0/22.4*x^8.0+1.0/40.31999999999999*x^9.0+1.0/210.0*x^7.0-1.0/2.4*x^4.0-16.666666666666668*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/36.66666666666667*x^11.0-1.0/4.8*x^4.0-1.0/41.25*x^11.0-1.0/66.0*x^12.0+1.0/18.666666666666668*x^8.0+1.0/4.8*x^4.0-1.0/22.4*x^8.0+1.0/40.31999999999999*x^9.0+1.0/210.0*x^7.0-1.0/2.4*x^4.0-16.666666666666668*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/36.66666666666667/12.0*x^12.0-1.0/4.8/5.0*x^5.0-1.0/41.25/12.0*x^12.0-1.0/66.0/13.0*x^13.0+1.0/18.666666666666668/9.0*x^9.0+1.0/4.8/5.0*x^5.0-1.0/22.4/9.0*x^9.0+1.0/40.31999999999999/10.0*x^10.0+1.0/210.0/8.0*x^8.0-1.0/2.4/5.0*x^5.0-16.666666666666668/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/440.00000000000006*x^12.0-1.0/24.0*x^5.0-1.0/495.0*x^12.0-1.0/858.0*x^13.0+1.0/168.0*x^9.0+1.0/24.0*x^5.0-1.0/201.6*x^9.0+1.0/403.19999999999993*x^10.0+1.0/1680.0*x^8.0-1.0/12.0*x^5.0-4.166666666666667*x^4.0";
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
        public static void TestCaseDiff80072() {
        //Test Case 80072
        UsageCalculus.TestCase = 80072;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(3+5*x)/x + x^5/x*(3+5*x) + x^4/x - (2)*x*(5)/5- (2)*25*(2)/2";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^7.0*(3+5*x)+x^4.0*(3+5*x)+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "7.0*x^6.0*(3+5*x)+x^7.0*(0.0+5)+4.0*x^3.0*(3+5*x)+x^4.0*(0.0+5)+3.0*x^2.0-2.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "7.0*x^6.0*(3+5*x)+5.0*x^7.0+4.0*x^3.0*(3+5*x)+5.0*x^4.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="x^7.0*(3+5*x)+x^4.0*(3+5*x)+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="x^7.0*3*x+5.0/2.0*x^2.0-21.0/8.0*x^8.0+17.5/9.0*x^9.0+x^4.0*3*x+5.0/2.0*x^2.0-12.0/5.0*x^5.0+10.0/6.0*x^6.0+1.0/4.0*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="3.0*x^8.0+2.5*x^2.0-2.625*x^8.0+1.9444444444444444*x^9.0+3.0*x^5.0+2.5*x^2.0-2.4*x^5.0+1.6666666666666667*x^6.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "7.0*x^6.0*(3+5*x)+5.0*x^7.0+4.0*x^3.0*(3+5*x)+5.0*x^4.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "7.0*6.0*x^5.0*(3+5*x)+7.0*x^6.0*(0.0+5)+5.0*7.0*x^6.0+4.0*3.0*x^2.0*(3+5*x)+4.0*x^3.0*(0.0+5)+5.0*4.0*x^3.0+3.0*2.0*x^1.0-2.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "42.0*x^5.0*(3+5*x)+35.0*x^6.0+35.0*x^6.0+12.0*x^2.0*(3+5*x)+20.0*x^3.0+20.0*x^3.0+6.0*x";
        UsageCalculus.EqnSolArrayMap3[2]="3.0*x^8.0+2.5*x^2.0-2.625*x^8.0+1.9444444444444444*x^9.0+3.0*x^5.0+2.5*x^2.0-2.4*x^5.0+1.6666666666666667*x^6.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="3.0/9.0*x^9.0+2.5/3.0*x^3.0-2.625/9.0*x^9.0+1.9444444444444444/10.0*x^10.0+3.0/6.0*x^6.0+2.5/3.0*x^3.0-2.4/6.0*x^6.0+1.6666666666666667/7.0*x^7.0+0.25/5.0*x^5.0-1.0/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/3.0*x^9.0+1.0/1.2*x^3.0-1.0/3.4285714285714284*x^9.0+1.0/5.142857142857143*x^10.0+1.0/2.0*x^6.0+1.0/1.2*x^3.0-1.0/2.5*x^6.0+1.0/4.2*x^7.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "42.0*x^5.0*(3+5*x)+35.0*x^6.0+35.0*x^6.0+12.0*x^2.0*(3+5*x)+20.0*x^3.0+20.0*x^3.0+6.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "42.0*5.0*x^4.0*(3+5*x)+42.0*x^5.0*(0.0+5)+35.0*6.0*x^5.0+35.0*6.0*x^5.0+12.0*2.0*x^1.0*(3+5*x)+12.0*x^2.0*(0.0+5)+20.0*3.0*x^2.0+20.0*3.0*x^2.0+6.0";
        UsageCalculus.EqnSolArrayMap2[3] = "210.0*x^4.0*(3+5*x)+210.0*x^5.0+210.0*x^5.0+210.0*x^5.0+24.0*x*(3+5*x)+60.0*x^2.0+60.0*x^2.0+60.0*x^2.0+6.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/3.0*x^9.0+1.0/1.2*x^3.0-1.0/3.4285714285714284*x^9.0+1.0/5.142857142857143*x^10.0+1.0/2.0*x^6.0+1.0/1.2*x^3.0-1.0/2.5*x^6.0+1.0/4.2*x^7.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/3.0/10.0*x^10.0+1.0/1.2/4.0*x^4.0-1.0/3.4285714285714284/10.0*x^10.0+1.0/5.142857142857143/11.0*x^11.0+1.0/2.0/7.0*x^7.0+1.0/1.2/4.0*x^4.0-1.0/2.5/7.0*x^7.0+1.0/4.2/8.0*x^8.0+1.0/20.0/6.0*x^6.0-1.0/3.0/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/30.0*x^10.0+1.0/4.8*x^4.0-1.0/34.285714285714285*x^10.0+1.0/56.57142857142858*x^11.0+1.0/14.0*x^7.0+1.0/4.8*x^4.0-1.0/17.5*x^7.0+1.0/33.6*x^8.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "210.0*x^4.0*(3+5*x)+210.0*x^5.0+210.0*x^5.0+210.0*x^5.0+24.0*x*(3+5*x)+60.0*x^2.0+60.0*x^2.0+60.0*x^2.0+6.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "210.0*4.0*x^3.0*(3+5*x)+210.0*x^4.0*(0.0+5)+210.0*5.0*x^4.0+210.0*5.0*x^4.0+210.0*5.0*x^4.0+24.0*(3+5*x)+24.0*x*(0.0+5)+60.0*2.0*x^1.0+60.0*2.0*x^1.0+60.0*2.0*x^1.0+6.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "840.0*x^3.0*(3+5*x)+1050.0*x^4.0+1050.0*x^4.0+1050.0*x^4.0+1050.0*x^4.0+24.0+120.0*x+120.0*x+120.0*x+120.0*x";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/30.0*x^10.0+1.0/4.8*x^4.0-1.0/34.285714285714285*x^10.0+1.0/56.57142857142858*x^11.0+1.0/14.0*x^7.0+1.0/4.8*x^4.0-1.0/17.5*x^7.0+1.0/33.6*x^8.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/30.0/11.0*x^11.0+1.0/4.8/5.0*x^5.0-1.0/34.285714285714285/11.0*x^11.0+1.0/56.57142857142858/12.0*x^12.0+1.0/14.0/8.0*x^8.0+1.0/4.8/5.0*x^5.0-1.0/17.5/8.0*x^8.0+1.0/33.6/9.0*x^9.0+1.0/120.0/7.0*x^7.0-1.0/12.0/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/330.0*x^11.0+1.0/24.0*x^5.0-1.0/377.1428571428571*x^11.0+1.0/678.8571428571429*x^12.0+1.0/112.0*x^8.0+1.0/24.0*x^5.0-1.0/140.0*x^8.0+1.0/302.40000000000003*x^9.0+1.0/840.0*x^7.0-1.0/60.0*x^5.0-2.0833333333333335*x^4.0";
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
        public static void TestCaseDiff80073() {
        //Test Case 80073
        UsageCalculus.TestCase = 80073;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(3-7*x)*5 + x^5*(3+9*x)/8 + x^4 - 2*x*5- 2*25*2";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 2;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "5.0*x^8.0*(3-7*x)+8.0*x^5.0*(3+9*x)+x^4.0-10.0*x-100.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "5.0*8.0*x^7.0*(3-7*x)+5.0*x^8.0*(0.0-7)+8.0*5.0*x^4.0*(3+9*x)+8.0*x^5.0*(0.0+9)+4.0*x^3.0-10.0-100.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "40.0*x^7.0*(3-7*x)+35.0*x^8.0+40.0*x^4.0*(3+9*x)+72.0*x^5.0+4.0*x^3.0-10.0";
        UsageCalculus.EqnSolArrayMap3[1]="5.0*x^8.0*(3-7*x)+8.0*x^5.0*(3+9*x)+x^4.0-10.0*x-100.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="5.0*x^8.0*3*x-7.0/2.0*x^2.0-120.0/9.0*x^9.0-140.0/10.0*x^10.0+8.0*x^5.0*3*x+9.0/2.0*x^2.0-120.0/6.0*x^6.0+180.0/7.0*x^7.0+1.0/5.0*x^5.0-10.0/2.0*x^2.0-100.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="15.0*x^9.0-3.5*x^2.0-13.333333333333334*x^9.0-14.0*x^10.0+24.0*x^6.0+4.5*x^2.0-20.0*x^6.0+25.714285714285715*x^7.0+1.0/5.0*x^5.0-5.0*x^2.0-100.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="15.0*x^9.0-3.5*x^2.0-13.333333333333334*x^9.0-14.0*x^10.0+24.0*x^6.0+4.5*x^2.0-20.0*x^6.0+25.714285714285715*x^7.0+1.0/5.0*x^5.0-5.0*x^2.0-100.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="15.0/10.0*x^10.0-3.5/3.0*x^3.0-13.333333333333334/10.0*x^10.0-14.0/11.0*x^11.0+24.0/7.0*x^7.0+4.5/3.0*x^3.0-20.0/7.0*x^7.0+25.714285714285715/8.0*x^8.0+1.0/5.0/6.0*x^6.0-5.0/3.0*x^3.0-100.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.5*x^10.0-1.1666666666666667*x^3.0-1.3333333333333335*x^10.0-1.2727272727272727*x^11.0+3.4285714285714284*x^7.0+1.5*x^3.0-2.857142857142857*x^7.0+3.2142857142857144*x^8.0+1.0/30.0*x^6.0-1.6666666666666667*x^3.0-50.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="1.5*x^10.0-1.1666666666666667*x^3.0-1.3333333333333335*x^10.0-1.2727272727272727*x^11.0+3.4285714285714284*x^7.0+1.5*x^3.0-2.857142857142857*x^7.0+3.2142857142857144*x^8.0+1.0/30.0*x^6.0-1.6666666666666667*x^3.0-50.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.5/11.0*x^11.0-1.1666666666666667/4.0*x^4.0-1.3333333333333335/11.0*x^11.0-1.2727272727272727/12.0*x^12.0+3.4285714285714284/8.0*x^8.0+1.5/4.0*x^4.0-2.857142857142857/8.0*x^8.0+3.2142857142857144/9.0*x^9.0+1.0/30.0/7.0*x^7.0-1.6666666666666667/4.0*x^4.0-50.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/7.333333333333333*x^11.0-1.0/3.4285714285714284*x^4.0-1.0/8.249999999999998*x^11.0-1.0/9.428571428571429*x^12.0+1.0/2.3333333333333335*x^8.0+1.0/2.6666666666666665*x^4.0-1.0/2.8*x^8.0+1.0/2.8*x^9.0+1.0/210.0*x^7.0-1.0/2.4*x^4.0-16.666666666666668*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/7.333333333333333*x^11.0-1.0/3.4285714285714284*x^4.0-1.0/8.249999999999998*x^11.0-1.0/9.428571428571429*x^12.0+1.0/2.3333333333333335*x^8.0+1.0/2.6666666666666665*x^4.0-1.0/2.8*x^8.0+1.0/2.8*x^9.0+1.0/210.0*x^7.0-1.0/2.4*x^4.0-16.666666666666668*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/7.333333333333333/12.0*x^12.0-1.0/3.4285714285714284/5.0*x^5.0-1.0/8.249999999999998/12.0*x^12.0-1.0/9.428571428571429/13.0*x^13.0+1.0/2.3333333333333335/9.0*x^9.0+1.0/2.6666666666666665/5.0*x^5.0-1.0/2.8/9.0*x^9.0+1.0/2.8/10.0*x^10.0+1.0/210.0/8.0*x^8.0-1.0/2.4/5.0*x^5.0-16.666666666666668/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/88.0*x^12.0-1.0/17.142857142857142*x^5.0-1.0/98.99999999999997*x^12.0-1.0/122.57142857142857*x^13.0+1.0/21.0*x^9.0+1.0/13.333333333333332*x^5.0-1.0/25.2*x^9.0+1.0/28.0*x^10.0+1.0/1680.0*x^8.0-1.0/12.0*x^5.0-4.166666666666667*x^4.0";
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
        public static void TestCaseDiff80074() {
        //Test Case 80074
        UsageCalculus.TestCase = 80074;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(3+5*x)*4/x + x^5/x*(3+5*x)*2 + x^4/x - (2)*x*(5)/5- (2)*25*(2)/2";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "4.0*x^7.0*(3+5*x)+2.0*x^4.0*(3+5*x)+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "4.0*7.0*x^6.0*(3+5*x)+4.0*x^7.0*(0.0+5)+2.0*4.0*x^3.0*(3+5*x)+2.0*x^4.0*(0.0+5)+3.0*x^2.0-2.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "28.0*x^6.0*(3+5*x)+20.0*x^7.0+8.0*x^3.0*(3+5*x)+10.0*x^4.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="4.0*x^7.0*(3+5*x)+2.0*x^4.0*(3+5*x)+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="4.0*x^7.0*3*x+5.0/2.0*x^2.0-84.0/8.0*x^8.0+70.0/9.0*x^9.0+2.0*x^4.0*3*x+5.0/2.0*x^2.0-24.0/5.0*x^5.0+20.0/6.0*x^6.0+1.0/4.0*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="12.0*x^8.0+2.5*x^2.0-10.5*x^8.0+7.777777777777778*x^9.0+6.0*x^5.0+2.5*x^2.0-4.8*x^5.0+3.3333333333333335*x^6.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "28.0*x^6.0*(3+5*x)+20.0*x^7.0+8.0*x^3.0*(3+5*x)+10.0*x^4.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "28.0*6.0*x^5.0*(3+5*x)+28.0*x^6.0*(0.0+5)+20.0*7.0*x^6.0+8.0*3.0*x^2.0*(3+5*x)+8.0*x^3.0*(0.0+5)+10.0*4.0*x^3.0+3.0*2.0*x^1.0-2.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "168.0*x^5.0*(3+5*x)+140.0*x^6.0+140.0*x^6.0+24.0*x^2.0*(3+5*x)+40.0*x^3.0+40.0*x^3.0+6.0*x";
        UsageCalculus.EqnSolArrayMap3[2]="12.0*x^8.0+2.5*x^2.0-10.5*x^8.0+7.777777777777778*x^9.0+6.0*x^5.0+2.5*x^2.0-4.8*x^5.0+3.3333333333333335*x^6.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="12.0/9.0*x^9.0+2.5/3.0*x^3.0-10.5/9.0*x^9.0+7.777777777777778/10.0*x^10.0+6.0/6.0*x^6.0+2.5/3.0*x^3.0-4.8/6.0*x^6.0+3.3333333333333335/7.0*x^7.0+0.25/5.0*x^5.0-1.0/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.3333333333333333*x^9.0+1.0/1.2*x^3.0-1.1666666666666667*x^9.0+1.0/1.2857142857142858*x^10.0+x^6.0+1.0/1.2*x^3.0-1.0/1.25*x^6.0+1.0/2.1*x^7.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "168.0*x^5.0*(3+5*x)+140.0*x^6.0+140.0*x^6.0+24.0*x^2.0*(3+5*x)+40.0*x^3.0+40.0*x^3.0+6.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "168.0*5.0*x^4.0*(3+5*x)+168.0*x^5.0*(0.0+5)+140.0*6.0*x^5.0+140.0*6.0*x^5.0+24.0*2.0*x^1.0*(3+5*x)+24.0*x^2.0*(0.0+5)+40.0*3.0*x^2.0+40.0*3.0*x^2.0+6.0";
        UsageCalculus.EqnSolArrayMap2[3] = "840.0*x^4.0*(3+5*x)+840.0*x^5.0+840.0*x^5.0+840.0*x^5.0+48.0*x*(3+5*x)+120.0*x^2.0+120.0*x^2.0+120.0*x^2.0+6.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.3333333333333333*x^9.0+1.0/1.2*x^3.0-1.1666666666666667*x^9.0+0.7777777777777777*x^10.0+x^6.0+1.0/1.2*x^3.0-1.0/1.25*x^6.0+1.0/2.1*x^7.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.3333333333333333/10.0*x^10.0+1.0/1.2/4.0*x^4.0-1.1666666666666667/10.0*x^10.0+0.7777777777777777/11.0*x^11.0+1.0/7.0*x^7.0+1.0/1.2/4.0*x^4.0-1.0/1.25/7.0*x^7.0+1.0/2.1/8.0*x^8.0+1.0/20.0/6.0*x^6.0-1.0/3.0/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/7.5*x^10.0+1.0/4.8*x^4.0-1.0/8.571428571428571*x^10.0+1.0/14.142857142857144*x^11.0+1.0/7.0*x^7.0+1.0/4.8*x^4.0-1.0/8.75*x^7.0+1.0/16.8*x^8.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "840.0*x^4.0*(3+5*x)+840.0*x^5.0+840.0*x^5.0+840.0*x^5.0+48.0*x*(3+5*x)+120.0*x^2.0+120.0*x^2.0+120.0*x^2.0+6.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "840.0*4.0*x^3.0*(3+5*x)+840.0*x^4.0*(0.0+5)+840.0*5.0*x^4.0+840.0*5.0*x^4.0+840.0*5.0*x^4.0+48.0*(3+5*x)+48.0*x*(0.0+5)+120.0*2.0*x^1.0+120.0*2.0*x^1.0+120.0*2.0*x^1.0+6.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "3360.0*x^3.0*(3+5*x)+4200.0*x^4.0+4200.0*x^4.0+4200.0*x^4.0+4200.0*x^4.0+48.0+240.0*x+240.0*x+240.0*x+240.0*x";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/7.5*x^10.0+1.0/4.8*x^4.0-1.0/8.571428571428571*x^10.0+1.0/14.142857142857144*x^11.0+1.0/7.0*x^7.0+1.0/4.8*x^4.0-1.0/8.75*x^7.0+1.0/16.8*x^8.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/7.5/11.0*x^11.0+1.0/4.8/5.0*x^5.0-1.0/8.571428571428571/11.0*x^11.0+1.0/14.142857142857144/12.0*x^12.0+1.0/7.0/8.0*x^8.0+1.0/4.8/5.0*x^5.0-1.0/8.75/8.0*x^8.0+1.0/16.8/9.0*x^9.0+1.0/120.0/7.0*x^7.0-1.0/12.0/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/82.5*x^11.0+1.0/24.0*x^5.0-1.0/94.28571428571428*x^11.0+1.0/169.71428571428572*x^12.0+1.0/56.0*x^8.0+1.0/24.0*x^5.0-1.0/70.0*x^8.0+1.0/151.20000000000002*x^9.0+1.0/840.0*x^7.0-1.0/60.0*x^5.0-2.0833333333333335*x^4.0";
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
        public static void TestCaseDiff80075() {
        //Test Case 80075
        UsageCalculus.TestCase = 80075;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*x^8*(3+5*x)*4/x*5*x + x^5/x*(3+5*x)*2*6*x^2 + x^4/x - (2)*x*(5)/5- (2)*25*(2)/2";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "20.0*x^8.0*(3+5*x)+12.0*x^6.0*(3+5*x)+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "20.0*8.0*x^7.0*(3+5*x)+20.0*x^8.0*(0.0+5)+12.0*6.0*x^5.0*(3+5*x)+12.0*x^6.0*(0.0+5)+3.0*x^2.0-2.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "160.0*x^7.0*(3+5*x)+100.0*x^8.0+72.0*x^5.0*(3+5*x)+60.0*x^6.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="20.0*x^8.0*(3+5*x)+12.0*x^6.0*(3+5*x)+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="20.0*x^8.0*3*x+5.0/2.0*x^2.0-480.0/9.0*x^9.0+400.0/10.0*x^10.0+12.0*x^6.0*3*x+5.0/2.0*x^2.0-216.0/7.0*x^7.0+180.0/8.0*x^8.0+1.0/4.0*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="60.0*x^9.0+2.5*x^2.0-53.333333333333336*x^9.0+40.0*x^10.0+36.0*x^7.0+2.5*x^2.0-30.857142857142858*x^7.0+22.5*x^8.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "160.0*x^7.0*(3+5*x)+100.0*x^8.0+72.0*x^5.0*(3+5*x)+60.0*x^6.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "160.0*7.0*x^6.0*(3+5*x)+160.0*x^7.0*(0.0+5)+100.0*8.0*x^7.0+72.0*5.0*x^4.0*(3+5*x)+72.0*x^5.0*(0.0+5)+60.0*6.0*x^5.0+3.0*2.0*x^1.0-2.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "1120.0*x^6.0*(3+5*x)+800.0*x^7.0+800.0*x^7.0+360.0*x^4.0*(3+5*x)+360.0*x^5.0+360.0*x^5.0+6.0*x";
        UsageCalculus.EqnSolArrayMap3[2]="60.0*x^9.0+2.5*x^2.0-53.333333333333336*x^9.0+40.0*x^10.0+36.0*x^7.0+2.5*x^2.0-30.857142857142858*x^7.0+22.5*x^8.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="60.0/10.0*x^10.0+2.5/3.0*x^3.0-53.333333333333336/10.0*x^10.0+40.0/11.0*x^11.0+36.0/8.0*x^8.0+2.5/3.0*x^3.0-30.857142857142858/8.0*x^8.0+22.5/9.0*x^9.0+0.25/5.0*x^5.0-1.0/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="6.0*x^10.0+1.0/1.2*x^3.0-5.333333333333334*x^10.0+3.6363636363636362*x^11.0+4.5*x^8.0+1.0/1.2*x^3.0-3.857142857142857*x^8.0+2.5*x^9.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "1120.0*x^6.0*(3+5*x)+800.0*x^7.0+800.0*x^7.0+360.0*x^4.0*(3+5*x)+360.0*x^5.0+360.0*x^5.0+6.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "1120.0*6.0*x^5.0*(3+5*x)+1120.0*x^6.0*(0.0+5)+800.0*7.0*x^6.0+800.0*7.0*x^6.0+360.0*4.0*x^3.0*(3+5*x)+360.0*x^4.0*(0.0+5)+360.0*5.0*x^4.0+360.0*5.0*x^4.0+6.0";
        UsageCalculus.EqnSolArrayMap2[3] = "6720.0*x^5.0*(3+5*x)+5600.0*x^6.0+5600.0*x^6.0+5600.0*x^6.0+1440.0*x^3.0*(3+5*x)+1800.0*x^4.0+1800.0*x^4.0+1800.0*x^4.0+6.0";
        UsageCalculus.EqnSolArrayMap3[3]="6.0*x^10.0+1.0/1.2*x^3.0-5.333333333333334*x^10.0+3.6363636363636362*x^11.0+4.5*x^8.0+1.0/1.2*x^3.0-3.857142857142857*x^8.0+2.5*x^9.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="6.0/11.0*x^11.0+1.0/1.2/4.0*x^4.0-5.333333333333334/11.0*x^11.0+3.6363636363636362/12.0*x^12.0+4.5/9.0*x^9.0+1.0/1.2/4.0*x^4.0-3.857142857142857/9.0*x^9.0+2.5/10.0*x^10.0+1.0/20.0/6.0*x^6.0-1.0/3.0/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/1.8333333333333333*x^11.0+1.0/4.8*x^4.0-1.0/2.0624999999999996*x^11.0+1.0/3.3000000000000003*x^12.0+1.0/2.0*x^9.0+1.0/4.8*x^4.0-1.0/2.3333333333333335*x^9.0+1.0/4.0*x^10.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "6720.0*x^5.0*(3+5*x)+5600.0*x^6.0+5600.0*x^6.0+5600.0*x^6.0+1440.0*x^3.0*(3+5*x)+1800.0*x^4.0+1800.0*x^4.0+1800.0*x^4.0+6.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "6720.0*5.0*x^4.0*(3+5*x)+6720.0*x^5.0*(0.0+5)+5600.0*6.0*x^5.0+5600.0*6.0*x^5.0+5600.0*6.0*x^5.0+1440.0*3.0*x^2.0*(3+5*x)+1440.0*x^3.0*(0.0+5)+1800.0*4.0*x^3.0+1800.0*4.0*x^3.0+1800.0*4.0*x^3.0+6.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "33600.0*x^4.0*(3+5*x)+33600.0*x^5.0+33600.0*x^5.0+33600.0*x^5.0+33600.0*x^5.0+4320.0*x^2.0*(3+5*x)+7200.0*x^3.0+7200.0*x^3.0+7200.0*x^3.0+7200.0*x^3.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/1.8333333333333333*x^11.0+1.0/4.8*x^4.0-1.0/2.0624999999999996*x^11.0+1.0/3.3000000000000003*x^12.0+1.0/2.0*x^9.0+1.0/4.8*x^4.0-1.0/2.3333333333333335*x^9.0+1.0/4.0*x^10.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/1.8333333333333333/12.0*x^12.0+1.0/4.8/5.0*x^5.0-1.0/2.0624999999999996/12.0*x^12.0+1.0/3.3000000000000003/13.0*x^13.0+1.0/2.0/10.0*x^10.0+1.0/4.8/5.0*x^5.0-1.0/2.3333333333333335/10.0*x^10.0+1.0/4.0/11.0*x^11.0+1.0/120.0/7.0*x^7.0-1.0/12.0/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/22.0*x^12.0+1.0/24.0*x^5.0-1.0/24.749999999999993*x^12.0+1.0/42.900000000000006*x^13.0+1.0/20.0*x^10.0+1.0/24.0*x^5.0-1.0/23.333333333333336*x^10.0+1.0/44.0*x^11.0+1.0/840.0*x^7.0-1.0/60.0*x^5.0-2.0833333333333335*x^4.0";
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
        public static void TestCaseDiff80076() {
        //Test Case 80076
        UsageCalculus.TestCase = 80076;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*(x-2)/(x+2)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "(x-2)/(x+2)";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "";
        UsageCalculus.EqnSolArrayMap2[1] = "";
        UsageCalculus.EqnSolArrayMap3[1]="(x-2)/(x+2)";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="";
        UsageCalculus.EqnSolArrayMap4[1]="";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
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
        public static void TestCaseDiff80077() {
        //Test Case 80077
        UsageCalculus.TestCase = 80077;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(x-2)*(x+3)/(x-4)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "5.0*x^8.0+x^4.0+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "5.0*8.0*x^7.0+4.0*x^3.0+3.0*x^2.0-2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "40.0*x^7.0+4.0*x^3.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
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
        public static void TestCaseDiff80078() {
        //Test Case 80078
        UsageCalculus.TestCase = 80078;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1/(1+exp(x))";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "5.0*x^8.0+x^4.0+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "5.0*8.0*x^7.0+4.0*x^3.0+3.0*x^2.0-2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "40.0*x^7.0+4.0*x^3.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
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
        public static void TestCaseDiff80079() {
        //Test Case 80079
        UsageCalculus.TestCase = 80079;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(x-2)^5";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "5.0*x^8.0+x^4.0+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "5.0*8.0*x^7.0+4.0*x^3.0+3.0*x^2.0-2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "40.0*x^7.0+4.0*x^3.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
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
        public static void TestCaseDiff80080() {
        //Test Case 80080
        UsageCalculus.TestCase = 80080;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(6+5*x+a)*4/x*5*x + x^5/x*(7+2*x+a)*2*6*x^2 + x^4/x - (2)*x*(5)/5- (2)*25*(2)/2";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "20.0*x^8.0*(6+5*x+a)+12.0*x^6.0*(7+2*x+a)+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "20.0*8.0*x^7.0*(6+5*x+a)+20.0*x^8.0*(0.0+5+a*0.0)+12.0*6.0*x^5.0*(7+2*x+a)+12.0*x^6.0*(0.0+2+a*0.0)+3.0*x^2.0-2.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "160.0*x^7.0*(6+5*x+a)+(0.0+5+a*0.0)*20.0*x^8.0+72.0*x^5.0*(7+2*x+a)+(0.0+2+a*0.0)*12.0*x^6.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="20.0*x^8.0*(6+5*x+a)+12.0*x^6.0*(7+2*x+a)+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="20.0*x^8.0*6*x+5.0/2.0*x^2.0+a*x-960.0/9.0*x^9.0+400.0/10.0*x^10.0+a*160.0/9.0*x^9.0+12.0*x^6.0*7*x+x^2.0+a*x-504.0/7.0*x^7.0+72.0/8.0*x^8.0+a*72.0/7.0*x^7.0+1.0/4.0*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="120.0*x^9.0+2.5*x^2.0+a*x-106.66666666666667*x^9.0+40.0*x^10.0+a*17.77777777777778*x^9.0+84.0*x^7.0+x^2.0+a*x-72.0*x^7.0+9.0*x^8.0+a*10.285714285714286*x^7.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "160.0*x^7.0*(6+5*x+a)+(0.0+5+a*0.0)*20.0*x^8.0+72.0*x^5.0*(7+2*x+a)+(0.0+2+a*0.0)*12.0*x^6.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "160.0*7.0*x^6.0*(6+5*x+a)+160.0*x^7.0*(0.0+5+a*0.0)+(0.0+5+a*0.0)*20.0+72.0*5.0*x^4.0*(7+2*x+a)+72.0*x^5.0*(0.0+2+a*0.0)+(0.0+2+a*0.0)*12.0+3.0*2.0*x^1.0-2.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "1120.0*x^6.0*(6+5*x+a)+(0.0+5+a*0.0)*160.0*x^7.0+(0.0+5+a*0.0)*20.0+360.0*x^4.0*(7+2*x+a)+(0.0+2+a*0.0)*72.0*x^5.0+(0.0+2+a*0.0)*12.0+6.0*x";
        UsageCalculus.EqnSolArrayMap3[2]="120.0*x^9.0+2.5*x^2.0+a*x-106.66666666666667*x^9.0+40.0*x^10.0+a*17.77777777777778*x^9.0+84.0*x^7.0+x^2.0+a*x-72.0*x^7.0+9.0*x^8.0+a*10.285714285714286*x^7.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="120.0/10.0*x^10.0+2.5/3.0*x^3.0+a/2.0*x^2.0-106.66666666666667/10.0*x^10.0+40.0/11.0*x^11.0+a*17.77777777777778/10.0*x^10.0+84.0/8.0*x^8.0+1.0/3.0*x^3.0+a/2.0*x^2.0-72.0/8.0*x^8.0+9.0/9.0*x^9.0+a*10.285714285714286/8.0*x^8.0+0.25/5.0*x^5.0-1.0/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="12.0*x^10.0+0.8333333333333334*x^3.0+a/2.0*x^2.0-10.666666666666668*x^10.0+3.6363636363636362*x^11.0+a*1.777777777777778*x^10.0+10.5*x^8.0+0.3333333333333333*x^3.0+a/2.0*x^2.0-9.0*x^8.0+x^9.0+a*1.2857142857142858*x^8.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "1120.0*x^6.0*(6+5*x+a)+(0.0+5+a*0.0)*160.0*x^7.0+(0.0+5+a*0.0)*20.0+360.0*x^4.0*(7+2*x+a)+(0.0+2+a*0.0)*72.0*x^5.0+(0.0+2+a*0.0)*12.0+6.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "1120.0*6.0*x^5.0*(6+5*x+a)+1120.0*x^6.0*(0.0+5+a*0.0)+(0.0+5+a*0.0)*160.0+(0.0+5+a*0.0)*20.0*0.0+360.0*4.0*x^3.0*(7+2*x+a)+360.0*x^4.0*(0.0+2+a*0.0)+(0.0+2+a*0.0)*72.0+(0.0+2+a*0.0)*12.0*0.0+6.0";
        UsageCalculus.EqnSolArrayMap2[3] = "6720.0*x^5.0*(6+5*x+a)+(0.0+5+a*0.0)*1120.0*x^6.0+(0.0+5+a*0.0)*160.0+(0.0+5+a*0.0)*0.0+1440.0*x^3.0*(7+2*x+a)+(0.0+2+a*0.0)*360.0*x^4.0+(0.0+2+a*0.0)*72.0+(0.0+2+a*0.0)*0.0+6.0";
        UsageCalculus.EqnSolArrayMap3[3]="12.0*x^10.0+0.8333333333333334*x^3.0+a/2.0*x^2.0-10.666666666666668*x^10.0+3.6363636363636362*x^11.0+a*1.777777777777778*x^10.0+10.5*x^8.0+0.3333333333333333*x^3.0+a/2.0*x^2.0-9.0*x^8.0+x^9.0+a*1.2857142857142858*x^8.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="12.0/11.0*x^11.0+0.8333333333333334/4.0*x^4.0+a/2.0/3.0*x^3.0-10.666666666666668/11.0*x^11.0+3.6363636363636362/12.0*x^12.0+a*1.777777777777778/11.0*x^11.0+10.5/9.0*x^9.0+0.3333333333333333/4.0*x^4.0+a/2.0/3.0*x^3.0-9.0/9.0*x^9.0+1.0/10.0*x^10.0+a*1.2857142857142858/9.0*x^9.0+1.0/20.0/6.0*x^6.0-1.0/3.0/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0909090909090908*x^11.0+0.20833333333333334*x^4.0+a/6.0*x^3.0-1.0/1.0312499999999998*x^11.0+0.30303030303030304*x^12.0+a/6.1875*x^11.0+1.1666666666666667*x^9.0+0.08333333333333333*x^4.0+a/6.0*x^3.0-x^9.0+0.1*x^10.0+a/6.999999999999999*x^9.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "6720.0*x^5.0*(6+5*x+a)+(0.0+5+a*0.0)*1120.0*x^6.0+(0.0+5+a*0.0)*160.0+(0.0+5+a*0.0)*0.0+1440.0*x^3.0*(7+2*x+a)+(0.0+2+a*0.0)*360.0*x^4.0+(0.0+2+a*0.0)*72.0+(0.0+2+a*0.0)*0.0+6.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "6720.0*5.0*x^4.0*(6+5*x+a)+6720.0*x^5.0*(0.0+5+a*0.0)+(0.0+5+a*0.0)*1120.0+(0.0+5+a*0.0)*160.0*0.0+(0.0+5+a*0.0)*0.0*0.0+1440.0*3.0*x^2.0*(7+2*x+a)+1440.0*x^3.0*(0.0+2+a*0.0)+(0.0+2+a*0.0)*360.0+(0.0+2+a*0.0)*72.0*0.0+(0.0+2+a*0.0)*0.0*0.0+6.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "33600.0*x^4.0*(6+5*x+a)+(0.0+5+a*0.0)*6720.0*x^5.0+(0.0+5+a*0.0)*1120.0+(0.0+5+a*0.0)*0.0+(0.0+5+a*0.0)*0.0+4320.0*x^2.0*(7+2*x+a)+(0.0+2+a*0.0)*1440.0*x^3.0+(0.0+2+a*0.0)*360.0+(0.0+2+a*0.0)*0.0+(0.0+2+a*0.0)*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0909090909090908*x^11.0+0.20833333333333334*x^4.0+a/6.0*x^3.0-1.0/1.0312499999999998*x^11.0+0.30303030303030304*x^12.0+a/6.1875*x^11.0+1.1666666666666667*x^9.0+0.08333333333333333*x^4.0+a/6.0*x^3.0-x^9.0+0.1*x^10.0+a/6.999999999999999*x^9.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0909090909090908/12.0*x^12.0+0.20833333333333334/5.0*x^5.0+a/6.0/4.0*x^4.0-1.0/1.0312499999999998/12.0*x^12.0+0.30303030303030304/13.0*x^13.0+a/6.1875/12.0*x^12.0+1.1666666666666667/10.0*x^10.0+0.08333333333333333/5.0*x^5.0+a/6.0/4.0*x^4.0-1.0/10.0*x^10.0+0.1/11.0*x^11.0+a/6.999999999999999/10.0*x^10.0+1.0/120.0/7.0*x^7.0-1.0/12.0/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/11.0*x^12.0+0.04166666666666667*x^5.0+a/24.0*x^4.0-1.0/12.374999999999996*x^12.0+0.023310023310023312*x^13.0+a/74.25*x^12.0+1.0/8.571428571428571*x^10.0+0.016666666666666666*x^5.0+a/24.0*x^4.0-1.0/10.0*x^10.0+0.009090909090909092*x^11.0+a/69.99999999999999*x^10.0+1.0/840.0*x^7.0-1.0/60.0*x^5.0-2.0833333333333335*x^4.0";
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
        public static void TestCaseDiff80081() {
        //Test Case 80081
        UsageCalculus.TestCase = 80081;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(6+5*x+a)*b*4/x*5*x + x^5/x*(3+5*x)*2*6*x^2 + x^4/x - (2)*x*(5)/5- (2)*25*(2)/2";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "b*20.0*x^8.0*(6+5*x+a)+12.0*x^6.0*(3+5*x)+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "b*20.0*8.0*x^7.0*(6+5*x+a)+b*20.0*x^8.0*(0.0+5+a*0.0)+12.0*6.0*x^5.0*(3+5*x)+12.0*x^6.0*(0.0+5)+3.0*x^2.0-2.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "b*x^7.0+b*(0.0+5+a*0.0)*x^8.0+72.0*x^5.0*(3+5*x)+60.0*x^6.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="b*20.0*x^8.0*(6+5*x+a)+12.0*x^6.0*(3+5*x)+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="b*6*x+5.0/2.0*x^2.0+a*x-b*0.0/2.0*x^2.0+b*0.0/3.0*x^3.0+a*b*0.0/2.0*x^2.0+12.0*x^6.0*3*x+5.0/2.0*x^2.0-216.0/7.0*x^7.0+180.0/8.0*x^8.0+1.0/4.0*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="b*6.0*x+2.5*x^2.0+a*x-b*0.0*x^2.0+b*0.0*x^3.0+a*b*0.0*x^2.0+36.0*x^7.0+2.5*x^2.0-30.857142857142858*x^7.0+22.5*x^8.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "b*x^7.0+b*x^8.0+72.0*x^5.0*(3+5*x)+60.0*x^6.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "b*7.0*x^6.0+b*8.0*x^7.0+72.0*5.0*x^4.0*(3+5*x)+72.0*x^5.0*(0.0+5)+60.0*6.0*x^5.0+3.0*2.0*x^1.0-2.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "b*7.0*x^6.0+b*8.0*x^7.0+360.0*x^4.0*(3+5*x)+360.0*x^5.0+360.0*x^5.0+6.0*x";
        UsageCalculus.EqnSolArrayMap3[2]="b*6.0*x+2.5*x^2.0+a*x-b*0.0*x^2.0+b*0.0*x^3.0+a*b*0.0*x^2.0+36.0*x^7.0+2.5*x^2.0-30.857142857142858*x^7.0+22.5*x^8.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="b*6.0/2.0*x^2.0+2.5/3.0*x^3.0+a/2.0*x^2.0-b*0.0/3.0*x^3.0+b*0.0/4.0*x^4.0+a*b*0.0/3.0*x^3.0+36.0/8.0*x^8.0+2.5/3.0*x^3.0-30.857142857142858/8.0*x^8.0+22.5/9.0*x^9.0+0.25/5.0*x^5.0-1.0/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="b*3.0*x^2.0+0.8333333333333334*x^3.0+a/2.0*x^2.0-b*0.0*x^3.0+b*0.0*x^4.0+a*b*0.0*x^3.0+4.5*x^8.0+1.0/1.2*x^3.0-3.857142857142857*x^8.0+2.5*x^9.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "b*7.0*x^6.0+b*8.0*x^7.0+360.0*x^4.0*(3+5*x)+360.0*x^5.0+360.0*x^5.0+6.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "b*7.0*6.0*x^5.0+b*8.0*7.0*x^6.0+360.0*4.0*x^3.0*(3+5*x)+360.0*x^4.0*(0.0+5)+360.0*5.0*x^4.0+360.0*5.0*x^4.0+6.0";
        UsageCalculus.EqnSolArrayMap2[3] = "b*42.0*x^5.0+b*56.0*x^6.0+1440.0*x^3.0*(3+5*x)+1800.0*x^4.0+1800.0*x^4.0+1800.0*x^4.0+6.0";
        UsageCalculus.EqnSolArrayMap3[3]="b*3.0*x^2.0+0.8333333333333334*x^3.0+a/2.0*x^2.0-b*0.0*x^3.0+b*0.0*x^4.0+a*b*0.0*x^3.0+4.5*x^8.0+1.0/1.2*x^3.0-3.857142857142857*x^8.0+2.5*x^9.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="b*3.0/3.0*x^3.0+0.8333333333333334/4.0*x^4.0+a/2.0/3.0*x^3.0-b*0.0/4.0*x^4.0+b*0.0/5.0*x^5.0+a*b*0.0/4.0*x^4.0+4.5/9.0*x^9.0+1.0/1.2/4.0*x^4.0-3.857142857142857/9.0*x^9.0+2.5/10.0*x^10.0+1.0/20.0/6.0*x^6.0-1.0/3.0/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="b*x^3.0+0.20833333333333334*x^4.0+a*0.16666666666666666*x^3.0-b*0.0*x^4.0+b*0.0*x^5.0+a*b*0.0*x^4.0+1.0/2.0*x^9.0+1.0/4.8*x^4.0-1.0/2.3333333333333335*x^9.0+1.0/4.0*x^10.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "b*42.0*x^5.0+b*56.0*x^6.0+1440.0*x^3.0*(3+5*x)+1800.0*x^4.0+1800.0*x^4.0+1800.0*x^4.0+6.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "b*42.0*5.0*x^4.0+b*56.0*6.0*x^5.0+1440.0*3.0*x^2.0*(3+5*x)+1440.0*x^3.0*(0.0+5)+1800.0*4.0*x^3.0+1800.0*4.0*x^3.0+1800.0*4.0*x^3.0+6.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "b*210.0*x^4.0+b*336.0*x^5.0+4320.0*x^2.0*(3+5*x)+7200.0*x^3.0+7200.0*x^3.0+7200.0*x^3.0+7200.0*x^3.0";
        UsageCalculus.EqnSolArrayMap3[4]="b*x^3.0+0.20833333333333334*x^4.0+a*0.16666666666666666*x^3.0-b*0.0*x^4.0+b*0.0*x^5.0+a*b*0.0*x^4.0+1.0/2.0*x^9.0+1.0/4.8*x^4.0-1.0/2.3333333333333335*x^9.0+1.0/4.0*x^10.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="b/4.0*x^4.0+0.20833333333333334/5.0*x^5.0+a*0.16666666666666666/4.0*x^4.0-b*0.0/5.0*x^5.0+b*0.0/6.0*x^6.0+a*b*0.0/5.0*x^5.0+1.0/2.0/10.0*x^10.0+1.0/4.8/5.0*x^5.0-1.0/2.3333333333333335/10.0*x^10.0+1.0/4.0/11.0*x^11.0+1.0/120.0/7.0*x^7.0-1.0/12.0/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="b/4.0*x^4.0+0.04166666666666667*x^5.0+a*0.041666666666666664*x^4.0-b*0.0*x^5.0+b*0.0*x^6.0+a*b*0.0*x^5.0+1.0/20.0*x^10.0+1.0/24.0*x^5.0-1.0/23.333333333333336*x^10.0+1.0/44.0*x^11.0+1.0/840.0*x^7.0-1.0/60.0*x^5.0-2.0833333333333335*x^4.0";
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
        public static void TestCaseDiff80082() {
        //Test Case 80082
        UsageCalculus.TestCase = 80082;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(3+5*x+a)*4/x*5*x + x^5/x*(3+5*x+a)*2*6*x^2 + x^4/x - (2)*x*(5)/5- (2)*25*(2)/2";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "20.0*x^8.0*(3+5*x+a)+12.0*x^6.0*(3+5*x+a)+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "20.0*8.0*x^7.0*(3+5*x+a)+20.0*x^8.0*(0.0+5+a*0.0)+12.0*6.0*x^5.0*(3+5*x+a)+12.0*x^6.0*(0.0+5+a*0.0)+3.0*x^2.0-2.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "160.0*x^7.0*(3+5*x+a)+(0.0+5+a*0.0)*20.0*x^8.0+72.0*x^5.0*(3+5*x+a)+(0.0+5+a*0.0)*12.0*x^6.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="20.0*x^8.0*(3+5*x+a)+12.0*x^6.0*(3+5*x+a)+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="20.0*x^8.0*3*x+5.0/2.0*x^2.0+a*x-480.0/9.0*x^9.0+400.0/10.0*x^10.0+a*160.0/9.0*x^9.0+12.0*x^6.0*3*x+5.0/2.0*x^2.0+a*x-216.0/7.0*x^7.0+180.0/8.0*x^8.0+a*72.0/7.0*x^7.0+1.0/4.0*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="60.0*x^9.0+2.5*x^2.0+a*x-53.333333333333336*x^9.0+40.0*x^10.0+a*17.77777777777778*x^9.0+36.0*x^7.0+2.5*x^2.0+a*x-30.857142857142858*x^7.0+22.5*x^8.0+a*10.285714285714286*x^7.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "160.0*x^7.0*(3+5*x+a)+(0.0+5+a*0.0)*20.0*x^8.0+72.0*x^5.0*(3+5*x+a)+(0.0+5+a*0.0)*12.0*x^6.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "160.0*7.0*x^6.0*(3+5*x+a)+160.0*x^7.0*(0.0+5+a*0.0)+(0.0+5+a*0.0)*20.0+72.0*5.0*x^4.0*(3+5*x+a)+72.0*x^5.0*(0.0+5+a*0.0)+(0.0+5+a*0.0)*12.0+3.0*2.0*x^1.0-2.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "1120.0*x^6.0*(3+5*x+a)+(0.0+5+a*0.0)*160.0*x^7.0+(0.0+5+a*0.0)*20.0+360.0*x^4.0*(3+5*x+a)+(0.0+5+a*0.0)*72.0*x^5.0+(0.0+5+a*0.0)*12.0+6.0*x";
        UsageCalculus.EqnSolArrayMap3[2]="60.0*x^9.0+2.5*x^2.0+a*x-53.333333333333336*x^9.0+40.0*x^10.0+a*17.77777777777778*x^9.0+36.0*x^7.0+2.5*x^2.0+a*x-30.857142857142858*x^7.0+22.5*x^8.0+a*10.285714285714286*x^7.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="60.0/10.0*x^10.0+2.5/3.0*x^3.0+a/2.0*x^2.0-53.333333333333336/10.0*x^10.0+40.0/11.0*x^11.0+a*17.77777777777778/10.0*x^10.0+36.0/8.0*x^8.0+2.5/3.0*x^3.0+a/2.0*x^2.0-30.857142857142858/8.0*x^8.0+22.5/9.0*x^9.0+a*10.285714285714286/8.0*x^8.0+0.25/5.0*x^5.0-1.0/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="6.0*x^10.0+0.8333333333333334*x^3.0+a/2.0*x^2.0-5.333333333333334*x^10.0+3.6363636363636362*x^11.0+a*1.777777777777778*x^10.0+4.5*x^8.0+0.8333333333333334*x^3.0+a/2.0*x^2.0-3.857142857142857*x^8.0+2.5*x^9.0+a*1.2857142857142858*x^8.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "1120.0*x^6.0*(3+5*x+a)+(0.0+5+a*0.0)*160.0*x^7.0+(0.0+5+a*0.0)*20.0+360.0*x^4.0*(3+5*x+a)+(0.0+5+a*0.0)*72.0*x^5.0+(0.0+5+a*0.0)*12.0+6.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "1120.0*6.0*x^5.0*(3+5*x+a)+1120.0*x^6.0*(0.0+5+a*0.0)+(0.0+5+a*0.0)*160.0+(0.0+5+a*0.0)*20.0*0.0+360.0*4.0*x^3.0*(3+5*x+a)+360.0*x^4.0*(0.0+5+a*0.0)+(0.0+5+a*0.0)*72.0+(0.0+5+a*0.0)*12.0*0.0+6.0";
        UsageCalculus.EqnSolArrayMap2[3] = "6720.0*x^5.0*(3+5*x+a)+(0.0+5+a*0.0)*1120.0*x^6.0+(0.0+5+a*0.0)*160.0+(0.0+5+a*0.0)*0.0+1440.0*x^3.0*(3+5*x+a)+(0.0+5+a*0.0)*360.0*x^4.0+(0.0+5+a*0.0)*72.0+(0.0+5+a*0.0)*0.0+6.0";
        UsageCalculus.EqnSolArrayMap3[3]="6.0*x^10.0+0.8333333333333334*x^3.0+a/2.0*x^2.0-5.333333333333334*x^10.0+3.6363636363636362*x^11.0+a*1.777777777777778*x^10.0+4.5*x^8.0+0.8333333333333334*x^3.0+a/2.0*x^2.0-3.857142857142857*x^8.0+2.5*x^9.0+a*1.2857142857142858*x^8.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="6.0/11.0*x^11.0+0.8333333333333334/4.0*x^4.0+a/2.0/3.0*x^3.0-5.333333333333334/11.0*x^11.0+3.6363636363636362/12.0*x^12.0+a*1.777777777777778/11.0*x^11.0+4.5/9.0*x^9.0+0.8333333333333334/4.0*x^4.0+a/2.0/3.0*x^3.0-3.857142857142857/9.0*x^9.0+2.5/10.0*x^10.0+a*1.2857142857142858/9.0*x^9.0+1.0/20.0/6.0*x^6.0-1.0/3.0/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/1.8333333333333333*x^11.0+0.20833333333333334*x^4.0+a/6.0*x^3.0-1.0/2.0624999999999996*x^11.0+0.30303030303030304*x^12.0+a/6.1875*x^11.0+1.0/2.0*x^9.0+0.20833333333333334*x^4.0+a/6.0*x^3.0-1.0/2.3333333333333335*x^9.0+0.25*x^10.0+a/6.999999999999999*x^9.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "6720.0*x^5.0*(3+5*x+a)+(0.0+5+a*0.0)*1120.0*x^6.0+(0.0+5+a*0.0)*160.0+(0.0+5+a*0.0)*0.0+1440.0*x^3.0*(3+5*x+a)+(0.0+5+a*0.0)*360.0*x^4.0+(0.0+5+a*0.0)*72.0+(0.0+5+a*0.0)*0.0+6.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "6720.0*5.0*x^4.0*(3+5*x+a)+6720.0*x^5.0*(0.0+5+a*0.0)+(0.0+5+a*0.0)*1120.0+(0.0+5+a*0.0)*160.0*0.0+(0.0+5+a*0.0)*0.0*0.0+1440.0*3.0*x^2.0*(3+5*x+a)+1440.0*x^3.0*(0.0+5+a*0.0)+(0.0+5+a*0.0)*360.0+(0.0+5+a*0.0)*72.0*0.0+(0.0+5+a*0.0)*0.0*0.0+6.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "33600.0*x^4.0*(3+5*x+a)+(0.0+5+a*0.0)*6720.0*x^5.0+(0.0+5+a*0.0)*1120.0+(0.0+5+a*0.0)*0.0+(0.0+5+a*0.0)*0.0+4320.0*x^2.0*(3+5*x+a)+(0.0+5+a*0.0)*1440.0*x^3.0+(0.0+5+a*0.0)*360.0+(0.0+5+a*0.0)*0.0+(0.0+5+a*0.0)*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/1.8333333333333333*x^11.0+0.20833333333333334*x^4.0+a/6.0*x^3.0-1.0/2.0624999999999996*x^11.0+0.30303030303030304*x^12.0+a/6.1875*x^11.0+1.0/2.0*x^9.0+0.20833333333333334*x^4.0+a/6.0*x^3.0-1.0/2.3333333333333335*x^9.0+0.25*x^10.0+a/6.999999999999999*x^9.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/1.8333333333333333/12.0*x^12.0+0.20833333333333334/5.0*x^5.0+a/6.0/4.0*x^4.0-1.0/2.0624999999999996/12.0*x^12.0+0.30303030303030304/13.0*x^13.0+a/6.1875/12.0*x^12.0+1.0/2.0/10.0*x^10.0+0.20833333333333334/5.0*x^5.0+a/6.0/4.0*x^4.0-1.0/2.3333333333333335/10.0*x^10.0+0.25/11.0*x^11.0+a/6.999999999999999/10.0*x^10.0+1.0/120.0/7.0*x^7.0-1.0/12.0/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/22.0*x^12.0+0.04166666666666667*x^5.0+a/24.0*x^4.0-1.0/24.749999999999993*x^12.0+0.023310023310023312*x^13.0+a/74.25*x^12.0+1.0/20.0*x^10.0+0.04166666666666667*x^5.0+a/24.0*x^4.0-1.0/23.333333333333336*x^10.0+0.022727272727272728*x^11.0+a/69.99999999999999*x^10.0+1.0/840.0*x^7.0-1.0/60.0*x^5.0-2.0833333333333335*x^4.0";
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
        public static void TestCaseDiff80083() {
        //Test Case 80083
        UsageCalculus.TestCase = 80083;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(3+5*x+a)*a*4/x*5*x + x^5/x*(3+5*x+a)*a*2*6*x^2 + x^4/x - (2)*x*(5)/5- (2)*25*(2)/2";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a*20.0*x^8.0*(3+5*x+a)+a*12.0*x^6.0*(3+5*x+a)+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a*20.0*8.0*x^7.0*(3+5*x+a)+a*20.0*x^8.0*(0.0+5+a*0.0)+a*12.0*6.0*x^5.0*(3+5*x+a)+a*12.0*x^6.0*(0.0+5+a*0.0)+3.0*x^2.0-2.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a*x^7.0+a*(0.0+5+a*0.0)*x^8.0+a*x^5.0+a*(0.0+5+a*0.0)*x^6.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="a*20.0*x^8.0*(3+5*x+a)+a*12.0*x^6.0*(3+5*x+a)+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a*3*x+5.0/2.0*x^2.0+a*x-a*0.0/2.0*x^2.0+a*0.0/3.0*x^3.0+a*a*0.0/2.0*x^2.0+a*3*x+5.0/2.0*x^2.0+a*x-a*0.0/2.0*x^2.0+a*0.0/3.0*x^3.0+a*a*0.0/2.0*x^2.0+1.0/4.0*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a*3.0*x+2.5*x^2.0+a*x-a*0.0*x^2.0+a*0.0*x^3.0+a*a*0.0*x^2.0+a*3.0*x+2.5*x^2.0+a*x-a*0.0*x^2.0+a*0.0*x^3.0+a*a*0.0*x^2.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a*x^7.0+a*x^8.0+a*x^5.0+a*x^6.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a*7.0*x^6.0+a*8.0*x^7.0+a*5.0*x^4.0+a*6.0*x^5.0+3.0*2.0*x^1.0-2.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a*7.0*x^6.0+a*8.0*x^7.0+a*5.0*x^4.0+a*6.0*x^5.0+6.0*x";
        UsageCalculus.EqnSolArrayMap3[2]="a*3.0*x+2.5*x^2.0+a*x-a*0.0*x^2.0+a*0.0*x^3.0+a*a*0.0*x^2.0+a*3.0*x+2.5*x^2.0+a*x-a*0.0*x^2.0+a*0.0*x^3.0+a*a*0.0*x^2.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a*3.0/2.0*x^2.0+2.5/3.0*x^3.0+a/2.0*x^2.0-a*0.0/3.0*x^3.0+a*0.0/4.0*x^4.0+a*a*0.0/3.0*x^3.0+a*3.0/2.0*x^2.0+2.5/3.0*x^3.0+a/2.0*x^2.0-a*0.0/3.0*x^3.0+a*0.0/4.0*x^4.0+a*a*0.0/3.0*x^3.0+0.25/5.0*x^5.0-1.0/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a*1.5*x^2.0+0.8333333333333334*x^3.0+a/2.0*x^2.0-a*0.0*x^3.0+a*0.0*x^4.0+a*a*0.0*x^3.0+a*1.5*x^2.0+0.8333333333333334*x^3.0+a/2.0*x^2.0-a*0.0*x^3.0+a*0.0*x^4.0+a*a*0.0*x^3.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a*7.0*x^6.0+a*8.0*x^7.0+a*5.0*x^4.0+a*6.0*x^5.0+6.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a*7.0*6.0*x^5.0+a*8.0*7.0*x^6.0+a*5.0*4.0*x^3.0+a*6.0*5.0*x^4.0+6.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a*42.0*x^5.0+a*56.0*x^6.0+a*20.0*x^3.0+a*30.0*x^4.0+6.0";
        UsageCalculus.EqnSolArrayMap3[3]="a*1.5*x^2.0+0.8333333333333334*x^3.0+a/2.0*x^2.0-a*0.0*x^3.0+a*0.0*x^4.0+a*a*0.0*x^3.0+a*1.5*x^2.0+0.8333333333333334*x^3.0+a/2.0*x^2.0-a*0.0*x^3.0+a*0.0*x^4.0+a*a*0.0*x^3.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a*1.5/3.0*x^3.0+0.8333333333333334/4.0*x^4.0+a/2.0/3.0*x^3.0-a*0.0/4.0*x^4.0+a*0.0/5.0*x^5.0+a*a*0.0/4.0*x^4.0+a*1.5/3.0*x^3.0+0.8333333333333334/4.0*x^4.0+a/2.0/3.0*x^3.0-a*0.0/4.0*x^4.0+a*0.0/5.0*x^5.0+a*a*0.0/4.0*x^4.0+1.0/20.0/6.0*x^6.0-1.0/3.0/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a/2.0*x^3.0+0.20833333333333334*x^4.0+a*0.16666666666666666*x^3.0-a*0.0*x^4.0+a*0.0*x^5.0+a*a*0.0*x^4.0+a/2.0*x^3.0+0.20833333333333334*x^4.0+a*0.16666666666666666*x^3.0-a*0.0*x^4.0+a*0.0*x^5.0+a*a*0.0*x^4.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a*42.0*x^5.0+a*56.0*x^6.0+a*20.0*x^3.0+a*30.0*x^4.0+6.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a*42.0*5.0*x^4.0+a*56.0*6.0*x^5.0+a*20.0*3.0*x^2.0+a*30.0*4.0*x^3.0+6.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a*210.0*x^4.0+a*336.0*x^5.0+a*60.0*x^2.0+a*120.0*x^3.0";
        UsageCalculus.EqnSolArrayMap3[4]="a/2.0*x^3.0+0.20833333333333334*x^4.0+a*0.16666666666666666*x^3.0-a*0.0*x^4.0+a*0.0*x^5.0+a*a*0.0*x^4.0+a/2.0*x^3.0+0.20833333333333334*x^4.0+a*0.16666666666666666*x^3.0-a*0.0*x^4.0+a*0.0*x^5.0+a*a*0.0*x^4.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a/2.0/4.0*x^4.0+0.20833333333333334/5.0*x^5.0+a*0.16666666666666666/4.0*x^4.0-a*0.0/5.0*x^5.0+a*0.0/6.0*x^6.0+a*a*0.0/5.0*x^5.0+a/2.0/4.0*x^4.0+0.20833333333333334/5.0*x^5.0+a*0.16666666666666666/4.0*x^4.0-a*0.0/5.0*x^5.0+a*0.0/6.0*x^6.0+a*a*0.0/5.0*x^5.0+1.0/120.0/7.0*x^7.0-1.0/12.0/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a/8.0*x^4.0+0.04166666666666667*x^5.0+a*0.041666666666666664*x^4.0-a*0.0*x^5.0+a*0.0*x^6.0+a*a*0.0*x^5.0+a/8.0*x^4.0+0.04166666666666667*x^5.0+a*0.041666666666666664*x^4.0-a*0.0*x^5.0+a*0.0*x^6.0+a*a*0.0*x^5.0+1.0/840.0*x^7.0-1.0/60.0*x^5.0-2.0833333333333335*x^4.0";
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
    public static void TestCaseDiff80084() {
        //Test Case 80084
        UsageCalculus.TestCase = 80084;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(5*x)/x + x^5/x -x^8*(5*x)/x+ x^4/x - (2)*x*5/5- (2)*25*(2)/2";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "5.0*x^8.0+x^4.0-5.0*x^8.0+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "5.0*8.0*x^7.0+4.0*x^3.0-5.0*8.0*x^7.0+3.0*x^2.0-2.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "40.0*x^7.0+4.0*x^3.0-40.0*x^7.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="5.0*x^8.0+x^4.0-5.0*x^8.0+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="5.0/9.0*x^9.0+1.0/5.0*x^5.0-5.0/9.0*x^9.0+1.0/4.0*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1.8*x^9.0+1.0/5.0*x^5.0-1.0/1.8*x^9.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "40.0*x^7.0+4.0*x^3.0-40.0*x^7.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "40.0*7.0*x^6.0+4.0*3.0*x^2.0-40.0*7.0*x^6.0+3.0*2.0*x^1.0-2.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "280.0*x^6.0+12.0*x^2.0-280.0*x^6.0+6.0*x";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/1.8*x^9.0+1.0/5.0*x^5.0-1.0/1.8*x^9.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/1.8/10.0*x^10.0+1.0/5.0/6.0*x^6.0-1.0/1.8/10.0*x^10.0+0.25/5.0*x^5.0-1.0/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/18.0*x^10.0+1.0/30.0*x^6.0-1.0/18.0*x^10.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "280.0*x^6.0+12.0*x^2.0-280.0*x^6.0+6.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "280.0*6.0*x^5.0+12.0*2.0*x^1.0-280.0*6.0*x^5.0+6.0";
        UsageCalculus.EqnSolArrayMap2[3] = "1680.0*x^5.0+24.0*x-1680.0*x^5.0+6.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/18.0*x^10.0+1.0/30.0*x^6.0-1.0/18.0*x^10.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/18.0/11.0*x^11.0+1.0/30.0/7.0*x^7.0-1.0/18.0/11.0*x^11.0+1.0/20.0/6.0*x^6.0-1.0/3.0/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/198.0*x^11.0+1.0/210.0*x^7.0-1.0/198.0*x^11.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "1680.0*x^5.0+24.0*x-1680.0*x^5.0+6.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "1680.0*5.0*x^4.0+24.0-1680.0*5.0*x^4.0+6.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "8400.0*x^4.0+24.0-8400.0*x^4.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/198.0*x^11.0+1.0/210.0*x^7.0-1.0/198.0*x^11.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/198.0/12.0*x^12.0+1.0/210.0/8.0*x^8.0-1.0/198.0/12.0*x^12.0+1.0/120.0/7.0*x^7.0-1.0/12.0/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/2376.0*x^12.0+1.0/1680.0*x^8.0-1.0/2376.0*x^12.0+1.0/840.0*x^7.0-1.0/60.0*x^5.0-2.0833333333333335*x^4.0";
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
    public static void TestCaseDiff80085() {
        //Test Case 80085
        UsageCalculus.TestCase = 80085;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*(x-25)/0";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "";
        UsageCalculus.EqnSolArrayMap2[1] = "";
        UsageCalculus.EqnSolArrayMap3[1]="Infinity";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="Infinity*x";
        UsageCalculus.EqnSolArrayMap4[1]="Infinity*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="Infinity*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="Infinity/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="Infinity/2.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="Infinity/2.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="Infinity*2.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="Infinity*0.6666666666666666*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4]="Infinity*0.6666666666666666*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="Infinity*0.6666666666666666/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="Infinity*0.16666666666666666*x^4.0";
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
    public static void TestCaseDiff80086() {
        //Test Case 80086
        UsageCalculus.TestCase = 80086;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*(x-25)/1";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 3;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x-25";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0";
        UsageCalculus.EqnSolArrayMap3[1]="x-25";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="x^2.0/2.0-25*x";
        UsageCalculus.EqnSolArrayMap4[1]="x^2.0/2.0-25*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "0.0";
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
    public static void TestCaseDiff80087() {
        //Test Case 80087
        UsageCalculus.TestCase = 80087;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(x-25)/5";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "(x-25)/5";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/5.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0/5.0";
        UsageCalculus.EqnSolArrayMap3[1]="(x-25)/5";
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
        
     public static void TestCaseDiff80093() {
        //Test Case 80093
        UsageCalculus.TestCase = 80093;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*x^8*(6+5*x+a)*4*x*5*x + x^5*x*(7+2*x+a)*2*6*x^2 + x^4*x - (2)*x*(5)/5- (2)*25*(2)/2";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "20.0*x^10.0*(6+5*x+a)+12.0*x^8.0*(7+2*x+a)+x^5.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "20.0*10.0*x^9.0*(6+5*x+a)+20.0*x^10.0*(0.0+5+a*0.0)+12.0*8.0*x^7.0*(7+2*x+a)+12.0*x^8.0*(0.0+2+a*0.0)+5.0*x^4.0-2.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "200.0*x^9.0*(6+5*x+a)+(0.0+5+a*0.0)*20.0*x^10.0+96.0*x^7.0*(7+2*x+a)+(0.0+2+a*0.0)*12.0*x^8.0+5.0*x^4.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="20.0*x^10.0*(6+5*x+a)+12.0*x^8.0*(7+2*x+a)+x^5.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="20.0*x^10.0*6*x+5.0/2.0*x^2.0+a*x-1200.0/11.0*x^11.0+500.0/12.0*x^12.0+a*200.0/11.0*x^11.0+12.0*x^8.0*7*x+x^2.0+a*x-672.0/9.0*x^9.0+96.0/10.0*x^10.0+a*96.0/9.0*x^9.0+1.0/6.0*x^6.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="120.0*x^11.0+2.5*x^2.0+a*x-109.0909090909091*x^11.0+41.666666666666664*x^12.0+a*18.181818181818183*x^11.0+84.0*x^9.0+x^2.0+a*x-74.66666666666667*x^9.0+9.6*x^10.0+a*10.666666666666666*x^9.0+0.16666666666666666*x^6.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "200.0*x^9.0*(6+5*x+a)+(0.0+5+a*0.0)*20.0*x^10.0+96.0*x^7.0*(7+2*x+a)+(0.0+2+a*0.0)*12.0*x^8.0+5.0*x^4.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "200.0*9.0*x^8.0*(6+5*x+a)+200.0*x^9.0*(0.0+5+a*0.0)+(0.0+5+a*0.0)*20.0+96.0*7.0*x^6.0*(7+2*x+a)+96.0*x^7.0*(0.0+2+a*0.0)+(0.0+2+a*0.0)*12.0+5.0*4.0*x^3.0-2.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "1800.0*x^8.0*(6+5*x+a)+(0.0+5+a*0.0)*200.0*x^9.0+(0.0+5+a*0.0)*20.0+672.0*x^6.0*(7+2*x+a)+(0.0+2+a*0.0)*96.0*x^7.0+(0.0+2+a*0.0)*12.0+20.0*x^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="120.0*x^11.0+2.5*x^2.0+a*x-109.0909090909091*x^11.0+41.666666666666664*x^12.0+a*18.181818181818183*x^11.0+84.0*x^9.0+x^2.0+a*x-74.66666666666667*x^9.0+9.6*x^10.0+a*10.666666666666666*x^9.0+0.16666666666666666*x^6.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="120.0/12.0*x^12.0+2.5/3.0*x^3.0+a/2.0*x^2.0-109.0909090909091/12.0*x^12.0+41.666666666666664/13.0*x^13.0+a*18.181818181818183/12.0*x^12.0+84.0/10.0*x^10.0+1.0/3.0*x^3.0+a/2.0*x^2.0-74.66666666666667/10.0*x^10.0+9.6/11.0*x^11.0+a*10.666666666666666/10.0*x^10.0+0.16666666666666666/7.0*x^7.0-1.0/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="10.0*x^12.0+0.8333333333333334*x^3.0+a/2.0*x^2.0-9.090909090909092*x^12.0+3.205128205128205*x^13.0+a*1.5151515151515154*x^12.0+8.4*x^10.0+0.3333333333333333*x^3.0+a/2.0*x^2.0-7.466666666666667*x^10.0+0.8727272727272727*x^11.0+a*1.0666666666666667*x^10.0+1.0/42.0*x^7.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "1800.0*x^8.0*(6+5*x+a)+(0.0+5+a*0.0)*200.0*x^9.0+(0.0+5+a*0.0)*20.0+672.0*x^6.0*(7+2*x+a)+(0.0+2+a*0.0)*96.0*x^7.0+(0.0+2+a*0.0)*12.0+20.0*x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "1800.0*8.0*x^7.0*(6+5*x+a)+1800.0*x^8.0*(0.0+5+a*0.0)+(0.0+5+a*0.0)*200.0+(0.0+5+a*0.0)*20.0*0.0+672.0*6.0*x^5.0*(7+2*x+a)+672.0*x^6.0*(0.0+2+a*0.0)+(0.0+2+a*0.0)*96.0+(0.0+2+a*0.0)*12.0*0.0+20.0*3.0*x^2.0";
        UsageCalculus.EqnSolArrayMap2[3] = "14400.0*x^7.0*(6+5*x+a)+(0.0+5+a*0.0)*1800.0*x^8.0+(0.0+5+a*0.0)*200.0+(0.0+5+a*0.0)*0.0+4032.0*x^5.0*(7+2*x+a)+(0.0+2+a*0.0)*672.0*x^6.0+(0.0+2+a*0.0)*96.0+(0.0+2+a*0.0)*0.0+60.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[3]="10.0*x^12.0+0.8333333333333334*x^3.0+a/2.0*x^2.0-9.090909090909092*x^12.0+3.205128205128205*x^13.0+a*1.5151515151515154*x^12.0+8.4*x^10.0+0.3333333333333333*x^3.0+a/2.0*x^2.0-7.466666666666667*x^10.0+0.8727272727272727*x^11.0+a*1.0666666666666667*x^10.0+1.0/42.0*x^7.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="10.0/13.0*x^13.0+0.8333333333333334/4.0*x^4.0+a/2.0/3.0*x^3.0-9.090909090909092/13.0*x^13.0+3.205128205128205/14.0*x^14.0+a*1.5151515151515154/13.0*x^13.0+8.4/11.0*x^11.0+0.3333333333333333/4.0*x^4.0+a/2.0/3.0*x^3.0-7.466666666666667/11.0*x^11.0+0.8727272727272727/12.0*x^12.0+a*1.0666666666666667/11.0*x^11.0+1.0/42.0/8.0*x^8.0-1.0/3.0/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/1.3*x^13.0+0.20833333333333334*x^4.0+a/6.0*x^3.0-1.0/1.43*x^13.0+0.22893772893772893*x^14.0+a/8.579999999999998*x^13.0+1.0/1.3095238095238095*x^11.0+0.08333333333333333*x^4.0+a/6.0*x^3.0-1.0/1.4732142857142856*x^11.0+0.07272727272727272*x^12.0+a/10.3125*x^11.0+1.0/336.0*x^8.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "14400.0*x^7.0*(6+5*x+a)+(0.0+5+a*0.0)*1800.0*x^8.0+(0.0+5+a*0.0)*200.0+(0.0+5+a*0.0)*0.0+4032.0*x^5.0*(7+2*x+a)+(0.0+2+a*0.0)*672.0*x^6.0+(0.0+2+a*0.0)*96.0+(0.0+2+a*0.0)*0.0+60.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "14400.0*7.0*x^6.0*(6+5*x+a)+14400.0*x^7.0*(0.0+5+a*0.0)+(0.0+5+a*0.0)*1800.0+(0.0+5+a*0.0)*200.0*0.0+(0.0+5+a*0.0)*0.0*0.0+4032.0*5.0*x^4.0*(7+2*x+a)+4032.0*x^5.0*(0.0+2+a*0.0)+(0.0+2+a*0.0)*672.0+(0.0+2+a*0.0)*96.0*0.0+(0.0+2+a*0.0)*0.0*0.0+60.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[4] = "100800.0*x^6.0*(6+5*x+a)+(0.0+5+a*0.0)*14400.0*x^7.0+(0.0+5+a*0.0)*1800.0+(0.0+5+a*0.0)*0.0+(0.0+5+a*0.0)*0.0+20160.0*x^4.0*(7+2*x+a)+(0.0+2+a*0.0)*4032.0*x^5.0+(0.0+2+a*0.0)*672.0+(0.0+2+a*0.0)*0.0+(0.0+2+a*0.0)*0.0+120.0*x";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/1.3*x^13.0+0.20833333333333334*x^4.0+a/6.0*x^3.0-1.0/1.43*x^13.0+0.22893772893772893*x^14.0+a/8.579999999999998*x^13.0+1.0/1.3095238095238095*x^11.0+0.08333333333333333*x^4.0+a/6.0*x^3.0-1.0/1.4732142857142856*x^11.0+0.07272727272727272*x^12.0+a/10.3125*x^11.0+1.0/336.0*x^8.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/1.3/14.0*x^14.0+0.20833333333333334/5.0*x^5.0+a/6.0/4.0*x^4.0-1.0/1.43/14.0*x^14.0+0.22893772893772893/15.0*x^15.0+a/8.579999999999998/14.0*x^14.0+1.0/1.3095238095238095/12.0*x^12.0+0.08333333333333333/5.0*x^5.0+a/6.0/4.0*x^4.0-1.0/1.4732142857142856/12.0*x^12.0+0.07272727272727272/13.0*x^13.0+a/10.3125/12.0*x^12.0+1.0/336.0/9.0*x^9.0-1.0/12.0/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/18.2*x^14.0+0.04166666666666667*x^5.0+a/24.0*x^4.0-1.0/20.02*x^14.0+0.015262515262515262*x^15.0+a/120.11999999999998*x^14.0+1.0/15.714285714285715*x^12.0+0.016666666666666666*x^5.0+a/24.0*x^4.0-1.0/17.678571428571427*x^12.0+0.005594405594405594*x^13.0+a/123.75*x^12.0+1.0/3024.0*x^9.0-1.0/60.0*x^5.0-2.0833333333333335*x^4.0";
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
  
      public static void TestCaseDiff80094() {
        //Test Case 80094
        UsageCalculus.TestCase = 80094;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*(6.0+5.0*x+a)*20.0*9.0*x^8.0+(0.0+5.0+a)*20.0*x^9.0+a+(7.0+2.0*x+a)*12.0*8.0*x^7.0+(0.0+2.0+a)*12.0*x^8.0+a+5.0*x^4.0-2.0-0.0";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "180.0*x^8.0*(6.0+5.0*x+a)+20.0*x^9.0*(0.0+5.0+a)+a+96.0*x^7.0*(7.0+2.0*x+a)+12.0*x^8.0*(0.0+2.0+a)+a+5.0*x^4.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "5.0*8.0*x^7.0+4.0*x^3.0+3.0*x^2.0-2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "40.0*x^7.0+4.0*x^3.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="180.0*x^8.0*(6.0+5.0*x+a)+20.0*x^9.0*(0.0+5.0+a)+a+96.0*x^7.0*(7.0+2.0*x+a)+12.0*x^8.0*(0.0+2.0+a)+a+5.0*x^4.0-2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
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
      public static void TestCaseDiff80095() {
        //Test Case 80095
        UsageCalculus.TestCase = 80095;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*x^8*(6) + x^5 + x^4 - (2)*x*(7)- (3)*25*(9)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "6.0*x^8.0+x^5.0+x^4.0-14.0*x-675.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "6.0*8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "48.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0";
        UsageCalculus.EqnSolArrayMap3[1]="6.0*x^8.0+x^5.0+x^4.0-14.0*x-675.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="6.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-14.0/2.0*x^2.0-675.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1.5*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-7.0*x^2.0-675.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "48.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "48.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "336.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/1.5*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-7.0*x^2.0-675.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/1.5/10.0*x^10.0+1.0/6.0/7.0*x^7.0+1.0/5.0/6.0*x^6.0-7.0/3.0*x^3.0-675.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/15.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-2.3333333333333335*x^3.0-337.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "336.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "336.0*6.0*x^5.0+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "2016.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/15.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-2.3333333333333335*x^3.0-337.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/15.0/11.0*x^11.0+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-2.3333333333333335/4.0*x^4.0-337.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/165.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/1.7142857142857142*x^4.0-112.5*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "2016.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "2016.0*5.0*x^4.0+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "10080.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/165.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/1.7142857142857142*x^4.0-112.5*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/165.0/12.0*x^12.0+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/1.7142857142857142/5.0*x^5.0-112.5/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/1980.0*x^12.0+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0-1.0/8.571428571428571*x^5.0-28.125*x^4.0";
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
      public static void TestCaseDiff80096() {
        //Test Case 80096
        UsageCalculus.TestCase = 80096;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(5+2) + x^5 + x^4 - (2+3)*x*(5)- (2*5)*25*(2-1)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "7.0*x^8.0+x^5.0+x^4.0-25.0*x-250.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "7.0*8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-25.0-250.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "56.0*x^7.0+5.0*x^4.0+4.0*x^3.0-25.0";
        UsageCalculus.EqnSolArrayMap3[1]="7.0*x^8.0+x^5.0+x^4.0-25.0*x-250.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="7.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-25.0/2.0*x^2.0-250.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1.2857142857142858*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-12.5*x^2.0-250.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "56.0*x^7.0+5.0*x^4.0+4.0*x^3.0-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "56.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "392.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/1.2857142857142858*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-12.5*x^2.0-250.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/1.2857142857142858/10.0*x^10.0+1.0/6.0/7.0*x^7.0+1.0/5.0/6.0*x^6.0-12.5/3.0*x^3.0-250.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/12.857142857142858*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-4.166666666666667*x^3.0-125.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "392.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "392.0*6.0*x^5.0+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "2352.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/12.857142857142858*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-4.166666666666667*x^3.0-125.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/12.857142857142858/11.0*x^11.0+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-4.166666666666667/4.0*x^4.0-125.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/141.42857142857144*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0416666666666667*x^4.0-41.666666666666664*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "2352.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "2352.0*5.0*x^4.0+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "11760.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/141.42857142857144*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0416666666666667*x^4.0-41.666666666666664*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/141.42857142857144/12.0*x^12.0+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0416666666666667/5.0*x^5.0-41.666666666666664/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/1697.1428571428573*x^12.0+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0-1.0/4.8*x^5.0-10.416666666666666*x^4.0";
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
      public static void TestCaseDiff80097() {
        //Test Case 80097
        UsageCalculus.TestCase = 80097;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(x^3*x)*x^8 + (x^4*x^2)*x^5 + x^4 - (x-x)*x- 25*(2)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^12.0+x^11.0+x^4.0-x^2.0-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "12.0*x^11.0+11.0*x^10.0+4.0*x^3.0-2.0*x^1.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "12.0*x^11.0+11.0*x^10.0+4.0*x^3.0-2.0*x";
        UsageCalculus.EqnSolArrayMap3[1] = "x^12.0+x^11.0+x^4.0-x^2.0-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/13.0*x^13.0+1.0/12.0*x^12.0+1.0/5.0*x^5.0-1.0/3.0*x^3.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/13.0*x^13.0+1.0/12.0*x^12.0+1.0/5.0*x^5.0-1.0/3.0*x^3.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "12.0*x^11.0+11.0*x^10.0+4.0*x^3.0-2.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "12.0*11.0*x^10.0+11.0*10.0*x^9.0+4.0*3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayMap2[2] = "132.0*x^10.0+110.0*x^9.0+12.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/13.0*x^13.0+1.0/12.0*x^12.0+1.0/5.0*x^5.0-1.0/3.0*x^3.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/13.0/14.0*x^14.0+1.0/12.0/13.0*x^13.0+1.0/5.0/6.0*x^6.0-1.0/3.0/4.0*x^4.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/182.0*x^14.0+1.0/156.0*x^13.0+1.0/30.0*x^6.0-1.0/12.0*x^4.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "132.0*x^10.0+110.0*x^9.0+12.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "132.0*10.0*x^9.0+110.0*9.0*x^8.0+12.0*2.0*x^1.0-2.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "1320.0*x^9.0+990.0*x^8.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/182.0*x^14.0+1.0/156.0*x^13.0+1.0/30.0*x^6.0-1.0/12.0*x^4.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/182.0/15.0*x^15.0+1.0/156.0/14.0*x^14.0+1.0/30.0/7.0*x^7.0-1.0/12.0/5.0*x^5.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/2730.0*x^15.0+1.0/2184.0*x^14.0+1.0/210.0*x^7.0-1.0/60.0*x^5.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "1320.0*x^9.0+990.0*x^8.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "1320.0*9.0*x^8.0+990.0*8.0*x^7.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "11880.0*x^8.0+7920.0*x^7.0+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/2730.0*x^15.0+1.0/2184.0*x^14.0+1.0/210.0*x^7.0-1.0/60.0*x^5.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/2730.0/16.0*x^16.0+1.0/2184.0/15.0*x^15.0+1.0/210.0/8.0*x^8.0-1.0/60.0/6.0*x^6.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/43680.0*x^16.0+1.0/32760.0*x^15.0+1.0/1680.0*x^8.0-1.0/360.0*x^6.0-2.0833333333333335*x^4.0";
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
      public static void TestCaseDiff80098() {
        //Test Case 80098
        UsageCalculus.TestCase = 80098;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(5+2) + x^5 + x^4 - x*(2+3-1)*x- 25*(2*5*2-1)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "7.0*x^8.0+x^5.0+x^4.0-4.0*x^2.0-475.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "7.0*8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-4.0*2.0*x^1.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "56.0*x^7.0+5.0*x^4.0+4.0*x^3.0-8.0*x";
        UsageCalculus.EqnSolArrayMap3[1]="7.0*x^8.0+x^5.0+x^4.0-4.0*x^2.0-475.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="7.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-4.0/3.0*x^3.0-475.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1.2857142857142858*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.3333333333333333*x^3.0-475.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "56.0*x^7.0+5.0*x^4.0+4.0*x^3.0-8.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "56.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0-8.0";
        UsageCalculus.EqnSolArrayMap2[2] = "392.0*x^6.0+20.0*x^3.0+12.0*x^2.0-8.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/1.2857142857142858*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.3333333333333333*x^3.0-475.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/1.2857142857142858/10.0*x^10.0+1.0/6.0/7.0*x^7.0+1.0/5.0/6.0*x^6.0-1.3333333333333333/4.0*x^4.0-475.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/12.857142857142858*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.0/3.0*x^4.0-237.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "392.0*x^6.0+20.0*x^3.0+12.0*x^2.0-8.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "392.0*6.0*x^5.0+20.0*3.0*x^2.0+12.0*2.0*x^1.0-0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "2352.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/12.857142857142858*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.0/3.0*x^4.0-237.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/12.857142857142858/11.0*x^11.0+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-1.0/3.0/5.0*x^5.0-237.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/141.42857142857144*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/15.0*x^5.0-79.16666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "2352.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "2352.0*5.0*x^4.0+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "11760.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/141.42857142857144*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/15.0*x^5.0-79.16666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/141.42857142857144/12.0*x^12.0+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/15.0/6.0*x^6.0-79.16666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/1697.1428571428573*x^12.0+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0-1.0/90.0*x^6.0-19.791666666666668*x^4.0";
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
        public static void TestCaseDiff80099() {
        //Test Case 80099
        UsageCalculus.TestCase = 80099;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(2.0-1.0)*(3.0-1.0)*x";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 3;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "2.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "2.0";
        UsageCalculus.EqnSolArrayMap2[1] = "2.0";
        UsageCalculus.EqnSolArrayMap3[1]="2.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="x^2.0";
        UsageCalculus.EqnSolArrayMap4[1]="x^2.0";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/3.0*x^3.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/3.0/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/12.0*x^4.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/12.0*x^4.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/12.0/5.0*x^5.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/60.0*x^5.0";
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
        public static void TestCaseDiff80100() {
        //Test Case 80100
        UsageCalculus.TestCase = 80100;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(2*4)*x^8 + (2*3)*x^5 + x^4 - (2/1)*x- 25*(2)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "8.0*x^8.0+6.0*x^5.0+x^4.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*8.0*x^7.0+6.0*5.0*x^4.0+4.0*x^3.0-2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "64.0*x^7.0+30.0*x^4.0+4.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1] = "8.0*x^8.0+6.0*x^5.0+x^4.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="8.0/9.0*x^9.0+6.0/6.0*x^6.0+1.0/5.0*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1.125*x^9.0+x^6.0+0.2*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "64.0*x^7.0+30.0*x^4.0+4.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "64.0*7.0*x^6.0+30.0*4.0*x^3.0+4.0*3.0*x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "448.0*x^6.0+120.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="0.8888888888888888*x^9.0+x^6.0+0.2*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="0.8888888888888888/10.0*x^10.0+1.0/7.0*x^7.0+0.2/6.0*x^6.0-1.0/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/11.25*x^10.0+1.0/7.0*x^7.0+1.0/30.0*x^6.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "448.0*x^6.0+120.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "448.0*6.0*x^5.0+120.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "2688.0*x^5.0+360.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/11.25*x^10.0+1.0/7.0*x^7.0+1.0/30.0*x^6.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/11.25/11.0*x^11.0+1.0/7.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-1.0/3.0/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/123.75*x^11.0+1.0/56.0*x^8.0+1.0/210.0*x^7.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "2688.0*x^5.0+360.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "2688.0*5.0*x^4.0+360.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "13440.0*x^4.0+720.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/123.75*x^11.0+1.0/56.0*x^8.0+1.0/210.0*x^7.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/123.75/12.0*x^12.0+1.0/56.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/12.0/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/1485.0*x^12.0+1.0/504.0*x^9.0+1.0/1680.0*x^8.0-1.0/60.0*x^5.0-2.0833333333333335*x^4.0";
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
        public static void TestCaseDiff80101() {
        //Test Case 80009, 80101
        UsageCalculus.TestCase = 80101;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^(8) + x^(5) + x^(4) - (2)*x- 25*(1)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^8.0+x^5.0+x^4.0-2.0*x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-2.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="x^8.0+x^5.0+x^4.0-2.0*x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/9.0*x^9.0+1.0/6.0*x^6.0+0.2*x^5.0-x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0-2.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/9.0*x^9.0+1.0/6.0*x^6.0+0.2*x^5.0-x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/9.0/10.0*x^10.0+1.0/6.0/7.0*x^7.0+0.2/6.0*x^6.0-1.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/90.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.0/3.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*x^5.0+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/90.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.0/3.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/90.0/11.0*x^11.0+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-1.0/3.0/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/990.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/12.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*x^4.0+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/990.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/12.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/990.0/12.0*x^12.0+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/12.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/11880.0*x^12.0+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0-1.0/60.0*x^5.0-1.0416666666666667*x^4.0";
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
        public static void TestCaseDiff80102() {
        //Test Case 80009,80102
        UsageCalculus.TestCase = 80102;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(7) + x^5*4*(5) + x^4*3*(4) - (2)*x- 25*(1)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "7.0*x^8.0+5.0*x^5.0+4.0*x^4.0-2.0*x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "7.0*8.0*x^7.0+5.0*5.0*x^4.0+4.0*4.0*x^3.0-2.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "56.0*x^7.0+25.0*x^4.0+16.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="7.0*x^8.0+5.0*x^5.0+4.0*x^4.0-2.0*x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="7.0/9.0*x^9.0+5.0/6.0*x^6.0+4.0/5.0*x^5.0-x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1.2857142857142858*x^9.0+1.0/1.2*x^6.0+0.8*x^5.0-x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "56.0*x^7.0+25.0*x^4.0+16.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "56.0*7.0*x^6.0+25.0*4.0*x^3.0+16.0*3.0*x^2.0-2.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "392.0*x^6.0+100.0*x^3.0+48.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/1.2857142857142858*x^9.0+1.0/1.2*x^6.0+0.8*x^5.0-x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/1.2857142857142858/10.0*x^10.0+1.0/1.2/7.0*x^7.0+0.8/6.0*x^6.0-1.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/12.857142857142858*x^10.0+1.0/8.4*x^7.0+1.0/7.5*x^6.0-1.0/3.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "392.0*x^6.0+100.0*x^3.0+48.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "392.0*6.0*x^5.0+100.0*3.0*x^2.0+48.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "2352.0*x^5.0+300.0*x^2.0+96.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/12.857142857142858*x^10.0+1.0/8.4*x^7.0+1.0/7.5*x^6.0-1.0/3.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/12.857142857142858/11.0*x^11.0+1.0/8.4/8.0*x^8.0+1.0/7.5/7.0*x^7.0-1.0/3.0/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/141.42857142857144*x^11.0+1.0/67.2*x^8.0+1.0/52.5*x^7.0-1.0/12.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "2352.0*x^5.0+300.0*x^2.0+96.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "2352.0*5.0*x^4.0+300.0*2.0*x^1.0+96.0";
        UsageCalculus.EqnSolArrayMap2[4] = "11760.0*x^4.0+600.0*x+96.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/141.42857142857144*x^11.0+1.0/67.2*x^8.0+1.0/52.5*x^7.0-1.0/12.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/141.42857142857144/12.0*x^12.0+1.0/67.2/9.0*x^9.0+1.0/52.5/8.0*x^8.0-1.0/12.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/1697.1428571428573*x^12.0+1.0/604.8000000000001*x^9.0+1.0/420.0*x^8.0-1.0/60.0*x^5.0-1.0416666666666667*x^4.0";
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
        public static void TestCaseDiff80103() {
        //Test Case 80103
        UsageCalculus.TestCase = 80103;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(6) + x^5 + x^4 - 2*x*(7)- (3*10)*25";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "6.0*x^8.0+x^5.0+x^4.0-14.0*x-750.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "6.0*8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "48.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0";
        UsageCalculus.EqnSolArrayMap3[1]="6.0*x^8.0+x^5.0+x^4.0-14.0*x-750.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="6.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-14.0/2.0*x^2.0-750.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1.5*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-7.0*x^2.0-750.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "48.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "48.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "336.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/1.5*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-7.0*x^2.0-750.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/1.5/10.0*x^10.0+1.0/6.0/7.0*x^7.0+1.0/5.0/6.0*x^6.0-7.0/3.0*x^3.0-750.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/15.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-2.3333333333333335*x^3.0-375.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "336.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "336.0*6.0*x^5.0+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "2016.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/15.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-2.3333333333333335*x^3.0-375.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/15.0/11.0*x^11.0+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-2.3333333333333335/4.0*x^4.0-375.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/165.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/1.7142857142857142*x^4.0-125.0*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "2016.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "2016.0*5.0*x^4.0+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "10080.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/165.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/1.7142857142857142*x^4.0-125.0*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/165.0/12.0*x^12.0+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/1.7142857142857142/5.0*x^5.0-125.0/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/1980.0*x^12.0+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0-1.0/8.571428571428571*x^5.0-31.25*x^4.0";
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
        public static void TestCaseDiff80104() {
        //Test Case 80005
        UsageCalculus.TestCase = 80104;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(6) + x^5 + x^4 - 2*x*(7)- (3*9)*25";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "6.0*x^8.0+x^5.0+x^4.0-14.0*x-675.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "6.0*8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "48.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0";
        UsageCalculus.EqnSolArrayMap3[1]="6.0*x^8.0+x^5.0+x^4.0-14.0*x-675.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="6.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-14.0/2.0*x^2.0-675.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1.5*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-7.0*x^2.0-675.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "48.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "48.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "336.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/1.5*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-7.0*x^2.0-675.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/1.5/10.0*x^10.0+1.0/6.0/7.0*x^7.0+1.0/5.0/6.0*x^6.0-7.0/3.0*x^3.0-675.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/15.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-2.3333333333333335*x^3.0-337.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "336.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "336.0*6.0*x^5.0+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "2016.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/15.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-2.3333333333333335*x^3.0-337.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/15.0/11.0*x^11.0+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-2.3333333333333335/4.0*x^4.0-337.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/165.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/1.7142857142857142*x^4.0-112.5*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "2016.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "2016.0*5.0*x^4.0+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "10080.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/165.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/1.7142857142857142*x^4.0-112.5*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/165.0/12.0*x^12.0+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/1.7142857142857142/5.0*x^5.0-112.5/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/1980.0*x^12.0+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0-1.0/8.571428571428571*x^5.0-28.125*x^4.0";
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
        public static void TestCaseDiff80105() {
        //Test Case 80006
        UsageCalculus.TestCase = 80105;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(6)*x^8 + x^5 + x^4 - (2)*x*(7)- (3)*25*(9)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "6.0*x^8.0+x^5.0+x^4.0-14.0*x-675.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "6.0*8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "48.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0";
        UsageCalculus.EqnSolArrayMap3[1]="6.0*x^8.0+x^5.0+x^4.0-14.0*x-675.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="6.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-14.0/2.0*x^2.0-675.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1.5*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-7.0*x^2.0-675.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "48.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "48.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "336.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/1.5*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-7.0*x^2.0-675.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/1.5/10.0*x^10.0+1.0/6.0/7.0*x^7.0+1.0/5.0/6.0*x^6.0-7.0/3.0*x^3.0-675.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/15.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-2.3333333333333335*x^3.0-337.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "336.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "336.0*6.0*x^5.0+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "2016.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/15.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-2.3333333333333335*x^3.0-337.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/15.0/11.0*x^11.0+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-2.3333333333333335/4.0*x^4.0-337.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/165.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/1.7142857142857142*x^4.0-112.5*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "2016.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "2016.0*5.0*x^4.0+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "10080.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/165.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/1.7142857142857142*x^4.0-112.5*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/165.0/12.0*x^12.0+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/1.7142857142857142/5.0*x^5.0-112.5/4.0*x^4.00";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/1980.0*x^12.0+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0-1.0/8.571428571428571*x^5.0-28.125*x^4.0";
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
        public static void TestCaseDiff80106() {
        //Test Case 80007
        UsageCalculus.TestCase = 80106;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(5*2)/x + x^5/x + x^4/x - 1.0*(2)*x*5/5- 1.0*(2)*25*(2)/2";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "10.0*x^7.0+x^4.0+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "10.0*7.0*x^6.0+4.0*x^3.0+3.0*x^2.0-2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "70.0*x^6.0+4.0*x^3.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="10.0*x^7.0+x^4.0+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="10.0/8.0*x^8.0+1.0/5.0*x^5.0+1.0/4.0*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.25*x^8.0+1.0/5.0*x^5.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "70.0*x^6.0+4.0*x^3.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "70.0*6.0*x^5.0+4.0*3.0*x^2.0+3.0*2.0*x^1.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "420.0*x^5.0+12.0*x^2.0+6.0*x";
        UsageCalculus.EqnSolArrayMap3[2]="1.25*x^8.0+1.0/5.0*x^5.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.25/9.0*x^9.0+1.0/5.0/6.0*x^6.0+0.25/5.0*x^5.0-1.0/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/7.2*x^9.0+1.0/30.0*x^6.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "420.0*x^5.0+12.0*x^2.0+6.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "420.0*5.0*x^4.0+12.0*2.0*x^1.0+6.0";
        UsageCalculus.EqnSolArrayMap2[3] = "2100.0*x^4.0+24.0*x+6.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/7.2*x^9.0+1.0/30.0*x^6.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/7.2/10.0*x^10.0+1.0/30.0/7.0*x^7.0+1.0/20.0/6.0*x^6.0-1.0/3.0/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/72.0*x^10.0+1.0/210.0*x^7.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "2100.0*x^4.0+24.0*x+6.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "2100.0*4.0*x^3.0+24.0+0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "8400.0*x^3.0+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/72.0*x^10.0+1.0/210.0*x^7.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/72.0/11.0*x^11.0+1.0/210.0/8.0*x^8.0+1.0/120.0/7.0*x^7.0-1.0/12.0/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/792.0*x^11.0+1.0/1680.0*x^8.0+1.0/840.0*x^7.0-1.0/60.0*x^5.0-2.0833333333333335*x^4.0";
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
        public static void TestCaseDiff80107() {
        //Test Case 80011
        UsageCalculus.TestCase = 80107;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(5*3)/x + x^5/x + x^4/x - (2)*x*(5)/5- (2)*25*(2)/2";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "15.0*x^7.0+x^4.0+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "15.0*7.0*x^6.0+4.0*x^3.0+3.0*x^2.0-2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "105.0*x^6.0+4.0*x^3.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="15.0*x^7.0+x^4.0+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="15.0/8.0*x^8.0+1.0/5.0*x^5.0+1.0/4.0*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.875*x^8.0+1.0/5.0*x^5.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "105.0*x^6.0+4.0*x^3.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "105.0*6.0*x^5.0+4.0*3.0*x^2.0+3.0*2.0*x^1.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "630.0*x^5.0+12.0*x^2.0+6.0*x";
        UsageCalculus.EqnSolArrayMap3[2]="1.875*x^8.0+1.0/5.0*x^5.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.875/9.0*x^9.0+1.0/5.0/6.0*x^6.0+0.25/5.0*x^5.0-1.0/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/4.8*x^9.0+1.0/30.0*x^6.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "630.0*x^5.0+12.0*x^2.0+6.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "630.0*5.0*x^4.0+12.0*2.0*x^1.0+6.0";
        UsageCalculus.EqnSolArrayMap2[3] = "3150.0*x^4.0+24.0*x+6.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/4.8*x^9.0+1.0/30.0*x^6.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/4.8/10.0*x^10.0+1.0/30.0/7.0*x^7.0+1.0/20.0/6.0*x^6.0-1.0/3.0/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/48.0*x^10.0+1.0/210.0*x^7.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "3150.0*x^4.0+24.0*x+6.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "3150.0*4.0*x^3.0+24.0+0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "12600.0*x^3.0+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/48.0*x^10.0+1.0/210.0*x^7.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/48.0/11.0*x^11.0+1.0/210.0/8.0*x^8.0+1.0/120.0/7.0*x^7.0-1.0/12.0/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/528.0*x^11.0+1.0/1680.0*x^8.0+1.0/840.0*x^7.0-1.0/60.0*x^5.0-2.0833333333333335*x^4.0";
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
        public static void TestCaseDiff80108() {
        //Test Case 80011
        UsageCalculus.TestCase = 80108;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8/x*(5*3) + x^5/x + x^4/x - (2)*x*(5)/5- (2)*25*(2)/2";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "15.0*x^7.0+x^4.0+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "15.0*7.0*x^6.0+4.0*x^3.0+3.0*x^2.0-2.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "105.0*x^6.0+4.0*x^3.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="15.0*x^7.0+x^4.0+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="15.0/8.0*x^8.0+1.0/5.0*x^5.0+1.0/4.0*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.875*x^8.0+1.0/5.0*x^5.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "105.0*x^6.0+4.0*x^3.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "105.0*6.0*x^5.0+4.0*3.0*x^2.0+3.0*2.0*x^1.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "630.0*x^5.0+12.0*x^2.0+6.0*x";
        UsageCalculus.EqnSolArrayMap3[2]="1.875*x^8.0+1.0/5.0*x^5.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.875/9.0*x^9.0+1.0/5.0/6.0*x^6.0+0.25/5.0*x^5.0-1.0/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/4.8*x^9.0+1.0/30.0*x^6.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "630.0*x^5.0+12.0*x^2.0+6.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "630.0*5.0*x^4.0+12.0*2.0*x^1.0+6.0";
        UsageCalculus.EqnSolArrayMap2[3] = "3150.0*x^4.0+24.0*x+6.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/4.8*x^9.0+1.0/30.0*x^6.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/4.8/10.0*x^10.0+1.0/30.0/7.0*x^7.0+1.0/20.0/6.0*x^6.0-1.0/3.0/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/48.0*x^10.0+1.0/210.0*x^7.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "3150.0*x^4.0+24.0*x+6.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "3150.0*4.0*x^3.0+24.0+0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "12600.0*x^3.0+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/48.0*x^10.0+1.0/210.0*x^7.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/48.0/11.0*x^11.0+1.0/210.0/8.0*x^8.0+1.0/120.0/7.0*x^7.0-1.0/12.0/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/528.0*x^11.0+1.0/1680.0*x^8.0+1.0/840.0*x^7.0-1.0/60.0*x^5.0-2.0833333333333335*x^4.0";
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
        public static void TestCaseDiff80109() {
        //Test Case 80015
        UsageCalculus.TestCase = 80109;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8 + (2*x+x)*x^5 + x^4 - (2)*x- 25*(2)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "";
        UsageCalculus.EqnSolArrayMap2[1] = "";
        UsageCalculus.EqnSolArrayMap3[1]="x^8.0+(2*x+x)*x^5.0+x^4.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
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
        
        public static void TestCaseDiff80110() {
        //Test Case 80016
        UsageCalculus.TestCase = 80110;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(x^2*x + x)*x^8 + (x^2/x-1)*x^5 + x^4 - (2/1*x^2 -1)*x- 25*(2)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "8.0*x^8.0+6.0*x^5.0+x^4.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*8.0*x^7.0+6.0*5.0*x^4.0+4.0*x^3.0-2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "64.0*x^7.0+30.0*x^4.0+4.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1] = "8.0*x^8.0+6.0*x^5.0+x^4.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="8.0/9.0*x^9.0+6.0/6.0*x^6.0+1.0/5.0*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="0.8888888888888888*x^9.0+x^6.0+0.2*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "64.0*x^7.0+30.0*x^4.0+4.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "64.0*7.0*x^6.0+30.0*4.0*x^3.0+4.0*3.0*x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "448.0*x^6.0+120.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="0.8888888888888888*x^9.0+x^6.0+0.2*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="0.8888888888888888/10.0*x^10.0+1.0/7.0*x^7.0+0.2/6.0*x^6.0-1.0/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="0.08888888888888888*x^10.0+0.14285714285714285*x^7.0+0.03333333333333333*x^6.0-0.3333333333333333*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "448.0*x^6.0+120.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "448.0*6.0*x^5.0+120.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "2688.0*x^5.0+360.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="0.08888888888888888*x^10.0+0.14285714285714285*x^7.0+0.03333333333333333*x^6.0-0.3333333333333333*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="0.08888888888888888/11.0*x^11.0+0.14285714285714285/8.0*x^8.0+0.03333333333333333/7.0*x^7.0-0.3333333333333333/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="0.008080808080808079*x^11.0+0.017857142857142856*x^8.0+0.0047619047619047615*x^7.0-0.08333333333333333*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "2688.0*x^5.0+360.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "2688.0*5.0*x^4.0+360.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "13440.0*x^4.0+720.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="0.008080808080808079*x^11.0+0.017857142857142856*x^8.0+0.0047619047619047615*x^7.0-0.08333333333333333*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="0.008080808080808079/12.0*x^12.0+0.017857142857142856/9.0*x^9.0+0.0047619047619047615/8.0*x^8.0-0.08333333333333333/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="6.734006734006732E-4*x^12.0+0.001984126984126984*x^9.0+5.952380952380952E-4*x^8.0-0.016666666666666666*x^5.0-2.0833333333333335*x^4.0";
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
        public static void TestCaseDiff80111() {
        //Test Case 80017
        UsageCalculus.TestCase = 80111;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(x^0+1)*x^8 + (x^1+1)*x^5 + x^4 - (2/1-1)*x- 25*(2)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "9.0*x^8.0+7.0*x^5.0+x^4.0-x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*8.0*x^7.0+6.0*5.0*x^4.0+4.0*x^3.0-2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "64.0*x^7.0+30.0*x^4.0+4.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1] = "8.0*x^8.0+6.0*x^5.0+x^4.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="8.0/9.0*x^9.0+6.0/6.0*x^6.0+1.0/5.0*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="0.8888888888888888*x^9.0+x^6.0+0.2*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "64.0*x^7.0+30.0*x^4.0+4.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "64.0*7.0*x^6.0+30.0*4.0*x^3.0+4.0*3.0*x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "448.0*x^6.0+120.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="0.8888888888888888*x^9.0+x^6.0+0.2*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="0.8888888888888888/10.0*x^10.0+1.0/7.0*x^7.0+0.2/6.0*x^6.0-1.0/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="0.08888888888888888*x^10.0+0.14285714285714285*x^7.0+0.03333333333333333*x^6.0-0.3333333333333333*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "448.0*x^6.0+120.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "448.0*6.0*x^5.0+120.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "2688.0*x^5.0+360.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="0.08888888888888888*x^10.0+0.14285714285714285*x^7.0+0.03333333333333333*x^6.0-0.3333333333333333*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="0.08888888888888888/11.0*x^11.0+0.14285714285714285/8.0*x^8.0+0.03333333333333333/7.0*x^7.0-0.3333333333333333/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="0.008080808080808079*x^11.0+0.017857142857142856*x^8.0+0.0047619047619047615*x^7.0-0.08333333333333333*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "2688.0*x^5.0+360.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "2688.0*5.0*x^4.0+360.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "13440.0*x^4.0+720.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="0.008080808080808079*x^11.0+0.017857142857142856*x^8.0+0.0047619047619047615*x^7.0-0.08333333333333333*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="0.008080808080808079/12.0*x^12.0+0.017857142857142856/9.0*x^9.0+0.0047619047619047615/8.0*x^8.0-0.08333333333333333/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="6.734006734006732E-4*x^12.0+0.001984126984126984*x^9.0+5.952380952380952E-4*x^8.0-0.016666666666666666*x^5.0-2.0833333333333335*x^4.0";
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
        public static void TestCaseDiff80112() {
        //Test Case 80112
        UsageCalculus.TestCase = 80112;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(2*4) + (2*3)*x^5 + x^4 - x*(2/1)- 25*(2)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "8.0*x^8.0+6.0*x^5.0+x^4.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*8.0*x^7.0+6.0*5.0*x^4.0+4.0*x^3.0-2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "64.0*x^7.0+30.0*x^4.0+4.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1] = "8.0*x^8.0+6.0*x^5.0+x^4.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="8.0/9.0*x^9.0+6.0/6.0*x^6.0+1.0/5.0*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1.125*x^9.0+x^6.0+0.2*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "64.0*x^7.0+30.0*x^4.0+4.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "64.0*7.0*x^6.0+30.0*4.0*x^3.0+4.0*3.0*x^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "448.0*x^6.0+120.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="0.8888888888888888*x^9.0+x^6.0+0.2*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="0.8888888888888888/10.0*x^10.0+1.0/7.0*x^7.0+0.2/6.0*x^6.0-1.0/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/11.25*x^10.0+1.0/7.0*x^7.0+1.0/30.0*x^6.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "448.0*x^6.0+120.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "448.0*6.0*x^5.0+120.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "2688.0*x^5.0+360.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/11.25*x^10.0+1.0/7.0*x^7.0+1.0/30.0*x^6.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/11.25/11.0*x^11.0+1.0/7.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-1.0/3.0/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/123.75*x^11.0+1.0/56.0*x^8.0+1.0/210.0*x^7.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "2688.0*x^5.0+360.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "2688.0*5.0*x^4.0+360.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "13440.0*x^4.0+720.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/123.75*x^11.0+1.0/56.0*x^8.0+1.0/210.0*x^7.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/123.75/12.0*x^12.0+1.0/56.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/12.0/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/1485.0*x^12.0+1.0/504.0*x^9.0+1.0/1680.0*x^8.0-1.0/60.0*x^5.0-2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff80113() {
        //Test Case 80113
        UsageCalculus.TestCase = 80113;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(x^0*x) + x^5 + x^4 - (2)*x*(5)- (2)*25*(2)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^9.0+x^5.0+x^4.0-10.0*x-100.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "9.0*x^8.0+5.0*x^4.0+4.0*x^3.0-10.0-100.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "9.0*x^8.0+5.0*x^4.0+4.0*x^3.0-10.0";
        UsageCalculus.EqnSolArrayMap3[1]="x^9.0+x^5.0+x^4.0-10.0*x-100.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/10.0*x^10.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-10.0/2.0*x^2.0-100.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/10.0*x^10.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-5.0*x^2.0-100.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "9.0*x^8.0+5.0*x^4.0+4.0*x^3.0-10.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "9.0*8.0*x^7.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0-10.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "72.0*x^7.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/10.0*x^10.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-5.0*x^2.0-100.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/10.0/11.0*x^11.0+1.0/6.0/7.0*x^7.0+1.0/5.0/6.0*x^6.0-5.0/3.0*x^3.0-100.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/110.0*x^11.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.6666666666666667*x^3.0-50.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "72.0*x^7.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "72.0*7.0*x^6.0+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "504.0*x^6.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/110.0*x^11.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.6666666666666667*x^3.0-50.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/110.0/12.0*x^12.0+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-1.6666666666666667/4.0*x^4.0-50.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/1320.0*x^12.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/2.4*x^4.0-16.666666666666668*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "504.0*x^6.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "504.0*6.0*x^5.0+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "3024.0*x^5.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/1320.0*x^12.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/2.4*x^4.0-16.666666666666668*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/1320.0/13.0*x^13.0+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/2.4/5.0*x^5.0-16.666666666666668/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/17160.0*x^13.0+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0-1.0/12.0*x^5.0-4.166666666666667*x^4.0";
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
       public static void TestCaseDiff80114() {
        //Test Case 80114
        UsageCalculus.TestCase = 80114;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(x-5*x) + x^5*(x+5*x) + x^4 - 2*x*5- 2*25*2";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^8.0*(x-5*x)+x^5.0*(x+5*x)+x^4.0-10.0*x-100.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*x^7.0*(x-5*x)+x^8.0*(1.0-5)+5.0*x^4.0*(x+5*x)+x^5.0*(1.0+5)+4.0*x^3.0-10.0-100.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*x^7.0*(x-5*x)+4.0*x^8.0+5.0*x^4.0*(x+5*x)+6.0*x^5.0+4.0*x^3.0-10.0";
        UsageCalculus.EqnSolArrayMap3[1]="x^8.0*(x-5*x)+x^5.0*(x+5*x)+x^4.0-10.0*x-100.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="x^8.0*1.0/2.0*x^2.0-5.0/2.0*x^2.0-4.0/10.0*x^10.0-20.0/10.0*x^10.0+x^5.0*1.0/2.0*x^2.0+5.0/2.0*x^2.0-2.5/7.0*x^7.0+12.5/7.0*x^7.0+1.0/5.0*x^5.0-10.0/2.0*x^2.0-100.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/2.0*x^10.0-2.5*x^2.0-1.0/2.5*x^10.0-2.0*x^10.0+1.0/2.0*x^7.0+2.5*x^2.0-1.0/2.8*x^7.0+1.7857142857142858*x^7.0+1.0/5.0*x^5.0-5.0*x^2.0-100.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*x^7.0*(x-5*x)+4.0*x^8.0+5.0*x^4.0*(x+5*x)+6.0*x^5.0+4.0*x^3.0-10.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*7.0*x^6.0*(x-5*x)+8.0*x^7.0*(1.0-5)+4.0*8.0*x^7.0+5.0*4.0*x^3.0*(x+5*x)+5.0*x^4.0*(1.0+5)+6.0*5.0*x^4.0+4.0*3.0*x^2.0-10.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*x^6.0*(x-5*x)+32.0*x^7.0+32.0*x^7.0+20.0*x^3.0*(x+5*x)+30.0*x^4.0+30.0*x^4.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/2.0*x^10.0-2.5*x^2.0-1.0/2.5*x^10.0-2.0*x^10.0+1.0/2.0*x^7.0+2.5*x^2.0-1.0/2.8*x^7.0+1.7857142857142858*x^7.0+1.0/5.0*x^5.0-5.0*x^2.0-100.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/2.0/11.0*x^11.0-2.5/3.0*x^3.0-1.0/2.5/11.0*x^11.0-2.0/11.0*x^11.0+1.0/2.0/8.0*x^8.0+2.5/3.0*x^3.0-1.0/2.8/8.0*x^8.0+1.7857142857142858/8.0*x^8.0+1.0/5.0/6.0*x^6.0-5.0/3.0*x^3.0-100.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/22.0*x^11.0-1.0/1.2*x^3.0-1.0/27.5*x^11.0-1.0/5.5*x^11.0+1.0/16.0*x^8.0+1.0/1.2*x^3.0-1.0/22.4*x^8.0+1.0/4.4799999999999995*x^8.0+1.0/30.0*x^6.0-1.6666666666666667*x^3.0-50.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*x^6.0*(x-5*x)+32.0*x^7.0+32.0*x^7.0+20.0*x^3.0*(x+5*x)+30.0*x^4.0+30.0*x^4.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*x^5.0*(x-5*x)+56.0*x^6.0*(1.0-5)+32.0*7.0*x^6.0+32.0*7.0*x^6.0+20.0*3.0*x^2.0*(x+5*x)+20.0*x^3.0*(1.0+5)+30.0*4.0*x^3.0+30.0*4.0*x^3.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*x^5.0*(x-5*x)+224.0*x^6.0+224.0*x^6.0+224.0*x^6.0+60.0*x^2.0*(x+5*x)+120.0*x^3.0+120.0*x^3.0+120.0*x^3.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/22.0*x^11.0-1.0/1.2*x^3.0-1.0/27.5*x^11.0-1.0/5.5*x^11.0+1.0/16.0*x^8.0+1.0/1.2*x^3.0-1.0/22.4*x^8.0+1.0/4.4799999999999995*x^8.0+1.0/30.0*x^6.0-1.6666666666666667*x^3.0-50.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/22.0/12.0*x^12.0-1.0/1.2/4.0*x^4.0-1.0/27.5/12.0*x^12.0-1.0/5.5/12.0*x^12.0+1.0/16.0/9.0*x^9.0+1.0/1.2/4.0*x^4.0-1.0/22.4/9.0*x^9.0+1.0/4.4799999999999995/9.0*x^9.0+1.0/30.0/7.0*x^7.0-1.6666666666666667/4.0*x^4.0-50.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/264.0*x^12.0-1.0/4.8*x^4.0-1.0/330.0*x^12.0-1.0/66.0*x^12.0+1.0/144.0*x^9.0+1.0/4.8*x^4.0-1.0/201.6*x^9.0+1.0/40.31999999999999*x^9.0+1.0/210.0*x^7.0-1.0/2.4*x^4.0-16.666666666666668*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*x^5.0*(x-5*x)+224.0*x^6.0+224.0*x^6.0+224.0*x^6.0+60.0*x^2.0*(x+5*x)+120.0*x^3.0+120.0*x^3.0+120.0*x^3.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*x^4.0*(x-5*x)+336.0*x^5.0*(1.0-5)+224.0*6.0*x^5.0+224.0*6.0*x^5.0+224.0*6.0*x^5.0+60.0*2.0*x^1.0*(x+5*x)+60.0*x^2.0*(1.0+5)+120.0*3.0*x^2.0+120.0*3.0*x^2.0+120.0*3.0*x^2.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*x^4.0*(x-5*x)+1344.0*x^5.0+1344.0*x^5.0+1344.0*x^5.0+1344.0*x^5.0+120.0*x*(x+5*x)+360.0*x^2.0+360.0*x^2.0+360.0*x^2.0+360.0*x^2.0+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/264.0*x^12.0-1.0/4.8*x^4.0-1.0/330.0*x^12.0-1.0/66.0*x^12.0+1.0/144.0*x^9.0+1.0/4.8*x^4.0-1.0/201.6*x^9.0+1.0/40.31999999999999*x^9.0+1.0/210.0*x^7.0-1.0/2.4*x^4.0-16.666666666666668*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/264.0/13.0*x^13.0-1.0/4.8/5.0*x^5.0-1.0/330.0/13.0*x^13.0-1.0/66.0/13.0*x^13.0+1.0/144.0/10.0*x^10.0+1.0/4.8/5.0*x^5.0-1.0/201.6/10.0*x^10.0+1.0/40.31999999999999/10.0*x^10.0+1.0/210.0/8.0*x^8.0-1.0/2.4/5.0*x^5.0-16.666666666666668/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/3432.0*x^13.0-1.0/24.0*x^5.0-1.0/4290.0*x^13.0-1.0/858.0*x^13.0+1.0/1440.0*x^10.0+1.0/24.0*x^5.0-1.0/2016.0*x^10.0+1.0/403.19999999999993*x^10.0+1.0/1680.0*x^8.0-1.0/12.0*x^5.0-4.166666666666667*x^4.0";
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
        public static void TestCaseDiff80115() {
        //Test Case 80115
        UsageCalculus.TestCase = 80115;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(x^2/x^2)/x + x^5/x*(x^2/x^2) + x^4/x - (2)*x*(5)/5- (2)*25*(x^2/x^2)/2";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^7.0+x^4.0+x^3.0-2.0*x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "7.0*x^6.0+4.0*x^3.0+3.0*x^2.0-2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "7.0*x^6.0+4.0*x^3.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="x^7.0+x^4.0+x^3.0-2.0*x-25.0*x^2.0/x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="";
        UsageCalculus.EqnSolArrayMap4[1]="";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "7.0*x^6.0+4.0*x^3.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "7.0*6.0*x^5.0+4.0*3.0*x^2.0+3.0*2.0*x^1.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "42.0*x^5.0+12.0*x^2.0+6.0*x";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/8.0*x^8.0+1.0/5.0*x^5.0+1.0/4.0*x^4.0-x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="0.125/9.0*x^9.0+0.2/6.0*x^6.0+0.25/5.0*x^5.0-1.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="0.013888888888888888*x^9.0+0.03333333333333333*x^6.0+0.05*x^5.0-1.0/3.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "42.0*x^5.0+12.0*x^2.0+6.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "42.0*5.0*x^4.0+12.0*2.0*x^1.0+6.0";
        UsageCalculus.EqnSolArrayMap2[3] = "210.0*x^4.0+24.0*x+6.0";
        UsageCalculus.EqnSolArrayMap3[3]="0.013888888888888888*x^9.0+0.03333333333333333*x^6.0+0.05*x^5.0-1.0/3.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="0.013888888888888888/10.0*x^10.0+0.03333333333333333/7.0*x^7.0+0.05/6.0*x^6.0-0.3333333333333333/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="0.0013888888888888887*x^10.0+0.0047619047619047615*x^7.0+0.008333333333333333*x^6.0-0.08333333333333333*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "210.0*x^4.0+24.0*x+6.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "210.0*4.0*x^3.0+24.0+0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "840.0*x^3.0+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="0.0013888888888888887*x^10.0+0.0047619047619047615*x^7.0+0.008333333333333333*x^6.0-0.08333333333333333*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="0.0013888888888888887/11.0*x^11.0+0.0047619047619047615/8.0*x^8.0+0.008333333333333333/7.0*x^7.0-0.08333333333333333/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.2626262626262624E-4*x^11.0+5.952380952380952E-4*x^8.0+0.0011904761904761904*x^7.0-0.016666666666666666*x^5.0-1.0416666666666667*x^4.0";
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
        public static void TestCaseDiff80116() {
        //Test Case 80116
        UsageCalculus.TestCase = 80116;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(x^2/x^2*x)*5 + x^5*(x^2/x^2*x)/8 + x^4 - 2*x*5*(x^2/x^2*x)- 2*25*2";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "5.0*x^9.0+8.0*x^6.0+x^4.0-10.0*x^2.0-100.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "5.0*9.0*x^8.0+8.0*6.0*x^5.0+4.0*x^3.0-10.0*2.0*x^1.0-100.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "45.0*x^8.0+48.0*x^5.0+4.0*x^3.0-20.0*x";
        UsageCalculus.EqnSolArrayMap3[1]="5.0*x^9.0+8.0*x^6.0+x^4.0-10.0*x^2.0-100.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="5.0/10.0*x^10.0+8.0/7.0*x^7.0+1.0/5.0*x^5.0-10.0/3.0*x^3.0-100.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/2.0*x^10.0+1.1428571428571428*x^7.0+1.0/5.0*x^5.0-3.3333333333333335*x^3.0-100.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "45.0*x^8.0+48.0*x^5.0+4.0*x^3.0-20.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "45.0*8.0*x^7.0+48.0*5.0*x^4.0+4.0*3.0*x^2.0-20.0";
        UsageCalculus.EqnSolArrayMap2[2] = "360.0*x^7.0+240.0*x^4.0+12.0*x^2.0-20.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/2.0*x^10.0+1.1428571428571428*x^7.0+1.0/5.0*x^5.0-3.3333333333333335*x^3.0-100.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/2.0/11.0*x^11.0+1.1428571428571428/8.0*x^8.0+1.0/5.0/6.0*x^6.0-3.3333333333333335/4.0*x^4.0-100.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/22.0*x^11.0+1.0/7.0*x^8.0+1.0/30.0*x^6.0-1.0/1.2*x^4.0-50.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "360.0*x^7.0+240.0*x^4.0+12.0*x^2.0-20.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "360.0*7.0*x^6.0+240.0*4.0*x^3.0+12.0*2.0*x^1.0-20.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "2520.0*x^6.0+960.0*x^3.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/22.0*x^11.0+1.0/7.0*x^8.0+1.0/30.0*x^6.0-1.0/1.2*x^4.0-50.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/22.0/12.0*x^12.0+1.0/7.0/9.0*x^9.0+1.0/30.0/7.0*x^7.0-1.0/1.2/5.0*x^5.0-50.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/264.0*x^12.0+1.0/63.0*x^9.0+1.0/210.0*x^7.0-1.0/6.0*x^5.0-16.666666666666668*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "2520.0*x^6.0+960.0*x^3.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "2520.0*6.0*x^5.0+960.0*3.0*x^2.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "15120.0*x^5.0+2880.0*x^2.0+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/264.0*x^12.0+1.0/63.0*x^9.0+1.0/210.0*x^7.0-1.0/6.0*x^5.0-16.666666666666668*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/264.0/13.0*x^13.0+1.0/63.0/10.0*x^10.0+1.0/210.0/8.0*x^8.0-1.0/6.0/6.0*x^6.0-16.666666666666668/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/3432.0*x^13.0+1.0/630.0*x^10.0+1.0/1680.0*x^8.0-1.0/36.0*x^6.0-4.166666666666667*x^4.0";
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
        public static void TestCaseDiff80117() {
        //Test Case 80117
        UsageCalculus.TestCase = 80117;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(1/x*x)*4/x + x^5/x*(1/x*x)*2 + x^4/x - (2)*x*(1/x)/5- (2)*25*(1/x)/2";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "4.0*x^7.0+2.0*x^4.0+x^3.0-0.4*x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "4.0*7.0*x^6.0+2.0*4.0*x^3.0+3.0*x^2.0-0.4-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "28.0*x^6.0+8.0*x^3.0+3.0*x^2.0-0.4";
        UsageCalculus.EqnSolArrayMap3[1]="4.0*x^7.0+2.0*x^4.0+x^3.0-1.0/2.5*x/x-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="4.0/8.0*x^8.0+2.0/5.0*x^5.0+1.0/4.0*x^4.0-1.0/2.5/2.0*x^2.0/x^2.0*1.0/2.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/2.0*x^8.0+1.0/2.5*x^5.0+1.0/4.0*x^4.0-1.0/10.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "28.0*x^6.0+8.0*x^3.0+3.0*x^2.0-0.4";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "28.0*6.0*x^5.0+8.0*3.0*x^2.0+3.0*2.0*x^1.0-0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "168.0*x^5.0+24.0*x^2.0+6.0*x";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/2.0*x^8.0+1.0/2.5*x^5.0+1.0/4.0*x^4.0-1.0/10.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/2.0/9.0*x^9.0+1.0/2.5/6.0*x^6.0+1.0/4.0/5.0*x^5.0-1.0/10.0*x-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/18.0*x^9.0+1.0/15.0*x^6.0+1.0/20.0*x^5.0-1.0/10.0*x-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "168.0*x^5.0+24.0*x^2.0+6.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "168.0*5.0*x^4.0+24.0*2.0*x^1.0+6.0";
        UsageCalculus.EqnSolArrayMap2[3] = "840.0*x^4.0+48.0*x+6.0";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/18.0*x^9.0+1.0/15.0*x^6.0+1.0/20.0*x^5.0-1.0/10.0*x-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/18.0/10.0*x^10.0+1.0/15.0/7.0*x^7.0+1.0/20.0/6.0*x^6.0-1.0/10.0/2.0*x^2.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/180.0*x^10.0+1.0/105.0*x^7.0+1.0/120.0*x^6.0-1.0/20.0*x^2.0-1.0416666666666667*x^4.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "840.0*x^4.0+48.0*x+6.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "840.0*4.0*x^3.0+48.0+0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "3360.0*x^3.0+48.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/180.0*x^10.0+1.0/105.0*x^7.0+1.0/120.0*x^6.0-1.0/20.0*x^2.0-1.0416666666666667*x^4.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/180.0/11.0*x^11.0+1.0/105.0/8.0*x^8.0+1.0/120.0/7.0*x^7.0-1.0/20.0/3.0*x^3.0-1.0416666666666667/5.0*x^5.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/1980.0*x^11.0+1.0/840.0*x^8.0+1.0/840.0*x^7.0-1.0/60.0*x^3.0-1.0/4.8*x^5.0";
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
        public static void TestCaseDiff80118() {
        //Test Case 80118
        UsageCalculus.TestCase = 80118;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(3+5*x)*4/x*5*x + x^5/x*(3+5*x)*2*6*x^2 + x^4/x - (2)*x*(5)/5- (2)*25*(2)/2";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "20.0*x^8.0*(3+5*x)+12.0*x^6.0*(3+5*x)+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "20.0*8.0*x^7.0*(3+5*x)+20.0*x^8.0*(0.0+5)+12.0*6.0*x^5.0*(3+5*x)+12.0*x^6.0*(0.0+5)+3.0*x^2.0-2.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "160.0*x^7.0*(3+5*x)+100.0*x^8.0+72.0*x^5.0*(3+5*x)+60.0*x^6.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="20.0*x^8.0*(3+5*x)+12.0*x^6.0*(3+5*x)+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="20.0*x^8.0*3*x+5.0/2.0*x^2.0-480.0/9.0*x^9.0+400.0/10.0*x^10.0+12.0*x^6.0*3*x+5.0/2.0*x^2.0-216.0/7.0*x^7.0+180.0/8.0*x^8.0+1.0/4.0*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="60.0*x^9.0+2.5*x^2.0-53.333333333333336*x^9.0+40.0*x^10.0+36.0*x^7.0+2.5*x^2.0-30.857142857142858*x^7.0+22.5*x^8.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "160.0*x^7.0*(3+5*x)+100.0*x^8.0+72.0*x^5.0*(3+5*x)+60.0*x^6.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "160.0*7.0*x^6.0*(3+5*x)+160.0*x^7.0*(0.0+5)+100.0*8.0*x^7.0+72.0*5.0*x^4.0*(3+5*x)+72.0*x^5.0*(0.0+5)+60.0*6.0*x^5.0+3.0*2.0*x^1.0-2.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "1120.0*x^6.0*(3+5*x)+800.0*x^7.0+800.0*x^7.0+360.0*x^4.0*(3+5*x)+360.0*x^5.0+360.0*x^5.0+6.0*x";
        UsageCalculus.EqnSolArrayMap3[2]="60.0*x^9.0+2.5*x^2.0-53.333333333333336*x^9.0+40.0*x^10.0+36.0*x^7.0+2.5*x^2.0-30.857142857142858*x^7.0+22.5*x^8.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="60.0/10.0*x^10.0+2.5/3.0*x^3.0-53.333333333333336/10.0*x^10.0+40.0/11.0*x^11.0+36.0/8.0*x^8.0+2.5/3.0*x^3.0-30.857142857142858/8.0*x^8.0+22.5/9.0*x^9.0+0.25/5.0*x^5.0-1.0/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="6.0*x^10.0+1.0/1.2*x^3.0-5.333333333333334*x^10.0+3.6363636363636362*x^11.0+4.5*x^8.0+1.0/1.2*x^3.0-3.857142857142857*x^8.0+2.5*x^9.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "1120.0*x^6.0*(3+5*x)+800.0*x^7.0+800.0*x^7.0+360.0*x^4.0*(3+5*x)+360.0*x^5.0+360.0*x^5.0+6.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "1120.0*6.0*x^5.0*(3+5*x)+1120.0*x^6.0*(0.0+5)+800.0*7.0*x^6.0+800.0*7.0*x^6.0+360.0*4.0*x^3.0*(3+5*x)+360.0*x^4.0*(0.0+5)+360.0*5.0*x^4.0+360.0*5.0*x^4.0+6.0";
        UsageCalculus.EqnSolArrayMap2[3] = "6720.0*x^5.0*(3+5*x)+5600.0*x^6.0+5600.0*x^6.0+5600.0*x^6.0+1440.0*x^3.0*(3+5*x)+1800.0*x^4.0+1800.0*x^4.0+1800.0*x^4.0+6.0";
        UsageCalculus.EqnSolArrayMap3[3]="6.0*x^10.0+1.0/1.2*x^3.0-5.333333333333334*x^10.0+3.6363636363636362*x^11.0+4.5*x^8.0+1.0/1.2*x^3.0-3.857142857142857*x^8.0+2.5*x^9.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="6.0/11.0*x^11.0+1.0/1.2/4.0*x^4.0-5.333333333333334/11.0*x^11.0+3.6363636363636362/12.0*x^12.0+4.5/9.0*x^9.0+1.0/1.2/4.0*x^4.0-3.857142857142857/9.0*x^9.0+2.5/10.0*x^10.0+1.0/20.0/6.0*x^6.0-1.0/3.0/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/1.8333333333333333*x^11.0+1.0/4.8*x^4.0-1.0/2.0624999999999996*x^11.0+1.0/3.3000000000000003*x^12.0+1.0/2.0*x^9.0+1.0/4.8*x^4.0-1.0/2.3333333333333335*x^9.0+1.0/4.0*x^10.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "6720.0*x^5.0*(3+5*x)+5600.0*x^6.0+5600.0*x^6.0+5600.0*x^6.0+1440.0*x^3.0*(3+5*x)+1800.0*x^4.0+1800.0*x^4.0+1800.0*x^4.0+6.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "6720.0*5.0*x^4.0*(3+5*x)+6720.0*x^5.0*(0.0+5)+5600.0*6.0*x^5.0+5600.0*6.0*x^5.0+5600.0*6.0*x^5.0+1440.0*3.0*x^2.0*(3+5*x)+1440.0*x^3.0*(0.0+5)+1800.0*4.0*x^3.0+1800.0*4.0*x^3.0+1800.0*4.0*x^3.0+6.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "33600.0*x^4.0*(3+5*x)+33600.0*x^5.0+33600.0*x^5.0+33600.0*x^5.0+33600.0*x^5.0+4320.0*x^2.0*(3+5*x)+7200.0*x^3.0+7200.0*x^3.0+7200.0*x^3.0+7200.0*x^3.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/1.8333333333333333*x^11.0+1.0/4.8*x^4.0-1.0/2.0624999999999996*x^11.0+1.0/3.3000000000000003*x^12.0+1.0/2.0*x^9.0+1.0/4.8*x^4.0-1.0/2.3333333333333335*x^9.0+1.0/4.0*x^10.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/1.8333333333333333/12.0*x^12.0+1.0/4.8/5.0*x^5.0-1.0/2.0624999999999996/12.0*x^12.0+1.0/3.3000000000000003/13.0*x^13.0+1.0/2.0/10.0*x^10.0+1.0/4.8/5.0*x^5.0-1.0/2.3333333333333335/10.0*x^10.0+1.0/4.0/11.0*x^11.0+1.0/120.0/7.0*x^7.0-1.0/12.0/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/22.0*x^12.0+1.0/24.0*x^5.0-1.0/24.749999999999993*x^12.0+1.0/42.900000000000006*x^13.0+1.0/20.0*x^10.0+1.0/24.0*x^5.0-1.0/23.333333333333336*x^10.0+1.0/44.0*x^11.0+1.0/840.0*x^7.0-1.0/60.0*x^5.0-2.0833333333333335*x^4.0";
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
        public static void TestCaseDiff80119() {
        //Test Case 80119
        UsageCalculus.TestCase = 80119;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(x-2)/(x+2)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "5.0*x^8.0+x^4.0+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "5.0*8.0*x^7.0+4.0*x^3.0+3.0*x^2.0-2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "40.0*x^7.0+4.0*x^3.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
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
        public static void TestCaseDiff80120() {
        //Test Case 80120
        UsageCalculus.TestCase = 80120;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(a)*(a)/(b)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "5.0*x^8.0+x^4.0+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "5.0*8.0*x^7.0+4.0*x^3.0+3.0*x^2.0-2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "40.0*x^7.0+4.0*x^3.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="a*a/b";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a*a/b*x";
        UsageCalculus.EqnSolArrayMap4[1]="a*a/b*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="a*a/b*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a*a/b*x^2.0*1.0/2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a*a/b/2.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="a*a/b/2.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a*a/b/2.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a*a/b/6.0*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4]="a*a/b/6.0*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a*a/b/6.0/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a*a/b/24.0*x^4.0";
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
        
        public static void TestCaseDiff80123() {
        //Test Case 80123
        UsageCalculus.TestCase = 80123;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(b+a)*4/x*5*x + x^5/x*(b/x+a)*2*6*x^2 + x^4/x - (2)*x*(5)/5- (2)*25*(2)/2";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "5.0*x^8.0+x^4.0+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "5.0*8.0*x^7.0+4.0*x^3.0+3.0*x^2.0-2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "40.0*x^7.0+4.0*x^3.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="(b+a)*20.0*x^8.0+12.0*x^6.0*(b/x+a)+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="(b+a)*20.0+12.0*x^6.0*b*ln(x)+a*x-ln+a*72.0/7.0*x^7.0+1.0/4.0*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="(b+a)20.0+b*12.0*x^6.0*ln(x)+a*x-ln(*x^7.0)a*72.0/7.0+a*10.285714285714286*x^7.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
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
        public static void TestCaseDiff80124() {
        //Test Case 80124
        UsageCalculus.TestCase = 80124;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(c*x+a)*b*4/x*5*x + x^5/x*(c*x)*2*6*x^2 + x^4/x - (2)*x*(5)/5- (2)*25*(2)/2";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "b*20.0*x^8.0*(c*x+a)+c*12.0*x^7.0+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "b*20.0*8.0*x^7.0*(c*x+a)+b*20.0*x^8.0*(c+a*0.0)+c*12.0*7.0*x^6.0+3.0*x^2.0-2.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "b*x^7.0+b*(c+a*0.0)*x^8.0+c*84.0*x^6.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="b*20.0*x^8.0*(c*x+a)+c*12.0*x^7.0+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="b*c/2.0*x^2.0+a*x-c*b*0.0/3.0*x^3.0+a*b*0.0/2.0*x^2.0+c*12.0/8.0*x^8.0+1.0/4.0*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="b*c/2.0*x^2.0+a*x-c*b*0.0*x^3.0+a*b*0.0*x^2.0+c*1.5*x^8.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="b*c/2.0*x^2.0+a*x-c*b*0.0*x^3.0+a*b*0.0*x^2.0+c*1.5*x^8.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="b*c/2.0/3.0*x^3.0+a/2.0*x^2.0-c*b*0.0/4.0*x^4.0+a*b*0.0/3.0*x^3.0+c*1.5/9.0*x^9.0+0.25/5.0*x^5.0-1.0/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="b*c*0.16666666666666666*x^3.0+a/2.0*x^2.0-c*b*0.0*x^4.0+a*b*0.0*x^3.0+c/6.0*x^9.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="b*c*0.16666666666666666*x^3.0+a/2.0*x^2.0-c*b*0.0*x^4.0+a*b*0.0*x^3.0+c/6.0*x^9.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="b*c*0.16666666666666666/4.0*x^4.0+a/2.0/3.0*x^3.0-c*b*0.0/5.0*x^5.0+a*b*0.0/4.0*x^4.0+c/6.0/10.0*x^10.0+1.0/20.0/6.0*x^6.0-1.0/3.0/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="b*c*0.041666666666666664*x^4.0+a*0.16666666666666666*x^3.0-c*b*0.0*x^5.0+a*b*0.0*x^4.0+c/60.0*x^10.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4]="b*c*0.041666666666666664*x^4.0+a*0.16666666666666666*x^3.0-c*b*0.0*x^5.0+a*b*0.0*x^4.0+c/60.0*x^10.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="b*c*0.041666666666666664/5.0*x^5.0+a*0.16666666666666666/4.0*x^4.0-c*b*0.0/6.0*x^6.0+a*b*0.0/5.0*x^5.0+c/60.0/11.0*x^11.0+1.0/120.0/7.0*x^7.0-1.0/12.0/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="b*c*0.008333333333333333*x^5.0+a*0.041666666666666664*x^4.0-c*b*0.0*x^6.0+a*b*0.0*x^5.0+c/660.0*x^11.0+1.0/840.0*x^7.0-1.0/60.0*x^5.0-2.0833333333333335*x^4.0";
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
        public static void TestCaseDiff80125() {
        //Test Case 80125
        UsageCalculus.TestCase = 80125;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(a*x+a)*4/x*5*x + x^5/x*(a*x+a)*2*6*x^2 + x^4/x - (2)*x*(5)/5- (2)*25*(2)/2";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "20.0*x^8.0*(a*x+a)+12.0*x^6.0*(a*x+a)+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "20.0*8.0*x^7.0*(a*x+a)+20.0*x^8.0*(a+a*0.0)+12.0*6.0*x^5.0*(a*x+a)+12.0*x^6.0*(a+a*0.0)+3.0*x^2.0-2.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "160.0*x^7.0*(a*x+a)+(a+a*0.0)*20.0*x^8.0+72.0*x^5.0*(a*x+a)+(a+a*0.0)*12.0*x^6.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="20.0*x^8.0*(a*x+a)+12.0*x^6.0*(a*x+a)+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="20.0*x^8.0*a/2.0*x^2.0+a*x-a*80.0/10.0*x^10.0+a*160.0/9.0*x^9.0+12.0*x^6.0*a/2.0*x^2.0+a*x-a*36.0/8.0*x^8.0+a*72.0/7.0*x^7.0+1.0/4.0*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a*10.0*x^10.0+a*x-a*8.0*x^10.0+a*17.77777777777778*x^9.0+a*6.0*x^8.0+a*x-a*4.5*x^8.0+a*10.285714285714286*x^7.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "160.0*x^7.0*(a*x+a)+(a+a*0.0)*20.0*x^8.0+72.0*x^5.0*(a*x+a)+(a+a*0.0)*12.0*x^6.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "160.0*7.0*x^6.0*(a*x+a)+160.0*x^7.0*(a+a*0.0)+(a+a*0.0)*20.0+72.0*5.0*x^4.0*(a*x+a)+72.0*x^5.0*(a+a*0.0)+(a+a*0.0)*12.0+3.0*2.0*x^1.0-2.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "1120.0*x^6.0*(a*x+a)+(a+a*0.0)*160.0*x^7.0+(a+a*0.0)20.0+360.0*x^4.0*(a*x+a)+(a+a*0.0)*72.0*x^5.0+(a+a*0.0)12.0+6.0*x";
        UsageCalculus.EqnSolArrayMap3[2]="a*10.0*x^10.0+a*x-a*8.0*x^10.0+a*17.77777777777778*x^9.0+a*6.0*x^8.0+a*x-a*4.5*x^8.0+a*10.285714285714286*x^7.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a*10.0/11.0*x^11.0+a/2.0*x^2.0-a*8.0/11.0*x^11.0+a*17.77777777777778/10.0*x^10.0+a*6.0/9.0*x^9.0+a/2.0*x^2.0-a*4.5/9.0*x^9.0+a*10.285714285714286/8.0*x^8.0+0.25/5.0*x^5.0-1.0/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a*0.9090909090909091*x^11.0+a/2.0*x^2.0-a*0.7272727272727273*x^11.0+a*1.777777777777778*x^10.0+a*0.6666666666666666*x^9.0+a/2.0*x^2.0-a*0.5*x^9.0+a*1.2857142857142858*x^8.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "1120.0*x^6.0*(a*x+a)+(a+a*0.0)*160.0*x^7.0+(a+a*0.0)20.0+360.0*x^4.0*(a*x+a)+(a+a*0.0)*72.0*x^5.0+(a+a*0.0)12.0+6.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "1120.0*6.0*x^5.0*(a*x+a)+1120.0*x^6.0*(a+a*0.0)+(a+a*0.0)*160.0+(a+a*0.0)20.0*0.0+360.0*4.0*x^3.0*(a*x+a)+360.0*x^4.0*(a+a*0.0)+(a+a*0.0)*72.0+(a+a*0.0)12.0*0.0+6.0";
        UsageCalculus.EqnSolArrayMap2[3] = "6720.0*x^5.0*(a*x+a)+(a+a*0.0)*1120.0*x^6.0+(a+a*0.0)160.0+(a+a*0.0)20.0*0.0+1440.0*x^3.0*(a*x+a)+(a+a*0.0)*360.0*x^4.0+(a+a*0.0)72.0+(a+a*0.0)12.0*0.0+6.0";
        UsageCalculus.EqnSolArrayMap3[3]="a*0.9090909090909091*x^11.0+a/2.0*x^2.0-a*0.7272727272727273*x^11.0+a*1.777777777777778*x^10.0+a*0.6666666666666666*x^9.0+a/2.0*x^2.0-a*0.5*x^9.0+a*1.2857142857142858*x^8.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a*0.9090909090909091/12.0*x^12.0+a/2.0/3.0*x^3.0-a*0.7272727272727273/12.0*x^12.0+a*1.777777777777778/11.0*x^11.0+a*0.6666666666666666/10.0*x^10.0+a/2.0/3.0*x^3.0-a*0.5/10.0*x^10.0+a*1.2857142857142858/9.0*x^9.0+1.0/20.0/6.0*x^6.0-1.0/3.0/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a*0.07575757575757576*x^12.0+a*0.16666666666666666*x^3.0-a*0.06060606060606061*x^12.0+a*0.16161616161616163*x^11.0+a*0.06666666666666667*x^10.0+a*0.16666666666666666*x^3.0-a*0.05*x^10.0+a/6.999999999999999*x^9.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "6720.0*x^5.0*(a*x+a)+(a+a*0.0)*1120.0*x^6.0+(a+a*0.0)160.0+(a+a*0.0)20.0*0.0+1440.0*x^3.0*(a*x+a)+(a+a*0.0)*360.0*x^4.0+(a+a*0.0)72.0+(a+a*0.0)12.0*0.0+6.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "6720.0*5.0*x^4.0*(a*x+a)+6720.0*x^5.0*(a+a*0.0)+(a+a*0.0)*1120.0+(a+a*0.0)160.0*0.0+(a+a*0.0)20.0*0.0*0.0+1440.0*3.0*x^2.0*(a*x+a)+1440.0*x^3.0*(a+a*0.0)+(a+a*0.0)*360.0+(a+a*0.0)72.0*0.0+(a+a*0.0)12.0*0.0*0.0+6.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "33600.0*x^4.0*(a*x+a)+(a+a*0.0)*6720.0*x^5.0+(a+a*0.0)1120.0+(a+a*0.0)160.0*0.0+(a+a*0.0)20.0*0.0+4320.0*x^2.0*(a*x+a)+(a+a*0.0)*1440.0*x^3.0+(a+a*0.0)360.0+(a+a*0.0)72.0*0.0+(a+a*0.0)12.0*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a*0.07575757575757576*x^12.0+a*0.16666666666666666*x^3.0-a*0.06060606060606061*x^12.0+a*0.16161616161616163*x^11.0+a*0.06666666666666667*x^10.0+a*0.16666666666666666*x^3.0-a*0.05*x^10.0+a/6.999999999999999*x^9.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a*0.07575757575757576/13.0*x^13.0+a*0.16666666666666666/4.0*x^4.0-a*0.06060606060606061/13.0*x^13.0+a*0.16161616161616163/12.0*x^12.0+a*0.06666666666666667/11.0*x^11.0+a*0.16666666666666666/4.0*x^4.0-a*0.05/11.0*x^11.0+a/6.999999999999999/10.0*x^10.0+1.0/120.0/7.0*x^7.0-1.0/12.0/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a*0.005827505827505828*x^13.0+a*0.041666666666666664*x^4.0-a*0.004662004662004662*x^13.0+a*0.01346801346801347*x^12.0+a*0.006060606060606061*x^11.0+a*0.041666666666666664*x^4.0-a*0.004545454545454546*x^11.0+a/69.99999999999999*x^10.0+1.0/840.0*x^7.0-1.0/60.0*x^5.0-2.0833333333333335*x^4.0";
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
        public static void TestCaseDiff80126() {
        //Test Case 80126
        UsageCalculus.TestCase = 80126;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(b/c*x+a)*a*4/x*5*x + x^5/x*(b/c*x+a)*a*2*6*x^2 + x^4/x - (2)*x*(5)/5- (2)*25*(2)/2";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a*20.0*x^8.0*(b/c*x+a)+a*12.0*x^6.0*(b/c*x+a)+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a*20.0*8.0*x^7.0*(b/c*x+a)+a*20.0*x^8.0*(b/c+a*0.0)+a*12.0*6.0*x^5.0*(b/c*x+a)+a*12.0*x^6.0*(b/c+a*0.0)+3.0*x^2.0-2.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a*x^7.0+a*(b/c+a*0.0)*x^8.0+a*x^5.0+a*(b/c+a*0.0)*x^6.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="a*20.0*x^8.0*(b/c*x+a)+a*12.0*x^6.0*(b/c*x+a)+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a*b/c*x^2.0*1.0/2.0+a*x-b/c*a*0.0/3.0*x^3.0+a*a*0.0/2.0*x^2.0+a*b/c*x^2.0*1.0/2.0+a*x-b/c*a*0.0/3.0*x^3.0+a*a*0.0/2.0*x^2.0+1.0/4.0*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a*b/c/2.0*x^2.0+a*x-b/c*a*0.0*x^3.0+a*a*0.0*x^2.0+a*b/c/2.0*x^2.0+a*x-b/c*a*0.0*x^3.0+a*a*0.0*x^2.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="a*b/c/2.0*x^2.0+a*x-b/c*a*0.0*x^3.0+a*a*0.0*x^2.0+a*b/c/2.0*x^2.0+a*x-b/c*a*0.0*x^3.0+a*a*0.0*x^2.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a*b/c/2.0/3.0*x^3.0+a/2.0*x^2.0-b/c*a*0.0/4.0*x^4.0+a*a*0.0/3.0*x^3.0+a*b/c/2.0/3.0*x^3.0+a/2.0*x^2.0-b/c*a*0.0/4.0*x^4.0+a*a*0.0/3.0*x^3.0+0.25/5.0*x^5.0-1.0/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a*b/c*0.16666666666666666*x^3.0+a/2.0*x^2.0-b/c*a*0.0*x^4.0+a*a*0.0*x^3.0+a*b/c*0.16666666666666666*x^3.0+a/2.0*x^2.0-b/c*a*0.0*x^4.0+a*a*0.0*x^3.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="a*b/c*0.16666666666666666*x^3.0+a/2.0*x^2.0-b/c*a*0.0*x^4.0+a*a*0.0*x^3.0+a*b/c*0.16666666666666666*x^3.0+a/2.0*x^2.0-b/c*a*0.0*x^4.0+a*a*0.0*x^3.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a*b/c*0.16666666666666666/4.0*x^4.0+a/2.0/3.0*x^3.0-b/c*a*0.0/5.0*x^5.0+a*a*0.0/4.0*x^4.0+a*b/c*0.16666666666666666/4.0*x^4.0+a/2.0/3.0*x^3.0-b/c*a*0.0/5.0*x^5.0+a*a*0.0/4.0*x^4.0+1.0/20.0/6.0*x^6.0-1.0/3.0/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a*b/c*0.041666666666666664*x^4.0+a*0.16666666666666666*x^3.0-b/c*a*0.0*x^5.0+a*a*0.0*x^4.0+a*b/c*0.041666666666666664*x^4.0+a*0.16666666666666666*x^3.0-b/c*a*0.0*x^5.0+a*a*0.0*x^4.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4]="a*b/c*0.041666666666666664*x^4.0+a*0.16666666666666666*x^3.0-b/c*a*0.0*x^5.0+a*a*0.0*x^4.0+a*b/c*0.041666666666666664*x^4.0+a*0.16666666666666666*x^3.0-b/c*a*0.0*x^5.0+a*a*0.0*x^4.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a*b/c*0.041666666666666664/5.0*x^5.0+a*0.16666666666666666/4.0*x^4.0-b/c*a*0.0/6.0*x^6.0+a*a*0.0/5.0*x^5.0+a*b/c*0.041666666666666664/5.0*x^5.0+a*0.16666666666666666/4.0*x^4.0-b/c*a*0.0/6.0*x^6.0+a*a*0.0/5.0*x^5.0+1.0/120.0/7.0*x^7.0-1.0/12.0/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a*b/c*0.008333333333333333*x^5.0+a*0.041666666666666664*x^4.0-b/c*a*0.0*x^6.0+a*a*0.0*x^5.0+a*b/c*0.008333333333333333*x^5.0+a*0.041666666666666664*x^4.0-b/c*a*0.0*x^6.0+a*a*0.0*x^5.0+1.0/840.0*x^7.0-1.0/60.0*x^5.0-2.0833333333333335*x^4.0";
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
    public static void TestCaseDiff80127() {
        //Test Case 80127
        UsageCalculus.TestCase = 80127;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(a*x)/x + x^5/x -x^8*(a*x)/x+ x^4/x - (2)*x*5/5- (2)*25*(2)/2";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a*x^8.0+x^4.0-a*x^8.0+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a*8.0*x^7.0+4.0*x^3.0-a*8.0*x^7.0+3.0*x^2.0-2.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a*8.0*x^7.0+4.0*x^3.0-a*8.0*x^7.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="a*x^8.0+x^4.0-a*x^8.0+x^3.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a/9.0*x^9.0+1.0/5.0*x^5.0-a/9.0*x^9.0+1.0/4.0*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a/9.0*x^9.0+0.2*x^5.0-a/9.0*x^9.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a*8.0*x^7.0+4.0*x^3.0-a*8.0*x^7.0+3.0*x^2.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a*8.0*7.0*x^6.0+4.0*3.0*x^2.0-a*8.0*7.0*x^6.0+3.0*2.0*x^1.0-2.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a*56.0*x^6.0+12.0*x^2.0-a*56.0*x^6.0+6.0*x";
        UsageCalculus.EqnSolArrayMap3[2]="a/9.0*x^9.0+0.2*x^5.0-a/9.0*x^9.0+0.25*x^4.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a/9.0/10.0*x^10.0+0.2/6.0*x^6.0-a/9.0/10.0*x^10.0+0.25/5.0*x^5.0-1.0/3.0*x^3.0-50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a/90.0*x^10.0+0.03333333333333333*x^6.0-a/90.0*x^10.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a*56.0*x^6.0+12.0*x^2.0-a*56.0*x^6.0+6.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a*56.0*6.0*x^5.0+12.0*2.0*x^1.0-a*56.0*6.0*x^5.0+6.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a*336.0*x^5.0+24.0*x-a*336.0*x^5.0+6.0";
        UsageCalculus.EqnSolArrayMap3[3]="a/90.0*x^10.0+0.03333333333333333*x^6.0-a/90.0*x^10.0+1.0/20.0*x^5.0-1.0/3.0*x^3.0-25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a/90.0/11.0*x^11.0+0.03333333333333333/7.0*x^7.0-a/90.0/11.0*x^11.0+1.0/20.0/6.0*x^6.0-1.0/3.0/4.0*x^4.0-25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a/990.0*x^11.0+0.0047619047619047615*x^7.0-a/990.0*x^11.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a*336.0*x^5.0+24.0*x-a*336.0*x^5.0+6.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a*336.0*5.0*x^4.0+24.0-a*336.0*5.0*x^4.0+6.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a*1680.0*x^4.0+24.0-a*1680.0*x^4.0";
        UsageCalculus.EqnSolArrayMap3[4]="a/990.0*x^11.0+0.0047619047619047615*x^7.0-a/990.0*x^11.0+1.0/120.0*x^6.0-1.0/12.0*x^4.0-8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a/990.0/12.0*x^12.0+0.0047619047619047615/8.0*x^8.0-a/990.0/12.0*x^12.0+1.0/120.0/7.0*x^7.0-1.0/12.0/5.0*x^5.0-8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a/11880.0*x^12.0+5.952380952380952E-4*x^8.0-a/11880.0*x^12.0+1.0/840.0*x^7.0-1.0/60.0*x^5.0-2.0833333333333335*x^4.0";
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
    public static void TestCaseDiff80128() {
        //Test Case 80128
        UsageCalculus.TestCase = 80128;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(x-25)/0";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "Infinity";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "";
        UsageCalculus.EqnSolArrayMap2[1] = "";
        UsageCalculus.EqnSolArrayMap3[1]="Infinity";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="Infinity*x";
        UsageCalculus.EqnSolArrayMap4[1]="Infinity*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="Infinity*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="Infinity/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="Infinity/2.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="Infinity/2.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="Infinity*2.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="Infinity*0.6666666666666666*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4]="Infinity*0.6666666666666666*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="Infinity*0.6666666666666666/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="Infinity*0.16666666666666666*x^4.0";
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
    public static void TestCaseDiff80129() {
        //Test Case 80129
        UsageCalculus.TestCase = 80129;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(x-25)/1";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 2;
        UsageCalculus.MaxIntegreOrder = 5;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x-25";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "1.0";
        UsageCalculus.EqnSolArrayMap3[1]="x-25";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "0.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/2.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/6.0/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/24.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/120.0*x^5.0-1.0416666666666667*x^4.0";
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
    
    public static void TestCaseDiff80132() {
        //Test Case 80132
        UsageCalculus.TestCase = 80132;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(a-b) + (a-b) + (a-b) - (a-b)- 2*(a-b)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "a";
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
}
