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

public class CoPilotEqnHadammard5 {
    //CoPilotEqn Test Cases

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
        case 120501L:
 TestCaseDiff120501(); 
 break;
case 120502L:
 TestCaseDiff120502(); 
 break;
case 120503L:
 TestCaseDiff120503(); 
 break;
case 120504L:
 TestCaseDiff120504(); 
 break;
case 120505L:
 TestCaseDiff120505(); 
 break;
case 120506L:
 TestCaseDiff120506(); 
 break;
case 120507L:
 TestCaseDiff120507(); 
 break;
case 120508L:
 TestCaseDiff120508(); 
 break;
case 120509L:
 TestCaseDiff120509(); 
 break;
case 120510L:
 TestCaseDiff120510(); 
 break;
case 120511L:
 TestCaseDiff120511(); 
 break;
case 120512L:
 TestCaseDiff120512(); 
 break;
case 120513L:
 TestCaseDiff120513(); 
 break;
case 120514L:
 TestCaseDiff120514(); 
 break;
case 120515L:
 TestCaseDiff120515(); 
 break;
case 120516L:
 TestCaseDiff120516(); 
 break;
case 120517L:
 TestCaseDiff120517(); 
 break;
case 120518L:
 TestCaseDiff120518(); 
 break;
case 120519L:
 TestCaseDiff120519(); 
 break;
case 120520L:
 TestCaseDiff120520(); 
 break;
case 120521L:
 TestCaseDiff120521(); 
 break;
case 120522L:
 TestCaseDiff120522(); 
 break;
case 120523L:
 TestCaseDiff120523(); 
 break;
case 120524L:
 TestCaseDiff120524(); 
 break;
case 120525L:
 TestCaseDiff120525(); 
 break;
case 120526L:
 TestCaseDiff120526(); 
 break;
case 120527L:
 TestCaseDiff120527(); 
 break;
case 120528L:
 TestCaseDiff120528(); 
 break;
case 120529L:
 TestCaseDiff120529(); 
 break;
case 120530L:
 TestCaseDiff120530(); 
 break;
case 120531L:
 TestCaseDiff120531(); 
 break;
case 120532L:
 TestCaseDiff120532(); 
 break;
case 120533L:
 TestCaseDiff120533(); 
 break;
case 120534L:
 TestCaseDiff120534(); 
 break;
case 120535L:
 TestCaseDiff120535(); 
 break;
case 120536L:
 TestCaseDiff120536(); 
 break;
case 120537L:
 TestCaseDiff120537(); 
 break;
case 120538L:
 TestCaseDiff120538(); 
 break;
case 120539L:
 TestCaseDiff120539(); 
 break;
case 120540L:
 TestCaseDiff120540(); 
 break;
case 120541L:
 TestCaseDiff120541(); 
 break;
case 120542L:
 TestCaseDiff120542(); 
 break;
case 120543L:
 TestCaseDiff120543(); 
 break;
case 120544L:
 TestCaseDiff120544(); 
 break;
case 120545L:
 TestCaseDiff120545(); 
 break;
case 120546L:
 TestCaseDiff120546(); 
 break;
case 120547L:
 TestCaseDiff120547(); 
 break;
case 120548L:
 TestCaseDiff120548(); 
 break;
case 120549L:
 TestCaseDiff120549(); 
 break;
case 120550L:
 TestCaseDiff120550(); 
 break;
case 120551L:
 TestCaseDiff120551(); 
 break;
case 120552L:
 TestCaseDiff120552(); 
 break;
case 120553L:
 TestCaseDiff120553(); 
 break;
case 120554L:
 TestCaseDiff120554(); 
 break;
case 120555L:
 TestCaseDiff120555(); 
 break;
case 120556L:
 TestCaseDiff120556(); 
 break;
case 120557L:
 TestCaseDiff120557(); 
 break;
case 120558L:
 TestCaseDiff120558(); 
 break;
case 120559L:
 TestCaseDiff120559(); 
 break;
case 120560L:
 TestCaseDiff120560(); 
 break;
case 120561L:
 TestCaseDiff120561(); 
 break;
case 120562L:
 TestCaseDiff120562(); 
 break;
case 120563L:
 TestCaseDiff120563(); 
 break;
case 120564L:
 TestCaseDiff120564(); 
 break;
case 120565L:
 TestCaseDiff120565(); 
 break;
case 120566L:
 TestCaseDiff120566(); 
 break;
case 120567L:
 TestCaseDiff120567(); 
 break;
case 120568L:
 TestCaseDiff120568(); 
 break;
case 120569L:
 TestCaseDiff120569(); 
 break;
case 120570L:
 TestCaseDiff120570(); 
 break;
case 120571L:
 TestCaseDiff120571(); 
 break;
case 120572L:
 TestCaseDiff120572(); 
 break;
case 120573L:
 TestCaseDiff120573(); 
 break;
case 120574L:
 TestCaseDiff120574(); 
 break;
case 120575L:
 TestCaseDiff120575(); 
 break;
case 120576L:
 TestCaseDiff120576(); 
 break;
case 120577L:
 TestCaseDiff120577(); 
 break;
case 120578L:
 TestCaseDiff120578(); 
 break;
case 120579L:
 TestCaseDiff120579(); 
 break;
case 120580L:
 TestCaseDiff120580(); 
 break;
case 120581L:
 TestCaseDiff120581(); 
 break;
case 120582L:
 TestCaseDiff120582(); 
 break;
case 120583L:
 TestCaseDiff120583(); 
 break;
case 120584L:
 TestCaseDiff120584(); 
 break;
case 120585L:
 TestCaseDiff120585(); 
 break;
case 120586L:
 TestCaseDiff120586(); 
 break;
case 120587L:
 TestCaseDiff120587(); 
 break;
case 120588L:
 TestCaseDiff120588(); 
 break;
case 120589L:
 TestCaseDiff120589(); 
 break;
case 120590L:
 TestCaseDiff120590(); 
 break;
case 120591L:
 TestCaseDiff120591(); 
 break;
case 120592L:
 TestCaseDiff120592(); 
 break;
case 120593L:
 TestCaseDiff120593(); 
 break;
case 120594L:
 TestCaseDiff120594(); 
 break;
case 120595L:
 TestCaseDiff120595(); 
 break;
case 120596L:
 TestCaseDiff120596(); 
 break;
case 120597L:
 TestCaseDiff120597(); 
 break;
case 120598L:
 TestCaseDiff120598(); 
 break;
case 120599L:
 TestCaseDiff120599(); 
 break;
case 120600L:
 TestCaseDiff120600(); 
 break;

                             
           default:
                    System.out.println(ConsoleColors.RED + "CoPilotEqnBasic TestCase:j= " + j + ": Gap" + ConsoleColors.RESET);
                    break;
            }
        }
    }     
   
                
                
                public static void TestCaseDiff120501() {
 UsageCalculus.TestCase = 120501;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+30*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-22+31/x^23-32*x^24+33*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-25+34/x^26-35*x^27+36";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "30.0+31.0/x^23.0-32.0*x^24.0+33.0+34.0/x^26.0-35.0*x^27.0+36.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+31.0*-23.0/x^24.0-32.0*24.0*x^23.0+33.0*0.0+34.0*-26.0/x^27.0-35.0*27.0*x^26.0+36.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-713.0/x^24.0-768.0*x^23.0-884.0/x^27.0-945.0*x^26.0";
 UsageCalculus.EqnSolArrayMap3[1] = "30.0+31.0/x^23.0-32.0*x^24.0+33.0+34.0/x^26.0-35.0*x^27.0+36.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "30.0*x+31.0/-22.0/x^22.0-32.0/25.0*x^25.0+33.0*x+34.0/-25.0/x^25.0-35.0/28.0*x^28.0+36.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "30.0*x-1.4090909090909092/x^22.0-1.28*x^25.0+33.0*x-1.36/x^25.0-1.25*x^28.0+36.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-713.0/x^24.0-768.0*x^23.0-884.0/x^27.0-945.0*x^26.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-713.0*-24.0/x^25.0-768.0*23.0*x^22.0-884.0*-27.0/x^28.0-945.0*26.0*x^25.0";
 UsageCalculus.EqnSolArrayMap2[2] = "17112.0/x^25.0-17664.0*x^22.0+23868.0/x^28.0-24570.0*x^25.0";
 UsageCalculus.EqnSolArrayMap3[2] = "30.0*x-1.4090909090909092/x^22.0-1.28*x^25.0+33.0*x-1.36/x^25.0-1.25*x^28.0+36.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "30.0/2.0*x^2.0-1.4090909090909092/-21.0/x^21.0-1.28/26.0*x^26.0+33.0/2.0*x^2.0-1.36/-24.0/x^24.0-1.25/29.0*x^29.0+36.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "15.0*x^2.0+1.0/14.903225806451612/x^21.0-1.0/20.3125*x^26.0+16.5*x^2.0+1.0/17.64705882352941/x^24.0-1.0/23.2*x^29.0+18.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "17112.0/x^25.0-17664.0*x^22.0+23868.0/x^28.0-24570.0*x^25.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "17112.0*-25.0/x^26.0-17664.0*22.0*x^21.0+23868.0*-28.0/x^29.0-24570.0*25.0*x^24.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-427800.0/x^26.0-388608.0*x^21.0-668304.0/x^29.0-614250.0*x^24.0";
 UsageCalculus.EqnSolArrayMap3[3] = "15.0*x^2.0+1.0/14.903225806451612/x^21.0-1.0/20.3125*x^26.0+16.5*x^2.0+1.0/17.64705882352941/x^24.0-1.0/23.2*x^29.0+18.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "15.0/3.0*x^3.0+1.0/14.903225806451612/-20.0/x^20.0-1.0/20.3125/27.0*x^27.0+16.5/3.0*x^3.0+1.0/17.64705882352941/-23.0/x^23.0-1.0/23.2/30.0*x^30.0+18.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "5.0*x^3.0-1.0/298.06451612903226/x^20.0-1.0/548.4375*x^27.0+5.5*x^3.0-1.0/405.8823529411764/x^23.0-1.0/696.0*x^30.0+6.0*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-427800.0/x^26.0-388608.0*x^21.0-668304.0/x^29.0-614250.0*x^24.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-427800.0*-26.0/x^27.0-388608.0*21.0*x^20.0-668304.0*-29.0/x^30.0-614250.0*24.0*x^23.0";
 UsageCalculus.EqnSolArrayMap2[4] = "1.11228E7/x^27.0-8160768.0*x^20.0+1.9380816E7/x^30.0-1.4742E7*x^23.0";
 UsageCalculus.EqnSolArrayMap3[4] = "5.0*x^3.0-1.0/298.06451612903226/x^20.0-1.0/548.4375*x^27.0+5.5*x^3.0-1.0/405.8823529411764/x^23.0-1.0/696.0*x^30.0+6.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "5.0/4.0*x^4.0-1.0/298.06451612903226/-19.0/x^19.0-1.0/548.4375/28.0*x^28.0+5.5/4.0*x^4.0-1.0/405.8823529411764/-22.0/x^22.0-1.0/696.0/31.0*x^31.0+6.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.25*x^4.0+1.0/5663.225806451613/x^19.0-1.0/15356.25*x^28.0+1.375*x^4.0+1.0/8929.411764705881/x^22.0-1.0/21576.0*x^31.0+1.5*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120502() {
 UsageCalculus.TestCase = 120502;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+31-32+33*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-25+34-35+36+37-38";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "31.0-32.0+33.0+34.0-35.0+36.0+37.0-38.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0-32.0*0.0+33.0*0.0+34.0*0.0-35.0*0.0+36.0*0.0+37.0*0.0-38.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "31.0-32.0+33.0+34.0-35.0+36.0+37.0-38.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "31.0*x-32.0*x+33.0*x+34.0*x-35.0*x+36.0*x+37.0*x-38.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "31.0*x-32.0*x+33.0*x+34.0*x-35.0*x+36.0*x+37.0*x-38.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "31.0*x-32.0*x+33.0*x+34.0*x-35.0*x+36.0*x+37.0*x-38.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "31.0/2.0*x^2.0-32.0/2.0*x^2.0+33.0/2.0*x^2.0+34.0/2.0*x^2.0-35.0/2.0*x^2.0+36.0/2.0*x^2.0+37.0/2.0*x^2.0-38.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "15.5*x^2.0-16.0*x^2.0+16.5*x^2.0+17.0*x^2.0-17.5*x^2.0+18.0*x^2.0+18.5*x^2.0-19.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "15.5*x^2.0-16.0*x^2.0+16.5*x^2.0+17.0*x^2.0-17.5*x^2.0+18.0*x^2.0+18.5*x^2.0-19.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "15.5/3.0*x^3.0-16.0/3.0*x^3.0+16.5/3.0*x^3.0+17.0/3.0*x^3.0-17.5/3.0*x^3.0+18.0/3.0*x^3.0+18.5/3.0*x^3.0-19.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "5.166666666666667*x^3.0-5.333333333333333*x^3.0+5.5*x^3.0+5.666666666666667*x^3.0-5.833333333333333*x^3.0+6.0*x^3.0+6.166666666666667*x^3.0-6.333333333333333*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "5.166666666666667*x^3.0-5.333333333333333*x^3.0+5.5*x^3.0+5.666666666666667*x^3.0-5.833333333333333*x^3.0+6.0*x^3.0+6.166666666666667*x^3.0-6.333333333333333*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "5.166666666666667/4.0*x^4.0-5.333333333333333/4.0*x^4.0+5.5/4.0*x^4.0+5.666666666666667/4.0*x^4.0-5.833333333333333/4.0*x^4.0+6.0/4.0*x^4.0+6.166666666666667/4.0*x^4.0-6.333333333333333/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.2916666666666667*x^4.0-1.3333333333333333*x^4.0+1.375*x^4.0+1.4166666666666667*x^4.0-1.4583333333333333*x^4.0+1.5*x^4.0+1.5416666666666667*x^4.0-1.5833333333333333*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120503() {
 UsageCalculus.TestCase = 120503;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-32*x^24+33*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-25+34/x^26-35*x^27+36+37/x^29-38*x^30+39+40/x^32";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-32.0*x^24.0+33.0+34.0/x^26.0-35.0*x^27.0+36.0+37.0/x^29.0-38.0*x^30.0+39.0+40.0/x^32.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-32.0*24.0*x^23.0+33.0*0.0+34.0*-26.0/x^27.0-35.0*27.0*x^26.0+36.0*0.0+37.0*-29.0/x^30.0-38.0*30.0*x^29.0+39.0*0.0+40.0*-32.0/x^33.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-768.0*x^23.0-884.0/x^27.0-945.0*x^26.0-1073.0/x^30.0-1140.0*x^29.0-1280.0/x^33.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-32.0*x^24.0+33.0+34.0/x^26.0-35.0*x^27.0+36.0+37.0/x^29.0-38.0*x^30.0+39.0+40.0/x^32.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-32.0/25.0*x^25.0+33.0*x+34.0/-25.0/x^25.0-35.0/28.0*x^28.0+36.0*x+37.0/-28.0/x^28.0-38.0/31.0*x^31.0+39.0*x+40.0/-31.0/x^31.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.28*x^25.0+33.0*x-1.36/x^25.0-1.25*x^28.0+36.0*x-1.3214285714285714/x^28.0-1.2258064516129032*x^31.0+39.0*x-1.2903225806451613/x^31.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-768.0*x^23.0-884.0/x^27.0-945.0*x^26.0-1073.0/x^30.0-1140.0*x^29.0-1280.0/x^33.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-768.0*23.0*x^22.0-884.0*-27.0/x^28.0-945.0*26.0*x^25.0-1073.0*-30.0/x^31.0-1140.0*29.0*x^28.0-1280.0*-33.0/x^34.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-17664.0*x^22.0+23868.0/x^28.0-24570.0*x^25.0+32190.0/x^31.0-33060.0*x^28.0+42240.0/x^34.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.28*x^25.0+33.0*x-1.36/x^25.0-1.25*x^28.0+36.0*x-1.3214285714285714/x^28.0-1.2258064516129032*x^31.0+39.0*x-1.2903225806451613/x^31.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.28/26.0*x^26.0+33.0/2.0*x^2.0-1.36/-24.0/x^24.0-1.25/29.0*x^29.0+36.0/2.0*x^2.0-1.3214285714285714/-27.0/x^27.0-1.2258064516129032/32.0*x^32.0+39.0/2.0*x^2.0-1.2903225806451613/-30.0/x^30.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/20.3125*x^26.0+16.5*x^2.0+1.0/17.64705882352941/x^24.0-1.0/23.2*x^29.0+18.0*x^2.0+1.0/20.43243243243243/x^27.0-1.0/26.105263157894736*x^32.0+19.5*x^2.0+1.0/23.25/x^30.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-17664.0*x^22.0+23868.0/x^28.0-24570.0*x^25.0+32190.0/x^31.0-33060.0*x^28.0+42240.0/x^34.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-17664.0*22.0*x^21.0+23868.0*-28.0/x^29.0-24570.0*25.0*x^24.0+32190.0*-31.0/x^32.0-33060.0*28.0*x^27.0+42240.0*-34.0/x^35.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-388608.0*x^21.0-668304.0/x^29.0-614250.0*x^24.0-997890.0/x^32.0-925680.0*x^27.0-1436160.0/x^35.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/20.3125*x^26.0+16.5*x^2.0+1.0/17.64705882352941/x^24.0-1.0/23.2*x^29.0+18.0*x^2.0+1.0/20.43243243243243/x^27.0-1.0/26.105263157894736*x^32.0+19.5*x^2.0+1.0/23.25/x^30.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/20.3125/27.0*x^27.0+16.5/3.0*x^3.0+1.0/17.64705882352941/-23.0/x^23.0-1.0/23.2/30.0*x^30.0+18.0/3.0*x^3.0+1.0/20.43243243243243/-26.0/x^26.0-1.0/26.105263157894736/33.0*x^33.0+19.5/3.0*x^3.0+1.0/23.25/-29.0/x^29.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/548.4375*x^27.0+5.5*x^3.0-1.0/405.8823529411764/x^23.0-1.0/696.0*x^30.0+6.0*x^3.0-1.0/531.2432432432432/x^26.0-1.0/861.4736842105262*x^33.0+6.5*x^3.0-1.0/674.25/x^29.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-388608.0*x^21.0-668304.0/x^29.0-614250.0*x^24.0-997890.0/x^32.0-925680.0*x^27.0-1436160.0/x^35.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-388608.0*21.0*x^20.0-668304.0*-29.0/x^30.0-614250.0*24.0*x^23.0-997890.0*-32.0/x^33.0-925680.0*27.0*x^26.0-1436160.0*-35.0/x^36.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-8160768.0*x^20.0+1.9380816E7/x^30.0-1.4742E7*x^23.0+3.193248E7/x^33.0-2.499336E7*x^26.0+5.02656E7/x^36.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/548.4375*x^27.0+5.5*x^3.0-1.0/405.8823529411764/x^23.0-1.0/696.0*x^30.0+6.0*x^3.0-1.0/531.2432432432432/x^26.0-1.0/861.4736842105262*x^33.0+6.5*x^3.0-1.0/674.25/x^29.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/548.4375/28.0*x^28.0+5.5/4.0*x^4.0-1.0/405.8823529411764/-22.0/x^22.0-1.0/696.0/31.0*x^31.0+6.0/4.0*x^4.0-1.0/531.2432432432432/-25.0/x^25.0-1.0/861.4736842105262/34.0*x^34.0+6.5/4.0*x^4.0-1.0/674.25/-28.0/x^28.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/15356.25*x^28.0+1.375*x^4.0+1.0/8929.411764705881/x^22.0-1.0/21576.0*x^31.0+1.5*x^4.0+1.0/13281.08108108108/x^25.0-1.0/29290.105263157893*x^34.0+1.625*x^4.0+1.0/18879.0/x^28.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120504() {
 UsageCalculus.TestCase = 120504;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+33*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-25+34/x^26-35*x^27+36+37/x^29-38*x^30+39+40/x^32-41*x^33+42*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-34";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "33.0+34.0/x^26.0-35.0*x^27.0+36.0+37.0/x^29.0-38.0*x^30.0+39.0+40.0/x^32.0-41.0*x^33.0+42.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+34.0*-26.0/x^27.0-35.0*27.0*x^26.0+36.0*0.0+37.0*-29.0/x^30.0-38.0*30.0*x^29.0+39.0*0.0+40.0*-32.0/x^33.0-41.0*33.0*x^32.0+42.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-884.0/x^27.0-945.0*x^26.0-1073.0/x^30.0-1140.0*x^29.0-1280.0/x^33.0-1353.0*x^32.0";
 UsageCalculus.EqnSolArrayMap3[1] = "33.0+34.0/x^26.0-35.0*x^27.0+36.0+37.0/x^29.0-38.0*x^30.0+39.0+40.0/x^32.0-41.0*x^33.0+42.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "33.0*x+34.0/-25.0/x^25.0-35.0/28.0*x^28.0+36.0*x+37.0/-28.0/x^28.0-38.0/31.0*x^31.0+39.0*x+40.0/-31.0/x^31.0-41.0/34.0*x^34.0+42.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "33.0*x-1.36/x^25.0-1.25*x^28.0+36.0*x-1.3214285714285714/x^28.0-1.2258064516129032*x^31.0+39.0*x-1.2903225806451613/x^31.0-1.2058823529411764*x^34.0+42.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-884.0/x^27.0-945.0*x^26.0-1073.0/x^30.0-1140.0*x^29.0-1280.0/x^33.0-1353.0*x^32.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-884.0*-27.0/x^28.0-945.0*26.0*x^25.0-1073.0*-30.0/x^31.0-1140.0*29.0*x^28.0-1280.0*-33.0/x^34.0-1353.0*32.0*x^31.0";
 UsageCalculus.EqnSolArrayMap2[2] = "23868.0/x^28.0-24570.0*x^25.0+32190.0/x^31.0-33060.0*x^28.0+42240.0/x^34.0-43296.0*x^31.0";
 UsageCalculus.EqnSolArrayMap3[2] = "33.0*x-1.36/x^25.0-1.25*x^28.0+36.0*x-1.3214285714285714/x^28.0-1.2258064516129032*x^31.0+39.0*x-1.2903225806451613/x^31.0-1.2058823529411764*x^34.0+42.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "33.0/2.0*x^2.0-1.36/-24.0/x^24.0-1.25/29.0*x^29.0+36.0/2.0*x^2.0-1.3214285714285714/-27.0/x^27.0-1.2258064516129032/32.0*x^32.0+39.0/2.0*x^2.0-1.2903225806451613/-30.0/x^30.0-1.2058823529411764/35.0*x^35.0+42.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "16.5*x^2.0+1.0/17.64705882352941/x^24.0-1.0/23.2*x^29.0+18.0*x^2.0+1.0/20.43243243243243/x^27.0-1.0/26.105263157894736*x^32.0+19.5*x^2.0+1.0/23.25/x^30.0-1.0/29.02439024390244*x^35.0+21.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "23868.0/x^28.0-24570.0*x^25.0+32190.0/x^31.0-33060.0*x^28.0+42240.0/x^34.0-43296.0*x^31.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "23868.0*-28.0/x^29.0-24570.0*25.0*x^24.0+32190.0*-31.0/x^32.0-33060.0*28.0*x^27.0+42240.0*-34.0/x^35.0-43296.0*31.0*x^30.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-668304.0/x^29.0-614250.0*x^24.0-997890.0/x^32.0-925680.0*x^27.0-1436160.0/x^35.0-1342176.0*x^30.0";
 UsageCalculus.EqnSolArrayMap3[3] = "16.5*x^2.0+1.0/17.64705882352941/x^24.0-1.0/23.2*x^29.0+18.0*x^2.0+1.0/20.43243243243243/x^27.0-1.0/26.105263157894736*x^32.0+19.5*x^2.0+1.0/23.25/x^30.0-1.0/29.02439024390244*x^35.0+21.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "16.5/3.0*x^3.0+1.0/17.64705882352941/-23.0/x^23.0-1.0/23.2/30.0*x^30.0+18.0/3.0*x^3.0+1.0/20.43243243243243/-26.0/x^26.0-1.0/26.105263157894736/33.0*x^33.0+19.5/3.0*x^3.0+1.0/23.25/-29.0/x^29.0-1.0/29.02439024390244/36.0*x^36.0+21.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "5.5*x^3.0-1.0/405.8823529411764/x^23.0-1.0/696.0*x^30.0+6.0*x^3.0-1.0/531.2432432432432/x^26.0-1.0/861.4736842105262*x^33.0+6.5*x^3.0-1.0/674.25/x^29.0-1.0/1044.878048780488*x^36.0+7.0*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-668304.0/x^29.0-614250.0*x^24.0-997890.0/x^32.0-925680.0*x^27.0-1436160.0/x^35.0-1342176.0*x^30.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-668304.0*-29.0/x^30.0-614250.0*24.0*x^23.0-997890.0*-32.0/x^33.0-925680.0*27.0*x^26.0-1436160.0*-35.0/x^36.0-1342176.0*30.0*x^29.0";
 UsageCalculus.EqnSolArrayMap2[4] = "1.9380816E7/x^30.0-1.4742E7*x^23.0+3.193248E7/x^33.0-2.499336E7*x^26.0+5.02656E7/x^36.0-4.026528E7*x^29.0";
 UsageCalculus.EqnSolArrayMap3[4] = "5.5*x^3.0-1.0/405.8823529411764/x^23.0-1.0/696.0*x^30.0+6.0*x^3.0-1.0/531.2432432432432/x^26.0-1.0/861.4736842105262*x^33.0+6.5*x^3.0-1.0/674.25/x^29.0-1.0/1044.878048780488*x^36.0+7.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "5.5/4.0*x^4.0-1.0/405.8823529411764/-22.0/x^22.0-1.0/696.0/31.0*x^31.0+6.0/4.0*x^4.0-1.0/531.2432432432432/-25.0/x^25.0-1.0/861.4736842105262/34.0*x^34.0+6.5/4.0*x^4.0-1.0/674.25/-28.0/x^28.0-1.0/1044.878048780488/37.0*x^37.0+7.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.375*x^4.0+1.0/8929.411764705881/x^22.0-1.0/21576.0*x^31.0+1.5*x^4.0+1.0/13281.08108108108/x^25.0-1.0/29290.105263157893*x^34.0+1.625*x^4.0+1.0/18879.0/x^28.0-1.0/38660.48780487805*x^37.0+1.75*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120505() {
 UsageCalculus.TestCase = 120505;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+34/xyz^26-35*xyz^27+36+37/xyz^29-38*xyz^30+39+40/xyz^32-41*xyz^33+42*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-34+43/xyz^35-44*xyz^36";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "34.0/xyz^26.0-35.0*xyz^27.0+36.0+37.0/xyz^29.0-38.0*xyz^30.0+39.0+40.0/xyz^32.0-41.0*xyz^33.0+42.0+43.0/xyz^35.0-44.0*xyz^36.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "34.0*-26.0/xyz^27.0-35.0*27.0*xyz^26.0+36.0*0.0+37.0*-29.0/xyz^30.0-38.0*30.0*xyz^29.0+39.0*0.0+40.0*-32.0/xyz^33.0-41.0*33.0*xyz^32.0+42.0*0.0+43.0*-35.0/xyz^36.0-44.0*36.0*xyz^35.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-884.0/xyz^27.0-945.0*xyz^26.0-1073.0/xyz^30.0-1140.0*xyz^29.0-1280.0/xyz^33.0-1353.0*xyz^32.0-1505.0/xyz^36.0-1584.0*xyz^35.0";
 UsageCalculus.EqnSolArrayMap3[1] = "34.0/xyz^26.0-35.0*xyz^27.0+36.0+37.0/xyz^29.0-38.0*xyz^30.0+39.0+40.0/xyz^32.0-41.0*xyz^33.0+42.0+43.0/xyz^35.0-44.0*xyz^36.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "34.0/-25.0/xyz^25.0-35.0/28.0*xyz^28.0+36.0*xyz+37.0/-28.0/xyz^28.0-38.0/31.0*xyz^31.0+39.0*xyz+40.0/-31.0/xyz^31.0-41.0/34.0*xyz^34.0+42.0*xyz+43.0/-34.0/xyz^34.0-44.0/37.0*xyz^37.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.36/xyz^25.0-1.25*xyz^28.0+36.0*xyz-1.3214285714285714/xyz^28.0-1.2258064516129032*xyz^31.0+39.0*xyz-1.2903225806451613/xyz^31.0-1.2058823529411764*xyz^34.0+42.0*xyz-1.2647058823529411/xyz^34.0-1.1891891891891893*xyz^37.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-884.0/xyz^27.0-945.0*xyz^26.0-1073.0/xyz^30.0-1140.0*xyz^29.0-1280.0/xyz^33.0-1353.0*xyz^32.0-1505.0/xyz^36.0-1584.0*xyz^35.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-884.0*-27.0/xyz^28.0-945.0*26.0*xyz^25.0-1073.0*-30.0/xyz^31.0-1140.0*29.0*xyz^28.0-1280.0*-33.0/xyz^34.0-1353.0*32.0*xyz^31.0-1505.0*-36.0/xyz^37.0-1584.0*35.0*xyz^34.0";
 UsageCalculus.EqnSolArrayMap2[2] = "23868.0/xyz^28.0-24570.0*xyz^25.0+32190.0/xyz^31.0-33060.0*xyz^28.0+42240.0/xyz^34.0-43296.0*xyz^31.0+54180.0/xyz^37.0-55440.0*xyz^34.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.36/xyz^25.0-1.25*xyz^28.0+36.0*xyz-1.3214285714285714/xyz^28.0-1.2258064516129032*xyz^31.0+39.0*xyz-1.2903225806451613/xyz^31.0-1.2058823529411764*xyz^34.0+42.0*xyz-1.2647058823529411/xyz^34.0-1.1891891891891893*xyz^37.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.36/-24.0/xyz^24.0-1.25/29.0*xyz^29.0+36.0/2.0*xyz^2.0-1.3214285714285714/-27.0/xyz^27.0-1.2258064516129032/32.0*xyz^32.0+39.0/2.0*xyz^2.0-1.2903225806451613/-30.0/xyz^30.0-1.2058823529411764/35.0*xyz^35.0+42.0/2.0*xyz^2.0-1.2647058823529411/-33.0/xyz^33.0-1.1891891891891893/38.0*xyz^38.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/17.64705882352941/xyz^24.0-1.0/23.2*xyz^29.0+18.0*xyz^2.0+1.0/20.43243243243243/xyz^27.0-1.0/26.105263157894736*xyz^32.0+19.5*xyz^2.0+1.0/23.25/xyz^30.0-1.0/29.02439024390244*xyz^35.0+21.0*xyz^2.0+1.0/26.093023255813954/xyz^33.0-1.0/31.954545454545453*xyz^38.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "23868.0/xyz^28.0-24570.0*xyz^25.0+32190.0/xyz^31.0-33060.0*xyz^28.0+42240.0/xyz^34.0-43296.0*xyz^31.0+54180.0/xyz^37.0-55440.0*xyz^34.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "23868.0*-28.0/xyz^29.0-24570.0*25.0*xyz^24.0+32190.0*-31.0/xyz^32.0-33060.0*28.0*xyz^27.0+42240.0*-34.0/xyz^35.0-43296.0*31.0*xyz^30.0+54180.0*-37.0/xyz^38.0-55440.0*34.0*xyz^33.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-668304.0/xyz^29.0-614250.0*xyz^24.0-997890.0/xyz^32.0-925680.0*xyz^27.0-1436160.0/xyz^35.0-1342176.0*xyz^30.0-2004660.0/xyz^38.0-1884960.0*xyz^33.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/17.64705882352941/xyz^24.0-1.0/23.2*xyz^29.0+18.0*xyz^2.0+1.0/20.43243243243243/xyz^27.0-1.0/26.105263157894736*xyz^32.0+19.5*xyz^2.0+1.0/23.25/xyz^30.0-1.0/29.02439024390244*xyz^35.0+21.0*xyz^2.0+1.0/26.093023255813954/xyz^33.0-1.0/31.954545454545453*xyz^38.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/17.64705882352941/-23.0/xyz^23.0-1.0/23.2/30.0*xyz^30.0+18.0/3.0*xyz^3.0+1.0/20.43243243243243/-26.0/xyz^26.0-1.0/26.105263157894736/33.0*xyz^33.0+19.5/3.0*xyz^3.0+1.0/23.25/-29.0/xyz^29.0-1.0/29.02439024390244/36.0*xyz^36.0+21.0/3.0*xyz^3.0+1.0/26.093023255813954/-32.0/xyz^32.0-1.0/31.954545454545453/39.0*xyz^39.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/405.8823529411764/xyz^23.0-1.0/696.0*xyz^30.0+6.0*xyz^3.0-1.0/531.2432432432432/xyz^26.0-1.0/861.4736842105262*xyz^33.0+6.5*xyz^3.0-1.0/674.25/xyz^29.0-1.0/1044.878048780488*xyz^36.0+7.0*xyz^3.0-1.0/834.9767441860465/xyz^32.0-1.0/1246.2272727272727*xyz^39.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-668304.0/xyz^29.0-614250.0*xyz^24.0-997890.0/xyz^32.0-925680.0*xyz^27.0-1436160.0/xyz^35.0-1342176.0*xyz^30.0-2004660.0/xyz^38.0-1884960.0*xyz^33.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-668304.0*-29.0/xyz^30.0-614250.0*24.0*xyz^23.0-997890.0*-32.0/xyz^33.0-925680.0*27.0*xyz^26.0-1436160.0*-35.0/xyz^36.0-1342176.0*30.0*xyz^29.0-2004660.0*-38.0/xyz^39.0-1884960.0*33.0*xyz^32.0";
 UsageCalculus.EqnSolArrayMap2[4] = "1.9380816E7/xyz^30.0-1.4742E7*xyz^23.0+3.193248E7/xyz^33.0-2.499336E7*xyz^26.0+5.02656E7/xyz^36.0-4.026528E7*xyz^29.0+7.617708E7/xyz^39.0-6.220368E7*xyz^32.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/405.8823529411764/xyz^23.0-1.0/696.0*xyz^30.0+6.0*xyz^3.0-1.0/531.2432432432432/xyz^26.0-1.0/861.4736842105262*xyz^33.0+6.5*xyz^3.0-1.0/674.25/xyz^29.0-1.0/1044.878048780488*xyz^36.0+7.0*xyz^3.0-1.0/834.9767441860465/xyz^32.0-1.0/1246.2272727272727*xyz^39.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/405.8823529411764/-22.0/xyz^22.0-1.0/696.0/31.0*xyz^31.0+6.0/4.0*xyz^4.0-1.0/531.2432432432432/-25.0/xyz^25.0-1.0/861.4736842105262/34.0*xyz^34.0+6.5/4.0*xyz^4.0-1.0/674.25/-28.0/xyz^28.0-1.0/1044.878048780488/37.0*xyz^37.0+7.0/4.0*xyz^4.0-1.0/834.9767441860465/-31.0/xyz^31.0-1.0/1246.2272727272727/40.0*xyz^40.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/8929.411764705881/xyz^22.0-1.0/21576.0*xyz^31.0+1.5*xyz^4.0+1.0/13281.08108108108/xyz^25.0-1.0/29290.105263157893*xyz^34.0+1.625*xyz^4.0+1.0/18879.0/xyz^28.0-1.0/38660.48780487805*xyz^37.0+1.75*xyz^4.0+1.0/25884.279069767443/xyz^31.0-1.0/49849.09090909091*xyz^40.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120506() {
 UsageCalculus.TestCase = 120506;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-35*x^27+36+37/x^29-38*x^30+39+40/x^32-41*x^33+42*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-34+43/x^35-44*x^36+45*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-37+46/x^38";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-35.0*x^27.0+36.0+37.0/x^29.0-38.0*x^30.0+39.0+40.0/x^32.0-41.0*x^33.0+42.0+43.0/x^35.0-44.0*x^36.0+45.0+46.0/x^38.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-35.0*27.0*x^26.0+36.0*0.0+37.0*-29.0/x^30.0-38.0*30.0*x^29.0+39.0*0.0+40.0*-32.0/x^33.0-41.0*33.0*x^32.0+42.0*0.0+43.0*-35.0/x^36.0-44.0*36.0*x^35.0+45.0*0.0+46.0*-38.0/x^39.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-945.0*x^26.0-1073.0/x^30.0-1140.0*x^29.0-1280.0/x^33.0-1353.0*x^32.0-1505.0/x^36.0-1584.0*x^35.0-1748.0/x^39.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-35.0*x^27.0+36.0+37.0/x^29.0-38.0*x^30.0+39.0+40.0/x^32.0-41.0*x^33.0+42.0+43.0/x^35.0-44.0*x^36.0+45.0+46.0/x^38.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-35.0/28.0*x^28.0+36.0*x+37.0/-28.0/x^28.0-38.0/31.0*x^31.0+39.0*x+40.0/-31.0/x^31.0-41.0/34.0*x^34.0+42.0*x+43.0/-34.0/x^34.0-44.0/37.0*x^37.0+45.0*x+46.0/-37.0/x^37.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.25*x^28.0+36.0*x-1.3214285714285714/x^28.0-1.2258064516129032*x^31.0+39.0*x-1.2903225806451613/x^31.0-1.2058823529411764*x^34.0+42.0*x-1.2647058823529411/x^34.0-1.1891891891891893*x^37.0+45.0*x-1.2432432432432432/x^37.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-945.0*x^26.0-1073.0/x^30.0-1140.0*x^29.0-1280.0/x^33.0-1353.0*x^32.0-1505.0/x^36.0-1584.0*x^35.0-1748.0/x^39.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-945.0*26.0*x^25.0-1073.0*-30.0/x^31.0-1140.0*29.0*x^28.0-1280.0*-33.0/x^34.0-1353.0*32.0*x^31.0-1505.0*-36.0/x^37.0-1584.0*35.0*x^34.0-1748.0*-39.0/x^40.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-24570.0*x^25.0+32190.0/x^31.0-33060.0*x^28.0+42240.0/x^34.0-43296.0*x^31.0+54180.0/x^37.0-55440.0*x^34.0+68172.0/x^40.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.25*x^28.0+36.0*x-1.3214285714285714/x^28.0-1.2258064516129032*x^31.0+39.0*x-1.2903225806451613/x^31.0-1.2058823529411764*x^34.0+42.0*x-1.2647058823529411/x^34.0-1.1891891891891893*x^37.0+45.0*x-1.2432432432432432/x^37.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.25/29.0*x^29.0+36.0/2.0*x^2.0-1.3214285714285714/-27.0/x^27.0-1.2258064516129032/32.0*x^32.0+39.0/2.0*x^2.0-1.2903225806451613/-30.0/x^30.0-1.2058823529411764/35.0*x^35.0+42.0/2.0*x^2.0-1.2647058823529411/-33.0/x^33.0-1.1891891891891893/38.0*x^38.0+45.0/2.0*x^2.0-1.2432432432432432/-36.0/x^36.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/23.2*x^29.0+18.0*x^2.0+1.0/20.43243243243243/x^27.0-1.0/26.105263157894736*x^32.0+19.5*x^2.0+1.0/23.25/x^30.0-1.0/29.02439024390244*x^35.0+21.0*x^2.0+1.0/26.093023255813954/x^33.0-1.0/31.954545454545453*x^38.0+22.5*x^2.0+1.0/28.956521739130437/x^36.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-24570.0*x^25.0+32190.0/x^31.0-33060.0*x^28.0+42240.0/x^34.0-43296.0*x^31.0+54180.0/x^37.0-55440.0*x^34.0+68172.0/x^40.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-24570.0*25.0*x^24.0+32190.0*-31.0/x^32.0-33060.0*28.0*x^27.0+42240.0*-34.0/x^35.0-43296.0*31.0*x^30.0+54180.0*-37.0/x^38.0-55440.0*34.0*x^33.0+68172.0*-40.0/x^41.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-614250.0*x^24.0-997890.0/x^32.0-925680.0*x^27.0-1436160.0/x^35.0-1342176.0*x^30.0-2004660.0/x^38.0-1884960.0*x^33.0-2726880.0/x^41.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/23.2*x^29.0+18.0*x^2.0+1.0/20.43243243243243/x^27.0-1.0/26.105263157894736*x^32.0+19.5*x^2.0+1.0/23.25/x^30.0-1.0/29.02439024390244*x^35.0+21.0*x^2.0+1.0/26.093023255813954/x^33.0-1.0/31.954545454545453*x^38.0+22.5*x^2.0+1.0/28.956521739130437/x^36.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/23.2/30.0*x^30.0+18.0/3.0*x^3.0+1.0/20.43243243243243/-26.0/x^26.0-1.0/26.105263157894736/33.0*x^33.0+19.5/3.0*x^3.0+1.0/23.25/-29.0/x^29.0-1.0/29.02439024390244/36.0*x^36.0+21.0/3.0*x^3.0+1.0/26.093023255813954/-32.0/x^32.0-1.0/31.954545454545453/39.0*x^39.0+22.5/3.0*x^3.0+1.0/28.956521739130437/-35.0/x^35.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/696.0*x^30.0+6.0*x^3.0-1.0/531.2432432432432/x^26.0-1.0/861.4736842105262*x^33.0+6.5*x^3.0-1.0/674.25/x^29.0-1.0/1044.878048780488*x^36.0+7.0*x^3.0-1.0/834.9767441860465/x^32.0-1.0/1246.2272727272727*x^39.0+7.5*x^3.0-1.0/1013.4782608695652/x^35.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-614250.0*x^24.0-997890.0/x^32.0-925680.0*x^27.0-1436160.0/x^35.0-1342176.0*x^30.0-2004660.0/x^38.0-1884960.0*x^33.0-2726880.0/x^41.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-614250.0*24.0*x^23.0-997890.0*-32.0/x^33.0-925680.0*27.0*x^26.0-1436160.0*-35.0/x^36.0-1342176.0*30.0*x^29.0-2004660.0*-38.0/x^39.0-1884960.0*33.0*x^32.0-2726880.0*-41.0/x^42.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1.4742E7*x^23.0+3.193248E7/x^33.0-2.499336E7*x^26.0+5.02656E7/x^36.0-4.026528E7*x^29.0+7.617708E7/x^39.0-6.220368E7*x^32.0+1.1180208E8/x^42.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/696.0*x^30.0+6.0*x^3.0-1.0/531.2432432432432/x^26.0-1.0/861.4736842105262*x^33.0+6.5*x^3.0-1.0/674.25/x^29.0-1.0/1044.878048780488*x^36.0+7.0*x^3.0-1.0/834.9767441860465/x^32.0-1.0/1246.2272727272727*x^39.0+7.5*x^3.0-1.0/1013.4782608695652/x^35.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/696.0/31.0*x^31.0+6.0/4.0*x^4.0-1.0/531.2432432432432/-25.0/x^25.0-1.0/861.4736842105262/34.0*x^34.0+6.5/4.0*x^4.0-1.0/674.25/-28.0/x^28.0-1.0/1044.878048780488/37.0*x^37.0+7.0/4.0*x^4.0-1.0/834.9767441860465/-31.0/x^31.0-1.0/1246.2272727272727/40.0*x^40.0+7.5/4.0*x^4.0-1.0/1013.4782608695652/-34.0/x^34.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/21576.0*x^31.0+1.5*x^4.0+1.0/13281.08108108108/x^25.0-1.0/29290.105263157893*x^34.0+1.625*x^4.0+1.0/18879.0/x^28.0-1.0/38660.48780487805*x^37.0+1.75*x^4.0+1.0/25884.279069767443/x^31.0-1.0/49849.09090909091*x^40.0+1.875*x^4.0+1.0/34458.260869565216/x^34.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120507() {
 UsageCalculus.TestCase = 120507;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+36+37-38+39+40-41+42*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-34+43-44+45*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-37+46-47+48*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-40";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "36.0+37.0-38.0+39.0+40.0-41.0+42.0+43.0-44.0+45.0+46.0-47.0+48.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+37.0*0.0-38.0*0.0+39.0*0.0+40.0*0.0-41.0*0.0+42.0*0.0+43.0*0.0-44.0*0.0+45.0*0.0+46.0*0.0-47.0*0.0+48.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "36.0+37.0-38.0+39.0+40.0-41.0+42.0+43.0-44.0+45.0+46.0-47.0+48.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "36.0*x+37.0*x-38.0*x+39.0*x+40.0*x-41.0*x+42.0*x+43.0*x-44.0*x+45.0*x+46.0*x-47.0*x+48.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "36.0*x+37.0*x-38.0*x+39.0*x+40.0*x-41.0*x+42.0*x+43.0*x-44.0*x+45.0*x+46.0*x-47.0*x+48.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "36.0*x+37.0*x-38.0*x+39.0*x+40.0*x-41.0*x+42.0*x+43.0*x-44.0*x+45.0*x+46.0*x-47.0*x+48.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "36.0/2.0*x^2.0+37.0/2.0*x^2.0-38.0/2.0*x^2.0+39.0/2.0*x^2.0+40.0/2.0*x^2.0-41.0/2.0*x^2.0+42.0/2.0*x^2.0+43.0/2.0*x^2.0-44.0/2.0*x^2.0+45.0/2.0*x^2.0+46.0/2.0*x^2.0-47.0/2.0*x^2.0+48.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "18.0*x^2.0+18.5*x^2.0-19.0*x^2.0+19.5*x^2.0+20.0*x^2.0-20.5*x^2.0+21.0*x^2.0+21.5*x^2.0-22.0*x^2.0+22.5*x^2.0+23.0*x^2.0-23.5*x^2.0+24.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "18.0*x^2.0+18.5*x^2.0-19.0*x^2.0+19.5*x^2.0+20.0*x^2.0-20.5*x^2.0+21.0*x^2.0+21.5*x^2.0-22.0*x^2.0+22.5*x^2.0+23.0*x^2.0-23.5*x^2.0+24.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "18.0/3.0*x^3.0+18.5/3.0*x^3.0-19.0/3.0*x^3.0+19.5/3.0*x^3.0+20.0/3.0*x^3.0-20.5/3.0*x^3.0+21.0/3.0*x^3.0+21.5/3.0*x^3.0-22.0/3.0*x^3.0+22.5/3.0*x^3.0+23.0/3.0*x^3.0-23.5/3.0*x^3.0+24.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "6.0*x^3.0+6.166666666666667*x^3.0-6.333333333333333*x^3.0+6.5*x^3.0+6.666666666666667*x^3.0-6.833333333333333*x^3.0+7.0*x^3.0+7.166666666666667*x^3.0-7.333333333333333*x^3.0+7.5*x^3.0+7.666666666666667*x^3.0-7.833333333333333*x^3.0+8.0*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "6.0*x^3.0+6.166666666666667*x^3.0-6.333333333333333*x^3.0+6.5*x^3.0+6.666666666666667*x^3.0-6.833333333333333*x^3.0+7.0*x^3.0+7.166666666666667*x^3.0-7.333333333333333*x^3.0+7.5*x^3.0+7.666666666666667*x^3.0-7.833333333333333*x^3.0+8.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "6.0/4.0*x^4.0+6.166666666666667/4.0*x^4.0-6.333333333333333/4.0*x^4.0+6.5/4.0*x^4.0+6.666666666666667/4.0*x^4.0-6.833333333333333/4.0*x^4.0+7.0/4.0*x^4.0+7.166666666666667/4.0*x^4.0-7.333333333333333/4.0*x^4.0+7.5/4.0*x^4.0+7.666666666666667/4.0*x^4.0-7.833333333333333/4.0*x^4.0+8.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.5*x^4.0+1.5416666666666667*x^4.0-1.5833333333333333*x^4.0+1.625*x^4.0+1.6666666666666667*x^4.0-1.7083333333333333*x^4.0+1.75*x^4.0+1.7916666666666667*x^4.0-1.8333333333333333*x^4.0+1.875*x^4.0+1.9166666666666667*x^4.0-1.9583333333333333*x^4.0+2.0*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120508() {
 UsageCalculus.TestCase = 120508;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+37/x^29-38*x^30+39+40/x^32-41*x^33+42*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-34+43/x^35-44*x^36+45*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-37+46/x^38-47*x^39+48*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-40+49/x^41-50*x^42";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "37.0/x^29.0-38.0*x^30.0+39.0+40.0/x^32.0-41.0*x^33.0+42.0+43.0/x^35.0-44.0*x^36.0+45.0+46.0/x^38.0-47.0*x^39.0+48.0+49.0/x^41.0-50.0*x^42.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "37.0*-29.0/x^30.0-38.0*30.0*x^29.0+39.0*0.0+40.0*-32.0/x^33.0-41.0*33.0*x^32.0+42.0*0.0+43.0*-35.0/x^36.0-44.0*36.0*x^35.0+45.0*0.0+46.0*-38.0/x^39.0-47.0*39.0*x^38.0+48.0*0.0+49.0*-41.0/x^42.0-50.0*42.0*x^41.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-1073.0/x^30.0-1140.0*x^29.0-1280.0/x^33.0-1353.0*x^32.0-1505.0/x^36.0-1584.0*x^35.0-1748.0/x^39.0-1833.0*x^38.0-2009.0/x^42.0-2100.0*x^41.0";
 UsageCalculus.EqnSolArrayMap3[1] = "37.0/x^29.0-38.0*x^30.0+39.0+40.0/x^32.0-41.0*x^33.0+42.0+43.0/x^35.0-44.0*x^36.0+45.0+46.0/x^38.0-47.0*x^39.0+48.0+49.0/x^41.0-50.0*x^42.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "37.0/-28.0/x^28.0-38.0/31.0*x^31.0+39.0*x+40.0/-31.0/x^31.0-41.0/34.0*x^34.0+42.0*x+43.0/-34.0/x^34.0-44.0/37.0*x^37.0+45.0*x+46.0/-37.0/x^37.0-47.0/40.0*x^40.0+48.0*x+49.0/-40.0/x^40.0-50.0/43.0*x^43.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.3214285714285714/x^28.0-1.2258064516129032*x^31.0+39.0*x-1.2903225806451613/x^31.0-1.2058823529411764*x^34.0+42.0*x-1.2647058823529411/x^34.0-1.1891891891891893*x^37.0+45.0*x-1.2432432432432432/x^37.0-1.175*x^40.0+48.0*x-1.225/x^40.0-1.1627906976744187*x^43.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-1073.0/x^30.0-1140.0*x^29.0-1280.0/x^33.0-1353.0*x^32.0-1505.0/x^36.0-1584.0*x^35.0-1748.0/x^39.0-1833.0*x^38.0-2009.0/x^42.0-2100.0*x^41.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-1073.0*-30.0/x^31.0-1140.0*29.0*x^28.0-1280.0*-33.0/x^34.0-1353.0*32.0*x^31.0-1505.0*-36.0/x^37.0-1584.0*35.0*x^34.0-1748.0*-39.0/x^40.0-1833.0*38.0*x^37.0-2009.0*-42.0/x^43.0-2100.0*41.0*x^40.0";
 UsageCalculus.EqnSolArrayMap2[2] = "32190.0/x^31.0-33060.0*x^28.0+42240.0/x^34.0-43296.0*x^31.0+54180.0/x^37.0-55440.0*x^34.0+68172.0/x^40.0-69654.0*x^37.0+84378.0/x^43.0-86100.0*x^40.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.3214285714285714/x^28.0-1.2258064516129032*x^31.0+39.0*x-1.2903225806451613/x^31.0-1.2058823529411764*x^34.0+42.0*x-1.2647058823529411/x^34.0-1.1891891891891893*x^37.0+45.0*x-1.2432432432432432/x^37.0-1.175*x^40.0+48.0*x-1.225/x^40.0-1.1627906976744187*x^43.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.3214285714285714/-27.0/x^27.0-1.2258064516129032/32.0*x^32.0+39.0/2.0*x^2.0-1.2903225806451613/-30.0/x^30.0-1.2058823529411764/35.0*x^35.0+42.0/2.0*x^2.0-1.2647058823529411/-33.0/x^33.0-1.1891891891891893/38.0*x^38.0+45.0/2.0*x^2.0-1.2432432432432432/-36.0/x^36.0-1.175/41.0*x^41.0+48.0/2.0*x^2.0-1.225/-39.0/x^39.0-1.1627906976744187/44.0*x^44.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/20.43243243243243/x^27.0-1.0/26.105263157894736*x^32.0+19.5*x^2.0+1.0/23.25/x^30.0-1.0/29.02439024390244*x^35.0+21.0*x^2.0+1.0/26.093023255813954/x^33.0-1.0/31.954545454545453*x^38.0+22.5*x^2.0+1.0/28.956521739130437/x^36.0-1.0/34.8936170212766*x^41.0+24.0*x^2.0+1.0/31.83673469387755/x^39.0-1.0/37.839999999999996*x^44.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "32190.0/x^31.0-33060.0*x^28.0+42240.0/x^34.0-43296.0*x^31.0+54180.0/x^37.0-55440.0*x^34.0+68172.0/x^40.0-69654.0*x^37.0+84378.0/x^43.0-86100.0*x^40.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "32190.0*-31.0/x^32.0-33060.0*28.0*x^27.0+42240.0*-34.0/x^35.0-43296.0*31.0*x^30.0+54180.0*-37.0/x^38.0-55440.0*34.0*x^33.0+68172.0*-40.0/x^41.0-69654.0*37.0*x^36.0+84378.0*-43.0/x^44.0-86100.0*40.0*x^39.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-997890.0/x^32.0-925680.0*x^27.0-1436160.0/x^35.0-1342176.0*x^30.0-2004660.0/x^38.0-1884960.0*x^33.0-2726880.0/x^41.0-2577198.0*x^36.0-3628254.0/x^44.0-3444000.0*x^39.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/20.43243243243243/x^27.0-1.0/26.105263157894736*x^32.0+19.5*x^2.0+1.0/23.25/x^30.0-1.0/29.02439024390244*x^35.0+21.0*x^2.0+1.0/26.093023255813954/x^33.0-1.0/31.954545454545453*x^38.0+22.5*x^2.0+1.0/28.956521739130437/x^36.0-1.0/34.8936170212766*x^41.0+24.0*x^2.0+1.0/31.83673469387755/x^39.0-1.0/37.839999999999996*x^44.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/20.43243243243243/-26.0/x^26.0-1.0/26.105263157894736/33.0*x^33.0+19.5/3.0*x^3.0+1.0/23.25/-29.0/x^29.0-1.0/29.02439024390244/36.0*x^36.0+21.0/3.0*x^3.0+1.0/26.093023255813954/-32.0/x^32.0-1.0/31.954545454545453/39.0*x^39.0+22.5/3.0*x^3.0+1.0/28.956521739130437/-35.0/x^35.0-1.0/34.8936170212766/42.0*x^42.0+24.0/3.0*x^3.0+1.0/31.83673469387755/-38.0/x^38.0-1.0/37.839999999999996/45.0*x^45.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/531.2432432432432/x^26.0-1.0/861.4736842105262*x^33.0+6.5*x^3.0-1.0/674.25/x^29.0-1.0/1044.878048780488*x^36.0+7.0*x^3.0-1.0/834.9767441860465/x^32.0-1.0/1246.2272727272727*x^39.0+7.5*x^3.0-1.0/1013.4782608695652/x^35.0-1.0/1465.531914893617*x^42.0+8.0*x^3.0-1.0/1209.7959183673468/x^38.0-1.0/1702.7999999999997*x^45.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-997890.0/x^32.0-925680.0*x^27.0-1436160.0/x^35.0-1342176.0*x^30.0-2004660.0/x^38.0-1884960.0*x^33.0-2726880.0/x^41.0-2577198.0*x^36.0-3628254.0/x^44.0-3444000.0*x^39.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-997890.0*-32.0/x^33.0-925680.0*27.0*x^26.0-1436160.0*-35.0/x^36.0-1342176.0*30.0*x^29.0-2004660.0*-38.0/x^39.0-1884960.0*33.0*x^32.0-2726880.0*-41.0/x^42.0-2577198.0*36.0*x^35.0-3628254.0*-44.0/x^45.0-3444000.0*39.0*x^38.0";
 UsageCalculus.EqnSolArrayMap2[4] = "3.193248E7/x^33.0-2.499336E7*x^26.0+5.02656E7/x^36.0-4.026528E7*x^29.0+7.617708E7/x^39.0-6.220368E7*x^32.0+1.1180208E8/x^42.0-9.2779128E7*x^35.0+1.59643176E8/x^45.0-1.34316E8*x^38.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/531.2432432432432/x^26.0-1.0/861.4736842105262*x^33.0+6.5*x^3.0-1.0/674.25/x^29.0-1.0/1044.878048780488*x^36.0+7.0*x^3.0-1.0/834.9767441860465/x^32.0-1.0/1246.2272727272727*x^39.0+7.5*x^3.0-1.0/1013.4782608695652/x^35.0-1.0/1465.531914893617*x^42.0+8.0*x^3.0-1.0/1209.7959183673468/x^38.0-1.0/1702.7999999999997*x^45.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/531.2432432432432/-25.0/x^25.0-1.0/861.4736842105262/34.0*x^34.0+6.5/4.0*x^4.0-1.0/674.25/-28.0/x^28.0-1.0/1044.878048780488/37.0*x^37.0+7.0/4.0*x^4.0-1.0/834.9767441860465/-31.0/x^31.0-1.0/1246.2272727272727/40.0*x^40.0+7.5/4.0*x^4.0-1.0/1013.4782608695652/-34.0/x^34.0-1.0/1465.531914893617/43.0*x^43.0+8.0/4.0*x^4.0-1.0/1209.7959183673468/-37.0/x^37.0-1.0/1702.7999999999997/46.0*x^46.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/13281.08108108108/x^25.0-1.0/29290.105263157893*x^34.0+1.625*x^4.0+1.0/18879.0/x^28.0-1.0/38660.48780487805*x^37.0+1.75*x^4.0+1.0/25884.279069767443/x^31.0-1.0/49849.09090909091*x^40.0+1.875*x^4.0+1.0/34458.260869565216/x^34.0-1.0/63017.872340425536*x^43.0+2.0*x^4.0+1.0/44762.44897959183/x^37.0-1.0/78328.79999999999*x^46.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120509() {
 UsageCalculus.TestCase = 120509;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-38*xy^30+39+40/xy^32-41*xy^33+42*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-34+43/xy^35-44*xy^36+45*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-37+46/xy^38-47*xy^39+48*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-40+49/xy^41-50*xy^42+51+52/xy^44";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-38.0*xy^30.0+39.0+40.0/xy^32.0-41.0*xy^33.0+42.0+43.0/xy^35.0-44.0*xy^36.0+45.0+46.0/xy^38.0-47.0*xy^39.0+48.0+49.0/xy^41.0-50.0*xy^42.0+51.0+52.0/xy^44.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-38.0*30.0*xy^29.0+39.0*0.0+40.0*-32.0/xy^33.0-41.0*33.0*xy^32.0+42.0*0.0+43.0*-35.0/xy^36.0-44.0*36.0*xy^35.0+45.0*0.0+46.0*-38.0/xy^39.0-47.0*39.0*xy^38.0+48.0*0.0+49.0*-41.0/xy^42.0-50.0*42.0*xy^41.0+51.0*0.0+52.0*-44.0/xy^45.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-1140.0*xy^29.0-1280.0/xy^33.0-1353.0*xy^32.0-1505.0/xy^36.0-1584.0*xy^35.0-1748.0/xy^39.0-1833.0*xy^38.0-2009.0/xy^42.0-2100.0*xy^41.0-2288.0/xy^45.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-38.0*xy^30.0+39.0+40.0/xy^32.0-41.0*xy^33.0+42.0+43.0/xy^35.0-44.0*xy^36.0+45.0+46.0/xy^38.0-47.0*xy^39.0+48.0+49.0/xy^41.0-50.0*xy^42.0+51.0+52.0/xy^44.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-38.0/31.0*xy^31.0+39.0*xy+40.0/-31.0/xy^31.0-41.0/34.0*xy^34.0+42.0*xy+43.0/-34.0/xy^34.0-44.0/37.0*xy^37.0+45.0*xy+46.0/-37.0/xy^37.0-47.0/40.0*xy^40.0+48.0*xy+49.0/-40.0/xy^40.0-50.0/43.0*xy^43.0+51.0*xy+52.0/-43.0/xy^43.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.2258064516129032*xy^31.0+39.0*xy-1.2903225806451613/xy^31.0-1.2058823529411764*xy^34.0+42.0*xy-1.2647058823529411/xy^34.0-1.1891891891891893*xy^37.0+45.0*xy-1.2432432432432432/xy^37.0-1.175*xy^40.0+48.0*xy-1.225/xy^40.0-1.1627906976744187*xy^43.0+51.0*xy-1.2093023255813953/xy^43.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-1140.0*xy^29.0-1280.0/xy^33.0-1353.0*xy^32.0-1505.0/xy^36.0-1584.0*xy^35.0-1748.0/xy^39.0-1833.0*xy^38.0-2009.0/xy^42.0-2100.0*xy^41.0-2288.0/xy^45.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-1140.0*29.0*xy^28.0-1280.0*-33.0/xy^34.0-1353.0*32.0*xy^31.0-1505.0*-36.0/xy^37.0-1584.0*35.0*xy^34.0-1748.0*-39.0/xy^40.0-1833.0*38.0*xy^37.0-2009.0*-42.0/xy^43.0-2100.0*41.0*xy^40.0-2288.0*-45.0/xy^46.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-33060.0*xy^28.0+42240.0/xy^34.0-43296.0*xy^31.0+54180.0/xy^37.0-55440.0*xy^34.0+68172.0/xy^40.0-69654.0*xy^37.0+84378.0/xy^43.0-86100.0*xy^40.0+102960.0/xy^46.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.2258064516129032*xy^31.0+39.0*xy-1.2903225806451613/xy^31.0-1.2058823529411764*xy^34.0+42.0*xy-1.2647058823529411/xy^34.0-1.1891891891891893*xy^37.0+45.0*xy-1.2432432432432432/xy^37.0-1.175*xy^40.0+48.0*xy-1.225/xy^40.0-1.1627906976744187*xy^43.0+51.0*xy-1.2093023255813953/xy^43.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.2258064516129032/32.0*xy^32.0+39.0/2.0*xy^2.0-1.2903225806451613/-30.0/xy^30.0-1.2058823529411764/35.0*xy^35.0+42.0/2.0*xy^2.0-1.2647058823529411/-33.0/xy^33.0-1.1891891891891893/38.0*xy^38.0+45.0/2.0*xy^2.0-1.2432432432432432/-36.0/xy^36.0-1.175/41.0*xy^41.0+48.0/2.0*xy^2.0-1.225/-39.0/xy^39.0-1.1627906976744187/44.0*xy^44.0+51.0/2.0*xy^2.0-1.2093023255813953/-42.0/xy^42.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/26.105263157894736*xy^32.0+19.5*xy^2.0+1.0/23.25/xy^30.0-1.0/29.02439024390244*xy^35.0+21.0*xy^2.0+1.0/26.093023255813954/xy^33.0-1.0/31.954545454545453*xy^38.0+22.5*xy^2.0+1.0/28.956521739130437/xy^36.0-1.0/34.8936170212766*xy^41.0+24.0*xy^2.0+1.0/31.83673469387755/xy^39.0-1.0/37.839999999999996*xy^44.0+25.5*xy^2.0+1.0/34.73076923076923/xy^42.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-33060.0*xy^28.0+42240.0/xy^34.0-43296.0*xy^31.0+54180.0/xy^37.0-55440.0*xy^34.0+68172.0/xy^40.0-69654.0*xy^37.0+84378.0/xy^43.0-86100.0*xy^40.0+102960.0/xy^46.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-33060.0*28.0*xy^27.0+42240.0*-34.0/xy^35.0-43296.0*31.0*xy^30.0+54180.0*-37.0/xy^38.0-55440.0*34.0*xy^33.0+68172.0*-40.0/xy^41.0-69654.0*37.0*xy^36.0+84378.0*-43.0/xy^44.0-86100.0*40.0*xy^39.0+102960.0*-46.0/xy^47.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-925680.0*xy^27.0-1436160.0/xy^35.0-1342176.0*xy^30.0-2004660.0/xy^38.0-1884960.0*xy^33.0-2726880.0/xy^41.0-2577198.0*xy^36.0-3628254.0/xy^44.0-3444000.0*xy^39.0-4736160.0/xy^47.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/26.105263157894736*xy^32.0+19.5*xy^2.0+1.0/23.25/xy^30.0-1.0/29.02439024390244*xy^35.0+21.0*xy^2.0+1.0/26.093023255813954/xy^33.0-1.0/31.954545454545453*xy^38.0+22.5*xy^2.0+1.0/28.956521739130437/xy^36.0-1.0/34.8936170212766*xy^41.0+24.0*xy^2.0+1.0/31.83673469387755/xy^39.0-1.0/37.839999999999996*xy^44.0+25.5*xy^2.0+1.0/34.73076923076923/xy^42.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/26.105263157894736/33.0*xy^33.0+19.5/3.0*xy^3.0+1.0/23.25/-29.0/xy^29.0-1.0/29.02439024390244/36.0*xy^36.0+21.0/3.0*xy^3.0+1.0/26.093023255813954/-32.0/xy^32.0-1.0/31.954545454545453/39.0*xy^39.0+22.5/3.0*xy^3.0+1.0/28.956521739130437/-35.0/xy^35.0-1.0/34.8936170212766/42.0*xy^42.0+24.0/3.0*xy^3.0+1.0/31.83673469387755/-38.0/xy^38.0-1.0/37.839999999999996/45.0*xy^45.0+25.5/3.0*xy^3.0+1.0/34.73076923076923/-41.0/xy^41.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/861.4736842105262*xy^33.0+6.5*xy^3.0-1.0/674.25/xy^29.0-1.0/1044.878048780488*xy^36.0+7.0*xy^3.0-1.0/834.9767441860465/xy^32.0-1.0/1246.2272727272727*xy^39.0+7.5*xy^3.0-1.0/1013.4782608695652/xy^35.0-1.0/1465.531914893617*xy^42.0+8.0*xy^3.0-1.0/1209.7959183673468/xy^38.0-1.0/1702.7999999999997*xy^45.0+8.5*xy^3.0-1.0/1423.9615384615386/xy^41.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-925680.0*xy^27.0-1436160.0/xy^35.0-1342176.0*xy^30.0-2004660.0/xy^38.0-1884960.0*xy^33.0-2726880.0/xy^41.0-2577198.0*xy^36.0-3628254.0/xy^44.0-3444000.0*xy^39.0-4736160.0/xy^47.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-925680.0*27.0*xy^26.0-1436160.0*-35.0/xy^36.0-1342176.0*30.0*xy^29.0-2004660.0*-38.0/xy^39.0-1884960.0*33.0*xy^32.0-2726880.0*-41.0/xy^42.0-2577198.0*36.0*xy^35.0-3628254.0*-44.0/xy^45.0-3444000.0*39.0*xy^38.0-4736160.0*-47.0/xy^48.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-2.499336E7*xy^26.0+5.02656E7/xy^36.0-4.026528E7*xy^29.0+7.617708E7/xy^39.0-6.220368E7*xy^32.0+1.1180208E8/xy^42.0-9.2779128E7*xy^35.0+1.59643176E8/xy^45.0-1.34316E8*xy^38.0+2.2259952E8/xy^48.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/861.4736842105262*xy^33.0+6.5*xy^3.0-1.0/674.25/xy^29.0-1.0/1044.878048780488*xy^36.0+7.0*xy^3.0-1.0/834.9767441860465/xy^32.0-1.0/1246.2272727272727*xy^39.0+7.5*xy^3.0-1.0/1013.4782608695652/xy^35.0-1.0/1465.531914893617*xy^42.0+8.0*xy^3.0-1.0/1209.7959183673468/xy^38.0-1.0/1702.7999999999997*xy^45.0+8.5*xy^3.0-1.0/1423.9615384615386/xy^41.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/861.4736842105262/34.0*xy^34.0+6.5/4.0*xy^4.0-1.0/674.25/-28.0/xy^28.0-1.0/1044.878048780488/37.0*xy^37.0+7.0/4.0*xy^4.0-1.0/834.9767441860465/-31.0/xy^31.0-1.0/1246.2272727272727/40.0*xy^40.0+7.5/4.0*xy^4.0-1.0/1013.4782608695652/-34.0/xy^34.0-1.0/1465.531914893617/43.0*xy^43.0+8.0/4.0*xy^4.0-1.0/1209.7959183673468/-37.0/xy^37.0-1.0/1702.7999999999997/46.0*xy^46.0+8.5/4.0*xy^4.0-1.0/1423.9615384615386/-40.0/xy^40.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/29290.105263157893*xy^34.0+1.625*xy^4.0+1.0/18879.0/xy^28.0-1.0/38660.48780487805*xy^37.0+1.75*xy^4.0+1.0/25884.279069767443/xy^31.0-1.0/49849.09090909091*xy^40.0+1.875*xy^4.0+1.0/34458.260869565216/xy^34.0-1.0/63017.872340425536*xy^43.0+2.0*xy^4.0+1.0/44762.44897959183/xy^37.0-1.0/78328.79999999999*xy^46.0+2.125*xy^4.0+1.0/56958.461538461546/xy^40.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120510() {
 UsageCalculus.TestCase = 120510;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+39+40/x^32-41*x^33+42*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-34+43/x^35-44*x^36+45*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-37+46/x^38-47*x^39+48*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-40+49/x^41-50*x^42+51+52/x^44-53*x^45+54";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "39.0+40.0/x^32.0-41.0*x^33.0+42.0+43.0/x^35.0-44.0*x^36.0+45.0+46.0/x^38.0-47.0*x^39.0+48.0+49.0/x^41.0-50.0*x^42.0+51.0+52.0/x^44.0-53.0*x^45.0+54.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+40.0*-32.0/x^33.0-41.0*33.0*x^32.0+42.0*0.0+43.0*-35.0/x^36.0-44.0*36.0*x^35.0+45.0*0.0+46.0*-38.0/x^39.0-47.0*39.0*x^38.0+48.0*0.0+49.0*-41.0/x^42.0-50.0*42.0*x^41.0+51.0*0.0+52.0*-44.0/x^45.0-53.0*45.0*x^44.0+54.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-1280.0/x^33.0-1353.0*x^32.0-1505.0/x^36.0-1584.0*x^35.0-1748.0/x^39.0-1833.0*x^38.0-2009.0/x^42.0-2100.0*x^41.0-2288.0/x^45.0-2385.0*x^44.0";
 UsageCalculus.EqnSolArrayMap3[1] = "39.0+40.0/x^32.0-41.0*x^33.0+42.0+43.0/x^35.0-44.0*x^36.0+45.0+46.0/x^38.0-47.0*x^39.0+48.0+49.0/x^41.0-50.0*x^42.0+51.0+52.0/x^44.0-53.0*x^45.0+54.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "39.0*x+40.0/-31.0/x^31.0-41.0/34.0*x^34.0+42.0*x+43.0/-34.0/x^34.0-44.0/37.0*x^37.0+45.0*x+46.0/-37.0/x^37.0-47.0/40.0*x^40.0+48.0*x+49.0/-40.0/x^40.0-50.0/43.0*x^43.0+51.0*x+52.0/-43.0/x^43.0-53.0/46.0*x^46.0+54.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "39.0*x-1.2903225806451613/x^31.0-1.2058823529411764*x^34.0+42.0*x-1.2647058823529411/x^34.0-1.1891891891891893*x^37.0+45.0*x-1.2432432432432432/x^37.0-1.175*x^40.0+48.0*x-1.225/x^40.0-1.1627906976744187*x^43.0+51.0*x-1.2093023255813953/x^43.0-1.1521739130434783*x^46.0+54.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-1280.0/x^33.0-1353.0*x^32.0-1505.0/x^36.0-1584.0*x^35.0-1748.0/x^39.0-1833.0*x^38.0-2009.0/x^42.0-2100.0*x^41.0-2288.0/x^45.0-2385.0*x^44.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-1280.0*-33.0/x^34.0-1353.0*32.0*x^31.0-1505.0*-36.0/x^37.0-1584.0*35.0*x^34.0-1748.0*-39.0/x^40.0-1833.0*38.0*x^37.0-2009.0*-42.0/x^43.0-2100.0*41.0*x^40.0-2288.0*-45.0/x^46.0-2385.0*44.0*x^43.0";
 UsageCalculus.EqnSolArrayMap2[2] = "42240.0/x^34.0-43296.0*x^31.0+54180.0/x^37.0-55440.0*x^34.0+68172.0/x^40.0-69654.0*x^37.0+84378.0/x^43.0-86100.0*x^40.0+102960.0/x^46.0-104940.0*x^43.0";
 UsageCalculus.EqnSolArrayMap3[2] = "39.0*x-1.2903225806451613/x^31.0-1.2058823529411764*x^34.0+42.0*x-1.2647058823529411/x^34.0-1.1891891891891893*x^37.0+45.0*x-1.2432432432432432/x^37.0-1.175*x^40.0+48.0*x-1.225/x^40.0-1.1627906976744187*x^43.0+51.0*x-1.2093023255813953/x^43.0-1.1521739130434783*x^46.0+54.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "39.0/2.0*x^2.0-1.2903225806451613/-30.0/x^30.0-1.2058823529411764/35.0*x^35.0+42.0/2.0*x^2.0-1.2647058823529411/-33.0/x^33.0-1.1891891891891893/38.0*x^38.0+45.0/2.0*x^2.0-1.2432432432432432/-36.0/x^36.0-1.175/41.0*x^41.0+48.0/2.0*x^2.0-1.225/-39.0/x^39.0-1.1627906976744187/44.0*x^44.0+51.0/2.0*x^2.0-1.2093023255813953/-42.0/x^42.0-1.1521739130434783/47.0*x^47.0+54.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "19.5*x^2.0+1.0/23.25/x^30.0-1.0/29.02439024390244*x^35.0+21.0*x^2.0+1.0/26.093023255813954/x^33.0-1.0/31.954545454545453*x^38.0+22.5*x^2.0+1.0/28.956521739130437/x^36.0-1.0/34.8936170212766*x^41.0+24.0*x^2.0+1.0/31.83673469387755/x^39.0-1.0/37.839999999999996*x^44.0+25.5*x^2.0+1.0/34.73076923076923/x^42.0-1.0/40.79245283018868*x^47.0+27.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "42240.0/x^34.0-43296.0*x^31.0+54180.0/x^37.0-55440.0*x^34.0+68172.0/x^40.0-69654.0*x^37.0+84378.0/x^43.0-86100.0*x^40.0+102960.0/x^46.0-104940.0*x^43.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "42240.0*-34.0/x^35.0-43296.0*31.0*x^30.0+54180.0*-37.0/x^38.0-55440.0*34.0*x^33.0+68172.0*-40.0/x^41.0-69654.0*37.0*x^36.0+84378.0*-43.0/x^44.0-86100.0*40.0*x^39.0+102960.0*-46.0/x^47.0-104940.0*43.0*x^42.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-1436160.0/x^35.0-1342176.0*x^30.0-2004660.0/x^38.0-1884960.0*x^33.0-2726880.0/x^41.0-2577198.0*x^36.0-3628254.0/x^44.0-3444000.0*x^39.0-4736160.0/x^47.0-4512420.0*x^42.0";
 UsageCalculus.EqnSolArrayMap3[3] = "19.5*x^2.0+1.0/23.25/x^30.0-1.0/29.02439024390244*x^35.0+21.0*x^2.0+1.0/26.093023255813954/x^33.0-1.0/31.954545454545453*x^38.0+22.5*x^2.0+1.0/28.956521739130437/x^36.0-1.0/34.8936170212766*x^41.0+24.0*x^2.0+1.0/31.83673469387755/x^39.0-1.0/37.839999999999996*x^44.0+25.5*x^2.0+1.0/34.73076923076923/x^42.0-1.0/40.79245283018868*x^47.0+27.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "19.5/3.0*x^3.0+1.0/23.25/-29.0/x^29.0-1.0/29.02439024390244/36.0*x^36.0+21.0/3.0*x^3.0+1.0/26.093023255813954/-32.0/x^32.0-1.0/31.954545454545453/39.0*x^39.0+22.5/3.0*x^3.0+1.0/28.956521739130437/-35.0/x^35.0-1.0/34.8936170212766/42.0*x^42.0+24.0/3.0*x^3.0+1.0/31.83673469387755/-38.0/x^38.0-1.0/37.839999999999996/45.0*x^45.0+25.5/3.0*x^3.0+1.0/34.73076923076923/-41.0/x^41.0-1.0/40.79245283018868/48.0*x^48.0+27.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "6.5*x^3.0-1.0/674.25/x^29.0-1.0/1044.878048780488*x^36.0+7.0*x^3.0-1.0/834.9767441860465/x^32.0-1.0/1246.2272727272727*x^39.0+7.5*x^3.0-1.0/1013.4782608695652/x^35.0-1.0/1465.531914893617*x^42.0+8.0*x^3.0-1.0/1209.7959183673468/x^38.0-1.0/1702.7999999999997*x^45.0+8.5*x^3.0-1.0/1423.9615384615386/x^41.0-1.0/1958.0377358490566*x^48.0+9.0*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-1436160.0/x^35.0-1342176.0*x^30.0-2004660.0/x^38.0-1884960.0*x^33.0-2726880.0/x^41.0-2577198.0*x^36.0-3628254.0/x^44.0-3444000.0*x^39.0-4736160.0/x^47.0-4512420.0*x^42.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-1436160.0*-35.0/x^36.0-1342176.0*30.0*x^29.0-2004660.0*-38.0/x^39.0-1884960.0*33.0*x^32.0-2726880.0*-41.0/x^42.0-2577198.0*36.0*x^35.0-3628254.0*-44.0/x^45.0-3444000.0*39.0*x^38.0-4736160.0*-47.0/x^48.0-4512420.0*42.0*x^41.0";
 UsageCalculus.EqnSolArrayMap2[4] = "5.02656E7/x^36.0-4.026528E7*x^29.0+7.617708E7/x^39.0-6.220368E7*x^32.0+1.1180208E8/x^42.0-9.2779128E7*x^35.0+1.59643176E8/x^45.0-1.34316E8*x^38.0+2.2259952E8/x^48.0-1.8952164E8*x^41.0";
 UsageCalculus.EqnSolArrayMap3[4] = "6.5*x^3.0-1.0/674.25/x^29.0-1.0/1044.878048780488*x^36.0+7.0*x^3.0-1.0/834.9767441860465/x^32.0-1.0/1246.2272727272727*x^39.0+7.5*x^3.0-1.0/1013.4782608695652/x^35.0-1.0/1465.531914893617*x^42.0+8.0*x^3.0-1.0/1209.7959183673468/x^38.0-1.0/1702.7999999999997*x^45.0+8.5*x^3.0-1.0/1423.9615384615386/x^41.0-1.0/1958.0377358490566*x^48.0+9.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "6.5/4.0*x^4.0-1.0/674.25/-28.0/x^28.0-1.0/1044.878048780488/37.0*x^37.0+7.0/4.0*x^4.0-1.0/834.9767441860465/-31.0/x^31.0-1.0/1246.2272727272727/40.0*x^40.0+7.5/4.0*x^4.0-1.0/1013.4782608695652/-34.0/x^34.0-1.0/1465.531914893617/43.0*x^43.0+8.0/4.0*x^4.0-1.0/1209.7959183673468/-37.0/x^37.0-1.0/1702.7999999999997/46.0*x^46.0+8.5/4.0*x^4.0-1.0/1423.9615384615386/-40.0/x^40.0-1.0/1958.0377358490566/49.0*x^49.0+9.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.625*x^4.0+1.0/18879.0/x^28.0-1.0/38660.48780487805*x^37.0+1.75*x^4.0+1.0/25884.279069767443/x^31.0-1.0/49849.09090909091*x^40.0+1.875*x^4.0+1.0/34458.260869565216/x^34.0-1.0/63017.872340425536*x^43.0+2.0*x^4.0+1.0/44762.44897959183/x^37.0-1.0/78328.79999999999*x^46.0+2.125*x^4.0+1.0/56958.461538461546/x^40.0-1.0/95943.84905660378*x^49.0+2.25*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120511() {
 UsageCalculus.TestCase = 120511;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+40/xyzxy^32-41*xyzxy^33+42*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-34+43/xyzxy^35-44*xyzxy^36+45*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-37+46/xyzxy^38-47*xyzxy^39+48*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-40+49/xyzxy^41-50*xyzxy^42+51+52/xyzxy^44-53*xyzxy^45+54+55/xyzxy^47-56*xyzxy^48";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyzxy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "40.0/xyzxy^32.0-41.0*xyzxy^33.0+42.0+43.0/xyzxy^35.0-44.0*xyzxy^36.0+45.0+46.0/xyzxy^38.0-47.0*xyzxy^39.0+48.0+49.0/xyzxy^41.0-50.0*xyzxy^42.0+51.0+52.0/xyzxy^44.0-53.0*xyzxy^45.0+54.0+55.0/xyzxy^47.0-56.0*xyzxy^48.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "40.0*-32.0/xyzxy^33.0-41.0*33.0*xyzxy^32.0+42.0*0.0+43.0*-35.0/xyzxy^36.0-44.0*36.0*xyzxy^35.0+45.0*0.0+46.0*-38.0/xyzxy^39.0-47.0*39.0*xyzxy^38.0+48.0*0.0+49.0*-41.0/xyzxy^42.0-50.0*42.0*xyzxy^41.0+51.0*0.0+52.0*-44.0/xyzxy^45.0-53.0*45.0*xyzxy^44.0+54.0*0.0+55.0*-47.0/xyzxy^48.0-56.0*48.0*xyzxy^47.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-1280.0/xyzxy^33.0-1353.0*xyzxy^32.0-1505.0/xyzxy^36.0-1584.0*xyzxy^35.0-1748.0/xyzxy^39.0-1833.0*xyzxy^38.0-2009.0/xyzxy^42.0-2100.0*xyzxy^41.0-2288.0/xyzxy^45.0-2385.0*xyzxy^44.0-2585.0/xyzxy^48.0-2688.0*xyzxy^47.0";
 UsageCalculus.EqnSolArrayMap3[1] = "40.0/xyzxy^32.0-41.0*xyzxy^33.0+42.0+43.0/xyzxy^35.0-44.0*xyzxy^36.0+45.0+46.0/xyzxy^38.0-47.0*xyzxy^39.0+48.0+49.0/xyzxy^41.0-50.0*xyzxy^42.0+51.0+52.0/xyzxy^44.0-53.0*xyzxy^45.0+54.0+55.0/xyzxy^47.0-56.0*xyzxy^48.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "40.0/-31.0/xyzxy^31.0-41.0/34.0*xyzxy^34.0+42.0*xyzxy+43.0/-34.0/xyzxy^34.0-44.0/37.0*xyzxy^37.0+45.0*xyzxy+46.0/-37.0/xyzxy^37.0-47.0/40.0*xyzxy^40.0+48.0*xyzxy+49.0/-40.0/xyzxy^40.0-50.0/43.0*xyzxy^43.0+51.0*xyzxy+52.0/-43.0/xyzxy^43.0-53.0/46.0*xyzxy^46.0+54.0*xyzxy+55.0/-46.0/xyzxy^46.0-56.0/49.0*xyzxy^49.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.2903225806451613/xyzxy^31.0-1.2058823529411764*xyzxy^34.0+42.0*xyzxy-1.2647058823529411/xyzxy^34.0-1.1891891891891893*xyzxy^37.0+45.0*xyzxy-1.2432432432432432/xyzxy^37.0-1.175*xyzxy^40.0+48.0*xyzxy-1.225/xyzxy^40.0-1.1627906976744187*xyzxy^43.0+51.0*xyzxy-1.2093023255813953/xyzxy^43.0-1.1521739130434783*xyzxy^46.0+54.0*xyzxy-1.1956521739130435/xyzxy^46.0-1.1428571428571428*xyzxy^49.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-1280.0/xyzxy^33.0-1353.0*xyzxy^32.0-1505.0/xyzxy^36.0-1584.0*xyzxy^35.0-1748.0/xyzxy^39.0-1833.0*xyzxy^38.0-2009.0/xyzxy^42.0-2100.0*xyzxy^41.0-2288.0/xyzxy^45.0-2385.0*xyzxy^44.0-2585.0/xyzxy^48.0-2688.0*xyzxy^47.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-1280.0*-33.0/xyzxy^34.0-1353.0*32.0*xyzxy^31.0-1505.0*-36.0/xyzxy^37.0-1584.0*35.0*xyzxy^34.0-1748.0*-39.0/xyzxy^40.0-1833.0*38.0*xyzxy^37.0-2009.0*-42.0/xyzxy^43.0-2100.0*41.0*xyzxy^40.0-2288.0*-45.0/xyzxy^46.0-2385.0*44.0*xyzxy^43.0-2585.0*-48.0/xyzxy^49.0-2688.0*47.0*xyzxy^46.0";
 UsageCalculus.EqnSolArrayMap2[2] = "42240.0/xyzxy^34.0-43296.0*xyzxy^31.0+54180.0/xyzxy^37.0-55440.0*xyzxy^34.0+68172.0/xyzxy^40.0-69654.0*xyzxy^37.0+84378.0/xyzxy^43.0-86100.0*xyzxy^40.0+102960.0/xyzxy^46.0-104940.0*xyzxy^43.0+124080.0/xyzxy^49.0-126336.0*xyzxy^46.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.2903225806451613/xyzxy^31.0-1.2058823529411764*xyzxy^34.0+42.0*xyzxy-1.2647058823529411/xyzxy^34.0-1.1891891891891893*xyzxy^37.0+45.0*xyzxy-1.2432432432432432/xyzxy^37.0-1.175*xyzxy^40.0+48.0*xyzxy-1.225/xyzxy^40.0-1.1627906976744187*xyzxy^43.0+51.0*xyzxy-1.2093023255813953/xyzxy^43.0-1.1521739130434783*xyzxy^46.0+54.0*xyzxy-1.1956521739130435/xyzxy^46.0-1.1428571428571428*xyzxy^49.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.2903225806451613/-30.0/xyzxy^30.0-1.2058823529411764/35.0*xyzxy^35.0+42.0/2.0*xyzxy^2.0-1.2647058823529411/-33.0/xyzxy^33.0-1.1891891891891893/38.0*xyzxy^38.0+45.0/2.0*xyzxy^2.0-1.2432432432432432/-36.0/xyzxy^36.0-1.175/41.0*xyzxy^41.0+48.0/2.0*xyzxy^2.0-1.225/-39.0/xyzxy^39.0-1.1627906976744187/44.0*xyzxy^44.0+51.0/2.0*xyzxy^2.0-1.2093023255813953/-42.0/xyzxy^42.0-1.1521739130434783/47.0*xyzxy^47.0+54.0/2.0*xyzxy^2.0-1.1956521739130435/-45.0/xyzxy^45.0-1.1428571428571428/50.0*xyzxy^50.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/23.25/xyzxy^30.0-1.0/29.02439024390244*xyzxy^35.0+21.0*xyzxy^2.0+1.0/26.093023255813954/xyzxy^33.0-1.0/31.954545454545453*xyzxy^38.0+22.5*xyzxy^2.0+1.0/28.956521739130437/xyzxy^36.0-1.0/34.8936170212766*xyzxy^41.0+24.0*xyzxy^2.0+1.0/31.83673469387755/xyzxy^39.0-1.0/37.839999999999996*xyzxy^44.0+25.5*xyzxy^2.0+1.0/34.73076923076923/xyzxy^42.0-1.0/40.79245283018868*xyzxy^47.0+27.0*xyzxy^2.0+1.0/37.63636363636364/xyzxy^45.0-1.0/43.75*xyzxy^50.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "42240.0/xyzxy^34.0-43296.0*xyzxy^31.0+54180.0/xyzxy^37.0-55440.0*xyzxy^34.0+68172.0/xyzxy^40.0-69654.0*xyzxy^37.0+84378.0/xyzxy^43.0-86100.0*xyzxy^40.0+102960.0/xyzxy^46.0-104940.0*xyzxy^43.0+124080.0/xyzxy^49.0-126336.0*xyzxy^46.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "42240.0*-34.0/xyzxy^35.0-43296.0*31.0*xyzxy^30.0+54180.0*-37.0/xyzxy^38.0-55440.0*34.0*xyzxy^33.0+68172.0*-40.0/xyzxy^41.0-69654.0*37.0*xyzxy^36.0+84378.0*-43.0/xyzxy^44.0-86100.0*40.0*xyzxy^39.0+102960.0*-46.0/xyzxy^47.0-104940.0*43.0*xyzxy^42.0+124080.0*-49.0/xyzxy^50.0-126336.0*46.0*xyzxy^45.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-1436160.0/xyzxy^35.0-1342176.0*xyzxy^30.0-2004660.0/xyzxy^38.0-1884960.0*xyzxy^33.0-2726880.0/xyzxy^41.0-2577198.0*xyzxy^36.0-3628254.0/xyzxy^44.0-3444000.0*xyzxy^39.0-4736160.0/xyzxy^47.0-4512420.0*xyzxy^42.0-6079920.0/xyzxy^50.0-5811456.0*xyzxy^45.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/23.25/xyzxy^30.0-1.0/29.02439024390244*xyzxy^35.0+21.0*xyzxy^2.0+1.0/26.093023255813954/xyzxy^33.0-1.0/31.954545454545453*xyzxy^38.0+22.5*xyzxy^2.0+1.0/28.956521739130437/xyzxy^36.0-1.0/34.8936170212766*xyzxy^41.0+24.0*xyzxy^2.0+1.0/31.83673469387755/xyzxy^39.0-1.0/37.839999999999996*xyzxy^44.0+25.5*xyzxy^2.0+1.0/34.73076923076923/xyzxy^42.0-1.0/40.79245283018868*xyzxy^47.0+27.0*xyzxy^2.0+1.0/37.63636363636364/xyzxy^45.0-1.0/43.75*xyzxy^50.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/23.25/-29.0/xyzxy^29.0-1.0/29.02439024390244/36.0*xyzxy^36.0+21.0/3.0*xyzxy^3.0+1.0/26.093023255813954/-32.0/xyzxy^32.0-1.0/31.954545454545453/39.0*xyzxy^39.0+22.5/3.0*xyzxy^3.0+1.0/28.956521739130437/-35.0/xyzxy^35.0-1.0/34.8936170212766/42.0*xyzxy^42.0+24.0/3.0*xyzxy^3.0+1.0/31.83673469387755/-38.0/xyzxy^38.0-1.0/37.839999999999996/45.0*xyzxy^45.0+25.5/3.0*xyzxy^3.0+1.0/34.73076923076923/-41.0/xyzxy^41.0-1.0/40.79245283018868/48.0*xyzxy^48.0+27.0/3.0*xyzxy^3.0+1.0/37.63636363636364/-44.0/xyzxy^44.0-1.0/43.75/51.0*xyzxy^51.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/674.25/xyzxy^29.0-1.0/1044.878048780488*xyzxy^36.0+7.0*xyzxy^3.0-1.0/834.9767441860465/xyzxy^32.0-1.0/1246.2272727272727*xyzxy^39.0+7.5*xyzxy^3.0-1.0/1013.4782608695652/xyzxy^35.0-1.0/1465.531914893617*xyzxy^42.0+8.0*xyzxy^3.0-1.0/1209.7959183673468/xyzxy^38.0-1.0/1702.7999999999997*xyzxy^45.0+8.5*xyzxy^3.0-1.0/1423.9615384615386/xyzxy^41.0-1.0/1958.0377358490566*xyzxy^48.0+9.0*xyzxy^3.0-1.0/1656.0000000000002/xyzxy^44.0-1.0/2231.25*xyzxy^51.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-1436160.0/xyzxy^35.0-1342176.0*xyzxy^30.0-2004660.0/xyzxy^38.0-1884960.0*xyzxy^33.0-2726880.0/xyzxy^41.0-2577198.0*xyzxy^36.0-3628254.0/xyzxy^44.0-3444000.0*xyzxy^39.0-4736160.0/xyzxy^47.0-4512420.0*xyzxy^42.0-6079920.0/xyzxy^50.0-5811456.0*xyzxy^45.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-1436160.0*-35.0/xyzxy^36.0-1342176.0*30.0*xyzxy^29.0-2004660.0*-38.0/xyzxy^39.0-1884960.0*33.0*xyzxy^32.0-2726880.0*-41.0/xyzxy^42.0-2577198.0*36.0*xyzxy^35.0-3628254.0*-44.0/xyzxy^45.0-3444000.0*39.0*xyzxy^38.0-4736160.0*-47.0/xyzxy^48.0-4512420.0*42.0*xyzxy^41.0-6079920.0*-50.0/xyzxy^51.0-5811456.0*45.0*xyzxy^44.0";
 UsageCalculus.EqnSolArrayMap2[4] = "5.02656E7/xyzxy^36.0-4.026528E7*xyzxy^29.0+7.617708E7/xyzxy^39.0-6.220368E7*xyzxy^32.0+1.1180208E8/xyzxy^42.0-9.2779128E7*xyzxy^35.0+1.59643176E8/xyzxy^45.0-1.34316E8*xyzxy^38.0+2.2259952E8/xyzxy^48.0-1.8952164E8*xyzxy^41.0+3.03996E8/xyzxy^51.0-2.6151552E8*xyzxy^44.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/674.25/xyzxy^29.0-1.0/1044.878048780488*xyzxy^36.0+7.0*xyzxy^3.0-1.0/834.9767441860465/xyzxy^32.0-1.0/1246.2272727272727*xyzxy^39.0+7.5*xyzxy^3.0-1.0/1013.4782608695652/xyzxy^35.0-1.0/1465.531914893617*xyzxy^42.0+8.0*xyzxy^3.0-1.0/1209.7959183673468/xyzxy^38.0-1.0/1702.7999999999997*xyzxy^45.0+8.5*xyzxy^3.0-1.0/1423.9615384615386/xyzxy^41.0-1.0/1958.0377358490566*xyzxy^48.0+9.0*xyzxy^3.0-1.0/1656.0000000000002/xyzxy^44.0-1.0/2231.25*xyzxy^51.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/674.25/-28.0/xyzxy^28.0-1.0/1044.878048780488/37.0*xyzxy^37.0+7.0/4.0*xyzxy^4.0-1.0/834.9767441860465/-31.0/xyzxy^31.0-1.0/1246.2272727272727/40.0*xyzxy^40.0+7.5/4.0*xyzxy^4.0-1.0/1013.4782608695652/-34.0/xyzxy^34.0-1.0/1465.531914893617/43.0*xyzxy^43.0+8.0/4.0*xyzxy^4.0-1.0/1209.7959183673468/-37.0/xyzxy^37.0-1.0/1702.7999999999997/46.0*xyzxy^46.0+8.5/4.0*xyzxy^4.0-1.0/1423.9615384615386/-40.0/xyzxy^40.0-1.0/1958.0377358490566/49.0*xyzxy^49.0+9.0/4.0*xyzxy^4.0-1.0/1656.0000000000002/-43.0/xyzxy^43.0-1.0/2231.25/52.0*xyzxy^52.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/18879.0/xyzxy^28.0-1.0/38660.48780487805*xyzxy^37.0+1.75*xyzxy^4.0+1.0/25884.279069767443/xyzxy^31.0-1.0/49849.09090909091*xyzxy^40.0+1.875*xyzxy^4.0+1.0/34458.260869565216/xyzxy^34.0-1.0/63017.872340425536*xyzxy^43.0+2.0*xyzxy^4.0+1.0/44762.44897959183/xyzxy^37.0-1.0/78328.79999999999*xyzxy^46.0+2.125*xyzxy^4.0+1.0/56958.461538461546/xyzxy^40.0-1.0/95943.84905660378*xyzxy^49.0+2.25*xyzxy^4.0+1.0/71208.00000000001/xyzxy^43.0-1.0/116025.0*xyzxy^52.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120512() {
 UsageCalculus.TestCase = 120512;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-41*x^33+42*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-34+43/x^35-44*x^36+45*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-37+46/x^38-47*x^39+48*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-40+49/x^41-50*x^42+51+52/x^44-53*x^45+54+55/x^47-56*x^48+57*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-49+58/x^50";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-41.0*x^33.0+42.0+43.0/x^35.0-44.0*x^36.0+45.0+46.0/x^38.0-47.0*x^39.0+48.0+49.0/x^41.0-50.0*x^42.0+51.0+52.0/x^44.0-53.0*x^45.0+54.0+55.0/x^47.0-56.0*x^48.0+57.0+58.0/x^50.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-41.0*33.0*x^32.0+42.0*0.0+43.0*-35.0/x^36.0-44.0*36.0*x^35.0+45.0*0.0+46.0*-38.0/x^39.0-47.0*39.0*x^38.0+48.0*0.0+49.0*-41.0/x^42.0-50.0*42.0*x^41.0+51.0*0.0+52.0*-44.0/x^45.0-53.0*45.0*x^44.0+54.0*0.0+55.0*-47.0/x^48.0-56.0*48.0*x^47.0+57.0*0.0+58.0*-50.0/x^51.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-1353.0*x^32.0-1505.0/x^36.0-1584.0*x^35.0-1748.0/x^39.0-1833.0*x^38.0-2009.0/x^42.0-2100.0*x^41.0-2288.0/x^45.0-2385.0*x^44.0-2585.0/x^48.0-2688.0*x^47.0-2900.0/x^51.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-41.0*x^33.0+42.0+43.0/x^35.0-44.0*x^36.0+45.0+46.0/x^38.0-47.0*x^39.0+48.0+49.0/x^41.0-50.0*x^42.0+51.0+52.0/x^44.0-53.0*x^45.0+54.0+55.0/x^47.0-56.0*x^48.0+57.0+58.0/x^50.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-41.0/34.0*x^34.0+42.0*x+43.0/-34.0/x^34.0-44.0/37.0*x^37.0+45.0*x+46.0/-37.0/x^37.0-47.0/40.0*x^40.0+48.0*x+49.0/-40.0/x^40.0-50.0/43.0*x^43.0+51.0*x+52.0/-43.0/x^43.0-53.0/46.0*x^46.0+54.0*x+55.0/-46.0/x^46.0-56.0/49.0*x^49.0+57.0*x+58.0/-49.0/x^49.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.2058823529411764*x^34.0+42.0*x-1.2647058823529411/x^34.0-1.1891891891891893*x^37.0+45.0*x-1.2432432432432432/x^37.0-1.175*x^40.0+48.0*x-1.225/x^40.0-1.1627906976744187*x^43.0+51.0*x-1.2093023255813953/x^43.0-1.1521739130434783*x^46.0+54.0*x-1.1956521739130435/x^46.0-1.1428571428571428*x^49.0+57.0*x-1.183673469387755/x^49.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-1353.0*x^32.0-1505.0/x^36.0-1584.0*x^35.0-1748.0/x^39.0-1833.0*x^38.0-2009.0/x^42.0-2100.0*x^41.0-2288.0/x^45.0-2385.0*x^44.0-2585.0/x^48.0-2688.0*x^47.0-2900.0/x^51.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-1353.0*32.0*x^31.0-1505.0*-36.0/x^37.0-1584.0*35.0*x^34.0-1748.0*-39.0/x^40.0-1833.0*38.0*x^37.0-2009.0*-42.0/x^43.0-2100.0*41.0*x^40.0-2288.0*-45.0/x^46.0-2385.0*44.0*x^43.0-2585.0*-48.0/x^49.0-2688.0*47.0*x^46.0-2900.0*-51.0/x^52.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-43296.0*x^31.0+54180.0/x^37.0-55440.0*x^34.0+68172.0/x^40.0-69654.0*x^37.0+84378.0/x^43.0-86100.0*x^40.0+102960.0/x^46.0-104940.0*x^43.0+124080.0/x^49.0-126336.0*x^46.0+147900.0/x^52.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.2058823529411764*x^34.0+42.0*x-1.2647058823529411/x^34.0-1.1891891891891893*x^37.0+45.0*x-1.2432432432432432/x^37.0-1.175*x^40.0+48.0*x-1.225/x^40.0-1.1627906976744187*x^43.0+51.0*x-1.2093023255813953/x^43.0-1.1521739130434783*x^46.0+54.0*x-1.1956521739130435/x^46.0-1.1428571428571428*x^49.0+57.0*x-1.183673469387755/x^49.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.2058823529411764/35.0*x^35.0+42.0/2.0*x^2.0-1.2647058823529411/-33.0/x^33.0-1.1891891891891893/38.0*x^38.0+45.0/2.0*x^2.0-1.2432432432432432/-36.0/x^36.0-1.175/41.0*x^41.0+48.0/2.0*x^2.0-1.225/-39.0/x^39.0-1.1627906976744187/44.0*x^44.0+51.0/2.0*x^2.0-1.2093023255813953/-42.0/x^42.0-1.1521739130434783/47.0*x^47.0+54.0/2.0*x^2.0-1.1956521739130435/-45.0/x^45.0-1.1428571428571428/50.0*x^50.0+57.0/2.0*x^2.0-1.183673469387755/-48.0/x^48.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/29.02439024390244*x^35.0+21.0*x^2.0+1.0/26.093023255813954/x^33.0-1.0/31.954545454545453*x^38.0+22.5*x^2.0+1.0/28.956521739130437/x^36.0-1.0/34.8936170212766*x^41.0+24.0*x^2.0+1.0/31.83673469387755/x^39.0-1.0/37.839999999999996*x^44.0+25.5*x^2.0+1.0/34.73076923076923/x^42.0-1.0/40.79245283018868*x^47.0+27.0*x^2.0+1.0/37.63636363636364/x^45.0-1.0/43.75*x^50.0+28.5*x^2.0+1.0/40.55172413793103/x^48.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-43296.0*x^31.0+54180.0/x^37.0-55440.0*x^34.0+68172.0/x^40.0-69654.0*x^37.0+84378.0/x^43.0-86100.0*x^40.0+102960.0/x^46.0-104940.0*x^43.0+124080.0/x^49.0-126336.0*x^46.0+147900.0/x^52.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-43296.0*31.0*x^30.0+54180.0*-37.0/x^38.0-55440.0*34.0*x^33.0+68172.0*-40.0/x^41.0-69654.0*37.0*x^36.0+84378.0*-43.0/x^44.0-86100.0*40.0*x^39.0+102960.0*-46.0/x^47.0-104940.0*43.0*x^42.0+124080.0*-49.0/x^50.0-126336.0*46.0*x^45.0+147900.0*-52.0/x^53.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-1342176.0*x^30.0-2004660.0/x^38.0-1884960.0*x^33.0-2726880.0/x^41.0-2577198.0*x^36.0-3628254.0/x^44.0-3444000.0*x^39.0-4736160.0/x^47.0-4512420.0*x^42.0-6079920.0/x^50.0-5811456.0*x^45.0-7690800.0/x^53.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/29.02439024390244*x^35.0+21.0*x^2.0+1.0/26.093023255813954/x^33.0-1.0/31.954545454545453*x^38.0+22.5*x^2.0+1.0/28.956521739130437/x^36.0-1.0/34.8936170212766*x^41.0+24.0*x^2.0+1.0/31.83673469387755/x^39.0-1.0/37.839999999999996*x^44.0+25.5*x^2.0+1.0/34.73076923076923/x^42.0-1.0/40.79245283018868*x^47.0+27.0*x^2.0+1.0/37.63636363636364/x^45.0-1.0/43.75*x^50.0+28.5*x^2.0+1.0/40.55172413793103/x^48.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/29.02439024390244/36.0*x^36.0+21.0/3.0*x^3.0+1.0/26.093023255813954/-32.0/x^32.0-1.0/31.954545454545453/39.0*x^39.0+22.5/3.0*x^3.0+1.0/28.956521739130437/-35.0/x^35.0-1.0/34.8936170212766/42.0*x^42.0+24.0/3.0*x^3.0+1.0/31.83673469387755/-38.0/x^38.0-1.0/37.839999999999996/45.0*x^45.0+25.5/3.0*x^3.0+1.0/34.73076923076923/-41.0/x^41.0-1.0/40.79245283018868/48.0*x^48.0+27.0/3.0*x^3.0+1.0/37.63636363636364/-44.0/x^44.0-1.0/43.75/51.0*x^51.0+28.5/3.0*x^3.0+1.0/40.55172413793103/-47.0/x^47.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/1044.878048780488*x^36.0+7.0*x^3.0-1.0/834.9767441860465/x^32.0-1.0/1246.2272727272727*x^39.0+7.5*x^3.0-1.0/1013.4782608695652/x^35.0-1.0/1465.531914893617*x^42.0+8.0*x^3.0-1.0/1209.7959183673468/x^38.0-1.0/1702.7999999999997*x^45.0+8.5*x^3.0-1.0/1423.9615384615386/x^41.0-1.0/1958.0377358490566*x^48.0+9.0*x^3.0-1.0/1656.0000000000002/x^44.0-1.0/2231.25*x^51.0+9.5*x^3.0-1.0/1905.9310344827586/x^47.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-1342176.0*x^30.0-2004660.0/x^38.0-1884960.0*x^33.0-2726880.0/x^41.0-2577198.0*x^36.0-3628254.0/x^44.0-3444000.0*x^39.0-4736160.0/x^47.0-4512420.0*x^42.0-6079920.0/x^50.0-5811456.0*x^45.0-7690800.0/x^53.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-1342176.0*30.0*x^29.0-2004660.0*-38.0/x^39.0-1884960.0*33.0*x^32.0-2726880.0*-41.0/x^42.0-2577198.0*36.0*x^35.0-3628254.0*-44.0/x^45.0-3444000.0*39.0*x^38.0-4736160.0*-47.0/x^48.0-4512420.0*42.0*x^41.0-6079920.0*-50.0/x^51.0-5811456.0*45.0*x^44.0-7690800.0*-53.0/x^54.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-4.026528E7*x^29.0+7.617708E7/x^39.0-6.220368E7*x^32.0+1.1180208E8/x^42.0-9.2779128E7*x^35.0+1.59643176E8/x^45.0-1.34316E8*x^38.0+2.2259952E8/x^48.0-1.8952164E8*x^41.0+3.03996E8/x^51.0-2.6151552E8*x^44.0+4.076124E8/x^54.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/1044.878048780488*x^36.0+7.0*x^3.0-1.0/834.9767441860465/x^32.0-1.0/1246.2272727272727*x^39.0+7.5*x^3.0-1.0/1013.4782608695652/x^35.0-1.0/1465.531914893617*x^42.0+8.0*x^3.0-1.0/1209.7959183673468/x^38.0-1.0/1702.7999999999997*x^45.0+8.5*x^3.0-1.0/1423.9615384615386/x^41.0-1.0/1958.0377358490566*x^48.0+9.0*x^3.0-1.0/1656.0000000000002/x^44.0-1.0/2231.25*x^51.0+9.5*x^3.0-1.0/1905.9310344827586/x^47.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/1044.878048780488/37.0*x^37.0+7.0/4.0*x^4.0-1.0/834.9767441860465/-31.0/x^31.0-1.0/1246.2272727272727/40.0*x^40.0+7.5/4.0*x^4.0-1.0/1013.4782608695652/-34.0/x^34.0-1.0/1465.531914893617/43.0*x^43.0+8.0/4.0*x^4.0-1.0/1209.7959183673468/-37.0/x^37.0-1.0/1702.7999999999997/46.0*x^46.0+8.5/4.0*x^4.0-1.0/1423.9615384615386/-40.0/x^40.0-1.0/1958.0377358490566/49.0*x^49.0+9.0/4.0*x^4.0-1.0/1656.0000000000002/-43.0/x^43.0-1.0/2231.25/52.0*x^52.0+9.5/4.0*x^4.0-1.0/1905.9310344827586/-46.0/x^46.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/38660.48780487805*x^37.0+1.75*x^4.0+1.0/25884.279069767443/x^31.0-1.0/49849.09090909091*x^40.0+1.875*x^4.0+1.0/34458.260869565216/x^34.0-1.0/63017.872340425536*x^43.0+2.0*x^4.0+1.0/44762.44897959183/x^37.0-1.0/78328.79999999999*x^46.0+2.125*x^4.0+1.0/56958.461538461546/x^40.0-1.0/95943.84905660378*x^49.0+2.25*x^4.0+1.0/71208.00000000001/x^43.0-1.0/116025.0*x^52.0+2.375*x^4.0+1.0/87672.8275862069/x^46.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120513() {
 UsageCalculus.TestCase = 120513;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+42*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-34+43/x^35-44*x^36+45*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-37+46/x^38-47*x^39+48*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-40+49/x^41-50*x^42+51+52/x^44-53*x^45+54+55/x^47-56*x^48+57*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-49+58/x^50-59*x^51+60*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-52";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "42.0+43.0/x^35.0-44.0*x^36.0+45.0+46.0/x^38.0-47.0*x^39.0+48.0+49.0/x^41.0-50.0*x^42.0+51.0+52.0/x^44.0-53.0*x^45.0+54.0+55.0/x^47.0-56.0*x^48.0+57.0+58.0/x^50.0-59.0*x^51.0+60.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+43.0*-35.0/x^36.0-44.0*36.0*x^35.0+45.0*0.0+46.0*-38.0/x^39.0-47.0*39.0*x^38.0+48.0*0.0+49.0*-41.0/x^42.0-50.0*42.0*x^41.0+51.0*0.0+52.0*-44.0/x^45.0-53.0*45.0*x^44.0+54.0*0.0+55.0*-47.0/x^48.0-56.0*48.0*x^47.0+57.0*0.0+58.0*-50.0/x^51.0-59.0*51.0*x^50.0+60.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-1505.0/x^36.0-1584.0*x^35.0-1748.0/x^39.0-1833.0*x^38.0-2009.0/x^42.0-2100.0*x^41.0-2288.0/x^45.0-2385.0*x^44.0-2585.0/x^48.0-2688.0*x^47.0-2900.0/x^51.0-3009.0*x^50.0";
 UsageCalculus.EqnSolArrayMap3[1] = "42.0+43.0/x^35.0-44.0*x^36.0+45.0+46.0/x^38.0-47.0*x^39.0+48.0+49.0/x^41.0-50.0*x^42.0+51.0+52.0/x^44.0-53.0*x^45.0+54.0+55.0/x^47.0-56.0*x^48.0+57.0+58.0/x^50.0-59.0*x^51.0+60.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "42.0*x+43.0/-34.0/x^34.0-44.0/37.0*x^37.0+45.0*x+46.0/-37.0/x^37.0-47.0/40.0*x^40.0+48.0*x+49.0/-40.0/x^40.0-50.0/43.0*x^43.0+51.0*x+52.0/-43.0/x^43.0-53.0/46.0*x^46.0+54.0*x+55.0/-46.0/x^46.0-56.0/49.0*x^49.0+57.0*x+58.0/-49.0/x^49.0-59.0/52.0*x^52.0+60.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "42.0*x-1.2647058823529411/x^34.0-1.1891891891891893*x^37.0+45.0*x-1.2432432432432432/x^37.0-1.175*x^40.0+48.0*x-1.225/x^40.0-1.1627906976744187*x^43.0+51.0*x-1.2093023255813953/x^43.0-1.1521739130434783*x^46.0+54.0*x-1.1956521739130435/x^46.0-1.1428571428571428*x^49.0+57.0*x-1.183673469387755/x^49.0-1.1346153846153846*x^52.0+60.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-1505.0/x^36.0-1584.0*x^35.0-1748.0/x^39.0-1833.0*x^38.0-2009.0/x^42.0-2100.0*x^41.0-2288.0/x^45.0-2385.0*x^44.0-2585.0/x^48.0-2688.0*x^47.0-2900.0/x^51.0-3009.0*x^50.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-1505.0*-36.0/x^37.0-1584.0*35.0*x^34.0-1748.0*-39.0/x^40.0-1833.0*38.0*x^37.0-2009.0*-42.0/x^43.0-2100.0*41.0*x^40.0-2288.0*-45.0/x^46.0-2385.0*44.0*x^43.0-2585.0*-48.0/x^49.0-2688.0*47.0*x^46.0-2900.0*-51.0/x^52.0-3009.0*50.0*x^49.0";
 UsageCalculus.EqnSolArrayMap2[2] = "54180.0/x^37.0-55440.0*x^34.0+68172.0/x^40.0-69654.0*x^37.0+84378.0/x^43.0-86100.0*x^40.0+102960.0/x^46.0-104940.0*x^43.0+124080.0/x^49.0-126336.0*x^46.0+147900.0/x^52.0-150450.0*x^49.0";
 UsageCalculus.EqnSolArrayMap3[2] = "42.0*x-1.2647058823529411/x^34.0-1.1891891891891893*x^37.0+45.0*x-1.2432432432432432/x^37.0-1.175*x^40.0+48.0*x-1.225/x^40.0-1.1627906976744187*x^43.0+51.0*x-1.2093023255813953/x^43.0-1.1521739130434783*x^46.0+54.0*x-1.1956521739130435/x^46.0-1.1428571428571428*x^49.0+57.0*x-1.183673469387755/x^49.0-1.1346153846153846*x^52.0+60.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "42.0/2.0*x^2.0-1.2647058823529411/-33.0/x^33.0-1.1891891891891893/38.0*x^38.0+45.0/2.0*x^2.0-1.2432432432432432/-36.0/x^36.0-1.175/41.0*x^41.0+48.0/2.0*x^2.0-1.225/-39.0/x^39.0-1.1627906976744187/44.0*x^44.0+51.0/2.0*x^2.0-1.2093023255813953/-42.0/x^42.0-1.1521739130434783/47.0*x^47.0+54.0/2.0*x^2.0-1.1956521739130435/-45.0/x^45.0-1.1428571428571428/50.0*x^50.0+57.0/2.0*x^2.0-1.183673469387755/-48.0/x^48.0-1.1346153846153846/53.0*x^53.0+60.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "21.0*x^2.0+1.0/26.093023255813954/x^33.0-1.0/31.954545454545453*x^38.0+22.5*x^2.0+1.0/28.956521739130437/x^36.0-1.0/34.8936170212766*x^41.0+24.0*x^2.0+1.0/31.83673469387755/x^39.0-1.0/37.839999999999996*x^44.0+25.5*x^2.0+1.0/34.73076923076923/x^42.0-1.0/40.79245283018868*x^47.0+27.0*x^2.0+1.0/37.63636363636364/x^45.0-1.0/43.75*x^50.0+28.5*x^2.0+1.0/40.55172413793103/x^48.0-1.0/46.71186440677966*x^53.0+30.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "54180.0/x^37.0-55440.0*x^34.0+68172.0/x^40.0-69654.0*x^37.0+84378.0/x^43.0-86100.0*x^40.0+102960.0/x^46.0-104940.0*x^43.0+124080.0/x^49.0-126336.0*x^46.0+147900.0/x^52.0-150450.0*x^49.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "54180.0*-37.0/x^38.0-55440.0*34.0*x^33.0+68172.0*-40.0/x^41.0-69654.0*37.0*x^36.0+84378.0*-43.0/x^44.0-86100.0*40.0*x^39.0+102960.0*-46.0/x^47.0-104940.0*43.0*x^42.0+124080.0*-49.0/x^50.0-126336.0*46.0*x^45.0+147900.0*-52.0/x^53.0-150450.0*49.0*x^48.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-2004660.0/x^38.0-1884960.0*x^33.0-2726880.0/x^41.0-2577198.0*x^36.0-3628254.0/x^44.0-3444000.0*x^39.0-4736160.0/x^47.0-4512420.0*x^42.0-6079920.0/x^50.0-5811456.0*x^45.0-7690800.0/x^53.0-7372050.0*x^48.0";
 UsageCalculus.EqnSolArrayMap3[3] = "21.0*x^2.0+1.0/26.093023255813954/x^33.0-1.0/31.954545454545453*x^38.0+22.5*x^2.0+1.0/28.956521739130437/x^36.0-1.0/34.8936170212766*x^41.0+24.0*x^2.0+1.0/31.83673469387755/x^39.0-1.0/37.839999999999996*x^44.0+25.5*x^2.0+1.0/34.73076923076923/x^42.0-1.0/40.79245283018868*x^47.0+27.0*x^2.0+1.0/37.63636363636364/x^45.0-1.0/43.75*x^50.0+28.5*x^2.0+1.0/40.55172413793103/x^48.0-1.0/46.71186440677966*x^53.0+30.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "21.0/3.0*x^3.0+1.0/26.093023255813954/-32.0/x^32.0-1.0/31.954545454545453/39.0*x^39.0+22.5/3.0*x^3.0+1.0/28.956521739130437/-35.0/x^35.0-1.0/34.8936170212766/42.0*x^42.0+24.0/3.0*x^3.0+1.0/31.83673469387755/-38.0/x^38.0-1.0/37.839999999999996/45.0*x^45.0+25.5/3.0*x^3.0+1.0/34.73076923076923/-41.0/x^41.0-1.0/40.79245283018868/48.0*x^48.0+27.0/3.0*x^3.0+1.0/37.63636363636364/-44.0/x^44.0-1.0/43.75/51.0*x^51.0+28.5/3.0*x^3.0+1.0/40.55172413793103/-47.0/x^47.0-1.0/46.71186440677966/54.0*x^54.0+30.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "7.0*x^3.0-1.0/834.9767441860465/x^32.0-1.0/1246.2272727272727*x^39.0+7.5*x^3.0-1.0/1013.4782608695652/x^35.0-1.0/1465.531914893617*x^42.0+8.0*x^3.0-1.0/1209.7959183673468/x^38.0-1.0/1702.7999999999997*x^45.0+8.5*x^3.0-1.0/1423.9615384615386/x^41.0-1.0/1958.0377358490566*x^48.0+9.0*x^3.0-1.0/1656.0000000000002/x^44.0-1.0/2231.25*x^51.0+9.5*x^3.0-1.0/1905.9310344827586/x^47.0-1.0/2522.4406779661017*x^54.0+10.0*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-2004660.0/x^38.0-1884960.0*x^33.0-2726880.0/x^41.0-2577198.0*x^36.0-3628254.0/x^44.0-3444000.0*x^39.0-4736160.0/x^47.0-4512420.0*x^42.0-6079920.0/x^50.0-5811456.0*x^45.0-7690800.0/x^53.0-7372050.0*x^48.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-2004660.0*-38.0/x^39.0-1884960.0*33.0*x^32.0-2726880.0*-41.0/x^42.0-2577198.0*36.0*x^35.0-3628254.0*-44.0/x^45.0-3444000.0*39.0*x^38.0-4736160.0*-47.0/x^48.0-4512420.0*42.0*x^41.0-6079920.0*-50.0/x^51.0-5811456.0*45.0*x^44.0-7690800.0*-53.0/x^54.0-7372050.0*48.0*x^47.0";
 UsageCalculus.EqnSolArrayMap2[4] = "7.617708E7/x^39.0-6.220368E7*x^32.0+1.1180208E8/x^42.0-9.2779128E7*x^35.0+1.59643176E8/x^45.0-1.34316E8*x^38.0+2.2259952E8/x^48.0-1.8952164E8*x^41.0+3.03996E8/x^51.0-2.6151552E8*x^44.0+4.076124E8/x^54.0-3.538584E8*x^47.0";
 UsageCalculus.EqnSolArrayMap3[4] = "7.0*x^3.0-1.0/834.9767441860465/x^32.0-1.0/1246.2272727272727*x^39.0+7.5*x^3.0-1.0/1013.4782608695652/x^35.0-1.0/1465.531914893617*x^42.0+8.0*x^3.0-1.0/1209.7959183673468/x^38.0-1.0/1702.7999999999997*x^45.0+8.5*x^3.0-1.0/1423.9615384615386/x^41.0-1.0/1958.0377358490566*x^48.0+9.0*x^3.0-1.0/1656.0000000000002/x^44.0-1.0/2231.25*x^51.0+9.5*x^3.0-1.0/1905.9310344827586/x^47.0-1.0/2522.4406779661017*x^54.0+10.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "7.0/4.0*x^4.0-1.0/834.9767441860465/-31.0/x^31.0-1.0/1246.2272727272727/40.0*x^40.0+7.5/4.0*x^4.0-1.0/1013.4782608695652/-34.0/x^34.0-1.0/1465.531914893617/43.0*x^43.0+8.0/4.0*x^4.0-1.0/1209.7959183673468/-37.0/x^37.0-1.0/1702.7999999999997/46.0*x^46.0+8.5/4.0*x^4.0-1.0/1423.9615384615386/-40.0/x^40.0-1.0/1958.0377358490566/49.0*x^49.0+9.0/4.0*x^4.0-1.0/1656.0000000000002/-43.0/x^43.0-1.0/2231.25/52.0*x^52.0+9.5/4.0*x^4.0-1.0/1905.9310344827586/-46.0/x^46.0-1.0/2522.4406779661017/55.0*x^55.0+10.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.75*x^4.0+1.0/25884.279069767443/x^31.0-1.0/49849.09090909091*x^40.0+1.875*x^4.0+1.0/34458.260869565216/x^34.0-1.0/63017.872340425536*x^43.0+2.0*x^4.0+1.0/44762.44897959183/x^37.0-1.0/78328.79999999999*x^46.0+2.125*x^4.0+1.0/56958.461538461546/x^40.0-1.0/95943.84905660378*x^49.0+2.25*x^4.0+1.0/71208.00000000001/x^43.0-1.0/116025.0*x^52.0+2.375*x^4.0+1.0/87672.8275862069/x^46.0-1.0/138734.2372881356*x^55.0+2.5*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120514() {
 UsageCalculus.TestCase = 120514;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+43/xy^35-44*xy^36+45*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-37+46/xy^38-47*xy^39+48*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-40+49/xy^41-50*xy^42+51+52/xy^44-53*xy^45+54+55/xy^47-56*xy^48+57*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-49+58/xy^50-59*xy^51+60*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-52+61/xy^53-62*xy^54";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "43.0/xy^35.0-44.0*xy^36.0+45.0+46.0/xy^38.0-47.0*xy^39.0+48.0+49.0/xy^41.0-50.0*xy^42.0+51.0+52.0/xy^44.0-53.0*xy^45.0+54.0+55.0/xy^47.0-56.0*xy^48.0+57.0+58.0/xy^50.0-59.0*xy^51.0+60.0+61.0/xy^53.0-62.0*xy^54.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "43.0*-35.0/xy^36.0-44.0*36.0*xy^35.0+45.0*0.0+46.0*-38.0/xy^39.0-47.0*39.0*xy^38.0+48.0*0.0+49.0*-41.0/xy^42.0-50.0*42.0*xy^41.0+51.0*0.0+52.0*-44.0/xy^45.0-53.0*45.0*xy^44.0+54.0*0.0+55.0*-47.0/xy^48.0-56.0*48.0*xy^47.0+57.0*0.0+58.0*-50.0/xy^51.0-59.0*51.0*xy^50.0+60.0*0.0+61.0*-53.0/xy^54.0-62.0*54.0*xy^53.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-1505.0/xy^36.0-1584.0*xy^35.0-1748.0/xy^39.0-1833.0*xy^38.0-2009.0/xy^42.0-2100.0*xy^41.0-2288.0/xy^45.0-2385.0*xy^44.0-2585.0/xy^48.0-2688.0*xy^47.0-2900.0/xy^51.0-3009.0*xy^50.0-3233.0/xy^54.0-3348.0*xy^53.0";
 UsageCalculus.EqnSolArrayMap3[1] = "43.0/xy^35.0-44.0*xy^36.0+45.0+46.0/xy^38.0-47.0*xy^39.0+48.0+49.0/xy^41.0-50.0*xy^42.0+51.0+52.0/xy^44.0-53.0*xy^45.0+54.0+55.0/xy^47.0-56.0*xy^48.0+57.0+58.0/xy^50.0-59.0*xy^51.0+60.0+61.0/xy^53.0-62.0*xy^54.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "43.0/-34.0/xy^34.0-44.0/37.0*xy^37.0+45.0*xy+46.0/-37.0/xy^37.0-47.0/40.0*xy^40.0+48.0*xy+49.0/-40.0/xy^40.0-50.0/43.0*xy^43.0+51.0*xy+52.0/-43.0/xy^43.0-53.0/46.0*xy^46.0+54.0*xy+55.0/-46.0/xy^46.0-56.0/49.0*xy^49.0+57.0*xy+58.0/-49.0/xy^49.0-59.0/52.0*xy^52.0+60.0*xy+61.0/-52.0/xy^52.0-62.0/55.0*xy^55.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.2647058823529411/xy^34.0-1.1891891891891893*xy^37.0+45.0*xy-1.2432432432432432/xy^37.0-1.175*xy^40.0+48.0*xy-1.225/xy^40.0-1.1627906976744187*xy^43.0+51.0*xy-1.2093023255813953/xy^43.0-1.1521739130434783*xy^46.0+54.0*xy-1.1956521739130435/xy^46.0-1.1428571428571428*xy^49.0+57.0*xy-1.183673469387755/xy^49.0-1.1346153846153846*xy^52.0+60.0*xy-1.1730769230769231/xy^52.0-1.1272727272727272*xy^55.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-1505.0/xy^36.0-1584.0*xy^35.0-1748.0/xy^39.0-1833.0*xy^38.0-2009.0/xy^42.0-2100.0*xy^41.0-2288.0/xy^45.0-2385.0*xy^44.0-2585.0/xy^48.0-2688.0*xy^47.0-2900.0/xy^51.0-3009.0*xy^50.0-3233.0/xy^54.0-3348.0*xy^53.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-1505.0*-36.0/xy^37.0-1584.0*35.0*xy^34.0-1748.0*-39.0/xy^40.0-1833.0*38.0*xy^37.0-2009.0*-42.0/xy^43.0-2100.0*41.0*xy^40.0-2288.0*-45.0/xy^46.0-2385.0*44.0*xy^43.0-2585.0*-48.0/xy^49.0-2688.0*47.0*xy^46.0-2900.0*-51.0/xy^52.0-3009.0*50.0*xy^49.0-3233.0*-54.0/xy^55.0-3348.0*53.0*xy^52.0";
 UsageCalculus.EqnSolArrayMap2[2] = "54180.0/xy^37.0-55440.0*xy^34.0+68172.0/xy^40.0-69654.0*xy^37.0+84378.0/xy^43.0-86100.0*xy^40.0+102960.0/xy^46.0-104940.0*xy^43.0+124080.0/xy^49.0-126336.0*xy^46.0+147900.0/xy^52.0-150450.0*xy^49.0+174582.0/xy^55.0-177444.0*xy^52.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.2647058823529411/xy^34.0-1.1891891891891893*xy^37.0+45.0*xy-1.2432432432432432/xy^37.0-1.175*xy^40.0+48.0*xy-1.225/xy^40.0-1.1627906976744187*xy^43.0+51.0*xy-1.2093023255813953/xy^43.0-1.1521739130434783*xy^46.0+54.0*xy-1.1956521739130435/xy^46.0-1.1428571428571428*xy^49.0+57.0*xy-1.183673469387755/xy^49.0-1.1346153846153846*xy^52.0+60.0*xy-1.1730769230769231/xy^52.0-1.1272727272727272*xy^55.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.2647058823529411/-33.0/xy^33.0-1.1891891891891893/38.0*xy^38.0+45.0/2.0*xy^2.0-1.2432432432432432/-36.0/xy^36.0-1.175/41.0*xy^41.0+48.0/2.0*xy^2.0-1.225/-39.0/xy^39.0-1.1627906976744187/44.0*xy^44.0+51.0/2.0*xy^2.0-1.2093023255813953/-42.0/xy^42.0-1.1521739130434783/47.0*xy^47.0+54.0/2.0*xy^2.0-1.1956521739130435/-45.0/xy^45.0-1.1428571428571428/50.0*xy^50.0+57.0/2.0*xy^2.0-1.183673469387755/-48.0/xy^48.0-1.1346153846153846/53.0*xy^53.0+60.0/2.0*xy^2.0-1.1730769230769231/-51.0/xy^51.0-1.1272727272727272/56.0*xy^56.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/26.093023255813954/xy^33.0-1.0/31.954545454545453*xy^38.0+22.5*xy^2.0+1.0/28.956521739130437/xy^36.0-1.0/34.8936170212766*xy^41.0+24.0*xy^2.0+1.0/31.83673469387755/xy^39.0-1.0/37.839999999999996*xy^44.0+25.5*xy^2.0+1.0/34.73076923076923/xy^42.0-1.0/40.79245283018868*xy^47.0+27.0*xy^2.0+1.0/37.63636363636364/xy^45.0-1.0/43.75*xy^50.0+28.5*xy^2.0+1.0/40.55172413793103/xy^48.0-1.0/46.71186440677966*xy^53.0+30.0*xy^2.0+1.0/43.47540983606557/xy^51.0-1.0/49.67741935483871*xy^56.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "54180.0/xy^37.0-55440.0*xy^34.0+68172.0/xy^40.0-69654.0*xy^37.0+84378.0/xy^43.0-86100.0*xy^40.0+102960.0/xy^46.0-104940.0*xy^43.0+124080.0/xy^49.0-126336.0*xy^46.0+147900.0/xy^52.0-150450.0*xy^49.0+174582.0/xy^55.0-177444.0*xy^52.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "54180.0*-37.0/xy^38.0-55440.0*34.0*xy^33.0+68172.0*-40.0/xy^41.0-69654.0*37.0*xy^36.0+84378.0*-43.0/xy^44.0-86100.0*40.0*xy^39.0+102960.0*-46.0/xy^47.0-104940.0*43.0*xy^42.0+124080.0*-49.0/xy^50.0-126336.0*46.0*xy^45.0+147900.0*-52.0/xy^53.0-150450.0*49.0*xy^48.0+174582.0*-55.0/xy^56.0-177444.0*52.0*xy^51.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-2004660.0/xy^38.0-1884960.0*xy^33.0-2726880.0/xy^41.0-2577198.0*xy^36.0-3628254.0/xy^44.0-3444000.0*xy^39.0-4736160.0/xy^47.0-4512420.0*xy^42.0-6079920.0/xy^50.0-5811456.0*xy^45.0-7690800.0/xy^53.0-7372050.0*xy^48.0-9602010.0/xy^56.0-9227088.0*xy^51.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/26.093023255813954/xy^33.0-1.0/31.954545454545453*xy^38.0+22.5*xy^2.0+1.0/28.956521739130437/xy^36.0-1.0/34.8936170212766*xy^41.0+24.0*xy^2.0+1.0/31.83673469387755/xy^39.0-1.0/37.839999999999996*xy^44.0+25.5*xy^2.0+1.0/34.73076923076923/xy^42.0-1.0/40.79245283018868*xy^47.0+27.0*xy^2.0+1.0/37.63636363636364/xy^45.0-1.0/43.75*xy^50.0+28.5*xy^2.0+1.0/40.55172413793103/xy^48.0-1.0/46.71186440677966*xy^53.0+30.0*xy^2.0+1.0/43.47540983606557/xy^51.0-1.0/49.67741935483871*xy^56.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/26.093023255813954/-32.0/xy^32.0-1.0/31.954545454545453/39.0*xy^39.0+22.5/3.0*xy^3.0+1.0/28.956521739130437/-35.0/xy^35.0-1.0/34.8936170212766/42.0*xy^42.0+24.0/3.0*xy^3.0+1.0/31.83673469387755/-38.0/xy^38.0-1.0/37.839999999999996/45.0*xy^45.0+25.5/3.0*xy^3.0+1.0/34.73076923076923/-41.0/xy^41.0-1.0/40.79245283018868/48.0*xy^48.0+27.0/3.0*xy^3.0+1.0/37.63636363636364/-44.0/xy^44.0-1.0/43.75/51.0*xy^51.0+28.5/3.0*xy^3.0+1.0/40.55172413793103/-47.0/xy^47.0-1.0/46.71186440677966/54.0*xy^54.0+30.0/3.0*xy^3.0+1.0/43.47540983606557/-50.0/xy^50.0-1.0/49.67741935483871/57.0*xy^57.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/834.9767441860465/xy^32.0-1.0/1246.2272727272727*xy^39.0+7.5*xy^3.0-1.0/1013.4782608695652/xy^35.0-1.0/1465.531914893617*xy^42.0+8.0*xy^3.0-1.0/1209.7959183673468/xy^38.0-1.0/1702.7999999999997*xy^45.0+8.5*xy^3.0-1.0/1423.9615384615386/xy^41.0-1.0/1958.0377358490566*xy^48.0+9.0*xy^3.0-1.0/1656.0000000000002/xy^44.0-1.0/2231.25*xy^51.0+9.5*xy^3.0-1.0/1905.9310344827586/xy^47.0-1.0/2522.4406779661017*xy^54.0+10.0*xy^3.0-1.0/2173.7704918032787/xy^50.0-1.0/2831.6129032258063*xy^57.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-2004660.0/xy^38.0-1884960.0*xy^33.0-2726880.0/xy^41.0-2577198.0*xy^36.0-3628254.0/xy^44.0-3444000.0*xy^39.0-4736160.0/xy^47.0-4512420.0*xy^42.0-6079920.0/xy^50.0-5811456.0*xy^45.0-7690800.0/xy^53.0-7372050.0*xy^48.0-9602010.0/xy^56.0-9227088.0*xy^51.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-2004660.0*-38.0/xy^39.0-1884960.0*33.0*xy^32.0-2726880.0*-41.0/xy^42.0-2577198.0*36.0*xy^35.0-3628254.0*-44.0/xy^45.0-3444000.0*39.0*xy^38.0-4736160.0*-47.0/xy^48.0-4512420.0*42.0*xy^41.0-6079920.0*-50.0/xy^51.0-5811456.0*45.0*xy^44.0-7690800.0*-53.0/xy^54.0-7372050.0*48.0*xy^47.0-9602010.0*-56.0/xy^57.0-9227088.0*51.0*xy^50.0";
 UsageCalculus.EqnSolArrayMap2[4] = "7.617708E7/xy^39.0-6.220368E7*xy^32.0+1.1180208E8/xy^42.0-9.2779128E7*xy^35.0+1.59643176E8/xy^45.0-1.34316E8*xy^38.0+2.2259952E8/xy^48.0-1.8952164E8*xy^41.0+3.03996E8/xy^51.0-2.6151552E8*xy^44.0+4.076124E8/xy^54.0-3.538584E8*xy^47.0+5.3771256E8/xy^57.0-4.70581488E8*xy^50.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/834.9767441860465/xy^32.0-1.0/1246.2272727272727*xy^39.0+7.5*xy^3.0-1.0/1013.4782608695652/xy^35.0-1.0/1465.531914893617*xy^42.0+8.0*xy^3.0-1.0/1209.7959183673468/xy^38.0-1.0/1702.7999999999997*xy^45.0+8.5*xy^3.0-1.0/1423.9615384615386/xy^41.0-1.0/1958.0377358490566*xy^48.0+9.0*xy^3.0-1.0/1656.0000000000002/xy^44.0-1.0/2231.25*xy^51.0+9.5*xy^3.0-1.0/1905.9310344827586/xy^47.0-1.0/2522.4406779661017*xy^54.0+10.0*xy^3.0-1.0/2173.7704918032787/xy^50.0-1.0/2831.6129032258063*xy^57.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/834.9767441860465/-31.0/xy^31.0-1.0/1246.2272727272727/40.0*xy^40.0+7.5/4.0*xy^4.0-1.0/1013.4782608695652/-34.0/xy^34.0-1.0/1465.531914893617/43.0*xy^43.0+8.0/4.0*xy^4.0-1.0/1209.7959183673468/-37.0/xy^37.0-1.0/1702.7999999999997/46.0*xy^46.0+8.5/4.0*xy^4.0-1.0/1423.9615384615386/-40.0/xy^40.0-1.0/1958.0377358490566/49.0*xy^49.0+9.0/4.0*xy^4.0-1.0/1656.0000000000002/-43.0/xy^43.0-1.0/2231.25/52.0*xy^52.0+9.5/4.0*xy^4.0-1.0/1905.9310344827586/-46.0/xy^46.0-1.0/2522.4406779661017/55.0*xy^55.0+10.0/4.0*xy^4.0-1.0/2173.7704918032787/-49.0/xy^49.0-1.0/2831.6129032258063/58.0*xy^58.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/25884.279069767443/xy^31.0-1.0/49849.09090909091*xy^40.0+1.875*xy^4.0+1.0/34458.260869565216/xy^34.0-1.0/63017.872340425536*xy^43.0+2.0*xy^4.0+1.0/44762.44897959183/xy^37.0-1.0/78328.79999999999*xy^46.0+2.125*xy^4.0+1.0/56958.461538461546/xy^40.0-1.0/95943.84905660378*xy^49.0+2.25*xy^4.0+1.0/71208.00000000001/xy^43.0-1.0/116025.0*xy^52.0+2.375*xy^4.0+1.0/87672.8275862069/xy^46.0-1.0/138734.2372881356*xy^55.0+2.5*xy^4.0+1.0/106514.75409836066/xy^49.0-1.0/164233.54838709676*xy^58.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120515() {
 UsageCalculus.TestCase = 120515;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+45*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-37+46/xyzxy^38";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyzxy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "45.0+46.0/xyzxy^38.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+46.0*-38.0/xyzxy^39.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-1748.0/xyzxy^39.0";
 UsageCalculus.EqnSolArrayMap3[1] = "45.0+46.0/xyzxy^38.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "45.0*xyzxy+46.0/-37.0/xyzxy^37.0";
 UsageCalculus.EqnSolArrayMap4[1] = "45.0*xyzxy-1.2432432432432432/xyzxy^37.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-1748.0/xyzxy^39.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-1748.0*-39.0/xyzxy^40.0";
 UsageCalculus.EqnSolArrayMap2[2] = "68172.0/xyzxy^40.0";
 UsageCalculus.EqnSolArrayMap3[2] = "45.0*xyzxy-1.2432432432432432/xyzxy^37.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "45.0/2.0*xyzxy^2.0-1.2432432432432432/-36.0/xyzxy^36.0";
 UsageCalculus.EqnSolArrayMap4[2] = "22.5*xyzxy^2.0+1.0/28.956521739130437/xyzxy^36.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "68172.0/xyzxy^40.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "68172.0*-40.0/xyzxy^41.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-2726880.0/xyzxy^41.0";
 UsageCalculus.EqnSolArrayMap3[3] = "22.5*xyzxy^2.0+1.0/28.956521739130437/xyzxy^36.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "22.5/3.0*xyzxy^3.0+1.0/28.956521739130437/-35.0/xyzxy^35.0";
 UsageCalculus.EqnSolArrayMap4[3] = "7.5*xyzxy^3.0-1.0/1013.4782608695652/xyzxy^35.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-2726880.0/xyzxy^41.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-2726880.0*-41.0/xyzxy^42.0";
 UsageCalculus.EqnSolArrayMap2[4] = "1.1180208E8/xyzxy^42.0";
 UsageCalculus.EqnSolArrayMap3[4] = "7.5*xyzxy^3.0-1.0/1013.4782608695652/xyzxy^35.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "7.5/4.0*xyzxy^4.0-1.0/1013.4782608695652/-34.0/xyzxy^34.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.875*xyzxy^4.0+1.0/34458.260869565216/xyzxy^34.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120516() {
 UsageCalculus.TestCase = 120516;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+46/x^38-47*x^39+48*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-40";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "46.0/x^38.0-47.0*x^39.0+48.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "46.0*-38.0/x^39.0-47.0*39.0*x^38.0+48.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-1748.0/x^39.0-1833.0*x^38.0";
 UsageCalculus.EqnSolArrayMap3[1] = "46.0/x^38.0-47.0*x^39.0+48.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "46.0/-37.0/x^37.0-47.0/40.0*x^40.0+48.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.2432432432432432/x^37.0-1.175*x^40.0+48.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-1748.0/x^39.0-1833.0*x^38.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-1748.0*-39.0/x^40.0-1833.0*38.0*x^37.0";
 UsageCalculus.EqnSolArrayMap2[2] = "68172.0/x^40.0-69654.0*x^37.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.2432432432432432/x^37.0-1.175*x^40.0+48.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.2432432432432432/-36.0/x^36.0-1.175/41.0*x^41.0+48.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/28.956521739130437/x^36.0-1.0/34.8936170212766*x^41.0+24.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "68172.0/x^40.0-69654.0*x^37.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "68172.0*-40.0/x^41.0-69654.0*37.0*x^36.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-2726880.0/x^41.0-2577198.0*x^36.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/28.956521739130437/x^36.0-1.0/34.8936170212766*x^41.0+24.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/28.956521739130437/-35.0/x^35.0-1.0/34.8936170212766/42.0*x^42.0+24.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/1013.4782608695652/x^35.0-1.0/1465.531914893617*x^42.0+8.0*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-2726880.0/x^41.0-2577198.0*x^36.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-2726880.0*-41.0/x^42.0-2577198.0*36.0*x^35.0";
 UsageCalculus.EqnSolArrayMap2[4] = "1.1180208E8/x^42.0-9.2779128E7*x^35.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/1013.4782608695652/x^35.0-1.0/1465.531914893617*x^42.0+8.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/1013.4782608695652/-34.0/x^34.0-1.0/1465.531914893617/43.0*x^43.0+8.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/34458.260869565216/x^34.0-1.0/63017.872340425536*x^43.0+2.0*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120517() {
 UsageCalculus.TestCase = 120517;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-47*x^39+48*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-40+49/x^41-50*x^42";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-47.0*x^39.0+48.0+49.0/x^41.0-50.0*x^42.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-47.0*39.0*x^38.0+48.0*0.0+49.0*-41.0/x^42.0-50.0*42.0*x^41.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-1833.0*x^38.0-2009.0/x^42.0-2100.0*x^41.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-47.0*x^39.0+48.0+49.0/x^41.0-50.0*x^42.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-47.0/40.0*x^40.0+48.0*x+49.0/-40.0/x^40.0-50.0/43.0*x^43.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.175*x^40.0+48.0*x-1.225/x^40.0-1.1627906976744187*x^43.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-1833.0*x^38.0-2009.0/x^42.0-2100.0*x^41.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-1833.0*38.0*x^37.0-2009.0*-42.0/x^43.0-2100.0*41.0*x^40.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-69654.0*x^37.0+84378.0/x^43.0-86100.0*x^40.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.175*x^40.0+48.0*x-1.225/x^40.0-1.1627906976744187*x^43.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.175/41.0*x^41.0+48.0/2.0*x^2.0-1.225/-39.0/x^39.0-1.1627906976744187/44.0*x^44.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/34.8936170212766*x^41.0+24.0*x^2.0+1.0/31.83673469387755/x^39.0-1.0/37.839999999999996*x^44.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-69654.0*x^37.0+84378.0/x^43.0-86100.0*x^40.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-69654.0*37.0*x^36.0+84378.0*-43.0/x^44.0-86100.0*40.0*x^39.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-2577198.0*x^36.0-3628254.0/x^44.0-3444000.0*x^39.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/34.8936170212766*x^41.0+24.0*x^2.0+1.0/31.83673469387755/x^39.0-1.0/37.839999999999996*x^44.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/34.8936170212766/42.0*x^42.0+24.0/3.0*x^3.0+1.0/31.83673469387755/-38.0/x^38.0-1.0/37.839999999999996/45.0*x^45.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/1465.531914893617*x^42.0+8.0*x^3.0-1.0/1209.7959183673468/x^38.0-1.0/1702.7999999999997*x^45.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-2577198.0*x^36.0-3628254.0/x^44.0-3444000.0*x^39.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-2577198.0*36.0*x^35.0-3628254.0*-44.0/x^45.0-3444000.0*39.0*x^38.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-9.2779128E7*x^35.0+1.59643176E8/x^45.0-1.34316E8*x^38.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/1465.531914893617*x^42.0+8.0*x^3.0-1.0/1209.7959183673468/x^38.0-1.0/1702.7999999999997*x^45.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/1465.531914893617/43.0*x^43.0+8.0/4.0*x^4.0-1.0/1209.7959183673468/-37.0/x^37.0-1.0/1702.7999999999997/46.0*x^46.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/63017.872340425536*x^43.0+2.0*x^4.0+1.0/44762.44897959183/x^37.0-1.0/78328.79999999999*x^46.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120518() {
 UsageCalculus.TestCase = 120518;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+48*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-40+49/x^41-50*x^42+51+52/x^44";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "48.0+49.0/x^41.0-50.0*x^42.0+51.0+52.0/x^44.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+49.0*-41.0/x^42.0-50.0*42.0*x^41.0+51.0*0.0+52.0*-44.0/x^45.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-2009.0/x^42.0-2100.0*x^41.0-2288.0/x^45.0";
 UsageCalculus.EqnSolArrayMap3[1] = "48.0+49.0/x^41.0-50.0*x^42.0+51.0+52.0/x^44.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "48.0*x+49.0/-40.0/x^40.0-50.0/43.0*x^43.0+51.0*x+52.0/-43.0/x^43.0";
 UsageCalculus.EqnSolArrayMap4[1] = "48.0*x-1.225/x^40.0-1.1627906976744187*x^43.0+51.0*x-1.2093023255813953/x^43.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-2009.0/x^42.0-2100.0*x^41.0-2288.0/x^45.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-2009.0*-42.0/x^43.0-2100.0*41.0*x^40.0-2288.0*-45.0/x^46.0";
 UsageCalculus.EqnSolArrayMap2[2] = "84378.0/x^43.0-86100.0*x^40.0+102960.0/x^46.0";
 UsageCalculus.EqnSolArrayMap3[2] = "48.0*x-1.225/x^40.0-1.1627906976744187*x^43.0+51.0*x-1.2093023255813953/x^43.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "48.0/2.0*x^2.0-1.225/-39.0/x^39.0-1.1627906976744187/44.0*x^44.0+51.0/2.0*x^2.0-1.2093023255813953/-42.0/x^42.0";
 UsageCalculus.EqnSolArrayMap4[2] = "24.0*x^2.0+1.0/31.83673469387755/x^39.0-1.0/37.839999999999996*x^44.0+25.5*x^2.0+1.0/34.73076923076923/x^42.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "84378.0/x^43.0-86100.0*x^40.0+102960.0/x^46.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "84378.0*-43.0/x^44.0-86100.0*40.0*x^39.0+102960.0*-46.0/x^47.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-3628254.0/x^44.0-3444000.0*x^39.0-4736160.0/x^47.0";
 UsageCalculus.EqnSolArrayMap3[3] = "24.0*x^2.0+1.0/31.83673469387755/x^39.0-1.0/37.839999999999996*x^44.0+25.5*x^2.0+1.0/34.73076923076923/x^42.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "24.0/3.0*x^3.0+1.0/31.83673469387755/-38.0/x^38.0-1.0/37.839999999999996/45.0*x^45.0+25.5/3.0*x^3.0+1.0/34.73076923076923/-41.0/x^41.0";
 UsageCalculus.EqnSolArrayMap4[3] = "8.0*x^3.0-1.0/1209.7959183673468/x^38.0-1.0/1702.7999999999997*x^45.0+8.5*x^3.0-1.0/1423.9615384615386/x^41.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-3628254.0/x^44.0-3444000.0*x^39.0-4736160.0/x^47.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-3628254.0*-44.0/x^45.0-3444000.0*39.0*x^38.0-4736160.0*-47.0/x^48.0";
 UsageCalculus.EqnSolArrayMap2[4] = "1.59643176E8/x^45.0-1.34316E8*x^38.0+2.2259952E8/x^48.0";
 UsageCalculus.EqnSolArrayMap3[4] = "8.0*x^3.0-1.0/1209.7959183673468/x^38.0-1.0/1702.7999999999997*x^45.0+8.5*x^3.0-1.0/1423.9615384615386/x^41.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "8.0/4.0*x^4.0-1.0/1209.7959183673468/-37.0/x^37.0-1.0/1702.7999999999997/46.0*x^46.0+8.5/4.0*x^4.0-1.0/1423.9615384615386/-40.0/x^40.0";
 UsageCalculus.EqnSolArrayMap4[4] = "2.0*x^4.0+1.0/44762.44897959183/x^37.0-1.0/78328.79999999999*x^46.0+2.125*x^4.0+1.0/56958.461538461546/x^40.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120519() {
 UsageCalculus.TestCase = 120519;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+49/xyz^41-50*xyz^42+51+52/xyz^44-53*xyz^45+54";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "49.0/xyz^41.0-50.0*xyz^42.0+51.0+52.0/xyz^44.0-53.0*xyz^45.0+54.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "49.0*-41.0/xyz^42.0-50.0*42.0*xyz^41.0+51.0*0.0+52.0*-44.0/xyz^45.0-53.0*45.0*xyz^44.0+54.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-2009.0/xyz^42.0-2100.0*xyz^41.0-2288.0/xyz^45.0-2385.0*xyz^44.0";
 UsageCalculus.EqnSolArrayMap3[1] = "49.0/xyz^41.0-50.0*xyz^42.0+51.0+52.0/xyz^44.0-53.0*xyz^45.0+54.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "49.0/-40.0/xyz^40.0-50.0/43.0*xyz^43.0+51.0*xyz+52.0/-43.0/xyz^43.0-53.0/46.0*xyz^46.0+54.0*xyz";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.225/xyz^40.0-1.1627906976744187*xyz^43.0+51.0*xyz-1.2093023255813953/xyz^43.0-1.1521739130434783*xyz^46.0+54.0*xyz";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-2009.0/xyz^42.0-2100.0*xyz^41.0-2288.0/xyz^45.0-2385.0*xyz^44.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-2009.0*-42.0/xyz^43.0-2100.0*41.0*xyz^40.0-2288.0*-45.0/xyz^46.0-2385.0*44.0*xyz^43.0";
 UsageCalculus.EqnSolArrayMap2[2] = "84378.0/xyz^43.0-86100.0*xyz^40.0+102960.0/xyz^46.0-104940.0*xyz^43.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.225/xyz^40.0-1.1627906976744187*xyz^43.0+51.0*xyz-1.2093023255813953/xyz^43.0-1.1521739130434783*xyz^46.0+54.0*xyz";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.225/-39.0/xyz^39.0-1.1627906976744187/44.0*xyz^44.0+51.0/2.0*xyz^2.0-1.2093023255813953/-42.0/xyz^42.0-1.1521739130434783/47.0*xyz^47.0+54.0/2.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/31.83673469387755/xyz^39.0-1.0/37.839999999999996*xyz^44.0+25.5*xyz^2.0+1.0/34.73076923076923/xyz^42.0-1.0/40.79245283018868*xyz^47.0+27.0*xyz^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "84378.0/xyz^43.0-86100.0*xyz^40.0+102960.0/xyz^46.0-104940.0*xyz^43.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "84378.0*-43.0/xyz^44.0-86100.0*40.0*xyz^39.0+102960.0*-46.0/xyz^47.0-104940.0*43.0*xyz^42.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-3628254.0/xyz^44.0-3444000.0*xyz^39.0-4736160.0/xyz^47.0-4512420.0*xyz^42.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/31.83673469387755/xyz^39.0-1.0/37.839999999999996*xyz^44.0+25.5*xyz^2.0+1.0/34.73076923076923/xyz^42.0-1.0/40.79245283018868*xyz^47.0+27.0*xyz^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/31.83673469387755/-38.0/xyz^38.0-1.0/37.839999999999996/45.0*xyz^45.0+25.5/3.0*xyz^3.0+1.0/34.73076923076923/-41.0/xyz^41.0-1.0/40.79245283018868/48.0*xyz^48.0+27.0/3.0*xyz^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/1209.7959183673468/xyz^38.0-1.0/1702.7999999999997*xyz^45.0+8.5*xyz^3.0-1.0/1423.9615384615386/xyz^41.0-1.0/1958.0377358490566*xyz^48.0+9.0*xyz^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-3628254.0/xyz^44.0-3444000.0*xyz^39.0-4736160.0/xyz^47.0-4512420.0*xyz^42.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-3628254.0*-44.0/xyz^45.0-3444000.0*39.0*xyz^38.0-4736160.0*-47.0/xyz^48.0-4512420.0*42.0*xyz^41.0";
 UsageCalculus.EqnSolArrayMap2[4] = "1.59643176E8/xyz^45.0-1.34316E8*xyz^38.0+2.2259952E8/xyz^48.0-1.8952164E8*xyz^41.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/1209.7959183673468/xyz^38.0-1.0/1702.7999999999997*xyz^45.0+8.5*xyz^3.0-1.0/1423.9615384615386/xyz^41.0-1.0/1958.0377358490566*xyz^48.0+9.0*xyz^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/1209.7959183673468/-37.0/xyz^37.0-1.0/1702.7999999999997/46.0*xyz^46.0+8.5/4.0*xyz^4.0-1.0/1423.9615384615386/-40.0/xyz^40.0-1.0/1958.0377358490566/49.0*xyz^49.0+9.0/4.0*xyz^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/44762.44897959183/xyz^37.0-1.0/78328.79999999999*xyz^46.0+2.125*xyz^4.0+1.0/56958.461538461546/xyz^40.0-1.0/95943.84905660378*xyz^49.0+2.25*xyz^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120520() {
 UsageCalculus.TestCase = 120520;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-50*x^42+51+52/x^44-53*x^45+54+55/x^47-56*x^48";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-50.0*x^42.0+51.0+52.0/x^44.0-53.0*x^45.0+54.0+55.0/x^47.0-56.0*x^48.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-50.0*42.0*x^41.0+51.0*0.0+52.0*-44.0/x^45.0-53.0*45.0*x^44.0+54.0*0.0+55.0*-47.0/x^48.0-56.0*48.0*x^47.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-2100.0*x^41.0-2288.0/x^45.0-2385.0*x^44.0-2585.0/x^48.0-2688.0*x^47.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-50.0*x^42.0+51.0+52.0/x^44.0-53.0*x^45.0+54.0+55.0/x^47.0-56.0*x^48.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-50.0/43.0*x^43.0+51.0*x+52.0/-43.0/x^43.0-53.0/46.0*x^46.0+54.0*x+55.0/-46.0/x^46.0-56.0/49.0*x^49.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.1627906976744187*x^43.0+51.0*x-1.2093023255813953/x^43.0-1.1521739130434783*x^46.0+54.0*x-1.1956521739130435/x^46.0-1.1428571428571428*x^49.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-2100.0*x^41.0-2288.0/x^45.0-2385.0*x^44.0-2585.0/x^48.0-2688.0*x^47.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-2100.0*41.0*x^40.0-2288.0*-45.0/x^46.0-2385.0*44.0*x^43.0-2585.0*-48.0/x^49.0-2688.0*47.0*x^46.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-86100.0*x^40.0+102960.0/x^46.0-104940.0*x^43.0+124080.0/x^49.0-126336.0*x^46.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.1627906976744187*x^43.0+51.0*x-1.2093023255813953/x^43.0-1.1521739130434783*x^46.0+54.0*x-1.1956521739130435/x^46.0-1.1428571428571428*x^49.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.1627906976744187/44.0*x^44.0+51.0/2.0*x^2.0-1.2093023255813953/-42.0/x^42.0-1.1521739130434783/47.0*x^47.0+54.0/2.0*x^2.0-1.1956521739130435/-45.0/x^45.0-1.1428571428571428/50.0*x^50.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/37.839999999999996*x^44.0+25.5*x^2.0+1.0/34.73076923076923/x^42.0-1.0/40.79245283018868*x^47.0+27.0*x^2.0+1.0/37.63636363636364/x^45.0-1.0/43.75*x^50.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-86100.0*x^40.0+102960.0/x^46.0-104940.0*x^43.0+124080.0/x^49.0-126336.0*x^46.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-86100.0*40.0*x^39.0+102960.0*-46.0/x^47.0-104940.0*43.0*x^42.0+124080.0*-49.0/x^50.0-126336.0*46.0*x^45.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-3444000.0*x^39.0-4736160.0/x^47.0-4512420.0*x^42.0-6079920.0/x^50.0-5811456.0*x^45.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/37.839999999999996*x^44.0+25.5*x^2.0+1.0/34.73076923076923/x^42.0-1.0/40.79245283018868*x^47.0+27.0*x^2.0+1.0/37.63636363636364/x^45.0-1.0/43.75*x^50.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/37.839999999999996/45.0*x^45.0+25.5/3.0*x^3.0+1.0/34.73076923076923/-41.0/x^41.0-1.0/40.79245283018868/48.0*x^48.0+27.0/3.0*x^3.0+1.0/37.63636363636364/-44.0/x^44.0-1.0/43.75/51.0*x^51.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/1702.7999999999997*x^45.0+8.5*x^3.0-1.0/1423.9615384615386/x^41.0-1.0/1958.0377358490566*x^48.0+9.0*x^3.0-1.0/1656.0000000000002/x^44.0-1.0/2231.25*x^51.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-3444000.0*x^39.0-4736160.0/x^47.0-4512420.0*x^42.0-6079920.0/x^50.0-5811456.0*x^45.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-3444000.0*39.0*x^38.0-4736160.0*-47.0/x^48.0-4512420.0*42.0*x^41.0-6079920.0*-50.0/x^51.0-5811456.0*45.0*x^44.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1.34316E8*x^38.0+2.2259952E8/x^48.0-1.8952164E8*x^41.0+3.03996E8/x^51.0-2.6151552E8*x^44.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/1702.7999999999997*x^45.0+8.5*x^3.0-1.0/1423.9615384615386/x^41.0-1.0/1958.0377358490566*x^48.0+9.0*x^3.0-1.0/1656.0000000000002/x^44.0-1.0/2231.25*x^51.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/1702.7999999999997/46.0*x^46.0+8.5/4.0*x^4.0-1.0/1423.9615384615386/-40.0/x^40.0-1.0/1958.0377358490566/49.0*x^49.0+9.0/4.0*x^4.0-1.0/1656.0000000000002/-43.0/x^43.0-1.0/2231.25/52.0*x^52.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/78328.79999999999*x^46.0+2.125*x^4.0+1.0/56958.461538461546/x^40.0-1.0/95943.84905660378*x^49.0+2.25*x^4.0+1.0/71208.00000000001/x^43.0-1.0/116025.0*x^52.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120521() {
 UsageCalculus.TestCase = 120521;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+51+52/x^44-53*x^45+54+55/x^47-56*x^48+57*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-49+58/x^50";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "51.0+52.0/x^44.0-53.0*x^45.0+54.0+55.0/x^47.0-56.0*x^48.0+57.0+58.0/x^50.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+52.0*-44.0/x^45.0-53.0*45.0*x^44.0+54.0*0.0+55.0*-47.0/x^48.0-56.0*48.0*x^47.0+57.0*0.0+58.0*-50.0/x^51.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-2288.0/x^45.0-2385.0*x^44.0-2585.0/x^48.0-2688.0*x^47.0-2900.0/x^51.0";
 UsageCalculus.EqnSolArrayMap3[1] = "51.0+52.0/x^44.0-53.0*x^45.0+54.0+55.0/x^47.0-56.0*x^48.0+57.0+58.0/x^50.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "51.0*x+52.0/-43.0/x^43.0-53.0/46.0*x^46.0+54.0*x+55.0/-46.0/x^46.0-56.0/49.0*x^49.0+57.0*x+58.0/-49.0/x^49.0";
 UsageCalculus.EqnSolArrayMap4[1] = "51.0*x-1.2093023255813953/x^43.0-1.1521739130434783*x^46.0+54.0*x-1.1956521739130435/x^46.0-1.1428571428571428*x^49.0+57.0*x-1.183673469387755/x^49.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-2288.0/x^45.0-2385.0*x^44.0-2585.0/x^48.0-2688.0*x^47.0-2900.0/x^51.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-2288.0*-45.0/x^46.0-2385.0*44.0*x^43.0-2585.0*-48.0/x^49.0-2688.0*47.0*x^46.0-2900.0*-51.0/x^52.0";
 UsageCalculus.EqnSolArrayMap2[2] = "102960.0/x^46.0-104940.0*x^43.0+124080.0/x^49.0-126336.0*x^46.0+147900.0/x^52.0";
 UsageCalculus.EqnSolArrayMap3[2] = "51.0*x-1.2093023255813953/x^43.0-1.1521739130434783*x^46.0+54.0*x-1.1956521739130435/x^46.0-1.1428571428571428*x^49.0+57.0*x-1.183673469387755/x^49.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "51.0/2.0*x^2.0-1.2093023255813953/-42.0/x^42.0-1.1521739130434783/47.0*x^47.0+54.0/2.0*x^2.0-1.1956521739130435/-45.0/x^45.0-1.1428571428571428/50.0*x^50.0+57.0/2.0*x^2.0-1.183673469387755/-48.0/x^48.0";
 UsageCalculus.EqnSolArrayMap4[2] = "25.5*x^2.0+1.0/34.73076923076923/x^42.0-1.0/40.79245283018868*x^47.0+27.0*x^2.0+1.0/37.63636363636364/x^45.0-1.0/43.75*x^50.0+28.5*x^2.0+1.0/40.55172413793103/x^48.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "102960.0/x^46.0-104940.0*x^43.0+124080.0/x^49.0-126336.0*x^46.0+147900.0/x^52.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "102960.0*-46.0/x^47.0-104940.0*43.0*x^42.0+124080.0*-49.0/x^50.0-126336.0*46.0*x^45.0+147900.0*-52.0/x^53.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-4736160.0/x^47.0-4512420.0*x^42.0-6079920.0/x^50.0-5811456.0*x^45.0-7690800.0/x^53.0";
 UsageCalculus.EqnSolArrayMap3[3] = "25.5*x^2.0+1.0/34.73076923076923/x^42.0-1.0/40.79245283018868*x^47.0+27.0*x^2.0+1.0/37.63636363636364/x^45.0-1.0/43.75*x^50.0+28.5*x^2.0+1.0/40.55172413793103/x^48.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "25.5/3.0*x^3.0+1.0/34.73076923076923/-41.0/x^41.0-1.0/40.79245283018868/48.0*x^48.0+27.0/3.0*x^3.0+1.0/37.63636363636364/-44.0/x^44.0-1.0/43.75/51.0*x^51.0+28.5/3.0*x^3.0+1.0/40.55172413793103/-47.0/x^47.0";
 UsageCalculus.EqnSolArrayMap4[3] = "8.5*x^3.0-1.0/1423.9615384615386/x^41.0-1.0/1958.0377358490566*x^48.0+9.0*x^3.0-1.0/1656.0000000000002/x^44.0-1.0/2231.25*x^51.0+9.5*x^3.0-1.0/1905.9310344827586/x^47.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-4736160.0/x^47.0-4512420.0*x^42.0-6079920.0/x^50.0-5811456.0*x^45.0-7690800.0/x^53.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-4736160.0*-47.0/x^48.0-4512420.0*42.0*x^41.0-6079920.0*-50.0/x^51.0-5811456.0*45.0*x^44.0-7690800.0*-53.0/x^54.0";
 UsageCalculus.EqnSolArrayMap2[4] = "2.2259952E8/x^48.0-1.8952164E8*x^41.0+3.03996E8/x^51.0-2.6151552E8*x^44.0+4.076124E8/x^54.0";
 UsageCalculus.EqnSolArrayMap3[4] = "8.5*x^3.0-1.0/1423.9615384615386/x^41.0-1.0/1958.0377358490566*x^48.0+9.0*x^3.0-1.0/1656.0000000000002/x^44.0-1.0/2231.25*x^51.0+9.5*x^3.0-1.0/1905.9310344827586/x^47.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "8.5/4.0*x^4.0-1.0/1423.9615384615386/-40.0/x^40.0-1.0/1958.0377358490566/49.0*x^49.0+9.0/4.0*x^4.0-1.0/1656.0000000000002/-43.0/x^43.0-1.0/2231.25/52.0*x^52.0+9.5/4.0*x^4.0-1.0/1905.9310344827586/-46.0/x^46.0";
 UsageCalculus.EqnSolArrayMap4[4] = "2.125*x^4.0+1.0/56958.461538461546/x^40.0-1.0/95943.84905660378*x^49.0+2.25*x^4.0+1.0/71208.00000000001/x^43.0-1.0/116025.0*x^52.0+2.375*x^4.0+1.0/87672.8275862069/x^46.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120522() {
 UsageCalculus.TestCase = 120522;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+52/x^44-53*x^45+54+55/x^47-56*x^48+57*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-49+58/x^50-59*x^51+60*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-52";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "52.0/x^44.0-53.0*x^45.0+54.0+55.0/x^47.0-56.0*x^48.0+57.0+58.0/x^50.0-59.0*x^51.0+60.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "52.0*-44.0/x^45.0-53.0*45.0*x^44.0+54.0*0.0+55.0*-47.0/x^48.0-56.0*48.0*x^47.0+57.0*0.0+58.0*-50.0/x^51.0-59.0*51.0*x^50.0+60.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-2288.0/x^45.0-2385.0*x^44.0-2585.0/x^48.0-2688.0*x^47.0-2900.0/x^51.0-3009.0*x^50.0";
 UsageCalculus.EqnSolArrayMap3[1] = "52.0/x^44.0-53.0*x^45.0+54.0+55.0/x^47.0-56.0*x^48.0+57.0+58.0/x^50.0-59.0*x^51.0+60.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "52.0/-43.0/x^43.0-53.0/46.0*x^46.0+54.0*x+55.0/-46.0/x^46.0-56.0/49.0*x^49.0+57.0*x+58.0/-49.0/x^49.0-59.0/52.0*x^52.0+60.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.2093023255813953/x^43.0-1.1521739130434783*x^46.0+54.0*x-1.1956521739130435/x^46.0-1.1428571428571428*x^49.0+57.0*x-1.183673469387755/x^49.0-1.1346153846153846*x^52.0+60.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-2288.0/x^45.0-2385.0*x^44.0-2585.0/x^48.0-2688.0*x^47.0-2900.0/x^51.0-3009.0*x^50.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-2288.0*-45.0/x^46.0-2385.0*44.0*x^43.0-2585.0*-48.0/x^49.0-2688.0*47.0*x^46.0-2900.0*-51.0/x^52.0-3009.0*50.0*x^49.0";
 UsageCalculus.EqnSolArrayMap2[2] = "102960.0/x^46.0-104940.0*x^43.0+124080.0/x^49.0-126336.0*x^46.0+147900.0/x^52.0-150450.0*x^49.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.2093023255813953/x^43.0-1.1521739130434783*x^46.0+54.0*x-1.1956521739130435/x^46.0-1.1428571428571428*x^49.0+57.0*x-1.183673469387755/x^49.0-1.1346153846153846*x^52.0+60.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.2093023255813953/-42.0/x^42.0-1.1521739130434783/47.0*x^47.0+54.0/2.0*x^2.0-1.1956521739130435/-45.0/x^45.0-1.1428571428571428/50.0*x^50.0+57.0/2.0*x^2.0-1.183673469387755/-48.0/x^48.0-1.1346153846153846/53.0*x^53.0+60.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/34.73076923076923/x^42.0-1.0/40.79245283018868*x^47.0+27.0*x^2.0+1.0/37.63636363636364/x^45.0-1.0/43.75*x^50.0+28.5*x^2.0+1.0/40.55172413793103/x^48.0-1.0/46.71186440677966*x^53.0+30.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "102960.0/x^46.0-104940.0*x^43.0+124080.0/x^49.0-126336.0*x^46.0+147900.0/x^52.0-150450.0*x^49.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "102960.0*-46.0/x^47.0-104940.0*43.0*x^42.0+124080.0*-49.0/x^50.0-126336.0*46.0*x^45.0+147900.0*-52.0/x^53.0-150450.0*49.0*x^48.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-4736160.0/x^47.0-4512420.0*x^42.0-6079920.0/x^50.0-5811456.0*x^45.0-7690800.0/x^53.0-7372050.0*x^48.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/34.73076923076923/x^42.0-1.0/40.79245283018868*x^47.0+27.0*x^2.0+1.0/37.63636363636364/x^45.0-1.0/43.75*x^50.0+28.5*x^2.0+1.0/40.55172413793103/x^48.0-1.0/46.71186440677966*x^53.0+30.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/34.73076923076923/-41.0/x^41.0-1.0/40.79245283018868/48.0*x^48.0+27.0/3.0*x^3.0+1.0/37.63636363636364/-44.0/x^44.0-1.0/43.75/51.0*x^51.0+28.5/3.0*x^3.0+1.0/40.55172413793103/-47.0/x^47.0-1.0/46.71186440677966/54.0*x^54.0+30.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/1423.9615384615386/x^41.0-1.0/1958.0377358490566*x^48.0+9.0*x^3.0-1.0/1656.0000000000002/x^44.0-1.0/2231.25*x^51.0+9.5*x^3.0-1.0/1905.9310344827586/x^47.0-1.0/2522.4406779661017*x^54.0+10.0*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-4736160.0/x^47.0-4512420.0*x^42.0-6079920.0/x^50.0-5811456.0*x^45.0-7690800.0/x^53.0-7372050.0*x^48.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-4736160.0*-47.0/x^48.0-4512420.0*42.0*x^41.0-6079920.0*-50.0/x^51.0-5811456.0*45.0*x^44.0-7690800.0*-53.0/x^54.0-7372050.0*48.0*x^47.0";
 UsageCalculus.EqnSolArrayMap2[4] = "2.2259952E8/x^48.0-1.8952164E8*x^41.0+3.03996E8/x^51.0-2.6151552E8*x^44.0+4.076124E8/x^54.0-3.538584E8*x^47.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/1423.9615384615386/x^41.0-1.0/1958.0377358490566*x^48.0+9.0*x^3.0-1.0/1656.0000000000002/x^44.0-1.0/2231.25*x^51.0+9.5*x^3.0-1.0/1905.9310344827586/x^47.0-1.0/2522.4406779661017*x^54.0+10.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/1423.9615384615386/-40.0/x^40.0-1.0/1958.0377358490566/49.0*x^49.0+9.0/4.0*x^4.0-1.0/1656.0000000000002/-43.0/x^43.0-1.0/2231.25/52.0*x^52.0+9.5/4.0*x^4.0-1.0/1905.9310344827586/-46.0/x^46.0-1.0/2522.4406779661017/55.0*x^55.0+10.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/56958.461538461546/x^40.0-1.0/95943.84905660378*x^49.0+2.25*x^4.0+1.0/71208.00000000001/x^43.0-1.0/116025.0*x^52.0+2.375*x^4.0+1.0/87672.8275862069/x^46.0-1.0/138734.2372881356*x^55.0+2.5*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120523() {
 UsageCalculus.TestCase = 120523;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-53*x^45+54+55/x^47-56*x^48+57*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-49+58/x^50-59*x^51+60*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-52+61/x^53-62*x^54";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-53.0*x^45.0+54.0+55.0/x^47.0-56.0*x^48.0+57.0+58.0/x^50.0-59.0*x^51.0+60.0+61.0/x^53.0-62.0*x^54.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-53.0*45.0*x^44.0+54.0*0.0+55.0*-47.0/x^48.0-56.0*48.0*x^47.0+57.0*0.0+58.0*-50.0/x^51.0-59.0*51.0*x^50.0+60.0*0.0+61.0*-53.0/x^54.0-62.0*54.0*x^53.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-2385.0*x^44.0-2585.0/x^48.0-2688.0*x^47.0-2900.0/x^51.0-3009.0*x^50.0-3233.0/x^54.0-3348.0*x^53.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-53.0*x^45.0+54.0+55.0/x^47.0-56.0*x^48.0+57.0+58.0/x^50.0-59.0*x^51.0+60.0+61.0/x^53.0-62.0*x^54.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-53.0/46.0*x^46.0+54.0*x+55.0/-46.0/x^46.0-56.0/49.0*x^49.0+57.0*x+58.0/-49.0/x^49.0-59.0/52.0*x^52.0+60.0*x+61.0/-52.0/x^52.0-62.0/55.0*x^55.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.1521739130434783*x^46.0+54.0*x-1.1956521739130435/x^46.0-1.1428571428571428*x^49.0+57.0*x-1.183673469387755/x^49.0-1.1346153846153846*x^52.0+60.0*x-1.1730769230769231/x^52.0-1.1272727272727272*x^55.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-2385.0*x^44.0-2585.0/x^48.0-2688.0*x^47.0-2900.0/x^51.0-3009.0*x^50.0-3233.0/x^54.0-3348.0*x^53.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-2385.0*44.0*x^43.0-2585.0*-48.0/x^49.0-2688.0*47.0*x^46.0-2900.0*-51.0/x^52.0-3009.0*50.0*x^49.0-3233.0*-54.0/x^55.0-3348.0*53.0*x^52.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-104940.0*x^43.0+124080.0/x^49.0-126336.0*x^46.0+147900.0/x^52.0-150450.0*x^49.0+174582.0/x^55.0-177444.0*x^52.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.1521739130434783*x^46.0+54.0*x-1.1956521739130435/x^46.0-1.1428571428571428*x^49.0+57.0*x-1.183673469387755/x^49.0-1.1346153846153846*x^52.0+60.0*x-1.1730769230769231/x^52.0-1.1272727272727272*x^55.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.1521739130434783/47.0*x^47.0+54.0/2.0*x^2.0-1.1956521739130435/-45.0/x^45.0-1.1428571428571428/50.0*x^50.0+57.0/2.0*x^2.0-1.183673469387755/-48.0/x^48.0-1.1346153846153846/53.0*x^53.0+60.0/2.0*x^2.0-1.1730769230769231/-51.0/x^51.0-1.1272727272727272/56.0*x^56.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/40.79245283018868*x^47.0+27.0*x^2.0+1.0/37.63636363636364/x^45.0-1.0/43.75*x^50.0+28.5*x^2.0+1.0/40.55172413793103/x^48.0-1.0/46.71186440677966*x^53.0+30.0*x^2.0+1.0/43.47540983606557/x^51.0-1.0/49.67741935483871*x^56.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-104940.0*x^43.0+124080.0/x^49.0-126336.0*x^46.0+147900.0/x^52.0-150450.0*x^49.0+174582.0/x^55.0-177444.0*x^52.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-104940.0*43.0*x^42.0+124080.0*-49.0/x^50.0-126336.0*46.0*x^45.0+147900.0*-52.0/x^53.0-150450.0*49.0*x^48.0+174582.0*-55.0/x^56.0-177444.0*52.0*x^51.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-4512420.0*x^42.0-6079920.0/x^50.0-5811456.0*x^45.0-7690800.0/x^53.0-7372050.0*x^48.0-9602010.0/x^56.0-9227088.0*x^51.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/40.79245283018868*x^47.0+27.0*x^2.0+1.0/37.63636363636364/x^45.0-1.0/43.75*x^50.0+28.5*x^2.0+1.0/40.55172413793103/x^48.0-1.0/46.71186440677966*x^53.0+30.0*x^2.0+1.0/43.47540983606557/x^51.0-1.0/49.67741935483871*x^56.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/40.79245283018868/48.0*x^48.0+27.0/3.0*x^3.0+1.0/37.63636363636364/-44.0/x^44.0-1.0/43.75/51.0*x^51.0+28.5/3.0*x^3.0+1.0/40.55172413793103/-47.0/x^47.0-1.0/46.71186440677966/54.0*x^54.0+30.0/3.0*x^3.0+1.0/43.47540983606557/-50.0/x^50.0-1.0/49.67741935483871/57.0*x^57.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/1958.0377358490566*x^48.0+9.0*x^3.0-1.0/1656.0000000000002/x^44.0-1.0/2231.25*x^51.0+9.5*x^3.0-1.0/1905.9310344827586/x^47.0-1.0/2522.4406779661017*x^54.0+10.0*x^3.0-1.0/2173.7704918032787/x^50.0-1.0/2831.6129032258063*x^57.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-4512420.0*x^42.0-6079920.0/x^50.0-5811456.0*x^45.0-7690800.0/x^53.0-7372050.0*x^48.0-9602010.0/x^56.0-9227088.0*x^51.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-4512420.0*42.0*x^41.0-6079920.0*-50.0/x^51.0-5811456.0*45.0*x^44.0-7690800.0*-53.0/x^54.0-7372050.0*48.0*x^47.0-9602010.0*-56.0/x^57.0-9227088.0*51.0*x^50.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1.8952164E8*x^41.0+3.03996E8/x^51.0-2.6151552E8*x^44.0+4.076124E8/x^54.0-3.538584E8*x^47.0+5.3771256E8/x^57.0-4.70581488E8*x^50.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/1958.0377358490566*x^48.0+9.0*x^3.0-1.0/1656.0000000000002/x^44.0-1.0/2231.25*x^51.0+9.5*x^3.0-1.0/1905.9310344827586/x^47.0-1.0/2522.4406779661017*x^54.0+10.0*x^3.0-1.0/2173.7704918032787/x^50.0-1.0/2831.6129032258063*x^57.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/1958.0377358490566/49.0*x^49.0+9.0/4.0*x^4.0-1.0/1656.0000000000002/-43.0/x^43.0-1.0/2231.25/52.0*x^52.0+9.5/4.0*x^4.0-1.0/1905.9310344827586/-46.0/x^46.0-1.0/2522.4406779661017/55.0*x^55.0+10.0/4.0*x^4.0-1.0/2173.7704918032787/-49.0/x^49.0-1.0/2831.6129032258063/58.0*x^58.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/95943.84905660378*x^49.0+2.25*x^4.0+1.0/71208.00000000001/x^43.0-1.0/116025.0*x^52.0+2.375*x^4.0+1.0/87672.8275862069/x^46.0-1.0/138734.2372881356*x^55.0+2.5*x^4.0+1.0/106514.75409836066/x^49.0-1.0/164233.54838709676*x^58.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120524() {
 UsageCalculus.TestCase = 120524;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+54+55/xyz^47-56*xyz^48+57*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-49+58/xyz^50-59*xyz^51+60*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-52+61/xyz^53-62*xyz^54+63*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-55+64/xyz^56";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "54.0+55.0/xyz^47.0-56.0*xyz^48.0+57.0+58.0/xyz^50.0-59.0*xyz^51.0+60.0+61.0/xyz^53.0-62.0*xyz^54.0+63.0+64.0/xyz^56.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+55.0*-47.0/xyz^48.0-56.0*48.0*xyz^47.0+57.0*0.0+58.0*-50.0/xyz^51.0-59.0*51.0*xyz^50.0+60.0*0.0+61.0*-53.0/xyz^54.0-62.0*54.0*xyz^53.0+63.0*0.0+64.0*-56.0/xyz^57.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-2585.0/xyz^48.0-2688.0*xyz^47.0-2900.0/xyz^51.0-3009.0*xyz^50.0-3233.0/xyz^54.0-3348.0*xyz^53.0-3584.0/xyz^57.0";
 UsageCalculus.EqnSolArrayMap3[1] = "54.0+55.0/xyz^47.0-56.0*xyz^48.0+57.0+58.0/xyz^50.0-59.0*xyz^51.0+60.0+61.0/xyz^53.0-62.0*xyz^54.0+63.0+64.0/xyz^56.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "54.0*xyz+55.0/-46.0/xyz^46.0-56.0/49.0*xyz^49.0+57.0*xyz+58.0/-49.0/xyz^49.0-59.0/52.0*xyz^52.0+60.0*xyz+61.0/-52.0/xyz^52.0-62.0/55.0*xyz^55.0+63.0*xyz+64.0/-55.0/xyz^55.0";
 UsageCalculus.EqnSolArrayMap4[1] = "54.0*xyz-1.1956521739130435/xyz^46.0-1.1428571428571428*xyz^49.0+57.0*xyz-1.183673469387755/xyz^49.0-1.1346153846153846*xyz^52.0+60.0*xyz-1.1730769230769231/xyz^52.0-1.1272727272727272*xyz^55.0+63.0*xyz-1.1636363636363636/xyz^55.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-2585.0/xyz^48.0-2688.0*xyz^47.0-2900.0/xyz^51.0-3009.0*xyz^50.0-3233.0/xyz^54.0-3348.0*xyz^53.0-3584.0/xyz^57.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-2585.0*-48.0/xyz^49.0-2688.0*47.0*xyz^46.0-2900.0*-51.0/xyz^52.0-3009.0*50.0*xyz^49.0-3233.0*-54.0/xyz^55.0-3348.0*53.0*xyz^52.0-3584.0*-57.0/xyz^58.0";
 UsageCalculus.EqnSolArrayMap2[2] = "124080.0/xyz^49.0-126336.0*xyz^46.0+147900.0/xyz^52.0-150450.0*xyz^49.0+174582.0/xyz^55.0-177444.0*xyz^52.0+204288.0/xyz^58.0";
 UsageCalculus.EqnSolArrayMap3[2] = "54.0*xyz-1.1956521739130435/xyz^46.0-1.1428571428571428*xyz^49.0+57.0*xyz-1.183673469387755/xyz^49.0-1.1346153846153846*xyz^52.0+60.0*xyz-1.1730769230769231/xyz^52.0-1.1272727272727272*xyz^55.0+63.0*xyz-1.1636363636363636/xyz^55.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "54.0/2.0*xyz^2.0-1.1956521739130435/-45.0/xyz^45.0-1.1428571428571428/50.0*xyz^50.0+57.0/2.0*xyz^2.0-1.183673469387755/-48.0/xyz^48.0-1.1346153846153846/53.0*xyz^53.0+60.0/2.0*xyz^2.0-1.1730769230769231/-51.0/xyz^51.0-1.1272727272727272/56.0*xyz^56.0+63.0/2.0*xyz^2.0-1.1636363636363636/-54.0/xyz^54.0";
 UsageCalculus.EqnSolArrayMap4[2] = "27.0*xyz^2.0+1.0/37.63636363636364/xyz^45.0-1.0/43.75*xyz^50.0+28.5*xyz^2.0+1.0/40.55172413793103/xyz^48.0-1.0/46.71186440677966*xyz^53.0+30.0*xyz^2.0+1.0/43.47540983606557/xyz^51.0-1.0/49.67741935483871*xyz^56.0+31.5*xyz^2.0+1.0/46.40625/xyz^54.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "124080.0/xyz^49.0-126336.0*xyz^46.0+147900.0/xyz^52.0-150450.0*xyz^49.0+174582.0/xyz^55.0-177444.0*xyz^52.0+204288.0/xyz^58.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "124080.0*-49.0/xyz^50.0-126336.0*46.0*xyz^45.0+147900.0*-52.0/xyz^53.0-150450.0*49.0*xyz^48.0+174582.0*-55.0/xyz^56.0-177444.0*52.0*xyz^51.0+204288.0*-58.0/xyz^59.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-6079920.0/xyz^50.0-5811456.0*xyz^45.0-7690800.0/xyz^53.0-7372050.0*xyz^48.0-9602010.0/xyz^56.0-9227088.0*xyz^51.0-1.1848704E7/xyz^59.0";
 UsageCalculus.EqnSolArrayMap3[3] = "27.0*xyz^2.0+1.0/37.63636363636364/xyz^45.0-1.0/43.75*xyz^50.0+28.5*xyz^2.0+1.0/40.55172413793103/xyz^48.0-1.0/46.71186440677966*xyz^53.0+30.0*xyz^2.0+1.0/43.47540983606557/xyz^51.0-1.0/49.67741935483871*xyz^56.0+31.5*xyz^2.0+1.0/46.40625/xyz^54.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "27.0/3.0*xyz^3.0+1.0/37.63636363636364/-44.0/xyz^44.0-1.0/43.75/51.0*xyz^51.0+28.5/3.0*xyz^3.0+1.0/40.55172413793103/-47.0/xyz^47.0-1.0/46.71186440677966/54.0*xyz^54.0+30.0/3.0*xyz^3.0+1.0/43.47540983606557/-50.0/xyz^50.0-1.0/49.67741935483871/57.0*xyz^57.0+31.5/3.0*xyz^3.0+1.0/46.40625/-53.0/xyz^53.0";
 UsageCalculus.EqnSolArrayMap4[3] = "9.0*xyz^3.0-1.0/1656.0000000000002/xyz^44.0-1.0/2231.25*xyz^51.0+9.5*xyz^3.0-1.0/1905.9310344827586/xyz^47.0-1.0/2522.4406779661017*xyz^54.0+10.0*xyz^3.0-1.0/2173.7704918032787/xyz^50.0-1.0/2831.6129032258063*xyz^57.0+10.5*xyz^3.0-1.0/2459.53125/xyz^53.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-6079920.0/xyz^50.0-5811456.0*xyz^45.0-7690800.0/xyz^53.0-7372050.0*xyz^48.0-9602010.0/xyz^56.0-9227088.0*xyz^51.0-1.1848704E7/xyz^59.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-6079920.0*-50.0/xyz^51.0-5811456.0*45.0*xyz^44.0-7690800.0*-53.0/xyz^54.0-7372050.0*48.0*xyz^47.0-9602010.0*-56.0/xyz^57.0-9227088.0*51.0*xyz^50.0-0.0*-59.0/xyz^60.0";
 UsageCalculus.EqnSolArrayMap2[4] = "3.03996E8/xyz^51.0-2.6151552E8*xyz^44.0+4.076124E8/xyz^54.0-3.538584E8*xyz^47.0+5.3771256E8/xyz^57.0-4.70581488E8*xyz^50.0+0.0/xyz^60.0";
 UsageCalculus.EqnSolArrayMap3[4] = "9.0*xyz^3.0-1.0/1656.0000000000002/xyz^44.0-1.0/2231.25*xyz^51.0+9.5*xyz^3.0-1.0/1905.9310344827586/xyz^47.0-1.0/2522.4406779661017*xyz^54.0+10.0*xyz^3.0-1.0/2173.7704918032787/xyz^50.0-1.0/2831.6129032258063*xyz^57.0+10.5*xyz^3.0-1.0/2459.53125/xyz^53.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "9.0/4.0*xyz^4.0-1.0/1656.0000000000002/-43.0/xyz^43.0-1.0/2231.25/52.0*xyz^52.0+9.5/4.0*xyz^4.0-1.0/1905.9310344827586/-46.0/xyz^46.0-1.0/2522.4406779661017/55.0*xyz^55.0+10.0/4.0*xyz^4.0-1.0/2173.7704918032787/-49.0/xyz^49.0-1.0/2831.6129032258063/58.0*xyz^58.0+10.5/4.0*xyz^4.0-1.0/2459.53125/-52.0/xyz^52.0";
 UsageCalculus.EqnSolArrayMap4[4] = "2.25*xyz^4.0+1.0/71208.00000000001/xyz^43.0-1.0/116025.0*xyz^52.0+2.375*xyz^4.0+1.0/87672.8275862069/xyz^46.0-1.0/138734.2372881356*xyz^55.0+2.5*xyz^4.0+1.0/106514.75409836066/xyz^49.0-1.0/164233.54838709676*xyz^58.0+2.625*xyz^4.0+1.0/127895.625/xyz^52.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120525() {
 UsageCalculus.TestCase = 120525;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+55/x^47-56*x^48+57*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-49+58/x^50-59*x^51+60*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-52+61/x^53-62*x^54+63*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-55+64/x^56-65*x^57+66";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "55.0/x^47.0-56.0*x^48.0+57.0+58.0/x^50.0-59.0*x^51.0+60.0+61.0/x^53.0-62.0*x^54.0+63.0+64.0/x^56.0-65.0*x^57.0+66.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "55.0*-47.0/x^48.0-56.0*48.0*x^47.0+57.0*0.0+58.0*-50.0/x^51.0-59.0*51.0*x^50.0+60.0*0.0+61.0*-53.0/x^54.0-62.0*54.0*x^53.0+63.0*0.0+64.0*-56.0/x^57.0-65.0*57.0*x^56.0+66.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-2585.0/x^48.0-2688.0*x^47.0-2900.0/x^51.0-3009.0*x^50.0-3233.0/x^54.0-3348.0*x^53.0-3584.0/x^57.0-3705.0*x^56.0";
 UsageCalculus.EqnSolArrayMap3[1] = "55.0/x^47.0-56.0*x^48.0+57.0+58.0/x^50.0-59.0*x^51.0+60.0+61.0/x^53.0-62.0*x^54.0+63.0+64.0/x^56.0-65.0*x^57.0+66.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "55.0/-46.0/x^46.0-56.0/49.0*x^49.0+57.0*x+58.0/-49.0/x^49.0-59.0/52.0*x^52.0+60.0*x+61.0/-52.0/x^52.0-62.0/55.0*x^55.0+63.0*x+64.0/-55.0/x^55.0-65.0/58.0*x^58.0+66.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.1956521739130435/x^46.0-1.1428571428571428*x^49.0+57.0*x-1.183673469387755/x^49.0-1.1346153846153846*x^52.0+60.0*x-1.1730769230769231/x^52.0-1.1272727272727272*x^55.0+63.0*x-1.1636363636363636/x^55.0-1.1206896551724137*x^58.0+66.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-2585.0/x^48.0-2688.0*x^47.0-2900.0/x^51.0-3009.0*x^50.0-3233.0/x^54.0-3348.0*x^53.0-3584.0/x^57.0-3705.0*x^56.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-2585.0*-48.0/x^49.0-2688.0*47.0*x^46.0-2900.0*-51.0/x^52.0-3009.0*50.0*x^49.0-3233.0*-54.0/x^55.0-3348.0*53.0*x^52.0-3584.0*-57.0/x^58.0-3705.0*56.0*x^55.0";
 UsageCalculus.EqnSolArrayMap2[2] = "124080.0/x^49.0-126336.0*x^46.0+147900.0/x^52.0-150450.0*x^49.0+174582.0/x^55.0-177444.0*x^52.0+204288.0/x^58.0-207480.0*x^55.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.1956521739130435/x^46.0-1.1428571428571428*x^49.0+57.0*x-1.183673469387755/x^49.0-1.1346153846153846*x^52.0+60.0*x-1.1730769230769231/x^52.0-1.1272727272727272*x^55.0+63.0*x-1.1636363636363636/x^55.0-1.1206896551724137*x^58.0+66.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.1956521739130435/-45.0/x^45.0-1.1428571428571428/50.0*x^50.0+57.0/2.0*x^2.0-1.183673469387755/-48.0/x^48.0-1.1346153846153846/53.0*x^53.0+60.0/2.0*x^2.0-1.1730769230769231/-51.0/x^51.0-1.1272727272727272/56.0*x^56.0+63.0/2.0*x^2.0-1.1636363636363636/-54.0/x^54.0-1.1206896551724137/59.0*x^59.0+66.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/37.63636363636364/x^45.0-1.0/43.75*x^50.0+28.5*x^2.0+1.0/40.55172413793103/x^48.0-1.0/46.71186440677966*x^53.0+30.0*x^2.0+1.0/43.47540983606557/x^51.0-1.0/49.67741935483871*x^56.0+31.5*x^2.0+1.0/46.40625/x^54.0-1.0/52.64615384615385*x^59.0+33.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "124080.0/x^49.0-126336.0*x^46.0+147900.0/x^52.0-150450.0*x^49.0+174582.0/x^55.0-177444.0*x^52.0+204288.0/x^58.0-207480.0*x^55.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "124080.0*-49.0/x^50.0-126336.0*46.0*x^45.0+147900.0*-52.0/x^53.0-150450.0*49.0*x^48.0+174582.0*-55.0/x^56.0-177444.0*52.0*x^51.0+204288.0*-58.0/x^59.0-207480.0*55.0*x^54.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-6079920.0/x^50.0-5811456.0*x^45.0-7690800.0/x^53.0-7372050.0*x^48.0-9602010.0/x^56.0-9227088.0*x^51.0-1.1848704E7/x^59.0-1.14114E7*x^54.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/37.63636363636364/x^45.0-1.0/43.75*x^50.0+28.5*x^2.0+1.0/40.55172413793103/x^48.0-1.0/46.71186440677966*x^53.0+30.0*x^2.0+1.0/43.47540983606557/x^51.0-1.0/49.67741935483871*x^56.0+31.5*x^2.0+1.0/46.40625/x^54.0-1.0/52.64615384615385*x^59.0+33.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/37.63636363636364/-44.0/x^44.0-1.0/43.75/51.0*x^51.0+28.5/3.0*x^3.0+1.0/40.55172413793103/-47.0/x^47.0-1.0/46.71186440677966/54.0*x^54.0+30.0/3.0*x^3.0+1.0/43.47540983606557/-50.0/x^50.0-1.0/49.67741935483871/57.0*x^57.0+31.5/3.0*x^3.0+1.0/46.40625/-53.0/x^53.0-1.0/52.64615384615385/60.0*x^60.0+33.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/1656.0000000000002/x^44.0-1.0/2231.25*x^51.0+9.5*x^3.0-1.0/1905.9310344827586/x^47.0-1.0/2522.4406779661017*x^54.0+10.0*x^3.0-1.0/2173.7704918032787/x^50.0-1.0/2831.6129032258063*x^57.0+10.5*x^3.0-1.0/2459.53125/x^53.0-1.0/3158.769230769231*x^60.0+11.0*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-6079920.0/x^50.0-5811456.0*x^45.0-7690800.0/x^53.0-7372050.0*x^48.0-9602010.0/x^56.0-9227088.0*x^51.0-1.1848704E7/x^59.0-1.14114E7*x^54.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-6079920.0*-50.0/x^51.0-5811456.0*45.0*x^44.0-7690800.0*-53.0/x^54.0-7372050.0*48.0*x^47.0-9602010.0*-56.0/x^57.0-9227088.0*51.0*x^50.0-0.0*-59.0/x^60.0-0.0*54.0*x^53.0";
 UsageCalculus.EqnSolArrayMap2[4] = "3.03996E8/x^51.0-2.6151552E8*x^44.0+4.076124E8/x^54.0-3.538584E8*x^47.0+5.3771256E8/x^57.0-4.70581488E8*x^50.0+0.0/x^60.0-0.0*x^53.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/1656.0000000000002/x^44.0-1.0/2231.25*x^51.0+9.5*x^3.0-1.0/1905.9310344827586/x^47.0-1.0/2522.4406779661017*x^54.0+10.0*x^3.0-1.0/2173.7704918032787/x^50.0-1.0/2831.6129032258063*x^57.0+10.5*x^3.0-1.0/2459.53125/x^53.0-1.0/3158.769230769231*x^60.0+11.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/1656.0000000000002/-43.0/x^43.0-1.0/2231.25/52.0*x^52.0+9.5/4.0*x^4.0-1.0/1905.9310344827586/-46.0/x^46.0-1.0/2522.4406779661017/55.0*x^55.0+10.0/4.0*x^4.0-1.0/2173.7704918032787/-49.0/x^49.0-1.0/2831.6129032258063/58.0*x^58.0+10.5/4.0*x^4.0-1.0/2459.53125/-52.0/x^52.0-1.0/3158.769230769231/61.0*x^61.0+11.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/71208.00000000001/x^43.0-1.0/116025.0*x^52.0+2.375*x^4.0+1.0/87672.8275862069/x^46.0-1.0/138734.2372881356*x^55.0+2.5*x^4.0+1.0/106514.75409836066/x^49.0-1.0/164233.54838709676*x^58.0+2.625*x^4.0+1.0/127895.625/x^52.0-1.0/192684.9230769231*x^61.0+2.75*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120526() {
 UsageCalculus.TestCase = 120526;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-56+57*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-49+58-59+60*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-52+61-62+63*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-55+64-65+66+67-68";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-56.0+57.0+58.0-59.0+60.0+61.0-62.0+63.0+64.0-65.0+66.0+67.0-68.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0+57.0*0.0+58.0*0.0-59.0*0.0+60.0*0.0+61.0*0.0-62.0*0.0+63.0*0.0+64.0*0.0-65.0*0.0+66.0*0.0+67.0*0.0-68.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "-56.0+57.0+58.0-59.0+60.0+61.0-62.0+63.0+64.0-65.0+66.0+67.0-68.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-56.0*x+57.0*x+58.0*x-59.0*x+60.0*x+61.0*x-62.0*x+63.0*x+64.0*x-65.0*x+66.0*x+67.0*x-68.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "-56.0*x+57.0*x+58.0*x-59.0*x+60.0*x+61.0*x-62.0*x+63.0*x+64.0*x-65.0*x+66.0*x+67.0*x-68.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "-56.0*x+57.0*x+58.0*x-59.0*x+60.0*x+61.0*x-62.0*x+63.0*x+64.0*x-65.0*x+66.0*x+67.0*x-68.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-56.0/2.0*x^2.0+57.0/2.0*x^2.0+58.0/2.0*x^2.0-59.0/2.0*x^2.0+60.0/2.0*x^2.0+61.0/2.0*x^2.0-62.0/2.0*x^2.0+63.0/2.0*x^2.0+64.0/2.0*x^2.0-65.0/2.0*x^2.0+66.0/2.0*x^2.0+67.0/2.0*x^2.0-68.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-28.0*x^2.0+28.5*x^2.0+29.0*x^2.0-29.5*x^2.0+30.0*x^2.0+30.5*x^2.0-31.0*x^2.0+31.5*x^2.0+32.0*x^2.0-32.5*x^2.0+33.0*x^2.0+33.5*x^2.0-34.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "-28.0*x^2.0+28.5*x^2.0+29.0*x^2.0-29.5*x^2.0+30.0*x^2.0+30.5*x^2.0-31.0*x^2.0+31.5*x^2.0+32.0*x^2.0-32.5*x^2.0+33.0*x^2.0+33.5*x^2.0-34.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-28.0/3.0*x^3.0+28.5/3.0*x^3.0+29.0/3.0*x^3.0-29.5/3.0*x^3.0+30.0/3.0*x^3.0+30.5/3.0*x^3.0-31.0/3.0*x^3.0+31.5/3.0*x^3.0+32.0/3.0*x^3.0-32.5/3.0*x^3.0+33.0/3.0*x^3.0+33.5/3.0*x^3.0-34.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-9.333333333333334*x^3.0+9.5*x^3.0+9.666666666666666*x^3.0-9.833333333333334*x^3.0+10.0*x^3.0+10.166666666666666*x^3.0-10.333333333333334*x^3.0+10.5*x^3.0+10.666666666666666*x^3.0-10.833333333333334*x^3.0+11.0*x^3.0+11.166666666666666*x^3.0-11.333333333333334*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "-9.333333333333334*x^3.0+9.5*x^3.0+9.666666666666666*x^3.0-9.833333333333334*x^3.0+10.0*x^3.0+10.166666666666666*x^3.0-10.333333333333334*x^3.0+10.5*x^3.0+10.666666666666666*x^3.0-10.833333333333334*x^3.0+11.0*x^3.0+11.166666666666666*x^3.0-11.333333333333334*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-9.333333333333334/4.0*x^4.0+9.5/4.0*x^4.0+9.666666666666666/4.0*x^4.0-9.833333333333334/4.0*x^4.0+10.0/4.0*x^4.0+10.166666666666666/4.0*x^4.0-10.333333333333334/4.0*x^4.0+10.5/4.0*x^4.0+10.666666666666666/4.0*x^4.0-10.833333333333334/4.0*x^4.0+11.0/4.0*x^4.0+11.166666666666666/4.0*x^4.0-11.333333333333334/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-2.3333333333333335*x^4.0+2.375*x^4.0+2.4166666666666665*x^4.0-2.4583333333333335*x^4.0+2.5*x^4.0+2.5416666666666665*x^4.0-2.5833333333333335*x^4.0+2.625*x^4.0+2.6666666666666665*x^4.0-2.7083333333333335*x^4.0+2.75*x^4.0+2.7916666666666665*x^4.0-2.8333333333333335*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120527() {
 UsageCalculus.TestCase = 120527;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+57*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-49+58/x^50-59*x^51+60*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-52+61/x^53-62*x^54+63*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-55+64/x^56-65*x^57+66+67/x^59-68*x^60+69+70/x^62";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "57.0+58.0/x^50.0-59.0*x^51.0+60.0+61.0/x^53.0-62.0*x^54.0+63.0+64.0/x^56.0-65.0*x^57.0+66.0+67.0/x^59.0-68.0*x^60.0+69.0+70.0/x^62.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+58.0*-50.0/x^51.0-59.0*51.0*x^50.0+60.0*0.0+61.0*-53.0/x^54.0-62.0*54.0*x^53.0+63.0*0.0+64.0*-56.0/x^57.0-65.0*57.0*x^56.0+66.0*0.0+67.0*-59.0/x^60.0-68.0*60.0*x^59.0+69.0*0.0+70.0*-62.0/x^63.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-2900.0/x^51.0-3009.0*x^50.0-3233.0/x^54.0-3348.0*x^53.0-3584.0/x^57.0-3705.0*x^56.0-3953.0/x^60.0-4080.0*x^59.0-4340.0/x^63.0";
 UsageCalculus.EqnSolArrayMap3[1] = "57.0+58.0/x^50.0-59.0*x^51.0+60.0+61.0/x^53.0-62.0*x^54.0+63.0+64.0/x^56.0-65.0*x^57.0+66.0+67.0/x^59.0-68.0*x^60.0+69.0+70.0/x^62.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "57.0*x+58.0/-49.0/x^49.0-59.0/52.0*x^52.0+60.0*x+61.0/-52.0/x^52.0-62.0/55.0*x^55.0+63.0*x+64.0/-55.0/x^55.0-65.0/58.0*x^58.0+66.0*x+67.0/-58.0/x^58.0-68.0/61.0*x^61.0+69.0*x+70.0/-61.0/x^61.0";
 UsageCalculus.EqnSolArrayMap4[1] = "57.0*x-1.183673469387755/x^49.0-1.1346153846153846*x^52.0+60.0*x-1.1730769230769231/x^52.0-1.1272727272727272*x^55.0+63.0*x-1.1636363636363636/x^55.0-1.1206896551724137*x^58.0+66.0*x-1.1551724137931034/x^58.0-1.1147540983606556*x^61.0+69.0*x-1.1475409836065573/x^61.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-2900.0/x^51.0-3009.0*x^50.0-3233.0/x^54.0-3348.0*x^53.0-3584.0/x^57.0-3705.0*x^56.0-3953.0/x^60.0-4080.0*x^59.0-4340.0/x^63.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-2900.0*-51.0/x^52.0-3009.0*50.0*x^49.0-3233.0*-54.0/x^55.0-3348.0*53.0*x^52.0-3584.0*-57.0/x^58.0-3705.0*56.0*x^55.0-3953.0*-60.0/x^61.0-4080.0*59.0*x^58.0-4340.0*-63.0/x^64.0";
 UsageCalculus.EqnSolArrayMap2[2] = "147900.0/x^52.0-150450.0*x^49.0+174582.0/x^55.0-177444.0*x^52.0+204288.0/x^58.0-207480.0*x^55.0+237180.0/x^61.0-240720.0*x^58.0+273420.0/x^64.0";
 UsageCalculus.EqnSolArrayMap3[2] = "57.0*x-1.183673469387755/x^49.0-1.1346153846153846*x^52.0+60.0*x-1.1730769230769231/x^52.0-1.1272727272727272*x^55.0+63.0*x-1.1636363636363636/x^55.0-1.1206896551724137*x^58.0+66.0*x-1.1551724137931034/x^58.0-1.1147540983606556*x^61.0+69.0*x-1.1475409836065573/x^61.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "57.0/2.0*x^2.0-1.183673469387755/-48.0/x^48.0-1.1346153846153846/53.0*x^53.0+60.0/2.0*x^2.0-1.1730769230769231/-51.0/x^51.0-1.1272727272727272/56.0*x^56.0+63.0/2.0*x^2.0-1.1636363636363636/-54.0/x^54.0-1.1206896551724137/59.0*x^59.0+66.0/2.0*x^2.0-1.1551724137931034/-57.0/x^57.0-1.1147540983606556/62.0*x^62.0+69.0/2.0*x^2.0-1.1475409836065573/-60.0/x^60.0";
 UsageCalculus.EqnSolArrayMap4[2] = "28.5*x^2.0+1.0/40.55172413793103/x^48.0-1.0/46.71186440677966*x^53.0+30.0*x^2.0+1.0/43.47540983606557/x^51.0-1.0/49.67741935483871*x^56.0+31.5*x^2.0+1.0/46.40625/x^54.0-1.0/52.64615384615385*x^59.0+33.0*x^2.0+1.0/49.343283582089555/x^57.0-1.0/55.617647058823536*x^62.0+34.5*x^2.0+1.0/52.28571428571429/x^60.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "147900.0/x^52.0-150450.0*x^49.0+174582.0/x^55.0-177444.0*x^52.0+204288.0/x^58.0-207480.0*x^55.0+237180.0/x^61.0-240720.0*x^58.0+273420.0/x^64.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "147900.0*-52.0/x^53.0-150450.0*49.0*x^48.0+174582.0*-55.0/x^56.0-177444.0*52.0*x^51.0+204288.0*-58.0/x^59.0-207480.0*55.0*x^54.0+237180.0*-61.0/x^62.0-240720.0*58.0*x^57.0+273420.0*-64.0/x^65.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-7690800.0/x^53.0-7372050.0*x^48.0-9602010.0/x^56.0-9227088.0*x^51.0-1.1848704E7/x^59.0-1.14114E7*x^54.0-1.446798E7/x^62.0-1.396176E7*x^57.0-1.749888E7/x^65.0";
 UsageCalculus.EqnSolArrayMap3[3] = "28.5*x^2.0+1.0/40.55172413793103/x^48.0-1.0/46.71186440677966*x^53.0+30.0*x^2.0+1.0/43.47540983606557/x^51.0-1.0/49.67741935483871*x^56.0+31.5*x^2.0+1.0/46.40625/x^54.0-1.0/52.64615384615385*x^59.0+33.0*x^2.0+1.0/49.343283582089555/x^57.0-1.0/55.617647058823536*x^62.0+34.5*x^2.0+1.0/52.28571428571429/x^60.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "28.5/3.0*x^3.0+1.0/40.55172413793103/-47.0/x^47.0-1.0/46.71186440677966/54.0*x^54.0+30.0/3.0*x^3.0+1.0/43.47540983606557/-50.0/x^50.0-1.0/49.67741935483871/57.0*x^57.0+31.5/3.0*x^3.0+1.0/46.40625/-53.0/x^53.0-1.0/52.64615384615385/60.0*x^60.0+33.0/3.0*x^3.0+1.0/49.343283582089555/-56.0/x^56.0-1.0/55.617647058823536/63.0*x^63.0+34.5/3.0*x^3.0+1.0/52.28571428571429/-59.0/x^59.0";
 UsageCalculus.EqnSolArrayMap4[3] = "9.5*x^3.0-1.0/1905.9310344827586/x^47.0-1.0/2522.4406779661017*x^54.0+10.0*x^3.0-1.0/2173.7704918032787/x^50.0-1.0/2831.6129032258063*x^57.0+10.5*x^3.0-1.0/2459.53125/x^53.0-1.0/3158.769230769231*x^60.0+11.0*x^3.0-1.0/2763.223880597015/x^56.0-1.0/3503.911764705883*x^63.0+11.5*x^3.0-1.0/3084.857142857143/x^59.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-7690800.0/x^53.0-7372050.0*x^48.0-9602010.0/x^56.0-9227088.0*x^51.0-1.1848704E7/x^59.0-1.14114E7*x^54.0-1.446798E7/x^62.0-1.396176E7*x^57.0-1.749888E7/x^65.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-7690800.0*-53.0/x^54.0-7372050.0*48.0*x^47.0-9602010.0*-56.0/x^57.0-9227088.0*51.0*x^50.0-0.0*-59.0/x^60.0-54.0*x^53.0-0.0*-62.0/x^63.0-57.0*x^56.0-0.0*-65.0/x^66.0";
 UsageCalculus.EqnSolArrayMap2[4] = "4.076124E8/x^54.0-3.538584E8*x^47.0+5.3771256E8/x^57.0-4.70581488E8*x^50.0+0.0/x^60.0-54.0*x^53.0+0.0/x^63.0-57.0*x^56.0+0.0/x^66.0";
 UsageCalculus.EqnSolArrayMap3[4] = "9.5*x^3.0-1.0/1905.9310344827586/x^47.0-1.0/2522.4406779661017*x^54.0+10.0*x^3.0-1.0/2173.7704918032787/x^50.0-1.0/2831.6129032258063*x^57.0+10.5*x^3.0-1.0/2459.53125/x^53.0-1.0/3158.769230769231*x^60.0+11.0*x^3.0-1.0/2763.223880597015/x^56.0-1.0/3503.911764705883*x^63.0+11.5*x^3.0-1.0/3084.857142857143/x^59.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "9.5/4.0*x^4.0-1.0/1905.9310344827586/-46.0/x^46.0-1.0/2522.4406779661017/55.0*x^55.0+10.0/4.0*x^4.0-1.0/2173.7704918032787/-49.0/x^49.0-1.0/2831.6129032258063/58.0*x^58.0+10.5/4.0*x^4.0-1.0/2459.53125/-52.0/x^52.0-1.0/3158.769230769231/61.0*x^61.0+11.0/4.0*x^4.0-1.0/2763.223880597015/-55.0/x^55.0-1.0/3503.911764705883/64.0*x^64.0+11.5/4.0*x^4.0-1.0/3084.857142857143/-58.0/x^58.0";
 UsageCalculus.EqnSolArrayMap4[4] = "2.375*x^4.0+1.0/87672.8275862069/x^46.0-1.0/138734.2372881356*x^55.0+2.5*x^4.0+1.0/106514.75409836066/x^49.0-1.0/164233.54838709676*x^58.0+2.625*x^4.0+1.0/127895.625/x^52.0-1.0/192684.9230769231*x^61.0+2.75*x^4.0+1.0/151977.31343283583/x^55.0-1.0/224250.3529411765*x^64.0+2.875*x^4.0+1.0/178921.7142857143/x^58.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120528() {
 UsageCalculus.TestCase = 120528;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+58/xy^50-59*xy^51+60*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-52+61/xy^53-62*xy^54+63*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-55+64/xy^56-65*xy^57+66+67/xy^59-68*xy^60+69+70/xy^62-71*xy^63+72*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-64";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "58.0/xy^50.0-59.0*xy^51.0+60.0+61.0/xy^53.0-62.0*xy^54.0+63.0+64.0/xy^56.0-65.0*xy^57.0+66.0+67.0/xy^59.0-68.0*xy^60.0+69.0+70.0/xy^62.0-71.0*xy^63.0+72.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "58.0*-50.0/xy^51.0-59.0*51.0*xy^50.0+60.0*0.0+61.0*-53.0/xy^54.0-62.0*54.0*xy^53.0+63.0*0.0+64.0*-56.0/xy^57.0-65.0*57.0*xy^56.0+66.0*0.0+67.0*-59.0/xy^60.0-68.0*60.0*xy^59.0+69.0*0.0+70.0*-62.0/xy^63.0-71.0*63.0*xy^62.0+72.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-2900.0/xy^51.0-3009.0*xy^50.0-3233.0/xy^54.0-3348.0*xy^53.0-3584.0/xy^57.0-3705.0*xy^56.0-3953.0/xy^60.0-4080.0*xy^59.0-4340.0/xy^63.0-4473.0*xy^62.0";
 UsageCalculus.EqnSolArrayMap3[1] = "58.0/xy^50.0-59.0*xy^51.0+60.0+61.0/xy^53.0-62.0*xy^54.0+63.0+64.0/xy^56.0-65.0*xy^57.0+66.0+67.0/xy^59.0-68.0*xy^60.0+69.0+70.0/xy^62.0-71.0*xy^63.0+72.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "58.0/-49.0/xy^49.0-59.0/52.0*xy^52.0+60.0*xy+61.0/-52.0/xy^52.0-62.0/55.0*xy^55.0+63.0*xy+64.0/-55.0/xy^55.0-65.0/58.0*xy^58.0+66.0*xy+67.0/-58.0/xy^58.0-68.0/61.0*xy^61.0+69.0*xy+70.0/-61.0/xy^61.0-71.0/64.0*xy^64.0+72.0*xy";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.183673469387755/xy^49.0-1.1346153846153846*xy^52.0+60.0*xy-1.1730769230769231/xy^52.0-1.1272727272727272*xy^55.0+63.0*xy-1.1636363636363636/xy^55.0-1.1206896551724137*xy^58.0+66.0*xy-1.1551724137931034/xy^58.0-1.1147540983606556*xy^61.0+69.0*xy-1.1475409836065573/xy^61.0-1.109375*xy^64.0+72.0*xy";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-2900.0/xy^51.0-3009.0*xy^50.0-3233.0/xy^54.0-3348.0*xy^53.0-3584.0/xy^57.0-3705.0*xy^56.0-3953.0/xy^60.0-4080.0*xy^59.0-4340.0/xy^63.0-4473.0*xy^62.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-2900.0*-51.0/xy^52.0-3009.0*50.0*xy^49.0-3233.0*-54.0/xy^55.0-3348.0*53.0*xy^52.0-3584.0*-57.0/xy^58.0-3705.0*56.0*xy^55.0-3953.0*-60.0/xy^61.0-4080.0*59.0*xy^58.0-4340.0*-63.0/xy^64.0-4473.0*62.0*xy^61.0";
 UsageCalculus.EqnSolArrayMap2[2] = "147900.0/xy^52.0-150450.0*xy^49.0+174582.0/xy^55.0-177444.0*xy^52.0+204288.0/xy^58.0-207480.0*xy^55.0+237180.0/xy^61.0-240720.0*xy^58.0+273420.0/xy^64.0-277326.0*xy^61.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.183673469387755/xy^49.0-1.1346153846153846*xy^52.0+60.0*xy-1.1730769230769231/xy^52.0-1.1272727272727272*xy^55.0+63.0*xy-1.1636363636363636/xy^55.0-1.1206896551724137*xy^58.0+66.0*xy-1.1551724137931034/xy^58.0-1.1147540983606556*xy^61.0+69.0*xy-1.1475409836065573/xy^61.0-1.109375*xy^64.0+72.0*xy";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.183673469387755/-48.0/xy^48.0-1.1346153846153846/53.0*xy^53.0+60.0/2.0*xy^2.0-1.1730769230769231/-51.0/xy^51.0-1.1272727272727272/56.0*xy^56.0+63.0/2.0*xy^2.0-1.1636363636363636/-54.0/xy^54.0-1.1206896551724137/59.0*xy^59.0+66.0/2.0*xy^2.0-1.1551724137931034/-57.0/xy^57.0-1.1147540983606556/62.0*xy^62.0+69.0/2.0*xy^2.0-1.1475409836065573/-60.0/xy^60.0-1.109375/65.0*xy^65.0+72.0/2.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/40.55172413793103/xy^48.0-1.0/46.71186440677966*xy^53.0+30.0*xy^2.0+1.0/43.47540983606557/xy^51.0-1.0/49.67741935483871*xy^56.0+31.5*xy^2.0+1.0/46.40625/xy^54.0-1.0/52.64615384615385*xy^59.0+33.0*xy^2.0+1.0/49.343283582089555/xy^57.0-1.0/55.617647058823536*xy^62.0+34.5*xy^2.0+1.0/52.28571428571429/xy^60.0-1.0/58.59154929577465*xy^65.0+36.0*xy^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "147900.0/xy^52.0-150450.0*xy^49.0+174582.0/xy^55.0-177444.0*xy^52.0+204288.0/xy^58.0-207480.0*xy^55.0+237180.0/xy^61.0-240720.0*xy^58.0+273420.0/xy^64.0-277326.0*xy^61.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "147900.0*-52.0/xy^53.0-150450.0*49.0*xy^48.0+174582.0*-55.0/xy^56.0-177444.0*52.0*xy^51.0+204288.0*-58.0/xy^59.0-207480.0*55.0*xy^54.0+237180.0*-61.0/xy^62.0-240720.0*58.0*xy^57.0+273420.0*-64.0/xy^65.0-277326.0*61.0*xy^60.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-7690800.0/xy^53.0-7372050.0*xy^48.0-9602010.0/xy^56.0-9227088.0*xy^51.0-1.1848704E7/xy^59.0-1.14114E7*xy^54.0-1.446798E7/xy^62.0-1.396176E7*xy^57.0-1.749888E7/xy^65.0-1.6916886E7*xy^60.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/40.55172413793103/xy^48.0-1.0/46.71186440677966*xy^53.0+30.0*xy^2.0+1.0/43.47540983606557/xy^51.0-1.0/49.67741935483871*xy^56.0+31.5*xy^2.0+1.0/46.40625/xy^54.0-1.0/52.64615384615385*xy^59.0+33.0*xy^2.0+1.0/49.343283582089555/xy^57.0-1.0/55.617647058823536*xy^62.0+34.5*xy^2.0+1.0/52.28571428571429/xy^60.0-1.0/58.59154929577465*xy^65.0+36.0*xy^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/40.55172413793103/-47.0/xy^47.0-1.0/46.71186440677966/54.0*xy^54.0+30.0/3.0*xy^3.0+1.0/43.47540983606557/-50.0/xy^50.0-1.0/49.67741935483871/57.0*xy^57.0+31.5/3.0*xy^3.0+1.0/46.40625/-53.0/xy^53.0-1.0/52.64615384615385/60.0*xy^60.0+33.0/3.0*xy^3.0+1.0/49.343283582089555/-56.0/xy^56.0-1.0/55.617647058823536/63.0*xy^63.0+34.5/3.0*xy^3.0+1.0/52.28571428571429/-59.0/xy^59.0-1.0/58.59154929577465/66.0*xy^66.0+36.0/3.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/1905.9310344827586/xy^47.0-1.0/2522.4406779661017*xy^54.0+10.0*xy^3.0-1.0/2173.7704918032787/xy^50.0-1.0/2831.6129032258063*xy^57.0+10.5*xy^3.0-1.0/2459.53125/xy^53.0-1.0/3158.769230769231*xy^60.0+11.0*xy^3.0-1.0/2763.223880597015/xy^56.0-1.0/3503.911764705883*xy^63.0+11.5*xy^3.0-1.0/3084.857142857143/xy^59.0-1.0/3867.042253521127*xy^66.0+12.0*xy^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-7690800.0/xy^53.0-7372050.0*xy^48.0-9602010.0/xy^56.0-9227088.0*xy^51.0-1.1848704E7/xy^59.0-1.14114E7*xy^54.0-1.446798E7/xy^62.0-1.396176E7*xy^57.0-1.749888E7/xy^65.0-1.6916886E7*xy^60.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-7690800.0*-53.0/xy^54.0-7372050.0*48.0*xy^47.0-9602010.0*-56.0/xy^57.0-9227088.0*51.0*xy^50.0-0.0*-59.0/xy^60.0-54.0*xy^53.0-0.0*-62.0/xy^63.0-57.0*xy^56.0-0.0*-65.0/xy^66.0-0.0*60.0*xy^59.0";
 UsageCalculus.EqnSolArrayMap2[4] = "4.076124E8/xy^54.0-3.538584E8*xy^47.0+5.3771256E8/xy^57.0-4.70581488E8*xy^50.0+0.0/xy^60.0-54.0*xy^53.0+0.0/xy^63.0-57.0*xy^56.0+0.0/xy^66.0-0.0*xy^59.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/1905.9310344827586/xy^47.0-1.0/2522.4406779661017*xy^54.0+10.0*xy^3.0-1.0/2173.7704918032787/xy^50.0-1.0/2831.6129032258063*xy^57.0+10.5*xy^3.0-1.0/2459.53125/xy^53.0-1.0/3158.769230769231*xy^60.0+11.0*xy^3.0-1.0/2763.223880597015/xy^56.0-1.0/3503.911764705883*xy^63.0+11.5*xy^3.0-1.0/3084.857142857143/xy^59.0-1.0/3867.042253521127*xy^66.0+12.0*xy^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/1905.9310344827586/-46.0/xy^46.0-1.0/2522.4406779661017/55.0*xy^55.0+10.0/4.0*xy^4.0-1.0/2173.7704918032787/-49.0/xy^49.0-1.0/2831.6129032258063/58.0*xy^58.0+10.5/4.0*xy^4.0-1.0/2459.53125/-52.0/xy^52.0-1.0/3158.769230769231/61.0*xy^61.0+11.0/4.0*xy^4.0-1.0/2763.223880597015/-55.0/xy^55.0-1.0/3503.911764705883/64.0*xy^64.0+11.5/4.0*xy^4.0-1.0/3084.857142857143/-58.0/xy^58.0-1.0/3867.042253521127/67.0*xy^67.0+12.0/4.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/87672.8275862069/xy^46.0-1.0/138734.2372881356*xy^55.0+2.5*xy^4.0+1.0/106514.75409836066/xy^49.0-1.0/164233.54838709676*xy^58.0+2.625*xy^4.0+1.0/127895.625/xy^52.0-1.0/192684.9230769231*xy^61.0+2.75*xy^4.0+1.0/151977.31343283583/xy^55.0-1.0/224250.3529411765*xy^64.0+2.875*xy^4.0+1.0/178921.7142857143/xy^58.0-1.0/259091.8309859155*xy^67.0+3.0*xy^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120529() {
 UsageCalculus.TestCase = 120529;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-59*x^51+60*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-52+61/x^53-62*x^54+63*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-55+64/x^56-65*x^57+66+67/x^59-68*x^60+69+70/x^62-71*x^63+72*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-64+73/x^65-74*x^66";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-59.0*x^51.0+60.0+61.0/x^53.0-62.0*x^54.0+63.0+64.0/x^56.0-65.0*x^57.0+66.0+67.0/x^59.0-68.0*x^60.0+69.0+70.0/x^62.0-71.0*x^63.0+72.0+73.0/x^65.0-74.0*x^66.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-59.0*51.0*x^50.0+60.0*0.0+61.0*-53.0/x^54.0-62.0*54.0*x^53.0+63.0*0.0+64.0*-56.0/x^57.0-65.0*57.0*x^56.0+66.0*0.0+67.0*-59.0/x^60.0-68.0*60.0*x^59.0+69.0*0.0+70.0*-62.0/x^63.0-71.0*63.0*x^62.0+72.0*0.0+73.0*-65.0/x^66.0-74.0*66.0*x^65.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-3009.0*x^50.0-3233.0/x^54.0-3348.0*x^53.0-3584.0/x^57.0-3705.0*x^56.0-3953.0/x^60.0-4080.0*x^59.0-4340.0/x^63.0-4473.0*x^62.0-4745.0/x^66.0-4884.0*x^65.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-59.0*x^51.0+60.0+61.0/x^53.0-62.0*x^54.0+63.0+64.0/x^56.0-65.0*x^57.0+66.0+67.0/x^59.0-68.0*x^60.0+69.0+70.0/x^62.0-71.0*x^63.0+72.0+73.0/x^65.0-74.0*x^66.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-59.0/52.0*x^52.0+60.0*x+61.0/-52.0/x^52.0-62.0/55.0*x^55.0+63.0*x+64.0/-55.0/x^55.0-65.0/58.0*x^58.0+66.0*x+67.0/-58.0/x^58.0-68.0/61.0*x^61.0+69.0*x+70.0/-61.0/x^61.0-71.0/64.0*x^64.0+72.0*x+73.0/-64.0/x^64.0-74.0/67.0*x^67.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.1346153846153846*x^52.0+60.0*x-1.1730769230769231/x^52.0-1.1272727272727272*x^55.0+63.0*x-1.1636363636363636/x^55.0-1.1206896551724137*x^58.0+66.0*x-1.1551724137931034/x^58.0-1.1147540983606556*x^61.0+69.0*x-1.1475409836065573/x^61.0-1.109375*x^64.0+72.0*x-1.140625/x^64.0-1.1044776119402986*x^67.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-3009.0*x^50.0-3233.0/x^54.0-3348.0*x^53.0-3584.0/x^57.0-3705.0*x^56.0-3953.0/x^60.0-4080.0*x^59.0-4340.0/x^63.0-4473.0*x^62.0-4745.0/x^66.0-4884.0*x^65.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-3009.0*50.0*x^49.0-3233.0*-54.0/x^55.0-3348.0*53.0*x^52.0-3584.0*-57.0/x^58.0-3705.0*56.0*x^55.0-3953.0*-60.0/x^61.0-4080.0*59.0*x^58.0-4340.0*-63.0/x^64.0-4473.0*62.0*x^61.0-4745.0*-66.0/x^67.0-4884.0*65.0*x^64.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-150450.0*x^49.0+174582.0/x^55.0-177444.0*x^52.0+204288.0/x^58.0-207480.0*x^55.0+237180.0/x^61.0-240720.0*x^58.0+273420.0/x^64.0-277326.0*x^61.0+313170.0/x^67.0-317460.0*x^64.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.1346153846153846*x^52.0+60.0*x-1.1730769230769231/x^52.0-1.1272727272727272*x^55.0+63.0*x-1.1636363636363636/x^55.0-1.1206896551724137*x^58.0+66.0*x-1.1551724137931034/x^58.0-1.1147540983606556*x^61.0+69.0*x-1.1475409836065573/x^61.0-1.109375*x^64.0+72.0*x-1.140625/x^64.0-1.1044776119402986*x^67.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.1346153846153846/53.0*x^53.0+60.0/2.0*x^2.0-1.1730769230769231/-51.0/x^51.0-1.1272727272727272/56.0*x^56.0+63.0/2.0*x^2.0-1.1636363636363636/-54.0/x^54.0-1.1206896551724137/59.0*x^59.0+66.0/2.0*x^2.0-1.1551724137931034/-57.0/x^57.0-1.1147540983606556/62.0*x^62.0+69.0/2.0*x^2.0-1.1475409836065573/-60.0/x^60.0-1.109375/65.0*x^65.0+72.0/2.0*x^2.0-1.140625/-63.0/x^63.0-1.1044776119402986/68.0*x^68.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/46.71186440677966*x^53.0+30.0*x^2.0+1.0/43.47540983606557/x^51.0-1.0/49.67741935483871*x^56.0+31.5*x^2.0+1.0/46.40625/x^54.0-1.0/52.64615384615385*x^59.0+33.0*x^2.0+1.0/49.343283582089555/x^57.0-1.0/55.617647058823536*x^62.0+34.5*x^2.0+1.0/52.28571428571429/x^60.0-1.0/58.59154929577465*x^65.0+36.0*x^2.0+1.0/55.23287671232877/x^63.0-1.0/61.567567567567565*x^68.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-150450.0*x^49.0+174582.0/x^55.0-177444.0*x^52.0+204288.0/x^58.0-207480.0*x^55.0+237180.0/x^61.0-240720.0*x^58.0+273420.0/x^64.0-277326.0*x^61.0+313170.0/x^67.0-317460.0*x^64.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-150450.0*49.0*x^48.0+174582.0*-55.0/x^56.0-177444.0*52.0*x^51.0+204288.0*-58.0/x^59.0-207480.0*55.0*x^54.0+237180.0*-61.0/x^62.0-240720.0*58.0*x^57.0+273420.0*-64.0/x^65.0-277326.0*61.0*x^60.0+313170.0*-67.0/x^68.0-317460.0*64.0*x^63.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-7372050.0*x^48.0-9602010.0/x^56.0-9227088.0*x^51.0-1.1848704E7/x^59.0-1.14114E7*x^54.0-1.446798E7/x^62.0-1.396176E7*x^57.0-1.749888E7/x^65.0-1.6916886E7*x^60.0-2.098239E7/x^68.0-2.031744E7*x^63.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/46.71186440677966*x^53.0+30.0*x^2.0+1.0/43.47540983606557/x^51.0-1.0/49.67741935483871*x^56.0+31.5*x^2.0+1.0/46.40625/x^54.0-1.0/52.64615384615385*x^59.0+33.0*x^2.0+1.0/49.343283582089555/x^57.0-1.0/55.617647058823536*x^62.0+34.5*x^2.0+1.0/52.28571428571429/x^60.0-1.0/58.59154929577465*x^65.0+36.0*x^2.0+1.0/55.23287671232877/x^63.0-1.0/61.567567567567565*x^68.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/46.71186440677966/54.0*x^54.0+30.0/3.0*x^3.0+1.0/43.47540983606557/-50.0/x^50.0-1.0/49.67741935483871/57.0*x^57.0+31.5/3.0*x^3.0+1.0/46.40625/-53.0/x^53.0-1.0/52.64615384615385/60.0*x^60.0+33.0/3.0*x^3.0+1.0/49.343283582089555/-56.0/x^56.0-1.0/55.617647058823536/63.0*x^63.0+34.5/3.0*x^3.0+1.0/52.28571428571429/-59.0/x^59.0-1.0/58.59154929577465/66.0*x^66.0+36.0/3.0*x^3.0+1.0/55.23287671232877/-62.0/x^62.0-1.0/61.567567567567565/69.0*x^69.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/2522.4406779661017*x^54.0+10.0*x^3.0-1.0/2173.7704918032787/x^50.0-1.0/2831.6129032258063*x^57.0+10.5*x^3.0-1.0/2459.53125/x^53.0-1.0/3158.769230769231*x^60.0+11.0*x^3.0-1.0/2763.223880597015/x^56.0-1.0/3503.911764705883*x^63.0+11.5*x^3.0-1.0/3084.857142857143/x^59.0-1.0/3867.042253521127*x^66.0+12.0*x^3.0-1.0/3424.4383561643835/x^62.0-1.0/4248.162162162162*x^69.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-7372050.0*x^48.0-9602010.0/x^56.0-9227088.0*x^51.0-1.1848704E7/x^59.0-1.14114E7*x^54.0-1.446798E7/x^62.0-1.396176E7*x^57.0-1.749888E7/x^65.0-1.6916886E7*x^60.0-2.098239E7/x^68.0-2.031744E7*x^63.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-7372050.0*48.0*x^47.0-9602010.0*-56.0/x^57.0-9227088.0*51.0*x^50.0-0.0*-59.0/x^60.0-54.0*x^53.0-0.0*-62.0/x^63.0-57.0*x^56.0-0.0*-65.0/x^66.0-60.0*x^59.0-0.0*-68.0/x^69.0-0.0*63.0*x^62.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-3.538584E8*x^47.0+5.3771256E8/x^57.0-4.70581488E8*x^50.0+0.0/x^60.0-54.0*x^53.0+0.0/x^63.0-57.0*x^56.0+0.0/x^66.0-60.0*x^59.0+0.0/x^69.0-0.0*x^62.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/2522.4406779661017*x^54.0+10.0*x^3.0-1.0/2173.7704918032787/x^50.0-1.0/2831.6129032258063*x^57.0+10.5*x^3.0-1.0/2459.53125/x^53.0-1.0/3158.769230769231*x^60.0+11.0*x^3.0-1.0/2763.223880597015/x^56.0-1.0/3503.911764705883*x^63.0+11.5*x^3.0-1.0/3084.857142857143/x^59.0-1.0/3867.042253521127*x^66.0+12.0*x^3.0-1.0/3424.4383561643835/x^62.0-1.0/4248.162162162162*x^69.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/2522.4406779661017/55.0*x^55.0+10.0/4.0*x^4.0-1.0/2173.7704918032787/-49.0/x^49.0-1.0/2831.6129032258063/58.0*x^58.0+10.5/4.0*x^4.0-1.0/2459.53125/-52.0/x^52.0-1.0/3158.769230769231/61.0*x^61.0+11.0/4.0*x^4.0-1.0/2763.223880597015/-55.0/x^55.0-1.0/3503.911764705883/64.0*x^64.0+11.5/4.0*x^4.0-1.0/3084.857142857143/-58.0/x^58.0-1.0/3867.042253521127/67.0*x^67.0+12.0/4.0*x^4.0-1.0/3424.4383561643835/-61.0/x^61.0-1.0/4248.162162162162/70.0*x^70.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/138734.2372881356*x^55.0+2.5*x^4.0+1.0/106514.75409836066/x^49.0-1.0/164233.54838709676*x^58.0+2.625*x^4.0+1.0/127895.625/x^52.0-1.0/192684.9230769231*x^61.0+2.75*x^4.0+1.0/151977.31343283583/x^55.0-1.0/224250.3529411765*x^64.0+2.875*x^4.0+1.0/178921.7142857143/x^58.0-1.0/259091.8309859155*x^67.0+3.0*x^4.0+1.0/208890.7397260274/x^61.0-1.0/297371.3513513513*x^70.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120530() {
 UsageCalculus.TestCase = 120530;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+60*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-52+61/x^53-62*x^54+63*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-55+64/x^56-65*x^57+66+67/x^59-68*x^60+69+70/x^62-71*x^63+72*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-64+73/x^65-74*x^66+75*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-67+76/x^68";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "60.0+61.0/x^53.0-62.0*x^54.0+63.0+64.0/x^56.0-65.0*x^57.0+66.0+67.0/x^59.0-68.0*x^60.0+69.0+70.0/x^62.0-71.0*x^63.0+72.0+73.0/x^65.0-74.0*x^66.0+75.0+76.0/x^68.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+61.0*-53.0/x^54.0-62.0*54.0*x^53.0+63.0*0.0+64.0*-56.0/x^57.0-65.0*57.0*x^56.0+66.0*0.0+67.0*-59.0/x^60.0-68.0*60.0*x^59.0+69.0*0.0+70.0*-62.0/x^63.0-71.0*63.0*x^62.0+72.0*0.0+73.0*-65.0/x^66.0-74.0*66.0*x^65.0+75.0*0.0+76.0*-68.0/x^69.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-3233.0/x^54.0-3348.0*x^53.0-3584.0/x^57.0-3705.0*x^56.0-3953.0/x^60.0-4080.0*x^59.0-4340.0/x^63.0-4473.0*x^62.0-4745.0/x^66.0-4884.0*x^65.0-5168.0/x^69.0";
 UsageCalculus.EqnSolArrayMap3[1] = "60.0+61.0/x^53.0-62.0*x^54.0+63.0+64.0/x^56.0-65.0*x^57.0+66.0+67.0/x^59.0-68.0*x^60.0+69.0+70.0/x^62.0-71.0*x^63.0+72.0+73.0/x^65.0-74.0*x^66.0+75.0+76.0/x^68.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "60.0*x+61.0/-52.0/x^52.0-62.0/55.0*x^55.0+63.0*x+64.0/-55.0/x^55.0-65.0/58.0*x^58.0+66.0*x+67.0/-58.0/x^58.0-68.0/61.0*x^61.0+69.0*x+70.0/-61.0/x^61.0-71.0/64.0*x^64.0+72.0*x+73.0/-64.0/x^64.0-74.0/67.0*x^67.0+75.0*x+76.0/-67.0/x^67.0";
 UsageCalculus.EqnSolArrayMap4[1] = "60.0*x-1.1730769230769231/x^52.0-1.1272727272727272*x^55.0+63.0*x-1.1636363636363636/x^55.0-1.1206896551724137*x^58.0+66.0*x-1.1551724137931034/x^58.0-1.1147540983606556*x^61.0+69.0*x-1.1475409836065573/x^61.0-1.109375*x^64.0+72.0*x-1.140625/x^64.0-1.1044776119402986*x^67.0+75.0*x-1.1343283582089552/x^67.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-3233.0/x^54.0-3348.0*x^53.0-3584.0/x^57.0-3705.0*x^56.0-3953.0/x^60.0-4080.0*x^59.0-4340.0/x^63.0-4473.0*x^62.0-4745.0/x^66.0-4884.0*x^65.0-5168.0/x^69.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-3233.0*-54.0/x^55.0-3348.0*53.0*x^52.0-3584.0*-57.0/x^58.0-3705.0*56.0*x^55.0-3953.0*-60.0/x^61.0-4080.0*59.0*x^58.0-4340.0*-63.0/x^64.0-4473.0*62.0*x^61.0-4745.0*-66.0/x^67.0-4884.0*65.0*x^64.0-5168.0*-69.0/x^70.0";
 UsageCalculus.EqnSolArrayMap2[2] = "174582.0/x^55.0-177444.0*x^52.0+204288.0/x^58.0-207480.0*x^55.0+237180.0/x^61.0-240720.0*x^58.0+273420.0/x^64.0-277326.0*x^61.0+313170.0/x^67.0-317460.0*x^64.0+356592.0/x^70.0";
 UsageCalculus.EqnSolArrayMap3[2] = "60.0*x-1.1730769230769231/x^52.0-1.1272727272727272*x^55.0+63.0*x-1.1636363636363636/x^55.0-1.1206896551724137*x^58.0+66.0*x-1.1551724137931034/x^58.0-1.1147540983606556*x^61.0+69.0*x-1.1475409836065573/x^61.0-1.109375*x^64.0+72.0*x-1.140625/x^64.0-1.1044776119402986*x^67.0+75.0*x-1.1343283582089552/x^67.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "60.0/2.0*x^2.0-1.1730769230769231/-51.0/x^51.0-1.1272727272727272/56.0*x^56.0+63.0/2.0*x^2.0-1.1636363636363636/-54.0/x^54.0-1.1206896551724137/59.0*x^59.0+66.0/2.0*x^2.0-1.1551724137931034/-57.0/x^57.0-1.1147540983606556/62.0*x^62.0+69.0/2.0*x^2.0-1.1475409836065573/-60.0/x^60.0-1.109375/65.0*x^65.0+72.0/2.0*x^2.0-1.140625/-63.0/x^63.0-1.1044776119402986/68.0*x^68.0+75.0/2.0*x^2.0-1.1343283582089552/-66.0/x^66.0";
 UsageCalculus.EqnSolArrayMap4[2] = "30.0*x^2.0+1.0/43.47540983606557/x^51.0-1.0/49.67741935483871*x^56.0+31.5*x^2.0+1.0/46.40625/x^54.0-1.0/52.64615384615385*x^59.0+33.0*x^2.0+1.0/49.343283582089555/x^57.0-1.0/55.617647058823536*x^62.0+34.5*x^2.0+1.0/52.28571428571429/x^60.0-1.0/58.59154929577465*x^65.0+36.0*x^2.0+1.0/55.23287671232877/x^63.0-1.0/61.567567567567565*x^68.0+37.5*x^2.0+1.0/58.184210526315795/x^66.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "174582.0/x^55.0-177444.0*x^52.0+204288.0/x^58.0-207480.0*x^55.0+237180.0/x^61.0-240720.0*x^58.0+273420.0/x^64.0-277326.0*x^61.0+313170.0/x^67.0-317460.0*x^64.0+356592.0/x^70.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "174582.0*-55.0/x^56.0-177444.0*52.0*x^51.0+204288.0*-58.0/x^59.0-207480.0*55.0*x^54.0+237180.0*-61.0/x^62.0-240720.0*58.0*x^57.0+273420.0*-64.0/x^65.0-277326.0*61.0*x^60.0+313170.0*-67.0/x^68.0-317460.0*64.0*x^63.0+356592.0*-70.0/x^71.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-9602010.0/x^56.0-9227088.0*x^51.0-1.1848704E7/x^59.0-1.14114E7*x^54.0-1.446798E7/x^62.0-1.396176E7*x^57.0-1.749888E7/x^65.0-1.6916886E7*x^60.0-2.098239E7/x^68.0-2.031744E7*x^63.0-2.496144E7/x^71.0";
 UsageCalculus.EqnSolArrayMap3[3] = "30.0*x^2.0+1.0/43.47540983606557/x^51.0-1.0/49.67741935483871*x^56.0+31.5*x^2.0+1.0/46.40625/x^54.0-1.0/52.64615384615385*x^59.0+33.0*x^2.0+1.0/49.343283582089555/x^57.0-1.0/55.617647058823536*x^62.0+34.5*x^2.0+1.0/52.28571428571429/x^60.0-1.0/58.59154929577465*x^65.0+36.0*x^2.0+1.0/55.23287671232877/x^63.0-1.0/61.567567567567565*x^68.0+37.5*x^2.0+1.0/58.184210526315795/x^66.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "30.0/3.0*x^3.0+1.0/43.47540983606557/-50.0/x^50.0-1.0/49.67741935483871/57.0*x^57.0+31.5/3.0*x^3.0+1.0/46.40625/-53.0/x^53.0-1.0/52.64615384615385/60.0*x^60.0+33.0/3.0*x^3.0+1.0/49.343283582089555/-56.0/x^56.0-1.0/55.617647058823536/63.0*x^63.0+34.5/3.0*x^3.0+1.0/52.28571428571429/-59.0/x^59.0-1.0/58.59154929577465/66.0*x^66.0+36.0/3.0*x^3.0+1.0/55.23287671232877/-62.0/x^62.0-1.0/61.567567567567565/69.0*x^69.0+37.5/3.0*x^3.0+1.0/58.184210526315795/-65.0/x^65.0";
 UsageCalculus.EqnSolArrayMap4[3] = "10.0*x^3.0-1.0/2173.7704918032787/x^50.0-1.0/2831.6129032258063*x^57.0+10.5*x^3.0-1.0/2459.53125/x^53.0-1.0/3158.769230769231*x^60.0+11.0*x^3.0-1.0/2763.223880597015/x^56.0-1.0/3503.911764705883*x^63.0+11.5*x^3.0-1.0/3084.857142857143/x^59.0-1.0/3867.042253521127*x^66.0+12.0*x^3.0-1.0/3424.4383561643835/x^62.0-1.0/4248.162162162162*x^69.0+12.5*x^3.0-1.0/3781.9736842105267/x^65.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-9602010.0/x^56.0-9227088.0*x^51.0-1.1848704E7/x^59.0-1.14114E7*x^54.0-1.446798E7/x^62.0-1.396176E7*x^57.0-1.749888E7/x^65.0-1.6916886E7*x^60.0-2.098239E7/x^68.0-2.031744E7*x^63.0-2.496144E7/x^71.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-9602010.0*-56.0/x^57.0-9227088.0*51.0*x^50.0-0.0*-59.0/x^60.0-54.0*x^53.0-0.0*-62.0/x^63.0-57.0*x^56.0-0.0*-65.0/x^66.0-60.0*x^59.0-0.0*-68.0/x^69.0-63.0*x^62.0-0.0*-71.0/x^72.0";
 UsageCalculus.EqnSolArrayMap2[4] = "5.3771256E8/x^57.0-4.70581488E8*x^50.0+0.0/x^60.0-54.0*x^53.0+0.0/x^63.0-57.0*x^56.0+0.0/x^66.0-60.0*x^59.0+0.0/x^69.0-63.0*x^62.0+0.0/x^72.0";
 UsageCalculus.EqnSolArrayMap3[4] = "10.0*x^3.0-1.0/2173.7704918032787/x^50.0-1.0/2831.6129032258063*x^57.0+10.5*x^3.0-1.0/2459.53125/x^53.0-1.0/3158.769230769231*x^60.0+11.0*x^3.0-1.0/2763.223880597015/x^56.0-1.0/3503.911764705883*x^63.0+11.5*x^3.0-1.0/3084.857142857143/x^59.0-1.0/3867.042253521127*x^66.0+12.0*x^3.0-1.0/3424.4383561643835/x^62.0-1.0/4248.162162162162*x^69.0+12.5*x^3.0-1.0/3781.9736842105267/x^65.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "10.0/4.0*x^4.0-1.0/2173.7704918032787/-49.0/x^49.0-1.0/2831.6129032258063/58.0*x^58.0+10.5/4.0*x^4.0-1.0/2459.53125/-52.0/x^52.0-1.0/3158.769230769231/61.0*x^61.0+11.0/4.0*x^4.0-1.0/2763.223880597015/-55.0/x^55.0-1.0/3503.911764705883/64.0*x^64.0+11.5/4.0*x^4.0-1.0/3084.857142857143/-58.0/x^58.0-1.0/3867.042253521127/67.0*x^67.0+12.0/4.0*x^4.0-1.0/3424.4383561643835/-61.0/x^61.0-1.0/4248.162162162162/70.0*x^70.0+12.5/4.0*x^4.0-1.0/3781.9736842105267/-64.0/x^64.0";
 UsageCalculus.EqnSolArrayMap4[4] = "2.5*x^4.0+1.0/106514.75409836066/x^49.0-1.0/164233.54838709676*x^58.0+2.625*x^4.0+1.0/127895.625/x^52.0-1.0/192684.9230769231*x^61.0+2.75*x^4.0+1.0/151977.31343283583/x^55.0-1.0/224250.3529411765*x^64.0+2.875*x^4.0+1.0/178921.7142857143/x^58.0-1.0/259091.8309859155*x^67.0+3.0*x^4.0+1.0/208890.7397260274/x^61.0-1.0/297371.3513513513*x^70.0+3.125*x^4.0+1.0/242046.3157894737/x^64.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120531() {
 UsageCalculus.TestCase = 120531;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+61-62+63*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-55+64-65+66+67-68+69+70-71+72*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-64+73-74+75*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-67+76-77+78*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-70";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "61.0-62.0+63.0+64.0-65.0+66.0+67.0-68.0+69.0+70.0-71.0+72.0+73.0-74.0+75.0+76.0-77.0+78.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0-62.0*0.0+63.0*0.0+64.0*0.0-65.0*0.0+66.0*0.0+67.0*0.0-68.0*0.0+69.0*0.0+70.0*0.0-71.0*0.0+72.0*0.0+73.0*0.0-74.0*0.0+75.0*0.0+76.0*0.0-77.0*0.0+78.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "61.0-62.0+63.0+64.0-65.0+66.0+67.0-68.0+69.0+70.0-71.0+72.0+73.0-74.0+75.0+76.0-77.0+78.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "61.0*x-62.0*x+63.0*x+64.0*x-65.0*x+66.0*x+67.0*x-68.0*x+69.0*x+70.0*x-71.0*x+72.0*x+73.0*x-74.0*x+75.0*x+76.0*x-77.0*x+78.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "61.0*x-62.0*x+63.0*x+64.0*x-65.0*x+66.0*x+67.0*x-68.0*x+69.0*x+70.0*x-71.0*x+72.0*x+73.0*x-74.0*x+75.0*x+76.0*x-77.0*x+78.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "61.0*x-62.0*x+63.0*x+64.0*x-65.0*x+66.0*x+67.0*x-68.0*x+69.0*x+70.0*x-71.0*x+72.0*x+73.0*x-74.0*x+75.0*x+76.0*x-77.0*x+78.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "61.0/2.0*x^2.0-62.0/2.0*x^2.0+63.0/2.0*x^2.0+64.0/2.0*x^2.0-65.0/2.0*x^2.0+66.0/2.0*x^2.0+67.0/2.0*x^2.0-68.0/2.0*x^2.0+69.0/2.0*x^2.0+70.0/2.0*x^2.0-71.0/2.0*x^2.0+72.0/2.0*x^2.0+73.0/2.0*x^2.0-74.0/2.0*x^2.0+75.0/2.0*x^2.0+76.0/2.0*x^2.0-77.0/2.0*x^2.0+78.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "30.5*x^2.0-31.0*x^2.0+31.5*x^2.0+32.0*x^2.0-32.5*x^2.0+33.0*x^2.0+33.5*x^2.0-34.0*x^2.0+34.5*x^2.0+35.0*x^2.0-35.5*x^2.0+36.0*x^2.0+36.5*x^2.0-37.0*x^2.0+37.5*x^2.0+38.0*x^2.0-38.5*x^2.0+39.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "30.5*x^2.0-31.0*x^2.0+31.5*x^2.0+32.0*x^2.0-32.5*x^2.0+33.0*x^2.0+33.5*x^2.0-34.0*x^2.0+34.5*x^2.0+35.0*x^2.0-35.5*x^2.0+36.0*x^2.0+36.5*x^2.0-37.0*x^2.0+37.5*x^2.0+38.0*x^2.0-38.5*x^2.0+39.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "30.5/3.0*x^3.0-31.0/3.0*x^3.0+31.5/3.0*x^3.0+32.0/3.0*x^3.0-32.5/3.0*x^3.0+33.0/3.0*x^3.0+33.5/3.0*x^3.0-34.0/3.0*x^3.0+34.5/3.0*x^3.0+35.0/3.0*x^3.0-35.5/3.0*x^3.0+36.0/3.0*x^3.0+36.5/3.0*x^3.0-37.0/3.0*x^3.0+37.5/3.0*x^3.0+38.0/3.0*x^3.0-38.5/3.0*x^3.0+39.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "10.166666666666666*x^3.0-10.333333333333334*x^3.0+10.5*x^3.0+10.666666666666666*x^3.0-10.833333333333334*x^3.0+11.0*x^3.0+11.166666666666666*x^3.0-11.333333333333334*x^3.0+11.5*x^3.0+11.666666666666666*x^3.0-11.833333333333334*x^3.0+12.0*x^3.0+12.166666666666666*x^3.0-12.333333333333334*x^3.0+12.5*x^3.0+12.666666666666666*x^3.0-12.833333333333334*x^3.0+13.0*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "10.166666666666666*x^3.0-10.333333333333334*x^3.0+10.5*x^3.0+10.666666666666666*x^3.0-10.833333333333334*x^3.0+11.0*x^3.0+11.166666666666666*x^3.0-11.333333333333334*x^3.0+11.5*x^3.0+11.666666666666666*x^3.0-11.833333333333334*x^3.0+12.0*x^3.0+12.166666666666666*x^3.0-12.333333333333334*x^3.0+12.5*x^3.0+12.666666666666666*x^3.0-12.833333333333334*x^3.0+13.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "10.166666666666666/4.0*x^4.0-10.333333333333334/4.0*x^4.0+10.5/4.0*x^4.0+10.666666666666666/4.0*x^4.0-10.833333333333334/4.0*x^4.0+11.0/4.0*x^4.0+11.166666666666666/4.0*x^4.0-11.333333333333334/4.0*x^4.0+11.5/4.0*x^4.0+11.666666666666666/4.0*x^4.0-11.833333333333334/4.0*x^4.0+12.0/4.0*x^4.0+12.166666666666666/4.0*x^4.0-12.333333333333334/4.0*x^4.0+12.5/4.0*x^4.0+12.666666666666666/4.0*x^4.0-12.833333333333334/4.0*x^4.0+13.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "2.5416666666666665*x^4.0-2.5833333333333335*x^4.0+2.625*x^4.0+2.6666666666666665*x^4.0-2.7083333333333335*x^4.0+2.75*x^4.0+2.7916666666666665*x^4.0-2.8333333333333335*x^4.0+2.875*x^4.0+2.9166666666666665*x^4.0-2.9583333333333335*x^4.0+3.0*x^4.0+3.0416666666666665*x^4.0-3.0833333333333335*x^4.0+3.125*x^4.0+3.1666666666666665*x^4.0-3.2083333333333335*x^4.0+3.25*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120532() {
 UsageCalculus.TestCase = 120532;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-62*x^54+63*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-55+64/x^56-65*x^57+66+67/x^59-68*x^60+69+70/x^62-71*x^63+72*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-64+73/x^65-74*x^66+75*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-67+76/x^68-77*x^69+78*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-70+79/x^71-80*x^72";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-62.0*x^54.0+63.0+64.0/x^56.0-65.0*x^57.0+66.0+67.0/x^59.0-68.0*x^60.0+69.0+70.0/x^62.0-71.0*x^63.0+72.0+73.0/x^65.0-74.0*x^66.0+75.0+76.0/x^68.0-77.0*x^69.0+78.0+79.0/x^71.0-80.0*x^72.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-62.0*54.0*x^53.0+63.0*0.0+64.0*-56.0/x^57.0-65.0*57.0*x^56.0+66.0*0.0+67.0*-59.0/x^60.0-68.0*60.0*x^59.0+69.0*0.0+70.0*-62.0/x^63.0-71.0*63.0*x^62.0+72.0*0.0+73.0*-65.0/x^66.0-74.0*66.0*x^65.0+75.0*0.0+76.0*-68.0/x^69.0-77.0*69.0*x^68.0+78.0*0.0+79.0*-71.0/x^72.0-80.0*72.0*x^71.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-3348.0*x^53.0-3584.0/x^57.0-3705.0*x^56.0-3953.0/x^60.0-4080.0*x^59.0-4340.0/x^63.0-4473.0*x^62.0-4745.0/x^66.0-4884.0*x^65.0-5168.0/x^69.0-5313.0*x^68.0-5609.0/x^72.0-5760.0*x^71.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-62.0*x^54.0+63.0+64.0/x^56.0-65.0*x^57.0+66.0+67.0/x^59.0-68.0*x^60.0+69.0+70.0/x^62.0-71.0*x^63.0+72.0+73.0/x^65.0-74.0*x^66.0+75.0+76.0/x^68.0-77.0*x^69.0+78.0+79.0/x^71.0-80.0*x^72.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-62.0/55.0*x^55.0+63.0*x+64.0/-55.0/x^55.0-65.0/58.0*x^58.0+66.0*x+67.0/-58.0/x^58.0-68.0/61.0*x^61.0+69.0*x+70.0/-61.0/x^61.0-71.0/64.0*x^64.0+72.0*x+73.0/-64.0/x^64.0-74.0/67.0*x^67.0+75.0*x+76.0/-67.0/x^67.0-77.0/70.0*x^70.0+78.0*x+79.0/-70.0/x^70.0-80.0/73.0*x^73.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.1272727272727272*x^55.0+63.0*x-1.1636363636363636/x^55.0-1.1206896551724137*x^58.0+66.0*x-1.1551724137931034/x^58.0-1.1147540983606556*x^61.0+69.0*x-1.1475409836065573/x^61.0-1.109375*x^64.0+72.0*x-1.140625/x^64.0-1.1044776119402986*x^67.0+75.0*x-1.1343283582089552/x^67.0-1.1*x^70.0+78.0*x-1.1285714285714286/x^70.0-1.095890410958904*x^73.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-3348.0*x^53.0-3584.0/x^57.0-3705.0*x^56.0-3953.0/x^60.0-4080.0*x^59.0-4340.0/x^63.0-4473.0*x^62.0-4745.0/x^66.0-4884.0*x^65.0-5168.0/x^69.0-5313.0*x^68.0-5609.0/x^72.0-5760.0*x^71.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-3348.0*53.0*x^52.0-3584.0*-57.0/x^58.0-3705.0*56.0*x^55.0-3953.0*-60.0/x^61.0-4080.0*59.0*x^58.0-4340.0*-63.0/x^64.0-4473.0*62.0*x^61.0-4745.0*-66.0/x^67.0-4884.0*65.0*x^64.0-5168.0*-69.0/x^70.0-5313.0*68.0*x^67.0-5609.0*-72.0/x^73.0-5760.0*71.0*x^70.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-177444.0*x^52.0+204288.0/x^58.0-207480.0*x^55.0+237180.0/x^61.0-240720.0*x^58.0+273420.0/x^64.0-277326.0*x^61.0+313170.0/x^67.0-317460.0*x^64.0+356592.0/x^70.0-361284.0*x^67.0+403848.0/x^73.0-408960.0*x^70.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.1272727272727272*x^55.0+63.0*x-1.1636363636363636/x^55.0-1.1206896551724137*x^58.0+66.0*x-1.1551724137931034/x^58.0-1.1147540983606556*x^61.0+69.0*x-1.1475409836065573/x^61.0-1.109375*x^64.0+72.0*x-1.140625/x^64.0-1.1044776119402986*x^67.0+75.0*x-1.1343283582089552/x^67.0-1.1*x^70.0+78.0*x-1.1285714285714286/x^70.0-1.095890410958904*x^73.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.1272727272727272/56.0*x^56.0+63.0/2.0*x^2.0-1.1636363636363636/-54.0/x^54.0-1.1206896551724137/59.0*x^59.0+66.0/2.0*x^2.0-1.1551724137931034/-57.0/x^57.0-1.1147540983606556/62.0*x^62.0+69.0/2.0*x^2.0-1.1475409836065573/-60.0/x^60.0-1.109375/65.0*x^65.0+72.0/2.0*x^2.0-1.140625/-63.0/x^63.0-1.1044776119402986/68.0*x^68.0+75.0/2.0*x^2.0-1.1343283582089552/-66.0/x^66.0-1.1/71.0*x^71.0+78.0/2.0*x^2.0-1.1285714285714286/-69.0/x^69.0-1.095890410958904/74.0*x^74.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/49.67741935483871*x^56.0+31.5*x^2.0+1.0/46.40625/x^54.0-1.0/52.64615384615385*x^59.0+33.0*x^2.0+1.0/49.343283582089555/x^57.0-1.0/55.617647058823536*x^62.0+34.5*x^2.0+1.0/52.28571428571429/x^60.0-1.0/58.59154929577465*x^65.0+36.0*x^2.0+1.0/55.23287671232877/x^63.0-1.0/61.567567567567565*x^68.0+37.5*x^2.0+1.0/58.184210526315795/x^66.0-1.0/64.54545454545455*x^71.0+39.0*x^2.0+1.0/61.139240506329116/x^69.0-1.0/67.525*x^74.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-177444.0*x^52.0+204288.0/x^58.0-207480.0*x^55.0+237180.0/x^61.0-240720.0*x^58.0+273420.0/x^64.0-277326.0*x^61.0+313170.0/x^67.0-317460.0*x^64.0+356592.0/x^70.0-361284.0*x^67.0+403848.0/x^73.0-408960.0*x^70.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-177444.0*52.0*x^51.0+204288.0*-58.0/x^59.0-207480.0*55.0*x^54.0+237180.0*-61.0/x^62.0-240720.0*58.0*x^57.0+273420.0*-64.0/x^65.0-277326.0*61.0*x^60.0+313170.0*-67.0/x^68.0-317460.0*64.0*x^63.0+356592.0*-70.0/x^71.0-361284.0*67.0*x^66.0+403848.0*-73.0/x^74.0-408960.0*70.0*x^69.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-9227088.0*x^51.0-1.1848704E7/x^59.0-1.14114E7*x^54.0-1.446798E7/x^62.0-1.396176E7*x^57.0-1.749888E7/x^65.0-1.6916886E7*x^60.0-2.098239E7/x^68.0-2.031744E7*x^63.0-2.496144E7/x^71.0-2.4206028E7*x^66.0-2.9480904E7/x^74.0-2.86272E7*x^69.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/49.67741935483871*x^56.0+31.5*x^2.0+1.0/46.40625/x^54.0-1.0/52.64615384615385*x^59.0+33.0*x^2.0+1.0/49.343283582089555/x^57.0-1.0/55.617647058823536*x^62.0+34.5*x^2.0+1.0/52.28571428571429/x^60.0-1.0/58.59154929577465*x^65.0+36.0*x^2.0+1.0/55.23287671232877/x^63.0-1.0/61.567567567567565*x^68.0+37.5*x^2.0+1.0/58.184210526315795/x^66.0-1.0/64.54545454545455*x^71.0+39.0*x^2.0+1.0/61.139240506329116/x^69.0-1.0/67.525*x^74.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/49.67741935483871/57.0*x^57.0+31.5/3.0*x^3.0+1.0/46.40625/-53.0/x^53.0-1.0/52.64615384615385/60.0*x^60.0+33.0/3.0*x^3.0+1.0/49.343283582089555/-56.0/x^56.0-1.0/55.617647058823536/63.0*x^63.0+34.5/3.0*x^3.0+1.0/52.28571428571429/-59.0/x^59.0-1.0/58.59154929577465/66.0*x^66.0+36.0/3.0*x^3.0+1.0/55.23287671232877/-62.0/x^62.0-1.0/61.567567567567565/69.0*x^69.0+37.5/3.0*x^3.0+1.0/58.184210526315795/-65.0/x^65.0-1.0/64.54545454545455/72.0*x^72.0+39.0/3.0*x^3.0+1.0/61.139240506329116/-68.0/x^68.0-1.0/67.525/75.0*x^75.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/2831.6129032258063*x^57.0+10.5*x^3.0-1.0/2459.53125/x^53.0-1.0/3158.769230769231*x^60.0+11.0*x^3.0-1.0/2763.223880597015/x^56.0-1.0/3503.911764705883*x^63.0+11.5*x^3.0-1.0/3084.857142857143/x^59.0-1.0/3867.042253521127*x^66.0+12.0*x^3.0-1.0/3424.4383561643835/x^62.0-1.0/4248.162162162162*x^69.0+12.5*x^3.0-1.0/3781.9736842105267/x^65.0-1.0/4647.272727272727*x^72.0+13.0*x^3.0-1.0/4157.46835443038/x^68.0-1.0/5064.375*x^75.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-9227088.0*x^51.0-1.1848704E7/x^59.0-1.14114E7*x^54.0-1.446798E7/x^62.0-1.396176E7*x^57.0-1.749888E7/x^65.0-1.6916886E7*x^60.0-2.098239E7/x^68.0-2.031744E7*x^63.0-2.496144E7/x^71.0-2.4206028E7*x^66.0-2.9480904E7/x^74.0-2.86272E7*x^69.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-9227088.0*51.0*x^50.0-0.0*-59.0/x^60.0-54.0*x^53.0-0.0*-62.0/x^63.0-57.0*x^56.0-0.0*-65.0/x^66.0-60.0*x^59.0-0.0*-68.0/x^69.0-63.0*x^62.0-0.0*-71.0/x^72.0-66.0*x^65.0-0.0*-74.0/x^75.0-0.0*69.0*x^68.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-4.70581488E8*x^50.0+0.0/x^60.0-54.0*x^53.0+0.0/x^63.0-57.0*x^56.0+0.0/x^66.0-60.0*x^59.0+0.0/x^69.0-63.0*x^62.0+0.0/x^72.0-66.0*x^65.0+0.0/x^75.0-0.0*x^68.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/2831.6129032258063*x^57.0+10.5*x^3.0-1.0/2459.53125/x^53.0-1.0/3158.769230769231*x^60.0+11.0*x^3.0-1.0/2763.223880597015/x^56.0-1.0/3503.911764705883*x^63.0+11.5*x^3.0-1.0/3084.857142857143/x^59.0-1.0/3867.042253521127*x^66.0+12.0*x^3.0-1.0/3424.4383561643835/x^62.0-1.0/4248.162162162162*x^69.0+12.5*x^3.0-1.0/3781.9736842105267/x^65.0-1.0/4647.272727272727*x^72.0+13.0*x^3.0-1.0/4157.46835443038/x^68.0-1.0/5064.375*x^75.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/2831.6129032258063/58.0*x^58.0+10.5/4.0*x^4.0-1.0/2459.53125/-52.0/x^52.0-1.0/3158.769230769231/61.0*x^61.0+11.0/4.0*x^4.0-1.0/2763.223880597015/-55.0/x^55.0-1.0/3503.911764705883/64.0*x^64.0+11.5/4.0*x^4.0-1.0/3084.857142857143/-58.0/x^58.0-1.0/3867.042253521127/67.0*x^67.0+12.0/4.0*x^4.0-1.0/3424.4383561643835/-61.0/x^61.0-1.0/4248.162162162162/70.0*x^70.0+12.5/4.0*x^4.0-1.0/3781.9736842105267/-64.0/x^64.0-1.0/4647.272727272727/73.0*x^73.0+13.0/4.0*x^4.0-1.0/4157.46835443038/-67.0/x^67.0-1.0/5064.375/76.0*x^76.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/164233.54838709676*x^58.0+2.625*x^4.0+1.0/127895.625/x^52.0-1.0/192684.9230769231*x^61.0+2.75*x^4.0+1.0/151977.31343283583/x^55.0-1.0/224250.3529411765*x^64.0+2.875*x^4.0+1.0/178921.7142857143/x^58.0-1.0/259091.8309859155*x^67.0+3.0*x^4.0+1.0/208890.7397260274/x^61.0-1.0/297371.3513513513*x^70.0+3.125*x^4.0+1.0/242046.3157894737/x^64.0-1.0/339250.90909090906*x^73.0+3.25*x^4.0+1.0/278550.37974683545/x^67.0-1.0/384892.5*x^76.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120533() {
 UsageCalculus.TestCase = 120533;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+63*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-55+64/xy^56-65*xy^57+66+67/xy^59-68*xy^60+69+70/xy^62-71*xy^63+72*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-64+73/xy^65-74*xy^66+75*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-67+76/xy^68-77*xy^69+78*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-70+79/xy^71-80*xy^72+81+82/xy^74";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "63.0+64.0/xy^56.0-65.0*xy^57.0+66.0+67.0/xy^59.0-68.0*xy^60.0+69.0+70.0/xy^62.0-71.0*xy^63.0+72.0+73.0/xy^65.0-74.0*xy^66.0+75.0+76.0/xy^68.0-77.0*xy^69.0+78.0+79.0/xy^71.0-80.0*xy^72.0+81.0+82.0/xy^74.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+64.0*-56.0/xy^57.0-65.0*57.0*xy^56.0+66.0*0.0+67.0*-59.0/xy^60.0-68.0*60.0*xy^59.0+69.0*0.0+70.0*-62.0/xy^63.0-71.0*63.0*xy^62.0+72.0*0.0+73.0*-65.0/xy^66.0-74.0*66.0*xy^65.0+75.0*0.0+76.0*-68.0/xy^69.0-77.0*69.0*xy^68.0+78.0*0.0+79.0*-71.0/xy^72.0-80.0*72.0*xy^71.0+81.0*0.0+82.0*-74.0/xy^75.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-3584.0/xy^57.0-3705.0*xy^56.0-3953.0/xy^60.0-4080.0*xy^59.0-4340.0/xy^63.0-4473.0*xy^62.0-4745.0/xy^66.0-4884.0*xy^65.0-5168.0/xy^69.0-5313.0*xy^68.0-5609.0/xy^72.0-5760.0*xy^71.0-6068.0/xy^75.0";
 UsageCalculus.EqnSolArrayMap3[1] = "63.0+64.0/xy^56.0-65.0*xy^57.0+66.0+67.0/xy^59.0-68.0*xy^60.0+69.0+70.0/xy^62.0-71.0*xy^63.0+72.0+73.0/xy^65.0-74.0*xy^66.0+75.0+76.0/xy^68.0-77.0*xy^69.0+78.0+79.0/xy^71.0-80.0*xy^72.0+81.0+82.0/xy^74.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "63.0*xy+64.0/-55.0/xy^55.0-65.0/58.0*xy^58.0+66.0*xy+67.0/-58.0/xy^58.0-68.0/61.0*xy^61.0+69.0*xy+70.0/-61.0/xy^61.0-71.0/64.0*xy^64.0+72.0*xy+73.0/-64.0/xy^64.0-74.0/67.0*xy^67.0+75.0*xy+76.0/-67.0/xy^67.0-77.0/70.0*xy^70.0+78.0*xy+79.0/-70.0/xy^70.0-80.0/73.0*xy^73.0+81.0*xy+82.0/-73.0/xy^73.0";
 UsageCalculus.EqnSolArrayMap4[1] = "63.0*xy-1.1636363636363636/xy^55.0-1.1206896551724137*xy^58.0+66.0*xy-1.1551724137931034/xy^58.0-1.1147540983606556*xy^61.0+69.0*xy-1.1475409836065573/xy^61.0-1.109375*xy^64.0+72.0*xy-1.140625/xy^64.0-1.1044776119402986*xy^67.0+75.0*xy-1.1343283582089552/xy^67.0-1.1*xy^70.0+78.0*xy-1.1285714285714286/xy^70.0-1.095890410958904*xy^73.0+81.0*xy-1.1232876712328768/xy^73.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-3584.0/xy^57.0-3705.0*xy^56.0-3953.0/xy^60.0-4080.0*xy^59.0-4340.0/xy^63.0-4473.0*xy^62.0-4745.0/xy^66.0-4884.0*xy^65.0-5168.0/xy^69.0-5313.0*xy^68.0-5609.0/xy^72.0-5760.0*xy^71.0-6068.0/xy^75.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-3584.0*-57.0/xy^58.0-3705.0*56.0*xy^55.0-3953.0*-60.0/xy^61.0-4080.0*59.0*xy^58.0-4340.0*-63.0/xy^64.0-4473.0*62.0*xy^61.0-4745.0*-66.0/xy^67.0-4884.0*65.0*xy^64.0-5168.0*-69.0/xy^70.0-5313.0*68.0*xy^67.0-5609.0*-72.0/xy^73.0-5760.0*71.0*xy^70.0-6068.0*-75.0/xy^76.0";
 UsageCalculus.EqnSolArrayMap2[2] = "204288.0/xy^58.0-207480.0*xy^55.0+237180.0/xy^61.0-240720.0*xy^58.0+273420.0/xy^64.0-277326.0*xy^61.0+313170.0/xy^67.0-317460.0*xy^64.0+356592.0/xy^70.0-361284.0*xy^67.0+403848.0/xy^73.0-408960.0*xy^70.0+455100.0/xy^76.0";
 UsageCalculus.EqnSolArrayMap3[2] = "63.0*xy-1.1636363636363636/xy^55.0-1.1206896551724137*xy^58.0+66.0*xy-1.1551724137931034/xy^58.0-1.1147540983606556*xy^61.0+69.0*xy-1.1475409836065573/xy^61.0-1.109375*xy^64.0+72.0*xy-1.140625/xy^64.0-1.1044776119402986*xy^67.0+75.0*xy-1.1343283582089552/xy^67.0-1.1*xy^70.0+78.0*xy-1.1285714285714286/xy^70.0-1.095890410958904*xy^73.0+81.0*xy-1.1232876712328768/xy^73.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "63.0/2.0*xy^2.0-1.1636363636363636/-54.0/xy^54.0-1.1206896551724137/59.0*xy^59.0+66.0/2.0*xy^2.0-1.1551724137931034/-57.0/xy^57.0-1.1147540983606556/62.0*xy^62.0+69.0/2.0*xy^2.0-1.1475409836065573/-60.0/xy^60.0-1.109375/65.0*xy^65.0+72.0/2.0*xy^2.0-1.140625/-63.0/xy^63.0-1.1044776119402986/68.0*xy^68.0+75.0/2.0*xy^2.0-1.1343283582089552/-66.0/xy^66.0-1.1/71.0*xy^71.0+78.0/2.0*xy^2.0-1.1285714285714286/-69.0/xy^69.0-1.095890410958904/74.0*xy^74.0+81.0/2.0*xy^2.0-1.1232876712328768/-72.0/xy^72.0";
 UsageCalculus.EqnSolArrayMap4[2] = "31.5*xy^2.0+1.0/46.40625/xy^54.0-1.0/52.64615384615385*xy^59.0+33.0*xy^2.0+1.0/49.343283582089555/xy^57.0-1.0/55.617647058823536*xy^62.0+34.5*xy^2.0+1.0/52.28571428571429/xy^60.0-1.0/58.59154929577465*xy^65.0+36.0*xy^2.0+1.0/55.23287671232877/xy^63.0-1.0/61.567567567567565*xy^68.0+37.5*xy^2.0+1.0/58.184210526315795/xy^66.0-1.0/64.54545454545455*xy^71.0+39.0*xy^2.0+1.0/61.139240506329116/xy^69.0-1.0/67.525*xy^74.0+40.5*xy^2.0+1.0/64.09756097560975/xy^72.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "204288.0/xy^58.0-207480.0*xy^55.0+237180.0/xy^61.0-240720.0*xy^58.0+273420.0/xy^64.0-277326.0*xy^61.0+313170.0/xy^67.0-317460.0*xy^64.0+356592.0/xy^70.0-361284.0*xy^67.0+403848.0/xy^73.0-408960.0*xy^70.0+455100.0/xy^76.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "204288.0*-58.0/xy^59.0-207480.0*55.0*xy^54.0+237180.0*-61.0/xy^62.0-240720.0*58.0*xy^57.0+273420.0*-64.0/xy^65.0-277326.0*61.0*xy^60.0+313170.0*-67.0/xy^68.0-317460.0*64.0*xy^63.0+356592.0*-70.0/xy^71.0-361284.0*67.0*xy^66.0+403848.0*-73.0/xy^74.0-408960.0*70.0*xy^69.0+455100.0*-76.0/xy^77.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-1.1848704E7/xy^59.0-1.14114E7*xy^54.0-1.446798E7/xy^62.0-1.396176E7*xy^57.0-1.749888E7/xy^65.0-1.6916886E7*xy^60.0-2.098239E7/xy^68.0-2.031744E7*xy^63.0-2.496144E7/xy^71.0-2.4206028E7*xy^66.0-2.9480904E7/xy^74.0-2.86272E7*xy^69.0-3.45876E7/xy^77.0";
 UsageCalculus.EqnSolArrayMap3[3] = "31.5*xy^2.0+1.0/46.40625/xy^54.0-1.0/52.64615384615385*xy^59.0+33.0*xy^2.0+1.0/49.343283582089555/xy^57.0-1.0/55.617647058823536*xy^62.0+34.5*xy^2.0+1.0/52.28571428571429/xy^60.0-1.0/58.59154929577465*xy^65.0+36.0*xy^2.0+1.0/55.23287671232877/xy^63.0-1.0/61.567567567567565*xy^68.0+37.5*xy^2.0+1.0/58.184210526315795/xy^66.0-1.0/64.54545454545455*xy^71.0+39.0*xy^2.0+1.0/61.139240506329116/xy^69.0-1.0/67.525*xy^74.0+40.5*xy^2.0+1.0/64.09756097560975/xy^72.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "31.5/3.0*xy^3.0+1.0/46.40625/-53.0/xy^53.0-1.0/52.64615384615385/60.0*xy^60.0+33.0/3.0*xy^3.0+1.0/49.343283582089555/-56.0/xy^56.0-1.0/55.617647058823536/63.0*xy^63.0+34.5/3.0*xy^3.0+1.0/52.28571428571429/-59.0/xy^59.0-1.0/58.59154929577465/66.0*xy^66.0+36.0/3.0*xy^3.0+1.0/55.23287671232877/-62.0/xy^62.0-1.0/61.567567567567565/69.0*xy^69.0+37.5/3.0*xy^3.0+1.0/58.184210526315795/-65.0/xy^65.0-1.0/64.54545454545455/72.0*xy^72.0+39.0/3.0*xy^3.0+1.0/61.139240506329116/-68.0/xy^68.0-1.0/67.525/75.0*xy^75.0+40.5/3.0*xy^3.0+1.0/64.09756097560975/-71.0/xy^71.0";
 UsageCalculus.EqnSolArrayMap4[3] = "10.5*xy^3.0-1.0/2459.53125/xy^53.0-1.0/3158.769230769231*xy^60.0+11.0*xy^3.0-1.0/2763.223880597015/xy^56.0-1.0/3503.911764705883*xy^63.0+11.5*xy^3.0-1.0/3084.857142857143/xy^59.0-1.0/3867.042253521127*xy^66.0+12.0*xy^3.0-1.0/3424.4383561643835/xy^62.0-1.0/4248.162162162162*xy^69.0+12.5*xy^3.0-1.0/3781.9736842105267/xy^65.0-1.0/4647.272727272727*xy^72.0+13.0*xy^3.0-1.0/4157.46835443038/xy^68.0-1.0/5064.375*xy^75.0+13.5*xy^3.0-1.0/4550.926829268293/xy^71.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-1.1848704E7/xy^59.0-1.14114E7*xy^54.0-1.446798E7/xy^62.0-1.396176E7*xy^57.0-1.749888E7/xy^65.0-1.6916886E7*xy^60.0-2.098239E7/xy^68.0-2.031744E7*xy^63.0-2.496144E7/xy^71.0-2.4206028E7*xy^66.0-2.9480904E7/xy^74.0-2.86272E7*xy^69.0-3.45876E7/xy^77.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*-59.0/xy^60.0-54.0*xy^53.0-0.0*-62.0/xy^63.0-57.0*xy^56.0-0.0*-65.0/xy^66.0-60.0*xy^59.0-0.0*-68.0/xy^69.0-63.0*xy^62.0-0.0*-71.0/xy^72.0-66.0*xy^65.0-0.0*-74.0/xy^75.0-69.0*xy^68.0-0.0*-77.0/xy^78.0";
 UsageCalculus.EqnSolArrayMap2[4] = "0.0/xy^60.0-54.0*xy^53.0+0.0/xy^63.0-57.0*xy^56.0+0.0/xy^66.0-60.0*xy^59.0+0.0/xy^69.0-63.0*xy^62.0+0.0/xy^72.0-66.0*xy^65.0+0.0/xy^75.0-69.0*xy^68.0+0.0/xy^78.0";
 UsageCalculus.EqnSolArrayMap3[4] = "10.5*xy^3.0-1.0/2459.53125/xy^53.0-1.0/3158.769230769231*xy^60.0+11.0*xy^3.0-1.0/2763.223880597015/xy^56.0-1.0/3503.911764705883*xy^63.0+11.5*xy^3.0-1.0/3084.857142857143/xy^59.0-1.0/3867.042253521127*xy^66.0+12.0*xy^3.0-1.0/3424.4383561643835/xy^62.0-1.0/4248.162162162162*xy^69.0+12.5*xy^3.0-1.0/3781.9736842105267/xy^65.0-1.0/4647.272727272727*xy^72.0+13.0*xy^3.0-1.0/4157.46835443038/xy^68.0-1.0/5064.375*xy^75.0+13.5*xy^3.0-1.0/4550.926829268293/xy^71.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "10.5/4.0*xy^4.0-1.0/2459.53125/-52.0/xy^52.0-1.0/3158.769230769231/61.0*xy^61.0+11.0/4.0*xy^4.0-1.0/2763.223880597015/-55.0/xy^55.0-1.0/3503.911764705883/64.0*xy^64.0+11.5/4.0*xy^4.0-1.0/3084.857142857143/-58.0/xy^58.0-1.0/3867.042253521127/67.0*xy^67.0+12.0/4.0*xy^4.0-1.0/3424.4383561643835/-61.0/xy^61.0-1.0/4248.162162162162/70.0*xy^70.0+12.5/4.0*xy^4.0-1.0/3781.9736842105267/-64.0/xy^64.0-1.0/4647.272727272727/73.0*xy^73.0+13.0/4.0*xy^4.0-1.0/4157.46835443038/-67.0/xy^67.0-1.0/5064.375/76.0*xy^76.0+13.5/4.0*xy^4.0-1.0/4550.926829268293/-70.0/xy^70.0";
 UsageCalculus.EqnSolArrayMap4[4] = "2.625*xy^4.0+1.0/127895.625/xy^52.0-1.0/192684.9230769231*xy^61.0+2.75*xy^4.0+1.0/151977.31343283583/xy^55.0-1.0/224250.3529411765*xy^64.0+2.875*xy^4.0+1.0/178921.7142857143/xy^58.0-1.0/259091.8309859155*xy^67.0+3.0*xy^4.0+1.0/208890.7397260274/xy^61.0-1.0/297371.3513513513*xy^70.0+3.125*xy^4.0+1.0/242046.3157894737/xy^64.0-1.0/339250.90909090906*xy^73.0+3.25*xy^4.0+1.0/278550.37974683545/xy^67.0-1.0/384892.5*xy^76.0+3.375*xy^4.0+1.0/318564.8780487805/xy^70.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120534() {
 UsageCalculus.TestCase = 120534;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-65*xyzxy^57+66";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyzxy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-65.0*xyzxy^57.0+66.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-65.0*57.0*xyzxy^56.0+66.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-3705.0*xyzxy^56.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-65.0*xyzxy^57.0+66.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-65.0/58.0*xyzxy^58.0+66.0*xyzxy";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.1206896551724137*xyzxy^58.0+66.0*xyzxy";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-3705.0*xyzxy^56.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-3705.0*56.0*xyzxy^55.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-207480.0*xyzxy^55.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.1206896551724137*xyzxy^58.0+66.0*xyzxy";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.1206896551724137/59.0*xyzxy^59.0+66.0/2.0*xyzxy^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/52.64615384615385*xyzxy^59.0+33.0*xyzxy^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-207480.0*xyzxy^55.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-207480.0*55.0*xyzxy^54.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-1.14114E7*xyzxy^54.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/52.64615384615385*xyzxy^59.0+33.0*xyzxy^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/52.64615384615385/60.0*xyzxy^60.0+33.0/3.0*xyzxy^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/3158.769230769231*xyzxy^60.0+11.0*xyzxy^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-1.14114E7*xyzxy^54.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*54.0*xyzxy^53.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-0.0*xyzxy^53.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/3158.769230769231*xyzxy^60.0+11.0*xyzxy^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/3158.769230769231/61.0*xyzxy^61.0+11.0/4.0*xyzxy^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/192684.9230769231*xyzxy^61.0+2.75*xyzxy^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120535() {
 UsageCalculus.TestCase = 120535;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+66+67/x^59-68*x^60";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "66.0+67.0/x^59.0-68.0*x^60.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+67.0*-59.0/x^60.0-68.0*60.0*x^59.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-3953.0/x^60.0-4080.0*x^59.0";
 UsageCalculus.EqnSolArrayMap3[1] = "66.0+67.0/x^59.0-68.0*x^60.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "66.0*x+67.0/-58.0/x^58.0-68.0/61.0*x^61.0";
 UsageCalculus.EqnSolArrayMap4[1] = "66.0*x-1.1551724137931034/x^58.0-1.1147540983606556*x^61.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-3953.0/x^60.0-4080.0*x^59.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-3953.0*-60.0/x^61.0-4080.0*59.0*x^58.0";
 UsageCalculus.EqnSolArrayMap2[2] = "237180.0/x^61.0-240720.0*x^58.0";
 UsageCalculus.EqnSolArrayMap3[2] = "66.0*x-1.1551724137931034/x^58.0-1.1147540983606556*x^61.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "66.0/2.0*x^2.0-1.1551724137931034/-57.0/x^57.0-1.1147540983606556/62.0*x^62.0";
 UsageCalculus.EqnSolArrayMap4[2] = "33.0*x^2.0+1.0/49.343283582089555/x^57.0-1.0/55.617647058823536*x^62.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "237180.0/x^61.0-240720.0*x^58.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "237180.0*-61.0/x^62.0-240720.0*58.0*x^57.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-1.446798E7/x^62.0-1.396176E7*x^57.0";
 UsageCalculus.EqnSolArrayMap3[3] = "33.0*x^2.0+1.0/49.343283582089555/x^57.0-1.0/55.617647058823536*x^62.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "33.0/3.0*x^3.0+1.0/49.343283582089555/-56.0/x^56.0-1.0/55.617647058823536/63.0*x^63.0";
 UsageCalculus.EqnSolArrayMap4[3] = "11.0*x^3.0-1.0/2763.223880597015/x^56.0-1.0/3503.911764705883*x^63.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-1.446798E7/x^62.0-1.396176E7*x^57.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*-62.0/x^63.0-0.0*57.0*x^56.0";
 UsageCalculus.EqnSolArrayMap2[4] = "0.0/x^63.0-0.0*x^56.0";
 UsageCalculus.EqnSolArrayMap3[4] = "11.0*x^3.0-1.0/2763.223880597015/x^56.0-1.0/3503.911764705883*x^63.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "11.0/4.0*x^4.0-1.0/2763.223880597015/-55.0/x^55.0-1.0/3503.911764705883/64.0*x^64.0";
 UsageCalculus.EqnSolArrayMap4[4] = "2.75*x^4.0+1.0/151977.31343283583/x^55.0-1.0/224250.3529411765*x^64.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120536() {
 UsageCalculus.TestCase = 120536;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+67/x^59-68*x^60+69+70/x^62";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "67.0/x^59.0-68.0*x^60.0+69.0+70.0/x^62.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "67.0*-59.0/x^60.0-68.0*60.0*x^59.0+69.0*0.0+70.0*-62.0/x^63.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-3953.0/x^60.0-4080.0*x^59.0-4340.0/x^63.0";
 UsageCalculus.EqnSolArrayMap3[1] = "67.0/x^59.0-68.0*x^60.0+69.0+70.0/x^62.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "67.0/-58.0/x^58.0-68.0/61.0*x^61.0+69.0*x+70.0/-61.0/x^61.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.1551724137931034/x^58.0-1.1147540983606556*x^61.0+69.0*x-1.1475409836065573/x^61.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-3953.0/x^60.0-4080.0*x^59.0-4340.0/x^63.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-3953.0*-60.0/x^61.0-4080.0*59.0*x^58.0-4340.0*-63.0/x^64.0";
 UsageCalculus.EqnSolArrayMap2[2] = "237180.0/x^61.0-240720.0*x^58.0+273420.0/x^64.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.1551724137931034/x^58.0-1.1147540983606556*x^61.0+69.0*x-1.1475409836065573/x^61.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.1551724137931034/-57.0/x^57.0-1.1147540983606556/62.0*x^62.0+69.0/2.0*x^2.0-1.1475409836065573/-60.0/x^60.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/49.343283582089555/x^57.0-1.0/55.617647058823536*x^62.0+34.5*x^2.0+1.0/52.28571428571429/x^60.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "237180.0/x^61.0-240720.0*x^58.0+273420.0/x^64.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "237180.0*-61.0/x^62.0-240720.0*58.0*x^57.0+273420.0*-64.0/x^65.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-1.446798E7/x^62.0-1.396176E7*x^57.0-1.749888E7/x^65.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/49.343283582089555/x^57.0-1.0/55.617647058823536*x^62.0+34.5*x^2.0+1.0/52.28571428571429/x^60.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/49.343283582089555/-56.0/x^56.0-1.0/55.617647058823536/63.0*x^63.0+34.5/3.0*x^3.0+1.0/52.28571428571429/-59.0/x^59.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/2763.223880597015/x^56.0-1.0/3503.911764705883*x^63.0+11.5*x^3.0-1.0/3084.857142857143/x^59.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-1.446798E7/x^62.0-1.396176E7*x^57.0-1.749888E7/x^65.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*-62.0/x^63.0-57.0*x^56.0-0.0*-65.0/x^66.0";
 UsageCalculus.EqnSolArrayMap2[4] = "0.0/x^63.0-57.0*x^56.0+0.0/x^66.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/2763.223880597015/x^56.0-1.0/3503.911764705883*x^63.0+11.5*x^3.0-1.0/3084.857142857143/x^59.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/2763.223880597015/-55.0/x^55.0-1.0/3503.911764705883/64.0*x^64.0+11.5/4.0*x^4.0-1.0/3084.857142857143/-58.0/x^58.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/151977.31343283583/x^55.0-1.0/224250.3529411765*x^64.0+2.875*x^4.0+1.0/178921.7142857143/x^58.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120537() {
 UsageCalculus.TestCase = 120537;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-68*x^60+69+70/x^62-71*x^63+72*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-64";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-68.0*x^60.0+69.0+70.0/x^62.0-71.0*x^63.0+72.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-68.0*60.0*x^59.0+69.0*0.0+70.0*-62.0/x^63.0-71.0*63.0*x^62.0+72.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-4080.0*x^59.0-4340.0/x^63.0-4473.0*x^62.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-68.0*x^60.0+69.0+70.0/x^62.0-71.0*x^63.0+72.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-68.0/61.0*x^61.0+69.0*x+70.0/-61.0/x^61.0-71.0/64.0*x^64.0+72.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.1147540983606556*x^61.0+69.0*x-1.1475409836065573/x^61.0-1.109375*x^64.0+72.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-4080.0*x^59.0-4340.0/x^63.0-4473.0*x^62.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-4080.0*59.0*x^58.0-4340.0*-63.0/x^64.0-4473.0*62.0*x^61.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-240720.0*x^58.0+273420.0/x^64.0-277326.0*x^61.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.1147540983606556*x^61.0+69.0*x-1.1475409836065573/x^61.0-1.109375*x^64.0+72.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.1147540983606556/62.0*x^62.0+69.0/2.0*x^2.0-1.1475409836065573/-60.0/x^60.0-1.109375/65.0*x^65.0+72.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/55.617647058823536*x^62.0+34.5*x^2.0+1.0/52.28571428571429/x^60.0-1.0/58.59154929577465*x^65.0+36.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-240720.0*x^58.0+273420.0/x^64.0-277326.0*x^61.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-240720.0*58.0*x^57.0+273420.0*-64.0/x^65.0-277326.0*61.0*x^60.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-1.396176E7*x^57.0-1.749888E7/x^65.0-1.6916886E7*x^60.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/55.617647058823536*x^62.0+34.5*x^2.0+1.0/52.28571428571429/x^60.0-1.0/58.59154929577465*x^65.0+36.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/55.617647058823536/63.0*x^63.0+34.5/3.0*x^3.0+1.0/52.28571428571429/-59.0/x^59.0-1.0/58.59154929577465/66.0*x^66.0+36.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/3503.911764705883*x^63.0+11.5*x^3.0-1.0/3084.857142857143/x^59.0-1.0/3867.042253521127*x^66.0+12.0*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-1.396176E7*x^57.0-1.749888E7/x^65.0-1.6916886E7*x^60.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-57.0*x^56.0-0.0*-65.0/x^66.0-0.0*60.0*x^59.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-57.0*x^56.0+0.0/x^66.0-0.0*x^59.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/3503.911764705883*x^63.0+11.5*x^3.0-1.0/3084.857142857143/x^59.0-1.0/3867.042253521127*x^66.0+12.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/3503.911764705883/64.0*x^64.0+11.5/4.0*x^4.0-1.0/3084.857142857143/-58.0/x^58.0-1.0/3867.042253521127/67.0*x^67.0+12.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/224250.3529411765*x^64.0+2.875*x^4.0+1.0/178921.7142857143/x^58.0-1.0/259091.8309859155*x^67.0+3.0*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120538() {
 UsageCalculus.TestCase = 120538;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+69+70/x^62-71*x^63+72*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-64+73/x^65-74*x^66";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "69.0+70.0/x^62.0-71.0*x^63.0+72.0+73.0/x^65.0-74.0*x^66.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+70.0*-62.0/x^63.0-71.0*63.0*x^62.0+72.0*0.0+73.0*-65.0/x^66.0-74.0*66.0*x^65.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-4340.0/x^63.0-4473.0*x^62.0-4745.0/x^66.0-4884.0*x^65.0";
 UsageCalculus.EqnSolArrayMap3[1] = "69.0+70.0/x^62.0-71.0*x^63.0+72.0+73.0/x^65.0-74.0*x^66.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "69.0*x+70.0/-61.0/x^61.0-71.0/64.0*x^64.0+72.0*x+73.0/-64.0/x^64.0-74.0/67.0*x^67.0";
 UsageCalculus.EqnSolArrayMap4[1] = "69.0*x-1.1475409836065573/x^61.0-1.109375*x^64.0+72.0*x-1.140625/x^64.0-1.1044776119402986*x^67.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-4340.0/x^63.0-4473.0*x^62.0-4745.0/x^66.0-4884.0*x^65.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-4340.0*-63.0/x^64.0-4473.0*62.0*x^61.0-4745.0*-66.0/x^67.0-4884.0*65.0*x^64.0";
 UsageCalculus.EqnSolArrayMap2[2] = "273420.0/x^64.0-277326.0*x^61.0+313170.0/x^67.0-317460.0*x^64.0";
 UsageCalculus.EqnSolArrayMap3[2] = "69.0*x-1.1475409836065573/x^61.0-1.109375*x^64.0+72.0*x-1.140625/x^64.0-1.1044776119402986*x^67.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "69.0/2.0*x^2.0-1.1475409836065573/-60.0/x^60.0-1.109375/65.0*x^65.0+72.0/2.0*x^2.0-1.140625/-63.0/x^63.0-1.1044776119402986/68.0*x^68.0";
 UsageCalculus.EqnSolArrayMap4[2] = "34.5*x^2.0+1.0/52.28571428571429/x^60.0-1.0/58.59154929577465*x^65.0+36.0*x^2.0+1.0/55.23287671232877/x^63.0-1.0/61.567567567567565*x^68.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "273420.0/x^64.0-277326.0*x^61.0+313170.0/x^67.0-317460.0*x^64.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "273420.0*-64.0/x^65.0-277326.0*61.0*x^60.0+313170.0*-67.0/x^68.0-317460.0*64.0*x^63.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-1.749888E7/x^65.0-1.6916886E7*x^60.0-2.098239E7/x^68.0-2.031744E7*x^63.0";
 UsageCalculus.EqnSolArrayMap3[3] = "34.5*x^2.0+1.0/52.28571428571429/x^60.0-1.0/58.59154929577465*x^65.0+36.0*x^2.0+1.0/55.23287671232877/x^63.0-1.0/61.567567567567565*x^68.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "34.5/3.0*x^3.0+1.0/52.28571428571429/-59.0/x^59.0-1.0/58.59154929577465/66.0*x^66.0+36.0/3.0*x^3.0+1.0/55.23287671232877/-62.0/x^62.0-1.0/61.567567567567565/69.0*x^69.0";
 UsageCalculus.EqnSolArrayMap4[3] = "11.5*x^3.0-1.0/3084.857142857143/x^59.0-1.0/3867.042253521127*x^66.0+12.0*x^3.0-1.0/3424.4383561643835/x^62.0-1.0/4248.162162162162*x^69.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-1.749888E7/x^65.0-1.6916886E7*x^60.0-2.098239E7/x^68.0-2.031744E7*x^63.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*-65.0/x^66.0-60.0*x^59.0-0.0*-68.0/x^69.0-0.0*63.0*x^62.0";
 UsageCalculus.EqnSolArrayMap2[4] = "0.0/x^66.0-60.0*x^59.0+0.0/x^69.0-0.0*x^62.0";
 UsageCalculus.EqnSolArrayMap3[4] = "11.5*x^3.0-1.0/3084.857142857143/x^59.0-1.0/3867.042253521127*x^66.0+12.0*x^3.0-1.0/3424.4383561643835/x^62.0-1.0/4248.162162162162*x^69.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "11.5/4.0*x^4.0-1.0/3084.857142857143/-58.0/x^58.0-1.0/3867.042253521127/67.0*x^67.0+12.0/4.0*x^4.0-1.0/3424.4383561643835/-61.0/x^61.0-1.0/4248.162162162162/70.0*x^70.0";
 UsageCalculus.EqnSolArrayMap4[4] = "2.875*x^4.0+1.0/178921.7142857143/x^58.0-1.0/259091.8309859155*x^67.0+3.0*x^4.0+1.0/208890.7397260274/x^61.0-1.0/297371.3513513513*x^70.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120539() {
 UsageCalculus.TestCase = 120539;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+70/xyzxy^62-71*xyzxy^63+72*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-64+73/xyzxy^65-74*xyzxy^66+75*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-67+76/xyzxy^68";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyzxy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "70.0/xyzxy^62.0-71.0*xyzxy^63.0+72.0+73.0/xyzxy^65.0-74.0*xyzxy^66.0+75.0+76.0/xyzxy^68.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "70.0*-62.0/xyzxy^63.0-71.0*63.0*xyzxy^62.0+72.0*0.0+73.0*-65.0/xyzxy^66.0-74.0*66.0*xyzxy^65.0+75.0*0.0+76.0*-68.0/xyzxy^69.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-4340.0/xyzxy^63.0-4473.0*xyzxy^62.0-4745.0/xyzxy^66.0-4884.0*xyzxy^65.0-5168.0/xyzxy^69.0";
 UsageCalculus.EqnSolArrayMap3[1] = "70.0/xyzxy^62.0-71.0*xyzxy^63.0+72.0+73.0/xyzxy^65.0-74.0*xyzxy^66.0+75.0+76.0/xyzxy^68.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "70.0/-61.0/xyzxy^61.0-71.0/64.0*xyzxy^64.0+72.0*xyzxy+73.0/-64.0/xyzxy^64.0-74.0/67.0*xyzxy^67.0+75.0*xyzxy+76.0/-67.0/xyzxy^67.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.1475409836065573/xyzxy^61.0-1.109375*xyzxy^64.0+72.0*xyzxy-1.140625/xyzxy^64.0-1.1044776119402986*xyzxy^67.0+75.0*xyzxy-1.1343283582089552/xyzxy^67.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-4340.0/xyzxy^63.0-4473.0*xyzxy^62.0-4745.0/xyzxy^66.0-4884.0*xyzxy^65.0-5168.0/xyzxy^69.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-4340.0*-63.0/xyzxy^64.0-4473.0*62.0*xyzxy^61.0-4745.0*-66.0/xyzxy^67.0-4884.0*65.0*xyzxy^64.0-5168.0*-69.0/xyzxy^70.0";
 UsageCalculus.EqnSolArrayMap2[2] = "273420.0/xyzxy^64.0-277326.0*xyzxy^61.0+313170.0/xyzxy^67.0-317460.0*xyzxy^64.0+356592.0/xyzxy^70.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.1475409836065573/xyzxy^61.0-1.109375*xyzxy^64.0+72.0*xyzxy-1.140625/xyzxy^64.0-1.1044776119402986*xyzxy^67.0+75.0*xyzxy-1.1343283582089552/xyzxy^67.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.1475409836065573/-60.0/xyzxy^60.0-1.109375/65.0*xyzxy^65.0+72.0/2.0*xyzxy^2.0-1.140625/-63.0/xyzxy^63.0-1.1044776119402986/68.0*xyzxy^68.0+75.0/2.0*xyzxy^2.0-1.1343283582089552/-66.0/xyzxy^66.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/52.28571428571429/xyzxy^60.0-1.0/58.59154929577465*xyzxy^65.0+36.0*xyzxy^2.0+1.0/55.23287671232877/xyzxy^63.0-1.0/61.567567567567565*xyzxy^68.0+37.5*xyzxy^2.0+1.0/58.184210526315795/xyzxy^66.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "273420.0/xyzxy^64.0-277326.0*xyzxy^61.0+313170.0/xyzxy^67.0-317460.0*xyzxy^64.0+356592.0/xyzxy^70.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "273420.0*-64.0/xyzxy^65.0-277326.0*61.0*xyzxy^60.0+313170.0*-67.0/xyzxy^68.0-317460.0*64.0*xyzxy^63.0+356592.0*-70.0/xyzxy^71.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-1.749888E7/xyzxy^65.0-1.6916886E7*xyzxy^60.0-2.098239E7/xyzxy^68.0-2.031744E7*xyzxy^63.0-2.496144E7/xyzxy^71.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/52.28571428571429/xyzxy^60.0-1.0/58.59154929577465*xyzxy^65.0+36.0*xyzxy^2.0+1.0/55.23287671232877/xyzxy^63.0-1.0/61.567567567567565*xyzxy^68.0+37.5*xyzxy^2.0+1.0/58.184210526315795/xyzxy^66.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/52.28571428571429/-59.0/xyzxy^59.0-1.0/58.59154929577465/66.0*xyzxy^66.0+36.0/3.0*xyzxy^3.0+1.0/55.23287671232877/-62.0/xyzxy^62.0-1.0/61.567567567567565/69.0*xyzxy^69.0+37.5/3.0*xyzxy^3.0+1.0/58.184210526315795/-65.0/xyzxy^65.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/3084.857142857143/xyzxy^59.0-1.0/3867.042253521127*xyzxy^66.0+12.0*xyzxy^3.0-1.0/3424.4383561643835/xyzxy^62.0-1.0/4248.162162162162*xyzxy^69.0+12.5*xyzxy^3.0-1.0/3781.9736842105267/xyzxy^65.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-1.749888E7/xyzxy^65.0-1.6916886E7*xyzxy^60.0-2.098239E7/xyzxy^68.0-2.031744E7*xyzxy^63.0-2.496144E7/xyzxy^71.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*-65.0/xyzxy^66.0-60.0*xyzxy^59.0-0.0*-68.0/xyzxy^69.0-63.0*xyzxy^62.0-0.0*-71.0/xyzxy^72.0";
 UsageCalculus.EqnSolArrayMap2[4] = "0.0/xyzxy^66.0-60.0*xyzxy^59.0+0.0/xyzxy^69.0-63.0*xyzxy^62.0+0.0/xyzxy^72.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/3084.857142857143/xyzxy^59.0-1.0/3867.042253521127*xyzxy^66.0+12.0*xyzxy^3.0-1.0/3424.4383561643835/xyzxy^62.0-1.0/4248.162162162162*xyzxy^69.0+12.5*xyzxy^3.0-1.0/3781.9736842105267/xyzxy^65.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/3084.857142857143/-58.0/xyzxy^58.0-1.0/3867.042253521127/67.0*xyzxy^67.0+12.0/4.0*xyzxy^4.0-1.0/3424.4383561643835/-61.0/xyzxy^61.0-1.0/4248.162162162162/70.0*xyzxy^70.0+12.5/4.0*xyzxy^4.0-1.0/3781.9736842105267/-64.0/xyzxy^64.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/178921.7142857143/xyzxy^58.0-1.0/259091.8309859155*xyzxy^67.0+3.0*xyzxy^4.0+1.0/208890.7397260274/xyzxy^61.0-1.0/297371.3513513513*xyzxy^70.0+3.125*xyzxy^4.0+1.0/242046.3157894737/xyzxy^64.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120540() {
 UsageCalculus.TestCase = 120540;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-71*x^63+72*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-64+73/x^65-74*x^66+75*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-67+76/x^68-77*x^69+78*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-70";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-71.0*x^63.0+72.0+73.0/x^65.0-74.0*x^66.0+75.0+76.0/x^68.0-77.0*x^69.0+78.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-71.0*63.0*x^62.0+72.0*0.0+73.0*-65.0/x^66.0-74.0*66.0*x^65.0+75.0*0.0+76.0*-68.0/x^69.0-77.0*69.0*x^68.0+78.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-4473.0*x^62.0-4745.0/x^66.0-4884.0*x^65.0-5168.0/x^69.0-5313.0*x^68.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-71.0*x^63.0+72.0+73.0/x^65.0-74.0*x^66.0+75.0+76.0/x^68.0-77.0*x^69.0+78.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-71.0/64.0*x^64.0+72.0*x+73.0/-64.0/x^64.0-74.0/67.0*x^67.0+75.0*x+76.0/-67.0/x^67.0-77.0/70.0*x^70.0+78.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.109375*x^64.0+72.0*x-1.140625/x^64.0-1.1044776119402986*x^67.0+75.0*x-1.1343283582089552/x^67.0-1.1*x^70.0+78.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-4473.0*x^62.0-4745.0/x^66.0-4884.0*x^65.0-5168.0/x^69.0-5313.0*x^68.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-4473.0*62.0*x^61.0-4745.0*-66.0/x^67.0-4884.0*65.0*x^64.0-5168.0*-69.0/x^70.0-5313.0*68.0*x^67.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-277326.0*x^61.0+313170.0/x^67.0-317460.0*x^64.0+356592.0/x^70.0-361284.0*x^67.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.109375*x^64.0+72.0*x-1.140625/x^64.0-1.1044776119402986*x^67.0+75.0*x-1.1343283582089552/x^67.0-1.1*x^70.0+78.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.109375/65.0*x^65.0+72.0/2.0*x^2.0-1.140625/-63.0/x^63.0-1.1044776119402986/68.0*x^68.0+75.0/2.0*x^2.0-1.1343283582089552/-66.0/x^66.0-1.1/71.0*x^71.0+78.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/58.59154929577465*x^65.0+36.0*x^2.0+1.0/55.23287671232877/x^63.0-1.0/61.567567567567565*x^68.0+37.5*x^2.0+1.0/58.184210526315795/x^66.0-1.0/64.54545454545455*x^71.0+39.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-277326.0*x^61.0+313170.0/x^67.0-317460.0*x^64.0+356592.0/x^70.0-361284.0*x^67.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-277326.0*61.0*x^60.0+313170.0*-67.0/x^68.0-317460.0*64.0*x^63.0+356592.0*-70.0/x^71.0-361284.0*67.0*x^66.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-1.6916886E7*x^60.0-2.098239E7/x^68.0-2.031744E7*x^63.0-2.496144E7/x^71.0-2.4206028E7*x^66.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/58.59154929577465*x^65.0+36.0*x^2.0+1.0/55.23287671232877/x^63.0-1.0/61.567567567567565*x^68.0+37.5*x^2.0+1.0/58.184210526315795/x^66.0-1.0/64.54545454545455*x^71.0+39.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/58.59154929577465/66.0*x^66.0+36.0/3.0*x^3.0+1.0/55.23287671232877/-62.0/x^62.0-1.0/61.567567567567565/69.0*x^69.0+37.5/3.0*x^3.0+1.0/58.184210526315795/-65.0/x^65.0-1.0/64.54545454545455/72.0*x^72.0+39.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/3867.042253521127*x^66.0+12.0*x^3.0-1.0/3424.4383561643835/x^62.0-1.0/4248.162162162162*x^69.0+12.5*x^3.0-1.0/3781.9736842105267/x^65.0-1.0/4647.272727272727*x^72.0+13.0*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-1.6916886E7*x^60.0-2.098239E7/x^68.0-2.031744E7*x^63.0-2.496144E7/x^71.0-2.4206028E7*x^66.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-60.0*x^59.0-0.0*-68.0/x^69.0-63.0*x^62.0-0.0*-71.0/x^72.0-0.0*66.0*x^65.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-60.0*x^59.0+0.0/x^69.0-63.0*x^62.0+0.0/x^72.0-0.0*x^65.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/3867.042253521127*x^66.0+12.0*x^3.0-1.0/3424.4383561643835/x^62.0-1.0/4248.162162162162*x^69.0+12.5*x^3.0-1.0/3781.9736842105267/x^65.0-1.0/4647.272727272727*x^72.0+13.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/3867.042253521127/67.0*x^67.0+12.0/4.0*x^4.0-1.0/3424.4383561643835/-61.0/x^61.0-1.0/4248.162162162162/70.0*x^70.0+12.5/4.0*x^4.0-1.0/3781.9736842105267/-64.0/x^64.0-1.0/4647.272727272727/73.0*x^73.0+13.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/259091.8309859155*x^67.0+3.0*x^4.0+1.0/208890.7397260274/x^61.0-1.0/297371.3513513513*x^70.0+3.125*x^4.0+1.0/242046.3157894737/x^64.0-1.0/339250.90909090906*x^73.0+3.25*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120541() {
 UsageCalculus.TestCase = 120541;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+72*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-64+73/x^65-74*x^66+75*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-67+76/x^68-77*x^69+78*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-70+79/x^71-80*x^72";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "72.0+73.0/x^65.0-74.0*x^66.0+75.0+76.0/x^68.0-77.0*x^69.0+78.0+79.0/x^71.0-80.0*x^72.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+73.0*-65.0/x^66.0-74.0*66.0*x^65.0+75.0*0.0+76.0*-68.0/x^69.0-77.0*69.0*x^68.0+78.0*0.0+79.0*-71.0/x^72.0-80.0*72.0*x^71.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-4745.0/x^66.0-4884.0*x^65.0-5168.0/x^69.0-5313.0*x^68.0-5609.0/x^72.0-5760.0*x^71.0";
 UsageCalculus.EqnSolArrayMap3[1] = "72.0+73.0/x^65.0-74.0*x^66.0+75.0+76.0/x^68.0-77.0*x^69.0+78.0+79.0/x^71.0-80.0*x^72.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "72.0*x+73.0/-64.0/x^64.0-74.0/67.0*x^67.0+75.0*x+76.0/-67.0/x^67.0-77.0/70.0*x^70.0+78.0*x+79.0/-70.0/x^70.0-80.0/73.0*x^73.0";
 UsageCalculus.EqnSolArrayMap4[1] = "72.0*x-1.140625/x^64.0-1.1044776119402986*x^67.0+75.0*x-1.1343283582089552/x^67.0-1.1*x^70.0+78.0*x-1.1285714285714286/x^70.0-1.095890410958904*x^73.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-4745.0/x^66.0-4884.0*x^65.0-5168.0/x^69.0-5313.0*x^68.0-5609.0/x^72.0-5760.0*x^71.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-4745.0*-66.0/x^67.0-4884.0*65.0*x^64.0-5168.0*-69.0/x^70.0-5313.0*68.0*x^67.0-5609.0*-72.0/x^73.0-5760.0*71.0*x^70.0";
 UsageCalculus.EqnSolArrayMap2[2] = "313170.0/x^67.0-317460.0*x^64.0+356592.0/x^70.0-361284.0*x^67.0+403848.0/x^73.0-408960.0*x^70.0";
 UsageCalculus.EqnSolArrayMap3[2] = "72.0*x-1.140625/x^64.0-1.1044776119402986*x^67.0+75.0*x-1.1343283582089552/x^67.0-1.1*x^70.0+78.0*x-1.1285714285714286/x^70.0-1.095890410958904*x^73.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "72.0/2.0*x^2.0-1.140625/-63.0/x^63.0-1.1044776119402986/68.0*x^68.0+75.0/2.0*x^2.0-1.1343283582089552/-66.0/x^66.0-1.1/71.0*x^71.0+78.0/2.0*x^2.0-1.1285714285714286/-69.0/x^69.0-1.095890410958904/74.0*x^74.0";
 UsageCalculus.EqnSolArrayMap4[2] = "36.0*x^2.0+1.0/55.23287671232877/x^63.0-1.0/61.567567567567565*x^68.0+37.5*x^2.0+1.0/58.184210526315795/x^66.0-1.0/64.54545454545455*x^71.0+39.0*x^2.0+1.0/61.139240506329116/x^69.0-1.0/67.525*x^74.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "313170.0/x^67.0-317460.0*x^64.0+356592.0/x^70.0-361284.0*x^67.0+403848.0/x^73.0-408960.0*x^70.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "313170.0*-67.0/x^68.0-317460.0*64.0*x^63.0+356592.0*-70.0/x^71.0-361284.0*67.0*x^66.0+403848.0*-73.0/x^74.0-408960.0*70.0*x^69.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-2.098239E7/x^68.0-2.031744E7*x^63.0-2.496144E7/x^71.0-2.4206028E7*x^66.0-2.9480904E7/x^74.0-2.86272E7*x^69.0";
 UsageCalculus.EqnSolArrayMap3[3] = "36.0*x^2.0+1.0/55.23287671232877/x^63.0-1.0/61.567567567567565*x^68.0+37.5*x^2.0+1.0/58.184210526315795/x^66.0-1.0/64.54545454545455*x^71.0+39.0*x^2.0+1.0/61.139240506329116/x^69.0-1.0/67.525*x^74.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "36.0/3.0*x^3.0+1.0/55.23287671232877/-62.0/x^62.0-1.0/61.567567567567565/69.0*x^69.0+37.5/3.0*x^3.0+1.0/58.184210526315795/-65.0/x^65.0-1.0/64.54545454545455/72.0*x^72.0+39.0/3.0*x^3.0+1.0/61.139240506329116/-68.0/x^68.0-1.0/67.525/75.0*x^75.0";
 UsageCalculus.EqnSolArrayMap4[3] = "12.0*x^3.0-1.0/3424.4383561643835/x^62.0-1.0/4248.162162162162*x^69.0+12.5*x^3.0-1.0/3781.9736842105267/x^65.0-1.0/4647.272727272727*x^72.0+13.0*x^3.0-1.0/4157.46835443038/x^68.0-1.0/5064.375*x^75.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-2.098239E7/x^68.0-2.031744E7*x^63.0-2.496144E7/x^71.0-2.4206028E7*x^66.0-2.9480904E7/x^74.0-2.86272E7*x^69.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*-68.0/x^69.0-63.0*x^62.0-0.0*-71.0/x^72.0-66.0*x^65.0-0.0*-74.0/x^75.0-0.0*69.0*x^68.0";
 UsageCalculus.EqnSolArrayMap2[4] = "0.0/x^69.0-63.0*x^62.0+0.0/x^72.0-66.0*x^65.0+0.0/x^75.0-0.0*x^68.0";
 UsageCalculus.EqnSolArrayMap3[4] = "12.0*x^3.0-1.0/3424.4383561643835/x^62.0-1.0/4248.162162162162*x^69.0+12.5*x^3.0-1.0/3781.9736842105267/x^65.0-1.0/4647.272727272727*x^72.0+13.0*x^3.0-1.0/4157.46835443038/x^68.0-1.0/5064.375*x^75.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "12.0/4.0*x^4.0-1.0/3424.4383561643835/-61.0/x^61.0-1.0/4248.162162162162/70.0*x^70.0+12.5/4.0*x^4.0-1.0/3781.9736842105267/-64.0/x^64.0-1.0/4647.272727272727/73.0*x^73.0+13.0/4.0*x^4.0-1.0/4157.46835443038/-67.0/x^67.0-1.0/5064.375/76.0*x^76.0";
 UsageCalculus.EqnSolArrayMap4[4] = "3.0*x^4.0+1.0/208890.7397260274/x^61.0-1.0/297371.3513513513*x^70.0+3.125*x^4.0+1.0/242046.3157894737/x^64.0-1.0/339250.90909090906*x^73.0+3.25*x^4.0+1.0/278550.37974683545/x^67.0-1.0/384892.5*x^76.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120542() {
 UsageCalculus.TestCase = 120542;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+73/x^65-74*x^66+75*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-67+76/x^68-77*x^69+78*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-70+79/x^71-80*x^72+81+82/x^74";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "73.0/x^65.0-74.0*x^66.0+75.0+76.0/x^68.0-77.0*x^69.0+78.0+79.0/x^71.0-80.0*x^72.0+81.0+82.0/x^74.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "73.0*-65.0/x^66.0-74.0*66.0*x^65.0+75.0*0.0+76.0*-68.0/x^69.0-77.0*69.0*x^68.0+78.0*0.0+79.0*-71.0/x^72.0-80.0*72.0*x^71.0+81.0*0.0+82.0*-74.0/x^75.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-4745.0/x^66.0-4884.0*x^65.0-5168.0/x^69.0-5313.0*x^68.0-5609.0/x^72.0-5760.0*x^71.0-6068.0/x^75.0";
 UsageCalculus.EqnSolArrayMap3[1] = "73.0/x^65.0-74.0*x^66.0+75.0+76.0/x^68.0-77.0*x^69.0+78.0+79.0/x^71.0-80.0*x^72.0+81.0+82.0/x^74.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "73.0/-64.0/x^64.0-74.0/67.0*x^67.0+75.0*x+76.0/-67.0/x^67.0-77.0/70.0*x^70.0+78.0*x+79.0/-70.0/x^70.0-80.0/73.0*x^73.0+81.0*x+82.0/-73.0/x^73.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.140625/x^64.0-1.1044776119402986*x^67.0+75.0*x-1.1343283582089552/x^67.0-1.1*x^70.0+78.0*x-1.1285714285714286/x^70.0-1.095890410958904*x^73.0+81.0*x-1.1232876712328768/x^73.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-4745.0/x^66.0-4884.0*x^65.0-5168.0/x^69.0-5313.0*x^68.0-5609.0/x^72.0-5760.0*x^71.0-6068.0/x^75.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-4745.0*-66.0/x^67.0-4884.0*65.0*x^64.0-5168.0*-69.0/x^70.0-5313.0*68.0*x^67.0-5609.0*-72.0/x^73.0-5760.0*71.0*x^70.0-6068.0*-75.0/x^76.0";
 UsageCalculus.EqnSolArrayMap2[2] = "313170.0/x^67.0-317460.0*x^64.0+356592.0/x^70.0-361284.0*x^67.0+403848.0/x^73.0-408960.0*x^70.0+455100.0/x^76.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.140625/x^64.0-1.1044776119402986*x^67.0+75.0*x-1.1343283582089552/x^67.0-1.1*x^70.0+78.0*x-1.1285714285714286/x^70.0-1.095890410958904*x^73.0+81.0*x-1.1232876712328768/x^73.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.140625/-63.0/x^63.0-1.1044776119402986/68.0*x^68.0+75.0/2.0*x^2.0-1.1343283582089552/-66.0/x^66.0-1.1/71.0*x^71.0+78.0/2.0*x^2.0-1.1285714285714286/-69.0/x^69.0-1.095890410958904/74.0*x^74.0+81.0/2.0*x^2.0-1.1232876712328768/-72.0/x^72.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/55.23287671232877/x^63.0-1.0/61.567567567567565*x^68.0+37.5*x^2.0+1.0/58.184210526315795/x^66.0-1.0/64.54545454545455*x^71.0+39.0*x^2.0+1.0/61.139240506329116/x^69.0-1.0/67.525*x^74.0+40.5*x^2.0+1.0/64.09756097560975/x^72.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "313170.0/x^67.0-317460.0*x^64.0+356592.0/x^70.0-361284.0*x^67.0+403848.0/x^73.0-408960.0*x^70.0+455100.0/x^76.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "313170.0*-67.0/x^68.0-317460.0*64.0*x^63.0+356592.0*-70.0/x^71.0-361284.0*67.0*x^66.0+403848.0*-73.0/x^74.0-408960.0*70.0*x^69.0+455100.0*-76.0/x^77.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-2.098239E7/x^68.0-2.031744E7*x^63.0-2.496144E7/x^71.0-2.4206028E7*x^66.0-2.9480904E7/x^74.0-2.86272E7*x^69.0-3.45876E7/x^77.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/55.23287671232877/x^63.0-1.0/61.567567567567565*x^68.0+37.5*x^2.0+1.0/58.184210526315795/x^66.0-1.0/64.54545454545455*x^71.0+39.0*x^2.0+1.0/61.139240506329116/x^69.0-1.0/67.525*x^74.0+40.5*x^2.0+1.0/64.09756097560975/x^72.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/55.23287671232877/-62.0/x^62.0-1.0/61.567567567567565/69.0*x^69.0+37.5/3.0*x^3.0+1.0/58.184210526315795/-65.0/x^65.0-1.0/64.54545454545455/72.0*x^72.0+39.0/3.0*x^3.0+1.0/61.139240506329116/-68.0/x^68.0-1.0/67.525/75.0*x^75.0+40.5/3.0*x^3.0+1.0/64.09756097560975/-71.0/x^71.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/3424.4383561643835/x^62.0-1.0/4248.162162162162*x^69.0+12.5*x^3.0-1.0/3781.9736842105267/x^65.0-1.0/4647.272727272727*x^72.0+13.0*x^3.0-1.0/4157.46835443038/x^68.0-1.0/5064.375*x^75.0+13.5*x^3.0-1.0/4550.926829268293/x^71.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-2.098239E7/x^68.0-2.031744E7*x^63.0-2.496144E7/x^71.0-2.4206028E7*x^66.0-2.9480904E7/x^74.0-2.86272E7*x^69.0-3.45876E7/x^77.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*-68.0/x^69.0-63.0*x^62.0-0.0*-71.0/x^72.0-66.0*x^65.0-0.0*-74.0/x^75.0-69.0*x^68.0-0.0*-77.0/x^78.0";
 UsageCalculus.EqnSolArrayMap2[4] = "0.0/x^69.0-63.0*x^62.0+0.0/x^72.0-66.0*x^65.0+0.0/x^75.0-69.0*x^68.0+0.0/x^78.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/3424.4383561643835/x^62.0-1.0/4248.162162162162*x^69.0+12.5*x^3.0-1.0/3781.9736842105267/x^65.0-1.0/4647.272727272727*x^72.0+13.0*x^3.0-1.0/4157.46835443038/x^68.0-1.0/5064.375*x^75.0+13.5*x^3.0-1.0/4550.926829268293/x^71.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/3424.4383561643835/-61.0/x^61.0-1.0/4248.162162162162/70.0*x^70.0+12.5/4.0*x^4.0-1.0/3781.9736842105267/-64.0/x^64.0-1.0/4647.272727272727/73.0*x^73.0+13.0/4.0*x^4.0-1.0/4157.46835443038/-67.0/x^67.0-1.0/5064.375/76.0*x^76.0+13.5/4.0*x^4.0-1.0/4550.926829268293/-70.0/x^70.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/208890.7397260274/x^61.0-1.0/297371.3513513513*x^70.0+3.125*x^4.0+1.0/242046.3157894737/x^64.0-1.0/339250.90909090906*x^73.0+3.25*x^4.0+1.0/278550.37974683545/x^67.0-1.0/384892.5*x^76.0+3.375*x^4.0+1.0/318564.8780487805/x^70.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120543() {
 UsageCalculus.TestCase = 120543;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-74*xyz^66+75*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-67+76/xyz^68-77*xyz^69+78*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-70+79/xyz^71-80*xyz^72+81+82/xyz^74-83*xyz^75+84";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-74.0*xyz^66.0+75.0+76.0/xyz^68.0-77.0*xyz^69.0+78.0+79.0/xyz^71.0-80.0*xyz^72.0+81.0+82.0/xyz^74.0-83.0*xyz^75.0+84.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-74.0*66.0*xyz^65.0+75.0*0.0+76.0*-68.0/xyz^69.0-77.0*69.0*xyz^68.0+78.0*0.0+79.0*-71.0/xyz^72.0-80.0*72.0*xyz^71.0+81.0*0.0+82.0*-74.0/xyz^75.0-83.0*75.0*xyz^74.0+84.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-4884.0*xyz^65.0-5168.0/xyz^69.0-5313.0*xyz^68.0-5609.0/xyz^72.0-5760.0*xyz^71.0-6068.0/xyz^75.0-6225.0*xyz^74.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-74.0*xyz^66.0+75.0+76.0/xyz^68.0-77.0*xyz^69.0+78.0+79.0/xyz^71.0-80.0*xyz^72.0+81.0+82.0/xyz^74.0-83.0*xyz^75.0+84.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-74.0/67.0*xyz^67.0+75.0*xyz+76.0/-67.0/xyz^67.0-77.0/70.0*xyz^70.0+78.0*xyz+79.0/-70.0/xyz^70.0-80.0/73.0*xyz^73.0+81.0*xyz+82.0/-73.0/xyz^73.0-83.0/76.0*xyz^76.0+84.0*xyz";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.1044776119402986*xyz^67.0+75.0*xyz-1.1343283582089552/xyz^67.0-1.1*xyz^70.0+78.0*xyz-1.1285714285714286/xyz^70.0-1.095890410958904*xyz^73.0+81.0*xyz-1.1232876712328768/xyz^73.0-1.0921052631578947*xyz^76.0+84.0*xyz";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-4884.0*xyz^65.0-5168.0/xyz^69.0-5313.0*xyz^68.0-5609.0/xyz^72.0-5760.0*xyz^71.0-6068.0/xyz^75.0-6225.0*xyz^74.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-4884.0*65.0*xyz^64.0-5168.0*-69.0/xyz^70.0-5313.0*68.0*xyz^67.0-5609.0*-72.0/xyz^73.0-5760.0*71.0*xyz^70.0-6068.0*-75.0/xyz^76.0-6225.0*74.0*xyz^73.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-317460.0*xyz^64.0+356592.0/xyz^70.0-361284.0*xyz^67.0+403848.0/xyz^73.0-408960.0*xyz^70.0+455100.0/xyz^76.0-460650.0*xyz^73.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.1044776119402986*xyz^67.0+75.0*xyz-1.1343283582089552/xyz^67.0-1.1*xyz^70.0+78.0*xyz-1.1285714285714286/xyz^70.0-1.095890410958904*xyz^73.0+81.0*xyz-1.1232876712328768/xyz^73.0-1.0921052631578947*xyz^76.0+84.0*xyz";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.1044776119402986/68.0*xyz^68.0+75.0/2.0*xyz^2.0-1.1343283582089552/-66.0/xyz^66.0-1.1/71.0*xyz^71.0+78.0/2.0*xyz^2.0-1.1285714285714286/-69.0/xyz^69.0-1.095890410958904/74.0*xyz^74.0+81.0/2.0*xyz^2.0-1.1232876712328768/-72.0/xyz^72.0-1.0921052631578947/77.0*xyz^77.0+84.0/2.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/61.567567567567565*xyz^68.0+37.5*xyz^2.0+1.0/58.184210526315795/xyz^66.0-1.0/64.54545454545455*xyz^71.0+39.0*xyz^2.0+1.0/61.139240506329116/xyz^69.0-1.0/67.525*xyz^74.0+40.5*xyz^2.0+1.0/64.09756097560975/xyz^72.0-1.0/70.50602409638554*xyz^77.0+42.0*xyz^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-317460.0*xyz^64.0+356592.0/xyz^70.0-361284.0*xyz^67.0+403848.0/xyz^73.0-408960.0*xyz^70.0+455100.0/xyz^76.0-460650.0*xyz^73.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-317460.0*64.0*xyz^63.0+356592.0*-70.0/xyz^71.0-361284.0*67.0*xyz^66.0+403848.0*-73.0/xyz^74.0-408960.0*70.0*xyz^69.0+455100.0*-76.0/xyz^77.0-460650.0*73.0*xyz^72.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-2.031744E7*xyz^63.0-2.496144E7/xyz^71.0-2.4206028E7*xyz^66.0-2.9480904E7/xyz^74.0-2.86272E7*xyz^69.0-3.45876E7/xyz^77.0-3.362745E7*xyz^72.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/61.567567567567565*xyz^68.0+37.5*xyz^2.0+1.0/58.184210526315795/xyz^66.0-1.0/64.54545454545455*xyz^71.0+39.0*xyz^2.0+1.0/61.139240506329116/xyz^69.0-1.0/67.525*xyz^74.0+40.5*xyz^2.0+1.0/64.09756097560975/xyz^72.0-1.0/70.50602409638554*xyz^77.0+42.0*xyz^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/61.567567567567565/69.0*xyz^69.0+37.5/3.0*xyz^3.0+1.0/58.184210526315795/-65.0/xyz^65.0-1.0/64.54545454545455/72.0*xyz^72.0+39.0/3.0*xyz^3.0+1.0/61.139240506329116/-68.0/xyz^68.0-1.0/67.525/75.0*xyz^75.0+40.5/3.0*xyz^3.0+1.0/64.09756097560975/-71.0/xyz^71.0-1.0/70.50602409638554/78.0*xyz^78.0+42.0/3.0*xyz^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/4248.162162162162*xyz^69.0+12.5*xyz^3.0-1.0/3781.9736842105267/xyz^65.0-1.0/4647.272727272727*xyz^72.0+13.0*xyz^3.0-1.0/4157.46835443038/xyz^68.0-1.0/5064.375*xyz^75.0+13.5*xyz^3.0-1.0/4550.926829268293/xyz^71.0-1.0/5499.469879518072*xyz^78.0+14.0*xyz^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-2.031744E7*xyz^63.0-2.496144E7/xyz^71.0-2.4206028E7*xyz^66.0-2.9480904E7/xyz^74.0-2.86272E7*xyz^69.0-3.45876E7/xyz^77.0-3.362745E7*xyz^72.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-63.0*xyz^62.0-0.0*-71.0/xyz^72.0-66.0*xyz^65.0-0.0*-74.0/xyz^75.0-69.0*xyz^68.0-0.0*-77.0/xyz^78.0-0.0*72.0*xyz^71.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-63.0*xyz^62.0+0.0/xyz^72.0-66.0*xyz^65.0+0.0/xyz^75.0-69.0*xyz^68.0+0.0/xyz^78.0-0.0*xyz^71.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/4248.162162162162*xyz^69.0+12.5*xyz^3.0-1.0/3781.9736842105267/xyz^65.0-1.0/4647.272727272727*xyz^72.0+13.0*xyz^3.0-1.0/4157.46835443038/xyz^68.0-1.0/5064.375*xyz^75.0+13.5*xyz^3.0-1.0/4550.926829268293/xyz^71.0-1.0/5499.469879518072*xyz^78.0+14.0*xyz^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/4248.162162162162/70.0*xyz^70.0+12.5/4.0*xyz^4.0-1.0/3781.9736842105267/-64.0/xyz^64.0-1.0/4647.272727272727/73.0*xyz^73.0+13.0/4.0*xyz^4.0-1.0/4157.46835443038/-67.0/xyz^67.0-1.0/5064.375/76.0*xyz^76.0+13.5/4.0*xyz^4.0-1.0/4550.926829268293/-70.0/xyz^70.0-1.0/5499.469879518072/79.0*xyz^79.0+14.0/4.0*xyz^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/297371.3513513513*xyz^70.0+3.125*xyz^4.0+1.0/242046.3157894737/xyz^64.0-1.0/339250.90909090906*xyz^73.0+3.25*xyz^4.0+1.0/278550.37974683545/xyz^67.0-1.0/384892.5*xyz^76.0+3.375*xyz^4.0+1.0/318564.8780487805/xyz^70.0-1.0/434458.1204819277*xyz^79.0+3.5*xyz^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120544() {
 UsageCalculus.TestCase = 120544;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+75*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-67+76/x^68-77*x^69+78*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-70+79/x^71-80*x^72+81+82/x^74-83*x^75+84+85/x^77-86*x^78";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "75.0+76.0/x^68.0-77.0*x^69.0+78.0+79.0/x^71.0-80.0*x^72.0+81.0+82.0/x^74.0-83.0*x^75.0+84.0+85.0/x^77.0-86.0*x^78.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+76.0*-68.0/x^69.0-77.0*69.0*x^68.0+78.0*0.0+79.0*-71.0/x^72.0-80.0*72.0*x^71.0+81.0*0.0+82.0*-74.0/x^75.0-83.0*75.0*x^74.0+84.0*0.0+85.0*-77.0/x^78.0-86.0*78.0*x^77.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-5168.0/x^69.0-5313.0*x^68.0-5609.0/x^72.0-5760.0*x^71.0-6068.0/x^75.0-6225.0*x^74.0-6545.0/x^78.0-6708.0*x^77.0";
 UsageCalculus.EqnSolArrayMap3[1] = "75.0+76.0/x^68.0-77.0*x^69.0+78.0+79.0/x^71.0-80.0*x^72.0+81.0+82.0/x^74.0-83.0*x^75.0+84.0+85.0/x^77.0-86.0*x^78.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "75.0*x+76.0/-67.0/x^67.0-77.0/70.0*x^70.0+78.0*x+79.0/-70.0/x^70.0-80.0/73.0*x^73.0+81.0*x+82.0/-73.0/x^73.0-83.0/76.0*x^76.0+84.0*x+85.0/-76.0/x^76.0-86.0/79.0*x^79.0";
 UsageCalculus.EqnSolArrayMap4[1] = "75.0*x-1.1343283582089552/x^67.0-1.1*x^70.0+78.0*x-1.1285714285714286/x^70.0-1.095890410958904*x^73.0+81.0*x-1.1232876712328768/x^73.0-1.0921052631578947*x^76.0+84.0*x-1.118421052631579/x^76.0-1.0886075949367089*x^79.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-5168.0/x^69.0-5313.0*x^68.0-5609.0/x^72.0-5760.0*x^71.0-6068.0/x^75.0-6225.0*x^74.0-6545.0/x^78.0-6708.0*x^77.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-5168.0*-69.0/x^70.0-5313.0*68.0*x^67.0-5609.0*-72.0/x^73.0-5760.0*71.0*x^70.0-6068.0*-75.0/x^76.0-6225.0*74.0*x^73.0-6545.0*-78.0/x^79.0-6708.0*77.0*x^76.0";
 UsageCalculus.EqnSolArrayMap2[2] = "356592.0/x^70.0-361284.0*x^67.0+403848.0/x^73.0-408960.0*x^70.0+455100.0/x^76.0-460650.0*x^73.0+510510.0/x^79.0-516516.0*x^76.0";
 UsageCalculus.EqnSolArrayMap3[2] = "75.0*x-1.1343283582089552/x^67.0-1.1*x^70.0+78.0*x-1.1285714285714286/x^70.0-1.095890410958904*x^73.0+81.0*x-1.1232876712328768/x^73.0-1.0921052631578947*x^76.0+84.0*x-1.118421052631579/x^76.0-1.0886075949367089*x^79.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "75.0/2.0*x^2.0-1.1343283582089552/-66.0/x^66.0-1.1/71.0*x^71.0+78.0/2.0*x^2.0-1.1285714285714286/-69.0/x^69.0-1.095890410958904/74.0*x^74.0+81.0/2.0*x^2.0-1.1232876712328768/-72.0/x^72.0-1.0921052631578947/77.0*x^77.0+84.0/2.0*x^2.0-1.118421052631579/-75.0/x^75.0-1.0886075949367089/80.0*x^80.0";
 UsageCalculus.EqnSolArrayMap4[2] = "37.5*x^2.0+1.0/58.184210526315795/x^66.0-1.0/64.54545454545455*x^71.0+39.0*x^2.0+1.0/61.139240506329116/x^69.0-1.0/67.525*x^74.0+40.5*x^2.0+1.0/64.09756097560975/x^72.0-1.0/70.50602409638554*x^77.0+42.0*x^2.0+1.0/67.05882352941177/x^75.0-1.0/73.48837209302326*x^80.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "356592.0/x^70.0-361284.0*x^67.0+403848.0/x^73.0-408960.0*x^70.0+455100.0/x^76.0-460650.0*x^73.0+510510.0/x^79.0-516516.0*x^76.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "356592.0*-70.0/x^71.0-361284.0*67.0*x^66.0+403848.0*-73.0/x^74.0-408960.0*70.0*x^69.0+455100.0*-76.0/x^77.0-460650.0*73.0*x^72.0+510510.0*-79.0/x^80.0-516516.0*76.0*x^75.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-2.496144E7/x^71.0-2.4206028E7*x^66.0-2.9480904E7/x^74.0-2.86272E7*x^69.0-3.45876E7/x^77.0-3.362745E7*x^72.0-4.033029E7/x^80.0-3.9255216E7*x^75.0";
 UsageCalculus.EqnSolArrayMap3[3] = "37.5*x^2.0+1.0/58.184210526315795/x^66.0-1.0/64.54545454545455*x^71.0+39.0*x^2.0+1.0/61.139240506329116/x^69.0-1.0/67.525*x^74.0+40.5*x^2.0+1.0/64.09756097560975/x^72.0-1.0/70.50602409638554*x^77.0+42.0*x^2.0+1.0/67.05882352941177/x^75.0-1.0/73.48837209302326*x^80.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "37.5/3.0*x^3.0+1.0/58.184210526315795/-65.0/x^65.0-1.0/64.54545454545455/72.0*x^72.0+39.0/3.0*x^3.0+1.0/61.139240506329116/-68.0/x^68.0-1.0/67.525/75.0*x^75.0+40.5/3.0*x^3.0+1.0/64.09756097560975/-71.0/x^71.0-1.0/70.50602409638554/78.0*x^78.0+42.0/3.0*x^3.0+1.0/67.05882352941177/-74.0/x^74.0-1.0/73.48837209302326/81.0*x^81.0";
 UsageCalculus.EqnSolArrayMap4[3] = "12.5*x^3.0-1.0/3781.9736842105267/x^65.0-1.0/4647.272727272727*x^72.0+13.0*x^3.0-1.0/4157.46835443038/x^68.0-1.0/5064.375*x^75.0+13.5*x^3.0-1.0/4550.926829268293/x^71.0-1.0/5499.469879518072*x^78.0+14.0*x^3.0-1.0/4962.352941176471/x^74.0-1.0/5952.558139534884*x^81.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-2.496144E7/x^71.0-2.4206028E7*x^66.0-2.9480904E7/x^74.0-2.86272E7*x^69.0-3.45876E7/x^77.0-3.362745E7*x^72.0-4.033029E7/x^80.0-3.9255216E7*x^75.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*-71.0/x^72.0-66.0*x^65.0-0.0*-74.0/x^75.0-69.0*x^68.0-0.0*-77.0/x^78.0-72.0*x^71.0-0.0*-80.0/x^81.0-0.0*75.0*x^74.0";
 UsageCalculus.EqnSolArrayMap2[4] = "0.0/x^72.0-66.0*x^65.0+0.0/x^75.0-69.0*x^68.0+0.0/x^78.0-72.0*x^71.0+0.0/x^81.0-0.0*x^74.0";
 UsageCalculus.EqnSolArrayMap3[4] = "12.5*x^3.0-1.0/3781.9736842105267/x^65.0-1.0/4647.272727272727*x^72.0+13.0*x^3.0-1.0/4157.46835443038/x^68.0-1.0/5064.375*x^75.0+13.5*x^3.0-1.0/4550.926829268293/x^71.0-1.0/5499.469879518072*x^78.0+14.0*x^3.0-1.0/4962.352941176471/x^74.0-1.0/5952.558139534884*x^81.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "12.5/4.0*x^4.0-1.0/3781.9736842105267/-64.0/x^64.0-1.0/4647.272727272727/73.0*x^73.0+13.0/4.0*x^4.0-1.0/4157.46835443038/-67.0/x^67.0-1.0/5064.375/76.0*x^76.0+13.5/4.0*x^4.0-1.0/4550.926829268293/-70.0/x^70.0-1.0/5499.469879518072/79.0*x^79.0+14.0/4.0*x^4.0-1.0/4962.352941176471/-73.0/x^73.0-1.0/5952.558139534884/82.0*x^82.0";
 UsageCalculus.EqnSolArrayMap4[4] = "3.125*x^4.0+1.0/242046.3157894737/x^64.0-1.0/339250.90909090906*x^73.0+3.25*x^4.0+1.0/278550.37974683545/x^67.0-1.0/384892.5*x^76.0+3.375*x^4.0+1.0/318564.8780487805/x^70.0-1.0/434458.1204819277*x^79.0+3.5*x^4.0+1.0/362251.7647058824/x^73.0-1.0/488109.76744186046*x^82.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120545() {
 UsageCalculus.TestCase = 120545;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+76-77+78*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-70+79-80+81+82-83+84+85-86+87*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-79+88";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "76.0-77.0+78.0+79.0-80.0+81.0+82.0-83.0+84.0+85.0-86.0+87.0+88.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0-77.0*0.0+78.0*0.0+79.0*0.0-80.0*0.0+81.0*0.0+82.0*0.0-83.0*0.0+84.0*0.0+85.0*0.0-86.0*0.0+87.0*0.0+88.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "76.0-77.0+78.0+79.0-80.0+81.0+82.0-83.0+84.0+85.0-86.0+87.0+88.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "76.0*x-77.0*x+78.0*x+79.0*x-80.0*x+81.0*x+82.0*x-83.0*x+84.0*x+85.0*x-86.0*x+87.0*x+88.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "76.0*x-77.0*x+78.0*x+79.0*x-80.0*x+81.0*x+82.0*x-83.0*x+84.0*x+85.0*x-86.0*x+87.0*x+88.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "76.0*x-77.0*x+78.0*x+79.0*x-80.0*x+81.0*x+82.0*x-83.0*x+84.0*x+85.0*x-86.0*x+87.0*x+88.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "76.0/2.0*x^2.0-77.0/2.0*x^2.0+78.0/2.0*x^2.0+79.0/2.0*x^2.0-80.0/2.0*x^2.0+81.0/2.0*x^2.0+82.0/2.0*x^2.0-83.0/2.0*x^2.0+84.0/2.0*x^2.0+85.0/2.0*x^2.0-86.0/2.0*x^2.0+87.0/2.0*x^2.0+88.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "38.0*x^2.0-38.5*x^2.0+39.0*x^2.0+39.5*x^2.0-40.0*x^2.0+40.5*x^2.0+41.0*x^2.0-41.5*x^2.0+42.0*x^2.0+42.5*x^2.0-43.0*x^2.0+43.5*x^2.0+44.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "38.0*x^2.0-38.5*x^2.0+39.0*x^2.0+39.5*x^2.0-40.0*x^2.0+40.5*x^2.0+41.0*x^2.0-41.5*x^2.0+42.0*x^2.0+42.5*x^2.0-43.0*x^2.0+43.5*x^2.0+44.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "38.0/3.0*x^3.0-38.5/3.0*x^3.0+39.0/3.0*x^3.0+39.5/3.0*x^3.0-40.0/3.0*x^3.0+40.5/3.0*x^3.0+41.0/3.0*x^3.0-41.5/3.0*x^3.0+42.0/3.0*x^3.0+42.5/3.0*x^3.0-43.0/3.0*x^3.0+43.5/3.0*x^3.0+44.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "12.666666666666666*x^3.0-12.833333333333334*x^3.0+13.0*x^3.0+13.166666666666666*x^3.0-13.333333333333334*x^3.0+13.5*x^3.0+13.666666666666666*x^3.0-13.833333333333334*x^3.0+14.0*x^3.0+14.166666666666666*x^3.0-14.333333333333334*x^3.0+14.5*x^3.0+14.666666666666666*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "12.666666666666666*x^3.0-12.833333333333334*x^3.0+13.0*x^3.0+13.166666666666666*x^3.0-13.333333333333334*x^3.0+13.5*x^3.0+13.666666666666666*x^3.0-13.833333333333334*x^3.0+14.0*x^3.0+14.166666666666666*x^3.0-14.333333333333334*x^3.0+14.5*x^3.0+14.666666666666666*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "12.666666666666666/4.0*x^4.0-12.833333333333334/4.0*x^4.0+13.0/4.0*x^4.0+13.166666666666666/4.0*x^4.0-13.333333333333334/4.0*x^4.0+13.5/4.0*x^4.0+13.666666666666666/4.0*x^4.0-13.833333333333334/4.0*x^4.0+14.0/4.0*x^4.0+14.166666666666666/4.0*x^4.0-14.333333333333334/4.0*x^4.0+14.5/4.0*x^4.0+14.666666666666666/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "3.1666666666666665*x^4.0-3.2083333333333335*x^4.0+3.25*x^4.0+3.2916666666666665*x^4.0-3.3333333333333335*x^4.0+3.375*x^4.0+3.4166666666666665*x^4.0-3.4583333333333335*x^4.0+3.5*x^4.0+3.5416666666666665*x^4.0-3.5833333333333335*x^4.0+3.625*x^4.0+3.6666666666666665*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120546() {
 UsageCalculus.TestCase = 120546;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-77*x^69+78*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-70+79/x^71-80*x^72+81+82/x^74-83*x^75+84+85/x^77-86*x^78+87*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-79+88/x^80-89*x^81+90*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-82";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-77.0*x^69.0+78.0+79.0/x^71.0-80.0*x^72.0+81.0+82.0/x^74.0-83.0*x^75.0+84.0+85.0/x^77.0-86.0*x^78.0+87.0+88.0/x^80.0-89.0*x^81.0+90.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-77.0*69.0*x^68.0+78.0*0.0+79.0*-71.0/x^72.0-80.0*72.0*x^71.0+81.0*0.0+82.0*-74.0/x^75.0-83.0*75.0*x^74.0+84.0*0.0+85.0*-77.0/x^78.0-86.0*78.0*x^77.0+87.0*0.0+88.0*-80.0/x^81.0-89.0*81.0*x^80.0+90.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-5313.0*x^68.0-5609.0/x^72.0-5760.0*x^71.0-6068.0/x^75.0-6225.0*x^74.0-6545.0/x^78.0-6708.0*x^77.0-7040.0/x^81.0-7209.0*x^80.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-77.0*x^69.0+78.0+79.0/x^71.0-80.0*x^72.0+81.0+82.0/x^74.0-83.0*x^75.0+84.0+85.0/x^77.0-86.0*x^78.0+87.0+88.0/x^80.0-89.0*x^81.0+90.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-77.0/70.0*x^70.0+78.0*x+79.0/-70.0/x^70.0-80.0/73.0*x^73.0+81.0*x+82.0/-73.0/x^73.0-83.0/76.0*x^76.0+84.0*x+85.0/-76.0/x^76.0-86.0/79.0*x^79.0+87.0*x+88.0/-79.0/x^79.0-89.0/82.0*x^82.0+90.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.1*x^70.0+78.0*x-1.1285714285714286/x^70.0-1.095890410958904*x^73.0+81.0*x-1.1232876712328768/x^73.0-1.0921052631578947*x^76.0+84.0*x-1.118421052631579/x^76.0-1.0886075949367089*x^79.0+87.0*x-1.1139240506329113/x^79.0-1.0853658536585367*x^82.0+90.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-5313.0*x^68.0-5609.0/x^72.0-5760.0*x^71.0-6068.0/x^75.0-6225.0*x^74.0-6545.0/x^78.0-6708.0*x^77.0-7040.0/x^81.0-7209.0*x^80.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-5313.0*68.0*x^67.0-5609.0*-72.0/x^73.0-5760.0*71.0*x^70.0-6068.0*-75.0/x^76.0-6225.0*74.0*x^73.0-6545.0*-78.0/x^79.0-6708.0*77.0*x^76.0-7040.0*-81.0/x^82.0-7209.0*80.0*x^79.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-361284.0*x^67.0+403848.0/x^73.0-408960.0*x^70.0+455100.0/x^76.0-460650.0*x^73.0+510510.0/x^79.0-516516.0*x^76.0+570240.0/x^82.0-576720.0*x^79.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.1*x^70.0+78.0*x-1.1285714285714286/x^70.0-1.095890410958904*x^73.0+81.0*x-1.1232876712328768/x^73.0-1.0921052631578947*x^76.0+84.0*x-1.118421052631579/x^76.0-1.0886075949367089*x^79.0+87.0*x-1.1139240506329113/x^79.0-1.0853658536585367*x^82.0+90.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.1/71.0*x^71.0+78.0/2.0*x^2.0-1.1285714285714286/-69.0/x^69.0-1.095890410958904/74.0*x^74.0+81.0/2.0*x^2.0-1.1232876712328768/-72.0/x^72.0-1.0921052631578947/77.0*x^77.0+84.0/2.0*x^2.0-1.118421052631579/-75.0/x^75.0-1.0886075949367089/80.0*x^80.0+87.0/2.0*x^2.0-1.1139240506329113/-78.0/x^78.0-1.0853658536585367/83.0*x^83.0+90.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/64.54545454545455*x^71.0+39.0*x^2.0+1.0/61.139240506329116/x^69.0-1.0/67.525*x^74.0+40.5*x^2.0+1.0/64.09756097560975/x^72.0-1.0/70.50602409638554*x^77.0+42.0*x^2.0+1.0/67.05882352941177/x^75.0-1.0/73.48837209302326*x^80.0+43.5*x^2.0+1.0/70.02272727272728/x^78.0-1.0/76.47191011235955*x^83.0+45.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-361284.0*x^67.0+403848.0/x^73.0-408960.0*x^70.0+455100.0/x^76.0-460650.0*x^73.0+510510.0/x^79.0-516516.0*x^76.0+570240.0/x^82.0-576720.0*x^79.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-361284.0*67.0*x^66.0+403848.0*-73.0/x^74.0-408960.0*70.0*x^69.0+455100.0*-76.0/x^77.0-460650.0*73.0*x^72.0+510510.0*-79.0/x^80.0-516516.0*76.0*x^75.0+570240.0*-82.0/x^83.0-576720.0*79.0*x^78.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-2.4206028E7*x^66.0-2.9480904E7/x^74.0-2.86272E7*x^69.0-3.45876E7/x^77.0-3.362745E7*x^72.0-4.033029E7/x^80.0-3.9255216E7*x^75.0-4.675968E7/x^83.0-4.556088E7*x^78.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/64.54545454545455*x^71.0+39.0*x^2.0+1.0/61.139240506329116/x^69.0-1.0/67.525*x^74.0+40.5*x^2.0+1.0/64.09756097560975/x^72.0-1.0/70.50602409638554*x^77.0+42.0*x^2.0+1.0/67.05882352941177/x^75.0-1.0/73.48837209302326*x^80.0+43.5*x^2.0+1.0/70.02272727272728/x^78.0-1.0/76.47191011235955*x^83.0+45.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/64.54545454545455/72.0*x^72.0+39.0/3.0*x^3.0+1.0/61.139240506329116/-68.0/x^68.0-1.0/67.525/75.0*x^75.0+40.5/3.0*x^3.0+1.0/64.09756097560975/-71.0/x^71.0-1.0/70.50602409638554/78.0*x^78.0+42.0/3.0*x^3.0+1.0/67.05882352941177/-74.0/x^74.0-1.0/73.48837209302326/81.0*x^81.0+43.5/3.0*x^3.0+1.0/70.02272727272728/-77.0/x^77.0-1.0/76.47191011235955/84.0*x^84.0+45.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/4647.272727272727*x^72.0+13.0*x^3.0-1.0/4157.46835443038/x^68.0-1.0/5064.375*x^75.0+13.5*x^3.0-1.0/4550.926829268293/x^71.0-1.0/5499.469879518072*x^78.0+14.0*x^3.0-1.0/4962.352941176471/x^74.0-1.0/5952.558139534884*x^81.0+14.5*x^3.0-1.0/5391.750000000001/x^77.0-1.0/6423.640449438202*x^84.0+15.0*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-2.4206028E7*x^66.0-2.9480904E7/x^74.0-2.86272E7*x^69.0-3.45876E7/x^77.0-3.362745E7*x^72.0-4.033029E7/x^80.0-3.9255216E7*x^75.0-4.675968E7/x^83.0-4.556088E7*x^78.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-66.0*x^65.0-0.0*-74.0/x^75.0-69.0*x^68.0-0.0*-77.0/x^78.0-72.0*x^71.0-0.0*-80.0/x^81.0-75.0*x^74.0-0.0*-83.0/x^84.0-0.0*78.0*x^77.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-66.0*x^65.0+0.0/x^75.0-69.0*x^68.0+0.0/x^78.0-72.0*x^71.0+0.0/x^81.0-75.0*x^74.0+0.0/x^84.0-0.0*x^77.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/4647.272727272727*x^72.0+13.0*x^3.0-1.0/4157.46835443038/x^68.0-1.0/5064.375*x^75.0+13.5*x^3.0-1.0/4550.926829268293/x^71.0-1.0/5499.469879518072*x^78.0+14.0*x^3.0-1.0/4962.352941176471/x^74.0-1.0/5952.558139534884*x^81.0+14.5*x^3.0-1.0/5391.750000000001/x^77.0-1.0/6423.640449438202*x^84.0+15.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/4647.272727272727/73.0*x^73.0+13.0/4.0*x^4.0-1.0/4157.46835443038/-67.0/x^67.0-1.0/5064.375/76.0*x^76.0+13.5/4.0*x^4.0-1.0/4550.926829268293/-70.0/x^70.0-1.0/5499.469879518072/79.0*x^79.0+14.0/4.0*x^4.0-1.0/4962.352941176471/-73.0/x^73.0-1.0/5952.558139534884/82.0*x^82.0+14.5/4.0*x^4.0-1.0/5391.750000000001/-76.0/x^76.0-1.0/6423.640449438202/85.0*x^85.0+15.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/339250.90909090906*x^73.0+3.25*x^4.0+1.0/278550.37974683545/x^67.0-1.0/384892.5*x^76.0+3.375*x^4.0+1.0/318564.8780487805/x^70.0-1.0/434458.1204819277*x^79.0+3.5*x^4.0+1.0/362251.7647058824/x^73.0-1.0/488109.76744186046*x^82.0+3.625*x^4.0+1.0/409773.00000000006/x^76.0-1.0/546009.4382022471*x^85.0+3.75*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120547() {
 UsageCalculus.TestCase = 120547;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+78*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-70+79/x^71-80*x^72+81+82/x^74-83*x^75+84+85/x^77-86*x^78+87*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-79+88/x^80-89*x^81+90*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-82+91/x^83-92*x^84";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "78.0+79.0/x^71.0-80.0*x^72.0+81.0+82.0/x^74.0-83.0*x^75.0+84.0+85.0/x^77.0-86.0*x^78.0+87.0+88.0/x^80.0-89.0*x^81.0+90.0+91.0/x^83.0-92.0*x^84.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+79.0*-71.0/x^72.0-80.0*72.0*x^71.0+81.0*0.0+82.0*-74.0/x^75.0-83.0*75.0*x^74.0+84.0*0.0+85.0*-77.0/x^78.0-86.0*78.0*x^77.0+87.0*0.0+88.0*-80.0/x^81.0-89.0*81.0*x^80.0+90.0*0.0+91.0*-83.0/x^84.0-92.0*84.0*x^83.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-5609.0/x^72.0-5760.0*x^71.0-6068.0/x^75.0-6225.0*x^74.0-6545.0/x^78.0-6708.0*x^77.0-7040.0/x^81.0-7209.0*x^80.0-7553.0/x^84.0-7728.0*x^83.0";
 UsageCalculus.EqnSolArrayMap3[1] = "78.0+79.0/x^71.0-80.0*x^72.0+81.0+82.0/x^74.0-83.0*x^75.0+84.0+85.0/x^77.0-86.0*x^78.0+87.0+88.0/x^80.0-89.0*x^81.0+90.0+91.0/x^83.0-92.0*x^84.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "78.0*x+79.0/-70.0/x^70.0-80.0/73.0*x^73.0+81.0*x+82.0/-73.0/x^73.0-83.0/76.0*x^76.0+84.0*x+85.0/-76.0/x^76.0-86.0/79.0*x^79.0+87.0*x+88.0/-79.0/x^79.0-89.0/82.0*x^82.0+90.0*x+91.0/-82.0/x^82.0-92.0/85.0*x^85.0";
 UsageCalculus.EqnSolArrayMap4[1] = "78.0*x-1.1285714285714286/x^70.0-1.095890410958904*x^73.0+81.0*x-1.1232876712328768/x^73.0-1.0921052631578947*x^76.0+84.0*x-1.118421052631579/x^76.0-1.0886075949367089*x^79.0+87.0*x-1.1139240506329113/x^79.0-1.0853658536585367*x^82.0+90.0*x-1.1097560975609757/x^82.0-1.0823529411764705*x^85.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-5609.0/x^72.0-5760.0*x^71.0-6068.0/x^75.0-6225.0*x^74.0-6545.0/x^78.0-6708.0*x^77.0-7040.0/x^81.0-7209.0*x^80.0-7553.0/x^84.0-7728.0*x^83.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-5609.0*-72.0/x^73.0-5760.0*71.0*x^70.0-6068.0*-75.0/x^76.0-6225.0*74.0*x^73.0-6545.0*-78.0/x^79.0-6708.0*77.0*x^76.0-7040.0*-81.0/x^82.0-7209.0*80.0*x^79.0-7553.0*-84.0/x^85.0-7728.0*83.0*x^82.0";
 UsageCalculus.EqnSolArrayMap2[2] = "403848.0/x^73.0-408960.0*x^70.0+455100.0/x^76.0-460650.0*x^73.0+510510.0/x^79.0-516516.0*x^76.0+570240.0/x^82.0-576720.0*x^79.0+634452.0/x^85.0-641424.0*x^82.0";
 UsageCalculus.EqnSolArrayMap3[2] = "78.0*x-1.1285714285714286/x^70.0-1.095890410958904*x^73.0+81.0*x-1.1232876712328768/x^73.0-1.0921052631578947*x^76.0+84.0*x-1.118421052631579/x^76.0-1.0886075949367089*x^79.0+87.0*x-1.1139240506329113/x^79.0-1.0853658536585367*x^82.0+90.0*x-1.1097560975609757/x^82.0-1.0823529411764705*x^85.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "78.0/2.0*x^2.0-1.1285714285714286/-69.0/x^69.0-1.095890410958904/74.0*x^74.0+81.0/2.0*x^2.0-1.1232876712328768/-72.0/x^72.0-1.0921052631578947/77.0*x^77.0+84.0/2.0*x^2.0-1.118421052631579/-75.0/x^75.0-1.0886075949367089/80.0*x^80.0+87.0/2.0*x^2.0-1.1139240506329113/-78.0/x^78.0-1.0853658536585367/83.0*x^83.0+90.0/2.0*x^2.0-1.1097560975609757/-81.0/x^81.0-1.0823529411764705/86.0*x^86.0";
 UsageCalculus.EqnSolArrayMap4[2] = "39.0*x^2.0+1.0/61.139240506329116/x^69.0-1.0/67.525*x^74.0+40.5*x^2.0+1.0/64.09756097560975/x^72.0-1.0/70.50602409638554*x^77.0+42.0*x^2.0+1.0/67.05882352941177/x^75.0-1.0/73.48837209302326*x^80.0+43.5*x^2.0+1.0/70.02272727272728/x^78.0-1.0/76.47191011235955*x^83.0+45.0*x^2.0+1.0/72.98901098901098/x^81.0-1.0/79.45652173913044*x^86.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "403848.0/x^73.0-408960.0*x^70.0+455100.0/x^76.0-460650.0*x^73.0+510510.0/x^79.0-516516.0*x^76.0+570240.0/x^82.0-576720.0*x^79.0+634452.0/x^85.0-641424.0*x^82.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "403848.0*-73.0/x^74.0-408960.0*70.0*x^69.0+455100.0*-76.0/x^77.0-460650.0*73.0*x^72.0+510510.0*-79.0/x^80.0-516516.0*76.0*x^75.0+570240.0*-82.0/x^83.0-576720.0*79.0*x^78.0+634452.0*-85.0/x^86.0-641424.0*82.0*x^81.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-2.9480904E7/x^74.0-2.86272E7*x^69.0-3.45876E7/x^77.0-3.362745E7*x^72.0-4.033029E7/x^80.0-3.9255216E7*x^75.0-4.675968E7/x^83.0-4.556088E7*x^78.0-5.392842E7/x^86.0-5.2596768E7*x^81.0";
 UsageCalculus.EqnSolArrayMap3[3] = "39.0*x^2.0+1.0/61.139240506329116/x^69.0-1.0/67.525*x^74.0+40.5*x^2.0+1.0/64.09756097560975/x^72.0-1.0/70.50602409638554*x^77.0+42.0*x^2.0+1.0/67.05882352941177/x^75.0-1.0/73.48837209302326*x^80.0+43.5*x^2.0+1.0/70.02272727272728/x^78.0-1.0/76.47191011235955*x^83.0+45.0*x^2.0+1.0/72.98901098901098/x^81.0-1.0/79.45652173913044*x^86.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "39.0/3.0*x^3.0+1.0/61.139240506329116/-68.0/x^68.0-1.0/67.525/75.0*x^75.0+40.5/3.0*x^3.0+1.0/64.09756097560975/-71.0/x^71.0-1.0/70.50602409638554/78.0*x^78.0+42.0/3.0*x^3.0+1.0/67.05882352941177/-74.0/x^74.0-1.0/73.48837209302326/81.0*x^81.0+43.5/3.0*x^3.0+1.0/70.02272727272728/-77.0/x^77.0-1.0/76.47191011235955/84.0*x^84.0+45.0/3.0*x^3.0+1.0/72.98901098901098/-80.0/x^80.0-1.0/79.45652173913044/87.0*x^87.0";
 UsageCalculus.EqnSolArrayMap4[3] = "13.0*x^3.0-1.0/4157.46835443038/x^68.0-1.0/5064.375*x^75.0+13.5*x^3.0-1.0/4550.926829268293/x^71.0-1.0/5499.469879518072*x^78.0+14.0*x^3.0-1.0/4962.352941176471/x^74.0-1.0/5952.558139534884*x^81.0+14.5*x^3.0-1.0/5391.750000000001/x^77.0-1.0/6423.640449438202*x^84.0+15.0*x^3.0-1.0/5839.120879120878/x^80.0-1.0/6912.717391304348*x^87.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-2.9480904E7/x^74.0-2.86272E7*x^69.0-3.45876E7/x^77.0-3.362745E7*x^72.0-4.033029E7/x^80.0-3.9255216E7*x^75.0-4.675968E7/x^83.0-4.556088E7*x^78.0-5.392842E7/x^86.0-5.2596768E7*x^81.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*-74.0/x^75.0-69.0*x^68.0-0.0*-77.0/x^78.0-72.0*x^71.0-0.0*-80.0/x^81.0-75.0*x^74.0-0.0*-83.0/x^84.0-78.0*x^77.0-0.0*-86.0/x^87.0-0.0*81.0*x^80.0";
 UsageCalculus.EqnSolArrayMap2[4] = "0.0/x^75.0-69.0*x^68.0+0.0/x^78.0-72.0*x^71.0+0.0/x^81.0-75.0*x^74.0+0.0/x^84.0-78.0*x^77.0+0.0/x^87.0-0.0*x^80.0";
 UsageCalculus.EqnSolArrayMap3[4] = "13.0*x^3.0-1.0/4157.46835443038/x^68.0-1.0/5064.375*x^75.0+13.5*x^3.0-1.0/4550.926829268293/x^71.0-1.0/5499.469879518072*x^78.0+14.0*x^3.0-1.0/4962.352941176471/x^74.0-1.0/5952.558139534884*x^81.0+14.5*x^3.0-1.0/5391.750000000001/x^77.0-1.0/6423.640449438202*x^84.0+15.0*x^3.0-1.0/5839.120879120878/x^80.0-1.0/6912.717391304348*x^87.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "13.0/4.0*x^4.0-1.0/4157.46835443038/-67.0/x^67.0-1.0/5064.375/76.0*x^76.0+13.5/4.0*x^4.0-1.0/4550.926829268293/-70.0/x^70.0-1.0/5499.469879518072/79.0*x^79.0+14.0/4.0*x^4.0-1.0/4962.352941176471/-73.0/x^73.0-1.0/5952.558139534884/82.0*x^82.0+14.5/4.0*x^4.0-1.0/5391.750000000001/-76.0/x^76.0-1.0/6423.640449438202/85.0*x^85.0+15.0/4.0*x^4.0-1.0/5839.120879120878/-79.0/x^79.0-1.0/6912.717391304348/88.0*x^88.0";
 UsageCalculus.EqnSolArrayMap4[4] = "3.25*x^4.0+1.0/278550.37974683545/x^67.0-1.0/384892.5*x^76.0+3.375*x^4.0+1.0/318564.8780487805/x^70.0-1.0/434458.1204819277*x^79.0+3.5*x^4.0+1.0/362251.7647058824/x^73.0-1.0/488109.76744186046*x^82.0+3.625*x^4.0+1.0/409773.00000000006/x^76.0-1.0/546009.4382022471*x^85.0+3.75*x^4.0+1.0/461290.54945054936/x^79.0-1.0/608319.1304347826*x^88.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120548() {
 UsageCalculus.TestCase = 120548;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+79/xyz^71-80*xyz^72+81+82/xyz^74-83*xyz^75+84+85/xyz^77-86*xyz^78+87*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-79+88/xyz^80-89*xyz^81+90*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-82+91/xyz^83-92*xyz^84+93*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-85+94/xyz^86";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "79.0/xyz^71.0-80.0*xyz^72.0+81.0+82.0/xyz^74.0-83.0*xyz^75.0+84.0+85.0/xyz^77.0-86.0*xyz^78.0+87.0+88.0/xyz^80.0-89.0*xyz^81.0+90.0+91.0/xyz^83.0-92.0*xyz^84.0+93.0+94.0/xyz^86.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "79.0*-71.0/xyz^72.0-80.0*72.0*xyz^71.0+81.0*0.0+82.0*-74.0/xyz^75.0-83.0*75.0*xyz^74.0+84.0*0.0+85.0*-77.0/xyz^78.0-86.0*78.0*xyz^77.0+87.0*0.0+88.0*-80.0/xyz^81.0-89.0*81.0*xyz^80.0+90.0*0.0+91.0*-83.0/xyz^84.0-92.0*84.0*xyz^83.0+93.0*0.0+94.0*-86.0/xyz^87.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-5609.0/xyz^72.0-5760.0*xyz^71.0-6068.0/xyz^75.0-6225.0*xyz^74.0-6545.0/xyz^78.0-6708.0*xyz^77.0-7040.0/xyz^81.0-7209.0*xyz^80.0-7553.0/xyz^84.0-7728.0*xyz^83.0-8084.0/xyz^87.0";
 UsageCalculus.EqnSolArrayMap3[1] = "79.0/xyz^71.0-80.0*xyz^72.0+81.0+82.0/xyz^74.0-83.0*xyz^75.0+84.0+85.0/xyz^77.0-86.0*xyz^78.0+87.0+88.0/xyz^80.0-89.0*xyz^81.0+90.0+91.0/xyz^83.0-92.0*xyz^84.0+93.0+94.0/xyz^86.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "79.0/-70.0/xyz^70.0-80.0/73.0*xyz^73.0+81.0*xyz+82.0/-73.0/xyz^73.0-83.0/76.0*xyz^76.0+84.0*xyz+85.0/-76.0/xyz^76.0-86.0/79.0*xyz^79.0+87.0*xyz+88.0/-79.0/xyz^79.0-89.0/82.0*xyz^82.0+90.0*xyz+91.0/-82.0/xyz^82.0-92.0/85.0*xyz^85.0+93.0*xyz+94.0/-85.0/xyz^85.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.1285714285714286/xyz^70.0-1.095890410958904*xyz^73.0+81.0*xyz-1.1232876712328768/xyz^73.0-1.0921052631578947*xyz^76.0+84.0*xyz-1.118421052631579/xyz^76.0-1.0886075949367089*xyz^79.0+87.0*xyz-1.1139240506329113/xyz^79.0-1.0853658536585367*xyz^82.0+90.0*xyz-1.1097560975609757/xyz^82.0-1.0823529411764705*xyz^85.0+93.0*xyz-1.1058823529411765/xyz^85.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-5609.0/xyz^72.0-5760.0*xyz^71.0-6068.0/xyz^75.0-6225.0*xyz^74.0-6545.0/xyz^78.0-6708.0*xyz^77.0-7040.0/xyz^81.0-7209.0*xyz^80.0-7553.0/xyz^84.0-7728.0*xyz^83.0-8084.0/xyz^87.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-5609.0*-72.0/xyz^73.0-5760.0*71.0*xyz^70.0-6068.0*-75.0/xyz^76.0-6225.0*74.0*xyz^73.0-6545.0*-78.0/xyz^79.0-6708.0*77.0*xyz^76.0-7040.0*-81.0/xyz^82.0-7209.0*80.0*xyz^79.0-7553.0*-84.0/xyz^85.0-7728.0*83.0*xyz^82.0-8084.0*-87.0/xyz^88.0";
 UsageCalculus.EqnSolArrayMap2[2] = "403848.0/xyz^73.0-408960.0*xyz^70.0+455100.0/xyz^76.0-460650.0*xyz^73.0+510510.0/xyz^79.0-516516.0*xyz^76.0+570240.0/xyz^82.0-576720.0*xyz^79.0+634452.0/xyz^85.0-641424.0*xyz^82.0+703308.0/xyz^88.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.1285714285714286/xyz^70.0-1.095890410958904*xyz^73.0+81.0*xyz-1.1232876712328768/xyz^73.0-1.0921052631578947*xyz^76.0+84.0*xyz-1.118421052631579/xyz^76.0-1.0886075949367089*xyz^79.0+87.0*xyz-1.1139240506329113/xyz^79.0-1.0853658536585367*xyz^82.0+90.0*xyz-1.1097560975609757/xyz^82.0-1.0823529411764705*xyz^85.0+93.0*xyz-1.1058823529411765/xyz^85.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.1285714285714286/-69.0/xyz^69.0-1.095890410958904/74.0*xyz^74.0+81.0/2.0*xyz^2.0-1.1232876712328768/-72.0/xyz^72.0-1.0921052631578947/77.0*xyz^77.0+84.0/2.0*xyz^2.0-1.118421052631579/-75.0/xyz^75.0-1.0886075949367089/80.0*xyz^80.0+87.0/2.0*xyz^2.0-1.1139240506329113/-78.0/xyz^78.0-1.0853658536585367/83.0*xyz^83.0+90.0/2.0*xyz^2.0-1.1097560975609757/-81.0/xyz^81.0-1.0823529411764705/86.0*xyz^86.0+93.0/2.0*xyz^2.0-1.1058823529411765/-84.0/xyz^84.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/61.139240506329116/xyz^69.0-1.0/67.525*xyz^74.0+40.5*xyz^2.0+1.0/64.09756097560975/xyz^72.0-1.0/70.50602409638554*xyz^77.0+42.0*xyz^2.0+1.0/67.05882352941177/xyz^75.0-1.0/73.48837209302326*xyz^80.0+43.5*xyz^2.0+1.0/70.02272727272728/xyz^78.0-1.0/76.47191011235955*xyz^83.0+45.0*xyz^2.0+1.0/72.98901098901098/xyz^81.0-1.0/79.45652173913044*xyz^86.0+46.5*xyz^2.0+1.0/75.95744680851064/xyz^84.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "403848.0/xyz^73.0-408960.0*xyz^70.0+455100.0/xyz^76.0-460650.0*xyz^73.0+510510.0/xyz^79.0-516516.0*xyz^76.0+570240.0/xyz^82.0-576720.0*xyz^79.0+634452.0/xyz^85.0-641424.0*xyz^82.0+703308.0/xyz^88.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "403848.0*-73.0/xyz^74.0-408960.0*70.0*xyz^69.0+455100.0*-76.0/xyz^77.0-460650.0*73.0*xyz^72.0+510510.0*-79.0/xyz^80.0-516516.0*76.0*xyz^75.0+570240.0*-82.0/xyz^83.0-576720.0*79.0*xyz^78.0+634452.0*-85.0/xyz^86.0-641424.0*82.0*xyz^81.0+703308.0*-88.0/xyz^89.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-2.9480904E7/xyz^74.0-2.86272E7*xyz^69.0-3.45876E7/xyz^77.0-3.362745E7*xyz^72.0-4.033029E7/xyz^80.0-3.9255216E7*xyz^75.0-4.675968E7/xyz^83.0-4.556088E7*xyz^78.0-5.392842E7/xyz^86.0-5.2596768E7*xyz^81.0-6.1891104E7/xyz^89.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/61.139240506329116/xyz^69.0-1.0/67.525*xyz^74.0+40.5*xyz^2.0+1.0/64.09756097560975/xyz^72.0-1.0/70.50602409638554*xyz^77.0+42.0*xyz^2.0+1.0/67.05882352941177/xyz^75.0-1.0/73.48837209302326*xyz^80.0+43.5*xyz^2.0+1.0/70.02272727272728/xyz^78.0-1.0/76.47191011235955*xyz^83.0+45.0*xyz^2.0+1.0/72.98901098901098/xyz^81.0-1.0/79.45652173913044*xyz^86.0+46.5*xyz^2.0+1.0/75.95744680851064/xyz^84.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/61.139240506329116/-68.0/xyz^68.0-1.0/67.525/75.0*xyz^75.0+40.5/3.0*xyz^3.0+1.0/64.09756097560975/-71.0/xyz^71.0-1.0/70.50602409638554/78.0*xyz^78.0+42.0/3.0*xyz^3.0+1.0/67.05882352941177/-74.0/xyz^74.0-1.0/73.48837209302326/81.0*xyz^81.0+43.5/3.0*xyz^3.0+1.0/70.02272727272728/-77.0/xyz^77.0-1.0/76.47191011235955/84.0*xyz^84.0+45.0/3.0*xyz^3.0+1.0/72.98901098901098/-80.0/xyz^80.0-1.0/79.45652173913044/87.0*xyz^87.0+46.5/3.0*xyz^3.0+1.0/75.95744680851064/-83.0/xyz^83.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/4157.46835443038/xyz^68.0-1.0/5064.375*xyz^75.0+13.5*xyz^3.0-1.0/4550.926829268293/xyz^71.0-1.0/5499.469879518072*xyz^78.0+14.0*xyz^3.0-1.0/4962.352941176471/xyz^74.0-1.0/5952.558139534884*xyz^81.0+14.5*xyz^3.0-1.0/5391.750000000001/xyz^77.0-1.0/6423.640449438202*xyz^84.0+15.0*xyz^3.0-1.0/5839.120879120878/xyz^80.0-1.0/6912.717391304348*xyz^87.0+15.5*xyz^3.0-1.0/6304.468085106383/xyz^83.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-2.9480904E7/xyz^74.0-2.86272E7*xyz^69.0-3.45876E7/xyz^77.0-3.362745E7*xyz^72.0-4.033029E7/xyz^80.0-3.9255216E7*xyz^75.0-4.675968E7/xyz^83.0-4.556088E7*xyz^78.0-5.392842E7/xyz^86.0-5.2596768E7*xyz^81.0-6.1891104E7/xyz^89.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*-74.0/xyz^75.0-69.0*xyz^68.0-0.0*-77.0/xyz^78.0-72.0*xyz^71.0-0.0*-80.0/xyz^81.0-75.0*xyz^74.0-0.0*-83.0/xyz^84.0-78.0*xyz^77.0-0.0*-86.0/xyz^87.0-81.0*xyz^80.0-0.0*-89.0/xyz^90.0";
 UsageCalculus.EqnSolArrayMap2[4] = "0.0/xyz^75.0-69.0*xyz^68.0+0.0/xyz^78.0-72.0*xyz^71.0+0.0/xyz^81.0-75.0*xyz^74.0+0.0/xyz^84.0-78.0*xyz^77.0+0.0/xyz^87.0-81.0*xyz^80.0+0.0/xyz^90.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/4157.46835443038/xyz^68.0-1.0/5064.375*xyz^75.0+13.5*xyz^3.0-1.0/4550.926829268293/xyz^71.0-1.0/5499.469879518072*xyz^78.0+14.0*xyz^3.0-1.0/4962.352941176471/xyz^74.0-1.0/5952.558139534884*xyz^81.0+14.5*xyz^3.0-1.0/5391.750000000001/xyz^77.0-1.0/6423.640449438202*xyz^84.0+15.0*xyz^3.0-1.0/5839.120879120878/xyz^80.0-1.0/6912.717391304348*xyz^87.0+15.5*xyz^3.0-1.0/6304.468085106383/xyz^83.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/4157.46835443038/-67.0/xyz^67.0-1.0/5064.375/76.0*xyz^76.0+13.5/4.0*xyz^4.0-1.0/4550.926829268293/-70.0/xyz^70.0-1.0/5499.469879518072/79.0*xyz^79.0+14.0/4.0*xyz^4.0-1.0/4962.352941176471/-73.0/xyz^73.0-1.0/5952.558139534884/82.0*xyz^82.0+14.5/4.0*xyz^4.0-1.0/5391.750000000001/-76.0/xyz^76.0-1.0/6423.640449438202/85.0*xyz^85.0+15.0/4.0*xyz^4.0-1.0/5839.120879120878/-79.0/xyz^79.0-1.0/6912.717391304348/88.0*xyz^88.0+15.5/4.0*xyz^4.0-1.0/6304.468085106383/-82.0/xyz^82.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/278550.37974683545/xyz^67.0-1.0/384892.5*xyz^76.0+3.375*xyz^4.0+1.0/318564.8780487805/xyz^70.0-1.0/434458.1204819277*xyz^79.0+3.5*xyz^4.0+1.0/362251.7647058824/xyz^73.0-1.0/488109.76744186046*xyz^82.0+3.625*xyz^4.0+1.0/409773.00000000006/xyz^76.0-1.0/546009.4382022471*xyz^85.0+3.75*xyz^4.0+1.0/461290.54945054936/xyz^79.0-1.0/608319.1304347826*xyz^88.0+3.875*xyz^4.0+1.0/516966.38297872344/xyz^82.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120549() {
 UsageCalculus.TestCase = 120549;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-80*x^72+81+82/x^74-83*x^75+84+85/x^77-86*x^78+87*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-79+88/x^80-89*x^81+90*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-82+91/x^83-92*x^84+93*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-85+94/x^86-95*x^87+96";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-80.0*x^72.0+81.0+82.0/x^74.0-83.0*x^75.0+84.0+85.0/x^77.0-86.0*x^78.0+87.0+88.0/x^80.0-89.0*x^81.0+90.0+91.0/x^83.0-92.0*x^84.0+93.0+94.0/x^86.0-95.0*x^87.0+96.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-80.0*72.0*x^71.0+81.0*0.0+82.0*-74.0/x^75.0-83.0*75.0*x^74.0+84.0*0.0+85.0*-77.0/x^78.0-86.0*78.0*x^77.0+87.0*0.0+88.0*-80.0/x^81.0-89.0*81.0*x^80.0+90.0*0.0+91.0*-83.0/x^84.0-92.0*84.0*x^83.0+93.0*0.0+94.0*-86.0/x^87.0-95.0*87.0*x^86.0+96.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-5760.0*x^71.0-6068.0/x^75.0-6225.0*x^74.0-6545.0/x^78.0-6708.0*x^77.0-7040.0/x^81.0-7209.0*x^80.0-7553.0/x^84.0-7728.0*x^83.0-8084.0/x^87.0-8265.0*x^86.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-80.0*x^72.0+81.0+82.0/x^74.0-83.0*x^75.0+84.0+85.0/x^77.0-86.0*x^78.0+87.0+88.0/x^80.0-89.0*x^81.0+90.0+91.0/x^83.0-92.0*x^84.0+93.0+94.0/x^86.0-95.0*x^87.0+96.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-80.0/73.0*x^73.0+81.0*x+82.0/-73.0/x^73.0-83.0/76.0*x^76.0+84.0*x+85.0/-76.0/x^76.0-86.0/79.0*x^79.0+87.0*x+88.0/-79.0/x^79.0-89.0/82.0*x^82.0+90.0*x+91.0/-82.0/x^82.0-92.0/85.0*x^85.0+93.0*x+94.0/-85.0/x^85.0-95.0/88.0*x^88.0+96.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.095890410958904*x^73.0+81.0*x-1.1232876712328768/x^73.0-1.0921052631578947*x^76.0+84.0*x-1.118421052631579/x^76.0-1.0886075949367089*x^79.0+87.0*x-1.1139240506329113/x^79.0-1.0853658536585367*x^82.0+90.0*x-1.1097560975609757/x^82.0-1.0823529411764705*x^85.0+93.0*x-1.1058823529411765/x^85.0-1.0795454545454546*x^88.0+96.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-5760.0*x^71.0-6068.0/x^75.0-6225.0*x^74.0-6545.0/x^78.0-6708.0*x^77.0-7040.0/x^81.0-7209.0*x^80.0-7553.0/x^84.0-7728.0*x^83.0-8084.0/x^87.0-8265.0*x^86.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-5760.0*71.0*x^70.0-6068.0*-75.0/x^76.0-6225.0*74.0*x^73.0-6545.0*-78.0/x^79.0-6708.0*77.0*x^76.0-7040.0*-81.0/x^82.0-7209.0*80.0*x^79.0-7553.0*-84.0/x^85.0-7728.0*83.0*x^82.0-8084.0*-87.0/x^88.0-8265.0*86.0*x^85.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-408960.0*x^70.0+455100.0/x^76.0-460650.0*x^73.0+510510.0/x^79.0-516516.0*x^76.0+570240.0/x^82.0-576720.0*x^79.0+634452.0/x^85.0-641424.0*x^82.0+703308.0/x^88.0-710790.0*x^85.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.095890410958904*x^73.0+81.0*x-1.1232876712328768/x^73.0-1.0921052631578947*x^76.0+84.0*x-1.118421052631579/x^76.0-1.0886075949367089*x^79.0+87.0*x-1.1139240506329113/x^79.0-1.0853658536585367*x^82.0+90.0*x-1.1097560975609757/x^82.0-1.0823529411764705*x^85.0+93.0*x-1.1058823529411765/x^85.0-1.0795454545454546*x^88.0+96.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.095890410958904/74.0*x^74.0+81.0/2.0*x^2.0-1.1232876712328768/-72.0/x^72.0-1.0921052631578947/77.0*x^77.0+84.0/2.0*x^2.0-1.118421052631579/-75.0/x^75.0-1.0886075949367089/80.0*x^80.0+87.0/2.0*x^2.0-1.1139240506329113/-78.0/x^78.0-1.0853658536585367/83.0*x^83.0+90.0/2.0*x^2.0-1.1097560975609757/-81.0/x^81.0-1.0823529411764705/86.0*x^86.0+93.0/2.0*x^2.0-1.1058823529411765/-84.0/x^84.0-1.0795454545454546/89.0*x^89.0+96.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/67.525*x^74.0+40.5*x^2.0+1.0/64.09756097560975/x^72.0-1.0/70.50602409638554*x^77.0+42.0*x^2.0+1.0/67.05882352941177/x^75.0-1.0/73.48837209302326*x^80.0+43.5*x^2.0+1.0/70.02272727272728/x^78.0-1.0/76.47191011235955*x^83.0+45.0*x^2.0+1.0/72.98901098901098/x^81.0-1.0/79.45652173913044*x^86.0+46.5*x^2.0+1.0/75.95744680851064/x^84.0-1.0/82.44210526315788*x^89.0+48.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-408960.0*x^70.0+455100.0/x^76.0-460650.0*x^73.0+510510.0/x^79.0-516516.0*x^76.0+570240.0/x^82.0-576720.0*x^79.0+634452.0/x^85.0-641424.0*x^82.0+703308.0/x^88.0-710790.0*x^85.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-408960.0*70.0*x^69.0+455100.0*-76.0/x^77.0-460650.0*73.0*x^72.0+510510.0*-79.0/x^80.0-516516.0*76.0*x^75.0+570240.0*-82.0/x^83.0-576720.0*79.0*x^78.0+634452.0*-85.0/x^86.0-641424.0*82.0*x^81.0+703308.0*-88.0/x^89.0-710790.0*85.0*x^84.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-2.86272E7*x^69.0-3.45876E7/x^77.0-3.362745E7*x^72.0-4.033029E7/x^80.0-3.9255216E7*x^75.0-4.675968E7/x^83.0-4.556088E7*x^78.0-5.392842E7/x^86.0-5.2596768E7*x^81.0-6.1891104E7/x^89.0-6.041715E7*x^84.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/67.525*x^74.0+40.5*x^2.0+1.0/64.09756097560975/x^72.0-1.0/70.50602409638554*x^77.0+42.0*x^2.0+1.0/67.05882352941177/x^75.0-1.0/73.48837209302326*x^80.0+43.5*x^2.0+1.0/70.02272727272728/x^78.0-1.0/76.47191011235955*x^83.0+45.0*x^2.0+1.0/72.98901098901098/x^81.0-1.0/79.45652173913044*x^86.0+46.5*x^2.0+1.0/75.95744680851064/x^84.0-1.0/82.44210526315788*x^89.0+48.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/67.525/75.0*x^75.0+40.5/3.0*x^3.0+1.0/64.09756097560975/-71.0/x^71.0-1.0/70.50602409638554/78.0*x^78.0+42.0/3.0*x^3.0+1.0/67.05882352941177/-74.0/x^74.0-1.0/73.48837209302326/81.0*x^81.0+43.5/3.0*x^3.0+1.0/70.02272727272728/-77.0/x^77.0-1.0/76.47191011235955/84.0*x^84.0+45.0/3.0*x^3.0+1.0/72.98901098901098/-80.0/x^80.0-1.0/79.45652173913044/87.0*x^87.0+46.5/3.0*x^3.0+1.0/75.95744680851064/-83.0/x^83.0-1.0/82.44210526315788/90.0*x^90.0+48.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/5064.375*x^75.0+13.5*x^3.0-1.0/4550.926829268293/x^71.0-1.0/5499.469879518072*x^78.0+14.0*x^3.0-1.0/4962.352941176471/x^74.0-1.0/5952.558139534884*x^81.0+14.5*x^3.0-1.0/5391.750000000001/x^77.0-1.0/6423.640449438202*x^84.0+15.0*x^3.0-1.0/5839.120879120878/x^80.0-1.0/6912.717391304348*x^87.0+15.5*x^3.0-1.0/6304.468085106383/x^83.0-1.0/7419.78947368421*x^90.0+16.0*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-2.86272E7*x^69.0-3.45876E7/x^77.0-3.362745E7*x^72.0-4.033029E7/x^80.0-3.9255216E7*x^75.0-4.675968E7/x^83.0-4.556088E7*x^78.0-5.392842E7/x^86.0-5.2596768E7*x^81.0-6.1891104E7/x^89.0-6.041715E7*x^84.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-69.0*x^68.0-0.0*-77.0/x^78.0-72.0*x^71.0-0.0*-80.0/x^81.0-75.0*x^74.0-0.0*-83.0/x^84.0-78.0*x^77.0-0.0*-86.0/x^87.0-81.0*x^80.0-0.0*-89.0/x^90.0-0.0*84.0*x^83.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-69.0*x^68.0+0.0/x^78.0-72.0*x^71.0+0.0/x^81.0-75.0*x^74.0+0.0/x^84.0-78.0*x^77.0+0.0/x^87.0-81.0*x^80.0+0.0/x^90.0-0.0*x^83.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/5064.375*x^75.0+13.5*x^3.0-1.0/4550.926829268293/x^71.0-1.0/5499.469879518072*x^78.0+14.0*x^3.0-1.0/4962.352941176471/x^74.0-1.0/5952.558139534884*x^81.0+14.5*x^3.0-1.0/5391.750000000001/x^77.0-1.0/6423.640449438202*x^84.0+15.0*x^3.0-1.0/5839.120879120878/x^80.0-1.0/6912.717391304348*x^87.0+15.5*x^3.0-1.0/6304.468085106383/x^83.0-1.0/7419.78947368421*x^90.0+16.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/5064.375/76.0*x^76.0+13.5/4.0*x^4.0-1.0/4550.926829268293/-70.0/x^70.0-1.0/5499.469879518072/79.0*x^79.0+14.0/4.0*x^4.0-1.0/4962.352941176471/-73.0/x^73.0-1.0/5952.558139534884/82.0*x^82.0+14.5/4.0*x^4.0-1.0/5391.750000000001/-76.0/x^76.0-1.0/6423.640449438202/85.0*x^85.0+15.0/4.0*x^4.0-1.0/5839.120879120878/-79.0/x^79.0-1.0/6912.717391304348/88.0*x^88.0+15.5/4.0*x^4.0-1.0/6304.468085106383/-82.0/x^82.0-1.0/7419.78947368421/91.0*x^91.0+16.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/384892.5*x^76.0+3.375*x^4.0+1.0/318564.8780487805/x^70.0-1.0/434458.1204819277*x^79.0+3.5*x^4.0+1.0/362251.7647058824/x^73.0-1.0/488109.76744186046*x^82.0+3.625*x^4.0+1.0/409773.00000000006/x^76.0-1.0/546009.4382022471*x^85.0+3.75*x^4.0+1.0/461290.54945054936/x^79.0-1.0/608319.1304347826*x^88.0+3.875*x^4.0+1.0/516966.38297872344/x^82.0-1.0/675200.8421052631*x^91.0+4.0*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120550() {
 UsageCalculus.TestCase = 120550;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+81+82-83+84+85-86+87*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-79+88-89+90*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-82+91-92+93*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-85+94-95+96+97-98";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "81.0+82.0-83.0+84.0+85.0-86.0+87.0+88.0-89.0+90.0+91.0-92.0+93.0+94.0-95.0+96.0+97.0-98.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+82.0*0.0-83.0*0.0+84.0*0.0+85.0*0.0-86.0*0.0+87.0*0.0+88.0*0.0-89.0*0.0+90.0*0.0+91.0*0.0-92.0*0.0+93.0*0.0+94.0*0.0-95.0*0.0+96.0*0.0+97.0*0.0-98.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "81.0+82.0-83.0+84.0+85.0-86.0+87.0+88.0-89.0+90.0+91.0-92.0+93.0+94.0-95.0+96.0+97.0-98.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "81.0*x+82.0*x-83.0*x+84.0*x+85.0*x-86.0*x+87.0*x+88.0*x-89.0*x+90.0*x+91.0*x-92.0*x+93.0*x+94.0*x-95.0*x+96.0*x+97.0*x-98.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "81.0*x+82.0*x-83.0*x+84.0*x+85.0*x-86.0*x+87.0*x+88.0*x-89.0*x+90.0*x+91.0*x-92.0*x+93.0*x+94.0*x-95.0*x+96.0*x+97.0*x-98.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "81.0*x+82.0*x-83.0*x+84.0*x+85.0*x-86.0*x+87.0*x+88.0*x-89.0*x+90.0*x+91.0*x-92.0*x+93.0*x+94.0*x-95.0*x+96.0*x+97.0*x-98.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "81.0/2.0*x^2.0+82.0/2.0*x^2.0-83.0/2.0*x^2.0+84.0/2.0*x^2.0+85.0/2.0*x^2.0-86.0/2.0*x^2.0+87.0/2.0*x^2.0+88.0/2.0*x^2.0-89.0/2.0*x^2.0+90.0/2.0*x^2.0+91.0/2.0*x^2.0-92.0/2.0*x^2.0+93.0/2.0*x^2.0+94.0/2.0*x^2.0-95.0/2.0*x^2.0+96.0/2.0*x^2.0+97.0/2.0*x^2.0-98.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "40.5*x^2.0+41.0*x^2.0-41.5*x^2.0+42.0*x^2.0+42.5*x^2.0-43.0*x^2.0+43.5*x^2.0+44.0*x^2.0-44.5*x^2.0+45.0*x^2.0+45.5*x^2.0-46.0*x^2.0+46.5*x^2.0+47.0*x^2.0-47.5*x^2.0+48.0*x^2.0+48.5*x^2.0-49.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "40.5*x^2.0+41.0*x^2.0-41.5*x^2.0+42.0*x^2.0+42.5*x^2.0-43.0*x^2.0+43.5*x^2.0+44.0*x^2.0-44.5*x^2.0+45.0*x^2.0+45.5*x^2.0-46.0*x^2.0+46.5*x^2.0+47.0*x^2.0-47.5*x^2.0+48.0*x^2.0+48.5*x^2.0-49.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "40.5/3.0*x^3.0+41.0/3.0*x^3.0-41.5/3.0*x^3.0+42.0/3.0*x^3.0+42.5/3.0*x^3.0-43.0/3.0*x^3.0+43.5/3.0*x^3.0+44.0/3.0*x^3.0-44.5/3.0*x^3.0+45.0/3.0*x^3.0+45.5/3.0*x^3.0-46.0/3.0*x^3.0+46.5/3.0*x^3.0+47.0/3.0*x^3.0-47.5/3.0*x^3.0+48.0/3.0*x^3.0+48.5/3.0*x^3.0-49.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "13.5*x^3.0+13.666666666666666*x^3.0-13.833333333333334*x^3.0+14.0*x^3.0+14.166666666666666*x^3.0-14.333333333333334*x^3.0+14.5*x^3.0+14.666666666666666*x^3.0-14.833333333333334*x^3.0+15.0*x^3.0+15.166666666666666*x^3.0-15.333333333333334*x^3.0+15.5*x^3.0+15.666666666666666*x^3.0-15.833333333333334*x^3.0+16.0*x^3.0+16.166666666666668*x^3.0-16.333333333333332*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "13.5*x^3.0+13.666666666666666*x^3.0-13.833333333333334*x^3.0+14.0*x^3.0+14.166666666666666*x^3.0-14.333333333333334*x^3.0+14.5*x^3.0+14.666666666666666*x^3.0-14.833333333333334*x^3.0+15.0*x^3.0+15.166666666666666*x^3.0-15.333333333333334*x^3.0+15.5*x^3.0+15.666666666666666*x^3.0-15.833333333333334*x^3.0+16.0*x^3.0+16.166666666666668*x^3.0-16.333333333333332*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "13.5/4.0*x^4.0+13.666666666666666/4.0*x^4.0-13.833333333333334/4.0*x^4.0+14.0/4.0*x^4.0+14.166666666666666/4.0*x^4.0-14.333333333333334/4.0*x^4.0+14.5/4.0*x^4.0+14.666666666666666/4.0*x^4.0-14.833333333333334/4.0*x^4.0+15.0/4.0*x^4.0+15.166666666666666/4.0*x^4.0-15.333333333333334/4.0*x^4.0+15.5/4.0*x^4.0+15.666666666666666/4.0*x^4.0-15.833333333333334/4.0*x^4.0+16.0/4.0*x^4.0+16.166666666666668/4.0*x^4.0-16.333333333333332/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "3.375*x^4.0+3.4166666666666665*x^4.0-3.4583333333333335*x^4.0+3.5*x^4.0+3.5416666666666665*x^4.0-3.5833333333333335*x^4.0+3.625*x^4.0+3.6666666666666665*x^4.0-3.7083333333333335*x^4.0+3.75*x^4.0+3.7916666666666665*x^4.0-3.8333333333333335*x^4.0+3.875*x^4.0+3.9166666666666665*x^4.0-3.9583333333333335*x^4.0+4.0*x^4.0+4.041666666666667*x^4.0-4.083333333333333*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120551() {
 UsageCalculus.TestCase = 120551;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+82/x^74-83*x^75+84+85/x^77-86*x^78+87*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-79+88/x^80-89*x^81+90*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-82+91/x^83-92*x^84+93*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-85+94/x^86-95*x^87+96+97/x^89-98*x^90+99+100/x^92";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "82.0/x^74.0-83.0*x^75.0+84.0+85.0/x^77.0-86.0*x^78.0+87.0+88.0/x^80.0-89.0*x^81.0+90.0+91.0/x^83.0-92.0*x^84.0+93.0+94.0/x^86.0-95.0*x^87.0+96.0+97.0/x^89.0-98.0*x^90.0+99.0+100.0/x^92.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "82.0*-74.0/x^75.0-83.0*75.0*x^74.0+84.0*0.0+85.0*-77.0/x^78.0-86.0*78.0*x^77.0+87.0*0.0+88.0*-80.0/x^81.0-89.0*81.0*x^80.0+90.0*0.0+91.0*-83.0/x^84.0-92.0*84.0*x^83.0+93.0*0.0+94.0*-86.0/x^87.0-95.0*87.0*x^86.0+96.0*0.0+97.0*-89.0/x^90.0-98.0*90.0*x^89.0+99.0*0.0+100.0*-92.0/x^93.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-6068.0/x^75.0-6225.0*x^74.0-6545.0/x^78.0-6708.0*x^77.0-7040.0/x^81.0-7209.0*x^80.0-7553.0/x^84.0-7728.0*x^83.0-8084.0/x^87.0-8265.0*x^86.0-8633.0/x^90.0-8820.0*x^89.0-9200.0/x^93.0";
 UsageCalculus.EqnSolArrayMap3[1] = "82.0/x^74.0-83.0*x^75.0+84.0+85.0/x^77.0-86.0*x^78.0+87.0+88.0/x^80.0-89.0*x^81.0+90.0+91.0/x^83.0-92.0*x^84.0+93.0+94.0/x^86.0-95.0*x^87.0+96.0+97.0/x^89.0-98.0*x^90.0+99.0+100.0/x^92.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "82.0/-73.0/x^73.0-83.0/76.0*x^76.0+84.0*x+85.0/-76.0/x^76.0-86.0/79.0*x^79.0+87.0*x+88.0/-79.0/x^79.0-89.0/82.0*x^82.0+90.0*x+91.0/-82.0/x^82.0-92.0/85.0*x^85.0+93.0*x+94.0/-85.0/x^85.0-95.0/88.0*x^88.0+96.0*x+97.0/-88.0/x^88.0-98.0/91.0*x^91.0+99.0*x+100.0/-91.0/x^91.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.1232876712328768/x^73.0-1.0921052631578947*x^76.0+84.0*x-1.118421052631579/x^76.0-1.0886075949367089*x^79.0+87.0*x-1.1139240506329113/x^79.0-1.0853658536585367*x^82.0+90.0*x-1.1097560975609757/x^82.0-1.0823529411764705*x^85.0+93.0*x-1.1058823529411765/x^85.0-1.0795454545454546*x^88.0+96.0*x-1.1022727272727273/x^88.0-1.0769230769230769*x^91.0+99.0*x-1.098901098901099/x^91.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-6068.0/x^75.0-6225.0*x^74.0-6545.0/x^78.0-6708.0*x^77.0-7040.0/x^81.0-7209.0*x^80.0-7553.0/x^84.0-7728.0*x^83.0-8084.0/x^87.0-8265.0*x^86.0-8633.0/x^90.0-8820.0*x^89.0-9200.0/x^93.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-6068.0*-75.0/x^76.0-6225.0*74.0*x^73.0-6545.0*-78.0/x^79.0-6708.0*77.0*x^76.0-7040.0*-81.0/x^82.0-7209.0*80.0*x^79.0-7553.0*-84.0/x^85.0-7728.0*83.0*x^82.0-8084.0*-87.0/x^88.0-8265.0*86.0*x^85.0-8633.0*-90.0/x^91.0-8820.0*89.0*x^88.0-9200.0*-93.0/x^94.0";
 UsageCalculus.EqnSolArrayMap2[2] = "455100.0/x^76.0-460650.0*x^73.0+510510.0/x^79.0-516516.0*x^76.0+570240.0/x^82.0-576720.0*x^79.0+634452.0/x^85.0-641424.0*x^82.0+703308.0/x^88.0-710790.0*x^85.0+776970.0/x^91.0-784980.0*x^88.0+855600.0/x^94.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.1232876712328768/x^73.0-1.0921052631578947*x^76.0+84.0*x-1.118421052631579/x^76.0-1.0886075949367089*x^79.0+87.0*x-1.1139240506329113/x^79.0-1.0853658536585367*x^82.0+90.0*x-1.1097560975609757/x^82.0-1.0823529411764705*x^85.0+93.0*x-1.1058823529411765/x^85.0-1.0795454545454546*x^88.0+96.0*x-1.1022727272727273/x^88.0-1.0769230769230769*x^91.0+99.0*x-1.098901098901099/x^91.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.1232876712328768/-72.0/x^72.0-1.0921052631578947/77.0*x^77.0+84.0/2.0*x^2.0-1.118421052631579/-75.0/x^75.0-1.0886075949367089/80.0*x^80.0+87.0/2.0*x^2.0-1.1139240506329113/-78.0/x^78.0-1.0853658536585367/83.0*x^83.0+90.0/2.0*x^2.0-1.1097560975609757/-81.0/x^81.0-1.0823529411764705/86.0*x^86.0+93.0/2.0*x^2.0-1.1058823529411765/-84.0/x^84.0-1.0795454545454546/89.0*x^89.0+96.0/2.0*x^2.0-1.1022727272727273/-87.0/x^87.0-1.0769230769230769/92.0*x^92.0+99.0/2.0*x^2.0-1.098901098901099/-90.0/x^90.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/64.09756097560975/x^72.0-1.0/70.50602409638554*x^77.0+42.0*x^2.0+1.0/67.05882352941177/x^75.0-1.0/73.48837209302326*x^80.0+43.5*x^2.0+1.0/70.02272727272728/x^78.0-1.0/76.47191011235955*x^83.0+45.0*x^2.0+1.0/72.98901098901098/x^81.0-1.0/79.45652173913044*x^86.0+46.5*x^2.0+1.0/75.95744680851064/x^84.0-1.0/82.44210526315788*x^89.0+48.0*x^2.0+1.0/78.9278350515464/x^87.0-1.0/85.42857142857143*x^92.0+49.5*x^2.0+1.0/81.89999999999999/x^90.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "455100.0/x^76.0-460650.0*x^73.0+510510.0/x^79.0-516516.0*x^76.0+570240.0/x^82.0-576720.0*x^79.0+634452.0/x^85.0-641424.0*x^82.0+703308.0/x^88.0-710790.0*x^85.0+776970.0/x^91.0-784980.0*x^88.0+855600.0/x^94.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "455100.0*-76.0/x^77.0-460650.0*73.0*x^72.0+510510.0*-79.0/x^80.0-516516.0*76.0*x^75.0+570240.0*-82.0/x^83.0-576720.0*79.0*x^78.0+634452.0*-85.0/x^86.0-641424.0*82.0*x^81.0+703308.0*-88.0/x^89.0-710790.0*85.0*x^84.0+776970.0*-91.0/x^92.0-784980.0*88.0*x^87.0+855600.0*-94.0/x^95.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-3.45876E7/x^77.0-3.362745E7*x^72.0-4.033029E7/x^80.0-3.9255216E7*x^75.0-4.675968E7/x^83.0-4.556088E7*x^78.0-5.392842E7/x^86.0-5.2596768E7*x^81.0-6.1891104E7/x^89.0-6.041715E7*x^84.0-7.070427E7/x^92.0-6.907824E7*x^87.0-8.04264E7/x^95.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/64.09756097560975/x^72.0-1.0/70.50602409638554*x^77.0+42.0*x^2.0+1.0/67.05882352941177/x^75.0-1.0/73.48837209302326*x^80.0+43.5*x^2.0+1.0/70.02272727272728/x^78.0-1.0/76.47191011235955*x^83.0+45.0*x^2.0+1.0/72.98901098901098/x^81.0-1.0/79.45652173913044*x^86.0+46.5*x^2.0+1.0/75.95744680851064/x^84.0-1.0/82.44210526315788*x^89.0+48.0*x^2.0+1.0/78.9278350515464/x^87.0-1.0/85.42857142857143*x^92.0+49.5*x^2.0+1.0/81.89999999999999/x^90.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/64.09756097560975/-71.0/x^71.0-1.0/70.50602409638554/78.0*x^78.0+42.0/3.0*x^3.0+1.0/67.05882352941177/-74.0/x^74.0-1.0/73.48837209302326/81.0*x^81.0+43.5/3.0*x^3.0+1.0/70.02272727272728/-77.0/x^77.0-1.0/76.47191011235955/84.0*x^84.0+45.0/3.0*x^3.0+1.0/72.98901098901098/-80.0/x^80.0-1.0/79.45652173913044/87.0*x^87.0+46.5/3.0*x^3.0+1.0/75.95744680851064/-83.0/x^83.0-1.0/82.44210526315788/90.0*x^90.0+48.0/3.0*x^3.0+1.0/78.9278350515464/-86.0/x^86.0-1.0/85.42857142857143/93.0*x^93.0+49.5/3.0*x^3.0+1.0/81.89999999999999/-89.0/x^89.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/4550.926829268293/x^71.0-1.0/5499.469879518072*x^78.0+14.0*x^3.0-1.0/4962.352941176471/x^74.0-1.0/5952.558139534884*x^81.0+14.5*x^3.0-1.0/5391.750000000001/x^77.0-1.0/6423.640449438202*x^84.0+15.0*x^3.0-1.0/5839.120879120878/x^80.0-1.0/6912.717391304348*x^87.0+15.5*x^3.0-1.0/6304.468085106383/x^83.0-1.0/7419.78947368421*x^90.0+16.0*x^3.0-1.0/6787.79381443299/x^86.0-1.0/7944.857142857143*x^93.0+16.5*x^3.0-1.0/7289.099999999999/x^89.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-3.45876E7/x^77.0-3.362745E7*x^72.0-4.033029E7/x^80.0-3.9255216E7*x^75.0-4.675968E7/x^83.0-4.556088E7*x^78.0-5.392842E7/x^86.0-5.2596768E7*x^81.0-6.1891104E7/x^89.0-6.041715E7*x^84.0-7.070427E7/x^92.0-6.907824E7*x^87.0-8.04264E7/x^95.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*-77.0/x^78.0-72.0*x^71.0-0.0*-80.0/x^81.0-75.0*x^74.0-0.0*-83.0/x^84.0-78.0*x^77.0-0.0*-86.0/x^87.0-81.0*x^80.0-0.0*-89.0/x^90.0-84.0*x^83.0-0.0*-92.0/x^93.0-87.0*x^86.0-0.0*-95.0/x^96.0";
 UsageCalculus.EqnSolArrayMap2[4] = "0.0/x^78.0-72.0*x^71.0+0.0/x^81.0-75.0*x^74.0+0.0/x^84.0-78.0*x^77.0+0.0/x^87.0-81.0*x^80.0+0.0/x^90.0-84.0*x^83.0+0.0/x^93.0-87.0*x^86.0+0.0/x^96.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/4550.926829268293/x^71.0-1.0/5499.469879518072*x^78.0+14.0*x^3.0-1.0/4962.352941176471/x^74.0-1.0/5952.558139534884*x^81.0+14.5*x^3.0-1.0/5391.750000000001/x^77.0-1.0/6423.640449438202*x^84.0+15.0*x^3.0-1.0/5839.120879120878/x^80.0-1.0/6912.717391304348*x^87.0+15.5*x^3.0-1.0/6304.468085106383/x^83.0-1.0/7419.78947368421*x^90.0+16.0*x^3.0-1.0/6787.79381443299/x^86.0-1.0/7944.857142857143*x^93.0+16.5*x^3.0-1.0/7289.099999999999/x^89.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/4550.926829268293/-70.0/x^70.0-1.0/5499.469879518072/79.0*x^79.0+14.0/4.0*x^4.0-1.0/4962.352941176471/-73.0/x^73.0-1.0/5952.558139534884/82.0*x^82.0+14.5/4.0*x^4.0-1.0/5391.750000000001/-76.0/x^76.0-1.0/6423.640449438202/85.0*x^85.0+15.0/4.0*x^4.0-1.0/5839.120879120878/-79.0/x^79.0-1.0/6912.717391304348/88.0*x^88.0+15.5/4.0*x^4.0-1.0/6304.468085106383/-82.0/x^82.0-1.0/7419.78947368421/91.0*x^91.0+16.0/4.0*x^4.0-1.0/6787.79381443299/-85.0/x^85.0-1.0/7944.857142857143/94.0*x^94.0+16.5/4.0*x^4.0-1.0/7289.099999999999/-88.0/x^88.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/318564.8780487805/x^70.0-1.0/434458.1204819277*x^79.0+3.5*x^4.0+1.0/362251.7647058824/x^73.0-1.0/488109.76744186046*x^82.0+3.625*x^4.0+1.0/409773.00000000006/x^76.0-1.0/546009.4382022471*x^85.0+3.75*x^4.0+1.0/461290.54945054936/x^79.0-1.0/608319.1304347826*x^88.0+3.875*x^4.0+1.0/516966.38297872344/x^82.0-1.0/675200.8421052631*x^91.0+4.0*x^4.0+1.0/576962.4742268041/x^85.0-1.0/746816.5714285715*x^94.0+4.125*x^4.0+1.0/641440.7999999999/x^88.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120552() {
 UsageCalculus.TestCase = 120552;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-83*xy^75+84+85/xy^77-86*xy^78+87*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-79+88/xy^80-89*xy^81+90*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-82+91/xy^83-92*xy^84+93*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-85+94/xy^86-95*xy^87+96+97/xy^89-98*xy^90+99+100/xy^92-1*xy^93+2*xy^-94";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-83.0*xy^75.0+84.0+85.0/xy^77.0-86.0*xy^78.0+87.0+88.0/xy^80.0-89.0*xy^81.0+90.0+91.0/xy^83.0-92.0*xy^84.0+93.0+94.0/xy^86.0-95.0*xy^87.0+96.0+97.0/xy^89.0-98.0*xy^90.0+99.0+100.0/xy^92.0-xy^93.0+2.0/xy^94.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-83.0*75.0*xy^74.0+84.0*0.0+85.0*-77.0/xy^78.0-86.0*78.0*xy^77.0+87.0*0.0+88.0*-80.0/xy^81.0-89.0*81.0*xy^80.0+90.0*0.0+91.0*-83.0/xy^84.0-92.0*84.0*xy^83.0+93.0*0.0+94.0*-86.0/xy^87.0-95.0*87.0*xy^86.0+96.0*0.0+97.0*-89.0/xy^90.0-98.0*90.0*xy^89.0+99.0*0.0+100.0*-92.0/xy^93.0-93.0*xy^92.0+2.0*-94.0/xy^95.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-6225.0*xy^74.0-6545.0/xy^78.0-6708.0*xy^77.0-7040.0/xy^81.0-7209.0*xy^80.0-7553.0/xy^84.0-7728.0*xy^83.0-8084.0/xy^87.0-8265.0*xy^86.0-8633.0/xy^90.0-8820.0*xy^89.0-9200.0/xy^93.0-93.0*xy^92.0-188.0/xy^95.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-83.0*xy^75.0+84.0+85.0/xy^77.0-86.0*xy^78.0+87.0+88.0/xy^80.0-89.0*xy^81.0+90.0+91.0/xy^83.0-92.0*xy^84.0+93.0+94.0/xy^86.0-95.0*xy^87.0+96.0+97.0/xy^89.0-98.0*xy^90.0+99.0+100.0/xy^92.0-xy^93.0+2.0/xy^94.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-83.0/76.0*xy^76.0+84.0*xy+85.0/-76.0/xy^76.0-86.0/79.0*xy^79.0+87.0*xy+88.0/-79.0/xy^79.0-89.0/82.0*xy^82.0+90.0*xy+91.0/-82.0/xy^82.0-92.0/85.0*xy^85.0+93.0*xy+94.0/-85.0/xy^85.0-95.0/88.0*xy^88.0+96.0*xy+97.0/-88.0/xy^88.0-98.0/91.0*xy^91.0+99.0*xy+100.0/-91.0/xy^91.0-1.0/94.0*xy^94.0+2.0/-93.0/xy^93.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0921052631578947*xy^76.0+84.0*xy-1.118421052631579/xy^76.0-1.0886075949367089*xy^79.0+87.0*xy-1.1139240506329113/xy^79.0-1.0853658536585367*xy^82.0+90.0*xy-1.1097560975609757/xy^82.0-1.0823529411764705*xy^85.0+93.0*xy-1.1058823529411765/xy^85.0-1.0795454545454546*xy^88.0+96.0*xy-1.1022727272727273/xy^88.0-1.0769230769230769*xy^91.0+99.0*xy-1.098901098901099/xy^91.0-1.0/94.0*xy^94.0-1.0/46.5/xy^93.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-6225.0*xy^74.0-6545.0/xy^78.0-6708.0*xy^77.0-7040.0/xy^81.0-7209.0*xy^80.0-7553.0/xy^84.0-7728.0*xy^83.0-8084.0/xy^87.0-8265.0*xy^86.0-8633.0/xy^90.0-8820.0*xy^89.0-9200.0/xy^93.0-93.0*xy^92.0-188.0/xy^95.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-6225.0*74.0*xy^73.0-6545.0*-78.0/xy^79.0-6708.0*77.0*xy^76.0-7040.0*-81.0/xy^82.0-7209.0*80.0*xy^79.0-7553.0*-84.0/xy^85.0-7728.0*83.0*xy^82.0-8084.0*-87.0/xy^88.0-8265.0*86.0*xy^85.0-8633.0*-90.0/xy^91.0-8820.0*89.0*xy^88.0-9200.0*-93.0/xy^94.0-93.0*92.0*xy^91.0-188.0*-95.0/xy^96.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-460650.0*xy^73.0+510510.0/xy^79.0-516516.0*xy^76.0+570240.0/xy^82.0-576720.0*xy^79.0+634452.0/xy^85.0-641424.0*xy^82.0+703308.0/xy^88.0-710790.0*xy^85.0+776970.0/xy^91.0-784980.0*xy^88.0+855600.0/xy^94.0-8556.0*xy^91.0+17860.0/xy^96.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0921052631578947*xy^76.0+84.0*xy-1.118421052631579/xy^76.0-1.0886075949367089*xy^79.0+87.0*xy-1.1139240506329113/xy^79.0-1.0853658536585367*xy^82.0+90.0*xy-1.1097560975609757/xy^82.0-1.0823529411764705*xy^85.0+93.0*xy-1.1058823529411765/xy^85.0-1.0795454545454546*xy^88.0+96.0*xy-1.1022727272727273/xy^88.0-1.0769230769230769*xy^91.0+99.0*xy-1.098901098901099/xy^91.0-1.0/94.0*xy^94.0-1.0/46.5/xy^93.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0921052631578947/77.0*xy^77.0+84.0/2.0*xy^2.0-1.118421052631579/-75.0/xy^75.0-1.0886075949367089/80.0*xy^80.0+87.0/2.0*xy^2.0-1.1139240506329113/-78.0/xy^78.0-1.0853658536585367/83.0*xy^83.0+90.0/2.0*xy^2.0-1.1097560975609757/-81.0/xy^81.0-1.0823529411764705/86.0*xy^86.0+93.0/2.0*xy^2.0-1.1058823529411765/-84.0/xy^84.0-1.0795454545454546/89.0*xy^89.0+96.0/2.0*xy^2.0-1.1022727272727273/-87.0/xy^87.0-1.0769230769230769/92.0*xy^92.0+99.0/2.0*xy^2.0-1.098901098901099/-90.0/xy^90.0-1.0/94.0/95.0*xy^95.0-1.0/46.5/-92.0/xy^92.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/70.50602409638554*xy^77.0+42.0*xy^2.0+1.0/67.05882352941177/xy^75.0-1.0/73.48837209302326*xy^80.0+43.5*xy^2.0+1.0/70.02272727272728/xy^78.0-1.0/76.47191011235955*xy^83.0+45.0*xy^2.0+1.0/72.98901098901098/xy^81.0-1.0/79.45652173913044*xy^86.0+46.5*xy^2.0+1.0/75.95744680851064/xy^84.0-1.0/82.44210526315788*xy^89.0+48.0*xy^2.0+1.0/78.9278350515464/xy^87.0-1.0/85.42857142857143*xy^92.0+49.5*xy^2.0+1.0/81.89999999999999/xy^90.0-1.0/8930.0*xy^95.0+1.0/4278.0/xy^92.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-460650.0*xy^73.0+510510.0/xy^79.0-516516.0*xy^76.0+570240.0/xy^82.0-576720.0*xy^79.0+634452.0/xy^85.0-641424.0*xy^82.0+703308.0/xy^88.0-710790.0*xy^85.0+776970.0/xy^91.0-784980.0*xy^88.0+855600.0/xy^94.0-8556.0*xy^91.0+17860.0/xy^96.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-460650.0*73.0*xy^72.0+510510.0*-79.0/xy^80.0-516516.0*76.0*xy^75.0+570240.0*-82.0/xy^83.0-576720.0*79.0*xy^78.0+634452.0*-85.0/xy^86.0-641424.0*82.0*xy^81.0+703308.0*-88.0/xy^89.0-710790.0*85.0*xy^84.0+776970.0*-91.0/xy^92.0-784980.0*88.0*xy^87.0+855600.0*-94.0/xy^95.0-8556.0*91.0*xy^90.0+17860.0*-96.0/xy^97.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-3.362745E7*xy^72.0-4.033029E7/xy^80.0-3.9255216E7*xy^75.0-4.675968E7/xy^83.0-4.556088E7*xy^78.0-5.392842E7/xy^86.0-5.2596768E7*xy^81.0-6.1891104E7/xy^89.0-6.041715E7*xy^84.0-7.070427E7/xy^92.0-6.907824E7*xy^87.0-8.04264E7/xy^95.0-778596.0*xy^90.0-1714560.0/xy^97.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/70.50602409638554*xy^77.0+42.0*xy^2.0+1.0/67.05882352941177/xy^75.0-1.0/73.48837209302326*xy^80.0+43.5*xy^2.0+1.0/70.02272727272728/xy^78.0-1.0/76.47191011235955*xy^83.0+45.0*xy^2.0+1.0/72.98901098901098/xy^81.0-1.0/79.45652173913044*xy^86.0+46.5*xy^2.0+1.0/75.95744680851064/xy^84.0-1.0/82.44210526315788*xy^89.0+48.0*xy^2.0+1.0/78.9278350515464/xy^87.0-1.0/85.42857142857143*xy^92.0+49.5*xy^2.0+1.0/81.89999999999999/xy^90.0-1.0/8930.0*xy^95.0+1.0/4278.0/xy^92.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/70.50602409638554/78.0*xy^78.0+42.0/3.0*xy^3.0+1.0/67.05882352941177/-74.0/xy^74.0-1.0/73.48837209302326/81.0*xy^81.0+43.5/3.0*xy^3.0+1.0/70.02272727272728/-77.0/xy^77.0-1.0/76.47191011235955/84.0*xy^84.0+45.0/3.0*xy^3.0+1.0/72.98901098901098/-80.0/xy^80.0-1.0/79.45652173913044/87.0*xy^87.0+46.5/3.0*xy^3.0+1.0/75.95744680851064/-83.0/xy^83.0-1.0/82.44210526315788/90.0*xy^90.0+48.0/3.0*xy^3.0+1.0/78.9278350515464/-86.0/xy^86.0-1.0/85.42857142857143/93.0*xy^93.0+49.5/3.0*xy^3.0+1.0/81.89999999999999/-89.0/xy^89.0-1.0/8930.0/96.0*xy^96.0+1.0/4278.0/-91.0/xy^91.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/5499.469879518072*xy^78.0+14.0*xy^3.0-1.0/4962.352941176471/xy^74.0-1.0/5952.558139534884*xy^81.0+14.5*xy^3.0-1.0/5391.750000000001/xy^77.0-1.0/6423.640449438202*xy^84.0+15.0*xy^3.0-1.0/5839.120879120878/xy^80.0-1.0/6912.717391304348*xy^87.0+15.5*xy^3.0-1.0/6304.468085106383/xy^83.0-1.0/7419.78947368421*xy^90.0+16.0*xy^3.0-1.0/6787.79381443299/xy^86.0-1.0/7944.857142857143*xy^93.0+16.5*xy^3.0-1.0/7289.099999999999/xy^89.0-1.0/857280.0*xy^96.0-1.0/389298.0/xy^91.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-3.362745E7*xy^72.0-4.033029E7/xy^80.0-3.9255216E7*xy^75.0-4.675968E7/xy^83.0-4.556088E7*xy^78.0-5.392842E7/xy^86.0-5.2596768E7*xy^81.0-6.1891104E7/xy^89.0-6.041715E7*xy^84.0-7.070427E7/xy^92.0-6.907824E7*xy^87.0-8.04264E7/xy^95.0-778596.0*xy^90.0-1714560.0/xy^97.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-72.0*xy^71.0-0.0*-80.0/xy^81.0-75.0*xy^74.0-0.0*-83.0/xy^84.0-78.0*xy^77.0-0.0*-86.0/xy^87.0-81.0*xy^80.0-0.0*-89.0/xy^90.0-84.0*xy^83.0-0.0*-92.0/xy^93.0-87.0*xy^86.0-0.0*-95.0/xy^96.0-778596.0*90.0*xy^89.0-1714560.0*-97.0/xy^98.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-72.0*xy^71.0+0.0/xy^81.0-75.0*xy^74.0+0.0/xy^84.0-78.0*xy^77.0+0.0/xy^87.0-81.0*xy^80.0+0.0/xy^90.0-84.0*xy^83.0+0.0/xy^93.0-87.0*xy^86.0+0.0/xy^96.0-7.007364E7*xy^89.0+1.6631232E8/xy^98.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/5499.469879518072*xy^78.0+14.0*xy^3.0-1.0/4962.352941176471/xy^74.0-1.0/5952.558139534884*xy^81.0+14.5*xy^3.0-1.0/5391.750000000001/xy^77.0-1.0/6423.640449438202*xy^84.0+15.0*xy^3.0-1.0/5839.120879120878/xy^80.0-1.0/6912.717391304348*xy^87.0+15.5*xy^3.0-1.0/6304.468085106383/xy^83.0-1.0/7419.78947368421*xy^90.0+16.0*xy^3.0-1.0/6787.79381443299/xy^86.0-1.0/7944.857142857143*xy^93.0+16.5*xy^3.0-1.0/7289.099999999999/xy^89.0-1.0/857280.0*xy^96.0-1.0/389298.0/xy^91.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/5499.469879518072/79.0*xy^79.0+14.0/4.0*xy^4.0-1.0/4962.352941176471/-73.0/xy^73.0-1.0/5952.558139534884/82.0*xy^82.0+14.5/4.0*xy^4.0-1.0/5391.750000000001/-76.0/xy^76.0-1.0/6423.640449438202/85.0*xy^85.0+15.0/4.0*xy^4.0-1.0/5839.120879120878/-79.0/xy^79.0-1.0/6912.717391304348/88.0*xy^88.0+15.5/4.0*xy^4.0-1.0/6304.468085106383/-82.0/xy^82.0-1.0/7419.78947368421/91.0*xy^91.0+16.0/4.0*xy^4.0-1.0/6787.79381443299/-85.0/xy^85.0-1.0/7944.857142857143/94.0*xy^94.0+16.5/4.0*xy^4.0-1.0/7289.099999999999/-88.0/xy^88.0-1.0/857280.0/97.0*xy^97.0-1.0/389298.0/-90.0/xy^90.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/434458.1204819277*xy^79.0+3.5*xy^4.0+1.0/362251.7647058824/xy^73.0-1.0/488109.76744186046*xy^82.0+3.625*xy^4.0+1.0/409773.00000000006/xy^76.0-1.0/546009.4382022471*xy^85.0+3.75*xy^4.0+1.0/461290.54945054936/xy^79.0-1.0/608319.1304347826*xy^88.0+3.875*xy^4.0+1.0/516966.38297872344/xy^82.0-1.0/675200.8421052631*xy^91.0+4.0*xy^4.0+1.0/576962.4742268041/xy^85.0-1.0/746816.5714285715*xy^94.0+4.125*xy^4.0+1.0/641440.7999999999/xy^88.0-1.0/8.315616E7*xy^97.0+1.0/3.503682E7/xy^90.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120553() {
 UsageCalculus.TestCase = 120553;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+85/xyzxy^77-86*xyzxy^78";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyzxy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "85.0/xyzxy^77.0-86.0*xyzxy^78.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "85.0*-77.0/xyzxy^78.0-86.0*78.0*xyzxy^77.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-6545.0/xyzxy^78.0-6708.0*xyzxy^77.0";
 UsageCalculus.EqnSolArrayMap3[1] = "85.0/xyzxy^77.0-86.0*xyzxy^78.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "85.0/-76.0/xyzxy^76.0-86.0/79.0*xyzxy^79.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.118421052631579/xyzxy^76.0-1.0886075949367089*xyzxy^79.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-6545.0/xyzxy^78.0-6708.0*xyzxy^77.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-6545.0*-78.0/xyzxy^79.0-6708.0*77.0*xyzxy^76.0";
 UsageCalculus.EqnSolArrayMap2[2] = "510510.0/xyzxy^79.0-516516.0*xyzxy^76.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.118421052631579/xyzxy^76.0-1.0886075949367089*xyzxy^79.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.118421052631579/-75.0/xyzxy^75.0-1.0886075949367089/80.0*xyzxy^80.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/67.05882352941177/xyzxy^75.0-1.0/73.48837209302326*xyzxy^80.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "510510.0/xyzxy^79.0-516516.0*xyzxy^76.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "510510.0*-79.0/xyzxy^80.0-516516.0*76.0*xyzxy^75.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-4.033029E7/xyzxy^80.0-3.9255216E7*xyzxy^75.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/67.05882352941177/xyzxy^75.0-1.0/73.48837209302326*xyzxy^80.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/67.05882352941177/-74.0/xyzxy^74.0-1.0/73.48837209302326/81.0*xyzxy^81.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/4962.352941176471/xyzxy^74.0-1.0/5952.558139534884*xyzxy^81.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-4.033029E7/xyzxy^80.0-3.9255216E7*xyzxy^75.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*-80.0/xyzxy^81.0-0.0*75.0*xyzxy^74.0";
 UsageCalculus.EqnSolArrayMap2[4] = "0.0/xyzxy^81.0-0.0*xyzxy^74.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/4962.352941176471/xyzxy^74.0-1.0/5952.558139534884*xyzxy^81.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/4962.352941176471/-73.0/xyzxy^73.0-1.0/5952.558139534884/82.0*xyzxy^82.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/362251.7647058824/xyzxy^73.0-1.0/488109.76744186046*xyzxy^82.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120554() {
 UsageCalculus.TestCase = 120554;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-86*x^78+87*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-79+88/x^80";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-86.0*x^78.0+87.0+88.0/x^80.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-86.0*78.0*x^77.0+87.0*0.0+88.0*-80.0/x^81.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-6708.0*x^77.0-7040.0/x^81.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-86.0*x^78.0+87.0+88.0/x^80.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-86.0/79.0*x^79.0+87.0*x+88.0/-79.0/x^79.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0886075949367089*x^79.0+87.0*x-1.1139240506329113/x^79.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-6708.0*x^77.0-7040.0/x^81.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-6708.0*77.0*x^76.0-7040.0*-81.0/x^82.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-516516.0*x^76.0+570240.0/x^82.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0886075949367089*x^79.0+87.0*x-1.1139240506329113/x^79.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0886075949367089/80.0*x^80.0+87.0/2.0*x^2.0-1.1139240506329113/-78.0/x^78.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/73.48837209302326*x^80.0+43.5*x^2.0+1.0/70.02272727272728/x^78.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-516516.0*x^76.0+570240.0/x^82.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-516516.0*76.0*x^75.0+570240.0*-82.0/x^83.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-3.9255216E7*x^75.0-4.675968E7/x^83.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/73.48837209302326*x^80.0+43.5*x^2.0+1.0/70.02272727272728/x^78.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/73.48837209302326/81.0*x^81.0+43.5/3.0*x^3.0+1.0/70.02272727272728/-77.0/x^77.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/5952.558139534884*x^81.0+14.5*x^3.0-1.0/5391.750000000001/x^77.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-3.9255216E7*x^75.0-4.675968E7/x^83.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-75.0*x^74.0-0.0*-83.0/x^84.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-75.0*x^74.0+0.0/x^84.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/5952.558139534884*x^81.0+14.5*x^3.0-1.0/5391.750000000001/x^77.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/5952.558139534884/82.0*x^82.0+14.5/4.0*x^4.0-1.0/5391.750000000001/-76.0/x^76.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/488109.76744186046*x^82.0+3.625*x^4.0+1.0/409773.00000000006/x^76.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120555() {
 UsageCalculus.TestCase = 120555;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+87*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-79+88/x^80-89*x^81+90*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-82";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "87.0+88.0/x^80.0-89.0*x^81.0+90.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+88.0*-80.0/x^81.0-89.0*81.0*x^80.0+90.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-7040.0/x^81.0-7209.0*x^80.0";
 UsageCalculus.EqnSolArrayMap3[1] = "87.0+88.0/x^80.0-89.0*x^81.0+90.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "87.0*x+88.0/-79.0/x^79.0-89.0/82.0*x^82.0+90.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "87.0*x-1.1139240506329113/x^79.0-1.0853658536585367*x^82.0+90.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-7040.0/x^81.0-7209.0*x^80.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-7040.0*-81.0/x^82.0-7209.0*80.0*x^79.0";
 UsageCalculus.EqnSolArrayMap2[2] = "570240.0/x^82.0-576720.0*x^79.0";
 UsageCalculus.EqnSolArrayMap3[2] = "87.0*x-1.1139240506329113/x^79.0-1.0853658536585367*x^82.0+90.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "87.0/2.0*x^2.0-1.1139240506329113/-78.0/x^78.0-1.0853658536585367/83.0*x^83.0+90.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "43.5*x^2.0+1.0/70.02272727272728/x^78.0-1.0/76.47191011235955*x^83.0+45.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "570240.0/x^82.0-576720.0*x^79.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "570240.0*-82.0/x^83.0-576720.0*79.0*x^78.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-4.675968E7/x^83.0-4.556088E7*x^78.0";
 UsageCalculus.EqnSolArrayMap3[3] = "43.5*x^2.0+1.0/70.02272727272728/x^78.0-1.0/76.47191011235955*x^83.0+45.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "43.5/3.0*x^3.0+1.0/70.02272727272728/-77.0/x^77.0-1.0/76.47191011235955/84.0*x^84.0+45.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "14.5*x^3.0-1.0/5391.750000000001/x^77.0-1.0/6423.640449438202*x^84.0+15.0*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-4.675968E7/x^83.0-4.556088E7*x^78.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*-83.0/x^84.0-0.0*78.0*x^77.0";
 UsageCalculus.EqnSolArrayMap2[4] = "0.0/x^84.0-0.0*x^77.0";
 UsageCalculus.EqnSolArrayMap3[4] = "14.5*x^3.0-1.0/5391.750000000001/x^77.0-1.0/6423.640449438202*x^84.0+15.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "14.5/4.0*x^4.0-1.0/5391.750000000001/-76.0/x^76.0-1.0/6423.640449438202/85.0*x^85.0+15.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "3.625*x^4.0+1.0/409773.00000000006/x^76.0-1.0/546009.4382022471*x^85.0+3.75*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120556() {
 UsageCalculus.TestCase = 120556;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+88/xy^80-89*xy^81+90*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-82+91/xy^83-92*xy^84";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "88.0/xy^80.0-89.0*xy^81.0+90.0+91.0/xy^83.0-92.0*xy^84.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "88.0*-80.0/xy^81.0-89.0*81.0*xy^80.0+90.0*0.0+91.0*-83.0/xy^84.0-92.0*84.0*xy^83.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-7040.0/xy^81.0-7209.0*xy^80.0-7553.0/xy^84.0-7728.0*xy^83.0";
 UsageCalculus.EqnSolArrayMap3[1] = "88.0/xy^80.0-89.0*xy^81.0+90.0+91.0/xy^83.0-92.0*xy^84.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "88.0/-79.0/xy^79.0-89.0/82.0*xy^82.0+90.0*xy+91.0/-82.0/xy^82.0-92.0/85.0*xy^85.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.1139240506329113/xy^79.0-1.0853658536585367*xy^82.0+90.0*xy-1.1097560975609757/xy^82.0-1.0823529411764705*xy^85.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-7040.0/xy^81.0-7209.0*xy^80.0-7553.0/xy^84.0-7728.0*xy^83.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-7040.0*-81.0/xy^82.0-7209.0*80.0*xy^79.0-7553.0*-84.0/xy^85.0-7728.0*83.0*xy^82.0";
 UsageCalculus.EqnSolArrayMap2[2] = "570240.0/xy^82.0-576720.0*xy^79.0+634452.0/xy^85.0-641424.0*xy^82.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.1139240506329113/xy^79.0-1.0853658536585367*xy^82.0+90.0*xy-1.1097560975609757/xy^82.0-1.0823529411764705*xy^85.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.1139240506329113/-78.0/xy^78.0-1.0853658536585367/83.0*xy^83.0+90.0/2.0*xy^2.0-1.1097560975609757/-81.0/xy^81.0-1.0823529411764705/86.0*xy^86.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/70.02272727272728/xy^78.0-1.0/76.47191011235955*xy^83.0+45.0*xy^2.0+1.0/72.98901098901098/xy^81.0-1.0/79.45652173913044*xy^86.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "570240.0/xy^82.0-576720.0*xy^79.0+634452.0/xy^85.0-641424.0*xy^82.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "570240.0*-82.0/xy^83.0-576720.0*79.0*xy^78.0+634452.0*-85.0/xy^86.0-641424.0*82.0*xy^81.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-4.675968E7/xy^83.0-4.556088E7*xy^78.0-5.392842E7/xy^86.0-5.2596768E7*xy^81.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/70.02272727272728/xy^78.0-1.0/76.47191011235955*xy^83.0+45.0*xy^2.0+1.0/72.98901098901098/xy^81.0-1.0/79.45652173913044*xy^86.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/70.02272727272728/-77.0/xy^77.0-1.0/76.47191011235955/84.0*xy^84.0+45.0/3.0*xy^3.0+1.0/72.98901098901098/-80.0/xy^80.0-1.0/79.45652173913044/87.0*xy^87.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/5391.750000000001/xy^77.0-1.0/6423.640449438202*xy^84.0+15.0*xy^3.0-1.0/5839.120879120878/xy^80.0-1.0/6912.717391304348*xy^87.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-4.675968E7/xy^83.0-4.556088E7*xy^78.0-5.392842E7/xy^86.0-5.2596768E7*xy^81.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*-83.0/xy^84.0-78.0*xy^77.0-0.0*-86.0/xy^87.0-0.0*81.0*xy^80.0";
 UsageCalculus.EqnSolArrayMap2[4] = "0.0/xy^84.0-78.0*xy^77.0+0.0/xy^87.0-0.0*xy^80.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/5391.750000000001/xy^77.0-1.0/6423.640449438202*xy^84.0+15.0*xy^3.0-1.0/5839.120879120878/xy^80.0-1.0/6912.717391304348*xy^87.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/5391.750000000001/-76.0/xy^76.0-1.0/6423.640449438202/85.0*xy^85.0+15.0/4.0*xy^4.0-1.0/5839.120879120878/-79.0/xy^79.0-1.0/6912.717391304348/88.0*xy^88.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/409773.00000000006/xy^76.0-1.0/546009.4382022471*xy^85.0+3.75*xy^4.0+1.0/461290.54945054936/xy^79.0-1.0/608319.1304347826*xy^88.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120557() {
 UsageCalculus.TestCase = 120557;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-89*x^81+90*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-82+91/x^83-92*x^84+93*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-85+94/x^86";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-89.0*x^81.0+90.0+91.0/x^83.0-92.0*x^84.0+93.0+94.0/x^86.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-89.0*81.0*x^80.0+90.0*0.0+91.0*-83.0/x^84.0-92.0*84.0*x^83.0+93.0*0.0+94.0*-86.0/x^87.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-7209.0*x^80.0-7553.0/x^84.0-7728.0*x^83.0-8084.0/x^87.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-89.0*x^81.0+90.0+91.0/x^83.0-92.0*x^84.0+93.0+94.0/x^86.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-89.0/82.0*x^82.0+90.0*x+91.0/-82.0/x^82.0-92.0/85.0*x^85.0+93.0*x+94.0/-85.0/x^85.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0853658536585367*x^82.0+90.0*x-1.1097560975609757/x^82.0-1.0823529411764705*x^85.0+93.0*x-1.1058823529411765/x^85.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-7209.0*x^80.0-7553.0/x^84.0-7728.0*x^83.0-8084.0/x^87.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-7209.0*80.0*x^79.0-7553.0*-84.0/x^85.0-7728.0*83.0*x^82.0-8084.0*-87.0/x^88.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-576720.0*x^79.0+634452.0/x^85.0-641424.0*x^82.0+703308.0/x^88.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0853658536585367*x^82.0+90.0*x-1.1097560975609757/x^82.0-1.0823529411764705*x^85.0+93.0*x-1.1058823529411765/x^85.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0853658536585367/83.0*x^83.0+90.0/2.0*x^2.0-1.1097560975609757/-81.0/x^81.0-1.0823529411764705/86.0*x^86.0+93.0/2.0*x^2.0-1.1058823529411765/-84.0/x^84.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/76.47191011235955*x^83.0+45.0*x^2.0+1.0/72.98901098901098/x^81.0-1.0/79.45652173913044*x^86.0+46.5*x^2.0+1.0/75.95744680851064/x^84.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-576720.0*x^79.0+634452.0/x^85.0-641424.0*x^82.0+703308.0/x^88.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-576720.0*79.0*x^78.0+634452.0*-85.0/x^86.0-641424.0*82.0*x^81.0+703308.0*-88.0/x^89.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-4.556088E7*x^78.0-5.392842E7/x^86.0-5.2596768E7*x^81.0-6.1891104E7/x^89.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/76.47191011235955*x^83.0+45.0*x^2.0+1.0/72.98901098901098/x^81.0-1.0/79.45652173913044*x^86.0+46.5*x^2.0+1.0/75.95744680851064/x^84.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/76.47191011235955/84.0*x^84.0+45.0/3.0*x^3.0+1.0/72.98901098901098/-80.0/x^80.0-1.0/79.45652173913044/87.0*x^87.0+46.5/3.0*x^3.0+1.0/75.95744680851064/-83.0/x^83.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/6423.640449438202*x^84.0+15.0*x^3.0-1.0/5839.120879120878/x^80.0-1.0/6912.717391304348*x^87.0+15.5*x^3.0-1.0/6304.468085106383/x^83.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-4.556088E7*x^78.0-5.392842E7/x^86.0-5.2596768E7*x^81.0-6.1891104E7/x^89.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-78.0*x^77.0-0.0*-86.0/x^87.0-81.0*x^80.0-0.0*-89.0/x^90.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-78.0*x^77.0+0.0/x^87.0-81.0*x^80.0+0.0/x^90.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/6423.640449438202*x^84.0+15.0*x^3.0-1.0/5839.120879120878/x^80.0-1.0/6912.717391304348*x^87.0+15.5*x^3.0-1.0/6304.468085106383/x^83.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/6423.640449438202/85.0*x^85.0+15.0/4.0*x^4.0-1.0/5839.120879120878/-79.0/x^79.0-1.0/6912.717391304348/88.0*x^88.0+15.5/4.0*x^4.0-1.0/6304.468085106383/-82.0/x^82.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/546009.4382022471*x^85.0+3.75*x^4.0+1.0/461290.54945054936/x^79.0-1.0/608319.1304347826*x^88.0+3.875*x^4.0+1.0/516966.38297872344/x^82.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120558() {
 UsageCalculus.TestCase = 120558;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+90*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-82+91/xyzxy^83-92*xyzxy^84+93*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-85+94/xyzxy^86-95*xyzxy^87+96";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyzxy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "90.0+91.0/xyzxy^83.0-92.0*xyzxy^84.0+93.0+94.0/xyzxy^86.0-95.0*xyzxy^87.0+96.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+91.0*-83.0/xyzxy^84.0-92.0*84.0*xyzxy^83.0+93.0*0.0+94.0*-86.0/xyzxy^87.0-95.0*87.0*xyzxy^86.0+96.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-7553.0/xyzxy^84.0-7728.0*xyzxy^83.0-8084.0/xyzxy^87.0-8265.0*xyzxy^86.0";
 UsageCalculus.EqnSolArrayMap3[1] = "90.0+91.0/xyzxy^83.0-92.0*xyzxy^84.0+93.0+94.0/xyzxy^86.0-95.0*xyzxy^87.0+96.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "90.0*xyzxy+91.0/-82.0/xyzxy^82.0-92.0/85.0*xyzxy^85.0+93.0*xyzxy+94.0/-85.0/xyzxy^85.0-95.0/88.0*xyzxy^88.0+96.0*xyzxy";
 UsageCalculus.EqnSolArrayMap4[1] = "90.0*xyzxy-1.1097560975609757/xyzxy^82.0-1.0823529411764705*xyzxy^85.0+93.0*xyzxy-1.1058823529411765/xyzxy^85.0-1.0795454545454546*xyzxy^88.0+96.0*xyzxy";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-7553.0/xyzxy^84.0-7728.0*xyzxy^83.0-8084.0/xyzxy^87.0-8265.0*xyzxy^86.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-7553.0*-84.0/xyzxy^85.0-7728.0*83.0*xyzxy^82.0-8084.0*-87.0/xyzxy^88.0-8265.0*86.0*xyzxy^85.0";
 UsageCalculus.EqnSolArrayMap2[2] = "634452.0/xyzxy^85.0-641424.0*xyzxy^82.0+703308.0/xyzxy^88.0-710790.0*xyzxy^85.0";
 UsageCalculus.EqnSolArrayMap3[2] = "90.0*xyzxy-1.1097560975609757/xyzxy^82.0-1.0823529411764705*xyzxy^85.0+93.0*xyzxy-1.1058823529411765/xyzxy^85.0-1.0795454545454546*xyzxy^88.0+96.0*xyzxy";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "90.0/2.0*xyzxy^2.0-1.1097560975609757/-81.0/xyzxy^81.0-1.0823529411764705/86.0*xyzxy^86.0+93.0/2.0*xyzxy^2.0-1.1058823529411765/-84.0/xyzxy^84.0-1.0795454545454546/89.0*xyzxy^89.0+96.0/2.0*xyzxy^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "45.0*xyzxy^2.0+1.0/72.98901098901098/xyzxy^81.0-1.0/79.45652173913044*xyzxy^86.0+46.5*xyzxy^2.0+1.0/75.95744680851064/xyzxy^84.0-1.0/82.44210526315788*xyzxy^89.0+48.0*xyzxy^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "634452.0/xyzxy^85.0-641424.0*xyzxy^82.0+703308.0/xyzxy^88.0-710790.0*xyzxy^85.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "634452.0*-85.0/xyzxy^86.0-641424.0*82.0*xyzxy^81.0+703308.0*-88.0/xyzxy^89.0-710790.0*85.0*xyzxy^84.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-5.392842E7/xyzxy^86.0-5.2596768E7*xyzxy^81.0-6.1891104E7/xyzxy^89.0-6.041715E7*xyzxy^84.0";
 UsageCalculus.EqnSolArrayMap3[3] = "45.0*xyzxy^2.0+1.0/72.98901098901098/xyzxy^81.0-1.0/79.45652173913044*xyzxy^86.0+46.5*xyzxy^2.0+1.0/75.95744680851064/xyzxy^84.0-1.0/82.44210526315788*xyzxy^89.0+48.0*xyzxy^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "45.0/3.0*xyzxy^3.0+1.0/72.98901098901098/-80.0/xyzxy^80.0-1.0/79.45652173913044/87.0*xyzxy^87.0+46.5/3.0*xyzxy^3.0+1.0/75.95744680851064/-83.0/xyzxy^83.0-1.0/82.44210526315788/90.0*xyzxy^90.0+48.0/3.0*xyzxy^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "15.0*xyzxy^3.0-1.0/5839.120879120878/xyzxy^80.0-1.0/6912.717391304348*xyzxy^87.0+15.5*xyzxy^3.0-1.0/6304.468085106383/xyzxy^83.0-1.0/7419.78947368421*xyzxy^90.0+16.0*xyzxy^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-5.392842E7/xyzxy^86.0-5.2596768E7*xyzxy^81.0-6.1891104E7/xyzxy^89.0-6.041715E7*xyzxy^84.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*-86.0/xyzxy^87.0-81.0*xyzxy^80.0-0.0*-89.0/xyzxy^90.0-0.0*84.0*xyzxy^83.0";
 UsageCalculus.EqnSolArrayMap2[4] = "0.0/xyzxy^87.0-81.0*xyzxy^80.0+0.0/xyzxy^90.0-0.0*xyzxy^83.0";
 UsageCalculus.EqnSolArrayMap3[4] = "15.0*xyzxy^3.0-1.0/5839.120879120878/xyzxy^80.0-1.0/6912.717391304348*xyzxy^87.0+15.5*xyzxy^3.0-1.0/6304.468085106383/xyzxy^83.0-1.0/7419.78947368421*xyzxy^90.0+16.0*xyzxy^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "15.0/4.0*xyzxy^4.0-1.0/5839.120879120878/-79.0/xyzxy^79.0-1.0/6912.717391304348/88.0*xyzxy^88.0+15.5/4.0*xyzxy^4.0-1.0/6304.468085106383/-82.0/xyzxy^82.0-1.0/7419.78947368421/91.0*xyzxy^91.0+16.0/4.0*xyzxy^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "3.75*xyzxy^4.0+1.0/461290.54945054936/xyzxy^79.0-1.0/608319.1304347826*xyzxy^88.0+3.875*xyzxy^4.0+1.0/516966.38297872344/xyzxy^82.0-1.0/675200.8421052631*xyzxy^91.0+4.0*xyzxy^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120559() {
 UsageCalculus.TestCase = 120559;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+91/x^83-92*x^84+93*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-85+94/x^86-95*x^87+96+97/x^89-98*x^90";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "91.0/x^83.0-92.0*x^84.0+93.0+94.0/x^86.0-95.0*x^87.0+96.0+97.0/x^89.0-98.0*x^90.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "91.0*-83.0/x^84.0-92.0*84.0*x^83.0+93.0*0.0+94.0*-86.0/x^87.0-95.0*87.0*x^86.0+96.0*0.0+97.0*-89.0/x^90.0-98.0*90.0*x^89.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-7553.0/x^84.0-7728.0*x^83.0-8084.0/x^87.0-8265.0*x^86.0-8633.0/x^90.0-8820.0*x^89.0";
 UsageCalculus.EqnSolArrayMap3[1] = "91.0/x^83.0-92.0*x^84.0+93.0+94.0/x^86.0-95.0*x^87.0+96.0+97.0/x^89.0-98.0*x^90.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "91.0/-82.0/x^82.0-92.0/85.0*x^85.0+93.0*x+94.0/-85.0/x^85.0-95.0/88.0*x^88.0+96.0*x+97.0/-88.0/x^88.0-98.0/91.0*x^91.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.1097560975609757/x^82.0-1.0823529411764705*x^85.0+93.0*x-1.1058823529411765/x^85.0-1.0795454545454546*x^88.0+96.0*x-1.1022727272727273/x^88.0-1.0769230769230769*x^91.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-7553.0/x^84.0-7728.0*x^83.0-8084.0/x^87.0-8265.0*x^86.0-8633.0/x^90.0-8820.0*x^89.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-7553.0*-84.0/x^85.0-7728.0*83.0*x^82.0-8084.0*-87.0/x^88.0-8265.0*86.0*x^85.0-8633.0*-90.0/x^91.0-8820.0*89.0*x^88.0";
 UsageCalculus.EqnSolArrayMap2[2] = "634452.0/x^85.0-641424.0*x^82.0+703308.0/x^88.0-710790.0*x^85.0+776970.0/x^91.0-784980.0*x^88.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.1097560975609757/x^82.0-1.0823529411764705*x^85.0+93.0*x-1.1058823529411765/x^85.0-1.0795454545454546*x^88.0+96.0*x-1.1022727272727273/x^88.0-1.0769230769230769*x^91.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.1097560975609757/-81.0/x^81.0-1.0823529411764705/86.0*x^86.0+93.0/2.0*x^2.0-1.1058823529411765/-84.0/x^84.0-1.0795454545454546/89.0*x^89.0+96.0/2.0*x^2.0-1.1022727272727273/-87.0/x^87.0-1.0769230769230769/92.0*x^92.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/72.98901098901098/x^81.0-1.0/79.45652173913044*x^86.0+46.5*x^2.0+1.0/75.95744680851064/x^84.0-1.0/82.44210526315788*x^89.0+48.0*x^2.0+1.0/78.9278350515464/x^87.0-1.0/85.42857142857143*x^92.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "634452.0/x^85.0-641424.0*x^82.0+703308.0/x^88.0-710790.0*x^85.0+776970.0/x^91.0-784980.0*x^88.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "634452.0*-85.0/x^86.0-641424.0*82.0*x^81.0+703308.0*-88.0/x^89.0-710790.0*85.0*x^84.0+776970.0*-91.0/x^92.0-784980.0*88.0*x^87.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-5.392842E7/x^86.0-5.2596768E7*x^81.0-6.1891104E7/x^89.0-6.041715E7*x^84.0-7.070427E7/x^92.0-6.907824E7*x^87.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/72.98901098901098/x^81.0-1.0/79.45652173913044*x^86.0+46.5*x^2.0+1.0/75.95744680851064/x^84.0-1.0/82.44210526315788*x^89.0+48.0*x^2.0+1.0/78.9278350515464/x^87.0-1.0/85.42857142857143*x^92.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/72.98901098901098/-80.0/x^80.0-1.0/79.45652173913044/87.0*x^87.0+46.5/3.0*x^3.0+1.0/75.95744680851064/-83.0/x^83.0-1.0/82.44210526315788/90.0*x^90.0+48.0/3.0*x^3.0+1.0/78.9278350515464/-86.0/x^86.0-1.0/85.42857142857143/93.0*x^93.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/5839.120879120878/x^80.0-1.0/6912.717391304348*x^87.0+15.5*x^3.0-1.0/6304.468085106383/x^83.0-1.0/7419.78947368421*x^90.0+16.0*x^3.0-1.0/6787.79381443299/x^86.0-1.0/7944.857142857143*x^93.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-5.392842E7/x^86.0-5.2596768E7*x^81.0-6.1891104E7/x^89.0-6.041715E7*x^84.0-7.070427E7/x^92.0-6.907824E7*x^87.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*-86.0/x^87.0-81.0*x^80.0-0.0*-89.0/x^90.0-84.0*x^83.0-0.0*-92.0/x^93.0-0.0*87.0*x^86.0";
 UsageCalculus.EqnSolArrayMap2[4] = "0.0/x^87.0-81.0*x^80.0+0.0/x^90.0-84.0*x^83.0+0.0/x^93.0-0.0*x^86.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/5839.120879120878/x^80.0-1.0/6912.717391304348*x^87.0+15.5*x^3.0-1.0/6304.468085106383/x^83.0-1.0/7419.78947368421*x^90.0+16.0*x^3.0-1.0/6787.79381443299/x^86.0-1.0/7944.857142857143*x^93.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/5839.120879120878/-79.0/x^79.0-1.0/6912.717391304348/88.0*x^88.0+15.5/4.0*x^4.0-1.0/6304.468085106383/-82.0/x^82.0-1.0/7419.78947368421/91.0*x^91.0+16.0/4.0*x^4.0-1.0/6787.79381443299/-85.0/x^85.0-1.0/7944.857142857143/94.0*x^94.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/461290.54945054936/x^79.0-1.0/608319.1304347826*x^88.0+3.875*x^4.0+1.0/516966.38297872344/x^82.0-1.0/675200.8421052631*x^91.0+4.0*x^4.0+1.0/576962.4742268041/x^85.0-1.0/746816.5714285715*x^94.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120560() {
 UsageCalculus.TestCase = 120560;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-92*x^84+93*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-85+94/x^86-95*x^87+96+97/x^89-98*x^90+99+100/x^92";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-92.0*x^84.0+93.0+94.0/x^86.0-95.0*x^87.0+96.0+97.0/x^89.0-98.0*x^90.0+99.0+100.0/x^92.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-92.0*84.0*x^83.0+93.0*0.0+94.0*-86.0/x^87.0-95.0*87.0*x^86.0+96.0*0.0+97.0*-89.0/x^90.0-98.0*90.0*x^89.0+99.0*0.0+100.0*-92.0/x^93.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-7728.0*x^83.0-8084.0/x^87.0-8265.0*x^86.0-8633.0/x^90.0-8820.0*x^89.0-9200.0/x^93.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-92.0*x^84.0+93.0+94.0/x^86.0-95.0*x^87.0+96.0+97.0/x^89.0-98.0*x^90.0+99.0+100.0/x^92.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-92.0/85.0*x^85.0+93.0*x+94.0/-85.0/x^85.0-95.0/88.0*x^88.0+96.0*x+97.0/-88.0/x^88.0-98.0/91.0*x^91.0+99.0*x+100.0/-91.0/x^91.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0823529411764705*x^85.0+93.0*x-1.1058823529411765/x^85.0-1.0795454545454546*x^88.0+96.0*x-1.1022727272727273/x^88.0-1.0769230769230769*x^91.0+99.0*x-1.098901098901099/x^91.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-7728.0*x^83.0-8084.0/x^87.0-8265.0*x^86.0-8633.0/x^90.0-8820.0*x^89.0-9200.0/x^93.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-7728.0*83.0*x^82.0-8084.0*-87.0/x^88.0-8265.0*86.0*x^85.0-8633.0*-90.0/x^91.0-8820.0*89.0*x^88.0-9200.0*-93.0/x^94.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-641424.0*x^82.0+703308.0/x^88.0-710790.0*x^85.0+776970.0/x^91.0-784980.0*x^88.0+855600.0/x^94.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0823529411764705*x^85.0+93.0*x-1.1058823529411765/x^85.0-1.0795454545454546*x^88.0+96.0*x-1.1022727272727273/x^88.0-1.0769230769230769*x^91.0+99.0*x-1.098901098901099/x^91.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0823529411764705/86.0*x^86.0+93.0/2.0*x^2.0-1.1058823529411765/-84.0/x^84.0-1.0795454545454546/89.0*x^89.0+96.0/2.0*x^2.0-1.1022727272727273/-87.0/x^87.0-1.0769230769230769/92.0*x^92.0+99.0/2.0*x^2.0-1.098901098901099/-90.0/x^90.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/79.45652173913044*x^86.0+46.5*x^2.0+1.0/75.95744680851064/x^84.0-1.0/82.44210526315788*x^89.0+48.0*x^2.0+1.0/78.9278350515464/x^87.0-1.0/85.42857142857143*x^92.0+49.5*x^2.0+1.0/81.89999999999999/x^90.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-641424.0*x^82.0+703308.0/x^88.0-710790.0*x^85.0+776970.0/x^91.0-784980.0*x^88.0+855600.0/x^94.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-641424.0*82.0*x^81.0+703308.0*-88.0/x^89.0-710790.0*85.0*x^84.0+776970.0*-91.0/x^92.0-784980.0*88.0*x^87.0+855600.0*-94.0/x^95.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-5.2596768E7*x^81.0-6.1891104E7/x^89.0-6.041715E7*x^84.0-7.070427E7/x^92.0-6.907824E7*x^87.0-8.04264E7/x^95.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/79.45652173913044*x^86.0+46.5*x^2.0+1.0/75.95744680851064/x^84.0-1.0/82.44210526315788*x^89.0+48.0*x^2.0+1.0/78.9278350515464/x^87.0-1.0/85.42857142857143*x^92.0+49.5*x^2.0+1.0/81.89999999999999/x^90.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/79.45652173913044/87.0*x^87.0+46.5/3.0*x^3.0+1.0/75.95744680851064/-83.0/x^83.0-1.0/82.44210526315788/90.0*x^90.0+48.0/3.0*x^3.0+1.0/78.9278350515464/-86.0/x^86.0-1.0/85.42857142857143/93.0*x^93.0+49.5/3.0*x^3.0+1.0/81.89999999999999/-89.0/x^89.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/6912.717391304348*x^87.0+15.5*x^3.0-1.0/6304.468085106383/x^83.0-1.0/7419.78947368421*x^90.0+16.0*x^3.0-1.0/6787.79381443299/x^86.0-1.0/7944.857142857143*x^93.0+16.5*x^3.0-1.0/7289.099999999999/x^89.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-5.2596768E7*x^81.0-6.1891104E7/x^89.0-6.041715E7*x^84.0-7.070427E7/x^92.0-6.907824E7*x^87.0-8.04264E7/x^95.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-81.0*x^80.0-0.0*-89.0/x^90.0-84.0*x^83.0-0.0*-92.0/x^93.0-87.0*x^86.0-0.0*-95.0/x^96.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-81.0*x^80.0+0.0/x^90.0-84.0*x^83.0+0.0/x^93.0-87.0*x^86.0+0.0/x^96.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/6912.717391304348*x^87.0+15.5*x^3.0-1.0/6304.468085106383/x^83.0-1.0/7419.78947368421*x^90.0+16.0*x^3.0-1.0/6787.79381443299/x^86.0-1.0/7944.857142857143*x^93.0+16.5*x^3.0-1.0/7289.099999999999/x^89.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/6912.717391304348/88.0*x^88.0+15.5/4.0*x^4.0-1.0/6304.468085106383/-82.0/x^82.0-1.0/7419.78947368421/91.0*x^91.0+16.0/4.0*x^4.0-1.0/6787.79381443299/-85.0/x^85.0-1.0/7944.857142857143/94.0*x^94.0+16.5/4.0*x^4.0-1.0/7289.099999999999/-88.0/x^88.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/608319.1304347826*x^88.0+3.875*x^4.0+1.0/516966.38297872344/x^82.0-1.0/675200.8421052631*x^91.0+4.0*x^4.0+1.0/576962.4742268041/x^85.0-1.0/746816.5714285715*x^94.0+4.125*x^4.0+1.0/641440.7999999999/x^88.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120561() {
 UsageCalculus.TestCase = 120561;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+93*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-85+94/x^86-95*x^87+96+97/x^89-98*x^90+99+100/x^92-1*x^93+2*xy^-94";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "93.0+94.0/x^86.0-95.0*x^87.0+96.0+97.0/x^89.0-98.0*x^90.0+99.0+100.0/x^92.0-x^93.0+2.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+94.0*-86.0/x^87.0-95.0*87.0*x^86.0+96.0*0.0+97.0*-89.0/x^90.0-98.0*90.0*x^89.0+99.0*0.0+100.0*-92.0/x^93.0-93.0*x^92.0+2.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-8084.0/x^87.0-8265.0*x^86.0-8633.0/x^90.0-8820.0*x^89.0-9200.0/x^93.0-93.0*x^92.0";
 UsageCalculus.EqnSolArrayMap3[1] = "93.0+94.0/x^86.0-95.0*x^87.0+96.0+97.0/x^89.0-98.0*x^90.0+99.0+100.0/x^92.0-x^93.0+2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "93.0*x+94.0/-85.0/x^85.0-95.0/88.0*x^88.0+96.0*x+97.0/-88.0/x^88.0-98.0/91.0*x^91.0+99.0*x+100.0/-91.0/x^91.0-1.0/94.0*x^94.0+2.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "93.0*x-1.1058823529411765/x^85.0-1.0795454545454546*x^88.0+96.0*x-1.1022727272727273/x^88.0-1.0769230769230769*x^91.0+99.0*x-1.098901098901099/x^91.0-1.0/94.0*x^94.0+2.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-8084.0/x^87.0-8265.0*x^86.0-8633.0/x^90.0-8820.0*x^89.0-9200.0/x^93.0-93.0*x^92.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-8084.0*-87.0/x^88.0-8265.0*86.0*x^85.0-8633.0*-90.0/x^91.0-8820.0*89.0*x^88.0-9200.0*-93.0/x^94.0-93.0*92.0*x^91.0";
 UsageCalculus.EqnSolArrayMap2[2] = "703308.0/x^88.0-710790.0*x^85.0+776970.0/x^91.0-784980.0*x^88.0+855600.0/x^94.0-8556.0*x^91.0";
 UsageCalculus.EqnSolArrayMap3[2] = "93.0*x-1.1058823529411765/x^85.0-1.0795454545454546*x^88.0+96.0*x-1.1022727272727273/x^88.0-1.0769230769230769*x^91.0+99.0*x-1.098901098901099/x^91.0-1.0/94.0*x^94.0+2.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "93.0/2.0*x^2.0-1.1058823529411765/-84.0/x^84.0-1.0795454545454546/89.0*x^89.0+96.0/2.0*x^2.0-1.1022727272727273/-87.0/x^87.0-1.0769230769230769/92.0*x^92.0+99.0/2.0*x^2.0-1.098901098901099/-90.0/x^90.0-1.0/94.0/95.0*x^95.0+x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "46.5*x^2.0+1.0/75.95744680851064/x^84.0-1.0/82.44210526315788*x^89.0+48.0*x^2.0+1.0/78.9278350515464/x^87.0-1.0/85.42857142857143*x^92.0+49.5*x^2.0+1.0/81.89999999999999/x^90.0-1.1198208286674133E-4*x^95.0+x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "703308.0/x^88.0-710790.0*x^85.0+776970.0/x^91.0-784980.0*x^88.0+855600.0/x^94.0-8556.0*x^91.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "703308.0*-88.0/x^89.0-710790.0*85.0*x^84.0+776970.0*-91.0/x^92.0-784980.0*88.0*x^87.0+855600.0*-94.0/x^95.0-8556.0*91.0*x^90.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-6.1891104E7/x^89.0-6.041715E7*x^84.0-7.070427E7/x^92.0-6.907824E7*x^87.0-8.04264E7/x^95.0-778596.0*x^90.0";
 UsageCalculus.EqnSolArrayMap3[3] = "46.5*x^2.0+1.0/75.95744680851064/x^84.0-1.0/82.44210526315788*x^89.0+48.0*x^2.0+1.0/78.9278350515464/x^87.0-1.0/85.42857142857143*x^92.0+49.5*x^2.0+1.0/81.89999999999999/x^90.0-1.1198208286674133E-4*x^95.0-4.0*x^95.0+x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "46.5/3.0*x^3.0+1.0/75.95744680851064/-83.0/x^83.0-1.0/82.44210526315788/90.0*x^90.0+48.0/3.0*x^3.0+1.0/78.9278350515464/-86.0/x^86.0-1.0/85.42857142857143/93.0*x^93.0+49.5/3.0*x^3.0+1.0/81.89999999999999/-89.0/x^89.0-1.1198208286674133E-4/96.0*x^96.0-4.0/96.0*x^96.0+1.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "15.5*x^3.0-1.0/6304.468085106383/x^83.0-1.0/7419.78947368421*x^90.0+16.0*x^3.0-1.0/6787.79381443299/x^86.0-1.0/7944.857142857143*x^93.0+16.5*x^3.0-1.0/7289.099999999999/x^89.0-1.0/857280.0*x^96.0-1.0/24.0*x^96.0-1.0/24.0*x^96.0+1.0/3.0*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-6.1891104E7/x^89.0-6.041715E7*x^84.0-7.070427E7/x^92.0-6.907824E7*x^87.0-8.04264E7/x^95.0-778596.0*x^90.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*-89.0/x^90.0-84.0*x^83.0-0.0*-92.0/x^93.0-87.0*x^86.0-0.0*-95.0/x^96.0-778596.0*90.0*x^89.0";
 UsageCalculus.EqnSolArrayMap2[4] = "0.0/x^90.0-84.0*x^83.0+0.0/x^93.0-87.0*x^86.0+0.0/x^96.0-7.007364E7*x^89.0";
 UsageCalculus.EqnSolArrayMap3[4] = "15.5*x^3.0-1.0/6304.468085106383/x^83.0-1.0/7419.78947368421*x^90.0+16.0*x^3.0-1.0/6787.79381443299/x^86.0-1.0/7944.857142857143*x^93.0+16.5*x^3.0-1.0/7289.099999999999/x^89.0-1.0/857280.0*x^96.0-1.0/24.0*x^96.0-1.0/24.0*x^96.0+1.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "15.5/4.0*x^4.0-1.0/6304.468085106383/-82.0/x^82.0-1.0/7419.78947368421/91.0*x^91.0+16.0/4.0*x^4.0-1.0/6787.79381443299/-85.0/x^85.0-1.0/7944.857142857143/94.0*x^94.0+16.5/4.0*x^4.0-1.0/7289.099999999999/-88.0/x^88.0-1.0/857280.0/97.0*x^97.0-1.0/24.0/97.0*x^97.0-1.0/24.0/97.0*x^97.0+1.0/3.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "3.875*x^4.0+1.0/516966.38297872344/x^82.0-1.0/675200.8421052631*x^91.0+4.0*x^4.0+1.0/576962.4742268041/x^85.0-1.0/746816.5714285715*x^94.0+4.125*x^4.0+1.0/641440.7999999999/x^88.0-1.0/8.315616E7*x^97.0-1.0/2328.0*x^97.0-1.0/2328.0*x^97.0+1.0/12.0*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120562() {
 UsageCalculus.TestCase = 120562;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+94/xyz^86-95*xyz^87+96+97/xyz^89-98*xyz^90+99+100/xyz^92-1*xyz^93+2*xy^-94+3/xyz^95-4*xyz^96";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "94.0/xyz^86.0-95.0*xyz^87.0+96.0+97.0/xyz^89.0-98.0*xyz^90.0+99.0+100.0/xyz^92.0-xyz^93.0+xy^-94.0*2.0+3.0/xyz^95.0-4.0*xyz^96.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "94.0*-86.0/xyz^87.0-95.0*87.0*xyz^86.0+96.0*0.0+97.0*-89.0/xyz^90.0-98.0*90.0*xyz^89.0+99.0*0.0+100.0*-92.0/xyz^93.0-93.0*xyz^92.0+xy^-94.0*2.0*0.0+3.0*-95.0/xyz^96.0-4.0*96.0*xyz^95.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-8084.0/xyz^87.0-8265.0*xyz^86.0-8633.0/xyz^90.0-8820.0*xyz^89.0-9200.0/xyz^93.0-93.0*xyz^92.0+xy^-94.0*0.0-285.0/xyz^96.0-384.0*xyz^95.0";
 UsageCalculus.EqnSolArrayMap3[1] = "94.0/xyz^86.0-95.0*xyz^87.0+96.0+97.0/xyz^89.0-98.0*xyz^90.0+99.0+100.0/xyz^92.0-xyz^93.0+xy^-94.0*2.0+3.0/xyz^95.0-4.0*xyz^96.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "94.0/-85.0/xyz^85.0-95.0/88.0*xyz^88.0+96.0*xyz+97.0/-88.0/xyz^88.0-98.0/91.0*xyz^91.0+99.0*xyz+100.0/-91.0/xyz^91.0-1.0/94.0*xyz^94.0+xy^-94.0*2.0*xyz+3.0/-94.0/xyz^94.0-4.0/97.0*xyz^97.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.1058823529411765/xyz^85.0-1.0795454545454546*xyz^88.0+96.0*xyz-1.1022727272727273/xyz^88.0-1.0769230769230769*xyz^91.0+99.0*xyz-1.098901098901099/xyz^91.0-0.010638297872340425*xyz^94.0+xy^-94.0*2.0*xyz-1.0/31.333333333333332/xyz^94.0-1.0/24.25*xyz^97.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-8084.0/xyz^87.0-8265.0*xyz^86.0-8633.0/xyz^90.0-8820.0*xyz^89.0-9200.0/xyz^93.0-93.0*xyz^92.0+xy^-94.0*0.0-285.0/xyz^96.0-384.0*xyz^95.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-8084.0*-87.0/xyz^88.0-8265.0*86.0*xyz^85.0-8633.0*-90.0/xyz^91.0-8820.0*89.0*xyz^88.0-9200.0*-93.0/xyz^94.0-93.0*92.0*xyz^91.0+xy^-94.0*0.0*0.0-285.0*-96.0/xyz^97.0-384.0*95.0*xyz^94.0";
 UsageCalculus.EqnSolArrayMap2[2] = "703308.0/xyz^88.0-710790.0*xyz^85.0+776970.0/xyz^91.0-784980.0*xyz^88.0+855600.0/xyz^94.0-8556.0*xyz^91.0+xy^-94.0*0.0+27360.0/xyz^97.0-36480.0*xyz^94.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.1058823529411765/xyz^85.0-1.0795454545454546*xyz^88.0+96.0*xyz-1.1022727272727273/xyz^88.0-1.0769230769230769*xyz^91.0+99.0*xyz-1.098901098901099/xyz^91.0-0.010638297872340425*xyz^94.0+xy^-94.0*2.0*xyz-1.0/31.333333333333332/xyz^94.0-1.0/24.25*xyz^97.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.1058823529411765/-84.0/xyz^84.0-1.0795454545454546/89.0*xyz^89.0+96.0/2.0*xyz^2.0-1.1022727272727273/-87.0/xyz^87.0-1.0769230769230769/92.0*xyz^92.0+99.0/2.0*xyz^2.0-1.098901098901099/-90.0/xyz^90.0-0.010638297872340425/95.0*xyz^95.0+xy^-94.0*xyz^2.0-1.0/31.333333333333332/-93.0/xyz^93.0-1.0/24.25/98.0*xyz^98.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/75.95744680851064/xyz^84.0-1.0/82.44210526315788*xyz^89.0+48.0*xyz^2.0+1.0/78.9278350515464/xyz^87.0-1.0/85.42857142857143*xyz^92.0+49.5*xyz^2.0+1.0/81.89999999999999/xyz^90.0-1.1198208286674131E-4*xyz^95.0+xy^-94.0*xyz^2.0+1.0/2914.0/xyz^93.0-1.0/2376.5*xyz^98.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "703308.0/xyz^88.0-710790.0*xyz^85.0+776970.0/xyz^91.0-784980.0*xyz^88.0+855600.0/xyz^94.0-8556.0*xyz^91.0+xy^-94.0*0.0+27360.0/xyz^97.0-36480.0*xyz^94.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "703308.0*-88.0/xyz^89.0-710790.0*85.0*xyz^84.0+776970.0*-91.0/xyz^92.0-784980.0*88.0*xyz^87.0+855600.0*-94.0/xyz^95.0-8556.0*91.0*xyz^90.0+xy^-94.0*0.0*0.0+27360.0*-97.0/xyz^98.0-36480.0*94.0*xyz^93.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-6.1891104E7/xyz^89.0-6.041715E7*xyz^84.0-7.070427E7/xyz^92.0-6.907824E7*xyz^87.0-8.04264E7/xyz^95.0-778596.0*xyz^90.0+xy^-94.0*0.0-2653920.0/xyz^98.0-3429120.0*xyz^93.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/75.95744680851064/xyz^84.0-1.0/82.44210526315788*xyz^89.0+48.0*xyz^2.0+1.0/78.9278350515464/xyz^87.0-1.0/85.42857142857143*xyz^92.0+49.5*xyz^2.0+1.0/81.89999999999999/xyz^90.0-1.1198208286674131E-4*xyz^95.0-4.0*xyz^95.0+xy^-94.0*xyz^2.0+1.0/2914.0/xyz^93.0-1.0/2376.5*xyz^98.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/75.95744680851064/-83.0/xyz^83.0-1.0/82.44210526315788/90.0*xyz^90.0+48.0/3.0*xyz^3.0+1.0/78.9278350515464/-86.0/xyz^86.0-1.0/85.42857142857143/93.0*xyz^93.0+49.5/3.0*xyz^3.0+1.0/81.89999999999999/-89.0/xyz^89.0-1.1198208286674131E-4/96.0*xyz^96.0-4.0/96.0*xyz^96.0+xy^-94.0/3.0*xyz^3.0+1.0/2914.0/-92.0/xyz^92.0-1.0/2376.5/99.0*xyz^99.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/6304.468085106383/xyz^83.0-1.0/7419.78947368421*xyz^90.0+16.0*xyz^3.0-1.0/6787.79381443299/xyz^86.0-1.0/7944.857142857143*xyz^93.0+16.5*xyz^3.0-1.0/7289.099999999999/xyz^89.0-1.0/857280.0*xyz^96.0-1.0/24.0*xyz^96.0-0.041666666666666664*xyz^96.0+xy^-94.0/3.0*xyz^3.0-1.0/268088.0/xyz^92.0-1.0/235273.5*xyz^99.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-6.1891104E7/xyz^89.0-6.041715E7*xyz^84.0-7.070427E7/xyz^92.0-6.907824E7*xyz^87.0-8.04264E7/xyz^95.0-778596.0*xyz^90.0+xy^-94.0*0.0-2653920.0/xyz^98.0-3429120.0*xyz^93.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*-89.0/xyz^90.0-84.0*xyz^83.0-0.0*-92.0/xyz^93.0-87.0*xyz^86.0-0.0*-95.0/xyz^96.0-778596.0*90.0*xyz^89.0+xy^-94.0*0.0*0.0-2653920.0*-98.0/xyz^99.0-3429120.0*93.0*xyz^92.0";
 UsageCalculus.EqnSolArrayMap2[4] = "0.0/xyz^90.0-84.0*xyz^83.0+0.0/xyz^93.0-87.0*xyz^86.0+0.0/xyz^96.0-7.007364E7*xyz^89.0+xy^-94.0*0.0+2.6008416E8/xyz^99.0-3.1890816E8*xyz^92.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/6304.468085106383/xyz^83.0-1.0/7419.78947368421*xyz^90.0+16.0*xyz^3.0-1.0/6787.79381443299/xyz^86.0-1.0/7944.857142857143*xyz^93.0+16.5*xyz^3.0-1.0/7289.099999999999/xyz^89.0-1.0/857280.0*xyz^96.0-1.0/24.0*xyz^96.0-0.041666666666666664*xyz^96.0+xy^-94.0/3.0*xyz^3.0-1.0/268088.0/xyz^92.0-1.0/235273.5*xyz^99.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/6304.468085106383/-82.0/xyz^82.0-1.0/7419.78947368421/91.0*xyz^91.0+16.0/4.0*xyz^4.0-1.0/6787.79381443299/-85.0/xyz^85.0-1.0/7944.857142857143/94.0*xyz^94.0+16.5/4.0*xyz^4.0-1.0/7289.099999999999/-88.0/xyz^88.0-1.0/857280.0/97.0*xyz^97.0-1.0/24.0/97.0*xyz^97.0-0.041666666666666664/97.0*xyz^97.0+xy^-94.0/3.0/4.0*xyz^4.0-1.0/268088.0/-91.0/xyz^91.0-1.0/235273.5/100.0*xyz^100.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/516966.38297872344/xyz^82.0-1.0/675200.8421052631*xyz^91.0+4.0*xyz^4.0+1.0/576962.4742268041/xyz^85.0-1.0/746816.5714285715*xyz^94.0+4.125*xyz^4.0+1.0/641440.7999999999/xyz^88.0-1.0/8.315616E7*xyz^97.0-1.0/2328.0*xyz^97.0-4.29553264604811E-4*xyz^97.0+xy^-94.0/12.0*xyz^4.0+1.0/2.4396008E7/xyz^91.0-1.0/2.352735E7*xyz^100.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120563() {
 UsageCalculus.TestCase = 120563;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-95*x^87+96+97/x^89-98*x^90+99+100/x^92-1*x^93+2*xy^-94+3/x^95-4*x^96+5*xyzxy^-97+6/x^98";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-95.0*x^87.0+96.0+97.0/x^89.0-98.0*x^90.0+99.0+100.0/x^92.0-x^93.0+2.0+3.0/x^95.0-4.0*x^96.0+5.0+6.0/x^98.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-95.0*87.0*x^86.0+96.0*0.0+97.0*-89.0/x^90.0-98.0*90.0*x^89.0+99.0*0.0+100.0*-92.0/x^93.0-93.0*x^92.0+2.0*0.0+3.0*-95.0/x^96.0-4.0*96.0*x^95.0+5.0*0.0+6.0*-98.0/x^99.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-8265.0*x^86.0-8633.0/x^90.0-8820.0*x^89.0-9200.0/x^93.0-93.0*x^92.0-285.0/x^96.0-384.0*x^95.0-588.0/x^99.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-95.0*x^87.0+96.0+97.0/x^89.0-98.0*x^90.0+99.0+100.0/x^92.0-x^93.0+2.0+3.0/x^95.0-4.0*x^96.0+5.0+6.0/x^98.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-95.0/88.0*x^88.0+96.0*x+97.0/-88.0/x^88.0-98.0/91.0*x^91.0+99.0*x+100.0/-91.0/x^91.0-1.0/94.0*x^94.0+2.0*x+3.0/-94.0/x^94.0-4.0/97.0*x^97.0+5.0*x+6.0/-97.0/x^97.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0795454545454546*x^88.0+96.0*x-1.1022727272727273/x^88.0-1.0769230769230769*x^91.0+99.0*x-1.098901098901099/x^91.0-1.0/94.0*x^94.0+2.0*x-1.0/31.333333333333332/x^94.0-1.0/24.25*x^97.0+5.0*x-1.0/16.166666666666668/x^97.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-8265.0*x^86.0-8633.0/x^90.0-8820.0*x^89.0-9200.0/x^93.0-93.0*x^92.0-285.0/x^96.0-384.0*x^95.0-588.0/x^99.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-8265.0*86.0*x^85.0-8633.0*-90.0/x^91.0-8820.0*89.0*x^88.0-9200.0*-93.0/x^94.0-93.0*92.0*x^91.0-285.0*-96.0/x^97.0-384.0*95.0*x^94.0-588.0*-99.0/x^100.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-710790.0*x^85.0+776970.0/x^91.0-784980.0*x^88.0+855600.0/x^94.0-8556.0*x^91.0+27360.0/x^97.0-36480.0*x^94.0+58212.0/x^100.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0795454545454546*x^88.0+96.0*x-1.1022727272727273/x^88.0-1.0769230769230769*x^91.0+99.0*x-1.098901098901099/x^91.0-1.0/94.0*x^94.0+2.0*x-1.0/31.333333333333332/x^94.0-1.0/24.25*x^97.0+5.0*x-1.0/16.166666666666668/x^97.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0795454545454546/89.0*x^89.0+96.0/2.0*x^2.0-1.1022727272727273/-87.0/x^87.0-1.0769230769230769/92.0*x^92.0+99.0/2.0*x^2.0-1.098901098901099/-90.0/x^90.0-1.0/94.0/95.0*x^95.0+x^2.0-1.0/31.333333333333332/-93.0/x^93.0-1.0/24.25/98.0*x^98.0+5.0/2.0*x^2.0-1.0/16.166666666666668/-96.0/x^96.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/82.44210526315788*x^89.0+48.0*x^2.0+1.0/78.9278350515464/x^87.0-1.0/85.42857142857143*x^92.0+49.5*x^2.0+1.0/81.89999999999999/x^90.0-1.1198208286674133E-4*x^95.0+x^2.0+1.0/2914.0/x^93.0-1.0/2376.5*x^98.0+2.5*x^2.0+1.0/1552.0/x^96.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-710790.0*x^85.0+776970.0/x^91.0-784980.0*x^88.0+855600.0/x^94.0-8556.0*x^91.0+27360.0/x^97.0-36480.0*x^94.0+58212.0/x^100.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-710790.0*85.0*x^84.0+776970.0*-91.0/x^92.0-784980.0*88.0*x^87.0+855600.0*-94.0/x^95.0-8556.0*91.0*x^90.0+27360.0*-97.0/x^98.0-36480.0*94.0*x^93.0+58212.0*-100.0/x^101.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-6.041715E7*x^84.0-7.070427E7/x^92.0-6.907824E7*x^87.0-8.04264E7/x^95.0-778596.0*x^90.0-2653920.0/x^98.0-3429120.0*x^93.0-5821200.0/x^101.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/82.44210526315788*x^89.0+48.0*x^2.0+1.0/78.9278350515464/x^87.0-1.0/85.42857142857143*x^92.0+49.5*x^2.0+1.0/81.89999999999999/x^90.0-1.1198208286674133E-4*x^95.0-4.0*x^95.0+x^2.0+1.0/2914.0/x^93.0-1.0/2376.5*x^98.0+2.5*x^2.0+1.0/1552.0/x^96.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/82.44210526315788/90.0*x^90.0+48.0/3.0*x^3.0+1.0/78.9278350515464/-86.0/x^86.0-1.0/85.42857142857143/93.0*x^93.0+49.5/3.0*x^3.0+1.0/81.89999999999999/-89.0/x^89.0-1.1198208286674133E-4/96.0*x^96.0-4.0/96.0*x^96.0+1.0/3.0*x^3.0+1.0/2914.0/-92.0/x^92.0-1.0/2376.5/99.0*x^99.0+2.5/3.0*x^3.0+1.0/1552.0/-95.0/x^95.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/7419.78947368421*x^90.0+16.0*x^3.0-1.0/6787.79381443299/x^86.0-1.0/7944.857142857143*x^93.0+16.5*x^3.0-1.0/7289.099999999999/x^89.0-1.0/857280.0*x^96.0-1.0/24.0*x^96.0-1.0/24.0*x^96.0+1.0/3.0*x^3.0-1.0/268088.0/x^92.0-1.0/235273.5*x^99.0+1.0/1.2*x^3.0-1.0/147440.0/x^95.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-6.041715E7*x^84.0-7.070427E7/x^92.0-6.907824E7*x^87.0-8.04264E7/x^95.0-778596.0*x^90.0-2653920.0/x^98.0-3429120.0*x^93.0-5821200.0/x^101.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-84.0*x^83.0-0.0*-92.0/x^93.0-87.0*x^86.0-0.0*-95.0/x^96.0-778596.0*90.0*x^89.0-2653920.0*-98.0/x^99.0-3429120.0*93.0*x^92.0-5821200.0*-101.0/x^102.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-84.0*x^83.0+0.0/x^93.0-87.0*x^86.0+0.0/x^96.0-7.007364E7*x^89.0+2.6008416E8/x^99.0-3.1890816E8*x^92.0+5.879412E8/x^102.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/7419.78947368421*x^90.0+16.0*x^3.0-1.0/6787.79381443299/x^86.0-1.0/7944.857142857143*x^93.0+16.5*x^3.0-1.0/7289.099999999999/x^89.0-1.0/857280.0*x^96.0-1.0/24.0*x^96.0-1.0/24.0*x^96.0+1.0/3.0*x^3.0-1.0/268088.0/x^92.0-1.0/235273.5*x^99.0+1.0/1.2*x^3.0-1.0/147440.0/x^95.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/7419.78947368421/91.0*x^91.0+16.0/4.0*x^4.0-1.0/6787.79381443299/-85.0/x^85.0-1.0/7944.857142857143/94.0*x^94.0+16.5/4.0*x^4.0-1.0/7289.099999999999/-88.0/x^88.0-1.0/857280.0/97.0*x^97.0-1.0/24.0/97.0*x^97.0-1.0/24.0/97.0*x^97.0+1.0/3.0/4.0*x^4.0-1.0/268088.0/-91.0/x^91.0-1.0/235273.5/100.0*x^100.0+1.0/1.2/4.0*x^4.0-1.0/147440.0/-94.0/x^94.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/675200.8421052631*x^91.0+4.0*x^4.0+1.0/576962.4742268041/x^85.0-1.0/746816.5714285715*x^94.0+4.125*x^4.0+1.0/641440.7999999999/x^88.0-1.0/8.315616E7*x^97.0-1.0/2328.0*x^97.0-1.0/2328.0*x^97.0+1.0/12.0*x^4.0+1.0/2.4396008E7/x^91.0-1.0/2.352735E7*x^100.0+1.0/4.8*x^4.0+1.0/1.385936E7/x^94.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120564() {
 UsageCalculus.TestCase = 120564;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+96+97/x^89-98*x^90+99+100/x^92-1*x^93+2*xy^-94+3/x^95-4*x^96+5*xyzxy^-97+6/x^98-7*x^99+8*xyzxyzxy^-100";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "96.0+97.0/x^89.0-98.0*x^90.0+99.0+100.0/x^92.0-x^93.0+2.0+3.0/x^95.0-4.0*x^96.0+5.0+6.0/x^98.0-7.0*x^99.0+8.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+97.0*-89.0/x^90.0-98.0*90.0*x^89.0+99.0*0.0+100.0*-92.0/x^93.0-93.0*x^92.0+2.0*0.0+3.0*-95.0/x^96.0-4.0*96.0*x^95.0+5.0*0.0+6.0*-98.0/x^99.0-7.0*99.0*x^98.0+8.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-8633.0/x^90.0-8820.0*x^89.0-9200.0/x^93.0-93.0*x^92.0-285.0/x^96.0-384.0*x^95.0-588.0/x^99.0-693.0*x^98.0";
 UsageCalculus.EqnSolArrayMap3[1] = "96.0+97.0/x^89.0-98.0*x^90.0+99.0+100.0/x^92.0-x^93.0+2.0+3.0/x^95.0-4.0*x^96.0+5.0+6.0/x^98.0-7.0*x^99.0+8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "96.0*x+97.0/-88.0/x^88.0-98.0/91.0*x^91.0+99.0*x+100.0/-91.0/x^91.0-1.0/94.0*x^94.0+2.0*x+3.0/-94.0/x^94.0-4.0/97.0*x^97.0+5.0*x+6.0/-97.0/x^97.0-7.0/100.0*x^100.0+8.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "96.0*x-1.1022727272727273/x^88.0-1.0769230769230769*x^91.0+99.0*x-1.098901098901099/x^91.0-1.0/94.0*x^94.0+2.0*x-1.0/31.333333333333332/x^94.0-1.0/24.25*x^97.0+5.0*x-1.0/16.166666666666668/x^97.0-1.0/14.285714285714286*x^100.0+8.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-8633.0/x^90.0-8820.0*x^89.0-9200.0/x^93.0-93.0*x^92.0-285.0/x^96.0-384.0*x^95.0-588.0/x^99.0-693.0*x^98.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-8633.0*-90.0/x^91.0-8820.0*89.0*x^88.0-9200.0*-93.0/x^94.0-93.0*92.0*x^91.0-285.0*-96.0/x^97.0-384.0*95.0*x^94.0-588.0*-99.0/x^100.0-693.0*98.0*x^97.0";
 UsageCalculus.EqnSolArrayMap2[2] = "776970.0/x^91.0-784980.0*x^88.0+855600.0/x^94.0-8556.0*x^91.0+27360.0/x^97.0-36480.0*x^94.0+58212.0/x^100.0-67914.0*x^97.0";
 UsageCalculus.EqnSolArrayMap3[2] = "96.0*x-1.1022727272727273/x^88.0-1.0769230769230769*x^91.0+99.0*x-1.098901098901099/x^91.0-1.0/94.0*x^94.0+2.0*x-1.0/31.333333333333332/x^94.0-1.0/24.25*x^97.0+5.0*x-1.0/16.166666666666668/x^97.0-1.0/14.285714285714286*x^100.0+8.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "96.0/2.0*x^2.0-1.1022727272727273/-87.0/x^87.0-1.0769230769230769/92.0*x^92.0+99.0/2.0*x^2.0-1.098901098901099/-90.0/x^90.0-1.0/94.0/95.0*x^95.0+x^2.0-1.0/31.333333333333332/-93.0/x^93.0-1.0/24.25/98.0*x^98.0+5.0/2.0*x^2.0-1.0/16.166666666666668/-96.0/x^96.0-1.0/14.285714285714286/101.0*x^101.0+8.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "48.0*x^2.0+1.0/78.9278350515464/x^87.0-1.0/85.42857142857143*x^92.0+49.5*x^2.0+1.0/81.89999999999999/x^90.0-1.1198208286674133E-4*x^95.0+x^2.0+1.0/2914.0/x^93.0-1.0/2376.5*x^98.0+2.5*x^2.0+1.0/1552.0/x^96.0-1.0/1442.857142857143*x^101.0+4.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "776970.0/x^91.0-784980.0*x^88.0+855600.0/x^94.0-8556.0*x^91.0+27360.0/x^97.0-36480.0*x^94.0+58212.0/x^100.0-67914.0*x^97.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "776970.0*-91.0/x^92.0-784980.0*88.0*x^87.0+855600.0*-94.0/x^95.0-8556.0*91.0*x^90.0+27360.0*-97.0/x^98.0-36480.0*94.0*x^93.0+58212.0*-100.0/x^101.0-67914.0*97.0*x^96.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-7.070427E7/x^92.0-6.907824E7*x^87.0-8.04264E7/x^95.0-778596.0*x^90.0-2653920.0/x^98.0-3429120.0*x^93.0-5821200.0/x^101.0-6587658.0*x^96.0";
 UsageCalculus.EqnSolArrayMap3[3] = "48.0*x^2.0+1.0/78.9278350515464/x^87.0-1.0/85.42857142857143*x^92.0+49.5*x^2.0+1.0/81.89999999999999/x^90.0-1.1198208286674133E-4*x^95.0-4.0*x^95.0+x^2.0+1.0/2914.0/x^93.0-1.0/2376.5*x^98.0+2.5*x^2.0+1.0/1552.0/x^96.0-1.0/1442.857142857143*x^101.0+4.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "48.0/3.0*x^3.0+1.0/78.9278350515464/-86.0/x^86.0-1.0/85.42857142857143/93.0*x^93.0+49.5/3.0*x^3.0+1.0/81.89999999999999/-89.0/x^89.0-1.1198208286674133E-4/96.0*x^96.0-4.0/96.0*x^96.0+1.0/3.0*x^3.0+1.0/2914.0/-92.0/x^92.0-1.0/2376.5/99.0*x^99.0+2.5/3.0*x^3.0+1.0/1552.0/-95.0/x^95.0-1.0/1442.857142857143/102.0*x^102.0+4.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "16.0*x^3.0-1.0/6787.79381443299/x^86.0-1.0/7944.857142857143*x^93.0+16.5*x^3.0-1.0/7289.099999999999/x^89.0-1.0/857280.0*x^96.0-1.0/24.0*x^96.0-1.0/24.0*x^96.0+1.0/3.0*x^3.0-1.0/268088.0/x^92.0-1.0/235273.5*x^99.0+1.0/1.2*x^3.0-1.0/147440.0/x^95.0-1.0/147171.42857142858*x^102.0+1.3333333333333333*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-7.070427E7/x^92.0-6.907824E7*x^87.0-8.04264E7/x^95.0-778596.0*x^90.0-2653920.0/x^98.0-3429120.0*x^93.0-5821200.0/x^101.0-6587658.0*x^96.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*-92.0/x^93.0-87.0*x^86.0-0.0*-95.0/x^96.0-778596.0*90.0*x^89.0-2653920.0*-98.0/x^99.0-3429120.0*93.0*x^92.0-5821200.0*-101.0/x^102.0-6587658.0*96.0*x^95.0";
 UsageCalculus.EqnSolArrayMap2[4] = "0.0/x^93.0-87.0*x^86.0+0.0/x^96.0-7.007364E7*x^89.0+2.6008416E8/x^99.0-3.1890816E8*x^92.0+5.879412E8/x^102.0-6.32415168E8*x^95.0";
 UsageCalculus.EqnSolArrayMap3[4] = "16.0*x^3.0-1.0/6787.79381443299/x^86.0-1.0/7944.857142857143*x^93.0+16.5*x^3.0-1.0/7289.099999999999/x^89.0-1.0/857280.0*x^96.0-1.0/24.0*x^96.0-1.0/24.0*x^96.0+1.0/3.0*x^3.0-1.0/268088.0/x^92.0-1.0/235273.5*x^99.0+1.0/1.2*x^3.0-1.0/147440.0/x^95.0-1.0/147171.42857142858*x^102.0+1.3333333333333333*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "16.0/4.0*x^4.0-1.0/6787.79381443299/-85.0/x^85.0-1.0/7944.857142857143/94.0*x^94.0+16.5/4.0*x^4.0-1.0/7289.099999999999/-88.0/x^88.0-1.0/857280.0/97.0*x^97.0-1.0/24.0/97.0*x^97.0-1.0/24.0/97.0*x^97.0+1.0/3.0/4.0*x^4.0-1.0/268088.0/-91.0/x^91.0-1.0/235273.5/100.0*x^100.0+1.0/1.2/4.0*x^4.0-1.0/147440.0/-94.0/x^94.0-1.0/147171.42857142858/103.0*x^103.0+1.3333333333333333/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "4.0*x^4.0+1.0/576962.4742268041/x^85.0-1.0/746816.5714285715*x^94.0+4.125*x^4.0+1.0/641440.7999999999/x^88.0-1.0/8.315616E7*x^97.0-1.0/2328.0*x^97.0-1.0/2328.0*x^97.0+1.0/12.0*x^4.0+1.0/2.4396008E7/x^91.0-1.0/2.352735E7*x^100.0+1.0/4.8*x^4.0+1.0/1.385936E7/x^94.0-1.0/1.5158657142857144E7*x^103.0+1.0/3.0*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120565() {
 UsageCalculus.TestCase = 120565;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+97/x^89-98*x^90+99+100/x^92-1*x^93+2*xy^-94+3/x^95-4*x^96+5*xyzxy^-97+6/x^98-7*x^99+8*xyzxyzxy^-100+9/x^1-10*x^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "97.0/x^89.0-98.0*x^90.0+99.0+100.0/x^92.0-x^93.0+2.0+3.0/x^95.0-4.0*x^96.0+5.0+6.0/x^98.0-7.0*x^99.0+8.0+9.0/x-10.0*x^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "97.0*-89.0/x^90.0-98.0*90.0*x^89.0+99.0*0.0+100.0*-92.0/x^93.0-93.0*x^92.0+2.0*0.0+3.0*-95.0/x^96.0-4.0*96.0*x^95.0+5.0*0.0+6.0*-98.0/x^99.0-7.0*99.0*x^98.0+8.0*0.0-9.0/x^2.0-10.0*2.0*x^1.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-8633.0/x^90.0-8820.0*x^89.0-9200.0/x^93.0-93.0*x^92.0-285.0/x^96.0-384.0*x^95.0-588.0/x^99.0-693.0*x^98.0-9.0/x^2.0-20.0*x";
 UsageCalculus.EqnSolArrayMap3[1] = "97.0/x^89.0-98.0*x^90.0+99.0+100.0/x^92.0-x^93.0+2.0+3.0/x^95.0-4.0*x^96.0+5.0+6.0/x^98.0-7.0*x^99.0+8.0+9.0/x-10.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "97.0/-88.0/x^88.0-98.0/91.0*x^91.0+99.0*x+100.0/-91.0/x^91.0-1.0/94.0*x^94.0+2.0*x+3.0/-94.0/x^94.0-4.0/97.0*x^97.0+5.0*x+6.0/-97.0/x^97.0-7.0/100.0*x^100.0+8.0*x+9.0*ln(x)-10.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.1022727272727273/x^88.0-1.0769230769230769*x^91.0+99.0*x-1.098901098901099/x^91.0-1.0/94.0*x^94.0+2.0*x-1.0/31.333333333333332/x^94.0-1.0/24.25*x^97.0+5.0*x-1.0/16.166666666666668/x^97.0-1.0/14.285714285714286*x^100.0+8.0*x+9.0*ln(x)-3.3333333333333335*x^3.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-8633.0/x^90.0-8820.0*x^89.0-9200.0/x^93.0-93.0*x^92.0-285.0/x^96.0-384.0*x^95.0-588.0/x^99.0-693.0*x^98.0-9.0/x^2.0-20.0*x";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-8633.0*-90.0/x^91.0-8820.0*89.0*x^88.0-9200.0*-93.0/x^94.0-93.0*92.0*x^91.0-285.0*-96.0/x^97.0-384.0*95.0*x^94.0-588.0*-99.0/x^100.0-693.0*98.0*x^97.0-9.0*-2.0/x^3.0-20.0";
 UsageCalculus.EqnSolArrayMap2[2] = "776970.0/x^91.0-784980.0*x^88.0+855600.0/x^94.0-8556.0*x^91.0+27360.0/x^97.0-36480.0*x^94.0+58212.0/x^100.0-67914.0*x^97.0+18.0/x^3.0-20.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.1022727272727273/x^88.0-1.0769230769230769*x^91.0+99.0*x-1.098901098901099/x^91.0-1.0/94.0*x^94.0+2.0*x-1.0/31.333333333333332/x^94.0-1.0/24.25*x^97.0+5.0*x-1.0/16.166666666666668/x^97.0-1.0/14.285714285714286*x^100.0+8.0*x+9.0*ln(x)-3.3333333333333335*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.1022727272727273/-87.0/x^87.0-1.0769230769230769/92.0*x^92.0+99.0/2.0*x^2.0-1.098901098901099/-90.0/x^90.0-1.0/94.0/95.0*x^95.0+x^2.0-1.0/31.333333333333332/-93.0/x^93.0-1.0/24.25/98.0*x^98.0+5.0/2.0*x^2.0-1.0/16.166666666666668/-96.0/x^96.0-1.0/14.285714285714286/101.0*x^101.0+8.0/2.0*x^2.0+9.0*x-3.3333333333333335/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/78.9278350515464/x^87.0-1.0/85.42857142857143*x^92.0+49.5*x^2.0+1.0/81.89999999999999/x^90.0-1.1198208286674133E-4*x^95.0+x^2.0+1.0/2914.0/x^93.0-1.0/2376.5*x^98.0+2.5*x^2.0+1.0/1552.0/x^96.0-1.0/1442.857142857143*x^101.0+4.0*x^2.0+9.0*x-1.0/1.2*x^4.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "776970.0/x^91.0-784980.0*x^88.0+855600.0/x^94.0-8556.0*x^91.0+27360.0/x^97.0-36480.0*x^94.0+58212.0/x^100.0-67914.0*x^97.0+18.0/x^3.0-20.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "776970.0*-91.0/x^92.0-784980.0*88.0*x^87.0+855600.0*-94.0/x^95.0-8556.0*91.0*x^90.0+27360.0*-97.0/x^98.0-36480.0*94.0*x^93.0+58212.0*-100.0/x^101.0-67914.0*97.0*x^96.0+18.0*-3.0/x^4.0-20.0*0.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-7.070427E7/x^92.0-6.907824E7*x^87.0-8.04264E7/x^95.0-778596.0*x^90.0-2653920.0/x^98.0-3429120.0*x^93.0-5821200.0/x^101.0-6587658.0*x^96.0-54.0/x^4.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/78.9278350515464/x^87.0-1.0/85.42857142857143*x^92.0+49.5*x^2.0+1.0/81.89999999999999/x^90.0-1.1198208286674133E-4*x^95.0-4.0*x^95.0+x^2.0+1.0/2914.0/x^93.0-1.0/2376.5*x^98.0+2.5*x^2.0+1.0/1552.0/x^96.0-1.0/1442.857142857143*x^101.0+4.0*x^2.0+9.0*x-1.0/1.2*x^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/78.9278350515464/-86.0/x^86.0-1.0/85.42857142857143/93.0*x^93.0+49.5/3.0*x^3.0+1.0/81.89999999999999/-89.0/x^89.0-1.1198208286674133E-4/96.0*x^96.0-4.0/96.0*x^96.0+1.0/3.0*x^3.0+1.0/2914.0/-92.0/x^92.0-1.0/2376.5/99.0*x^99.0+2.5/3.0*x^3.0+1.0/1552.0/-95.0/x^95.0-1.0/1442.857142857143/102.0*x^102.0+4.0/3.0*x^3.0+9.0/2.0*x^2.0-1.0/1.2/5.0*x^5.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/6787.79381443299/x^86.0-1.0/7944.857142857143*x^93.0+16.5*x^3.0-1.0/7289.099999999999/x^89.0-1.0/857280.0*x^96.0-1.0/24.0*x^96.0-1.0/24.0*x^96.0+1.0/3.0*x^3.0-1.0/268088.0/x^92.0-1.0/235273.5*x^99.0+1.0/1.2*x^3.0-1.0/147440.0/x^95.0-1.0/147171.42857142858*x^102.0+1.3333333333333333*x^3.0+4.5*x^2.0-1.0/6.0*x^5.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-7.070427E7/x^92.0-6.907824E7*x^87.0-8.04264E7/x^95.0-778596.0*x^90.0-2653920.0/x^98.0-3429120.0*x^93.0-5821200.0/x^101.0-6587658.0*x^96.0-54.0/x^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*-92.0/x^93.0-87.0*x^86.0-0.0*-95.0/x^96.0-778596.0*90.0*x^89.0-2653920.0*-98.0/x^99.0-3429120.0*93.0*x^92.0-5821200.0*-101.0/x^102.0-6587658.0*96.0*x^95.0-54.0*-4.0/x^5.0";
 UsageCalculus.EqnSolArrayMap2[4] = "0.0/x^93.0-87.0*x^86.0+0.0/x^96.0-7.007364E7*x^89.0+2.6008416E8/x^99.0-3.1890816E8*x^92.0+5.879412E8/x^102.0-6.32415168E8*x^95.0+216.0/x^5.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/6787.79381443299/x^86.0-1.0/7944.857142857143*x^93.0+16.5*x^3.0-1.0/7289.099999999999/x^89.0-1.0/857280.0*x^96.0-1.0/24.0*x^96.0-1.0/24.0*x^96.0+1.0/3.0*x^3.0-1.0/268088.0/x^92.0-1.0/235273.5*x^99.0+1.0/1.2*x^3.0-1.0/147440.0/x^95.0-1.0/147171.42857142858*x^102.0+1.3333333333333333*x^3.0+4.5*x^2.0-1.0/6.0*x^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/6787.79381443299/-85.0/x^85.0-1.0/7944.857142857143/94.0*x^94.0+16.5/4.0*x^4.0-1.0/7289.099999999999/-88.0/x^88.0-1.0/857280.0/97.0*x^97.0-1.0/24.0/97.0*x^97.0-1.0/24.0/97.0*x^97.0+1.0/3.0/4.0*x^4.0-1.0/268088.0/-91.0/x^91.0-1.0/235273.5/100.0*x^100.0+1.0/1.2/4.0*x^4.0-1.0/147440.0/-94.0/x^94.0-1.0/147171.42857142858/103.0*x^103.0+1.3333333333333333/4.0*x^4.0+4.5/3.0*x^3.0-1.0/6.0/6.0*x^6.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/576962.4742268041/x^85.0-1.0/746816.5714285715*x^94.0+4.125*x^4.0+1.0/641440.7999999999/x^88.0-1.0/8.315616E7*x^97.0-1.0/2328.0*x^97.0-1.0/2328.0*x^97.0+1.0/12.0*x^4.0+1.0/2.4396008E7/x^91.0-1.0/2.352735E7*x^100.0+1.0/4.8*x^4.0+1.0/1.385936E7/x^94.0-1.0/1.5158657142857144E7*x^103.0+1.0/3.0*x^4.0+1.5*x^3.0-1.0/36.0*x^6.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120566() {
 UsageCalculus.TestCase = 120566;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-98*x^90+99+100/x^92-1*x^93+2*xy^-94+3/x^95-4*x^96+5*xyzxy^-97+6/x^98-7*x^99+8*xyzxyzxy^-100+9/x^1-10*x^2+11+12/x^4";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-98.0*x^90.0+99.0+100.0/x^92.0-x^93.0+2.0+3.0/x^95.0-4.0*x^96.0+5.0+6.0/x^98.0-7.0*x^99.0+8.0+9.0/x-10.0*x^2.0+11.0+12.0/x^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-98.0*90.0*x^89.0+99.0*0.0+100.0*-92.0/x^93.0-93.0*x^92.0+2.0*0.0+3.0*-95.0/x^96.0-4.0*96.0*x^95.0+5.0*0.0+6.0*-98.0/x^99.0-7.0*99.0*x^98.0+8.0*0.0-9.0/x^2.0-10.0*2.0*x^1.0+11.0*0.0+12.0*-4.0/x^5.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-8820.0*x^89.0-9200.0/x^93.0-93.0*x^92.0-285.0/x^96.0-384.0*x^95.0-588.0/x^99.0-693.0*x^98.0-9.0/x^2.0-20.0*x-48.0/x^5.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-98.0*x^90.0+99.0+100.0/x^92.0-x^93.0+2.0+3.0/x^95.0-4.0*x^96.0+5.0+6.0/x^98.0-7.0*x^99.0+8.0+9.0/x-10.0*x^2.0+11.0+12.0/x^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-98.0/91.0*x^91.0+99.0*x+100.0/-91.0/x^91.0-1.0/94.0*x^94.0+2.0*x+3.0/-94.0/x^94.0-4.0/97.0*x^97.0+5.0*x+6.0/-97.0/x^97.0-7.0/100.0*x^100.0+8.0*x+9.0*ln(x)-10.0/3.0*x^3.0+11.0*x+12.0/-3.0/x^3.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0769230769230769*x^91.0+99.0*x-1.098901098901099/x^91.0-1.0/94.0*x^94.0+2.0*x-1.0/31.333333333333332/x^94.0-1.0/24.25*x^97.0+5.0*x-1.0/16.166666666666668/x^97.0-1.0/14.285714285714286*x^100.0+8.0*x+9.0*ln(x)-3.3333333333333335*x^3.0+11.0*x-4.0/x^3.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-8820.0*x^89.0-9200.0/x^93.0-93.0*x^92.0-285.0/x^96.0-384.0*x^95.0-588.0/x^99.0-693.0*x^98.0-9.0/x^2.0-20.0*x-48.0/x^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-8820.0*89.0*x^88.0-9200.0*-93.0/x^94.0-93.0*92.0*x^91.0-285.0*-96.0/x^97.0-384.0*95.0*x^94.0-588.0*-99.0/x^100.0-693.0*98.0*x^97.0-9.0*-2.0/x^3.0-20.0-48.0*-5.0/x^6.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-784980.0*x^88.0+855600.0/x^94.0-8556.0*x^91.0+27360.0/x^97.0-36480.0*x^94.0+58212.0/x^100.0-67914.0*x^97.0+18.0/x^3.0-20.0+240.0/x^6.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0769230769230769*x^91.0+99.0*x-1.098901098901099/x^91.0-1.0/94.0*x^94.0+2.0*x-1.0/31.333333333333332/x^94.0-1.0/24.25*x^97.0+5.0*x-1.0/16.166666666666668/x^97.0-1.0/14.285714285714286*x^100.0+8.0*x+9.0*ln(x)-3.3333333333333335*x^3.0+11.0*x-4.0/x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0769230769230769/92.0*x^92.0+99.0/2.0*x^2.0-1.098901098901099/-90.0/x^90.0-1.0/94.0/95.0*x^95.0+x^2.0-1.0/31.333333333333332/-93.0/x^93.0-1.0/24.25/98.0*x^98.0+5.0/2.0*x^2.0-1.0/16.166666666666668/-96.0/x^96.0-1.0/14.285714285714286/101.0*x^101.0+8.0/2.0*x^2.0+9.0*x-3.3333333333333335/4.0*x^4.0+11.0/2.0*x^2.0-4.0/-2.0/x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/85.42857142857143*x^92.0+49.5*x^2.0+1.0/81.89999999999999/x^90.0-1.1198208286674133E-4*x^95.0+x^2.0+1.0/2914.0/x^93.0-1.0/2376.5*x^98.0+2.5*x^2.0+1.0/1552.0/x^96.0-1.0/1442.857142857143*x^101.0+4.0*x^2.0+9.0*x-1.0/1.2*x^4.0+5.5*x^2.0+2.0/x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-784980.0*x^88.0+855600.0/x^94.0-8556.0*x^91.0+27360.0/x^97.0-36480.0*x^94.0+58212.0/x^100.0-67914.0*x^97.0+18.0/x^3.0-20.0+240.0/x^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-784980.0*88.0*x^87.0+855600.0*-94.0/x^95.0-8556.0*91.0*x^90.0+27360.0*-97.0/x^98.0-36480.0*94.0*x^93.0+58212.0*-100.0/x^101.0-67914.0*97.0*x^96.0+18.0*-3.0/x^4.0-20.0*0.0+240.0*-6.0/x^7.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-6.907824E7*x^87.0-8.04264E7/x^95.0-778596.0*x^90.0-2653920.0/x^98.0-3429120.0*x^93.0-5821200.0/x^101.0-6587658.0*x^96.0-54.0/x^4.0-1440.0/x^7.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/85.42857142857143*x^92.0+49.5*x^2.0+1.0/81.89999999999999/x^90.0-1.1198208286674133E-4*x^95.0-4.0*x^95.0+x^2.0+1.0/2914.0/x^93.0-1.0/2376.5*x^98.0+2.5*x^2.0+1.0/1552.0/x^96.0-1.0/1442.857142857143*x^101.0+4.0*x^2.0+9.0*x-1.0/1.2*x^4.0+5.5*x^2.0+2.0/x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/85.42857142857143/93.0*x^93.0+49.5/3.0*x^3.0+1.0/81.89999999999999/-89.0/x^89.0-1.1198208286674133E-4/96.0*x^96.0-4.0/96.0*x^96.0+1.0/3.0*x^3.0+1.0/2914.0/-92.0/x^92.0-1.0/2376.5/99.0*x^99.0+2.5/3.0*x^3.0+1.0/1552.0/-95.0/x^95.0-1.0/1442.857142857143/102.0*x^102.0+4.0/3.0*x^3.0+9.0/2.0*x^2.0-1.0/1.2/5.0*x^5.0+5.5/3.0*x^3.0+2.0/-1.0/x^1.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/7944.857142857143*x^93.0+16.5*x^3.0-1.0/7289.099999999999/x^89.0-1.0/857280.0*x^96.0-1.0/24.0*x^96.0-1.0/24.0*x^96.0+1.0/3.0*x^3.0-1.0/268088.0/x^92.0-1.0/235273.5*x^99.0+1.0/1.2*x^3.0-1.0/147440.0/x^95.0-1.0/147171.42857142858*x^102.0+1.3333333333333333*x^3.0+4.5*x^2.0-1.0/6.0*x^5.0+1.8333333333333333*x^3.0-2.0/x";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-6.907824E7*x^87.0-8.04264E7/x^95.0-778596.0*x^90.0-2653920.0/x^98.0-3429120.0*x^93.0-5821200.0/x^101.0-6587658.0*x^96.0-54.0/x^4.0-1440.0/x^7.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-87.0*x^86.0-0.0*-95.0/x^96.0-778596.0*90.0*x^89.0-2653920.0*-98.0/x^99.0-3429120.0*93.0*x^92.0-5821200.0*-101.0/x^102.0-6587658.0*96.0*x^95.0-54.0*-4.0/x^5.0-1440.0*-7.0/x^8.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-87.0*x^86.0+0.0/x^96.0-7.007364E7*x^89.0+2.6008416E8/x^99.0-3.1890816E8*x^92.0+5.879412E8/x^102.0-6.32415168E8*x^95.0+216.0/x^5.0+10080.0/x^8.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/7944.857142857143*x^93.0+16.5*x^3.0-1.0/7289.099999999999/x^89.0-1.0/857280.0*x^96.0-1.0/24.0*x^96.0-1.0/24.0*x^96.0+1.0/3.0*x^3.0-1.0/268088.0/x^92.0-1.0/235273.5*x^99.0+1.0/1.2*x^3.0-1.0/147440.0/x^95.0-1.0/147171.42857142858*x^102.0+1.3333333333333333*x^3.0+4.5*x^2.0-1.0/6.0*x^5.0+1.8333333333333333*x^3.0-2.0/x";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/7944.857142857143/94.0*x^94.0+16.5/4.0*x^4.0-1.0/7289.099999999999/-88.0/x^88.0-1.0/857280.0/97.0*x^97.0-1.0/24.0/97.0*x^97.0-1.0/24.0/97.0*x^97.0+1.0/3.0/4.0*x^4.0-1.0/268088.0/-91.0/x^91.0-1.0/235273.5/100.0*x^100.0+1.0/1.2/4.0*x^4.0-1.0/147440.0/-94.0/x^94.0-1.0/147171.42857142858/103.0*x^103.0+1.3333333333333333/4.0*x^4.0+4.5/3.0*x^3.0-1.0/6.0/6.0*x^6.0+1.8333333333333333/4.0*x^4.0-2.0*ln(x)";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/746816.5714285715*x^94.0+4.125*x^4.0+1.0/641440.7999999999/x^88.0-1.0/8.315616E7*x^97.0-1.0/2328.0*x^97.0-1.0/2328.0*x^97.0+1.0/12.0*x^4.0+1.0/2.4396008E7/x^91.0-1.0/2.352735E7*x^100.0+1.0/4.8*x^4.0+1.0/1.385936E7/x^94.0-1.0/1.5158657142857144E7*x^103.0+1.0/3.0*x^4.0+1.5*x^3.0-1.0/36.0*x^6.0+1.0/2.181818181818182*x^4.0-2.0*ln(x)";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120567() {
 UsageCalculus.TestCase = 120567;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+99+100/xyz^92-1*xyz^93+2*xy^-94+3/xyz^95-4*xyz^96+5*xyzxy^-97+6/xyz^98-7*xyz^99+8*xyzxyzxy^-100+9/xyz^1-10*xyz^2+11+12/xyz^4-13*xyz^5+14";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "99.0+100.0/xyz^92.0-xyz^93.0+xy^-94.0*2.0+3.0/xyz^95.0-4.0*xyz^96.0+5.0+6.0/xyz^98.0-7.0*xyz^99.0+8.0+9.0/xyz-10.0*xyz^2.0+11.0+12.0/xyz^4.0-13.0*xyz^5.0+14.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+100.0*-92.0/xyz^93.0-93.0*xyz^92.0+xy^-94.0*2.0*0.0+3.0*-95.0/xyz^96.0-4.0*96.0*xyz^95.0+5.0*0.0+6.0*-98.0/xyz^99.0-7.0*99.0*xyz^98.0+8.0*0.0-9.0/xyz^2.0-10.0*2.0*xyz^1.0+11.0*0.0+12.0*-4.0/xyz^5.0-13.0*5.0*xyz^4.0+14.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-9200.0/xyz^93.0-93.0*xyz^92.0+xy^-94.0*0.0-285.0/xyz^96.0-384.0*xyz^95.0-588.0/xyz^99.0-693.0*xyz^98.0-9.0/xyz^2.0-20.0*xyz-48.0/xyz^5.0-65.0*xyz^4.0";
 UsageCalculus.EqnSolArrayMap3[1] = "99.0+100.0/xyz^92.0-xyz^93.0+xy^-94.0*2.0+3.0/xyz^95.0-4.0*xyz^96.0+5.0+6.0/xyz^98.0-7.0*xyz^99.0+8.0+9.0/xyz-10.0*xyz^2.0+11.0+12.0/xyz^4.0-13.0*xyz^5.0+14.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "99.0*xyz+100.0/-91.0/xyz^91.0-1.0/94.0*xyz^94.0+xy^-94.0*2.0*xyz+3.0/-94.0/xyz^94.0-4.0/97.0*xyz^97.0+5.0*xyz+6.0/-97.0/xyz^97.0-7.0/100.0*xyz^100.0+8.0*xyz+9.0*ln(xyz)-10.0/3.0*xyz^3.0+11.0*xyz+12.0/-3.0/xyz^3.0-13.0/6.0*xyz^6.0+14.0*xyz";
 UsageCalculus.EqnSolArrayMap4[1] = "99.0*xyz-1.098901098901099/xyz^91.0-0.010638297872340425*xyz^94.0+xy^-94.0*2.0*xyz-1.0/31.333333333333332/xyz^94.0-1.0/24.25*xyz^97.0+5.0*xyz-1.0/16.166666666666668/xyz^97.0-1.0/14.285714285714286*xyz^100.0+8.0*xyz+9.0*ln(xyz)-3.3333333333333335*xyz^3.0+11.0*xyz-4.0/xyz^3.0-2.1666666666666665*xyz^6.0+14.0*xyz";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-9200.0/xyz^93.0-93.0*xyz^92.0+xy^-94.0*0.0-285.0/xyz^96.0-384.0*xyz^95.0-588.0/xyz^99.0-693.0*xyz^98.0-9.0/xyz^2.0-20.0*xyz-48.0/xyz^5.0-65.0*xyz^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-9200.0*-93.0/xyz^94.0-93.0*92.0*xyz^91.0+xy^-94.0*0.0*0.0-285.0*-96.0/xyz^97.0-384.0*95.0*xyz^94.0-588.0*-99.0/xyz^100.0-693.0*98.0*xyz^97.0-9.0*-2.0/xyz^3.0-20.0-48.0*-5.0/xyz^6.0-65.0*4.0*xyz^3.0";
 UsageCalculus.EqnSolArrayMap2[2] = "855600.0/xyz^94.0-8556.0*xyz^91.0+xy^-94.0*0.0+27360.0/xyz^97.0-36480.0*xyz^94.0+58212.0/xyz^100.0-67914.0*xyz^97.0+18.0/xyz^3.0-20.0+240.0/xyz^6.0-260.0*xyz^3.0";
 UsageCalculus.EqnSolArrayMap3[2] = "99.0*xyz-1.098901098901099/xyz^91.0-0.010638297872340425*xyz^94.0+xy^-94.0*2.0*xyz-1.0/31.333333333333332/xyz^94.0-1.0/24.25*xyz^97.0+5.0*xyz-1.0/16.166666666666668/xyz^97.0-1.0/14.285714285714286*xyz^100.0+8.0*xyz+9.0*ln(xyz)-3.3333333333333335*xyz^3.0+11.0*xyz-4.0/xyz^3.0-2.1666666666666665*xyz^6.0+14.0*xyz";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "99.0/2.0*xyz^2.0-1.098901098901099/-90.0/xyz^90.0-0.010638297872340425/95.0*xyz^95.0+xy^-94.0*xyz^2.0-1.0/31.333333333333332/-93.0/xyz^93.0-1.0/24.25/98.0*xyz^98.0+5.0/2.0*xyz^2.0-1.0/16.166666666666668/-96.0/xyz^96.0-1.0/14.285714285714286/101.0*xyz^101.0+8.0/2.0*xyz^2.0+9.0*xyz-3.3333333333333335/4.0*xyz^4.0+11.0/2.0*xyz^2.0-4.0/-2.0/xyz^2.0-2.1666666666666665/7.0*xyz^7.0+14.0/2.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "49.5*xyz^2.0+1.0/81.89999999999999/xyz^90.0-1.1198208286674131E-4*xyz^95.0+xy^-94.0*xyz^2.0+1.0/2914.0/xyz^93.0-1.0/2376.5*xyz^98.0+2.5*xyz^2.0+1.0/1552.0/xyz^96.0-1.0/1442.857142857143*xyz^101.0+4.0*xyz^2.0+9.0*xyz-1.0/1.2*xyz^4.0+5.5*xyz^2.0+2.0/xyz^2.0-1.0/3.230769230769231*xyz^7.0+7.0*xyz^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "855600.0/xyz^94.0-8556.0*xyz^91.0+xy^-94.0*0.0+27360.0/xyz^97.0-36480.0*xyz^94.0+58212.0/xyz^100.0-67914.0*xyz^97.0+18.0/xyz^3.0-20.0+240.0/xyz^6.0-260.0*xyz^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "855600.0*-94.0/xyz^95.0-8556.0*91.0*xyz^90.0+xy^-94.0*0.0*0.0+27360.0*-97.0/xyz^98.0-36480.0*94.0*xyz^93.0+58212.0*-100.0/xyz^101.0-67914.0*97.0*xyz^96.0+18.0*-3.0/xyz^4.0-20.0*0.0+240.0*-6.0/xyz^7.0-260.0*3.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-8.04264E7/xyz^95.0-778596.0*xyz^90.0+xy^-94.0*0.0-2653920.0/xyz^98.0-3429120.0*xyz^93.0-5821200.0/xyz^101.0-6587658.0*xyz^96.0-54.0/xyz^4.0-1440.0/xyz^7.0-780.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap3[3] = "49.5*xyz^2.0+1.0/81.89999999999999/xyz^90.0-1.1198208286674131E-4*xyz^95.0-4.0*xyz^95.0+xy^-94.0*xyz^2.0+1.0/2914.0/xyz^93.0-1.0/2376.5*xyz^98.0+2.5*xyz^2.0+1.0/1552.0/xyz^96.0-1.0/1442.857142857143*xyz^101.0+4.0*xyz^2.0+9.0*xyz-1.0/1.2*xyz^4.0+5.5*xyz^2.0+2.0/xyz^2.0-1.0/3.230769230769231*xyz^7.0+7.0*xyz^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "49.5/3.0*xyz^3.0+1.0/81.89999999999999/-89.0/xyz^89.0-1.1198208286674131E-4/96.0*xyz^96.0-4.0/96.0*xyz^96.0+xy^-94.0/3.0*xyz^3.0+1.0/2914.0/-92.0/xyz^92.0-1.0/2376.5/99.0*xyz^99.0+2.5/3.0*xyz^3.0+1.0/1552.0/-95.0/xyz^95.0-1.0/1442.857142857143/102.0*xyz^102.0+4.0/3.0*xyz^3.0+9.0/2.0*xyz^2.0-1.0/1.2/5.0*xyz^5.0+5.5/3.0*xyz^3.0+2.0/-1.0/xyz^1.0-1.0/3.230769230769231/8.0*xyz^8.0+7.0/3.0*xyz^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "16.5*xyz^3.0-1.0/7289.099999999999/xyz^89.0-1.0/857280.0*xyz^96.0-1.0/24.0*xyz^96.0-0.041666666666666664*xyz^96.0+xy^-94.0/3.0*xyz^3.0-1.0/268088.0/xyz^92.0-1.0/235273.5*xyz^99.0+1.0/1.2*xyz^3.0-1.0/147440.0/xyz^95.0-1.0/147171.42857142858*xyz^102.0+1.3333333333333333*xyz^3.0+4.5*xyz^2.0-1.0/6.0*xyz^5.0+1.8333333333333333*xyz^3.0-2.0/xyz-1.0/25.846153846153847*xyz^8.0+2.3333333333333335*xyz^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-8.04264E7/xyz^95.0-778596.0*xyz^90.0+xy^-94.0*0.0-2653920.0/xyz^98.0-3429120.0*xyz^93.0-5821200.0/xyz^101.0-6587658.0*xyz^96.0-54.0/xyz^4.0-1440.0/xyz^7.0-780.0*xyz^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*-95.0/xyz^96.0-778596.0*90.0*xyz^89.0+xy^-94.0*0.0*0.0-2653920.0*-98.0/xyz^99.0-3429120.0*93.0*xyz^92.0-5821200.0*-101.0/xyz^102.0-6587658.0*96.0*xyz^95.0-54.0*-4.0/xyz^5.0-1440.0*-7.0/xyz^8.0-780.0*2.0*xyz^1.0";
 UsageCalculus.EqnSolArrayMap2[4] = "0.0/xyz^96.0-7.007364E7*xyz^89.0+xy^-94.0*0.0+2.6008416E8/xyz^99.0-3.1890816E8*xyz^92.0+5.879412E8/xyz^102.0-6.32415168E8*xyz^95.0+216.0/xyz^5.0+10080.0/xyz^8.0-1560.0*xyz";
 UsageCalculus.EqnSolArrayMap3[4] = "16.5*xyz^3.0-1.0/7289.099999999999/xyz^89.0-1.0/857280.0*xyz^96.0-1.0/24.0*xyz^96.0-0.041666666666666664*xyz^96.0+xy^-94.0/3.0*xyz^3.0-1.0/268088.0/xyz^92.0-1.0/235273.5*xyz^99.0+1.0/1.2*xyz^3.0-1.0/147440.0/xyz^95.0-1.0/147171.42857142858*xyz^102.0+1.3333333333333333*xyz^3.0+4.5*xyz^2.0-1.0/6.0*xyz^5.0+1.8333333333333333*xyz^3.0-2.0/xyz-1.0/25.846153846153847*xyz^8.0+2.3333333333333335*xyz^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "16.5/4.0*xyz^4.0-1.0/7289.099999999999/-88.0/xyz^88.0-1.0/857280.0/97.0*xyz^97.0-1.0/24.0/97.0*xyz^97.0-0.041666666666666664/97.0*xyz^97.0+xy^-94.0/3.0/4.0*xyz^4.0-1.0/268088.0/-91.0/xyz^91.0-1.0/235273.5/100.0*xyz^100.0+1.0/1.2/4.0*xyz^4.0-1.0/147440.0/-94.0/xyz^94.0-1.0/147171.42857142858/103.0*xyz^103.0+1.3333333333333333/4.0*xyz^4.0+4.5/3.0*xyz^3.0-1.0/6.0/6.0*xyz^6.0+1.8333333333333333/4.0*xyz^4.0-2.0*ln(xyz)-1.0/25.846153846153847/9.0*xyz^9.0+2.3333333333333335/4.0*xyz^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "4.125*xyz^4.0+1.0/641440.7999999999/xyz^88.0-1.0/8.315616E7*xyz^97.0-1.0/2328.0*xyz^97.0-4.29553264604811E-4*xyz^97.0+xy^-94.0/12.0*xyz^4.0+1.0/2.4396008E7/xyz^91.0-1.0/2.352735E7*xyz^100.0+1.0/4.8*xyz^4.0+1.0/1.385936E7/xyz^94.0-1.0/1.5158657142857144E7*xyz^103.0+1.0/3.0*xyz^4.0+1.5*xyz^3.0-1.0/36.0*xyz^6.0+1.0/2.181818181818182*xyz^4.0-2.0*ln(xyz)-1.0/232.6153846153846*xyz^9.0+1.0/1.7142857142857142*xyz^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120568() {
 UsageCalculus.TestCase = 120568;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+100/x^92-1*x^93+2*xy^-94+3/x^95-4*x^96+5*xyzxy^-97+6/x^98-7*x^99+8*xyzxyzxy^-100+9/x^1-10*x^2+11+12/x^4-13*x^5+14+15/x^7-16*x^8";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "100.0/x^92.0-x^93.0+2.0+3.0/x^95.0-4.0*x^96.0+5.0+6.0/x^98.0-7.0*x^99.0+8.0+9.0/x-10.0*x^2.0+11.0+12.0/x^4.0-13.0*x^5.0+14.0+15.0/x^7.0-16.0*x^8.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "100.0*-92.0/x^93.0-93.0*x^92.0+2.0*0.0+3.0*-95.0/x^96.0-4.0*96.0*x^95.0+5.0*0.0+6.0*-98.0/x^99.0-7.0*99.0*x^98.0+8.0*0.0-9.0/x^2.0-10.0*2.0*x^1.0+11.0*0.0+12.0*-4.0/x^5.0-13.0*5.0*x^4.0+14.0*0.0+15.0*-7.0/x^8.0-16.0*8.0*x^7.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-9200.0/x^93.0-93.0*x^92.0-285.0/x^96.0-384.0*x^95.0-588.0/x^99.0-693.0*x^98.0-9.0/x^2.0-20.0*x-48.0/x^5.0-65.0*x^4.0-105.0/x^8.0-128.0*x^7.0";
 UsageCalculus.EqnSolArrayMap3[1] = "100.0/x^92.0-x^93.0+2.0+3.0/x^95.0-4.0*x^96.0+5.0+6.0/x^98.0-7.0*x^99.0+8.0+9.0/x-10.0*x^2.0+11.0+12.0/x^4.0-13.0*x^5.0+14.0+15.0/x^7.0-16.0*x^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "100.0/-91.0/x^91.0-1.0/94.0*x^94.0+2.0*x+3.0/-94.0/x^94.0-4.0/97.0*x^97.0+5.0*x+6.0/-97.0/x^97.0-7.0/100.0*x^100.0+8.0*x+9.0*ln(x)-10.0/3.0*x^3.0+11.0*x+12.0/-3.0/x^3.0-13.0/6.0*x^6.0+14.0*x+15.0/-6.0/x^6.0-16.0/9.0*x^9.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.098901098901099/x^91.0-1.0/94.0*x^94.0+2.0*x-1.0/31.333333333333332/x^94.0-1.0/24.25*x^97.0+5.0*x-1.0/16.166666666666668/x^97.0-1.0/14.285714285714286*x^100.0+8.0*x+9.0*ln(x)-3.3333333333333335*x^3.0+11.0*x-4.0/x^3.0-2.1666666666666665*x^6.0+14.0*x-2.5/x^6.0-1.7777777777777777*x^9.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-9200.0/x^93.0-93.0*x^92.0-285.0/x^96.0-384.0*x^95.0-588.0/x^99.0-693.0*x^98.0-9.0/x^2.0-20.0*x-48.0/x^5.0-65.0*x^4.0-105.0/x^8.0-128.0*x^7.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-9200.0*-93.0/x^94.0-93.0*92.0*x^91.0-285.0*-96.0/x^97.0-384.0*95.0*x^94.0-588.0*-99.0/x^100.0-693.0*98.0*x^97.0-9.0*-2.0/x^3.0-20.0-48.0*-5.0/x^6.0-65.0*4.0*x^3.0-105.0*-8.0/x^9.0-128.0*7.0*x^6.0";
 UsageCalculus.EqnSolArrayMap2[2] = "855600.0/x^94.0-8556.0*x^91.0+27360.0/x^97.0-36480.0*x^94.0+58212.0/x^100.0-67914.0*x^97.0+18.0/x^3.0-20.0+240.0/x^6.0-260.0*x^3.0+840.0/x^9.0-896.0*x^6.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.098901098901099/x^91.0-1.0/94.0*x^94.0+2.0*x-1.0/31.333333333333332/x^94.0-1.0/24.25*x^97.0+5.0*x-1.0/16.166666666666668/x^97.0-1.0/14.285714285714286*x^100.0+8.0*x+9.0*ln(x)-3.3333333333333335*x^3.0+11.0*x-4.0/x^3.0-2.1666666666666665*x^6.0+14.0*x-2.5/x^6.0-1.7777777777777777*x^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.098901098901099/-90.0/x^90.0-1.0/94.0/95.0*x^95.0+x^2.0-1.0/31.333333333333332/-93.0/x^93.0-1.0/24.25/98.0*x^98.0+5.0/2.0*x^2.0-1.0/16.166666666666668/-96.0/x^96.0-1.0/14.285714285714286/101.0*x^101.0+8.0/2.0*x^2.0+9.0*x-3.3333333333333335/4.0*x^4.0+11.0/2.0*x^2.0-4.0/-2.0/x^2.0-2.1666666666666665/7.0*x^7.0+14.0/2.0*x^2.0-2.5/-5.0/x^5.0-1.7777777777777777/10.0*x^10.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/81.89999999999999/x^90.0-1.1198208286674133E-4*x^95.0+x^2.0+1.0/2914.0/x^93.0-1.0/2376.5*x^98.0+2.5*x^2.0+1.0/1552.0/x^96.0-1.0/1442.857142857143*x^101.0+4.0*x^2.0+9.0*x-1.0/1.2*x^4.0+5.5*x^2.0+2.0/x^2.0-1.0/3.230769230769231*x^7.0+7.0*x^2.0+1.0/2.0/x^5.0-1.0/5.625*x^10.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "855600.0/x^94.0-8556.0*x^91.0+27360.0/x^97.0-36480.0*x^94.0+58212.0/x^100.0-67914.0*x^97.0+18.0/x^3.0-20.0+240.0/x^6.0-260.0*x^3.0+840.0/x^9.0-896.0*x^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "855600.0*-94.0/x^95.0-8556.0*91.0*x^90.0+27360.0*-97.0/x^98.0-36480.0*94.0*x^93.0+58212.0*-100.0/x^101.0-67914.0*97.0*x^96.0+18.0*-3.0/x^4.0-20.0*0.0+240.0*-6.0/x^7.0-260.0*3.0*x^2.0+840.0*-9.0/x^10.0-896.0*6.0*x^5.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-8.04264E7/x^95.0-778596.0*x^90.0-2653920.0/x^98.0-3429120.0*x^93.0-5821200.0/x^101.0-6587658.0*x^96.0-54.0/x^4.0-1440.0/x^7.0-780.0*x^2.0-7560.0/x^10.0-5376.0*x^5.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/81.89999999999999/x^90.0-1.1198208286674133E-4*x^95.0-4.0*x^95.0+x^2.0+1.0/2914.0/x^93.0-1.0/2376.5*x^98.0+2.5*x^2.0+1.0/1552.0/x^96.0-1.0/1442.857142857143*x^101.0+4.0*x^2.0+9.0*x-1.0/1.2*x^4.0+5.5*x^2.0+2.0/x^2.0-1.0/3.230769230769231*x^7.0+7.0*x^2.0+1.0/2.0/x^5.0-1.0/5.625*x^10.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/81.89999999999999/-89.0/x^89.0-1.1198208286674133E-4/96.0*x^96.0-4.0/96.0*x^96.0+1.0/3.0*x^3.0+1.0/2914.0/-92.0/x^92.0-1.0/2376.5/99.0*x^99.0+2.5/3.0*x^3.0+1.0/1552.0/-95.0/x^95.0-1.0/1442.857142857143/102.0*x^102.0+4.0/3.0*x^3.0+9.0/2.0*x^2.0-1.0/1.2/5.0*x^5.0+5.5/3.0*x^3.0+2.0/-1.0/x^1.0-1.0/3.230769230769231/8.0*x^8.0+7.0/3.0*x^3.0+1.0/2.0/-4.0/x^4.0-1.0/5.625/11.0*x^11.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/7289.099999999999/x^89.0-1.0/857280.0*x^96.0-1.0/24.0*x^96.0-1.0/24.0*x^96.0+1.0/3.0*x^3.0-1.0/268088.0/x^92.0-1.0/235273.5*x^99.0+1.0/1.2*x^3.0-1.0/147440.0/x^95.0-1.0/147171.42857142858*x^102.0+1.3333333333333333*x^3.0+4.5*x^2.0-1.0/6.0*x^5.0+1.8333333333333333*x^3.0-2.0/x-1.0/25.846153846153847*x^8.0+2.3333333333333335*x^3.0-1.0/8.0/x^4.0-1.0/61.875*x^11.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-8.04264E7/x^95.0-778596.0*x^90.0-2653920.0/x^98.0-3429120.0*x^93.0-5821200.0/x^101.0-6587658.0*x^96.0-54.0/x^4.0-1440.0/x^7.0-780.0*x^2.0-7560.0/x^10.0-5376.0*x^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*-95.0/x^96.0-778596.0*90.0*x^89.0-2653920.0*-98.0/x^99.0-3429120.0*93.0*x^92.0-5821200.0*-101.0/x^102.0-6587658.0*96.0*x^95.0-54.0*-4.0/x^5.0-1440.0*-7.0/x^8.0-780.0*2.0*x^1.0-7560.0*-10.0/x^11.0-5376.0*5.0*x^4.0";
 UsageCalculus.EqnSolArrayMap2[4] = "0.0/x^96.0-7.007364E7*x^89.0+2.6008416E8/x^99.0-3.1890816E8*x^92.0+5.879412E8/x^102.0-6.32415168E8*x^95.0+216.0/x^5.0+10080.0/x^8.0-1560.0*x+75600.0/x^11.0-26880.0*x^4.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/7289.099999999999/x^89.0-1.0/857280.0*x^96.0-1.0/24.0*x^96.0-1.0/24.0*x^96.0+1.0/3.0*x^3.0-1.0/268088.0/x^92.0-1.0/235273.5*x^99.0+1.0/1.2*x^3.0-1.0/147440.0/x^95.0-1.0/147171.42857142858*x^102.0+1.3333333333333333*x^3.0+4.5*x^2.0-1.0/6.0*x^5.0+1.8333333333333333*x^3.0-2.0/x-1.0/25.846153846153847*x^8.0+2.3333333333333335*x^3.0-1.0/8.0/x^4.0-1.0/61.875*x^11.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/7289.099999999999/-88.0/x^88.0-1.0/857280.0/97.0*x^97.0-1.0/24.0/97.0*x^97.0-1.0/24.0/97.0*x^97.0+1.0/3.0/4.0*x^4.0-1.0/268088.0/-91.0/x^91.0-1.0/235273.5/100.0*x^100.0+1.0/1.2/4.0*x^4.0-1.0/147440.0/-94.0/x^94.0-1.0/147171.42857142858/103.0*x^103.0+1.3333333333333333/4.0*x^4.0+4.5/3.0*x^3.0-1.0/6.0/6.0*x^6.0+1.8333333333333333/4.0*x^4.0-2.0*ln(x)-1.0/25.846153846153847/9.0*x^9.0+2.3333333333333335/4.0*x^4.0-1.0/8.0/-3.0/x^3.0-1.0/61.875/12.0*x^12.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/641440.7999999999/x^88.0-1.0/8.315616E7*x^97.0-1.0/2328.0*x^97.0-1.0/2328.0*x^97.0+1.0/12.0*x^4.0+1.0/2.4396008E7/x^91.0-1.0/2.352735E7*x^100.0+1.0/4.8*x^4.0+1.0/1.385936E7/x^94.0-1.0/1.5158657142857144E7*x^103.0+1.0/3.0*x^4.0+1.5*x^3.0-1.0/36.0*x^6.0+1.0/2.181818181818182*x^4.0-2.0*ln(x)-1.0/232.6153846153846*x^9.0+1.0/1.7142857142857142*x^4.0+1.0/24.0/x^3.0-1.0/742.5*x^12.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120569() {
 UsageCalculus.TestCase = 120569;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-1+2*xy^-94+3-4+5*xyzxy^-97+6-7+8*xyzxyzxy^-100+9-10+11+12-13+14+15-16+17*xyzxyzxyzxyzxyzxy^-9+18";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-1.0+2.0+3.0-4.0+5.0+6.0-7.0+8.0+9.0-10.0+11.0+12.0-13.0+14.0+15.0-16.0+17.0+18.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0+2.0*0.0+3.0*0.0-4.0*0.0+5.0*0.0+6.0*0.0-7.0*0.0+8.0*0.0+9.0*0.0-10.0*0.0+11.0*0.0+12.0*0.0-13.0*0.0+14.0*0.0+15.0*0.0-16.0*0.0+17.0*0.0+18.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "-1.0+2.0+3.0-4.0+5.0+6.0-7.0+8.0+9.0-10.0+11.0+12.0-13.0+14.0+15.0-16.0+17.0+18.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.0*x+2.0*x+3.0*x-4.0*x+5.0*x+6.0*x-7.0*x+8.0*x+9.0*x-10.0*x+11.0*x+12.0*x-13.0*x+14.0*x+15.0*x-16.0*x+17.0*x+18.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "-x+2.0*x+3.0*x-4.0*x+5.0*x+6.0*x-7.0*x+8.0*x+9.0*x-10.0*x+11.0*x+12.0*x-13.0*x+14.0*x+15.0*x-16.0*x+17.0*x+18.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "-x+2.0*x+3.0*x-4.0*x+5.0*x+6.0*x-7.0*x+8.0*x+9.0*x-10.0*x+11.0*x+12.0*x-13.0*x+14.0*x+15.0*x-16.0*x+17.0*x+18.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/2.0*x^2.0+x^2.0+3.0/2.0*x^2.0-4.0/2.0*x^2.0+5.0/2.0*x^2.0+6.0/2.0*x^2.0-7.0/2.0*x^2.0+8.0/2.0*x^2.0+9.0/2.0*x^2.0-10.0/2.0*x^2.0+11.0/2.0*x^2.0+12.0/2.0*x^2.0-13.0/2.0*x^2.0+14.0/2.0*x^2.0+15.0/2.0*x^2.0-16.0/2.0*x^2.0+17.0/2.0*x^2.0+18.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-0.5*x^2.0+x^2.0+1.5*x^2.0-2.0*x^2.0+2.5*x^2.0+3.0*x^2.0-3.5*x^2.0+4.0*x^2.0+4.5*x^2.0-5.0*x^2.0+5.5*x^2.0+6.0*x^2.0-6.5*x^2.0+7.0*x^2.0+7.5*x^2.0-8.0*x^2.0+8.5*x^2.0+9.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "-0.5*x^2.0+x^2.0+1.5*x^2.0-2.0*x^2.0+2.5*x^2.0+3.0*x^2.0-3.5*x^2.0+4.0*x^2.0+4.5*x^2.0-5.0*x^2.0+5.5*x^2.0+6.0*x^2.0-6.5*x^2.0+7.0*x^2.0+7.5*x^2.0-8.0*x^2.0+8.5*x^2.0+9.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-0.5/3.0*x^3.0+1.0/3.0*x^3.0+1.5/3.0*x^3.0-2.0/3.0*x^3.0+2.5/3.0*x^3.0+3.0/3.0*x^3.0-3.5/3.0*x^3.0+4.0/3.0*x^3.0+4.5/3.0*x^3.0-5.0/3.0*x^3.0+5.5/3.0*x^3.0+6.0/3.0*x^3.0-6.5/3.0*x^3.0+7.0/3.0*x^3.0+7.5/3.0*x^3.0-8.0/3.0*x^3.0+8.5/3.0*x^3.0+9.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/6.0*x^3.0+1.0/3.0*x^3.0+1.0/2.0*x^3.0-1.0/1.5*x^3.0+1.0/1.2*x^3.0+x^3.0-1.1666666666666667*x^3.0+1.3333333333333333*x^3.0+1.5*x^3.0-1.6666666666666667*x^3.0+1.8333333333333333*x^3.0+2.0*x^3.0-2.1666666666666665*x^3.0+2.3333333333333335*x^3.0+2.5*x^3.0-2.6666666666666665*x^3.0+2.8333333333333335*x^3.0+3.0*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/6.0*x^3.0+1.0/3.0*x^3.0+1.0/2.0*x^3.0-1.0/1.5*x^3.0+0.8333333333333334*x^3.0+x^3.0-1.1666666666666667*x^3.0+1.3333333333333333*x^3.0+1.5*x^3.0-1.6666666666666667*x^3.0+1.8333333333333333*x^3.0+2.0*x^3.0-2.1666666666666665*x^3.0+2.3333333333333335*x^3.0+2.5*x^3.0-2.6666666666666665*x^3.0+2.8333333333333335*x^3.0+3.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/6.0/4.0*x^4.0+1.0/3.0/4.0*x^4.0+1.0/2.0/4.0*x^4.0-1.0/1.5/4.0*x^4.0+0.8333333333333334/4.0*x^4.0+1.0/4.0*x^4.0-1.1666666666666667/4.0*x^4.0+1.3333333333333333/4.0*x^4.0+1.5/4.0*x^4.0-1.6666666666666667/4.0*x^4.0+1.8333333333333333/4.0*x^4.0+2.0/4.0*x^4.0-2.1666666666666665/4.0*x^4.0+2.3333333333333335/4.0*x^4.0+2.5/4.0*x^4.0-2.6666666666666665/4.0*x^4.0+2.8333333333333335/4.0*x^4.0+3.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/24.0*x^4.0+1.0/12.0*x^4.0+1.0/8.0*x^4.0-1.0/6.0*x^4.0+1.0/4.8*x^4.0+1.0/4.0*x^4.0-1.0/3.4285714285714284*x^4.0+1.0/3.0*x^4.0+1.0/2.6666666666666665*x^4.0-1.0/2.4*x^4.0+1.0/2.181818181818182*x^4.0+1.0/2.0*x^4.0-1.0/1.8461538461538463*x^4.0+1.0/1.7142857142857142*x^4.0+1.0/1.6*x^4.0-1.0/1.5*x^4.0+1.0/1.4117647058823528*x^4.0+1.0/1.3333333333333333*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120570() {
 UsageCalculus.TestCase = 120570;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+2*xy^-94+3/x^95-4*x^96+5*xyzxy^-97+6/x^98-7*x^99+8*xyzxyzxy^-100+9/x^1-10*x^2+11+12/x^4-13*x^5+14+15/x^7-16*x^8+17*xyzxyzxyzxyzxyzxy^-9+18/x^10-19*x^11+20*xyzxyzxyzxyzxyzxyzxy^-12";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "2.0+3.0/x^95.0-4.0*x^96.0+5.0+6.0/x^98.0-7.0*x^99.0+8.0+9.0/x-10.0*x^2.0+11.0+12.0/x^4.0-13.0*x^5.0+14.0+15.0/x^7.0-16.0*x^8.0+17.0+18.0/x^10.0-19.0*x^11.0+20.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+3.0*-95.0/x^96.0-4.0*96.0*x^95.0+5.0*0.0+6.0*-98.0/x^99.0-7.0*99.0*x^98.0+8.0*0.0-9.0/x^2.0-10.0*2.0*x^1.0+11.0*0.0+12.0*-4.0/x^5.0-13.0*5.0*x^4.0+14.0*0.0+15.0*-7.0/x^8.0-16.0*8.0*x^7.0+17.0*0.0+18.0*-10.0/x^11.0-19.0*11.0*x^10.0+20.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-285.0/x^96.0-384.0*x^95.0-588.0/x^99.0-693.0*x^98.0-9.0/x^2.0-20.0*x-48.0/x^5.0-65.0*x^4.0-105.0/x^8.0-128.0*x^7.0-180.0/x^11.0-209.0*x^10.0";
 UsageCalculus.EqnSolArrayMap3[1] = "2.0+3.0/x^95.0-4.0*x^96.0+5.0+6.0/x^98.0-7.0*x^99.0+8.0+9.0/x-10.0*x^2.0+11.0+12.0/x^4.0-13.0*x^5.0+14.0+15.0/x^7.0-16.0*x^8.0+17.0+18.0/x^10.0-19.0*x^11.0+20.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "2.0*x+3.0/-94.0/x^94.0-4.0/97.0*x^97.0+5.0*x+6.0/-97.0/x^97.0-7.0/100.0*x^100.0+8.0*x+9.0*ln(x)-10.0/3.0*x^3.0+11.0*x+12.0/-3.0/x^3.0-13.0/6.0*x^6.0+14.0*x+15.0/-6.0/x^6.0-16.0/9.0*x^9.0+17.0*x+18.0/-9.0/x^9.0-19.0/12.0*x^12.0+20.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "2.0*x-1.0/31.333333333333332/x^94.0-1.0/24.25*x^97.0+5.0*x-1.0/16.166666666666668/x^97.0-1.0/14.285714285714286*x^100.0+8.0*x+9.0*ln(x)-3.3333333333333335*x^3.0+11.0*x-4.0/x^3.0-2.1666666666666665*x^6.0+14.0*x-2.5/x^6.0-1.7777777777777777*x^9.0+17.0*x-2.0/x^9.0-1.5833333333333333*x^12.0+20.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-285.0/x^96.0-384.0*x^95.0-588.0/x^99.0-693.0*x^98.0-9.0/x^2.0-20.0*x-48.0/x^5.0-65.0*x^4.0-105.0/x^8.0-128.0*x^7.0-180.0/x^11.0-209.0*x^10.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-285.0*-96.0/x^97.0-384.0*95.0*x^94.0-588.0*-99.0/x^100.0-693.0*98.0*x^97.0-9.0*-2.0/x^3.0-20.0-48.0*-5.0/x^6.0-65.0*4.0*x^3.0-105.0*-8.0/x^9.0-128.0*7.0*x^6.0-180.0*-11.0/x^12.0-209.0*10.0*x^9.0";
 UsageCalculus.EqnSolArrayMap2[2] = "27360.0/x^97.0-36480.0*x^94.0+58212.0/x^100.0-67914.0*x^97.0+18.0/x^3.0-20.0+240.0/x^6.0-260.0*x^3.0+840.0/x^9.0-896.0*x^6.0+1980.0/x^12.0-2090.0*x^9.0";
 UsageCalculus.EqnSolArrayMap3[2] = "2.0*x-1.0/31.333333333333332/x^94.0-1.0/24.25*x^97.0+5.0*x-1.0/16.166666666666668/x^97.0-1.0/14.285714285714286*x^100.0+8.0*x+9.0*ln(x)-3.3333333333333335*x^3.0+11.0*x-4.0/x^3.0-2.1666666666666665*x^6.0+14.0*x-2.5/x^6.0-1.7777777777777777*x^9.0+17.0*x-2.0/x^9.0-1.5833333333333333*x^12.0+20.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x^2.0-1.0/31.333333333333332/-93.0/x^93.0-1.0/24.25/98.0*x^98.0+5.0/2.0*x^2.0-1.0/16.166666666666668/-96.0/x^96.0-1.0/14.285714285714286/101.0*x^101.0+8.0/2.0*x^2.0+9.0*x-3.3333333333333335/4.0*x^4.0+11.0/2.0*x^2.0-4.0/-2.0/x^2.0-2.1666666666666665/7.0*x^7.0+14.0/2.0*x^2.0-2.5/-5.0/x^5.0-1.7777777777777777/10.0*x^10.0+17.0/2.0*x^2.0-2.0/-8.0/x^8.0-1.5833333333333333/13.0*x^13.0+20.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x^2.0+1.0/2914.0/x^93.0-1.0/2376.5*x^98.0+2.5*x^2.0+1.0/1552.0/x^96.0-1.0/1442.857142857143*x^101.0+4.0*x^2.0+9.0*x-1.0/1.2*x^4.0+5.5*x^2.0+2.0/x^2.0-1.0/3.230769230769231*x^7.0+7.0*x^2.0+1.0/2.0/x^5.0-1.0/5.625*x^10.0+8.5*x^2.0+1.0/4.0/x^8.0-1.0/8.210526315789474*x^13.0+10.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "27360.0/x^97.0-36480.0*x^94.0+58212.0/x^100.0-67914.0*x^97.0+18.0/x^3.0-20.0+240.0/x^6.0-260.0*x^3.0+840.0/x^9.0-896.0*x^6.0+1980.0/x^12.0-2090.0*x^9.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "27360.0*-97.0/x^98.0-36480.0*94.0*x^93.0+58212.0*-100.0/x^101.0-67914.0*97.0*x^96.0+18.0*-3.0/x^4.0-20.0*0.0+240.0*-6.0/x^7.0-260.0*3.0*x^2.0+840.0*-9.0/x^10.0-896.0*6.0*x^5.0+1980.0*-12.0/x^13.0-2090.0*9.0*x^8.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-2653920.0/x^98.0-3429120.0*x^93.0-5821200.0/x^101.0-6587658.0*x^96.0-54.0/x^4.0-1440.0/x^7.0-780.0*x^2.0-7560.0/x^10.0-5376.0*x^5.0-23760.0/x^13.0-18810.0*x^8.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x^2.0+1.0/2914.0/x^93.0-1.0/2376.5*x^98.0+2.5*x^2.0+1.0/1552.0/x^96.0-1.0/1442.857142857143*x^101.0+4.0*x^2.0+9.0*x-1.0/1.2*x^4.0+5.5*x^2.0+2.0/x^2.0-1.0/3.230769230769231*x^7.0+7.0*x^2.0+1.0/2.0/x^5.0-1.0/5.625*x^10.0+8.5*x^2.0+1.0/4.0/x^8.0-1.0/8.210526315789474*x^13.0+10.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/3.0*x^3.0+1.0/2914.0/-92.0/x^92.0-1.0/2376.5/99.0*x^99.0+2.5/3.0*x^3.0+1.0/1552.0/-95.0/x^95.0-1.0/1442.857142857143/102.0*x^102.0+4.0/3.0*x^3.0+9.0/2.0*x^2.0-1.0/1.2/5.0*x^5.0+5.5/3.0*x^3.0+2.0/-1.0/x^1.0-1.0/3.230769230769231/8.0*x^8.0+7.0/3.0*x^3.0+1.0/2.0/-4.0/x^4.0-1.0/5.625/11.0*x^11.0+8.5/3.0*x^3.0+1.0/4.0/-7.0/x^7.0-1.0/8.210526315789474/14.0*x^14.0+10.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/3.0*x^3.0-1.0/268088.0/x^92.0-1.0/235273.5*x^99.0+1.0/1.2*x^3.0-1.0/147440.0/x^95.0-1.0/147171.42857142858*x^102.0+1.3333333333333333*x^3.0+4.5*x^2.0-1.0/6.0*x^5.0+1.8333333333333333*x^3.0-2.0/x-1.0/25.846153846153847*x^8.0+2.3333333333333335*x^3.0-1.0/8.0/x^4.0-1.0/61.875*x^11.0+2.8333333333333335*x^3.0-1.0/28.0/x^7.0-1.0/114.94736842105264*x^14.0+3.3333333333333335*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-2653920.0/x^98.0-3429120.0*x^93.0-5821200.0/x^101.0-6587658.0*x^96.0-54.0/x^4.0-1440.0/x^7.0-780.0*x^2.0-7560.0/x^10.0-5376.0*x^5.0-23760.0/x^13.0-18810.0*x^8.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-2653920.0*-98.0/x^99.0-3429120.0*93.0*x^92.0-5821200.0*-101.0/x^102.0-6587658.0*96.0*x^95.0-54.0*-4.0/x^5.0-1440.0*-7.0/x^8.0-780.0*2.0*x^1.0-7560.0*-10.0/x^11.0-5376.0*5.0*x^4.0-23760.0*-13.0/x^14.0-18810.0*8.0*x^7.0";
 UsageCalculus.EqnSolArrayMap2[4] = "2.6008416E8/x^99.0-3.1890816E8*x^92.0+5.879412E8/x^102.0-6.32415168E8*x^95.0+216.0/x^5.0+10080.0/x^8.0-1560.0*x+75600.0/x^11.0-26880.0*x^4.0+308880.0/x^14.0-150480.0*x^7.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/3.0*x^3.0-1.0/268088.0/x^92.0-1.0/235273.5*x^99.0+1.0/1.2*x^3.0-1.0/147440.0/x^95.0-1.0/147171.42857142858*x^102.0+1.3333333333333333*x^3.0+4.5*x^2.0-1.0/6.0*x^5.0+1.8333333333333333*x^3.0-2.0/x-1.0/25.846153846153847*x^8.0+2.3333333333333335*x^3.0-1.0/8.0/x^4.0-1.0/61.875*x^11.0+2.8333333333333335*x^3.0-1.0/28.0/x^7.0-1.0/114.94736842105264*x^14.0+3.3333333333333335*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/3.0/4.0*x^4.0-1.0/268088.0/-91.0/x^91.0-1.0/235273.5/100.0*x^100.0+1.0/1.2/4.0*x^4.0-1.0/147440.0/-94.0/x^94.0-1.0/147171.42857142858/103.0*x^103.0+1.3333333333333333/4.0*x^4.0+4.5/3.0*x^3.0-1.0/6.0/6.0*x^6.0+1.8333333333333333/4.0*x^4.0-2.0*ln(x)-1.0/25.846153846153847/9.0*x^9.0+2.3333333333333335/4.0*x^4.0-1.0/8.0/-3.0/x^3.0-1.0/61.875/12.0*x^12.0+2.8333333333333335/4.0*x^4.0-1.0/28.0/-6.0/x^6.0-1.0/114.94736842105264/15.0*x^15.0+3.3333333333333335/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/12.0*x^4.0+1.0/2.4396008E7/x^91.0-1.0/2.352735E7*x^100.0+1.0/4.8*x^4.0+1.0/1.385936E7/x^94.0-1.0/1.5158657142857144E7*x^103.0+1.0/3.0*x^4.0+1.5*x^3.0-1.0/36.0*x^6.0+1.0/2.181818181818182*x^4.0-2.0*ln(x)-1.0/232.6153846153846*x^9.0+1.0/1.7142857142857142*x^4.0+1.0/24.0/x^3.0-1.0/742.5*x^12.0+1.0/1.4117647058823528*x^4.0+1.0/168.0/x^6.0-1.0/1724.2105263157896*x^15.0+1.0/1.2*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120571() {
 UsageCalculus.TestCase = 120571;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+3/xy^95-4*xy^96+5*xyzxy^-97+6/xy^98-7*xy^99+8*xyzxyzxy^-100+9/xy^1-10*xy^2+11+12/xy^4-13*xy^5+14+15/xy^7-16*xy^8+17*xyzxyzxyzxyzxyzxy^-9+18/xy^10-19*xy^11+20*xyzxyzxyzxyzxyzxyzxy^-12+21/xy^13-22*xy^14";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "3.0/xy^95.0-4.0*xy^96.0+5.0+6.0/xy^98.0-7.0*xy^99.0+8.0+9.0/xy-10.0*xy^2.0+11.0+12.0/xy^4.0-13.0*xy^5.0+14.0+15.0/xy^7.0-16.0*xy^8.0+17.0+18.0/xy^10.0-19.0*xy^11.0+20.0+21.0/xy^13.0-22.0*xy^14.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "3.0*-95.0/xy^96.0-4.0*96.0*xy^95.0+5.0*0.0+6.0*-98.0/xy^99.0-7.0*99.0*xy^98.0+8.0*0.0-9.0/xy^2.0-10.0*2.0*xy^1.0+11.0*0.0+12.0*-4.0/xy^5.0-13.0*5.0*xy^4.0+14.0*0.0+15.0*-7.0/xy^8.0-16.0*8.0*xy^7.0+17.0*0.0+18.0*-10.0/xy^11.0-19.0*11.0*xy^10.0+20.0*0.0+21.0*-13.0/xy^14.0-22.0*14.0*xy^13.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-285.0/xy^96.0-384.0*xy^95.0-588.0/xy^99.0-693.0*xy^98.0-9.0/xy^2.0-20.0*xy-48.0/xy^5.0-65.0*xy^4.0-105.0/xy^8.0-128.0*xy^7.0-180.0/xy^11.0-209.0*xy^10.0-273.0/xy^14.0-308.0*xy^13.0";
 UsageCalculus.EqnSolArrayMap3[1] = "3.0/xy^95.0-4.0*xy^96.0+5.0+6.0/xy^98.0-7.0*xy^99.0+8.0+9.0/xy-10.0*xy^2.0+11.0+12.0/xy^4.0-13.0*xy^5.0+14.0+15.0/xy^7.0-16.0*xy^8.0+17.0+18.0/xy^10.0-19.0*xy^11.0+20.0+21.0/xy^13.0-22.0*xy^14.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "3.0/-94.0/xy^94.0-4.0/97.0*xy^97.0+5.0*xy+6.0/-97.0/xy^97.0-7.0/100.0*xy^100.0+8.0*xy+9.0*ln(xy)-10.0/3.0*xy^3.0+11.0*xy+12.0/-3.0/xy^3.0-13.0/6.0*xy^6.0+14.0*xy+15.0/-6.0/xy^6.0-16.0/9.0*xy^9.0+17.0*xy+18.0/-9.0/xy^9.0-19.0/12.0*xy^12.0+20.0*xy+21.0/-12.0/xy^12.0-22.0/15.0*xy^15.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/31.333333333333332/xy^94.0-1.0/24.25*xy^97.0+5.0*xy-1.0/16.166666666666668/xy^97.0-1.0/14.285714285714286*xy^100.0+8.0*xy+9.0*ln(xy)-3.3333333333333335*xy^3.0+11.0*xy-4.0/xy^3.0-2.1666666666666665*xy^6.0+14.0*xy-2.5/xy^6.0-1.7777777777777777*xy^9.0+17.0*xy-2.0/xy^9.0-1.5833333333333333*xy^12.0+20.0*xy-1.75/xy^12.0-1.4666666666666666*xy^15.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-285.0/xy^96.0-384.0*xy^95.0-588.0/xy^99.0-693.0*xy^98.0-9.0/xy^2.0-20.0*xy-48.0/xy^5.0-65.0*xy^4.0-105.0/xy^8.0-128.0*xy^7.0-180.0/xy^11.0-209.0*xy^10.0-273.0/xy^14.0-308.0*xy^13.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-285.0*-96.0/xy^97.0-384.0*95.0*xy^94.0-588.0*-99.0/xy^100.0-693.0*98.0*xy^97.0-9.0*-2.0/xy^3.0-20.0-48.0*-5.0/xy^6.0-65.0*4.0*xy^3.0-105.0*-8.0/xy^9.0-128.0*7.0*xy^6.0-180.0*-11.0/xy^12.0-209.0*10.0*xy^9.0-273.0*-14.0/xy^15.0-308.0*13.0*xy^12.0";
 UsageCalculus.EqnSolArrayMap2[2] = "27360.0/xy^97.0-36480.0*xy^94.0+58212.0/xy^100.0-67914.0*xy^97.0+18.0/xy^3.0-20.0+240.0/xy^6.0-260.0*xy^3.0+840.0/xy^9.0-896.0*xy^6.0+1980.0/xy^12.0-2090.0*xy^9.0+3822.0/xy^15.0-4004.0*xy^12.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/31.333333333333332/xy^94.0-1.0/24.25*xy^97.0+5.0*xy-1.0/16.166666666666668/xy^97.0-1.0/14.285714285714286*xy^100.0+8.0*xy+9.0*ln(xy)-3.3333333333333335*xy^3.0+11.0*xy-4.0/xy^3.0-2.1666666666666665*xy^6.0+14.0*xy-2.5/xy^6.0-1.7777777777777777*xy^9.0+17.0*xy-2.0/xy^9.0-1.5833333333333333*xy^12.0+20.0*xy-1.75/xy^12.0-1.4666666666666666*xy^15.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/31.333333333333332/-93.0/xy^93.0-1.0/24.25/98.0*xy^98.0+5.0/2.0*xy^2.0-1.0/16.166666666666668/-96.0/xy^96.0-1.0/14.285714285714286/101.0*xy^101.0+8.0/2.0*xy^2.0+9.0*xy-3.3333333333333335/4.0*xy^4.0+11.0/2.0*xy^2.0-4.0/-2.0/xy^2.0-2.1666666666666665/7.0*xy^7.0+14.0/2.0*xy^2.0-2.5/-5.0/xy^5.0-1.7777777777777777/10.0*xy^10.0+17.0/2.0*xy^2.0-2.0/-8.0/xy^8.0-1.5833333333333333/13.0*xy^13.0+20.0/2.0*xy^2.0-1.75/-11.0/xy^11.0-1.4666666666666666/16.0*xy^16.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/2914.0/xy^93.0-1.0/2376.5*xy^98.0+2.5*xy^2.0+1.0/1552.0/xy^96.0-1.0/1442.857142857143*xy^101.0+4.0*xy^2.0+9.0*xy-1.0/1.2*xy^4.0+5.5*xy^2.0+2.0/xy^2.0-1.0/3.230769230769231*xy^7.0+7.0*xy^2.0+1.0/2.0/xy^5.0-1.0/5.625*xy^10.0+8.5*xy^2.0+1.0/4.0/xy^8.0-1.0/8.210526315789474*xy^13.0+10.0*xy^2.0+1.0/6.285714285714286/xy^11.0-1.0/10.90909090909091*xy^16.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "27360.0/xy^97.0-36480.0*xy^94.0+58212.0/xy^100.0-67914.0*xy^97.0+18.0/xy^3.0-20.0+240.0/xy^6.0-260.0*xy^3.0+840.0/xy^9.0-896.0*xy^6.0+1980.0/xy^12.0-2090.0*xy^9.0+3822.0/xy^15.0-4004.0*xy^12.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "27360.0*-97.0/xy^98.0-36480.0*94.0*xy^93.0+58212.0*-100.0/xy^101.0-67914.0*97.0*xy^96.0+18.0*-3.0/xy^4.0-20.0*0.0+240.0*-6.0/xy^7.0-260.0*3.0*xy^2.0+840.0*-9.0/xy^10.0-896.0*6.0*xy^5.0+1980.0*-12.0/xy^13.0-2090.0*9.0*xy^8.0+3822.0*-15.0/xy^16.0-4004.0*12.0*xy^11.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-2653920.0/xy^98.0-3429120.0*xy^93.0-5821200.0/xy^101.0-6587658.0*xy^96.0-54.0/xy^4.0-1440.0/xy^7.0-780.0*xy^2.0-7560.0/xy^10.0-5376.0*xy^5.0-23760.0/xy^13.0-18810.0*xy^8.0-57330.0/xy^16.0-48048.0*xy^11.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/2914.0/xy^93.0-1.0/2376.5*xy^98.0+2.5*xy^2.0+1.0/1552.0/xy^96.0-1.0/1442.857142857143*xy^101.0+4.0*xy^2.0+9.0*xy-1.0/1.2*xy^4.0+5.5*xy^2.0+2.0/xy^2.0-1.0/3.230769230769231*xy^7.0+7.0*xy^2.0+1.0/2.0/xy^5.0-1.0/5.625*xy^10.0+8.5*xy^2.0+1.0/4.0/xy^8.0-1.0/8.210526315789474*xy^13.0+10.0*xy^2.0+1.0/6.285714285714286/xy^11.0-1.0/10.90909090909091*xy^16.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/2914.0/-92.0/xy^92.0-1.0/2376.5/99.0*xy^99.0+2.5/3.0*xy^3.0+1.0/1552.0/-95.0/xy^95.0-1.0/1442.857142857143/102.0*xy^102.0+4.0/3.0*xy^3.0+9.0/2.0*xy^2.0-1.0/1.2/5.0*xy^5.0+5.5/3.0*xy^3.0+2.0/-1.0/xy^1.0-1.0/3.230769230769231/8.0*xy^8.0+7.0/3.0*xy^3.0+1.0/2.0/-4.0/xy^4.0-1.0/5.625/11.0*xy^11.0+8.5/3.0*xy^3.0+1.0/4.0/-7.0/xy^7.0-1.0/8.210526315789474/14.0*xy^14.0+10.0/3.0*xy^3.0+1.0/6.285714285714286/-10.0/xy^10.0-1.0/10.90909090909091/17.0*xy^17.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/268088.0/xy^92.0-1.0/235273.5*xy^99.0+1.0/1.2*xy^3.0-1.0/147440.0/xy^95.0-1.0/147171.42857142858*xy^102.0+1.3333333333333333*xy^3.0+4.5*xy^2.0-1.0/6.0*xy^5.0+1.8333333333333333*xy^3.0-2.0/xy-1.0/25.846153846153847*xy^8.0+2.3333333333333335*xy^3.0-1.0/8.0/xy^4.0-1.0/61.875*xy^11.0+2.8333333333333335*xy^3.0-1.0/28.0/xy^7.0-1.0/114.94736842105264*xy^14.0+3.3333333333333335*xy^3.0-1.0/62.857142857142854/xy^10.0-1.0/185.45454545454547*xy^17.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-2653920.0/xy^98.0-3429120.0*xy^93.0-5821200.0/xy^101.0-6587658.0*xy^96.0-54.0/xy^4.0-1440.0/xy^7.0-780.0*xy^2.0-7560.0/xy^10.0-5376.0*xy^5.0-23760.0/xy^13.0-18810.0*xy^8.0-57330.0/xy^16.0-48048.0*xy^11.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-2653920.0*-98.0/xy^99.0-3429120.0*93.0*xy^92.0-5821200.0*-101.0/xy^102.0-6587658.0*96.0*xy^95.0-54.0*-4.0/xy^5.0-1440.0*-7.0/xy^8.0-780.0*2.0*xy^1.0-7560.0*-10.0/xy^11.0-5376.0*5.0*xy^4.0-23760.0*-13.0/xy^14.0-18810.0*8.0*xy^7.0-57330.0*-16.0/xy^17.0-48048.0*11.0*xy^10.0";
 UsageCalculus.EqnSolArrayMap2[4] = "2.6008416E8/xy^99.0-3.1890816E8*xy^92.0+5.879412E8/xy^102.0-6.32415168E8*xy^95.0+216.0/xy^5.0+10080.0/xy^8.0-1560.0*xy+75600.0/xy^11.0-26880.0*xy^4.0+308880.0/xy^14.0-150480.0*xy^7.0+917280.0/xy^17.0-528528.0*xy^10.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/268088.0/xy^92.0-1.0/235273.5*xy^99.0+1.0/1.2*xy^3.0-1.0/147440.0/xy^95.0-1.0/147171.42857142858*xy^102.0+1.3333333333333333*xy^3.0+4.5*xy^2.0-1.0/6.0*xy^5.0+1.8333333333333333*xy^3.0-2.0/xy-1.0/25.846153846153847*xy^8.0+2.3333333333333335*xy^3.0-1.0/8.0/xy^4.0-1.0/61.875*xy^11.0+2.8333333333333335*xy^3.0-1.0/28.0/xy^7.0-1.0/114.94736842105264*xy^14.0+3.3333333333333335*xy^3.0-1.0/62.857142857142854/xy^10.0-1.0/185.45454545454547*xy^17.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/268088.0/-91.0/xy^91.0-1.0/235273.5/100.0*xy^100.0+1.0/1.2/4.0*xy^4.0-1.0/147440.0/-94.0/xy^94.0-1.0/147171.42857142858/103.0*xy^103.0+1.3333333333333333/4.0*xy^4.0+4.5/3.0*xy^3.0-1.0/6.0/6.0*xy^6.0+1.8333333333333333/4.0*xy^4.0-2.0*ln(xy)-1.0/25.846153846153847/9.0*xy^9.0+2.3333333333333335/4.0*xy^4.0-1.0/8.0/-3.0/xy^3.0-1.0/61.875/12.0*xy^12.0+2.8333333333333335/4.0*xy^4.0-1.0/28.0/-6.0/xy^6.0-1.0/114.94736842105264/15.0*xy^15.0+3.3333333333333335/4.0*xy^4.0-1.0/62.857142857142854/-9.0/xy^9.0-1.0/185.45454545454547/18.0*xy^18.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/2.4396008E7/xy^91.0-1.0/2.352735E7*xy^100.0+1.0/4.8*xy^4.0+1.0/1.385936E7/xy^94.0-1.0/1.5158657142857144E7*xy^103.0+1.0/3.0*xy^4.0+1.5*xy^3.0-1.0/36.0*xy^6.0+1.0/2.181818181818182*xy^4.0-2.0*ln(xy)-1.0/232.6153846153846*xy^9.0+1.0/1.7142857142857142*xy^4.0+1.0/24.0/xy^3.0-1.0/742.5*xy^12.0+1.0/1.4117647058823528*xy^4.0+1.0/168.0/xy^6.0-1.0/1724.2105263157896*xy^15.0+1.0/1.2*xy^4.0+1.0/565.7142857142857/xy^9.0-1.0/3338.1818181818185*xy^18.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120572() {
 UsageCalculus.TestCase = 120572;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+5*xyzxy^-97+6/x^98";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "5.0+6.0/x^98.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+6.0*-98.0/x^99.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-588.0/x^99.0";
 UsageCalculus.EqnSolArrayMap3[1] = "5.0+6.0/x^98.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "5.0*x+6.0/-97.0/x^97.0";
 UsageCalculus.EqnSolArrayMap4[1] = "5.0*x-1.0/16.166666666666668/x^97.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-588.0/x^99.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-588.0*-99.0/x^100.0";
 UsageCalculus.EqnSolArrayMap2[2] = "58212.0/x^100.0";
 UsageCalculus.EqnSolArrayMap3[2] = "5.0*x-1.0/16.166666666666668/x^97.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "5.0/2.0*x^2.0-1.0/16.166666666666668/-96.0/x^96.0";
 UsageCalculus.EqnSolArrayMap4[2] = "2.5*x^2.0+1.0/1552.0/x^96.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "58212.0/x^100.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "58212.0*-100.0/x^101.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-5821200.0/x^101.0";
 UsageCalculus.EqnSolArrayMap3[3] = "2.5*x^2.0+1.0/1552.0/x^96.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "2.5/3.0*x^3.0+1.0/1552.0/-95.0/x^95.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/1.2*x^3.0-1.0/147440.0/x^95.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-5821200.0/x^101.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-5821200.0*-101.0/x^102.0";
 UsageCalculus.EqnSolArrayMap2[4] = "5.879412E8/x^102.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/1.2*x^3.0-1.0/147440.0/x^95.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/1.2/4.0*x^4.0-1.0/147440.0/-94.0/x^94.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/4.8*x^4.0+1.0/1.385936E7/x^94.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120573() {
 UsageCalculus.TestCase = 120573;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+6-7+8*xyzxyzxy^-100";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "6.0-7.0+8.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0-7.0*0.0+8.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "6.0-7.0+8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "6.0*x-7.0*x+8.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "6.0*x-7.0*x+8.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "6.0*x-7.0*x+8.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "6.0/2.0*x^2.0-7.0/2.0*x^2.0+8.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "3.0*x^2.0-3.5*x^2.0+4.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "3.0*x^2.0-3.5*x^2.0+4.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "3.0/3.0*x^3.0-3.5/3.0*x^3.0+4.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x^3.0-1.1666666666666667*x^3.0+1.3333333333333333*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "x^3.0-1.1666666666666667*x^3.0+1.3333333333333333*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/4.0*x^4.0-1.1666666666666667/4.0*x^4.0+1.3333333333333333/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/4.0*x^4.0-1.0/3.4285714285714284*x^4.0+1.0/3.0*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120574() {
 UsageCalculus.TestCase = 120574;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-7*x^99+8*xyzxyzxy^-100+9/x^1-10*x^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-7.0*x^99.0+8.0+9.0/x-10.0*x^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-7.0*99.0*x^98.0+8.0*0.0-9.0/x^2.0-10.0*2.0*x^1.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-693.0*x^98.0-9.0/x^2.0-20.0*x";
 UsageCalculus.EqnSolArrayMap3[1] = "-7.0*x^99.0+8.0+9.0/x-10.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-7.0/100.0*x^100.0+8.0*x+9.0*ln(x)-10.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/14.285714285714286*x^100.0+8.0*x+9.0*ln(x)-3.3333333333333335*x^3.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-693.0*x^98.0-9.0/x^2.0-20.0*x";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-693.0*98.0*x^97.0-9.0*-2.0/x^3.0-20.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-67914.0*x^97.0+18.0/x^3.0-20.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/14.285714285714286*x^100.0+8.0*x+9.0*ln(x)-3.3333333333333335*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/14.285714285714286/101.0*x^101.0+8.0/2.0*x^2.0+9.0*x-3.3333333333333335/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/1442.857142857143*x^101.0+4.0*x^2.0+9.0*x-1.0/1.2*x^4.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-67914.0*x^97.0+18.0/x^3.0-20.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-67914.0*97.0*x^96.0+18.0*-3.0/x^4.0-20.0*0.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-6587658.0*x^96.0-54.0/x^4.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/1442.857142857143*x^101.0+4.0*x^2.0+9.0*x-1.0/1.2*x^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/1442.857142857143/102.0*x^102.0+4.0/3.0*x^3.0+9.0/2.0*x^2.0-1.0/1.2/5.0*x^5.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/147171.42857142858*x^102.0+1.3333333333333333*x^3.0+4.5*x^2.0-1.0/6.0*x^5.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-6587658.0*x^96.0-54.0/x^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-6587658.0*96.0*x^95.0-54.0*-4.0/x^5.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-6.32415168E8*x^95.0+216.0/x^5.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/147171.42857142858*x^102.0+1.3333333333333333*x^3.0+4.5*x^2.0-1.0/6.0*x^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/147171.42857142858/103.0*x^103.0+1.3333333333333333/4.0*x^4.0+4.5/3.0*x^3.0-1.0/6.0/6.0*x^6.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/1.5158657142857144E7*x^103.0+1.0/3.0*x^4.0+1.5*x^3.0-1.0/36.0*x^6.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120575() {
 UsageCalculus.TestCase = 120575;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+8*xyzxyzxy^-100+9/xy^1-10*xy^2+11+12/xy^4";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "8.0+9.0/xy-10.0*xy^2.0+11.0+12.0/xy^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0-9.0/xy^2.0-10.0*2.0*xy^1.0+11.0*0.0+12.0*-4.0/xy^5.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-9.0/xy^2.0-20.0*xy-48.0/xy^5.0";
 UsageCalculus.EqnSolArrayMap3[1] = "8.0+9.0/xy-10.0*xy^2.0+11.0+12.0/xy^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "8.0*xy+9.0*ln(xy)-10.0/3.0*xy^3.0+11.0*xy+12.0/-3.0/xy^3.0";
 UsageCalculus.EqnSolArrayMap4[1] = "8.0*xy+9.0*ln(xy)-3.3333333333333335*xy^3.0+11.0*xy-4.0/xy^3.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-9.0/xy^2.0-20.0*xy-48.0/xy^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-9.0*-2.0/xy^3.0-20.0-48.0*-5.0/xy^6.0";
 UsageCalculus.EqnSolArrayMap2[2] = "18.0/xy^3.0-20.0+240.0/xy^6.0";
 UsageCalculus.EqnSolArrayMap3[2] = "8.0*xy+9.0*ln(xy)-3.3333333333333335*xy^3.0+11.0*xy-4.0/xy^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "8.0/2.0*xy^2.0+9.0*xy-3.3333333333333335/4.0*xy^4.0+11.0/2.0*xy^2.0-4.0/-2.0/xy^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "4.0*xy^2.0+9.0*xy-1.0/1.2*xy^4.0+5.5*xy^2.0+2.0/xy^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "18.0/xy^3.0-20.0+240.0/xy^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "18.0*-3.0/xy^4.0-20.0*0.0+240.0*-6.0/xy^7.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-54.0/xy^4.0-1440.0/xy^7.0";
 UsageCalculus.EqnSolArrayMap3[3] = "4.0*xy^2.0+9.0*xy-1.0/1.2*xy^4.0+5.5*xy^2.0+2.0/xy^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "4.0/3.0*xy^3.0+9.0/2.0*xy^2.0-1.0/1.2/5.0*xy^5.0+5.5/3.0*xy^3.0+2.0/-1.0/xy^1.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.3333333333333333*xy^3.0+4.5*xy^2.0-1.0/6.0*xy^5.0+1.8333333333333333*xy^3.0-2.0/xy";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-54.0/xy^4.0-1440.0/xy^7.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-54.0*-4.0/xy^5.0-1440.0*-7.0/xy^8.0";
 UsageCalculus.EqnSolArrayMap2[4] = "216.0/xy^5.0+10080.0/xy^8.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.3333333333333333*xy^3.0+4.5*xy^2.0-1.0/6.0*xy^5.0+1.8333333333333333*xy^3.0-2.0/xy";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.3333333333333333/4.0*xy^4.0+4.5/3.0*xy^3.0-1.0/6.0/6.0*xy^6.0+1.8333333333333333/4.0*xy^4.0-2.0*ln(xy)";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/3.0*xy^4.0+1.5*xy^3.0-1.0/36.0*xy^6.0+1.0/2.181818181818182*xy^4.0-2.0*ln(xy)";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120576() {
 UsageCalculus.TestCase = 120576;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+9/x^1-10*x^2+11+12/x^4-13*x^5+14";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "9.0/x-10.0*x^2.0+11.0+12.0/x^4.0-13.0*x^5.0+14.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-9.0/x^2.0-10.0*2.0*x^1.0+11.0*0.0+12.0*-4.0/x^5.0-13.0*5.0*x^4.0+14.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-9.0/x^2.0-20.0*x-48.0/x^5.0-65.0*x^4.0";
 UsageCalculus.EqnSolArrayMap3[1] = "9.0/x-10.0*x^2.0+11.0+12.0/x^4.0-13.0*x^5.0+14.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "9.0*ln(x)-10.0/3.0*x^3.0+11.0*x+12.0/-3.0/x^3.0-13.0/6.0*x^6.0+14.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "9.0*ln(x)-3.3333333333333335*x^3.0+11.0*x-4.0/x^3.0-2.1666666666666665*x^6.0+14.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-9.0/x^2.0-20.0*x-48.0/x^5.0-65.0*x^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-9.0*-2.0/x^3.0-20.0-48.0*-5.0/x^6.0-65.0*4.0*x^3.0";
 UsageCalculus.EqnSolArrayMap2[2] = "18.0/x^3.0-20.0+240.0/x^6.0-260.0*x^3.0";
 UsageCalculus.EqnSolArrayMap3[2] = "9.0*ln(x)-3.3333333333333335*x^3.0+11.0*x-4.0/x^3.0-2.1666666666666665*x^6.0+14.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "9.0-3.3333333333333335/4.0*x^4.0+11.0/2.0*x^2.0-4.0/-2.0/x^2.0-2.1666666666666665/7.0*x^7.0+14.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "9.0-1.0/1.2*x^4.0+5.5*x^2.0+2.0/x^2.0-1.0/3.230769230769231*x^7.0+7.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "18.0/x^3.0-20.0+240.0/x^6.0-260.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "18.0*-3.0/x^4.0-20.0*0.0+240.0*-6.0/x^7.0-260.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-54.0/x^4.0-1440.0/x^7.0-780.0*x^2.0";
 UsageCalculus.EqnSolArrayMap3[3] = "9.0-1.0/1.2*x^4.0+5.5*x^2.0+2.0/x^2.0-1.0/3.230769230769231*x^7.0+7.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "9.0*x-1.0/1.2/5.0*x^5.0+5.5/3.0*x^3.0+2.0/-1.0/x^1.0-1.0/3.230769230769231/8.0*x^8.0+7.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "9.0*x-1.0/6.0*x^5.0+1.8333333333333333*x^3.0-2.0/x-1.0/25.846153846153847*x^8.0+2.3333333333333335*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-54.0/x^4.0-1440.0/x^7.0-780.0*x^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-54.0*-4.0/x^5.0-1440.0*-7.0/x^8.0-780.0*2.0*x^1.0";
 UsageCalculus.EqnSolArrayMap2[4] = "216.0/x^5.0+10080.0/x^8.0-1560.0*x";
 UsageCalculus.EqnSolArrayMap3[4] = "9.0*x-1.0/6.0*x^5.0+1.8333333333333333*x^3.0-2.0/x-1.0/25.846153846153847*x^8.0+2.3333333333333335*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "9.0/2.0*x^2.0-1.0/6.0/6.0*x^6.0+1.8333333333333333/4.0*x^4.0-2.0*ln(x)-1.0/25.846153846153847/9.0*x^9.0+2.3333333333333335/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "4.5*x^2.0-1.0/36.0*x^6.0+1.0/2.181818181818182*x^4.0-2.0*ln(x)-1.0/232.6153846153846*x^9.0+1.0/1.7142857142857142*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120577() {
 UsageCalculus.TestCase = 120577;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-10*xyzxy^2+11+12/xyzxy^4-13*xyzxy^5+14+15/xyzxy^7-16*xyzxy^8";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyzxy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-10.0*xyzxy^2.0+11.0+12.0/xyzxy^4.0-13.0*xyzxy^5.0+14.0+15.0/xyzxy^7.0-16.0*xyzxy^8.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-10.0*2.0*xyzxy^1.0+11.0*0.0+12.0*-4.0/xyzxy^5.0-13.0*5.0*xyzxy^4.0+14.0*0.0+15.0*-7.0/xyzxy^8.0-16.0*8.0*xyzxy^7.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-20.0*xyzxy-48.0/xyzxy^5.0-65.0*xyzxy^4.0-105.0/xyzxy^8.0-128.0*xyzxy^7.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-10.0*xyzxy^2.0+11.0+12.0/xyzxy^4.0-13.0*xyzxy^5.0+14.0+15.0/xyzxy^7.0-16.0*xyzxy^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-10.0/3.0*xyzxy^3.0+11.0*xyzxy+12.0/-3.0/xyzxy^3.0-13.0/6.0*xyzxy^6.0+14.0*xyzxy+15.0/-6.0/xyzxy^6.0-16.0/9.0*xyzxy^9.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-3.3333333333333335*xyzxy^3.0+11.0*xyzxy-4.0/xyzxy^3.0-2.1666666666666665*xyzxy^6.0+14.0*xyzxy-2.5/xyzxy^6.0-1.7777777777777777*xyzxy^9.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-20.0*xyzxy-48.0/xyzxy^5.0-65.0*xyzxy^4.0-105.0/xyzxy^8.0-128.0*xyzxy^7.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-20.0-48.0*-5.0/xyzxy^6.0-65.0*4.0*xyzxy^3.0-105.0*-8.0/xyzxy^9.0-128.0*7.0*xyzxy^6.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-20.0+240.0/xyzxy^6.0-260.0*xyzxy^3.0+840.0/xyzxy^9.0-896.0*xyzxy^6.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-3.3333333333333335*xyzxy^3.0+11.0*xyzxy-4.0/xyzxy^3.0-2.1666666666666665*xyzxy^6.0+14.0*xyzxy-2.5/xyzxy^6.0-1.7777777777777777*xyzxy^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-3.3333333333333335/4.0*xyzxy^4.0+11.0/2.0*xyzxy^2.0-4.0/-2.0/xyzxy^2.0-2.1666666666666665/7.0*xyzxy^7.0+14.0/2.0*xyzxy^2.0-2.5/-5.0/xyzxy^5.0-1.7777777777777777/10.0*xyzxy^10.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/1.2*xyzxy^4.0+5.5*xyzxy^2.0+2.0/xyzxy^2.0-1.0/3.230769230769231*xyzxy^7.0+7.0*xyzxy^2.0+1.0/2.0/xyzxy^5.0-1.0/5.625*xyzxy^10.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-20.0+240.0/xyzxy^6.0-260.0*xyzxy^3.0+840.0/xyzxy^9.0-896.0*xyzxy^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-0.0+240.0*-6.0/xyzxy^7.0-260.0*3.0*xyzxy^2.0+840.0*-9.0/xyzxy^10.0-896.0*6.0*xyzxy^5.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-1440.0/xyzxy^7.0-780.0*xyzxy^2.0-7560.0/xyzxy^10.0-5376.0*xyzxy^5.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/1.2*xyzxy^4.0+5.5*xyzxy^2.0+2.0/xyzxy^2.0-1.0/3.230769230769231*xyzxy^7.0+7.0*xyzxy^2.0+1.0/2.0/xyzxy^5.0-1.0/5.625*xyzxy^10.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/1.2/5.0*xyzxy^5.0+5.5/3.0*xyzxy^3.0+2.0/-1.0/xyzxy^1.0-1.0/3.230769230769231/8.0*xyzxy^8.0+7.0/3.0*xyzxy^3.0+1.0/2.0/-4.0/xyzxy^4.0-1.0/5.625/11.0*xyzxy^11.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/6.0*xyzxy^5.0+1.8333333333333333*xyzxy^3.0-2.0/xyzxy-1.0/25.846153846153847*xyzxy^8.0+2.3333333333333335*xyzxy^3.0-1.0/8.0/xyzxy^4.0-1.0/61.875*xyzxy^11.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-1440.0/xyzxy^7.0-780.0*xyzxy^2.0-7560.0/xyzxy^10.0-5376.0*xyzxy^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-1440.0*-7.0/xyzxy^8.0-780.0*2.0*xyzxy^1.0-7560.0*-10.0/xyzxy^11.0-5376.0*5.0*xyzxy^4.0";
 UsageCalculus.EqnSolArrayMap2[4] = "10080.0/xyzxy^8.0-1560.0*xyzxy+75600.0/xyzxy^11.0-26880.0*xyzxy^4.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/6.0*xyzxy^5.0+1.8333333333333333*xyzxy^3.0-2.0/xyzxy-1.0/25.846153846153847*xyzxy^8.0+2.3333333333333335*xyzxy^3.0-1.0/8.0/xyzxy^4.0-1.0/61.875*xyzxy^11.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/6.0/6.0*xyzxy^6.0+1.8333333333333333/4.0*xyzxy^4.0-2.0*ln(xyzxy)-1.0/25.846153846153847/9.0*xyzxy^9.0+2.3333333333333335/4.0*xyzxy^4.0-1.0/8.0/-3.0/xyzxy^3.0-1.0/61.875/12.0*xyzxy^12.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/36.0*xyzxy^6.0+1.0/2.181818181818182*xyzxy^4.0-2.0*ln(xyzxy)-1.0/232.6153846153846*xyzxy^9.0+1.0/1.7142857142857142*xyzxy^4.0+1.0/24.0/xyzxy^3.0-1.0/742.5*xyzxy^12.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120578() {
 UsageCalculus.TestCase = 120578;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+11+12/x^4-13*x^5+14+15/x^7-16*x^8+17*xyzxyzxyzxyzxyzxy^-9+18/x^10";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "11.0+12.0/x^4.0-13.0*x^5.0+14.0+15.0/x^7.0-16.0*x^8.0+17.0+18.0/x^10.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+12.0*-4.0/x^5.0-13.0*5.0*x^4.0+14.0*0.0+15.0*-7.0/x^8.0-16.0*8.0*x^7.0+17.0*0.0+18.0*-10.0/x^11.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-48.0/x^5.0-65.0*x^4.0-105.0/x^8.0-128.0*x^7.0-180.0/x^11.0";
 UsageCalculus.EqnSolArrayMap3[1] = "11.0+12.0/x^4.0-13.0*x^5.0+14.0+15.0/x^7.0-16.0*x^8.0+17.0+18.0/x^10.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "11.0*x+12.0/-3.0/x^3.0-13.0/6.0*x^6.0+14.0*x+15.0/-6.0/x^6.0-16.0/9.0*x^9.0+17.0*x+18.0/-9.0/x^9.0";
 UsageCalculus.EqnSolArrayMap4[1] = "11.0*x-4.0/x^3.0-2.1666666666666665*x^6.0+14.0*x-2.5/x^6.0-1.7777777777777777*x^9.0+17.0*x-2.0/x^9.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-48.0/x^5.0-65.0*x^4.0-105.0/x^8.0-128.0*x^7.0-180.0/x^11.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-48.0*-5.0/x^6.0-65.0*4.0*x^3.0-105.0*-8.0/x^9.0-128.0*7.0*x^6.0-180.0*-11.0/x^12.0";
 UsageCalculus.EqnSolArrayMap2[2] = "240.0/x^6.0-260.0*x^3.0+840.0/x^9.0-896.0*x^6.0+1980.0/x^12.0";
 UsageCalculus.EqnSolArrayMap3[2] = "11.0*x-4.0/x^3.0-2.1666666666666665*x^6.0+14.0*x-2.5/x^6.0-1.7777777777777777*x^9.0+17.0*x-2.0/x^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "11.0/2.0*x^2.0-4.0/-2.0/x^2.0-2.1666666666666665/7.0*x^7.0+14.0/2.0*x^2.0-2.5/-5.0/x^5.0-1.7777777777777777/10.0*x^10.0+17.0/2.0*x^2.0-2.0/-8.0/x^8.0";
 UsageCalculus.EqnSolArrayMap4[2] = "5.5*x^2.0+2.0/x^2.0-1.0/3.230769230769231*x^7.0+7.0*x^2.0+1.0/2.0/x^5.0-1.0/5.625*x^10.0+8.5*x^2.0+1.0/4.0/x^8.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "240.0/x^6.0-260.0*x^3.0+840.0/x^9.0-896.0*x^6.0+1980.0/x^12.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "240.0*-6.0/x^7.0-260.0*3.0*x^2.0+840.0*-9.0/x^10.0-896.0*6.0*x^5.0+1980.0*-12.0/x^13.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-1440.0/x^7.0-780.0*x^2.0-7560.0/x^10.0-5376.0*x^5.0-23760.0/x^13.0";
 UsageCalculus.EqnSolArrayMap3[3] = "5.5*x^2.0+2.0/x^2.0-1.0/3.230769230769231*x^7.0+7.0*x^2.0+1.0/2.0/x^5.0-1.0/5.625*x^10.0+8.5*x^2.0+1.0/4.0/x^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "5.5/3.0*x^3.0+2.0/-1.0/x^1.0-1.0/3.230769230769231/8.0*x^8.0+7.0/3.0*x^3.0+1.0/2.0/-4.0/x^4.0-1.0/5.625/11.0*x^11.0+8.5/3.0*x^3.0+1.0/4.0/-7.0/x^7.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.8333333333333333*x^3.0-2.0/x-1.0/25.846153846153847*x^8.0+2.3333333333333335*x^3.0-1.0/8.0/x^4.0-1.0/61.875*x^11.0+2.8333333333333335*x^3.0-1.0/28.0/x^7.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-1440.0/x^7.0-780.0*x^2.0-7560.0/x^10.0-5376.0*x^5.0-23760.0/x^13.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-1440.0*-7.0/x^8.0-780.0*2.0*x^1.0-7560.0*-10.0/x^11.0-5376.0*5.0*x^4.0-23760.0*-13.0/x^14.0";
 UsageCalculus.EqnSolArrayMap2[4] = "10080.0/x^8.0-1560.0*x+75600.0/x^11.0-26880.0*x^4.0+308880.0/x^14.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.8333333333333333*x^3.0-2.0/x-1.0/25.846153846153847*x^8.0+2.3333333333333335*x^3.0-1.0/8.0/x^4.0-1.0/61.875*x^11.0+2.8333333333333335*x^3.0-1.0/28.0/x^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.8333333333333333/4.0*x^4.0-2.0*ln(x)-1.0/25.846153846153847/9.0*x^9.0+2.3333333333333335/4.0*x^4.0-1.0/8.0/-3.0/x^3.0-1.0/61.875/12.0*x^12.0+2.8333333333333335/4.0*x^4.0-1.0/28.0/-6.0/x^6.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/2.181818181818182*x^4.0-2.0*ln(x)-1.0/232.6153846153846*x^9.0+1.0/1.7142857142857142*x^4.0+1.0/24.0/x^3.0-1.0/742.5*x^12.0+1.0/1.4117647058823528*x^4.0+1.0/168.0/x^6.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120579() {
 UsageCalculus.TestCase = 120579;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+12/x^4-13*x^5+14+15/x^7-16*x^8+17*xyzxyzxyzxyzxyzxy^-9+18/x^10-19*x^11+20*xyzxyzxyzxyzxyzxyzxy^-12";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "12.0/x^4.0-13.0*x^5.0+14.0+15.0/x^7.0-16.0*x^8.0+17.0+18.0/x^10.0-19.0*x^11.0+20.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "12.0*-4.0/x^5.0-13.0*5.0*x^4.0+14.0*0.0+15.0*-7.0/x^8.0-16.0*8.0*x^7.0+17.0*0.0+18.0*-10.0/x^11.0-19.0*11.0*x^10.0+20.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-48.0/x^5.0-65.0*x^4.0-105.0/x^8.0-128.0*x^7.0-180.0/x^11.0-209.0*x^10.0";
 UsageCalculus.EqnSolArrayMap3[1] = "12.0/x^4.0-13.0*x^5.0+14.0+15.0/x^7.0-16.0*x^8.0+17.0+18.0/x^10.0-19.0*x^11.0+20.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "12.0/-3.0/x^3.0-13.0/6.0*x^6.0+14.0*x+15.0/-6.0/x^6.0-16.0/9.0*x^9.0+17.0*x+18.0/-9.0/x^9.0-19.0/12.0*x^12.0+20.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "-4.0/x^3.0-2.1666666666666665*x^6.0+14.0*x-2.5/x^6.0-1.7777777777777777*x^9.0+17.0*x-2.0/x^9.0-1.5833333333333333*x^12.0+20.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-48.0/x^5.0-65.0*x^4.0-105.0/x^8.0-128.0*x^7.0-180.0/x^11.0-209.0*x^10.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-48.0*-5.0/x^6.0-65.0*4.0*x^3.0-105.0*-8.0/x^9.0-128.0*7.0*x^6.0-180.0*-11.0/x^12.0-209.0*10.0*x^9.0";
 UsageCalculus.EqnSolArrayMap2[2] = "240.0/x^6.0-260.0*x^3.0+840.0/x^9.0-896.0*x^6.0+1980.0/x^12.0-2090.0*x^9.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-4.0/x^3.0-2.1666666666666665*x^6.0+14.0*x-2.5/x^6.0-1.7777777777777777*x^9.0+17.0*x-2.0/x^9.0-1.5833333333333333*x^12.0+20.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-4.0/-2.0/x^2.0-2.1666666666666665/7.0*x^7.0+14.0/2.0*x^2.0-2.5/-5.0/x^5.0-1.7777777777777777/10.0*x^10.0+17.0/2.0*x^2.0-2.0/-8.0/x^8.0-1.5833333333333333/13.0*x^13.0+20.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "2.0/x^2.0-1.0/3.230769230769231*x^7.0+7.0*x^2.0+1.0/2.0/x^5.0-1.0/5.625*x^10.0+8.5*x^2.0+1.0/4.0/x^8.0-1.0/8.210526315789474*x^13.0+10.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "240.0/x^6.0-260.0*x^3.0+840.0/x^9.0-896.0*x^6.0+1980.0/x^12.0-2090.0*x^9.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "240.0*-6.0/x^7.0-260.0*3.0*x^2.0+840.0*-9.0/x^10.0-896.0*6.0*x^5.0+1980.0*-12.0/x^13.0-2090.0*9.0*x^8.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-1440.0/x^7.0-780.0*x^2.0-7560.0/x^10.0-5376.0*x^5.0-23760.0/x^13.0-18810.0*x^8.0";
 UsageCalculus.EqnSolArrayMap3[3] = "2.0/x^2.0-1.0/3.230769230769231*x^7.0+7.0*x^2.0+1.0/2.0/x^5.0-1.0/5.625*x^10.0+8.5*x^2.0+1.0/4.0/x^8.0-1.0/8.210526315789474*x^13.0+10.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "2.0/-1.0/x^1.0-1.0/3.230769230769231/8.0*x^8.0+7.0/3.0*x^3.0+1.0/2.0/-4.0/x^4.0-1.0/5.625/11.0*x^11.0+8.5/3.0*x^3.0+1.0/4.0/-7.0/x^7.0-1.0/8.210526315789474/14.0*x^14.0+10.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-2.0/x-1.0/25.846153846153847*x^8.0+2.3333333333333335*x^3.0-1.0/8.0/x^4.0-1.0/61.875*x^11.0+2.8333333333333335*x^3.0-1.0/28.0/x^7.0-1.0/114.94736842105264*x^14.0+3.3333333333333335*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-1440.0/x^7.0-780.0*x^2.0-7560.0/x^10.0-5376.0*x^5.0-23760.0/x^13.0-18810.0*x^8.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-1440.0*-7.0/x^8.0-780.0*2.0*x^1.0-7560.0*-10.0/x^11.0-5376.0*5.0*x^4.0-23760.0*-13.0/x^14.0-18810.0*8.0*x^7.0";
 UsageCalculus.EqnSolArrayMap2[4] = "10080.0/x^8.0-1560.0*x+75600.0/x^11.0-26880.0*x^4.0+308880.0/x^14.0-150480.0*x^7.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-2.0/x-1.0/25.846153846153847*x^8.0+2.3333333333333335*x^3.0-1.0/8.0/x^4.0-1.0/61.875*x^11.0+2.8333333333333335*x^3.0-1.0/28.0/x^7.0-1.0/114.94736842105264*x^14.0+3.3333333333333335*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-2.0*ln(x)-1.0/25.846153846153847/9.0*x^9.0+2.3333333333333335/4.0*x^4.0-1.0/8.0/-3.0/x^3.0-1.0/61.875/12.0*x^12.0+2.8333333333333335/4.0*x^4.0-1.0/28.0/-6.0/x^6.0-1.0/114.94736842105264/15.0*x^15.0+3.3333333333333335/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-2.0*ln(x)-1.0/232.6153846153846*x^9.0+1.0/1.7142857142857142*x^4.0+1.0/24.0/x^3.0-1.0/742.5*x^12.0+1.0/1.4117647058823528*x^4.0+1.0/168.0/x^6.0-1.0/1724.2105263157896*x^15.0+1.0/1.2*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120580() {
 UsageCalculus.TestCase = 120580;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+13*xyzxyzxyzxyzx^5-14/x^6+15*x^7+16-17*x^9+18*xyzxyzxyzxyzxyzxyz^-10+19/x^11-20*x^12+21+22/x^14";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "13.0-14.0/x^6.0+15.0*x^7.0+16.0-17.0*x^9.0+18.0+19.0/x^11.0-20.0*x^12.0+21.0+22.0/x^14.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0-14.0*-6.0/x^7.0+15.0*7.0*x^6.0+16.0*0.0-17.0*9.0*x^8.0+18.0*0.0+19.0*-11.0/x^12.0-20.0*12.0*x^11.0+21.0*0.0+22.0*-14.0/x^15.0";
 UsageCalculus.EqnSolArrayMap2[1] = "84.0/x^7.0+105.0*x^6.0-153.0*x^8.0-209.0/x^12.0-240.0*x^11.0-308.0/x^15.0";
 UsageCalculus.EqnSolArrayMap3[1] = "13.0-14.0/x^6.0+15.0*x^7.0+16.0-17.0*x^9.0+18.0+19.0/x^11.0-20.0*x^12.0+21.0+22.0/x^14.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "13.0*x-14.0/-5.0/x^5.0+15.0/8.0*x^8.0+16.0*x-17.0/10.0*x^10.0+18.0*x+19.0/-10.0/x^10.0-20.0/13.0*x^13.0+21.0*x+22.0/-13.0/x^13.0";
 UsageCalculus.EqnSolArrayMap4[1] = "13.0*x+2.8/x^5.0+1.875*x^8.0+16.0*x-1.7*x^10.0+18.0*x-1.9/x^10.0-1.5384615384615385*x^13.0+21.0*x-1.6923076923076923/x^13.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "84.0/x^7.0+105.0*x^6.0-153.0*x^8.0-209.0/x^12.0-240.0*x^11.0-308.0/x^15.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "84.0*-7.0/x^8.0+105.0*6.0*x^5.0-153.0*8.0*x^7.0-209.0*-12.0/x^13.0-240.0*11.0*x^10.0-308.0*-15.0/x^16.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-588.0/x^8.0+630.0*x^5.0-1224.0*x^7.0+2508.0/x^13.0-2640.0*x^10.0+4620.0/x^16.0";
 UsageCalculus.EqnSolArrayMap3[2] = "13.0*x+2.8/x^5.0+1.875*x^8.0+16.0*x-1.7*x^10.0+18.0*x-1.9/x^10.0-1.5384615384615385*x^13.0+21.0*x-1.6923076923076923/x^13.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "13.0/2.0*x^2.0+2.8/-4.0/x^4.0+1.875/9.0*x^9.0+16.0/2.0*x^2.0-1.7/11.0*x^11.0+18.0/2.0*x^2.0-1.9/-9.0/x^9.0-1.5384615384615385/14.0*x^14.0+21.0/2.0*x^2.0-1.6923076923076923/-12.0/x^12.0";
 UsageCalculus.EqnSolArrayMap4[2] = "6.5*x^2.0-1.0/1.4285714285714286/x^4.0+1.0/4.8*x^9.0+8.0*x^2.0-1.0/6.470588235294118*x^11.0+9.0*x^2.0+1.0/4.736842105263158/x^9.0-1.0/9.1*x^14.0+10.5*x^2.0+1.0/7.090909090909091/x^12.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-588.0/x^8.0+630.0*x^5.0-1224.0*x^7.0+2508.0/x^13.0-2640.0*x^10.0+4620.0/x^16.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-588.0*-8.0/x^9.0+630.0*5.0*x^4.0-1224.0*7.0*x^6.0+2508.0*-13.0/x^14.0-2640.0*10.0*x^9.0+4620.0*-16.0/x^17.0";
 UsageCalculus.EqnSolArrayMap2[3] = "4704.0/x^9.0+3150.0*x^4.0-8568.0*x^6.0-32604.0/x^14.0-26400.0*x^9.0-73920.0/x^17.0";
 UsageCalculus.EqnSolArrayMap3[3] = "6.5*x^2.0-1.0/1.4285714285714286/x^4.0+1.0/4.8*x^9.0+8.0*x^2.0-1.0/6.470588235294118*x^11.0+9.0*x^2.0+1.0/4.736842105263158/x^9.0-1.0/9.1*x^14.0+10.5*x^2.0+1.0/7.090909090909091/x^12.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "6.5/3.0*x^3.0-1.0/1.4285714285714286/-3.0/x^3.0+1.0/4.8/10.0*x^10.0+8.0/3.0*x^3.0-1.0/6.470588235294118/12.0*x^12.0+9.0/3.0*x^3.0+1.0/4.736842105263158/-8.0/x^8.0-1.0/9.1/15.0*x^15.0+10.5/3.0*x^3.0+1.0/7.090909090909091/-11.0/x^11.0";
 UsageCalculus.EqnSolArrayMap4[3] = "2.1666666666666665*x^3.0+1.0/4.285714285714286/x^3.0+1.0/48.0*x^10.0+2.6666666666666665*x^3.0-1.0/77.64705882352942*x^12.0+3.0*x^3.0-1.0/37.89473684210527/x^8.0-1.0/136.5*x^15.0+3.5*x^3.0-1.0/78.0/x^11.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "4704.0/x^9.0+3150.0*x^4.0-8568.0*x^6.0-32604.0/x^14.0-26400.0*x^9.0-73920.0/x^17.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "4704.0*-9.0/x^10.0+3150.0*4.0*x^3.0-8568.0*6.0*x^5.0-32604.0*-14.0/x^15.0-26400.0*9.0*x^8.0-73920.0*-17.0/x^18.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-42336.0/x^10.0+12600.0*x^3.0-51408.0*x^5.0+456456.0/x^15.0-237600.0*x^8.0+1256640.0/x^18.0";
 UsageCalculus.EqnSolArrayMap3[4] = "2.1666666666666665*x^3.0+1.0/4.285714285714286/x^3.0+1.0/48.0*x^10.0+2.6666666666666665*x^3.0-1.0/77.64705882352942*x^12.0+3.0*x^3.0-1.0/37.89473684210527/x^8.0-1.0/136.5*x^15.0+3.5*x^3.0-1.0/78.0/x^11.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "2.1666666666666665/4.0*x^4.0+1.0/4.285714285714286/-2.0/x^2.0+1.0/48.0/11.0*x^11.0+2.6666666666666665/4.0*x^4.0-1.0/77.64705882352942/13.0*x^13.0+3.0/4.0*x^4.0-1.0/37.89473684210527/-7.0/x^7.0-1.0/136.5/16.0*x^16.0+3.5/4.0*x^4.0-1.0/78.0/-10.0/x^10.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/1.8461538461538463*x^4.0-1.0/8.571428571428571/x^2.0+1.0/528.0*x^11.0+1.0/1.5*x^4.0-1.0/1009.4117647058824*x^13.0+1.0/1.3333333333333333*x^4.0+1.0/265.2631578947369/x^7.0-1.0/2184.0*x^16.0+1.0/1.1428571428571428*x^4.0+1.0/780.0/x^10.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120581() {
 UsageCalculus.TestCase = 120581;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-14/x^6+15*x^7+16-17*x^9+18*xyzxyzxyzxyzxyzxyz^-10+19/x^11-20*x^12+21+22/x^14-23*x^15+24";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-14.0/x^6.0+15.0*x^7.0+16.0-17.0*x^9.0+18.0+19.0/x^11.0-20.0*x^12.0+21.0+22.0/x^14.0-23.0*x^15.0+24.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-14.0*-6.0/x^7.0+15.0*7.0*x^6.0+16.0*0.0-17.0*9.0*x^8.0+18.0*0.0+19.0*-11.0/x^12.0-20.0*12.0*x^11.0+21.0*0.0+22.0*-14.0/x^15.0-23.0*15.0*x^14.0+24.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "84.0/x^7.0+105.0*x^6.0-153.0*x^8.0-209.0/x^12.0-240.0*x^11.0-308.0/x^15.0-345.0*x^14.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-14.0/x^6.0+15.0*x^7.0+16.0-17.0*x^9.0+18.0+19.0/x^11.0-20.0*x^12.0+21.0+22.0/x^14.0-23.0*x^15.0+24.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-14.0/-5.0/x^5.0+15.0/8.0*x^8.0+16.0*x-17.0/10.0*x^10.0+18.0*x+19.0/-10.0/x^10.0-20.0/13.0*x^13.0+21.0*x+22.0/-13.0/x^13.0-23.0/16.0*x^16.0+24.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "2.8/x^5.0+1.875*x^8.0+16.0*x-1.7*x^10.0+18.0*x-1.9/x^10.0-1.5384615384615385*x^13.0+21.0*x-1.6923076923076923/x^13.0-1.4375*x^16.0+24.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "84.0/x^7.0+105.0*x^6.0-153.0*x^8.0-209.0/x^12.0-240.0*x^11.0-308.0/x^15.0-345.0*x^14.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "84.0*-7.0/x^8.0+105.0*6.0*x^5.0-153.0*8.0*x^7.0-209.0*-12.0/x^13.0-240.0*11.0*x^10.0-308.0*-15.0/x^16.0-345.0*14.0*x^13.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-588.0/x^8.0+630.0*x^5.0-1224.0*x^7.0+2508.0/x^13.0-2640.0*x^10.0+4620.0/x^16.0-4830.0*x^13.0";
 UsageCalculus.EqnSolArrayMap3[2] = "2.8/x^5.0+1.875*x^8.0+16.0*x-1.7*x^10.0+18.0*x-1.9/x^10.0-1.5384615384615385*x^13.0+21.0*x-1.6923076923076923/x^13.0-1.4375*x^16.0+24.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "2.8/-4.0/x^4.0+1.875/9.0*x^9.0+16.0/2.0*x^2.0-1.7/11.0*x^11.0+18.0/2.0*x^2.0-1.9/-9.0/x^9.0-1.5384615384615385/14.0*x^14.0+21.0/2.0*x^2.0-1.6923076923076923/-12.0/x^12.0-1.4375/17.0*x^17.0+24.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/1.4285714285714286/x^4.0+1.0/4.8*x^9.0+8.0*x^2.0-1.0/6.470588235294118*x^11.0+9.0*x^2.0+1.0/4.736842105263158/x^9.0-1.0/9.1*x^14.0+10.5*x^2.0+1.0/7.090909090909091/x^12.0-1.0/11.826086956521738*x^17.0+12.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-588.0/x^8.0+630.0*x^5.0-1224.0*x^7.0+2508.0/x^13.0-2640.0*x^10.0+4620.0/x^16.0-4830.0*x^13.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-588.0*-8.0/x^9.0+630.0*5.0*x^4.0-1224.0*7.0*x^6.0+2508.0*-13.0/x^14.0-2640.0*10.0*x^9.0+4620.0*-16.0/x^17.0-4830.0*13.0*x^12.0";
 UsageCalculus.EqnSolArrayMap2[3] = "4704.0/x^9.0+3150.0*x^4.0-8568.0*x^6.0-32604.0/x^14.0-26400.0*x^9.0-73920.0/x^17.0-62790.0*x^12.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/1.4285714285714286/x^4.0+1.0/4.8*x^9.0+8.0*x^2.0-1.0/6.470588235294118*x^11.0+9.0*x^2.0+1.0/4.736842105263158/x^9.0-1.0/9.1*x^14.0+10.5*x^2.0+1.0/7.090909090909091/x^12.0-1.0/11.826086956521738*x^17.0+12.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/1.4285714285714286/-3.0/x^3.0+1.0/4.8/10.0*x^10.0+8.0/3.0*x^3.0-1.0/6.470588235294118/12.0*x^12.0+9.0/3.0*x^3.0+1.0/4.736842105263158/-8.0/x^8.0-1.0/9.1/15.0*x^15.0+10.5/3.0*x^3.0+1.0/7.090909090909091/-11.0/x^11.0-1.0/11.826086956521738/18.0*x^18.0+12.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/4.285714285714286/x^3.0+1.0/48.0*x^10.0+2.6666666666666665*x^3.0-1.0/77.64705882352942*x^12.0+3.0*x^3.0-1.0/37.89473684210527/x^8.0-1.0/136.5*x^15.0+3.5*x^3.0-1.0/78.0/x^11.0-1.0/212.86956521739128*x^18.0+4.0*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "4704.0/x^9.0+3150.0*x^4.0-8568.0*x^6.0-32604.0/x^14.0-26400.0*x^9.0-73920.0/x^17.0-62790.0*x^12.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "4704.0*-9.0/x^10.0+3150.0*4.0*x^3.0-8568.0*6.0*x^5.0-32604.0*-14.0/x^15.0-26400.0*9.0*x^8.0-73920.0*-17.0/x^18.0-62790.0*12.0*x^11.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-42336.0/x^10.0+12600.0*x^3.0-51408.0*x^5.0+456456.0/x^15.0-237600.0*x^8.0+1256640.0/x^18.0-753480.0*x^11.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/4.285714285714286/x^3.0+1.0/48.0*x^10.0+2.6666666666666665*x^3.0-1.0/77.64705882352942*x^12.0+3.0*x^3.0-1.0/37.89473684210527/x^8.0-1.0/136.5*x^15.0+3.5*x^3.0-1.0/78.0/x^11.0-1.0/212.86956521739128*x^18.0+4.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/4.285714285714286/-2.0/x^2.0+1.0/48.0/11.0*x^11.0+2.6666666666666665/4.0*x^4.0-1.0/77.64705882352942/13.0*x^13.0+3.0/4.0*x^4.0-1.0/37.89473684210527/-7.0/x^7.0-1.0/136.5/16.0*x^16.0+3.5/4.0*x^4.0-1.0/78.0/-10.0/x^10.0-1.0/212.86956521739128/19.0*x^19.0+4.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/8.571428571428571/x^2.0+1.0/528.0*x^11.0+1.0/1.5*x^4.0-1.0/1009.4117647058824*x^13.0+1.0/1.3333333333333333*x^4.0+1.0/265.2631578947369/x^7.0-1.0/2184.0*x^16.0+1.0/1.1428571428571428*x^4.0+1.0/780.0/x^10.0-1.0/4044.5217391304345*x^19.0+x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120582() {
 UsageCalculus.TestCase = 120582;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+15*xyzxy^7+16-17*xyzxy^9+18*xyzxyzxyzxyzxyzxyz^-10+19/xyzxy^11-20*xyzxy^12+21+22/xyzxy^14-23*xyzxy^15+24+25/xyzxy^17-26*xyzxy^18";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyzxy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "15.0*xyzxy^7.0+16.0-17.0*xyzxy^9.0+18.0+19.0/xyzxy^11.0-20.0*xyzxy^12.0+21.0+22.0/xyzxy^14.0-23.0*xyzxy^15.0+24.0+25.0/xyzxy^17.0-26.0*xyzxy^18.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "15.0*7.0*xyzxy^6.0+16.0*0.0-17.0*9.0*xyzxy^8.0+18.0*0.0+19.0*-11.0/xyzxy^12.0-20.0*12.0*xyzxy^11.0+21.0*0.0+22.0*-14.0/xyzxy^15.0-23.0*15.0*xyzxy^14.0+24.0*0.0+25.0*-17.0/xyzxy^18.0-26.0*18.0*xyzxy^17.0";
 UsageCalculus.EqnSolArrayMap2[1] = "105.0*xyzxy^6.0-153.0*xyzxy^8.0-209.0/xyzxy^12.0-240.0*xyzxy^11.0-308.0/xyzxy^15.0-345.0*xyzxy^14.0-425.0/xyzxy^18.0-468.0*xyzxy^17.0";
 UsageCalculus.EqnSolArrayMap3[1] = "15.0*xyzxy^7.0+16.0-17.0*xyzxy^9.0+18.0+19.0/xyzxy^11.0-20.0*xyzxy^12.0+21.0+22.0/xyzxy^14.0-23.0*xyzxy^15.0+24.0+25.0/xyzxy^17.0-26.0*xyzxy^18.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "15.0/8.0*xyzxy^8.0+16.0*xyzxy-17.0/10.0*xyzxy^10.0+18.0*xyzxy+19.0/-10.0/xyzxy^10.0-20.0/13.0*xyzxy^13.0+21.0*xyzxy+22.0/-13.0/xyzxy^13.0-23.0/16.0*xyzxy^16.0+24.0*xyzxy+25.0/-16.0/xyzxy^16.0-26.0/19.0*xyzxy^19.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.875*xyzxy^8.0+16.0*xyzxy-1.7*xyzxy^10.0+18.0*xyzxy-1.9/xyzxy^10.0-1.5384615384615385*xyzxy^13.0+21.0*xyzxy-1.6923076923076923/xyzxy^13.0-1.4375*xyzxy^16.0+24.0*xyzxy-1.5625/xyzxy^16.0-1.368421052631579*xyzxy^19.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "105.0*xyzxy^6.0-153.0*xyzxy^8.0-209.0/xyzxy^12.0-240.0*xyzxy^11.0-308.0/xyzxy^15.0-345.0*xyzxy^14.0-425.0/xyzxy^18.0-468.0*xyzxy^17.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "105.0*6.0*xyzxy^5.0-153.0*8.0*xyzxy^7.0-209.0*-12.0/xyzxy^13.0-240.0*11.0*xyzxy^10.0-308.0*-15.0/xyzxy^16.0-345.0*14.0*xyzxy^13.0-425.0*-18.0/xyzxy^19.0-468.0*17.0*xyzxy^16.0";
 UsageCalculus.EqnSolArrayMap2[2] = "630.0*xyzxy^5.0-1224.0*xyzxy^7.0+2508.0/xyzxy^13.0-2640.0*xyzxy^10.0+4620.0/xyzxy^16.0-4830.0*xyzxy^13.0+7650.0/xyzxy^19.0-7956.0*xyzxy^16.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.875*xyzxy^8.0+16.0*xyzxy-1.7*xyzxy^10.0+18.0*xyzxy-1.9/xyzxy^10.0-1.5384615384615385*xyzxy^13.0+21.0*xyzxy-1.6923076923076923/xyzxy^13.0-1.4375*xyzxy^16.0+24.0*xyzxy-1.5625/xyzxy^16.0-1.368421052631579*xyzxy^19.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.875/9.0*xyzxy^9.0+16.0/2.0*xyzxy^2.0-1.7/11.0*xyzxy^11.0+18.0/2.0*xyzxy^2.0-1.9/-9.0/xyzxy^9.0-1.5384615384615385/14.0*xyzxy^14.0+21.0/2.0*xyzxy^2.0-1.6923076923076923/-12.0/xyzxy^12.0-1.4375/17.0*xyzxy^17.0+24.0/2.0*xyzxy^2.0-1.5625/-15.0/xyzxy^15.0-1.368421052631579/20.0*xyzxy^20.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/4.8*xyzxy^9.0+8.0*xyzxy^2.0-1.0/6.470588235294118*xyzxy^11.0+9.0*xyzxy^2.0+1.0/4.736842105263158/xyzxy^9.0-1.0/9.1*xyzxy^14.0+10.5*xyzxy^2.0+1.0/7.090909090909091/xyzxy^12.0-1.0/11.826086956521738*xyzxy^17.0+12.0*xyzxy^2.0+1.0/9.6/xyzxy^15.0-1.0/14.615384615384615*xyzxy^20.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "630.0*xyzxy^5.0-1224.0*xyzxy^7.0+2508.0/xyzxy^13.0-2640.0*xyzxy^10.0+4620.0/xyzxy^16.0-4830.0*xyzxy^13.0+7650.0/xyzxy^19.0-7956.0*xyzxy^16.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "630.0*5.0*xyzxy^4.0-1224.0*7.0*xyzxy^6.0+2508.0*-13.0/xyzxy^14.0-2640.0*10.0*xyzxy^9.0+4620.0*-16.0/xyzxy^17.0-4830.0*13.0*xyzxy^12.0+7650.0*-19.0/xyzxy^20.0-7956.0*16.0*xyzxy^15.0";
 UsageCalculus.EqnSolArrayMap2[3] = "3150.0*xyzxy^4.0-8568.0*xyzxy^6.0-32604.0/xyzxy^14.0-26400.0*xyzxy^9.0-73920.0/xyzxy^17.0-62790.0*xyzxy^12.0-145350.0/xyzxy^20.0-127296.0*xyzxy^15.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/4.8*xyzxy^9.0+8.0*xyzxy^2.0-1.0/6.470588235294118*xyzxy^11.0+9.0*xyzxy^2.0+1.0/4.736842105263158/xyzxy^9.0-1.0/9.1*xyzxy^14.0+10.5*xyzxy^2.0+1.0/7.090909090909091/xyzxy^12.0-1.0/11.826086956521738*xyzxy^17.0+12.0*xyzxy^2.0+1.0/9.6/xyzxy^15.0-1.0/14.615384615384615*xyzxy^20.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/4.8/10.0*xyzxy^10.0+8.0/3.0*xyzxy^3.0-1.0/6.470588235294118/12.0*xyzxy^12.0+9.0/3.0*xyzxy^3.0+1.0/4.736842105263158/-8.0/xyzxy^8.0-1.0/9.1/15.0*xyzxy^15.0+10.5/3.0*xyzxy^3.0+1.0/7.090909090909091/-11.0/xyzxy^11.0-1.0/11.826086956521738/18.0*xyzxy^18.0+12.0/3.0*xyzxy^3.0+1.0/9.6/-14.0/xyzxy^14.0-1.0/14.615384615384615/21.0*xyzxy^21.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/48.0*xyzxy^10.0+2.6666666666666665*xyzxy^3.0-1.0/77.64705882352942*xyzxy^12.0+3.0*xyzxy^3.0-1.0/37.89473684210527/xyzxy^8.0-1.0/136.5*xyzxy^15.0+3.5*xyzxy^3.0-1.0/78.0/xyzxy^11.0-1.0/212.86956521739128*xyzxy^18.0+4.0*xyzxy^3.0-1.0/134.4/xyzxy^14.0-1.0/306.9230769230769*xyzxy^21.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "3150.0*xyzxy^4.0-8568.0*xyzxy^6.0-32604.0/xyzxy^14.0-26400.0*xyzxy^9.0-73920.0/xyzxy^17.0-62790.0*xyzxy^12.0-145350.0/xyzxy^20.0-127296.0*xyzxy^15.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "3150.0*4.0*xyzxy^3.0-8568.0*6.0*xyzxy^5.0-32604.0*-14.0/xyzxy^15.0-26400.0*9.0*xyzxy^8.0-73920.0*-17.0/xyzxy^18.0-62790.0*12.0*xyzxy^11.0-145350.0*-20.0/xyzxy^21.0-127296.0*15.0*xyzxy^14.0";
 UsageCalculus.EqnSolArrayMap2[4] = "12600.0*xyzxy^3.0-51408.0*xyzxy^5.0+456456.0/xyzxy^15.0-237600.0*xyzxy^8.0+1256640.0/xyzxy^18.0-753480.0*xyzxy^11.0+2907000.0/xyzxy^21.0-1909440.0*xyzxy^14.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/48.0*xyzxy^10.0+2.6666666666666665*xyzxy^3.0-1.0/77.64705882352942*xyzxy^12.0+3.0*xyzxy^3.0-1.0/37.89473684210527/xyzxy^8.0-1.0/136.5*xyzxy^15.0+3.5*xyzxy^3.0-1.0/78.0/xyzxy^11.0-1.0/212.86956521739128*xyzxy^18.0+4.0*xyzxy^3.0-1.0/134.4/xyzxy^14.0-1.0/306.9230769230769*xyzxy^21.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/48.0/11.0*xyzxy^11.0+2.6666666666666665/4.0*xyzxy^4.0-1.0/77.64705882352942/13.0*xyzxy^13.0+3.0/4.0*xyzxy^4.0-1.0/37.89473684210527/-7.0/xyzxy^7.0-1.0/136.5/16.0*xyzxy^16.0+3.5/4.0*xyzxy^4.0-1.0/78.0/-10.0/xyzxy^10.0-1.0/212.86956521739128/19.0*xyzxy^19.0+4.0/4.0*xyzxy^4.0-1.0/134.4/-13.0/xyzxy^13.0-1.0/306.9230769230769/22.0*xyzxy^22.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/528.0*xyzxy^11.0+1.0/1.5*xyzxy^4.0-1.0/1009.4117647058824*xyzxy^13.0+1.0/1.3333333333333333*xyzxy^4.0+1.0/265.2631578947369/xyzxy^7.0-1.0/2184.0*xyzxy^16.0+1.0/1.1428571428571428*xyzxy^4.0+1.0/780.0/xyzxy^10.0-1.0/4044.5217391304345*xyzxy^19.0+xyzxy^4.0+1.0/1747.2/xyzxy^13.0-1.0/6752.3076923076915*xyzxy^22.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120583() {
 UsageCalculus.TestCase = 120583;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+16-17*x^9+18*xyzxyzxyzxyzxyzxyz^-10+19/x^11-20*x^12+21+22/x^14-23*x^15+24+25/x^17-26*x^18+27*xyzxyzxyzxyzxyzxyzxyzxyzxyz^-19+28/x^20";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "16.0-17.0*x^9.0+18.0+19.0/x^11.0-20.0*x^12.0+21.0+22.0/x^14.0-23.0*x^15.0+24.0+25.0/x^17.0-26.0*x^18.0+27.0+28.0/x^20.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0-17.0*9.0*x^8.0+18.0*0.0+19.0*-11.0/x^12.0-20.0*12.0*x^11.0+21.0*0.0+22.0*-14.0/x^15.0-23.0*15.0*x^14.0+24.0*0.0+25.0*-17.0/x^18.0-26.0*18.0*x^17.0+27.0*0.0+28.0*-20.0/x^21.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-153.0*x^8.0-209.0/x^12.0-240.0*x^11.0-308.0/x^15.0-345.0*x^14.0-425.0/x^18.0-468.0*x^17.0-560.0/x^21.0";
 UsageCalculus.EqnSolArrayMap3[1] = "16.0-17.0*x^9.0+18.0+19.0/x^11.0-20.0*x^12.0+21.0+22.0/x^14.0-23.0*x^15.0+24.0+25.0/x^17.0-26.0*x^18.0+27.0+28.0/x^20.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "16.0*x-17.0/10.0*x^10.0+18.0*x+19.0/-10.0/x^10.0-20.0/13.0*x^13.0+21.0*x+22.0/-13.0/x^13.0-23.0/16.0*x^16.0+24.0*x+25.0/-16.0/x^16.0-26.0/19.0*x^19.0+27.0*x+28.0/-19.0/x^19.0";
 UsageCalculus.EqnSolArrayMap4[1] = "16.0*x-1.7*x^10.0+18.0*x-1.9/x^10.0-1.5384615384615385*x^13.0+21.0*x-1.6923076923076923/x^13.0-1.4375*x^16.0+24.0*x-1.5625/x^16.0-1.368421052631579*x^19.0+27.0*x-1.4736842105263157/x^19.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-153.0*x^8.0-209.0/x^12.0-240.0*x^11.0-308.0/x^15.0-345.0*x^14.0-425.0/x^18.0-468.0*x^17.0-560.0/x^21.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-153.0*8.0*x^7.0-209.0*-12.0/x^13.0-240.0*11.0*x^10.0-308.0*-15.0/x^16.0-345.0*14.0*x^13.0-425.0*-18.0/x^19.0-468.0*17.0*x^16.0-560.0*-21.0/x^22.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-1224.0*x^7.0+2508.0/x^13.0-2640.0*x^10.0+4620.0/x^16.0-4830.0*x^13.0+7650.0/x^19.0-7956.0*x^16.0+11760.0/x^22.0";
 UsageCalculus.EqnSolArrayMap3[2] = "16.0*x-1.7*x^10.0+18.0*x-1.9/x^10.0-1.5384615384615385*x^13.0+21.0*x-1.6923076923076923/x^13.0-1.4375*x^16.0+24.0*x-1.5625/x^16.0-1.368421052631579*x^19.0+27.0*x-1.4736842105263157/x^19.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "16.0/2.0*x^2.0-1.7/11.0*x^11.0+18.0/2.0*x^2.0-1.9/-9.0/x^9.0-1.5384615384615385/14.0*x^14.0+21.0/2.0*x^2.0-1.6923076923076923/-12.0/x^12.0-1.4375/17.0*x^17.0+24.0/2.0*x^2.0-1.5625/-15.0/x^15.0-1.368421052631579/20.0*x^20.0+27.0/2.0*x^2.0-1.4736842105263157/-18.0/x^18.0";
 UsageCalculus.EqnSolArrayMap4[2] = "8.0*x^2.0-1.0/6.470588235294118*x^11.0+9.0*x^2.0+1.0/4.736842105263158/x^9.0-1.0/9.1*x^14.0+10.5*x^2.0+1.0/7.090909090909091/x^12.0-1.0/11.826086956521738*x^17.0+12.0*x^2.0+1.0/9.6/x^15.0-1.0/14.615384615384615*x^20.0+13.5*x^2.0+1.0/12.214285714285715/x^18.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-1224.0*x^7.0+2508.0/x^13.0-2640.0*x^10.0+4620.0/x^16.0-4830.0*x^13.0+7650.0/x^19.0-7956.0*x^16.0+11760.0/x^22.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-1224.0*7.0*x^6.0+2508.0*-13.0/x^14.0-2640.0*10.0*x^9.0+4620.0*-16.0/x^17.0-4830.0*13.0*x^12.0+7650.0*-19.0/x^20.0-7956.0*16.0*x^15.0+11760.0*-22.0/x^23.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-8568.0*x^6.0-32604.0/x^14.0-26400.0*x^9.0-73920.0/x^17.0-62790.0*x^12.0-145350.0/x^20.0-127296.0*x^15.0-258720.0/x^23.0";
 UsageCalculus.EqnSolArrayMap3[3] = "8.0*x^2.0-1.0/6.470588235294118*x^11.0+9.0*x^2.0+1.0/4.736842105263158/x^9.0-1.0/9.1*x^14.0+10.5*x^2.0+1.0/7.090909090909091/x^12.0-1.0/11.826086956521738*x^17.0+12.0*x^2.0+1.0/9.6/x^15.0-1.0/14.615384615384615*x^20.0+13.5*x^2.0+1.0/12.214285714285715/x^18.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "8.0/3.0*x^3.0-1.0/6.470588235294118/12.0*x^12.0+9.0/3.0*x^3.0+1.0/4.736842105263158/-8.0/x^8.0-1.0/9.1/15.0*x^15.0+10.5/3.0*x^3.0+1.0/7.090909090909091/-11.0/x^11.0-1.0/11.826086956521738/18.0*x^18.0+12.0/3.0*x^3.0+1.0/9.6/-14.0/x^14.0-1.0/14.615384615384615/21.0*x^21.0+13.5/3.0*x^3.0+1.0/12.214285714285715/-17.0/x^17.0";
 UsageCalculus.EqnSolArrayMap4[3] = "2.6666666666666665*x^3.0-1.0/77.64705882352942*x^12.0+3.0*x^3.0-1.0/37.89473684210527/x^8.0-1.0/136.5*x^15.0+3.5*x^3.0-1.0/78.0/x^11.0-1.0/212.86956521739128*x^18.0+4.0*x^3.0-1.0/134.4/x^14.0-1.0/306.9230769230769*x^21.0+4.5*x^3.0-1.0/207.64285714285717/x^17.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-8568.0*x^6.0-32604.0/x^14.0-26400.0*x^9.0-73920.0/x^17.0-62790.0*x^12.0-145350.0/x^20.0-127296.0*x^15.0-258720.0/x^23.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-8568.0*6.0*x^5.0-32604.0*-14.0/x^15.0-26400.0*9.0*x^8.0-73920.0*-17.0/x^18.0-62790.0*12.0*x^11.0-145350.0*-20.0/x^21.0-127296.0*15.0*x^14.0-258720.0*-23.0/x^24.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-51408.0*x^5.0+456456.0/x^15.0-237600.0*x^8.0+1256640.0/x^18.0-753480.0*x^11.0+2907000.0/x^21.0-1909440.0*x^14.0+5950560.0/x^24.0";
 UsageCalculus.EqnSolArrayMap3[4] = "2.6666666666666665*x^3.0-1.0/77.64705882352942*x^12.0+3.0*x^3.0-1.0/37.89473684210527/x^8.0-1.0/136.5*x^15.0+3.5*x^3.0-1.0/78.0/x^11.0-1.0/212.86956521739128*x^18.0+4.0*x^3.0-1.0/134.4/x^14.0-1.0/306.9230769230769*x^21.0+4.5*x^3.0-1.0/207.64285714285717/x^17.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "2.6666666666666665/4.0*x^4.0-1.0/77.64705882352942/13.0*x^13.0+3.0/4.0*x^4.0-1.0/37.89473684210527/-7.0/x^7.0-1.0/136.5/16.0*x^16.0+3.5/4.0*x^4.0-1.0/78.0/-10.0/x^10.0-1.0/212.86956521739128/19.0*x^19.0+4.0/4.0*x^4.0-1.0/134.4/-13.0/x^13.0-1.0/306.9230769230769/22.0*x^22.0+4.5/4.0*x^4.0-1.0/207.64285714285717/-16.0/x^16.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/1.5*x^4.0-1.0/1009.4117647058824*x^13.0+1.0/1.3333333333333333*x^4.0+1.0/265.2631578947369/x^7.0-1.0/2184.0*x^16.0+1.0/1.1428571428571428*x^4.0+1.0/780.0/x^10.0-1.0/4044.5217391304345*x^19.0+x^4.0+1.0/1747.2/x^13.0-1.0/6752.3076923076915*x^22.0+1.125*x^4.0+1.0/3322.2857142857147/x^16.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120584() {
 UsageCalculus.TestCase = 120584;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-17*x^9+18*xyzxyzxyzxyzxyzxyz^-10+19/x^11-20*x^12+21+22/x^14-23*x^15+24+25/x^17-26*x^18+27*xyzxyzxyzxyzxyzxyzxyzxyzxyz^-19+28/x^20-29*x^21+30*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-22";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-17.0*x^9.0+18.0+19.0/x^11.0-20.0*x^12.0+21.0+22.0/x^14.0-23.0*x^15.0+24.0+25.0/x^17.0-26.0*x^18.0+27.0+28.0/x^20.0-29.0*x^21.0+30.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-17.0*9.0*x^8.0+18.0*0.0+19.0*-11.0/x^12.0-20.0*12.0*x^11.0+21.0*0.0+22.0*-14.0/x^15.0-23.0*15.0*x^14.0+24.0*0.0+25.0*-17.0/x^18.0-26.0*18.0*x^17.0+27.0*0.0+28.0*-20.0/x^21.0-29.0*21.0*x^20.0+30.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-153.0*x^8.0-209.0/x^12.0-240.0*x^11.0-308.0/x^15.0-345.0*x^14.0-425.0/x^18.0-468.0*x^17.0-560.0/x^21.0-609.0*x^20.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-17.0*x^9.0+18.0+19.0/x^11.0-20.0*x^12.0+21.0+22.0/x^14.0-23.0*x^15.0+24.0+25.0/x^17.0-26.0*x^18.0+27.0+28.0/x^20.0-29.0*x^21.0+30.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-17.0/10.0*x^10.0+18.0*x+19.0/-10.0/x^10.0-20.0/13.0*x^13.0+21.0*x+22.0/-13.0/x^13.0-23.0/16.0*x^16.0+24.0*x+25.0/-16.0/x^16.0-26.0/19.0*x^19.0+27.0*x+28.0/-19.0/x^19.0-29.0/22.0*x^22.0+30.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.7*x^10.0+18.0*x-1.9/x^10.0-1.5384615384615385*x^13.0+21.0*x-1.6923076923076923/x^13.0-1.4375*x^16.0+24.0*x-1.5625/x^16.0-1.368421052631579*x^19.0+27.0*x-1.4736842105263157/x^19.0-1.3181818181818181*x^22.0+30.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-153.0*x^8.0-209.0/x^12.0-240.0*x^11.0-308.0/x^15.0-345.0*x^14.0-425.0/x^18.0-468.0*x^17.0-560.0/x^21.0-609.0*x^20.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-153.0*8.0*x^7.0-209.0*-12.0/x^13.0-240.0*11.0*x^10.0-308.0*-15.0/x^16.0-345.0*14.0*x^13.0-425.0*-18.0/x^19.0-468.0*17.0*x^16.0-560.0*-21.0/x^22.0-609.0*20.0*x^19.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-1224.0*x^7.0+2508.0/x^13.0-2640.0*x^10.0+4620.0/x^16.0-4830.0*x^13.0+7650.0/x^19.0-7956.0*x^16.0+11760.0/x^22.0-12180.0*x^19.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.7*x^10.0+18.0*x-1.9/x^10.0-1.5384615384615385*x^13.0+21.0*x-1.6923076923076923/x^13.0-1.4375*x^16.0+24.0*x-1.5625/x^16.0-1.368421052631579*x^19.0+27.0*x-1.4736842105263157/x^19.0-1.3181818181818181*x^22.0+30.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.7/11.0*x^11.0+18.0/2.0*x^2.0-1.9/-9.0/x^9.0-1.5384615384615385/14.0*x^14.0+21.0/2.0*x^2.0-1.6923076923076923/-12.0/x^12.0-1.4375/17.0*x^17.0+24.0/2.0*x^2.0-1.5625/-15.0/x^15.0-1.368421052631579/20.0*x^20.0+27.0/2.0*x^2.0-1.4736842105263157/-18.0/x^18.0-1.3181818181818181/23.0*x^23.0+30.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/6.470588235294118*x^11.0+9.0*x^2.0+1.0/4.736842105263158/x^9.0-1.0/9.1*x^14.0+10.5*x^2.0+1.0/7.090909090909091/x^12.0-1.0/11.826086956521738*x^17.0+12.0*x^2.0+1.0/9.6/x^15.0-1.0/14.615384615384615*x^20.0+13.5*x^2.0+1.0/12.214285714285715/x^18.0-1.0/17.448275862068968*x^23.0+15.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-1224.0*x^7.0+2508.0/x^13.0-2640.0*x^10.0+4620.0/x^16.0-4830.0*x^13.0+7650.0/x^19.0-7956.0*x^16.0+11760.0/x^22.0-12180.0*x^19.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-1224.0*7.0*x^6.0+2508.0*-13.0/x^14.0-2640.0*10.0*x^9.0+4620.0*-16.0/x^17.0-4830.0*13.0*x^12.0+7650.0*-19.0/x^20.0-7956.0*16.0*x^15.0+11760.0*-22.0/x^23.0-12180.0*19.0*x^18.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-8568.0*x^6.0-32604.0/x^14.0-26400.0*x^9.0-73920.0/x^17.0-62790.0*x^12.0-145350.0/x^20.0-127296.0*x^15.0-258720.0/x^23.0-231420.0*x^18.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/6.470588235294118*x^11.0+9.0*x^2.0+1.0/4.736842105263158/x^9.0-1.0/9.1*x^14.0+10.5*x^2.0+1.0/7.090909090909091/x^12.0-1.0/11.826086956521738*x^17.0+12.0*x^2.0+1.0/9.6/x^15.0-1.0/14.615384615384615*x^20.0+13.5*x^2.0+1.0/12.214285714285715/x^18.0-1.0/17.448275862068968*x^23.0+15.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/6.470588235294118/12.0*x^12.0+9.0/3.0*x^3.0+1.0/4.736842105263158/-8.0/x^8.0-1.0/9.1/15.0*x^15.0+10.5/3.0*x^3.0+1.0/7.090909090909091/-11.0/x^11.0-1.0/11.826086956521738/18.0*x^18.0+12.0/3.0*x^3.0+1.0/9.6/-14.0/x^14.0-1.0/14.615384615384615/21.0*x^21.0+13.5/3.0*x^3.0+1.0/12.214285714285715/-17.0/x^17.0-1.0/17.448275862068968/24.0*x^24.0+15.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/77.64705882352942*x^12.0+3.0*x^3.0-1.0/37.89473684210527/x^8.0-1.0/136.5*x^15.0+3.5*x^3.0-1.0/78.0/x^11.0-1.0/212.86956521739128*x^18.0+4.0*x^3.0-1.0/134.4/x^14.0-1.0/306.9230769230769*x^21.0+4.5*x^3.0-1.0/207.64285714285717/x^17.0-1.0/418.75862068965523*x^24.0+5.0*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-8568.0*x^6.0-32604.0/x^14.0-26400.0*x^9.0-73920.0/x^17.0-62790.0*x^12.0-145350.0/x^20.0-127296.0*x^15.0-258720.0/x^23.0-231420.0*x^18.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-8568.0*6.0*x^5.0-32604.0*-14.0/x^15.0-26400.0*9.0*x^8.0-73920.0*-17.0/x^18.0-62790.0*12.0*x^11.0-145350.0*-20.0/x^21.0-127296.0*15.0*x^14.0-258720.0*-23.0/x^24.0-231420.0*18.0*x^17.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-51408.0*x^5.0+456456.0/x^15.0-237600.0*x^8.0+1256640.0/x^18.0-753480.0*x^11.0+2907000.0/x^21.0-1909440.0*x^14.0+5950560.0/x^24.0-4165560.0*x^17.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/77.64705882352942*x^12.0+3.0*x^3.0-1.0/37.89473684210527/x^8.0-1.0/136.5*x^15.0+3.5*x^3.0-1.0/78.0/x^11.0-1.0/212.86956521739128*x^18.0+4.0*x^3.0-1.0/134.4/x^14.0-1.0/306.9230769230769*x^21.0+4.5*x^3.0-1.0/207.64285714285717/x^17.0-1.0/418.75862068965523*x^24.0+5.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/77.64705882352942/13.0*x^13.0+3.0/4.0*x^4.0-1.0/37.89473684210527/-7.0/x^7.0-1.0/136.5/16.0*x^16.0+3.5/4.0*x^4.0-1.0/78.0/-10.0/x^10.0-1.0/212.86956521739128/19.0*x^19.0+4.0/4.0*x^4.0-1.0/134.4/-13.0/x^13.0-1.0/306.9230769230769/22.0*x^22.0+4.5/4.0*x^4.0-1.0/207.64285714285717/-16.0/x^16.0-1.0/418.75862068965523/25.0*x^25.0+5.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/1009.4117647058824*x^13.0+1.0/1.3333333333333333*x^4.0+1.0/265.2631578947369/x^7.0-1.0/2184.0*x^16.0+1.0/1.1428571428571428*x^4.0+1.0/780.0/x^10.0-1.0/4044.5217391304345*x^19.0+x^4.0+1.0/1747.2/x^13.0-1.0/6752.3076923076915*x^22.0+1.125*x^4.0+1.0/3322.2857142857147/x^16.0-1.0/10468.96551724138*x^25.0+1.25*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120585() {
 UsageCalculus.TestCase = 120585;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+18*xyzxyzxyzxyzxyzxyz^-10+19/x^11-20*x^12+21+22/x^14-23*x^15+24+25/x^17-26*x^18+27*xyzxyzxyzxyzxyzxyzxyzxyzxyz^-19+28/x^20-29*x^21+30*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-22+31/x^23-32*x^24";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "18.0+19.0/x^11.0-20.0*x^12.0+21.0+22.0/x^14.0-23.0*x^15.0+24.0+25.0/x^17.0-26.0*x^18.0+27.0+28.0/x^20.0-29.0*x^21.0+30.0+31.0/x^23.0-32.0*x^24.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+19.0*-11.0/x^12.0-20.0*12.0*x^11.0+21.0*0.0+22.0*-14.0/x^15.0-23.0*15.0*x^14.0+24.0*0.0+25.0*-17.0/x^18.0-26.0*18.0*x^17.0+27.0*0.0+28.0*-20.0/x^21.0-29.0*21.0*x^20.0+30.0*0.0+31.0*-23.0/x^24.0-32.0*24.0*x^23.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-209.0/x^12.0-240.0*x^11.0-308.0/x^15.0-345.0*x^14.0-425.0/x^18.0-468.0*x^17.0-560.0/x^21.0-609.0*x^20.0-713.0/x^24.0-768.0*x^23.0";
 UsageCalculus.EqnSolArrayMap3[1] = "18.0+19.0/x^11.0-20.0*x^12.0+21.0+22.0/x^14.0-23.0*x^15.0+24.0+25.0/x^17.0-26.0*x^18.0+27.0+28.0/x^20.0-29.0*x^21.0+30.0+31.0/x^23.0-32.0*x^24.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "18.0*x+19.0/-10.0/x^10.0-20.0/13.0*x^13.0+21.0*x+22.0/-13.0/x^13.0-23.0/16.0*x^16.0+24.0*x+25.0/-16.0/x^16.0-26.0/19.0*x^19.0+27.0*x+28.0/-19.0/x^19.0-29.0/22.0*x^22.0+30.0*x+31.0/-22.0/x^22.0-32.0/25.0*x^25.0";
 UsageCalculus.EqnSolArrayMap4[1] = "18.0*x-1.9/x^10.0-1.5384615384615385*x^13.0+21.0*x-1.6923076923076923/x^13.0-1.4375*x^16.0+24.0*x-1.5625/x^16.0-1.368421052631579*x^19.0+27.0*x-1.4736842105263157/x^19.0-1.3181818181818181*x^22.0+30.0*x-1.4090909090909092/x^22.0-1.28*x^25.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-209.0/x^12.0-240.0*x^11.0-308.0/x^15.0-345.0*x^14.0-425.0/x^18.0-468.0*x^17.0-560.0/x^21.0-609.0*x^20.0-713.0/x^24.0-768.0*x^23.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-209.0*-12.0/x^13.0-240.0*11.0*x^10.0-308.0*-15.0/x^16.0-345.0*14.0*x^13.0-425.0*-18.0/x^19.0-468.0*17.0*x^16.0-560.0*-21.0/x^22.0-609.0*20.0*x^19.0-713.0*-24.0/x^25.0-768.0*23.0*x^22.0";
 UsageCalculus.EqnSolArrayMap2[2] = "2508.0/x^13.0-2640.0*x^10.0+4620.0/x^16.0-4830.0*x^13.0+7650.0/x^19.0-7956.0*x^16.0+11760.0/x^22.0-12180.0*x^19.0+17112.0/x^25.0-17664.0*x^22.0";
 UsageCalculus.EqnSolArrayMap3[2] = "18.0*x-1.9/x^10.0-1.5384615384615385*x^13.0+21.0*x-1.6923076923076923/x^13.0-1.4375*x^16.0+24.0*x-1.5625/x^16.0-1.368421052631579*x^19.0+27.0*x-1.4736842105263157/x^19.0-1.3181818181818181*x^22.0+30.0*x-1.4090909090909092/x^22.0-1.28*x^25.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "18.0/2.0*x^2.0-1.9/-9.0/x^9.0-1.5384615384615385/14.0*x^14.0+21.0/2.0*x^2.0-1.6923076923076923/-12.0/x^12.0-1.4375/17.0*x^17.0+24.0/2.0*x^2.0-1.5625/-15.0/x^15.0-1.368421052631579/20.0*x^20.0+27.0/2.0*x^2.0-1.4736842105263157/-18.0/x^18.0-1.3181818181818181/23.0*x^23.0+30.0/2.0*x^2.0-1.4090909090909092/-21.0/x^21.0-1.28/26.0*x^26.0";
 UsageCalculus.EqnSolArrayMap4[2] = "9.0*x^2.0+1.0/4.736842105263158/x^9.0-1.0/9.1*x^14.0+10.5*x^2.0+1.0/7.090909090909091/x^12.0-1.0/11.826086956521738*x^17.0+12.0*x^2.0+1.0/9.6/x^15.0-1.0/14.615384615384615*x^20.0+13.5*x^2.0+1.0/12.214285714285715/x^18.0-1.0/17.448275862068968*x^23.0+15.0*x^2.0+1.0/14.903225806451612/x^21.0-1.0/20.3125*x^26.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "2508.0/x^13.0-2640.0*x^10.0+4620.0/x^16.0-4830.0*x^13.0+7650.0/x^19.0-7956.0*x^16.0+11760.0/x^22.0-12180.0*x^19.0+17112.0/x^25.0-17664.0*x^22.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "2508.0*-13.0/x^14.0-2640.0*10.0*x^9.0+4620.0*-16.0/x^17.0-4830.0*13.0*x^12.0+7650.0*-19.0/x^20.0-7956.0*16.0*x^15.0+11760.0*-22.0/x^23.0-12180.0*19.0*x^18.0+17112.0*-25.0/x^26.0-17664.0*22.0*x^21.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-32604.0/x^14.0-26400.0*x^9.0-73920.0/x^17.0-62790.0*x^12.0-145350.0/x^20.0-127296.0*x^15.0-258720.0/x^23.0-231420.0*x^18.0-427800.0/x^26.0-388608.0*x^21.0";
 UsageCalculus.EqnSolArrayMap3[3] = "9.0*x^2.0+1.0/4.736842105263158/x^9.0-1.0/9.1*x^14.0+10.5*x^2.0+1.0/7.090909090909091/x^12.0-1.0/11.826086956521738*x^17.0+12.0*x^2.0+1.0/9.6/x^15.0-1.0/14.615384615384615*x^20.0+13.5*x^2.0+1.0/12.214285714285715/x^18.0-1.0/17.448275862068968*x^23.0+15.0*x^2.0+1.0/14.903225806451612/x^21.0-1.0/20.3125*x^26.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "9.0/3.0*x^3.0+1.0/4.736842105263158/-8.0/x^8.0-1.0/9.1/15.0*x^15.0+10.5/3.0*x^3.0+1.0/7.090909090909091/-11.0/x^11.0-1.0/11.826086956521738/18.0*x^18.0+12.0/3.0*x^3.0+1.0/9.6/-14.0/x^14.0-1.0/14.615384615384615/21.0*x^21.0+13.5/3.0*x^3.0+1.0/12.214285714285715/-17.0/x^17.0-1.0/17.448275862068968/24.0*x^24.0+15.0/3.0*x^3.0+1.0/14.903225806451612/-20.0/x^20.0-1.0/20.3125/27.0*x^27.0";
 UsageCalculus.EqnSolArrayMap4[3] = "3.0*x^3.0-1.0/37.89473684210527/x^8.0-1.0/136.5*x^15.0+3.5*x^3.0-1.0/78.0/x^11.0-1.0/212.86956521739128*x^18.0+4.0*x^3.0-1.0/134.4/x^14.0-1.0/306.9230769230769*x^21.0+4.5*x^3.0-1.0/207.64285714285717/x^17.0-1.0/418.75862068965523*x^24.0+5.0*x^3.0-1.0/298.06451612903226/x^20.0-1.0/548.4375*x^27.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-32604.0/x^14.0-26400.0*x^9.0-73920.0/x^17.0-62790.0*x^12.0-145350.0/x^20.0-127296.0*x^15.0-258720.0/x^23.0-231420.0*x^18.0-427800.0/x^26.0-388608.0*x^21.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-32604.0*-14.0/x^15.0-26400.0*9.0*x^8.0-73920.0*-17.0/x^18.0-62790.0*12.0*x^11.0-145350.0*-20.0/x^21.0-127296.0*15.0*x^14.0-258720.0*-23.0/x^24.0-231420.0*18.0*x^17.0-427800.0*-26.0/x^27.0-388608.0*21.0*x^20.0";
 UsageCalculus.EqnSolArrayMap2[4] = "456456.0/x^15.0-237600.0*x^8.0+1256640.0/x^18.0-753480.0*x^11.0+2907000.0/x^21.0-1909440.0*x^14.0+5950560.0/x^24.0-4165560.0*x^17.0+1.11228E7/x^27.0-8160768.0*x^20.0";
 UsageCalculus.EqnSolArrayMap3[4] = "3.0*x^3.0-1.0/37.89473684210527/x^8.0-1.0/136.5*x^15.0+3.5*x^3.0-1.0/78.0/x^11.0-1.0/212.86956521739128*x^18.0+4.0*x^3.0-1.0/134.4/x^14.0-1.0/306.9230769230769*x^21.0+4.5*x^3.0-1.0/207.64285714285717/x^17.0-1.0/418.75862068965523*x^24.0+5.0*x^3.0-1.0/298.06451612903226/x^20.0-1.0/548.4375*x^27.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "3.0/4.0*x^4.0-1.0/37.89473684210527/-7.0/x^7.0-1.0/136.5/16.0*x^16.0+3.5/4.0*x^4.0-1.0/78.0/-10.0/x^10.0-1.0/212.86956521739128/19.0*x^19.0+4.0/4.0*x^4.0-1.0/134.4/-13.0/x^13.0-1.0/306.9230769230769/22.0*x^22.0+4.5/4.0*x^4.0-1.0/207.64285714285717/-16.0/x^16.0-1.0/418.75862068965523/25.0*x^25.0+5.0/4.0*x^4.0-1.0/298.06451612903226/-19.0/x^19.0-1.0/548.4375/28.0*x^28.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/1.3333333333333333*x^4.0+1.0/265.2631578947369/x^7.0-1.0/2184.0*x^16.0+1.0/1.1428571428571428*x^4.0+1.0/780.0/x^10.0-1.0/4044.5217391304345*x^19.0+x^4.0+1.0/1747.2/x^13.0-1.0/6752.3076923076915*x^22.0+1.125*x^4.0+1.0/3322.2857142857147/x^16.0-1.0/10468.96551724138*x^25.0+1.25*x^4.0+1.0/5663.225806451613/x^19.0-1.0/15356.25*x^28.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120586() {
 UsageCalculus.TestCase = 120586;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+19/xyz^11-20*xyz^12+21+22/xyz^14-23*xyz^15+24+25/xyz^17-26*xyz^18+27*xyzxyzxyzxyzxyzxyzxyzxyzxyz^-19+28/xyz^20-29*xyz^21+30*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-22+31/xyz^23-32*xyz^24+33*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-25+34/xyz^26";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "19.0/xyz^11.0-20.0*xyz^12.0+21.0+22.0/xyz^14.0-23.0*xyz^15.0+24.0+25.0/xyz^17.0-26.0*xyz^18.0+27.0+28.0/xyz^20.0-29.0*xyz^21.0+30.0+31.0/xyz^23.0-32.0*xyz^24.0+33.0+34.0/xyz^26.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "19.0*-11.0/xyz^12.0-20.0*12.0*xyz^11.0+21.0*0.0+22.0*-14.0/xyz^15.0-23.0*15.0*xyz^14.0+24.0*0.0+25.0*-17.0/xyz^18.0-26.0*18.0*xyz^17.0+27.0*0.0+28.0*-20.0/xyz^21.0-29.0*21.0*xyz^20.0+30.0*0.0+31.0*-23.0/xyz^24.0-32.0*24.0*xyz^23.0+33.0*0.0+34.0*-26.0/xyz^27.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-209.0/xyz^12.0-240.0*xyz^11.0-308.0/xyz^15.0-345.0*xyz^14.0-425.0/xyz^18.0-468.0*xyz^17.0-560.0/xyz^21.0-609.0*xyz^20.0-713.0/xyz^24.0-768.0*xyz^23.0-884.0/xyz^27.0";
 UsageCalculus.EqnSolArrayMap3[1] = "19.0/xyz^11.0-20.0*xyz^12.0+21.0+22.0/xyz^14.0-23.0*xyz^15.0+24.0+25.0/xyz^17.0-26.0*xyz^18.0+27.0+28.0/xyz^20.0-29.0*xyz^21.0+30.0+31.0/xyz^23.0-32.0*xyz^24.0+33.0+34.0/xyz^26.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "19.0/-10.0/xyz^10.0-20.0/13.0*xyz^13.0+21.0*xyz+22.0/-13.0/xyz^13.0-23.0/16.0*xyz^16.0+24.0*xyz+25.0/-16.0/xyz^16.0-26.0/19.0*xyz^19.0+27.0*xyz+28.0/-19.0/xyz^19.0-29.0/22.0*xyz^22.0+30.0*xyz+31.0/-22.0/xyz^22.0-32.0/25.0*xyz^25.0+33.0*xyz+34.0/-25.0/xyz^25.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.9/xyz^10.0-1.5384615384615385*xyz^13.0+21.0*xyz-1.6923076923076923/xyz^13.0-1.4375*xyz^16.0+24.0*xyz-1.5625/xyz^16.0-1.368421052631579*xyz^19.0+27.0*xyz-1.4736842105263157/xyz^19.0-1.3181818181818181*xyz^22.0+30.0*xyz-1.4090909090909092/xyz^22.0-1.28*xyz^25.0+33.0*xyz-1.36/xyz^25.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-209.0/xyz^12.0-240.0*xyz^11.0-308.0/xyz^15.0-345.0*xyz^14.0-425.0/xyz^18.0-468.0*xyz^17.0-560.0/xyz^21.0-609.0*xyz^20.0-713.0/xyz^24.0-768.0*xyz^23.0-884.0/xyz^27.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-209.0*-12.0/xyz^13.0-240.0*11.0*xyz^10.0-308.0*-15.0/xyz^16.0-345.0*14.0*xyz^13.0-425.0*-18.0/xyz^19.0-468.0*17.0*xyz^16.0-560.0*-21.0/xyz^22.0-609.0*20.0*xyz^19.0-713.0*-24.0/xyz^25.0-768.0*23.0*xyz^22.0-884.0*-27.0/xyz^28.0";
 UsageCalculus.EqnSolArrayMap2[2] = "2508.0/xyz^13.0-2640.0*xyz^10.0+4620.0/xyz^16.0-4830.0*xyz^13.0+7650.0/xyz^19.0-7956.0*xyz^16.0+11760.0/xyz^22.0-12180.0*xyz^19.0+17112.0/xyz^25.0-17664.0*xyz^22.0+23868.0/xyz^28.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.9/xyz^10.0-1.5384615384615385*xyz^13.0+21.0*xyz-1.6923076923076923/xyz^13.0-1.4375*xyz^16.0+24.0*xyz-1.5625/xyz^16.0-1.368421052631579*xyz^19.0+27.0*xyz-1.4736842105263157/xyz^19.0-1.3181818181818181*xyz^22.0+30.0*xyz-1.4090909090909092/xyz^22.0-1.28*xyz^25.0+33.0*xyz-1.36/xyz^25.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.9/-9.0/xyz^9.0-1.5384615384615385/14.0*xyz^14.0+21.0/2.0*xyz^2.0-1.6923076923076923/-12.0/xyz^12.0-1.4375/17.0*xyz^17.0+24.0/2.0*xyz^2.0-1.5625/-15.0/xyz^15.0-1.368421052631579/20.0*xyz^20.0+27.0/2.0*xyz^2.0-1.4736842105263157/-18.0/xyz^18.0-1.3181818181818181/23.0*xyz^23.0+30.0/2.0*xyz^2.0-1.4090909090909092/-21.0/xyz^21.0-1.28/26.0*xyz^26.0+33.0/2.0*xyz^2.0-1.36/-24.0/xyz^24.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/4.736842105263158/xyz^9.0-1.0/9.1*xyz^14.0+10.5*xyz^2.0+1.0/7.090909090909091/xyz^12.0-1.0/11.826086956521738*xyz^17.0+12.0*xyz^2.0+1.0/9.6/xyz^15.0-1.0/14.615384615384615*xyz^20.0+13.5*xyz^2.0+1.0/12.214285714285715/xyz^18.0-1.0/17.448275862068968*xyz^23.0+15.0*xyz^2.0+1.0/14.903225806451612/xyz^21.0-1.0/20.3125*xyz^26.0+16.5*xyz^2.0+1.0/17.64705882352941/xyz^24.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "2508.0/xyz^13.0-2640.0*xyz^10.0+4620.0/xyz^16.0-4830.0*xyz^13.0+7650.0/xyz^19.0-7956.0*xyz^16.0+11760.0/xyz^22.0-12180.0*xyz^19.0+17112.0/xyz^25.0-17664.0*xyz^22.0+23868.0/xyz^28.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "2508.0*-13.0/xyz^14.0-2640.0*10.0*xyz^9.0+4620.0*-16.0/xyz^17.0-4830.0*13.0*xyz^12.0+7650.0*-19.0/xyz^20.0-7956.0*16.0*xyz^15.0+11760.0*-22.0/xyz^23.0-12180.0*19.0*xyz^18.0+17112.0*-25.0/xyz^26.0-17664.0*22.0*xyz^21.0+23868.0*-28.0/xyz^29.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-32604.0/xyz^14.0-26400.0*xyz^9.0-73920.0/xyz^17.0-62790.0*xyz^12.0-145350.0/xyz^20.0-127296.0*xyz^15.0-258720.0/xyz^23.0-231420.0*xyz^18.0-427800.0/xyz^26.0-388608.0*xyz^21.0-668304.0/xyz^29.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/4.736842105263158/xyz^9.0-1.0/9.1*xyz^14.0+10.5*xyz^2.0+1.0/7.090909090909091/xyz^12.0-1.0/11.826086956521738*xyz^17.0+12.0*xyz^2.0+1.0/9.6/xyz^15.0-1.0/14.615384615384615*xyz^20.0+13.5*xyz^2.0+1.0/12.214285714285715/xyz^18.0-1.0/17.448275862068968*xyz^23.0+15.0*xyz^2.0+1.0/14.903225806451612/xyz^21.0-1.0/20.3125*xyz^26.0+16.5*xyz^2.0+1.0/17.64705882352941/xyz^24.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/4.736842105263158/-8.0/xyz^8.0-1.0/9.1/15.0*xyz^15.0+10.5/3.0*xyz^3.0+1.0/7.090909090909091/-11.0/xyz^11.0-1.0/11.826086956521738/18.0*xyz^18.0+12.0/3.0*xyz^3.0+1.0/9.6/-14.0/xyz^14.0-1.0/14.615384615384615/21.0*xyz^21.0+13.5/3.0*xyz^3.0+1.0/12.214285714285715/-17.0/xyz^17.0-1.0/17.448275862068968/24.0*xyz^24.0+15.0/3.0*xyz^3.0+1.0/14.903225806451612/-20.0/xyz^20.0-1.0/20.3125/27.0*xyz^27.0+16.5/3.0*xyz^3.0+1.0/17.64705882352941/-23.0/xyz^23.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/37.89473684210527/xyz^8.0-1.0/136.5*xyz^15.0+3.5*xyz^3.0-1.0/78.0/xyz^11.0-1.0/212.86956521739128*xyz^18.0+4.0*xyz^3.0-1.0/134.4/xyz^14.0-1.0/306.9230769230769*xyz^21.0+4.5*xyz^3.0-1.0/207.64285714285717/xyz^17.0-1.0/418.75862068965523*xyz^24.0+5.0*xyz^3.0-1.0/298.06451612903226/xyz^20.0-1.0/548.4375*xyz^27.0+5.5*xyz^3.0-1.0/405.8823529411764/xyz^23.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-32604.0/xyz^14.0-26400.0*xyz^9.0-73920.0/xyz^17.0-62790.0*xyz^12.0-145350.0/xyz^20.0-127296.0*xyz^15.0-258720.0/xyz^23.0-231420.0*xyz^18.0-427800.0/xyz^26.0-388608.0*xyz^21.0-668304.0/xyz^29.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-32604.0*-14.0/xyz^15.0-26400.0*9.0*xyz^8.0-73920.0*-17.0/xyz^18.0-62790.0*12.0*xyz^11.0-145350.0*-20.0/xyz^21.0-127296.0*15.0*xyz^14.0-258720.0*-23.0/xyz^24.0-231420.0*18.0*xyz^17.0-427800.0*-26.0/xyz^27.0-388608.0*21.0*xyz^20.0-668304.0*-29.0/xyz^30.0";
 UsageCalculus.EqnSolArrayMap2[4] = "456456.0/xyz^15.0-237600.0*xyz^8.0+1256640.0/xyz^18.0-753480.0*xyz^11.0+2907000.0/xyz^21.0-1909440.0*xyz^14.0+5950560.0/xyz^24.0-4165560.0*xyz^17.0+1.11228E7/xyz^27.0-8160768.0*xyz^20.0+1.9380816E7/xyz^30.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/37.89473684210527/xyz^8.0-1.0/136.5*xyz^15.0+3.5*xyz^3.0-1.0/78.0/xyz^11.0-1.0/212.86956521739128*xyz^18.0+4.0*xyz^3.0-1.0/134.4/xyz^14.0-1.0/306.9230769230769*xyz^21.0+4.5*xyz^3.0-1.0/207.64285714285717/xyz^17.0-1.0/418.75862068965523*xyz^24.0+5.0*xyz^3.0-1.0/298.06451612903226/xyz^20.0-1.0/548.4375*xyz^27.0+5.5*xyz^3.0-1.0/405.8823529411764/xyz^23.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/37.89473684210527/-7.0/xyz^7.0-1.0/136.5/16.0*xyz^16.0+3.5/4.0*xyz^4.0-1.0/78.0/-10.0/xyz^10.0-1.0/212.86956521739128/19.0*xyz^19.0+4.0/4.0*xyz^4.0-1.0/134.4/-13.0/xyz^13.0-1.0/306.9230769230769/22.0*xyz^22.0+4.5/4.0*xyz^4.0-1.0/207.64285714285717/-16.0/xyz^16.0-1.0/418.75862068965523/25.0*xyz^25.0+5.0/4.0*xyz^4.0-1.0/298.06451612903226/-19.0/xyz^19.0-1.0/548.4375/28.0*xyz^28.0+5.5/4.0*xyz^4.0-1.0/405.8823529411764/-22.0/xyz^22.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/265.2631578947369/xyz^7.0-1.0/2184.0*xyz^16.0+1.0/1.1428571428571428*xyz^4.0+1.0/780.0/xyz^10.0-1.0/4044.5217391304345*xyz^19.0+xyz^4.0+1.0/1747.2/xyz^13.0-1.0/6752.3076923076915*xyz^22.0+1.125*xyz^4.0+1.0/3322.2857142857147/xyz^16.0-1.0/10468.96551724138*xyz^25.0+1.25*xyz^4.0+1.0/5663.225806451613/xyz^19.0-1.0/15356.25*xyz^28.0+1.375*xyz^4.0+1.0/8929.411764705881/xyz^22.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120587() {
 UsageCalculus.TestCase = 120587;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-20*x^12+21+22/x^14-23*x^15+24+25/x^17-26*x^18+27*xyzxyzxyzxyzxyzxyzxyzxyzxyz^-19+28/x^20-29*x^21+30*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-22+31/x^23-32*x^24+33*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-25+34/x^26-35*x^27+36";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-20.0*x^12.0+21.0+22.0/x^14.0-23.0*x^15.0+24.0+25.0/x^17.0-26.0*x^18.0+27.0+28.0/x^20.0-29.0*x^21.0+30.0+31.0/x^23.0-32.0*x^24.0+33.0+34.0/x^26.0-35.0*x^27.0+36.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-20.0*12.0*x^11.0+21.0*0.0+22.0*-14.0/x^15.0-23.0*15.0*x^14.0+24.0*0.0+25.0*-17.0/x^18.0-26.0*18.0*x^17.0+27.0*0.0+28.0*-20.0/x^21.0-29.0*21.0*x^20.0+30.0*0.0+31.0*-23.0/x^24.0-32.0*24.0*x^23.0+33.0*0.0+34.0*-26.0/x^27.0-35.0*27.0*x^26.0+36.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-240.0*x^11.0-308.0/x^15.0-345.0*x^14.0-425.0/x^18.0-468.0*x^17.0-560.0/x^21.0-609.0*x^20.0-713.0/x^24.0-768.0*x^23.0-884.0/x^27.0-945.0*x^26.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-20.0*x^12.0+21.0+22.0/x^14.0-23.0*x^15.0+24.0+25.0/x^17.0-26.0*x^18.0+27.0+28.0/x^20.0-29.0*x^21.0+30.0+31.0/x^23.0-32.0*x^24.0+33.0+34.0/x^26.0-35.0*x^27.0+36.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-20.0/13.0*x^13.0+21.0*x+22.0/-13.0/x^13.0-23.0/16.0*x^16.0+24.0*x+25.0/-16.0/x^16.0-26.0/19.0*x^19.0+27.0*x+28.0/-19.0/x^19.0-29.0/22.0*x^22.0+30.0*x+31.0/-22.0/x^22.0-32.0/25.0*x^25.0+33.0*x+34.0/-25.0/x^25.0-35.0/28.0*x^28.0+36.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.5384615384615385*x^13.0+21.0*x-1.6923076923076923/x^13.0-1.4375*x^16.0+24.0*x-1.5625/x^16.0-1.368421052631579*x^19.0+27.0*x-1.4736842105263157/x^19.0-1.3181818181818181*x^22.0+30.0*x-1.4090909090909092/x^22.0-1.28*x^25.0+33.0*x-1.36/x^25.0-1.25*x^28.0+36.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-240.0*x^11.0-308.0/x^15.0-345.0*x^14.0-425.0/x^18.0-468.0*x^17.0-560.0/x^21.0-609.0*x^20.0-713.0/x^24.0-768.0*x^23.0-884.0/x^27.0-945.0*x^26.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-240.0*11.0*x^10.0-308.0*-15.0/x^16.0-345.0*14.0*x^13.0-425.0*-18.0/x^19.0-468.0*17.0*x^16.0-560.0*-21.0/x^22.0-609.0*20.0*x^19.0-713.0*-24.0/x^25.0-768.0*23.0*x^22.0-884.0*-27.0/x^28.0-945.0*26.0*x^25.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-2640.0*x^10.0+4620.0/x^16.0-4830.0*x^13.0+7650.0/x^19.0-7956.0*x^16.0+11760.0/x^22.0-12180.0*x^19.0+17112.0/x^25.0-17664.0*x^22.0+23868.0/x^28.0-24570.0*x^25.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.5384615384615385*x^13.0+21.0*x-1.6923076923076923/x^13.0-1.4375*x^16.0+24.0*x-1.5625/x^16.0-1.368421052631579*x^19.0+27.0*x-1.4736842105263157/x^19.0-1.3181818181818181*x^22.0+30.0*x-1.4090909090909092/x^22.0-1.28*x^25.0+33.0*x-1.36/x^25.0-1.25*x^28.0+36.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.5384615384615385/14.0*x^14.0+21.0/2.0*x^2.0-1.6923076923076923/-12.0/x^12.0-1.4375/17.0*x^17.0+24.0/2.0*x^2.0-1.5625/-15.0/x^15.0-1.368421052631579/20.0*x^20.0+27.0/2.0*x^2.0-1.4736842105263157/-18.0/x^18.0-1.3181818181818181/23.0*x^23.0+30.0/2.0*x^2.0-1.4090909090909092/-21.0/x^21.0-1.28/26.0*x^26.0+33.0/2.0*x^2.0-1.36/-24.0/x^24.0-1.25/29.0*x^29.0+36.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/9.1*x^14.0+10.5*x^2.0+1.0/7.090909090909091/x^12.0-1.0/11.826086956521738*x^17.0+12.0*x^2.0+1.0/9.6/x^15.0-1.0/14.615384615384615*x^20.0+13.5*x^2.0+1.0/12.214285714285715/x^18.0-1.0/17.448275862068968*x^23.0+15.0*x^2.0+1.0/14.903225806451612/x^21.0-1.0/20.3125*x^26.0+16.5*x^2.0+1.0/17.64705882352941/x^24.0-1.0/23.2*x^29.0+18.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-2640.0*x^10.0+4620.0/x^16.0-4830.0*x^13.0+7650.0/x^19.0-7956.0*x^16.0+11760.0/x^22.0-12180.0*x^19.0+17112.0/x^25.0-17664.0*x^22.0+23868.0/x^28.0-24570.0*x^25.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-2640.0*10.0*x^9.0+4620.0*-16.0/x^17.0-4830.0*13.0*x^12.0+7650.0*-19.0/x^20.0-7956.0*16.0*x^15.0+11760.0*-22.0/x^23.0-12180.0*19.0*x^18.0+17112.0*-25.0/x^26.0-17664.0*22.0*x^21.0+23868.0*-28.0/x^29.0-24570.0*25.0*x^24.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-26400.0*x^9.0-73920.0/x^17.0-62790.0*x^12.0-145350.0/x^20.0-127296.0*x^15.0-258720.0/x^23.0-231420.0*x^18.0-427800.0/x^26.0-388608.0*x^21.0-668304.0/x^29.0-614250.0*x^24.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/9.1*x^14.0+10.5*x^2.0+1.0/7.090909090909091/x^12.0-1.0/11.826086956521738*x^17.0+12.0*x^2.0+1.0/9.6/x^15.0-1.0/14.615384615384615*x^20.0+13.5*x^2.0+1.0/12.214285714285715/x^18.0-1.0/17.448275862068968*x^23.0+15.0*x^2.0+1.0/14.903225806451612/x^21.0-1.0/20.3125*x^26.0+16.5*x^2.0+1.0/17.64705882352941/x^24.0-1.0/23.2*x^29.0+18.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/9.1/15.0*x^15.0+10.5/3.0*x^3.0+1.0/7.090909090909091/-11.0/x^11.0-1.0/11.826086956521738/18.0*x^18.0+12.0/3.0*x^3.0+1.0/9.6/-14.0/x^14.0-1.0/14.615384615384615/21.0*x^21.0+13.5/3.0*x^3.0+1.0/12.214285714285715/-17.0/x^17.0-1.0/17.448275862068968/24.0*x^24.0+15.0/3.0*x^3.0+1.0/14.903225806451612/-20.0/x^20.0-1.0/20.3125/27.0*x^27.0+16.5/3.0*x^3.0+1.0/17.64705882352941/-23.0/x^23.0-1.0/23.2/30.0*x^30.0+18.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/136.5*x^15.0+3.5*x^3.0-1.0/78.0/x^11.0-1.0/212.86956521739128*x^18.0+4.0*x^3.0-1.0/134.4/x^14.0-1.0/306.9230769230769*x^21.0+4.5*x^3.0-1.0/207.64285714285717/x^17.0-1.0/418.75862068965523*x^24.0+5.0*x^3.0-1.0/298.06451612903226/x^20.0-1.0/548.4375*x^27.0+5.5*x^3.0-1.0/405.8823529411764/x^23.0-1.0/696.0*x^30.0+6.0*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-26400.0*x^9.0-73920.0/x^17.0-62790.0*x^12.0-145350.0/x^20.0-127296.0*x^15.0-258720.0/x^23.0-231420.0*x^18.0-427800.0/x^26.0-388608.0*x^21.0-668304.0/x^29.0-614250.0*x^24.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-26400.0*9.0*x^8.0-73920.0*-17.0/x^18.0-62790.0*12.0*x^11.0-145350.0*-20.0/x^21.0-127296.0*15.0*x^14.0-258720.0*-23.0/x^24.0-231420.0*18.0*x^17.0-427800.0*-26.0/x^27.0-388608.0*21.0*x^20.0-668304.0*-29.0/x^30.0-614250.0*24.0*x^23.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-237600.0*x^8.0+1256640.0/x^18.0-753480.0*x^11.0+2907000.0/x^21.0-1909440.0*x^14.0+5950560.0/x^24.0-4165560.0*x^17.0+1.11228E7/x^27.0-8160768.0*x^20.0+1.9380816E7/x^30.0-1.4742E7*x^23.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/136.5*x^15.0+3.5*x^3.0-1.0/78.0/x^11.0-1.0/212.86956521739128*x^18.0+4.0*x^3.0-1.0/134.4/x^14.0-1.0/306.9230769230769*x^21.0+4.5*x^3.0-1.0/207.64285714285717/x^17.0-1.0/418.75862068965523*x^24.0+5.0*x^3.0-1.0/298.06451612903226/x^20.0-1.0/548.4375*x^27.0+5.5*x^3.0-1.0/405.8823529411764/x^23.0-1.0/696.0*x^30.0+6.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/136.5/16.0*x^16.0+3.5/4.0*x^4.0-1.0/78.0/-10.0/x^10.0-1.0/212.86956521739128/19.0*x^19.0+4.0/4.0*x^4.0-1.0/134.4/-13.0/x^13.0-1.0/306.9230769230769/22.0*x^22.0+4.5/4.0*x^4.0-1.0/207.64285714285717/-16.0/x^16.0-1.0/418.75862068965523/25.0*x^25.0+5.0/4.0*x^4.0-1.0/298.06451612903226/-19.0/x^19.0-1.0/548.4375/28.0*x^28.0+5.5/4.0*x^4.0-1.0/405.8823529411764/-22.0/x^22.0-1.0/696.0/31.0*x^31.0+6.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/2184.0*x^16.0+1.0/1.1428571428571428*x^4.0+1.0/780.0/x^10.0-1.0/4044.5217391304345*x^19.0+x^4.0+1.0/1747.2/x^13.0-1.0/6752.3076923076915*x^22.0+1.125*x^4.0+1.0/3322.2857142857147/x^16.0-1.0/10468.96551724138*x^25.0+1.25*x^4.0+1.0/5663.225806451613/x^19.0-1.0/15356.25*x^28.0+1.375*x^4.0+1.0/8929.411764705881/x^22.0-1.0/21576.0*x^31.0+1.5*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120588() {
 UsageCalculus.TestCase = 120588;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+21+22-23+24+25-26+27*xyzxyzxyzxyzxyzxyzxyzxyzxyz^-19+28-29+30*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-22+31-32+33*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-25+34-35+36+37-38";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "21.0+22.0-23.0+24.0+25.0-26.0+27.0+28.0-29.0+30.0+31.0-32.0+33.0+34.0-35.0+36.0+37.0-38.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+22.0*0.0-23.0*0.0+24.0*0.0+25.0*0.0-26.0*0.0+27.0*0.0+28.0*0.0-29.0*0.0+30.0*0.0+31.0*0.0-32.0*0.0+33.0*0.0+34.0*0.0-35.0*0.0+36.0*0.0+37.0*0.0-38.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "21.0+22.0-23.0+24.0+25.0-26.0+27.0+28.0-29.0+30.0+31.0-32.0+33.0+34.0-35.0+36.0+37.0-38.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "21.0*x+22.0*x-23.0*x+24.0*x+25.0*x-26.0*x+27.0*x+28.0*x-29.0*x+30.0*x+31.0*x-32.0*x+33.0*x+34.0*x-35.0*x+36.0*x+37.0*x-38.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "21.0*x+22.0*x-23.0*x+24.0*x+25.0*x-26.0*x+27.0*x+28.0*x-29.0*x+30.0*x+31.0*x-32.0*x+33.0*x+34.0*x-35.0*x+36.0*x+37.0*x-38.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "21.0*x+22.0*x-23.0*x+24.0*x+25.0*x-26.0*x+27.0*x+28.0*x-29.0*x+30.0*x+31.0*x-32.0*x+33.0*x+34.0*x-35.0*x+36.0*x+37.0*x-38.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "21.0/2.0*x^2.0+22.0/2.0*x^2.0-23.0/2.0*x^2.0+24.0/2.0*x^2.0+25.0/2.0*x^2.0-26.0/2.0*x^2.0+27.0/2.0*x^2.0+28.0/2.0*x^2.0-29.0/2.0*x^2.0+30.0/2.0*x^2.0+31.0/2.0*x^2.0-32.0/2.0*x^2.0+33.0/2.0*x^2.0+34.0/2.0*x^2.0-35.0/2.0*x^2.0+36.0/2.0*x^2.0+37.0/2.0*x^2.0-38.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "10.5*x^2.0+11.0*x^2.0-11.5*x^2.0+12.0*x^2.0+12.5*x^2.0-13.0*x^2.0+13.5*x^2.0+14.0*x^2.0-14.5*x^2.0+15.0*x^2.0+15.5*x^2.0-16.0*x^2.0+16.5*x^2.0+17.0*x^2.0-17.5*x^2.0+18.0*x^2.0+18.5*x^2.0-19.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "10.5*x^2.0+11.0*x^2.0-11.5*x^2.0+12.0*x^2.0+12.5*x^2.0-13.0*x^2.0+13.5*x^2.0+14.0*x^2.0-14.5*x^2.0+15.0*x^2.0+15.5*x^2.0-16.0*x^2.0+16.5*x^2.0+17.0*x^2.0-17.5*x^2.0+18.0*x^2.0+18.5*x^2.0-19.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "10.5/3.0*x^3.0+11.0/3.0*x^3.0-11.5/3.0*x^3.0+12.0/3.0*x^3.0+12.5/3.0*x^3.0-13.0/3.0*x^3.0+13.5/3.0*x^3.0+14.0/3.0*x^3.0-14.5/3.0*x^3.0+15.0/3.0*x^3.0+15.5/3.0*x^3.0-16.0/3.0*x^3.0+16.5/3.0*x^3.0+17.0/3.0*x^3.0-17.5/3.0*x^3.0+18.0/3.0*x^3.0+18.5/3.0*x^3.0-19.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "3.5*x^3.0+3.6666666666666665*x^3.0-3.8333333333333335*x^3.0+4.0*x^3.0+4.166666666666667*x^3.0-4.333333333333333*x^3.0+4.5*x^3.0+4.666666666666667*x^3.0-4.833333333333333*x^3.0+5.0*x^3.0+5.166666666666667*x^3.0-5.333333333333333*x^3.0+5.5*x^3.0+5.666666666666667*x^3.0-5.833333333333333*x^3.0+6.0*x^3.0+6.166666666666667*x^3.0-6.333333333333333*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "3.5*x^3.0+3.6666666666666665*x^3.0-3.8333333333333335*x^3.0+4.0*x^3.0+4.166666666666667*x^3.0-4.333333333333333*x^3.0+4.5*x^3.0+4.666666666666667*x^3.0-4.833333333333333*x^3.0+5.0*x^3.0+5.166666666666667*x^3.0-5.333333333333333*x^3.0+5.5*x^3.0+5.666666666666667*x^3.0-5.833333333333333*x^3.0+6.0*x^3.0+6.166666666666667*x^3.0-6.333333333333333*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "3.5/4.0*x^4.0+3.6666666666666665/4.0*x^4.0-3.8333333333333335/4.0*x^4.0+4.0/4.0*x^4.0+4.166666666666667/4.0*x^4.0-4.333333333333333/4.0*x^4.0+4.5/4.0*x^4.0+4.666666666666667/4.0*x^4.0-4.833333333333333/4.0*x^4.0+5.0/4.0*x^4.0+5.166666666666667/4.0*x^4.0-5.333333333333333/4.0*x^4.0+5.5/4.0*x^4.0+5.666666666666667/4.0*x^4.0-5.833333333333333/4.0*x^4.0+6.0/4.0*x^4.0+6.166666666666667/4.0*x^4.0-6.333333333333333/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/1.1428571428571428*x^4.0+1.0/1.090909090909091*x^4.0-1.0/1.0434782608695652*x^4.0+x^4.0+1.0416666666666667*x^4.0-1.0833333333333333*x^4.0+1.125*x^4.0+1.1666666666666667*x^4.0-1.2083333333333333*x^4.0+1.25*x^4.0+1.2916666666666667*x^4.0-1.3333333333333333*x^4.0+1.375*x^4.0+1.4166666666666667*x^4.0-1.4583333333333333*x^4.0+1.5*x^4.0+1.5416666666666667*x^4.0-1.5833333333333333*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120589() {
 UsageCalculus.TestCase = 120589;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+22/x^14-23*x^15+24+25/x^17-26*x^18+27*xyzxyzxyzxyzxyzxyzxyzxyzxyz^-19+28/x^20-29*x^21+30*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-22+31/x^23-32*x^24+33*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-25+34/x^26-35*x^27+36+37/x^29-38*x^30+39+40/x^32";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "22.0/x^14.0-23.0*x^15.0+24.0+25.0/x^17.0-26.0*x^18.0+27.0+28.0/x^20.0-29.0*x^21.0+30.0+31.0/x^23.0-32.0*x^24.0+33.0+34.0/x^26.0-35.0*x^27.0+36.0+37.0/x^29.0-38.0*x^30.0+39.0+40.0/x^32.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "22.0*-14.0/x^15.0-23.0*15.0*x^14.0+24.0*0.0+25.0*-17.0/x^18.0-26.0*18.0*x^17.0+27.0*0.0+28.0*-20.0/x^21.0-29.0*21.0*x^20.0+30.0*0.0+31.0*-23.0/x^24.0-32.0*24.0*x^23.0+33.0*0.0+34.0*-26.0/x^27.0-35.0*27.0*x^26.0+36.0*0.0+37.0*-29.0/x^30.0-38.0*30.0*x^29.0+39.0*0.0+40.0*-32.0/x^33.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-308.0/x^15.0-345.0*x^14.0-425.0/x^18.0-468.0*x^17.0-560.0/x^21.0-609.0*x^20.0-713.0/x^24.0-768.0*x^23.0-884.0/x^27.0-945.0*x^26.0-1073.0/x^30.0-1140.0*x^29.0-1280.0/x^33.0";
 UsageCalculus.EqnSolArrayMap3[1] = "22.0/x^14.0-23.0*x^15.0+24.0+25.0/x^17.0-26.0*x^18.0+27.0+28.0/x^20.0-29.0*x^21.0+30.0+31.0/x^23.0-32.0*x^24.0+33.0+34.0/x^26.0-35.0*x^27.0+36.0+37.0/x^29.0-38.0*x^30.0+39.0+40.0/x^32.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "22.0/-13.0/x^13.0-23.0/16.0*x^16.0+24.0*x+25.0/-16.0/x^16.0-26.0/19.0*x^19.0+27.0*x+28.0/-19.0/x^19.0-29.0/22.0*x^22.0+30.0*x+31.0/-22.0/x^22.0-32.0/25.0*x^25.0+33.0*x+34.0/-25.0/x^25.0-35.0/28.0*x^28.0+36.0*x+37.0/-28.0/x^28.0-38.0/31.0*x^31.0+39.0*x+40.0/-31.0/x^31.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.6923076923076923/x^13.0-1.4375*x^16.0+24.0*x-1.5625/x^16.0-1.368421052631579*x^19.0+27.0*x-1.4736842105263157/x^19.0-1.3181818181818181*x^22.0+30.0*x-1.4090909090909092/x^22.0-1.28*x^25.0+33.0*x-1.36/x^25.0-1.25*x^28.0+36.0*x-1.3214285714285714/x^28.0-1.2258064516129032*x^31.0+39.0*x-1.2903225806451613/x^31.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-308.0/x^15.0-345.0*x^14.0-425.0/x^18.0-468.0*x^17.0-560.0/x^21.0-609.0*x^20.0-713.0/x^24.0-768.0*x^23.0-884.0/x^27.0-945.0*x^26.0-1073.0/x^30.0-1140.0*x^29.0-1280.0/x^33.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-308.0*-15.0/x^16.0-345.0*14.0*x^13.0-425.0*-18.0/x^19.0-468.0*17.0*x^16.0-560.0*-21.0/x^22.0-609.0*20.0*x^19.0-713.0*-24.0/x^25.0-768.0*23.0*x^22.0-884.0*-27.0/x^28.0-945.0*26.0*x^25.0-1073.0*-30.0/x^31.0-1140.0*29.0*x^28.0-1280.0*-33.0/x^34.0";
 UsageCalculus.EqnSolArrayMap2[2] = "4620.0/x^16.0-4830.0*x^13.0+7650.0/x^19.0-7956.0*x^16.0+11760.0/x^22.0-12180.0*x^19.0+17112.0/x^25.0-17664.0*x^22.0+23868.0/x^28.0-24570.0*x^25.0+32190.0/x^31.0-33060.0*x^28.0+42240.0/x^34.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.6923076923076923/x^13.0-1.4375*x^16.0+24.0*x-1.5625/x^16.0-1.368421052631579*x^19.0+27.0*x-1.4736842105263157/x^19.0-1.3181818181818181*x^22.0+30.0*x-1.4090909090909092/x^22.0-1.28*x^25.0+33.0*x-1.36/x^25.0-1.25*x^28.0+36.0*x-1.3214285714285714/x^28.0-1.2258064516129032*x^31.0+39.0*x-1.2903225806451613/x^31.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.6923076923076923/-12.0/x^12.0-1.4375/17.0*x^17.0+24.0/2.0*x^2.0-1.5625/-15.0/x^15.0-1.368421052631579/20.0*x^20.0+27.0/2.0*x^2.0-1.4736842105263157/-18.0/x^18.0-1.3181818181818181/23.0*x^23.0+30.0/2.0*x^2.0-1.4090909090909092/-21.0/x^21.0-1.28/26.0*x^26.0+33.0/2.0*x^2.0-1.36/-24.0/x^24.0-1.25/29.0*x^29.0+36.0/2.0*x^2.0-1.3214285714285714/-27.0/x^27.0-1.2258064516129032/32.0*x^32.0+39.0/2.0*x^2.0-1.2903225806451613/-30.0/x^30.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/7.090909090909091/x^12.0-1.0/11.826086956521738*x^17.0+12.0*x^2.0+1.0/9.6/x^15.0-1.0/14.615384615384615*x^20.0+13.5*x^2.0+1.0/12.214285714285715/x^18.0-1.0/17.448275862068968*x^23.0+15.0*x^2.0+1.0/14.903225806451612/x^21.0-1.0/20.3125*x^26.0+16.5*x^2.0+1.0/17.64705882352941/x^24.0-1.0/23.2*x^29.0+18.0*x^2.0+1.0/20.43243243243243/x^27.0-1.0/26.105263157894736*x^32.0+19.5*x^2.0+1.0/23.25/x^30.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "4620.0/x^16.0-4830.0*x^13.0+7650.0/x^19.0-7956.0*x^16.0+11760.0/x^22.0-12180.0*x^19.0+17112.0/x^25.0-17664.0*x^22.0+23868.0/x^28.0-24570.0*x^25.0+32190.0/x^31.0-33060.0*x^28.0+42240.0/x^34.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "4620.0*-16.0/x^17.0-4830.0*13.0*x^12.0+7650.0*-19.0/x^20.0-7956.0*16.0*x^15.0+11760.0*-22.0/x^23.0-12180.0*19.0*x^18.0+17112.0*-25.0/x^26.0-17664.0*22.0*x^21.0+23868.0*-28.0/x^29.0-24570.0*25.0*x^24.0+32190.0*-31.0/x^32.0-33060.0*28.0*x^27.0+42240.0*-34.0/x^35.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-73920.0/x^17.0-62790.0*x^12.0-145350.0/x^20.0-127296.0*x^15.0-258720.0/x^23.0-231420.0*x^18.0-427800.0/x^26.0-388608.0*x^21.0-668304.0/x^29.0-614250.0*x^24.0-997890.0/x^32.0-925680.0*x^27.0-1436160.0/x^35.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/7.090909090909091/x^12.0-1.0/11.826086956521738*x^17.0+12.0*x^2.0+1.0/9.6/x^15.0-1.0/14.615384615384615*x^20.0+13.5*x^2.0+1.0/12.214285714285715/x^18.0-1.0/17.448275862068968*x^23.0+15.0*x^2.0+1.0/14.903225806451612/x^21.0-1.0/20.3125*x^26.0+16.5*x^2.0+1.0/17.64705882352941/x^24.0-1.0/23.2*x^29.0+18.0*x^2.0+1.0/20.43243243243243/x^27.0-1.0/26.105263157894736*x^32.0+19.5*x^2.0+1.0/23.25/x^30.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/7.090909090909091/-11.0/x^11.0-1.0/11.826086956521738/18.0*x^18.0+12.0/3.0*x^3.0+1.0/9.6/-14.0/x^14.0-1.0/14.615384615384615/21.0*x^21.0+13.5/3.0*x^3.0+1.0/12.214285714285715/-17.0/x^17.0-1.0/17.448275862068968/24.0*x^24.0+15.0/3.0*x^3.0+1.0/14.903225806451612/-20.0/x^20.0-1.0/20.3125/27.0*x^27.0+16.5/3.0*x^3.0+1.0/17.64705882352941/-23.0/x^23.0-1.0/23.2/30.0*x^30.0+18.0/3.0*x^3.0+1.0/20.43243243243243/-26.0/x^26.0-1.0/26.105263157894736/33.0*x^33.0+19.5/3.0*x^3.0+1.0/23.25/-29.0/x^29.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/78.0/x^11.0-1.0/212.86956521739128*x^18.0+4.0*x^3.0-1.0/134.4/x^14.0-1.0/306.9230769230769*x^21.0+4.5*x^3.0-1.0/207.64285714285717/x^17.0-1.0/418.75862068965523*x^24.0+5.0*x^3.0-1.0/298.06451612903226/x^20.0-1.0/548.4375*x^27.0+5.5*x^3.0-1.0/405.8823529411764/x^23.0-1.0/696.0*x^30.0+6.0*x^3.0-1.0/531.2432432432432/x^26.0-1.0/861.4736842105262*x^33.0+6.5*x^3.0-1.0/674.25/x^29.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-73920.0/x^17.0-62790.0*x^12.0-145350.0/x^20.0-127296.0*x^15.0-258720.0/x^23.0-231420.0*x^18.0-427800.0/x^26.0-388608.0*x^21.0-668304.0/x^29.0-614250.0*x^24.0-997890.0/x^32.0-925680.0*x^27.0-1436160.0/x^35.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-73920.0*-17.0/x^18.0-62790.0*12.0*x^11.0-145350.0*-20.0/x^21.0-127296.0*15.0*x^14.0-258720.0*-23.0/x^24.0-231420.0*18.0*x^17.0-427800.0*-26.0/x^27.0-388608.0*21.0*x^20.0-668304.0*-29.0/x^30.0-614250.0*24.0*x^23.0-997890.0*-32.0/x^33.0-925680.0*27.0*x^26.0-1436160.0*-35.0/x^36.0";
 UsageCalculus.EqnSolArrayMap2[4] = "1256640.0/x^18.0-753480.0*x^11.0+2907000.0/x^21.0-1909440.0*x^14.0+5950560.0/x^24.0-4165560.0*x^17.0+1.11228E7/x^27.0-8160768.0*x^20.0+1.9380816E7/x^30.0-1.4742E7*x^23.0+3.193248E7/x^33.0-2.499336E7*x^26.0+5.02656E7/x^36.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/78.0/x^11.0-1.0/212.86956521739128*x^18.0+4.0*x^3.0-1.0/134.4/x^14.0-1.0/306.9230769230769*x^21.0+4.5*x^3.0-1.0/207.64285714285717/x^17.0-1.0/418.75862068965523*x^24.0+5.0*x^3.0-1.0/298.06451612903226/x^20.0-1.0/548.4375*x^27.0+5.5*x^3.0-1.0/405.8823529411764/x^23.0-1.0/696.0*x^30.0+6.0*x^3.0-1.0/531.2432432432432/x^26.0-1.0/861.4736842105262*x^33.0+6.5*x^3.0-1.0/674.25/x^29.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/78.0/-10.0/x^10.0-1.0/212.86956521739128/19.0*x^19.0+4.0/4.0*x^4.0-1.0/134.4/-13.0/x^13.0-1.0/306.9230769230769/22.0*x^22.0+4.5/4.0*x^4.0-1.0/207.64285714285717/-16.0/x^16.0-1.0/418.75862068965523/25.0*x^25.0+5.0/4.0*x^4.0-1.0/298.06451612903226/-19.0/x^19.0-1.0/548.4375/28.0*x^28.0+5.5/4.0*x^4.0-1.0/405.8823529411764/-22.0/x^22.0-1.0/696.0/31.0*x^31.0+6.0/4.0*x^4.0-1.0/531.2432432432432/-25.0/x^25.0-1.0/861.4736842105262/34.0*x^34.0+6.5/4.0*x^4.0-1.0/674.25/-28.0/x^28.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/780.0/x^10.0-1.0/4044.5217391304345*x^19.0+x^4.0+1.0/1747.2/x^13.0-1.0/6752.3076923076915*x^22.0+1.125*x^4.0+1.0/3322.2857142857147/x^16.0-1.0/10468.96551724138*x^25.0+1.25*x^4.0+1.0/5663.225806451613/x^19.0-1.0/15356.25*x^28.0+1.375*x^4.0+1.0/8929.411764705881/x^22.0-1.0/21576.0*x^31.0+1.5*x^4.0+1.0/13281.08108108108/x^25.0-1.0/29290.105263157893*x^34.0+1.625*x^4.0+1.0/18879.0/x^28.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120590() {
 UsageCalculus.TestCase = 120590;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-23*x^15+24+25/x^17-26*x^18+27*xyzxyzxyzxyzxyzxyzxyzxyzxyz^-19+28/x^20-29*x^21+30*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-22+31/x^23-32*x^24+33*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-25+34/x^26-35*x^27+36+37/x^29-38*x^30+39+40/x^32-41*x^33+42*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-34";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-23.0*x^15.0+24.0+25.0/x^17.0-26.0*x^18.0+27.0+28.0/x^20.0-29.0*x^21.0+30.0+31.0/x^23.0-32.0*x^24.0+33.0+34.0/x^26.0-35.0*x^27.0+36.0+37.0/x^29.0-38.0*x^30.0+39.0+40.0/x^32.0-41.0*x^33.0+42.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-23.0*15.0*x^14.0+24.0*0.0+25.0*-17.0/x^18.0-26.0*18.0*x^17.0+27.0*0.0+28.0*-20.0/x^21.0-29.0*21.0*x^20.0+30.0*0.0+31.0*-23.0/x^24.0-32.0*24.0*x^23.0+33.0*0.0+34.0*-26.0/x^27.0-35.0*27.0*x^26.0+36.0*0.0+37.0*-29.0/x^30.0-38.0*30.0*x^29.0+39.0*0.0+40.0*-32.0/x^33.0-41.0*33.0*x^32.0+42.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-345.0*x^14.0-425.0/x^18.0-468.0*x^17.0-560.0/x^21.0-609.0*x^20.0-713.0/x^24.0-768.0*x^23.0-884.0/x^27.0-945.0*x^26.0-1073.0/x^30.0-1140.0*x^29.0-1280.0/x^33.0-1353.0*x^32.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-23.0*x^15.0+24.0+25.0/x^17.0-26.0*x^18.0+27.0+28.0/x^20.0-29.0*x^21.0+30.0+31.0/x^23.0-32.0*x^24.0+33.0+34.0/x^26.0-35.0*x^27.0+36.0+37.0/x^29.0-38.0*x^30.0+39.0+40.0/x^32.0-41.0*x^33.0+42.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-23.0/16.0*x^16.0+24.0*x+25.0/-16.0/x^16.0-26.0/19.0*x^19.0+27.0*x+28.0/-19.0/x^19.0-29.0/22.0*x^22.0+30.0*x+31.0/-22.0/x^22.0-32.0/25.0*x^25.0+33.0*x+34.0/-25.0/x^25.0-35.0/28.0*x^28.0+36.0*x+37.0/-28.0/x^28.0-38.0/31.0*x^31.0+39.0*x+40.0/-31.0/x^31.0-41.0/34.0*x^34.0+42.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.4375*x^16.0+24.0*x-1.5625/x^16.0-1.368421052631579*x^19.0+27.0*x-1.4736842105263157/x^19.0-1.3181818181818181*x^22.0+30.0*x-1.4090909090909092/x^22.0-1.28*x^25.0+33.0*x-1.36/x^25.0-1.25*x^28.0+36.0*x-1.3214285714285714/x^28.0-1.2258064516129032*x^31.0+39.0*x-1.2903225806451613/x^31.0-1.2058823529411764*x^34.0+42.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-345.0*x^14.0-425.0/x^18.0-468.0*x^17.0-560.0/x^21.0-609.0*x^20.0-713.0/x^24.0-768.0*x^23.0-884.0/x^27.0-945.0*x^26.0-1073.0/x^30.0-1140.0*x^29.0-1280.0/x^33.0-1353.0*x^32.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-345.0*14.0*x^13.0-425.0*-18.0/x^19.0-468.0*17.0*x^16.0-560.0*-21.0/x^22.0-609.0*20.0*x^19.0-713.0*-24.0/x^25.0-768.0*23.0*x^22.0-884.0*-27.0/x^28.0-945.0*26.0*x^25.0-1073.0*-30.0/x^31.0-1140.0*29.0*x^28.0-1280.0*-33.0/x^34.0-1353.0*32.0*x^31.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-4830.0*x^13.0+7650.0/x^19.0-7956.0*x^16.0+11760.0/x^22.0-12180.0*x^19.0+17112.0/x^25.0-17664.0*x^22.0+23868.0/x^28.0-24570.0*x^25.0+32190.0/x^31.0-33060.0*x^28.0+42240.0/x^34.0-43296.0*x^31.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.4375*x^16.0+24.0*x-1.5625/x^16.0-1.368421052631579*x^19.0+27.0*x-1.4736842105263157/x^19.0-1.3181818181818181*x^22.0+30.0*x-1.4090909090909092/x^22.0-1.28*x^25.0+33.0*x-1.36/x^25.0-1.25*x^28.0+36.0*x-1.3214285714285714/x^28.0-1.2258064516129032*x^31.0+39.0*x-1.2903225806451613/x^31.0-1.2058823529411764*x^34.0+42.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.4375/17.0*x^17.0+24.0/2.0*x^2.0-1.5625/-15.0/x^15.0-1.368421052631579/20.0*x^20.0+27.0/2.0*x^2.0-1.4736842105263157/-18.0/x^18.0-1.3181818181818181/23.0*x^23.0+30.0/2.0*x^2.0-1.4090909090909092/-21.0/x^21.0-1.28/26.0*x^26.0+33.0/2.0*x^2.0-1.36/-24.0/x^24.0-1.25/29.0*x^29.0+36.0/2.0*x^2.0-1.3214285714285714/-27.0/x^27.0-1.2258064516129032/32.0*x^32.0+39.0/2.0*x^2.0-1.2903225806451613/-30.0/x^30.0-1.2058823529411764/35.0*x^35.0+42.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/11.826086956521738*x^17.0+12.0*x^2.0+1.0/9.6/x^15.0-1.0/14.615384615384615*x^20.0+13.5*x^2.0+1.0/12.214285714285715/x^18.0-1.0/17.448275862068968*x^23.0+15.0*x^2.0+1.0/14.903225806451612/x^21.0-1.0/20.3125*x^26.0+16.5*x^2.0+1.0/17.64705882352941/x^24.0-1.0/23.2*x^29.0+18.0*x^2.0+1.0/20.43243243243243/x^27.0-1.0/26.105263157894736*x^32.0+19.5*x^2.0+1.0/23.25/x^30.0-1.0/29.02439024390244*x^35.0+21.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-4830.0*x^13.0+7650.0/x^19.0-7956.0*x^16.0+11760.0/x^22.0-12180.0*x^19.0+17112.0/x^25.0-17664.0*x^22.0+23868.0/x^28.0-24570.0*x^25.0+32190.0/x^31.0-33060.0*x^28.0+42240.0/x^34.0-43296.0*x^31.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-4830.0*13.0*x^12.0+7650.0*-19.0/x^20.0-7956.0*16.0*x^15.0+11760.0*-22.0/x^23.0-12180.0*19.0*x^18.0+17112.0*-25.0/x^26.0-17664.0*22.0*x^21.0+23868.0*-28.0/x^29.0-24570.0*25.0*x^24.0+32190.0*-31.0/x^32.0-33060.0*28.0*x^27.0+42240.0*-34.0/x^35.0-43296.0*31.0*x^30.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-62790.0*x^12.0-145350.0/x^20.0-127296.0*x^15.0-258720.0/x^23.0-231420.0*x^18.0-427800.0/x^26.0-388608.0*x^21.0-668304.0/x^29.0-614250.0*x^24.0-997890.0/x^32.0-925680.0*x^27.0-1436160.0/x^35.0-1342176.0*x^30.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/11.826086956521738*x^17.0+12.0*x^2.0+1.0/9.6/x^15.0-1.0/14.615384615384615*x^20.0+13.5*x^2.0+1.0/12.214285714285715/x^18.0-1.0/17.448275862068968*x^23.0+15.0*x^2.0+1.0/14.903225806451612/x^21.0-1.0/20.3125*x^26.0+16.5*x^2.0+1.0/17.64705882352941/x^24.0-1.0/23.2*x^29.0+18.0*x^2.0+1.0/20.43243243243243/x^27.0-1.0/26.105263157894736*x^32.0+19.5*x^2.0+1.0/23.25/x^30.0-1.0/29.02439024390244*x^35.0+21.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/11.826086956521738/18.0*x^18.0+12.0/3.0*x^3.0+1.0/9.6/-14.0/x^14.0-1.0/14.615384615384615/21.0*x^21.0+13.5/3.0*x^3.0+1.0/12.214285714285715/-17.0/x^17.0-1.0/17.448275862068968/24.0*x^24.0+15.0/3.0*x^3.0+1.0/14.903225806451612/-20.0/x^20.0-1.0/20.3125/27.0*x^27.0+16.5/3.0*x^3.0+1.0/17.64705882352941/-23.0/x^23.0-1.0/23.2/30.0*x^30.0+18.0/3.0*x^3.0+1.0/20.43243243243243/-26.0/x^26.0-1.0/26.105263157894736/33.0*x^33.0+19.5/3.0*x^3.0+1.0/23.25/-29.0/x^29.0-1.0/29.02439024390244/36.0*x^36.0+21.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/212.86956521739128*x^18.0+4.0*x^3.0-1.0/134.4/x^14.0-1.0/306.9230769230769*x^21.0+4.5*x^3.0-1.0/207.64285714285717/x^17.0-1.0/418.75862068965523*x^24.0+5.0*x^3.0-1.0/298.06451612903226/x^20.0-1.0/548.4375*x^27.0+5.5*x^3.0-1.0/405.8823529411764/x^23.0-1.0/696.0*x^30.0+6.0*x^3.0-1.0/531.2432432432432/x^26.0-1.0/861.4736842105262*x^33.0+6.5*x^3.0-1.0/674.25/x^29.0-1.0/1044.878048780488*x^36.0+7.0*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-62790.0*x^12.0-145350.0/x^20.0-127296.0*x^15.0-258720.0/x^23.0-231420.0*x^18.0-427800.0/x^26.0-388608.0*x^21.0-668304.0/x^29.0-614250.0*x^24.0-997890.0/x^32.0-925680.0*x^27.0-1436160.0/x^35.0-1342176.0*x^30.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-62790.0*12.0*x^11.0-145350.0*-20.0/x^21.0-127296.0*15.0*x^14.0-258720.0*-23.0/x^24.0-231420.0*18.0*x^17.0-427800.0*-26.0/x^27.0-388608.0*21.0*x^20.0-668304.0*-29.0/x^30.0-614250.0*24.0*x^23.0-997890.0*-32.0/x^33.0-925680.0*27.0*x^26.0-1436160.0*-35.0/x^36.0-1342176.0*30.0*x^29.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-753480.0*x^11.0+2907000.0/x^21.0-1909440.0*x^14.0+5950560.0/x^24.0-4165560.0*x^17.0+1.11228E7/x^27.0-8160768.0*x^20.0+1.9380816E7/x^30.0-1.4742E7*x^23.0+3.193248E7/x^33.0-2.499336E7*x^26.0+5.02656E7/x^36.0-4.026528E7*x^29.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/212.86956521739128*x^18.0+4.0*x^3.0-1.0/134.4/x^14.0-1.0/306.9230769230769*x^21.0+4.5*x^3.0-1.0/207.64285714285717/x^17.0-1.0/418.75862068965523*x^24.0+5.0*x^3.0-1.0/298.06451612903226/x^20.0-1.0/548.4375*x^27.0+5.5*x^3.0-1.0/405.8823529411764/x^23.0-1.0/696.0*x^30.0+6.0*x^3.0-1.0/531.2432432432432/x^26.0-1.0/861.4736842105262*x^33.0+6.5*x^3.0-1.0/674.25/x^29.0-1.0/1044.878048780488*x^36.0+7.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/212.86956521739128/19.0*x^19.0+4.0/4.0*x^4.0-1.0/134.4/-13.0/x^13.0-1.0/306.9230769230769/22.0*x^22.0+4.5/4.0*x^4.0-1.0/207.64285714285717/-16.0/x^16.0-1.0/418.75862068965523/25.0*x^25.0+5.0/4.0*x^4.0-1.0/298.06451612903226/-19.0/x^19.0-1.0/548.4375/28.0*x^28.0+5.5/4.0*x^4.0-1.0/405.8823529411764/-22.0/x^22.0-1.0/696.0/31.0*x^31.0+6.0/4.0*x^4.0-1.0/531.2432432432432/-25.0/x^25.0-1.0/861.4736842105262/34.0*x^34.0+6.5/4.0*x^4.0-1.0/674.25/-28.0/x^28.0-1.0/1044.878048780488/37.0*x^37.0+7.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/4044.5217391304345*x^19.0+x^4.0+1.0/1747.2/x^13.0-1.0/6752.3076923076915*x^22.0+1.125*x^4.0+1.0/3322.2857142857147/x^16.0-1.0/10468.96551724138*x^25.0+1.25*x^4.0+1.0/5663.225806451613/x^19.0-1.0/15356.25*x^28.0+1.375*x^4.0+1.0/8929.411764705881/x^22.0-1.0/21576.0*x^31.0+1.5*x^4.0+1.0/13281.08108108108/x^25.0-1.0/29290.105263157893*x^34.0+1.625*x^4.0+1.0/18879.0/x^28.0-1.0/38660.48780487805*x^37.0+1.75*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120591() {
 UsageCalculus.TestCase = 120591;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+25/x^17-26*x^18";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "25.0/x^17.0-26.0*x^18.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "25.0*-17.0/x^18.0-26.0*18.0*x^17.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-425.0/x^18.0-468.0*x^17.0";
 UsageCalculus.EqnSolArrayMap3[1] = "25.0/x^17.0-26.0*x^18.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "25.0/-16.0/x^16.0-26.0/19.0*x^19.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.5625/x^16.0-1.368421052631579*x^19.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-425.0/x^18.0-468.0*x^17.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-425.0*-18.0/x^19.0-468.0*17.0*x^16.0";
 UsageCalculus.EqnSolArrayMap2[2] = "7650.0/x^19.0-7956.0*x^16.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.5625/x^16.0-1.368421052631579*x^19.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.5625/-15.0/x^15.0-1.368421052631579/20.0*x^20.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/9.6/x^15.0-1.0/14.615384615384615*x^20.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "7650.0/x^19.0-7956.0*x^16.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "7650.0*-19.0/x^20.0-7956.0*16.0*x^15.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-145350.0/x^20.0-127296.0*x^15.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/9.6/x^15.0-1.0/14.615384615384615*x^20.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/9.6/-14.0/x^14.0-1.0/14.615384615384615/21.0*x^21.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/134.4/x^14.0-1.0/306.9230769230769*x^21.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-145350.0/x^20.0-127296.0*x^15.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-145350.0*-20.0/x^21.0-127296.0*15.0*x^14.0";
 UsageCalculus.EqnSolArrayMap2[4] = "2907000.0/x^21.0-1909440.0*x^14.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/134.4/x^14.0-1.0/306.9230769230769*x^21.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/134.4/-13.0/x^13.0-1.0/306.9230769230769/22.0*x^22.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/1747.2/x^13.0-1.0/6752.3076923076915*x^22.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120592() {
 UsageCalculus.TestCase = 120592;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-26+27*xyzxyzxyzxyzxyzxyzxyzxyzxyz^-19+28";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-26.0+27.0+28.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-0.0+27.0*0.0+28.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "-26.0+27.0+28.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-26.0*x+27.0*x+28.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "-26.0*x+27.0*x+28.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "-26.0*x+27.0*x+28.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-26.0/2.0*x^2.0+27.0/2.0*x^2.0+28.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-13.0*x^2.0+13.5*x^2.0+14.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "-13.0*x^2.0+13.5*x^2.0+14.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-13.0/3.0*x^3.0+13.5/3.0*x^3.0+14.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-4.333333333333333*x^3.0+4.5*x^3.0+4.666666666666667*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "-4.333333333333333*x^3.0+4.5*x^3.0+4.666666666666667*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-4.333333333333333/4.0*x^4.0+4.5/4.0*x^4.0+4.666666666666667/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0833333333333333*x^4.0+1.125*x^4.0+1.1666666666666667*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120593() {
 UsageCalculus.TestCase = 120593;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+27*xyzxyzxyzxyzxyzxyzxyzxyzxyz^-19+28/x^20-29*x^21+30*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-22";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "27.0+28.0/x^20.0-29.0*x^21.0+30.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+28.0*-20.0/x^21.0-29.0*21.0*x^20.0+30.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-560.0/x^21.0-609.0*x^20.0";
 UsageCalculus.EqnSolArrayMap3[1] = "27.0+28.0/x^20.0-29.0*x^21.0+30.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "27.0*x+28.0/-19.0/x^19.0-29.0/22.0*x^22.0+30.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "27.0*x-1.4736842105263157/x^19.0-1.3181818181818181*x^22.0+30.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-560.0/x^21.0-609.0*x^20.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-560.0*-21.0/x^22.0-609.0*20.0*x^19.0";
 UsageCalculus.EqnSolArrayMap2[2] = "11760.0/x^22.0-12180.0*x^19.0";
 UsageCalculus.EqnSolArrayMap3[2] = "27.0*x-1.4736842105263157/x^19.0-1.3181818181818181*x^22.0+30.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "27.0/2.0*x^2.0-1.4736842105263157/-18.0/x^18.0-1.3181818181818181/23.0*x^23.0+30.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "13.5*x^2.0+1.0/12.214285714285715/x^18.0-1.0/17.448275862068968*x^23.0+15.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "11760.0/x^22.0-12180.0*x^19.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "11760.0*-22.0/x^23.0-12180.0*19.0*x^18.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-258720.0/x^23.0-231420.0*x^18.0";
 UsageCalculus.EqnSolArrayMap3[3] = "13.5*x^2.0+1.0/12.214285714285715/x^18.0-1.0/17.448275862068968*x^23.0+15.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "13.5/3.0*x^3.0+1.0/12.214285714285715/-17.0/x^17.0-1.0/17.448275862068968/24.0*x^24.0+15.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "4.5*x^3.0-1.0/207.64285714285717/x^17.0-1.0/418.75862068965523*x^24.0+5.0*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-258720.0/x^23.0-231420.0*x^18.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-258720.0*-23.0/x^24.0-231420.0*18.0*x^17.0";
 UsageCalculus.EqnSolArrayMap2[4] = "5950560.0/x^24.0-4165560.0*x^17.0";
 UsageCalculus.EqnSolArrayMap3[4] = "4.5*x^3.0-1.0/207.64285714285717/x^17.0-1.0/418.75862068965523*x^24.0+5.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "4.5/4.0*x^4.0-1.0/207.64285714285717/-16.0/x^16.0-1.0/418.75862068965523/25.0*x^25.0+5.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.125*x^4.0+1.0/3322.2857142857147/x^16.0-1.0/10468.96551724138*x^25.0+1.25*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120594() {
 UsageCalculus.TestCase = 120594;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+28/xy^20-29*xy^21+30*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-22+31/xy^23-32*xy^24";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "28.0/xy^20.0-29.0*xy^21.0+30.0+31.0/xy^23.0-32.0*xy^24.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "28.0*-20.0/xy^21.0-29.0*21.0*xy^20.0+30.0*0.0+31.0*-23.0/xy^24.0-32.0*24.0*xy^23.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-560.0/xy^21.0-609.0*xy^20.0-713.0/xy^24.0-768.0*xy^23.0";
 UsageCalculus.EqnSolArrayMap3[1] = "28.0/xy^20.0-29.0*xy^21.0+30.0+31.0/xy^23.0-32.0*xy^24.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "28.0/-19.0/xy^19.0-29.0/22.0*xy^22.0+30.0*xy+31.0/-22.0/xy^22.0-32.0/25.0*xy^25.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.4736842105263157/xy^19.0-1.3181818181818181*xy^22.0+30.0*xy-1.4090909090909092/xy^22.0-1.28*xy^25.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-560.0/xy^21.0-609.0*xy^20.0-713.0/xy^24.0-768.0*xy^23.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-560.0*-21.0/xy^22.0-609.0*20.0*xy^19.0-713.0*-24.0/xy^25.0-768.0*23.0*xy^22.0";
 UsageCalculus.EqnSolArrayMap2[2] = "11760.0/xy^22.0-12180.0*xy^19.0+17112.0/xy^25.0-17664.0*xy^22.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.4736842105263157/xy^19.0-1.3181818181818181*xy^22.0+30.0*xy-1.4090909090909092/xy^22.0-1.28*xy^25.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.4736842105263157/-18.0/xy^18.0-1.3181818181818181/23.0*xy^23.0+30.0/2.0*xy^2.0-1.4090909090909092/-21.0/xy^21.0-1.28/26.0*xy^26.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/12.214285714285715/xy^18.0-1.0/17.448275862068968*xy^23.0+15.0*xy^2.0+1.0/14.903225806451612/xy^21.0-1.0/20.3125*xy^26.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "11760.0/xy^22.0-12180.0*xy^19.0+17112.0/xy^25.0-17664.0*xy^22.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "11760.0*-22.0/xy^23.0-12180.0*19.0*xy^18.0+17112.0*-25.0/xy^26.0-17664.0*22.0*xy^21.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-258720.0/xy^23.0-231420.0*xy^18.0-427800.0/xy^26.0-388608.0*xy^21.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/12.214285714285715/xy^18.0-1.0/17.448275862068968*xy^23.0+15.0*xy^2.0+1.0/14.903225806451612/xy^21.0-1.0/20.3125*xy^26.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/12.214285714285715/-17.0/xy^17.0-1.0/17.448275862068968/24.0*xy^24.0+15.0/3.0*xy^3.0+1.0/14.903225806451612/-20.0/xy^20.0-1.0/20.3125/27.0*xy^27.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/207.64285714285717/xy^17.0-1.0/418.75862068965523*xy^24.0+5.0*xy^3.0-1.0/298.06451612903226/xy^20.0-1.0/548.4375*xy^27.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-258720.0/xy^23.0-231420.0*xy^18.0-427800.0/xy^26.0-388608.0*xy^21.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-258720.0*-23.0/xy^24.0-231420.0*18.0*xy^17.0-427800.0*-26.0/xy^27.0-388608.0*21.0*xy^20.0";
 UsageCalculus.EqnSolArrayMap2[4] = "5950560.0/xy^24.0-4165560.0*xy^17.0+1.11228E7/xy^27.0-8160768.0*xy^20.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/207.64285714285717/xy^17.0-1.0/418.75862068965523*xy^24.0+5.0*xy^3.0-1.0/298.06451612903226/xy^20.0-1.0/548.4375*xy^27.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/207.64285714285717/-16.0/xy^16.0-1.0/418.75862068965523/25.0*xy^25.0+5.0/4.0*xy^4.0-1.0/298.06451612903226/-19.0/xy^19.0-1.0/548.4375/28.0*xy^28.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/3322.2857142857147/xy^16.0-1.0/10468.96551724138*xy^25.0+1.25*xy^4.0+1.0/5663.225806451613/xy^19.0-1.0/15356.25*xy^28.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120595() {
 UsageCalculus.TestCase = 120595;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-29*x^21+30*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-22+31/x^23-32*x^24+33*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-25+34/x^26";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-29.0*x^21.0+30.0+31.0/x^23.0-32.0*x^24.0+33.0+34.0/x^26.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-29.0*21.0*x^20.0+30.0*0.0+31.0*-23.0/x^24.0-32.0*24.0*x^23.0+33.0*0.0+34.0*-26.0/x^27.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-609.0*x^20.0-713.0/x^24.0-768.0*x^23.0-884.0/x^27.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-29.0*x^21.0+30.0+31.0/x^23.0-32.0*x^24.0+33.0+34.0/x^26.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-29.0/22.0*x^22.0+30.0*x+31.0/-22.0/x^22.0-32.0/25.0*x^25.0+33.0*x+34.0/-25.0/x^25.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.3181818181818181*x^22.0+30.0*x-1.4090909090909092/x^22.0-1.28*x^25.0+33.0*x-1.36/x^25.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-609.0*x^20.0-713.0/x^24.0-768.0*x^23.0-884.0/x^27.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-609.0*20.0*x^19.0-713.0*-24.0/x^25.0-768.0*23.0*x^22.0-884.0*-27.0/x^28.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-12180.0*x^19.0+17112.0/x^25.0-17664.0*x^22.0+23868.0/x^28.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.3181818181818181*x^22.0+30.0*x-1.4090909090909092/x^22.0-1.28*x^25.0+33.0*x-1.36/x^25.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.3181818181818181/23.0*x^23.0+30.0/2.0*x^2.0-1.4090909090909092/-21.0/x^21.0-1.28/26.0*x^26.0+33.0/2.0*x^2.0-1.36/-24.0/x^24.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/17.448275862068968*x^23.0+15.0*x^2.0+1.0/14.903225806451612/x^21.0-1.0/20.3125*x^26.0+16.5*x^2.0+1.0/17.64705882352941/x^24.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-12180.0*x^19.0+17112.0/x^25.0-17664.0*x^22.0+23868.0/x^28.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-12180.0*19.0*x^18.0+17112.0*-25.0/x^26.0-17664.0*22.0*x^21.0+23868.0*-28.0/x^29.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-231420.0*x^18.0-427800.0/x^26.0-388608.0*x^21.0-668304.0/x^29.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/17.448275862068968*x^23.0+15.0*x^2.0+1.0/14.903225806451612/x^21.0-1.0/20.3125*x^26.0+16.5*x^2.0+1.0/17.64705882352941/x^24.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/17.448275862068968/24.0*x^24.0+15.0/3.0*x^3.0+1.0/14.903225806451612/-20.0/x^20.0-1.0/20.3125/27.0*x^27.0+16.5/3.0*x^3.0+1.0/17.64705882352941/-23.0/x^23.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/418.75862068965523*x^24.0+5.0*x^3.0-1.0/298.06451612903226/x^20.0-1.0/548.4375*x^27.0+5.5*x^3.0-1.0/405.8823529411764/x^23.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-231420.0*x^18.0-427800.0/x^26.0-388608.0*x^21.0-668304.0/x^29.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-231420.0*18.0*x^17.0-427800.0*-26.0/x^27.0-388608.0*21.0*x^20.0-668304.0*-29.0/x^30.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-4165560.0*x^17.0+1.11228E7/x^27.0-8160768.0*x^20.0+1.9380816E7/x^30.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/418.75862068965523*x^24.0+5.0*x^3.0-1.0/298.06451612903226/x^20.0-1.0/548.4375*x^27.0+5.5*x^3.0-1.0/405.8823529411764/x^23.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/418.75862068965523/25.0*x^25.0+5.0/4.0*x^4.0-1.0/298.06451612903226/-19.0/x^19.0-1.0/548.4375/28.0*x^28.0+5.5/4.0*x^4.0-1.0/405.8823529411764/-22.0/x^22.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/10468.96551724138*x^25.0+1.25*x^4.0+1.0/5663.225806451613/x^19.0-1.0/15356.25*x^28.0+1.375*x^4.0+1.0/8929.411764705881/x^22.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120596() {
 UsageCalculus.TestCase = 120596;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+30*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-22+31/xyzxy^23-32*xyzxy^24+33*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-25+34/xyzxy^26-35*xyzxy^27+36";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xyzxy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "30.0+31.0/xyzxy^23.0-32.0*xyzxy^24.0+33.0+34.0/xyzxy^26.0-35.0*xyzxy^27.0+36.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+31.0*-23.0/xyzxy^24.0-32.0*24.0*xyzxy^23.0+33.0*0.0+34.0*-26.0/xyzxy^27.0-35.0*27.0*xyzxy^26.0+36.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-713.0/xyzxy^24.0-768.0*xyzxy^23.0-884.0/xyzxy^27.0-945.0*xyzxy^26.0";
 UsageCalculus.EqnSolArrayMap3[1] = "30.0+31.0/xyzxy^23.0-32.0*xyzxy^24.0+33.0+34.0/xyzxy^26.0-35.0*xyzxy^27.0+36.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "30.0*xyzxy+31.0/-22.0/xyzxy^22.0-32.0/25.0*xyzxy^25.0+33.0*xyzxy+34.0/-25.0/xyzxy^25.0-35.0/28.0*xyzxy^28.0+36.0*xyzxy";
 UsageCalculus.EqnSolArrayMap4[1] = "30.0*xyzxy-1.4090909090909092/xyzxy^22.0-1.28*xyzxy^25.0+33.0*xyzxy-1.36/xyzxy^25.0-1.25*xyzxy^28.0+36.0*xyzxy";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-713.0/xyzxy^24.0-768.0*xyzxy^23.0-884.0/xyzxy^27.0-945.0*xyzxy^26.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-713.0*-24.0/xyzxy^25.0-768.0*23.0*xyzxy^22.0-884.0*-27.0/xyzxy^28.0-945.0*26.0*xyzxy^25.0";
 UsageCalculus.EqnSolArrayMap2[2] = "17112.0/xyzxy^25.0-17664.0*xyzxy^22.0+23868.0/xyzxy^28.0-24570.0*xyzxy^25.0";
 UsageCalculus.EqnSolArrayMap3[2] = "30.0*xyzxy-1.4090909090909092/xyzxy^22.0-1.28*xyzxy^25.0+33.0*xyzxy-1.36/xyzxy^25.0-1.25*xyzxy^28.0+36.0*xyzxy";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "30.0/2.0*xyzxy^2.0-1.4090909090909092/-21.0/xyzxy^21.0-1.28/26.0*xyzxy^26.0+33.0/2.0*xyzxy^2.0-1.36/-24.0/xyzxy^24.0-1.25/29.0*xyzxy^29.0+36.0/2.0*xyzxy^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "15.0*xyzxy^2.0+1.0/14.903225806451612/xyzxy^21.0-1.0/20.3125*xyzxy^26.0+16.5*xyzxy^2.0+1.0/17.64705882352941/xyzxy^24.0-1.0/23.2*xyzxy^29.0+18.0*xyzxy^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "17112.0/xyzxy^25.0-17664.0*xyzxy^22.0+23868.0/xyzxy^28.0-24570.0*xyzxy^25.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "17112.0*-25.0/xyzxy^26.0-17664.0*22.0*xyzxy^21.0+23868.0*-28.0/xyzxy^29.0-24570.0*25.0*xyzxy^24.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-427800.0/xyzxy^26.0-388608.0*xyzxy^21.0-668304.0/xyzxy^29.0-614250.0*xyzxy^24.0";
 UsageCalculus.EqnSolArrayMap3[3] = "15.0*xyzxy^2.0+1.0/14.903225806451612/xyzxy^21.0-1.0/20.3125*xyzxy^26.0+16.5*xyzxy^2.0+1.0/17.64705882352941/xyzxy^24.0-1.0/23.2*xyzxy^29.0+18.0*xyzxy^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "15.0/3.0*xyzxy^3.0+1.0/14.903225806451612/-20.0/xyzxy^20.0-1.0/20.3125/27.0*xyzxy^27.0+16.5/3.0*xyzxy^3.0+1.0/17.64705882352941/-23.0/xyzxy^23.0-1.0/23.2/30.0*xyzxy^30.0+18.0/3.0*xyzxy^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "5.0*xyzxy^3.0-1.0/298.06451612903226/xyzxy^20.0-1.0/548.4375*xyzxy^27.0+5.5*xyzxy^3.0-1.0/405.8823529411764/xyzxy^23.0-1.0/696.0*xyzxy^30.0+6.0*xyzxy^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-427800.0/xyzxy^26.0-388608.0*xyzxy^21.0-668304.0/xyzxy^29.0-614250.0*xyzxy^24.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-427800.0*-26.0/xyzxy^27.0-388608.0*21.0*xyzxy^20.0-668304.0*-29.0/xyzxy^30.0-614250.0*24.0*xyzxy^23.0";
 UsageCalculus.EqnSolArrayMap2[4] = "1.11228E7/xyzxy^27.0-8160768.0*xyzxy^20.0+1.9380816E7/xyzxy^30.0-1.4742E7*xyzxy^23.0";
 UsageCalculus.EqnSolArrayMap3[4] = "5.0*xyzxy^3.0-1.0/298.06451612903226/xyzxy^20.0-1.0/548.4375*xyzxy^27.0+5.5*xyzxy^3.0-1.0/405.8823529411764/xyzxy^23.0-1.0/696.0*xyzxy^30.0+6.0*xyzxy^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "5.0/4.0*xyzxy^4.0-1.0/298.06451612903226/-19.0/xyzxy^19.0-1.0/548.4375/28.0*xyzxy^28.0+5.5/4.0*xyzxy^4.0-1.0/405.8823529411764/-22.0/xyzxy^22.0-1.0/696.0/31.0*xyzxy^31.0+6.0/4.0*xyzxy^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.25*xyzxy^4.0+1.0/5663.225806451613/xyzxy^19.0-1.0/15356.25*xyzxy^28.0+1.375*xyzxy^4.0+1.0/8929.411764705881/xyzxy^22.0-1.0/21576.0*xyzxy^31.0+1.5*xyzxy^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120597() {
 UsageCalculus.TestCase = 120597;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+31/x^23-32*x^24+33*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-25+34/x^26-35*x^27+36+37/x^29-38*x^30";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "31.0/x^23.0-32.0*x^24.0+33.0+34.0/x^26.0-35.0*x^27.0+36.0+37.0/x^29.0-38.0*x^30.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "31.0*-23.0/x^24.0-32.0*24.0*x^23.0+33.0*0.0+34.0*-26.0/x^27.0-35.0*27.0*x^26.0+36.0*0.0+37.0*-29.0/x^30.0-38.0*30.0*x^29.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-713.0/x^24.0-768.0*x^23.0-884.0/x^27.0-945.0*x^26.0-1073.0/x^30.0-1140.0*x^29.0";
 UsageCalculus.EqnSolArrayMap3[1] = "31.0/x^23.0-32.0*x^24.0+33.0+34.0/x^26.0-35.0*x^27.0+36.0+37.0/x^29.0-38.0*x^30.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "31.0/-22.0/x^22.0-32.0/25.0*x^25.0+33.0*x+34.0/-25.0/x^25.0-35.0/28.0*x^28.0+36.0*x+37.0/-28.0/x^28.0-38.0/31.0*x^31.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.4090909090909092/x^22.0-1.28*x^25.0+33.0*x-1.36/x^25.0-1.25*x^28.0+36.0*x-1.3214285714285714/x^28.0-1.2258064516129032*x^31.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-713.0/x^24.0-768.0*x^23.0-884.0/x^27.0-945.0*x^26.0-1073.0/x^30.0-1140.0*x^29.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-713.0*-24.0/x^25.0-768.0*23.0*x^22.0-884.0*-27.0/x^28.0-945.0*26.0*x^25.0-1073.0*-30.0/x^31.0-1140.0*29.0*x^28.0";
 UsageCalculus.EqnSolArrayMap2[2] = "17112.0/x^25.0-17664.0*x^22.0+23868.0/x^28.0-24570.0*x^25.0+32190.0/x^31.0-33060.0*x^28.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.4090909090909092/x^22.0-1.28*x^25.0+33.0*x-1.36/x^25.0-1.25*x^28.0+36.0*x-1.3214285714285714/x^28.0-1.2258064516129032*x^31.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.4090909090909092/-21.0/x^21.0-1.28/26.0*x^26.0+33.0/2.0*x^2.0-1.36/-24.0/x^24.0-1.25/29.0*x^29.0+36.0/2.0*x^2.0-1.3214285714285714/-27.0/x^27.0-1.2258064516129032/32.0*x^32.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/14.903225806451612/x^21.0-1.0/20.3125*x^26.0+16.5*x^2.0+1.0/17.64705882352941/x^24.0-1.0/23.2*x^29.0+18.0*x^2.0+1.0/20.43243243243243/x^27.0-1.0/26.105263157894736*x^32.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "17112.0/x^25.0-17664.0*x^22.0+23868.0/x^28.0-24570.0*x^25.0+32190.0/x^31.0-33060.0*x^28.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "17112.0*-25.0/x^26.0-17664.0*22.0*x^21.0+23868.0*-28.0/x^29.0-24570.0*25.0*x^24.0+32190.0*-31.0/x^32.0-33060.0*28.0*x^27.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-427800.0/x^26.0-388608.0*x^21.0-668304.0/x^29.0-614250.0*x^24.0-997890.0/x^32.0-925680.0*x^27.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/14.903225806451612/x^21.0-1.0/20.3125*x^26.0+16.5*x^2.0+1.0/17.64705882352941/x^24.0-1.0/23.2*x^29.0+18.0*x^2.0+1.0/20.43243243243243/x^27.0-1.0/26.105263157894736*x^32.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/14.903225806451612/-20.0/x^20.0-1.0/20.3125/27.0*x^27.0+16.5/3.0*x^3.0+1.0/17.64705882352941/-23.0/x^23.0-1.0/23.2/30.0*x^30.0+18.0/3.0*x^3.0+1.0/20.43243243243243/-26.0/x^26.0-1.0/26.105263157894736/33.0*x^33.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/298.06451612903226/x^20.0-1.0/548.4375*x^27.0+5.5*x^3.0-1.0/405.8823529411764/x^23.0-1.0/696.0*x^30.0+6.0*x^3.0-1.0/531.2432432432432/x^26.0-1.0/861.4736842105262*x^33.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-427800.0/x^26.0-388608.0*x^21.0-668304.0/x^29.0-614250.0*x^24.0-997890.0/x^32.0-925680.0*x^27.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-427800.0*-26.0/x^27.0-388608.0*21.0*x^20.0-668304.0*-29.0/x^30.0-614250.0*24.0*x^23.0-997890.0*-32.0/x^33.0-925680.0*27.0*x^26.0";
 UsageCalculus.EqnSolArrayMap2[4] = "1.11228E7/x^27.0-8160768.0*x^20.0+1.9380816E7/x^30.0-1.4742E7*x^23.0+3.193248E7/x^33.0-2.499336E7*x^26.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/298.06451612903226/x^20.0-1.0/548.4375*x^27.0+5.5*x^3.0-1.0/405.8823529411764/x^23.0-1.0/696.0*x^30.0+6.0*x^3.0-1.0/531.2432432432432/x^26.0-1.0/861.4736842105262*x^33.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/298.06451612903226/-19.0/x^19.0-1.0/548.4375/28.0*x^28.0+5.5/4.0*x^4.0-1.0/405.8823529411764/-22.0/x^22.0-1.0/696.0/31.0*x^31.0+6.0/4.0*x^4.0-1.0/531.2432432432432/-25.0/x^25.0-1.0/861.4736842105262/34.0*x^34.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/5663.225806451613/x^19.0-1.0/15356.25*x^28.0+1.375*x^4.0+1.0/8929.411764705881/x^22.0-1.0/21576.0*x^31.0+1.5*x^4.0+1.0/13281.08108108108/x^25.0-1.0/29290.105263157893*x^34.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120598() {
 UsageCalculus.TestCase = 120598;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-32*x^24+33*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-25+34/x^26-35*x^27+36+37/x^29-38*x^30+39+40/x^32";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-32.0*x^24.0+33.0+34.0/x^26.0-35.0*x^27.0+36.0+37.0/x^29.0-38.0*x^30.0+39.0+40.0/x^32.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-32.0*24.0*x^23.0+33.0*0.0+34.0*-26.0/x^27.0-35.0*27.0*x^26.0+36.0*0.0+37.0*-29.0/x^30.0-38.0*30.0*x^29.0+39.0*0.0+40.0*-32.0/x^33.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-768.0*x^23.0-884.0/x^27.0-945.0*x^26.0-1073.0/x^30.0-1140.0*x^29.0-1280.0/x^33.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-32.0*x^24.0+33.0+34.0/x^26.0-35.0*x^27.0+36.0+37.0/x^29.0-38.0*x^30.0+39.0+40.0/x^32.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-32.0/25.0*x^25.0+33.0*x+34.0/-25.0/x^25.0-35.0/28.0*x^28.0+36.0*x+37.0/-28.0/x^28.0-38.0/31.0*x^31.0+39.0*x+40.0/-31.0/x^31.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.28*x^25.0+33.0*x-1.36/x^25.0-1.25*x^28.0+36.0*x-1.3214285714285714/x^28.0-1.2258064516129032*x^31.0+39.0*x-1.2903225806451613/x^31.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-768.0*x^23.0-884.0/x^27.0-945.0*x^26.0-1073.0/x^30.0-1140.0*x^29.0-1280.0/x^33.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-768.0*23.0*x^22.0-884.0*-27.0/x^28.0-945.0*26.0*x^25.0-1073.0*-30.0/x^31.0-1140.0*29.0*x^28.0-1280.0*-33.0/x^34.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-17664.0*x^22.0+23868.0/x^28.0-24570.0*x^25.0+32190.0/x^31.0-33060.0*x^28.0+42240.0/x^34.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.28*x^25.0+33.0*x-1.36/x^25.0-1.25*x^28.0+36.0*x-1.3214285714285714/x^28.0-1.2258064516129032*x^31.0+39.0*x-1.2903225806451613/x^31.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.28/26.0*x^26.0+33.0/2.0*x^2.0-1.36/-24.0/x^24.0-1.25/29.0*x^29.0+36.0/2.0*x^2.0-1.3214285714285714/-27.0/x^27.0-1.2258064516129032/32.0*x^32.0+39.0/2.0*x^2.0-1.2903225806451613/-30.0/x^30.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/20.3125*x^26.0+16.5*x^2.0+1.0/17.64705882352941/x^24.0-1.0/23.2*x^29.0+18.0*x^2.0+1.0/20.43243243243243/x^27.0-1.0/26.105263157894736*x^32.0+19.5*x^2.0+1.0/23.25/x^30.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-17664.0*x^22.0+23868.0/x^28.0-24570.0*x^25.0+32190.0/x^31.0-33060.0*x^28.0+42240.0/x^34.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-17664.0*22.0*x^21.0+23868.0*-28.0/x^29.0-24570.0*25.0*x^24.0+32190.0*-31.0/x^32.0-33060.0*28.0*x^27.0+42240.0*-34.0/x^35.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-388608.0*x^21.0-668304.0/x^29.0-614250.0*x^24.0-997890.0/x^32.0-925680.0*x^27.0-1436160.0/x^35.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/20.3125*x^26.0+16.5*x^2.0+1.0/17.64705882352941/x^24.0-1.0/23.2*x^29.0+18.0*x^2.0+1.0/20.43243243243243/x^27.0-1.0/26.105263157894736*x^32.0+19.5*x^2.0+1.0/23.25/x^30.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/20.3125/27.0*x^27.0+16.5/3.0*x^3.0+1.0/17.64705882352941/-23.0/x^23.0-1.0/23.2/30.0*x^30.0+18.0/3.0*x^3.0+1.0/20.43243243243243/-26.0/x^26.0-1.0/26.105263157894736/33.0*x^33.0+19.5/3.0*x^3.0+1.0/23.25/-29.0/x^29.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/548.4375*x^27.0+5.5*x^3.0-1.0/405.8823529411764/x^23.0-1.0/696.0*x^30.0+6.0*x^3.0-1.0/531.2432432432432/x^26.0-1.0/861.4736842105262*x^33.0+6.5*x^3.0-1.0/674.25/x^29.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-388608.0*x^21.0-668304.0/x^29.0-614250.0*x^24.0-997890.0/x^32.0-925680.0*x^27.0-1436160.0/x^35.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-388608.0*21.0*x^20.0-668304.0*-29.0/x^30.0-614250.0*24.0*x^23.0-997890.0*-32.0/x^33.0-925680.0*27.0*x^26.0-1436160.0*-35.0/x^36.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-8160768.0*x^20.0+1.9380816E7/x^30.0-1.4742E7*x^23.0+3.193248E7/x^33.0-2.499336E7*x^26.0+5.02656E7/x^36.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/548.4375*x^27.0+5.5*x^3.0-1.0/405.8823529411764/x^23.0-1.0/696.0*x^30.0+6.0*x^3.0-1.0/531.2432432432432/x^26.0-1.0/861.4736842105262*x^33.0+6.5*x^3.0-1.0/674.25/x^29.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/548.4375/28.0*x^28.0+5.5/4.0*x^4.0-1.0/405.8823529411764/-22.0/x^22.0-1.0/696.0/31.0*x^31.0+6.0/4.0*x^4.0-1.0/531.2432432432432/-25.0/x^25.0-1.0/861.4736842105262/34.0*x^34.0+6.5/4.0*x^4.0-1.0/674.25/-28.0/x^28.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/15356.25*x^28.0+1.375*x^4.0+1.0/8929.411764705881/x^22.0-1.0/21576.0*x^31.0+1.5*x^4.0+1.0/13281.08108108108/x^25.0-1.0/29290.105263157893*x^34.0+1.625*x^4.0+1.0/18879.0/x^28.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120599() {
 UsageCalculus.TestCase = 120599;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+33*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-25+34/xy^26-35*xy^27+36+37/xy^29-38*xy^30+39+40/xy^32-41*xy^33+42*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-34";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "33.0+34.0/xy^26.0-35.0*xy^27.0+36.0+37.0/xy^29.0-38.0*xy^30.0+39.0+40.0/xy^32.0-41.0*xy^33.0+42.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+34.0*-26.0/xy^27.0-35.0*27.0*xy^26.0+36.0*0.0+37.0*-29.0/xy^30.0-38.0*30.0*xy^29.0+39.0*0.0+40.0*-32.0/xy^33.0-41.0*33.0*xy^32.0+42.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-884.0/xy^27.0-945.0*xy^26.0-1073.0/xy^30.0-1140.0*xy^29.0-1280.0/xy^33.0-1353.0*xy^32.0";
 UsageCalculus.EqnSolArrayMap3[1] = "33.0+34.0/xy^26.0-35.0*xy^27.0+36.0+37.0/xy^29.0-38.0*xy^30.0+39.0+40.0/xy^32.0-41.0*xy^33.0+42.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "33.0*xy+34.0/-25.0/xy^25.0-35.0/28.0*xy^28.0+36.0*xy+37.0/-28.0/xy^28.0-38.0/31.0*xy^31.0+39.0*xy+40.0/-31.0/xy^31.0-41.0/34.0*xy^34.0+42.0*xy";
 UsageCalculus.EqnSolArrayMap4[1] = "33.0*xy-1.36/xy^25.0-1.25*xy^28.0+36.0*xy-1.3214285714285714/xy^28.0-1.2258064516129032*xy^31.0+39.0*xy-1.2903225806451613/xy^31.0-1.2058823529411764*xy^34.0+42.0*xy";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-884.0/xy^27.0-945.0*xy^26.0-1073.0/xy^30.0-1140.0*xy^29.0-1280.0/xy^33.0-1353.0*xy^32.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-884.0*-27.0/xy^28.0-945.0*26.0*xy^25.0-1073.0*-30.0/xy^31.0-1140.0*29.0*xy^28.0-1280.0*-33.0/xy^34.0-1353.0*32.0*xy^31.0";
 UsageCalculus.EqnSolArrayMap2[2] = "23868.0/xy^28.0-24570.0*xy^25.0+32190.0/xy^31.0-33060.0*xy^28.0+42240.0/xy^34.0-43296.0*xy^31.0";
 UsageCalculus.EqnSolArrayMap3[2] = "33.0*xy-1.36/xy^25.0-1.25*xy^28.0+36.0*xy-1.3214285714285714/xy^28.0-1.2258064516129032*xy^31.0+39.0*xy-1.2903225806451613/xy^31.0-1.2058823529411764*xy^34.0+42.0*xy";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "33.0/2.0*xy^2.0-1.36/-24.0/xy^24.0-1.25/29.0*xy^29.0+36.0/2.0*xy^2.0-1.3214285714285714/-27.0/xy^27.0-1.2258064516129032/32.0*xy^32.0+39.0/2.0*xy^2.0-1.2903225806451613/-30.0/xy^30.0-1.2058823529411764/35.0*xy^35.0+42.0/2.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "16.5*xy^2.0+1.0/17.64705882352941/xy^24.0-1.0/23.2*xy^29.0+18.0*xy^2.0+1.0/20.43243243243243/xy^27.0-1.0/26.105263157894736*xy^32.0+19.5*xy^2.0+1.0/23.25/xy^30.0-1.0/29.02439024390244*xy^35.0+21.0*xy^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "23868.0/xy^28.0-24570.0*xy^25.0+32190.0/xy^31.0-33060.0*xy^28.0+42240.0/xy^34.0-43296.0*xy^31.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "23868.0*-28.0/xy^29.0-24570.0*25.0*xy^24.0+32190.0*-31.0/xy^32.0-33060.0*28.0*xy^27.0+42240.0*-34.0/xy^35.0-43296.0*31.0*xy^30.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-668304.0/xy^29.0-614250.0*xy^24.0-997890.0/xy^32.0-925680.0*xy^27.0-1436160.0/xy^35.0-1342176.0*xy^30.0";
 UsageCalculus.EqnSolArrayMap3[3] = "16.5*xy^2.0+1.0/17.64705882352941/xy^24.0-1.0/23.2*xy^29.0+18.0*xy^2.0+1.0/20.43243243243243/xy^27.0-1.0/26.105263157894736*xy^32.0+19.5*xy^2.0+1.0/23.25/xy^30.0-1.0/29.02439024390244*xy^35.0+21.0*xy^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "16.5/3.0*xy^3.0+1.0/17.64705882352941/-23.0/xy^23.0-1.0/23.2/30.0*xy^30.0+18.0/3.0*xy^3.0+1.0/20.43243243243243/-26.0/xy^26.0-1.0/26.105263157894736/33.0*xy^33.0+19.5/3.0*xy^3.0+1.0/23.25/-29.0/xy^29.0-1.0/29.02439024390244/36.0*xy^36.0+21.0/3.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "5.5*xy^3.0-1.0/405.8823529411764/xy^23.0-1.0/696.0*xy^30.0+6.0*xy^3.0-1.0/531.2432432432432/xy^26.0-1.0/861.4736842105262*xy^33.0+6.5*xy^3.0-1.0/674.25/xy^29.0-1.0/1044.878048780488*xy^36.0+7.0*xy^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-668304.0/xy^29.0-614250.0*xy^24.0-997890.0/xy^32.0-925680.0*xy^27.0-1436160.0/xy^35.0-1342176.0*xy^30.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-668304.0*-29.0/xy^30.0-614250.0*24.0*xy^23.0-997890.0*-32.0/xy^33.0-925680.0*27.0*xy^26.0-1436160.0*-35.0/xy^36.0-1342176.0*30.0*xy^29.0";
 UsageCalculus.EqnSolArrayMap2[4] = "1.9380816E7/xy^30.0-1.4742E7*xy^23.0+3.193248E7/xy^33.0-2.499336E7*xy^26.0+5.02656E7/xy^36.0-4.026528E7*xy^29.0";
 UsageCalculus.EqnSolArrayMap3[4] = "5.5*xy^3.0-1.0/405.8823529411764/xy^23.0-1.0/696.0*xy^30.0+6.0*xy^3.0-1.0/531.2432432432432/xy^26.0-1.0/861.4736842105262*xy^33.0+6.5*xy^3.0-1.0/674.25/xy^29.0-1.0/1044.878048780488*xy^36.0+7.0*xy^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "5.5/4.0*xy^4.0-1.0/405.8823529411764/-22.0/xy^22.0-1.0/696.0/31.0*xy^31.0+6.0/4.0*xy^4.0-1.0/531.2432432432432/-25.0/xy^25.0-1.0/861.4736842105262/34.0*xy^34.0+6.5/4.0*xy^4.0-1.0/674.25/-28.0/xy^28.0-1.0/1044.878048780488/37.0*xy^37.0+7.0/4.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.375*xy^4.0+1.0/8929.411764705881/xy^22.0-1.0/21576.0*xy^31.0+1.5*xy^4.0+1.0/13281.08108108108/xy^25.0-1.0/29290.105263157893*xy^34.0+1.625*xy^4.0+1.0/18879.0/xy^28.0-1.0/38660.48780487805*xy^37.0+1.75*xy^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120600() {
 UsageCalculus.TestCase = 120600;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+34/x^26-35*x^27+36+37/x^29-38*x^30+39+40/x^32-41*x^33+42*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-34+43/x^35-44*x^36";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "34.0/x^26.0-35.0*x^27.0+36.0+37.0/x^29.0-38.0*x^30.0+39.0+40.0/x^32.0-41.0*x^33.0+42.0+43.0/x^35.0-44.0*x^36.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "34.0*-26.0/x^27.0-35.0*27.0*x^26.0+36.0*0.0+37.0*-29.0/x^30.0-38.0*30.0*x^29.0+39.0*0.0+40.0*-32.0/x^33.0-41.0*33.0*x^32.0+42.0*0.0+43.0*-35.0/x^36.0-44.0*36.0*x^35.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-884.0/x^27.0-945.0*x^26.0-1073.0/x^30.0-1140.0*x^29.0-1280.0/x^33.0-1353.0*x^32.0-1505.0/x^36.0-1584.0*x^35.0";
 UsageCalculus.EqnSolArrayMap3[1] = "34.0/x^26.0-35.0*x^27.0+36.0+37.0/x^29.0-38.0*x^30.0+39.0+40.0/x^32.0-41.0*x^33.0+42.0+43.0/x^35.0-44.0*x^36.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "34.0/-25.0/x^25.0-35.0/28.0*x^28.0+36.0*x+37.0/-28.0/x^28.0-38.0/31.0*x^31.0+39.0*x+40.0/-31.0/x^31.0-41.0/34.0*x^34.0+42.0*x+43.0/-34.0/x^34.0-44.0/37.0*x^37.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.36/x^25.0-1.25*x^28.0+36.0*x-1.3214285714285714/x^28.0-1.2258064516129032*x^31.0+39.0*x-1.2903225806451613/x^31.0-1.2058823529411764*x^34.0+42.0*x-1.2647058823529411/x^34.0-1.1891891891891893*x^37.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-884.0/x^27.0-945.0*x^26.0-1073.0/x^30.0-1140.0*x^29.0-1280.0/x^33.0-1353.0*x^32.0-1505.0/x^36.0-1584.0*x^35.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-884.0*-27.0/x^28.0-945.0*26.0*x^25.0-1073.0*-30.0/x^31.0-1140.0*29.0*x^28.0-1280.0*-33.0/x^34.0-1353.0*32.0*x^31.0-1505.0*-36.0/x^37.0-1584.0*35.0*x^34.0";
 UsageCalculus.EqnSolArrayMap2[2] = "23868.0/x^28.0-24570.0*x^25.0+32190.0/x^31.0-33060.0*x^28.0+42240.0/x^34.0-43296.0*x^31.0+54180.0/x^37.0-55440.0*x^34.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.36/x^25.0-1.25*x^28.0+36.0*x-1.3214285714285714/x^28.0-1.2258064516129032*x^31.0+39.0*x-1.2903225806451613/x^31.0-1.2058823529411764*x^34.0+42.0*x-1.2647058823529411/x^34.0-1.1891891891891893*x^37.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.36/-24.0/x^24.0-1.25/29.0*x^29.0+36.0/2.0*x^2.0-1.3214285714285714/-27.0/x^27.0-1.2258064516129032/32.0*x^32.0+39.0/2.0*x^2.0-1.2903225806451613/-30.0/x^30.0-1.2058823529411764/35.0*x^35.0+42.0/2.0*x^2.0-1.2647058823529411/-33.0/x^33.0-1.1891891891891893/38.0*x^38.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/17.64705882352941/x^24.0-1.0/23.2*x^29.0+18.0*x^2.0+1.0/20.43243243243243/x^27.0-1.0/26.105263157894736*x^32.0+19.5*x^2.0+1.0/23.25/x^30.0-1.0/29.02439024390244*x^35.0+21.0*x^2.0+1.0/26.093023255813954/x^33.0-1.0/31.954545454545453*x^38.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "23868.0/x^28.0-24570.0*x^25.0+32190.0/x^31.0-33060.0*x^28.0+42240.0/x^34.0-43296.0*x^31.0+54180.0/x^37.0-55440.0*x^34.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "23868.0*-28.0/x^29.0-24570.0*25.0*x^24.0+32190.0*-31.0/x^32.0-33060.0*28.0*x^27.0+42240.0*-34.0/x^35.0-43296.0*31.0*x^30.0+54180.0*-37.0/x^38.0-55440.0*34.0*x^33.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-668304.0/x^29.0-614250.0*x^24.0-997890.0/x^32.0-925680.0*x^27.0-1436160.0/x^35.0-1342176.0*x^30.0-2004660.0/x^38.0-1884960.0*x^33.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/17.64705882352941/x^24.0-1.0/23.2*x^29.0+18.0*x^2.0+1.0/20.43243243243243/x^27.0-1.0/26.105263157894736*x^32.0+19.5*x^2.0+1.0/23.25/x^30.0-1.0/29.02439024390244*x^35.0+21.0*x^2.0+1.0/26.093023255813954/x^33.0-1.0/31.954545454545453*x^38.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/17.64705882352941/-23.0/x^23.0-1.0/23.2/30.0*x^30.0+18.0/3.0*x^3.0+1.0/20.43243243243243/-26.0/x^26.0-1.0/26.105263157894736/33.0*x^33.0+19.5/3.0*x^3.0+1.0/23.25/-29.0/x^29.0-1.0/29.02439024390244/36.0*x^36.0+21.0/3.0*x^3.0+1.0/26.093023255813954/-32.0/x^32.0-1.0/31.954545454545453/39.0*x^39.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/405.8823529411764/x^23.0-1.0/696.0*x^30.0+6.0*x^3.0-1.0/531.2432432432432/x^26.0-1.0/861.4736842105262*x^33.0+6.5*x^3.0-1.0/674.25/x^29.0-1.0/1044.878048780488*x^36.0+7.0*x^3.0-1.0/834.9767441860465/x^32.0-1.0/1246.2272727272727*x^39.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-668304.0/x^29.0-614250.0*x^24.0-997890.0/x^32.0-925680.0*x^27.0-1436160.0/x^35.0-1342176.0*x^30.0-2004660.0/x^38.0-1884960.0*x^33.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-668304.0*-29.0/x^30.0-614250.0*24.0*x^23.0-997890.0*-32.0/x^33.0-925680.0*27.0*x^26.0-1436160.0*-35.0/x^36.0-1342176.0*30.0*x^29.0-2004660.0*-38.0/x^39.0-1884960.0*33.0*x^32.0";
 UsageCalculus.EqnSolArrayMap2[4] = "1.9380816E7/x^30.0-1.4742E7*x^23.0+3.193248E7/x^33.0-2.499336E7*x^26.0+5.02656E7/x^36.0-4.026528E7*x^29.0+7.617708E7/x^39.0-6.220368E7*x^32.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/405.8823529411764/x^23.0-1.0/696.0*x^30.0+6.0*x^3.0-1.0/531.2432432432432/x^26.0-1.0/861.4736842105262*x^33.0+6.5*x^3.0-1.0/674.25/x^29.0-1.0/1044.878048780488*x^36.0+7.0*x^3.0-1.0/834.9767441860465/x^32.0-1.0/1246.2272727272727*x^39.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/405.8823529411764/-22.0/x^22.0-1.0/696.0/31.0*x^31.0+6.0/4.0*x^4.0-1.0/531.2432432432432/-25.0/x^25.0-1.0/861.4736842105262/34.0*x^34.0+6.5/4.0*x^4.0-1.0/674.25/-28.0/x^28.0-1.0/1044.878048780488/37.0*x^37.0+7.0/4.0*x^4.0-1.0/834.9767441860465/-31.0/x^31.0-1.0/1246.2272727272727/40.0*x^40.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/8929.411764705881/x^22.0-1.0/21576.0*x^31.0+1.5*x^4.0+1.0/13281.08108108108/x^25.0-1.0/29290.105263157893*x^34.0+1.625*x^4.0+1.0/18879.0/x^28.0-1.0/38660.48780487805*x^37.0+1.75*x^4.0+1.0/25884.279069767443/x^31.0-1.0/49849.09090909091*x^40.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
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

