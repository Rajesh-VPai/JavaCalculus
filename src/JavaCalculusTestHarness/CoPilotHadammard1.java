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
public class CoPilotHadammard1 {
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
     case 121101L:
 TestCaseDiff121101(); 
 break;
case 121102L:
 TestCaseDiff121102(); 
 break;
case 121103L:
 TestCaseDiff121103(); 
 break;
case 121104L:
 TestCaseDiff121104(); 
 break;
case 121105L:
 TestCaseDiff121105(); 
 break;
case 121106L:
 TestCaseDiff121106(); 
 break;
case 121107L:
 TestCaseDiff121107(); 
 break;
case 121108L:
 TestCaseDiff121108(); 
 break;
case 121109L:
 TestCaseDiff121109(); 
 break;
case 121110L:
 TestCaseDiff121110(); 
 break;
case 121111L:
 TestCaseDiff121111(); 
 break;
case 121112L:
 TestCaseDiff121112(); 
 break;
case 121113L:
 TestCaseDiff121113(); 
 break;
case 121114L:
 TestCaseDiff121114(); 
 break;
case 121115L:
 TestCaseDiff121115(); 
 break;
case 121116L:
 TestCaseDiff121116(); 
 break;
case 121117L:
 TestCaseDiff121117(); 
 break;
case 121118L:
 TestCaseDiff121118(); 
 break;
case 121119L:
 TestCaseDiff121119(); 
 break;
case 121120L:
 TestCaseDiff121120(); 
 break;
case 121121L:
 TestCaseDiff121121(); 
 break;
case 121122L:
 TestCaseDiff121122(); 
 break;
case 121123L:
 TestCaseDiff121123(); 
 break;
case 121124L:
 TestCaseDiff121124(); 
 break;
case 121125L:
 TestCaseDiff121125(); 
 break;
case 121126L:
 TestCaseDiff121126(); 
 break;
case 121127L:
 TestCaseDiff121127(); 
 break;
case 121128L:
 TestCaseDiff121128(); 
 break;
case 121129L:
 TestCaseDiff121129(); 
 break;
case 121130L:
 TestCaseDiff121130(); 
 break;
case 121131L:
 TestCaseDiff121131(); 
 break;
case 121132L:
 TestCaseDiff121132(); 
 break;
case 121133L:
 TestCaseDiff121133(); 
 break;
case 121134L:
 TestCaseDiff121134(); 
 break;
case 121135L:
 TestCaseDiff121135(); 
 break;
case 121136L:
 TestCaseDiff121136(); 
 break;
case 121137L:
 TestCaseDiff121137(); 
 break;
case 121138L:
 TestCaseDiff121138(); 
 break;
case 121139L:
 TestCaseDiff121139(); 
 break;
case 121140L:
 TestCaseDiff121140(); 
 break;
case 121141L:
 TestCaseDiff121141(); 
 break;
case 121142L:
 TestCaseDiff121142(); 
 break;
case 121143L:
 TestCaseDiff121143(); 
 break;
case 121144L:
 TestCaseDiff121144(); 
 break;
case 121145L:
 TestCaseDiff121145(); 
 break;
case 121146L:
 TestCaseDiff121146(); 
 break;
case 121147L:
 TestCaseDiff121147(); 
 break;
case 121148L:
 TestCaseDiff121148(); 
 break;
case 121149L:
 TestCaseDiff121149(); 
 break;
case 121150L:
 TestCaseDiff121150(); 
 break;
case 121151L:
 TestCaseDiff121151(); 
 break;
case 121152L:
 TestCaseDiff121152(); 
 break;
case 121153L:
 TestCaseDiff121153(); 
 break;
case 121154L:
 TestCaseDiff121154(); 
 break;
case 121155L:
 TestCaseDiff121155(); 
 break;
case 121156L:
 TestCaseDiff121156(); 
 break;
case 121157L:
 TestCaseDiff121157(); 
 break;
case 121158L:
 TestCaseDiff121158(); 
 break;
case 121159L:
 TestCaseDiff121159(); 
 break;
case 121160L:
 TestCaseDiff121160(); 
 break;
case 121161L:
 TestCaseDiff121161(); 
 break;
case 121162L:
 TestCaseDiff121162(); 
 break;
case 121163L:
 TestCaseDiff121163(); 
 break;
case 121164L:
 TestCaseDiff121164(); 
 break;
case 121165L:
 TestCaseDiff121165(); 
 break;
case 121166L:
 TestCaseDiff121166(); 
 break;
case 121167L:
 TestCaseDiff121167(); 
 break;
case 121168L:
 TestCaseDiff121168(); 
 break;
case 121169L:
 TestCaseDiff121169(); 
 break;
case 121170L:
 TestCaseDiff121170(); 
 break;
case 121171L:
 TestCaseDiff121171(); 
 break;
case 121172L:
 TestCaseDiff121172(); 
 break;
case 121173L:
 TestCaseDiff121173(); 
 break;
case 121174L:
 TestCaseDiff121174(); 
 break;
case 121175L:
 TestCaseDiff121175(); 
 break;
case 121176L:
 TestCaseDiff121176(); 
 break;
case 121177L:
 TestCaseDiff121177(); 
 break;
case 121178L:
 TestCaseDiff121178(); 
 break;
case 121179L:
 TestCaseDiff121179(); 
 break;
case 121180L:
 TestCaseDiff121180(); 
 break;
case 121181L:
 TestCaseDiff121181(); 
 break;
case 121182L:
 TestCaseDiff121182(); 
 break;
case 121183L:
 TestCaseDiff121183(); 
 break;
case 121184L:
 TestCaseDiff121184(); 
 break;
case 121185L:
 TestCaseDiff121185(); 
 break;
case 121186L:
 TestCaseDiff121186(); 
 break;
case 121187L:
 TestCaseDiff121187(); 
 break;
case 121188L:
 TestCaseDiff121188(); 
 break;
case 121189L:
 TestCaseDiff121189(); 
 break;
case 121190L:
 TestCaseDiff121190(); 
 break;
case 121191L:
 TestCaseDiff121191(); 
 break;
case 121192L:
 TestCaseDiff121192(); 
 break;
case 121193L:
 TestCaseDiff121193(); 
 break;
case 121194L:
 TestCaseDiff121194(); 
 break;
case 121195L:
 TestCaseDiff121195(); 
 break;
case 121196L:
 TestCaseDiff121196(); 
 break;
case 121197L:
 TestCaseDiff121197(); 
 break;
case 121198L:
 TestCaseDiff121198(); 
 break;
case 121199L:
 TestCaseDiff121199(); 
 break;
case 121200L:
 TestCaseDiff121200(); 
 break;

default:
                    System.out.println(ConsoleColors.RED + "CoPilotEqnBasic TestCase:j= " + j + ": Gap" + ConsoleColors.RESET);
                    break;
            }
        }
    }
 public static void TestCaseDiff121101() {
 UsageCalculus.TestCase = 121101;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*x^3*3*x3*x0/-1*x0^2*-2*x0^3-1*x^2*-2*x^3*3*x/1*x^22*x^33*x0/1*x0^21*x^2*--3*x^3*1*x-3*x^3*1*x/2*x^2*-3*x^31*x02*x^2*-3*x^33*x^3*-1*x/2*x^22*x0^2*-3*x0^3*1*x0/-3*x0^23*x^31*x/-3*x^22*x^3*3*x3*x0/-1*x0^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=100 EqnNumber=3 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[33, 3, 13, 14, 1, 3, 1, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 1, 1, 1, 10, 2, 3, 1, 1, 10, 2, 3, 7, 4, 9, 10, 11, 21]"+
"// DOEMatrixRow=[64, 4, 15, 2, 3, 2, 3, 4, 2, 3, 4, 2, 3, 1, 1, 3, 1, 5, 4, 3, 1, 5, 2, 1, 5, 2, 3, 1, 1, 6, 2, 5, 3]"+
//Tail EqnIndex=100 EqnNumber=3 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[33, 3, 13, 14, 1, 3, 1, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 1, 1, 1, 10, 2, 3, 1, 1, 10, 2, 3, 7, 4, 9, 10, 11, 21]"+
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

public static void TestCaseDiff121102() {
 UsageCalculus.TestCase = 121102;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*x0/-1*x0^2*-2*x0^3-1*xy^2*-2*xy^3*3*xy/1*xy^22*xy^33*x0/1*x0^21*xy^2*--3*xy^3*1*xy-3*xy^3*1*xy/2*xy^2*-3*xy^31*x02*xy^2*-3*xy^33*xy^3*-1*xy/2*xy^22*x0^2*-3*x0^3*1*x0/-3*x0^23*xy^31*xy/-3*xy^2-3*x0^2*-1*x0^3*2*x01*xy^3*2*xy/3*xy^2*--1*xy^33*x0/-1*x0^2-1*xy^2*-2*xy^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=101 EqnNumber=4 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[98, 4, 14, 15, 2, 1, 2, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 2, 3, 11, 3, 1, 2, 3, 11, 3, 4, 8, 1, 10, 11, 12, 22]"+
"// DOEMatrixRow=[28, 5, 16, 3, 1, 3, 1, 5, 3, 4, 1, 1, 1, 2, 3, 1, 2, 6, 5, 1, 2, 1, 3, 2, 6, 3, 1, 2, 3, 7, 1, 6, 4]"+
//Tail EqnIndex=101 EqnNumber=4 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[98, 4, 14, 15, 2, 1, 2, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 2, 3, 11, 3, 1, 2, 3, 11, 3, 4, 8, 1, 10, 11, 12, 22]"+
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

public static void TestCaseDiff121103() {
 UsageCalculus.TestCase = 121103;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-1*xyz^2*-2*xyz^3*3*xyz/1*xyz^22*xyz^33*x0/1*x0^21*xyz^2*--3*xyz^3*1*xyz-3*xyz^3*1*xyz/2*xyz^2*-3*xyz^31*x02*xyz^2*-3*xyz^33*xyz^3*-1*xyz/2*xyz^22*x0^2*-3*x0^3*1*x0/-3*x0^23*xyz^31*xyz/-3*xyz^2-3*x0^2*-1*x0^3*2*x01*xyz^3*2*xyz/3*xyz^2*--1*xyz^32*xyz3*x0^2*--1*x0^3-1*xyz^2*-2*xyz^32*xyz^3*3*xyz";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=102 EqnNumber=5 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[63, 5, 15, 16, 3, 2, 3, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 3, 4, 12, 1, 2, 3, 4, 12, 1, 1, 9, 2, 11, 12, 13, 23]"+
"// DOEMatrixRow=[94, 6, 17, 4, 2, 1, 2, 6, 1, 1, 2, 1, 2, 3, 4, 2, 3, 7, 6, 2, 3, 2, 1, 3, 1, 4, 2, 3, 4, 8, 2, 7, 5]"+
//Tail EqnIndex=102 EqnNumber=5 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[63, 5, 15, 16, 3, 2, 3, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 3, 4, 12, 1, 2, 3, 4, 12, 1, 1, 9, 2, 11, 12, 13, 23]"+
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

public static void TestCaseDiff121104() {
 UsageCalculus.TestCase = 121104;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xyza^33*x0/1*x0^21*xyza^2*--3*xyza^3*1*xyza-3*xyza^3*1*xyza/2*xyza^2*-3*xyza^31*x02*xyza^2*-3*xyza^33*xyza^3*-1*xyza/2*xyza^22*x0^2*-3*x0^3*1*x0/-3*x0^23*xyza^31*xyza/-3*xyza^2-3*x0^2*-1*x0^3*2*x01*xyza^3*2*xyza/3*xyza^2*--1*xyza^32*xyza3*x0^2*--1*x0^3-1*xyza^3*2*xyza/3*xyza^22*xyza/3*xyza^2*-1*xyza^3*-3*xyza2*xyza^3*3*xyza3*x0/1*x0^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=103 EqnNumber=6 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[28, 6, 16, 17, 4, 3, 1, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 1, 1, 13, 2, 3, 1, 1, 13, 2, 3, 10, 3, 12, 13, 14, 24]"+
"// DOEMatrixRow=[59, 7, 18, 1, 3, 2, 3, 7, 2, 3, 4, 2, 3, 1, 1, 3, 1, 8, 7, 3, 1, 3, 2, 1, 2, 1, 3, 1, 1, 9, 1, 8, 6]"+
//Tail EqnIndex=103 EqnNumber=6 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[28, 6, 16, 17, 4, 3, 1, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 1, 1, 13, 2, 3, 1, 1, 13, 2, 3, 10, 3, 12, 13, 14, 24]"+
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

public static void TestCaseDiff121105() {
 UsageCalculus.TestCase = 121105;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*x0/1*x0^21*x^2*--3*x^3*1*x-3*x^3*1*x/2*x^2*-3*x^31*x02*x^2*-3*x^33*x^3*-1*x/2*x^22*x0^2*-3*x0^3*1*x0/-3*x0^23*x^31*x/-3*x^2-3*x0^2*-1*x0^3*2*x01*x^3*2*x/3*x^2*--1*x^32*x3*x0^2*--1*x0^3-1*x^3*2*x/3*x^22*x/3*x^2*-1*x^3*-3*x3*x0^21*x^3*-3*x3*x0/1*x0^21*x^2*--3*x^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=104 EqnNumber=7 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[90, 7, 17, 18, 1, 1, 2, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 2, 3, 14, 3, 1, 2, 3, 14, 3, 4, 11, 4, 13, 14, 15, 25]"+
"// DOEMatrixRow=[24, 8, 19, 2, 1, 3, 1, 8, 3, 4, 1, 1, 1, 2, 3, 1, 2, 9, 8, 1, 2, 4, 3, 2, 3, 2, 1, 2, 3, 10, 2, 9, 7]"+
//Tail EqnIndex=104 EqnNumber=7 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[90, 7, 17, 18, 1, 1, 2, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 2, 3, 14, 3, 1, 2, 3, 14, 3, 4, 11, 4, 13, 14, 15, 25]"+
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

public static void TestCaseDiff121106() {
 UsageCalculus.TestCase = 121106;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xy^2*--3*xy^3*1*xy-3*xy^3*1*xy/2*xy^2*-3*xy^31*x02*xy^2*-3*xy^33*xy^3*-1*xy/2*xy^22*x0^2*-3*x0^3*1*x0/-3*x0^23*xy^31*xy/-3*xy^2-3*x0^2*-1*x0^3*2*x01*xy^3*2*xy/3*xy^2*--1*xy^32*xy3*x0^2*--1*x0^3-1*xy^3*2*xy/3*xy^22*xy/3*xy^2*-1*xy^3*-3*xy3*x0^21*xy^3*-3*xy-3*xy/1*xy^2*-2*xy^31*x0^2*-2*x0^3*3*x0/-1*x0^21*xy^2*--3*xy^3-3*xy^3*1*xy";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=105 EqnNumber=8 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[58, 8, 18, 19, 2, 3, 1, 2, 3, 2, 3, 2, 3, 1, 1, 3, 1, 1, 2, 3, 4, 15, 1, 2, 3, 4, 15, 1, 1, 12, 1, 14, 15, 16, 26]"+
"// DOEMatrixRow=[89, 9, 20, 3, 2, 1, 2, 9, 1, 1, 2, 1, 2, 3, 4, 2, 3, 10, 9, 2, 3, 5, 1, 3, 4, 3, 2, 3, 4, 11, 1, 10, 8]"+
//Tail EqnIndex=105 EqnNumber=8 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[58, 8, 18, 19, 2, 3, 1, 2, 3, 2, 3, 2, 3, 1, 1, 3, 1, 1, 2, 3, 4, 15, 1, 2, 3, 4, 15, 1, 1, 12, 1, 14, 15, 16, 26]"+
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

public static void TestCaseDiff121107() {
 UsageCalculus.TestCase = 121107;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xyz^3*1*xyz/2*xyz^2*-3*xyz^31*x02*xyz^2*-3*xyz^33*xyz^3*-1*xyz/2*xyz^22*x0^2*-3*x0^3*1*x0/-3*x0^23*xyz^31*xyz/-3*xyz^2-3*x0^2*-1*x0^3*2*x01*xyz^3*2*xyz/3*xyz^2*--1*xyz^32*xyz3*x0^2*--1*x0^3-1*xyz^3*2*xyz/3*xyz^22*xyz/3*xyz^2*-1*xyz^3*-3*xyz3*x0^21*xyz^3*-3*xyz-3*xyz/1*xyz^2*-2*xyz^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyz^33*xyz/-1*xyz^2-3*xyz^3*1*xyz1*x0/2*x0^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=106 EqnNumber=9 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[23, 9, 19, 20, 3, 1, 2, 3, 1, 3, 4, 1, 1, 2, 3, 1, 2, 1, 3, 1, 1, 16, 2, 3, 1, 1, 16, 2, 3, 13, 2, 15, 16, 17, 27]"+
"// DOEMatrixRow=[54, 10, 1, 4, 3, 2, 3, 10, 2, 3, 4, 2, 3, 1, 1, 3, 1, 11, 10, 3, 1, 1, 2, 1, 5, 4, 3, 1, 1, 12, 2, 11, 9]"+
//Tail EqnIndex=106 EqnNumber=9 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[23, 9, 19, 20, 3, 1, 2, 3, 1, 3, 4, 1, 1, 2, 3, 1, 2, 1, 3, 1, 1, 16, 2, 3, 1, 1, 16, 2, 3, 13, 2, 15, 16, 17, 27]"+
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

public static void TestCaseDiff121108() {
 UsageCalculus.TestCase = 121108;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x02*xyza^2*-3*xyza^33*xyza^3*-1*xyza/2*xyza^22*x0^2*-3*x0^3*1*x0/-3*x0^23*xyza^31*xyza/-3*xyza^2-3*x0^2*-1*x0^3*2*x01*xyza^3*2*xyza/3*xyza^2*--1*xyza^32*xyza3*x0^2*--1*x0^3-1*xyza^3*2*xyza/3*xyza^22*xyza/3*xyza^2*-1*xyza^3*-3*xyza3*x0^21*xyza^3*-3*xyza-3*xyza/1*xyza^2*-2*xyza^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyza^33*xyza/-1*xyza^2-1*x0^2*-2*x0^3*3*x02*xyza^3*3*xyza/1*xyza^2*--3*xyza^31*x0/2*x0^22*xyza^2*-3*xyza^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=107 EqnNumber=10 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[88, 10, 20, 1, 4, 2, 3, 4, 2, 4, 1, 2, 3, 1, 4, 2, 3, 2, 4, 2, 3, 1, 3, 1, 2, 3, 1, 3, 4, 14, 3, 16, 1, 18, 28]"+
"// DOEMatrixRow=[19, 11, 2, 1, 1, 3, 1, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 12, 1, 1, 2, 3, 1, 2, 6, 1, 1, 2, 3, 13, 1, 12, 10]"+
//Tail EqnIndex=107 EqnNumber=10 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[88, 10, 20, 1, 4, 2, 3, 4, 2, 4, 1, 2, 3, 1, 4, 2, 3, 2, 4, 2, 3, 1, 3, 1, 2, 3, 1, 3, 4, 14, 3, 16, 1, 18, 28]"+
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

public static void TestCaseDiff121109() {
 UsageCalculus.TestCase = 121109;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*x^2*-3*x^32*x^2*-3*x^33*x^3*-1*x";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=108 EqnNumber=11 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[53, 11, 1, 2, 1, 3, 1, 5, 3, 1, 2, 1, 1, 2, 1, 3, 1, 1, 5, 3, 4, 2, 1, 2, 3, 4, 2, 1, 1, 15, 4, 17, 2, 19, 29]"+
"// DOEMatrixRow=[84, 12, 3, 2, 3, 1, 2, 3, 1, 1, 2, 1, 2, 3, 4, 2, 3, 13, 2, 3, 1, 4, 2, 3, 1, 2, 3, 1, 4, 14, 2, 13, 11]"+
//Tail EqnIndex=108 EqnNumber=11 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[53, 11, 1, 2, 1, 3, 1, 5, 3, 1, 2, 1, 1, 2, 1, 3, 1, 1, 5, 3, 4, 2, 1, 2, 3, 4, 2, 1, 1, 15, 4, 17, 2, 19, 29]"+
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

public static void TestCaseDiff121110() {
 UsageCalculus.TestCase = 121110;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xy^3*-1*xy/2*xy^22*x0^2*-3*x0^3*1*x0/-3*x0^23*xy^3*-1*xy2*x0^2*-3*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=109 EqnNumber=12 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[18, 12, 2, 3, 2, 1, 2, 6, 1, 2, 3, 2, 3, 1, 2, 1, 2, 1, 1, 1, 1, 3, 2, 3, 1, 1, 3, 2, 3, 16, 1, 18, 3, 20, 30]"+
"// DOEMatrixRow=[48, 13, 4, 3, 1, 2, 3, 4, 2, 3, 4, 2, 3, 1, 1, 3, 1, 14, 3, 1, 2, 5, 3, 1, 2, 3, 1, 2, 1, 15, 1, 14, 12]"+
//Tail EqnIndex=109 EqnNumber=12 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[18, 12, 2, 3, 2, 1, 2, 6, 1, 2, 3, 2, 3, 1, 2, 1, 2, 1, 1, 1, 1, 3, 2, 3, 1, 1, 3, 2, 3, 16, 1, 18, 3, 20, 30]"+
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

public static void TestCaseDiff121111() {
 UsageCalculus.TestCase = 121111;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*x0^2*-3*x0^3*1*x0/-3*x0^23*xyz^31*xyz/-3*xyz^22*x0^2*-3*x0^33*xyz^3*1*xyz";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=110 EqnNumber=13 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[83, 13, 3, 4, 3, 2, 3, 7, 2, 3, 4, 1, 1, 2, 3, 2, 3, 2, 3, 2, 3, 4, 3, 1, 2, 3, 4, 3, 4, 1, 2, 19, 4, 21, 31]"+
"// DOEMatrixRow=[14, 15, 5, 4, 2, 3, 1, 5, 3, 4, 1, 1, 1, 2, 3, 1, 2, 15, 4, 2, 3, 1, 1, 2, 3, 4, 2, 3, 2, 16, 2, 15, 13]"+
//Tail EqnIndex=110 EqnNumber=13 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[83, 13, 3, 4, 3, 2, 3, 7, 2, 3, 4, 1, 1, 2, 3, 2, 3, 2, 3, 2, 3, 4, 3, 1, 2, 3, 4, 3, 4, 1, 2, 19, 4, 21, 31]"+
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

public static void TestCaseDiff121112() {
 UsageCalculus.TestCase = 121112;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xyza^31*xyza/-3*xyza^2-3*x0^2*-1*x0^3*2*x01*xyza^3*2*xyza/3*xyza^2*--1*xyza^33*xyza^3*1*xyza1*xyza/-3*xyza^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=111 EqnNumber=14 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[47, 14, 4, 5, 4, 3, 1, 8, 3, 4, 1, 2, 3, 1, 4, 3, 1, 1, 4, 3, 4, 5, 1, 2, 3, 4, 5, 1, 1, 2, 3, 20, 5, 22, 32]"+
"// DOEMatrixRow=[79, 16, 6, 1, 3, 1, 2, 6, 1, 1, 2, 1, 2, 3, 4, 2, 3, 16, 5, 3, 1, 2, 3, 1, 4, 1, 3, 1, 3, 1, 1, 16, 14]"+
//Tail EqnIndex=111 EqnNumber=14 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[47, 14, 4, 5, 4, 3, 1, 8, 3, 4, 1, 2, 3, 1, 4, 3, 1, 1, 4, 3, 4, 5, 1, 2, 3, 4, 5, 1, 1, 2, 3, 20, 5, 22, 32]"+
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

public static void TestCaseDiff121113() {
 UsageCalculus.TestCase = 121113;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x/-3*x^2-3*x0^2*-1*x0^3*2*x01*x^3*2*x/3*x^2*--1*x^32*x3*x0^2*--1*x0^31*x/-3*x^2-3*x0^2*-1*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=112 EqnNumber=15 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[13, 15, 5, 6, 1, 1, 2, 9, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 5, 1, 1, 6, 2, 3, 1, 1, 6, 2, 3, 4, 1, 21, 6, 23, 1]"+
"// DOEMatrixRow=[43, 17, 7, 2, 1, 2, 3, 7, 2, 3, 4, 2, 3, 1, 1, 3, 1, 17, 6, 1, 2, 3, 1, 2, 5, 2, 1, 2, 4, 2, 1, 17, 15]"+
//Tail EqnIndex=112 EqnNumber=15 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[13, 15, 5, 6, 1, 1, 2, 9, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 5, 1, 1, 6, 2, 3, 1, 1, 6, 2, 3, 4, 1, 21, 6, 23, 1]"+
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

public static void TestCaseDiff121114() {
 UsageCalculus.TestCase = 121114;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*x0^2*-1*x0^3*2*x01*xy^3*2*xy/3*xy^2*--1*xy^32*xy3*x0^2*--1*x0^3-1*xy^3*2*xy/3*xy^22*xy/3*xy^2*-1*xy^3*-3*xy-3*x0^2*-1*x0^31*xy^3*2*xy";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=113 EqnNumber=16 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[78, 16, 6, 7, 2, 3, 1, 10, 2, 3, 4, 2, 3, 1, 2, 3, 1, 2, 1, 2, 3, 7, 3, 1, 2, 3, 7, 3, 4, 5, 2, 22, 7, 24, 2]"+
"// DOEMatrixRow=[9, 18, 8, 3, 2, 3, 1, 8, 3, 4, 1, 1, 1, 2, 3, 1, 2, 18, 7, 2, 3, 4, 2, 3, 6, 3, 2, 3, 1, 3, 2, 18, 16]"+
//Tail EqnIndex=113 EqnNumber=16 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[78, 16, 6, 7, 2, 3, 1, 10, 2, 3, 4, 2, 3, 1, 2, 3, 1, 2, 1, 2, 3, 7, 3, 1, 2, 3, 7, 3, 4, 5, 2, 22, 7, 24, 2]"+
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

public static void TestCaseDiff121115() {
 UsageCalculus.TestCase = 121115;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xyz^3*2*xyz/3*xyz^2*--1*xyz^32*xyz3*x0^2*--1*x0^3-1*xyz^3*2*xyz/3*xyz^22*xyz/3*xyz^2*-1*xyz^3*-3*xyz3*x0^21*xyz^3*-3*xyz1*xyz^3*2*xyz2*xyz/3*xyz^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=114 EqnNumber=17 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[42, 17, 7, 8, 3, 1, 2, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 2, 3, 4, 8, 1, 2, 3, 4, 8, 1, 1, 6, 3, 23, 8, 25, 3]"+
"// DOEMatrixRow=[74, 19, 9, 4, 3, 1, 2, 9, 1, 1, 2, 1, 2, 3, 4, 2, 3, 19, 8, 3, 1, 5, 3, 1, 1, 4, 3, 1, 2, 4, 1, 19, 17]"+
//Tail EqnIndex=114 EqnNumber=17 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[42, 17, 7, 8, 3, 1, 2, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 2, 3, 4, 8, 1, 2, 3, 4, 8, 1, 1, 6, 3, 23, 8, 25, 3]"+
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

public static void TestCaseDiff121116() {
 UsageCalculus.TestCase = 121116;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xyza3*x0^2*--1*x0^3-1*xyza^3*2*xyza/3*xyza^22*xyza/3*xyza^2*-1*xyza^3*-3*xyza3*x0^21*xyza^3*-3*xyza-3*xyza/1*xyza^2*-2*xyza^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyza/3*xyza^23*x0^2*--1*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=115 EqnNumber=18 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[8, 18, 8, 9, 4, 2, 3, 2, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 1, 1, 9, 2, 3, 1, 1, 9, 2, 3, 7, 4, 24, 9, 26, 4]"+
"// DOEMatrixRow=[38, 20, 10, 1, 1, 2, 3, 10, 2, 3, 4, 2, 3, 1, 1, 3, 1, 20, 9, 1, 2, 1, 1, 2, 3, 1, 1, 2, 3, 5, 2, 20, 18]"+
//Tail EqnIndex=115 EqnNumber=18 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[8, 18, 8, 9, 4, 2, 3, 2, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 1, 1, 9, 2, 3, 1, 1, 9, 2, 3, 7, 4, 24, 9, 26, 4]"+
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

public static void TestCaseDiff121117() {
 UsageCalculus.TestCase = 121117;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*x0^2*--1*x0^3-1*x^3*2*x/3*x^22*x/3*x^2*-1*x^3*-3*x3*x0^21*x^3*-3*x-3*x/1*x^2*-2*x^31*x0^2*-2*x0^3*3*x0/-1*x0^22*x^33*x/-1*x^23*x0^2*--1*x0^3-1*x^3*2*x";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=116 EqnNumber=19 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[73, 19, 9, 10, 1, 3, 1, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 2, 3, 10, 3, 1, 2, 3, 10, 3, 4, 8, 1, 25, 10, 27, 5]"+
"// DOEMatrixRow=[4, 21, 11, 2, 3, 1, 1, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 21, 10, 2, 3, 2, 3, 1, 4, 2, 3, 1, 4, 6, 1, 1, 19]"+
//Tail EqnIndex=116 EqnNumber=19 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[73, 19, 9, 10, 1, 3, 1, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 2, 3, 10, 3, 1, 2, 3, 10, 3, 4, 8, 1, 25, 10, 27, 5]"+
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

public static void TestCaseDiff121118() {
 UsageCalculus.TestCase = 121118;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-1*xy^3*2*xy/3*xy^22*xy/3*xy^2*-1*xy^3*-3*xy3*x0^21*xy^3*-3*xy-3*xy/1*xy^2*-2*xy^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xy^33*xy/-1*xy^2-1*x0^2*-2*x0^3*3*x02*xy^3*3*xy/1*xy^2*--3*xy^3-1*xy^3*2*xy2*xy/3*xy^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=117 EqnNumber=20 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[37, 20, 10, 11, 2, 1, 2, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 3, 4, 11, 1, 2, 3, 4, 11, 1, 1, 9, 2, 26, 11, 28, 6]"+
"// DOEMatrixRow=[69, 22, 12, 3, 1, 2, 3, 2, 1, 1, 2, 1, 2, 3, 4, 2, 3, 22, 1, 3, 1, 3, 1, 2, 5, 3, 1, 2, 1, 7, 2, 3, 20]"+
//Tail EqnIndex=117 EqnNumber=20 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[37, 20, 10, 11, 2, 1, 2, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 3, 4, 11, 1, 2, 3, 4, 11, 1, 1, 9, 2, 26, 11, 28, 6]"+
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

public static void TestCaseDiff121119() {
 UsageCalculus.TestCase = 121119;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xyz/3*xyz^2*-1*xyz^3*-3*xyz3*x0^21*xyz^3*-3*xyz-3*xyz/1*xyz^2*-2*xyz^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyz^33*xyz/-1*xyz^2-1*x0^2*-2*x0^3*3*x02*xyz^3*3*xyz/1*xyz^2*--3*xyz^33*xyz1*x0^2*--3*x0^32*xyz/3*xyz^23*x0^2*-1*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=118 EqnNumber=21 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[3, 21, 11, 12, 3, 2, 3, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 1, 1, 12, 2, 3, 1, 1, 12, 2, 3, 10, 3, 27, 12, 29, 7]"+
"// DOEMatrixRow=[33, 23, 13, 4, 2, 3, 1, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 23, 2, 1, 2, 4, 2, 3, 6, 4, 2, 3, 2, 8, 1, 4, 1]"+
//Tail EqnIndex=118 EqnNumber=21 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[3, 21, 11, 12, 3, 2, 3, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 1, 1, 12, 2, 3, 1, 1, 12, 2, 3, 10, 3, 27, 12, 29, 7]"+
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

public static void TestCaseDiff121120() {
 UsageCalculus.TestCase = 121120;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*x0^21*xyza^3*-3*xyza-3*xyza/1*xyza^2*-2*xyza^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyza^33*xyza/-1*xyza^2-1*x0^2*-2*x0^3*3*x02*xyza^3*3*xyza/1*xyza^2*--3*xyza^33*xyza1*x0^2*--3*x0^3-3*xyza^3*1*xyza/2*xyza^21*xyza/2*xyza^2*-3*xyza^3*-1*xyza3*x0^2*-1*x0^31*xyza^3*-3*xyza";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=119 EqnNumber=22 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[68, 22, 12, 13, 4, 3, 1, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 2, 13, 3, 1, 2, 3, 13, 3, 4, 11, 4, 28, 13, 30, 8]"+
"// DOEMatrixRow=[100, 24, 14, 1, 3, 1, 2, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 24, 3, 2, 3, 5, 3, 1, 1, 1, 3, 1, 3, 9, 2, 5, 2]"+
//Tail EqnIndex=119 EqnNumber=22 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[68, 22, 12, 13, 4, 3, 1, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 2, 13, 3, 1, 2, 3, 13, 3, 4, 11, 4, 28, 13, 30, 8]"+
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

public static void TestCaseDiff121121() {
 UsageCalculus.TestCase = 121121;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x^3*-3*x-3*x/1*x^2*-2*x^31*x0^2*-2*x0^3*3*x0/-1*x0^22*x^33*x/-1*x^2-1*x0^2*-2*x0^3*3*x02*x^3*3*x/1*x^2*--3*x^33*x1*x0^2*--3*x0^3-3*x^3*1*x/2*x^21*x/2*x^2*-3*x^3*-1*x2*x0^23*x^3*-1*x1*x^3*-3*x-3*x/1*x^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=120 EqnNumber=23 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[32, 23, 13, 14, 1, 1, 2, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 3, 14, 1, 2, 3, 4, 14, 1, 1, 12, 1, 29, 14, 31, 9]"+
"// DOEMatrixRow=[61, 25, 15, 2, 1, 2, 3, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 25, 4, 3, 1, 1, 1, 2, 3, 2, 1, 2, 4, 10, 1, 6, 3]"+
//Tail EqnIndex=120 EqnNumber=23 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[32, 23, 13, 14, 1, 1, 2, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 3, 14, 1, 2, 3, 4, 14, 1, 1, 12, 1, 29, 14, 31, 9]"+
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

public static void TestCaseDiff121122() {
 UsageCalculus.TestCase = 121122;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xy/1*xy^2*-2*xy^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xy^33*xy/-1*xy^2-1*x0^2*-2*x0^3*3*x02*xy^3*3*xy/1*xy^2*--3*xy^33*xy1*x0^2*--3*x0^3-3*xy^3*1*xy/2*xy^21*xy/2*xy^2*-3*xy^3*-1*xy2*x0^23*xy^3*-1*xy-1*xy/2*xy^2*-3*xy2*x0^2*-3*x0*1*x0^2/-3*x0-3*xy/1*xy^21*x0^2*-2*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=121 EqnNumber=24 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[99, 24, 14, 15, 2, 3, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 4, 15, 2, 3, 1, 1, 15, 2, 3, 13, 2, 30, 15, 32, 10]"+
"// DOEMatrixRow=[28, 26, 16, 3, 2, 3, 1, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 26, 5, 1, 2, 3, 2, 3, 4, 3, 2, 3, 1, 11, 2, 7, 4]"+
//Tail EqnIndex=121 EqnNumber=24 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[99, 24, 14, 15, 2, 3, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 4, 15, 2, 3, 1, 1, 15, 2, 3, 13, 2, 30, 15, 32, 10]"+
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

public static void TestCaseDiff121123() {
 UsageCalculus.TestCase = 121123;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x0^2*-2*x0^3*3*x0/-1*x0^22*xyz^33*xyz/-1*xyz^2-1*x0^2*-2*x0^3*3*x02*xyz^3*3*xyz/1*xyz^2*--3*xyz^33*xyz1*x0^2*--3*x0^3-3*xyz^3*1*xyz/2*xyz^21*xyz/2*xyz^2*-3*xyz^3*-1*xyz2*x0^23*xyz^3*-1*xyz-1*xyz/2*xyz^2*-3*xyz2*x0^2*-3*x0*1*x0^2/-3*x03*xyz1*xyz^2/-3*xyz1*x0^2*-2*x0^32*xyz^3*3*xyz";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=122 EqnNumber=25 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[63, 25, 15, 16, 3, 1, 2, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 5, 3, 1, 16, 3, 1, 2, 3, 16, 3, 4, 14, 3, 31, 16, 1, 11]"+
"// DOEMatrixRow=[94, 27, 17, 4, 3, 1, 2, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 27, 6, 2, 3, 4, 3, 1, 5, 4, 3, 1, 2, 12, 1, 8, 5]"+
//Tail EqnIndex=122 EqnNumber=25 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[63, 25, 15, 16, 3, 1, 2, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 5, 3, 1, 16, 3, 1, 2, 3, 16, 3, 4, 14, 3, 31, 16, 1, 11]"+
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

public static void TestCaseDiff121124() {
 UsageCalculus.TestCase = 121124;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xyza^33*xyza/-1*xyza^2-1*x0^2*-2*x0^3*3*x02*xyza^3*3*xyza/1*xyza^2*--3*xyza^33*xyza1*x0^2*--3*x0^3-3*xyza^3*1*xyza/2*xyza^21*xyza/2*xyza^2*-3*xyza^3*-1*xyza2*x0^23*xyza^3*-1*xyza-1*xyza/2*xyza^2*-3*xyza2*x0^2*-3*x0*1*x0^2/-3*x03*xyza1*xyza^2/-3*xyza-3*xyza*-1*xyza^2*2*xyza1*xy012^2*2*xy012/3*xy012^2*-1*xy0122*xyza^3*3*xyza3*xyza/-1*xyza^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=123 EqnNumber=26 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[27, 26, 16, 17, 4, 2, 3, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 1, 1, 2, 1, 1, 2, 3, 4, 1, 1, 1, 15, 4, 32, 1, 2, 12]"+
"// DOEMatrixRow=[59, 28, 18, 1, 1, 2, 3, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 28, 7, 3, 1, 5, 1, 2, 6, 1, 1, 2, 3, 13, 2, 9, 6]"+
//Tail EqnIndex=123 EqnNumber=26 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[27, 26, 16, 17, 4, 2, 3, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 1, 1, 2, 1, 1, 2, 3, 4, 1, 1, 1, 15, 4, 32, 1, 2, 12]"+
"// DOEMatrixRow=[59, 28, 18, 1, 1, 2, 3, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 28, 7, 3, 1, 5, 1, 2, 6, 1, 1, 2, 3, 13, 2, 9, 6]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-2.0*xyza^36.0+x0^2.0*162.0*xyza^39.0-x0^2.0*9.0*xyza^33.0-x0^3.0*3.0+x0^23.0*2.25*xyza^35.0-1.0/2.0*xyza^6.0+12.0*xyza^9.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-2.0*36.0*xyza^35.0+x0^2.0*162.0*39.0*xyza^38.0-x0^2.0*9.0*33.0*xyza^32.0-x0^3.0*3.0*0.0+x0^23.0*2.25*35.0*xyza^34.0-1.0/2.0*6.0*xyza^5.0+12.0*9.0*xyza^8.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-72.0*xyza^35.0+x0^2.0*6318.0*xyza^38.0-x0^2.0*297.0*xyza^32.0-x0^3.0*0.0+x0^23.0*78.75*xyza^34.0-3.0*xyza^5.0+108.0*xyza^8.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-2.0*xyza^36.0+x0^2.0*162.0*xyza^39.0-x0^2.0*9.0*xyza^33.0-x0^3.0*3.0+x0^23.0*2.25*xyza^35.0-1.0/2.0*xyza^6.0+12.0*xyza^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-2.0/37.0*xyza^37.0+x0^2.0*162.0/40.0*xyza^40.0-x0^2.0*9.0/34.0*xyza^34.0-x0^3.0*xyza+x0^23.0*2.25/36.0*xyza^36.0-1.0/2.0/7.0*xyza^7.0+12.0/10.0*xyza^10.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-0.05405405405405406*xyza^37.0+x0^2.0*4.05*xyza^40.0-x0^2.0*0.2647058823529412*xyza^34.0-x0^3.0*xyza+x0^23.0/16.0*xyza^36.0-1.0/14.0*xyza^7.0+1.2*xyza^10.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-72.0*xyza^35.0+x0^2.0*6318.0*xyza^38.0-x0^2.0*297.0*xyza^32.0-x0^3.0*0.0+x0^23.0*78.75*xyza^34.0-3.0*xyza^5.0+108.0*xyza^8.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-72.0*35.0*xyza^34.0+x0^2.0*6318.0*38.0*xyza^37.0-x0^2.0*297.0*32.0*xyza^31.0-x0^3.0*0.0*0.0+x0^23.0*78.75*34.0*xyza^33.0-3.0*5.0*xyza^4.0+108.0*8.0*xyza^7.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-2520.0*xyza^34.0+x0^2.0*240084.0*xyza^37.0-x0^2.0*9504.0*xyza^31.0-x0^3.0*0.0+x0^23.0*2677.5*xyza^33.0-15.0*xyza^4.0+864.0*xyza^7.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-0.05405405405405406*xyza^37.0+x0^2.0*4.05*xyza^40.0-x0^2.0*0.2647058823529412*xyza^34.0-x0^3.0*xyza+x0^23.0/16.0*xyza^36.0-1.0/14.0*xyza^7.0+1.2*xyza^10.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-0.05405405405405406/38.0*xyza^38.0+x0^2.0*4.05/41.0*xyza^41.0-x0^2.0*0.2647058823529412/35.0*xyza^35.0-x0^3.0/2.0*xyza^2.0+x0^23.0/16.0/37.0*xyza^37.0-1.0/14.0/8.0*xyza^8.0+1.2/11.0*xyza^11.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-0.001422475106685633*xyza^38.0+x0^2.0*0.09878048780487804*xyza^41.0-x0^2.0*0.007563025210084034*xyza^35.0-x0^3.0/2.0*xyza^2.0+x0^23.0/592.0*xyza^37.0-1.0/112.0*xyza^8.0+1.0/9.166666666666668*xyza^11.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-2520.0*xyza^34.0+x0^2.0*240084.0*xyza^37.0-x0^2.0*9504.0*xyza^31.0-x0^3.0*0.0+x0^23.0*2677.5*xyza^33.0-15.0*xyza^4.0+864.0*xyza^7.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-2520.0*34.0*xyza^33.0+x0^2.0*240084.0*37.0*xyza^36.0-x0^2.0*9504.0*31.0*xyza^30.0-x0^3.0*0.0*0.0+x0^23.0*2677.5*33.0*xyza^32.0-15.0*4.0*xyza^3.0+864.0*7.0*xyza^6.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-85680.0*xyza^33.0+x0^2.0*8883108.0*xyza^36.0-x0^2.0*294624.0*xyza^30.0-x0^3.0*0.0+x0^23.0*88357.5*xyza^32.0-60.0*xyza^3.0+6048.0*xyza^6.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-0.001422475106685633*xyza^38.0+x0^2.0*0.09878048780487804*xyza^41.0-x0^2.0*0.007563025210084034*xyza^35.0-x0^3.0/2.0*xyza^2.0+x0^23.0/592.0*xyza^37.0-1.0/112.0*xyza^8.0+1.0/9.166666666666668*xyza^11.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-0.001422475106685633/39.0*xyza^39.0+x0^2.0*0.09878048780487804/42.0*xyza^42.0-x0^2.0*0.007563025210084034/36.0*xyza^36.0-x0^3.0/2.0/3.0*xyza^3.0+x0^23.0/592.0/38.0*xyza^38.0-1.0/112.0/9.0*xyza^9.0+1.0/9.166666666666668/12.0*xyza^12.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-3.6473720684247E-5*xyza^39.0+x0^2.0*0.00235191637630662*xyza^42.0-x0^2.0*2.100840336134454E-4*xyza^36.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^23.0/22496.0*xyza^38.0-1.0/1008.0*xyza^9.0+1.0/110.00000000000001*xyza^12.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-85680.0*xyza^33.0+x0^2.0*8883108.0*xyza^36.0-x0^2.0*294624.0*xyza^30.0-x0^3.0*0.0+x0^23.0*88357.5*xyza^32.0-60.0*xyza^3.0+6048.0*xyza^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-85680.0*33.0*xyza^32.0+x0^2.0*8883108.0*36.0*xyza^35.0-x0^2.0*294624.0*30.0*xyza^29.0-x0^3.0*0.0*0.0+x0^23.0*88357.5*32.0*xyza^31.0-60.0*3.0*xyza^2.0+6048.0*6.0*xyza^5.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-2827440.0*xyza^32.0+x0^2.0*3.19791888E8*xyza^35.0-x0^2.0*8838720.0*xyza^29.0-x0^3.0*0.0+x0^23.0*2827440.0*xyza^31.0-180.0*xyza^2.0+36288.0*xyza^5.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-3.6473720684247E-5*xyza^39.0-5.0*xyza^39.0+x0^2.0*0.00235191637630662*xyza^42.0-x0^2.0*2.100840336134454E-4*xyza^36.0-4.0*xyza^36.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^23.0/22496.0*xyza^38.0-1.0/1008.0*xyza^9.0+1.0/110.00000000000001*xyza^12.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-3.6473720684247E-5/40.0*xyza^40.0-5.0/40.0*xyza^40.0+x0^2.0*0.00235191637630662/43.0*xyza^43.0-x0^2.0*2.100840336134454E-4/37.0*xyza^37.0-4.0/37.0*xyza^37.0-x0^3.0*0.16666666666666666/4.0*xyza^4.0+x0^23.0/22496.0/39.0*xyza^39.0-1.0/1008.0/10.0*xyza^10.0+1.0/110.00000000000001/13.0*xyza^13.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/1096680.0*xyza^40.0-1.0/8.0*xyza^40.0-0.125*xyza^40.0+x0^2.0*5.46957296815493E-5*xyza^43.0-x0^2.0/176120.0*xyza^37.0-1.0/9.25*xyza^37.0-0.10810810810810811*xyza^37.0-x0^3.0*0.041666666666666664*xyza^4.0+x0^23.0/877344.0*xyza^39.0-1.0/10080.0*xyza^10.0+1.0/1430.0000000000002*xyza^13.0";
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

public static void TestCaseDiff121125() {
 UsageCalculus.TestCase = 121125;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*x/-1*x^2-1*x0^2*-2*x0^3*3*x02*x^3*3*x/1*x^2*--3*x^33*x1*x0^2*--3*x0^3-3*x^3*1*x/2*x^21*x/2*x^2*-3*x^3*-1*x2*x0^23*x^3*-1*x-1*x/2*x^2*-3*x2*x0^2*-3*x0*1*x0^2/-3*x03*x1*x^2/-3*x-3*x*-1*x^2*2*x1*xy012^2*2*xy012/3*xy012^2*-1*xy0122*x3*x^2*-1*x3*x/-1*x^2-1*x0^2*-2*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=124 EqnNumber=27 FamilyID=1 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[93, 27, 17, 18, 1, 3, 1, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 1, 2, 3, 2, 16, 1, 1, 2, 3, 13]"+
"// DOEMatrixRow=[23, 29, 19, 2, 3, 1, 1, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 29, 8, 1, 2, 1, 2, 3, 1, 2, 3, 1, 4, 14, 1, 10, 7]"+
//Tail EqnIndex=124 EqnNumber=27 FamilyID=1 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[93, 27, 17, 18, 1, 3, 1, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 1, 2, 3, 2, 16, 1, 1, 2, 3, 13]"+
"// DOEMatrixRow=[23, 29, 19, 2, 3, 1, 1, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 29, 8, 1, 2, 1, 2, 3, 1, 2, 3, 1, 4, 14, 1, 10, 7]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-3.0*x^3.0+162.0*x^39.0-9.0*x^33.0-3.0+2.25*x^35.0-1.0/2.0*x^6.0-4.0*x^8.0+2.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-3.0*3.0*x^2.0+162.0*39.0*x^38.0-9.0*33.0*x^32.0-3.0*0.0+2.25*35.0*x^34.0-1.0/2.0*6.0*x^5.0-4.0*8.0*x^7.0+2.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-9.0*x^2.0+6318.0*x^38.0-297.0*x^32.0+78.75*x^34.0-3.0*x^5.0-32.0*x^7.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-3.0*x^3.0+162.0*x^39.0-9.0*x^33.0-3.0+2.25*x^35.0-1.0/2.0*x^6.0-4.0*x^8.0+2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-3.0/4.0*x^4.0+162.0/40.0*x^40.0-9.0/34.0*x^34.0-3.0*x+2.25/36.0*x^36.0-1.0/2.0/7.0*x^7.0-4.0/9.0*x^9.0+2.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/1.3333333333333333*x^4.0+4.05*x^40.0-1.0/3.7777777777777777*x^34.0-3.0*x+1.0/16.0*x^36.0-1.0/14.0*x^7.0-1.0/2.25*x^9.0+2.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-9.0*x^2.0+6318.0*x^38.0-297.0*x^32.0+78.75*x^34.0-3.0*x^5.0-32.0*x^7.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-9.0*2.0*x^1.0+6318.0*38.0*x^37.0-297.0*32.0*x^31.0+78.75*34.0*x^33.0-3.0*5.0*x^4.0-32.0*7.0*x^6.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-18.0*x+240084.0*x^37.0-9504.0*x^31.0+2677.5*x^33.0-15.0*x^4.0-224.0*x^6.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/1.3333333333333333*x^4.0+4.05*x^40.0-1.0/3.7777777777777777*x^34.0-3.0*x+1.0/16.0*x^36.0-1.0/14.0*x^7.0-1.0/2.25*x^9.0+2.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/1.3333333333333333/5.0*x^5.0+4.05/41.0*x^41.0-1.0/3.7777777777777777/35.0*x^35.0-3.0/2.0*x^2.0+1.0/16.0/37.0*x^37.0-1.0/14.0/8.0*x^8.0-1.0/2.25/10.0*x^10.0+x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/6.666666666666666*x^5.0+1.0/10.123456790123457*x^41.0-1.0/132.22222222222223*x^35.0-1.5*x^2.0+1.0/592.0*x^37.0-1.0/112.0*x^8.0-0.044444444444444446*x^10.0+x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-18.0*x+240084.0*x^37.0-9504.0*x^31.0+2677.5*x^33.0-15.0*x^4.0-224.0*x^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-18.0+240084.0*37.0*x^36.0-9504.0*31.0*x^30.0+2677.5*33.0*x^32.0-15.0*4.0*x^3.0-224.0*6.0*x^5.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-18.0+8883108.0*x^36.0-294624.0*x^30.0+88357.5*x^32.0-60.0*x^3.0-1344.0*x^5.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/6.666666666666666*x^5.0+1.0/10.123456790123457*x^41.0-1.0/132.22222222222223*x^35.0-1.5*x^2.0+1.0/592.0*x^37.0-1.0/112.0*x^8.0-0.044444444444444446*x^10.0+x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/6.666666666666666/6.0*x^6.0+1.0/10.123456790123457/42.0*x^42.0-1.0/132.22222222222223/36.0*x^36.0-1.5/3.0*x^3.0+1.0/592.0/38.0*x^38.0-1.0/112.0/9.0*x^9.0-0.044444444444444446/11.0*x^11.0+1.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/40.0*x^6.0+1.0/425.1851851851852*x^42.0-1.0/4760.0*x^36.0-1.0/2.0*x^3.0+1.0/22496.0*x^38.0-1.0/1008.0*x^9.0-1.0/247.5*x^11.0+1.0/3.0*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-18.0+8883108.0*x^36.0-294624.0*x^30.0+88357.5*x^32.0-60.0*x^3.0-1344.0*x^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0+8883108.0*36.0*x^35.0-294624.0*30.0*x^29.0+88357.5*32.0*x^31.0-60.0*3.0*x^2.0-1344.0*5.0*x^4.0";
 UsageCalculus.EqnSolArrayMap2[4] = "3.19791888E8*x^35.0-8838720.0*x^29.0+2827440.0*x^31.0-180.0*x^2.0-6720.0*x^4.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/40.0*x^6.0+1.0/425.1851851851852*x^42.0-1.0/4760.0*x^36.0-1.0/2.0*x^3.0+1.0/22496.0*x^38.0-1.0/1008.0*x^9.0-1.0/247.5*x^11.0+1.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/40.0/7.0*x^7.0+1.0/425.1851851851852/43.0*x^43.0-1.0/4760.0/37.0*x^37.0-1.0/2.0/4.0*x^4.0+1.0/22496.0/39.0*x^39.0-1.0/1008.0/10.0*x^10.0-1.0/247.5/12.0*x^12.0+1.0/3.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/280.0*x^7.0+1.0/18282.962962962964*x^43.0-1.0/176120.0*x^37.0-1.0/8.0*x^4.0+1.0/877344.0*x^39.0-1.0/10080.0*x^10.0-1.0/2970.0*x^12.0+1.0/12.0*x^4.0";
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

public static void TestCaseDiff121126() {
 UsageCalculus.TestCase = 121126;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-1*x0^2*-2*x0^3*3*x02*xy^3*3*xy/1*xy^2*--3*xy^33*xy1*x0^2*--3*x0^3-3*xy^3*1*xy/2*xy^21*xy/2*xy^2*-3*xy^3*-1*xy2*x0^23*xy^3*-1*xy-1*xy/2*xy^2*-3*xy2*x0^2*-3*x0*1*x0^2/-3*x03*xy1*xy^2/-3*xy-3*xy*-1*xy^2*2*xy1*xy012^2*2*xy012/3*xy012^2*-1*xy0122*xy3*xy^2*-1*xy-1*xy/2*xy^2*-3*xy^32*xy012^2*-3*xy012^3*1*xy012/-3*xy012^2-1*x0^2*-2*x0^32*xy^3*3*xy";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=125 EqnNumber=28 FamilyID=3 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[58, 28, 18, 19, 2, 1, 2, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 3, 4, 3, 1, 2, 3, 2, 3, 1, 3, 1, 2, 3, 4, 5, 14]"+
"// DOEMatrixRow=[89, 30, 20, 3, 1, 2, 3, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 30, 9, 2, 3, 2, 3, 1, 2, 3, 1, 2, 1, 15, 2, 11, 8]"+
//Tail EqnIndex=125 EqnNumber=28 FamilyID=3 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[58, 28, 18, 19, 2, 1, 2, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 3, 4, 3, 1, 2, 3, 2, 3, 1, 3, 1, 2, 3, 4, 5, 14]"+
"// DOEMatrixRow=[89, 30, 20, 3, 1, 2, 3, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 30, 9, 2, 3, 2, 3, 1, 2, 3, 1, 2, 1, 15, 2, 11, 8]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0*162.0*xy^39.0-x0^2.0*9.0*xy^33.0-x0^3.0*3.0+x0^23.0*2.25*xy^35.0-1.0/2.0*xy^6.0+4.0*xy^6.0+1.5*xy^35.0+x0^2.0*6.0*xy^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0*162.0*39.0*xy^38.0-x0^2.0*9.0*33.0*xy^32.0-x0^3.0*3.0*0.0+x0^23.0*2.25*35.0*xy^34.0-1.0/2.0*6.0*xy^5.0+4.0*6.0*xy^5.0+1.5*35.0*xy^34.0+x0^2.0*6.0*4.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*6318.0*xy^38.0-x0^2.0*297.0*xy^32.0-x0^3.0*0.0+x0^23.0*78.75*xy^34.0-3.0*xy^5.0+24.0*xy^5.0+52.5*xy^34.0+x0^2.0*24.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0*162.0*xy^39.0-x0^2.0*9.0*xy^33.0-x0^3.0*3.0+x0^23.0*2.25*xy^35.0-1.0/2.0*xy^6.0+4.0*xy^6.0+1.5*xy^35.0+x0^2.0*6.0*xy^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0*162.0/40.0*xy^40.0-x0^2.0*9.0/34.0*xy^34.0-x0^3.0*xy+x0^23.0*2.25/36.0*xy^36.0-1.0/2.0/7.0*xy^7.0+4.0/7.0*xy^7.0+1.5/36.0*xy^36.0+x0^2.0*6.0/5.0*xy^5.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0*4.05*xy^40.0-x0^2.0*0.2647058823529412*xy^34.0-x0^3.0*xy+x0^23.0/16.0*xy^36.0-1.0/14.0*xy^7.0+1.0/1.75*xy^7.0+0.041666666666666664*xy^36.0+x0^2.0*1.2*xy^5.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*6318.0*xy^38.0-x0^2.0*297.0*xy^32.0-x0^3.0*0.0+x0^23.0*78.75*xy^34.0-3.0*xy^5.0+24.0*xy^5.0+52.5*xy^34.0+x0^2.0*24.0*xy^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*6318.0*38.0*xy^37.0-x0^2.0*297.0*32.0*xy^31.0-x0^3.0*0.0*0.0+x0^23.0*78.75*34.0*xy^33.0-3.0*5.0*xy^4.0+24.0*5.0*xy^4.0+52.5*34.0*xy^33.0+x0^2.0*24.0*3.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*240084.0*xy^37.0-x0^2.0*9504.0*xy^31.0-x0^3.0*0.0+x0^23.0*2677.5*xy^33.0-15.0*xy^4.0+120.0*xy^4.0+1785.0*xy^33.0+x0^2.0*72.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0*4.05*xy^40.0-x0^2.0*0.2647058823529412*xy^34.0-x0^3.0*xy+x0^23.0/16.0*xy^36.0-1.0/14.0*xy^7.0+1.0/1.75*xy^7.0+0.041666666666666664*xy^36.0+x0^2.0*1.2*xy^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0*4.05/41.0*xy^41.0-x0^2.0*0.2647058823529412/35.0*xy^35.0-x0^3.0/2.0*xy^2.0+x0^23.0/16.0/37.0*xy^37.0-1.0/14.0/8.0*xy^8.0+1.0/1.75/8.0*xy^8.0+0.041666666666666664/37.0*xy^37.0+x0^2.0*1.2/6.0*xy^6.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0*0.09878048780487804*xy^41.0-x0^2.0*0.007563025210084034*xy^35.0-x0^3.0/2.0*xy^2.0+x0^23.0/592.0*xy^37.0-1.0/112.0*xy^8.0+1.0/14.0*xy^8.0+0.0011261261261261261*xy^37.0+x0^2.0/5.0*xy^6.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*240084.0*xy^37.0-x0^2.0*9504.0*xy^31.0-x0^3.0*0.0+x0^23.0*2677.5*xy^33.0-15.0*xy^4.0+120.0*xy^4.0+1785.0*xy^33.0+x0^2.0*72.0*xy^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*240084.0*37.0*xy^36.0-x0^2.0*9504.0*31.0*xy^30.0-x0^3.0*0.0*0.0+x0^23.0*2677.5*33.0*xy^32.0-15.0*4.0*xy^3.0+120.0*4.0*xy^3.0+1785.0*33.0*xy^32.0+x0^2.0*72.0*2.0*xy^1.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*8883108.0*xy^36.0-x0^2.0*294624.0*xy^30.0-x0^3.0*0.0+x0^23.0*88357.5*xy^32.0-60.0*xy^3.0+480.0*xy^3.0+58905.0*xy^32.0+x0^2.0*144.0*xy";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0*0.09878048780487804*xy^41.0-x0^2.0*0.007563025210084034*xy^35.0-x0^3.0/2.0*xy^2.0+x0^23.0/592.0*xy^37.0-1.0/112.0*xy^8.0+1.0/14.0*xy^8.0+0.0011261261261261261*xy^37.0+x0^2.0/5.0*xy^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0*0.09878048780487804/42.0*xy^42.0-x0^2.0*0.007563025210084034/36.0*xy^36.0-x0^3.0/2.0/3.0*xy^3.0+x0^23.0/592.0/38.0*xy^38.0-1.0/112.0/9.0*xy^9.0+1.0/14.0/9.0*xy^9.0+0.0011261261261261261/38.0*xy^38.0+x0^2.0*5.0/7.0*xy^7.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0*0.00235191637630662*xy^42.0-x0^2.0*2.100840336134454E-4*xy^36.0-x0^3.0*0.16666666666666666*xy^3.0+x0^23.0/22496.0*xy^38.0-1.0/1008.0*xy^9.0+1.0/126.0*xy^9.0+2.9634898055950688E-5*xy^38.0+x0^2.0/1.4*xy^7.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*8883108.0*xy^36.0-x0^2.0*294624.0*xy^30.0-x0^3.0*0.0+x0^23.0*88357.5*xy^32.0-60.0*xy^3.0+480.0*xy^3.0+58905.0*xy^32.0+x0^2.0*144.0*xy";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*8883108.0*36.0*xy^35.0-x0^2.0*294624.0*30.0*xy^29.0-x0^3.0*0.0*0.0+x0^23.0*88357.5*32.0*xy^31.0-60.0*3.0*xy^2.0+480.0*3.0*xy^2.0+58905.0*32.0*xy^31.0+x0^2.0*144.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*3.19791888E8*xy^35.0-x0^2.0*8838720.0*xy^29.0-x0^3.0*0.0+x0^23.0*2827440.0*xy^31.0-180.0*xy^2.0+1440.0*xy^2.0+1884960.0*xy^31.0+x0^2.0*144.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0*0.00235191637630662*xy^42.0-x0^2.0*2.100840336134454E-4*xy^36.0-4.0*xy^36.0-x0^3.0*0.16666666666666666*xy^3.0+x0^23.0/22496.0*xy^38.0-1.0/1008.0*xy^9.0+1.0/126.0*xy^9.0+2.9634898055950688E-5*xy^38.0-5.0*xy^38.0+x0^2.0/1.4*xy^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0*0.00235191637630662/43.0*xy^43.0-x0^2.0*2.100840336134454E-4/37.0*xy^37.0-4.0/37.0*xy^37.0-x0^3.0*0.16666666666666666/4.0*xy^4.0+x0^23.0/22496.0/39.0*xy^39.0-1.0/1008.0/10.0*xy^10.0+1.0/126.0/10.0*xy^10.0+2.9634898055950688E-5/39.0*xy^39.0-5.0/39.0*xy^39.0+x0^2.0*1.4/8.0*xy^8.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0*5.46957296815493E-5*xy^43.0-x0^2.0/176120.0*xy^37.0-1.0/9.25*xy^37.0-0.10810810810810811*xy^37.0-x0^3.0*0.041666666666666664*xy^4.0+x0^23.0/877344.0*xy^39.0-1.0/10080.0*xy^10.0+1.0/1260.0*xy^10.0+1.0/1316016.0*xy^39.0-1.0/7.8*xy^39.0-0.1282051282051282*xy^39.0+x0^2.0/5.714285714285714*xy^8.0";
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

public static void TestCaseDiff121127() {
 UsageCalculus.TestCase = 121127;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xyz^3*3*xyz/1*xyz^2*--3*xyz^33*xyz1*x0^2*--3*x0^3-3*xyz^3*1*xyz/2*xyz^21*xyz/2*xyz^2*-3*xyz^3*-1*xyz2*x0^23*xyz^3*-1*xyz-1*xyz/2*xyz^2*-3*xyz2*x0^2*-3*x0*1*x0^2/-3*x03*xyz1*xyz^2/-3*xyz-3*xyz*-1*xyz^2*2*xyz1*xy012^2*2*xy012/3*xy012^2*-1*xy0122*xyz3*xyz^2*-1*xyz-1*xyz/2*xyz^2*-3*xyz^32*xy012^2*-3*xy012^3*1*xy012/-3*xy012^23*xyz^31*xyz/-3*xyz^22*xyz^3*3*xyz3*xyz/1*xyz^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=126 EqnNumber=29 FamilyID=1 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[22, 29, 19, 20, 3, 2, 3, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 1, 1, 4, 2, 3, 1, 3, 4, 2, 4, 2, 3, 4, 5, 6, 15]"+
"// DOEMatrixRow=[54, 31, 1, 4, 2, 3, 1, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 31, 10, 3, 1, 3, 1, 2, 3, 4, 2, 3, 2, 16, 1, 12, 9]"+
//Tail EqnIndex=126 EqnNumber=29 FamilyID=1 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[22, 29, 19, 20, 3, 2, 3, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 1, 1, 4, 2, 3, 1, 3, 4, 2, 4, 2, 3, 4, 5, 6, 15]"+
"// DOEMatrixRow=[54, 31, 1, 4, 2, 3, 1, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 31, 10, 3, 1, 3, 1, 2, 3, 4, 2, 3, 2, 16, 1, 12, 9]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0*54.0*xyz^39.0-x0^2.0*9.0*xyz^33.0-x0^3.0*3.0+x0^23.0*2.25*xyz^35.0-1.0/2.0*xyz^6.0+4.0*xyz^6.0-1.5*xyz^95.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0*54.0*39.0*xyz^38.0-x0^2.0*9.0*33.0*xyz^32.0-x0^3.0*3.0*0.0+x0^23.0*2.25*35.0*xyz^34.0-1.0/2.0*6.0*xyz^5.0+4.0*6.0*xyz^5.0-1.5*95.0*xyz^94.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*2106.0*xyz^38.0-x0^2.0*297.0*xyz^32.0-x0^3.0*0.0+x0^23.0*78.75*xyz^34.0-3.0*xyz^5.0+24.0*xyz^5.0-142.5*xyz^94.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0*54.0*xyz^39.0-x0^2.0*9.0*xyz^33.0-x0^3.0*3.0+x0^23.0*2.25*xyz^35.0-1.0/2.0*xyz^6.0+4.0*xyz^6.0-1.5*xyz^95.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0*54.0/40.0*xyz^40.0-x0^2.0*9.0/34.0*xyz^34.0-x0^3.0*xyz+x0^23.0*2.25/36.0*xyz^36.0-1.0/2.0/7.0*xyz^7.0+4.0/7.0*xyz^7.0-1.5/96.0*xyz^96.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0*1.35*xyz^40.0-x0^2.0*0.2647058823529412*xyz^34.0-x0^3.0*xyz+x0^23.0/16.0*xyz^36.0-1.0/14.0*xyz^7.0+1.0/1.75*xyz^7.0-1.0/64.0*xyz^96.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*2106.0*xyz^38.0-x0^2.0*297.0*xyz^32.0-x0^3.0*0.0+x0^23.0*78.75*xyz^34.0-3.0*xyz^5.0+24.0*xyz^5.0-142.5*xyz^94.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*2106.0*38.0*xyz^37.0-x0^2.0*297.0*32.0*xyz^31.0-x0^3.0*0.0*0.0+x0^23.0*78.75*34.0*xyz^33.0-3.0*5.0*xyz^4.0+24.0*5.0*xyz^4.0-142.5*94.0*xyz^93.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*80028.0*xyz^37.0-x0^2.0*9504.0*xyz^31.0-x0^3.0*0.0+x0^23.0*2677.5*xyz^33.0-15.0*xyz^4.0+120.0*xyz^4.0-13395.0*xyz^93.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0*1.35*xyz^40.0-x0^2.0*0.2647058823529412*xyz^34.0-x0^3.0*xyz+x0^23.0/16.0*xyz^36.0-1.0/14.0*xyz^7.0+1.0/1.75*xyz^7.0-1.0/64.0*xyz^96.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0*1.35/41.0*xyz^41.0-x0^2.0*0.2647058823529412/35.0*xyz^35.0-x0^3.0/2.0*xyz^2.0+x0^23.0/16.0/37.0*xyz^37.0-1.0/14.0/8.0*xyz^8.0+1.0/1.75/8.0*xyz^8.0-1.0/64.0/97.0*xyz^97.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0*0.032926829268292684*xyz^41.0-x0^2.0*0.007563025210084034*xyz^35.0-x0^3.0/2.0*xyz^2.0+x0^23.0/592.0*xyz^37.0-1.0/112.0*xyz^8.0+1.0/14.0*xyz^8.0-1.0/6208.0*xyz^97.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*80028.0*xyz^37.0-x0^2.0*9504.0*xyz^31.0-x0^3.0*0.0+x0^23.0*2677.5*xyz^33.0-15.0*xyz^4.0+120.0*xyz^4.0-13395.0*xyz^93.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*80028.0*37.0*xyz^36.0-x0^2.0*9504.0*31.0*xyz^30.0-x0^3.0*0.0*0.0+x0^23.0*2677.5*33.0*xyz^32.0-15.0*4.0*xyz^3.0+120.0*4.0*xyz^3.0-13395.0*93.0*xyz^92.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*2961036.0*xyz^36.0-x0^2.0*294624.0*xyz^30.0-x0^3.0*0.0+x0^23.0*88357.5*xyz^32.0-60.0*xyz^3.0+480.0*xyz^3.0-1245735.0*xyz^92.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0*0.032926829268292684*xyz^41.0-x0^2.0*0.007563025210084034*xyz^35.0-x0^3.0/2.0*xyz^2.0+x0^23.0/592.0*xyz^37.0-1.0/112.0*xyz^8.0+1.0/14.0*xyz^8.0-1.0/6208.0*xyz^97.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0*0.032926829268292684/42.0*xyz^42.0-x0^2.0*0.007563025210084034/36.0*xyz^36.0-x0^3.0/2.0/3.0*xyz^3.0+x0^23.0/592.0/38.0*xyz^38.0-1.0/112.0/9.0*xyz^9.0+1.0/14.0/9.0*xyz^9.0-1.0/6208.0/98.0*xyz^98.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0*7.839721254355401E-4*xyz^42.0-x0^2.0*2.100840336134454E-4*xyz^36.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^23.0/22496.0*xyz^38.0-1.0/1008.0*xyz^9.0+1.0/126.0*xyz^9.0-1.0/608384.0*xyz^98.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*2961036.0*xyz^36.0-x0^2.0*294624.0*xyz^30.0-x0^3.0*0.0+x0^23.0*88357.5*xyz^32.0-60.0*xyz^3.0+480.0*xyz^3.0-1245735.0*xyz^92.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*2961036.0*36.0*xyz^35.0-x0^2.0*294624.0*30.0*xyz^29.0-x0^3.0*0.0*0.0+x0^23.0*88357.5*32.0*xyz^31.0-60.0*3.0*xyz^2.0+480.0*3.0*xyz^2.0-1245735.0*92.0*xyz^91.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*1.06597296E8*xyz^35.0-x0^2.0*8838720.0*xyz^29.0-x0^3.0*0.0+x0^23.0*2827440.0*xyz^31.0-180.0*xyz^2.0+1440.0*xyz^2.0-1.1460762E8*xyz^91.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0*7.839721254355401E-4*xyz^42.0-4.0*xyz^42.0-x0^2.0*2.100840336134454E-4*xyz^36.0-4.0*xyz^36.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^23.0/22496.0*xyz^38.0-1.0/1008.0*xyz^9.0+1.0/126.0*xyz^9.0-1.0/608384.0*xyz^98.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0*7.839721254355401E-4/43.0*xyz^43.0-4.0/43.0*xyz^43.0-x0^2.0*2.100840336134454E-4/37.0*xyz^37.0-4.0/37.0*xyz^37.0-x0^3.0*0.16666666666666666/4.0*xyz^4.0+x0^23.0/22496.0/39.0*xyz^39.0-1.0/1008.0/10.0*xyz^10.0+1.0/126.0/10.0*xyz^10.0-1.0/608384.0/99.0*xyz^99.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0/54848.88888888889*xyz^43.0-1.0/10.75*xyz^43.0-0.09302325581395349*xyz^43.0-x0^2.0/176120.0*xyz^37.0-1.0/9.25*xyz^37.0-0.10810810810810811*xyz^37.0-x0^3.0*0.041666666666666664*xyz^4.0+x0^23.0/877344.0*xyz^39.0-1.0/10080.0*xyz^10.0+1.0/1260.0*xyz^10.0-1.0/6.0230016E7*xyz^99.0";
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

public static void TestCaseDiff121128() {
 UsageCalculus.TestCase = 121128;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xyza1*x0^2*--3*x0^3-3*xyza^3*1*xyza/2*xyza^21*xyza/2*xyza^2*-3*xyza^3*-1*xyza2*x0^23*xyza^3*-1*xyza-1*xyza/2*xyza^2*-3*xyza2*x0^2*-3*x0*1*x0^2/-3*x03*xyza1*xyza^2/-3*xyza-3*xyza*-1*xyza^2*2*xyza1*xy012^2*2*xy012/3*xy012^2*-1*xy0122*xyza3*xyza^2*-1*xyza-1*xyza/2*xyza^2*-3*xyza^32*xy012^2*-3*xy012^3*1*xy012/-3*xy012^23*xyza^31*xyza/-3*xyza^2-3*x0^2*-1*x0^3*2*x01*xyza^3*2*xyza/3*xyza^2*--1*xyza^33*xyza/1*xyza^21*x0^2*--3*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=127 EqnNumber=30 FamilyID=2 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[88, 30, 20, 1, 4, 3, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 2, 3, 5, 3, 1, 2, 4, 5, 3, 1, 3, 4, 5, 6, 7, 16]"+
"// DOEMatrixRow=[18, 32, 2, 1, 3, 1, 2, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 32, 1, 1, 2, 4, 2, 3, 4, 1, 3, 1, 3, 1, 2, 13, 10]"+
//Tail EqnIndex=127 EqnNumber=30 FamilyID=2 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[88, 30, 20, 1, 4, 3, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 2, 3, 5, 3, 1, 2, 4, 5, 3, 1, 3, 4, 5, 6, 7, 16]"+
"// DOEMatrixRow=[18, 32, 2, 1, 3, 1, 2, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 32, 1, 1, 2, 4, 2, 3, 4, 1, 3, 1, 3, 1, 2, 13, 10]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0*9.0-x0^3.0*3.0+x0^23.0*2.25*xyza^35.0-1.0/2.0*xyza^6.0+4.0*xyza^6.0-xy012^2.0*xy012/2.0*xyza^69.0+x0^2.0*x01*12.0*xyza^61.0-x0^2.0*3.0*xyza^55.0-x0^3.0*3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0*9.0*0.0-x0^3.0*3.0*0.0+x0^23.0*2.25*35.0*xyza^34.0-1.0/2.0*6.0*xyza^5.0+4.0*6.0*xyza^5.0-xy012^2.0*xy012/2.0*69.0*xyza^68.0+x0^2.0*x01*12.0*61.0*xyza^60.0-x0^2.0*3.0*55.0*xyza^54.0-x0^3.0*3.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*78.75*xyza^34.0-3.0*xyza^5.0+24.0*xyza^5.0-xy012^2.0*xy012*34.5*xyza^68.0+x0^2.0*x01*732.0*xyza^60.0-x0^2.0*165.0*xyza^54.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0*9.0-x0^3.0*3.0+x0^23.0*2.25*xyza^35.0-1.0/2.0*xyza^6.0+4.0*xyza^6.0-xy012^2.0*xy012/2.0*xyza^69.0+x0^2.0*x01*12.0*xyza^61.0-x0^2.0*3.0*xyza^55.0-x0^3.0*3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0*9.0*xyza-x0^3.0*xyza+x0^23.0*2.25/36.0*xyza^36.0-1.0/2.0/7.0*xyza^7.0+4.0/7.0*xyza^7.0-xy012^2.0*xy012/2.0/70.0*xyza^70.0+x0^2.0*x01*12.0/62.0*xyza^62.0-x0^2.0*3.0/56.0*xyza^56.0-x0^3.0*xyza";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0*9.0*xyza-x0^3.0*xyza+x0^23.0/16.0*xyza^36.0-1.0/14.0*xyza^7.0+0.5714285714285714*xyza^7.0-xy012^2.0*xy012*0.007142857142857143*xyza^70.0+x0^2.0*x01*0.1935483870967742*xyza^62.0-x0^2.0*0.05357142857142857*xyza^56.0-x0^3.0*xyza";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*78.75*xyza^34.0-3.0*xyza^5.0+24.0*xyza^5.0-xy012^2.0*xy012*34.5*xyza^68.0+x0^2.0*x01*732.0*xyza^60.0-x0^2.0*165.0*xyza^54.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^23.0*78.75*34.0*xyza^33.0-3.0*5.0*xyza^4.0+24.0*5.0*xyza^4.0-xy012^2.0*xy012*34.5*68.0*xyza^67.0+x0^2.0*x01*732.0*60.0*xyza^59.0-x0^2.0*165.0*54.0*xyza^53.0-x0^3.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*2677.5*xyza^33.0-15.0*xyza^4.0+120.0*xyza^4.0-xy012^2.0*xy012*2346.0*xyza^67.0+x0^2.0*x01*43920.0*xyza^59.0-x0^2.0*8910.0*xyza^53.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0*9.0*xyza-x0^3.0*xyza+x0^23.0/16.0*xyza^36.0-1.0/14.0*xyza^7.0+0.5714285714285714*xyza^7.0-xy012^2.0*xy012*0.007142857142857143*xyza^70.0+x0^2.0*x01*0.1935483870967742*xyza^62.0-x0^2.0*0.05357142857142857*xyza^56.0-x0^3.0*xyza";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0*9.0/2.0*xyza^2.0-x0^3.0/2.0*xyza^2.0+x0^23.0/16.0/37.0*xyza^37.0-1.0/14.0/8.0*xyza^8.0+0.5714285714285714/8.0*xyza^8.0-xy012^2.0*xy012*0.007142857142857143/71.0*xyza^71.0+x0^2.0*x01*0.1935483870967742/63.0*xyza^63.0-x0^2.0*0.05357142857142857/57.0*xyza^57.0-x0^3.0/2.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0*4.5*xyza^2.0-x0^3.0/2.0*xyza^2.0+x0^23.0/592.0*xyza^37.0-1.0/112.0*xyza^8.0+0.07142857142857142*xyza^8.0-xy012^2.0*xy012*1.0060362173038229E-4*xyza^71.0+x0^2.0*x01*0.0030721966205837174*xyza^63.0-x0^2.0*9.398496240601503E-4*xyza^57.0-x0^3.0/2.0*xyza^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*2677.5*xyza^33.0-15.0*xyza^4.0+120.0*xyza^4.0-xy012^2.0*xy012*2346.0*xyza^67.0+x0^2.0*x01*43920.0*xyza^59.0-x0^2.0*8910.0*xyza^53.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^23.0*2677.5*33.0*xyza^32.0-15.0*4.0*xyza^3.0+120.0*4.0*xyza^3.0-xy012^2.0*xy012*2346.0*67.0*xyza^66.0+x0^2.0*x01*43920.0*59.0*xyza^58.0-x0^2.0*8910.0*53.0*xyza^52.0-x0^3.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*88357.5*xyza^32.0-60.0*xyza^3.0+480.0*xyza^3.0-xy012^2.0*xy012*157182.0*xyza^66.0+x0^2.0*x01*2591280.0*xyza^58.0-x0^2.0*472230.0*xyza^52.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0*4.5*xyza^2.0-x0^3.0/2.0*xyza^2.0+x0^23.0/592.0*xyza^37.0-1.0/112.0*xyza^8.0+0.07142857142857142*xyza^8.0-xy012^2.0*xy012*1.0060362173038229E-4*xyza^71.0-4.0*xyza^71.0+x0^2.0*x01*0.0030721966205837174*xyza^63.0-x0^2.0*9.398496240601503E-4*xyza^57.0-4.0*xyza^57.0-x0^3.0/2.0*xyza^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0*4.5/3.0*xyza^3.0-x0^3.0/2.0/3.0*xyza^3.0+x0^23.0/592.0/38.0*xyza^38.0-1.0/112.0/9.0*xyza^9.0+0.07142857142857142/9.0*xyza^9.0-xy012^2.0*xy012*1.0060362173038229E-4/72.0*xyza^72.0-4.0/72.0*xyza^72.0+x0^2.0*x01*0.0030721966205837174/64.0*xyza^64.0-x0^2.0*9.398496240601503E-4/58.0*xyza^58.0-4.0/58.0*xyza^58.0-x0^3.0*2.0/3.0*xyza^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0*1.5*xyza^3.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^23.0/22496.0*xyza^38.0-1.0/1008.0*xyza^9.0+0.007936507936507936*xyza^9.0-xy012^2.0*xy012/715680.0*xyza^72.0-1.0/18.0*xyza^72.0-0.05555555555555555*xyza^72.0+x0^2.0*x01*4.8003072196620584E-5*xyza^64.0-x0^2.0/61712.0*xyza^58.0-1.0/14.5*xyza^58.0-0.06896551724137931*xyza^58.0-x0^3.0/1.5*xyza^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*88357.5*xyza^32.0-60.0*xyza^3.0+480.0*xyza^3.0-xy012^2.0*xy012*157182.0*xyza^66.0+x0^2.0*x01*2591280.0*xyza^58.0-x0^2.0*472230.0*xyza^52.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^23.0*88357.5*32.0*xyza^31.0-60.0*3.0*xyza^2.0+480.0*3.0*xyza^2.0-xy012^2.0*xy012*157182.0*66.0*xyza^65.0+x0^2.0*x01*2591280.0*58.0*xyza^57.0-x0^2.0*472230.0*52.0*xyza^51.0-x0^3.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*2827440.0*xyza^31.0-180.0*xyza^2.0+1440.0*xyza^2.0-xy012^2.0*xy012*1.0374012E7*xyza^65.0+x0^2.0*x01*1.5029424E8*xyza^57.0-x0^2.0*2.455596E7*xyza^51.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0*1.5*xyza^3.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^23.0/22496.0*xyza^38.0-1.0/1008.0*xyza^9.0+0.007936507936507936*xyza^9.0-xy012^2.0*xy012/715680.0*xyza^72.0-1.0/18.0*xyza^72.0-0.05555555555555555*xyza^72.0+x0^2.0*x01*4.8003072196620584E-5*xyza^64.0-5.0*xyza^64.0-x0^2.0/61712.0*xyza^58.0-1.0/14.5*xyza^58.0-0.06896551724137931*xyza^58.0-x0^3.0/1.5*xyza^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0*1.5/4.0*xyza^4.0-x0^3.0*0.16666666666666666/4.0*xyza^4.0+x0^23.0/22496.0/39.0*xyza^39.0-1.0/1008.0/10.0*xyza^10.0+0.007936507936507936/10.0*xyza^10.0-xy012^2.0*xy012/715680.0/73.0*xyza^73.0-1.0/18.0/73.0*xyza^73.0-0.05555555555555555/73.0*xyza^73.0+x0^2.0*x01*4.8003072196620584E-5/65.0*xyza^65.0-5.0/65.0*xyza^65.0-x0^2.0/61712.0/59.0*xyza^59.0-1.0/14.5/59.0*xyza^59.0-0.06896551724137931/59.0*xyza^59.0-x0^3.0*1.5/4.0*xyza^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0*0.375*xyza^4.0-x0^3.0*0.041666666666666664*xyza^4.0+x0^23.0/877344.0*xyza^39.0-1.0/10080.0*xyza^10.0+7.936507936507937E-4*xyza^10.0-xy012^2.0*xy012/5.224464E7*xyza^73.0-1.0/1314.0*xyza^73.0-7.6103500761035E-4*xyza^73.0+x0^2.0*x01/1354080.0*xyza^65.0-1.0/13.0*xyza^65.0-0.07692307692307693*xyza^65.0-x0^2.0/3641008.0*xyza^59.0-1.0/855.5*xyza^59.0-0.0011689070718877848*xyza^59.0-x0^3.0/2.6666666666666665*xyza^4.0";
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

public static void TestCaseDiff121129() {
 UsageCalculus.TestCase = 121129;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x0^2*--3*x0^31*x0^2*--3*x0^3-3*x^3*1*x";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=128 EqnNumber=31 FamilyID=3 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[53, 31, 1, 2, 1, 1, 2, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 4, 6, 1, 2, 3, 1, 6, 1, 2, 4, 1, 6, 7, 8, 17]"+
"// DOEMatrixRow=[84, 33, 3, 2, 1, 2, 3, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 33, 2, 3, 1, 5, 3, 1, 5, 2, 1, 2, 4, 2, 1, 14, 11]"+
//Tail EqnIndex=128 EqnNumber=31 FamilyID=3 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[53, 31, 1, 2, 1, 1, 2, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 4, 6, 1, 2, 3, 1, 6, 1, 2, 4, 1, 6, 7, 8, 17]"+
"// DOEMatrixRow=[84, 33, 3, 2, 1, 2, 3, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 33, 2, 3, 1, 5, 3, 1, 5, 2, 1, 2, 4, 2, 1, 14, 11]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "9.0-9.0-3.0-3.0*x^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0-9.0*0.0-3.0*0.0-3.0*4.0*x^3.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-12.0*x^3.0";
 UsageCalculus.EqnSolArrayMap3[1] = "9.0-9.0-3.0-3.0*x^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "9.0*x-9.0*x-3.0*x-3.0/5.0*x^5.0";
 UsageCalculus.EqnSolArrayMap4[1] = "9.0*x-9.0*x-3.0*x-1.0/1.6666666666666667*x^5.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-12.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-12.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-36.0*x^2.0";
 UsageCalculus.EqnSolArrayMap3[2] = "9.0*x-9.0*x-3.0*x-1.0/1.6666666666666667*x^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "9.0/2.0*x^2.0-9.0/2.0*x^2.0-3.0/2.0*x^2.0-1.0/1.6666666666666667/6.0*x^6.0";
 UsageCalculus.EqnSolArrayMap4[2] = "4.5*x^2.0-4.5*x^2.0-1.5*x^2.0-1.0/10.0*x^6.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-36.0*x^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-36.0*2.0*x^1.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-72.0*x";
 UsageCalculus.EqnSolArrayMap3[3] = "4.5*x^2.0-4.5*x^2.0-1.5*x^2.0-1.0/10.0*x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "4.5/3.0*x^3.0-4.5/3.0*x^3.0-1.5/3.0*x^3.0-1.0/10.0/7.0*x^7.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.5*x^3.0-1.5*x^3.0-1.0/2.0*x^3.0-1.0/70.0*x^7.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-72.0*x";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-72.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-72.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.5*x^3.0-1.5*x^3.0-1.0/2.0*x^3.0-1.0/70.0*x^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.5/4.0*x^4.0-1.5/4.0*x^4.0-1.0/2.0/4.0*x^4.0-1.0/70.0/8.0*x^8.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/2.6666666666666665*x^4.0-1.0/2.6666666666666665*x^4.0-1.0/8.0*x^4.0-1.0/560.0*x^8.0";
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

public static void TestCaseDiff121130() {
 UsageCalculus.TestCase = 121130;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xy^3*1*xy/2*xy^21*xy/2*xy^2*-3*xy^3*-1*xy-3*xy^3*1*xy1*xy/2*xy^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=129 EqnNumber=32 FamilyID=1 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[17, 32, 2, 3, 2, 3, 1, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 1, 7, 2, 3, 1, 2, 7, 2, 3, 5, 2, 7, 8, 9, 18]"+
"// DOEMatrixRow=[49, 34, 4, 3, 2, 3, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 34, 3, 1, 2, 1, 1, 2, 6, 3, 2, 3, 1, 3, 2, 15, 12]"+
//Tail EqnIndex=129 EqnNumber=32 FamilyID=1 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[17, 32, 2, 3, 2, 3, 1, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 1, 7, 2, 3, 1, 2, 7, 2, 3, 5, 2, 7, 8, 9, 18]"+
"// DOEMatrixRow=[49, 34, 4, 3, 2, 3, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 34, 3, 1, 2, 1, 1, 2, 6, 3, 2, 3, 1, 3, 2, 15, 12]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-2.25*xy^32.0-1.5*xy^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-2.25*32.0*xy^31.0-1.5*6.0*xy^5.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-72.0*xy^31.0-9.0*xy^5.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-2.25*xy^32.0-1.5*xy^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-2.25/33.0*xy^33.0-1.5/7.0*xy^7.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/14.666666666666666*xy^33.0-1.0/4.666666666666667*xy^7.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-72.0*xy^31.0-9.0*xy^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-72.0*31.0*xy^30.0-9.0*5.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-2232.0*xy^30.0-45.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/14.666666666666666*xy^33.0-1.0/4.666666666666667*xy^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/14.666666666666666/34.0*xy^34.0-1.0/4.666666666666667/8.0*xy^8.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/498.66666666666663*xy^34.0-1.0/37.333333333333336*xy^8.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-2232.0*xy^30.0-45.0*xy^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-2232.0*30.0*xy^29.0-45.0*4.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-66960.0*xy^29.0-180.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/498.66666666666663*xy^34.0-1.0/37.333333333333336*xy^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/498.66666666666663/35.0*xy^35.0-1.0/37.333333333333336/9.0*xy^9.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/17453.333333333332*xy^35.0-1.0/336.0*xy^9.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-66960.0*xy^29.0-180.0*xy^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-66960.0*29.0*xy^28.0-180.0*3.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1941840.0*xy^28.0-540.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/17453.333333333332*xy^35.0-1.0/336.0*xy^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/17453.333333333332/36.0*xy^36.0-1.0/336.0/10.0*xy^10.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/628320.0*xy^36.0-1.0/3360.0*xy^10.0";
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

public static void TestCaseDiff121131() {
 UsageCalculus.TestCase = 121131;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xyz/2*xyz^2*-3*xyz^3*-1*xyz2*x0^23*xyz^3*-1*xyz1*xyz/2*xyz^22*x0^2*-3*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=130 EqnNumber=33 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[83, 33, 3, 4, 3, 1, 2, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 3, 8, 3, 1, 2, 3, 8, 3, 4, 6, 3, 8, 9, 10, 19]"+
"// DOEMatrixRow=[13, 35, 5, 4, 3, 1, 2, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 35, 4, 2, 3, 2, 3, 1, 1, 4, 3, 1, 2, 4, 1, 16, 13]"+
//Tail EqnIndex=130 EqnNumber=33 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[83, 33, 3, 4, 3, 1, 2, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 3, 8, 3, 1, 2, 3, 8, 3, 4, 6, 3, 8, 9, 10, 19]"+
"// DOEMatrixRow=[13, 35, 5, 4, 3, 1, 2, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 35, 4, 2, 3, 2, 3, 1, 1, 4, 3, 1, 2, 4, 1, 16, 13]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0*2.25*xyz^32.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0*2.25*32.0*xyz^31.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*72.0*xyz^31.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0*2.25*xyz^32.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0*2.25/33.0*xyz^33.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0/14.666666666666666*xyz^33.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*72.0*xyz^31.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*72.0*31.0*xyz^30.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*2232.0*xyz^30.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0/14.666666666666666*xyz^33.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0*14.666666666666666/34.0*xyz^34.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0/2.3181818181818183*xyz^34.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*2232.0*xyz^30.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*2232.0*30.0*xyz^29.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*66960.0*xyz^29.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0/2.3181818181818183*xyz^34.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0*2.3181818181818183/35.0*xyz^35.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0/15.098039215686274*xyz^35.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*66960.0*xyz^29.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*66960.0*29.0*xyz^28.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*1941840.0*xyz^28.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0/15.098039215686274*xyz^35.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0*15.098039215686274/36.0*xyz^36.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0/2.3844155844155845*xyz^36.0";
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

public static void TestCaseDiff121132() {
 UsageCalculus.TestCase = 121132;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*x0^23*xyza^3*-1*xyza-1*xyza/2*xyza^2*-3*xyza2*x0^2*-3*x0*1*x0^2/-3*x02*x0^2*-3*x0^33*xyza^3*-1*xyza";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=131 EqnNumber=34 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[48, 34, 4, 5, 4, 2, 3, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 5, 3, 4, 9, 1, 2, 3, 4, 9, 1, 1, 7, 4, 9, 10, 11, 20]"+
"// DOEMatrixRow=[79, 36, 6, 1, 1, 2, 3, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 36, 5, 3, 1, 3, 1, 2, 3, 1, 1, 2, 3, 5, 2, 17, 14]"+
//Tail EqnIndex=131 EqnNumber=34 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[48, 34, 4, 5, 4, 2, 3, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 5, 3, 4, 9, 1, 2, 3, 4, 9, 1, 1, 7, 4, 9, 10, 11, 20]"+
"// DOEMatrixRow=[79, 36, 6, 1, 1, 2, 3, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 36, 5, 3, 1, 3, 1, 2, 3, 1, 1, 2, 3, 5, 2, 17, 14]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^23.0*2.0*xyza^4.0+x0^2.0*x0*x02*4.5*xyza^7.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^23.0*2.0*4.0*xyza^3.0+x0^2.0*x0*x02*7.0*xyza^6.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^23.0*8.0*xyza^3.0+x0^2.0*x0*x02*7.0*xyza^6.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^23.0*2.0*xyza^4.0+x0^2.0*x0*x02*4.5*xyza^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^23.0*2.0/5.0*xyza^5.0+x0^2.0*x0*x02*4.5/8.0*xyza^8.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^23.0*0.4*xyza^5.0+x0^2.0*x0*x02/1.7777777777777777*xyza^8.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^23.0*8.0*xyza^3.0+x0^2.0*x0*x02*7.0*xyza^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^23.0*8.0*3.0*xyza^2.0+x0^2.0*x0*x02*6.0*xyza^5.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^23.0*24.0*xyza^2.0+x0^2.0*x0*x02*6.0*xyza^5.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^23.0*0.4*xyza^5.0+x0^2.0*x0*x02/1.7777777777777777*xyza^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^23.0*0.4/6.0*xyza^6.0+x0^2.0*x0*x02/1.7777777777777777/9.0*xyza^9.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^23.0*0.06666666666666667*xyza^6.0+x0^2.0*x0*x02/16.0*xyza^9.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^23.0*24.0*xyza^2.0+x0^2.0*x0*x02*6.0*xyza^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^23.0*24.0*2.0*xyza^1.0+x0^2.0*x0*x02*5.0*xyza^4.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^23.0*48.0*xyza+x0^2.0*x0*x02*5.0*xyza^4.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^23.0*0.06666666666666667*xyza^6.0+x0^2.0*x0*x02/16.0*xyza^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^23.0*0.06666666666666667/7.0*xyza^7.0+x0^2.0*x0*x02/16.0/10.0*xyza^10.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^23.0*0.009523809523809523*xyza^7.0+x0^2.0*x0*x02/160.0*xyza^10.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^23.0*48.0*xyza+x0^2.0*x0*x02*5.0*xyza^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^23.0*48.0+x0^2.0*x0*x02*4.0*xyza^3.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^23.0*48.0+x0^2.0*x0*x02*4.0*xyza^3.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^23.0*0.009523809523809523*xyza^7.0+x0^2.0*x0*x02/160.0*xyza^10.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^23.0*0.009523809523809523/8.0*xyza^8.0+x0^2.0*x0*x02/160.0/11.0*xyza^11.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^23.0*0.0011904761904761904*xyza^8.0+x0^2.0*x0*x02/1760.0*xyza^11.0";
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

public static void TestCaseDiff121133() {
 UsageCalculus.TestCase = 121133;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*x^3*-1*x-1*x/2*x^2*-3*x2*x0^2*-3*x0*1*x0^2/-3*x03*x1*x^2/-3*x3*x^3*-1*x-1*x/2*x^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=132 EqnNumber=35 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[12, 35, 5, 6, 1, 3, 1, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 1, 1, 1, 10, 2, 3, 1, 1, 10, 2, 3, 8, 1, 10, 11, 12, 21]"+
"// DOEMatrixRow=[44, 37, 7, 2, 3, 1, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 37, 6, 1, 2, 4, 2, 3, 4, 2, 3, 1, 4, 6, 1, 18, 15]"+
//Tail EqnIndex=132 EqnNumber=35 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[12, 35, 5, 6, 1, 3, 1, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 1, 1, 1, 10, 2, 3, 1, 1, 10, 2, 3, 8, 1, 10, 11, 12, 21]"+
"// DOEMatrixRow=[44, 37, 7, 2, 3, 1, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 37, 6, 1, 2, 4, 2, 3, 4, 2, 3, 1, 4, 6, 1, 18, 15]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-3.0*x^4.0+1.0/2.0*x^9.0-1.0/2.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-3.0*4.0*x^3.0+1.0/2.0*9.0*x^8.0-1.0/2.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-12.0*x^3.0+4.5*x^8.0-1.5*x^2.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-3.0*x^4.0+1.0/2.0*x^9.0-1.0/2.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-3.0/5.0*x^5.0+1.0/2.0/10.0*x^10.0-1.0/2.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/1.6666666666666667*x^5.0+1.0/20.0*x^10.0-1.0/8.0*x^4.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-12.0*x^3.0+4.5*x^8.0-1.5*x^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-12.0*3.0*x^2.0+4.5*8.0*x^7.0-1.5*2.0*x^1.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-36.0*x^2.0+36.0*x^7.0-3.0*x";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/1.6666666666666667*x^5.0+1.0/20.0*x^10.0-1.0/8.0*x^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/1.6666666666666667/6.0*x^6.0+1.0/20.0/11.0*x^11.0-1.0/8.0/5.0*x^5.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/10.0*x^6.0+1.0/220.0*x^11.0-1.0/40.0*x^5.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-36.0*x^2.0+36.0*x^7.0-3.0*x";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-36.0*2.0*x^1.0+36.0*7.0*x^6.0-3.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-72.0*x+252.0*x^6.0-3.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/10.0*x^6.0+1.0/220.0*x^11.0-1.0/40.0*x^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/10.0/7.0*x^7.0+1.0/220.0/12.0*x^12.0-1.0/40.0/6.0*x^6.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/70.0*x^7.0+1.0/2640.0*x^12.0-1.0/240.0*x^6.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-72.0*x+252.0*x^6.0-3.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-72.0+252.0*6.0*x^5.0-3.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-72.0+1512.0*x^5.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/70.0*x^7.0+1.0/2640.0*x^12.0-1.0/240.0*x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/70.0/8.0*x^8.0+1.0/2640.0/13.0*x^13.0-1.0/240.0/7.0*x^7.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/560.0*x^8.0+1.0/34320.0*x^13.0-1.0/1680.0*x^7.0";
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

public static void TestCaseDiff121134() {
 UsageCalculus.TestCase = 121134;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-1*xy/2*xy^2*-3*xy2*x0^2*-3*x0*1*x0^2/-3*x03*xy1*xy^2/-3*xy-3*xy*-1*xy^2*2*xy1*xy012^2*2*xy012/3*xy012^2*-1*xy012-1*xy/2*xy^22*x0^2*-3*x0";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=133 EqnNumber=36 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[78, 36, 6, 7, 2, 1, 2, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 2, 3, 11, 3, 1, 2, 3, 11, 3, 4, 9, 2, 11, 12, 13, 22]"+
"// DOEMatrixRow=[8, 38, 8, 3, 1, 2, 3, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 38, 7, 2, 3, 5, 3, 1, 5, 3, 1, 2, 1, 7, 2, 19, 16]"+
//Tail EqnIndex=133 EqnNumber=36 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[78, 36, 6, 7, 2, 1, 2, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 2, 3, 11, 3, 1, 2, 3, 11, 3, 4, 9, 2, 11, 12, 13, 22]"+
"// DOEMatrixRow=[8, 38, 8, 3, 1, 2, 3, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 38, 7, 2, 3, 5, 3, 1, 5, 3, 1, 2, 1, 7, 2, 19, 16]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-1.0/2.0*xy^6.0-4.0*xy^3.0+x0^2.0*x0*1.5*xy^23.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-1.0/2.0*6.0*xy^5.0-4.0*3.0*xy^2.0+x0^2.0*x0*23.0*xy^22.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-3.0*xy^5.0-12.0*xy^2.0+x0^2.0*x0*23.0*xy^22.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-1.0/2.0*xy^6.0-4.0*xy^3.0+x0^2.0*x0*1.5*xy^23.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.0/2.0/7.0*xy^7.0-4.0/4.0*xy^4.0+x0^2.0*x0*1.5/24.0*xy^24.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/14.0*xy^7.0-xy^4.0+x0^2.0*x0/16.0*xy^24.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-3.0*xy^5.0-12.0*xy^2.0+x0^2.0*x0*23.0*xy^22.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-3.0*5.0*xy^4.0-12.0*2.0*xy^1.0+x0^2.0*x0*22.0*xy^21.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-15.0*xy^4.0-24.0*xy+x0^2.0*x0*22.0*xy^21.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-0.07142857142857142*xy^7.0-xy^4.0+x0^2.0*x0/16.0*xy^24.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-0.07142857142857142/8.0*xy^8.0-1.0/5.0*xy^5.0+x0^2.0*x0/16.0/25.0*xy^25.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/112.0*xy^8.0-0.2*xy^5.0+x0^2.0*x0/400.0*xy^25.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-15.0*xy^4.0-24.0*xy+x0^2.0*x0*22.0*xy^21.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-15.0*4.0*xy^3.0-24.0+x0^2.0*x0*21.0*xy^20.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-60.0*xy^3.0-24.0+x0^2.0*x0*21.0*xy^20.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/112.0*xy^8.0-0.2*xy^5.0+x0^2.0*x0/400.0*xy^25.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/112.0/9.0*xy^9.0-0.2/6.0*xy^6.0+x0^2.0*x0/400.0/26.0*xy^26.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/1008.0*xy^9.0-0.03333333333333333*xy^6.0+x0^2.0*x0/10400.0*xy^26.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-60.0*xy^3.0-24.0+x0^2.0*x0*21.0*xy^20.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-60.0*3.0*xy^2.0-24.0*0.0+x0^2.0*x0*20.0*xy^19.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-180.0*xy^2.0+x0^2.0*x0*20.0*xy^19.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/1008.0*xy^9.0-0.03333333333333333*xy^6.0+x0^2.0*x0/10400.0*xy^26.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/1008.0/10.0*xy^10.0-0.03333333333333333/7.0*xy^7.0+x0^2.0*x0/10400.0/27.0*xy^27.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/10080.0*xy^10.0-0.0047619047619047615*xy^7.0+x0^2.0*x0/280800.0*xy^27.0";
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

public static void TestCaseDiff121135() {
 UsageCalculus.TestCase = 121135;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*x0^2*-3*x0*1*x0^2/-3*x03*xyz1*xyz^2/-3*xyz-3*xyz*-1*xyz^2*2*xyz1*xy012^2*2*xy012/3*xy012^2*-1*xy0122*xyz3*xyz^2*-1*xyz2*x0^2*-3*x03*xyz*1*xyz^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=134 EqnNumber=37 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[43, 37, 7, 8, 3, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 3, 1, 1, 4, 3, 4, 12, 1, 2, 3, 4, 12, 1, 1, 10, 3, 12, 13, 14, 23]"+
"// DOEMatrixRow=[73, 39, 9, 4, 2, 3, 1, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 39, 8, 3, 1, 1, 1, 2, 6, 4, 2, 3, 2, 8, 1, 20, 17]"+
//Tail EqnIndex=134 EqnNumber=37 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[43, 37, 7, 8, 3, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 3, 1, 1, 4, 3, 4, 12, 1, 2, 3, 4, 12, 1, 1, 10, 3, 12, 13, 14, 23]"+
"// DOEMatrixRow=[73, 39, 9, 4, 2, 3, 1, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 39, 8, 3, 1, 1, 1, 2, 6, 4, 2, 3, 2, 8, 1, 20, 17]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-1.0/1.5*xyz^3.0-x0^2.0*x03*12.0*xyz^8.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-1.0/1.5*3.0*xyz^2.0-x0^2.0*x03*8.0*xyz^7.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-2.0*xyz^2.0-x0^2.0*x03*8.0*xyz^7.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-1.0/1.5*xyz^3.0-x0^2.0*x03*12.0*xyz^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.0/1.5/4.0*xyz^4.0-x0^2.0*x03*12.0/9.0*xyz^9.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-0.16666666666666666*xyz^4.0-x0^2.0*x03*1.3333333333333333*xyz^9.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-2.0*xyz^2.0-x0^2.0*x03*8.0*xyz^7.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-2.0*2.0*xyz^1.0-x0^2.0*x03*7.0*xyz^6.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-4.0*xyz-x0^2.0*x03*7.0*xyz^6.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-0.16666666666666666*xyz^4.0-x0^2.0*x03*1.3333333333333333*xyz^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-0.16666666666666666/5.0*xyz^5.0-x0^2.0*x03*1.3333333333333333/10.0*xyz^10.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-0.03333333333333333*xyz^5.0-x0^2.0*x03/7.5*xyz^10.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-4.0*xyz-x0^2.0*x03*7.0*xyz^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-4.0-x0^2.0*x03*6.0*xyz^5.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-4.0-x0^2.0*x03*6.0*xyz^5.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-0.03333333333333333*xyz^5.0-x0^2.0*x03/7.5*xyz^10.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-0.03333333333333333/6.0*xyz^6.0-x0^2.0*x03/7.5/11.0*xyz^11.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-0.005555555555555556*xyz^6.0-x0^2.0*x03/82.5*xyz^11.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-4.0-x0^2.0*x03*6.0*xyz^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0-x0^2.0*x03*5.0*xyz^4.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^2.0*x03*5.0*xyz^4.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-0.005555555555555556*xyz^6.0-x0^2.0*x03/82.5*xyz^11.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-0.005555555555555556/7.0*xyz^7.0-x0^2.0*x03/82.5/12.0*xyz^12.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-7.936507936507937E-4*xyz^7.0-x0^2.0*x03/990.0*xyz^12.0";
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

public static void TestCaseDiff121136() {
 UsageCalculus.TestCase = 121136;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xyza1*xyza^2/-3*xyza-3*xyza*-1*xyza^2*2*xyza1*xy012^2*2*xy012/3*xy012^2*-1*xy0122*xyza3*xyza^2*-1*xyza-1*xyza/2*xyza^2*-3*xyza^32*xy012^2*-3*xy012^3*1*xy012/-3*xy012^23*xyza*1*xyza^21*xyza^2/-3*xyza";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=135 EqnNumber=38 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[7, 38, 8, 9, 4, 3, 1, 3, 1, 3, 4, 1, 1, 2, 3, 1, 2, 1, 5, 1, 1, 13, 2, 3, 1, 1, 13, 2, 3, 11, 4, 13, 14, 15, 24]"+
"// DOEMatrixRow=[39, 40, 10, 1, 3, 1, 2, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 40, 9, 1, 2, 3, 2, 3, 1, 1, 3, 1, 3, 9, 2, 1, 18]"+
//Tail EqnIndex=135 EqnNumber=38 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[7, 38, 8, 9, 4, 3, 1, 3, 1, 3, 4, 1, 1, 2, 3, 1, 2, 1, 5, 1, 1, 13, 2, 3, 1, 1, 13, 2, 3, 11, 4, 13, 14, 15, 24]"+
"// DOEMatrixRow=[39, 40, 10, 1, 3, 1, 2, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 40, 9, 1, 2, 3, 2, 3, 1, 1, 3, 1, 3, 9, 2, 1, 18]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-xyza^3.0+4.0*xyza^6.0-xy012^2.0*xy012/2.0*xyza^60.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-3.0*xyza^2.0+4.0*6.0*xyza^5.0-xy012^2.0*xy012*60.0*xyza^59.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-3.0*xyza^2.0+24.0*xyza^5.0-xy012^2.0*xy012*60.0*xyza^59.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-xyza^3.0+4.0*xyza^6.0-xy012^2.0*xy012/2.0*xyza^60.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.0/4.0*xyza^4.0+4.0/7.0*xyza^7.0-xy012^2.0*xy012/2.0/61.0*xyza^61.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/4.0*xyza^4.0+0.5714285714285714*xyza^7.0-xy012^2.0*xy012/122.0*xyza^61.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-3.0*xyza^2.0+24.0*xyza^5.0-xy012^2.0*xy012*60.0*xyza^59.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-3.0*2.0*xyza^1.0+24.0*5.0*xyza^4.0-xy012^2.0*xy012*59.0*xyza^58.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-6.0*xyza+120.0*xyza^4.0-xy012^2.0*xy012*59.0*xyza^58.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/4.0*xyza^4.0+0.5714285714285714*xyza^7.0-xy012^2.0*xy012/122.0*xyza^61.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/4.0/5.0*xyza^5.0+0.5714285714285714/8.0*xyza^8.0-xy012^2.0*xy012/122.0/62.0*xyza^62.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/20.0*xyza^5.0+0.07142857142857142*xyza^8.0-xy012^2.0*xy012/7564.0*xyza^62.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-6.0*xyza+120.0*xyza^4.0-xy012^2.0*xy012*59.0*xyza^58.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-6.0+120.0*4.0*xyza^3.0-xy012^2.0*xy012*58.0*xyza^57.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-6.0+480.0*xyza^3.0-xy012^2.0*xy012*58.0*xyza^57.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/20.0*xyza^5.0+0.07142857142857142*xyza^8.0-xy012^2.0*xy012/7564.0*xyza^62.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/20.0/6.0*xyza^6.0+0.07142857142857142/9.0*xyza^9.0-xy012^2.0*xy012/7564.0/63.0*xyza^63.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/120.0*xyza^6.0+0.007936507936507936*xyza^9.0-xy012^2.0*xy012/476532.0*xyza^63.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-6.0+480.0*xyza^3.0-xy012^2.0*xy012*58.0*xyza^57.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0+480.0*3.0*xyza^2.0-xy012^2.0*xy012*57.0*xyza^56.0";
 UsageCalculus.EqnSolArrayMap2[4] = "1440.0*xyza^2.0-xy012^2.0*xy012*57.0*xyza^56.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/120.0*xyza^6.0+0.007936507936507936*xyza^9.0-xy012^2.0*xy012/476532.0*xyza^63.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/120.0/7.0*xyza^7.0+0.007936507936507936/10.0*xyza^10.0-xy012^2.0*xy012/476532.0/64.0*xyza^64.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/840.0*xyza^7.0+7.936507936507937E-4*xyza^10.0-xy012^2.0*xy012/3.0498048E7*xyza^64.0";
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

public static void TestCaseDiff121137() {
 UsageCalculus.TestCase = 121137;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x^2/-3*x-3*x*-1*x^2*2*x1*xy012^2*2*xy012/3*xy012^2*-1*xy0122*x3*x^2*-1*x-1*x/2*x^2*-3*x^32*xy012^2*-3*xy012^3*1*xy012/-3*xy012^23*x^31*x/-3*x^21*x^2/-3*x-3*x*-1*x^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=136 EqnNumber=39 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[72, 39, 9, 10, 1, 1, 2, 4, 2, 4, 1, 2, 3, 1, 4, 2, 3, 2, 1, 2, 3, 14, 3, 1, 2, 3, 14, 3, 4, 12, 1, 14, 15, 16, 25]"+
"// DOEMatrixRow=[3, 41, 11, 2, 1, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 3, 1, 41, 10, 2, 3, 4, 3, 1, 2, 3, 1, 2, 4, 10, 1, 2, 19]"+
//Tail EqnIndex=136 EqnNumber=39 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[72, 39, 9, 10, 1, 1, 2, 4, 2, 4, 1, 2, 3, 1, 4, 2, 3, 2, 1, 2, 3, 14, 3, 1, 2, 3, 14, 3, 4, 12, 1, 14, 15, 16, 25]"+
"// DOEMatrixRow=[3, 41, 11, 2, 1, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 3, 1, 41, 10, 2, 3, 4, 3, 1, 2, 3, 1, 2, 4, 10, 1, 2, 19]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-1.0/3.0*x^3.0+4.0*x^6.0+1.0/6.0*x^91.0+3.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-1.0/3.0*3.0*x^2.0+4.0*6.0*x^5.0+1.0/6.0*91.0*x^90.0+3.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x^2.0+24.0*x^5.0+15.166666666666666*x^90.0+9.0*x^2.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-1.0/3.0*x^3.0+4.0*x^6.0+1.0/6.0*x^91.0+3.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.0/3.0/4.0*x^4.0+4.0/7.0*x^7.0+1.0/6.0/92.0*x^92.0+3.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/12.0*x^4.0+1.0/1.75*x^7.0+1.0/552.0*x^92.0+1.0/1.3333333333333333*x^4.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x^2.0+24.0*x^5.0+15.166666666666666*x^90.0+9.0*x^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-2.0*x^1.0+24.0*5.0*x^4.0+15.166666666666666*90.0*x^89.0+9.0*2.0*x^1.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-2.0*x+120.0*x^4.0+1365.0*x^89.0+18.0*x";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/12.0*x^4.0+1.0/1.75*x^7.0+1.0/552.0*x^92.0+1.0/1.3333333333333333*x^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/12.0/5.0*x^5.0+1.0/1.75/8.0*x^8.0+1.0/552.0/93.0*x^93.0+1.0/1.3333333333333333/5.0*x^5.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/60.0*x^5.0+1.0/14.0*x^8.0+1.0/51336.0*x^93.0+1.0/6.666666666666666*x^5.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-2.0*x+120.0*x^4.0+1365.0*x^89.0+18.0*x";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-2.0+120.0*4.0*x^3.0+1365.0*89.0*x^88.0+18.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-2.0+480.0*x^3.0+121485.0*x^88.0+18.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/60.0*x^5.0+1.0/14.0*x^8.0+1.0/51336.0*x^93.0+1.0/6.666666666666666*x^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/60.0/6.0*x^6.0+1.0/14.0/9.0*x^9.0+1.0/51336.0/94.0*x^94.0+1.0/6.666666666666666/6.0*x^6.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/360.0*x^6.0+1.0/126.0*x^9.0+1.0/4825584.0*x^94.0+1.0/40.0*x^6.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-2.0+480.0*x^3.0+121485.0*x^88.0+18.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0+480.0*3.0*x^2.0+121485.0*88.0*x^87.0+18.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "1440.0*x^2.0+1.069068E7*x^87.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/360.0*x^6.0+1.0/126.0*x^9.0+1.0/4825584.0*x^94.0+1.0/40.0*x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/360.0/7.0*x^7.0+1.0/126.0/10.0*x^10.0+1.0/4825584.0/95.0*x^95.0+1.0/40.0/7.0*x^7.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/2520.0*x^7.0+1.0/1260.0*x^10.0+1.0/4.5843048E8*x^95.0+1.0/280.0*x^7.0";
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

public static void TestCaseDiff121138() {
 UsageCalculus.TestCase = 121138;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xy*-1*xy^2*2*xy1*xy012^2*2*xy012/3*xy012^2*-1*xy0122*xy3*xy^2*-1*xy-1*xy/2*xy^2*-3*xy^32*xy012^2*-3*xy012^3*1*xy012/-3*xy012^23*xy^31*xy/-3*xy^2-3*x0^2*-1*x0^3*2*x01*xy^3*2*xy/3*xy^2*--1*xy^3-3*xy*-1*xy^21*xy012^2*2*xy012";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=137 EqnNumber=40 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[38, 40, 10, 11, 2, 3, 1, 5, 3, 1, 2, 1, 1, 2, 1, 3, 1, 1, 2, 3, 4, 15, 1, 2, 3, 4, 15, 1, 1, 13, 2, 15, 16, 17, 26]"+
"// DOEMatrixRow=[68, 42, 12, 3, 2, 3, 1, 3, 1, 3, 4, 1, 1, 2, 3, 1, 2, 42, 1, 3, 1, 5, 1, 2, 3, 4, 2, 3, 1, 11, 2, 3, 20]"+
//Tail EqnIndex=137 EqnNumber=40 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[38, 40, 10, 11, 2, 3, 1, 5, 3, 1, 2, 1, 1, 2, 1, 3, 1, 1, 2, 3, 4, 15, 1, 2, 3, 4, 15, 1, 1, 13, 2, 15, 16, 17, 26]"+
"// DOEMatrixRow=[68, 42, 12, 3, 2, 3, 1, 3, 1, 3, 4, 1, 1, 2, 3, 1, 2, 42, 1, 3, 1, 5, 1, 2, 3, 4, 2, 3, 1, 11, 2, 3, 20]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "4.0*xy^6.0-1.0/2.0*xy^69.0+x0^2.0*x01*4.0*xy^9.0-xy^3.0+6.0*xy^22.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "4.0*6.0*xy^5.0-1.0/2.0*69.0*xy^68.0+x0^2.0*x01*4.0*9.0*xy^8.0-3.0*xy^2.0+6.0*22.0*xy^21.0";
 UsageCalculus.EqnSolArrayMap2[1] = "24.0*xy^5.0-34.5*xy^68.0+x0^2.0*x01*36.0*xy^8.0-3.0*xy^2.0+132.0*xy^21.0";
 UsageCalculus.EqnSolArrayMap3[1] = "4.0*xy^6.0-1.0/2.0*xy^69.0+x0^2.0*x01*4.0*xy^9.0-xy^3.0+6.0*xy^22.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "4.0/7.0*xy^7.0-1.0/2.0/70.0*xy^70.0+x0^2.0*x01*4.0/10.0*xy^10.0-1.0/4.0*xy^4.0+6.0/23.0*xy^23.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/1.75*xy^7.0-0.007142857142857143*xy^70.0+x0^2.0*x01/2.5*xy^10.0-1.0/4.0*xy^4.0+1.0/3.8333333333333335*xy^23.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "24.0*xy^5.0-34.5*xy^68.0+x0^2.0*x01*36.0*xy^8.0-3.0*xy^2.0+132.0*xy^21.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "24.0*5.0*xy^4.0-34.5*68.0*xy^67.0+x0^2.0*x01*36.0*8.0*xy^7.0-3.0*2.0*xy^1.0+132.0*21.0*xy^20.0";
 UsageCalculus.EqnSolArrayMap2[2] = "120.0*xy^4.0-2346.0*xy^67.0+x0^2.0*x01*288.0*xy^7.0-6.0*xy+2772.0*xy^20.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/1.75*xy^7.0-0.007142857142857143*xy^70.0+x0^2.0*x01/2.5*xy^10.0-1.0/4.0*xy^4.0+1.0/3.8333333333333335*xy^23.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/1.75/8.0*xy^8.0-0.007142857142857143/71.0*xy^71.0+x0^2.0*x01/2.5/11.0*xy^11.0-1.0/4.0/5.0*xy^5.0+1.0/3.8333333333333335/24.0*xy^24.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/14.0*xy^8.0-1.0060362173038229E-4*xy^71.0+x0^2.0*x01/27.5*xy^11.0-1.0/20.0*xy^5.0+1.0/92.0*xy^24.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "120.0*xy^4.0-2346.0*xy^67.0+x0^2.0*x01*288.0*xy^7.0-6.0*xy+2772.0*xy^20.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "120.0*4.0*xy^3.0-2346.0*67.0*xy^66.0+x0^2.0*x01*288.0*7.0*xy^6.0-6.0+2772.0*20.0*xy^19.0";
 UsageCalculus.EqnSolArrayMap2[3] = "480.0*xy^3.0-157182.0*xy^66.0+x0^2.0*x01*2016.0*xy^6.0-6.0+55440.0*xy^19.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/14.0*xy^8.0-1.0060362173038229E-4*xy^71.0-4.0*xy^71.0+x0^2.0*x01/27.5*xy^11.0-1.0/20.0*xy^5.0+1.0/92.0*xy^24.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/14.0/9.0*xy^9.0-1.0060362173038229E-4/72.0*xy^72.0-4.0/72.0*xy^72.0+x0^2.0*x01/27.5/12.0*xy^12.0-1.0/20.0/6.0*xy^6.0+1.0/92.0/25.0*xy^25.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/126.0*xy^9.0-1.0/715680.0*xy^72.0-1.0/18.0*xy^72.0-0.05555555555555555*xy^72.0+x0^2.0*x01/330.0*xy^12.0-1.0/120.0*xy^6.0+1.0/2300.0*xy^25.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "480.0*xy^3.0-157182.0*xy^66.0+x0^2.0*x01*2016.0*xy^6.0-6.0+55440.0*xy^19.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "480.0*3.0*xy^2.0-157182.0*66.0*xy^65.0+x0^2.0*x01*2016.0*6.0*xy^5.0-6.0*0.0+55440.0*19.0*xy^18.0";
 UsageCalculus.EqnSolArrayMap2[4] = "1440.0*xy^2.0-1.0374012E7*xy^65.0+x0^2.0*x01*12096.0*xy^5.0+1053360.0*xy^18.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/126.0*xy^9.0-1.0/715680.0*xy^72.0-1.0/18.0*xy^72.0-0.05555555555555555*xy^72.0+x0^2.0*x01/330.0*xy^12.0-1.0/120.0*xy^6.0+1.0/2300.0*xy^25.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/126.0/10.0*xy^10.0-1.0/715680.0/73.0*xy^73.0-1.0/18.0/73.0*xy^73.0-0.05555555555555555/73.0*xy^73.0+x0^2.0*x01/330.0/13.0*xy^13.0-1.0/120.0/7.0*xy^7.0+1.0/2300.0/26.0*xy^26.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/1260.0*xy^10.0-1.0/5.224464E7*xy^73.0-1.0/1314.0*xy^73.0-7.6103500761035E-4*xy^73.0+x0^2.0*x01/4290.0*xy^13.0-1.0/840.0*xy^7.0+1.0/59800.0*xy^26.0";
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

public static void TestCaseDiff121139() {
 UsageCalculus.TestCase = 121139;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xy012^2*2*xy012/3*xy012^2*-1*xy0122*xyz3*xyz^2*-1*xyz-1*xyz/2*xyz^2*-3*xyz^32*xy012^2*-3*xy012^3*1*xy012/-3*xy012^23*xyz^31*xyz/-3*xyz^2-3*x0^2*-1*x0^3*2*x01*xyz^3*2*xyz/3*xyz^2*--1*xyz^32*xyz3*x0^2*--1*x0^31*xy012^2*2*xy0122*xyz/3*xyz^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=138 EqnNumber=41 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[2, 41, 11, 12, 3, 1, 2, 6, 1, 2, 3, 2, 3, 1, 2, 1, 2, 1, 3, 1, 1, 16, 2, 3, 1, 1, 16, 2, 3, 14, 3, 16, 1, 18, 27]"+
"// DOEMatrixRow=[34, 43, 13, 4, 3, 1, 2, 4, 2, 4, 1, 2, 3, 1, 4, 2, 3, 43, 2, 1, 2, 1, 2, 3, 4, 1, 3, 1, 2, 12, 1, 4, 1]"+
//Tail EqnIndex=138 EqnNumber=41 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[2, 41, 11, 12, 3, 1, 2, 6, 1, 2, 3, 2, 3, 1, 2, 1, 2, 1, 3, 1, 1, 16, 2, 3, 1, 1, 16, 2, 3, 14, 3, 16, 1, 18, 27]"+
"// DOEMatrixRow=[34, 43, 13, 4, 3, 1, 2, 4, 2, 4, 1, 2, 3, 1, 4, 2, 3, 43, 2, 1, 2, 1, 2, 3, 4, 1, 3, 1, 2, 12, 1, 4, 1]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "1.0/1.5*xyz^3.0-xy012^2.0*xy012/2.0*xyz^69.0+x0^2.0*xy0122*2.6666666666666665*xyz^41.0-x0^2.0*xy0122/1.5*xyz^35.0-x0^31.0*xy0122/1.5*xyz^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/1.5*3.0*xyz^2.0-xy012^2.0*xy012/2.0*69.0*xyz^68.0+x0^2.0*xy0122*2.6666666666666665*41.0*xyz^40.0-x0^2.0*xy0122/1.5*35.0*xyz^34.0-x0^31.0*xy0122*3.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap2[1] = "2.0*xyz^2.0-xy012^2.0*xy012*34.5*xyz^68.0+x0^2.0*xy0122*109.33333333333333*xyz^40.0-x0^2.0*xy0122*23.333333333333332*xyz^34.0-x0^31.0*xy0122*3.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap3[1] = "1.0/1.5*xyz^3.0-xy012^2.0*xy012/2.0*xyz^69.0+x0^2.0*xy0122*2.6666666666666665*xyz^41.0-x0^2.0*xy0122/1.5*xyz^35.0-x0^31.0*xy0122/1.5*xyz^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0/1.5/4.0*xyz^4.0-xy012^2.0*xy012/2.0/70.0*xyz^70.0+x0^2.0*xy0122*2.6666666666666665/42.0*xyz^42.0-x0^2.0*xy0122/1.5/36.0*xyz^36.0-x0^31.0*xy0122/1.5/4.0*xyz^4.0";
 UsageCalculus.EqnSolArrayMap4[1] = "0.16666666666666666*xyz^4.0-xy012^2.0*xy012*0.007142857142857143*xyz^70.0+x0^2.0*xy0122*0.06349206349206349*xyz^42.0-x0^2.0*xy0122*0.018518518518518517*xyz^36.0-x0^31.0*xy0122/6.0*xyz^4.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "2.0*xyz^2.0-xy012^2.0*xy012*34.5*xyz^68.0+x0^2.0*xy0122*109.33333333333333*xyz^40.0-x0^2.0*xy0122*23.333333333333332*xyz^34.0-x0^31.0*xy0122*3.0*xyz^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "2.0*2.0*xyz^1.0-xy012^2.0*xy012*34.5*68.0*xyz^67.0+x0^2.0*xy0122*109.33333333333333*40.0*xyz^39.0-x0^2.0*xy0122*23.333333333333332*34.0*xyz^33.0-x0^31.0*xy0122*2.0*xyz^1.0";
 UsageCalculus.EqnSolArrayMap2[2] = "4.0*xyz-xy012^2.0*xy012*2346.0*xyz^67.0+x0^2.0*xy0122*4373.333333333333*xyz^39.0-x0^2.0*xy0122*793.3333333333333*xyz^33.0-x0^31.0*xy0122*2.0*xyz";
 UsageCalculus.EqnSolArrayMap3[2] = "0.16666666666666666*xyz^4.0-xy012^2.0*xy012*0.007142857142857143*xyz^70.0+x0^2.0*xy0122*0.06349206349206349*xyz^42.0-x0^2.0*xy0122*0.018518518518518517*xyz^36.0-x0^31.0*xy0122/6.0*xyz^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "0.16666666666666666/5.0*xyz^5.0-xy012^2.0*xy012*0.007142857142857143/71.0*xyz^71.0+x0^2.0*xy0122*0.06349206349206349/43.0*xyz^43.0-x0^2.0*xy0122*0.018518518518518517/37.0*xyz^37.0-x0^31.0*xy0122/6.0/5.0*xyz^5.0";
 UsageCalculus.EqnSolArrayMap4[2] = "0.03333333333333333*xyz^5.0-xy012^2.0*xy012*1.0060362173038229E-4*xyz^71.0+x0^2.0*xy0122*0.0014765596160944998*xyz^43.0-x0^2.0*xy0122*5.005005005005005E-4*xyz^37.0-x0^31.0*xy0122/30.0*xyz^5.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "4.0*xyz-xy012^2.0*xy012*2346.0*xyz^67.0+x0^2.0*xy0122*4373.333333333333*xyz^39.0-x0^2.0*xy0122*793.3333333333333*xyz^33.0-x0^31.0*xy0122*2.0*xyz";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "4.0-xy012^2.0*xy012*2346.0*67.0*xyz^66.0+x0^2.0*xy0122*4373.333333333333*39.0*xyz^38.0-x0^2.0*xy0122*793.3333333333333*33.0*xyz^32.0-x0^31.0*xy0122*2.0";
 UsageCalculus.EqnSolArrayMap2[3] = "4.0-xy012^2.0*xy012*157182.0*xyz^66.0+x0^2.0*xy0122*170560.0*xyz^38.0-x0^2.0*xy0122*26179.999999999996*xyz^32.0-x0^31.0*xy0122*2.0";
 UsageCalculus.EqnSolArrayMap3[3] = "0.03333333333333333*xyz^5.0-xy012^2.0*xy012*1.0060362173038229E-4*xyz^71.0-4.0*xyz^71.0+x0^2.0*xy0122*0.0014765596160944998*xyz^43.0-x0^2.0*xy0122*5.005005005005005E-4*xyz^37.0-4.0*xyz^37.0-x0^31.0*xy0122/30.0*xyz^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "0.03333333333333333/6.0*xyz^6.0-xy012^2.0*xy012*1.0060362173038229E-4/72.0*xyz^72.0-4.0/72.0*xyz^72.0+x0^2.0*xy0122*0.0014765596160944998/44.0*xyz^44.0-x0^2.0*xy0122*5.005005005005005E-4/38.0*xyz^38.0-4.0/38.0*xyz^38.0-x0^31.0*xy0122/30.0/6.0*xyz^6.0";
 UsageCalculus.EqnSolArrayMap4[3] = "0.005555555555555556*xyz^6.0-xy012^2.0*xy012/715680.0*xyz^72.0-1.0/18.0*xyz^72.0-0.05555555555555555*xyz^72.0+x0^2.0*xy0122*3.3558173093056814E-5*xyz^44.0-x0^2.0*xy0122/75924.0*xyz^38.0-1.0/9.5*xyz^38.0-0.10526315789473684*xyz^38.0-x0^31.0*xy0122/180.0*xyz^6.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "4.0-xy012^2.0*xy012*157182.0*xyz^66.0+x0^2.0*xy0122*170560.0*xyz^38.0-x0^2.0*xy0122*26179.999999999996*xyz^32.0-x0^31.0*xy0122*2.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "0.0-xy012^2.0*xy012*157182.0*66.0*xyz^65.0+x0^2.0*xy0122*170560.0*38.0*xyz^37.0-x0^2.0*xy0122*26179.999999999996*32.0*xyz^31.0-x0^31.0*xy0122*2.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-xy012^2.0*xy012*1.0374012E7*xyz^65.0+x0^2.0*xy0122*6481280.0*xyz^37.0-x0^2.0*xy0122*837759.9999999999*xyz^31.0-x0^31.0*xy0122*0.0";
 UsageCalculus.EqnSolArrayMap3[4] = "0.005555555555555556*xyz^6.0-xy012^2.0*xy012/715680.0*xyz^72.0-1.0/18.0*xyz^72.0-0.05555555555555555*xyz^72.0+x0^2.0*xy0122*3.3558173093056814E-5*xyz^44.0-5.0*xyz^44.0-x0^2.0*xy0122/75924.0*xyz^38.0-1.0/9.5*xyz^38.0-0.10526315789473684*xyz^38.0-x0^31.0*xy0122/180.0*xyz^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "0.005555555555555556/7.0*xyz^7.0-xy012^2.0*xy012/715680.0/73.0*xyz^73.0-1.0/18.0/73.0*xyz^73.0-0.05555555555555555/73.0*xyz^73.0+x0^2.0*xy0122*3.3558173093056814E-5/45.0*xyz^45.0-5.0/45.0*xyz^45.0-x0^2.0*xy0122/75924.0/39.0*xyz^39.0-1.0/9.5/39.0*xyz^39.0-0.10526315789473684/39.0*xyz^39.0-x0^31.0*xy0122/180.0/7.0*xyz^7.0";
 UsageCalculus.EqnSolArrayMap4[4] = "7.936507936507937E-4*xyz^7.0-xy012^2.0*xy012/5.224464E7*xyz^73.0-1.0/1314.0*xyz^73.0-7.6103500761035E-4*xyz^73.0+x0^2.0*xy0122/1340955.0*xyz^45.0-1.0/9.0*xyz^45.0-0.1111111111111111*xyz^45.0-x0^2.0*xy0122/2961036.0*xyz^39.0-1.0/370.5*xyz^39.0-0.002699055330634278*xyz^39.0-x0^31.0*xy0122/1260.0*xyz^7.0";
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

public static void TestCaseDiff121140() {
 UsageCalculus.TestCase = 121140;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xyza3*xyza^2*-1*xyza-1*xyza/2*xyza^2*-3*xyza^32*xy012^2*-3*xy012^3*1*xy012/-3*xy012^23*xyza^31*xyza/-3*xyza^2-3*x0^2*-1*x0^3*2*x01*xyza^3*2*xyza/3*xyza^2*--1*xyza^32*xyza3*x0^2*--1*x0^3-1*xyza^3*2*xyza/3*xyza^22*xyza/3*xyza^2*-1*xyza^3*-3*xyza2*xyza/3*xyza^23*xyza^2*-1*xyza";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=139 EqnNumber=42 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[67, 42, 12, 13, 4, 2, 3, 7, 2, 3, 4, 1, 1, 2, 3, 2, 3, 2, 4, 2, 3, 1, 3, 1, 2, 3, 1, 3, 4, 15, 4, 17, 2, 19, 28]"+
"// DOEMatrixRow=[99, 44, 14, 1, 1, 2, 3, 5, 3, 1, 2, 1, 1, 2, 1, 3, 1, 44, 3, 2, 3, 2, 3, 1, 5, 2, 1, 2, 3, 13, 2, 5, 2]"+
//Tail EqnIndex=139 EqnNumber=42 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[67, 42, 12, 13, 4, 2, 3, 7, 2, 3, 4, 1, 1, 2, 3, 2, 3, 2, 4, 2, 3, 1, 3, 1, 2, 3, 1, 3, 4, 15, 4, 17, 2, 19, 28]"+
"// DOEMatrixRow=[99, 44, 14, 1, 1, 2, 3, 5, 3, 1, 2, 1, 1, 2, 1, 3, 1, 44, 3, 2, 3, 2, 3, 1, 5, 2, 1, 2, 3, 13, 2, 5, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-2.0*xyza^3.0-xy012^2.0*xy012/2.0*xyza^69.0+x0^2.0*4.0*xyza^38.0-x0^2.0*xyza^32.0-x0^3.0+1.0/4.5*xyza^59.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-2.0*3.0*xyza^2.0-xy012^2.0*xy012/2.0*69.0*xyza^68.0+x0^2.0*4.0*38.0*xyza^37.0-x0^2.0*32.0*xyza^31.0-x0^3.0*0.0+1.0/4.5*59.0*xyza^58.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-6.0*xyza^2.0-xy012^2.0*xy012*34.5*xyza^68.0+x0^2.0*152.0*xyza^37.0-x0^2.0*32.0*xyza^31.0-x0^3.0*0.0+13.11111111111111*xyza^58.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-2.0*xyza^3.0-xy012^2.0*xy012/2.0*xyza^69.0+x0^2.0*4.0*xyza^38.0-x0^2.0*xyza^32.0-x0^3.0+1.0/4.5*xyza^59.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-2.0/4.0*xyza^4.0-xy012^2.0*xy012/2.0/70.0*xyza^70.0+x0^2.0*4.0/39.0*xyza^39.0-x0^2.0/33.0*xyza^33.0-x0^3.0*xyza+1.0/4.5/60.0*xyza^60.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-0.5*xyza^4.0-xy012^2.0*xy012*0.007142857142857143*xyza^70.0+x0^2.0*0.10256410256410256*xyza^39.0-x0^2.0/33.0*xyza^33.0-x0^3.0*xyza+1.0/270.0*xyza^60.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-6.0*xyza^2.0-xy012^2.0*xy012*34.5*xyza^68.0+x0^2.0*152.0*xyza^37.0-x0^2.0*32.0*xyza^31.0-x0^3.0*0.0+13.11111111111111*xyza^58.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-6.0*2.0*xyza^1.0-xy012^2.0*xy012*34.5*68.0*xyza^67.0+x0^2.0*152.0*37.0*xyza^36.0-x0^2.0*32.0*31.0*xyza^30.0-x0^3.0*0.0*0.0+13.11111111111111*58.0*xyza^57.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-12.0*xyza-xy012^2.0*xy012*2346.0*xyza^67.0+x0^2.0*5624.0*xyza^36.0-x0^2.0*992.0*xyza^30.0-x0^3.0*0.0+760.4444444444445*xyza^57.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-0.5*xyza^4.0-xy012^2.0*xy012*0.007142857142857143*xyza^70.0+x0^2.0*0.10256410256410256*xyza^39.0-x0^2.0/33.0*xyza^33.0-x0^3.0*xyza+1.0/270.0*xyza^60.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-0.5/5.0*xyza^5.0-xy012^2.0*xy012*0.007142857142857143/71.0*xyza^71.0+x0^2.0*0.10256410256410256/40.0*xyza^40.0-x0^2.0/33.0/34.0*xyza^34.0-x0^3.0/2.0*xyza^2.0+1.0/270.0/61.0*xyza^61.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-0.1*xyza^5.0-xy012^2.0*xy012*1.0060362173038229E-4*xyza^71.0+x0^2.0*0.002564102564102564*xyza^40.0-x0^2.0*8.9126559714795E-4*xyza^34.0-x0^3.0/2.0*xyza^2.0+1.0/16470.0*xyza^61.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-12.0*xyza-xy012^2.0*xy012*2346.0*xyza^67.0+x0^2.0*5624.0*xyza^36.0-x0^2.0*992.0*xyza^30.0-x0^3.0*0.0+760.4444444444445*xyza^57.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-12.0-xy012^2.0*xy012*2346.0*67.0*xyza^66.0+x0^2.0*5624.0*36.0*xyza^35.0-x0^2.0*992.0*30.0*xyza^29.0-x0^3.0*0.0*0.0+760.4444444444445*57.0*xyza^56.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-12.0-xy012^2.0*xy012*157182.0*xyza^66.0+x0^2.0*202464.0*xyza^35.0-x0^2.0*29760.0*xyza^29.0-x0^3.0*0.0+43345.333333333336*xyza^56.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-0.1*xyza^5.0-xy012^2.0*xy012*1.0060362173038229E-4*xyza^71.0-4.0*xyza^71.0+x0^2.0*0.002564102564102564*xyza^40.0-x0^2.0*8.9126559714795E-4*xyza^34.0-4.0*xyza^34.0-x0^3.0/2.0*xyza^2.0+1.0/16470.0*xyza^61.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-0.1/6.0*xyza^6.0-xy012^2.0*xy012*1.0060362173038229E-4/72.0*xyza^72.0-4.0/72.0*xyza^72.0+x0^2.0*0.002564102564102564/41.0*xyza^41.0-x0^2.0*8.9126559714795E-4/35.0*xyza^35.0-4.0/35.0*xyza^35.0-x0^3.0/2.0/3.0*xyza^3.0+1.0/16470.0/62.0*xyza^62.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-0.016666666666666666*xyza^6.0-xy012^2.0*xy012/715680.0*xyza^72.0-1.0/18.0*xyza^72.0-0.05555555555555555*xyza^72.0+x0^2.0*6.253908692933083E-5*xyza^41.0-x0^2.0/39270.0*xyza^35.0-1.0/8.75*xyza^35.0-0.11428571428571428*xyza^35.0-x0^3.0/6.0*xyza^3.0+1.0/1021140.0*xyza^62.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-12.0-xy012^2.0*xy012*157182.0*xyza^66.0+x0^2.0*202464.0*xyza^35.0-x0^2.0*29760.0*xyza^29.0-x0^3.0*0.0+43345.333333333336*xyza^56.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0-xy012^2.0*xy012*157182.0*66.0*xyza^65.0+x0^2.0*202464.0*35.0*xyza^34.0-x0^2.0*29760.0*29.0*xyza^28.0-x0^3.0*0.0*0.0+43345.333333333336*56.0*xyza^55.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-xy012^2.0*xy012*1.0374012E7*xyza^65.0+x0^2.0*7086240.0*xyza^34.0-x0^2.0*863040.0*xyza^28.0-x0^3.0*0.0+2427338.666666667*xyza^55.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-0.016666666666666666*xyza^6.0-xy012^2.0*xy012/715680.0*xyza^72.0-1.0/18.0*xyza^72.0-0.05555555555555555*xyza^72.0+x0^2.0*6.253908692933083E-5*xyza^41.0-5.0*xyza^41.0-x0^2.0/39270.0*xyza^35.0-1.0/8.75*xyza^35.0-0.11428571428571428*xyza^35.0-x0^3.0/6.0*xyza^3.0+1.0/1021140.0*xyza^62.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-0.016666666666666666/7.0*xyza^7.0-xy012^2.0*xy012/715680.0/73.0*xyza^73.0-1.0/18.0/73.0*xyza^73.0-0.05555555555555555/73.0*xyza^73.0+x0^2.0*6.253908692933083E-5/42.0*xyza^42.0-5.0/42.0*xyza^42.0-x0^2.0/39270.0/36.0*xyza^36.0-1.0/8.75/36.0*xyza^36.0-0.11428571428571428/36.0*xyza^36.0-x0^3.0/6.0/4.0*xyza^4.0+1.0/1021140.0/63.0*xyza^63.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-0.0023809523809523807*xyza^7.0-xy012^2.0*xy012/5.224464E7*xyza^73.0-1.0/1314.0*xyza^73.0-7.6103500761035E-4*xyza^73.0+x0^2.0/671580.0*xyza^42.0-1.0/8.4*xyza^42.0-0.11904761904761904*xyza^42.0-x0^2.0/1413720.0*xyza^36.0-1.0/315.0*xyza^36.0-0.0031746031746031746*xyza^36.0-x0^3.0/24.0*xyza^4.0+1.0/6.433182E7*xyza^63.0";
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

public static void TestCaseDiff121141() {
 UsageCalculus.TestCase = 121141;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*x^2*-1*x-1*x/2*x^2*-3*x^32*xy012^2*-3*xy012^3*1*xy012/-3*xy012^23*x^31*x/-3*x^2-3*x0^2*-1*x0^3*2*x01*x^3*2*x/3*x^2*--1*x^32*x3*x0^2*--1*x0^3-1*x^3*2*x/3*x^22*x/3*x^2*-1*x^3*-3*x3*x0^21*x^3*-3*x3*x^2*-1*x-1*x/2*x^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=140 EqnNumber=43 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[33, 43, 13, 14, 1, 3, 1, 8, 3, 4, 1, 2, 3, 1, 4, 3, 1, 1, 5, 3, 4, 2, 1, 2, 3, 4, 2, 1, 1, 16, 1, 18, 3, 20, 29]"+
"// DOEMatrixRow=[63, 45, 15, 2, 3, 1, 1, 6, 1, 2, 3, 2, 3, 1, 2, 1, 2, 45, 4, 3, 1, 3, 1, 2, 6, 3, 2, 3, 4, 14, 1, 6, 3]"+
//Tail EqnIndex=140 EqnNumber=43 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[33, 43, 13, 14, 1, 3, 1, 8, 3, 4, 1, 2, 3, 1, 4, 3, 1, 1, 5, 3, 4, 2, 1, 2, 3, 4, 2, 1, 1, 16, 1, 18, 3, 20, 29]"+
"// DOEMatrixRow=[63, 45, 15, 2, 3, 1, 1, 6, 1, 2, 3, 2, 3, 1, 2, 1, 2, 45, 4, 3, 1, 3, 1, 2, 6, 3, 2, 3, 4, 14, 1, 6, 3]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-3.0*x^3.0-1.0/2.0*x^69.0+4.0*x^38.0-x^32.0-1.0-2.0*x^38.0-1.0/2.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-3.0*3.0*x^2.0-1.0/2.0*69.0*x^68.0+4.0*38.0*x^37.0-32.0*x^31.0-1.0*0.0-2.0*38.0*x^37.0-1.0/2.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-9.0*x^2.0-34.5*x^68.0+152.0*x^37.0-32.0*x^31.0-76.0*x^37.0-1.5*x^2.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-3.0*x^3.0-1.0/2.0*x^69.0+4.0*x^38.0-x^32.0-1.0-2.0*x^38.0-1.0/2.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-3.0/4.0*x^4.0-1.0/2.0/70.0*x^70.0+4.0/39.0*x^39.0-1.0/33.0*x^33.0-1.0*x-2.0/39.0*x^39.0-1.0/2.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/1.3333333333333333*x^4.0-1.0/140.0*x^70.0+1.0/9.75*x^39.0-1.0/33.0*x^33.0-x-1.0/19.5*x^39.0-1.0/8.0*x^4.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-9.0*x^2.0-34.5*x^68.0+152.0*x^37.0-32.0*x^31.0-76.0*x^37.0-1.5*x^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-9.0*2.0*x^1.0-34.5*68.0*x^67.0+152.0*37.0*x^36.0-32.0*31.0*x^30.0-76.0*37.0*x^36.0-1.5*2.0*x^1.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-18.0*x-2346.0*x^67.0+5624.0*x^36.0-992.0*x^30.0-2812.0*x^36.0-3.0*x";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/1.3333333333333333*x^4.0-1.0/140.0*x^70.0+1.0/9.75*x^39.0-0.030303030303030304*x^33.0-x-1.0/19.5*x^39.0-1.0/8.0*x^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/1.3333333333333333/5.0*x^5.0-1.0/140.0/71.0*x^71.0+1.0/9.75/40.0*x^40.0-0.030303030303030304/34.0*x^34.0-1.0/2.0*x^2.0-1.0/19.5/40.0*x^40.0-1.0/8.0/5.0*x^5.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/6.666666666666666*x^5.0-1.0/9940.0*x^71.0+1.0/390.0*x^40.0-1.0/1122.0*x^34.0-1.0/2.0*x^2.0-1.0/780.0*x^40.0-1.0/40.0*x^5.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-18.0*x-2346.0*x^67.0+5624.0*x^36.0-992.0*x^30.0-2812.0*x^36.0-3.0*x";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-18.0-2346.0*67.0*x^66.0+5624.0*36.0*x^35.0-992.0*30.0*x^29.0-2812.0*36.0*x^35.0-3.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-18.0-157182.0*x^66.0+202464.0*x^35.0-29760.0*x^29.0-101232.0*x^35.0-3.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/6.666666666666666*x^5.0-1.0/9940.0*x^71.0+1.0/390.0*x^40.0-1.0/1122.0*x^34.0-1.0/2.0*x^2.0-1.0/780.0*x^40.0-1.0/40.0*x^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/6.666666666666666/6.0*x^6.0-1.0/9940.0/72.0*x^72.0+1.0/390.0/41.0*x^41.0-1.0/1122.0/35.0*x^35.0-1.0/2.0/3.0*x^3.0-1.0/780.0/41.0*x^41.0-1.0/40.0/6.0*x^6.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/40.0*x^6.0-1.0/715680.0*x^72.0+1.0/15990.0*x^41.0-1.0/39270.0*x^35.0-1.0/6.0*x^3.0-1.0/31980.0*x^41.0-1.0/240.0*x^6.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-18.0-157182.0*x^66.0+202464.0*x^35.0-29760.0*x^29.0-101232.0*x^35.0-3.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0-157182.0*66.0*x^65.0+202464.0*35.0*x^34.0-29760.0*29.0*x^28.0-101232.0*35.0*x^34.0-3.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1.0374012E7*x^65.0+7086240.0*x^34.0-863040.0*x^28.0-3543120.0*x^34.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/40.0*x^6.0-1.0/715680.0*x^72.0+1.0/15990.0*x^41.0-1.0/39270.0*x^35.0-1.0/6.0*x^3.0-1.0/31980.0*x^41.0-1.0/240.0*x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/40.0/7.0*x^7.0-1.0/715680.0/73.0*x^73.0+1.0/15990.0/42.0*x^42.0-1.0/39270.0/36.0*x^36.0-1.0/6.0/4.0*x^4.0-1.0/31980.0/42.0*x^42.0-1.0/240.0/7.0*x^7.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/280.0*x^7.0-1.0/5.224464E7*x^73.0+1.0/671580.0*x^42.0-1.0/1413720.0*x^36.0-1.0/24.0*x^4.0-1.0/1343160.0*x^42.0-1.0/1680.0*x^7.0";
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

public static void TestCaseDiff121142() {
 UsageCalculus.TestCase = 121142;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-1*xy/2*xy^2*-3*xy^32*xy012^2*-3*xy012^3*1*xy012/-3*xy012^23*xy^31*xy/-3*xy^2-3*x0^2*-1*x0^3*2*x01*xy^3*2*xy/3*xy^2*--1*xy^32*xy3*x0^2*--1*x0^3-1*xy^3*2*xy/3*xy^22*xy/3*xy^2*-1*xy^3*-3*xy3*x0^21*xy^3*-3*xy-3*xy/1*xy^2*-2*xy^31*x0^2*-2*x0^3*3*x0/-1*x0^2-1*xy/2*xy^22*xy012^2*-3*xy012^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=141 EqnNumber=44 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[98, 44, 14, 15, 2, 1, 2, 9, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 3, 2, 3, 1, 1, 3, 2, 3, 1, 2, 19, 4, 21, 30]"+
"// DOEMatrixRow=[29, 46, 16, 3, 1, 2, 3, 7, 2, 3, 4, 1, 1, 2, 3, 2, 3, 46, 5, 1, 2, 4, 2, 3, 1, 4, 3, 1, 1, 15, 2, 7, 4]"+
//Tail EqnIndex=141 EqnNumber=44 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[98, 44, 14, 15, 2, 1, 2, 9, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 3, 2, 3, 1, 1, 3, 2, 3, 1, 2, 19, 4, 21, 30]"+
"// DOEMatrixRow=[29, 46, 16, 3, 1, 2, 3, 7, 2, 3, 4, 1, 1, 2, 3, 2, 3, 46, 5, 1, 2, 4, 2, 3, 1, 4, 3, 1, 1, 15, 2, 7, 4]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-1.0/2.0*xy^69.0+x0^2.0*4.0*xy^38.0-x0^2.0*xy^32.0-x0^3.0+x0^21.0*2.0*xy^36.0+x0^2.0*x0*36.0*xy^34.0+1.5*xy^23.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-1.0/2.0*69.0*xy^68.0+x0^2.0*4.0*38.0*xy^37.0-x0^2.0*32.0*xy^31.0-x0^3.0*0.0+x0^21.0*2.0*36.0*xy^35.0+x0^2.0*x0*36.0*34.0*xy^33.0+1.5*23.0*xy^22.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-34.5*xy^68.0+x0^2.0*152.0*xy^37.0-x0^2.0*32.0*xy^31.0-x0^3.0*0.0+x0^21.0*72.0*xy^35.0+x0^2.0*x0*1224.0*xy^33.0+34.5*xy^22.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-1.0/2.0*xy^69.0+x0^2.0*4.0*xy^38.0-x0^2.0*xy^32.0-x0^3.0+x0^21.0*2.0*xy^36.0+x0^2.0*x0*36.0*xy^34.0+1.5*xy^23.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.0/2.0/70.0*xy^70.0+x0^2.0*4.0/39.0*xy^39.0-x0^2.0/33.0*xy^33.0-x0^3.0*xy+x0^21.0*2.0/37.0*xy^37.0+x0^2.0*x0*36.0/35.0*xy^35.0+1.5/24.0*xy^24.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-0.007142857142857143*xy^70.0+x0^2.0*0.10256410256410256*xy^39.0-x0^2.0/33.0*xy^33.0-x0^3.0*xy+x0^21.0*0.05405405405405406*xy^37.0+x0^2.0*x0*1.0285714285714285*xy^35.0+1.0/16.0*xy^24.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-34.5*xy^68.0+x0^2.0*152.0*xy^37.0-x0^2.0*32.0*xy^31.0-x0^3.0*0.0+x0^21.0*72.0*xy^35.0+x0^2.0*x0*1224.0*xy^33.0+34.5*xy^22.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-34.5*68.0*xy^67.0+x0^2.0*152.0*37.0*xy^36.0-x0^2.0*32.0*31.0*xy^30.0-x0^3.0*0.0*0.0+x0^21.0*72.0*35.0*xy^34.0+x0^2.0*x0*1224.0*33.0*xy^32.0+34.5*22.0*xy^21.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-2346.0*xy^67.0+x0^2.0*5624.0*xy^36.0-x0^2.0*992.0*xy^30.0-x0^3.0*0.0+x0^21.0*2520.0*xy^34.0+x0^2.0*x0*40392.0*xy^32.0+759.0*xy^21.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-0.007142857142857143*xy^70.0+x0^2.0*0.10256410256410256*xy^39.0-x0^2.0/33.0*xy^33.0-x0^3.0*xy+x0^21.0*0.05405405405405406*xy^37.0+x0^2.0*x0*1.0285714285714285*xy^35.0+1.0/16.0*xy^24.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-0.007142857142857143/71.0*xy^71.0+x0^2.0*0.10256410256410256/40.0*xy^40.0-x0^2.0/33.0/34.0*xy^34.0-x0^3.0/2.0*xy^2.0+x0^21.0*0.05405405405405406/38.0*xy^38.0+x0^2.0*x0*1.0285714285714285/36.0*xy^36.0+1.0/16.0/25.0*xy^25.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0060362173038229E-4*xy^71.0+x0^2.0*0.002564102564102564*xy^40.0-x0^2.0*8.9126559714795E-4*xy^34.0-x0^3.0/2.0*xy^2.0+x0^21.0*0.001422475106685633*xy^38.0+x0^2.0*x0/35.0*xy^36.0+1.0/400.0*xy^25.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-2346.0*xy^67.0+x0^2.0*5624.0*xy^36.0-x0^2.0*992.0*xy^30.0-x0^3.0*0.0+x0^21.0*2520.0*xy^34.0+x0^2.0*x0*40392.0*xy^32.0+759.0*xy^21.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-2346.0*67.0*xy^66.0+x0^2.0*5624.0*36.0*xy^35.0-x0^2.0*992.0*30.0*xy^29.0-x0^3.0*0.0*0.0+x0^21.0*2520.0*34.0*xy^33.0+x0^2.0*x0*40392.0*32.0*xy^31.0+759.0*21.0*xy^20.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-157182.0*xy^66.0+x0^2.0*202464.0*xy^35.0-x0^2.0*29760.0*xy^29.0-x0^3.0*0.0+x0^21.0*85680.0*xy^33.0+x0^2.0*x0*1292544.0*xy^31.0+15939.0*xy^20.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0060362173038229E-4*xy^71.0-4.0*xy^71.0+x0^2.0*0.002564102564102564*xy^40.0-x0^2.0*8.9126559714795E-4*xy^34.0-4.0*xy^34.0-x0^3.0/2.0*xy^2.0+x0^21.0*0.001422475106685633*xy^38.0+x0^2.0*x0/35.0*xy^36.0+1.0/400.0*xy^25.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0060362173038229E-4/72.0*xy^72.0-4.0/72.0*xy^72.0+x0^2.0*0.002564102564102564/41.0*xy^41.0-x0^2.0*8.9126559714795E-4/35.0*xy^35.0-4.0/35.0*xy^35.0-x0^3.0/2.0/3.0*xy^3.0+x0^21.0*0.001422475106685633/39.0*xy^39.0+x0^2.0*x0/35.0/37.0*xy^37.0+1.0/400.0/26.0*xy^26.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/715680.0*xy^72.0-1.0/18.0*xy^72.0-0.05555555555555555*xy^72.0+x0^2.0*6.253908692933083E-5*xy^41.0-x0^2.0/39270.0*xy^35.0-1.0/8.75*xy^35.0-0.11428571428571428*xy^35.0-x0^3.0*0.16666666666666666*xy^3.0+x0^21.0*3.6473720684247E-5*xy^39.0+x0^2.0*x0/1295.0*xy^37.0+1.0/10400.0*xy^26.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-157182.0*xy^66.0+x0^2.0*202464.0*xy^35.0-x0^2.0*29760.0*xy^29.0-x0^3.0*0.0+x0^21.0*85680.0*xy^33.0+x0^2.0*x0*1292544.0*xy^31.0+15939.0*xy^20.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-157182.0*66.0*xy^65.0+x0^2.0*202464.0*35.0*xy^34.0-x0^2.0*29760.0*29.0*xy^28.0-x0^3.0*0.0*0.0+x0^21.0*85680.0*33.0*xy^32.0+x0^2.0*x0*1292544.0*31.0*xy^30.0+15939.0*20.0*xy^19.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1.0374012E7*xy^65.0+x0^2.0*7086240.0*xy^34.0-x0^2.0*863040.0*xy^28.0-x0^3.0*0.0+x0^21.0*2827440.0*xy^32.0+x0^2.0*x0*4.0068864E7*xy^30.0+318780.0*xy^19.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/715680.0*xy^72.0-1.0/18.0*xy^72.0-0.05555555555555555*xy^72.0+x0^2.0*6.253908692933083E-5*xy^41.0-5.0*xy^41.0-x0^2.0/39270.0*xy^35.0-1.0/8.75*xy^35.0-0.11428571428571428*xy^35.0-x0^3.0*0.16666666666666666*xy^3.0+x0^21.0*3.6473720684247E-5*xy^39.0-5.0*xy^39.0+x0^2.0*x0/1295.0*xy^37.0+1.0/10400.0*xy^26.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/715680.0/73.0*xy^73.0-1.0/18.0/73.0*xy^73.0-0.05555555555555555/73.0*xy^73.0+x0^2.0*6.253908692933083E-5/42.0*xy^42.0-5.0/42.0*xy^42.0-x0^2.0/39270.0/36.0*xy^36.0-1.0/8.75/36.0*xy^36.0-0.11428571428571428/36.0*xy^36.0-x0^3.0*0.16666666666666666/4.0*xy^4.0+x0^21.0*3.6473720684247E-5/40.0*xy^40.0-5.0/40.0*xy^40.0+x0^2.0*x0/1295.0/38.0*xy^38.0+1.0/10400.0/27.0*xy^27.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/5.224464E7*xy^73.0-1.0/1314.0*xy^73.0-7.6103500761035E-4*xy^73.0+x0^2.0/671580.0*xy^42.0-1.0/8.4*xy^42.0-0.11904761904761904*xy^42.0-x0^2.0/1413720.0*xy^36.0-1.0/315.0*xy^36.0-0.0031746031746031746*xy^36.0-x0^3.0*0.041666666666666664*xy^4.0+x0^21.0/1096680.0*xy^40.0-1.0/8.0*xy^40.0-0.125*xy^40.0+x0^2.0*x0/49210.0*xy^38.0+1.0/280800.0*xy^27.0";
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

public static void TestCaseDiff121143() {
 UsageCalculus.TestCase = 121143;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xy012^2*-3*xy012^3*1*xy012/-3*xy012^23*xyz^31*xyz/-3*xyz^2-3*x0^2*-1*x0^3*2*x01*xyz^3*2*xyz/3*xyz^2*--1*xyz^32*xyz3*x0^2*--1*x0^3-1*xyz^3*2*xyz/3*xyz^22*xyz/3*xyz^2*-1*xyz^3*-3*xyz3*x0^21*xyz^3*-3*xyz-3*xyz/1*xyz^2*-2*xyz^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyz^33*xyz/-1*xyz^22*xy012^2*-3*xy012^33*xyz^3*1*xyz";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=142 EqnNumber=45 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[62, 45, 15, 16, 3, 2, 3, 10, 2, 3, 4, 2, 3, 1, 2, 3, 1, 2, 3, 2, 3, 4, 3, 1, 2, 3, 4, 3, 4, 2, 3, 20, 5, 22, 31]"+
"// DOEMatrixRow=[94, 47, 17, 4, 2, 3, 1, 8, 3, 4, 1, 2, 3, 1, 4, 3, 1, 47, 6, 2, 3, 5, 3, 1, 2, 1, 1, 2, 3, 16, 1, 8, 5]"+
//Tail EqnIndex=142 EqnNumber=45 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[62, 45, 15, 16, 3, 2, 3, 10, 2, 3, 4, 2, 3, 1, 2, 3, 1, 2, 3, 2, 3, 4, 3, 1, 2, 3, 4, 3, 4, 2, 3, 20, 5, 22, 31]"+
"// DOEMatrixRow=[94, 47, 17, 4, 2, 3, 1, 8, 3, 4, 1, 2, 3, 1, 4, 3, 1, 47, 6, 2, 3, 5, 3, 1, 2, 1, 1, 2, 3, 16, 1, 8, 5]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-xy012^2.0*xy012/1.5*xyz^34.0+x0^2.0*4.0*xyz^38.0-x0^2.0*xyz^32.0-x0^3.0+x0^21.0*2.0*xyz^36.0+x0^2.0*x0*108.0*xyz^94.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-xy012^2.0*xy012/1.5*34.0*xyz^33.0+x0^2.0*4.0*38.0*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0+x0^21.0*2.0*36.0*xyz^35.0+x0^2.0*x0*94.0*xyz^93.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-xy012^2.0*xy012*22.666666666666668*xyz^33.0+x0^2.0*152.0*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0+x0^21.0*72.0*xyz^35.0+x0^2.0*x0*94.0*xyz^93.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-xy012^2.0*xy012/1.5*xyz^34.0+x0^2.0*4.0*xyz^38.0-x0^2.0*xyz^32.0-x0^3.0+x0^21.0*2.0*xyz^36.0+x0^2.0*x0*108.0*xyz^94.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-xy012^2.0*xy012/1.5/35.0*xyz^35.0+x0^2.0*4.0/39.0*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz+x0^21.0*2.0/37.0*xyz^37.0+x0^2.0*x0*108.0/95.0*xyz^95.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-xy012^2.0*xy012*0.01904761904761905*xyz^35.0+x0^2.0*0.10256410256410256*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz+x0^21.0*0.05405405405405406*xyz^37.0+x0^2.0*x0*1.1368421052631579*xyz^95.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-xy012^2.0*xy012*22.666666666666668*xyz^33.0+x0^2.0*152.0*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0+x0^21.0*72.0*xyz^35.0+x0^2.0*x0*94.0*xyz^93.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-xy012^2.0*xy012*22.666666666666668*33.0*xyz^32.0+x0^2.0*152.0*37.0*xyz^36.0-x0^2.0*32.0*31.0*xyz^30.0-x0^3.0*0.0*0.0+x0^21.0*72.0*35.0*xyz^34.0+x0^2.0*x0*93.0*xyz^92.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-xy012^2.0*xy012*748.0*xyz^32.0+x0^2.0*5624.0*xyz^36.0-x0^2.0*992.0*xyz^30.0-x0^3.0*0.0+x0^21.0*2520.0*xyz^34.0+x0^2.0*x0*93.0*xyz^92.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-xy012^2.0*xy012*0.01904761904761905*xyz^35.0+x0^2.0*0.10256410256410256*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz+x0^21.0*0.05405405405405406*xyz^37.0+x0^2.0*x0*1.1368421052631579*xyz^95.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-xy012^2.0*xy012*0.01904761904761905/36.0*xyz^36.0+x0^2.0*0.10256410256410256/40.0*xyz^40.0-x0^2.0/33.0/34.0*xyz^34.0-x0^3.0/2.0*xyz^2.0+x0^21.0*0.05405405405405406/38.0*xyz^38.0+x0^2.0*x0*1.1368421052631579/96.0*xyz^96.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-xy012^2.0*xy012*5.291005291005291E-4*xyz^36.0+x0^2.0*0.002564102564102564*xyz^40.0-x0^2.0*8.9126559714795E-4*xyz^34.0-x0^3.0/2.0*xyz^2.0+x0^21.0*0.001422475106685633*xyz^38.0+x0^2.0*x0/84.44444444444444*xyz^96.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-xy012^2.0*xy012*748.0*xyz^32.0+x0^2.0*5624.0*xyz^36.0-x0^2.0*992.0*xyz^30.0-x0^3.0*0.0+x0^21.0*2520.0*xyz^34.0+x0^2.0*x0*93.0*xyz^92.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-xy012^2.0*xy012*748.0*32.0*xyz^31.0+x0^2.0*5624.0*36.0*xyz^35.0-x0^2.0*992.0*30.0*xyz^29.0-x0^3.0*0.0*0.0+x0^21.0*2520.0*34.0*xyz^33.0+x0^2.0*x0*92.0*xyz^91.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-xy012^2.0*xy012*23936.0*xyz^31.0+x0^2.0*202464.0*xyz^35.0-x0^2.0*29760.0*xyz^29.0-x0^3.0*0.0+x0^21.0*85680.0*xyz^33.0+x0^2.0*x0*92.0*xyz^91.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-xy012^2.0*xy012*5.291005291005291E-4*xyz^36.0-4.0*xyz^36.0+x0^2.0*0.002564102564102564*xyz^40.0-x0^2.0*8.9126559714795E-4*xyz^34.0-4.0*xyz^34.0-x0^3.0/2.0*xyz^2.0+x0^21.0*0.001422475106685633*xyz^38.0+x0^2.0*x0/84.44444444444444*xyz^96.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-xy012^2.0*xy012*5.291005291005291E-4/37.0*xyz^37.0-4.0/37.0*xyz^37.0+x0^2.0*0.002564102564102564/41.0*xyz^41.0-x0^2.0*8.9126559714795E-4/35.0*xyz^35.0-4.0/35.0*xyz^35.0-x0^3.0/2.0/3.0*xyz^3.0+x0^21.0*0.001422475106685633/39.0*xyz^39.0+x0^2.0*x0/84.44444444444444/97.0*xyz^97.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-xy012^2.0*xy012/69930.0*xyz^37.0-1.0/9.25*xyz^37.0-0.10810810810810811*xyz^37.0+x0^2.0*6.253908692933083E-5*xyz^41.0-x0^2.0/39270.0*xyz^35.0-1.0/8.75*xyz^35.0-0.11428571428571428*xyz^35.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^21.0*3.6473720684247E-5*xyz^39.0+x0^2.0*x0/8191.111111111111*xyz^97.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-xy012^2.0*xy012*23936.0*xyz^31.0+x0^2.0*202464.0*xyz^35.0-x0^2.0*29760.0*xyz^29.0-x0^3.0*0.0+x0^21.0*85680.0*xyz^33.0+x0^2.0*x0*92.0*xyz^91.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-xy012^2.0*xy012*23936.0*31.0*xyz^30.0+x0^2.0*202464.0*35.0*xyz^34.0-x0^2.0*29760.0*29.0*xyz^28.0-x0^3.0*0.0*0.0+x0^21.0*85680.0*33.0*xyz^32.0+x0^2.0*x0*91.0*xyz^90.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-xy012^2.0*xy012*742016.0*xyz^30.0+x0^2.0*7086240.0*xyz^34.0-x0^2.0*863040.0*xyz^28.0-x0^3.0*0.0+x0^21.0*2827440.0*xyz^32.0+x0^2.0*x0*91.0*xyz^90.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-xy012^2.0*xy012/69930.0*xyz^37.0-1.0/9.25*xyz^37.0-0.10810810810810811*xyz^37.0+x0^2.0*6.253908692933083E-5*xyz^41.0-5.0*xyz^41.0-x0^2.0/39270.0*xyz^35.0-1.0/8.75*xyz^35.0-0.11428571428571428*xyz^35.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^21.0*3.6473720684247E-5*xyz^39.0-5.0*xyz^39.0+x0^2.0*x0/8191.111111111111*xyz^97.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-xy012^2.0*xy012/69930.0/38.0*xyz^38.0-1.0/9.25/38.0*xyz^38.0-0.10810810810810811/38.0*xyz^38.0+x0^2.0*6.253908692933083E-5/42.0*xyz^42.0-5.0/42.0*xyz^42.0-x0^2.0/39270.0/36.0*xyz^36.0-1.0/8.75/36.0*xyz^36.0-0.11428571428571428/36.0*xyz^36.0-x0^3.0*0.16666666666666666/4.0*xyz^4.0+x0^21.0*3.6473720684247E-5/40.0*xyz^40.0-5.0/40.0*xyz^40.0+x0^2.0*x0/8191.111111111111/98.0*xyz^98.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-xy012^2.0*xy012/2657340.0*xyz^38.0-1.0/351.5*xyz^38.0-0.002844950213371266*xyz^38.0+x0^2.0/671580.0*xyz^42.0-1.0/8.4*xyz^42.0-0.11904761904761904*xyz^42.0-x0^2.0/1413720.0*xyz^36.0-1.0/315.0*xyz^36.0-0.0031746031746031746*xyz^36.0-x0^3.0*0.041666666666666664*xyz^4.0+x0^21.0/1096680.0*xyz^40.0-1.0/8.0*xyz^40.0-0.125*xyz^40.0+x0^2.0*x0/802728.8888888889*xyz^98.0";
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

public static void TestCaseDiff121144() {
 UsageCalculus.TestCase = 121144;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xyza^31*xyza/-3*xyza^2-3*x0^2*-1*x0^3*2*x01*xyza^3*2*xyza/3*xyza^2*--1*xyza^32*xyza3*x0^2*--1*x0^3-1*xyza^3*2*xyza/3*xyza^22*xyza/3*xyza^2*-1*xyza^3*-3*xyza3*x0^21*xyza^3*-3*xyza-3*xyza/1*xyza^2*-2*xyza^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyza^33*xyza/-1*xyza^2-1*x0^2*-2*x0^3*3*x02*xyza^3*3*xyza/1*xyza^2*--3*xyza^33*xyza^3*1*xyza1*xyza/-3*xyza^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=143 EqnNumber=46 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[28, 46, 16, 17, 4, 3, 1, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 4, 3, 4, 5, 1, 2, 3, 4, 5, 1, 1, 3, 4, 21, 6, 23, 32]"+
"// DOEMatrixRow=[58, 48, 18, 1, 3, 1, 2, 9, 1, 1, 2, 1, 1, 2, 1, 1, 2, 48, 7, 3, 1, 1, 1, 2, 3, 2, 3, 1, 4, 1, 2, 9, 6]"+
//Tail EqnIndex=143 EqnNumber=46 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[28, 46, 16, 17, 4, 3, 1, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 4, 3, 4, 5, 1, 2, 3, 4, 5, 1, 1, 3, 4, 21, 6, 23, 32]"+
"// DOEMatrixRow=[58, 48, 18, 1, 3, 1, 2, 9, 1, 1, 2, 1, 1, 2, 1, 1, 2, 48, 7, 3, 1, 1, 1, 2, 3, 2, 3, 1, 4, 1, 2, 9, 6]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-xyza^34.0+x0^2.0*4.0*xyza^38.0-x0^2.0*xyza^32.0-x0^3.0+x0^21.0*2.0*xyza^36.0-x0^2.0*x0*36.0*xyza^70.0+18.0*xyza^45.0+xyza^39.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-34.0*xyza^33.0+x0^2.0*4.0*38.0*xyza^37.0-x0^2.0*32.0*xyza^31.0-x0^3.0*0.0+x0^21.0*2.0*36.0*xyza^35.0-x0^2.0*x0*36.0*70.0*xyza^69.0+18.0*45.0*xyza^44.0+39.0*xyza^38.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-34.0*xyza^33.0+x0^2.0*152.0*xyza^37.0-x0^2.0*32.0*xyza^31.0-x0^3.0*0.0+x0^21.0*72.0*xyza^35.0-x0^2.0*x0*2520.0*xyza^69.0+810.0*xyza^44.0+39.0*xyza^38.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-xyza^34.0+x0^2.0*4.0*xyza^38.0-x0^2.0*xyza^32.0-x0^3.0+x0^21.0*2.0*xyza^36.0-x0^2.0*x0*36.0*xyza^70.0+18.0*xyza^45.0+xyza^39.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.0/35.0*xyza^35.0+x0^2.0*4.0/39.0*xyza^39.0-x0^2.0/33.0*xyza^33.0-x0^3.0*xyza+x0^21.0*2.0/37.0*xyza^37.0-x0^2.0*x0*36.0/71.0*xyza^71.0+18.0/46.0*xyza^46.0+1.0/40.0*xyza^40.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-0.02857142857142857*xyza^35.0+x0^2.0*0.10256410256410256*xyza^39.0-x0^2.0/33.0*xyza^33.0-x0^3.0*xyza+x0^21.0*0.05405405405405406*xyza^37.0-x0^2.0*x0/1.9722222222222223*xyza^71.0+1.0/2.5555555555555554*xyza^46.0+1.0/40.0*xyza^40.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-34.0*xyza^33.0+x0^2.0*152.0*xyza^37.0-x0^2.0*32.0*xyza^31.0-x0^3.0*0.0+x0^21.0*72.0*xyza^35.0-x0^2.0*x0*2520.0*xyza^69.0+810.0*xyza^44.0+39.0*xyza^38.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-34.0*33.0*xyza^32.0+x0^2.0*152.0*37.0*xyza^36.0-x0^2.0*32.0*31.0*xyza^30.0-x0^3.0*0.0*0.0+x0^21.0*72.0*35.0*xyza^34.0-x0^2.0*x0*2520.0*69.0*xyza^68.0+810.0*44.0*xyza^43.0+39.0*38.0*xyza^37.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-1122.0*xyza^32.0+x0^2.0*5624.0*xyza^36.0-x0^2.0*992.0*xyza^30.0-x0^3.0*0.0+x0^21.0*2520.0*xyza^34.0-x0^2.0*x0*173880.0*xyza^68.0+35640.0*xyza^43.0+1482.0*xyza^37.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-0.02857142857142857*xyza^35.0+x0^2.0*0.10256410256410256*xyza^39.0-x0^2.0/33.0*xyza^33.0-x0^3.0*xyza+x0^21.0*0.05405405405405406*xyza^37.0-x0^2.0*x0/1.9722222222222223*xyza^71.0+1.0/2.5555555555555554*xyza^46.0+1.0/40.0*xyza^40.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-0.02857142857142857/36.0*xyza^36.0+x0^2.0*0.10256410256410256/40.0*xyza^40.0-x0^2.0/33.0/34.0*xyza^34.0-x0^3.0/2.0*xyza^2.0+x0^21.0*0.05405405405405406/38.0*xyza^38.0-x0^2.0*x0/1.9722222222222223/72.0*xyza^72.0+1.0/2.5555555555555554/47.0*xyza^47.0+1.0/40.0/41.0*xyza^41.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-7.936507936507937E-4*xyza^36.0+x0^2.0*0.002564102564102564*xyza^40.0-x0^2.0*8.9126559714795E-4*xyza^34.0-x0^3.0/2.0*xyza^2.0+x0^21.0*0.001422475106685633*xyza^38.0-x0^2.0*x0/142.0*xyza^72.0+1.0/120.1111111111111*xyza^47.0+1.0/1640.0*xyza^41.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-1122.0*xyza^32.0+x0^2.0*5624.0*xyza^36.0-x0^2.0*992.0*xyza^30.0-x0^3.0*0.0+x0^21.0*2520.0*xyza^34.0-x0^2.0*x0*173880.0*xyza^68.0+35640.0*xyza^43.0+1482.0*xyza^37.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-1122.0*32.0*xyza^31.0+x0^2.0*5624.0*36.0*xyza^35.0-x0^2.0*992.0*30.0*xyza^29.0-x0^3.0*0.0*0.0+x0^21.0*2520.0*34.0*xyza^33.0-x0^2.0*x0*173880.0*68.0*xyza^67.0+35640.0*43.0*xyza^42.0+1482.0*37.0*xyza^36.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-35904.0*xyza^31.0+x0^2.0*202464.0*xyza^35.0-x0^2.0*29760.0*xyza^29.0-x0^3.0*0.0+x0^21.0*85680.0*xyza^33.0-x0^2.0*x0*1.182384E7*xyza^67.0+1532520.0*xyza^42.0+54834.0*xyza^36.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-7.936507936507937E-4*xyza^36.0-4.0*xyza^36.0+x0^2.0*0.002564102564102564*xyza^40.0-x0^2.0*8.9126559714795E-4*xyza^34.0-4.0*xyza^34.0-x0^3.0/2.0*xyza^2.0+x0^21.0*0.001422475106685633*xyza^38.0-x0^2.0*x0/142.0*xyza^72.0+1.0/120.1111111111111*xyza^47.0+1.0/1640.0*xyza^41.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-7.936507936507937E-4/37.0*xyza^37.0-4.0/37.0*xyza^37.0+x0^2.0*0.002564102564102564/41.0*xyza^41.0-x0^2.0*8.9126559714795E-4/35.0*xyza^35.0-4.0/35.0*xyza^35.0-x0^3.0/2.0/3.0*xyza^3.0+x0^21.0*0.001422475106685633/39.0*xyza^39.0-x0^2.0*x0/142.0/73.0*xyza^73.0+1.0/120.1111111111111/48.0*xyza^48.0+1.0/1640.0/42.0*xyza^42.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/46620.0*xyza^37.0-1.0/9.25*xyza^37.0-0.10810810810810811*xyza^37.0+x0^2.0*6.253908692933083E-5*xyza^41.0-x0^2.0/39270.0*xyza^35.0-1.0/8.75*xyza^35.0-0.11428571428571428*xyza^35.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^21.0*3.6473720684247E-5*xyza^39.0-x0^2.0*x0/10366.0*xyza^73.0+1.0/5765.333333333333*xyza^48.0+1.0/68880.0*xyza^42.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-35904.0*xyza^31.0+x0^2.0*202464.0*xyza^35.0-x0^2.0*29760.0*xyza^29.0-x0^3.0*0.0+x0^21.0*85680.0*xyza^33.0-x0^2.0*x0*1.182384E7*xyza^67.0+1532520.0*xyza^42.0+54834.0*xyza^36.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-35904.0*31.0*xyza^30.0+x0^2.0*202464.0*35.0*xyza^34.0-x0^2.0*29760.0*29.0*xyza^28.0-x0^3.0*0.0*0.0+x0^21.0*85680.0*33.0*xyza^32.0-x0^2.0*x0*1.182384E7*67.0*xyza^66.0+1532520.0*42.0*xyza^41.0+54834.0*36.0*xyza^35.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1113024.0*xyza^30.0+x0^2.0*7086240.0*xyza^34.0-x0^2.0*863040.0*xyza^28.0-x0^3.0*0.0+x0^21.0*2827440.0*xyza^32.0-x0^2.0*x0*7.9219728E8*xyza^66.0+6.436584E7*xyza^41.0+1974024.0*xyza^35.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/46620.0*xyza^37.0-1.0/9.25*xyza^37.0-0.10810810810810811*xyza^37.0+x0^2.0*6.253908692933083E-5*xyza^41.0-5.0*xyza^41.0-x0^2.0/39270.0*xyza^35.0-1.0/8.75*xyza^35.0-0.11428571428571428*xyza^35.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^21.0*3.6473720684247E-5*xyza^39.0-5.0*xyza^39.0-x0^2.0*x0/10366.0*xyza^73.0+1.0/5765.333333333333*xyza^48.0+1.0/68880.0*xyza^42.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/46620.0/38.0*xyza^38.0-1.0/9.25/38.0*xyza^38.0-0.10810810810810811/38.0*xyza^38.0+x0^2.0*6.253908692933083E-5/42.0*xyza^42.0-5.0/42.0*xyza^42.0-x0^2.0/39270.0/36.0*xyza^36.0-1.0/8.75/36.0*xyza^36.0-0.11428571428571428/36.0*xyza^36.0-x0^3.0*0.16666666666666666/4.0*xyza^4.0+x0^21.0*3.6473720684247E-5/40.0*xyza^40.0-5.0/40.0*xyza^40.0-x0^2.0*x0/10366.0/74.0*xyza^74.0+1.0/5765.333333333333/49.0*xyza^49.0+1.0/68880.0/43.0*xyza^43.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/1771560.0*xyza^38.0-1.0/351.5*xyza^38.0-0.002844950213371266*xyza^38.0+x0^2.0/671580.0*xyza^42.0-1.0/8.4*xyza^42.0-0.11904761904761904*xyza^42.0-x0^2.0/1413720.0*xyza^36.0-1.0/315.0*xyza^36.0-0.0031746031746031746*xyza^36.0-x0^3.0*0.041666666666666664*xyza^4.0+x0^21.0/1096680.0*xyza^40.0-1.0/8.0*xyza^40.0-0.125*xyza^40.0-x0^2.0*x0/767084.0*xyza^74.0+1.0/282501.3333333333*xyza^49.0+1.0/2961840.0*xyza^43.0";
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

public static void TestCaseDiff121145() {
 UsageCalculus.TestCase = 121145;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x/-3*x^2-3*x0^2*-1*x0^3*2*x01*x^3*2*x/3*x^2*--1*x^32*x3*x0^2*--1*x0^3-1*x^3*2*x/3*x^22*x/3*x^2*-1*x^3*-3*x3*x0^21*x^3*-3*x-3*x/1*x^2*-2*x^31*x0^2*-2*x0^3*3*x0/-1*x0^22*x^33*x/-1*x^2-1*x0^2*-2*x0^3*3*x02*x^3*3*x/1*x^2*--3*x^33*x1*x0^2*--3*x0^31*x/-3*x^2-3*x0^2*-1*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=144 EqnNumber=47 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[93, 47, 17, 18, 1, 1, 2, 3, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 5, 1, 1, 6, 2, 3, 1, 1, 6, 2, 3, 4, 1, 22, 7, 24, 1]"+
"// DOEMatrixRow=[24, 49, 19, 2, 1, 2, 3, 10, 2, 3, 4, 2, 3, 1, 2, 3, 1, 49, 8, 1, 2, 3, 2, 3, 4, 3, 1, 2, 1, 2, 1, 10, 7]"+
//Tail EqnIndex=144 EqnNumber=47 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[93, 47, 17, 18, 1, 1, 2, 3, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 5, 1, 1, 6, 2, 3, 1, 1, 6, 2, 3, 4, 1, 22, 7, 24, 1]"+
"// DOEMatrixRow=[24, 49, 19, 2, 1, 2, 3, 10, 2, 3, 4, 2, 3, 1, 2, 3, 1, 49, 8, 1, 2, 3, 2, 3, 4, 3, 1, 2, 1, 2, 1, 10, 7]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-1.0/3.0*x^3.0+4.0*x^38.0-x^32.0-1.0+2.0*x^36.0-36.0*x^70.0+54.0*x^42.0-3.0*x^36.0+x^3.0+3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-1.0/3.0*3.0*x^2.0+4.0*38.0*x^37.0-32.0*x^31.0-1.0*0.0+2.0*36.0*x^35.0-36.0*70.0*x^69.0+54.0*42.0*x^41.0-3.0*36.0*x^35.0+3.0*x^2.0+3.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x^2.0+152.0*x^37.0-32.0*x^31.0+72.0*x^35.0-2520.0*x^69.0+2268.0*x^41.0-108.0*x^35.0+3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-1.0/3.0*x^3.0+4.0*x^38.0-x^32.0-1.0+2.0*x^36.0-36.0*x^70.0+54.0*x^42.0-3.0*x^36.0+x^3.0+3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.0/3.0/4.0*x^4.0+4.0/39.0*x^39.0-1.0/33.0*x^33.0-1.0*x+2.0/37.0*x^37.0-36.0/71.0*x^71.0+54.0/43.0*x^43.0-3.0/37.0*x^37.0+1.0/4.0*x^4.0+3.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/12.0*x^4.0+1.0/9.75*x^39.0-1.0/33.0*x^33.0-x+1.0/18.5*x^37.0-1.0/1.9722222222222223*x^71.0+1.255813953488372*x^43.0-1.0/12.333333333333334*x^37.0+1.0/4.0*x^4.0+3.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x^2.0+152.0*x^37.0-32.0*x^31.0+72.0*x^35.0-2520.0*x^69.0+2268.0*x^41.0-108.0*x^35.0+3.0*x^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-2.0*x^1.0+152.0*37.0*x^36.0-32.0*31.0*x^30.0+72.0*35.0*x^34.0-2520.0*69.0*x^68.0+2268.0*41.0*x^40.0-108.0*35.0*x^34.0+3.0*2.0*x^1.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-2.0*x+5624.0*x^36.0-992.0*x^30.0+2520.0*x^34.0-173880.0*x^68.0+92988.0*x^40.0-3780.0*x^34.0+6.0*x";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/12.0*x^4.0+1.0/9.75*x^39.0-0.030303030303030304*x^33.0-x+1.0/18.5*x^37.0-1.0/1.9722222222222223*x^71.0+1.255813953488372*x^43.0-1.0/12.333333333333334*x^37.0+1.0/4.0*x^4.0+3.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/12.0/5.0*x^5.0+1.0/9.75/40.0*x^40.0-0.030303030303030304/34.0*x^34.0-1.0/2.0*x^2.0+1.0/18.5/38.0*x^38.0-1.0/1.9722222222222223/72.0*x^72.0+1.255813953488372/44.0*x^44.0-1.0/12.333333333333334/38.0*x^38.0+1.0/4.0/5.0*x^5.0+3.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/60.0*x^5.0+1.0/390.0*x^40.0-1.0/1122.0*x^34.0-1.0/2.0*x^2.0+1.0/703.0*x^38.0-1.0/142.0*x^72.0+1.0/35.03703703703704*x^44.0-1.0/468.6666666666667*x^38.0+1.0/20.0*x^5.0+1.5*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-2.0*x+5624.0*x^36.0-992.0*x^30.0+2520.0*x^34.0-173880.0*x^68.0+92988.0*x^40.0-3780.0*x^34.0+6.0*x";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-2.0+5624.0*36.0*x^35.0-992.0*30.0*x^29.0+2520.0*34.0*x^33.0-173880.0*68.0*x^67.0+92988.0*40.0*x^39.0-3780.0*34.0*x^33.0+6.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-2.0+202464.0*x^35.0-29760.0*x^29.0+85680.0*x^33.0-1.182384E7*x^67.0+3719520.0*x^39.0-128520.0*x^33.0+6.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/60.0*x^5.0+1.0/390.0*x^40.0-1.0/1122.0*x^34.0-1.0/2.0*x^2.0+1.0/703.0*x^38.0-1.0/142.0*x^72.0+1.0/35.03703703703704*x^44.0-1.0/468.6666666666667*x^38.0+1.0/20.0*x^5.0+1.5*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/60.0/6.0*x^6.0+1.0/390.0/41.0*x^41.0-1.0/1122.0/35.0*x^35.0-1.0/2.0/3.0*x^3.0+1.0/703.0/39.0*x^39.0-1.0/142.0/73.0*x^73.0+1.0/35.03703703703704/45.0*x^45.0-1.0/468.6666666666667/39.0*x^39.0+1.0/20.0/6.0*x^6.0+1.5/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/360.0*x^6.0+1.0/15990.0*x^41.0-1.0/39270.0*x^35.0-1.0/6.0*x^3.0+1.0/27417.0*x^39.0-1.0/10366.0*x^73.0+1.0/1576.6666666666667*x^45.0-1.0/18278.0*x^39.0+1.0/120.0*x^6.0+1.0/2.0*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-2.0+202464.0*x^35.0-29760.0*x^29.0+85680.0*x^33.0-1.182384E7*x^67.0+3719520.0*x^39.0-128520.0*x^33.0+6.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0+202464.0*35.0*x^34.0-29760.0*29.0*x^28.0+85680.0*33.0*x^32.0-67.0*x^66.0+3719520.0*39.0*x^38.0-128520.0*33.0*x^32.0+6.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "7086240.0*x^34.0-863040.0*x^28.0+2827440.0*x^32.0-67.0*x^66.0+1.4506128E8*x^38.0-4241160.0*x^32.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/360.0*x^6.0+1.0/15990.0*x^41.0-1.0/39270.0*x^35.0-1.0/6.0*x^3.0+1.0/27417.0*x^39.0-1.0/10366.0*x^73.0+1.0/1576.6666666666667*x^45.0-1.0/18278.0*x^39.0+1.0/120.0*x^6.0+1.0/2.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/360.0/7.0*x^7.0+1.0/15990.0/42.0*x^42.0-1.0/39270.0/36.0*x^36.0-1.0/6.0/4.0*x^4.0+1.0/27417.0/40.0*x^40.0-1.0/10366.0/74.0*x^74.0+1.0/1576.6666666666667/46.0*x^46.0-1.0/18278.0/40.0*x^40.0+1.0/120.0/7.0*x^7.0+1.0/2.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/2520.0*x^7.0+1.0/671580.0*x^42.0-1.0/1413720.0*x^36.0-1.0/24.0*x^4.0+1.0/1096680.0*x^40.0-1.0/767084.0*x^74.0+1.0/72526.66666666667*x^46.0-1.0/731120.0*x^40.0+1.0/840.0*x^7.0+1.0/8.0*x^4.0";
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

public static void TestCaseDiff121146() {
 UsageCalculus.TestCase = 121146;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*x0^2*-1*x0^3*2*x01*xy^3*2*xy/3*xy^2*--1*xy^32*xy3*x0^2*--1*x0^3-1*xy^3*2*xy/3*xy^22*xy/3*xy^2*-1*xy^3*-3*xy3*x0^21*xy^3*-3*xy-3*xy/1*xy^2*-2*xy^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xy^33*xy/-1*xy^2-1*x0^2*-2*x0^3*3*x02*xy^3*3*xy/1*xy^2*--3*xy^33*xy1*x0^2*--3*x0^3-3*xy^3*1*xy/2*xy^21*xy/2*xy^2*-3*xy*-1*xy^2-3*x0^2*-1*x0^31*xy^3*2*xy";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=145 EqnNumber=48 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[57, 48, 18, 19, 2, 3, 1, 4, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 1, 2, 3, 7, 3, 1, 2, 3, 7, 3, 4, 5, 2, 23, 8, 25, 2]"+
"// DOEMatrixRow=[89, 50, 20, 3, 2, 3, 1, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 50, 9, 2, 3, 4, 3, 1, 5, 4, 2, 3, 2, 3, 2, 11, 8]"+
//Tail EqnIndex=145 EqnNumber=48 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[57, 48, 18, 19, 2, 3, 1, 4, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 1, 2, 3, 7, 3, 1, 2, 3, 7, 3, 4, 5, 2, 23, 8, 25, 2]"+
"// DOEMatrixRow=[89, 50, 20, 3, 2, 3, 1, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 50, 9, 2, 3, 4, 3, 1, 5, 4, 2, 3, 2, 3, 2, 11, 8]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0*4.0*xy^38.0-x0^2.0*xy^32.0-x0^3.0+x0^21.0*2.0*xy^36.0-x0^2.0*x0*36.0*xy^70.0+x0^2.0*162.0*xy^39.0-x0^2.0*9.0*xy^33.0-x0^3.0*3.0-2.25*xy^31.0+x0^2.0*6.0*xy^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0*4.0*38.0*xy^37.0-x0^2.0*32.0*xy^31.0-x0^3.0*0.0+x0^21.0*2.0*36.0*xy^35.0-x0^2.0*x0*36.0*70.0*xy^69.0+x0^2.0*162.0*39.0*xy^38.0-x0^2.0*9.0*33.0*xy^32.0-x0^3.0*3.0*0.0-2.25*31.0*xy^30.0+x0^2.0*6.0*4.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*152.0*xy^37.0-x0^2.0*32.0*xy^31.0-x0^3.0*0.0+x0^21.0*72.0*xy^35.0-x0^2.0*x0*2520.0*xy^69.0+x0^2.0*6318.0*xy^38.0-x0^2.0*297.0*xy^32.0-x0^3.0*0.0-69.75*xy^30.0+x0^2.0*24.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0*4.0*xy^38.0-x0^2.0*xy^32.0-x0^3.0+x0^21.0*2.0*xy^36.0-x0^2.0*x0*36.0*xy^70.0+x0^2.0*162.0*xy^39.0-x0^2.0*9.0*xy^33.0-x0^3.0*3.0-2.25*xy^31.0+x0^2.0*6.0*xy^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0*4.0/39.0*xy^39.0-x0^2.0/33.0*xy^33.0-x0^3.0*xy+x0^21.0*2.0/37.0*xy^37.0-x0^2.0*x0*36.0/71.0*xy^71.0+x0^2.0*162.0/40.0*xy^40.0-x0^2.0*9.0/34.0*xy^34.0-x0^3.0*xy-2.25/32.0*xy^32.0+x0^2.0*6.0/5.0*xy^5.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0*0.10256410256410256*xy^39.0-x0^2.0/33.0*xy^33.0-x0^3.0*xy+x0^21.0*0.05405405405405406*xy^37.0-x0^2.0*x0*0.5070422535211268*xy^71.0+x0^2.0*4.05*xy^40.0-x0^2.0*0.2647058823529412*xy^34.0-x0^3.0*xy-0.0703125*xy^32.0+x0^2.0*1.2*xy^5.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*152.0*xy^37.0-x0^2.0*32.0*xy^31.0-x0^3.0*0.0+x0^21.0*72.0*xy^35.0-x0^2.0*x0*2520.0*xy^69.0+x0^2.0*6318.0*xy^38.0-x0^2.0*297.0*xy^32.0-x0^3.0*0.0-69.75*xy^30.0+x0^2.0*24.0*xy^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*152.0*37.0*xy^36.0-x0^2.0*32.0*31.0*xy^30.0-x0^3.0*0.0*0.0+x0^21.0*72.0*35.0*xy^34.0-x0^2.0*x0*2520.0*69.0*xy^68.0+x0^2.0*6318.0*38.0*xy^37.0-x0^2.0*297.0*32.0*xy^31.0-x0^3.0*0.0*0.0-69.75*30.0*xy^29.0+x0^2.0*24.0*3.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*5624.0*xy^36.0-x0^2.0*992.0*xy^30.0-x0^3.0*0.0+x0^21.0*2520.0*xy^34.0-x0^2.0*x0*173880.0*xy^68.0+x0^2.0*240084.0*xy^37.0-x0^2.0*9504.0*xy^31.0-x0^3.0*0.0-2092.5*xy^29.0+x0^2.0*72.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0*0.10256410256410256*xy^39.0-x0^2.0/33.0*xy^33.0-x0^3.0*xy+x0^21.0*0.05405405405405406*xy^37.0-x0^2.0*x0*0.5070422535211268*xy^71.0+x0^2.0*4.05*xy^40.0-x0^2.0*0.2647058823529412*xy^34.0-x0^3.0*xy-0.0703125*xy^32.0+x0^2.0*1.2*xy^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0*0.10256410256410256/40.0*xy^40.0-x0^2.0/33.0/34.0*xy^34.0-x0^3.0/2.0*xy^2.0+x0^21.0*0.05405405405405406/38.0*xy^38.0-x0^2.0*x0*0.5070422535211268/72.0*xy^72.0+x0^2.0*4.05/41.0*xy^41.0-x0^2.0*0.2647058823529412/35.0*xy^35.0-x0^3.0/2.0*xy^2.0-0.0703125/33.0*xy^33.0+x0^2.0*1.2/6.0*xy^6.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0*0.002564102564102564*xy^40.0-x0^2.0*8.9126559714795E-4*xy^34.0-x0^3.0/2.0*xy^2.0+x0^21.0*0.001422475106685633*xy^38.0-x0^2.0*x0*0.007042253521126761*xy^72.0+x0^2.0*0.09878048780487804*xy^41.0-x0^2.0*0.007563025210084034*xy^35.0-x0^3.0/2.0*xy^2.0-0.002130681818181818*xy^33.0+x0^2.0/5.0*xy^6.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*5624.0*xy^36.0-x0^2.0*992.0*xy^30.0-x0^3.0*0.0+x0^21.0*2520.0*xy^34.0-x0^2.0*x0*173880.0*xy^68.0+x0^2.0*240084.0*xy^37.0-x0^2.0*9504.0*xy^31.0-x0^3.0*0.0-2092.5*xy^29.0+x0^2.0*72.0*xy^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*5624.0*36.0*xy^35.0-x0^2.0*992.0*30.0*xy^29.0-x0^3.0*0.0*0.0+x0^21.0*2520.0*34.0*xy^33.0-x0^2.0*x0*173880.0*68.0*xy^67.0+x0^2.0*240084.0*37.0*xy^36.0-x0^2.0*9504.0*31.0*xy^30.0-x0^3.0*0.0*0.0-2092.5*29.0*xy^28.0+x0^2.0*72.0*2.0*xy^1.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*202464.0*xy^35.0-x0^2.0*29760.0*xy^29.0-x0^3.0*0.0+x0^21.0*85680.0*xy^33.0-x0^2.0*x0*1.182384E7*xy^67.0+x0^2.0*8883108.0*xy^36.0-x0^2.0*294624.0*xy^30.0-x0^3.0*0.0-60682.5*xy^28.0+x0^2.0*144.0*xy";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0*0.002564102564102564*xy^40.0-x0^2.0*8.9126559714795E-4*xy^34.0-4.0*xy^34.0-x0^3.0/2.0*xy^2.0+x0^21.0*0.001422475106685633*xy^38.0-x0^2.0*x0*0.007042253521126761*xy^72.0+x0^2.0*0.09878048780487804*xy^41.0-x0^2.0*0.007563025210084034*xy^35.0-x0^3.0/2.0*xy^2.0-0.002130681818181818*xy^33.0+x0^2.0/5.0*xy^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0*0.002564102564102564/41.0*xy^41.0-x0^2.0*8.9126559714795E-4/35.0*xy^35.0-4.0/35.0*xy^35.0-x0^3.0/2.0/3.0*xy^3.0+x0^21.0*0.001422475106685633/39.0*xy^39.0-x0^2.0*x0*0.007042253521126761/73.0*xy^73.0+x0^2.0*0.09878048780487804/42.0*xy^42.0-x0^2.0*0.007563025210084034/36.0*xy^36.0-x0^3.0/2.0/3.0*xy^3.0-0.002130681818181818/34.0*xy^34.0+x0^2.0*5.0/7.0*xy^7.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0*6.253908692933083E-5*xy^41.0-x0^2.0/39270.0*xy^35.0-1.0/8.75*xy^35.0-0.11428571428571428*xy^35.0-x0^3.0*0.16666666666666666*xy^3.0+x0^21.0*3.6473720684247E-5*xy^39.0-x0^2.0*x0*9.646922631680494E-5*xy^73.0+x0^2.0*0.00235191637630662*xy^42.0-x0^2.0*2.100840336134454E-4*xy^36.0-x0^3.0/6.0*xy^3.0-6.266711229946523E-5*xy^34.0+x0^2.0/1.4*xy^7.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*202464.0*xy^35.0-x0^2.0*29760.0*xy^29.0-x0^3.0*0.0+x0^21.0*85680.0*xy^33.0-x0^2.0*x0*1.182384E7*xy^67.0+x0^2.0*8883108.0*xy^36.0-x0^2.0*294624.0*xy^30.0-x0^3.0*0.0-60682.5*xy^28.0+x0^2.0*144.0*xy";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*202464.0*35.0*xy^34.0-x0^2.0*29760.0*29.0*xy^28.0-x0^3.0*0.0*0.0+x0^21.0*85680.0*33.0*xy^32.0-x0^2.0*x0*1.182384E7*67.0*xy^66.0+x0^2.0*8883108.0*36.0*xy^35.0-x0^2.0*294624.0*30.0*xy^29.0-x0^3.0*0.0*0.0-60682.5*28.0*xy^27.0+x0^2.0*144.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*7086240.0*xy^34.0-x0^2.0*863040.0*xy^28.0-x0^3.0*0.0+x0^21.0*2827440.0*xy^32.0-x0^2.0*x0*7.9219728E8*xy^66.0+x0^2.0*3.19791888E8*xy^35.0-x0^2.0*8838720.0*xy^29.0-x0^3.0*0.0-1699110.0*xy^27.0+x0^2.0*144.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0*6.253908692933083E-5*xy^41.0-5.0*xy^41.0-x0^2.0/39270.0*xy^35.0-1.0/8.75*xy^35.0-0.11428571428571428*xy^35.0-x0^3.0*0.16666666666666666*xy^3.0+x0^21.0*3.6473720684247E-5*xy^39.0-5.0*xy^39.0-x0^2.0*x0*9.646922631680494E-5*xy^73.0-5.0*xy^73.0+x0^2.0*0.00235191637630662*xy^42.0-x0^2.0*2.100840336134454E-4*xy^36.0-4.0*xy^36.0-x0^3.0/6.0*xy^3.0-6.266711229946523E-5*xy^34.0-5.0*xy^34.0+x0^2.0/1.4*xy^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0*6.253908692933083E-5/42.0*xy^42.0-5.0/42.0*xy^42.0-x0^2.0/39270.0/36.0*xy^36.0-1.0/8.75/36.0*xy^36.0-0.11428571428571428/36.0*xy^36.0-x0^3.0*0.16666666666666666/4.0*xy^4.0+x0^21.0*3.6473720684247E-5/40.0*xy^40.0-5.0/40.0*xy^40.0-x0^2.0*x0*9.646922631680494E-5/74.0*xy^74.0-5.0/74.0*xy^74.0+x0^2.0*0.00235191637630662/43.0*xy^43.0-x0^2.0*2.100840336134454E-4/37.0*xy^37.0-4.0/37.0*xy^37.0-x0^3.0/6.0/4.0*xy^4.0-6.266711229946523E-5/35.0*xy^35.0-5.0/35.0*xy^35.0+x0^2.0*1.4/8.0*xy^8.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0/671580.0*xy^42.0-1.0/8.4*xy^42.0-0.11904761904761904*xy^42.0-x0^2.0/1413720.0*xy^36.0-1.0/315.0*xy^36.0-0.0031746031746031746*xy^36.0-x0^3.0*0.041666666666666664*xy^4.0+x0^21.0/1096680.0*xy^40.0-1.0/8.0*xy^40.0-0.125*xy^40.0-x0^2.0*x0/767084.0*xy^74.0-1.0/14.8*xy^74.0-0.06756756756756757*xy^74.0+x0^2.0*5.46957296815493E-5*xy^43.0-x0^2.0/176120.0*xy^37.0-1.0/9.25*xy^37.0-0.10810810810810811*xy^37.0-x0^3.0/24.0*xy^4.0-1.0/558506.6666666667*xy^35.0-1.0/7.0*xy^35.0-0.14285714285714285*xy^35.0+x0^2.0/5.714285714285714*xy^8.0";
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

public static void TestCaseDiff121147() {
 UsageCalculus.TestCase = 121147;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xyz^3*2*xyz/3*xyz^2*--1*xyz^32*xyz3*x0^2*--1*x0^3-1*xyz^3*2*xyz/3*xyz^22*xyz/3*xyz^2*-1*xyz^3*-3*xyz3*x0^21*xyz^3*-3*xyz-3*xyz/1*xyz^2*-2*xyz^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyz^33*xyz/-1*xyz^2-1*x0^2*-2*x0^3*3*x02*xyz^3*3*xyz/1*xyz^2*--3*xyz^33*xyz1*x0^2*--3*x0^3-3*xyz^3*1*xyz/2*xyz^21*xyz/2*xyz^2*-3*xyz*-1*xyz^22*x0^23*xyz*-1*xyz^21*xyz^3*2*xyz2*xyz/3*xyz^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=146 EqnNumber=49 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[23, 49, 19, 20, 3, 1, 2, 5, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 2, 3, 4, 8, 1, 2, 3, 4, 8, 1, 1, 6, 3, 24, 9, 26, 3]"+
"// DOEMatrixRow=[53, 51, 1, 4, 3, 1, 2, 3, 1, 1, 2, 1, 2, 3, 4, 2, 3, 1, 10, 3, 1, 5, 1, 2, 6, 1, 3, 1, 3, 4, 1, 12, 9]"+
//Tail EqnIndex=146 EqnNumber=49 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[23, 49, 19, 20, 3, 1, 2, 5, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 2, 3, 4, 8, 1, 2, 3, 4, 8, 1, 1, 6, 3, 24, 9, 26, 3]"+
"// DOEMatrixRow=[53, 51, 1, 4, 3, 1, 2, 3, 1, 1, 2, 1, 2, 3, 4, 2, 3, 1, 10, 3, 1, 5, 1, 2, 6, 1, 3, 1, 3, 4, 1, 12, 9]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0/1.5*xyz^38.0-x0^2.0*xyz^32.0-x0^3.0+x0^21.0*2.0*xyz^36.0-x0^2.0*x0*36.0*xyz^70.0+x0^2.0*162.0*xyz^39.0-x0^2.0*9.0*xyz^33.0-x0^3.0*3.0+1.5*xyz^79.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0/1.5*38.0*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0+x0^21.0*2.0*36.0*xyz^35.0-x0^2.0*x0*36.0*70.0*xyz^69.0+x0^2.0*162.0*39.0*xyz^38.0-x0^2.0*9.0*33.0*xyz^32.0-x0^3.0*3.0*0.0+1.5*79.0*xyz^78.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*25.333333333333332*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0+x0^21.0*72.0*xyz^35.0-x0^2.0*x0*2520.0*xyz^69.0+x0^2.0*6318.0*xyz^38.0-x0^2.0*297.0*xyz^32.0-x0^3.0*0.0+118.5*xyz^78.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0/1.5*xyz^38.0-x0^2.0*xyz^32.0-x0^3.0+x0^21.0*2.0*xyz^36.0-x0^2.0*x0*36.0*xyz^70.0+x0^2.0*162.0*xyz^39.0-x0^2.0*9.0*xyz^33.0-x0^3.0*3.0+1.5*xyz^79.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0/1.5/39.0*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz+x0^21.0*2.0/37.0*xyz^37.0-x0^2.0*x0*36.0/71.0*xyz^71.0+x0^2.0*162.0/40.0*xyz^40.0-x0^2.0*9.0/34.0*xyz^34.0-x0^3.0*xyz+1.5/80.0*xyz^80.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0*0.017094017094017096*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz+x0^21.0*0.05405405405405406*xyz^37.0-x0^2.0*x0*0.5070422535211268*xyz^71.0+x0^2.0*4.05*xyz^40.0-x0^2.0*0.2647058823529412*xyz^34.0-x0^3.0*xyz+1.0/53.333333333333336*xyz^80.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*25.333333333333332*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0+x0^21.0*72.0*xyz^35.0-x0^2.0*x0*2520.0*xyz^69.0+x0^2.0*6318.0*xyz^38.0-x0^2.0*297.0*xyz^32.0-x0^3.0*0.0+118.5*xyz^78.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*25.333333333333332*37.0*xyz^36.0-x0^2.0*32.0*31.0*xyz^30.0-x0^3.0*0.0*0.0+x0^21.0*72.0*35.0*xyz^34.0-x0^2.0*x0*2520.0*69.0*xyz^68.0+x0^2.0*6318.0*38.0*xyz^37.0-x0^2.0*297.0*32.0*xyz^31.0-x0^3.0*0.0*0.0+118.5*78.0*xyz^77.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*937.3333333333333*xyz^36.0-x0^2.0*992.0*xyz^30.0-x0^3.0*0.0+x0^21.0*2520.0*xyz^34.0-x0^2.0*x0*173880.0*xyz^68.0+x0^2.0*240084.0*xyz^37.0-x0^2.0*9504.0*xyz^31.0-x0^3.0*0.0+9243.0*xyz^77.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0*0.017094017094017096*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz+x0^21.0*0.05405405405405406*xyz^37.0-x0^2.0*x0*0.5070422535211268*xyz^71.0+x0^2.0*4.05*xyz^40.0-x0^2.0*0.2647058823529412*xyz^34.0-x0^3.0*xyz+1.0/53.333333333333336*xyz^80.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0*0.017094017094017096/40.0*xyz^40.0-x0^2.0/33.0/34.0*xyz^34.0-x0^3.0/2.0*xyz^2.0+x0^21.0*0.05405405405405406/38.0*xyz^38.0-x0^2.0*x0*0.5070422535211268/72.0*xyz^72.0+x0^2.0*4.05/41.0*xyz^41.0-x0^2.0*0.2647058823529412/35.0*xyz^35.0-x0^3.0/2.0*xyz^2.0+1.0/53.333333333333336/81.0*xyz^81.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0*4.273504273504274E-4*xyz^40.0-x0^2.0*8.9126559714795E-4*xyz^34.0-x0^3.0/2.0*xyz^2.0+x0^21.0*0.001422475106685633*xyz^38.0-x0^2.0*x0*0.007042253521126761*xyz^72.0+x0^2.0*0.09878048780487804*xyz^41.0-x0^2.0*0.007563025210084034*xyz^35.0-x0^3.0/2.0*xyz^2.0+1.0/4320.0*xyz^81.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*937.3333333333333*xyz^36.0-x0^2.0*992.0*xyz^30.0-x0^3.0*0.0+x0^21.0*2520.0*xyz^34.0-x0^2.0*x0*173880.0*xyz^68.0+x0^2.0*240084.0*xyz^37.0-x0^2.0*9504.0*xyz^31.0-x0^3.0*0.0+9243.0*xyz^77.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*937.3333333333333*36.0*xyz^35.0-x0^2.0*992.0*30.0*xyz^29.0-x0^3.0*0.0*0.0+x0^21.0*2520.0*34.0*xyz^33.0-x0^2.0*x0*173880.0*68.0*xyz^67.0+x0^2.0*240084.0*37.0*xyz^36.0-x0^2.0*9504.0*31.0*xyz^30.0-x0^3.0*0.0*0.0+9243.0*77.0*xyz^76.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*33744.0*xyz^35.0-x0^2.0*29760.0*xyz^29.0-x0^3.0*0.0+x0^21.0*85680.0*xyz^33.0-x0^2.0*x0*1.182384E7*xyz^67.0+x0^2.0*8883108.0*xyz^36.0-x0^2.0*294624.0*xyz^30.0-x0^3.0*0.0+711711.0*xyz^76.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0*4.273504273504274E-4*xyz^40.0-4.0*xyz^40.0-x0^2.0*8.9126559714795E-4*xyz^34.0-4.0*xyz^34.0-x0^3.0/2.0*xyz^2.0+x0^21.0*0.001422475106685633*xyz^38.0-x0^2.0*x0*0.007042253521126761*xyz^72.0+x0^2.0*0.09878048780487804*xyz^41.0-x0^2.0*0.007563025210084034*xyz^35.0-x0^3.0/2.0*xyz^2.0+1.0/4320.0*xyz^81.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0*4.273504273504274E-4/41.0*xyz^41.0-4.0/41.0*xyz^41.0-x0^2.0*8.9126559714795E-4/35.0*xyz^35.0-4.0/35.0*xyz^35.0-x0^3.0/2.0/3.0*xyz^3.0+x0^21.0*0.001422475106685633/39.0*xyz^39.0-x0^2.0*x0*0.007042253521126761/73.0*xyz^73.0+x0^2.0*0.09878048780487804/42.0*xyz^42.0-x0^2.0*0.007563025210084034/36.0*xyz^36.0-x0^3.0/2.0/3.0*xyz^3.0+1.0/4320.0/82.0*xyz^82.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0/95939.99999999999*xyz^41.0-1.0/10.25*xyz^41.0-0.0975609756097561*xyz^41.0-x0^2.0/39270.0*xyz^35.0-1.0/8.75*xyz^35.0-0.11428571428571428*xyz^35.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^21.0*3.6473720684247E-5*xyz^39.0-x0^2.0*x0*9.646922631680494E-5*xyz^73.0+x0^2.0*0.00235191637630662*xyz^42.0-x0^2.0*2.100840336134454E-4*xyz^36.0-x0^3.0/6.0*xyz^3.0+1.0/354240.0*xyz^82.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*33744.0*xyz^35.0-x0^2.0*29760.0*xyz^29.0-x0^3.0*0.0+x0^21.0*85680.0*xyz^33.0-x0^2.0*x0*1.182384E7*xyz^67.0+x0^2.0*8883108.0*xyz^36.0-x0^2.0*294624.0*xyz^30.0-x0^3.0*0.0+711711.0*xyz^76.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*33744.0*35.0*xyz^34.0-x0^2.0*29760.0*29.0*xyz^28.0-x0^3.0*0.0*0.0+x0^21.0*85680.0*33.0*xyz^32.0-x0^2.0*x0*1.182384E7*67.0*xyz^66.0+x0^2.0*8883108.0*36.0*xyz^35.0-x0^2.0*294624.0*30.0*xyz^29.0-x0^3.0*0.0*0.0+711711.0*76.0*xyz^75.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*1181040.0*xyz^34.0-x0^2.0*863040.0*xyz^28.0-x0^3.0*0.0+x0^21.0*2827440.0*xyz^32.0-x0^2.0*x0*7.9219728E8*xyz^66.0+x0^2.0*3.19791888E8*xyz^35.0-x0^2.0*8838720.0*xyz^29.0-x0^3.0*0.0+5.4090036E7*xyz^75.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0/95939.99999999999*xyz^41.0-1.0/10.25*xyz^41.0-0.0975609756097561*xyz^41.0-x0^2.0/39270.0*xyz^35.0-1.0/8.75*xyz^35.0-0.11428571428571428*xyz^35.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^21.0*3.6473720684247E-5*xyz^39.0-5.0*xyz^39.0-x0^2.0*x0*9.646922631680494E-5*xyz^73.0-5.0*xyz^73.0+x0^2.0*0.00235191637630662*xyz^42.0-x0^2.0*2.100840336134454E-4*xyz^36.0-4.0*xyz^36.0-x0^3.0/6.0*xyz^3.0+1.0/354240.0*xyz^82.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0/95939.99999999999/42.0*xyz^42.0-1.0/10.25/42.0*xyz^42.0-0.0975609756097561/42.0*xyz^42.0-x0^2.0/39270.0/36.0*xyz^36.0-1.0/8.75/36.0*xyz^36.0-0.11428571428571428/36.0*xyz^36.0-x0^3.0*0.16666666666666666/4.0*xyz^4.0+x0^21.0*3.6473720684247E-5/40.0*xyz^40.0-5.0/40.0*xyz^40.0-x0^2.0*x0*9.646922631680494E-5/74.0*xyz^74.0-5.0/74.0*xyz^74.0+x0^2.0*0.00235191637630662/43.0*xyz^43.0-x0^2.0*2.100840336134454E-4/37.0*xyz^37.0-4.0/37.0*xyz^37.0-x0^3.0/6.0/4.0*xyz^4.0+1.0/354240.0/83.0*xyz^83.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0/4029479.9999999995*xyz^42.0-1.0/430.5*xyz^42.0-0.0023228803716608595*xyz^42.0-x0^2.0/1413720.0*xyz^36.0-1.0/315.0*xyz^36.0-0.0031746031746031746*xyz^36.0-x0^3.0*0.041666666666666664*xyz^4.0+x0^21.0/1096680.0*xyz^40.0-1.0/8.0*xyz^40.0-0.125*xyz^40.0-x0^2.0*x0/767084.0*xyz^74.0-1.0/14.8*xyz^74.0-0.06756756756756757*xyz^74.0+x0^2.0*5.46957296815493E-5*xyz^43.0-x0^2.0/176120.0*xyz^37.0-1.0/9.25*xyz^37.0-0.10810810810810811*xyz^37.0-x0^3.0/24.0*xyz^4.0+1.0/2.940192E7*xyz^83.0";
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

public static void TestCaseDiff121148() {
 UsageCalculus.TestCase = 121148;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xyza3*x0^2*--1*x0^3-1*xyza^3*2*xyza/3*xyza^22*xyza/3*xyza^2*-1*xyza^3*-3*xyza3*x0^21*xyza^3*-3*xyza-3*xyza/1*xyza^2*-2*xyza^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyza^33*xyza/-1*xyza^2-1*x0^2*-2*x0^3*3*x02*xyza^3*3*xyza/1*xyza^2*--3*xyza^33*xyza1*x0^2*--3*x0^3-3*xyza^3*1*xyza/2*xyza^21*xyza/2*xyza^2*-3*xyza*-1*xyza^22*x0^23*xyza*-1*xyza^2-1*xyza^2/2*xyza*-3*xyza^22*xyza*-3*xyza^2*1*xyza/-3*xyza^22*xyza/3*xyza^23*x0^2*--1*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=147 EqnNumber=50 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[88, 50, 20, 1, 4, 2, 3, 6, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 1, 1, 9, 2, 3, 1, 1, 9, 2, 3, 7, 4, 25, 10, 27, 4]"+
"// DOEMatrixRow=[18, 52, 2, 1, 1, 2, 3, 4, 2, 3, 4, 2, 3, 1, 1, 3, 1, 2, 1, 1, 2, 1, 2, 3, 1, 2, 1, 2, 4, 5, 2, 13, 10]"+
//Tail EqnIndex=147 EqnNumber=50 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[88, 50, 20, 1, 4, 2, 3, 6, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 1, 1, 9, 2, 3, 1, 1, 9, 2, 3, 7, 4, 25, 10, 27, 4]"+
"// DOEMatrixRow=[18, 52, 2, 1, 1, 2, 3, 4, 2, 3, 4, 2, 3, 1, 1, 3, 1, 2, 1, 1, 2, 1, 2, 3, 1, 2, 1, 2, 4, 5, 2, 13, 10]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0*2.0-x0^3.0+x0^21.0*2.0*xyza^36.0-x0^2.0*x0*36.0*xyza^70.0+x0^2.0*162.0*xyza^39.0-x0^2.0*9.0*xyza^33.0-x0^3.0*3.0+x0^23.0*2.25*xyza^54.0+x0^2.0/2.0*xyza^75.0-x0^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0*2.0*0.0-x0^3.0*0.0+x0^21.0*2.0*36.0*xyza^35.0-x0^2.0*x0*36.0*70.0*xyza^69.0+x0^2.0*162.0*39.0*xyza^38.0-x0^2.0*9.0*33.0*xyza^32.0-x0^3.0*3.0*0.0+x0^23.0*2.25*54.0*xyza^53.0+x0^2.0/2.0*75.0*xyza^74.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*72.0*xyza^35.0-x0^2.0*x0*2520.0*xyza^69.0+x0^2.0*6318.0*xyza^38.0-x0^2.0*297.0*xyza^32.0-x0^3.0*0.0+x0^23.0*121.5*xyza^53.0+x0^2.0*37.5*xyza^74.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0*2.0-x0^3.0+x0^21.0*2.0*xyza^36.0-x0^2.0*x0*36.0*xyza^70.0+x0^2.0*162.0*xyza^39.0-x0^2.0*9.0*xyza^33.0-x0^3.0*3.0+x0^23.0*2.25*xyza^54.0+x0^2.0/2.0*xyza^75.0-x0^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0*xyza-x0^3.0*xyza+x0^21.0*2.0/37.0*xyza^37.0-x0^2.0*x0*36.0/71.0*xyza^71.0+x0^2.0*162.0/40.0*xyza^40.0-x0^2.0*9.0/34.0*xyza^34.0-x0^3.0*xyza+x0^23.0*2.25/55.0*xyza^55.0+x0^2.0/2.0/76.0*xyza^76.0-x0^3.0*xyza";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0*xyza-x0^3.0*xyza+x0^21.0*0.05405405405405406*xyza^37.0-x0^2.0*x0*0.5070422535211268*xyza^71.0+x0^2.0*4.05*xyza^40.0-x0^2.0*0.2647058823529412*xyza^34.0-x0^3.0*xyza+x0^23.0*0.04090909090909091*xyza^55.0+x0^2.0*0.006578947368421052*xyza^76.0-x0^3.0*xyza";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*72.0*xyza^35.0-x0^2.0*x0*2520.0*xyza^69.0+x0^2.0*6318.0*xyza^38.0-x0^2.0*297.0*xyza^32.0-x0^3.0*0.0+x0^23.0*121.5*xyza^53.0+x0^2.0*37.5*xyza^74.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^21.0*72.0*35.0*xyza^34.0-x0^2.0*x0*2520.0*69.0*xyza^68.0+x0^2.0*6318.0*38.0*xyza^37.0-x0^2.0*297.0*32.0*xyza^31.0-x0^3.0*0.0*0.0+x0^23.0*121.5*53.0*xyza^52.0+x0^2.0*37.5*74.0*xyza^73.0-x0^3.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*2520.0*xyza^34.0-x0^2.0*x0*173880.0*xyza^68.0+x0^2.0*240084.0*xyza^37.0-x0^2.0*9504.0*xyza^31.0-x0^3.0*0.0+x0^23.0*6439.5*xyza^52.0+x0^2.0*2775.0*xyza^73.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0*xyza-x0^3.0*xyza+x0^21.0*0.05405405405405406*xyza^37.0-x0^2.0*x0*0.5070422535211268*xyza^71.0+x0^2.0*4.05*xyza^40.0-x0^2.0*0.2647058823529412*xyza^34.0-x0^3.0*xyza+x0^23.0*0.04090909090909091*xyza^55.0+x0^2.0*0.006578947368421052*xyza^76.0-x0^3.0*xyza";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0/2.0*xyza^2.0-x0^3.0/2.0*xyza^2.0+x0^21.0*0.05405405405405406/38.0*xyza^38.0-x0^2.0*x0*0.5070422535211268/72.0*xyza^72.0+x0^2.0*4.05/41.0*xyza^41.0-x0^2.0*0.2647058823529412/35.0*xyza^35.0-x0^3.0/2.0*xyza^2.0+x0^23.0*0.04090909090909091/56.0*xyza^56.0+x0^2.0*0.006578947368421052/77.0*xyza^77.0-x0^3.0/2.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0/2.0*xyza^2.0-x0^3.0/2.0*xyza^2.0+x0^21.0*0.001422475106685633*xyza^38.0-x0^2.0*x0*0.007042253521126761*xyza^72.0+x0^2.0*0.09878048780487804*xyza^41.0-x0^2.0*0.007563025210084034*xyza^35.0-x0^3.0/2.0*xyza^2.0+x0^23.0*7.305194805194805E-4*xyza^56.0+x0^2.0*8.544087491455912E-5*xyza^77.0-x0^3.0/2.0*xyza^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*2520.0*xyza^34.0-x0^2.0*x0*173880.0*xyza^68.0+x0^2.0*240084.0*xyza^37.0-x0^2.0*9504.0*xyza^31.0-x0^3.0*0.0+x0^23.0*6439.5*xyza^52.0+x0^2.0*2775.0*xyza^73.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^21.0*2520.0*34.0*xyza^33.0-x0^2.0*x0*173880.0*68.0*xyza^67.0+x0^2.0*240084.0*37.0*xyza^36.0-x0^2.0*9504.0*31.0*xyza^30.0-x0^3.0*0.0*0.0+x0^23.0*6439.5*52.0*xyza^51.0+x0^2.0*2775.0*73.0*xyza^72.0-x0^3.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*85680.0*xyza^33.0-x0^2.0*x0*1.182384E7*xyza^67.0+x0^2.0*8883108.0*xyza^36.0-x0^2.0*294624.0*xyza^30.0-x0^3.0*0.0+x0^23.0*334854.0*xyza^51.0+x0^2.0*202575.0*xyza^72.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0/2.0*xyza^2.0-x0^3.0/2.0*xyza^2.0+x0^21.0*0.001422475106685633*xyza^38.0-x0^2.0*x0*0.007042253521126761*xyza^72.0+x0^2.0*0.09878048780487804*xyza^41.0-x0^2.0*0.007563025210084034*xyza^35.0-x0^3.0/2.0*xyza^2.0+x0^23.0*7.305194805194805E-4*xyza^56.0-4.0*xyza^56.0+x0^2.0*8.544087491455912E-5*xyza^77.0-5.0*xyza^77.0-x0^3.0/2.0*xyza^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0/2.0/3.0*xyza^3.0-x0^3.0/2.0/3.0*xyza^3.0+x0^21.0*0.001422475106685633/39.0*xyza^39.0-x0^2.0*x0*0.007042253521126761/73.0*xyza^73.0+x0^2.0*0.09878048780487804/42.0*xyza^42.0-x0^2.0*0.007563025210084034/36.0*xyza^36.0-x0^3.0/2.0/3.0*xyza^3.0+x0^23.0*7.305194805194805E-4/57.0*xyza^57.0-4.0/57.0*xyza^57.0+x0^2.0*8.544087491455912E-5/78.0*xyza^78.0-5.0/78.0*xyza^78.0-x0^3.0*2.0/3.0*xyza^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0*0.16666666666666666*xyza^3.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^21.0*3.6473720684247E-5*xyza^39.0-x0^2.0*x0*9.646922631680494E-5*xyza^73.0+x0^2.0*0.00235191637630662*xyza^42.0-x0^2.0*2.100840336134454E-4*xyza^36.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^23.0/78026.66666666666*xyza^57.0-1.0/14.25*xyza^57.0-0.07017543859649122*xyza^57.0+x0^2.0/912912.0000000001*xyza^78.0-1.0/15.6*xyza^78.0-0.0641025641025641*xyza^78.0-x0^3.0/1.5*xyza^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*85680.0*xyza^33.0-x0^2.0*x0*1.182384E7*xyza^67.0+x0^2.0*8883108.0*xyza^36.0-x0^2.0*294624.0*xyza^30.0-x0^3.0*0.0+x0^23.0*334854.0*xyza^51.0+x0^2.0*202575.0*xyza^72.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^21.0*85680.0*33.0*xyza^32.0-x0^2.0*x0*1.182384E7*67.0*xyza^66.0+x0^2.0*8883108.0*36.0*xyza^35.0-x0^2.0*294624.0*30.0*xyza^29.0-x0^3.0*0.0*0.0+x0^23.0*334854.0*51.0*xyza^50.0+x0^2.0*202575.0*72.0*xyza^71.0-x0^3.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*2827440.0*xyza^32.0-x0^2.0*x0*7.9219728E8*xyza^66.0+x0^2.0*3.19791888E8*xyza^35.0-x0^2.0*8838720.0*xyza^29.0-x0^3.0*0.0+x0^23.0*1.7077554E7*xyza^50.0+x0^2.0*1.45854E7*xyza^71.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0*0.16666666666666666*xyza^3.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^21.0*3.6473720684247E-5*xyza^39.0-5.0*xyza^39.0-x0^2.0*x0*9.646922631680494E-5*xyza^73.0-5.0*xyza^73.0+x0^2.0*0.00235191637630662*xyza^42.0-x0^2.0*2.100840336134454E-4*xyza^36.0-4.0*xyza^36.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^23.0/78026.66666666666*xyza^57.0-1.0/14.25*xyza^57.0-0.07017543859649122*xyza^57.0+x0^2.0/912912.0000000001*xyza^78.0-1.0/15.6*xyza^78.0-0.0641025641025641*xyza^78.0-x0^3.0/1.5*xyza^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0*0.16666666666666666/4.0*xyza^4.0-x0^3.0*0.16666666666666666/4.0*xyza^4.0+x0^21.0*3.6473720684247E-5/40.0*xyza^40.0-5.0/40.0*xyza^40.0-x0^2.0*x0*9.646922631680494E-5/74.0*xyza^74.0-5.0/74.0*xyza^74.0+x0^2.0*0.00235191637630662/43.0*xyza^43.0-x0^2.0*2.100840336134454E-4/37.0*xyza^37.0-4.0/37.0*xyza^37.0-x0^3.0*0.16666666666666666/4.0*xyza^4.0+x0^23.0/78026.66666666666/58.0*xyza^58.0-1.0/14.25/58.0*xyza^58.0-0.07017543859649122/58.0*xyza^58.0+x0^2.0/912912.0000000001/79.0*xyza^79.0-1.0/15.6/79.0*xyza^79.0-0.0641025641025641/79.0*xyza^79.0-x0^3.0*1.5/4.0*xyza^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0*0.041666666666666664*xyza^4.0-x0^3.0*0.041666666666666664*xyza^4.0+x0^21.0/1096680.0*xyza^40.0-1.0/8.0*xyza^40.0-0.125*xyza^40.0-x0^2.0*x0/767084.0*xyza^74.0-1.0/14.8*xyza^74.0-0.06756756756756757*xyza^74.0+x0^2.0*5.46957296815493E-5*xyza^43.0-x0^2.0/176120.0*xyza^37.0-1.0/9.25*xyza^37.0-0.10810810810810811*xyza^37.0-x0^3.0*0.041666666666666664*xyza^4.0+x0^23.0/4525546.666666666*xyza^58.0-1.0/826.5*xyza^58.0-0.0012099213551119176*xyza^58.0+x0^2.0/7.212004800000001E7*xyza^79.0-1.0/1232.3999999999999*xyza^79.0-8.114248620577734E-4*xyza^79.0-x0^3.0/2.6666666666666665*xyza^4.0";
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

public static void TestCaseDiff121149() {
 UsageCalculus.TestCase = 121149;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*x0^2*--1*x0^33*x0^2*--1*x0^3-1*x^3*2*x";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=148 EqnNumber=51 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[52, 51, 1, 2, 1, 3, 1, 7, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 2, 3, 10, 3, 1, 2, 3, 10, 3, 4, 8, 1, 26, 11, 28, 5]"+
"// DOEMatrixRow=[84, 53, 3, 2, 3, 1, 1, 5, 3, 4, 1, 1, 1, 2, 3, 1, 2, 3, 2, 3, 1, 2, 3, 1, 2, 3, 2, 3, 1, 6, 1, 14, 11]"+
//Tail EqnIndex=148 EqnNumber=51 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[52, 51, 1, 2, 1, 3, 1, 7, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 2, 3, 10, 3, 1, 2, 3, 10, 3, 4, 8, 1, 26, 11, 28, 5]"+
"// DOEMatrixRow=[84, 53, 3, 2, 3, 1, 1, 5, 3, 4, 1, 1, 1, 2, 3, 1, 2, 3, 2, 3, 1, 2, 3, 1, 2, 3, 2, 3, 1, 6, 1, 14, 11]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "3.0-1.0-1.0-2.0*x^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0-1.0*0.0-1.0*0.0-2.0*4.0*x^3.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-8.0*x^3.0";
 UsageCalculus.EqnSolArrayMap3[1] = "3.0-1.0-1.0-2.0*x^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "3.0*x-1.0*x-1.0*x-2.0/5.0*x^5.0";
 UsageCalculus.EqnSolArrayMap4[1] = "3.0*x-x-x-1.0/2.5*x^5.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-8.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-8.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-24.0*x^2.0";
 UsageCalculus.EqnSolArrayMap3[2] = "3.0*x-x-x-1.0/2.5*x^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "3.0/2.0*x^2.0-1.0/2.0*x^2.0-1.0/2.0*x^2.0-1.0/2.5/6.0*x^6.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.5*x^2.0-1.0/2.0*x^2.0-1.0/2.0*x^2.0-1.0/15.0*x^6.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-24.0*x^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-24.0*2.0*x^1.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-48.0*x";
 UsageCalculus.EqnSolArrayMap3[3] = "1.5*x^2.0-1.0/2.0*x^2.0-1.0/2.0*x^2.0-1.0/15.0*x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.5/3.0*x^3.0-1.0/2.0/3.0*x^3.0-1.0/2.0/3.0*x^3.0-1.0/15.0/7.0*x^7.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/2.0*x^3.0-1.0/6.0*x^3.0-1.0/6.0*x^3.0-1.0/105.0*x^7.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-48.0*x";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-48.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-48.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/2.0*x^3.0-1.0/6.0*x^3.0-1.0/6.0*x^3.0-1.0/105.0*x^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/2.0/4.0*x^4.0-1.0/6.0/4.0*x^4.0-1.0/6.0/4.0*x^4.0-1.0/105.0/8.0*x^8.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/8.0*x^4.0-1.0/24.0*x^4.0-1.0/24.0*x^4.0-1.0/840.0*x^8.0";
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

public static void TestCaseDiff121150() {
 UsageCalculus.TestCase = 121150;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-1*xy^3*2*xy/3*xy^22*xy/3*xy^2*-1*xy^3*-3*xy-1*xy^3*2*xy2*xy/3*xy^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=149 EqnNumber=52 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[17, 52, 2, 3, 2, 1, 2, 8, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 3, 4, 11, 1, 2, 3, 4, 11, 1, 1, 9, 2, 27, 12, 29, 6]"+
"// DOEMatrixRow=[48, 54, 4, 3, 1, 2, 3, 6, 1, 1, 2, 1, 2, 3, 4, 2, 3, 4, 3, 1, 2, 3, 1, 2, 3, 4, 3, 1, 2, 7, 2, 15, 12]"+
//Tail EqnIndex=149 EqnNumber=52 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[17, 52, 2, 3, 2, 1, 2, 8, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 3, 4, 11, 1, 2, 3, 4, 11, 1, 1, 9, 2, 27, 12, 29, 6]"+
"// DOEMatrixRow=[48, 54, 4, 3, 1, 2, 3, 6, 1, 1, 2, 1, 2, 3, 4, 2, 3, 4, 3, 1, 2, 3, 1, 2, 3, 4, 3, 1, 2, 7, 2, 15, 12]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-1.0/1.5*xy^33.0-1.0/1.5*xy^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-1.0/1.5*33.0*xy^32.0-1.0/1.5*6.0*xy^5.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-22.0*xy^32.0-4.0*xy^5.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-1.0/1.5*xy^33.0-1.0/1.5*xy^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.0/1.5/34.0*xy^34.0-1.0/1.5/7.0*xy^7.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/51.0*xy^34.0-1.0/10.5*xy^7.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-22.0*xy^32.0-4.0*xy^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-22.0*32.0*xy^31.0-4.0*5.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-704.0*xy^31.0-20.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/51.0*xy^34.0-1.0/10.5*xy^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/51.0/35.0*xy^35.0-1.0/10.5/8.0*xy^8.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/1785.0*xy^35.0-1.0/84.0*xy^8.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-704.0*xy^31.0-20.0*xy^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-704.0*31.0*xy^30.0-20.0*4.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-21824.0*xy^30.0-80.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/1785.0*xy^35.0-1.0/84.0*xy^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/1785.0/36.0*xy^36.0-1.0/84.0/9.0*xy^9.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/64260.0*xy^36.0-1.0/756.0*xy^9.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-21824.0*xy^30.0-80.0*xy^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-21824.0*30.0*xy^29.0-80.0*3.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-654720.0*xy^29.0-240.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/64260.0*xy^36.0-1.0/756.0*xy^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/64260.0/37.0*xy^37.0-1.0/756.0/10.0*xy^10.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/2377620.0*xy^37.0-1.0/7560.0*xy^10.0";
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

public static void TestCaseDiff121151() {
 UsageCalculus.TestCase = 121151;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xyz/3*xyz^2*-1*xyz^3*-3*xyz3*x0^21*xyz^3*-3*xyz2*xyz/3*xyz^23*x0^2*-1*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=150 EqnNumber=53 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[83, 53, 3, 4, 3, 2, 3, 9, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 1, 1, 12, 2, 3, 1, 1, 12, 2, 3, 10, 3, 28, 13, 30, 7]"+
"// DOEMatrixRow=[13, 55, 5, 4, 2, 3, 1, 7, 2, 3, 4, 2, 3, 1, 1, 3, 1, 5, 4, 2, 3, 4, 2, 3, 4, 1, 1, 2, 3, 8, 1, 16, 13]"+
//Tail EqnIndex=150 EqnNumber=53 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[83, 53, 3, 4, 3, 2, 3, 9, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 1, 1, 12, 2, 3, 1, 1, 12, 2, 3, 10, 3, 28, 13, 30, 7]"+
"// DOEMatrixRow=[13, 55, 5, 4, 2, 3, 1, 7, 2, 3, 4, 2, 3, 1, 1, 3, 1, 5, 4, 2, 3, 4, 2, 3, 4, 1, 1, 2, 3, 8, 1, 16, 13]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0*2.0*xyz^33.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0*2.0*33.0*xyz^32.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*66.0*xyz^32.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0*2.0*xyz^33.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0*2.0/34.0*xyz^34.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0/17.0*xyz^34.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*66.0*xyz^32.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*66.0*32.0*xyz^31.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*2112.0*xyz^31.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0/17.0*xyz^34.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0*17.0/35.0*xyz^35.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0/2.0588235294117645*xyz^35.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*2112.0*xyz^31.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*2112.0*31.0*xyz^30.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*65472.0*xyz^30.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0/2.0588235294117645*xyz^35.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0*2.0588235294117645/36.0*xyz^36.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0/17.485714285714288*xyz^36.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*65472.0*xyz^30.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*65472.0*30.0*xyz^29.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*1964160.0*xyz^29.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0/17.485714285714288*xyz^36.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0*17.485714285714288/37.0*xyz^37.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0/2.1160130718954244*xyz^37.0";
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

public static void TestCaseDiff121152() {
 UsageCalculus.TestCase = 121152;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*x0^21*xyza^3*-3*xyza-3*xyza/1*xyza^2*-2*xyza^31*x0^2*-2*x0^3*3*x0/-1*x0^23*x0^2*-1*x0^31*xyza^3*-3*xyza";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=151 EqnNumber=54 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[47, 54, 4, 5, 4, 3, 1, 10, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 2, 13, 3, 1, 2, 3, 13, 3, 4, 11, 4, 29, 14, 31, 8]"+
"// DOEMatrixRow=[79, 56, 6, 1, 3, 1, 2, 8, 3, 4, 1, 1, 1, 2, 3, 1, 2, 6, 5, 3, 1, 5, 3, 1, 5, 2, 3, 1, 4, 9, 2, 17, 14]"+
//Tail EqnIndex=151 EqnNumber=54 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[47, 54, 4, 5, 4, 3, 1, 10, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 2, 13, 3, 1, 2, 3, 13, 3, 4, 11, 4, 29, 14, 31, 8]"+
"// DOEMatrixRow=[79, 56, 6, 1, 3, 1, 2, 8, 3, 4, 1, 1, 1, 2, 3, 1, 2, 6, 5, 3, 1, 5, 3, 1, 5, 2, 3, 1, 4, 9, 2, 17, 14]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^21.0*9.0*xyza^4.0+x0^2.0*x0*108.0*xyza^38.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^21.0*9.0*4.0*xyza^3.0+x0^2.0*x0*38.0*xyza^37.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^21.0*36.0*xyza^3.0+x0^2.0*x0*38.0*xyza^37.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^21.0*9.0*xyza^4.0+x0^2.0*x0*108.0*xyza^38.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^21.0*9.0/5.0*xyza^5.0+x0^2.0*x0*108.0/39.0*xyza^39.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^21.0*1.8*xyza^5.0+x0^2.0*x0*2.769230769230769*xyza^39.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^21.0*36.0*xyza^3.0+x0^2.0*x0*38.0*xyza^37.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^21.0*36.0*3.0*xyza^2.0+x0^2.0*x0*37.0*xyza^36.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^21.0*108.0*xyza^2.0+x0^2.0*x0*37.0*xyza^36.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^21.0*1.8*xyza^5.0+x0^2.0*x0*2.769230769230769*xyza^39.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^21.0*1.8/6.0*xyza^6.0+x0^2.0*x0*2.769230769230769/40.0*xyza^40.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^21.0*0.3*xyza^6.0+x0^2.0*x0/14.444444444444445*xyza^40.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^21.0*108.0*xyza^2.0+x0^2.0*x0*37.0*xyza^36.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^21.0*108.0*2.0*xyza^1.0+x0^2.0*x0*36.0*xyza^35.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^21.0*216.0*xyza+x0^2.0*x0*36.0*xyza^35.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^21.0*0.3*xyza^6.0+x0^2.0*x0/14.444444444444445*xyza^40.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^21.0*0.3/7.0*xyza^7.0+x0^2.0*x0/14.444444444444445/41.0*xyza^41.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^21.0*0.04285714285714286*xyza^7.0+x0^2.0*x0/592.2222222222223*xyza^41.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^21.0*216.0*xyza+x0^2.0*x0*36.0*xyza^35.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^21.0*216.0+x0^2.0*x0*35.0*xyza^34.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^21.0*216.0+x0^2.0*x0*35.0*xyza^34.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^21.0*0.04285714285714286*xyza^7.0+x0^2.0*x0/592.2222222222223*xyza^41.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^21.0*0.04285714285714286/8.0*xyza^8.0+x0^2.0*x0/592.2222222222223/42.0*xyza^42.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^21.0*0.005357142857142857*xyza^8.0+x0^2.0*x0/24873.333333333336*xyza^42.0";
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

public static void TestCaseDiff121153() {
 UsageCalculus.TestCase = 121153;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x^3*-3*x-3*x/1*x^2*-2*x^31*x0^2*-2*x0^3*3*x0/-1*x0^22*x^33*x/-1*x^21*x^3*-3*x-3*x/1*x^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=152 EqnNumber=55 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[12, 55, 5, 6, 1, 1, 2, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 3, 14, 1, 2, 3, 4, 14, 1, 1, 12, 1, 30, 15, 32, 9]"+
"// DOEMatrixRow=[43, 57, 7, 2, 1, 2, 3, 9, 1, 1, 2, 1, 2, 3, 4, 2, 3, 7, 6, 1, 2, 1, 1, 2, 6, 3, 1, 2, 1, 10, 1, 18, 15]"+
//Tail EqnIndex=152 EqnNumber=55 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[12, 55, 5, 6, 1, 1, 2, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 3, 14, 1, 2, 3, 4, 14, 1, 1, 12, 1, 30, 15, 32, 9]"+
"// DOEMatrixRow=[43, 57, 7, 2, 1, 2, 3, 9, 1, 1, 2, 1, 2, 3, 4, 2, 3, 7, 6, 1, 2, 1, 1, 2, 6, 3, 1, 2, 1, 10, 1, 18, 15]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-3.0*x^4.0+108.0*x^93.0-3.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-3.0*4.0*x^3.0+108.0*93.0*x^92.0-3.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-12.0*x^3.0+10044.0*x^92.0-9.0*x^2.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-3.0*x^4.0+108.0*x^93.0-3.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-3.0/5.0*x^5.0+108.0/94.0*x^94.0-3.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/1.6666666666666667*x^5.0+1.148936170212766*x^94.0-1.0/1.3333333333333333*x^4.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-12.0*x^3.0+10044.0*x^92.0-9.0*x^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-12.0*3.0*x^2.0+10044.0*92.0*x^91.0-9.0*2.0*x^1.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-36.0*x^2.0+924048.0*x^91.0-18.0*x";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/1.6666666666666667*x^5.0+1.148936170212766*x^94.0-1.0/1.3333333333333333*x^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/1.6666666666666667/6.0*x^6.0+1.148936170212766/95.0*x^95.0-1.0/1.3333333333333333/5.0*x^5.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/10.0*x^6.0+1.0/82.68518518518518*x^95.0-1.0/6.666666666666666*x^5.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-36.0*x^2.0+924048.0*x^91.0-18.0*x";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-36.0*2.0*x^1.0+924048.0*91.0*x^90.0-18.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-72.0*x+8.4088368E7*x^90.0-18.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/10.0*x^6.0+1.0/82.68518518518518*x^95.0-1.0/6.666666666666666*x^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/10.0/7.0*x^7.0+1.0/82.68518518518518/96.0*x^96.0-1.0/6.666666666666666/6.0*x^6.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/70.0*x^7.0+1.0/7937.777777777777*x^96.0-1.0/40.0*x^6.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-72.0*x+8.4088368E7*x^90.0-18.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-72.0+90.0*x^89.0-18.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-72.0+90.0*x^89.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/70.0*x^7.0+1.0/7937.777777777777*x^96.0-1.0/40.0*x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/70.0/8.0*x^8.0+1.0/7937.777777777777/97.0*x^97.0-1.0/40.0/7.0*x^7.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/560.0*x^8.0+1.0/769964.4444444444*x^97.0-1.0/280.0*x^7.0";
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

public static void TestCaseDiff121154() {
 UsageCalculus.TestCase = 121154;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xy/1*xy^2*-2*xy^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xy^33*xy/-1*xy^2-1*x0^2*-2*x0^3*3*x02*xy^3*3*xy/1*xy^2*--3*xy^3-3*xy/1*xy^21*x0^2*-2*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=153 EqnNumber=56 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[78, 56, 6, 7, 2, 3, 1, 2, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 4, 15, 2, 3, 1, 1, 15, 2, 3, 13, 2, 31, 16, 1, 10]"+
"// DOEMatrixRow=[8, 58, 8, 3, 2, 3, 1, 10, 2, 3, 4, 2, 3, 1, 1, 3, 1, 8, 7, 2, 3, 2, 3, 1, 1, 4, 2, 3, 2, 11, 2, 19, 16]"+
//Tail EqnIndex=153 EqnNumber=56 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[78, 56, 6, 7, 2, 3, 1, 2, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 4, 15, 2, 3, 1, 1, 15, 2, 3, 13, 2, 31, 16, 1, 10]"+
"// DOEMatrixRow=[8, 58, 8, 3, 2, 3, 1, 10, 2, 3, 4, 2, 3, 1, 1, 3, 1, 8, 7, 2, 3, 2, 3, 1, 1, 4, 2, 3, 2, 11, 2, 19, 16]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^2.0*x0*36.0*xy^70.0+x0^2.0*x02*54.0*xy^9.0-3.0*xy^3.0+x0^2.0*6.0*xy^22.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^2.0*x0*36.0*70.0*xy^69.0+x0^2.0*x02*54.0*9.0*xy^8.0-3.0*3.0*xy^2.0+x0^2.0*6.0*22.0*xy^21.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^2.0*x0*2520.0*xy^69.0+x0^2.0*x02*486.0*xy^8.0-9.0*xy^2.0+x0^2.0*132.0*xy^21.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^2.0*x0*36.0*xy^70.0+x0^2.0*x02*54.0*xy^9.0-3.0*xy^3.0+x0^2.0*6.0*xy^22.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^2.0*x0*36.0/71.0*xy^71.0+x0^2.0*x02*54.0/10.0*xy^10.0-3.0/4.0*xy^4.0+x0^2.0*6.0/23.0*xy^23.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^2.0*x0*0.5070422535211268*xy^71.0+x0^2.0*x02*5.4*xy^10.0-0.75*xy^4.0+x0^2.0/3.8333333333333335*xy^23.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^2.0*x0*2520.0*xy^69.0+x0^2.0*x02*486.0*xy^8.0-9.0*xy^2.0+x0^2.0*132.0*xy^21.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^2.0*x0*2520.0*69.0*xy^68.0+x0^2.0*x02*486.0*8.0*xy^7.0-9.0*2.0*xy^1.0+x0^2.0*132.0*21.0*xy^20.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^2.0*x0*173880.0*xy^68.0+x0^2.0*x02*3888.0*xy^7.0-18.0*xy+x0^2.0*2772.0*xy^20.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^2.0*x0*0.5070422535211268*xy^71.0+x0^2.0*x02*5.4*xy^10.0-0.75*xy^4.0+x0^2.0/3.8333333333333335*xy^23.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^2.0*x0*0.5070422535211268/72.0*xy^72.0+x0^2.0*x02*5.4/11.0*xy^11.0-0.75/5.0*xy^5.0+x0^2.0*3.8333333333333335/24.0*xy^24.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^2.0*x0*0.007042253521126761*xy^72.0+x0^2.0*x02/2.0370370370370368*xy^11.0-0.15*xy^5.0+x0^2.0/6.260869565217391*xy^24.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^2.0*x0*173880.0*xy^68.0+x0^2.0*x02*3888.0*xy^7.0-18.0*xy+x0^2.0*2772.0*xy^20.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^2.0*x0*173880.0*68.0*xy^67.0+x0^2.0*x02*3888.0*7.0*xy^6.0-18.0+x0^2.0*2772.0*20.0*xy^19.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^2.0*x0*1.182384E7*xy^67.0+x0^2.0*x02*27216.0*xy^6.0-18.0+x0^2.0*55440.0*xy^19.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^2.0*x0*0.007042253521126761*xy^72.0+x0^2.0*x02/2.0370370370370368*xy^11.0-0.15*xy^5.0+x0^2.0/6.260869565217391*xy^24.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^2.0*x0*0.007042253521126761/73.0*xy^73.0+x0^2.0*x02/2.0370370370370368/12.0*xy^12.0-0.15/6.0*xy^6.0+x0^2.0*6.260869565217391/25.0*xy^25.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^2.0*x0*9.646922631680494E-5*xy^73.0+x0^2.0*x02/24.444444444444443*xy^12.0-0.024999999999999998*xy^6.0+x0^2.0/3.993055555555556*xy^25.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^2.0*x0*1.182384E7*xy^67.0+x0^2.0*x02*27216.0*xy^6.0-18.0+x0^2.0*55440.0*xy^19.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^2.0*x0*1.182384E7*67.0*xy^66.0+x0^2.0*x02*27216.0*6.0*xy^5.0-18.0*0.0+x0^2.0*55440.0*19.0*xy^18.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^2.0*x0*7.9219728E8*xy^66.0+x0^2.0*x02*163296.0*xy^5.0+x0^2.0*1053360.0*xy^18.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^2.0*x0*9.646922631680494E-5*xy^73.0-5.0*xy^73.0+x0^2.0*x02/24.444444444444443*xy^12.0-0.024999999999999998*xy^6.0+x0^2.0/3.993055555555556*xy^25.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^2.0*x0*9.646922631680494E-5/74.0*xy^74.0-5.0/74.0*xy^74.0+x0^2.0*x02/24.444444444444443/13.0*xy^13.0-0.024999999999999998/7.0*xy^7.0+x0^2.0*3.993055555555556/26.0*xy^26.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^2.0*x0/767084.0*xy^74.0-1.0/14.8*xy^74.0-0.06756756756756757*xy^74.0+x0^2.0*x02/317.77777777777777*xy^13.0-0.0035714285714285713*xy^7.0+x0^2.0/6.511304347826086*xy^26.0";
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

public static void TestCaseDiff121155() {
 UsageCalculus.TestCase = 121155;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x0^2*-2*x0^3*3*x0/-1*x0^22*xyz^33*xyz/-1*xyz^2-1*x0^2*-2*x0^3*3*x02*xyz^3*3*xyz/1*xyz^2*--3*xyz^33*xyz1*x0^2*--3*x0^31*x0^2*-2*x0^32*xyz^3*3*xyz";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=154 EqnNumber=57 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[42, 57, 7, 8, 3, 1, 2, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 5, 3, 1, 16, 3, 1, 2, 3, 16, 3, 4, 14, 3, 32, 1, 2, 11]"+
"// DOEMatrixRow=[74, 59, 9, 4, 3, 1, 2, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 9, 8, 3, 1, 3, 1, 2, 3, 1, 3, 1, 3, 12, 1, 20, 17]"+
//Tail EqnIndex=154 EqnNumber=57 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[42, 57, 7, 8, 3, 1, 2, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 5, 3, 1, 16, 3, 1, 2, 3, 16, 3, 4, 14, 3, 32, 1, 2, 11]"+
"// DOEMatrixRow=[74, 59, 9, 4, 3, 1, 2, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 9, 8, 3, 1, 3, 1, 2, 3, 1, 3, 1, 3, 12, 1, 20, 17]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^2.0*x0*6.0*xyz^36.0+x0^2.0*972.0*xyz^43.0-x0^2.0*54.0*xyz^37.0+x0^31.0*18.0*xyz^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^2.0*x0*6.0*36.0*xyz^35.0+x0^2.0*972.0*43.0*xyz^42.0-x0^2.0*54.0*37.0*xyz^36.0+x0^31.0*18.0*4.0*xyz^3.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^2.0*x0*216.0*xyz^35.0+x0^2.0*41796.0*xyz^42.0-x0^2.0*1998.0*xyz^36.0+x0^31.0*72.0*xyz^3.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^2.0*x0*6.0*xyz^36.0+x0^2.0*972.0*xyz^43.0-x0^2.0*54.0*xyz^37.0+x0^31.0*18.0*xyz^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^2.0*x0*6.0/37.0*xyz^37.0+x0^2.0*972.0/44.0*xyz^44.0-x0^2.0*54.0/38.0*xyz^38.0+x0^31.0*18.0/5.0*xyz^5.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^2.0*x0*0.16216216216216217*xyz^37.0+x0^2.0*22.09090909090909*xyz^44.0-x0^2.0*1.4210526315789473*xyz^38.0+x0^31.0*3.6*xyz^5.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^2.0*x0*216.0*xyz^35.0+x0^2.0*41796.0*xyz^42.0-x0^2.0*1998.0*xyz^36.0+x0^31.0*72.0*xyz^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^2.0*x0*216.0*35.0*xyz^34.0+x0^2.0*41796.0*42.0*xyz^41.0-x0^2.0*1998.0*36.0*xyz^35.0+x0^31.0*72.0*3.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^2.0*x0*7560.0*xyz^34.0+x0^2.0*1755432.0*xyz^41.0-x0^2.0*71928.0*xyz^35.0+x0^31.0*216.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^2.0*x0*0.16216216216216217*xyz^37.0+x0^2.0*22.09090909090909*xyz^44.0-x0^2.0*1.4210526315789473*xyz^38.0+x0^31.0*3.6*xyz^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^2.0*x0*0.16216216216216217/38.0*xyz^38.0+x0^2.0*22.09090909090909/45.0*xyz^45.0-x0^2.0*1.4210526315789473/39.0*xyz^39.0+x0^31.0*3.6/6.0*xyz^6.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^2.0*x0*0.004267425320056899*xyz^38.0+x0^2.0*0.4909090909090909*xyz^45.0-x0^2.0*0.03643724696356275*xyz^39.0+x0^31.0/1.6666666666666665*xyz^6.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^2.0*x0*7560.0*xyz^34.0+x0^2.0*1755432.0*xyz^41.0-x0^2.0*71928.0*xyz^35.0+x0^31.0*216.0*xyz^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^2.0*x0*7560.0*34.0*xyz^33.0+x0^2.0*1755432.0*41.0*xyz^40.0-x0^2.0*71928.0*35.0*xyz^34.0+x0^31.0*216.0*2.0*xyz^1.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^2.0*x0*257040.0*xyz^33.0+x0^2.0*7.1972712E7*xyz^40.0-x0^2.0*2517480.0*xyz^34.0+x0^31.0*432.0*xyz";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^2.0*x0*0.004267425320056899*xyz^38.0+x0^2.0*0.4909090909090909*xyz^45.0-x0^2.0*0.03643724696356275*xyz^39.0+x0^31.0/1.6666666666666665*xyz^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^2.0*x0*0.004267425320056899/39.0*xyz^39.0+x0^2.0*0.4909090909090909/46.0*xyz^46.0-x0^2.0*0.03643724696356275/40.0*xyz^40.0+x0^31.0*1.6666666666666665/7.0*xyz^7.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^2.0*x0*1.0942116205274101E-4*xyz^39.0+x0^2.0*0.01067193675889328*xyz^46.0-x0^2.0*9.109311740890687E-4*xyz^40.0+x0^31.0/4.2*xyz^7.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^2.0*x0*257040.0*xyz^33.0+x0^2.0*7.1972712E7*xyz^40.0-x0^2.0*2517480.0*xyz^34.0+x0^31.0*432.0*xyz";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^2.0*x0*257040.0*33.0*xyz^32.0+x0^2.0*7.1972712E7*40.0*xyz^39.0-x0^2.0*2517480.0*34.0*xyz^33.0+x0^31.0*432.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^2.0*x0*8482320.0*xyz^32.0+x0^2.0*2.87890848E9*xyz^39.0-x0^2.0*8.559432E7*xyz^33.0+x0^31.0*432.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^2.0*x0*1.0942116205274101E-4*xyz^39.0-4.0*xyz^39.0+x0^2.0*0.01067193675889328*xyz^46.0-x0^2.0*9.109311740890687E-4*xyz^40.0-4.0*xyz^40.0+x0^31.0/4.2*xyz^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^2.0*x0*1.0942116205274101E-4/40.0*xyz^40.0-4.0/40.0*xyz^40.0+x0^2.0*0.01067193675889328/47.0*xyz^47.0-x0^2.0*9.109311740890687E-4/41.0*xyz^41.0-4.0/41.0*xyz^41.0+x0^31.0*4.2/8.0*xyz^8.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^2.0*x0/365559.99999999994*xyz^40.0-1.0/10.0*xyz^40.0-0.1*xyz^40.0+x0^2.0*2.270624842317719E-4*xyz^47.0-x0^2.0/45008.8888888889*xyz^41.0-1.0/10.25*xyz^41.0-0.0975609756097561*xyz^41.0+x0^31.0/1.9047619047619047*xyz^8.0";
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

public static void TestCaseDiff121156() {
 UsageCalculus.TestCase = 121156;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xyza^33*xyza/-1*xyza^2-1*x0^2*-2*x0^3*3*x02*xyza^3*3*xyza/1*xyza^2*--3*xyza^33*xyza1*x0^2*--3*x0^3-3*xyza^3*1*xyza/2*xyza^21*xyza/2*xyza^2*-3*xyza*-1*xyza^22*xyza^3*3*xyza3*xyza/-1*xyza^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=155 EqnNumber=58 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[7, 58, 8, 9, 4, 2, 3, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 1, 1, 2, 1, 1, 2, 3, 4, 1, 1, 1, 15, 4, 1, 2, 3, 12]"+
"// DOEMatrixRow=[38, 60, 10, 1, 1, 2, 3, 2, 1, 1, 2, 1, 2, 3, 4, 2, 3, 10, 9, 1, 2, 4, 2, 3, 4, 2, 1, 2, 4, 13, 2, 1, 18]"+
//Tail EqnIndex=155 EqnNumber=58 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[7, 58, 8, 9, 4, 2, 3, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 1, 1, 2, 1, 1, 2, 3, 4, 1, 1, 1, 15, 4, 1, 2, 3, 12]"+
"// DOEMatrixRow=[38, 60, 10, 1, 1, 2, 3, 2, 1, 1, 2, 1, 2, 3, 4, 2, 3, 10, 9, 1, 2, 4, 2, 3, 4, 2, 1, 2, 4, 13, 2, 1, 18]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-2.0*xyza^36.0+x0^2.0*162.0*xyza^39.0-x0^2.0*9.0*xyza^33.0-x0^3.0*3.0+6.75*xyza^57.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-2.0*36.0*xyza^35.0+x0^2.0*162.0*39.0*xyza^38.0-x0^2.0*9.0*33.0*xyza^32.0-x0^3.0*3.0*0.0+6.75*57.0*xyza^56.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-72.0*xyza^35.0+x0^2.0*6318.0*xyza^38.0-x0^2.0*297.0*xyza^32.0-x0^3.0*0.0+384.75*xyza^56.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-2.0*xyza^36.0+x0^2.0*162.0*xyza^39.0-x0^2.0*9.0*xyza^33.0-x0^3.0*3.0+6.75*xyza^57.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-2.0/37.0*xyza^37.0+x0^2.0*162.0/40.0*xyza^40.0-x0^2.0*9.0/34.0*xyza^34.0-x0^3.0*xyza+6.75/58.0*xyza^58.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-0.05405405405405406*xyza^37.0+x0^2.0*4.05*xyza^40.0-x0^2.0*0.2647058823529412*xyza^34.0-x0^3.0*xyza+1.0/8.592592592592593*xyza^58.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-72.0*xyza^35.0+x0^2.0*6318.0*xyza^38.0-x0^2.0*297.0*xyza^32.0-x0^3.0*0.0+384.75*xyza^56.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-72.0*35.0*xyza^34.0+x0^2.0*6318.0*38.0*xyza^37.0-x0^2.0*297.0*32.0*xyza^31.0-x0^3.0*0.0*0.0+384.75*56.0*xyza^55.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-2520.0*xyza^34.0+x0^2.0*240084.0*xyza^37.0-x0^2.0*9504.0*xyza^31.0-x0^3.0*0.0+21546.0*xyza^55.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-0.05405405405405406*xyza^37.0+x0^2.0*4.05*xyza^40.0-x0^2.0*0.2647058823529412*xyza^34.0-x0^3.0*xyza+1.0/8.592592592592593*xyza^58.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-0.05405405405405406/38.0*xyza^38.0+x0^2.0*4.05/41.0*xyza^41.0-x0^2.0*0.2647058823529412/35.0*xyza^35.0-x0^3.0/2.0*xyza^2.0+1.0/8.592592592592593/59.0*xyza^59.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-0.001422475106685633*xyza^38.0+x0^2.0*0.09878048780487804*xyza^41.0-x0^2.0*0.007563025210084034*xyza^35.0-x0^3.0/2.0*xyza^2.0+1.0/506.962962962963*xyza^59.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-2520.0*xyza^34.0+x0^2.0*240084.0*xyza^37.0-x0^2.0*9504.0*xyza^31.0-x0^3.0*0.0+21546.0*xyza^55.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-2520.0*34.0*xyza^33.0+x0^2.0*240084.0*37.0*xyza^36.0-x0^2.0*9504.0*31.0*xyza^30.0-x0^3.0*0.0*0.0+21546.0*55.0*xyza^54.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-85680.0*xyza^33.0+x0^2.0*8883108.0*xyza^36.0-x0^2.0*294624.0*xyza^30.0-x0^3.0*0.0+1185030.0*xyza^54.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-0.001422475106685633*xyza^38.0+x0^2.0*0.09878048780487804*xyza^41.0-x0^2.0*0.007563025210084034*xyza^35.0-x0^3.0/2.0*xyza^2.0+1.0/506.962962962963*xyza^59.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-0.001422475106685633/39.0*xyza^39.0+x0^2.0*0.09878048780487804/42.0*xyza^42.0-x0^2.0*0.007563025210084034/36.0*xyza^36.0-x0^3.0/2.0/3.0*xyza^3.0+1.0/506.962962962963/60.0*xyza^60.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-3.6473720684247E-5*xyza^39.0+x0^2.0*0.00235191637630662*xyza^42.0-x0^2.0*2.100840336134454E-4*xyza^36.0-x0^3.0/6.0*xyza^3.0+1.0/30417.77777777778*xyza^60.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-85680.0*xyza^33.0+x0^2.0*8883108.0*xyza^36.0-x0^2.0*294624.0*xyza^30.0-x0^3.0*0.0+1185030.0*xyza^54.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-85680.0*33.0*xyza^32.0+x0^2.0*8883108.0*36.0*xyza^35.0-x0^2.0*294624.0*30.0*xyza^29.0-x0^3.0*0.0*0.0+1185030.0*54.0*xyza^53.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-2827440.0*xyza^32.0+x0^2.0*3.19791888E8*xyza^35.0-x0^2.0*8838720.0*xyza^29.0-x0^3.0*0.0+6.399162E7*xyza^53.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-3.6473720684247E-5*xyza^39.0-5.0*xyza^39.0+x0^2.0*0.00235191637630662*xyza^42.0-x0^2.0*2.100840336134454E-4*xyza^36.0-4.0*xyza^36.0-x0^3.0/6.0*xyza^3.0+1.0/30417.77777777778*xyza^60.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-3.6473720684247E-5/40.0*xyza^40.0-5.0/40.0*xyza^40.0+x0^2.0*0.00235191637630662/43.0*xyza^43.0-x0^2.0*2.100840336134454E-4/37.0*xyza^37.0-4.0/37.0*xyza^37.0-x0^3.0/6.0/4.0*xyza^4.0+1.0/30417.77777777778/61.0*xyza^61.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/1096680.0*xyza^40.0-1.0/8.0*xyza^40.0-0.125*xyza^40.0+x0^2.0*5.46957296815493E-5*xyza^43.0-x0^2.0/176120.0*xyza^37.0-1.0/9.25*xyza^37.0-0.10810810810810811*xyza^37.0-x0^3.0/24.0*xyza^4.0+1.0/1855484.4444444447*xyza^61.0";
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

public static void TestCaseDiff121157() {
 UsageCalculus.TestCase = 121157;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*x/-1*x^2-1*x0^2*-2*x0^3*3*x02*x^3*3*x/1*x^2*--3*x^33*x1*x0^2*--3*x0^3-3*x^3*1*x/2*x^21*x/2*x^2*-3*x*-1*x^22*x0^23*x*-1*x^23*x/-1*x^2-1*x0^2*-2*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=156 EqnNumber=59 FamilyID=1 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[73, 59, 9, 10, 1, 3, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 1, 2, 3, 2, 16, 1, 2, 3, 4, 13]"+
"// DOEMatrixRow=[3, 61, 11, 2, 3, 1, 1, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 11, 10, 2, 3, 5, 3, 1, 5, 3, 2, 3, 1, 14, 1, 2, 19]"+
//Tail EqnIndex=156 EqnNumber=59 FamilyID=1 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[73, 59, 9, 10, 1, 3, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 1, 2, 3, 2, 16, 1, 2, 3, 4, 13]"+
"// DOEMatrixRow=[3, 61, 11, 2, 3, 1, 1, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 11, 10, 2, 3, 5, 3, 1, 5, 3, 2, 3, 1, 14, 1, 2, 19]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-3.0*x^3.0+162.0*x^39.0-9.0*x^33.0-3.0-2.25*x^78.0+2.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-3.0*3.0*x^2.0+162.0*39.0*x^38.0-9.0*33.0*x^32.0-3.0*0.0-2.25*78.0*x^77.0+2.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-9.0*x^2.0+6318.0*x^38.0-297.0*x^32.0-175.5*x^77.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-3.0*x^3.0+162.0*x^39.0-9.0*x^33.0-3.0-2.25*x^78.0+2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-3.0/4.0*x^4.0+162.0/40.0*x^40.0-9.0/34.0*x^34.0-3.0*x-2.25/79.0*x^79.0+2.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/1.3333333333333333*x^4.0+4.05*x^40.0-1.0/3.7777777777777777*x^34.0-3.0*x-1.0/35.111111111111114*x^79.0+2.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-9.0*x^2.0+6318.0*x^38.0-297.0*x^32.0-175.5*x^77.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-9.0*2.0*x^1.0+6318.0*38.0*x^37.0-297.0*32.0*x^31.0-175.5*77.0*x^76.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-18.0*x+240084.0*x^37.0-9504.0*x^31.0-13513.5*x^76.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/1.3333333333333333*x^4.0+4.05*x^40.0-1.0/3.7777777777777777*x^34.0-3.0*x-1.0/35.111111111111114*x^79.0+2.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/1.3333333333333333/5.0*x^5.0+4.05/41.0*x^41.0-1.0/3.7777777777777777/35.0*x^35.0-3.0/2.0*x^2.0-1.0/35.111111111111114/80.0*x^80.0+x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/6.666666666666666*x^5.0+1.0/10.123456790123457*x^41.0-1.0/132.22222222222223*x^35.0-1.5*x^2.0-3.5601265822784805E-4*x^80.0+x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-18.0*x+240084.0*x^37.0-9504.0*x^31.0-13513.5*x^76.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-18.0+240084.0*37.0*x^36.0-9504.0*31.0*x^30.0-13513.5*76.0*x^75.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-18.0+8883108.0*x^36.0-294624.0*x^30.0-1027026.0*x^75.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/6.666666666666666*x^5.0+1.0/10.123456790123457*x^41.0-1.0/132.22222222222223*x^35.0-1.5*x^2.0-3.5601265822784805E-4*x^80.0-4.0*x^80.0+x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/6.666666666666666/6.0*x^6.0+1.0/10.123456790123457/42.0*x^42.0-1.0/132.22222222222223/36.0*x^36.0-1.5/3.0*x^3.0-3.5601265822784805E-4/81.0*x^81.0-4.0/81.0*x^81.0+1.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/40.0*x^6.0+1.0/425.1851851851852*x^42.0-1.0/4760.0*x^36.0-1.0/2.0*x^3.0-1.0/227520.00000000003*x^81.0-1.0/20.25*x^81.0-1.0/20.25*x^81.0+1.0/3.0*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-18.0+8883108.0*x^36.0-294624.0*x^30.0-1027026.0*x^75.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0+8883108.0*36.0*x^35.0-294624.0*30.0*x^29.0-1027026.0*75.0*x^74.0";
 UsageCalculus.EqnSolArrayMap2[4] = "3.19791888E8*x^35.0-8838720.0*x^29.0-7.702695E7*x^74.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/40.0*x^6.0+1.0/425.1851851851852*x^42.0-1.0/4760.0*x^36.0-1.0/2.0*x^3.0-1.0/227520.00000000003*x^81.0-1.0/20.25*x^81.0-1.0/20.25*x^81.0+1.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/40.0/7.0*x^7.0+1.0/425.1851851851852/43.0*x^43.0-1.0/4760.0/37.0*x^37.0-1.0/2.0/4.0*x^4.0-1.0/227520.00000000003/82.0*x^82.0-1.0/20.25/82.0*x^82.0-1.0/20.25/82.0*x^82.0+1.0/3.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/280.0*x^7.0+1.0/18282.962962962964*x^43.0-1.0/176120.0*x^37.0-1.0/8.0*x^4.0-1.0/1.8656640000000004E7*x^82.0-1.0/1660.5*x^82.0-1.0/1660.5*x^82.0+1.0/12.0*x^4.0";
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

public static void TestCaseDiff121158() {
 UsageCalculus.TestCase = 121158;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-1*x0^2*-2*x0^3*3*x02*xy^3*3*xy/1*xy^2*--3*xy^33*xy1*x0^2*--3*x0^3-3*xy^3*1*xy/2*xy^21*xy/2*xy^2*-3*xy*-1*xy^22*x0^23*xy*-1*xy^2-1*xy^2/2*xy*-3*xy^22*xy*-3*xy^2*1*xy/-3*xy^2-1*x0^2*-2*x0^32*xy^3*3*xy";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=157 EqnNumber=60 FamilyID=3 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[37, 60, 10, 11, 2, 1, 2, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 3, 4, 3, 1, 2, 3, 2, 3, 1, 3, 1, 2, 3, 4, 5, 14]"+
"// DOEMatrixRow=[69, 62, 12, 3, 1, 2, 3, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 12, 1, 3, 1, 1, 1, 2, 6, 4, 3, 1, 2, 15, 2, 3, 20]"+
//Tail EqnIndex=157 EqnNumber=60 FamilyID=3 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[37, 60, 10, 11, 2, 1, 2, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 3, 4, 3, 1, 2, 3, 2, 3, 1, 3, 1, 2, 3, 4, 5, 14]"+
"// DOEMatrixRow=[69, 62, 12, 3, 1, 2, 3, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 12, 1, 3, 1, 1, 1, 2, 6, 4, 3, 1, 2, 15, 2, 3, 20]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0*162.0*xy^39.0-x0^2.0*9.0*xy^33.0-x0^3.0*3.0+x0^23.0*2.25*xy^54.0+1.5*xy^31.0+x0^2.0*6.0*xy^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0*162.0*39.0*xy^38.0-x0^2.0*9.0*33.0*xy^32.0-x0^3.0*3.0*0.0+x0^23.0*2.25*54.0*xy^53.0+1.5*31.0*xy^30.0+x0^2.0*6.0*4.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*6318.0*xy^38.0-x0^2.0*297.0*xy^32.0-x0^3.0*0.0+x0^23.0*121.5*xy^53.0+46.5*xy^30.0+x0^2.0*24.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0*162.0*xy^39.0-x0^2.0*9.0*xy^33.0-x0^3.0*3.0+x0^23.0*2.25*xy^54.0+1.5*xy^31.0+x0^2.0*6.0*xy^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0*162.0/40.0*xy^40.0-x0^2.0*9.0/34.0*xy^34.0-x0^3.0*xy+x0^23.0*2.25/55.0*xy^55.0+1.5/32.0*xy^32.0+x0^2.0*6.0/5.0*xy^5.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0*4.05*xy^40.0-x0^2.0*0.2647058823529412*xy^34.0-x0^3.0*xy+x0^23.0/24.444444444444443*xy^55.0+0.046875*xy^32.0+x0^2.0*1.2*xy^5.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*6318.0*xy^38.0-x0^2.0*297.0*xy^32.0-x0^3.0*0.0+x0^23.0*121.5*xy^53.0+46.5*xy^30.0+x0^2.0*24.0*xy^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*6318.0*38.0*xy^37.0-x0^2.0*297.0*32.0*xy^31.0-x0^3.0*0.0*0.0+x0^23.0*121.5*53.0*xy^52.0+46.5*30.0*xy^29.0+x0^2.0*24.0*3.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*240084.0*xy^37.0-x0^2.0*9504.0*xy^31.0-x0^3.0*0.0+x0^23.0*6439.5*xy^52.0+1395.0*xy^29.0+x0^2.0*72.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0*4.05*xy^40.0-x0^2.0*0.2647058823529412*xy^34.0-x0^3.0*xy+x0^23.0/24.444444444444443*xy^55.0+0.046875*xy^32.0+x0^2.0*1.2*xy^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0*4.05/41.0*xy^41.0-x0^2.0*0.2647058823529412/35.0*xy^35.0-x0^3.0/2.0*xy^2.0+x0^23.0/24.444444444444443/56.0*xy^56.0+0.046875/33.0*xy^33.0+x0^2.0*1.2/6.0*xy^6.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0*0.09878048780487804*xy^41.0-x0^2.0*0.007563025210084034*xy^35.0-x0^3.0/2.0*xy^2.0+x0^23.0/1368.8888888888887*xy^56.0+0.0014204545454545455*xy^33.0+x0^2.0/5.0*xy^6.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*240084.0*xy^37.0-x0^2.0*9504.0*xy^31.0-x0^3.0*0.0+x0^23.0*6439.5*xy^52.0+1395.0*xy^29.0+x0^2.0*72.0*xy^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*240084.0*37.0*xy^36.0-x0^2.0*9504.0*31.0*xy^30.0-x0^3.0*0.0*0.0+x0^23.0*6439.5*52.0*xy^51.0+1395.0*29.0*xy^28.0+x0^2.0*72.0*2.0*xy^1.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*8883108.0*xy^36.0-x0^2.0*294624.0*xy^30.0-x0^3.0*0.0+x0^23.0*334854.0*xy^51.0+40455.0*xy^28.0+x0^2.0*144.0*xy";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0*0.09878048780487804*xy^41.0-x0^2.0*0.007563025210084034*xy^35.0-x0^3.0/2.0*xy^2.0+x0^23.0/1368.8888888888887*xy^56.0+0.0014204545454545455*xy^33.0+x0^2.0/5.0*xy^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0*0.09878048780487804/42.0*xy^42.0-x0^2.0*0.007563025210084034/36.0*xy^36.0-x0^3.0/2.0/3.0*xy^3.0+x0^23.0/1368.8888888888887/57.0*xy^57.0+0.0014204545454545455/34.0*xy^34.0+x0^2.0*5.0/7.0*xy^7.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0*0.00235191637630662*xy^42.0-x0^2.0*2.100840336134454E-4*xy^36.0-x0^3.0*0.16666666666666666*xy^3.0+x0^23.0/78026.66666666666*xy^57.0+4.1778074866310165E-5*xy^34.0+x0^2.0/1.4*xy^7.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*8883108.0*xy^36.0-x0^2.0*294624.0*xy^30.0-x0^3.0*0.0+x0^23.0*334854.0*xy^51.0+40455.0*xy^28.0+x0^2.0*144.0*xy";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*8883108.0*36.0*xy^35.0-x0^2.0*294624.0*30.0*xy^29.0-x0^3.0*0.0*0.0+x0^23.0*334854.0*51.0*xy^50.0+40455.0*28.0*xy^27.0+x0^2.0*144.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*3.19791888E8*xy^35.0-x0^2.0*8838720.0*xy^29.0-x0^3.0*0.0+x0^23.0*1.7077554E7*xy^50.0+1132740.0*xy^27.0+x0^2.0*144.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0*0.00235191637630662*xy^42.0-x0^2.0*2.100840336134454E-4*xy^36.0-4.0*xy^36.0-x0^3.0*0.16666666666666666*xy^3.0+x0^23.0/78026.66666666666*xy^57.0+4.1778074866310165E-5*xy^34.0-5.0*xy^34.0+x0^2.0/1.4*xy^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0*0.00235191637630662/43.0*xy^43.0-x0^2.0*2.100840336134454E-4/37.0*xy^37.0-4.0/37.0*xy^37.0-x0^3.0*0.16666666666666666/4.0*xy^4.0+x0^23.0/78026.66666666666/58.0*xy^58.0+4.1778074866310165E-5/35.0*xy^35.0-5.0/35.0*xy^35.0+x0^2.0*1.4/8.0*xy^8.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0*5.46957296815493E-5*xy^43.0-x0^2.0/176120.0*xy^37.0-1.0/9.25*xy^37.0-0.10810810810810811*xy^37.0-x0^3.0*0.041666666666666664*xy^4.0+x0^23.0/4525546.666666666*xy^58.0+1.0/837759.9999999999*xy^35.0-1.0/7.0*xy^35.0-0.14285714285714285*xy^35.0+x0^2.0/5.714285714285714*xy^8.0";
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

public static void TestCaseDiff121159() {
 UsageCalculus.TestCase = 121159;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xyz^3*3*xyz/1*xyz^2*--3*xyz^33*xyz1*x0^2*--3*x0^3-3*xyz^3*1*xyz/2*xyz^21*xyz/2*xyz^2*-3*xyz*-1*xyz^22*x0^23*xyz*-1*xyz^2-1*xyz^2/2*xyz*-3*xyz^22*xyz*-3*xyz^2*1*xyz/-3*xyz^23*xy012^21*xyz/-3*xyz^22*xyz^3*3*xyz3*xyz/1*xyz^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=158 EqnNumber=61 FamilyID=1 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[2, 61, 11, 12, 3, 2, 3, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 1, 1, 4, 2, 3, 1, 3, 4, 2, 4, 2, 3, 4, 5, 6, 15]"+
"// DOEMatrixRow=[33, 63, 13, 4, 2, 3, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 13, 2, 1, 2, 3, 2, 3, 1, 1, 1, 2, 3, 16, 1, 4, 1]"+
//Tail EqnIndex=158 EqnNumber=61 FamilyID=1 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[2, 61, 11, 12, 3, 2, 3, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 1, 1, 4, 2, 3, 1, 3, 4, 2, 4, 2, 3, 4, 5, 6, 15]"+
"// DOEMatrixRow=[33, 63, 13, 4, 2, 3, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 13, 2, 1, 2, 3, 2, 3, 1, 1, 1, 2, 3, 16, 1, 4, 1]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0*54.0*xyz^39.0-x0^2.0*9.0*xyz^33.0-x0^3.0*3.0+x0^23.0*2.25*xyz^54.0-1.5*xyz^81.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0*54.0*39.0*xyz^38.0-x0^2.0*9.0*33.0*xyz^32.0-x0^3.0*3.0*0.0+x0^23.0*2.25*54.0*xyz^53.0-1.5*81.0*xyz^80.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*2106.0*xyz^38.0-x0^2.0*297.0*xyz^32.0-x0^3.0*0.0+x0^23.0*121.5*xyz^53.0-121.5*xyz^80.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0*54.0*xyz^39.0-x0^2.0*9.0*xyz^33.0-x0^3.0*3.0+x0^23.0*2.25*xyz^54.0-1.5*xyz^81.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0*54.0/40.0*xyz^40.0-x0^2.0*9.0/34.0*xyz^34.0-x0^3.0*xyz+x0^23.0*2.25/55.0*xyz^55.0-1.5/82.0*xyz^82.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0*1.35*xyz^40.0-x0^2.0*0.2647058823529412*xyz^34.0-x0^3.0*xyz+x0^23.0/24.444444444444443*xyz^55.0-1.0/54.666666666666664*xyz^82.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*2106.0*xyz^38.0-x0^2.0*297.0*xyz^32.0-x0^3.0*0.0+x0^23.0*121.5*xyz^53.0-121.5*xyz^80.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*2106.0*38.0*xyz^37.0-x0^2.0*297.0*32.0*xyz^31.0-x0^3.0*0.0*0.0+x0^23.0*121.5*53.0*xyz^52.0-121.5*80.0*xyz^79.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*80028.0*xyz^37.0-x0^2.0*9504.0*xyz^31.0-x0^3.0*0.0+x0^23.0*6439.5*xyz^52.0-9720.0*xyz^79.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0*1.35*xyz^40.0-x0^2.0*0.2647058823529412*xyz^34.0-x0^3.0*xyz+x0^23.0/24.444444444444443*xyz^55.0-1.0/54.666666666666664*xyz^82.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0*1.35/41.0*xyz^41.0-x0^2.0*0.2647058823529412/35.0*xyz^35.0-x0^3.0/2.0*xyz^2.0+x0^23.0/24.444444444444443/56.0*xyz^56.0-1.0/54.666666666666664/83.0*xyz^83.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0*0.032926829268292684*xyz^41.0-x0^2.0*0.007563025210084034*xyz^35.0-x0^3.0/2.0*xyz^2.0+x0^23.0/1368.8888888888887*xyz^56.0-1.0/4537.333333333333*xyz^83.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*80028.0*xyz^37.0-x0^2.0*9504.0*xyz^31.0-x0^3.0*0.0+x0^23.0*6439.5*xyz^52.0-9720.0*xyz^79.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*80028.0*37.0*xyz^36.0-x0^2.0*9504.0*31.0*xyz^30.0-x0^3.0*0.0*0.0+x0^23.0*6439.5*52.0*xyz^51.0-9720.0*79.0*xyz^78.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*2961036.0*xyz^36.0-x0^2.0*294624.0*xyz^30.0-x0^3.0*0.0+x0^23.0*334854.0*xyz^51.0-767880.0*xyz^78.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0*0.032926829268292684*xyz^41.0-x0^2.0*0.007563025210084034*xyz^35.0-x0^3.0/2.0*xyz^2.0+x0^23.0/1368.8888888888887*xyz^56.0-1.0/4537.333333333333*xyz^83.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0*0.032926829268292684/42.0*xyz^42.0-x0^2.0*0.007563025210084034/36.0*xyz^36.0-x0^3.0/2.0/3.0*xyz^3.0+x0^23.0/1368.8888888888887/57.0*xyz^57.0-1.0/4537.333333333333/84.0*xyz^84.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0*7.839721254355401E-4*xyz^42.0-x0^2.0*2.100840336134454E-4*xyz^36.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^23.0/78026.66666666666*xyz^57.0-1.0/381136.0*xyz^84.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*2961036.0*xyz^36.0-x0^2.0*294624.0*xyz^30.0-x0^3.0*0.0+x0^23.0*334854.0*xyz^51.0-767880.0*xyz^78.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*2961036.0*36.0*xyz^35.0-x0^2.0*294624.0*30.0*xyz^29.0-x0^3.0*0.0*0.0+x0^23.0*334854.0*51.0*xyz^50.0-767880.0*78.0*xyz^77.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*1.06597296E8*xyz^35.0-x0^2.0*8838720.0*xyz^29.0-x0^3.0*0.0+x0^23.0*1.7077554E7*xyz^50.0-5.989464E7*xyz^77.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0*7.839721254355401E-4*xyz^42.0-4.0*xyz^42.0-x0^2.0*2.100840336134454E-4*xyz^36.0-4.0*xyz^36.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^23.0/78026.66666666666*xyz^57.0-1.0/381136.0*xyz^84.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0*7.839721254355401E-4/43.0*xyz^43.0-4.0/43.0*xyz^43.0-x0^2.0*2.100840336134454E-4/37.0*xyz^37.0-4.0/37.0*xyz^37.0-x0^3.0*0.16666666666666666/4.0*xyz^4.0+x0^23.0/78026.66666666666/58.0*xyz^58.0-1.0/381136.0/85.0*xyz^85.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0/54848.88888888889*xyz^43.0-1.0/10.75*xyz^43.0-0.09302325581395349*xyz^43.0-x0^2.0/176120.0*xyz^37.0-1.0/9.25*xyz^37.0-0.10810810810810811*xyz^37.0-x0^3.0*0.041666666666666664*xyz^4.0+x0^23.0/4525546.666666666*xyz^58.0-1.0/3.239656E7*xyz^85.0";
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

public static void TestCaseDiff121160() {
 UsageCalculus.TestCase = 121160;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xyza1*x0^2*--3*x0^3-3*xyza^3*1*xyza/2*xyza^21*xyza/2*xyza^2*-3*xyza*-1*xyza^22*x0^23*xyza*-1*xyza^2-1*xyza^2/2*xyza*-3*xyza^22*xyza*-3*xyza^2*1*xyza/-3*xyza^23*xy012^21*xyza/-3*xyza^2-3*xyza^2*1*xyza/2*xyza^21*xyza/2*xyza^2*-3*xyza^3*-1*xyza3*xyza/1*xyza^21*x0^2*--3*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=159 EqnNumber=62 FamilyID=2 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[68, 62, 12, 13, 4, 3, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 2, 3, 5, 3, 1, 2, 4, 5, 3, 1, 3, 4, 5, 6, 7, 16]"+
"// DOEMatrixRow=[98, 64, 14, 1, 3, 1, 2, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 14, 3, 2, 3, 4, 3, 1, 2, 3, 2, 3, 4, 1, 2, 5, 2]"+
//Tail EqnIndex=159 EqnNumber=62 FamilyID=2 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[68, 62, 12, 13, 4, 3, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 2, 3, 5, 3, 1, 2, 4, 5, 3, 1, 3, 4, 5, 6, 7, 16]"+
"// DOEMatrixRow=[98, 64, 14, 1, 3, 1, 2, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 14, 3, 2, 3, 4, 3, 1, 2, 3, 2, 3, 4, 1, 2, 5, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0*9.0-x0^3.0*3.0+x0^23.0*2.25*xyza^54.0-xy012^21.0/2.0*xyza^55.0-x0^2.0*6.75*xyza^52.0-x0^3.0*3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0*9.0*0.0-x0^3.0*3.0*0.0+x0^23.0*2.25*54.0*xyza^53.0-xy012^21.0/2.0*55.0*xyza^54.0-x0^2.0*6.75*52.0*xyza^51.0-x0^3.0*3.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*121.5*xyza^53.0-xy012^21.0*27.5*xyza^54.0-x0^2.0*351.0*xyza^51.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0*9.0-x0^3.0*3.0+x0^23.0*2.25*xyza^54.0-xy012^21.0/2.0*xyza^55.0-x0^2.0*6.75*xyza^52.0-x0^3.0*3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0*9.0*xyza-x0^3.0*xyza+x0^23.0*2.25/55.0*xyza^55.0-xy012^21.0/2.0/56.0*xyza^56.0-x0^2.0*6.75/53.0*xyza^53.0-x0^3.0*xyza";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0*9.0*xyza-x0^3.0*xyza+x0^23.0*0.04090909090909091*xyza^55.0-xy012^21.0*0.008928571428571428*xyza^56.0-x0^2.0*0.12735849056603774*xyza^53.0-x0^3.0*xyza";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*121.5*xyza^53.0-xy012^21.0*27.5*xyza^54.0-x0^2.0*351.0*xyza^51.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^23.0*121.5*53.0*xyza^52.0-xy012^21.0*27.5*54.0*xyza^53.0-x0^2.0*351.0*51.0*xyza^50.0-x0^3.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*6439.5*xyza^52.0-xy012^21.0*1485.0*xyza^53.0-x0^2.0*17901.0*xyza^50.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0*9.0*xyza-x0^3.0*xyza+x0^23.0*0.04090909090909091*xyza^55.0-xy012^21.0*0.008928571428571428*xyza^56.0-x0^2.0*0.12735849056603774*xyza^53.0-x0^3.0*xyza";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0*9.0/2.0*xyza^2.0-x0^3.0/2.0*xyza^2.0+x0^23.0*0.04090909090909091/56.0*xyza^56.0-xy012^21.0*0.008928571428571428/57.0*xyza^57.0-x0^2.0*0.12735849056603774/54.0*xyza^54.0-x0^3.0/2.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0*4.5*xyza^2.0-x0^3.0/2.0*xyza^2.0+x0^23.0*7.305194805194805E-4*xyza^56.0-xy012^21.0*1.5664160401002505E-4*xyza^57.0-x0^2.0*0.0023584905660377358*xyza^54.0-x0^3.0/2.0*xyza^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*6439.5*xyza^52.0-xy012^21.0*1485.0*xyza^53.0-x0^2.0*17901.0*xyza^50.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^23.0*6439.5*52.0*xyza^51.0-xy012^21.0*1485.0*53.0*xyza^52.0-x0^2.0*17901.0*50.0*xyza^49.0-x0^3.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*334854.0*xyza^51.0-xy012^21.0*78705.0*xyza^52.0-x0^2.0*895050.0*xyza^49.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0*4.5*xyza^2.0-x0^3.0/2.0*xyza^2.0+x0^23.0*7.305194805194805E-4*xyza^56.0-4.0*xyza^56.0-xy012^21.0*1.5664160401002505E-4*xyza^57.0-4.0*xyza^57.0-x0^2.0*0.0023584905660377358*xyza^54.0-x0^3.0/2.0*xyza^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0*4.5/3.0*xyza^3.0-x0^3.0/2.0/3.0*xyza^3.0+x0^23.0*7.305194805194805E-4/57.0*xyza^57.0-4.0/57.0*xyza^57.0-xy012^21.0*1.5664160401002505E-4/58.0*xyza^58.0-4.0/58.0*xyza^58.0-x0^2.0*0.0023584905660377358/55.0*xyza^55.0-x0^3.0*2.0/3.0*xyza^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0*1.5*xyza^3.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^23.0/78026.66666666666*xyza^57.0-1.0/14.25*xyza^57.0-0.07017543859649122*xyza^57.0-xy012^21.0/370272.0*xyza^58.0-1.0/14.5*xyza^58.0-0.06896551724137931*xyza^58.0-x0^2.0*4.288164665523156E-5*xyza^55.0-x0^3.0/1.5*xyza^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*334854.0*xyza^51.0-xy012^21.0*78705.0*xyza^52.0-x0^2.0*895050.0*xyza^49.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^23.0*334854.0*51.0*xyza^50.0-xy012^21.0*78705.0*52.0*xyza^51.0-x0^2.0*895050.0*49.0*xyza^48.0-x0^3.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*0.0-x0^3.0*0.0+x0^23.0*1.7077554E7*xyza^50.0-xy012^21.0*4092660.0*xyza^51.0-x0^2.0*4.385745E7*xyza^48.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0*1.5*xyza^3.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^23.0/78026.66666666666*xyza^57.0-1.0/14.25*xyza^57.0-0.07017543859649122*xyza^57.0-xy012^21.0/370272.0*xyza^58.0-1.0/14.5*xyza^58.0-0.06896551724137931*xyza^58.0-x0^2.0*4.288164665523156E-5*xyza^55.0-5.0*xyza^55.0-x0^3.0/1.5*xyza^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0*1.5/4.0*xyza^4.0-x0^3.0*0.16666666666666666/4.0*xyza^4.0+x0^23.0/78026.66666666666/58.0*xyza^58.0-1.0/14.25/58.0*xyza^58.0-0.07017543859649122/58.0*xyza^58.0-xy012^21.0/370272.0/59.0*xyza^59.0-1.0/14.5/59.0*xyza^59.0-0.06896551724137931/59.0*xyza^59.0-x0^2.0*4.288164665523156E-5/56.0*xyza^56.0-5.0/56.0*xyza^56.0-x0^3.0*1.5/4.0*xyza^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0*0.375*xyza^4.0-x0^3.0*0.041666666666666664*xyza^4.0+x0^23.0/4525546.666666666*xyza^58.0-1.0/826.5*xyza^58.0-0.0012099213551119176*xyza^58.0-xy012^21.0/2.1846048E7*xyza^59.0-1.0/855.5*xyza^59.0-0.0011689070718877848*xyza^59.0-x0^2.0/1305920.0*xyza^56.0-1.0/11.2*xyza^56.0-0.08928571428571429*xyza^56.0-x0^3.0/2.6666666666666665*xyza^4.0";
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

public static void TestCaseDiff121161() {
 UsageCalculus.TestCase = 121161;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x0^2*--3*x0^3-3*x^3*1*x/2*x^21*x/2*x^2*-3*x*-1*x^22*x0^23*x*-1*x^2-1*x^2/2*x*-3*x^22*x*-3*x^2*1*x/-3*x^23*xy012^21*x/-3*x^2-3*x^2*1*x/2*x^21*x/2*x^2*-3*x^3*-1*x2*xy012^23*x^3*-1*x1*x0^2*--3*x0^3-3*x^3*1*x";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=160 EqnNumber=63 FamilyID=3 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[32, 63, 13, 14, 1, 1, 2, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 4, 6, 1, 2, 3, 1, 6, 1, 2, 4, 1, 6, 7, 8, 17]"+
"// DOEMatrixRow=[64, 65, 15, 2, 1, 2, 3, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 15, 4, 3, 1, 5, 1, 2, 3, 4, 3, 1, 1, 2, 1, 6, 3]"+
//Tail EqnIndex=160 EqnNumber=63 FamilyID=3 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[32, 63, 13, 14, 1, 1, 2, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 4, 6, 1, 2, 3, 1, 6, 1, 2, 4, 1, 6, 7, 8, 17]"+
"// DOEMatrixRow=[64, 65, 15, 2, 1, 2, 3, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 15, 4, 3, 1, 5, 1, 2, 3, 4, 3, 1, 1, 2, 1, 6, 3]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "3.0-3.0+2.25*x^54.0-1.0/2.0*x^55.0+6.75*x^33.0-3.0-3.0*x^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0-3.0*0.0+2.25*54.0*x^53.0-1.0/2.0*55.0*x^54.0+6.75*33.0*x^32.0-3.0*0.0-3.0*4.0*x^3.0";
 UsageCalculus.EqnSolArrayMap2[1] = "121.5*x^53.0-27.5*x^54.0+222.75*x^32.0-12.0*x^3.0";
 UsageCalculus.EqnSolArrayMap3[1] = "3.0-3.0+2.25*x^54.0-1.0/2.0*x^55.0+6.75*x^33.0-3.0-3.0*x^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "3.0*x-3.0*x+2.25/55.0*x^55.0-1.0/2.0/56.0*x^56.0+6.75/34.0*x^34.0-3.0*x-3.0/5.0*x^5.0";
 UsageCalculus.EqnSolArrayMap4[1] = "3.0*x-3.0*x+1.0/24.444444444444443*x^55.0-1.0/112.0*x^56.0+1.0/5.037037037037037*x^34.0-3.0*x-1.0/1.6666666666666667*x^5.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "121.5*x^53.0-27.5*x^54.0+222.75*x^32.0-12.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "121.5*53.0*x^52.0-27.5*54.0*x^53.0+222.75*32.0*x^31.0-12.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[2] = "6439.5*x^52.0-1485.0*x^53.0+7128.0*x^31.0-36.0*x^2.0";
 UsageCalculus.EqnSolArrayMap3[2] = "3.0*x-3.0*x+1.0/24.444444444444443*x^55.0-1.0/112.0*x^56.0+1.0/5.037037037037037*x^34.0-3.0*x-1.0/1.6666666666666667*x^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "3.0/2.0*x^2.0-3.0/2.0*x^2.0+1.0/24.444444444444443/56.0*x^56.0-1.0/112.0/57.0*x^57.0+1.0/5.037037037037037/35.0*x^35.0-3.0/2.0*x^2.0-1.0/1.6666666666666667/6.0*x^6.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.5*x^2.0-1.5*x^2.0+1.0/1368.8888888888887*x^56.0-1.0/6384.0*x^57.0+1.0/176.2962962962963*x^35.0-1.5*x^2.0-1.0/10.0*x^6.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "6439.5*x^52.0-1485.0*x^53.0+7128.0*x^31.0-36.0*x^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "6439.5*52.0*x^51.0-1485.0*53.0*x^52.0+7128.0*31.0*x^30.0-36.0*2.0*x^1.0";
 UsageCalculus.EqnSolArrayMap2[3] = "334854.0*x^51.0-78705.0*x^52.0+220968.0*x^30.0-72.0*x";
 UsageCalculus.EqnSolArrayMap3[3] = "1.5*x^2.0-1.5*x^2.0+1.0/1368.8888888888887*x^56.0-1.0/6384.0*x^57.0+1.0/176.2962962962963*x^35.0-1.5*x^2.0-1.0/10.0*x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.5/3.0*x^3.0-1.5/3.0*x^3.0+1.0/1368.8888888888887/57.0*x^57.0-1.0/6384.0/58.0*x^58.0+1.0/176.2962962962963/36.0*x^36.0-1.5/3.0*x^3.0-1.0/10.0/7.0*x^7.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/2.0*x^3.0-1.0/2.0*x^3.0+1.0/78026.66666666666*x^57.0-1.0/370272.0*x^58.0+1.0/6346.666666666667*x^36.0-1.0/2.0*x^3.0-1.0/70.0*x^7.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "334854.0*x^51.0-78705.0*x^52.0+220968.0*x^30.0-72.0*x";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "334854.0*51.0*x^50.0-78705.0*52.0*x^51.0+220968.0*30.0*x^29.0-72.0";
 UsageCalculus.EqnSolArrayMap2[4] = "1.7077554E7*x^50.0-4092660.0*x^51.0+6629040.0*x^29.0-72.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/2.0*x^3.0-1.0/2.0*x^3.0+1.0/78026.66666666666*x^57.0-1.0/370272.0*x^58.0+1.0/6346.666666666667*x^36.0-1.0/2.0*x^3.0-1.0/70.0*x^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/2.0/4.0*x^4.0-1.0/2.0/4.0*x^4.0+1.0/78026.66666666666/58.0*x^58.0-1.0/370272.0/59.0*x^59.0+1.0/6346.666666666667/37.0*x^37.0-1.0/2.0/4.0*x^4.0-1.0/70.0/8.0*x^8.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/8.0*x^4.0-1.0/8.0*x^4.0+1.0/4525546.666666666*x^58.0-1.0/2.1846048E7*x^59.0+1.0/234826.6666666667*x^37.0-1.0/8.0*x^4.0-1.0/560.0*x^8.0";
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

public static void TestCaseDiff121162() {
 UsageCalculus.TestCase = 121162;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xy^3*1*xy/2*xy^21*xy/2*xy^2*-3*xy*-1*xy^22*x0^23*xy*-1*xy^2-1*xy^2/2*xy*-3*xy^22*xy*-3*xy^2*1*xy/-3*xy^23*xy012^21*xy/-3*xy^2-3*xy^2*1*xy/2*xy^21*xy/2*xy^2*-3*xy^3*-1*xy2*xy012^23*xy^3*-1*xy-1*xy/2*xy^2*-3*xy^32*x0^2*-3*x0^3*1*x0/-3*x0^2-3*xy^3*1*xy1*xy/2*xy^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=161 EqnNumber=64 FamilyID=1 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[97, 64, 14, 15, 2, 3, 1, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 1, 7, 2, 3, 1, 2, 7, 2, 3, 5, 2, 7, 8, 9, 18]"+
"// DOEMatrixRow=[28, 66, 16, 3, 2, 3, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 16, 5, 1, 2, 1, 2, 3, 4, 1, 1, 2, 3, 4, 2, 7, 4]"+
//Tail EqnIndex=161 EqnNumber=64 FamilyID=1 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[97, 64, 14, 15, 2, 3, 1, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 1, 7, 2, 3, 1, 2, 7, 2, 3, 5, 2, 7, 8, 9, 18]"+
"// DOEMatrixRow=[28, 66, 16, 3, 2, 3, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 16, 5, 1, 2, 1, 2, 3, 4, 1, 1, 2, 3, 4, 2, 7, 4]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^23.0*2.25*xy^54.0-1.0/2.0*xy^55.0+2.25*xy^34.0+x0^2.0*x0*1.5*xy^35.0-1.5*xy^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^23.0*2.25*54.0*xy^53.0-1.0/2.0*55.0*xy^54.0+2.25*34.0*xy^33.0+x0^2.0*x0*1.5*35.0*xy^34.0-1.5*6.0*xy^5.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^23.0*121.5*xy^53.0-27.5*xy^54.0+76.5*xy^33.0+x0^2.0*x0*52.5*xy^34.0-9.0*xy^5.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^23.0*2.25*xy^54.0-1.0/2.0*xy^55.0+2.25*xy^34.0+x0^2.0*x0*1.5*xy^35.0-1.5*xy^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^23.0*2.25/55.0*xy^55.0-1.0/2.0/56.0*xy^56.0+2.25/35.0*xy^35.0+x0^2.0*x0*1.5/36.0*xy^36.0-1.5/7.0*xy^7.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^23.0/24.444444444444443*xy^55.0-1.0/112.0*xy^56.0+0.06428571428571428*xy^35.0+x0^2.0*x0/24.0*xy^36.0-1.0/4.666666666666667*xy^7.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^23.0*121.5*xy^53.0-27.5*xy^54.0+76.5*xy^33.0+x0^2.0*x0*52.5*xy^34.0-9.0*xy^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^23.0*121.5*53.0*xy^52.0-27.5*54.0*xy^53.0+76.5*33.0*xy^32.0+x0^2.0*x0*52.5*34.0*xy^33.0-9.0*5.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^23.0*6439.5*xy^52.0-1485.0*xy^53.0+2524.5*xy^32.0+x0^2.0*x0*1785.0*xy^33.0-45.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^23.0/24.444444444444443*xy^55.0-1.0/112.0*xy^56.0+0.06428571428571428*xy^35.0+x0^2.0*x0/24.0*xy^36.0-1.0/4.666666666666667*xy^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^23.0/24.444444444444443/56.0*xy^56.0-1.0/112.0/57.0*xy^57.0+0.06428571428571428/36.0*xy^36.0+x0^2.0*x0/24.0/37.0*xy^37.0-1.0/4.666666666666667/8.0*xy^8.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^23.0/1368.8888888888887*xy^56.0-1.0/6384.0*xy^57.0+0.0017857142857142854*xy^36.0+x0^2.0*x0/888.0*xy^37.0-1.0/37.333333333333336*xy^8.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^23.0*6439.5*xy^52.0-1485.0*xy^53.0+2524.5*xy^32.0+x0^2.0*x0*1785.0*xy^33.0-45.0*xy^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^23.0*6439.5*52.0*xy^51.0-1485.0*53.0*xy^52.0+2524.5*32.0*xy^31.0+x0^2.0*x0*1785.0*33.0*xy^32.0-45.0*4.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^23.0*334854.0*xy^51.0-78705.0*xy^52.0+80784.0*xy^31.0+x0^2.0*x0*58905.0*xy^32.0-180.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^23.0/1368.8888888888887*xy^56.0-1.0/6384.0*xy^57.0+0.0017857142857142854*xy^36.0+x0^2.0*x0/888.0*xy^37.0-1.0/37.333333333333336*xy^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^23.0/1368.8888888888887/57.0*xy^57.0-1.0/6384.0/58.0*xy^58.0+0.0017857142857142854/37.0*xy^37.0+x0^2.0*x0/888.0/38.0*xy^38.0-1.0/37.333333333333336/9.0*xy^9.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^23.0/78026.66666666666*xy^57.0-1.0/370272.0*xy^58.0+4.8262548262548256E-5*xy^37.0+x0^2.0*x0/33744.0*xy^38.0-1.0/336.0*xy^9.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^23.0*334854.0*xy^51.0-78705.0*xy^52.0+80784.0*xy^31.0+x0^2.0*x0*58905.0*xy^32.0-180.0*xy^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^23.0*334854.0*51.0*xy^50.0-78705.0*52.0*xy^51.0+80784.0*31.0*xy^30.0+x0^2.0*x0*58905.0*32.0*xy^31.0-180.0*3.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^23.0*1.7077554E7*xy^50.0-4092660.0*xy^51.0+2504304.0*xy^30.0+x0^2.0*x0*1884960.0*xy^31.0-540.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^23.0/78026.66666666666*xy^57.0-1.0/370272.0*xy^58.0+4.8262548262548256E-5*xy^37.0-5.0*xy^37.0+x0^2.0*x0/33744.0*xy^38.0-1.0/336.0*xy^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^23.0/78026.66666666666/58.0*xy^58.0-1.0/370272.0/59.0*xy^59.0+4.8262548262548256E-5/38.0*xy^38.0-5.0/38.0*xy^38.0+x0^2.0*x0/33744.0/39.0*xy^39.0-1.0/336.0/10.0*xy^10.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^23.0/4525546.666666666*xy^58.0-1.0/2.1846048E7*xy^59.0+1.0/787360.0000000001*xy^38.0-1.0/7.6*xy^38.0-0.13157894736842105*xy^38.0+x0^2.0*x0/1316016.0*xy^39.0-1.0/3360.0*xy^10.0";
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

public static void TestCaseDiff121163() {
 UsageCalculus.TestCase = 121163;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xyz/2*xyz^2*-3*xyz*-1*xyz^22*x0^23*xyz*-1*xyz^2-1*xyz^2/2*xyz*-3*xyz^22*xyz*-3*xyz^2*1*xyz/-3*xyz^23*xy012^21*xyz/-3*xyz^2-3*xyz^2*1*xyz/2*xyz^21*xyz/2*xyz^2*-3*xyz^3*-1*xyz2*xy012^23*xyz^3*-1*xyz-1*xyz/2*xyz^2*-3*xyz^32*x0^2*-3*x0^3*1*x0/-3*x0^23*xyz^31*xyz/-3*xyz^21*xyz/2*xyz^22*x0^2*-3*x0";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=162 EqnNumber=65 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[63, 65, 15, 16, 3, 1, 2, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 3, 8, 3, 1, 2, 3, 8, 3, 4, 6, 3, 8, 9, 10, 19]"+
"// DOEMatrixRow=[93, 67, 17, 4, 3, 1, 2, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 17, 6, 2, 3, 2, 3, 1, 5, 2, 3, 1, 4, 5, 1, 8, 5]"+
//Tail EqnIndex=162 EqnNumber=65 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[63, 65, 15, 16, 3, 1, 2, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 3, 8, 3, 1, 2, 3, 8, 3, 4, 6, 3, 8, 9, 10, 19]"+
"// DOEMatrixRow=[93, 67, 17, 4, 3, 1, 2, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 17, 6, 2, 3, 2, 3, 1, 5, 2, 3, 1, 4, 5, 1, 8, 5]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^23.0*1.5*xyz^29.0-xy012^21.0/2.0*xyz^55.0+xy012^23.0*2.25*xyz^34.0+x0^2.0*x0*x0/1.3333333333333333*xyz^111.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^23.0*1.5*29.0*xyz^28.0-xy012^21.0/2.0*55.0*xyz^54.0+xy012^23.0*2.25*34.0*xyz^33.0+x0^2.0*x0*x0*111.0*xyz^110.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^23.0*43.5*xyz^28.0-xy012^21.0*27.5*xyz^54.0+xy012^23.0*76.5*xyz^33.0+x0^2.0*x0*x0*111.0*xyz^110.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^23.0*1.5*xyz^29.0-xy012^21.0/2.0*xyz^55.0+xy012^23.0*2.25*xyz^34.0+x0^2.0*x0*x0/1.3333333333333333*xyz^111.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^23.0*1.5/30.0*xyz^30.0-xy012^21.0/2.0/56.0*xyz^56.0+xy012^23.0*2.25/35.0*xyz^35.0+x0^2.0*x0*x0/1.3333333333333333/112.0*xyz^112.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^23.0*0.05*xyz^30.0-xy012^21.0*0.008928571428571428*xyz^56.0+xy012^23.0*0.06428571428571428*xyz^35.0+x0^2.0*x0*x0/149.33333333333331*xyz^112.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^23.0*43.5*xyz^28.0-xy012^21.0*27.5*xyz^54.0+xy012^23.0*76.5*xyz^33.0+x0^2.0*x0*x0*111.0*xyz^110.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^23.0*43.5*28.0*xyz^27.0-xy012^21.0*27.5*54.0*xyz^53.0+xy012^23.0*76.5*33.0*xyz^32.0+x0^2.0*x0*x0*110.0*xyz^109.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^23.0*1218.0*xyz^27.0-xy012^21.0*1485.0*xyz^53.0+xy012^23.0*2524.5*xyz^32.0+x0^2.0*x0*x0*110.0*xyz^109.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^23.0*0.05*xyz^30.0-xy012^21.0*0.008928571428571428*xyz^56.0+xy012^23.0*0.06428571428571428*xyz^35.0+x0^2.0*x0*x0/149.33333333333331*xyz^112.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^23.0*0.05/31.0*xyz^31.0-xy012^21.0*0.008928571428571428/57.0*xyz^57.0+xy012^23.0*0.06428571428571428/36.0*xyz^36.0+x0^2.0*x0*x0/149.33333333333331/113.0*xyz^113.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^23.0*0.0016129032258064516*xyz^31.0-xy012^21.0*1.5664160401002505E-4*xyz^57.0+xy012^23.0*0.0017857142857142854*xyz^36.0+x0^2.0*x0*x0/16874.666666666664*xyz^113.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^23.0*1218.0*xyz^27.0-xy012^21.0*1485.0*xyz^53.0+xy012^23.0*2524.5*xyz^32.0+x0^2.0*x0*x0*110.0*xyz^109.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^23.0*1218.0*27.0*xyz^26.0-xy012^21.0*1485.0*53.0*xyz^52.0+xy012^23.0*2524.5*32.0*xyz^31.0+x0^2.0*x0*x0*109.0*xyz^108.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^23.0*32886.0*xyz^26.0-xy012^21.0*78705.0*xyz^52.0+xy012^23.0*80784.0*xyz^31.0+x0^2.0*x0*x0*109.0*xyz^108.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^23.0*0.0016129032258064516*xyz^31.0-xy012^21.0*1.5664160401002505E-4*xyz^57.0-4.0*xyz^57.0+xy012^23.0*0.0017857142857142854*xyz^36.0+x0^2.0*x0*x0/16874.666666666664*xyz^113.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^23.0*0.0016129032258064516/32.0*xyz^32.0-xy012^21.0*1.5664160401002505E-4/58.0*xyz^58.0-4.0/58.0*xyz^58.0+xy012^23.0*0.0017857142857142854/37.0*xyz^37.0+x0^2.0*x0*x0/16874.666666666664/114.0*xyz^114.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^23.0*5.040322580645161E-5*xyz^32.0-xy012^21.0/370272.0*xyz^58.0-1.0/14.5*xyz^58.0-0.06896551724137931*xyz^58.0+xy012^23.0*4.8262548262548256E-5*xyz^37.0+x0^2.0*x0*x0/1923711.9999999998*xyz^114.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^23.0*32886.0*xyz^26.0-xy012^21.0*78705.0*xyz^52.0+xy012^23.0*80784.0*xyz^31.0+x0^2.0*x0*x0*109.0*xyz^108.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^23.0*32886.0*26.0*xyz^25.0-xy012^21.0*78705.0*52.0*xyz^51.0+xy012^23.0*80784.0*31.0*xyz^30.0+x0^2.0*x0*x0*108.0*xyz^107.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^23.0*855036.0*xyz^25.0-xy012^21.0*4092660.0*xyz^51.0+xy012^23.0*2504304.0*xyz^30.0+x0^2.0*x0*x0*108.0*xyz^107.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^23.0*5.040322580645161E-5*xyz^32.0-5.0*xyz^32.0-xy012^21.0/370272.0*xyz^58.0-1.0/14.5*xyz^58.0-0.06896551724137931*xyz^58.0+xy012^23.0*4.8262548262548256E-5*xyz^37.0-5.0*xyz^37.0+x0^2.0*x0*x0/1923711.9999999998*xyz^114.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^23.0*5.040322580645161E-5/33.0*xyz^33.0-5.0/33.0*xyz^33.0-xy012^21.0/370272.0/59.0*xyz^59.0-1.0/14.5/59.0*xyz^59.0-0.06896551724137931/59.0*xyz^59.0+xy012^23.0*4.8262548262548256E-5/38.0*xyz^38.0-5.0/38.0*xyz^38.0+x0^2.0*x0*x0/1923711.9999999998/115.0*xyz^115.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^23.0/654720.0*xyz^33.0-1.0/6.6*xyz^33.0-0.15151515151515152*xyz^33.0-xy012^21.0/2.1846048E7*xyz^59.0-1.0/855.5*xyz^59.0-0.0011689070718877848*xyz^59.0+xy012^23.0/787360.0000000001*xyz^38.0-1.0/7.6*xyz^38.0-0.13157894736842105*xyz^38.0+x0^2.0*x0*x0/2.2122687999999997E8*xyz^115.0";
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

public static void TestCaseDiff121164() {
 UsageCalculus.TestCase = 121164;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*x0^23*xyza*-1*xyza^2-1*xyza^2/2*xyza*-3*xyza^22*xyza*-3*xyza^2*1*xyza/-3*xyza^23*xy012^21*xyza/-3*xyza^2-3*xyza^2*1*xyza/2*xyza^21*xyza/2*xyza^2*-3*xyza^3*-1*xyza2*xy012^23*xyza^3*-1*xyza-1*xyza/2*xyza^2*-3*xyza^32*x0^2*-3*x0^3*1*x0/-3*x0^23*xyza^31*xyza/-3*xyza^2-3*x0^2*-1*x0^3*2*x01*xyza^3*2*xyza/3*xyza^2*--1*xyza^32*x0^2*-3*x03*xyza*-1*xyza^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=163 EqnNumber=66 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[27, 66, 16, 17, 4, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 3, 1, 1, 5, 3, 4, 9, 1, 2, 3, 4, 9, 1, 1, 7, 4, 9, 10, 11, 20]"+
"// DOEMatrixRow=[59, 68, 18, 1, 1, 2, 3, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 18, 7, 3, 1, 3, 1, 2, 6, 3, 1, 2, 1, 6, 2, 9, 6]"+
//Tail EqnIndex=163 EqnNumber=66 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[27, 66, 16, 17, 4, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 3, 1, 1, 5, 3, 4, 9, 1, 2, 3, 4, 9, 1, 1, 7, 4, 9, 10, 11, 20]"+
"// DOEMatrixRow=[59, 68, 18, 1, 1, 2, 3, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 18, 7, 3, 1, 3, 1, 2, 6, 3, 1, 2, 1, 6, 2, 9, 6]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^23.0*2.0*xyza^3.0-xy012^21.0/2.0*xyza^55.0+xy012^23.0*2.25*xyza^34.0-x0^2.0*x0/2.0*xyza^69.0+x0^2.0*x01*x03*12.0*xyza^41.0-x0^2.0*x03*3.0*xyza^35.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^23.0*2.0*3.0*xyza^2.0-xy012^21.0/2.0*55.0*xyza^54.0+xy012^23.0*2.25*34.0*xyza^33.0-x0^2.0*x0/2.0*69.0*xyza^68.0+x0^2.0*x01*x03*12.0*41.0*xyza^40.0-x0^2.0*x03*35.0*xyza^34.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^23.0*6.0*xyza^2.0-xy012^21.0*27.5*xyza^54.0+xy012^23.0*76.5*xyza^33.0-x0^2.0*x0*34.5*xyza^68.0+x0^2.0*x01*x03*492.0*xyza^40.0-x0^2.0*x03*35.0*xyza^34.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^23.0*2.0*xyza^3.0-xy012^21.0/2.0*xyza^55.0+xy012^23.0*2.25*xyza^34.0-x0^2.0*x0/2.0*xyza^69.0+x0^2.0*x01*x03*12.0*xyza^41.0-x0^2.0*x03*3.0*xyza^35.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^23.0*2.0/4.0*xyza^4.0-xy012^21.0/2.0/56.0*xyza^56.0+xy012^23.0*2.25/35.0*xyza^35.0-x0^2.0*x0/2.0/70.0*xyza^70.0+x0^2.0*x01*x03*12.0/42.0*xyza^42.0-x0^2.0*x03*3.0/36.0*xyza^36.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^23.0*0.5*xyza^4.0-xy012^21.0*0.008928571428571428*xyza^56.0+xy012^23.0*0.06428571428571428*xyza^35.0-x0^2.0*x0*0.007142857142857143*xyza^70.0+x0^2.0*x01*x03*0.2857142857142857*xyza^42.0-x0^2.0*x03/12.0*xyza^36.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^23.0*6.0*xyza^2.0-xy012^21.0*27.5*xyza^54.0+xy012^23.0*76.5*xyza^33.0-x0^2.0*x0*34.5*xyza^68.0+x0^2.0*x01*x03*492.0*xyza^40.0-x0^2.0*x03*35.0*xyza^34.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^23.0*6.0*2.0*xyza^1.0-xy012^21.0*27.5*54.0*xyza^53.0+xy012^23.0*76.5*33.0*xyza^32.0-x0^2.0*x0*34.5*68.0*xyza^67.0+x0^2.0*x01*x03*492.0*40.0*xyza^39.0-x0^2.0*x03*34.0*xyza^33.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^23.0*12.0*xyza-xy012^21.0*1485.0*xyza^53.0+xy012^23.0*2524.5*xyza^32.0-x0^2.0*x0*2346.0*xyza^67.0+x0^2.0*x01*x03*19680.0*xyza^39.0-x0^2.0*x03*34.0*xyza^33.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^23.0*0.5*xyza^4.0-xy012^21.0*0.008928571428571428*xyza^56.0+xy012^23.0*0.06428571428571428*xyza^35.0-x0^2.0*x0*0.007142857142857143*xyza^70.0+x0^2.0*x01*x03*0.2857142857142857*xyza^42.0-x0^2.0*x03/12.0*xyza^36.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^23.0*0.5/5.0*xyza^5.0-xy012^21.0*0.008928571428571428/57.0*xyza^57.0+xy012^23.0*0.06428571428571428/36.0*xyza^36.0-x0^2.0*x0*0.007142857142857143/71.0*xyza^71.0+x0^2.0*x01*x03*0.2857142857142857/43.0*xyza^43.0-x0^2.0*x03/12.0/37.0*xyza^37.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^23.0*0.1*xyza^5.0-xy012^21.0*1.5664160401002505E-4*xyza^57.0+xy012^23.0*0.0017857142857142854*xyza^36.0-x0^2.0*x0*1.0060362173038229E-4*xyza^71.0+x0^2.0*x01*x03*0.0066445182724252485*xyza^43.0-x0^2.0*x03/444.0*xyza^37.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^23.0*12.0*xyza-xy012^21.0*1485.0*xyza^53.0+xy012^23.0*2524.5*xyza^32.0-x0^2.0*x0*2346.0*xyza^67.0+x0^2.0*x01*x03*19680.0*xyza^39.0-x0^2.0*x03*34.0*xyza^33.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^23.0*12.0-xy012^21.0*1485.0*53.0*xyza^52.0+xy012^23.0*2524.5*32.0*xyza^31.0-x0^2.0*x0*2346.0*67.0*xyza^66.0+x0^2.0*x01*x03*19680.0*39.0*xyza^38.0-x0^2.0*x03*33.0*xyza^32.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^23.0*12.0-xy012^21.0*78705.0*xyza^52.0+xy012^23.0*80784.0*xyza^31.0-x0^2.0*x0*157182.0*xyza^66.0+x0^2.0*x01*x03*767520.0*xyza^38.0-x0^2.0*x03*33.0*xyza^32.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^23.0*0.1*xyza^5.0-xy012^21.0*1.5664160401002505E-4*xyza^57.0-4.0*xyza^57.0+xy012^23.0*0.0017857142857142854*xyza^36.0-x0^2.0*x0*1.0060362173038229E-4*xyza^71.0-4.0*xyza^71.0+x0^2.0*x01*x03*0.0066445182724252485*xyza^43.0-x0^2.0*x03/444.0*xyza^37.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^23.0*0.1/6.0*xyza^6.0-xy012^21.0*1.5664160401002505E-4/58.0*xyza^58.0-4.0/58.0*xyza^58.0+xy012^23.0*0.0017857142857142854/37.0*xyza^37.0-x0^2.0*x0*1.0060362173038229E-4/72.0*xyza^72.0-4.0/72.0*xyza^72.0+x0^2.0*x01*x03*0.0066445182724252485/44.0*xyza^44.0-x0^2.0*x03/444.0/38.0*xyza^38.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^23.0*0.016666666666666666*xyza^6.0-xy012^21.0/370272.0*xyza^58.0-1.0/14.5*xyza^58.0-0.06896551724137931*xyza^58.0+xy012^23.0*4.8262548262548256E-5*xyza^37.0-x0^2.0*x0/715680.0*xyza^72.0-1.0/18.0*xyza^72.0-0.05555555555555555*xyza^72.0+x0^2.0*x01*x03*1.5101177891875563E-4*xyza^44.0-x0^2.0*x03/16872.0*xyza^38.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^23.0*12.0-xy012^21.0*78705.0*xyza^52.0+xy012^23.0*80784.0*xyza^31.0-x0^2.0*x0*157182.0*xyza^66.0+x0^2.0*x01*x03*767520.0*xyza^38.0-x0^2.0*x03*33.0*xyza^32.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^23.0*12.0*0.0-xy012^21.0*78705.0*52.0*xyza^51.0+xy012^23.0*80784.0*31.0*xyza^30.0-x0^2.0*x0*157182.0*66.0*xyza^65.0+x0^2.0*x01*x03*767520.0*38.0*xyza^37.0-x0^2.0*x03*32.0*xyza^31.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^23.0*0.0-xy012^21.0*4092660.0*xyza^51.0+xy012^23.0*2504304.0*xyza^30.0-x0^2.0*x0*1.0374012E7*xyza^65.0+x0^2.0*x01*x03*2.916576E7*xyza^37.0-x0^2.0*x03*32.0*xyza^31.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^23.0*0.016666666666666666*xyza^6.0-xy012^21.0/370272.0*xyza^58.0-1.0/14.5*xyza^58.0-0.06896551724137931*xyza^58.0+xy012^23.0*4.8262548262548256E-5*xyza^37.0-5.0*xyza^37.0-x0^2.0*x0/715680.0*xyza^72.0-1.0/18.0*xyza^72.0-0.05555555555555555*xyza^72.0+x0^2.0*x01*x03*1.5101177891875563E-4*xyza^44.0-4.0*xyza^44.0-x0^2.0*x03/16872.0*xyza^38.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^23.0*0.016666666666666666/7.0*xyza^7.0-xy012^21.0/370272.0/59.0*xyza^59.0-1.0/14.5/59.0*xyza^59.0-0.06896551724137931/59.0*xyza^59.0+xy012^23.0*4.8262548262548256E-5/38.0*xyza^38.0-5.0/38.0*xyza^38.0-x0^2.0*x0/715680.0/73.0*xyza^73.0-1.0/18.0/73.0*xyza^73.0-0.05555555555555555/73.0*xyza^73.0+x0^2.0*x01*x03*1.5101177891875563E-4/45.0*xyza^45.0-4.0/45.0*xyza^45.0-x0^2.0*x03/16872.0/39.0*xyza^39.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^23.0*0.0023809523809523807*xyza^7.0-xy012^21.0/2.1846048E7*xyza^59.0-1.0/855.5*xyza^59.0-0.0011689070718877848*xyza^59.0+xy012^23.0/787360.0000000001*xyza^38.0-1.0/7.6*xyza^38.0-0.13157894736842105*xyza^38.0-x0^2.0*x0/5.224464E7*xyza^73.0-1.0/1314.0*xyza^73.0-7.6103500761035E-4*xyza^73.0+x0^2.0*x01*x03/297990.00000000006*xyza^45.0-1.0/11.25*xyza^45.0-0.08888888888888889*xyza^45.0-x0^2.0*x03/658008.0*xyza^39.0";
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

public static void TestCaseDiff121165() {
 UsageCalculus.TestCase = 121165;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*x*-1*x^2-1*x^2/2*x*-3*x^22*x*-3*x^2*1*x/-3*x^23*xy012^21*x/-3*x^2-3*x^2*1*x/2*x^21*x/2*x^2*-3*x^3*-1*x2*xy012^23*x^3*-1*x-1*x/2*x^2*-3*x^32*x0^2*-3*x0^3*1*x0/-3*x0^23*x^31*x/-3*x^2-3*x0^2*-1*x0^3*2*x01*x^3*2*x/3*x^2*--1*x^32*x3*x0^2*--1*x0^33*x*-1*x^2-1*x^2/2*x";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=164 EqnNumber=67 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[92, 67, 17, 18, 1, 3, 1, 3, 1, 3, 4, 1, 1, 2, 3, 1, 2, 1, 1, 1, 1, 10, 2, 3, 1, 1, 10, 2, 3, 8, 1, 10, 11, 12, 21]"+
"// DOEMatrixRow=[23, 69, 19, 2, 3, 1, 1, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 19, 8, 1, 2, 4, 2, 3, 1, 4, 2, 3, 2, 7, 1, 10, 7]"+
//Tail EqnIndex=164 EqnNumber=67 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[92, 67, 17, 18, 1, 3, 1, 3, 1, 3, 4, 1, 1, 2, 3, 1, 2, 1, 1, 1, 1, 10, 2, 3, 1, 1, 10, 2, 3, 8, 1, 10, 11, 12, 21]"+
"// DOEMatrixRow=[23, 69, 19, 2, 3, 1, 1, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 19, 8, 1, 2, 4, 2, 3, 1, 4, 2, 3, 2, 7, 1, 10, 7]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-3.0*x^3.0-1.0/2.0*x^55.0+2.25*x^34.0-1.0/2.0*x^69.0+4.0*x^41.0-x^35.0+x^3.0-1.0/2.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-3.0*3.0*x^2.0-1.0/2.0*55.0*x^54.0+2.25*34.0*x^33.0-1.0/2.0*69.0*x^68.0+4.0*41.0*x^40.0-35.0*x^34.0+3.0*x^2.0-1.0/2.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-9.0*x^2.0-27.5*x^54.0+76.5*x^33.0-34.5*x^68.0+164.0*x^40.0-35.0*x^34.0+3.0*x^2.0-1.5*x^2.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-3.0*x^3.0-1.0/2.0*x^55.0+2.25*x^34.0-1.0/2.0*x^69.0+4.0*x^41.0-x^35.0+x^3.0-1.0/2.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-3.0/4.0*x^4.0-1.0/2.0/56.0*x^56.0+2.25/35.0*x^35.0-1.0/2.0/70.0*x^70.0+4.0/42.0*x^42.0-1.0/36.0*x^36.0+1.0/4.0*x^4.0-1.0/2.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/1.3333333333333333*x^4.0-1.0/112.0*x^56.0+1.0/15.555555555555555*x^35.0-1.0/140.0*x^70.0+1.0/10.5*x^42.0-1.0/36.0*x^36.0+1.0/4.0*x^4.0-1.0/8.0*x^4.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-9.0*x^2.0-27.5*x^54.0+76.5*x^33.0-34.5*x^68.0+164.0*x^40.0-35.0*x^34.0+3.0*x^2.0-1.5*x^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-9.0*2.0*x^1.0-27.5*54.0*x^53.0+76.5*33.0*x^32.0-34.5*68.0*x^67.0+164.0*40.0*x^39.0-35.0*34.0*x^33.0+3.0*2.0*x^1.0-1.5*2.0*x^1.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-18.0*x-1485.0*x^53.0+2524.5*x^32.0-2346.0*x^67.0+6560.0*x^39.0-1190.0*x^33.0+6.0*x-3.0*x";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/1.3333333333333333*x^4.0-1.0/112.0*x^56.0+1.0/15.555555555555555*x^35.0-1.0/140.0*x^70.0+1.0/10.5*x^42.0-1.0/36.0*x^36.0+1.0/4.0*x^4.0-1.0/8.0*x^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/1.3333333333333333/5.0*x^5.0-1.0/112.0/57.0*x^57.0+1.0/15.555555555555555/36.0*x^36.0-1.0/140.0/71.0*x^71.0+1.0/10.5/43.0*x^43.0-1.0/36.0/37.0*x^37.0+1.0/4.0/5.0*x^5.0-1.0/8.0/5.0*x^5.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/6.666666666666666*x^5.0-1.0/6384.0*x^57.0+1.0/560.0*x^36.0-1.0/9940.0*x^71.0+1.0/451.5*x^43.0-1.0/1332.0*x^37.0+1.0/20.0*x^5.0-1.0/40.0*x^5.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-18.0*x-1485.0*x^53.0+2524.5*x^32.0-2346.0*x^67.0+6560.0*x^39.0-1190.0*x^33.0+6.0*x-3.0*x";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-18.0-1485.0*53.0*x^52.0+2524.5*32.0*x^31.0-2346.0*67.0*x^66.0+6560.0*39.0*x^38.0-1190.0*33.0*x^32.0+6.0-3.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-18.0-78705.0*x^52.0+80784.0*x^31.0-157182.0*x^66.0+255840.0*x^38.0-39270.0*x^32.0+6.0-3.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/6.666666666666666*x^5.0-1.0/6384.0*x^57.0+1.0/560.0*x^36.0-1.0/9940.0*x^71.0+1.0/451.5*x^43.0-1.0/1332.0*x^37.0+1.0/20.0*x^5.0-1.0/40.0*x^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/6.666666666666666/6.0*x^6.0-1.0/6384.0/58.0*x^58.0+1.0/560.0/37.0*x^37.0-1.0/9940.0/72.0*x^72.0+1.0/451.5/44.0*x^44.0-1.0/1332.0/38.0*x^38.0+1.0/20.0/6.0*x^6.0-1.0/40.0/6.0*x^6.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/40.0*x^6.0-1.0/370272.0*x^58.0+1.0/20720.0*x^37.0-1.0/715680.0*x^72.0+1.0/19866.0*x^44.0-1.0/50616.0*x^38.0+1.0/120.0*x^6.0-1.0/240.0*x^6.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-18.0-78705.0*x^52.0+80784.0*x^31.0-157182.0*x^66.0+255840.0*x^38.0-39270.0*x^32.0+6.0-3.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0-78705.0*52.0*x^51.0+80784.0*31.0*x^30.0-157182.0*66.0*x^65.0+255840.0*38.0*x^37.0-39270.0*32.0*x^31.0+6.0*0.0-3.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-4092660.0*x^51.0+2504304.0*x^30.0-1.0374012E7*x^65.0+9721920.0*x^37.0-1256640.0*x^31.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/40.0*x^6.0-1.0/370272.0*x^58.0+1.0/20720.0*x^37.0-1.0/715680.0*x^72.0+1.0/19866.0*x^44.0-1.0/50616.0*x^38.0+1.0/120.0*x^6.0-1.0/240.0*x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/40.0/7.0*x^7.0-1.0/370272.0/59.0*x^59.0+1.0/20720.0/38.0*x^38.0-1.0/715680.0/73.0*x^73.0+1.0/19866.0/45.0*x^45.0-1.0/50616.0/39.0*x^39.0+1.0/120.0/7.0*x^7.0-1.0/240.0/7.0*x^7.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/280.0*x^7.0-1.0/2.1846048E7*x^59.0+1.0/787360.0*x^38.0-1.0/5.224464E7*x^73.0+1.0/893970.0*x^45.0-1.0/1974024.0*x^39.0+1.0/840.0*x^7.0-1.0/1680.0*x^7.0";
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

public static void TestCaseDiff121166() {
 UsageCalculus.TestCase = 121166;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-1*xy^2/2*xy*-3*xy^22*xy*-3*xy^2*1*xy/-3*xy^23*xy012^21*xy/-3*xy^2-3*xy^2*1*xy/2*xy^21*xy/2*xy^2*-3*xy^3*-1*xy2*xy012^23*xy^3*-1*xy-1*xy/2*xy^2*-3*xy^32*x0^2*-3*x0^3*1*x0/-3*x0^23*xy^31*xy/-3*xy^2-3*x0^2*-1*x0^3*2*x01*xy^3*2*xy/3*xy^2*--1*xy^32*xy3*x0^2*--1*x0^3-1*xy^3*2*xy/3*xy^22*xy/3*xy^2*-1*xy^3*-3*xy-1*xy^2/2*xy2*xy*-3*xy^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=165 EqnNumber=68 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[58, 68, 18, 19, 2, 1, 2, 4, 2, 4, 1, 2, 3, 1, 4, 2, 3, 2, 3, 2, 3, 11, 3, 1, 2, 3, 11, 3, 4, 9, 2, 11, 12, 13, 22]"+
"// DOEMatrixRow=[88, 70, 20, 3, 1, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 3, 1, 20, 9, 2, 3, 5, 3, 1, 2, 1, 3, 1, 3, 8, 2, 11, 8]"+
//Tail EqnIndex=165 EqnNumber=68 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[58, 68, 18, 19, 2, 1, 2, 4, 2, 4, 1, 2, 3, 1, 4, 2, 3, 2, 3, 2, 3, 11, 3, 1, 2, 3, 11, 3, 4, 9, 2, 11, 12, 13, 22]"+
"// DOEMatrixRow=[88, 70, 20, 3, 1, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 3, 1, 20, 9, 2, 3, 5, 3, 1, 2, 1, 3, 1, 3, 8, 2, 11, 8]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-1.0/2.0*xy^55.0+2.25*xy^34.0-x0^2.0*x0/2.0*xy^69.0+x0^2.0*4.0*xy^38.0-x0^2.0*xy^32.0-x0^3.0-1.0/1.5*xy^33.0+1.5*xy^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-1.0/2.0*55.0*xy^54.0+2.25*34.0*xy^33.0-x0^2.0*x0/2.0*69.0*xy^68.0+x0^2.0*4.0*38.0*xy^37.0-x0^2.0*32.0*xy^31.0-x0^3.0*0.0-1.0/1.5*33.0*xy^32.0+1.5*5.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-27.5*xy^54.0+76.5*xy^33.0-x0^2.0*x0*34.5*xy^68.0+x0^2.0*152.0*xy^37.0-x0^2.0*32.0*xy^31.0-x0^3.0*0.0-22.0*xy^32.0+7.5*xy^4.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-1.0/2.0*xy^55.0+2.25*xy^34.0-x0^2.0*x0/2.0*xy^69.0+x0^2.0*4.0*xy^38.0-x0^2.0*xy^32.0-x0^3.0-1.0/1.5*xy^33.0+1.5*xy^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.0/2.0/56.0*xy^56.0+2.25/35.0*xy^35.0-x0^2.0*x0/2.0/70.0*xy^70.0+x0^2.0*4.0/39.0*xy^39.0-x0^2.0/33.0*xy^33.0-x0^3.0*xy-1.0/1.5/34.0*xy^34.0+1.5/6.0*xy^6.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/112.0*xy^56.0+0.06428571428571428*xy^35.0-x0^2.0*x0*0.007142857142857143*xy^70.0+x0^2.0*0.10256410256410256*xy^39.0-x0^2.0/33.0*xy^33.0-x0^3.0*xy-1.0/51.0*xy^34.0+1.0/4.0*xy^6.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-27.5*xy^54.0+76.5*xy^33.0-x0^2.0*x0*34.5*xy^68.0+x0^2.0*152.0*xy^37.0-x0^2.0*32.0*xy^31.0-x0^3.0*0.0-22.0*xy^32.0+7.5*xy^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-27.5*54.0*xy^53.0+76.5*33.0*xy^32.0-x0^2.0*x0*34.5*68.0*xy^67.0+x0^2.0*152.0*37.0*xy^36.0-x0^2.0*32.0*31.0*xy^30.0-x0^3.0*0.0*0.0-22.0*32.0*xy^31.0+7.5*4.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-1485.0*xy^53.0+2524.5*xy^32.0-x0^2.0*x0*2346.0*xy^67.0+x0^2.0*5624.0*xy^36.0-x0^2.0*992.0*xy^30.0-x0^3.0*0.0-704.0*xy^31.0+30.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/112.0*xy^56.0+0.06428571428571428*xy^35.0-x0^2.0*x0*0.007142857142857143*xy^70.0+x0^2.0*0.10256410256410256*xy^39.0-x0^2.0/33.0*xy^33.0-x0^3.0*xy-1.0/51.0*xy^34.0+1.0/4.0*xy^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/112.0/57.0*xy^57.0+0.06428571428571428/36.0*xy^36.0-x0^2.0*x0*0.007142857142857143/71.0*xy^71.0+x0^2.0*0.10256410256410256/40.0*xy^40.0-x0^2.0/33.0/34.0*xy^34.0-x0^3.0/2.0*xy^2.0-1.0/51.0/35.0*xy^35.0+1.0/4.0/7.0*xy^7.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/6384.0*xy^57.0+0.0017857142857142854*xy^36.0-x0^2.0*x0*1.0060362173038229E-4*xy^71.0+x0^2.0*0.002564102564102564*xy^40.0-x0^2.0*8.9126559714795E-4*xy^34.0-x0^3.0/2.0*xy^2.0-1.0/1785.0*xy^35.0+1.0/28.0*xy^7.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-1485.0*xy^53.0+2524.5*xy^32.0-x0^2.0*x0*2346.0*xy^67.0+x0^2.0*5624.0*xy^36.0-x0^2.0*992.0*xy^30.0-x0^3.0*0.0-704.0*xy^31.0+30.0*xy^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-1485.0*53.0*xy^52.0+2524.5*32.0*xy^31.0-x0^2.0*x0*2346.0*67.0*xy^66.0+x0^2.0*5624.0*36.0*xy^35.0-x0^2.0*992.0*30.0*xy^29.0-x0^3.0*0.0*0.0-704.0*31.0*xy^30.0+30.0*3.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-78705.0*xy^52.0+80784.0*xy^31.0-x0^2.0*x0*157182.0*xy^66.0+x0^2.0*202464.0*xy^35.0-x0^2.0*29760.0*xy^29.0-x0^3.0*0.0-21824.0*xy^30.0+90.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/6384.0*xy^57.0+0.0017857142857142854*xy^36.0-x0^2.0*x0*1.0060362173038229E-4*xy^71.0-4.0*xy^71.0+x0^2.0*0.002564102564102564*xy^40.0-x0^2.0*8.9126559714795E-4*xy^34.0-4.0*xy^34.0-x0^3.0/2.0*xy^2.0-1.0/1785.0*xy^35.0+1.0/28.0*xy^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/6384.0/58.0*xy^58.0+0.0017857142857142854/37.0*xy^37.0-x0^2.0*x0*1.0060362173038229E-4/72.0*xy^72.0-4.0/72.0*xy^72.0+x0^2.0*0.002564102564102564/41.0*xy^41.0-x0^2.0*8.9126559714795E-4/35.0*xy^35.0-4.0/35.0*xy^35.0-x0^3.0/2.0/3.0*xy^3.0-1.0/1785.0/36.0*xy^36.0+1.0/28.0/8.0*xy^8.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/370272.0*xy^58.0+4.8262548262548256E-5*xy^37.0-x0^2.0*x0/715680.0*xy^72.0-1.0/18.0*xy^72.0-0.05555555555555555*xy^72.0+x0^2.0*6.253908692933083E-5*xy^41.0-x0^2.0/39270.0*xy^35.0-1.0/8.75*xy^35.0-0.11428571428571428*xy^35.0-x0^3.0/6.0*xy^3.0-1.0/64260.0*xy^36.0+1.0/224.0*xy^8.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-78705.0*xy^52.0+80784.0*xy^31.0-x0^2.0*x0*157182.0*xy^66.0+x0^2.0*202464.0*xy^35.0-x0^2.0*29760.0*xy^29.0-x0^3.0*0.0-21824.0*xy^30.0+90.0*xy^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-78705.0*52.0*xy^51.0+80784.0*31.0*xy^30.0-x0^2.0*x0*157182.0*66.0*xy^65.0+x0^2.0*202464.0*35.0*xy^34.0-x0^2.0*29760.0*29.0*xy^28.0-x0^3.0*0.0*0.0-21824.0*30.0*xy^29.0+90.0*2.0*xy^1.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-4092660.0*xy^51.0+2504304.0*xy^30.0-x0^2.0*x0*1.0374012E7*xy^65.0+x0^2.0*7086240.0*xy^34.0-x0^2.0*863040.0*xy^28.0-x0^3.0*0.0-654720.0*xy^29.0+180.0*xy";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/370272.0*xy^58.0+4.8262548262548256E-5*xy^37.0-5.0*xy^37.0-x0^2.0*x0/715680.0*xy^72.0-1.0/18.0*xy^72.0-0.05555555555555555*xy^72.0+x0^2.0*6.253908692933083E-5*xy^41.0-5.0*xy^41.0-x0^2.0/39270.0*xy^35.0-1.0/8.75*xy^35.0-0.11428571428571428*xy^35.0-x0^3.0/6.0*xy^3.0-1.0/64260.0*xy^36.0+1.0/224.0*xy^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/370272.0/59.0*xy^59.0+4.8262548262548256E-5/38.0*xy^38.0-5.0/38.0*xy^38.0-x0^2.0*x0/715680.0/73.0*xy^73.0-1.0/18.0/73.0*xy^73.0-0.05555555555555555/73.0*xy^73.0+x0^2.0*6.253908692933083E-5/42.0*xy^42.0-5.0/42.0*xy^42.0-x0^2.0/39270.0/36.0*xy^36.0-1.0/8.75/36.0*xy^36.0-0.11428571428571428/36.0*xy^36.0-x0^3.0/6.0/4.0*xy^4.0-1.0/64260.0/37.0*xy^37.0+1.0/224.0/9.0*xy^9.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/2.1846048E7*xy^59.0+1.0/787360.0000000001*xy^38.0-1.0/7.6*xy^38.0-0.13157894736842105*xy^38.0-x0^2.0*x0/5.224464E7*xy^73.0-1.0/1314.0*xy^73.0-7.6103500761035E-4*xy^73.0+x0^2.0/671580.0*xy^42.0-1.0/8.4*xy^42.0-0.11904761904761904*xy^42.0-x0^2.0/1413720.0*xy^36.0-1.0/315.0*xy^36.0-0.0031746031746031746*xy^36.0-x0^3.0/24.0*xy^4.0-1.0/2377620.0*xy^37.0+1.0/2016.0*xy^9.0";
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

public static void TestCaseDiff121167() {
 UsageCalculus.TestCase = 121167;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xyz*-3*xyz^2*1*xyz/-3*xyz^23*xy012^21*xyz/-3*xyz^2-3*xyz^2*1*xyz/2*xyz^21*xyz/2*xyz^2*-3*xyz^3*-1*xyz2*xy012^23*xyz^3*-1*xyz-1*xyz/2*xyz^2*-3*xyz^32*x0^2*-3*x0^3*1*x0/-3*x0^23*xyz^31*xyz/-3*xyz^2-3*x0^2*-1*x0^3*2*x01*xyz^3*2*xyz/3*xyz^2*--1*xyz^32*xyz3*x0^2*--1*x0^3-1*xyz^3*2*xyz/3*xyz^22*xyz/3*xyz^2*-1*xyz^3*-3*xyz3*x0^21*xyz^3*-3*xyz2*xyz*-3*xyz^23*xy012^2*1*xy012";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=166 EqnNumber=69 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[22, 69, 19, 20, 3, 2, 3, 5, 3, 1, 2, 1, 1, 2, 1, 3, 1, 1, 4, 3, 4, 12, 1, 2, 3, 4, 12, 1, 1, 10, 3, 12, 13, 14, 23]"+
"// DOEMatrixRow=[54, 71, 1, 4, 2, 3, 1, 3, 1, 3, 4, 1, 1, 2, 3, 1, 2, 21, 10, 3, 1, 1, 1, 2, 3, 2, 1, 2, 4, 9, 1, 12, 9]"+
//Tail EqnIndex=166 EqnNumber=69 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[22, 69, 19, 20, 3, 2, 3, 5, 3, 1, 2, 1, 1, 2, 1, 3, 1, 1, 4, 3, 4, 12, 1, 2, 3, 4, 12, 1, 1, 10, 3, 12, 13, 14, 23]"+
"// DOEMatrixRow=[54, 71, 1, 4, 2, 3, 1, 3, 1, 3, 4, 1, 1, 2, 3, 1, 2, 21, 10, 3, 1, 1, 1, 2, 3, 2, 1, 2, 4, 9, 1, 12, 9]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-xy012^21.0/1.5*xyz^30.0+xy012^23.0*2.25*xyz^34.0-x0^2.0*x0/2.0*xyz^69.0+x0^2.0*4.0*xyz^38.0-x0^2.0*xyz^32.0-x0^3.0-xy012^2.0*xy012*6.0*xyz^59.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-xy012^21.0/1.5*30.0*xyz^29.0+xy012^23.0*2.25*34.0*xyz^33.0-x0^2.0*x0/2.0*69.0*xyz^68.0+x0^2.0*4.0*38.0*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0-xy012^2.0*xy012*59.0*xyz^58.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-xy012^21.0*20.0*xyz^29.0+xy012^23.0*76.5*xyz^33.0-x0^2.0*x0*34.5*xyz^68.0+x0^2.0*152.0*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0-xy012^2.0*xy012*59.0*xyz^58.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-xy012^21.0/1.5*xyz^30.0+xy012^23.0*2.25*xyz^34.0-x0^2.0*x0/2.0*xyz^69.0+x0^2.0*4.0*xyz^38.0-x0^2.0*xyz^32.0-x0^3.0-xy012^2.0*xy012*6.0*xyz^59.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-xy012^21.0/1.5/31.0*xyz^31.0+xy012^23.0*2.25/35.0*xyz^35.0-x0^2.0*x0/2.0/70.0*xyz^70.0+x0^2.0*4.0/39.0*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz-xy012^2.0*xy012*6.0/60.0*xyz^60.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-xy012^21.0*0.021505376344086023*xyz^31.0+xy012^23.0*0.06428571428571428*xyz^35.0-x0^2.0*x0*0.007142857142857143*xyz^70.0+x0^2.0*0.10256410256410256*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz-xy012^2.0*xy012/10.0*xyz^60.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-xy012^21.0*20.0*xyz^29.0+xy012^23.0*76.5*xyz^33.0-x0^2.0*x0*34.5*xyz^68.0+x0^2.0*152.0*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0-xy012^2.0*xy012*59.0*xyz^58.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-xy012^21.0*20.0*29.0*xyz^28.0+xy012^23.0*76.5*33.0*xyz^32.0-x0^2.0*x0*34.5*68.0*xyz^67.0+x0^2.0*152.0*37.0*xyz^36.0-x0^2.0*32.0*31.0*xyz^30.0-x0^3.0*0.0*0.0-xy012^2.0*xy012*58.0*xyz^57.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-xy012^21.0*580.0*xyz^28.0+xy012^23.0*2524.5*xyz^32.0-x0^2.0*x0*2346.0*xyz^67.0+x0^2.0*5624.0*xyz^36.0-x0^2.0*992.0*xyz^30.0-x0^3.0*0.0-xy012^2.0*xy012*58.0*xyz^57.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-xy012^21.0*0.021505376344086023*xyz^31.0+xy012^23.0*0.06428571428571428*xyz^35.0-x0^2.0*x0*0.007142857142857143*xyz^70.0+x0^2.0*0.10256410256410256*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz-xy012^2.0*xy012/10.0*xyz^60.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-xy012^21.0*0.021505376344086023/32.0*xyz^32.0+xy012^23.0*0.06428571428571428/36.0*xyz^36.0-x0^2.0*x0*0.007142857142857143/71.0*xyz^71.0+x0^2.0*0.10256410256410256/40.0*xyz^40.0-x0^2.0/33.0/34.0*xyz^34.0-x0^3.0/2.0*xyz^2.0-xy012^2.0*xy012/10.0/61.0*xyz^61.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-xy012^21.0*6.720430107526882E-4*xyz^32.0+xy012^23.0*0.0017857142857142854*xyz^36.0-x0^2.0*x0*1.0060362173038229E-4*xyz^71.0+x0^2.0*0.002564102564102564*xyz^40.0-x0^2.0*8.9126559714795E-4*xyz^34.0-x0^3.0/2.0*xyz^2.0-xy012^2.0*xy012/610.0*xyz^61.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-xy012^21.0*580.0*xyz^28.0+xy012^23.0*2524.5*xyz^32.0-x0^2.0*x0*2346.0*xyz^67.0+x0^2.0*5624.0*xyz^36.0-x0^2.0*992.0*xyz^30.0-x0^3.0*0.0-xy012^2.0*xy012*58.0*xyz^57.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-xy012^21.0*580.0*28.0*xyz^27.0+xy012^23.0*2524.5*32.0*xyz^31.0-x0^2.0*x0*2346.0*67.0*xyz^66.0+x0^2.0*5624.0*36.0*xyz^35.0-x0^2.0*992.0*30.0*xyz^29.0-x0^3.0*0.0*0.0-xy012^2.0*xy012*57.0*xyz^56.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-xy012^21.0*16240.0*xyz^27.0+xy012^23.0*80784.0*xyz^31.0-x0^2.0*x0*157182.0*xyz^66.0+x0^2.0*202464.0*xyz^35.0-x0^2.0*29760.0*xyz^29.0-x0^3.0*0.0-xy012^2.0*xy012*57.0*xyz^56.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-xy012^21.0*6.720430107526882E-4*xyz^32.0-4.0*xyz^32.0+xy012^23.0*0.0017857142857142854*xyz^36.0-x0^2.0*x0*1.0060362173038229E-4*xyz^71.0-4.0*xyz^71.0+x0^2.0*0.002564102564102564*xyz^40.0-x0^2.0*8.9126559714795E-4*xyz^34.0-4.0*xyz^34.0-x0^3.0/2.0*xyz^2.0-xy012^2.0*xy012/610.0*xyz^61.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-xy012^21.0*6.720430107526882E-4/33.0*xyz^33.0-4.0/33.0*xyz^33.0+xy012^23.0*0.0017857142857142854/37.0*xyz^37.0-x0^2.0*x0*1.0060362173038229E-4/72.0*xyz^72.0-4.0/72.0*xyz^72.0+x0^2.0*0.002564102564102564/41.0*xyz^41.0-x0^2.0*8.9126559714795E-4/35.0*xyz^35.0-4.0/35.0*xyz^35.0-x0^3.0/2.0/3.0*xyz^3.0-xy012^2.0*xy012/610.0/62.0*xyz^62.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-xy012^21.0/49103.99999999999*xyz^33.0-1.0/8.25*xyz^33.0-0.12121212121212122*xyz^33.0+xy012^23.0*4.8262548262548256E-5*xyz^37.0-x0^2.0*x0/715680.0*xyz^72.0-1.0/18.0*xyz^72.0-0.05555555555555555*xyz^72.0+x0^2.0*6.253908692933083E-5*xyz^41.0-x0^2.0/39270.0*xyz^35.0-1.0/8.75*xyz^35.0-0.11428571428571428*xyz^35.0-x0^3.0*0.16666666666666666*xyz^3.0-xy012^2.0*xy012/37820.0*xyz^62.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-xy012^21.0*16240.0*xyz^27.0+xy012^23.0*80784.0*xyz^31.0-x0^2.0*x0*157182.0*xyz^66.0+x0^2.0*202464.0*xyz^35.0-x0^2.0*29760.0*xyz^29.0-x0^3.0*0.0-xy012^2.0*xy012*57.0*xyz^56.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-xy012^21.0*16240.0*27.0*xyz^26.0+xy012^23.0*80784.0*31.0*xyz^30.0-x0^2.0*x0*157182.0*66.0*xyz^65.0+x0^2.0*202464.0*35.0*xyz^34.0-x0^2.0*29760.0*29.0*xyz^28.0-x0^3.0*0.0*0.0-xy012^2.0*xy012*56.0*xyz^55.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-xy012^21.0*438480.0*xyz^26.0+xy012^23.0*2504304.0*xyz^30.0-x0^2.0*x0*1.0374012E7*xyz^65.0+x0^2.0*7086240.0*xyz^34.0-x0^2.0*863040.0*xyz^28.0-x0^3.0*0.0-xy012^2.0*xy012*56.0*xyz^55.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-xy012^21.0/49103.99999999999*xyz^33.0-1.0/8.25*xyz^33.0-0.12121212121212122*xyz^33.0+xy012^23.0*4.8262548262548256E-5*xyz^37.0-5.0*xyz^37.0-x0^2.0*x0/715680.0*xyz^72.0-1.0/18.0*xyz^72.0-0.05555555555555555*xyz^72.0+x0^2.0*6.253908692933083E-5*xyz^41.0-5.0*xyz^41.0-x0^2.0/39270.0*xyz^35.0-1.0/8.75*xyz^35.0-0.11428571428571428*xyz^35.0-x0^3.0*0.16666666666666666*xyz^3.0-xy012^2.0*xy012/37820.0*xyz^62.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-xy012^21.0/49103.99999999999/34.0*xyz^34.0-1.0/8.25/34.0*xyz^34.0-0.12121212121212122/34.0*xyz^34.0+xy012^23.0*4.8262548262548256E-5/38.0*xyz^38.0-5.0/38.0*xyz^38.0-x0^2.0*x0/715680.0/73.0*xyz^73.0-1.0/18.0/73.0*xyz^73.0-0.05555555555555555/73.0*xyz^73.0+x0^2.0*6.253908692933083E-5/42.0*xyz^42.0-5.0/42.0*xyz^42.0-x0^2.0/39270.0/36.0*xyz^36.0-1.0/8.75/36.0*xyz^36.0-0.11428571428571428/36.0*xyz^36.0-x0^3.0*0.16666666666666666/4.0*xyz^4.0-xy012^2.0*xy012/37820.0/63.0*xyz^63.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-xy012^21.0/1669535.9999999998*xyz^34.0-1.0/280.5*xyz^34.0-0.0035650623885918006*xyz^34.0+xy012^23.0/787360.0000000001*xyz^38.0-1.0/7.6*xyz^38.0-0.13157894736842105*xyz^38.0-x0^2.0*x0/5.224464E7*xyz^73.0-1.0/1314.0*xyz^73.0-7.6103500761035E-4*xyz^73.0+x0^2.0/671580.0*xyz^42.0-1.0/8.4*xyz^42.0-0.11904761904761904*xyz^42.0-x0^2.0/1413720.0*xyz^36.0-1.0/315.0*xyz^36.0-0.0031746031746031746*xyz^36.0-x0^3.0*0.041666666666666664*xyz^4.0-xy012^2.0*xy012/2382660.0*xyz^63.0";
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

public static void TestCaseDiff121168() {
 UsageCalculus.TestCase = 121168;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xy012^21*xyza/-3*xyza^2-3*xyza^2*1*xyza/2*xyza^21*xyza/2*xyza^2*-3*xyza^3*-1*xyza2*xy012^23*xyza^3*-1*xyza-1*xyza/2*xyza^2*-3*xyza^32*x0^2*-3*x0^3*1*x0/-3*x0^23*xyza^31*xyza/-3*xyza^2-3*x0^2*-1*x0^3*2*x01*xyza^3*2*xyza/3*xyza^2*--1*xyza^32*xyza3*x0^2*--1*x0^3-1*xyza^3*2*xyza/3*xyza^22*xyza/3*xyza^2*-1*xyza^3*-3*xyza3*x0^21*xyza^3*-3*xyza-3*xyza/1*xyza^2*-2*xyza^31*x0^2*-2*x0^3*3*x0/-1*x0^23*xy012^2*1*xy0121*xyza/-3*xyza^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=167 EqnNumber=70 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[87, 70, 20, 1, 4, 3, 1, 6, 1, 2, 3, 2, 3, 1, 2, 1, 2, 1, 5, 1, 1, 13, 2, 3, 1, 1, 13, 2, 3, 11, 4, 13, 14, 15, 24]"+
"// DOEMatrixRow=[18, 72, 2, 1, 3, 1, 2, 4, 2, 4, 1, 2, 3, 1, 4, 2, 3, 22, 1, 1, 2, 3, 2, 3, 4, 3, 2, 3, 1, 10, 2, 13, 10]"+
//Tail EqnIndex=167 EqnNumber=70 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[87, 70, 20, 1, 4, 3, 1, 6, 1, 2, 3, 2, 3, 1, 2, 1, 2, 1, 5, 1, 1, 13, 2, 3, 1, 1, 13, 2, 3, 11, 4, 13, 14, 15, 24]"+
"// DOEMatrixRow=[18, 72, 2, 1, 3, 1, 2, 4, 2, 4, 1, 2, 3, 1, 4, 2, 3, 22, 1, 1, 2, 3, 2, 3, 4, 3, 2, 3, 1, 10, 2, 13, 10]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-xy012^21.0*xyza^3.0+xy012^23.0*2.25*xyza^34.0-x0^2.0*x0/2.0*xyza^69.0+x0^2.0*4.0*xyza^38.0-x0^2.0*xyza^32.0-x0^3.0+x0^21.0*2.0*xyza^36.0-x0^2.0*x0*xy0121*12.0*xyza^37.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-xy012^21.0*3.0*xyza^2.0+xy012^23.0*2.25*34.0*xyza^33.0-x0^2.0*x0/2.0*69.0*xyza^68.0+x0^2.0*4.0*38.0*xyza^37.0-x0^2.0*32.0*xyza^31.0-x0^3.0*0.0+x0^21.0*2.0*36.0*xyza^35.0-x0^2.0*x0*xy0121*37.0*xyza^36.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-xy012^21.0*3.0*xyza^2.0+xy012^23.0*76.5*xyza^33.0-x0^2.0*x0*34.5*xyza^68.0+x0^2.0*152.0*xyza^37.0-x0^2.0*32.0*xyza^31.0-x0^3.0*0.0+x0^21.0*72.0*xyza^35.0-x0^2.0*x0*xy0121*37.0*xyza^36.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-xy012^21.0*xyza^3.0+xy012^23.0*2.25*xyza^34.0-x0^2.0*x0/2.0*xyza^69.0+x0^2.0*4.0*xyza^38.0-x0^2.0*xyza^32.0-x0^3.0+x0^21.0*2.0*xyza^36.0-x0^2.0*x0*xy0121*12.0*xyza^37.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-xy012^21.0/4.0*xyza^4.0+xy012^23.0*2.25/35.0*xyza^35.0-x0^2.0*x0/2.0/70.0*xyza^70.0+x0^2.0*4.0/39.0*xyza^39.0-x0^2.0/33.0*xyza^33.0-x0^3.0*xyza+x0^21.0*2.0/37.0*xyza^37.0-x0^2.0*x0*xy0121*12.0/38.0*xyza^38.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-xy012^21.0/4.0*xyza^4.0+xy012^23.0*0.06428571428571428*xyza^35.0-x0^2.0*x0*0.007142857142857143*xyza^70.0+x0^2.0*0.10256410256410256*xyza^39.0-x0^2.0/33.0*xyza^33.0-x0^3.0*xyza+x0^21.0*0.05405405405405406*xyza^37.0-x0^2.0*x0*xy0121/3.1666666666666665*xyza^38.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-xy012^21.0*3.0*xyza^2.0+xy012^23.0*76.5*xyza^33.0-x0^2.0*x0*34.5*xyza^68.0+x0^2.0*152.0*xyza^37.0-x0^2.0*32.0*xyza^31.0-x0^3.0*0.0+x0^21.0*72.0*xyza^35.0-x0^2.0*x0*xy0121*37.0*xyza^36.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-xy012^21.0*3.0*2.0*xyza^1.0+xy012^23.0*76.5*33.0*xyza^32.0-x0^2.0*x0*34.5*68.0*xyza^67.0+x0^2.0*152.0*37.0*xyza^36.0-x0^2.0*32.0*31.0*xyza^30.0-x0^3.0*0.0*0.0+x0^21.0*72.0*35.0*xyza^34.0-x0^2.0*x0*xy0121*36.0*xyza^35.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-xy012^21.0*6.0*xyza+xy012^23.0*2524.5*xyza^32.0-x0^2.0*x0*2346.0*xyza^67.0+x0^2.0*5624.0*xyza^36.0-x0^2.0*992.0*xyza^30.0-x0^3.0*0.0+x0^21.0*2520.0*xyza^34.0-x0^2.0*x0*xy0121*36.0*xyza^35.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-xy012^21.0/4.0*xyza^4.0+xy012^23.0*0.06428571428571428*xyza^35.0-x0^2.0*x0*0.007142857142857143*xyza^70.0+x0^2.0*0.10256410256410256*xyza^39.0-x0^2.0/33.0*xyza^33.0-x0^3.0*xyza+x0^21.0*0.05405405405405406*xyza^37.0-x0^2.0*x0*xy0121/3.1666666666666665*xyza^38.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-xy012^21.0/4.0/5.0*xyza^5.0+xy012^23.0*0.06428571428571428/36.0*xyza^36.0-x0^2.0*x0*0.007142857142857143/71.0*xyza^71.0+x0^2.0*0.10256410256410256/40.0*xyza^40.0-x0^2.0/33.0/34.0*xyza^34.0-x0^3.0/2.0*xyza^2.0+x0^21.0*0.05405405405405406/38.0*xyza^38.0-x0^2.0*x0*xy0121/3.1666666666666665/39.0*xyza^39.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-xy012^21.0*0.05*xyza^5.0+xy012^23.0*0.0017857142857142854*xyza^36.0-x0^2.0*x0*1.0060362173038229E-4*xyza^71.0+x0^2.0*0.002564102564102564*xyza^40.0-x0^2.0*8.9126559714795E-4*xyza^34.0-x0^3.0/2.0*xyza^2.0+x0^21.0*0.001422475106685633*xyza^38.0-x0^2.0*x0*xy0121/123.5*xyza^39.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-xy012^21.0*6.0*xyza+xy012^23.0*2524.5*xyza^32.0-x0^2.0*x0*2346.0*xyza^67.0+x0^2.0*5624.0*xyza^36.0-x0^2.0*992.0*xyza^30.0-x0^3.0*0.0+x0^21.0*2520.0*xyza^34.0-x0^2.0*x0*xy0121*36.0*xyza^35.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-xy012^21.0*6.0+xy012^23.0*2524.5*32.0*xyza^31.0-x0^2.0*x0*2346.0*67.0*xyza^66.0+x0^2.0*5624.0*36.0*xyza^35.0-x0^2.0*992.0*30.0*xyza^29.0-x0^3.0*0.0*0.0+x0^21.0*2520.0*34.0*xyza^33.0-x0^2.0*x0*xy0121*35.0*xyza^34.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-xy012^21.0*6.0+xy012^23.0*80784.0*xyza^31.0-x0^2.0*x0*157182.0*xyza^66.0+x0^2.0*202464.0*xyza^35.0-x0^2.0*29760.0*xyza^29.0-x0^3.0*0.0+x0^21.0*85680.0*xyza^33.0-x0^2.0*x0*xy0121*35.0*xyza^34.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-xy012^21.0*0.05*xyza^5.0+xy012^23.0*0.0017857142857142854*xyza^36.0-x0^2.0*x0*1.0060362173038229E-4*xyza^71.0-4.0*xyza^71.0+x0^2.0*0.002564102564102564*xyza^40.0-x0^2.0*8.9126559714795E-4*xyza^34.0-4.0*xyza^34.0-x0^3.0/2.0*xyza^2.0+x0^21.0*0.001422475106685633*xyza^38.0-x0^2.0*x0*xy0121/123.5*xyza^39.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-xy012^21.0*0.05/6.0*xyza^6.0+xy012^23.0*0.0017857142857142854/37.0*xyza^37.0-x0^2.0*x0*1.0060362173038229E-4/72.0*xyza^72.0-4.0/72.0*xyza^72.0+x0^2.0*0.002564102564102564/41.0*xyza^41.0-x0^2.0*8.9126559714795E-4/35.0*xyza^35.0-4.0/35.0*xyza^35.0-x0^3.0/2.0/3.0*xyza^3.0+x0^21.0*0.001422475106685633/39.0*xyza^39.0-x0^2.0*x0*xy0121/123.5/40.0*xyza^40.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-xy012^21.0*0.008333333333333333*xyza^6.0+xy012^23.0*4.8262548262548256E-5*xyza^37.0-x0^2.0*x0/715680.0*xyza^72.0-1.0/18.0*xyza^72.0-0.05555555555555555*xyza^72.0+x0^2.0*6.253908692933083E-5*xyza^41.0-x0^2.0/39270.0*xyza^35.0-1.0/8.75*xyza^35.0-0.11428571428571428*xyza^35.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^21.0*3.6473720684247E-5*xyza^39.0-x0^2.0*x0*xy0121/4940.0*xyza^40.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-xy012^21.0*6.0+xy012^23.0*80784.0*xyza^31.0-x0^2.0*x0*157182.0*xyza^66.0+x0^2.0*202464.0*xyza^35.0-x0^2.0*29760.0*xyza^29.0-x0^3.0*0.0+x0^21.0*85680.0*xyza^33.0-x0^2.0*x0*xy0121*35.0*xyza^34.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-xy012^21.0*6.0*0.0+xy012^23.0*80784.0*31.0*xyza^30.0-x0^2.0*x0*157182.0*66.0*xyza^65.0+x0^2.0*202464.0*35.0*xyza^34.0-x0^2.0*29760.0*29.0*xyza^28.0-x0^3.0*0.0*0.0+x0^21.0*85680.0*33.0*xyza^32.0-x0^2.0*x0*xy0121*34.0*xyza^33.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-xy012^21.0*0.0+xy012^23.0*2504304.0*xyza^30.0-x0^2.0*x0*1.0374012E7*xyza^65.0+x0^2.0*7086240.0*xyza^34.0-x0^2.0*863040.0*xyza^28.0-x0^3.0*0.0+x0^21.0*2827440.0*xyza^32.0-x0^2.0*x0*xy0121*34.0*xyza^33.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-xy012^21.0*0.008333333333333333*xyza^6.0+xy012^23.0*4.8262548262548256E-5*xyza^37.0-5.0*xyza^37.0-x0^2.0*x0/715680.0*xyza^72.0-1.0/18.0*xyza^72.0-0.05555555555555555*xyza^72.0+x0^2.0*6.253908692933083E-5*xyza^41.0-5.0*xyza^41.0-x0^2.0/39270.0*xyza^35.0-1.0/8.75*xyza^35.0-0.11428571428571428*xyza^35.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^21.0*3.6473720684247E-5*xyza^39.0-5.0*xyza^39.0-x0^2.0*x0*xy0121/4940.0*xyza^40.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-xy012^21.0*0.008333333333333333/7.0*xyza^7.0+xy012^23.0*4.8262548262548256E-5/38.0*xyza^38.0-5.0/38.0*xyza^38.0-x0^2.0*x0/715680.0/73.0*xyza^73.0-1.0/18.0/73.0*xyza^73.0-0.05555555555555555/73.0*xyza^73.0+x0^2.0*6.253908692933083E-5/42.0*xyza^42.0-5.0/42.0*xyza^42.0-x0^2.0/39270.0/36.0*xyza^36.0-1.0/8.75/36.0*xyza^36.0-0.11428571428571428/36.0*xyza^36.0-x0^3.0*0.16666666666666666/4.0*xyza^4.0+x0^21.0*3.6473720684247E-5/40.0*xyza^40.0-5.0/40.0*xyza^40.0-x0^2.0*x0*xy0121/4940.0/41.0*xyza^41.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-xy012^21.0*0.0011904761904761904*xyza^7.0+xy012^23.0/787360.0000000001*xyza^38.0-1.0/7.6*xyza^38.0-0.13157894736842105*xyza^38.0-x0^2.0*x0/5.224464E7*xyza^73.0-1.0/1314.0*xyza^73.0-7.6103500761035E-4*xyza^73.0+x0^2.0/671580.0*xyza^42.0-1.0/8.4*xyza^42.0-0.11904761904761904*xyza^42.0-x0^2.0/1413720.0*xyza^36.0-1.0/315.0*xyza^36.0-0.0031746031746031746*xyza^36.0-x0^3.0*0.041666666666666664*xyza^4.0+x0^21.0/1096680.0*xyza^40.0-1.0/8.0*xyza^40.0-0.125*xyza^40.0-x0^2.0*x0*xy0121/202540.0*xyza^41.0";
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

public static void TestCaseDiff121169() {
 UsageCalculus.TestCase = 121169;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x/-3*x^21*x/-3*x^2-3*x^2*1*x";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=168 EqnNumber=71 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[53, 71, 1, 2, 1, 1, 2, 7, 2, 3, 4, 1, 1, 2, 3, 2, 3, 2, 1, 2, 3, 14, 3, 1, 2, 3, 14, 3, 4, 12, 1, 14, 15, 16, 25]"+
"// DOEMatrixRow=[83, 73, 3, 2, 1, 2, 3, 5, 3, 1, 2, 1, 1, 2, 1, 3, 1, 23, 2, 3, 1, 4, 3, 1, 5, 4, 3, 1, 2, 11, 1, 14, 11]"+
//Tail EqnIndex=168 EqnNumber=71 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[53, 71, 1, 2, 1, 1, 2, 7, 2, 3, 4, 1, 1, 2, 3, 2, 3, 2, 1, 2, 3, 14, 3, 1, 2, 3, 14, 3, 4, 12, 1, 14, 15, 16, 25]"+
"// DOEMatrixRow=[83, 73, 3, 2, 1, 2, 3, 5, 3, 1, 2, 1, 1, 2, 1, 3, 1, 23, 2, 3, 1, 4, 3, 1, 5, 4, 3, 1, 2, 11, 1, 14, 11]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "1.0/9.0*x^25.0-3.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/9.0*25.0*x^24.0-3.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[1] = "2.7777777777777777*x^24.0-9.0*x^2.0";
 UsageCalculus.EqnSolArrayMap3[1] = "1.0/9.0*x^25.0-3.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0/9.0/26.0*x^26.0-3.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/234.0*x^26.0-1.0/1.3333333333333333*x^4.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "2.7777777777777777*x^24.0-9.0*x^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "2.7777777777777777*24.0*x^23.0-9.0*2.0*x^1.0";
 UsageCalculus.EqnSolArrayMap2[2] = "66.66666666666666*x^23.0-18.0*x";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/234.0*x^26.0-1.0/1.3333333333333333*x^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/234.0/27.0*x^27.0-1.0/1.3333333333333333/5.0*x^5.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/6318.0*x^27.0-1.0/6.666666666666666*x^5.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "66.66666666666666*x^23.0-18.0*x";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "66.66666666666666*23.0*x^22.0-18.0";
 UsageCalculus.EqnSolArrayMap2[3] = "1533.333333333333*x^22.0-18.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/6318.0*x^27.0-1.0/6.666666666666666*x^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/6318.0/28.0*x^28.0-1.0/6.666666666666666/6.0*x^6.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/176904.0*x^28.0-1.0/40.0*x^6.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "1533.333333333333*x^22.0-18.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "1533.333333333333*22.0*x^21.0-18.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "33733.33333333333*x^21.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/176904.0*x^28.0-1.0/40.0*x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/176904.0/29.0*x^29.0-1.0/40.0/7.0*x^7.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/5130216.0*x^29.0-1.0/280.0*x^7.0";
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

public static void TestCaseDiff121170() {
 UsageCalculus.TestCase = 121170;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xy^2*1*xy/2*xy^21*xy/2*xy^2*-3*xy^3*-1*xy-3*xy^2*1*xy1*xy/2*xy^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=169 EqnNumber=72 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[17, 72, 2, 3, 2, 3, 1, 8, 3, 4, 1, 2, 3, 1, 4, 3, 1, 1, 2, 3, 4, 15, 1, 2, 3, 4, 15, 1, 1, 13, 2, 15, 16, 17, 26]"+
"// DOEMatrixRow=[49, 74, 4, 3, 2, 3, 1, 6, 1, 2, 3, 2, 3, 1, 2, 1, 2, 24, 3, 1, 2, 5, 1, 2, 6, 1, 1, 2, 3, 12, 2, 15, 12]"+
//Tail EqnIndex=169 EqnNumber=72 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[17, 72, 2, 3, 2, 3, 1, 8, 3, 4, 1, 2, 3, 1, 4, 3, 1, 1, 2, 3, 4, 15, 1, 2, 3, 4, 15, 1, 1, 13, 2, 15, 16, 17, 26]"+
"// DOEMatrixRow=[49, 74, 4, 3, 2, 3, 1, 6, 1, 2, 3, 2, 3, 1, 2, 1, 2, 24, 3, 1, 2, 5, 1, 2, 6, 1, 1, 2, 3, 12, 2, 15, 12]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-2.25*xy^31.0-1.5*xy^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-2.25*31.0*xy^30.0-1.5*5.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-69.75*xy^30.0-7.5*xy^4.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-2.25*xy^31.0-1.5*xy^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-2.25/32.0*xy^32.0-1.5/6.0*xy^6.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/14.222222222222221*xy^32.0-1.0/4.0*xy^6.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-69.75*xy^30.0-7.5*xy^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-69.75*30.0*xy^29.0-7.5*4.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-2092.5*xy^29.0-30.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/14.222222222222221*xy^32.0-1.0/4.0*xy^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/14.222222222222221/33.0*xy^33.0-1.0/4.0/7.0*xy^7.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/469.3333333333333*xy^33.0-1.0/28.0*xy^7.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-2092.5*xy^29.0-30.0*xy^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-2092.5*29.0*xy^28.0-30.0*3.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-60682.5*xy^28.0-90.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/469.3333333333333*xy^33.0-1.0/28.0*xy^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/469.3333333333333/34.0*xy^34.0-1.0/28.0/8.0*xy^8.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/15957.333333333332*xy^34.0-1.0/224.0*xy^8.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-60682.5*xy^28.0-90.0*xy^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-60682.5*28.0*xy^27.0-90.0*2.0*xy^1.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1699110.0*xy^27.0-180.0*xy";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/15957.333333333332*xy^34.0-1.0/224.0*xy^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/15957.333333333332/35.0*xy^35.0-1.0/224.0/9.0*xy^9.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/558506.6666666666*xy^35.0-1.0/2016.0*xy^9.0";
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

public static void TestCaseDiff121171() {
 UsageCalculus.TestCase = 121171;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xyz/2*xyz^2*-3*xyz^3*-1*xyz2*xy012^23*xyz^3*-1*xyz1*xyz/2*xyz^22*xy012^2*-3*xy012^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=170 EqnNumber=73 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[82, 73, 3, 4, 3, 1, 2, 9, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 3, 1, 1, 16, 2, 3, 1, 1, 16, 2, 3, 14, 3, 16, 1, 18, 27]"+
"// DOEMatrixRow=[13, 75, 5, 4, 3, 1, 2, 7, 2, 3, 4, 1, 1, 2, 3, 2, 3, 25, 4, 2, 3, 1, 2, 3, 1, 2, 3, 1, 4, 13, 1, 16, 13]"+
//Tail EqnIndex=170 EqnNumber=73 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[82, 73, 3, 4, 3, 1, 2, 9, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 3, 1, 1, 16, 2, 3, 1, 1, 16, 2, 3, 14, 3, 16, 1, 18, 27]"+
"// DOEMatrixRow=[13, 75, 5, 4, 3, 1, 2, 7, 2, 3, 4, 1, 1, 2, 3, 2, 3, 25, 4, 2, 3, 1, 2, 3, 1, 2, 3, 1, 4, 13, 1, 16, 13]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "xy012^2.0*2.25*xyz^32.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "xy012^2.0*2.25*32.0*xyz^31.0";
 UsageCalculus.EqnSolArrayMap2[1] = "xy012^2.0*72.0*xyz^31.0";
 UsageCalculus.EqnSolArrayMap3[1] = "xy012^2.0*2.25*xyz^32.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "xy012^2.0*2.25/33.0*xyz^33.0";
 UsageCalculus.EqnSolArrayMap4[1] = "xy012^2.0/14.666666666666666*xyz^33.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "xy012^2.0*72.0*xyz^31.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "xy012^2.0*72.0*31.0*xyz^30.0";
 UsageCalculus.EqnSolArrayMap2[2] = "xy012^2.0*2232.0*xyz^30.0";
 UsageCalculus.EqnSolArrayMap3[2] = "xy012^2.0/14.666666666666666*xyz^33.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "xy012^2.0*14.666666666666666/34.0*xyz^34.0";
 UsageCalculus.EqnSolArrayMap4[2] = "xy012^2.0/2.3181818181818183*xyz^34.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "xy012^2.0*2232.0*xyz^30.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "xy012^2.0*2232.0*30.0*xyz^29.0";
 UsageCalculus.EqnSolArrayMap2[3] = "xy012^2.0*66960.0*xyz^29.0";
 UsageCalculus.EqnSolArrayMap3[3] = "xy012^2.0/2.3181818181818183*xyz^34.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "xy012^2.0*2.3181818181818183/35.0*xyz^35.0";
 UsageCalculus.EqnSolArrayMap4[3] = "xy012^2.0/15.098039215686274*xyz^35.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "xy012^2.0*66960.0*xyz^29.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "xy012^2.0*66960.0*29.0*xyz^28.0";
 UsageCalculus.EqnSolArrayMap2[4] = "xy012^2.0*1941840.0*xyz^28.0";
 UsageCalculus.EqnSolArrayMap3[4] = "xy012^2.0/15.098039215686274*xyz^35.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "xy012^2.0*15.098039215686274/36.0*xyz^36.0";
 UsageCalculus.EqnSolArrayMap4[4] = "xy012^2.0/2.3844155844155845*xyz^36.0";
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

public static void TestCaseDiff121172() {
 UsageCalculus.TestCase = 121172;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xy012^23*xyza^3*-1*xyza-1*xyza/2*xyza^2*-3*xyza^32*x0^2*-3*x0^3*1*x0/-3*x0^22*xy012^2*-3*xy012^33*xyza^3*-1*xyza";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=171 EqnNumber=74 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[48, 74, 4, 5, 4, 2, 3, 10, 2, 3, 4, 2, 3, 1, 2, 3, 1, 2, 4, 2, 3, 1, 3, 1, 2, 3, 1, 3, 4, 15, 4, 17, 2, 19, 28]"+
"// DOEMatrixRow=[78, 76, 6, 1, 1, 2, 3, 8, 3, 4, 1, 2, 3, 1, 4, 3, 1, 26, 5, 3, 1, 2, 3, 1, 2, 3, 1, 2, 1, 14, 2, 17, 14]"+
//Tail EqnIndex=171 EqnNumber=74 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[48, 74, 4, 5, 4, 2, 3, 10, 2, 3, 4, 2, 3, 1, 2, 3, 1, 2, 4, 2, 3, 1, 3, 1, 2, 3, 1, 3, 4, 15, 4, 17, 2, 19, 28]"+
"// DOEMatrixRow=[78, 76, 6, 1, 1, 2, 3, 8, 3, 4, 1, 2, 3, 1, 4, 3, 1, 26, 5, 3, 1, 2, 3, 1, 2, 3, 1, 2, 1, 14, 2, 17, 14]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-xy012^23.0*2.0*xyza^4.0+x0^2.0*x0*4.5*xyza^39.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-xy012^23.0*2.0*4.0*xyza^3.0+x0^2.0*x0*39.0*xyza^38.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-xy012^23.0*8.0*xyza^3.0+x0^2.0*x0*39.0*xyza^38.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-xy012^23.0*2.0*xyza^4.0+x0^2.0*x0*4.5*xyza^39.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-xy012^23.0*2.0/5.0*xyza^5.0+x0^2.0*x0*4.5/40.0*xyza^40.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-xy012^23.0*0.4*xyza^5.0+x0^2.0*x0/8.88888888888889*xyza^40.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-xy012^23.0*8.0*xyza^3.0+x0^2.0*x0*39.0*xyza^38.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-xy012^23.0*8.0*3.0*xyza^2.0+x0^2.0*x0*38.0*xyza^37.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-xy012^23.0*24.0*xyza^2.0+x0^2.0*x0*38.0*xyza^37.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-xy012^23.0*0.4*xyza^5.0+x0^2.0*x0/8.88888888888889*xyza^40.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-xy012^23.0*0.4/6.0*xyza^6.0+x0^2.0*x0/8.88888888888889/41.0*xyza^41.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-xy012^23.0*0.06666666666666667*xyza^6.0+x0^2.0*x0/364.44444444444446*xyza^41.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-xy012^23.0*24.0*xyza^2.0+x0^2.0*x0*38.0*xyza^37.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-xy012^23.0*24.0*2.0*xyza^1.0+x0^2.0*x0*37.0*xyza^36.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-xy012^23.0*48.0*xyza+x0^2.0*x0*37.0*xyza^36.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-xy012^23.0*0.06666666666666667*xyza^6.0+x0^2.0*x0/364.44444444444446*xyza^41.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-xy012^23.0*0.06666666666666667/7.0*xyza^7.0+x0^2.0*x0/364.44444444444446/42.0*xyza^42.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-xy012^23.0*0.009523809523809523*xyza^7.0+x0^2.0*x0/15306.666666666668*xyza^42.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-xy012^23.0*48.0*xyza+x0^2.0*x0*37.0*xyza^36.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-xy012^23.0*48.0+x0^2.0*x0*36.0*xyza^35.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-xy012^23.0*48.0+x0^2.0*x0*36.0*xyza^35.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-xy012^23.0*0.009523809523809523*xyza^7.0+x0^2.0*x0/15306.666666666668*xyza^42.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-xy012^23.0*0.009523809523809523/8.0*xyza^8.0+x0^2.0*x0/15306.666666666668/43.0*xyza^43.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-xy012^23.0*0.0011904761904761904*xyza^8.0+x0^2.0*x0/658186.6666666667*xyza^43.0";
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

public static void TestCaseDiff121173() {
 UsageCalculus.TestCase = 121173;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*x^3*-1*x-1*x/2*x^2*-3*x^32*x0^2*-3*x0^3*1*x0/-3*x0^23*x^31*x/-3*x^23*x^3*-1*x-1*x/2*x^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=172 EqnNumber=75 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[12, 75, 5, 6, 1, 3, 1, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 3, 4, 2, 1, 2, 3, 4, 2, 1, 1, 16, 1, 18, 3, 20, 29]"+
"// DOEMatrixRow=[43, 77, 7, 2, 3, 1, 1, 9, 1, 1, 2, 1, 1, 2, 1, 1, 2, 27, 6, 1, 2, 3, 1, 2, 3, 4, 2, 3, 2, 15, 1, 18, 15]"+
//Tail EqnIndex=172 EqnNumber=75 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[12, 75, 5, 6, 1, 3, 1, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 3, 4, 2, 1, 2, 3, 4, 2, 1, 1, 16, 1, 18, 3, 20, 29]"+
"// DOEMatrixRow=[43, 77, 7, 2, 3, 1, 1, 9, 1, 1, 2, 1, 1, 2, 1, 1, 2, 27, 6, 1, 2, 3, 1, 2, 3, 4, 2, 3, 2, 15, 1, 18, 15]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-3.0*x^4.0+1.0/2.0*x^94.0-1.0/2.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-3.0*4.0*x^3.0+1.0/2.0*94.0*x^93.0-1.0/2.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-12.0*x^3.0+47.0*x^93.0-1.5*x^2.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-3.0*x^4.0+1.0/2.0*x^94.0-1.0/2.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-3.0/5.0*x^5.0+1.0/2.0/95.0*x^95.0-1.0/2.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/1.6666666666666667*x^5.0+1.0/190.0*x^95.0-1.0/8.0*x^4.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-12.0*x^3.0+47.0*x^93.0-1.5*x^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-12.0*3.0*x^2.0+47.0*93.0*x^92.0-1.5*2.0*x^1.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-36.0*x^2.0+4371.0*x^92.0-3.0*x";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/1.6666666666666667*x^5.0+1.0/190.0*x^95.0-1.0/8.0*x^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/1.6666666666666667/6.0*x^6.0+1.0/190.0/96.0*x^96.0-1.0/8.0/5.0*x^5.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/10.0*x^6.0+1.0/18240.0*x^96.0-1.0/40.0*x^5.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-36.0*x^2.0+4371.0*x^92.0-3.0*x";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-36.0*2.0*x^1.0+4371.0*92.0*x^91.0-3.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-72.0*x+402132.0*x^91.0-3.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/10.0*x^6.0+1.0/18240.0*x^96.0-1.0/40.0*x^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/10.0/7.0*x^7.0+1.0/18240.0/97.0*x^97.0-1.0/40.0/6.0*x^6.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/70.0*x^7.0+1.0/1769280.0*x^97.0-1.0/240.0*x^6.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-72.0*x+402132.0*x^91.0-3.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-72.0+402132.0*91.0*x^90.0-3.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-72.0+3.6594012E7*x^90.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/70.0*x^7.0+1.0/1769280.0*x^97.0-1.0/240.0*x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/70.0/8.0*x^8.0+1.0/1769280.0/98.0*x^98.0-1.0/240.0/7.0*x^7.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/560.0*x^8.0+1.0/1.7338944E8*x^98.0-1.0/1680.0*x^7.0";
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

public static void TestCaseDiff121174() {
 UsageCalculus.TestCase = 121174;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-1*xy/2*xy^2*-3*xy^32*x0^2*-3*x0^3*1*x0/-3*x0^23*xy^31*xy/-3*xy^2-3*x0^2*-1*x0^3*2*x01*xy^3*2*xy/3*xy^2*--1*xy^3-1*xy/2*xy^22*x0^2*-3*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=173 EqnNumber=76 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[77, 76, 6, 7, 2, 1, 2, 3, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 1, 1, 3, 2, 3, 1, 1, 3, 2, 3, 1, 2, 19, 4, 21, 30]"+
"// DOEMatrixRow=[8, 78, 8, 3, 1, 2, 3, 10, 2, 3, 4, 2, 3, 1, 2, 3, 1, 28, 7, 2, 3, 4, 2, 3, 4, 1, 3, 1, 3, 16, 2, 19, 16]"+
//Tail EqnIndex=173 EqnNumber=76 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[77, 76, 6, 7, 2, 1, 2, 3, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 1, 1, 3, 2, 3, 1, 1, 3, 2, 3, 1, 2, 19, 4, 21, 30]"+
"// DOEMatrixRow=[8, 78, 8, 3, 1, 2, 3, 10, 2, 3, 4, 2, 3, 1, 2, 3, 1, 28, 7, 2, 3, 4, 2, 3, 4, 1, 3, 1, 3, 16, 2, 19, 16]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^2.0*x0/2.0*xy^69.0+x0^2.0*x01*4.0*xy^9.0-xy^3.0+x0^2.0*1.5*xy^23.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^2.0*x0/2.0*69.0*xy^68.0+x0^2.0*x01*4.0*9.0*xy^8.0-3.0*xy^2.0+x0^2.0*1.5*23.0*xy^22.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^2.0*x0*34.5*xy^68.0+x0^2.0*x01*36.0*xy^8.0-3.0*xy^2.0+x0^2.0*34.5*xy^22.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^2.0*x0/2.0*xy^69.0+x0^2.0*x01*4.0*xy^9.0-xy^3.0+x0^2.0*1.5*xy^23.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^2.0*x0/2.0/70.0*xy^70.0+x0^2.0*x01*4.0/10.0*xy^10.0-1.0/4.0*xy^4.0+x0^2.0*1.5/24.0*xy^24.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^2.0*x0*0.007142857142857143*xy^70.0+x0^2.0*x01/2.5*xy^10.0-0.25*xy^4.0+x0^2.0/16.0*xy^24.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^2.0*x0*34.5*xy^68.0+x0^2.0*x01*36.0*xy^8.0-3.0*xy^2.0+x0^2.0*34.5*xy^22.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^2.0*x0*34.5*68.0*xy^67.0+x0^2.0*x01*36.0*8.0*xy^7.0-3.0*2.0*xy^1.0+x0^2.0*34.5*22.0*xy^21.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^2.0*x0*2346.0*xy^67.0+x0^2.0*x01*288.0*xy^7.0-6.0*xy+x0^2.0*759.0*xy^21.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^2.0*x0*0.007142857142857143*xy^70.0+x0^2.0*x01/2.5*xy^10.0-0.25*xy^4.0+x0^2.0/16.0*xy^24.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^2.0*x0*0.007142857142857143/71.0*xy^71.0+x0^2.0*x01/2.5/11.0*xy^11.0-0.25/5.0*xy^5.0+x0^2.0*16.0/25.0*xy^25.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^2.0*x0*1.0060362173038229E-4*xy^71.0+x0^2.0*x01/27.5*xy^11.0-0.05*xy^5.0+x0^2.0/1.5625*xy^25.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^2.0*x0*2346.0*xy^67.0+x0^2.0*x01*288.0*xy^7.0-6.0*xy+x0^2.0*759.0*xy^21.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^2.0*x0*2346.0*67.0*xy^66.0+x0^2.0*x01*288.0*7.0*xy^6.0-6.0+x0^2.0*759.0*21.0*xy^20.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^2.0*x0*157182.0*xy^66.0+x0^2.0*x01*2016.0*xy^6.0-6.0+x0^2.0*15939.0*xy^20.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^2.0*x0*1.0060362173038229E-4*xy^71.0-4.0*xy^71.0+x0^2.0*x01/27.5*xy^11.0-0.05*xy^5.0+x0^2.0/1.5625*xy^25.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^2.0*x0*1.0060362173038229E-4/72.0*xy^72.0-4.0/72.0*xy^72.0+x0^2.0*x01/27.5/12.0*xy^12.0-0.05/6.0*xy^6.0+x0^2.0*1.5625/26.0*xy^26.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^2.0*x0/715680.0*xy^72.0-1.0/18.0*xy^72.0-0.05555555555555555*xy^72.0+x0^2.0*x01/330.0*xy^12.0-0.008333333333333333*xy^6.0+x0^2.0/16.64*xy^26.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^2.0*x0*157182.0*xy^66.0+x0^2.0*x01*2016.0*xy^6.0-6.0+x0^2.0*15939.0*xy^20.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^2.0*x0*157182.0*66.0*xy^65.0+x0^2.0*x01*2016.0*6.0*xy^5.0-6.0*0.0+x0^2.0*15939.0*20.0*xy^19.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^2.0*x0*1.0374012E7*xy^65.0+x0^2.0*x01*12096.0*xy^5.0+x0^2.0*318780.0*xy^19.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^2.0*x0/715680.0*xy^72.0-1.0/18.0*xy^72.0-0.05555555555555555*xy^72.0+x0^2.0*x01/330.0*xy^12.0-0.008333333333333333*xy^6.0+x0^2.0/16.64*xy^26.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^2.0*x0/715680.0/73.0*xy^73.0-1.0/18.0/73.0*xy^73.0-0.05555555555555555/73.0*xy^73.0+x0^2.0*x01/330.0/13.0*xy^13.0-0.008333333333333333/7.0*xy^7.0+x0^2.0*16.64/27.0*xy^27.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^2.0*x0/5.224464E7*xy^73.0-1.0/1314.0*xy^73.0-7.6103500761035E-4*xy^73.0+x0^2.0*x01/4290.0*xy^13.0-0.0011904761904761904*xy^7.0+x0^2.0/1.6225961538461537*xy^27.0";
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

public static void TestCaseDiff121175() {
 UsageCalculus.TestCase = 121175;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*x0^2*-3*x0^3*1*x0/-3*x0^23*xyz^31*xyz/-3*xyz^2-3*x0^2*-1*x0^3*2*x01*xyz^3*2*xyz/3*xyz^2*--1*xyz^32*xyz3*x0^2*--1*x0^32*x0^2*-3*x0^33*xyz^3*1*xyz";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=174 EqnNumber=77 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[42, 77, 7, 8, 3, 2, 3, 4, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 2, 4, 3, 1, 2, 3, 4, 3, 4, 2, 3, 20, 5, 22, 31]"+
"// DOEMatrixRow=[73, 79, 9, 4, 2, 3, 1, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 29, 8, 3, 1, 5, 3, 1, 5, 2, 1, 2, 4, 1, 1, 20, 17]"+
//Tail EqnIndex=174 EqnNumber=77 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[42, 77, 7, 8, 3, 2, 3, 4, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 2, 4, 3, 1, 2, 3, 4, 3, 4, 2, 3, 20, 5, 22, 31]"+
"// DOEMatrixRow=[73, 79, 9, 4, 2, 3, 1, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 29, 8, 3, 1, 5, 3, 1, 5, 2, 1, 2, 4, 1, 1, 20, 17]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^2.0*x0/1.5*xyz^34.0+x0^2.0*12.0*xyz^42.0-x0^2.0*3.0*xyz^36.0+x0^32.0*3.0*xyz^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^2.0*x0/1.5*34.0*xyz^33.0+x0^2.0*12.0*42.0*xyz^41.0-x0^2.0*3.0*36.0*xyz^35.0+x0^32.0*3.0*4.0*xyz^3.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^2.0*x0*22.666666666666668*xyz^33.0+x0^2.0*504.0*xyz^41.0-x0^2.0*108.0*xyz^35.0+x0^32.0*12.0*xyz^3.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^2.0*x0/1.5*xyz^34.0+x0^2.0*12.0*xyz^42.0-x0^2.0*3.0*xyz^36.0+x0^32.0*3.0*xyz^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^2.0*x0/1.5/35.0*xyz^35.0+x0^2.0*12.0/43.0*xyz^43.0-x0^2.0*3.0/37.0*xyz^37.0+x0^32.0*3.0/5.0*xyz^5.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^2.0*x0*0.01904761904761905*xyz^35.0+x0^2.0*0.27906976744186046*xyz^43.0-x0^2.0*0.08108108108108109*xyz^37.0+x0^32.0/1.6666666666666667*xyz^5.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^2.0*x0*22.666666666666668*xyz^33.0+x0^2.0*504.0*xyz^41.0-x0^2.0*108.0*xyz^35.0+x0^32.0*12.0*xyz^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^2.0*x0*22.666666666666668*33.0*xyz^32.0+x0^2.0*504.0*41.0*xyz^40.0-x0^2.0*108.0*35.0*xyz^34.0+x0^32.0*12.0*3.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^2.0*x0*748.0*xyz^32.0+x0^2.0*20664.0*xyz^40.0-x0^2.0*3780.0*xyz^34.0+x0^32.0*36.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^2.0*x0*0.01904761904761905*xyz^35.0+x0^2.0*0.27906976744186046*xyz^43.0-x0^2.0*0.08108108108108109*xyz^37.0+x0^32.0/1.6666666666666667*xyz^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^2.0*x0*0.01904761904761905/36.0*xyz^36.0+x0^2.0*0.27906976744186046/44.0*xyz^44.0-x0^2.0*0.08108108108108109/38.0*xyz^38.0+x0^32.0*1.6666666666666667/6.0*xyz^6.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^2.0*x0*5.291005291005291E-4*xyz^36.0+x0^2.0*0.006342494714587738*xyz^44.0-x0^2.0*0.0021337126600284497*xyz^38.0+x0^32.0/3.5999999999999996*xyz^6.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^2.0*x0*748.0*xyz^32.0+x0^2.0*20664.0*xyz^40.0-x0^2.0*3780.0*xyz^34.0+x0^32.0*36.0*xyz^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^2.0*x0*748.0*32.0*xyz^31.0+x0^2.0*20664.0*40.0*xyz^39.0-x0^2.0*3780.0*34.0*xyz^33.0+x0^32.0*36.0*2.0*xyz^1.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^2.0*x0*23936.0*xyz^31.0+x0^2.0*826560.0*xyz^39.0-x0^2.0*128520.0*xyz^33.0+x0^32.0*72.0*xyz";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^2.0*x0*5.291005291005291E-4*xyz^36.0-4.0*xyz^36.0+x0^2.0*0.006342494714587738*xyz^44.0-x0^2.0*0.0021337126600284497*xyz^38.0+x0^32.0/3.5999999999999996*xyz^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^2.0*x0*5.291005291005291E-4/37.0*xyz^37.0-4.0/37.0*xyz^37.0+x0^2.0*0.006342494714587738/45.0*xyz^45.0-x0^2.0*0.0021337126600284497/39.0*xyz^39.0+x0^32.0*3.5999999999999996/7.0*xyz^7.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^2.0*x0/69930.0*xyz^37.0-1.0/9.25*xyz^37.0-0.10810810810810811*xyz^37.0+x0^2.0*1.4094432699083862E-4*xyz^45.0-x0^2.0*5.4710581026370506E-5*xyz^39.0+x0^32.0/1.9444444444444446*xyz^7.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^2.0*x0*23936.0*xyz^31.0+x0^2.0*826560.0*xyz^39.0-x0^2.0*128520.0*xyz^33.0+x0^32.0*72.0*xyz";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^2.0*x0*23936.0*31.0*xyz^30.0+x0^2.0*826560.0*39.0*xyz^38.0-x0^2.0*128520.0*33.0*xyz^32.0+x0^32.0*72.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^2.0*x0*742016.0*xyz^30.0+x0^2.0*3.223584E7*xyz^38.0-x0^2.0*4241160.0*xyz^32.0+x0^32.0*72.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^2.0*x0/69930.0*xyz^37.0-1.0/9.25*xyz^37.0-0.10810810810810811*xyz^37.0+x0^2.0*1.4094432699083862E-4*xyz^45.0-4.0*xyz^45.0-x0^2.0*5.4710581026370506E-5*xyz^39.0-5.0*xyz^39.0+x0^32.0/1.9444444444444446*xyz^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^2.0*x0/69930.0/38.0*xyz^38.0-1.0/9.25/38.0*xyz^38.0-0.10810810810810811/38.0*xyz^38.0+x0^2.0*1.4094432699083862E-4/46.0*xyz^46.0-4.0/46.0*xyz^46.0-x0^2.0*5.4710581026370506E-5/40.0*xyz^40.0-5.0/40.0*xyz^40.0+x0^32.0*1.9444444444444446/8.0*xyz^8.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^2.0*x0/2657340.0*xyz^38.0-1.0/351.5*xyz^38.0-0.002844950213371266*xyz^38.0+x0^2.0/326370.0*xyz^46.0-1.0/11.5*xyz^46.0-0.08695652173913043*xyz^46.0-x0^2.0/731119.9999999999*xyz^40.0-1.0/8.0*xyz^40.0-0.125*xyz^40.0+x0^32.0/4.114285714285714*xyz^8.0";
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

public static void TestCaseDiff121176() {
 UsageCalculus.TestCase = 121176;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xyza^31*xyza/-3*xyza^2-3*x0^2*-1*x0^3*2*x01*xyza^3*2*xyza/3*xyza^2*--1*xyza^32*xyza3*x0^2*--1*x0^3-1*xyza^3*2*xyza/3*xyza^22*xyza/3*xyza^2*-1*xyza^3*-3*xyza3*xyza^3*1*xyza1*xyza/-3*xyza^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=175 EqnNumber=78 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[7, 78, 8, 9, 4, 3, 1, 5, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 3, 5, 1, 2, 3, 4, 5, 1, 1, 3, 4, 21, 6, 23, 32]"+
"// DOEMatrixRow=[38, 80, 10, 1, 3, 1, 2, 3, 1, 1, 2, 1, 2, 3, 4, 2, 3, 30, 9, 1, 2, 1, 1, 2, 6, 3, 2, 3, 1, 2, 1, 1, 18]"+
//Tail EqnIndex=175 EqnNumber=78 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[7, 78, 8, 9, 4, 3, 1, 5, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 3, 5, 1, 2, 3, 4, 5, 1, 1, 3, 4, 21, 6, 23, 32]"+
"// DOEMatrixRow=[38, 80, 10, 1, 3, 1, 2, 3, 1, 1, 2, 1, 2, 3, 4, 2, 3, 30, 9, 1, 2, 1, 1, 2, 6, 3, 2, 3, 1, 2, 1, 1, 18]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-xyza^34.0+x0^2.0*4.0*xyza^38.0-x0^2.0*xyza^32.0-x0^3.0+1.0/4.5*xyza^38.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-34.0*xyza^33.0+x0^2.0*4.0*38.0*xyza^37.0-x0^2.0*32.0*xyza^31.0-x0^3.0*0.0+1.0/4.5*38.0*xyza^37.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-34.0*xyza^33.0+x0^2.0*152.0*xyza^37.0-x0^2.0*32.0*xyza^31.0-x0^3.0*0.0+8.444444444444445*xyza^37.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-xyza^34.0+x0^2.0*4.0*xyza^38.0-x0^2.0*xyza^32.0-x0^3.0+1.0/4.5*xyza^38.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.0/35.0*xyza^35.0+x0^2.0*4.0/39.0*xyza^39.0-x0^2.0/33.0*xyza^33.0-x0^3.0*xyza+1.0/4.5/39.0*xyza^39.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-0.02857142857142857*xyza^35.0+x0^2.0*0.10256410256410256*xyza^39.0-x0^2.0/33.0*xyza^33.0-x0^3.0*xyza+1.0/175.5*xyza^39.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-34.0*xyza^33.0+x0^2.0*152.0*xyza^37.0-x0^2.0*32.0*xyza^31.0-x0^3.0*0.0+8.444444444444445*xyza^37.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-34.0*33.0*xyza^32.0+x0^2.0*152.0*37.0*xyza^36.0-x0^2.0*32.0*31.0*xyza^30.0-x0^3.0*0.0*0.0+8.444444444444445*37.0*xyza^36.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-1122.0*xyza^32.0+x0^2.0*5624.0*xyza^36.0-x0^2.0*992.0*xyza^30.0-x0^3.0*0.0+312.44444444444446*xyza^36.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-0.02857142857142857*xyza^35.0+x0^2.0*0.10256410256410256*xyza^39.0-x0^2.0/33.0*xyza^33.0-x0^3.0*xyza+1.0/175.5*xyza^39.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-0.02857142857142857/36.0*xyza^36.0+x0^2.0*0.10256410256410256/40.0*xyza^40.0-x0^2.0/33.0/34.0*xyza^34.0-x0^3.0/2.0*xyza^2.0+1.0/175.5/40.0*xyza^40.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-7.936507936507937E-4*xyza^36.0+x0^2.0*0.002564102564102564*xyza^40.0-x0^2.0*8.9126559714795E-4*xyza^34.0-x0^3.0/2.0*xyza^2.0+1.0/7020.0*xyza^40.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-1122.0*xyza^32.0+x0^2.0*5624.0*xyza^36.0-x0^2.0*992.0*xyza^30.0-x0^3.0*0.0+312.44444444444446*xyza^36.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-1122.0*32.0*xyza^31.0+x0^2.0*5624.0*36.0*xyza^35.0-x0^2.0*992.0*30.0*xyza^29.0-x0^3.0*0.0*0.0+312.44444444444446*36.0*xyza^35.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-35904.0*xyza^31.0+x0^2.0*202464.0*xyza^35.0-x0^2.0*29760.0*xyza^29.0-x0^3.0*0.0+11248.0*xyza^35.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-7.936507936507937E-4*xyza^36.0-4.0*xyza^36.0+x0^2.0*0.002564102564102564*xyza^40.0-x0^2.0*8.9126559714795E-4*xyza^34.0-4.0*xyza^34.0-x0^3.0/2.0*xyza^2.0+1.0/7020.0*xyza^40.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-7.936507936507937E-4/37.0*xyza^37.0-4.0/37.0*xyza^37.0+x0^2.0*0.002564102564102564/41.0*xyza^41.0-x0^2.0*8.9126559714795E-4/35.0*xyza^35.0-4.0/35.0*xyza^35.0-x0^3.0/2.0/3.0*xyza^3.0+1.0/7020.0/41.0*xyza^41.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/46620.0*xyza^37.0-1.0/9.25*xyza^37.0-0.10810810810810811*xyza^37.0+x0^2.0*6.253908692933083E-5*xyza^41.0-x0^2.0/39270.0*xyza^35.0-1.0/8.75*xyza^35.0-0.11428571428571428*xyza^35.0-x0^3.0/6.0*xyza^3.0+1.0/287820.0*xyza^41.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-35904.0*xyza^31.0+x0^2.0*202464.0*xyza^35.0-x0^2.0*29760.0*xyza^29.0-x0^3.0*0.0+11248.0*xyza^35.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-35904.0*31.0*xyza^30.0+x0^2.0*202464.0*35.0*xyza^34.0-x0^2.0*29760.0*29.0*xyza^28.0-x0^3.0*0.0*0.0+11248.0*35.0*xyza^34.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1113024.0*xyza^30.0+x0^2.0*7086240.0*xyza^34.0-x0^2.0*863040.0*xyza^28.0-x0^3.0*0.0+393680.0*xyza^34.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/46620.0*xyza^37.0-1.0/9.25*xyza^37.0-0.10810810810810811*xyza^37.0+x0^2.0*6.253908692933083E-5*xyza^41.0-5.0*xyza^41.0-x0^2.0/39270.0*xyza^35.0-1.0/8.75*xyza^35.0-0.11428571428571428*xyza^35.0-x0^3.0/6.0*xyza^3.0+1.0/287820.0*xyza^41.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/46620.0/38.0*xyza^38.0-1.0/9.25/38.0*xyza^38.0-0.10810810810810811/38.0*xyza^38.0+x0^2.0*6.253908692933083E-5/42.0*xyza^42.0-5.0/42.0*xyza^42.0-x0^2.0/39270.0/36.0*xyza^36.0-1.0/8.75/36.0*xyza^36.0-0.11428571428571428/36.0*xyza^36.0-x0^3.0/6.0/4.0*xyza^4.0+1.0/287820.0/42.0*xyza^42.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/1771560.0*xyza^38.0-1.0/351.5*xyza^38.0-0.002844950213371266*xyza^38.0+x0^2.0/671580.0*xyza^42.0-1.0/8.4*xyza^42.0-0.11904761904761904*xyza^42.0-x0^2.0/1413720.0*xyza^36.0-1.0/315.0*xyza^36.0-0.0031746031746031746*xyza^36.0-x0^3.0/24.0*xyza^4.0+1.0/1.208844E7*xyza^42.0";
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

public static void TestCaseDiff121177() {
 UsageCalculus.TestCase = 121177;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x/-3*x^2-3*x0^2*-1*x0^3*2*x01*x^3*2*x/3*x^2*--1*x^32*x3*x0^2*--1*x0^3-1*x^3*2*x/3*x^22*x/3*x^2*-1*x^3*-3*x3*x0^21*x^3*-3*x1*x/-3*x^2-3*x0^2*-1*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=176 EqnNumber=79 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[72, 79, 9, 10, 1, 1, 2, 6, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 4, 6, 2, 3, 1, 1, 6, 2, 3, 4, 1, 22, 7, 24, 1]"+
"// DOEMatrixRow=[3, 81, 11, 2, 1, 2, 3, 4, 2, 3, 4, 2, 3, 1, 1, 3, 1, 31, 10, 2, 3, 2, 3, 1, 1, 4, 3, 1, 2, 3, 2, 3, 19]"+
//Tail EqnIndex=176 EqnNumber=79 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[72, 79, 9, 10, 1, 1, 2, 6, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 4, 6, 2, 3, 1, 1, 6, 2, 3, 4, 1, 22, 7, 24, 1]"+
"// DOEMatrixRow=[3, 81, 11, 2, 1, 2, 3, 4, 2, 3, 4, 2, 3, 1, 1, 3, 1, 31, 10, 2, 3, 2, 3, 1, 1, 4, 3, 1, 2, 3, 2, 3, 19]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-1.0/3.0*x^3.0+4.0*x^38.0-x^32.0-1.0-1.0/1.5*x^38.0+3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-1.0/3.0*3.0*x^2.0+4.0*38.0*x^37.0-32.0*x^31.0-1.0*0.0-1.0/1.5*38.0*x^37.0+3.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x^2.0+152.0*x^37.0-32.0*x^31.0-25.333333333333332*x^37.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-1.0/3.0*x^3.0+4.0*x^38.0-x^32.0-1.0-1.0/1.5*x^38.0+3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.0/3.0/4.0*x^4.0+4.0/39.0*x^39.0-1.0/33.0*x^33.0-1.0*x-1.0/1.5/39.0*x^39.0+3.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/12.0*x^4.0+1.0/9.75*x^39.0-1.0/33.0*x^33.0-x-1.0/58.5*x^39.0+3.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x^2.0+152.0*x^37.0-32.0*x^31.0-25.333333333333332*x^37.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-2.0*x^1.0+152.0*37.0*x^36.0-32.0*31.0*x^30.0-25.333333333333332*37.0*x^36.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-2.0*x+5624.0*x^36.0-992.0*x^30.0-937.3333333333333*x^36.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/12.0*x^4.0+1.0/9.75*x^39.0-0.030303030303030304*x^33.0-x-1.0/58.5*x^39.0+3.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/12.0/5.0*x^5.0+1.0/9.75/40.0*x^40.0-0.030303030303030304/34.0*x^34.0-1.0/2.0*x^2.0-1.0/58.5/40.0*x^40.0+3.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/60.0*x^5.0+1.0/390.0*x^40.0-1.0/1122.0*x^34.0-1.0/2.0*x^2.0-1.0/2340.0*x^40.0+1.5*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-2.0*x+5624.0*x^36.0-992.0*x^30.0-937.3333333333333*x^36.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-2.0+5624.0*36.0*x^35.0-992.0*30.0*x^29.0-937.3333333333333*36.0*x^35.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-2.0+202464.0*x^35.0-29760.0*x^29.0-33744.0*x^35.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/60.0*x^5.0+1.0/390.0*x^40.0-1.0/1122.0*x^34.0-1.0/2.0*x^2.0-1.0/2340.0*x^40.0+1.5*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/60.0/6.0*x^6.0+1.0/390.0/41.0*x^41.0-1.0/1122.0/35.0*x^35.0-1.0/2.0/3.0*x^3.0-1.0/2340.0/41.0*x^41.0+1.5/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/360.0*x^6.0+1.0/15990.0*x^41.0-1.0/39270.0*x^35.0-1.0/6.0*x^3.0-1.0/95940.0*x^41.0+1.0/2.0*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-2.0+202464.0*x^35.0-29760.0*x^29.0-33744.0*x^35.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0+202464.0*35.0*x^34.0-29760.0*29.0*x^28.0-33744.0*35.0*x^34.0";
 UsageCalculus.EqnSolArrayMap2[4] = "7086240.0*x^34.0-863040.0*x^28.0-1181040.0*x^34.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/360.0*x^6.0+1.0/15990.0*x^41.0-1.0/39270.0*x^35.0-1.0/6.0*x^3.0-1.0/95940.0*x^41.0+1.0/2.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/360.0/7.0*x^7.0+1.0/15990.0/42.0*x^42.0-1.0/39270.0/36.0*x^36.0-1.0/6.0/4.0*x^4.0-1.0/95940.0/42.0*x^42.0+1.0/2.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/2520.0*x^7.0+1.0/671580.0*x^42.0-1.0/1413720.0*x^36.0-1.0/24.0*x^4.0-1.0/4029480.0*x^42.0+1.0/8.0*x^4.0";
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

public static void TestCaseDiff121178() {
 UsageCalculus.TestCase = 121178;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*x0^2*-1*x0^3*2*x01*xy^3*2*xy/3*xy^2*--1*xy^32*xy3*x0^2*--1*x0^3-1*xy^3*2*xy/3*xy^22*xy/3*xy^2*-1*xy^3*-3*xy3*x0^21*xy^3*-3*xy-3*xy/1*xy^2*-2*xy^31*x0^2*-2*x0^3*3*x0/-1*x0^2-3*x0^2*-1*x0^31*xy^3*2*xy";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=177 EqnNumber=80 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[37, 80, 10, 11, 2, 3, 1, 7, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 5, 3, 1, 7, 3, 1, 2, 3, 7, 3, 4, 5, 2, 23, 8, 25, 2]"+
"// DOEMatrixRow=[68, 82, 12, 3, 2, 3, 1, 5, 3, 4, 1, 1, 1, 2, 3, 1, 2, 32, 1, 3, 1, 3, 1, 2, 3, 1, 1, 2, 3, 4, 1, 4, 20]"+
//Tail EqnIndex=177 EqnNumber=80 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[37, 80, 10, 11, 2, 3, 1, 7, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 5, 3, 1, 7, 3, 1, 2, 3, 7, 3, 4, 5, 2, 23, 8, 25, 2]"+
"// DOEMatrixRow=[68, 82, 12, 3, 2, 3, 1, 5, 3, 4, 1, 1, 1, 2, 3, 1, 2, 32, 1, 3, 1, 3, 1, 2, 3, 1, 1, 2, 3, 4, 1, 4, 20]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0*4.0*xy^38.0-x0^2.0*xy^32.0-x0^3.0+x0^21.0*2.0*xy^36.0+x0^2.0*x0*36.0*xy^34.0+x0^2.0*6.0*xy^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0*4.0*38.0*xy^37.0-x0^2.0*32.0*xy^31.0-x0^3.0*0.0+x0^21.0*2.0*36.0*xy^35.0+x0^2.0*x0*36.0*34.0*xy^33.0+x0^2.0*6.0*4.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*152.0*xy^37.0-x0^2.0*32.0*xy^31.0-x0^3.0*0.0+x0^21.0*72.0*xy^35.0+x0^2.0*x0*1224.0*xy^33.0+x0^2.0*24.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0*4.0*xy^38.0-x0^2.0*xy^32.0-x0^3.0+x0^21.0*2.0*xy^36.0+x0^2.0*x0*36.0*xy^34.0+x0^2.0*6.0*xy^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0*4.0/39.0*xy^39.0-x0^2.0/33.0*xy^33.0-x0^3.0*xy+x0^21.0*2.0/37.0*xy^37.0+x0^2.0*x0*36.0/35.0*xy^35.0+x0^2.0*6.0/5.0*xy^5.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0*0.10256410256410256*xy^39.0-x0^2.0/33.0*xy^33.0-x0^3.0*xy+x0^21.0*0.05405405405405406*xy^37.0+x0^2.0*x0*1.0285714285714285*xy^35.0+x0^2.0*1.2*xy^5.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*152.0*xy^37.0-x0^2.0*32.0*xy^31.0-x0^3.0*0.0+x0^21.0*72.0*xy^35.0+x0^2.0*x0*1224.0*xy^33.0+x0^2.0*24.0*xy^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*152.0*37.0*xy^36.0-x0^2.0*32.0*31.0*xy^30.0-x0^3.0*0.0*0.0+x0^21.0*72.0*35.0*xy^34.0+x0^2.0*x0*1224.0*33.0*xy^32.0+x0^2.0*24.0*3.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*5624.0*xy^36.0-x0^2.0*992.0*xy^30.0-x0^3.0*0.0+x0^21.0*2520.0*xy^34.0+x0^2.0*x0*40392.0*xy^32.0+x0^2.0*72.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0*0.10256410256410256*xy^39.0-x0^2.0/33.0*xy^33.0-x0^3.0*xy+x0^21.0*0.05405405405405406*xy^37.0+x0^2.0*x0*1.0285714285714285*xy^35.0+x0^2.0*1.2*xy^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0*0.10256410256410256/40.0*xy^40.0-x0^2.0/33.0/34.0*xy^34.0-x0^3.0/2.0*xy^2.0+x0^21.0*0.05405405405405406/38.0*xy^38.0+x0^2.0*x0*1.0285714285714285/36.0*xy^36.0+x0^2.0*1.2/6.0*xy^6.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0*0.002564102564102564*xy^40.0-x0^2.0*8.9126559714795E-4*xy^34.0-x0^3.0/2.0*xy^2.0+x0^21.0*0.001422475106685633*xy^38.0+x0^2.0*x0*0.028571428571428567*xy^36.0+x0^2.0/5.0*xy^6.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*5624.0*xy^36.0-x0^2.0*992.0*xy^30.0-x0^3.0*0.0+x0^21.0*2520.0*xy^34.0+x0^2.0*x0*40392.0*xy^32.0+x0^2.0*72.0*xy^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*5624.0*36.0*xy^35.0-x0^2.0*992.0*30.0*xy^29.0-x0^3.0*0.0*0.0+x0^21.0*2520.0*34.0*xy^33.0+x0^2.0*x0*40392.0*32.0*xy^31.0+x0^2.0*72.0*2.0*xy^1.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*202464.0*xy^35.0-x0^2.0*29760.0*xy^29.0-x0^3.0*0.0+x0^21.0*85680.0*xy^33.0+x0^2.0*x0*1292544.0*xy^31.0+x0^2.0*144.0*xy";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0*0.002564102564102564*xy^40.0-x0^2.0*8.9126559714795E-4*xy^34.0-4.0*xy^34.0-x0^3.0/2.0*xy^2.0+x0^21.0*0.001422475106685633*xy^38.0+x0^2.0*x0*0.028571428571428567*xy^36.0+x0^2.0/5.0*xy^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0*0.002564102564102564/41.0*xy^41.0-x0^2.0*8.9126559714795E-4/35.0*xy^35.0-4.0/35.0*xy^35.0-x0^3.0/2.0/3.0*xy^3.0+x0^21.0*0.001422475106685633/39.0*xy^39.0+x0^2.0*x0*0.028571428571428567/37.0*xy^37.0+x0^2.0*5.0/7.0*xy^7.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0*6.253908692933083E-5*xy^41.0-x0^2.0/39270.0*xy^35.0-1.0/8.75*xy^35.0-0.11428571428571428*xy^35.0-x0^3.0*0.16666666666666666*xy^3.0+x0^21.0*3.6473720684247E-5*xy^39.0+x0^2.0*x0*7.722007722007721E-4*xy^37.0+x0^2.0/1.4*xy^7.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*202464.0*xy^35.0-x0^2.0*29760.0*xy^29.0-x0^3.0*0.0+x0^21.0*85680.0*xy^33.0+x0^2.0*x0*1292544.0*xy^31.0+x0^2.0*144.0*xy";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*202464.0*35.0*xy^34.0-x0^2.0*29760.0*29.0*xy^28.0-x0^3.0*0.0*0.0+x0^21.0*85680.0*33.0*xy^32.0+x0^2.0*x0*1292544.0*31.0*xy^30.0+x0^2.0*144.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*7086240.0*xy^34.0-x0^2.0*863040.0*xy^28.0-x0^3.0*0.0+x0^21.0*2827440.0*xy^32.0+x0^2.0*x0*4.0068864E7*xy^30.0+x0^2.0*144.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0*6.253908692933083E-5*xy^41.0-5.0*xy^41.0-x0^2.0/39270.0*xy^35.0-1.0/8.75*xy^35.0-0.11428571428571428*xy^35.0-x0^3.0*0.16666666666666666*xy^3.0+x0^21.0*3.6473720684247E-5*xy^39.0-5.0*xy^39.0+x0^2.0*x0*7.722007722007721E-4*xy^37.0-4.0*xy^37.0+x0^2.0/1.4*xy^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0*6.253908692933083E-5/42.0*xy^42.0-5.0/42.0*xy^42.0-x0^2.0/39270.0/36.0*xy^36.0-1.0/8.75/36.0*xy^36.0-0.11428571428571428/36.0*xy^36.0-x0^3.0*0.16666666666666666/4.0*xy^4.0+x0^21.0*3.6473720684247E-5/40.0*xy^40.0-5.0/40.0*xy^40.0+x0^2.0*x0*7.722007722007721E-4/38.0*xy^38.0-4.0/38.0*xy^38.0+x0^2.0*1.4/8.0*xy^8.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0/671580.0*xy^42.0-1.0/8.4*xy^42.0-0.11904761904761904*xy^42.0-x0^2.0/1413720.0*xy^36.0-1.0/315.0*xy^36.0-0.0031746031746031746*xy^36.0-x0^3.0*0.041666666666666664*xy^4.0+x0^21.0/1096680.0*xy^40.0-1.0/8.0*xy^40.0-0.125*xy^40.0+x0^2.0*x0/49210.00000000001*xy^38.0-1.0/9.5*xy^38.0-0.10526315789473684*xy^38.0+x0^2.0/5.714285714285714*xy^8.0";
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

public static void TestCaseDiff121179() {
 UsageCalculus.TestCase = 121179;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xyz^3*2*xyz/3*xyz^2*--1*xyz^32*xyz3*x0^2*--1*x0^3-1*xyz^3*2*xyz/3*xyz^22*xyz/3*xyz^2*-1*xyz^3*-3*xyz3*x0^21*xyz^3*-3*xyz-3*xyz/1*xyz^2*-2*xyz^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyz^33*xyz/-1*xyz^21*xyz^3*2*xyz2*xyz/3*xyz^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=178 EqnNumber=81 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[2, 81, 11, 12, 3, 1, 2, 8, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 1, 1, 2, 8, 1, 2, 3, 4, 8, 1, 1, 6, 3, 24, 9, 26, 3]"+
"// DOEMatrixRow=[33, 83, 13, 4, 3, 1, 2, 6, 1, 1, 2, 1, 2, 3, 4, 2, 3, 33, 2, 1, 2, 4, 2, 3, 4, 2, 3, 1, 4, 5, 2, 5, 1]"+
//Tail EqnIndex=178 EqnNumber=81 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[2, 81, 11, 12, 3, 1, 2, 8, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 1, 1, 2, 8, 1, 2, 3, 4, 8, 1, 1, 6, 3, 24, 9, 26, 3]"+
"// DOEMatrixRow=[33, 83, 13, 4, 3, 1, 2, 6, 1, 1, 2, 1, 2, 3, 4, 2, 3, 33, 2, 1, 2, 4, 2, 3, 4, 2, 3, 1, 4, 5, 2, 5, 1]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0/1.5*xyz^38.0-x0^2.0*xyz^32.0-x0^3.0+x0^21.0*2.0*xyz^36.0-24.0*xyz^95.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0/1.5*38.0*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0+x0^21.0*2.0*36.0*xyz^35.0-24.0*95.0*xyz^94.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*25.333333333333332*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0+x0^21.0*72.0*xyz^35.0-2280.0*xyz^94.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0/1.5*xyz^38.0-x0^2.0*xyz^32.0-x0^3.0+x0^21.0*2.0*xyz^36.0-24.0*xyz^95.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0/1.5/39.0*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz+x0^21.0*2.0/37.0*xyz^37.0-24.0/96.0*xyz^96.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0*0.017094017094017096*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz+x0^21.0/18.5*xyz^37.0-1.0/4.0*xyz^96.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*25.333333333333332*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0+x0^21.0*72.0*xyz^35.0-2280.0*xyz^94.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*25.333333333333332*37.0*xyz^36.0-x0^2.0*32.0*31.0*xyz^30.0-x0^3.0*0.0*0.0+x0^21.0*72.0*35.0*xyz^34.0-2280.0*94.0*xyz^93.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*937.3333333333333*xyz^36.0-x0^2.0*992.0*xyz^30.0-x0^3.0*0.0+x0^21.0*2520.0*xyz^34.0-214320.0*xyz^93.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0*0.017094017094017096*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz+x0^21.0/18.5*xyz^37.0-1.0/4.0*xyz^96.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0*0.017094017094017096/40.0*xyz^40.0-x0^2.0/33.0/34.0*xyz^34.0-x0^3.0/2.0*xyz^2.0+x0^21.0/18.5/38.0*xyz^38.0-1.0/4.0/97.0*xyz^97.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0*4.273504273504274E-4*xyz^40.0-x0^2.0*8.9126559714795E-4*xyz^34.0-x0^3.0/2.0*xyz^2.0+x0^21.0/703.0*xyz^38.0-1.0/388.0*xyz^97.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*937.3333333333333*xyz^36.0-x0^2.0*992.0*xyz^30.0-x0^3.0*0.0+x0^21.0*2520.0*xyz^34.0-214320.0*xyz^93.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*937.3333333333333*36.0*xyz^35.0-x0^2.0*992.0*30.0*xyz^29.0-x0^3.0*0.0*0.0+x0^21.0*2520.0*34.0*xyz^33.0-214320.0*93.0*xyz^92.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*33744.0*xyz^35.0-x0^2.0*29760.0*xyz^29.0-x0^3.0*0.0+x0^21.0*85680.0*xyz^33.0-1.993176E7*xyz^92.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0*4.273504273504274E-4*xyz^40.0-4.0*xyz^40.0-x0^2.0*8.9126559714795E-4*xyz^34.0-4.0*xyz^34.0-x0^3.0/2.0*xyz^2.0+x0^21.0/703.0*xyz^38.0-1.0/388.0*xyz^97.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0*4.273504273504274E-4/41.0*xyz^41.0-4.0/41.0*xyz^41.0-x0^2.0*8.9126559714795E-4/35.0*xyz^35.0-4.0/35.0*xyz^35.0-x0^3.0/2.0/3.0*xyz^3.0+x0^21.0/703.0/39.0*xyz^39.0-1.0/388.0/98.0*xyz^98.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0/95939.99999999999*xyz^41.0-1.0/10.25*xyz^41.0-0.0975609756097561*xyz^41.0-x0^2.0/39270.0*xyz^35.0-1.0/8.75*xyz^35.0-0.11428571428571428*xyz^35.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^21.0/27417.0*xyz^39.0-1.0/38024.0*xyz^98.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*33744.0*xyz^35.0-x0^2.0*29760.0*xyz^29.0-x0^3.0*0.0+x0^21.0*85680.0*xyz^33.0-1.993176E7*xyz^92.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*33744.0*35.0*xyz^34.0-x0^2.0*29760.0*29.0*xyz^28.0-x0^3.0*0.0*0.0+x0^21.0*85680.0*33.0*xyz^32.0-0.0*92.0*xyz^91.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*1181040.0*xyz^34.0-x0^2.0*863040.0*xyz^28.0-x0^3.0*0.0+x0^21.0*2827440.0*xyz^32.0-0.0*xyz^91.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0/95939.99999999999*xyz^41.0-1.0/10.25*xyz^41.0-0.0975609756097561*xyz^41.0-x0^2.0/39270.0*xyz^35.0-1.0/8.75*xyz^35.0-0.11428571428571428*xyz^35.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^21.0/27417.0*xyz^39.0-1.0/38024.0*xyz^98.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0/95939.99999999999/42.0*xyz^42.0-1.0/10.25/42.0*xyz^42.0-0.0975609756097561/42.0*xyz^42.0-x0^2.0/39270.0/36.0*xyz^36.0-1.0/8.75/36.0*xyz^36.0-0.11428571428571428/36.0*xyz^36.0-x0^3.0*0.16666666666666666/4.0*xyz^4.0+x0^21.0/27417.0/40.0*xyz^40.0-1.0/38024.0/99.0*xyz^99.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0/4029479.9999999995*xyz^42.0-1.0/430.5*xyz^42.0-0.0023228803716608595*xyz^42.0-x0^2.0/1413720.0*xyz^36.0-1.0/315.0*xyz^36.0-0.0031746031746031746*xyz^36.0-x0^3.0*0.041666666666666664*xyz^4.0+x0^21.0/1096680.0*xyz^40.0-1.0/3764376.0*xyz^99.0";
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

public static void TestCaseDiff121180() {
 UsageCalculus.TestCase = 121180;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xyza3*x0^2*--1*x0^3-1*xyza^3*2*xyza/3*xyza^22*xyza/3*xyza^2*-1*xyza^3*-3*xyza3*x0^21*xyza^3*-3*xyza-3*xyza/1*xyza^2*-2*xyza^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyza^33*xyza/-1*xyza^2-1*x0^2*-2*x0^3*3*x02*xyza^3*3*xyza/1*xyza^2*--3*xyza^32*xyza/3*xyza^23*x0^2*--1*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=179 EqnNumber=82 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[67, 82, 12, 13, 4, 2, 3, 9, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 2, 3, 9, 2, 3, 1, 1, 9, 2, 3, 7, 4, 25, 10, 27, 4]"+
"// DOEMatrixRow=[99, 84, 14, 1, 1, 2, 3, 7, 2, 3, 4, 2, 3, 1, 1, 3, 1, 34, 3, 2, 3, 5, 3, 1, 5, 3, 1, 2, 1, 6, 1, 6, 2]"+
//Tail EqnIndex=179 EqnNumber=82 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[67, 82, 12, 13, 4, 2, 3, 9, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 2, 3, 9, 2, 3, 1, 1, 9, 2, 3, 7, 4, 25, 10, 27, 4]"+
"// DOEMatrixRow=[99, 84, 14, 1, 1, 2, 3, 7, 2, 3, 4, 2, 3, 1, 1, 3, 1, 34, 3, 2, 3, 5, 3, 1, 5, 3, 1, 2, 1, 6, 1, 6, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0*2.0-x0^3.0+x0^21.0*2.0*xyza^36.0-x0^2.0*x0*36.0*xyza^70.0+x0^2.0*x02*18.0*xyza^62.0-x0^2.0*xyza^56.0-x0^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0*2.0*0.0-x0^3.0*0.0+x0^21.0*2.0*36.0*xyza^35.0-x0^2.0*x0*36.0*70.0*xyza^69.0+x0^2.0*x02*18.0*62.0*xyza^61.0-x0^2.0*56.0*xyza^55.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*72.0*xyza^35.0-x0^2.0*x0*2520.0*xyza^69.0+x0^2.0*x02*1116.0*xyza^61.0-x0^2.0*56.0*xyza^55.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0*2.0-x0^3.0+x0^21.0*2.0*xyza^36.0-x0^2.0*x0*36.0*xyza^70.0+x0^2.0*x02*18.0*xyza^62.0-x0^2.0*xyza^56.0-x0^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0*xyza-x0^3.0*xyza+x0^21.0*2.0/37.0*xyza^37.0-x0^2.0*x0*36.0/71.0*xyza^71.0+x0^2.0*x02*18.0/63.0*xyza^63.0-x0^2.0/57.0*xyza^57.0-x0^3.0*xyza";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0*xyza-x0^3.0*xyza+x0^21.0*0.05405405405405406*xyza^37.0-x0^2.0*x0*0.5070422535211268*xyza^71.0+x0^2.0*x02*0.2857142857142857*xyza^63.0-x0^2.0/57.0*xyza^57.0-x0^3.0*xyza";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*72.0*xyza^35.0-x0^2.0*x0*2520.0*xyza^69.0+x0^2.0*x02*1116.0*xyza^61.0-x0^2.0*56.0*xyza^55.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^21.0*72.0*35.0*xyza^34.0-x0^2.0*x0*2520.0*69.0*xyza^68.0+x0^2.0*x02*1116.0*61.0*xyza^60.0-x0^2.0*56.0*55.0*xyza^54.0-x0^3.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*2520.0*xyza^34.0-x0^2.0*x0*173880.0*xyza^68.0+x0^2.0*x02*68076.0*xyza^60.0-x0^2.0*3080.0*xyza^54.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0*xyza-x0^3.0*xyza+x0^21.0*0.05405405405405406*xyza^37.0-x0^2.0*x0*0.5070422535211268*xyza^71.0+x0^2.0*x02*0.2857142857142857*xyza^63.0-x0^2.0/57.0*xyza^57.0-x0^3.0*xyza";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0/2.0*xyza^2.0-x0^3.0/2.0*xyza^2.0+x0^21.0*0.05405405405405406/38.0*xyza^38.0-x0^2.0*x0*0.5070422535211268/72.0*xyza^72.0+x0^2.0*x02*0.2857142857142857/64.0*xyza^64.0-x0^2.0/57.0/58.0*xyza^58.0-x0^3.0/2.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0/2.0*xyza^2.0-x0^3.0/2.0*xyza^2.0+x0^21.0*0.001422475106685633*xyza^38.0-x0^2.0*x0*0.007042253521126761*xyza^72.0+x0^2.0*x02*0.004464285714285714*xyza^64.0-x0^2.0*3.0248033877797946E-4*xyza^58.0-x0^3.0/2.0*xyza^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*2520.0*xyza^34.0-x0^2.0*x0*173880.0*xyza^68.0+x0^2.0*x02*68076.0*xyza^60.0-x0^2.0*3080.0*xyza^54.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^21.0*2520.0*34.0*xyza^33.0-x0^2.0*x0*173880.0*68.0*xyza^67.0+x0^2.0*x02*68076.0*60.0*xyza^59.0-x0^2.0*3080.0*54.0*xyza^53.0-x0^3.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*85680.0*xyza^33.0-x0^2.0*x0*1.182384E7*xyza^67.0+x0^2.0*x02*4084560.0*xyza^59.0-x0^2.0*166320.0*xyza^53.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0/2.0*xyza^2.0-x0^3.0/2.0*xyza^2.0+x0^21.0*0.001422475106685633*xyza^38.0-x0^2.0*x0*0.007042253521126761*xyza^72.0+x0^2.0*x02*0.004464285714285714*xyza^64.0-x0^2.0*3.0248033877797946E-4*xyza^58.0-4.0*xyza^58.0-x0^3.0/2.0*xyza^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0/2.0/3.0*xyza^3.0-x0^3.0/2.0/3.0*xyza^3.0+x0^21.0*0.001422475106685633/39.0*xyza^39.0-x0^2.0*x0*0.007042253521126761/73.0*xyza^73.0+x0^2.0*x02*0.004464285714285714/65.0*xyza^65.0-x0^2.0*3.0248033877797946E-4/59.0*xyza^59.0-4.0/59.0*xyza^59.0-x0^3.0*2.0/3.0*xyza^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0*0.16666666666666666*xyza^3.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^21.0*3.6473720684247E-5*xyza^39.0-x0^2.0*x0*9.646922631680494E-5*xyza^73.0+x0^2.0*x02*6.868131868131868E-5*xyza^65.0-x0^2.0/195053.99999999997*xyza^59.0-1.0/14.75*xyza^59.0-0.06779661016949153*xyza^59.0-x0^3.0/1.5*xyza^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*85680.0*xyza^33.0-x0^2.0*x0*1.182384E7*xyza^67.0+x0^2.0*x02*4084560.0*xyza^59.0-x0^2.0*166320.0*xyza^53.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^21.0*85680.0*33.0*xyza^32.0-x0^2.0*x0*1.182384E7*67.0*xyza^66.0+x0^2.0*x02*4084560.0*59.0*xyza^58.0-x0^2.0*166320.0*53.0*xyza^52.0-x0^3.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*2827440.0*xyza^32.0-x0^2.0*x0*7.9219728E8*xyza^66.0+x0^2.0*x02*2.4098904E8*xyza^58.0-x0^2.0*8814960.0*xyza^52.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0*0.16666666666666666*xyza^3.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^21.0*3.6473720684247E-5*xyza^39.0-5.0*xyza^39.0-x0^2.0*x0*9.646922631680494E-5*xyza^73.0-5.0*xyza^73.0+x0^2.0*x02*6.868131868131868E-5*xyza^65.0-5.0*xyza^65.0-x0^2.0/195053.99999999997*xyza^59.0-1.0/14.75*xyza^59.0-0.06779661016949153*xyza^59.0-x0^3.0/1.5*xyza^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0*0.16666666666666666/4.0*xyza^4.0-x0^3.0*0.16666666666666666/4.0*xyza^4.0+x0^21.0*3.6473720684247E-5/40.0*xyza^40.0-5.0/40.0*xyza^40.0-x0^2.0*x0*9.646922631680494E-5/74.0*xyza^74.0-5.0/74.0*xyza^74.0+x0^2.0*x02*6.868131868131868E-5/66.0*xyza^66.0-5.0/66.0*xyza^66.0-x0^2.0/195053.99999999997/60.0*xyza^60.0-1.0/14.75/60.0*xyza^60.0-0.06779661016949153/60.0*xyza^60.0-x0^3.0*1.5/4.0*xyza^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0*0.041666666666666664*xyza^4.0-x0^3.0*0.041666666666666664*xyza^4.0+x0^21.0/1096680.0*xyza^40.0-1.0/8.0*xyza^40.0-0.125*xyza^40.0-x0^2.0*x0/767084.0*xyza^74.0-1.0/14.8*xyza^74.0-0.06756756756756757*xyza^74.0+x0^2.0*x02/960960.0*xyza^66.0-1.0/13.2*xyza^66.0-0.07575757575757576*xyza^66.0-x0^2.0/1.1703239999999998E7*xyza^60.0-1.0/885.0*xyza^60.0-0.0011299435028248588*xyza^60.0-x0^3.0/2.6666666666666665*xyza^4.0";
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

public static void TestCaseDiff121181() {
 UsageCalculus.TestCase = 121181;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*x0^2*--1*x0^3-1*x^3*2*x/3*x^22*x/3*x^2*-1*x^3*-3*x3*x0^21*x^3*-3*x-3*x/1*x^2*-2*x^31*x0^2*-2*x0^3*3*x0/-1*x0^22*x^33*x/-1*x^2-1*x0^2*-2*x0^3*3*x02*x^3*3*x/1*x^2*--3*x^33*x1*x0^2*--3*x0^33*x0^2*--1*x0^3-1*x^3*2*x";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=180 EqnNumber=83 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[32, 83, 13, 14, 1, 3, 1, 10, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 3, 4, 10, 3, 1, 2, 3, 10, 3, 4, 8, 1, 26, 11, 28, 5]"+
"// DOEMatrixRow=[63, 85, 15, 2, 3, 1, 1, 8, 3, 4, 1, 1, 1, 2, 3, 1, 2, 35, 4, 3, 1, 1, 1, 2, 6, 4, 2, 3, 2, 7, 2, 7, 3]"+
//Tail EqnIndex=180 EqnNumber=83 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[32, 83, 13, 14, 1, 3, 1, 10, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 3, 4, 10, 3, 1, 2, 3, 10, 3, 4, 8, 1, 26, 11, 28, 5]"+
"// DOEMatrixRow=[63, 85, 15, 2, 3, 1, 1, 8, 3, 4, 1, 1, 1, 2, 3, 1, 2, 35, 4, 3, 1, 1, 1, 2, 6, 4, 2, 3, 2, 7, 2, 7, 3]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "3.0-1.0+2.0*x^36.0-36.0*x^70.0+162.0*x^39.0-9.0*x^33.0-3.0-1.0-2.0*x^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0-1.0*0.0+2.0*36.0*x^35.0-36.0*70.0*x^69.0+162.0*39.0*x^38.0-9.0*33.0*x^32.0-3.0*0.0-1.0*0.0-2.0*4.0*x^3.0";
 UsageCalculus.EqnSolArrayMap2[1] = "72.0*x^35.0-2520.0*x^69.0+6318.0*x^38.0-297.0*x^32.0-8.0*x^3.0";
 UsageCalculus.EqnSolArrayMap3[1] = "3.0-1.0+2.0*x^36.0-36.0*x^70.0+162.0*x^39.0-9.0*x^33.0-3.0-1.0-2.0*x^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "3.0*x-1.0*x+2.0/37.0*x^37.0-36.0/71.0*x^71.0+162.0/40.0*x^40.0-9.0/34.0*x^34.0-3.0*x-1.0*x-2.0/5.0*x^5.0";
 UsageCalculus.EqnSolArrayMap4[1] = "3.0*x-x+1.0/18.5*x^37.0-1.0/1.9722222222222223*x^71.0+4.05*x^40.0-1.0/3.7777777777777777*x^34.0-3.0*x-x-1.0/2.5*x^5.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "72.0*x^35.0-2520.0*x^69.0+6318.0*x^38.0-297.0*x^32.0-8.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "72.0*35.0*x^34.0-2520.0*69.0*x^68.0+6318.0*38.0*x^37.0-297.0*32.0*x^31.0-8.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[2] = "2520.0*x^34.0-173880.0*x^68.0+240084.0*x^37.0-9504.0*x^31.0-24.0*x^2.0";
 UsageCalculus.EqnSolArrayMap3[2] = "3.0*x-x+1.0/18.5*x^37.0-1.0/1.9722222222222223*x^71.0+4.05*x^40.0-1.0/3.7777777777777777*x^34.0-3.0*x-x-1.0/2.5*x^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "3.0/2.0*x^2.0-1.0/2.0*x^2.0+1.0/18.5/38.0*x^38.0-1.0/1.9722222222222223/72.0*x^72.0+4.05/41.0*x^41.0-1.0/3.7777777777777777/35.0*x^35.0-3.0/2.0*x^2.0-1.0/2.0*x^2.0-1.0/2.5/6.0*x^6.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.5*x^2.0-1.0/2.0*x^2.0+1.0/703.0*x^38.0-1.0/142.0*x^72.0+1.0/10.123456790123457*x^41.0-1.0/132.22222222222223*x^35.0-1.5*x^2.0-1.0/2.0*x^2.0-1.0/15.0*x^6.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "2520.0*x^34.0-173880.0*x^68.0+240084.0*x^37.0-9504.0*x^31.0-24.0*x^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "2520.0*34.0*x^33.0-173880.0*68.0*x^67.0+240084.0*37.0*x^36.0-9504.0*31.0*x^30.0-24.0*2.0*x^1.0";
 UsageCalculus.EqnSolArrayMap2[3] = "85680.0*x^33.0-1.182384E7*x^67.0+8883108.0*x^36.0-294624.0*x^30.0-48.0*x";
 UsageCalculus.EqnSolArrayMap3[3] = "1.5*x^2.0-1.0/2.0*x^2.0+1.0/703.0*x^38.0-1.0/142.0*x^72.0+1.0/10.123456790123457*x^41.0-1.0/132.22222222222223*x^35.0-1.5*x^2.0-1.0/2.0*x^2.0-1.0/15.0*x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.5/3.0*x^3.0-1.0/2.0/3.0*x^3.0+1.0/703.0/39.0*x^39.0-1.0/142.0/73.0*x^73.0+1.0/10.123456790123457/42.0*x^42.0-1.0/132.22222222222223/36.0*x^36.0-1.5/3.0*x^3.0-1.0/2.0/3.0*x^3.0-1.0/15.0/7.0*x^7.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/2.0*x^3.0-1.0/6.0*x^3.0+1.0/27417.0*x^39.0-1.0/10366.0*x^73.0+1.0/425.1851851851852*x^42.0-1.0/4760.0*x^36.0-1.0/2.0*x^3.0-1.0/6.0*x^3.0-1.0/105.0*x^7.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "85680.0*x^33.0-1.182384E7*x^67.0+8883108.0*x^36.0-294624.0*x^30.0-48.0*x";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "85680.0*33.0*x^32.0-67.0*x^66.0+8883108.0*36.0*x^35.0-294624.0*30.0*x^29.0-48.0";
 UsageCalculus.EqnSolArrayMap2[4] = "2827440.0*x^32.0-67.0*x^66.0+3.19791888E8*x^35.0-8838720.0*x^29.0-48.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/2.0*x^3.0-1.0/6.0*x^3.0+1.0/27417.0*x^39.0-1.0/10366.0*x^73.0+1.0/425.1851851851852*x^42.0-1.0/4760.0*x^36.0-1.0/2.0*x^3.0-1.0/6.0*x^3.0-1.0/105.0*x^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/2.0/4.0*x^4.0-1.0/6.0/4.0*x^4.0+1.0/27417.0/40.0*x^40.0-1.0/10366.0/74.0*x^74.0+1.0/425.1851851851852/43.0*x^43.0-1.0/4760.0/37.0*x^37.0-1.0/2.0/4.0*x^4.0-1.0/6.0/4.0*x^4.0-1.0/105.0/8.0*x^8.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/8.0*x^4.0-1.0/24.0*x^4.0+1.0/1096680.0*x^40.0-1.0/767084.0*x^74.0+1.0/18282.962962962964*x^43.0-1.0/176120.0*x^37.0-1.0/8.0*x^4.0-1.0/24.0*x^4.0-1.0/840.0*x^8.0";
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

public static void TestCaseDiff121182() {
 UsageCalculus.TestCase = 121182;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-1*xy^3*2*xy/3*xy^22*xy/3*xy^2*-1*xy^3*-3*xy3*x0^21*xy^3*-3*xy-3*xy/1*xy^2*-2*xy^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xy^33*xy/-1*xy^2-1*x0^2*-2*x0^3*3*x02*xy^3*3*xy/1*xy^2*--3*xy^33*xy1*x0^2*--3*x0^3-3*xy^3*1*xy/2*xy^21*xy/2*xy^2*-3*xy^3*-1*xy-1*xy^3*2*xy2*xy/3*xy^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=181 EqnNumber=84 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[98, 84, 14, 15, 2, 1, 2, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 1, 1, 11, 1, 2, 3, 4, 11, 1, 1, 9, 2, 27, 12, 29, 6]"+
"// DOEMatrixRow=[28, 86, 16, 3, 1, 2, 3, 9, 1, 1, 2, 1, 2, 3, 4, 2, 3, 36, 5, 1, 2, 3, 2, 3, 1, 1, 3, 1, 3, 8, 1, 8, 4]"+
//Tail EqnIndex=181 EqnNumber=84 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[98, 84, 14, 15, 2, 1, 2, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 1, 1, 11, 1, 2, 3, 4, 11, 1, 1, 9, 2, 27, 12, 29, 6]"+
"// DOEMatrixRow=[28, 86, 16, 3, 1, 2, 3, 9, 1, 1, 2, 1, 2, 3, 4, 2, 3, 36, 5, 1, 2, 3, 2, 3, 1, 1, 3, 1, 3, 8, 1, 8, 4]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^21.0*2.0*xy^36.0-x0^2.0*x0*36.0*xy^70.0+x0^2.0*162.0*xy^39.0-x0^2.0*9.0*xy^33.0-x0^3.0*3.0-2.25*xy^32.0-1.0/1.5*xy^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^21.0*2.0*36.0*xy^35.0-x0^2.0*x0*36.0*70.0*xy^69.0+x0^2.0*162.0*39.0*xy^38.0-x0^2.0*9.0*33.0*xy^32.0-x0^3.0*3.0*0.0-2.25*32.0*xy^31.0-1.0/1.5*6.0*xy^5.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^21.0*72.0*xy^35.0-x0^2.0*x0*2520.0*xy^69.0+x0^2.0*6318.0*xy^38.0-x0^2.0*297.0*xy^32.0-x0^3.0*0.0-72.0*xy^31.0-4.0*xy^5.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^21.0*2.0*xy^36.0-x0^2.0*x0*36.0*xy^70.0+x0^2.0*162.0*xy^39.0-x0^2.0*9.0*xy^33.0-x0^3.0*3.0-2.25*xy^32.0-1.0/1.5*xy^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^21.0*2.0/37.0*xy^37.0-x0^2.0*x0*36.0/71.0*xy^71.0+x0^2.0*162.0/40.0*xy^40.0-x0^2.0*9.0/34.0*xy^34.0-x0^3.0*xy-2.25/33.0*xy^33.0-1.0/1.5/7.0*xy^7.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^21.0*0.05405405405405406*xy^37.0-x0^2.0*x0*0.5070422535211268*xy^71.0+x0^2.0*4.05*xy^40.0-x0^2.0*0.2647058823529412*xy^34.0-x0^3.0*xy-1.0/14.666666666666666*xy^33.0-1.0/10.5*xy^7.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^21.0*72.0*xy^35.0-x0^2.0*x0*2520.0*xy^69.0+x0^2.0*6318.0*xy^38.0-x0^2.0*297.0*xy^32.0-x0^3.0*0.0-72.0*xy^31.0-4.0*xy^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^21.0*72.0*35.0*xy^34.0-x0^2.0*x0*2520.0*69.0*xy^68.0+x0^2.0*6318.0*38.0*xy^37.0-x0^2.0*297.0*32.0*xy^31.0-x0^3.0*0.0*0.0-72.0*31.0*xy^30.0-4.0*5.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^21.0*2520.0*xy^34.0-x0^2.0*x0*173880.0*xy^68.0+x0^2.0*240084.0*xy^37.0-x0^2.0*9504.0*xy^31.0-x0^3.0*0.0-2232.0*xy^30.0-20.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^21.0*0.05405405405405406*xy^37.0-x0^2.0*x0*0.5070422535211268*xy^71.0+x0^2.0*4.05*xy^40.0-x0^2.0*0.2647058823529412*xy^34.0-x0^3.0*xy-1.0/14.666666666666666*xy^33.0-1.0/10.5*xy^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^21.0*0.05405405405405406/38.0*xy^38.0-x0^2.0*x0*0.5070422535211268/72.0*xy^72.0+x0^2.0*4.05/41.0*xy^41.0-x0^2.0*0.2647058823529412/35.0*xy^35.0-x0^3.0/2.0*xy^2.0-1.0/14.666666666666666/34.0*xy^34.0-1.0/10.5/8.0*xy^8.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^21.0*0.001422475106685633*xy^38.0-x0^2.0*x0*0.007042253521126761*xy^72.0+x0^2.0*0.09878048780487804*xy^41.0-x0^2.0*0.007563025210084034*xy^35.0-x0^3.0/2.0*xy^2.0-1.0/498.66666666666663*xy^34.0-1.0/84.0*xy^8.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^21.0*2520.0*xy^34.0-x0^2.0*x0*173880.0*xy^68.0+x0^2.0*240084.0*xy^37.0-x0^2.0*9504.0*xy^31.0-x0^3.0*0.0-2232.0*xy^30.0-20.0*xy^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^21.0*2520.0*34.0*xy^33.0-x0^2.0*x0*173880.0*68.0*xy^67.0+x0^2.0*240084.0*37.0*xy^36.0-x0^2.0*9504.0*31.0*xy^30.0-x0^3.0*0.0*0.0-2232.0*30.0*xy^29.0-20.0*4.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^21.0*85680.0*xy^33.0-x0^2.0*x0*1.182384E7*xy^67.0+x0^2.0*8883108.0*xy^36.0-x0^2.0*294624.0*xy^30.0-x0^3.0*0.0-66960.0*xy^29.0-80.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^21.0*0.001422475106685633*xy^38.0-x0^2.0*x0*0.007042253521126761*xy^72.0+x0^2.0*0.09878048780487804*xy^41.0-x0^2.0*0.007563025210084034*xy^35.0-x0^3.0/2.0*xy^2.0-1.0/498.66666666666663*xy^34.0-1.0/84.0*xy^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^21.0*0.001422475106685633/39.0*xy^39.0-x0^2.0*x0*0.007042253521126761/73.0*xy^73.0+x0^2.0*0.09878048780487804/42.0*xy^42.0-x0^2.0*0.007563025210084034/36.0*xy^36.0-x0^3.0/2.0/3.0*xy^3.0-1.0/498.66666666666663/35.0*xy^35.0-1.0/84.0/9.0*xy^9.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^21.0*3.6473720684247E-5*xy^39.0-x0^2.0*x0*9.646922631680494E-5*xy^73.0+x0^2.0*0.00235191637630662*xy^42.0-x0^2.0*2.100840336134454E-4*xy^36.0-x0^3.0/6.0*xy^3.0-1.0/17453.333333333332*xy^35.0-1.0/756.0*xy^9.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^21.0*85680.0*xy^33.0-x0^2.0*x0*1.182384E7*xy^67.0+x0^2.0*8883108.0*xy^36.0-x0^2.0*294624.0*xy^30.0-x0^3.0*0.0-66960.0*xy^29.0-80.0*xy^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^21.0*85680.0*33.0*xy^32.0-x0^2.0*x0*1.182384E7*67.0*xy^66.0+x0^2.0*8883108.0*36.0*xy^35.0-x0^2.0*294624.0*30.0*xy^29.0-x0^3.0*0.0*0.0-66960.0*29.0*xy^28.0-80.0*3.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^21.0*2827440.0*xy^32.0-x0^2.0*x0*7.9219728E8*xy^66.0+x0^2.0*3.19791888E8*xy^35.0-x0^2.0*8838720.0*xy^29.0-x0^3.0*0.0-1941840.0*xy^28.0-240.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^21.0*3.6473720684247E-5*xy^39.0-5.0*xy^39.0-x0^2.0*x0*9.646922631680494E-5*xy^73.0-5.0*xy^73.0+x0^2.0*0.00235191637630662*xy^42.0-x0^2.0*2.100840336134454E-4*xy^36.0-4.0*xy^36.0-x0^3.0/6.0*xy^3.0-1.0/17453.333333333332*xy^35.0-1.0/756.0*xy^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^21.0*3.6473720684247E-5/40.0*xy^40.0-5.0/40.0*xy^40.0-x0^2.0*x0*9.646922631680494E-5/74.0*xy^74.0-5.0/74.0*xy^74.0+x0^2.0*0.00235191637630662/43.0*xy^43.0-x0^2.0*2.100840336134454E-4/37.0*xy^37.0-4.0/37.0*xy^37.0-x0^3.0/6.0/4.0*xy^4.0-1.0/17453.333333333332/36.0*xy^36.0-1.0/756.0/10.0*xy^10.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^21.0/1096680.0*xy^40.0-1.0/8.0*xy^40.0-0.125*xy^40.0-x0^2.0*x0/767084.0*xy^74.0-1.0/14.8*xy^74.0-0.06756756756756757*xy^74.0+x0^2.0*5.46957296815493E-5*xy^43.0-x0^2.0/176120.0*xy^37.0-1.0/9.25*xy^37.0-0.10810810810810811*xy^37.0-x0^3.0/24.0*xy^4.0-1.0/628320.0*xy^36.0-1.0/7560.0*xy^10.0";
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

public static void TestCaseDiff121183() {
 UsageCalculus.TestCase = 121183;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xyz/3*xyz^2*-1*xyz^3*-3*xyz3*x0^21*xyz^3*-3*xyz-3*xyz/1*xyz^2*-2*xyz^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyz^33*xyz/-1*xyz^2-1*x0^2*-2*x0^3*3*x02*xyz^3*3*xyz/1*xyz^2*--3*xyz^33*xyz1*x0^2*--3*x0^3-3*xyz^3*1*xyz/2*xyz^21*xyz/2*xyz^2*-3*xyz^3*-1*xyz2*x0^22*xyz^3*-3*xyz2*xyz/3*xyz^23*x0^2*-1*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=182 EqnNumber=85 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[62, 85, 15, 16, 3, 2, 3, 2, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 2, 3, 12, 2, 3, 1, 1, 12, 2, 3, 10, 3, 28, 13, 30, 7]"+
"// DOEMatrixRow=[94, 87, 17, 4, 2, 3, 1, 10, 2, 3, 4, 2, 3, 1, 1, 3, 1, 37, 6, 2, 3, 4, 3, 1, 2, 3, 1, 2, 4, 9, 2, 9, 5]"+
//Tail EqnIndex=182 EqnNumber=85 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[62, 85, 15, 16, 3, 2, 3, 2, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 2, 3, 12, 2, 3, 1, 1, 12, 2, 3, 10, 3, 28, 13, 30, 7]"+
"// DOEMatrixRow=[94, 87, 17, 4, 2, 3, 1, 10, 2, 3, 4, 2, 3, 1, 1, 3, 1, 37, 6, 2, 3, 4, 3, 1, 2, 3, 1, 2, 4, 9, 2, 9, 5]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^21.0*6.0*xyz^10.0-x0^2.0*x0*36.0*xyz^70.0+x0^2.0*162.0*xyz^39.0-x0^2.0*9.0*xyz^33.0-x0^3.0*3.0-x0^2.0*2.25*xyz^58.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^21.0*6.0*10.0*xyz^9.0-x0^2.0*x0*36.0*70.0*xyz^69.0+x0^2.0*162.0*39.0*xyz^38.0-x0^2.0*9.0*33.0*xyz^32.0-x0^3.0*3.0*0.0-x0^2.0*2.25*58.0*xyz^57.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^21.0*60.0*xyz^9.0-x0^2.0*x0*2520.0*xyz^69.0+x0^2.0*6318.0*xyz^38.0-x0^2.0*297.0*xyz^32.0-x0^3.0*0.0-x0^2.0*130.5*xyz^57.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^21.0*6.0*xyz^10.0-x0^2.0*x0*36.0*xyz^70.0+x0^2.0*162.0*xyz^39.0-x0^2.0*9.0*xyz^33.0-x0^3.0*3.0-x0^2.0*2.25*xyz^58.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^21.0*6.0/11.0*xyz^11.0-x0^2.0*x0*36.0/71.0*xyz^71.0+x0^2.0*162.0/40.0*xyz^40.0-x0^2.0*9.0/34.0*xyz^34.0-x0^3.0*xyz-x0^2.0*2.25/59.0*xyz^59.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^21.0*0.5454545454545454*xyz^11.0-x0^2.0*x0*0.5070422535211268*xyz^71.0+x0^2.0*4.05*xyz^40.0-x0^2.0*0.2647058823529412*xyz^34.0-x0^3.0*xyz-x0^2.0/26.22222222222222*xyz^59.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^21.0*60.0*xyz^9.0-x0^2.0*x0*2520.0*xyz^69.0+x0^2.0*6318.0*xyz^38.0-x0^2.0*297.0*xyz^32.0-x0^3.0*0.0-x0^2.0*130.5*xyz^57.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^21.0*60.0*9.0*xyz^8.0-x0^2.0*x0*2520.0*69.0*xyz^68.0+x0^2.0*6318.0*38.0*xyz^37.0-x0^2.0*297.0*32.0*xyz^31.0-x0^3.0*0.0*0.0-x0^2.0*130.5*57.0*xyz^56.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^21.0*540.0*xyz^8.0-x0^2.0*x0*173880.0*xyz^68.0+x0^2.0*240084.0*xyz^37.0-x0^2.0*9504.0*xyz^31.0-x0^3.0*0.0-x0^2.0*7438.5*xyz^56.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^21.0*0.5454545454545454*xyz^11.0-x0^2.0*x0*0.5070422535211268*xyz^71.0+x0^2.0*4.05*xyz^40.0-x0^2.0*0.2647058823529412*xyz^34.0-x0^3.0*xyz-x0^2.0/26.22222222222222*xyz^59.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^21.0*0.5454545454545454/12.0*xyz^12.0-x0^2.0*x0*0.5070422535211268/72.0*xyz^72.0+x0^2.0*4.05/41.0*xyz^41.0-x0^2.0*0.2647058823529412/35.0*xyz^35.0-x0^3.0/2.0*xyz^2.0-x0^2.0*26.22222222222222/60.0*xyz^60.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^21.0*0.04545454545454545*xyz^12.0-x0^2.0*x0*0.007042253521126761*xyz^72.0+x0^2.0*0.09878048780487804*xyz^41.0-x0^2.0*0.007563025210084034*xyz^35.0-x0^3.0/2.0*xyz^2.0-x0^2.0/2.288135593220339*xyz^60.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^21.0*540.0*xyz^8.0-x0^2.0*x0*173880.0*xyz^68.0+x0^2.0*240084.0*xyz^37.0-x0^2.0*9504.0*xyz^31.0-x0^3.0*0.0-x0^2.0*7438.5*xyz^56.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^21.0*540.0*8.0*xyz^7.0-x0^2.0*x0*173880.0*68.0*xyz^67.0+x0^2.0*240084.0*37.0*xyz^36.0-x0^2.0*9504.0*31.0*xyz^30.0-x0^3.0*0.0*0.0-x0^2.0*7438.5*56.0*xyz^55.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^21.0*4320.0*xyz^7.0-x0^2.0*x0*1.182384E7*xyz^67.0+x0^2.0*8883108.0*xyz^36.0-x0^2.0*294624.0*xyz^30.0-x0^3.0*0.0-x0^2.0*416556.0*xyz^55.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^21.0*0.04545454545454545*xyz^12.0-x0^2.0*x0*0.007042253521126761*xyz^72.0+x0^2.0*0.09878048780487804*xyz^41.0-x0^2.0*0.007563025210084034*xyz^35.0-x0^3.0/2.0*xyz^2.0-x0^2.0/2.288135593220339*xyz^60.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^21.0*0.04545454545454545/13.0*xyz^13.0-x0^2.0*x0*0.007042253521126761/73.0*xyz^73.0+x0^2.0*0.09878048780487804/42.0*xyz^42.0-x0^2.0*0.007563025210084034/36.0*xyz^36.0-x0^3.0/2.0/3.0*xyz^3.0-x0^2.0*2.288135593220339/61.0*xyz^61.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^21.0*0.003496503496503496*xyz^13.0-x0^2.0*x0*9.646922631680494E-5*xyz^73.0+x0^2.0*0.00235191637630662*xyz^42.0-x0^2.0*2.100840336134454E-4*xyz^36.0-x0^3.0*0.16666666666666666*xyz^3.0-x0^2.0/26.659259259259258*xyz^61.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^21.0*4320.0*xyz^7.0-x0^2.0*x0*1.182384E7*xyz^67.0+x0^2.0*8883108.0*xyz^36.0-x0^2.0*294624.0*xyz^30.0-x0^3.0*0.0-x0^2.0*416556.0*xyz^55.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^21.0*4320.0*7.0*xyz^6.0-x0^2.0*x0*1.182384E7*67.0*xyz^66.0+x0^2.0*8883108.0*36.0*xyz^35.0-x0^2.0*294624.0*30.0*xyz^29.0-x0^3.0*0.0*0.0-x0^2.0*416556.0*55.0*xyz^54.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^21.0*30240.0*xyz^6.0-x0^2.0*x0*7.9219728E8*xyz^66.0+x0^2.0*3.19791888E8*xyz^35.0-x0^2.0*8838720.0*xyz^29.0-x0^3.0*0.0-x0^2.0*2.291058E7*xyz^54.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^21.0*0.003496503496503496*xyz^13.0-x0^2.0*x0*9.646922631680494E-5*xyz^73.0-5.0*xyz^73.0+x0^2.0*0.00235191637630662*xyz^42.0-x0^2.0*2.100840336134454E-4*xyz^36.0-4.0*xyz^36.0-x0^3.0*0.16666666666666666*xyz^3.0-x0^2.0/26.659259259259258*xyz^61.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^21.0*0.003496503496503496/14.0*xyz^14.0-x0^2.0*x0*9.646922631680494E-5/74.0*xyz^74.0-5.0/74.0*xyz^74.0+x0^2.0*0.00235191637630662/43.0*xyz^43.0-x0^2.0*2.100840336134454E-4/37.0*xyz^37.0-4.0/37.0*xyz^37.0-x0^3.0*0.16666666666666666/4.0*xyz^4.0-x0^2.0*26.659259259259258/62.0*xyz^62.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^21.0*2.497502497502497E-4*xyz^14.0-x0^2.0*x0/767084.0*xyz^74.0-1.0/14.8*xyz^74.0-0.06756756756756757*xyz^74.0+x0^2.0*5.46957296815493E-5*xyz^43.0-x0^2.0/176120.0*xyz^37.0-1.0/9.25*xyz^37.0-0.10810810810810811*xyz^37.0-x0^3.0*0.041666666666666664*xyz^4.0-x0^2.0/2.3256460127813283*xyz^62.0";
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

public static void TestCaseDiff121184() {
 UsageCalculus.TestCase = 121184;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*x0^21*xyza^3*-3*xyza-3*xyza/1*xyza^2*-2*xyza^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyza^33*xyza/-1*xyza^2-1*x0^2*-2*x0^3*3*x02*xyza^3*3*xyza/1*xyza^2*--3*xyza^33*xyza1*x0^2*--3*x0^3-3*xyza^3*1*xyza/2*xyza^21*xyza/2*xyza^2*-3*xyza^3*-1*xyza2*x0^22*xyza^3*-3*xyza-3*xyza/1*xyza^2*-2*xyza^31*x0^2*-2*x0^3*3*x0/-1*x0^23*x0^2*-1*x0^31*xyza^3*-3*xyza";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=183 EqnNumber=86 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[27, 86, 16, 17, 4, 3, 1, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 4, 13, 3, 1, 2, 3, 13, 3, 4, 11, 4, 29, 14, 31, 8]"+
"// DOEMatrixRow=[58, 88, 18, 1, 3, 1, 2, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 38, 7, 3, 1, 5, 1, 2, 3, 4, 2, 3, 1, 10, 1, 10, 6]"+
//Tail EqnIndex=183 EqnNumber=86 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[27, 86, 16, 17, 4, 3, 1, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 4, 13, 3, 1, 2, 3, 13, 3, 4, 11, 4, 29, 14, 31, 8]"+
"// DOEMatrixRow=[58, 88, 18, 1, 3, 1, 2, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 38, 7, 3, 1, 5, 1, 2, 3, 4, 2, 3, 1, 10, 1, 10, 6]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^21.0*9.0*xyza^4.0-x0^2.0*x0*36.0*xyza^70.0+x0^2.0*162.0*xyza^39.0-x0^2.0*9.0*xyza^33.0-x0^3.0*3.0+x0^22.0*6.75*xyza^35.0+x0^2.0*x0*108.0*xyza^38.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^21.0*9.0*4.0*xyza^3.0-x0^2.0*x0*36.0*70.0*xyza^69.0+x0^2.0*162.0*39.0*xyza^38.0-x0^2.0*9.0*33.0*xyza^32.0-x0^3.0*3.0*0.0+x0^22.0*6.75*35.0*xyza^34.0+x0^2.0*x0*38.0*xyza^37.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^21.0*36.0*xyza^3.0-x0^2.0*x0*2520.0*xyza^69.0+x0^2.0*6318.0*xyza^38.0-x0^2.0*297.0*xyza^32.0-x0^3.0*0.0+x0^22.0*236.25*xyza^34.0+x0^2.0*x0*38.0*xyza^37.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^21.0*9.0*xyza^4.0-x0^2.0*x0*36.0*xyza^70.0+x0^2.0*162.0*xyza^39.0-x0^2.0*9.0*xyza^33.0-x0^3.0*3.0+x0^22.0*6.75*xyza^35.0+x0^2.0*x0*108.0*xyza^38.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^21.0*9.0/5.0*xyza^5.0-x0^2.0*x0*36.0/71.0*xyza^71.0+x0^2.0*162.0/40.0*xyza^40.0-x0^2.0*9.0/34.0*xyza^34.0-x0^3.0*xyza+x0^22.0*6.75/36.0*xyza^36.0+x0^2.0*x0*108.0/39.0*xyza^39.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^21.0*1.8*xyza^5.0-x0^2.0*x0*0.5070422535211268*xyza^71.0+x0^2.0*4.05*xyza^40.0-x0^2.0*0.2647058823529412*xyza^34.0-x0^3.0*xyza+x0^22.0*0.1875*xyza^36.0+x0^2.0*x0*2.769230769230769*xyza^39.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^21.0*36.0*xyza^3.0-x0^2.0*x0*2520.0*xyza^69.0+x0^2.0*6318.0*xyza^38.0-x0^2.0*297.0*xyza^32.0-x0^3.0*0.0+x0^22.0*236.25*xyza^34.0+x0^2.0*x0*38.0*xyza^37.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^21.0*36.0*3.0*xyza^2.0-x0^2.0*x0*2520.0*69.0*xyza^68.0+x0^2.0*6318.0*38.0*xyza^37.0-x0^2.0*297.0*32.0*xyza^31.0-x0^3.0*0.0*0.0+x0^22.0*236.25*34.0*xyza^33.0+x0^2.0*x0*37.0*xyza^36.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^21.0*108.0*xyza^2.0-x0^2.0*x0*173880.0*xyza^68.0+x0^2.0*240084.0*xyza^37.0-x0^2.0*9504.0*xyza^31.0-x0^3.0*0.0+x0^22.0*8032.5*xyza^33.0+x0^2.0*x0*37.0*xyza^36.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^21.0*1.8*xyza^5.0-x0^2.0*x0*0.5070422535211268*xyza^71.0+x0^2.0*4.05*xyza^40.0-x0^2.0*0.2647058823529412*xyza^34.0-x0^3.0*xyza+x0^22.0*0.1875*xyza^36.0+x0^2.0*x0*2.769230769230769*xyza^39.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^21.0*1.8/6.0*xyza^6.0-x0^2.0*x0*0.5070422535211268/72.0*xyza^72.0+x0^2.0*4.05/41.0*xyza^41.0-x0^2.0*0.2647058823529412/35.0*xyza^35.0-x0^3.0/2.0*xyza^2.0+x0^22.0*0.1875/37.0*xyza^37.0+x0^2.0*x0*2.769230769230769/40.0*xyza^40.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^21.0*0.3*xyza^6.0-x0^2.0*x0*0.007042253521126761*xyza^72.0+x0^2.0*0.09878048780487804*xyza^41.0-x0^2.0*0.007563025210084034*xyza^35.0-x0^3.0/2.0*xyza^2.0+x0^22.0*0.005067567567567568*xyza^37.0+x0^2.0*x0/14.444444444444445*xyza^40.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^21.0*108.0*xyza^2.0-x0^2.0*x0*173880.0*xyza^68.0+x0^2.0*240084.0*xyza^37.0-x0^2.0*9504.0*xyza^31.0-x0^3.0*0.0+x0^22.0*8032.5*xyza^33.0+x0^2.0*x0*37.0*xyza^36.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^21.0*108.0*2.0*xyza^1.0-x0^2.0*x0*173880.0*68.0*xyza^67.0+x0^2.0*240084.0*37.0*xyza^36.0-x0^2.0*9504.0*31.0*xyza^30.0-x0^3.0*0.0*0.0+x0^22.0*8032.5*33.0*xyza^32.0+x0^2.0*x0*36.0*xyza^35.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^21.0*216.0*xyza-x0^2.0*x0*1.182384E7*xyza^67.0+x0^2.0*8883108.0*xyza^36.0-x0^2.0*294624.0*xyza^30.0-x0^3.0*0.0+x0^22.0*265072.5*xyza^32.0+x0^2.0*x0*36.0*xyza^35.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^21.0*0.3*xyza^6.0-x0^2.0*x0*0.007042253521126761*xyza^72.0+x0^2.0*0.09878048780487804*xyza^41.0-x0^2.0*0.007563025210084034*xyza^35.0-x0^3.0/2.0*xyza^2.0+x0^22.0*0.005067567567567568*xyza^37.0+x0^2.0*x0/14.444444444444445*xyza^40.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^21.0*0.3/7.0*xyza^7.0-x0^2.0*x0*0.007042253521126761/73.0*xyza^73.0+x0^2.0*0.09878048780487804/42.0*xyza^42.0-x0^2.0*0.007563025210084034/36.0*xyza^36.0-x0^3.0/2.0/3.0*xyza^3.0+x0^22.0*0.005067567567567568/38.0*xyza^38.0+x0^2.0*x0/14.444444444444445/41.0*xyza^41.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^21.0*0.04285714285714286*xyza^7.0-x0^2.0*x0*9.646922631680494E-5*xyza^73.0+x0^2.0*0.00235191637630662*xyza^42.0-x0^2.0*2.100840336134454E-4*xyza^36.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^22.0*1.333570412517781E-4*xyza^38.0+x0^2.0*x0/592.2222222222223*xyza^41.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^21.0*216.0*xyza-x0^2.0*x0*1.182384E7*xyza^67.0+x0^2.0*8883108.0*xyza^36.0-x0^2.0*294624.0*xyza^30.0-x0^3.0*0.0+x0^22.0*265072.5*xyza^32.0+x0^2.0*x0*36.0*xyza^35.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^21.0*216.0-x0^2.0*x0*1.182384E7*67.0*xyza^66.0+x0^2.0*8883108.0*36.0*xyza^35.0-x0^2.0*294624.0*30.0*xyza^29.0-x0^3.0*0.0*0.0+x0^22.0*265072.5*32.0*xyza^31.0+x0^2.0*x0*35.0*xyza^34.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^21.0*216.0-x0^2.0*x0*7.9219728E8*xyza^66.0+x0^2.0*3.19791888E8*xyza^35.0-x0^2.0*8838720.0*xyza^29.0-x0^3.0*0.0+x0^22.0*8482320.0*xyza^31.0+x0^2.0*x0*35.0*xyza^34.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^21.0*0.04285714285714286*xyza^7.0-x0^2.0*x0*9.646922631680494E-5*xyza^73.0-5.0*xyza^73.0+x0^2.0*0.00235191637630662*xyza^42.0-x0^2.0*2.100840336134454E-4*xyza^36.0-4.0*xyza^36.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^22.0*1.333570412517781E-4*xyza^38.0-4.0*xyza^38.0+x0^2.0*x0/592.2222222222223*xyza^41.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^21.0*0.04285714285714286/8.0*xyza^8.0-x0^2.0*x0*9.646922631680494E-5/74.0*xyza^74.0-5.0/74.0*xyza^74.0+x0^2.0*0.00235191637630662/43.0*xyza^43.0-x0^2.0*2.100840336134454E-4/37.0*xyza^37.0-4.0/37.0*xyza^37.0-x0^3.0*0.16666666666666666/4.0*xyza^4.0+x0^22.0*1.333570412517781E-4/39.0*xyza^39.0-4.0/39.0*xyza^39.0+x0^2.0*x0/592.2222222222223/42.0*xyza^42.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^21.0*0.005357142857142857*xyza^8.0-x0^2.0*x0/767084.0*xyza^74.0-1.0/14.8*xyza^74.0-0.06756756756756757*xyza^74.0+x0^2.0*5.46957296815493E-5*xyza^43.0-x0^2.0/176120.0*xyza^37.0-1.0/9.25*xyza^37.0-0.10810810810810811*xyza^37.0-x0^3.0*0.041666666666666664*xyza^4.0+x0^22.0/292448.0*xyza^39.0-1.0/9.75*xyza^39.0-0.10256410256410256*xyza^39.0+x0^2.0*x0/24873.333333333336*xyza^42.0";
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

public static void TestCaseDiff121185() {
 UsageCalculus.TestCase = 121185;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x^3*-3*x-3*x/1*x^2*-2*x^31*x0^2*-2*x0^3*3*x0/-1*x0^22*x^33*x/-1*x^2-1*x0^2*-2*x0^3*3*x02*x^3*3*x/1*x^2*--3*x^33*x1*x0^2*--3*x0^3-3*x^3*1*x/2*x^21*x/2*x^2*-3*x^3*-1*x2*x0^22*x^3*-3*x-3*x/1*x^2*-2*x^31*x0^2*-2*x0^3*3*x0/-1*x0^22*x^33*x/-1*x^21*x^3*-3*x-3*x/1*x^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=184 EqnNumber=87 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[93, 87, 17, 18, 1, 1, 2, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 1, 14, 1, 2, 3, 4, 14, 1, 1, 12, 1, 30, 15, 32, 9]"+
"// DOEMatrixRow=[22, 89, 19, 2, 1, 2, 3, 2, 1, 1, 2, 1, 2, 3, 4, 2, 3, 39, 8, 1, 2, 1, 2, 3, 4, 1, 3, 1, 2, 11, 2, 11, 7]"+
//Tail EqnIndex=184 EqnNumber=87 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[93, 87, 17, 18, 1, 1, 2, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 1, 14, 1, 2, 3, 4, 14, 1, 1, 12, 1, 30, 15, 32, 9]"+
"// DOEMatrixRow=[22, 89, 19, 2, 1, 2, 3, 2, 1, 1, 2, 1, 2, 3, 4, 2, 3, 39, 8, 1, 2, 1, 2, 3, 4, 1, 3, 1, 2, 11, 2, 11, 7]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-3.0*x^4.0-36.0*x^70.0+162.0*x^39.0-9.0*x^33.0-3.0+6.75*x^35.0+108.0*x^93.0-3.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-3.0*4.0*x^3.0-36.0*70.0*x^69.0+162.0*39.0*x^38.0-9.0*33.0*x^32.0-3.0*0.0+6.75*35.0*x^34.0+108.0*93.0*x^92.0-3.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-12.0*x^3.0-2520.0*x^69.0+6318.0*x^38.0-297.0*x^32.0+236.25*x^34.0+10044.0*x^92.0-9.0*x^2.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-3.0*x^4.0-36.0*x^70.0+162.0*x^39.0-9.0*x^33.0-3.0+6.75*x^35.0+108.0*x^93.0-3.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-3.0/5.0*x^5.0-36.0/71.0*x^71.0+162.0/40.0*x^40.0-9.0/34.0*x^34.0-3.0*x+6.75/36.0*x^36.0+108.0/94.0*x^94.0-3.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/1.6666666666666667*x^5.0-1.0/1.9722222222222223*x^71.0+4.05*x^40.0-1.0/3.7777777777777777*x^34.0-3.0*x+1.0/5.333333333333333*x^36.0+1.148936170212766*x^94.0-1.0/1.3333333333333333*x^4.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-12.0*x^3.0-2520.0*x^69.0+6318.0*x^38.0-297.0*x^32.0+236.25*x^34.0+10044.0*x^92.0-9.0*x^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-12.0*3.0*x^2.0-2520.0*69.0*x^68.0+6318.0*38.0*x^37.0-297.0*32.0*x^31.0+236.25*34.0*x^33.0+10044.0*92.0*x^91.0-9.0*2.0*x^1.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-36.0*x^2.0-173880.0*x^68.0+240084.0*x^37.0-9504.0*x^31.0+8032.5*x^33.0+924048.0*x^91.0-18.0*x";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/1.6666666666666667*x^5.0-1.0/1.9722222222222223*x^71.0+4.05*x^40.0-1.0/3.7777777777777777*x^34.0-3.0*x+1.0/5.333333333333333*x^36.0+1.148936170212766*x^94.0-1.0/1.3333333333333333*x^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/1.6666666666666667/6.0*x^6.0-1.0/1.9722222222222223/72.0*x^72.0+4.05/41.0*x^41.0-1.0/3.7777777777777777/35.0*x^35.0-3.0/2.0*x^2.0+1.0/5.333333333333333/37.0*x^37.0+1.148936170212766/95.0*x^95.0-1.0/1.3333333333333333/5.0*x^5.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/10.0*x^6.0-1.0/142.0*x^72.0+1.0/10.123456790123457*x^41.0-1.0/132.22222222222223*x^35.0-1.5*x^2.0+1.0/197.33333333333331*x^37.0+1.0/82.68518518518518*x^95.0-1.0/6.666666666666666*x^5.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-36.0*x^2.0-173880.0*x^68.0+240084.0*x^37.0-9504.0*x^31.0+8032.5*x^33.0+924048.0*x^91.0-18.0*x";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-36.0*2.0*x^1.0-173880.0*68.0*x^67.0+240084.0*37.0*x^36.0-9504.0*31.0*x^30.0+8032.5*33.0*x^32.0+924048.0*91.0*x^90.0-18.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-72.0*x-1.182384E7*x^67.0+8883108.0*x^36.0-294624.0*x^30.0+265072.5*x^32.0+8.4088368E7*x^90.0-18.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/10.0*x^6.0-1.0/142.0*x^72.0+1.0/10.123456790123457*x^41.0-1.0/132.22222222222223*x^35.0-1.5*x^2.0+1.0/197.33333333333331*x^37.0+1.0/82.68518518518518*x^95.0-1.0/6.666666666666666*x^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/10.0/7.0*x^7.0-1.0/142.0/73.0*x^73.0+1.0/10.123456790123457/42.0*x^42.0-1.0/132.22222222222223/36.0*x^36.0-1.5/3.0*x^3.0+1.0/197.33333333333331/38.0*x^38.0+1.0/82.68518518518518/96.0*x^96.0-1.0/6.666666666666666/6.0*x^6.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/70.0*x^7.0-1.0/10366.0*x^73.0+1.0/425.1851851851852*x^42.0-1.0/4760.0*x^36.0-1.0/2.0*x^3.0+1.0/7498.666666666666*x^38.0+1.0/7937.777777777777*x^96.0-1.0/40.0*x^6.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-72.0*x-1.182384E7*x^67.0+8883108.0*x^36.0-294624.0*x^30.0+265072.5*x^32.0+8.4088368E7*x^90.0-18.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-72.0-67.0*x^66.0+8883108.0*36.0*x^35.0-294624.0*30.0*x^29.0+265072.5*32.0*x^31.0+90.0*x^89.0-18.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-72.0-67.0*x^66.0+3.19791888E8*x^35.0-8838720.0*x^29.0+8482320.0*x^31.0+90.0*x^89.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/70.0*x^7.0-1.0/10366.0*x^73.0+1.0/425.1851851851852*x^42.0-1.0/4760.0*x^36.0-1.0/2.0*x^3.0+1.0/7498.666666666666*x^38.0+1.0/7937.777777777777*x^96.0-1.0/40.0*x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/70.0/8.0*x^8.0-1.0/10366.0/74.0*x^74.0+1.0/425.1851851851852/43.0*x^43.0-1.0/4760.0/37.0*x^37.0-1.0/2.0/4.0*x^4.0+1.0/7498.666666666666/39.0*x^39.0+1.0/7937.777777777777/97.0*x^97.0-1.0/40.0/7.0*x^7.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/560.0*x^8.0-1.0/767084.0*x^74.0+1.0/18282.962962962964*x^43.0-1.0/176120.0*x^37.0-1.0/8.0*x^4.0+1.0/292448.0*x^39.0+1.0/769964.4444444444*x^97.0-1.0/280.0*x^7.0";
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

public static void TestCaseDiff121186() {
 UsageCalculus.TestCase = 121186;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xy/1*xy^2*-2*xy^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xy^33*xy/-1*xy^2-1*x0^2*-2*x0^3*3*x02*xy^3*3*xy/1*xy^2*--3*xy^33*xy1*x0^2*--3*x0^3-3*xy^3*1*xy/2*xy^21*xy/2*xy^2*-3*xy^3*-1*xy2*x0^22*xy^3*-3*xy-3*xy/1*xy^2*-2*xy^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xy^33*xy/-1*xy^2-1*x0^2*-2*x0^3*3*x02*xy^3*3*xy/1*xy^2*--3*xy^3-3*xy/1*xy^21*x0^2*-2*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=185 EqnNumber=88 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[57, 88, 18, 19, 2, 3, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 3, 15, 2, 3, 1, 1, 15, 2, 3, 13, 2, 31, 16, 1, 10]"+
"// DOEMatrixRow=[89, 90, 20, 3, 2, 3, 1, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 40, 9, 2, 3, 2, 3, 1, 5, 2, 1, 2, 3, 12, 1, 12, 8]"+
//Tail EqnIndex=185 EqnNumber=88 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[57, 88, 18, 19, 2, 3, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 3, 15, 2, 3, 1, 1, 15, 2, 3, 13, 2, 31, 16, 1, 10]"+
"// DOEMatrixRow=[89, 90, 20, 3, 2, 3, 1, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 40, 9, 2, 3, 2, 3, 1, 5, 2, 1, 2, 3, 12, 1, 12, 8]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^2.0*x0*36.0*xy^70.0+x0^2.0*162.0*xy^39.0-x0^2.0*9.0*xy^33.0-x0^3.0*3.0+x0^22.0*6.75*xy^35.0-x0^2.0*x0*36.0*xy^70.0+x0^2.0*x02*54.0*xy^9.0-3.0*xy^3.0+x0^2.0*6.0*xy^22.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^2.0*x0*36.0*70.0*xy^69.0+x0^2.0*162.0*39.0*xy^38.0-x0^2.0*9.0*33.0*xy^32.0-x0^3.0*3.0*0.0+x0^22.0*6.75*35.0*xy^34.0-x0^2.0*x0*36.0*70.0*xy^69.0+x0^2.0*x02*54.0*9.0*xy^8.0-3.0*3.0*xy^2.0+x0^2.0*6.0*22.0*xy^21.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^2.0*x0*2520.0*xy^69.0+x0^2.0*6318.0*xy^38.0-x0^2.0*297.0*xy^32.0-x0^3.0*0.0+x0^22.0*236.25*xy^34.0-x0^2.0*x0*2520.0*xy^69.0+x0^2.0*x02*486.0*xy^8.0-9.0*xy^2.0+x0^2.0*132.0*xy^21.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^2.0*x0*36.0*xy^70.0+x0^2.0*162.0*xy^39.0-x0^2.0*9.0*xy^33.0-x0^3.0*3.0+x0^22.0*6.75*xy^35.0-x0^2.0*x0*36.0*xy^70.0+x0^2.0*x02*54.0*xy^9.0-3.0*xy^3.0+x0^2.0*6.0*xy^22.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^2.0*x0*36.0/71.0*xy^71.0+x0^2.0*162.0/40.0*xy^40.0-x0^2.0*9.0/34.0*xy^34.0-x0^3.0*xy+x0^22.0*6.75/36.0*xy^36.0-x0^2.0*x0*36.0/71.0*xy^71.0+x0^2.0*x02*54.0/10.0*xy^10.0-3.0/4.0*xy^4.0+x0^2.0*6.0/23.0*xy^23.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^2.0*x0*0.5070422535211268*xy^71.0+x0^2.0*4.05*xy^40.0-x0^2.0*0.2647058823529412*xy^34.0-x0^3.0*xy+x0^22.0*0.1875*xy^36.0-x0^2.0*x0*0.5070422535211268*xy^71.0+x0^2.0*x02*5.4*xy^10.0-0.75*xy^4.0+x0^2.0/3.8333333333333335*xy^23.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^2.0*x0*2520.0*xy^69.0+x0^2.0*6318.0*xy^38.0-x0^2.0*297.0*xy^32.0-x0^3.0*0.0+x0^22.0*236.25*xy^34.0-x0^2.0*x0*2520.0*xy^69.0+x0^2.0*x02*486.0*xy^8.0-9.0*xy^2.0+x0^2.0*132.0*xy^21.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^2.0*x0*2520.0*69.0*xy^68.0+x0^2.0*6318.0*38.0*xy^37.0-x0^2.0*297.0*32.0*xy^31.0-x0^3.0*0.0*0.0+x0^22.0*236.25*34.0*xy^33.0-x0^2.0*x0*2520.0*69.0*xy^68.0+x0^2.0*x02*486.0*8.0*xy^7.0-9.0*2.0*xy^1.0+x0^2.0*132.0*21.0*xy^20.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^2.0*x0*173880.0*xy^68.0+x0^2.0*240084.0*xy^37.0-x0^2.0*9504.0*xy^31.0-x0^3.0*0.0+x0^22.0*8032.5*xy^33.0-x0^2.0*x0*173880.0*xy^68.0+x0^2.0*x02*3888.0*xy^7.0-18.0*xy+x0^2.0*2772.0*xy^20.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^2.0*x0*0.5070422535211268*xy^71.0+x0^2.0*4.05*xy^40.0-x0^2.0*0.2647058823529412*xy^34.0-x0^3.0*xy+x0^22.0*0.1875*xy^36.0-x0^2.0*x0*0.5070422535211268*xy^71.0+x0^2.0*x02*5.4*xy^10.0-0.75*xy^4.0+x0^2.0/3.8333333333333335*xy^23.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^2.0*x0*0.5070422535211268/72.0*xy^72.0+x0^2.0*4.05/41.0*xy^41.0-x0^2.0*0.2647058823529412/35.0*xy^35.0-x0^3.0/2.0*xy^2.0+x0^22.0*0.1875/37.0*xy^37.0-x0^2.0*x0*0.5070422535211268/72.0*xy^72.0+x0^2.0*x02*5.4/11.0*xy^11.0-0.75/5.0*xy^5.0+x0^2.0*3.8333333333333335/24.0*xy^24.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^2.0*x0*0.007042253521126761*xy^72.0+x0^2.0*0.09878048780487804*xy^41.0-x0^2.0*0.007563025210084034*xy^35.0-x0^3.0/2.0*xy^2.0+x0^22.0*0.005067567567567568*xy^37.0-x0^2.0*x0*0.007042253521126761*xy^72.0+x0^2.0*x02/2.0370370370370368*xy^11.0-0.15*xy^5.0+x0^2.0/6.260869565217391*xy^24.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^2.0*x0*173880.0*xy^68.0+x0^2.0*240084.0*xy^37.0-x0^2.0*9504.0*xy^31.0-x0^3.0*0.0+x0^22.0*8032.5*xy^33.0-x0^2.0*x0*173880.0*xy^68.0+x0^2.0*x02*3888.0*xy^7.0-18.0*xy+x0^2.0*2772.0*xy^20.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^2.0*x0*173880.0*68.0*xy^67.0+x0^2.0*240084.0*37.0*xy^36.0-x0^2.0*9504.0*31.0*xy^30.0-x0^3.0*0.0*0.0+x0^22.0*8032.5*33.0*xy^32.0-x0^2.0*x0*173880.0*68.0*xy^67.0+x0^2.0*x02*3888.0*7.0*xy^6.0-18.0+x0^2.0*2772.0*20.0*xy^19.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^2.0*x0*1.182384E7*xy^67.0+x0^2.0*8883108.0*xy^36.0-x0^2.0*294624.0*xy^30.0-x0^3.0*0.0+x0^22.0*265072.5*xy^32.0-x0^2.0*x0*1.182384E7*xy^67.0+x0^2.0*x02*27216.0*xy^6.0-18.0+x0^2.0*55440.0*xy^19.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^2.0*x0*0.007042253521126761*xy^72.0+x0^2.0*0.09878048780487804*xy^41.0-x0^2.0*0.007563025210084034*xy^35.0-x0^3.0/2.0*xy^2.0+x0^22.0*0.005067567567567568*xy^37.0-x0^2.0*x0*0.007042253521126761*xy^72.0+x0^2.0*x02/2.0370370370370368*xy^11.0-0.15*xy^5.0+x0^2.0/6.260869565217391*xy^24.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^2.0*x0*0.007042253521126761/73.0*xy^73.0+x0^2.0*0.09878048780487804/42.0*xy^42.0-x0^2.0*0.007563025210084034/36.0*xy^36.0-x0^3.0/2.0/3.0*xy^3.0+x0^22.0*0.005067567567567568/38.0*xy^38.0-x0^2.0*x0*0.007042253521126761/73.0*xy^73.0+x0^2.0*x02/2.0370370370370368/12.0*xy^12.0-0.15/6.0*xy^6.0+x0^2.0*6.260869565217391/25.0*xy^25.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^2.0*x0*9.646922631680494E-5*xy^73.0+x0^2.0*0.00235191637630662*xy^42.0-x0^2.0*2.100840336134454E-4*xy^36.0-x0^3.0*0.16666666666666666*xy^3.0+x0^22.0*1.333570412517781E-4*xy^38.0-x0^2.0*x0*9.646922631680494E-5*xy^73.0+x0^2.0*x02/24.444444444444443*xy^12.0-0.024999999999999998*xy^6.0+x0^2.0/3.993055555555556*xy^25.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^2.0*x0*1.182384E7*xy^67.0+x0^2.0*8883108.0*xy^36.0-x0^2.0*294624.0*xy^30.0-x0^3.0*0.0+x0^22.0*265072.5*xy^32.0-x0^2.0*x0*1.182384E7*xy^67.0+x0^2.0*x02*27216.0*xy^6.0-18.0+x0^2.0*55440.0*xy^19.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^2.0*x0*1.182384E7*67.0*xy^66.0+x0^2.0*8883108.0*36.0*xy^35.0-x0^2.0*294624.0*30.0*xy^29.0-x0^3.0*0.0*0.0+x0^22.0*265072.5*32.0*xy^31.0-x0^2.0*x0*1.182384E7*67.0*xy^66.0+x0^2.0*x02*27216.0*6.0*xy^5.0-18.0*0.0+x0^2.0*55440.0*19.0*xy^18.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^2.0*x0*7.9219728E8*xy^66.0+x0^2.0*3.19791888E8*xy^35.0-x0^2.0*8838720.0*xy^29.0-x0^3.0*0.0+x0^22.0*8482320.0*xy^31.0-x0^2.0*x0*7.9219728E8*xy^66.0+x0^2.0*x02*163296.0*xy^5.0+x0^2.0*1053360.0*xy^18.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^2.0*x0*9.646922631680494E-5*xy^73.0-5.0*xy^73.0+x0^2.0*0.00235191637630662*xy^42.0-x0^2.0*2.100840336134454E-4*xy^36.0-4.0*xy^36.0-x0^3.0*0.16666666666666666*xy^3.0+x0^22.0*1.333570412517781E-4*xy^38.0-4.0*xy^38.0-x0^2.0*x0*9.646922631680494E-5*xy^73.0-5.0*xy^73.0+x0^2.0*x02/24.444444444444443*xy^12.0-0.024999999999999998*xy^6.0+x0^2.0/3.993055555555556*xy^25.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^2.0*x0*9.646922631680494E-5/74.0*xy^74.0-5.0/74.0*xy^74.0+x0^2.0*0.00235191637630662/43.0*xy^43.0-x0^2.0*2.100840336134454E-4/37.0*xy^37.0-4.0/37.0*xy^37.0-x0^3.0*0.16666666666666666/4.0*xy^4.0+x0^22.0*1.333570412517781E-4/39.0*xy^39.0-4.0/39.0*xy^39.0-x0^2.0*x0*9.646922631680494E-5/74.0*xy^74.0-5.0/74.0*xy^74.0+x0^2.0*x02/24.444444444444443/13.0*xy^13.0-0.024999999999999998/7.0*xy^7.0+x0^2.0*3.993055555555556/26.0*xy^26.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^2.0*x0/767084.0*xy^74.0-1.0/14.8*xy^74.0-0.06756756756756757*xy^74.0+x0^2.0*5.46957296815493E-5*xy^43.0-x0^2.0/176120.0*xy^37.0-1.0/9.25*xy^37.0-0.10810810810810811*xy^37.0-x0^3.0*0.041666666666666664*xy^4.0+x0^22.0/292448.0*xy^39.0-1.0/9.75*xy^39.0-0.10256410256410256*xy^39.0-x0^2.0*x0/767084.0*xy^74.0-1.0/14.8*xy^74.0-0.06756756756756757*xy^74.0+x0^2.0*x02/317.77777777777777*xy^13.0-0.0035714285714285713*xy^7.0+x0^2.0/6.511304347826086*xy^26.0";
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

public static void TestCaseDiff121187() {
 UsageCalculus.TestCase = 121187;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x0^2*-2*x0^3*3*x0/-1*x0^22*xyz^33*xyz/-1*xyz^2-1*x0^2*-2*x0^3*3*x02*xyz^3*3*xyz/1*xyz^2*--3*xyz^33*xyz1*x0^2*--3*x0^3-3*xyz^3*1*xyz/2*xyz^21*xyz/2*xyz^2*-3*xyz^3*-1*xyz2*x0^22*xyz^3*-3*xyz-3*xyz/1*xyz^2*-2*xyz^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyz^33*xyz/-1*xyz^2-1*x0^2*-2*x0^3*3*x02*xyz^3*3*xyz/1*xyz^2*--3*xyz^33*xyz1*xyz^2*--3*xyz^31*x0^2*-2*x0^32*xyz^3*3*xyz";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=186 EqnNumber=89 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[21, 89, 19, 20, 3, 1, 2, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 5, 3, 4, 16, 3, 1, 2, 3, 16, 3, 4, 14, 3, 32, 1, 2, 11]"+
"// DOEMatrixRow=[53, 91, 1, 4, 3, 1, 2, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 41, 10, 3, 1, 3, 1, 2, 6, 3, 2, 3, 4, 13, 2, 13, 9]"+
//Tail EqnIndex=186 EqnNumber=89 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[21, 89, 19, 20, 3, 1, 2, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 5, 3, 4, 16, 3, 1, 2, 3, 16, 3, 4, 14, 3, 32, 1, 2, 11]"+
"// DOEMatrixRow=[53, 91, 1, 4, 3, 1, 2, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 41, 10, 3, 1, 3, 1, 2, 6, 3, 2, 3, 4, 13, 2, 13, 9]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^2.0*x0*6.0*xyz^36.0+x0^2.0*162.0*xyz^39.0-x0^2.0*9.0*xyz^33.0-x0^3.0*3.0+x0^22.0*6.75*xyz^35.0-x0^2.0*x0*36.0*xyz^70.0+x0^2.0*972.0*xyz^76.0-x0^2.0*54.0*xyz^70.0+x0^2.0*18.0*xyz^35.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^2.0*x0*6.0*36.0*xyz^35.0+x0^2.0*162.0*39.0*xyz^38.0-x0^2.0*9.0*33.0*xyz^32.0-x0^3.0*3.0*0.0+x0^22.0*6.75*35.0*xyz^34.0-x0^2.0*x0*36.0*70.0*xyz^69.0+x0^2.0*972.0*76.0*xyz^75.0-x0^2.0*54.0*70.0*xyz^69.0+x0^2.0*18.0*35.0*xyz^34.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^2.0*x0*216.0*xyz^35.0+x0^2.0*6318.0*xyz^38.0-x0^2.0*297.0*xyz^32.0-x0^3.0*0.0+x0^22.0*236.25*xyz^34.0-x0^2.0*x0*2520.0*xyz^69.0+x0^2.0*73872.0*xyz^75.0-x0^2.0*3780.0*xyz^69.0+x0^2.0*630.0*xyz^34.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^2.0*x0*6.0*xyz^36.0+x0^2.0*162.0*xyz^39.0-x0^2.0*9.0*xyz^33.0-x0^3.0*3.0+x0^22.0*6.75*xyz^35.0-x0^2.0*x0*36.0*xyz^70.0+x0^2.0*972.0*xyz^76.0-x0^2.0*54.0*xyz^70.0+x0^2.0*18.0*xyz^35.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^2.0*x0*6.0/37.0*xyz^37.0+x0^2.0*162.0/40.0*xyz^40.0-x0^2.0*9.0/34.0*xyz^34.0-x0^3.0*xyz+x0^22.0*6.75/36.0*xyz^36.0-x0^2.0*x0*36.0/71.0*xyz^71.0+x0^2.0*972.0/77.0*xyz^77.0-x0^2.0*54.0/71.0*xyz^71.0+x0^2.0*18.0/36.0*xyz^36.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^2.0*x0*0.16216216216216217*xyz^37.0+x0^2.0*4.05*xyz^40.0-x0^2.0*0.2647058823529412*xyz^34.0-x0^3.0*xyz+x0^22.0*0.1875*xyz^36.0-x0^2.0*x0*0.5070422535211268*xyz^71.0+x0^2.0*12.623376623376624*xyz^77.0-x0^2.0*0.7605633802816901*xyz^71.0+x0^2.0/2.0*xyz^36.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^2.0*x0*216.0*xyz^35.0+x0^2.0*6318.0*xyz^38.0-x0^2.0*297.0*xyz^32.0-x0^3.0*0.0+x0^22.0*236.25*xyz^34.0-x0^2.0*x0*2520.0*xyz^69.0+x0^2.0*73872.0*xyz^75.0-x0^2.0*3780.0*xyz^69.0+x0^2.0*630.0*xyz^34.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^2.0*x0*216.0*35.0*xyz^34.0+x0^2.0*6318.0*38.0*xyz^37.0-x0^2.0*297.0*32.0*xyz^31.0-x0^3.0*0.0*0.0+x0^22.0*236.25*34.0*xyz^33.0-x0^2.0*x0*2520.0*69.0*xyz^68.0+x0^2.0*73872.0*75.0*xyz^74.0-x0^2.0*3780.0*69.0*xyz^68.0+x0^2.0*630.0*34.0*xyz^33.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^2.0*x0*7560.0*xyz^34.0+x0^2.0*240084.0*xyz^37.0-x0^2.0*9504.0*xyz^31.0-x0^3.0*0.0+x0^22.0*8032.5*xyz^33.0-x0^2.0*x0*173880.0*xyz^68.0+x0^2.0*5540400.0*xyz^74.0-x0^2.0*260820.0*xyz^68.0+x0^2.0*21420.0*xyz^33.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^2.0*x0*0.16216216216216217*xyz^37.0+x0^2.0*4.05*xyz^40.0-x0^2.0*0.2647058823529412*xyz^34.0-x0^3.0*xyz+x0^22.0*0.1875*xyz^36.0-x0^2.0*x0*0.5070422535211268*xyz^71.0+x0^2.0*12.623376623376624*xyz^77.0-x0^2.0*0.7605633802816901*xyz^71.0+x0^2.0/2.0*xyz^36.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^2.0*x0*0.16216216216216217/38.0*xyz^38.0+x0^2.0*4.05/41.0*xyz^41.0-x0^2.0*0.2647058823529412/35.0*xyz^35.0-x0^3.0/2.0*xyz^2.0+x0^22.0*0.1875/37.0*xyz^37.0-x0^2.0*x0*0.5070422535211268/72.0*xyz^72.0+x0^2.0*12.623376623376624/78.0*xyz^78.0-x0^2.0*0.7605633802816901/72.0*xyz^72.0+x0^2.0*2.0/37.0*xyz^37.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^2.0*x0*0.004267425320056899*xyz^38.0+x0^2.0*0.09878048780487804*xyz^41.0-x0^2.0*0.007563025210084034*xyz^35.0-x0^3.0/2.0*xyz^2.0+x0^22.0*0.005067567567567568*xyz^37.0-x0^2.0*x0*0.007042253521126761*xyz^72.0+x0^2.0*0.16183816183816185*xyz^78.0-x0^2.0*0.01056338028169014*xyz^72.0+x0^2.0/18.5*xyz^37.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^2.0*x0*7560.0*xyz^34.0+x0^2.0*240084.0*xyz^37.0-x0^2.0*9504.0*xyz^31.0-x0^3.0*0.0+x0^22.0*8032.5*xyz^33.0-x0^2.0*x0*173880.0*xyz^68.0+x0^2.0*5540400.0*xyz^74.0-x0^2.0*260820.0*xyz^68.0+x0^2.0*21420.0*xyz^33.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^2.0*x0*7560.0*34.0*xyz^33.0+x0^2.0*240084.0*37.0*xyz^36.0-x0^2.0*9504.0*31.0*xyz^30.0-x0^3.0*0.0*0.0+x0^22.0*8032.5*33.0*xyz^32.0-x0^2.0*x0*173880.0*68.0*xyz^67.0+x0^2.0*5540400.0*74.0*xyz^73.0-x0^2.0*260820.0*68.0*xyz^67.0+x0^2.0*21420.0*33.0*xyz^32.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^2.0*x0*257040.0*xyz^33.0+x0^2.0*8883108.0*xyz^36.0-x0^2.0*294624.0*xyz^30.0-x0^3.0*0.0+x0^22.0*265072.5*xyz^32.0-x0^2.0*x0*1.182384E7*xyz^67.0+x0^2.0*4.099896E8*xyz^73.0-x0^2.0*1.773576E7*xyz^67.0+x0^2.0*706860.0*xyz^32.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^2.0*x0*0.004267425320056899*xyz^38.0+x0^2.0*0.09878048780487804*xyz^41.0-x0^2.0*0.007563025210084034*xyz^35.0-x0^3.0/2.0*xyz^2.0+x0^22.0*0.005067567567567568*xyz^37.0-x0^2.0*x0*0.007042253521126761*xyz^72.0+x0^2.0*0.16183816183816185*xyz^78.0-x0^2.0*0.01056338028169014*xyz^72.0+x0^2.0/18.5*xyz^37.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^2.0*x0*0.004267425320056899/39.0*xyz^39.0+x0^2.0*0.09878048780487804/42.0*xyz^42.0-x0^2.0*0.007563025210084034/36.0*xyz^36.0-x0^3.0/2.0/3.0*xyz^3.0+x0^22.0*0.005067567567567568/38.0*xyz^38.0-x0^2.0*x0*0.007042253521126761/73.0*xyz^73.0+x0^2.0*0.16183816183816185/79.0*xyz^79.0-x0^2.0*0.01056338028169014/73.0*xyz^73.0+x0^2.0*18.5/38.0*xyz^38.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^2.0*x0*1.0942116205274101E-4*xyz^39.0+x0^2.0*0.00235191637630662*xyz^42.0-x0^2.0*2.100840336134454E-4*xyz^36.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^22.0*1.333570412517781E-4*xyz^38.0-x0^2.0*x0*9.646922631680494E-5*xyz^73.0+x0^2.0*0.00204858432706534*xyz^79.0-x0^2.0*1.447038394752074E-4*xyz^73.0+x0^2.0/2.054054054054054*xyz^38.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^2.0*x0*257040.0*xyz^33.0+x0^2.0*8883108.0*xyz^36.0-x0^2.0*294624.0*xyz^30.0-x0^3.0*0.0+x0^22.0*265072.5*xyz^32.0-x0^2.0*x0*1.182384E7*xyz^67.0+x0^2.0*4.099896E8*xyz^73.0-x0^2.0*1.773576E7*xyz^67.0+x0^2.0*706860.0*xyz^32.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^2.0*x0*257040.0*33.0*xyz^32.0+x0^2.0*8883108.0*36.0*xyz^35.0-x0^2.0*294624.0*30.0*xyz^29.0-x0^3.0*0.0*0.0+x0^22.0*265072.5*32.0*xyz^31.0-x0^2.0*x0*1.182384E7*67.0*xyz^66.0+x0^2.0*4.099896E8*73.0*xyz^72.0-x0^2.0*1.773576E7*67.0*xyz^66.0+x0^2.0*706860.0*32.0*xyz^31.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^2.0*x0*8482320.0*xyz^32.0+x0^2.0*3.19791888E8*xyz^35.0-x0^2.0*8838720.0*xyz^29.0-x0^3.0*0.0+x0^22.0*8482320.0*xyz^31.0-x0^2.0*x0*7.9219728E8*xyz^66.0+x0^2.0*2.99292408E10*xyz^72.0-x0^2.0*1.18829592E9*xyz^66.0+x0^2.0*2.261952E7*xyz^31.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^2.0*x0*1.0942116205274101E-4*xyz^39.0-4.0*xyz^39.0+x0^2.0*0.00235191637630662*xyz^42.0-x0^2.0*2.100840336134454E-4*xyz^36.0-4.0*xyz^36.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^22.0*1.333570412517781E-4*xyz^38.0-4.0*xyz^38.0-x0^2.0*x0*9.646922631680494E-5*xyz^73.0-5.0*xyz^73.0+x0^2.0*0.00204858432706534*xyz^79.0-x0^2.0*1.447038394752074E-4*xyz^73.0-4.0*xyz^73.0+x0^2.0/2.054054054054054*xyz^38.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^2.0*x0*1.0942116205274101E-4/40.0*xyz^40.0-4.0/40.0*xyz^40.0+x0^2.0*0.00235191637630662/43.0*xyz^43.0-x0^2.0*2.100840336134454E-4/37.0*xyz^37.0-4.0/37.0*xyz^37.0-x0^3.0*0.16666666666666666/4.0*xyz^4.0+x0^22.0*1.333570412517781E-4/39.0*xyz^39.0-4.0/39.0*xyz^39.0-x0^2.0*x0*9.646922631680494E-5/74.0*xyz^74.0-5.0/74.0*xyz^74.0+x0^2.0*0.00204858432706534/80.0*xyz^80.0-x0^2.0*1.447038394752074E-4/74.0*xyz^74.0-4.0/74.0*xyz^74.0+x0^2.0*2.054054054054054/39.0*xyz^39.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^2.0*x0/365559.99999999994*xyz^40.0-1.0/10.0*xyz^40.0-0.1*xyz^40.0+x0^2.0*5.46957296815493E-5*xyz^43.0-x0^2.0/176120.0*xyz^37.0-1.0/9.25*xyz^37.0-0.10810810810810811*xyz^37.0-x0^3.0*0.041666666666666664*xyz^4.0+x0^22.0/292448.0*xyz^39.0-1.0/9.75*xyz^39.0-0.10256410256410256*xyz^39.0-x0^2.0*x0/767084.0*xyz^74.0-1.0/14.8*xyz^74.0-0.06756756756756757*xyz^74.0+x0^2.0*2.560730408831675E-5*xyz^80.0-x0^2.0/511389.3333333333*xyz^74.0-1.0/18.5*xyz^74.0-0.05405405405405406*xyz^74.0+x0^2.0/18.986842105263158*xyz^39.0";
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

public static void TestCaseDiff121188() {
 UsageCalculus.TestCase = 121188;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xyza^33*xyza/-1*xyza^2-1*x0^2*-2*x0^3*3*x02*xyza^3*3*xyza/1*xyza^2*--3*xyza^33*xyza1*x0^2*--3*x0^3-3*xyza^3*1*xyza/2*xyza^21*xyza/2*xyza^2*-3*xyza^3*-1*xyza2*x0^22*xyza^3*-3*xyza-3*xyza/1*xyza^2*-2*xyza^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyza^33*xyza/-1*xyza^2-1*x0^2*-2*x0^3*3*x02*xyza^3*3*xyza/1*xyza^2*--3*xyza^33*xyza1*xyza^2*--3*xyza^3-3*xy012^3*1*xy012/2*xy012^21*xyza/2*xyza^2*-3*xyza^3*-1*xyza2*xyza^3*3*xyza3*xyza/-1*xyza^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=187 EqnNumber=90 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[88, 90, 20, 1, 4, 2, 3, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 1, 1, 1, 1, 1, 2, 3, 4, 1, 1, 1, 15, 4, 1, 2, 3, 12]"+
"// DOEMatrixRow=[17, 92, 2, 1, 1, 2, 3, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 42, 1, 1, 2, 4, 2, 3, 1, 4, 3, 1, 1, 14, 1, 14, 10]"+
//Tail EqnIndex=187 EqnNumber=90 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[88, 90, 20, 1, 4, 2, 3, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 1, 1, 1, 1, 1, 2, 3, 4, 1, 1, 1, 15, 4, 1, 2, 3, 12]"+
"// DOEMatrixRow=[17, 92, 2, 1, 1, 2, 3, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 42, 1, 1, 2, 4, 2, 3, 1, 4, 3, 1, 1, 14, 1, 14, 10]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-2.0*xyza^36.0+x0^2.0*162.0*xyza^39.0-x0^2.0*9.0*xyza^33.0-x0^3.0*3.0+x0^22.0*6.75*xyza^35.0-x0^2.0*x0*36.0*xyza^70.0+162.0*xyza^44.0-9.0*xyza^38.0-3.0*xyza^3.0+6.75*xyza^12.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-2.0*36.0*xyza^35.0+x0^2.0*162.0*39.0*xyza^38.0-x0^2.0*9.0*33.0*xyza^32.0-x0^3.0*3.0*0.0+x0^22.0*6.75*35.0*xyza^34.0-x0^2.0*x0*36.0*70.0*xyza^69.0+162.0*44.0*xyza^43.0-9.0*38.0*xyza^37.0-3.0*3.0*xyza^2.0+6.75*12.0*xyza^11.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-72.0*xyza^35.0+x0^2.0*6318.0*xyza^38.0-x0^2.0*297.0*xyza^32.0-x0^3.0*0.0+x0^22.0*236.25*xyza^34.0-x0^2.0*x0*2520.0*xyza^69.0+7128.0*xyza^43.0-342.0*xyza^37.0-9.0*xyza^2.0+81.0*xyza^11.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-2.0*xyza^36.0+x0^2.0*162.0*xyza^39.0-x0^2.0*9.0*xyza^33.0-x0^3.0*3.0+x0^22.0*6.75*xyza^35.0-x0^2.0*x0*36.0*xyza^70.0+162.0*xyza^44.0-9.0*xyza^38.0-3.0*xyza^3.0+6.75*xyza^12.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-2.0/37.0*xyza^37.0+x0^2.0*162.0/40.0*xyza^40.0-x0^2.0*9.0/34.0*xyza^34.0-x0^3.0*xyza+x0^22.0*6.75/36.0*xyza^36.0-x0^2.0*x0*36.0/71.0*xyza^71.0+162.0/45.0*xyza^45.0-9.0/39.0*xyza^39.0-3.0/4.0*xyza^4.0+6.75/13.0*xyza^13.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-0.05405405405405406*xyza^37.0+x0^2.0*4.05*xyza^40.0-x0^2.0*0.2647058823529412*xyza^34.0-x0^3.0*xyza+x0^22.0*0.1875*xyza^36.0-x0^2.0*x0/1.9722222222222223*xyza^71.0+3.6*xyza^45.0-1.0/4.333333333333333*xyza^39.0-1.0/1.3333333333333333*xyza^4.0+1.0/1.9259259259259258*xyza^13.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-72.0*xyza^35.0+x0^2.0*6318.0*xyza^38.0-x0^2.0*297.0*xyza^32.0-x0^3.0*0.0+x0^22.0*236.25*xyza^34.0-x0^2.0*x0*2520.0*xyza^69.0+7128.0*xyza^43.0-342.0*xyza^37.0-9.0*xyza^2.0+81.0*xyza^11.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-72.0*35.0*xyza^34.0+x0^2.0*6318.0*38.0*xyza^37.0-x0^2.0*297.0*32.0*xyza^31.0-x0^3.0*0.0*0.0+x0^22.0*236.25*34.0*xyza^33.0-x0^2.0*x0*2520.0*69.0*xyza^68.0+7128.0*43.0*xyza^42.0-342.0*37.0*xyza^36.0-9.0*2.0*xyza^1.0+81.0*11.0*xyza^10.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-2520.0*xyza^34.0+x0^2.0*240084.0*xyza^37.0-x0^2.0*9504.0*xyza^31.0-x0^3.0*0.0+x0^22.0*8032.5*xyza^33.0-x0^2.0*x0*173880.0*xyza^68.0+306504.0*xyza^42.0-12654.0*xyza^36.0-18.0*xyza+891.0*xyza^10.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-0.05405405405405406*xyza^37.0+x0^2.0*4.05*xyza^40.0-x0^2.0*0.2647058823529412*xyza^34.0-x0^3.0*xyza+x0^22.0*0.1875*xyza^36.0-x0^2.0*x0/1.9722222222222223*xyza^71.0+3.6*xyza^45.0-1.0/4.333333333333333*xyza^39.0-1.0/1.3333333333333333*xyza^4.0+1.0/1.9259259259259258*xyza^13.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-0.05405405405405406/38.0*xyza^38.0+x0^2.0*4.05/41.0*xyza^41.0-x0^2.0*0.2647058823529412/35.0*xyza^35.0-x0^3.0/2.0*xyza^2.0+x0^22.0*0.1875/37.0*xyza^37.0-x0^2.0*x0/1.9722222222222223/72.0*xyza^72.0+3.6/46.0*xyza^46.0-1.0/4.333333333333333/40.0*xyza^40.0-1.0/1.3333333333333333/5.0*xyza^5.0+1.0/1.9259259259259258/14.0*xyza^14.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-0.001422475106685633*xyza^38.0+x0^2.0*0.09878048780487804*xyza^41.0-x0^2.0*0.007563025210084034*xyza^35.0-x0^3.0/2.0*xyza^2.0+x0^22.0*0.005067567567567568*xyza^37.0-x0^2.0*x0/142.0*xyza^72.0+1.0/12.777777777777777*xyza^46.0-1.0/173.33333333333331*xyza^40.0-1.0/6.666666666666666*xyza^5.0+1.0/26.962962962962962*xyza^14.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-2520.0*xyza^34.0+x0^2.0*240084.0*xyza^37.0-x0^2.0*9504.0*xyza^31.0-x0^3.0*0.0+x0^22.0*8032.5*xyza^33.0-x0^2.0*x0*173880.0*xyza^68.0+306504.0*xyza^42.0-12654.0*xyza^36.0-18.0*xyza+891.0*xyza^10.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-2520.0*34.0*xyza^33.0+x0^2.0*240084.0*37.0*xyza^36.0-x0^2.0*9504.0*31.0*xyza^30.0-x0^3.0*0.0*0.0+x0^22.0*8032.5*33.0*xyza^32.0-x0^2.0*x0*173880.0*68.0*xyza^67.0+306504.0*42.0*xyza^41.0-12654.0*36.0*xyza^35.0-18.0+891.0*10.0*xyza^9.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-85680.0*xyza^33.0+x0^2.0*8883108.0*xyza^36.0-x0^2.0*294624.0*xyza^30.0-x0^3.0*0.0+x0^22.0*265072.5*xyza^32.0-x0^2.0*x0*1.182384E7*xyza^67.0+1.2873168E7*xyza^41.0-455544.0*xyza^35.0-18.0+8910.0*xyza^9.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-0.001422475106685633*xyza^38.0+x0^2.0*0.09878048780487804*xyza^41.0-x0^2.0*0.007563025210084034*xyza^35.0-x0^3.0/2.0*xyza^2.0+x0^22.0*0.005067567567567568*xyza^37.0-x0^2.0*x0/142.0*xyza^72.0+1.0/12.777777777777777*xyza^46.0-1.0/173.33333333333331*xyza^40.0-1.0/6.666666666666666*xyza^5.0+1.0/26.962962962962962*xyza^14.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-0.001422475106685633/39.0*xyza^39.0+x0^2.0*0.09878048780487804/42.0*xyza^42.0-x0^2.0*0.007563025210084034/36.0*xyza^36.0-x0^3.0/2.0/3.0*xyza^3.0+x0^22.0*0.005067567567567568/38.0*xyza^38.0-x0^2.0*x0/142.0/73.0*xyza^73.0+1.0/12.777777777777777/47.0*xyza^47.0-1.0/173.33333333333331/41.0*xyza^41.0-1.0/6.666666666666666/6.0*xyza^6.0+1.0/26.962962962962962/15.0*xyza^15.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-3.6473720684247E-5*xyza^39.0+x0^2.0*0.00235191637630662*xyza^42.0-x0^2.0*2.100840336134454E-4*xyza^36.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^22.0*1.333570412517781E-4*xyza^38.0-x0^2.0*x0/10366.0*xyza^73.0+1.0/600.5555555555555*xyza^47.0-1.0/7106.666666666666*xyza^41.0-1.0/40.0*xyza^6.0+1.0/404.44444444444446*xyza^15.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-85680.0*xyza^33.0+x0^2.0*8883108.0*xyza^36.0-x0^2.0*294624.0*xyza^30.0-x0^3.0*0.0+x0^22.0*265072.5*xyza^32.0-x0^2.0*x0*1.182384E7*xyza^67.0+1.2873168E7*xyza^41.0-455544.0*xyza^35.0-18.0+8910.0*xyza^9.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-85680.0*33.0*xyza^32.0+x0^2.0*8883108.0*36.0*xyza^35.0-x0^2.0*294624.0*30.0*xyza^29.0-x0^3.0*0.0*0.0+x0^22.0*265072.5*32.0*xyza^31.0-x0^2.0*x0*1.182384E7*67.0*xyza^66.0+41.0*xyza^40.0-455544.0*35.0*xyza^34.0-18.0*0.0+8910.0*9.0*xyza^8.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-2827440.0*xyza^32.0+x0^2.0*3.19791888E8*xyza^35.0-x0^2.0*8838720.0*xyza^29.0-x0^3.0*0.0+x0^22.0*8482320.0*xyza^31.0-x0^2.0*x0*7.9219728E8*xyza^66.0+41.0*xyza^40.0-1.594404E7*xyza^34.0+80190.0*xyza^8.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-3.6473720684247E-5*xyza^39.0-5.0*xyza^39.0+x0^2.0*0.00235191637630662*xyza^42.0-x0^2.0*2.100840336134454E-4*xyza^36.0-4.0*xyza^36.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^22.0*1.333570412517781E-4*xyza^38.0-4.0*xyza^38.0-x0^2.0*x0/10366.0*xyza^73.0+1.0/600.5555555555555*xyza^47.0-1.0/7106.666666666666*xyza^41.0-1.0/40.0*xyza^6.0+1.0/404.44444444444446*xyza^15.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-3.6473720684247E-5/40.0*xyza^40.0-5.0/40.0*xyza^40.0+x0^2.0*0.00235191637630662/43.0*xyza^43.0-x0^2.0*2.100840336134454E-4/37.0*xyza^37.0-4.0/37.0*xyza^37.0-x0^3.0*0.16666666666666666/4.0*xyza^4.0+x0^22.0*1.333570412517781E-4/39.0*xyza^39.0-4.0/39.0*xyza^39.0-x0^2.0*x0/10366.0/74.0*xyza^74.0+1.0/600.5555555555555/48.0*xyza^48.0-1.0/7106.666666666666/42.0*xyza^42.0-1.0/40.0/7.0*xyza^7.0+1.0/404.44444444444446/16.0*xyza^16.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/1096680.0*xyza^40.0-1.0/8.0*xyza^40.0-0.125*xyza^40.0+x0^2.0*5.46957296815493E-5*xyza^43.0-x0^2.0/176120.0*xyza^37.0-1.0/9.25*xyza^37.0-0.10810810810810811*xyza^37.0-x0^3.0*0.041666666666666664*xyza^4.0+x0^22.0/292448.0*xyza^39.0-1.0/9.75*xyza^39.0-0.10256410256410256*xyza^39.0-x0^2.0*x0/767084.0*xyza^74.0+1.0/28826.666666666664*xyza^48.0-1.0/298480.0*xyza^42.0-1.0/280.0*xyza^7.0+1.0/6471.111111111111*xyza^16.0";
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

public static void TestCaseDiff121189() {
 UsageCalculus.TestCase = 121189;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*x/-1*x^23*x/-1*x^2-1*x0^2*-2*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=188 EqnNumber=91 FamilyID=1 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[52, 91, 1, 2, 1, 3, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 1, 2, 3, 2, 16, 1, 2, 3, 4, 13]"+
"// DOEMatrixRow=[84, 93, 3, 2, 3, 1, 1, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 43, 2, 3, 1, 5, 3, 1, 2, 1, 1, 2, 3, 15, 2, 15, 11]"+
//Tail EqnIndex=188 EqnNumber=91 FamilyID=1 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[52, 91, 1, 2, 1, 3, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 1, 2, 3, 2, 16, 1, 2, 3, 4, 13]"+
"// DOEMatrixRow=[84, 93, 3, 2, 3, 1, 1, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 43, 2, 3, 1, 5, 3, 1, 2, 1, 1, 2, 3, 15, 2, 15, 11]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "3.0*x^27.0+2.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "3.0*27.0*x^26.0+2.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "81.0*x^26.0";
 UsageCalculus.EqnSolArrayMap3[1] = "3.0*x^27.0+2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "3.0/28.0*x^28.0+2.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/9.333333333333334*x^28.0+2.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "81.0*x^26.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "81.0*26.0*x^25.0";
 UsageCalculus.EqnSolArrayMap2[2] = "2106.0*x^25.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/9.333333333333334*x^28.0+2.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/9.333333333333334/29.0*x^29.0+x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "0.003694581280788177*x^29.0+x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "2106.0*x^25.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "2106.0*25.0*x^24.0";
 UsageCalculus.EqnSolArrayMap2[3] = "52650.0*x^24.0";
 UsageCalculus.EqnSolArrayMap3[3] = "0.003694581280788177*x^29.0+x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "0.003694581280788177/30.0*x^30.0+1.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/8120.0*x^30.0+1.0/3.0*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "52650.0*x^24.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "52650.0*24.0*x^23.0";
 UsageCalculus.EqnSolArrayMap2[4] = "1263600.0*x^23.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/8120.0*x^30.0+1.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/8120.0/31.0*x^31.0+1.0/3.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/251720.0*x^31.0+1.0/12.0*x^4.0";
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

public static void TestCaseDiff121190() {
 UsageCalculus.TestCase = 121190;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-1*x0^2*-2*x0^3*3*x02*xy^3*3*xy/1*xy^2*--3*xy^3-1*x0^2*-2*x0^32*xy^3*3*xy";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=189 EqnNumber=92 FamilyID=3 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[16, 92, 2, 3, 2, 1, 2, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 3, 4, 3, 1, 2, 3, 2, 3, 1, 3, 1, 2, 3, 4, 5, 14]"+
"// DOEMatrixRow=[48, 94, 4, 3, 1, 2, 3, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 44, 3, 1, 2, 1, 1, 2, 3, 2, 3, 1, 4, 16, 1, 16, 12]"+
//Tail EqnIndex=189 EqnNumber=92 FamilyID=3 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[16, 92, 2, 3, 2, 1, 2, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 3, 4, 3, 1, 2, 3, 2, 3, 1, 3, 1, 2, 3, 4, 5, 14]"+
"// DOEMatrixRow=[48, 94, 4, 3, 1, 2, 3, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 44, 3, 1, 2, 1, 1, 2, 3, 2, 3, 1, 4, 16, 1, 16, 12]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0*x02*54.0*xy^9.0-3.0*xy^3.0+x0^2.0*6.0*xy^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0*x02*54.0*9.0*xy^8.0-3.0*3.0*xy^2.0+x0^2.0*6.0*4.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*x02*486.0*xy^8.0-9.0*xy^2.0+x0^2.0*24.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0*x02*54.0*xy^9.0-3.0*xy^3.0+x0^2.0*6.0*xy^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0*x02*54.0/10.0*xy^10.0-3.0/4.0*xy^4.0+x0^2.0*6.0/5.0*xy^5.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0*x02*5.4*xy^10.0-0.75*xy^4.0+x0^2.0*1.2*xy^5.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*x02*486.0*xy^8.0-9.0*xy^2.0+x0^2.0*24.0*xy^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*x02*486.0*8.0*xy^7.0-9.0*2.0*xy^1.0+x0^2.0*24.0*3.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*x02*3888.0*xy^7.0-18.0*xy+x0^2.0*72.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0*x02*5.4*xy^10.0-0.75*xy^4.0+x0^2.0*1.2*xy^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0*x02*5.4/11.0*xy^11.0-0.75/5.0*xy^5.0+x0^2.0*1.2/6.0*xy^6.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0*x02/2.0370370370370368*xy^11.0-0.15*xy^5.0+x0^2.0/5.0*xy^6.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*x02*3888.0*xy^7.0-18.0*xy+x0^2.0*72.0*xy^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*x02*3888.0*7.0*xy^6.0-18.0+x0^2.0*72.0*2.0*xy^1.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*x02*27216.0*xy^6.0-18.0+x0^2.0*144.0*xy";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0*x02/2.0370370370370368*xy^11.0-0.15*xy^5.0+x0^2.0/5.0*xy^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0*x02/2.0370370370370368/12.0*xy^12.0-0.15/6.0*xy^6.0+x0^2.0*5.0/7.0*xy^7.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0*x02/24.444444444444443*xy^12.0-0.024999999999999998*xy^6.0+x0^2.0/1.4*xy^7.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*x02*27216.0*xy^6.0-18.0+x0^2.0*144.0*xy";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*x02*27216.0*6.0*xy^5.0-18.0*0.0+x0^2.0*144.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*x02*163296.0*xy^5.0+x0^2.0*144.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0*x02/24.444444444444443*xy^12.0-0.024999999999999998*xy^6.0+x0^2.0/1.4*xy^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0*x02/24.444444444444443/13.0*xy^13.0-0.024999999999999998/7.0*xy^7.0+x0^2.0*1.4/8.0*xy^8.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0*x02/317.77777777777777*xy^13.0-0.0035714285714285713*xy^7.0+x0^2.0/5.714285714285714*xy^8.0";
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

public static void TestCaseDiff121191() {
 UsageCalculus.TestCase = 121191;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xyz^3*3*xyz/1*xyz^2*--3*xyz^33*xyz1*x0^2*--3*x0^32*xyz^3*3*xyz3*xyz/1*xyz^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=190 EqnNumber=93 FamilyID=1 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[83, 93, 3, 4, 3, 2, 3, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 1, 1, 4, 2, 3, 1, 3, 4, 2, 4, 2, 3, 4, 5, 6, 15]"+
"// DOEMatrixRow=[12, 95, 5, 4, 2, 3, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 45, 4, 2, 3, 2, 3, 1, 4, 3, 1, 2, 1, 1, 2, 17, 13]"+
//Tail EqnIndex=190 EqnNumber=93 FamilyID=1 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[83, 93, 3, 4, 3, 2, 3, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 1, 1, 4, 2, 3, 1, 3, 4, 2, 4, 2, 3, 4, 5, 6, 15]"+
"// DOEMatrixRow=[12, 95, 5, 4, 2, 3, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 45, 4, 2, 3, 2, 3, 1, 4, 3, 1, 2, 1, 1, 2, 17, 13]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "162.0*xyz^45.0-27.0*xyz^39.0-9.0*xyz^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "162.0*45.0*xyz^44.0-27.0*39.0*xyz^38.0-9.0*6.0*xyz^5.0";
 UsageCalculus.EqnSolArrayMap2[1] = "7290.0*xyz^44.0-1053.0*xyz^38.0-54.0*xyz^5.0";
 UsageCalculus.EqnSolArrayMap3[1] = "162.0*xyz^45.0-27.0*xyz^39.0-9.0*xyz^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "162.0/46.0*xyz^46.0-27.0/40.0*xyz^40.0-9.0/7.0*xyz^7.0";
 UsageCalculus.EqnSolArrayMap4[1] = "3.5217391304347827*xyz^46.0-1.0/1.4814814814814814*xyz^40.0-1.2857142857142858*xyz^7.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "7290.0*xyz^44.0-1053.0*xyz^38.0-54.0*xyz^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "7290.0*44.0*xyz^43.0-1053.0*38.0*xyz^37.0-54.0*5.0*xyz^4.0";
 UsageCalculus.EqnSolArrayMap2[2] = "320760.0*xyz^43.0-40014.0*xyz^37.0-270.0*xyz^4.0";
 UsageCalculus.EqnSolArrayMap3[2] = "3.5217391304347827*xyz^46.0-1.0/1.4814814814814814*xyz^40.0-1.2857142857142858*xyz^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "3.5217391304347827/47.0*xyz^47.0-1.0/1.4814814814814814/41.0*xyz^41.0-1.2857142857142858/8.0*xyz^8.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/13.345679012345679*xyz^47.0-1.0/60.74074074074074*xyz^41.0-1.0/6.222222222222221*xyz^8.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "320760.0*xyz^43.0-40014.0*xyz^37.0-270.0*xyz^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "320760.0*43.0*xyz^42.0-40014.0*37.0*xyz^36.0-270.0*4.0*xyz^3.0";
 UsageCalculus.EqnSolArrayMap2[3] = "1.379268E7*xyz^42.0-1480518.0*xyz^36.0-1080.0*xyz^3.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/13.345679012345679*xyz^47.0-1.0/60.74074074074074*xyz^41.0-1.0/6.222222222222221*xyz^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/13.345679012345679/48.0*xyz^48.0-1.0/60.74074074074074/42.0*xyz^42.0-1.0/6.222222222222221/9.0*xyz^9.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/640.5925925925926*xyz^48.0-1.0/2551.1111111111113*xyz^42.0-1.0/55.99999999999999*xyz^9.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "1.379268E7*xyz^42.0-1480518.0*xyz^36.0-1080.0*xyz^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "42.0*xyz^41.0-1480518.0*36.0*xyz^35.0-1080.0*3.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap2[4] = "42.0*xyz^41.0-5.3298648E7*xyz^35.0-3240.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/640.5925925925926*xyz^48.0-1.0/2551.1111111111113*xyz^42.0-1.0/55.99999999999999*xyz^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/640.5925925925926/49.0*xyz^49.0-1.0/2551.1111111111113/43.0*xyz^43.0-1.0/55.99999999999999/10.0*xyz^10.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/31389.037037037036*xyz^49.0-1.0/109697.77777777778*xyz^43.0-1.0/559.9999999999999*xyz^10.0";
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

public static void TestCaseDiff121192() {
 UsageCalculus.TestCase = 121192;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xyza1*x0^2*--3*x0^3-3*xyza^3*1*xyza/2*xyza^21*xyza/2*xyza^2*-3*xyza^3*-1*xyza3*xyza/1*xyza^21*x0^2*--3*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=191 EqnNumber=94 FamilyID=2 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[47, 94, 4, 5, 4, 3, 1, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 2, 3, 5, 3, 1, 2, 4, 5, 3, 1, 3, 4, 5, 6, 7, 16]"+
"// DOEMatrixRow=[79, 96, 6, 1, 3, 1, 2, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 46, 5, 3, 1, 3, 1, 2, 5, 4, 2, 3, 2, 3, 1, 18, 14]"+
//Tail EqnIndex=191 EqnNumber=94 FamilyID=2 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[47, 94, 4, 5, 4, 3, 1, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 2, 3, 5, 3, 1, 2, 4, 5, 3, 1, 3, 4, 5, 6, 7, 16]"+
"// DOEMatrixRow=[79, 96, 6, 1, 3, 1, 2, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 46, 5, 3, 1, 3, 1, 2, 5, 4, 2, 3, 2, 3, 1, 18, 14]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0*9.0-x0^3.0*3.0-x0^2.0*6.75*xyza^53.0-x0^3.0*3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0*9.0*0.0-x0^3.0*3.0*0.0-x0^2.0*6.75*53.0*xyza^52.0-x0^3.0*3.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*0.0-x0^3.0*0.0-x0^2.0*357.75*xyza^52.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0*9.0-x0^3.0*3.0-x0^2.0*6.75*xyza^53.0-x0^3.0*3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0*9.0*xyza-x0^3.0*xyza-x0^2.0*6.75/54.0*xyza^54.0-x0^3.0*xyza";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0*9.0*xyza-x0^3.0*xyza-x0^2.0*0.125*xyza^54.0-x0^3.0*xyza";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*0.0-x0^3.0*0.0-x0^2.0*357.75*xyza^52.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*0.0-x0^3.0*0.0*0.0-x0^2.0*357.75*52.0*xyza^51.0-x0^3.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*0.0-x0^3.0*0.0-x0^2.0*18603.0*xyza^51.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0*9.0*xyza-x0^3.0*xyza-x0^2.0*0.125*xyza^54.0-x0^3.0*xyza";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0*9.0/2.0*xyza^2.0-x0^3.0/2.0*xyza^2.0-x0^2.0*0.125/55.0*xyza^55.0-x0^3.0/2.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0*4.5*xyza^2.0-x0^3.0/2.0*xyza^2.0-x0^2.0*0.0022727272727272726*xyza^55.0-x0^3.0/2.0*xyza^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*0.0-x0^3.0*0.0-x0^2.0*18603.0*xyza^51.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*0.0-x0^3.0*0.0*0.0-x0^2.0*18603.0*51.0*xyza^50.0-x0^3.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*0.0-x0^3.0*0.0-x0^2.0*948753.0*xyza^50.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0*4.5*xyza^2.0-x0^3.0/2.0*xyza^2.0-x0^2.0*0.0022727272727272726*xyza^55.0-x0^3.0/2.0*xyza^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0*4.5/3.0*xyza^3.0-x0^3.0/2.0/3.0*xyza^3.0-x0^2.0*0.0022727272727272726/56.0*xyza^56.0-x0^3.0*2.0/3.0*xyza^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0*1.5*xyza^3.0-x0^3.0*0.16666666666666666*xyza^3.0-x0^2.0*4.0584415584415584E-5*xyza^56.0-x0^3.0/1.5*xyza^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*0.0-x0^3.0*0.0-x0^2.0*948753.0*xyza^50.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*0.0-x0^3.0*0.0*0.0-x0^2.0*948753.0*50.0*xyza^49.0-x0^3.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*0.0-x0^3.0*0.0-x0^2.0*4.743765E7*xyza^49.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0*1.5*xyza^3.0-x0^3.0*0.16666666666666666*xyza^3.0-x0^2.0*4.0584415584415584E-5*xyza^56.0-5.0*xyza^56.0-x0^3.0/1.5*xyza^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0*1.5/4.0*xyza^4.0-x0^3.0*0.16666666666666666/4.0*xyza^4.0-x0^2.0*4.0584415584415584E-5/57.0*xyza^57.0-5.0/57.0*xyza^57.0-x0^3.0*1.5/4.0*xyza^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0*0.375*xyza^4.0-x0^3.0*0.041666666666666664*xyza^4.0-x0^2.0/1404480.0*xyza^57.0-1.0/11.4*xyza^57.0-0.08771929824561403*xyza^57.0-x0^3.0/2.6666666666666665*xyza^4.0";
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

public static void TestCaseDiff121193() {
 UsageCalculus.TestCase = 121193;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x0^2*--3*x0^3-3*x^3*1*x/2*x^21*x/2*x^2*-3*x^3*-1*x2*x0^22*x^3*-3*x1*x0^2*--3*x0^3-3*x^3*1*x";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=192 EqnNumber=95 FamilyID=3 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[11, 95, 5, 6, 1, 1, 2, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 4, 6, 1, 2, 3, 1, 6, 1, 2, 4, 1, 6, 7, 8, 17]"+
"// DOEMatrixRow=[43, 97, 7, 2, 1, 2, 3, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 47, 6, 1, 2, 4, 2, 3, 6, 1, 3, 1, 3, 4, 2, 19, 15]"+
//Tail EqnIndex=192 EqnNumber=95 FamilyID=3 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[11, 95, 5, 6, 1, 1, 2, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 4, 6, 1, 2, 3, 1, 6, 1, 2, 4, 1, 6, 7, 8, 17]"+
"// DOEMatrixRow=[43, 97, 7, 2, 1, 2, 3, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 47, 6, 1, 2, 4, 2, 3, 6, 1, 3, 1, 3, 4, 2, 19, 15]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "3.0-3.0+20.25*x^34.0-3.0-3.0*x^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0-3.0*0.0+20.25*34.0*x^33.0-3.0*0.0-3.0*4.0*x^3.0";
 UsageCalculus.EqnSolArrayMap2[1] = "688.5*x^33.0-12.0*x^3.0";
 UsageCalculus.EqnSolArrayMap3[1] = "3.0-3.0+20.25*x^34.0-3.0-3.0*x^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "3.0*x-3.0*x+20.25/35.0*x^35.0-3.0*x-3.0/5.0*x^5.0";
 UsageCalculus.EqnSolArrayMap4[1] = "3.0*x-3.0*x+1.0/1.728395061728395*x^35.0-3.0*x-1.0/1.6666666666666667*x^5.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "688.5*x^33.0-12.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "688.5*33.0*x^32.0-12.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[2] = "22720.5*x^32.0-36.0*x^2.0";
 UsageCalculus.EqnSolArrayMap3[2] = "3.0*x-3.0*x+1.0/1.728395061728395*x^35.0-3.0*x-1.0/1.6666666666666667*x^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "3.0/2.0*x^2.0-3.0/2.0*x^2.0+1.0/1.728395061728395/36.0*x^36.0-3.0/2.0*x^2.0-1.0/1.6666666666666667/6.0*x^6.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.5*x^2.0-1.5*x^2.0+1.0/62.22222222222222*x^36.0-1.5*x^2.0-1.0/10.0*x^6.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "22720.5*x^32.0-36.0*x^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "22720.5*32.0*x^31.0-36.0*2.0*x^1.0";
 UsageCalculus.EqnSolArrayMap2[3] = "727056.0*x^31.0-72.0*x";
 UsageCalculus.EqnSolArrayMap3[3] = "1.5*x^2.0-1.5*x^2.0+1.0/62.22222222222222*x^36.0-1.5*x^2.0-1.0/10.0*x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.5/3.0*x^3.0-1.5/3.0*x^3.0+1.0/62.22222222222222/37.0*x^37.0-1.5/3.0*x^3.0-1.0/10.0/7.0*x^7.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/2.0*x^3.0-1.0/2.0*x^3.0+1.0/2302.222222222222*x^37.0-1.0/2.0*x^3.0-1.0/70.0*x^7.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "727056.0*x^31.0-72.0*x";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "727056.0*31.0*x^30.0-72.0";
 UsageCalculus.EqnSolArrayMap2[4] = "2.2538736E7*x^30.0-72.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/2.0*x^3.0-1.0/2.0*x^3.0+1.0/2302.222222222222*x^37.0-1.0/2.0*x^3.0-1.0/70.0*x^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/2.0/4.0*x^4.0-1.0/2.0/4.0*x^4.0+1.0/2302.222222222222/38.0*x^38.0-1.0/2.0/4.0*x^4.0-1.0/70.0/8.0*x^8.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/8.0*x^4.0-1.0/8.0*x^4.0+1.0/87484.44444444444*x^38.0-1.0/8.0*x^4.0-1.0/560.0*x^8.0";
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

public static void TestCaseDiff121194() {
 UsageCalculus.TestCase = 121194;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xy^3*1*xy/2*xy^21*xy/2*xy^2*-3*xy^3*-1*xy2*x0^22*xy^3*-3*xy-3*xy/1*xy^2*-2*xy^31*x0^2*-2*x0^3*3*x0/-1*x0^2-3*xy^3*1*xy1*xy/2*xy^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=193 EqnNumber=96 FamilyID=1 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[78, 96, 6, 7, 2, 3, 1, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 1, 7, 2, 3, 1, 2, 7, 2, 3, 5, 2, 7, 8, 9, 18]"+
"// DOEMatrixRow=[7, 98, 8, 3, 2, 3, 1, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 48, 7, 2, 3, 5, 3, 1, 1, 2, 1, 2, 4, 5, 1, 20, 16]"+
//Tail EqnIndex=193 EqnNumber=96 FamilyID=1 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[78, 96, 6, 7, 2, 3, 1, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 1, 7, 2, 3, 1, 2, 7, 2, 3, 5, 2, 7, 8, 9, 18]"+
"// DOEMatrixRow=[7, 98, 8, 3, 2, 3, 1, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 48, 7, 2, 3, 5, 3, 1, 1, 2, 1, 2, 4, 5, 1, 20, 16]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^22.0*6.75*xy^35.0+x0^2.0*x0*36.0*xy^34.0-1.5*xy^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^22.0*6.75*35.0*xy^34.0+x0^2.0*x0*36.0*34.0*xy^33.0-1.5*6.0*xy^5.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^22.0*236.25*xy^34.0+x0^2.0*x0*1224.0*xy^33.0-9.0*xy^5.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^22.0*6.75*xy^35.0+x0^2.0*x0*36.0*xy^34.0-1.5*xy^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^22.0*6.75/36.0*xy^36.0+x0^2.0*x0*36.0/35.0*xy^35.0-1.5/7.0*xy^7.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^22.0*0.1875*xy^36.0+x0^2.0*x0*1.0285714285714285*xy^35.0-1.0/4.666666666666667*xy^7.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^22.0*236.25*xy^34.0+x0^2.0*x0*1224.0*xy^33.0-9.0*xy^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^22.0*236.25*34.0*xy^33.0+x0^2.0*x0*1224.0*33.0*xy^32.0-9.0*5.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^22.0*8032.5*xy^33.0+x0^2.0*x0*40392.0*xy^32.0-45.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^22.0*0.1875*xy^36.0+x0^2.0*x0*1.0285714285714285*xy^35.0-1.0/4.666666666666667*xy^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^22.0*0.1875/37.0*xy^37.0+x0^2.0*x0*1.0285714285714285/36.0*xy^36.0-1.0/4.666666666666667/8.0*xy^8.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^22.0*0.005067567567567568*xy^37.0+x0^2.0*x0/35.0*xy^36.0-1.0/37.333333333333336*xy^8.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^22.0*8032.5*xy^33.0+x0^2.0*x0*40392.0*xy^32.0-45.0*xy^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^22.0*8032.5*33.0*xy^32.0+x0^2.0*x0*40392.0*32.0*xy^31.0-45.0*4.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^22.0*265072.5*xy^32.0+x0^2.0*x0*1292544.0*xy^31.0-180.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^22.0*0.005067567567567568*xy^37.0+x0^2.0*x0/35.0*xy^36.0-1.0/37.333333333333336*xy^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^22.0*0.005067567567567568/38.0*xy^38.0+x0^2.0*x0/35.0/37.0*xy^37.0-1.0/37.333333333333336/9.0*xy^9.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^22.0*1.333570412517781E-4*xy^38.0+x0^2.0*x0/1295.0*xy^37.0-1.0/336.0*xy^9.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^22.0*265072.5*xy^32.0+x0^2.0*x0*1292544.0*xy^31.0-180.0*xy^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^22.0*265072.5*32.0*xy^31.0+x0^2.0*x0*1292544.0*31.0*xy^30.0-180.0*3.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^22.0*8482320.0*xy^31.0+x0^2.0*x0*4.0068864E7*xy^30.0-540.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^22.0*1.333570412517781E-4*xy^38.0-4.0*xy^38.0+x0^2.0*x0/1295.0*xy^37.0-1.0/336.0*xy^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^22.0*1.333570412517781E-4/39.0*xy^39.0-4.0/39.0*xy^39.0+x0^2.0*x0/1295.0/38.0*xy^38.0-1.0/336.0/10.0*xy^10.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^22.0/292448.0*xy^39.0-1.0/9.75*xy^39.0-0.10256410256410256*xy^39.0+x0^2.0*x0/49210.0*xy^38.0-1.0/3360.0*xy^10.0";
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

public static void TestCaseDiff121195() {
 UsageCalculus.TestCase = 121195;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xyz/2*xyz^2*-3*xyz^3*-1*xyz2*x0^22*xyz^3*-3*xyz-3*xyz/1*xyz^2*-2*xyz^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyz^33*xyz/-1*xyz^21*xyz/2*xyz^22*x0^2*-3*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=194 EqnNumber=97 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[42, 97, 7, 8, 3, 1, 2, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 3, 8, 3, 1, 2, 3, 8, 3, 4, 6, 3, 8, 9, 10, 19]"+
"// DOEMatrixRow=[74, 99, 9, 4, 3, 1, 2, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 49, 8, 3, 1, 1, 1, 2, 3, 4, 2, 3, 1, 6, 2, 1, 17]"+
//Tail EqnIndex=194 EqnNumber=97 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[42, 97, 7, 8, 3, 1, 2, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 3, 8, 3, 1, 2, 3, 8, 3, 4, 6, 3, 8, 9, 10, 19]"+
"// DOEMatrixRow=[74, 99, 9, 4, 3, 1, 2, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 49, 8, 3, 1, 1, 1, 2, 3, 4, 2, 3, 1, 6, 2, 1, 17]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^22.0*4.5*xyz^10.0+x0^2.0*x0*54.0*xyz^112.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^22.0*4.5*10.0*xyz^9.0+x0^2.0*x0*112.0*xyz^111.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^22.0*45.0*xyz^9.0+x0^2.0*x0*112.0*xyz^111.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^22.0*4.5*xyz^10.0+x0^2.0*x0*54.0*xyz^112.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^22.0*4.5/11.0*xyz^11.0+x0^2.0*x0*54.0/113.0*xyz^113.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^22.0*0.4090909090909091*xyz^11.0+x0^2.0*x0/2.0925925925925926*xyz^113.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^22.0*45.0*xyz^9.0+x0^2.0*x0*112.0*xyz^111.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^22.0*45.0*9.0*xyz^8.0+x0^2.0*x0*111.0*xyz^110.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^22.0*405.0*xyz^8.0+x0^2.0*x0*111.0*xyz^110.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^22.0*0.4090909090909091*xyz^11.0+x0^2.0*x0/2.0925925925925926*xyz^113.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^22.0*0.4090909090909091/12.0*xyz^12.0+x0^2.0*x0/2.0925925925925926/114.0*xyz^114.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^22.0*0.034090909090909095*xyz^12.0+x0^2.0*x0/238.55555555555554*xyz^114.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^22.0*405.0*xyz^8.0+x0^2.0*x0*111.0*xyz^110.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^22.0*405.0*8.0*xyz^7.0+x0^2.0*x0*110.0*xyz^109.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^22.0*3240.0*xyz^7.0+x0^2.0*x0*110.0*xyz^109.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^22.0*0.034090909090909095*xyz^12.0+x0^2.0*x0/238.55555555555554*xyz^114.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^22.0*0.034090909090909095/13.0*xyz^13.0+x0^2.0*x0/238.55555555555554/115.0*xyz^115.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^22.0*0.002622377622377623*xyz^13.0+x0^2.0*x0/27433.888888888887*xyz^115.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^22.0*3240.0*xyz^7.0+x0^2.0*x0*110.0*xyz^109.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^22.0*3240.0*7.0*xyz^6.0+x0^2.0*x0*109.0*xyz^108.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^22.0*22680.0*xyz^6.0+x0^2.0*x0*109.0*xyz^108.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^22.0*0.002622377622377623*xyz^13.0+x0^2.0*x0/27433.888888888887*xyz^115.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^22.0*0.002622377622377623/14.0*xyz^14.0+x0^2.0*x0/27433.888888888887/116.0*xyz^116.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^22.0*1.8731268731268734E-4*xyz^14.0+x0^2.0*x0/3182331.111111111*xyz^116.0";
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

public static void TestCaseDiff121196() {
 UsageCalculus.TestCase = 121196;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*x0^22*xyza^3*-3*xyza-3*xyza/1*xyza^2*-2*xyza^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyza^33*xyza/-1*xyza^2-1*x0^2*-2*x0^3*3*x02*xyza^3*3*xyza/1*xyza^2*--3*xyza^32*x0^2*-3*x0^32*xyza^3*-3*xyza";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=195 EqnNumber=98 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[6, 98, 8, 9, 4, 2, 3, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 5, 3, 4, 9, 1, 2, 3, 4, 9, 1, 1, 7, 4, 9, 10, 11, 20]"+
"// DOEMatrixRow=[38, 100, 10, 1, 1, 2, 3, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 50, 9, 1, 2, 3, 2, 3, 4, 1, 3, 1, 2, 7, 1, 2, 18]"+
//Tail EqnIndex=195 EqnNumber=98 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[6, 98, 8, 9, 4, 2, 3, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 5, 3, 4, 9, 1, 2, 3, 4, 9, 1, 1, 7, 4, 9, 10, 11, 20]"+
"// DOEMatrixRow=[38, 100, 10, 1, 1, 2, 3, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 50, 9, 1, 2, 3, 2, 3, 4, 1, 3, 1, 2, 7, 1, 2, 18]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^22.0*6.0*xyza^4.0-x0^2.0*x0*36.0*xyza^70.0+x0^2.0*x02*486.0*xyza^42.0-x0^2.0*27.0*xyza^36.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^22.0*6.0*4.0*xyza^3.0-x0^2.0*x0*36.0*70.0*xyza^69.0+x0^2.0*x02*486.0*42.0*xyza^41.0-x0^2.0*27.0*36.0*xyza^35.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^22.0*24.0*xyza^3.0-x0^2.0*x0*2520.0*xyza^69.0+x0^2.0*x02*20412.0*xyza^41.0-x0^2.0*972.0*xyza^35.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^22.0*6.0*xyza^4.0-x0^2.0*x0*36.0*xyza^70.0+x0^2.0*x02*486.0*xyza^42.0-x0^2.0*27.0*xyza^36.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^22.0*6.0/5.0*xyza^5.0-x0^2.0*x0*36.0/71.0*xyza^71.0+x0^2.0*x02*486.0/43.0*xyza^43.0-x0^2.0*27.0/37.0*xyza^37.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^22.0*1.2*xyza^5.0-x0^2.0*x0*0.5070422535211268*xyza^71.0+x0^2.0*x02*11.30232558139535*xyza^43.0-x0^2.0/1.3703703703703705*xyza^37.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^22.0*24.0*xyza^3.0-x0^2.0*x0*2520.0*xyza^69.0+x0^2.0*x02*20412.0*xyza^41.0-x0^2.0*972.0*xyza^35.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^22.0*24.0*3.0*xyza^2.0-x0^2.0*x0*2520.0*69.0*xyza^68.0+x0^2.0*x02*20412.0*41.0*xyza^40.0-x0^2.0*972.0*35.0*xyza^34.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^22.0*72.0*xyza^2.0-x0^2.0*x0*173880.0*xyza^68.0+x0^2.0*x02*836892.0*xyza^40.0-x0^2.0*34020.0*xyza^34.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^22.0*1.2*xyza^5.0-x0^2.0*x0*0.5070422535211268*xyza^71.0+x0^2.0*x02*11.30232558139535*xyza^43.0-x0^2.0/1.3703703703703705*xyza^37.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^22.0*1.2/6.0*xyza^6.0-x0^2.0*x0*0.5070422535211268/72.0*xyza^72.0+x0^2.0*x02*11.30232558139535/44.0*xyza^44.0-x0^2.0*1.3703703703703705/38.0*xyza^38.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^22.0*0.19999999999999998*xyza^6.0-x0^2.0*x0*0.007042253521126761*xyza^72.0+x0^2.0*x02*0.2568710359408034*xyza^44.0-x0^2.0/27.729729729729726*xyza^38.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^22.0*72.0*xyza^2.0-x0^2.0*x0*173880.0*xyza^68.0+x0^2.0*x02*836892.0*xyza^40.0-x0^2.0*34020.0*xyza^34.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^22.0*72.0*2.0*xyza^1.0-x0^2.0*x0*173880.0*68.0*xyza^67.0+x0^2.0*x02*836892.0*40.0*xyza^39.0-x0^2.0*34020.0*34.0*xyza^33.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^22.0*144.0*xyza-x0^2.0*x0*1.182384E7*xyza^67.0+x0^2.0*x02*3.347568E7*xyza^39.0-x0^2.0*1156680.0*xyza^33.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^22.0*0.19999999999999998*xyza^6.0-x0^2.0*x0*0.007042253521126761*xyza^72.0+x0^2.0*x02*0.2568710359408034*xyza^44.0-x0^2.0/27.729729729729726*xyza^38.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^22.0*0.19999999999999998/7.0*xyza^7.0-x0^2.0*x0*0.007042253521126761/73.0*xyza^73.0+x0^2.0*x02*0.2568710359408034/45.0*xyza^45.0-x0^2.0*27.729729729729726/39.0*xyza^39.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^22.0*0.02857142857142857*xyza^7.0-x0^2.0*x0*9.646922631680494E-5*xyza^73.0+x0^2.0*x02*0.005708245243128965*xyza^45.0-x0^2.0/1.406432748538012*xyza^39.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^22.0*144.0*xyza-x0^2.0*x0*1.182384E7*xyza^67.0+x0^2.0*x02*3.347568E7*xyza^39.0-x0^2.0*1156680.0*xyza^33.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^22.0*144.0-x0^2.0*x0*1.182384E7*67.0*xyza^66.0+x0^2.0*x02*3.347568E7*39.0*xyza^38.0-x0^2.0*1156680.0*33.0*xyza^32.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^22.0*144.0-x0^2.0*x0*7.9219728E8*xyza^66.0+x0^2.0*x02*1.30555152E9*xyza^38.0-x0^2.0*3.817044E7*xyza^32.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^22.0*0.02857142857142857*xyza^7.0-x0^2.0*x0*9.646922631680494E-5*xyza^73.0-5.0*xyza^73.0+x0^2.0*x02*0.005708245243128965*xyza^45.0-x0^2.0/1.406432748538012*xyza^39.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^22.0*0.02857142857142857/8.0*xyza^8.0-x0^2.0*x0*9.646922631680494E-5/74.0*xyza^74.0-5.0/74.0*xyza^74.0+x0^2.0*x02*0.005708245243128965/46.0*xyza^46.0-x0^2.0*1.406432748538012/40.0*xyza^40.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^22.0*0.0035714285714285713*xyza^8.0-x0^2.0*x0/767084.0*xyza^74.0-1.0/14.8*xyza^74.0-0.06756756756756757*xyza^74.0+x0^2.0*x02*1.2409228789410793E-4*xyza^46.0-x0^2.0/28.440748440748436*xyza^40.0";
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

public static void TestCaseDiff121197() {
 UsageCalculus.TestCase = 121197;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*x^3*-3*x-3*x/1*x^2*-2*x^31*x0^2*-2*x0^3*3*x0/-1*x0^22*x^33*x/-1*x^2-1*x0^2*-2*x0^3*3*x02*x^3*3*x/1*x^2*--3*x^33*x1*x^2*--3*x^32*x^3*-3*x-3*x/1*x^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=196 EqnNumber=99 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[73, 99, 9, 10, 1, 3, 1, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 1, 1, 1, 10, 2, 3, 1, 1, 10, 2, 3, 8, 1, 10, 11, 12, 21]"+
"// DOEMatrixRow=[2, 1, 11, 2, 3, 1, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 1, 10, 2, 3, 4, 3, 1, 5, 2, 1, 2, 3, 8, 2, 3, 19]"+
//Tail EqnIndex=196 EqnNumber=99 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[73, 99, 9, 10, 1, 3, 1, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 1, 1, 1, 10, 2, 3, 1, 1, 10, 2, 3, 8, 1, 10, 11, 12, 21]"+
"// DOEMatrixRow=[2, 1, 11, 2, 3, 1, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 1, 10, 2, 3, 4, 3, 1, 5, 2, 1, 2, 3, 8, 2, 3, 19]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-6.0*x^4.0-36.0*x^70.0+486.0*x^77.0-27.0*x^71.0+9.0*x^36.0-3.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-6.0*4.0*x^3.0-36.0*70.0*x^69.0+486.0*77.0*x^76.0-27.0*71.0*x^70.0+9.0*36.0*x^35.0-3.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-24.0*x^3.0-2520.0*x^69.0+37422.0*x^76.0-1917.0*x^70.0+324.0*x^35.0-9.0*x^2.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-6.0*x^4.0-36.0*x^70.0+486.0*x^77.0-27.0*x^71.0+9.0*x^36.0-3.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-6.0/5.0*x^5.0-36.0/71.0*x^71.0+486.0/78.0*x^78.0-27.0/72.0*x^72.0+9.0/37.0*x^37.0-3.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.2*x^5.0-1.0/1.9722222222222223*x^71.0+6.230769230769231*x^78.0-1.0/2.6666666666666665*x^72.0+1.0/4.111111111111111*x^37.0-1.0/1.3333333333333333*x^4.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-24.0*x^3.0-2520.0*x^69.0+37422.0*x^76.0-1917.0*x^70.0+324.0*x^35.0-9.0*x^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-24.0*3.0*x^2.0-2520.0*69.0*x^68.0+37422.0*76.0*x^75.0-1917.0*70.0*x^69.0+324.0*35.0*x^34.0-9.0*2.0*x^1.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-72.0*x^2.0-173880.0*x^68.0+2844072.0*x^75.0-134190.0*x^69.0+11340.0*x^34.0-18.0*x";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.2*x^5.0-1.0/1.9722222222222223*x^71.0+6.230769230769231*x^78.0-1.0/2.6666666666666665*x^72.0+1.0/4.111111111111111*x^37.0-1.0/1.3333333333333333*x^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.2/6.0*x^6.0-1.0/1.9722222222222223/72.0*x^72.0+6.230769230769231/79.0*x^79.0-1.0/2.6666666666666665/73.0*x^73.0+1.0/4.111111111111111/38.0*x^38.0-1.0/1.3333333333333333/5.0*x^5.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/5.0*x^6.0-1.0/142.0*x^72.0+1.0/12.679012345679013*x^79.0-1.0/194.66666666666666*x^73.0+1.0/156.2222222222222*x^38.0-1.0/6.666666666666666*x^5.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-72.0*x^2.0-173880.0*x^68.0+2844072.0*x^75.0-134190.0*x^69.0+11340.0*x^34.0-18.0*x";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-72.0*2.0*x^1.0-173880.0*68.0*x^67.0+2844072.0*75.0*x^74.0-134190.0*69.0*x^68.0+11340.0*34.0*x^33.0-18.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-144.0*x-1.182384E7*x^67.0+2.133054E8*x^74.0-9259110.0*x^68.0+385560.0*x^33.0-18.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/5.0*x^6.0-1.0/142.0*x^72.0+1.0/12.679012345679013*x^79.0-1.0/194.66666666666666*x^73.0+1.0/156.2222222222222*x^38.0-1.0/6.666666666666666*x^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/5.0/7.0*x^7.0-1.0/142.0/73.0*x^73.0+1.0/12.679012345679013/80.0*x^80.0-1.0/194.66666666666666/74.0*x^74.0+1.0/156.2222222222222/39.0*x^39.0-1.0/6.666666666666666/6.0*x^6.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/35.0*x^7.0-1.0/10366.0*x^73.0+1.0/1014.320987654321*x^80.0-1.0/14405.333333333332*x^74.0+1.0/6092.666666666666*x^39.0-1.0/40.0*x^6.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-144.0*x-1.182384E7*x^67.0+2.133054E8*x^74.0-9259110.0*x^68.0+385560.0*x^33.0-18.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-144.0-67.0*x^66.0+74.0*x^73.0-9259110.0*68.0*x^67.0+385560.0*33.0*x^32.0-18.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-144.0-67.0*x^66.0+74.0*x^73.0-6.2961948E8*x^67.0+1.272348E7*x^32.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/35.0*x^7.0-1.0/10366.0*x^73.0+1.0/1014.320987654321*x^80.0-1.0/14405.333333333332*x^74.0+1.0/6092.666666666666*x^39.0-1.0/40.0*x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/35.0/8.0*x^8.0-1.0/10366.0/74.0*x^74.0+1.0/1014.320987654321/81.0*x^81.0-1.0/14405.333333333332/75.0*x^75.0+1.0/6092.666666666666/40.0*x^40.0-1.0/40.0/7.0*x^7.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/280.0*x^8.0-1.0/767084.0*x^74.0+1.0/82160.0*x^81.0-1.0/1080400.0*x^75.0+1.0/243706.66666666663*x^40.0-1.0/280.0*x^7.0";
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

public static void TestCaseDiff121198() {
 UsageCalculus.TestCase = 121198;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xy/1*xy^2*-2*xy^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xy^33*xy/-1*xy^2-1*x0^2*-2*x0^3*3*x02*xy^3*3*xy/1*xy^2*--3*xy^33*xy1*xy^2*--3*xy^3-3*xy012^3*1*xy012/2*xy012^21*xy/2*xy^2*-3*xy^3*-1*xy-3*xy/1*xy^21*x0^2*-2*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=197 EqnNumber=100 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[37, 100, 10, 11, 2, 1, 2, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 2, 3, 11, 3, 1, 2, 3, 11, 3, 4, 9, 2, 11, 12, 13, 22]"+
"// DOEMatrixRow=[68, 2, 12, 3, 1, 2, 3, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 2, 1, 3, 1, 5, 1, 2, 6, 3, 2, 3, 4, 9, 1, 4, 20]"+
//Tail EqnIndex=197 EqnNumber=100 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[37, 100, 10, 11, 2, 1, 2, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 2, 3, 11, 3, 1, 2, 3, 11, 3, 4, 9, 2, 11, 12, 13, 22]"+
"// DOEMatrixRow=[68, 2, 12, 3, 1, 2, 3, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 2, 1, 3, 1, 5, 1, 2, 6, 3, 2, 3, 4, 9, 1, 4, 20]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^2.0*x0*36.0*xy^70.0+162.0*xy^44.0-9.0*xy^38.0-3.0*xy^3.0-2.25*xy^7.0+x0^2.0*6.0*xy^22.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^2.0*x0*36.0*70.0*xy^69.0+162.0*44.0*xy^43.0-9.0*38.0*xy^37.0-3.0*3.0*xy^2.0-2.25*7.0*xy^6.0+x0^2.0*6.0*22.0*xy^21.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^2.0*x0*2520.0*xy^69.0+7128.0*xy^43.0-342.0*xy^37.0-9.0*xy^2.0-15.75*xy^6.0+x0^2.0*132.0*xy^21.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^2.0*x0*36.0*xy^70.0+162.0*xy^44.0-9.0*xy^38.0-3.0*xy^3.0-2.25*xy^7.0+x0^2.0*6.0*xy^22.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^2.0*x0*36.0/71.0*xy^71.0+162.0/45.0*xy^45.0-9.0/39.0*xy^39.0-3.0/4.0*xy^4.0-2.25/8.0*xy^8.0+x0^2.0*6.0/23.0*xy^23.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^2.0*x0/1.9722222222222223*xy^71.0+3.6*xy^45.0-1.0/4.333333333333333*xy^39.0-1.0/1.3333333333333333*xy^4.0-0.28125*xy^8.0+x0^2.0/3.8333333333333335*xy^23.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^2.0*x0*2520.0*xy^69.0+7128.0*xy^43.0-342.0*xy^37.0-9.0*xy^2.0-15.75*xy^6.0+x0^2.0*132.0*xy^21.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^2.0*x0*2520.0*69.0*xy^68.0+7128.0*43.0*xy^42.0-342.0*37.0*xy^36.0-9.0*2.0*xy^1.0-15.75*6.0*xy^5.0+x0^2.0*132.0*21.0*xy^20.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^2.0*x0*173880.0*xy^68.0+306504.0*xy^42.0-12654.0*xy^36.0-18.0*xy-94.5*xy^5.0+x0^2.0*2772.0*xy^20.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^2.0*x0/1.9722222222222223*xy^71.0+3.6*xy^45.0-1.0/4.333333333333333*xy^39.0-1.0/1.3333333333333333*xy^4.0-0.28125*xy^8.0+x0^2.0/3.8333333333333335*xy^23.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^2.0*x0/1.9722222222222223/72.0*xy^72.0+3.6/46.0*xy^46.0-1.0/4.333333333333333/40.0*xy^40.0-1.0/1.3333333333333333/5.0*xy^5.0-0.28125/9.0*xy^9.0+x0^2.0*3.8333333333333335/24.0*xy^24.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^2.0*x0/142.0*xy^72.0+1.0/12.777777777777777*xy^46.0-1.0/173.33333333333331*xy^40.0-1.0/6.666666666666666*xy^5.0-0.03125*xy^9.0+x0^2.0/6.260869565217391*xy^24.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^2.0*x0*173880.0*xy^68.0+306504.0*xy^42.0-12654.0*xy^36.0-18.0*xy-94.5*xy^5.0+x0^2.0*2772.0*xy^20.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^2.0*x0*173880.0*68.0*xy^67.0+306504.0*42.0*xy^41.0-12654.0*36.0*xy^35.0-18.0-94.5*5.0*xy^4.0+x0^2.0*2772.0*20.0*xy^19.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^2.0*x0*1.182384E7*xy^67.0+1.2873168E7*xy^41.0-455544.0*xy^35.0-18.0-472.5*xy^4.0+x0^2.0*55440.0*xy^19.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^2.0*x0/142.0*xy^72.0+1.0/12.777777777777777*xy^46.0-1.0/173.33333333333331*xy^40.0-1.0/6.666666666666666*xy^5.0-0.03125*xy^9.0+x0^2.0/6.260869565217391*xy^24.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^2.0*x0/142.0/73.0*xy^73.0+1.0/12.777777777777777/47.0*xy^47.0-1.0/173.33333333333331/41.0*xy^41.0-1.0/6.666666666666666/6.0*xy^6.0-0.03125/10.0*xy^10.0+x0^2.0*6.260869565217391/25.0*xy^25.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^2.0*x0/10366.0*xy^73.0+1.0/600.5555555555555*xy^47.0-1.0/7106.666666666666*xy^41.0-1.0/40.0*xy^6.0-0.003125*xy^10.0+x0^2.0/3.993055555555556*xy^25.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^2.0*x0*1.182384E7*xy^67.0+1.2873168E7*xy^41.0-455544.0*xy^35.0-18.0-472.5*xy^4.0+x0^2.0*55440.0*xy^19.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^2.0*x0*1.182384E7*67.0*xy^66.0+41.0*xy^40.0-455544.0*35.0*xy^34.0-18.0*0.0-472.5*4.0*xy^3.0+x0^2.0*55440.0*19.0*xy^18.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^2.0*x0*7.9219728E8*xy^66.0+41.0*xy^40.0-1.594404E7*xy^34.0-1890.0*xy^3.0+x0^2.0*1053360.0*xy^18.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^2.0*x0/10366.0*xy^73.0+1.0/600.5555555555555*xy^47.0-1.0/7106.666666666666*xy^41.0-1.0/40.0*xy^6.0-0.003125*xy^10.0+x0^2.0/3.993055555555556*xy^25.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^2.0*x0/10366.0/74.0*xy^74.0+1.0/600.5555555555555/48.0*xy^48.0-1.0/7106.666666666666/42.0*xy^42.0-1.0/40.0/7.0*xy^7.0-0.003125/11.0*xy^11.0+x0^2.0*3.993055555555556/26.0*xy^26.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^2.0*x0/767084.0*xy^74.0+1.0/28826.666666666664*xy^48.0-1.0/298480.0*xy^42.0-1.0/280.0*xy^7.0-2.8409090909090913E-4*xy^11.0+x0^2.0/6.511304347826086*xy^26.0";
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

public static void TestCaseDiff121199() {
 UsageCalculus.TestCase = 121199;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xy012/1*xy012^2*-2*xy012^3*3*xy0121*xyz^22*xyz^3*3*xyz3*x0/-1*x0^2*-2*x0^3-1*xyz^2*-2*xyz^3*3*xyz/1*xyz^22*xyz^33*x0/1*x0^21*xyz^2*--3*xyz^3*1*xyz-3*xyz^3*1*xyz/2*xyz^2*-3*xyz^31*x02*xyz^2*-3*xyz^3-3*xy012/1*xy012^21*xyz^2*-2*xyz^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=198 EqnNumber=1 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[2, 1, 11, 12, 3, 2, 3, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 3, 4, 12, 1, 2, 3, 4, 12, 1, 1, 10, 3, 12, 13, 14, 23]"+
"// DOEMatrixRow=[34, 2, 13, 4, 1, 3, 1, 2, 3, 4, 1, 2, 3, 2, 3, 1, 2, 3, 2, 1, 1, 2, 3, 2, 3, 4, 1, 1, 2, 3, 2, 3, 1]"+
//Tail EqnIndex=198 EqnNumber=1 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[2, 1, 11, 12, 3, 2, 3, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 3, 4, 12, 1, 2, 3, 4, 12, 1, 1, 10, 3, 12, 13, 14, 23]"+
"// DOEMatrixRow=[34, 2, 13, 4, 1, 3, 1, 2, 3, 4, 1, 2, 3, 2, 3, 1, 2, 3, 2, 1, 1, 2, 3, 2, 3, 4, 1, 1, 2, 3, 2, 3, 1]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0*108.0*xyz^25.0+x0*18.0*xyz^67.0-3.0*xyz^4.0-x02*13.5*xyz^42.0+xy012*6.0*xyz^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0*108.0*25.0*xyz^24.0+x0*18.0*67.0*xyz^66.0-3.0*4.0*xyz^3.0-x02*13.5*42.0*xyz^41.0+xy012*6.0*5.0*xyz^4.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0*2700.0*xyz^24.0+x0*1206.0*xyz^66.0-12.0*xyz^3.0-x02*567.0*xyz^41.0+xy012*30.0*xyz^4.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0*108.0*xyz^25.0+x0*18.0*xyz^67.0-3.0*xyz^4.0-x02*13.5*xyz^42.0+xy012*6.0*xyz^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0*108.0/26.0*xyz^26.0+x0*18.0/68.0*xyz^68.0-3.0/5.0*xyz^5.0-x02*13.5/43.0*xyz^43.0+xy012*6.0/6.0*xyz^6.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0*4.153846153846154*xyz^26.0+x0/3.7777777777777777*xyz^68.0-0.6*xyz^5.0-x02*0.313953488372093*xyz^43.0+xy012*xyz^6.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0*2700.0*xyz^24.0+x0*1206.0*xyz^66.0-12.0*xyz^3.0-x02*567.0*xyz^41.0+xy012*30.0*xyz^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0*2700.0*24.0*xyz^23.0+x0*1206.0*66.0*xyz^65.0-12.0*3.0*xyz^2.0-x02*567.0*41.0*xyz^40.0+xy012*30.0*4.0*xyz^3.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0*64800.0*xyz^23.0+x0*79596.0*xyz^65.0-36.0*xyz^2.0-x02*23247.0*xyz^40.0+xy012*120.0*xyz^3.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0*4.153846153846154*xyz^26.0+x0/3.7777777777777777*xyz^68.0-0.6*xyz^5.0-x02*0.313953488372093*xyz^43.0+xy012*xyz^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0*4.153846153846154/27.0*xyz^27.0+x0/3.7777777777777777/69.0*xyz^69.0-0.6/6.0*xyz^6.0-x02*0.313953488372093/44.0*xyz^44.0+xy012/7.0*xyz^7.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0*0.15384615384615385*xyz^27.0+x0/260.6666666666667*xyz^69.0-0.09999999999999999*xyz^6.0-x02*0.007135306553911205*xyz^44.0+xy012/7.0*xyz^7.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0*64800.0*xyz^23.0+x0*79596.0*xyz^65.0-36.0*xyz^2.0-x02*23247.0*xyz^40.0+xy012*120.0*xyz^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0*64800.0*23.0*xyz^22.0+x0*79596.0*65.0*xyz^64.0-36.0*2.0*xyz^1.0-x02*23247.0*40.0*xyz^39.0+xy012*120.0*3.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0*1490400.0*xyz^22.0+x0*5173740.0*xyz^64.0-72.0*xyz-x02*929880.0*xyz^39.0+xy012*360.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0*0.15384615384615385*xyz^27.0+x0/260.6666666666667*xyz^69.0-0.09999999999999999*xyz^6.0-x02*0.007135306553911205*xyz^44.0+xy012/7.0*xyz^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0*0.15384615384615385/28.0*xyz^28.0+x0/260.6666666666667/70.0*xyz^70.0-0.09999999999999999/7.0*xyz^7.0-x02*0.007135306553911205/45.0*xyz^45.0+xy012*7.0/8.0*xyz^8.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0*0.005494505494505495*xyz^28.0+x0/18246.666666666668*xyz^70.0-0.014285714285714285*xyz^7.0-x02*1.5856236786469344E-4*xyz^45.0+xy012/1.1428571428571428*xyz^8.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0*1490400.0*xyz^22.0+x0*5173740.0*xyz^64.0-72.0*xyz-x02*929880.0*xyz^39.0+xy012*360.0*xyz^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0*1490400.0*22.0*xyz^21.0+x0*5173740.0*64.0*xyz^63.0-72.0-x02*929880.0*39.0*xyz^38.0+xy012*360.0*2.0*xyz^1.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0*3.27888E7*xyz^21.0+x0*3.3111936E8*xyz^63.0-72.0-x02*3.626532E7*xyz^38.0+xy012*720.0*xyz";
 UsageCalculus.EqnSolArrayMap3[4] = "x0*0.005494505494505495*xyz^28.0+x0/18246.666666666668*xyz^70.0-0.014285714285714285*xyz^7.0-x02*1.5856236786469344E-4*xyz^45.0-4.0*xyz^45.0+xy012/1.1428571428571428*xyz^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0*0.005494505494505495/29.0*xyz^29.0+x0/18246.666666666668/71.0*xyz^71.0-0.014285714285714285/8.0*xyz^8.0-x02*1.5856236786469344E-4/46.0*xyz^46.0-4.0/46.0*xyz^46.0+xy012*1.1428571428571428/9.0*xyz^9.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0*1.8946570670708604E-4*xyz^29.0+x0/1295513.3333333335*xyz^71.0-0.0017857142857142857*xyz^8.0-x02/290106.6666666667*xyz^46.0-1.0/11.5*xyz^46.0-0.08695652173913043*xyz^46.0+xy012/7.875*xyz^9.0";
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

public static void TestCaseDiff121200() {
 UsageCalculus.TestCase = 121200;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xyza^22*xyza^3*3*xyza3*x0/-1*x0^2*-2*x0^3-1*xyza^2*-2*xyza^3*3*xyza/1*xyza^22*xyza^33*x0/1*x0^21*xyza^2*--3*xyza^3*1*xyza-3*xyza^3*1*xyza/2*xyza^2*-3*xyza^31*x02*xyza^2*-3*xyza^33*xyza^3*-1*xyza/2*xyza^22*x0^2*-3*x0^3*1*x0/-3*x0^21*xyza^2*-2*xyza^32*xyza^3*3*xyza";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=199 EqnNumber=2 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[67, 2, 12, 13, 4, 3, 1, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 1, 1, 13, 2, 3, 1, 1, 13, 2, 3, 11, 4, 13, 14, 15, 24]"+
"// DOEMatrixRow=[99, 3, 14, 1, 2, 1, 2, 3, 1, 1, 2, 1, 1, 3, 4, 2, 3, 4, 3, 2, 3, 4, 1, 3, 4, 1, 2, 3, 4, 5, 1, 4, 2]"+
//Tail EqnIndex=199 EqnNumber=2 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[67, 2, 12, 13, 4, 3, 1, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 1, 1, 13, 2, 3, 1, 1, 13, 2, 3, 11, 4, 13, 14, 15, 24]"+
"// DOEMatrixRow=[99, 3, 14, 1, 2, 1, 2, 3, 1, 1, 2, 1, 1, 3, 4, 2, 3, 4, 3, 2, 3, 4, 1, 3, 4, 1, 2, 3, 4, 5, 1, 4, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0*6.0*xyza^25.0+x0*18.0*xyza^67.0-3.0*xyza^4.0-x02*x0*40.5*xyza^136.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0*6.0*25.0*xyza^24.0+x0*18.0*67.0*xyza^66.0-3.0*4.0*xyza^3.0-x02*x0*136.0*xyza^135.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0*150.0*xyza^24.0+x0*1206.0*xyza^66.0-12.0*xyza^3.0-x02*x0*136.0*xyza^135.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0*6.0*xyza^25.0+x0*18.0*xyza^67.0-3.0*xyza^4.0-x02*x0*40.5*xyza^136.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0*6.0/26.0*xyza^26.0+x0*18.0/68.0*xyza^68.0-3.0/5.0*xyza^5.0-x02*x0*40.5/137.0*xyza^137.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0*0.23076923076923078*xyza^26.0+x0/3.7777777777777777*xyza^68.0-0.6*xyza^5.0-x02*x0/3.382716049382716*xyza^137.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0*150.0*xyza^24.0+x0*1206.0*xyza^66.0-12.0*xyza^3.0-x02*x0*136.0*xyza^135.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0*150.0*24.0*xyza^23.0+x0*1206.0*66.0*xyza^65.0-12.0*3.0*xyza^2.0-x02*x0*135.0*xyza^134.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0*3600.0*xyza^23.0+x0*79596.0*xyza^65.0-36.0*xyza^2.0-x02*x0*135.0*xyza^134.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0*0.23076923076923078*xyza^26.0+x0/3.7777777777777777*xyza^68.0-0.6*xyza^5.0-x02*x0/3.382716049382716*xyza^137.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0*0.23076923076923078/27.0*xyza^27.0+x0/3.7777777777777777/69.0*xyza^69.0-0.6/6.0*xyza^6.0-x02*x0/3.382716049382716/138.0*xyza^138.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0*0.008547008547008548*xyza^27.0+x0/260.6666666666667*xyza^69.0-0.09999999999999999*xyza^6.0-x02*x0/466.8148148148148*xyza^138.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0*3600.0*xyza^23.0+x0*79596.0*xyza^65.0-36.0*xyza^2.0-x02*x0*135.0*xyza^134.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0*3600.0*23.0*xyza^22.0+x0*79596.0*65.0*xyza^64.0-36.0*2.0*xyza^1.0-x02*x0*134.0*xyza^133.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0*82800.0*xyza^22.0+x0*5173740.0*xyza^64.0-72.0*xyza-x02*x0*134.0*xyza^133.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0*0.008547008547008548*xyza^27.0+x0/260.6666666666667*xyza^69.0-0.09999999999999999*xyza^6.0-x02*x0/466.8148148148148*xyza^138.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0*0.008547008547008548/28.0*xyza^28.0+x0/260.6666666666667/70.0*xyza^70.0-0.09999999999999999/7.0*xyza^7.0-x02*x0/466.8148148148148/139.0*xyza^139.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0*3.052503052503053E-4*xyza^28.0+x0/18246.666666666668*xyza^70.0-0.014285714285714285*xyza^7.0-x02*x0/64887.259259259255*xyza^139.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0*82800.0*xyza^22.0+x0*5173740.0*xyza^64.0-72.0*xyza-x02*x0*134.0*xyza^133.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0*82800.0*22.0*xyza^21.0+x0*5173740.0*64.0*xyza^63.0-72.0-x02*x0*133.0*xyza^132.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0*1821600.0*xyza^21.0+x0*3.3111936E8*xyza^63.0-72.0-x02*x0*133.0*xyza^132.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0*3.052503052503053E-4*xyza^28.0-4.0*xyza^28.0+x0/18246.666666666668*xyza^70.0-0.014285714285714285*xyza^7.0-x02*x0/64887.259259259255*xyza^139.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0*3.052503052503053E-4/29.0*xyza^29.0-4.0/29.0*xyza^29.0+x0/18246.666666666668/71.0*xyza^71.0-0.014285714285714285/8.0*xyza^8.0-x02*x0/64887.259259259255/140.0*xyza^140.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0/95003.99999999999*xyza^29.0-1.0/7.25*xyza^29.0-0.13793103448275862*xyza^29.0+x0/1295513.3333333335*xyza^71.0-0.0017857142857142857*xyza^8.0-x02*x0/9084216.296296297*xyza^140.0";
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