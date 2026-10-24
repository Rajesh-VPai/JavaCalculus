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

public class CoPilotEqnDOE4 {
    //CoPilotEqn Test Cases

    public static void CoPilotEqnDOE(String AlgoName, long j) {
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
             
case 130401L:
 TestCaseDiff130401(); 
 break;
case 130402L:
 TestCaseDiff130402(); 
 break;
case 130403L:
 TestCaseDiff130403(); 
 break;
case 130404L:
 TestCaseDiff130404(); 
 break;
case 130405L:
 TestCaseDiff130405(); 
 break;
case 130406L:
 TestCaseDiff130406(); 
 break;
case 130407L:
 TestCaseDiff130407(); 
 break;
case 130408L:
 TestCaseDiff130408(); 
 break;
case 130409L:
 TestCaseDiff130409(); 
 break;
case 130410L:
 TestCaseDiff130410(); 
 break;
case 130411L:
 TestCaseDiff130411(); 
 break;
case 130412L:
 TestCaseDiff130412(); 
 break;
case 130413L:
 TestCaseDiff130413(); 
 break;
case 130414L:
 TestCaseDiff130414(); 
 break;
case 130415L:
 TestCaseDiff130415(); 
 break;
case 130416L:
 TestCaseDiff130416(); 
 break;
case 130417L:
 TestCaseDiff130417(); 
 break;
case 130418L:
 TestCaseDiff130418(); 
 break;
case 130419L:
 TestCaseDiff130419(); 
 break;
case 130420L:
 TestCaseDiff130420(); 
 break;
case 130421L:
 TestCaseDiff130421(); 
 break;
case 130422L:
 TestCaseDiff130422(); 
 break;
case 130423L:
 TestCaseDiff130423(); 
 break;
case 130424L:
 TestCaseDiff130424(); 
 break;
case 130425L:
 TestCaseDiff130425(); 
 break;
case 130426L:
 TestCaseDiff130426(); 
 break;
case 130427L:
 TestCaseDiff130427(); 
 break;
case 130428L:
 TestCaseDiff130428(); 
 break;
case 130429L:
 TestCaseDiff130429(); 
 break;
case 130430L:
 TestCaseDiff130430(); 
 break;
case 130431L:
 TestCaseDiff130431(); 
 break;
case 130432L:
 TestCaseDiff130432(); 
 break;
case 130433L:
 TestCaseDiff130433(); 
 break;
case 130434L:
 TestCaseDiff130434(); 
 break;
case 130435L:
 TestCaseDiff130435(); 
 break;
case 130436L:
 TestCaseDiff130436(); 
 break;
case 130437L:
 TestCaseDiff130437(); 
 break;
case 130438L:
 TestCaseDiff130438(); 
 break;
case 130439L:
 TestCaseDiff130439(); 
 break;
case 130440L:
 TestCaseDiff130440(); 
 break;
case 130441L:
 TestCaseDiff130441(); 
 break;
case 130442L:
 TestCaseDiff130442(); 
 break;
case 130443L:
 TestCaseDiff130443(); 
 break;
case 130444L:
 TestCaseDiff130444(); 
 break;
case 130445L:
 TestCaseDiff130445(); 
 break;
case 130446L:
 TestCaseDiff130446(); 
 break;
case 130447L:
 TestCaseDiff130447(); 
 break;
case 130448L:
 TestCaseDiff130448(); 
 break;
case 130449L:
 TestCaseDiff130449(); 
 break;
case 130450L:
 TestCaseDiff130450(); 
 break;
case 130451L:
 TestCaseDiff130451(); 
 break;
case 130452L:
 TestCaseDiff130452(); 
 break;
case 130453L:
 TestCaseDiff130453(); 
 break;
case 130454L:
 TestCaseDiff130454(); 
 break;
case 130455L:
 TestCaseDiff130455(); 
 break;
case 130456L:
 TestCaseDiff130456(); 
 break;
case 130457L:
 TestCaseDiff130457(); 
 break;
case 130458L:
 TestCaseDiff130458(); 
 break;
case 130459L:
 TestCaseDiff130459(); 
 break;
case 130460L:
 TestCaseDiff130460(); 
 break;
case 130461L:
 TestCaseDiff130461(); 
 break;
case 130462L:
 TestCaseDiff130462(); 
 break;
case 130463L:
 TestCaseDiff130463(); 
 break;
case 130464L:
 TestCaseDiff130464(); 
 break;
case 130465L:
 TestCaseDiff130465(); 
 break;
case 130466L:
 TestCaseDiff130466(); 
 break;
case 130467L:
 TestCaseDiff130467(); 
 break;
case 130468L:
 TestCaseDiff130468(); 
 break;
case 130469L:
 TestCaseDiff130469(); 
 break;
case 130470L:
 TestCaseDiff130470(); 
 break;
case 130471L:
 TestCaseDiff130471(); 
 break;
case 130472L:
 TestCaseDiff130472(); 
 break;
case 130473L:
 TestCaseDiff130473(); 
 break;
case 130474L:
 TestCaseDiff130474(); 
 break;
case 130475L:
 TestCaseDiff130475(); 
 break;
case 130476L:
 TestCaseDiff130476(); 
 break;
case 130477L:
 TestCaseDiff130477(); 
 break;
case 130478L:
 TestCaseDiff130478(); 
 break;
case 130479L:
 TestCaseDiff130479(); 
 break;
case 130480L:
 TestCaseDiff130480(); 
 break;
case 130481L:
 TestCaseDiff130481(); 
 break;
case 130482L:
 TestCaseDiff130482(); 
 break;
case 130483L:
 TestCaseDiff130483(); 
 break;
case 130484L:
 TestCaseDiff130484(); 
 break;
case 130485L:
 TestCaseDiff130485(); 
 break;
case 130486L:
 TestCaseDiff130486(); 
 break;
case 130487L:
 TestCaseDiff130487(); 
 break;
case 130488L:
 TestCaseDiff130488(); 
 break;
case 130489L:
 TestCaseDiff130489(); 
 break;
case 130490L:
 TestCaseDiff130490(); 
 break;
case 130491L:
 TestCaseDiff130491(); 
 break;
case 130492L:
 TestCaseDiff130492(); 
 break;
case 130493L:
 TestCaseDiff130493(); 
 break;
case 130494L:
 TestCaseDiff130494(); 
 break;
case 130495L:
 TestCaseDiff130495(); 
 break;
case 130496L:
 TestCaseDiff130496(); 
 break;
case 130497L:
 TestCaseDiff130497(); 
 break;
case 130498L:
 TestCaseDiff130498(); 
 break;
case 130499L:
 TestCaseDiff130499(); 
 break;
case 130500L:
 TestCaseDiff130500(); 
 break;

                
                
           default:
                    System.out.println(ConsoleColors.RED + "CoPilotEqnBasic TestCase:j= " + j + ": Gap" + ConsoleColors.RESET);
                    break;
            }
        }
    }    
    public static void TestCaseDiff130401() {
 UsageCalculus.TestCase = 130401;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+100*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^1-99+98*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^3+97*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^4-96/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^5-95/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^6+94*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^7-93/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^8+92*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-9";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyzx";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-100.0-99.0-98.0-97.0+96.0+95.0-94.0+93.0-92.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0-99.0*0.0-98.0*0.0-97.0*0.0+96.0*0.0+95.0*0.0-94.0*0.0+93.0*0.0-92.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "-100.0-99.0-98.0-97.0+96.0+95.0-94.0+93.0-92.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-100.0*xyzx-99.0*xyzx-98.0*xyzx-97.0*xyzx+96.0*xyzx+95.0*xyzx-94.0*xyzx+93.0*xyzx-92.0*xyzx";
 UsageCalculus.EqnSolArrayMap4[1] = "-100.0*xyzx-99.0*xyzx-98.0*xyzx-97.0*xyzx+96.0*xyzx+95.0*xyzx-94.0*xyzx+93.0*xyzx-92.0*xyzx";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "-100.0*xyzx-99.0*xyzx-98.0*xyzx-97.0*xyzx+96.0*xyzx+95.0*xyzx-94.0*xyzx+93.0*xyzx-92.0*xyzx";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-100.0/2.0*xyzx^2.0-99.0/2.0*xyzx^2.0-98.0/2.0*xyzx^2.0-97.0/2.0*xyzx^2.0+96.0/2.0*xyzx^2.0+95.0/2.0*xyzx^2.0-94.0/2.0*xyzx^2.0+93.0/2.0*xyzx^2.0-92.0/2.0*xyzx^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-50.0*xyzx^2.0-49.5*xyzx^2.0-49.0*xyzx^2.0-48.5*xyzx^2.0+48.0*xyzx^2.0+47.5*xyzx^2.0-47.0*xyzx^2.0+46.5*xyzx^2.0-46.0*xyzx^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "-50.0*xyzx^2.0-49.5*xyzx^2.0-49.0*xyzx^2.0-48.5*xyzx^2.0+48.0*xyzx^2.0+47.5*xyzx^2.0-47.0*xyzx^2.0+46.5*xyzx^2.0-46.0*xyzx^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-50.0/3.0*xyzx^3.0-49.5/3.0*xyzx^3.0-49.0/3.0*xyzx^3.0-48.5/3.0*xyzx^3.0+48.0/3.0*xyzx^3.0+47.5/3.0*xyzx^3.0-47.0/3.0*xyzx^3.0+46.5/3.0*xyzx^3.0-46.0/3.0*xyzx^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-16.666666666666668*xyzx^3.0-16.5*xyzx^3.0-16.333333333333332*xyzx^3.0-16.166666666666668*xyzx^3.0+16.0*xyzx^3.0+15.833333333333334*xyzx^3.0-15.666666666666666*xyzx^3.0+15.5*xyzx^3.0-15.333333333333334*xyzx^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "-16.666666666666668*xyzx^3.0-16.5*xyzx^3.0-16.333333333333332*xyzx^3.0-16.166666666666668*xyzx^3.0+16.0*xyzx^3.0+15.833333333333334*xyzx^3.0-15.666666666666666*xyzx^3.0+15.5*xyzx^3.0-15.333333333333334*xyzx^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-16.666666666666668/4.0*xyzx^4.0-16.5/4.0*xyzx^4.0-16.333333333333332/4.0*xyzx^4.0-16.166666666666668/4.0*xyzx^4.0+16.0/4.0*xyzx^4.0+15.833333333333334/4.0*xyzx^4.0-15.666666666666666/4.0*xyzx^4.0+15.5/4.0*xyzx^4.0-15.333333333333334/4.0*xyzx^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-4.166666666666667*xyzx^4.0-4.125*xyzx^4.0-4.083333333333333*xyzx^4.0-4.041666666666667*xyzx^4.0+4.0*xyzx^4.0+3.9583333333333335*xyzx^4.0-3.9166666666666665*xyzx^4.0+3.875*xyzx^4.0-3.8333333333333335*xyzx^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130402() {
 UsageCalculus.TestCase = 130402;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-99+98*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^3+97*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^4-96/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^5-95/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^6+94*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^7-93/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^8+92*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-9-91";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-99.0-98.0-97.0+96.0+95.0-94.0+93.0-92.0-91.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0-98.0*0.0-97.0*0.0+96.0*0.0+95.0*0.0-94.0*0.0+93.0*0.0-92.0*0.0-91.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "-99.0-98.0-97.0+96.0+95.0-94.0+93.0-92.0-91.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-99.0*x-98.0*x-97.0*x+96.0*x+95.0*x-94.0*x+93.0*x-92.0*x-91.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "-99.0*x-98.0*x-97.0*x+96.0*x+95.0*x-94.0*x+93.0*x-92.0*x-91.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "-99.0*x-98.0*x-97.0*x+96.0*x+95.0*x-94.0*x+93.0*x-92.0*x-91.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-99.0/2.0*x^2.0-98.0/2.0*x^2.0-97.0/2.0*x^2.0+96.0/2.0*x^2.0+95.0/2.0*x^2.0-94.0/2.0*x^2.0+93.0/2.0*x^2.0-92.0/2.0*x^2.0-91.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-49.5*x^2.0-49.0*x^2.0-48.5*x^2.0+48.0*x^2.0+47.5*x^2.0-47.0*x^2.0+46.5*x^2.0-46.0*x^2.0-45.5*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "-49.5*x^2.0-49.0*x^2.0-48.5*x^2.0+48.0*x^2.0+47.5*x^2.0-47.0*x^2.0+46.5*x^2.0-46.0*x^2.0-45.5*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-49.5/3.0*x^3.0-49.0/3.0*x^3.0-48.5/3.0*x^3.0+48.0/3.0*x^3.0+47.5/3.0*x^3.0-47.0/3.0*x^3.0+46.5/3.0*x^3.0-46.0/3.0*x^3.0-45.5/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-16.5*x^3.0-16.333333333333332*x^3.0-16.166666666666668*x^3.0+16.0*x^3.0+15.833333333333334*x^3.0-15.666666666666666*x^3.0+15.5*x^3.0-15.333333333333334*x^3.0-15.166666666666666*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "-16.5*x^3.0-16.333333333333332*x^3.0-16.166666666666668*x^3.0+16.0*x^3.0+15.833333333333334*x^3.0-15.666666666666666*x^3.0+15.5*x^3.0-15.333333333333334*x^3.0-15.166666666666666*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-16.5/4.0*x^4.0-16.333333333333332/4.0*x^4.0-16.166666666666668/4.0*x^4.0+16.0/4.0*x^4.0+15.833333333333334/4.0*x^4.0-15.666666666666666/4.0*x^4.0+15.5/4.0*x^4.0-15.333333333333334/4.0*x^4.0-15.166666666666666/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-4.125*x^4.0-4.083333333333333*x^4.0-4.041666666666667*x^4.0+4.0*x^4.0+3.9583333333333335*x^4.0-3.9166666666666665*x^4.0+3.875*x^4.0-3.8333333333333335*x^4.0-3.7916666666666665*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130403() {
 UsageCalculus.TestCase = 130403;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+98*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^3+97*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^4-96/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^5-95/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^6+94*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^7-93/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^8+92*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-9-91+90*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^11";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-98.0-97.0+96.0+95.0-94.0+93.0-92.0-91.0-90.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0-97.0*0.0+96.0*0.0+95.0*0.0-94.0*0.0+93.0*0.0-92.0*0.0-91.0*0.0-90.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "-98.0-97.0+96.0+95.0-94.0+93.0-92.0-91.0-90.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-98.0*xy-97.0*xy+96.0*xy+95.0*xy-94.0*xy+93.0*xy-92.0*xy-91.0*xy-90.0*xy";
 UsageCalculus.EqnSolArrayMap4[1] = "-98.0*xy-97.0*xy+96.0*xy+95.0*xy-94.0*xy+93.0*xy-92.0*xy-91.0*xy-90.0*xy";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "-98.0*xy-97.0*xy+96.0*xy+95.0*xy-94.0*xy+93.0*xy-92.0*xy-91.0*xy-90.0*xy";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-98.0/2.0*xy^2.0-97.0/2.0*xy^2.0+96.0/2.0*xy^2.0+95.0/2.0*xy^2.0-94.0/2.0*xy^2.0+93.0/2.0*xy^2.0-92.0/2.0*xy^2.0-91.0/2.0*xy^2.0-90.0/2.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-49.0*xy^2.0-48.5*xy^2.0+48.0*xy^2.0+47.5*xy^2.0-47.0*xy^2.0+46.5*xy^2.0-46.0*xy^2.0-45.5*xy^2.0-45.0*xy^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "-49.0*xy^2.0-48.5*xy^2.0+48.0*xy^2.0+47.5*xy^2.0-47.0*xy^2.0+46.5*xy^2.0-46.0*xy^2.0-45.5*xy^2.0-45.0*xy^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-49.0/3.0*xy^3.0-48.5/3.0*xy^3.0+48.0/3.0*xy^3.0+47.5/3.0*xy^3.0-47.0/3.0*xy^3.0+46.5/3.0*xy^3.0-46.0/3.0*xy^3.0-45.5/3.0*xy^3.0-45.0/3.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-16.333333333333332*xy^3.0-16.166666666666668*xy^3.0+16.0*xy^3.0+15.833333333333334*xy^3.0-15.666666666666666*xy^3.0+15.5*xy^3.0-15.333333333333334*xy^3.0-15.166666666666666*xy^3.0-15.0*xy^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "-16.333333333333332*xy^3.0-16.166666666666668*xy^3.0+16.0*xy^3.0+15.833333333333334*xy^3.0-15.666666666666666*xy^3.0+15.5*xy^3.0-15.333333333333334*xy^3.0-15.166666666666666*xy^3.0-15.0*xy^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-16.333333333333332/4.0*xy^4.0-16.166666666666668/4.0*xy^4.0+16.0/4.0*xy^4.0+15.833333333333334/4.0*xy^4.0-15.666666666666666/4.0*xy^4.0+15.5/4.0*xy^4.0-15.333333333333334/4.0*xy^4.0-15.166666666666666/4.0*xy^4.0-15.0/4.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-4.083333333333333*xy^4.0-4.041666666666667*xy^4.0+4.0*xy^4.0+3.9583333333333335*xy^4.0-3.9166666666666665*xy^4.0+3.875*xy^4.0-3.8333333333333335*xy^4.0-3.7916666666666665*xy^4.0-3.75*xy^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130404() {
 UsageCalculus.TestCase = 130404;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+97*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^4-96/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^5-95/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^6+94*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^7-93/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^8+92*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-9-91+90*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^11-89/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-12";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-97.0+96.0+95.0-94.0+93.0-92.0-91.0-90.0+89.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0+96.0*0.0+95.0*0.0-94.0*0.0+93.0*0.0-92.0*0.0-91.0*0.0-90.0*0.0+89.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "-97.0+96.0+95.0-94.0+93.0-92.0-91.0-90.0+89.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-97.0*x+96.0*x+95.0*x-94.0*x+93.0*x-92.0*x-91.0*x-90.0*x+89.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "-97.0*x+96.0*x+95.0*x-94.0*x+93.0*x-92.0*x-91.0*x-90.0*x+89.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "-97.0*x+96.0*x+95.0*x-94.0*x+93.0*x-92.0*x-91.0*x-90.0*x+89.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-97.0/2.0*x^2.0+96.0/2.0*x^2.0+95.0/2.0*x^2.0-94.0/2.0*x^2.0+93.0/2.0*x^2.0-92.0/2.0*x^2.0-91.0/2.0*x^2.0-90.0/2.0*x^2.0+89.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-48.5*x^2.0+48.0*x^2.0+47.5*x^2.0-47.0*x^2.0+46.5*x^2.0-46.0*x^2.0-45.5*x^2.0-45.0*x^2.0+44.5*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "-48.5*x^2.0+48.0*x^2.0+47.5*x^2.0-47.0*x^2.0+46.5*x^2.0-46.0*x^2.0-45.5*x^2.0-45.0*x^2.0+44.5*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-48.5/3.0*x^3.0+48.0/3.0*x^3.0+47.5/3.0*x^3.0-47.0/3.0*x^3.0+46.5/3.0*x^3.0-46.0/3.0*x^3.0-45.5/3.0*x^3.0-45.0/3.0*x^3.0+44.5/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-16.166666666666668*x^3.0+16.0*x^3.0+15.833333333333334*x^3.0-15.666666666666666*x^3.0+15.5*x^3.0-15.333333333333334*x^3.0-15.166666666666666*x^3.0-15.0*x^3.0+14.833333333333334*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "-16.166666666666668*x^3.0+16.0*x^3.0+15.833333333333334*x^3.0-15.666666666666666*x^3.0+15.5*x^3.0-15.333333333333334*x^3.0-15.166666666666666*x^3.0-15.0*x^3.0+14.833333333333334*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-16.166666666666668/4.0*x^4.0+16.0/4.0*x^4.0+15.833333333333334/4.0*x^4.0-15.666666666666666/4.0*x^4.0+15.5/4.0*x^4.0-15.333333333333334/4.0*x^4.0-15.166666666666666/4.0*x^4.0-15.0/4.0*x^4.0+14.833333333333334/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-4.041666666666667*x^4.0+4.0*x^4.0+3.9583333333333335*x^4.0-3.9166666666666665*x^4.0+3.875*x^4.0-3.8333333333333335*x^4.0-3.7916666666666665*x^4.0-3.75*x^4.0+3.7083333333333335*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130405() {
 UsageCalculus.TestCase = 130405;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-96/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^5-95/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^6+94*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^7-93/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^8+92*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-9-91+90*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^11-89/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-12+88*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^13";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyzx";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "96.0+95.0-94.0+93.0-92.0-91.0-90.0+89.0-88.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+95.0*0.0-94.0*0.0+93.0*0.0-92.0*0.0-91.0*0.0-90.0*0.0+89.0*0.0-88.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "96.0+95.0-94.0+93.0-92.0-91.0-90.0+89.0-88.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "96.0*xyzx+95.0*xyzx-94.0*xyzx+93.0*xyzx-92.0*xyzx-91.0*xyzx-90.0*xyzx+89.0*xyzx-88.0*xyzx";
 UsageCalculus.EqnSolArrayMap4[1] = "96.0*xyzx+95.0*xyzx-94.0*xyzx+93.0*xyzx-92.0*xyzx-91.0*xyzx-90.0*xyzx+89.0*xyzx-88.0*xyzx";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "96.0*xyzx+95.0*xyzx-94.0*xyzx+93.0*xyzx-92.0*xyzx-91.0*xyzx-90.0*xyzx+89.0*xyzx-88.0*xyzx";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "96.0/2.0*xyzx^2.0+95.0/2.0*xyzx^2.0-94.0/2.0*xyzx^2.0+93.0/2.0*xyzx^2.0-92.0/2.0*xyzx^2.0-91.0/2.0*xyzx^2.0-90.0/2.0*xyzx^2.0+89.0/2.0*xyzx^2.0-88.0/2.0*xyzx^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "48.0*xyzx^2.0+47.5*xyzx^2.0-47.0*xyzx^2.0+46.5*xyzx^2.0-46.0*xyzx^2.0-45.5*xyzx^2.0-45.0*xyzx^2.0+44.5*xyzx^2.0-44.0*xyzx^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "48.0*xyzx^2.0+47.5*xyzx^2.0-47.0*xyzx^2.0+46.5*xyzx^2.0-46.0*xyzx^2.0-45.5*xyzx^2.0-45.0*xyzx^2.0+44.5*xyzx^2.0-44.0*xyzx^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "48.0/3.0*xyzx^3.0+47.5/3.0*xyzx^3.0-47.0/3.0*xyzx^3.0+46.5/3.0*xyzx^3.0-46.0/3.0*xyzx^3.0-45.5/3.0*xyzx^3.0-45.0/3.0*xyzx^3.0+44.5/3.0*xyzx^3.0-44.0/3.0*xyzx^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "16.0*xyzx^3.0+15.833333333333334*xyzx^3.0-15.666666666666666*xyzx^3.0+15.5*xyzx^3.0-15.333333333333334*xyzx^3.0-15.166666666666666*xyzx^3.0-15.0*xyzx^3.0+14.833333333333334*xyzx^3.0-14.666666666666666*xyzx^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "16.0*xyzx^3.0+15.833333333333334*xyzx^3.0-15.666666666666666*xyzx^3.0+15.5*xyzx^3.0-15.333333333333334*xyzx^3.0-15.166666666666666*xyzx^3.0-15.0*xyzx^3.0+14.833333333333334*xyzx^3.0-14.666666666666666*xyzx^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "16.0/4.0*xyzx^4.0+15.833333333333334/4.0*xyzx^4.0-15.666666666666666/4.0*xyzx^4.0+15.5/4.0*xyzx^4.0-15.333333333333334/4.0*xyzx^4.0-15.166666666666666/4.0*xyzx^4.0-15.0/4.0*xyzx^4.0+14.833333333333334/4.0*xyzx^4.0-14.666666666666666/4.0*xyzx^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "4.0*xyzx^4.0+3.9583333333333335*xyzx^4.0-3.9166666666666665*xyzx^4.0+3.875*xyzx^4.0-3.8333333333333335*xyzx^4.0-3.7916666666666665*xyzx^4.0-3.75*xyzx^4.0+3.7083333333333335*xyzx^4.0-3.6666666666666665*xyzx^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130406() {
 UsageCalculus.TestCase = 130406;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-95/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^6+94*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^7-93/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^8+92*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-9-91+90*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^11-89/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-12+88*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^13+87/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^14";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "95.0-94.0+93.0-92.0-91.0-90.0+89.0-88.0-87.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0-94.0*0.0+93.0*0.0-92.0*0.0-91.0*0.0-90.0*0.0+89.0*0.0-88.0*0.0-87.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "95.0-94.0+93.0-92.0-91.0-90.0+89.0-88.0-87.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "95.0*x-94.0*x+93.0*x-92.0*x-91.0*x-90.0*x+89.0*x-88.0*x-87.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "95.0*x-94.0*x+93.0*x-92.0*x-91.0*x-90.0*x+89.0*x-88.0*x-87.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "95.0*x-94.0*x+93.0*x-92.0*x-91.0*x-90.0*x+89.0*x-88.0*x-87.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "95.0/2.0*x^2.0-94.0/2.0*x^2.0+93.0/2.0*x^2.0-92.0/2.0*x^2.0-91.0/2.0*x^2.0-90.0/2.0*x^2.0+89.0/2.0*x^2.0-88.0/2.0*x^2.0-87.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "47.5*x^2.0-47.0*x^2.0+46.5*x^2.0-46.0*x^2.0-45.5*x^2.0-45.0*x^2.0+44.5*x^2.0-44.0*x^2.0-43.5*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "47.5*x^2.0-47.0*x^2.0+46.5*x^2.0-46.0*x^2.0-45.5*x^2.0-45.0*x^2.0+44.5*x^2.0-44.0*x^2.0-43.5*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "47.5/3.0*x^3.0-47.0/3.0*x^3.0+46.5/3.0*x^3.0-46.0/3.0*x^3.0-45.5/3.0*x^3.0-45.0/3.0*x^3.0+44.5/3.0*x^3.0-44.0/3.0*x^3.0-43.5/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "15.833333333333334*x^3.0-15.666666666666666*x^3.0+15.5*x^3.0-15.333333333333334*x^3.0-15.166666666666666*x^3.0-15.0*x^3.0+14.833333333333334*x^3.0-14.666666666666666*x^3.0-14.5*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "15.833333333333334*x^3.0-15.666666666666666*x^3.0+15.5*x^3.0-15.333333333333334*x^3.0-15.166666666666666*x^3.0-15.0*x^3.0+14.833333333333334*x^3.0-14.666666666666666*x^3.0-14.5*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "15.833333333333334/4.0*x^4.0-15.666666666666666/4.0*x^4.0+15.5/4.0*x^4.0-15.333333333333334/4.0*x^4.0-15.166666666666666/4.0*x^4.0-15.0/4.0*x^4.0+14.833333333333334/4.0*x^4.0-14.666666666666666/4.0*x^4.0-14.5/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "3.9583333333333335*x^4.0-3.9166666666666665*x^4.0+3.875*x^4.0-3.8333333333333335*x^4.0-3.7916666666666665*x^4.0-3.75*x^4.0+3.7083333333333335*x^4.0-3.6666666666666665*x^4.0-3.625*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130407() {
 UsageCalculus.TestCase = 130407;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+94*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^7-93/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^8+92*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-9-91+90*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^11-89/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-12+88*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^13+87/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^14-86*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-15";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-94.0+93.0-92.0-91.0-90.0+89.0-88.0-87.0+86.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0+93.0*0.0-92.0*0.0-91.0*0.0-90.0*0.0+89.0*0.0-88.0*0.0-87.0*0.0+86.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "-94.0+93.0-92.0-91.0-90.0+89.0-88.0-87.0+86.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-94.0*xy+93.0*xy-92.0*xy-91.0*xy-90.0*xy+89.0*xy-88.0*xy-87.0*xy+86.0*xy";
 UsageCalculus.EqnSolArrayMap4[1] = "-94.0*xy+93.0*xy-92.0*xy-91.0*xy-90.0*xy+89.0*xy-88.0*xy-87.0*xy+86.0*xy";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "-94.0*xy+93.0*xy-92.0*xy-91.0*xy-90.0*xy+89.0*xy-88.0*xy-87.0*xy+86.0*xy";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-94.0/2.0*xy^2.0+93.0/2.0*xy^2.0-92.0/2.0*xy^2.0-91.0/2.0*xy^2.0-90.0/2.0*xy^2.0+89.0/2.0*xy^2.0-88.0/2.0*xy^2.0-87.0/2.0*xy^2.0+86.0/2.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-47.0*xy^2.0+46.5*xy^2.0-46.0*xy^2.0-45.5*xy^2.0-45.0*xy^2.0+44.5*xy^2.0-44.0*xy^2.0-43.5*xy^2.0+43.0*xy^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "-47.0*xy^2.0+46.5*xy^2.0-46.0*xy^2.0-45.5*xy^2.0-45.0*xy^2.0+44.5*xy^2.0-44.0*xy^2.0-43.5*xy^2.0+43.0*xy^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-47.0/3.0*xy^3.0+46.5/3.0*xy^3.0-46.0/3.0*xy^3.0-45.5/3.0*xy^3.0-45.0/3.0*xy^3.0+44.5/3.0*xy^3.0-44.0/3.0*xy^3.0-43.5/3.0*xy^3.0+43.0/3.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-15.666666666666666*xy^3.0+15.5*xy^3.0-15.333333333333334*xy^3.0-15.166666666666666*xy^3.0-15.0*xy^3.0+14.833333333333334*xy^3.0-14.666666666666666*xy^3.0-14.5*xy^3.0+14.333333333333334*xy^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "-15.666666666666666*xy^3.0+15.5*xy^3.0-15.333333333333334*xy^3.0-15.166666666666666*xy^3.0-15.0*xy^3.0+14.833333333333334*xy^3.0-14.666666666666666*xy^3.0-14.5*xy^3.0+14.333333333333334*xy^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-15.666666666666666/4.0*xy^4.0+15.5/4.0*xy^4.0-15.333333333333334/4.0*xy^4.0-15.166666666666666/4.0*xy^4.0-15.0/4.0*xy^4.0+14.833333333333334/4.0*xy^4.0-14.666666666666666/4.0*xy^4.0-14.5/4.0*xy^4.0+14.333333333333334/4.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-3.9166666666666665*xy^4.0+3.875*xy^4.0-3.8333333333333335*xy^4.0-3.7916666666666665*xy^4.0-3.75*xy^4.0+3.7083333333333335*xy^4.0-3.6666666666666665*xy^4.0-3.625*xy^4.0+3.5833333333333335*xy^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130408() {
 UsageCalculus.TestCase = 130408;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-93/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^8+92*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-9-91+90*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^11-89/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-12+88*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^13+87/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^14-86*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-15+85";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "93.0-92.0-91.0-90.0+89.0-88.0-87.0+86.0+85.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0-92.0*0.0-91.0*0.0-90.0*0.0+89.0*0.0-88.0*0.0-87.0*0.0+86.0*0.0+85.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "93.0-92.0-91.0-90.0+89.0-88.0-87.0+86.0+85.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "93.0*x-92.0*x-91.0*x-90.0*x+89.0*x-88.0*x-87.0*x+86.0*x+85.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "93.0*x-92.0*x-91.0*x-90.0*x+89.0*x-88.0*x-87.0*x+86.0*x+85.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "93.0*x-92.0*x-91.0*x-90.0*x+89.0*x-88.0*x-87.0*x+86.0*x+85.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "93.0/2.0*x^2.0-92.0/2.0*x^2.0-91.0/2.0*x^2.0-90.0/2.0*x^2.0+89.0/2.0*x^2.0-88.0/2.0*x^2.0-87.0/2.0*x^2.0+86.0/2.0*x^2.0+85.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "46.5*x^2.0-46.0*x^2.0-45.5*x^2.0-45.0*x^2.0+44.5*x^2.0-44.0*x^2.0-43.5*x^2.0+43.0*x^2.0+42.5*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "46.5*x^2.0-46.0*x^2.0-45.5*x^2.0-45.0*x^2.0+44.5*x^2.0-44.0*x^2.0-43.5*x^2.0+43.0*x^2.0+42.5*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "46.5/3.0*x^3.0-46.0/3.0*x^3.0-45.5/3.0*x^3.0-45.0/3.0*x^3.0+44.5/3.0*x^3.0-44.0/3.0*x^3.0-43.5/3.0*x^3.0+43.0/3.0*x^3.0+42.5/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "15.5*x^3.0-15.333333333333334*x^3.0-15.166666666666666*x^3.0-15.0*x^3.0+14.833333333333334*x^3.0-14.666666666666666*x^3.0-14.5*x^3.0+14.333333333333334*x^3.0+14.166666666666666*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "15.5*x^3.0-15.333333333333334*x^3.0-15.166666666666666*x^3.0-15.0*x^3.0+14.833333333333334*x^3.0-14.666666666666666*x^3.0-14.5*x^3.0+14.333333333333334*x^3.0+14.166666666666666*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "15.5/4.0*x^4.0-15.333333333333334/4.0*x^4.0-15.166666666666666/4.0*x^4.0-15.0/4.0*x^4.0+14.833333333333334/4.0*x^4.0-14.666666666666666/4.0*x^4.0-14.5/4.0*x^4.0+14.333333333333334/4.0*x^4.0+14.166666666666666/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "3.875*x^4.0-3.8333333333333335*x^4.0-3.7916666666666665*x^4.0-3.75*x^4.0+3.7083333333333335*x^4.0-3.6666666666666665*x^4.0-3.625*x^4.0+3.5833333333333335*x^4.0+3.5416666666666665*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130409() {
 UsageCalculus.TestCase = 130409;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+92*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-9-91+90*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^11-89/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-12+88*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^13+87/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^14-86*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-15+85+84/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^17";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyzx";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-92.0-91.0-90.0+89.0-88.0-87.0+86.0+85.0-84.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0-91.0*0.0-90.0*0.0+89.0*0.0-88.0*0.0-87.0*0.0+86.0*0.0+85.0*0.0-84.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "-92.0-91.0-90.0+89.0-88.0-87.0+86.0+85.0-84.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-92.0*xyzx-91.0*xyzx-90.0*xyzx+89.0*xyzx-88.0*xyzx-87.0*xyzx+86.0*xyzx+85.0*xyzx-84.0*xyzx";
 UsageCalculus.EqnSolArrayMap4[1] = "-92.0*xyzx-91.0*xyzx-90.0*xyzx+89.0*xyzx-88.0*xyzx-87.0*xyzx+86.0*xyzx+85.0*xyzx-84.0*xyzx";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "-92.0*xyzx-91.0*xyzx-90.0*xyzx+89.0*xyzx-88.0*xyzx-87.0*xyzx+86.0*xyzx+85.0*xyzx-84.0*xyzx";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-92.0/2.0*xyzx^2.0-91.0/2.0*xyzx^2.0-90.0/2.0*xyzx^2.0+89.0/2.0*xyzx^2.0-88.0/2.0*xyzx^2.0-87.0/2.0*xyzx^2.0+86.0/2.0*xyzx^2.0+85.0/2.0*xyzx^2.0-84.0/2.0*xyzx^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-46.0*xyzx^2.0-45.5*xyzx^2.0-45.0*xyzx^2.0+44.5*xyzx^2.0-44.0*xyzx^2.0-43.5*xyzx^2.0+43.0*xyzx^2.0+42.5*xyzx^2.0-42.0*xyzx^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "-46.0*xyzx^2.0-45.5*xyzx^2.0-45.0*xyzx^2.0+44.5*xyzx^2.0-44.0*xyzx^2.0-43.5*xyzx^2.0+43.0*xyzx^2.0+42.5*xyzx^2.0-42.0*xyzx^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-46.0/3.0*xyzx^3.0-45.5/3.0*xyzx^3.0-45.0/3.0*xyzx^3.0+44.5/3.0*xyzx^3.0-44.0/3.0*xyzx^3.0-43.5/3.0*xyzx^3.0+43.0/3.0*xyzx^3.0+42.5/3.0*xyzx^3.0-42.0/3.0*xyzx^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-15.333333333333334*xyzx^3.0-15.166666666666666*xyzx^3.0-15.0*xyzx^3.0+14.833333333333334*xyzx^3.0-14.666666666666666*xyzx^3.0-14.5*xyzx^3.0+14.333333333333334*xyzx^3.0+14.166666666666666*xyzx^3.0-14.0*xyzx^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "-15.333333333333334*xyzx^3.0-15.166666666666666*xyzx^3.0-15.0*xyzx^3.0+14.833333333333334*xyzx^3.0-14.666666666666666*xyzx^3.0-14.5*xyzx^3.0+14.333333333333334*xyzx^3.0+14.166666666666666*xyzx^3.0-14.0*xyzx^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-15.333333333333334/4.0*xyzx^4.0-15.166666666666666/4.0*xyzx^4.0-15.0/4.0*xyzx^4.0+14.833333333333334/4.0*xyzx^4.0-14.666666666666666/4.0*xyzx^4.0-14.5/4.0*xyzx^4.0+14.333333333333334/4.0*xyzx^4.0+14.166666666666666/4.0*xyzx^4.0-14.0/4.0*xyzx^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-3.8333333333333335*xyzx^4.0-3.7916666666666665*xyzx^4.0-3.75*xyzx^4.0+3.7083333333333335*xyzx^4.0-3.6666666666666665*xyzx^4.0-3.625*xyzx^4.0+3.5833333333333335*xyzx^4.0+3.5416666666666665*xyzx^4.0-3.5*xyzx^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130410() {
 UsageCalculus.TestCase = 130410;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-91+90*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^11-89/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-12+88*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^13+87/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^14-86*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-15+85+84/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^17-83*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-18";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-91.0-90.0+89.0-88.0-87.0+86.0+85.0-84.0+83.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0-90.0*0.0+89.0*0.0-88.0*0.0-87.0*0.0+86.0*0.0+85.0*0.0-84.0*0.0+83.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "-91.0-90.0+89.0-88.0-87.0+86.0+85.0-84.0+83.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-91.0*x-90.0*x+89.0*x-88.0*x-87.0*x+86.0*x+85.0*x-84.0*x+83.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "-91.0*x-90.0*x+89.0*x-88.0*x-87.0*x+86.0*x+85.0*x-84.0*x+83.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "-91.0*x-90.0*x+89.0*x-88.0*x-87.0*x+86.0*x+85.0*x-84.0*x+83.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-91.0/2.0*x^2.0-90.0/2.0*x^2.0+89.0/2.0*x^2.0-88.0/2.0*x^2.0-87.0/2.0*x^2.0+86.0/2.0*x^2.0+85.0/2.0*x^2.0-84.0/2.0*x^2.0+83.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-45.5*x^2.0-45.0*x^2.0+44.5*x^2.0-44.0*x^2.0-43.5*x^2.0+43.0*x^2.0+42.5*x^2.0-42.0*x^2.0+41.5*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "-45.5*x^2.0-45.0*x^2.0+44.5*x^2.0-44.0*x^2.0-43.5*x^2.0+43.0*x^2.0+42.5*x^2.0-42.0*x^2.0+41.5*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-45.5/3.0*x^3.0-45.0/3.0*x^3.0+44.5/3.0*x^3.0-44.0/3.0*x^3.0-43.5/3.0*x^3.0+43.0/3.0*x^3.0+42.5/3.0*x^3.0-42.0/3.0*x^3.0+41.5/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-15.166666666666666*x^3.0-15.0*x^3.0+14.833333333333334*x^3.0-14.666666666666666*x^3.0-14.5*x^3.0+14.333333333333334*x^3.0+14.166666666666666*x^3.0-14.0*x^3.0+13.833333333333334*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "-15.166666666666666*x^3.0-15.0*x^3.0+14.833333333333334*x^3.0-14.666666666666666*x^3.0-14.5*x^3.0+14.333333333333334*x^3.0+14.166666666666666*x^3.0-14.0*x^3.0+13.833333333333334*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-15.166666666666666/4.0*x^4.0-15.0/4.0*x^4.0+14.833333333333334/4.0*x^4.0-14.666666666666666/4.0*x^4.0-14.5/4.0*x^4.0+14.333333333333334/4.0*x^4.0+14.166666666666666/4.0*x^4.0-14.0/4.0*x^4.0+13.833333333333334/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-3.7916666666666665*x^4.0-3.75*x^4.0+3.7083333333333335*x^4.0-3.6666666666666665*x^4.0-3.625*x^4.0+3.5833333333333335*x^4.0+3.5416666666666665*x^4.0-3.5*x^4.0+3.4583333333333335*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130411() {
 UsageCalculus.TestCase = 130411;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+90*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^11-89/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-12+88*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^13+87/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^14-86*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-15+85+84/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^17-83*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-18+82*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^19";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-90.0+89.0-88.0-87.0+86.0+85.0-84.0+83.0-82.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0+89.0*0.0-88.0*0.0-87.0*0.0+86.0*0.0+85.0*0.0-84.0*0.0+83.0*0.0-82.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "-90.0+89.0-88.0-87.0+86.0+85.0-84.0+83.0-82.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-90.0*xy+89.0*xy-88.0*xy-87.0*xy+86.0*xy+85.0*xy-84.0*xy+83.0*xy-82.0*xy";
 UsageCalculus.EqnSolArrayMap4[1] = "-90.0*xy+89.0*xy-88.0*xy-87.0*xy+86.0*xy+85.0*xy-84.0*xy+83.0*xy-82.0*xy";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "-90.0*xy+89.0*xy-88.0*xy-87.0*xy+86.0*xy+85.0*xy-84.0*xy+83.0*xy-82.0*xy";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-90.0/2.0*xy^2.0+89.0/2.0*xy^2.0-88.0/2.0*xy^2.0-87.0/2.0*xy^2.0+86.0/2.0*xy^2.0+85.0/2.0*xy^2.0-84.0/2.0*xy^2.0+83.0/2.0*xy^2.0-82.0/2.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-45.0*xy^2.0+44.5*xy^2.0-44.0*xy^2.0-43.5*xy^2.0+43.0*xy^2.0+42.5*xy^2.0-42.0*xy^2.0+41.5*xy^2.0-41.0*xy^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "-45.0*xy^2.0+44.5*xy^2.0-44.0*xy^2.0-43.5*xy^2.0+43.0*xy^2.0+42.5*xy^2.0-42.0*xy^2.0+41.5*xy^2.0-41.0*xy^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-45.0/3.0*xy^3.0+44.5/3.0*xy^3.0-44.0/3.0*xy^3.0-43.5/3.0*xy^3.0+43.0/3.0*xy^3.0+42.5/3.0*xy^3.0-42.0/3.0*xy^3.0+41.5/3.0*xy^3.0-41.0/3.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-15.0*xy^3.0+14.833333333333334*xy^3.0-14.666666666666666*xy^3.0-14.5*xy^3.0+14.333333333333334*xy^3.0+14.166666666666666*xy^3.0-14.0*xy^3.0+13.833333333333334*xy^3.0-13.666666666666666*xy^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "-15.0*xy^3.0+14.833333333333334*xy^3.0-14.666666666666666*xy^3.0-14.5*xy^3.0+14.333333333333334*xy^3.0+14.166666666666666*xy^3.0-14.0*xy^3.0+13.833333333333334*xy^3.0-13.666666666666666*xy^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-15.0/4.0*xy^4.0+14.833333333333334/4.0*xy^4.0-14.666666666666666/4.0*xy^4.0-14.5/4.0*xy^4.0+14.333333333333334/4.0*xy^4.0+14.166666666666666/4.0*xy^4.0-14.0/4.0*xy^4.0+13.833333333333334/4.0*xy^4.0-13.666666666666666/4.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-3.75*xy^4.0+3.7083333333333335*xy^4.0-3.6666666666666665*xy^4.0-3.625*xy^4.0+3.5833333333333335*xy^4.0+3.5416666666666665*xy^4.0-3.5*xy^4.0+3.4583333333333335*xy^4.0-3.4166666666666665*xy^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130412() {
 UsageCalculus.TestCase = 130412;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-89/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-12+88*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^13+87/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^14-86*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-15+85+84/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^17-83*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-18+82*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^19+81/-x^20";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "89.0-88.0-87.0+86.0+85.0-84.0+83.0-82.0-81.0/x^20.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0-88.0*0.0-87.0*0.0+86.0*0.0+85.0*0.0-84.0*0.0+83.0*0.0-82.0*0.0-81.0*-20.0/x^21.0";
 UsageCalculus.EqnSolArrayMap2[1] = "1620.0/x^21.0";
 UsageCalculus.EqnSolArrayMap3[1] = "89.0-88.0-87.0+86.0+85.0-84.0+83.0-82.0-81.0/x^20.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "89.0*x-88.0*x-87.0*x+86.0*x+85.0*x-84.0*x+83.0*x-82.0*x-81.0/-19.0/x^19.0";
 UsageCalculus.EqnSolArrayMap4[1] = "89.0*x-88.0*x-87.0*x+86.0*x+85.0*x-84.0*x+83.0*x-82.0*x+4.2631578947368425/x^19.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "1620.0/x^21.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "1620.0*-21.0/x^22.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-34020.0/x^22.0";
 UsageCalculus.EqnSolArrayMap3[2] = "89.0*x-88.0*x-87.0*x+86.0*x+85.0*x-84.0*x+83.0*x-82.0*x+4.2631578947368425/x^19.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "89.0/2.0*x^2.0-88.0/2.0*x^2.0-87.0/2.0*x^2.0+86.0/2.0*x^2.0+85.0/2.0*x^2.0-84.0/2.0*x^2.0+83.0/2.0*x^2.0-82.0/2.0*x^2.0+4.2631578947368425/-18.0/x^18.0";
 UsageCalculus.EqnSolArrayMap4[2] = "44.5*x^2.0-44.0*x^2.0-43.5*x^2.0+43.0*x^2.0+42.5*x^2.0-42.0*x^2.0+41.5*x^2.0-41.0*x^2.0-1.0/4.222222222222221/x^18.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-34020.0/x^22.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-34020.0*-22.0/x^23.0";
 UsageCalculus.EqnSolArrayMap2[3] = "748440.0/x^23.0";
 UsageCalculus.EqnSolArrayMap3[3] = "44.5*x^2.0-44.0*x^2.0-43.5*x^2.0+43.0*x^2.0+42.5*x^2.0-42.0*x^2.0+41.5*x^2.0-41.0*x^2.0-1.0/4.222222222222221/x^18.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "44.5/3.0*x^3.0-44.0/3.0*x^3.0-43.5/3.0*x^3.0+43.0/3.0*x^3.0+42.5/3.0*x^3.0-42.0/3.0*x^3.0+41.5/3.0*x^3.0-41.0/3.0*x^3.0-1.0/4.222222222222221/-17.0/x^17.0";
 UsageCalculus.EqnSolArrayMap4[3] = "14.833333333333334*x^3.0-14.666666666666666*x^3.0-14.5*x^3.0+14.333333333333334*x^3.0+14.166666666666666*x^3.0-14.0*x^3.0+13.833333333333334*x^3.0-13.666666666666666*x^3.0+1.0/71.77777777777777/x^17.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "748440.0/x^23.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "748440.0*-23.0/x^24.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1.721412E7/x^24.0";
 UsageCalculus.EqnSolArrayMap3[4] = "14.833333333333334*x^3.0-14.666666666666666*x^3.0-14.5*x^3.0+14.333333333333334*x^3.0+14.166666666666666*x^3.0-14.0*x^3.0+13.833333333333334*x^3.0-13.666666666666666*x^3.0+1.0/71.77777777777777/x^17.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "14.833333333333334/4.0*x^4.0-14.666666666666666/4.0*x^4.0-14.5/4.0*x^4.0+14.333333333333334/4.0*x^4.0+14.166666666666666/4.0*x^4.0-14.0/4.0*x^4.0+13.833333333333334/4.0*x^4.0-13.666666666666666/4.0*x^4.0+1.0/71.77777777777777/-16.0/x^16.0";
 UsageCalculus.EqnSolArrayMap4[4] = "3.7083333333333335*x^4.0-3.6666666666666665*x^4.0-3.625*x^4.0+3.5833333333333335*x^4.0+3.5416666666666665*x^4.0-3.5*x^4.0+3.4583333333333335*x^4.0-3.4166666666666665*x^4.0-1.0/1148.4444444444443/x^16.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130413() {
 UsageCalculus.TestCase = 130413;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+88*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^13+87/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^14-86*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-15+85+84/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^17-83*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-18+82*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^19+81/-xyzx^20-80*-xyzx^21";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyzx";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-88.0-87.0+86.0+85.0-84.0+83.0-82.0-81.0/xyzx^20.0+80.0*xyzx^21.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0-87.0*0.0+86.0*0.0+85.0*0.0-84.0*0.0+83.0*0.0-82.0*0.0-81.0*-20.0/xyzx^21.0+80.0*21.0*xyzx^20.0";
 UsageCalculus.EqnSolArrayMap2[1] = "1620.0/xyzx^21.0+1680.0*xyzx^20.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-88.0-87.0+86.0+85.0-84.0+83.0-82.0-81.0/xyzx^20.0+80.0*xyzx^21.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-88.0*xyzx-87.0*xyzx+86.0*xyzx+85.0*xyzx-84.0*xyzx+83.0*xyzx-82.0*xyzx-81.0/-19.0/xyzx^19.0+80.0/22.0*xyzx^22.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-88.0*xyzx-87.0*xyzx+86.0*xyzx+85.0*xyzx-84.0*xyzx+83.0*xyzx-82.0*xyzx+4.2631578947368425/xyzx^19.0+3.6363636363636362*xyzx^22.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "1620.0/xyzx^21.0+1680.0*xyzx^20.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "1620.0*-21.0/xyzx^22.0+1680.0*20.0*xyzx^19.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-34020.0/xyzx^22.0+33600.0*xyzx^19.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-88.0*xyzx-87.0*xyzx+86.0*xyzx+85.0*xyzx-84.0*xyzx+83.0*xyzx-82.0*xyzx+4.2631578947368425/xyzx^19.0+3.6363636363636362*xyzx^22.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-88.0/2.0*xyzx^2.0-87.0/2.0*xyzx^2.0+86.0/2.0*xyzx^2.0+85.0/2.0*xyzx^2.0-84.0/2.0*xyzx^2.0+83.0/2.0*xyzx^2.0-82.0/2.0*xyzx^2.0+4.2631578947368425/-18.0/xyzx^18.0+3.6363636363636362/23.0*xyzx^23.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-44.0*xyzx^2.0-43.5*xyzx^2.0+43.0*xyzx^2.0+42.5*xyzx^2.0-42.0*xyzx^2.0+41.5*xyzx^2.0-41.0*xyzx^2.0-1.0/4.222222222222221/xyzx^18.0+1.0/6.325*xyzx^23.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-34020.0/xyzx^22.0+33600.0*xyzx^19.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-34020.0*-22.0/xyzx^23.0+33600.0*19.0*xyzx^18.0";
 UsageCalculus.EqnSolArrayMap2[3] = "748440.0/xyzx^23.0+638400.0*xyzx^18.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-44.0*xyzx^2.0-43.5*xyzx^2.0+43.0*xyzx^2.0+42.5*xyzx^2.0-42.0*xyzx^2.0+41.5*xyzx^2.0-41.0*xyzx^2.0-1.0/4.222222222222221/xyzx^18.0+1.0/6.325*xyzx^23.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-44.0/3.0*xyzx^3.0-43.5/3.0*xyzx^3.0+43.0/3.0*xyzx^3.0+42.5/3.0*xyzx^3.0-42.0/3.0*xyzx^3.0+41.5/3.0*xyzx^3.0-41.0/3.0*xyzx^3.0-1.0/4.222222222222221/-17.0/xyzx^17.0+1.0/6.325/24.0*xyzx^24.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-14.666666666666666*xyzx^3.0-14.5*xyzx^3.0+14.333333333333334*xyzx^3.0+14.166666666666666*xyzx^3.0-14.0*xyzx^3.0+13.833333333333334*xyzx^3.0-13.666666666666666*xyzx^3.0+1.0/71.77777777777777/xyzx^17.0+1.0/151.8*xyzx^24.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "748440.0/xyzx^23.0+638400.0*xyzx^18.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "748440.0*-23.0/xyzx^24.0+638400.0*18.0*xyzx^17.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1.721412E7/xyzx^24.0+1.14912E7*xyzx^17.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-14.666666666666666*xyzx^3.0-14.5*xyzx^3.0+14.333333333333334*xyzx^3.0+14.166666666666666*xyzx^3.0-14.0*xyzx^3.0+13.833333333333334*xyzx^3.0-13.666666666666666*xyzx^3.0+1.0/71.77777777777777/xyzx^17.0+1.0/151.8*xyzx^24.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-14.666666666666666/4.0*xyzx^4.0-14.5/4.0*xyzx^4.0+14.333333333333334/4.0*xyzx^4.0+14.166666666666666/4.0*xyzx^4.0-14.0/4.0*xyzx^4.0+13.833333333333334/4.0*xyzx^4.0-13.666666666666666/4.0*xyzx^4.0+1.0/71.77777777777777/-16.0/xyzx^16.0+1.0/151.8/25.0*xyzx^25.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-3.6666666666666665*xyzx^4.0-3.625*xyzx^4.0+3.5833333333333335*xyzx^4.0+3.5416666666666665*xyzx^4.0-3.5*xyzx^4.0+3.4583333333333335*xyzx^4.0-3.4166666666666665*xyzx^4.0-1.0/1148.4444444444443/xyzx^16.0+1.0/3795.0000000000005*xyzx^25.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130414() {
 UsageCalculus.TestCase = 130414;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+87/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^14-86*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-15+85+84/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^17-83*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-18+82*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^19+81/-x^20-80*-x^21+79*-x^22";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-87.0+86.0+85.0-84.0+83.0-82.0-81.0/x^20.0+80.0*x^21.0-79.0*x^22.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0+86.0*0.0+85.0*0.0-84.0*0.0+83.0*0.0-82.0*0.0-81.0*-20.0/x^21.0+80.0*21.0*x^20.0-79.0*22.0*x^21.0";
 UsageCalculus.EqnSolArrayMap2[1] = "1620.0/x^21.0+1680.0*x^20.0-1738.0*x^21.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-87.0+86.0+85.0-84.0+83.0-82.0-81.0/x^20.0+80.0*x^21.0-79.0*x^22.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-87.0*x+86.0*x+85.0*x-84.0*x+83.0*x-82.0*x-81.0/-19.0/x^19.0+80.0/22.0*x^22.0-79.0/23.0*x^23.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-87.0*x+86.0*x+85.0*x-84.0*x+83.0*x-82.0*x+4.2631578947368425/x^19.0+3.6363636363636362*x^22.0-3.4347826086956523*x^23.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "1620.0/x^21.0+1680.0*x^20.0-1738.0*x^21.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "1620.0*-21.0/x^22.0+1680.0*20.0*x^19.0-1738.0*21.0*x^20.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-34020.0/x^22.0+33600.0*x^19.0-36498.0*x^20.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-87.0*x+86.0*x+85.0*x-84.0*x+83.0*x-82.0*x+4.2631578947368425/x^19.0+3.6363636363636362*x^22.0-3.4347826086956523*x^23.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-87.0/2.0*x^2.0+86.0/2.0*x^2.0+85.0/2.0*x^2.0-84.0/2.0*x^2.0+83.0/2.0*x^2.0-82.0/2.0*x^2.0+4.2631578947368425/-18.0/x^18.0+3.6363636363636362/23.0*x^23.0-3.4347826086956523/24.0*x^24.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-43.5*x^2.0+43.0*x^2.0+42.5*x^2.0-42.0*x^2.0+41.5*x^2.0-41.0*x^2.0-1.0/4.222222222222221/x^18.0+1.0/6.325*x^23.0-1.0/6.987341772151899*x^24.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-34020.0/x^22.0+33600.0*x^19.0-36498.0*x^20.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-34020.0*-22.0/x^23.0+33600.0*19.0*x^18.0-36498.0*20.0*x^19.0";
 UsageCalculus.EqnSolArrayMap2[3] = "748440.0/x^23.0+638400.0*x^18.0-729960.0*x^19.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-43.5*x^2.0+43.0*x^2.0+42.5*x^2.0-42.0*x^2.0+41.5*x^2.0-41.0*x^2.0-1.0/4.222222222222221/x^18.0+1.0/6.325*x^23.0-1.0/6.987341772151899*x^24.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-43.5/3.0*x^3.0+43.0/3.0*x^3.0+42.5/3.0*x^3.0-42.0/3.0*x^3.0+41.5/3.0*x^3.0-41.0/3.0*x^3.0-1.0/4.222222222222221/-17.0/x^17.0+1.0/6.325/24.0*x^24.0-1.0/6.987341772151899/25.0*x^25.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-14.5*x^3.0+14.333333333333334*x^3.0+14.166666666666666*x^3.0-14.0*x^3.0+13.833333333333334*x^3.0-13.666666666666666*x^3.0+1.0/71.77777777777777/x^17.0+1.0/151.8*x^24.0-1.0/174.68354430379748*x^25.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "748440.0/x^23.0+638400.0*x^18.0-729960.0*x^19.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "748440.0*-23.0/x^24.0+638400.0*18.0*x^17.0-729960.0*19.0*x^18.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1.721412E7/x^24.0+1.14912E7*x^17.0-1.386924E7*x^18.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-14.5*x^3.0+14.333333333333334*x^3.0+14.166666666666666*x^3.0-14.0*x^3.0+13.833333333333334*x^3.0-13.666666666666666*x^3.0+1.0/71.77777777777777/x^17.0+1.0/151.8*x^24.0-1.0/174.68354430379748*x^25.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-14.5/4.0*x^4.0+14.333333333333334/4.0*x^4.0+14.166666666666666/4.0*x^4.0-14.0/4.0*x^4.0+13.833333333333334/4.0*x^4.0-13.666666666666666/4.0*x^4.0+1.0/71.77777777777777/-16.0/x^16.0+1.0/151.8/25.0*x^25.0-1.0/174.68354430379748/26.0*x^26.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-3.625*x^4.0+3.5833333333333335*x^4.0+3.5416666666666665*x^4.0-3.5*x^4.0+3.4583333333333335*x^4.0-3.4166666666666665*x^4.0-1.0/1148.4444444444443/x^16.0+1.0/3795.0000000000005*x^25.0-1.0/4541.772151898735*x^26.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130415() {
 UsageCalculus.TestCase = 130415;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-86*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-15+85+84/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^17-83*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-18+82*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^19+81/-xy^20-80*-xy^21+79*-xy^22+78/-xy^23";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "86.0+85.0-84.0+83.0-82.0-81.0/xy^20.0+80.0*xy^21.0-79.0*xy^22.0-78.0/xy^23.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+85.0*0.0-84.0*0.0+83.0*0.0-82.0*0.0-81.0*-20.0/xy^21.0+80.0*21.0*xy^20.0-79.0*22.0*xy^21.0-78.0*-23.0/xy^24.0";
 UsageCalculus.EqnSolArrayMap2[1] = "1620.0/xy^21.0+1680.0*xy^20.0-1738.0*xy^21.0+1794.0/xy^24.0";
 UsageCalculus.EqnSolArrayMap3[1] = "86.0+85.0-84.0+83.0-82.0-81.0/xy^20.0+80.0*xy^21.0-79.0*xy^22.0-78.0/xy^23.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "86.0*xy+85.0*xy-84.0*xy+83.0*xy-82.0*xy-81.0/-19.0/xy^19.0+80.0/22.0*xy^22.0-79.0/23.0*xy^23.0-78.0/-22.0/xy^22.0";
 UsageCalculus.EqnSolArrayMap4[1] = "86.0*xy+85.0*xy-84.0*xy+83.0*xy-82.0*xy+4.2631578947368425/xy^19.0+3.6363636363636362*xy^22.0-3.4347826086956523*xy^23.0+3.5454545454545454/xy^22.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "1620.0/xy^21.0+1680.0*xy^20.0-1738.0*xy^21.0+1794.0/xy^24.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "1620.0*-21.0/xy^22.0+1680.0*20.0*xy^19.0-1738.0*21.0*xy^20.0+1794.0*-24.0/xy^25.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-34020.0/xy^22.0+33600.0*xy^19.0-36498.0*xy^20.0-43056.0/xy^25.0";
 UsageCalculus.EqnSolArrayMap3[2] = "86.0*xy+85.0*xy-84.0*xy+83.0*xy-82.0*xy+4.2631578947368425/xy^19.0+3.6363636363636362*xy^22.0-3.4347826086956523*xy^23.0+3.5454545454545454/xy^22.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "86.0/2.0*xy^2.0+85.0/2.0*xy^2.0-84.0/2.0*xy^2.0+83.0/2.0*xy^2.0-82.0/2.0*xy^2.0+4.2631578947368425/-18.0/xy^18.0+3.6363636363636362/23.0*xy^23.0-3.4347826086956523/24.0*xy^24.0+3.5454545454545454/-21.0/xy^21.0";
 UsageCalculus.EqnSolArrayMap4[2] = "43.0*xy^2.0+42.5*xy^2.0-42.0*xy^2.0+41.5*xy^2.0-41.0*xy^2.0-1.0/4.222222222222221/xy^18.0+1.0/6.325*xy^23.0-1.0/6.987341772151899*xy^24.0-1.0/5.923076923076923/xy^21.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-34020.0/xy^22.0+33600.0*xy^19.0-36498.0*xy^20.0-43056.0/xy^25.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-34020.0*-22.0/xy^23.0+33600.0*19.0*xy^18.0-36498.0*20.0*xy^19.0-43056.0*-25.0/xy^26.0";
 UsageCalculus.EqnSolArrayMap2[3] = "748440.0/xy^23.0+638400.0*xy^18.0-729960.0*xy^19.0+1076400.0/xy^26.0";
 UsageCalculus.EqnSolArrayMap3[3] = "43.0*xy^2.0+42.5*xy^2.0-42.0*xy^2.0+41.5*xy^2.0-41.0*xy^2.0-1.0/4.222222222222221/xy^18.0+1.0/6.325*xy^23.0-1.0/6.987341772151899*xy^24.0-1.0/5.923076923076923/xy^21.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "43.0/3.0*xy^3.0+42.5/3.0*xy^3.0-42.0/3.0*xy^3.0+41.5/3.0*xy^3.0-41.0/3.0*xy^3.0-1.0/4.222222222222221/-17.0/xy^17.0+1.0/6.325/24.0*xy^24.0-1.0/6.987341772151899/25.0*xy^25.0-1.0/5.923076923076923/-20.0/xy^20.0";
 UsageCalculus.EqnSolArrayMap4[3] = "14.333333333333334*xy^3.0+14.166666666666666*xy^3.0-14.0*xy^3.0+13.833333333333334*xy^3.0-13.666666666666666*xy^3.0+1.0/71.77777777777777/xy^17.0+1.0/151.8*xy^24.0-1.0/174.68354430379748*xy^25.0+1.0/118.46153846153847/xy^20.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "748440.0/xy^23.0+638400.0*xy^18.0-729960.0*xy^19.0+1076400.0/xy^26.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "748440.0*-23.0/xy^24.0+638400.0*18.0*xy^17.0-729960.0*19.0*xy^18.0+1076400.0*-26.0/xy^27.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1.721412E7/xy^24.0+1.14912E7*xy^17.0-1.386924E7*xy^18.0-2.79864E7/xy^27.0";
 UsageCalculus.EqnSolArrayMap3[4] = "14.333333333333334*xy^3.0+14.166666666666666*xy^3.0-14.0*xy^3.0+13.833333333333334*xy^3.0-13.666666666666666*xy^3.0+1.0/71.77777777777777/xy^17.0+1.0/151.8*xy^24.0-1.0/174.68354430379748*xy^25.0+1.0/118.46153846153847/xy^20.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "14.333333333333334/4.0*xy^4.0+14.166666666666666/4.0*xy^4.0-14.0/4.0*xy^4.0+13.833333333333334/4.0*xy^4.0-13.666666666666666/4.0*xy^4.0+1.0/71.77777777777777/-16.0/xy^16.0+1.0/151.8/25.0*xy^25.0-1.0/174.68354430379748/26.0*xy^26.0+1.0/118.46153846153847/-19.0/xy^19.0";
 UsageCalculus.EqnSolArrayMap4[4] = "3.5833333333333335*xy^4.0+3.5416666666666665*xy^4.0-3.5*xy^4.0+3.4583333333333335*xy^4.0-3.4166666666666665*xy^4.0-1.0/1148.4444444444443/xy^16.0+1.0/3795.0000000000005*xy^25.0-1.0/4541.772151898735*xy^26.0-1.0/2250.769230769231/xy^19.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130416() {
 UsageCalculus.TestCase = 130416;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+85+84/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^17-83*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-18+82*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^19+81/-x^20-80*-x^21+79*-x^22+78/-x^23-77*-x^24";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "85.0-84.0+83.0-82.0-81.0/x^20.0+80.0*x^21.0-79.0*x^22.0-78.0/x^23.0+77.0*x^24.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0-84.0*0.0+83.0*0.0-82.0*0.0-81.0*-20.0/x^21.0+80.0*21.0*x^20.0-79.0*22.0*x^21.0-78.0*-23.0/x^24.0+77.0*24.0*x^23.0";
 UsageCalculus.EqnSolArrayMap2[1] = "1620.0/x^21.0+1680.0*x^20.0-1738.0*x^21.0+1794.0/x^24.0+1848.0*x^23.0";
 UsageCalculus.EqnSolArrayMap3[1] = "85.0-84.0+83.0-82.0-81.0/x^20.0+80.0*x^21.0-79.0*x^22.0-78.0/x^23.0+77.0*x^24.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "85.0*x-84.0*x+83.0*x-82.0*x-81.0/-19.0/x^19.0+80.0/22.0*x^22.0-79.0/23.0*x^23.0-78.0/-22.0/x^22.0+77.0/25.0*x^25.0";
 UsageCalculus.EqnSolArrayMap4[1] = "85.0*x-84.0*x+83.0*x-82.0*x+4.2631578947368425/x^19.0+3.6363636363636362*x^22.0-3.4347826086956523*x^23.0+3.5454545454545454/x^22.0+3.08*x^25.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "1620.0/x^21.0+1680.0*x^20.0-1738.0*x^21.0+1794.0/x^24.0+1848.0*x^23.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "1620.0*-21.0/x^22.0+1680.0*20.0*x^19.0-1738.0*21.0*x^20.0+1794.0*-24.0/x^25.0+1848.0*23.0*x^22.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-34020.0/x^22.0+33600.0*x^19.0-36498.0*x^20.0-43056.0/x^25.0+42504.0*x^22.0";
 UsageCalculus.EqnSolArrayMap3[2] = "85.0*x-84.0*x+83.0*x-82.0*x+4.2631578947368425/x^19.0+3.6363636363636362*x^22.0-3.4347826086956523*x^23.0+3.5454545454545454/x^22.0+3.08*x^25.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "85.0/2.0*x^2.0-84.0/2.0*x^2.0+83.0/2.0*x^2.0-82.0/2.0*x^2.0+4.2631578947368425/-18.0/x^18.0+3.6363636363636362/23.0*x^23.0-3.4347826086956523/24.0*x^24.0+3.5454545454545454/-21.0/x^21.0+3.08/26.0*x^26.0";
 UsageCalculus.EqnSolArrayMap4[2] = "42.5*x^2.0-42.0*x^2.0+41.5*x^2.0-41.0*x^2.0-1.0/4.222222222222221/x^18.0+1.0/6.325*x^23.0-1.0/6.987341772151899*x^24.0-1.0/5.923076923076923/x^21.0+1.0/8.441558441558442*x^26.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-34020.0/x^22.0+33600.0*x^19.0-36498.0*x^20.0-43056.0/x^25.0+42504.0*x^22.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-34020.0*-22.0/x^23.0+33600.0*19.0*x^18.0-36498.0*20.0*x^19.0-43056.0*-25.0/x^26.0+42504.0*22.0*x^21.0";
 UsageCalculus.EqnSolArrayMap2[3] = "748440.0/x^23.0+638400.0*x^18.0-729960.0*x^19.0+1076400.0/x^26.0+935088.0*x^21.0";
 UsageCalculus.EqnSolArrayMap3[3] = "42.5*x^2.0-42.0*x^2.0+41.5*x^2.0-41.0*x^2.0-1.0/4.222222222222221/x^18.0+1.0/6.325*x^23.0-1.0/6.987341772151899*x^24.0-1.0/5.923076923076923/x^21.0+1.0/8.441558441558442*x^26.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "42.5/3.0*x^3.0-42.0/3.0*x^3.0+41.5/3.0*x^3.0-41.0/3.0*x^3.0-1.0/4.222222222222221/-17.0/x^17.0+1.0/6.325/24.0*x^24.0-1.0/6.987341772151899/25.0*x^25.0-1.0/5.923076923076923/-20.0/x^20.0+1.0/8.441558441558442/27.0*x^27.0";
 UsageCalculus.EqnSolArrayMap4[3] = "14.166666666666666*x^3.0-14.0*x^3.0+13.833333333333334*x^3.0-13.666666666666666*x^3.0+1.0/71.77777777777777/x^17.0+1.0/151.8*x^24.0-1.0/174.68354430379748*x^25.0+1.0/118.46153846153847/x^20.0+1.0/227.92207792207793*x^27.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "748440.0/x^23.0+638400.0*x^18.0-729960.0*x^19.0+1076400.0/x^26.0+935088.0*x^21.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "748440.0*-23.0/x^24.0+638400.0*18.0*x^17.0-729960.0*19.0*x^18.0+1076400.0*-26.0/x^27.0+935088.0*21.0*x^20.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1.721412E7/x^24.0+1.14912E7*x^17.0-1.386924E7*x^18.0-2.79864E7/x^27.0+1.9636848E7*x^20.0";
 UsageCalculus.EqnSolArrayMap3[4] = "14.166666666666666*x^3.0-14.0*x^3.0+13.833333333333334*x^3.0-13.666666666666666*x^3.0+1.0/71.77777777777777/x^17.0+1.0/151.8*x^24.0-1.0/174.68354430379748*x^25.0+1.0/118.46153846153847/x^20.0+1.0/227.92207792207793*x^27.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "14.166666666666666/4.0*x^4.0-14.0/4.0*x^4.0+13.833333333333334/4.0*x^4.0-13.666666666666666/4.0*x^4.0+1.0/71.77777777777777/-16.0/x^16.0+1.0/151.8/25.0*x^25.0-1.0/174.68354430379748/26.0*x^26.0+1.0/118.46153846153847/-19.0/x^19.0+1.0/227.92207792207793/28.0*x^28.0";
 UsageCalculus.EqnSolArrayMap4[4] = "3.5416666666666665*x^4.0-3.5*x^4.0+3.4583333333333335*x^4.0-3.4166666666666665*x^4.0-1.0/1148.4444444444443/x^16.0+1.0/3795.0000000000005*x^25.0-1.0/4541.772151898735*x^26.0-1.0/2250.769230769231/x^19.0+1.0/6381.818181818182*x^28.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130417() {
 UsageCalculus.TestCase = 130417;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+84/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^17-83*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-18+82*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^19+81/-xyzx^20-80*-xyzx^21+79*-xyzx^22+78/-xyzx^23-77*-xyzx^24+76*-xyzx^25";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyzx";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-84.0+83.0-82.0-81.0/xyzx^20.0+80.0*xyzx^21.0-79.0*xyzx^22.0-78.0/xyzx^23.0+77.0*xyzx^24.0-76.0*xyzx^25.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0+83.0*0.0-82.0*0.0-81.0*-20.0/xyzx^21.0+80.0*21.0*xyzx^20.0-79.0*22.0*xyzx^21.0-78.0*-23.0/xyzx^24.0+77.0*24.0*xyzx^23.0-76.0*25.0*xyzx^24.0";
 UsageCalculus.EqnSolArrayMap2[1] = "1620.0/xyzx^21.0+1680.0*xyzx^20.0-1738.0*xyzx^21.0+1794.0/xyzx^24.0+1848.0*xyzx^23.0-1900.0*xyzx^24.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-84.0+83.0-82.0-81.0/xyzx^20.0+80.0*xyzx^21.0-79.0*xyzx^22.0-78.0/xyzx^23.0+77.0*xyzx^24.0-76.0*xyzx^25.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-84.0*xyzx+83.0*xyzx-82.0*xyzx-81.0/-19.0/xyzx^19.0+80.0/22.0*xyzx^22.0-79.0/23.0*xyzx^23.0-78.0/-22.0/xyzx^22.0+77.0/25.0*xyzx^25.0-76.0/26.0*xyzx^26.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-84.0*xyzx+83.0*xyzx-82.0*xyzx+4.2631578947368425/xyzx^19.0+3.6363636363636362*xyzx^22.0-3.4347826086956523*xyzx^23.0+3.5454545454545454/xyzx^22.0+3.08*xyzx^25.0-2.923076923076923*xyzx^26.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "1620.0/xyzx^21.0+1680.0*xyzx^20.0-1738.0*xyzx^21.0+1794.0/xyzx^24.0+1848.0*xyzx^23.0-1900.0*xyzx^24.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "1620.0*-21.0/xyzx^22.0+1680.0*20.0*xyzx^19.0-1738.0*21.0*xyzx^20.0+1794.0*-24.0/xyzx^25.0+1848.0*23.0*xyzx^22.0-1900.0*24.0*xyzx^23.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-34020.0/xyzx^22.0+33600.0*xyzx^19.0-36498.0*xyzx^20.0-43056.0/xyzx^25.0+42504.0*xyzx^22.0-45600.0*xyzx^23.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-84.0*xyzx+83.0*xyzx-82.0*xyzx+4.2631578947368425/xyzx^19.0+3.6363636363636362*xyzx^22.0-3.4347826086956523*xyzx^23.0+3.5454545454545454/xyzx^22.0+3.08*xyzx^25.0-2.923076923076923*xyzx^26.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-84.0/2.0*xyzx^2.0+83.0/2.0*xyzx^2.0-82.0/2.0*xyzx^2.0+4.2631578947368425/-18.0/xyzx^18.0+3.6363636363636362/23.0*xyzx^23.0-3.4347826086956523/24.0*xyzx^24.0+3.5454545454545454/-21.0/xyzx^21.0+3.08/26.0*xyzx^26.0-2.923076923076923/27.0*xyzx^27.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-42.0*xyzx^2.0+41.5*xyzx^2.0-41.0*xyzx^2.0-1.0/4.222222222222221/xyzx^18.0+1.0/6.325*xyzx^23.0-1.0/6.987341772151899*xyzx^24.0-1.0/5.923076923076923/xyzx^21.0+1.0/8.441558441558442*xyzx^26.0-1.0/9.23684210526316*xyzx^27.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-34020.0/xyzx^22.0+33600.0*xyzx^19.0-36498.0*xyzx^20.0-43056.0/xyzx^25.0+42504.0*xyzx^22.0-45600.0*xyzx^23.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-34020.0*-22.0/xyzx^23.0+33600.0*19.0*xyzx^18.0-36498.0*20.0*xyzx^19.0-43056.0*-25.0/xyzx^26.0+42504.0*22.0*xyzx^21.0-45600.0*23.0*xyzx^22.0";
 UsageCalculus.EqnSolArrayMap2[3] = "748440.0/xyzx^23.0+638400.0*xyzx^18.0-729960.0*xyzx^19.0+1076400.0/xyzx^26.0+935088.0*xyzx^21.0-1048800.0*xyzx^22.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-42.0*xyzx^2.0+41.5*xyzx^2.0-41.0*xyzx^2.0-1.0/4.222222222222221/xyzx^18.0+1.0/6.325*xyzx^23.0-1.0/6.987341772151899*xyzx^24.0-1.0/5.923076923076923/xyzx^21.0+1.0/8.441558441558442*xyzx^26.0-1.0/9.23684210526316*xyzx^27.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-42.0/3.0*xyzx^3.0+41.5/3.0*xyzx^3.0-41.0/3.0*xyzx^3.0-1.0/4.222222222222221/-17.0/xyzx^17.0+1.0/6.325/24.0*xyzx^24.0-1.0/6.987341772151899/25.0*xyzx^25.0-1.0/5.923076923076923/-20.0/xyzx^20.0+1.0/8.441558441558442/27.0*xyzx^27.0-1.0/9.23684210526316/28.0*xyzx^28.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-14.0*xyzx^3.0+13.833333333333334*xyzx^3.0-13.666666666666666*xyzx^3.0+1.0/71.77777777777777/xyzx^17.0+1.0/151.8*xyzx^24.0-1.0/174.68354430379748*xyzx^25.0+1.0/118.46153846153847/xyzx^20.0+1.0/227.92207792207793*xyzx^27.0-1.0/258.63157894736844*xyzx^28.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "748440.0/xyzx^23.0+638400.0*xyzx^18.0-729960.0*xyzx^19.0+1076400.0/xyzx^26.0+935088.0*xyzx^21.0-1048800.0*xyzx^22.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "748440.0*-23.0/xyzx^24.0+638400.0*18.0*xyzx^17.0-729960.0*19.0*xyzx^18.0+1076400.0*-26.0/xyzx^27.0+935088.0*21.0*xyzx^20.0-1048800.0*22.0*xyzx^21.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1.721412E7/xyzx^24.0+1.14912E7*xyzx^17.0-1.386924E7*xyzx^18.0-2.79864E7/xyzx^27.0+1.9636848E7*xyzx^20.0-2.30736E7*xyzx^21.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-14.0*xyzx^3.0+13.833333333333334*xyzx^3.0-13.666666666666666*xyzx^3.0+1.0/71.77777777777777/xyzx^17.0+1.0/151.8*xyzx^24.0-1.0/174.68354430379748*xyzx^25.0+1.0/118.46153846153847/xyzx^20.0+1.0/227.92207792207793*xyzx^27.0-1.0/258.63157894736844*xyzx^28.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-14.0/4.0*xyzx^4.0+13.833333333333334/4.0*xyzx^4.0-13.666666666666666/4.0*xyzx^4.0+1.0/71.77777777777777/-16.0/xyzx^16.0+1.0/151.8/25.0*xyzx^25.0-1.0/174.68354430379748/26.0*xyzx^26.0+1.0/118.46153846153847/-19.0/xyzx^19.0+1.0/227.92207792207793/28.0*xyzx^28.0-1.0/258.63157894736844/29.0*xyzx^29.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-3.5*xyzx^4.0+3.4583333333333335*xyzx^4.0-3.4166666666666665*xyzx^4.0-1.0/1148.4444444444443/xyzx^16.0+1.0/3795.0000000000005*xyzx^25.0-1.0/4541.772151898735*xyzx^26.0-1.0/2250.769230769231/xyzx^19.0+1.0/6381.818181818182*xyzx^28.0-1.0/7500.315789473685*xyzx^29.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130418() {
 UsageCalculus.TestCase = 130418;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-83*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-18+82*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^19+81/-x^20-80*-x^21+79*-x^22+78/-x^23-77*-x^24+76*-x^25+75/-x^26";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "83.0-82.0-81.0/x^20.0+80.0*x^21.0-79.0*x^22.0-78.0/x^23.0+77.0*x^24.0-76.0*x^25.0-75.0/x^26.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0-82.0*0.0-81.0*-20.0/x^21.0+80.0*21.0*x^20.0-79.0*22.0*x^21.0-78.0*-23.0/x^24.0+77.0*24.0*x^23.0-76.0*25.0*x^24.0-75.0*-26.0/x^27.0";
 UsageCalculus.EqnSolArrayMap2[1] = "1620.0/x^21.0+1680.0*x^20.0-1738.0*x^21.0+1794.0/x^24.0+1848.0*x^23.0-1900.0*x^24.0+1950.0/x^27.0";
 UsageCalculus.EqnSolArrayMap3[1] = "83.0-82.0-81.0/x^20.0+80.0*x^21.0-79.0*x^22.0-78.0/x^23.0+77.0*x^24.0-76.0*x^25.0-75.0/x^26.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "83.0*x-82.0*x-81.0/-19.0/x^19.0+80.0/22.0*x^22.0-79.0/23.0*x^23.0-78.0/-22.0/x^22.0+77.0/25.0*x^25.0-76.0/26.0*x^26.0-75.0/-25.0/x^25.0";
 UsageCalculus.EqnSolArrayMap4[1] = "83.0*x-82.0*x+4.2631578947368425/x^19.0+3.6363636363636362*x^22.0-3.4347826086956523*x^23.0+3.5454545454545454/x^22.0+3.08*x^25.0-2.923076923076923*x^26.0+3.0/x^25.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "1620.0/x^21.0+1680.0*x^20.0-1738.0*x^21.0+1794.0/x^24.0+1848.0*x^23.0-1900.0*x^24.0+1950.0/x^27.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "1620.0*-21.0/x^22.0+1680.0*20.0*x^19.0-1738.0*21.0*x^20.0+1794.0*-24.0/x^25.0+1848.0*23.0*x^22.0-1900.0*24.0*x^23.0+1950.0*-27.0/x^28.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-34020.0/x^22.0+33600.0*x^19.0-36498.0*x^20.0-43056.0/x^25.0+42504.0*x^22.0-45600.0*x^23.0-52650.0/x^28.0";
 UsageCalculus.EqnSolArrayMap3[2] = "83.0*x-82.0*x+4.2631578947368425/x^19.0+3.6363636363636362*x^22.0-3.4347826086956523*x^23.0+3.5454545454545454/x^22.0+3.08*x^25.0-2.923076923076923*x^26.0+3.0/x^25.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "83.0/2.0*x^2.0-82.0/2.0*x^2.0+4.2631578947368425/-18.0/x^18.0+3.6363636363636362/23.0*x^23.0-3.4347826086956523/24.0*x^24.0+3.5454545454545454/-21.0/x^21.0+3.08/26.0*x^26.0-2.923076923076923/27.0*x^27.0+3.0/-24.0/x^24.0";
 UsageCalculus.EqnSolArrayMap4[2] = "41.5*x^2.0-41.0*x^2.0-1.0/4.222222222222221/x^18.0+1.0/6.325*x^23.0-1.0/6.987341772151899*x^24.0-1.0/5.923076923076923/x^21.0+1.0/8.441558441558442*x^26.0-1.0/9.23684210526316*x^27.0-1.0/8.0/x^24.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-34020.0/x^22.0+33600.0*x^19.0-36498.0*x^20.0-43056.0/x^25.0+42504.0*x^22.0-45600.0*x^23.0-52650.0/x^28.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-34020.0*-22.0/x^23.0+33600.0*19.0*x^18.0-36498.0*20.0*x^19.0-43056.0*-25.0/x^26.0+42504.0*22.0*x^21.0-45600.0*23.0*x^22.0-52650.0*-28.0/x^29.0";
 UsageCalculus.EqnSolArrayMap2[3] = "748440.0/x^23.0+638400.0*x^18.0-729960.0*x^19.0+1076400.0/x^26.0+935088.0*x^21.0-1048800.0*x^22.0+1474200.0/x^29.0";
 UsageCalculus.EqnSolArrayMap3[3] = "41.5*x^2.0-41.0*x^2.0-1.0/4.222222222222221/x^18.0+1.0/6.325*x^23.0-1.0/6.987341772151899*x^24.0-1.0/5.923076923076923/x^21.0+1.0/8.441558441558442*x^26.0-1.0/9.23684210526316*x^27.0-1.0/8.0/x^24.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "41.5/3.0*x^3.0-41.0/3.0*x^3.0-1.0/4.222222222222221/-17.0/x^17.0+1.0/6.325/24.0*x^24.0-1.0/6.987341772151899/25.0*x^25.0-1.0/5.923076923076923/-20.0/x^20.0+1.0/8.441558441558442/27.0*x^27.0-1.0/9.23684210526316/28.0*x^28.0-1.0/8.0/-23.0/x^23.0";
 UsageCalculus.EqnSolArrayMap4[3] = "13.833333333333334*x^3.0-13.666666666666666*x^3.0+1.0/71.77777777777777/x^17.0+1.0/151.8*x^24.0-1.0/174.68354430379748*x^25.0+1.0/118.46153846153847/x^20.0+1.0/227.92207792207793*x^27.0-1.0/258.63157894736844*x^28.0+1.0/184.0/x^23.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "748440.0/x^23.0+638400.0*x^18.0-729960.0*x^19.0+1076400.0/x^26.0+935088.0*x^21.0-1048800.0*x^22.0+1474200.0/x^29.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "748440.0*-23.0/x^24.0+638400.0*18.0*x^17.0-729960.0*19.0*x^18.0+1076400.0*-26.0/x^27.0+935088.0*21.0*x^20.0-1048800.0*22.0*x^21.0+1474200.0*-29.0/x^30.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1.721412E7/x^24.0+1.14912E7*x^17.0-1.386924E7*x^18.0-2.79864E7/x^27.0+1.9636848E7*x^20.0-2.30736E7*x^21.0-4.27518E7/x^30.0";
 UsageCalculus.EqnSolArrayMap3[4] = "13.833333333333334*x^3.0-13.666666666666666*x^3.0+1.0/71.77777777777777/x^17.0+1.0/151.8*x^24.0-1.0/174.68354430379748*x^25.0+1.0/118.46153846153847/x^20.0+1.0/227.92207792207793*x^27.0-1.0/258.63157894736844*x^28.0+1.0/184.0/x^23.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "13.833333333333334/4.0*x^4.0-13.666666666666666/4.0*x^4.0+1.0/71.77777777777777/-16.0/x^16.0+1.0/151.8/25.0*x^25.0-1.0/174.68354430379748/26.0*x^26.0+1.0/118.46153846153847/-19.0/x^19.0+1.0/227.92207792207793/28.0*x^28.0-1.0/258.63157894736844/29.0*x^29.0+1.0/184.0/-22.0/x^22.0";
 UsageCalculus.EqnSolArrayMap4[4] = "3.4583333333333335*x^4.0-3.4166666666666665*x^4.0-1.0/1148.4444444444443/x^16.0+1.0/3795.0000000000005*x^25.0-1.0/4541.772151898735*x^26.0-1.0/2250.769230769231/x^19.0+1.0/6381.818181818182*x^28.0-1.0/7500.315789473685*x^29.0-1.0/4048.0/x^22.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130419() {
 UsageCalculus.TestCase = 130419;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+82*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^19+81/-xy^20-80*-xy^21+79*-xy^22+78/-xy^23-77*-xy^24+76*-xy^25+75/-xy^26-74*-xy^27";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-82.0-81.0/xy^20.0+80.0*xy^21.0-79.0*xy^22.0-78.0/xy^23.0+77.0*xy^24.0-76.0*xy^25.0-75.0/xy^26.0+74.0*xy^27.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0-81.0*-20.0/xy^21.0+80.0*21.0*xy^20.0-79.0*22.0*xy^21.0-78.0*-23.0/xy^24.0+77.0*24.0*xy^23.0-76.0*25.0*xy^24.0-75.0*-26.0/xy^27.0+74.0*27.0*xy^26.0";
 UsageCalculus.EqnSolArrayMap2[1] = "1620.0/xy^21.0+1680.0*xy^20.0-1738.0*xy^21.0+1794.0/xy^24.0+1848.0*xy^23.0-1900.0*xy^24.0+1950.0/xy^27.0+1998.0*xy^26.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-82.0-81.0/xy^20.0+80.0*xy^21.0-79.0*xy^22.0-78.0/xy^23.0+77.0*xy^24.0-76.0*xy^25.0-75.0/xy^26.0+74.0*xy^27.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-82.0*xy-81.0/-19.0/xy^19.0+80.0/22.0*xy^22.0-79.0/23.0*xy^23.0-78.0/-22.0/xy^22.0+77.0/25.0*xy^25.0-76.0/26.0*xy^26.0-75.0/-25.0/xy^25.0+74.0/28.0*xy^28.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-82.0*xy+4.2631578947368425/xy^19.0+3.6363636363636362*xy^22.0-3.4347826086956523*xy^23.0+3.5454545454545454/xy^22.0+3.08*xy^25.0-2.923076923076923*xy^26.0+3.0/xy^25.0+2.642857142857143*xy^28.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "1620.0/xy^21.0+1680.0*xy^20.0-1738.0*xy^21.0+1794.0/xy^24.0+1848.0*xy^23.0-1900.0*xy^24.0+1950.0/xy^27.0+1998.0*xy^26.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "1620.0*-21.0/xy^22.0+1680.0*20.0*xy^19.0-1738.0*21.0*xy^20.0+1794.0*-24.0/xy^25.0+1848.0*23.0*xy^22.0-1900.0*24.0*xy^23.0+1950.0*-27.0/xy^28.0+1998.0*26.0*xy^25.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-34020.0/xy^22.0+33600.0*xy^19.0-36498.0*xy^20.0-43056.0/xy^25.0+42504.0*xy^22.0-45600.0*xy^23.0-52650.0/xy^28.0+51948.0*xy^25.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-82.0*xy+4.2631578947368425/xy^19.0+3.6363636363636362*xy^22.0-3.4347826086956523*xy^23.0+3.5454545454545454/xy^22.0+3.08*xy^25.0-2.923076923076923*xy^26.0+3.0/xy^25.0+2.642857142857143*xy^28.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-82.0/2.0*xy^2.0+4.2631578947368425/-18.0/xy^18.0+3.6363636363636362/23.0*xy^23.0-3.4347826086956523/24.0*xy^24.0+3.5454545454545454/-21.0/xy^21.0+3.08/26.0*xy^26.0-2.923076923076923/27.0*xy^27.0+3.0/-24.0/xy^24.0+2.642857142857143/29.0*xy^29.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-41.0*xy^2.0-1.0/4.222222222222221/xy^18.0+1.0/6.325*xy^23.0-1.0/6.987341772151899*xy^24.0-1.0/5.923076923076923/xy^21.0+1.0/8.441558441558442*xy^26.0-1.0/9.23684210526316*xy^27.0-1.0/8.0/xy^24.0+1.0/10.972972972972974*xy^29.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-34020.0/xy^22.0+33600.0*xy^19.0-36498.0*xy^20.0-43056.0/xy^25.0+42504.0*xy^22.0-45600.0*xy^23.0-52650.0/xy^28.0+51948.0*xy^25.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-34020.0*-22.0/xy^23.0+33600.0*19.0*xy^18.0-36498.0*20.0*xy^19.0-43056.0*-25.0/xy^26.0+42504.0*22.0*xy^21.0-45600.0*23.0*xy^22.0-52650.0*-28.0/xy^29.0+51948.0*25.0*xy^24.0";
 UsageCalculus.EqnSolArrayMap2[3] = "748440.0/xy^23.0+638400.0*xy^18.0-729960.0*xy^19.0+1076400.0/xy^26.0+935088.0*xy^21.0-1048800.0*xy^22.0+1474200.0/xy^29.0+1298700.0*xy^24.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-41.0*xy^2.0-1.0/4.222222222222221/xy^18.0+1.0/6.325*xy^23.0-1.0/6.987341772151899*xy^24.0-1.0/5.923076923076923/xy^21.0+1.0/8.441558441558442*xy^26.0-1.0/9.23684210526316*xy^27.0-1.0/8.0/xy^24.0+1.0/10.972972972972974*xy^29.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-41.0/3.0*xy^3.0-1.0/4.222222222222221/-17.0/xy^17.0+1.0/6.325/24.0*xy^24.0-1.0/6.987341772151899/25.0*xy^25.0-1.0/5.923076923076923/-20.0/xy^20.0+1.0/8.441558441558442/27.0*xy^27.0-1.0/9.23684210526316/28.0*xy^28.0-1.0/8.0/-23.0/xy^23.0+1.0/10.972972972972974/30.0*xy^30.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-13.666666666666666*xy^3.0+1.0/71.77777777777777/xy^17.0+1.0/151.8*xy^24.0-1.0/174.68354430379748*xy^25.0+1.0/118.46153846153847/xy^20.0+1.0/227.92207792207793*xy^27.0-1.0/258.63157894736844*xy^28.0+1.0/184.0/xy^23.0+1.0/329.1891891891892*xy^30.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "748440.0/xy^23.0+638400.0*xy^18.0-729960.0*xy^19.0+1076400.0/xy^26.0+935088.0*xy^21.0-1048800.0*xy^22.0+1474200.0/xy^29.0+1298700.0*xy^24.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "748440.0*-23.0/xy^24.0+638400.0*18.0*xy^17.0-729960.0*19.0*xy^18.0+1076400.0*-26.0/xy^27.0+935088.0*21.0*xy^20.0-1048800.0*22.0*xy^21.0+1474200.0*-29.0/xy^30.0+1298700.0*24.0*xy^23.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1.721412E7/xy^24.0+1.14912E7*xy^17.0-1.386924E7*xy^18.0-2.79864E7/xy^27.0+1.9636848E7*xy^20.0-2.30736E7*xy^21.0-4.27518E7/xy^30.0+3.11688E7*xy^23.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-13.666666666666666*xy^3.0+1.0/71.77777777777777/xy^17.0+1.0/151.8*xy^24.0-1.0/174.68354430379748*xy^25.0+1.0/118.46153846153847/xy^20.0+1.0/227.92207792207793*xy^27.0-1.0/258.63157894736844*xy^28.0+1.0/184.0/xy^23.0+1.0/329.1891891891892*xy^30.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-13.666666666666666/4.0*xy^4.0+1.0/71.77777777777777/-16.0/xy^16.0+1.0/151.8/25.0*xy^25.0-1.0/174.68354430379748/26.0*xy^26.0+1.0/118.46153846153847/-19.0/xy^19.0+1.0/227.92207792207793/28.0*xy^28.0-1.0/258.63157894736844/29.0*xy^29.0+1.0/184.0/-22.0/xy^22.0+1.0/329.1891891891892/31.0*xy^31.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-3.4166666666666665*xy^4.0-1.0/1148.4444444444443/xy^16.0+1.0/3795.0000000000005*xy^25.0-1.0/4541.772151898735*xy^26.0-1.0/2250.769230769231/xy^19.0+1.0/6381.818181818182*xy^28.0-1.0/7500.315789473685*xy^29.0-1.0/4048.0/xy^22.0+1.0/10204.864864864865*xy^31.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130420() {
 UsageCalculus.TestCase = 130420;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+81/-x^20-80*-x^21+79*-x^22+78/-x^23-77*-x^24+76*-x^25+75/-x^26-74*-x^27+73*-x^28";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-81.0/x^20.0+80.0*x^21.0-79.0*x^22.0-78.0/x^23.0+77.0*x^24.0-76.0*x^25.0-75.0/x^26.0+74.0*x^27.0-73.0*x^28.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-81.0*-20.0/x^21.0+80.0*21.0*x^20.0-79.0*22.0*x^21.0-78.0*-23.0/x^24.0+77.0*24.0*x^23.0-76.0*25.0*x^24.0-75.0*-26.0/x^27.0+74.0*27.0*x^26.0-73.0*28.0*x^27.0";
 UsageCalculus.EqnSolArrayMap2[1] = "1620.0/x^21.0+1680.0*x^20.0-1738.0*x^21.0+1794.0/x^24.0+1848.0*x^23.0-1900.0*x^24.0+1950.0/x^27.0+1998.0*x^26.0-2044.0*x^27.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-81.0/x^20.0+80.0*x^21.0-79.0*x^22.0-78.0/x^23.0+77.0*x^24.0-76.0*x^25.0-75.0/x^26.0+74.0*x^27.0-73.0*x^28.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-81.0/-19.0/x^19.0+80.0/22.0*x^22.0-79.0/23.0*x^23.0-78.0/-22.0/x^22.0+77.0/25.0*x^25.0-76.0/26.0*x^26.0-75.0/-25.0/x^25.0+74.0/28.0*x^28.0-73.0/29.0*x^29.0";
 UsageCalculus.EqnSolArrayMap4[1] = "4.2631578947368425/x^19.0+3.6363636363636362*x^22.0-3.4347826086956523*x^23.0+3.5454545454545454/x^22.0+3.08*x^25.0-2.923076923076923*x^26.0+3.0/x^25.0+2.642857142857143*x^28.0-2.5172413793103448*x^29.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "1620.0/x^21.0+1680.0*x^20.0-1738.0*x^21.0+1794.0/x^24.0+1848.0*x^23.0-1900.0*x^24.0+1950.0/x^27.0+1998.0*x^26.0-2044.0*x^27.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "1620.0*-21.0/x^22.0+1680.0*20.0*x^19.0-1738.0*21.0*x^20.0+1794.0*-24.0/x^25.0+1848.0*23.0*x^22.0-1900.0*24.0*x^23.0+1950.0*-27.0/x^28.0+1998.0*26.0*x^25.0-2044.0*27.0*x^26.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-34020.0/x^22.0+33600.0*x^19.0-36498.0*x^20.0-43056.0/x^25.0+42504.0*x^22.0-45600.0*x^23.0-52650.0/x^28.0+51948.0*x^25.0-55188.0*x^26.0";
 UsageCalculus.EqnSolArrayMap3[2] = "4.2631578947368425/x^19.0+3.6363636363636362*x^22.0-3.4347826086956523*x^23.0+3.5454545454545454/x^22.0+3.08*x^25.0-2.923076923076923*x^26.0+3.0/x^25.0+2.642857142857143*x^28.0-2.5172413793103448*x^29.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "4.2631578947368425/-18.0/x^18.0+3.6363636363636362/23.0*x^23.0-3.4347826086956523/24.0*x^24.0+3.5454545454545454/-21.0/x^21.0+3.08/26.0*x^26.0-2.923076923076923/27.0*x^27.0+3.0/-24.0/x^24.0+2.642857142857143/29.0*x^29.0-2.5172413793103448/30.0*x^30.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/4.222222222222221/x^18.0+1.0/6.325*x^23.0-1.0/6.987341772151899*x^24.0-1.0/5.923076923076923/x^21.0+1.0/8.441558441558442*x^26.0-1.0/9.23684210526316*x^27.0-1.0/8.0/x^24.0+1.0/10.972972972972974*x^29.0-1.0/11.917808219178083*x^30.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-34020.0/x^22.0+33600.0*x^19.0-36498.0*x^20.0-43056.0/x^25.0+42504.0*x^22.0-45600.0*x^23.0-52650.0/x^28.0+51948.0*x^25.0-55188.0*x^26.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-34020.0*-22.0/x^23.0+33600.0*19.0*x^18.0-36498.0*20.0*x^19.0-43056.0*-25.0/x^26.0+42504.0*22.0*x^21.0-45600.0*23.0*x^22.0-52650.0*-28.0/x^29.0+51948.0*25.0*x^24.0-55188.0*26.0*x^25.0";
 UsageCalculus.EqnSolArrayMap2[3] = "748440.0/x^23.0+638400.0*x^18.0-729960.0*x^19.0+1076400.0/x^26.0+935088.0*x^21.0-1048800.0*x^22.0+1474200.0/x^29.0+1298700.0*x^24.0-1434888.0*x^25.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/4.222222222222221/x^18.0+1.0/6.325*x^23.0-1.0/6.987341772151899*x^24.0-1.0/5.923076923076923/x^21.0+1.0/8.441558441558442*x^26.0-1.0/9.23684210526316*x^27.0-1.0/8.0/x^24.0+1.0/10.972972972972974*x^29.0-1.0/11.917808219178083*x^30.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/4.222222222222221/-17.0/x^17.0+1.0/6.325/24.0*x^24.0-1.0/6.987341772151899/25.0*x^25.0-1.0/5.923076923076923/-20.0/x^20.0+1.0/8.441558441558442/27.0*x^27.0-1.0/9.23684210526316/28.0*x^28.0-1.0/8.0/-23.0/x^23.0+1.0/10.972972972972974/30.0*x^30.0-1.0/11.917808219178083/31.0*x^31.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/71.77777777777777/x^17.0+1.0/151.8*x^24.0-1.0/174.68354430379748*x^25.0+1.0/118.46153846153847/x^20.0+1.0/227.92207792207793*x^27.0-1.0/258.63157894736844*x^28.0+1.0/184.0/x^23.0+1.0/329.1891891891892*x^30.0-1.0/369.45205479452056*x^31.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "748440.0/x^23.0+638400.0*x^18.0-729960.0*x^19.0+1076400.0/x^26.0+935088.0*x^21.0-1048800.0*x^22.0+1474200.0/x^29.0+1298700.0*x^24.0-1434888.0*x^25.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "748440.0*-23.0/x^24.0+638400.0*18.0*x^17.0-729960.0*19.0*x^18.0+1076400.0*-26.0/x^27.0+935088.0*21.0*x^20.0-1048800.0*22.0*x^21.0+1474200.0*-29.0/x^30.0+1298700.0*24.0*x^23.0-1434888.0*25.0*x^24.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1.721412E7/x^24.0+1.14912E7*x^17.0-1.386924E7*x^18.0-2.79864E7/x^27.0+1.9636848E7*x^20.0-2.30736E7*x^21.0-4.27518E7/x^30.0+3.11688E7*x^23.0-3.58722E7*x^24.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/71.77777777777777/x^17.0+1.0/151.8*x^24.0-1.0/174.68354430379748*x^25.0+1.0/118.46153846153847/x^20.0+1.0/227.92207792207793*x^27.0-1.0/258.63157894736844*x^28.0+1.0/184.0/x^23.0+1.0/329.1891891891892*x^30.0-1.0/369.45205479452056*x^31.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/71.77777777777777/-16.0/x^16.0+1.0/151.8/25.0*x^25.0-1.0/174.68354430379748/26.0*x^26.0+1.0/118.46153846153847/-19.0/x^19.0+1.0/227.92207792207793/28.0*x^28.0-1.0/258.63157894736844/29.0*x^29.0+1.0/184.0/-22.0/x^22.0+1.0/329.1891891891892/31.0*x^31.0-1.0/369.45205479452056/32.0*x^32.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/1148.4444444444443/x^16.0+1.0/3795.0000000000005*x^25.0-1.0/4541.772151898735*x^26.0-1.0/2250.769230769231/x^19.0+1.0/6381.818181818182*x^28.0-1.0/7500.315789473685*x^29.0-1.0/4048.0/x^22.0+1.0/10204.864864864865*x^31.0-1.0/11822.465753424658*x^32.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130421() {
 UsageCalculus.TestCase = 130421;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-80*-xyzx^21+79*-xyzx^22+78/-xyzx^23-77*-xyzx^24+76*-xyzx^25+75/-xyzx^26-74*-xyzx^27+73*-xyzx^28+72/-xyzx^29";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyzx";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "80.0*xyzx^21.0-79.0*xyzx^22.0-78.0/xyzx^23.0+77.0*xyzx^24.0-76.0*xyzx^25.0-75.0/xyzx^26.0+74.0*xyzx^27.0-73.0*xyzx^28.0-72.0/xyzx^29.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "80.0*21.0*xyzx^20.0-79.0*22.0*xyzx^21.0-78.0*-23.0/xyzx^24.0+77.0*24.0*xyzx^23.0-76.0*25.0*xyzx^24.0-75.0*-26.0/xyzx^27.0+74.0*27.0*xyzx^26.0-73.0*28.0*xyzx^27.0-72.0*-29.0/xyzx^30.0";
 UsageCalculus.EqnSolArrayMap2[1] = "1680.0*xyzx^20.0-1738.0*xyzx^21.0+1794.0/xyzx^24.0+1848.0*xyzx^23.0-1900.0*xyzx^24.0+1950.0/xyzx^27.0+1998.0*xyzx^26.0-2044.0*xyzx^27.0+2088.0/xyzx^30.0";
 UsageCalculus.EqnSolArrayMap3[1] = "80.0*xyzx^21.0-79.0*xyzx^22.0-78.0/xyzx^23.0+77.0*xyzx^24.0-76.0*xyzx^25.0-75.0/xyzx^26.0+74.0*xyzx^27.0-73.0*xyzx^28.0-72.0/xyzx^29.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "80.0/22.0*xyzx^22.0-79.0/23.0*xyzx^23.0-78.0/-22.0/xyzx^22.0+77.0/25.0*xyzx^25.0-76.0/26.0*xyzx^26.0-75.0/-25.0/xyzx^25.0+74.0/28.0*xyzx^28.0-73.0/29.0*xyzx^29.0-72.0/-28.0/xyzx^28.0";
 UsageCalculus.EqnSolArrayMap4[1] = "3.6363636363636362*xyzx^22.0-3.4347826086956523*xyzx^23.0+3.5454545454545454/xyzx^22.0+3.08*xyzx^25.0-2.923076923076923*xyzx^26.0+3.0/xyzx^25.0+2.642857142857143*xyzx^28.0-2.5172413793103448*xyzx^29.0+2.5714285714285716/xyzx^28.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "1680.0*xyzx^20.0-1738.0*xyzx^21.0+1794.0/xyzx^24.0+1848.0*xyzx^23.0-1900.0*xyzx^24.0+1950.0/xyzx^27.0+1998.0*xyzx^26.0-2044.0*xyzx^27.0+2088.0/xyzx^30.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "1680.0*20.0*xyzx^19.0-1738.0*21.0*xyzx^20.0+1794.0*-24.0/xyzx^25.0+1848.0*23.0*xyzx^22.0-1900.0*24.0*xyzx^23.0+1950.0*-27.0/xyzx^28.0+1998.0*26.0*xyzx^25.0-2044.0*27.0*xyzx^26.0+2088.0*-30.0/xyzx^31.0";
 UsageCalculus.EqnSolArrayMap2[2] = "33600.0*xyzx^19.0-36498.0*xyzx^20.0-43056.0/xyzx^25.0+42504.0*xyzx^22.0-45600.0*xyzx^23.0-52650.0/xyzx^28.0+51948.0*xyzx^25.0-55188.0*xyzx^26.0-62640.0/xyzx^31.0";
 UsageCalculus.EqnSolArrayMap3[2] = "3.6363636363636362*xyzx^22.0-3.4347826086956523*xyzx^23.0+3.5454545454545454/xyzx^22.0+3.08*xyzx^25.0-2.923076923076923*xyzx^26.0+3.0/xyzx^25.0+2.642857142857143*xyzx^28.0-2.5172413793103448*xyzx^29.0+2.5714285714285716/xyzx^28.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "3.6363636363636362/23.0*xyzx^23.0-3.4347826086956523/24.0*xyzx^24.0+3.5454545454545454/-21.0/xyzx^21.0+3.08/26.0*xyzx^26.0-2.923076923076923/27.0*xyzx^27.0+3.0/-24.0/xyzx^24.0+2.642857142857143/29.0*xyzx^29.0-2.5172413793103448/30.0*xyzx^30.0+2.5714285714285716/-27.0/xyzx^27.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/6.325*xyzx^23.0-1.0/6.987341772151899*xyzx^24.0-1.0/5.923076923076923/xyzx^21.0+1.0/8.441558441558442*xyzx^26.0-1.0/9.23684210526316*xyzx^27.0-1.0/8.0/xyzx^24.0+1.0/10.972972972972974*xyzx^29.0-1.0/11.917808219178083*xyzx^30.0-1.0/10.5/xyzx^27.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "33600.0*xyzx^19.0-36498.0*xyzx^20.0-43056.0/xyzx^25.0+42504.0*xyzx^22.0-45600.0*xyzx^23.0-52650.0/xyzx^28.0+51948.0*xyzx^25.0-55188.0*xyzx^26.0-62640.0/xyzx^31.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "33600.0*19.0*xyzx^18.0-36498.0*20.0*xyzx^19.0-43056.0*-25.0/xyzx^26.0+42504.0*22.0*xyzx^21.0-45600.0*23.0*xyzx^22.0-52650.0*-28.0/xyzx^29.0+51948.0*25.0*xyzx^24.0-55188.0*26.0*xyzx^25.0-62640.0*-31.0/xyzx^32.0";
 UsageCalculus.EqnSolArrayMap2[3] = "638400.0*xyzx^18.0-729960.0*xyzx^19.0+1076400.0/xyzx^26.0+935088.0*xyzx^21.0-1048800.0*xyzx^22.0+1474200.0/xyzx^29.0+1298700.0*xyzx^24.0-1434888.0*xyzx^25.0+1941840.0/xyzx^32.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/6.325*xyzx^23.0-1.0/6.987341772151899*xyzx^24.0-1.0/5.923076923076923/xyzx^21.0+1.0/8.441558441558442*xyzx^26.0-1.0/9.23684210526316*xyzx^27.0-1.0/8.0/xyzx^24.0+1.0/10.972972972972974*xyzx^29.0-1.0/11.917808219178083*xyzx^30.0-1.0/10.5/xyzx^27.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/6.325/24.0*xyzx^24.0-1.0/6.987341772151899/25.0*xyzx^25.0-1.0/5.923076923076923/-20.0/xyzx^20.0+1.0/8.441558441558442/27.0*xyzx^27.0-1.0/9.23684210526316/28.0*xyzx^28.0-1.0/8.0/-23.0/xyzx^23.0+1.0/10.972972972972974/30.0*xyzx^30.0-1.0/11.917808219178083/31.0*xyzx^31.0-1.0/10.5/-26.0/xyzx^26.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/151.8*xyzx^24.0-1.0/174.68354430379748*xyzx^25.0+1.0/118.46153846153847/xyzx^20.0+1.0/227.92207792207793*xyzx^27.0-1.0/258.63157894736844*xyzx^28.0+1.0/184.0/xyzx^23.0+1.0/329.1891891891892*xyzx^30.0-1.0/369.45205479452056*xyzx^31.0+1.0/273.0/xyzx^26.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "638400.0*xyzx^18.0-729960.0*xyzx^19.0+1076400.0/xyzx^26.0+935088.0*xyzx^21.0-1048800.0*xyzx^22.0+1474200.0/xyzx^29.0+1298700.0*xyzx^24.0-1434888.0*xyzx^25.0+1941840.0/xyzx^32.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "638400.0*18.0*xyzx^17.0-729960.0*19.0*xyzx^18.0+1076400.0*-26.0/xyzx^27.0+935088.0*21.0*xyzx^20.0-1048800.0*22.0*xyzx^21.0+1474200.0*-29.0/xyzx^30.0+1298700.0*24.0*xyzx^23.0-1434888.0*25.0*xyzx^24.0+1941840.0*-32.0/xyzx^33.0";
 UsageCalculus.EqnSolArrayMap2[4] = "1.14912E7*xyzx^17.0-1.386924E7*xyzx^18.0-2.79864E7/xyzx^27.0+1.9636848E7*xyzx^20.0-2.30736E7*xyzx^21.0-4.27518E7/xyzx^30.0+3.11688E7*xyzx^23.0-3.58722E7*xyzx^24.0-6.213888E7/xyzx^33.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/151.8*xyzx^24.0-1.0/174.68354430379748*xyzx^25.0+1.0/118.46153846153847/xyzx^20.0+1.0/227.92207792207793*xyzx^27.0-1.0/258.63157894736844*xyzx^28.0+1.0/184.0/xyzx^23.0+1.0/329.1891891891892*xyzx^30.0-1.0/369.45205479452056*xyzx^31.0+1.0/273.0/xyzx^26.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/151.8/25.0*xyzx^25.0-1.0/174.68354430379748/26.0*xyzx^26.0+1.0/118.46153846153847/-19.0/xyzx^19.0+1.0/227.92207792207793/28.0*xyzx^28.0-1.0/258.63157894736844/29.0*xyzx^29.0+1.0/184.0/-22.0/xyzx^22.0+1.0/329.1891891891892/31.0*xyzx^31.0-1.0/369.45205479452056/32.0*xyzx^32.0+1.0/273.0/-25.0/xyzx^25.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/3795.0000000000005*xyzx^25.0-1.0/4541.772151898735*xyzx^26.0-1.0/2250.769230769231/xyzx^19.0+1.0/6381.818181818182*xyzx^28.0-1.0/7500.315789473685*xyzx^29.0-1.0/4048.0/xyzx^22.0+1.0/10204.864864864865*xyzx^31.0-1.0/11822.465753424658*xyzx^32.0-1.0/6825.0/xyzx^25.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130422() {
 UsageCalculus.TestCase = 130422;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+79*-x^22+78/-x^23-77*-x^24+76*-x^25+75/-x^26-74*-x^27+73*-x^28+72/-x^29-71*-x^30";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-79.0*x^22.0-78.0/x^23.0+77.0*x^24.0-76.0*x^25.0-75.0/x^26.0+74.0*x^27.0-73.0*x^28.0-72.0/x^29.0+71.0*x^30.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-79.0*22.0*x^21.0-78.0*-23.0/x^24.0+77.0*24.0*x^23.0-76.0*25.0*x^24.0-75.0*-26.0/x^27.0+74.0*27.0*x^26.0-73.0*28.0*x^27.0-72.0*-29.0/x^30.0+71.0*30.0*x^29.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-1738.0*x^21.0+1794.0/x^24.0+1848.0*x^23.0-1900.0*x^24.0+1950.0/x^27.0+1998.0*x^26.0-2044.0*x^27.0+2088.0/x^30.0+2130.0*x^29.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-79.0*x^22.0-78.0/x^23.0+77.0*x^24.0-76.0*x^25.0-75.0/x^26.0+74.0*x^27.0-73.0*x^28.0-72.0/x^29.0+71.0*x^30.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-79.0/23.0*x^23.0-78.0/-22.0/x^22.0+77.0/25.0*x^25.0-76.0/26.0*x^26.0-75.0/-25.0/x^25.0+74.0/28.0*x^28.0-73.0/29.0*x^29.0-72.0/-28.0/x^28.0+71.0/31.0*x^31.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-3.4347826086956523*x^23.0+3.5454545454545454/x^22.0+3.08*x^25.0-2.923076923076923*x^26.0+3.0/x^25.0+2.642857142857143*x^28.0-2.5172413793103448*x^29.0+2.5714285714285716/x^28.0+2.2903225806451615*x^31.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-1738.0*x^21.0+1794.0/x^24.0+1848.0*x^23.0-1900.0*x^24.0+1950.0/x^27.0+1998.0*x^26.0-2044.0*x^27.0+2088.0/x^30.0+2130.0*x^29.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-1738.0*21.0*x^20.0+1794.0*-24.0/x^25.0+1848.0*23.0*x^22.0-1900.0*24.0*x^23.0+1950.0*-27.0/x^28.0+1998.0*26.0*x^25.0-2044.0*27.0*x^26.0+2088.0*-30.0/x^31.0+2130.0*29.0*x^28.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-36498.0*x^20.0-43056.0/x^25.0+42504.0*x^22.0-45600.0*x^23.0-52650.0/x^28.0+51948.0*x^25.0-55188.0*x^26.0-62640.0/x^31.0+61770.0*x^28.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-3.4347826086956523*x^23.0+3.5454545454545454/x^22.0+3.08*x^25.0-2.923076923076923*x^26.0+3.0/x^25.0+2.642857142857143*x^28.0-2.5172413793103448*x^29.0+2.5714285714285716/x^28.0+2.2903225806451615*x^31.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-3.4347826086956523/24.0*x^24.0+3.5454545454545454/-21.0/x^21.0+3.08/26.0*x^26.0-2.923076923076923/27.0*x^27.0+3.0/-24.0/x^24.0+2.642857142857143/29.0*x^29.0-2.5172413793103448/30.0*x^30.0+2.5714285714285716/-27.0/x^27.0+2.2903225806451615/32.0*x^32.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/6.987341772151899*x^24.0-1.0/5.923076923076923/x^21.0+1.0/8.441558441558442*x^26.0-1.0/9.23684210526316*x^27.0-1.0/8.0/x^24.0+1.0/10.972972972972974*x^29.0-1.0/11.917808219178083*x^30.0-1.0/10.5/x^27.0+1.0/13.971830985915492*x^32.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-36498.0*x^20.0-43056.0/x^25.0+42504.0*x^22.0-45600.0*x^23.0-52650.0/x^28.0+51948.0*x^25.0-55188.0*x^26.0-62640.0/x^31.0+61770.0*x^28.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-36498.0*20.0*x^19.0-43056.0*-25.0/x^26.0+42504.0*22.0*x^21.0-45600.0*23.0*x^22.0-52650.0*-28.0/x^29.0+51948.0*25.0*x^24.0-55188.0*26.0*x^25.0-62640.0*-31.0/x^32.0+61770.0*28.0*x^27.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-729960.0*x^19.0+1076400.0/x^26.0+935088.0*x^21.0-1048800.0*x^22.0+1474200.0/x^29.0+1298700.0*x^24.0-1434888.0*x^25.0+1941840.0/x^32.0+1729560.0*x^27.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/6.987341772151899*x^24.0-1.0/5.923076923076923/x^21.0+1.0/8.441558441558442*x^26.0-1.0/9.23684210526316*x^27.0-1.0/8.0/x^24.0+1.0/10.972972972972974*x^29.0-1.0/11.917808219178083*x^30.0-1.0/10.5/x^27.0+1.0/13.971830985915492*x^32.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/6.987341772151899/25.0*x^25.0-1.0/5.923076923076923/-20.0/x^20.0+1.0/8.441558441558442/27.0*x^27.0-1.0/9.23684210526316/28.0*x^28.0-1.0/8.0/-23.0/x^23.0+1.0/10.972972972972974/30.0*x^30.0-1.0/11.917808219178083/31.0*x^31.0-1.0/10.5/-26.0/x^26.0+1.0/13.971830985915492/33.0*x^33.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/174.68354430379748*x^25.0+1.0/118.46153846153847/x^20.0+1.0/227.92207792207793*x^27.0-1.0/258.63157894736844*x^28.0+1.0/184.0/x^23.0+1.0/329.1891891891892*x^30.0-1.0/369.45205479452056*x^31.0+1.0/273.0/x^26.0+1.0/461.07042253521126*x^33.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-729960.0*x^19.0+1076400.0/x^26.0+935088.0*x^21.0-1048800.0*x^22.0+1474200.0/x^29.0+1298700.0*x^24.0-1434888.0*x^25.0+1941840.0/x^32.0+1729560.0*x^27.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-729960.0*19.0*x^18.0+1076400.0*-26.0/x^27.0+935088.0*21.0*x^20.0-1048800.0*22.0*x^21.0+1474200.0*-29.0/x^30.0+1298700.0*24.0*x^23.0-1434888.0*25.0*x^24.0+1941840.0*-32.0/x^33.0+1729560.0*27.0*x^26.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1.386924E7*x^18.0-2.79864E7/x^27.0+1.9636848E7*x^20.0-2.30736E7*x^21.0-4.27518E7/x^30.0+3.11688E7*x^23.0-3.58722E7*x^24.0-6.213888E7/x^33.0+4.669812E7*x^26.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/174.68354430379748*x^25.0+1.0/118.46153846153847/x^20.0+1.0/227.92207792207793*x^27.0-1.0/258.63157894736844*x^28.0+1.0/184.0/x^23.0+1.0/329.1891891891892*x^30.0-1.0/369.45205479452056*x^31.0+1.0/273.0/x^26.0+1.0/461.07042253521126*x^33.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/174.68354430379748/26.0*x^26.0+1.0/118.46153846153847/-19.0/x^19.0+1.0/227.92207792207793/28.0*x^28.0-1.0/258.63157894736844/29.0*x^29.0+1.0/184.0/-22.0/x^22.0+1.0/329.1891891891892/31.0*x^31.0-1.0/369.45205479452056/32.0*x^32.0+1.0/273.0/-25.0/x^25.0+1.0/461.07042253521126/34.0*x^34.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/4541.772151898735*x^26.0-1.0/2250.769230769231/x^19.0+1.0/6381.818181818182*x^28.0-1.0/7500.315789473685*x^29.0-1.0/4048.0/x^22.0+1.0/10204.864864864865*x^31.0-1.0/11822.465753424658*x^32.0-1.0/6825.0/x^25.0+1.0/15676.394366197183*x^34.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130423() {
 UsageCalculus.TestCase = 130423;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+78/-xy^23-77*-xy^24+76*-xy^25+75/-xy^26-74*-xy^27+73*-xy^28+72/-xy^29-71*-xy^30+70*-xy^31";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-78.0/xy^23.0+77.0*xy^24.0-76.0*xy^25.0-75.0/xy^26.0+74.0*xy^27.0-73.0*xy^28.0-72.0/xy^29.0+71.0*xy^30.0-70.0*xy^31.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-78.0*-23.0/xy^24.0+77.0*24.0*xy^23.0-76.0*25.0*xy^24.0-75.0*-26.0/xy^27.0+74.0*27.0*xy^26.0-73.0*28.0*xy^27.0-72.0*-29.0/xy^30.0+71.0*30.0*xy^29.0-70.0*31.0*xy^30.0";
 UsageCalculus.EqnSolArrayMap2[1] = "1794.0/xy^24.0+1848.0*xy^23.0-1900.0*xy^24.0+1950.0/xy^27.0+1998.0*xy^26.0-2044.0*xy^27.0+2088.0/xy^30.0+2130.0*xy^29.0-2170.0*xy^30.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-78.0/xy^23.0+77.0*xy^24.0-76.0*xy^25.0-75.0/xy^26.0+74.0*xy^27.0-73.0*xy^28.0-72.0/xy^29.0+71.0*xy^30.0-70.0*xy^31.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-78.0/-22.0/xy^22.0+77.0/25.0*xy^25.0-76.0/26.0*xy^26.0-75.0/-25.0/xy^25.0+74.0/28.0*xy^28.0-73.0/29.0*xy^29.0-72.0/-28.0/xy^28.0+71.0/31.0*xy^31.0-70.0/32.0*xy^32.0";
 UsageCalculus.EqnSolArrayMap4[1] = "3.5454545454545454/xy^22.0+3.08*xy^25.0-2.923076923076923*xy^26.0+3.0/xy^25.0+2.642857142857143*xy^28.0-2.5172413793103448*xy^29.0+2.5714285714285716/xy^28.0+2.2903225806451615*xy^31.0-2.1875*xy^32.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "1794.0/xy^24.0+1848.0*xy^23.0-1900.0*xy^24.0+1950.0/xy^27.0+1998.0*xy^26.0-2044.0*xy^27.0+2088.0/xy^30.0+2130.0*xy^29.0-2170.0*xy^30.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "1794.0*-24.0/xy^25.0+1848.0*23.0*xy^22.0-1900.0*24.0*xy^23.0+1950.0*-27.0/xy^28.0+1998.0*26.0*xy^25.0-2044.0*27.0*xy^26.0+2088.0*-30.0/xy^31.0+2130.0*29.0*xy^28.0-2170.0*30.0*xy^29.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-43056.0/xy^25.0+42504.0*xy^22.0-45600.0*xy^23.0-52650.0/xy^28.0+51948.0*xy^25.0-55188.0*xy^26.0-62640.0/xy^31.0+61770.0*xy^28.0-65100.0*xy^29.0";
 UsageCalculus.EqnSolArrayMap3[2] = "3.5454545454545454/xy^22.0+3.08*xy^25.0-2.923076923076923*xy^26.0+3.0/xy^25.0+2.642857142857143*xy^28.0-2.5172413793103448*xy^29.0+2.5714285714285716/xy^28.0+2.2903225806451615*xy^31.0-2.1875*xy^32.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "3.5454545454545454/-21.0/xy^21.0+3.08/26.0*xy^26.0-2.923076923076923/27.0*xy^27.0+3.0/-24.0/xy^24.0+2.642857142857143/29.0*xy^29.0-2.5172413793103448/30.0*xy^30.0+2.5714285714285716/-27.0/xy^27.0+2.2903225806451615/32.0*xy^32.0-2.1875/33.0*xy^33.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/5.923076923076923/xy^21.0+1.0/8.441558441558442*xy^26.0-1.0/9.23684210526316*xy^27.0-1.0/8.0/xy^24.0+1.0/10.972972972972974*xy^29.0-1.0/11.917808219178083*xy^30.0-1.0/10.5/xy^27.0+1.0/13.971830985915492*xy^32.0-1.0/15.085714285714285*xy^33.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-43056.0/xy^25.0+42504.0*xy^22.0-45600.0*xy^23.0-52650.0/xy^28.0+51948.0*xy^25.0-55188.0*xy^26.0-62640.0/xy^31.0+61770.0*xy^28.0-65100.0*xy^29.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-43056.0*-25.0/xy^26.0+42504.0*22.0*xy^21.0-45600.0*23.0*xy^22.0-52650.0*-28.0/xy^29.0+51948.0*25.0*xy^24.0-55188.0*26.0*xy^25.0-62640.0*-31.0/xy^32.0+61770.0*28.0*xy^27.0-65100.0*29.0*xy^28.0";
 UsageCalculus.EqnSolArrayMap2[3] = "1076400.0/xy^26.0+935088.0*xy^21.0-1048800.0*xy^22.0+1474200.0/xy^29.0+1298700.0*xy^24.0-1434888.0*xy^25.0+1941840.0/xy^32.0+1729560.0*xy^27.0-1887900.0*xy^28.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/5.923076923076923/xy^21.0+1.0/8.441558441558442*xy^26.0-1.0/9.23684210526316*xy^27.0-1.0/8.0/xy^24.0+1.0/10.972972972972974*xy^29.0-1.0/11.917808219178083*xy^30.0-1.0/10.5/xy^27.0+1.0/13.971830985915492*xy^32.0-1.0/15.085714285714285*xy^33.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/5.923076923076923/-20.0/xy^20.0+1.0/8.441558441558442/27.0*xy^27.0-1.0/9.23684210526316/28.0*xy^28.0-1.0/8.0/-23.0/xy^23.0+1.0/10.972972972972974/30.0*xy^30.0-1.0/11.917808219178083/31.0*xy^31.0-1.0/10.5/-26.0/xy^26.0+1.0/13.971830985915492/33.0*xy^33.0-1.0/15.085714285714285/34.0*xy^34.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/118.46153846153847/xy^20.0+1.0/227.92207792207793*xy^27.0-1.0/258.63157894736844*xy^28.0+1.0/184.0/xy^23.0+1.0/329.1891891891892*xy^30.0-1.0/369.45205479452056*xy^31.0+1.0/273.0/xy^26.0+1.0/461.07042253521126*xy^33.0-1.0/512.9142857142857*xy^34.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "1076400.0/xy^26.0+935088.0*xy^21.0-1048800.0*xy^22.0+1474200.0/xy^29.0+1298700.0*xy^24.0-1434888.0*xy^25.0+1941840.0/xy^32.0+1729560.0*xy^27.0-1887900.0*xy^28.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "1076400.0*-26.0/xy^27.0+935088.0*21.0*xy^20.0-1048800.0*22.0*xy^21.0+1474200.0*-29.0/xy^30.0+1298700.0*24.0*xy^23.0-1434888.0*25.0*xy^24.0+1941840.0*-32.0/xy^33.0+1729560.0*27.0*xy^26.0-1887900.0*28.0*xy^27.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-2.79864E7/xy^27.0+1.9636848E7*xy^20.0-2.30736E7*xy^21.0-4.27518E7/xy^30.0+3.11688E7*xy^23.0-3.58722E7*xy^24.0-6.213888E7/xy^33.0+4.669812E7*xy^26.0-5.28612E7*xy^27.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/118.46153846153847/xy^20.0+1.0/227.92207792207793*xy^27.0-1.0/258.63157894736844*xy^28.0+1.0/184.0/xy^23.0+1.0/329.1891891891892*xy^30.0-1.0/369.45205479452056*xy^31.0+1.0/273.0/xy^26.0+1.0/461.07042253521126*xy^33.0-1.0/512.9142857142857*xy^34.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/118.46153846153847/-19.0/xy^19.0+1.0/227.92207792207793/28.0*xy^28.0-1.0/258.63157894736844/29.0*xy^29.0+1.0/184.0/-22.0/xy^22.0+1.0/329.1891891891892/31.0*xy^31.0-1.0/369.45205479452056/32.0*xy^32.0+1.0/273.0/-25.0/xy^25.0+1.0/461.07042253521126/34.0*xy^34.0-1.0/512.9142857142857/35.0*xy^35.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/2250.769230769231/xy^19.0+1.0/6381.818181818182*xy^28.0-1.0/7500.315789473685*xy^29.0-1.0/4048.0/xy^22.0+1.0/10204.864864864865*xy^31.0-1.0/11822.465753424658*xy^32.0-1.0/6825.0/xy^25.0+1.0/15676.394366197183*xy^34.0-1.0/17952.0*xy^35.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130424() {
 UsageCalculus.TestCase = 130424;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-77*-x^24+76*-x^25+75/-x^26-74*-x^27+73*-x^28+72/-x^29-71*-x^30+70*-x^31+69/-x^32";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "77.0*x^24.0-76.0*x^25.0-75.0/x^26.0+74.0*x^27.0-73.0*x^28.0-72.0/x^29.0+71.0*x^30.0-70.0*x^31.0-69.0/x^32.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "77.0*24.0*x^23.0-76.0*25.0*x^24.0-75.0*-26.0/x^27.0+74.0*27.0*x^26.0-73.0*28.0*x^27.0-72.0*-29.0/x^30.0+71.0*30.0*x^29.0-70.0*31.0*x^30.0-69.0*-32.0/x^33.0";
 UsageCalculus.EqnSolArrayMap2[1] = "1848.0*x^23.0-1900.0*x^24.0+1950.0/x^27.0+1998.0*x^26.0-2044.0*x^27.0+2088.0/x^30.0+2130.0*x^29.0-2170.0*x^30.0+2208.0/x^33.0";
 UsageCalculus.EqnSolArrayMap3[1] = "77.0*x^24.0-76.0*x^25.0-75.0/x^26.0+74.0*x^27.0-73.0*x^28.0-72.0/x^29.0+71.0*x^30.0-70.0*x^31.0-69.0/x^32.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "77.0/25.0*x^25.0-76.0/26.0*x^26.0-75.0/-25.0/x^25.0+74.0/28.0*x^28.0-73.0/29.0*x^29.0-72.0/-28.0/x^28.0+71.0/31.0*x^31.0-70.0/32.0*x^32.0-69.0/-31.0/x^31.0";
 UsageCalculus.EqnSolArrayMap4[1] = "3.08*x^25.0-2.923076923076923*x^26.0+3.0/x^25.0+2.642857142857143*x^28.0-2.5172413793103448*x^29.0+2.5714285714285716/x^28.0+2.2903225806451615*x^31.0-2.1875*x^32.0+2.225806451612903/x^31.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "1848.0*x^23.0-1900.0*x^24.0+1950.0/x^27.0+1998.0*x^26.0-2044.0*x^27.0+2088.0/x^30.0+2130.0*x^29.0-2170.0*x^30.0+2208.0/x^33.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "1848.0*23.0*x^22.0-1900.0*24.0*x^23.0+1950.0*-27.0/x^28.0+1998.0*26.0*x^25.0-2044.0*27.0*x^26.0+2088.0*-30.0/x^31.0+2130.0*29.0*x^28.0-2170.0*30.0*x^29.0+2208.0*-33.0/x^34.0";
 UsageCalculus.EqnSolArrayMap2[2] = "42504.0*x^22.0-45600.0*x^23.0-52650.0/x^28.0+51948.0*x^25.0-55188.0*x^26.0-62640.0/x^31.0+61770.0*x^28.0-65100.0*x^29.0-72864.0/x^34.0";
 UsageCalculus.EqnSolArrayMap3[2] = "3.08*x^25.0-2.923076923076923*x^26.0+3.0/x^25.0+2.642857142857143*x^28.0-2.5172413793103448*x^29.0+2.5714285714285716/x^28.0+2.2903225806451615*x^31.0-2.1875*x^32.0+2.225806451612903/x^31.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "3.08/26.0*x^26.0-2.923076923076923/27.0*x^27.0+3.0/-24.0/x^24.0+2.642857142857143/29.0*x^29.0-2.5172413793103448/30.0*x^30.0+2.5714285714285716/-27.0/x^27.0+2.2903225806451615/32.0*x^32.0-2.1875/33.0*x^33.0+2.225806451612903/-30.0/x^30.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/8.441558441558442*x^26.0-1.0/9.23684210526316*x^27.0-1.0/8.0/x^24.0+1.0/10.972972972972974*x^29.0-1.0/11.917808219178083*x^30.0-1.0/10.5/x^27.0+1.0/13.971830985915492*x^32.0-1.0/15.085714285714285*x^33.0-1.0/13.478260869565219/x^30.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "42504.0*x^22.0-45600.0*x^23.0-52650.0/x^28.0+51948.0*x^25.0-55188.0*x^26.0-62640.0/x^31.0+61770.0*x^28.0-65100.0*x^29.0-72864.0/x^34.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "42504.0*22.0*x^21.0-45600.0*23.0*x^22.0-52650.0*-28.0/x^29.0+51948.0*25.0*x^24.0-55188.0*26.0*x^25.0-62640.0*-31.0/x^32.0+61770.0*28.0*x^27.0-65100.0*29.0*x^28.0-72864.0*-34.0/x^35.0";
 UsageCalculus.EqnSolArrayMap2[3] = "935088.0*x^21.0-1048800.0*x^22.0+1474200.0/x^29.0+1298700.0*x^24.0-1434888.0*x^25.0+1941840.0/x^32.0+1729560.0*x^27.0-1887900.0*x^28.0+2477376.0/x^35.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/8.441558441558442*x^26.0-1.0/9.23684210526316*x^27.0-1.0/8.0/x^24.0+1.0/10.972972972972974*x^29.0-1.0/11.917808219178083*x^30.0-1.0/10.5/x^27.0+1.0/13.971830985915492*x^32.0-1.0/15.085714285714285*x^33.0-1.0/13.478260869565219/x^30.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/8.441558441558442/27.0*x^27.0-1.0/9.23684210526316/28.0*x^28.0-1.0/8.0/-23.0/x^23.0+1.0/10.972972972972974/30.0*x^30.0-1.0/11.917808219178083/31.0*x^31.0-1.0/10.5/-26.0/x^26.0+1.0/13.971830985915492/33.0*x^33.0-1.0/15.085714285714285/34.0*x^34.0-1.0/13.478260869565219/-29.0/x^29.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/227.92207792207793*x^27.0-1.0/258.63157894736844*x^28.0+1.0/184.0/x^23.0+1.0/329.1891891891892*x^30.0-1.0/369.45205479452056*x^31.0+1.0/273.0/x^26.0+1.0/461.07042253521126*x^33.0-1.0/512.9142857142857*x^34.0+1.0/390.86956521739137/x^29.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "935088.0*x^21.0-1048800.0*x^22.0+1474200.0/x^29.0+1298700.0*x^24.0-1434888.0*x^25.0+1941840.0/x^32.0+1729560.0*x^27.0-1887900.0*x^28.0+2477376.0/x^35.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "935088.0*21.0*x^20.0-1048800.0*22.0*x^21.0+1474200.0*-29.0/x^30.0+1298700.0*24.0*x^23.0-1434888.0*25.0*x^24.0+1941840.0*-32.0/x^33.0+1729560.0*27.0*x^26.0-1887900.0*28.0*x^27.0+2477376.0*-35.0/x^36.0";
 UsageCalculus.EqnSolArrayMap2[4] = "1.9636848E7*x^20.0-2.30736E7*x^21.0-4.27518E7/x^30.0+3.11688E7*x^23.0-3.58722E7*x^24.0-6.213888E7/x^33.0+4.669812E7*x^26.0-5.28612E7*x^27.0-8.670816E7/x^36.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/227.92207792207793*x^27.0-1.0/258.63157894736844*x^28.0+1.0/184.0/x^23.0+1.0/329.1891891891892*x^30.0-1.0/369.45205479452056*x^31.0+1.0/273.0/x^26.0+1.0/461.07042253521126*x^33.0-1.0/512.9142857142857*x^34.0+1.0/390.86956521739137/x^29.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/227.92207792207793/28.0*x^28.0-1.0/258.63157894736844/29.0*x^29.0+1.0/184.0/-22.0/x^22.0+1.0/329.1891891891892/31.0*x^31.0-1.0/369.45205479452056/32.0*x^32.0+1.0/273.0/-25.0/x^25.0+1.0/461.07042253521126/34.0*x^34.0-1.0/512.9142857142857/35.0*x^35.0+1.0/390.86956521739137/-28.0/x^28.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/6381.818181818182*x^28.0-1.0/7500.315789473685*x^29.0-1.0/4048.0/x^22.0+1.0/10204.864864864865*x^31.0-1.0/11822.465753424658*x^32.0-1.0/6825.0/x^25.0+1.0/15676.394366197183*x^34.0-1.0/17952.0*x^35.0-1.0/10944.347826086958/x^28.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130425() {
 UsageCalculus.TestCase = 130425;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+76*-xyzx^25+75/-xyzx^26-74*-xyzx^27+73*-xyzx^28+72/-xyzx^29-71*-xyzx^30+70*-xyzx^31+69/-xyzx^32-68*-xyzx^33";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyzx";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-76.0*xyzx^25.0-75.0/xyzx^26.0+74.0*xyzx^27.0-73.0*xyzx^28.0-72.0/xyzx^29.0+71.0*xyzx^30.0-70.0*xyzx^31.0-69.0/xyzx^32.0+68.0*xyzx^33.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-76.0*25.0*xyzx^24.0-75.0*-26.0/xyzx^27.0+74.0*27.0*xyzx^26.0-73.0*28.0*xyzx^27.0-72.0*-29.0/xyzx^30.0+71.0*30.0*xyzx^29.0-70.0*31.0*xyzx^30.0-69.0*-32.0/xyzx^33.0+68.0*33.0*xyzx^32.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-1900.0*xyzx^24.0+1950.0/xyzx^27.0+1998.0*xyzx^26.0-2044.0*xyzx^27.0+2088.0/xyzx^30.0+2130.0*xyzx^29.0-2170.0*xyzx^30.0+2208.0/xyzx^33.0+2244.0*xyzx^32.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-76.0*xyzx^25.0-75.0/xyzx^26.0+74.0*xyzx^27.0-73.0*xyzx^28.0-72.0/xyzx^29.0+71.0*xyzx^30.0-70.0*xyzx^31.0-69.0/xyzx^32.0+68.0*xyzx^33.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-76.0/26.0*xyzx^26.0-75.0/-25.0/xyzx^25.0+74.0/28.0*xyzx^28.0-73.0/29.0*xyzx^29.0-72.0/-28.0/xyzx^28.0+71.0/31.0*xyzx^31.0-70.0/32.0*xyzx^32.0-69.0/-31.0/xyzx^31.0+68.0/34.0*xyzx^34.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-2.923076923076923*xyzx^26.0+3.0/xyzx^25.0+2.642857142857143*xyzx^28.0-2.5172413793103448*xyzx^29.0+2.5714285714285716/xyzx^28.0+2.2903225806451615*xyzx^31.0-2.1875*xyzx^32.0+2.225806451612903/xyzx^31.0+2.0*xyzx^34.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-1900.0*xyzx^24.0+1950.0/xyzx^27.0+1998.0*xyzx^26.0-2044.0*xyzx^27.0+2088.0/xyzx^30.0+2130.0*xyzx^29.0-2170.0*xyzx^30.0+2208.0/xyzx^33.0+2244.0*xyzx^32.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-1900.0*24.0*xyzx^23.0+1950.0*-27.0/xyzx^28.0+1998.0*26.0*xyzx^25.0-2044.0*27.0*xyzx^26.0+2088.0*-30.0/xyzx^31.0+2130.0*29.0*xyzx^28.0-2170.0*30.0*xyzx^29.0+2208.0*-33.0/xyzx^34.0+2244.0*32.0*xyzx^31.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-45600.0*xyzx^23.0-52650.0/xyzx^28.0+51948.0*xyzx^25.0-55188.0*xyzx^26.0-62640.0/xyzx^31.0+61770.0*xyzx^28.0-65100.0*xyzx^29.0-72864.0/xyzx^34.0+71808.0*xyzx^31.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-2.923076923076923*xyzx^26.0+3.0/xyzx^25.0+2.642857142857143*xyzx^28.0-2.5172413793103448*xyzx^29.0+2.5714285714285716/xyzx^28.0+2.2903225806451615*xyzx^31.0-2.1875*xyzx^32.0+2.225806451612903/xyzx^31.0+2.0*xyzx^34.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-2.923076923076923/27.0*xyzx^27.0+3.0/-24.0/xyzx^24.0+2.642857142857143/29.0*xyzx^29.0-2.5172413793103448/30.0*xyzx^30.0+2.5714285714285716/-27.0/xyzx^27.0+2.2903225806451615/32.0*xyzx^32.0-2.1875/33.0*xyzx^33.0+2.225806451612903/-30.0/xyzx^30.0+2.0/35.0*xyzx^35.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/9.23684210526316*xyzx^27.0-1.0/8.0/xyzx^24.0+1.0/10.972972972972974*xyzx^29.0-1.0/11.917808219178083*xyzx^30.0-1.0/10.5/xyzx^27.0+1.0/13.971830985915492*xyzx^32.0-1.0/15.085714285714285*xyzx^33.0-1.0/13.478260869565219/xyzx^30.0+1.0/17.5*xyzx^35.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-45600.0*xyzx^23.0-52650.0/xyzx^28.0+51948.0*xyzx^25.0-55188.0*xyzx^26.0-62640.0/xyzx^31.0+61770.0*xyzx^28.0-65100.0*xyzx^29.0-72864.0/xyzx^34.0+71808.0*xyzx^31.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-45600.0*23.0*xyzx^22.0-52650.0*-28.0/xyzx^29.0+51948.0*25.0*xyzx^24.0-55188.0*26.0*xyzx^25.0-62640.0*-31.0/xyzx^32.0+61770.0*28.0*xyzx^27.0-65100.0*29.0*xyzx^28.0-72864.0*-34.0/xyzx^35.0+71808.0*31.0*xyzx^30.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-1048800.0*xyzx^22.0+1474200.0/xyzx^29.0+1298700.0*xyzx^24.0-1434888.0*xyzx^25.0+1941840.0/xyzx^32.0+1729560.0*xyzx^27.0-1887900.0*xyzx^28.0+2477376.0/xyzx^35.0+2226048.0*xyzx^30.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/9.23684210526316*xyzx^27.0-1.0/8.0/xyzx^24.0+1.0/10.972972972972974*xyzx^29.0-1.0/11.917808219178083*xyzx^30.0-1.0/10.5/xyzx^27.0+1.0/13.971830985915492*xyzx^32.0-1.0/15.085714285714285*xyzx^33.0-1.0/13.478260869565219/xyzx^30.0+1.0/17.5*xyzx^35.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/9.23684210526316/28.0*xyzx^28.0-1.0/8.0/-23.0/xyzx^23.0+1.0/10.972972972972974/30.0*xyzx^30.0-1.0/11.917808219178083/31.0*xyzx^31.0-1.0/10.5/-26.0/xyzx^26.0+1.0/13.971830985915492/33.0*xyzx^33.0-1.0/15.085714285714285/34.0*xyzx^34.0-1.0/13.478260869565219/-29.0/xyzx^29.0+1.0/17.5/36.0*xyzx^36.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/258.63157894736844*xyzx^28.0+1.0/184.0/xyzx^23.0+1.0/329.1891891891892*xyzx^30.0-1.0/369.45205479452056*xyzx^31.0+1.0/273.0/xyzx^26.0+1.0/461.07042253521126*xyzx^33.0-1.0/512.9142857142857*xyzx^34.0+1.0/390.86956521739137/xyzx^29.0+1.0/630.0*xyzx^36.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-1048800.0*xyzx^22.0+1474200.0/xyzx^29.0+1298700.0*xyzx^24.0-1434888.0*xyzx^25.0+1941840.0/xyzx^32.0+1729560.0*xyzx^27.0-1887900.0*xyzx^28.0+2477376.0/xyzx^35.0+2226048.0*xyzx^30.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-1048800.0*22.0*xyzx^21.0+1474200.0*-29.0/xyzx^30.0+1298700.0*24.0*xyzx^23.0-1434888.0*25.0*xyzx^24.0+1941840.0*-32.0/xyzx^33.0+1729560.0*27.0*xyzx^26.0-1887900.0*28.0*xyzx^27.0+2477376.0*-35.0/xyzx^36.0+2226048.0*30.0*xyzx^29.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-2.30736E7*xyzx^21.0-4.27518E7/xyzx^30.0+3.11688E7*xyzx^23.0-3.58722E7*xyzx^24.0-6.213888E7/xyzx^33.0+4.669812E7*xyzx^26.0-5.28612E7*xyzx^27.0-8.670816E7/xyzx^36.0+6.678144E7*xyzx^29.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/258.63157894736844*xyzx^28.0+1.0/184.0/xyzx^23.0+1.0/329.1891891891892*xyzx^30.0-1.0/369.45205479452056*xyzx^31.0+1.0/273.0/xyzx^26.0+1.0/461.07042253521126*xyzx^33.0-1.0/512.9142857142857*xyzx^34.0+1.0/390.86956521739137/xyzx^29.0+1.0/630.0*xyzx^36.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/258.63157894736844/29.0*xyzx^29.0+1.0/184.0/-22.0/xyzx^22.0+1.0/329.1891891891892/31.0*xyzx^31.0-1.0/369.45205479452056/32.0*xyzx^32.0+1.0/273.0/-25.0/xyzx^25.0+1.0/461.07042253521126/34.0*xyzx^34.0-1.0/512.9142857142857/35.0*xyzx^35.0+1.0/390.86956521739137/-28.0/xyzx^28.0+1.0/630.0/37.0*xyzx^37.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/7500.315789473685*xyzx^29.0-1.0/4048.0/xyzx^22.0+1.0/10204.864864864865*xyzx^31.0-1.0/11822.465753424658*xyzx^32.0-1.0/6825.0/xyzx^25.0+1.0/15676.394366197183*xyzx^34.0-1.0/17952.0*xyzx^35.0-1.0/10944.347826086958/xyzx^28.0+1.0/23310.0*xyzx^37.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130426() {
 UsageCalculus.TestCase = 130426;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+75/-x^26-74*-x^27+73*-x^28+72/-x^29-71*-x^30+70*-x^31+69/-x^32-68*-x^33+67*-x^34";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-75.0/x^26.0+74.0*x^27.0-73.0*x^28.0-72.0/x^29.0+71.0*x^30.0-70.0*x^31.0-69.0/x^32.0+68.0*x^33.0-67.0*x^34.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-75.0*-26.0/x^27.0+74.0*27.0*x^26.0-73.0*28.0*x^27.0-72.0*-29.0/x^30.0+71.0*30.0*x^29.0-70.0*31.0*x^30.0-69.0*-32.0/x^33.0+68.0*33.0*x^32.0-67.0*34.0*x^33.0";
 UsageCalculus.EqnSolArrayMap2[1] = "1950.0/x^27.0+1998.0*x^26.0-2044.0*x^27.0+2088.0/x^30.0+2130.0*x^29.0-2170.0*x^30.0+2208.0/x^33.0+2244.0*x^32.0-2278.0*x^33.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-75.0/x^26.0+74.0*x^27.0-73.0*x^28.0-72.0/x^29.0+71.0*x^30.0-70.0*x^31.0-69.0/x^32.0+68.0*x^33.0-67.0*x^34.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-75.0/-25.0/x^25.0+74.0/28.0*x^28.0-73.0/29.0*x^29.0-72.0/-28.0/x^28.0+71.0/31.0*x^31.0-70.0/32.0*x^32.0-69.0/-31.0/x^31.0+68.0/34.0*x^34.0-67.0/35.0*x^35.0";
 UsageCalculus.EqnSolArrayMap4[1] = "3.0/x^25.0+2.642857142857143*x^28.0-2.5172413793103448*x^29.0+2.5714285714285716/x^28.0+2.2903225806451615*x^31.0-2.1875*x^32.0+2.225806451612903/x^31.0+2.0*x^34.0-1.9142857142857144*x^35.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "1950.0/x^27.0+1998.0*x^26.0-2044.0*x^27.0+2088.0/x^30.0+2130.0*x^29.0-2170.0*x^30.0+2208.0/x^33.0+2244.0*x^32.0-2278.0*x^33.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "1950.0*-27.0/x^28.0+1998.0*26.0*x^25.0-2044.0*27.0*x^26.0+2088.0*-30.0/x^31.0+2130.0*29.0*x^28.0-2170.0*30.0*x^29.0+2208.0*-33.0/x^34.0+2244.0*32.0*x^31.0-2278.0*33.0*x^32.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-52650.0/x^28.0+51948.0*x^25.0-55188.0*x^26.0-62640.0/x^31.0+61770.0*x^28.0-65100.0*x^29.0-72864.0/x^34.0+71808.0*x^31.0-75174.0*x^32.0";
 UsageCalculus.EqnSolArrayMap3[2] = "3.0/x^25.0+2.642857142857143*x^28.0-2.5172413793103448*x^29.0+2.5714285714285716/x^28.0+2.2903225806451615*x^31.0-2.1875*x^32.0+2.225806451612903/x^31.0+2.0*x^34.0-1.9142857142857144*x^35.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "3.0/-24.0/x^24.0+2.642857142857143/29.0*x^29.0-2.5172413793103448/30.0*x^30.0+2.5714285714285716/-27.0/x^27.0+2.2903225806451615/32.0*x^32.0-2.1875/33.0*x^33.0+2.225806451612903/-30.0/x^30.0+2.0/35.0*x^35.0-1.9142857142857144/36.0*x^36.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/8.0/x^24.0+1.0/10.972972972972974*x^29.0-1.0/11.917808219178083*x^30.0-1.0/10.5/x^27.0+1.0/13.971830985915492*x^32.0-1.0/15.085714285714285*x^33.0-1.0/13.478260869565219/x^30.0+1.0/17.5*x^35.0-1.0/18.80597014925373*x^36.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-52650.0/x^28.0+51948.0*x^25.0-55188.0*x^26.0-62640.0/x^31.0+61770.0*x^28.0-65100.0*x^29.0-72864.0/x^34.0+71808.0*x^31.0-75174.0*x^32.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-52650.0*-28.0/x^29.0+51948.0*25.0*x^24.0-55188.0*26.0*x^25.0-62640.0*-31.0/x^32.0+61770.0*28.0*x^27.0-65100.0*29.0*x^28.0-72864.0*-34.0/x^35.0+71808.0*31.0*x^30.0-75174.0*32.0*x^31.0";
 UsageCalculus.EqnSolArrayMap2[3] = "1474200.0/x^29.0+1298700.0*x^24.0-1434888.0*x^25.0+1941840.0/x^32.0+1729560.0*x^27.0-1887900.0*x^28.0+2477376.0/x^35.0+2226048.0*x^30.0-2405568.0*x^31.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/8.0/x^24.0+1.0/10.972972972972974*x^29.0-1.0/11.917808219178083*x^30.0-1.0/10.5/x^27.0+1.0/13.971830985915492*x^32.0-1.0/15.085714285714285*x^33.0-1.0/13.478260869565219/x^30.0+1.0/17.5*x^35.0-1.0/18.80597014925373*x^36.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/8.0/-23.0/x^23.0+1.0/10.972972972972974/30.0*x^30.0-1.0/11.917808219178083/31.0*x^31.0-1.0/10.5/-26.0/x^26.0+1.0/13.971830985915492/33.0*x^33.0-1.0/15.085714285714285/34.0*x^34.0-1.0/13.478260869565219/-29.0/x^29.0+1.0/17.5/36.0*x^36.0-1.0/18.80597014925373/37.0*x^37.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/184.0/x^23.0+1.0/329.1891891891892*x^30.0-1.0/369.45205479452056*x^31.0+1.0/273.0/x^26.0+1.0/461.07042253521126*x^33.0-1.0/512.9142857142857*x^34.0+1.0/390.86956521739137/x^29.0+1.0/630.0*x^36.0-1.0/695.820895522388*x^37.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "1474200.0/x^29.0+1298700.0*x^24.0-1434888.0*x^25.0+1941840.0/x^32.0+1729560.0*x^27.0-1887900.0*x^28.0+2477376.0/x^35.0+2226048.0*x^30.0-2405568.0*x^31.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "1474200.0*-29.0/x^30.0+1298700.0*24.0*x^23.0-1434888.0*25.0*x^24.0+1941840.0*-32.0/x^33.0+1729560.0*27.0*x^26.0-1887900.0*28.0*x^27.0+2477376.0*-35.0/x^36.0+2226048.0*30.0*x^29.0-2405568.0*31.0*x^30.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-4.27518E7/x^30.0+3.11688E7*x^23.0-3.58722E7*x^24.0-6.213888E7/x^33.0+4.669812E7*x^26.0-5.28612E7*x^27.0-8.670816E7/x^36.0+6.678144E7*x^29.0-7.4572608E7*x^30.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/184.0/x^23.0+1.0/329.1891891891892*x^30.0-1.0/369.45205479452056*x^31.0+1.0/273.0/x^26.0+1.0/461.07042253521126*x^33.0-1.0/512.9142857142857*x^34.0+1.0/390.86956521739137/x^29.0+1.0/630.0*x^36.0-1.0/695.820895522388*x^37.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/184.0/-22.0/x^22.0+1.0/329.1891891891892/31.0*x^31.0-1.0/369.45205479452056/32.0*x^32.0+1.0/273.0/-25.0/x^25.0+1.0/461.07042253521126/34.0*x^34.0-1.0/512.9142857142857/35.0*x^35.0+1.0/390.86956521739137/-28.0/x^28.0+1.0/630.0/37.0*x^37.0-1.0/695.820895522388/38.0*x^38.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/4048.0/x^22.0+1.0/10204.864864864865*x^31.0-1.0/11822.465753424658*x^32.0-1.0/6825.0/x^25.0+1.0/15676.394366197183*x^34.0-1.0/17952.0*x^35.0-1.0/10944.347826086958/x^28.0+1.0/23310.0*x^37.0-1.0/26441.194029850743*x^38.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130427() {
 UsageCalculus.TestCase = 130427;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-74*-xy^27+73*-xy^28+72/-xy^29-71*-xy^30+70*-xy^31+69/-xy^32-68*-xy^33+67*-xy^34+66/-xy^35";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "74.0*xy^27.0-73.0*xy^28.0-72.0/xy^29.0+71.0*xy^30.0-70.0*xy^31.0-69.0/xy^32.0+68.0*xy^33.0-67.0*xy^34.0-66.0/xy^35.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "74.0*27.0*xy^26.0-73.0*28.0*xy^27.0-72.0*-29.0/xy^30.0+71.0*30.0*xy^29.0-70.0*31.0*xy^30.0-69.0*-32.0/xy^33.0+68.0*33.0*xy^32.0-67.0*34.0*xy^33.0-66.0*-35.0/xy^36.0";
 UsageCalculus.EqnSolArrayMap2[1] = "1998.0*xy^26.0-2044.0*xy^27.0+2088.0/xy^30.0+2130.0*xy^29.0-2170.0*xy^30.0+2208.0/xy^33.0+2244.0*xy^32.0-2278.0*xy^33.0+2310.0/xy^36.0";
 UsageCalculus.EqnSolArrayMap3[1] = "74.0*xy^27.0-73.0*xy^28.0-72.0/xy^29.0+71.0*xy^30.0-70.0*xy^31.0-69.0/xy^32.0+68.0*xy^33.0-67.0*xy^34.0-66.0/xy^35.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "74.0/28.0*xy^28.0-73.0/29.0*xy^29.0-72.0/-28.0/xy^28.0+71.0/31.0*xy^31.0-70.0/32.0*xy^32.0-69.0/-31.0/xy^31.0+68.0/34.0*xy^34.0-67.0/35.0*xy^35.0-66.0/-34.0/xy^34.0";
 UsageCalculus.EqnSolArrayMap4[1] = "2.642857142857143*xy^28.0-2.5172413793103448*xy^29.0+2.5714285714285716/xy^28.0+2.2903225806451615*xy^31.0-2.1875*xy^32.0+2.225806451612903/xy^31.0+2.0*xy^34.0-1.9142857142857144*xy^35.0+1.9411764705882353/xy^34.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "1998.0*xy^26.0-2044.0*xy^27.0+2088.0/xy^30.0+2130.0*xy^29.0-2170.0*xy^30.0+2208.0/xy^33.0+2244.0*xy^32.0-2278.0*xy^33.0+2310.0/xy^36.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "1998.0*26.0*xy^25.0-2044.0*27.0*xy^26.0+2088.0*-30.0/xy^31.0+2130.0*29.0*xy^28.0-2170.0*30.0*xy^29.0+2208.0*-33.0/xy^34.0+2244.0*32.0*xy^31.0-2278.0*33.0*xy^32.0+2310.0*-36.0/xy^37.0";
 UsageCalculus.EqnSolArrayMap2[2] = "51948.0*xy^25.0-55188.0*xy^26.0-62640.0/xy^31.0+61770.0*xy^28.0-65100.0*xy^29.0-72864.0/xy^34.0+71808.0*xy^31.0-75174.0*xy^32.0-83160.0/xy^37.0";
 UsageCalculus.EqnSolArrayMap3[2] = "2.642857142857143*xy^28.0-2.5172413793103448*xy^29.0+2.5714285714285716/xy^28.0+2.2903225806451615*xy^31.0-2.1875*xy^32.0+2.225806451612903/xy^31.0+2.0*xy^34.0-1.9142857142857144*xy^35.0+1.9411764705882353/xy^34.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "2.642857142857143/29.0*xy^29.0-2.5172413793103448/30.0*xy^30.0+2.5714285714285716/-27.0/xy^27.0+2.2903225806451615/32.0*xy^32.0-2.1875/33.0*xy^33.0+2.225806451612903/-30.0/xy^30.0+2.0/35.0*xy^35.0-1.9142857142857144/36.0*xy^36.0+1.9411764705882353/-33.0/xy^33.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/10.972972972972974*xy^29.0-1.0/11.917808219178083*xy^30.0-1.0/10.5/xy^27.0+1.0/13.971830985915492*xy^32.0-1.0/15.085714285714285*xy^33.0-1.0/13.478260869565219/xy^30.0+1.0/17.5*xy^35.0-1.0/18.80597014925373*xy^36.0-1.0/17.0/xy^33.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "51948.0*xy^25.0-55188.0*xy^26.0-62640.0/xy^31.0+61770.0*xy^28.0-65100.0*xy^29.0-72864.0/xy^34.0+71808.0*xy^31.0-75174.0*xy^32.0-83160.0/xy^37.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "51948.0*25.0*xy^24.0-55188.0*26.0*xy^25.0-62640.0*-31.0/xy^32.0+61770.0*28.0*xy^27.0-65100.0*29.0*xy^28.0-72864.0*-34.0/xy^35.0+71808.0*31.0*xy^30.0-75174.0*32.0*xy^31.0-83160.0*-37.0/xy^38.0";
 UsageCalculus.EqnSolArrayMap2[3] = "1298700.0*xy^24.0-1434888.0*xy^25.0+1941840.0/xy^32.0+1729560.0*xy^27.0-1887900.0*xy^28.0+2477376.0/xy^35.0+2226048.0*xy^30.0-2405568.0*xy^31.0+3076920.0/xy^38.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/10.972972972972974*xy^29.0-1.0/11.917808219178083*xy^30.0-1.0/10.5/xy^27.0+1.0/13.971830985915492*xy^32.0-1.0/15.085714285714285*xy^33.0-1.0/13.478260869565219/xy^30.0+1.0/17.5*xy^35.0-1.0/18.80597014925373*xy^36.0-1.0/17.0/xy^33.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/10.972972972972974/30.0*xy^30.0-1.0/11.917808219178083/31.0*xy^31.0-1.0/10.5/-26.0/xy^26.0+1.0/13.971830985915492/33.0*xy^33.0-1.0/15.085714285714285/34.0*xy^34.0-1.0/13.478260869565219/-29.0/xy^29.0+1.0/17.5/36.0*xy^36.0-1.0/18.80597014925373/37.0*xy^37.0-1.0/17.0/-32.0/xy^32.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/329.1891891891892*xy^30.0-1.0/369.45205479452056*xy^31.0+1.0/273.0/xy^26.0+1.0/461.07042253521126*xy^33.0-1.0/512.9142857142857*xy^34.0+1.0/390.86956521739137/xy^29.0+1.0/630.0*xy^36.0-1.0/695.820895522388*xy^37.0+1.0/544.0/xy^32.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "1298700.0*xy^24.0-1434888.0*xy^25.0+1941840.0/xy^32.0+1729560.0*xy^27.0-1887900.0*xy^28.0+2477376.0/xy^35.0+2226048.0*xy^30.0-2405568.0*xy^31.0+3076920.0/xy^38.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "1298700.0*24.0*xy^23.0-1434888.0*25.0*xy^24.0+1941840.0*-32.0/xy^33.0+1729560.0*27.0*xy^26.0-1887900.0*28.0*xy^27.0+2477376.0*-35.0/xy^36.0+2226048.0*30.0*xy^29.0-2405568.0*31.0*xy^30.0+3076920.0*-38.0/xy^39.0";
 UsageCalculus.EqnSolArrayMap2[4] = "3.11688E7*xy^23.0-3.58722E7*xy^24.0-6.213888E7/xy^33.0+4.669812E7*xy^26.0-5.28612E7*xy^27.0-8.670816E7/xy^36.0+6.678144E7*xy^29.0-7.4572608E7*xy^30.0-1.1692296E8/xy^39.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/329.1891891891892*xy^30.0-1.0/369.45205479452056*xy^31.0+1.0/273.0/xy^26.0+1.0/461.07042253521126*xy^33.0-1.0/512.9142857142857*xy^34.0+1.0/390.86956521739137/xy^29.0+1.0/630.0*xy^36.0-1.0/695.820895522388*xy^37.0+1.0/544.0/xy^32.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/329.1891891891892/31.0*xy^31.0-1.0/369.45205479452056/32.0*xy^32.0+1.0/273.0/-25.0/xy^25.0+1.0/461.07042253521126/34.0*xy^34.0-1.0/512.9142857142857/35.0*xy^35.0+1.0/390.86956521739137/-28.0/xy^28.0+1.0/630.0/37.0*xy^37.0-1.0/695.820895522388/38.0*xy^38.0+1.0/544.0/-31.0/xy^31.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/10204.864864864865*xy^31.0-1.0/11822.465753424658*xy^32.0-1.0/6825.0/xy^25.0+1.0/15676.394366197183*xy^34.0-1.0/17952.0*xy^35.0-1.0/10944.347826086958/xy^28.0+1.0/23310.0*xy^37.0-1.0/26441.194029850743*xy^38.0-1.0/16864.0/xy^31.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130428() {
 UsageCalculus.TestCase = 130428;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+73*-x^28+72/-x^29-71*-x^30+70*-x^31+69/-x^32-68*-x^33+67*-x^34+66/-x^35-65*-x^36";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-73.0*x^28.0-72.0/x^29.0+71.0*x^30.0-70.0*x^31.0-69.0/x^32.0+68.0*x^33.0-67.0*x^34.0-66.0/x^35.0+65.0*x^36.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-73.0*28.0*x^27.0-72.0*-29.0/x^30.0+71.0*30.0*x^29.0-70.0*31.0*x^30.0-69.0*-32.0/x^33.0+68.0*33.0*x^32.0-67.0*34.0*x^33.0-66.0*-35.0/x^36.0+65.0*36.0*x^35.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-2044.0*x^27.0+2088.0/x^30.0+2130.0*x^29.0-2170.0*x^30.0+2208.0/x^33.0+2244.0*x^32.0-2278.0*x^33.0+2310.0/x^36.0+2340.0*x^35.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-73.0*x^28.0-72.0/x^29.0+71.0*x^30.0-70.0*x^31.0-69.0/x^32.0+68.0*x^33.0-67.0*x^34.0-66.0/x^35.0+65.0*x^36.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-73.0/29.0*x^29.0-72.0/-28.0/x^28.0+71.0/31.0*x^31.0-70.0/32.0*x^32.0-69.0/-31.0/x^31.0+68.0/34.0*x^34.0-67.0/35.0*x^35.0-66.0/-34.0/x^34.0+65.0/37.0*x^37.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-2.5172413793103448*x^29.0+2.5714285714285716/x^28.0+2.2903225806451615*x^31.0-2.1875*x^32.0+2.225806451612903/x^31.0+2.0*x^34.0-1.9142857142857144*x^35.0+1.9411764705882353/x^34.0+1.7567567567567568*x^37.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-2044.0*x^27.0+2088.0/x^30.0+2130.0*x^29.0-2170.0*x^30.0+2208.0/x^33.0+2244.0*x^32.0-2278.0*x^33.0+2310.0/x^36.0+2340.0*x^35.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-2044.0*27.0*x^26.0+2088.0*-30.0/x^31.0+2130.0*29.0*x^28.0-2170.0*30.0*x^29.0+2208.0*-33.0/x^34.0+2244.0*32.0*x^31.0-2278.0*33.0*x^32.0+2310.0*-36.0/x^37.0+2340.0*35.0*x^34.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-55188.0*x^26.0-62640.0/x^31.0+61770.0*x^28.0-65100.0*x^29.0-72864.0/x^34.0+71808.0*x^31.0-75174.0*x^32.0-83160.0/x^37.0+81900.0*x^34.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-2.5172413793103448*x^29.0+2.5714285714285716/x^28.0+2.2903225806451615*x^31.0-2.1875*x^32.0+2.225806451612903/x^31.0+2.0*x^34.0-1.9142857142857144*x^35.0+1.9411764705882353/x^34.0+1.7567567567567568*x^37.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-2.5172413793103448/30.0*x^30.0+2.5714285714285716/-27.0/x^27.0+2.2903225806451615/32.0*x^32.0-2.1875/33.0*x^33.0+2.225806451612903/-30.0/x^30.0+2.0/35.0*x^35.0-1.9142857142857144/36.0*x^36.0+1.9411764705882353/-33.0/x^33.0+1.7567567567567568/38.0*x^38.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/11.917808219178083*x^30.0-1.0/10.5/x^27.0+1.0/13.971830985915492*x^32.0-1.0/15.085714285714285*x^33.0-1.0/13.478260869565219/x^30.0+1.0/17.5*x^35.0-1.0/18.80597014925373*x^36.0-1.0/17.0/x^33.0+1.0/21.63076923076923*x^38.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-55188.0*x^26.0-62640.0/x^31.0+61770.0*x^28.0-65100.0*x^29.0-72864.0/x^34.0+71808.0*x^31.0-75174.0*x^32.0-83160.0/x^37.0+81900.0*x^34.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-55188.0*26.0*x^25.0-62640.0*-31.0/x^32.0+61770.0*28.0*x^27.0-65100.0*29.0*x^28.0-72864.0*-34.0/x^35.0+71808.0*31.0*x^30.0-75174.0*32.0*x^31.0-83160.0*-37.0/x^38.0+81900.0*34.0*x^33.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-1434888.0*x^25.0+1941840.0/x^32.0+1729560.0*x^27.0-1887900.0*x^28.0+2477376.0/x^35.0+2226048.0*x^30.0-2405568.0*x^31.0+3076920.0/x^38.0+2784600.0*x^33.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/11.917808219178083*x^30.0-1.0/10.5/x^27.0+1.0/13.971830985915492*x^32.0-1.0/15.085714285714285*x^33.0-1.0/13.478260869565219/x^30.0+1.0/17.5*x^35.0-1.0/18.80597014925373*x^36.0-1.0/17.0/x^33.0+1.0/21.63076923076923*x^38.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/11.917808219178083/31.0*x^31.0-1.0/10.5/-26.0/x^26.0+1.0/13.971830985915492/33.0*x^33.0-1.0/15.085714285714285/34.0*x^34.0-1.0/13.478260869565219/-29.0/x^29.0+1.0/17.5/36.0*x^36.0-1.0/18.80597014925373/37.0*x^37.0-1.0/17.0/-32.0/x^32.0+1.0/21.63076923076923/39.0*x^39.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/369.45205479452056*x^31.0+1.0/273.0/x^26.0+1.0/461.07042253521126*x^33.0-1.0/512.9142857142857*x^34.0+1.0/390.86956521739137/x^29.0+1.0/630.0*x^36.0-1.0/695.820895522388*x^37.0+1.0/544.0/x^32.0+1.0/843.5999999999999*x^39.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-1434888.0*x^25.0+1941840.0/x^32.0+1729560.0*x^27.0-1887900.0*x^28.0+2477376.0/x^35.0+2226048.0*x^30.0-2405568.0*x^31.0+3076920.0/x^38.0+2784600.0*x^33.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-1434888.0*25.0*x^24.0+1941840.0*-32.0/x^33.0+1729560.0*27.0*x^26.0-1887900.0*28.0*x^27.0+2477376.0*-35.0/x^36.0+2226048.0*30.0*x^29.0-2405568.0*31.0*x^30.0+3076920.0*-38.0/x^39.0+2784600.0*33.0*x^32.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-3.58722E7*x^24.0-6.213888E7/x^33.0+4.669812E7*x^26.0-5.28612E7*x^27.0-8.670816E7/x^36.0+6.678144E7*x^29.0-7.4572608E7*x^30.0-1.1692296E8/x^39.0+9.18918E7*x^32.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/369.45205479452056*x^31.0+1.0/273.0/x^26.0+1.0/461.07042253521126*x^33.0-1.0/512.9142857142857*x^34.0+1.0/390.86956521739137/x^29.0+1.0/630.0*x^36.0-1.0/695.820895522388*x^37.0+1.0/544.0/x^32.0+1.0/843.5999999999999*x^39.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/369.45205479452056/32.0*x^32.0+1.0/273.0/-25.0/x^25.0+1.0/461.07042253521126/34.0*x^34.0-1.0/512.9142857142857/35.0*x^35.0+1.0/390.86956521739137/-28.0/x^28.0+1.0/630.0/37.0*x^37.0-1.0/695.820895522388/38.0*x^38.0+1.0/544.0/-31.0/x^31.0+1.0/843.5999999999999/40.0*x^40.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/11822.465753424658*x^32.0-1.0/6825.0/x^25.0+1.0/15676.394366197183*x^34.0-1.0/17952.0*x^35.0-1.0/10944.347826086958/x^28.0+1.0/23310.0*x^37.0-1.0/26441.194029850743*x^38.0-1.0/16864.0/x^31.0+1.0/33744.0*x^40.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130429() {
 UsageCalculus.TestCase = 130429;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+72/-xyzx^29-71*-xyzx^30+70*-xyzx^31+69/-xyzx^32-68*-xyzx^33+67*-xyzx^34+66/-xyzx^35-65*-xyzx^36+64*-xyzx^37";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyzx";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-72.0/xyzx^29.0+71.0*xyzx^30.0-70.0*xyzx^31.0-69.0/xyzx^32.0+68.0*xyzx^33.0-67.0*xyzx^34.0-66.0/xyzx^35.0+65.0*xyzx^36.0-64.0*xyzx^37.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-72.0*-29.0/xyzx^30.0+71.0*30.0*xyzx^29.0-70.0*31.0*xyzx^30.0-69.0*-32.0/xyzx^33.0+68.0*33.0*xyzx^32.0-67.0*34.0*xyzx^33.0-66.0*-35.0/xyzx^36.0+65.0*36.0*xyzx^35.0-64.0*37.0*xyzx^36.0";
 UsageCalculus.EqnSolArrayMap2[1] = "2088.0/xyzx^30.0+2130.0*xyzx^29.0-2170.0*xyzx^30.0+2208.0/xyzx^33.0+2244.0*xyzx^32.0-2278.0*xyzx^33.0+2310.0/xyzx^36.0+2340.0*xyzx^35.0-2368.0*xyzx^36.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-72.0/xyzx^29.0+71.0*xyzx^30.0-70.0*xyzx^31.0-69.0/xyzx^32.0+68.0*xyzx^33.0-67.0*xyzx^34.0-66.0/xyzx^35.0+65.0*xyzx^36.0-64.0*xyzx^37.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-72.0/-28.0/xyzx^28.0+71.0/31.0*xyzx^31.0-70.0/32.0*xyzx^32.0-69.0/-31.0/xyzx^31.0+68.0/34.0*xyzx^34.0-67.0/35.0*xyzx^35.0-66.0/-34.0/xyzx^34.0+65.0/37.0*xyzx^37.0-64.0/38.0*xyzx^38.0";
 UsageCalculus.EqnSolArrayMap4[1] = "2.5714285714285716/xyzx^28.0+2.2903225806451615*xyzx^31.0-2.1875*xyzx^32.0+2.225806451612903/xyzx^31.0+2.0*xyzx^34.0-1.9142857142857144*xyzx^35.0+1.9411764705882353/xyzx^34.0+1.7567567567567568*xyzx^37.0-1.6842105263157894*xyzx^38.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "2088.0/xyzx^30.0+2130.0*xyzx^29.0-2170.0*xyzx^30.0+2208.0/xyzx^33.0+2244.0*xyzx^32.0-2278.0*xyzx^33.0+2310.0/xyzx^36.0+2340.0*xyzx^35.0-2368.0*xyzx^36.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "2088.0*-30.0/xyzx^31.0+2130.0*29.0*xyzx^28.0-2170.0*30.0*xyzx^29.0+2208.0*-33.0/xyzx^34.0+2244.0*32.0*xyzx^31.0-2278.0*33.0*xyzx^32.0+2310.0*-36.0/xyzx^37.0+2340.0*35.0*xyzx^34.0-2368.0*36.0*xyzx^35.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-62640.0/xyzx^31.0+61770.0*xyzx^28.0-65100.0*xyzx^29.0-72864.0/xyzx^34.0+71808.0*xyzx^31.0-75174.0*xyzx^32.0-83160.0/xyzx^37.0+81900.0*xyzx^34.0-85248.0*xyzx^35.0";
 UsageCalculus.EqnSolArrayMap3[2] = "2.5714285714285716/xyzx^28.0+2.2903225806451615*xyzx^31.0-2.1875*xyzx^32.0+2.225806451612903/xyzx^31.0+2.0*xyzx^34.0-1.9142857142857144*xyzx^35.0+1.9411764705882353/xyzx^34.0+1.7567567567567568*xyzx^37.0-1.6842105263157894*xyzx^38.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "2.5714285714285716/-27.0/xyzx^27.0+2.2903225806451615/32.0*xyzx^32.0-2.1875/33.0*xyzx^33.0+2.225806451612903/-30.0/xyzx^30.0+2.0/35.0*xyzx^35.0-1.9142857142857144/36.0*xyzx^36.0+1.9411764705882353/-33.0/xyzx^33.0+1.7567567567567568/38.0*xyzx^38.0-1.6842105263157894/39.0*xyzx^39.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/10.5/xyzx^27.0+1.0/13.971830985915492*xyzx^32.0-1.0/15.085714285714285*xyzx^33.0-1.0/13.478260869565219/xyzx^30.0+1.0/17.5*xyzx^35.0-1.0/18.80597014925373*xyzx^36.0-1.0/17.0/xyzx^33.0+1.0/21.63076923076923*xyzx^38.0-1.0/23.15625*xyzx^39.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-62640.0/xyzx^31.0+61770.0*xyzx^28.0-65100.0*xyzx^29.0-72864.0/xyzx^34.0+71808.0*xyzx^31.0-75174.0*xyzx^32.0-83160.0/xyzx^37.0+81900.0*xyzx^34.0-85248.0*xyzx^35.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-62640.0*-31.0/xyzx^32.0+61770.0*28.0*xyzx^27.0-65100.0*29.0*xyzx^28.0-72864.0*-34.0/xyzx^35.0+71808.0*31.0*xyzx^30.0-75174.0*32.0*xyzx^31.0-83160.0*-37.0/xyzx^38.0+81900.0*34.0*xyzx^33.0-85248.0*35.0*xyzx^34.0";
 UsageCalculus.EqnSolArrayMap2[3] = "1941840.0/xyzx^32.0+1729560.0*xyzx^27.0-1887900.0*xyzx^28.0+2477376.0/xyzx^35.0+2226048.0*xyzx^30.0-2405568.0*xyzx^31.0+3076920.0/xyzx^38.0+2784600.0*xyzx^33.0-2983680.0*xyzx^34.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/10.5/xyzx^27.0+1.0/13.971830985915492*xyzx^32.0-1.0/15.085714285714285*xyzx^33.0-1.0/13.478260869565219/xyzx^30.0+1.0/17.5*xyzx^35.0-1.0/18.80597014925373*xyzx^36.0-1.0/17.0/xyzx^33.0+1.0/21.63076923076923*xyzx^38.0-1.0/23.15625*xyzx^39.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/10.5/-26.0/xyzx^26.0+1.0/13.971830985915492/33.0*xyzx^33.0-1.0/15.085714285714285/34.0*xyzx^34.0-1.0/13.478260869565219/-29.0/xyzx^29.0+1.0/17.5/36.0*xyzx^36.0-1.0/18.80597014925373/37.0*xyzx^37.0-1.0/17.0/-32.0/xyzx^32.0+1.0/21.63076923076923/39.0*xyzx^39.0-1.0/23.15625/40.0*xyzx^40.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/273.0/xyzx^26.0+1.0/461.07042253521126*xyzx^33.0-1.0/512.9142857142857*xyzx^34.0+1.0/390.86956521739137/xyzx^29.0+1.0/630.0*xyzx^36.0-1.0/695.820895522388*xyzx^37.0+1.0/544.0/xyzx^32.0+1.0/843.5999999999999*xyzx^39.0-1.0/926.25*xyzx^40.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "1941840.0/xyzx^32.0+1729560.0*xyzx^27.0-1887900.0*xyzx^28.0+2477376.0/xyzx^35.0+2226048.0*xyzx^30.0-2405568.0*xyzx^31.0+3076920.0/xyzx^38.0+2784600.0*xyzx^33.0-2983680.0*xyzx^34.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "1941840.0*-32.0/xyzx^33.0+1729560.0*27.0*xyzx^26.0-1887900.0*28.0*xyzx^27.0+2477376.0*-35.0/xyzx^36.0+2226048.0*30.0*xyzx^29.0-2405568.0*31.0*xyzx^30.0+3076920.0*-38.0/xyzx^39.0+2784600.0*33.0*xyzx^32.0-2983680.0*34.0*xyzx^33.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-6.213888E7/xyzx^33.0+4.669812E7*xyzx^26.0-5.28612E7*xyzx^27.0-8.670816E7/xyzx^36.0+6.678144E7*xyzx^29.0-7.4572608E7*xyzx^30.0-1.1692296E8/xyzx^39.0+9.18918E7*xyzx^32.0-1.0144512E8*xyzx^33.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/273.0/xyzx^26.0+1.0/461.07042253521126*xyzx^33.0-1.0/512.9142857142857*xyzx^34.0+1.0/390.86956521739137/xyzx^29.0+1.0/630.0*xyzx^36.0-1.0/695.820895522388*xyzx^37.0+1.0/544.0/xyzx^32.0+1.0/843.5999999999999*xyzx^39.0-1.0/926.25*xyzx^40.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/273.0/-25.0/xyzx^25.0+1.0/461.07042253521126/34.0*xyzx^34.0-1.0/512.9142857142857/35.0*xyzx^35.0+1.0/390.86956521739137/-28.0/xyzx^28.0+1.0/630.0/37.0*xyzx^37.0-1.0/695.820895522388/38.0*xyzx^38.0+1.0/544.0/-31.0/xyzx^31.0+1.0/843.5999999999999/40.0*xyzx^40.0-1.0/926.25/41.0*xyzx^41.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/6825.0/xyzx^25.0+1.0/15676.394366197183*xyzx^34.0-1.0/17952.0*xyzx^35.0-1.0/10944.347826086958/xyzx^28.0+1.0/23310.0*xyzx^37.0-1.0/26441.194029850743*xyzx^38.0-1.0/16864.0/xyzx^31.0+1.0/33744.0*xyzx^40.0-1.0/37976.25*xyzx^41.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130430() {
 UsageCalculus.TestCase = 130430;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-71*-x^30+70*-x^31+69/-x^32-68*-x^33+67*-x^34+66/-x^35-65*-x^36+64*-x^37+63/-x^38";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "71.0*x^30.0-70.0*x^31.0-69.0/x^32.0+68.0*x^33.0-67.0*x^34.0-66.0/x^35.0+65.0*x^36.0-64.0*x^37.0-63.0/x^38.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "71.0*30.0*x^29.0-70.0*31.0*x^30.0-69.0*-32.0/x^33.0+68.0*33.0*x^32.0-67.0*34.0*x^33.0-66.0*-35.0/x^36.0+65.0*36.0*x^35.0-64.0*37.0*x^36.0-63.0*-38.0/x^39.0";
 UsageCalculus.EqnSolArrayMap2[1] = "2130.0*x^29.0-2170.0*x^30.0+2208.0/x^33.0+2244.0*x^32.0-2278.0*x^33.0+2310.0/x^36.0+2340.0*x^35.0-2368.0*x^36.0+2394.0/x^39.0";
 UsageCalculus.EqnSolArrayMap3[1] = "71.0*x^30.0-70.0*x^31.0-69.0/x^32.0+68.0*x^33.0-67.0*x^34.0-66.0/x^35.0+65.0*x^36.0-64.0*x^37.0-63.0/x^38.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "71.0/31.0*x^31.0-70.0/32.0*x^32.0-69.0/-31.0/x^31.0+68.0/34.0*x^34.0-67.0/35.0*x^35.0-66.0/-34.0/x^34.0+65.0/37.0*x^37.0-64.0/38.0*x^38.0-63.0/-37.0/x^37.0";
 UsageCalculus.EqnSolArrayMap4[1] = "2.2903225806451615*x^31.0-2.1875*x^32.0+2.225806451612903/x^31.0+2.0*x^34.0-1.9142857142857144*x^35.0+1.9411764705882353/x^34.0+1.7567567567567568*x^37.0-1.6842105263157894*x^38.0+1.7027027027027026/x^37.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "2130.0*x^29.0-2170.0*x^30.0+2208.0/x^33.0+2244.0*x^32.0-2278.0*x^33.0+2310.0/x^36.0+2340.0*x^35.0-2368.0*x^36.0+2394.0/x^39.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "2130.0*29.0*x^28.0-2170.0*30.0*x^29.0+2208.0*-33.0/x^34.0+2244.0*32.0*x^31.0-2278.0*33.0*x^32.0+2310.0*-36.0/x^37.0+2340.0*35.0*x^34.0-2368.0*36.0*x^35.0+2394.0*-39.0/x^40.0";
 UsageCalculus.EqnSolArrayMap2[2] = "61770.0*x^28.0-65100.0*x^29.0-72864.0/x^34.0+71808.0*x^31.0-75174.0*x^32.0-83160.0/x^37.0+81900.0*x^34.0-85248.0*x^35.0-93366.0/x^40.0";
 UsageCalculus.EqnSolArrayMap3[2] = "2.2903225806451615*x^31.0-2.1875*x^32.0+2.225806451612903/x^31.0+2.0*x^34.0-1.9142857142857144*x^35.0+1.9411764705882353/x^34.0+1.7567567567567568*x^37.0-1.6842105263157894*x^38.0+1.7027027027027026/x^37.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "2.2903225806451615/32.0*x^32.0-2.1875/33.0*x^33.0+2.225806451612903/-30.0/x^30.0+2.0/35.0*x^35.0-1.9142857142857144/36.0*x^36.0+1.9411764705882353/-33.0/x^33.0+1.7567567567567568/38.0*x^38.0-1.6842105263157894/39.0*x^39.0+1.7027027027027026/-36.0/x^36.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/13.971830985915492*x^32.0-1.0/15.085714285714285*x^33.0-1.0/13.478260869565219/x^30.0+1.0/17.5*x^35.0-1.0/18.80597014925373*x^36.0-1.0/17.0/x^33.0+1.0/21.63076923076923*x^38.0-1.0/23.15625*x^39.0-1.0/21.142857142857142/x^36.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "61770.0*x^28.0-65100.0*x^29.0-72864.0/x^34.0+71808.0*x^31.0-75174.0*x^32.0-83160.0/x^37.0+81900.0*x^34.0-85248.0*x^35.0-93366.0/x^40.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "61770.0*28.0*x^27.0-65100.0*29.0*x^28.0-72864.0*-34.0/x^35.0+71808.0*31.0*x^30.0-75174.0*32.0*x^31.0-83160.0*-37.0/x^38.0+81900.0*34.0*x^33.0-85248.0*35.0*x^34.0-93366.0*-40.0/x^41.0";
 UsageCalculus.EqnSolArrayMap2[3] = "1729560.0*x^27.0-1887900.0*x^28.0+2477376.0/x^35.0+2226048.0*x^30.0-2405568.0*x^31.0+3076920.0/x^38.0+2784600.0*x^33.0-2983680.0*x^34.0+3734640.0/x^41.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/13.971830985915492*x^32.0-1.0/15.085714285714285*x^33.0-1.0/13.478260869565219/x^30.0+1.0/17.5*x^35.0-1.0/18.80597014925373*x^36.0-1.0/17.0/x^33.0+1.0/21.63076923076923*x^38.0-1.0/23.15625*x^39.0-1.0/21.142857142857142/x^36.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/13.971830985915492/33.0*x^33.0-1.0/15.085714285714285/34.0*x^34.0-1.0/13.478260869565219/-29.0/x^29.0+1.0/17.5/36.0*x^36.0-1.0/18.80597014925373/37.0*x^37.0-1.0/17.0/-32.0/x^32.0+1.0/21.63076923076923/39.0*x^39.0-1.0/23.15625/40.0*x^40.0-1.0/21.142857142857142/-35.0/x^35.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/461.07042253521126*x^33.0-1.0/512.9142857142857*x^34.0+1.0/390.86956521739137/x^29.0+1.0/630.0*x^36.0-1.0/695.820895522388*x^37.0+1.0/544.0/x^32.0+1.0/843.5999999999999*x^39.0-1.0/926.25*x^40.0+1.0/740.0/x^35.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "1729560.0*x^27.0-1887900.0*x^28.0+2477376.0/x^35.0+2226048.0*x^30.0-2405568.0*x^31.0+3076920.0/x^38.0+2784600.0*x^33.0-2983680.0*x^34.0+3734640.0/x^41.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "1729560.0*27.0*x^26.0-1887900.0*28.0*x^27.0+2477376.0*-35.0/x^36.0+2226048.0*30.0*x^29.0-2405568.0*31.0*x^30.0+3076920.0*-38.0/x^39.0+2784600.0*33.0*x^32.0-2983680.0*34.0*x^33.0+3734640.0*-41.0/x^42.0";
 UsageCalculus.EqnSolArrayMap2[4] = "4.669812E7*x^26.0-5.28612E7*x^27.0-8.670816E7/x^36.0+6.678144E7*x^29.0-7.4572608E7*x^30.0-1.1692296E8/x^39.0+9.18918E7*x^32.0-1.0144512E8*x^33.0-1.5312024E8/x^42.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/461.07042253521126*x^33.0-1.0/512.9142857142857*x^34.0+1.0/390.86956521739137/x^29.0+1.0/630.0*x^36.0-1.0/695.820895522388*x^37.0+1.0/544.0/x^32.0+1.0/843.5999999999999*x^39.0-1.0/926.25*x^40.0+1.0/740.0/x^35.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/461.07042253521126/34.0*x^34.0-1.0/512.9142857142857/35.0*x^35.0+1.0/390.86956521739137/-28.0/x^28.0+1.0/630.0/37.0*x^37.0-1.0/695.820895522388/38.0*x^38.0+1.0/544.0/-31.0/x^31.0+1.0/843.5999999999999/40.0*x^40.0-1.0/926.25/41.0*x^41.0+1.0/740.0/-34.0/x^34.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/15676.394366197183*x^34.0-1.0/17952.0*x^35.0-1.0/10944.347826086958/x^28.0+1.0/23310.0*x^37.0-1.0/26441.194029850743*x^38.0-1.0/16864.0/x^31.0+1.0/33744.0*x^40.0-1.0/37976.25*x^41.0-1.0/25160.0/x^34.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130431() {
 UsageCalculus.TestCase = 130431;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+70*-xy^31+69/-xy^32-68*-xy^33+67*-xy^34+66/-xy^35-65*-xy^36+64*-xy^37+63/-xy^38-62*-xy^39";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-70.0*xy^31.0-69.0/xy^32.0+68.0*xy^33.0-67.0*xy^34.0-66.0/xy^35.0+65.0*xy^36.0-64.0*xy^37.0-63.0/xy^38.0+62.0*xy^39.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-70.0*31.0*xy^30.0-69.0*-32.0/xy^33.0+68.0*33.0*xy^32.0-67.0*34.0*xy^33.0-66.0*-35.0/xy^36.0+65.0*36.0*xy^35.0-64.0*37.0*xy^36.0-63.0*-38.0/xy^39.0+62.0*39.0*xy^38.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-2170.0*xy^30.0+2208.0/xy^33.0+2244.0*xy^32.0-2278.0*xy^33.0+2310.0/xy^36.0+2340.0*xy^35.0-2368.0*xy^36.0+2394.0/xy^39.0+2418.0*xy^38.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-70.0*xy^31.0-69.0/xy^32.0+68.0*xy^33.0-67.0*xy^34.0-66.0/xy^35.0+65.0*xy^36.0-64.0*xy^37.0-63.0/xy^38.0+62.0*xy^39.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-70.0/32.0*xy^32.0-69.0/-31.0/xy^31.0+68.0/34.0*xy^34.0-67.0/35.0*xy^35.0-66.0/-34.0/xy^34.0+65.0/37.0*xy^37.0-64.0/38.0*xy^38.0-63.0/-37.0/xy^37.0+62.0/40.0*xy^40.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-2.1875*xy^32.0+2.225806451612903/xy^31.0+2.0*xy^34.0-1.9142857142857144*xy^35.0+1.9411764705882353/xy^34.0+1.7567567567567568*xy^37.0-1.6842105263157894*xy^38.0+1.7027027027027026/xy^37.0+1.55*xy^40.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-2170.0*xy^30.0+2208.0/xy^33.0+2244.0*xy^32.0-2278.0*xy^33.0+2310.0/xy^36.0+2340.0*xy^35.0-2368.0*xy^36.0+2394.0/xy^39.0+2418.0*xy^38.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-2170.0*30.0*xy^29.0+2208.0*-33.0/xy^34.0+2244.0*32.0*xy^31.0-2278.0*33.0*xy^32.0+2310.0*-36.0/xy^37.0+2340.0*35.0*xy^34.0-2368.0*36.0*xy^35.0+2394.0*-39.0/xy^40.0+2418.0*38.0*xy^37.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-65100.0*xy^29.0-72864.0/xy^34.0+71808.0*xy^31.0-75174.0*xy^32.0-83160.0/xy^37.0+81900.0*xy^34.0-85248.0*xy^35.0-93366.0/xy^40.0+91884.0*xy^37.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-2.1875*xy^32.0+2.225806451612903/xy^31.0+2.0*xy^34.0-1.9142857142857144*xy^35.0+1.9411764705882353/xy^34.0+1.7567567567567568*xy^37.0-1.6842105263157894*xy^38.0+1.7027027027027026/xy^37.0+1.55*xy^40.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-2.1875/33.0*xy^33.0+2.225806451612903/-30.0/xy^30.0+2.0/35.0*xy^35.0-1.9142857142857144/36.0*xy^36.0+1.9411764705882353/-33.0/xy^33.0+1.7567567567567568/38.0*xy^38.0-1.6842105263157894/39.0*xy^39.0+1.7027027027027026/-36.0/xy^36.0+1.55/41.0*xy^41.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/15.085714285714285*xy^33.0-1.0/13.478260869565219/xy^30.0+1.0/17.5*xy^35.0-1.0/18.80597014925373*xy^36.0-1.0/17.0/xy^33.0+1.0/21.63076923076923*xy^38.0-1.0/23.15625*xy^39.0-1.0/21.142857142857142/xy^36.0+1.0/26.451612903225804*xy^41.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-65100.0*xy^29.0-72864.0/xy^34.0+71808.0*xy^31.0-75174.0*xy^32.0-83160.0/xy^37.0+81900.0*xy^34.0-85248.0*xy^35.0-93366.0/xy^40.0+91884.0*xy^37.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-65100.0*29.0*xy^28.0-72864.0*-34.0/xy^35.0+71808.0*31.0*xy^30.0-75174.0*32.0*xy^31.0-83160.0*-37.0/xy^38.0+81900.0*34.0*xy^33.0-85248.0*35.0*xy^34.0-93366.0*-40.0/xy^41.0+91884.0*37.0*xy^36.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-1887900.0*xy^28.0+2477376.0/xy^35.0+2226048.0*xy^30.0-2405568.0*xy^31.0+3076920.0/xy^38.0+2784600.0*xy^33.0-2983680.0*xy^34.0+3734640.0/xy^41.0+3399708.0*xy^36.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/15.085714285714285*xy^33.0-1.0/13.478260869565219/xy^30.0+1.0/17.5*xy^35.0-1.0/18.80597014925373*xy^36.0-1.0/17.0/xy^33.0+1.0/21.63076923076923*xy^38.0-1.0/23.15625*xy^39.0-1.0/21.142857142857142/xy^36.0+1.0/26.451612903225804*xy^41.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/15.085714285714285/34.0*xy^34.0-1.0/13.478260869565219/-29.0/xy^29.0+1.0/17.5/36.0*xy^36.0-1.0/18.80597014925373/37.0*xy^37.0-1.0/17.0/-32.0/xy^32.0+1.0/21.63076923076923/39.0*xy^39.0-1.0/23.15625/40.0*xy^40.0-1.0/21.142857142857142/-35.0/xy^35.0+1.0/26.451612903225804/42.0*xy^42.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/512.9142857142857*xy^34.0+1.0/390.86956521739137/xy^29.0+1.0/630.0*xy^36.0-1.0/695.820895522388*xy^37.0+1.0/544.0/xy^32.0+1.0/843.5999999999999*xy^39.0-1.0/926.25*xy^40.0+1.0/740.0/xy^35.0+1.0/1110.9677419354837*xy^42.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-1887900.0*xy^28.0+2477376.0/xy^35.0+2226048.0*xy^30.0-2405568.0*xy^31.0+3076920.0/xy^38.0+2784600.0*xy^33.0-2983680.0*xy^34.0+3734640.0/xy^41.0+3399708.0*xy^36.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-1887900.0*28.0*xy^27.0+2477376.0*-35.0/xy^36.0+2226048.0*30.0*xy^29.0-2405568.0*31.0*xy^30.0+3076920.0*-38.0/xy^39.0+2784600.0*33.0*xy^32.0-2983680.0*34.0*xy^33.0+3734640.0*-41.0/xy^42.0+3399708.0*36.0*xy^35.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-5.28612E7*xy^27.0-8.670816E7/xy^36.0+6.678144E7*xy^29.0-7.4572608E7*xy^30.0-1.1692296E8/xy^39.0+9.18918E7*xy^32.0-1.0144512E8*xy^33.0-1.5312024E8/xy^42.0+1.22389488E8*xy^35.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/512.9142857142857*xy^34.0+1.0/390.86956521739137/xy^29.0+1.0/630.0*xy^36.0-1.0/695.820895522388*xy^37.0+1.0/544.0/xy^32.0+1.0/843.5999999999999*xy^39.0-1.0/926.25*xy^40.0+1.0/740.0/xy^35.0+1.0/1110.9677419354837*xy^42.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/512.9142857142857/35.0*xy^35.0+1.0/390.86956521739137/-28.0/xy^28.0+1.0/630.0/37.0*xy^37.0-1.0/695.820895522388/38.0*xy^38.0+1.0/544.0/-31.0/xy^31.0+1.0/843.5999999999999/40.0*xy^40.0-1.0/926.25/41.0*xy^41.0+1.0/740.0/-34.0/xy^34.0+1.0/1110.9677419354837/43.0*xy^43.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/17952.0*xy^35.0-1.0/10944.347826086958/xy^28.0+1.0/23310.0*xy^37.0-1.0/26441.194029850743*xy^38.0-1.0/16864.0/xy^31.0+1.0/33744.0*xy^40.0-1.0/37976.25*xy^41.0-1.0/25160.0/xy^34.0+1.0/47771.612903225796*xy^43.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130432() {
 UsageCalculus.TestCase = 130432;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+69/-x^32-68*-x^33+67*-x^34+66/-x^35-65*-x^36+64*-x^37+63/-x^38-62*-x^39+61";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-69.0/x^32.0+68.0*x^33.0-67.0*x^34.0-66.0/x^35.0+65.0*x^36.0-64.0*x^37.0-63.0/x^38.0+62.0*x^39.0+61.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-69.0*-32.0/x^33.0+68.0*33.0*x^32.0-67.0*34.0*x^33.0-66.0*-35.0/x^36.0+65.0*36.0*x^35.0-64.0*37.0*x^36.0-63.0*-38.0/x^39.0+62.0*39.0*x^38.0+61.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "2208.0/x^33.0+2244.0*x^32.0-2278.0*x^33.0+2310.0/x^36.0+2340.0*x^35.0-2368.0*x^36.0+2394.0/x^39.0+2418.0*x^38.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-69.0/x^32.0+68.0*x^33.0-67.0*x^34.0-66.0/x^35.0+65.0*x^36.0-64.0*x^37.0-63.0/x^38.0+62.0*x^39.0+61.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-69.0/-31.0/x^31.0+68.0/34.0*x^34.0-67.0/35.0*x^35.0-66.0/-34.0/x^34.0+65.0/37.0*x^37.0-64.0/38.0*x^38.0-63.0/-37.0/x^37.0+62.0/40.0*x^40.0+61.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "2.225806451612903/x^31.0+2.0*x^34.0-1.9142857142857144*x^35.0+1.9411764705882353/x^34.0+1.7567567567567568*x^37.0-1.6842105263157894*x^38.0+1.7027027027027026/x^37.0+1.55*x^40.0+61.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "2208.0/x^33.0+2244.0*x^32.0-2278.0*x^33.0+2310.0/x^36.0+2340.0*x^35.0-2368.0*x^36.0+2394.0/x^39.0+2418.0*x^38.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "2208.0*-33.0/x^34.0+2244.0*32.0*x^31.0-2278.0*33.0*x^32.0+2310.0*-36.0/x^37.0+2340.0*35.0*x^34.0-2368.0*36.0*x^35.0+2394.0*-39.0/x^40.0+2418.0*38.0*x^37.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-72864.0/x^34.0+71808.0*x^31.0-75174.0*x^32.0-83160.0/x^37.0+81900.0*x^34.0-85248.0*x^35.0-93366.0/x^40.0+91884.0*x^37.0";
 UsageCalculus.EqnSolArrayMap3[2] = "2.225806451612903/x^31.0+2.0*x^34.0-1.9142857142857144*x^35.0+1.9411764705882353/x^34.0+1.7567567567567568*x^37.0-1.6842105263157894*x^38.0+1.7027027027027026/x^37.0+1.55*x^40.0+61.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "2.225806451612903/-30.0/x^30.0+2.0/35.0*x^35.0-1.9142857142857144/36.0*x^36.0+1.9411764705882353/-33.0/x^33.0+1.7567567567567568/38.0*x^38.0-1.6842105263157894/39.0*x^39.0+1.7027027027027026/-36.0/x^36.0+1.55/41.0*x^41.0+61.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/13.478260869565219/x^30.0+1.0/17.5*x^35.0-1.0/18.80597014925373*x^36.0-1.0/17.0/x^33.0+1.0/21.63076923076923*x^38.0-1.0/23.15625*x^39.0-1.0/21.142857142857142/x^36.0+1.0/26.451612903225804*x^41.0+30.5*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-72864.0/x^34.0+71808.0*x^31.0-75174.0*x^32.0-83160.0/x^37.0+81900.0*x^34.0-85248.0*x^35.0-93366.0/x^40.0+91884.0*x^37.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-72864.0*-34.0/x^35.0+71808.0*31.0*x^30.0-75174.0*32.0*x^31.0-83160.0*-37.0/x^38.0+81900.0*34.0*x^33.0-85248.0*35.0*x^34.0-93366.0*-40.0/x^41.0+91884.0*37.0*x^36.0";
 UsageCalculus.EqnSolArrayMap2[3] = "2477376.0/x^35.0+2226048.0*x^30.0-2405568.0*x^31.0+3076920.0/x^38.0+2784600.0*x^33.0-2983680.0*x^34.0+3734640.0/x^41.0+3399708.0*x^36.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/13.478260869565219/x^30.0+1.0/17.5*x^35.0-1.0/18.80597014925373*x^36.0-1.0/17.0/x^33.0+1.0/21.63076923076923*x^38.0-1.0/23.15625*x^39.0-1.0/21.142857142857142/x^36.0+1.0/26.451612903225804*x^41.0+30.5*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/13.478260869565219/-29.0/x^29.0+1.0/17.5/36.0*x^36.0-1.0/18.80597014925373/37.0*x^37.0-1.0/17.0/-32.0/x^32.0+1.0/21.63076923076923/39.0*x^39.0-1.0/23.15625/40.0*x^40.0-1.0/21.142857142857142/-35.0/x^35.0+1.0/26.451612903225804/42.0*x^42.0+30.5/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/390.86956521739137/x^29.0+1.0/630.0*x^36.0-1.0/695.820895522388*x^37.0+1.0/544.0/x^32.0+1.0/843.5999999999999*x^39.0-1.0/926.25*x^40.0+1.0/740.0/x^35.0+1.0/1110.9677419354837*x^42.0+10.166666666666666*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "2477376.0/x^35.0+2226048.0*x^30.0-2405568.0*x^31.0+3076920.0/x^38.0+2784600.0*x^33.0-2983680.0*x^34.0+3734640.0/x^41.0+3399708.0*x^36.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "2477376.0*-35.0/x^36.0+2226048.0*30.0*x^29.0-2405568.0*31.0*x^30.0+3076920.0*-38.0/x^39.0+2784600.0*33.0*x^32.0-2983680.0*34.0*x^33.0+3734640.0*-41.0/x^42.0+3399708.0*36.0*x^35.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-8.670816E7/x^36.0+6.678144E7*x^29.0-7.4572608E7*x^30.0-1.1692296E8/x^39.0+9.18918E7*x^32.0-1.0144512E8*x^33.0-1.5312024E8/x^42.0+1.22389488E8*x^35.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/390.86956521739137/x^29.0+1.0/630.0*x^36.0-1.0/695.820895522388*x^37.0+1.0/544.0/x^32.0+1.0/843.5999999999999*x^39.0-1.0/926.25*x^40.0+1.0/740.0/x^35.0+1.0/1110.9677419354837*x^42.0+10.166666666666666*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/390.86956521739137/-28.0/x^28.0+1.0/630.0/37.0*x^37.0-1.0/695.820895522388/38.0*x^38.0+1.0/544.0/-31.0/x^31.0+1.0/843.5999999999999/40.0*x^40.0-1.0/926.25/41.0*x^41.0+1.0/740.0/-34.0/x^34.0+1.0/1110.9677419354837/43.0*x^43.0+10.166666666666666/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/10944.347826086958/x^28.0+1.0/23310.0*x^37.0-1.0/26441.194029850743*x^38.0-1.0/16864.0/x^31.0+1.0/33744.0*x^40.0-1.0/37976.25*x^41.0-1.0/25160.0/x^34.0+1.0/47771.612903225796*x^43.0+2.5416666666666665*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130433() {
 UsageCalculus.TestCase = 130433;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-68*-xyzx^33+67*-xyzx^34+66/-xyzx^35-65*-xyzx^36+64*-xyzx^37+63/-xyzx^38-62*-xyzx^39+61+60/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^41";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyzx";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "68.0*xyzx^33.0-67.0*xyzx^34.0-66.0/xyzx^35.0+65.0*xyzx^36.0-64.0*xyzx^37.0-63.0/xyzx^38.0+62.0*xyzx^39.0+61.0-60.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "68.0*33.0*xyzx^32.0-67.0*34.0*xyzx^33.0-66.0*-35.0/xyzx^36.0+65.0*36.0*xyzx^35.0-64.0*37.0*xyzx^36.0-63.0*-38.0/xyzx^39.0+62.0*39.0*xyzx^38.0+61.0*0.0-60.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "2244.0*xyzx^32.0-2278.0*xyzx^33.0+2310.0/xyzx^36.0+2340.0*xyzx^35.0-2368.0*xyzx^36.0+2394.0/xyzx^39.0+2418.0*xyzx^38.0";
 UsageCalculus.EqnSolArrayMap3[1] = "68.0*xyzx^33.0-67.0*xyzx^34.0-66.0/xyzx^35.0+65.0*xyzx^36.0-64.0*xyzx^37.0-63.0/xyzx^38.0+62.0*xyzx^39.0+61.0-60.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "68.0/34.0*xyzx^34.0-67.0/35.0*xyzx^35.0-66.0/-34.0/xyzx^34.0+65.0/37.0*xyzx^37.0-64.0/38.0*xyzx^38.0-63.0/-37.0/xyzx^37.0+62.0/40.0*xyzx^40.0+61.0*xyzx-60.0*xyzx";
 UsageCalculus.EqnSolArrayMap4[1] = "2.0*xyzx^34.0-1.9142857142857144*xyzx^35.0+1.9411764705882353/xyzx^34.0+1.7567567567567568*xyzx^37.0-1.6842105263157894*xyzx^38.0+1.7027027027027026/xyzx^37.0+1.55*xyzx^40.0+61.0*xyzx-60.0*xyzx";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "2244.0*xyzx^32.0-2278.0*xyzx^33.0+2310.0/xyzx^36.0+2340.0*xyzx^35.0-2368.0*xyzx^36.0+2394.0/xyzx^39.0+2418.0*xyzx^38.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "2244.0*32.0*xyzx^31.0-2278.0*33.0*xyzx^32.0+2310.0*-36.0/xyzx^37.0+2340.0*35.0*xyzx^34.0-2368.0*36.0*xyzx^35.0+2394.0*-39.0/xyzx^40.0+2418.0*38.0*xyzx^37.0";
 UsageCalculus.EqnSolArrayMap2[2] = "71808.0*xyzx^31.0-75174.0*xyzx^32.0-83160.0/xyzx^37.0+81900.0*xyzx^34.0-85248.0*xyzx^35.0-93366.0/xyzx^40.0+91884.0*xyzx^37.0";
 UsageCalculus.EqnSolArrayMap3[2] = "2.0*xyzx^34.0-1.9142857142857144*xyzx^35.0+1.9411764705882353/xyzx^34.0+1.7567567567567568*xyzx^37.0-1.6842105263157894*xyzx^38.0+1.7027027027027026/xyzx^37.0+1.55*xyzx^40.0+61.0*xyzx-60.0*xyzx";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "2.0/35.0*xyzx^35.0-1.9142857142857144/36.0*xyzx^36.0+1.9411764705882353/-33.0/xyzx^33.0+1.7567567567567568/38.0*xyzx^38.0-1.6842105263157894/39.0*xyzx^39.0+1.7027027027027026/-36.0/xyzx^36.0+1.55/41.0*xyzx^41.0+61.0/2.0*xyzx^2.0-60.0/2.0*xyzx^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/17.5*xyzx^35.0-1.0/18.80597014925373*xyzx^36.0-1.0/17.0/xyzx^33.0+1.0/21.63076923076923*xyzx^38.0-1.0/23.15625*xyzx^39.0-1.0/21.142857142857142/xyzx^36.0+1.0/26.451612903225804*xyzx^41.0+30.5*xyzx^2.0-30.0*xyzx^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "71808.0*xyzx^31.0-75174.0*xyzx^32.0-83160.0/xyzx^37.0+81900.0*xyzx^34.0-85248.0*xyzx^35.0-93366.0/xyzx^40.0+91884.0*xyzx^37.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "71808.0*31.0*xyzx^30.0-75174.0*32.0*xyzx^31.0-83160.0*-37.0/xyzx^38.0+81900.0*34.0*xyzx^33.0-85248.0*35.0*xyzx^34.0-93366.0*-40.0/xyzx^41.0+91884.0*37.0*xyzx^36.0";
 UsageCalculus.EqnSolArrayMap2[3] = "2226048.0*xyzx^30.0-2405568.0*xyzx^31.0+3076920.0/xyzx^38.0+2784600.0*xyzx^33.0-2983680.0*xyzx^34.0+3734640.0/xyzx^41.0+3399708.0*xyzx^36.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/17.5*xyzx^35.0-1.0/18.80597014925373*xyzx^36.0-1.0/17.0/xyzx^33.0+1.0/21.63076923076923*xyzx^38.0-1.0/23.15625*xyzx^39.0-1.0/21.142857142857142/xyzx^36.0+1.0/26.451612903225804*xyzx^41.0+30.5*xyzx^2.0-30.0*xyzx^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/17.5/36.0*xyzx^36.0-1.0/18.80597014925373/37.0*xyzx^37.0-1.0/17.0/-32.0/xyzx^32.0+1.0/21.63076923076923/39.0*xyzx^39.0-1.0/23.15625/40.0*xyzx^40.0-1.0/21.142857142857142/-35.0/xyzx^35.0+1.0/26.451612903225804/42.0*xyzx^42.0+30.5/3.0*xyzx^3.0-30.0/3.0*xyzx^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/630.0*xyzx^36.0-1.0/695.820895522388*xyzx^37.0+1.0/544.0/xyzx^32.0+1.0/843.5999999999999*xyzx^39.0-1.0/926.25*xyzx^40.0+1.0/740.0/xyzx^35.0+1.0/1110.9677419354837*xyzx^42.0+10.166666666666666*xyzx^3.0-10.0*xyzx^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "2226048.0*xyzx^30.0-2405568.0*xyzx^31.0+3076920.0/xyzx^38.0+2784600.0*xyzx^33.0-2983680.0*xyzx^34.0+3734640.0/xyzx^41.0+3399708.0*xyzx^36.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "2226048.0*30.0*xyzx^29.0-2405568.0*31.0*xyzx^30.0+3076920.0*-38.0/xyzx^39.0+2784600.0*33.0*xyzx^32.0-2983680.0*34.0*xyzx^33.0+3734640.0*-41.0/xyzx^42.0+3399708.0*36.0*xyzx^35.0";
 UsageCalculus.EqnSolArrayMap2[4] = "6.678144E7*xyzx^29.0-7.4572608E7*xyzx^30.0-1.1692296E8/xyzx^39.0+9.18918E7*xyzx^32.0-1.0144512E8*xyzx^33.0-1.5312024E8/xyzx^42.0+1.22389488E8*xyzx^35.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/630.0*xyzx^36.0-1.0/695.820895522388*xyzx^37.0+1.0/544.0/xyzx^32.0+1.0/843.5999999999999*xyzx^39.0-1.0/926.25*xyzx^40.0+1.0/740.0/xyzx^35.0+1.0/1110.9677419354837*xyzx^42.0+10.166666666666666*xyzx^3.0-10.0*xyzx^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/630.0/37.0*xyzx^37.0-1.0/695.820895522388/38.0*xyzx^38.0+1.0/544.0/-31.0/xyzx^31.0+1.0/843.5999999999999/40.0*xyzx^40.0-1.0/926.25/41.0*xyzx^41.0+1.0/740.0/-34.0/xyzx^34.0+1.0/1110.9677419354837/43.0*xyzx^43.0+10.166666666666666/4.0*xyzx^4.0-10.0/4.0*xyzx^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/23310.0*xyzx^37.0-1.0/26441.194029850743*xyzx^38.0-1.0/16864.0/xyzx^31.0+1.0/33744.0*xyzx^40.0-1.0/37976.25*xyzx^41.0-1.0/25160.0/xyzx^34.0+1.0/47771.612903225796*xyzx^43.0+2.5416666666666665*xyzx^4.0-2.5*xyzx^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130434() {
 UsageCalculus.TestCase = 130434;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+67*-x^34+66/-x^35-65*-x^36+64*-x^37+63/-x^38-62*-x^39+61+60/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^41-59*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-42";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-67.0*x^34.0-66.0/x^35.0+65.0*x^36.0-64.0*x^37.0-63.0/x^38.0+62.0*x^39.0+61.0-60.0+59.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-67.0*34.0*x^33.0-66.0*-35.0/x^36.0+65.0*36.0*x^35.0-64.0*37.0*x^36.0-63.0*-38.0/x^39.0+62.0*39.0*x^38.0+61.0*0.0-60.0*0.0+59.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-2278.0*x^33.0+2310.0/x^36.0+2340.0*x^35.0-2368.0*x^36.0+2394.0/x^39.0+2418.0*x^38.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-67.0*x^34.0-66.0/x^35.0+65.0*x^36.0-64.0*x^37.0-63.0/x^38.0+62.0*x^39.0+61.0-60.0+59.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-67.0/35.0*x^35.0-66.0/-34.0/x^34.0+65.0/37.0*x^37.0-64.0/38.0*x^38.0-63.0/-37.0/x^37.0+62.0/40.0*x^40.0+61.0*x-60.0*x+59.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.9142857142857144*x^35.0+1.9411764705882353/x^34.0+1.7567567567567568*x^37.0-1.6842105263157894*x^38.0+1.7027027027027026/x^37.0+1.55*x^40.0+61.0*x-60.0*x+59.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-2278.0*x^33.0+2310.0/x^36.0+2340.0*x^35.0-2368.0*x^36.0+2394.0/x^39.0+2418.0*x^38.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-2278.0*33.0*x^32.0+2310.0*-36.0/x^37.0+2340.0*35.0*x^34.0-2368.0*36.0*x^35.0+2394.0*-39.0/x^40.0+2418.0*38.0*x^37.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-75174.0*x^32.0-83160.0/x^37.0+81900.0*x^34.0-85248.0*x^35.0-93366.0/x^40.0+91884.0*x^37.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.9142857142857144*x^35.0+1.9411764705882353/x^34.0+1.7567567567567568*x^37.0-1.6842105263157894*x^38.0+1.7027027027027026/x^37.0+1.55*x^40.0+61.0*x-60.0*x+59.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.9142857142857144/36.0*x^36.0+1.9411764705882353/-33.0/x^33.0+1.7567567567567568/38.0*x^38.0-1.6842105263157894/39.0*x^39.0+1.7027027027027026/-36.0/x^36.0+1.55/41.0*x^41.0+61.0/2.0*x^2.0-60.0/2.0*x^2.0+59.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/18.80597014925373*x^36.0-1.0/17.0/x^33.0+1.0/21.63076923076923*x^38.0-1.0/23.15625*x^39.0-1.0/21.142857142857142/x^36.0+1.0/26.451612903225804*x^41.0+30.5*x^2.0-30.0*x^2.0+29.5*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-75174.0*x^32.0-83160.0/x^37.0+81900.0*x^34.0-85248.0*x^35.0-93366.0/x^40.0+91884.0*x^37.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-75174.0*32.0*x^31.0-83160.0*-37.0/x^38.0+81900.0*34.0*x^33.0-85248.0*35.0*x^34.0-93366.0*-40.0/x^41.0+91884.0*37.0*x^36.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-2405568.0*x^31.0+3076920.0/x^38.0+2784600.0*x^33.0-2983680.0*x^34.0+3734640.0/x^41.0+3399708.0*x^36.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/18.80597014925373*x^36.0-1.0/17.0/x^33.0+1.0/21.63076923076923*x^38.0-1.0/23.15625*x^39.0-1.0/21.142857142857142/x^36.0+1.0/26.451612903225804*x^41.0+30.5*x^2.0-30.0*x^2.0+29.5*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/18.80597014925373/37.0*x^37.0-1.0/17.0/-32.0/x^32.0+1.0/21.63076923076923/39.0*x^39.0-1.0/23.15625/40.0*x^40.0-1.0/21.142857142857142/-35.0/x^35.0+1.0/26.451612903225804/42.0*x^42.0+30.5/3.0*x^3.0-30.0/3.0*x^3.0+29.5/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/695.820895522388*x^37.0+1.0/544.0/x^32.0+1.0/843.5999999999999*x^39.0-1.0/926.25*x^40.0+1.0/740.0/x^35.0+1.0/1110.9677419354837*x^42.0+10.166666666666666*x^3.0-10.0*x^3.0+9.833333333333334*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-2405568.0*x^31.0+3076920.0/x^38.0+2784600.0*x^33.0-2983680.0*x^34.0+3734640.0/x^41.0+3399708.0*x^36.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-2405568.0*31.0*x^30.0+3076920.0*-38.0/x^39.0+2784600.0*33.0*x^32.0-2983680.0*34.0*x^33.0+3734640.0*-41.0/x^42.0+3399708.0*36.0*x^35.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-7.4572608E7*x^30.0-1.1692296E8/x^39.0+9.18918E7*x^32.0-1.0144512E8*x^33.0-1.5312024E8/x^42.0+1.22389488E8*x^35.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/695.820895522388*x^37.0+1.0/544.0/x^32.0+1.0/843.5999999999999*x^39.0-1.0/926.25*x^40.0+1.0/740.0/x^35.0+1.0/1110.9677419354837*x^42.0+10.166666666666666*x^3.0-10.0*x^3.0+9.833333333333334*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/695.820895522388/38.0*x^38.0+1.0/544.0/-31.0/x^31.0+1.0/843.5999999999999/40.0*x^40.0-1.0/926.25/41.0*x^41.0+1.0/740.0/-34.0/x^34.0+1.0/1110.9677419354837/43.0*x^43.0+10.166666666666666/4.0*x^4.0-10.0/4.0*x^4.0+9.833333333333334/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/26441.194029850743*x^38.0-1.0/16864.0/x^31.0+1.0/33744.0*x^40.0-1.0/37976.25*x^41.0-1.0/25160.0/x^34.0+1.0/47771.612903225796*x^43.0+2.5416666666666665*x^4.0-2.5*x^4.0+2.4583333333333335*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130435() {
 UsageCalculus.TestCase = 130435;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+66/-xy^35-65*-xy^36+64*-xy^37+63/-xy^38-62*-xy^39+61+60/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^41-59*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-42+58*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^43";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-66.0/xy^35.0+65.0*xy^36.0-64.0*xy^37.0-63.0/xy^38.0+62.0*xy^39.0+61.0-60.0+59.0-58.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-66.0*-35.0/xy^36.0+65.0*36.0*xy^35.0-64.0*37.0*xy^36.0-63.0*-38.0/xy^39.0+62.0*39.0*xy^38.0+61.0*0.0-60.0*0.0+59.0*0.0-58.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "2310.0/xy^36.0+2340.0*xy^35.0-2368.0*xy^36.0+2394.0/xy^39.0+2418.0*xy^38.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-66.0/xy^35.0+65.0*xy^36.0-64.0*xy^37.0-63.0/xy^38.0+62.0*xy^39.0+61.0-60.0+59.0-58.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-66.0/-34.0/xy^34.0+65.0/37.0*xy^37.0-64.0/38.0*xy^38.0-63.0/-37.0/xy^37.0+62.0/40.0*xy^40.0+61.0*xy-60.0*xy+59.0*xy-58.0*xy";
 UsageCalculus.EqnSolArrayMap4[1] = "1.9411764705882353/xy^34.0+1.7567567567567568*xy^37.0-1.6842105263157894*xy^38.0+1.7027027027027026/xy^37.0+1.55*xy^40.0+61.0*xy-60.0*xy+59.0*xy-58.0*xy";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "2310.0/xy^36.0+2340.0*xy^35.0-2368.0*xy^36.0+2394.0/xy^39.0+2418.0*xy^38.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "2310.0*-36.0/xy^37.0+2340.0*35.0*xy^34.0-2368.0*36.0*xy^35.0+2394.0*-39.0/xy^40.0+2418.0*38.0*xy^37.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-83160.0/xy^37.0+81900.0*xy^34.0-85248.0*xy^35.0-93366.0/xy^40.0+91884.0*xy^37.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.9411764705882353/xy^34.0+1.7567567567567568*xy^37.0-1.6842105263157894*xy^38.0+1.7027027027027026/xy^37.0+1.55*xy^40.0+61.0*xy-60.0*xy+59.0*xy-58.0*xy";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.9411764705882353/-33.0/xy^33.0+1.7567567567567568/38.0*xy^38.0-1.6842105263157894/39.0*xy^39.0+1.7027027027027026/-36.0/xy^36.0+1.55/41.0*xy^41.0+61.0/2.0*xy^2.0-60.0/2.0*xy^2.0+59.0/2.0*xy^2.0-58.0/2.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/17.0/xy^33.0+1.0/21.63076923076923*xy^38.0-1.0/23.15625*xy^39.0-1.0/21.142857142857142/xy^36.0+1.0/26.451612903225804*xy^41.0+30.5*xy^2.0-30.0*xy^2.0+29.5*xy^2.0-29.0*xy^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-83160.0/xy^37.0+81900.0*xy^34.0-85248.0*xy^35.0-93366.0/xy^40.0+91884.0*xy^37.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-83160.0*-37.0/xy^38.0+81900.0*34.0*xy^33.0-85248.0*35.0*xy^34.0-93366.0*-40.0/xy^41.0+91884.0*37.0*xy^36.0";
 UsageCalculus.EqnSolArrayMap2[3] = "3076920.0/xy^38.0+2784600.0*xy^33.0-2983680.0*xy^34.0+3734640.0/xy^41.0+3399708.0*xy^36.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/17.0/xy^33.0+1.0/21.63076923076923*xy^38.0-1.0/23.15625*xy^39.0-1.0/21.142857142857142/xy^36.0+1.0/26.451612903225804*xy^41.0+30.5*xy^2.0-30.0*xy^2.0+29.5*xy^2.0-29.0*xy^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/17.0/-32.0/xy^32.0+1.0/21.63076923076923/39.0*xy^39.0-1.0/23.15625/40.0*xy^40.0-1.0/21.142857142857142/-35.0/xy^35.0+1.0/26.451612903225804/42.0*xy^42.0+30.5/3.0*xy^3.0-30.0/3.0*xy^3.0+29.5/3.0*xy^3.0-29.0/3.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/544.0/xy^32.0+1.0/843.5999999999999*xy^39.0-1.0/926.25*xy^40.0+1.0/740.0/xy^35.0+1.0/1110.9677419354837*xy^42.0+10.166666666666666*xy^3.0-10.0*xy^3.0+9.833333333333334*xy^3.0-9.666666666666666*xy^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "3076920.0/xy^38.0+2784600.0*xy^33.0-2983680.0*xy^34.0+3734640.0/xy^41.0+3399708.0*xy^36.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "3076920.0*-38.0/xy^39.0+2784600.0*33.0*xy^32.0-2983680.0*34.0*xy^33.0+3734640.0*-41.0/xy^42.0+3399708.0*36.0*xy^35.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1.1692296E8/xy^39.0+9.18918E7*xy^32.0-1.0144512E8*xy^33.0-1.5312024E8/xy^42.0+1.22389488E8*xy^35.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/544.0/xy^32.0+1.0/843.5999999999999*xy^39.0-1.0/926.25*xy^40.0+1.0/740.0/xy^35.0+1.0/1110.9677419354837*xy^42.0+10.166666666666666*xy^3.0-10.0*xy^3.0+9.833333333333334*xy^3.0-9.666666666666666*xy^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/544.0/-31.0/xy^31.0+1.0/843.5999999999999/40.0*xy^40.0-1.0/926.25/41.0*xy^41.0+1.0/740.0/-34.0/xy^34.0+1.0/1110.9677419354837/43.0*xy^43.0+10.166666666666666/4.0*xy^4.0-10.0/4.0*xy^4.0+9.833333333333334/4.0*xy^4.0-9.666666666666666/4.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/16864.0/xy^31.0+1.0/33744.0*xy^40.0-1.0/37976.25*xy^41.0-1.0/25160.0/xy^34.0+1.0/47771.612903225796*xy^43.0+2.5416666666666665*xy^4.0-2.5*xy^4.0+2.4583333333333335*xy^4.0-2.4166666666666665*xy^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130436() {
 UsageCalculus.TestCase = 130436;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-65*-x^36+64*-x^37+63/-x^38-62*-x^39+61+60/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^41-59*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-42+58*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^43+57/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^44";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "65.0*x^36.0-64.0*x^37.0-63.0/x^38.0+62.0*x^39.0+61.0-60.0+59.0-58.0-57.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "65.0*36.0*x^35.0-64.0*37.0*x^36.0-63.0*-38.0/x^39.0+62.0*39.0*x^38.0+61.0*0.0-60.0*0.0+59.0*0.0-58.0*0.0-57.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "2340.0*x^35.0-2368.0*x^36.0+2394.0/x^39.0+2418.0*x^38.0";
 UsageCalculus.EqnSolArrayMap3[1] = "65.0*x^36.0-64.0*x^37.0-63.0/x^38.0+62.0*x^39.0+61.0-60.0+59.0-58.0-57.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "65.0/37.0*x^37.0-64.0/38.0*x^38.0-63.0/-37.0/x^37.0+62.0/40.0*x^40.0+61.0*x-60.0*x+59.0*x-58.0*x-57.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "1.7567567567567568*x^37.0-1.6842105263157894*x^38.0+1.7027027027027026/x^37.0+1.55*x^40.0+61.0*x-60.0*x+59.0*x-58.0*x-57.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "2340.0*x^35.0-2368.0*x^36.0+2394.0/x^39.0+2418.0*x^38.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "2340.0*35.0*x^34.0-2368.0*36.0*x^35.0+2394.0*-39.0/x^40.0+2418.0*38.0*x^37.0";
 UsageCalculus.EqnSolArrayMap2[2] = "81900.0*x^34.0-85248.0*x^35.0-93366.0/x^40.0+91884.0*x^37.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.7567567567567568*x^37.0-1.6842105263157894*x^38.0+1.7027027027027026/x^37.0+1.55*x^40.0+61.0*x-60.0*x+59.0*x-58.0*x-57.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.7567567567567568/38.0*x^38.0-1.6842105263157894/39.0*x^39.0+1.7027027027027026/-36.0/x^36.0+1.55/41.0*x^41.0+61.0/2.0*x^2.0-60.0/2.0*x^2.0+59.0/2.0*x^2.0-58.0/2.0*x^2.0-57.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/21.63076923076923*x^38.0-1.0/23.15625*x^39.0-1.0/21.142857142857142/x^36.0+1.0/26.451612903225804*x^41.0+30.5*x^2.0-30.0*x^2.0+29.5*x^2.0-29.0*x^2.0-28.5*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "81900.0*x^34.0-85248.0*x^35.0-93366.0/x^40.0+91884.0*x^37.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "81900.0*34.0*x^33.0-85248.0*35.0*x^34.0-93366.0*-40.0/x^41.0+91884.0*37.0*x^36.0";
 UsageCalculus.EqnSolArrayMap2[3] = "2784600.0*x^33.0-2983680.0*x^34.0+3734640.0/x^41.0+3399708.0*x^36.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/21.63076923076923*x^38.0-1.0/23.15625*x^39.0-1.0/21.142857142857142/x^36.0+1.0/26.451612903225804*x^41.0+30.5*x^2.0-30.0*x^2.0+29.5*x^2.0-29.0*x^2.0-28.5*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/21.63076923076923/39.0*x^39.0-1.0/23.15625/40.0*x^40.0-1.0/21.142857142857142/-35.0/x^35.0+1.0/26.451612903225804/42.0*x^42.0+30.5/3.0*x^3.0-30.0/3.0*x^3.0+29.5/3.0*x^3.0-29.0/3.0*x^3.0-28.5/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/843.5999999999999*x^39.0-1.0/926.25*x^40.0+1.0/740.0/x^35.0+1.0/1110.9677419354837*x^42.0+10.166666666666666*x^3.0-10.0*x^3.0+9.833333333333334*x^3.0-9.666666666666666*x^3.0-9.5*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "2784600.0*x^33.0-2983680.0*x^34.0+3734640.0/x^41.0+3399708.0*x^36.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "2784600.0*33.0*x^32.0-2983680.0*34.0*x^33.0+3734640.0*-41.0/x^42.0+3399708.0*36.0*x^35.0";
 UsageCalculus.EqnSolArrayMap2[4] = "9.18918E7*x^32.0-1.0144512E8*x^33.0-1.5312024E8/x^42.0+1.22389488E8*x^35.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/843.5999999999999*x^39.0-1.0/926.25*x^40.0+1.0/740.0/x^35.0+1.0/1110.9677419354837*x^42.0+10.166666666666666*x^3.0-10.0*x^3.0+9.833333333333334*x^3.0-9.666666666666666*x^3.0-9.5*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/843.5999999999999/40.0*x^40.0-1.0/926.25/41.0*x^41.0+1.0/740.0/-34.0/x^34.0+1.0/1110.9677419354837/43.0*x^43.0+10.166666666666666/4.0*x^4.0-10.0/4.0*x^4.0+9.833333333333334/4.0*x^4.0-9.666666666666666/4.0*x^4.0-9.5/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/33744.0*x^40.0-1.0/37976.25*x^41.0-1.0/25160.0/x^34.0+1.0/47771.612903225796*x^43.0+2.5416666666666665*x^4.0-2.5*x^4.0+2.4583333333333335*x^4.0-2.4166666666666665*x^4.0-2.375*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130437() {
 UsageCalculus.TestCase = 130437;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+64*-xyzx^37+63/-xyzx^38-62*-xyzx^39+61+60/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^41-59*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-42+58*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^43+57/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^44-56*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-45";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyzx";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-64.0*xyzx^37.0-63.0/xyzx^38.0+62.0*xyzx^39.0+61.0-60.0+59.0-58.0-57.0+56.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-64.0*37.0*xyzx^36.0-63.0*-38.0/xyzx^39.0+62.0*39.0*xyzx^38.0+61.0*0.0-60.0*0.0+59.0*0.0-58.0*0.0-57.0*0.0+56.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-2368.0*xyzx^36.0+2394.0/xyzx^39.0+2418.0*xyzx^38.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-64.0*xyzx^37.0-63.0/xyzx^38.0+62.0*xyzx^39.0+61.0-60.0+59.0-58.0-57.0+56.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-64.0/38.0*xyzx^38.0-63.0/-37.0/xyzx^37.0+62.0/40.0*xyzx^40.0+61.0*xyzx-60.0*xyzx+59.0*xyzx-58.0*xyzx-57.0*xyzx+56.0*xyzx";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.6842105263157894*xyzx^38.0+1.7027027027027026/xyzx^37.0+1.55*xyzx^40.0+61.0*xyzx-60.0*xyzx+59.0*xyzx-58.0*xyzx-57.0*xyzx+56.0*xyzx";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-2368.0*xyzx^36.0+2394.0/xyzx^39.0+2418.0*xyzx^38.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-2368.0*36.0*xyzx^35.0+2394.0*-39.0/xyzx^40.0+2418.0*38.0*xyzx^37.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-85248.0*xyzx^35.0-93366.0/xyzx^40.0+91884.0*xyzx^37.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.6842105263157894*xyzx^38.0+1.7027027027027026/xyzx^37.0+1.55*xyzx^40.0+61.0*xyzx-60.0*xyzx+59.0*xyzx-58.0*xyzx-57.0*xyzx+56.0*xyzx";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.6842105263157894/39.0*xyzx^39.0+1.7027027027027026/-36.0/xyzx^36.0+1.55/41.0*xyzx^41.0+61.0/2.0*xyzx^2.0-60.0/2.0*xyzx^2.0+59.0/2.0*xyzx^2.0-58.0/2.0*xyzx^2.0-57.0/2.0*xyzx^2.0+56.0/2.0*xyzx^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/23.15625*xyzx^39.0-1.0/21.142857142857142/xyzx^36.0+1.0/26.451612903225804*xyzx^41.0+30.5*xyzx^2.0-30.0*xyzx^2.0+29.5*xyzx^2.0-29.0*xyzx^2.0-28.5*xyzx^2.0+28.0*xyzx^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-85248.0*xyzx^35.0-93366.0/xyzx^40.0+91884.0*xyzx^37.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-85248.0*35.0*xyzx^34.0-93366.0*-40.0/xyzx^41.0+91884.0*37.0*xyzx^36.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-2983680.0*xyzx^34.0+3734640.0/xyzx^41.0+3399708.0*xyzx^36.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/23.15625*xyzx^39.0-1.0/21.142857142857142/xyzx^36.0+1.0/26.451612903225804*xyzx^41.0+30.5*xyzx^2.0-30.0*xyzx^2.0+29.5*xyzx^2.0-29.0*xyzx^2.0-28.5*xyzx^2.0+28.0*xyzx^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/23.15625/40.0*xyzx^40.0-1.0/21.142857142857142/-35.0/xyzx^35.0+1.0/26.451612903225804/42.0*xyzx^42.0+30.5/3.0*xyzx^3.0-30.0/3.0*xyzx^3.0+29.5/3.0*xyzx^3.0-29.0/3.0*xyzx^3.0-28.5/3.0*xyzx^3.0+28.0/3.0*xyzx^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/926.25*xyzx^40.0+1.0/740.0/xyzx^35.0+1.0/1110.9677419354837*xyzx^42.0+10.166666666666666*xyzx^3.0-10.0*xyzx^3.0+9.833333333333334*xyzx^3.0-9.666666666666666*xyzx^3.0-9.5*xyzx^3.0+9.333333333333334*xyzx^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-2983680.0*xyzx^34.0+3734640.0/xyzx^41.0+3399708.0*xyzx^36.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-2983680.0*34.0*xyzx^33.0+3734640.0*-41.0/xyzx^42.0+3399708.0*36.0*xyzx^35.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1.0144512E8*xyzx^33.0-1.5312024E8/xyzx^42.0+1.22389488E8*xyzx^35.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/926.25*xyzx^40.0+1.0/740.0/xyzx^35.0+1.0/1110.9677419354837*xyzx^42.0+10.166666666666666*xyzx^3.0-10.0*xyzx^3.0+9.833333333333334*xyzx^3.0-9.666666666666666*xyzx^3.0-9.5*xyzx^3.0+9.333333333333334*xyzx^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/926.25/41.0*xyzx^41.0+1.0/740.0/-34.0/xyzx^34.0+1.0/1110.9677419354837/43.0*xyzx^43.0+10.166666666666666/4.0*xyzx^4.0-10.0/4.0*xyzx^4.0+9.833333333333334/4.0*xyzx^4.0-9.666666666666666/4.0*xyzx^4.0-9.5/4.0*xyzx^4.0+9.333333333333334/4.0*xyzx^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/37976.25*xyzx^41.0-1.0/25160.0/xyzx^34.0+1.0/47771.612903225796*xyzx^43.0+2.5416666666666665*xyzx^4.0-2.5*xyzx^4.0+2.4583333333333335*xyzx^4.0-2.4166666666666665*xyzx^4.0-2.375*xyzx^4.0+2.3333333333333335*xyzx^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130438() {
 UsageCalculus.TestCase = 130438;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+63/-x^38-62*-x^39+61+60/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^41-59*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-42+58*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^43+57/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^44-56*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-45+55";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-63.0/x^38.0+62.0*x^39.0+61.0-60.0+59.0-58.0-57.0+56.0+55.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-63.0*-38.0/x^39.0+62.0*39.0*x^38.0+61.0*0.0-60.0*0.0+59.0*0.0-58.0*0.0-57.0*0.0+56.0*0.0+55.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "2394.0/x^39.0+2418.0*x^38.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-63.0/x^38.0+62.0*x^39.0+61.0-60.0+59.0-58.0-57.0+56.0+55.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-63.0/-37.0/x^37.0+62.0/40.0*x^40.0+61.0*x-60.0*x+59.0*x-58.0*x-57.0*x+56.0*x+55.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "1.7027027027027026/x^37.0+1.55*x^40.0+61.0*x-60.0*x+59.0*x-58.0*x-57.0*x+56.0*x+55.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "2394.0/x^39.0+2418.0*x^38.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "2394.0*-39.0/x^40.0+2418.0*38.0*x^37.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-93366.0/x^40.0+91884.0*x^37.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.7027027027027026/x^37.0+1.55*x^40.0+61.0*x-60.0*x+59.0*x-58.0*x-57.0*x+56.0*x+55.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.7027027027027026/-36.0/x^36.0+1.55/41.0*x^41.0+61.0/2.0*x^2.0-60.0/2.0*x^2.0+59.0/2.0*x^2.0-58.0/2.0*x^2.0-57.0/2.0*x^2.0+56.0/2.0*x^2.0+55.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/21.142857142857142/x^36.0+1.0/26.451612903225804*x^41.0+30.5*x^2.0-30.0*x^2.0+29.5*x^2.0-29.0*x^2.0-28.5*x^2.0+28.0*x^2.0+27.5*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-93366.0/x^40.0+91884.0*x^37.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-93366.0*-40.0/x^41.0+91884.0*37.0*x^36.0";
 UsageCalculus.EqnSolArrayMap2[3] = "3734640.0/x^41.0+3399708.0*x^36.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/21.142857142857142/x^36.0+1.0/26.451612903225804*x^41.0+30.5*x^2.0-30.0*x^2.0+29.5*x^2.0-29.0*x^2.0-28.5*x^2.0+28.0*x^2.0+27.5*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/21.142857142857142/-35.0/x^35.0+1.0/26.451612903225804/42.0*x^42.0+30.5/3.0*x^3.0-30.0/3.0*x^3.0+29.5/3.0*x^3.0-29.0/3.0*x^3.0-28.5/3.0*x^3.0+28.0/3.0*x^3.0+27.5/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/740.0/x^35.0+1.0/1110.9677419354837*x^42.0+10.166666666666666*x^3.0-10.0*x^3.0+9.833333333333334*x^3.0-9.666666666666666*x^3.0-9.5*x^3.0+9.333333333333334*x^3.0+9.166666666666666*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "3734640.0/x^41.0+3399708.0*x^36.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "3734640.0*-41.0/x^42.0+3399708.0*36.0*x^35.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1.5312024E8/x^42.0+1.22389488E8*x^35.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/740.0/x^35.0+1.0/1110.9677419354837*x^42.0+10.166666666666666*x^3.0-10.0*x^3.0+9.833333333333334*x^3.0-9.666666666666666*x^3.0-9.5*x^3.0+9.333333333333334*x^3.0+9.166666666666666*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/740.0/-34.0/x^34.0+1.0/1110.9677419354837/43.0*x^43.0+10.166666666666666/4.0*x^4.0-10.0/4.0*x^4.0+9.833333333333334/4.0*x^4.0-9.666666666666666/4.0*x^4.0-9.5/4.0*x^4.0+9.333333333333334/4.0*x^4.0+9.166666666666666/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/25160.0/x^34.0+1.0/47771.612903225796*x^43.0+2.5416666666666665*x^4.0-2.5*x^4.0+2.4583333333333335*x^4.0-2.4166666666666665*x^4.0-2.375*x^4.0+2.3333333333333335*x^4.0+2.2916666666666665*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130439() {
 UsageCalculus.TestCase = 130439;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-62*-xy^39+61+60/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^41-59*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-42+58*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^43+57/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^44-56*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-45+55+54/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^47";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "62.0*xy^39.0+61.0-60.0+59.0-58.0-57.0+56.0+55.0-54.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "62.0*39.0*xy^38.0+61.0*0.0-60.0*0.0+59.0*0.0-58.0*0.0-57.0*0.0+56.0*0.0+55.0*0.0-54.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "2418.0*xy^38.0";
 UsageCalculus.EqnSolArrayMap3[1] = "62.0*xy^39.0+61.0-60.0+59.0-58.0-57.0+56.0+55.0-54.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "62.0/40.0*xy^40.0+61.0*xy-60.0*xy+59.0*xy-58.0*xy-57.0*xy+56.0*xy+55.0*xy-54.0*xy";
 UsageCalculus.EqnSolArrayMap4[1] = "1.55*xy^40.0+61.0*xy-60.0*xy+59.0*xy-58.0*xy-57.0*xy+56.0*xy+55.0*xy-54.0*xy";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "2418.0*xy^38.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "2418.0*38.0*xy^37.0";
 UsageCalculus.EqnSolArrayMap2[2] = "91884.0*xy^37.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.55*xy^40.0+61.0*xy-60.0*xy+59.0*xy-58.0*xy-57.0*xy+56.0*xy+55.0*xy-54.0*xy";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.55/41.0*xy^41.0+61.0/2.0*xy^2.0-60.0/2.0*xy^2.0+59.0/2.0*xy^2.0-58.0/2.0*xy^2.0-57.0/2.0*xy^2.0+56.0/2.0*xy^2.0+55.0/2.0*xy^2.0-54.0/2.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/26.451612903225804*xy^41.0+30.5*xy^2.0-30.0*xy^2.0+29.5*xy^2.0-29.0*xy^2.0-28.5*xy^2.0+28.0*xy^2.0+27.5*xy^2.0-27.0*xy^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "91884.0*xy^37.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "91884.0*37.0*xy^36.0";
 UsageCalculus.EqnSolArrayMap2[3] = "3399708.0*xy^36.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/26.451612903225804*xy^41.0+30.5*xy^2.0-30.0*xy^2.0+29.5*xy^2.0-29.0*xy^2.0-28.5*xy^2.0+28.0*xy^2.0+27.5*xy^2.0-27.0*xy^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/26.451612903225804/42.0*xy^42.0+30.5/3.0*xy^3.0-30.0/3.0*xy^3.0+29.5/3.0*xy^3.0-29.0/3.0*xy^3.0-28.5/3.0*xy^3.0+28.0/3.0*xy^3.0+27.5/3.0*xy^3.0-27.0/3.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/1110.9677419354837*xy^42.0+10.166666666666666*xy^3.0-10.0*xy^3.0+9.833333333333334*xy^3.0-9.666666666666666*xy^3.0-9.5*xy^3.0+9.333333333333334*xy^3.0+9.166666666666666*xy^3.0-9.0*xy^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "3399708.0*xy^36.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "3399708.0*36.0*xy^35.0";
 UsageCalculus.EqnSolArrayMap2[4] = "1.22389488E8*xy^35.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/1110.9677419354837*xy^42.0+10.166666666666666*xy^3.0-10.0*xy^3.0+9.833333333333334*xy^3.0-9.666666666666666*xy^3.0-9.5*xy^3.0+9.333333333333334*xy^3.0+9.166666666666666*xy^3.0-9.0*xy^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/1110.9677419354837/43.0*xy^43.0+10.166666666666666/4.0*xy^4.0-10.0/4.0*xy^4.0+9.833333333333334/4.0*xy^4.0-9.666666666666666/4.0*xy^4.0-9.5/4.0*xy^4.0+9.333333333333334/4.0*xy^4.0+9.166666666666666/4.0*xy^4.0-9.0/4.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/47771.612903225796*xy^43.0+2.5416666666666665*xy^4.0-2.5*xy^4.0+2.4583333333333335*xy^4.0-2.4166666666666665*xy^4.0-2.375*xy^4.0+2.3333333333333335*xy^4.0+2.2916666666666665*xy^4.0-2.25*xy^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130440() {
 UsageCalculus.TestCase = 130440;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+61+60/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^41-59*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-42+58*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^43+57/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^44-56*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-45+55+54/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^47-53*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-48";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "61.0-60.0+59.0-58.0-57.0+56.0+55.0-54.0+53.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0-60.0*0.0+59.0*0.0-58.0*0.0-57.0*0.0+56.0*0.0+55.0*0.0-54.0*0.0+53.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "61.0-60.0+59.0-58.0-57.0+56.0+55.0-54.0+53.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "61.0*x-60.0*x+59.0*x-58.0*x-57.0*x+56.0*x+55.0*x-54.0*x+53.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "61.0*x-60.0*x+59.0*x-58.0*x-57.0*x+56.0*x+55.0*x-54.0*x+53.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "61.0*x-60.0*x+59.0*x-58.0*x-57.0*x+56.0*x+55.0*x-54.0*x+53.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "61.0/2.0*x^2.0-60.0/2.0*x^2.0+59.0/2.0*x^2.0-58.0/2.0*x^2.0-57.0/2.0*x^2.0+56.0/2.0*x^2.0+55.0/2.0*x^2.0-54.0/2.0*x^2.0+53.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "30.5*x^2.0-30.0*x^2.0+29.5*x^2.0-29.0*x^2.0-28.5*x^2.0+28.0*x^2.0+27.5*x^2.0-27.0*x^2.0+26.5*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "30.5*x^2.0-30.0*x^2.0+29.5*x^2.0-29.0*x^2.0-28.5*x^2.0+28.0*x^2.0+27.5*x^2.0-27.0*x^2.0+26.5*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "30.5/3.0*x^3.0-30.0/3.0*x^3.0+29.5/3.0*x^3.0-29.0/3.0*x^3.0-28.5/3.0*x^3.0+28.0/3.0*x^3.0+27.5/3.0*x^3.0-27.0/3.0*x^3.0+26.5/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "10.166666666666666*x^3.0-10.0*x^3.0+9.833333333333334*x^3.0-9.666666666666666*x^3.0-9.5*x^3.0+9.333333333333334*x^3.0+9.166666666666666*x^3.0-9.0*x^3.0+8.833333333333334*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "10.166666666666666*x^3.0-10.0*x^3.0+9.833333333333334*x^3.0-9.666666666666666*x^3.0-9.5*x^3.0+9.333333333333334*x^3.0+9.166666666666666*x^3.0-9.0*x^3.0+8.833333333333334*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "10.166666666666666/4.0*x^4.0-10.0/4.0*x^4.0+9.833333333333334/4.0*x^4.0-9.666666666666666/4.0*x^4.0-9.5/4.0*x^4.0+9.333333333333334/4.0*x^4.0+9.166666666666666/4.0*x^4.0-9.0/4.0*x^4.0+8.833333333333334/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "2.5416666666666665*x^4.0-2.5*x^4.0+2.4583333333333335*x^4.0-2.4166666666666665*x^4.0-2.375*x^4.0+2.3333333333333335*x^4.0+2.2916666666666665*x^4.0-2.25*x^4.0+2.2083333333333335*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130441() {
 UsageCalculus.TestCase = 130441;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+60/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^41-59*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-42+58*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^43+57/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^44-56*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-45+55+54/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^47-53*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-48+52*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^49";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyzx";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-60.0+59.0-58.0-57.0+56.0+55.0-54.0+53.0-52.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0+59.0*0.0-58.0*0.0-57.0*0.0+56.0*0.0+55.0*0.0-54.0*0.0+53.0*0.0-52.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "-60.0+59.0-58.0-57.0+56.0+55.0-54.0+53.0-52.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-60.0*xyzx+59.0*xyzx-58.0*xyzx-57.0*xyzx+56.0*xyzx+55.0*xyzx-54.0*xyzx+53.0*xyzx-52.0*xyzx";
 UsageCalculus.EqnSolArrayMap4[1] = "-60.0*xyzx+59.0*xyzx-58.0*xyzx-57.0*xyzx+56.0*xyzx+55.0*xyzx-54.0*xyzx+53.0*xyzx-52.0*xyzx";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "-60.0*xyzx+59.0*xyzx-58.0*xyzx-57.0*xyzx+56.0*xyzx+55.0*xyzx-54.0*xyzx+53.0*xyzx-52.0*xyzx";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-60.0/2.0*xyzx^2.0+59.0/2.0*xyzx^2.0-58.0/2.0*xyzx^2.0-57.0/2.0*xyzx^2.0+56.0/2.0*xyzx^2.0+55.0/2.0*xyzx^2.0-54.0/2.0*xyzx^2.0+53.0/2.0*xyzx^2.0-52.0/2.0*xyzx^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-30.0*xyzx^2.0+29.5*xyzx^2.0-29.0*xyzx^2.0-28.5*xyzx^2.0+28.0*xyzx^2.0+27.5*xyzx^2.0-27.0*xyzx^2.0+26.5*xyzx^2.0-26.0*xyzx^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "-30.0*xyzx^2.0+29.5*xyzx^2.0-29.0*xyzx^2.0-28.5*xyzx^2.0+28.0*xyzx^2.0+27.5*xyzx^2.0-27.0*xyzx^2.0+26.5*xyzx^2.0-26.0*xyzx^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-30.0/3.0*xyzx^3.0+29.5/3.0*xyzx^3.0-29.0/3.0*xyzx^3.0-28.5/3.0*xyzx^3.0+28.0/3.0*xyzx^3.0+27.5/3.0*xyzx^3.0-27.0/3.0*xyzx^3.0+26.5/3.0*xyzx^3.0-26.0/3.0*xyzx^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-10.0*xyzx^3.0+9.833333333333334*xyzx^3.0-9.666666666666666*xyzx^3.0-9.5*xyzx^3.0+9.333333333333334*xyzx^3.0+9.166666666666666*xyzx^3.0-9.0*xyzx^3.0+8.833333333333334*xyzx^3.0-8.666666666666666*xyzx^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "-10.0*xyzx^3.0+9.833333333333334*xyzx^3.0-9.666666666666666*xyzx^3.0-9.5*xyzx^3.0+9.333333333333334*xyzx^3.0+9.166666666666666*xyzx^3.0-9.0*xyzx^3.0+8.833333333333334*xyzx^3.0-8.666666666666666*xyzx^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-10.0/4.0*xyzx^4.0+9.833333333333334/4.0*xyzx^4.0-9.666666666666666/4.0*xyzx^4.0-9.5/4.0*xyzx^4.0+9.333333333333334/4.0*xyzx^4.0+9.166666666666666/4.0*xyzx^4.0-9.0/4.0*xyzx^4.0+8.833333333333334/4.0*xyzx^4.0-8.666666666666666/4.0*xyzx^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-2.5*xyzx^4.0+2.4583333333333335*xyzx^4.0-2.4166666666666665*xyzx^4.0-2.375*xyzx^4.0+2.3333333333333335*xyzx^4.0+2.2916666666666665*xyzx^4.0-2.25*xyzx^4.0+2.2083333333333335*xyzx^4.0-2.1666666666666665*xyzx^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130442() {
 UsageCalculus.TestCase = 130442;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-59*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-42+58*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^43+57/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^44-56*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-45+55+54/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^47-53*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-48+52*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^49+51/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^50";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "59.0-58.0-57.0+56.0+55.0-54.0+53.0-52.0-51.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0-58.0*0.0-57.0*0.0+56.0*0.0+55.0*0.0-54.0*0.0+53.0*0.0-52.0*0.0-51.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "59.0-58.0-57.0+56.0+55.0-54.0+53.0-52.0-51.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "59.0*x-58.0*x-57.0*x+56.0*x+55.0*x-54.0*x+53.0*x-52.0*x-51.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "59.0*x-58.0*x-57.0*x+56.0*x+55.0*x-54.0*x+53.0*x-52.0*x-51.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "59.0*x-58.0*x-57.0*x+56.0*x+55.0*x-54.0*x+53.0*x-52.0*x-51.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "59.0/2.0*x^2.0-58.0/2.0*x^2.0-57.0/2.0*x^2.0+56.0/2.0*x^2.0+55.0/2.0*x^2.0-54.0/2.0*x^2.0+53.0/2.0*x^2.0-52.0/2.0*x^2.0-51.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "29.5*x^2.0-29.0*x^2.0-28.5*x^2.0+28.0*x^2.0+27.5*x^2.0-27.0*x^2.0+26.5*x^2.0-26.0*x^2.0-25.5*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "29.5*x^2.0-29.0*x^2.0-28.5*x^2.0+28.0*x^2.0+27.5*x^2.0-27.0*x^2.0+26.5*x^2.0-26.0*x^2.0-25.5*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "29.5/3.0*x^3.0-29.0/3.0*x^3.0-28.5/3.0*x^3.0+28.0/3.0*x^3.0+27.5/3.0*x^3.0-27.0/3.0*x^3.0+26.5/3.0*x^3.0-26.0/3.0*x^3.0-25.5/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "9.833333333333334*x^3.0-9.666666666666666*x^3.0-9.5*x^3.0+9.333333333333334*x^3.0+9.166666666666666*x^3.0-9.0*x^3.0+8.833333333333334*x^3.0-8.666666666666666*x^3.0-8.5*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "9.833333333333334*x^3.0-9.666666666666666*x^3.0-9.5*x^3.0+9.333333333333334*x^3.0+9.166666666666666*x^3.0-9.0*x^3.0+8.833333333333334*x^3.0-8.666666666666666*x^3.0-8.5*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "9.833333333333334/4.0*x^4.0-9.666666666666666/4.0*x^4.0-9.5/4.0*x^4.0+9.333333333333334/4.0*x^4.0+9.166666666666666/4.0*x^4.0-9.0/4.0*x^4.0+8.833333333333334/4.0*x^4.0-8.666666666666666/4.0*x^4.0-8.5/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "2.4583333333333335*x^4.0-2.4166666666666665*x^4.0-2.375*x^4.0+2.3333333333333335*x^4.0+2.2916666666666665*x^4.0-2.25*x^4.0+2.2083333333333335*x^4.0-2.1666666666666665*x^4.0-2.125*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130443() {
 UsageCalculus.TestCase = 130443;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+58*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^43+57/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^44-56*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-45+55+54/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^47-53*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-48+52*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^49+51/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^50-50*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-51";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-58.0-57.0+56.0+55.0-54.0+53.0-52.0-51.0+50.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0-57.0*0.0+56.0*0.0+55.0*0.0-54.0*0.0+53.0*0.0-52.0*0.0-51.0*0.0+50.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "-58.0-57.0+56.0+55.0-54.0+53.0-52.0-51.0+50.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-58.0*xy-57.0*xy+56.0*xy+55.0*xy-54.0*xy+53.0*xy-52.0*xy-51.0*xy+50.0*xy";
 UsageCalculus.EqnSolArrayMap4[1] = "-58.0*xy-57.0*xy+56.0*xy+55.0*xy-54.0*xy+53.0*xy-52.0*xy-51.0*xy+50.0*xy";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "-58.0*xy-57.0*xy+56.0*xy+55.0*xy-54.0*xy+53.0*xy-52.0*xy-51.0*xy+50.0*xy";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-58.0/2.0*xy^2.0-57.0/2.0*xy^2.0+56.0/2.0*xy^2.0+55.0/2.0*xy^2.0-54.0/2.0*xy^2.0+53.0/2.0*xy^2.0-52.0/2.0*xy^2.0-51.0/2.0*xy^2.0+50.0/2.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-29.0*xy^2.0-28.5*xy^2.0+28.0*xy^2.0+27.5*xy^2.0-27.0*xy^2.0+26.5*xy^2.0-26.0*xy^2.0-25.5*xy^2.0+25.0*xy^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "-29.0*xy^2.0-28.5*xy^2.0+28.0*xy^2.0+27.5*xy^2.0-27.0*xy^2.0+26.5*xy^2.0-26.0*xy^2.0-25.5*xy^2.0+25.0*xy^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-29.0/3.0*xy^3.0-28.5/3.0*xy^3.0+28.0/3.0*xy^3.0+27.5/3.0*xy^3.0-27.0/3.0*xy^3.0+26.5/3.0*xy^3.0-26.0/3.0*xy^3.0-25.5/3.0*xy^3.0+25.0/3.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-9.666666666666666*xy^3.0-9.5*xy^3.0+9.333333333333334*xy^3.0+9.166666666666666*xy^3.0-9.0*xy^3.0+8.833333333333334*xy^3.0-8.666666666666666*xy^3.0-8.5*xy^3.0+8.333333333333334*xy^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "-9.666666666666666*xy^3.0-9.5*xy^3.0+9.333333333333334*xy^3.0+9.166666666666666*xy^3.0-9.0*xy^3.0+8.833333333333334*xy^3.0-8.666666666666666*xy^3.0-8.5*xy^3.0+8.333333333333334*xy^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-9.666666666666666/4.0*xy^4.0-9.5/4.0*xy^4.0+9.333333333333334/4.0*xy^4.0+9.166666666666666/4.0*xy^4.0-9.0/4.0*xy^4.0+8.833333333333334/4.0*xy^4.0-8.666666666666666/4.0*xy^4.0-8.5/4.0*xy^4.0+8.333333333333334/4.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-2.4166666666666665*xy^4.0-2.375*xy^4.0+2.3333333333333335*xy^4.0+2.2916666666666665*xy^4.0-2.25*xy^4.0+2.2083333333333335*xy^4.0-2.1666666666666665*xy^4.0-2.125*xy^4.0+2.0833333333333335*xy^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130444() {
 UsageCalculus.TestCase = 130444;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+57/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^44-56*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-45+55+54/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^47-53*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-48+52*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^49+51/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^50-50*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-51+49";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-57.0+56.0+55.0-54.0+53.0-52.0-51.0+50.0+49.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0+56.0*0.0+55.0*0.0-54.0*0.0+53.0*0.0-52.0*0.0-51.0*0.0+50.0*0.0+49.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "-57.0+56.0+55.0-54.0+53.0-52.0-51.0+50.0+49.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-57.0*x+56.0*x+55.0*x-54.0*x+53.0*x-52.0*x-51.0*x+50.0*x+49.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "-57.0*x+56.0*x+55.0*x-54.0*x+53.0*x-52.0*x-51.0*x+50.0*x+49.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "-57.0*x+56.0*x+55.0*x-54.0*x+53.0*x-52.0*x-51.0*x+50.0*x+49.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-57.0/2.0*x^2.0+56.0/2.0*x^2.0+55.0/2.0*x^2.0-54.0/2.0*x^2.0+53.0/2.0*x^2.0-52.0/2.0*x^2.0-51.0/2.0*x^2.0+50.0/2.0*x^2.0+49.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-28.5*x^2.0+28.0*x^2.0+27.5*x^2.0-27.0*x^2.0+26.5*x^2.0-26.0*x^2.0-25.5*x^2.0+25.0*x^2.0+24.5*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "-28.5*x^2.0+28.0*x^2.0+27.5*x^2.0-27.0*x^2.0+26.5*x^2.0-26.0*x^2.0-25.5*x^2.0+25.0*x^2.0+24.5*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-28.5/3.0*x^3.0+28.0/3.0*x^3.0+27.5/3.0*x^3.0-27.0/3.0*x^3.0+26.5/3.0*x^3.0-26.0/3.0*x^3.0-25.5/3.0*x^3.0+25.0/3.0*x^3.0+24.5/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-9.5*x^3.0+9.333333333333334*x^3.0+9.166666666666666*x^3.0-9.0*x^3.0+8.833333333333334*x^3.0-8.666666666666666*x^3.0-8.5*x^3.0+8.333333333333334*x^3.0+8.166666666666666*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "-9.5*x^3.0+9.333333333333334*x^3.0+9.166666666666666*x^3.0-9.0*x^3.0+8.833333333333334*x^3.0-8.666666666666666*x^3.0-8.5*x^3.0+8.333333333333334*x^3.0+8.166666666666666*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-9.5/4.0*x^4.0+9.333333333333334/4.0*x^4.0+9.166666666666666/4.0*x^4.0-9.0/4.0*x^4.0+8.833333333333334/4.0*x^4.0-8.666666666666666/4.0*x^4.0-8.5/4.0*x^4.0+8.333333333333334/4.0*x^4.0+8.166666666666666/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-2.375*x^4.0+2.3333333333333335*x^4.0+2.2916666666666665*x^4.0-2.25*x^4.0+2.2083333333333335*x^4.0-2.1666666666666665*x^4.0-2.125*x^4.0+2.0833333333333335*x^4.0+2.0416666666666665*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130445() {
 UsageCalculus.TestCase = 130445;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-56*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-45+55+54/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^47-53*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-48+52*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^49+51/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^50-50*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-51+49+48/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^53";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyzx";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "56.0+55.0-54.0+53.0-52.0-51.0+50.0+49.0-48.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+55.0*0.0-54.0*0.0+53.0*0.0-52.0*0.0-51.0*0.0+50.0*0.0+49.0*0.0-48.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "56.0+55.0-54.0+53.0-52.0-51.0+50.0+49.0-48.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "56.0*xyzx+55.0*xyzx-54.0*xyzx+53.0*xyzx-52.0*xyzx-51.0*xyzx+50.0*xyzx+49.0*xyzx-48.0*xyzx";
 UsageCalculus.EqnSolArrayMap4[1] = "56.0*xyzx+55.0*xyzx-54.0*xyzx+53.0*xyzx-52.0*xyzx-51.0*xyzx+50.0*xyzx+49.0*xyzx-48.0*xyzx";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "56.0*xyzx+55.0*xyzx-54.0*xyzx+53.0*xyzx-52.0*xyzx-51.0*xyzx+50.0*xyzx+49.0*xyzx-48.0*xyzx";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "56.0/2.0*xyzx^2.0+55.0/2.0*xyzx^2.0-54.0/2.0*xyzx^2.0+53.0/2.0*xyzx^2.0-52.0/2.0*xyzx^2.0-51.0/2.0*xyzx^2.0+50.0/2.0*xyzx^2.0+49.0/2.0*xyzx^2.0-48.0/2.0*xyzx^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "28.0*xyzx^2.0+27.5*xyzx^2.0-27.0*xyzx^2.0+26.5*xyzx^2.0-26.0*xyzx^2.0-25.5*xyzx^2.0+25.0*xyzx^2.0+24.5*xyzx^2.0-24.0*xyzx^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "28.0*xyzx^2.0+27.5*xyzx^2.0-27.0*xyzx^2.0+26.5*xyzx^2.0-26.0*xyzx^2.0-25.5*xyzx^2.0+25.0*xyzx^2.0+24.5*xyzx^2.0-24.0*xyzx^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "28.0/3.0*xyzx^3.0+27.5/3.0*xyzx^3.0-27.0/3.0*xyzx^3.0+26.5/3.0*xyzx^3.0-26.0/3.0*xyzx^3.0-25.5/3.0*xyzx^3.0+25.0/3.0*xyzx^3.0+24.5/3.0*xyzx^3.0-24.0/3.0*xyzx^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "9.333333333333334*xyzx^3.0+9.166666666666666*xyzx^3.0-9.0*xyzx^3.0+8.833333333333334*xyzx^3.0-8.666666666666666*xyzx^3.0-8.5*xyzx^3.0+8.333333333333334*xyzx^3.0+8.166666666666666*xyzx^3.0-8.0*xyzx^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "9.333333333333334*xyzx^3.0+9.166666666666666*xyzx^3.0-9.0*xyzx^3.0+8.833333333333334*xyzx^3.0-8.666666666666666*xyzx^3.0-8.5*xyzx^3.0+8.333333333333334*xyzx^3.0+8.166666666666666*xyzx^3.0-8.0*xyzx^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "9.333333333333334/4.0*xyzx^4.0+9.166666666666666/4.0*xyzx^4.0-9.0/4.0*xyzx^4.0+8.833333333333334/4.0*xyzx^4.0-8.666666666666666/4.0*xyzx^4.0-8.5/4.0*xyzx^4.0+8.333333333333334/4.0*xyzx^4.0+8.166666666666666/4.0*xyzx^4.0-8.0/4.0*xyzx^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "2.3333333333333335*xyzx^4.0+2.2916666666666665*xyzx^4.0-2.25*xyzx^4.0+2.2083333333333335*xyzx^4.0-2.1666666666666665*xyzx^4.0-2.125*xyzx^4.0+2.0833333333333335*xyzx^4.0+2.0416666666666665*xyzx^4.0-2.0*xyzx^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130446() {
 UsageCalculus.TestCase = 130446;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+55+54/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^47-53*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-48+52*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^49+51/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^50-50*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-51+49+48/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^53-47*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-54";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "55.0-54.0+53.0-52.0-51.0+50.0+49.0-48.0+47.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0-54.0*0.0+53.0*0.0-52.0*0.0-51.0*0.0+50.0*0.0+49.0*0.0-48.0*0.0+47.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "55.0-54.0+53.0-52.0-51.0+50.0+49.0-48.0+47.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "55.0*x-54.0*x+53.0*x-52.0*x-51.0*x+50.0*x+49.0*x-48.0*x+47.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "55.0*x-54.0*x+53.0*x-52.0*x-51.0*x+50.0*x+49.0*x-48.0*x+47.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "55.0*x-54.0*x+53.0*x-52.0*x-51.0*x+50.0*x+49.0*x-48.0*x+47.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "55.0/2.0*x^2.0-54.0/2.0*x^2.0+53.0/2.0*x^2.0-52.0/2.0*x^2.0-51.0/2.0*x^2.0+50.0/2.0*x^2.0+49.0/2.0*x^2.0-48.0/2.0*x^2.0+47.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "27.5*x^2.0-27.0*x^2.0+26.5*x^2.0-26.0*x^2.0-25.5*x^2.0+25.0*x^2.0+24.5*x^2.0-24.0*x^2.0+23.5*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "27.5*x^2.0-27.0*x^2.0+26.5*x^2.0-26.0*x^2.0-25.5*x^2.0+25.0*x^2.0+24.5*x^2.0-24.0*x^2.0+23.5*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "27.5/3.0*x^3.0-27.0/3.0*x^3.0+26.5/3.0*x^3.0-26.0/3.0*x^3.0-25.5/3.0*x^3.0+25.0/3.0*x^3.0+24.5/3.0*x^3.0-24.0/3.0*x^3.0+23.5/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "9.166666666666666*x^3.0-9.0*x^3.0+8.833333333333334*x^3.0-8.666666666666666*x^3.0-8.5*x^3.0+8.333333333333334*x^3.0+8.166666666666666*x^3.0-8.0*x^3.0+7.833333333333333*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "9.166666666666666*x^3.0-9.0*x^3.0+8.833333333333334*x^3.0-8.666666666666666*x^3.0-8.5*x^3.0+8.333333333333334*x^3.0+8.166666666666666*x^3.0-8.0*x^3.0+7.833333333333333*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "9.166666666666666/4.0*x^4.0-9.0/4.0*x^4.0+8.833333333333334/4.0*x^4.0-8.666666666666666/4.0*x^4.0-8.5/4.0*x^4.0+8.333333333333334/4.0*x^4.0+8.166666666666666/4.0*x^4.0-8.0/4.0*x^4.0+7.833333333333333/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "2.2916666666666665*x^4.0-2.25*x^4.0+2.2083333333333335*x^4.0-2.1666666666666665*x^4.0-2.125*x^4.0+2.0833333333333335*x^4.0+2.0416666666666665*x^4.0-2.0*x^4.0+1.9583333333333333*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130447() {
 UsageCalculus.TestCase = 130447;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+54/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^47-53*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-48+52*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^49+51/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^50-50*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-51+49+48/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^53-47*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-54+46*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^55";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-54.0+53.0-52.0-51.0+50.0+49.0-48.0+47.0-46.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0+53.0*0.0-52.0*0.0-51.0*0.0+50.0*0.0+49.0*0.0-48.0*0.0+47.0*0.0-46.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "-54.0+53.0-52.0-51.0+50.0+49.0-48.0+47.0-46.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-54.0*xy+53.0*xy-52.0*xy-51.0*xy+50.0*xy+49.0*xy-48.0*xy+47.0*xy-46.0*xy";
 UsageCalculus.EqnSolArrayMap4[1] = "-54.0*xy+53.0*xy-52.0*xy-51.0*xy+50.0*xy+49.0*xy-48.0*xy+47.0*xy-46.0*xy";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "-54.0*xy+53.0*xy-52.0*xy-51.0*xy+50.0*xy+49.0*xy-48.0*xy+47.0*xy-46.0*xy";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-54.0/2.0*xy^2.0+53.0/2.0*xy^2.0-52.0/2.0*xy^2.0-51.0/2.0*xy^2.0+50.0/2.0*xy^2.0+49.0/2.0*xy^2.0-48.0/2.0*xy^2.0+47.0/2.0*xy^2.0-46.0/2.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-27.0*xy^2.0+26.5*xy^2.0-26.0*xy^2.0-25.5*xy^2.0+25.0*xy^2.0+24.5*xy^2.0-24.0*xy^2.0+23.5*xy^2.0-23.0*xy^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "-27.0*xy^2.0+26.5*xy^2.0-26.0*xy^2.0-25.5*xy^2.0+25.0*xy^2.0+24.5*xy^2.0-24.0*xy^2.0+23.5*xy^2.0-23.0*xy^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-27.0/3.0*xy^3.0+26.5/3.0*xy^3.0-26.0/3.0*xy^3.0-25.5/3.0*xy^3.0+25.0/3.0*xy^3.0+24.5/3.0*xy^3.0-24.0/3.0*xy^3.0+23.5/3.0*xy^3.0-23.0/3.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-9.0*xy^3.0+8.833333333333334*xy^3.0-8.666666666666666*xy^3.0-8.5*xy^3.0+8.333333333333334*xy^3.0+8.166666666666666*xy^3.0-8.0*xy^3.0+7.833333333333333*xy^3.0-7.666666666666667*xy^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "-9.0*xy^3.0+8.833333333333334*xy^3.0-8.666666666666666*xy^3.0-8.5*xy^3.0+8.333333333333334*xy^3.0+8.166666666666666*xy^3.0-8.0*xy^3.0+7.833333333333333*xy^3.0-7.666666666666667*xy^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-9.0/4.0*xy^4.0+8.833333333333334/4.0*xy^4.0-8.666666666666666/4.0*xy^4.0-8.5/4.0*xy^4.0+8.333333333333334/4.0*xy^4.0+8.166666666666666/4.0*xy^4.0-8.0/4.0*xy^4.0+7.833333333333333/4.0*xy^4.0-7.666666666666667/4.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-2.25*xy^4.0+2.2083333333333335*xy^4.0-2.1666666666666665*xy^4.0-2.125*xy^4.0+2.0833333333333335*xy^4.0+2.0416666666666665*xy^4.0-2.0*xy^4.0+1.9583333333333333*xy^4.0-1.9166666666666667*xy^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130448() {
 UsageCalculus.TestCase = 130448;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-53*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-48+52*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^49+51/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^50-50*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-51+49+48/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^53-47*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-54+46*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^55+45/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^56";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "53.0-52.0-51.0+50.0+49.0-48.0+47.0-46.0-45.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0-52.0*0.0-51.0*0.0+50.0*0.0+49.0*0.0-48.0*0.0+47.0*0.0-46.0*0.0-45.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "53.0-52.0-51.0+50.0+49.0-48.0+47.0-46.0-45.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "53.0*x-52.0*x-51.0*x+50.0*x+49.0*x-48.0*x+47.0*x-46.0*x-45.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "53.0*x-52.0*x-51.0*x+50.0*x+49.0*x-48.0*x+47.0*x-46.0*x-45.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "53.0*x-52.0*x-51.0*x+50.0*x+49.0*x-48.0*x+47.0*x-46.0*x-45.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "53.0/2.0*x^2.0-52.0/2.0*x^2.0-51.0/2.0*x^2.0+50.0/2.0*x^2.0+49.0/2.0*x^2.0-48.0/2.0*x^2.0+47.0/2.0*x^2.0-46.0/2.0*x^2.0-45.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "26.5*x^2.0-26.0*x^2.0-25.5*x^2.0+25.0*x^2.0+24.5*x^2.0-24.0*x^2.0+23.5*x^2.0-23.0*x^2.0-22.5*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "26.5*x^2.0-26.0*x^2.0-25.5*x^2.0+25.0*x^2.0+24.5*x^2.0-24.0*x^2.0+23.5*x^2.0-23.0*x^2.0-22.5*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "26.5/3.0*x^3.0-26.0/3.0*x^3.0-25.5/3.0*x^3.0+25.0/3.0*x^3.0+24.5/3.0*x^3.0-24.0/3.0*x^3.0+23.5/3.0*x^3.0-23.0/3.0*x^3.0-22.5/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "8.833333333333334*x^3.0-8.666666666666666*x^3.0-8.5*x^3.0+8.333333333333334*x^3.0+8.166666666666666*x^3.0-8.0*x^3.0+7.833333333333333*x^3.0-7.666666666666667*x^3.0-7.5*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "8.833333333333334*x^3.0-8.666666666666666*x^3.0-8.5*x^3.0+8.333333333333334*x^3.0+8.166666666666666*x^3.0-8.0*x^3.0+7.833333333333333*x^3.0-7.666666666666667*x^3.0-7.5*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "8.833333333333334/4.0*x^4.0-8.666666666666666/4.0*x^4.0-8.5/4.0*x^4.0+8.333333333333334/4.0*x^4.0+8.166666666666666/4.0*x^4.0-8.0/4.0*x^4.0+7.833333333333333/4.0*x^4.0-7.666666666666667/4.0*x^4.0-7.5/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "2.2083333333333335*x^4.0-2.1666666666666665*x^4.0-2.125*x^4.0+2.0833333333333335*x^4.0+2.0416666666666665*x^4.0-2.0*x^4.0+1.9583333333333333*x^4.0-1.9166666666666667*x^4.0-1.875*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130449() {
 UsageCalculus.TestCase = 130449;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+52*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^49+51/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^50-50*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-51+49+48/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^53-47*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-54+46*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^55+45/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^56-44*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-57";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyzx";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-52.0-51.0+50.0+49.0-48.0+47.0-46.0-45.0+44.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0-51.0*0.0+50.0*0.0+49.0*0.0-48.0*0.0+47.0*0.0-46.0*0.0-45.0*0.0+44.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "-52.0-51.0+50.0+49.0-48.0+47.0-46.0-45.0+44.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-52.0*xyzx-51.0*xyzx+50.0*xyzx+49.0*xyzx-48.0*xyzx+47.0*xyzx-46.0*xyzx-45.0*xyzx+44.0*xyzx";
 UsageCalculus.EqnSolArrayMap4[1] = "-52.0*xyzx-51.0*xyzx+50.0*xyzx+49.0*xyzx-48.0*xyzx+47.0*xyzx-46.0*xyzx-45.0*xyzx+44.0*xyzx";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "-52.0*xyzx-51.0*xyzx+50.0*xyzx+49.0*xyzx-48.0*xyzx+47.0*xyzx-46.0*xyzx-45.0*xyzx+44.0*xyzx";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-52.0/2.0*xyzx^2.0-51.0/2.0*xyzx^2.0+50.0/2.0*xyzx^2.0+49.0/2.0*xyzx^2.0-48.0/2.0*xyzx^2.0+47.0/2.0*xyzx^2.0-46.0/2.0*xyzx^2.0-45.0/2.0*xyzx^2.0+44.0/2.0*xyzx^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-26.0*xyzx^2.0-25.5*xyzx^2.0+25.0*xyzx^2.0+24.5*xyzx^2.0-24.0*xyzx^2.0+23.5*xyzx^2.0-23.0*xyzx^2.0-22.5*xyzx^2.0+22.0*xyzx^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "-26.0*xyzx^2.0-25.5*xyzx^2.0+25.0*xyzx^2.0+24.5*xyzx^2.0-24.0*xyzx^2.0+23.5*xyzx^2.0-23.0*xyzx^2.0-22.5*xyzx^2.0+22.0*xyzx^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-26.0/3.0*xyzx^3.0-25.5/3.0*xyzx^3.0+25.0/3.0*xyzx^3.0+24.5/3.0*xyzx^3.0-24.0/3.0*xyzx^3.0+23.5/3.0*xyzx^3.0-23.0/3.0*xyzx^3.0-22.5/3.0*xyzx^3.0+22.0/3.0*xyzx^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-8.666666666666666*xyzx^3.0-8.5*xyzx^3.0+8.333333333333334*xyzx^3.0+8.166666666666666*xyzx^3.0-8.0*xyzx^3.0+7.833333333333333*xyzx^3.0-7.666666666666667*xyzx^3.0-7.5*xyzx^3.0+7.333333333333333*xyzx^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "-8.666666666666666*xyzx^3.0-8.5*xyzx^3.0+8.333333333333334*xyzx^3.0+8.166666666666666*xyzx^3.0-8.0*xyzx^3.0+7.833333333333333*xyzx^3.0-7.666666666666667*xyzx^3.0-7.5*xyzx^3.0+7.333333333333333*xyzx^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-8.666666666666666/4.0*xyzx^4.0-8.5/4.0*xyzx^4.0+8.333333333333334/4.0*xyzx^4.0+8.166666666666666/4.0*xyzx^4.0-8.0/4.0*xyzx^4.0+7.833333333333333/4.0*xyzx^4.0-7.666666666666667/4.0*xyzx^4.0-7.5/4.0*xyzx^4.0+7.333333333333333/4.0*xyzx^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-2.1666666666666665*xyzx^4.0-2.125*xyzx^4.0+2.0833333333333335*xyzx^4.0+2.0416666666666665*xyzx^4.0-2.0*xyzx^4.0+1.9583333333333333*xyzx^4.0-1.9166666666666667*xyzx^4.0-1.875*xyzx^4.0+1.8333333333333333*xyzx^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130450() {
 UsageCalculus.TestCase = 130450;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+51/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^50-50*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-51+49+48/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^53-47*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-54+46*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^55+45/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^56-44*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-57+43";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-51.0+50.0+49.0-48.0+47.0-46.0-45.0+44.0+43.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0+50.0*0.0+49.0*0.0-48.0*0.0+47.0*0.0-46.0*0.0-45.0*0.0+44.0*0.0+43.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "-51.0+50.0+49.0-48.0+47.0-46.0-45.0+44.0+43.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-51.0*x+50.0*x+49.0*x-48.0*x+47.0*x-46.0*x-45.0*x+44.0*x+43.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "-51.0*x+50.0*x+49.0*x-48.0*x+47.0*x-46.0*x-45.0*x+44.0*x+43.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "-51.0*x+50.0*x+49.0*x-48.0*x+47.0*x-46.0*x-45.0*x+44.0*x+43.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-51.0/2.0*x^2.0+50.0/2.0*x^2.0+49.0/2.0*x^2.0-48.0/2.0*x^2.0+47.0/2.0*x^2.0-46.0/2.0*x^2.0-45.0/2.0*x^2.0+44.0/2.0*x^2.0+43.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-25.5*x^2.0+25.0*x^2.0+24.5*x^2.0-24.0*x^2.0+23.5*x^2.0-23.0*x^2.0-22.5*x^2.0+22.0*x^2.0+21.5*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "-25.5*x^2.0+25.0*x^2.0+24.5*x^2.0-24.0*x^2.0+23.5*x^2.0-23.0*x^2.0-22.5*x^2.0+22.0*x^2.0+21.5*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-25.5/3.0*x^3.0+25.0/3.0*x^3.0+24.5/3.0*x^3.0-24.0/3.0*x^3.0+23.5/3.0*x^3.0-23.0/3.0*x^3.0-22.5/3.0*x^3.0+22.0/3.0*x^3.0+21.5/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-8.5*x^3.0+8.333333333333334*x^3.0+8.166666666666666*x^3.0-8.0*x^3.0+7.833333333333333*x^3.0-7.666666666666667*x^3.0-7.5*x^3.0+7.333333333333333*x^3.0+7.166666666666667*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "-8.5*x^3.0+8.333333333333334*x^3.0+8.166666666666666*x^3.0-8.0*x^3.0+7.833333333333333*x^3.0-7.666666666666667*x^3.0-7.5*x^3.0+7.333333333333333*x^3.0+7.166666666666667*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-8.5/4.0*x^4.0+8.333333333333334/4.0*x^4.0+8.166666666666666/4.0*x^4.0-8.0/4.0*x^4.0+7.833333333333333/4.0*x^4.0-7.666666666666667/4.0*x^4.0-7.5/4.0*x^4.0+7.333333333333333/4.0*x^4.0+7.166666666666667/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-2.125*x^4.0+2.0833333333333335*x^4.0+2.0416666666666665*x^4.0-2.0*x^4.0+1.9583333333333333*x^4.0-1.9166666666666667*x^4.0-1.875*x^4.0+1.8333333333333333*x^4.0+1.7916666666666667*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130451() {
 UsageCalculus.TestCase = 130451;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-50*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-51+49+48/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^53-47*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-54+46*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^55+45/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^56-44*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-57+43+42/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^59";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "50.0+49.0-48.0+47.0-46.0-45.0+44.0+43.0-42.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+49.0*0.0-48.0*0.0+47.0*0.0-46.0*0.0-45.0*0.0+44.0*0.0+43.0*0.0-42.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "50.0+49.0-48.0+47.0-46.0-45.0+44.0+43.0-42.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "50.0*xy+49.0*xy-48.0*xy+47.0*xy-46.0*xy-45.0*xy+44.0*xy+43.0*xy-42.0*xy";
 UsageCalculus.EqnSolArrayMap4[1] = "50.0*xy+49.0*xy-48.0*xy+47.0*xy-46.0*xy-45.0*xy+44.0*xy+43.0*xy-42.0*xy";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "50.0*xy+49.0*xy-48.0*xy+47.0*xy-46.0*xy-45.0*xy+44.0*xy+43.0*xy-42.0*xy";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "50.0/2.0*xy^2.0+49.0/2.0*xy^2.0-48.0/2.0*xy^2.0+47.0/2.0*xy^2.0-46.0/2.0*xy^2.0-45.0/2.0*xy^2.0+44.0/2.0*xy^2.0+43.0/2.0*xy^2.0-42.0/2.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "25.0*xy^2.0+24.5*xy^2.0-24.0*xy^2.0+23.5*xy^2.0-23.0*xy^2.0-22.5*xy^2.0+22.0*xy^2.0+21.5*xy^2.0-21.0*xy^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "25.0*xy^2.0+24.5*xy^2.0-24.0*xy^2.0+23.5*xy^2.0-23.0*xy^2.0-22.5*xy^2.0+22.0*xy^2.0+21.5*xy^2.0-21.0*xy^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "25.0/3.0*xy^3.0+24.5/3.0*xy^3.0-24.0/3.0*xy^3.0+23.5/3.0*xy^3.0-23.0/3.0*xy^3.0-22.5/3.0*xy^3.0+22.0/3.0*xy^3.0+21.5/3.0*xy^3.0-21.0/3.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "8.333333333333334*xy^3.0+8.166666666666666*xy^3.0-8.0*xy^3.0+7.833333333333333*xy^3.0-7.666666666666667*xy^3.0-7.5*xy^3.0+7.333333333333333*xy^3.0+7.166666666666667*xy^3.0-7.0*xy^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "8.333333333333334*xy^3.0+8.166666666666666*xy^3.0-8.0*xy^3.0+7.833333333333333*xy^3.0-7.666666666666667*xy^3.0-7.5*xy^3.0+7.333333333333333*xy^3.0+7.166666666666667*xy^3.0-7.0*xy^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "8.333333333333334/4.0*xy^4.0+8.166666666666666/4.0*xy^4.0-8.0/4.0*xy^4.0+7.833333333333333/4.0*xy^4.0-7.666666666666667/4.0*xy^4.0-7.5/4.0*xy^4.0+7.333333333333333/4.0*xy^4.0+7.166666666666667/4.0*xy^4.0-7.0/4.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "2.0833333333333335*xy^4.0+2.0416666666666665*xy^4.0-2.0*xy^4.0+1.9583333333333333*xy^4.0-1.9166666666666667*xy^4.0-1.875*xy^4.0+1.8333333333333333*xy^4.0+1.7916666666666667*xy^4.0-1.75*xy^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130452() {
 UsageCalculus.TestCase = 130452;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+49+48/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^53-47*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-54+46*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^55+45/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^56-44*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-57+43+42/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^59-41*-x^60";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "49.0-48.0+47.0-46.0-45.0+44.0+43.0-42.0+41.0*x^60.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0-48.0*0.0+47.0*0.0-46.0*0.0-45.0*0.0+44.0*0.0+43.0*0.0-42.0*0.0+41.0*60.0*x^59.0";
 UsageCalculus.EqnSolArrayMap2[1] = "2460.0*x^59.0";
 UsageCalculus.EqnSolArrayMap3[1] = "49.0-48.0+47.0-46.0-45.0+44.0+43.0-42.0+41.0*x^60.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "49.0*x-48.0*x+47.0*x-46.0*x-45.0*x+44.0*x+43.0*x-42.0*x+41.0/61.0*x^61.0";
 UsageCalculus.EqnSolArrayMap4[1] = "49.0*x-48.0*x+47.0*x-46.0*x-45.0*x+44.0*x+43.0*x-42.0*x+1.0/1.4878048780487805*x^61.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "2460.0*x^59.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "2460.0*59.0*x^58.0";
 UsageCalculus.EqnSolArrayMap2[2] = "145140.0*x^58.0";
 UsageCalculus.EqnSolArrayMap3[2] = "49.0*x-48.0*x+47.0*x-46.0*x-45.0*x+44.0*x+43.0*x-42.0*x+1.0/1.4878048780487805*x^61.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "49.0/2.0*x^2.0-48.0/2.0*x^2.0+47.0/2.0*x^2.0-46.0/2.0*x^2.0-45.0/2.0*x^2.0+44.0/2.0*x^2.0+43.0/2.0*x^2.0-42.0/2.0*x^2.0+1.0/1.4878048780487805/62.0*x^62.0";
 UsageCalculus.EqnSolArrayMap4[2] = "24.5*x^2.0-24.0*x^2.0+23.5*x^2.0-23.0*x^2.0-22.5*x^2.0+22.0*x^2.0+21.5*x^2.0-21.0*x^2.0+1.0/92.2439024390244*x^62.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "145140.0*x^58.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "145140.0*58.0*x^57.0";
 UsageCalculus.EqnSolArrayMap2[3] = "8418120.0*x^57.0";
 UsageCalculus.EqnSolArrayMap3[3] = "24.5*x^2.0-24.0*x^2.0+23.5*x^2.0-23.0*x^2.0-22.5*x^2.0+22.0*x^2.0+21.5*x^2.0-21.0*x^2.0+1.0/92.2439024390244*x^62.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "24.5/3.0*x^3.0-24.0/3.0*x^3.0+23.5/3.0*x^3.0-23.0/3.0*x^3.0-22.5/3.0*x^3.0+22.0/3.0*x^3.0+21.5/3.0*x^3.0-21.0/3.0*x^3.0+1.0/92.2439024390244/63.0*x^63.0";
 UsageCalculus.EqnSolArrayMap4[3] = "8.166666666666666*x^3.0-8.0*x^3.0+7.833333333333333*x^3.0-7.666666666666667*x^3.0-7.5*x^3.0+7.333333333333333*x^3.0+7.166666666666667*x^3.0-7.0*x^3.0+1.0/5811.365853658537*x^63.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "8418120.0*x^57.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "8418120.0*57.0*x^56.0";
 UsageCalculus.EqnSolArrayMap2[4] = "4.7983284E8*x^56.0";
 UsageCalculus.EqnSolArrayMap3[4] = "8.166666666666666*x^3.0-8.0*x^3.0+7.833333333333333*x^3.0-7.666666666666667*x^3.0-7.5*x^3.0+7.333333333333333*x^3.0+7.166666666666667*x^3.0-7.0*x^3.0+1.0/5811.365853658537*x^63.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "8.166666666666666/4.0*x^4.0-8.0/4.0*x^4.0+7.833333333333333/4.0*x^4.0-7.666666666666667/4.0*x^4.0-7.5/4.0*x^4.0+7.333333333333333/4.0*x^4.0+7.166666666666667/4.0*x^4.0-7.0/4.0*x^4.0+1.0/5811.365853658537/64.0*x^64.0";
 UsageCalculus.EqnSolArrayMap4[4] = "2.0416666666666665*x^4.0-2.0*x^4.0+1.9583333333333333*x^4.0-1.9166666666666667*x^4.0-1.875*x^4.0+1.8333333333333333*x^4.0+1.7916666666666667*x^4.0-1.75*x^4.0+1.0/371927.4146341464*x^64.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130453() {
 UsageCalculus.TestCase = 130453;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+48/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^53-47*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-54+46*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^55+45/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^56-44*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-57+43+42/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^59-41*-xyzx^60+40*-xyzx^61";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyzx";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-48.0+47.0-46.0-45.0+44.0+43.0-42.0+41.0*xyzx^60.0-40.0*xyzx^61.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0+47.0*0.0-46.0*0.0-45.0*0.0+44.0*0.0+43.0*0.0-42.0*0.0+41.0*60.0*xyzx^59.0-40.0*61.0*xyzx^60.0";
 UsageCalculus.EqnSolArrayMap2[1] = "2460.0*xyzx^59.0-2440.0*xyzx^60.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-48.0+47.0-46.0-45.0+44.0+43.0-42.0+41.0*xyzx^60.0-40.0*xyzx^61.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-48.0*xyzx+47.0*xyzx-46.0*xyzx-45.0*xyzx+44.0*xyzx+43.0*xyzx-42.0*xyzx+41.0/61.0*xyzx^61.0-40.0/62.0*xyzx^62.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-48.0*xyzx+47.0*xyzx-46.0*xyzx-45.0*xyzx+44.0*xyzx+43.0*xyzx-42.0*xyzx+1.0/1.4878048780487805*xyzx^61.0-1.0/1.55*xyzx^62.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "2460.0*xyzx^59.0-2440.0*xyzx^60.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "2460.0*59.0*xyzx^58.0-2440.0*60.0*xyzx^59.0";
 UsageCalculus.EqnSolArrayMap2[2] = "145140.0*xyzx^58.0-146400.0*xyzx^59.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-48.0*xyzx+47.0*xyzx-46.0*xyzx-45.0*xyzx+44.0*xyzx+43.0*xyzx-42.0*xyzx+1.0/1.4878048780487805*xyzx^61.0-1.0/1.55*xyzx^62.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-48.0/2.0*xyzx^2.0+47.0/2.0*xyzx^2.0-46.0/2.0*xyzx^2.0-45.0/2.0*xyzx^2.0+44.0/2.0*xyzx^2.0+43.0/2.0*xyzx^2.0-42.0/2.0*xyzx^2.0+1.0/1.4878048780487805/62.0*xyzx^62.0-1.0/1.55/63.0*xyzx^63.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-24.0*xyzx^2.0+23.5*xyzx^2.0-23.0*xyzx^2.0-22.5*xyzx^2.0+22.0*xyzx^2.0+21.5*xyzx^2.0-21.0*xyzx^2.0+1.0/92.2439024390244*xyzx^62.0-1.0/97.65*xyzx^63.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "145140.0*xyzx^58.0-146400.0*xyzx^59.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "145140.0*58.0*xyzx^57.0-146400.0*59.0*xyzx^58.0";
 UsageCalculus.EqnSolArrayMap2[3] = "8418120.0*xyzx^57.0-8637600.0*xyzx^58.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-24.0*xyzx^2.0+23.5*xyzx^2.0-23.0*xyzx^2.0-22.5*xyzx^2.0+22.0*xyzx^2.0+21.5*xyzx^2.0-21.0*xyzx^2.0+1.0/92.2439024390244*xyzx^62.0-1.0/97.65*xyzx^63.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-24.0/3.0*xyzx^3.0+23.5/3.0*xyzx^3.0-23.0/3.0*xyzx^3.0-22.5/3.0*xyzx^3.0+22.0/3.0*xyzx^3.0+21.5/3.0*xyzx^3.0-21.0/3.0*xyzx^3.0+1.0/92.2439024390244/63.0*xyzx^63.0-1.0/97.65/64.0*xyzx^64.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-8.0*xyzx^3.0+7.833333333333333*xyzx^3.0-7.666666666666667*xyzx^3.0-7.5*xyzx^3.0+7.333333333333333*xyzx^3.0+7.166666666666667*xyzx^3.0-7.0*xyzx^3.0+1.0/5811.365853658537*xyzx^63.0-1.0/6249.6*xyzx^64.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "8418120.0*xyzx^57.0-8637600.0*xyzx^58.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "8418120.0*57.0*xyzx^56.0-8637600.0*58.0*xyzx^57.0";
 UsageCalculus.EqnSolArrayMap2[4] = "4.7983284E8*xyzx^56.0-5.009808E8*xyzx^57.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-8.0*xyzx^3.0+7.833333333333333*xyzx^3.0-7.666666666666667*xyzx^3.0-7.5*xyzx^3.0+7.333333333333333*xyzx^3.0+7.166666666666667*xyzx^3.0-7.0*xyzx^3.0+1.0/5811.365853658537*xyzx^63.0-1.0/6249.6*xyzx^64.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-8.0/4.0*xyzx^4.0+7.833333333333333/4.0*xyzx^4.0-7.666666666666667/4.0*xyzx^4.0-7.5/4.0*xyzx^4.0+7.333333333333333/4.0*xyzx^4.0+7.166666666666667/4.0*xyzx^4.0-7.0/4.0*xyzx^4.0+1.0/5811.365853658537/64.0*xyzx^64.0-1.0/6249.6/65.0*xyzx^65.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-2.0*xyzx^4.0+1.9583333333333333*xyzx^4.0-1.9166666666666667*xyzx^4.0-1.875*xyzx^4.0+1.8333333333333333*xyzx^4.0+1.7916666666666667*xyzx^4.0-1.75*xyzx^4.0+1.0/371927.4146341464*xyzx^64.0-1.0/406224.0*xyzx^65.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130454() {
 UsageCalculus.TestCase = 130454;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-47*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-54+46*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^55+45/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^56-44*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-57+43+42/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^59-41*-x^60+40*-x^61+39/-x^62";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "47.0-46.0-45.0+44.0+43.0-42.0+41.0*x^60.0-40.0*x^61.0-39.0/x^62.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0-46.0*0.0-45.0*0.0+44.0*0.0+43.0*0.0-42.0*0.0+41.0*60.0*x^59.0-40.0*61.0*x^60.0-39.0*-62.0/x^63.0";
 UsageCalculus.EqnSolArrayMap2[1] = "2460.0*x^59.0-2440.0*x^60.0+2418.0/x^63.0";
 UsageCalculus.EqnSolArrayMap3[1] = "47.0-46.0-45.0+44.0+43.0-42.0+41.0*x^60.0-40.0*x^61.0-39.0/x^62.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "47.0*x-46.0*x-45.0*x+44.0*x+43.0*x-42.0*x+41.0/61.0*x^61.0-40.0/62.0*x^62.0-39.0/-61.0/x^61.0";
 UsageCalculus.EqnSolArrayMap4[1] = "47.0*x-46.0*x-45.0*x+44.0*x+43.0*x-42.0*x+1.0/1.4878048780487805*x^61.0-1.0/1.55*x^62.0+1.0/1.564102564102564/x^61.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "2460.0*x^59.0-2440.0*x^60.0+2418.0/x^63.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "2460.0*59.0*x^58.0-2440.0*60.0*x^59.0+2418.0*-63.0/x^64.0";
 UsageCalculus.EqnSolArrayMap2[2] = "145140.0*x^58.0-146400.0*x^59.0-152334.0/x^64.0";
 UsageCalculus.EqnSolArrayMap3[2] = "47.0*x-46.0*x-45.0*x+44.0*x+43.0*x-42.0*x+1.0/1.4878048780487805*x^61.0-1.0/1.55*x^62.0+1.0/1.564102564102564/x^61.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "47.0/2.0*x^2.0-46.0/2.0*x^2.0-45.0/2.0*x^2.0+44.0/2.0*x^2.0+43.0/2.0*x^2.0-42.0/2.0*x^2.0+1.0/1.4878048780487805/62.0*x^62.0-1.0/1.55/63.0*x^63.0+1.0/1.564102564102564/-60.0/x^60.0";
 UsageCalculus.EqnSolArrayMap4[2] = "23.5*x^2.0-23.0*x^2.0-22.5*x^2.0+22.0*x^2.0+21.5*x^2.0-21.0*x^2.0+1.0/92.2439024390244*x^62.0-1.0/97.65*x^63.0-1.0/93.84615384615384/x^60.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "145140.0*x^58.0-146400.0*x^59.0-152334.0/x^64.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "145140.0*58.0*x^57.0-146400.0*59.0*x^58.0-152334.0*-64.0/x^65.0";
 UsageCalculus.EqnSolArrayMap2[3] = "8418120.0*x^57.0-8637600.0*x^58.0+9749376.0/x^65.0";
 UsageCalculus.EqnSolArrayMap3[3] = "23.5*x^2.0-23.0*x^2.0-22.5*x^2.0+22.0*x^2.0+21.5*x^2.0-21.0*x^2.0+1.0/92.2439024390244*x^62.0-1.0/97.65*x^63.0-1.0/93.84615384615384/x^60.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "23.5/3.0*x^3.0-23.0/3.0*x^3.0-22.5/3.0*x^3.0+22.0/3.0*x^3.0+21.5/3.0*x^3.0-21.0/3.0*x^3.0+1.0/92.2439024390244/63.0*x^63.0-1.0/97.65/64.0*x^64.0-1.0/93.84615384615384/-59.0/x^59.0";
 UsageCalculus.EqnSolArrayMap4[3] = "7.833333333333333*x^3.0-7.666666666666667*x^3.0-7.5*x^3.0+7.333333333333333*x^3.0+7.166666666666667*x^3.0-7.0*x^3.0+1.0/5811.365853658537*x^63.0-1.0/6249.6*x^64.0+1.0/5536.923076923076/x^59.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "8418120.0*x^57.0-8637600.0*x^58.0+9749376.0/x^65.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "8418120.0*57.0*x^56.0-8637600.0*58.0*x^57.0+9749376.0*-65.0/x^66.0";
 UsageCalculus.EqnSolArrayMap2[4] = "4.7983284E8*x^56.0-5.009808E8*x^57.0-6.3370944E8/x^66.0";
 UsageCalculus.EqnSolArrayMap3[4] = "7.833333333333333*x^3.0-7.666666666666667*x^3.0-7.5*x^3.0+7.333333333333333*x^3.0+7.166666666666667*x^3.0-7.0*x^3.0+1.0/5811.365853658537*x^63.0-1.0/6249.6*x^64.0+1.0/5536.923076923076/x^59.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "7.833333333333333/4.0*x^4.0-7.666666666666667/4.0*x^4.0-7.5/4.0*x^4.0+7.333333333333333/4.0*x^4.0+7.166666666666667/4.0*x^4.0-7.0/4.0*x^4.0+1.0/5811.365853658537/64.0*x^64.0-1.0/6249.6/65.0*x^65.0+1.0/5536.923076923076/-58.0/x^58.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.9583333333333333*x^4.0-1.9166666666666667*x^4.0-1.875*x^4.0+1.8333333333333333*x^4.0+1.7916666666666667*x^4.0-1.75*x^4.0+1.0/371927.4146341464*x^64.0-1.0/406224.0*x^65.0-1.0/321141.53846153844/x^58.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130455() {
 UsageCalculus.TestCase = 130455;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+46*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx^55+45/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^56-44*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-57+43+42/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^59-41*-xy^60+40*-xy^61+39/-xy^62-38*-xy^63";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-46.0-45.0+44.0+43.0-42.0+41.0*xy^60.0-40.0*xy^61.0-39.0/xy^62.0+38.0*xy^63.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0-45.0*0.0+44.0*0.0+43.0*0.0-42.0*0.0+41.0*60.0*xy^59.0-40.0*61.0*xy^60.0-39.0*-62.0/xy^63.0+38.0*63.0*xy^62.0";
 UsageCalculus.EqnSolArrayMap2[1] = "2460.0*xy^59.0-2440.0*xy^60.0+2418.0/xy^63.0+2394.0*xy^62.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-46.0-45.0+44.0+43.0-42.0+41.0*xy^60.0-40.0*xy^61.0-39.0/xy^62.0+38.0*xy^63.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-46.0*xy-45.0*xy+44.0*xy+43.0*xy-42.0*xy+41.0/61.0*xy^61.0-40.0/62.0*xy^62.0-39.0/-61.0/xy^61.0+38.0/64.0*xy^64.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-46.0*xy-45.0*xy+44.0*xy+43.0*xy-42.0*xy+1.0/1.4878048780487805*xy^61.0-1.0/1.55*xy^62.0+1.0/1.564102564102564/xy^61.0+1.0/1.6842105263157894*xy^64.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "2460.0*xy^59.0-2440.0*xy^60.0+2418.0/xy^63.0+2394.0*xy^62.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "2460.0*59.0*xy^58.0-2440.0*60.0*xy^59.0+2418.0*-63.0/xy^64.0+2394.0*62.0*xy^61.0";
 UsageCalculus.EqnSolArrayMap2[2] = "145140.0*xy^58.0-146400.0*xy^59.0-152334.0/xy^64.0+148428.0*xy^61.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-46.0*xy-45.0*xy+44.0*xy+43.0*xy-42.0*xy+1.0/1.4878048780487805*xy^61.0-1.0/1.55*xy^62.0+1.0/1.564102564102564/xy^61.0+1.0/1.6842105263157894*xy^64.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-46.0/2.0*xy^2.0-45.0/2.0*xy^2.0+44.0/2.0*xy^2.0+43.0/2.0*xy^2.0-42.0/2.0*xy^2.0+1.0/1.4878048780487805/62.0*xy^62.0-1.0/1.55/63.0*xy^63.0+1.0/1.564102564102564/-60.0/xy^60.0+1.0/1.6842105263157894/65.0*xy^65.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-23.0*xy^2.0-22.5*xy^2.0+22.0*xy^2.0+21.5*xy^2.0-21.0*xy^2.0+1.0/92.2439024390244*xy^62.0-1.0/97.65*xy^63.0-1.0/93.84615384615384/xy^60.0+1.0/109.47368421052632*xy^65.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "145140.0*xy^58.0-146400.0*xy^59.0-152334.0/xy^64.0+148428.0*xy^61.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "145140.0*58.0*xy^57.0-146400.0*59.0*xy^58.0-152334.0*-64.0/xy^65.0+148428.0*61.0*xy^60.0";
 UsageCalculus.EqnSolArrayMap2[3] = "8418120.0*xy^57.0-8637600.0*xy^58.0+9749376.0/xy^65.0+9054108.0*xy^60.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-23.0*xy^2.0-22.5*xy^2.0+22.0*xy^2.0+21.5*xy^2.0-21.0*xy^2.0+1.0/92.2439024390244*xy^62.0-1.0/97.65*xy^63.0-1.0/93.84615384615384/xy^60.0+1.0/109.47368421052632*xy^65.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-23.0/3.0*xy^3.0-22.5/3.0*xy^3.0+22.0/3.0*xy^3.0+21.5/3.0*xy^3.0-21.0/3.0*xy^3.0+1.0/92.2439024390244/63.0*xy^63.0-1.0/97.65/64.0*xy^64.0-1.0/93.84615384615384/-59.0/xy^59.0+1.0/109.47368421052632/66.0*xy^66.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-7.666666666666667*xy^3.0-7.5*xy^3.0+7.333333333333333*xy^3.0+7.166666666666667*xy^3.0-7.0*xy^3.0+1.0/5811.365853658537*xy^63.0-1.0/6249.6*xy^64.0+1.0/5536.923076923076/xy^59.0+1.0/7225.263157894737*xy^66.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "8418120.0*xy^57.0-8637600.0*xy^58.0+9749376.0/xy^65.0+9054108.0*xy^60.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "8418120.0*57.0*xy^56.0-8637600.0*58.0*xy^57.0+9749376.0*-65.0/xy^66.0+9054108.0*60.0*xy^59.0";
 UsageCalculus.EqnSolArrayMap2[4] = "4.7983284E8*xy^56.0-5.009808E8*xy^57.0-6.3370944E8/xy^66.0+5.4324648E8*xy^59.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-7.666666666666667*xy^3.0-7.5*xy^3.0+7.333333333333333*xy^3.0+7.166666666666667*xy^3.0-7.0*xy^3.0+1.0/5811.365853658537*xy^63.0-1.0/6249.6*xy^64.0+1.0/5536.923076923076/xy^59.0+1.0/7225.263157894737*xy^66.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-7.666666666666667/4.0*xy^4.0-7.5/4.0*xy^4.0+7.333333333333333/4.0*xy^4.0+7.166666666666667/4.0*xy^4.0-7.0/4.0*xy^4.0+1.0/5811.365853658537/64.0*xy^64.0-1.0/6249.6/65.0*xy^65.0+1.0/5536.923076923076/-58.0/xy^58.0+1.0/7225.263157894737/67.0*xy^67.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.9166666666666667*xy^4.0-1.875*xy^4.0+1.8333333333333333*xy^4.0+1.7916666666666667*xy^4.0-1.75*xy^4.0+1.0/371927.4146341464*xy^64.0-1.0/406224.0*xy^65.0-1.0/321141.53846153844/xy^58.0+1.0/484092.63157894736*xy^67.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130456() {
 UsageCalculus.TestCase = 130456;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+45/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^56-44*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-57+43+42/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^59-41*-x^60+40*-x^61+39/-x^62-38*-x^63+37*-x^64";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-45.0+44.0+43.0-42.0+41.0*x^60.0-40.0*x^61.0-39.0/x^62.0+38.0*x^63.0-37.0*x^64.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0+44.0*0.0+43.0*0.0-42.0*0.0+41.0*60.0*x^59.0-40.0*61.0*x^60.0-39.0*-62.0/x^63.0+38.0*63.0*x^62.0-37.0*64.0*x^63.0";
 UsageCalculus.EqnSolArrayMap2[1] = "2460.0*x^59.0-2440.0*x^60.0+2418.0/x^63.0+2394.0*x^62.0-2368.0*x^63.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-45.0+44.0+43.0-42.0+41.0*x^60.0-40.0*x^61.0-39.0/x^62.0+38.0*x^63.0-37.0*x^64.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-45.0*x+44.0*x+43.0*x-42.0*x+41.0/61.0*x^61.0-40.0/62.0*x^62.0-39.0/-61.0/x^61.0+38.0/64.0*x^64.0-37.0/65.0*x^65.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-45.0*x+44.0*x+43.0*x-42.0*x+1.0/1.4878048780487805*x^61.0-1.0/1.55*x^62.0+1.0/1.564102564102564/x^61.0+1.0/1.6842105263157894*x^64.0-1.0/1.7567567567567568*x^65.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "2460.0*x^59.0-2440.0*x^60.0+2418.0/x^63.0+2394.0*x^62.0-2368.0*x^63.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "2460.0*59.0*x^58.0-2440.0*60.0*x^59.0+2418.0*-63.0/x^64.0+2394.0*62.0*x^61.0-2368.0*63.0*x^62.0";
 UsageCalculus.EqnSolArrayMap2[2] = "145140.0*x^58.0-146400.0*x^59.0-152334.0/x^64.0+148428.0*x^61.0-149184.0*x^62.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-45.0*x+44.0*x+43.0*x-42.0*x+1.0/1.4878048780487805*x^61.0-1.0/1.55*x^62.0+1.0/1.564102564102564/x^61.0+1.0/1.6842105263157894*x^64.0-1.0/1.7567567567567568*x^65.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-45.0/2.0*x^2.0+44.0/2.0*x^2.0+43.0/2.0*x^2.0-42.0/2.0*x^2.0+1.0/1.4878048780487805/62.0*x^62.0-1.0/1.55/63.0*x^63.0+1.0/1.564102564102564/-60.0/x^60.0+1.0/1.6842105263157894/65.0*x^65.0-1.0/1.7567567567567568/66.0*x^66.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-22.5*x^2.0+22.0*x^2.0+21.5*x^2.0-21.0*x^2.0+1.0/92.2439024390244*x^62.0-1.0/97.65*x^63.0-1.0/93.84615384615384/x^60.0+1.0/109.47368421052632*x^65.0-1.0/115.94594594594595*x^66.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "145140.0*x^58.0-146400.0*x^59.0-152334.0/x^64.0+148428.0*x^61.0-149184.0*x^62.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "145140.0*58.0*x^57.0-146400.0*59.0*x^58.0-152334.0*-64.0/x^65.0+148428.0*61.0*x^60.0-149184.0*62.0*x^61.0";
 UsageCalculus.EqnSolArrayMap2[3] = "8418120.0*x^57.0-8637600.0*x^58.0+9749376.0/x^65.0+9054108.0*x^60.0-9249408.0*x^61.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-22.5*x^2.0+22.0*x^2.0+21.5*x^2.0-21.0*x^2.0+1.0/92.2439024390244*x^62.0-1.0/97.65*x^63.0-1.0/93.84615384615384/x^60.0+1.0/109.47368421052632*x^65.0-1.0/115.94594594594595*x^66.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-22.5/3.0*x^3.0+22.0/3.0*x^3.0+21.5/3.0*x^3.0-21.0/3.0*x^3.0+1.0/92.2439024390244/63.0*x^63.0-1.0/97.65/64.0*x^64.0-1.0/93.84615384615384/-59.0/x^59.0+1.0/109.47368421052632/66.0*x^66.0-1.0/115.94594594594595/67.0*x^67.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-7.5*x^3.0+7.333333333333333*x^3.0+7.166666666666667*x^3.0-7.0*x^3.0+1.0/5811.365853658537*x^63.0-1.0/6249.6*x^64.0+1.0/5536.923076923076/x^59.0+1.0/7225.263157894737*x^66.0-1.0/7768.378378378378*x^67.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "8418120.0*x^57.0-8637600.0*x^58.0+9749376.0/x^65.0+9054108.0*x^60.0-9249408.0*x^61.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "8418120.0*57.0*x^56.0-8637600.0*58.0*x^57.0+9749376.0*-65.0/x^66.0+9054108.0*60.0*x^59.0-9249408.0*61.0*x^60.0";
 UsageCalculus.EqnSolArrayMap2[4] = "4.7983284E8*x^56.0-5.009808E8*x^57.0-6.3370944E8/x^66.0+5.4324648E8*x^59.0-5.64213888E8*x^60.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-7.5*x^3.0+7.333333333333333*x^3.0+7.166666666666667*x^3.0-7.0*x^3.0+1.0/5811.365853658537*x^63.0-1.0/6249.6*x^64.0+1.0/5536.923076923076/x^59.0+1.0/7225.263157894737*x^66.0-1.0/7768.378378378378*x^67.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-7.5/4.0*x^4.0+7.333333333333333/4.0*x^4.0+7.166666666666667/4.0*x^4.0-7.0/4.0*x^4.0+1.0/5811.365853658537/64.0*x^64.0-1.0/6249.6/65.0*x^65.0+1.0/5536.923076923076/-58.0/x^58.0+1.0/7225.263157894737/67.0*x^67.0-1.0/7768.378378378378/68.0*x^68.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.875*x^4.0+1.8333333333333333*x^4.0+1.7916666666666667*x^4.0-1.75*x^4.0+1.0/371927.4146341464*x^64.0-1.0/406224.0*x^65.0-1.0/321141.53846153844/x^58.0+1.0/484092.63157894736*x^67.0-1.0/528249.7297297297*x^68.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130457() {
 UsageCalculus.TestCase = 130457;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-44*-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxy^-57+43+42/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^59-41*-xyzx^60+40*-xyzx^61+39/-xyzx^62-38*-xyzx^63+37*-xyzx^64+36/-xyzx^65";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyzx";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "44.0+43.0-42.0+41.0*xyzx^60.0-40.0*xyzx^61.0-39.0/xyzx^62.0+38.0*xyzx^63.0-37.0*xyzx^64.0-36.0/xyzx^65.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+43.0*0.0-42.0*0.0+41.0*60.0*xyzx^59.0-40.0*61.0*xyzx^60.0-39.0*-62.0/xyzx^63.0+38.0*63.0*xyzx^62.0-37.0*64.0*xyzx^63.0-36.0*-65.0/xyzx^66.0";
 UsageCalculus.EqnSolArrayMap2[1] = "2460.0*xyzx^59.0-2440.0*xyzx^60.0+2418.0/xyzx^63.0+2394.0*xyzx^62.0-2368.0*xyzx^63.0+2340.0/xyzx^66.0";
 UsageCalculus.EqnSolArrayMap3[1] = "44.0+43.0-42.0+41.0*xyzx^60.0-40.0*xyzx^61.0-39.0/xyzx^62.0+38.0*xyzx^63.0-37.0*xyzx^64.0-36.0/xyzx^65.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "44.0*xyzx+43.0*xyzx-42.0*xyzx+41.0/61.0*xyzx^61.0-40.0/62.0*xyzx^62.0-39.0/-61.0/xyzx^61.0+38.0/64.0*xyzx^64.0-37.0/65.0*xyzx^65.0-36.0/-64.0/xyzx^64.0";
 UsageCalculus.EqnSolArrayMap4[1] = "44.0*xyzx+43.0*xyzx-42.0*xyzx+1.0/1.4878048780487805*xyzx^61.0-1.0/1.55*xyzx^62.0+1.0/1.564102564102564/xyzx^61.0+1.0/1.6842105263157894*xyzx^64.0-1.0/1.7567567567567568*xyzx^65.0+1.0/1.7777777777777777/xyzx^64.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "2460.0*xyzx^59.0-2440.0*xyzx^60.0+2418.0/xyzx^63.0+2394.0*xyzx^62.0-2368.0*xyzx^63.0+2340.0/xyzx^66.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "2460.0*59.0*xyzx^58.0-2440.0*60.0*xyzx^59.0+2418.0*-63.0/xyzx^64.0+2394.0*62.0*xyzx^61.0-2368.0*63.0*xyzx^62.0+2340.0*-66.0/xyzx^67.0";
 UsageCalculus.EqnSolArrayMap2[2] = "145140.0*xyzx^58.0-146400.0*xyzx^59.0-152334.0/xyzx^64.0+148428.0*xyzx^61.0-149184.0*xyzx^62.0-154440.0/xyzx^67.0";
 UsageCalculus.EqnSolArrayMap3[2] = "44.0*xyzx+43.0*xyzx-42.0*xyzx+1.0/1.4878048780487805*xyzx^61.0-1.0/1.55*xyzx^62.0+1.0/1.564102564102564/xyzx^61.0+1.0/1.6842105263157894*xyzx^64.0-1.0/1.7567567567567568*xyzx^65.0+1.0/1.7777777777777777/xyzx^64.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "44.0/2.0*xyzx^2.0+43.0/2.0*xyzx^2.0-42.0/2.0*xyzx^2.0+1.0/1.4878048780487805/62.0*xyzx^62.0-1.0/1.55/63.0*xyzx^63.0+1.0/1.564102564102564/-60.0/xyzx^60.0+1.0/1.6842105263157894/65.0*xyzx^65.0-1.0/1.7567567567567568/66.0*xyzx^66.0+1.0/1.7777777777777777/-63.0/xyzx^63.0";
 UsageCalculus.EqnSolArrayMap4[2] = "22.0*xyzx^2.0+21.5*xyzx^2.0-21.0*xyzx^2.0+1.0/92.2439024390244*xyzx^62.0-1.0/97.65*xyzx^63.0-1.0/93.84615384615384/xyzx^60.0+1.0/109.47368421052632*xyzx^65.0-1.0/115.94594594594595*xyzx^66.0-1.0/112.0/xyzx^63.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "145140.0*xyzx^58.0-146400.0*xyzx^59.0-152334.0/xyzx^64.0+148428.0*xyzx^61.0-149184.0*xyzx^62.0-154440.0/xyzx^67.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "145140.0*58.0*xyzx^57.0-146400.0*59.0*xyzx^58.0-152334.0*-64.0/xyzx^65.0+148428.0*61.0*xyzx^60.0-149184.0*62.0*xyzx^61.0-154440.0*-67.0/xyzx^68.0";
 UsageCalculus.EqnSolArrayMap2[3] = "8418120.0*xyzx^57.0-8637600.0*xyzx^58.0+9749376.0/xyzx^65.0+9054108.0*xyzx^60.0-9249408.0*xyzx^61.0+1.034748E7/xyzx^68.0";
 UsageCalculus.EqnSolArrayMap3[3] = "22.0*xyzx^2.0+21.5*xyzx^2.0-21.0*xyzx^2.0+1.0/92.2439024390244*xyzx^62.0-1.0/97.65*xyzx^63.0-1.0/93.84615384615384/xyzx^60.0+1.0/109.47368421052632*xyzx^65.0-1.0/115.94594594594595*xyzx^66.0-1.0/112.0/xyzx^63.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "22.0/3.0*xyzx^3.0+21.5/3.0*xyzx^3.0-21.0/3.0*xyzx^3.0+1.0/92.2439024390244/63.0*xyzx^63.0-1.0/97.65/64.0*xyzx^64.0-1.0/93.84615384615384/-59.0/xyzx^59.0+1.0/109.47368421052632/66.0*xyzx^66.0-1.0/115.94594594594595/67.0*xyzx^67.0-1.0/112.0/-62.0/xyzx^62.0";
 UsageCalculus.EqnSolArrayMap4[3] = "7.333333333333333*xyzx^3.0+7.166666666666667*xyzx^3.0-7.0*xyzx^3.0+1.0/5811.365853658537*xyzx^63.0-1.0/6249.6*xyzx^64.0+1.0/5536.923076923076/xyzx^59.0+1.0/7225.263157894737*xyzx^66.0-1.0/7768.378378378378*xyzx^67.0+1.0/6944.0/xyzx^62.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "8418120.0*xyzx^57.0-8637600.0*xyzx^58.0+9749376.0/xyzx^65.0+9054108.0*xyzx^60.0-9249408.0*xyzx^61.0+1.034748E7/xyzx^68.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "8418120.0*57.0*xyzx^56.0-8637600.0*58.0*xyzx^57.0+9749376.0*-65.0/xyzx^66.0+9054108.0*60.0*xyzx^59.0-9249408.0*61.0*xyzx^60.0+0.0*-68.0/xyzx^69.0";
 UsageCalculus.EqnSolArrayMap2[4] = "4.7983284E8*xyzx^56.0-5.009808E8*xyzx^57.0-6.3370944E8/xyzx^66.0+5.4324648E8*xyzx^59.0-5.64213888E8*xyzx^60.0-0.0/xyzx^69.0";
 UsageCalculus.EqnSolArrayMap3[4] = "7.333333333333333*xyzx^3.0+7.166666666666667*xyzx^3.0-7.0*xyzx^3.0+1.0/5811.365853658537*xyzx^63.0-1.0/6249.6*xyzx^64.0+1.0/5536.923076923076/xyzx^59.0+1.0/7225.263157894737*xyzx^66.0-1.0/7768.378378378378*xyzx^67.0+1.0/6944.0/xyzx^62.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "7.333333333333333/4.0*xyzx^4.0+7.166666666666667/4.0*xyzx^4.0-7.0/4.0*xyzx^4.0+1.0/5811.365853658537/64.0*xyzx^64.0-1.0/6249.6/65.0*xyzx^65.0+1.0/5536.923076923076/-58.0/xyzx^58.0+1.0/7225.263157894737/67.0*xyzx^67.0-1.0/7768.378378378378/68.0*xyzx^68.0+1.0/6944.0/-61.0/xyzx^61.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.8333333333333333*xyzx^4.0+1.7916666666666667*xyzx^4.0-1.75*xyzx^4.0+1.0/371927.4146341464*xyzx^64.0-1.0/406224.0*xyzx^65.0-1.0/321141.53846153844/xyzx^58.0+1.0/484092.63157894736*xyzx^67.0-1.0/528249.7297297297*xyzx^68.0-1.0/423584.0/xyzx^61.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130458() {
 UsageCalculus.TestCase = 130458;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+43+42/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^59-41*-x^60+40*-x^61+39/-x^62-38*-x^63+37*-x^64+36/-x^65-35*-x^66";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "43.0-42.0+41.0*x^60.0-40.0*x^61.0-39.0/x^62.0+38.0*x^63.0-37.0*x^64.0-36.0/x^65.0+35.0*x^66.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0-42.0*0.0+41.0*60.0*x^59.0-40.0*61.0*x^60.0-39.0*-62.0/x^63.0+38.0*63.0*x^62.0-37.0*64.0*x^63.0-36.0*-65.0/x^66.0+35.0*66.0*x^65.0";
 UsageCalculus.EqnSolArrayMap2[1] = "2460.0*x^59.0-2440.0*x^60.0+2418.0/x^63.0+2394.0*x^62.0-2368.0*x^63.0+2340.0/x^66.0+2310.0*x^65.0";
 UsageCalculus.EqnSolArrayMap3[1] = "43.0-42.0+41.0*x^60.0-40.0*x^61.0-39.0/x^62.0+38.0*x^63.0-37.0*x^64.0-36.0/x^65.0+35.0*x^66.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "43.0*x-42.0*x+41.0/61.0*x^61.0-40.0/62.0*x^62.0-39.0/-61.0/x^61.0+38.0/64.0*x^64.0-37.0/65.0*x^65.0-36.0/-64.0/x^64.0+35.0/67.0*x^67.0";
 UsageCalculus.EqnSolArrayMap4[1] = "43.0*x-42.0*x+1.0/1.4878048780487805*x^61.0-1.0/1.55*x^62.0+1.0/1.564102564102564/x^61.0+1.0/1.6842105263157894*x^64.0-1.0/1.7567567567567568*x^65.0+1.0/1.7777777777777777/x^64.0+1.0/1.9142857142857144*x^67.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "2460.0*x^59.0-2440.0*x^60.0+2418.0/x^63.0+2394.0*x^62.0-2368.0*x^63.0+2340.0/x^66.0+2310.0*x^65.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "2460.0*59.0*x^58.0-2440.0*60.0*x^59.0+2418.0*-63.0/x^64.0+2394.0*62.0*x^61.0-2368.0*63.0*x^62.0+2340.0*-66.0/x^67.0+2310.0*65.0*x^64.0";
 UsageCalculus.EqnSolArrayMap2[2] = "145140.0*x^58.0-146400.0*x^59.0-152334.0/x^64.0+148428.0*x^61.0-149184.0*x^62.0-154440.0/x^67.0+150150.0*x^64.0";
 UsageCalculus.EqnSolArrayMap3[2] = "43.0*x-42.0*x+1.0/1.4878048780487805*x^61.0-1.0/1.55*x^62.0+1.0/1.564102564102564/x^61.0+1.0/1.6842105263157894*x^64.0-1.0/1.7567567567567568*x^65.0+1.0/1.7777777777777777/x^64.0+1.0/1.9142857142857144*x^67.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "43.0/2.0*x^2.0-42.0/2.0*x^2.0+1.0/1.4878048780487805/62.0*x^62.0-1.0/1.55/63.0*x^63.0+1.0/1.564102564102564/-60.0/x^60.0+1.0/1.6842105263157894/65.0*x^65.0-1.0/1.7567567567567568/66.0*x^66.0+1.0/1.7777777777777777/-63.0/x^63.0+1.0/1.9142857142857144/68.0*x^68.0";
 UsageCalculus.EqnSolArrayMap4[2] = "21.5*x^2.0-21.0*x^2.0+1.0/92.2439024390244*x^62.0-1.0/97.65*x^63.0-1.0/93.84615384615384/x^60.0+1.0/109.47368421052632*x^65.0-1.0/115.94594594594595*x^66.0-1.0/112.0/x^63.0+1.0/130.17142857142858*x^68.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "145140.0*x^58.0-146400.0*x^59.0-152334.0/x^64.0+148428.0*x^61.0-149184.0*x^62.0-154440.0/x^67.0+150150.0*x^64.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "145140.0*58.0*x^57.0-146400.0*59.0*x^58.0-152334.0*-64.0/x^65.0+148428.0*61.0*x^60.0-149184.0*62.0*x^61.0-154440.0*-67.0/x^68.0+150150.0*64.0*x^63.0";
 UsageCalculus.EqnSolArrayMap2[3] = "8418120.0*x^57.0-8637600.0*x^58.0+9749376.0/x^65.0+9054108.0*x^60.0-9249408.0*x^61.0+1.034748E7/x^68.0+9609600.0*x^63.0";
 UsageCalculus.EqnSolArrayMap3[3] = "21.5*x^2.0-21.0*x^2.0+1.0/92.2439024390244*x^62.0-1.0/97.65*x^63.0-1.0/93.84615384615384/x^60.0+1.0/109.47368421052632*x^65.0-1.0/115.94594594594595*x^66.0-1.0/112.0/x^63.0+1.0/130.17142857142858*x^68.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "21.5/3.0*x^3.0-21.0/3.0*x^3.0+1.0/92.2439024390244/63.0*x^63.0-1.0/97.65/64.0*x^64.0-1.0/93.84615384615384/-59.0/x^59.0+1.0/109.47368421052632/66.0*x^66.0-1.0/115.94594594594595/67.0*x^67.0-1.0/112.0/-62.0/x^62.0+1.0/130.17142857142858/69.0*x^69.0";
 UsageCalculus.EqnSolArrayMap4[3] = "7.166666666666667*x^3.0-7.0*x^3.0+1.0/5811.365853658537*x^63.0-1.0/6249.6*x^64.0+1.0/5536.923076923076/x^59.0+1.0/7225.263157894737*x^66.0-1.0/7768.378378378378*x^67.0+1.0/6944.0/x^62.0+1.0/8981.828571428572*x^69.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "8418120.0*x^57.0-8637600.0*x^58.0+9749376.0/x^65.0+9054108.0*x^60.0-9249408.0*x^61.0+1.034748E7/x^68.0+9609600.0*x^63.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "8418120.0*57.0*x^56.0-8637600.0*58.0*x^57.0+9749376.0*-65.0/x^66.0+9054108.0*60.0*x^59.0-9249408.0*61.0*x^60.0+0.0*-68.0/x^69.0+9609600.0*63.0*x^62.0";
 UsageCalculus.EqnSolArrayMap2[4] = "4.7983284E8*x^56.0-5.009808E8*x^57.0-6.3370944E8/x^66.0+5.4324648E8*x^59.0-5.64213888E8*x^60.0-0.0/x^69.0+6.054048E8*x^62.0";
 UsageCalculus.EqnSolArrayMap3[4] = "7.166666666666667*x^3.0-7.0*x^3.0+1.0/5811.365853658537*x^63.0-1.0/6249.6*x^64.0+1.0/5536.923076923076/x^59.0+1.0/7225.263157894737*x^66.0-1.0/7768.378378378378*x^67.0+1.0/6944.0/x^62.0+1.0/8981.828571428572*x^69.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "7.166666666666667/4.0*x^4.0-7.0/4.0*x^4.0+1.0/5811.365853658537/64.0*x^64.0-1.0/6249.6/65.0*x^65.0+1.0/5536.923076923076/-58.0/x^58.0+1.0/7225.263157894737/67.0*x^67.0-1.0/7768.378378378378/68.0*x^68.0+1.0/6944.0/-61.0/x^61.0+1.0/8981.828571428572/70.0*x^70.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.7916666666666667*x^4.0-1.75*x^4.0+1.0/371927.4146341464*x^64.0-1.0/406224.0*x^65.0-1.0/321141.53846153844/x^58.0+1.0/484092.63157894736*x^67.0-1.0/528249.7297297297*x^68.0-1.0/423584.0/x^61.0+1.0/628728.0*x^70.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130459() {
 UsageCalculus.TestCase = 130459;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+42/-xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^59-41*-xy^60+40*-xy^61+39/-xy^62-38*-xy^63+37*-xy^64+36/-xy^65-35*-xy^66+34*-xy^67";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-42.0+41.0*xy^60.0-40.0*xy^61.0-39.0/xy^62.0+38.0*xy^63.0-37.0*xy^64.0-36.0/xy^65.0+35.0*xy^66.0-34.0*xy^67.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0+41.0*60.0*xy^59.0-40.0*61.0*xy^60.0-39.0*-62.0/xy^63.0+38.0*63.0*xy^62.0-37.0*64.0*xy^63.0-36.0*-65.0/xy^66.0+35.0*66.0*xy^65.0-34.0*67.0*xy^66.0";
 UsageCalculus.EqnSolArrayMap2[1] = "2460.0*xy^59.0-2440.0*xy^60.0+2418.0/xy^63.0+2394.0*xy^62.0-2368.0*xy^63.0+2340.0/xy^66.0+2310.0*xy^65.0-2278.0*xy^66.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-42.0+41.0*xy^60.0-40.0*xy^61.0-39.0/xy^62.0+38.0*xy^63.0-37.0*xy^64.0-36.0/xy^65.0+35.0*xy^66.0-34.0*xy^67.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-42.0*xy+41.0/61.0*xy^61.0-40.0/62.0*xy^62.0-39.0/-61.0/xy^61.0+38.0/64.0*xy^64.0-37.0/65.0*xy^65.0-36.0/-64.0/xy^64.0+35.0/67.0*xy^67.0-34.0/68.0*xy^68.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-42.0*xy+1.0/1.4878048780487805*xy^61.0-1.0/1.55*xy^62.0+1.0/1.564102564102564/xy^61.0+1.0/1.6842105263157894*xy^64.0-1.0/1.7567567567567568*xy^65.0+1.0/1.7777777777777777/xy^64.0+1.0/1.9142857142857144*xy^67.0-1.0/2.0*xy^68.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "2460.0*xy^59.0-2440.0*xy^60.0+2418.0/xy^63.0+2394.0*xy^62.0-2368.0*xy^63.0+2340.0/xy^66.0+2310.0*xy^65.0-2278.0*xy^66.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "2460.0*59.0*xy^58.0-2440.0*60.0*xy^59.0+2418.0*-63.0/xy^64.0+2394.0*62.0*xy^61.0-2368.0*63.0*xy^62.0+2340.0*-66.0/xy^67.0+2310.0*65.0*xy^64.0-2278.0*66.0*xy^65.0";
 UsageCalculus.EqnSolArrayMap2[2] = "145140.0*xy^58.0-146400.0*xy^59.0-152334.0/xy^64.0+148428.0*xy^61.0-149184.0*xy^62.0-154440.0/xy^67.0+150150.0*xy^64.0-150348.0*xy^65.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-42.0*xy+1.0/1.4878048780487805*xy^61.0-1.0/1.55*xy^62.0+1.0/1.564102564102564/xy^61.0+1.0/1.6842105263157894*xy^64.0-1.0/1.7567567567567568*xy^65.0+1.0/1.7777777777777777/xy^64.0+1.0/1.9142857142857144*xy^67.0-1.0/2.0*xy^68.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-42.0/2.0*xy^2.0+1.0/1.4878048780487805/62.0*xy^62.0-1.0/1.55/63.0*xy^63.0+1.0/1.564102564102564/-60.0/xy^60.0+1.0/1.6842105263157894/65.0*xy^65.0-1.0/1.7567567567567568/66.0*xy^66.0+1.0/1.7777777777777777/-63.0/xy^63.0+1.0/1.9142857142857144/68.0*xy^68.0-1.0/2.0/69.0*xy^69.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-21.0*xy^2.0+1.0/92.2439024390244*xy^62.0-1.0/97.65*xy^63.0-1.0/93.84615384615384/xy^60.0+1.0/109.47368421052632*xy^65.0-1.0/115.94594594594595*xy^66.0-1.0/112.0/xy^63.0+1.0/130.17142857142858*xy^68.0-1.0/138.0*xy^69.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "145140.0*xy^58.0-146400.0*xy^59.0-152334.0/xy^64.0+148428.0*xy^61.0-149184.0*xy^62.0-154440.0/xy^67.0+150150.0*xy^64.0-150348.0*xy^65.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "145140.0*58.0*xy^57.0-146400.0*59.0*xy^58.0-152334.0*-64.0/xy^65.0+148428.0*61.0*xy^60.0-149184.0*62.0*xy^61.0-154440.0*-67.0/xy^68.0+150150.0*64.0*xy^63.0-150348.0*65.0*xy^64.0";
 UsageCalculus.EqnSolArrayMap2[3] = "8418120.0*xy^57.0-8637600.0*xy^58.0+9749376.0/xy^65.0+9054108.0*xy^60.0-9249408.0*xy^61.0+1.034748E7/xy^68.0+9609600.0*xy^63.0-9772620.0*xy^64.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-21.0*xy^2.0+1.0/92.2439024390244*xy^62.0-1.0/97.65*xy^63.0-1.0/93.84615384615384/xy^60.0+1.0/109.47368421052632*xy^65.0-1.0/115.94594594594595*xy^66.0-1.0/112.0/xy^63.0+1.0/130.17142857142858*xy^68.0-1.0/138.0*xy^69.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-21.0/3.0*xy^3.0+1.0/92.2439024390244/63.0*xy^63.0-1.0/97.65/64.0*xy^64.0-1.0/93.84615384615384/-59.0/xy^59.0+1.0/109.47368421052632/66.0*xy^66.0-1.0/115.94594594594595/67.0*xy^67.0-1.0/112.0/-62.0/xy^62.0+1.0/130.17142857142858/69.0*xy^69.0-1.0/138.0/70.0*xy^70.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-7.0*xy^3.0+1.0/5811.365853658537*xy^63.0-1.0/6249.6*xy^64.0+1.0/5536.923076923076/xy^59.0+1.0/7225.263157894737*xy^66.0-1.0/7768.378378378378*xy^67.0+1.0/6944.0/xy^62.0+1.0/8981.828571428572*xy^69.0-1.0/9660.0*xy^70.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "8418120.0*xy^57.0-8637600.0*xy^58.0+9749376.0/xy^65.0+9054108.0*xy^60.0-9249408.0*xy^61.0+1.034748E7/xy^68.0+9609600.0*xy^63.0-9772620.0*xy^64.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "8418120.0*57.0*xy^56.0-8637600.0*58.0*xy^57.0+9749376.0*-65.0/xy^66.0+9054108.0*60.0*xy^59.0-9249408.0*61.0*xy^60.0+0.0*-68.0/xy^69.0+9609600.0*63.0*xy^62.0-9772620.0*64.0*xy^63.0";
 UsageCalculus.EqnSolArrayMap2[4] = "4.7983284E8*xy^56.0-5.009808E8*xy^57.0-6.3370944E8/xy^66.0+5.4324648E8*xy^59.0-5.64213888E8*xy^60.0-0.0/xy^69.0+6.054048E8*xy^62.0-6.2544768E8*xy^63.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-7.0*xy^3.0+1.0/5811.365853658537*xy^63.0-1.0/6249.6*xy^64.0+1.0/5536.923076923076/xy^59.0+1.0/7225.263157894737*xy^66.0-1.0/7768.378378378378*xy^67.0+1.0/6944.0/xy^62.0+1.0/8981.828571428572*xy^69.0-1.0/9660.0*xy^70.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-7.0/4.0*xy^4.0+1.0/5811.365853658537/64.0*xy^64.0-1.0/6249.6/65.0*xy^65.0+1.0/5536.923076923076/-58.0/xy^58.0+1.0/7225.263157894737/67.0*xy^67.0-1.0/7768.378378378378/68.0*xy^68.0+1.0/6944.0/-61.0/xy^61.0+1.0/8981.828571428572/70.0*xy^70.0-1.0/9660.0/71.0*xy^71.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.75*xy^4.0+1.0/371927.4146341464*xy^64.0-1.0/406224.0*xy^65.0-1.0/321141.53846153844/xy^58.0+1.0/484092.63157894736*xy^67.0-1.0/528249.7297297297*xy^68.0-1.0/423584.0/xy^61.0+1.0/628728.0*xy^70.0-1.0/685860.0*xy^71.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130460() {
 UsageCalculus.TestCase = 130460;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-41*-x^60+40*-x^61+39/-x^62-38*-x^63+37*-x^64+36/-x^65-35*-x^66+34*-x^67+33/-x^68";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "41.0*x^60.0-40.0*x^61.0-39.0/x^62.0+38.0*x^63.0-37.0*x^64.0-36.0/x^65.0+35.0*x^66.0-34.0*x^67.0-33.0/x^68.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "41.0*60.0*x^59.0-40.0*61.0*x^60.0-39.0*-62.0/x^63.0+38.0*63.0*x^62.0-37.0*64.0*x^63.0-36.0*-65.0/x^66.0+35.0*66.0*x^65.0-34.0*67.0*x^66.0-33.0*-68.0/x^69.0";
 UsageCalculus.EqnSolArrayMap2[1] = "2460.0*x^59.0-2440.0*x^60.0+2418.0/x^63.0+2394.0*x^62.0-2368.0*x^63.0+2340.0/x^66.0+2310.0*x^65.0-2278.0*x^66.0+2244.0/x^69.0";
 UsageCalculus.EqnSolArrayMap3[1] = "41.0*x^60.0-40.0*x^61.0-39.0/x^62.0+38.0*x^63.0-37.0*x^64.0-36.0/x^65.0+35.0*x^66.0-34.0*x^67.0-33.0/x^68.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "41.0/61.0*x^61.0-40.0/62.0*x^62.0-39.0/-61.0/x^61.0+38.0/64.0*x^64.0-37.0/65.0*x^65.0-36.0/-64.0/x^64.0+35.0/67.0*x^67.0-34.0/68.0*x^68.0-33.0/-67.0/x^67.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/1.4878048780487805*x^61.0-1.0/1.55*x^62.0+1.0/1.564102564102564/x^61.0+1.0/1.6842105263157894*x^64.0-1.0/1.7567567567567568*x^65.0+1.0/1.7777777777777777/x^64.0+1.0/1.9142857142857144*x^67.0-1.0/2.0*x^68.0+1.0/2.0303030303030303/x^67.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "2460.0*x^59.0-2440.0*x^60.0+2418.0/x^63.0+2394.0*x^62.0-2368.0*x^63.0+2340.0/x^66.0+2310.0*x^65.0-2278.0*x^66.0+2244.0/x^69.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "2460.0*59.0*x^58.0-2440.0*60.0*x^59.0+2418.0*-63.0/x^64.0+2394.0*62.0*x^61.0-2368.0*63.0*x^62.0+2340.0*-66.0/x^67.0+2310.0*65.0*x^64.0-2278.0*66.0*x^65.0+2244.0*-69.0/x^70.0";
 UsageCalculus.EqnSolArrayMap2[2] = "145140.0*x^58.0-146400.0*x^59.0-152334.0/x^64.0+148428.0*x^61.0-149184.0*x^62.0-154440.0/x^67.0+150150.0*x^64.0-150348.0*x^65.0-154836.0/x^70.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/1.4878048780487805*x^61.0-1.0/1.55*x^62.0+1.0/1.564102564102564/x^61.0+1.0/1.6842105263157894*x^64.0-1.0/1.7567567567567568*x^65.0+1.0/1.7777777777777777/x^64.0+1.0/1.9142857142857144*x^67.0-1.0/2.0*x^68.0+1.0/2.0303030303030303/x^67.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/1.4878048780487805/62.0*x^62.0-1.0/1.55/63.0*x^63.0+1.0/1.564102564102564/-60.0/x^60.0+1.0/1.6842105263157894/65.0*x^65.0-1.0/1.7567567567567568/66.0*x^66.0+1.0/1.7777777777777777/-63.0/x^63.0+1.0/1.9142857142857144/68.0*x^68.0-1.0/2.0/69.0*x^69.0+1.0/2.0303030303030303/-66.0/x^66.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/92.2439024390244*x^62.0-1.0/97.65*x^63.0-1.0/93.84615384615384/x^60.0+1.0/109.47368421052632*x^65.0-1.0/115.94594594594595*x^66.0-1.0/112.0/x^63.0+1.0/130.17142857142858*x^68.0-1.0/138.0*x^69.0-1.0/134.0/x^66.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "145140.0*x^58.0-146400.0*x^59.0-152334.0/x^64.0+148428.0*x^61.0-149184.0*x^62.0-154440.0/x^67.0+150150.0*x^64.0-150348.0*x^65.0-154836.0/x^70.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "145140.0*58.0*x^57.0-146400.0*59.0*x^58.0-152334.0*-64.0/x^65.0+148428.0*61.0*x^60.0-149184.0*62.0*x^61.0-154440.0*-67.0/x^68.0+150150.0*64.0*x^63.0-150348.0*65.0*x^64.0-154836.0*-70.0/x^71.0";
 UsageCalculus.EqnSolArrayMap2[3] = "8418120.0*x^57.0-8637600.0*x^58.0+9749376.0/x^65.0+9054108.0*x^60.0-9249408.0*x^61.0+1.034748E7/x^68.0+9609600.0*x^63.0-9772620.0*x^64.0+1.083852E7/x^71.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/92.2439024390244*x^62.0-1.0/97.65*x^63.0-1.0/93.84615384615384/x^60.0+1.0/109.47368421052632*x^65.0-1.0/115.94594594594595*x^66.0-1.0/112.0/x^63.0+1.0/130.17142857142858*x^68.0-1.0/138.0*x^69.0-1.0/134.0/x^66.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/92.2439024390244/63.0*x^63.0-1.0/97.65/64.0*x^64.0-1.0/93.84615384615384/-59.0/x^59.0+1.0/109.47368421052632/66.0*x^66.0-1.0/115.94594594594595/67.0*x^67.0-1.0/112.0/-62.0/x^62.0+1.0/130.17142857142858/69.0*x^69.0-1.0/138.0/70.0*x^70.0-1.0/134.0/-65.0/x^65.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/5811.365853658537*x^63.0-1.0/6249.6*x^64.0+1.0/5536.923076923076/x^59.0+1.0/7225.263157894737*x^66.0-1.0/7768.378378378378*x^67.0+1.0/6944.0/x^62.0+1.0/8981.828571428572*x^69.0-1.0/9660.0*x^70.0+1.0/8710.0/x^65.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "8418120.0*x^57.0-8637600.0*x^58.0+9749376.0/x^65.0+9054108.0*x^60.0-9249408.0*x^61.0+1.034748E7/x^68.0+9609600.0*x^63.0-9772620.0*x^64.0+1.083852E7/x^71.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "8418120.0*57.0*x^56.0-8637600.0*58.0*x^57.0+9749376.0*-65.0/x^66.0+9054108.0*60.0*x^59.0-9249408.0*61.0*x^60.0+0.0*-68.0/x^69.0+9609600.0*63.0*x^62.0-9772620.0*64.0*x^63.0+0.0*-71.0/x^72.0";
 UsageCalculus.EqnSolArrayMap2[4] = "4.7983284E8*x^56.0-5.009808E8*x^57.0-6.3370944E8/x^66.0+5.4324648E8*x^59.0-5.64213888E8*x^60.0-0.0/x^69.0+6.054048E8*x^62.0-6.2544768E8*x^63.0-0.0/x^72.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/5811.365853658537*x^63.0-1.0/6249.6*x^64.0+1.0/5536.923076923076/x^59.0+1.0/7225.263157894737*x^66.0-1.0/7768.378378378378*x^67.0+1.0/6944.0/x^62.0+1.0/8981.828571428572*x^69.0-1.0/9660.0*x^70.0+1.0/8710.0/x^65.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/5811.365853658537/64.0*x^64.0-1.0/6249.6/65.0*x^65.0+1.0/5536.923076923076/-58.0/x^58.0+1.0/7225.263157894737/67.0*x^67.0-1.0/7768.378378378378/68.0*x^68.0+1.0/6944.0/-61.0/x^61.0+1.0/8981.828571428572/70.0*x^70.0-1.0/9660.0/71.0*x^71.0+1.0/8710.0/-64.0/x^64.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/371927.4146341464*x^64.0-1.0/406224.0*x^65.0-1.0/321141.53846153844/x^58.0+1.0/484092.63157894736*x^67.0-1.0/528249.7297297297*x^68.0-1.0/423584.0/x^61.0+1.0/628728.0*x^70.0-1.0/685860.0*x^71.0-1.0/557440.0/x^64.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130461() {
 UsageCalculus.TestCase = 130461;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+40*-xyzx^61+39/-xyzx^62-38*-xyzx^63+37*-xyzx^64+36/-xyzx^65-35*-xyzx^66+34*-xyzx^67+33/-xyzx^68-32*-xyzx^69";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyzx";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-40.0*xyzx^61.0-39.0/xyzx^62.0+38.0*xyzx^63.0-37.0*xyzx^64.0-36.0/xyzx^65.0+35.0*xyzx^66.0-34.0*xyzx^67.0-33.0/xyzx^68.0+32.0*xyzx^69.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-40.0*61.0*xyzx^60.0-39.0*-62.0/xyzx^63.0+38.0*63.0*xyzx^62.0-37.0*64.0*xyzx^63.0-36.0*-65.0/xyzx^66.0+35.0*66.0*xyzx^65.0-34.0*67.0*xyzx^66.0-33.0*-68.0/xyzx^69.0+32.0*69.0*xyzx^68.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-2440.0*xyzx^60.0+2418.0/xyzx^63.0+2394.0*xyzx^62.0-2368.0*xyzx^63.0+2340.0/xyzx^66.0+2310.0*xyzx^65.0-2278.0*xyzx^66.0+2244.0/xyzx^69.0+2208.0*xyzx^68.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-40.0*xyzx^61.0-39.0/xyzx^62.0+38.0*xyzx^63.0-37.0*xyzx^64.0-36.0/xyzx^65.0+35.0*xyzx^66.0-34.0*xyzx^67.0-33.0/xyzx^68.0+32.0*xyzx^69.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-40.0/62.0*xyzx^62.0-39.0/-61.0/xyzx^61.0+38.0/64.0*xyzx^64.0-37.0/65.0*xyzx^65.0-36.0/-64.0/xyzx^64.0+35.0/67.0*xyzx^67.0-34.0/68.0*xyzx^68.0-33.0/-67.0/xyzx^67.0+32.0/70.0*xyzx^70.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/1.55*xyzx^62.0+1.0/1.564102564102564/xyzx^61.0+1.0/1.6842105263157894*xyzx^64.0-1.0/1.7567567567567568*xyzx^65.0+1.0/1.7777777777777777/xyzx^64.0+1.0/1.9142857142857144*xyzx^67.0-1.0/2.0*xyzx^68.0+1.0/2.0303030303030303/xyzx^67.0+1.0/2.1875*xyzx^70.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-2440.0*xyzx^60.0+2418.0/xyzx^63.0+2394.0*xyzx^62.0-2368.0*xyzx^63.0+2340.0/xyzx^66.0+2310.0*xyzx^65.0-2278.0*xyzx^66.0+2244.0/xyzx^69.0+2208.0*xyzx^68.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-2440.0*60.0*xyzx^59.0+2418.0*-63.0/xyzx^64.0+2394.0*62.0*xyzx^61.0-2368.0*63.0*xyzx^62.0+2340.0*-66.0/xyzx^67.0+2310.0*65.0*xyzx^64.0-2278.0*66.0*xyzx^65.0+2244.0*-69.0/xyzx^70.0+2208.0*68.0*xyzx^67.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-146400.0*xyzx^59.0-152334.0/xyzx^64.0+148428.0*xyzx^61.0-149184.0*xyzx^62.0-154440.0/xyzx^67.0+150150.0*xyzx^64.0-150348.0*xyzx^65.0-154836.0/xyzx^70.0+150144.0*xyzx^67.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/1.55*xyzx^62.0+1.0/1.564102564102564/xyzx^61.0+1.0/1.6842105263157894*xyzx^64.0-1.0/1.7567567567567568*xyzx^65.0+1.0/1.7777777777777777/xyzx^64.0+1.0/1.9142857142857144*xyzx^67.0-1.0/2.0*xyzx^68.0+1.0/2.0303030303030303/xyzx^67.0+1.0/2.1875*xyzx^70.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/1.55/63.0*xyzx^63.0+1.0/1.564102564102564/-60.0/xyzx^60.0+1.0/1.6842105263157894/65.0*xyzx^65.0-1.0/1.7567567567567568/66.0*xyzx^66.0+1.0/1.7777777777777777/-63.0/xyzx^63.0+1.0/1.9142857142857144/68.0*xyzx^68.0-1.0/2.0/69.0*xyzx^69.0+1.0/2.0303030303030303/-66.0/xyzx^66.0+1.0/2.1875/71.0*xyzx^71.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/97.65*xyzx^63.0-1.0/93.84615384615384/xyzx^60.0+1.0/109.47368421052632*xyzx^65.0-1.0/115.94594594594595*xyzx^66.0-1.0/112.0/xyzx^63.0+1.0/130.17142857142858*xyzx^68.0-1.0/138.0*xyzx^69.0-1.0/134.0/xyzx^66.0+1.0/155.3125*xyzx^71.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-146400.0*xyzx^59.0-152334.0/xyzx^64.0+148428.0*xyzx^61.0-149184.0*xyzx^62.0-154440.0/xyzx^67.0+150150.0*xyzx^64.0-150348.0*xyzx^65.0-154836.0/xyzx^70.0+150144.0*xyzx^67.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-146400.0*59.0*xyzx^58.0-152334.0*-64.0/xyzx^65.0+148428.0*61.0*xyzx^60.0-149184.0*62.0*xyzx^61.0-154440.0*-67.0/xyzx^68.0+150150.0*64.0*xyzx^63.0-150348.0*65.0*xyzx^64.0-154836.0*-70.0/xyzx^71.0+150144.0*67.0*xyzx^66.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-8637600.0*xyzx^58.0+9749376.0/xyzx^65.0+9054108.0*xyzx^60.0-9249408.0*xyzx^61.0+1.034748E7/xyzx^68.0+9609600.0*xyzx^63.0-9772620.0*xyzx^64.0+1.083852E7/xyzx^71.0+1.0059648E7*xyzx^66.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/97.65*xyzx^63.0-1.0/93.84615384615384/xyzx^60.0+1.0/109.47368421052632*xyzx^65.0-1.0/115.94594594594595*xyzx^66.0-1.0/112.0/xyzx^63.0+1.0/130.17142857142858*xyzx^68.0-1.0/138.0*xyzx^69.0-1.0/134.0/xyzx^66.0+1.0/155.3125*xyzx^71.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/97.65/64.0*xyzx^64.0-1.0/93.84615384615384/-59.0/xyzx^59.0+1.0/109.47368421052632/66.0*xyzx^66.0-1.0/115.94594594594595/67.0*xyzx^67.0-1.0/112.0/-62.0/xyzx^62.0+1.0/130.17142857142858/69.0*xyzx^69.0-1.0/138.0/70.0*xyzx^70.0-1.0/134.0/-65.0/xyzx^65.0+1.0/155.3125/72.0*xyzx^72.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/6249.6*xyzx^64.0+1.0/5536.923076923076/xyzx^59.0+1.0/7225.263157894737*xyzx^66.0-1.0/7768.378378378378*xyzx^67.0+1.0/6944.0/xyzx^62.0+1.0/8981.828571428572*xyzx^69.0-1.0/9660.0*xyzx^70.0+1.0/8710.0/xyzx^65.0+1.0/11182.5*xyzx^72.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-8637600.0*xyzx^58.0+9749376.0/xyzx^65.0+9054108.0*xyzx^60.0-9249408.0*xyzx^61.0+1.034748E7/xyzx^68.0+9609600.0*xyzx^63.0-9772620.0*xyzx^64.0+1.083852E7/xyzx^71.0+1.0059648E7*xyzx^66.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-8637600.0*58.0*xyzx^57.0+9749376.0*-65.0/xyzx^66.0+9054108.0*60.0*xyzx^59.0-9249408.0*61.0*xyzx^60.0+0.0*-68.0/xyzx^69.0+9609600.0*63.0*xyzx^62.0-9772620.0*64.0*xyzx^63.0+0.0*-71.0/xyzx^72.0+0.0*66.0*xyzx^65.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-5.009808E8*xyzx^57.0-6.3370944E8/xyzx^66.0+5.4324648E8*xyzx^59.0-5.64213888E8*xyzx^60.0-0.0/xyzx^69.0+6.054048E8*xyzx^62.0-6.2544768E8*xyzx^63.0-0.0/xyzx^72.0+0.0*xyzx^65.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/6249.6*xyzx^64.0+1.0/5536.923076923076/xyzx^59.0+1.0/7225.263157894737*xyzx^66.0-1.0/7768.378378378378*xyzx^67.0+1.0/6944.0/xyzx^62.0+1.0/8981.828571428572*xyzx^69.0-1.0/9660.0*xyzx^70.0+1.0/8710.0/xyzx^65.0+1.0/11182.5*xyzx^72.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/6249.6/65.0*xyzx^65.0+1.0/5536.923076923076/-58.0/xyzx^58.0+1.0/7225.263157894737/67.0*xyzx^67.0-1.0/7768.378378378378/68.0*xyzx^68.0+1.0/6944.0/-61.0/xyzx^61.0+1.0/8981.828571428572/70.0*xyzx^70.0-1.0/9660.0/71.0*xyzx^71.0+1.0/8710.0/-64.0/xyzx^64.0+1.0/11182.5/73.0*xyzx^73.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/406224.0*xyzx^65.0-1.0/321141.53846153844/xyzx^58.0+1.0/484092.63157894736*xyzx^67.0-1.0/528249.7297297297*xyzx^68.0-1.0/423584.0/xyzx^61.0+1.0/628728.0*xyzx^70.0-1.0/685860.0*xyzx^71.0-1.0/557440.0/xyzx^64.0+1.0/816322.5*xyzx^73.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130462() {
 UsageCalculus.TestCase = 130462;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+39/-x^62-38*-x^63+37*-x^64+36/-x^65-35*-x^66+34*-x^67+33/-x^68-32*-x^69+31*-x^70";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-39.0/x^62.0+38.0*x^63.0-37.0*x^64.0-36.0/x^65.0+35.0*x^66.0-34.0*x^67.0-33.0/x^68.0+32.0*x^69.0-31.0*x^70.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-39.0*-62.0/x^63.0+38.0*63.0*x^62.0-37.0*64.0*x^63.0-36.0*-65.0/x^66.0+35.0*66.0*x^65.0-34.0*67.0*x^66.0-33.0*-68.0/x^69.0+32.0*69.0*x^68.0-31.0*70.0*x^69.0";
 UsageCalculus.EqnSolArrayMap2[1] = "2418.0/x^63.0+2394.0*x^62.0-2368.0*x^63.0+2340.0/x^66.0+2310.0*x^65.0-2278.0*x^66.0+2244.0/x^69.0+2208.0*x^68.0-2170.0*x^69.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-39.0/x^62.0+38.0*x^63.0-37.0*x^64.0-36.0/x^65.0+35.0*x^66.0-34.0*x^67.0-33.0/x^68.0+32.0*x^69.0-31.0*x^70.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-39.0/-61.0/x^61.0+38.0/64.0*x^64.0-37.0/65.0*x^65.0-36.0/-64.0/x^64.0+35.0/67.0*x^67.0-34.0/68.0*x^68.0-33.0/-67.0/x^67.0+32.0/70.0*x^70.0-31.0/71.0*x^71.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/1.564102564102564/x^61.0+1.0/1.6842105263157894*x^64.0-1.0/1.7567567567567568*x^65.0+1.0/1.7777777777777777/x^64.0+1.0/1.9142857142857144*x^67.0-1.0/2.0*x^68.0+1.0/2.0303030303030303/x^67.0+1.0/2.1875*x^70.0-1.0/2.2903225806451615*x^71.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "2418.0/x^63.0+2394.0*x^62.0-2368.0*x^63.0+2340.0/x^66.0+2310.0*x^65.0-2278.0*x^66.0+2244.0/x^69.0+2208.0*x^68.0-2170.0*x^69.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "2418.0*-63.0/x^64.0+2394.0*62.0*x^61.0-2368.0*63.0*x^62.0+2340.0*-66.0/x^67.0+2310.0*65.0*x^64.0-2278.0*66.0*x^65.0+2244.0*-69.0/x^70.0+2208.0*68.0*x^67.0-2170.0*69.0*x^68.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-152334.0/x^64.0+148428.0*x^61.0-149184.0*x^62.0-154440.0/x^67.0+150150.0*x^64.0-150348.0*x^65.0-154836.0/x^70.0+150144.0*x^67.0-149730.0*x^68.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/1.564102564102564/x^61.0+1.0/1.6842105263157894*x^64.0-1.0/1.7567567567567568*x^65.0+1.0/1.7777777777777777/x^64.0+1.0/1.9142857142857144*x^67.0-1.0/2.0*x^68.0+1.0/2.0303030303030303/x^67.0+1.0/2.1875*x^70.0-1.0/2.2903225806451615*x^71.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/1.564102564102564/-60.0/x^60.0+1.0/1.6842105263157894/65.0*x^65.0-1.0/1.7567567567567568/66.0*x^66.0+1.0/1.7777777777777777/-63.0/x^63.0+1.0/1.9142857142857144/68.0*x^68.0-1.0/2.0/69.0*x^69.0+1.0/2.0303030303030303/-66.0/x^66.0+1.0/2.1875/71.0*x^71.0-1.0/2.2903225806451615/72.0*x^72.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/93.84615384615384/x^60.0+1.0/109.47368421052632*x^65.0-1.0/115.94594594594595*x^66.0-1.0/112.0/x^63.0+1.0/130.17142857142858*x^68.0-1.0/138.0*x^69.0-1.0/134.0/x^66.0+1.0/155.3125*x^71.0-1.0/164.90322580645162*x^72.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-152334.0/x^64.0+148428.0*x^61.0-149184.0*x^62.0-154440.0/x^67.0+150150.0*x^64.0-150348.0*x^65.0-154836.0/x^70.0+150144.0*x^67.0-149730.0*x^68.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-152334.0*-64.0/x^65.0+148428.0*61.0*x^60.0-149184.0*62.0*x^61.0-154440.0*-67.0/x^68.0+150150.0*64.0*x^63.0-150348.0*65.0*x^64.0-154836.0*-70.0/x^71.0+150144.0*67.0*x^66.0-149730.0*68.0*x^67.0";
 UsageCalculus.EqnSolArrayMap2[3] = "9749376.0/x^65.0+9054108.0*x^60.0-9249408.0*x^61.0+1.034748E7/x^68.0+9609600.0*x^63.0-9772620.0*x^64.0+1.083852E7/x^71.0+1.0059648E7*x^66.0-1.018164E7*x^67.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/93.84615384615384/x^60.0+1.0/109.47368421052632*x^65.0-1.0/115.94594594594595*x^66.0-1.0/112.0/x^63.0+1.0/130.17142857142858*x^68.0-1.0/138.0*x^69.0-1.0/134.0/x^66.0+1.0/155.3125*x^71.0-1.0/164.90322580645162*x^72.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/93.84615384615384/-59.0/x^59.0+1.0/109.47368421052632/66.0*x^66.0-1.0/115.94594594594595/67.0*x^67.0-1.0/112.0/-62.0/x^62.0+1.0/130.17142857142858/69.0*x^69.0-1.0/138.0/70.0*x^70.0-1.0/134.0/-65.0/x^65.0+1.0/155.3125/72.0*x^72.0-1.0/164.90322580645162/73.0*x^73.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/5536.923076923076/x^59.0+1.0/7225.263157894737*x^66.0-1.0/7768.378378378378*x^67.0+1.0/6944.0/x^62.0+1.0/8981.828571428572*x^69.0-1.0/9660.0*x^70.0+1.0/8710.0/x^65.0+1.0/11182.5*x^72.0-1.0/12037.935483870968*x^73.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "9749376.0/x^65.0+9054108.0*x^60.0-9249408.0*x^61.0+1.034748E7/x^68.0+9609600.0*x^63.0-9772620.0*x^64.0+1.083852E7/x^71.0+1.0059648E7*x^66.0-1.018164E7*x^67.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "9749376.0*-65.0/x^66.0+9054108.0*60.0*x^59.0-9249408.0*61.0*x^60.0+0.0*-68.0/x^69.0+9609600.0*63.0*x^62.0-9772620.0*64.0*x^63.0+0.0*-71.0/x^72.0+66.0*x^65.0-0.0*67.0*x^66.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-6.3370944E8/x^66.0+5.4324648E8*x^59.0-5.64213888E8*x^60.0-0.0/x^69.0+6.054048E8*x^62.0-6.2544768E8*x^63.0-0.0/x^72.0+66.0*x^65.0-0.0*x^66.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/5536.923076923076/x^59.0+1.0/7225.263157894737*x^66.0-1.0/7768.378378378378*x^67.0+1.0/6944.0/x^62.0+1.0/8981.828571428572*x^69.0-1.0/9660.0*x^70.0+1.0/8710.0/x^65.0+1.0/11182.5*x^72.0-1.0/12037.935483870968*x^73.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/5536.923076923076/-58.0/x^58.0+1.0/7225.263157894737/67.0*x^67.0-1.0/7768.378378378378/68.0*x^68.0+1.0/6944.0/-61.0/x^61.0+1.0/8981.828571428572/70.0*x^70.0-1.0/9660.0/71.0*x^71.0+1.0/8710.0/-64.0/x^64.0+1.0/11182.5/73.0*x^73.0-1.0/12037.935483870968/74.0*x^74.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/321141.53846153844/x^58.0+1.0/484092.63157894736*x^67.0-1.0/528249.7297297297*x^68.0-1.0/423584.0/x^61.0+1.0/628728.0*x^70.0-1.0/685860.0*x^71.0-1.0/557440.0/x^64.0+1.0/816322.5*x^73.0-1.0/890807.2258064516*x^74.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130463() {
 UsageCalculus.TestCase = 130463;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-38*-xy^63+37*-xy^64+36/-xy^65-35*-xy^66+34*-xy^67+33/-xy^68-32*-xy^69+31*-xy^70+30/-xy^71";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "38.0*xy^63.0-37.0*xy^64.0-36.0/xy^65.0+35.0*xy^66.0-34.0*xy^67.0-33.0/xy^68.0+32.0*xy^69.0-31.0*xy^70.0-30.0/xy^71.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "38.0*63.0*xy^62.0-37.0*64.0*xy^63.0-36.0*-65.0/xy^66.0+35.0*66.0*xy^65.0-34.0*67.0*xy^66.0-33.0*-68.0/xy^69.0+32.0*69.0*xy^68.0-31.0*70.0*xy^69.0-30.0*-71.0/xy^72.0";
 UsageCalculus.EqnSolArrayMap2[1] = "2394.0*xy^62.0-2368.0*xy^63.0+2340.0/xy^66.0+2310.0*xy^65.0-2278.0*xy^66.0+2244.0/xy^69.0+2208.0*xy^68.0-2170.0*xy^69.0+2130.0/xy^72.0";
 UsageCalculus.EqnSolArrayMap3[1] = "38.0*xy^63.0-37.0*xy^64.0-36.0/xy^65.0+35.0*xy^66.0-34.0*xy^67.0-33.0/xy^68.0+32.0*xy^69.0-31.0*xy^70.0-30.0/xy^71.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "38.0/64.0*xy^64.0-37.0/65.0*xy^65.0-36.0/-64.0/xy^64.0+35.0/67.0*xy^67.0-34.0/68.0*xy^68.0-33.0/-67.0/xy^67.0+32.0/70.0*xy^70.0-31.0/71.0*xy^71.0-30.0/-70.0/xy^70.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/1.6842105263157894*xy^64.0-1.0/1.7567567567567568*xy^65.0+1.0/1.7777777777777777/xy^64.0+1.0/1.9142857142857144*xy^67.0-1.0/2.0*xy^68.0+1.0/2.0303030303030303/xy^67.0+1.0/2.1875*xy^70.0-1.0/2.2903225806451615*xy^71.0+1.0/2.3333333333333335/xy^70.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "2394.0*xy^62.0-2368.0*xy^63.0+2340.0/xy^66.0+2310.0*xy^65.0-2278.0*xy^66.0+2244.0/xy^69.0+2208.0*xy^68.0-2170.0*xy^69.0+2130.0/xy^72.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "2394.0*62.0*xy^61.0-2368.0*63.0*xy^62.0+2340.0*-66.0/xy^67.0+2310.0*65.0*xy^64.0-2278.0*66.0*xy^65.0+2244.0*-69.0/xy^70.0+2208.0*68.0*xy^67.0-2170.0*69.0*xy^68.0+2130.0*-72.0/xy^73.0";
 UsageCalculus.EqnSolArrayMap2[2] = "148428.0*xy^61.0-149184.0*xy^62.0-154440.0/xy^67.0+150150.0*xy^64.0-150348.0*xy^65.0-154836.0/xy^70.0+150144.0*xy^67.0-149730.0*xy^68.0-153360.0/xy^73.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/1.6842105263157894*xy^64.0-1.0/1.7567567567567568*xy^65.0+1.0/1.7777777777777777/xy^64.0+1.0/1.9142857142857144*xy^67.0-1.0/2.0*xy^68.0+1.0/2.0303030303030303/xy^67.0+1.0/2.1875*xy^70.0-1.0/2.2903225806451615*xy^71.0+1.0/2.3333333333333335/xy^70.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/1.6842105263157894/65.0*xy^65.0-1.0/1.7567567567567568/66.0*xy^66.0+1.0/1.7777777777777777/-63.0/xy^63.0+1.0/1.9142857142857144/68.0*xy^68.0-1.0/2.0/69.0*xy^69.0+1.0/2.0303030303030303/-66.0/xy^66.0+1.0/2.1875/71.0*xy^71.0-1.0/2.2903225806451615/72.0*xy^72.0+1.0/2.3333333333333335/-69.0/xy^69.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/109.47368421052632*xy^65.0-1.0/115.94594594594595*xy^66.0-1.0/112.0/xy^63.0+1.0/130.17142857142858*xy^68.0-1.0/138.0*xy^69.0-1.0/134.0/xy^66.0+1.0/155.3125*xy^71.0-1.0/164.90322580645162*xy^72.0-1.0/161.0/xy^69.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "148428.0*xy^61.0-149184.0*xy^62.0-154440.0/xy^67.0+150150.0*xy^64.0-150348.0*xy^65.0-154836.0/xy^70.0+150144.0*xy^67.0-149730.0*xy^68.0-153360.0/xy^73.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "148428.0*61.0*xy^60.0-149184.0*62.0*xy^61.0-154440.0*-67.0/xy^68.0+150150.0*64.0*xy^63.0-150348.0*65.0*xy^64.0-154836.0*-70.0/xy^71.0+150144.0*67.0*xy^66.0-149730.0*68.0*xy^67.0-153360.0*-73.0/xy^74.0";
 UsageCalculus.EqnSolArrayMap2[3] = "9054108.0*xy^60.0-9249408.0*xy^61.0+1.034748E7/xy^68.0+9609600.0*xy^63.0-9772620.0*xy^64.0+1.083852E7/xy^71.0+1.0059648E7*xy^66.0-1.018164E7*xy^67.0+1.119528E7/xy^74.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/109.47368421052632*xy^65.0-1.0/115.94594594594595*xy^66.0-1.0/112.0/xy^63.0+1.0/130.17142857142858*xy^68.0-1.0/138.0*xy^69.0-1.0/134.0/xy^66.0+1.0/155.3125*xy^71.0-1.0/164.90322580645162*xy^72.0-1.0/161.0/xy^69.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/109.47368421052632/66.0*xy^66.0-1.0/115.94594594594595/67.0*xy^67.0-1.0/112.0/-62.0/xy^62.0+1.0/130.17142857142858/69.0*xy^69.0-1.0/138.0/70.0*xy^70.0-1.0/134.0/-65.0/xy^65.0+1.0/155.3125/72.0*xy^72.0-1.0/164.90322580645162/73.0*xy^73.0-1.0/161.0/-68.0/xy^68.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/7225.263157894737*xy^66.0-1.0/7768.378378378378*xy^67.0+1.0/6944.0/xy^62.0+1.0/8981.828571428572*xy^69.0-1.0/9660.0*xy^70.0+1.0/8710.0/xy^65.0+1.0/11182.5*xy^72.0-1.0/12037.935483870968*xy^73.0+1.0/10948.0/xy^68.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "9054108.0*xy^60.0-9249408.0*xy^61.0+1.034748E7/xy^68.0+9609600.0*xy^63.0-9772620.0*xy^64.0+1.083852E7/xy^71.0+1.0059648E7*xy^66.0-1.018164E7*xy^67.0+1.119528E7/xy^74.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "9054108.0*60.0*xy^59.0-9249408.0*61.0*xy^60.0+0.0*-68.0/xy^69.0+9609600.0*63.0*xy^62.0-9772620.0*64.0*xy^63.0+0.0*-71.0/xy^72.0+66.0*xy^65.0-67.0*xy^66.0+0.0*-74.0/xy^75.0";
 UsageCalculus.EqnSolArrayMap2[4] = "5.4324648E8*xy^59.0-5.64213888E8*xy^60.0-0.0/xy^69.0+6.054048E8*xy^62.0-6.2544768E8*xy^63.0-0.0/xy^72.0+66.0*xy^65.0-67.0*xy^66.0-0.0/xy^75.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/7225.263157894737*xy^66.0-1.0/7768.378378378378*xy^67.0+1.0/6944.0/xy^62.0+1.0/8981.828571428572*xy^69.0-1.0/9660.0*xy^70.0+1.0/8710.0/xy^65.0+1.0/11182.5*xy^72.0-1.0/12037.935483870968*xy^73.0+1.0/10948.0/xy^68.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/7225.263157894737/67.0*xy^67.0-1.0/7768.378378378378/68.0*xy^68.0+1.0/6944.0/-61.0/xy^61.0+1.0/8981.828571428572/70.0*xy^70.0-1.0/9660.0/71.0*xy^71.0+1.0/8710.0/-64.0/xy^64.0+1.0/11182.5/73.0*xy^73.0-1.0/12037.935483870968/74.0*xy^74.0+1.0/10948.0/-67.0/xy^67.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/484092.63157894736*xy^67.0-1.0/528249.7297297297*xy^68.0-1.0/423584.0/xy^61.0+1.0/628728.0*xy^70.0-1.0/685860.0*xy^71.0-1.0/557440.0/xy^64.0+1.0/816322.5*xy^73.0-1.0/890807.2258064516*xy^74.0-1.0/733516.0/xy^67.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130464() {
 UsageCalculus.TestCase = 130464;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+37*-x^64+36/-x^65-35*-x^66+34*-x^67+33/-x^68-32*-x^69+31*-x^70+30/-x^71-29*-x^72";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-37.0*x^64.0-36.0/x^65.0+35.0*x^66.0-34.0*x^67.0-33.0/x^68.0+32.0*x^69.0-31.0*x^70.0-30.0/x^71.0+29.0*x^72.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-37.0*64.0*x^63.0-36.0*-65.0/x^66.0+35.0*66.0*x^65.0-34.0*67.0*x^66.0-33.0*-68.0/x^69.0+32.0*69.0*x^68.0-31.0*70.0*x^69.0-30.0*-71.0/x^72.0+29.0*72.0*x^71.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-2368.0*x^63.0+2340.0/x^66.0+2310.0*x^65.0-2278.0*x^66.0+2244.0/x^69.0+2208.0*x^68.0-2170.0*x^69.0+2130.0/x^72.0+2088.0*x^71.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-37.0*x^64.0-36.0/x^65.0+35.0*x^66.0-34.0*x^67.0-33.0/x^68.0+32.0*x^69.0-31.0*x^70.0-30.0/x^71.0+29.0*x^72.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-37.0/65.0*x^65.0-36.0/-64.0/x^64.0+35.0/67.0*x^67.0-34.0/68.0*x^68.0-33.0/-67.0/x^67.0+32.0/70.0*x^70.0-31.0/71.0*x^71.0-30.0/-70.0/x^70.0+29.0/73.0*x^73.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/1.7567567567567568*x^65.0+1.0/1.7777777777777777/x^64.0+1.0/1.9142857142857144*x^67.0-1.0/2.0*x^68.0+1.0/2.0303030303030303/x^67.0+1.0/2.1875*x^70.0-1.0/2.2903225806451615*x^71.0+1.0/2.3333333333333335/x^70.0+1.0/2.5172413793103448*x^73.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-2368.0*x^63.0+2340.0/x^66.0+2310.0*x^65.0-2278.0*x^66.0+2244.0/x^69.0+2208.0*x^68.0-2170.0*x^69.0+2130.0/x^72.0+2088.0*x^71.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-2368.0*63.0*x^62.0+2340.0*-66.0/x^67.0+2310.0*65.0*x^64.0-2278.0*66.0*x^65.0+2244.0*-69.0/x^70.0+2208.0*68.0*x^67.0-2170.0*69.0*x^68.0+2130.0*-72.0/x^73.0+2088.0*71.0*x^70.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-149184.0*x^62.0-154440.0/x^67.0+150150.0*x^64.0-150348.0*x^65.0-154836.0/x^70.0+150144.0*x^67.0-149730.0*x^68.0-153360.0/x^73.0+148248.0*x^70.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/1.7567567567567568*x^65.0+1.0/1.7777777777777777/x^64.0+1.0/1.9142857142857144*x^67.0-1.0/2.0*x^68.0+1.0/2.0303030303030303/x^67.0+1.0/2.1875*x^70.0-1.0/2.2903225806451615*x^71.0+1.0/2.3333333333333335/x^70.0+1.0/2.5172413793103448*x^73.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/1.7567567567567568/66.0*x^66.0+1.0/1.7777777777777777/-63.0/x^63.0+1.0/1.9142857142857144/68.0*x^68.0-1.0/2.0/69.0*x^69.0+1.0/2.0303030303030303/-66.0/x^66.0+1.0/2.1875/71.0*x^71.0-1.0/2.2903225806451615/72.0*x^72.0+1.0/2.3333333333333335/-69.0/x^69.0+1.0/2.5172413793103448/74.0*x^74.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/115.94594594594595*x^66.0-1.0/112.0/x^63.0+1.0/130.17142857142858*x^68.0-1.0/138.0*x^69.0-1.0/134.0/x^66.0+1.0/155.3125*x^71.0-1.0/164.90322580645162*x^72.0-1.0/161.0/x^69.0+1.0/186.27586206896552*x^74.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-149184.0*x^62.0-154440.0/x^67.0+150150.0*x^64.0-150348.0*x^65.0-154836.0/x^70.0+150144.0*x^67.0-149730.0*x^68.0-153360.0/x^73.0+148248.0*x^70.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-149184.0*62.0*x^61.0-154440.0*-67.0/x^68.0+150150.0*64.0*x^63.0-150348.0*65.0*x^64.0-154836.0*-70.0/x^71.0+150144.0*67.0*x^66.0-149730.0*68.0*x^67.0-153360.0*-73.0/x^74.0+148248.0*70.0*x^69.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-9249408.0*x^61.0+1.034748E7/x^68.0+9609600.0*x^63.0-9772620.0*x^64.0+1.083852E7/x^71.0+1.0059648E7*x^66.0-1.018164E7*x^67.0+1.119528E7/x^74.0+1.037736E7*x^69.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/115.94594594594595*x^66.0-1.0/112.0/x^63.0+1.0/130.17142857142858*x^68.0-1.0/138.0*x^69.0-1.0/134.0/x^66.0+1.0/155.3125*x^71.0-1.0/164.90322580645162*x^72.0-1.0/161.0/x^69.0+1.0/186.27586206896552*x^74.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/115.94594594594595/67.0*x^67.0-1.0/112.0/-62.0/x^62.0+1.0/130.17142857142858/69.0*x^69.0-1.0/138.0/70.0*x^70.0-1.0/134.0/-65.0/x^65.0+1.0/155.3125/72.0*x^72.0-1.0/164.90322580645162/73.0*x^73.0-1.0/161.0/-68.0/x^68.0+1.0/186.27586206896552/75.0*x^75.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/7768.378378378378*x^67.0+1.0/6944.0/x^62.0+1.0/8981.828571428572*x^69.0-1.0/9660.0*x^70.0+1.0/8710.0/x^65.0+1.0/11182.5*x^72.0-1.0/12037.935483870968*x^73.0+1.0/10948.0/x^68.0+1.0/13970.689655172415*x^75.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-9249408.0*x^61.0+1.034748E7/x^68.0+9609600.0*x^63.0-9772620.0*x^64.0+1.083852E7/x^71.0+1.0059648E7*x^66.0-1.018164E7*x^67.0+1.119528E7/x^74.0+1.037736E7*x^69.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-9249408.0*61.0*x^60.0+0.0*-68.0/x^69.0+9609600.0*63.0*x^62.0-9772620.0*64.0*x^63.0+0.0*-71.0/x^72.0+66.0*x^65.0-67.0*x^66.0+0.0*-74.0/x^75.0+0.0*69.0*x^68.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-5.64213888E8*x^60.0-0.0/x^69.0+6.054048E8*x^62.0-6.2544768E8*x^63.0-0.0/x^72.0+66.0*x^65.0-67.0*x^66.0-0.0/x^75.0+0.0*x^68.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/7768.378378378378*x^67.0+1.0/6944.0/x^62.0+1.0/8981.828571428572*x^69.0-1.0/9660.0*x^70.0+1.0/8710.0/x^65.0+1.0/11182.5*x^72.0-1.0/12037.935483870968*x^73.0+1.0/10948.0/x^68.0+1.0/13970.689655172415*x^75.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/7768.378378378378/68.0*x^68.0+1.0/6944.0/-61.0/x^61.0+1.0/8981.828571428572/70.0*x^70.0-1.0/9660.0/71.0*x^71.0+1.0/8710.0/-64.0/x^64.0+1.0/11182.5/73.0*x^73.0-1.0/12037.935483870968/74.0*x^74.0+1.0/10948.0/-67.0/x^67.0+1.0/13970.689655172415/76.0*x^76.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/528249.7297297297*x^68.0-1.0/423584.0/x^61.0+1.0/628728.0*x^70.0-1.0/685860.0*x^71.0-1.0/557440.0/x^64.0+1.0/816322.5*x^73.0-1.0/890807.2258064516*x^74.0-1.0/733516.0/x^67.0+1.0/1061772.4137931035*x^76.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130465() {
 UsageCalculus.TestCase = 130465;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+36/-xyzx^65-35*-xyzx^66+34*-xyzx^67+33/-xyzx^68-32*-xyzx^69+31*-xyzx^70+30/-xyzx^71-29*-xyzx^72+28*-xyzx^73";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyzx";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-36.0/xyzx^65.0+35.0*xyzx^66.0-34.0*xyzx^67.0-33.0/xyzx^68.0+32.0*xyzx^69.0-31.0*xyzx^70.0-30.0/xyzx^71.0+29.0*xyzx^72.0-28.0*xyzx^73.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-36.0*-65.0/xyzx^66.0+35.0*66.0*xyzx^65.0-34.0*67.0*xyzx^66.0-33.0*-68.0/xyzx^69.0+32.0*69.0*xyzx^68.0-31.0*70.0*xyzx^69.0-30.0*-71.0/xyzx^72.0+29.0*72.0*xyzx^71.0-28.0*73.0*xyzx^72.0";
 UsageCalculus.EqnSolArrayMap2[1] = "2340.0/xyzx^66.0+2310.0*xyzx^65.0-2278.0*xyzx^66.0+2244.0/xyzx^69.0+2208.0*xyzx^68.0-2170.0*xyzx^69.0+2130.0/xyzx^72.0+2088.0*xyzx^71.0-2044.0*xyzx^72.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-36.0/xyzx^65.0+35.0*xyzx^66.0-34.0*xyzx^67.0-33.0/xyzx^68.0+32.0*xyzx^69.0-31.0*xyzx^70.0-30.0/xyzx^71.0+29.0*xyzx^72.0-28.0*xyzx^73.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-36.0/-64.0/xyzx^64.0+35.0/67.0*xyzx^67.0-34.0/68.0*xyzx^68.0-33.0/-67.0/xyzx^67.0+32.0/70.0*xyzx^70.0-31.0/71.0*xyzx^71.0-30.0/-70.0/xyzx^70.0+29.0/73.0*xyzx^73.0-28.0/74.0*xyzx^74.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/1.7777777777777777/xyzx^64.0+1.0/1.9142857142857144*xyzx^67.0-1.0/2.0*xyzx^68.0+1.0/2.0303030303030303/xyzx^67.0+1.0/2.1875*xyzx^70.0-1.0/2.2903225806451615*xyzx^71.0+1.0/2.3333333333333335/xyzx^70.0+1.0/2.5172413793103448*xyzx^73.0-1.0/2.642857142857143*xyzx^74.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "2340.0/xyzx^66.0+2310.0*xyzx^65.0-2278.0*xyzx^66.0+2244.0/xyzx^69.0+2208.0*xyzx^68.0-2170.0*xyzx^69.0+2130.0/xyzx^72.0+2088.0*xyzx^71.0-2044.0*xyzx^72.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "2340.0*-66.0/xyzx^67.0+2310.0*65.0*xyzx^64.0-2278.0*66.0*xyzx^65.0+2244.0*-69.0/xyzx^70.0+2208.0*68.0*xyzx^67.0-2170.0*69.0*xyzx^68.0+2130.0*-72.0/xyzx^73.0+2088.0*71.0*xyzx^70.0-2044.0*72.0*xyzx^71.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-154440.0/xyzx^67.0+150150.0*xyzx^64.0-150348.0*xyzx^65.0-154836.0/xyzx^70.0+150144.0*xyzx^67.0-149730.0*xyzx^68.0-153360.0/xyzx^73.0+148248.0*xyzx^70.0-147168.0*xyzx^71.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/1.7777777777777777/xyzx^64.0+1.0/1.9142857142857144*xyzx^67.0-1.0/2.0*xyzx^68.0+1.0/2.0303030303030303/xyzx^67.0+1.0/2.1875*xyzx^70.0-1.0/2.2903225806451615*xyzx^71.0+1.0/2.3333333333333335/xyzx^70.0+1.0/2.5172413793103448*xyzx^73.0-1.0/2.642857142857143*xyzx^74.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/1.7777777777777777/-63.0/xyzx^63.0+1.0/1.9142857142857144/68.0*xyzx^68.0-1.0/2.0/69.0*xyzx^69.0+1.0/2.0303030303030303/-66.0/xyzx^66.0+1.0/2.1875/71.0*xyzx^71.0-1.0/2.2903225806451615/72.0*xyzx^72.0+1.0/2.3333333333333335/-69.0/xyzx^69.0+1.0/2.5172413793103448/74.0*xyzx^74.0-1.0/2.642857142857143/75.0*xyzx^75.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/112.0/xyzx^63.0+1.0/130.17142857142858*xyzx^68.0-1.0/138.0*xyzx^69.0-1.0/134.0/xyzx^66.0+1.0/155.3125*xyzx^71.0-1.0/164.90322580645162*xyzx^72.0-1.0/161.0/xyzx^69.0+1.0/186.27586206896552*xyzx^74.0-1.0/198.21428571428572*xyzx^75.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-154440.0/xyzx^67.0+150150.0*xyzx^64.0-150348.0*xyzx^65.0-154836.0/xyzx^70.0+150144.0*xyzx^67.0-149730.0*xyzx^68.0-153360.0/xyzx^73.0+148248.0*xyzx^70.0-147168.0*xyzx^71.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-154440.0*-67.0/xyzx^68.0+150150.0*64.0*xyzx^63.0-150348.0*65.0*xyzx^64.0-154836.0*-70.0/xyzx^71.0+150144.0*67.0*xyzx^66.0-149730.0*68.0*xyzx^67.0-153360.0*-73.0/xyzx^74.0+148248.0*70.0*xyzx^69.0-147168.0*71.0*xyzx^70.0";
 UsageCalculus.EqnSolArrayMap2[3] = "1.034748E7/xyzx^68.0+9609600.0*xyzx^63.0-9772620.0*xyzx^64.0+1.083852E7/xyzx^71.0+1.0059648E7*xyzx^66.0-1.018164E7*xyzx^67.0+1.119528E7/xyzx^74.0+1.037736E7*xyzx^69.0-1.0448928E7*xyzx^70.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/112.0/xyzx^63.0+1.0/130.17142857142858*xyzx^68.0-1.0/138.0*xyzx^69.0-1.0/134.0/xyzx^66.0+1.0/155.3125*xyzx^71.0-1.0/164.90322580645162*xyzx^72.0-1.0/161.0/xyzx^69.0+1.0/186.27586206896552*xyzx^74.0-1.0/198.21428571428572*xyzx^75.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/112.0/-62.0/xyzx^62.0+1.0/130.17142857142858/69.0*xyzx^69.0-1.0/138.0/70.0*xyzx^70.0-1.0/134.0/-65.0/xyzx^65.0+1.0/155.3125/72.0*xyzx^72.0-1.0/164.90322580645162/73.0*xyzx^73.0-1.0/161.0/-68.0/xyzx^68.0+1.0/186.27586206896552/75.0*xyzx^75.0-1.0/198.21428571428572/76.0*xyzx^76.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/6944.0/xyzx^62.0+1.0/8981.828571428572*xyzx^69.0-1.0/9660.0*xyzx^70.0+1.0/8710.0/xyzx^65.0+1.0/11182.5*xyzx^72.0-1.0/12037.935483870968*xyzx^73.0+1.0/10948.0/xyzx^68.0+1.0/13970.689655172415*xyzx^75.0-1.0/15064.285714285716*xyzx^76.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "1.034748E7/xyzx^68.0+9609600.0*xyzx^63.0-9772620.0*xyzx^64.0+1.083852E7/xyzx^71.0+1.0059648E7*xyzx^66.0-1.018164E7*xyzx^67.0+1.119528E7/xyzx^74.0+1.037736E7*xyzx^69.0-1.0448928E7*xyzx^70.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "0.0*-68.0/xyzx^69.0+9609600.0*63.0*xyzx^62.0-9772620.0*64.0*xyzx^63.0+0.0*-71.0/xyzx^72.0+66.0*xyzx^65.0-67.0*xyzx^66.0+0.0*-74.0/xyzx^75.0+69.0*xyzx^68.0-0.0*70.0*xyzx^69.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-0.0/xyzx^69.0+6.054048E8*xyzx^62.0-6.2544768E8*xyzx^63.0-0.0/xyzx^72.0+66.0*xyzx^65.0-67.0*xyzx^66.0-0.0/xyzx^75.0+69.0*xyzx^68.0-0.0*xyzx^69.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/6944.0/xyzx^62.0+1.0/8981.828571428572*xyzx^69.0-1.0/9660.0*xyzx^70.0+1.0/8710.0/xyzx^65.0+1.0/11182.5*xyzx^72.0-1.0/12037.935483870968*xyzx^73.0+1.0/10948.0/xyzx^68.0+1.0/13970.689655172415*xyzx^75.0-1.0/15064.285714285716*xyzx^76.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/6944.0/-61.0/xyzx^61.0+1.0/8981.828571428572/70.0*xyzx^70.0-1.0/9660.0/71.0*xyzx^71.0+1.0/8710.0/-64.0/xyzx^64.0+1.0/11182.5/73.0*xyzx^73.0-1.0/12037.935483870968/74.0*xyzx^74.0+1.0/10948.0/-67.0/xyzx^67.0+1.0/13970.689655172415/76.0*xyzx^76.0-1.0/15064.285714285716/77.0*xyzx^77.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/423584.0/xyzx^61.0+1.0/628728.0*xyzx^70.0-1.0/685860.0*xyzx^71.0-1.0/557440.0/xyzx^64.0+1.0/816322.5*xyzx^73.0-1.0/890807.2258064516*xyzx^74.0-1.0/733516.0/xyzx^67.0+1.0/1061772.4137931035*xyzx^76.0-1.0/1159950.0*xyzx^77.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130466() {
 UsageCalculus.TestCase = 130466;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-35*-x^66+34*-x^67+33/-x^68-32*-x^69+31*-x^70+30/-x^71-29*-x^72+28*-x^73+27/-x^74";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "35.0*x^66.0-34.0*x^67.0-33.0/x^68.0+32.0*x^69.0-31.0*x^70.0-30.0/x^71.0+29.0*x^72.0-28.0*x^73.0-27.0/x^74.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "35.0*66.0*x^65.0-34.0*67.0*x^66.0-33.0*-68.0/x^69.0+32.0*69.0*x^68.0-31.0*70.0*x^69.0-30.0*-71.0/x^72.0+29.0*72.0*x^71.0-28.0*73.0*x^72.0-27.0*-74.0/x^75.0";
 UsageCalculus.EqnSolArrayMap2[1] = "2310.0*x^65.0-2278.0*x^66.0+2244.0/x^69.0+2208.0*x^68.0-2170.0*x^69.0+2130.0/x^72.0+2088.0*x^71.0-2044.0*x^72.0+1998.0/x^75.0";
 UsageCalculus.EqnSolArrayMap3[1] = "35.0*x^66.0-34.0*x^67.0-33.0/x^68.0+32.0*x^69.0-31.0*x^70.0-30.0/x^71.0+29.0*x^72.0-28.0*x^73.0-27.0/x^74.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "35.0/67.0*x^67.0-34.0/68.0*x^68.0-33.0/-67.0/x^67.0+32.0/70.0*x^70.0-31.0/71.0*x^71.0-30.0/-70.0/x^70.0+29.0/73.0*x^73.0-28.0/74.0*x^74.0-27.0/-73.0/x^73.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/1.9142857142857144*x^67.0-1.0/2.0*x^68.0+1.0/2.0303030303030303/x^67.0+1.0/2.1875*x^70.0-1.0/2.2903225806451615*x^71.0+1.0/2.3333333333333335/x^70.0+1.0/2.5172413793103448*x^73.0-1.0/2.642857142857143*x^74.0+1.0/2.7037037037037037/x^73.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "2310.0*x^65.0-2278.0*x^66.0+2244.0/x^69.0+2208.0*x^68.0-2170.0*x^69.0+2130.0/x^72.0+2088.0*x^71.0-2044.0*x^72.0+1998.0/x^75.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "2310.0*65.0*x^64.0-2278.0*66.0*x^65.0+2244.0*-69.0/x^70.0+2208.0*68.0*x^67.0-2170.0*69.0*x^68.0+2130.0*-72.0/x^73.0+2088.0*71.0*x^70.0-2044.0*72.0*x^71.0+1998.0*-75.0/x^76.0";
 UsageCalculus.EqnSolArrayMap2[2] = "150150.0*x^64.0-150348.0*x^65.0-154836.0/x^70.0+150144.0*x^67.0-149730.0*x^68.0-153360.0/x^73.0+148248.0*x^70.0-147168.0*x^71.0-149850.0/x^76.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/1.9142857142857144*x^67.0-1.0/2.0*x^68.0+1.0/2.0303030303030303/x^67.0+1.0/2.1875*x^70.0-1.0/2.2903225806451615*x^71.0+1.0/2.3333333333333335/x^70.0+1.0/2.5172413793103448*x^73.0-1.0/2.642857142857143*x^74.0+1.0/2.7037037037037037/x^73.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/1.9142857142857144/68.0*x^68.0-1.0/2.0/69.0*x^69.0+1.0/2.0303030303030303/-66.0/x^66.0+1.0/2.1875/71.0*x^71.0-1.0/2.2903225806451615/72.0*x^72.0+1.0/2.3333333333333335/-69.0/x^69.0+1.0/2.5172413793103448/74.0*x^74.0-1.0/2.642857142857143/75.0*x^75.0+1.0/2.7037037037037037/-72.0/x^72.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/130.17142857142858*x^68.0-1.0/138.0*x^69.0-1.0/134.0/x^66.0+1.0/155.3125*x^71.0-1.0/164.90322580645162*x^72.0-1.0/161.0/x^69.0+1.0/186.27586206896552*x^74.0-1.0/198.21428571428572*x^75.0-1.0/194.66666666666666/x^72.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "150150.0*x^64.0-150348.0*x^65.0-154836.0/x^70.0+150144.0*x^67.0-149730.0*x^68.0-153360.0/x^73.0+148248.0*x^70.0-147168.0*x^71.0-149850.0/x^76.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "150150.0*64.0*x^63.0-150348.0*65.0*x^64.0-154836.0*-70.0/x^71.0+150144.0*67.0*x^66.0-149730.0*68.0*x^67.0-153360.0*-73.0/x^74.0+148248.0*70.0*x^69.0-147168.0*71.0*x^70.0-149850.0*-76.0/x^77.0";
 UsageCalculus.EqnSolArrayMap2[3] = "9609600.0*x^63.0-9772620.0*x^64.0+1.083852E7/x^71.0+1.0059648E7*x^66.0-1.018164E7*x^67.0+1.119528E7/x^74.0+1.037736E7*x^69.0-1.0448928E7*x^70.0+1.13886E7/x^77.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/130.17142857142858*x^68.0-1.0/138.0*x^69.0-1.0/134.0/x^66.0+1.0/155.3125*x^71.0-1.0/164.90322580645162*x^72.0-1.0/161.0/x^69.0+1.0/186.27586206896552*x^74.0-1.0/198.21428571428572*x^75.0-1.0/194.66666666666666/x^72.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/130.17142857142858/69.0*x^69.0-1.0/138.0/70.0*x^70.0-1.0/134.0/-65.0/x^65.0+1.0/155.3125/72.0*x^72.0-1.0/164.90322580645162/73.0*x^73.0-1.0/161.0/-68.0/x^68.0+1.0/186.27586206896552/75.0*x^75.0-1.0/198.21428571428572/76.0*x^76.0-1.0/194.66666666666666/-71.0/x^71.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/8981.828571428572*x^69.0-1.0/9660.0*x^70.0+1.0/8710.0/x^65.0+1.0/11182.5*x^72.0-1.0/12037.935483870968*x^73.0+1.0/10948.0/x^68.0+1.0/13970.689655172415*x^75.0-1.0/15064.285714285716*x^76.0+1.0/13821.333333333332/x^71.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "9609600.0*x^63.0-9772620.0*x^64.0+1.083852E7/x^71.0+1.0059648E7*x^66.0-1.018164E7*x^67.0+1.119528E7/x^74.0+1.037736E7*x^69.0-1.0448928E7*x^70.0+1.13886E7/x^77.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "9609600.0*63.0*x^62.0-9772620.0*64.0*x^63.0+0.0*-71.0/x^72.0+66.0*x^65.0-67.0*x^66.0+0.0*-74.0/x^75.0+69.0*x^68.0-70.0*x^69.0+0.0*-77.0/x^78.0";
 UsageCalculus.EqnSolArrayMap2[4] = "6.054048E8*x^62.0-6.2544768E8*x^63.0-0.0/x^72.0+66.0*x^65.0-67.0*x^66.0-0.0/x^75.0+69.0*x^68.0-70.0*x^69.0-0.0/x^78.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/8981.828571428572*x^69.0-1.0/9660.0*x^70.0+1.0/8710.0/x^65.0+1.0/11182.5*x^72.0-1.0/12037.935483870968*x^73.0+1.0/10948.0/x^68.0+1.0/13970.689655172415*x^75.0-1.0/15064.285714285716*x^76.0+1.0/13821.333333333332/x^71.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/8981.828571428572/70.0*x^70.0-1.0/9660.0/71.0*x^71.0+1.0/8710.0/-64.0/x^64.0+1.0/11182.5/73.0*x^73.0-1.0/12037.935483870968/74.0*x^74.0+1.0/10948.0/-67.0/x^67.0+1.0/13970.689655172415/76.0*x^76.0-1.0/15064.285714285716/77.0*x^77.0+1.0/13821.333333333332/-70.0/x^70.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/628728.0*x^70.0-1.0/685860.0*x^71.0-1.0/557440.0/x^64.0+1.0/816322.5*x^73.0-1.0/890807.2258064516*x^74.0-1.0/733516.0/x^67.0+1.0/1061772.4137931035*x^76.0-1.0/1159950.0*x^77.0-1.0/967493.3333333333/x^70.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130467() {
 UsageCalculus.TestCase = 130467;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+34*-xy^67+33/-xy^68-32*-xy^69+31*-xy^70+30/-xy^71-29*-xy^72+28*-xy^73+27/-xy^74-26*-xy^75";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-34.0*xy^67.0-33.0/xy^68.0+32.0*xy^69.0-31.0*xy^70.0-30.0/xy^71.0+29.0*xy^72.0-28.0*xy^73.0-27.0/xy^74.0+26.0*xy^75.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-34.0*67.0*xy^66.0-33.0*-68.0/xy^69.0+32.0*69.0*xy^68.0-31.0*70.0*xy^69.0-30.0*-71.0/xy^72.0+29.0*72.0*xy^71.0-28.0*73.0*xy^72.0-27.0*-74.0/xy^75.0+26.0*75.0*xy^74.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-2278.0*xy^66.0+2244.0/xy^69.0+2208.0*xy^68.0-2170.0*xy^69.0+2130.0/xy^72.0+2088.0*xy^71.0-2044.0*xy^72.0+1998.0/xy^75.0+1950.0*xy^74.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-34.0*xy^67.0-33.0/xy^68.0+32.0*xy^69.0-31.0*xy^70.0-30.0/xy^71.0+29.0*xy^72.0-28.0*xy^73.0-27.0/xy^74.0+26.0*xy^75.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-34.0/68.0*xy^68.0-33.0/-67.0/xy^67.0+32.0/70.0*xy^70.0-31.0/71.0*xy^71.0-30.0/-70.0/xy^70.0+29.0/73.0*xy^73.0-28.0/74.0*xy^74.0-27.0/-73.0/xy^73.0+26.0/76.0*xy^76.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/2.0*xy^68.0+1.0/2.0303030303030303/xy^67.0+1.0/2.1875*xy^70.0-1.0/2.2903225806451615*xy^71.0+1.0/2.3333333333333335/xy^70.0+1.0/2.5172413793103448*xy^73.0-1.0/2.642857142857143*xy^74.0+1.0/2.7037037037037037/xy^73.0+1.0/2.923076923076923*xy^76.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-2278.0*xy^66.0+2244.0/xy^69.0+2208.0*xy^68.0-2170.0*xy^69.0+2130.0/xy^72.0+2088.0*xy^71.0-2044.0*xy^72.0+1998.0/xy^75.0+1950.0*xy^74.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-2278.0*66.0*xy^65.0+2244.0*-69.0/xy^70.0+2208.0*68.0*xy^67.0-2170.0*69.0*xy^68.0+2130.0*-72.0/xy^73.0+2088.0*71.0*xy^70.0-2044.0*72.0*xy^71.0+1998.0*-75.0/xy^76.0+1950.0*74.0*xy^73.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-150348.0*xy^65.0-154836.0/xy^70.0+150144.0*xy^67.0-149730.0*xy^68.0-153360.0/xy^73.0+148248.0*xy^70.0-147168.0*xy^71.0-149850.0/xy^76.0+144300.0*xy^73.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/2.0*xy^68.0+1.0/2.0303030303030303/xy^67.0+1.0/2.1875*xy^70.0-1.0/2.2903225806451615*xy^71.0+1.0/2.3333333333333335/xy^70.0+1.0/2.5172413793103448*xy^73.0-1.0/2.642857142857143*xy^74.0+1.0/2.7037037037037037/xy^73.0+1.0/2.923076923076923*xy^76.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/2.0/69.0*xy^69.0+1.0/2.0303030303030303/-66.0/xy^66.0+1.0/2.1875/71.0*xy^71.0-1.0/2.2903225806451615/72.0*xy^72.0+1.0/2.3333333333333335/-69.0/xy^69.0+1.0/2.5172413793103448/74.0*xy^74.0-1.0/2.642857142857143/75.0*xy^75.0+1.0/2.7037037037037037/-72.0/xy^72.0+1.0/2.923076923076923/77.0*xy^77.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/138.0*xy^69.0-1.0/134.0/xy^66.0+1.0/155.3125*xy^71.0-1.0/164.90322580645162*xy^72.0-1.0/161.0/xy^69.0+1.0/186.27586206896552*xy^74.0-1.0/198.21428571428572*xy^75.0-1.0/194.66666666666666/xy^72.0+1.0/225.07692307692307*xy^77.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-150348.0*xy^65.0-154836.0/xy^70.0+150144.0*xy^67.0-149730.0*xy^68.0-153360.0/xy^73.0+148248.0*xy^70.0-147168.0*xy^71.0-149850.0/xy^76.0+144300.0*xy^73.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-150348.0*65.0*xy^64.0-154836.0*-70.0/xy^71.0+150144.0*67.0*xy^66.0-149730.0*68.0*xy^67.0-153360.0*-73.0/xy^74.0+148248.0*70.0*xy^69.0-147168.0*71.0*xy^70.0-149850.0*-76.0/xy^77.0+144300.0*73.0*xy^72.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-9772620.0*xy^64.0+1.083852E7/xy^71.0+1.0059648E7*xy^66.0-1.018164E7*xy^67.0+1.119528E7/xy^74.0+1.037736E7*xy^69.0-1.0448928E7*xy^70.0+1.13886E7/xy^77.0+1.05339E7*xy^72.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/138.0*xy^69.0-1.0/134.0/xy^66.0+1.0/155.3125*xy^71.0-1.0/164.90322580645162*xy^72.0-1.0/161.0/xy^69.0+1.0/186.27586206896552*xy^74.0-1.0/198.21428571428572*xy^75.0-1.0/194.66666666666666/xy^72.0+1.0/225.07692307692307*xy^77.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/138.0/70.0*xy^70.0-1.0/134.0/-65.0/xy^65.0+1.0/155.3125/72.0*xy^72.0-1.0/164.90322580645162/73.0*xy^73.0-1.0/161.0/-68.0/xy^68.0+1.0/186.27586206896552/75.0*xy^75.0-1.0/198.21428571428572/76.0*xy^76.0-1.0/194.66666666666666/-71.0/xy^71.0+1.0/225.07692307692307/78.0*xy^78.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/9660.0*xy^70.0+1.0/8710.0/xy^65.0+1.0/11182.5*xy^72.0-1.0/12037.935483870968*xy^73.0+1.0/10948.0/xy^68.0+1.0/13970.689655172415*xy^75.0-1.0/15064.285714285716*xy^76.0+1.0/13821.333333333332/xy^71.0+1.0/17556.0*xy^78.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-9772620.0*xy^64.0+1.083852E7/xy^71.0+1.0059648E7*xy^66.0-1.018164E7*xy^67.0+1.119528E7/xy^74.0+1.037736E7*xy^69.0-1.0448928E7*xy^70.0+1.13886E7/xy^77.0+1.05339E7*xy^72.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-9772620.0*64.0*xy^63.0+0.0*-71.0/xy^72.0+66.0*xy^65.0-67.0*xy^66.0+0.0*-74.0/xy^75.0+69.0*xy^68.0-70.0*xy^69.0+0.0*-77.0/xy^78.0+0.0*72.0*xy^71.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-6.2544768E8*xy^63.0-0.0/xy^72.0+66.0*xy^65.0-67.0*xy^66.0-0.0/xy^75.0+69.0*xy^68.0-70.0*xy^69.0-0.0/xy^78.0+0.0*xy^71.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/9660.0*xy^70.0+1.0/8710.0/xy^65.0+1.0/11182.5*xy^72.0-1.0/12037.935483870968*xy^73.0+1.0/10948.0/xy^68.0+1.0/13970.689655172415*xy^75.0-1.0/15064.285714285716*xy^76.0+1.0/13821.333333333332/xy^71.0+1.0/17556.0*xy^78.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/9660.0/71.0*xy^71.0+1.0/8710.0/-64.0/xy^64.0+1.0/11182.5/73.0*xy^73.0-1.0/12037.935483870968/74.0*xy^74.0+1.0/10948.0/-67.0/xy^67.0+1.0/13970.689655172415/76.0*xy^76.0-1.0/15064.285714285716/77.0*xy^77.0+1.0/13821.333333333332/-70.0/xy^70.0+1.0/17556.0/79.0*xy^79.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/685860.0*xy^71.0-1.0/557440.0/xy^64.0+1.0/816322.5*xy^73.0-1.0/890807.2258064516*xy^74.0-1.0/733516.0/xy^67.0+1.0/1061772.4137931035*xy^76.0-1.0/1159950.0*xy^77.0-1.0/967493.3333333333/xy^70.0+1.0/1386924.0*xy^79.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130468() {
 UsageCalculus.TestCase = 130468;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+33/-x^68-32*-x^69+31*-x^70+30/-x^71-29*-x^72+28*-x^73+27/-x^74-26*-x^75+25*-x^76";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-33.0/x^68.0+32.0*x^69.0-31.0*x^70.0-30.0/x^71.0+29.0*x^72.0-28.0*x^73.0-27.0/x^74.0+26.0*x^75.0-25.0*x^76.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-33.0*-68.0/x^69.0+32.0*69.0*x^68.0-31.0*70.0*x^69.0-30.0*-71.0/x^72.0+29.0*72.0*x^71.0-28.0*73.0*x^72.0-27.0*-74.0/x^75.0+26.0*75.0*x^74.0-25.0*76.0*x^75.0";
 UsageCalculus.EqnSolArrayMap2[1] = "2244.0/x^69.0+2208.0*x^68.0-2170.0*x^69.0+2130.0/x^72.0+2088.0*x^71.0-2044.0*x^72.0+1998.0/x^75.0+1950.0*x^74.0-1900.0*x^75.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-33.0/x^68.0+32.0*x^69.0-31.0*x^70.0-30.0/x^71.0+29.0*x^72.0-28.0*x^73.0-27.0/x^74.0+26.0*x^75.0-25.0*x^76.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-33.0/-67.0/x^67.0+32.0/70.0*x^70.0-31.0/71.0*x^71.0-30.0/-70.0/x^70.0+29.0/73.0*x^73.0-28.0/74.0*x^74.0-27.0/-73.0/x^73.0+26.0/76.0*x^76.0-25.0/77.0*x^77.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/2.0303030303030303/x^67.0+1.0/2.1875*x^70.0-1.0/2.2903225806451615*x^71.0+1.0/2.3333333333333335/x^70.0+1.0/2.5172413793103448*x^73.0-1.0/2.642857142857143*x^74.0+1.0/2.7037037037037037/x^73.0+1.0/2.923076923076923*x^76.0-1.0/3.08*x^77.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "2244.0/x^69.0+2208.0*x^68.0-2170.0*x^69.0+2130.0/x^72.0+2088.0*x^71.0-2044.0*x^72.0+1998.0/x^75.0+1950.0*x^74.0-1900.0*x^75.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "2244.0*-69.0/x^70.0+2208.0*68.0*x^67.0-2170.0*69.0*x^68.0+2130.0*-72.0/x^73.0+2088.0*71.0*x^70.0-2044.0*72.0*x^71.0+1998.0*-75.0/x^76.0+1950.0*74.0*x^73.0-1900.0*75.0*x^74.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-154836.0/x^70.0+150144.0*x^67.0-149730.0*x^68.0-153360.0/x^73.0+148248.0*x^70.0-147168.0*x^71.0-149850.0/x^76.0+144300.0*x^73.0-142500.0*x^74.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/2.0303030303030303/x^67.0+1.0/2.1875*x^70.0-1.0/2.2903225806451615*x^71.0+1.0/2.3333333333333335/x^70.0+1.0/2.5172413793103448*x^73.0-1.0/2.642857142857143*x^74.0+1.0/2.7037037037037037/x^73.0+1.0/2.923076923076923*x^76.0-1.0/3.08*x^77.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/2.0303030303030303/-66.0/x^66.0+1.0/2.1875/71.0*x^71.0-1.0/2.2903225806451615/72.0*x^72.0+1.0/2.3333333333333335/-69.0/x^69.0+1.0/2.5172413793103448/74.0*x^74.0-1.0/2.642857142857143/75.0*x^75.0+1.0/2.7037037037037037/-72.0/x^72.0+1.0/2.923076923076923/77.0*x^77.0-1.0/3.08/78.0*x^78.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/134.0/x^66.0+1.0/155.3125*x^71.0-1.0/164.90322580645162*x^72.0-1.0/161.0/x^69.0+1.0/186.27586206896552*x^74.0-1.0/198.21428571428572*x^75.0-1.0/194.66666666666666/x^72.0+1.0/225.07692307692307*x^77.0-1.0/240.24*x^78.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-154836.0/x^70.0+150144.0*x^67.0-149730.0*x^68.0-153360.0/x^73.0+148248.0*x^70.0-147168.0*x^71.0-149850.0/x^76.0+144300.0*x^73.0-142500.0*x^74.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-154836.0*-70.0/x^71.0+150144.0*67.0*x^66.0-149730.0*68.0*x^67.0-153360.0*-73.0/x^74.0+148248.0*70.0*x^69.0-147168.0*71.0*x^70.0-149850.0*-76.0/x^77.0+144300.0*73.0*x^72.0-142500.0*74.0*x^73.0";
 UsageCalculus.EqnSolArrayMap2[3] = "1.083852E7/x^71.0+1.0059648E7*x^66.0-1.018164E7*x^67.0+1.119528E7/x^74.0+1.037736E7*x^69.0-1.0448928E7*x^70.0+1.13886E7/x^77.0+1.05339E7*x^72.0-1.0545E7*x^73.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/134.0/x^66.0+1.0/155.3125*x^71.0-1.0/164.90322580645162*x^72.0-1.0/161.0/x^69.0+1.0/186.27586206896552*x^74.0-1.0/198.21428571428572*x^75.0-1.0/194.66666666666666/x^72.0+1.0/225.07692307692307*x^77.0-1.0/240.24*x^78.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/134.0/-65.0/x^65.0+1.0/155.3125/72.0*x^72.0-1.0/164.90322580645162/73.0*x^73.0-1.0/161.0/-68.0/x^68.0+1.0/186.27586206896552/75.0*x^75.0-1.0/198.21428571428572/76.0*x^76.0-1.0/194.66666666666666/-71.0/x^71.0+1.0/225.07692307692307/78.0*x^78.0-1.0/240.24/79.0*x^79.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/8710.0/x^65.0+1.0/11182.5*x^72.0-1.0/12037.935483870968*x^73.0+1.0/10948.0/x^68.0+1.0/13970.689655172415*x^75.0-1.0/15064.285714285716*x^76.0+1.0/13821.333333333332/x^71.0+1.0/17556.0*x^78.0-1.0/18978.96*x^79.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "1.083852E7/x^71.0+1.0059648E7*x^66.0-1.018164E7*x^67.0+1.119528E7/x^74.0+1.037736E7*x^69.0-1.0448928E7*x^70.0+1.13886E7/x^77.0+1.05339E7*x^72.0-1.0545E7*x^73.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "0.0*-71.0/x^72.0+66.0*x^65.0-67.0*x^66.0+0.0*-74.0/x^75.0+69.0*x^68.0-70.0*x^69.0+0.0*-77.0/x^78.0+72.0*x^71.0-0.0*73.0*x^72.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-0.0/x^72.0+66.0*x^65.0-67.0*x^66.0-0.0/x^75.0+69.0*x^68.0-70.0*x^69.0-0.0/x^78.0+72.0*x^71.0-0.0*x^72.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/8710.0/x^65.0+1.0/11182.5*x^72.0-1.0/12037.935483870968*x^73.0+1.0/10948.0/x^68.0+1.0/13970.689655172415*x^75.0-1.0/15064.285714285716*x^76.0+1.0/13821.333333333332/x^71.0+1.0/17556.0*x^78.0-1.0/18978.96*x^79.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/8710.0/-64.0/x^64.0+1.0/11182.5/73.0*x^73.0-1.0/12037.935483870968/74.0*x^74.0+1.0/10948.0/-67.0/x^67.0+1.0/13970.689655172415/76.0*x^76.0-1.0/15064.285714285716/77.0*x^77.0+1.0/13821.333333333332/-70.0/x^70.0+1.0/17556.0/79.0*x^79.0-1.0/18978.96/80.0*x^80.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/557440.0/x^64.0+1.0/816322.5*x^73.0-1.0/890807.2258064516*x^74.0-1.0/733516.0/x^67.0+1.0/1061772.4137931035*x^76.0-1.0/1159950.0*x^77.0-1.0/967493.3333333333/x^70.0+1.0/1386924.0*x^79.0-1.0/1518316.7999999998*x^80.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130469() {
 UsageCalculus.TestCase = 130469;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-32*-xyzx^69+31*-xyzx^70+30/-xyzx^71-29*-xyzx^72+28*-xyzx^73+27/-xyzx^74-26*-xyzx^75+25*-xyzx^76+24/-xyzx^77";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyzx";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "32.0*xyzx^69.0-31.0*xyzx^70.0-30.0/xyzx^71.0+29.0*xyzx^72.0-28.0*xyzx^73.0-27.0/xyzx^74.0+26.0*xyzx^75.0-25.0*xyzx^76.0-24.0/xyzx^77.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "32.0*69.0*xyzx^68.0-31.0*70.0*xyzx^69.0-30.0*-71.0/xyzx^72.0+29.0*72.0*xyzx^71.0-28.0*73.0*xyzx^72.0-27.0*-74.0/xyzx^75.0+26.0*75.0*xyzx^74.0-25.0*76.0*xyzx^75.0-24.0*-77.0/xyzx^78.0";
 UsageCalculus.EqnSolArrayMap2[1] = "2208.0*xyzx^68.0-2170.0*xyzx^69.0+2130.0/xyzx^72.0+2088.0*xyzx^71.0-2044.0*xyzx^72.0+1998.0/xyzx^75.0+1950.0*xyzx^74.0-1900.0*xyzx^75.0+1848.0/xyzx^78.0";
 UsageCalculus.EqnSolArrayMap3[1] = "32.0*xyzx^69.0-31.0*xyzx^70.0-30.0/xyzx^71.0+29.0*xyzx^72.0-28.0*xyzx^73.0-27.0/xyzx^74.0+26.0*xyzx^75.0-25.0*xyzx^76.0-24.0/xyzx^77.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "32.0/70.0*xyzx^70.0-31.0/71.0*xyzx^71.0-30.0/-70.0/xyzx^70.0+29.0/73.0*xyzx^73.0-28.0/74.0*xyzx^74.0-27.0/-73.0/xyzx^73.0+26.0/76.0*xyzx^76.0-25.0/77.0*xyzx^77.0-24.0/-76.0/xyzx^76.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/2.1875*xyzx^70.0-1.0/2.2903225806451615*xyzx^71.0+1.0/2.3333333333333335/xyzx^70.0+1.0/2.5172413793103448*xyzx^73.0-1.0/2.642857142857143*xyzx^74.0+1.0/2.7037037037037037/xyzx^73.0+1.0/2.923076923076923*xyzx^76.0-1.0/3.08*xyzx^77.0+1.0/3.1666666666666665/xyzx^76.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "2208.0*xyzx^68.0-2170.0*xyzx^69.0+2130.0/xyzx^72.0+2088.0*xyzx^71.0-2044.0*xyzx^72.0+1998.0/xyzx^75.0+1950.0*xyzx^74.0-1900.0*xyzx^75.0+1848.0/xyzx^78.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "2208.0*68.0*xyzx^67.0-2170.0*69.0*xyzx^68.0+2130.0*-72.0/xyzx^73.0+2088.0*71.0*xyzx^70.0-2044.0*72.0*xyzx^71.0+1998.0*-75.0/xyzx^76.0+1950.0*74.0*xyzx^73.0-1900.0*75.0*xyzx^74.0+1848.0*-78.0/xyzx^79.0";
 UsageCalculus.EqnSolArrayMap2[2] = "150144.0*xyzx^67.0-149730.0*xyzx^68.0-153360.0/xyzx^73.0+148248.0*xyzx^70.0-147168.0*xyzx^71.0-149850.0/xyzx^76.0+144300.0*xyzx^73.0-142500.0*xyzx^74.0-144144.0/xyzx^79.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/2.1875*xyzx^70.0-1.0/2.2903225806451615*xyzx^71.0+1.0/2.3333333333333335/xyzx^70.0+1.0/2.5172413793103448*xyzx^73.0-1.0/2.642857142857143*xyzx^74.0+1.0/2.7037037037037037/xyzx^73.0+1.0/2.923076923076923*xyzx^76.0-1.0/3.08*xyzx^77.0+1.0/3.1666666666666665/xyzx^76.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/2.1875/71.0*xyzx^71.0-1.0/2.2903225806451615/72.0*xyzx^72.0+1.0/2.3333333333333335/-69.0/xyzx^69.0+1.0/2.5172413793103448/74.0*xyzx^74.0-1.0/2.642857142857143/75.0*xyzx^75.0+1.0/2.7037037037037037/-72.0/xyzx^72.0+1.0/2.923076923076923/77.0*xyzx^77.0-1.0/3.08/78.0*xyzx^78.0+1.0/3.1666666666666665/-75.0/xyzx^75.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/155.3125*xyzx^71.0-1.0/164.90322580645162*xyzx^72.0-1.0/161.0/xyzx^69.0+1.0/186.27586206896552*xyzx^74.0-1.0/198.21428571428572*xyzx^75.0-1.0/194.66666666666666/xyzx^72.0+1.0/225.07692307692307*xyzx^77.0-1.0/240.24*xyzx^78.0-1.0/237.5/xyzx^75.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "150144.0*xyzx^67.0-149730.0*xyzx^68.0-153360.0/xyzx^73.0+148248.0*xyzx^70.0-147168.0*xyzx^71.0-149850.0/xyzx^76.0+144300.0*xyzx^73.0-142500.0*xyzx^74.0-144144.0/xyzx^79.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "150144.0*67.0*xyzx^66.0-149730.0*68.0*xyzx^67.0-153360.0*-73.0/xyzx^74.0+148248.0*70.0*xyzx^69.0-147168.0*71.0*xyzx^70.0-149850.0*-76.0/xyzx^77.0+144300.0*73.0*xyzx^72.0-142500.0*74.0*xyzx^73.0-144144.0*-79.0/xyzx^80.0";
 UsageCalculus.EqnSolArrayMap2[3] = "1.0059648E7*xyzx^66.0-1.018164E7*xyzx^67.0+1.119528E7/xyzx^74.0+1.037736E7*xyzx^69.0-1.0448928E7*xyzx^70.0+1.13886E7/xyzx^77.0+1.05339E7*xyzx^72.0-1.0545E7*xyzx^73.0+1.1387376E7/xyzx^80.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/155.3125*xyzx^71.0-1.0/164.90322580645162*xyzx^72.0-1.0/161.0/xyzx^69.0+1.0/186.27586206896552*xyzx^74.0-1.0/198.21428571428572*xyzx^75.0-1.0/194.66666666666666/xyzx^72.0+1.0/225.07692307692307*xyzx^77.0-1.0/240.24*xyzx^78.0-1.0/237.5/xyzx^75.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/155.3125/72.0*xyzx^72.0-1.0/164.90322580645162/73.0*xyzx^73.0-1.0/161.0/-68.0/xyzx^68.0+1.0/186.27586206896552/75.0*xyzx^75.0-1.0/198.21428571428572/76.0*xyzx^76.0-1.0/194.66666666666666/-71.0/xyzx^71.0+1.0/225.07692307692307/78.0*xyzx^78.0-1.0/240.24/79.0*xyzx^79.0-1.0/237.5/-74.0/xyzx^74.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/11182.5*xyzx^72.0-1.0/12037.935483870968*xyzx^73.0+1.0/10948.0/xyzx^68.0+1.0/13970.689655172415*xyzx^75.0-1.0/15064.285714285716*xyzx^76.0+1.0/13821.333333333332/xyzx^71.0+1.0/17556.0*xyzx^78.0-1.0/18978.96*xyzx^79.0+1.0/17575.0/xyzx^74.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "1.0059648E7*xyzx^66.0-1.018164E7*xyzx^67.0+1.119528E7/xyzx^74.0+1.037736E7*xyzx^69.0-1.0448928E7*xyzx^70.0+1.13886E7/xyzx^77.0+1.05339E7*xyzx^72.0-1.0545E7*xyzx^73.0+1.1387376E7/xyzx^80.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "66.0*xyzx^65.0-67.0*xyzx^66.0+0.0*-74.0/xyzx^75.0+69.0*xyzx^68.0-70.0*xyzx^69.0+0.0*-77.0/xyzx^78.0+72.0*xyzx^71.0-73.0*xyzx^72.0+0.0*-80.0/xyzx^81.0";
 UsageCalculus.EqnSolArrayMap2[4] = "66.0*xyzx^65.0-67.0*xyzx^66.0-0.0/xyzx^75.0+69.0*xyzx^68.0-70.0*xyzx^69.0-0.0/xyzx^78.0+72.0*xyzx^71.0-73.0*xyzx^72.0-0.0/xyzx^81.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/11182.5*xyzx^72.0-1.0/12037.935483870968*xyzx^73.0+1.0/10948.0/xyzx^68.0+1.0/13970.689655172415*xyzx^75.0-1.0/15064.285714285716*xyzx^76.0+1.0/13821.333333333332/xyzx^71.0+1.0/17556.0*xyzx^78.0-1.0/18978.96*xyzx^79.0+1.0/17575.0/xyzx^74.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/11182.5/73.0*xyzx^73.0-1.0/12037.935483870968/74.0*xyzx^74.0+1.0/10948.0/-67.0/xyzx^67.0+1.0/13970.689655172415/76.0*xyzx^76.0-1.0/15064.285714285716/77.0*xyzx^77.0+1.0/13821.333333333332/-70.0/xyzx^70.0+1.0/17556.0/79.0*xyzx^79.0-1.0/18978.96/80.0*xyzx^80.0+1.0/17575.0/-73.0/xyzx^73.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/816322.5*xyzx^73.0-1.0/890807.2258064516*xyzx^74.0-1.0/733516.0/xyzx^67.0+1.0/1061772.4137931035*xyzx^76.0-1.0/1159950.0*xyzx^77.0-1.0/967493.3333333333/xyzx^70.0+1.0/1386924.0*xyzx^79.0-1.0/1518316.7999999998*xyzx^80.0-1.0/1282975.0/xyzx^73.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130470() {
 UsageCalculus.TestCase = 130470;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+31*-x^70+30/-x^71-29*-x^72+28*-x^73+27/-x^74-26*-x^75+25*-x^76+24/-x^77-23*-x^78";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-31.0*x^70.0-30.0/x^71.0+29.0*x^72.0-28.0*x^73.0-27.0/x^74.0+26.0*x^75.0-25.0*x^76.0-24.0/x^77.0+23.0*x^78.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-31.0*70.0*x^69.0-30.0*-71.0/x^72.0+29.0*72.0*x^71.0-28.0*73.0*x^72.0-27.0*-74.0/x^75.0+26.0*75.0*x^74.0-25.0*76.0*x^75.0-24.0*-77.0/x^78.0+23.0*78.0*x^77.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-2170.0*x^69.0+2130.0/x^72.0+2088.0*x^71.0-2044.0*x^72.0+1998.0/x^75.0+1950.0*x^74.0-1900.0*x^75.0+1848.0/x^78.0+1794.0*x^77.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-31.0*x^70.0-30.0/x^71.0+29.0*x^72.0-28.0*x^73.0-27.0/x^74.0+26.0*x^75.0-25.0*x^76.0-24.0/x^77.0+23.0*x^78.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-31.0/71.0*x^71.0-30.0/-70.0/x^70.0+29.0/73.0*x^73.0-28.0/74.0*x^74.0-27.0/-73.0/x^73.0+26.0/76.0*x^76.0-25.0/77.0*x^77.0-24.0/-76.0/x^76.0+23.0/79.0*x^79.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/2.2903225806451615*x^71.0+1.0/2.3333333333333335/x^70.0+1.0/2.5172413793103448*x^73.0-1.0/2.642857142857143*x^74.0+1.0/2.7037037037037037/x^73.0+1.0/2.923076923076923*x^76.0-1.0/3.08*x^77.0+1.0/3.1666666666666665/x^76.0+1.0/3.4347826086956523*x^79.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-2170.0*x^69.0+2130.0/x^72.0+2088.0*x^71.0-2044.0*x^72.0+1998.0/x^75.0+1950.0*x^74.0-1900.0*x^75.0+1848.0/x^78.0+1794.0*x^77.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-2170.0*69.0*x^68.0+2130.0*-72.0/x^73.0+2088.0*71.0*x^70.0-2044.0*72.0*x^71.0+1998.0*-75.0/x^76.0+1950.0*74.0*x^73.0-1900.0*75.0*x^74.0+1848.0*-78.0/x^79.0+1794.0*77.0*x^76.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-149730.0*x^68.0-153360.0/x^73.0+148248.0*x^70.0-147168.0*x^71.0-149850.0/x^76.0+144300.0*x^73.0-142500.0*x^74.0-144144.0/x^79.0+138138.0*x^76.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/2.2903225806451615*x^71.0+1.0/2.3333333333333335/x^70.0+1.0/2.5172413793103448*x^73.0-1.0/2.642857142857143*x^74.0+1.0/2.7037037037037037/x^73.0+1.0/2.923076923076923*x^76.0-1.0/3.08*x^77.0+1.0/3.1666666666666665/x^76.0+1.0/3.4347826086956523*x^79.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/2.2903225806451615/72.0*x^72.0+1.0/2.3333333333333335/-69.0/x^69.0+1.0/2.5172413793103448/74.0*x^74.0-1.0/2.642857142857143/75.0*x^75.0+1.0/2.7037037037037037/-72.0/x^72.0+1.0/2.923076923076923/77.0*x^77.0-1.0/3.08/78.0*x^78.0+1.0/3.1666666666666665/-75.0/x^75.0+1.0/3.4347826086956523/80.0*x^80.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/164.90322580645162*x^72.0-1.0/161.0/x^69.0+1.0/186.27586206896552*x^74.0-1.0/198.21428571428572*x^75.0-1.0/194.66666666666666/x^72.0+1.0/225.07692307692307*x^77.0-1.0/240.24*x^78.0-1.0/237.5/x^75.0+1.0/274.7826086956522*x^80.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-149730.0*x^68.0-153360.0/x^73.0+148248.0*x^70.0-147168.0*x^71.0-149850.0/x^76.0+144300.0*x^73.0-142500.0*x^74.0-144144.0/x^79.0+138138.0*x^76.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-149730.0*68.0*x^67.0-153360.0*-73.0/x^74.0+148248.0*70.0*x^69.0-147168.0*71.0*x^70.0-149850.0*-76.0/x^77.0+144300.0*73.0*x^72.0-142500.0*74.0*x^73.0-144144.0*-79.0/x^80.0+138138.0*76.0*x^75.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-1.018164E7*x^67.0+1.119528E7/x^74.0+1.037736E7*x^69.0-1.0448928E7*x^70.0+1.13886E7/x^77.0+1.05339E7*x^72.0-1.0545E7*x^73.0+1.1387376E7/x^80.0+1.0498488E7*x^75.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/164.90322580645162*x^72.0-1.0/161.0/x^69.0+1.0/186.27586206896552*x^74.0-1.0/198.21428571428572*x^75.0-1.0/194.66666666666666/x^72.0+1.0/225.07692307692307*x^77.0-1.0/240.24*x^78.0-1.0/237.5/x^75.0+1.0/274.7826086956522*x^80.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/164.90322580645162/73.0*x^73.0-1.0/161.0/-68.0/x^68.0+1.0/186.27586206896552/75.0*x^75.0-1.0/198.21428571428572/76.0*x^76.0-1.0/194.66666666666666/-71.0/x^71.0+1.0/225.07692307692307/78.0*x^78.0-1.0/240.24/79.0*x^79.0-1.0/237.5/-74.0/x^74.0+1.0/274.7826086956522/81.0*x^81.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/12037.935483870968*x^73.0+1.0/10948.0/x^68.0+1.0/13970.689655172415*x^75.0-1.0/15064.285714285716*x^76.0+1.0/13821.333333333332/x^71.0+1.0/17556.0*x^78.0-1.0/18978.96*x^79.0+1.0/17575.0/x^74.0+1.0/22257.391304347828*x^81.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-1.018164E7*x^67.0+1.119528E7/x^74.0+1.037736E7*x^69.0-1.0448928E7*x^70.0+1.13886E7/x^77.0+1.05339E7*x^72.0-1.0545E7*x^73.0+1.1387376E7/x^80.0+1.0498488E7*x^75.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-67.0*x^66.0+0.0*-74.0/x^75.0+69.0*x^68.0-70.0*x^69.0+0.0*-77.0/x^78.0+72.0*x^71.0-73.0*x^72.0+0.0*-80.0/x^81.0+0.0*75.0*x^74.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-67.0*x^66.0-0.0/x^75.0+69.0*x^68.0-70.0*x^69.0-0.0/x^78.0+72.0*x^71.0-73.0*x^72.0-0.0/x^81.0+0.0*x^74.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/12037.935483870968*x^73.0+1.0/10948.0/x^68.0+1.0/13970.689655172415*x^75.0-1.0/15064.285714285716*x^76.0+1.0/13821.333333333332/x^71.0+1.0/17556.0*x^78.0-1.0/18978.96*x^79.0+1.0/17575.0/x^74.0+1.0/22257.391304347828*x^81.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/12037.935483870968/74.0*x^74.0+1.0/10948.0/-67.0/x^67.0+1.0/13970.689655172415/76.0*x^76.0-1.0/15064.285714285716/77.0*x^77.0+1.0/13821.333333333332/-70.0/x^70.0+1.0/17556.0/79.0*x^79.0-1.0/18978.96/80.0*x^80.0+1.0/17575.0/-73.0/x^73.0+1.0/22257.391304347828/82.0*x^82.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/890807.2258064516*x^74.0-1.0/733516.0/x^67.0+1.0/1061772.4137931035*x^76.0-1.0/1159950.0*x^77.0-1.0/967493.3333333333/x^70.0+1.0/1386924.0*x^79.0-1.0/1518316.7999999998*x^80.0-1.0/1282975.0/x^73.0+1.0/1825106.086956522*x^82.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130471() {
 UsageCalculus.TestCase = 130471;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+30/-xy^71-29*-xy^72+28*-xy^73+27/-xy^74-26*-xy^75+25*-xy^76+24/-xy^77-23*-xy^78+22*-xy^79";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-30.0/xy^71.0+29.0*xy^72.0-28.0*xy^73.0-27.0/xy^74.0+26.0*xy^75.0-25.0*xy^76.0-24.0/xy^77.0+23.0*xy^78.0-22.0*xy^79.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-30.0*-71.0/xy^72.0+29.0*72.0*xy^71.0-28.0*73.0*xy^72.0-27.0*-74.0/xy^75.0+26.0*75.0*xy^74.0-25.0*76.0*xy^75.0-24.0*-77.0/xy^78.0+23.0*78.0*xy^77.0-22.0*79.0*xy^78.0";
 UsageCalculus.EqnSolArrayMap2[1] = "2130.0/xy^72.0+2088.0*xy^71.0-2044.0*xy^72.0+1998.0/xy^75.0+1950.0*xy^74.0-1900.0*xy^75.0+1848.0/xy^78.0+1794.0*xy^77.0-1738.0*xy^78.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-30.0/xy^71.0+29.0*xy^72.0-28.0*xy^73.0-27.0/xy^74.0+26.0*xy^75.0-25.0*xy^76.0-24.0/xy^77.0+23.0*xy^78.0-22.0*xy^79.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-30.0/-70.0/xy^70.0+29.0/73.0*xy^73.0-28.0/74.0*xy^74.0-27.0/-73.0/xy^73.0+26.0/76.0*xy^76.0-25.0/77.0*xy^77.0-24.0/-76.0/xy^76.0+23.0/79.0*xy^79.0-22.0/80.0*xy^80.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/2.3333333333333335/xy^70.0+1.0/2.5172413793103448*xy^73.0-1.0/2.642857142857143*xy^74.0+1.0/2.7037037037037037/xy^73.0+1.0/2.923076923076923*xy^76.0-1.0/3.08*xy^77.0+1.0/3.1666666666666665/xy^76.0+1.0/3.4347826086956523*xy^79.0-1.0/3.6363636363636362*xy^80.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "2130.0/xy^72.0+2088.0*xy^71.0-2044.0*xy^72.0+1998.0/xy^75.0+1950.0*xy^74.0-1900.0*xy^75.0+1848.0/xy^78.0+1794.0*xy^77.0-1738.0*xy^78.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "2130.0*-72.0/xy^73.0+2088.0*71.0*xy^70.0-2044.0*72.0*xy^71.0+1998.0*-75.0/xy^76.0+1950.0*74.0*xy^73.0-1900.0*75.0*xy^74.0+1848.0*-78.0/xy^79.0+1794.0*77.0*xy^76.0-1738.0*78.0*xy^77.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-153360.0/xy^73.0+148248.0*xy^70.0-147168.0*xy^71.0-149850.0/xy^76.0+144300.0*xy^73.0-142500.0*xy^74.0-144144.0/xy^79.0+138138.0*xy^76.0-135564.0*xy^77.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/2.3333333333333335/xy^70.0+1.0/2.5172413793103448*xy^73.0-1.0/2.642857142857143*xy^74.0+1.0/2.7037037037037037/xy^73.0+1.0/2.923076923076923*xy^76.0-1.0/3.08*xy^77.0+1.0/3.1666666666666665/xy^76.0+1.0/3.4347826086956523*xy^79.0-1.0/3.6363636363636362*xy^80.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/2.3333333333333335/-69.0/xy^69.0+1.0/2.5172413793103448/74.0*xy^74.0-1.0/2.642857142857143/75.0*xy^75.0+1.0/2.7037037037037037/-72.0/xy^72.0+1.0/2.923076923076923/77.0*xy^77.0-1.0/3.08/78.0*xy^78.0+1.0/3.1666666666666665/-75.0/xy^75.0+1.0/3.4347826086956523/80.0*xy^80.0-1.0/3.6363636363636362/81.0*xy^81.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/161.0/xy^69.0+1.0/186.27586206896552*xy^74.0-1.0/198.21428571428572*xy^75.0-1.0/194.66666666666666/xy^72.0+1.0/225.07692307692307*xy^77.0-1.0/240.24*xy^78.0-1.0/237.5/xy^75.0+1.0/274.7826086956522*xy^80.0-1.0/294.54545454545456*xy^81.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-153360.0/xy^73.0+148248.0*xy^70.0-147168.0*xy^71.0-149850.0/xy^76.0+144300.0*xy^73.0-142500.0*xy^74.0-144144.0/xy^79.0+138138.0*xy^76.0-135564.0*xy^77.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-153360.0*-73.0/xy^74.0+148248.0*70.0*xy^69.0-147168.0*71.0*xy^70.0-149850.0*-76.0/xy^77.0+144300.0*73.0*xy^72.0-142500.0*74.0*xy^73.0-144144.0*-79.0/xy^80.0+138138.0*76.0*xy^75.0-135564.0*77.0*xy^76.0";
 UsageCalculus.EqnSolArrayMap2[3] = "1.119528E7/xy^74.0+1.037736E7*xy^69.0-1.0448928E7*xy^70.0+1.13886E7/xy^77.0+1.05339E7*xy^72.0-1.0545E7*xy^73.0+1.1387376E7/xy^80.0+1.0498488E7*xy^75.0-1.0438428E7*xy^76.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/161.0/xy^69.0+1.0/186.27586206896552*xy^74.0-1.0/198.21428571428572*xy^75.0-1.0/194.66666666666666/xy^72.0+1.0/225.07692307692307*xy^77.0-1.0/240.24*xy^78.0-1.0/237.5/xy^75.0+1.0/274.7826086956522*xy^80.0-1.0/294.54545454545456*xy^81.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/161.0/-68.0/xy^68.0+1.0/186.27586206896552/75.0*xy^75.0-1.0/198.21428571428572/76.0*xy^76.0-1.0/194.66666666666666/-71.0/xy^71.0+1.0/225.07692307692307/78.0*xy^78.0-1.0/240.24/79.0*xy^79.0-1.0/237.5/-74.0/xy^74.0+1.0/274.7826086956522/81.0*xy^81.0-1.0/294.54545454545456/82.0*xy^82.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/10948.0/xy^68.0+1.0/13970.689655172415*xy^75.0-1.0/15064.285714285716*xy^76.0+1.0/13821.333333333332/xy^71.0+1.0/17556.0*xy^78.0-1.0/18978.96*xy^79.0+1.0/17575.0/xy^74.0+1.0/22257.391304347828*xy^81.0-1.0/24152.727272727276*xy^82.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "1.119528E7/xy^74.0+1.037736E7*xy^69.0-1.0448928E7*xy^70.0+1.13886E7/xy^77.0+1.05339E7*xy^72.0-1.0545E7*xy^73.0+1.1387376E7/xy^80.0+1.0498488E7*xy^75.0-1.0438428E7*xy^76.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "0.0*-74.0/xy^75.0+69.0*xy^68.0-70.0*xy^69.0+0.0*-77.0/xy^78.0+72.0*xy^71.0-73.0*xy^72.0+0.0*-80.0/xy^81.0+75.0*xy^74.0-0.0*76.0*xy^75.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-0.0/xy^75.0+69.0*xy^68.0-70.0*xy^69.0-0.0/xy^78.0+72.0*xy^71.0-73.0*xy^72.0-0.0/xy^81.0+75.0*xy^74.0-0.0*xy^75.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/10948.0/xy^68.0+1.0/13970.689655172415*xy^75.0-1.0/15064.285714285716*xy^76.0+1.0/13821.333333333332/xy^71.0+1.0/17556.0*xy^78.0-1.0/18978.96*xy^79.0+1.0/17575.0/xy^74.0+1.0/22257.391304347828*xy^81.0-1.0/24152.727272727276*xy^82.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/10948.0/-67.0/xy^67.0+1.0/13970.689655172415/76.0*xy^76.0-1.0/15064.285714285716/77.0*xy^77.0+1.0/13821.333333333332/-70.0/xy^70.0+1.0/17556.0/79.0*xy^79.0-1.0/18978.96/80.0*xy^80.0+1.0/17575.0/-73.0/xy^73.0+1.0/22257.391304347828/82.0*xy^82.0-1.0/24152.727272727276/83.0*xy^83.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/733516.0/xy^67.0+1.0/1061772.4137931035*xy^76.0-1.0/1159950.0*xy^77.0-1.0/967493.3333333333/xy^70.0+1.0/1386924.0*xy^79.0-1.0/1518316.7999999998*xy^80.0-1.0/1282975.0/xy^73.0+1.0/1825106.086956522*xy^82.0-1.0/2004676.363636364*xy^83.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130472() {
 UsageCalculus.TestCase = 130472;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-29*-x^72+28*-x^73+27/-x^74-26*-x^75+25*-x^76+24/-x^77-23*-x^78+22*-x^79+21/-xyzxyzxyzxyzxyzxyzxyz^80";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "29.0*x^72.0-28.0*x^73.0-27.0/x^74.0+26.0*x^75.0-25.0*x^76.0-24.0/x^77.0+23.0*x^78.0-22.0*x^79.0-21.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "29.0*72.0*x^71.0-28.0*73.0*x^72.0-27.0*-74.0/x^75.0+26.0*75.0*x^74.0-25.0*76.0*x^75.0-24.0*-77.0/x^78.0+23.0*78.0*x^77.0-22.0*79.0*x^78.0-21.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "2088.0*x^71.0-2044.0*x^72.0+1998.0/x^75.0+1950.0*x^74.0-1900.0*x^75.0+1848.0/x^78.0+1794.0*x^77.0-1738.0*x^78.0";
 UsageCalculus.EqnSolArrayMap3[1] = "29.0*x^72.0-28.0*x^73.0-27.0/x^74.0+26.0*x^75.0-25.0*x^76.0-24.0/x^77.0+23.0*x^78.0-22.0*x^79.0-21.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "29.0/73.0*x^73.0-28.0/74.0*x^74.0-27.0/-73.0/x^73.0+26.0/76.0*x^76.0-25.0/77.0*x^77.0-24.0/-76.0/x^76.0+23.0/79.0*x^79.0-22.0/80.0*x^80.0-21.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/2.5172413793103448*x^73.0-1.0/2.642857142857143*x^74.0+1.0/2.7037037037037037/x^73.0+1.0/2.923076923076923*x^76.0-1.0/3.08*x^77.0+1.0/3.1666666666666665/x^76.0+1.0/3.4347826086956523*x^79.0-1.0/3.6363636363636362*x^80.0-21.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "2088.0*x^71.0-2044.0*x^72.0+1998.0/x^75.0+1950.0*x^74.0-1900.0*x^75.0+1848.0/x^78.0+1794.0*x^77.0-1738.0*x^78.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "2088.0*71.0*x^70.0-2044.0*72.0*x^71.0+1998.0*-75.0/x^76.0+1950.0*74.0*x^73.0-1900.0*75.0*x^74.0+1848.0*-78.0/x^79.0+1794.0*77.0*x^76.0-1738.0*78.0*x^77.0";
 UsageCalculus.EqnSolArrayMap2[2] = "148248.0*x^70.0-147168.0*x^71.0-149850.0/x^76.0+144300.0*x^73.0-142500.0*x^74.0-144144.0/x^79.0+138138.0*x^76.0-135564.0*x^77.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/2.5172413793103448*x^73.0-1.0/2.642857142857143*x^74.0+1.0/2.7037037037037037/x^73.0+1.0/2.923076923076923*x^76.0-1.0/3.08*x^77.0+1.0/3.1666666666666665/x^76.0+1.0/3.4347826086956523*x^79.0-1.0/3.6363636363636362*x^80.0-21.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/2.5172413793103448/74.0*x^74.0-1.0/2.642857142857143/75.0*x^75.0+1.0/2.7037037037037037/-72.0/x^72.0+1.0/2.923076923076923/77.0*x^77.0-1.0/3.08/78.0*x^78.0+1.0/3.1666666666666665/-75.0/x^75.0+1.0/3.4347826086956523/80.0*x^80.0-1.0/3.6363636363636362/81.0*x^81.0-21.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/186.27586206896552*x^74.0-1.0/198.21428571428572*x^75.0-1.0/194.66666666666666/x^72.0+1.0/225.07692307692307*x^77.0-1.0/240.24*x^78.0-1.0/237.5/x^75.0+1.0/274.7826086956522*x^80.0-1.0/294.54545454545456*x^81.0-10.5*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "148248.0*x^70.0-147168.0*x^71.0-149850.0/x^76.0+144300.0*x^73.0-142500.0*x^74.0-144144.0/x^79.0+138138.0*x^76.0-135564.0*x^77.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "148248.0*70.0*x^69.0-147168.0*71.0*x^70.0-149850.0*-76.0/x^77.0+144300.0*73.0*x^72.0-142500.0*74.0*x^73.0-144144.0*-79.0/x^80.0+138138.0*76.0*x^75.0-135564.0*77.0*x^76.0";
 UsageCalculus.EqnSolArrayMap2[3] = "1.037736E7*x^69.0-1.0448928E7*x^70.0+1.13886E7/x^77.0+1.05339E7*x^72.0-1.0545E7*x^73.0+1.1387376E7/x^80.0+1.0498488E7*x^75.0-1.0438428E7*x^76.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/186.27586206896552*x^74.0-1.0/198.21428571428572*x^75.0-1.0/194.66666666666666/x^72.0+1.0/225.07692307692307*x^77.0-1.0/240.24*x^78.0-1.0/237.5/x^75.0+1.0/274.7826086956522*x^80.0-1.0/294.54545454545456*x^81.0-10.5*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/186.27586206896552/75.0*x^75.0-1.0/198.21428571428572/76.0*x^76.0-1.0/194.66666666666666/-71.0/x^71.0+1.0/225.07692307692307/78.0*x^78.0-1.0/240.24/79.0*x^79.0-1.0/237.5/-74.0/x^74.0+1.0/274.7826086956522/81.0*x^81.0-1.0/294.54545454545456/82.0*x^82.0-10.5/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/13970.689655172415*x^75.0-1.0/15064.285714285716*x^76.0+1.0/13821.333333333332/x^71.0+1.0/17556.0*x^78.0-1.0/18978.96*x^79.0+1.0/17575.0/x^74.0+1.0/22257.391304347828*x^81.0-1.0/24152.727272727276*x^82.0-3.5*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "1.037736E7*x^69.0-1.0448928E7*x^70.0+1.13886E7/x^77.0+1.05339E7*x^72.0-1.0545E7*x^73.0+1.1387376E7/x^80.0+1.0498488E7*x^75.0-1.0438428E7*x^76.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "69.0*x^68.0-70.0*x^69.0+0.0*-77.0/x^78.0+72.0*x^71.0-73.0*x^72.0+0.0*-80.0/x^81.0+75.0*x^74.0-0.0*76.0*x^75.0";
 UsageCalculus.EqnSolArrayMap2[4] = "69.0*x^68.0-70.0*x^69.0-0.0/x^78.0+72.0*x^71.0-73.0*x^72.0-0.0/x^81.0+75.0*x^74.0-0.0*x^75.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/13970.689655172415*x^75.0-1.0/15064.285714285716*x^76.0+1.0/13821.333333333332/x^71.0+1.0/17556.0*x^78.0-1.0/18978.96*x^79.0+1.0/17575.0/x^74.0+1.0/22257.391304347828*x^81.0-1.0/24152.727272727276*x^82.0-3.5*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/13970.689655172415/76.0*x^76.0-1.0/15064.285714285716/77.0*x^77.0+1.0/13821.333333333332/-70.0/x^70.0+1.0/17556.0/79.0*x^79.0-1.0/18978.96/80.0*x^80.0+1.0/17575.0/-73.0/x^73.0+1.0/22257.391304347828/82.0*x^82.0-1.0/24152.727272727276/83.0*x^83.0-3.5/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/1061772.4137931035*x^76.0-1.0/1159950.0*x^77.0-1.0/967493.3333333333/x^70.0+1.0/1386924.0*x^79.0-1.0/1518316.7999999998*x^80.0-1.0/1282975.0/x^73.0+1.0/1825106.086956522*x^82.0-1.0/2004676.363636364*x^83.0-1.0/1.1428571428571428*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130473() {
 UsageCalculus.TestCase = 130473;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+28*-xyzx^73+27/-xyzx^74-26*-xyzx^75+25*-xyzx^76+24/-xyzx^77-23*-xyzx^78+22*-xyzx^79+21/-xyzxyzxyzxyzxyzxyzxyz^80-20*-xyzxyzxyzxyzxyzxyzxy^-81";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyzx";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-28.0*xyzx^73.0-27.0/xyzx^74.0+26.0*xyzx^75.0-25.0*xyzx^76.0-24.0/xyzx^77.0+23.0*xyzx^78.0-22.0*xyzx^79.0-21.0+20.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-28.0*73.0*xyzx^72.0-27.0*-74.0/xyzx^75.0+26.0*75.0*xyzx^74.0-25.0*76.0*xyzx^75.0-24.0*-77.0/xyzx^78.0+23.0*78.0*xyzx^77.0-22.0*79.0*xyzx^78.0-21.0*0.0+20.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-2044.0*xyzx^72.0+1998.0/xyzx^75.0+1950.0*xyzx^74.0-1900.0*xyzx^75.0+1848.0/xyzx^78.0+1794.0*xyzx^77.0-1738.0*xyzx^78.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-28.0*xyzx^73.0-27.0/xyzx^74.0+26.0*xyzx^75.0-25.0*xyzx^76.0-24.0/xyzx^77.0+23.0*xyzx^78.0-22.0*xyzx^79.0-21.0+20.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-28.0/74.0*xyzx^74.0-27.0/-73.0/xyzx^73.0+26.0/76.0*xyzx^76.0-25.0/77.0*xyzx^77.0-24.0/-76.0/xyzx^76.0+23.0/79.0*xyzx^79.0-22.0/80.0*xyzx^80.0-21.0*xyzx+20.0*xyzx";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/2.642857142857143*xyzx^74.0+1.0/2.7037037037037037/xyzx^73.0+1.0/2.923076923076923*xyzx^76.0-1.0/3.08*xyzx^77.0+1.0/3.1666666666666665/xyzx^76.0+1.0/3.4347826086956523*xyzx^79.0-1.0/3.6363636363636362*xyzx^80.0-21.0*xyzx+20.0*xyzx";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-2044.0*xyzx^72.0+1998.0/xyzx^75.0+1950.0*xyzx^74.0-1900.0*xyzx^75.0+1848.0/xyzx^78.0+1794.0*xyzx^77.0-1738.0*xyzx^78.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-2044.0*72.0*xyzx^71.0+1998.0*-75.0/xyzx^76.0+1950.0*74.0*xyzx^73.0-1900.0*75.0*xyzx^74.0+1848.0*-78.0/xyzx^79.0+1794.0*77.0*xyzx^76.0-1738.0*78.0*xyzx^77.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-147168.0*xyzx^71.0-149850.0/xyzx^76.0+144300.0*xyzx^73.0-142500.0*xyzx^74.0-144144.0/xyzx^79.0+138138.0*xyzx^76.0-135564.0*xyzx^77.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/2.642857142857143*xyzx^74.0+1.0/2.7037037037037037/xyzx^73.0+1.0/2.923076923076923*xyzx^76.0-1.0/3.08*xyzx^77.0+1.0/3.1666666666666665/xyzx^76.0+1.0/3.4347826086956523*xyzx^79.0-1.0/3.6363636363636362*xyzx^80.0-21.0*xyzx+20.0*xyzx";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/2.642857142857143/75.0*xyzx^75.0+1.0/2.7037037037037037/-72.0/xyzx^72.0+1.0/2.923076923076923/77.0*xyzx^77.0-1.0/3.08/78.0*xyzx^78.0+1.0/3.1666666666666665/-75.0/xyzx^75.0+1.0/3.4347826086956523/80.0*xyzx^80.0-1.0/3.6363636363636362/81.0*xyzx^81.0-21.0/2.0*xyzx^2.0+20.0/2.0*xyzx^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/198.21428571428572*xyzx^75.0-1.0/194.66666666666666/xyzx^72.0+1.0/225.07692307692307*xyzx^77.0-1.0/240.24*xyzx^78.0-1.0/237.5/xyzx^75.0+1.0/274.7826086956522*xyzx^80.0-1.0/294.54545454545456*xyzx^81.0-10.5*xyzx^2.0+10.0*xyzx^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-147168.0*xyzx^71.0-149850.0/xyzx^76.0+144300.0*xyzx^73.0-142500.0*xyzx^74.0-144144.0/xyzx^79.0+138138.0*xyzx^76.0-135564.0*xyzx^77.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-147168.0*71.0*xyzx^70.0-149850.0*-76.0/xyzx^77.0+144300.0*73.0*xyzx^72.0-142500.0*74.0*xyzx^73.0-144144.0*-79.0/xyzx^80.0+138138.0*76.0*xyzx^75.0-135564.0*77.0*xyzx^76.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-1.0448928E7*xyzx^70.0+1.13886E7/xyzx^77.0+1.05339E7*xyzx^72.0-1.0545E7*xyzx^73.0+1.1387376E7/xyzx^80.0+1.0498488E7*xyzx^75.0-1.0438428E7*xyzx^76.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/198.21428571428572*xyzx^75.0-1.0/194.66666666666666/xyzx^72.0+1.0/225.07692307692307*xyzx^77.0-1.0/240.24*xyzx^78.0-1.0/237.5/xyzx^75.0+1.0/274.7826086956522*xyzx^80.0-1.0/294.54545454545456*xyzx^81.0-10.5*xyzx^2.0+10.0*xyzx^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/198.21428571428572/76.0*xyzx^76.0-1.0/194.66666666666666/-71.0/xyzx^71.0+1.0/225.07692307692307/78.0*xyzx^78.0-1.0/240.24/79.0*xyzx^79.0-1.0/237.5/-74.0/xyzx^74.0+1.0/274.7826086956522/81.0*xyzx^81.0-1.0/294.54545454545456/82.0*xyzx^82.0-10.5/3.0*xyzx^3.0+10.0/3.0*xyzx^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/15064.285714285716*xyzx^76.0+1.0/13821.333333333332/xyzx^71.0+1.0/17556.0*xyzx^78.0-1.0/18978.96*xyzx^79.0+1.0/17575.0/xyzx^74.0+1.0/22257.391304347828*xyzx^81.0-1.0/24152.727272727276*xyzx^82.0-3.5*xyzx^3.0+3.3333333333333335*xyzx^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-1.0448928E7*xyzx^70.0+1.13886E7/xyzx^77.0+1.05339E7*xyzx^72.0-1.0545E7*xyzx^73.0+1.1387376E7/xyzx^80.0+1.0498488E7*xyzx^75.0-1.0438428E7*xyzx^76.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-70.0*xyzx^69.0+0.0*-77.0/xyzx^78.0+72.0*xyzx^71.0-73.0*xyzx^72.0+0.0*-80.0/xyzx^81.0+75.0*xyzx^74.0-0.0*76.0*xyzx^75.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-70.0*xyzx^69.0-0.0/xyzx^78.0+72.0*xyzx^71.0-73.0*xyzx^72.0-0.0/xyzx^81.0+75.0*xyzx^74.0-0.0*xyzx^75.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/15064.285714285716*xyzx^76.0+1.0/13821.333333333332/xyzx^71.0+1.0/17556.0*xyzx^78.0-1.0/18978.96*xyzx^79.0+1.0/17575.0/xyzx^74.0+1.0/22257.391304347828*xyzx^81.0-1.0/24152.727272727276*xyzx^82.0-3.5*xyzx^3.0+3.3333333333333335*xyzx^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/15064.285714285716/77.0*xyzx^77.0+1.0/13821.333333333332/-70.0/xyzx^70.0+1.0/17556.0/79.0*xyzx^79.0-1.0/18978.96/80.0*xyzx^80.0+1.0/17575.0/-73.0/xyzx^73.0+1.0/22257.391304347828/82.0*xyzx^82.0-1.0/24152.727272727276/83.0*xyzx^83.0-3.5/4.0*xyzx^4.0+3.3333333333333335/4.0*xyzx^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/1159950.0*xyzx^77.0-1.0/967493.3333333333/xyzx^70.0+1.0/1386924.0*xyzx^79.0-1.0/1518316.7999999998*xyzx^80.0-1.0/1282975.0/xyzx^73.0+1.0/1825106.086956522*xyzx^82.0-1.0/2004676.363636364*xyzx^83.0-1.0/1.1428571428571428*xyzx^4.0+1.0/1.2*xyzx^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130474() {
 UsageCalculus.TestCase = 130474;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+27/-x^74-26*-x^75+25*-x^76+24/-x^77-23*-x^78+22*-x^79+21/-xyzxyzxyzxyzxyzxyzxyz^80-20*-xyzxyzxyzxyzxyzxyzxy^-81+19";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-27.0/x^74.0+26.0*x^75.0-25.0*x^76.0-24.0/x^77.0+23.0*x^78.0-22.0*x^79.0-21.0+20.0+19.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-27.0*-74.0/x^75.0+26.0*75.0*x^74.0-25.0*76.0*x^75.0-24.0*-77.0/x^78.0+23.0*78.0*x^77.0-22.0*79.0*x^78.0-21.0*0.0+20.0*0.0+19.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "1998.0/x^75.0+1950.0*x^74.0-1900.0*x^75.0+1848.0/x^78.0+1794.0*x^77.0-1738.0*x^78.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-27.0/x^74.0+26.0*x^75.0-25.0*x^76.0-24.0/x^77.0+23.0*x^78.0-22.0*x^79.0-21.0+20.0+19.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-27.0/-73.0/x^73.0+26.0/76.0*x^76.0-25.0/77.0*x^77.0-24.0/-76.0/x^76.0+23.0/79.0*x^79.0-22.0/80.0*x^80.0-21.0*x+20.0*x+19.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/2.7037037037037037/x^73.0+1.0/2.923076923076923*x^76.0-1.0/3.08*x^77.0+1.0/3.1666666666666665/x^76.0+1.0/3.4347826086956523*x^79.0-1.0/3.6363636363636362*x^80.0-21.0*x+20.0*x+19.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "1998.0/x^75.0+1950.0*x^74.0-1900.0*x^75.0+1848.0/x^78.0+1794.0*x^77.0-1738.0*x^78.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "1998.0*-75.0/x^76.0+1950.0*74.0*x^73.0-1900.0*75.0*x^74.0+1848.0*-78.0/x^79.0+1794.0*77.0*x^76.0-1738.0*78.0*x^77.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-149850.0/x^76.0+144300.0*x^73.0-142500.0*x^74.0-144144.0/x^79.0+138138.0*x^76.0-135564.0*x^77.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/2.7037037037037037/x^73.0+1.0/2.923076923076923*x^76.0-1.0/3.08*x^77.0+1.0/3.1666666666666665/x^76.0+1.0/3.4347826086956523*x^79.0-1.0/3.6363636363636362*x^80.0-21.0*x+20.0*x+19.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/2.7037037037037037/-72.0/x^72.0+1.0/2.923076923076923/77.0*x^77.0-1.0/3.08/78.0*x^78.0+1.0/3.1666666666666665/-75.0/x^75.0+1.0/3.4347826086956523/80.0*x^80.0-1.0/3.6363636363636362/81.0*x^81.0-21.0/2.0*x^2.0+20.0/2.0*x^2.0+19.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/194.66666666666666/x^72.0+1.0/225.07692307692307*x^77.0-1.0/240.24*x^78.0-1.0/237.5/x^75.0+1.0/274.7826086956522*x^80.0-1.0/294.54545454545456*x^81.0-10.5*x^2.0+10.0*x^2.0+9.5*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-149850.0/x^76.0+144300.0*x^73.0-142500.0*x^74.0-144144.0/x^79.0+138138.0*x^76.0-135564.0*x^77.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-149850.0*-76.0/x^77.0+144300.0*73.0*x^72.0-142500.0*74.0*x^73.0-144144.0*-79.0/x^80.0+138138.0*76.0*x^75.0-135564.0*77.0*x^76.0";
 UsageCalculus.EqnSolArrayMap2[3] = "1.13886E7/x^77.0+1.05339E7*x^72.0-1.0545E7*x^73.0+1.1387376E7/x^80.0+1.0498488E7*x^75.0-1.0438428E7*x^76.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/194.66666666666666/x^72.0+1.0/225.07692307692307*x^77.0-1.0/240.24*x^78.0-1.0/237.5/x^75.0+1.0/274.7826086956522*x^80.0-1.0/294.54545454545456*x^81.0-10.5*x^2.0+10.0*x^2.0+9.5*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/194.66666666666666/-71.0/x^71.0+1.0/225.07692307692307/78.0*x^78.0-1.0/240.24/79.0*x^79.0-1.0/237.5/-74.0/x^74.0+1.0/274.7826086956522/81.0*x^81.0-1.0/294.54545454545456/82.0*x^82.0-10.5/3.0*x^3.0+10.0/3.0*x^3.0+9.5/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/13821.333333333332/x^71.0+1.0/17556.0*x^78.0-1.0/18978.96*x^79.0+1.0/17575.0/x^74.0+1.0/22257.391304347828*x^81.0-1.0/24152.727272727276*x^82.0-3.5*x^3.0+3.3333333333333335*x^3.0+3.1666666666666665*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "1.13886E7/x^77.0+1.05339E7*x^72.0-1.0545E7*x^73.0+1.1387376E7/x^80.0+1.0498488E7*x^75.0-1.0438428E7*x^76.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "0.0*-77.0/x^78.0+72.0*x^71.0-73.0*x^72.0+0.0*-80.0/x^81.0+75.0*x^74.0-0.0*76.0*x^75.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-0.0/x^78.0+72.0*x^71.0-73.0*x^72.0-0.0/x^81.0+75.0*x^74.0-0.0*x^75.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/13821.333333333332/x^71.0+1.0/17556.0*x^78.0-1.0/18978.96*x^79.0+1.0/17575.0/x^74.0+1.0/22257.391304347828*x^81.0-1.0/24152.727272727276*x^82.0-3.5*x^3.0+3.3333333333333335*x^3.0+3.1666666666666665*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/13821.333333333332/-70.0/x^70.0+1.0/17556.0/79.0*x^79.0-1.0/18978.96/80.0*x^80.0+1.0/17575.0/-73.0/x^73.0+1.0/22257.391304347828/82.0*x^82.0-1.0/24152.727272727276/83.0*x^83.0-3.5/4.0*x^4.0+3.3333333333333335/4.0*x^4.0+3.1666666666666665/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/967493.3333333333/x^70.0+1.0/1386924.0*x^79.0-1.0/1518316.7999999998*x^80.0-1.0/1282975.0/x^73.0+1.0/1825106.086956522*x^82.0-1.0/2004676.363636364*x^83.0-1.0/1.1428571428571428*x^4.0+1.0/1.2*x^4.0+1.0/1.2631578947368423*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130475() {
 UsageCalculus.TestCase = 130475;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-26*-xy^75+25*-xy^76+24/-xy^77-23*-xy^78+22*-xy^79+21/-xyzxyzxyzxyzxyzxyzxyz^80-20*-xyzxyzxyzxyzxyzxyzxy^-81+19+18/-xyzxyzxyzxyzxyzxyz^83";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "26.0*xy^75.0-25.0*xy^76.0-24.0/xy^77.0+23.0*xy^78.0-22.0*xy^79.0-21.0+20.0+19.0-18.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "26.0*75.0*xy^74.0-25.0*76.0*xy^75.0-24.0*-77.0/xy^78.0+23.0*78.0*xy^77.0-22.0*79.0*xy^78.0-21.0*0.0+20.0*0.0+19.0*0.0-18.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "1950.0*xy^74.0-1900.0*xy^75.0+1848.0/xy^78.0+1794.0*xy^77.0-1738.0*xy^78.0";
 UsageCalculus.EqnSolArrayMap3[1] = "26.0*xy^75.0-25.0*xy^76.0-24.0/xy^77.0+23.0*xy^78.0-22.0*xy^79.0-21.0+20.0+19.0-18.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "26.0/76.0*xy^76.0-25.0/77.0*xy^77.0-24.0/-76.0/xy^76.0+23.0/79.0*xy^79.0-22.0/80.0*xy^80.0-21.0*xy+20.0*xy+19.0*xy-18.0*xy";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/2.923076923076923*xy^76.0-1.0/3.08*xy^77.0+1.0/3.1666666666666665/xy^76.0+1.0/3.4347826086956523*xy^79.0-1.0/3.6363636363636362*xy^80.0-21.0*xy+20.0*xy+19.0*xy-18.0*xy";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "1950.0*xy^74.0-1900.0*xy^75.0+1848.0/xy^78.0+1794.0*xy^77.0-1738.0*xy^78.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "1950.0*74.0*xy^73.0-1900.0*75.0*xy^74.0+1848.0*-78.0/xy^79.0+1794.0*77.0*xy^76.0-1738.0*78.0*xy^77.0";
 UsageCalculus.EqnSolArrayMap2[2] = "144300.0*xy^73.0-142500.0*xy^74.0-144144.0/xy^79.0+138138.0*xy^76.0-135564.0*xy^77.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/2.923076923076923*xy^76.0-1.0/3.08*xy^77.0+1.0/3.1666666666666665/xy^76.0+1.0/3.4347826086956523*xy^79.0-1.0/3.6363636363636362*xy^80.0-21.0*xy+20.0*xy+19.0*xy-18.0*xy";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/2.923076923076923/77.0*xy^77.0-1.0/3.08/78.0*xy^78.0+1.0/3.1666666666666665/-75.0/xy^75.0+1.0/3.4347826086956523/80.0*xy^80.0-1.0/3.6363636363636362/81.0*xy^81.0-21.0/2.0*xy^2.0+20.0/2.0*xy^2.0+19.0/2.0*xy^2.0-18.0/2.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/225.07692307692307*xy^77.0-1.0/240.24*xy^78.0-1.0/237.5/xy^75.0+1.0/274.7826086956522*xy^80.0-1.0/294.54545454545456*xy^81.0-10.5*xy^2.0+10.0*xy^2.0+9.5*xy^2.0-9.0*xy^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "144300.0*xy^73.0-142500.0*xy^74.0-144144.0/xy^79.0+138138.0*xy^76.0-135564.0*xy^77.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "144300.0*73.0*xy^72.0-142500.0*74.0*xy^73.0-144144.0*-79.0/xy^80.0+138138.0*76.0*xy^75.0-135564.0*77.0*xy^76.0";
 UsageCalculus.EqnSolArrayMap2[3] = "1.05339E7*xy^72.0-1.0545E7*xy^73.0+1.1387376E7/xy^80.0+1.0498488E7*xy^75.0-1.0438428E7*xy^76.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/225.07692307692307*xy^77.0-1.0/240.24*xy^78.0-1.0/237.5/xy^75.0+1.0/274.7826086956522*xy^80.0-1.0/294.54545454545456*xy^81.0-10.5*xy^2.0+10.0*xy^2.0+9.5*xy^2.0-9.0*xy^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/225.07692307692307/78.0*xy^78.0-1.0/240.24/79.0*xy^79.0-1.0/237.5/-74.0/xy^74.0+1.0/274.7826086956522/81.0*xy^81.0-1.0/294.54545454545456/82.0*xy^82.0-10.5/3.0*xy^3.0+10.0/3.0*xy^3.0+9.5/3.0*xy^3.0-9.0/3.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/17556.0*xy^78.0-1.0/18978.96*xy^79.0+1.0/17575.0/xy^74.0+1.0/22257.391304347828*xy^81.0-1.0/24152.727272727276*xy^82.0-3.5*xy^3.0+3.3333333333333335*xy^3.0+3.1666666666666665*xy^3.0-3.0*xy^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "1.05339E7*xy^72.0-1.0545E7*xy^73.0+1.1387376E7/xy^80.0+1.0498488E7*xy^75.0-1.0438428E7*xy^76.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "72.0*xy^71.0-73.0*xy^72.0+0.0*-80.0/xy^81.0+75.0*xy^74.0-0.0*76.0*xy^75.0";
 UsageCalculus.EqnSolArrayMap2[4] = "72.0*xy^71.0-73.0*xy^72.0-0.0/xy^81.0+75.0*xy^74.0-0.0*xy^75.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/17556.0*xy^78.0-1.0/18978.96*xy^79.0+1.0/17575.0/xy^74.0+1.0/22257.391304347828*xy^81.0-1.0/24152.727272727276*xy^82.0-3.5*xy^3.0+3.3333333333333335*xy^3.0+3.1666666666666665*xy^3.0-3.0*xy^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/17556.0/79.0*xy^79.0-1.0/18978.96/80.0*xy^80.0+1.0/17575.0/-73.0/xy^73.0+1.0/22257.391304347828/82.0*xy^82.0-1.0/24152.727272727276/83.0*xy^83.0-3.5/4.0*xy^4.0+3.3333333333333335/4.0*xy^4.0+3.1666666666666665/4.0*xy^4.0-3.0/4.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/1386924.0*xy^79.0-1.0/1518316.7999999998*xy^80.0-1.0/1282975.0/xy^73.0+1.0/1825106.086956522*xy^82.0-1.0/2004676.363636364*xy^83.0-1.0/1.1428571428571428*xy^4.0+1.0/1.2*xy^4.0+1.0/1.2631578947368423*xy^4.0-1.0/1.3333333333333333*xy^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130476() {
 UsageCalculus.TestCase = 130476;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+25*-x^76+24/-x^77-23*-x^78+22*-x^79+21/-xyzxyzxyzxyzxyzxyzxyz^80-20*-xyzxyzxyzxyzxyzxyzxy^-81+19+18/-xyzxyzxyzxyzxyzxyz^83-17*-xyzxyzxyzxyzxyzxy^-84";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-25.0*x^76.0-24.0/x^77.0+23.0*x^78.0-22.0*x^79.0-21.0+20.0+19.0-18.0+17.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-25.0*76.0*x^75.0-24.0*-77.0/x^78.0+23.0*78.0*x^77.0-22.0*79.0*x^78.0-21.0*0.0+20.0*0.0+19.0*0.0-18.0*0.0+17.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-1900.0*x^75.0+1848.0/x^78.0+1794.0*x^77.0-1738.0*x^78.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-25.0*x^76.0-24.0/x^77.0+23.0*x^78.0-22.0*x^79.0-21.0+20.0+19.0-18.0+17.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-25.0/77.0*x^77.0-24.0/-76.0/x^76.0+23.0/79.0*x^79.0-22.0/80.0*x^80.0-21.0*x+20.0*x+19.0*x-18.0*x+17.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/3.08*x^77.0+1.0/3.1666666666666665/x^76.0+1.0/3.4347826086956523*x^79.0-1.0/3.6363636363636362*x^80.0-21.0*x+20.0*x+19.0*x-18.0*x+17.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-1900.0*x^75.0+1848.0/x^78.0+1794.0*x^77.0-1738.0*x^78.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-1900.0*75.0*x^74.0+1848.0*-78.0/x^79.0+1794.0*77.0*x^76.0-1738.0*78.0*x^77.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-142500.0*x^74.0-144144.0/x^79.0+138138.0*x^76.0-135564.0*x^77.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/3.08*x^77.0+1.0/3.1666666666666665/x^76.0+1.0/3.4347826086956523*x^79.0-1.0/3.6363636363636362*x^80.0-21.0*x+20.0*x+19.0*x-18.0*x+17.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/3.08/78.0*x^78.0+1.0/3.1666666666666665/-75.0/x^75.0+1.0/3.4347826086956523/80.0*x^80.0-1.0/3.6363636363636362/81.0*x^81.0-21.0/2.0*x^2.0+20.0/2.0*x^2.0+19.0/2.0*x^2.0-18.0/2.0*x^2.0+17.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/240.24*x^78.0-1.0/237.5/x^75.0+1.0/274.7826086956522*x^80.0-1.0/294.54545454545456*x^81.0-10.5*x^2.0+10.0*x^2.0+9.5*x^2.0-9.0*x^2.0+8.5*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-142500.0*x^74.0-144144.0/x^79.0+138138.0*x^76.0-135564.0*x^77.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-142500.0*74.0*x^73.0-144144.0*-79.0/x^80.0+138138.0*76.0*x^75.0-135564.0*77.0*x^76.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-1.0545E7*x^73.0+1.1387376E7/x^80.0+1.0498488E7*x^75.0-1.0438428E7*x^76.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/240.24*x^78.0-1.0/237.5/x^75.0+1.0/274.7826086956522*x^80.0-1.0/294.54545454545456*x^81.0-10.5*x^2.0+10.0*x^2.0+9.5*x^2.0-9.0*x^2.0+8.5*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/240.24/79.0*x^79.0-1.0/237.5/-74.0/x^74.0+1.0/274.7826086956522/81.0*x^81.0-1.0/294.54545454545456/82.0*x^82.0-10.5/3.0*x^3.0+10.0/3.0*x^3.0+9.5/3.0*x^3.0-9.0/3.0*x^3.0+8.5/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/18978.96*x^79.0+1.0/17575.0/x^74.0+1.0/22257.391304347828*x^81.0-1.0/24152.727272727276*x^82.0-3.5*x^3.0+3.3333333333333335*x^3.0+3.1666666666666665*x^3.0-3.0*x^3.0+2.8333333333333335*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-1.0545E7*x^73.0+1.1387376E7/x^80.0+1.0498488E7*x^75.0-1.0438428E7*x^76.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-73.0*x^72.0+0.0*-80.0/x^81.0+75.0*x^74.0-0.0*76.0*x^75.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-73.0*x^72.0-0.0/x^81.0+75.0*x^74.0-0.0*x^75.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/18978.96*x^79.0+1.0/17575.0/x^74.0+1.0/22257.391304347828*x^81.0-1.0/24152.727272727276*x^82.0-3.5*x^3.0+3.3333333333333335*x^3.0+3.1666666666666665*x^3.0-3.0*x^3.0+2.8333333333333335*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/18978.96/80.0*x^80.0+1.0/17575.0/-73.0/x^73.0+1.0/22257.391304347828/82.0*x^82.0-1.0/24152.727272727276/83.0*x^83.0-3.5/4.0*x^4.0+3.3333333333333335/4.0*x^4.0+3.1666666666666665/4.0*x^4.0-3.0/4.0*x^4.0+2.8333333333333335/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/1518316.7999999998*x^80.0-1.0/1282975.0/x^73.0+1.0/1825106.086956522*x^82.0-1.0/2004676.363636364*x^83.0-1.0/1.1428571428571428*x^4.0+1.0/1.2*x^4.0+1.0/1.2631578947368423*x^4.0-1.0/1.3333333333333333*x^4.0+1.0/1.4117647058823528*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130477() {
 UsageCalculus.TestCase = 130477;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+24/-xyzx^77-23*-xyzx^78+22*-xyzx^79+21/-xyzxyzxyzxyzxyzxyzxyz^80-20*-xyzxyzxyzxyzxyzxyzxy^-81+19+18/-xyzxyzxyzxyzxyzxyz^83-17*-xyzxyzxyzxyzxyzxy^-84+16*-xyzxyzxyzxyzxyzx^85";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyzx";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-24.0/xyzx^77.0+23.0*xyzx^78.0-22.0*xyzx^79.0-21.0+20.0+19.0-18.0+17.0-16.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-24.0*-77.0/xyzx^78.0+23.0*78.0*xyzx^77.0-22.0*79.0*xyzx^78.0-21.0*0.0+20.0*0.0+19.0*0.0-18.0*0.0+17.0*0.0-16.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "1848.0/xyzx^78.0+1794.0*xyzx^77.0-1738.0*xyzx^78.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-24.0/xyzx^77.0+23.0*xyzx^78.0-22.0*xyzx^79.0-21.0+20.0+19.0-18.0+17.0-16.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-24.0/-76.0/xyzx^76.0+23.0/79.0*xyzx^79.0-22.0/80.0*xyzx^80.0-21.0*xyzx+20.0*xyzx+19.0*xyzx-18.0*xyzx+17.0*xyzx-16.0*xyzx";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/3.1666666666666665/xyzx^76.0+1.0/3.4347826086956523*xyzx^79.0-1.0/3.6363636363636362*xyzx^80.0-21.0*xyzx+20.0*xyzx+19.0*xyzx-18.0*xyzx+17.0*xyzx-16.0*xyzx";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "1848.0/xyzx^78.0+1794.0*xyzx^77.0-1738.0*xyzx^78.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "1848.0*-78.0/xyzx^79.0+1794.0*77.0*xyzx^76.0-1738.0*78.0*xyzx^77.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-144144.0/xyzx^79.0+138138.0*xyzx^76.0-135564.0*xyzx^77.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/3.1666666666666665/xyzx^76.0+1.0/3.4347826086956523*xyzx^79.0-1.0/3.6363636363636362*xyzx^80.0-21.0*xyzx+20.0*xyzx+19.0*xyzx-18.0*xyzx+17.0*xyzx-16.0*xyzx";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/3.1666666666666665/-75.0/xyzx^75.0+1.0/3.4347826086956523/80.0*xyzx^80.0-1.0/3.6363636363636362/81.0*xyzx^81.0-21.0/2.0*xyzx^2.0+20.0/2.0*xyzx^2.0+19.0/2.0*xyzx^2.0-18.0/2.0*xyzx^2.0+17.0/2.0*xyzx^2.0-16.0/2.0*xyzx^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/237.5/xyzx^75.0+1.0/274.7826086956522*xyzx^80.0-1.0/294.54545454545456*xyzx^81.0-10.5*xyzx^2.0+10.0*xyzx^2.0+9.5*xyzx^2.0-9.0*xyzx^2.0+8.5*xyzx^2.0-8.0*xyzx^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-144144.0/xyzx^79.0+138138.0*xyzx^76.0-135564.0*xyzx^77.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-144144.0*-79.0/xyzx^80.0+138138.0*76.0*xyzx^75.0-135564.0*77.0*xyzx^76.0";
 UsageCalculus.EqnSolArrayMap2[3] = "1.1387376E7/xyzx^80.0+1.0498488E7*xyzx^75.0-1.0438428E7*xyzx^76.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/237.5/xyzx^75.0+1.0/274.7826086956522*xyzx^80.0-1.0/294.54545454545456*xyzx^81.0-10.5*xyzx^2.0+10.0*xyzx^2.0+9.5*xyzx^2.0-9.0*xyzx^2.0+8.5*xyzx^2.0-8.0*xyzx^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/237.5/-74.0/xyzx^74.0+1.0/274.7826086956522/81.0*xyzx^81.0-1.0/294.54545454545456/82.0*xyzx^82.0-10.5/3.0*xyzx^3.0+10.0/3.0*xyzx^3.0+9.5/3.0*xyzx^3.0-9.0/3.0*xyzx^3.0+8.5/3.0*xyzx^3.0-8.0/3.0*xyzx^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/17575.0/xyzx^74.0+1.0/22257.391304347828*xyzx^81.0-1.0/24152.727272727276*xyzx^82.0-3.5*xyzx^3.0+3.3333333333333335*xyzx^3.0+3.1666666666666665*xyzx^3.0-3.0*xyzx^3.0+2.8333333333333335*xyzx^3.0-2.6666666666666665*xyzx^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "1.1387376E7/xyzx^80.0+1.0498488E7*xyzx^75.0-1.0438428E7*xyzx^76.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "0.0*-80.0/xyzx^81.0+75.0*xyzx^74.0-0.0*76.0*xyzx^75.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-0.0/xyzx^81.0+75.0*xyzx^74.0-0.0*xyzx^75.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/17575.0/xyzx^74.0+1.0/22257.391304347828*xyzx^81.0-1.0/24152.727272727276*xyzx^82.0-3.5*xyzx^3.0+3.3333333333333335*xyzx^3.0+3.1666666666666665*xyzx^3.0-3.0*xyzx^3.0+2.8333333333333335*xyzx^3.0-2.6666666666666665*xyzx^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/17575.0/-73.0/xyzx^73.0+1.0/22257.391304347828/82.0*xyzx^82.0-1.0/24152.727272727276/83.0*xyzx^83.0-3.5/4.0*xyzx^4.0+3.3333333333333335/4.0*xyzx^4.0+3.1666666666666665/4.0*xyzx^4.0-3.0/4.0*xyzx^4.0+2.8333333333333335/4.0*xyzx^4.0-2.6666666666666665/4.0*xyzx^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/1282975.0/xyzx^73.0+1.0/1825106.086956522*xyzx^82.0-1.0/2004676.363636364*xyzx^83.0-1.0/1.1428571428571428*xyzx^4.0+1.0/1.2*xyzx^4.0+1.0/1.2631578947368423*xyzx^4.0-1.0/1.3333333333333333*xyzx^4.0+1.0/1.4117647058823528*xyzx^4.0-1.0/1.5*xyzx^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130478() {
 UsageCalculus.TestCase = 130478;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-23*-x^78+22*-x^79+21/-xyzxyzxyzxyzxyzxyzxyz^80-20*-xyzxyzxyzxyzxyzxyzxy^-81+19+18/-xyzxyzxyzxyzxyzxyz^83-17*-xyzxyzxyzxyzxyzxy^-84+16*-xyzxyzxyzxyzxyzx^85+15/-xyzxyzxyzxyzxyz^86";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "23.0*x^78.0-22.0*x^79.0-21.0+20.0+19.0-18.0+17.0-16.0-15.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "23.0*78.0*x^77.0-22.0*79.0*x^78.0-21.0*0.0+20.0*0.0+19.0*0.0-18.0*0.0+17.0*0.0-16.0*0.0-15.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "1794.0*x^77.0-1738.0*x^78.0";
 UsageCalculus.EqnSolArrayMap3[1] = "23.0*x^78.0-22.0*x^79.0-21.0+20.0+19.0-18.0+17.0-16.0-15.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "23.0/79.0*x^79.0-22.0/80.0*x^80.0-21.0*x+20.0*x+19.0*x-18.0*x+17.0*x-16.0*x-15.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/3.4347826086956523*x^79.0-1.0/3.6363636363636362*x^80.0-21.0*x+20.0*x+19.0*x-18.0*x+17.0*x-16.0*x-15.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "1794.0*x^77.0-1738.0*x^78.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "1794.0*77.0*x^76.0-1738.0*78.0*x^77.0";
 UsageCalculus.EqnSolArrayMap2[2] = "138138.0*x^76.0-135564.0*x^77.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/3.4347826086956523*x^79.0-1.0/3.6363636363636362*x^80.0-21.0*x+20.0*x+19.0*x-18.0*x+17.0*x-16.0*x-15.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/3.4347826086956523/80.0*x^80.0-1.0/3.6363636363636362/81.0*x^81.0-21.0/2.0*x^2.0+20.0/2.0*x^2.0+19.0/2.0*x^2.0-18.0/2.0*x^2.0+17.0/2.0*x^2.0-16.0/2.0*x^2.0-15.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/274.7826086956522*x^80.0-1.0/294.54545454545456*x^81.0-10.5*x^2.0+10.0*x^2.0+9.5*x^2.0-9.0*x^2.0+8.5*x^2.0-8.0*x^2.0-7.5*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "138138.0*x^76.0-135564.0*x^77.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "138138.0*76.0*x^75.0-135564.0*77.0*x^76.0";
 UsageCalculus.EqnSolArrayMap2[3] = "1.0498488E7*x^75.0-1.0438428E7*x^76.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/274.7826086956522*x^80.0-1.0/294.54545454545456*x^81.0-10.5*x^2.0+10.0*x^2.0+9.5*x^2.0-9.0*x^2.0+8.5*x^2.0-8.0*x^2.0-7.5*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/274.7826086956522/81.0*x^81.0-1.0/294.54545454545456/82.0*x^82.0-10.5/3.0*x^3.0+10.0/3.0*x^3.0+9.5/3.0*x^3.0-9.0/3.0*x^3.0+8.5/3.0*x^3.0-8.0/3.0*x^3.0-7.5/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/22257.391304347828*x^81.0-1.0/24152.727272727276*x^82.0-3.5*x^3.0+3.3333333333333335*x^3.0+3.1666666666666665*x^3.0-3.0*x^3.0+2.8333333333333335*x^3.0-2.6666666666666665*x^3.0-2.5*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "1.0498488E7*x^75.0-1.0438428E7*x^76.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "75.0*x^74.0-0.0*76.0*x^75.0";
 UsageCalculus.EqnSolArrayMap2[4] = "75.0*x^74.0-0.0*x^75.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/22257.391304347828*x^81.0-1.0/24152.727272727276*x^82.0-3.5*x^3.0+3.3333333333333335*x^3.0+3.1666666666666665*x^3.0-3.0*x^3.0+2.8333333333333335*x^3.0-2.6666666666666665*x^3.0-2.5*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/22257.391304347828/82.0*x^82.0-1.0/24152.727272727276/83.0*x^83.0-3.5/4.0*x^4.0+3.3333333333333335/4.0*x^4.0+3.1666666666666665/4.0*x^4.0-3.0/4.0*x^4.0+2.8333333333333335/4.0*x^4.0-2.6666666666666665/4.0*x^4.0-2.5/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/1825106.086956522*x^82.0-1.0/2004676.363636364*x^83.0-1.0/1.1428571428571428*x^4.0+1.0/1.2*x^4.0+1.0/1.2631578947368423*x^4.0-1.0/1.3333333333333333*x^4.0+1.0/1.4117647058823528*x^4.0-1.0/1.5*x^4.0-1.0/1.6*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130479() {
 UsageCalculus.TestCase = 130479;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+22*-xy^79+21/-xyzxyzxyzxyzxyzxyzxyz^80-20*-xyzxyzxyzxyzxyzxyzxy^-81+19+18/-xyzxyzxyzxyzxyzxyz^83-17*-xyzxyzxyzxyzxyzxy^-84+16*-xyzxyzxyzxyzxyzx^85+15/-xyzxyzxyzxyzxyz^86-14*-xyzxyzxyzxyzxy^-87";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-22.0*xy^79.0-21.0+20.0+19.0-18.0+17.0-16.0-15.0+14.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-22.0*79.0*xy^78.0-21.0*0.0+20.0*0.0+19.0*0.0-18.0*0.0+17.0*0.0-16.0*0.0-15.0*0.0+14.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-1738.0*xy^78.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-22.0*xy^79.0-21.0+20.0+19.0-18.0+17.0-16.0-15.0+14.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-22.0/80.0*xy^80.0-21.0*xy+20.0*xy+19.0*xy-18.0*xy+17.0*xy-16.0*xy-15.0*xy+14.0*xy";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/3.6363636363636362*xy^80.0-21.0*xy+20.0*xy+19.0*xy-18.0*xy+17.0*xy-16.0*xy-15.0*xy+14.0*xy";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-1738.0*xy^78.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-1738.0*78.0*xy^77.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-135564.0*xy^77.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/3.6363636363636362*xy^80.0-21.0*xy+20.0*xy+19.0*xy-18.0*xy+17.0*xy-16.0*xy-15.0*xy+14.0*xy";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/3.6363636363636362/81.0*xy^81.0-21.0/2.0*xy^2.0+20.0/2.0*xy^2.0+19.0/2.0*xy^2.0-18.0/2.0*xy^2.0+17.0/2.0*xy^2.0-16.0/2.0*xy^2.0-15.0/2.0*xy^2.0+14.0/2.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/294.54545454545456*xy^81.0-10.5*xy^2.0+10.0*xy^2.0+9.5*xy^2.0-9.0*xy^2.0+8.5*xy^2.0-8.0*xy^2.0-7.5*xy^2.0+7.0*xy^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-135564.0*xy^77.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-135564.0*77.0*xy^76.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-1.0438428E7*xy^76.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/294.54545454545456*xy^81.0-10.5*xy^2.0+10.0*xy^2.0+9.5*xy^2.0-9.0*xy^2.0+8.5*xy^2.0-8.0*xy^2.0-7.5*xy^2.0+7.0*xy^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/294.54545454545456/82.0*xy^82.0-10.5/3.0*xy^3.0+10.0/3.0*xy^3.0+9.5/3.0*xy^3.0-9.0/3.0*xy^3.0+8.5/3.0*xy^3.0-8.0/3.0*xy^3.0-7.5/3.0*xy^3.0+7.0/3.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/24152.727272727276*xy^82.0-3.5*xy^3.0+3.3333333333333335*xy^3.0+3.1666666666666665*xy^3.0-3.0*xy^3.0+2.8333333333333335*xy^3.0-2.6666666666666665*xy^3.0-2.5*xy^3.0+2.3333333333333335*xy^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-1.0438428E7*xy^76.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*76.0*xy^75.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-0.0*xy^75.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/24152.727272727276*xy^82.0-3.5*xy^3.0+3.3333333333333335*xy^3.0+3.1666666666666665*xy^3.0-3.0*xy^3.0+2.8333333333333335*xy^3.0-2.6666666666666665*xy^3.0-2.5*xy^3.0+2.3333333333333335*xy^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/24152.727272727276/83.0*xy^83.0-3.5/4.0*xy^4.0+3.3333333333333335/4.0*xy^4.0+3.1666666666666665/4.0*xy^4.0-3.0/4.0*xy^4.0+2.8333333333333335/4.0*xy^4.0-2.6666666666666665/4.0*xy^4.0-2.5/4.0*xy^4.0+2.3333333333333335/4.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/2004676.363636364*xy^83.0-1.0/1.1428571428571428*xy^4.0+1.0/1.2*xy^4.0+1.0/1.2631578947368423*xy^4.0-1.0/1.3333333333333333*xy^4.0+1.0/1.4117647058823528*xy^4.0-1.0/1.5*xy^4.0-1.0/1.6*xy^4.0+1.0/1.7142857142857142*xy^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130480() {
 UsageCalculus.TestCase = 130480;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+21/-xyzxyzxyzxyzxyzxyzxyz^80-20*-xyzxyzxyzxyzxyzxyzxy^-81+19+18/-xyzxyzxyzxyzxyzxyz^83-17*-xyzxyzxyzxyzxyzxy^-84+16*-xyzxyzxyzxyzxyzx^85+15/-xyzxyzxyzxyzxyz^86-14*-xyzxyzxyzxyzxy^-87+13";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-21.0+20.0+19.0-18.0+17.0-16.0-15.0+14.0+13.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0+20.0*0.0+19.0*0.0-18.0*0.0+17.0*0.0-16.0*0.0-15.0*0.0+14.0*0.0+13.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "-21.0+20.0+19.0-18.0+17.0-16.0-15.0+14.0+13.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-21.0*x+20.0*x+19.0*x-18.0*x+17.0*x-16.0*x-15.0*x+14.0*x+13.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "-21.0*x+20.0*x+19.0*x-18.0*x+17.0*x-16.0*x-15.0*x+14.0*x+13.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "-21.0*x+20.0*x+19.0*x-18.0*x+17.0*x-16.0*x-15.0*x+14.0*x+13.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-21.0/2.0*x^2.0+20.0/2.0*x^2.0+19.0/2.0*x^2.0-18.0/2.0*x^2.0+17.0/2.0*x^2.0-16.0/2.0*x^2.0-15.0/2.0*x^2.0+14.0/2.0*x^2.0+13.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-10.5*x^2.0+10.0*x^2.0+9.5*x^2.0-9.0*x^2.0+8.5*x^2.0-8.0*x^2.0-7.5*x^2.0+7.0*x^2.0+6.5*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "-10.5*x^2.0+10.0*x^2.0+9.5*x^2.0-9.0*x^2.0+8.5*x^2.0-8.0*x^2.0-7.5*x^2.0+7.0*x^2.0+6.5*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-10.5/3.0*x^3.0+10.0/3.0*x^3.0+9.5/3.0*x^3.0-9.0/3.0*x^3.0+8.5/3.0*x^3.0-8.0/3.0*x^3.0-7.5/3.0*x^3.0+7.0/3.0*x^3.0+6.5/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-3.5*x^3.0+3.3333333333333335*x^3.0+3.1666666666666665*x^3.0-3.0*x^3.0+2.8333333333333335*x^3.0-2.6666666666666665*x^3.0-2.5*x^3.0+2.3333333333333335*x^3.0+2.1666666666666665*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "-3.5*x^3.0+3.3333333333333335*x^3.0+3.1666666666666665*x^3.0-3.0*x^3.0+2.8333333333333335*x^3.0-2.6666666666666665*x^3.0-2.5*x^3.0+2.3333333333333335*x^3.0+2.1666666666666665*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-3.5/4.0*x^4.0+3.3333333333333335/4.0*x^4.0+3.1666666666666665/4.0*x^4.0-3.0/4.0*x^4.0+2.8333333333333335/4.0*x^4.0-2.6666666666666665/4.0*x^4.0-2.5/4.0*x^4.0+2.3333333333333335/4.0*x^4.0+2.1666666666666665/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/1.1428571428571428*x^4.0+1.0/1.2*x^4.0+1.0/1.2631578947368423*x^4.0-1.0/1.3333333333333333*x^4.0+1.0/1.4117647058823528*x^4.0-1.0/1.5*x^4.0-1.0/1.6*x^4.0+1.0/1.7142857142857142*x^4.0+1.0/1.8461538461538463*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130481() {
 UsageCalculus.TestCase = 130481;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-20*-xyzxyzxyzxyzxyzxyzxy^-81+19+18/-xyzxyzxyzxyzxyzxyz^83-17*-xyzxyzxyzxyzxyzxy^-84+16*-xyzxyzxyzxyzxyzx^85+15/-xyzxyzxyzxyzxyz^86-14*-xyzxyzxyzxyzxy^-87+13+12/-xyzxyzxyzxyz^89";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyzx";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "20.0+19.0-18.0+17.0-16.0-15.0+14.0+13.0-12.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+19.0*0.0-18.0*0.0+17.0*0.0-16.0*0.0-15.0*0.0+14.0*0.0+13.0*0.0-12.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "20.0+19.0-18.0+17.0-16.0-15.0+14.0+13.0-12.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "20.0*xyzx+19.0*xyzx-18.0*xyzx+17.0*xyzx-16.0*xyzx-15.0*xyzx+14.0*xyzx+13.0*xyzx-12.0*xyzx";
 UsageCalculus.EqnSolArrayMap4[1] = "20.0*xyzx+19.0*xyzx-18.0*xyzx+17.0*xyzx-16.0*xyzx-15.0*xyzx+14.0*xyzx+13.0*xyzx-12.0*xyzx";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "20.0*xyzx+19.0*xyzx-18.0*xyzx+17.0*xyzx-16.0*xyzx-15.0*xyzx+14.0*xyzx+13.0*xyzx-12.0*xyzx";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "20.0/2.0*xyzx^2.0+19.0/2.0*xyzx^2.0-18.0/2.0*xyzx^2.0+17.0/2.0*xyzx^2.0-16.0/2.0*xyzx^2.0-15.0/2.0*xyzx^2.0+14.0/2.0*xyzx^2.0+13.0/2.0*xyzx^2.0-12.0/2.0*xyzx^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "10.0*xyzx^2.0+9.5*xyzx^2.0-9.0*xyzx^2.0+8.5*xyzx^2.0-8.0*xyzx^2.0-7.5*xyzx^2.0+7.0*xyzx^2.0+6.5*xyzx^2.0-6.0*xyzx^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "10.0*xyzx^2.0+9.5*xyzx^2.0-9.0*xyzx^2.0+8.5*xyzx^2.0-8.0*xyzx^2.0-7.5*xyzx^2.0+7.0*xyzx^2.0+6.5*xyzx^2.0-6.0*xyzx^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "10.0/3.0*xyzx^3.0+9.5/3.0*xyzx^3.0-9.0/3.0*xyzx^3.0+8.5/3.0*xyzx^3.0-8.0/3.0*xyzx^3.0-7.5/3.0*xyzx^3.0+7.0/3.0*xyzx^3.0+6.5/3.0*xyzx^3.0-6.0/3.0*xyzx^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "3.3333333333333335*xyzx^3.0+3.1666666666666665*xyzx^3.0-3.0*xyzx^3.0+2.8333333333333335*xyzx^3.0-2.6666666666666665*xyzx^3.0-2.5*xyzx^3.0+2.3333333333333335*xyzx^3.0+2.1666666666666665*xyzx^3.0-2.0*xyzx^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "3.3333333333333335*xyzx^3.0+3.1666666666666665*xyzx^3.0-3.0*xyzx^3.0+2.8333333333333335*xyzx^3.0-2.6666666666666665*xyzx^3.0-2.5*xyzx^3.0+2.3333333333333335*xyzx^3.0+2.1666666666666665*xyzx^3.0-2.0*xyzx^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "3.3333333333333335/4.0*xyzx^4.0+3.1666666666666665/4.0*xyzx^4.0-3.0/4.0*xyzx^4.0+2.8333333333333335/4.0*xyzx^4.0-2.6666666666666665/4.0*xyzx^4.0-2.5/4.0*xyzx^4.0+2.3333333333333335/4.0*xyzx^4.0+2.1666666666666665/4.0*xyzx^4.0-2.0/4.0*xyzx^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/1.2*xyzx^4.0+1.0/1.2631578947368423*xyzx^4.0-1.0/1.3333333333333333*xyzx^4.0+1.0/1.4117647058823528*xyzx^4.0-1.0/1.5*xyzx^4.0-1.0/1.6*xyzx^4.0+1.0/1.7142857142857142*xyzx^4.0+1.0/1.8461538461538463*xyzx^4.0-1.0/2.0*xyzx^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130482() {
 UsageCalculus.TestCase = 130482;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+19+18/-xyzxyzxyzxyzxyzxyz^83-17*-xyzxyzxyzxyzxyzxy^-84+16*-xyzxyzxyzxyzxyzx^85+15/-xyzxyzxyzxyzxyz^86-14*-xyzxyzxyzxyzxy^-87+13+12/-xyzxyzxyzxyz^89-11*-xyzxyzxyzxy^-90";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "19.0-18.0+17.0-16.0-15.0+14.0+13.0-12.0+11.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0-18.0*0.0+17.0*0.0-16.0*0.0-15.0*0.0+14.0*0.0+13.0*0.0-12.0*0.0+11.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "19.0-18.0+17.0-16.0-15.0+14.0+13.0-12.0+11.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "19.0*x-18.0*x+17.0*x-16.0*x-15.0*x+14.0*x+13.0*x-12.0*x+11.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "19.0*x-18.0*x+17.0*x-16.0*x-15.0*x+14.0*x+13.0*x-12.0*x+11.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "19.0*x-18.0*x+17.0*x-16.0*x-15.0*x+14.0*x+13.0*x-12.0*x+11.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "19.0/2.0*x^2.0-18.0/2.0*x^2.0+17.0/2.0*x^2.0-16.0/2.0*x^2.0-15.0/2.0*x^2.0+14.0/2.0*x^2.0+13.0/2.0*x^2.0-12.0/2.0*x^2.0+11.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "9.5*x^2.0-9.0*x^2.0+8.5*x^2.0-8.0*x^2.0-7.5*x^2.0+7.0*x^2.0+6.5*x^2.0-6.0*x^2.0+5.5*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "9.5*x^2.0-9.0*x^2.0+8.5*x^2.0-8.0*x^2.0-7.5*x^2.0+7.0*x^2.0+6.5*x^2.0-6.0*x^2.0+5.5*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "9.5/3.0*x^3.0-9.0/3.0*x^3.0+8.5/3.0*x^3.0-8.0/3.0*x^3.0-7.5/3.0*x^3.0+7.0/3.0*x^3.0+6.5/3.0*x^3.0-6.0/3.0*x^3.0+5.5/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "3.1666666666666665*x^3.0-3.0*x^3.0+2.8333333333333335*x^3.0-2.6666666666666665*x^3.0-2.5*x^3.0+2.3333333333333335*x^3.0+2.1666666666666665*x^3.0-2.0*x^3.0+1.8333333333333333*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "3.1666666666666665*x^3.0-3.0*x^3.0+2.8333333333333335*x^3.0-2.6666666666666665*x^3.0-2.5*x^3.0+2.3333333333333335*x^3.0+2.1666666666666665*x^3.0-2.0*x^3.0+1.8333333333333333*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "3.1666666666666665/4.0*x^4.0-3.0/4.0*x^4.0+2.8333333333333335/4.0*x^4.0-2.6666666666666665/4.0*x^4.0-2.5/4.0*x^4.0+2.3333333333333335/4.0*x^4.0+2.1666666666666665/4.0*x^4.0-2.0/4.0*x^4.0+1.8333333333333333/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/1.2631578947368423*x^4.0-1.0/1.3333333333333333*x^4.0+1.0/1.4117647058823528*x^4.0-1.0/1.5*x^4.0-1.0/1.6*x^4.0+1.0/1.7142857142857142*x^4.0+1.0/1.8461538461538463*x^4.0-1.0/2.0*x^4.0+1.0/2.181818181818182*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130483() {
 UsageCalculus.TestCase = 130483;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+18/-xyzxyzxyzxyzxyzxyz^83-17*-xyzxyzxyzxyzxyzxy^-84+16*-xyzxyzxyzxyzxyzx^85+15/-xyzxyzxyzxyzxyz^86-14*-xyzxyzxyzxyzxy^-87+13+12/-xyzxyzxyzxyz^89-11*-xyzxyzxyzxy^-90+10*-xyzxyzxyzx^91";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-18.0+17.0-16.0-15.0+14.0+13.0-12.0+11.0-10.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0+17.0*0.0-16.0*0.0-15.0*0.0+14.0*0.0+13.0*0.0-12.0*0.0+11.0*0.0-10.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "-18.0+17.0-16.0-15.0+14.0+13.0-12.0+11.0-10.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-18.0*xy+17.0*xy-16.0*xy-15.0*xy+14.0*xy+13.0*xy-12.0*xy+11.0*xy-10.0*xy";
 UsageCalculus.EqnSolArrayMap4[1] = "-18.0*xy+17.0*xy-16.0*xy-15.0*xy+14.0*xy+13.0*xy-12.0*xy+11.0*xy-10.0*xy";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "-18.0*xy+17.0*xy-16.0*xy-15.0*xy+14.0*xy+13.0*xy-12.0*xy+11.0*xy-10.0*xy";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-18.0/2.0*xy^2.0+17.0/2.0*xy^2.0-16.0/2.0*xy^2.0-15.0/2.0*xy^2.0+14.0/2.0*xy^2.0+13.0/2.0*xy^2.0-12.0/2.0*xy^2.0+11.0/2.0*xy^2.0-10.0/2.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-9.0*xy^2.0+8.5*xy^2.0-8.0*xy^2.0-7.5*xy^2.0+7.0*xy^2.0+6.5*xy^2.0-6.0*xy^2.0+5.5*xy^2.0-5.0*xy^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "-9.0*xy^2.0+8.5*xy^2.0-8.0*xy^2.0-7.5*xy^2.0+7.0*xy^2.0+6.5*xy^2.0-6.0*xy^2.0+5.5*xy^2.0-5.0*xy^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-9.0/3.0*xy^3.0+8.5/3.0*xy^3.0-8.0/3.0*xy^3.0-7.5/3.0*xy^3.0+7.0/3.0*xy^3.0+6.5/3.0*xy^3.0-6.0/3.0*xy^3.0+5.5/3.0*xy^3.0-5.0/3.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-3.0*xy^3.0+2.8333333333333335*xy^3.0-2.6666666666666665*xy^3.0-2.5*xy^3.0+2.3333333333333335*xy^3.0+2.1666666666666665*xy^3.0-2.0*xy^3.0+1.8333333333333333*xy^3.0-1.6666666666666667*xy^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "-3.0*xy^3.0+2.8333333333333335*xy^3.0-2.6666666666666665*xy^3.0-2.5*xy^3.0+2.3333333333333335*xy^3.0+2.1666666666666665*xy^3.0-2.0*xy^3.0+1.8333333333333333*xy^3.0-1.6666666666666667*xy^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-3.0/4.0*xy^4.0+2.8333333333333335/4.0*xy^4.0-2.6666666666666665/4.0*xy^4.0-2.5/4.0*xy^4.0+2.3333333333333335/4.0*xy^4.0+2.1666666666666665/4.0*xy^4.0-2.0/4.0*xy^4.0+1.8333333333333333/4.0*xy^4.0-1.6666666666666667/4.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/1.3333333333333333*xy^4.0+1.0/1.4117647058823528*xy^4.0-1.0/1.5*xy^4.0-1.0/1.6*xy^4.0+1.0/1.7142857142857142*xy^4.0+1.0/1.8461538461538463*xy^4.0-1.0/2.0*xy^4.0+1.0/2.181818181818182*xy^4.0-1.0/2.4*xy^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130484() {
 UsageCalculus.TestCase = 130484;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-17*-xyzxyzxyzxyzxyzxy^-84+16*-xyzxyzxyzxyzxyzx^85+15/-xyzxyzxyzxyzxyz^86-14*-xyzxyzxyzxyzxy^-87+13+12/-xyzxyzxyzxyz^89-11*-xyzxyzxyzxy^-90+10*-xyzxyzxyzx^91+9/-xyzxyzxyz^92";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "17.0-16.0-15.0+14.0+13.0-12.0+11.0-10.0-9.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0-16.0*0.0-15.0*0.0+14.0*0.0+13.0*0.0-12.0*0.0+11.0*0.0-10.0*0.0-9.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "17.0-16.0-15.0+14.0+13.0-12.0+11.0-10.0-9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "17.0*x-16.0*x-15.0*x+14.0*x+13.0*x-12.0*x+11.0*x-10.0*x-9.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "17.0*x-16.0*x-15.0*x+14.0*x+13.0*x-12.0*x+11.0*x-10.0*x-9.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "17.0*x-16.0*x-15.0*x+14.0*x+13.0*x-12.0*x+11.0*x-10.0*x-9.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "17.0/2.0*x^2.0-16.0/2.0*x^2.0-15.0/2.0*x^2.0+14.0/2.0*x^2.0+13.0/2.0*x^2.0-12.0/2.0*x^2.0+11.0/2.0*x^2.0-10.0/2.0*x^2.0-9.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "8.5*x^2.0-8.0*x^2.0-7.5*x^2.0+7.0*x^2.0+6.5*x^2.0-6.0*x^2.0+5.5*x^2.0-5.0*x^2.0-4.5*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "8.5*x^2.0-8.0*x^2.0-7.5*x^2.0+7.0*x^2.0+6.5*x^2.0-6.0*x^2.0+5.5*x^2.0-5.0*x^2.0-4.5*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "8.5/3.0*x^3.0-8.0/3.0*x^3.0-7.5/3.0*x^3.0+7.0/3.0*x^3.0+6.5/3.0*x^3.0-6.0/3.0*x^3.0+5.5/3.0*x^3.0-5.0/3.0*x^3.0-4.5/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "2.8333333333333335*x^3.0-2.6666666666666665*x^3.0-2.5*x^3.0+2.3333333333333335*x^3.0+2.1666666666666665*x^3.0-2.0*x^3.0+1.8333333333333333*x^3.0-1.6666666666666667*x^3.0-1.5*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "2.8333333333333335*x^3.0-2.6666666666666665*x^3.0-2.5*x^3.0+2.3333333333333335*x^3.0+2.1666666666666665*x^3.0-2.0*x^3.0+1.8333333333333333*x^3.0-1.6666666666666667*x^3.0-1.5*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "2.8333333333333335/4.0*x^4.0-2.6666666666666665/4.0*x^4.0-2.5/4.0*x^4.0+2.3333333333333335/4.0*x^4.0+2.1666666666666665/4.0*x^4.0-2.0/4.0*x^4.0+1.8333333333333333/4.0*x^4.0-1.6666666666666667/4.0*x^4.0-1.5/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/1.4117647058823528*x^4.0-1.0/1.5*x^4.0-1.0/1.6*x^4.0+1.0/1.7142857142857142*x^4.0+1.0/1.8461538461538463*x^4.0-1.0/2.0*x^4.0+1.0/2.181818181818182*x^4.0-1.0/2.4*x^4.0-1.0/2.6666666666666665*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130485() {
 UsageCalculus.TestCase = 130485;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+16*-xyzxyzxyzxyzxyzx^85+15/-xyzxyzxyzxyzxyz^86-14*-xyzxyzxyzxyzxy^-87+13+12/-xyzxyzxyzxyz^89-11*-xyzxyzxyzxy^-90+10*-xyzxyzxyzx^91+9/-xyzxyzxyz^92-8*-xyzxyzxy^-93";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyzx";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-16.0-15.0+14.0+13.0-12.0+11.0-10.0-9.0+8.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0-15.0*0.0+14.0*0.0+13.0*0.0-12.0*0.0+11.0*0.0-10.0*0.0-9.0*0.0+8.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "-16.0-15.0+14.0+13.0-12.0+11.0-10.0-9.0+8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-16.0*xyzx-15.0*xyzx+14.0*xyzx+13.0*xyzx-12.0*xyzx+11.0*xyzx-10.0*xyzx-9.0*xyzx+8.0*xyzx";
 UsageCalculus.EqnSolArrayMap4[1] = "-16.0*xyzx-15.0*xyzx+14.0*xyzx+13.0*xyzx-12.0*xyzx+11.0*xyzx-10.0*xyzx-9.0*xyzx+8.0*xyzx";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "-16.0*xyzx-15.0*xyzx+14.0*xyzx+13.0*xyzx-12.0*xyzx+11.0*xyzx-10.0*xyzx-9.0*xyzx+8.0*xyzx";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-16.0/2.0*xyzx^2.0-15.0/2.0*xyzx^2.0+14.0/2.0*xyzx^2.0+13.0/2.0*xyzx^2.0-12.0/2.0*xyzx^2.0+11.0/2.0*xyzx^2.0-10.0/2.0*xyzx^2.0-9.0/2.0*xyzx^2.0+8.0/2.0*xyzx^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-8.0*xyzx^2.0-7.5*xyzx^2.0+7.0*xyzx^2.0+6.5*xyzx^2.0-6.0*xyzx^2.0+5.5*xyzx^2.0-5.0*xyzx^2.0-4.5*xyzx^2.0+4.0*xyzx^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "-8.0*xyzx^2.0-7.5*xyzx^2.0+7.0*xyzx^2.0+6.5*xyzx^2.0-6.0*xyzx^2.0+5.5*xyzx^2.0-5.0*xyzx^2.0-4.5*xyzx^2.0+4.0*xyzx^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-8.0/3.0*xyzx^3.0-7.5/3.0*xyzx^3.0+7.0/3.0*xyzx^3.0+6.5/3.0*xyzx^3.0-6.0/3.0*xyzx^3.0+5.5/3.0*xyzx^3.0-5.0/3.0*xyzx^3.0-4.5/3.0*xyzx^3.0+4.0/3.0*xyzx^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-2.6666666666666665*xyzx^3.0-2.5*xyzx^3.0+2.3333333333333335*xyzx^3.0+2.1666666666666665*xyzx^3.0-2.0*xyzx^3.0+1.8333333333333333*xyzx^3.0-1.6666666666666667*xyzx^3.0-1.5*xyzx^3.0+1.3333333333333333*xyzx^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "-2.6666666666666665*xyzx^3.0-2.5*xyzx^3.0+2.3333333333333335*xyzx^3.0+2.1666666666666665*xyzx^3.0-2.0*xyzx^3.0+1.8333333333333333*xyzx^3.0-1.6666666666666667*xyzx^3.0-1.5*xyzx^3.0+1.3333333333333333*xyzx^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-2.6666666666666665/4.0*xyzx^4.0-2.5/4.0*xyzx^4.0+2.3333333333333335/4.0*xyzx^4.0+2.1666666666666665/4.0*xyzx^4.0-2.0/4.0*xyzx^4.0+1.8333333333333333/4.0*xyzx^4.0-1.6666666666666667/4.0*xyzx^4.0-1.5/4.0*xyzx^4.0+1.3333333333333333/4.0*xyzx^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/1.5*xyzx^4.0-1.0/1.6*xyzx^4.0+1.0/1.7142857142857142*xyzx^4.0+1.0/1.8461538461538463*xyzx^4.0-1.0/2.0*xyzx^4.0+1.0/2.181818181818182*xyzx^4.0-1.0/2.4*xyzx^4.0-1.0/2.6666666666666665*xyzx^4.0+1.0/3.0*xyzx^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130486() {
 UsageCalculus.TestCase = 130486;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+15/-xyzxyzxyzxyzxyz^86-14*-xyzxyzxyzxyzxy^-87+13+12/-xyzxyzxyzxyz^89-11*-xyzxyzxyzxy^-90+10*-xyzxyzxyzx^91+9/-xyzxyzxyz^92-8*-xyzxyzxy^-93+7";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-15.0+14.0+13.0-12.0+11.0-10.0-9.0+8.0+7.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0+14.0*0.0+13.0*0.0-12.0*0.0+11.0*0.0-10.0*0.0-9.0*0.0+8.0*0.0+7.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "-15.0+14.0+13.0-12.0+11.0-10.0-9.0+8.0+7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-15.0*x+14.0*x+13.0*x-12.0*x+11.0*x-10.0*x-9.0*x+8.0*x+7.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "-15.0*x+14.0*x+13.0*x-12.0*x+11.0*x-10.0*x-9.0*x+8.0*x+7.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "-15.0*x+14.0*x+13.0*x-12.0*x+11.0*x-10.0*x-9.0*x+8.0*x+7.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-15.0/2.0*x^2.0+14.0/2.0*x^2.0+13.0/2.0*x^2.0-12.0/2.0*x^2.0+11.0/2.0*x^2.0-10.0/2.0*x^2.0-9.0/2.0*x^2.0+8.0/2.0*x^2.0+7.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-7.5*x^2.0+7.0*x^2.0+6.5*x^2.0-6.0*x^2.0+5.5*x^2.0-5.0*x^2.0-4.5*x^2.0+4.0*x^2.0+3.5*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "-7.5*x^2.0+7.0*x^2.0+6.5*x^2.0-6.0*x^2.0+5.5*x^2.0-5.0*x^2.0-4.5*x^2.0+4.0*x^2.0+3.5*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-7.5/3.0*x^3.0+7.0/3.0*x^3.0+6.5/3.0*x^3.0-6.0/3.0*x^3.0+5.5/3.0*x^3.0-5.0/3.0*x^3.0-4.5/3.0*x^3.0+4.0/3.0*x^3.0+3.5/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-2.5*x^3.0+2.3333333333333335*x^3.0+2.1666666666666665*x^3.0-2.0*x^3.0+1.8333333333333333*x^3.0-1.6666666666666667*x^3.0-1.5*x^3.0+1.3333333333333333*x^3.0+1.1666666666666667*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "-2.5*x^3.0+2.3333333333333335*x^3.0+2.1666666666666665*x^3.0-2.0*x^3.0+1.8333333333333333*x^3.0-1.6666666666666667*x^3.0-1.5*x^3.0+1.3333333333333333*x^3.0+1.1666666666666667*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-2.5/4.0*x^4.0+2.3333333333333335/4.0*x^4.0+2.1666666666666665/4.0*x^4.0-2.0/4.0*x^4.0+1.8333333333333333/4.0*x^4.0-1.6666666666666667/4.0*x^4.0-1.5/4.0*x^4.0+1.3333333333333333/4.0*x^4.0+1.1666666666666667/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/1.6*x^4.0+1.0/1.7142857142857142*x^4.0+1.0/1.8461538461538463*x^4.0-1.0/2.0*x^4.0+1.0/2.181818181818182*x^4.0-1.0/2.4*x^4.0-1.0/2.6666666666666665*x^4.0+1.0/3.0*x^4.0+1.0/3.4285714285714284*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130487() {
 UsageCalculus.TestCase = 130487;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-14*-xyzxyzxyzxyzxy^-87+13+12/-xyzxyzxyzxyz^89-11*-xyzxyzxyzxy^-90+10*-xyzxyzxyzx^91+9/-xyzxyzxyz^92-8*-xyzxyzxy^-93+7+6/-xyzxyz^95";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "14.0+13.0-12.0+11.0-10.0-9.0+8.0+7.0-6.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+13.0*0.0-12.0*0.0+11.0*0.0-10.0*0.0-9.0*0.0+8.0*0.0+7.0*0.0-6.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "14.0+13.0-12.0+11.0-10.0-9.0+8.0+7.0-6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "14.0*xy+13.0*xy-12.0*xy+11.0*xy-10.0*xy-9.0*xy+8.0*xy+7.0*xy-6.0*xy";
 UsageCalculus.EqnSolArrayMap4[1] = "14.0*xy+13.0*xy-12.0*xy+11.0*xy-10.0*xy-9.0*xy+8.0*xy+7.0*xy-6.0*xy";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "14.0*xy+13.0*xy-12.0*xy+11.0*xy-10.0*xy-9.0*xy+8.0*xy+7.0*xy-6.0*xy";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "14.0/2.0*xy^2.0+13.0/2.0*xy^2.0-12.0/2.0*xy^2.0+11.0/2.0*xy^2.0-10.0/2.0*xy^2.0-9.0/2.0*xy^2.0+8.0/2.0*xy^2.0+7.0/2.0*xy^2.0-6.0/2.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "7.0*xy^2.0+6.5*xy^2.0-6.0*xy^2.0+5.5*xy^2.0-5.0*xy^2.0-4.5*xy^2.0+4.0*xy^2.0+3.5*xy^2.0-3.0*xy^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "7.0*xy^2.0+6.5*xy^2.0-6.0*xy^2.0+5.5*xy^2.0-5.0*xy^2.0-4.5*xy^2.0+4.0*xy^2.0+3.5*xy^2.0-3.0*xy^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "7.0/3.0*xy^3.0+6.5/3.0*xy^3.0-6.0/3.0*xy^3.0+5.5/3.0*xy^3.0-5.0/3.0*xy^3.0-4.5/3.0*xy^3.0+4.0/3.0*xy^3.0+3.5/3.0*xy^3.0-3.0/3.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "2.3333333333333335*xy^3.0+2.1666666666666665*xy^3.0-2.0*xy^3.0+1.8333333333333333*xy^3.0-1.6666666666666667*xy^3.0-1.5*xy^3.0+1.3333333333333333*xy^3.0+1.1666666666666667*xy^3.0-xy^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "2.3333333333333335*xy^3.0+2.1666666666666665*xy^3.0-2.0*xy^3.0+1.8333333333333333*xy^3.0-1.6666666666666667*xy^3.0-1.5*xy^3.0+1.3333333333333333*xy^3.0+1.1666666666666667*xy^3.0-xy^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "2.3333333333333335/4.0*xy^4.0+2.1666666666666665/4.0*xy^4.0-2.0/4.0*xy^4.0+1.8333333333333333/4.0*xy^4.0-1.6666666666666667/4.0*xy^4.0-1.5/4.0*xy^4.0+1.3333333333333333/4.0*xy^4.0+1.1666666666666667/4.0*xy^4.0-1.0/4.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/1.7142857142857142*xy^4.0+1.0/1.8461538461538463*xy^4.0-1.0/2.0*xy^4.0+1.0/2.181818181818182*xy^4.0-1.0/2.4*xy^4.0-1.0/2.6666666666666665*xy^4.0+1.0/3.0*xy^4.0+1.0/3.4285714285714284*xy^4.0-1.0/4.0*xy^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130488() {
 UsageCalculus.TestCase = 130488;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+13+12/-xyzxyzxyzxyz^89-11*-xyzxyzxyzxy^-90+10*-xyzxyzxyzx^91+9/-xyzxyzxyz^92-8*-xyzxyzxy^-93+7+6/-xyzxyz^95-5*-xyzxy^-96";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "13.0-12.0+11.0-10.0-9.0+8.0+7.0-6.0+5.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0-12.0*0.0+11.0*0.0-10.0*0.0-9.0*0.0+8.0*0.0+7.0*0.0-6.0*0.0+5.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "13.0-12.0+11.0-10.0-9.0+8.0+7.0-6.0+5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "13.0*x-12.0*x+11.0*x-10.0*x-9.0*x+8.0*x+7.0*x-6.0*x+5.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "13.0*x-12.0*x+11.0*x-10.0*x-9.0*x+8.0*x+7.0*x-6.0*x+5.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "13.0*x-12.0*x+11.0*x-10.0*x-9.0*x+8.0*x+7.0*x-6.0*x+5.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "13.0/2.0*x^2.0-12.0/2.0*x^2.0+11.0/2.0*x^2.0-10.0/2.0*x^2.0-9.0/2.0*x^2.0+8.0/2.0*x^2.0+7.0/2.0*x^2.0-6.0/2.0*x^2.0+5.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "6.5*x^2.0-6.0*x^2.0+5.5*x^2.0-5.0*x^2.0-4.5*x^2.0+4.0*x^2.0+3.5*x^2.0-3.0*x^2.0+2.5*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "6.5*x^2.0-6.0*x^2.0+5.5*x^2.0-5.0*x^2.0-4.5*x^2.0+4.0*x^2.0+3.5*x^2.0-3.0*x^2.0+2.5*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "6.5/3.0*x^3.0-6.0/3.0*x^3.0+5.5/3.0*x^3.0-5.0/3.0*x^3.0-4.5/3.0*x^3.0+4.0/3.0*x^3.0+3.5/3.0*x^3.0-3.0/3.0*x^3.0+2.5/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "2.1666666666666665*x^3.0-2.0*x^3.0+1.8333333333333333*x^3.0-1.6666666666666667*x^3.0-1.5*x^3.0+1.3333333333333333*x^3.0+1.1666666666666667*x^3.0-x^3.0+1.0/1.2*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "2.1666666666666665*x^3.0-2.0*x^3.0+1.8333333333333333*x^3.0-1.6666666666666667*x^3.0-1.5*x^3.0+1.3333333333333333*x^3.0+1.1666666666666667*x^3.0-x^3.0+1.0/1.2*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "2.1666666666666665/4.0*x^4.0-2.0/4.0*x^4.0+1.8333333333333333/4.0*x^4.0-1.6666666666666667/4.0*x^4.0-1.5/4.0*x^4.0+1.3333333333333333/4.0*x^4.0+1.1666666666666667/4.0*x^4.0-1.0/4.0*x^4.0+1.0/1.2/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/1.8461538461538463*x^4.0-1.0/2.0*x^4.0+1.0/2.181818181818182*x^4.0-1.0/2.4*x^4.0-1.0/2.6666666666666665*x^4.0+1.0/3.0*x^4.0+1.0/3.4285714285714284*x^4.0-1.0/4.0*x^4.0+1.0/4.8*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130489() {
 UsageCalculus.TestCase = 130489;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+12/-xyzxyzxyzxyz^89-11*-xyzxyzxyzxy^-90+10*-xyzxyzxyzx^91+9/-xyzxyzxyz^92-8*-xyzxyzxy^-93+7+6/-xyzxyz^95-5*-xyzxy^-96+4*-xyzx^97";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyzx";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-12.0+11.0-10.0-9.0+8.0+7.0-6.0+5.0-4.0*xyzx^97.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0+11.0*0.0-10.0*0.0-9.0*0.0+8.0*0.0+7.0*0.0-6.0*0.0+5.0*0.0-4.0*97.0*xyzx^96.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-388.0*xyzx^96.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-12.0+11.0-10.0-9.0+8.0+7.0-6.0+5.0-4.0*xyzx^97.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-12.0*xyzx+11.0*xyzx-10.0*xyzx-9.0*xyzx+8.0*xyzx+7.0*xyzx-6.0*xyzx+5.0*xyzx-4.0/98.0*xyzx^98.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-12.0*xyzx+11.0*xyzx-10.0*xyzx-9.0*xyzx+8.0*xyzx+7.0*xyzx-6.0*xyzx+5.0*xyzx-1.0/24.5*xyzx^98.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-388.0*xyzx^96.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-388.0*96.0*xyzx^95.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-37248.0*xyzx^95.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-12.0*xyzx+11.0*xyzx-10.0*xyzx-9.0*xyzx+8.0*xyzx+7.0*xyzx-6.0*xyzx+5.0*xyzx-1.0/24.5*xyzx^98.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-12.0/2.0*xyzx^2.0+11.0/2.0*xyzx^2.0-10.0/2.0*xyzx^2.0-9.0/2.0*xyzx^2.0+8.0/2.0*xyzx^2.0+7.0/2.0*xyzx^2.0-6.0/2.0*xyzx^2.0+5.0/2.0*xyzx^2.0-1.0/24.5/99.0*xyzx^99.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-6.0*xyzx^2.0+5.5*xyzx^2.0-5.0*xyzx^2.0-4.5*xyzx^2.0+4.0*xyzx^2.0+3.5*xyzx^2.0-3.0*xyzx^2.0+2.5*xyzx^2.0-1.0/2425.5*xyzx^99.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-37248.0*xyzx^95.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-37248.0*95.0*xyzx^94.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-3538560.0*xyzx^94.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-6.0*xyzx^2.0+5.5*xyzx^2.0-5.0*xyzx^2.0-4.5*xyzx^2.0+4.0*xyzx^2.0+3.5*xyzx^2.0-3.0*xyzx^2.0+2.5*xyzx^2.0-1.0/2425.5*xyzx^99.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-6.0/3.0*xyzx^3.0+5.5/3.0*xyzx^3.0-5.0/3.0*xyzx^3.0-4.5/3.0*xyzx^3.0+4.0/3.0*xyzx^3.0+3.5/3.0*xyzx^3.0-3.0/3.0*xyzx^3.0+2.5/3.0*xyzx^3.0-1.0/2425.5/100.0*xyzx^100.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-2.0*xyzx^3.0+1.8333333333333333*xyzx^3.0-1.6666666666666667*xyzx^3.0-1.5*xyzx^3.0+1.3333333333333333*xyzx^3.0+1.1666666666666667*xyzx^3.0-xyzx^3.0+1.0/1.2*xyzx^3.0-1.0/242550.0*xyzx^100.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-3538560.0*xyzx^94.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-3538560.0*94.0*xyzx^93.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-3.3262464E8*xyzx^93.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-2.0*xyzx^3.0+1.8333333333333333*xyzx^3.0-1.6666666666666667*xyzx^3.0-1.5*xyzx^3.0+1.3333333333333333*xyzx^3.0+1.1666666666666667*xyzx^3.0-xyzx^3.0+1.0/1.2*xyzx^3.0-1.0/242550.0*xyzx^100.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-2.0/4.0*xyzx^4.0+1.8333333333333333/4.0*xyzx^4.0-1.6666666666666667/4.0*xyzx^4.0-1.5/4.0*xyzx^4.0+1.3333333333333333/4.0*xyzx^4.0+1.1666666666666667/4.0*xyzx^4.0-1.0/4.0*xyzx^4.0+1.0/1.2/4.0*xyzx^4.0-1.0/242550.0/101.0*xyzx^101.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/2.0*xyzx^4.0+1.0/2.181818181818182*xyzx^4.0-1.0/2.4*xyzx^4.0-1.0/2.6666666666666665*xyzx^4.0+1.0/3.0*xyzx^4.0+1.0/3.4285714285714284*xyzx^4.0-1.0/4.0*xyzx^4.0+1.0/4.8*xyzx^4.0-1.0/2.449755E7*xyzx^101.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130490() {
 UsageCalculus.TestCase = 130490;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-11*-xyzxyzxyzxy^-90+10*-xyzxyzxyzx^91+9/-xyzxyzxyz^92-8*-xyzxyzxy^-93+7+6/-xyzxyz^95-5*-xyzxy^-96+4*-xyzx^97+3/-xyz^98";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "11.0-10.0-9.0+8.0+7.0-6.0+5.0-4.0-3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0-10.0*0.0-9.0*0.0+8.0*0.0+7.0*0.0-6.0*0.0+5.0*0.0-4.0*0.0-3.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "11.0-10.0-9.0+8.0+7.0-6.0+5.0-4.0-3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "11.0*x-10.0*x-9.0*x+8.0*x+7.0*x-6.0*x+5.0*x-4.0*x-3.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "11.0*x-10.0*x-9.0*x+8.0*x+7.0*x-6.0*x+5.0*x-4.0*x-3.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "11.0*x-10.0*x-9.0*x+8.0*x+7.0*x-6.0*x+5.0*x-4.0*x-3.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "11.0/2.0*x^2.0-10.0/2.0*x^2.0-9.0/2.0*x^2.0+8.0/2.0*x^2.0+7.0/2.0*x^2.0-6.0/2.0*x^2.0+5.0/2.0*x^2.0-4.0/2.0*x^2.0-3.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "5.5*x^2.0-5.0*x^2.0-4.5*x^2.0+4.0*x^2.0+3.5*x^2.0-3.0*x^2.0+2.5*x^2.0-2.0*x^2.0-1.5*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "5.5*x^2.0-5.0*x^2.0-4.5*x^2.0+4.0*x^2.0+3.5*x^2.0-3.0*x^2.0+2.5*x^2.0-2.0*x^2.0-1.5*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "5.5/3.0*x^3.0-5.0/3.0*x^3.0-4.5/3.0*x^3.0+4.0/3.0*x^3.0+3.5/3.0*x^3.0-3.0/3.0*x^3.0+2.5/3.0*x^3.0-2.0/3.0*x^3.0-1.5/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.8333333333333333*x^3.0-1.6666666666666667*x^3.0-1.5*x^3.0+1.3333333333333333*x^3.0+1.1666666666666667*x^3.0-x^3.0+1.0/1.2*x^3.0-1.0/1.5*x^3.0-1.0/2.0*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "1.8333333333333333*x^3.0-1.6666666666666667*x^3.0-1.5*x^3.0+1.3333333333333333*x^3.0+1.1666666666666667*x^3.0-x^3.0+1.0/1.2*x^3.0-1.0/1.5*x^3.0-1.0/2.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.8333333333333333/4.0*x^4.0-1.6666666666666667/4.0*x^4.0-1.5/4.0*x^4.0+1.3333333333333333/4.0*x^4.0+1.1666666666666667/4.0*x^4.0-1.0/4.0*x^4.0+1.0/1.2/4.0*x^4.0-1.0/1.5/4.0*x^4.0-1.0/2.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/2.181818181818182*x^4.0-1.0/2.4*x^4.0-1.0/2.6666666666666665*x^4.0+1.0/3.0*x^4.0+1.0/3.4285714285714284*x^4.0-1.0/4.0*x^4.0+1.0/4.8*x^4.0-1.0/6.0*x^4.0-1.0/8.0*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130491() {
 UsageCalculus.TestCase = 130491;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+10*-xyzxyzxyzx^91+9/-xyzxyzxyz^92-8*-xyzxyzxy^-93+7+6/-xyzxyz^95-5*-xyzxy^-96+4*-xyzx^97+3/-xyz^98-2*-xy^-99";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-10.0-9.0+8.0+7.0-6.0+5.0-4.0-3.0+2.0/xy^99.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0-9.0*0.0+8.0*0.0+7.0*0.0-6.0*0.0+5.0*0.0-4.0*0.0-3.0*0.0+2.0*-99.0/xy^100.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-198.0/xy^100.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-10.0-9.0+8.0+7.0-6.0+5.0-4.0-3.0+2.0/xy^99.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-10.0*xy-9.0*xy+8.0*xy+7.0*xy-6.0*xy+5.0*xy-4.0*xy-3.0*xy+2.0/-98.0/xy^98.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-10.0*xy-9.0*xy+8.0*xy+7.0*xy-6.0*xy+5.0*xy-4.0*xy-3.0*xy-1.0/49.0/xy^98.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-198.0/xy^100.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-198.0*-100.0/xy^101.0";
 UsageCalculus.EqnSolArrayMap2[2] = "19800.0/xy^101.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-10.0*xy-9.0*xy+8.0*xy+7.0*xy-6.0*xy+5.0*xy-4.0*xy-3.0*xy-1.0/49.0/xy^98.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-10.0/2.0*xy^2.0-9.0/2.0*xy^2.0+8.0/2.0*xy^2.0+7.0/2.0*xy^2.0-6.0/2.0*xy^2.0+5.0/2.0*xy^2.0-4.0/2.0*xy^2.0-3.0/2.0*xy^2.0-1.0/49.0/-97.0/xy^97.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-5.0*xy^2.0-4.5*xy^2.0+4.0*xy^2.0+3.5*xy^2.0-3.0*xy^2.0+2.5*xy^2.0-2.0*xy^2.0-1.5*xy^2.0+1.0/4753.0/xy^97.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "19800.0/xy^101.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "19800.0*-101.0/xy^102.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-1999800.0/xy^102.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-5.0*xy^2.0-4.5*xy^2.0+4.0*xy^2.0+3.5*xy^2.0-3.0*xy^2.0+2.5*xy^2.0-2.0*xy^2.0-1.5*xy^2.0+1.0/4753.0/xy^97.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-5.0/3.0*xy^3.0-4.5/3.0*xy^3.0+4.0/3.0*xy^3.0+3.5/3.0*xy^3.0-3.0/3.0*xy^3.0+2.5/3.0*xy^3.0-2.0/3.0*xy^3.0-1.5/3.0*xy^3.0+1.0/4753.0/-96.0/xy^96.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.6666666666666667*xy^3.0-1.5*xy^3.0+1.3333333333333333*xy^3.0+1.1666666666666667*xy^3.0-xy^3.0+1.0/1.2*xy^3.0-1.0/1.5*xy^3.0-1.0/2.0*xy^3.0-1.0/456288.0/xy^96.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-1999800.0/xy^102.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-1999800.0*-102.0/xy^103.0";
 UsageCalculus.EqnSolArrayMap2[4] = "2.039796E8/xy^103.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.6666666666666667*xy^3.0-1.5*xy^3.0+1.3333333333333333*xy^3.0+1.1666666666666667*xy^3.0-xy^3.0+1.0/1.2*xy^3.0-1.0/1.5*xy^3.0-1.0/2.0*xy^3.0-1.0/456288.0/xy^96.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.6666666666666667/4.0*xy^4.0-1.5/4.0*xy^4.0+1.3333333333333333/4.0*xy^4.0+1.1666666666666667/4.0*xy^4.0-1.0/4.0*xy^4.0+1.0/1.2/4.0*xy^4.0-1.0/1.5/4.0*xy^4.0-1.0/2.0/4.0*xy^4.0-1.0/456288.0/-95.0/xy^95.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/2.4*xy^4.0-1.0/2.6666666666666665*xy^4.0+1.0/3.0*xy^4.0+1.0/3.4285714285714284*xy^4.0-1.0/4.0*xy^4.0+1.0/4.8*xy^4.0-1.0/6.0*xy^4.0-1.0/8.0*xy^4.0+1.0/4.334736E7/xy^95.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130492() {
 UsageCalculus.TestCase = 130492;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+9/-xyzxyzxyz^92-8*-xyzxyzxy^-93+7+6/-xyzxyz^95-5*-xyzxy^-96+4*-xyzx^97+3/-xyz^98-2*-xy^-99+1*-x^100";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-9.0+8.0+7.0-6.0+5.0-4.0-3.0+2.0-x^100.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0+8.0*0.0+7.0*0.0-6.0*0.0+5.0*0.0-4.0*0.0-3.0*0.0+2.0*0.0-100.0*x^99.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-100.0*x^99.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-9.0+8.0+7.0-6.0+5.0-4.0-3.0+2.0-x^100.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-9.0*x+8.0*x+7.0*x-6.0*x+5.0*x-4.0*x-3.0*x+2.0*x-1.0/101.0*x^101.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-9.0*x+8.0*x+7.0*x-6.0*x+5.0*x-4.0*x-3.0*x+2.0*x-1.0/101.0*x^101.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-100.0*x^99.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-100.0*99.0*x^98.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-9900.0*x^98.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-9.0*x+8.0*x+7.0*x-6.0*x+5.0*x-4.0*x-3.0*x+2.0*x-1.0/101.0*x^101.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-9.0/2.0*x^2.0+8.0/2.0*x^2.0+7.0/2.0*x^2.0-6.0/2.0*x^2.0+5.0/2.0*x^2.0-4.0/2.0*x^2.0-3.0/2.0*x^2.0+x^2.0-1.0/101.0/102.0*x^102.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-4.5*x^2.0+4.0*x^2.0+3.5*x^2.0-3.0*x^2.0+2.5*x^2.0-2.0*x^2.0-1.5*x^2.0+x^2.0-1.0/10302.0*x^102.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-9900.0*x^98.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-9900.0*98.0*x^97.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-970200.0*x^97.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-4.5*x^2.0+4.0*x^2.0+3.5*x^2.0-3.0*x^2.0+2.5*x^2.0-2.0*x^2.0-1.5*x^2.0+x^2.0-1.0/10302.0*x^102.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-4.5/3.0*x^3.0+4.0/3.0*x^3.0+3.5/3.0*x^3.0-3.0/3.0*x^3.0+2.5/3.0*x^3.0-2.0/3.0*x^3.0-1.5/3.0*x^3.0+1.0/3.0*x^3.0-1.0/10302.0/103.0*x^103.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.5*x^3.0+1.3333333333333333*x^3.0+1.1666666666666667*x^3.0-x^3.0+1.0/1.2*x^3.0-1.0/1.5*x^3.0-1.0/2.0*x^3.0+1.0/3.0*x^3.0-1.0/1061106.0*x^103.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-970200.0*x^97.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-970200.0*97.0*x^96.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-9.41094E7*x^96.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.5*x^3.0+1.3333333333333333*x^3.0+1.1666666666666667*x^3.0-x^3.0+1.0/1.2*x^3.0-1.0/1.5*x^3.0-1.0/2.0*x^3.0+1.0/3.0*x^3.0-1.0/1061106.0*x^103.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.5/4.0*x^4.0+1.3333333333333333/4.0*x^4.0+1.1666666666666667/4.0*x^4.0-1.0/4.0*x^4.0+1.0/1.2/4.0*x^4.0-1.0/1.5/4.0*x^4.0-1.0/2.0/4.0*x^4.0+1.0/3.0/4.0*x^4.0-1.0/1061106.0/104.0*x^104.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/2.6666666666666665*x^4.0+1.0/3.0*x^4.0+1.0/3.4285714285714284*x^4.0-1.0/4.0*x^4.0+1.0/4.8*x^4.0-1.0/6.0*x^4.0-1.0/8.0*x^4.0+1.0/12.0*x^4.0-1.0/1.10355024E8*x^104.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130493() {
 UsageCalculus.TestCase = 130493;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-8*-xyzxyzxy^-93+7+6/-xyzxyz^95-5*-xyzxy^-96+4*-xyzx^97+3/-xyz^98-2*-xy^-99+1*-xyzx^100+100/-xyzx^1";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyzx";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "8.0+7.0-6.0+5.0-4.0*xyzx^97.0-1.0/xyz^98.0*3.0+xy^-99.0*2.0-xyzx^100.0-100.0*xyzx";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+7.0*0.0-6.0*0.0+5.0*0.0-4.0*97.0*xyzx^96.0-1.0/xyz^98.0*3.0*0.0+xy^-99.0*2.0*0.0-100.0*xyzx^99.0-100.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-388.0*xyzx^96.0-1.0/xyz^98.0*0.0+xy^-99.0*0.0-100.0*xyzx^99.0-100.0";
 UsageCalculus.EqnSolArrayMap3[1] = "8.0+7.0-6.0+5.0-4.0*xyzx^97.0-1.0/xyz^98.0*3.0+xy^-99.0*2.0-xyzx^100.0-100.0*xyzx";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "8.0*xyzx+7.0*xyzx-6.0*xyzx+5.0*xyzx-4.0/98.0*xyzx^98.0-1.0/xyz^98.0*3.0*xyzx+xy^-99.0*2.0*xyzx-1.0/101.0*xyzx^101.0-100.0/2.0*xyzx^2.0";
 UsageCalculus.EqnSolArrayMap4[1] = "8.0*xyzx+7.0*xyzx-6.0*xyzx+5.0*xyzx-1.0/24.5*xyzx^98.0-1.0/xyz^98.0*3.0*xyzx+xy^-99.0*2.0*xyzx-1.0/101.0*xyzx^101.0-50.0*xyzx^2.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-388.0*xyzx^96.0-1.0/xyz^98.01.0/xyz^98.0*0.0+xy^-99.0*0.0-100.0*xyzx^99.0-100.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-388.0*96.0*xyzx^95.0-1.0/xyz^98.01.0/xyz^98.0*0.0*0.0+xy^-99.0*0.0*0.0-100.0*99.0*xyzx^98.0-100.0*0.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-37248.0*xyzx^95.0-1.0/xyz^1.0/xyz^98.0*0.0+xy^-99.0*0.0-9900.0*xyzx^98.0";
 UsageCalculus.EqnSolArrayMap3[2] = "8.0*xyzx+7.0*xyzx-6.0*xyzx+5.0*xyzx-1.0/24.5*xyzx^98.0-1.0/xyz^98.0*3.0*xyzx+xy^-99.0*2.0*xyzx-1.0/101.0*xyzx^101.0-50.0*xyzx^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "8.0/2.0*xyzx^2.0+7.0/2.0*xyzx^2.0-6.0/2.0*xyzx^2.0+5.0/2.0*xyzx^2.0-1.0/24.5/99.0*xyzx^99.0-1.0/xyz^98.0*3.0/2.0*xyzx^2.0+xy^-99.0*xyzx^2.0-1.0/101.0/102.0*xyzx^102.0-50.0/3.0*xyzx^3.0";
 UsageCalculus.EqnSolArrayMap4[2] = "4.0*xyzx^2.0+3.5*xyzx^2.0-3.0*xyzx^2.0+2.5*xyzx^2.0-1.0/2425.5*xyzx^99.0-1.0/xyz^98.0*1.5*xyzx^2.0+xy^-99.0*xyzx^2.0-1.0/10302.0*xyzx^102.0-16.666666666666668*xyzx^3.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-37248.0*xyzx^95.0-1.0/xyz^1.0/xyz^98.01.0/xyz^1.0/xyz^98.0*0.0+xy^-99.0*0.0-9900.0*xyzx^98.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-37248.0*95.0*xyzx^94.0-1.0/xyz^1.0/xyz^98.01.0/xyz^1.0/xyz^98.0*0.0*0.0+xy^-99.0*0.0*0.0-9900.0*98.0*xyzx^97.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-3538560.0*xyzx^94.0-1.0/xyz^1.0/xyz^1.0/xyz^1.0/xyz^98.0*0.0+xy^-99.0*0.0-970200.0*xyzx^97.0";
 UsageCalculus.EqnSolArrayMap3[3] = "4.0*xyzx^2.0+3.5*xyzx^2.0-3.0*xyzx^2.0+2.5*xyzx^2.0-1.0/2425.5*xyzx^99.0-1.0/xyz^98.0*1.5*xyzx^2.0+xy^-99.0*xyzx^2.0-1.0/10302.0*xyzx^102.0-16.666666666666668*xyzx^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "4.0/3.0*xyzx^3.0+3.5/3.0*xyzx^3.0-3.0/3.0*xyzx^3.0+2.5/3.0*xyzx^3.0-1.0/2425.5/100.0*xyzx^100.0-1.0/xyz^98.0*1.5/3.0*xyzx^3.0+xy^-99.0/3.0*xyzx^3.0-1.0/10302.0/103.0*xyzx^103.0-16.666666666666668/4.0*xyzx^4.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.3333333333333333*xyzx^3.0+1.1666666666666667*xyzx^3.0-xyzx^3.0+1.0/1.2*xyzx^3.0-1.0/242550.0*xyzx^100.0-1.0/xyz^98.0*0.5*xyzx^3.0+xy^-99.0/3.0*xyzx^3.0-1.0/1061106.0*xyzx^103.0-4.166666666666667*xyzx^4.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-3538560.0*xyzx^94.0-1.0/xyz^1.0/xyz^1.0/xyz^1.0/xyz^98.01.0/xyz^1.0/xyz^1.0/xyz^1.0/xyz^98.0*0.0+xy^-99.0*0.0-970200.0*xyzx^97.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-3538560.0*94.0*xyzx^93.0-1.0/xyz^1.0/xyz^1.0/xyz^1.0/xyz^98.01.0/xyz^1.0/xyz^1.0/xyz^1.0/xyz^98.0*0.0*0.0+xy^-99.0*0.0*0.0-970200.0*97.0*xyzx^96.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-3.3262464E8*xyzx^93.0-1.0/xyz^1.0/xyz^1.0/xyz^1.0/xyz^1.0/xyz^1.0/xyz^1.0/xyz^1.0/xyz^98.0*0.0+xy^-99.0*0.0-9.41094E7*xyzx^96.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.3333333333333333*xyzx^3.0+1.1666666666666667*xyzx^3.0-xyzx^3.0+1.0/1.2*xyzx^3.0-1.0/242550.0*xyzx^100.0-1.0/xyz^98.0*0.5*xyzx^3.0+xy^-99.0/3.0*xyzx^3.0-1.0/1061106.0*xyzx^103.0-4.166666666666667*xyzx^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.3333333333333333/4.0*xyzx^4.0+1.1666666666666667/4.0*xyzx^4.0-1.0/4.0*xyzx^4.0+1.0/1.2/4.0*xyzx^4.0-1.0/242550.0/101.0*xyzx^101.0-1.0/xyz^98.0*0.5/4.0*xyzx^4.0+xy^-99.0/3.0/4.0*xyzx^4.0-1.0/1061106.0/104.0*xyzx^104.0-4.166666666666667/5.0*xyzx^5.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/3.0*xyzx^4.0+1.0/3.4285714285714284*xyzx^4.0-1.0/4.0*xyzx^4.0+1.0/4.8*xyzx^4.0-1.0/2.449755E7*xyzx^101.0-1.0/xyz^98.0*0.125*xyzx^4.0+xy^-99.0/12.0*xyzx^4.0-1.0/1.10355024E8*xyzx^104.0-1.0/1.2*xyzx^5.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130494() {
 UsageCalculus.TestCase = 130494;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+7+6/-xyzxyz^95-5*-xyzxy^-96+4*-xyzx^97+3/-xyz^98-2*-xy^-99+1*-x^100+100/-x^1-99*-x^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "7.0-6.0+5.0-4.0-3.0+2.0-x^100.0-100.0/x+99.0*x^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0-6.0*0.0+5.0*0.0-4.0*0.0-3.0*0.0+2.0*0.0-100.0*x^99.0+100.0/x^2.0+99.0*2.0*x^1.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-100.0*x^99.0+100.0/x^2.0+198.0*x";
 UsageCalculus.EqnSolArrayMap3[1] = "7.0-6.0+5.0-4.0-3.0+2.0-x^100.0-100.0/x+99.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "7.0*x-6.0*x+5.0*x-4.0*x-3.0*x+2.0*x-1.0/101.0*x^101.0-100.0*ln(x)+99.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[1] = "7.0*x-6.0*x+5.0*x-4.0*x-3.0*x+2.0*x-1.0/101.0*x^101.0-100.0*ln(x)+33.0*x^3.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-100.0*x^99.0+100.0/x^2.0+198.0*x";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-100.0*99.0*x^98.0+100.0*-2.0/x^3.0+198.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-9900.0*x^98.0-200.0/x^3.0+198.0";
 UsageCalculus.EqnSolArrayMap3[2] = "7.0*x-6.0*x+5.0*x-4.0*x-3.0*x+2.0*x-1.0/101.0*x^101.0-100.0*ln(x)+33.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "7.0/2.0*x^2.0-6.0/2.0*x^2.0+5.0/2.0*x^2.0-4.0/2.0*x^2.0-3.0/2.0*x^2.0+x^2.0-1.0/101.0/102.0*x^102.0-100.0*x+33.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[2] = "3.5*x^2.0-3.0*x^2.0+2.5*x^2.0-2.0*x^2.0-1.5*x^2.0+x^2.0-1.0/10302.0*x^102.0-100.0*x+8.25*x^4.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-9900.0*x^98.0-200.0/x^3.0+198.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-9900.0*98.0*x^97.0-200.0*-3.0/x^4.0+198.0*0.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-970200.0*x^97.0+600.0/x^4.0";
 UsageCalculus.EqnSolArrayMap3[3] = "3.5*x^2.0-3.0*x^2.0+2.5*x^2.0-2.0*x^2.0-1.5*x^2.0+x^2.0-1.0/10302.0*x^102.0-100.0*x+8.25*x^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "3.5/3.0*x^3.0-3.0/3.0*x^3.0+2.5/3.0*x^3.0-2.0/3.0*x^3.0-1.5/3.0*x^3.0+1.0/3.0*x^3.0-1.0/10302.0/103.0*x^103.0-100.0/2.0*x^2.0+8.25/5.0*x^5.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.1666666666666667*x^3.0-x^3.0+1.0/1.2*x^3.0-1.0/1.5*x^3.0-1.0/2.0*x^3.0+1.0/3.0*x^3.0-1.0/1061106.0*x^103.0-50.0*x^2.0+1.65*x^5.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-970200.0*x^97.0+600.0/x^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-970200.0*97.0*x^96.0+600.0*-4.0/x^5.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-9.41094E7*x^96.0-2400.0/x^5.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.1666666666666667*x^3.0-x^3.0+1.0/1.2*x^3.0-1.0/1.5*x^3.0-1.0/2.0*x^3.0+1.0/3.0*x^3.0-1.0/1061106.0*x^103.0-50.0*x^2.0+1.65*x^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.1666666666666667/4.0*x^4.0-1.0/4.0*x^4.0+1.0/1.2/4.0*x^4.0-1.0/1.5/4.0*x^4.0-1.0/2.0/4.0*x^4.0+1.0/3.0/4.0*x^4.0-1.0/1061106.0/104.0*x^104.0-50.0/3.0*x^3.0+1.65/6.0*x^6.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/3.4285714285714284*x^4.0-1.0/4.0*x^4.0+1.0/4.8*x^4.0-1.0/6.0*x^4.0-1.0/8.0*x^4.0+1.0/12.0*x^4.0-1.0/1.10355024E8*x^104.0-16.666666666666668*x^3.0+1.0/3.6363636363636367*x^6.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130495() {
 UsageCalculus.TestCase = 130495;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+6/-xyzxyz^95-5*-xyzxy^-96+4*-xyzx^97+3/-xyz^98-2*-xy^-99+1*-xy^100+100/-xy^1-99*-xy^2+98*-xy^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-6.0+5.0-4.0-3.0+2.0/xy^99.0-xy^100.0-100.0/xy+99.0*xy^2.0-98.0*xy^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0+5.0*0.0-4.0*0.0-3.0*0.0+2.0*-99.0/xy^100.0-100.0*xy^99.0+100.0/xy^2.0+99.0*2.0*xy^1.0-98.0*3.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-198.0/xy^100.0-100.0*xy^99.0+100.0/xy^2.0+198.0*xy-294.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-6.0+5.0-4.0-3.0+2.0/xy^99.0-xy^100.0-100.0/xy+99.0*xy^2.0-98.0*xy^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-6.0*xy+5.0*xy-4.0*xy-3.0*xy+2.0/-98.0/xy^98.0-1.0/101.0*xy^101.0-100.0*ln(xy)+99.0/3.0*xy^3.0-98.0/4.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-6.0*xy+5.0*xy-4.0*xy-3.0*xy-1.0/49.0/xy^98.0-1.0/101.0*xy^101.0-100.0*ln(xy)+33.0*xy^3.0-24.5*xy^4.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-198.0/xy^100.0-100.0*xy^99.0+100.0/xy^2.0+198.0*xy-294.0*xy^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-198.0*-100.0/xy^101.0-100.0*99.0*xy^98.0+100.0*-2.0/xy^3.0+198.0-294.0*2.0*xy^1.0";
 UsageCalculus.EqnSolArrayMap2[2] = "19800.0/xy^101.0-9900.0*xy^98.0-200.0/xy^3.0+198.0-588.0*xy";
 UsageCalculus.EqnSolArrayMap3[2] = "-6.0*xy+5.0*xy-4.0*xy-3.0*xy-1.0/49.0/xy^98.0-1.0/101.0*xy^101.0-100.0*ln(xy)+33.0*xy^3.0-24.5*xy^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-6.0/2.0*xy^2.0+5.0/2.0*xy^2.0-4.0/2.0*xy^2.0-3.0/2.0*xy^2.0-1.0/49.0/-97.0/xy^97.0-1.0/101.0/102.0*xy^102.0-100.0*xy+33.0/4.0*xy^4.0-24.5/5.0*xy^5.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-3.0*xy^2.0+2.5*xy^2.0-2.0*xy^2.0-1.5*xy^2.0+1.0/4753.0/xy^97.0-1.0/10302.0*xy^102.0-100.0*xy+8.25*xy^4.0-4.9*xy^5.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "19800.0/xy^101.0-9900.0*xy^98.0-200.0/xy^3.0+198.0-588.0*xy";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "19800.0*-101.0/xy^102.0-9900.0*98.0*xy^97.0-200.0*-3.0/xy^4.0+198.0*0.0-588.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-1999800.0/xy^102.0-970200.0*xy^97.0+600.0/xy^4.0-588.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-3.0*xy^2.0+2.5*xy^2.0-2.0*xy^2.0-1.5*xy^2.0+1.0/4753.0/xy^97.0-1.0/10302.0*xy^102.0-100.0*xy+8.25*xy^4.0-4.9*xy^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-3.0/3.0*xy^3.0+2.5/3.0*xy^3.0-2.0/3.0*xy^3.0-1.5/3.0*xy^3.0+1.0/4753.0/-96.0/xy^96.0-1.0/10302.0/103.0*xy^103.0-100.0/2.0*xy^2.0+8.25/5.0*xy^5.0-4.9/6.0*xy^6.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-xy^3.0+1.0/1.2*xy^3.0-1.0/1.5*xy^3.0-1.0/2.0*xy^3.0-1.0/456288.0/xy^96.0-1.0/1061106.0*xy^103.0-50.0*xy^2.0+1.65*xy^5.0-1.0/1.2244897959183672*xy^6.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-1999800.0/xy^102.0-970200.0*xy^97.0+600.0/xy^4.0-588.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-1999800.0*-102.0/xy^103.0-970200.0*97.0*xy^96.0+600.0*-4.0/xy^5.0-588.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "2.039796E8/xy^103.0-9.41094E7*xy^96.0-2400.0/xy^5.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-xy^3.0+1.0/1.2*xy^3.0-1.0/1.5*xy^3.0-1.0/2.0*xy^3.0-1.0/456288.0/xy^96.0-1.0/1061106.0*xy^103.0-50.0*xy^2.0+1.65*xy^5.0-1.0/1.2244897959183672*xy^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/4.0*xy^4.0+1.0/1.2/4.0*xy^4.0-1.0/1.5/4.0*xy^4.0-1.0/2.0/4.0*xy^4.0-1.0/456288.0/-95.0/xy^95.0-1.0/1061106.0/104.0*xy^104.0-50.0/3.0*xy^3.0+1.65/6.0*xy^6.0-1.0/1.2244897959183672/7.0*xy^7.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/4.0*xy^4.0+1.0/4.8*xy^4.0-1.0/6.0*xy^4.0-1.0/8.0*xy^4.0+1.0/4.334736E7/xy^95.0-1.0/1.10355024E8*xy^104.0-16.666666666666668*xy^3.0+1.0/3.6363636363636367*xy^6.0-1.0/8.57142857142857*xy^7.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130496() {
 UsageCalculus.TestCase = 130496;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-5*-xyzxy^-96+4*-xyzx^97+3/-xyz^98-2*-xy^-99+1*-x^100+100/-x^1-99*-x^2+98*-x^3-97/-x^4";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "5.0-4.0-3.0+2.0-x^100.0-100.0/x+99.0*x^2.0-98.0*x^3.0+97.0/x^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0-4.0*0.0-3.0*0.0+2.0*0.0-100.0*x^99.0+100.0/x^2.0+99.0*2.0*x^1.0-98.0*3.0*x^2.0+97.0*-4.0/x^5.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-100.0*x^99.0+100.0/x^2.0+198.0*x-294.0*x^2.0-388.0/x^5.0";
 UsageCalculus.EqnSolArrayMap3[1] = "5.0-4.0-3.0+2.0-x^100.0-100.0/x+99.0*x^2.0-98.0*x^3.0+97.0/x^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "5.0*x-4.0*x-3.0*x+2.0*x-1.0/101.0*x^101.0-100.0*ln(x)+99.0/3.0*x^3.0-98.0/4.0*x^4.0+97.0/-3.0/x^3.0";
 UsageCalculus.EqnSolArrayMap4[1] = "5.0*x-4.0*x-3.0*x+2.0*x-1.0/101.0*x^101.0-100.0*ln(x)+33.0*x^3.0-24.5*x^4.0-32.333333333333336/x^3.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-100.0*x^99.0+100.0/x^2.0+198.0*x-294.0*x^2.0-388.0/x^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-100.0*99.0*x^98.0+100.0*-2.0/x^3.0+198.0-294.0*2.0*x^1.0-388.0*-5.0/x^6.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-9900.0*x^98.0-200.0/x^3.0+198.0-588.0*x+1940.0/x^6.0";
 UsageCalculus.EqnSolArrayMap3[2] = "5.0*x-4.0*x-3.0*x+2.0*x-1.0/101.0*x^101.0-100.0*ln(x)+33.0*x^3.0-24.5*x^4.0-32.333333333333336/x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "5.0/2.0*x^2.0-4.0/2.0*x^2.0-3.0/2.0*x^2.0+x^2.0-1.0/101.0/102.0*x^102.0-100.0*x+33.0/4.0*x^4.0-24.5/5.0*x^5.0-32.333333333333336/-2.0/x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "2.5*x^2.0-2.0*x^2.0-1.5*x^2.0+x^2.0-1.0/10302.0*x^102.0-100.0*x+8.25*x^4.0-4.9*x^5.0+16.166666666666668/x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-9900.0*x^98.0-200.0/x^3.0+198.0-588.0*x+1940.0/x^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-9900.0*98.0*x^97.0-200.0*-3.0/x^4.0+198.0*0.0-588.0+1940.0*-6.0/x^7.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-970200.0*x^97.0+600.0/x^4.0-588.0-11640.0/x^7.0";
 UsageCalculus.EqnSolArrayMap3[3] = "2.5*x^2.0-2.0*x^2.0-1.5*x^2.0+x^2.0-1.0/10302.0*x^102.0-100.0*x+8.25*x^4.0-4.9*x^5.0+16.166666666666668/x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "2.5/3.0*x^3.0-2.0/3.0*x^3.0-1.5/3.0*x^3.0+1.0/3.0*x^3.0-1.0/10302.0/103.0*x^103.0-100.0/2.0*x^2.0+8.25/5.0*x^5.0-4.9/6.0*x^6.0+16.166666666666668/-1.0/x^1.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/1.2*x^3.0-1.0/1.5*x^3.0-1.0/2.0*x^3.0+1.0/3.0*x^3.0-1.0/1061106.0*x^103.0-50.0*x^2.0+1.65*x^5.0-1.0/1.2244897959183672*x^6.0-16.166666666666668/x";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-970200.0*x^97.0+600.0/x^4.0-588.0-11640.0/x^7.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-970200.0*97.0*x^96.0+600.0*-4.0/x^5.0-588.0*0.0-11640.0*-7.0/x^8.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-9.41094E7*x^96.0-2400.0/x^5.0+81480.0/x^8.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/1.2*x^3.0-1.0/1.5*x^3.0-1.0/2.0*x^3.0+1.0/3.0*x^3.0-1.0/1061106.0*x^103.0-50.0*x^2.0+1.65*x^5.0-1.0/1.2244897959183672*x^6.0-16.166666666666668/x";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/1.2/4.0*x^4.0-1.0/1.5/4.0*x^4.0-1.0/2.0/4.0*x^4.0+1.0/3.0/4.0*x^4.0-1.0/1061106.0/104.0*x^104.0-50.0/3.0*x^3.0+1.65/6.0*x^6.0-1.0/1.2244897959183672/7.0*x^7.0-16.166666666666668*ln(x)";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/4.8*x^4.0-1.0/6.0*x^4.0-1.0/8.0*x^4.0+1.0/12.0*x^4.0-1.0/1.10355024E8*x^104.0-16.666666666666668*x^3.0+1.0/3.6363636363636367*x^6.0-1.0/8.57142857142857*x^7.0-16.166666666666668*ln(x)";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130497() {
 UsageCalculus.TestCase = 130497;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+4*-xyzx^97+3/-xyz^98-2*-xy^-99+1*-xyzx^100+100/-xyzx^1-99*-xyzx^2+98*-xyzx^3-97/-xyzx^4+96*-xyzx^5";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyzx";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-4.0*xyzx^97.0-1.0/xyz^98.0*3.0+xy^-99.0*2.0-xyzx^100.0-100.0/xyzx+99.0*xyzx^2.0-98.0*xyzx^3.0+97.0/xyzx^4.0-96.0*xyzx^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-4.0*97.0*xyzx^96.0-1.0/xyz^98.0*3.0*0.0+xy^-99.0*2.0*0.0-100.0*xyzx^99.0+100.0/xyzx^2.0+99.0*2.0*xyzx^1.0-98.0*3.0*xyzx^2.0+97.0*-4.0/xyzx^5.0-96.0*5.0*xyzx^4.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-388.0*xyzx^96.0-1.0/xyz^98.0*0.0+xy^-99.0*0.0-100.0*xyzx^99.0+100.0/xyzx^2.0+198.0*xyzx-294.0*xyzx^2.0-388.0/xyzx^5.0-480.0*xyzx^4.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-4.0*xyzx^97.0-1.0/xyz^98.0*3.0+xy^-99.0*2.0-xyzx^100.0-100.0/xyzx+99.0*xyzx^2.0-98.0*xyzx^3.0+97.0/xyzx^4.0-96.0*xyzx^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-4.0/98.0*xyzx^98.0-1.0/xyz^98.0*3.0*xyzx+xy^-99.0*2.0*xyzx-1.0/101.0*xyzx^101.0-100.0*ln(xyzx)+99.0/3.0*xyzx^3.0-98.0/4.0*xyzx^4.0+97.0/-3.0/xyzx^3.0-96.0/6.0*xyzx^6.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/24.5*xyzx^98.0-1.0/xyz^98.0*3.0*xyzx+xy^-99.0*2.0*xyzx-1.0/101.0*xyzx^101.0-100.0*ln(xyzx)+33.0*xyzx^3.0-24.5*xyzx^4.0-32.333333333333336/xyzx^3.0-16.0*xyzx^6.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-388.0*xyzx^96.0-1.0/xyz^98.01.0/xyz^98.0*0.0+xy^-99.0*0.0-100.0*xyzx^99.0+100.0/xyzx^2.0+198.0*xyzx-294.0*xyzx^2.0-388.0/xyzx^5.0-480.0*xyzx^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-388.0*96.0*xyzx^95.0-1.0/xyz^98.01.0/xyz^98.0*0.0*0.0+xy^-99.0*0.0*0.0-100.0*99.0*xyzx^98.0+100.0*-2.0/xyzx^3.0+198.0-294.0*2.0*xyzx^1.0-388.0*-5.0/xyzx^6.0-480.0*4.0*xyzx^3.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-37248.0*xyzx^95.0-1.0/xyz^1.0/xyz^98.0*0.0+xy^-99.0*0.0-9900.0*xyzx^98.0-200.0/xyzx^3.0+198.0-588.0*xyzx+1940.0/xyzx^6.0-1920.0*xyzx^3.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/24.5*xyzx^98.0-1.0/xyz^98.0*3.0*xyzx+xy^-99.0*2.0*xyzx-1.0/101.0*xyzx^101.0-100.0*ln(xyzx)+33.0*xyzx^3.0-24.5*xyzx^4.0-32.333333333333336/xyzx^3.0-16.0*xyzx^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/24.5/99.0*xyzx^99.0-1.0/xyz^98.0*3.0/2.0*xyzx^2.0+xy^-99.0*xyzx^2.0-1.0/101.0/102.0*xyzx^102.0-100.0*xyzx+33.0/4.0*xyzx^4.0-24.5/5.0*xyzx^5.0-32.333333333333336/-2.0/xyzx^2.0-16.0/7.0*xyzx^7.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/2425.5*xyzx^99.0-1.0/xyz^98.0*1.5*xyzx^2.0+xy^-99.0*xyzx^2.0-1.0/10302.0*xyzx^102.0-100.0*xyzx+8.25*xyzx^4.0-4.9*xyzx^5.0+16.166666666666668/xyzx^2.0-2.2857142857142856*xyzx^7.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-37248.0*xyzx^95.0-1.0/xyz^1.0/xyz^98.01.0/xyz^1.0/xyz^98.0*0.0+xy^-99.0*0.0-9900.0*xyzx^98.0-200.0/xyzx^3.0+198.0-588.0*xyzx+1940.0/xyzx^6.0-1920.0*xyzx^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-37248.0*95.0*xyzx^94.0-1.0/xyz^1.0/xyz^98.01.0/xyz^1.0/xyz^98.0*0.0*0.0+xy^-99.0*0.0*0.0-9900.0*98.0*xyzx^97.0-200.0*-3.0/xyzx^4.0+198.0*0.0-588.0+1940.0*-6.0/xyzx^7.0-1920.0*3.0*xyzx^2.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-3538560.0*xyzx^94.0-1.0/xyz^1.0/xyz^1.0/xyz^1.0/xyz^98.0*0.0+xy^-99.0*0.0-970200.0*xyzx^97.0+600.0/xyzx^4.0-588.0-11640.0/xyzx^7.0-5760.0*xyzx^2.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/2425.5*xyzx^99.0-1.0/xyz^98.0*1.5*xyzx^2.0+xy^-99.0*xyzx^2.0-1.0/10302.0*xyzx^102.0-100.0*xyzx+8.25*xyzx^4.0-4.9*xyzx^5.0+16.166666666666668/xyzx^2.0-2.2857142857142856*xyzx^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/2425.5/100.0*xyzx^100.0-1.0/xyz^98.0*1.5/3.0*xyzx^3.0+xy^-99.0/3.0*xyzx^3.0-1.0/10302.0/103.0*xyzx^103.0-100.0/2.0*xyzx^2.0+8.25/5.0*xyzx^5.0-4.9/6.0*xyzx^6.0+16.166666666666668/-1.0/xyzx^1.0-2.2857142857142856/8.0*xyzx^8.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/242550.0*xyzx^100.0-1.0/xyz^98.0*0.5*xyzx^3.0+xy^-99.0/3.0*xyzx^3.0-1.0/1061106.0*xyzx^103.0-50.0*xyzx^2.0+1.65*xyzx^5.0-1.0/1.2244897959183672*xyzx^6.0-16.166666666666668/xyzx-1.0/3.5*xyzx^8.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-3538560.0*xyzx^94.0-1.0/xyz^1.0/xyz^1.0/xyz^1.0/xyz^98.01.0/xyz^1.0/xyz^1.0/xyz^1.0/xyz^98.0*0.0+xy^-99.0*0.0-970200.0*xyzx^97.0+600.0/xyzx^4.0-588.0-11640.0/xyzx^7.0-5760.0*xyzx^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-3538560.0*94.0*xyzx^93.0-1.0/xyz^1.0/xyz^1.0/xyz^1.0/xyz^98.01.0/xyz^1.0/xyz^1.0/xyz^1.0/xyz^98.0*0.0*0.0+xy^-99.0*0.0*0.0-970200.0*97.0*xyzx^96.0+600.0*-4.0/xyzx^5.0-588.0*0.0-11640.0*-7.0/xyzx^8.0-5760.0*2.0*xyzx^1.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-3.3262464E8*xyzx^93.0-1.0/xyz^1.0/xyz^1.0/xyz^1.0/xyz^1.0/xyz^1.0/xyz^1.0/xyz^1.0/xyz^98.0*0.0+xy^-99.0*0.0-9.41094E7*xyzx^96.0-2400.0/xyzx^5.0+81480.0/xyzx^8.0-11520.0*xyzx";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/242550.0*xyzx^100.0-1.0/xyz^98.0*0.5*xyzx^3.0+xy^-99.0/3.0*xyzx^3.0-1.0/1061106.0*xyzx^103.0-50.0*xyzx^2.0+1.65*xyzx^5.0-1.0/1.2244897959183672*xyzx^6.0-16.166666666666668/xyzx-1.0/3.5*xyzx^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/242550.0/101.0*xyzx^101.0-1.0/xyz^98.0*0.5/4.0*xyzx^4.0+xy^-99.0/3.0/4.0*xyzx^4.0-1.0/1061106.0/104.0*xyzx^104.0-50.0/3.0*xyzx^3.0+1.65/6.0*xyzx^6.0-1.0/1.2244897959183672/7.0*xyzx^7.0-16.166666666666668*ln(xyzx)-1.0/3.5/9.0*xyzx^9.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/2.449755E7*xyzx^101.0-1.0/xyz^98.0*0.125*xyzx^4.0+xy^-99.0/12.0*xyzx^4.0-1.0/1.10355024E8*xyzx^104.0-16.666666666666668*xyzx^3.0+1.0/3.6363636363636367*xyzx^6.0-1.0/8.57142857142857*xyzx^7.0-16.166666666666668*ln(xyzx)-1.0/31.5*xyzx^9.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130498() {
 UsageCalculus.TestCase = 130498;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+3/-xyz^98-2*-xy^-99+1*-x^100+100/-x^1-99*-x^2+98*-x^3-97/-x^4+96*-x^5+95/-x^6";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-3.0+2.0-x^100.0-100.0/x+99.0*x^2.0-98.0*x^3.0+97.0/x^4.0-96.0*x^5.0-95.0/x^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0+2.0*0.0-100.0*x^99.0+100.0/x^2.0+99.0*2.0*x^1.0-98.0*3.0*x^2.0+97.0*-4.0/x^5.0-96.0*5.0*x^4.0-95.0*-6.0/x^7.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-100.0*x^99.0+100.0/x^2.0+198.0*x-294.0*x^2.0-388.0/x^5.0-480.0*x^4.0+570.0/x^7.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-3.0+2.0-x^100.0-100.0/x+99.0*x^2.0-98.0*x^3.0+97.0/x^4.0-96.0*x^5.0-95.0/x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-3.0*x+2.0*x-1.0/101.0*x^101.0-100.0*ln(x)+99.0/3.0*x^3.0-98.0/4.0*x^4.0+97.0/-3.0/x^3.0-96.0/6.0*x^6.0-95.0/-5.0/x^5.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-3.0*x+2.0*x-1.0/101.0*x^101.0-100.0*ln(x)+33.0*x^3.0-24.5*x^4.0-32.333333333333336/x^3.0-16.0*x^6.0+19.0/x^5.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-100.0*x^99.0+100.0/x^2.0+198.0*x-294.0*x^2.0-388.0/x^5.0-480.0*x^4.0+570.0/x^7.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-100.0*99.0*x^98.0+100.0*-2.0/x^3.0+198.0-294.0*2.0*x^1.0-388.0*-5.0/x^6.0-480.0*4.0*x^3.0+570.0*-7.0/x^8.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-9900.0*x^98.0-200.0/x^3.0+198.0-588.0*x+1940.0/x^6.0-1920.0*x^3.0-3990.0/x^8.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-3.0*x+2.0*x-1.0/101.0*x^101.0-100.0*ln(x)+33.0*x^3.0-24.5*x^4.0-32.333333333333336/x^3.0-16.0*x^6.0+19.0/x^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-3.0/2.0*x^2.0+x^2.0-1.0/101.0/102.0*x^102.0-100.0*x+33.0/4.0*x^4.0-24.5/5.0*x^5.0-32.333333333333336/-2.0/x^2.0-16.0/7.0*x^7.0+19.0/-4.0/x^4.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.5*x^2.0+x^2.0-1.0/10302.0*x^102.0-100.0*x+8.25*x^4.0-4.9*x^5.0+16.166666666666668/x^2.0-2.2857142857142856*x^7.0-4.75/x^4.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-9900.0*x^98.0-200.0/x^3.0+198.0-588.0*x+1940.0/x^6.0-1920.0*x^3.0-3990.0/x^8.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-9900.0*98.0*x^97.0-200.0*-3.0/x^4.0+198.0*0.0-588.0+1940.0*-6.0/x^7.0-1920.0*3.0*x^2.0-3990.0*-8.0/x^9.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-970200.0*x^97.0+600.0/x^4.0-588.0-11640.0/x^7.0-5760.0*x^2.0+31920.0/x^9.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.5*x^2.0+x^2.0-1.0/10302.0*x^102.0-100.0*x+8.25*x^4.0-4.9*x^5.0+16.166666666666668/x^2.0-2.2857142857142856*x^7.0-4.75/x^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.5/3.0*x^3.0+1.0/3.0*x^3.0-1.0/10302.0/103.0*x^103.0-100.0/2.0*x^2.0+8.25/5.0*x^5.0-4.9/6.0*x^6.0+16.166666666666668/-1.0/x^1.0-2.2857142857142856/8.0*x^8.0-4.75/-3.0/x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/2.0*x^3.0+1.0/3.0*x^3.0-1.0/1061106.0*x^103.0-50.0*x^2.0+1.65*x^5.0-1.0/1.2244897959183672*x^6.0-16.166666666666668/x-1.0/3.5*x^8.0+1.5833333333333333/x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-970200.0*x^97.0+600.0/x^4.0-588.0-11640.0/x^7.0-5760.0*x^2.0+31920.0/x^9.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-970200.0*97.0*x^96.0+600.0*-4.0/x^5.0-588.0*0.0-11640.0*-7.0/x^8.0-5760.0*2.0*x^1.0+31920.0*-9.0/x^10.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-9.41094E7*x^96.0-2400.0/x^5.0+81480.0/x^8.0-11520.0*x-287280.0/x^10.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/2.0*x^3.0+1.0/3.0*x^3.0-1.0/1061106.0*x^103.0-50.0*x^2.0+1.65*x^5.0-1.0/1.2244897959183672*x^6.0-16.166666666666668/x-1.0/3.5*x^8.0+1.5833333333333333/x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/2.0/4.0*x^4.0+1.0/3.0/4.0*x^4.0-1.0/1061106.0/104.0*x^104.0-50.0/3.0*x^3.0+1.65/6.0*x^6.0-1.0/1.2244897959183672/7.0*x^7.0-16.166666666666668*ln(x)-1.0/3.5/9.0*x^9.0+1.5833333333333333/-2.0/x^2.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/8.0*x^4.0+1.0/12.0*x^4.0-1.0/1.10355024E8*x^104.0-16.666666666666668*x^3.0+1.0/3.6363636363636367*x^6.0-1.0/8.57142857142857*x^7.0-16.166666666666668*ln(x)-1.0/31.5*x^9.0-1.0/1.2631578947368423/x^2.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130499() {
 UsageCalculus.TestCase = 130499;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-2*-xy^-99+1*-xy^100+100/-xy^1-99*-xy^2+98*-xy^3-97/-xy^4+96*-xy^5+95/-xy^6-94*-xy^7";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "2.0/xy^99.0-xy^100.0-100.0/xy+99.0*xy^2.0-98.0*xy^3.0+97.0/xy^4.0-96.0*xy^5.0-95.0/xy^6.0+94.0*xy^7.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "2.0*-99.0/xy^100.0-100.0*xy^99.0+100.0/xy^2.0+99.0*2.0*xy^1.0-98.0*3.0*xy^2.0+97.0*-4.0/xy^5.0-96.0*5.0*xy^4.0-95.0*-6.0/xy^7.0+94.0*7.0*xy^6.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-198.0/xy^100.0-100.0*xy^99.0+100.0/xy^2.0+198.0*xy-294.0*xy^2.0-388.0/xy^5.0-480.0*xy^4.0+570.0/xy^7.0+658.0*xy^6.0";
 UsageCalculus.EqnSolArrayMap3[1] = "2.0/xy^99.0-xy^100.0-100.0/xy+99.0*xy^2.0-98.0*xy^3.0+97.0/xy^4.0-96.0*xy^5.0-95.0/xy^6.0+94.0*xy^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "2.0/-98.0/xy^98.0-1.0/101.0*xy^101.0-100.0*ln(xy)+99.0/3.0*xy^3.0-98.0/4.0*xy^4.0+97.0/-3.0/xy^3.0-96.0/6.0*xy^6.0-95.0/-5.0/xy^5.0+94.0/8.0*xy^8.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/49.0/xy^98.0-1.0/101.0*xy^101.0-100.0*ln(xy)+33.0*xy^3.0-24.5*xy^4.0-32.333333333333336/xy^3.0-16.0*xy^6.0+19.0/xy^5.0+11.75*xy^8.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-198.0/xy^100.0-100.0*xy^99.0+100.0/xy^2.0+198.0*xy-294.0*xy^2.0-388.0/xy^5.0-480.0*xy^4.0+570.0/xy^7.0+658.0*xy^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-198.0*-100.0/xy^101.0-100.0*99.0*xy^98.0+100.0*-2.0/xy^3.0+198.0-294.0*2.0*xy^1.0-388.0*-5.0/xy^6.0-480.0*4.0*xy^3.0+570.0*-7.0/xy^8.0+658.0*6.0*xy^5.0";
 UsageCalculus.EqnSolArrayMap2[2] = "19800.0/xy^101.0-9900.0*xy^98.0-200.0/xy^3.0+198.0-588.0*xy+1940.0/xy^6.0-1920.0*xy^3.0-3990.0/xy^8.0+3948.0*xy^5.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/49.0/xy^98.0-1.0/101.0*xy^101.0-100.0*ln(xy)+33.0*xy^3.0-24.5*xy^4.0-32.333333333333336/xy^3.0-16.0*xy^6.0+19.0/xy^5.0+11.75*xy^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/49.0/-97.0/xy^97.0-1.0/101.0/102.0*xy^102.0-100.0*xy+33.0/4.0*xy^4.0-24.5/5.0*xy^5.0-32.333333333333336/-2.0/xy^2.0-16.0/7.0*xy^7.0+19.0/-4.0/xy^4.0+11.75/9.0*xy^9.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/4753.0/xy^97.0-1.0/10302.0*xy^102.0-100.0*xy+8.25*xy^4.0-4.9*xy^5.0+16.166666666666668/xy^2.0-2.2857142857142856*xy^7.0-4.75/xy^4.0+1.3055555555555556*xy^9.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "19800.0/xy^101.0-9900.0*xy^98.0-200.0/xy^3.0+198.0-588.0*xy+1940.0/xy^6.0-1920.0*xy^3.0-3990.0/xy^8.0+3948.0*xy^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "19800.0*-101.0/xy^102.0-9900.0*98.0*xy^97.0-200.0*-3.0/xy^4.0+198.0*0.0-588.0+1940.0*-6.0/xy^7.0-1920.0*3.0*xy^2.0-3990.0*-8.0/xy^9.0+3948.0*5.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-1999800.0/xy^102.0-970200.0*xy^97.0+600.0/xy^4.0-588.0-11640.0/xy^7.0-5760.0*xy^2.0+31920.0/xy^9.0+19740.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/4753.0/xy^97.0-1.0/10302.0*xy^102.0-100.0*xy+8.25*xy^4.0-4.9*xy^5.0+16.166666666666668/xy^2.0-2.2857142857142856*xy^7.0-4.75/xy^4.0+1.3055555555555556*xy^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/4753.0/-96.0/xy^96.0-1.0/10302.0/103.0*xy^103.0-100.0/2.0*xy^2.0+8.25/5.0*xy^5.0-4.9/6.0*xy^6.0+16.166666666666668/-1.0/xy^1.0-2.2857142857142856/8.0*xy^8.0-4.75/-3.0/xy^3.0+1.3055555555555556/10.0*xy^10.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/456288.0/xy^96.0-1.0/1061106.0*xy^103.0-50.0*xy^2.0+1.65*xy^5.0-1.0/1.2244897959183672*xy^6.0-16.166666666666668/xy-1.0/3.5*xy^8.0+1.5833333333333333/xy^3.0+1.0/7.659574468085106*xy^10.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-1999800.0/xy^102.0-970200.0*xy^97.0+600.0/xy^4.0-588.0-11640.0/xy^7.0-5760.0*xy^2.0+31920.0/xy^9.0+19740.0*xy^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-1999800.0*-102.0/xy^103.0-970200.0*97.0*xy^96.0+600.0*-4.0/xy^5.0-588.0*0.0-11640.0*-7.0/xy^8.0-5760.0*2.0*xy^1.0+31920.0*-9.0/xy^10.0+19740.0*4.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap2[4] = "2.039796E8/xy^103.0-9.41094E7*xy^96.0-2400.0/xy^5.0+81480.0/xy^8.0-11520.0*xy-287280.0/xy^10.0+78960.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/456288.0/xy^96.0-1.0/1061106.0*xy^103.0-50.0*xy^2.0+1.65*xy^5.0-1.0/1.2244897959183672*xy^6.0-16.166666666666668/xy-1.0/3.5*xy^8.0+1.5833333333333333/xy^3.0+1.0/7.659574468085106*xy^10.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/456288.0/-95.0/xy^95.0-1.0/1061106.0/104.0*xy^104.0-50.0/3.0*xy^3.0+1.65/6.0*xy^6.0-1.0/1.2244897959183672/7.0*xy^7.0-16.166666666666668*ln(xy)-1.0/3.5/9.0*xy^9.0+1.5833333333333333/-2.0/xy^2.0+1.0/7.659574468085106/11.0*xy^11.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/4.334736E7/xy^95.0-1.0/1.10355024E8*xy^104.0-16.666666666666668*xy^3.0+1.0/3.6363636363636367*xy^6.0-1.0/8.57142857142857*xy^7.0-16.166666666666668*ln(xy)-1.0/31.5*xy^9.0-1.0/1.2631578947368423/xy^2.0+1.0/84.25531914893617*xy^11.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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

public static void TestCaseDiff130500() {
 UsageCalculus.TestCase = 130500;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+1*-x^100+100/-x^1-99*-x^2+98*-x^3-97/-x^4+96*-x^5+95/-x^6-94*-x^7";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x^100.0-100.0/x+99.0*x^2.0-98.0*x^3.0+97.0/x^4.0-96.0*x^5.0-95.0/x^6.0+94.0*x^7.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-100.0*x^99.0+100.0/x^2.0+99.0*2.0*x^1.0-98.0*3.0*x^2.0+97.0*-4.0/x^5.0-96.0*5.0*x^4.0-95.0*-6.0/x^7.0+94.0*7.0*x^6.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-100.0*x^99.0+100.0/x^2.0+198.0*x-294.0*x^2.0-388.0/x^5.0-480.0*x^4.0+570.0/x^7.0+658.0*x^6.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x^100.0-100.0/x+99.0*x^2.0-98.0*x^3.0+97.0/x^4.0-96.0*x^5.0-95.0/x^6.0+94.0*x^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.0/101.0*x^101.0-100.0*ln(x)+99.0/3.0*x^3.0-98.0/4.0*x^4.0+97.0/-3.0/x^3.0-96.0/6.0*x^6.0-95.0/-5.0/x^5.0+94.0/8.0*x^8.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/101.0*x^101.0-100.0*ln(x)+33.0*x^3.0-24.5*x^4.0-32.333333333333336/x^3.0-16.0*x^6.0+19.0/x^5.0+11.75*x^8.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-100.0*x^99.0+100.0/x^2.0+198.0*x-294.0*x^2.0-388.0/x^5.0-480.0*x^4.0+570.0/x^7.0+658.0*x^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-100.0*99.0*x^98.0+100.0*-2.0/x^3.0+198.0-294.0*2.0*x^1.0-388.0*-5.0/x^6.0-480.0*4.0*x^3.0+570.0*-7.0/x^8.0+658.0*6.0*x^5.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-9900.0*x^98.0-200.0/x^3.0+198.0-588.0*x+1940.0/x^6.0-1920.0*x^3.0-3990.0/x^8.0+3948.0*x^5.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/101.0*x^101.0-100.0*ln(x)+33.0*x^3.0-24.5*x^4.0-32.333333333333336/x^3.0-16.0*x^6.0+19.0/x^5.0+11.75*x^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/101.0/102.0*x^102.0-100.0*x+33.0/4.0*x^4.0-24.5/5.0*x^5.0-32.333333333333336/-2.0/x^2.0-16.0/7.0*x^7.0+19.0/-4.0/x^4.0+11.75/9.0*x^9.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/10302.0*x^102.0-100.0*x+8.25*x^4.0-4.9*x^5.0+16.166666666666668/x^2.0-2.2857142857142856*x^7.0-4.75/x^4.0+1.3055555555555556*x^9.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-9900.0*x^98.0-200.0/x^3.0+198.0-588.0*x+1940.0/x^6.0-1920.0*x^3.0-3990.0/x^8.0+3948.0*x^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-9900.0*98.0*x^97.0-200.0*-3.0/x^4.0+198.0*0.0-588.0+1940.0*-6.0/x^7.0-1920.0*3.0*x^2.0-3990.0*-8.0/x^9.0+3948.0*5.0*x^4.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-970200.0*x^97.0+600.0/x^4.0-588.0-11640.0/x^7.0-5760.0*x^2.0+31920.0/x^9.0+19740.0*x^4.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/10302.0*x^102.0-100.0*x+8.25*x^4.0-4.9*x^5.0+16.166666666666668/x^2.0-2.2857142857142856*x^7.0-4.75/x^4.0+1.3055555555555556*x^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/10302.0/103.0*x^103.0-100.0/2.0*x^2.0+8.25/5.0*x^5.0-4.9/6.0*x^6.0+16.166666666666668/-1.0/x^1.0-2.2857142857142856/8.0*x^8.0-4.75/-3.0/x^3.0+1.3055555555555556/10.0*x^10.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/1061106.0*x^103.0-50.0*x^2.0+1.65*x^5.0-1.0/1.2244897959183672*x^6.0-16.166666666666668/x-1.0/3.5*x^8.0+1.5833333333333333/x^3.0+1.0/7.659574468085106*x^10.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-970200.0*x^97.0+600.0/x^4.0-588.0-11640.0/x^7.0-5760.0*x^2.0+31920.0/x^9.0+19740.0*x^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-970200.0*97.0*x^96.0+600.0*-4.0/x^5.0-588.0*0.0-11640.0*-7.0/x^8.0-5760.0*2.0*x^1.0+31920.0*-9.0/x^10.0+19740.0*4.0*x^3.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-9.41094E7*x^96.0-2400.0/x^5.0+81480.0/x^8.0-11520.0*x-287280.0/x^10.0+78960.0*x^3.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/1061106.0*x^103.0-50.0*x^2.0+1.65*x^5.0-1.0/1.2244897959183672*x^6.0-16.166666666666668/x-1.0/3.5*x^8.0+1.5833333333333333/x^3.0+1.0/7.659574468085106*x^10.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/1061106.0/104.0*x^104.0-50.0/3.0*x^3.0+1.65/6.0*x^6.0-1.0/1.2244897959183672/7.0*x^7.0-16.166666666666668*ln(x)-1.0/3.5/9.0*x^9.0+1.5833333333333333/-2.0/x^2.0+1.0/7.659574468085106/11.0*x^11.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/1.10355024E8*x^104.0-16.666666666666668*x^3.0+1.0/3.6363636363636367*x^6.0-1.0/8.57142857142857*x^7.0-16.166666666666668*ln(x)-1.0/31.5*x^9.0-1.0/1.2631578947368423/x^2.0+1.0/84.25531914893617*x^11.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
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