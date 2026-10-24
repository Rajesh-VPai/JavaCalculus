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
public class CoPilotHadammard2 {
    public static void CoPilotEqnHadammard(String AlgoName, long j) {
        if (((!RunAllTestCasesFlag) && (IgnoreKnownIssuesFlag == false) && (AlgoName.equalsIgnoreCase("mainIntegrTest")) && (IntegralGapInfinity(j)))
                || ((!RunAllTestCasesFlag) && (IgnoreKnownIssuesFlag == false) && (AlgoName.equalsIgnoreCase("mainDiffTest")) && (DifferentialGapInfinity(j)))) {
            KnownIssueTestCasesFlag = true;
            KnownIssues++;
            KnownIssuesTestCases.put(KnownIssues, "" + j);
            System.out.println(ConsoleColors.RED + "SignedX TestCase:j= " + j + ": Infinite Loop GAP" + ConsoleColors.RESET);
        } else if (((!RunAllTestCasesFlag) && (IgnoreKnownIssuesFlag == false) & (AlgoName.equalsIgnoreCase("mainIntegrTest")) && (IntegralGapException(j)))
                || ((!RunAllTestCasesFlag) && (IgnoreKnownIssuesFlag == false) && (AlgoName.equalsIgnoreCase("mainDiffTest")) && (DifferentialGapException(j)))) {
            KnownIssueTestCasesFlag = true;
            KnownIssues++;
            KnownIssuesTestCases.put(KnownIssues, "" + j);
            System.out.println(ConsoleColors.RED + "SignedX TestCase:j= " + j + ": Exception GAP" + ConsoleColors.RESET);
        } else if (((!RunAllTestCasesFlag) && (IgnoreCoreIssuesFlag == false) && (AlgoName.equalsIgnoreCase("mainIntegrTest")) && (TrueIntegralGapInfinity(j)))
                || ((!RunAllTestCasesFlag) && (IgnoreCoreIssuesFlag == false) && (AlgoName.equalsIgnoreCase("mainDiffTest")) && (TrueDifferentialGapInfinity(j)))) {
            CoreKnownIssuesTestCasesFlag = true;
            CoreKnownIssues++;
            System.out.println(ConsoleColors.RED + "Isolation TestCase:j= " + j + ": Infinite Loop GAP" + ConsoleColors.RESET);
        } else if (((!RunAllTestCasesFlag) && (IgnoreCoreIssuesFlag == false) && (AlgoName.equalsIgnoreCase("mainIntegrTest")) && (TrueIntegralGapException(j)))
                || ((!RunAllTestCasesFlag) && (IgnoreCoreIssuesFlag == false) && (AlgoName.equalsIgnoreCase("mainDiffTest")) && (TrueDifferentialGapException(j)))) {
            CoreKnownIssuesTestCasesFlag = true;
            CoreKnownIssues++;
            System.out.println(ConsoleColors.RED + "Isolation TestCase:j= " + j + ": Exception GAP" + ConsoleColors.RESET);
        } else {
            switch (j) {
     
                case 121201L:
 TestCaseDiff121201(); 
 break;
case 121202L:
 TestCaseDiff121202(); 
 break;
case 121203L:
 TestCaseDiff121203(); 
 break;
case 121204L:
 TestCaseDiff121204(); 
 break;
case 121205L:
 TestCaseDiff121205(); 
 break;
case 121206L:
 TestCaseDiff121206(); 
 break;
case 121207L:
 TestCaseDiff121207(); 
 break;
case 121208L:
 TestCaseDiff121208(); 
 break;
case 121209L:
 TestCaseDiff121209(); 
 break;
case 121210L:
 TestCaseDiff121210(); 
 break;
case 121211L:
 TestCaseDiff121211(); 
 break;
case 121212L:
 TestCaseDiff121212(); 
 break;
case 121213L:
 TestCaseDiff121213(); 
 break;
case 121214L:
 TestCaseDiff121214(); 
 break;
case 121215L:
 TestCaseDiff121215(); 
 break;
case 121216L:
 TestCaseDiff121216(); 
 break;
case 121217L:
 TestCaseDiff121217(); 
 break;
case 121218L:
 TestCaseDiff121218(); 
 break;
case 121219L:
 TestCaseDiff121219(); 
 break;
case 121220L:
 TestCaseDiff121220(); 
 break;
case 121221L:
 TestCaseDiff121221(); 
 break;
case 121222L:
 TestCaseDiff121222(); 
 break;
case 121223L:
 TestCaseDiff121223(); 
 break;
case 121224L:
 TestCaseDiff121224(); 
 break;
case 121225L:
 TestCaseDiff121225(); 
 break;
case 121226L:
 TestCaseDiff121226(); 
 break;
case 121227L:
 TestCaseDiff121227(); 
 break;
case 121228L:
 TestCaseDiff121228(); 
 break;
case 121229L:
 TestCaseDiff121229(); 
 break;
case 121230L:
 TestCaseDiff121230(); 
 break;
case 121231L:
 TestCaseDiff121231(); 
 break;
case 121232L:
 TestCaseDiff121232(); 
 break;
case 121233L:
 TestCaseDiff121233(); 
 break;
case 121234L:
 TestCaseDiff121234(); 
 break;
case 121235L:
 TestCaseDiff121235(); 
 break;
case 121236L:
 TestCaseDiff121236(); 
 break;
case 121237L:
 TestCaseDiff121237(); 
 break;
case 121238L:
 TestCaseDiff121238(); 
 break;
case 121239L:
 TestCaseDiff121239(); 
 break;
case 121240L:
 TestCaseDiff121240(); 
 break;
case 121241L:
 TestCaseDiff121241(); 
 break;
case 121242L:
 TestCaseDiff121242(); 
 break;
case 121243L:
 TestCaseDiff121243(); 
 break;
case 121244L:
 TestCaseDiff121244(); 
 break;
case 121245L:
 TestCaseDiff121245(); 
 break;
case 121246L:
 TestCaseDiff121246(); 
 break;
case 121247L:
 TestCaseDiff121247(); 
 break;
case 121248L:
 TestCaseDiff121248(); 
 break;
case 121249L:
 TestCaseDiff121249(); 
 break;
case 121250L:
 TestCaseDiff121250(); 
 break;
case 121251L:
 TestCaseDiff121251(); 
 break;
case 121252L:
 TestCaseDiff121252(); 
 break;
case 121253L:
 TestCaseDiff121253(); 
 break;
case 121254L:
 TestCaseDiff121254(); 
 break;
case 121255L:
 TestCaseDiff121255(); 
 break;
case 121256L:
 TestCaseDiff121256(); 
 break;
case 121257L:
 TestCaseDiff121257(); 
 break;
case 121258L:
 TestCaseDiff121258(); 
 break;
case 121259L:
 TestCaseDiff121259(); 
 break;
case 121260L:
 TestCaseDiff121260(); 
 break;
case 121261L:
 TestCaseDiff121261(); 
 break;
case 121262L:
 TestCaseDiff121262(); 
 break;
case 121263L:
 TestCaseDiff121263(); 
 break;
case 121264L:
 TestCaseDiff121264(); 
 break;
case 121265L:
 TestCaseDiff121265(); 
 break;
case 121266L:
 TestCaseDiff121266(); 
 break;
case 121267L:
 TestCaseDiff121267(); 
 break;
case 121268L:
 TestCaseDiff121268(); 
 break;
case 121269L:
 TestCaseDiff121269(); 
 break;
case 121270L:
 TestCaseDiff121270(); 
 break;
case 121271L:
 TestCaseDiff121271(); 
 break;
case 121272L:
 TestCaseDiff121272(); 
 break;
case 121273L:
 TestCaseDiff121273(); 
 break;
case 121274L:
 TestCaseDiff121274(); 
 break;
case 121275L:
 TestCaseDiff121275(); 
 break;
case 121276L:
 TestCaseDiff121276(); 
 break;
case 121277L:
 TestCaseDiff121277(); 
 break;
case 121278L:
 TestCaseDiff121278(); 
 break;
case 121279L:
 TestCaseDiff121279(); 
 break;
case 121280L:
 TestCaseDiff121280(); 
 break;
case 121281L:
 TestCaseDiff121281(); 
 break;
case 121282L:
 TestCaseDiff121282(); 
 break;
case 121283L:
 TestCaseDiff121283(); 
 break;
case 121284L:
 TestCaseDiff121284(); 
 break;
case 121285L:
 TestCaseDiff121285(); 
 break;
case 121286L:
 TestCaseDiff121286(); 
 break;
case 121287L:
 TestCaseDiff121287(); 
 break;
case 121288L:
 TestCaseDiff121288(); 
 break;
case 121289L:
 TestCaseDiff121289(); 
 break;
case 121290L:
 TestCaseDiff121290(); 
 break;
case 121291L:
 TestCaseDiff121291(); 
 break;
case 121292L:
 TestCaseDiff121292(); 
 break;
case 121293L:
 TestCaseDiff121293(); 
 break;
case 121294L:
 TestCaseDiff121294(); 
 break;
case 121295L:
 TestCaseDiff121295(); 
 break;
case 121296L:
 TestCaseDiff121296(); 
 break;
case 121297L:
 TestCaseDiff121297(); 
 break;
case 121298L:
 TestCaseDiff121298(); 
 break;
case 121299L:
 TestCaseDiff121299(); 
 break;
case 121300L:
 TestCaseDiff121300(); 
 break;

                
default:
                    System.out.println(ConsoleColors.RED + "CoPilotEqnBasic TestCase:j= " + j + ": Gap" + ConsoleColors.RESET);
                    break;
            }
        }
    }
 
 public static void TestCaseDiff121201() {
 UsageCalculus.TestCase = 121201;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*x^3*3*x3*x0/-1*x0^2*-2*x0^3-1*x^2*-2*x^3*3*x/1*x^22*x^33*x0/1*x0^21*x^2*--3*x^3*1*x-3*x^3*1*x/2*x^2*-3*x^31*x02*x^2*-3*x^33*x^3*-1*x/2*x^22*x0^2*-3*x0^3*1*x0/-3*x0^23*x^31*x/-3*x^22*x^3*3*x3*x0/-1*x0^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=200 EqnNumber=3 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[32, 3, 13, 14, 1, 1, 2, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 2, 3, 14, 3, 1, 2, 3, 14, 3, 4, 12, 1, 14, 15, 16, 25]"+
"// DOEMatrixRow=[64, 4, 15, 2, 3, 2, 3, 4, 2, 3, 4, 2, 3, 1, 1, 3, 1, 5, 4, 3, 1, 5, 2, 1, 5, 2, 3, 1, 1, 6, 2, 5, 3]"+
//Tail EqnIndex=200 EqnNumber=3 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[32, 3, 13, 14, 1, 1, 2, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 2, 3, 14, 3, 1, 2, 3, 14, 3, 4, 12, 1, 14, 15, 16, 25]"+
"// DOEMatrixRow=[64, 4, 15, 2, 3, 2, 3, 4, 2, 3, 4, 2, 3, 1, 1, 3, 1, 5, 4, 3, 1, 5, 2, 1, 5, 2, 3, 1, 1, 6, 2, 5, 3]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "12.0*x^3.0+18.0*x^67.0-3.0*x^4.0+6.75*x^155.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "12.0*3.0*x^2.0+18.0*67.0*x^66.0-3.0*4.0*x^3.0+6.75*155.0*x^154.0";
 UsageCalculus.EqnSolArrayMap2[1] = "36.0*x^2.0+1206.0*x^66.0-12.0*x^3.0+1046.25*x^154.0";
 UsageCalculus.EqnSolArrayMap3[1] = "12.0*x^3.0+18.0*x^67.0-3.0*x^4.0+6.75*x^155.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "12.0/4.0*x^4.0+18.0/68.0*x^68.0-3.0/5.0*x^5.0+6.75/156.0*x^156.0";
 UsageCalculus.EqnSolArrayMap4[1] = "3.0*x^4.0+1.0/3.7777777777777777*x^68.0-1.0/1.6666666666666667*x^5.0+1.0/23.11111111111111*x^156.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "36.0*x^2.0+1206.0*x^66.0-12.0*x^3.0+1046.25*x^154.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "36.0*2.0*x^1.0+1206.0*66.0*x^65.0-12.0*3.0*x^2.0+1046.25*154.0*x^153.0";
 UsageCalculus.EqnSolArrayMap2[2] = "72.0*x+79596.0*x^65.0-36.0*x^2.0+161122.5*x^153.0";
 UsageCalculus.EqnSolArrayMap3[2] = "3.0*x^4.0+1.0/3.7777777777777777*x^68.0-1.0/1.6666666666666667*x^5.0+1.0/23.11111111111111*x^156.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "3.0/5.0*x^5.0+1.0/3.7777777777777777/69.0*x^69.0-1.0/1.6666666666666667/6.0*x^6.0+1.0/23.11111111111111/157.0*x^157.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/1.6666666666666667*x^5.0+1.0/260.6666666666667*x^69.0-1.0/10.0*x^6.0+1.0/3628.4444444444443*x^157.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "72.0*x+79596.0*x^65.0-36.0*x^2.0+161122.5*x^153.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "72.0+79596.0*65.0*x^64.0-36.0*2.0*x^1.0+161122.5*153.0*x^152.0";
 UsageCalculus.EqnSolArrayMap2[3] = "72.0+5173740.0*x^64.0-72.0*x+2.46517425E7*x^152.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/1.6666666666666667*x^5.0+1.0/260.6666666666667*x^69.0-1.0/10.0*x^6.0+1.0/3628.4444444444443*x^157.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/1.6666666666666667/6.0*x^6.0+1.0/260.6666666666667/70.0*x^70.0-1.0/10.0/7.0*x^7.0+1.0/3628.4444444444443/158.0*x^158.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/10.0*x^6.0+1.0/18246.666666666668*x^70.0-1.0/70.0*x^7.0+1.0/573294.2222222222*x^158.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "72.0+5173740.0*x^64.0-72.0*x+2.46517425E7*x^152.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "0.0+5173740.0*64.0*x^63.0-72.0+0.0*152.0*x^151.0";
 UsageCalculus.EqnSolArrayMap2[4] = "3.3111936E8*x^63.0-72.0+0.0*x^151.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/10.0*x^6.0+1.0/18246.666666666668*x^70.0-1.0/70.0*x^7.0+1.0/573294.2222222222*x^158.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/10.0/7.0*x^7.0+1.0/18246.666666666668/71.0*x^71.0-1.0/70.0/8.0*x^8.0+1.0/573294.2222222222/159.0*x^159.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/70.0*x^7.0+1.0/1295513.3333333335*x^71.0-1.0/560.0*x^8.0+1.0/9.115378133333334E7*x^159.0";
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

public static void TestCaseDiff121202() {
 UsageCalculus.TestCase = 121202;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*x0/-1*x0^2*-2*x0^3-1*xy^2*-2*xy^3*3*xy/1*xy^22*xy^33*x0/1*x0^21*xy^2*--3*xy^3*1*xy-3*xy^3*1*xy/2*xy^2*-3*xy^31*x02*xy^2*-3*xy^33*xy^3*-1*xy/2*xy^22*x0^2*-3*x0^3*1*x0/-3*x0^23*xy^31*xy/-3*xy^2-3*x0^2*-1*x0^3*2*x01*xy^3*2*xy/3*xy^2*--1*xy^33*x0/-1*x0^2-1*xy^2*-2*xy^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=201 EqnNumber=4 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[97, 4, 14, 15, 2, 3, 1, 2, 3, 2, 3, 2, 3, 1, 1, 3, 1, 1, 2, 3, 4, 15, 1, 2, 3, 4, 15, 1, 1, 13, 2, 15, 16, 17, 26]"+
"// DOEMatrixRow=[28, 5, 16, 3, 1, 3, 1, 5, 3, 4, 1, 1, 1, 2, 3, 1, 2, 6, 5, 1, 2, 1, 3, 2, 6, 3, 1, 2, 3, 7, 1, 6, 4]"+
//Tail EqnIndex=201 EqnNumber=4 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[97, 4, 14, 15, 2, 3, 1, 2, 3, 2, 3, 2, 3, 1, 1, 3, 1, 1, 2, 3, 4, 15, 1, 2, 3, 4, 15, 1, 1, 13, 2, 15, 16, 17, 26]"+
"// DOEMatrixRow=[28, 5, 16, 3, 1, 3, 1, 5, 3, 4, 1, 1, 1, 2, 3, 1, 2, 6, 5, 1, 2, 1, 3, 2, 6, 3, 1, 2, 3, 7, 1, 6, 4]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0*6.0+x0*18.0*xy^67.0-3.0*xy^4.0-x02*x0*2.25*xy^132.0+x0^2.0*x01*x0*4.0*xy^39.0+x0*xy^33.0+2.0*xy^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0*6.0*0.0+x0*18.0*67.0*xy^66.0-3.0*4.0*xy^3.0-x02*x0*2.25*132.0*xy^131.0+x0^2.0*x01*x0*4.0*39.0*xy^38.0+x0*33.0*xy^32.0+2.0*5.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0*0.0+x0*1206.0*xy^66.0-12.0*xy^3.0-x02*x0*297.0*xy^131.0+x0^2.0*x01*x0*156.0*xy^38.0+x0*33.0*xy^32.0+10.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0*6.0+x0*18.0*xy^67.0-3.0*xy^4.0-x02*x0*2.25*xy^132.0+x0^2.0*x01*x0*4.0*xy^39.0+x0*xy^33.0+2.0*xy^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0*6.0*xy+x0*18.0/68.0*xy^68.0-3.0/5.0*xy^5.0-x02*x0*2.25/133.0*xy^133.0+x0^2.0*x01*x0*4.0/40.0*xy^40.0+x0/34.0*xy^34.0+2.0/6.0*xy^6.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0*6.0*xy+x0/3.7777777777777777*xy^68.0-0.6*xy^5.0-x02*x0*0.016917293233082706*xy^133.0+x0^2.0*x01*x0*0.1*xy^40.0+x0/34.0*xy^34.0+1.0/3.0*xy^6.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0*0.0+x0*1206.0*xy^66.0-12.0*xy^3.0-x02*x0*297.0*xy^131.0+x0^2.0*x01*x0*156.0*xy^38.0+x0*33.0*xy^32.0+10.0*xy^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0*0.0+x0*1206.0*66.0*xy^65.0-12.0*3.0*xy^2.0-x02*x0*297.0*131.0*xy^130.0+x0^2.0*x01*x0*156.0*38.0*xy^37.0+x0*33.0*32.0*xy^31.0+10.0*4.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0*0.0+x0*79596.0*xy^65.0-36.0*xy^2.0-x02*x0*38907.0*xy^130.0+x0^2.0*x01*x0*5928.0*xy^37.0+x0*1056.0*xy^31.0+40.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0*6.0*xy+x0/3.7777777777777777*xy^68.0-0.6*xy^5.0-x02*x0*0.016917293233082706*xy^133.0+x0^2.0*x01*x0*0.1*xy^40.0+x0/34.0*xy^34.0+1.0/3.0*xy^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0*6.0/2.0*xy^2.0+x0/3.7777777777777777/69.0*xy^69.0-0.6/6.0*xy^6.0-x02*x0*0.016917293233082706/134.0*xy^134.0+x0^2.0*x01*x0*0.1/41.0*xy^41.0+x0/34.0/35.0*xy^35.0+1.0/3.0/7.0*xy^7.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0*3.0*xy^2.0+x0/260.6666666666667*xy^69.0-0.09999999999999999*xy^6.0-x02*x0*1.262484569633038E-4*xy^134.0+x0^2.0*x01*x0*0.0024390243902439024*xy^41.0+x0/1190.0*xy^35.0+1.0/21.0*xy^7.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0*0.0+x0*79596.0*xy^65.0-36.0*xy^2.0-x02*x0*38907.0*xy^130.0+x0^2.0*x01*x0*5928.0*xy^37.0+x0*1056.0*xy^31.0+40.0*xy^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0*0.0+x0*79596.0*65.0*xy^64.0-36.0*2.0*xy^1.0-x02*x0*38907.0*130.0*xy^129.0+x0^2.0*x01*x0*5928.0*37.0*xy^36.0+x0*1056.0*31.0*xy^30.0+40.0*3.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0*0.0+x0*5173740.0*xy^64.0-72.0*xy-x02*x0*5057910.0*xy^129.0+x0^2.0*x01*x0*219336.0*xy^36.0+x0*32736.0*xy^30.0+120.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0*3.0*xy^2.0+x0/260.6666666666667*xy^69.0-0.09999999999999999*xy^6.0-x02*x0*1.262484569633038E-4*xy^134.0-4.0*xy^134.0+x0^2.0*x01*x0*0.0024390243902439024*xy^41.0+x0/1190.0*xy^35.0+1.0/21.0*xy^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0*3.0/3.0*xy^3.0+x0/260.6666666666667/70.0*xy^70.0-0.09999999999999999/7.0*xy^7.0-x02*x0*1.262484569633038E-4/135.0*xy^135.0-4.0/135.0*xy^135.0+x0^2.0*x01*x0*0.0024390243902439024/42.0*xy^42.0+x0/1190.0/36.0*xy^36.0+1.0/21.0/8.0*xy^8.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0*xy^3.0+x0/18246.666666666668*xy^70.0-0.014285714285714285*xy^7.0-x02*x0/1069320.0*xy^135.0-1.0/33.75*xy^135.0-0.02962962962962963*xy^135.0+x0^2.0*x01*x0*5.8072009291521487E-5*xy^42.0+x0/42840.0*xy^36.0+1.0/168.0*xy^8.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0*0.0+x0*5173740.0*xy^64.0-72.0*xy-x02*x0*5057910.0*xy^129.0+x0^2.0*x01*x0*219336.0*xy^36.0+x0*32736.0*xy^30.0+120.0*xy^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0*0.0+x0*5173740.0*64.0*xy^63.0-72.0-x02*x0*5057910.0*129.0*xy^128.0+x0^2.0*x01*x0*219336.0*36.0*xy^35.0+x0*32736.0*30.0*xy^29.0+120.0*2.0*xy^1.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0*0.0+x0*3.3111936E8*xy^63.0-72.0-x02*x0*6.5247039E8*xy^128.0+x0^2.0*x01*x0*7896096.0*xy^35.0+x0*982080.0*xy^29.0+240.0*xy";
 UsageCalculus.EqnSolArrayMap3[4] = "x0*xy^3.0+x0/18246.666666666668*xy^70.0-0.014285714285714285*xy^7.0-x02*x0/1069320.0*xy^135.0-1.0/33.75*xy^135.0-0.02962962962962963*xy^135.0+x0^2.0*x01*x0*5.8072009291521487E-5*xy^42.0-5.0*xy^42.0+x0/42840.0*xy^36.0+1.0/168.0*xy^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0/4.0*xy^4.0+x0/18246.666666666668/71.0*xy^71.0-0.014285714285714285/8.0*xy^8.0-x02*x0/1069320.0/136.0*xy^136.0-1.0/33.75/136.0*xy^136.0-0.02962962962962963/136.0*xy^136.0+x0^2.0*x01*x0*5.8072009291521487E-5/43.0*xy^43.0-5.0/43.0*xy^43.0+x0/42840.0/37.0*xy^37.0+1.0/168.0/9.0*xy^9.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0/4.0*xy^4.0+x0/1295513.3333333335*xy^71.0-0.0017857142857142857*xy^8.0-x02*x0/1.4542752E8*xy^136.0-1.0/4590.0*xy^136.0-2.178649237472767E-4*xy^136.0+x0^2.0*x01*x0/740460.0*xy^43.0-1.0/8.6*xy^43.0-0.11627906976744186*xy^43.0+x0/1585080.0*xy^37.0+1.0/1512.0*xy^9.0";
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

public static void TestCaseDiff121203() {
 UsageCalculus.TestCase = 121203;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-1*xyz^2*-2*xyz^3*3*xyz/1*xyz^22*xyz^33*x0/1*x0^21*xyz^2*--3*xyz^3*1*xyz-3*xyz^3*1*xyz/2*xyz^2*-3*xyz^31*x02*xyz^2*-3*xyz^33*xyz^3*-1*xyz/2*xyz^22*x0^2*-3*x0^3*1*x0/-3*x0^23*xyz^31*xyz/-3*xyz^2-3*x0^2*-1*x0^3*2*x01*xyz^3*2*xyz/3*xyz^2*--1*xyz^32*xyz3*x0^2*--1*x0^3-1*xyz^2*-2*xyz^32*xyz^3*3*xyz";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=202 EqnNumber=5 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[62, 5, 15, 16, 3, 1, 2, 3, 1, 3, 4, 1, 1, 2, 3, 1, 2, 1, 3, 1, 1, 16, 2, 3, 1, 1, 16, 2, 3, 14, 3, 16, 1, 18, 27]"+
"// DOEMatrixRow=[94, 6, 17, 4, 2, 1, 2, 6, 1, 1, 2, 1, 2, 3, 4, 2, 3, 7, 6, 2, 3, 2, 1, 3, 1, 4, 2, 3, 4, 8, 2, 7, 5]"+
//Tail EqnIndex=202 EqnNumber=5 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[62, 5, 15, 16, 3, 1, 2, 3, 1, 3, 4, 1, 1, 2, 3, 1, 2, 1, 3, 1, 1, 16, 2, 3, 1, 1, 16, 2, 3, 14, 3, 16, 1, 18, 27]"+
"// DOEMatrixRow=[94, 6, 17, 4, 2, 1, 2, 6, 1, 1, 2, 1, 2, 3, 4, 2, 3, 7, 6, 2, 3, 2, 1, 3, 1, 4, 2, 3, 4, 8, 2, 7, 5]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0*18.0*xyz^67.0-3.0*xyz^4.0-x02*x0*2.25*xyz^132.0+x0^2.0*4.0*xyz^38.0-x0^2.0*xyz^32.0-x0^3.0+6.0*xyz^38.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0*18.0*67.0*xyz^66.0-3.0*4.0*xyz^3.0-x02*x0*2.25*132.0*xyz^131.0+x0^2.0*4.0*38.0*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0+6.0*38.0*xyz^37.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0*1206.0*xyz^66.0-12.0*xyz^3.0-x02*x0*297.0*xyz^131.0+x0^2.0*152.0*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0+228.0*xyz^37.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0*18.0*xyz^67.0-3.0*xyz^4.0-x02*x0*2.25*xyz^132.0+x0^2.0*4.0*xyz^38.0-x0^2.0*xyz^32.0-x0^3.0+6.0*xyz^38.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0*18.0/68.0*xyz^68.0-3.0/5.0*xyz^5.0-x02*x0*2.25/133.0*xyz^133.0+x0^2.0*4.0/39.0*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz+6.0/39.0*xyz^39.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0/3.7777777777777777*xyz^68.0-0.6*xyz^5.0-x02*x0*0.016917293233082706*xyz^133.0+x0^2.0*0.10256410256410256*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz+1.0/6.5*xyz^39.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0*1206.0*xyz^66.0-12.0*xyz^3.0-x02*x0*297.0*xyz^131.0+x0^2.0*152.0*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0+228.0*xyz^37.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0*1206.0*66.0*xyz^65.0-12.0*3.0*xyz^2.0-x02*x0*297.0*131.0*xyz^130.0+x0^2.0*152.0*37.0*xyz^36.0-x0^2.0*32.0*31.0*xyz^30.0-x0^3.0*0.0*0.0+228.0*37.0*xyz^36.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0*79596.0*xyz^65.0-36.0*xyz^2.0-x02*x0*38907.0*xyz^130.0+x0^2.0*5624.0*xyz^36.0-x0^2.0*992.0*xyz^30.0-x0^3.0*0.0+8436.0*xyz^36.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0/3.7777777777777777*xyz^68.0-0.6*xyz^5.0-x02*x0*0.016917293233082706*xyz^133.0+x0^2.0*0.10256410256410256*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz+1.0/6.5*xyz^39.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0/3.7777777777777777/69.0*xyz^69.0-0.6/6.0*xyz^6.0-x02*x0*0.016917293233082706/134.0*xyz^134.0+x0^2.0*0.10256410256410256/40.0*xyz^40.0-x0^2.0/33.0/34.0*xyz^34.0-x0^3.0/2.0*xyz^2.0+1.0/6.5/40.0*xyz^40.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0/260.6666666666667*xyz^69.0-0.09999999999999999*xyz^6.0-x02*x0*1.262484569633038E-4*xyz^134.0+x0^2.0*0.002564102564102564*xyz^40.0-x0^2.0*8.9126559714795E-4*xyz^34.0-x0^3.0/2.0*xyz^2.0+1.0/260.0*xyz^40.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0*79596.0*xyz^65.0-36.0*xyz^2.0-x02*x0*38907.0*xyz^130.0+x0^2.0*5624.0*xyz^36.0-x0^2.0*992.0*xyz^30.0-x0^3.0*0.0+8436.0*xyz^36.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0*79596.0*65.0*xyz^64.0-36.0*2.0*xyz^1.0-x02*x0*38907.0*130.0*xyz^129.0+x0^2.0*5624.0*36.0*xyz^35.0-x0^2.0*992.0*30.0*xyz^29.0-x0^3.0*0.0*0.0+8436.0*36.0*xyz^35.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0*5173740.0*xyz^64.0-72.0*xyz-x02*x0*5057910.0*xyz^129.0+x0^2.0*202464.0*xyz^35.0-x0^2.0*29760.0*xyz^29.0-x0^3.0*0.0+303696.0*xyz^35.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0/260.6666666666667*xyz^69.0-0.09999999999999999*xyz^6.0-x02*x0*1.262484569633038E-4*xyz^134.0-4.0*xyz^134.0+x0^2.0*0.002564102564102564*xyz^40.0-x0^2.0*8.9126559714795E-4*xyz^34.0-4.0*xyz^34.0-x0^3.0/2.0*xyz^2.0+1.0/260.0*xyz^40.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0/260.6666666666667/70.0*xyz^70.0-0.09999999999999999/7.0*xyz^7.0-x02*x0*1.262484569633038E-4/135.0*xyz^135.0-4.0/135.0*xyz^135.0+x0^2.0*0.002564102564102564/41.0*xyz^41.0-x0^2.0*8.9126559714795E-4/35.0*xyz^35.0-4.0/35.0*xyz^35.0-x0^3.0/2.0/3.0*xyz^3.0+1.0/260.0/41.0*xyz^41.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0/18246.666666666668*xyz^70.0-0.014285714285714285*xyz^7.0-x02*x0/1069320.0*xyz^135.0-1.0/33.75*xyz^135.0-0.02962962962962963*xyz^135.0+x0^2.0*6.253908692933083E-5*xyz^41.0-x0^2.0/39270.0*xyz^35.0-1.0/8.75*xyz^35.0-0.11428571428571428*xyz^35.0-x0^3.0/6.0*xyz^3.0+1.0/10660.0*xyz^41.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0*5173740.0*xyz^64.0-72.0*xyz-x02*x0*5057910.0*xyz^129.0+x0^2.0*202464.0*xyz^35.0-x0^2.0*29760.0*xyz^29.0-x0^3.0*0.0+303696.0*xyz^35.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0*5173740.0*64.0*xyz^63.0-72.0-x02*x0*5057910.0*129.0*xyz^128.0+x0^2.0*202464.0*35.0*xyz^34.0-x0^2.0*29760.0*29.0*xyz^28.0-x0^3.0*0.0*0.0+303696.0*35.0*xyz^34.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0*3.3111936E8*xyz^63.0-72.0-x02*x0*6.5247039E8*xyz^128.0+x0^2.0*7086240.0*xyz^34.0-x0^2.0*863040.0*xyz^28.0-x0^3.0*0.0+1.062936E7*xyz^34.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0/18246.666666666668*xyz^70.0-0.014285714285714285*xyz^7.0-x02*x0/1069320.0*xyz^135.0-1.0/33.75*xyz^135.0-0.02962962962962963*xyz^135.0+x0^2.0*6.253908692933083E-5*xyz^41.0-5.0*xyz^41.0-x0^2.0/39270.0*xyz^35.0-1.0/8.75*xyz^35.0-0.11428571428571428*xyz^35.0-x0^3.0/6.0*xyz^3.0+1.0/10660.0*xyz^41.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0/18246.666666666668/71.0*xyz^71.0-0.014285714285714285/8.0*xyz^8.0-x02*x0/1069320.0/136.0*xyz^136.0-1.0/33.75/136.0*xyz^136.0-0.02962962962962963/136.0*xyz^136.0+x0^2.0*6.253908692933083E-5/42.0*xyz^42.0-5.0/42.0*xyz^42.0-x0^2.0/39270.0/36.0*xyz^36.0-1.0/8.75/36.0*xyz^36.0-0.11428571428571428/36.0*xyz^36.0-x0^3.0/6.0/4.0*xyz^4.0+1.0/10660.0/42.0*xyz^42.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0/1295513.3333333335*xyz^71.0-0.0017857142857142857*xyz^8.0-x02*x0/1.4542752E8*xyz^136.0-1.0/4590.0*xyz^136.0-2.178649237472767E-4*xyz^136.0+x0^2.0/671580.0*xyz^42.0-1.0/8.4*xyz^42.0-0.11904761904761904*xyz^42.0-x0^2.0/1413720.0*xyz^36.0-1.0/315.0*xyz^36.0-0.0031746031746031746*xyz^36.0-x0^3.0/24.0*xyz^4.0+1.0/447720.0*xyz^42.0";
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

public static void TestCaseDiff121204() {
 UsageCalculus.TestCase = 121204;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xyza^33*x0/1*x0^21*xyza^2*--3*xyza^3*1*xyza-3*xyza^3*1*xyza/2*xyza^2*-3*xyza^31*x02*xyza^2*-3*xyza^33*xyza^3*-1*xyza/2*xyza^22*x0^2*-3*x0^3*1*x0/-3*x0^23*xyza^31*xyza/-3*xyza^2-3*x0^2*-1*x0^3*2*x01*xyza^3*2*xyza/3*xyza^2*--1*xyza^32*xyza3*x0^2*--1*x0^3-1*xyza^3*2*xyza/3*xyza^22*xyza/3*xyza^2*-1*xyza^3*-3*xyza2*xyza^3*3*xyza3*x0/1*x0^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=203 EqnNumber=6 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[27, 6, 16, 17, 4, 2, 3, 4, 2, 4, 1, 2, 3, 1, 4, 2, 3, 2, 4, 2, 3, 1, 3, 1, 2, 3, 1, 3, 4, 15, 4, 17, 2, 19, 28]"+
"// DOEMatrixRow=[59, 7, 18, 1, 3, 2, 3, 7, 2, 3, 4, 2, 3, 1, 1, 3, 1, 8, 7, 3, 1, 3, 2, 1, 2, 1, 3, 1, 1, 9, 1, 8, 6]"+
//Tail EqnIndex=203 EqnNumber=6 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[27, 6, 16, 17, 4, 2, 3, 4, 2, 4, 1, 2, 3, 1, 4, 2, 3, 2, 4, 2, 3, 1, 3, 1, 2, 3, 1, 3, 4, 15, 4, 17, 2, 19, 28]"+
"// DOEMatrixRow=[59, 7, 18, 1, 3, 2, 3, 7, 2, 3, 4, 2, 3, 1, 1, 3, 1, 8, 7, 3, 1, 3, 2, 1, 2, 1, 3, 1, 1, 9, 1, 8, 6]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0*6.0*xyza^39.0-3.0*xyza^4.0-x02*x0*2.25*xyza^132.0+x0^2.0*4.0*xyza^38.0-x0^2.0*xyza^32.0-x0^3.0-x0*2.0*xyza^35.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0*6.0*39.0*xyza^38.0-3.0*4.0*xyza^3.0-x02*x0*2.25*132.0*xyza^131.0+x0^2.0*4.0*38.0*xyza^37.0-x0^2.0*32.0*xyza^31.0-x0^3.0*0.0-x0*2.0*35.0*xyza^34.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0*234.0*xyza^38.0-12.0*xyza^3.0-x02*x0*297.0*xyza^131.0+x0^2.0*152.0*xyza^37.0-x0^2.0*32.0*xyza^31.0-x0^3.0*0.0-x0*70.0*xyza^34.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0*6.0*xyza^39.0-3.0*xyza^4.0-x02*x0*2.25*xyza^132.0+x0^2.0*4.0*xyza^38.0-x0^2.0*xyza^32.0-x0^3.0-x0*2.0*xyza^35.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0*6.0/40.0*xyza^40.0-3.0/5.0*xyza^5.0-x02*x0*2.25/133.0*xyza^133.0+x0^2.0*4.0/39.0*xyza^39.0-x0^2.0/33.0*xyza^33.0-x0^3.0*xyza-x0*2.0/36.0*xyza^36.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0/6.666666666666667*xyza^40.0-0.6*xyza^5.0-x02*x0*0.016917293233082706*xyza^133.0+x0^2.0*0.10256410256410256*xyza^39.0-x0^2.0/33.0*xyza^33.0-x0^3.0*xyza-x0/18.0*xyza^36.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0*234.0*xyza^38.0-12.0*xyza^3.0-x02*x0*297.0*xyza^131.0+x0^2.0*152.0*xyza^37.0-x0^2.0*32.0*xyza^31.0-x0^3.0*0.0-x0*70.0*xyza^34.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0*234.0*38.0*xyza^37.0-12.0*3.0*xyza^2.0-x02*x0*297.0*131.0*xyza^130.0+x0^2.0*152.0*37.0*xyza^36.0-x0^2.0*32.0*31.0*xyza^30.0-x0^3.0*0.0*0.0-x0*70.0*34.0*xyza^33.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0*8892.0*xyza^37.0-36.0*xyza^2.0-x02*x0*38907.0*xyza^130.0+x0^2.0*5624.0*xyza^36.0-x0^2.0*992.0*xyza^30.0-x0^3.0*0.0-x0*2380.0*xyza^33.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0/6.666666666666667*xyza^40.0-0.6*xyza^5.0-x02*x0*0.016917293233082706*xyza^133.0+x0^2.0*0.10256410256410256*xyza^39.0-x0^2.0/33.0*xyza^33.0-x0^3.0*xyza-x0/18.0*xyza^36.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0/6.666666666666667/41.0*xyza^41.0-0.6/6.0*xyza^6.0-x02*x0*0.016917293233082706/134.0*xyza^134.0+x0^2.0*0.10256410256410256/40.0*xyza^40.0-x0^2.0/33.0/34.0*xyza^34.0-x0^3.0/2.0*xyza^2.0-x0*18.0/37.0*xyza^37.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0/273.33333333333337*xyza^41.0-0.09999999999999999*xyza^6.0-x02*x0*1.262484569633038E-4*xyza^134.0+x0^2.0*0.002564102564102564*xyza^40.0-x0^2.0*8.9126559714795E-4*xyza^34.0-x0^3.0/2.0*xyza^2.0-x0/2.0555555555555554*xyza^37.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0*8892.0*xyza^37.0-36.0*xyza^2.0-x02*x0*38907.0*xyza^130.0+x0^2.0*5624.0*xyza^36.0-x0^2.0*992.0*xyza^30.0-x0^3.0*0.0-x0*2380.0*xyza^33.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0*8892.0*37.0*xyza^36.0-36.0*2.0*xyza^1.0-x02*x0*38907.0*130.0*xyza^129.0+x0^2.0*5624.0*36.0*xyza^35.0-x0^2.0*992.0*30.0*xyza^29.0-x0^3.0*0.0*0.0-x0*2380.0*33.0*xyza^32.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0*329004.0*xyza^36.0-72.0*xyza-x02*x0*5057910.0*xyza^129.0+x0^2.0*202464.0*xyza^35.0-x0^2.0*29760.0*xyza^29.0-x0^3.0*0.0-x0*78540.0*xyza^32.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0/273.33333333333337*xyza^41.0-0.09999999999999999*xyza^6.0-x02*x0*1.262484569633038E-4*xyza^134.0-4.0*xyza^134.0+x0^2.0*0.002564102564102564*xyza^40.0-x0^2.0*8.9126559714795E-4*xyza^34.0-4.0*xyza^34.0-x0^3.0/2.0*xyza^2.0-x0/2.0555555555555554*xyza^37.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0/273.33333333333337/42.0*xyza^42.0-0.09999999999999999/7.0*xyza^7.0-x02*x0*1.262484569633038E-4/135.0*xyza^135.0-4.0/135.0*xyza^135.0+x0^2.0*0.002564102564102564/41.0*xyza^41.0-x0^2.0*8.9126559714795E-4/35.0*xyza^35.0-4.0/35.0*xyza^35.0-x0^3.0/2.0/3.0*xyza^3.0-x0*2.0555555555555554/38.0*xyza^38.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0/11480.000000000002*xyza^42.0-0.014285714285714285*xyza^7.0-x02*x0/1069320.0*xyza^135.0-1.0/33.75*xyza^135.0-0.02962962962962963*xyza^135.0+x0^2.0*6.253908692933083E-5*xyza^41.0-x0^2.0/39270.0*xyza^35.0-1.0/8.75*xyza^35.0-0.11428571428571428*xyza^35.0-x0^3.0*0.16666666666666666*xyza^3.0-x0/18.486486486486488*xyza^38.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0*329004.0*xyza^36.0-72.0*xyza-x02*x0*5057910.0*xyza^129.0+x0^2.0*202464.0*xyza^35.0-x0^2.0*29760.0*xyza^29.0-x0^3.0*0.0-x0*78540.0*xyza^32.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0*329004.0*36.0*xyza^35.0-72.0-x02*x0*5057910.0*129.0*xyza^128.0+x0^2.0*202464.0*35.0*xyza^34.0-x0^2.0*29760.0*29.0*xyza^28.0-x0^3.0*0.0*0.0-x0*78540.0*32.0*xyza^31.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0*1.1844144E7*xyza^35.0-72.0-x02*x0*6.5247039E8*xyza^128.0+x0^2.0*7086240.0*xyza^34.0-x0^2.0*863040.0*xyza^28.0-x0^3.0*0.0-x0*2513280.0*xyza^31.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0/11480.000000000002*xyza^42.0-0.014285714285714285*xyza^7.0-x02*x0/1069320.0*xyza^135.0-1.0/33.75*xyza^135.0-0.02962962962962963*xyza^135.0+x0^2.0*6.253908692933083E-5*xyza^41.0-5.0*xyza^41.0-x0^2.0/39270.0*xyza^35.0-1.0/8.75*xyza^35.0-0.11428571428571428*xyza^35.0-x0^3.0*0.16666666666666666*xyza^3.0-x0/18.486486486486488*xyza^38.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0/11480.000000000002/43.0*xyza^43.0-0.014285714285714285/8.0*xyza^8.0-x02*x0/1069320.0/136.0*xyza^136.0-1.0/33.75/136.0*xyza^136.0-0.02962962962962963/136.0*xyza^136.0+x0^2.0*6.253908692933083E-5/42.0*xyza^42.0-5.0/42.0*xyza^42.0-x0^2.0/39270.0/36.0*xyza^36.0-1.0/8.75/36.0*xyza^36.0-0.11428571428571428/36.0*xyza^36.0-x0^3.0*0.16666666666666666/4.0*xyza^4.0-x0*18.486486486486488/39.0*xyza^39.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0/493640.00000000006*xyza^43.0-0.0017857142857142857*xyza^8.0-x02*x0/1.4542752E8*xyza^136.0-1.0/4590.0*xyza^136.0-2.178649237472767E-4*xyza^136.0+x0^2.0/671580.0*xyza^42.0-1.0/8.4*xyza^42.0-0.11904761904761904*xyza^42.0-x0^2.0/1413720.0*xyza^36.0-1.0/315.0*xyza^36.0-0.0031746031746031746*xyza^36.0-x0^3.0*0.041666666666666664*xyza^4.0-x0/2.1096491228070176*xyza^39.0";
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

public static void TestCaseDiff121205() {
 UsageCalculus.TestCase = 121205;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*x0/1*x0^21*x^2*--3*x^3*1*x-3*x^3*1*x/2*x^2*-3*x^31*x02*x^2*-3*x^33*x^3*-1*x/2*x^22*x0^2*-3*x0^3*1*x0/-3*x0^23*x^31*x/-3*x^2-3*x0^2*-1*x0^3*2*x01*x^3*2*x/3*x^2*--1*x^32*x3*x0^2*--1*x0^3-1*x^3*2*x/3*x^22*x/3*x^2*-1*x^3*-3*x3*x0^21*x^3*-3*x3*x0/1*x0^21*x^2*--3*x^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=204 EqnNumber=7 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[92, 7, 17, 18, 1, 3, 1, 5, 3, 1, 2, 1, 1, 2, 1, 3, 1, 1, 5, 3, 4, 2, 1, 2, 3, 4, 2, 1, 1, 16, 1, 18, 3, 20, 29]"+
"// DOEMatrixRow=[24, 8, 19, 2, 1, 3, 1, 8, 3, 4, 1, 1, 1, 2, 3, 1, 2, 9, 8, 1, 2, 4, 3, 2, 3, 2, 1, 2, 3, 10, 2, 9, 7]"+
//Tail EqnIndex=204 EqnNumber=7 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[92, 7, 17, 18, 1, 3, 1, 5, 3, 1, 2, 1, 1, 2, 1, 3, 1, 1, 5, 3, 4, 2, 1, 2, 3, 4, 2, 1, 1, 16, 1, 18, 3, 20, 29]"+
"// DOEMatrixRow=[24, 8, 19, 2, 1, 3, 1, 8, 3, 4, 1, 1, 1, 2, 3, 1, 2, 9, 8, 1, 2, 4, 3, 2, 3, 2, 1, 2, 3, 10, 2, 9, 7]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "9.0*x^6.0-3.0*x^4.0-2.25*x^132.0+4.0*x^38.0-x^32.0-1.0+6.0*x^40.0-3.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "9.0*6.0*x^5.0-3.0*4.0*x^3.0-2.25*132.0*x^131.0+4.0*38.0*x^37.0-32.0*x^31.0-1.0*0.0+6.0*40.0*x^39.0-3.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[1] = "54.0*x^5.0-12.0*x^3.0-297.0*x^131.0+152.0*x^37.0-32.0*x^31.0+240.0*x^39.0-9.0*x^2.0";
 UsageCalculus.EqnSolArrayMap3[1] = "9.0*x^6.0-3.0*x^4.0-2.25*x^132.0+4.0*x^38.0-x^32.0-1.0+6.0*x^40.0-3.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "9.0/7.0*x^7.0-3.0/5.0*x^5.0-2.25/133.0*x^133.0+4.0/39.0*x^39.0-1.0/33.0*x^33.0-1.0*x+6.0/41.0*x^41.0-3.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.2857142857142858*x^7.0-1.0/1.6666666666666667*x^5.0-1.0/59.111111111111114*x^133.0+1.0/9.75*x^39.0-1.0/33.0*x^33.0-x+1.0/6.833333333333333*x^41.0-1.0/1.3333333333333333*x^4.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "54.0*x^5.0-12.0*x^3.0-297.0*x^131.0+152.0*x^37.0-32.0*x^31.0+240.0*x^39.0-9.0*x^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "54.0*5.0*x^4.0-12.0*3.0*x^2.0-297.0*131.0*x^130.0+152.0*37.0*x^36.0-32.0*31.0*x^30.0+240.0*39.0*x^38.0-9.0*2.0*x^1.0";
 UsageCalculus.EqnSolArrayMap2[2] = "270.0*x^4.0-36.0*x^2.0-38907.0*x^130.0+5624.0*x^36.0-992.0*x^30.0+9360.0*x^38.0-18.0*x";
 UsageCalculus.EqnSolArrayMap3[2] = "1.2857142857142858*x^7.0-1.0/1.6666666666666667*x^5.0-1.0/59.111111111111114*x^133.0+1.0/9.75*x^39.0-0.030303030303030304*x^33.0-x+1.0/6.833333333333333*x^41.0-1.0/1.3333333333333333*x^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.2857142857142858/8.0*x^8.0-1.0/1.6666666666666667/6.0*x^6.0-1.0/59.111111111111114/134.0*x^134.0+1.0/9.75/40.0*x^40.0-0.030303030303030304/34.0*x^34.0-1.0/2.0*x^2.0+1.0/6.833333333333333/42.0*x^42.0-1.0/1.3333333333333333/5.0*x^5.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/6.222222222222221*x^8.0-1.0/10.0*x^6.0-1.0/7920.88888888889*x^134.0+1.0/390.0*x^40.0-1.0/1122.0*x^34.0-1.0/2.0*x^2.0+1.0/287.0*x^42.0-1.0/6.666666666666666*x^5.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "270.0*x^4.0-36.0*x^2.0-38907.0*x^130.0+5624.0*x^36.0-992.0*x^30.0+9360.0*x^38.0-18.0*x";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "270.0*4.0*x^3.0-36.0*2.0*x^1.0-38907.0*130.0*x^129.0+5624.0*36.0*x^35.0-992.0*30.0*x^29.0+9360.0*38.0*x^37.0-18.0";
 UsageCalculus.EqnSolArrayMap2[3] = "1080.0*x^3.0-72.0*x-5057910.0*x^129.0+202464.0*x^35.0-29760.0*x^29.0+355680.0*x^37.0-18.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/6.222222222222221*x^8.0-1.0/10.0*x^6.0-1.0/7920.88888888889*x^134.0+1.0/390.0*x^40.0-1.0/1122.0*x^34.0-1.0/2.0*x^2.0+1.0/287.0*x^42.0-1.0/6.666666666666666*x^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/6.222222222222221/9.0*x^9.0-1.0/10.0/7.0*x^7.0-1.0/7920.88888888889/135.0*x^135.0+1.0/390.0/41.0*x^41.0-1.0/1122.0/35.0*x^35.0-1.0/2.0/3.0*x^3.0+1.0/287.0/43.0*x^43.0-1.0/6.666666666666666/6.0*x^6.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/55.99999999999999*x^9.0-1.0/70.0*x^7.0-1.0/1069320.0*x^135.0+1.0/15990.0*x^41.0-1.0/39270.0*x^35.0-1.0/6.0*x^3.0+1.0/12341.0*x^43.0-1.0/40.0*x^6.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "1080.0*x^3.0-72.0*x-5057910.0*x^129.0+202464.0*x^35.0-29760.0*x^29.0+355680.0*x^37.0-18.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "1080.0*3.0*x^2.0-72.0-5057910.0*129.0*x^128.0+202464.0*35.0*x^34.0-29760.0*29.0*x^28.0+355680.0*37.0*x^36.0-18.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "3240.0*x^2.0-72.0-6.5247039E8*x^128.0+7086240.0*x^34.0-863040.0*x^28.0+1.316016E7*x^36.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/55.99999999999999*x^9.0-1.0/70.0*x^7.0-1.0/1069320.0*x^135.0+1.0/15990.0*x^41.0-1.0/39270.0*x^35.0-1.0/6.0*x^3.0+1.0/12341.0*x^43.0-1.0/40.0*x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/55.99999999999999/10.0*x^10.0-1.0/70.0/8.0*x^8.0-1.0/1069320.0/136.0*x^136.0+1.0/15990.0/42.0*x^42.0-1.0/39270.0/36.0*x^36.0-1.0/6.0/4.0*x^4.0+1.0/12341.0/44.0*x^44.0-1.0/40.0/7.0*x^7.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/559.9999999999999*x^10.0-1.0/560.0*x^8.0-1.0/1.4542752E8*x^136.0+1.0/671580.0*x^42.0-1.0/1413720.0*x^36.0-1.0/24.0*x^4.0+1.0/543004.0*x^44.0-1.0/280.0*x^7.0";
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

public static void TestCaseDiff121206() {
 UsageCalculus.TestCase = 121206;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xy^2*--3*xy^3*1*xy-3*xy^3*1*xy/2*xy^2*-3*xy^31*x02*xy^2*-3*xy^33*xy^3*-1*xy/2*xy^22*x0^2*-3*x0^3*1*x0/-3*x0^23*xy^31*xy/-3*xy^2-3*x0^2*-1*x0^3*2*x01*xy^3*2*xy/3*xy^2*--1*xy^32*xy3*x0^2*--1*x0^3-1*xy^3*2*xy/3*xy^22*xy/3*xy^2*-1*xy^3*-3*xy3*x0^21*xy^3*-3*xy-3*xy/1*xy^2*-2*xy^31*x0^2*-2*x0^3*3*x0/-1*x0^21*xy^2*--3*xy^3-3*xy^3*1*xy";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=205 EqnNumber=8 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[54, 8, 18, 19, 2, 1, 2, 6, 1, 2, 3, 2, 3, 1, 2, 1, 2, 1, 1, 1, 1, 3, 2, 3, 1, 1, 3, 2, 3, 1, 2, 19, 4, 21, 30]"+
"// DOEMatrixRow=[89, 9, 20, 3, 2, 1, 2, 9, 1, 1, 2, 1, 2, 3, 4, 2, 3, 10, 9, 2, 3, 5, 1, 3, 4, 3, 2, 3, 4, 11, 1, 10, 8]"+
//Tail EqnIndex=205 EqnNumber=8 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[54, 8, 18, 19, 2, 1, 2, 6, 1, 2, 3, 2, 3, 1, 2, 1, 2, 1, 1, 1, 1, 3, 2, 3, 1, 1, 3, 2, 3, 1, 2, 19, 4, 21, 30]"+
"// DOEMatrixRow=[89, 9, 20, 3, 2, 1, 2, 9, 1, 1, 2, 1, 2, 3, 4, 2, 3, 10, 9, 2, 3, 5, 1, 3, 4, 3, 2, 3, 4, 11, 1, 10, 8]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "3.0*xy^6.0-3.0*xy^4.0-x02*x0*2.25*xy^132.0+x0^2.0*4.0*xy^38.0-x0^2.0*xy^32.0-x0^3.0+x0^21.0*2.0*xy^36.0+x0^2.0*x0*108.0*xy^39.0-3.0*xy^3.0-3.0*xy^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "3.0*6.0*xy^5.0-3.0*4.0*xy^3.0-x02*x0*2.25*132.0*xy^131.0+x0^2.0*4.0*38.0*xy^37.0-x0^2.0*32.0*xy^31.0-x0^3.0*0.0+x0^21.0*2.0*36.0*xy^35.0+x0^2.0*x0*108.0*39.0*xy^38.0-3.0*3.0*xy^2.0-3.0*4.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap2[1] = "18.0*xy^5.0-12.0*xy^3.0-x02*x0*297.0*xy^131.0+x0^2.0*152.0*xy^37.0-x0^2.0*32.0*xy^31.0-x0^3.0*0.0+x0^21.0*72.0*xy^35.0+x0^2.0*x0*4212.0*xy^38.0-9.0*xy^2.0-12.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap3[1] = "3.0*xy^6.0-3.0*xy^4.0-x02*x0*2.25*xy^132.0+x0^2.0*4.0*xy^38.0-x0^2.0*xy^32.0-x0^3.0+x0^21.0*2.0*xy^36.0+x0^2.0*x0*108.0*xy^39.0-3.0*xy^3.0-3.0*xy^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "3.0/7.0*xy^7.0-3.0/5.0*xy^5.0-x02*x0*2.25/133.0*xy^133.0+x0^2.0*4.0/39.0*xy^39.0-x0^2.0/33.0*xy^33.0-x0^3.0*xy+x0^21.0*2.0/37.0*xy^37.0+x0^2.0*x0*108.0/40.0*xy^40.0-3.0/4.0*xy^4.0-3.0/5.0*xy^5.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/2.3333333333333335*xy^7.0-0.6*xy^5.0-x02*x0*0.016917293233082706*xy^133.0+x0^2.0*0.10256410256410256*xy^39.0-x0^2.0/33.0*xy^33.0-x0^3.0*xy+x0^21.0*0.05405405405405406*xy^37.0+x0^2.0*x0*2.7*xy^40.0-1.0/1.3333333333333333*xy^4.0-1.0/1.6666666666666667*xy^5.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "18.0*xy^5.0-12.0*xy^3.0-x02*x0*297.0*xy^131.0+x0^2.0*152.0*xy^37.0-x0^2.0*32.0*xy^31.0-x0^3.0*0.0+x0^21.0*72.0*xy^35.0+x0^2.0*x0*4212.0*xy^38.0-9.0*xy^2.0-12.0*xy^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "18.0*5.0*xy^4.0-12.0*3.0*xy^2.0-x02*x0*297.0*131.0*xy^130.0+x0^2.0*152.0*37.0*xy^36.0-x0^2.0*32.0*31.0*xy^30.0-x0^3.0*0.0*0.0+x0^21.0*72.0*35.0*xy^34.0+x0^2.0*x0*4212.0*38.0*xy^37.0-9.0*2.0*xy^1.0-12.0*3.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap2[2] = "90.0*xy^4.0-36.0*xy^2.0-x02*x0*38907.0*xy^130.0+x0^2.0*5624.0*xy^36.0-x0^2.0*992.0*xy^30.0-x0^3.0*0.0+x0^21.0*2520.0*xy^34.0+x0^2.0*x0*160056.0*xy^37.0-18.0*xy-36.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/2.3333333333333335*xy^7.0-0.6*xy^5.0-x02*x0*0.016917293233082706*xy^133.0+x0^2.0*0.10256410256410256*xy^39.0-x0^2.0/33.0*xy^33.0-x0^3.0*xy+x0^21.0*0.05405405405405406*xy^37.0+x0^2.0*x0*2.7*xy^40.0-1.0/1.3333333333333333*xy^4.0-1.0/1.6666666666666667*xy^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/2.3333333333333335/8.0*xy^8.0-0.6/6.0*xy^6.0-x02*x0*0.016917293233082706/134.0*xy^134.0+x0^2.0*0.10256410256410256/40.0*xy^40.0-x0^2.0/33.0/34.0*xy^34.0-x0^3.0/2.0*xy^2.0+x0^21.0*0.05405405405405406/38.0*xy^38.0+x0^2.0*x0*2.7/41.0*xy^41.0-1.0/1.3333333333333333/5.0*xy^5.0-1.0/1.6666666666666667/6.0*xy^6.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/18.666666666666668*xy^8.0-0.09999999999999999*xy^6.0-x02*x0*1.262484569633038E-4*xy^134.0+x0^2.0*0.002564102564102564*xy^40.0-x0^2.0*8.9126559714795E-4*xy^34.0-x0^3.0/2.0*xy^2.0+x0^21.0*0.001422475106685633*xy^38.0+x0^2.0*x0/15.185185185185183*xy^41.0-1.0/6.666666666666666*xy^5.0-1.0/10.0*xy^6.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "90.0*xy^4.0-36.0*xy^2.0-x02*x0*38907.0*xy^130.0+x0^2.0*5624.0*xy^36.0-x0^2.0*992.0*xy^30.0-x0^3.0*0.0+x0^21.0*2520.0*xy^34.0+x0^2.0*x0*160056.0*xy^37.0-18.0*xy-36.0*xy^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "90.0*4.0*xy^3.0-36.0*2.0*xy^1.0-x02*x0*38907.0*130.0*xy^129.0+x0^2.0*5624.0*36.0*xy^35.0-x0^2.0*992.0*30.0*xy^29.0-x0^3.0*0.0*0.0+x0^21.0*2520.0*34.0*xy^33.0+x0^2.0*x0*160056.0*37.0*xy^36.0-18.0-36.0*2.0*xy^1.0";
 UsageCalculus.EqnSolArrayMap2[3] = "360.0*xy^3.0-72.0*xy-x02*x0*5057910.0*xy^129.0+x0^2.0*202464.0*xy^35.0-x0^2.0*29760.0*xy^29.0-x0^3.0*0.0+x0^21.0*85680.0*xy^33.0+x0^2.0*x0*5922072.0*xy^36.0-18.0-72.0*xy";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/18.666666666666668*xy^8.0-0.09999999999999999*xy^6.0-x02*x0*1.262484569633038E-4*xy^134.0-4.0*xy^134.0+x0^2.0*0.002564102564102564*xy^40.0-x0^2.0*8.9126559714795E-4*xy^34.0-4.0*xy^34.0-x0^3.0/2.0*xy^2.0+x0^21.0*0.001422475106685633*xy^38.0+x0^2.0*x0/15.185185185185183*xy^41.0-1.0/6.666666666666666*xy^5.0-1.0/10.0*xy^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/18.666666666666668/9.0*xy^9.0-0.09999999999999999/7.0*xy^7.0-x02*x0*1.262484569633038E-4/135.0*xy^135.0-4.0/135.0*xy^135.0+x0^2.0*0.002564102564102564/41.0*xy^41.0-x0^2.0*8.9126559714795E-4/35.0*xy^35.0-4.0/35.0*xy^35.0-x0^3.0/2.0/3.0*xy^3.0+x0^21.0*0.001422475106685633/39.0*xy^39.0+x0^2.0*x0/15.185185185185183/42.0*xy^42.0-1.0/6.666666666666666/6.0*xy^6.0-1.0/10.0/7.0*xy^7.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/168.0*xy^9.0-0.014285714285714285*xy^7.0-x02*x0/1069320.0*xy^135.0-1.0/33.75*xy^135.0-0.02962962962962963*xy^135.0+x0^2.0*6.253908692933083E-5*xy^41.0-x0^2.0/39270.0*xy^35.0-1.0/8.75*xy^35.0-0.11428571428571428*xy^35.0-x0^3.0*0.16666666666666666*xy^3.0+x0^21.0*3.6473720684247E-5*xy^39.0+x0^2.0*x0/637.7777777777777*xy^42.0-1.0/40.0*xy^6.0-1.0/70.0*xy^7.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "360.0*xy^3.0-72.0*xy-x02*x0*5057910.0*xy^129.0+x0^2.0*202464.0*xy^35.0-x0^2.0*29760.0*xy^29.0-x0^3.0*0.0+x0^21.0*85680.0*xy^33.0+x0^2.0*x0*5922072.0*xy^36.0-18.0-72.0*xy";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "360.0*3.0*xy^2.0-72.0-x02*x0*5057910.0*129.0*xy^128.0+x0^2.0*202464.0*35.0*xy^34.0-x0^2.0*29760.0*29.0*xy^28.0-x0^3.0*0.0*0.0+x0^21.0*85680.0*33.0*xy^32.0+x0^2.0*x0*5922072.0*36.0*xy^35.0-18.0*0.0-72.0";
 UsageCalculus.EqnSolArrayMap2[4] = "1080.0*xy^2.0-72.0-x02*x0*6.5247039E8*xy^128.0+x0^2.0*7086240.0*xy^34.0-x0^2.0*863040.0*xy^28.0-x0^3.0*0.0+x0^21.0*2827440.0*xy^32.0+x0^2.0*x0*2.13194592E8*xy^35.0-72.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/168.0*xy^9.0-0.014285714285714285*xy^7.0-x02*x0/1069320.0*xy^135.0-1.0/33.75*xy^135.0-0.02962962962962963*xy^135.0+x0^2.0*6.253908692933083E-5*xy^41.0-5.0*xy^41.0-x0^2.0/39270.0*xy^35.0-1.0/8.75*xy^35.0-0.11428571428571428*xy^35.0-x0^3.0*0.16666666666666666*xy^3.0+x0^21.0*3.6473720684247E-5*xy^39.0-5.0*xy^39.0+x0^2.0*x0/637.7777777777777*xy^42.0-1.0/40.0*xy^6.0-1.0/70.0*xy^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/168.0/10.0*xy^10.0-0.014285714285714285/8.0*xy^8.0-x02*x0/1069320.0/136.0*xy^136.0-1.0/33.75/136.0*xy^136.0-0.02962962962962963/136.0*xy^136.0+x0^2.0*6.253908692933083E-5/42.0*xy^42.0-5.0/42.0*xy^42.0-x0^2.0/39270.0/36.0*xy^36.0-1.0/8.75/36.0*xy^36.0-0.11428571428571428/36.0*xy^36.0-x0^3.0*0.16666666666666666/4.0*xy^4.0+x0^21.0*3.6473720684247E-5/40.0*xy^40.0-5.0/40.0*xy^40.0+x0^2.0*x0/637.7777777777777/43.0*xy^43.0-1.0/40.0/7.0*xy^7.0-1.0/70.0/8.0*xy^8.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/1680.0*xy^10.0-0.0017857142857142857*xy^8.0-x02*x0/1.4542752E8*xy^136.0-1.0/4590.0*xy^136.0-2.178649237472767E-4*xy^136.0+x0^2.0/671580.0*xy^42.0-1.0/8.4*xy^42.0-0.11904761904761904*xy^42.0-x0^2.0/1413720.0*xy^36.0-1.0/315.0*xy^36.0-0.0031746031746031746*xy^36.0-x0^3.0*0.041666666666666664*xy^4.0+x0^21.0/1096680.0*xy^40.0-1.0/8.0*xy^40.0-0.125*xy^40.0+x0^2.0*x0/27424.44444444444*xy^43.0-1.0/280.0*xy^7.0-1.0/560.0*xy^8.0";
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

public static void TestCaseDiff121207() {
 UsageCalculus.TestCase = 121207;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xyz^3*1*xyz/2*xyz^2*-3*xyz^31*x02*xyz^2*-3*xyz^33*xyz^3*-1*xyz/2*xyz^22*x0^2*-3*x0^3*1*x0/-3*x0^23*xyz^31*xyz/-3*xyz^2-3*x0^2*-1*x0^3*2*x01*xyz^3*2*xyz/3*xyz^2*--1*xyz^32*xyz3*x0^2*--1*x0^3-1*xyz^3*2*xyz/3*xyz^22*xyz/3*xyz^2*-1*xyz^3*-3*xyz3*x0^21*xyz^3*-3*xyz-3*xyz/1*xyz^2*-2*xyz^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyz^33*xyz/-1*xyz^2-3*xyz^3*1*xyz1*x0/2*x0^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=206 EqnNumber=9 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[22, 9, 19, 20, 3, 2, 3, 7, 2, 3, 4, 1, 1, 2, 3, 2, 3, 2, 3, 2, 3, 4, 3, 1, 2, 3, 4, 3, 4, 2, 3, 20, 5, 22, 31]"+
"// DOEMatrixRow=[54, 10, 1, 4, 3, 2, 3, 10, 2, 3, 4, 2, 3, 1, 1, 3, 1, 11, 10, 3, 1, 1, 2, 1, 5, 4, 3, 1, 1, 12, 2, 11, 9]"+
//Tail EqnIndex=206 EqnNumber=9 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[22, 9, 19, 20, 3, 2, 3, 7, 2, 3, 4, 1, 1, 2, 3, 2, 3, 2, 3, 2, 3, 4, 3, 1, 2, 3, 4, 3, 4, 2, 3, 20, 5, 22, 31]"+
"// DOEMatrixRow=[54, 10, 1, 4, 3, 2, 3, 10, 2, 3, 4, 2, 3, 1, 1, 3, 1, 11, 10, 3, 1, 1, 2, 1, 5, 4, 3, 1, 1, 12, 2, 11, 9]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x02*x0*2.25*xyz^132.0+x0^2.0*4.0*xyz^38.0-x0^2.0*xyz^32.0-x0^3.0+x0^21.0*2.0*xyz^36.0-x0^2.0*x0*36.0*xyz^70.0-x0*1.5*xyz^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x02*x0*2.25*132.0*xyz^131.0+x0^2.0*4.0*38.0*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0+x0^21.0*2.0*36.0*xyz^35.0-x0^2.0*x0*36.0*70.0*xyz^69.0-x0*1.5*3.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x02*x0*297.0*xyz^131.0+x0^2.0*152.0*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0+x0^21.0*72.0*xyz^35.0-x0^2.0*x0*2520.0*xyz^69.0-x0*4.5*xyz^2.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x02*x0*2.25*xyz^132.0+x0^2.0*4.0*xyz^38.0-x0^2.0*xyz^32.0-x0^3.0+x0^21.0*2.0*xyz^36.0-x0^2.0*x0*36.0*xyz^70.0-x0*1.5*xyz^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x02*x0*2.25/133.0*xyz^133.0+x0^2.0*4.0/39.0*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz+x0^21.0*2.0/37.0*xyz^37.0-x0^2.0*x0*36.0/71.0*xyz^71.0-x0*1.5/4.0*xyz^4.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x02*x0*0.016917293233082706*xyz^133.0+x0^2.0*0.10256410256410256*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz+x0^21.0*0.05405405405405406*xyz^37.0-x0^2.0*x0*0.5070422535211268*xyz^71.0-x0/2.6666666666666665*xyz^4.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x02*x0*297.0*xyz^131.0+x0^2.0*152.0*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0+x0^21.0*72.0*xyz^35.0-x0^2.0*x0*2520.0*xyz^69.0-x0*4.5*xyz^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x02*x0*297.0*131.0*xyz^130.0+x0^2.0*152.0*37.0*xyz^36.0-x0^2.0*32.0*31.0*xyz^30.0-x0^3.0*0.0*0.0+x0^21.0*72.0*35.0*xyz^34.0-x0^2.0*x0*2520.0*69.0*xyz^68.0-x0*4.5*2.0*xyz^1.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x02*x0*38907.0*xyz^130.0+x0^2.0*5624.0*xyz^36.0-x0^2.0*992.0*xyz^30.0-x0^3.0*0.0+x0^21.0*2520.0*xyz^34.0-x0^2.0*x0*173880.0*xyz^68.0-x0*9.0*xyz";
 UsageCalculus.EqnSolArrayMap3[2] = "-x02*x0*0.016917293233082706*xyz^133.0+x0^2.0*0.10256410256410256*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz+x0^21.0*0.05405405405405406*xyz^37.0-x0^2.0*x0*0.5070422535211268*xyz^71.0-x0/2.6666666666666665*xyz^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x02*x0*0.016917293233082706/134.0*xyz^134.0+x0^2.0*0.10256410256410256/40.0*xyz^40.0-x0^2.0/33.0/34.0*xyz^34.0-x0^3.0/2.0*xyz^2.0+x0^21.0*0.05405405405405406/38.0*xyz^38.0-x0^2.0*x0*0.5070422535211268/72.0*xyz^72.0-x0*2.6666666666666665/5.0*xyz^5.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x02*x0*1.262484569633038E-4*xyz^134.0+x0^2.0*0.002564102564102564*xyz^40.0-x0^2.0*8.9126559714795E-4*xyz^34.0-x0^3.0/2.0*xyz^2.0+x0^21.0*0.001422475106685633*xyz^38.0-x0^2.0*x0*0.007042253521126761*xyz^72.0-x0/1.875*xyz^5.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x02*x0*38907.0*xyz^130.0+x0^2.0*5624.0*xyz^36.0-x0^2.0*992.0*xyz^30.0-x0^3.0*0.0+x0^21.0*2520.0*xyz^34.0-x0^2.0*x0*173880.0*xyz^68.0-x0*9.0*xyz";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x02*x0*38907.0*130.0*xyz^129.0+x0^2.0*5624.0*36.0*xyz^35.0-x0^2.0*992.0*30.0*xyz^29.0-x0^3.0*0.0*0.0+x0^21.0*2520.0*34.0*xyz^33.0-x0^2.0*x0*173880.0*68.0*xyz^67.0-x0*9.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x02*x0*5057910.0*xyz^129.0+x0^2.0*202464.0*xyz^35.0-x0^2.0*29760.0*xyz^29.0-x0^3.0*0.0+x0^21.0*85680.0*xyz^33.0-x0^2.0*x0*1.182384E7*xyz^67.0-x0*9.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x02*x0*1.262484569633038E-4*xyz^134.0-4.0*xyz^134.0+x0^2.0*0.002564102564102564*xyz^40.0-x0^2.0*8.9126559714795E-4*xyz^34.0-4.0*xyz^34.0-x0^3.0/2.0*xyz^2.0+x0^21.0*0.001422475106685633*xyz^38.0-x0^2.0*x0*0.007042253521126761*xyz^72.0-x0/1.875*xyz^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x02*x0*1.262484569633038E-4/135.0*xyz^135.0-4.0/135.0*xyz^135.0+x0^2.0*0.002564102564102564/41.0*xyz^41.0-x0^2.0*8.9126559714795E-4/35.0*xyz^35.0-4.0/35.0*xyz^35.0-x0^3.0/2.0/3.0*xyz^3.0+x0^21.0*0.001422475106685633/39.0*xyz^39.0-x0^2.0*x0*0.007042253521126761/73.0*xyz^73.0-x0*1.875/6.0*xyz^6.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x02*x0/1069320.0*xyz^135.0-1.0/33.75*xyz^135.0-0.02962962962962963*xyz^135.0+x0^2.0*6.253908692933083E-5*xyz^41.0-x0^2.0/39270.0*xyz^35.0-1.0/8.75*xyz^35.0-0.11428571428571428*xyz^35.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^21.0*3.6473720684247E-5*xyz^39.0-x0^2.0*x0*9.646922631680494E-5*xyz^73.0-x0/3.2*xyz^6.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x02*x0*5057910.0*xyz^129.0+x0^2.0*202464.0*xyz^35.0-x0^2.0*29760.0*xyz^29.0-x0^3.0*0.0+x0^21.0*85680.0*xyz^33.0-x0^2.0*x0*1.182384E7*xyz^67.0-x0*9.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x02*x0*5057910.0*129.0*xyz^128.0+x0^2.0*202464.0*35.0*xyz^34.0-x0^2.0*29760.0*29.0*xyz^28.0-x0^3.0*0.0*0.0+x0^21.0*85680.0*33.0*xyz^32.0-x0^2.0*x0*1.182384E7*67.0*xyz^66.0-x0*9.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x02*x0*6.5247039E8*xyz^128.0+x0^2.0*7086240.0*xyz^34.0-x0^2.0*863040.0*xyz^28.0-x0^3.0*0.0+x0^21.0*2827440.0*xyz^32.0-x0^2.0*x0*7.9219728E8*xyz^66.0-x0*0.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x02*x0/1069320.0*xyz^135.0-1.0/33.75*xyz^135.0-0.02962962962962963*xyz^135.0+x0^2.0*6.253908692933083E-5*xyz^41.0-5.0*xyz^41.0-x0^2.0/39270.0*xyz^35.0-1.0/8.75*xyz^35.0-0.11428571428571428*xyz^35.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^21.0*3.6473720684247E-5*xyz^39.0-5.0*xyz^39.0-x0^2.0*x0*9.646922631680494E-5*xyz^73.0-5.0*xyz^73.0-x0/3.2*xyz^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x02*x0/1069320.0/136.0*xyz^136.0-1.0/33.75/136.0*xyz^136.0-0.02962962962962963/136.0*xyz^136.0+x0^2.0*6.253908692933083E-5/42.0*xyz^42.0-5.0/42.0*xyz^42.0-x0^2.0/39270.0/36.0*xyz^36.0-1.0/8.75/36.0*xyz^36.0-0.11428571428571428/36.0*xyz^36.0-x0^3.0*0.16666666666666666/4.0*xyz^4.0+x0^21.0*3.6473720684247E-5/40.0*xyz^40.0-5.0/40.0*xyz^40.0-x0^2.0*x0*9.646922631680494E-5/74.0*xyz^74.0-5.0/74.0*xyz^74.0-x0*3.2/7.0*xyz^7.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x02*x0/1.4542752E8*xyz^136.0-1.0/4590.0*xyz^136.0-2.178649237472767E-4*xyz^136.0+x0^2.0/671580.0*xyz^42.0-1.0/8.4*xyz^42.0-0.11904761904761904*xyz^42.0-x0^2.0/1413720.0*xyz^36.0-1.0/315.0*xyz^36.0-0.0031746031746031746*xyz^36.0-x0^3.0*0.041666666666666664*xyz^4.0+x0^21.0/1096680.0*xyz^40.0-1.0/8.0*xyz^40.0-0.125*xyz^40.0-x0^2.0*x0/767084.0*xyz^74.0-1.0/14.8*xyz^74.0-0.06756756756756757*xyz^74.0-x0/2.1875*xyz^7.0";
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

public static void TestCaseDiff121208() {
 UsageCalculus.TestCase = 121208;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x02*xyza^2*-3*xyza^33*xyza^3*-1*xyza/2*xyza^22*x0^2*-3*x0^3*1*x0/-3*x0^23*xyza^31*xyza/-3*xyza^2-3*x0^2*-1*x0^3*2*x01*xyza^3*2*xyza/3*xyza^2*--1*xyza^32*xyza3*x0^2*--1*x0^3-1*xyza^3*2*xyza/3*xyza^22*xyza/3*xyza^2*-1*xyza^3*-3*xyza3*x0^21*xyza^3*-3*xyza-3*xyza/1*xyza^2*-2*xyza^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyza^33*xyza/-1*xyza^2-1*x0^2*-2*x0^3*3*x02*xyza^3*3*xyza/1*xyza^2*--3*xyza^31*x0/2*x0^22*xyza^2*-3*xyza^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=207 EqnNumber=10 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[87, 10, 20, 1, 4, 3, 1, 8, 3, 4, 1, 2, 3, 1, 4, 3, 1, 1, 4, 3, 4, 5, 1, 2, 3, 4, 5, 1, 1, 3, 4, 21, 6, 23, 32]"+
"// DOEMatrixRow=[19, 11, 2, 1, 1, 3, 1, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 12, 1, 1, 2, 3, 1, 2, 6, 1, 1, 2, 3, 13, 1, 12, 10]"+
//Tail EqnIndex=207 EqnNumber=10 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[87, 10, 20, 1, 4, 3, 1, 8, 3, 4, 1, 2, 3, 1, 4, 3, 1, 1, 4, 3, 4, 5, 1, 2, 3, 4, 5, 1, 1, 3, 4, 21, 6, 23, 32]"+
"// DOEMatrixRow=[19, 11, 2, 1, 1, 3, 1, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 12, 1, 1, 2, 3, 1, 2, 6, 1, 1, 2, 3, 13, 1, 12, 10]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x02*x0/2.0*xyza^95.0+x0^2.0*4.0*xyza^38.0-x0^2.0*xyza^32.0-x0^3.0+x0^21.0*2.0*xyza^36.0-x0^2.0*x0*36.0*xyza^70.0+x0^2.0*x02*x0*81.0*xyza^42.0+x0*4.5*xyza^36.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x02*x0/2.0*95.0*xyza^94.0+x0^2.0*4.0*38.0*xyza^37.0-x0^2.0*32.0*xyza^31.0-x0^3.0*0.0+x0^21.0*2.0*36.0*xyza^35.0-x0^2.0*x0*36.0*70.0*xyza^69.0+x0^2.0*x02*x0*81.0*42.0*xyza^41.0+x0*4.5*36.0*xyza^35.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x02*x0*47.5*xyza^94.0+x0^2.0*152.0*xyza^37.0-x0^2.0*32.0*xyza^31.0-x0^3.0*0.0+x0^21.0*72.0*xyza^35.0-x0^2.0*x0*2520.0*xyza^69.0+x0^2.0*x02*x0*3402.0*xyza^41.0+x0*162.0*xyza^35.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x02*x0/2.0*xyza^95.0+x0^2.0*4.0*xyza^38.0-x0^2.0*xyza^32.0-x0^3.0+x0^21.0*2.0*xyza^36.0-x0^2.0*x0*36.0*xyza^70.0+x0^2.0*x02*x0*81.0*xyza^42.0+x0*4.5*xyza^36.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x02*x0/2.0/96.0*xyza^96.0+x0^2.0*4.0/39.0*xyza^39.0-x0^2.0/33.0*xyza^33.0-x0^3.0*xyza+x0^21.0*2.0/37.0*xyza^37.0-x0^2.0*x0*36.0/71.0*xyza^71.0+x0^2.0*x02*x0*81.0/43.0*xyza^43.0+x0*4.5/37.0*xyza^37.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x02*x0*0.005208333333333333*xyza^96.0+x0^2.0*0.10256410256410256*xyza^39.0-x0^2.0/33.0*xyza^33.0-x0^3.0*xyza+x0^21.0*0.05405405405405406*xyza^37.0-x0^2.0*x0*0.5070422535211268*xyza^71.0+x0^2.0*x02*x0*1.8837209302325582*xyza^43.0+x0/8.222222222222221*xyza^37.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x02*x0*47.5*xyza^94.0+x0^2.0*152.0*xyza^37.0-x0^2.0*32.0*xyza^31.0-x0^3.0*0.0+x0^21.0*72.0*xyza^35.0-x0^2.0*x0*2520.0*xyza^69.0+x0^2.0*x02*x0*3402.0*xyza^41.0+x0*162.0*xyza^35.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x02*x0*47.5*94.0*xyza^93.0+x0^2.0*152.0*37.0*xyza^36.0-x0^2.0*32.0*31.0*xyza^30.0-x0^3.0*0.0*0.0+x0^21.0*72.0*35.0*xyza^34.0-x0^2.0*x0*2520.0*69.0*xyza^68.0+x0^2.0*x02*x0*3402.0*41.0*xyza^40.0+x0*162.0*35.0*xyza^34.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x02*x0*4465.0*xyza^93.0+x0^2.0*5624.0*xyza^36.0-x0^2.0*992.0*xyza^30.0-x0^3.0*0.0+x0^21.0*2520.0*xyza^34.0-x0^2.0*x0*173880.0*xyza^68.0+x0^2.0*x02*x0*139482.0*xyza^40.0+x0*5670.0*xyza^34.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x02*x0*0.005208333333333333*xyza^96.0+x0^2.0*0.10256410256410256*xyza^39.0-x0^2.0/33.0*xyza^33.0-x0^3.0*xyza+x0^21.0*0.05405405405405406*xyza^37.0-x0^2.0*x0*0.5070422535211268*xyza^71.0+x0^2.0*x02*x0*1.8837209302325582*xyza^43.0+x0/8.222222222222221*xyza^37.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x02*x0*0.005208333333333333/97.0*xyza^97.0+x0^2.0*0.10256410256410256/40.0*xyza^40.0-x0^2.0/33.0/34.0*xyza^34.0-x0^3.0/2.0*xyza^2.0+x0^21.0*0.05405405405405406/38.0*xyza^38.0-x0^2.0*x0*0.5070422535211268/72.0*xyza^72.0+x0^2.0*x02*x0*1.8837209302325582/44.0*xyza^44.0+x0*8.222222222222221/38.0*xyza^38.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x02*x0*5.3694158075601374E-5*xyza^97.0+x0^2.0*0.002564102564102564*xyza^40.0-x0^2.0*8.9126559714795E-4*xyza^34.0-x0^3.0/2.0*xyza^2.0+x0^21.0*0.001422475106685633*xyza^38.0-x0^2.0*x0*0.007042253521126761*xyza^72.0+x0^2.0*x02*x0*0.04281183932346723*xyza^44.0+x0/4.621621621621622*xyza^38.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x02*x0*4465.0*xyza^93.0+x0^2.0*5624.0*xyza^36.0-x0^2.0*992.0*xyza^30.0-x0^3.0*0.0+x0^21.0*2520.0*xyza^34.0-x0^2.0*x0*173880.0*xyza^68.0+x0^2.0*x02*x0*139482.0*xyza^40.0+x0*5670.0*xyza^34.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x02*x0*4465.0*93.0*xyza^92.0+x0^2.0*5624.0*36.0*xyza^35.0-x0^2.0*992.0*30.0*xyza^29.0-x0^3.0*0.0*0.0+x0^21.0*2520.0*34.0*xyza^33.0-x0^2.0*x0*173880.0*68.0*xyza^67.0+x0^2.0*x02*x0*139482.0*40.0*xyza^39.0+x0*5670.0*34.0*xyza^33.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x02*x0*415245.0*xyza^92.0+x0^2.0*202464.0*xyza^35.0-x0^2.0*29760.0*xyza^29.0-x0^3.0*0.0+x0^21.0*85680.0*xyza^33.0-x0^2.0*x0*1.182384E7*xyza^67.0+x0^2.0*x02*x0*5579280.0*xyza^39.0+x0*192780.0*xyza^33.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x02*x0*5.3694158075601374E-5*xyza^97.0-5.0*xyza^97.0+x0^2.0*0.002564102564102564*xyza^40.0-x0^2.0*8.9126559714795E-4*xyza^34.0-4.0*xyza^34.0-x0^3.0/2.0*xyza^2.0+x0^21.0*0.001422475106685633*xyza^38.0-x0^2.0*x0*0.007042253521126761*xyza^72.0+x0^2.0*x02*x0*0.04281183932346723*xyza^44.0+x0/4.621621621621622*xyza^38.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x02*x0*5.3694158075601374E-5/98.0*xyza^98.0-5.0/98.0*xyza^98.0+x0^2.0*0.002564102564102564/41.0*xyza^41.0-x0^2.0*8.9126559714795E-4/35.0*xyza^35.0-4.0/35.0*xyza^35.0-x0^3.0/2.0/3.0*xyza^3.0+x0^21.0*0.001422475106685633/39.0*xyza^39.0-x0^2.0*x0*0.007042253521126761/73.0*xyza^73.0+x0^2.0*x02*x0*0.04281183932346723/45.0*xyza^45.0+x0*4.621621621621622/39.0*xyza^39.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x02*x0/1825152.0*xyza^98.0-1.0/19.6*xyza^98.0-0.05102040816326531*xyza^98.0+x0^2.0*6.253908692933083E-5*xyza^41.0-x0^2.0/39270.0*xyza^35.0-1.0/8.75*xyza^35.0-0.11428571428571428*xyza^35.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^21.0*3.6473720684247E-5*xyza^39.0-x0^2.0*x0*9.646922631680494E-5*xyza^73.0+x0^2.0*x02*x0*9.513742071881607E-4*xyza^45.0+x0/8.43859649122807*xyza^39.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x02*x0*415245.0*xyza^92.0+x0^2.0*202464.0*xyza^35.0-x0^2.0*29760.0*xyza^29.0-x0^3.0*0.0+x0^21.0*85680.0*xyza^33.0-x0^2.0*x0*1.182384E7*xyza^67.0+x0^2.0*x02*x0*5579280.0*xyza^39.0+x0*192780.0*xyza^33.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x02*x0*415245.0*92.0*xyza^91.0+x0^2.0*202464.0*35.0*xyza^34.0-x0^2.0*29760.0*29.0*xyza^28.0-x0^3.0*0.0*0.0+x0^21.0*85680.0*33.0*xyza^32.0-x0^2.0*x0*1.182384E7*67.0*xyza^66.0+x0^2.0*x02*x0*5579280.0*39.0*xyza^38.0+x0*192780.0*33.0*xyza^32.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x02*x0*3.820254E7*xyza^91.0+x0^2.0*7086240.0*xyza^34.0-x0^2.0*863040.0*xyza^28.0-x0^3.0*0.0+x0^21.0*2827440.0*xyza^32.0-x0^2.0*x0*7.9219728E8*xyza^66.0+x0^2.0*x02*x0*2.1759192E8*xyza^38.0+x0*6361740.0*xyza^32.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x02*x0/1825152.0*xyza^98.0-1.0/19.6*xyza^98.0-0.05102040816326531*xyza^98.0+x0^2.0*6.253908692933083E-5*xyza^41.0-5.0*xyza^41.0-x0^2.0/39270.0*xyza^35.0-1.0/8.75*xyza^35.0-0.11428571428571428*xyza^35.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^21.0*3.6473720684247E-5*xyza^39.0-5.0*xyza^39.0-x0^2.0*x0*9.646922631680494E-5*xyza^73.0-5.0*xyza^73.0+x0^2.0*x02*x0*9.513742071881607E-4*xyza^45.0-4.0*xyza^45.0+x0/8.43859649122807*xyza^39.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x02*x0/1825152.0/99.0*xyza^99.0-1.0/19.6/99.0*xyza^99.0-0.05102040816326531/99.0*xyza^99.0+x0^2.0*6.253908692933083E-5/42.0*xyza^42.0-5.0/42.0*xyza^42.0-x0^2.0/39270.0/36.0*xyza^36.0-1.0/8.75/36.0*xyza^36.0-0.11428571428571428/36.0*xyza^36.0-x0^3.0*0.16666666666666666/4.0*xyza^4.0+x0^21.0*3.6473720684247E-5/40.0*xyza^40.0-5.0/40.0*xyza^40.0-x0^2.0*x0*9.646922631680494E-5/74.0*xyza^74.0-5.0/74.0*xyza^74.0+x0^2.0*x02*x0*9.513742071881607E-4/46.0*xyza^46.0-4.0/46.0*xyza^46.0+x0*8.43859649122807/40.0*xyza^40.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x02*x0/1.80690048E8*xyza^99.0-1.0/1940.4*xyza^99.0-5.153576582148011E-4*xyza^99.0+x0^2.0/671580.0*xyza^42.0-1.0/8.4*xyza^42.0-0.11904761904761904*xyza^42.0-x0^2.0/1413720.0*xyza^36.0-1.0/315.0*xyza^36.0-0.0031746031746031746*xyza^36.0-x0^3.0*0.041666666666666664*xyza^4.0+x0^21.0/1096680.0*xyza^40.0-1.0/8.0*xyza^40.0-0.125*xyza^40.0-x0^2.0*x0/767084.0*xyza^74.0-1.0/14.8*xyza^74.0-0.06756756756756757*xyza^74.0+x0^2.0*x02*x0/48351.11111111111*xyza^46.0-1.0/11.5*xyza^46.0-0.08695652173913043*xyza^46.0+x0/4.74012474012474*xyza^40.0";
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

public static void TestCaseDiff121209() {
 UsageCalculus.TestCase = 121209;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*x^2*-3*x^32*x^2*-3*x^33*x^3*-1*x";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=208 EqnNumber=11 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[52, 11, 1, 2, 1, 1, 2, 9, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 5, 1, 1, 6, 2, 3, 1, 1, 6, 2, 3, 4, 1, 22, 7, 24, 1]"+
"// DOEMatrixRow=[84, 12, 3, 2, 3, 1, 2, 3, 1, 1, 2, 1, 2, 3, 4, 2, 3, 13, 2, 3, 1, 4, 2, 3, 1, 2, 3, 1, 4, 14, 2, 13, 11]"+
//Tail EqnIndex=208 EqnNumber=11 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[52, 11, 1, 2, 1, 1, 2, 9, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 5, 1, 1, 6, 2, 3, 1, 1, 6, 2, 3, 4, 1, 22, 7, 24, 1]"+
"// DOEMatrixRow=[84, 12, 3, 2, 3, 1, 2, 3, 1, 1, 2, 1, 2, 3, 4, 2, 3, 13, 2, 3, 1, 4, 2, 3, 1, 2, 3, 1, 4, 14, 2, 13, 11]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-18.0*x^73.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-18.0*73.0*x^72.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-1314.0*x^72.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-18.0*x^73.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-18.0/74.0*x^74.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/4.111111111111111*x^74.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-1314.0*x^72.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-1314.0*72.0*x^71.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-94608.0*x^71.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/4.111111111111111*x^74.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/4.111111111111111/75.0*x^75.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/308.3333333333333*x^75.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-94608.0*x^71.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-94608.0*71.0*x^70.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-6717168.0*x^70.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/308.3333333333333*x^75.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/308.3333333333333/76.0*x^76.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/23433.333333333332*x^76.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-6717168.0*x^70.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-6717168.0*70.0*x^69.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-4.7020176E8*x^69.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/23433.333333333332*x^76.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/23433.333333333332/77.0*x^77.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/1804366.6666666665*x^77.0";
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

public static void TestCaseDiff121210() {
 UsageCalculus.TestCase = 121210;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xy^3*-1*xy/2*xy^22*x0^2*-3*x0^3*1*x0/-3*x0^23*xy^3*-1*xy2*x0^2*-3*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=209 EqnNumber=12 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[17, 12, 2, 3, 2, 3, 1, 10, 2, 3, 4, 2, 3, 1, 2, 3, 1, 2, 1, 2, 3, 7, 3, 1, 2, 3, 7, 3, 4, 5, 2, 23, 8, 25, 2]"+
"// DOEMatrixRow=[48, 13, 4, 3, 1, 2, 3, 4, 2, 3, 4, 2, 3, 1, 1, 3, 1, 14, 3, 1, 2, 5, 3, 1, 2, 3, 1, 2, 1, 15, 1, 14, 12]"+
//Tail EqnIndex=209 EqnNumber=12 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[17, 12, 2, 3, 2, 3, 1, 10, 2, 3, 4, 2, 3, 1, 2, 3, 1, 2, 1, 2, 3, 7, 3, 1, 2, 3, 7, 3, 4, 5, 2, 23, 8, 25, 2]"+
"// DOEMatrixRow=[48, 13, 4, 3, 1, 2, 3, 4, 2, 3, 4, 2, 3, 1, 1, 3, 1, 14, 3, 1, 2, 5, 3, 1, 2, 3, 1, 2, 1, 15, 1, 14, 12]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^2.0*4.5*xy^29.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^2.0*4.5*29.0*xy^28.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^2.0*130.5*xy^28.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^2.0*4.5*xy^29.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^2.0*4.5/30.0*xy^30.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^2.0/6.666666666666667*xy^30.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^2.0*130.5*xy^28.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^2.0*130.5*28.0*xy^27.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^2.0*3654.0*xy^27.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^2.0/6.666666666666667*xy^30.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^2.0*6.666666666666667/31.0*xy^31.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^2.0/4.6499999999999995*xy^31.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^2.0*3654.0*xy^27.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^2.0*3654.0*27.0*xy^26.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^2.0*98658.0*xy^26.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^2.0/4.6499999999999995*xy^31.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^2.0*4.6499999999999995/32.0*xy^32.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^2.0/6.881720430107528*xy^32.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^2.0*98658.0*xy^26.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^2.0*98658.0*26.0*xy^25.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^2.0*2565108.0*xy^25.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^2.0/6.881720430107528*xy^32.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^2.0*6.881720430107528/33.0*xy^33.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^2.0/4.7953125*xy^33.0";
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

public static void TestCaseDiff121211() {
 UsageCalculus.TestCase = 121211;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*x0^2*-3*x0^3*1*x0/-3*x0^23*xyz^31*xyz/-3*xyz^22*x0^2*-3*x0^33*xyz^3*1*xyz";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=210 EqnNumber=13 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[82, 13, 3, 4, 3, 1, 2, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 2, 3, 4, 8, 1, 2, 3, 4, 8, 1, 1, 6, 3, 24, 9, 26, 3]"+
"// DOEMatrixRow=[14, 15, 5, 4, 2, 3, 1, 5, 3, 4, 1, 1, 1, 2, 3, 1, 2, 15, 4, 2, 3, 1, 1, 2, 3, 4, 2, 3, 2, 16, 2, 15, 13]"+
//Tail EqnIndex=210 EqnNumber=13 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[82, 13, 3, 4, 3, 1, 2, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 2, 3, 4, 8, 1, 2, 3, 4, 8, 1, 1, 6, 3, 24, 9, 26, 3]"+
"// DOEMatrixRow=[14, 15, 5, 4, 2, 3, 1, 5, 3, 4, 1, 1, 1, 2, 3, 1, 2, 15, 4, 2, 3, 1, 1, 2, 3, 4, 2, 3, 2, 16, 2, 15, 13]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0*x0*2.0*xyz^58.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0*x0*58.0*xyz^57.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*x0*58.0*xyz^57.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0*x0*2.0*xyz^58.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0*x0*2.0/59.0*xyz^59.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0*x0/29.5*xyz^59.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*x0*58.0*xyz^57.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*x0*57.0*xyz^56.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*x0*57.0*xyz^56.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0*x0/29.5*xyz^59.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0*x0/29.5/60.0*xyz^60.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0*x0/1770.0*xyz^60.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*x0*57.0*xyz^56.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*x0*56.0*xyz^55.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*x0*56.0*xyz^55.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0*x0/1770.0*xyz^60.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0*x0/1770.0/61.0*xyz^61.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0*x0/107970.0*xyz^61.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*x0*56.0*xyz^55.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*x0*55.0*xyz^54.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*x0*55.0*xyz^54.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0*x0/107970.0*xyz^61.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0*x0/107970.0/62.0*xyz^62.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0*x0/6694140.0*xyz^62.0";
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

public static void TestCaseDiff121212() {
 UsageCalculus.TestCase = 121212;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xyza^31*xyza/-3*xyza^2-3*x0^2*-1*x0^3*2*x01*xyza^3*2*xyza/3*xyza^2*--1*xyza^33*xyza^3*1*xyza1*xyza/-3*xyza^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=211 EqnNumber=14 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[46, 14, 4, 5, 4, 2, 3, 2, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 1, 1, 9, 2, 3, 1, 1, 9, 2, 3, 7, 4, 25, 10, 27, 4]"+
"// DOEMatrixRow=[79, 16, 6, 1, 3, 1, 2, 6, 1, 1, 2, 1, 2, 3, 4, 2, 3, 16, 5, 3, 1, 2, 3, 1, 4, 1, 3, 1, 3, 1, 1, 16, 14]"+
//Tail EqnIndex=211 EqnNumber=14 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[46, 14, 4, 5, 4, 2, 3, 2, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 1, 1, 9, 2, 3, 1, 1, 9, 2, 3, 7, 4, 25, 10, 27, 4]"+
"// DOEMatrixRow=[79, 16, 6, 1, 3, 1, 2, 6, 1, 1, 2, 1, 2, 3, 4, 2, 3, 16, 5, 3, 1, 2, 3, 1, 4, 1, 3, 1, 3, 1, 1, 16, 14]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-xyza^34.0+1.3333333333333333*xyza^45.0+1.0/3.0*xyza^39.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-34.0*xyza^33.0+1.3333333333333333*45.0*xyza^44.0+1.0/3.0*39.0*xyza^38.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-34.0*xyza^33.0+60.0*xyza^44.0+13.0*xyza^38.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-xyza^34.0+1.3333333333333333*xyza^45.0+1.0/3.0*xyza^39.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.0/35.0*xyza^35.0+1.3333333333333333/46.0*xyza^46.0+1.0/3.0/40.0*xyza^40.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/35.0*xyza^35.0+1.0/34.5*xyza^46.0+1.0/120.0*xyza^40.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-34.0*xyza^33.0+60.0*xyza^44.0+13.0*xyza^38.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-34.0*33.0*xyza^32.0+60.0*44.0*xyza^43.0+13.0*38.0*xyza^37.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-1122.0*xyza^32.0+2640.0*xyza^43.0+494.0*xyza^37.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/35.0*xyza^35.0+1.0/34.5*xyza^46.0+1.0/120.0*xyza^40.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/35.0/36.0*xyza^36.0+1.0/34.5/47.0*xyza^47.0+1.0/120.0/41.0*xyza^41.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/1260.0*xyza^36.0+1.0/1621.5*xyza^47.0+1.0/4920.0*xyza^41.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-1122.0*xyza^32.0+2640.0*xyza^43.0+494.0*xyza^37.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-1122.0*32.0*xyza^31.0+2640.0*43.0*xyza^42.0+494.0*37.0*xyza^36.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-35904.0*xyza^31.0+113520.0*xyza^42.0+18278.0*xyza^36.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/1260.0*xyza^36.0+1.0/1621.5*xyza^47.0+1.0/4920.0*xyza^41.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/1260.0/37.0*xyza^37.0+1.0/1621.5/48.0*xyza^48.0+1.0/4920.0/42.0*xyza^42.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/46620.0*xyza^37.0+1.0/77832.0*xyza^48.0+1.0/206640.0*xyza^42.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-35904.0*xyza^31.0+113520.0*xyza^42.0+18278.0*xyza^36.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-35904.0*31.0*xyza^30.0+113520.0*42.0*xyza^41.0+18278.0*36.0*xyza^35.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1113024.0*xyza^30.0+4767840.0*xyza^41.0+658008.0*xyza^35.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/46620.0*xyza^37.0+1.0/77832.0*xyza^48.0+1.0/206640.0*xyza^42.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/46620.0/38.0*xyza^38.0+1.0/77832.0/49.0*xyza^49.0+1.0/206640.0/43.0*xyza^43.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/1771560.0*xyza^38.0+1.0/3813768.0*xyza^49.0+1.0/8885520.0*xyza^43.0";
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

public static void TestCaseDiff121213() {
 UsageCalculus.TestCase = 121213;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x/-3*x^2-3*x0^2*-1*x0^3*2*x01*x^3*2*x/3*x^2*--1*x^32*x3*x0^2*--1*x0^31*x/-3*x^2-3*x0^2*-1*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=212 EqnNumber=15 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[12, 15, 5, 6, 1, 3, 1, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 2, 3, 10, 3, 1, 2, 3, 10, 3, 4, 8, 1, 26, 11, 28, 5]"+
"// DOEMatrixRow=[43, 17, 7, 2, 1, 2, 3, 7, 2, 3, 4, 2, 3, 1, 1, 3, 1, 17, 6, 1, 2, 3, 1, 2, 5, 2, 1, 2, 4, 2, 1, 17, 15]"+
//Tail EqnIndex=212 EqnNumber=15 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[12, 15, 5, 6, 1, 3, 1, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 2, 3, 10, 3, 1, 2, 3, 10, 3, 4, 8, 1, 26, 11, 28, 5]"+
"// DOEMatrixRow=[43, 17, 7, 2, 1, 2, 3, 7, 2, 3, 4, 2, 3, 1, 1, 3, 1, 17, 6, 1, 2, 3, 1, 2, 5, 2, 1, 2, 4, 2, 1, 17, 15]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-1.0/3.0*x^3.0+1.3333333333333333*x^41.0-1.0/3.0*x^35.0+1.0/3.0*x^3.0+3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-1.0/3.0*3.0*x^2.0+1.3333333333333333*41.0*x^40.0-1.0/3.0*35.0*x^34.0+1.0/3.0*3.0*x^2.0+3.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x^2.0+54.666666666666664*x^40.0-11.666666666666666*x^34.0+x^2.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-1.0/3.0*x^3.0+1.3333333333333333*x^41.0-1.0/3.0*x^35.0+1.0/3.0*x^3.0+3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.0/3.0/4.0*x^4.0+1.3333333333333333/42.0*x^42.0-1.0/3.0/36.0*x^36.0+1.0/3.0/4.0*x^4.0+3.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/12.0*x^4.0+1.0/31.5*x^42.0-1.0/108.0*x^36.0+1.0/12.0*x^4.0+3.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x^2.0+54.666666666666664*x^40.0-11.666666666666666*x^34.0+x^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-2.0*x^1.0+54.666666666666664*40.0*x^39.0-11.666666666666666*34.0*x^33.0+2.0*x^1.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-2.0*x+2186.6666666666665*x^39.0-396.66666666666663*x^33.0+2.0*x";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/12.0*x^4.0+1.0/31.5*x^42.0-1.0/108.0*x^36.0+1.0/12.0*x^4.0+3.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/12.0/5.0*x^5.0+1.0/31.5/43.0*x^43.0-1.0/108.0/37.0*x^37.0+1.0/12.0/5.0*x^5.0+3.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/60.0*x^5.0+1.0/1354.5*x^43.0-1.0/3996.0*x^37.0+1.0/60.0*x^5.0+1.5*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-2.0*x+2186.6666666666665*x^39.0-396.66666666666663*x^33.0+2.0*x";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-2.0+2186.6666666666665*39.0*x^38.0-396.66666666666663*33.0*x^32.0+2.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-2.0+85280.0*x^38.0-13089.999999999998*x^32.0+2.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/60.0*x^5.0+1.0/1354.5*x^43.0-1.0/3996.0*x^37.0+1.0/60.0*x^5.0+1.5*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/60.0/6.0*x^6.0+1.0/1354.5/44.0*x^44.0-1.0/3996.0/38.0*x^38.0+1.0/60.0/6.0*x^6.0+1.5/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/360.0*x^6.0+1.0/59598.0*x^44.0-1.0/151848.0*x^38.0+1.0/360.0*x^6.0+1.0/2.0*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-2.0+85280.0*x^38.0-13089.999999999998*x^32.0+2.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0+85280.0*38.0*x^37.0-13089.999999999998*32.0*x^31.0+2.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "3240640.0*x^37.0-418879.99999999994*x^31.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/360.0*x^6.0+1.0/59598.0*x^44.0-1.0/151848.0*x^38.0+1.0/360.0*x^6.0+1.0/2.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/360.0/7.0*x^7.0+1.0/59598.0/45.0*x^45.0-1.0/151848.0/39.0*x^39.0+1.0/360.0/7.0*x^7.0+1.0/2.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/2520.0*x^7.0+1.0/2681910.0*x^45.0-1.0/5922072.0*x^39.0+1.0/2520.0*x^7.0+1.0/8.0*x^4.0";
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

public static void TestCaseDiff121214() {
 UsageCalculus.TestCase = 121214;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*x0^2*-1*x0^3*2*x01*xy^3*2*xy/3*xy^2*--1*xy^32*xy3*x0^2*--1*x0^3-1*xy^3*2*xy/3*xy^22*xy/3*xy^2*-1*xy^3*-3*xy-3*x0^2*-1*x0^31*xy^3*2*xy";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=213 EqnNumber=16 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[77, 16, 6, 7, 2, 1, 2, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 3, 4, 11, 1, 2, 3, 4, 11, 1, 1, 9, 2, 27, 12, 29, 6]"+
"// DOEMatrixRow=[9, 18, 8, 3, 2, 3, 1, 8, 3, 4, 1, 1, 1, 2, 3, 1, 2, 18, 7, 2, 3, 4, 2, 3, 6, 3, 2, 3, 1, 3, 2, 18, 16]"+
//Tail EqnIndex=213 EqnNumber=16 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[77, 16, 6, 7, 2, 1, 2, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 3, 4, 11, 1, 2, 3, 4, 11, 1, 1, 9, 2, 27, 12, 29, 6]"+
"// DOEMatrixRow=[9, 18, 8, 3, 2, 3, 1, 8, 3, 4, 1, 1, 1, 2, 3, 1, 2, 18, 7, 2, 3, 4, 2, 3, 6, 3, 2, 3, 1, 3, 2, 18, 16]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0*4.0*xy^38.0-x0^2.0*xy^32.0-x0^3.0-1.0/1.5*xy^33.0+x0^2.0*6.0*xy^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0*4.0*38.0*xy^37.0-x0^2.0*32.0*xy^31.0-x0^3.0*0.0-1.0/1.5*33.0*xy^32.0+x0^2.0*6.0*4.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*152.0*xy^37.0-x0^2.0*32.0*xy^31.0-x0^3.0*0.0-22.0*xy^32.0+x0^2.0*24.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0*4.0*xy^38.0-x0^2.0*xy^32.0-x0^3.0-1.0/1.5*xy^33.0+x0^2.0*6.0*xy^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0*4.0/39.0*xy^39.0-x0^2.0/33.0*xy^33.0-x0^3.0*xy-1.0/1.5/34.0*xy^34.0+x0^2.0*6.0/5.0*xy^5.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0*0.10256410256410256*xy^39.0-x0^2.0/33.0*xy^33.0-x0^3.0*xy-0.0196078431372549*xy^34.0+x0^2.0*1.2*xy^5.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*152.0*xy^37.0-x0^2.0*32.0*xy^31.0-x0^3.0*0.0-22.0*xy^32.0+x0^2.0*24.0*xy^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*152.0*37.0*xy^36.0-x0^2.0*32.0*31.0*xy^30.0-x0^3.0*0.0*0.0-22.0*32.0*xy^31.0+x0^2.0*24.0*3.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*5624.0*xy^36.0-x0^2.0*992.0*xy^30.0-x0^3.0*0.0-704.0*xy^31.0+x0^2.0*72.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0*0.10256410256410256*xy^39.0-x0^2.0/33.0*xy^33.0-x0^3.0*xy-0.0196078431372549*xy^34.0+x0^2.0*1.2*xy^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0*0.10256410256410256/40.0*xy^40.0-x0^2.0/33.0/34.0*xy^34.0-x0^3.0/2.0*xy^2.0-0.0196078431372549/35.0*xy^35.0+x0^2.0*1.2/6.0*xy^6.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0*0.002564102564102564*xy^40.0-x0^2.0*8.9126559714795E-4*xy^34.0-x0^3.0/2.0*xy^2.0-5.602240896358543E-4*xy^35.0+x0^2.0/5.0*xy^6.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*5624.0*xy^36.0-x0^2.0*992.0*xy^30.0-x0^3.0*0.0-704.0*xy^31.0+x0^2.0*72.0*xy^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*5624.0*36.0*xy^35.0-x0^2.0*992.0*30.0*xy^29.0-x0^3.0*0.0*0.0-704.0*31.0*xy^30.0+x0^2.0*72.0*2.0*xy^1.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*202464.0*xy^35.0-x0^2.0*29760.0*xy^29.0-x0^3.0*0.0-21824.0*xy^30.0+x0^2.0*144.0*xy";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0*0.002564102564102564*xy^40.0-x0^2.0*8.9126559714795E-4*xy^34.0-4.0*xy^34.0-x0^3.0/2.0*xy^2.0-5.602240896358543E-4*xy^35.0-4.0*xy^35.0+x0^2.0/5.0*xy^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0*0.002564102564102564/41.0*xy^41.0-x0^2.0*8.9126559714795E-4/35.0*xy^35.0-4.0/35.0*xy^35.0-x0^3.0/2.0/3.0*xy^3.0-5.602240896358543E-4/36.0*xy^36.0-4.0/36.0*xy^36.0+x0^2.0*5.0/7.0*xy^7.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0*6.253908692933083E-5*xy^41.0-x0^2.0/39270.0*xy^35.0-1.0/8.75*xy^35.0-0.11428571428571428*xy^35.0-x0^3.0/6.0*xy^3.0-1.0/64260.00000000001*xy^36.0-1.0/9.0*xy^36.0-0.1111111111111111*xy^36.0+x0^2.0/1.4*xy^7.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*202464.0*xy^35.0-x0^2.0*29760.0*xy^29.0-x0^3.0*0.0-21824.0*xy^30.0+x0^2.0*144.0*xy";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*202464.0*35.0*xy^34.0-x0^2.0*29760.0*29.0*xy^28.0-x0^3.0*0.0*0.0-21824.0*30.0*xy^29.0+x0^2.0*144.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*7086240.0*xy^34.0-x0^2.0*863040.0*xy^28.0-x0^3.0*0.0-654720.0*xy^29.0+x0^2.0*144.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0*6.253908692933083E-5*xy^41.0-5.0*xy^41.0-x0^2.0/39270.0*xy^35.0-1.0/8.75*xy^35.0-0.11428571428571428*xy^35.0-x0^3.0/6.0*xy^3.0-1.0/64260.00000000001*xy^36.0-1.0/9.0*xy^36.0-0.1111111111111111*xy^36.0+x0^2.0/1.4*xy^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0*6.253908692933083E-5/42.0*xy^42.0-5.0/42.0*xy^42.0-x0^2.0/39270.0/36.0*xy^36.0-1.0/8.75/36.0*xy^36.0-0.11428571428571428/36.0*xy^36.0-x0^3.0/6.0/4.0*xy^4.0-1.0/64260.00000000001/37.0*xy^37.0-1.0/9.0/37.0*xy^37.0-0.1111111111111111/37.0*xy^37.0+x0^2.0*1.4/8.0*xy^8.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0/671580.0*xy^42.0-1.0/8.4*xy^42.0-0.11904761904761904*xy^42.0-x0^2.0/1413720.0*xy^36.0-1.0/315.0*xy^36.0-0.0031746031746031746*xy^36.0-x0^3.0/24.0*xy^4.0-1.0/2377620.0000000005*xy^37.0-1.0/333.0*xy^37.0-0.003003003003003003*xy^37.0+x0^2.0/5.714285714285714*xy^8.0";
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

public static void TestCaseDiff121215() {
 UsageCalculus.TestCase = 121215;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xyz^3*2*xyz/3*xyz^2*--1*xyz^32*xyz3*x0^2*--1*x0^3-1*xyz^3*2*xyz/3*xyz^22*xyz/3*xyz^2*-1*xyz^3*-3*xyz3*x0^21*xyz^3*-3*xyz1*xyz^3*2*xyz2*xyz/3*xyz^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=214 EqnNumber=17 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[41, 17, 7, 8, 3, 2, 3, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 1, 1, 12, 2, 3, 1, 1, 12, 2, 3, 10, 3, 28, 13, 30, 7]"+
"// DOEMatrixRow=[74, 19, 9, 4, 3, 1, 2, 9, 1, 1, 2, 1, 2, 3, 4, 2, 3, 19, 8, 3, 1, 5, 3, 1, 1, 4, 3, 1, 2, 4, 1, 19, 17]"+
//Tail EqnIndex=214 EqnNumber=17 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[41, 17, 7, 8, 3, 2, 3, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 1, 1, 12, 2, 3, 1, 1, 12, 2, 3, 10, 3, 28, 13, 30, 7]"+
"// DOEMatrixRow=[74, 19, 9, 4, 3, 1, 2, 9, 1, 1, 2, 1, 2, 3, 4, 2, 3, 19, 8, 3, 1, 5, 3, 1, 1, 4, 3, 1, 2, 4, 1, 19, 17]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0/1.5*xyz^38.0-x0^2.0*xyz^32.0-x0^3.0+1.3333333333333333*xyz^41.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0/1.5*38.0*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0+1.3333333333333333*41.0*xyz^40.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*25.333333333333332*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0+54.666666666666664*xyz^40.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0/1.5*xyz^38.0-x0^2.0*xyz^32.0-x0^3.0+1.3333333333333333*xyz^41.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0/1.5/39.0*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz+1.3333333333333333/42.0*xyz^42.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0*0.017094017094017096*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz+1.0/31.5*xyz^42.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*25.333333333333332*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0+54.666666666666664*xyz^40.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*25.333333333333332*37.0*xyz^36.0-x0^2.0*32.0*31.0*xyz^30.0-x0^3.0*0.0*0.0+54.666666666666664*40.0*xyz^39.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*937.3333333333333*xyz^36.0-x0^2.0*992.0*xyz^30.0-x0^3.0*0.0+2186.6666666666665*xyz^39.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0*0.017094017094017096*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz+1.0/31.5*xyz^42.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0*0.017094017094017096/40.0*xyz^40.0-x0^2.0/33.0/34.0*xyz^34.0-x0^3.0/2.0*xyz^2.0+1.0/31.5/43.0*xyz^43.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0*4.273504273504274E-4*xyz^40.0-x0^2.0*8.9126559714795E-4*xyz^34.0-x0^3.0/2.0*xyz^2.0+1.0/1354.5*xyz^43.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*937.3333333333333*xyz^36.0-x0^2.0*992.0*xyz^30.0-x0^3.0*0.0+2186.6666666666665*xyz^39.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*937.3333333333333*36.0*xyz^35.0-x0^2.0*992.0*30.0*xyz^29.0-x0^3.0*0.0*0.0+2186.6666666666665*39.0*xyz^38.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*33744.0*xyz^35.0-x0^2.0*29760.0*xyz^29.0-x0^3.0*0.0+85280.0*xyz^38.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0*4.273504273504274E-4*xyz^40.0-4.0*xyz^40.0-x0^2.0*8.9126559714795E-4*xyz^34.0-4.0*xyz^34.0-x0^3.0/2.0*xyz^2.0+1.0/1354.5*xyz^43.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0*4.273504273504274E-4/41.0*xyz^41.0-4.0/41.0*xyz^41.0-x0^2.0*8.9126559714795E-4/35.0*xyz^35.0-4.0/35.0*xyz^35.0-x0^3.0/2.0/3.0*xyz^3.0+1.0/1354.5/44.0*xyz^44.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0/95939.99999999999*xyz^41.0-1.0/10.25*xyz^41.0-0.0975609756097561*xyz^41.0-x0^2.0/39270.0*xyz^35.0-1.0/8.75*xyz^35.0-0.11428571428571428*xyz^35.0-x0^3.0/6.0*xyz^3.0+1.0/59598.0*xyz^44.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*33744.0*xyz^35.0-x0^2.0*29760.0*xyz^29.0-x0^3.0*0.0+85280.0*xyz^38.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*33744.0*35.0*xyz^34.0-x0^2.0*29760.0*29.0*xyz^28.0-x0^3.0*0.0*0.0+85280.0*38.0*xyz^37.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*1181040.0*xyz^34.0-x0^2.0*863040.0*xyz^28.0-x0^3.0*0.0+3240640.0*xyz^37.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0/95939.99999999999*xyz^41.0-1.0/10.25*xyz^41.0-0.0975609756097561*xyz^41.0-x0^2.0/39270.0*xyz^35.0-1.0/8.75*xyz^35.0-0.11428571428571428*xyz^35.0-x0^3.0/6.0*xyz^3.0+1.0/59598.0*xyz^44.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0/95939.99999999999/42.0*xyz^42.0-1.0/10.25/42.0*xyz^42.0-0.0975609756097561/42.0*xyz^42.0-x0^2.0/39270.0/36.0*xyz^36.0-1.0/8.75/36.0*xyz^36.0-0.11428571428571428/36.0*xyz^36.0-x0^3.0/6.0/4.0*xyz^4.0+1.0/59598.0/45.0*xyz^45.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0/4029479.9999999995*xyz^42.0-1.0/430.5*xyz^42.0-0.0023228803716608595*xyz^42.0-x0^2.0/1413720.0*xyz^36.0-1.0/315.0*xyz^36.0-0.0031746031746031746*xyz^36.0-x0^3.0/24.0*xyz^4.0+1.0/2681910.0*xyz^45.0";
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

public static void TestCaseDiff121216() {
 UsageCalculus.TestCase = 121216;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xyza3*x0^2*--1*x0^3-1*xyza^3*2*xyza/3*xyza^22*xyza/3*xyza^2*-1*xyza^3*-3*xyza3*x0^21*xyza^3*-3*xyza-3*xyza/1*xyza^2*-2*xyza^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyza/3*xyza^23*x0^2*--1*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=215 EqnNumber=18 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[7, 18, 8, 9, 4, 3, 1, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 2, 13, 3, 1, 2, 3, 13, 3, 4, 11, 4, 29, 14, 31, 8]"+
"// DOEMatrixRow=[38, 20, 10, 1, 1, 2, 3, 10, 2, 3, 4, 2, 3, 1, 1, 3, 1, 20, 9, 1, 2, 1, 1, 2, 3, 1, 1, 2, 3, 5, 2, 20, 18]"+
//Tail EqnIndex=215 EqnNumber=18 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[7, 18, 8, 9, 4, 3, 1, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 2, 13, 3, 1, 2, 3, 13, 3, 4, 11, 4, 29, 14, 31, 8]"+
"// DOEMatrixRow=[38, 20, 10, 1, 1, 2, 3, 10, 2, 3, 4, 2, 3, 1, 1, 3, 1, 20, 9, 1, 2, 1, 1, 2, 3, 1, 1, 2, 3, 5, 2, 20, 18]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0*2.0-x0^3.0+x0^21.0*2.0*xyza^36.0+x0^2.0*x0*12.0*xyza^58.0-x0^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0*2.0*0.0-x0^3.0*0.0+x0^21.0*2.0*36.0*xyza^35.0+x0^2.0*x0*12.0*58.0*xyza^57.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*72.0*xyza^35.0+x0^2.0*x0*696.0*xyza^57.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0*2.0-x0^3.0+x0^21.0*2.0*xyza^36.0+x0^2.0*x0*12.0*xyza^58.0-x0^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0*xyza-x0^3.0*xyza+x0^21.0*2.0/37.0*xyza^37.0+x0^2.0*x0*12.0/59.0*xyza^59.0-x0^3.0*xyza";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0*xyza-x0^3.0*xyza+x0^21.0*0.05405405405405406*xyza^37.0+x0^2.0*x0*0.2033898305084746*xyza^59.0-x0^3.0*xyza";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*72.0*xyza^35.0+x0^2.0*x0*696.0*xyza^57.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^21.0*72.0*35.0*xyza^34.0+x0^2.0*x0*696.0*57.0*xyza^56.0-x0^3.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*2520.0*xyza^34.0+x0^2.0*x0*39672.0*xyza^56.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0*xyza-x0^3.0*xyza+x0^21.0*0.05405405405405406*xyza^37.0+x0^2.0*x0*0.2033898305084746*xyza^59.0-x0^3.0*xyza";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0/2.0*xyza^2.0-x0^3.0/2.0*xyza^2.0+x0^21.0*0.05405405405405406/38.0*xyza^38.0+x0^2.0*x0*0.2033898305084746/60.0*xyza^60.0-x0^3.0/2.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0/2.0*xyza^2.0-x0^3.0/2.0*xyza^2.0+x0^21.0*0.001422475106685633*xyza^38.0+x0^2.0*x0*0.0033898305084745766*xyza^60.0-x0^3.0/2.0*xyza^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*2520.0*xyza^34.0+x0^2.0*x0*39672.0*xyza^56.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^21.0*2520.0*34.0*xyza^33.0+x0^2.0*x0*39672.0*56.0*xyza^55.0-x0^3.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*85680.0*xyza^33.0+x0^2.0*x0*2221632.0*xyza^55.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0/2.0*xyza^2.0-x0^3.0/2.0*xyza^2.0+x0^21.0*0.001422475106685633*xyza^38.0+x0^2.0*x0*0.0033898305084745766*xyza^60.0-x0^3.0/2.0*xyza^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0/2.0/3.0*xyza^3.0-x0^3.0/2.0/3.0*xyza^3.0+x0^21.0*0.001422475106685633/39.0*xyza^39.0+x0^2.0*x0*0.0033898305084745766/61.0*xyza^61.0-x0^3.0*2.0/3.0*xyza^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0*0.16666666666666666*xyza^3.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^21.0*3.6473720684247E-5*xyza^39.0+x0^2.0*x0*5.5570991942206175E-5*xyza^61.0-x0^3.0/1.5*xyza^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*85680.0*xyza^33.0+x0^2.0*x0*2221632.0*xyza^55.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^21.0*85680.0*33.0*xyza^32.0+x0^2.0*x0*2221632.0*55.0*xyza^54.0-x0^3.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*2827440.0*xyza^32.0+x0^2.0*x0*1.2218976E8*xyza^54.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0*0.16666666666666666*xyza^3.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^21.0*3.6473720684247E-5*xyza^39.0-5.0*xyza^39.0+x0^2.0*x0*5.5570991942206175E-5*xyza^61.0-5.0*xyza^61.0-x0^3.0/1.5*xyza^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0*0.16666666666666666/4.0*xyza^4.0-x0^3.0*0.16666666666666666/4.0*xyza^4.0+x0^21.0*3.6473720684247E-5/40.0*xyza^40.0-5.0/40.0*xyza^40.0+x0^2.0*x0*5.5570991942206175E-5/62.0*xyza^62.0-5.0/62.0*xyza^62.0-x0^3.0*1.5/4.0*xyza^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0*0.041666666666666664*xyza^4.0-x0^3.0*0.041666666666666664*xyza^4.0+x0^21.0/1096680.0*xyza^40.0-1.0/8.0*xyza^40.0-0.125*xyza^40.0+x0^2.0*x0/1115689.9999999998*xyza^62.0-1.0/12.4*xyza^62.0-0.08064516129032258*xyza^62.0-x0^3.0/2.6666666666666665*xyza^4.0";
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

public static void TestCaseDiff121217() {
 UsageCalculus.TestCase = 121217;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*x0^2*--1*x0^3-1*x^3*2*x/3*x^22*x/3*x^2*-1*x^3*-3*x3*x0^21*x^3*-3*x-3*x/1*x^2*-2*x^31*x0^2*-2*x0^3*3*x0/-1*x0^22*x^33*x/-1*x^23*x0^2*--1*x0^3-1*x^3*2*x";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=216 EqnNumber=19 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[72, 19, 9, 10, 1, 1, 2, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 3, 14, 1, 2, 3, 4, 14, 1, 1, 12, 1, 30, 15, 32, 9]"+
"// DOEMatrixRow=[4, 21, 11, 2, 3, 1, 1, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 21, 10, 2, 3, 2, 3, 1, 4, 2, 3, 1, 4, 6, 1, 1, 19]"+
//Tail EqnIndex=216 EqnNumber=19 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[72, 19, 9, 10, 1, 1, 2, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 3, 14, 1, 2, 3, 4, 14, 1, 1, 12, 1, 30, 15, 32, 9]"+
"// DOEMatrixRow=[4, 21, 11, 2, 3, 1, 1, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 21, 10, 2, 3, 2, 3, 1, 4, 2, 3, 1, 4, 6, 1, 1, 19]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "3.0-1.0+2.0*x^36.0-36.0*x^91.0-1.0-2.0*x^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0-1.0*0.0+2.0*36.0*x^35.0-36.0*91.0*x^90.0-1.0*0.0-2.0*4.0*x^3.0";
 UsageCalculus.EqnSolArrayMap2[1] = "72.0*x^35.0-3276.0*x^90.0-8.0*x^3.0";
 UsageCalculus.EqnSolArrayMap3[1] = "3.0-1.0+2.0*x^36.0-36.0*x^91.0-1.0-2.0*x^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "3.0*x-1.0*x+2.0/37.0*x^37.0-36.0/92.0*x^92.0-1.0*x-2.0/5.0*x^5.0";
 UsageCalculus.EqnSolArrayMap4[1] = "3.0*x-x+1.0/18.5*x^37.0-1.0/2.5555555555555554*x^92.0-x-1.0/2.5*x^5.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "72.0*x^35.0-3276.0*x^90.0-8.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "72.0*35.0*x^34.0-3276.0*90.0*x^89.0-8.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[2] = "2520.0*x^34.0-294840.0*x^89.0-24.0*x^2.0";
 UsageCalculus.EqnSolArrayMap3[2] = "3.0*x-x+1.0/18.5*x^37.0-0.391304347826087*x^92.0-x-1.0/2.5*x^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "3.0/2.0*x^2.0-1.0/2.0*x^2.0+1.0/18.5/38.0*x^38.0-0.391304347826087/93.0*x^93.0-1.0/2.0*x^2.0-1.0/2.5/6.0*x^6.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.5*x^2.0-1.0/2.0*x^2.0+1.0/703.0*x^38.0-1.0/237.66666666666666*x^93.0-1.0/2.0*x^2.0-1.0/15.0*x^6.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "2520.0*x^34.0-294840.0*x^89.0-24.0*x^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "2520.0*34.0*x^33.0-294840.0*89.0*x^88.0-24.0*2.0*x^1.0";
 UsageCalculus.EqnSolArrayMap2[3] = "85680.0*x^33.0-2.624076E7*x^88.0-48.0*x";
 UsageCalculus.EqnSolArrayMap3[3] = "1.5*x^2.0-1.0/2.0*x^2.0+1.0/703.0*x^38.0-1.0/237.66666666666666*x^93.0-1.0/2.0*x^2.0-1.0/15.0*x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.5/3.0*x^3.0-1.0/2.0/3.0*x^3.0+1.0/703.0/39.0*x^39.0-1.0/237.66666666666666/94.0*x^94.0-1.0/2.0/3.0*x^3.0-1.0/15.0/7.0*x^7.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/2.0*x^3.0-1.0/6.0*x^3.0+1.0/27417.0*x^39.0-1.0/22340.666666666664*x^94.0-1.0/6.0*x^3.0-1.0/105.0*x^7.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "85680.0*x^33.0-2.624076E7*x^88.0-48.0*x";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "85680.0*33.0*x^32.0-88.0*x^87.0-48.0";
 UsageCalculus.EqnSolArrayMap2[4] = "2827440.0*x^32.0-88.0*x^87.0-48.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/2.0*x^3.0-1.0/6.0*x^3.0+1.0/27417.0*x^39.0-1.0/22340.666666666664*x^94.0-1.0/6.0*x^3.0-1.0/105.0*x^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/2.0/4.0*x^4.0-1.0/6.0/4.0*x^4.0+1.0/27417.0/40.0*x^40.0-1.0/22340.666666666664/95.0*x^95.0-1.0/6.0/4.0*x^4.0-1.0/105.0/8.0*x^8.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/8.0*x^4.0-1.0/24.0*x^4.0+1.0/1096680.0*x^40.0-1.0/2122363.333333333*x^95.0-1.0/24.0*x^4.0-1.0/840.0*x^8.0";
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

public static void TestCaseDiff121218() {
 UsageCalculus.TestCase = 121218;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-1*xy^3*2*xy/3*xy^22*xy/3*xy^2*-1*xy^3*-3*xy3*x0^21*xy^3*-3*xy-3*xy/1*xy^2*-2*xy^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xy^33*xy/-1*xy^2-1*x0^2*-2*x0^3*3*x02*xy^3*3*xy/1*xy^2*--3*xy^3-1*xy^3*2*xy2*xy/3*xy^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=217 EqnNumber=20 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[36, 20, 10, 11, 2, 3, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 4, 15, 2, 3, 1, 1, 15, 2, 3, 13, 2, 31, 16, 1, 10]"+
"// DOEMatrixRow=[69, 22, 12, 3, 1, 2, 3, 2, 1, 1, 2, 1, 2, 3, 4, 2, 3, 22, 1, 3, 1, 3, 1, 2, 5, 3, 1, 2, 1, 7, 2, 3, 20]"+
//Tail EqnIndex=217 EqnNumber=20 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[36, 20, 10, 11, 2, 3, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 4, 15, 2, 3, 1, 1, 15, 2, 3, 13, 2, 31, 16, 1, 10]"+
"// DOEMatrixRow=[69, 22, 12, 3, 1, 2, 3, 2, 1, 1, 2, 1, 2, 3, 4, 2, 3, 22, 1, 3, 1, 3, 1, 2, 5, 3, 1, 2, 1, 7, 2, 3, 20]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^21.0*2.0*xy^36.0-x0^2.0*x0*36.0*xy^70.0+x0^2.0*x02*54.0*xy^9.0-3.0*xy^3.0-1.0/1.5*xy^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^21.0*2.0*36.0*xy^35.0-x0^2.0*x0*36.0*70.0*xy^69.0+x0^2.0*x02*54.0*9.0*xy^8.0-3.0*3.0*xy^2.0-1.0/1.5*6.0*xy^5.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^21.0*72.0*xy^35.0-x0^2.0*x0*2520.0*xy^69.0+x0^2.0*x02*486.0*xy^8.0-9.0*xy^2.0-4.0*xy^5.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^21.0*2.0*xy^36.0-x0^2.0*x0*36.0*xy^70.0+x0^2.0*x02*54.0*xy^9.0-3.0*xy^3.0-1.0/1.5*xy^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^21.0*2.0/37.0*xy^37.0-x0^2.0*x0*36.0/71.0*xy^71.0+x0^2.0*x02*54.0/10.0*xy^10.0-3.0/4.0*xy^4.0-1.0/1.5/7.0*xy^7.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^21.0*0.05405405405405406*xy^37.0-x0^2.0*x0*0.5070422535211268*xy^71.0+x0^2.0*x02*5.4*xy^10.0-1.0/1.3333333333333333*xy^4.0-1.0/10.5*xy^7.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^21.0*72.0*xy^35.0-x0^2.0*x0*2520.0*xy^69.0+x0^2.0*x02*486.0*xy^8.0-9.0*xy^2.0-4.0*xy^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^21.0*72.0*35.0*xy^34.0-x0^2.0*x0*2520.0*69.0*xy^68.0+x0^2.0*x02*486.0*8.0*xy^7.0-9.0*2.0*xy^1.0-4.0*5.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^21.0*2520.0*xy^34.0-x0^2.0*x0*173880.0*xy^68.0+x0^2.0*x02*3888.0*xy^7.0-18.0*xy-20.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^21.0*0.05405405405405406*xy^37.0-x0^2.0*x0*0.5070422535211268*xy^71.0+x0^2.0*x02*5.4*xy^10.0-1.0/1.3333333333333333*xy^4.0-1.0/10.5*xy^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^21.0*0.05405405405405406/38.0*xy^38.0-x0^2.0*x0*0.5070422535211268/72.0*xy^72.0+x0^2.0*x02*5.4/11.0*xy^11.0-1.0/1.3333333333333333/5.0*xy^5.0-1.0/10.5/8.0*xy^8.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^21.0*0.001422475106685633*xy^38.0-x0^2.0*x0*0.007042253521126761*xy^72.0+x0^2.0*x02/2.0370370370370368*xy^11.0-1.0/6.666666666666666*xy^5.0-1.0/84.0*xy^8.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^21.0*2520.0*xy^34.0-x0^2.0*x0*173880.0*xy^68.0+x0^2.0*x02*3888.0*xy^7.0-18.0*xy-20.0*xy^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^21.0*2520.0*34.0*xy^33.0-x0^2.0*x0*173880.0*68.0*xy^67.0+x0^2.0*x02*3888.0*7.0*xy^6.0-18.0-20.0*4.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^21.0*85680.0*xy^33.0-x0^2.0*x0*1.182384E7*xy^67.0+x0^2.0*x02*27216.0*xy^6.0-18.0-80.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^21.0*0.001422475106685633*xy^38.0-x0^2.0*x0*0.007042253521126761*xy^72.0+x0^2.0*x02/2.0370370370370368*xy^11.0-1.0/6.666666666666666*xy^5.0-1.0/84.0*xy^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^21.0*0.001422475106685633/39.0*xy^39.0-x0^2.0*x0*0.007042253521126761/73.0*xy^73.0+x0^2.0*x02/2.0370370370370368/12.0*xy^12.0-1.0/6.666666666666666/6.0*xy^6.0-1.0/84.0/9.0*xy^9.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^21.0*3.6473720684247E-5*xy^39.0-x0^2.0*x0*9.646922631680494E-5*xy^73.0+x0^2.0*x02/24.444444444444443*xy^12.0-1.0/40.0*xy^6.0-1.0/756.0*xy^9.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^21.0*85680.0*xy^33.0-x0^2.0*x0*1.182384E7*xy^67.0+x0^2.0*x02*27216.0*xy^6.0-18.0-80.0*xy^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^21.0*85680.0*33.0*xy^32.0-x0^2.0*x0*1.182384E7*67.0*xy^66.0+x0^2.0*x02*27216.0*6.0*xy^5.0-18.0*0.0-80.0*3.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^21.0*2827440.0*xy^32.0-x0^2.0*x0*7.9219728E8*xy^66.0+x0^2.0*x02*163296.0*xy^5.0-240.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^21.0*3.6473720684247E-5*xy^39.0-5.0*xy^39.0-x0^2.0*x0*9.646922631680494E-5*xy^73.0-5.0*xy^73.0+x0^2.0*x02/24.444444444444443*xy^12.0-1.0/40.0*xy^6.0-1.0/756.0*xy^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^21.0*3.6473720684247E-5/40.0*xy^40.0-5.0/40.0*xy^40.0-x0^2.0*x0*9.646922631680494E-5/74.0*xy^74.0-5.0/74.0*xy^74.0+x0^2.0*x02/24.444444444444443/13.0*xy^13.0-1.0/40.0/7.0*xy^7.0-1.0/756.0/10.0*xy^10.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^21.0/1096680.0*xy^40.0-1.0/8.0*xy^40.0-0.125*xy^40.0-x0^2.0*x0/767084.0*xy^74.0-1.0/14.8*xy^74.0-0.06756756756756757*xy^74.0+x0^2.0*x02/317.77777777777777*xy^13.0-1.0/280.0*xy^7.0-1.0/7560.0*xy^10.0";
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

public static void TestCaseDiff121219() {
 UsageCalculus.TestCase = 121219;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xyz/3*xyz^2*-1*xyz^3*-3*xyz3*x0^21*xyz^3*-3*xyz-3*xyz/1*xyz^2*-2*xyz^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyz^33*xyz/-1*xyz^2-1*x0^2*-2*x0^3*3*x02*xyz^3*3*xyz/1*xyz^2*--3*xyz^33*xyz1*x0^2*--3*x0^32*xyz/3*xyz^23*x0^2*-1*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=218 EqnNumber=21 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[2, 21, 11, 12, 3, 1, 2, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 5, 3, 1, 16, 3, 1, 2, 3, 16, 3, 4, 14, 3, 32, 1, 2, 11]"+
"// DOEMatrixRow=[33, 23, 13, 4, 2, 3, 1, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 23, 2, 1, 2, 4, 2, 3, 6, 4, 2, 3, 2, 8, 1, 4, 1]"+
//Tail EqnIndex=218 EqnNumber=21 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[2, 21, 11, 12, 3, 1, 2, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 5, 3, 1, 16, 3, 1, 2, 3, 16, 3, 4, 14, 3, 32, 1, 2, 11]"+
"// DOEMatrixRow=[33, 23, 13, 4, 2, 3, 1, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 23, 2, 1, 2, 4, 2, 3, 6, 4, 2, 3, 2, 8, 1, 4, 1]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^21.0*6.0*xyz^10.0-x0^2.0*x0*36.0*xyz^70.0+x0^2.0*54.0*xyz^63.0-x0^2.0*3.0*xyz^57.0+x0^32.0*xyz^24.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^21.0*6.0*10.0*xyz^9.0-x0^2.0*x0*36.0*70.0*xyz^69.0+x0^2.0*54.0*63.0*xyz^62.0-x0^2.0*3.0*57.0*xyz^56.0+x0^32.0*24.0*xyz^23.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^21.0*60.0*xyz^9.0-x0^2.0*x0*2520.0*xyz^69.0+x0^2.0*3402.0*xyz^62.0-x0^2.0*171.0*xyz^56.0+x0^32.0*24.0*xyz^23.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^21.0*6.0*xyz^10.0-x0^2.0*x0*36.0*xyz^70.0+x0^2.0*54.0*xyz^63.0-x0^2.0*3.0*xyz^57.0+x0^32.0*xyz^24.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^21.0*6.0/11.0*xyz^11.0-x0^2.0*x0*36.0/71.0*xyz^71.0+x0^2.0*54.0/64.0*xyz^64.0-x0^2.0*3.0/58.0*xyz^58.0+x0^32.0/25.0*xyz^25.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^21.0*0.5454545454545454*xyz^11.0-x0^2.0*x0*0.5070422535211268*xyz^71.0+x0^2.0*0.84375*xyz^64.0-x0^2.0*0.05172413793103448*xyz^58.0+x0^32.0/25.0*xyz^25.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^21.0*60.0*xyz^9.0-x0^2.0*x0*2520.0*xyz^69.0+x0^2.0*3402.0*xyz^62.0-x0^2.0*171.0*xyz^56.0+x0^32.0*24.0*xyz^23.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^21.0*60.0*9.0*xyz^8.0-x0^2.0*x0*2520.0*69.0*xyz^68.0+x0^2.0*3402.0*62.0*xyz^61.0-x0^2.0*171.0*56.0*xyz^55.0+x0^32.0*24.0*23.0*xyz^22.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^21.0*540.0*xyz^8.0-x0^2.0*x0*173880.0*xyz^68.0+x0^2.0*210924.0*xyz^61.0-x0^2.0*9576.0*xyz^55.0+x0^32.0*552.0*xyz^22.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^21.0*0.5454545454545454*xyz^11.0-x0^2.0*x0*0.5070422535211268*xyz^71.0+x0^2.0*0.84375*xyz^64.0-x0^2.0*0.05172413793103448*xyz^58.0+x0^32.0/25.0*xyz^25.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^21.0*0.5454545454545454/12.0*xyz^12.0-x0^2.0*x0*0.5070422535211268/72.0*xyz^72.0+x0^2.0*0.84375/65.0*xyz^65.0-x0^2.0*0.05172413793103448/59.0*xyz^59.0+x0^32.0*25.0/26.0*xyz^26.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^21.0*0.04545454545454545*xyz^12.0-x0^2.0*x0*0.007042253521126761*xyz^72.0+x0^2.0*0.012980769230769231*xyz^65.0-x0^2.0*8.766803039158387E-4*xyz^59.0+x0^32.0/1.04*xyz^26.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^21.0*540.0*xyz^8.0-x0^2.0*x0*173880.0*xyz^68.0+x0^2.0*210924.0*xyz^61.0-x0^2.0*9576.0*xyz^55.0+x0^32.0*552.0*xyz^22.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^21.0*540.0*8.0*xyz^7.0-x0^2.0*x0*173880.0*68.0*xyz^67.0+x0^2.0*210924.0*61.0*xyz^60.0-x0^2.0*9576.0*55.0*xyz^54.0+x0^32.0*552.0*22.0*xyz^21.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^21.0*4320.0*xyz^7.0-x0^2.0*x0*1.182384E7*xyz^67.0+x0^2.0*1.2866364E7*xyz^60.0-x0^2.0*526680.0*xyz^54.0+x0^32.0*12144.0*xyz^21.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^21.0*0.04545454545454545*xyz^12.0-x0^2.0*x0*0.007042253521126761*xyz^72.0+x0^2.0*0.012980769230769231*xyz^65.0-x0^2.0*8.766803039158387E-4*xyz^59.0-4.0*xyz^59.0+x0^32.0/1.04*xyz^26.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^21.0*0.04545454545454545/13.0*xyz^13.0-x0^2.0*x0*0.007042253521126761/73.0*xyz^73.0+x0^2.0*0.012980769230769231/66.0*xyz^66.0-x0^2.0*8.766803039158387E-4/60.0*xyz^60.0-4.0/60.0*xyz^60.0+x0^32.04/27.0*xyz^27.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^21.0*0.003496503496503496*xyz^13.0-x0^2.0*x0*9.646922631680494E-5*xyz^73.0+x0^2.0*1.966783216783217E-4*xyz^66.0-x0^2.0/68440.0*xyz^60.0-1.0/15.0*xyz^60.0-0.06666666666666667*xyz^60.0+x0^32.04/27.0*xyz^27.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^21.0*4320.0*xyz^7.0-x0^2.0*x0*1.182384E7*xyz^67.0+x0^2.0*1.2866364E7*xyz^60.0-x0^2.0*526680.0*xyz^54.0+x0^32.0*12144.0*xyz^21.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^21.0*4320.0*7.0*xyz^6.0-x0^2.0*x0*1.182384E7*67.0*xyz^66.0+x0^2.0*1.2866364E7*60.0*xyz^59.0-x0^2.0*526680.0*54.0*xyz^53.0+x0^32.0*12144.0*21.0*xyz^20.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^21.0*30240.0*xyz^6.0-x0^2.0*x0*7.9219728E8*xyz^66.0+x0^2.0*7.7198184E8*xyz^59.0-x0^2.0*2.844072E7*xyz^53.0+x0^32.0*255024.0*xyz^20.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^21.0*0.003496503496503496*xyz^13.0-x0^2.0*x0*9.646922631680494E-5*xyz^73.0-5.0*xyz^73.0+x0^2.0*1.966783216783217E-4*xyz^66.0-4.0*xyz^66.0-x0^2.0/68440.0*xyz^60.0-1.0/15.0*xyz^60.0-0.06666666666666667*xyz^60.0+x0^32.04/27.0*xyz^27.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^21.0*0.003496503496503496/14.0*xyz^14.0-x0^2.0*x0*9.646922631680494E-5/74.0*xyz^74.0-5.0/74.0*xyz^74.0+x0^2.0*1.966783216783217E-4/67.0*xyz^67.0-4.0/67.0*xyz^67.0-x0^2.0/68440.0/61.0*xyz^61.0-1.0/15.0/61.0*xyz^61.0-0.06666666666666667/61.0*xyz^61.0+x0^32.04*27.0/28.0*xyz^28.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^21.0*2.497502497502497E-4*xyz^14.0-x0^2.0*x0/767084.0*xyz^74.0-1.0/14.8*xyz^74.0-0.06756756756756757*xyz^74.0+x0^2.0/340657.77777777775*xyz^67.0-1.0/16.75*xyz^67.0-0.05970149253731343*xyz^67.0-x0^2.0/4174840.0*xyz^61.0-1.0/915.0*xyz^61.0-0.001092896174863388*xyz^61.0+x0^32.04/1.037037037037037*xyz^28.0";
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

public static void TestCaseDiff121220() {
 UsageCalculus.TestCase = 121220;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*x0^21*xyza^3*-3*xyza-3*xyza/1*xyza^2*-2*xyza^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyza^33*xyza/-1*xyza^2-1*x0^2*-2*x0^3*3*x02*xyza^3*3*xyza/1*xyza^2*--3*xyza^33*xyza1*x0^2*--3*x0^3-3*xyza^3*1*xyza/2*xyza^21*xyza/2*xyza^2*-3*xyza^3*-1*xyza3*x0^2*-1*x0^31*xyza^3*-3*xyza";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=219 EqnNumber=22 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[67, 22, 12, 13, 4, 2, 3, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 1, 1, 2, 1, 1, 2, 3, 4, 1, 1, 1, 15, 4, 1, 2, 3, 12]"+
"// DOEMatrixRow=[100, 24, 14, 1, 3, 1, 2, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 24, 3, 2, 3, 5, 3, 1, 1, 1, 3, 1, 3, 9, 2, 5, 2]"+
//Tail EqnIndex=219 EqnNumber=22 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[67, 22, 12, 13, 4, 2, 3, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 1, 1, 2, 1, 1, 2, 3, 4, 1, 1, 1, 15, 4, 1, 2, 3, 12]"+
"// DOEMatrixRow=[100, 24, 14, 1, 3, 1, 2, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 24, 3, 2, 3, 5, 3, 1, 1, 1, 3, 1, 3, 9, 2, 5, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^21.0*9.0*xyza^4.0-x0^2.0*x0*36.0*xyza^70.0+x0^2.0*162.0*xyza^39.0-x0^2.0*9.0*xyza^33.0-x0^3.0*3.0-x0^2.0*6.75*xyza^35.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^21.0*9.0*4.0*xyza^3.0-x0^2.0*x0*36.0*70.0*xyza^69.0+x0^2.0*162.0*39.0*xyza^38.0-x0^2.0*9.0*33.0*xyza^32.0-x0^3.0*3.0*0.0-x0^2.0*6.75*35.0*xyza^34.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^21.0*36.0*xyza^3.0-x0^2.0*x0*2520.0*xyza^69.0+x0^2.0*6318.0*xyza^38.0-x0^2.0*297.0*xyza^32.0-x0^3.0*0.0-x0^2.0*236.25*xyza^34.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^21.0*9.0*xyza^4.0-x0^2.0*x0*36.0*xyza^70.0+x0^2.0*162.0*xyza^39.0-x0^2.0*9.0*xyza^33.0-x0^3.0*3.0-x0^2.0*6.75*xyza^35.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^21.0*9.0/5.0*xyza^5.0-x0^2.0*x0*36.0/71.0*xyza^71.0+x0^2.0*162.0/40.0*xyza^40.0-x0^2.0*9.0/34.0*xyza^34.0-x0^3.0*xyza-x0^2.0*6.75/36.0*xyza^36.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^21.0*1.8*xyza^5.0-x0^2.0*x0*0.5070422535211268*xyza^71.0+x0^2.0*4.05*xyza^40.0-x0^2.0*0.2647058823529412*xyza^34.0-x0^3.0*xyza-x0^2.0/5.333333333333333*xyza^36.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^21.0*36.0*xyza^3.0-x0^2.0*x0*2520.0*xyza^69.0+x0^2.0*6318.0*xyza^38.0-x0^2.0*297.0*xyza^32.0-x0^3.0*0.0-x0^2.0*236.25*xyza^34.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^21.0*36.0*3.0*xyza^2.0-x0^2.0*x0*2520.0*69.0*xyza^68.0+x0^2.0*6318.0*38.0*xyza^37.0-x0^2.0*297.0*32.0*xyza^31.0-x0^3.0*0.0*0.0-x0^2.0*236.25*34.0*xyza^33.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^21.0*108.0*xyza^2.0-x0^2.0*x0*173880.0*xyza^68.0+x0^2.0*240084.0*xyza^37.0-x0^2.0*9504.0*xyza^31.0-x0^3.0*0.0-x0^2.0*8032.5*xyza^33.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^21.0*1.8*xyza^5.0-x0^2.0*x0*0.5070422535211268*xyza^71.0+x0^2.0*4.05*xyza^40.0-x0^2.0*0.2647058823529412*xyza^34.0-x0^3.0*xyza-x0^2.0/5.333333333333333*xyza^36.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^21.0*1.8/6.0*xyza^6.0-x0^2.0*x0*0.5070422535211268/72.0*xyza^72.0+x0^2.0*4.05/41.0*xyza^41.0-x0^2.0*0.2647058823529412/35.0*xyza^35.0-x0^3.0/2.0*xyza^2.0-x0^2.0*5.333333333333333/37.0*xyza^37.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^21.0*0.3*xyza^6.0-x0^2.0*x0*0.007042253521126761*xyza^72.0+x0^2.0*0.09878048780487804*xyza^41.0-x0^2.0*0.007563025210084034*xyza^35.0-x0^3.0/2.0*xyza^2.0-x0^2.0/6.9375*xyza^37.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^21.0*108.0*xyza^2.0-x0^2.0*x0*173880.0*xyza^68.0+x0^2.0*240084.0*xyza^37.0-x0^2.0*9504.0*xyza^31.0-x0^3.0*0.0-x0^2.0*8032.5*xyza^33.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^21.0*108.0*2.0*xyza^1.0-x0^2.0*x0*173880.0*68.0*xyza^67.0+x0^2.0*240084.0*37.0*xyza^36.0-x0^2.0*9504.0*31.0*xyza^30.0-x0^3.0*0.0*0.0-x0^2.0*8032.5*33.0*xyza^32.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^21.0*216.0*xyza-x0^2.0*x0*1.182384E7*xyza^67.0+x0^2.0*8883108.0*xyza^36.0-x0^2.0*294624.0*xyza^30.0-x0^3.0*0.0-x0^2.0*265072.5*xyza^32.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^21.0*0.3*xyza^6.0-x0^2.0*x0*0.007042253521126761*xyza^72.0+x0^2.0*0.09878048780487804*xyza^41.0-x0^2.0*0.007563025210084034*xyza^35.0-x0^3.0/2.0*xyza^2.0-x0^2.0/6.9375*xyza^37.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^21.0*0.3/7.0*xyza^7.0-x0^2.0*x0*0.007042253521126761/73.0*xyza^73.0+x0^2.0*0.09878048780487804/42.0*xyza^42.0-x0^2.0*0.007563025210084034/36.0*xyza^36.0-x0^3.0/2.0/3.0*xyza^3.0-x0^2.0*6.9375/38.0*xyza^38.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^21.0*0.04285714285714286*xyza^7.0-x0^2.0*x0*9.646922631680494E-5*xyza^73.0+x0^2.0*0.00235191637630662*xyza^42.0-x0^2.0*2.100840336134454E-4*xyza^36.0-x0^3.0*0.16666666666666666*xyza^3.0-x0^2.0/5.4774774774774775*xyza^38.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^21.0*216.0*xyza-x0^2.0*x0*1.182384E7*xyza^67.0+x0^2.0*8883108.0*xyza^36.0-x0^2.0*294624.0*xyza^30.0-x0^3.0*0.0-x0^2.0*265072.5*xyza^32.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^21.0*216.0-x0^2.0*x0*1.182384E7*67.0*xyza^66.0+x0^2.0*8883108.0*36.0*xyza^35.0-x0^2.0*294624.0*30.0*xyza^29.0-x0^3.0*0.0*0.0-x0^2.0*265072.5*32.0*xyza^31.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^21.0*216.0-x0^2.0*x0*7.9219728E8*xyza^66.0+x0^2.0*3.19791888E8*xyza^35.0-x0^2.0*8838720.0*xyza^29.0-x0^3.0*0.0-x0^2.0*8482320.0*xyza^31.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^21.0*0.04285714285714286*xyza^7.0-x0^2.0*x0*9.646922631680494E-5*xyza^73.0-5.0*xyza^73.0+x0^2.0*0.00235191637630662*xyza^42.0-x0^2.0*2.100840336134454E-4*xyza^36.0-4.0*xyza^36.0-x0^3.0*0.16666666666666666*xyza^3.0-x0^2.0/5.4774774774774775*xyza^38.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^21.0*0.04285714285714286/8.0*xyza^8.0-x0^2.0*x0*9.646922631680494E-5/74.0*xyza^74.0-5.0/74.0*xyza^74.0+x0^2.0*0.00235191637630662/43.0*xyza^43.0-x0^2.0*2.100840336134454E-4/37.0*xyza^37.0-4.0/37.0*xyza^37.0-x0^3.0*0.16666666666666666/4.0*xyza^4.0-x0^2.0*5.4774774774774775/39.0*xyza^39.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^21.0*0.005357142857142857*xyza^8.0-x0^2.0*x0/767084.0*xyza^74.0-1.0/14.8*xyza^74.0-0.06756756756756757*xyza^74.0+x0^2.0*5.46957296815493E-5*xyza^43.0-x0^2.0/176120.0*xyza^37.0-1.0/9.25*xyza^37.0-0.10810810810810811*xyza^37.0-x0^3.0*0.041666666666666664*xyza^4.0-x0^2.0/7.120065789473684*xyza^39.0";
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

public static void TestCaseDiff121221() {
 UsageCalculus.TestCase = 121221;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x^3*-3*x-3*x/1*x^2*-2*x^31*x0^2*-2*x0^3*3*x0/-1*x0^22*x^33*x/-1*x^2-1*x0^2*-2*x0^3*3*x02*x^3*3*x/1*x^2*--3*x^33*x1*x0^2*--3*x0^3-3*x^3*1*x/2*x^21*x/2*x^2*-3*x^3*-1*x2*x0^23*x^3*-1*x1*x^3*-3*x-3*x/1*x^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=220 EqnNumber=23 FamilyID=1 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[31, 23, 13, 14, 1, 3, 1, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 1, 2, 3, 2, 16, 1, 2, 3, 4, 13]"+
"// DOEMatrixRow=[61, 25, 15, 2, 1, 2, 3, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 25, 4, 3, 1, 1, 1, 2, 3, 2, 1, 2, 4, 10, 1, 6, 3]"+
//Tail EqnIndex=220 EqnNumber=23 FamilyID=1 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[31, 23, 13, 14, 1, 3, 1, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 1, 2, 3, 2, 16, 1, 2, 3, 4, 13]"+
"// DOEMatrixRow=[61, 25, 15, 2, 1, 2, 3, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 25, 4, 3, 1, 1, 1, 2, 3, 2, 1, 2, 4, 10, 1, 6, 3]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-3.0*x^4.0-36.0*x^70.0+162.0*x^39.0-9.0*x^33.0-3.0-6.75*x^38.0-3.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-3.0*4.0*x^3.0-36.0*70.0*x^69.0+162.0*39.0*x^38.0-9.0*33.0*x^32.0-3.0*0.0-6.75*38.0*x^37.0-3.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-12.0*x^3.0-2520.0*x^69.0+6318.0*x^38.0-297.0*x^32.0-256.5*x^37.0-9.0*x^2.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-3.0*x^4.0-36.0*x^70.0+162.0*x^39.0-9.0*x^33.0-3.0-6.75*x^38.0-3.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-3.0/5.0*x^5.0-36.0/71.0*x^71.0+162.0/40.0*x^40.0-9.0/34.0*x^34.0-3.0*x-6.75/39.0*x^39.0-3.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/1.6666666666666667*x^5.0-1.0/1.9722222222222223*x^71.0+4.05*x^40.0-1.0/3.7777777777777777*x^34.0-3.0*x-1.0/5.777777777777778*x^39.0-1.0/1.3333333333333333*x^4.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-12.0*x^3.0-2520.0*x^69.0+6318.0*x^38.0-297.0*x^32.0-256.5*x^37.0-9.0*x^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-12.0*3.0*x^2.0-2520.0*69.0*x^68.0+6318.0*38.0*x^37.0-297.0*32.0*x^31.0-256.5*37.0*x^36.0-9.0*2.0*x^1.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-36.0*x^2.0-173880.0*x^68.0+240084.0*x^37.0-9504.0*x^31.0-9490.5*x^36.0-18.0*x";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/1.6666666666666667*x^5.0-1.0/1.9722222222222223*x^71.0+4.05*x^40.0-1.0/3.7777777777777777*x^34.0-3.0*x-1.0/5.777777777777778*x^39.0-1.0/1.3333333333333333*x^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/1.6666666666666667/6.0*x^6.0-1.0/1.9722222222222223/72.0*x^72.0+4.05/41.0*x^41.0-1.0/3.7777777777777777/35.0*x^35.0-3.0/2.0*x^2.0-1.0/5.777777777777778/40.0*x^40.0-1.0/1.3333333333333333/5.0*x^5.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/10.0*x^6.0-1.0/142.0*x^72.0+1.0/10.123456790123457*x^41.0-1.0/132.22222222222223*x^35.0-1.5*x^2.0-1.0/231.11111111111111*x^40.0-1.0/6.666666666666666*x^5.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-36.0*x^2.0-173880.0*x^68.0+240084.0*x^37.0-9504.0*x^31.0-9490.5*x^36.0-18.0*x";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-36.0*2.0*x^1.0-173880.0*68.0*x^67.0+240084.0*37.0*x^36.0-9504.0*31.0*x^30.0-9490.5*36.0*x^35.0-18.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-72.0*x-1.182384E7*x^67.0+8883108.0*x^36.0-294624.0*x^30.0-341658.0*x^35.0-18.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/10.0*x^6.0-1.0/142.0*x^72.0+1.0/10.123456790123457*x^41.0-1.0/132.22222222222223*x^35.0-1.5*x^2.0-1.0/231.11111111111111*x^40.0-1.0/6.666666666666666*x^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/10.0/7.0*x^7.0-1.0/142.0/73.0*x^73.0+1.0/10.123456790123457/42.0*x^42.0-1.0/132.22222222222223/36.0*x^36.0-1.5/3.0*x^3.0-1.0/231.11111111111111/41.0*x^41.0-1.0/6.666666666666666/6.0*x^6.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/70.0*x^7.0-1.0/10366.0*x^73.0+1.0/425.1851851851852*x^42.0-1.0/4760.0*x^36.0-1.0/2.0*x^3.0-1.0/9475.555555555557*x^41.0-1.0/40.0*x^6.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-72.0*x-1.182384E7*x^67.0+8883108.0*x^36.0-294624.0*x^30.0-341658.0*x^35.0-18.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-72.0-67.0*x^66.0+8883108.0*36.0*x^35.0-294624.0*30.0*x^29.0-341658.0*35.0*x^34.0-18.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-72.0-67.0*x^66.0+3.19791888E8*x^35.0-8838720.0*x^29.0-1.195803E7*x^34.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/70.0*x^7.0-1.0/10366.0*x^73.0+1.0/425.1851851851852*x^42.0-1.0/4760.0*x^36.0-1.0/2.0*x^3.0-1.0/9475.555555555557*x^41.0-1.0/40.0*x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/70.0/8.0*x^8.0-1.0/10366.0/74.0*x^74.0+1.0/425.1851851851852/43.0*x^43.0-1.0/4760.0/37.0*x^37.0-1.0/2.0/4.0*x^4.0-1.0/9475.555555555557/42.0*x^42.0-1.0/40.0/7.0*x^7.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/560.0*x^8.0-1.0/767084.0*x^74.0+1.0/18282.962962962964*x^43.0-1.0/176120.0*x^37.0-1.0/8.0*x^4.0-1.0/397973.3333333334*x^42.0-1.0/280.0*x^7.0";
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

public static void TestCaseDiff121222() {
 UsageCalculus.TestCase = 121222;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xy/1*xy^2*-2*xy^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xy^33*xy/-1*xy^2-1*x0^2*-2*x0^3*3*x02*xy^3*3*xy/1*xy^2*--3*xy^33*xy1*x0^2*--3*x0^3-3*xy^3*1*xy/2*xy^21*xy/2*xy^2*-3*xy^3*-1*xy2*x0^23*xy^3*-1*xy-1*xy/2*xy^2*-3*xy2*x0^2*-3*x0*1*x0^2/-3*x0-3*xy/1*xy^21*x0^2*-2*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=221 EqnNumber=24 FamilyID=3 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[98, 24, 14, 15, 2, 1, 2, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 3, 4, 3, 1, 2, 3, 2, 3, 1, 3, 1, 2, 3, 4, 5, 14]"+
"// DOEMatrixRow=[28, 26, 16, 3, 2, 3, 1, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 26, 5, 1, 2, 3, 2, 3, 4, 3, 2, 3, 1, 11, 2, 7, 4]"+
//Tail EqnIndex=221 EqnNumber=24 FamilyID=3 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[98, 24, 14, 15, 2, 1, 2, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 3, 4, 3, 1, 2, 3, 2, 3, 1, 3, 1, 2, 3, 4, 5, 14]"+
"// DOEMatrixRow=[28, 26, 16, 3, 2, 3, 1, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 26, 5, 1, 2, 3, 2, 3, 4, 3, 2, 3, 1, 11, 2, 7, 4]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^2.0*x0*36.0*xy^70.0+x0^2.0*162.0*xy^39.0-x0^2.0*9.0*xy^33.0-x0^3.0*3.0+x0^23.0*2.25*xy^35.0+x0^2.0*x0*x0*1.5*xy^3.0+x0^2.0*6.0*xy^22.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^2.0*x0*36.0*70.0*xy^69.0+x0^2.0*162.0*39.0*xy^38.0-x0^2.0*9.0*33.0*xy^32.0-x0^3.0*3.0*0.0+x0^23.0*2.25*35.0*xy^34.0+x0^2.0*x0*x0*1.5*3.0*xy^2.0+x0^2.0*6.0*22.0*xy^21.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^2.0*x0*2520.0*xy^69.0+x0^2.0*6318.0*xy^38.0-x0^2.0*297.0*xy^32.0-x0^3.0*0.0+x0^23.0*78.75*xy^34.0+x0^2.0*x0*x0*4.5*xy^2.0+x0^2.0*132.0*xy^21.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^2.0*x0*36.0*xy^70.0+x0^2.0*162.0*xy^39.0-x0^2.0*9.0*xy^33.0-x0^3.0*3.0+x0^23.0*2.25*xy^35.0+x0^2.0*x0*x0*1.5*xy^3.0+x0^2.0*6.0*xy^22.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^2.0*x0*36.0/71.0*xy^71.0+x0^2.0*162.0/40.0*xy^40.0-x0^2.0*9.0/34.0*xy^34.0-x0^3.0*xy+x0^23.0*2.25/36.0*xy^36.0+x0^2.0*x0*x0*1.5/4.0*xy^4.0+x0^2.0*6.0/23.0*xy^23.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^2.0*x0*0.5070422535211268*xy^71.0+x0^2.0*4.05*xy^40.0-x0^2.0*0.2647058823529412*xy^34.0-x0^3.0*xy+x0^23.0*0.0625*xy^36.0+x0^2.0*x0*x0*0.375*xy^4.0+x0^2.0/3.8333333333333335*xy^23.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^2.0*x0*2520.0*xy^69.0+x0^2.0*6318.0*xy^38.0-x0^2.0*297.0*xy^32.0-x0^3.0*0.0+x0^23.0*78.75*xy^34.0+x0^2.0*x0*x0*4.5*xy^2.0+x0^2.0*132.0*xy^21.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^2.0*x0*2520.0*69.0*xy^68.0+x0^2.0*6318.0*38.0*xy^37.0-x0^2.0*297.0*32.0*xy^31.0-x0^3.0*0.0*0.0+x0^23.0*78.75*34.0*xy^33.0+x0^2.0*x0*x0*4.5*2.0*xy^1.0+x0^2.0*132.0*21.0*xy^20.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^2.0*x0*173880.0*xy^68.0+x0^2.0*240084.0*xy^37.0-x0^2.0*9504.0*xy^31.0-x0^3.0*0.0+x0^23.0*2677.5*xy^33.0+x0^2.0*x0*x0*9.0*xy+x0^2.0*2772.0*xy^20.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^2.0*x0*0.5070422535211268*xy^71.0+x0^2.0*4.05*xy^40.0-x0^2.0*0.2647058823529412*xy^34.0-x0^3.0*xy+x0^23.0*0.0625*xy^36.0+x0^2.0*x0*x0*0.375*xy^4.0+x0^2.0/3.8333333333333335*xy^23.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^2.0*x0*0.5070422535211268/72.0*xy^72.0+x0^2.0*4.05/41.0*xy^41.0-x0^2.0*0.2647058823529412/35.0*xy^35.0-x0^3.0/2.0*xy^2.0+x0^23.0*0.0625/37.0*xy^37.0+x0^2.0*x0*x0*0.375/5.0*xy^5.0+x0^2.0*3.8333333333333335/24.0*xy^24.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^2.0*x0*0.007042253521126761*xy^72.0+x0^2.0*0.09878048780487804*xy^41.0-x0^2.0*0.007563025210084034*xy^35.0-x0^3.0/2.0*xy^2.0+x0^23.0*0.0016891891891891893*xy^37.0+x0^2.0*x0*x0*0.075*xy^5.0+x0^2.0/6.260869565217391*xy^24.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^2.0*x0*173880.0*xy^68.0+x0^2.0*240084.0*xy^37.0-x0^2.0*9504.0*xy^31.0-x0^3.0*0.0+x0^23.0*2677.5*xy^33.0+x0^2.0*x0*x0*9.0*xy+x0^2.0*2772.0*xy^20.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^2.0*x0*173880.0*68.0*xy^67.0+x0^2.0*240084.0*37.0*xy^36.0-x0^2.0*9504.0*31.0*xy^30.0-x0^3.0*0.0*0.0+x0^23.0*2677.5*33.0*xy^32.0+x0^2.0*x0*x0*9.0+x0^2.0*2772.0*20.0*xy^19.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^2.0*x0*1.182384E7*xy^67.0+x0^2.0*8883108.0*xy^36.0-x0^2.0*294624.0*xy^30.0-x0^3.0*0.0+x0^23.0*88357.5*xy^32.0+x0^2.0*x0*x0*9.0+x0^2.0*55440.0*xy^19.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^2.0*x0*0.007042253521126761*xy^72.0+x0^2.0*0.09878048780487804*xy^41.0-x0^2.0*0.007563025210084034*xy^35.0-x0^3.0/2.0*xy^2.0+x0^23.0*0.0016891891891891893*xy^37.0+x0^2.0*x0*x0*0.075*xy^5.0+x0^2.0/6.260869565217391*xy^24.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^2.0*x0*0.007042253521126761/73.0*xy^73.0+x0^2.0*0.09878048780487804/42.0*xy^42.0-x0^2.0*0.007563025210084034/36.0*xy^36.0-x0^3.0/2.0/3.0*xy^3.0+x0^23.0*0.0016891891891891893/38.0*xy^38.0+x0^2.0*x0*x0*0.075/6.0*xy^6.0+x0^2.0*6.260869565217391/25.0*xy^25.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^2.0*x0*9.646922631680494E-5*xy^73.0+x0^2.0*0.00235191637630662*xy^42.0-x0^2.0*2.100840336134454E-4*xy^36.0-x0^3.0*0.16666666666666666*xy^3.0+x0^23.0*4.4452347083926033E-5*xy^38.0+x0^2.0*x0*x0*0.012499999999999999*xy^6.0+x0^2.0/3.993055555555556*xy^25.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^2.0*x0*1.182384E7*xy^67.0+x0^2.0*8883108.0*xy^36.0-x0^2.0*294624.0*xy^30.0-x0^3.0*0.0+x0^23.0*88357.5*xy^32.0+x0^2.0*x0*x0*9.0+x0^2.0*55440.0*xy^19.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^2.0*x0*1.182384E7*67.0*xy^66.0+x0^2.0*8883108.0*36.0*xy^35.0-x0^2.0*294624.0*30.0*xy^29.0-x0^3.0*0.0*0.0+x0^23.0*88357.5*32.0*xy^31.0+x0^2.0*x0*x0*9.0*0.0+x0^2.0*55440.0*19.0*xy^18.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^2.0*x0*7.9219728E8*xy^66.0+x0^2.0*3.19791888E8*xy^35.0-x0^2.0*8838720.0*xy^29.0-x0^3.0*0.0+x0^23.0*2827440.0*xy^31.0+x0^2.0*x0*x0*0.0+x0^2.0*1053360.0*xy^18.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^2.0*x0*9.646922631680494E-5*xy^73.0-5.0*xy^73.0+x0^2.0*0.00235191637630662*xy^42.0-x0^2.0*2.100840336134454E-4*xy^36.0-4.0*xy^36.0-x0^3.0*0.16666666666666666*xy^3.0+x0^23.0*4.4452347083926033E-5*xy^38.0-5.0*xy^38.0+x0^2.0*x0*x0*0.012499999999999999*xy^6.0+x0^2.0/3.993055555555556*xy^25.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^2.0*x0*9.646922631680494E-5/74.0*xy^74.0-5.0/74.0*xy^74.0+x0^2.0*0.00235191637630662/43.0*xy^43.0-x0^2.0*2.100840336134454E-4/37.0*xy^37.0-4.0/37.0*xy^37.0-x0^3.0*0.16666666666666666/4.0*xy^4.0+x0^23.0*4.4452347083926033E-5/39.0*xy^39.0-5.0/39.0*xy^39.0+x0^2.0*x0*x0*0.012499999999999999/7.0*xy^7.0+x0^2.0*3.993055555555556/26.0*xy^26.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^2.0*x0/767084.0*xy^74.0-1.0/14.8*xy^74.0-0.06756756756756757*xy^74.0+x0^2.0*5.46957296815493E-5*xy^43.0-x0^2.0/176120.0*xy^37.0-1.0/9.25*xy^37.0-0.10810810810810811*xy^37.0-x0^3.0*0.041666666666666664*xy^4.0+x0^23.0/877344.0*xy^39.0-1.0/7.8*xy^39.0-0.1282051282051282*xy^39.0+x0^2.0*x0*x0*0.0017857142857142857*xy^7.0+x0^2.0/6.511304347826086*xy^26.0";
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

public static void TestCaseDiff121223() {
 UsageCalculus.TestCase = 121223;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x0^2*-2*x0^3*3*x0/-1*x0^22*xyz^33*xyz/-1*xyz^2-1*x0^2*-2*x0^3*3*x02*xyz^3*3*xyz/1*xyz^2*--3*xyz^33*xyz1*x0^2*--3*x0^3-3*xyz^3*1*xyz/2*xyz^21*xyz/2*xyz^2*-3*xyz^3*-1*xyz2*x0^23*xyz^3*-1*xyz-1*xyz/2*xyz^2*-3*xyz2*x0^2*-3*x0*1*x0^2/-3*x03*xyz1*xyz^2/-3*xyz1*x0^2*-2*x0^32*xyz^3*3*xyz";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=222 EqnNumber=25 FamilyID=1 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[62, 25, 15, 16, 3, 2, 3, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 1, 1, 4, 2, 3, 1, 3, 4, 2, 4, 2, 3, 4, 5, 6, 15]"+
"// DOEMatrixRow=[94, 27, 17, 4, 3, 1, 2, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 27, 6, 2, 3, 4, 3, 1, 5, 4, 3, 1, 2, 12, 1, 8, 5]"+
//Tail EqnIndex=222 EqnNumber=25 FamilyID=1 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[62, 25, 15, 16, 3, 2, 3, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 1, 1, 4, 2, 3, 1, 3, 4, 2, 4, 2, 3, 4, 5, 6, 15]"+
"// DOEMatrixRow=[94, 27, 17, 4, 3, 1, 2, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 27, 6, 2, 3, 4, 3, 1, 5, 4, 3, 1, 2, 12, 1, 8, 5]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^2.0*x0*6.0*xyz^36.0+x0^2.0*162.0*xyz^39.0-x0^2.0*9.0*xyz^33.0-x0^3.0*3.0+x0^23.0*2.25*xyz^35.0+x0^2.0*3.0*xyz^9.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^2.0*x0*6.0*36.0*xyz^35.0+x0^2.0*162.0*39.0*xyz^38.0-x0^2.0*9.0*33.0*xyz^32.0-x0^3.0*3.0*0.0+x0^23.0*2.25*35.0*xyz^34.0+x0^2.0*3.0*9.0*xyz^8.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^2.0*x0*216.0*xyz^35.0+x0^2.0*6318.0*xyz^38.0-x0^2.0*297.0*xyz^32.0-x0^3.0*0.0+x0^23.0*78.75*xyz^34.0+x0^2.0*27.0*xyz^8.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^2.0*x0*6.0*xyz^36.0+x0^2.0*162.0*xyz^39.0-x0^2.0*9.0*xyz^33.0-x0^3.0*3.0+x0^23.0*2.25*xyz^35.0+x0^2.0*3.0*xyz^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^2.0*x0*6.0/37.0*xyz^37.0+x0^2.0*162.0/40.0*xyz^40.0-x0^2.0*9.0/34.0*xyz^34.0-x0^3.0*xyz+x0^23.0*2.25/36.0*xyz^36.0+x0^2.0*3.0/10.0*xyz^10.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^2.0*x0*0.16216216216216217*xyz^37.0+x0^2.0*4.05*xyz^40.0-x0^2.0*0.2647058823529412*xyz^34.0-x0^3.0*xyz+x0^23.0*0.0625*xyz^36.0+x0^2.0/3.3333333333333335*xyz^10.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^2.0*x0*216.0*xyz^35.0+x0^2.0*6318.0*xyz^38.0-x0^2.0*297.0*xyz^32.0-x0^3.0*0.0+x0^23.0*78.75*xyz^34.0+x0^2.0*27.0*xyz^8.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^2.0*x0*216.0*35.0*xyz^34.0+x0^2.0*6318.0*38.0*xyz^37.0-x0^2.0*297.0*32.0*xyz^31.0-x0^3.0*0.0*0.0+x0^23.0*78.75*34.0*xyz^33.0+x0^2.0*27.0*8.0*xyz^7.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^2.0*x0*7560.0*xyz^34.0+x0^2.0*240084.0*xyz^37.0-x0^2.0*9504.0*xyz^31.0-x0^3.0*0.0+x0^23.0*2677.5*xyz^33.0+x0^2.0*216.0*xyz^7.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^2.0*x0*0.16216216216216217*xyz^37.0+x0^2.0*4.05*xyz^40.0-x0^2.0*0.2647058823529412*xyz^34.0-x0^3.0*xyz+x0^23.0*0.0625*xyz^36.0+x0^2.0/3.3333333333333335*xyz^10.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^2.0*x0*0.16216216216216217/38.0*xyz^38.0+x0^2.0*4.05/41.0*xyz^41.0-x0^2.0*0.2647058823529412/35.0*xyz^35.0-x0^3.0/2.0*xyz^2.0+x0^23.0*0.0625/37.0*xyz^37.0+x0^2.0*3.3333333333333335/11.0*xyz^11.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^2.0*x0*0.004267425320056899*xyz^38.0+x0^2.0*0.09878048780487804*xyz^41.0-x0^2.0*0.007563025210084034*xyz^35.0-x0^3.0/2.0*xyz^2.0+x0^23.0*0.0016891891891891893*xyz^37.0+x0^2.0/3.3*xyz^11.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^2.0*x0*7560.0*xyz^34.0+x0^2.0*240084.0*xyz^37.0-x0^2.0*9504.0*xyz^31.0-x0^3.0*0.0+x0^23.0*2677.5*xyz^33.0+x0^2.0*216.0*xyz^7.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^2.0*x0*7560.0*34.0*xyz^33.0+x0^2.0*240084.0*37.0*xyz^36.0-x0^2.0*9504.0*31.0*xyz^30.0-x0^3.0*0.0*0.0+x0^23.0*2677.5*33.0*xyz^32.0+x0^2.0*216.0*7.0*xyz^6.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^2.0*x0*257040.0*xyz^33.0+x0^2.0*8883108.0*xyz^36.0-x0^2.0*294624.0*xyz^30.0-x0^3.0*0.0+x0^23.0*88357.5*xyz^32.0+x0^2.0*1512.0*xyz^6.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^2.0*x0*0.004267425320056899*xyz^38.0+x0^2.0*0.09878048780487804*xyz^41.0-x0^2.0*0.007563025210084034*xyz^35.0-x0^3.0/2.0*xyz^2.0+x0^23.0*0.0016891891891891893*xyz^37.0+x0^2.0/3.3*xyz^11.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^2.0*x0*0.004267425320056899/39.0*xyz^39.0+x0^2.0*0.09878048780487804/42.0*xyz^42.0-x0^2.0*0.007563025210084034/36.0*xyz^36.0-x0^3.0/2.0/3.0*xyz^3.0+x0^23.0*0.0016891891891891893/38.0*xyz^38.0+x0^2.0*3.3/12.0*xyz^12.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^2.0*x0*1.0942116205274101E-4*xyz^39.0+x0^2.0*0.00235191637630662*xyz^42.0-x0^2.0*2.100840336134454E-4*xyz^36.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^23.0*4.4452347083926033E-5*xyz^38.0+x0^2.0/3.6363636363636367*xyz^12.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^2.0*x0*257040.0*xyz^33.0+x0^2.0*8883108.0*xyz^36.0-x0^2.0*294624.0*xyz^30.0-x0^3.0*0.0+x0^23.0*88357.5*xyz^32.0+x0^2.0*1512.0*xyz^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^2.0*x0*257040.0*33.0*xyz^32.0+x0^2.0*8883108.0*36.0*xyz^35.0-x0^2.0*294624.0*30.0*xyz^29.0-x0^3.0*0.0*0.0+x0^23.0*88357.5*32.0*xyz^31.0+x0^2.0*1512.0*6.0*xyz^5.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^2.0*x0*8482320.0*xyz^32.0+x0^2.0*3.19791888E8*xyz^35.0-x0^2.0*8838720.0*xyz^29.0-x0^3.0*0.0+x0^23.0*2827440.0*xyz^31.0+x0^2.0*9072.0*xyz^5.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^2.0*x0*1.0942116205274101E-4*xyz^39.0-4.0*xyz^39.0+x0^2.0*0.00235191637630662*xyz^42.0-x0^2.0*2.100840336134454E-4*xyz^36.0-4.0*xyz^36.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^23.0*4.4452347083926033E-5*xyz^38.0-5.0*xyz^38.0+x0^2.0/3.6363636363636367*xyz^12.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^2.0*x0*1.0942116205274101E-4/40.0*xyz^40.0-4.0/40.0*xyz^40.0+x0^2.0*0.00235191637630662/43.0*xyz^43.0-x0^2.0*2.100840336134454E-4/37.0*xyz^37.0-4.0/37.0*xyz^37.0-x0^3.0*0.16666666666666666/4.0*xyz^4.0+x0^23.0*4.4452347083926033E-5/39.0*xyz^39.0-5.0/39.0*xyz^39.0+x0^2.0*3.6363636363636367/13.0*xyz^13.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^2.0*x0/365559.99999999994*xyz^40.0-1.0/10.0*xyz^40.0-0.1*xyz^40.0+x0^2.0*5.46957296815493E-5*xyz^43.0-x0^2.0/176120.0*xyz^37.0-1.0/9.25*xyz^37.0-0.10810810810810811*xyz^37.0-x0^3.0*0.041666666666666664*xyz^4.0+x0^23.0/877344.0*xyz^39.0-1.0/7.8*xyz^39.0-0.1282051282051282*xyz^39.0+x0^2.0/3.5749999999999997*xyz^13.0";
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

public static void TestCaseDiff121224() {
 UsageCalculus.TestCase = 121224;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xyza/-1*xyza^2-1*x0^2*-2*x0^3*3*x02*xyza^3*3*xyza/1*xyza^2*--3*xyza^33*xyza1*x0^2*--3*x0^3-3*xyza^3*1*xyza/2*xyza^21*xyza/2*xyza^2*-3*xyza^3*-1*xyza2*x0^23*xyza^3*-1*xyza-1*xyza/2*xyza^2*-3*xyza2*x0^2*-3*x0*1*x0^2/-3*x03*xyza1*xyza^2/-3*xyza-3*xyza*-1*xyza^2*2*xyza1*xy012^2*2*xy012/3*xy012^2*-1*xy0122*xyza3*xyza/-1*xyza^2-1*x0^2*-2*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=223 EqnNumber=27 FamilyID=2 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[26, 27, 16, 17, 4, 3, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 2, 3, 5, 3, 1, 2, 4, 5, 3, 1, 3, 4, 5, 6, 7, 16]"+
"// DOEMatrixRow=[23, 29, 19, 2, 3, 1, 1, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 29, 8, 1, 2, 1, 2, 3, 1, 2, 3, 1, 4, 14, 1, 10, 7]"+
//Tail EqnIndex=223 EqnNumber=27 FamilyID=2 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[26, 27, 16, 17, 4, 3, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 2, 3, 5, 3, 1, 2, 4, 5, 3, 1, 3, 4, 5, 6, 7, 16]"+
"// DOEMatrixRow=[23, 29, 19, 2, 3, 1, 1, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 29, 8, 1, 2, 1, 2, 3, 1, 2, 3, 1, 4, 14, 1, 10, 7]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-3.0*xyza^3.0+x0^2.0*162.0*xyza^39.0-x0^2.0*9.0*xyza^33.0-x0^3.0*3.0+x0^23.0*2.25*xyza^35.0-1.0/2.0*xyza^6.0+4.0*xyza^6.0+x0^2.0*2.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-3.0*3.0*xyza^2.0+x0^2.0*162.0*39.0*xyza^38.0-x0^2.0*9.0*33.0*xyza^32.0-x0^3.0*3.0*0.0+x0^23.0*2.25*35.0*xyza^34.0-1.0/2.0*6.0*xyza^5.0+4.0*6.0*xyza^5.0+x0^2.0*2.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-9.0*xyza^2.0+x0^2.0*6318.0*xyza^38.0-x0^2.0*297.0*xyza^32.0-x0^3.0*0.0+x0^23.0*78.75*xyza^34.0-3.0*xyza^5.0+24.0*xyza^5.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-3.0*xyza^3.0+x0^2.0*162.0*xyza^39.0-x0^2.0*9.0*xyza^33.0-x0^3.0*3.0+x0^23.0*2.25*xyza^35.0-1.0/2.0*xyza^6.0+4.0*xyza^6.0+x0^2.0*2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-3.0/4.0*xyza^4.0+x0^2.0*162.0/40.0*xyza^40.0-x0^2.0*9.0/34.0*xyza^34.0-x0^3.0*xyza+x0^23.0*2.25/36.0*xyza^36.0-1.0/2.0/7.0*xyza^7.0+4.0/7.0*xyza^7.0+x0^2.0*xyza";
 UsageCalculus.EqnSolArrayMap4[1] = "-0.75*xyza^4.0+x0^2.0*4.05*xyza^40.0-x0^2.0*0.2647058823529412*xyza^34.0-x0^3.0*xyza+x0^23.0/16.0*xyza^36.0-1.0/14.0*xyza^7.0+0.5714285714285714*xyza^7.0+x0^2.0*xyza";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-9.0*xyza^2.0+x0^2.0*6318.0*xyza^38.0-x0^2.0*297.0*xyza^32.0-x0^3.0*0.0+x0^23.0*78.75*xyza^34.0-3.0*xyza^5.0+24.0*xyza^5.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-9.0*2.0*xyza^1.0+x0^2.0*6318.0*38.0*xyza^37.0-x0^2.0*297.0*32.0*xyza^31.0-x0^3.0*0.0*0.0+x0^23.0*78.75*34.0*xyza^33.0-3.0*5.0*xyza^4.0+24.0*5.0*xyza^4.0+x0^2.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-18.0*xyza+x0^2.0*240084.0*xyza^37.0-x0^2.0*9504.0*xyza^31.0-x0^3.0*0.0+x0^23.0*2677.5*xyza^33.0-15.0*xyza^4.0+120.0*xyza^4.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-0.75*xyza^4.0+x0^2.0*4.05*xyza^40.0-x0^2.0*0.2647058823529412*xyza^34.0-x0^3.0*xyza+x0^23.0/16.0*xyza^36.0-1.0/14.0*xyza^7.0+0.5714285714285714*xyza^7.0+x0^2.0*xyza";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-0.75/5.0*xyza^5.0+x0^2.0*4.05/41.0*xyza^41.0-x0^2.0*0.2647058823529412/35.0*xyza^35.0-x0^3.0/2.0*xyza^2.0+x0^23.0/16.0/37.0*xyza^37.0-1.0/14.0/8.0*xyza^8.0+0.5714285714285714/8.0*xyza^8.0+x0^2.0/2.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-0.15*xyza^5.0+x0^2.0*0.09878048780487804*xyza^41.0-x0^2.0*0.007563025210084034*xyza^35.0-x0^3.0/2.0*xyza^2.0+x0^23.0/592.0*xyza^37.0-1.0/112.0*xyza^8.0+0.07142857142857142*xyza^8.0+x0^2.0/2.0*xyza^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-18.0*xyza+x0^2.0*240084.0*xyza^37.0-x0^2.0*9504.0*xyza^31.0-x0^3.0*0.0+x0^23.0*2677.5*xyza^33.0-15.0*xyza^4.0+120.0*xyza^4.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-18.0+x0^2.0*240084.0*37.0*xyza^36.0-x0^2.0*9504.0*31.0*xyza^30.0-x0^3.0*0.0*0.0+x0^23.0*2677.5*33.0*xyza^32.0-15.0*4.0*xyza^3.0+120.0*4.0*xyza^3.0+x0^2.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-18.0+x0^2.0*8883108.0*xyza^36.0-x0^2.0*294624.0*xyza^30.0-x0^3.0*0.0+x0^23.0*88357.5*xyza^32.0-60.0*xyza^3.0+480.0*xyza^3.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-0.15*xyza^5.0+x0^2.0*0.09878048780487804*xyza^41.0-x0^2.0*0.007563025210084034*xyza^35.0-x0^3.0/2.0*xyza^2.0+x0^23.0/592.0*xyza^37.0-1.0/112.0*xyza^8.0+0.07142857142857142*xyza^8.0+x0^2.0/2.0*xyza^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-0.15/6.0*xyza^6.0+x0^2.0*0.09878048780487804/42.0*xyza^42.0-x0^2.0*0.007563025210084034/36.0*xyza^36.0-x0^3.0/2.0/3.0*xyza^3.0+x0^23.0/592.0/38.0*xyza^38.0-1.0/112.0/9.0*xyza^9.0+0.07142857142857142/9.0*xyza^9.0+x0^2.0*2.0/3.0*xyza^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-0.024999999999999998*xyza^6.0+x0^2.0*0.00235191637630662*xyza^42.0-x0^2.0*2.100840336134454E-4*xyza^36.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^23.0/22496.0*xyza^38.0-1.0/1008.0*xyza^9.0+0.007936507936507936*xyza^9.0+x0^2.0/1.5*xyza^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-18.0+x0^2.0*8883108.0*xyza^36.0-x0^2.0*294624.0*xyza^30.0-x0^3.0*0.0+x0^23.0*88357.5*xyza^32.0-60.0*xyza^3.0+480.0*xyza^3.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0+x0^2.0*8883108.0*36.0*xyza^35.0-x0^2.0*294624.0*30.0*xyza^29.0-x0^3.0*0.0*0.0+x0^23.0*88357.5*32.0*xyza^31.0-60.0*3.0*xyza^2.0+480.0*3.0*xyza^2.0+x0^2.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*3.19791888E8*xyza^35.0-x0^2.0*8838720.0*xyza^29.0-x0^3.0*0.0+x0^23.0*2827440.0*xyza^31.0-180.0*xyza^2.0+1440.0*xyza^2.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-0.024999999999999998*xyza^6.0+x0^2.0*0.00235191637630662*xyza^42.0-x0^2.0*2.100840336134454E-4*xyza^36.0-4.0*xyza^36.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^23.0/22496.0*xyza^38.0-1.0/1008.0*xyza^9.0+0.007936507936507936*xyza^9.0+x0^2.0/1.5*xyza^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-0.024999999999999998/7.0*xyza^7.0+x0^2.0*0.00235191637630662/43.0*xyza^43.0-x0^2.0*2.100840336134454E-4/37.0*xyza^37.0-4.0/37.0*xyza^37.0-x0^3.0*0.16666666666666666/4.0*xyza^4.0+x0^23.0/22496.0/39.0*xyza^39.0-1.0/1008.0/10.0*xyza^10.0+0.007936507936507936/10.0*xyza^10.0+x0^2.0*1.5/4.0*xyza^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-0.0035714285714285713*xyza^7.0+x0^2.0*5.46957296815493E-5*xyza^43.0-x0^2.0/176120.0*xyza^37.0-1.0/9.25*xyza^37.0-0.10810810810810811*xyza^37.0-x0^3.0*0.041666666666666664*xyza^4.0+x0^23.0/877344.0*xyza^39.0-1.0/10080.0*xyza^10.0+7.936507936507937E-4*xyza^10.0+x0^2.0/2.6666666666666665*xyza^4.0";
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

public static void TestCaseDiff121225() {
 UsageCalculus.TestCase = 121225;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-1*x0^2*-2*x0^3*3*x02*x^3*3*x/1*x^2*--3*x^33*x1*x0^2*--3*x0^3-3*x^3*1*x/2*x^21*x/2*x^2*-3*x^3*-1*x2*x0^23*x^3*-1*x-1*x/2*x^2*-3*x2*x0^2*-3*x0*1*x0^2/-3*x03*x1*x^2/-3*x-3*x*-1*x^2*2*x1*xy012^2*2*xy012/3*xy012^2*-1*xy0122*x3*x^2*-1*x-1*x/2*x^2*-3*x^3-1*x0^2*-2*x0^32*x^3*3*x";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=224 EqnNumber=28 FamilyID=3 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[92, 28, 17, 18, 1, 1, 2, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 4, 6, 1, 2, 3, 1, 6, 1, 2, 4, 1, 6, 7, 8, 17]"+
"// DOEMatrixRow=[89, 30, 20, 3, 1, 2, 3, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 30, 9, 2, 3, 2, 3, 1, 2, 3, 1, 2, 1, 15, 2, 11, 8]"+
//Tail EqnIndex=224 EqnNumber=28 FamilyID=3 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[92, 28, 17, 18, 1, 1, 2, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 4, 6, 1, 2, 3, 1, 6, 1, 2, 4, 1, 6, 7, 8, 17]"+
"// DOEMatrixRow=[89, 30, 20, 3, 1, 2, 3, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 30, 9, 2, 3, 2, 3, 1, 2, 3, 1, 2, 1, 15, 2, 11, 8]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "162.0*x^39.0-9.0*x^33.0-3.0+2.25*x^35.0-1.0/2.0*x^6.0+4.0*x^6.0+1.5*x^6.0+6.0*x^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "162.0*39.0*x^38.0-9.0*33.0*x^32.0-3.0*0.0+2.25*35.0*x^34.0-1.0/2.0*6.0*x^5.0+4.0*6.0*x^5.0+1.5*6.0*x^5.0+6.0*4.0*x^3.0";
 UsageCalculus.EqnSolArrayMap2[1] = "6318.0*x^38.0-297.0*x^32.0+78.75*x^34.0-3.0*x^5.0+24.0*x^5.0+9.0*x^5.0+24.0*x^3.0";
 UsageCalculus.EqnSolArrayMap3[1] = "162.0*x^39.0-9.0*x^33.0-3.0+2.25*x^35.0-1.0/2.0*x^6.0+4.0*x^6.0+1.5*x^6.0+6.0*x^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "162.0/40.0*x^40.0-9.0/34.0*x^34.0-3.0*x+2.25/36.0*x^36.0-1.0/2.0/7.0*x^7.0+4.0/7.0*x^7.0+1.5/7.0*x^7.0+6.0/5.0*x^5.0";
 UsageCalculus.EqnSolArrayMap4[1] = "4.05*x^40.0-1.0/3.7777777777777777*x^34.0-3.0*x+1.0/16.0*x^36.0-1.0/14.0*x^7.0+1.0/1.75*x^7.0+1.0/4.666666666666667*x^7.0+1.2*x^5.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "6318.0*x^38.0-297.0*x^32.0+78.75*x^34.0-3.0*x^5.0+24.0*x^5.0+9.0*x^5.0+24.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "6318.0*38.0*x^37.0-297.0*32.0*x^31.0+78.75*34.0*x^33.0-3.0*5.0*x^4.0+24.0*5.0*x^4.0+9.0*5.0*x^4.0+24.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[2] = "240084.0*x^37.0-9504.0*x^31.0+2677.5*x^33.0-15.0*x^4.0+120.0*x^4.0+45.0*x^4.0+72.0*x^2.0";
 UsageCalculus.EqnSolArrayMap3[2] = "4.05*x^40.0-1.0/3.7777777777777777*x^34.0-3.0*x+1.0/16.0*x^36.0-1.0/14.0*x^7.0+1.0/1.75*x^7.0+1.0/4.666666666666667*x^7.0+1.2*x^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "4.05/41.0*x^41.0-1.0/3.7777777777777777/35.0*x^35.0-3.0/2.0*x^2.0+1.0/16.0/37.0*x^37.0-1.0/14.0/8.0*x^8.0+1.0/1.75/8.0*x^8.0+1.0/4.666666666666667/8.0*x^8.0+1.2/6.0*x^6.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/10.123456790123457*x^41.0-1.0/132.22222222222223*x^35.0-1.5*x^2.0+1.0/592.0*x^37.0-1.0/112.0*x^8.0+1.0/14.0*x^8.0+1.0/37.333333333333336*x^8.0+1.0/5.0*x^6.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "240084.0*x^37.0-9504.0*x^31.0+2677.5*x^33.0-15.0*x^4.0+120.0*x^4.0+45.0*x^4.0+72.0*x^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "240084.0*37.0*x^36.0-9504.0*31.0*x^30.0+2677.5*33.0*x^32.0-15.0*4.0*x^3.0+120.0*4.0*x^3.0+45.0*4.0*x^3.0+72.0*2.0*x^1.0";
 UsageCalculus.EqnSolArrayMap2[3] = "8883108.0*x^36.0-294624.0*x^30.0+88357.5*x^32.0-60.0*x^3.0+480.0*x^3.0+180.0*x^3.0+144.0*x";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/10.123456790123457*x^41.0-1.0/132.22222222222223*x^35.0-1.5*x^2.0+1.0/592.0*x^37.0-1.0/112.0*x^8.0+1.0/14.0*x^8.0+1.0/37.333333333333336*x^8.0+1.0/5.0*x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/10.123456790123457/42.0*x^42.0-1.0/132.22222222222223/36.0*x^36.0-1.5/3.0*x^3.0+1.0/592.0/38.0*x^38.0-1.0/112.0/9.0*x^9.0+1.0/14.0/9.0*x^9.0+1.0/37.333333333333336/9.0*x^9.0+1.0/5.0/7.0*x^7.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/425.1851851851852*x^42.0-1.0/4760.0*x^36.0-1.0/2.0*x^3.0+1.0/22496.0*x^38.0-1.0/1008.0*x^9.0+1.0/126.0*x^9.0+1.0/336.0*x^9.0+1.0/35.0*x^7.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "8883108.0*x^36.0-294624.0*x^30.0+88357.5*x^32.0-60.0*x^3.0+480.0*x^3.0+180.0*x^3.0+144.0*x";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "8883108.0*36.0*x^35.0-294624.0*30.0*x^29.0+88357.5*32.0*x^31.0-60.0*3.0*x^2.0+480.0*3.0*x^2.0+180.0*3.0*x^2.0+144.0";
 UsageCalculus.EqnSolArrayMap2[4] = "3.19791888E8*x^35.0-8838720.0*x^29.0+2827440.0*x^31.0-180.0*x^2.0+1440.0*x^2.0+540.0*x^2.0+144.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/425.1851851851852*x^42.0-1.0/4760.0*x^36.0-1.0/2.0*x^3.0+1.0/22496.0*x^38.0-1.0/1008.0*x^9.0+1.0/126.0*x^9.0+1.0/336.0*x^9.0+1.0/35.0*x^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/425.1851851851852/43.0*x^43.0-1.0/4760.0/37.0*x^37.0-1.0/2.0/4.0*x^4.0+1.0/22496.0/39.0*x^39.0-1.0/1008.0/10.0*x^10.0+1.0/126.0/10.0*x^10.0+1.0/336.0/10.0*x^10.0+1.0/35.0/8.0*x^8.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/18282.962962962964*x^43.0-1.0/176120.0*x^37.0-1.0/8.0*x^4.0+1.0/877344.0*x^39.0-1.0/10080.0*x^10.0+1.0/1260.0*x^10.0+1.0/3360.0*x^10.0+1.0/280.0*x^8.0";
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

public static void TestCaseDiff121226() {
 UsageCalculus.TestCase = 121226;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xy^3*3*xy/1*xy^2*--3*xy^33*xy1*x0^2*--3*x0^3-3*xy^3*1*xy/2*xy^21*xy/2*xy^2*-3*xy^3*-1*xy2*x0^23*xy^3*-1*xy-1*xy/2*xy^2*-3*xy2*x0^2*-3*x0*1*x0^2/-3*x03*xy1*xy^2/-3*xy-3*xy*-1*xy^2*2*xy1*xy012^2*2*xy012/3*xy012^2*-1*xy0122*xy3*xy^2*-1*xy-1*xy/2*xy^2*-3*xy^32*xy012^2*-3*xy012^3*1*xy012/-3*xy012^23*xy^32*xy^3*3*xy3*xy/1*xy^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=225 EqnNumber=29 FamilyID=1 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[57, 29, 18, 19, 2, 3, 1, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 1, 7, 2, 3, 1, 2, 7, 2, 3, 5, 2, 7, 8, 9, 18]"+
"// DOEMatrixRow=[54, 31, 1, 4, 2, 3, 1, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 31, 10, 3, 1, 3, 1, 2, 3, 4, 2, 3, 2, 16, 1, 12, 9]"+
//Tail EqnIndex=225 EqnNumber=29 FamilyID=1 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[57, 29, 18, 19, 2, 3, 1, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 1, 7, 2, 3, 1, 2, 7, 2, 3, 5, 2, 7, 8, 9, 18]"+
"// DOEMatrixRow=[54, 31, 1, 4, 2, 3, 1, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 31, 10, 3, 1, 3, 1, 2, 3, 4, 2, 3, 2, 16, 1, 12, 9]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0*54.0*xy^39.0-x0^2.0*9.0*xy^33.0-x0^3.0*3.0+x0^23.0*2.25*xy^35.0-1.0/2.0*xy^6.0+4.0*xy^6.0+4.5*xy^73.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0*54.0*39.0*xy^38.0-x0^2.0*9.0*33.0*xy^32.0-x0^3.0*3.0*0.0+x0^23.0*2.25*35.0*xy^34.0-1.0/2.0*6.0*xy^5.0+4.0*6.0*xy^5.0+4.5*73.0*xy^72.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*2106.0*xy^38.0-x0^2.0*297.0*xy^32.0-x0^3.0*0.0+x0^23.0*78.75*xy^34.0-3.0*xy^5.0+24.0*xy^5.0+328.5*xy^72.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0*54.0*xy^39.0-x0^2.0*9.0*xy^33.0-x0^3.0*3.0+x0^23.0*2.25*xy^35.0-1.0/2.0*xy^6.0+4.0*xy^6.0+4.5*xy^73.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0*54.0/40.0*xy^40.0-x0^2.0*9.0/34.0*xy^34.0-x0^3.0*xy+x0^23.0*2.25/36.0*xy^36.0-1.0/2.0/7.0*xy^7.0+4.0/7.0*xy^7.0+4.5/74.0*xy^74.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0*1.35*xy^40.0-x0^2.0*0.2647058823529412*xy^34.0-x0^3.0*xy+x0^23.0/16.0*xy^36.0-1.0/14.0*xy^7.0+1.0/1.75*xy^7.0+1.0/16.444444444444443*xy^74.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*2106.0*xy^38.0-x0^2.0*297.0*xy^32.0-x0^3.0*0.0+x0^23.0*78.75*xy^34.0-3.0*xy^5.0+24.0*xy^5.0+328.5*xy^72.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*2106.0*38.0*xy^37.0-x0^2.0*297.0*32.0*xy^31.0-x0^3.0*0.0*0.0+x0^23.0*78.75*34.0*xy^33.0-3.0*5.0*xy^4.0+24.0*5.0*xy^4.0+328.5*72.0*xy^71.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*80028.0*xy^37.0-x0^2.0*9504.0*xy^31.0-x0^3.0*0.0+x0^23.0*2677.5*xy^33.0-15.0*xy^4.0+120.0*xy^4.0+23652.0*xy^71.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0*1.35*xy^40.0-x0^2.0*0.2647058823529412*xy^34.0-x0^3.0*xy+x0^23.0/16.0*xy^36.0-1.0/14.0*xy^7.0+1.0/1.75*xy^7.0+1.0/16.444444444444443*xy^74.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0*1.35/41.0*xy^41.0-x0^2.0*0.2647058823529412/35.0*xy^35.0-x0^3.0/2.0*xy^2.0+x0^23.0/16.0/37.0*xy^37.0-1.0/14.0/8.0*xy^8.0+1.0/1.75/8.0*xy^8.0+1.0/16.444444444444443/75.0*xy^75.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0*0.032926829268292684*xy^41.0-x0^2.0*0.007563025210084034*xy^35.0-x0^3.0/2.0*xy^2.0+x0^23.0/592.0*xy^37.0-1.0/112.0*xy^8.0+1.0/14.0*xy^8.0+1.0/1233.3333333333333*xy^75.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*80028.0*xy^37.0-x0^2.0*9504.0*xy^31.0-x0^3.0*0.0+x0^23.0*2677.5*xy^33.0-15.0*xy^4.0+120.0*xy^4.0+23652.0*xy^71.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*80028.0*37.0*xy^36.0-x0^2.0*9504.0*31.0*xy^30.0-x0^3.0*0.0*0.0+x0^23.0*2677.5*33.0*xy^32.0-15.0*4.0*xy^3.0+120.0*4.0*xy^3.0+23652.0*71.0*xy^70.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*2961036.0*xy^36.0-x0^2.0*294624.0*xy^30.0-x0^3.0*0.0+x0^23.0*88357.5*xy^32.0-60.0*xy^3.0+480.0*xy^3.0+1679292.0*xy^70.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0*0.032926829268292684*xy^41.0-x0^2.0*0.007563025210084034*xy^35.0-x0^3.0/2.0*xy^2.0+x0^23.0/592.0*xy^37.0-1.0/112.0*xy^8.0+1.0/14.0*xy^8.0+1.0/1233.3333333333333*xy^75.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0*0.032926829268292684/42.0*xy^42.0-x0^2.0*0.007563025210084034/36.0*xy^36.0-x0^3.0/2.0/3.0*xy^3.0+x0^23.0/592.0/38.0*xy^38.0-1.0/112.0/9.0*xy^9.0+1.0/14.0/9.0*xy^9.0+1.0/1233.3333333333333/76.0*xy^76.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0*7.839721254355401E-4*xy^42.0-x0^2.0*2.100840336134454E-4*xy^36.0-x0^3.0*0.16666666666666666*xy^3.0+x0^23.0/22496.0*xy^38.0-1.0/1008.0*xy^9.0+1.0/126.0*xy^9.0+1.0/93733.33333333333*xy^76.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*2961036.0*xy^36.0-x0^2.0*294624.0*xy^30.0-x0^3.0*0.0+x0^23.0*88357.5*xy^32.0-60.0*xy^3.0+480.0*xy^3.0+1679292.0*xy^70.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*2961036.0*36.0*xy^35.0-x0^2.0*294624.0*30.0*xy^29.0-x0^3.0*0.0*0.0+x0^23.0*88357.5*32.0*xy^31.0-60.0*3.0*xy^2.0+480.0*3.0*xy^2.0+1679292.0*70.0*xy^69.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*1.06597296E8*xy^35.0-x0^2.0*8838720.0*xy^29.0-x0^3.0*0.0+x0^23.0*2827440.0*xy^31.0-180.0*xy^2.0+1440.0*xy^2.0+1.1755044E8*xy^69.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0*7.839721254355401E-4*xy^42.0-4.0*xy^42.0-x0^2.0*2.100840336134454E-4*xy^36.0-4.0*xy^36.0-x0^3.0*0.16666666666666666*xy^3.0+x0^23.0/22496.0*xy^38.0-1.0/1008.0*xy^9.0+1.0/126.0*xy^9.0+1.0/93733.33333333333*xy^76.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0*7.839721254355401E-4/43.0*xy^43.0-4.0/43.0*xy^43.0-x0^2.0*2.100840336134454E-4/37.0*xy^37.0-4.0/37.0*xy^37.0-x0^3.0*0.16666666666666666/4.0*xy^4.0+x0^23.0/22496.0/39.0*xy^39.0-1.0/1008.0/10.0*xy^10.0+1.0/126.0/10.0*xy^10.0+1.0/93733.33333333333/77.0*xy^77.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0/54848.88888888889*xy^43.0-1.0/10.75*xy^43.0-0.09302325581395349*xy^43.0-x0^2.0/176120.0*xy^37.0-1.0/9.25*xy^37.0-0.10810810810810811*xy^37.0-x0^3.0*0.041666666666666664*xy^4.0+x0^23.0/877344.0*xy^39.0-1.0/10080.0*xy^10.0+1.0/1260.0*xy^10.0+1.0/7217466.666666666*xy^77.0";
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

public static void TestCaseDiff121227() {
 UsageCalculus.TestCase = 121227;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xyz1*x0^2*--3*x0^3-3*xyz^3*1*xyz/2*xyz^21*xyz/2*xyz^2*-3*xyz^3*-1*xyz2*x0^23*xyz^3*-1*xyz-1*xyz/2*xyz^2*-3*xyz2*x0^2*-3*x0*1*x0^2/-3*x03*xyz1*xyz^2/-3*xyz-3*xyz*-1*xyz^2*2*xyz1*xy012^2*2*xy012/3*xy012^2*-1*xy0122*xyz3*xyz^2*-1*xyz-1*xyz/2*xyz^2*-3*xyz^32*xy012^2*-3*xy012^3*1*xy012/-3*xy012^23*xyz^31*xyz/-3*xyz^2-3*x0^2*-1*x0^3*2*x03*xyz/1*xyz^21*x0^2*--3*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=226 EqnNumber=30 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[21, 30, 19, 20, 3, 1, 2, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 3, 8, 3, 1, 2, 3, 8, 3, 4, 6, 3, 8, 9, 10, 19]"+
"// DOEMatrixRow=[18, 32, 2, 1, 3, 1, 2, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 32, 1, 1, 2, 4, 2, 3, 4, 1, 3, 1, 3, 1, 2, 13, 10]"+
//Tail EqnIndex=226 EqnNumber=30 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[21, 30, 19, 20, 3, 1, 2, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 3, 8, 3, 1, 2, 3, 8, 3, 4, 6, 3, 8, 9, 10, 19]"+
"// DOEMatrixRow=[18, 32, 2, 1, 3, 1, 2, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 32, 1, 1, 2, 4, 2, 3, 4, 1, 3, 1, 3, 1, 2, 13, 10]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0*9.0-x0^3.0*3.0+x0^23.0*2.25*xyz^35.0-1.0/2.0*xyz^6.0+4.0*xyz^6.0-xy012^2.0*xy012/2.0*xyz^69.0+x0^2.0*x03*18.0*xyz^22.0-x0^3.0*3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0*9.0*0.0-x0^3.0*3.0*0.0+x0^23.0*2.25*35.0*xyz^34.0-1.0/2.0*6.0*xyz^5.0+4.0*6.0*xyz^5.0-xy012^2.0*xy012/2.0*69.0*xyz^68.0+x0^2.0*x03*18.0*22.0*xyz^21.0-x0^3.0*3.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*78.75*xyz^34.0-3.0*xyz^5.0+24.0*xyz^5.0-xy012^2.0*xy012*34.5*xyz^68.0+x0^2.0*x03*396.0*xyz^21.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0*9.0-x0^3.0*3.0+x0^23.0*2.25*xyz^35.0-1.0/2.0*xyz^6.0+4.0*xyz^6.0-xy012^2.0*xy012/2.0*xyz^69.0+x0^2.0*x03*18.0*xyz^22.0-x0^3.0*3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0*9.0*xyz-x0^3.0*xyz+x0^23.0*2.25/36.0*xyz^36.0-1.0/2.0/7.0*xyz^7.0+4.0/7.0*xyz^7.0-xy012^2.0*xy012/2.0/70.0*xyz^70.0+x0^2.0*x03*18.0/23.0*xyz^23.0-x0^3.0*xyz";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0*9.0*xyz-x0^3.0*xyz+x0^23.0/16.0*xyz^36.0-1.0/14.0*xyz^7.0+0.5714285714285714*xyz^7.0-xy012^2.0*xy012*0.007142857142857143*xyz^70.0+x0^2.0*x03*0.782608695652174*xyz^23.0-x0^3.0*xyz";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*78.75*xyz^34.0-3.0*xyz^5.0+24.0*xyz^5.0-xy012^2.0*xy012*34.5*xyz^68.0+x0^2.0*x03*396.0*xyz^21.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^23.0*78.75*34.0*xyz^33.0-3.0*5.0*xyz^4.0+24.0*5.0*xyz^4.0-xy012^2.0*xy012*34.5*68.0*xyz^67.0+x0^2.0*x03*396.0*21.0*xyz^20.0-x0^3.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*2677.5*xyz^33.0-15.0*xyz^4.0+120.0*xyz^4.0-xy012^2.0*xy012*2346.0*xyz^67.0+x0^2.0*x03*8316.0*xyz^20.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0*9.0*xyz-x0^3.0*xyz+x0^23.0/16.0*xyz^36.0-1.0/14.0*xyz^7.0+0.5714285714285714*xyz^7.0-xy012^2.0*xy012*0.007142857142857143*xyz^70.0+x0^2.0*x03*0.782608695652174*xyz^23.0-x0^3.0*xyz";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0*9.0/2.0*xyz^2.0-x0^3.0/2.0*xyz^2.0+x0^23.0/16.0/37.0*xyz^37.0-1.0/14.0/8.0*xyz^8.0+0.5714285714285714/8.0*xyz^8.0-xy012^2.0*xy012*0.007142857142857143/71.0*xyz^71.0+x0^2.0*x03*0.782608695652174/24.0*xyz^24.0-x0^3.0/2.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0*4.5*xyz^2.0-x0^3.0/2.0*xyz^2.0+x0^23.0/592.0*xyz^37.0-1.0/112.0*xyz^8.0+0.07142857142857142*xyz^8.0-xy012^2.0*xy012*1.0060362173038229E-4*xyz^71.0+x0^2.0*x03*0.03260869565217391*xyz^24.0-x0^3.0/2.0*xyz^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*2677.5*xyz^33.0-15.0*xyz^4.0+120.0*xyz^4.0-xy012^2.0*xy012*2346.0*xyz^67.0+x0^2.0*x03*8316.0*xyz^20.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^23.0*2677.5*33.0*xyz^32.0-15.0*4.0*xyz^3.0+120.0*4.0*xyz^3.0-xy012^2.0*xy012*2346.0*67.0*xyz^66.0+x0^2.0*x03*8316.0*20.0*xyz^19.0-x0^3.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*88357.5*xyz^32.0-60.0*xyz^3.0+480.0*xyz^3.0-xy012^2.0*xy012*157182.0*xyz^66.0+x0^2.0*x03*166320.0*xyz^19.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0*4.5*xyz^2.0-x0^3.0/2.0*xyz^2.0+x0^23.0/592.0*xyz^37.0-1.0/112.0*xyz^8.0+0.07142857142857142*xyz^8.0-xy012^2.0*xy012*1.0060362173038229E-4*xyz^71.0-4.0*xyz^71.0+x0^2.0*x03*0.03260869565217391*xyz^24.0-x0^3.0/2.0*xyz^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0*4.5/3.0*xyz^3.0-x0^3.0/2.0/3.0*xyz^3.0+x0^23.0/592.0/38.0*xyz^38.0-1.0/112.0/9.0*xyz^9.0+0.07142857142857142/9.0*xyz^9.0-xy012^2.0*xy012*1.0060362173038229E-4/72.0*xyz^72.0-4.0/72.0*xyz^72.0+x0^2.0*x03*0.03260869565217391/25.0*xyz^25.0-x0^3.0*2.0/3.0*xyz^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0*1.5*xyz^3.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^23.0/22496.0*xyz^38.0-1.0/1008.0*xyz^9.0+0.007936507936507936*xyz^9.0-xy012^2.0*xy012/715680.0*xyz^72.0-1.0/18.0*xyz^72.0-0.05555555555555555*xyz^72.0+x0^2.0*x03*0.0013043478260869564*xyz^25.0-x0^3.0/1.5*xyz^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*88357.5*xyz^32.0-60.0*xyz^3.0+480.0*xyz^3.0-xy012^2.0*xy012*157182.0*xyz^66.0+x0^2.0*x03*166320.0*xyz^19.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^23.0*88357.5*32.0*xyz^31.0-60.0*3.0*xyz^2.0+480.0*3.0*xyz^2.0-xy012^2.0*xy012*157182.0*66.0*xyz^65.0+x0^2.0*x03*166320.0*19.0*xyz^18.0-x0^3.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*2827440.0*xyz^31.0-180.0*xyz^2.0+1440.0*xyz^2.0-xy012^2.0*xy012*1.0374012E7*xyz^65.0+x0^2.0*x03*3160080.0*xyz^18.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0*1.5*xyz^3.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^23.0/22496.0*xyz^38.0-1.0/1008.0*xyz^9.0+0.007936507936507936*xyz^9.0-xy012^2.0*xy012/715680.0*xyz^72.0-1.0/18.0*xyz^72.0-0.05555555555555555*xyz^72.0+x0^2.0*x03*0.0013043478260869564*xyz^25.0-x0^3.0/1.5*xyz^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0*1.5/4.0*xyz^4.0-x0^3.0*0.16666666666666666/4.0*xyz^4.0+x0^23.0/22496.0/39.0*xyz^39.0-1.0/1008.0/10.0*xyz^10.0+0.007936507936507936/10.0*xyz^10.0-xy012^2.0*xy012/715680.0/73.0*xyz^73.0-1.0/18.0/73.0*xyz^73.0-0.05555555555555555/73.0*xyz^73.0+x0^2.0*x03*0.0013043478260869564/26.0*xyz^26.0-x0^3.0*1.5/4.0*xyz^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0*0.375*xyz^4.0-x0^3.0*0.041666666666666664*xyz^4.0+x0^23.0/877344.0*xyz^39.0-1.0/10080.0*xyz^10.0+7.936507936507937E-4*xyz^10.0-xy012^2.0*xy012/5.224464E7*xyz^73.0-1.0/1314.0*xyz^73.0-7.6103500761035E-4*xyz^73.0+x0^2.0*x03*5.0167224080267555E-5*xyz^26.0-x0^3.0/2.6666666666666665*xyz^4.0";
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

public static void TestCaseDiff121228() {
 UsageCalculus.TestCase = 121228;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x0^2*--3*x0^3-3*xyza^3*1*xyza/2*xyza^21*xyza/2*xyza^2*-3*xyza^3*-1*xyza2*x0^23*xyza^3*-1*xyza-1*xyza/2*xyza^2*-3*xyza2*x0^2*-3*x0*1*x0^2/-3*x03*xyza1*xyza^2/-3*xyza-3*xyza*-1*xyza^2*2*xyza1*xy012^2*2*xy012/3*xy012^2*-1*xy0122*xyza3*xyza^2*-1*xyza-1*xyza/2*xyza^2*-3*xyza^32*xy012^2*-3*xy012^3*1*xy012/-3*xy012^23*xyza^31*xyza/-3*xyza^2-3*x0^2*-1*x0^3*2*x01*xyza^3*2*xyza/3*xyza^2*--1*xyza^32*xyza1*x0^2*--3*x0^3-3*xyza^3*1*xyza";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=227 EqnNumber=31 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[87, 31, 20, 1, 4, 2, 3, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 5, 3, 4, 9, 1, 2, 3, 4, 9, 1, 1, 7, 4, 9, 10, 11, 20]"+
"// DOEMatrixRow=[84, 33, 3, 2, 1, 2, 3, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 33, 2, 3, 1, 5, 3, 1, 5, 2, 1, 2, 4, 2, 1, 14, 11]"+
//Tail EqnIndex=227 EqnNumber=31 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[87, 31, 20, 1, 4, 2, 3, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 5, 3, 4, 9, 1, 2, 3, 4, 9, 1, 1, 7, 4, 9, 10, 11, 20]"+
"// DOEMatrixRow=[84, 33, 3, 2, 1, 2, 3, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 33, 2, 3, 1, 5, 3, 1, 5, 2, 1, 2, 4, 2, 1, 14, 11]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0*3.0-x0^3.0*3.0+x0^23.0*2.25*xyza^35.0-1.0/2.0*xyza^6.0+4.0*xyza^6.0-xy012^2.0*xy012/2.0*xyza^69.0+x0^2.0*12.0*xyza^38.0-x0^2.0*3.0*xyza^32.0-x0^3.0*3.0-3.0*xyza^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0*3.0*0.0-x0^3.0*3.0*0.0+x0^23.0*2.25*35.0*xyza^34.0-1.0/2.0*6.0*xyza^5.0+4.0*6.0*xyza^5.0-xy012^2.0*xy012/2.0*69.0*xyza^68.0+x0^2.0*12.0*38.0*xyza^37.0-x0^2.0*3.0*32.0*xyza^31.0-x0^3.0*3.0*0.0-3.0*4.0*xyza^3.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*78.75*xyza^34.0-3.0*xyza^5.0+24.0*xyza^5.0-xy012^2.0*xy012*34.5*xyza^68.0+x0^2.0*456.0*xyza^37.0-x0^2.0*96.0*xyza^31.0-x0^3.0*0.0-12.0*xyza^3.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0*3.0-x0^3.0*3.0+x0^23.0*2.25*xyza^35.0-1.0/2.0*xyza^6.0+4.0*xyza^6.0-xy012^2.0*xy012/2.0*xyza^69.0+x0^2.0*12.0*xyza^38.0-x0^2.0*3.0*xyza^32.0-x0^3.0*3.0-3.0*xyza^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0*3.0*xyza-x0^3.0*xyza+x0^23.0*2.25/36.0*xyza^36.0-1.0/2.0/7.0*xyza^7.0+4.0/7.0*xyza^7.0-xy012^2.0*xy012/2.0/70.0*xyza^70.0+x0^2.0*12.0/39.0*xyza^39.0-x0^2.0*3.0/33.0*xyza^33.0-x0^3.0*xyza-3.0/5.0*xyza^5.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0*3.0*xyza-x0^3.0*xyza+x0^23.0/16.0*xyza^36.0-1.0/14.0*xyza^7.0+0.5714285714285714*xyza^7.0-xy012^2.0*xy012*0.007142857142857143*xyza^70.0+x0^2.0*0.3076923076923077*xyza^39.0-x0^2.0*0.09090909090909091*xyza^33.0-x0^3.0*xyza-1.0/1.6666666666666667*xyza^5.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*78.75*xyza^34.0-3.0*xyza^5.0+24.0*xyza^5.0-xy012^2.0*xy012*34.5*xyza^68.0+x0^2.0*456.0*xyza^37.0-x0^2.0*96.0*xyza^31.0-x0^3.0*0.0-12.0*xyza^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^23.0*78.75*34.0*xyza^33.0-3.0*5.0*xyza^4.0+24.0*5.0*xyza^4.0-xy012^2.0*xy012*34.5*68.0*xyza^67.0+x0^2.0*456.0*37.0*xyza^36.0-x0^2.0*96.0*31.0*xyza^30.0-x0^3.0*0.0*0.0-12.0*3.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*2677.5*xyza^33.0-15.0*xyza^4.0+120.0*xyza^4.0-xy012^2.0*xy012*2346.0*xyza^67.0+x0^2.0*16872.0*xyza^36.0-x0^2.0*2976.0*xyza^30.0-x0^3.0*0.0-36.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0*3.0*xyza-x0^3.0*xyza+x0^23.0/16.0*xyza^36.0-1.0/14.0*xyza^7.0+0.5714285714285714*xyza^7.0-xy012^2.0*xy012*0.007142857142857143*xyza^70.0+x0^2.0*0.3076923076923077*xyza^39.0-x0^2.0*0.09090909090909091*xyza^33.0-x0^3.0*xyza-1.0/1.6666666666666667*xyza^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0*3.0/2.0*xyza^2.0-x0^3.0/2.0*xyza^2.0+x0^23.0/16.0/37.0*xyza^37.0-1.0/14.0/8.0*xyza^8.0+0.5714285714285714/8.0*xyza^8.0-xy012^2.0*xy012*0.007142857142857143/71.0*xyza^71.0+x0^2.0*0.3076923076923077/40.0*xyza^40.0-x0^2.0*0.09090909090909091/34.0*xyza^34.0-x0^3.0/2.0*xyza^2.0-1.0/1.6666666666666667/6.0*xyza^6.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0*1.5*xyza^2.0-x0^3.0/2.0*xyza^2.0+x0^23.0/592.0*xyza^37.0-1.0/112.0*xyza^8.0+0.07142857142857142*xyza^8.0-xy012^2.0*xy012*1.0060362173038229E-4*xyza^71.0+x0^2.0*0.007692307692307693*xyza^40.0-x0^2.0*0.0026737967914438505*xyza^34.0-x0^3.0/2.0*xyza^2.0-1.0/10.0*xyza^6.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*2677.5*xyza^33.0-15.0*xyza^4.0+120.0*xyza^4.0-xy012^2.0*xy012*2346.0*xyza^67.0+x0^2.0*16872.0*xyza^36.0-x0^2.0*2976.0*xyza^30.0-x0^3.0*0.0-36.0*xyza^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^23.0*2677.5*33.0*xyza^32.0-15.0*4.0*xyza^3.0+120.0*4.0*xyza^3.0-xy012^2.0*xy012*2346.0*67.0*xyza^66.0+x0^2.0*16872.0*36.0*xyza^35.0-x0^2.0*2976.0*30.0*xyza^29.0-x0^3.0*0.0*0.0-36.0*2.0*xyza^1.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*88357.5*xyza^32.0-60.0*xyza^3.0+480.0*xyza^3.0-xy012^2.0*xy012*157182.0*xyza^66.0+x0^2.0*607392.0*xyza^35.0-x0^2.0*89280.0*xyza^29.0-x0^3.0*0.0-72.0*xyza";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0*1.5*xyza^2.0-x0^3.0/2.0*xyza^2.0+x0^23.0/592.0*xyza^37.0-1.0/112.0*xyza^8.0+0.07142857142857142*xyza^8.0-xy012^2.0*xy012*1.0060362173038229E-4*xyza^71.0-4.0*xyza^71.0+x0^2.0*0.007692307692307693*xyza^40.0-x0^2.0*0.0026737967914438505*xyza^34.0-x0^3.0/2.0*xyza^2.0-1.0/10.0*xyza^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0*1.5/3.0*xyza^3.0-x0^3.0/2.0/3.0*xyza^3.0+x0^23.0/592.0/38.0*xyza^38.0-1.0/112.0/9.0*xyza^9.0+0.07142857142857142/9.0*xyza^9.0-xy012^2.0*xy012*1.0060362173038229E-4/72.0*xyza^72.0-4.0/72.0*xyza^72.0+x0^2.0*0.007692307692307693/41.0*xyza^41.0-x0^2.0*0.0026737967914438505/35.0*xyza^35.0-x0^3.0/2.0/3.0*xyza^3.0-1.0/10.0/7.0*xyza^7.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0*0.5*xyza^3.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^23.0/22496.0*xyza^38.0-1.0/1008.0*xyza^9.0+0.007936507936507936*xyza^9.0-xy012^2.0*xy012/715680.0*xyza^72.0-1.0/18.0*xyza^72.0-0.05555555555555555*xyza^72.0+x0^2.0*1.876172607879925E-4*xyza^41.0-x0^2.0*7.639419404125287E-5*xyza^35.0-x0^3.0/6.0*xyza^3.0-1.0/70.0*xyza^7.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*88357.5*xyza^32.0-60.0*xyza^3.0+480.0*xyza^3.0-xy012^2.0*xy012*157182.0*xyza^66.0+x0^2.0*607392.0*xyza^35.0-x0^2.0*89280.0*xyza^29.0-x0^3.0*0.0-72.0*xyza";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^23.0*88357.5*32.0*xyza^31.0-60.0*3.0*xyza^2.0+480.0*3.0*xyza^2.0-xy012^2.0*xy012*157182.0*66.0*xyza^65.0+x0^2.0*607392.0*35.0*xyza^34.0-x0^2.0*89280.0*29.0*xyza^28.0-x0^3.0*0.0*0.0-72.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*2827440.0*xyza^31.0-180.0*xyza^2.0+1440.0*xyza^2.0-xy012^2.0*xy012*1.0374012E7*xyza^65.0+x0^2.0*2.125872E7*xyza^34.0-x0^2.0*2589120.0*xyza^28.0-x0^3.0*0.0-72.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0*0.5*xyza^3.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^23.0/22496.0*xyza^38.0-1.0/1008.0*xyza^9.0+0.007936507936507936*xyza^9.0-xy012^2.0*xy012/715680.0*xyza^72.0-1.0/18.0*xyza^72.0-0.05555555555555555*xyza^72.0+x0^2.0*1.876172607879925E-4*xyza^41.0-4.0*xyza^41.0-x0^2.0*7.639419404125287E-5*xyza^35.0-5.0*xyza^35.0-x0^3.0/6.0*xyza^3.0-1.0/70.0*xyza^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0*0.5/4.0*xyza^4.0-x0^3.0*0.16666666666666666/4.0*xyza^4.0+x0^23.0/22496.0/39.0*xyza^39.0-1.0/1008.0/10.0*xyza^10.0+0.007936507936507936/10.0*xyza^10.0-xy012^2.0*xy012/715680.0/73.0*xyza^73.0-1.0/18.0/73.0*xyza^73.0-0.05555555555555555/73.0*xyza^73.0+x0^2.0*1.876172607879925E-4/42.0*xyza^42.0-4.0/42.0*xyza^42.0-x0^2.0*7.639419404125287E-5/36.0*xyza^36.0-5.0/36.0*xyza^36.0-x0^3.0/6.0/4.0*xyza^4.0-1.0/70.0/8.0*xyza^8.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0*0.125*xyza^4.0-x0^3.0*0.041666666666666664*xyza^4.0+x0^23.0/877344.0*xyza^39.0-1.0/10080.0*xyza^10.0+7.936507936507937E-4*xyza^10.0-xy012^2.0*xy012/5.224464E7*xyza^73.0-1.0/1314.0*xyza^73.0-7.6103500761035E-4*xyza^73.0+x0^2.0/223860.0*xyza^42.0-1.0/10.5*xyza^42.0-0.09523809523809523*xyza^42.0-x0^2.0/471239.99999999994*xyza^36.0-1.0/7.2*xyza^36.0-0.1388888888888889*xyza^36.0-x0^3.0/24.0*xyza^4.0-1.0/560.0*xyza^8.0";
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

public static void TestCaseDiff121229() {
 UsageCalculus.TestCase = 121229;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*x^3*1*x/2*x^2-3*x^3*1*x1*x/2*x^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=228 EqnNumber=32 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[52, 32, 1, 2, 1, 3, 1, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 1, 1, 1, 10, 2, 3, 1, 1, 10, 2, 3, 8, 1, 10, 11, 12, 21]"+
"// DOEMatrixRow=[49, 34, 4, 3, 2, 3, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 34, 3, 1, 2, 1, 1, 2, 6, 3, 2, 3, 1, 3, 2, 15, 12]"+
//Tail EqnIndex=228 EqnNumber=32 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[52, 32, 1, 2, 1, 3, 1, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 1, 1, 1, 10, 2, 3, 1, 1, 10, 2, 3, 8, 1, 10, 11, 12, 21]"+
"// DOEMatrixRow=[49, 34, 4, 3, 2, 3, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 34, 3, 1, 2, 1, 1, 2, 6, 3, 2, 3, 1, 3, 2, 15, 12]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-1.5*x^6.0-1.5*x^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-1.5*6.0*x^5.0-1.5*6.0*x^5.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-9.0*x^5.0-9.0*x^5.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-1.5*x^6.0-1.5*x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.5/7.0*x^7.0-1.5/7.0*x^7.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/4.666666666666667*x^7.0-1.0/4.666666666666667*x^7.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-9.0*x^5.0-9.0*x^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-9.0*5.0*x^4.0-9.0*5.0*x^4.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-45.0*x^4.0-45.0*x^4.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/4.666666666666667*x^7.0-1.0/4.666666666666667*x^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/4.666666666666667/8.0*x^8.0-1.0/4.666666666666667/8.0*x^8.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/37.333333333333336*x^8.0-1.0/37.333333333333336*x^8.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-45.0*x^4.0-45.0*x^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-45.0*4.0*x^3.0-45.0*4.0*x^3.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-180.0*x^3.0-180.0*x^3.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/37.333333333333336*x^8.0-1.0/37.333333333333336*x^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/37.333333333333336/9.0*x^9.0-1.0/37.333333333333336/9.0*x^9.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/336.0*x^9.0-1.0/336.0*x^9.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-180.0*x^3.0-180.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-180.0*3.0*x^2.0-180.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-540.0*x^2.0-540.0*x^2.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/336.0*x^9.0-1.0/336.0*x^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/336.0/10.0*x^10.0-1.0/336.0/10.0*x^10.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/3360.0*x^10.0-1.0/3360.0*x^10.0";
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

public static void TestCaseDiff121230() {
 UsageCalculus.TestCase = 121230;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xy/2*xy^2*-3*xy^3*-1*xy2*x0^21*xy/2*xy^22*x0^2*-3*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=229 EqnNumber=33 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[16, 33, 2, 3, 2, 1, 2, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 2, 3, 11, 3, 1, 2, 3, 11, 3, 4, 9, 2, 11, 12, 13, 22]"+
"// DOEMatrixRow=[13, 35, 5, 4, 3, 1, 2, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 35, 4, 2, 3, 2, 3, 1, 1, 4, 3, 1, 2, 4, 1, 16, 13]"+
//Tail EqnIndex=229 EqnNumber=33 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[16, 33, 2, 3, 2, 1, 2, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 2, 3, 11, 3, 1, 2, 3, 11, 3, 4, 9, 2, 11, 12, 13, 22]"+
"// DOEMatrixRow=[13, 35, 5, 4, 3, 1, 2, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 35, 4, 2, 3, 2, 3, 1, 1, 4, 3, 1, 2, 4, 1, 16, 13]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^21.0*2.25*xy^29.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^21.0*2.25*29.0*xy^28.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^21.0*65.25*xy^28.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^21.0*2.25*xy^29.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^21.0*2.25/30.0*xy^30.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^21.0/13.333333333333334*xy^30.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^21.0*65.25*xy^28.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^21.0*65.25*28.0*xy^27.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^21.0*1827.0*xy^27.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^21.0/13.333333333333334*xy^30.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^21.0*13.333333333333334/31.0*xy^31.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^21.0/2.3249999999999997*xy^31.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^21.0*1827.0*xy^27.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^21.0*1827.0*27.0*xy^26.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^21.0*49329.0*xy^26.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^21.0/2.3249999999999997*xy^31.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^21.0*2.3249999999999997/32.0*xy^32.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^21.0/13.763440860215056*xy^32.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^21.0*49329.0*xy^26.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^21.0*49329.0*26.0*xy^25.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^21.0*1282554.0*xy^25.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^21.0/13.763440860215056*xy^32.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^21.0*13.763440860215056/33.0*xy^33.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^21.0/2.39765625*xy^33.0";
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

public static void TestCaseDiff121231() {
 UsageCalculus.TestCase = 121231;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*x0^23*xyz^3*-1*xyz-1*xyz/2*xyz^2*-3*xyz2*x0^2*-3*x0^33*xyz^3*-1*xyz";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=230 EqnNumber=34 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[82, 34, 3, 4, 3, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 3, 1, 1, 4, 3, 4, 12, 1, 2, 3, 4, 12, 1, 1, 10, 3, 12, 13, 14, 23]"+
"// DOEMatrixRow=[79, 36, 6, 1, 1, 2, 3, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 36, 5, 3, 1, 3, 1, 2, 3, 1, 1, 2, 3, 5, 2, 17, 14]"+
//Tail EqnIndex=230 EqnNumber=34 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[82, 34, 3, 4, 3, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 3, 1, 1, 4, 3, 4, 12, 1, 2, 3, 4, 12, 1, 1, 10, 3, 12, 13, 14, 23]"+
"// DOEMatrixRow=[79, 36, 6, 1, 1, 2, 3, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 36, 5, 3, 1, 3, 1, 2, 3, 1, 1, 2, 3, 5, 2, 17, 14]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^23.0*2.0*xyz^4.0+x0^2.0*4.5*xyz^7.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^23.0*2.0*4.0*xyz^3.0+x0^2.0*4.5*7.0*xyz^6.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^23.0*8.0*xyz^3.0+x0^2.0*31.5*xyz^6.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^23.0*2.0*xyz^4.0+x0^2.0*4.5*xyz^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^23.0*2.0/5.0*xyz^5.0+x0^2.0*4.5/8.0*xyz^8.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^23.0*0.4*xyz^5.0+x0^2.0/1.7777777777777777*xyz^8.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^23.0*8.0*xyz^3.0+x0^2.0*31.5*xyz^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^23.0*8.0*3.0*xyz^2.0+x0^2.0*31.5*6.0*xyz^5.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^23.0*24.0*xyz^2.0+x0^2.0*189.0*xyz^5.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^23.0*0.4*xyz^5.0+x0^2.0/1.7777777777777777*xyz^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^23.0*0.4/6.0*xyz^6.0+x0^2.0*1.7777777777777777/9.0*xyz^9.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^23.0*0.06666666666666667*xyz^6.0+x0^2.0/5.0625*xyz^9.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^23.0*24.0*xyz^2.0+x0^2.0*189.0*xyz^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^23.0*24.0*2.0*xyz^1.0+x0^2.0*189.0*5.0*xyz^4.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^23.0*48.0*xyz+x0^2.0*945.0*xyz^4.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^23.0*0.06666666666666667*xyz^6.0+x0^2.0/5.0625*xyz^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^23.0*0.06666666666666667/7.0*xyz^7.0+x0^2.0*5.0625/10.0*xyz^10.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^23.0*0.009523809523809523*xyz^7.0+x0^2.0/1.9753086419753085*xyz^10.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^23.0*48.0*xyz+x0^2.0*945.0*xyz^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^23.0*48.0+x0^2.0*945.0*4.0*xyz^3.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^23.0*48.0+x0^2.0*3780.0*xyz^3.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^23.0*0.009523809523809523*xyz^7.0+x0^2.0/1.9753086419753085*xyz^10.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^23.0*0.009523809523809523/8.0*xyz^8.0+x0^2.0*1.9753086419753085/11.0*xyz^11.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^23.0*0.0011904761904761904*xyz^8.0+x0^2.0/5.5687500000000005*xyz^11.0";
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

public static void TestCaseDiff121232() {
 UsageCalculus.TestCase = 121232;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xyza^3*-1*xyza-1*xyza/2*xyza^2*-3*xyza2*x0^2*-3*x0*1*x0^2/-3*x03*xyza3*xyza^3*-1*xyza-1*xyza/2*xyza^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=231 EqnNumber=35 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[47, 35, 4, 5, 4, 3, 1, 3, 1, 3, 4, 1, 1, 2, 3, 1, 2, 1, 5, 1, 1, 13, 2, 3, 1, 1, 13, 2, 3, 11, 4, 13, 14, 15, 24]"+
"// DOEMatrixRow=[44, 37, 7, 2, 3, 1, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 37, 6, 1, 2, 4, 2, 3, 4, 2, 3, 1, 4, 6, 1, 18, 15]"+
//Tail EqnIndex=231 EqnNumber=35 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[47, 35, 4, 5, 4, 3, 1, 3, 1, 3, 4, 1, 1, 2, 3, 1, 2, 1, 5, 1, 1, 13, 2, 3, 1, 1, 13, 2, 3, 11, 4, 13, 14, 15, 24]"+
"// DOEMatrixRow=[44, 37, 7, 2, 3, 1, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 37, 6, 1, 2, 4, 2, 3, 4, 2, 3, 1, 4, 6, 1, 18, 15]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-3.0*xyza^4.0-1.5*xyza^7.0-1.0/2.0*xyza^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-3.0*4.0*xyza^3.0-1.5*7.0*xyza^6.0-1.0/2.0*3.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-12.0*xyza^3.0-10.5*xyza^6.0-1.5*xyza^2.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-3.0*xyza^4.0-1.5*xyza^7.0-1.0/2.0*xyza^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-3.0/5.0*xyza^5.0-1.5/8.0*xyza^8.0-1.0/2.0/4.0*xyza^4.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/1.6666666666666667*xyza^5.0-1.0/5.333333333333333*xyza^8.0-1.0/8.0*xyza^4.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-12.0*xyza^3.0-10.5*xyza^6.0-1.5*xyza^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-12.0*3.0*xyza^2.0-10.5*6.0*xyza^5.0-1.5*2.0*xyza^1.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-36.0*xyza^2.0-63.0*xyza^5.0-3.0*xyza";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/1.6666666666666667*xyza^5.0-1.0/5.333333333333333*xyza^8.0-1.0/8.0*xyza^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/1.6666666666666667/6.0*xyza^6.0-1.0/5.333333333333333/9.0*xyza^9.0-1.0/8.0/5.0*xyza^5.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/10.0*xyza^6.0-1.0/48.0*xyza^9.0-1.0/40.0*xyza^5.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-36.0*xyza^2.0-63.0*xyza^5.0-3.0*xyza";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-36.0*2.0*xyza^1.0-63.0*5.0*xyza^4.0-3.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-72.0*xyza-315.0*xyza^4.0-3.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/10.0*xyza^6.0-1.0/48.0*xyza^9.0-1.0/40.0*xyza^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/10.0/7.0*xyza^7.0-1.0/48.0/10.0*xyza^10.0-1.0/40.0/6.0*xyza^6.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/70.0*xyza^7.0-1.0/480.0*xyza^10.0-1.0/240.0*xyza^6.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-72.0*xyza-315.0*xyza^4.0-3.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-72.0-315.0*4.0*xyza^3.0-3.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-72.0-1260.0*xyza^3.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/70.0*xyza^7.0-1.0/480.0*xyza^10.0-1.0/240.0*xyza^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/70.0/8.0*xyza^8.0-1.0/480.0/11.0*xyza^11.0-1.0/240.0/7.0*xyza^7.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/560.0*xyza^8.0-1.0/5280.0*xyza^11.0-1.0/1680.0*xyza^7.0";
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

public static void TestCaseDiff121233() {
 UsageCalculus.TestCase = 121233;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-1*x/2*x^2*-3*x2*x0^2*-3*x0*1*x0^2/-3*x03*x1*x^2/-3*x-3*x*-1*x^2*2*x-1*x/2*x^22*x0^2*-3*x0";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=232 EqnNumber=36 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[11, 36, 5, 6, 1, 1, 2, 4, 2, 4, 1, 2, 3, 1, 4, 2, 3, 2, 1, 2, 3, 14, 3, 1, 2, 3, 14, 3, 4, 12, 1, 14, 15, 16, 25]"+
"// DOEMatrixRow=[8, 38, 8, 3, 1, 2, 3, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 38, 7, 2, 3, 5, 3, 1, 5, 3, 1, 2, 1, 7, 2, 19, 16]"+
//Tail EqnIndex=232 EqnNumber=36 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[11, 36, 5, 6, 1, 1, 2, 4, 2, 4, 1, 2, 3, 1, 4, 2, 3, 2, 1, 2, 3, 14, 3, 1, 2, 3, 14, 3, 4, 12, 1, 14, 15, 16, 25]"+
"// DOEMatrixRow=[8, 38, 8, 3, 1, 2, 3, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 38, 7, 2, 3, 5, 3, 1, 5, 3, 1, 2, 1, 7, 2, 19, 16]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-1.0/2.0*x^6.0+6.0*x^4.0+1.5*x^23.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-1.0/2.0*6.0*x^5.0+6.0*4.0*x^3.0+1.5*23.0*x^22.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-3.0*x^5.0+24.0*x^3.0+34.5*x^22.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-1.0/2.0*x^6.0+6.0*x^4.0+1.5*x^23.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.0/2.0/7.0*x^7.0+6.0/5.0*x^5.0+1.5/24.0*x^24.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/14.0*x^7.0+1.2*x^5.0+1.0/16.0*x^24.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-3.0*x^5.0+24.0*x^3.0+34.5*x^22.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-3.0*5.0*x^4.0+24.0*3.0*x^2.0+34.5*22.0*x^21.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-15.0*x^4.0+72.0*x^2.0+759.0*x^21.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/14.0*x^7.0+1.2*x^5.0+1.0/16.0*x^24.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/14.0/8.0*x^8.0+1.2/6.0*x^6.0+1.0/16.0/25.0*x^25.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/112.0*x^8.0+1.0/5.0*x^6.0+1.0/400.0*x^25.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-15.0*x^4.0+72.0*x^2.0+759.0*x^21.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-15.0*4.0*x^3.0+72.0*2.0*x^1.0+759.0*21.0*x^20.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-60.0*x^3.0+144.0*x+15939.0*x^20.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/112.0*x^8.0+1.0/5.0*x^6.0+1.0/400.0*x^25.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/112.0/9.0*x^9.0+1.0/5.0/7.0*x^7.0+1.0/400.0/26.0*x^26.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/1008.0*x^9.0+1.0/35.0*x^7.0+1.0/10400.0*x^26.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-60.0*x^3.0+144.0*x+15939.0*x^20.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-60.0*3.0*x^2.0+144.0+15939.0*20.0*x^19.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-180.0*x^2.0+144.0+318780.0*x^19.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/1008.0*x^9.0+1.0/35.0*x^7.0+1.0/10400.0*x^26.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/1008.0/10.0*x^10.0+1.0/35.0/8.0*x^8.0+1.0/10400.0/27.0*x^27.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/10080.0*x^10.0+1.0/280.0*x^8.0+1.0/280800.0*x^27.0";
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

public static void TestCaseDiff121234() {
 UsageCalculus.TestCase = 121234;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*x0^2*-3*x0*1*x0^2/-3*x03*xy1*xy^2/-3*xy-3*xy*-1*xy^2*2*xy1*xy012^2*2*xy012/3*xy012^2*-1*xy0122*xy2*x0^2*-3*x03*xy*1*xy^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=233 EqnNumber=37 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[77, 37, 6, 7, 2, 3, 1, 5, 3, 1, 2, 1, 1, 2, 1, 3, 1, 1, 2, 3, 4, 15, 1, 2, 3, 4, 15, 1, 1, 13, 2, 15, 16, 17, 26]"+
"// DOEMatrixRow=[73, 39, 9, 4, 2, 3, 1, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 39, 8, 3, 1, 1, 1, 2, 6, 4, 2, 3, 2, 8, 1, 20, 17]"+
//Tail EqnIndex=233 EqnNumber=37 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[77, 37, 6, 7, 2, 3, 1, 5, 3, 1, 2, 1, 1, 2, 1, 3, 1, 1, 2, 3, 4, 15, 1, 2, 3, 4, 15, 1, 1, 13, 2, 15, 16, 17, 26]"+
"// DOEMatrixRow=[73, 39, 9, 4, 2, 3, 1, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 39, 8, 3, 1, 1, 1, 2, 6, 4, 2, 3, 2, 8, 1, 20, 17]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-1.0/1.5*xy^3.0+x0^2.0*x03*12.0*xy^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-1.0/1.5*3.0*xy^2.0+x0^2.0*x03*6.0*xy^5.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-2.0*xy^2.0+x0^2.0*x03*6.0*xy^5.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-1.0/1.5*xy^3.0+x0^2.0*x03*12.0*xy^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.0/1.5/4.0*xy^4.0+x0^2.0*x03*12.0/7.0*xy^7.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-0.16666666666666666*xy^4.0+x0^2.0*x03*1.7142857142857142*xy^7.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-2.0*xy^2.0+x0^2.0*x03*6.0*xy^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-2.0*2.0*xy^1.0+x0^2.0*x03*5.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-4.0*xy+x0^2.0*x03*5.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-0.16666666666666666*xy^4.0+x0^2.0*x03*1.7142857142857142*xy^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-0.16666666666666666/5.0*xy^5.0+x0^2.0*x03*1.7142857142857142/8.0*xy^8.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-0.03333333333333333*xy^5.0+x0^2.0*x03/4.666666666666667*xy^8.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-4.0*xy+x0^2.0*x03*5.0*xy^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-4.0+x0^2.0*x03*4.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-4.0+x0^2.0*x03*4.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-0.03333333333333333*xy^5.0+x0^2.0*x03/4.666666666666667*xy^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-0.03333333333333333/6.0*xy^6.0+x0^2.0*x03/4.666666666666667/9.0*xy^9.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-0.005555555555555556*xy^6.0+x0^2.0*x03/42.0*xy^9.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-4.0+x0^2.0*x03*4.0*xy^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0+x0^2.0*x03*3.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*x03*3.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-0.005555555555555556*xy^6.0+x0^2.0*x03/42.0*xy^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-0.005555555555555556/7.0*xy^7.0+x0^2.0*x03/42.0/10.0*xy^10.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-7.936507936507937E-4*xy^7.0+x0^2.0*x03/420.0*xy^10.0";
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

public static void TestCaseDiff121235() {
 UsageCalculus.TestCase = 121235;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xyz1*xyz^2/-3*xyz-3*xyz*-1*xyz^2*2*xyz1*xy012^2*2*xy012/3*xy012^2*-1*xy0122*xyz3*xyz^2*-1*xyz-1*xyz/2*xyz^2*-3*xyz^33*xyz*1*xyz^21*xyz^2/-3*xyz";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=234 EqnNumber=38 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[42, 38, 7, 8, 3, 1, 2, 6, 1, 2, 3, 2, 3, 1, 2, 1, 2, 1, 3, 1, 1, 16, 2, 3, 1, 1, 16, 2, 3, 14, 3, 16, 1, 18, 27]"+
"// DOEMatrixRow=[39, 40, 10, 1, 3, 1, 2, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 40, 9, 1, 2, 3, 2, 3, 1, 1, 3, 1, 3, 9, 2, 1, 18]"+
//Tail EqnIndex=234 EqnNumber=38 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[42, 38, 7, 8, 3, 1, 2, 6, 1, 2, 3, 2, 3, 1, 2, 1, 2, 1, 3, 1, 1, 16, 2, 3, 1, 1, 16, 2, 3, 14, 3, 16, 1, 18, 27]"+
"// DOEMatrixRow=[39, 40, 10, 1, 3, 1, 2, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 40, 9, 1, 2, 3, 2, 3, 1, 1, 3, 1, 3, 9, 2, 1, 18]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-xyz^3.0+4.0*xyz^6.0-1.0/2.0*xyz^61.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-3.0*xyz^2.0+4.0*6.0*xyz^5.0-1.0/2.0*61.0*xyz^60.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-3.0*xyz^2.0+24.0*xyz^5.0-30.5*xyz^60.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-xyz^3.0+4.0*xyz^6.0-1.0/2.0*xyz^61.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.0/4.0*xyz^4.0+4.0/7.0*xyz^7.0-1.0/2.0/62.0*xyz^62.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/4.0*xyz^4.0+1.0/1.75*xyz^7.0-1.0/124.0*xyz^62.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-3.0*xyz^2.0+24.0*xyz^5.0-30.5*xyz^60.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-3.0*2.0*xyz^1.0+24.0*5.0*xyz^4.0-30.5*60.0*xyz^59.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-6.0*xyz+120.0*xyz^4.0-1830.0*xyz^59.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/4.0*xyz^4.0+1.0/1.75*xyz^7.0-1.0/124.0*xyz^62.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/4.0/5.0*xyz^5.0+1.0/1.75/8.0*xyz^8.0-1.0/124.0/63.0*xyz^63.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/20.0*xyz^5.0+1.0/14.0*xyz^8.0-1.0/7812.0*xyz^63.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-6.0*xyz+120.0*xyz^4.0-1830.0*xyz^59.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-6.0+120.0*4.0*xyz^3.0-1830.0*59.0*xyz^58.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-6.0+480.0*xyz^3.0-107970.0*xyz^58.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/20.0*xyz^5.0+1.0/14.0*xyz^8.0-1.0/7812.0*xyz^63.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/20.0/6.0*xyz^6.0+1.0/14.0/9.0*xyz^9.0-1.0/7812.0/64.0*xyz^64.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/120.0*xyz^6.0+1.0/126.0*xyz^9.0-1.0/499968.0*xyz^64.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-6.0+480.0*xyz^3.0-107970.0*xyz^58.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0+480.0*3.0*xyz^2.0-107970.0*58.0*xyz^57.0";
 UsageCalculus.EqnSolArrayMap2[4] = "1440.0*xyz^2.0-6262260.0*xyz^57.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/120.0*xyz^6.0+1.0/126.0*xyz^9.0-1.0/499968.0*xyz^64.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/120.0/7.0*xyz^7.0+1.0/126.0/10.0*xyz^10.0-1.0/499968.0/65.0*xyz^65.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/840.0*xyz^7.0+1.0/1260.0*xyz^10.0-1.0/3.249792E7*xyz^65.0";
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

public static void TestCaseDiff121236() {
 UsageCalculus.TestCase = 121236;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xyza^2/-3*xyza-3*xyza*-1*xyza^2*2*xyza1*xy012^2*2*xy012/3*xy012^2*-1*xy0122*xyza3*xyza^2*-1*xyza-1*xyza/2*xyza^2*-3*xyza^32*xy012^2*-3*xy012^3*1*xy012/-3*xy012^23*xyza^31*xyza^2/-3*xyza-3*xyza*-1*xyza^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=235 EqnNumber=39 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[6, 39, 8, 9, 4, 2, 3, 7, 2, 3, 4, 1, 1, 2, 3, 2, 3, 2, 4, 2, 3, 1, 3, 1, 2, 3, 1, 3, 4, 15, 4, 17, 2, 19, 28]"+
"// DOEMatrixRow=[3, 41, 11, 2, 1, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 3, 1, 41, 10, 2, 3, 4, 3, 1, 2, 3, 1, 2, 4, 10, 1, 2, 19]"+
//Tail EqnIndex=235 EqnNumber=39 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[6, 39, 8, 9, 4, 2, 3, 7, 2, 3, 4, 1, 1, 2, 3, 2, 3, 2, 4, 2, 3, 1, 3, 1, 2, 3, 1, 3, 4, 15, 4, 17, 2, 19, 28]"+
"// DOEMatrixRow=[3, 41, 11, 2, 1, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 3, 1, 41, 10, 2, 3, 4, 3, 1, 2, 3, 1, 2, 4, 10, 1, 2, 19]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-1.0/3.0*xyza^3.0+4.0*xyza^6.0-xy012^2.0*xy012/2.0*xyza^69.0+3.0*xyza^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-1.0/3.0*3.0*xyza^2.0+4.0*6.0*xyza^5.0-xy012^2.0*xy012/2.0*69.0*xyza^68.0+3.0*3.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-xyza^2.0+24.0*xyza^5.0-xy012^2.0*xy012*34.5*xyza^68.0+9.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-1.0/3.0*xyza^3.0+4.0*xyza^6.0-xy012^2.0*xy012/2.0*xyza^69.0+3.0*xyza^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.0/3.0/4.0*xyza^4.0+4.0/7.0*xyza^7.0-xy012^2.0*xy012/2.0/70.0*xyza^70.0+3.0/4.0*xyza^4.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/12.0*xyza^4.0+0.5714285714285714*xyza^7.0-xy012^2.0*xy012/140.0*xyza^70.0+1.0/1.3333333333333333*xyza^4.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-xyza^2.0+24.0*xyza^5.0-xy012^2.0*xy012*34.5*xyza^68.0+9.0*xyza^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-2.0*xyza^1.0+24.0*5.0*xyza^4.0-xy012^2.0*xy012*34.5*68.0*xyza^67.0+9.0*2.0*xyza^1.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-2.0*xyza+120.0*xyza^4.0-xy012^2.0*xy012*2346.0*xyza^67.0+18.0*xyza";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/12.0*xyza^4.0+0.5714285714285714*xyza^7.0-xy012^2.0*xy012/140.0*xyza^70.0+1.0/1.3333333333333333*xyza^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/12.0/5.0*xyza^5.0+0.5714285714285714/8.0*xyza^8.0-xy012^2.0*xy012/140.0/71.0*xyza^71.0+1.0/1.3333333333333333/5.0*xyza^5.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/60.0*xyza^5.0+0.07142857142857142*xyza^8.0-xy012^2.0*xy012/9940.0*xyza^71.0+1.0/6.666666666666666*xyza^5.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-2.0*xyza+120.0*xyza^4.0-xy012^2.0*xy012*2346.0*xyza^67.0+18.0*xyza";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-2.0+120.0*4.0*xyza^3.0-xy012^2.0*xy012*2346.0*67.0*xyza^66.0+18.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-2.0+480.0*xyza^3.0-xy012^2.0*xy012*157182.0*xyza^66.0+18.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/60.0*xyza^5.0+0.07142857142857142*xyza^8.0-xy012^2.0*xy012/9940.0*xyza^71.0+1.0/6.666666666666666*xyza^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/60.0/6.0*xyza^6.0+0.07142857142857142/9.0*xyza^9.0-xy012^2.0*xy012/9940.0/72.0*xyza^72.0+1.0/6.666666666666666/6.0*xyza^6.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/360.0*xyza^6.0+0.007936507936507936*xyza^9.0-xy012^2.0*xy012/715680.0*xyza^72.0+1.0/40.0*xyza^6.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-2.0+480.0*xyza^3.0-xy012^2.0*xy012*157182.0*xyza^66.0+18.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0+480.0*3.0*xyza^2.0-xy012^2.0*xy012*157182.0*66.0*xyza^65.0+18.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "1440.0*xyza^2.0-xy012^2.0*xy012*1.0374012E7*xyza^65.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/360.0*xyza^6.0+0.007936507936507936*xyza^9.0-xy012^2.0*xy012/715680.0*xyza^72.0+1.0/40.0*xyza^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/360.0/7.0*xyza^7.0+0.007936507936507936/10.0*xyza^10.0-xy012^2.0*xy012/715680.0/73.0*xyza^73.0+1.0/40.0/7.0*xyza^7.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/2520.0*xyza^7.0+7.936507936507937E-4*xyza^10.0-xy012^2.0*xy012/5.224464E7*xyza^73.0+1.0/280.0*xyza^7.0";
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

public static void TestCaseDiff121237() {
 UsageCalculus.TestCase = 121237;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*x*-1*x^2*2*x1*xy012^2*2*xy012/3*xy012^2*-1*xy0122*x3*x^2*-1*x-1*x/2*x^2*-3*x^32*xy012^2*-3*xy012^3*1*xy012/-3*xy012^23*x^31*x/-3*x^2-3*x0^2*-1*x0^3*2*x0-3*x*-1*x^21*xy012^2*2*xy012";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=236 EqnNumber=40 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[71, 40, 9, 10, 1, 3, 1, 8, 3, 4, 1, 2, 3, 1, 4, 3, 1, 1, 5, 3, 4, 2, 1, 2, 3, 4, 2, 1, 1, 16, 1, 18, 3, 20, 29]"+
"// DOEMatrixRow=[68, 42, 12, 3, 2, 3, 1, 3, 1, 3, 4, 1, 1, 2, 3, 1, 2, 42, 1, 3, 1, 5, 1, 2, 3, 4, 2, 3, 1, 11, 2, 3, 20]"+
//Tail EqnIndex=236 EqnNumber=40 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[71, 40, 9, 10, 1, 3, 1, 8, 3, 4, 1, 2, 3, 1, 4, 3, 1, 1, 5, 3, 4, 2, 1, 2, 3, 4, 2, 1, 1, 16, 1, 18, 3, 20, 29]"+
"// DOEMatrixRow=[68, 42, 12, 3, 2, 3, 1, 3, 1, 3, 4, 1, 1, 2, 3, 1, 2, 42, 1, 3, 1, 5, 1, 2, 3, 4, 2, 3, 1, 11, 2, 3, 20]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "4.0*x^6.0-1.0/2.0*x^69.0+6.0+6.0*x^22.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "4.0*6.0*x^5.0-1.0/2.0*69.0*x^68.0+6.0*0.0+6.0*22.0*x^21.0";
 UsageCalculus.EqnSolArrayMap2[1] = "24.0*x^5.0-34.5*x^68.0+132.0*x^21.0";
 UsageCalculus.EqnSolArrayMap3[1] = "4.0*x^6.0-1.0/2.0*x^69.0+6.0+6.0*x^22.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "4.0/7.0*x^7.0-1.0/2.0/70.0*x^70.0+6.0*x+6.0/23.0*x^23.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/1.75*x^7.0-1.0/140.0*x^70.0+6.0*x+1.0/3.8333333333333335*x^23.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "24.0*x^5.0-34.5*x^68.0+132.0*x^21.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "24.0*5.0*x^4.0-34.5*68.0*x^67.0+132.0*21.0*x^20.0";
 UsageCalculus.EqnSolArrayMap2[2] = "120.0*x^4.0-2346.0*x^67.0+2772.0*x^20.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/1.75*x^7.0-1.0/140.0*x^70.0+6.0*x+1.0/3.8333333333333335*x^23.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/1.75/8.0*x^8.0-1.0/140.0/71.0*x^71.0+6.0/2.0*x^2.0+1.0/3.8333333333333335/24.0*x^24.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/14.0*x^8.0-1.0/9940.0*x^71.0+3.0*x^2.0+1.0/92.0*x^24.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "120.0*x^4.0-2346.0*x^67.0+2772.0*x^20.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "120.0*4.0*x^3.0-2346.0*67.0*x^66.0+2772.0*20.0*x^19.0";
 UsageCalculus.EqnSolArrayMap2[3] = "480.0*x^3.0-157182.0*x^66.0+55440.0*x^19.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/14.0*x^8.0-1.0/9940.0*x^71.0+3.0*x^2.0+1.0/92.0*x^24.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/14.0/9.0*x^9.0-1.0/9940.0/72.0*x^72.0+3.0/3.0*x^3.0+1.0/92.0/25.0*x^25.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/126.0*x^9.0-1.0/715680.0*x^72.0+x^3.0+1.0/2300.0*x^25.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "480.0*x^3.0-157182.0*x^66.0+55440.0*x^19.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "480.0*3.0*x^2.0-157182.0*66.0*x^65.0+55440.0*19.0*x^18.0";
 UsageCalculus.EqnSolArrayMap2[4] = "1440.0*x^2.0-1.0374012E7*x^65.0+1053360.0*x^18.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/126.0*x^9.0-1.3972725240330875E-6*x^72.0+x^3.0+1.0/2300.0*x^25.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/126.0/10.0*x^10.0-1.3972725240330875E-6/73.0*x^73.0+1.0/4.0*x^4.0+1.0/2300.0/26.0*x^26.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/1260.0*x^10.0-1.0/5.224464E7*x^73.0-1.0/12.166666666666666*x^73.0+1.0/4.0*x^4.0+1.0/59800.0*x^26.0";
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

public static void TestCaseDiff121238() {
 UsageCalculus.TestCase = 121238;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xy012^2*2*xy012/3*xy012^2*-1*xy0122*xy3*xy^2*-1*xy-1*xy/2*xy^2*-3*xy^32*xy012^2*-3*xy012^3*1*xy012/-3*xy012^23*xy^31*xy/-3*xy^2-3*x0^2*-1*x0^3*2*x01*xy^3*2*xy/3*xy^2*--1*xy^32*xy1*xy012^2*2*xy0122*xy/3*xy^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=237 EqnNumber=41 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[37, 41, 10, 11, 2, 1, 2, 9, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 3, 2, 3, 1, 1, 3, 2, 3, 1, 2, 19, 4, 21, 30]"+
"// DOEMatrixRow=[34, 43, 13, 4, 3, 1, 2, 4, 2, 4, 1, 2, 3, 1, 4, 2, 3, 43, 2, 1, 2, 1, 2, 3, 4, 1, 3, 1, 2, 12, 1, 4, 1]"+
//Tail EqnIndex=237 EqnNumber=41 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[37, 41, 10, 11, 2, 1, 2, 9, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 3, 2, 3, 1, 1, 3, 2, 3, 1, 2, 19, 4, 21, 30]"+
"// DOEMatrixRow=[34, 43, 13, 4, 3, 1, 2, 4, 2, 4, 1, 2, 3, 1, 4, 2, 3, 43, 2, 1, 2, 1, 2, 3, 4, 1, 3, 1, 2, 12, 1, 4, 1]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "1.0/1.5*xy^3.0-1.0/2.0*xy^69.0+2.6666666666666665*xy^41.0-1.0/1.5*xy^35.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/1.5*3.0*xy^2.0-1.0/2.0*69.0*xy^68.0+2.6666666666666665*41.0*xy^40.0-1.0/1.5*35.0*xy^34.0";
 UsageCalculus.EqnSolArrayMap2[1] = "2.0*xy^2.0-34.5*xy^68.0+109.33333333333333*xy^40.0-23.333333333333332*xy^34.0";
 UsageCalculus.EqnSolArrayMap3[1] = "1.0/1.5*xy^3.0-1.0/2.0*xy^69.0+2.6666666666666665*xy^41.0-1.0/1.5*xy^35.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0/1.5/4.0*xy^4.0-1.0/2.0/70.0*xy^70.0+2.6666666666666665/42.0*xy^42.0-1.0/1.5/36.0*xy^36.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/6.0*xy^4.0-1.0/140.0*xy^70.0+1.0/15.75*xy^42.0-1.0/54.0*xy^36.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "2.0*xy^2.0-34.5*xy^68.0+109.33333333333333*xy^40.0-23.333333333333332*xy^34.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "2.0*2.0*xy^1.0-34.5*68.0*xy^67.0+109.33333333333333*40.0*xy^39.0-23.333333333333332*34.0*xy^33.0";
 UsageCalculus.EqnSolArrayMap2[2] = "4.0*xy-2346.0*xy^67.0+4373.333333333333*xy^39.0-793.3333333333333*xy^33.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/6.0*xy^4.0-1.0/140.0*xy^70.0+1.0/15.75*xy^42.0-1.0/54.0*xy^36.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/6.0/5.0*xy^5.0-1.0/140.0/71.0*xy^71.0+1.0/15.75/43.0*xy^43.0-1.0/54.0/37.0*xy^37.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/30.0*xy^5.0-1.0/9940.0*xy^71.0+1.0/677.25*xy^43.0-1.0/1998.0*xy^37.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "4.0*xy-2346.0*xy^67.0+4373.333333333333*xy^39.0-793.3333333333333*xy^33.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "4.0-2346.0*67.0*xy^66.0+4373.333333333333*39.0*xy^38.0-793.3333333333333*33.0*xy^32.0";
 UsageCalculus.EqnSolArrayMap2[3] = "4.0-157182.0*xy^66.0+170560.0*xy^38.0-26179.999999999996*xy^32.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/30.0*xy^5.0-1.0/9940.0*xy^71.0+1.0/677.25*xy^43.0-1.0/1998.0*xy^37.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/30.0/6.0*xy^6.0-1.0/9940.0/72.0*xy^72.0+1.0/677.25/44.0*xy^44.0-1.0/1998.0/38.0*xy^38.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/180.0*xy^6.0-1.0/715680.0*xy^72.0+1.0/29799.0*xy^44.0-1.0/75924.0*xy^38.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "4.0-157182.0*xy^66.0+170560.0*xy^38.0-26179.999999999996*xy^32.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "0.0-157182.0*66.0*xy^65.0+170560.0*38.0*xy^37.0-26179.999999999996*32.0*xy^31.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1.0374012E7*xy^65.0+6481280.0*xy^37.0-837759.9999999999*xy^31.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/180.0*xy^6.0-1.0/715680.0*xy^72.0+1.0/29799.0*xy^44.0-1.0/75924.0*xy^38.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/180.0/7.0*xy^7.0-1.0/715680.0/73.0*xy^73.0+1.0/29799.0/45.0*xy^45.0-1.0/75924.0/39.0*xy^39.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/1260.0*xy^7.0-1.0/5.224464E7*xy^73.0+1.0/1340955.0*xy^45.0-1.0/2961036.0*xy^39.0";
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

public static void TestCaseDiff121239() {
 UsageCalculus.TestCase = 121239;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xyz3*xyz^2*-1*xyz-1*xyz/2*xyz^2*-3*xyz^32*xy012^2*-3*xy012^3*1*xy012/-3*xy012^23*xyz^31*xyz/-3*xyz^2-3*x0^2*-1*x0^3*2*x01*xyz^3*2*xyz/3*xyz^2*--1*xyz^32*xyz3*x0^2*--1*x0^3-1*xyz^3*2*xyz/3*xyz^22*xyz/3*xyz^23*xyz^2*-1*xyz";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=238 EqnNumber=42 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[2, 42, 11, 12, 3, 2, 3, 10, 2, 3, 4, 2, 3, 1, 2, 3, 1, 2, 3, 2, 3, 4, 3, 1, 2, 3, 4, 3, 4, 2, 3, 20, 5, 22, 31]"+
"// DOEMatrixRow=[99, 44, 14, 1, 1, 2, 3, 5, 3, 1, 2, 1, 1, 2, 1, 3, 1, 44, 3, 2, 3, 2, 3, 1, 5, 2, 1, 2, 3, 13, 2, 5, 2]"+
//Tail EqnIndex=238 EqnNumber=42 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[2, 42, 11, 12, 3, 2, 3, 10, 2, 3, 4, 2, 3, 1, 2, 3, 1, 2, 3, 2, 3, 4, 3, 1, 2, 3, 4, 3, 4, 2, 3, 20, 5, 22, 31]"+
"// DOEMatrixRow=[99, 44, 14, 1, 1, 2, 3, 5, 3, 1, 2, 1, 1, 2, 1, 3, 1, 44, 3, 2, 3, 2, 3, 1, 5, 2, 1, 2, 3, 13, 2, 5, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-2.0*xyz^3.0-xy012^2.0*xy012/2.0*xyz^69.0+x0^2.0*4.0*xyz^38.0-x0^2.0*xyz^32.0-x0^3.0+1.0/4.5*xyz^53.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-2.0*3.0*xyz^2.0-xy012^2.0*xy012/2.0*69.0*xyz^68.0+x0^2.0*4.0*38.0*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0+1.0/4.5*53.0*xyz^52.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-6.0*xyz^2.0-xy012^2.0*xy012*34.5*xyz^68.0+x0^2.0*152.0*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0+11.777777777777779*xyz^52.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-2.0*xyz^3.0-xy012^2.0*xy012/2.0*xyz^69.0+x0^2.0*4.0*xyz^38.0-x0^2.0*xyz^32.0-x0^3.0+1.0/4.5*xyz^53.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-2.0/4.0*xyz^4.0-xy012^2.0*xy012/2.0/70.0*xyz^70.0+x0^2.0*4.0/39.0*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz+1.0/4.5/54.0*xyz^54.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-0.5*xyz^4.0-xy012^2.0*xy012*0.007142857142857143*xyz^70.0+x0^2.0*0.10256410256410256*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz+1.0/243.0*xyz^54.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-6.0*xyz^2.0-xy012^2.0*xy012*34.5*xyz^68.0+x0^2.0*152.0*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0+11.777777777777779*xyz^52.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-6.0*2.0*xyz^1.0-xy012^2.0*xy012*34.5*68.0*xyz^67.0+x0^2.0*152.0*37.0*xyz^36.0-x0^2.0*32.0*31.0*xyz^30.0-x0^3.0*0.0*0.0+11.777777777777779*52.0*xyz^51.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-12.0*xyz-xy012^2.0*xy012*2346.0*xyz^67.0+x0^2.0*5624.0*xyz^36.0-x0^2.0*992.0*xyz^30.0-x0^3.0*0.0+612.4444444444445*xyz^51.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-0.5*xyz^4.0-xy012^2.0*xy012*0.007142857142857143*xyz^70.0+x0^2.0*0.10256410256410256*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz+1.0/243.0*xyz^54.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-0.5/5.0*xyz^5.0-xy012^2.0*xy012*0.007142857142857143/71.0*xyz^71.0+x0^2.0*0.10256410256410256/40.0*xyz^40.0-x0^2.0/33.0/34.0*xyz^34.0-x0^3.0/2.0*xyz^2.0+1.0/243.0/55.0*xyz^55.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-0.1*xyz^5.0-xy012^2.0*xy012*1.0060362173038229E-4*xyz^71.0+x0^2.0*0.002564102564102564*xyz^40.0-x0^2.0*8.9126559714795E-4*xyz^34.0-x0^3.0/2.0*xyz^2.0+1.0/13365.0*xyz^55.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-12.0*xyz-xy012^2.0*xy012*2346.0*xyz^67.0+x0^2.0*5624.0*xyz^36.0-x0^2.0*992.0*xyz^30.0-x0^3.0*0.0+612.4444444444445*xyz^51.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-12.0-xy012^2.0*xy012*2346.0*67.0*xyz^66.0+x0^2.0*5624.0*36.0*xyz^35.0-x0^2.0*992.0*30.0*xyz^29.0-x0^3.0*0.0*0.0+612.4444444444445*51.0*xyz^50.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-12.0-xy012^2.0*xy012*157182.0*xyz^66.0+x0^2.0*202464.0*xyz^35.0-x0^2.0*29760.0*xyz^29.0-x0^3.0*0.0+31234.666666666668*xyz^50.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-0.1*xyz^5.0-xy012^2.0*xy012*1.0060362173038229E-4*xyz^71.0-4.0*xyz^71.0+x0^2.0*0.002564102564102564*xyz^40.0-x0^2.0*8.9126559714795E-4*xyz^34.0-4.0*xyz^34.0-x0^3.0/2.0*xyz^2.0+1.0/13365.0*xyz^55.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-0.1/6.0*xyz^6.0-xy012^2.0*xy012*1.0060362173038229E-4/72.0*xyz^72.0-4.0/72.0*xyz^72.0+x0^2.0*0.002564102564102564/41.0*xyz^41.0-x0^2.0*8.9126559714795E-4/35.0*xyz^35.0-4.0/35.0*xyz^35.0-x0^3.0/2.0/3.0*xyz^3.0+1.0/13365.0/56.0*xyz^56.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-0.016666666666666666*xyz^6.0-xy012^2.0*xy012/715680.0*xyz^72.0-1.0/18.0*xyz^72.0-0.05555555555555555*xyz^72.0+x0^2.0*6.253908692933083E-5*xyz^41.0-x0^2.0/39270.0*xyz^35.0-1.0/8.75*xyz^35.0-0.11428571428571428*xyz^35.0-x0^3.0/6.0*xyz^3.0+1.0/748440.0*xyz^56.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-12.0-xy012^2.0*xy012*157182.0*xyz^66.0+x0^2.0*202464.0*xyz^35.0-x0^2.0*29760.0*xyz^29.0-x0^3.0*0.0+31234.666666666668*xyz^50.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0-xy012^2.0*xy012*157182.0*66.0*xyz^65.0+x0^2.0*202464.0*35.0*xyz^34.0-x0^2.0*29760.0*29.0*xyz^28.0-x0^3.0*0.0*0.0+31234.666666666668*50.0*xyz^49.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-xy012^2.0*xy012*1.0374012E7*xyz^65.0+x0^2.0*7086240.0*xyz^34.0-x0^2.0*863040.0*xyz^28.0-x0^3.0*0.0+1561733.3333333335*xyz^49.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-0.016666666666666666*xyz^6.0-xy012^2.0*xy012/715680.0*xyz^72.0-1.0/18.0*xyz^72.0-0.05555555555555555*xyz^72.0+x0^2.0*6.253908692933083E-5*xyz^41.0-5.0*xyz^41.0-x0^2.0/39270.0*xyz^35.0-1.0/8.75*xyz^35.0-0.11428571428571428*xyz^35.0-x0^3.0/6.0*xyz^3.0+1.0/748440.0*xyz^56.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-0.016666666666666666/7.0*xyz^7.0-xy012^2.0*xy012/715680.0/73.0*xyz^73.0-1.0/18.0/73.0*xyz^73.0-0.05555555555555555/73.0*xyz^73.0+x0^2.0*6.253908692933083E-5/42.0*xyz^42.0-5.0/42.0*xyz^42.0-x0^2.0/39270.0/36.0*xyz^36.0-1.0/8.75/36.0*xyz^36.0-0.11428571428571428/36.0*xyz^36.0-x0^3.0/6.0/4.0*xyz^4.0+1.0/748440.0/57.0*xyz^57.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-0.0023809523809523807*xyz^7.0-xy012^2.0*xy012/5.224464E7*xyz^73.0-1.0/1314.0*xyz^73.0-7.6103500761035E-4*xyz^73.0+x0^2.0/671580.0*xyz^42.0-1.0/8.4*xyz^42.0-0.11904761904761904*xyz^42.0-x0^2.0/1413720.0*xyz^36.0-1.0/315.0*xyz^36.0-0.0031746031746031746*xyz^36.0-x0^3.0/24.0*xyz^4.0+1.0/4.266108E7*xyz^57.0";
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

public static void TestCaseDiff121240() {
 UsageCalculus.TestCase = 121240;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xyza^2*-1*xyza-1*xyza/2*xyza^2*-3*xyza^32*xy012^2*-3*xy012^3*1*xy012/-3*xy012^23*xyza^31*xyza/-3*xyza^2-3*x0^2*-1*x0^3*2*x01*xyza^3*2*xyza/3*xyza^2*--1*xyza^32*xyza3*x0^2*--1*x0^3-1*xyza^3*2*xyza/3*xyza^22*xyza/3*xyza^2*-1*xyza^3*-3*xyza3*x0^23*xyza^2*-1*xyza-1*xyza/2*xyza^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=239 EqnNumber=43 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[66, 43, 12, 13, 4, 3, 1, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 4, 3, 4, 5, 1, 2, 3, 4, 5, 1, 1, 3, 4, 21, 6, 23, 32]"+
"// DOEMatrixRow=[63, 45, 15, 2, 3, 1, 1, 6, 1, 2, 3, 2, 3, 1, 2, 1, 2, 45, 4, 3, 1, 3, 1, 2, 6, 3, 2, 3, 4, 14, 1, 6, 3]"+
//Tail EqnIndex=239 EqnNumber=43 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[66, 43, 12, 13, 4, 3, 1, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 4, 3, 4, 5, 1, 2, 3, 4, 5, 1, 1, 3, 4, 21, 6, 23, 32]"+
"// DOEMatrixRow=[63, 45, 15, 2, 3, 1, 1, 6, 1, 2, 3, 2, 3, 1, 2, 1, 2, 45, 4, 3, 1, 3, 1, 2, 6, 3, 2, 3, 4, 14, 1, 6, 3]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-3.0*xyza^3.0-xy012^2.0*xy012/2.0*xyza^69.0+x0^2.0*4.0*xyza^38.0-x0^2.0*xyza^32.0-x0^3.0+x0^23.0/1.5*xyza^35.0-1.0/2.0*xyza^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-3.0*3.0*xyza^2.0-xy012^2.0*xy012/2.0*69.0*xyza^68.0+x0^2.0*4.0*38.0*xyza^37.0-x0^2.0*32.0*xyza^31.0-x0^3.0*0.0+x0^23.0/1.5*35.0*xyza^34.0-1.0/2.0*3.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-9.0*xyza^2.0-xy012^2.0*xy012*34.5*xyza^68.0+x0^2.0*152.0*xyza^37.0-x0^2.0*32.0*xyza^31.0-x0^3.0*0.0+x0^23.0*23.333333333333332*xyza^34.0-1.5*xyza^2.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-3.0*xyza^3.0-xy012^2.0*xy012/2.0*xyza^69.0+x0^2.0*4.0*xyza^38.0-x0^2.0*xyza^32.0-x0^3.0+x0^23.0/1.5*xyza^35.0-1.0/2.0*xyza^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-3.0/4.0*xyza^4.0-xy012^2.0*xy012/2.0/70.0*xyza^70.0+x0^2.0*4.0/39.0*xyza^39.0-x0^2.0/33.0*xyza^33.0-x0^3.0*xyza+x0^23.0/1.5/36.0*xyza^36.0-1.0/2.0/4.0*xyza^4.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-0.75*xyza^4.0-xy012^2.0*xy012*0.007142857142857143*xyza^70.0+x0^2.0*0.10256410256410256*xyza^39.0-x0^2.0/33.0*xyza^33.0-x0^3.0*xyza+x0^23.0/54.0*xyza^36.0-1.0/8.0*xyza^4.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-9.0*xyza^2.0-xy012^2.0*xy012*34.5*xyza^68.0+x0^2.0*152.0*xyza^37.0-x0^2.0*32.0*xyza^31.0-x0^3.0*0.0+x0^23.0*23.333333333333332*xyza^34.0-1.5*xyza^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-9.0*2.0*xyza^1.0-xy012^2.0*xy012*34.5*68.0*xyza^67.0+x0^2.0*152.0*37.0*xyza^36.0-x0^2.0*32.0*31.0*xyza^30.0-x0^3.0*0.0*0.0+x0^23.0*23.333333333333332*34.0*xyza^33.0-1.5*2.0*xyza^1.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-18.0*xyza-xy012^2.0*xy012*2346.0*xyza^67.0+x0^2.0*5624.0*xyza^36.0-x0^2.0*992.0*xyza^30.0-x0^3.0*0.0+x0^23.0*793.3333333333333*xyza^33.0-3.0*xyza";
 UsageCalculus.EqnSolArrayMap3[2] = "-0.75*xyza^4.0-xy012^2.0*xy012*0.007142857142857143*xyza^70.0+x0^2.0*0.10256410256410256*xyza^39.0-x0^2.0/33.0*xyza^33.0-x0^3.0*xyza+x0^23.0/54.0*xyza^36.0-1.0/8.0*xyza^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-0.75/5.0*xyza^5.0-xy012^2.0*xy012*0.007142857142857143/71.0*xyza^71.0+x0^2.0*0.10256410256410256/40.0*xyza^40.0-x0^2.0/33.0/34.0*xyza^34.0-x0^3.0/2.0*xyza^2.0+x0^23.0/54.0/37.0*xyza^37.0-1.0/8.0/5.0*xyza^5.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-0.15*xyza^5.0-xy012^2.0*xy012*1.0060362173038229E-4*xyza^71.0+x0^2.0*0.002564102564102564*xyza^40.0-x0^2.0*8.9126559714795E-4*xyza^34.0-x0^3.0/2.0*xyza^2.0+x0^23.0/1998.0*xyza^37.0-1.0/40.0*xyza^5.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-18.0*xyza-xy012^2.0*xy012*2346.0*xyza^67.0+x0^2.0*5624.0*xyza^36.0-x0^2.0*992.0*xyza^30.0-x0^3.0*0.0+x0^23.0*793.3333333333333*xyza^33.0-3.0*xyza";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-18.0-xy012^2.0*xy012*2346.0*67.0*xyza^66.0+x0^2.0*5624.0*36.0*xyza^35.0-x0^2.0*992.0*30.0*xyza^29.0-x0^3.0*0.0*0.0+x0^23.0*793.3333333333333*33.0*xyza^32.0-3.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-18.0-xy012^2.0*xy012*157182.0*xyza^66.0+x0^2.0*202464.0*xyza^35.0-x0^2.0*29760.0*xyza^29.0-x0^3.0*0.0+x0^23.0*26179.999999999996*xyza^32.0-3.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-0.15*xyza^5.0-xy012^2.0*xy012*1.0060362173038229E-4*xyza^71.0-4.0*xyza^71.0+x0^2.0*0.002564102564102564*xyza^40.0-x0^2.0*8.9126559714795E-4*xyza^34.0-4.0*xyza^34.0-x0^3.0/2.0*xyza^2.0+x0^23.0/1998.0*xyza^37.0-1.0/40.0*xyza^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-0.15/6.0*xyza^6.0-xy012^2.0*xy012*1.0060362173038229E-4/72.0*xyza^72.0-4.0/72.0*xyza^72.0+x0^2.0*0.002564102564102564/41.0*xyza^41.0-x0^2.0*8.9126559714795E-4/35.0*xyza^35.0-4.0/35.0*xyza^35.0-x0^3.0/2.0/3.0*xyza^3.0+x0^23.0/1998.0/38.0*xyza^38.0-1.0/40.0/6.0*xyza^6.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-0.024999999999999998*xyza^6.0-xy012^2.0*xy012/715680.0*xyza^72.0-1.0/18.0*xyza^72.0-0.05555555555555555*xyza^72.0+x0^2.0*6.253908692933083E-5*xyza^41.0-x0^2.0/39270.0*xyza^35.0-1.0/8.75*xyza^35.0-0.11428571428571428*xyza^35.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^23.0/75924.0*xyza^38.0-1.0/240.0*xyza^6.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-18.0-xy012^2.0*xy012*157182.0*xyza^66.0+x0^2.0*202464.0*xyza^35.0-x0^2.0*29760.0*xyza^29.0-x0^3.0*0.0+x0^23.0*26179.999999999996*xyza^32.0-3.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0-xy012^2.0*xy012*157182.0*66.0*xyza^65.0+x0^2.0*202464.0*35.0*xyza^34.0-x0^2.0*29760.0*29.0*xyza^28.0-x0^3.0*0.0*0.0+x0^23.0*26179.999999999996*32.0*xyza^31.0-3.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-xy012^2.0*xy012*1.0374012E7*xyza^65.0+x0^2.0*7086240.0*xyza^34.0-x0^2.0*863040.0*xyza^28.0-x0^3.0*0.0+x0^23.0*837759.9999999999*xyza^31.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-0.024999999999999998*xyza^6.0-xy012^2.0*xy012/715680.0*xyza^72.0-1.0/18.0*xyza^72.0-0.05555555555555555*xyza^72.0+x0^2.0*6.253908692933083E-5*xyza^41.0-5.0*xyza^41.0-x0^2.0/39270.0*xyza^35.0-1.0/8.75*xyza^35.0-0.11428571428571428*xyza^35.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^23.0/75924.0*xyza^38.0-1.0/240.0*xyza^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-0.024999999999999998/7.0*xyza^7.0-xy012^2.0*xy012/715680.0/73.0*xyza^73.0-1.0/18.0/73.0*xyza^73.0-0.05555555555555555/73.0*xyza^73.0+x0^2.0*6.253908692933083E-5/42.0*xyza^42.0-5.0/42.0*xyza^42.0-x0^2.0/39270.0/36.0*xyza^36.0-1.0/8.75/36.0*xyza^36.0-0.11428571428571428/36.0*xyza^36.0-x0^3.0*0.16666666666666666/4.0*xyza^4.0+x0^23.0/75924.0/39.0*xyza^39.0-1.0/240.0/7.0*xyza^7.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-0.0035714285714285713*xyza^7.0-xy012^2.0*xy012/5.224464E7*xyza^73.0-1.0/1314.0*xyza^73.0-7.6103500761035E-4*xyza^73.0+x0^2.0/671580.0*xyza^42.0-1.0/8.4*xyza^42.0-0.11904761904761904*xyza^42.0-x0^2.0/1413720.0*xyza^36.0-1.0/315.0*xyza^36.0-0.0031746031746031746*xyza^36.0-x0^3.0*0.041666666666666664*xyza^4.0+x0^23.0/2961036.0*xyza^39.0-1.0/1680.0*xyza^7.0";
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

public static void TestCaseDiff121241() {
 UsageCalculus.TestCase = 121241;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-1*x/2*x^2*-3*x^32*xy012^2*-3*xy012^3*1*xy012/-3*xy012^23*x^31*x/-3*x^2-3*x0^2*-1*x0^3*2*x01*x^3*2*x/3*x^2*--1*x^32*x3*x0^2*--1*x0^3-1*x^3*2*x/3*x^22*x/3*x^2*-1*x^3*-3*x3*x0^21*x^3*-3*x-3*x/1*x^2*-2*x^3-1*x/2*x^22*xy012^2*-3*xy012^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=240 EqnNumber=44 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[32, 44, 13, 14, 1, 1, 2, 3, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 5, 1, 1, 6, 2, 3, 1, 1, 6, 2, 3, 4, 1, 22, 7, 24, 1]"+
"// DOEMatrixRow=[29, 46, 16, 3, 1, 2, 3, 7, 2, 3, 4, 1, 1, 2, 3, 2, 3, 46, 5, 1, 2, 4, 2, 3, 1, 4, 3, 1, 1, 15, 2, 7, 4]"+
//Tail EqnIndex=240 EqnNumber=44 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[32, 44, 13, 14, 1, 1, 2, 3, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 5, 1, 1, 6, 2, 3, 1, 1, 6, 2, 3, 4, 1, 22, 7, 24, 1]"+
"// DOEMatrixRow=[29, 46, 16, 3, 1, 2, 3, 7, 2, 3, 4, 1, 1, 2, 3, 2, 3, 46, 5, 1, 2, 4, 2, 3, 1, 4, 3, 1, 1, 15, 2, 7, 4]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-1.0/2.0*x^69.0+4.0*x^38.0-x^32.0-1.0+2.0*x^36.0+6.0*x^6.0+1.5*x^23.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-1.0/2.0*69.0*x^68.0+4.0*38.0*x^37.0-32.0*x^31.0-1.0*0.0+2.0*36.0*x^35.0+6.0*6.0*x^5.0+1.5*23.0*x^22.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-34.5*x^68.0+152.0*x^37.0-32.0*x^31.0+72.0*x^35.0+36.0*x^5.0+34.5*x^22.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-1.0/2.0*x^69.0+4.0*x^38.0-x^32.0-1.0+2.0*x^36.0+6.0*x^6.0+1.5*x^23.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.0/2.0/70.0*x^70.0+4.0/39.0*x^39.0-1.0/33.0*x^33.0-1.0*x+2.0/37.0*x^37.0+6.0/7.0*x^7.0+1.5/24.0*x^24.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/140.0*x^70.0+1.0/9.75*x^39.0-1.0/33.0*x^33.0-x+1.0/18.5*x^37.0+1.0/1.1666666666666667*x^7.0+1.0/16.0*x^24.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-34.5*x^68.0+152.0*x^37.0-32.0*x^31.0+72.0*x^35.0+36.0*x^5.0+34.5*x^22.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-34.5*68.0*x^67.0+152.0*37.0*x^36.0-32.0*31.0*x^30.0+72.0*35.0*x^34.0+36.0*5.0*x^4.0+34.5*22.0*x^21.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-2346.0*x^67.0+5624.0*x^36.0-992.0*x^30.0+2520.0*x^34.0+180.0*x^4.0+759.0*x^21.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/140.0*x^70.0+1.0/9.75*x^39.0-0.030303030303030304*x^33.0-x+1.0/18.5*x^37.0+1.0/1.1666666666666667*x^7.0+1.0/16.0*x^24.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/140.0/71.0*x^71.0+1.0/9.75/40.0*x^40.0-0.030303030303030304/34.0*x^34.0-1.0/2.0*x^2.0+1.0/18.5/38.0*x^38.0+1.0/1.1666666666666667/8.0*x^8.0+1.0/16.0/25.0*x^25.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/9940.0*x^71.0+1.0/390.0*x^40.0-1.0/1122.0*x^34.0-1.0/2.0*x^2.0+1.0/703.0*x^38.0+1.0/9.333333333333334*x^8.0+1.0/400.0*x^25.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-2346.0*x^67.0+5624.0*x^36.0-992.0*x^30.0+2520.0*x^34.0+180.0*x^4.0+759.0*x^21.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-2346.0*67.0*x^66.0+5624.0*36.0*x^35.0-992.0*30.0*x^29.0+2520.0*34.0*x^33.0+180.0*4.0*x^3.0+759.0*21.0*x^20.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-157182.0*x^66.0+202464.0*x^35.0-29760.0*x^29.0+85680.0*x^33.0+720.0*x^3.0+15939.0*x^20.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/9940.0*x^71.0+1.0/390.0*x^40.0-1.0/1122.0*x^34.0-1.0/2.0*x^2.0+1.0/703.0*x^38.0+1.0/9.333333333333334*x^8.0+1.0/400.0*x^25.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/9940.0/72.0*x^72.0+1.0/390.0/41.0*x^41.0-1.0/1122.0/35.0*x^35.0-1.0/2.0/3.0*x^3.0+1.0/703.0/39.0*x^39.0+1.0/9.333333333333334/9.0*x^9.0+1.0/400.0/26.0*x^26.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/715680.0*x^72.0+1.0/15990.0*x^41.0-1.0/39270.0*x^35.0-1.0/6.0*x^3.0+1.0/27417.0*x^39.0+1.0/84.0*x^9.0+1.0/10400.0*x^26.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-157182.0*x^66.0+202464.0*x^35.0-29760.0*x^29.0+85680.0*x^33.0+720.0*x^3.0+15939.0*x^20.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-157182.0*66.0*x^65.0+202464.0*35.0*x^34.0-29760.0*29.0*x^28.0+85680.0*33.0*x^32.0+720.0*3.0*x^2.0+15939.0*20.0*x^19.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1.0374012E7*x^65.0+7086240.0*x^34.0-863040.0*x^28.0+2827440.0*x^32.0+2160.0*x^2.0+318780.0*x^19.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/715680.0*x^72.0+1.0/15990.0*x^41.0-1.0/39270.0*x^35.0-1.0/6.0*x^3.0+1.0/27417.0*x^39.0+1.0/84.0*x^9.0+1.0/10400.0*x^26.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/715680.0/73.0*x^73.0+1.0/15990.0/42.0*x^42.0-1.0/39270.0/36.0*x^36.0-1.0/6.0/4.0*x^4.0+1.0/27417.0/40.0*x^40.0+1.0/84.0/10.0*x^10.0+1.0/10400.0/27.0*x^27.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/5.224464E7*x^73.0+1.0/671580.0*x^42.0-1.0/1413720.0*x^36.0-1.0/24.0*x^4.0+1.0/1096680.0*x^40.0+1.0/840.0*x^10.0+1.0/280800.0*x^27.0";
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

public static void TestCaseDiff121242() {
 UsageCalculus.TestCase = 121242;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xy012^2*-3*xy012^3*1*xy012/-3*xy012^23*xy^31*xy/-3*xy^2-3*x0^2*-1*x0^3*2*x01*xy^3*2*xy/3*xy^2*--1*xy^32*xy3*x0^2*--1*x0^3-1*xy^3*2*xy/3*xy^22*xy/3*xy^2*-1*xy^3*-3*xy3*x0^21*xy^3*-3*xy-3*xy/1*xy^2*-2*xy^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xy^32*xy012^2*-3*xy012^33*xy^3*1*xy";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=241 EqnNumber=45 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[97, 45, 14, 15, 2, 3, 1, 4, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 1, 2, 3, 7, 3, 1, 2, 3, 7, 3, 4, 5, 2, 23, 8, 25, 2]"+
"// DOEMatrixRow=[94, 47, 17, 4, 2, 3, 1, 8, 3, 4, 1, 2, 3, 1, 4, 3, 1, 47, 6, 2, 3, 5, 3, 1, 2, 1, 1, 2, 3, 16, 1, 8, 5]"+
//Tail EqnIndex=241 EqnNumber=45 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[97, 45, 14, 15, 2, 3, 1, 4, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 1, 2, 3, 7, 3, 1, 2, 3, 7, 3, 4, 5, 2, 23, 8, 25, 2]"+
"// DOEMatrixRow=[94, 47, 17, 4, 2, 3, 1, 8, 3, 4, 1, 2, 3, 1, 4, 3, 1, 47, 6, 2, 3, 5, 3, 1, 2, 1, 1, 2, 3, 16, 1, 8, 5]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-1.0/1.5*xy^34.0+x0^2.0*4.0*xy^38.0-x0^2.0*xy^32.0-x0^3.0+x0^21.0*2.0*xy^36.0-x0^2.0*x0*108.0*xy^70.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-1.0/1.5*34.0*xy^33.0+x0^2.0*4.0*38.0*xy^37.0-x0^2.0*32.0*xy^31.0-x0^3.0*0.0+x0^21.0*2.0*36.0*xy^35.0-x0^2.0*x0*70.0*xy^69.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-22.666666666666668*xy^33.0+x0^2.0*152.0*xy^37.0-x0^2.0*32.0*xy^31.0-x0^3.0*0.0+x0^21.0*72.0*xy^35.0-x0^2.0*x0*70.0*xy^69.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-1.0/1.5*xy^34.0+x0^2.0*4.0*xy^38.0-x0^2.0*xy^32.0-x0^3.0+x0^21.0*2.0*xy^36.0-x0^2.0*x0*108.0*xy^70.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.0/1.5/35.0*xy^35.0+x0^2.0*4.0/39.0*xy^39.0-x0^2.0/33.0*xy^33.0-x0^3.0*xy+x0^21.0*2.0/37.0*xy^37.0-x0^2.0*x0*108.0/71.0*xy^71.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-0.01904761904761905*xy^35.0+x0^2.0*0.10256410256410256*xy^39.0-x0^2.0/33.0*xy^33.0-x0^3.0*xy+x0^21.0*0.05405405405405406*xy^37.0-x0^2.0*x0*1.5211267605633803*xy^71.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-22.666666666666668*xy^33.0+x0^2.0*152.0*xy^37.0-x0^2.0*32.0*xy^31.0-x0^3.0*0.0+x0^21.0*72.0*xy^35.0-x0^2.0*x0*70.0*xy^69.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-22.666666666666668*33.0*xy^32.0+x0^2.0*152.0*37.0*xy^36.0-x0^2.0*32.0*31.0*xy^30.0-x0^3.0*0.0*0.0+x0^21.0*72.0*35.0*xy^34.0-x0^2.0*x0*69.0*xy^68.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-748.0*xy^32.0+x0^2.0*5624.0*xy^36.0-x0^2.0*992.0*xy^30.0-x0^3.0*0.0+x0^21.0*2520.0*xy^34.0-x0^2.0*x0*69.0*xy^68.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-0.01904761904761905*xy^35.0+x0^2.0*0.10256410256410256*xy^39.0-x0^2.0/33.0*xy^33.0-x0^3.0*xy+x0^21.0*0.05405405405405406*xy^37.0-x0^2.0*x0*1.5211267605633803*xy^71.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-0.01904761904761905/36.0*xy^36.0+x0^2.0*0.10256410256410256/40.0*xy^40.0-x0^2.0/33.0/34.0*xy^34.0-x0^3.0/2.0*xy^2.0+x0^21.0*0.05405405405405406/38.0*xy^38.0-x0^2.0*x0*1.5211267605633803/72.0*xy^72.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-5.291005291005291E-4*xy^36.0+x0^2.0*0.002564102564102564*xy^40.0-x0^2.0*8.9126559714795E-4*xy^34.0-x0^3.0/2.0*xy^2.0+x0^21.0*0.001422475106685633*xy^38.0-x0^2.0*x0/47.333333333333336*xy^72.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-748.0*xy^32.0+x0^2.0*5624.0*xy^36.0-x0^2.0*992.0*xy^30.0-x0^3.0*0.0+x0^21.0*2520.0*xy^34.0-x0^2.0*x0*69.0*xy^68.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-748.0*32.0*xy^31.0+x0^2.0*5624.0*36.0*xy^35.0-x0^2.0*992.0*30.0*xy^29.0-x0^3.0*0.0*0.0+x0^21.0*2520.0*34.0*xy^33.0-x0^2.0*x0*68.0*xy^67.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-23936.0*xy^31.0+x0^2.0*202464.0*xy^35.0-x0^2.0*29760.0*xy^29.0-x0^3.0*0.0+x0^21.0*85680.0*xy^33.0-x0^2.0*x0*68.0*xy^67.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-5.291005291005291E-4*xy^36.0-4.0*xy^36.0+x0^2.0*0.002564102564102564*xy^40.0-x0^2.0*8.9126559714795E-4*xy^34.0-4.0*xy^34.0-x0^3.0/2.0*xy^2.0+x0^21.0*0.001422475106685633*xy^38.0-x0^2.0*x0/47.333333333333336*xy^72.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-5.291005291005291E-4/37.0*xy^37.0-4.0/37.0*xy^37.0+x0^2.0*0.002564102564102564/41.0*xy^41.0-x0^2.0*8.9126559714795E-4/35.0*xy^35.0-4.0/35.0*xy^35.0-x0^3.0/2.0/3.0*xy^3.0+x0^21.0*0.001422475106685633/39.0*xy^39.0-x0^2.0*x0/47.333333333333336/73.0*xy^73.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/69930.0*xy^37.0-1.0/9.25*xy^37.0-0.10810810810810811*xy^37.0+x0^2.0*6.253908692933083E-5*xy^41.0-x0^2.0/39270.0*xy^35.0-1.0/8.75*xy^35.0-0.11428571428571428*xy^35.0-x0^3.0*0.16666666666666666*xy^3.0+x0^21.0*3.6473720684247E-5*xy^39.0-x0^2.0*x0/3455.3333333333335*xy^73.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-23936.0*xy^31.0+x0^2.0*202464.0*xy^35.0-x0^2.0*29760.0*xy^29.0-x0^3.0*0.0+x0^21.0*85680.0*xy^33.0-x0^2.0*x0*68.0*xy^67.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-23936.0*31.0*xy^30.0+x0^2.0*202464.0*35.0*xy^34.0-x0^2.0*29760.0*29.0*xy^28.0-x0^3.0*0.0*0.0+x0^21.0*85680.0*33.0*xy^32.0-x0^2.0*x0*67.0*xy^66.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-742016.0*xy^30.0+x0^2.0*7086240.0*xy^34.0-x0^2.0*863040.0*xy^28.0-x0^3.0*0.0+x0^21.0*2827440.0*xy^32.0-x0^2.0*x0*67.0*xy^66.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/69930.0*xy^37.0-1.0/9.25*xy^37.0-0.10810810810810811*xy^37.0+x0^2.0*6.253908692933083E-5*xy^41.0-5.0*xy^41.0-x0^2.0/39270.0*xy^35.0-1.0/8.75*xy^35.0-0.11428571428571428*xy^35.0-x0^3.0*0.16666666666666666*xy^3.0+x0^21.0*3.6473720684247E-5*xy^39.0-5.0*xy^39.0-x0^2.0*x0/3455.3333333333335*xy^73.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/69930.0/38.0*xy^38.0-1.0/9.25/38.0*xy^38.0-0.10810810810810811/38.0*xy^38.0+x0^2.0*6.253908692933083E-5/42.0*xy^42.0-5.0/42.0*xy^42.0-x0^2.0/39270.0/36.0*xy^36.0-1.0/8.75/36.0*xy^36.0-0.11428571428571428/36.0*xy^36.0-x0^3.0*0.16666666666666666/4.0*xy^4.0+x0^21.0*3.6473720684247E-5/40.0*xy^40.0-5.0/40.0*xy^40.0-x0^2.0*x0/3455.3333333333335/74.0*xy^74.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/2657340.0*xy^38.0-1.0/351.5*xy^38.0-0.002844950213371266*xy^38.0+x0^2.0/671580.0*xy^42.0-1.0/8.4*xy^42.0-0.11904761904761904*xy^42.0-x0^2.0/1413720.0*xy^36.0-1.0/315.0*xy^36.0-0.0031746031746031746*xy^36.0-x0^3.0*0.041666666666666664*xy^4.0+x0^21.0/1096680.0*xy^40.0-1.0/8.0*xy^40.0-0.125*xy^40.0-x0^2.0*x0/255694.6666666667*xy^74.0";
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

public static void TestCaseDiff121243() {
 UsageCalculus.TestCase = 121243;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xyz^31*xyz/-3*xyz^2-3*x0^2*-1*x0^3*2*x01*xyz^3*2*xyz/3*xyz^2*--1*xyz^32*xyz3*x0^2*--1*x0^3-1*xyz^3*2*xyz/3*xyz^22*xyz/3*xyz^2*-1*xyz^3*-3*xyz3*x0^21*xyz^3*-3*xyz-3*xyz/1*xyz^2*-2*xyz^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyz^33*xyz/-1*xyz^2-1*x0^2*-2*x0^3*3*x03*xyz^3*1*xyz1*xyz/-3*xyz^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=242 EqnNumber=46 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[61, 46, 15, 16, 3, 1, 2, 5, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 2, 3, 4, 8, 1, 2, 3, 4, 8, 1, 1, 6, 3, 24, 9, 26, 3]"+
"// DOEMatrixRow=[58, 48, 18, 1, 3, 1, 2, 9, 1, 1, 2, 1, 1, 2, 1, 1, 2, 48, 7, 3, 1, 1, 1, 2, 3, 2, 3, 1, 4, 1, 2, 9, 6]"+
//Tail EqnIndex=242 EqnNumber=46 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[61, 46, 15, 16, 3, 1, 2, 5, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 2, 3, 4, 8, 1, 2, 3, 4, 8, 1, 1, 6, 3, 24, 9, 26, 3]"+
"// DOEMatrixRow=[58, 48, 18, 1, 3, 1, 2, 9, 1, 1, 2, 1, 1, 2, 1, 1, 2, 48, 7, 3, 1, 1, 1, 2, 3, 2, 3, 1, 4, 1, 2, 9, 6]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-xyz^34.0+x0^2.0*4.0*xyz^38.0-x0^2.0*xyz^32.0-x0^3.0+x0^21.0*2.0*xyz^36.0-x0^2.0*x0*36.0*xyz^70.0-2.0*xyz^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-34.0*xyz^33.0+x0^2.0*4.0*38.0*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0+x0^21.0*2.0*36.0*xyz^35.0-x0^2.0*x0*36.0*70.0*xyz^69.0-2.0*6.0*xyz^5.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-34.0*xyz^33.0+x0^2.0*152.0*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0+x0^21.0*72.0*xyz^35.0-x0^2.0*x0*2520.0*xyz^69.0-12.0*xyz^5.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-xyz^34.0+x0^2.0*4.0*xyz^38.0-x0^2.0*xyz^32.0-x0^3.0+x0^21.0*2.0*xyz^36.0-x0^2.0*x0*36.0*xyz^70.0-2.0*xyz^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.0/35.0*xyz^35.0+x0^2.0*4.0/39.0*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz+x0^21.0*2.0/37.0*xyz^37.0-x0^2.0*x0*36.0/71.0*xyz^71.0-2.0/7.0*xyz^7.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-0.02857142857142857*xyz^35.0+x0^2.0*0.10256410256410256*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz+x0^21.0*0.05405405405405406*xyz^37.0-x0^2.0*x0/1.9722222222222223*xyz^71.0-1.0/3.5*xyz^7.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-34.0*xyz^33.0+x0^2.0*152.0*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0+x0^21.0*72.0*xyz^35.0-x0^2.0*x0*2520.0*xyz^69.0-12.0*xyz^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-34.0*33.0*xyz^32.0+x0^2.0*152.0*37.0*xyz^36.0-x0^2.0*32.0*31.0*xyz^30.0-x0^3.0*0.0*0.0+x0^21.0*72.0*35.0*xyz^34.0-x0^2.0*x0*2520.0*69.0*xyz^68.0-12.0*5.0*xyz^4.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-1122.0*xyz^32.0+x0^2.0*5624.0*xyz^36.0-x0^2.0*992.0*xyz^30.0-x0^3.0*0.0+x0^21.0*2520.0*xyz^34.0-x0^2.0*x0*173880.0*xyz^68.0-60.0*xyz^4.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-0.02857142857142857*xyz^35.0+x0^2.0*0.10256410256410256*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz+x0^21.0*0.05405405405405406*xyz^37.0-x0^2.0*x0/1.9722222222222223*xyz^71.0-1.0/3.5*xyz^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-0.02857142857142857/36.0*xyz^36.0+x0^2.0*0.10256410256410256/40.0*xyz^40.0-x0^2.0/33.0/34.0*xyz^34.0-x0^3.0/2.0*xyz^2.0+x0^21.0*0.05405405405405406/38.0*xyz^38.0-x0^2.0*x0/1.9722222222222223/72.0*xyz^72.0-1.0/3.5/8.0*xyz^8.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-7.936507936507937E-4*xyz^36.0+x0^2.0*0.002564102564102564*xyz^40.0-x0^2.0*8.9126559714795E-4*xyz^34.0-x0^3.0/2.0*xyz^2.0+x0^21.0*0.001422475106685633*xyz^38.0-x0^2.0*x0/142.0*xyz^72.0-1.0/28.0*xyz^8.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-1122.0*xyz^32.0+x0^2.0*5624.0*xyz^36.0-x0^2.0*992.0*xyz^30.0-x0^3.0*0.0+x0^21.0*2520.0*xyz^34.0-x0^2.0*x0*173880.0*xyz^68.0-60.0*xyz^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-1122.0*32.0*xyz^31.0+x0^2.0*5624.0*36.0*xyz^35.0-x0^2.0*992.0*30.0*xyz^29.0-x0^3.0*0.0*0.0+x0^21.0*2520.0*34.0*xyz^33.0-x0^2.0*x0*173880.0*68.0*xyz^67.0-60.0*4.0*xyz^3.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-35904.0*xyz^31.0+x0^2.0*202464.0*xyz^35.0-x0^2.0*29760.0*xyz^29.0-x0^3.0*0.0+x0^21.0*85680.0*xyz^33.0-x0^2.0*x0*1.182384E7*xyz^67.0-240.0*xyz^3.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-7.936507936507937E-4*xyz^36.0-4.0*xyz^36.0+x0^2.0*0.002564102564102564*xyz^40.0-x0^2.0*8.9126559714795E-4*xyz^34.0-4.0*xyz^34.0-x0^3.0/2.0*xyz^2.0+x0^21.0*0.001422475106685633*xyz^38.0-x0^2.0*x0/142.0*xyz^72.0-1.0/28.0*xyz^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-7.936507936507937E-4/37.0*xyz^37.0-4.0/37.0*xyz^37.0+x0^2.0*0.002564102564102564/41.0*xyz^41.0-x0^2.0*8.9126559714795E-4/35.0*xyz^35.0-4.0/35.0*xyz^35.0-x0^3.0/2.0/3.0*xyz^3.0+x0^21.0*0.001422475106685633/39.0*xyz^39.0-x0^2.0*x0/142.0/73.0*xyz^73.0-1.0/28.0/9.0*xyz^9.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/46620.0*xyz^37.0-1.0/9.25*xyz^37.0-0.10810810810810811*xyz^37.0+x0^2.0*6.253908692933083E-5*xyz^41.0-x0^2.0/39270.0*xyz^35.0-1.0/8.75*xyz^35.0-0.11428571428571428*xyz^35.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^21.0*3.6473720684247E-5*xyz^39.0-x0^2.0*x0/10366.0*xyz^73.0-1.0/252.0*xyz^9.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-35904.0*xyz^31.0+x0^2.0*202464.0*xyz^35.0-x0^2.0*29760.0*xyz^29.0-x0^3.0*0.0+x0^21.0*85680.0*xyz^33.0-x0^2.0*x0*1.182384E7*xyz^67.0-240.0*xyz^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-35904.0*31.0*xyz^30.0+x0^2.0*202464.0*35.0*xyz^34.0-x0^2.0*29760.0*29.0*xyz^28.0-x0^3.0*0.0*0.0+x0^21.0*85680.0*33.0*xyz^32.0-x0^2.0*x0*1.182384E7*67.0*xyz^66.0-240.0*3.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1113024.0*xyz^30.0+x0^2.0*7086240.0*xyz^34.0-x0^2.0*863040.0*xyz^28.0-x0^3.0*0.0+x0^21.0*2827440.0*xyz^32.0-x0^2.0*x0*7.9219728E8*xyz^66.0-720.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/46620.0*xyz^37.0-1.0/9.25*xyz^37.0-0.10810810810810811*xyz^37.0+x0^2.0*6.253908692933083E-5*xyz^41.0-5.0*xyz^41.0-x0^2.0/39270.0*xyz^35.0-1.0/8.75*xyz^35.0-0.11428571428571428*xyz^35.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^21.0*3.6473720684247E-5*xyz^39.0-5.0*xyz^39.0-x0^2.0*x0/10366.0*xyz^73.0-1.0/252.0*xyz^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/46620.0/38.0*xyz^38.0-1.0/9.25/38.0*xyz^38.0-0.10810810810810811/38.0*xyz^38.0+x0^2.0*6.253908692933083E-5/42.0*xyz^42.0-5.0/42.0*xyz^42.0-x0^2.0/39270.0/36.0*xyz^36.0-1.0/8.75/36.0*xyz^36.0-0.11428571428571428/36.0*xyz^36.0-x0^3.0*0.16666666666666666/4.0*xyz^4.0+x0^21.0*3.6473720684247E-5/40.0*xyz^40.0-5.0/40.0*xyz^40.0-x0^2.0*x0/10366.0/74.0*xyz^74.0-1.0/252.0/10.0*xyz^10.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/1771560.0*xyz^38.0-1.0/351.5*xyz^38.0-0.002844950213371266*xyz^38.0+x0^2.0/671580.0*xyz^42.0-1.0/8.4*xyz^42.0-0.11904761904761904*xyz^42.0-x0^2.0/1413720.0*xyz^36.0-1.0/315.0*xyz^36.0-0.0031746031746031746*xyz^36.0-x0^3.0*0.041666666666666664*xyz^4.0+x0^21.0/1096680.0*xyz^40.0-1.0/8.0*xyz^40.0-0.125*xyz^40.0-x0^2.0*x0/767084.0*xyz^74.0-1.0/2520.0*xyz^10.0";
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

public static void TestCaseDiff121244() {
 UsageCalculus.TestCase = 121244;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xyza/-3*xyza^2-3*x0^2*-1*x0^3*2*x01*xyza^3*2*xyza/3*xyza^2*--1*xyza^32*xyza3*x0^2*--1*x0^3-1*xyza^3*2*xyza/3*xyza^22*xyza/3*xyza^2*-1*xyza^3*-3*xyza3*x0^21*xyza^3*-3*xyza-3*xyza/1*xyza^2*-2*xyza^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyza^33*xyza/-1*xyza^2-1*x0^2*-2*x0^3*3*x02*xyza^3*3*xyza/1*xyza^2*--3*xyza^33*xyza1*xyza/-3*xyza^2-3*x0^2*-1*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=243 EqnNumber=47 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[27, 47, 16, 17, 4, 2, 3, 6, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 1, 1, 9, 2, 3, 1, 1, 9, 2, 3, 7, 4, 25, 10, 27, 4]"+
"// DOEMatrixRow=[24, 49, 19, 2, 1, 2, 3, 10, 2, 3, 4, 2, 3, 1, 2, 3, 1, 49, 8, 1, 2, 3, 2, 3, 4, 3, 1, 2, 1, 2, 1, 10, 7]"+
//Tail EqnIndex=243 EqnNumber=47 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[27, 47, 16, 17, 4, 2, 3, 6, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 1, 1, 9, 2, 3, 1, 1, 9, 2, 3, 7, 4, 25, 10, 27, 4]"+
"// DOEMatrixRow=[24, 49, 19, 2, 1, 2, 3, 10, 2, 3, 4, 2, 3, 1, 2, 3, 1, 49, 8, 1, 2, 3, 2, 3, 4, 3, 1, 2, 1, 2, 1, 10, 7]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-1.0/3.0*xyza^3.0+x0^2.0*4.0*xyza^38.0-x0^2.0*xyza^32.0-x0^3.0+x0^21.0*2.0*xyza^36.0-x0^2.0*x0*36.0*xyza^70.0+18.0*xyza^42.0+xyza^36.0+x0^2.0*3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-1.0/3.0*3.0*xyza^2.0+x0^2.0*4.0*38.0*xyza^37.0-x0^2.0*32.0*xyza^31.0-x0^3.0*0.0+x0^21.0*2.0*36.0*xyza^35.0-x0^2.0*x0*36.0*70.0*xyza^69.0+18.0*42.0*xyza^41.0+36.0*xyza^35.0+x0^2.0*3.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-xyza^2.0+x0^2.0*152.0*xyza^37.0-x0^2.0*32.0*xyza^31.0-x0^3.0*0.0+x0^21.0*72.0*xyza^35.0-x0^2.0*x0*2520.0*xyza^69.0+756.0*xyza^41.0+36.0*xyza^35.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-1.0/3.0*xyza^3.0+x0^2.0*4.0*xyza^38.0-x0^2.0*xyza^32.0-x0^3.0+x0^21.0*2.0*xyza^36.0-x0^2.0*x0*36.0*xyza^70.0+18.0*xyza^42.0+xyza^36.0+x0^2.0*3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.0/3.0/4.0*xyza^4.0+x0^2.0*4.0/39.0*xyza^39.0-x0^2.0/33.0*xyza^33.0-x0^3.0*xyza+x0^21.0*2.0/37.0*xyza^37.0-x0^2.0*x0*36.0/71.0*xyza^71.0+18.0/43.0*xyza^43.0+1.0/37.0*xyza^37.0+x0^2.0*3.0*xyza";
 UsageCalculus.EqnSolArrayMap4[1] = "-0.08333333333333333*xyza^4.0+x0^2.0*0.10256410256410256*xyza^39.0-x0^2.0/33.0*xyza^33.0-x0^3.0*xyza+x0^21.0*0.05405405405405406*xyza^37.0-x0^2.0*x0/1.9722222222222223*xyza^71.0+1.0/2.388888888888889*xyza^43.0+0.02702702702702703*xyza^37.0+x0^2.0*3.0*xyza";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-xyza^2.0+x0^2.0*152.0*xyza^37.0-x0^2.0*32.0*xyza^31.0-x0^3.0*0.0+x0^21.0*72.0*xyza^35.0-x0^2.0*x0*2520.0*xyza^69.0+756.0*xyza^41.0+36.0*xyza^35.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-2.0*xyza^1.0+x0^2.0*152.0*37.0*xyza^36.0-x0^2.0*32.0*31.0*xyza^30.0-x0^3.0*0.0*0.0+x0^21.0*72.0*35.0*xyza^34.0-x0^2.0*x0*2520.0*69.0*xyza^68.0+756.0*41.0*xyza^40.0+36.0*35.0*xyza^34.0+x0^2.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-2.0*xyza+x0^2.0*5624.0*xyza^36.0-x0^2.0*992.0*xyza^30.0-x0^3.0*0.0+x0^21.0*2520.0*xyza^34.0-x0^2.0*x0*173880.0*xyza^68.0+30996.0*xyza^40.0+1260.0*xyza^34.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-0.08333333333333333*xyza^4.0+x0^2.0*0.10256410256410256*xyza^39.0-x0^2.0/33.0*xyza^33.0-x0^3.0*xyza+x0^21.0*0.05405405405405406*xyza^37.0-x0^2.0*x0/1.9722222222222223*xyza^71.0+1.0/2.388888888888889*xyza^43.0+0.02702702702702703*xyza^37.0+x0^2.0*3.0*xyza";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-0.08333333333333333/5.0*xyza^5.0+x0^2.0*0.10256410256410256/40.0*xyza^40.0-x0^2.0/33.0/34.0*xyza^34.0-x0^3.0/2.0*xyza^2.0+x0^21.0*0.05405405405405406/38.0*xyza^38.0-x0^2.0*x0/1.9722222222222223/72.0*xyza^72.0+1.0/2.388888888888889/44.0*xyza^44.0+0.02702702702702703/38.0*xyza^38.0+x0^2.0*3.0/2.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-0.016666666666666666*xyza^5.0+x0^2.0*0.002564102564102564*xyza^40.0-x0^2.0*8.9126559714795E-4*xyza^34.0-x0^3.0/2.0*xyza^2.0+x0^21.0*0.001422475106685633*xyza^38.0-x0^2.0*x0/142.0*xyza^72.0+1.0/105.11111111111111*xyza^44.0+7.112375533428165E-4*xyza^38.0+x0^2.0*1.5*xyza^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-2.0*xyza+x0^2.0*5624.0*xyza^36.0-x0^2.0*992.0*xyza^30.0-x0^3.0*0.0+x0^21.0*2520.0*xyza^34.0-x0^2.0*x0*173880.0*xyza^68.0+30996.0*xyza^40.0+1260.0*xyza^34.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-2.0+x0^2.0*5624.0*36.0*xyza^35.0-x0^2.0*992.0*30.0*xyza^29.0-x0^3.0*0.0*0.0+x0^21.0*2520.0*34.0*xyza^33.0-x0^2.0*x0*173880.0*68.0*xyza^67.0+30996.0*40.0*xyza^39.0+1260.0*34.0*xyza^33.0+x0^2.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-2.0+x0^2.0*202464.0*xyza^35.0-x0^2.0*29760.0*xyza^29.0-x0^3.0*0.0+x0^21.0*85680.0*xyza^33.0-x0^2.0*x0*1.182384E7*xyza^67.0+1239840.0*xyza^39.0+42840.0*xyza^33.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-0.016666666666666666*xyza^5.0+x0^2.0*0.002564102564102564*xyza^40.0-x0^2.0*8.9126559714795E-4*xyza^34.0-4.0*xyza^34.0-x0^3.0/2.0*xyza^2.0+x0^21.0*0.001422475106685633*xyza^38.0-x0^2.0*x0/142.0*xyza^72.0+1.0/105.11111111111111*xyza^44.0+7.112375533428165E-4*xyza^38.0-4.0*xyza^38.0+x0^2.0*1.5*xyza^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-0.016666666666666666/6.0*xyza^6.0+x0^2.0*0.002564102564102564/41.0*xyza^41.0-x0^2.0*8.9126559714795E-4/35.0*xyza^35.0-4.0/35.0*xyza^35.0-x0^3.0/2.0/3.0*xyza^3.0+x0^21.0*0.001422475106685633/39.0*xyza^39.0-x0^2.0*x0/142.0/73.0*xyza^73.0+1.0/105.11111111111111/45.0*xyza^45.0+7.112375533428165E-4/39.0*xyza^39.0-4.0/39.0*xyza^39.0+x0^2.0*1.5/3.0*xyza^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-0.002777777777777778*xyza^6.0+x0^2.0*6.253908692933083E-5*xyza^41.0-x0^2.0/39270.0*xyza^35.0-1.0/8.75*xyza^35.0-0.11428571428571428*xyza^35.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^21.0*3.6473720684247E-5*xyza^39.0-x0^2.0*x0/10366.0*xyza^73.0+1.0/4730.0*xyza^45.0+1.0/54834.0*xyza^39.0-1.0/9.75*xyza^39.0-0.10256410256410256*xyza^39.0+x0^2.0/2.0*xyza^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-2.0+x0^2.0*202464.0*xyza^35.0-x0^2.0*29760.0*xyza^29.0-x0^3.0*0.0+x0^21.0*85680.0*xyza^33.0-x0^2.0*x0*1.182384E7*xyza^67.0+1239840.0*xyza^39.0+42840.0*xyza^33.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0+x0^2.0*202464.0*35.0*xyza^34.0-x0^2.0*29760.0*29.0*xyza^28.0-x0^3.0*0.0*0.0+x0^21.0*85680.0*33.0*xyza^32.0-x0^2.0*x0*1.182384E7*67.0*xyza^66.0+1239840.0*39.0*xyza^38.0+42840.0*33.0*xyza^32.0+x0^2.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*7086240.0*xyza^34.0-x0^2.0*863040.0*xyza^28.0-x0^3.0*0.0+x0^21.0*2827440.0*xyza^32.0-x0^2.0*x0*7.9219728E8*xyza^66.0+4.835376E7*xyza^38.0+1413720.0*xyza^32.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-0.002777777777777778*xyza^6.0+x0^2.0*6.253908692933083E-5*xyza^41.0-5.0*xyza^41.0-x0^2.0/39270.0*xyza^35.0-1.0/8.75*xyza^35.0-0.11428571428571428*xyza^35.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^21.0*3.6473720684247E-5*xyza^39.0-5.0*xyza^39.0-x0^2.0*x0/10366.0*xyza^73.0+1.0/4730.0*xyza^45.0+1.0/54834.0*xyza^39.0-1.0/9.75*xyza^39.0-0.10256410256410256*xyza^39.0+x0^2.0/2.0*xyza^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-0.002777777777777778/7.0*xyza^7.0+x0^2.0*6.253908692933083E-5/42.0*xyza^42.0-5.0/42.0*xyza^42.0-x0^2.0/39270.0/36.0*xyza^36.0-1.0/8.75/36.0*xyza^36.0-0.11428571428571428/36.0*xyza^36.0-x0^3.0*0.16666666666666666/4.0*xyza^4.0+x0^21.0*3.6473720684247E-5/40.0*xyza^40.0-5.0/40.0*xyza^40.0-x0^2.0*x0/10366.0/74.0*xyza^74.0+1.0/4730.0/46.0*xyza^46.0+1.0/54834.0/40.0*xyza^40.0-1.0/9.75/40.0*xyza^40.0-0.10256410256410256/40.0*xyza^40.0+x0^2.0*2.0/4.0*xyza^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-3.968253968253968E-4*xyza^7.0+x0^2.0/671580.0*xyza^42.0-1.0/8.4*xyza^42.0-0.11904761904761904*xyza^42.0-x0^2.0/1413720.0*xyza^36.0-1.0/315.0*xyza^36.0-0.0031746031746031746*xyza^36.0-x0^3.0*0.041666666666666664*xyza^4.0+x0^21.0/1096680.0*xyza^40.0-1.0/8.0*xyza^40.0-0.125*xyza^40.0-x0^2.0*x0/767084.0*xyza^74.0+1.0/217580.0*xyza^46.0+1.0/2193360.0*xyza^40.0-1.0/390.0*xyza^40.0-0.002564102564102564*xyza^40.0+x0^2.0/2.0*xyza^4.0";
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

public static void TestCaseDiff121245() {
 UsageCalculus.TestCase = 121245;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*x0^2*-1*x0^3*2*x01*x^3*2*x/3*x^2*--1*x^32*x3*x0^2*--1*x0^3-1*x^3*2*x/3*x^22*x/3*x^2*-1*x^3*-3*x3*x0^21*x^3*-3*x-3*x/1*x^2*-2*x^31*x0^2*-2*x0^3*3*x0/-1*x0^22*x^33*x/-1*x^2-1*x0^2*-2*x0^3*3*x02*x^3*3*x/1*x^2*--3*x^33*x1*x0^2*--3*x0^3-3*x^3*1*x/2*x^2-3*x0^2*-1*x0^31*x^3*2*x";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=244 EqnNumber=48 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[92, 48, 17, 18, 1, 3, 1, 7, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 2, 3, 10, 3, 1, 2, 3, 10, 3, 4, 8, 1, 26, 11, 28, 5]"+
"// DOEMatrixRow=[89, 50, 20, 3, 2, 3, 1, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 50, 9, 2, 3, 4, 3, 1, 5, 4, 2, 3, 2, 3, 2, 11, 8]"+
//Tail EqnIndex=244 EqnNumber=48 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[92, 48, 17, 18, 1, 3, 1, 7, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 2, 3, 10, 3, 1, 2, 3, 10, 3, 4, 8, 1, 26, 11, 28, 5]"+
"// DOEMatrixRow=[89, 50, 20, 3, 2, 3, 1, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 50, 9, 2, 3, 4, 3, 1, 5, 4, 2, 3, 2, 3, 2, 11, 8]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "4.0*x^38.0-x^32.0-1.0+2.0*x^36.0-36.0*x^70.0+162.0*x^39.0-9.0*x^33.0-3.0-1.5*x^6.0+6.0*x^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "4.0*38.0*x^37.0-32.0*x^31.0-1.0*0.0+2.0*36.0*x^35.0-36.0*70.0*x^69.0+162.0*39.0*x^38.0-9.0*33.0*x^32.0-3.0*0.0-1.5*6.0*x^5.0+6.0*4.0*x^3.0";
 UsageCalculus.EqnSolArrayMap2[1] = "152.0*x^37.0-32.0*x^31.0+72.0*x^35.0-2520.0*x^69.0+6318.0*x^38.0-297.0*x^32.0-9.0*x^5.0+24.0*x^3.0";
 UsageCalculus.EqnSolArrayMap3[1] = "4.0*x^38.0-x^32.0-1.0+2.0*x^36.0-36.0*x^70.0+162.0*x^39.0-9.0*x^33.0-3.0-1.5*x^6.0+6.0*x^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "4.0/39.0*x^39.0-1.0/33.0*x^33.0-1.0*x+2.0/37.0*x^37.0-36.0/71.0*x^71.0+162.0/40.0*x^40.0-9.0/34.0*x^34.0-3.0*x-1.5/7.0*x^7.0+6.0/5.0*x^5.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/9.75*x^39.0-1.0/33.0*x^33.0-x+1.0/18.5*x^37.0-1.0/1.9722222222222223*x^71.0+4.05*x^40.0-1.0/3.7777777777777777*x^34.0-3.0*x-1.0/4.666666666666667*x^7.0+1.2*x^5.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "152.0*x^37.0-32.0*x^31.0+72.0*x^35.0-2520.0*x^69.0+6318.0*x^38.0-297.0*x^32.0-9.0*x^5.0+24.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "152.0*37.0*x^36.0-32.0*31.0*x^30.0+72.0*35.0*x^34.0-2520.0*69.0*x^68.0+6318.0*38.0*x^37.0-297.0*32.0*x^31.0-9.0*5.0*x^4.0+24.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[2] = "5624.0*x^36.0-992.0*x^30.0+2520.0*x^34.0-173880.0*x^68.0+240084.0*x^37.0-9504.0*x^31.0-45.0*x^4.0+72.0*x^2.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/9.75*x^39.0-0.030303030303030304*x^33.0-x+1.0/18.5*x^37.0-1.0/1.9722222222222223*x^71.0+4.05*x^40.0-1.0/3.7777777777777777*x^34.0-3.0*x-1.0/4.666666666666667*x^7.0+1.2*x^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/9.75/40.0*x^40.0-0.030303030303030304/34.0*x^34.0-1.0/2.0*x^2.0+1.0/18.5/38.0*x^38.0-1.0/1.9722222222222223/72.0*x^72.0+4.05/41.0*x^41.0-1.0/3.7777777777777777/35.0*x^35.0-3.0/2.0*x^2.0-1.0/4.666666666666667/8.0*x^8.0+1.2/6.0*x^6.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/390.0*x^40.0-1.0/1122.0*x^34.0-1.0/2.0*x^2.0+1.0/703.0*x^38.0-1.0/142.0*x^72.0+1.0/10.123456790123457*x^41.0-1.0/132.22222222222223*x^35.0-1.5*x^2.0-1.0/37.333333333333336*x^8.0+1.0/5.0*x^6.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "5624.0*x^36.0-992.0*x^30.0+2520.0*x^34.0-173880.0*x^68.0+240084.0*x^37.0-9504.0*x^31.0-45.0*x^4.0+72.0*x^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "5624.0*36.0*x^35.0-992.0*30.0*x^29.0+2520.0*34.0*x^33.0-173880.0*68.0*x^67.0+240084.0*37.0*x^36.0-9504.0*31.0*x^30.0-45.0*4.0*x^3.0+72.0*2.0*x^1.0";
 UsageCalculus.EqnSolArrayMap2[3] = "202464.0*x^35.0-29760.0*x^29.0+85680.0*x^33.0-1.182384E7*x^67.0+8883108.0*x^36.0-294624.0*x^30.0-180.0*x^3.0+144.0*x";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/390.0*x^40.0-1.0/1122.0*x^34.0-1.0/2.0*x^2.0+1.0/703.0*x^38.0-1.0/142.0*x^72.0+1.0/10.123456790123457*x^41.0-1.0/132.22222222222223*x^35.0-1.5*x^2.0-1.0/37.333333333333336*x^8.0+1.0/5.0*x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/390.0/41.0*x^41.0-1.0/1122.0/35.0*x^35.0-1.0/2.0/3.0*x^3.0+1.0/703.0/39.0*x^39.0-1.0/142.0/73.0*x^73.0+1.0/10.123456790123457/42.0*x^42.0-1.0/132.22222222222223/36.0*x^36.0-1.5/3.0*x^3.0-1.0/37.333333333333336/9.0*x^9.0+1.0/5.0/7.0*x^7.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/15990.0*x^41.0-1.0/39270.0*x^35.0-1.0/6.0*x^3.0+1.0/27417.0*x^39.0-1.0/10366.0*x^73.0+1.0/425.1851851851852*x^42.0-1.0/4760.0*x^36.0-1.0/2.0*x^3.0-1.0/336.0*x^9.0+1.0/35.0*x^7.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "202464.0*x^35.0-29760.0*x^29.0+85680.0*x^33.0-1.182384E7*x^67.0+8883108.0*x^36.0-294624.0*x^30.0-180.0*x^3.0+144.0*x";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "202464.0*35.0*x^34.0-29760.0*29.0*x^28.0+85680.0*33.0*x^32.0-67.0*x^66.0+8883108.0*36.0*x^35.0-294624.0*30.0*x^29.0-180.0*3.0*x^2.0+144.0";
 UsageCalculus.EqnSolArrayMap2[4] = "7086240.0*x^34.0-863040.0*x^28.0+2827440.0*x^32.0-67.0*x^66.0+3.19791888E8*x^35.0-8838720.0*x^29.0-540.0*x^2.0+144.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/15990.0*x^41.0-1.0/39270.0*x^35.0-1.0/6.0*x^3.0+1.0/27417.0*x^39.0-1.0/10366.0*x^73.0+1.0/425.1851851851852*x^42.0-1.0/4760.0*x^36.0-1.0/2.0*x^3.0-1.0/336.0*x^9.0+1.0/35.0*x^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/15990.0/42.0*x^42.0-1.0/39270.0/36.0*x^36.0-1.0/6.0/4.0*x^4.0+1.0/27417.0/40.0*x^40.0-1.0/10366.0/74.0*x^74.0+1.0/425.1851851851852/43.0*x^43.0-1.0/4760.0/37.0*x^37.0-1.0/2.0/4.0*x^4.0-1.0/336.0/10.0*x^10.0+1.0/35.0/8.0*x^8.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/671580.0*x^42.0-1.0/1413720.0*x^36.0-1.0/24.0*x^4.0+1.0/1096680.0*x^40.0-1.0/767084.0*x^74.0+1.0/18282.962962962964*x^43.0-1.0/176120.0*x^37.0-1.0/8.0*x^4.0-1.0/3360.0*x^10.0+1.0/280.0*x^8.0";
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

public static void TestCaseDiff121246() {
 UsageCalculus.TestCase = 121246;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xy^3*2*xy/3*xy^2*--1*xy^32*xy3*x0^2*--1*x0^3-1*xy^3*2*xy/3*xy^22*xy/3*xy^2*-1*xy^3*-3*xy3*x0^21*xy^3*-3*xy-3*xy/1*xy^2*-2*xy^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xy^33*xy/-1*xy^2-1*x0^2*-2*x0^3*3*x02*xy^3*3*xy/1*xy^2*--3*xy^33*xy1*x0^2*--3*x0^3-3*xy^3*1*xy/2*xy^21*xy/2*xy^2*-3*xy*-1*xy^22*x0^21*xy^3*2*xy2*xy/3*xy^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=245 EqnNumber=49 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[56, 49, 18, 19, 2, 1, 2, 8, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 3, 4, 11, 1, 2, 3, 4, 11, 1, 1, 9, 2, 27, 12, 29, 6]"+
"// DOEMatrixRow=[53, 51, 1, 4, 3, 1, 2, 3, 1, 1, 2, 1, 2, 3, 4, 2, 3, 1, 10, 3, 1, 5, 1, 2, 6, 1, 3, 1, 3, 4, 1, 12, 9]"+
//Tail EqnIndex=245 EqnNumber=49 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[56, 49, 18, 19, 2, 1, 2, 8, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 3, 4, 11, 1, 2, 3, 4, 11, 1, 1, 9, 2, 27, 12, 29, 6]"+
"// DOEMatrixRow=[53, 51, 1, 4, 3, 1, 2, 3, 1, 1, 2, 1, 2, 3, 4, 2, 3, 1, 10, 3, 1, 5, 1, 2, 6, 1, 3, 1, 3, 4, 1, 12, 9]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0/1.5*xy^38.0-x0^2.0*xy^32.0-x0^3.0+x0^21.0*2.0*xy^36.0-x0^2.0*x0*36.0*xy^70.0+x0^2.0*162.0*xy^39.0-x0^2.0*9.0*xy^33.0-x0^3.0*3.0-1.5*xy^57.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0/1.5*38.0*xy^37.0-x0^2.0*32.0*xy^31.0-x0^3.0*0.0+x0^21.0*2.0*36.0*xy^35.0-x0^2.0*x0*36.0*70.0*xy^69.0+x0^2.0*162.0*39.0*xy^38.0-x0^2.0*9.0*33.0*xy^32.0-x0^3.0*3.0*0.0-1.5*57.0*xy^56.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*25.333333333333332*xy^37.0-x0^2.0*32.0*xy^31.0-x0^3.0*0.0+x0^21.0*72.0*xy^35.0-x0^2.0*x0*2520.0*xy^69.0+x0^2.0*6318.0*xy^38.0-x0^2.0*297.0*xy^32.0-x0^3.0*0.0-85.5*xy^56.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0/1.5*xy^38.0-x0^2.0*xy^32.0-x0^3.0+x0^21.0*2.0*xy^36.0-x0^2.0*x0*36.0*xy^70.0+x0^2.0*162.0*xy^39.0-x0^2.0*9.0*xy^33.0-x0^3.0*3.0-1.5*xy^57.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0/1.5/39.0*xy^39.0-x0^2.0/33.0*xy^33.0-x0^3.0*xy+x0^21.0*2.0/37.0*xy^37.0-x0^2.0*x0*36.0/71.0*xy^71.0+x0^2.0*162.0/40.0*xy^40.0-x0^2.0*9.0/34.0*xy^34.0-x0^3.0*xy-1.5/58.0*xy^58.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0*0.017094017094017096*xy^39.0-x0^2.0/33.0*xy^33.0-x0^3.0*xy+x0^21.0*0.05405405405405406*xy^37.0-x0^2.0*x0*0.5070422535211268*xy^71.0+x0^2.0*4.05*xy^40.0-x0^2.0*0.2647058823529412*xy^34.0-x0^3.0*xy-1.0/38.666666666666664*xy^58.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*25.333333333333332*xy^37.0-x0^2.0*32.0*xy^31.0-x0^3.0*0.0+x0^21.0*72.0*xy^35.0-x0^2.0*x0*2520.0*xy^69.0+x0^2.0*6318.0*xy^38.0-x0^2.0*297.0*xy^32.0-x0^3.0*0.0-85.5*xy^56.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*25.333333333333332*37.0*xy^36.0-x0^2.0*32.0*31.0*xy^30.0-x0^3.0*0.0*0.0+x0^21.0*72.0*35.0*xy^34.0-x0^2.0*x0*2520.0*69.0*xy^68.0+x0^2.0*6318.0*38.0*xy^37.0-x0^2.0*297.0*32.0*xy^31.0-x0^3.0*0.0*0.0-85.5*56.0*xy^55.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*937.3333333333333*xy^36.0-x0^2.0*992.0*xy^30.0-x0^3.0*0.0+x0^21.0*2520.0*xy^34.0-x0^2.0*x0*173880.0*xy^68.0+x0^2.0*240084.0*xy^37.0-x0^2.0*9504.0*xy^31.0-x0^3.0*0.0-4788.0*xy^55.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0*0.017094017094017096*xy^39.0-x0^2.0/33.0*xy^33.0-x0^3.0*xy+x0^21.0*0.05405405405405406*xy^37.0-x0^2.0*x0*0.5070422535211268*xy^71.0+x0^2.0*4.05*xy^40.0-x0^2.0*0.2647058823529412*xy^34.0-x0^3.0*xy-1.0/38.666666666666664*xy^58.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0*0.017094017094017096/40.0*xy^40.0-x0^2.0/33.0/34.0*xy^34.0-x0^3.0/2.0*xy^2.0+x0^21.0*0.05405405405405406/38.0*xy^38.0-x0^2.0*x0*0.5070422535211268/72.0*xy^72.0+x0^2.0*4.05/41.0*xy^41.0-x0^2.0*0.2647058823529412/35.0*xy^35.0-x0^3.0/2.0*xy^2.0-1.0/38.666666666666664/59.0*xy^59.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0*4.273504273504274E-4*xy^40.0-x0^2.0*8.9126559714795E-4*xy^34.0-x0^3.0/2.0*xy^2.0+x0^21.0*0.001422475106685633*xy^38.0-x0^2.0*x0*0.007042253521126761*xy^72.0+x0^2.0*0.09878048780487804*xy^41.0-x0^2.0*0.007563025210084034*xy^35.0-x0^3.0/2.0*xy^2.0-1.0/2281.333333333333*xy^59.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*937.3333333333333*xy^36.0-x0^2.0*992.0*xy^30.0-x0^3.0*0.0+x0^21.0*2520.0*xy^34.0-x0^2.0*x0*173880.0*xy^68.0+x0^2.0*240084.0*xy^37.0-x0^2.0*9504.0*xy^31.0-x0^3.0*0.0-4788.0*xy^55.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*937.3333333333333*36.0*xy^35.0-x0^2.0*992.0*30.0*xy^29.0-x0^3.0*0.0*0.0+x0^21.0*2520.0*34.0*xy^33.0-x0^2.0*x0*173880.0*68.0*xy^67.0+x0^2.0*240084.0*37.0*xy^36.0-x0^2.0*9504.0*31.0*xy^30.0-x0^3.0*0.0*0.0-4788.0*55.0*xy^54.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*33744.0*xy^35.0-x0^2.0*29760.0*xy^29.0-x0^3.0*0.0+x0^21.0*85680.0*xy^33.0-x0^2.0*x0*1.182384E7*xy^67.0+x0^2.0*8883108.0*xy^36.0-x0^2.0*294624.0*xy^30.0-x0^3.0*0.0-263340.0*xy^54.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0*4.273504273504274E-4*xy^40.0-4.0*xy^40.0-x0^2.0*8.9126559714795E-4*xy^34.0-4.0*xy^34.0-x0^3.0/2.0*xy^2.0+x0^21.0*0.001422475106685633*xy^38.0-x0^2.0*x0*0.007042253521126761*xy^72.0+x0^2.0*0.09878048780487804*xy^41.0-x0^2.0*0.007563025210084034*xy^35.0-x0^3.0/2.0*xy^2.0-1.0/2281.333333333333*xy^59.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0*4.273504273504274E-4/41.0*xy^41.0-4.0/41.0*xy^41.0-x0^2.0*8.9126559714795E-4/35.0*xy^35.0-4.0/35.0*xy^35.0-x0^3.0/2.0/3.0*xy^3.0+x0^21.0*0.001422475106685633/39.0*xy^39.0-x0^2.0*x0*0.007042253521126761/73.0*xy^73.0+x0^2.0*0.09878048780487804/42.0*xy^42.0-x0^2.0*0.007563025210084034/36.0*xy^36.0-x0^3.0/2.0/3.0*xy^3.0-1.0/2281.333333333333/60.0*xy^60.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0/95939.99999999999*xy^41.0-1.0/10.25*xy^41.0-0.0975609756097561*xy^41.0-x0^2.0/39270.0*xy^35.0-1.0/8.75*xy^35.0-0.11428571428571428*xy^35.0-x0^3.0*0.16666666666666666*xy^3.0+x0^21.0*3.6473720684247E-5*xy^39.0-x0^2.0*x0*9.646922631680494E-5*xy^73.0+x0^2.0*0.00235191637630662*xy^42.0-x0^2.0*2.100840336134454E-4*xy^36.0-x0^3.0/6.0*xy^3.0-1.0/136879.99999999997*xy^60.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*33744.0*xy^35.0-x0^2.0*29760.0*xy^29.0-x0^3.0*0.0+x0^21.0*85680.0*xy^33.0-x0^2.0*x0*1.182384E7*xy^67.0+x0^2.0*8883108.0*xy^36.0-x0^2.0*294624.0*xy^30.0-x0^3.0*0.0-263340.0*xy^54.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*33744.0*35.0*xy^34.0-x0^2.0*29760.0*29.0*xy^28.0-x0^3.0*0.0*0.0+x0^21.0*85680.0*33.0*xy^32.0-x0^2.0*x0*1.182384E7*67.0*xy^66.0+x0^2.0*8883108.0*36.0*xy^35.0-x0^2.0*294624.0*30.0*xy^29.0-x0^3.0*0.0*0.0-263340.0*54.0*xy^53.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*1181040.0*xy^34.0-x0^2.0*863040.0*xy^28.0-x0^3.0*0.0+x0^21.0*2827440.0*xy^32.0-x0^2.0*x0*7.9219728E8*xy^66.0+x0^2.0*3.19791888E8*xy^35.0-x0^2.0*8838720.0*xy^29.0-x0^3.0*0.0-1.422036E7*xy^53.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0/95939.99999999999*xy^41.0-1.0/10.25*xy^41.0-0.0975609756097561*xy^41.0-x0^2.0/39270.0*xy^35.0-1.0/8.75*xy^35.0-0.11428571428571428*xy^35.0-x0^3.0*0.16666666666666666*xy^3.0+x0^21.0*3.6473720684247E-5*xy^39.0-5.0*xy^39.0-x0^2.0*x0*9.646922631680494E-5*xy^73.0-5.0*xy^73.0+x0^2.0*0.00235191637630662*xy^42.0-x0^2.0*2.100840336134454E-4*xy^36.0-4.0*xy^36.0-x0^3.0/6.0*xy^3.0-1.0/136879.99999999997*xy^60.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0/95939.99999999999/42.0*xy^42.0-1.0/10.25/42.0*xy^42.0-0.0975609756097561/42.0*xy^42.0-x0^2.0/39270.0/36.0*xy^36.0-1.0/8.75/36.0*xy^36.0-0.11428571428571428/36.0*xy^36.0-x0^3.0*0.16666666666666666/4.0*xy^4.0+x0^21.0*3.6473720684247E-5/40.0*xy^40.0-5.0/40.0*xy^40.0-x0^2.0*x0*9.646922631680494E-5/74.0*xy^74.0-5.0/74.0*xy^74.0+x0^2.0*0.00235191637630662/43.0*xy^43.0-x0^2.0*2.100840336134454E-4/37.0*xy^37.0-4.0/37.0*xy^37.0-x0^3.0/6.0/4.0*xy^4.0-1.0/136879.99999999997/61.0*xy^61.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0/4029479.9999999995*xy^42.0-1.0/430.5*xy^42.0-0.0023228803716608595*xy^42.0-x0^2.0/1413720.0*xy^36.0-1.0/315.0*xy^36.0-0.0031746031746031746*xy^36.0-x0^3.0*0.041666666666666664*xy^4.0+x0^21.0/1096680.0*xy^40.0-1.0/8.0*xy^40.0-0.125*xy^40.0-x0^2.0*x0/767084.0*xy^74.0-1.0/14.8*xy^74.0-0.06756756756756757*xy^74.0+x0^2.0*5.46957296815493E-5*xy^43.0-x0^2.0/176120.0*xy^37.0-1.0/9.25*xy^37.0-0.10810810810810811*xy^37.0-x0^3.0/24.0*xy^4.0-1.0/8349679.999999998*xy^61.0";
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

public static void TestCaseDiff121247() {
 UsageCalculus.TestCase = 121247;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xyz3*x0^2*--1*x0^3-1*xyz^3*2*xyz/3*xyz^22*xyz/3*xyz^2*-1*xyz^3*-3*xyz3*x0^21*xyz^3*-3*xyz-3*xyz/1*xyz^2*-2*xyz^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyz^33*xyz/-1*xyz^2-1*x0^2*-2*x0^3*3*x02*xyz^3*3*xyz/1*xyz^2*--3*xyz^33*xyz1*x0^2*--3*x0^3-3*xyz^3*1*xyz/2*xyz^21*xyz/2*xyz^2*-3*xyz*-1*xyz^22*x0^23*xyz*-1*xyz^2-1*xyz^2/2*xyz*-3*xyz^22*xyz/3*xyz^23*x0^2*--1*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=246 EqnNumber=50 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[22, 50, 19, 20, 3, 2, 3, 9, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 1, 1, 12, 2, 3, 1, 1, 12, 2, 3, 10, 3, 28, 13, 30, 7]"+
"// DOEMatrixRow=[18, 52, 2, 1, 1, 2, 3, 4, 2, 3, 4, 2, 3, 1, 1, 3, 1, 2, 1, 1, 2, 1, 2, 3, 1, 2, 1, 2, 4, 5, 2, 13, 10]"+
//Tail EqnIndex=246 EqnNumber=50 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[22, 50, 19, 20, 3, 2, 3, 9, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 1, 1, 12, 2, 3, 1, 1, 12, 2, 3, 10, 3, 28, 13, 30, 7]"+
"// DOEMatrixRow=[18, 52, 2, 1, 1, 2, 3, 4, 2, 3, 4, 2, 3, 1, 1, 3, 1, 2, 1, 1, 2, 1, 2, 3, 1, 2, 1, 2, 4, 5, 2, 13, 10]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0*2.0-x0^3.0+x0^21.0*2.0*xyz^36.0-x0^2.0*x0*36.0*xyz^70.0+x0^2.0*162.0*xyz^39.0-x0^2.0*9.0*xyz^33.0-x0^3.0*3.0+x0^23.0*2.25*xyz^54.0+x0^2.0/2.0*xyz^49.0-x0^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0*2.0*0.0-x0^3.0*0.0+x0^21.0*2.0*36.0*xyz^35.0-x0^2.0*x0*36.0*70.0*xyz^69.0+x0^2.0*162.0*39.0*xyz^38.0-x0^2.0*9.0*33.0*xyz^32.0-x0^3.0*3.0*0.0+x0^23.0*2.25*54.0*xyz^53.0+x0^2.0/2.0*49.0*xyz^48.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*72.0*xyz^35.0-x0^2.0*x0*2520.0*xyz^69.0+x0^2.0*6318.0*xyz^38.0-x0^2.0*297.0*xyz^32.0-x0^3.0*0.0+x0^23.0*121.5*xyz^53.0+x0^2.0*24.5*xyz^48.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0*2.0-x0^3.0+x0^21.0*2.0*xyz^36.0-x0^2.0*x0*36.0*xyz^70.0+x0^2.0*162.0*xyz^39.0-x0^2.0*9.0*xyz^33.0-x0^3.0*3.0+x0^23.0*2.25*xyz^54.0+x0^2.0/2.0*xyz^49.0-x0^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0*xyz-x0^3.0*xyz+x0^21.0*2.0/37.0*xyz^37.0-x0^2.0*x0*36.0/71.0*xyz^71.0+x0^2.0*162.0/40.0*xyz^40.0-x0^2.0*9.0/34.0*xyz^34.0-x0^3.0*xyz+x0^23.0*2.25/55.0*xyz^55.0+x0^2.0/2.0/50.0*xyz^50.0-x0^3.0*xyz";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0*xyz-x0^3.0*xyz+x0^21.0*0.05405405405405406*xyz^37.0-x0^2.0*x0*0.5070422535211268*xyz^71.0+x0^2.0*4.05*xyz^40.0-x0^2.0*0.2647058823529412*xyz^34.0-x0^3.0*xyz+x0^23.0*0.04090909090909091*xyz^55.0+x0^2.0*0.01*xyz^50.0-x0^3.0*xyz";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*72.0*xyz^35.0-x0^2.0*x0*2520.0*xyz^69.0+x0^2.0*6318.0*xyz^38.0-x0^2.0*297.0*xyz^32.0-x0^3.0*0.0+x0^23.0*121.5*xyz^53.0+x0^2.0*24.5*xyz^48.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^21.0*72.0*35.0*xyz^34.0-x0^2.0*x0*2520.0*69.0*xyz^68.0+x0^2.0*6318.0*38.0*xyz^37.0-x0^2.0*297.0*32.0*xyz^31.0-x0^3.0*0.0*0.0+x0^23.0*121.5*53.0*xyz^52.0+x0^2.0*24.5*48.0*xyz^47.0-x0^3.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*2520.0*xyz^34.0-x0^2.0*x0*173880.0*xyz^68.0+x0^2.0*240084.0*xyz^37.0-x0^2.0*9504.0*xyz^31.0-x0^3.0*0.0+x0^23.0*6439.5*xyz^52.0+x0^2.0*1176.0*xyz^47.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0*xyz-x0^3.0*xyz+x0^21.0*0.05405405405405406*xyz^37.0-x0^2.0*x0*0.5070422535211268*xyz^71.0+x0^2.0*4.05*xyz^40.0-x0^2.0*0.2647058823529412*xyz^34.0-x0^3.0*xyz+x0^23.0*0.04090909090909091*xyz^55.0+x0^2.0*0.01*xyz^50.0-x0^3.0*xyz";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0/2.0*xyz^2.0-x0^3.0/2.0*xyz^2.0+x0^21.0*0.05405405405405406/38.0*xyz^38.0-x0^2.0*x0*0.5070422535211268/72.0*xyz^72.0+x0^2.0*4.05/41.0*xyz^41.0-x0^2.0*0.2647058823529412/35.0*xyz^35.0-x0^3.0/2.0*xyz^2.0+x0^23.0*0.04090909090909091/56.0*xyz^56.0+x0^2.0*0.01/51.0*xyz^51.0-x0^3.0/2.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0/2.0*xyz^2.0-x0^3.0/2.0*xyz^2.0+x0^21.0*0.001422475106685633*xyz^38.0-x0^2.0*x0*0.007042253521126761*xyz^72.0+x0^2.0*0.09878048780487804*xyz^41.0-x0^2.0*0.007563025210084034*xyz^35.0-x0^3.0/2.0*xyz^2.0+x0^23.0*7.305194805194805E-4*xyz^56.0+x0^2.0*1.96078431372549E-4*xyz^51.0-x0^3.0/2.0*xyz^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*2520.0*xyz^34.0-x0^2.0*x0*173880.0*xyz^68.0+x0^2.0*240084.0*xyz^37.0-x0^2.0*9504.0*xyz^31.0-x0^3.0*0.0+x0^23.0*6439.5*xyz^52.0+x0^2.0*1176.0*xyz^47.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^21.0*2520.0*34.0*xyz^33.0-x0^2.0*x0*173880.0*68.0*xyz^67.0+x0^2.0*240084.0*37.0*xyz^36.0-x0^2.0*9504.0*31.0*xyz^30.0-x0^3.0*0.0*0.0+x0^23.0*6439.5*52.0*xyz^51.0+x0^2.0*1176.0*47.0*xyz^46.0-x0^3.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*85680.0*xyz^33.0-x0^2.0*x0*1.182384E7*xyz^67.0+x0^2.0*8883108.0*xyz^36.0-x0^2.0*294624.0*xyz^30.0-x0^3.0*0.0+x0^23.0*334854.0*xyz^51.0+x0^2.0*55272.0*xyz^46.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0/2.0*xyz^2.0-x0^3.0/2.0*xyz^2.0+x0^21.0*0.001422475106685633*xyz^38.0-x0^2.0*x0*0.007042253521126761*xyz^72.0+x0^2.0*0.09878048780487804*xyz^41.0-x0^2.0*0.007563025210084034*xyz^35.0-x0^3.0/2.0*xyz^2.0+x0^23.0*7.305194805194805E-4*xyz^56.0-4.0*xyz^56.0+x0^2.0*1.96078431372549E-4*xyz^51.0-4.0*xyz^51.0-x0^3.0/2.0*xyz^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0/2.0/3.0*xyz^3.0-x0^3.0/2.0/3.0*xyz^3.0+x0^21.0*0.001422475106685633/39.0*xyz^39.0-x0^2.0*x0*0.007042253521126761/73.0*xyz^73.0+x0^2.0*0.09878048780487804/42.0*xyz^42.0-x0^2.0*0.007563025210084034/36.0*xyz^36.0-x0^3.0/2.0/3.0*xyz^3.0+x0^23.0*7.305194805194805E-4/57.0*xyz^57.0-4.0/57.0*xyz^57.0+x0^2.0*1.96078431372549E-4/52.0*xyz^52.0-4.0/52.0*xyz^52.0-x0^3.0*2.0/3.0*xyz^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0*0.16666666666666666*xyz^3.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^21.0*3.6473720684247E-5*xyz^39.0-x0^2.0*x0*9.646922631680494E-5*xyz^73.0+x0^2.0*0.00235191637630662*xyz^42.0-x0^2.0*2.100840336134454E-4*xyz^36.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^23.0/78026.66666666666*xyz^57.0-1.0/14.25*xyz^57.0-0.07017543859649122*xyz^57.0+x0^2.0/265200.0*xyz^52.0-1.0/13.0*xyz^52.0-0.07692307692307693*xyz^52.0-x0^3.0/1.5*xyz^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*85680.0*xyz^33.0-x0^2.0*x0*1.182384E7*xyz^67.0+x0^2.0*8883108.0*xyz^36.0-x0^2.0*294624.0*xyz^30.0-x0^3.0*0.0+x0^23.0*334854.0*xyz^51.0+x0^2.0*55272.0*xyz^46.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^21.0*85680.0*33.0*xyz^32.0-x0^2.0*x0*1.182384E7*67.0*xyz^66.0+x0^2.0*8883108.0*36.0*xyz^35.0-x0^2.0*294624.0*30.0*xyz^29.0-x0^3.0*0.0*0.0+x0^23.0*334854.0*51.0*xyz^50.0+x0^2.0*55272.0*46.0*xyz^45.0-x0^3.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*2827440.0*xyz^32.0-x0^2.0*x0*7.9219728E8*xyz^66.0+x0^2.0*3.19791888E8*xyz^35.0-x0^2.0*8838720.0*xyz^29.0-x0^3.0*0.0+x0^23.0*1.7077554E7*xyz^50.0+x0^2.0*2542512.0*xyz^45.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0*0.16666666666666666*xyz^3.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^21.0*3.6473720684247E-5*xyz^39.0-5.0*xyz^39.0-x0^2.0*x0*9.646922631680494E-5*xyz^73.0-5.0*xyz^73.0+x0^2.0*0.00235191637630662*xyz^42.0-x0^2.0*2.100840336134454E-4*xyz^36.0-4.0*xyz^36.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^23.0/78026.66666666666*xyz^57.0-1.0/14.25*xyz^57.0-0.07017543859649122*xyz^57.0+x0^2.0/265200.0*xyz^52.0-1.0/13.0*xyz^52.0-0.07692307692307693*xyz^52.0-x0^3.0/1.5*xyz^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0*0.16666666666666666/4.0*xyz^4.0-x0^3.0*0.16666666666666666/4.0*xyz^4.0+x0^21.0*3.6473720684247E-5/40.0*xyz^40.0-5.0/40.0*xyz^40.0-x0^2.0*x0*9.646922631680494E-5/74.0*xyz^74.0-5.0/74.0*xyz^74.0+x0^2.0*0.00235191637630662/43.0*xyz^43.0-x0^2.0*2.100840336134454E-4/37.0*xyz^37.0-4.0/37.0*xyz^37.0-x0^3.0*0.16666666666666666/4.0*xyz^4.0+x0^23.0/78026.66666666666/58.0*xyz^58.0-1.0/14.25/58.0*xyz^58.0-0.07017543859649122/58.0*xyz^58.0+x0^2.0/265200.0/53.0*xyz^53.0-1.0/13.0/53.0*xyz^53.0-0.07692307692307693/53.0*xyz^53.0-x0^3.0*1.5/4.0*xyz^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0*0.041666666666666664*xyz^4.0-x0^3.0*0.041666666666666664*xyz^4.0+x0^21.0/1096680.0*xyz^40.0-1.0/8.0*xyz^40.0-0.125*xyz^40.0-x0^2.0*x0/767084.0*xyz^74.0-1.0/14.8*xyz^74.0-0.06756756756756757*xyz^74.0+x0^2.0*5.46957296815493E-5*xyz^43.0-x0^2.0/176120.0*xyz^37.0-1.0/9.25*xyz^37.0-0.10810810810810811*xyz^37.0-x0^3.0*0.041666666666666664*xyz^4.0+x0^23.0/4525546.666666666*xyz^58.0-1.0/826.5*xyz^58.0-0.0012099213551119176*xyz^58.0+x0^2.0/1.40556E7*xyz^53.0-1.0/689.0*xyz^53.0-0.001451378809869376*xyz^53.0-x0^3.0/2.6666666666666665*xyz^4.0";
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

public static void TestCaseDiff121248() {
 UsageCalculus.TestCase = 121248;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*x0^2*--1*x0^3-1*xyza^3*2*xyza/3*xyza^22*xyza/3*xyza^2*-1*xyza^3*-3*xyza3*x0^21*xyza^3*-3*xyza-3*xyza/1*xyza^2*-2*xyza^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyza^33*xyza/-1*xyza^2-1*x0^2*-2*x0^3*3*x02*xyza^3*3*xyza/1*xyza^2*--3*xyza^33*xyza1*x0^2*--3*x0^3-3*xyza^3*1*xyza/2*xyza^21*xyza/2*xyza^2*-3*xyza*-1*xyza^22*x0^23*xyza*-1*xyza^2-1*xyza^2/2*xyza*-3*xyza^22*xyza*-3*xyza^2*1*xyza/-3*xyza^23*xy012^23*x0^2*--1*x0^3-1*xyza^3*2*xyza";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=247 EqnNumber=51 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[87, 51, 20, 1, 4, 3, 1, 10, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 2, 13, 3, 1, 2, 3, 13, 3, 4, 11, 4, 29, 14, 31, 8]"+
"// DOEMatrixRow=[84, 53, 3, 2, 3, 1, 1, 5, 3, 4, 1, 1, 1, 2, 3, 1, 2, 3, 2, 3, 1, 2, 3, 1, 2, 3, 2, 3, 1, 6, 1, 14, 11]"+
//Tail EqnIndex=247 EqnNumber=51 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[87, 51, 20, 1, 4, 3, 1, 10, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 2, 13, 3, 1, 2, 3, 13, 3, 4, 11, 4, 29, 14, 31, 8]"+
"// DOEMatrixRow=[84, 53, 3, 2, 3, 1, 1, 5, 3, 4, 1, 1, 1, 2, 3, 1, 2, 3, 2, 3, 1, 2, 3, 1, 2, 3, 2, 3, 1, 6, 1, 14, 11]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0*3.0-x0^3.0+x0^21.0*2.0*xyza^36.0-x0^2.0*x0*36.0*xyza^70.0+x0^2.0*162.0*xyza^39.0-x0^2.0*9.0*xyza^33.0-x0^3.0*3.0+x0^23.0*2.25*xyza^54.0+xy012^23.0*1.5*xyza^52.0-x0^3.0-2.0*xyza^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0*3.0*0.0-x0^3.0*0.0+x0^21.0*2.0*36.0*xyza^35.0-x0^2.0*x0*36.0*70.0*xyza^69.0+x0^2.0*162.0*39.0*xyza^38.0-x0^2.0*9.0*33.0*xyza^32.0-x0^3.0*3.0*0.0+x0^23.0*2.25*54.0*xyza^53.0+xy012^23.0*1.5*52.0*xyza^51.0-x0^3.0*0.0-2.0*4.0*xyza^3.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*72.0*xyza^35.0-x0^2.0*x0*2520.0*xyza^69.0+x0^2.0*6318.0*xyza^38.0-x0^2.0*297.0*xyza^32.0-x0^3.0*0.0+x0^23.0*121.5*xyza^53.0+xy012^23.0*78.0*xyza^51.0-x0^3.0*0.0-8.0*xyza^3.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0*3.0-x0^3.0+x0^21.0*2.0*xyza^36.0-x0^2.0*x0*36.0*xyza^70.0+x0^2.0*162.0*xyza^39.0-x0^2.0*9.0*xyza^33.0-x0^3.0*3.0+x0^23.0*2.25*xyza^54.0+xy012^23.0*1.5*xyza^52.0-x0^3.0-2.0*xyza^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0*3.0*xyza-x0^3.0*xyza+x0^21.0*2.0/37.0*xyza^37.0-x0^2.0*x0*36.0/71.0*xyza^71.0+x0^2.0*162.0/40.0*xyza^40.0-x0^2.0*9.0/34.0*xyza^34.0-x0^3.0*xyza+x0^23.0*2.25/55.0*xyza^55.0+xy012^23.0*1.5/53.0*xyza^53.0-x0^3.0*xyza-2.0/5.0*xyza^5.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0*3.0*xyza-x0^3.0*xyza+x0^21.0*0.05405405405405406*xyza^37.0-x0^2.0*x0*0.5070422535211268*xyza^71.0+x0^2.0*4.05*xyza^40.0-x0^2.0*0.2647058823529412*xyza^34.0-x0^3.0*xyza+x0^23.0*0.04090909090909091*xyza^55.0+xy012^23.0*0.02830188679245283*xyza^53.0-x0^3.0*xyza-1.0/2.5*xyza^5.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*72.0*xyza^35.0-x0^2.0*x0*2520.0*xyza^69.0+x0^2.0*6318.0*xyza^38.0-x0^2.0*297.0*xyza^32.0-x0^3.0*0.0+x0^23.0*121.5*xyza^53.0+xy012^23.0*78.0*xyza^51.0-x0^3.0*0.0-8.0*xyza^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^21.0*72.0*35.0*xyza^34.0-x0^2.0*x0*2520.0*69.0*xyza^68.0+x0^2.0*6318.0*38.0*xyza^37.0-x0^2.0*297.0*32.0*xyza^31.0-x0^3.0*0.0*0.0+x0^23.0*121.5*53.0*xyza^52.0+xy012^23.0*78.0*51.0*xyza^50.0-x0^3.0*0.0*0.0-8.0*3.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*2520.0*xyza^34.0-x0^2.0*x0*173880.0*xyza^68.0+x0^2.0*240084.0*xyza^37.0-x0^2.0*9504.0*xyza^31.0-x0^3.0*0.0+x0^23.0*6439.5*xyza^52.0+xy012^23.0*3978.0*xyza^50.0-x0^3.0*0.0-24.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0*3.0*xyza-x0^3.0*xyza+x0^21.0*0.05405405405405406*xyza^37.0-x0^2.0*x0*0.5070422535211268*xyza^71.0+x0^2.0*4.05*xyza^40.0-x0^2.0*0.2647058823529412*xyza^34.0-x0^3.0*xyza+x0^23.0*0.04090909090909091*xyza^55.0+xy012^23.0*0.02830188679245283*xyza^53.0-x0^3.0*xyza-1.0/2.5*xyza^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0*3.0/2.0*xyza^2.0-x0^3.0/2.0*xyza^2.0+x0^21.0*0.05405405405405406/38.0*xyza^38.0-x0^2.0*x0*0.5070422535211268/72.0*xyza^72.0+x0^2.0*4.05/41.0*xyza^41.0-x0^2.0*0.2647058823529412/35.0*xyza^35.0-x0^3.0/2.0*xyza^2.0+x0^23.0*0.04090909090909091/56.0*xyza^56.0+xy012^23.0*0.02830188679245283/54.0*xyza^54.0-x0^3.0/2.0*xyza^2.0-1.0/2.5/6.0*xyza^6.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0*1.5*xyza^2.0-x0^3.0/2.0*xyza^2.0+x0^21.0*0.001422475106685633*xyza^38.0-x0^2.0*x0*0.007042253521126761*xyza^72.0+x0^2.0*0.09878048780487804*xyza^41.0-x0^2.0*0.007563025210084034*xyza^35.0-x0^3.0/2.0*xyza^2.0+x0^23.0*7.305194805194805E-4*xyza^56.0+xy012^23.0*5.241090146750524E-4*xyza^54.0-x0^3.0/2.0*xyza^2.0-1.0/15.0*xyza^6.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*2520.0*xyza^34.0-x0^2.0*x0*173880.0*xyza^68.0+x0^2.0*240084.0*xyza^37.0-x0^2.0*9504.0*xyza^31.0-x0^3.0*0.0+x0^23.0*6439.5*xyza^52.0+xy012^23.0*3978.0*xyza^50.0-x0^3.0*0.0-24.0*xyza^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^21.0*2520.0*34.0*xyza^33.0-x0^2.0*x0*173880.0*68.0*xyza^67.0+x0^2.0*240084.0*37.0*xyza^36.0-x0^2.0*9504.0*31.0*xyza^30.0-x0^3.0*0.0*0.0+x0^23.0*6439.5*52.0*xyza^51.0+xy012^23.0*3978.0*50.0*xyza^49.0-x0^3.0*0.0*0.0-24.0*2.0*xyza^1.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*85680.0*xyza^33.0-x0^2.0*x0*1.182384E7*xyza^67.0+x0^2.0*8883108.0*xyza^36.0-x0^2.0*294624.0*xyza^30.0-x0^3.0*0.0+x0^23.0*334854.0*xyza^51.0+xy012^23.0*198900.0*xyza^49.0-x0^3.0*0.0-48.0*xyza";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0*1.5*xyza^2.0-x0^3.0/2.0*xyza^2.0+x0^21.0*0.001422475106685633*xyza^38.0-x0^2.0*x0*0.007042253521126761*xyza^72.0+x0^2.0*0.09878048780487804*xyza^41.0-x0^2.0*0.007563025210084034*xyza^35.0-x0^3.0/2.0*xyza^2.0+x0^23.0*7.305194805194805E-4*xyza^56.0-4.0*xyza^56.0+xy012^23.0*5.241090146750524E-4*xyza^54.0-4.0*xyza^54.0-x0^3.0/2.0*xyza^2.0-1.0/15.0*xyza^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0*1.5/3.0*xyza^3.0-x0^3.0/2.0/3.0*xyza^3.0+x0^21.0*0.001422475106685633/39.0*xyza^39.0-x0^2.0*x0*0.007042253521126761/73.0*xyza^73.0+x0^2.0*0.09878048780487804/42.0*xyza^42.0-x0^2.0*0.007563025210084034/36.0*xyza^36.0-x0^3.0/2.0/3.0*xyza^3.0+x0^23.0*7.305194805194805E-4/57.0*xyza^57.0-4.0/57.0*xyza^57.0+xy012^23.0*5.241090146750524E-4/55.0*xyza^55.0-4.0/55.0*xyza^55.0-x0^3.0/2.0/3.0*xyza^3.0-1.0/15.0/7.0*xyza^7.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0*0.5*xyza^3.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^21.0*3.6473720684247E-5*xyza^39.0-x0^2.0*x0*9.646922631680494E-5*xyza^73.0+x0^2.0*0.00235191637630662*xyza^42.0-x0^2.0*2.100840336134454E-4*xyza^36.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^23.0/78026.66666666666*xyza^57.0-1.0/14.25*xyza^57.0-0.07017543859649122*xyza^57.0+xy012^23.0/104940.0*xyza^55.0-1.0/13.75*xyza^55.0-0.07272727272727272*xyza^55.0-x0^3.0/6.0*xyza^3.0-1.0/105.0*xyza^7.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*85680.0*xyza^33.0-x0^2.0*x0*1.182384E7*xyza^67.0+x0^2.0*8883108.0*xyza^36.0-x0^2.0*294624.0*xyza^30.0-x0^3.0*0.0+x0^23.0*334854.0*xyza^51.0+xy012^23.0*198900.0*xyza^49.0-x0^3.0*0.0-48.0*xyza";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^21.0*85680.0*33.0*xyza^32.0-x0^2.0*x0*1.182384E7*67.0*xyza^66.0+x0^2.0*8883108.0*36.0*xyza^35.0-x0^2.0*294624.0*30.0*xyza^29.0-x0^3.0*0.0*0.0+x0^23.0*334854.0*51.0*xyza^50.0+xy012^23.0*198900.0*49.0*xyza^48.0-x0^3.0*0.0*0.0-48.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*2827440.0*xyza^32.0-x0^2.0*x0*7.9219728E8*xyza^66.0+x0^2.0*3.19791888E8*xyza^35.0-x0^2.0*8838720.0*xyza^29.0-x0^3.0*0.0+x0^23.0*1.7077554E7*xyza^50.0+xy012^23.0*9746100.0*xyza^48.0-x0^3.0*0.0-48.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0*0.5*xyza^3.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^21.0*3.6473720684247E-5*xyza^39.0-5.0*xyza^39.0-x0^2.0*x0*9.646922631680494E-5*xyza^73.0-5.0*xyza^73.0+x0^2.0*0.00235191637630662*xyza^42.0-x0^2.0*2.100840336134454E-4*xyza^36.0-4.0*xyza^36.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^23.0/78026.66666666666*xyza^57.0-1.0/14.25*xyza^57.0-0.07017543859649122*xyza^57.0+xy012^23.0/104940.0*xyza^55.0-1.0/13.75*xyza^55.0-0.07272727272727272*xyza^55.0-x0^3.0/6.0*xyza^3.0-1.0/105.0*xyza^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0*0.5/4.0*xyza^4.0-x0^3.0*0.16666666666666666/4.0*xyza^4.0+x0^21.0*3.6473720684247E-5/40.0*xyza^40.0-5.0/40.0*xyza^40.0-x0^2.0*x0*9.646922631680494E-5/74.0*xyza^74.0-5.0/74.0*xyza^74.0+x0^2.0*0.00235191637630662/43.0*xyza^43.0-x0^2.0*2.100840336134454E-4/37.0*xyza^37.0-4.0/37.0*xyza^37.0-x0^3.0*0.16666666666666666/4.0*xyza^4.0+x0^23.0/78026.66666666666/58.0*xyza^58.0-1.0/14.25/58.0*xyza^58.0-0.07017543859649122/58.0*xyza^58.0+xy012^23.0/104940.0/56.0*xyza^56.0-1.0/13.75/56.0*xyza^56.0-0.07272727272727272/56.0*xyza^56.0-x0^3.0/6.0/4.0*xyza^4.0-1.0/105.0/8.0*xyza^8.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0*0.125*xyza^4.0-x0^3.0*0.041666666666666664*xyza^4.0+x0^21.0/1096680.0*xyza^40.0-1.0/8.0*xyza^40.0-0.125*xyza^40.0-x0^2.0*x0/767084.0*xyza^74.0-1.0/14.8*xyza^74.0-0.06756756756756757*xyza^74.0+x0^2.0*5.46957296815493E-5*xyza^43.0-x0^2.0/176120.0*xyza^37.0-1.0/9.25*xyza^37.0-0.10810810810810811*xyza^37.0-x0^3.0*0.041666666666666664*xyza^4.0+x0^23.0/4525546.666666666*xyza^58.0-1.0/826.5*xyza^58.0-0.0012099213551119176*xyza^58.0+xy012^23.0/5876640.0*xyza^56.0-1.0/770.0*xyza^56.0-0.0012987012987012987*xyza^56.0-x0^3.0/24.0*xyza^4.0-1.0/840.0*xyza^8.0";
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

public static void TestCaseDiff121249() {
 UsageCalculus.TestCase = 121249;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-1*x^3*2*x/3*x^2-1*x^3*2*x2*x/3*x^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=248 EqnNumber=52 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[51, 52, 1, 2, 1, 1, 2, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 3, 14, 1, 2, 3, 4, 14, 1, 1, 12, 1, 30, 15, 32, 9]"+
"// DOEMatrixRow=[48, 54, 4, 3, 1, 2, 3, 6, 1, 1, 2, 1, 2, 3, 4, 2, 3, 4, 3, 1, 2, 3, 1, 2, 3, 4, 3, 1, 2, 7, 2, 15, 12]"+
//Tail EqnIndex=248 EqnNumber=52 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[51, 52, 1, 2, 1, 1, 2, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 3, 14, 1, 2, 3, 4, 14, 1, 1, 12, 1, 30, 15, 32, 9]"+
"// DOEMatrixRow=[48, 54, 4, 3, 1, 2, 3, 6, 1, 1, 2, 1, 2, 3, 4, 2, 3, 4, 3, 1, 2, 3, 1, 2, 3, 4, 3, 1, 2, 7, 2, 15, 12]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-1.0/1.5*x^6.0-1.0/1.5*x^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-1.0/1.5*6.0*x^5.0-1.0/1.5*6.0*x^5.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-4.0*x^5.0-4.0*x^5.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-1.0/1.5*x^6.0-1.0/1.5*x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.0/1.5/7.0*x^7.0-1.0/1.5/7.0*x^7.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/10.5*x^7.0-1.0/10.5*x^7.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-4.0*x^5.0-4.0*x^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-4.0*5.0*x^4.0-4.0*5.0*x^4.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-20.0*x^4.0-20.0*x^4.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/10.5*x^7.0-1.0/10.5*x^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/10.5/8.0*x^8.0-1.0/10.5/8.0*x^8.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/84.0*x^8.0-1.0/84.0*x^8.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-20.0*x^4.0-20.0*x^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-20.0*4.0*x^3.0-20.0*4.0*x^3.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-80.0*x^3.0-80.0*x^3.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/84.0*x^8.0-1.0/84.0*x^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/84.0/9.0*x^9.0-1.0/84.0/9.0*x^9.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/756.0*x^9.0-1.0/756.0*x^9.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-80.0*x^3.0-80.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-80.0*3.0*x^2.0-80.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-240.0*x^2.0-240.0*x^2.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/756.0*x^9.0-1.0/756.0*x^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/756.0/10.0*x^10.0-1.0/756.0/10.0*x^10.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/7560.0*x^10.0-1.0/7560.0*x^10.0";
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

public static void TestCaseDiff121250() {
 UsageCalculus.TestCase = 121250;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xy/3*xy^2*-1*xy^3*-3*xy3*x0^22*xy/3*xy^23*x0^2*-1*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=249 EqnNumber=53 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[16, 53, 2, 3, 2, 3, 1, 2, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 4, 15, 2, 3, 1, 1, 15, 2, 3, 13, 2, 31, 16, 1, 10]"+
"// DOEMatrixRow=[13, 55, 5, 4, 2, 3, 1, 7, 2, 3, 4, 2, 3, 1, 1, 3, 1, 5, 4, 2, 3, 4, 2, 3, 4, 1, 1, 2, 3, 8, 1, 16, 13]"+
//Tail EqnIndex=249 EqnNumber=53 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[16, 53, 2, 3, 2, 3, 1, 2, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 4, 15, 2, 3, 1, 1, 15, 2, 3, 13, 2, 31, 16, 1, 10]"+
"// DOEMatrixRow=[13, 55, 5, 4, 2, 3, 1, 7, 2, 3, 4, 2, 3, 1, 1, 3, 1, 5, 4, 2, 3, 4, 2, 3, 4, 1, 1, 2, 3, 8, 1, 16, 13]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^22.0/1.5*xy^30.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^22.0/1.5*30.0*xy^29.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^22.0*20.0*xy^29.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^22.0/1.5*xy^30.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^22.0*1.5/31.0*xy^31.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^22.0/20.666666666666668*xy^31.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^22.0*20.0*xy^29.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^22.0*20.0*29.0*xy^28.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^22.0*580.0*xy^28.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^22.0/20.666666666666668*xy^31.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^22.0*20.666666666666668/32.0*xy^32.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^22.0/1.5483870967741935*xy^32.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^22.0*580.0*xy^28.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^22.0*580.0*28.0*xy^27.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^22.0*16240.0*xy^27.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^22.0/1.5483870967741935*xy^32.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^22.0*1.5483870967741935/33.0*xy^33.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^22.0/21.3125*xy^33.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^22.0*16240.0*xy^27.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^22.0*16240.0*27.0*xy^26.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^22.0*438480.0*xy^26.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^22.0/21.3125*xy^33.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^22.0*21.3125/34.0*xy^34.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^22.0/1.595307917888563*xy^34.0";
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

public static void TestCaseDiff121251() {
 UsageCalculus.TestCase = 121251;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*x0^21*xyz^3*-3*xyz-3*xyz/1*xyz^2*-2*xyz^33*x0^2*-1*x0^31*xyz^3*-3*xyz";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=250 EqnNumber=54 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[82, 54, 3, 4, 3, 1, 2, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 5, 3, 1, 16, 3, 1, 2, 3, 16, 3, 4, 14, 3, 32, 1, 2, 11]"+
"// DOEMatrixRow=[79, 56, 6, 1, 3, 1, 2, 8, 3, 4, 1, 1, 1, 2, 3, 1, 2, 6, 5, 3, 1, 5, 3, 1, 5, 2, 3, 1, 4, 9, 2, 17, 14]"+
//Tail EqnIndex=250 EqnNumber=54 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[82, 54, 3, 4, 3, 1, 2, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 5, 3, 1, 16, 3, 1, 2, 3, 16, 3, 4, 14, 3, 32, 1, 2, 11]"+
"// DOEMatrixRow=[79, 56, 6, 1, 3, 1, 2, 8, 3, 4, 1, 1, 1, 2, 3, 1, 2, 6, 5, 3, 1, 5, 3, 1, 5, 2, 3, 1, 4, 9, 2, 17, 14]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^21.0*9.0*xyz^4.0+x0^2.0*18.0*xyz^40.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^21.0*9.0*4.0*xyz^3.0+x0^2.0*18.0*40.0*xyz^39.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^21.0*36.0*xyz^3.0+x0^2.0*720.0*xyz^39.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^21.0*9.0*xyz^4.0+x0^2.0*18.0*xyz^40.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^21.0*9.0/5.0*xyz^5.0+x0^2.0*18.0/41.0*xyz^41.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^21.0*1.8*xyz^5.0+x0^2.0/2.2777777777777777*xyz^41.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^21.0*36.0*xyz^3.0+x0^2.0*720.0*xyz^39.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^21.0*36.0*3.0*xyz^2.0+x0^2.0*720.0*39.0*xyz^38.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^21.0*108.0*xyz^2.0+x0^2.0*28080.0*xyz^38.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^21.0*1.8*xyz^5.0+x0^2.0/2.2777777777777777*xyz^41.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^21.0*1.8/6.0*xyz^6.0+x0^2.0*2.2777777777777777/42.0*xyz^42.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^21.0*0.3*xyz^6.0+x0^2.0/18.439024390243905*xyz^42.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^21.0*108.0*xyz^2.0+x0^2.0*28080.0*xyz^38.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^21.0*108.0*2.0*xyz^1.0+x0^2.0*28080.0*38.0*xyz^37.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^21.0*216.0*xyz+x0^2.0*1067040.0*xyz^37.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^21.0*0.3*xyz^6.0+x0^2.0/18.439024390243905*xyz^42.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^21.0*0.3/7.0*xyz^7.0+x0^2.0*18.439024390243905/43.0*xyz^43.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^21.0*0.04285714285714286*xyz^7.0+x0^2.0/2.332010582010582*xyz^43.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^21.0*216.0*xyz+x0^2.0*1067040.0*xyz^37.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^21.0*216.0+x0^2.0*1067040.0*37.0*xyz^36.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^21.0*216.0+x0^2.0*3.948048E7*xyz^36.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^21.0*0.04285714285714286*xyz^7.0+x0^2.0/2.332010582010582*xyz^43.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^21.0*0.04285714285714286/8.0*xyz^8.0+x0^2.0*2.332010582010582/44.0*xyz^44.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^21.0*0.005357142857142857*xyz^8.0+x0^2.0/18.86783891094725*xyz^44.0";
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

public static void TestCaseDiff121252() {
 UsageCalculus.TestCase = 121252;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xyza^3*-3*xyza-3*xyza/1*xyza^2*-2*xyza^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyza^31*xyza^3*-3*xyza-3*xyza/1*xyza^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=251 EqnNumber=55 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[46, 55, 4, 5, 4, 2, 3, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 1, 1, 2, 1, 1, 2, 3, 4, 1, 1, 1, 15, 4, 1, 2, 3, 12]"+
"// DOEMatrixRow=[43, 57, 7, 2, 1, 2, 3, 9, 1, 1, 2, 1, 2, 3, 4, 2, 3, 7, 6, 1, 2, 1, 1, 2, 6, 3, 1, 2, 1, 10, 1, 18, 15]"+
//Tail EqnIndex=251 EqnNumber=55 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[46, 55, 4, 5, 4, 2, 3, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 1, 1, 2, 1, 1, 2, 3, 4, 1, 1, 1, 15, 4, 1, 2, 3, 12]"+
"// DOEMatrixRow=[43, 57, 7, 2, 1, 2, 3, 9, 1, 1, 2, 1, 2, 3, 4, 2, 3, 7, 6, 1, 2, 1, 1, 2, 6, 3, 1, 2, 1, 10, 1, 18, 15]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-3.0*xyza^4.0-x0^2.0*x0*108.0*xyza^69.0-3.0*xyza^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-3.0*4.0*xyza^3.0-x0^2.0*x0*108.0*69.0*xyza^68.0-3.0*3.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-12.0*xyza^3.0-x0^2.0*x0*7452.0*xyza^68.0-9.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-3.0*xyza^4.0-x0^2.0*x0*108.0*xyza^69.0-3.0*xyza^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-3.0/5.0*xyza^5.0-x0^2.0*x0*108.0/70.0*xyza^70.0-3.0/4.0*xyza^4.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-0.6*xyza^5.0-x0^2.0*x0*1.542857142857143*xyza^70.0-1.0/1.3333333333333333*xyza^4.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-12.0*xyza^3.0-x0^2.0*x0*7452.0*xyza^68.0-9.0*xyza^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-12.0*3.0*xyza^2.0-x0^2.0*x0*7452.0*68.0*xyza^67.0-9.0*2.0*xyza^1.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-36.0*xyza^2.0-x0^2.0*x0*506736.0*xyza^67.0-18.0*xyza";
 UsageCalculus.EqnSolArrayMap3[2] = "-0.6*xyza^5.0-x0^2.0*x0*1.542857142857143*xyza^70.0-1.0/1.3333333333333333*xyza^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-0.6/6.0*xyza^6.0-x0^2.0*x0*1.542857142857143/71.0*xyza^71.0-1.0/1.3333333333333333/5.0*xyza^5.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-0.09999999999999999*xyza^6.0-x0^2.0*x0/46.01851851851852*xyza^71.0-1.0/6.666666666666666*xyza^5.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-36.0*xyza^2.0-x0^2.0*x0*506736.0*xyza^67.0-18.0*xyza";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-36.0*2.0*xyza^1.0-x0^2.0*x0*506736.0*67.0*xyza^66.0-18.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-72.0*xyza-x0^2.0*x0*3.3951312E7*xyza^66.0-18.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-0.09999999999999999*xyza^6.0-x0^2.0*x0/46.01851851851852*xyza^71.0-1.0/6.666666666666666*xyza^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-0.09999999999999999/7.0*xyza^7.0-x0^2.0*x0/46.01851851851852/72.0*xyza^72.0-1.0/6.666666666666666/6.0*xyza^6.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-0.014285714285714285*xyza^7.0-x0^2.0*x0/3313.3333333333335*xyza^72.0-1.0/40.0*xyza^6.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-72.0*xyza-x0^2.0*x0*3.3951312E7*xyza^66.0-18.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-72.0-x0^2.0*x0*3.3951312E7*66.0*xyza^65.0-18.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-72.0-x0^2.0*x0*2.240786592E9*xyza^65.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-0.014285714285714285*xyza^7.0-x0^2.0*x0/3313.3333333333335*xyza^72.0-1.0/40.0*xyza^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-0.014285714285714285/8.0*xyza^8.0-x0^2.0*x0/3313.3333333333335/73.0*xyza^73.0-1.0/40.0/7.0*xyza^7.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-0.0017857142857142857*xyza^8.0-x0^2.0*x0/241873.33333333334*xyza^73.0-1.0/280.0*xyza^7.0";
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

public static void TestCaseDiff121253() {
 UsageCalculus.TestCase = 121253;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*x/1*x^2*-2*x^31*x0^2*-2*x0^3*3*x0/-1*x0^22*x^33*x/-1*x^2-1*x0^2*-2*x0^3*3*x0-3*x/1*x^21*x0^2*-2*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=252 EqnNumber=56 FamilyID=1 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[11, 56, 5, 6, 1, 3, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 1, 2, 3, 2, 16, 1, 2, 3, 4, 13]"+
"// DOEMatrixRow=[8, 58, 8, 3, 2, 3, 1, 10, 2, 3, 4, 2, 3, 1, 1, 3, 1, 8, 7, 2, 3, 2, 3, 1, 1, 4, 2, 3, 2, 11, 2, 19, 16]"+
//Tail EqnIndex=252 EqnNumber=56 FamilyID=1 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[11, 56, 5, 6, 1, 3, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 1, 2, 3, 2, 16, 1, 2, 3, 4, 13]"+
"// DOEMatrixRow=[8, 58, 8, 3, 2, 3, 1, 10, 2, 3, 4, 2, 3, 1, 1, 3, 1, 8, 7, 2, 3, 2, 3, 1, 1, 4, 2, 3, 2, 11, 2, 19, 16]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-36.0*x^70.0+6.0+6.0*x^22.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-36.0*70.0*x^69.0+6.0*0.0+6.0*22.0*x^21.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-2520.0*x^69.0+132.0*x^21.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-36.0*x^70.0+6.0+6.0*x^22.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-36.0/71.0*x^71.0+6.0*x+6.0/23.0*x^23.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/1.9722222222222223*x^71.0+6.0*x+1.0/3.8333333333333335*x^23.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-2520.0*x^69.0+132.0*x^21.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-2520.0*69.0*x^68.0+132.0*21.0*x^20.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-173880.0*x^68.0+2772.0*x^20.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/1.9722222222222223*x^71.0+6.0*x+1.0/3.8333333333333335*x^23.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/1.9722222222222223/72.0*x^72.0+6.0/2.0*x^2.0+1.0/3.8333333333333335/24.0*x^24.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/142.0*x^72.0+3.0*x^2.0+1.0/92.0*x^24.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-173880.0*x^68.0+2772.0*x^20.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-173880.0*68.0*x^67.0+2772.0*20.0*x^19.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-1.182384E7*x^67.0+55440.0*x^19.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/142.0*x^72.0+3.0*x^2.0+1.0/92.0*x^24.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/142.0/73.0*x^73.0+3.0/3.0*x^3.0+1.0/92.0/25.0*x^25.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/10366.0*x^73.0+x^3.0+1.0/2300.0*x^25.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-1.182384E7*x^67.0+55440.0*x^19.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-67.0*x^66.0+55440.0*19.0*x^18.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-67.0*x^66.0+1053360.0*x^18.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-9.646922631680494E-5*x^73.0+x^3.0+1.0/2300.0*x^25.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-9.646922631680494E-5/74.0*x^74.0+1.0/4.0*x^4.0+1.0/2300.0/26.0*x^26.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/767084.0*x^74.0-1.0/14.8*x^74.0+1.0/4.0*x^4.0+1.0/59800.0*x^26.0";
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

public static void TestCaseDiff121254() {
 UsageCalculus.TestCase = 121254;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x0^2*-2*x0^3*3*x0/-1*x0^22*xy^33*xy/-1*xy^2-1*x0^2*-2*x0^3*3*x02*xy^3*3*xy/1*xy^2*--3*xy^33*xy1*x0^2*-2*x0^32*xy^3*3*xy";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=253 EqnNumber=57 FamilyID=3 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[77, 57, 6, 7, 2, 1, 2, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 3, 4, 3, 1, 2, 3, 2, 3, 1, 3, 1, 2, 3, 4, 5, 14]"+
"// DOEMatrixRow=[74, 59, 9, 4, 3, 1, 2, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 9, 8, 3, 1, 3, 1, 2, 3, 1, 3, 1, 3, 12, 1, 20, 17]"+
//Tail EqnIndex=253 EqnNumber=57 FamilyID=3 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[77, 57, 6, 7, 2, 1, 2, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 3, 4, 3, 1, 2, 3, 2, 3, 1, 3, 1, 2, 3, 4, 5, 14]"+
"// DOEMatrixRow=[74, 59, 9, 4, 3, 1, 2, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 9, 8, 3, 1, 3, 1, 2, 3, 1, 3, 1, 3, 12, 1, 20, 17]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^2.0*x0*6.0*xy^36.0+x0^2.0*324.0*xy^43.0+x0^2.0*18.0*xy^37.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^2.0*x0*6.0*36.0*xy^35.0+x0^2.0*324.0*43.0*xy^42.0+x0^2.0*18.0*37.0*xy^36.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^2.0*x0*216.0*xy^35.0+x0^2.0*13932.0*xy^42.0+x0^2.0*666.0*xy^36.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^2.0*x0*6.0*xy^36.0+x0^2.0*324.0*xy^43.0+x0^2.0*18.0*xy^37.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^2.0*x0*6.0/37.0*xy^37.0+x0^2.0*324.0/44.0*xy^44.0+x0^2.0*18.0/38.0*xy^38.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^2.0*x0*0.16216216216216217*xy^37.0+x0^2.0*7.363636363636363*xy^44.0+x0^2.0/2.111111111111111*xy^38.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^2.0*x0*216.0*xy^35.0+x0^2.0*13932.0*xy^42.0+x0^2.0*666.0*xy^36.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^2.0*x0*216.0*35.0*xy^34.0+x0^2.0*13932.0*42.0*xy^41.0+x0^2.0*666.0*36.0*xy^35.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^2.0*x0*7560.0*xy^34.0+x0^2.0*585144.0*xy^41.0+x0^2.0*23976.0*xy^35.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^2.0*x0*0.16216216216216217*xy^37.0+x0^2.0*7.363636363636363*xy^44.0+x0^2.0/2.111111111111111*xy^38.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^2.0*x0*0.16216216216216217/38.0*xy^38.0+x0^2.0*7.363636363636363/45.0*xy^45.0+x0^2.0*2.111111111111111/39.0*xy^39.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^2.0*x0*0.004267425320056899*xy^38.0+x0^2.0*0.16363636363636364*xy^45.0+x0^2.0/18.473684210526315*xy^39.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^2.0*x0*7560.0*xy^34.0+x0^2.0*585144.0*xy^41.0+x0^2.0*23976.0*xy^35.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^2.0*x0*7560.0*34.0*xy^33.0+x0^2.0*585144.0*41.0*xy^40.0+x0^2.0*23976.0*35.0*xy^34.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^2.0*x0*257040.0*xy^33.0+x0^2.0*2.3990904E7*xy^40.0+x0^2.0*839160.0*xy^34.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^2.0*x0*0.004267425320056899*xy^38.0+x0^2.0*0.16363636363636364*xy^45.0+x0^2.0/18.473684210526315*xy^39.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^2.0*x0*0.004267425320056899/39.0*xy^39.0+x0^2.0*0.16363636363636364/46.0*xy^46.0+x0^2.0*18.473684210526315/40.0*xy^40.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^2.0*x0*1.0942116205274101E-4*xy^39.0+x0^2.0*0.0035573122529644267*xy^46.0+x0^2.0/2.1652421652421654*xy^40.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^2.0*x0*257040.0*xy^33.0+x0^2.0*2.3990904E7*xy^40.0+x0^2.0*839160.0*xy^34.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^2.0*x0*257040.0*33.0*xy^32.0+x0^2.0*2.3990904E7*40.0*xy^39.0+x0^2.0*839160.0*34.0*xy^33.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^2.0*x0*8482320.0*xy^32.0+x0^2.0*9.5963616E8*xy^39.0+x0^2.0*2.853144E7*xy^33.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^2.0*x0*1.0942116205274101E-4*xy^39.0-4.0*xy^39.0+x0^2.0*0.0035573122529644267*xy^46.0+x0^2.0/2.1652421652421654*xy^40.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^2.0*x0*1.0942116205274101E-4/40.0*xy^40.0-4.0/40.0*xy^40.0+x0^2.0*0.0035573122529644267/47.0*xy^47.0+x0^2.0*2.1652421652421654/41.0*xy^41.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^2.0*x0/365559.99999999994*xy^40.0-1.0/10.0*xy^40.0-0.1*xy^40.0+x0^2.0*7.568749474392398E-5*xy^47.0+x0^2.0/18.935526315789474*xy^41.0";
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

public static void TestCaseDiff121255() {
 UsageCalculus.TestCase = 121255;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xyz^33*xyz/-1*xyz^2-1*x0^2*-2*x0^3*3*x02*xyz^3*3*xyz/1*xyz^2*--3*xyz^33*xyz1*x0^2*--3*x0^3-3*xyz^3*1*xyz/2*xyz^22*xyz^3*3*xyz3*xyz/-1*xyz^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=254 EqnNumber=58 FamilyID=1 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[41, 58, 7, 8, 3, 2, 3, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 1, 1, 4, 2, 3, 1, 3, 4, 2, 4, 2, 3, 4, 5, 6, 15]"+
"// DOEMatrixRow=[38, 60, 10, 1, 1, 2, 3, 2, 1, 1, 2, 1, 2, 3, 4, 2, 3, 10, 9, 1, 2, 4, 2, 3, 4, 2, 1, 2, 4, 13, 2, 1, 18]"+
//Tail EqnIndex=254 EqnNumber=58 FamilyID=1 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[41, 58, 7, 8, 3, 2, 3, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 1, 1, 4, 2, 3, 1, 3, 4, 2, 4, 2, 3, 4, 5, 6, 15]"+
"// DOEMatrixRow=[38, 60, 10, 1, 1, 2, 3, 2, 1, 1, 2, 1, 2, 3, 4, 2, 3, 10, 9, 1, 2, 4, 2, 3, 4, 2, 1, 2, 4, 13, 2, 1, 18]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-2.0*xyz^36.0+x0^2.0*162.0*xyz^39.0-x0^2.0*9.0*xyz^33.0-x0^3.0*3.0+4.5*xyz^32.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-2.0*36.0*xyz^35.0+x0^2.0*162.0*39.0*xyz^38.0-x0^2.0*9.0*33.0*xyz^32.0-x0^3.0*3.0*0.0+4.5*32.0*xyz^31.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-72.0*xyz^35.0+x0^2.0*6318.0*xyz^38.0-x0^2.0*297.0*xyz^32.0-x0^3.0*0.0+144.0*xyz^31.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-2.0*xyz^36.0+x0^2.0*162.0*xyz^39.0-x0^2.0*9.0*xyz^33.0-x0^3.0*3.0+4.5*xyz^32.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-2.0/37.0*xyz^37.0+x0^2.0*162.0/40.0*xyz^40.0-x0^2.0*9.0/34.0*xyz^34.0-x0^3.0*xyz+4.5/33.0*xyz^33.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-0.05405405405405406*xyz^37.0+x0^2.0*4.05*xyz^40.0-x0^2.0*0.2647058823529412*xyz^34.0-x0^3.0*xyz+1.0/7.333333333333333*xyz^33.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-72.0*xyz^35.0+x0^2.0*6318.0*xyz^38.0-x0^2.0*297.0*xyz^32.0-x0^3.0*0.0+144.0*xyz^31.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-72.0*35.0*xyz^34.0+x0^2.0*6318.0*38.0*xyz^37.0-x0^2.0*297.0*32.0*xyz^31.0-x0^3.0*0.0*0.0+144.0*31.0*xyz^30.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-2520.0*xyz^34.0+x0^2.0*240084.0*xyz^37.0-x0^2.0*9504.0*xyz^31.0-x0^3.0*0.0+4464.0*xyz^30.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-0.05405405405405406*xyz^37.0+x0^2.0*4.05*xyz^40.0-x0^2.0*0.2647058823529412*xyz^34.0-x0^3.0*xyz+1.0/7.333333333333333*xyz^33.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-0.05405405405405406/38.0*xyz^38.0+x0^2.0*4.05/41.0*xyz^41.0-x0^2.0*0.2647058823529412/35.0*xyz^35.0-x0^3.0/2.0*xyz^2.0+1.0/7.333333333333333/34.0*xyz^34.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-0.001422475106685633*xyz^38.0+x0^2.0*0.09878048780487804*xyz^41.0-x0^2.0*0.007563025210084034*xyz^35.0-x0^3.0/2.0*xyz^2.0+1.0/249.33333333333331*xyz^34.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-2520.0*xyz^34.0+x0^2.0*240084.0*xyz^37.0-x0^2.0*9504.0*xyz^31.0-x0^3.0*0.0+4464.0*xyz^30.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-2520.0*34.0*xyz^33.0+x0^2.0*240084.0*37.0*xyz^36.0-x0^2.0*9504.0*31.0*xyz^30.0-x0^3.0*0.0*0.0+4464.0*30.0*xyz^29.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-85680.0*xyz^33.0+x0^2.0*8883108.0*xyz^36.0-x0^2.0*294624.0*xyz^30.0-x0^3.0*0.0+133920.0*xyz^29.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-0.001422475106685633*xyz^38.0+x0^2.0*0.09878048780487804*xyz^41.0-x0^2.0*0.007563025210084034*xyz^35.0-x0^3.0/2.0*xyz^2.0+1.0/249.33333333333331*xyz^34.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-0.001422475106685633/39.0*xyz^39.0+x0^2.0*0.09878048780487804/42.0*xyz^42.0-x0^2.0*0.007563025210084034/36.0*xyz^36.0-x0^3.0/2.0/3.0*xyz^3.0+1.0/249.33333333333331/35.0*xyz^35.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-3.6473720684247E-5*xyz^39.0+x0^2.0*0.00235191637630662*xyz^42.0-x0^2.0*2.100840336134454E-4*xyz^36.0-x0^3.0/6.0*xyz^3.0+1.0/8726.666666666666*xyz^35.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-85680.0*xyz^33.0+x0^2.0*8883108.0*xyz^36.0-x0^2.0*294624.0*xyz^30.0-x0^3.0*0.0+133920.0*xyz^29.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-85680.0*33.0*xyz^32.0+x0^2.0*8883108.0*36.0*xyz^35.0-x0^2.0*294624.0*30.0*xyz^29.0-x0^3.0*0.0*0.0+133920.0*29.0*xyz^28.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-2827440.0*xyz^32.0+x0^2.0*3.19791888E8*xyz^35.0-x0^2.0*8838720.0*xyz^29.0-x0^3.0*0.0+3883680.0*xyz^28.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-3.6473720684247E-5*xyz^39.0-5.0*xyz^39.0+x0^2.0*0.00235191637630662*xyz^42.0-x0^2.0*2.100840336134454E-4*xyz^36.0-4.0*xyz^36.0-x0^3.0/6.0*xyz^3.0+1.0/8726.666666666666*xyz^35.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-3.6473720684247E-5/40.0*xyz^40.0-5.0/40.0*xyz^40.0+x0^2.0*0.00235191637630662/43.0*xyz^43.0-x0^2.0*2.100840336134454E-4/37.0*xyz^37.0-4.0/37.0*xyz^37.0-x0^3.0/6.0/4.0*xyz^4.0+1.0/8726.666666666666/36.0*xyz^36.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/1096680.0*xyz^40.0-1.0/8.0*xyz^40.0-0.125*xyz^40.0+x0^2.0*5.46957296815493E-5*xyz^43.0-x0^2.0/176120.0*xyz^37.0-1.0/9.25*xyz^37.0-0.10810810810810811*xyz^37.0-x0^3.0/24.0*xyz^4.0+1.0/314160.0*xyz^36.0";
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

public static void TestCaseDiff121256() {
 UsageCalculus.TestCase = 121256;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xyza/-1*xyza^2-1*x0^2*-2*x0^3*3*x02*xyza^3*3*xyza/1*xyza^2*--3*xyza^33*xyza1*x0^2*--3*x0^3-3*xyza^3*1*xyza/2*xyza^21*xyza/2*xyza^2*-3*xyza*-1*xyza^22*x0^23*xyza/-1*xyza^2-1*x0^2*-2*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=255 EqnNumber=59 FamilyID=2 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[6, 59, 8, 9, 4, 3, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 2, 3, 5, 3, 1, 2, 4, 5, 3, 1, 3, 4, 5, 6, 7, 16]"+
"// DOEMatrixRow=[3, 61, 11, 2, 3, 1, 1, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 11, 10, 2, 3, 5, 3, 1, 5, 3, 2, 3, 1, 14, 1, 2, 19]"+
//Tail EqnIndex=255 EqnNumber=59 FamilyID=2 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[6, 59, 8, 9, 4, 3, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 2, 3, 5, 3, 1, 2, 4, 5, 3, 1, 3, 4, 5, 6, 7, 16]"+
"// DOEMatrixRow=[3, 61, 11, 2, 3, 1, 1, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 11, 10, 2, 3, 5, 3, 1, 5, 3, 2, 3, 1, 14, 1, 2, 19]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-3.0*xyza^3.0+x0^2.0*162.0*xyza^39.0-x0^2.0*9.0*xyza^33.0-x0^3.0*3.0+x0^23.0*2.25*xyza^54.0+x0^2.0*2.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-3.0*3.0*xyza^2.0+x0^2.0*162.0*39.0*xyza^38.0-x0^2.0*9.0*33.0*xyza^32.0-x0^3.0*3.0*0.0+x0^23.0*2.25*54.0*xyza^53.0+x0^2.0*2.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-9.0*xyza^2.0+x0^2.0*6318.0*xyza^38.0-x0^2.0*297.0*xyza^32.0-x0^3.0*0.0+x0^23.0*121.5*xyza^53.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-3.0*xyza^3.0+x0^2.0*162.0*xyza^39.0-x0^2.0*9.0*xyza^33.0-x0^3.0*3.0+x0^23.0*2.25*xyza^54.0+x0^2.0*2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-3.0/4.0*xyza^4.0+x0^2.0*162.0/40.0*xyza^40.0-x0^2.0*9.0/34.0*xyza^34.0-x0^3.0*xyza+x0^23.0*2.25/55.0*xyza^55.0+x0^2.0*xyza";
 UsageCalculus.EqnSolArrayMap4[1] = "-0.75*xyza^4.0+x0^2.0*4.05*xyza^40.0-x0^2.0*0.2647058823529412*xyza^34.0-x0^3.0*xyza+x0^23.0*0.04090909090909091*xyza^55.0+x0^2.0*xyza";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-9.0*xyza^2.0+x0^2.0*6318.0*xyza^38.0-x0^2.0*297.0*xyza^32.0-x0^3.0*0.0+x0^23.0*121.5*xyza^53.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-9.0*2.0*xyza^1.0+x0^2.0*6318.0*38.0*xyza^37.0-x0^2.0*297.0*32.0*xyza^31.0-x0^3.0*0.0*0.0+x0^23.0*121.5*53.0*xyza^52.0+x0^2.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-18.0*xyza+x0^2.0*240084.0*xyza^37.0-x0^2.0*9504.0*xyza^31.0-x0^3.0*0.0+x0^23.0*6439.5*xyza^52.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-0.75*xyza^4.0+x0^2.0*4.05*xyza^40.0-x0^2.0*0.2647058823529412*xyza^34.0-x0^3.0*xyza+x0^23.0*0.04090909090909091*xyza^55.0+x0^2.0*xyza";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-0.75/5.0*xyza^5.0+x0^2.0*4.05/41.0*xyza^41.0-x0^2.0*0.2647058823529412/35.0*xyza^35.0-x0^3.0/2.0*xyza^2.0+x0^23.0*0.04090909090909091/56.0*xyza^56.0+x0^2.0/2.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-0.15*xyza^5.0+x0^2.0*0.09878048780487804*xyza^41.0-x0^2.0*0.007563025210084034*xyza^35.0-x0^3.0/2.0*xyza^2.0+x0^23.0*7.305194805194805E-4*xyza^56.0+x0^2.0/2.0*xyza^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-18.0*xyza+x0^2.0*240084.0*xyza^37.0-x0^2.0*9504.0*xyza^31.0-x0^3.0*0.0+x0^23.0*6439.5*xyza^52.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-18.0+x0^2.0*240084.0*37.0*xyza^36.0-x0^2.0*9504.0*31.0*xyza^30.0-x0^3.0*0.0*0.0+x0^23.0*6439.5*52.0*xyza^51.0+x0^2.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-18.0+x0^2.0*8883108.0*xyza^36.0-x0^2.0*294624.0*xyza^30.0-x0^3.0*0.0+x0^23.0*334854.0*xyza^51.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-0.15*xyza^5.0+x0^2.0*0.09878048780487804*xyza^41.0-x0^2.0*0.007563025210084034*xyza^35.0-x0^3.0/2.0*xyza^2.0+x0^23.0*7.305194805194805E-4*xyza^56.0-4.0*xyza^56.0+x0^2.0/2.0*xyza^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-0.15/6.0*xyza^6.0+x0^2.0*0.09878048780487804/42.0*xyza^42.0-x0^2.0*0.007563025210084034/36.0*xyza^36.0-x0^3.0/2.0/3.0*xyza^3.0+x0^23.0*7.305194805194805E-4/57.0*xyza^57.0-4.0/57.0*xyza^57.0+x0^2.0*2.0/3.0*xyza^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-0.024999999999999998*xyza^6.0+x0^2.0*0.00235191637630662*xyza^42.0-x0^2.0*2.100840336134454E-4*xyza^36.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^23.0/78026.66666666666*xyza^57.0-1.0/14.25*xyza^57.0-0.07017543859649122*xyza^57.0+x0^2.0/1.5*xyza^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-18.0+x0^2.0*8883108.0*xyza^36.0-x0^2.0*294624.0*xyza^30.0-x0^3.0*0.0+x0^23.0*334854.0*xyza^51.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0+x0^2.0*8883108.0*36.0*xyza^35.0-x0^2.0*294624.0*30.0*xyza^29.0-x0^3.0*0.0*0.0+x0^23.0*334854.0*51.0*xyza^50.0+x0^2.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*3.19791888E8*xyza^35.0-x0^2.0*8838720.0*xyza^29.0-x0^3.0*0.0+x0^23.0*1.7077554E7*xyza^50.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-0.024999999999999998*xyza^6.0+x0^2.0*0.00235191637630662*xyza^42.0-x0^2.0*2.100840336134454E-4*xyza^36.0-4.0*xyza^36.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^23.0/78026.66666666666*xyza^57.0-1.0/14.25*xyza^57.0-0.07017543859649122*xyza^57.0+x0^2.0/1.5*xyza^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-0.024999999999999998/7.0*xyza^7.0+x0^2.0*0.00235191637630662/43.0*xyza^43.0-x0^2.0*2.100840336134454E-4/37.0*xyza^37.0-4.0/37.0*xyza^37.0-x0^3.0*0.16666666666666666/4.0*xyza^4.0+x0^23.0/78026.66666666666/58.0*xyza^58.0-1.0/14.25/58.0*xyza^58.0-0.07017543859649122/58.0*xyza^58.0+x0^2.0*1.5/4.0*xyza^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-0.0035714285714285713*xyza^7.0+x0^2.0*5.46957296815493E-5*xyza^43.0-x0^2.0/176120.0*xyza^37.0-1.0/9.25*xyza^37.0-0.10810810810810811*xyza^37.0-x0^3.0*0.041666666666666664*xyza^4.0+x0^23.0/4525546.666666666*xyza^58.0-1.0/826.5*xyza^58.0-0.0012099213551119176*xyza^58.0+x0^2.0/2.6666666666666665*xyza^4.0";
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

public static void TestCaseDiff121257() {
 UsageCalculus.TestCase = 121257;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-1*x0^2*-2*x0^3*3*x02*x^3*3*x/1*x^2*--3*x^33*x1*x0^2*--3*x0^3-3*x^3*1*x/2*x^21*x/2*x^2*-3*x*-1*x^22*x0^23*x*-1*x^2-1*x^2/2*x*-3*x^2-1*x0^2*-2*x0^32*x^3*3*x";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=256 EqnNumber=60 FamilyID=3 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[72, 60, 9, 10, 1, 1, 2, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 4, 6, 1, 2, 3, 1, 6, 1, 2, 4, 1, 6, 7, 8, 17]"+
"// DOEMatrixRow=[69, 62, 12, 3, 1, 2, 3, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 12, 1, 3, 1, 1, 1, 2, 6, 4, 3, 1, 2, 15, 2, 3, 20]"+
//Tail EqnIndex=256 EqnNumber=60 FamilyID=3 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[72, 60, 9, 10, 1, 1, 2, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 4, 6, 1, 2, 3, 1, 6, 1, 2, 4, 1, 6, 7, 8, 17]"+
"// DOEMatrixRow=[69, 62, 12, 3, 1, 2, 3, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 12, 1, 3, 1, 1, 1, 2, 6, 4, 3, 1, 2, 15, 2, 3, 20]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "162.0*x^39.0-9.0*x^33.0-3.0+2.25*x^54.0+1.5*x^5.0+6.0*x^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "162.0*39.0*x^38.0-9.0*33.0*x^32.0-3.0*0.0+2.25*54.0*x^53.0+1.5*5.0*x^4.0+6.0*4.0*x^3.0";
 UsageCalculus.EqnSolArrayMap2[1] = "6318.0*x^38.0-297.0*x^32.0+121.5*x^53.0+7.5*x^4.0+24.0*x^3.0";
 UsageCalculus.EqnSolArrayMap3[1] = "162.0*x^39.0-9.0*x^33.0-3.0+2.25*x^54.0+1.5*x^5.0+6.0*x^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "162.0/40.0*x^40.0-9.0/34.0*x^34.0-3.0*x+2.25/55.0*x^55.0+1.5/6.0*x^6.0+6.0/5.0*x^5.0";
 UsageCalculus.EqnSolArrayMap4[1] = "4.05*x^40.0-1.0/3.7777777777777777*x^34.0-3.0*x+1.0/24.444444444444443*x^55.0+1.0/4.0*x^6.0+1.2*x^5.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "6318.0*x^38.0-297.0*x^32.0+121.5*x^53.0+7.5*x^4.0+24.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "6318.0*38.0*x^37.0-297.0*32.0*x^31.0+121.5*53.0*x^52.0+7.5*4.0*x^3.0+24.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[2] = "240084.0*x^37.0-9504.0*x^31.0+6439.5*x^52.0+30.0*x^3.0+72.0*x^2.0";
 UsageCalculus.EqnSolArrayMap3[2] = "4.05*x^40.0-1.0/3.7777777777777777*x^34.0-3.0*x+1.0/24.444444444444443*x^55.0+1.0/4.0*x^6.0+1.2*x^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "4.05/41.0*x^41.0-1.0/3.7777777777777777/35.0*x^35.0-3.0/2.0*x^2.0+1.0/24.444444444444443/56.0*x^56.0+1.0/4.0/7.0*x^7.0+1.2/6.0*x^6.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/10.123456790123457*x^41.0-1.0/132.22222222222223*x^35.0-1.5*x^2.0+1.0/1368.8888888888887*x^56.0+1.0/28.0*x^7.0+1.0/5.0*x^6.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "240084.0*x^37.0-9504.0*x^31.0+6439.5*x^52.0+30.0*x^3.0+72.0*x^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "240084.0*37.0*x^36.0-9504.0*31.0*x^30.0+6439.5*52.0*x^51.0+30.0*3.0*x^2.0+72.0*2.0*x^1.0";
 UsageCalculus.EqnSolArrayMap2[3] = "8883108.0*x^36.0-294624.0*x^30.0+334854.0*x^51.0+90.0*x^2.0+144.0*x";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/10.123456790123457*x^41.0-1.0/132.22222222222223*x^35.0-1.5*x^2.0+1.0/1368.8888888888887*x^56.0+1.0/28.0*x^7.0+1.0/5.0*x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/10.123456790123457/42.0*x^42.0-1.0/132.22222222222223/36.0*x^36.0-1.5/3.0*x^3.0+1.0/1368.8888888888887/57.0*x^57.0+1.0/28.0/8.0*x^8.0+1.0/5.0/7.0*x^7.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/425.1851851851852*x^42.0-1.0/4760.0*x^36.0-1.0/2.0*x^3.0+1.0/78026.66666666666*x^57.0+1.0/224.0*x^8.0+1.0/35.0*x^7.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "8883108.0*x^36.0-294624.0*x^30.0+334854.0*x^51.0+90.0*x^2.0+144.0*x";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "8883108.0*36.0*x^35.0-294624.0*30.0*x^29.0+334854.0*51.0*x^50.0+90.0*2.0*x^1.0+144.0";
 UsageCalculus.EqnSolArrayMap2[4] = "3.19791888E8*x^35.0-8838720.0*x^29.0+1.7077554E7*x^50.0+180.0*x+144.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/425.1851851851852*x^42.0-1.0/4760.0*x^36.0-1.0/2.0*x^3.0+1.0/78026.66666666666*x^57.0+1.0/224.0*x^8.0+1.0/35.0*x^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/425.1851851851852/43.0*x^43.0-1.0/4760.0/37.0*x^37.0-1.0/2.0/4.0*x^4.0+1.0/78026.66666666666/58.0*x^58.0+1.0/224.0/9.0*x^9.0+1.0/35.0/8.0*x^8.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/18282.962962962964*x^43.0-1.0/176120.0*x^37.0-1.0/8.0*x^4.0+1.0/4525546.666666666*x^58.0+1.0/2016.0*x^9.0+1.0/280.0*x^8.0";
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

public static void TestCaseDiff121258() {
 UsageCalculus.TestCase = 121258;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xy^3*3*xy/1*xy^2*--3*xy^33*xy1*x0^2*--3*x0^3-3*xy^3*1*xy/2*xy^21*xy/2*xy^2*-3*xy*-1*xy^22*x0^23*xy*-1*xy^2-1*xy^2/2*xy*-3*xy^22*xy*-3*xy^2*1*xy/-3*xy^23*xy012^22*xy^3*3*xy3*xy/1*xy^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=257 EqnNumber=61 FamilyID=1 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[36, 61, 10, 11, 2, 3, 1, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 1, 7, 2, 3, 1, 2, 7, 2, 3, 5, 2, 7, 8, 9, 18]"+
"// DOEMatrixRow=[33, 63, 13, 4, 2, 3, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 13, 2, 1, 2, 3, 2, 3, 1, 1, 1, 2, 3, 16, 1, 4, 1]"+
//Tail EqnIndex=257 EqnNumber=61 FamilyID=1 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[36, 61, 10, 11, 2, 3, 1, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 1, 7, 2, 3, 1, 2, 7, 2, 3, 5, 2, 7, 8, 9, 18]"+
"// DOEMatrixRow=[33, 63, 13, 4, 2, 3, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 13, 2, 1, 2, 3, 2, 3, 1, 1, 1, 2, 3, 16, 1, 4, 1]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0*54.0*xy^39.0-x0^2.0*9.0*xy^33.0-x0^3.0*3.0+x0^23.0*2.25*xy^54.0+4.5*xy^58.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0*54.0*39.0*xy^38.0-x0^2.0*9.0*33.0*xy^32.0-x0^3.0*3.0*0.0+x0^23.0*2.25*54.0*xy^53.0+4.5*58.0*xy^57.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*2106.0*xy^38.0-x0^2.0*297.0*xy^32.0-x0^3.0*0.0+x0^23.0*121.5*xy^53.0+261.0*xy^57.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0*54.0*xy^39.0-x0^2.0*9.0*xy^33.0-x0^3.0*3.0+x0^23.0*2.25*xy^54.0+4.5*xy^58.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0*54.0/40.0*xy^40.0-x0^2.0*9.0/34.0*xy^34.0-x0^3.0*xy+x0^23.0*2.25/55.0*xy^55.0+4.5/59.0*xy^59.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0*1.35*xy^40.0-x0^2.0*0.2647058823529412*xy^34.0-x0^3.0*xy+x0^23.0/24.444444444444443*xy^55.0+1.0/13.11111111111111*xy^59.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*2106.0*xy^38.0-x0^2.0*297.0*xy^32.0-x0^3.0*0.0+x0^23.0*121.5*xy^53.0+261.0*xy^57.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*2106.0*38.0*xy^37.0-x0^2.0*297.0*32.0*xy^31.0-x0^3.0*0.0*0.0+x0^23.0*121.5*53.0*xy^52.0+261.0*57.0*xy^56.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*80028.0*xy^37.0-x0^2.0*9504.0*xy^31.0-x0^3.0*0.0+x0^23.0*6439.5*xy^52.0+14877.0*xy^56.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0*1.35*xy^40.0-x0^2.0*0.2647058823529412*xy^34.0-x0^3.0*xy+x0^23.0/24.444444444444443*xy^55.0+1.0/13.11111111111111*xy^59.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0*1.35/41.0*xy^41.0-x0^2.0*0.2647058823529412/35.0*xy^35.0-x0^3.0/2.0*xy^2.0+x0^23.0/24.444444444444443/56.0*xy^56.0+1.0/13.11111111111111/60.0*xy^60.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0*0.032926829268292684*xy^41.0-x0^2.0*0.007563025210084034*xy^35.0-x0^3.0/2.0*xy^2.0+x0^23.0/1368.8888888888887*xy^56.0+1.0/786.6666666666666*xy^60.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*80028.0*xy^37.0-x0^2.0*9504.0*xy^31.0-x0^3.0*0.0+x0^23.0*6439.5*xy^52.0+14877.0*xy^56.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*80028.0*37.0*xy^36.0-x0^2.0*9504.0*31.0*xy^30.0-x0^3.0*0.0*0.0+x0^23.0*6439.5*52.0*xy^51.0+14877.0*56.0*xy^55.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*2961036.0*xy^36.0-x0^2.0*294624.0*xy^30.0-x0^3.0*0.0+x0^23.0*334854.0*xy^51.0+833112.0*xy^55.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0*0.032926829268292684*xy^41.0-x0^2.0*0.007563025210084034*xy^35.0-x0^3.0/2.0*xy^2.0+x0^23.0/1368.8888888888887*xy^56.0+1.0/786.6666666666666*xy^60.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0*0.032926829268292684/42.0*xy^42.0-x0^2.0*0.007563025210084034/36.0*xy^36.0-x0^3.0/2.0/3.0*xy^3.0+x0^23.0/1368.8888888888887/57.0*xy^57.0+1.0/786.6666666666666/61.0*xy^61.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0*7.839721254355401E-4*xy^42.0-x0^2.0*2.100840336134454E-4*xy^36.0-x0^3.0*0.16666666666666666*xy^3.0+x0^23.0/78026.66666666666*xy^57.0+1.0/47986.666666666664*xy^61.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*2961036.0*xy^36.0-x0^2.0*294624.0*xy^30.0-x0^3.0*0.0+x0^23.0*334854.0*xy^51.0+833112.0*xy^55.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*2961036.0*36.0*xy^35.0-x0^2.0*294624.0*30.0*xy^29.0-x0^3.0*0.0*0.0+x0^23.0*334854.0*51.0*xy^50.0+833112.0*55.0*xy^54.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*1.06597296E8*xy^35.0-x0^2.0*8838720.0*xy^29.0-x0^3.0*0.0+x0^23.0*1.7077554E7*xy^50.0+4.582116E7*xy^54.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0*7.839721254355401E-4*xy^42.0-4.0*xy^42.0-x0^2.0*2.100840336134454E-4*xy^36.0-4.0*xy^36.0-x0^3.0*0.16666666666666666*xy^3.0+x0^23.0/78026.66666666666*xy^57.0+1.0/47986.666666666664*xy^61.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0*7.839721254355401E-4/43.0*xy^43.0-4.0/43.0*xy^43.0-x0^2.0*2.100840336134454E-4/37.0*xy^37.0-4.0/37.0*xy^37.0-x0^3.0*0.16666666666666666/4.0*xy^4.0+x0^23.0/78026.66666666666/58.0*xy^58.0+1.0/47986.666666666664/62.0*xy^62.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0/54848.88888888889*xy^43.0-1.0/10.75*xy^43.0-0.09302325581395349*xy^43.0-x0^2.0/176120.0*xy^37.0-1.0/9.25*xy^37.0-0.10810810810810811*xy^37.0-x0^3.0*0.041666666666666664*xy^4.0+x0^23.0/4525546.666666666*xy^58.0+1.0/2975173.333333333*xy^62.0";
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

public static void TestCaseDiff121259() {
 UsageCalculus.TestCase = 121259;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xyz1*x0^2*--3*x0^3-3*xyz^3*1*xyz/2*xyz^21*xyz/2*xyz^2*-3*xyz*-1*xyz^22*x0^23*xyz*-1*xyz^2-1*xyz^2/2*xyz*-3*xyz^22*xyz*-3*xyz^2*1*xyz/-3*xyz^23*xy012^21*xyz/-3*xyz^2-3*xyz^2*1*xyz/2*xyz^23*xyz/1*xyz^21*x0^2*--3*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=258 EqnNumber=62 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[2, 62, 11, 12, 3, 1, 2, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 3, 8, 3, 1, 2, 3, 8, 3, 4, 6, 3, 8, 9, 10, 19]"+
"// DOEMatrixRow=[98, 64, 14, 1, 3, 1, 2, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 14, 3, 2, 3, 4, 3, 1, 2, 3, 2, 3, 4, 1, 2, 5, 2]"+
//Tail EqnIndex=258 EqnNumber=62 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[2, 62, 11, 12, 3, 1, 2, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 3, 8, 3, 1, 2, 3, 8, 3, 4, 6, 3, 8, 9, 10, 19]"+
"// DOEMatrixRow=[98, 64, 14, 1, 3, 1, 2, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 14, 3, 2, 3, 4, 3, 1, 2, 3, 2, 3, 4, 1, 2, 5, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0*9.0-x0^3.0*3.0+x0^23.0*2.25*xyz^54.0-xy012^21.0/2.0*xyz^55.0-x0^2.0*4.5*xyz^48.0-x0^3.0*3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0*9.0*0.0-x0^3.0*3.0*0.0+x0^23.0*2.25*54.0*xyz^53.0-xy012^21.0/2.0*55.0*xyz^54.0-x0^2.0*4.5*48.0*xyz^47.0-x0^3.0*3.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*121.5*xyz^53.0-xy012^21.0*27.5*xyz^54.0-x0^2.0*216.0*xyz^47.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0*9.0-x0^3.0*3.0+x0^23.0*2.25*xyz^54.0-xy012^21.0/2.0*xyz^55.0-x0^2.0*4.5*xyz^48.0-x0^3.0*3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0*9.0*xyz-x0^3.0*xyz+x0^23.0*2.25/55.0*xyz^55.0-xy012^21.0/2.0/56.0*xyz^56.0-x0^2.0*4.5/49.0*xyz^49.0-x0^3.0*xyz";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0*9.0*xyz-x0^3.0*xyz+x0^23.0*0.04090909090909091*xyz^55.0-xy012^21.0*0.008928571428571428*xyz^56.0-x0^2.0*0.09183673469387756*xyz^49.0-x0^3.0*xyz";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*121.5*xyz^53.0-xy012^21.0*27.5*xyz^54.0-x0^2.0*216.0*xyz^47.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^23.0*121.5*53.0*xyz^52.0-xy012^21.0*27.5*54.0*xyz^53.0-x0^2.0*216.0*47.0*xyz^46.0-x0^3.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*6439.5*xyz^52.0-xy012^21.0*1485.0*xyz^53.0-x0^2.0*10152.0*xyz^46.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0*9.0*xyz-x0^3.0*xyz+x0^23.0*0.04090909090909091*xyz^55.0-xy012^21.0*0.008928571428571428*xyz^56.0-x0^2.0*0.09183673469387756*xyz^49.0-x0^3.0*xyz";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0*9.0/2.0*xyz^2.0-x0^3.0/2.0*xyz^2.0+x0^23.0*0.04090909090909091/56.0*xyz^56.0-xy012^21.0*0.008928571428571428/57.0*xyz^57.0-x0^2.0*0.09183673469387756/50.0*xyz^50.0-x0^3.0/2.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0*4.5*xyz^2.0-x0^3.0/2.0*xyz^2.0+x0^23.0*7.305194805194805E-4*xyz^56.0-xy012^21.0*1.5664160401002505E-4*xyz^57.0-x0^2.0*0.0018367346938775511*xyz^50.0-x0^3.0/2.0*xyz^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*6439.5*xyz^52.0-xy012^21.0*1485.0*xyz^53.0-x0^2.0*10152.0*xyz^46.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^23.0*6439.5*52.0*xyz^51.0-xy012^21.0*1485.0*53.0*xyz^52.0-x0^2.0*10152.0*46.0*xyz^45.0-x0^3.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*334854.0*xyz^51.0-xy012^21.0*78705.0*xyz^52.0-x0^2.0*466992.0*xyz^45.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0*4.5*xyz^2.0-x0^3.0/2.0*xyz^2.0+x0^23.0*7.305194805194805E-4*xyz^56.0-4.0*xyz^56.0-xy012^21.0*1.5664160401002505E-4*xyz^57.0-4.0*xyz^57.0-x0^2.0*0.0018367346938775511*xyz^50.0-x0^3.0/2.0*xyz^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0*4.5/3.0*xyz^3.0-x0^3.0/2.0/3.0*xyz^3.0+x0^23.0*7.305194805194805E-4/57.0*xyz^57.0-4.0/57.0*xyz^57.0-xy012^21.0*1.5664160401002505E-4/58.0*xyz^58.0-4.0/58.0*xyz^58.0-x0^2.0*0.0018367346938775511/51.0*xyz^51.0-x0^3.0*2.0/3.0*xyz^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0*1.5*xyz^3.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^23.0/78026.66666666666*xyz^57.0-1.0/14.25*xyz^57.0-0.07017543859649122*xyz^57.0-xy012^21.0/370272.0*xyz^58.0-1.0/14.5*xyz^58.0-0.06896551724137931*xyz^58.0-x0^2.0*3.6014405762304925E-5*xyz^51.0-x0^3.0/1.5*xyz^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*334854.0*xyz^51.0-xy012^21.0*78705.0*xyz^52.0-x0^2.0*466992.0*xyz^45.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^23.0*334854.0*51.0*xyz^50.0-xy012^21.0*78705.0*52.0*xyz^51.0-x0^2.0*466992.0*45.0*xyz^44.0-x0^3.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*1.7077554E7*xyz^50.0-xy012^21.0*4092660.0*xyz^51.0-x0^2.0*2.101464E7*xyz^44.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0*1.5*xyz^3.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^23.0/78026.66666666666*xyz^57.0-1.0/14.25*xyz^57.0-0.07017543859649122*xyz^57.0-xy012^21.0/370272.0*xyz^58.0-1.0/14.5*xyz^58.0-0.06896551724137931*xyz^58.0-x0^2.0*3.6014405762304925E-5*xyz^51.0-5.0*xyz^51.0-x0^3.0/1.5*xyz^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0*1.5/4.0*xyz^4.0-x0^3.0*0.16666666666666666/4.0*xyz^4.0+x0^23.0/78026.66666666666/58.0*xyz^58.0-1.0/14.25/58.0*xyz^58.0-0.07017543859649122/58.0*xyz^58.0-xy012^21.0/370272.0/59.0*xyz^59.0-1.0/14.5/59.0*xyz^59.0-0.06896551724137931/59.0*xyz^59.0-x0^2.0*3.6014405762304925E-5/52.0*xyz^52.0-5.0/52.0*xyz^52.0-x0^3.0*1.5/4.0*xyz^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0*0.375*xyz^4.0-x0^3.0*0.041666666666666664*xyz^4.0+x0^23.0/4525546.666666666*xyz^58.0-1.0/826.5*xyz^58.0-0.0012099213551119176*xyz^58.0-xy012^21.0/2.1846048E7*xyz^59.0-1.0/855.5*xyz^59.0-0.0011689070718877848*xyz^59.0-x0^2.0/1443866.6666666665*xyz^52.0-1.0/10.4*xyz^52.0-0.09615384615384616*xyz^52.0-x0^3.0/2.6666666666666665*xyz^4.0";
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

public static void TestCaseDiff121260() {
 UsageCalculus.TestCase = 121260;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x0^2*--3*x0^3-3*xyza^3*1*xyza/2*xyza^21*xyza/2*xyza^2*-3*xyza*-1*xyza^22*x0^23*xyza*-1*xyza^2-1*xyza^2/2*xyza*-3*xyza^22*xyza*-3*xyza^2*1*xyza/-3*xyza^23*xy012^21*xyza/-3*xyza^2-3*xyza^2*1*xyza/2*xyza^21*xyza/2*xyza^2*-3*xyza^3*-1*xyza2*xy012^21*x0^2*--3*x0^3-3*xyza^3*1*xyza";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=259 EqnNumber=63 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[67, 63, 12, 13, 4, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 3, 1, 1, 5, 3, 4, 9, 1, 2, 3, 4, 9, 1, 1, 7, 4, 9, 10, 11, 20]"+
"// DOEMatrixRow=[64, 65, 15, 2, 1, 2, 3, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 15, 4, 3, 1, 5, 1, 2, 3, 4, 3, 1, 1, 2, 1, 6, 3]"+
//Tail EqnIndex=259 EqnNumber=63 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[67, 63, 12, 13, 4, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 3, 1, 1, 5, 3, 4, 9, 1, 2, 3, 4, 9, 1, 1, 7, 4, 9, 10, 11, 20]"+
"// DOEMatrixRow=[64, 65, 15, 2, 1, 2, 3, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 15, 4, 3, 1, 5, 1, 2, 3, 4, 3, 1, 1, 2, 1, 6, 3]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0*3.0-x0^3.0*3.0+x0^23.0*2.25*xyza^54.0-xy012^21.0/2.0*xyza^55.0-xy012^21.0*6.75*xyza^30.0-x0^3.0*3.0-3.0*xyza^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0*3.0*0.0-x0^3.0*3.0*0.0+x0^23.0*2.25*54.0*xyza^53.0-xy012^21.0/2.0*55.0*xyza^54.0-xy012^21.0*6.75*30.0*xyza^29.0-x0^3.0*3.0*0.0-3.0*4.0*xyza^3.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*121.5*xyza^53.0-xy012^21.0*27.5*xyza^54.0-xy012^21.0*202.5*xyza^29.0-x0^3.0*0.0-12.0*xyza^3.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0*3.0-x0^3.0*3.0+x0^23.0*2.25*xyza^54.0-xy012^21.0/2.0*xyza^55.0-xy012^21.0*6.75*xyza^30.0-x0^3.0*3.0-3.0*xyza^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0*3.0*xyza-x0^3.0*xyza+x0^23.0*2.25/55.0*xyza^55.0-xy012^21.0/2.0/56.0*xyza^56.0-xy012^21.0*6.75/31.0*xyza^31.0-x0^3.0*xyza-3.0/5.0*xyza^5.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0*3.0*xyza-x0^3.0*xyza+x0^23.0*0.04090909090909091*xyza^55.0-xy012^21.0*0.008928571428571428*xyza^56.0-xy012^21.0*0.21774193548387097*xyza^31.0-x0^3.0*xyza-1.0/1.6666666666666667*xyza^5.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*121.5*xyza^53.0-xy012^21.0*27.5*xyza^54.0-xy012^21.0*202.5*xyza^29.0-x0^3.0*0.0-12.0*xyza^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^23.0*121.5*53.0*xyza^52.0-xy012^21.0*27.5*54.0*xyza^53.0-xy012^21.0*202.5*29.0*xyza^28.0-x0^3.0*0.0*0.0-12.0*3.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*6439.5*xyza^52.0-xy012^21.0*1485.0*xyza^53.0-xy012^21.0*5872.5*xyza^28.0-x0^3.0*0.0-36.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0*3.0*xyza-x0^3.0*xyza+x0^23.0*0.04090909090909091*xyza^55.0-xy012^21.0*0.008928571428571428*xyza^56.0-xy012^21.0*0.21774193548387097*xyza^31.0-x0^3.0*xyza-1.0/1.6666666666666667*xyza^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0*3.0/2.0*xyza^2.0-x0^3.0/2.0*xyza^2.0+x0^23.0*0.04090909090909091/56.0*xyza^56.0-xy012^21.0*0.008928571428571428/57.0*xyza^57.0-xy012^21.0*0.21774193548387097/32.0*xyza^32.0-x0^3.0/2.0*xyza^2.0-1.0/1.6666666666666667/6.0*xyza^6.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0*1.5*xyza^2.0-x0^3.0/2.0*xyza^2.0+x0^23.0*7.305194805194805E-4*xyza^56.0-xy012^21.0*1.5664160401002505E-4*xyza^57.0-xy012^21.0*0.006804435483870968*xyza^32.0-x0^3.0/2.0*xyza^2.0-1.0/10.0*xyza^6.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*6439.5*xyza^52.0-xy012^21.0*1485.0*xyza^53.0-xy012^21.0*5872.5*xyza^28.0-x0^3.0*0.0-36.0*xyza^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^23.0*6439.5*52.0*xyza^51.0-xy012^21.0*1485.0*53.0*xyza^52.0-xy012^21.0*5872.5*28.0*xyza^27.0-x0^3.0*0.0*0.0-36.0*2.0*xyza^1.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*334854.0*xyza^51.0-xy012^21.0*78705.0*xyza^52.0-xy012^21.0*164430.0*xyza^27.0-x0^3.0*0.0-72.0*xyza";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0*1.5*xyza^2.0-x0^3.0/2.0*xyza^2.0+x0^23.0*7.305194805194805E-4*xyza^56.0-4.0*xyza^56.0-xy012^21.0*1.5664160401002505E-4*xyza^57.0-4.0*xyza^57.0-xy012^21.0*0.006804435483870968*xyza^32.0-x0^3.0/2.0*xyza^2.0-1.0/10.0*xyza^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0*1.5/3.0*xyza^3.0-x0^3.0/2.0/3.0*xyza^3.0+x0^23.0*7.305194805194805E-4/57.0*xyza^57.0-4.0/57.0*xyza^57.0-xy012^21.0*1.5664160401002505E-4/58.0*xyza^58.0-4.0/58.0*xyza^58.0-xy012^21.0*0.006804435483870968/33.0*xyza^33.0-x0^3.0/2.0/3.0*xyza^3.0-1.0/10.0/7.0*xyza^7.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0*0.5*xyza^3.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^23.0/78026.66666666666*xyza^57.0-1.0/14.25*xyza^57.0-0.07017543859649122*xyza^57.0-xy012^21.0/370272.0*xyza^58.0-1.0/14.5*xyza^58.0-0.06896551724137931*xyza^58.0-xy012^21.0*2.061950146627566E-4*xyza^33.0-x0^3.0/6.0*xyza^3.0-1.0/70.0*xyza^7.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*334854.0*xyza^51.0-xy012^21.0*78705.0*xyza^52.0-xy012^21.0*164430.0*xyza^27.0-x0^3.0*0.0-72.0*xyza";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^23.0*334854.0*51.0*xyza^50.0-xy012^21.0*78705.0*52.0*xyza^51.0-xy012^21.0*164430.0*27.0*xyza^26.0-x0^3.0*0.0*0.0-72.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*1.7077554E7*xyza^50.0-xy012^21.0*4092660.0*xyza^51.0-xy012^21.0*4439610.0*xyza^26.0-x0^3.0*0.0-72.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0*0.5*xyza^3.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^23.0/78026.66666666666*xyza^57.0-1.0/14.25*xyza^57.0-0.07017543859649122*xyza^57.0-xy012^21.0/370272.0*xyza^58.0-1.0/14.5*xyza^58.0-0.06896551724137931*xyza^58.0-xy012^21.0*2.061950146627566E-4*xyza^33.0-4.0*xyza^33.0-x0^3.0/6.0*xyza^3.0-1.0/70.0*xyza^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0*0.5/4.0*xyza^4.0-x0^3.0*0.16666666666666666/4.0*xyza^4.0+x0^23.0/78026.66666666666/58.0*xyza^58.0-1.0/14.25/58.0*xyza^58.0-0.07017543859649122/58.0*xyza^58.0-xy012^21.0/370272.0/59.0*xyza^59.0-1.0/14.5/59.0*xyza^59.0-0.06896551724137931/59.0*xyza^59.0-xy012^21.0*2.061950146627566E-4/34.0*xyza^34.0-4.0/34.0*xyza^34.0-x0^3.0/6.0/4.0*xyza^4.0-1.0/70.0/8.0*xyza^8.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0*0.125*xyza^4.0-x0^3.0*0.041666666666666664*xyza^4.0+x0^23.0/4525546.666666666*xyza^58.0-1.0/826.5*xyza^58.0-0.0012099213551119176*xyza^58.0-xy012^21.0/2.1846048E7*xyza^59.0-1.0/855.5*xyza^59.0-0.0011689070718877848*xyza^59.0-xy012^21.0/164892.44444444444*xyza^34.0-1.0/8.5*xyza^34.0-0.11764705882352941*xyza^34.0-x0^3.0/24.0*xyza^4.0-1.0/560.0*xyza^8.0";
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

public static void TestCaseDiff121261() {
 UsageCalculus.TestCase = 121261;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*x^3*1*x/2*x^21*x/2*x^2*-3*x*-1*x^22*x0^23*x*-1*x^2-1*x^2/2*x*-3*x^22*x*-3*x^2*1*x/-3*x^23*xy012^21*x/-3*x^2-3*x^2*1*x/2*x^21*x/2*x^2*-3*x^3*-1*x2*xy012^23*x^3*-1*x-1*x/2*x^2*-3*x^3-3*x^3*1*x1*x/2*x^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=260 EqnNumber=64 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[31, 64, 13, 14, 1, 3, 1, 3, 1, 3, 4, 1, 1, 2, 3, 1, 2, 1, 1, 1, 1, 10, 2, 3, 1, 1, 10, 2, 3, 8, 1, 10, 11, 12, 21]"+
"// DOEMatrixRow=[28, 66, 16, 3, 2, 3, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 16, 5, 1, 2, 1, 2, 3, 4, 1, 1, 2, 3, 4, 2, 7, 4]"+
//Tail EqnIndex=260 EqnNumber=64 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[31, 64, 13, 14, 1, 3, 1, 3, 1, 3, 4, 1, 1, 2, 3, 1, 2, 1, 1, 1, 1, 10, 2, 3, 1, 1, 10, 2, 3, 8, 1, 10, 11, 12, 21]"+
"// DOEMatrixRow=[28, 66, 16, 3, 2, 3, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 16, 5, 1, 2, 1, 2, 3, 4, 1, 1, 2, 3, 4, 2, 7, 4]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "2.25*x^54.0-1.0/2.0*x^55.0+2.25*x^34.0+1.5*x^6.0-1.5*x^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "2.25*54.0*x^53.0-1.0/2.0*55.0*x^54.0+2.25*34.0*x^33.0+1.5*6.0*x^5.0-1.5*6.0*x^5.0";
 UsageCalculus.EqnSolArrayMap2[1] = "121.5*x^53.0-27.5*x^54.0+76.5*x^33.0+9.0*x^5.0-9.0*x^5.0";
 UsageCalculus.EqnSolArrayMap3[1] = "2.25*x^54.0-1.0/2.0*x^55.0+2.25*x^34.0+1.5*x^6.0-1.5*x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "2.25/55.0*x^55.0-1.0/2.0/56.0*x^56.0+2.25/35.0*x^35.0+1.5/7.0*x^7.0-1.5/7.0*x^7.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/24.444444444444443*x^55.0-1.0/112.0*x^56.0+1.0/15.555555555555555*x^35.0+1.0/4.666666666666667*x^7.0-1.0/4.666666666666667*x^7.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "121.5*x^53.0-27.5*x^54.0+76.5*x^33.0+9.0*x^5.0-9.0*x^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "121.5*53.0*x^52.0-27.5*54.0*x^53.0+76.5*33.0*x^32.0+9.0*5.0*x^4.0-9.0*5.0*x^4.0";
 UsageCalculus.EqnSolArrayMap2[2] = "6439.5*x^52.0-1485.0*x^53.0+2524.5*x^32.0+45.0*x^4.0-45.0*x^4.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/24.444444444444443*x^55.0-1.0/112.0*x^56.0+1.0/15.555555555555555*x^35.0+1.0/4.666666666666667*x^7.0-1.0/4.666666666666667*x^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/24.444444444444443/56.0*x^56.0-1.0/112.0/57.0*x^57.0+1.0/15.555555555555555/36.0*x^36.0+1.0/4.666666666666667/8.0*x^8.0-1.0/4.666666666666667/8.0*x^8.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/1368.8888888888887*x^56.0-1.0/6384.0*x^57.0+1.0/560.0*x^36.0+1.0/37.333333333333336*x^8.0-1.0/37.333333333333336*x^8.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "6439.5*x^52.0-1485.0*x^53.0+2524.5*x^32.0+45.0*x^4.0-45.0*x^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "6439.5*52.0*x^51.0-1485.0*53.0*x^52.0+2524.5*32.0*x^31.0+45.0*4.0*x^3.0-45.0*4.0*x^3.0";
 UsageCalculus.EqnSolArrayMap2[3] = "334854.0*x^51.0-78705.0*x^52.0+80784.0*x^31.0+180.0*x^3.0-180.0*x^3.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/1368.8888888888887*x^56.0-1.0/6384.0*x^57.0+1.0/560.0*x^36.0+1.0/37.333333333333336*x^8.0-1.0/37.333333333333336*x^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/1368.8888888888887/57.0*x^57.0-1.0/6384.0/58.0*x^58.0+1.0/560.0/37.0*x^37.0+1.0/37.333333333333336/9.0*x^9.0-1.0/37.333333333333336/9.0*x^9.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/78026.66666666666*x^57.0-1.0/370272.0*x^58.0+1.0/20720.0*x^37.0+1.0/336.0*x^9.0-1.0/336.0*x^9.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "334854.0*x^51.0-78705.0*x^52.0+80784.0*x^31.0+180.0*x^3.0-180.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "334854.0*51.0*x^50.0-78705.0*52.0*x^51.0+80784.0*31.0*x^30.0+180.0*3.0*x^2.0-180.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[4] = "1.7077554E7*x^50.0-4092660.0*x^51.0+2504304.0*x^30.0+540.0*x^2.0-540.0*x^2.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/78026.66666666666*x^57.0-1.0/370272.0*x^58.0+1.0/20720.0*x^37.0+1.0/336.0*x^9.0-1.0/336.0*x^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/78026.66666666666/58.0*x^58.0-1.0/370272.0/59.0*x^59.0+1.0/20720.0/38.0*x^38.0+1.0/336.0/10.0*x^10.0-1.0/336.0/10.0*x^10.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/4525546.666666666*x^58.0-1.0/2.1846048E7*x^59.0+1.0/787360.0*x^38.0+1.0/3360.0*x^10.0-1.0/3360.0*x^10.0";
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

public static void TestCaseDiff121262() {
 UsageCalculus.TestCase = 121262;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xy/2*xy^2*-3*xy*-1*xy^22*x0^23*xy*-1*xy^2-1*xy^2/2*xy*-3*xy^22*xy*-3*xy^2*1*xy/-3*xy^23*xy012^21*xy/-3*xy^2-3*xy^2*1*xy/2*xy^21*xy/2*xy^2*-3*xy^3*-1*xy2*xy012^23*xy^3*-1*xy-1*xy/2*xy^2*-3*xy^32*x0^2*-3*x0^3*1*x0/-3*x0^23*xy^31*xy/2*xy^22*x0^2*-3*x0";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=261 EqnNumber=65 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[96, 65, 14, 15, 2, 1, 2, 4, 2, 4, 1, 2, 3, 1, 4, 2, 3, 2, 3, 2, 3, 11, 3, 1, 2, 3, 11, 3, 4, 9, 2, 11, 12, 13, 22]"+
"// DOEMatrixRow=[93, 67, 17, 4, 3, 1, 2, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 17, 6, 2, 3, 2, 3, 1, 5, 2, 3, 1, 4, 5, 1, 8, 5]"+
//Tail EqnIndex=261 EqnNumber=65 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[96, 65, 14, 15, 2, 1, 2, 4, 2, 4, 1, 2, 3, 1, 4, 2, 3, 2, 3, 2, 3, 11, 3, 1, 2, 3, 11, 3, 4, 9, 2, 11, 12, 13, 22]"+
"// DOEMatrixRow=[93, 67, 17, 4, 3, 1, 2, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 17, 6, 2, 3, 2, 3, 1, 5, 2, 3, 1, 4, 5, 1, 8, 5]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^23.0*1.5*xy^29.0-1.0/2.0*xy^55.0+2.25*xy^34.0-x0^2.0*x0*x0*2.25*xy^89.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^23.0*1.5*29.0*xy^28.0-1.0/2.0*55.0*xy^54.0+2.25*34.0*xy^33.0-x0^2.0*x0*x0*89.0*xy^88.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^23.0*43.5*xy^28.0-27.5*xy^54.0+76.5*xy^33.0-x0^2.0*x0*x0*89.0*xy^88.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^23.0*1.5*xy^29.0-1.0/2.0*xy^55.0+2.25*xy^34.0-x0^2.0*x0*x0*2.25*xy^89.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^23.0*1.5/30.0*xy^30.0-1.0/2.0/56.0*xy^56.0+2.25/35.0*xy^35.0-x0^2.0*x0*x0*2.25/90.0*xy^90.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^23.0/20.0*xy^30.0-1.0/112.0*xy^56.0+0.06428571428571428*xy^35.0-x0^2.0*x0*x0/40.0*xy^90.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^23.0*43.5*xy^28.0-27.5*xy^54.0+76.5*xy^33.0-x0^2.0*x0*x0*89.0*xy^88.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^23.0*43.5*28.0*xy^27.0-27.5*54.0*xy^53.0+76.5*33.0*xy^32.0-x0^2.0*x0*x0*88.0*xy^87.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^23.0*1218.0*xy^27.0-1485.0*xy^53.0+2524.5*xy^32.0-x0^2.0*x0*x0*88.0*xy^87.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^23.0/20.0*xy^30.0-1.0/112.0*xy^56.0+0.06428571428571428*xy^35.0-x0^2.0*x0*x0/40.0*xy^90.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^23.0/20.0/31.0*xy^31.0-1.0/112.0/57.0*xy^57.0+0.06428571428571428/36.0*xy^36.0-x0^2.0*x0*x0/40.0/91.0*xy^91.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^23.0/620.0*xy^31.0-1.0/6384.0*xy^57.0+0.0017857142857142854*xy^36.0-x0^2.0*x0*x0/3640.0*xy^91.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^23.0*1218.0*xy^27.0-1485.0*xy^53.0+2524.5*xy^32.0-x0^2.0*x0*x0*88.0*xy^87.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^23.0*1218.0*27.0*xy^26.0-1485.0*53.0*xy^52.0+2524.5*32.0*xy^31.0-x0^2.0*x0*x0*87.0*xy^86.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^23.0*32886.0*xy^26.0-78705.0*xy^52.0+80784.0*xy^31.0-x0^2.0*x0*x0*87.0*xy^86.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^23.0/620.0*xy^31.0-1.0/6384.0*xy^57.0+0.0017857142857142854*xy^36.0-x0^2.0*x0*x0/3640.0*xy^91.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^23.0/620.0/32.0*xy^32.0-1.0/6384.0/58.0*xy^58.0+0.0017857142857142854/37.0*xy^37.0-x0^2.0*x0*x0/3640.0/92.0*xy^92.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^23.0/19840.0*xy^32.0-1.0/370272.0*xy^58.0+4.8262548262548256E-5*xy^37.0-x0^2.0*x0*x0/334880.0*xy^92.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^23.0*32886.0*xy^26.0-78705.0*xy^52.0+80784.0*xy^31.0-x0^2.0*x0*x0*87.0*xy^86.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^23.0*32886.0*26.0*xy^25.0-78705.0*52.0*xy^51.0+80784.0*31.0*xy^30.0-x0^2.0*x0*x0*86.0*xy^85.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^23.0*855036.0*xy^25.0-4092660.0*xy^51.0+2504304.0*xy^30.0-x0^2.0*x0*x0*86.0*xy^85.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^23.0/19840.0*xy^32.0-1.0/370272.0*xy^58.0+4.8262548262548256E-5*xy^37.0-5.0*xy^37.0-x0^2.0*x0*x0/334880.0*xy^92.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^23.0/19840.0/33.0*xy^33.0-1.0/370272.0/59.0*xy^59.0+4.8262548262548256E-5/38.0*xy^38.0-5.0/38.0*xy^38.0-x0^2.0*x0*x0/334880.0/93.0*xy^93.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^23.0/654720.0*xy^33.0-1.0/2.1846048E7*xy^59.0+1.0/787360.0000000001*xy^38.0-1.0/7.6*xy^38.0-0.13157894736842105*xy^38.0-x0^2.0*x0*x0/3.114384E7*xy^93.0";
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

public static void TestCaseDiff121263() {
 UsageCalculus.TestCase = 121263;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*x0^23*xyz*-1*xyz^2-1*xyz^2/2*xyz*-3*xyz^22*xyz*-3*xyz^2*1*xyz/-3*xyz^23*xy012^21*xyz/-3*xyz^2-3*xyz^2*1*xyz/2*xyz^21*xyz/2*xyz^2*-3*xyz^3*-1*xyz2*xy012^23*xyz^3*-1*xyz-1*xyz/2*xyz^2*-3*xyz^32*x0^2*-3*x0^3*1*x0/-3*x0^23*xyz^31*xyz/-3*xyz^2-3*x0^2*-1*x0^3*2*x02*x0^2*-3*x03*xyz*-1*xyz^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=262 EqnNumber=66 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[62, 66, 15, 16, 3, 2, 3, 5, 3, 1, 2, 1, 1, 2, 1, 3, 1, 1, 4, 3, 4, 12, 1, 2, 3, 4, 12, 1, 1, 10, 3, 12, 13, 14, 23]"+
"// DOEMatrixRow=[59, 68, 18, 1, 1, 2, 3, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 18, 7, 3, 1, 3, 1, 2, 6, 3, 1, 2, 1, 6, 2, 9, 6]"+
//Tail EqnIndex=262 EqnNumber=66 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[62, 66, 15, 16, 3, 2, 3, 5, 3, 1, 2, 1, 1, 2, 1, 3, 1, 1, 4, 3, 4, 12, 1, 2, 3, 4, 12, 1, 1, 10, 3, 12, 13, 14, 23]"+
"// DOEMatrixRow=[59, 68, 18, 1, 1, 2, 3, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 18, 7, 3, 1, 3, 1, 2, 6, 3, 1, 2, 1, 6, 2, 9, 6]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^23.0*2.0*xyz^3.0-xy012^21.0/2.0*xyz^55.0+xy012^23.0*2.25*xyz^34.0-x0^2.0*x0/2.0*xyz^69.0+x0^2.0*x02*x03*18.0*xyz^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^23.0*2.0*3.0*xyz^2.0-xy012^21.0/2.0*55.0*xyz^54.0+xy012^23.0*2.25*34.0*xyz^33.0-x0^2.0*x0/2.0*69.0*xyz^68.0+x0^2.0*x02*x03*3.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^23.0*6.0*xyz^2.0-xy012^21.0*27.5*xyz^54.0+xy012^23.0*76.5*xyz^33.0-x0^2.0*x0*34.5*xyz^68.0+x0^2.0*x02*x03*3.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^23.0*2.0*xyz^3.0-xy012^21.0/2.0*xyz^55.0+xy012^23.0*2.25*xyz^34.0-x0^2.0*x0/2.0*xyz^69.0+x0^2.0*x02*x03*18.0*xyz^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^23.0*2.0/4.0*xyz^4.0-xy012^21.0/2.0/56.0*xyz^56.0+xy012^23.0*2.25/35.0*xyz^35.0-x0^2.0*x0/2.0/70.0*xyz^70.0+x0^2.0*x02*x03*18.0/4.0*xyz^4.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^23.0*0.5*xyz^4.0-xy012^21.0*0.008928571428571428*xyz^56.0+xy012^23.0*0.06428571428571428*xyz^35.0-x0^2.0*x0*0.007142857142857143*xyz^70.0+x0^2.0*x02*x03*4.5*xyz^4.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^23.0*6.0*xyz^2.0-xy012^21.0*27.5*xyz^54.0+xy012^23.0*76.5*xyz^33.0-x0^2.0*x0*34.5*xyz^68.0+x0^2.0*x02*x03*3.0*xyz^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^23.0*6.0*2.0*xyz^1.0-xy012^21.0*27.5*54.0*xyz^53.0+xy012^23.0*76.5*33.0*xyz^32.0-x0^2.0*x0*34.5*68.0*xyz^67.0+x0^2.0*x02*x03*2.0*xyz^1.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^23.0*12.0*xyz-xy012^21.0*1485.0*xyz^53.0+xy012^23.0*2524.5*xyz^32.0-x0^2.0*x0*2346.0*xyz^67.0+x0^2.0*x02*x03*2.0*xyz";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^23.0*0.5*xyz^4.0-xy012^21.0*0.008928571428571428*xyz^56.0+xy012^23.0*0.06428571428571428*xyz^35.0-x0^2.0*x0*0.007142857142857143*xyz^70.0+x0^2.0*x02*x03*4.5*xyz^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^23.0*0.5/5.0*xyz^5.0-xy012^21.0*0.008928571428571428/57.0*xyz^57.0+xy012^23.0*0.06428571428571428/36.0*xyz^36.0-x0^2.0*x0*0.007142857142857143/71.0*xyz^71.0+x0^2.0*x02*x03*4.5/5.0*xyz^5.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^23.0*0.1*xyz^5.0-xy012^21.0*1.5664160401002505E-4*xyz^57.0+xy012^23.0*0.0017857142857142854*xyz^36.0-x0^2.0*x0*1.0060362173038229E-4*xyz^71.0+x0^2.0*x02*x03/1.1111111111111112*xyz^5.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^23.0*12.0*xyz-xy012^21.0*1485.0*xyz^53.0+xy012^23.0*2524.5*xyz^32.0-x0^2.0*x0*2346.0*xyz^67.0+x0^2.0*x02*x03*2.0*xyz";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^23.0*12.0-xy012^21.0*1485.0*53.0*xyz^52.0+xy012^23.0*2524.5*32.0*xyz^31.0-x0^2.0*x0*2346.0*67.0*xyz^66.0+x0^2.0*x02*x03*2.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^23.0*12.0-xy012^21.0*78705.0*xyz^52.0+xy012^23.0*80784.0*xyz^31.0-x0^2.0*x0*157182.0*xyz^66.0+x0^2.0*x02*x03*2.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^23.0*0.1*xyz^5.0-xy012^21.0*1.5664160401002505E-4*xyz^57.0-4.0*xyz^57.0+xy012^23.0*0.0017857142857142854*xyz^36.0-x0^2.0*x0*1.0060362173038229E-4*xyz^71.0-4.0*xyz^71.0+x0^2.0*x02*x03/1.1111111111111112*xyz^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^23.0*0.1/6.0*xyz^6.0-xy012^21.0*1.5664160401002505E-4/58.0*xyz^58.0-4.0/58.0*xyz^58.0+xy012^23.0*0.0017857142857142854/37.0*xyz^37.0-x0^2.0*x0*1.0060362173038229E-4/72.0*xyz^72.0-4.0/72.0*xyz^72.0+x0^2.0*x02*x03/1.1111111111111112/6.0*xyz^6.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^23.0*0.016666666666666666*xyz^6.0-xy012^21.0/370272.0*xyz^58.0-1.0/14.5*xyz^58.0-0.06896551724137931*xyz^58.0+xy012^23.0*4.8262548262548256E-5*xyz^37.0-x0^2.0*x0/715680.0*xyz^72.0-1.0/18.0*xyz^72.0-0.05555555555555555*xyz^72.0+x0^2.0*x02*x03/6.666666666666667*xyz^6.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^23.0*12.0-xy012^21.0*78705.0*xyz^52.0+xy012^23.0*80784.0*xyz^31.0-x0^2.0*x0*157182.0*xyz^66.0+x0^2.0*x02*x03*2.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^23.0*12.0*0.0-xy012^21.0*78705.0*52.0*xyz^51.0+xy012^23.0*80784.0*31.0*xyz^30.0-x0^2.0*x0*157182.0*66.0*xyz^65.0+x0^2.0*x02*x03*2.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^23.0*0.0-xy012^21.0*4092660.0*xyz^51.0+xy012^23.0*2504304.0*xyz^30.0-x0^2.0*x0*1.0374012E7*xyz^65.0+x0^2.0*x02*x03*0.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^23.0*0.016666666666666666*xyz^6.0-xy012^21.0/370272.0*xyz^58.0-1.0/14.5*xyz^58.0-0.06896551724137931*xyz^58.0+xy012^23.0*4.8262548262548256E-5*xyz^37.0-5.0*xyz^37.0-x0^2.0*x0/715680.0*xyz^72.0-1.0/18.0*xyz^72.0-0.05555555555555555*xyz^72.0+x0^2.0*x02*x03/6.666666666666667*xyz^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^23.0*0.016666666666666666/7.0*xyz^7.0-xy012^21.0/370272.0/59.0*xyz^59.0-1.0/14.5/59.0*xyz^59.0-0.06896551724137931/59.0*xyz^59.0+xy012^23.0*4.8262548262548256E-5/38.0*xyz^38.0-5.0/38.0*xyz^38.0-x0^2.0*x0/715680.0/73.0*xyz^73.0-1.0/18.0/73.0*xyz^73.0-0.05555555555555555/73.0*xyz^73.0+x0^2.0*x02*x03/6.666666666666667/7.0*xyz^7.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^23.0*0.0023809523809523807*xyz^7.0-xy012^21.0/2.1846048E7*xyz^59.0-1.0/855.5*xyz^59.0-0.0011689070718877848*xyz^59.0+xy012^23.0/787360.0000000001*xyz^38.0-1.0/7.6*xyz^38.0-0.13157894736842105*xyz^38.0-x0^2.0*x0/5.224464E7*xyz^73.0-1.0/1314.0*xyz^73.0-7.6103500761035E-4*xyz^73.0+x0^2.0*x02*x03/46.66666666666667*xyz^7.0";
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

public static void TestCaseDiff121264() {
 UsageCalculus.TestCase = 121264;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xyza*-1*xyza^2-1*xyza^2/2*xyza*-3*xyza^22*xyza*-3*xyza^2*1*xyza/-3*xyza^23*xy012^21*xyza/-3*xyza^2-3*xyza^2*1*xyza/2*xyza^21*xyza/2*xyza^2*-3*xyza^3*-1*xyza2*xy012^23*xyza^3*-1*xyza-1*xyza/2*xyza^2*-3*xyza^32*x0^2*-3*x0^3*1*x0/-3*x0^23*xyza^31*xyza/-3*xyza^2-3*x0^2*-1*x0^3*2*x01*xyza^3*2*xyza/3*xyza^2*--1*xyza^32*xyza3*xyza*-1*xyza^2-1*xyza^2/2*xyza";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=263 EqnNumber=67 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[26, 67, 16, 17, 4, 3, 1, 6, 1, 2, 3, 2, 3, 1, 2, 1, 2, 1, 5, 1, 1, 13, 2, 3, 1, 1, 13, 2, 3, 11, 4, 13, 14, 15, 24]"+
"// DOEMatrixRow=[23, 69, 19, 2, 3, 1, 1, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 19, 8, 1, 2, 4, 2, 3, 1, 4, 2, 3, 2, 7, 1, 10, 7]"+
//Tail EqnIndex=263 EqnNumber=67 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[26, 67, 16, 17, 4, 3, 1, 6, 1, 2, 3, 2, 3, 1, 2, 1, 2, 1, 5, 1, 1, 13, 2, 3, 1, 1, 13, 2, 3, 11, 4, 13, 14, 15, 24]"+
"// DOEMatrixRow=[23, 69, 19, 2, 3, 1, 1, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 19, 8, 1, 2, 4, 2, 3, 1, 4, 2, 3, 2, 7, 1, 10, 7]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-3.0*xyza^3.0-xy012^21.0/2.0*xyza^55.0+xy012^23.0*2.25*xyza^34.0-x0^2.0*x0/2.0*xyza^69.0+4.0*xyza^41.0+xyza^35.0-1.0/2.0*xyza^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-3.0*3.0*xyza^2.0-xy012^21.0/2.0*55.0*xyza^54.0+xy012^23.0*2.25*34.0*xyza^33.0-x0^2.0*x0/2.0*69.0*xyza^68.0+4.0*41.0*xyza^40.0+35.0*xyza^34.0-1.0/2.0*3.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-9.0*xyza^2.0-xy012^21.0*27.5*xyza^54.0+xy012^23.0*76.5*xyza^33.0-x0^2.0*x0*34.5*xyza^68.0+164.0*xyza^40.0+35.0*xyza^34.0-1.5*xyza^2.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-3.0*xyza^3.0-xy012^21.0/2.0*xyza^55.0+xy012^23.0*2.25*xyza^34.0-x0^2.0*x0/2.0*xyza^69.0+4.0*xyza^41.0+xyza^35.0-1.0/2.0*xyza^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-3.0/4.0*xyza^4.0-xy012^21.0/2.0/56.0*xyza^56.0+xy012^23.0*2.25/35.0*xyza^35.0-x0^2.0*x0/2.0/70.0*xyza^70.0+4.0/42.0*xyza^42.0+1.0/36.0*xyza^36.0-1.0/2.0/4.0*xyza^4.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-0.75*xyza^4.0-xy012^21.0*0.008928571428571428*xyza^56.0+xy012^23.0*0.06428571428571428*xyza^35.0-x0^2.0*x0/140.0*xyza^70.0+1.0/10.5*xyza^42.0+1.0/36.0*xyza^36.0-1.0/8.0*xyza^4.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-9.0*xyza^2.0-xy012^21.0*27.5*xyza^54.0+xy012^23.0*76.5*xyza^33.0-x0^2.0*x0*34.5*xyza^68.0+164.0*xyza^40.0+35.0*xyza^34.0-1.5*xyza^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-9.0*2.0*xyza^1.0-xy012^21.0*27.5*54.0*xyza^53.0+xy012^23.0*76.5*33.0*xyza^32.0-x0^2.0*x0*34.5*68.0*xyza^67.0+164.0*40.0*xyza^39.0+35.0*34.0*xyza^33.0-1.5*2.0*xyza^1.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-18.0*xyza-xy012^21.0*1485.0*xyza^53.0+xy012^23.0*2524.5*xyza^32.0-x0^2.0*x0*2346.0*xyza^67.0+6560.0*xyza^39.0+1190.0*xyza^33.0-3.0*xyza";
 UsageCalculus.EqnSolArrayMap3[2] = "-0.75*xyza^4.0-xy012^21.0*0.008928571428571428*xyza^56.0+xy012^23.0*0.06428571428571428*xyza^35.0-x0^2.0*x0/140.0*xyza^70.0+1.0/10.5*xyza^42.0+1.0/36.0*xyza^36.0-1.0/8.0*xyza^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-0.75/5.0*xyza^5.0-xy012^21.0*0.008928571428571428/57.0*xyza^57.0+xy012^23.0*0.06428571428571428/36.0*xyza^36.0-x0^2.0*x0/140.0/71.0*xyza^71.0+1.0/10.5/43.0*xyza^43.0+1.0/36.0/37.0*xyza^37.0-1.0/8.0/5.0*xyza^5.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-0.15*xyza^5.0-xy012^21.0*1.5664160401002505E-4*xyza^57.0+xy012^23.0*0.0017857142857142854*xyza^36.0-x0^2.0*x0/9940.0*xyza^71.0+1.0/451.5*xyza^43.0+1.0/1332.0*xyza^37.0-1.0/40.0*xyza^5.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-18.0*xyza-xy012^21.0*1485.0*xyza^53.0+xy012^23.0*2524.5*xyza^32.0-x0^2.0*x0*2346.0*xyza^67.0+6560.0*xyza^39.0+1190.0*xyza^33.0-3.0*xyza";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-18.0-xy012^21.0*1485.0*53.0*xyza^52.0+xy012^23.0*2524.5*32.0*xyza^31.0-x0^2.0*x0*2346.0*67.0*xyza^66.0+6560.0*39.0*xyza^38.0+1190.0*33.0*xyza^32.0-3.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-18.0-xy012^21.0*78705.0*xyza^52.0+xy012^23.0*80784.0*xyza^31.0-x0^2.0*x0*157182.0*xyza^66.0+255840.0*xyza^38.0+39270.0*xyza^32.0-3.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-0.15*xyza^5.0-xy012^21.0*1.5664160401002505E-4*xyza^57.0-4.0*xyza^57.0+xy012^23.0*0.0017857142857142854*xyza^36.0-x0^2.0*x0/9940.0*xyza^71.0+1.0/451.5*xyza^43.0+1.0/1332.0*xyza^37.0-1.0/40.0*xyza^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-0.15/6.0*xyza^6.0-xy012^21.0*1.5664160401002505E-4/58.0*xyza^58.0-4.0/58.0*xyza^58.0+xy012^23.0*0.0017857142857142854/37.0*xyza^37.0-x0^2.0*x0/9940.0/72.0*xyza^72.0+1.0/451.5/44.0*xyza^44.0+1.0/1332.0/38.0*xyza^38.0-1.0/40.0/6.0*xyza^6.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-0.024999999999999998*xyza^6.0-xy012^21.0/370272.0*xyza^58.0-1.0/14.5*xyza^58.0-0.06896551724137931*xyza^58.0+xy012^23.0*4.8262548262548256E-5*xyza^37.0-x0^2.0*x0/715680.0*xyza^72.0+1.0/19866.0*xyza^44.0+1.0/50616.0*xyza^38.0-1.0/240.0*xyza^6.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-18.0-xy012^21.0*78705.0*xyza^52.0+xy012^23.0*80784.0*xyza^31.0-x0^2.0*x0*157182.0*xyza^66.0+255840.0*xyza^38.0+39270.0*xyza^32.0-3.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0-xy012^21.0*78705.0*52.0*xyza^51.0+xy012^23.0*80784.0*31.0*xyza^30.0-x0^2.0*x0*157182.0*66.0*xyza^65.0+255840.0*38.0*xyza^37.0+39270.0*32.0*xyza^31.0-3.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-xy012^21.0*4092660.0*xyza^51.0+xy012^23.0*2504304.0*xyza^30.0-x0^2.0*x0*1.0374012E7*xyza^65.0+9721920.0*xyza^37.0+1256640.0*xyza^31.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-0.024999999999999998*xyza^6.0-xy012^21.0/370272.0*xyza^58.0-1.0/14.5*xyza^58.0-0.06896551724137931*xyza^58.0+xy012^23.0*4.8262548262548256E-5*xyza^37.0-5.0*xyza^37.0-x0^2.0*x0/715680.0*xyza^72.0+1.0/19866.0*xyza^44.0+1.0/50616.0*xyza^38.0-1.0/240.0*xyza^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-0.024999999999999998/7.0*xyza^7.0-xy012^21.0/370272.0/59.0*xyza^59.0-1.0/14.5/59.0*xyza^59.0-0.06896551724137931/59.0*xyza^59.0+xy012^23.0*4.8262548262548256E-5/38.0*xyza^38.0-5.0/38.0*xyza^38.0-x0^2.0*x0/715680.0/73.0*xyza^73.0+1.0/19866.0/45.0*xyza^45.0+1.0/50616.0/39.0*xyza^39.0-1.0/240.0/7.0*xyza^7.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-0.0035714285714285713*xyza^7.0-xy012^21.0/2.1846048E7*xyza^59.0-1.0/855.5*xyza^59.0-0.0011689070718877848*xyza^59.0+xy012^23.0/787360.0000000001*xyza^38.0-1.0/7.6*xyza^38.0-0.13157894736842105*xyza^38.0-x0^2.0*x0/5.224464E7*xyza^73.0+1.0/893970.0*xyza^45.0+1.0/1974024.0*xyza^39.0-1.0/1680.0*xyza^7.0";
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

public static void TestCaseDiff121265() {
 UsageCalculus.TestCase = 121265;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-1*x^2/2*x*-3*x^22*x*-3*x^2*1*x/-3*x^23*xy012^21*x/-3*x^2-3*x^2*1*x/2*x^21*x/2*x^2*-3*x^3*-1*x2*xy012^23*x^3*-1*x-1*x/2*x^2*-3*x^32*x0^2*-3*x0^3*1*x0/-3*x0^23*x^31*x/-3*x^2-3*x0^2*-1*x0^3*2*x01*x^3*2*x/3*x^2*--1*x^32*x3*x0^2*--1*x0^3-1*x^3*2*x/3*x^2-1*x^2/2*x2*x*-3*x^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=264 EqnNumber=68 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[91, 68, 17, 18, 1, 1, 2, 7, 2, 3, 4, 1, 1, 2, 3, 2, 3, 2, 1, 2, 3, 14, 3, 1, 2, 3, 14, 3, 4, 12, 1, 14, 15, 16, 25]"+
"// DOEMatrixRow=[88, 70, 20, 3, 1, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 3, 1, 20, 9, 2, 3, 5, 3, 1, 2, 1, 3, 1, 3, 8, 2, 11, 8]"+
//Tail EqnIndex=264 EqnNumber=68 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[91, 68, 17, 18, 1, 1, 2, 7, 2, 3, 4, 1, 1, 2, 3, 2, 3, 2, 1, 2, 3, 14, 3, 1, 2, 3, 14, 3, 4, 12, 1, 14, 15, 16, 25]"+
"// DOEMatrixRow=[88, 70, 20, 3, 1, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 3, 1, 20, 9, 2, 3, 5, 3, 1, 2, 1, 3, 1, 3, 8, 2, 11, 8]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-1.0/2.0*x^55.0+2.25*x^34.0-1.0/2.0*x^69.0+4.0*x^38.0-x^32.0-1.0-1.0/1.5*x^6.0+1.5*x^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-1.0/2.0*55.0*x^54.0+2.25*34.0*x^33.0-1.0/2.0*69.0*x^68.0+4.0*38.0*x^37.0-32.0*x^31.0-1.0*0.0-1.0/1.5*6.0*x^5.0+1.5*5.0*x^4.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-27.5*x^54.0+76.5*x^33.0-34.5*x^68.0+152.0*x^37.0-32.0*x^31.0-4.0*x^5.0+7.5*x^4.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-1.0/2.0*x^55.0+2.25*x^34.0-1.0/2.0*x^69.0+4.0*x^38.0-x^32.0-1.0-1.0/1.5*x^6.0+1.5*x^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.0/2.0/56.0*x^56.0+2.25/35.0*x^35.0-1.0/2.0/70.0*x^70.0+4.0/39.0*x^39.0-1.0/33.0*x^33.0-1.0*x-1.0/1.5/7.0*x^7.0+1.5/6.0*x^6.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/112.0*x^56.0+1.0/15.555555555555555*x^35.0-1.0/140.0*x^70.0+1.0/9.75*x^39.0-1.0/33.0*x^33.0-x-1.0/10.5*x^7.0+1.0/4.0*x^6.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-27.5*x^54.0+76.5*x^33.0-34.5*x^68.0+152.0*x^37.0-32.0*x^31.0-4.0*x^5.0+7.5*x^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-27.5*54.0*x^53.0+76.5*33.0*x^32.0-34.5*68.0*x^67.0+152.0*37.0*x^36.0-32.0*31.0*x^30.0-4.0*5.0*x^4.0+7.5*4.0*x^3.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-1485.0*x^53.0+2524.5*x^32.0-2346.0*x^67.0+5624.0*x^36.0-992.0*x^30.0-20.0*x^4.0+30.0*x^3.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/112.0*x^56.0+1.0/15.555555555555555*x^35.0-1.0/140.0*x^70.0+1.0/9.75*x^39.0-0.030303030303030304*x^33.0-x-1.0/10.5*x^7.0+1.0/4.0*x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/112.0/57.0*x^57.0+1.0/15.555555555555555/36.0*x^36.0-1.0/140.0/71.0*x^71.0+1.0/9.75/40.0*x^40.0-0.030303030303030304/34.0*x^34.0-1.0/2.0*x^2.0-1.0/10.5/8.0*x^8.0+1.0/4.0/7.0*x^7.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/6384.0*x^57.0+1.0/560.0*x^36.0-1.0/9940.0*x^71.0+1.0/390.0*x^40.0-1.0/1122.0*x^34.0-1.0/2.0*x^2.0-1.0/84.0*x^8.0+1.0/28.0*x^7.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-1485.0*x^53.0+2524.5*x^32.0-2346.0*x^67.0+5624.0*x^36.0-992.0*x^30.0-20.0*x^4.0+30.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-1485.0*53.0*x^52.0+2524.5*32.0*x^31.0-2346.0*67.0*x^66.0+5624.0*36.0*x^35.0-992.0*30.0*x^29.0-20.0*4.0*x^3.0+30.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-78705.0*x^52.0+80784.0*x^31.0-157182.0*x^66.0+202464.0*x^35.0-29760.0*x^29.0-80.0*x^3.0+90.0*x^2.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/6384.0*x^57.0+1.0/560.0*x^36.0-1.0/9940.0*x^71.0+1.0/390.0*x^40.0-1.0/1122.0*x^34.0-1.0/2.0*x^2.0-1.0/84.0*x^8.0+1.0/28.0*x^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/6384.0/58.0*x^58.0+1.0/560.0/37.0*x^37.0-1.0/9940.0/72.0*x^72.0+1.0/390.0/41.0*x^41.0-1.0/1122.0/35.0*x^35.0-1.0/2.0/3.0*x^3.0-1.0/84.0/9.0*x^9.0+1.0/28.0/8.0*x^8.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/370272.0*x^58.0+1.0/20720.0*x^37.0-1.0/715680.0*x^72.0+1.0/15990.0*x^41.0-1.0/39270.0*x^35.0-1.0/6.0*x^3.0-1.0/756.0*x^9.0+1.0/224.0*x^8.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-78705.0*x^52.0+80784.0*x^31.0-157182.0*x^66.0+202464.0*x^35.0-29760.0*x^29.0-80.0*x^3.0+90.0*x^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-78705.0*52.0*x^51.0+80784.0*31.0*x^30.0-157182.0*66.0*x^65.0+202464.0*35.0*x^34.0-29760.0*29.0*x^28.0-80.0*3.0*x^2.0+90.0*2.0*x^1.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-4092660.0*x^51.0+2504304.0*x^30.0-1.0374012E7*x^65.0+7086240.0*x^34.0-863040.0*x^28.0-240.0*x^2.0+180.0*x";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/370272.0*x^58.0+1.0/20720.0*x^37.0-1.0/715680.0*x^72.0+1.0/15990.0*x^41.0-1.0/39270.0*x^35.0-1.0/6.0*x^3.0-1.0/756.0*x^9.0+1.0/224.0*x^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/370272.0/59.0*x^59.0+1.0/20720.0/38.0*x^38.0-1.0/715680.0/73.0*x^73.0+1.0/15990.0/42.0*x^42.0-1.0/39270.0/36.0*x^36.0-1.0/6.0/4.0*x^4.0-1.0/756.0/10.0*x^10.0+1.0/224.0/9.0*x^9.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/2.1846048E7*x^59.0+1.0/787360.0*x^38.0-1.0/5.224464E7*x^73.0+1.0/671580.0*x^42.0-1.0/1413720.0*x^36.0-1.0/24.0*x^4.0-1.0/7560.0*x^10.0+1.0/2016.0*x^9.0";
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

public static void TestCaseDiff121266() {
 UsageCalculus.TestCase = 121266;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xy*-3*xy^2*1*xy/-3*xy^23*xy012^21*xy/-3*xy^2-3*xy^2*1*xy/2*xy^21*xy/2*xy^2*-3*xy^3*-1*xy2*xy012^23*xy^3*-1*xy-1*xy/2*xy^2*-3*xy^32*x0^2*-3*x0^3*1*x0/-3*x0^23*xy^31*xy/-3*xy^2-3*x0^2*-1*x0^3*2*x01*xy^3*2*xy/3*xy^2*--1*xy^32*xy3*x0^2*--1*x0^3-1*xy^3*2*xy/3*xy^22*xy/3*xy^2*-1*xy^3*-3*xy3*x0^22*xy*-3*xy^23*xy012^2*1*xy012";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=265 EqnNumber=69 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[57, 69, 18, 19, 2, 3, 1, 8, 3, 4, 1, 2, 3, 1, 4, 3, 1, 1, 2, 3, 4, 15, 1, 2, 3, 4, 15, 1, 1, 13, 2, 15, 16, 17, 26]"+
"// DOEMatrixRow=[54, 71, 1, 4, 2, 3, 1, 3, 1, 3, 4, 1, 1, 2, 3, 1, 2, 21, 10, 3, 1, 1, 1, 2, 3, 2, 1, 2, 4, 9, 1, 12, 9]"+
//Tail EqnIndex=265 EqnNumber=69 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[57, 69, 18, 19, 2, 3, 1, 8, 3, 4, 1, 2, 3, 1, 4, 3, 1, 1, 2, 3, 4, 15, 1, 2, 3, 4, 15, 1, 1, 13, 2, 15, 16, 17, 26]"+
"// DOEMatrixRow=[54, 71, 1, 4, 2, 3, 1, 3, 1, 3, 4, 1, 1, 2, 3, 1, 2, 21, 10, 3, 1, 1, 1, 2, 3, 2, 1, 2, 4, 9, 1, 12, 9]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-1.0/1.5*xy^30.0+2.25*xy^34.0-x0^2.0*x0/2.0*xy^69.0+x0^2.0*4.0*xy^38.0-x0^2.0*xy^32.0-x0^3.0+2.0*xy^56.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-1.0/1.5*30.0*xy^29.0+2.25*34.0*xy^33.0-x0^2.0*x0/2.0*69.0*xy^68.0+x0^2.0*4.0*38.0*xy^37.0-x0^2.0*32.0*xy^31.0-x0^3.0*0.0+2.0*56.0*xy^55.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-20.0*xy^29.0+76.5*xy^33.0-x0^2.0*x0*34.5*xy^68.0+x0^2.0*152.0*xy^37.0-x0^2.0*32.0*xy^31.0-x0^3.0*0.0+112.0*xy^55.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-1.0/1.5*xy^30.0+2.25*xy^34.0-x0^2.0*x0/2.0*xy^69.0+x0^2.0*4.0*xy^38.0-x0^2.0*xy^32.0-x0^3.0+2.0*xy^56.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.0/1.5/31.0*xy^31.0+2.25/35.0*xy^35.0-x0^2.0*x0/2.0/70.0*xy^70.0+x0^2.0*4.0/39.0*xy^39.0-x0^2.0/33.0*xy^33.0-x0^3.0*xy+2.0/57.0*xy^57.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/46.5*xy^31.0+0.06428571428571428*xy^35.0-x0^2.0*x0*0.007142857142857143*xy^70.0+x0^2.0*0.10256410256410256*xy^39.0-x0^2.0/33.0*xy^33.0-x0^3.0*xy+1.0/28.5*xy^57.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-20.0*xy^29.0+76.5*xy^33.0-x0^2.0*x0*34.5*xy^68.0+x0^2.0*152.0*xy^37.0-x0^2.0*32.0*xy^31.0-x0^3.0*0.0+112.0*xy^55.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-20.0*29.0*xy^28.0+76.5*33.0*xy^32.0-x0^2.0*x0*34.5*68.0*xy^67.0+x0^2.0*152.0*37.0*xy^36.0-x0^2.0*32.0*31.0*xy^30.0-x0^3.0*0.0*0.0+112.0*55.0*xy^54.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-580.0*xy^28.0+2524.5*xy^32.0-x0^2.0*x0*2346.0*xy^67.0+x0^2.0*5624.0*xy^36.0-x0^2.0*992.0*xy^30.0-x0^3.0*0.0+6160.0*xy^54.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/46.5*xy^31.0+0.06428571428571428*xy^35.0-x0^2.0*x0*0.007142857142857143*xy^70.0+x0^2.0*0.10256410256410256*xy^39.0-x0^2.0/33.0*xy^33.0-x0^3.0*xy+1.0/28.5*xy^57.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/46.5/32.0*xy^32.0+0.06428571428571428/36.0*xy^36.0-x0^2.0*x0*0.007142857142857143/71.0*xy^71.0+x0^2.0*0.10256410256410256/40.0*xy^40.0-x0^2.0/33.0/34.0*xy^34.0-x0^3.0/2.0*xy^2.0+1.0/28.5/58.0*xy^58.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/1488.0*xy^32.0+0.0017857142857142854*xy^36.0-x0^2.0*x0*1.0060362173038229E-4*xy^71.0+x0^2.0*0.002564102564102564*xy^40.0-x0^2.0*8.9126559714795E-4*xy^34.0-x0^3.0/2.0*xy^2.0+1.0/1653.0*xy^58.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-580.0*xy^28.0+2524.5*xy^32.0-x0^2.0*x0*2346.0*xy^67.0+x0^2.0*5624.0*xy^36.0-x0^2.0*992.0*xy^30.0-x0^3.0*0.0+6160.0*xy^54.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-580.0*28.0*xy^27.0+2524.5*32.0*xy^31.0-x0^2.0*x0*2346.0*67.0*xy^66.0+x0^2.0*5624.0*36.0*xy^35.0-x0^2.0*992.0*30.0*xy^29.0-x0^3.0*0.0*0.0+6160.0*54.0*xy^53.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-16240.0*xy^27.0+80784.0*xy^31.0-x0^2.0*x0*157182.0*xy^66.0+x0^2.0*202464.0*xy^35.0-x0^2.0*29760.0*xy^29.0-x0^3.0*0.0+332640.0*xy^53.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/1488.0*xy^32.0+0.0017857142857142854*xy^36.0-x0^2.0*x0*1.0060362173038229E-4*xy^71.0-4.0*xy^71.0+x0^2.0*0.002564102564102564*xy^40.0-x0^2.0*8.9126559714795E-4*xy^34.0-4.0*xy^34.0-x0^3.0/2.0*xy^2.0+1.0/1653.0*xy^58.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/1488.0/33.0*xy^33.0+0.0017857142857142854/37.0*xy^37.0-x0^2.0*x0*1.0060362173038229E-4/72.0*xy^72.0-4.0/72.0*xy^72.0+x0^2.0*0.002564102564102564/41.0*xy^41.0-x0^2.0*8.9126559714795E-4/35.0*xy^35.0-4.0/35.0*xy^35.0-x0^3.0/2.0/3.0*xy^3.0+1.0/1653.0/59.0*xy^59.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/49104.0*xy^33.0+4.8262548262548256E-5*xy^37.0-x0^2.0*x0/715680.0*xy^72.0-1.0/18.0*xy^72.0-0.05555555555555555*xy^72.0+x0^2.0*6.253908692933083E-5*xy^41.0-x0^2.0/39270.0*xy^35.0-1.0/8.75*xy^35.0-0.11428571428571428*xy^35.0-x0^3.0/6.0*xy^3.0+1.0/97527.0*xy^59.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-16240.0*xy^27.0+80784.0*xy^31.0-x0^2.0*x0*157182.0*xy^66.0+x0^2.0*202464.0*xy^35.0-x0^2.0*29760.0*xy^29.0-x0^3.0*0.0+332640.0*xy^53.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-16240.0*27.0*xy^26.0+80784.0*31.0*xy^30.0-x0^2.0*x0*157182.0*66.0*xy^65.0+x0^2.0*202464.0*35.0*xy^34.0-x0^2.0*29760.0*29.0*xy^28.0-x0^3.0*0.0*0.0+332640.0*53.0*xy^52.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-438480.0*xy^26.0+2504304.0*xy^30.0-x0^2.0*x0*1.0374012E7*xy^65.0+x0^2.0*7086240.0*xy^34.0-x0^2.0*863040.0*xy^28.0-x0^3.0*0.0+1.762992E7*xy^52.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/49104.0*xy^33.0+4.8262548262548256E-5*xy^37.0-5.0*xy^37.0-x0^2.0*x0/715680.0*xy^72.0-1.0/18.0*xy^72.0-0.05555555555555555*xy^72.0+x0^2.0*6.253908692933083E-5*xy^41.0-5.0*xy^41.0-x0^2.0/39270.0*xy^35.0-1.0/8.75*xy^35.0-0.11428571428571428*xy^35.0-x0^3.0/6.0*xy^3.0+1.0/97527.0*xy^59.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/49104.0/34.0*xy^34.0+4.8262548262548256E-5/38.0*xy^38.0-5.0/38.0*xy^38.0-x0^2.0*x0/715680.0/73.0*xy^73.0-1.0/18.0/73.0*xy^73.0-0.05555555555555555/73.0*xy^73.0+x0^2.0*6.253908692933083E-5/42.0*xy^42.0-5.0/42.0*xy^42.0-x0^2.0/39270.0/36.0*xy^36.0-1.0/8.75/36.0*xy^36.0-0.11428571428571428/36.0*xy^36.0-x0^3.0/6.0/4.0*xy^4.0+1.0/97527.0/60.0*xy^60.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/1669536.0*xy^34.0+1.0/787360.0000000001*xy^38.0-1.0/7.6*xy^38.0-0.13157894736842105*xy^38.0-x0^2.0*x0/5.224464E7*xy^73.0-1.0/1314.0*xy^73.0-7.6103500761035E-4*xy^73.0+x0^2.0/671580.0*xy^42.0-1.0/8.4*xy^42.0-0.11904761904761904*xy^42.0-x0^2.0/1413720.0*xy^36.0-1.0/315.0*xy^36.0-0.0031746031746031746*xy^36.0-x0^3.0/24.0*xy^4.0+1.0/5851620.0*xy^60.0";
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

public static void TestCaseDiff121267() {
 UsageCalculus.TestCase = 121267;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xy012^21*xyz/-3*xyz^2-3*xyz^2*1*xyz/2*xyz^21*xyz/2*xyz^2*-3*xyz^3*-1*xyz2*xy012^23*xyz^3*-1*xyz-1*xyz/2*xyz^2*-3*xyz^32*x0^2*-3*x0^3*1*x0/-3*x0^23*xyz^31*xyz/-3*xyz^2-3*x0^2*-1*x0^3*2*x01*xyz^3*2*xyz/3*xyz^2*--1*xyz^32*xyz3*x0^2*--1*x0^3-1*xyz^3*2*xyz/3*xyz^22*xyz/3*xyz^2*-1*xyz^3*-3*xyz3*x0^21*xyz^3*-3*xyz-3*xyz/1*xyz^2*-2*xyz^33*xy012^2*1*xy0121*xyz/-3*xyz^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=266 EqnNumber=70 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[21, 70, 19, 20, 3, 1, 2, 9, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 3, 1, 1, 16, 2, 3, 1, 1, 16, 2, 3, 14, 3, 16, 1, 18, 27]"+
"// DOEMatrixRow=[18, 72, 2, 1, 3, 1, 2, 4, 2, 4, 1, 2, 3, 1, 4, 2, 3, 22, 1, 1, 2, 3, 2, 3, 4, 3, 2, 3, 1, 10, 2, 13, 10]"+
//Tail EqnIndex=266 EqnNumber=70 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[21, 70, 19, 20, 3, 1, 2, 9, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 3, 1, 1, 16, 2, 3, 1, 1, 16, 2, 3, 14, 3, 16, 1, 18, 27]"+
"// DOEMatrixRow=[18, 72, 2, 1, 3, 1, 2, 4, 2, 4, 1, 2, 3, 1, 4, 2, 3, 22, 1, 1, 2, 3, 2, 3, 4, 3, 2, 3, 1, 10, 2, 13, 10]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-xy012^21.0*xyz^3.0+xy012^23.0*2.25*xyz^34.0-x0^2.0*x0/2.0*xyz^69.0+x0^2.0*4.0*xyz^38.0-x0^2.0*xyz^32.0-x0^3.0+x0^21.0*2.0*xyz^36.0-xy012^2.0*xy0121*2.0*xyz^39.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-xy012^21.0*3.0*xyz^2.0+xy012^23.0*2.25*34.0*xyz^33.0-x0^2.0*x0/2.0*69.0*xyz^68.0+x0^2.0*4.0*38.0*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0+x0^21.0*2.0*36.0*xyz^35.0-xy012^2.0*xy0121*39.0*xyz^38.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-xy012^21.0*3.0*xyz^2.0+xy012^23.0*76.5*xyz^33.0-x0^2.0*x0*34.5*xyz^68.0+x0^2.0*152.0*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0+x0^21.0*72.0*xyz^35.0-xy012^2.0*xy0121*39.0*xyz^38.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-xy012^21.0*xyz^3.0+xy012^23.0*2.25*xyz^34.0-x0^2.0*x0/2.0*xyz^69.0+x0^2.0*4.0*xyz^38.0-x0^2.0*xyz^32.0-x0^3.0+x0^21.0*2.0*xyz^36.0-xy012^2.0*xy0121*2.0*xyz^39.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-xy012^21.0/4.0*xyz^4.0+xy012^23.0*2.25/35.0*xyz^35.0-x0^2.0*x0/2.0/70.0*xyz^70.0+x0^2.0*4.0/39.0*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz+x0^21.0*2.0/37.0*xyz^37.0-xy012^2.0*xy0121*2.0/40.0*xyz^40.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-xy012^21.0/4.0*xyz^4.0+xy012^23.0*0.06428571428571428*xyz^35.0-x0^2.0*x0*0.007142857142857143*xyz^70.0+x0^2.0*0.10256410256410256*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz+x0^21.0*0.05405405405405406*xyz^37.0-xy012^2.0*xy0121/20.0*xyz^40.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-xy012^21.0*3.0*xyz^2.0+xy012^23.0*76.5*xyz^33.0-x0^2.0*x0*34.5*xyz^68.0+x0^2.0*152.0*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0+x0^21.0*72.0*xyz^35.0-xy012^2.0*xy0121*39.0*xyz^38.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-xy012^21.0*3.0*2.0*xyz^1.0+xy012^23.0*76.5*33.0*xyz^32.0-x0^2.0*x0*34.5*68.0*xyz^67.0+x0^2.0*152.0*37.0*xyz^36.0-x0^2.0*32.0*31.0*xyz^30.0-x0^3.0*0.0*0.0+x0^21.0*72.0*35.0*xyz^34.0-xy012^2.0*xy0121*38.0*xyz^37.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-xy012^21.0*6.0*xyz+xy012^23.0*2524.5*xyz^32.0-x0^2.0*x0*2346.0*xyz^67.0+x0^2.0*5624.0*xyz^36.0-x0^2.0*992.0*xyz^30.0-x0^3.0*0.0+x0^21.0*2520.0*xyz^34.0-xy012^2.0*xy0121*38.0*xyz^37.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-xy012^21.0/4.0*xyz^4.0+xy012^23.0*0.06428571428571428*xyz^35.0-x0^2.0*x0*0.007142857142857143*xyz^70.0+x0^2.0*0.10256410256410256*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz+x0^21.0*0.05405405405405406*xyz^37.0-xy012^2.0*xy0121/20.0*xyz^40.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-xy012^21.0/4.0/5.0*xyz^5.0+xy012^23.0*0.06428571428571428/36.0*xyz^36.0-x0^2.0*x0*0.007142857142857143/71.0*xyz^71.0+x0^2.0*0.10256410256410256/40.0*xyz^40.0-x0^2.0/33.0/34.0*xyz^34.0-x0^3.0/2.0*xyz^2.0+x0^21.0*0.05405405405405406/38.0*xyz^38.0-xy012^2.0*xy0121/20.0/41.0*xyz^41.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-xy012^21.0*0.05*xyz^5.0+xy012^23.0*0.0017857142857142854*xyz^36.0-x0^2.0*x0*1.0060362173038229E-4*xyz^71.0+x0^2.0*0.002564102564102564*xyz^40.0-x0^2.0*8.9126559714795E-4*xyz^34.0-x0^3.0/2.0*xyz^2.0+x0^21.0*0.001422475106685633*xyz^38.0-xy012^2.0*xy0121/820.0*xyz^41.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-xy012^21.0*6.0*xyz+xy012^23.0*2524.5*xyz^32.0-x0^2.0*x0*2346.0*xyz^67.0+x0^2.0*5624.0*xyz^36.0-x0^2.0*992.0*xyz^30.0-x0^3.0*0.0+x0^21.0*2520.0*xyz^34.0-xy012^2.0*xy0121*38.0*xyz^37.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-xy012^21.0*6.0+xy012^23.0*2524.5*32.0*xyz^31.0-x0^2.0*x0*2346.0*67.0*xyz^66.0+x0^2.0*5624.0*36.0*xyz^35.0-x0^2.0*992.0*30.0*xyz^29.0-x0^3.0*0.0*0.0+x0^21.0*2520.0*34.0*xyz^33.0-xy012^2.0*xy0121*37.0*xyz^36.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-xy012^21.0*6.0+xy012^23.0*80784.0*xyz^31.0-x0^2.0*x0*157182.0*xyz^66.0+x0^2.0*202464.0*xyz^35.0-x0^2.0*29760.0*xyz^29.0-x0^3.0*0.0+x0^21.0*85680.0*xyz^33.0-xy012^2.0*xy0121*37.0*xyz^36.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-xy012^21.0*0.05*xyz^5.0+xy012^23.0*0.0017857142857142854*xyz^36.0-x0^2.0*x0*1.0060362173038229E-4*xyz^71.0-4.0*xyz^71.0+x0^2.0*0.002564102564102564*xyz^40.0-x0^2.0*8.9126559714795E-4*xyz^34.0-4.0*xyz^34.0-x0^3.0/2.0*xyz^2.0+x0^21.0*0.001422475106685633*xyz^38.0-xy012^2.0*xy0121/820.0*xyz^41.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-xy012^21.0*0.05/6.0*xyz^6.0+xy012^23.0*0.0017857142857142854/37.0*xyz^37.0-x0^2.0*x0*1.0060362173038229E-4/72.0*xyz^72.0-4.0/72.0*xyz^72.0+x0^2.0*0.002564102564102564/41.0*xyz^41.0-x0^2.0*8.9126559714795E-4/35.0*xyz^35.0-4.0/35.0*xyz^35.0-x0^3.0/2.0/3.0*xyz^3.0+x0^21.0*0.001422475106685633/39.0*xyz^39.0-xy012^2.0*xy0121/820.0/42.0*xyz^42.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-xy012^21.0*0.008333333333333333*xyz^6.0+xy012^23.0*4.8262548262548256E-5*xyz^37.0-x0^2.0*x0/715680.0*xyz^72.0-1.0/18.0*xyz^72.0-0.05555555555555555*xyz^72.0+x0^2.0*6.253908692933083E-5*xyz^41.0-x0^2.0/39270.0*xyz^35.0-1.0/8.75*xyz^35.0-0.11428571428571428*xyz^35.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^21.0*3.6473720684247E-5*xyz^39.0-xy012^2.0*xy0121/34440.0*xyz^42.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-xy012^21.0*6.0+xy012^23.0*80784.0*xyz^31.0-x0^2.0*x0*157182.0*xyz^66.0+x0^2.0*202464.0*xyz^35.0-x0^2.0*29760.0*xyz^29.0-x0^3.0*0.0+x0^21.0*85680.0*xyz^33.0-xy012^2.0*xy0121*37.0*xyz^36.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-xy012^21.0*6.0*0.0+xy012^23.0*80784.0*31.0*xyz^30.0-x0^2.0*x0*157182.0*66.0*xyz^65.0+x0^2.0*202464.0*35.0*xyz^34.0-x0^2.0*29760.0*29.0*xyz^28.0-x0^3.0*0.0*0.0+x0^21.0*85680.0*33.0*xyz^32.0-xy012^2.0*xy0121*36.0*xyz^35.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-xy012^21.0*0.0+xy012^23.0*2504304.0*xyz^30.0-x0^2.0*x0*1.0374012E7*xyz^65.0+x0^2.0*7086240.0*xyz^34.0-x0^2.0*863040.0*xyz^28.0-x0^3.0*0.0+x0^21.0*2827440.0*xyz^32.0-xy012^2.0*xy0121*36.0*xyz^35.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-xy012^21.0*0.008333333333333333*xyz^6.0+xy012^23.0*4.8262548262548256E-5*xyz^37.0-5.0*xyz^37.0-x0^2.0*x0/715680.0*xyz^72.0-1.0/18.0*xyz^72.0-0.05555555555555555*xyz^72.0+x0^2.0*6.253908692933083E-5*xyz^41.0-5.0*xyz^41.0-x0^2.0/39270.0*xyz^35.0-1.0/8.75*xyz^35.0-0.11428571428571428*xyz^35.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^21.0*3.6473720684247E-5*xyz^39.0-5.0*xyz^39.0-xy012^2.0*xy0121/34440.0*xyz^42.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-xy012^21.0*0.008333333333333333/7.0*xyz^7.0+xy012^23.0*4.8262548262548256E-5/38.0*xyz^38.0-5.0/38.0*xyz^38.0-x0^2.0*x0/715680.0/73.0*xyz^73.0-1.0/18.0/73.0*xyz^73.0-0.05555555555555555/73.0*xyz^73.0+x0^2.0*6.253908692933083E-5/42.0*xyz^42.0-5.0/42.0*xyz^42.0-x0^2.0/39270.0/36.0*xyz^36.0-1.0/8.75/36.0*xyz^36.0-0.11428571428571428/36.0*xyz^36.0-x0^3.0*0.16666666666666666/4.0*xyz^4.0+x0^21.0*3.6473720684247E-5/40.0*xyz^40.0-5.0/40.0*xyz^40.0-xy012^2.0*xy0121/34440.0/43.0*xyz^43.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-xy012^21.0*0.0011904761904761904*xyz^7.0+xy012^23.0/787360.0000000001*xyz^38.0-1.0/7.6*xyz^38.0-0.13157894736842105*xyz^38.0-x0^2.0*x0/5.224464E7*xyz^73.0-1.0/1314.0*xyz^73.0-7.6103500761035E-4*xyz^73.0+x0^2.0/671580.0*xyz^42.0-1.0/8.4*xyz^42.0-0.11904761904761904*xyz^42.0-x0^2.0/1413720.0*xyz^36.0-1.0/315.0*xyz^36.0-0.0031746031746031746*xyz^36.0-x0^3.0*0.041666666666666664*xyz^4.0+x0^21.0/1096680.0*xyz^40.0-1.0/8.0*xyz^40.0-0.125*xyz^40.0-xy012^2.0*xy0121/1480920.0*xyz^43.0";
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

public static void TestCaseDiff121268() {
 UsageCalculus.TestCase = 121268;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xyza/-3*xyza^2-3*xyza^2*1*xyza/2*xyza^21*xyza/2*xyza^2*-3*xyza^3*-1*xyza2*xy012^23*xyza^3*-1*xyza-1*xyza/2*xyza^2*-3*xyza^32*x0^2*-3*x0^3*1*x0/-3*x0^23*xyza^31*xyza/-3*xyza^2-3*x0^2*-1*x0^3*2*x01*xyza^3*2*xyza/3*xyza^2*--1*xyza^32*xyza3*x0^2*--1*x0^3-1*xyza^3*2*xyza/3*xyza^22*xyza/3*xyza^2*-1*xyza^3*-3*xyza3*x0^21*xyza^3*-3*xyza-3*xyza/1*xyza^2*-2*xyza^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyza^31*xyza/-3*xyza^2-3*xyza^2*1*xyza";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=267 EqnNumber=71 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[86, 71, 20, 1, 4, 2, 3, 10, 2, 3, 4, 2, 3, 1, 2, 3, 1, 2, 4, 2, 3, 1, 3, 1, 2, 3, 1, 3, 4, 15, 4, 17, 2, 19, 28]"+
"// DOEMatrixRow=[83, 73, 3, 2, 1, 2, 3, 5, 3, 1, 2, 1, 1, 2, 1, 3, 1, 23, 2, 3, 1, 4, 3, 1, 5, 4, 3, 1, 2, 11, 1, 14, 11]"+
//Tail EqnIndex=267 EqnNumber=71 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[86, 71, 20, 1, 4, 2, 3, 10, 2, 3, 4, 2, 3, 1, 2, 3, 1, 2, 4, 2, 3, 1, 3, 1, 2, 3, 1, 3, 4, 15, 4, 17, 2, 19, 28]"+
"// DOEMatrixRow=[83, 73, 3, 2, 1, 2, 3, 5, 3, 1, 2, 1, 1, 2, 1, 3, 1, 23, 2, 3, 1, 4, 3, 1, 5, 4, 3, 1, 2, 11, 1, 14, 11]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-1.0/3.0*xyza^3.0+xy012^23.0*2.25*xyza^34.0-x0^2.0*x0/2.0*xyza^69.0+x0^2.0*4.0*xyza^38.0-x0^2.0*xyza^32.0-x0^3.0+x0^21.0*2.0*xyza^36.0-x0^2.0*x0*12.0*xyza^68.0-3.0*xyza^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-1.0/3.0*3.0*xyza^2.0+xy012^23.0*2.25*34.0*xyza^33.0-x0^2.0*x0/2.0*69.0*xyza^68.0+x0^2.0*4.0*38.0*xyza^37.0-x0^2.0*32.0*xyza^31.0-x0^3.0*0.0+x0^21.0*2.0*36.0*xyza^35.0-x0^2.0*x0*12.0*68.0*xyza^67.0-3.0*3.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-xyza^2.0+xy012^23.0*76.5*xyza^33.0-x0^2.0*x0*34.5*xyza^68.0+x0^2.0*152.0*xyza^37.0-x0^2.0*32.0*xyza^31.0-x0^3.0*0.0+x0^21.0*72.0*xyza^35.0-x0^2.0*x0*816.0*xyza^67.0-9.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-1.0/3.0*xyza^3.0+xy012^23.0*2.25*xyza^34.0-x0^2.0*x0/2.0*xyza^69.0+x0^2.0*4.0*xyza^38.0-x0^2.0*xyza^32.0-x0^3.0+x0^21.0*2.0*xyza^36.0-x0^2.0*x0*12.0*xyza^68.0-3.0*xyza^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.0/3.0/4.0*xyza^4.0+xy012^23.0*2.25/35.0*xyza^35.0-x0^2.0*x0/2.0/70.0*xyza^70.0+x0^2.0*4.0/39.0*xyza^39.0-x0^2.0/33.0*xyza^33.0-x0^3.0*xyza+x0^21.0*2.0/37.0*xyza^37.0-x0^2.0*x0*12.0/69.0*xyza^69.0-3.0/4.0*xyza^4.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-0.08333333333333333*xyza^4.0+xy012^23.0*0.06428571428571428*xyza^35.0-x0^2.0*x0*0.007142857142857143*xyza^70.0+x0^2.0*0.10256410256410256*xyza^39.0-x0^2.0/33.0*xyza^33.0-x0^3.0*xyza+x0^21.0*0.05405405405405406*xyza^37.0-x0^2.0*x0/5.75*xyza^69.0-1.0/1.3333333333333333*xyza^4.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-xyza^2.0+xy012^23.0*76.5*xyza^33.0-x0^2.0*x0*34.5*xyza^68.0+x0^2.0*152.0*xyza^37.0-x0^2.0*32.0*xyza^31.0-x0^3.0*0.0+x0^21.0*72.0*xyza^35.0-x0^2.0*x0*816.0*xyza^67.0-9.0*xyza^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-2.0*xyza^1.0+xy012^23.0*76.5*33.0*xyza^32.0-x0^2.0*x0*34.5*68.0*xyza^67.0+x0^2.0*152.0*37.0*xyza^36.0-x0^2.0*32.0*31.0*xyza^30.0-x0^3.0*0.0*0.0+x0^21.0*72.0*35.0*xyza^34.0-x0^2.0*x0*816.0*67.0*xyza^66.0-9.0*2.0*xyza^1.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-2.0*xyza+xy012^23.0*2524.5*xyza^32.0-x0^2.0*x0*2346.0*xyza^67.0+x0^2.0*5624.0*xyza^36.0-x0^2.0*992.0*xyza^30.0-x0^3.0*0.0+x0^21.0*2520.0*xyza^34.0-x0^2.0*x0*54672.0*xyza^66.0-18.0*xyza";
 UsageCalculus.EqnSolArrayMap3[2] = "-0.08333333333333333*xyza^4.0+xy012^23.0*0.06428571428571428*xyza^35.0-x0^2.0*x0*0.007142857142857143*xyza^70.0+x0^2.0*0.10256410256410256*xyza^39.0-x0^2.0/33.0*xyza^33.0-x0^3.0*xyza+x0^21.0*0.05405405405405406*xyza^37.0-x0^2.0*x0/5.75*xyza^69.0-1.0/1.3333333333333333*xyza^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-0.08333333333333333/5.0*xyza^5.0+xy012^23.0*0.06428571428571428/36.0*xyza^36.0-x0^2.0*x0*0.007142857142857143/71.0*xyza^71.0+x0^2.0*0.10256410256410256/40.0*xyza^40.0-x0^2.0/33.0/34.0*xyza^34.0-x0^3.0/2.0*xyza^2.0+x0^21.0*0.05405405405405406/38.0*xyza^38.0-x0^2.0*x0/5.75/70.0*xyza^70.0-1.0/1.3333333333333333/5.0*xyza^5.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-0.016666666666666666*xyza^5.0+xy012^23.0*0.0017857142857142854*xyza^36.0-x0^2.0*x0*1.0060362173038229E-4*xyza^71.0+x0^2.0*0.002564102564102564*xyza^40.0-x0^2.0*8.9126559714795E-4*xyza^34.0-x0^3.0/2.0*xyza^2.0+x0^21.0*0.001422475106685633*xyza^38.0-x0^2.0*x0/402.5*xyza^70.0-1.0/6.666666666666666*xyza^5.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-2.0*xyza+xy012^23.0*2524.5*xyza^32.0-x0^2.0*x0*2346.0*xyza^67.0+x0^2.0*5624.0*xyza^36.0-x0^2.0*992.0*xyza^30.0-x0^3.0*0.0+x0^21.0*2520.0*xyza^34.0-x0^2.0*x0*54672.0*xyza^66.0-18.0*xyza";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-2.0+xy012^23.0*2524.5*32.0*xyza^31.0-x0^2.0*x0*2346.0*67.0*xyza^66.0+x0^2.0*5624.0*36.0*xyza^35.0-x0^2.0*992.0*30.0*xyza^29.0-x0^3.0*0.0*0.0+x0^21.0*2520.0*34.0*xyza^33.0-x0^2.0*x0*54672.0*66.0*xyza^65.0-18.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-2.0+xy012^23.0*80784.0*xyza^31.0-x0^2.0*x0*157182.0*xyza^66.0+x0^2.0*202464.0*xyza^35.0-x0^2.0*29760.0*xyza^29.0-x0^3.0*0.0+x0^21.0*85680.0*xyza^33.0-x0^2.0*x0*3608352.0*xyza^65.0-18.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-0.016666666666666666*xyza^5.0+xy012^23.0*0.0017857142857142854*xyza^36.0-x0^2.0*x0*1.0060362173038229E-4*xyza^71.0-4.0*xyza^71.0+x0^2.0*0.002564102564102564*xyza^40.0-x0^2.0*8.9126559714795E-4*xyza^34.0-4.0*xyza^34.0-x0^3.0/2.0*xyza^2.0+x0^21.0*0.001422475106685633*xyza^38.0-x0^2.0*x0/402.5*xyza^70.0-1.0/6.666666666666666*xyza^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-0.016666666666666666/6.0*xyza^6.0+xy012^23.0*0.0017857142857142854/37.0*xyza^37.0-x0^2.0*x0*1.0060362173038229E-4/72.0*xyza^72.0-4.0/72.0*xyza^72.0+x0^2.0*0.002564102564102564/41.0*xyza^41.0-x0^2.0*8.9126559714795E-4/35.0*xyza^35.0-4.0/35.0*xyza^35.0-x0^3.0/2.0/3.0*xyza^3.0+x0^21.0*0.001422475106685633/39.0*xyza^39.0-x0^2.0*x0/402.5/71.0*xyza^71.0-1.0/6.666666666666666/6.0*xyza^6.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-0.002777777777777778*xyza^6.0+xy012^23.0*4.8262548262548256E-5*xyza^37.0-x0^2.0*x0/715680.0*xyza^72.0-1.0/18.0*xyza^72.0-0.05555555555555555*xyza^72.0+x0^2.0*6.253908692933083E-5*xyza^41.0-x0^2.0/39270.0*xyza^35.0-1.0/8.75*xyza^35.0-0.11428571428571428*xyza^35.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^21.0*3.6473720684247E-5*xyza^39.0-x0^2.0*x0/28577.5*xyza^71.0-1.0/40.0*xyza^6.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-2.0+xy012^23.0*80784.0*xyza^31.0-x0^2.0*x0*157182.0*xyza^66.0+x0^2.0*202464.0*xyza^35.0-x0^2.0*29760.0*xyza^29.0-x0^3.0*0.0+x0^21.0*85680.0*xyza^33.0-x0^2.0*x0*3608352.0*xyza^65.0-18.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0+xy012^23.0*80784.0*31.0*xyza^30.0-x0^2.0*x0*157182.0*66.0*xyza^65.0+x0^2.0*202464.0*35.0*xyza^34.0-x0^2.0*29760.0*29.0*xyza^28.0-x0^3.0*0.0*0.0+x0^21.0*85680.0*33.0*xyza^32.0-x0^2.0*x0*3608352.0*65.0*xyza^64.0-18.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "xy012^23.0*2504304.0*xyza^30.0-x0^2.0*x0*1.0374012E7*xyza^65.0+x0^2.0*7086240.0*xyza^34.0-x0^2.0*863040.0*xyza^28.0-x0^3.0*0.0+x0^21.0*2827440.0*xyza^32.0-x0^2.0*x0*2.3454288E8*xyza^64.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-0.002777777777777778*xyza^6.0+xy012^23.0*4.8262548262548256E-5*xyza^37.0-5.0*xyza^37.0-x0^2.0*x0/715680.0*xyza^72.0-1.0/18.0*xyza^72.0-0.05555555555555555*xyza^72.0+x0^2.0*6.253908692933083E-5*xyza^41.0-5.0*xyza^41.0-x0^2.0/39270.0*xyza^35.0-1.0/8.75*xyza^35.0-0.11428571428571428*xyza^35.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^21.0*3.6473720684247E-5*xyza^39.0-5.0*xyza^39.0-x0^2.0*x0/28577.5*xyza^71.0-1.0/40.0*xyza^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-0.002777777777777778/7.0*xyza^7.0+xy012^23.0*4.8262548262548256E-5/38.0*xyza^38.0-5.0/38.0*xyza^38.0-x0^2.0*x0/715680.0/73.0*xyza^73.0-1.0/18.0/73.0*xyza^73.0-0.05555555555555555/73.0*xyza^73.0+x0^2.0*6.253908692933083E-5/42.0*xyza^42.0-5.0/42.0*xyza^42.0-x0^2.0/39270.0/36.0*xyza^36.0-1.0/8.75/36.0*xyza^36.0-0.11428571428571428/36.0*xyza^36.0-x0^3.0*0.16666666666666666/4.0*xyza^4.0+x0^21.0*3.6473720684247E-5/40.0*xyza^40.0-5.0/40.0*xyza^40.0-x0^2.0*x0/28577.5/72.0*xyza^72.0-1.0/40.0/7.0*xyza^7.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-3.968253968253968E-4*xyza^7.0+xy012^23.0/787360.0000000001*xyza^38.0-1.0/7.6*xyza^38.0-0.13157894736842105*xyza^38.0-x0^2.0*x0/5.224464E7*xyza^73.0-1.0/1314.0*xyza^73.0-7.6103500761035E-4*xyza^73.0+x0^2.0/671580.0*xyza^42.0-1.0/8.4*xyza^42.0-0.11904761904761904*xyza^42.0-x0^2.0/1413720.0*xyza^36.0-1.0/315.0*xyza^36.0-0.0031746031746031746*xyza^36.0-x0^3.0*0.041666666666666664*xyza^4.0+x0^21.0/1096680.0*xyza^40.0-1.0/8.0*xyza^40.0-0.125*xyza^40.0-x0^2.0*x0/2057580.0*xyza^72.0-1.0/280.0*xyza^7.0";
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

public static void TestCaseDiff121269() {
 UsageCalculus.TestCase = 121269;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*x^2*1*x/2*x^2-3*x^2*1*x1*x/2*x^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=268 EqnNumber=72 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[52, 72, 1, 2, 1, 3, 1, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 3, 4, 2, 1, 2, 3, 4, 2, 1, 1, 16, 1, 18, 3, 20, 29]"+
"// DOEMatrixRow=[49, 74, 4, 3, 2, 3, 1, 6, 1, 2, 3, 2, 3, 1, 2, 1, 2, 24, 3, 1, 2, 5, 1, 2, 6, 1, 1, 2, 3, 12, 2, 15, 12]"+
//Tail EqnIndex=268 EqnNumber=72 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[52, 72, 1, 2, 1, 3, 1, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 3, 4, 2, 1, 2, 3, 4, 2, 1, 1, 16, 1, 18, 3, 20, 29]"+
"// DOEMatrixRow=[49, 74, 4, 3, 2, 3, 1, 6, 1, 2, 3, 2, 3, 1, 2, 1, 2, 24, 3, 1, 2, 5, 1, 2, 6, 1, 1, 2, 3, 12, 2, 15, 12]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-1.5*x^5.0-1.5*x^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-1.5*5.0*x^4.0-1.5*5.0*x^4.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-7.5*x^4.0-7.5*x^4.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-1.5*x^5.0-1.5*x^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.5/6.0*x^6.0-1.5/6.0*x^6.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/4.0*x^6.0-1.0/4.0*x^6.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-7.5*x^4.0-7.5*x^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-7.5*4.0*x^3.0-7.5*4.0*x^3.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-30.0*x^3.0-30.0*x^3.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/4.0*x^6.0-1.0/4.0*x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/4.0/7.0*x^7.0-1.0/4.0/7.0*x^7.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/28.0*x^7.0-1.0/28.0*x^7.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-30.0*x^3.0-30.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-30.0*3.0*x^2.0-30.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-90.0*x^2.0-90.0*x^2.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/28.0*x^7.0-1.0/28.0*x^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/28.0/8.0*x^8.0-1.0/28.0/8.0*x^8.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/224.0*x^8.0-1.0/224.0*x^8.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-90.0*x^2.0-90.0*x^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-90.0*2.0*x^1.0-90.0*2.0*x^1.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-180.0*x-180.0*x";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/224.0*x^8.0-1.0/224.0*x^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/224.0/9.0*x^9.0-1.0/224.0/9.0*x^9.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/2016.0*x^9.0-1.0/2016.0*x^9.0";
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

public static void TestCaseDiff121270() {
 UsageCalculus.TestCase = 121270;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xy/2*xy^2*-3*xy^3*-1*xy2*xy012^21*xy/2*xy^22*xy012^2*-3*xy012^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=269 EqnNumber=73 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[16, 73, 2, 3, 2, 1, 2, 3, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 1, 1, 3, 2, 3, 1, 1, 3, 2, 3, 1, 2, 19, 4, 21, 30]"+
"// DOEMatrixRow=[13, 75, 5, 4, 3, 1, 2, 7, 2, 3, 4, 1, 1, 2, 3, 2, 3, 25, 4, 2, 3, 1, 2, 3, 1, 2, 3, 1, 4, 13, 1, 16, 13]"+
//Tail EqnIndex=269 EqnNumber=73 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[16, 73, 2, 3, 2, 1, 2, 3, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 1, 1, 3, 2, 3, 1, 1, 3, 2, 3, 1, 2, 19, 4, 21, 30]"+
"// DOEMatrixRow=[13, 75, 5, 4, 3, 1, 2, 7, 2, 3, 4, 1, 1, 2, 3, 2, 3, 25, 4, 2, 3, 1, 2, 3, 1, 2, 3, 1, 4, 13, 1, 16, 13]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-2.25*xy^29.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-2.25*29.0*xy^28.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-65.25*xy^28.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-2.25*xy^29.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-2.25/30.0*xy^30.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/13.333333333333334*xy^30.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-65.25*xy^28.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-65.25*28.0*xy^27.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-1827.0*xy^27.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/13.333333333333334*xy^30.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/13.333333333333334/31.0*xy^31.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/413.33333333333337*xy^31.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-1827.0*xy^27.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-1827.0*27.0*xy^26.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-49329.0*xy^26.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/413.33333333333337*xy^31.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/413.33333333333337/32.0*xy^32.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/13226.666666666668*xy^32.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-49329.0*xy^26.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-49329.0*26.0*xy^25.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1282554.0*xy^25.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/13226.666666666668*xy^32.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/13226.666666666668/33.0*xy^33.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/436480.00000000006*xy^33.0";
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

public static void TestCaseDiff121271() {
 UsageCalculus.TestCase = 121271;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xy012^23*xyz^3*-1*xyz-1*xyz/2*xyz^2*-3*xyz^32*xy012^2*-3*xy012^33*xyz^3*-1*xyz";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=270 EqnNumber=74 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[81, 74, 3, 4, 3, 2, 3, 4, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 2, 4, 3, 1, 2, 3, 4, 3, 4, 2, 3, 20, 5, 22, 31]"+
"// DOEMatrixRow=[78, 76, 6, 1, 1, 2, 3, 8, 3, 4, 1, 2, 3, 1, 4, 3, 1, 26, 5, 3, 1, 2, 3, 1, 2, 3, 1, 2, 1, 14, 2, 17, 14]"+
//Tail EqnIndex=270 EqnNumber=74 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[81, 74, 3, 4, 3, 2, 3, 4, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 2, 4, 3, 1, 2, 3, 4, 3, 4, 2, 3, 20, 5, 22, 31]"+
"// DOEMatrixRow=[78, 76, 6, 1, 1, 2, 3, 8, 3, 4, 1, 2, 3, 1, 4, 3, 1, 26, 5, 3, 1, 2, 3, 1, 2, 3, 1, 2, 1, 14, 2, 17, 14]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-xy012^23.0*2.0*xyz^4.0+xy012^2.0*4.5*xyz^39.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-xy012^23.0*2.0*4.0*xyz^3.0+xy012^2.0*4.5*39.0*xyz^38.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-xy012^23.0*8.0*xyz^3.0+xy012^2.0*175.5*xyz^38.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-xy012^23.0*2.0*xyz^4.0+xy012^2.0*4.5*xyz^39.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-xy012^23.0*2.0/5.0*xyz^5.0+xy012^2.0*4.5/40.0*xyz^40.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-xy012^23.0*0.4*xyz^5.0+xy012^2.0/8.88888888888889*xyz^40.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-xy012^23.0*8.0*xyz^3.0+xy012^2.0*175.5*xyz^38.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-xy012^23.0*8.0*3.0*xyz^2.0+xy012^2.0*175.5*38.0*xyz^37.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-xy012^23.0*24.0*xyz^2.0+xy012^2.0*6669.0*xyz^37.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-xy012^23.0*0.4*xyz^5.0+xy012^2.0/8.88888888888889*xyz^40.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-xy012^23.0*0.4/6.0*xyz^6.0+xy012^2.0*8.88888888888889/41.0*xyz^41.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-xy012^23.0*0.06666666666666667*xyz^6.0+xy012^2.0/4.6125*xyz^41.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-xy012^23.0*24.0*xyz^2.0+xy012^2.0*6669.0*xyz^37.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-xy012^23.0*24.0*2.0*xyz^1.0+xy012^2.0*6669.0*37.0*xyz^36.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-xy012^23.0*48.0*xyz+xy012^2.0*246753.0*xyz^36.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-xy012^23.0*0.06666666666666667*xyz^6.0+xy012^2.0/4.6125*xyz^41.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-xy012^23.0*0.06666666666666667/7.0*xyz^7.0+xy012^2.0*4.6125/42.0*xyz^42.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-xy012^23.0*0.009523809523809523*xyz^7.0+xy012^2.0/9.105691056910569*xyz^42.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-xy012^23.0*48.0*xyz+xy012^2.0*246753.0*xyz^36.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-xy012^23.0*48.0+xy012^2.0*246753.0*36.0*xyz^35.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-xy012^23.0*48.0+xy012^2.0*8883108.0*xyz^35.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-xy012^23.0*0.009523809523809523*xyz^7.0+xy012^2.0/9.105691056910569*xyz^42.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-xy012^23.0*0.009523809523809523/8.0*xyz^8.0+xy012^2.0*9.105691056910569/43.0*xyz^43.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-xy012^23.0*0.0011904761904761904*xyz^8.0+xy012^2.0/4.722321428571429*xyz^43.0";
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

public static void TestCaseDiff121272() {
 UsageCalculus.TestCase = 121272;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xyza^3*-1*xyza-1*xyza/2*xyza^2*-3*xyza^32*x0^2*-3*x0^3*1*x0/-3*x0^23*xyza^33*xyza^3*-1*xyza-1*xyza/2*xyza^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=271 EqnNumber=75 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[47, 75, 4, 5, 4, 3, 1, 5, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 3, 5, 1, 2, 3, 4, 5, 1, 1, 3, 4, 21, 6, 23, 32]"+
"// DOEMatrixRow=[43, 77, 7, 2, 3, 1, 1, 9, 1, 1, 2, 1, 1, 2, 1, 1, 2, 27, 6, 1, 2, 3, 1, 2, 3, 4, 2, 3, 2, 15, 1, 18, 15]"+
//Tail EqnIndex=271 EqnNumber=75 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[47, 75, 4, 5, 4, 3, 1, 5, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 3, 5, 1, 2, 3, 4, 5, 1, 1, 3, 4, 21, 6, 23, 32]"+
"// DOEMatrixRow=[43, 77, 7, 2, 3, 1, 1, 9, 1, 1, 2, 1, 1, 2, 1, 1, 2, 27, 6, 1, 2, 3, 1, 2, 3, 4, 2, 3, 2, 15, 1, 18, 15]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-3.0*xyza^4.0-x0^2.0*x0*1.5*xyza^72.0-1.0/2.0*xyza^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-3.0*4.0*xyza^3.0-x0^2.0*x0*1.5*72.0*xyza^71.0-1.0/2.0*3.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-12.0*xyza^3.0-x0^2.0*x0*108.0*xyza^71.0-1.5*xyza^2.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-3.0*xyza^4.0-x0^2.0*x0*1.5*xyza^72.0-1.0/2.0*xyza^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-3.0/5.0*xyza^5.0-x0^2.0*x0*1.5/73.0*xyza^73.0-1.0/2.0/4.0*xyza^4.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-0.6*xyza^5.0-x0^2.0*x0/48.666666666666664*xyza^73.0-1.0/8.0*xyza^4.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-12.0*xyza^3.0-x0^2.0*x0*108.0*xyza^71.0-1.5*xyza^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-12.0*3.0*xyza^2.0-x0^2.0*x0*108.0*71.0*xyza^70.0-1.5*2.0*xyza^1.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-36.0*xyza^2.0-x0^2.0*x0*7668.0*xyza^70.0-3.0*xyza";
 UsageCalculus.EqnSolArrayMap3[2] = "-0.6*xyza^5.0-x0^2.0*x0/48.666666666666664*xyza^73.0-1.0/8.0*xyza^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-0.6/6.0*xyza^6.0-x0^2.0*x0/48.666666666666664/74.0*xyza^74.0-1.0/8.0/5.0*xyza^5.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-0.09999999999999999*xyza^6.0-x0^2.0*x0/3601.333333333333*xyza^74.0-1.0/40.0*xyza^5.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-36.0*xyza^2.0-x0^2.0*x0*7668.0*xyza^70.0-3.0*xyza";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-36.0*2.0*xyza^1.0-x0^2.0*x0*7668.0*70.0*xyza^69.0-3.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-72.0*xyza-x0^2.0*x0*536760.0*xyza^69.0-3.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-0.09999999999999999*xyza^6.0-x0^2.0*x0/3601.333333333333*xyza^74.0-1.0/40.0*xyza^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-0.09999999999999999/7.0*xyza^7.0-x0^2.0*x0/3601.333333333333/75.0*xyza^75.0-1.0/40.0/6.0*xyza^6.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-0.014285714285714285*xyza^7.0-x0^2.0*x0/270100.0*xyza^75.0-1.0/240.0*xyza^6.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-72.0*xyza-x0^2.0*x0*536760.0*xyza^69.0-3.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-72.0-x0^2.0*x0*536760.0*69.0*xyza^68.0-3.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-72.0-x0^2.0*x0*3.703644E7*xyza^68.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-0.014285714285714285*xyza^7.0-x0^2.0*x0/270100.0*xyza^75.0-1.0/240.0*xyza^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-0.014285714285714285/8.0*xyza^8.0-x0^2.0*x0/270100.0/76.0*xyza^76.0-1.0/240.0/7.0*xyza^7.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-0.0017857142857142857*xyza^8.0-x0^2.0*x0/2.05276E7*xyza^76.0-1.0/1680.0*xyza^7.0";
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

public static void TestCaseDiff121273() {
 UsageCalculus.TestCase = 121273;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-1*x/2*x^2*-3*x^32*x0^2*-3*x0^3*1*x0/-3*x0^23*x^31*x/-3*x^2-3*x0^2*-1*x0^3*2*x0-1*x/2*x^22*x0^2*-3*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=272 EqnNumber=76 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[11, 76, 5, 6, 1, 1, 2, 6, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 4, 6, 2, 3, 1, 1, 6, 2, 3, 4, 1, 22, 7, 24, 1]"+
"// DOEMatrixRow=[8, 78, 8, 3, 1, 2, 3, 10, 2, 3, 4, 2, 3, 1, 2, 3, 1, 28, 7, 2, 3, 4, 2, 3, 4, 1, 3, 1, 3, 16, 2, 19, 16]"+
//Tail EqnIndex=272 EqnNumber=76 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[11, 76, 5, 6, 1, 1, 2, 6, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 4, 6, 2, 3, 1, 1, 6, 2, 3, 4, 1, 22, 7, 24, 1]"+
"// DOEMatrixRow=[8, 78, 8, 3, 1, 2, 3, 10, 2, 3, 4, 2, 3, 1, 2, 3, 1, 28, 7, 2, 3, 4, 2, 3, 4, 1, 3, 1, 3, 16, 2, 19, 16]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-1.0/2.0*x^69.0+6.0+1.5*x^23.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-1.0/2.0*69.0*x^68.0+6.0*0.0+1.5*23.0*x^22.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-34.5*x^68.0+34.5*x^22.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-1.0/2.0*x^69.0+6.0+1.5*x^23.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.0/2.0/70.0*x^70.0+6.0*x+1.5/24.0*x^24.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/140.0*x^70.0+6.0*x+1.0/16.0*x^24.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-34.5*x^68.0+34.5*x^22.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-34.5*68.0*x^67.0+34.5*22.0*x^21.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-2346.0*x^67.0+759.0*x^21.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/140.0*x^70.0+6.0*x+1.0/16.0*x^24.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/140.0/71.0*x^71.0+6.0/2.0*x^2.0+1.0/16.0/25.0*x^25.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/9940.0*x^71.0+3.0*x^2.0+1.0/400.0*x^25.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-2346.0*x^67.0+759.0*x^21.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-2346.0*67.0*x^66.0+759.0*21.0*x^20.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-157182.0*x^66.0+15939.0*x^20.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/9940.0*x^71.0+3.0*x^2.0+1.0/400.0*x^25.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/9940.0/72.0*x^72.0+3.0/3.0*x^3.0+1.0/400.0/26.0*x^26.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/715680.0*x^72.0+x^3.0+1.0/10400.0*x^26.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-157182.0*x^66.0+15939.0*x^20.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-157182.0*66.0*x^65.0+15939.0*20.0*x^19.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1.0374012E7*x^65.0+318780.0*x^19.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.3972725240330875E-6*x^72.0+x^3.0+1.0/10400.0*x^26.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.3972725240330875E-6/73.0*x^73.0+1.0/4.0*x^4.0+1.0/10400.0/27.0*x^27.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/5.224464E7*x^73.0-1.0/12.166666666666666*x^73.0+1.0/4.0*x^4.0+1.0/280800.0*x^27.0";
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

public static void TestCaseDiff121274() {
 UsageCalculus.TestCase = 121274;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*x0^2*-3*x0^3*1*x0/-3*x0^23*xy^31*xy/-3*xy^2-3*x0^2*-1*x0^3*2*x01*xy^3*2*xy/3*xy^2*--1*xy^32*xy2*x0^2*-3*x0^33*xy^3*1*xy";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=273 EqnNumber=77 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[76, 77, 6, 7, 2, 3, 1, 7, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 5, 3, 1, 7, 3, 1, 2, 3, 7, 3, 4, 5, 2, 23, 8, 25, 2]"+
"// DOEMatrixRow=[73, 79, 9, 4, 2, 3, 1, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 29, 8, 3, 1, 5, 3, 1, 5, 2, 1, 2, 4, 1, 1, 20, 17]"+
//Tail EqnIndex=273 EqnNumber=77 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[76, 77, 6, 7, 2, 3, 1, 7, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 5, 3, 1, 7, 3, 1, 2, 3, 7, 3, 4, 5, 2, 23, 8, 25, 2]"+
"// DOEMatrixRow=[73, 79, 9, 4, 2, 3, 1, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 29, 8, 3, 1, 5, 3, 1, 5, 2, 1, 2, 4, 1, 1, 20, 17]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^2.0*x0/1.5*xy^34.0+x0^2.0*12.0*xy^42.0+x0^2.0*3.0*xy^36.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^2.0*x0/1.5*34.0*xy^33.0+x0^2.0*12.0*42.0*xy^41.0+x0^2.0*3.0*36.0*xy^35.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^2.0*x0*22.666666666666668*xy^33.0+x0^2.0*504.0*xy^41.0+x0^2.0*108.0*xy^35.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^2.0*x0/1.5*xy^34.0+x0^2.0*12.0*xy^42.0+x0^2.0*3.0*xy^36.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^2.0*x0/1.5/35.0*xy^35.0+x0^2.0*12.0/43.0*xy^43.0+x0^2.0*3.0/37.0*xy^37.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^2.0*x0*0.01904761904761905*xy^35.0+x0^2.0*0.27906976744186046*xy^43.0+x0^2.0/12.333333333333334*xy^37.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^2.0*x0*22.666666666666668*xy^33.0+x0^2.0*504.0*xy^41.0+x0^2.0*108.0*xy^35.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^2.0*x0*22.666666666666668*33.0*xy^32.0+x0^2.0*504.0*41.0*xy^40.0+x0^2.0*108.0*35.0*xy^34.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^2.0*x0*748.0*xy^32.0+x0^2.0*20664.0*xy^40.0+x0^2.0*3780.0*xy^34.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^2.0*x0*0.01904761904761905*xy^35.0+x0^2.0*0.27906976744186046*xy^43.0+x0^2.0/12.333333333333334*xy^37.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^2.0*x0*0.01904761904761905/36.0*xy^36.0+x0^2.0*0.27906976744186046/44.0*xy^44.0+x0^2.0*12.333333333333334/38.0*xy^38.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^2.0*x0*5.291005291005291E-4*xy^36.0+x0^2.0*0.006342494714587738*xy^44.0+x0^2.0/3.081081081081081*xy^38.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^2.0*x0*748.0*xy^32.0+x0^2.0*20664.0*xy^40.0+x0^2.0*3780.0*xy^34.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^2.0*x0*748.0*32.0*xy^31.0+x0^2.0*20664.0*40.0*xy^39.0+x0^2.0*3780.0*34.0*xy^33.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^2.0*x0*23936.0*xy^31.0+x0^2.0*826560.0*xy^39.0+x0^2.0*128520.0*xy^33.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^2.0*x0*5.291005291005291E-4*xy^36.0-4.0*xy^36.0+x0^2.0*0.006342494714587738*xy^44.0+x0^2.0/3.081081081081081*xy^38.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^2.0*x0*5.291005291005291E-4/37.0*xy^37.0-4.0/37.0*xy^37.0+x0^2.0*0.006342494714587738/45.0*xy^45.0+x0^2.0*3.081081081081081/39.0*xy^39.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^2.0*x0/69930.0*xy^37.0-1.0/9.25*xy^37.0-0.10810810810810811*xy^37.0+x0^2.0*1.4094432699083862E-4*xy^45.0+x0^2.0/12.657894736842104*xy^39.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^2.0*x0*23936.0*xy^31.0+x0^2.0*826560.0*xy^39.0+x0^2.0*128520.0*xy^33.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^2.0*x0*23936.0*31.0*xy^30.0+x0^2.0*826560.0*39.0*xy^38.0+x0^2.0*128520.0*33.0*xy^32.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^2.0*x0*742016.0*xy^30.0+x0^2.0*3.223584E7*xy^38.0+x0^2.0*4241160.0*xy^32.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^2.0*x0/69930.0*xy^37.0-1.0/9.25*xy^37.0-0.10810810810810811*xy^37.0+x0^2.0*1.4094432699083862E-4*xy^45.0-4.0*xy^45.0+x0^2.0/12.657894736842104*xy^39.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^2.0*x0/69930.0/38.0*xy^38.0-1.0/9.25/38.0*xy^38.0-0.10810810810810811/38.0*xy^38.0+x0^2.0*1.4094432699083862E-4/46.0*xy^46.0-4.0/46.0*xy^46.0+x0^2.0*12.657894736842104/40.0*xy^40.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^2.0*x0/2657340.0*xy^38.0-1.0/351.5*xy^38.0-0.002844950213371266*xy^38.0+x0^2.0/326370.0*xy^46.0-1.0/11.5*xy^46.0-0.08695652173913043*xy^46.0+x0^2.0/3.1600831600831603*xy^40.0";
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

public static void TestCaseDiff121275() {
 UsageCalculus.TestCase = 121275;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xyz^31*xyz/-3*xyz^2-3*x0^2*-1*x0^3*2*x01*xyz^3*2*xyz/3*xyz^2*--1*xyz^32*xyz3*x0^2*--1*x0^3-1*xyz^3*2*xyz/3*xyz^23*xyz^3*1*xyz1*xyz/-3*xyz^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=274 EqnNumber=78 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[41, 78, 7, 8, 3, 1, 2, 8, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 1, 1, 2, 8, 1, 2, 3, 4, 8, 1, 1, 6, 3, 24, 9, 26, 3]"+
"// DOEMatrixRow=[38, 80, 10, 1, 3, 1, 2, 3, 1, 1, 2, 1, 2, 3, 4, 2, 3, 30, 9, 1, 2, 1, 1, 2, 6, 3, 2, 3, 1, 2, 1, 1, 18]"+
//Tail EqnIndex=274 EqnNumber=78 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[41, 78, 7, 8, 3, 1, 2, 8, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 1, 1, 2, 8, 1, 2, 3, 4, 8, 1, 1, 6, 3, 24, 9, 26, 3]"+
"// DOEMatrixRow=[38, 80, 10, 1, 3, 1, 2, 3, 1, 1, 2, 1, 2, 3, 4, 2, 3, 30, 9, 1, 2, 1, 1, 2, 6, 3, 2, 3, 1, 2, 1, 1, 18]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-xyz^34.0+x0^2.0*4.0*xyz^38.0-x0^2.0*xyz^32.0-x0^3.0+1.0/4.5*xyz^33.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-34.0*xyz^33.0+x0^2.0*4.0*38.0*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0+1.0/4.5*33.0*xyz^32.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-34.0*xyz^33.0+x0^2.0*152.0*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0+7.333333333333333*xyz^32.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-xyz^34.0+x0^2.0*4.0*xyz^38.0-x0^2.0*xyz^32.0-x0^3.0+1.0/4.5*xyz^33.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.0/35.0*xyz^35.0+x0^2.0*4.0/39.0*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz+1.0/4.5/34.0*xyz^34.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-0.02857142857142857*xyz^35.0+x0^2.0*0.10256410256410256*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz+1.0/153.0*xyz^34.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-34.0*xyz^33.0+x0^2.0*152.0*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0+7.333333333333333*xyz^32.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-34.0*33.0*xyz^32.0+x0^2.0*152.0*37.0*xyz^36.0-x0^2.0*32.0*31.0*xyz^30.0-x0^3.0*0.0*0.0+7.333333333333333*32.0*xyz^31.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-1122.0*xyz^32.0+x0^2.0*5624.0*xyz^36.0-x0^2.0*992.0*xyz^30.0-x0^3.0*0.0+234.66666666666666*xyz^31.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-0.02857142857142857*xyz^35.0+x0^2.0*0.10256410256410256*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz+1.0/153.0*xyz^34.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-0.02857142857142857/36.0*xyz^36.0+x0^2.0*0.10256410256410256/40.0*xyz^40.0-x0^2.0/33.0/34.0*xyz^34.0-x0^3.0/2.0*xyz^2.0+1.0/153.0/35.0*xyz^35.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-7.936507936507937E-4*xyz^36.0+x0^2.0*0.002564102564102564*xyz^40.0-x0^2.0*8.9126559714795E-4*xyz^34.0-x0^3.0/2.0*xyz^2.0+1.0/5355.0*xyz^35.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-1122.0*xyz^32.0+x0^2.0*5624.0*xyz^36.0-x0^2.0*992.0*xyz^30.0-x0^3.0*0.0+234.66666666666666*xyz^31.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-1122.0*32.0*xyz^31.0+x0^2.0*5624.0*36.0*xyz^35.0-x0^2.0*992.0*30.0*xyz^29.0-x0^3.0*0.0*0.0+234.66666666666666*31.0*xyz^30.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-35904.0*xyz^31.0+x0^2.0*202464.0*xyz^35.0-x0^2.0*29760.0*xyz^29.0-x0^3.0*0.0+7274.666666666666*xyz^30.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-7.936507936507937E-4*xyz^36.0-4.0*xyz^36.0+x0^2.0*0.002564102564102564*xyz^40.0-x0^2.0*8.9126559714795E-4*xyz^34.0-4.0*xyz^34.0-x0^3.0/2.0*xyz^2.0+1.0/5355.0*xyz^35.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-7.936507936507937E-4/37.0*xyz^37.0-4.0/37.0*xyz^37.0+x0^2.0*0.002564102564102564/41.0*xyz^41.0-x0^2.0*8.9126559714795E-4/35.0*xyz^35.0-4.0/35.0*xyz^35.0-x0^3.0/2.0/3.0*xyz^3.0+1.0/5355.0/36.0*xyz^36.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/46620.0*xyz^37.0-1.0/9.25*xyz^37.0-0.10810810810810811*xyz^37.0+x0^2.0*6.253908692933083E-5*xyz^41.0-x0^2.0/39270.0*xyz^35.0-1.0/8.75*xyz^35.0-0.11428571428571428*xyz^35.0-x0^3.0/6.0*xyz^3.0+1.0/192780.0*xyz^36.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-35904.0*xyz^31.0+x0^2.0*202464.0*xyz^35.0-x0^2.0*29760.0*xyz^29.0-x0^3.0*0.0+7274.666666666666*xyz^30.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-35904.0*31.0*xyz^30.0+x0^2.0*202464.0*35.0*xyz^34.0-x0^2.0*29760.0*29.0*xyz^28.0-x0^3.0*0.0*0.0+7274.666666666666*30.0*xyz^29.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1113024.0*xyz^30.0+x0^2.0*7086240.0*xyz^34.0-x0^2.0*863040.0*xyz^28.0-x0^3.0*0.0+218239.99999999997*xyz^29.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/46620.0*xyz^37.0-1.0/9.25*xyz^37.0-0.10810810810810811*xyz^37.0+x0^2.0*6.253908692933083E-5*xyz^41.0-5.0*xyz^41.0-x0^2.0/39270.0*xyz^35.0-1.0/8.75*xyz^35.0-0.11428571428571428*xyz^35.0-x0^3.0/6.0*xyz^3.0+1.0/192780.0*xyz^36.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/46620.0/38.0*xyz^38.0-1.0/9.25/38.0*xyz^38.0-0.10810810810810811/38.0*xyz^38.0+x0^2.0*6.253908692933083E-5/42.0*xyz^42.0-5.0/42.0*xyz^42.0-x0^2.0/39270.0/36.0*xyz^36.0-1.0/8.75/36.0*xyz^36.0-0.11428571428571428/36.0*xyz^36.0-x0^3.0/6.0/4.0*xyz^4.0+1.0/192780.0/37.0*xyz^37.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/1771560.0*xyz^38.0-1.0/351.5*xyz^38.0-0.002844950213371266*xyz^38.0+x0^2.0/671580.0*xyz^42.0-1.0/8.4*xyz^42.0-0.11904761904761904*xyz^42.0-x0^2.0/1413720.0*xyz^36.0-1.0/315.0*xyz^36.0-0.0031746031746031746*xyz^36.0-x0^3.0/24.0*xyz^4.0+1.0/7132860.0*xyz^37.0";
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

public static void TestCaseDiff121276() {
 UsageCalculus.TestCase = 121276;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xyza/-3*xyza^2-3*x0^2*-1*x0^3*2*x01*xyza^3*2*xyza/3*xyza^2*--1*xyza^32*xyza3*x0^2*--1*x0^3-1*xyza^3*2*xyza/3*xyza^22*xyza/3*xyza^2*-1*xyza^3*-3*xyza3*x0^21*xyza/-3*xyza^2-3*x0^2*-1*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=275 EqnNumber=79 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[6, 79, 8, 9, 4, 2, 3, 9, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 2, 3, 9, 2, 3, 1, 1, 9, 2, 3, 7, 4, 25, 10, 27, 4]"+
"// DOEMatrixRow=[3, 81, 11, 2, 1, 2, 3, 4, 2, 3, 4, 2, 3, 1, 1, 3, 1, 31, 10, 2, 3, 2, 3, 1, 1, 4, 3, 1, 2, 3, 2, 3, 19]"+
//Tail EqnIndex=275 EqnNumber=79 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[6, 79, 8, 9, 4, 2, 3, 9, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 2, 3, 9, 2, 3, 1, 1, 9, 2, 3, 7, 4, 25, 10, 27, 4]"+
"// DOEMatrixRow=[3, 81, 11, 2, 1, 2, 3, 4, 2, 3, 4, 2, 3, 1, 1, 3, 1, 31, 10, 2, 3, 2, 3, 1, 1, 4, 3, 1, 2, 3, 2, 3, 19]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-1.0/3.0*xyza^3.0+x0^2.0*4.0*xyza^38.0-x0^2.0*xyza^32.0-x0^3.0+x0^21.0/4.5*xyza^35.0+x0^2.0*3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-1.0/3.0*3.0*xyza^2.0+x0^2.0*4.0*38.0*xyza^37.0-x0^2.0*32.0*xyza^31.0-x0^3.0*0.0+x0^21.0/4.5*35.0*xyza^34.0+x0^2.0*3.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-xyza^2.0+x0^2.0*152.0*xyza^37.0-x0^2.0*32.0*xyza^31.0-x0^3.0*0.0+x0^21.0*7.777777777777778*xyza^34.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-1.0/3.0*xyza^3.0+x0^2.0*4.0*xyza^38.0-x0^2.0*xyza^32.0-x0^3.0+x0^21.0/4.5*xyza^35.0+x0^2.0*3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.0/3.0/4.0*xyza^4.0+x0^2.0*4.0/39.0*xyza^39.0-x0^2.0/33.0*xyza^33.0-x0^3.0*xyza+x0^21.0/4.5/36.0*xyza^36.0+x0^2.0*3.0*xyza";
 UsageCalculus.EqnSolArrayMap4[1] = "-0.08333333333333333*xyza^4.0+x0^2.0*0.10256410256410256*xyza^39.0-x0^2.0/33.0*xyza^33.0-x0^3.0*xyza+x0^21.0*0.006172839506172839*xyza^36.0+x0^2.0*3.0*xyza";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-xyza^2.0+x0^2.0*152.0*xyza^37.0-x0^2.0*32.0*xyza^31.0-x0^3.0*0.0+x0^21.0*7.777777777777778*xyza^34.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-2.0*xyza^1.0+x0^2.0*152.0*37.0*xyza^36.0-x0^2.0*32.0*31.0*xyza^30.0-x0^3.0*0.0*0.0+x0^21.0*7.777777777777778*34.0*xyza^33.0+x0^2.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-2.0*xyza+x0^2.0*5624.0*xyza^36.0-x0^2.0*992.0*xyza^30.0-x0^3.0*0.0+x0^21.0*264.44444444444446*xyza^33.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-0.08333333333333333*xyza^4.0+x0^2.0*0.10256410256410256*xyza^39.0-x0^2.0/33.0*xyza^33.0-x0^3.0*xyza+x0^21.0*0.006172839506172839*xyza^36.0+x0^2.0*3.0*xyza";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-0.08333333333333333/5.0*xyza^5.0+x0^2.0*0.10256410256410256/40.0*xyza^40.0-x0^2.0/33.0/34.0*xyza^34.0-x0^3.0/2.0*xyza^2.0+x0^21.0*0.006172839506172839/37.0*xyza^37.0+x0^2.0*3.0/2.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-0.016666666666666666*xyza^5.0+x0^2.0*0.002564102564102564*xyza^40.0-x0^2.0*8.9126559714795E-4*xyza^34.0-x0^3.0/2.0*xyza^2.0+x0^21.0*1.6683350016683348E-4*xyza^37.0+x0^2.0*1.5*xyza^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-2.0*xyza+x0^2.0*5624.0*xyza^36.0-x0^2.0*992.0*xyza^30.0-x0^3.0*0.0+x0^21.0*264.44444444444446*xyza^33.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-2.0+x0^2.0*5624.0*36.0*xyza^35.0-x0^2.0*992.0*30.0*xyza^29.0-x0^3.0*0.0*0.0+x0^21.0*264.44444444444446*33.0*xyza^32.0+x0^2.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-2.0+x0^2.0*202464.0*xyza^35.0-x0^2.0*29760.0*xyza^29.0-x0^3.0*0.0+x0^21.0*8726.666666666668*xyza^32.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-0.016666666666666666*xyza^5.0+x0^2.0*0.002564102564102564*xyza^40.0-x0^2.0*8.9126559714795E-4*xyza^34.0-4.0*xyza^34.0-x0^3.0/2.0*xyza^2.0+x0^21.0*1.6683350016683348E-4*xyza^37.0-4.0*xyza^37.0+x0^2.0*1.5*xyza^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-0.016666666666666666/6.0*xyza^6.0+x0^2.0*0.002564102564102564/41.0*xyza^41.0-x0^2.0*8.9126559714795E-4/35.0*xyza^35.0-4.0/35.0*xyza^35.0-x0^3.0/2.0/3.0*xyza^3.0+x0^21.0*1.6683350016683348E-4/38.0*xyza^38.0-4.0/38.0*xyza^38.0+x0^2.0*1.5/3.0*xyza^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-0.002777777777777778*xyza^6.0+x0^2.0*6.253908692933083E-5*xyza^41.0-x0^2.0/39270.0*xyza^35.0-1.0/8.75*xyza^35.0-0.11428571428571428*xyza^35.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^21.0/227772.00000000003*xyza^38.0-1.0/9.5*xyza^38.0-0.10526315789473684*xyza^38.0+x0^2.0/2.0*xyza^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-2.0+x0^2.0*202464.0*xyza^35.0-x0^2.0*29760.0*xyza^29.0-x0^3.0*0.0+x0^21.0*8726.666666666668*xyza^32.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0+x0^2.0*202464.0*35.0*xyza^34.0-x0^2.0*29760.0*29.0*xyza^28.0-x0^3.0*0.0*0.0+x0^21.0*8726.666666666668*32.0*xyza^31.0+x0^2.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*7086240.0*xyza^34.0-x0^2.0*863040.0*xyza^28.0-x0^3.0*0.0+x0^21.0*279253.3333333334*xyza^31.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-0.002777777777777778*xyza^6.0+x0^2.0*6.253908692933083E-5*xyza^41.0-5.0*xyza^41.0-x0^2.0/39270.0*xyza^35.0-1.0/8.75*xyza^35.0-0.11428571428571428*xyza^35.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^21.0/227772.00000000003*xyza^38.0-1.0/9.5*xyza^38.0-0.10526315789473684*xyza^38.0+x0^2.0/2.0*xyza^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-0.002777777777777778/7.0*xyza^7.0+x0^2.0*6.253908692933083E-5/42.0*xyza^42.0-5.0/42.0*xyza^42.0-x0^2.0/39270.0/36.0*xyza^36.0-1.0/8.75/36.0*xyza^36.0-0.11428571428571428/36.0*xyza^36.0-x0^3.0*0.16666666666666666/4.0*xyza^4.0+x0^21.0/227772.00000000003/39.0*xyza^39.0-1.0/9.5/39.0*xyza^39.0-0.10526315789473684/39.0*xyza^39.0+x0^2.0*2.0/4.0*xyza^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-3.968253968253968E-4*xyza^7.0+x0^2.0/671580.0*xyza^42.0-1.0/8.4*xyza^42.0-0.11904761904761904*xyza^42.0-x0^2.0/1413720.0*xyza^36.0-1.0/315.0*xyza^36.0-0.0031746031746031746*xyza^36.0-x0^3.0*0.041666666666666664*xyza^4.0+x0^21.0/8883108.000000002*xyza^39.0-1.0/370.5*xyza^39.0-0.002699055330634278*xyza^39.0+x0^2.0/2.0*xyza^4.0";
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

public static void TestCaseDiff121277() {
 UsageCalculus.TestCase = 121277;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*x0^2*-1*x0^3*2*x01*x^3*2*x/3*x^2*--1*x^32*x3*x0^2*--1*x0^3-1*x^3*2*x/3*x^22*x/3*x^2*-1*x^3*-3*x3*x0^21*x^3*-3*x-3*x/1*x^2*-2*x^3-3*x0^2*-1*x0^31*x^3*2*x";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=276 EqnNumber=80 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[71, 80, 9, 10, 1, 3, 1, 10, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 3, 4, 10, 3, 1, 2, 3, 10, 3, 4, 8, 1, 26, 11, 28, 5]"+
"// DOEMatrixRow=[68, 82, 12, 3, 2, 3, 1, 5, 3, 4, 1, 1, 1, 2, 3, 1, 2, 32, 1, 3, 1, 3, 1, 2, 3, 1, 1, 2, 3, 4, 1, 4, 20]"+
//Tail EqnIndex=276 EqnNumber=80 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[71, 80, 9, 10, 1, 3, 1, 10, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 3, 4, 10, 3, 1, 2, 3, 10, 3, 4, 8, 1, 26, 11, 28, 5]"+
"// DOEMatrixRow=[68, 82, 12, 3, 2, 3, 1, 5, 3, 4, 1, 1, 1, 2, 3, 1, 2, 32, 1, 3, 1, 3, 1, 2, 3, 1, 1, 2, 3, 4, 1, 4, 20]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "4.0*x^38.0-x^32.0-1.0+2.0*x^36.0+6.0*x^6.0+6.0*x^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "4.0*38.0*x^37.0-32.0*x^31.0-1.0*0.0+2.0*36.0*x^35.0+6.0*6.0*x^5.0+6.0*4.0*x^3.0";
 UsageCalculus.EqnSolArrayMap2[1] = "152.0*x^37.0-32.0*x^31.0+72.0*x^35.0+36.0*x^5.0+24.0*x^3.0";
 UsageCalculus.EqnSolArrayMap3[1] = "4.0*x^38.0-x^32.0-1.0+2.0*x^36.0+6.0*x^6.0+6.0*x^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "4.0/39.0*x^39.0-1.0/33.0*x^33.0-1.0*x+2.0/37.0*x^37.0+6.0/7.0*x^7.0+6.0/5.0*x^5.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/9.75*x^39.0-1.0/33.0*x^33.0-x+1.0/18.5*x^37.0+1.0/1.1666666666666667*x^7.0+1.2*x^5.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "152.0*x^37.0-32.0*x^31.0+72.0*x^35.0+36.0*x^5.0+24.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "152.0*37.0*x^36.0-32.0*31.0*x^30.0+72.0*35.0*x^34.0+36.0*5.0*x^4.0+24.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[2] = "5624.0*x^36.0-992.0*x^30.0+2520.0*x^34.0+180.0*x^4.0+72.0*x^2.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/9.75*x^39.0-0.030303030303030304*x^33.0-x+1.0/18.5*x^37.0+1.0/1.1666666666666667*x^7.0+1.2*x^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/9.75/40.0*x^40.0-0.030303030303030304/34.0*x^34.0-1.0/2.0*x^2.0+1.0/18.5/38.0*x^38.0+1.0/1.1666666666666667/8.0*x^8.0+1.2/6.0*x^6.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/390.0*x^40.0-1.0/1122.0*x^34.0-1.0/2.0*x^2.0+1.0/703.0*x^38.0+1.0/9.333333333333334*x^8.0+1.0/5.0*x^6.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "5624.0*x^36.0-992.0*x^30.0+2520.0*x^34.0+180.0*x^4.0+72.0*x^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "5624.0*36.0*x^35.0-992.0*30.0*x^29.0+2520.0*34.0*x^33.0+180.0*4.0*x^3.0+72.0*2.0*x^1.0";
 UsageCalculus.EqnSolArrayMap2[3] = "202464.0*x^35.0-29760.0*x^29.0+85680.0*x^33.0+720.0*x^3.0+144.0*x";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/390.0*x^40.0-1.0/1122.0*x^34.0-1.0/2.0*x^2.0+1.0/703.0*x^38.0+1.0/9.333333333333334*x^8.0+1.0/5.0*x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/390.0/41.0*x^41.0-1.0/1122.0/35.0*x^35.0-1.0/2.0/3.0*x^3.0+1.0/703.0/39.0*x^39.0+1.0/9.333333333333334/9.0*x^9.0+1.0/5.0/7.0*x^7.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/15990.0*x^41.0-1.0/39270.0*x^35.0-1.0/6.0*x^3.0+1.0/27417.0*x^39.0+1.0/84.0*x^9.0+1.0/35.0*x^7.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "202464.0*x^35.0-29760.0*x^29.0+85680.0*x^33.0+720.0*x^3.0+144.0*x";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "202464.0*35.0*x^34.0-29760.0*29.0*x^28.0+85680.0*33.0*x^32.0+720.0*3.0*x^2.0+144.0";
 UsageCalculus.EqnSolArrayMap2[4] = "7086240.0*x^34.0-863040.0*x^28.0+2827440.0*x^32.0+2160.0*x^2.0+144.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/15990.0*x^41.0-1.0/39270.0*x^35.0-1.0/6.0*x^3.0+1.0/27417.0*x^39.0+1.0/84.0*x^9.0+1.0/35.0*x^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/15990.0/42.0*x^42.0-1.0/39270.0/36.0*x^36.0-1.0/6.0/4.0*x^4.0+1.0/27417.0/40.0*x^40.0+1.0/84.0/10.0*x^10.0+1.0/35.0/8.0*x^8.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/671580.0*x^42.0-1.0/1413720.0*x^36.0-1.0/24.0*x^4.0+1.0/1096680.0*x^40.0+1.0/840.0*x^10.0+1.0/280.0*x^8.0";
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

public static void TestCaseDiff121278() {
 UsageCalculus.TestCase = 121278;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xy^3*2*xy/3*xy^2*--1*xy^32*xy3*x0^2*--1*x0^3-1*xy^3*2*xy/3*xy^22*xy/3*xy^2*-1*xy^3*-3*xy3*x0^21*xy^3*-3*xy-3*xy/1*xy^2*-2*xy^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xy^31*xy^3*2*xy2*xy/3*xy^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=277 EqnNumber=81 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[36, 81, 10, 11, 2, 1, 2, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 1, 1, 11, 1, 2, 3, 4, 11, 1, 1, 9, 2, 27, 12, 29, 6]"+
"// DOEMatrixRow=[33, 83, 13, 4, 3, 1, 2, 6, 1, 1, 2, 1, 2, 3, 4, 2, 3, 33, 2, 1, 2, 4, 2, 3, 4, 2, 3, 1, 4, 5, 2, 5, 1]"+
//Tail EqnIndex=277 EqnNumber=81 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[36, 81, 10, 11, 2, 1, 2, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 1, 1, 11, 1, 2, 3, 4, 11, 1, 1, 9, 2, 27, 12, 29, 6]"+
"// DOEMatrixRow=[33, 83, 13, 4, 3, 1, 2, 6, 1, 1, 2, 1, 2, 3, 4, 2, 3, 33, 2, 1, 2, 4, 2, 3, 4, 2, 3, 1, 4, 5, 2, 5, 1]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0/1.5*xy^38.0-x0^2.0*xy^32.0-x0^3.0+x0^21.0*2.0*xy^36.0+24.0*xy^71.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0/1.5*38.0*xy^37.0-x0^2.0*32.0*xy^31.0-x0^3.0*0.0+x0^21.0*2.0*36.0*xy^35.0+24.0*71.0*xy^70.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*25.333333333333332*xy^37.0-x0^2.0*32.0*xy^31.0-x0^3.0*0.0+x0^21.0*72.0*xy^35.0+1704.0*xy^70.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0/1.5*xy^38.0-x0^2.0*xy^32.0-x0^3.0+x0^21.0*2.0*xy^36.0+24.0*xy^71.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0/1.5/39.0*xy^39.0-x0^2.0/33.0*xy^33.0-x0^3.0*xy+x0^21.0*2.0/37.0*xy^37.0+24.0/72.0*xy^72.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0*0.017094017094017096*xy^39.0-x0^2.0/33.0*xy^33.0-x0^3.0*xy+x0^21.0/18.5*xy^37.0+1.0/3.0*xy^72.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*25.333333333333332*xy^37.0-x0^2.0*32.0*xy^31.0-x0^3.0*0.0+x0^21.0*72.0*xy^35.0+1704.0*xy^70.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*25.333333333333332*37.0*xy^36.0-x0^2.0*32.0*31.0*xy^30.0-x0^3.0*0.0*0.0+x0^21.0*72.0*35.0*xy^34.0+1704.0*70.0*xy^69.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*937.3333333333333*xy^36.0-x0^2.0*992.0*xy^30.0-x0^3.0*0.0+x0^21.0*2520.0*xy^34.0+119280.0*xy^69.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0*0.017094017094017096*xy^39.0-x0^2.0/33.0*xy^33.0-x0^3.0*xy+x0^21.0/18.5*xy^37.0+1.0/3.0*xy^72.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0*0.017094017094017096/40.0*xy^40.0-x0^2.0/33.0/34.0*xy^34.0-x0^3.0/2.0*xy^2.0+x0^21.0/18.5/38.0*xy^38.0+1.0/3.0/73.0*xy^73.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0*4.273504273504274E-4*xy^40.0-x0^2.0*8.9126559714795E-4*xy^34.0-x0^3.0/2.0*xy^2.0+x0^21.0/703.0*xy^38.0+1.0/219.0*xy^73.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*937.3333333333333*xy^36.0-x0^2.0*992.0*xy^30.0-x0^3.0*0.0+x0^21.0*2520.0*xy^34.0+119280.0*xy^69.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*937.3333333333333*36.0*xy^35.0-x0^2.0*992.0*30.0*xy^29.0-x0^3.0*0.0*0.0+x0^21.0*2520.0*34.0*xy^33.0+119280.0*69.0*xy^68.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*33744.0*xy^35.0-x0^2.0*29760.0*xy^29.0-x0^3.0*0.0+x0^21.0*85680.0*xy^33.0+8230320.0*xy^68.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0*4.273504273504274E-4*xy^40.0-4.0*xy^40.0-x0^2.0*8.9126559714795E-4*xy^34.0-4.0*xy^34.0-x0^3.0/2.0*xy^2.0+x0^21.0/703.0*xy^38.0+1.0/219.0*xy^73.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0*4.273504273504274E-4/41.0*xy^41.0-4.0/41.0*xy^41.0-x0^2.0*8.9126559714795E-4/35.0*xy^35.0-4.0/35.0*xy^35.0-x0^3.0/2.0/3.0*xy^3.0+x0^21.0/703.0/39.0*xy^39.0+1.0/219.0/74.0*xy^74.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0/95939.99999999999*xy^41.0-1.0/10.25*xy^41.0-0.0975609756097561*xy^41.0-x0^2.0/39270.0*xy^35.0-1.0/8.75*xy^35.0-0.11428571428571428*xy^35.0-x0^3.0*0.16666666666666666*xy^3.0+x0^21.0/27417.0*xy^39.0+1.0/16206.0*xy^74.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*33744.0*xy^35.0-x0^2.0*29760.0*xy^29.0-x0^3.0*0.0+x0^21.0*85680.0*xy^33.0+8230320.0*xy^68.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*33744.0*35.0*xy^34.0-x0^2.0*29760.0*29.0*xy^28.0-x0^3.0*0.0*0.0+x0^21.0*85680.0*33.0*xy^32.0+8230320.0*68.0*xy^67.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*1181040.0*xy^34.0-x0^2.0*863040.0*xy^28.0-x0^3.0*0.0+x0^21.0*2827440.0*xy^32.0+5.5966176E8*xy^67.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0/95939.99999999999*xy^41.0-1.0/10.25*xy^41.0-0.0975609756097561*xy^41.0-x0^2.0/39270.0*xy^35.0-1.0/8.75*xy^35.0-0.11428571428571428*xy^35.0-x0^3.0*0.16666666666666666*xy^3.0+x0^21.0/27417.0*xy^39.0+1.0/16206.0*xy^74.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0/95939.99999999999/42.0*xy^42.0-1.0/10.25/42.0*xy^42.0-0.0975609756097561/42.0*xy^42.0-x0^2.0/39270.0/36.0*xy^36.0-1.0/8.75/36.0*xy^36.0-0.11428571428571428/36.0*xy^36.0-x0^3.0*0.16666666666666666/4.0*xy^4.0+x0^21.0/27417.0/40.0*xy^40.0+1.0/16206.0/75.0*xy^75.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0/4029479.9999999995*xy^42.0-1.0/430.5*xy^42.0-0.0023228803716608595*xy^42.0-x0^2.0/1413720.0*xy^36.0-1.0/315.0*xy^36.0-0.0031746031746031746*xy^36.0-x0^3.0*0.041666666666666664*xy^4.0+x0^21.0/1096680.0*xy^40.0+1.0/1215450.0*xy^75.0";
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

public static void TestCaseDiff121279() {
 UsageCalculus.TestCase = 121279;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xyz3*x0^2*--1*x0^3-1*xyz^3*2*xyz/3*xyz^22*xyz/3*xyz^2*-1*xyz^3*-3*xyz3*x0^21*xyz^3*-3*xyz-3*xyz/1*xyz^2*-2*xyz^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyz^33*xyz/-1*xyz^2-1*x0^2*-2*x0^3*3*x02*xyz/3*xyz^23*x0^2*--1*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=278 EqnNumber=82 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[2, 82, 11, 12, 3, 2, 3, 2, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 2, 3, 12, 2, 3, 1, 1, 12, 2, 3, 10, 3, 28, 13, 30, 7]"+
"// DOEMatrixRow=[99, 84, 14, 1, 1, 2, 3, 7, 2, 3, 4, 2, 3, 1, 1, 3, 1, 34, 3, 2, 3, 5, 3, 1, 5, 3, 1, 2, 1, 6, 1, 6, 2]"+
//Tail EqnIndex=278 EqnNumber=82 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[2, 82, 11, 12, 3, 2, 3, 2, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 2, 3, 12, 2, 3, 1, 1, 12, 2, 3, 10, 3, 28, 13, 30, 7]"+
"// DOEMatrixRow=[99, 84, 14, 1, 1, 2, 3, 7, 2, 3, 4, 2, 3, 1, 1, 3, 1, 34, 3, 2, 3, 5, 3, 1, 5, 3, 1, 2, 1, 6, 1, 6, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0*2.0-x0^3.0+x0^21.0*2.0*xyz^36.0-x0^2.0*x0*36.0*xyz^70.0+x0^2.0*x02*2.0*xyz^24.0-x0^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0*2.0*0.0-x0^3.0*0.0+x0^21.0*2.0*36.0*xyz^35.0-x0^2.0*x0*36.0*70.0*xyz^69.0+x0^2.0*x02*2.0*24.0*xyz^23.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*72.0*xyz^35.0-x0^2.0*x0*2520.0*xyz^69.0+x0^2.0*x02*48.0*xyz^23.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0*2.0-x0^3.0+x0^21.0*2.0*xyz^36.0-x0^2.0*x0*36.0*xyz^70.0+x0^2.0*x02*2.0*xyz^24.0-x0^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0*xyz-x0^3.0*xyz+x0^21.0*2.0/37.0*xyz^37.0-x0^2.0*x0*36.0/71.0*xyz^71.0+x0^2.0*x02*2.0/25.0*xyz^25.0-x0^3.0*xyz";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0*xyz-x0^3.0*xyz+x0^21.0*0.05405405405405406*xyz^37.0-x0^2.0*x0*0.5070422535211268*xyz^71.0+x0^2.0*x02*0.08*xyz^25.0-x0^3.0*xyz";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*72.0*xyz^35.0-x0^2.0*x0*2520.0*xyz^69.0+x0^2.0*x02*48.0*xyz^23.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^21.0*72.0*35.0*xyz^34.0-x0^2.0*x0*2520.0*69.0*xyz^68.0+x0^2.0*x02*48.0*23.0*xyz^22.0-x0^3.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*2520.0*xyz^34.0-x0^2.0*x0*173880.0*xyz^68.0+x0^2.0*x02*1104.0*xyz^22.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0*xyz-x0^3.0*xyz+x0^21.0*0.05405405405405406*xyz^37.0-x0^2.0*x0*0.5070422535211268*xyz^71.0+x0^2.0*x02*0.08*xyz^25.0-x0^3.0*xyz";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0/2.0*xyz^2.0-x0^3.0/2.0*xyz^2.0+x0^21.0*0.05405405405405406/38.0*xyz^38.0-x0^2.0*x0*0.5070422535211268/72.0*xyz^72.0+x0^2.0*x02*0.08/26.0*xyz^26.0-x0^3.0/2.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0/2.0*xyz^2.0-x0^3.0/2.0*xyz^2.0+x0^21.0*0.001422475106685633*xyz^38.0-x0^2.0*x0*0.007042253521126761*xyz^72.0+x0^2.0*x02*0.003076923076923077*xyz^26.0-x0^3.0/2.0*xyz^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*2520.0*xyz^34.0-x0^2.0*x0*173880.0*xyz^68.0+x0^2.0*x02*1104.0*xyz^22.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^21.0*2520.0*34.0*xyz^33.0-x0^2.0*x0*173880.0*68.0*xyz^67.0+x0^2.0*x02*1104.0*22.0*xyz^21.0-x0^3.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*85680.0*xyz^33.0-x0^2.0*x0*1.182384E7*xyz^67.0+x0^2.0*x02*24288.0*xyz^21.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0/2.0*xyz^2.0-x0^3.0/2.0*xyz^2.0+x0^21.0*0.001422475106685633*xyz^38.0-x0^2.0*x0*0.007042253521126761*xyz^72.0+x0^2.0*x02*0.003076923076923077*xyz^26.0-x0^3.0/2.0*xyz^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0/2.0/3.0*xyz^3.0-x0^3.0/2.0/3.0*xyz^3.0+x0^21.0*0.001422475106685633/39.0*xyz^39.0-x0^2.0*x0*0.007042253521126761/73.0*xyz^73.0+x0^2.0*x02*0.003076923076923077/27.0*xyz^27.0-x0^3.0*2.0/3.0*xyz^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0*0.16666666666666666*xyz^3.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^21.0*3.6473720684247E-5*xyz^39.0-x0^2.0*x0*9.646922631680494E-5*xyz^73.0+x0^2.0*x02*1.1396011396011396E-4*xyz^27.0-x0^3.0/1.5*xyz^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*85680.0*xyz^33.0-x0^2.0*x0*1.182384E7*xyz^67.0+x0^2.0*x02*24288.0*xyz^21.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^21.0*85680.0*33.0*xyz^32.0-x0^2.0*x0*1.182384E7*67.0*xyz^66.0+x0^2.0*x02*24288.0*21.0*xyz^20.0-x0^3.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*2827440.0*xyz^32.0-x0^2.0*x0*7.9219728E8*xyz^66.0+x0^2.0*x02*510048.0*xyz^20.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0*0.16666666666666666*xyz^3.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^21.0*3.6473720684247E-5*xyz^39.0-5.0*xyz^39.0-x0^2.0*x0*9.646922631680494E-5*xyz^73.0-5.0*xyz^73.0+x0^2.0*x02*1.1396011396011396E-4*xyz^27.0-4.0*xyz^27.0-x0^3.0/1.5*xyz^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0*0.16666666666666666/4.0*xyz^4.0-x0^3.0*0.16666666666666666/4.0*xyz^4.0+x0^21.0*3.6473720684247E-5/40.0*xyz^40.0-5.0/40.0*xyz^40.0-x0^2.0*x0*9.646922631680494E-5/74.0*xyz^74.0-5.0/74.0*xyz^74.0+x0^2.0*x02*1.1396011396011396E-4/28.0*xyz^28.0-4.0/28.0*xyz^28.0-x0^3.0*1.5/4.0*xyz^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0*0.041666666666666664*xyz^4.0-x0^3.0*0.041666666666666664*xyz^4.0+x0^21.0/1096680.0*xyz^40.0-1.0/8.0*xyz^40.0-0.125*xyz^40.0-x0^2.0*x0/767084.0*xyz^74.0-1.0/14.8*xyz^74.0-0.06756756756756757*xyz^74.0+x0^2.0*x02/245700.0*xyz^28.0-1.0/7.0*xyz^28.0-0.14285714285714285*xyz^28.0-x0^3.0/2.6666666666666665*xyz^4.0";
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

public static void TestCaseDiff121280() {
 UsageCalculus.TestCase = 121280;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*x0^2*--1*x0^3-1*xyza^3*2*xyza/3*xyza^22*xyza/3*xyza^2*-1*xyza^3*-3*xyza3*x0^21*xyza^3*-3*xyza-3*xyza/1*xyza^2*-2*xyza^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyza^33*xyza/-1*xyza^2-1*x0^2*-2*x0^3*3*x02*xyza^3*3*xyza/1*xyza^2*--3*xyza^33*xyza3*x0^2*--1*x0^3-1*xyza^3*2*xyza";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=279 EqnNumber=83 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[66, 83, 12, 13, 4, 3, 1, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 4, 13, 3, 1, 2, 3, 13, 3, 4, 11, 4, 29, 14, 31, 8]"+
"// DOEMatrixRow=[63, 85, 15, 2, 3, 1, 1, 8, 3, 4, 1, 1, 1, 2, 3, 1, 2, 35, 4, 3, 1, 1, 1, 2, 6, 4, 2, 3, 2, 7, 2, 7, 3]"+
//Tail EqnIndex=279 EqnNumber=83 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[66, 83, 12, 13, 4, 3, 1, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 4, 13, 3, 1, 2, 3, 13, 3, 4, 11, 4, 29, 14, 31, 8]"+
"// DOEMatrixRow=[63, 85, 15, 2, 3, 1, 1, 8, 3, 4, 1, 1, 1, 2, 3, 1, 2, 35, 4, 3, 1, 1, 1, 2, 6, 4, 2, 3, 2, 7, 2, 7, 3]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0*3.0-x0^3.0+x0^21.0*2.0*xyza^36.0-x0^2.0*x0*36.0*xyza^70.0+x0^2.0*54.0*xyza^39.0-x0^2.0*3.0*xyza^33.0-x0^3.0-2.0*xyza^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0*3.0*0.0-x0^3.0*0.0+x0^21.0*2.0*36.0*xyza^35.0-x0^2.0*x0*36.0*70.0*xyza^69.0+x0^2.0*54.0*39.0*xyza^38.0-x0^2.0*3.0*33.0*xyza^32.0-x0^3.0*0.0-2.0*4.0*xyza^3.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*72.0*xyza^35.0-x0^2.0*x0*2520.0*xyza^69.0+x0^2.0*2106.0*xyza^38.0-x0^2.0*99.0*xyza^32.0-x0^3.0*0.0-8.0*xyza^3.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0*3.0-x0^3.0+x0^21.0*2.0*xyza^36.0-x0^2.0*x0*36.0*xyza^70.0+x0^2.0*54.0*xyza^39.0-x0^2.0*3.0*xyza^33.0-x0^3.0-2.0*xyza^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0*3.0*xyza-x0^3.0*xyza+x0^21.0*2.0/37.0*xyza^37.0-x0^2.0*x0*36.0/71.0*xyza^71.0+x0^2.0*54.0/40.0*xyza^40.0-x0^2.0*3.0/34.0*xyza^34.0-x0^3.0*xyza-2.0/5.0*xyza^5.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0*3.0*xyza-x0^3.0*xyza+x0^21.0*0.05405405405405406*xyza^37.0-x0^2.0*x0*0.5070422535211268*xyza^71.0+x0^2.0*1.35*xyza^40.0-x0^2.0*0.08823529411764706*xyza^34.0-x0^3.0*xyza-1.0/2.5*xyza^5.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*72.0*xyza^35.0-x0^2.0*x0*2520.0*xyza^69.0+x0^2.0*2106.0*xyza^38.0-x0^2.0*99.0*xyza^32.0-x0^3.0*0.0-8.0*xyza^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^21.0*72.0*35.0*xyza^34.0-x0^2.0*x0*2520.0*69.0*xyza^68.0+x0^2.0*2106.0*38.0*xyza^37.0-x0^2.0*99.0*32.0*xyza^31.0-x0^3.0*0.0*0.0-8.0*3.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*2520.0*xyza^34.0-x0^2.0*x0*173880.0*xyza^68.0+x0^2.0*80028.0*xyza^37.0-x0^2.0*3168.0*xyza^31.0-x0^3.0*0.0-24.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0*3.0*xyza-x0^3.0*xyza+x0^21.0*0.05405405405405406*xyza^37.0-x0^2.0*x0*0.5070422535211268*xyza^71.0+x0^2.0*1.35*xyza^40.0-x0^2.0*0.08823529411764706*xyza^34.0-x0^3.0*xyza-1.0/2.5*xyza^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0*3.0/2.0*xyza^2.0-x0^3.0/2.0*xyza^2.0+x0^21.0*0.05405405405405406/38.0*xyza^38.0-x0^2.0*x0*0.5070422535211268/72.0*xyza^72.0+x0^2.0*1.35/41.0*xyza^41.0-x0^2.0*0.08823529411764706/35.0*xyza^35.0-x0^3.0/2.0*xyza^2.0-1.0/2.5/6.0*xyza^6.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0*1.5*xyza^2.0-x0^3.0/2.0*xyza^2.0+x0^21.0*0.001422475106685633*xyza^38.0-x0^2.0*x0*0.007042253521126761*xyza^72.0+x0^2.0*0.032926829268292684*xyza^41.0-x0^2.0*0.0025210084033613447*xyza^35.0-x0^3.0/2.0*xyza^2.0-1.0/15.0*xyza^6.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*2520.0*xyza^34.0-x0^2.0*x0*173880.0*xyza^68.0+x0^2.0*80028.0*xyza^37.0-x0^2.0*3168.0*xyza^31.0-x0^3.0*0.0-24.0*xyza^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^21.0*2520.0*34.0*xyza^33.0-x0^2.0*x0*173880.0*68.0*xyza^67.0+x0^2.0*80028.0*37.0*xyza^36.0-x0^2.0*3168.0*31.0*xyza^30.0-x0^3.0*0.0*0.0-24.0*2.0*xyza^1.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*85680.0*xyza^33.0-x0^2.0*x0*1.182384E7*xyza^67.0+x0^2.0*2961036.0*xyza^36.0-x0^2.0*98208.0*xyza^30.0-x0^3.0*0.0-48.0*xyza";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0*1.5*xyza^2.0-x0^3.0/2.0*xyza^2.0+x0^21.0*0.001422475106685633*xyza^38.0-x0^2.0*x0*0.007042253521126761*xyza^72.0+x0^2.0*0.032926829268292684*xyza^41.0-x0^2.0*0.0025210084033613447*xyza^35.0-x0^3.0/2.0*xyza^2.0-1.0/15.0*xyza^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0*1.5/3.0*xyza^3.0-x0^3.0/2.0/3.0*xyza^3.0+x0^21.0*0.001422475106685633/39.0*xyza^39.0-x0^2.0*x0*0.007042253521126761/73.0*xyza^73.0+x0^2.0*0.032926829268292684/42.0*xyza^42.0-x0^2.0*0.0025210084033613447/36.0*xyza^36.0-x0^3.0/2.0/3.0*xyza^3.0-1.0/15.0/7.0*xyza^7.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0*0.5*xyza^3.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^21.0*3.6473720684247E-5*xyza^39.0-x0^2.0*x0*9.646922631680494E-5*xyza^73.0+x0^2.0*7.839721254355401E-4*xyza^42.0-x0^2.0*7.00280112044818E-5*xyza^36.0-x0^3.0/6.0*xyza^3.0-1.0/105.0*xyza^7.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*85680.0*xyza^33.0-x0^2.0*x0*1.182384E7*xyza^67.0+x0^2.0*2961036.0*xyza^36.0-x0^2.0*98208.0*xyza^30.0-x0^3.0*0.0-48.0*xyza";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^21.0*85680.0*33.0*xyza^32.0-x0^2.0*x0*1.182384E7*67.0*xyza^66.0+x0^2.0*2961036.0*36.0*xyza^35.0-x0^2.0*98208.0*30.0*xyza^29.0-x0^3.0*0.0*0.0-48.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*2827440.0*xyza^32.0-x0^2.0*x0*7.9219728E8*xyza^66.0+x0^2.0*1.06597296E8*xyza^35.0-x0^2.0*2946240.0*xyza^29.0-x0^3.0*0.0-48.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0*0.5*xyza^3.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^21.0*3.6473720684247E-5*xyza^39.0-5.0*xyza^39.0-x0^2.0*x0*9.646922631680494E-5*xyza^73.0-5.0*xyza^73.0+x0^2.0*7.839721254355401E-4*xyza^42.0-4.0*xyza^42.0-x0^2.0*7.00280112044818E-5*xyza^36.0-5.0*xyza^36.0-x0^3.0/6.0*xyza^3.0-1.0/105.0*xyza^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0*0.5/4.0*xyza^4.0-x0^3.0*0.16666666666666666/4.0*xyza^4.0+x0^21.0*3.6473720684247E-5/40.0*xyza^40.0-5.0/40.0*xyza^40.0-x0^2.0*x0*9.646922631680494E-5/74.0*xyza^74.0-5.0/74.0*xyza^74.0+x0^2.0*7.839721254355401E-4/43.0*xyza^43.0-4.0/43.0*xyza^43.0-x0^2.0*7.00280112044818E-5/37.0*xyza^37.0-5.0/37.0*xyza^37.0-x0^3.0/6.0/4.0*xyza^4.0-1.0/105.0/8.0*xyza^8.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0*0.125*xyza^4.0-x0^3.0*0.041666666666666664*xyza^4.0+x0^21.0/1096680.0*xyza^40.0-1.0/8.0*xyza^40.0-0.125*xyza^40.0-x0^2.0*x0/767084.0*xyza^74.0-1.0/14.8*xyza^74.0-0.06756756756756757*xyza^74.0+x0^2.0/54848.88888888889*xyza^43.0-1.0/10.75*xyza^43.0-0.09302325581395349*xyza^43.0-x0^2.0/528359.9999999999*xyza^37.0-1.0/7.4*xyza^37.0-0.13513513513513514*xyza^37.0-x0^3.0/24.0*xyza^4.0-1.0/840.0*xyza^8.0";
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

public static void TestCaseDiff121281() {
 UsageCalculus.TestCase = 121281;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-1*x^3*2*x/3*x^22*x/3*x^2*-1*x^3*-3*x3*x0^21*x^3*-3*x-3*x/1*x^2*-2*x^31*x0^2*-2*x0^3*3*x0/-1*x0^22*x^33*x/-1*x^2-1*x0^2*-2*x0^3*3*x02*x^3*3*x/1*x^2*--3*x^33*x1*x0^2*--3*x0^3-3*x^3*1*x/2*x^2-1*x^3*2*x2*x/3*x^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=280 EqnNumber=84 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[31, 84, 13, 14, 1, 1, 2, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 1, 14, 1, 2, 3, 4, 14, 1, 1, 12, 1, 30, 15, 32, 9]"+
"// DOEMatrixRow=[28, 86, 16, 3, 1, 2, 3, 9, 1, 1, 2, 1, 2, 3, 4, 2, 3, 36, 5, 1, 2, 3, 2, 3, 1, 1, 3, 1, 3, 8, 1, 8, 4]"+
//Tail EqnIndex=280 EqnNumber=84 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[31, 84, 13, 14, 1, 1, 2, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 1, 14, 1, 2, 3, 4, 14, 1, 1, 12, 1, 30, 15, 32, 9]"+
"// DOEMatrixRow=[28, 86, 16, 3, 1, 2, 3, 9, 1, 1, 2, 1, 2, 3, 4, 2, 3, 36, 5, 1, 2, 3, 2, 3, 1, 1, 3, 1, 3, 8, 1, 8, 4]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "2.0*x^36.0-36.0*x^70.0+162.0*x^39.0-9.0*x^33.0-3.0-1.5*x^6.0-1.0/1.5*x^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "2.0*36.0*x^35.0-36.0*70.0*x^69.0+162.0*39.0*x^38.0-9.0*33.0*x^32.0-3.0*0.0-1.5*6.0*x^5.0-1.0/1.5*6.0*x^5.0";
 UsageCalculus.EqnSolArrayMap2[1] = "72.0*x^35.0-2520.0*x^69.0+6318.0*x^38.0-297.0*x^32.0-9.0*x^5.0-4.0*x^5.0";
 UsageCalculus.EqnSolArrayMap3[1] = "2.0*x^36.0-36.0*x^70.0+162.0*x^39.0-9.0*x^33.0-3.0-1.5*x^6.0-1.0/1.5*x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "2.0/37.0*x^37.0-36.0/71.0*x^71.0+162.0/40.0*x^40.0-9.0/34.0*x^34.0-3.0*x-1.5/7.0*x^7.0-1.0/1.5/7.0*x^7.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/18.5*x^37.0-1.0/1.9722222222222223*x^71.0+4.05*x^40.0-1.0/3.7777777777777777*x^34.0-3.0*x-1.0/4.666666666666667*x^7.0-1.0/10.5*x^7.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "72.0*x^35.0-2520.0*x^69.0+6318.0*x^38.0-297.0*x^32.0-9.0*x^5.0-4.0*x^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "72.0*35.0*x^34.0-2520.0*69.0*x^68.0+6318.0*38.0*x^37.0-297.0*32.0*x^31.0-9.0*5.0*x^4.0-4.0*5.0*x^4.0";
 UsageCalculus.EqnSolArrayMap2[2] = "2520.0*x^34.0-173880.0*x^68.0+240084.0*x^37.0-9504.0*x^31.0-45.0*x^4.0-20.0*x^4.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/18.5*x^37.0-1.0/1.9722222222222223*x^71.0+4.05*x^40.0-1.0/3.7777777777777777*x^34.0-3.0*x-1.0/4.666666666666667*x^7.0-1.0/10.5*x^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/18.5/38.0*x^38.0-1.0/1.9722222222222223/72.0*x^72.0+4.05/41.0*x^41.0-1.0/3.7777777777777777/35.0*x^35.0-3.0/2.0*x^2.0-1.0/4.666666666666667/8.0*x^8.0-1.0/10.5/8.0*x^8.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/703.0*x^38.0-1.0/142.0*x^72.0+1.0/10.123456790123457*x^41.0-1.0/132.22222222222223*x^35.0-1.5*x^2.0-1.0/37.333333333333336*x^8.0-1.0/84.0*x^8.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "2520.0*x^34.0-173880.0*x^68.0+240084.0*x^37.0-9504.0*x^31.0-45.0*x^4.0-20.0*x^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "2520.0*34.0*x^33.0-173880.0*68.0*x^67.0+240084.0*37.0*x^36.0-9504.0*31.0*x^30.0-45.0*4.0*x^3.0-20.0*4.0*x^3.0";
 UsageCalculus.EqnSolArrayMap2[3] = "85680.0*x^33.0-1.182384E7*x^67.0+8883108.0*x^36.0-294624.0*x^30.0-180.0*x^3.0-80.0*x^3.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/703.0*x^38.0-1.0/142.0*x^72.0+1.0/10.123456790123457*x^41.0-1.0/132.22222222222223*x^35.0-1.5*x^2.0-1.0/37.333333333333336*x^8.0-1.0/84.0*x^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/703.0/39.0*x^39.0-1.0/142.0/73.0*x^73.0+1.0/10.123456790123457/42.0*x^42.0-1.0/132.22222222222223/36.0*x^36.0-1.5/3.0*x^3.0-1.0/37.333333333333336/9.0*x^9.0-1.0/84.0/9.0*x^9.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/27417.0*x^39.0-1.0/10366.0*x^73.0+1.0/425.1851851851852*x^42.0-1.0/4760.0*x^36.0-1.0/2.0*x^3.0-1.0/336.0*x^9.0-1.0/756.0*x^9.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "85680.0*x^33.0-1.182384E7*x^67.0+8883108.0*x^36.0-294624.0*x^30.0-180.0*x^3.0-80.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "85680.0*33.0*x^32.0-67.0*x^66.0+8883108.0*36.0*x^35.0-294624.0*30.0*x^29.0-180.0*3.0*x^2.0-80.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[4] = "2827440.0*x^32.0-67.0*x^66.0+3.19791888E8*x^35.0-8838720.0*x^29.0-540.0*x^2.0-240.0*x^2.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/27417.0*x^39.0-1.0/10366.0*x^73.0+1.0/425.1851851851852*x^42.0-1.0/4760.0*x^36.0-1.0/2.0*x^3.0-1.0/336.0*x^9.0-1.0/756.0*x^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/27417.0/40.0*x^40.0-1.0/10366.0/74.0*x^74.0+1.0/425.1851851851852/43.0*x^43.0-1.0/4760.0/37.0*x^37.0-1.0/2.0/4.0*x^4.0-1.0/336.0/10.0*x^10.0-1.0/756.0/10.0*x^10.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/1096680.0*x^40.0-1.0/767084.0*x^74.0+1.0/18282.962962962964*x^43.0-1.0/176120.0*x^37.0-1.0/8.0*x^4.0-1.0/3360.0*x^10.0-1.0/7560.0*x^10.0";
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

public static void TestCaseDiff121282() {
 UsageCalculus.TestCase = 121282;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xy/3*xy^2*-1*xy^3*-3*xy3*x0^21*xy^3*-3*xy-3*xy/1*xy^2*-2*xy^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xy^33*xy/-1*xy^2-1*x0^2*-2*x0^3*3*x02*xy^3*3*xy/1*xy^2*--3*xy^33*xy1*x0^2*--3*x0^3-3*xy^3*1*xy/2*xy^21*xy/2*xy^2*-3*xy^3*-1*xy2*x0^22*xy/3*xy^23*x0^2*-1*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=281 EqnNumber=85 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[97, 85, 14, 15, 2, 3, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 3, 15, 2, 3, 1, 1, 15, 2, 3, 13, 2, 31, 16, 1, 10]"+
"// DOEMatrixRow=[94, 87, 17, 4, 2, 3, 1, 10, 2, 3, 4, 2, 3, 1, 1, 3, 1, 37, 6, 2, 3, 4, 3, 1, 2, 3, 1, 2, 4, 9, 2, 9, 5]"+
//Tail EqnIndex=281 EqnNumber=85 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[97, 85, 14, 15, 2, 3, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 3, 15, 2, 3, 1, 1, 15, 2, 3, 13, 2, 31, 16, 1, 10]"+
"// DOEMatrixRow=[94, 87, 17, 4, 2, 3, 1, 10, 2, 3, 4, 2, 3, 1, 1, 3, 1, 37, 6, 2, 3, 4, 3, 1, 2, 3, 1, 2, 4, 9, 2, 9, 5]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^21.0*6.0*xy^10.0-x0^2.0*x0*36.0*xy^70.0+x0^2.0*162.0*xy^39.0-x0^2.0*9.0*xy^33.0-x0^3.0*3.0+x0^22.0/1.3333333333333333*xy^55.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^21.0*6.0*10.0*xy^9.0-x0^2.0*x0*36.0*70.0*xy^69.0+x0^2.0*162.0*39.0*xy^38.0-x0^2.0*9.0*33.0*xy^32.0-x0^3.0*3.0*0.0+x0^22.0/1.3333333333333333*55.0*xy^54.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^21.0*60.0*xy^9.0-x0^2.0*x0*2520.0*xy^69.0+x0^2.0*6318.0*xy^38.0-x0^2.0*297.0*xy^32.0-x0^3.0*0.0+x0^22.0*41.25*xy^54.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^21.0*6.0*xy^10.0-x0^2.0*x0*36.0*xy^70.0+x0^2.0*162.0*xy^39.0-x0^2.0*9.0*xy^33.0-x0^3.0*3.0+x0^22.0/1.3333333333333333*xy^55.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^21.0*6.0/11.0*xy^11.0-x0^2.0*x0*36.0/71.0*xy^71.0+x0^2.0*162.0/40.0*xy^40.0-x0^2.0*9.0/34.0*xy^34.0-x0^3.0*xy+x0^22.0*1.3333333333333333/56.0*xy^56.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^21.0*0.5454545454545454*xy^11.0-x0^2.0*x0*0.5070422535211268*xy^71.0+x0^2.0*4.05*xy^40.0-x0^2.0*0.2647058823529412*xy^34.0-x0^3.0*xy+x0^22.0/42.0*xy^56.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^21.0*60.0*xy^9.0-x0^2.0*x0*2520.0*xy^69.0+x0^2.0*6318.0*xy^38.0-x0^2.0*297.0*xy^32.0-x0^3.0*0.0+x0^22.0*41.25*xy^54.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^21.0*60.0*9.0*xy^8.0-x0^2.0*x0*2520.0*69.0*xy^68.0+x0^2.0*6318.0*38.0*xy^37.0-x0^2.0*297.0*32.0*xy^31.0-x0^3.0*0.0*0.0+x0^22.0*41.25*54.0*xy^53.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^21.0*540.0*xy^8.0-x0^2.0*x0*173880.0*xy^68.0+x0^2.0*240084.0*xy^37.0-x0^2.0*9504.0*xy^31.0-x0^3.0*0.0+x0^22.0*2227.5*xy^53.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^21.0*0.5454545454545454*xy^11.0-x0^2.0*x0*0.5070422535211268*xy^71.0+x0^2.0*4.05*xy^40.0-x0^2.0*0.2647058823529412*xy^34.0-x0^3.0*xy+x0^22.0/42.0*xy^56.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^21.0*0.5454545454545454/12.0*xy^12.0-x0^2.0*x0*0.5070422535211268/72.0*xy^72.0+x0^2.0*4.05/41.0*xy^41.0-x0^2.0*0.2647058823529412/35.0*xy^35.0-x0^3.0/2.0*xy^2.0+x0^22.0*42.0/57.0*xy^57.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^21.0*0.04545454545454545*xy^12.0-x0^2.0*x0*0.007042253521126761*xy^72.0+x0^2.0*0.09878048780487804*xy^41.0-x0^2.0*0.007563025210084034*xy^35.0-x0^3.0/2.0*xy^2.0+x0^22.0/1.3571428571428572*xy^57.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^21.0*540.0*xy^8.0-x0^2.0*x0*173880.0*xy^68.0+x0^2.0*240084.0*xy^37.0-x0^2.0*9504.0*xy^31.0-x0^3.0*0.0+x0^22.0*2227.5*xy^53.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^21.0*540.0*8.0*xy^7.0-x0^2.0*x0*173880.0*68.0*xy^67.0+x0^2.0*240084.0*37.0*xy^36.0-x0^2.0*9504.0*31.0*xy^30.0-x0^3.0*0.0*0.0+x0^22.0*2227.5*53.0*xy^52.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^21.0*4320.0*xy^7.0-x0^2.0*x0*1.182384E7*xy^67.0+x0^2.0*8883108.0*xy^36.0-x0^2.0*294624.0*xy^30.0-x0^3.0*0.0+x0^22.0*118057.5*xy^52.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^21.0*0.04545454545454545*xy^12.0-x0^2.0*x0*0.007042253521126761*xy^72.0+x0^2.0*0.09878048780487804*xy^41.0-x0^2.0*0.007563025210084034*xy^35.0-x0^3.0/2.0*xy^2.0+x0^22.0/1.3571428571428572*xy^57.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^21.0*0.04545454545454545/13.0*xy^13.0-x0^2.0*x0*0.007042253521126761/73.0*xy^73.0+x0^2.0*0.09878048780487804/42.0*xy^42.0-x0^2.0*0.007563025210084034/36.0*xy^36.0-x0^3.0/2.0/3.0*xy^3.0+x0^22.0*1.3571428571428572/58.0*xy^58.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^21.0*0.003496503496503496*xy^13.0-x0^2.0*x0*9.646922631680494E-5*xy^73.0+x0^2.0*0.00235191637630662*xy^42.0-x0^2.0*2.100840336134454E-4*xy^36.0-x0^3.0*0.16666666666666666*xy^3.0+x0^22.0/42.73684210526316*xy^58.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^21.0*4320.0*xy^7.0-x0^2.0*x0*1.182384E7*xy^67.0+x0^2.0*8883108.0*xy^36.0-x0^2.0*294624.0*xy^30.0-x0^3.0*0.0+x0^22.0*118057.5*xy^52.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^21.0*4320.0*7.0*xy^6.0-x0^2.0*x0*1.182384E7*67.0*xy^66.0+x0^2.0*8883108.0*36.0*xy^35.0-x0^2.0*294624.0*30.0*xy^29.0-x0^3.0*0.0*0.0+x0^22.0*118057.5*52.0*xy^51.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^21.0*30240.0*xy^6.0-x0^2.0*x0*7.9219728E8*xy^66.0+x0^2.0*3.19791888E8*xy^35.0-x0^2.0*8838720.0*xy^29.0-x0^3.0*0.0+x0^22.0*6138990.0*xy^51.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^21.0*0.003496503496503496*xy^13.0-x0^2.0*x0*9.646922631680494E-5*xy^73.0-5.0*xy^73.0+x0^2.0*0.00235191637630662*xy^42.0-x0^2.0*2.100840336134454E-4*xy^36.0-4.0*xy^36.0-x0^3.0*0.16666666666666666*xy^3.0+x0^22.0/42.73684210526316*xy^58.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^21.0*0.003496503496503496/14.0*xy^14.0-x0^2.0*x0*9.646922631680494E-5/74.0*xy^74.0-5.0/74.0*xy^74.0+x0^2.0*0.00235191637630662/43.0*xy^43.0-x0^2.0*2.100840336134454E-4/37.0*xy^37.0-4.0/37.0*xy^37.0-x0^3.0*0.16666666666666666/4.0*xy^4.0+x0^22.0*42.73684210526316/59.0*xy^59.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^21.0*2.497502497502497E-4*xy^14.0-x0^2.0*x0/767084.0*xy^74.0-1.0/14.8*xy^74.0-0.06756756756756757*xy^74.0+x0^2.0*5.46957296815493E-5*xy^43.0-x0^2.0/176120.0*xy^37.0-1.0/9.25*xy^37.0-0.10810810810810811*xy^37.0-x0^3.0*0.041666666666666664*xy^4.0+x0^22.0/1.3805418719211824*xy^59.0";
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

public static void TestCaseDiff121283() {
 UsageCalculus.TestCase = 121283;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*x0^21*xyz^3*-3*xyz-3*xyz/1*xyz^2*-2*xyz^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyz^33*xyz/-1*xyz^2-1*x0^2*-2*x0^3*3*x02*xyz^3*3*xyz/1*xyz^2*--3*xyz^33*xyz1*x0^2*--3*x0^3-3*xyz^3*1*xyz/2*xyz^21*xyz/2*xyz^2*-3*xyz^3*-1*xyz2*x0^22*xyz^3*-3*xyz-3*xyz/1*xyz^2*-2*xyz^33*x0^2*-1*x0^31*xyz^3*-3*xyz";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=282 EqnNumber=86 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[61, 86, 15, 16, 3, 1, 2, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 5, 3, 4, 16, 3, 1, 2, 3, 16, 3, 4, 14, 3, 32, 1, 2, 11]"+
"// DOEMatrixRow=[58, 88, 18, 1, 3, 1, 2, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 38, 7, 3, 1, 5, 1, 2, 3, 4, 2, 3, 1, 10, 1, 10, 6]"+
//Tail EqnIndex=282 EqnNumber=86 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[61, 86, 15, 16, 3, 1, 2, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 5, 3, 4, 16, 3, 1, 2, 3, 16, 3, 4, 14, 3, 32, 1, 2, 11]"+
"// DOEMatrixRow=[58, 88, 18, 1, 3, 1, 2, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 38, 7, 3, 1, 5, 1, 2, 3, 4, 2, 3, 1, 10, 1, 10, 6]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^21.0*9.0*xyz^4.0-x0^2.0*x0*36.0*xyz^70.0+x0^2.0*162.0*xyz^39.0-x0^2.0*9.0*xyz^33.0-x0^3.0*3.0+x0^22.0*6.75*xyz^35.0+x0^2.0*18.0*xyz^40.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^21.0*9.0*4.0*xyz^3.0-x0^2.0*x0*36.0*70.0*xyz^69.0+x0^2.0*162.0*39.0*xyz^38.0-x0^2.0*9.0*33.0*xyz^32.0-x0^3.0*3.0*0.0+x0^22.0*6.75*35.0*xyz^34.0+x0^2.0*18.0*40.0*xyz^39.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^21.0*36.0*xyz^3.0-x0^2.0*x0*2520.0*xyz^69.0+x0^2.0*6318.0*xyz^38.0-x0^2.0*297.0*xyz^32.0-x0^3.0*0.0+x0^22.0*236.25*xyz^34.0+x0^2.0*720.0*xyz^39.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^21.0*9.0*xyz^4.0-x0^2.0*x0*36.0*xyz^70.0+x0^2.0*162.0*xyz^39.0-x0^2.0*9.0*xyz^33.0-x0^3.0*3.0+x0^22.0*6.75*xyz^35.0+x0^2.0*18.0*xyz^40.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^21.0*9.0/5.0*xyz^5.0-x0^2.0*x0*36.0/71.0*xyz^71.0+x0^2.0*162.0/40.0*xyz^40.0-x0^2.0*9.0/34.0*xyz^34.0-x0^3.0*xyz+x0^22.0*6.75/36.0*xyz^36.0+x0^2.0*18.0/41.0*xyz^41.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^21.0*1.8*xyz^5.0-x0^2.0*x0*0.5070422535211268*xyz^71.0+x0^2.0*4.05*xyz^40.0-x0^2.0*0.2647058823529412*xyz^34.0-x0^3.0*xyz+x0^22.0*0.1875*xyz^36.0+x0^2.0/2.2777777777777777*xyz^41.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^21.0*36.0*xyz^3.0-x0^2.0*x0*2520.0*xyz^69.0+x0^2.0*6318.0*xyz^38.0-x0^2.0*297.0*xyz^32.0-x0^3.0*0.0+x0^22.0*236.25*xyz^34.0+x0^2.0*720.0*xyz^39.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^21.0*36.0*3.0*xyz^2.0-x0^2.0*x0*2520.0*69.0*xyz^68.0+x0^2.0*6318.0*38.0*xyz^37.0-x0^2.0*297.0*32.0*xyz^31.0-x0^3.0*0.0*0.0+x0^22.0*236.25*34.0*xyz^33.0+x0^2.0*720.0*39.0*xyz^38.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^21.0*108.0*xyz^2.0-x0^2.0*x0*173880.0*xyz^68.0+x0^2.0*240084.0*xyz^37.0-x0^2.0*9504.0*xyz^31.0-x0^3.0*0.0+x0^22.0*8032.5*xyz^33.0+x0^2.0*28080.0*xyz^38.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^21.0*1.8*xyz^5.0-x0^2.0*x0*0.5070422535211268*xyz^71.0+x0^2.0*4.05*xyz^40.0-x0^2.0*0.2647058823529412*xyz^34.0-x0^3.0*xyz+x0^22.0*0.1875*xyz^36.0+x0^2.0/2.2777777777777777*xyz^41.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^21.0*1.8/6.0*xyz^6.0-x0^2.0*x0*0.5070422535211268/72.0*xyz^72.0+x0^2.0*4.05/41.0*xyz^41.0-x0^2.0*0.2647058823529412/35.0*xyz^35.0-x0^3.0/2.0*xyz^2.0+x0^22.0*0.1875/37.0*xyz^37.0+x0^2.0*2.2777777777777777/42.0*xyz^42.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^21.0*0.3*xyz^6.0-x0^2.0*x0*0.007042253521126761*xyz^72.0+x0^2.0*0.09878048780487804*xyz^41.0-x0^2.0*0.007563025210084034*xyz^35.0-x0^3.0/2.0*xyz^2.0+x0^22.0*0.005067567567567568*xyz^37.0+x0^2.0/18.439024390243905*xyz^42.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^21.0*108.0*xyz^2.0-x0^2.0*x0*173880.0*xyz^68.0+x0^2.0*240084.0*xyz^37.0-x0^2.0*9504.0*xyz^31.0-x0^3.0*0.0+x0^22.0*8032.5*xyz^33.0+x0^2.0*28080.0*xyz^38.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^21.0*108.0*2.0*xyz^1.0-x0^2.0*x0*173880.0*68.0*xyz^67.0+x0^2.0*240084.0*37.0*xyz^36.0-x0^2.0*9504.0*31.0*xyz^30.0-x0^3.0*0.0*0.0+x0^22.0*8032.5*33.0*xyz^32.0+x0^2.0*28080.0*38.0*xyz^37.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^21.0*216.0*xyz-x0^2.0*x0*1.182384E7*xyz^67.0+x0^2.0*8883108.0*xyz^36.0-x0^2.0*294624.0*xyz^30.0-x0^3.0*0.0+x0^22.0*265072.5*xyz^32.0+x0^2.0*1067040.0*xyz^37.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^21.0*0.3*xyz^6.0-x0^2.0*x0*0.007042253521126761*xyz^72.0+x0^2.0*0.09878048780487804*xyz^41.0-x0^2.0*0.007563025210084034*xyz^35.0-x0^3.0/2.0*xyz^2.0+x0^22.0*0.005067567567567568*xyz^37.0+x0^2.0/18.439024390243905*xyz^42.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^21.0*0.3/7.0*xyz^7.0-x0^2.0*x0*0.007042253521126761/73.0*xyz^73.0+x0^2.0*0.09878048780487804/42.0*xyz^42.0-x0^2.0*0.007563025210084034/36.0*xyz^36.0-x0^3.0/2.0/3.0*xyz^3.0+x0^22.0*0.005067567567567568/38.0*xyz^38.0+x0^2.0*18.439024390243905/43.0*xyz^43.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^21.0*0.04285714285714286*xyz^7.0-x0^2.0*x0*9.646922631680494E-5*xyz^73.0+x0^2.0*0.00235191637630662*xyz^42.0-x0^2.0*2.100840336134454E-4*xyz^36.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^22.0*1.333570412517781E-4*xyz^38.0+x0^2.0/2.332010582010582*xyz^43.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^21.0*216.0*xyz-x0^2.0*x0*1.182384E7*xyz^67.0+x0^2.0*8883108.0*xyz^36.0-x0^2.0*294624.0*xyz^30.0-x0^3.0*0.0+x0^22.0*265072.5*xyz^32.0+x0^2.0*1067040.0*xyz^37.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^21.0*216.0-x0^2.0*x0*1.182384E7*67.0*xyz^66.0+x0^2.0*8883108.0*36.0*xyz^35.0-x0^2.0*294624.0*30.0*xyz^29.0-x0^3.0*0.0*0.0+x0^22.0*265072.5*32.0*xyz^31.0+x0^2.0*1067040.0*37.0*xyz^36.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^21.0*216.0-x0^2.0*x0*7.9219728E8*xyz^66.0+x0^2.0*3.19791888E8*xyz^35.0-x0^2.0*8838720.0*xyz^29.0-x0^3.0*0.0+x0^22.0*8482320.0*xyz^31.0+x0^2.0*3.948048E7*xyz^36.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^21.0*0.04285714285714286*xyz^7.0-x0^2.0*x0*9.646922631680494E-5*xyz^73.0-5.0*xyz^73.0+x0^2.0*0.00235191637630662*xyz^42.0-x0^2.0*2.100840336134454E-4*xyz^36.0-4.0*xyz^36.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^22.0*1.333570412517781E-4*xyz^38.0-4.0*xyz^38.0+x0^2.0/2.332010582010582*xyz^43.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^21.0*0.04285714285714286/8.0*xyz^8.0-x0^2.0*x0*9.646922631680494E-5/74.0*xyz^74.0-5.0/74.0*xyz^74.0+x0^2.0*0.00235191637630662/43.0*xyz^43.0-x0^2.0*2.100840336134454E-4/37.0*xyz^37.0-4.0/37.0*xyz^37.0-x0^3.0*0.16666666666666666/4.0*xyz^4.0+x0^22.0*1.333570412517781E-4/39.0*xyz^39.0-4.0/39.0*xyz^39.0+x0^2.0*2.332010582010582/44.0*xyz^44.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^21.0*0.005357142857142857*xyz^8.0-x0^2.0*x0/767084.0*xyz^74.0-1.0/14.8*xyz^74.0-0.06756756756756757*xyz^74.0+x0^2.0*5.46957296815493E-5*xyz^43.0-x0^2.0/176120.0*xyz^37.0-1.0/9.25*xyz^37.0-0.10810810810810811*xyz^37.0-x0^3.0*0.041666666666666664*xyz^4.0+x0^22.0/292448.0*xyz^39.0-1.0/9.75*xyz^39.0-0.10256410256410256*xyz^39.0+x0^2.0/18.86783891094725*xyz^44.0";
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

public static void TestCaseDiff121284() {
 UsageCalculus.TestCase = 121284;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xyza^3*-3*xyza-3*xyza/1*xyza^2*-2*xyza^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyza^33*xyza/-1*xyza^2-1*x0^2*-2*x0^3*3*x02*xyza^3*3*xyza/1*xyza^2*--3*xyza^33*xyza1*x0^2*--3*x0^3-3*xyza^3*1*xyza/2*xyza^21*xyza/2*xyza^2*-3*xyza^3*-1*xyza2*x0^22*xyza^3*-3*xyza-3*xyza/1*xyza^2*-2*xyza^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyza^31*xyza^3*-3*xyza-3*xyza/1*xyza^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=283 EqnNumber=87 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[26, 87, 16, 17, 4, 2, 3, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 1, 1, 1, 1, 1, 2, 3, 4, 1, 1, 1, 15, 4, 1, 2, 3, 12]"+
"// DOEMatrixRow=[22, 89, 19, 2, 1, 2, 3, 2, 1, 1, 2, 1, 2, 3, 4, 2, 3, 39, 8, 1, 2, 1, 2, 3, 4, 1, 3, 1, 2, 11, 2, 11, 7]"+
//Tail EqnIndex=283 EqnNumber=87 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[26, 87, 16, 17, 4, 2, 3, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 1, 1, 1, 1, 1, 2, 3, 4, 1, 1, 1, 15, 4, 1, 2, 3, 12]"+
"// DOEMatrixRow=[22, 89, 19, 2, 1, 2, 3, 2, 1, 1, 2, 1, 2, 3, 4, 2, 3, 39, 8, 1, 2, 1, 2, 3, 4, 1, 3, 1, 2, 11, 2, 11, 7]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-3.0*xyza^4.0-x0^2.0*x0*36.0*xyza^70.0+x0^2.0*162.0*xyza^39.0-x0^2.0*9.0*xyza^33.0-x0^3.0*3.0+x0^22.0*6.75*xyza^35.0-x0^2.0*x0*108.0*xyza^69.0-3.0*xyza^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-3.0*4.0*xyza^3.0-x0^2.0*x0*36.0*70.0*xyza^69.0+x0^2.0*162.0*39.0*xyza^38.0-x0^2.0*9.0*33.0*xyza^32.0-x0^3.0*3.0*0.0+x0^22.0*6.75*35.0*xyza^34.0-x0^2.0*x0*108.0*69.0*xyza^68.0-3.0*3.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-12.0*xyza^3.0-x0^2.0*x0*2520.0*xyza^69.0+x0^2.0*6318.0*xyza^38.0-x0^2.0*297.0*xyza^32.0-x0^3.0*0.0+x0^22.0*236.25*xyza^34.0-x0^2.0*x0*7452.0*xyza^68.0-9.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-3.0*xyza^4.0-x0^2.0*x0*36.0*xyza^70.0+x0^2.0*162.0*xyza^39.0-x0^2.0*9.0*xyza^33.0-x0^3.0*3.0+x0^22.0*6.75*xyza^35.0-x0^2.0*x0*108.0*xyza^69.0-3.0*xyza^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-3.0/5.0*xyza^5.0-x0^2.0*x0*36.0/71.0*xyza^71.0+x0^2.0*162.0/40.0*xyza^40.0-x0^2.0*9.0/34.0*xyza^34.0-x0^3.0*xyza+x0^22.0*6.75/36.0*xyza^36.0-x0^2.0*x0*108.0/70.0*xyza^70.0-3.0/4.0*xyza^4.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-0.6*xyza^5.0-x0^2.0*x0*0.5070422535211268*xyza^71.0+x0^2.0*4.05*xyza^40.0-x0^2.0*0.2647058823529412*xyza^34.0-x0^3.0*xyza+x0^22.0*0.1875*xyza^36.0-x0^2.0*x0*1.542857142857143*xyza^70.0-1.0/1.3333333333333333*xyza^4.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-12.0*xyza^3.0-x0^2.0*x0*2520.0*xyza^69.0+x0^2.0*6318.0*xyza^38.0-x0^2.0*297.0*xyza^32.0-x0^3.0*0.0+x0^22.0*236.25*xyza^34.0-x0^2.0*x0*7452.0*xyza^68.0-9.0*xyza^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-12.0*3.0*xyza^2.0-x0^2.0*x0*2520.0*69.0*xyza^68.0+x0^2.0*6318.0*38.0*xyza^37.0-x0^2.0*297.0*32.0*xyza^31.0-x0^3.0*0.0*0.0+x0^22.0*236.25*34.0*xyza^33.0-x0^2.0*x0*7452.0*68.0*xyza^67.0-9.0*2.0*xyza^1.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-36.0*xyza^2.0-x0^2.0*x0*173880.0*xyza^68.0+x0^2.0*240084.0*xyza^37.0-x0^2.0*9504.0*xyza^31.0-x0^3.0*0.0+x0^22.0*8032.5*xyza^33.0-x0^2.0*x0*506736.0*xyza^67.0-18.0*xyza";
 UsageCalculus.EqnSolArrayMap3[2] = "-0.6*xyza^5.0-x0^2.0*x0*0.5070422535211268*xyza^71.0+x0^2.0*4.05*xyza^40.0-x0^2.0*0.2647058823529412*xyza^34.0-x0^3.0*xyza+x0^22.0*0.1875*xyza^36.0-x0^2.0*x0*1.542857142857143*xyza^70.0-1.0/1.3333333333333333*xyza^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-0.6/6.0*xyza^6.0-x0^2.0*x0*0.5070422535211268/72.0*xyza^72.0+x0^2.0*4.05/41.0*xyza^41.0-x0^2.0*0.2647058823529412/35.0*xyza^35.0-x0^3.0/2.0*xyza^2.0+x0^22.0*0.1875/37.0*xyza^37.0-x0^2.0*x0*1.542857142857143/71.0*xyza^71.0-1.0/1.3333333333333333/5.0*xyza^5.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-0.09999999999999999*xyza^6.0-x0^2.0*x0*0.007042253521126761*xyza^72.0+x0^2.0*0.09878048780487804*xyza^41.0-x0^2.0*0.007563025210084034*xyza^35.0-x0^3.0/2.0*xyza^2.0+x0^22.0*0.005067567567567568*xyza^37.0-x0^2.0*x0/46.01851851851852*xyza^71.0-1.0/6.666666666666666*xyza^5.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-36.0*xyza^2.0-x0^2.0*x0*173880.0*xyza^68.0+x0^2.0*240084.0*xyza^37.0-x0^2.0*9504.0*xyza^31.0-x0^3.0*0.0+x0^22.0*8032.5*xyza^33.0-x0^2.0*x0*506736.0*xyza^67.0-18.0*xyza";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-36.0*2.0*xyza^1.0-x0^2.0*x0*173880.0*68.0*xyza^67.0+x0^2.0*240084.0*37.0*xyza^36.0-x0^2.0*9504.0*31.0*xyza^30.0-x0^3.0*0.0*0.0+x0^22.0*8032.5*33.0*xyza^32.0-x0^2.0*x0*506736.0*67.0*xyza^66.0-18.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-72.0*xyza-x0^2.0*x0*1.182384E7*xyza^67.0+x0^2.0*8883108.0*xyza^36.0-x0^2.0*294624.0*xyza^30.0-x0^3.0*0.0+x0^22.0*265072.5*xyza^32.0-x0^2.0*x0*3.3951312E7*xyza^66.0-18.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-0.09999999999999999*xyza^6.0-x0^2.0*x0*0.007042253521126761*xyza^72.0+x0^2.0*0.09878048780487804*xyza^41.0-x0^2.0*0.007563025210084034*xyza^35.0-x0^3.0/2.0*xyza^2.0+x0^22.0*0.005067567567567568*xyza^37.0-x0^2.0*x0/46.01851851851852*xyza^71.0-1.0/6.666666666666666*xyza^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-0.09999999999999999/7.0*xyza^7.0-x0^2.0*x0*0.007042253521126761/73.0*xyza^73.0+x0^2.0*0.09878048780487804/42.0*xyza^42.0-x0^2.0*0.007563025210084034/36.0*xyza^36.0-x0^3.0/2.0/3.0*xyza^3.0+x0^22.0*0.005067567567567568/38.0*xyza^38.0-x0^2.0*x0/46.01851851851852/72.0*xyza^72.0-1.0/6.666666666666666/6.0*xyza^6.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-0.014285714285714285*xyza^7.0-x0^2.0*x0*9.646922631680494E-5*xyza^73.0+x0^2.0*0.00235191637630662*xyza^42.0-x0^2.0*2.100840336134454E-4*xyza^36.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^22.0*1.333570412517781E-4*xyza^38.0-x0^2.0*x0/3313.3333333333335*xyza^72.0-1.0/40.0*xyza^6.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-72.0*xyza-x0^2.0*x0*1.182384E7*xyza^67.0+x0^2.0*8883108.0*xyza^36.0-x0^2.0*294624.0*xyza^30.0-x0^3.0*0.0+x0^22.0*265072.5*xyza^32.0-x0^2.0*x0*3.3951312E7*xyza^66.0-18.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-72.0-x0^2.0*x0*1.182384E7*67.0*xyza^66.0+x0^2.0*8883108.0*36.0*xyza^35.0-x0^2.0*294624.0*30.0*xyza^29.0-x0^3.0*0.0*0.0+x0^22.0*265072.5*32.0*xyza^31.0-x0^2.0*x0*3.3951312E7*66.0*xyza^65.0-18.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-72.0-x0^2.0*x0*7.9219728E8*xyza^66.0+x0^2.0*3.19791888E8*xyza^35.0-x0^2.0*8838720.0*xyza^29.0-x0^3.0*0.0+x0^22.0*8482320.0*xyza^31.0-x0^2.0*x0*2.240786592E9*xyza^65.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-0.014285714285714285*xyza^7.0-x0^2.0*x0*9.646922631680494E-5*xyza^73.0-5.0*xyza^73.0+x0^2.0*0.00235191637630662*xyza^42.0-x0^2.0*2.100840336134454E-4*xyza^36.0-4.0*xyza^36.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^22.0*1.333570412517781E-4*xyza^38.0-4.0*xyza^38.0-x0^2.0*x0/3313.3333333333335*xyza^72.0-1.0/40.0*xyza^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-0.014285714285714285/8.0*xyza^8.0-x0^2.0*x0*9.646922631680494E-5/74.0*xyza^74.0-5.0/74.0*xyza^74.0+x0^2.0*0.00235191637630662/43.0*xyza^43.0-x0^2.0*2.100840336134454E-4/37.0*xyza^37.0-4.0/37.0*xyza^37.0-x0^3.0*0.16666666666666666/4.0*xyza^4.0+x0^22.0*1.333570412517781E-4/39.0*xyza^39.0-4.0/39.0*xyza^39.0-x0^2.0*x0/3313.3333333333335/73.0*xyza^73.0-1.0/40.0/7.0*xyza^7.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-0.0017857142857142857*xyza^8.0-x0^2.0*x0/767084.0*xyza^74.0-1.0/14.8*xyza^74.0-0.06756756756756757*xyza^74.0+x0^2.0*5.46957296815493E-5*xyza^43.0-x0^2.0/176120.0*xyza^37.0-1.0/9.25*xyza^37.0-0.10810810810810811*xyza^37.0-x0^3.0*0.041666666666666664*xyza^4.0+x0^22.0/292448.0*xyza^39.0-1.0/9.75*xyza^39.0-0.10256410256410256*xyza^39.0-x0^2.0*x0/241873.33333333334*xyza^73.0-1.0/280.0*xyza^7.0";
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

public static void TestCaseDiff121285() {
 UsageCalculus.TestCase = 121285;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*x/1*x^2*-2*x^31*x0^2*-2*x0^3*3*x0/-1*x0^22*x^33*x/-1*x^2-1*x0^2*-2*x0^3*3*x02*x^3*3*x/1*x^2*--3*x^33*x1*x0^2*--3*x0^3-3*x^3*1*x/2*x^21*x/2*x^2*-3*x^3*-1*x2*x0^22*x^3*-3*x-3*x/1*x^2*-2*x^31*x0^2*-2*x0^3*3*x0/-1*x0^22*x^33*x/-1*x^2-1*x0^2*-2*x0^3*3*x0-3*x/1*x^21*x0^2*-2*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=284 EqnNumber=88 FamilyID=1 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[92, 88, 17, 18, 1, 3, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 1, 2, 3, 2, 16, 1, 2, 3, 4, 13]"+
"// DOEMatrixRow=[89, 90, 20, 3, 2, 3, 1, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 40, 9, 2, 3, 2, 3, 1, 5, 2, 1, 2, 3, 12, 1, 12, 8]"+
//Tail EqnIndex=284 EqnNumber=88 FamilyID=1 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[92, 88, 17, 18, 1, 3, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 1, 2, 3, 2, 16, 1, 2, 3, 4, 13]"+
"// DOEMatrixRow=[89, 90, 20, 3, 2, 3, 1, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 40, 9, 2, 3, 2, 3, 1, 5, 2, 1, 2, 3, 12, 1, 12, 8]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-36.0*x^70.0+162.0*x^39.0-9.0*x^33.0-3.0+6.75*x^35.0-36.0*x^70.0+6.0+6.0*x^22.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-36.0*70.0*x^69.0+162.0*39.0*x^38.0-9.0*33.0*x^32.0-3.0*0.0+6.75*35.0*x^34.0-36.0*70.0*x^69.0+6.0*0.0+6.0*22.0*x^21.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-2520.0*x^69.0+6318.0*x^38.0-297.0*x^32.0+236.25*x^34.0-2520.0*x^69.0+132.0*x^21.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-36.0*x^70.0+162.0*x^39.0-9.0*x^33.0-3.0+6.75*x^35.0-36.0*x^70.0+6.0+6.0*x^22.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-36.0/71.0*x^71.0+162.0/40.0*x^40.0-9.0/34.0*x^34.0-3.0*x+6.75/36.0*x^36.0-36.0/71.0*x^71.0+6.0*x+6.0/23.0*x^23.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/1.9722222222222223*x^71.0+4.05*x^40.0-1.0/3.7777777777777777*x^34.0-3.0*x+1.0/5.333333333333333*x^36.0-1.0/1.9722222222222223*x^71.0+6.0*x+1.0/3.8333333333333335*x^23.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-2520.0*x^69.0+6318.0*x^38.0-297.0*x^32.0+236.25*x^34.0-2520.0*x^69.0+132.0*x^21.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-2520.0*69.0*x^68.0+6318.0*38.0*x^37.0-297.0*32.0*x^31.0+236.25*34.0*x^33.0-2520.0*69.0*x^68.0+132.0*21.0*x^20.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-173880.0*x^68.0+240084.0*x^37.0-9504.0*x^31.0+8032.5*x^33.0-173880.0*x^68.0+2772.0*x^20.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/1.9722222222222223*x^71.0+4.05*x^40.0-1.0/3.7777777777777777*x^34.0-3.0*x+1.0/5.333333333333333*x^36.0-1.0/1.9722222222222223*x^71.0+6.0*x+1.0/3.8333333333333335*x^23.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/1.9722222222222223/72.0*x^72.0+4.05/41.0*x^41.0-1.0/3.7777777777777777/35.0*x^35.0-3.0/2.0*x^2.0+1.0/5.333333333333333/37.0*x^37.0-1.0/1.9722222222222223/72.0*x^72.0+6.0/2.0*x^2.0+1.0/3.8333333333333335/24.0*x^24.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/142.0*x^72.0+1.0/10.123456790123457*x^41.0-1.0/132.22222222222223*x^35.0-1.5*x^2.0+1.0/197.33333333333331*x^37.0-1.0/142.0*x^72.0+3.0*x^2.0+1.0/92.0*x^24.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-173880.0*x^68.0+240084.0*x^37.0-9504.0*x^31.0+8032.5*x^33.0-173880.0*x^68.0+2772.0*x^20.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-173880.0*68.0*x^67.0+240084.0*37.0*x^36.0-9504.0*31.0*x^30.0+8032.5*33.0*x^32.0-173880.0*68.0*x^67.0+2772.0*20.0*x^19.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-1.182384E7*x^67.0+8883108.0*x^36.0-294624.0*x^30.0+265072.5*x^32.0-1.182384E7*x^67.0+55440.0*x^19.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/142.0*x^72.0+1.0/10.123456790123457*x^41.0-1.0/132.22222222222223*x^35.0-1.5*x^2.0+1.0/197.33333333333331*x^37.0-1.0/142.0*x^72.0+3.0*x^2.0+1.0/92.0*x^24.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/142.0/73.0*x^73.0+1.0/10.123456790123457/42.0*x^42.0-1.0/132.22222222222223/36.0*x^36.0-1.5/3.0*x^3.0+1.0/197.33333333333331/38.0*x^38.0-1.0/142.0/73.0*x^73.0+3.0/3.0*x^3.0+1.0/92.0/25.0*x^25.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/10366.0*x^73.0+1.0/425.1851851851852*x^42.0-1.0/4760.0*x^36.0-1.0/2.0*x^3.0+1.0/7498.666666666666*x^38.0-1.0/10366.0*x^73.0+x^3.0+1.0/2300.0*x^25.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-1.182384E7*x^67.0+8883108.0*x^36.0-294624.0*x^30.0+265072.5*x^32.0-1.182384E7*x^67.0+55440.0*x^19.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-67.0*x^66.0+8883108.0*36.0*x^35.0-294624.0*30.0*x^29.0+265072.5*32.0*x^31.0-67.0*x^66.0+55440.0*19.0*x^18.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-67.0*x^66.0+3.19791888E8*x^35.0-8838720.0*x^29.0+8482320.0*x^31.0-67.0*x^66.0+1053360.0*x^18.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/10366.0*x^73.0+1.0/425.1851851851852*x^42.0-1.0/4760.0*x^36.0-1.0/2.0*x^3.0+1.0/7498.666666666666*x^38.0-9.646922631680494E-5*x^73.0+x^3.0+1.0/2300.0*x^25.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/10366.0/74.0*x^74.0+1.0/425.1851851851852/43.0*x^43.0-1.0/4760.0/37.0*x^37.0-1.0/2.0/4.0*x^4.0+1.0/7498.666666666666/39.0*x^39.0-9.646922631680494E-5/74.0*x^74.0+1.0/4.0*x^4.0+1.0/2300.0/26.0*x^26.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/767084.0*x^74.0+1.0/18282.962962962964*x^43.0-1.0/176120.0*x^37.0-1.0/8.0*x^4.0+1.0/292448.0*x^39.0-1.0/767084.0*x^74.0-1.0/14.8*x^74.0+1.0/4.0*x^4.0+1.0/59800.0*x^26.0";
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

public static void TestCaseDiff121286() {
 UsageCalculus.TestCase = 121286;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x0^2*-2*x0^3*3*x0/-1*x0^22*xy^33*xy/-1*xy^2-1*x0^2*-2*x0^3*3*x02*xy^3*3*xy/1*xy^2*--3*xy^33*xy1*x0^2*--3*x0^3-3*xy^3*1*xy/2*xy^21*xy/2*xy^2*-3*xy^3*-1*xy2*x0^22*xy^3*-3*xy-3*xy/1*xy^2*-2*xy^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xy^33*xy/-1*xy^2-1*x0^2*-2*x0^3*3*x02*xy^3*3*xy/1*xy^2*--3*xy^33*xy1*x0^2*-2*x0^32*xy^3*3*xy";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=285 EqnNumber=89 FamilyID=3 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[56, 89, 18, 19, 2, 1, 2, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 3, 4, 3, 1, 2, 3, 2, 3, 1, 3, 1, 2, 3, 4, 5, 14]"+
"// DOEMatrixRow=[53, 91, 1, 4, 3, 1, 2, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 41, 10, 3, 1, 3, 1, 2, 6, 3, 2, 3, 4, 13, 2, 13, 9]"+
//Tail EqnIndex=285 EqnNumber=89 FamilyID=3 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[56, 89, 18, 19, 2, 1, 2, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 3, 4, 3, 1, 2, 3, 2, 3, 1, 3, 1, 2, 3, 4, 5, 14]"+
"// DOEMatrixRow=[53, 91, 1, 4, 3, 1, 2, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 41, 10, 3, 1, 3, 1, 2, 6, 3, 2, 3, 4, 13, 2, 13, 9]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^2.0*x0*6.0*xy^36.0+x0^2.0*162.0*xy^39.0-x0^2.0*9.0*xy^33.0-x0^3.0*3.0+x0^22.0*6.75*xy^35.0-x0^2.0*x0*36.0*xy^70.0+x0^2.0*324.0*xy^43.0+x0^2.0*18.0*xy^37.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^2.0*x0*6.0*36.0*xy^35.0+x0^2.0*162.0*39.0*xy^38.0-x0^2.0*9.0*33.0*xy^32.0-x0^3.0*3.0*0.0+x0^22.0*6.75*35.0*xy^34.0-x0^2.0*x0*36.0*70.0*xy^69.0+x0^2.0*324.0*43.0*xy^42.0+x0^2.0*18.0*37.0*xy^36.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^2.0*x0*216.0*xy^35.0+x0^2.0*6318.0*xy^38.0-x0^2.0*297.0*xy^32.0-x0^3.0*0.0+x0^22.0*236.25*xy^34.0-x0^2.0*x0*2520.0*xy^69.0+x0^2.0*13932.0*xy^42.0+x0^2.0*666.0*xy^36.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^2.0*x0*6.0*xy^36.0+x0^2.0*162.0*xy^39.0-x0^2.0*9.0*xy^33.0-x0^3.0*3.0+x0^22.0*6.75*xy^35.0-x0^2.0*x0*36.0*xy^70.0+x0^2.0*324.0*xy^43.0+x0^2.0*18.0*xy^37.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^2.0*x0*6.0/37.0*xy^37.0+x0^2.0*162.0/40.0*xy^40.0-x0^2.0*9.0/34.0*xy^34.0-x0^3.0*xy+x0^22.0*6.75/36.0*xy^36.0-x0^2.0*x0*36.0/71.0*xy^71.0+x0^2.0*324.0/44.0*xy^44.0+x0^2.0*18.0/38.0*xy^38.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^2.0*x0*0.16216216216216217*xy^37.0+x0^2.0*4.05*xy^40.0-x0^2.0*0.2647058823529412*xy^34.0-x0^3.0*xy+x0^22.0*0.1875*xy^36.0-x0^2.0*x0*0.5070422535211268*xy^71.0+x0^2.0*7.363636363636363*xy^44.0+x0^2.0/2.111111111111111*xy^38.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^2.0*x0*216.0*xy^35.0+x0^2.0*6318.0*xy^38.0-x0^2.0*297.0*xy^32.0-x0^3.0*0.0+x0^22.0*236.25*xy^34.0-x0^2.0*x0*2520.0*xy^69.0+x0^2.0*13932.0*xy^42.0+x0^2.0*666.0*xy^36.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^2.0*x0*216.0*35.0*xy^34.0+x0^2.0*6318.0*38.0*xy^37.0-x0^2.0*297.0*32.0*xy^31.0-x0^3.0*0.0*0.0+x0^22.0*236.25*34.0*xy^33.0-x0^2.0*x0*2520.0*69.0*xy^68.0+x0^2.0*13932.0*42.0*xy^41.0+x0^2.0*666.0*36.0*xy^35.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^2.0*x0*7560.0*xy^34.0+x0^2.0*240084.0*xy^37.0-x0^2.0*9504.0*xy^31.0-x0^3.0*0.0+x0^22.0*8032.5*xy^33.0-x0^2.0*x0*173880.0*xy^68.0+x0^2.0*585144.0*xy^41.0+x0^2.0*23976.0*xy^35.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^2.0*x0*0.16216216216216217*xy^37.0+x0^2.0*4.05*xy^40.0-x0^2.0*0.2647058823529412*xy^34.0-x0^3.0*xy+x0^22.0*0.1875*xy^36.0-x0^2.0*x0*0.5070422535211268*xy^71.0+x0^2.0*7.363636363636363*xy^44.0+x0^2.0/2.111111111111111*xy^38.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^2.0*x0*0.16216216216216217/38.0*xy^38.0+x0^2.0*4.05/41.0*xy^41.0-x0^2.0*0.2647058823529412/35.0*xy^35.0-x0^3.0/2.0*xy^2.0+x0^22.0*0.1875/37.0*xy^37.0-x0^2.0*x0*0.5070422535211268/72.0*xy^72.0+x0^2.0*7.363636363636363/45.0*xy^45.0+x0^2.0*2.111111111111111/39.0*xy^39.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^2.0*x0*0.004267425320056899*xy^38.0+x0^2.0*0.09878048780487804*xy^41.0-x0^2.0*0.007563025210084034*xy^35.0-x0^3.0/2.0*xy^2.0+x0^22.0*0.005067567567567568*xy^37.0-x0^2.0*x0*0.007042253521126761*xy^72.0+x0^2.0*0.16363636363636364*xy^45.0+x0^2.0/18.473684210526315*xy^39.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^2.0*x0*7560.0*xy^34.0+x0^2.0*240084.0*xy^37.0-x0^2.0*9504.0*xy^31.0-x0^3.0*0.0+x0^22.0*8032.5*xy^33.0-x0^2.0*x0*173880.0*xy^68.0+x0^2.0*585144.0*xy^41.0+x0^2.0*23976.0*xy^35.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^2.0*x0*7560.0*34.0*xy^33.0+x0^2.0*240084.0*37.0*xy^36.0-x0^2.0*9504.0*31.0*xy^30.0-x0^3.0*0.0*0.0+x0^22.0*8032.5*33.0*xy^32.0-x0^2.0*x0*173880.0*68.0*xy^67.0+x0^2.0*585144.0*41.0*xy^40.0+x0^2.0*23976.0*35.0*xy^34.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^2.0*x0*257040.0*xy^33.0+x0^2.0*8883108.0*xy^36.0-x0^2.0*294624.0*xy^30.0-x0^3.0*0.0+x0^22.0*265072.5*xy^32.0-x0^2.0*x0*1.182384E7*xy^67.0+x0^2.0*2.3990904E7*xy^40.0+x0^2.0*839160.0*xy^34.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^2.0*x0*0.004267425320056899*xy^38.0+x0^2.0*0.09878048780487804*xy^41.0-x0^2.0*0.007563025210084034*xy^35.0-x0^3.0/2.0*xy^2.0+x0^22.0*0.005067567567567568*xy^37.0-x0^2.0*x0*0.007042253521126761*xy^72.0+x0^2.0*0.16363636363636364*xy^45.0+x0^2.0/18.473684210526315*xy^39.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^2.0*x0*0.004267425320056899/39.0*xy^39.0+x0^2.0*0.09878048780487804/42.0*xy^42.0-x0^2.0*0.007563025210084034/36.0*xy^36.0-x0^3.0/2.0/3.0*xy^3.0+x0^22.0*0.005067567567567568/38.0*xy^38.0-x0^2.0*x0*0.007042253521126761/73.0*xy^73.0+x0^2.0*0.16363636363636364/46.0*xy^46.0+x0^2.0*18.473684210526315/40.0*xy^40.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^2.0*x0*1.0942116205274101E-4*xy^39.0+x0^2.0*0.00235191637630662*xy^42.0-x0^2.0*2.100840336134454E-4*xy^36.0-x0^3.0*0.16666666666666666*xy^3.0+x0^22.0*1.333570412517781E-4*xy^38.0-x0^2.0*x0*9.646922631680494E-5*xy^73.0+x0^2.0*0.0035573122529644267*xy^46.0+x0^2.0/2.1652421652421654*xy^40.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^2.0*x0*257040.0*xy^33.0+x0^2.0*8883108.0*xy^36.0-x0^2.0*294624.0*xy^30.0-x0^3.0*0.0+x0^22.0*265072.5*xy^32.0-x0^2.0*x0*1.182384E7*xy^67.0+x0^2.0*2.3990904E7*xy^40.0+x0^2.0*839160.0*xy^34.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^2.0*x0*257040.0*33.0*xy^32.0+x0^2.0*8883108.0*36.0*xy^35.0-x0^2.0*294624.0*30.0*xy^29.0-x0^3.0*0.0*0.0+x0^22.0*265072.5*32.0*xy^31.0-x0^2.0*x0*1.182384E7*67.0*xy^66.0+x0^2.0*2.3990904E7*40.0*xy^39.0+x0^2.0*839160.0*34.0*xy^33.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^2.0*x0*8482320.0*xy^32.0+x0^2.0*3.19791888E8*xy^35.0-x0^2.0*8838720.0*xy^29.0-x0^3.0*0.0+x0^22.0*8482320.0*xy^31.0-x0^2.0*x0*7.9219728E8*xy^66.0+x0^2.0*9.5963616E8*xy^39.0+x0^2.0*2.853144E7*xy^33.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^2.0*x0*1.0942116205274101E-4*xy^39.0-4.0*xy^39.0+x0^2.0*0.00235191637630662*xy^42.0-x0^2.0*2.100840336134454E-4*xy^36.0-4.0*xy^36.0-x0^3.0*0.16666666666666666*xy^3.0+x0^22.0*1.333570412517781E-4*xy^38.0-4.0*xy^38.0-x0^2.0*x0*9.646922631680494E-5*xy^73.0-5.0*xy^73.0+x0^2.0*0.0035573122529644267*xy^46.0+x0^2.0/2.1652421652421654*xy^40.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^2.0*x0*1.0942116205274101E-4/40.0*xy^40.0-4.0/40.0*xy^40.0+x0^2.0*0.00235191637630662/43.0*xy^43.0-x0^2.0*2.100840336134454E-4/37.0*xy^37.0-4.0/37.0*xy^37.0-x0^3.0*0.16666666666666666/4.0*xy^4.0+x0^22.0*1.333570412517781E-4/39.0*xy^39.0-4.0/39.0*xy^39.0-x0^2.0*x0*9.646922631680494E-5/74.0*xy^74.0-5.0/74.0*xy^74.0+x0^2.0*0.0035573122529644267/47.0*xy^47.0+x0^2.0*2.1652421652421654/41.0*xy^41.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^2.0*x0/365559.99999999994*xy^40.0-1.0/10.0*xy^40.0-0.1*xy^40.0+x0^2.0*5.46957296815493E-5*xy^43.0-x0^2.0/176120.0*xy^37.0-1.0/9.25*xy^37.0-0.10810810810810811*xy^37.0-x0^3.0*0.041666666666666664*xy^4.0+x0^22.0/292448.0*xy^39.0-1.0/9.75*xy^39.0-0.10256410256410256*xy^39.0-x0^2.0*x0/767084.0*xy^74.0-1.0/14.8*xy^74.0-0.06756756756756757*xy^74.0+x0^2.0*7.568749474392398E-5*xy^47.0+x0^2.0/18.935526315789474*xy^41.0";
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

public static void TestCaseDiff121287() {
 UsageCalculus.TestCase = 121287;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xyz^33*xyz/-1*xyz^2-1*x0^2*-2*x0^3*3*x02*xyz^3*3*xyz/1*xyz^2*--3*xyz^33*xyz1*x0^2*--3*x0^3-3*xyz^3*1*xyz/2*xyz^21*xyz/2*xyz^2*-3*xyz^3*-1*xyz2*x0^22*xyz^3*-3*xyz-3*xyz/1*xyz^2*-2*xyz^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyz^33*xyz/-1*xyz^2-1*x0^2*-2*x0^3*3*x02*xyz^3*3*xyz/1*xyz^2*--3*xyz^33*xyz1*xyz^2*--3*xyz^3-3*xy012^3*1*xy012/2*xy012^22*xyz^3*3*xyz3*xyz/-1*xyz^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=286 EqnNumber=90 FamilyID=1 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[20, 90, 19, 20, 3, 2, 3, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 1, 1, 4, 2, 3, 1, 3, 4, 2, 4, 2, 3, 4, 5, 6, 15]"+
"// DOEMatrixRow=[17, 92, 2, 1, 1, 2, 3, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 42, 1, 1, 2, 4, 2, 3, 1, 4, 3, 1, 1, 14, 1, 14, 10]"+
//Tail EqnIndex=286 EqnNumber=90 FamilyID=1 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[20, 90, 19, 20, 3, 2, 3, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 1, 1, 4, 2, 3, 1, 3, 4, 2, 4, 2, 3, 4, 5, 6, 15]"+
"// DOEMatrixRow=[17, 92, 2, 1, 1, 2, 3, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 42, 1, 1, 2, 4, 2, 3, 1, 4, 3, 1, 1, 14, 1, 14, 10]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-2.0*xyz^36.0+x0^2.0*162.0*xyz^39.0-x0^2.0*9.0*xyz^33.0-x0^3.0*3.0+x0^22.0*6.75*xyz^35.0-x0^2.0*x0*36.0*xyz^70.0+162.0*xyz^44.0-9.0*xyz^38.0-3.0*xyz^3.0+4.5*xyz^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-2.0*36.0*xyz^35.0+x0^2.0*162.0*39.0*xyz^38.0-x0^2.0*9.0*33.0*xyz^32.0-x0^3.0*3.0*0.0+x0^22.0*6.75*35.0*xyz^34.0-x0^2.0*x0*36.0*70.0*xyz^69.0+162.0*44.0*xyz^43.0-9.0*38.0*xyz^37.0-3.0*3.0*xyz^2.0+4.5*6.0*xyz^5.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-72.0*xyz^35.0+x0^2.0*6318.0*xyz^38.0-x0^2.0*297.0*xyz^32.0-x0^3.0*0.0+x0^22.0*236.25*xyz^34.0-x0^2.0*x0*2520.0*xyz^69.0+7128.0*xyz^43.0-342.0*xyz^37.0-9.0*xyz^2.0+27.0*xyz^5.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-2.0*xyz^36.0+x0^2.0*162.0*xyz^39.0-x0^2.0*9.0*xyz^33.0-x0^3.0*3.0+x0^22.0*6.75*xyz^35.0-x0^2.0*x0*36.0*xyz^70.0+162.0*xyz^44.0-9.0*xyz^38.0-3.0*xyz^3.0+4.5*xyz^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-2.0/37.0*xyz^37.0+x0^2.0*162.0/40.0*xyz^40.0-x0^2.0*9.0/34.0*xyz^34.0-x0^3.0*xyz+x0^22.0*6.75/36.0*xyz^36.0-x0^2.0*x0*36.0/71.0*xyz^71.0+162.0/45.0*xyz^45.0-9.0/39.0*xyz^39.0-3.0/4.0*xyz^4.0+4.5/7.0*xyz^7.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-0.05405405405405406*xyz^37.0+x0^2.0*4.05*xyz^40.0-x0^2.0*0.2647058823529412*xyz^34.0-x0^3.0*xyz+x0^22.0*0.1875*xyz^36.0-x0^2.0*x0/1.9722222222222223*xyz^71.0+3.6*xyz^45.0-1.0/4.333333333333333*xyz^39.0-1.0/1.3333333333333333*xyz^4.0+1.0/1.5555555555555556*xyz^7.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-72.0*xyz^35.0+x0^2.0*6318.0*xyz^38.0-x0^2.0*297.0*xyz^32.0-x0^3.0*0.0+x0^22.0*236.25*xyz^34.0-x0^2.0*x0*2520.0*xyz^69.0+7128.0*xyz^43.0-342.0*xyz^37.0-9.0*xyz^2.0+27.0*xyz^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-72.0*35.0*xyz^34.0+x0^2.0*6318.0*38.0*xyz^37.0-x0^2.0*297.0*32.0*xyz^31.0-x0^3.0*0.0*0.0+x0^22.0*236.25*34.0*xyz^33.0-x0^2.0*x0*2520.0*69.0*xyz^68.0+7128.0*43.0*xyz^42.0-342.0*37.0*xyz^36.0-9.0*2.0*xyz^1.0+27.0*5.0*xyz^4.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-2520.0*xyz^34.0+x0^2.0*240084.0*xyz^37.0-x0^2.0*9504.0*xyz^31.0-x0^3.0*0.0+x0^22.0*8032.5*xyz^33.0-x0^2.0*x0*173880.0*xyz^68.0+306504.0*xyz^42.0-12654.0*xyz^36.0-18.0*xyz+135.0*xyz^4.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-0.05405405405405406*xyz^37.0+x0^2.0*4.05*xyz^40.0-x0^2.0*0.2647058823529412*xyz^34.0-x0^3.0*xyz+x0^22.0*0.1875*xyz^36.0-x0^2.0*x0/1.9722222222222223*xyz^71.0+3.6*xyz^45.0-1.0/4.333333333333333*xyz^39.0-1.0/1.3333333333333333*xyz^4.0+1.0/1.5555555555555556*xyz^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-0.05405405405405406/38.0*xyz^38.0+x0^2.0*4.05/41.0*xyz^41.0-x0^2.0*0.2647058823529412/35.0*xyz^35.0-x0^3.0/2.0*xyz^2.0+x0^22.0*0.1875/37.0*xyz^37.0-x0^2.0*x0/1.9722222222222223/72.0*xyz^72.0+3.6/46.0*xyz^46.0-1.0/4.333333333333333/40.0*xyz^40.0-1.0/1.3333333333333333/5.0*xyz^5.0+1.0/1.5555555555555556/8.0*xyz^8.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-0.001422475106685633*xyz^38.0+x0^2.0*0.09878048780487804*xyz^41.0-x0^2.0*0.007563025210084034*xyz^35.0-x0^3.0/2.0*xyz^2.0+x0^22.0*0.005067567567567568*xyz^37.0-x0^2.0*x0/142.0*xyz^72.0+1.0/12.777777777777777*xyz^46.0-1.0/173.33333333333331*xyz^40.0-1.0/6.666666666666666*xyz^5.0+1.0/12.444444444444445*xyz^8.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-2520.0*xyz^34.0+x0^2.0*240084.0*xyz^37.0-x0^2.0*9504.0*xyz^31.0-x0^3.0*0.0+x0^22.0*8032.5*xyz^33.0-x0^2.0*x0*173880.0*xyz^68.0+306504.0*xyz^42.0-12654.0*xyz^36.0-18.0*xyz+135.0*xyz^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-2520.0*34.0*xyz^33.0+x0^2.0*240084.0*37.0*xyz^36.0-x0^2.0*9504.0*31.0*xyz^30.0-x0^3.0*0.0*0.0+x0^22.0*8032.5*33.0*xyz^32.0-x0^2.0*x0*173880.0*68.0*xyz^67.0+306504.0*42.0*xyz^41.0-12654.0*36.0*xyz^35.0-18.0+135.0*4.0*xyz^3.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-85680.0*xyz^33.0+x0^2.0*8883108.0*xyz^36.0-x0^2.0*294624.0*xyz^30.0-x0^3.0*0.0+x0^22.0*265072.5*xyz^32.0-x0^2.0*x0*1.182384E7*xyz^67.0+1.2873168E7*xyz^41.0-455544.0*xyz^35.0-18.0+540.0*xyz^3.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-0.001422475106685633*xyz^38.0+x0^2.0*0.09878048780487804*xyz^41.0-x0^2.0*0.007563025210084034*xyz^35.0-x0^3.0/2.0*xyz^2.0+x0^22.0*0.005067567567567568*xyz^37.0-x0^2.0*x0/142.0*xyz^72.0+1.0/12.777777777777777*xyz^46.0-1.0/173.33333333333331*xyz^40.0-1.0/6.666666666666666*xyz^5.0+1.0/12.444444444444445*xyz^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-0.001422475106685633/39.0*xyz^39.0+x0^2.0*0.09878048780487804/42.0*xyz^42.0-x0^2.0*0.007563025210084034/36.0*xyz^36.0-x0^3.0/2.0/3.0*xyz^3.0+x0^22.0*0.005067567567567568/38.0*xyz^38.0-x0^2.0*x0/142.0/73.0*xyz^73.0+1.0/12.777777777777777/47.0*xyz^47.0-1.0/173.33333333333331/41.0*xyz^41.0-1.0/6.666666666666666/6.0*xyz^6.0+1.0/12.444444444444445/9.0*xyz^9.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-3.6473720684247E-5*xyz^39.0+x0^2.0*0.00235191637630662*xyz^42.0-x0^2.0*2.100840336134454E-4*xyz^36.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^22.0*1.333570412517781E-4*xyz^38.0-x0^2.0*x0/10366.0*xyz^73.0+1.0/600.5555555555555*xyz^47.0-1.0/7106.666666666666*xyz^41.0-1.0/40.0*xyz^6.0+1.0/112.0*xyz^9.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-85680.0*xyz^33.0+x0^2.0*8883108.0*xyz^36.0-x0^2.0*294624.0*xyz^30.0-x0^3.0*0.0+x0^22.0*265072.5*xyz^32.0-x0^2.0*x0*1.182384E7*xyz^67.0+1.2873168E7*xyz^41.0-455544.0*xyz^35.0-18.0+540.0*xyz^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-85680.0*33.0*xyz^32.0+x0^2.0*8883108.0*36.0*xyz^35.0-x0^2.0*294624.0*30.0*xyz^29.0-x0^3.0*0.0*0.0+x0^22.0*265072.5*32.0*xyz^31.0-x0^2.0*x0*1.182384E7*67.0*xyz^66.0+41.0*xyz^40.0-455544.0*35.0*xyz^34.0-18.0*0.0+540.0*3.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-2827440.0*xyz^32.0+x0^2.0*3.19791888E8*xyz^35.0-x0^2.0*8838720.0*xyz^29.0-x0^3.0*0.0+x0^22.0*8482320.0*xyz^31.0-x0^2.0*x0*7.9219728E8*xyz^66.0+41.0*xyz^40.0-1.594404E7*xyz^34.0+1620.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-3.6473720684247E-5*xyz^39.0-5.0*xyz^39.0+x0^2.0*0.00235191637630662*xyz^42.0-x0^2.0*2.100840336134454E-4*xyz^36.0-4.0*xyz^36.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^22.0*1.333570412517781E-4*xyz^38.0-4.0*xyz^38.0-x0^2.0*x0/10366.0*xyz^73.0+1.0/600.5555555555555*xyz^47.0-1.0/7106.666666666666*xyz^41.0-1.0/40.0*xyz^6.0+1.0/112.0*xyz^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-3.6473720684247E-5/40.0*xyz^40.0-5.0/40.0*xyz^40.0+x0^2.0*0.00235191637630662/43.0*xyz^43.0-x0^2.0*2.100840336134454E-4/37.0*xyz^37.0-4.0/37.0*xyz^37.0-x0^3.0*0.16666666666666666/4.0*xyz^4.0+x0^22.0*1.333570412517781E-4/39.0*xyz^39.0-4.0/39.0*xyz^39.0-x0^2.0*x0/10366.0/74.0*xyz^74.0+1.0/600.5555555555555/48.0*xyz^48.0-1.0/7106.666666666666/42.0*xyz^42.0-1.0/40.0/7.0*xyz^7.0+1.0/112.0/10.0*xyz^10.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/1096680.0*xyz^40.0-1.0/8.0*xyz^40.0-0.125*xyz^40.0+x0^2.0*5.46957296815493E-5*xyz^43.0-x0^2.0/176120.0*xyz^37.0-1.0/9.25*xyz^37.0-0.10810810810810811*xyz^37.0-x0^3.0*0.041666666666666664*xyz^4.0+x0^22.0/292448.0*xyz^39.0-1.0/9.75*xyz^39.0-0.10256410256410256*xyz^39.0-x0^2.0*x0/767084.0*xyz^74.0+1.0/28826.666666666664*xyz^48.0-1.0/298480.0*xyz^42.0-1.0/280.0*xyz^7.0+1.0/1120.0*xyz^10.0";
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

public static void TestCaseDiff121288() {
 UsageCalculus.TestCase = 121288;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xyza/-1*xyza^2-1*x0^2*-2*x0^3*3*x02*xyza^3*3*xyza/1*xyza^2*--3*xyza^33*xyza1*x0^2*--3*x0^3-3*xyza^3*1*xyza/2*xyza^21*xyza/2*xyza^2*-3*xyza^3*-1*xyza2*x0^22*xyza^3*-3*xyza-3*xyza/1*xyza^2*-2*xyza^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyza^33*xyza/-1*xyza^2-1*x0^2*-2*x0^3*3*x02*xyza^3*3*xyza/1*xyza^2*--3*xyza^33*xyza1*xyza^2*--3*xyza^3-3*xy012^3*1*xy012/2*xy012^21*xyza/2*xyza^2*-3*xyza^3*-1*xyza2*xyza^23*xyza/-1*xyza^2-1*x0^2*-2*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=287 EqnNumber=91 FamilyID=2 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[87, 91, 20, 1, 4, 3, 1, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 2, 3, 5, 3, 1, 2, 4, 5, 3, 1, 3, 4, 5, 6, 7, 16]"+
"// DOEMatrixRow=[84, 93, 3, 2, 3, 1, 1, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 43, 2, 3, 1, 5, 3, 1, 2, 1, 1, 2, 3, 15, 2, 15, 11]"+
//Tail EqnIndex=287 EqnNumber=91 FamilyID=2 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[87, 91, 20, 1, 4, 3, 1, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 2, 3, 5, 3, 1, 2, 4, 5, 3, 1, 3, 4, 5, 6, 7, 16]"+
"// DOEMatrixRow=[84, 93, 3, 2, 3, 1, 1, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 43, 2, 3, 1, 5, 3, 1, 2, 1, 1, 2, 3, 15, 2, 15, 11]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-3.0*xyza^3.0+x0^2.0*162.0*xyza^39.0-x0^2.0*9.0*xyza^33.0-x0^3.0*3.0+x0^22.0*6.75*xyza^35.0-x0^2.0*x0*36.0*xyza^70.0+162.0*xyza^44.0-9.0*xyza^38.0-3.0*xyza^3.0+2.25*xyza^32.0+x0^2.0*2.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-3.0*3.0*xyza^2.0+x0^2.0*162.0*39.0*xyza^38.0-x0^2.0*9.0*33.0*xyza^32.0-x0^3.0*3.0*0.0+x0^22.0*6.75*35.0*xyza^34.0-x0^2.0*x0*36.0*70.0*xyza^69.0+162.0*44.0*xyza^43.0-9.0*38.0*xyza^37.0-3.0*3.0*xyza^2.0+2.25*32.0*xyza^31.0+x0^2.0*2.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-9.0*xyza^2.0+x0^2.0*6318.0*xyza^38.0-x0^2.0*297.0*xyza^32.0-x0^3.0*0.0+x0^22.0*236.25*xyza^34.0-x0^2.0*x0*2520.0*xyza^69.0+7128.0*xyza^43.0-342.0*xyza^37.0-9.0*xyza^2.0+72.0*xyza^31.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-3.0*xyza^3.0+x0^2.0*162.0*xyza^39.0-x0^2.0*9.0*xyza^33.0-x0^3.0*3.0+x0^22.0*6.75*xyza^35.0-x0^2.0*x0*36.0*xyza^70.0+162.0*xyza^44.0-9.0*xyza^38.0-3.0*xyza^3.0+2.25*xyza^32.0+x0^2.0*2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-3.0/4.0*xyza^4.0+x0^2.0*162.0/40.0*xyza^40.0-x0^2.0*9.0/34.0*xyza^34.0-x0^3.0*xyza+x0^22.0*6.75/36.0*xyza^36.0-x0^2.0*x0*36.0/71.0*xyza^71.0+162.0/45.0*xyza^45.0-9.0/39.0*xyza^39.0-3.0/4.0*xyza^4.0+2.25/33.0*xyza^33.0+x0^2.0*xyza";
 UsageCalculus.EqnSolArrayMap4[1] = "-0.75*xyza^4.0+x0^2.0*4.05*xyza^40.0-x0^2.0*0.2647058823529412*xyza^34.0-x0^3.0*xyza+x0^22.0*0.1875*xyza^36.0-x0^2.0*x0/1.9722222222222223*xyza^71.0+3.6*xyza^45.0-1.0/4.333333333333333*xyza^39.0-1.0/1.3333333333333333*xyza^4.0+0.06818181818181818*xyza^33.0+x0^2.0*xyza";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-9.0*xyza^2.0+x0^2.0*6318.0*xyza^38.0-x0^2.0*297.0*xyza^32.0-x0^3.0*0.0+x0^22.0*236.25*xyza^34.0-x0^2.0*x0*2520.0*xyza^69.0+7128.0*xyza^43.0-342.0*xyza^37.0-9.0*xyza^2.0+72.0*xyza^31.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-9.0*2.0*xyza^1.0+x0^2.0*6318.0*38.0*xyza^37.0-x0^2.0*297.0*32.0*xyza^31.0-x0^3.0*0.0*0.0+x0^22.0*236.25*34.0*xyza^33.0-x0^2.0*x0*2520.0*69.0*xyza^68.0+7128.0*43.0*xyza^42.0-342.0*37.0*xyza^36.0-9.0*2.0*xyza^1.0+72.0*31.0*xyza^30.0+x0^2.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-18.0*xyza+x0^2.0*240084.0*xyza^37.0-x0^2.0*9504.0*xyza^31.0-x0^3.0*0.0+x0^22.0*8032.5*xyza^33.0-x0^2.0*x0*173880.0*xyza^68.0+306504.0*xyza^42.0-12654.0*xyza^36.0-18.0*xyza+2232.0*xyza^30.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-0.75*xyza^4.0+x0^2.0*4.05*xyza^40.0-x0^2.0*0.2647058823529412*xyza^34.0-x0^3.0*xyza+x0^22.0*0.1875*xyza^36.0-x0^2.0*x0/1.9722222222222223*xyza^71.0+3.6*xyza^45.0-1.0/4.333333333333333*xyza^39.0-1.0/1.3333333333333333*xyza^4.0+0.06818181818181818*xyza^33.0+x0^2.0*xyza";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-0.75/5.0*xyza^5.0+x0^2.0*4.05/41.0*xyza^41.0-x0^2.0*0.2647058823529412/35.0*xyza^35.0-x0^3.0/2.0*xyza^2.0+x0^22.0*0.1875/37.0*xyza^37.0-x0^2.0*x0/1.9722222222222223/72.0*xyza^72.0+3.6/46.0*xyza^46.0-1.0/4.333333333333333/40.0*xyza^40.0-1.0/1.3333333333333333/5.0*xyza^5.0+0.06818181818181818/34.0*xyza^34.0+x0^2.0/2.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-0.15*xyza^5.0+x0^2.0*0.09878048780487804*xyza^41.0-x0^2.0*0.007563025210084034*xyza^35.0-x0^3.0/2.0*xyza^2.0+x0^22.0*0.005067567567567568*xyza^37.0-x0^2.0*x0/142.0*xyza^72.0+1.0/12.777777777777777*xyza^46.0-1.0/173.33333333333331*xyza^40.0-1.0/6.666666666666666*xyza^5.0+0.0020053475935828875*xyza^34.0+x0^2.0/2.0*xyza^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-18.0*xyza+x0^2.0*240084.0*xyza^37.0-x0^2.0*9504.0*xyza^31.0-x0^3.0*0.0+x0^22.0*8032.5*xyza^33.0-x0^2.0*x0*173880.0*xyza^68.0+306504.0*xyza^42.0-12654.0*xyza^36.0-18.0*xyza+2232.0*xyza^30.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-18.0+x0^2.0*240084.0*37.0*xyza^36.0-x0^2.0*9504.0*31.0*xyza^30.0-x0^3.0*0.0*0.0+x0^22.0*8032.5*33.0*xyza^32.0-x0^2.0*x0*173880.0*68.0*xyza^67.0+306504.0*42.0*xyza^41.0-12654.0*36.0*xyza^35.0-18.0+2232.0*30.0*xyza^29.0+x0^2.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-18.0+x0^2.0*8883108.0*xyza^36.0-x0^2.0*294624.0*xyza^30.0-x0^3.0*0.0+x0^22.0*265072.5*xyza^32.0-x0^2.0*x0*1.182384E7*xyza^67.0+1.2873168E7*xyza^41.0-455544.0*xyza^35.0-18.0+66960.0*xyza^29.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-0.15*xyza^5.0+x0^2.0*0.09878048780487804*xyza^41.0-x0^2.0*0.007563025210084034*xyza^35.0-x0^3.0/2.0*xyza^2.0+x0^22.0*0.005067567567567568*xyza^37.0-x0^2.0*x0/142.0*xyza^72.0+1.0/12.777777777777777*xyza^46.0-1.0/173.33333333333331*xyza^40.0-1.0/6.666666666666666*xyza^5.0+0.0020053475935828875*xyza^34.0+x0^2.0/2.0*xyza^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-0.15/6.0*xyza^6.0+x0^2.0*0.09878048780487804/42.0*xyza^42.0-x0^2.0*0.007563025210084034/36.0*xyza^36.0-x0^3.0/2.0/3.0*xyza^3.0+x0^22.0*0.005067567567567568/38.0*xyza^38.0-x0^2.0*x0/142.0/73.0*xyza^73.0+1.0/12.777777777777777/47.0*xyza^47.0-1.0/173.33333333333331/41.0*xyza^41.0-1.0/6.666666666666666/6.0*xyza^6.0+0.0020053475935828875/35.0*xyza^35.0+x0^2.0*2.0/3.0*xyza^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-0.024999999999999998*xyza^6.0+x0^2.0*0.00235191637630662*xyza^42.0-x0^2.0*2.100840336134454E-4*xyza^36.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^22.0*1.333570412517781E-4*xyza^38.0-x0^2.0*x0/10366.0*xyza^73.0+1.0/600.5555555555555*xyza^47.0-1.0/7106.666666666666*xyza^41.0-1.0/40.0*xyza^6.0+5.729564553093964E-5*xyza^35.0+x0^2.0/1.5*xyza^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-18.0+x0^2.0*8883108.0*xyza^36.0-x0^2.0*294624.0*xyza^30.0-x0^3.0*0.0+x0^22.0*265072.5*xyza^32.0-x0^2.0*x0*1.182384E7*xyza^67.0+1.2873168E7*xyza^41.0-455544.0*xyza^35.0-18.0+66960.0*xyza^29.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0+x0^2.0*8883108.0*36.0*xyza^35.0-x0^2.0*294624.0*30.0*xyza^29.0-x0^3.0*0.0*0.0+x0^22.0*265072.5*32.0*xyza^31.0-x0^2.0*x0*1.182384E7*67.0*xyza^66.0+41.0*xyza^40.0-455544.0*35.0*xyza^34.0-18.0*0.0+66960.0*29.0*xyza^28.0+x0^2.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*3.19791888E8*xyza^35.0-x0^2.0*8838720.0*xyza^29.0-x0^3.0*0.0+x0^22.0*8482320.0*xyza^31.0-x0^2.0*x0*7.9219728E8*xyza^66.0+41.0*xyza^40.0-1.594404E7*xyza^34.0+1941840.0*xyza^28.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-0.024999999999999998*xyza^6.0+x0^2.0*0.00235191637630662*xyza^42.0-x0^2.0*2.100840336134454E-4*xyza^36.0-4.0*xyza^36.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^22.0*1.333570412517781E-4*xyza^38.0-4.0*xyza^38.0-x0^2.0*x0/10366.0*xyza^73.0+1.0/600.5555555555555*xyza^47.0-1.0/7106.666666666666*xyza^41.0-1.0/40.0*xyza^6.0+5.729564553093964E-5*xyza^35.0-5.0*xyza^35.0+x0^2.0/1.5*xyza^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-0.024999999999999998/7.0*xyza^7.0+x0^2.0*0.00235191637630662/43.0*xyza^43.0-x0^2.0*2.100840336134454E-4/37.0*xyza^37.0-4.0/37.0*xyza^37.0-x0^3.0*0.16666666666666666/4.0*xyza^4.0+x0^22.0*1.333570412517781E-4/39.0*xyza^39.0-4.0/39.0*xyza^39.0-x0^2.0*x0/10366.0/74.0*xyza^74.0+1.0/600.5555555555555/48.0*xyza^48.0-1.0/7106.666666666666/42.0*xyza^42.0-1.0/40.0/7.0*xyza^7.0+5.729564553093964E-5/36.0*xyza^36.0-5.0/36.0*xyza^36.0+x0^2.0*1.5/4.0*xyza^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-0.0035714285714285713*xyza^7.0+x0^2.0*5.46957296815493E-5*xyza^43.0-x0^2.0/176120.0*xyza^37.0-1.0/9.25*xyza^37.0-0.10810810810810811*xyza^37.0-x0^3.0*0.041666666666666664*xyza^4.0+x0^22.0/292448.0*xyza^39.0-1.0/9.75*xyza^39.0-0.10256410256410256*xyza^39.0-x0^2.0*x0/767084.0*xyza^74.0+1.0/28826.666666666664*xyza^48.0-1.0/298480.0*xyza^42.0-1.0/280.0*xyza^7.0+1.0/628320.0000000001*xyza^36.0-1.0/7.2*xyza^36.0-0.1388888888888889*xyza^36.0+x0^2.0/2.6666666666666665*xyza^4.0";
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

public static void TestCaseDiff121289() {
 UsageCalculus.TestCase = 121289;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-1*x0^2*-2*x0^3*3*x0-1*x0^2*-2*x0^32*x^3*3*x";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=288 EqnNumber=92 FamilyID=3 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[51, 92, 1, 2, 1, 1, 2, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 4, 6, 1, 2, 3, 1, 6, 1, 2, 4, 1, 6, 7, 8, 17]"+
"// DOEMatrixRow=[48, 94, 4, 3, 1, 2, 3, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 44, 3, 1, 2, 1, 1, 2, 3, 2, 3, 1, 4, 16, 1, 16, 12]"+
//Tail EqnIndex=288 EqnNumber=92 FamilyID=3 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[51, 92, 1, 2, 1, 1, 2, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 4, 6, 1, 2, 3, 1, 6, 1, 2, 4, 1, 6, 7, 8, 17]"+
"// DOEMatrixRow=[48, 94, 4, 3, 1, 2, 3, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 44, 3, 1, 2, 1, 1, 2, 3, 2, 3, 1, 4, 16, 1, 16, 12]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "6.0+6.0*x^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+6.0*4.0*x^3.0";
 UsageCalculus.EqnSolArrayMap2[1] = "24.0*x^3.0";
 UsageCalculus.EqnSolArrayMap3[1] = "6.0+6.0*x^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "6.0*x+6.0/5.0*x^5.0";
 UsageCalculus.EqnSolArrayMap4[1] = "6.0*x+1.2*x^5.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "24.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "24.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[2] = "72.0*x^2.0";
 UsageCalculus.EqnSolArrayMap3[2] = "6.0*x+1.2*x^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "6.0/2.0*x^2.0+1.2/6.0*x^6.0";
 UsageCalculus.EqnSolArrayMap4[2] = "3.0*x^2.0+1.0/5.0*x^6.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "72.0*x^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "72.0*2.0*x^1.0";
 UsageCalculus.EqnSolArrayMap2[3] = "144.0*x";
 UsageCalculus.EqnSolArrayMap3[3] = "3.0*x^2.0+1.0/5.0*x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "3.0/3.0*x^3.0+1.0/5.0/7.0*x^7.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x^3.0+1.0/35.0*x^7.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "144.0*x";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "144.0";
 UsageCalculus.EqnSolArrayMap2[4] = "144.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x^3.0+1.0/35.0*x^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/4.0*x^4.0+1.0/35.0/8.0*x^8.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/4.0*x^4.0+1.0/280.0*x^8.0";
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

public static void TestCaseDiff121290() {
 UsageCalculus.TestCase = 121290;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xy^3*3*xy/1*xy^2*--3*xy^33*xy2*xy^3*3*xy3*xy/1*xy^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=289 EqnNumber=93 FamilyID=1 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[15, 93, 2, 3, 2, 3, 1, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 1, 7, 2, 3, 1, 2, 7, 2, 3, 5, 2, 7, 8, 9, 18]"+
"// DOEMatrixRow=[12, 95, 5, 4, 2, 3, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 45, 4, 2, 3, 2, 3, 1, 4, 3, 1, 2, 1, 1, 2, 17, 13]"+
//Tail EqnIndex=289 EqnNumber=93 FamilyID=1 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[15, 93, 2, 3, 2, 3, 1, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 1, 7, 2, 3, 1, 2, 7, 2, 3, 5, 2, 7, 8, 9, 18]"+
"// DOEMatrixRow=[12, 95, 5, 4, 2, 3, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 45, 4, 2, 3, 2, 3, 1, 4, 3, 1, 2, 1, 1, 2, 17, 13]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "54.0*xy^45.0-9.0*xy^39.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "54.0*45.0*xy^44.0-9.0*39.0*xy^38.0";
 UsageCalculus.EqnSolArrayMap2[1] = "2430.0*xy^44.0-351.0*xy^38.0";
 UsageCalculus.EqnSolArrayMap3[1] = "54.0*xy^45.0-9.0*xy^39.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "54.0/46.0*xy^46.0-9.0/40.0*xy^40.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.173913043478261*xy^46.0-1.0/4.444444444444445*xy^40.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "2430.0*xy^44.0-351.0*xy^38.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "2430.0*44.0*xy^43.0-351.0*38.0*xy^37.0";
 UsageCalculus.EqnSolArrayMap2[2] = "106920.0*xy^43.0-13338.0*xy^37.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.173913043478261*xy^46.0-1.0/4.444444444444445*xy^40.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.173913043478261/47.0*xy^47.0-1.0/4.444444444444445/41.0*xy^41.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/40.03703703703703*xy^47.0-1.0/182.22222222222223*xy^41.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "106920.0*xy^43.0-13338.0*xy^37.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "106920.0*43.0*xy^42.0-13338.0*37.0*xy^36.0";
 UsageCalculus.EqnSolArrayMap2[3] = "4597560.0*xy^42.0-493506.0*xy^36.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/40.03703703703703*xy^47.0-1.0/182.22222222222223*xy^41.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/40.03703703703703/48.0*xy^48.0-1.0/182.22222222222223/42.0*xy^42.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/1921.7777777777774*xy^48.0-1.0/7653.333333333334*xy^42.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "4597560.0*xy^42.0-493506.0*xy^36.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "4597560.0*42.0*xy^41.0-493506.0*36.0*xy^35.0";
 UsageCalculus.EqnSolArrayMap2[4] = "1.9309752E8*xy^41.0-1.7766216E7*xy^35.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/1921.7777777777774*xy^48.0-1.0/7653.333333333334*xy^42.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/1921.7777777777774/49.0*xy^49.0-1.0/7653.333333333334/43.0*xy^43.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/94167.1111111111*xy^49.0-1.0/329093.3333333334*xy^43.0";
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

public static void TestCaseDiff121291() {
 UsageCalculus.TestCase = 121291;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xyz1*x0^2*--3*x0^3-3*xyz^3*1*xyz/2*xyz^23*xyz/1*xyz^21*x0^2*--3*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=290 EqnNumber=94 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[82, 94, 3, 4, 3, 1, 2, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 3, 8, 3, 1, 2, 3, 8, 3, 4, 6, 3, 8, 9, 10, 19]"+
"// DOEMatrixRow=[79, 96, 6, 1, 3, 1, 2, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 46, 5, 3, 1, 3, 1, 2, 5, 4, 2, 3, 2, 3, 1, 18, 14]"+
//Tail EqnIndex=290 EqnNumber=94 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[82, 94, 3, 4, 3, 1, 2, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 3, 8, 3, 1, 2, 3, 8, 3, 4, 6, 3, 8, 9, 10, 19]"+
"// DOEMatrixRow=[79, 96, 6, 1, 3, 1, 2, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 46, 5, 3, 1, 3, 1, 2, 5, 4, 2, 3, 2, 3, 1, 18, 14]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0*9.0-x0^3.0*3.0-x0^2.0*4.5*xyz^49.0-x0^3.0*3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0*9.0*0.0-x0^3.0*3.0*0.0-x0^2.0*4.5*49.0*xyz^48.0-x0^3.0*3.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*0.0-x0^3.0*0.0-x0^2.0*220.5*xyz^48.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0*9.0-x0^3.0*3.0-x0^2.0*4.5*xyz^49.0-x0^3.0*3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0*9.0*xyz-x0^3.0*xyz-x0^2.0*4.5/50.0*xyz^50.0-x0^3.0*xyz";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0*9.0*xyz-x0^3.0*xyz-x0^2.0*0.09*xyz^50.0-x0^3.0*xyz";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*0.0-x0^3.0*0.0-x0^2.0*220.5*xyz^48.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*0.0-x0^3.0*0.0*0.0-x0^2.0*220.5*48.0*xyz^47.0-x0^3.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*0.0-x0^3.0*0.0-x0^2.0*10584.0*xyz^47.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0*9.0*xyz-x0^3.0*xyz-x0^2.0*0.09*xyz^50.0-x0^3.0*xyz";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0*9.0/2.0*xyz^2.0-x0^3.0/2.0*xyz^2.0-x0^2.0*0.09/51.0*xyz^51.0-x0^3.0/2.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0*4.5*xyz^2.0-x0^3.0/2.0*xyz^2.0-x0^2.0*0.001764705882352941*xyz^51.0-x0^3.0/2.0*xyz^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*0.0-x0^3.0*0.0-x0^2.0*10584.0*xyz^47.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*0.0-x0^3.0*0.0*0.0-x0^2.0*10584.0*47.0*xyz^46.0-x0^3.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*0.0-x0^3.0*0.0-x0^2.0*497448.0*xyz^46.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0*4.5*xyz^2.0-x0^3.0/2.0*xyz^2.0-x0^2.0*0.001764705882352941*xyz^51.0-x0^3.0/2.0*xyz^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0*4.5/3.0*xyz^3.0-x0^3.0/2.0/3.0*xyz^3.0-x0^2.0*0.001764705882352941/52.0*xyz^52.0-x0^3.0*2.0/3.0*xyz^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0*1.5*xyz^3.0-x0^3.0*0.16666666666666666*xyz^3.0-x0^2.0*3.39366515837104E-5*xyz^52.0-x0^3.0/1.5*xyz^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*0.0-x0^3.0*0.0-x0^2.0*497448.0*xyz^46.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*0.0-x0^3.0*0.0*0.0-x0^2.0*497448.0*46.0*xyz^45.0-x0^3.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*0.0-x0^3.0*0.0-x0^2.0*2.2882608E7*xyz^45.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0*1.5*xyz^3.0-x0^3.0*0.16666666666666666*xyz^3.0-x0^2.0*3.39366515837104E-5*xyz^52.0-5.0*xyz^52.0-x0^3.0/1.5*xyz^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0*1.5/4.0*xyz^4.0-x0^3.0*0.16666666666666666/4.0*xyz^4.0-x0^2.0*3.39366515837104E-5/53.0*xyz^53.0-5.0/53.0*xyz^53.0-x0^3.0*1.5/4.0*xyz^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0*0.375*xyz^4.0-x0^3.0*0.041666666666666664*xyz^4.0-x0^2.0/1561733.3333333335*xyz^53.0-1.0/10.6*xyz^53.0-0.09433962264150944*xyz^53.0-x0^3.0/2.6666666666666665*xyz^4.0";
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

public static void TestCaseDiff121292() {
 UsageCalculus.TestCase = 121292;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x0^2*--3*x0^3-3*xyza^3*1*xyza/2*xyza^21*xyza/2*xyza^2*-3*xyza^3*-1*xyza2*x0^21*x0^2*--3*x0^3-3*xyza^3*1*xyza";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=291 EqnNumber=95 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[46, 95, 4, 5, 4, 2, 3, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 5, 3, 4, 9, 1, 2, 3, 4, 9, 1, 1, 7, 4, 9, 10, 11, 20]"+
"// DOEMatrixRow=[43, 97, 7, 2, 1, 2, 3, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 47, 6, 1, 2, 4, 2, 3, 6, 1, 3, 1, 3, 4, 2, 19, 15]"+
//Tail EqnIndex=291 EqnNumber=95 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[46, 95, 4, 5, 4, 2, 3, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 5, 3, 4, 9, 1, 2, 3, 4, 9, 1, 1, 7, 4, 9, 10, 11, 20]"+
"// DOEMatrixRow=[43, 97, 7, 2, 1, 2, 3, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 47, 6, 1, 2, 4, 2, 3, 6, 1, 3, 1, 3, 4, 2, 19, 15]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0*3.0-x0^3.0*3.0-x0^21.0*6.75*xyza^31.0-x0^3.0*3.0-3.0*xyza^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0*3.0*0.0-x0^3.0*3.0*0.0-x0^21.0*6.75*31.0*xyza^30.0-x0^3.0*3.0*0.0-3.0*4.0*xyza^3.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*0.0-x0^3.0*0.0-x0^21.0*209.25*xyza^30.0-x0^3.0*0.0-12.0*xyza^3.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0*3.0-x0^3.0*3.0-x0^21.0*6.75*xyza^31.0-x0^3.0*3.0-3.0*xyza^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0*3.0*xyza-x0^3.0*xyza-x0^21.0*6.75/32.0*xyza^32.0-x0^3.0*xyza-3.0/5.0*xyza^5.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0*3.0*xyza-x0^3.0*xyza-x0^21.0*0.2109375*xyza^32.0-x0^3.0*xyza-1.0/1.6666666666666667*xyza^5.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*0.0-x0^3.0*0.0-x0^21.0*209.25*xyza^30.0-x0^3.0*0.0-12.0*xyza^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*0.0-x0^3.0*0.0*0.0-x0^21.0*209.25*30.0*xyza^29.0-x0^3.0*0.0*0.0-12.0*3.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*0.0-x0^3.0*0.0-x0^21.0*6277.5*xyza^29.0-x0^3.0*0.0-36.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0*3.0*xyza-x0^3.0*xyza-x0^21.0*0.2109375*xyza^32.0-x0^3.0*xyza-1.0/1.6666666666666667*xyza^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0*3.0/2.0*xyza^2.0-x0^3.0/2.0*xyza^2.0-x0^21.0*0.2109375/33.0*xyza^33.0-x0^3.0/2.0*xyza^2.0-1.0/1.6666666666666667/6.0*xyza^6.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0*1.5*xyza^2.0-x0^3.0/2.0*xyza^2.0-x0^21.0*0.006392045454545455*xyza^33.0-x0^3.0/2.0*xyza^2.0-1.0/10.0*xyza^6.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*0.0-x0^3.0*0.0-x0^21.0*6277.5*xyza^29.0-x0^3.0*0.0-36.0*xyza^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*0.0-x0^3.0*0.0*0.0-x0^21.0*6277.5*29.0*xyza^28.0-x0^3.0*0.0*0.0-36.0*2.0*xyza^1.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*0.0-x0^3.0*0.0-x0^21.0*182047.5*xyza^28.0-x0^3.0*0.0-72.0*xyza";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0*1.5*xyza^2.0-x0^3.0/2.0*xyza^2.0-x0^21.0*0.006392045454545455*xyza^33.0-x0^3.0/2.0*xyza^2.0-1.0/10.0*xyza^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0*1.5/3.0*xyza^3.0-x0^3.0/2.0/3.0*xyza^3.0-x0^21.0*0.006392045454545455/34.0*xyza^34.0-x0^3.0/2.0/3.0*xyza^3.0-1.0/10.0/7.0*xyza^7.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0*0.5*xyza^3.0-x0^3.0*0.16666666666666666*xyza^3.0-x0^21.0*1.8800133689839574E-4*xyza^34.0-x0^3.0/6.0*xyza^3.0-1.0/70.0*xyza^7.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*0.0-x0^3.0*0.0-x0^21.0*182047.5*xyza^28.0-x0^3.0*0.0-72.0*xyza";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*0.0-x0^3.0*0.0*0.0-x0^21.0*182047.5*28.0*xyza^27.0-x0^3.0*0.0*0.0-72.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*0.0-x0^3.0*0.0-x0^21.0*5097330.0*xyza^27.0-x0^3.0*0.0-72.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0*0.5*xyza^3.0-x0^3.0*0.16666666666666666*xyza^3.0-x0^21.0*1.8800133689839574E-4*xyza^34.0-4.0*xyza^34.0-x0^3.0/6.0*xyza^3.0-1.0/70.0*xyza^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0*0.5/4.0*xyza^4.0-x0^3.0*0.16666666666666666/4.0*xyza^4.0-x0^21.0*1.8800133689839574E-4/35.0*xyza^35.0-4.0/35.0*xyza^35.0-x0^3.0/6.0/4.0*xyza^4.0-1.0/70.0/8.0*xyza^8.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0*0.125*xyza^4.0-x0^3.0*0.041666666666666664*xyza^4.0-x0^21.0/186168.88888888888*xyza^35.0-1.0/8.75*xyza^35.0-0.11428571428571428*xyza^35.0-x0^3.0/24.0*xyza^4.0-1.0/560.0*xyza^8.0";
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

public static void TestCaseDiff121293() {
 UsageCalculus.TestCase = 121293;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*x^3*1*x/2*x^21*x/2*x^2*-3*x^3*-1*x2*x0^22*x^3*-3*x-3*x/1*x^2*-2*x^3-3*x^3*1*x1*x/2*x^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=292 EqnNumber=96 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[10, 96, 5, 6, 1, 3, 1, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 1, 1, 1, 10, 2, 3, 1, 1, 10, 2, 3, 8, 1, 10, 11, 12, 21]"+
"// DOEMatrixRow=[7, 98, 8, 3, 2, 3, 1, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 48, 7, 2, 3, 5, 3, 1, 1, 2, 1, 2, 4, 5, 1, 20, 16]"+
//Tail EqnIndex=292 EqnNumber=96 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[10, 96, 5, 6, 1, 3, 1, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 1, 1, 1, 10, 2, 3, 1, 1, 10, 2, 3, 8, 1, 10, 11, 12, 21]"+
"// DOEMatrixRow=[7, 98, 8, 3, 2, 3, 1, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 48, 7, 2, 3, 5, 3, 1, 1, 2, 1, 2, 4, 5, 1, 20, 16]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "6.75*x^35.0+6.0*x^6.0-1.5*x^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "6.75*35.0*x^34.0+6.0*6.0*x^5.0-1.5*6.0*x^5.0";
 UsageCalculus.EqnSolArrayMap2[1] = "236.25*x^34.0+36.0*x^5.0-9.0*x^5.0";
 UsageCalculus.EqnSolArrayMap3[1] = "6.75*x^35.0+6.0*x^6.0-1.5*x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "6.75/36.0*x^36.0+6.0/7.0*x^7.0-1.5/7.0*x^7.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/5.333333333333333*x^36.0+1.0/1.1666666666666667*x^7.0-1.0/4.666666666666667*x^7.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "236.25*x^34.0+36.0*x^5.0-9.0*x^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "236.25*34.0*x^33.0+36.0*5.0*x^4.0-9.0*5.0*x^4.0";
 UsageCalculus.EqnSolArrayMap2[2] = "8032.5*x^33.0+180.0*x^4.0-45.0*x^4.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/5.333333333333333*x^36.0+1.0/1.1666666666666667*x^7.0-1.0/4.666666666666667*x^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/5.333333333333333/37.0*x^37.0+1.0/1.1666666666666667/8.0*x^8.0-1.0/4.666666666666667/8.0*x^8.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/197.33333333333331*x^37.0+1.0/9.333333333333334*x^8.0-1.0/37.333333333333336*x^8.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "8032.5*x^33.0+180.0*x^4.0-45.0*x^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "8032.5*33.0*x^32.0+180.0*4.0*x^3.0-45.0*4.0*x^3.0";
 UsageCalculus.EqnSolArrayMap2[3] = "265072.5*x^32.0+720.0*x^3.0-180.0*x^3.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/197.33333333333331*x^37.0+1.0/9.333333333333334*x^8.0-1.0/37.333333333333336*x^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/197.33333333333331/38.0*x^38.0+1.0/9.333333333333334/9.0*x^9.0-1.0/37.333333333333336/9.0*x^9.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/7498.666666666666*x^38.0+1.0/84.0*x^9.0-1.0/336.0*x^9.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "265072.5*x^32.0+720.0*x^3.0-180.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "265072.5*32.0*x^31.0+720.0*3.0*x^2.0-180.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[4] = "8482320.0*x^31.0+2160.0*x^2.0-540.0*x^2.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/7498.666666666666*x^38.0+1.0/84.0*x^9.0-1.0/336.0*x^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/7498.666666666666/39.0*x^39.0+1.0/84.0/10.0*x^10.0-1.0/336.0/10.0*x^10.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/292448.0*x^39.0+1.0/840.0*x^10.0-1.0/3360.0*x^10.0";
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

public static void TestCaseDiff121294() {
 UsageCalculus.TestCase = 121294;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xy/2*xy^2*-3*xy^3*-1*xy2*x0^22*xy^3*-3*xy-3*xy/1*xy^2*-2*xy^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xy^31*xy/2*xy^22*x0^2*-3*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=293 EqnNumber=97 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[77, 97, 6, 7, 2, 1, 2, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 2, 3, 11, 3, 1, 2, 3, 11, 3, 4, 9, 2, 11, 12, 13, 22]"+
"// DOEMatrixRow=[74, 99, 9, 4, 3, 1, 2, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 49, 8, 3, 1, 1, 1, 2, 3, 4, 2, 3, 1, 6, 2, 1, 17]"+
//Tail EqnIndex=293 EqnNumber=97 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[77, 97, 6, 7, 2, 1, 2, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 2, 3, 11, 3, 1, 2, 3, 11, 3, 4, 9, 2, 11, 12, 13, 22]"+
"// DOEMatrixRow=[74, 99, 9, 4, 3, 1, 2, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 49, 8, 3, 1, 1, 1, 2, 3, 4, 2, 3, 1, 6, 2, 1, 17]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^22.0*4.5*xy^10.0-x0^2.0*x0*54.0*xy^88.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^22.0*4.5*10.0*xy^9.0-x0^2.0*x0*88.0*xy^87.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^22.0*45.0*xy^9.0-x0^2.0*x0*88.0*xy^87.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^22.0*4.5*xy^10.0-x0^2.0*x0*54.0*xy^88.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^22.0*4.5/11.0*xy^11.0-x0^2.0*x0*54.0/89.0*xy^89.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^22.0*0.4090909090909091*xy^11.0-x0^2.0*x0/1.6481481481481481*xy^89.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^22.0*45.0*xy^9.0-x0^2.0*x0*88.0*xy^87.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^22.0*45.0*9.0*xy^8.0-x0^2.0*x0*87.0*xy^86.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^22.0*405.0*xy^8.0-x0^2.0*x0*87.0*xy^86.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^22.0*0.4090909090909091*xy^11.0-x0^2.0*x0/1.6481481481481481*xy^89.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^22.0*0.4090909090909091/12.0*xy^12.0-x0^2.0*x0/1.6481481481481481/90.0*xy^90.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^22.0*0.034090909090909095*xy^12.0-x0^2.0*x0/148.33333333333334*xy^90.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^22.0*405.0*xy^8.0-x0^2.0*x0*87.0*xy^86.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^22.0*405.0*8.0*xy^7.0-x0^2.0*x0*86.0*xy^85.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^22.0*3240.0*xy^7.0-x0^2.0*x0*86.0*xy^85.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^22.0*0.034090909090909095*xy^12.0-x0^2.0*x0/148.33333333333334*xy^90.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^22.0*0.034090909090909095/13.0*xy^13.0-x0^2.0*x0/148.33333333333334/91.0*xy^91.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^22.0*0.002622377622377623*xy^13.0-x0^2.0*x0/13498.333333333334*xy^91.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^22.0*3240.0*xy^7.0-x0^2.0*x0*86.0*xy^85.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^22.0*3240.0*7.0*xy^6.0-x0^2.0*x0*85.0*xy^84.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^22.0*22680.0*xy^6.0-x0^2.0*x0*85.0*xy^84.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^22.0*0.002622377622377623*xy^13.0-x0^2.0*x0/13498.333333333334*xy^91.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^22.0*0.002622377622377623/14.0*xy^14.0-x0^2.0*x0/13498.333333333334/92.0*xy^92.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^22.0*1.8731268731268734E-4*xy^14.0-x0^2.0*x0/1241846.6666666667*xy^92.0";
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

public static void TestCaseDiff121295() {
 UsageCalculus.TestCase = 121295;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*x0^22*xyz^3*-3*xyz-3*xyz/1*xyz^2*-2*xyz^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyz^33*xyz/-1*xyz^2-1*x0^2*-2*x0^3*3*x02*x0^2*-3*x0^32*xyz^3*-3*xyz";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=294 EqnNumber=98 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[41, 98, 7, 8, 3, 2, 3, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 3, 4, 12, 1, 2, 3, 4, 12, 1, 1, 10, 3, 12, 13, 14, 23]"+
"// DOEMatrixRow=[38, 100, 10, 1, 1, 2, 3, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 50, 9, 1, 2, 3, 2, 3, 4, 1, 3, 1, 2, 7, 1, 2, 18]"+
//Tail EqnIndex=294 EqnNumber=98 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[41, 98, 7, 8, 3, 2, 3, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 3, 4, 12, 1, 2, 3, 4, 12, 1, 1, 10, 3, 12, 13, 14, 23]"+
"// DOEMatrixRow=[38, 100, 10, 1, 1, 2, 3, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 50, 9, 1, 2, 3, 2, 3, 4, 1, 3, 1, 2, 7, 1, 2, 18]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^22.0*6.0*xyz^4.0-x0^2.0*x0*36.0*xyz^70.0+x0^2.0*x02*54.0*xyz^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^22.0*6.0*4.0*xyz^3.0-x0^2.0*x0*36.0*70.0*xyz^69.0+x0^2.0*x02*4.0*xyz^3.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^22.0*24.0*xyz^3.0-x0^2.0*x0*2520.0*xyz^69.0+x0^2.0*x02*4.0*xyz^3.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^22.0*6.0*xyz^4.0-x0^2.0*x0*36.0*xyz^70.0+x0^2.0*x02*54.0*xyz^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^22.0*6.0/5.0*xyz^5.0-x0^2.0*x0*36.0/71.0*xyz^71.0+x0^2.0*x02*54.0/5.0*xyz^5.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^22.0*1.2*xyz^5.0-x0^2.0*x0*0.5070422535211268*xyz^71.0+x0^2.0*x02*10.8*xyz^5.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^22.0*24.0*xyz^3.0-x0^2.0*x0*2520.0*xyz^69.0+x0^2.0*x02*4.0*xyz^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^22.0*24.0*3.0*xyz^2.0-x0^2.0*x0*2520.0*69.0*xyz^68.0+x0^2.0*x02*3.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^22.0*72.0*xyz^2.0-x0^2.0*x0*173880.0*xyz^68.0+x0^2.0*x02*3.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^22.0*1.2*xyz^5.0-x0^2.0*x0*0.5070422535211268*xyz^71.0+x0^2.0*x02*10.8*xyz^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^22.0*1.2/6.0*xyz^6.0-x0^2.0*x0*0.5070422535211268/72.0*xyz^72.0+x0^2.0*x02*10.8/6.0*xyz^6.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^22.0*0.19999999999999998*xyz^6.0-x0^2.0*x0*0.007042253521126761*xyz^72.0+x0^2.0*x02*1.8*xyz^6.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^22.0*72.0*xyz^2.0-x0^2.0*x0*173880.0*xyz^68.0+x0^2.0*x02*3.0*xyz^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^22.0*72.0*2.0*xyz^1.0-x0^2.0*x0*173880.0*68.0*xyz^67.0+x0^2.0*x02*2.0*xyz^1.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^22.0*144.0*xyz-x0^2.0*x0*1.182384E7*xyz^67.0+x0^2.0*x02*2.0*xyz";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^22.0*0.19999999999999998*xyz^6.0-x0^2.0*x0*0.007042253521126761*xyz^72.0+x0^2.0*x02*1.8*xyz^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^22.0*0.19999999999999998/7.0*xyz^7.0-x0^2.0*x0*0.007042253521126761/73.0*xyz^73.0+x0^2.0*x02*1.8/7.0*xyz^7.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^22.0*0.02857142857142857*xyz^7.0-x0^2.0*x0*9.646922631680494E-5*xyz^73.0+x0^2.0*x02/3.888888888888889*xyz^7.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^22.0*144.0*xyz-x0^2.0*x0*1.182384E7*xyz^67.0+x0^2.0*x02*2.0*xyz";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^22.0*144.0-x0^2.0*x0*1.182384E7*67.0*xyz^66.0+x0^2.0*x02*2.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^22.0*144.0-x0^2.0*x0*7.9219728E8*xyz^66.0+x0^2.0*x02*2.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^22.0*0.02857142857142857*xyz^7.0-x0^2.0*x0*9.646922631680494E-5*xyz^73.0-5.0*xyz^73.0+x0^2.0*x02/3.888888888888889*xyz^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^22.0*0.02857142857142857/8.0*xyz^8.0-x0^2.0*x0*9.646922631680494E-5/74.0*xyz^74.0-5.0/74.0*xyz^74.0+x0^2.0*x02/3.888888888888889/8.0*xyz^8.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^22.0*0.0035714285714285713*xyz^8.0-x0^2.0*x0/767084.0*xyz^74.0-1.0/14.8*xyz^74.0-0.06756756756756757*xyz^74.0+x0^2.0*x02/31.11111111111111*xyz^8.0";
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

public static void TestCaseDiff121296() {
 UsageCalculus.TestCase = 121296;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xyza^3*-3*xyza-3*xyza/1*xyza^2*-2*xyza^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyza^33*xyza/-1*xyza^2-1*x0^2*-2*x0^3*3*x02*xyza^3*3*xyza/1*xyza^2*--3*xyza^33*xyza2*xyza^3*-3*xyza-3*xyza/1*xyza^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=295 EqnNumber=99 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[5, 99, 8, 9, 4, 3, 1, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 1, 1, 13, 2, 3, 1, 1, 13, 2, 3, 11, 4, 13, 14, 15, 24]"+
"// DOEMatrixRow=[2, 1, 11, 2, 3, 1, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 1, 10, 2, 3, 4, 3, 1, 5, 2, 1, 2, 3, 8, 2, 3, 19]"+
//Tail EqnIndex=295 EqnNumber=99 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[5, 99, 8, 9, 4, 3, 1, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 1, 1, 13, 2, 3, 1, 1, 13, 2, 3, 11, 4, 13, 14, 15, 24]"+
"// DOEMatrixRow=[2, 1, 11, 2, 3, 1, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 1, 10, 2, 3, 4, 3, 1, 5, 2, 1, 2, 3, 8, 2, 3, 19]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-6.0*xyza^4.0-x0^2.0*x0*36.0*xyza^70.0+162.0*xyza^43.0+9.0*xyza^37.0-3.0*xyza^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-6.0*4.0*xyza^3.0-x0^2.0*x0*36.0*70.0*xyza^69.0+162.0*43.0*xyza^42.0+9.0*37.0*xyza^36.0-3.0*3.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-24.0*xyza^3.0-x0^2.0*x0*2520.0*xyza^69.0+6966.0*xyza^42.0+333.0*xyza^36.0-9.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-6.0*xyza^4.0-x0^2.0*x0*36.0*xyza^70.0+162.0*xyza^43.0+9.0*xyza^37.0-3.0*xyza^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-6.0/5.0*xyza^5.0-x0^2.0*x0*36.0/71.0*xyza^71.0+162.0/44.0*xyza^44.0+9.0/38.0*xyza^38.0-3.0/4.0*xyza^4.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.2*xyza^5.0-x0^2.0*x0/1.9722222222222223*xyza^71.0+3.6818181818181817*xyza^44.0+1.0/4.222222222222222*xyza^38.0-1.0/1.3333333333333333*xyza^4.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-24.0*xyza^3.0-x0^2.0*x0*2520.0*xyza^69.0+6966.0*xyza^42.0+333.0*xyza^36.0-9.0*xyza^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-24.0*3.0*xyza^2.0-x0^2.0*x0*2520.0*69.0*xyza^68.0+6966.0*42.0*xyza^41.0+333.0*36.0*xyza^35.0-9.0*2.0*xyza^1.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-72.0*xyza^2.0-x0^2.0*x0*173880.0*xyza^68.0+292572.0*xyza^41.0+11988.0*xyza^35.0-18.0*xyza";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.2*xyza^5.0-x0^2.0*x0/1.9722222222222223*xyza^71.0+3.6818181818181817*xyza^44.0+1.0/4.222222222222222*xyza^38.0-1.0/1.3333333333333333*xyza^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.2/6.0*xyza^6.0-x0^2.0*x0/1.9722222222222223/72.0*xyza^72.0+3.6818181818181817/45.0*xyza^45.0+1.0/4.222222222222222/39.0*xyza^39.0-1.0/1.3333333333333333/5.0*xyza^5.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-0.19999999999999998*xyza^6.0-x0^2.0*x0/142.0*xyza^72.0+1.0/12.222222222222223*xyza^45.0+1.0/164.66666666666666*xyza^39.0-1.0/6.666666666666666*xyza^5.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-72.0*xyza^2.0-x0^2.0*x0*173880.0*xyza^68.0+292572.0*xyza^41.0+11988.0*xyza^35.0-18.0*xyza";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-72.0*2.0*xyza^1.0-x0^2.0*x0*173880.0*68.0*xyza^67.0+292572.0*41.0*xyza^40.0+11988.0*35.0*xyza^34.0-18.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-144.0*xyza-x0^2.0*x0*1.182384E7*xyza^67.0+1.1995452E7*xyza^40.0+419580.0*xyza^34.0-18.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-0.19999999999999998*xyza^6.0-x0^2.0*x0/142.0*xyza^72.0+1.0/12.222222222222223*xyza^45.0+1.0/164.66666666666666*xyza^39.0-1.0/6.666666666666666*xyza^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-0.19999999999999998/7.0*xyza^7.0-x0^2.0*x0/142.0/73.0*xyza^73.0+1.0/12.222222222222223/46.0*xyza^46.0+1.0/164.66666666666666/40.0*xyza^40.0-1.0/6.666666666666666/6.0*xyza^6.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-0.02857142857142857*xyza^7.0-x0^2.0*x0/10366.0*xyza^73.0+1.0/562.2222222222223*xyza^46.0+1.0/6586.666666666666*xyza^40.0-1.0/40.0*xyza^6.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-144.0*xyza-x0^2.0*x0*1.182384E7*xyza^67.0+1.1995452E7*xyza^40.0+419580.0*xyza^34.0-18.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-144.0-x0^2.0*x0*1.182384E7*67.0*xyza^66.0+40.0*xyza^39.0+419580.0*34.0*xyza^33.0-18.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-144.0-x0^2.0*x0*7.9219728E8*xyza^66.0+40.0*xyza^39.0+1.426572E7*xyza^33.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-0.02857142857142857*xyza^7.0-x0^2.0*x0/10366.0*xyza^73.0+1.0/562.2222222222223*xyza^46.0+1.0/6586.666666666666*xyza^40.0-1.0/40.0*xyza^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-0.02857142857142857/8.0*xyza^8.0-x0^2.0*x0/10366.0/74.0*xyza^74.0+1.0/562.2222222222223/47.0*xyza^47.0+1.0/6586.666666666666/41.0*xyza^41.0-1.0/40.0/7.0*xyza^7.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-0.0035714285714285713*xyza^8.0-x0^2.0*x0/767084.0*xyza^74.0+1.0/26424.44444444445*xyza^47.0+1.0/270053.3333333333*xyza^41.0-1.0/280.0*xyza^7.0";
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

public static void TestCaseDiff121297() {
 UsageCalculus.TestCase = 121297;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*x/1*x^2*-2*x^31*x0^2*-2*x0^3*3*x0/-1*x0^22*x^33*x/-1*x^2-1*x0^2*-2*x0^3*3*x02*x^3*3*x/1*x^2*--3*x^33*x1*x^2*--3*x^3-3*xy012^3*1*xy012/2*xy012^2-3*x/1*x^21*x0^2*-2*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=296 EqnNumber=100 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[72, 100, 9, 10, 1, 1, 2, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 2, 3, 14, 3, 1, 2, 3, 14, 3, 4, 12, 1, 14, 15, 16, 25]"+
"// DOEMatrixRow=[68, 2, 12, 3, 1, 2, 3, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 2, 1, 3, 1, 5, 1, 2, 6, 3, 2, 3, 4, 9, 1, 4, 20]"+
//Tail EqnIndex=296 EqnNumber=100 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[72, 100, 9, 10, 1, 1, 2, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 2, 3, 14, 3, 1, 2, 3, 14, 3, 4, 12, 1, 14, 15, 16, 25]"+
"// DOEMatrixRow=[68, 2, 12, 3, 1, 2, 3, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 2, 1, 3, 1, 5, 1, 2, 6, 3, 2, 3, 4, 9, 1, 4, 20]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-36.0*x^70.0+162.0*x^44.0-9.0*x^38.0-3.0*x^3.0-1.5+6.0*x^22.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-36.0*70.0*x^69.0+162.0*44.0*x^43.0-9.0*38.0*x^37.0-3.0*3.0*x^2.0-1.5*0.0+6.0*22.0*x^21.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-2520.0*x^69.0+7128.0*x^43.0-342.0*x^37.0-9.0*x^2.0+132.0*x^21.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-36.0*x^70.0+162.0*x^44.0-9.0*x^38.0-3.0*x^3.0-1.5+6.0*x^22.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-36.0/71.0*x^71.0+162.0/45.0*x^45.0-9.0/39.0*x^39.0-3.0/4.0*x^4.0-1.5*x+6.0/23.0*x^23.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/1.9722222222222223*x^71.0+3.6*x^45.0-1.0/4.333333333333333*x^39.0-1.0/1.3333333333333333*x^4.0-1.5*x+1.0/3.8333333333333335*x^23.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-2520.0*x^69.0+7128.0*x^43.0-342.0*x^37.0-9.0*x^2.0+132.0*x^21.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-2520.0*69.0*x^68.0+7128.0*43.0*x^42.0-342.0*37.0*x^36.0-9.0*2.0*x^1.0+132.0*21.0*x^20.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-173880.0*x^68.0+306504.0*x^42.0-12654.0*x^36.0-18.0*x+2772.0*x^20.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/1.9722222222222223*x^71.0+3.6*x^45.0-1.0/4.333333333333333*x^39.0-1.0/1.3333333333333333*x^4.0-1.5*x+1.0/3.8333333333333335*x^23.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/1.9722222222222223/72.0*x^72.0+3.6/46.0*x^46.0-1.0/4.333333333333333/40.0*x^40.0-1.0/1.3333333333333333/5.0*x^5.0-1.5/2.0*x^2.0+1.0/3.8333333333333335/24.0*x^24.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/142.0*x^72.0+1.0/12.777777777777777*x^46.0-1.0/173.33333333333331*x^40.0-1.0/6.666666666666666*x^5.0-1.0/1.3333333333333333*x^2.0+1.0/92.0*x^24.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-173880.0*x^68.0+306504.0*x^42.0-12654.0*x^36.0-18.0*x+2772.0*x^20.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-173880.0*68.0*x^67.0+306504.0*42.0*x^41.0-12654.0*36.0*x^35.0-18.0+2772.0*20.0*x^19.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-1.182384E7*x^67.0+1.2873168E7*x^41.0-455544.0*x^35.0-18.0+55440.0*x^19.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/142.0*x^72.0+1.0/12.777777777777777*x^46.0-1.0/173.33333333333331*x^40.0-1.0/6.666666666666666*x^5.0-1.0/1.3333333333333333*x^2.0+1.0/92.0*x^24.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/142.0/73.0*x^73.0+1.0/12.777777777777777/47.0*x^47.0-1.0/173.33333333333331/41.0*x^41.0-1.0/6.666666666666666/6.0*x^6.0-1.0/1.3333333333333333/3.0*x^3.0+1.0/92.0/25.0*x^25.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/10366.0*x^73.0+1.0/600.5555555555555*x^47.0-1.0/7106.666666666666*x^41.0-1.0/40.0*x^6.0-1.0/4.0*x^3.0+1.0/2300.0*x^25.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-1.182384E7*x^67.0+1.2873168E7*x^41.0-455544.0*x^35.0-18.0+55440.0*x^19.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-67.0*x^66.0+41.0*x^40.0-455544.0*35.0*x^34.0-18.0*0.0+55440.0*19.0*x^18.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-67.0*x^66.0+41.0*x^40.0-1.594404E7*x^34.0+1053360.0*x^18.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/10366.0*x^73.0+1.0/600.5555555555555*x^47.0-1.0/7106.666666666666*x^41.0-1.0/40.0*x^6.0-1.0/4.0*x^3.0+1.0/2300.0*x^25.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/10366.0/74.0*x^74.0+1.0/600.5555555555555/48.0*x^48.0-1.0/7106.666666666666/42.0*x^42.0-1.0/40.0/7.0*x^7.0-1.0/4.0/4.0*x^4.0+1.0/2300.0/26.0*x^26.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/767084.0*x^74.0+1.0/28826.666666666664*x^48.0-1.0/298480.0*x^42.0-1.0/280.0*x^7.0-1.0/16.0*x^4.0+1.0/59800.0*x^26.0";
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

public static void TestCaseDiff121298() {
 UsageCalculus.TestCase = 121298;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xy012/1*xy012^2*-2*xy012^3*3*xy0121*xy^22*xy^3*3*xy3*x0/-1*x0^2*-2*x0^3-1*xy^2*-2*xy^3*3*xy/1*xy^22*xy^33*x0/1*x0^21*xy^2*--3*xy^3*1*xy-3*xy^3*1*xy/2*xy^2*-3*xy^31*x0-3*xy012/1*xy012^21*xy^2*-2*xy^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=297 EqnNumber=1 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[36, 1, 10, 11, 2, 3, 1, 2, 3, 2, 3, 2, 3, 1, 1, 3, 1, 1, 2, 3, 4, 15, 1, 2, 3, 4, 15, 1, 1, 13, 2, 15, 16, 17, 26]"+
"// DOEMatrixRow=[34, 2, 13, 4, 1, 3, 1, 2, 3, 4, 1, 2, 3, 2, 3, 1, 2, 3, 2, 1, 1, 2, 3, 2, 3, 4, 1, 1, 2, 3, 2, 3, 1]"+
//Tail EqnIndex=297 EqnNumber=1 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[36, 1, 10, 11, 2, 3, 1, 2, 3, 2, 3, 2, 3, 1, 1, 3, 1, 1, 2, 3, 4, 15, 1, 2, 3, 4, 15, 1, 1, 13, 2, 15, 16, 17, 26]"+
"// DOEMatrixRow=[34, 2, 13, 4, 1, 3, 1, 2, 3, 4, 1, 2, 3, 2, 3, 1, 2, 3, 2, 1, 1, 2, 3, 2, 3, 4, 1, 1, 2, 3, 2, 3, 1]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0*108.0*xy^25.0+x0*18.0*xy^67.0-3.0*xy^4.0+x0*4.5*xy^37.0+6.0*xy^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0*108.0*25.0*xy^24.0+x0*18.0*67.0*xy^66.0-3.0*4.0*xy^3.0+x0*4.5*37.0*xy^36.0+6.0*5.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0*2700.0*xy^24.0+x0*1206.0*xy^66.0-12.0*xy^3.0+x0*166.5*xy^36.0+30.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0*108.0*xy^25.0+x0*18.0*xy^67.0-3.0*xy^4.0+x0*4.5*xy^37.0+6.0*xy^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0*108.0/26.0*xy^26.0+x0*18.0/68.0*xy^68.0-3.0/5.0*xy^5.0+x0*4.5/38.0*xy^38.0+6.0/6.0*xy^6.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0*4.153846153846154*xy^26.0+x0/3.7777777777777777*xy^68.0-0.6*xy^5.0+x0/8.444444444444445*xy^38.0+xy^6.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0*2700.0*xy^24.0+x0*1206.0*xy^66.0-12.0*xy^3.0+x0*166.5*xy^36.0+30.0*xy^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0*2700.0*24.0*xy^23.0+x0*1206.0*66.0*xy^65.0-12.0*3.0*xy^2.0+x0*166.5*36.0*xy^35.0+30.0*4.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0*64800.0*xy^23.0+x0*79596.0*xy^65.0-36.0*xy^2.0+x0*5994.0*xy^35.0+120.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0*4.153846153846154*xy^26.0+x0/3.7777777777777777*xy^68.0-0.6*xy^5.0+x0/8.444444444444445*xy^38.0+xy^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0*4.153846153846154/27.0*xy^27.0+x0/3.7777777777777777/69.0*xy^69.0-0.6/6.0*xy^6.0+x0/8.444444444444445/39.0*xy^39.0+1.0/7.0*xy^7.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0*0.15384615384615385*xy^27.0+x0/260.6666666666667*xy^69.0-0.09999999999999999*xy^6.0+x0/329.3333333333333*xy^39.0+1.0/7.0*xy^7.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0*64800.0*xy^23.0+x0*79596.0*xy^65.0-36.0*xy^2.0+x0*5994.0*xy^35.0+120.0*xy^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0*64800.0*23.0*xy^22.0+x0*79596.0*65.0*xy^64.0-36.0*2.0*xy^1.0+x0*5994.0*35.0*xy^34.0+120.0*3.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0*1490400.0*xy^22.0+x0*5173740.0*xy^64.0-72.0*xy+x0*209790.0*xy^34.0+360.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0*0.15384615384615385*xy^27.0+x0/260.6666666666667*xy^69.0-0.09999999999999999*xy^6.0+x0/329.3333333333333*xy^39.0+1.0/7.0*xy^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0*0.15384615384615385/28.0*xy^28.0+x0/260.6666666666667/70.0*xy^70.0-0.09999999999999999/7.0*xy^7.0+x0/329.3333333333333/40.0*xy^40.0+1.0/7.0/8.0*xy^8.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0*0.005494505494505495*xy^28.0+x0/18246.666666666668*xy^70.0-0.014285714285714285*xy^7.0+x0/13173.333333333332*xy^40.0+1.0/56.0*xy^8.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0*1490400.0*xy^22.0+x0*5173740.0*xy^64.0-72.0*xy+x0*209790.0*xy^34.0+360.0*xy^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0*1490400.0*22.0*xy^21.0+x0*5173740.0*64.0*xy^63.0-72.0+x0*209790.0*34.0*xy^33.0+360.0*2.0*xy^1.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0*3.27888E7*xy^21.0+x0*3.3111936E8*xy^63.0-72.0+x0*7132860.0*xy^33.0+720.0*xy";
 UsageCalculus.EqnSolArrayMap3[4] = "x0*0.005494505494505495*xy^28.0+x0/18246.666666666668*xy^70.0-0.014285714285714285*xy^7.0+x0/13173.333333333332*xy^40.0+1.0/56.0*xy^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0*0.005494505494505495/29.0*xy^29.0+x0/18246.666666666668/71.0*xy^71.0-0.014285714285714285/8.0*xy^8.0+x0/13173.333333333332/41.0*xy^41.0+1.0/56.0/9.0*xy^9.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0*1.8946570670708604E-4*xy^29.0+x0/1295513.3333333335*xy^71.0-0.0017857142857142857*xy^8.0+x0/540106.6666666666*xy^41.0+1.0/504.0*xy^9.0";
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

public static void TestCaseDiff121299() {
 UsageCalculus.TestCase = 121299;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xyz^22*xyz^3*3*xyz3*x0/-1*x0^2*-2*x0^3-1*xyz^2*-2*xyz^3*3*xyz/1*xyz^22*xyz^33*x0/1*x0^21*xyz^2*--3*xyz^3*1*xyz-3*xyz^3*1*xyz/2*xyz^2*-3*xyz^31*x02*xyz^2*-3*xyz^33*xyz^3*-1*xyz/2*xyz^21*xyz^2*-2*xyz^32*xyz^3*3*xyz";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=298 EqnNumber=2 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[1, 2, 11, 12, 3, 1, 2, 3, 1, 3, 4, 1, 1, 2, 3, 1, 2, 1, 3, 1, 1, 16, 2, 3, 1, 1, 16, 2, 3, 14, 3, 16, 1, 18, 27]"+
"// DOEMatrixRow=[99, 3, 14, 1, 2, 1, 2, 3, 1, 1, 2, 1, 1, 3, 4, 2, 3, 4, 3, 2, 3, 4, 1, 3, 4, 1, 2, 3, 4, 5, 1, 4, 2]"+
//Tail EqnIndex=298 EqnNumber=2 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[1, 2, 11, 12, 3, 1, 2, 3, 1, 3, 4, 1, 1, 2, 3, 1, 2, 1, 3, 1, 1, 16, 2, 3, 1, 1, 16, 2, 3, 14, 3, 16, 1, 18, 27]"+
"// DOEMatrixRow=[99, 3, 14, 1, 2, 1, 2, 3, 1, 1, 2, 1, 1, 3, 4, 2, 3, 4, 3, 2, 3, 4, 1, 3, 4, 1, 2, 3, 4, 5, 1, 4, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0*6.0*xyz^25.0+x0*18.0*xyz^67.0-3.0*xyz^4.0-x02*40.5*xyz^135.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0*6.0*25.0*xyz^24.0+x0*18.0*67.0*xyz^66.0-3.0*4.0*xyz^3.0-x02*40.5*135.0*xyz^134.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0*150.0*xyz^24.0+x0*1206.0*xyz^66.0-12.0*xyz^3.0-x02*5467.5*xyz^134.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0*6.0*xyz^25.0+x0*18.0*xyz^67.0-3.0*xyz^4.0-x02*40.5*xyz^135.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0*6.0/26.0*xyz^26.0+x0*18.0/68.0*xyz^68.0-3.0/5.0*xyz^5.0-x02*40.5/136.0*xyz^136.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0*0.23076923076923078*xyz^26.0+x0/3.7777777777777777*xyz^68.0-0.6*xyz^5.0-x02/3.3580246913580245*xyz^136.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0*150.0*xyz^24.0+x0*1206.0*xyz^66.0-12.0*xyz^3.0-x02*5467.5*xyz^134.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0*150.0*24.0*xyz^23.0+x0*1206.0*66.0*xyz^65.0-12.0*3.0*xyz^2.0-x02*5467.5*134.0*xyz^133.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0*3600.0*xyz^23.0+x0*79596.0*xyz^65.0-36.0*xyz^2.0-x02*732645.0*xyz^133.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0*0.23076923076923078*xyz^26.0+x0/3.7777777777777777*xyz^68.0-0.6*xyz^5.0-x02/3.3580246913580245*xyz^136.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0*0.23076923076923078/27.0*xyz^27.0+x0/3.7777777777777777/69.0*xyz^69.0-0.6/6.0*xyz^6.0-x02*3.3580246913580245/137.0*xyz^137.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0*0.008547008547008548*xyz^27.0+x0/260.6666666666667*xyz^69.0-0.09999999999999999*xyz^6.0-x02/40.79779411764706*xyz^137.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0*3600.0*xyz^23.0+x0*79596.0*xyz^65.0-36.0*xyz^2.0-x02*732645.0*xyz^133.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0*3600.0*23.0*xyz^22.0+x0*79596.0*65.0*xyz^64.0-36.0*2.0*xyz^1.0-x02*732645.0*133.0*xyz^132.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0*82800.0*xyz^22.0+x0*5173740.0*xyz^64.0-72.0*xyz-x02*9.7441785E7*xyz^132.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0*0.008547008547008548*xyz^27.0+x0/260.6666666666667*xyz^69.0-0.09999999999999999*xyz^6.0-x02/40.79779411764706*xyz^137.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0*0.008547008547008548/28.0*xyz^28.0+x0/260.6666666666667/70.0*xyz^70.0-0.09999999999999999/7.0*xyz^7.0-x02*40.79779411764706/138.0*xyz^138.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0*3.052503052503053E-4*xyz^28.0+x0/18246.666666666668*xyz^70.0-0.014285714285714285*xyz^7.0-x02/3.382535820492025*xyz^138.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0*82800.0*xyz^22.0+x0*5173740.0*xyz^64.0-72.0*xyz-x02*9.7441785E7*xyz^132.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0*82800.0*22.0*xyz^21.0+x0*5173740.0*64.0*xyz^63.0-72.0-0.0*132.0*xyz^131.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0*1821600.0*xyz^21.0+x0*3.3111936E8*xyz^63.0-72.0-0.0*xyz^131.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0*3.052503052503053E-4*xyz^28.0-4.0*xyz^28.0+x0/18246.666666666668*xyz^70.0-0.014285714285714285*xyz^7.0-x02/3.382535820492025*xyz^138.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0*3.052503052503053E-4/29.0*xyz^29.0-4.0/29.0*xyz^29.0+x0/18246.666666666668/71.0*xyz^71.0-0.014285714285714285/8.0*xyz^8.0-x02*3.382535820492025/139.0*xyz^139.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0/95003.99999999999*xyz^29.0-1.0/7.25*xyz^29.0-0.13793103448275862*xyz^29.0+x0/1295513.3333333335*xyz^71.0-0.0017857142857142857*xyz^8.0-x02/41.09343030690537*xyz^139.0";
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

public static void TestCaseDiff121300() {
 UsageCalculus.TestCase = 121300;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xyza^3*3*xyza3*x0/-1*x0^2*-2*x0^3-1*xyza^2*-2*xyza^3*3*xyza/1*xyza^22*xyza^33*x0/1*x0^21*xyza^2*--3*xyza^3*1*xyza-3*xyza^3*1*xyza/2*xyza^2*-3*xyza^31*x02*xyza^2*-3*xyza^33*xyza^3*-1*xyza/2*xyza^22*x0^2*-3*x0^3*1*x0/-3*x0^23*xyza^32*xyza^3*3*xyza3*x0/-1*x0^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=299 EqnNumber=3 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[66, 3, 12, 13, 4, 2, 3, 4, 2, 4, 1, 2, 3, 1, 4, 2, 3, 2, 4, 2, 3, 1, 3, 1, 2, 3, 1, 3, 4, 15, 4, 17, 2, 19, 28]"+
"// DOEMatrixRow=[64, 4, 15, 2, 3, 2, 3, 4, 2, 3, 4, 2, 3, 1, 1, 3, 1, 5, 4, 3, 1, 5, 2, 1, 5, 2, 3, 1, 1, 6, 2, 5, 3]"+
//Tail EqnIndex=299 EqnNumber=3 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[66, 3, 12, 13, 4, 2, 3, 4, 2, 4, 1, 2, 3, 1, 4, 2, 3, 2, 4, 2, 3, 1, 3, 1, 2, 3, 1, 3, 4, 15, 4, 17, 2, 19, 28]"+
"// DOEMatrixRow=[64, 4, 15, 2, 3, 2, 3, 4, 2, 3, 4, 2, 3, 1, 1, 3, 1, 5, 4, 3, 1, 5, 2, 1, 5, 2, 3, 1, 1, 6, 2, 5, 3]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0*12.0*xyza^3.0+x0*18.0*xyza^67.0-3.0*xyza^4.0-x0*20.25*xyza^133.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0*12.0*3.0*xyza^2.0+x0*18.0*67.0*xyza^66.0-3.0*4.0*xyza^3.0-x0*20.25*133.0*xyza^132.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0*36.0*xyza^2.0+x0*1206.0*xyza^66.0-12.0*xyza^3.0-x0*2693.25*xyza^132.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0*12.0*xyza^3.0+x0*18.0*xyza^67.0-3.0*xyza^4.0-x0*20.25*xyza^133.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0*12.0/4.0*xyza^4.0+x0*18.0/68.0*xyza^68.0-3.0/5.0*xyza^5.0-x0*20.25/134.0*xyza^134.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0*3.0*xyza^4.0+x0/3.7777777777777777*xyza^68.0-0.6*xyza^5.0-x0/6.617283950617284*xyza^134.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0*36.0*xyza^2.0+x0*1206.0*xyza^66.0-12.0*xyza^3.0-x0*2693.25*xyza^132.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0*36.0*2.0*xyza^1.0+x0*1206.0*66.0*xyza^65.0-12.0*3.0*xyza^2.0-x0*2693.25*132.0*xyza^131.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0*72.0*xyza+x0*79596.0*xyza^65.0-36.0*xyza^2.0-x0*355509.0*xyza^131.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0*3.0*xyza^4.0+x0/3.7777777777777777*xyza^68.0-0.6*xyza^5.0-x0/6.617283950617284*xyza^134.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0*3.0/5.0*xyza^5.0+x0/3.7777777777777777/69.0*xyza^69.0-0.6/6.0*xyza^6.0-x0*6.617283950617284/135.0*xyza^135.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0*0.6*xyza^5.0+x0/260.6666666666667*xyza^69.0-0.09999999999999999*xyza^6.0-x0/20.401119402985074*xyza^135.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0*72.0*xyza+x0*79596.0*xyza^65.0-36.0*xyza^2.0-x0*355509.0*xyza^131.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0*72.0+x0*79596.0*65.0*xyza^64.0-36.0*2.0*xyza^1.0-x0*355509.0*131.0*xyza^130.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0*72.0+x0*5173740.0*xyza^64.0-72.0*xyza-x0*4.6571679E7*xyza^130.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0*0.6*xyza^5.0+x0/260.6666666666667*xyza^69.0-0.09999999999999999*xyza^6.0-x0/20.401119402985074*xyza^135.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0*0.6/6.0*xyza^6.0+x0/260.6666666666667/70.0*xyza^70.0-0.09999999999999999/7.0*xyza^7.0-x0*20.401119402985074/136.0*xyza^136.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0*0.09999999999999999*xyza^6.0+x0/18246.666666666668*xyza^70.0-0.014285714285714285*xyza^7.0-x0/6.666300868770005*xyza^136.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0*72.0+x0*5173740.0*xyza^64.0-72.0*xyza-x0*4.6571679E7*xyza^130.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0*72.0*0.0+x0*5173740.0*64.0*xyza^63.0-72.0-0.0*130.0*xyza^129.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0*0.0+x0*3.3111936E8*xyza^63.0-72.0-0.0*xyza^129.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0*0.09999999999999999*xyza^6.0+x0/18246.666666666668*xyza^70.0-0.014285714285714285*xyza^7.0-x0/6.666300868770005*xyza^136.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0*0.09999999999999999/7.0*xyza^7.0+x0/18246.666666666668/71.0*xyza^71.0-0.014285714285714285/8.0*xyza^8.0-x0*6.666300868770005/137.0*xyza^137.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0*0.014285714285714285*xyza^7.0+x0/1295513.3333333335*xyza^71.0-0.0017857142857142857*xyza^8.0-x0/20.551127633889376*xyza^137.0";
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