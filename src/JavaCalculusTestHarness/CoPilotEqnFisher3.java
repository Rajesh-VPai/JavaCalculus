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
public class CoPilotEqnFisher3 {
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
               case 131301L:
 TestCaseDiff131301(); 
 break;
case 131302L:
 TestCaseDiff131302(); 
 break;
case 131303L:
 TestCaseDiff131303(); 
 break;
case 131304L:
 TestCaseDiff131304(); 
 break;
case 131305L:
 TestCaseDiff131305(); 
 break;
case 131306L:
 TestCaseDiff131306(); 
 break;
case 131307L:
 TestCaseDiff131307(); 
 break;
case 131308L:
 TestCaseDiff131308(); 
 break;
case 131309L:
 TestCaseDiff131309(); 
 break;
case 131310L:
 TestCaseDiff131310(); 
 break;
case 131311L:
 TestCaseDiff131311(); 
 break;
case 131312L:
 TestCaseDiff131312(); 
 break;
case 131313L:
 TestCaseDiff131313(); 
 break;
case 131314L:
 TestCaseDiff131314(); 
 break;
case 131315L:
 TestCaseDiff131315(); 
 break;
case 131316L:
 TestCaseDiff131316(); 
 break;
case 131317L:
 TestCaseDiff131317(); 
 break;
case 131318L:
 TestCaseDiff131318(); 
 break;
case 131319L:
 TestCaseDiff131319(); 
 break;
case 131320L:
 TestCaseDiff131320(); 
 break;
case 131321L:
 TestCaseDiff131321(); 
 break;
case 131322L:
 TestCaseDiff131322(); 
 break;
case 131323L:
 TestCaseDiff131323(); 
 break;
case 131324L:
 TestCaseDiff131324(); 
 break;
case 131325L:
 TestCaseDiff131325(); 
 break;
case 131326L:
 TestCaseDiff131326(); 
 break;
case 131327L:
 TestCaseDiff131327(); 
 break;
case 131328L:
 TestCaseDiff131328(); 
 break;
case 131329L:
 TestCaseDiff131329(); 
 break;
case 131330L:
 TestCaseDiff131330(); 
 break;
case 131331L:
 TestCaseDiff131331(); 
 break;
case 131332L:
 TestCaseDiff131332(); 
 break;
case 131333L:
 TestCaseDiff131333(); 
 break;
case 131334L:
 TestCaseDiff131334(); 
 break;
case 131335L:
 TestCaseDiff131335(); 
 break;
case 131336L:
 TestCaseDiff131336(); 
 break;
case 131337L:
 TestCaseDiff131337(); 
 break;
case 131338L:
 TestCaseDiff131338(); 
 break;
case 131339L:
 TestCaseDiff131339(); 
 break;
case 131340L:
 TestCaseDiff131340(); 
 break;
case 131341L:
 TestCaseDiff131341(); 
 break;
case 131342L:
 TestCaseDiff131342(); 
 break;
case 131343L:
 TestCaseDiff131343(); 
 break;
case 131344L:
 TestCaseDiff131344(); 
 break;
case 131345L:
 TestCaseDiff131345(); 
 break;
case 131346L:
 TestCaseDiff131346(); 
 break;
case 131347L:
 TestCaseDiff131347(); 
 break;
case 131348L:
 TestCaseDiff131348(); 
 break;
case 131349L:
 TestCaseDiff131349(); 
 break;
case 131350L:
 TestCaseDiff131350(); 
 break;
case 131351L:
 TestCaseDiff131351(); 
 break;
case 131352L:
 TestCaseDiff131352(); 
 break;
case 131353L:
 TestCaseDiff131353(); 
 break;
case 131354L:
 TestCaseDiff131354(); 
 break;
case 131355L:
 TestCaseDiff131355(); 
 break;
case 131356L:
 TestCaseDiff131356(); 
 break;
case 131357L:
 TestCaseDiff131357(); 
 break;
case 131358L:
 TestCaseDiff131358(); 
 break;
case 131359L:
 TestCaseDiff131359(); 
 break;
case 131360L:
 TestCaseDiff131360(); 
 break;
case 131361L:
 TestCaseDiff131361(); 
 break;
case 131362L:
 TestCaseDiff131362(); 
 break;
case 131363L:
 TestCaseDiff131363(); 
 break;
case 131364L:
 TestCaseDiff131364(); 
 break;
case 131365L:
 TestCaseDiff131365(); 
 break;
case 131366L:
 TestCaseDiff131366(); 
 break;
case 131367L:
 TestCaseDiff131367(); 
 break;
case 131368L:
 TestCaseDiff131368(); 
 break;
case 131369L:
 TestCaseDiff131369(); 
 break;
case 131370L:
 TestCaseDiff131370(); 
 break;
case 131371L:
 TestCaseDiff131371(); 
 break;
case 131372L:
 TestCaseDiff131372(); 
 break;
case 131373L:
 TestCaseDiff131373(); 
 break;
case 131374L:
 TestCaseDiff131374(); 
 break;
case 131375L:
 TestCaseDiff131375(); 
 break;
case 131376L:
 TestCaseDiff131376(); 
 break;
case 131377L:
 TestCaseDiff131377(); 
 break;
case 131378L:
 TestCaseDiff131378(); 
 break;
case 131379L:
 TestCaseDiff131379(); 
 break;
case 131380L:
 TestCaseDiff131380(); 
 break;
case 131381L:
 TestCaseDiff131381(); 
 break;
case 131382L:
 TestCaseDiff131382(); 
 break;
case 131383L:
 TestCaseDiff131383(); 
 break;
case 131384L:
 TestCaseDiff131384(); 
 break;
case 131385L:
 TestCaseDiff131385(); 
 break;
case 131386L:
 TestCaseDiff131386(); 
 break;
case 131387L:
 TestCaseDiff131387(); 
 break;
case 131388L:
 TestCaseDiff131388(); 
 break;
case 131389L:
 TestCaseDiff131389(); 
 break;
case 131390L:
 TestCaseDiff131390(); 
 break;
case 131391L:
 TestCaseDiff131391(); 
 break;
case 131392L:
 TestCaseDiff131392(); 
 break;
case 131393L:
 TestCaseDiff131393(); 
 break;
case 131394L:
 TestCaseDiff131394(); 
 break;
case 131395L:
 TestCaseDiff131395(); 
 break;
case 131396L:
 TestCaseDiff131396(); 
 break;
case 131397L:
 TestCaseDiff131397(); 
 break;
case 131398L:
 TestCaseDiff131398(); 
 break;
case 131399L:
 TestCaseDiff131399(); 
 break;
case 131400L:
 TestCaseDiff131400(); 
 break;
 

                default:
                    System.out.println(ConsoleColors.RED + "CoPilotEqnBasic TestCase:j= " + j + ": Gap" + ConsoleColors.RESET);
                    break;
            }
        }
    }
                
       public static void TestCaseDiff131301() {
 UsageCalculus.TestCase = 131301;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-2*x0^2*-3*x0^3/-4*x0^4*+-2*x0^53*xyz^3^3/-4*xyz^2^4*+-2*xyz^3^54*xyz^2^4*+-2*xyz^3^5-2*xyz^3^53*xyz^2^6*-4*xyz^3^7/--2*xyz^2^8*+3*xyz^3^94*xyz^3^7/--2*xyz^2^8*+3*xyz^3^9-2*xyz^2^8*+3*xyz^3^93*xyz^3^94*xyz^2^10/--3*xyz^3^3*+4*xyz^1^4*1*xyz^2^5-3*xyz^3^3*+4*xyz^1^4*1*xyz^2^5";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=300 EqnNumber=1 FamilyID=1 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[12, 1, 10, 20, 3, 2, 3, 4, 2, 3, 4, 2, 3, 1, 1, 1, 2, 1, 3, 1, 3, 2, 3, 1, 1, 1, 6, 1, 2, 4, 1, 31]"+
"// DOEMatrixRow=[1, 1, 1, 4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^2.0*3.0+x0^53.0*2.0*xyz^12.0-4.0*xyz^63.0-2.0*xyz^8.0+18.0*xyz^213.0-9.0*xyz^139.0-6.0*xyz^22.0-8.0*xyz^233.0-12.0*xyz^18.0-12.0*xyz^18.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^2.0*3.0*0.0+x0^53.0*2.0*12.0*xyz^11.0-4.0*63.0*xyz^62.0-2.0*8.0*xyz^7.0+18.0*213.0*xyz^212.0-9.0*139.0*xyz^138.0-6.0*22.0*xyz^21.0-8.0*233.0*xyz^232.0-12.0*18.0*xyz^17.0-12.0*18.0*xyz^17.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^2.0*0.0+x0^53.0*24.0*xyz^11.0-252.0*xyz^62.0-16.0*xyz^7.0+3834.0*xyz^212.0-1251.0*xyz^138.0-132.0*xyz^21.0-1864.0*xyz^232.0-216.0*xyz^17.0-216.0*xyz^17.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^2.0*3.0+x0^53.0*2.0*xyz^12.0-4.0*xyz^63.0-2.0*xyz^8.0+18.0*xyz^213.0-9.0*xyz^139.0-6.0*xyz^22.0-8.0*xyz^233.0-12.0*xyz^18.0-12.0*xyz^18.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^2.0*3.0*xyz+x0^53.0*2.0/13.0*xyz^13.0-4.0/64.0*xyz^64.0-2.0/9.0*xyz^9.0+18.0/214.0*xyz^214.0-9.0/140.0*xyz^140.0-6.0/23.0*xyz^23.0-8.0/234.0*xyz^234.0-12.0/19.0*xyz^19.0-12.0/19.0*xyz^19.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^2.0*3.0*xyz+x0^53.0/6.5*xyz^13.0-1.0/16.0*xyz^64.0-1.0/4.5*xyz^9.0+1.0/11.88888888888889*xyz^214.0-1.0/15.555555555555555*xyz^140.0-1.0/3.8333333333333335*xyz^23.0-1.0/29.25*xyz^234.0-1.0/1.5833333333333333*xyz^19.0-1.0/1.5833333333333333*xyz^19.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^2.0*0.0+x0^53.0*24.0*xyz^11.0-252.0*xyz^62.0-16.0*xyz^7.0+3834.0*xyz^212.0-1251.0*xyz^138.0-132.0*xyz^21.0-1864.0*xyz^232.0-216.0*xyz^17.0-216.0*xyz^17.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^2.0*0.0+x0^53.0*24.0*11.0*xyz^10.0-252.0*62.0*xyz^61.0-16.0*7.0*xyz^6.0+3834.0*212.0*xyz^211.0-1251.0*138.0*xyz^137.0-132.0*21.0*xyz^20.0-1864.0*232.0*xyz^231.0-216.0*17.0*xyz^16.0-216.0*17.0*xyz^16.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^2.0*0.0+x0^53.0*264.0*xyz^10.0-15624.0*xyz^61.0-112.0*xyz^6.0+812808.0*xyz^211.0-172638.0*xyz^137.0-2772.0*xyz^20.0-432448.0*xyz^231.0-3672.0*xyz^16.0-3672.0*xyz^16.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^2.0*3.0*xyz+x0^53.0/6.5*xyz^13.0-1.0/16.0*xyz^64.0-1.0/4.5*xyz^9.0+1.0/11.88888888888889*xyz^214.0-1.0/15.555555555555555*xyz^140.0-1.0/3.8333333333333335*xyz^23.0-1.0/29.25*xyz^234.0-1.0/1.5833333333333333*xyz^19.0-1.0/1.5833333333333333*xyz^19.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^2.0*3.0/2.0*xyz^2.0+x0^53.0/6.5/14.0*xyz^14.0-1.0/16.0/65.0*xyz^65.0-1.0/4.5/10.0*xyz^10.0+1.0/11.88888888888889/215.0*xyz^215.0-1.0/15.555555555555555/141.0*xyz^141.0-1.0/3.8333333333333335/24.0*xyz^24.0-1.0/29.25/235.0*xyz^235.0-1.0/1.5833333333333333/20.0*xyz^20.0-1.0/1.5833333333333333/20.0*xyz^20.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^2.0*1.5*xyz^2.0+x0^53.0/91.0*xyz^14.0-1.0/1040.0*xyz^65.0-1.0/45.0*xyz^10.0+1.0/2556.1111111111113*xyz^215.0-1.0/2193.3333333333335*xyz^141.0-1.0/92.0*xyz^24.0-1.0/6873.75*xyz^235.0-1.0/31.666666666666664*xyz^20.0-1.0/31.666666666666664*xyz^20.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^2.0*0.0+x0^53.0*264.0*xyz^10.0-15624.0*xyz^61.0-112.0*xyz^6.0+812808.0*xyz^211.0-172638.0*xyz^137.0-2772.0*xyz^20.0-432448.0*xyz^231.0-3672.0*xyz^16.0-3672.0*xyz^16.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^2.0*0.0+x0^53.0*264.0*10.0*xyz^9.0-15624.0*61.0*xyz^60.0-112.0*6.0*xyz^5.0+812808.0*211.0*xyz^210.0-172638.0*137.0*xyz^136.0-2772.0*20.0*xyz^19.0-432448.0*231.0*xyz^230.0-3672.0*16.0*xyz^15.0-3672.0*16.0*xyz^15.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^2.0*0.0+x0^53.0*2640.0*xyz^9.0-953064.0*xyz^60.0-672.0*xyz^5.0+1.71502488E8*xyz^210.0-2.3651406E7*xyz^136.0-55440.0*xyz^19.0-9.9895488E7*xyz^230.0-58752.0*xyz^15.0-58752.0*xyz^15.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^2.0*1.5*xyz^2.0+x0^53.0/91.0*xyz^14.0-1.0/1040.0*xyz^65.0-1.0/45.0*xyz^10.0+1.0/2556.1111111111113*xyz^215.0-1.0/2193.3333333333335*xyz^141.0-1.0/92.0*xyz^24.0-1.0/6873.75*xyz^235.0-1.0/31.666666666666664*xyz^20.0-1.0/31.666666666666664*xyz^20.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^2.0*1.5/3.0*xyz^3.0+x0^53.0/91.0/15.0*xyz^15.0-1.0/1040.0/66.0*xyz^66.0-1.0/45.0/11.0*xyz^11.0+1.0/2556.1111111111113/216.0*xyz^216.0-1.0/2193.3333333333335/142.0*xyz^142.0-1.0/92.0/25.0*xyz^25.0-1.0/6873.75/236.0*xyz^236.0-1.0/31.666666666666664/21.0*xyz^21.0-1.0/31.666666666666664/21.0*xyz^21.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^2.0*0.5*xyz^3.0+x0^53.0/1365.0*xyz^15.0-1.0/68640.0*xyz^66.0-1.0/495.0*xyz^11.0+1.0/552120.0*xyz^216.0-1.0/311453.3333333334*xyz^142.0-1.0/2300.0*xyz^25.0-1.0/1622205.0*xyz^236.0-1.0/665.0*xyz^21.0-1.0/665.0*xyz^21.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^2.0*0.0+x0^53.0*2640.0*xyz^9.0-953064.0*xyz^60.0-672.0*xyz^5.0+1.71502488E8*xyz^210.0-2.3651406E7*xyz^136.0-55440.0*xyz^19.0-9.9895488E7*xyz^230.0-58752.0*xyz^15.0-58752.0*xyz^15.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^2.0*0.0+x0^53.0*2640.0*9.0*xyz^8.0-953064.0*60.0*xyz^59.0-672.0*5.0*xyz^4.0+210.0*xyz^209.0-136.0*xyz^135.0-55440.0*19.0*xyz^18.0-230.0*xyz^229.0-58752.0*15.0*xyz^14.0-58752.0*15.0*xyz^14.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^2.0*0.0+x0^53.0*23760.0*xyz^8.0-5.718384E7*xyz^59.0-3360.0*xyz^4.0+210.0*xyz^209.0-136.0*xyz^135.0-1053360.0*xyz^18.0-230.0*xyz^229.0-881280.0*xyz^14.0-881280.0*xyz^14.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^2.0*0.5*xyz^3.0+x0^53.0/1365.0*xyz^15.0-1.0/68640.0*xyz^66.0-1.0/495.0*xyz^11.0+1.0/552120.0*xyz^216.0-1.0/311453.3333333334*xyz^142.0-1.0/2300.0*xyz^25.0-1.0/1622205.0*xyz^236.0-1.0/665.0*xyz^21.0-1.0/665.0*xyz^21.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^2.0*0.5/4.0*xyz^4.0+x0^53.0/1365.0/16.0*xyz^16.0-1.0/68640.0/67.0*xyz^67.0-1.0/495.0/12.0*xyz^12.0+1.0/552120.0/217.0*xyz^217.0-1.0/311453.3333333334/143.0*xyz^143.0-1.0/2300.0/26.0*xyz^26.0-1.0/1622205.0/237.0*xyz^237.0-1.0/665.0/22.0*xyz^22.0-1.0/665.0/22.0*xyz^22.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^2.0*0.125*xyz^4.0+x0^53.0/21840.0*xyz^16.0-1.0/4598880.0*xyz^67.0-1.0/5940.0*xyz^12.0+1.0/1.1981004E8*xyz^217.0-1.0/4.453782666666667E7*xyz^143.0-1.0/59800.0*xyz^26.0-1.0/3.84462585E8*xyz^237.0-1.0/14630.0*xyz^22.0-1.0/14630.0*xyz^22.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131302() {
 UsageCalculus.TestCase = 131302;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xyza^3^3/-4*xyza^2^4*+-2*xyza^3^54*xyza^2^4*+-2*xyza^3^5-2*xyza^3^53*xyza^2^6*-4*xyza^3^7/--2*xyza^2^8*+3*xyza^3^94*xyza^3^7/--2*xyza^2^8*+3*xyza^3^9-2*xyza^2^8*+3*xyza^3^93*xyza^3^94*xyza^2^10/--3*xyza^3^3*+4*xyza^1^4*1*xyza^2^5-3*xyza^3^3*+4*xyza^1^4*1*xyza^2^54*xyza^1^4*1*xyza^2^5";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=301 EqnNumber=2 FamilyID=3 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[12, 2, 10, 19, 4, 3, 1, 5, 3, 4, 1, 1, 1, 2, 3, 2, 3, 2, 4, 2, 4, 3, 1, 2, 3, 2, 7, 2, 3, 5, 2, 32]"+
"// DOEMatrixRow=[1, 2, 1, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-3.0*xyza^12.0-4.0*xyza^63.0-2.0*xyza^8.0+18.0*xyza^213.0-9.0*xyza^139.0-6.0*xyza^22.0-8.0*xyza^233.0-12.0*xyza^18.0-12.0*xyza^79.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-3.0*12.0*xyza^11.0-4.0*63.0*xyza^62.0-2.0*8.0*xyza^7.0+18.0*213.0*xyza^212.0-9.0*139.0*xyza^138.0-6.0*22.0*xyza^21.0-8.0*233.0*xyza^232.0-12.0*18.0*xyza^17.0-12.0*79.0*xyza^78.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-36.0*xyza^11.0-252.0*xyza^62.0-16.0*xyza^7.0+3834.0*xyza^212.0-1251.0*xyza^138.0-132.0*xyza^21.0-1864.0*xyza^232.0-216.0*xyza^17.0-948.0*xyza^78.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-3.0*xyza^12.0-4.0*xyza^63.0-2.0*xyza^8.0+18.0*xyza^213.0-9.0*xyza^139.0-6.0*xyza^22.0-8.0*xyza^233.0-12.0*xyza^18.0-12.0*xyza^79.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-3.0/13.0*xyza^13.0-4.0/64.0*xyza^64.0-2.0/9.0*xyza^9.0+18.0/214.0*xyza^214.0-9.0/140.0*xyza^140.0-6.0/23.0*xyza^23.0-8.0/234.0*xyza^234.0-12.0/19.0*xyza^19.0-12.0/80.0*xyza^80.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/4.333333333333333*xyza^13.0-1.0/16.0*xyza^64.0-1.0/4.5*xyza^9.0+1.0/11.88888888888889*xyza^214.0-1.0/15.555555555555555*xyza^140.0-1.0/3.8333333333333335*xyza^23.0-1.0/29.25*xyza^234.0-1.0/1.5833333333333333*xyza^19.0-1.0/6.666666666666667*xyza^80.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-36.0*xyza^11.0-252.0*xyza^62.0-16.0*xyza^7.0+3834.0*xyza^212.0-1251.0*xyza^138.0-132.0*xyza^21.0-1864.0*xyza^232.0-216.0*xyza^17.0-948.0*xyza^78.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-36.0*11.0*xyza^10.0-252.0*62.0*xyza^61.0-16.0*7.0*xyza^6.0+3834.0*212.0*xyza^211.0-1251.0*138.0*xyza^137.0-132.0*21.0*xyza^20.0-1864.0*232.0*xyza^231.0-216.0*17.0*xyza^16.0-948.0*78.0*xyza^77.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-396.0*xyza^10.0-15624.0*xyza^61.0-112.0*xyza^6.0+812808.0*xyza^211.0-172638.0*xyza^137.0-2772.0*xyza^20.0-432448.0*xyza^231.0-3672.0*xyza^16.0-73944.0*xyza^77.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/4.333333333333333*xyza^13.0-1.0/16.0*xyza^64.0-1.0/4.5*xyza^9.0+1.0/11.88888888888889*xyza^214.0-1.0/15.555555555555555*xyza^140.0-1.0/3.8333333333333335*xyza^23.0-1.0/29.25*xyza^234.0-1.0/1.5833333333333333*xyza^19.0-1.0/6.666666666666667*xyza^80.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/4.333333333333333/14.0*xyza^14.0-1.0/16.0/65.0*xyza^65.0-1.0/4.5/10.0*xyza^10.0+1.0/11.88888888888889/215.0*xyza^215.0-1.0/15.555555555555555/141.0*xyza^141.0-1.0/3.8333333333333335/24.0*xyza^24.0-1.0/29.25/235.0*xyza^235.0-1.0/1.5833333333333333/20.0*xyza^20.0-1.0/6.666666666666667/81.0*xyza^81.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/60.666666666666664*xyza^14.0-1.0/1040.0*xyza^65.0-1.0/45.0*xyza^10.0+1.0/2556.1111111111113*xyza^215.0-1.0/2193.3333333333335*xyza^141.0-1.0/92.0*xyza^24.0-1.0/6873.75*xyza^235.0-1.0/31.666666666666664*xyza^20.0-1.0/540.0*xyza^81.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-396.0*xyza^10.0-15624.0*xyza^61.0-112.0*xyza^6.0+812808.0*xyza^211.0-172638.0*xyza^137.0-2772.0*xyza^20.0-432448.0*xyza^231.0-3672.0*xyza^16.0-73944.0*xyza^77.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-396.0*10.0*xyza^9.0-15624.0*61.0*xyza^60.0-112.0*6.0*xyza^5.0+812808.0*211.0*xyza^210.0-172638.0*137.0*xyza^136.0-2772.0*20.0*xyza^19.0-432448.0*231.0*xyza^230.0-3672.0*16.0*xyza^15.0-73944.0*77.0*xyza^76.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-3960.0*xyza^9.0-953064.0*xyza^60.0-672.0*xyza^5.0+1.71502488E8*xyza^210.0-2.3651406E7*xyza^136.0-55440.0*xyza^19.0-9.9895488E7*xyza^230.0-58752.0*xyza^15.0-5693688.0*xyza^76.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/60.666666666666664*xyza^14.0-1.0/1040.0*xyza^65.0-1.0/45.0*xyza^10.0+1.0/2556.1111111111113*xyza^215.0-1.0/2193.3333333333335*xyza^141.0-1.0/92.0*xyza^24.0-1.0/6873.75*xyza^235.0-1.0/31.666666666666664*xyza^20.0-1.0/540.0*xyza^81.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/60.666666666666664/15.0*xyza^15.0-1.0/1040.0/66.0*xyza^66.0-1.0/45.0/11.0*xyza^11.0+1.0/2556.1111111111113/216.0*xyza^216.0-1.0/2193.3333333333335/142.0*xyza^142.0-1.0/92.0/25.0*xyza^25.0-1.0/6873.75/236.0*xyza^236.0-1.0/31.666666666666664/21.0*xyza^21.0-1.0/540.0/82.0*xyza^82.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/910.0*xyza^15.0-1.0/68640.0*xyza^66.0-1.0/495.0*xyza^11.0+1.0/552120.0*xyza^216.0-1.0/311453.3333333334*xyza^142.0-1.0/2300.0*xyza^25.0-1.0/1622205.0*xyza^236.0-1.0/665.0*xyza^21.0-1.0/44280.0*xyza^82.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-3960.0*xyza^9.0-953064.0*xyza^60.0-672.0*xyza^5.0+1.71502488E8*xyza^210.0-2.3651406E7*xyza^136.0-55440.0*xyza^19.0-9.9895488E7*xyza^230.0-58752.0*xyza^15.0-5693688.0*xyza^76.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-3960.0*9.0*xyza^8.0-953064.0*60.0*xyza^59.0-672.0*5.0*xyza^4.0+210.0*xyza^209.0-136.0*xyza^135.0-55440.0*19.0*xyza^18.0-230.0*xyza^229.0-58752.0*15.0*xyza^14.0-5693688.0*76.0*xyza^75.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-35640.0*xyza^8.0-5.718384E7*xyza^59.0-3360.0*xyza^4.0+210.0*xyza^209.0-136.0*xyza^135.0-1053360.0*xyza^18.0-230.0*xyza^229.0-881280.0*xyza^14.0-4.32720288E8*xyza^75.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/910.0*xyza^15.0-1.0/68640.0*xyza^66.0-1.0/495.0*xyza^11.0+1.0/552120.0*xyza^216.0-1.0/311453.3333333334*xyza^142.0-1.0/2300.0*xyza^25.0-1.0/1622205.0*xyza^236.0-1.0/665.0*xyza^21.0-1.0/44280.0*xyza^82.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/910.0/16.0*xyza^16.0-1.0/68640.0/67.0*xyza^67.0-1.0/495.0/12.0*xyza^12.0+1.0/552120.0/217.0*xyza^217.0-1.0/311453.3333333334/143.0*xyza^143.0-1.0/2300.0/26.0*xyza^26.0-1.0/1622205.0/237.0*xyza^237.0-1.0/665.0/22.0*xyza^22.0-1.0/44280.0/83.0*xyza^83.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/14560.0*xyza^16.0-1.0/4598880.0*xyza^67.0-1.0/5940.0*xyza^12.0+1.0/1.1981004E8*xyza^217.0-1.0/4.453782666666667E7*xyza^143.0-1.0/59800.0*xyza^26.0-1.0/3.84462585E8*xyza^237.0-1.0/14630.0*xyza^22.0-1.0/3675240.0*xyza^83.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131303() {
 UsageCalculus.TestCase = 131303;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "4*x^2^4*+-2*x^3^5-2*x^3^53*x^2^6*-4*x^3^7/--2*x^2^8*+3*x^3^94*x^3^7/--2*x^2^8*+3*x^3^9-2*x^2^8*+3*x^3^93*x^3^94*x^2^10/--3*x^3^3*+4*x^1^4*1*x^2^5-3*x^3^3*+4*x^1^4*1*x^2^54*x^1^4*1*x^2^51*x^2^5";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=302 EqnNumber=3 FamilyID=1 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[12, 3, 10, 18, 1, 1, 2, 6, 1, 1, 2, 1, 2, 3, 4, 3, 1, 1, 5, 3, 1, 4, 2, 3, 1, 3, 8, 3, 4, 6, 3, 1]"+
"// DOEMatrixRow=[1, 3, 1, 2, 3, 3, 3, 3, 3, 3, 3, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "8.0*x^6.0-2.0*x^8.0+18.0*x^213.0-9.0*x^139.0-6.0*x^22.0-8.0*x^233.0-12.0*x^18.0-12.0*x^132.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*6.0*x^5.0-2.0*8.0*x^7.0+18.0*213.0*x^212.0-9.0*139.0*x^138.0-6.0*22.0*x^21.0-8.0*233.0*x^232.0-12.0*18.0*x^17.0-12.0*132.0*x^131.0";
 UsageCalculus.EqnSolArrayMap2[1] = "48.0*x^5.0-16.0*x^7.0+3834.0*x^212.0-1251.0*x^138.0-132.0*x^21.0-1864.0*x^232.0-216.0*x^17.0-1584.0*x^131.0";
 UsageCalculus.EqnSolArrayMap3[1] = "8.0*x^6.0-2.0*x^8.0+18.0*x^213.0-9.0*x^139.0-6.0*x^22.0-8.0*x^233.0-12.0*x^18.0-12.0*x^132.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "8.0/7.0*x^7.0-2.0/9.0*x^9.0+18.0/214.0*x^214.0-9.0/140.0*x^140.0-6.0/23.0*x^23.0-8.0/234.0*x^234.0-12.0/19.0*x^19.0-12.0/133.0*x^133.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.1428571428571428*x^7.0-1.0/4.5*x^9.0+1.0/11.88888888888889*x^214.0-1.0/15.555555555555555*x^140.0-1.0/3.8333333333333335*x^23.0-1.0/29.25*x^234.0-1.0/1.5833333333333333*x^19.0-1.0/11.083333333333334*x^133.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "48.0*x^5.0-16.0*x^7.0+3834.0*x^212.0-1251.0*x^138.0-132.0*x^21.0-1864.0*x^232.0-216.0*x^17.0-1584.0*x^131.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "48.0*5.0*x^4.0-16.0*7.0*x^6.0+3834.0*212.0*x^211.0-1251.0*138.0*x^137.0-132.0*21.0*x^20.0-1864.0*232.0*x^231.0-216.0*17.0*x^16.0-1584.0*131.0*x^130.0";
 UsageCalculus.EqnSolArrayMap2[2] = "240.0*x^4.0-112.0*x^6.0+812808.0*x^211.0-172638.0*x^137.0-2772.0*x^20.0-432448.0*x^231.0-3672.0*x^16.0-207504.0*x^130.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.1428571428571428*x^7.0-1.0/4.5*x^9.0+1.0/11.88888888888889*x^214.0-1.0/15.555555555555555*x^140.0-1.0/3.8333333333333335*x^23.0-1.0/29.25*x^234.0-1.0/1.5833333333333333*x^19.0-1.0/11.083333333333334*x^133.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.1428571428571428/8.0*x^8.0-1.0/4.5/10.0*x^10.0+1.0/11.88888888888889/215.0*x^215.0-1.0/15.555555555555555/141.0*x^141.0-1.0/3.8333333333333335/24.0*x^24.0-1.0/29.25/235.0*x^235.0-1.0/1.5833333333333333/20.0*x^20.0-1.0/11.083333333333334/134.0*x^134.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/7.0*x^8.0-1.0/45.0*x^10.0+1.0/2556.1111111111113*x^215.0-1.0/2193.3333333333335*x^141.0-1.0/92.0*x^24.0-1.0/6873.75*x^235.0-1.0/31.666666666666664*x^20.0-1.0/1485.1666666666667*x^134.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "240.0*x^4.0-112.0*x^6.0+812808.0*x^211.0-172638.0*x^137.0-2772.0*x^20.0-432448.0*x^231.0-3672.0*x^16.0-207504.0*x^130.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "240.0*4.0*x^3.0-112.0*6.0*x^5.0+812808.0*211.0*x^210.0-172638.0*137.0*x^136.0-2772.0*20.0*x^19.0-432448.0*231.0*x^230.0-3672.0*16.0*x^15.0-207504.0*130.0*x^129.0";
 UsageCalculus.EqnSolArrayMap2[3] = "960.0*x^3.0-672.0*x^5.0+1.71502488E8*x^210.0-2.3651406E7*x^136.0-55440.0*x^19.0-9.9895488E7*x^230.0-58752.0*x^15.0-2.697552E7*x^129.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/7.0*x^8.0-1.0/45.0*x^10.0+1.0/2556.1111111111113*x^215.0-1.0/2193.3333333333335*x^141.0-1.0/92.0*x^24.0-1.0/6873.75*x^235.0-1.0/31.666666666666664*x^20.0-1.0/1485.1666666666667*x^134.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/7.0/9.0*x^9.0-1.0/45.0/11.0*x^11.0+1.0/2556.1111111111113/216.0*x^216.0-1.0/2193.3333333333335/142.0*x^142.0-1.0/92.0/25.0*x^25.0-1.0/6873.75/236.0*x^236.0-1.0/31.666666666666664/21.0*x^21.0-1.0/1485.1666666666667/135.0*x^135.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/63.0*x^9.0-1.0/495.0*x^11.0+1.0/552120.0*x^216.0-1.0/311453.3333333334*x^142.0-1.0/2300.0*x^25.0-1.0/1622205.0*x^236.0-1.0/665.0*x^21.0-1.0/200497.5*x^135.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "960.0*x^3.0-672.0*x^5.0+1.71502488E8*x^210.0-2.3651406E7*x^136.0-55440.0*x^19.0-9.9895488E7*x^230.0-58752.0*x^15.0-2.697552E7*x^129.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "960.0*3.0*x^2.0-672.0*5.0*x^4.0+210.0*x^209.0-136.0*x^135.0-55440.0*19.0*x^18.0-230.0*x^229.0-58752.0*15.0*x^14.0-0.0*129.0*x^128.0";
 UsageCalculus.EqnSolArrayMap2[4] = "2880.0*x^2.0-3360.0*x^4.0+210.0*x^209.0-136.0*x^135.0-1053360.0*x^18.0-230.0*x^229.0-881280.0*x^14.0-0.0*x^128.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/63.0*x^9.0-1.0/495.0*x^11.0+1.0/552120.0*x^216.0-1.0/311453.3333333334*x^142.0-1.0/2300.0*x^25.0-1.0/1622205.0*x^236.0-1.0/665.0*x^21.0-1.0/200497.5*x^135.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/63.0/10.0*x^10.0-1.0/495.0/12.0*x^12.0+1.0/552120.0/217.0*x^217.0-1.0/311453.3333333334/143.0*x^143.0-1.0/2300.0/26.0*x^26.0-1.0/1622205.0/237.0*x^237.0-1.0/665.0/22.0*x^22.0-1.0/200497.5/136.0*x^136.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/630.0*x^10.0-1.0/5940.0*x^12.0+1.0/1.1981004E8*x^217.0-1.0/4.453782666666667E7*x^143.0-1.0/59800.0*x^26.0-1.0/3.84462585E8*x^237.0-1.0/14630.0*x^22.0-1.0/2.726766E7*x^136.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131304() {
 UsageCalculus.TestCase = 131304;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-2*xy^3^53*xy^2^6*-4*xy^3^7/--2*xy^2^8*+3*xy^3^94*xy^3^7/--2*xy^2^8*+3*xy^3^9-2*xy^2^8*+3*xy^3^93*xy^3^94*xy^2^10/--3*xy^3^3*+4*xy^1^4*1*xy^2^5-3*xy^3^3*+4*xy^1^4*1*xy^2^54*xy^1^4*1*xy^2^51*xy^2^5-3*xy^3^6*-4*xy^1^7/-1*xy^2^8*+-3*xy^3^9";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=303 EqnNumber=4 FamilyID=2 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[12, 4, 10, 17, 2, 3, 1, 7, 2, 3, 4, 2, 3, 1, 1, 1, 2, 1, 1, 1, 2, 5, 3, 1, 2, 4, 9, 1, 1, 7, 4, 2]"+
"// DOEMatrixRow=[1, 4, 1, 1, 2, 2, 2, 4, 2, 4, 4, 2, 2, 2, 4, 2, 2, 4, 4, 2, 2, 4, 2, 2, 4, 4, 2, 2, 4, 4, 2]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "18.0*xy^213.0-9.0*xy^139.0-6.0*xy^22.0-8.0*xy^233.0-12.0*xy^18.0-12.0*xy^132.0-36.0*xy^27.0-3.0*xy^12.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "18.0*213.0*xy^212.0-9.0*139.0*xy^138.0-6.0*22.0*xy^21.0-8.0*233.0*xy^232.0-12.0*18.0*xy^17.0-12.0*132.0*xy^131.0-36.0*27.0*xy^26.0-3.0*12.0*xy^11.0";
 UsageCalculus.EqnSolArrayMap2[1] = "3834.0*xy^212.0-1251.0*xy^138.0-132.0*xy^21.0-1864.0*xy^232.0-216.0*xy^17.0-1584.0*xy^131.0-972.0*xy^26.0-36.0*xy^11.0";
 UsageCalculus.EqnSolArrayMap3[1] = "18.0*xy^213.0-9.0*xy^139.0-6.0*xy^22.0-8.0*xy^233.0-12.0*xy^18.0-12.0*xy^132.0-36.0*xy^27.0-3.0*xy^12.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "18.0/214.0*xy^214.0-9.0/140.0*xy^140.0-6.0/23.0*xy^23.0-8.0/234.0*xy^234.0-12.0/19.0*xy^19.0-12.0/133.0*xy^133.0-36.0/28.0*xy^28.0-3.0/13.0*xy^13.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/11.88888888888889*xy^214.0-1.0/15.555555555555555*xy^140.0-1.0/3.8333333333333335*xy^23.0-1.0/29.25*xy^234.0-1.0/1.5833333333333333*xy^19.0-1.0/11.083333333333334*xy^133.0-1.2857142857142858*xy^28.0-1.0/4.333333333333333*xy^13.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "3834.0*xy^212.0-1251.0*xy^138.0-132.0*xy^21.0-1864.0*xy^232.0-216.0*xy^17.0-1584.0*xy^131.0-972.0*xy^26.0-36.0*xy^11.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "3834.0*212.0*xy^211.0-1251.0*138.0*xy^137.0-132.0*21.0*xy^20.0-1864.0*232.0*xy^231.0-216.0*17.0*xy^16.0-1584.0*131.0*xy^130.0-972.0*26.0*xy^25.0-36.0*11.0*xy^10.0";
 UsageCalculus.EqnSolArrayMap2[2] = "812808.0*xy^211.0-172638.0*xy^137.0-2772.0*xy^20.0-432448.0*xy^231.0-3672.0*xy^16.0-207504.0*xy^130.0-25272.0*xy^25.0-396.0*xy^10.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/11.88888888888889*xy^214.0-1.0/15.555555555555555*xy^140.0-1.0/3.8333333333333335*xy^23.0-1.0/29.25*xy^234.0-1.0/1.5833333333333333*xy^19.0-1.0/11.083333333333334*xy^133.0-1.2857142857142858*xy^28.0-1.0/4.333333333333333*xy^13.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/11.88888888888889/215.0*xy^215.0-1.0/15.555555555555555/141.0*xy^141.0-1.0/3.8333333333333335/24.0*xy^24.0-1.0/29.25/235.0*xy^235.0-1.0/1.5833333333333333/20.0*xy^20.0-1.0/11.083333333333334/134.0*xy^134.0-1.2857142857142858/29.0*xy^29.0-1.0/4.333333333333333/14.0*xy^14.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/2556.1111111111113*xy^215.0-1.0/2193.3333333333335*xy^141.0-1.0/92.0*xy^24.0-1.0/6873.75*xy^235.0-1.0/31.666666666666664*xy^20.0-1.0/1485.1666666666667*xy^134.0-1.0/22.555555555555554*xy^29.0-1.0/60.666666666666664*xy^14.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "812808.0*xy^211.0-172638.0*xy^137.0-2772.0*xy^20.0-432448.0*xy^231.0-3672.0*xy^16.0-207504.0*xy^130.0-25272.0*xy^25.0-396.0*xy^10.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "812808.0*211.0*xy^210.0-172638.0*137.0*xy^136.0-2772.0*20.0*xy^19.0-432448.0*231.0*xy^230.0-3672.0*16.0*xy^15.0-207504.0*130.0*xy^129.0-25272.0*25.0*xy^24.0-396.0*10.0*xy^9.0";
 UsageCalculus.EqnSolArrayMap2[3] = "1.71502488E8*xy^210.0-2.3651406E7*xy^136.0-55440.0*xy^19.0-9.9895488E7*xy^230.0-58752.0*xy^15.0-2.697552E7*xy^129.0-631800.0*xy^24.0-3960.0*xy^9.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/2556.1111111111113*xy^215.0-1.0/2193.3333333333335*xy^141.0-1.0/92.0*xy^24.0-1.0/6873.75*xy^235.0-1.0/31.666666666666664*xy^20.0-1.0/1485.1666666666667*xy^134.0-1.0/22.555555555555554*xy^29.0-1.0/60.666666666666664*xy^14.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/2556.1111111111113/216.0*xy^216.0-1.0/2193.3333333333335/142.0*xy^142.0-1.0/92.0/25.0*xy^25.0-1.0/6873.75/236.0*xy^236.0-1.0/31.666666666666664/21.0*xy^21.0-1.0/1485.1666666666667/135.0*xy^135.0-1.0/22.555555555555554/30.0*xy^30.0-1.0/60.666666666666664/15.0*xy^15.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/552120.0*xy^216.0-1.0/311453.3333333334*xy^142.0-1.0/2300.0*xy^25.0-1.0/1622205.0*xy^236.0-1.0/665.0*xy^21.0-1.0/200497.5*xy^135.0-1.0/676.6666666666666*xy^30.0-1.0/910.0*xy^15.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "1.71502488E8*xy^210.0-2.3651406E7*xy^136.0-55440.0*xy^19.0-9.9895488E7*xy^230.0-58752.0*xy^15.0-2.697552E7*xy^129.0-631800.0*xy^24.0-3960.0*xy^9.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "210.0*xy^209.0-136.0*xy^135.0-55440.0*19.0*xy^18.0-230.0*xy^229.0-58752.0*15.0*xy^14.0-129.0*xy^128.0-631800.0*24.0*xy^23.0-3960.0*9.0*xy^8.0";
 UsageCalculus.EqnSolArrayMap2[4] = "210.0*xy^209.0-136.0*xy^135.0-1053360.0*xy^18.0-230.0*xy^229.0-881280.0*xy^14.0-129.0*xy^128.0-1.51632E7*xy^23.0-35640.0*xy^8.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/552120.0*xy^216.0-1.0/311453.3333333334*xy^142.0-1.0/2300.0*xy^25.0-1.0/1622205.0*xy^236.0-1.0/665.0*xy^21.0-1.0/200497.5*xy^135.0-1.0/676.6666666666666*xy^30.0-1.0/910.0*xy^15.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/552120.0/217.0*xy^217.0-1.0/311453.3333333334/143.0*xy^143.0-1.0/2300.0/26.0*xy^26.0-1.0/1622205.0/237.0*xy^237.0-1.0/665.0/22.0*xy^22.0-1.0/200497.5/136.0*xy^136.0-1.0/676.6666666666666/31.0*xy^31.0-1.0/910.0/16.0*xy^16.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/1.1981004E8*xy^217.0-1.0/4.453782666666667E7*xy^143.0-1.0/59800.0*xy^26.0-1.0/3.84462585E8*xy^237.0-1.0/14630.0*xy^22.0-1.0/2.726766E7*xy^136.0-1.0/20976.666666666664*xy^31.0-1.0/14560.0*xy^16.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131305() {
 UsageCalculus.TestCase = 131305;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xyz^2^6*-4*xyz^3^7/--2*xyz^2^8*+3*xyz^3^94*xyz^3^7/--2*xyz^2^8*+3*xyz^3^9-2*xyz^2^8*+3*xyz^3^93*xyz^3^94*xyz^2^10/--3*xyz^3^3*+4*xyz^1^4*1*xyz^2^5-3*xyz^3^3*+4*xyz^1^4*1*xyz^2^54*xyz^1^4*1*xyz^2^51*xyz^2^5-3*xyz^3^6*-4*xyz^1^7/-1*xyz^2^8*+-3*xyz^3^94*xyz^1^7/-1*xyz^2^8*+-3*xyz^3^9";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=304 EqnNumber=5 FamilyID=3 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[12, 5, 10, 16, 3, 1, 2, 8, 3, 4, 1, 1, 1, 2, 3, 2, 3, 2, 3, 2, 3, 6, 1, 2, 3, 1, 10, 2, 3, 8, 1, 3]"+
"// DOEMatrixRow=[1, 5, 1, 4, 3, 3, 3, 5, 3, 2, 2, 2, 3, 3, 2, 3, 3, 5, 5, 3, 3, 5, 3, 3, 5, 2, 3, 3, 2, 5, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-27.0*xyz^157.0-9.0*xyz^139.0-6.0*xyz^22.0-8.0*xyz^233.0-12.0*xyz^18.0-12.0*xyz^132.0-108.0*xyz^27.0+9.0*xyz^115.0-3.0*xyz^12.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-27.0*157.0*xyz^156.0-9.0*139.0*xyz^138.0-6.0*22.0*xyz^21.0-8.0*233.0*xyz^232.0-12.0*18.0*xyz^17.0-12.0*132.0*xyz^131.0-108.0*27.0*xyz^26.0+9.0*115.0*xyz^114.0-3.0*12.0*xyz^11.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-4239.0*xyz^156.0-1251.0*xyz^138.0-132.0*xyz^21.0-1864.0*xyz^232.0-216.0*xyz^17.0-1584.0*xyz^131.0-2916.0*xyz^26.0+1035.0*xyz^114.0-36.0*xyz^11.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-27.0*xyz^157.0-9.0*xyz^139.0-6.0*xyz^22.0-8.0*xyz^233.0-12.0*xyz^18.0-12.0*xyz^132.0-108.0*xyz^27.0+9.0*xyz^115.0-3.0*xyz^12.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-27.0/158.0*xyz^158.0-9.0/140.0*xyz^140.0-6.0/23.0*xyz^23.0-8.0/234.0*xyz^234.0-12.0/19.0*xyz^19.0-12.0/133.0*xyz^133.0-108.0/28.0*xyz^28.0+9.0/116.0*xyz^116.0-3.0/13.0*xyz^13.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/5.851851851851852*xyz^158.0-1.0/15.555555555555555*xyz^140.0-1.0/3.8333333333333335*xyz^23.0-1.0/29.25*xyz^234.0-1.0/1.5833333333333333*xyz^19.0-1.0/11.083333333333334*xyz^133.0-3.857142857142857*xyz^28.0+1.0/12.88888888888889*xyz^116.0-1.0/4.333333333333333*xyz^13.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-4239.0*xyz^156.0-1251.0*xyz^138.0-132.0*xyz^21.0-1864.0*xyz^232.0-216.0*xyz^17.0-1584.0*xyz^131.0-2916.0*xyz^26.0+1035.0*xyz^114.0-36.0*xyz^11.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-4239.0*156.0*xyz^155.0-1251.0*138.0*xyz^137.0-132.0*21.0*xyz^20.0-1864.0*232.0*xyz^231.0-216.0*17.0*xyz^16.0-1584.0*131.0*xyz^130.0-2916.0*26.0*xyz^25.0+1035.0*114.0*xyz^113.0-36.0*11.0*xyz^10.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-661284.0*xyz^155.0-172638.0*xyz^137.0-2772.0*xyz^20.0-432448.0*xyz^231.0-3672.0*xyz^16.0-207504.0*xyz^130.0-75816.0*xyz^25.0+117990.0*xyz^113.0-396.0*xyz^10.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/5.851851851851852*xyz^158.0-1.0/15.555555555555555*xyz^140.0-1.0/3.8333333333333335*xyz^23.0-1.0/29.25*xyz^234.0-1.0/1.5833333333333333*xyz^19.0-1.0/11.083333333333334*xyz^133.0-3.857142857142857*xyz^28.0+1.0/12.88888888888889*xyz^116.0-1.0/4.333333333333333*xyz^13.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/5.851851851851852/159.0*xyz^159.0-1.0/15.555555555555555/141.0*xyz^141.0-1.0/3.8333333333333335/24.0*xyz^24.0-1.0/29.25/235.0*xyz^235.0-1.0/1.5833333333333333/20.0*xyz^20.0-1.0/11.083333333333334/134.0*xyz^134.0-3.857142857142857/29.0*xyz^29.0+1.0/12.88888888888889/117.0*xyz^117.0-1.0/4.333333333333333/14.0*xyz^14.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/930.4444444444445*xyz^159.0-1.0/2193.3333333333335*xyz^141.0-1.0/92.0*xyz^24.0-1.0/6873.75*xyz^235.0-1.0/31.666666666666664*xyz^20.0-1.0/1485.1666666666667*xyz^134.0-1.0/7.518518518518518*xyz^29.0+1.0/1508.0*xyz^117.0-1.0/60.666666666666664*xyz^14.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-661284.0*xyz^155.0-172638.0*xyz^137.0-2772.0*xyz^20.0-432448.0*xyz^231.0-3672.0*xyz^16.0-207504.0*xyz^130.0-75816.0*xyz^25.0+117990.0*xyz^113.0-396.0*xyz^10.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-661284.0*155.0*xyz^154.0-172638.0*137.0*xyz^136.0-2772.0*20.0*xyz^19.0-432448.0*231.0*xyz^230.0-3672.0*16.0*xyz^15.0-207504.0*130.0*xyz^129.0-75816.0*25.0*xyz^24.0+117990.0*113.0*xyz^112.0-396.0*10.0*xyz^9.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-1.0249902E8*xyz^154.0-2.3651406E7*xyz^136.0-55440.0*xyz^19.0-9.9895488E7*xyz^230.0-58752.0*xyz^15.0-2.697552E7*xyz^129.0-1895400.0*xyz^24.0+1.333287E7*xyz^112.0-3960.0*xyz^9.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/930.4444444444445*xyz^159.0-1.0/2193.3333333333335*xyz^141.0-1.0/92.0*xyz^24.0-1.0/6873.75*xyz^235.0-1.0/31.666666666666664*xyz^20.0-1.0/1485.1666666666667*xyz^134.0-1.0/7.518518518518518*xyz^29.0+1.0/1508.0*xyz^117.0-1.0/60.666666666666664*xyz^14.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/930.4444444444445/160.0*xyz^160.0-1.0/2193.3333333333335/142.0*xyz^142.0-1.0/92.0/25.0*xyz^25.0-1.0/6873.75/236.0*xyz^236.0-1.0/31.666666666666664/21.0*xyz^21.0-1.0/1485.1666666666667/135.0*xyz^135.0-1.0/7.518518518518518/30.0*xyz^30.0+1.0/1508.0/118.0*xyz^118.0-1.0/60.666666666666664/15.0*xyz^15.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/148871.11111111112*xyz^160.0-1.0/311453.3333333334*xyz^142.0-1.0/2300.0*xyz^25.0-1.0/1622205.0*xyz^236.0-1.0/665.0*xyz^21.0-1.0/200497.5*xyz^135.0-1.0/225.55555555555554*xyz^30.0+1.0/177944.0*xyz^118.0-1.0/910.0*xyz^15.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-1.0249902E8*xyz^154.0-2.3651406E7*xyz^136.0-55440.0*xyz^19.0-9.9895488E7*xyz^230.0-58752.0*xyz^15.0-2.697552E7*xyz^129.0-1895400.0*xyz^24.0+1.333287E7*xyz^112.0-3960.0*xyz^9.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-154.0*xyz^153.0-136.0*xyz^135.0-55440.0*19.0*xyz^18.0-230.0*xyz^229.0-58752.0*15.0*xyz^14.0-129.0*xyz^128.0-1895400.0*24.0*xyz^23.0+112.0*xyz^111.0-3960.0*9.0*xyz^8.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-154.0*xyz^153.0-136.0*xyz^135.0-1053360.0*xyz^18.0-230.0*xyz^229.0-881280.0*xyz^14.0-129.0*xyz^128.0-4.54896E7*xyz^23.0+112.0*xyz^111.0-35640.0*xyz^8.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/148871.11111111112*xyz^160.0-1.0/311453.3333333334*xyz^142.0-1.0/2300.0*xyz^25.0-1.0/1622205.0*xyz^236.0-1.0/665.0*xyz^21.0-1.0/200497.5*xyz^135.0-1.0/225.55555555555554*xyz^30.0+1.0/177944.0*xyz^118.0-1.0/910.0*xyz^15.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/148871.11111111112/161.0*xyz^161.0-1.0/311453.3333333334/143.0*xyz^143.0-1.0/2300.0/26.0*xyz^26.0-1.0/1622205.0/237.0*xyz^237.0-1.0/665.0/22.0*xyz^22.0-1.0/200497.5/136.0*xyz^136.0-1.0/225.55555555555554/31.0*xyz^31.0+1.0/177944.0/119.0*xyz^119.0-1.0/910.0/16.0*xyz^16.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/2.396824888888889E7*xyz^161.0-1.0/4.453782666666667E7*xyz^143.0-1.0/59800.0*xyz^26.0-1.0/3.84462585E8*xyz^237.0-1.0/14630.0*xyz^22.0-1.0/2.726766E7*xyz^136.0-1.0/6992.222222222222*xyz^31.0+1.0/2.1175336E7*xyz^119.0-1.0/14560.0*xyz^16.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131306() {
 UsageCalculus.TestCase = 131306;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "4*xyza^3^7/--2*xyza^2^8*+3*xyza^3^9-2*xyza^2^8*+3*xyza^3^93*xyza^3^94*xyza^2^10/--3*xyza^3^3*+4*xyza^1^4*1*xyza^2^5-3*xyza^3^3*+4*xyza^1^4*1*xyza^2^54*xyza^1^4*1*xyza^2^51*xyza^2^5-3*xyza^3^6*-4*xyza^1^7/-1*xyza^2^8*+-3*xyza^3^94*xyza^1^7/-1*xyza^2^8*+-3*xyza^3^91*xyza^2^8*+-3*xyza^3^9";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=305 EqnNumber=6 FamilyID=1 MotifTag=2 Entropy=4 FuncWrapAliasID=2"+
"// MetaRow=[12, 6, 10, 15, 4, 2, 3, 9, 1, 1, 2, 1, 2, 3, 4, 3, 1, 1, 4, 3, 4, 7, 2, 3, 1, 2, 11, 3, 4, 9, 2, 4]"+
"// DOEMatrixRow=[1, 6, 1, 3, 2, 2, 2, 6, 2, 3, 3, 2, 2, 2, 3, 2, 2, 6, 6, 2, 2, 2, 2, 2, 6, 3, 2, 2, 3, 6, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "6.0*xyza^32.0-6.0*xyza^22.0-8.0*xyza^233.0-12.0*xyza^18.0-12.0*xyza^132.0-324.0*xyza^27.0+27.0*xyza^115.0-9.0*xyza^104.0-3.0*xyza^12.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "6.0*32.0*xyza^31.0-6.0*22.0*xyza^21.0-8.0*233.0*xyza^232.0-12.0*18.0*xyza^17.0-12.0*132.0*xyza^131.0-324.0*27.0*xyza^26.0+27.0*115.0*xyza^114.0-9.0*104.0*xyza^103.0-3.0*12.0*xyza^11.0";
 UsageCalculus.EqnSolArrayMap2[1] = "192.0*xyza^31.0-132.0*xyza^21.0-1864.0*xyza^232.0-216.0*xyza^17.0-1584.0*xyza^131.0-8748.0*xyza^26.0+3105.0*xyza^114.0-936.0*xyza^103.0-36.0*xyza^11.0";
 UsageCalculus.EqnSolArrayMap3[1] = "6.0*xyza^32.0-6.0*xyza^22.0-8.0*xyza^233.0-12.0*xyza^18.0-12.0*xyza^132.0-324.0*xyza^27.0+27.0*xyza^115.0-9.0*xyza^104.0-3.0*xyza^12.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "6.0/33.0*xyza^33.0-6.0/23.0*xyza^23.0-8.0/234.0*xyza^234.0-12.0/19.0*xyza^19.0-12.0/133.0*xyza^133.0-324.0/28.0*xyza^28.0+27.0/116.0*xyza^116.0-9.0/105.0*xyza^105.0-3.0/13.0*xyza^13.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/5.5*xyza^33.0-1.0/3.8333333333333335*xyza^23.0-1.0/29.25*xyza^234.0-1.0/1.5833333333333333*xyza^19.0-1.0/11.083333333333334*xyza^133.0-11.571428571428571*xyza^28.0+1.0/4.296296296296297*xyza^116.0-1.0/11.666666666666666*xyza^105.0-1.0/4.333333333333333*xyza^13.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "192.0*xyza^31.0-132.0*xyza^21.0-1864.0*xyza^232.0-216.0*xyza^17.0-1584.0*xyza^131.0-8748.0*xyza^26.0+3105.0*xyza^114.0-936.0*xyza^103.0-36.0*xyza^11.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "192.0*31.0*xyza^30.0-132.0*21.0*xyza^20.0-1864.0*232.0*xyza^231.0-216.0*17.0*xyza^16.0-1584.0*131.0*xyza^130.0-8748.0*26.0*xyza^25.0+3105.0*114.0*xyza^113.0-936.0*103.0*xyza^102.0-36.0*11.0*xyza^10.0";
 UsageCalculus.EqnSolArrayMap2[2] = "5952.0*xyza^30.0-2772.0*xyza^20.0-432448.0*xyza^231.0-3672.0*xyza^16.0-207504.0*xyza^130.0-227448.0*xyza^25.0+353970.0*xyza^113.0-96408.0*xyza^102.0-396.0*xyza^10.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/5.5*xyza^33.0-1.0/3.8333333333333335*xyza^23.0-1.0/29.25*xyza^234.0-1.0/1.5833333333333333*xyza^19.0-1.0/11.083333333333334*xyza^133.0-11.571428571428571*xyza^28.0+1.0/4.296296296296297*xyza^116.0-1.0/11.666666666666666*xyza^105.0-1.0/4.333333333333333*xyza^13.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/5.5/34.0*xyza^34.0-1.0/3.8333333333333335/24.0*xyza^24.0-1.0/29.25/235.0*xyza^235.0-1.0/1.5833333333333333/20.0*xyza^20.0-1.0/11.083333333333334/134.0*xyza^134.0-11.571428571428571/29.0*xyza^29.0+1.0/4.296296296296297/117.0*xyza^117.0-1.0/11.666666666666666/106.0*xyza^106.0-1.0/4.333333333333333/14.0*xyza^14.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/187.0*xyza^34.0-1.0/92.0*xyza^24.0-1.0/6873.75*xyza^235.0-1.0/31.666666666666664*xyza^20.0-1.0/1485.1666666666667*xyza^134.0-1.0/2.506172839506173*xyza^29.0+1.0/502.66666666666674*xyza^117.0-1.0/1236.6666666666665*xyza^106.0-1.0/60.666666666666664*xyza^14.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "5952.0*xyza^30.0-2772.0*xyza^20.0-432448.0*xyza^231.0-3672.0*xyza^16.0-207504.0*xyza^130.0-227448.0*xyza^25.0+353970.0*xyza^113.0-96408.0*xyza^102.0-396.0*xyza^10.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "5952.0*30.0*xyza^29.0-2772.0*20.0*xyza^19.0-432448.0*231.0*xyza^230.0-3672.0*16.0*xyza^15.0-207504.0*130.0*xyza^129.0-227448.0*25.0*xyza^24.0+353970.0*113.0*xyza^112.0-96408.0*102.0*xyza^101.0-396.0*10.0*xyza^9.0";
 UsageCalculus.EqnSolArrayMap2[3] = "178560.0*xyza^29.0-55440.0*xyza^19.0-9.9895488E7*xyza^230.0-58752.0*xyza^15.0-2.697552E7*xyza^129.0-5686200.0*xyza^24.0+3.999861E7*xyza^112.0-9833616.0*xyza^101.0-3960.0*xyza^9.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/187.0*xyza^34.0-1.0/92.0*xyza^24.0-1.0/6873.75*xyza^235.0-1.0/31.666666666666664*xyza^20.0-1.0/1485.1666666666667*xyza^134.0-1.0/2.506172839506173*xyza^29.0+1.0/502.66666666666674*xyza^117.0-1.0/1236.6666666666665*xyza^106.0-1.0/60.666666666666664*xyza^14.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/187.0/35.0*xyza^35.0-1.0/92.0/25.0*xyza^25.0-1.0/6873.75/236.0*xyza^236.0-1.0/31.666666666666664/21.0*xyza^21.0-1.0/1485.1666666666667/135.0*xyza^135.0-1.0/2.506172839506173/30.0*xyza^30.0+1.0/502.66666666666674/118.0*xyza^118.0-1.0/1236.6666666666665/107.0*xyza^107.0-1.0/60.666666666666664/15.0*xyza^15.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/6545.0*xyza^35.0-1.0/2300.0*xyza^25.0-1.0/1622205.0*xyza^236.0-1.0/665.0*xyza^21.0-1.0/200497.5*xyza^135.0-1.0/75.18518518518519*xyza^30.0+1.0/59314.66666666668*xyza^118.0-1.0/132323.3333333333*xyza^107.0-1.0/910.0*xyza^15.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "178560.0*xyza^29.0-55440.0*xyza^19.0-9.9895488E7*xyza^230.0-58752.0*xyza^15.0-2.697552E7*xyza^129.0-5686200.0*xyza^24.0+3.999861E7*xyza^112.0-9833616.0*xyza^101.0-3960.0*xyza^9.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "178560.0*29.0*xyza^28.0-55440.0*19.0*xyza^18.0-230.0*xyza^229.0-58752.0*15.0*xyza^14.0-129.0*xyza^128.0-5686200.0*24.0*xyza^23.0+112.0*xyza^111.0-9833616.0*101.0*xyza^100.0-3960.0*9.0*xyza^8.0";
 UsageCalculus.EqnSolArrayMap2[4] = "5178240.0*xyza^28.0-1053360.0*xyza^18.0-230.0*xyza^229.0-881280.0*xyza^14.0-129.0*xyza^128.0-1.364688E8*xyza^23.0+112.0*xyza^111.0-9.93195216E8*xyza^100.0-35640.0*xyza^8.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/6545.0*xyza^35.0-1.0/2300.0*xyza^25.0-1.0/1622205.0*xyza^236.0-1.0/665.0*xyza^21.0-1.0/200497.5*xyza^135.0-1.0/75.18518518518519*xyza^30.0+1.0/59314.66666666668*xyza^118.0-1.0/132323.3333333333*xyza^107.0-1.0/910.0*xyza^15.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/6545.0/36.0*xyza^36.0-1.0/2300.0/26.0*xyza^26.0-1.0/1622205.0/237.0*xyza^237.0-1.0/665.0/22.0*xyza^22.0-1.0/200497.5/136.0*xyza^136.0-1.0/75.18518518518519/31.0*xyza^31.0+1.0/59314.66666666668/119.0*xyza^119.0-1.0/132323.3333333333/108.0*xyza^108.0-1.0/910.0/16.0*xyza^16.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/235620.0*xyza^36.0-1.0/59800.0*xyza^26.0-1.0/3.84462585E8*xyza^237.0-1.0/14630.0*xyza^22.0-1.0/2.726766E7*xyza^136.0-1.0/2330.740740740741*xyza^31.0+1.0/7058445.333333335*xyza^119.0-1.0/1.4290919999999998E7*xyza^108.0-1.0/14560.0*xyza^16.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131307() {
 UsageCalculus.TestCase = 131307;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-2*x^2^8*+3*x^3^93*x^3^94*x^2^10/--3*x^3^3*+4*x^1^4*1*x^2^5-3*x^3^3*+4*x^1^4*1*x^2^54*x^1^4*1*x^2^51*x^2^5-3*x^3^6*-4*x^1^7/-1*x^2^8*+-3*x^3^94*x^1^7/-1*x^2^8*+-3*x^3^91*x^2^8*+-3*x^3^9-3*x^3^9";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=306 EqnNumber=7 FamilyID=2 MotifTag=3 Entropy=1 FuncWrapAliasID=3"+
"// MetaRow=[12, 7, 10, 14, 1, 3, 1, 10, 2, 3, 4, 2, 3, 1, 1, 1, 2, 1, 5, 1, 1, 8, 3, 1, 2, 3, 12, 1, 1, 10, 3, 5]"+
"// DOEMatrixRow=[1, 7, 1, 2, 3, 3, 3, 7, 3, 4, 4, 2, 3, 3, 4, 3, 3, 7, 7, 3, 3, 3, 3, 3, 2, 4, 3, 3, 4, 7, 2]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-8.0*x^233.0-12.0*x^18.0-12.0*x^132.0-324.0*x^27.0+27.0*x^115.0-9.0*x^104.0-3.0*x^12.0-3.0*x^12.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-8.0*233.0*x^232.0-12.0*18.0*x^17.0-12.0*132.0*x^131.0-324.0*27.0*x^26.0+27.0*115.0*x^114.0-9.0*104.0*x^103.0-3.0*12.0*x^11.0-3.0*12.0*x^11.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-1864.0*x^232.0-216.0*x^17.0-1584.0*x^131.0-8748.0*x^26.0+3105.0*x^114.0-936.0*x^103.0-36.0*x^11.0-36.0*x^11.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-8.0*x^233.0-12.0*x^18.0-12.0*x^132.0-324.0*x^27.0+27.0*x^115.0-9.0*x^104.0-3.0*x^12.0-3.0*x^12.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-8.0/234.0*x^234.0-12.0/19.0*x^19.0-12.0/133.0*x^133.0-324.0/28.0*x^28.0+27.0/116.0*x^116.0-9.0/105.0*x^105.0-3.0/13.0*x^13.0-3.0/13.0*x^13.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/29.25*x^234.0-1.0/1.5833333333333333*x^19.0-1.0/11.083333333333334*x^133.0-11.571428571428571*x^28.0+1.0/4.296296296296297*x^116.0-1.0/11.666666666666666*x^105.0-1.0/4.333333333333333*x^13.0-1.0/4.333333333333333*x^13.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-1864.0*x^232.0-216.0*x^17.0-1584.0*x^131.0-8748.0*x^26.0+3105.0*x^114.0-936.0*x^103.0-36.0*x^11.0-36.0*x^11.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-1864.0*232.0*x^231.0-216.0*17.0*x^16.0-1584.0*131.0*x^130.0-8748.0*26.0*x^25.0+3105.0*114.0*x^113.0-936.0*103.0*x^102.0-36.0*11.0*x^10.0-36.0*11.0*x^10.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-432448.0*x^231.0-3672.0*x^16.0-207504.0*x^130.0-227448.0*x^25.0+353970.0*x^113.0-96408.0*x^102.0-396.0*x^10.0-396.0*x^10.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/29.25*x^234.0-1.0/1.5833333333333333*x^19.0-1.0/11.083333333333334*x^133.0-11.571428571428571*x^28.0+1.0/4.296296296296297*x^116.0-1.0/11.666666666666666*x^105.0-1.0/4.333333333333333*x^13.0-1.0/4.333333333333333*x^13.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/29.25/235.0*x^235.0-1.0/1.5833333333333333/20.0*x^20.0-1.0/11.083333333333334/134.0*x^134.0-11.571428571428571/29.0*x^29.0+1.0/4.296296296296297/117.0*x^117.0-1.0/11.666666666666666/106.0*x^106.0-1.0/4.333333333333333/14.0*x^14.0-1.0/4.333333333333333/14.0*x^14.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/6873.75*x^235.0-1.0/31.666666666666664*x^20.0-1.0/1485.1666666666667*x^134.0-1.0/2.506172839506173*x^29.0+1.0/502.66666666666674*x^117.0-1.0/1236.6666666666665*x^106.0-1.0/60.666666666666664*x^14.0-1.0/60.666666666666664*x^14.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-432448.0*x^231.0-3672.0*x^16.0-207504.0*x^130.0-227448.0*x^25.0+353970.0*x^113.0-96408.0*x^102.0-396.0*x^10.0-396.0*x^10.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-432448.0*231.0*x^230.0-3672.0*16.0*x^15.0-207504.0*130.0*x^129.0-227448.0*25.0*x^24.0+353970.0*113.0*x^112.0-96408.0*102.0*x^101.0-396.0*10.0*x^9.0-396.0*10.0*x^9.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-9.9895488E7*x^230.0-58752.0*x^15.0-2.697552E7*x^129.0-5686200.0*x^24.0+3.999861E7*x^112.0-9833616.0*x^101.0-3960.0*x^9.0-3960.0*x^9.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/6873.75*x^235.0-1.0/31.666666666666664*x^20.0-1.0/1485.1666666666667*x^134.0-1.0/2.506172839506173*x^29.0+1.0/502.66666666666674*x^117.0-1.0/1236.6666666666665*x^106.0-1.0/60.666666666666664*x^14.0-1.0/60.666666666666664*x^14.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/6873.75/236.0*x^236.0-1.0/31.666666666666664/21.0*x^21.0-1.0/1485.1666666666667/135.0*x^135.0-1.0/2.506172839506173/30.0*x^30.0+1.0/502.66666666666674/118.0*x^118.0-1.0/1236.6666666666665/107.0*x^107.0-1.0/60.666666666666664/15.0*x^15.0-1.0/60.666666666666664/15.0*x^15.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/1622205.0*x^236.0-1.0/665.0*x^21.0-1.0/200497.5*x^135.0-1.0/75.18518518518519*x^30.0+1.0/59314.66666666668*x^118.0-1.0/132323.3333333333*x^107.0-1.0/910.0*x^15.0-1.0/910.0*x^15.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-9.9895488E7*x^230.0-58752.0*x^15.0-2.697552E7*x^129.0-5686200.0*x^24.0+3.999861E7*x^112.0-9833616.0*x^101.0-3960.0*x^9.0-3960.0*x^9.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-230.0*x^229.0-58752.0*15.0*x^14.0-129.0*x^128.0-5686200.0*24.0*x^23.0+112.0*x^111.0-9833616.0*101.0*x^100.0-3960.0*9.0*x^8.0-3960.0*9.0*x^8.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-230.0*x^229.0-881280.0*x^14.0-129.0*x^128.0-1.364688E8*x^23.0+112.0*x^111.0-9.93195216E8*x^100.0-35640.0*x^8.0-35640.0*x^8.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/1622205.0*x^236.0-1.0/665.0*x^21.0-1.0/200497.5*x^135.0-1.0/75.18518518518519*x^30.0+1.0/59314.66666666668*x^118.0-1.0/132323.3333333333*x^107.0-1.0/910.0*x^15.0-1.0/910.0*x^15.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/1622205.0/237.0*x^237.0-1.0/665.0/22.0*x^22.0-1.0/200497.5/136.0*x^136.0-1.0/75.18518518518519/31.0*x^31.0+1.0/59314.66666666668/119.0*x^119.0-1.0/132323.3333333333/108.0*x^108.0-1.0/910.0/16.0*x^16.0-1.0/910.0/16.0*x^16.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/3.84462585E8*x^237.0-1.0/14630.0*x^22.0-1.0/2.726766E7*x^136.0-1.0/2330.740740740741*x^31.0+1.0/7058445.333333335*x^119.0-1.0/1.4290919999999998E7*x^108.0-1.0/14560.0*x^16.0-1.0/14560.0*x^16.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131308() {
 UsageCalculus.TestCase = 131308;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xy^3^94*xy^2^10/--3*xy^3^3*+4*xy^1^4*1*xy^2^5-3*xy^3^3*+4*xy^1^4*1*xy^2^54*xy^1^4*1*xy^2^51*xy^2^5-3*xy^3^6*-4*xy^1^7/-1*xy^2^8*+-3*xy^3^94*xy^1^7/-1*xy^2^8*+-3*xy^3^91*xy^2^8*+-3*xy^3^9-3*xy^3^94*xy^1^10*-1*xy^2/--3*xy^3^2*+4*xy^1^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=307 EqnNumber=8 FamilyID=3 MotifTag=4 Entropy=3 FuncWrapAliasID=4"+
"// MetaRow=[12, 8, 10, 13, 2, 1, 2, 1, 3, 4, 1, 1, 1, 2, 3, 2, 3, 2, 1, 2, 3, 9, 1, 2, 3, 4, 13, 2, 3, 11, 4, 6]"+
"// DOEMatrixRow=[1, 8, 1, 1, 2, 2, 2, 8, 2, 2, 2, 2, 2, 2, 2, 2, 2, 8, 8, 2, 2, 4, 2, 2, 3, 2, 2, 2, 2, 8, 2]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "4.0*xy^127.0-12.0*xy^18.0-12.0*xy^132.0-324.0*xy^27.0+27.0*xy^115.0-9.0*xy^104.0-3.0*xy^12.0+4.0*xy^119.0-12.0*xy^9.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "4.0*127.0*xy^126.0-12.0*18.0*xy^17.0-12.0*132.0*xy^131.0-324.0*27.0*xy^26.0+27.0*115.0*xy^114.0-9.0*104.0*xy^103.0-3.0*12.0*xy^11.0+4.0*119.0*xy^118.0-12.0*9.0*xy^8.0";
 UsageCalculus.EqnSolArrayMap2[1] = "508.0*xy^126.0-216.0*xy^17.0-1584.0*xy^131.0-8748.0*xy^26.0+3105.0*xy^114.0-936.0*xy^103.0-36.0*xy^11.0+476.0*xy^118.0-108.0*xy^8.0";
 UsageCalculus.EqnSolArrayMap3[1] = "4.0*xy^127.0-12.0*xy^18.0-12.0*xy^132.0-324.0*xy^27.0+27.0*xy^115.0-9.0*xy^104.0-3.0*xy^12.0+4.0*xy^119.0-12.0*xy^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "4.0/128.0*xy^128.0-12.0/19.0*xy^19.0-12.0/133.0*xy^133.0-324.0/28.0*xy^28.0+27.0/116.0*xy^116.0-9.0/105.0*xy^105.0-3.0/13.0*xy^13.0+4.0/120.0*xy^120.0-12.0/10.0*xy^10.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/32.0*xy^128.0-1.0/1.5833333333333333*xy^19.0-1.0/11.083333333333334*xy^133.0-11.571428571428571*xy^28.0+1.0/4.296296296296297*xy^116.0-1.0/11.666666666666666*xy^105.0-1.0/4.333333333333333*xy^13.0+1.0/30.0*xy^120.0-1.2*xy^10.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "508.0*xy^126.0-216.0*xy^17.0-1584.0*xy^131.0-8748.0*xy^26.0+3105.0*xy^114.0-936.0*xy^103.0-36.0*xy^11.0+476.0*xy^118.0-108.0*xy^8.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "508.0*126.0*xy^125.0-216.0*17.0*xy^16.0-1584.0*131.0*xy^130.0-8748.0*26.0*xy^25.0+3105.0*114.0*xy^113.0-936.0*103.0*xy^102.0-36.0*11.0*xy^10.0+476.0*118.0*xy^117.0-108.0*8.0*xy^7.0";
 UsageCalculus.EqnSolArrayMap2[2] = "64008.0*xy^125.0-3672.0*xy^16.0-207504.0*xy^130.0-227448.0*xy^25.0+353970.0*xy^113.0-96408.0*xy^102.0-396.0*xy^10.0+56168.0*xy^117.0-864.0*xy^7.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/32.0*xy^128.0-1.0/1.5833333333333333*xy^19.0-1.0/11.083333333333334*xy^133.0-11.571428571428571*xy^28.0+1.0/4.296296296296297*xy^116.0-1.0/11.666666666666666*xy^105.0-1.0/4.333333333333333*xy^13.0+1.0/30.0*xy^120.0-1.2*xy^10.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/32.0/129.0*xy^129.0-1.0/1.5833333333333333/20.0*xy^20.0-1.0/11.083333333333334/134.0*xy^134.0-11.571428571428571/29.0*xy^29.0+1.0/4.296296296296297/117.0*xy^117.0-1.0/11.666666666666666/106.0*xy^106.0-1.0/4.333333333333333/14.0*xy^14.0+1.0/30.0/121.0*xy^121.0-1.2/11.0*xy^11.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/4128.0*xy^129.0-1.0/31.666666666666664*xy^20.0-1.0/1485.1666666666667*xy^134.0-1.0/2.506172839506173*xy^29.0+1.0/502.66666666666674*xy^117.0-1.0/1236.6666666666665*xy^106.0-1.0/60.666666666666664*xy^14.0+1.0/3630.0*xy^121.0-1.0/9.166666666666668*xy^11.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "64008.0*xy^125.0-3672.0*xy^16.0-207504.0*xy^130.0-227448.0*xy^25.0+353970.0*xy^113.0-96408.0*xy^102.0-396.0*xy^10.0+56168.0*xy^117.0-864.0*xy^7.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "64008.0*125.0*xy^124.0-3672.0*16.0*xy^15.0-207504.0*130.0*xy^129.0-227448.0*25.0*xy^24.0+353970.0*113.0*xy^112.0-96408.0*102.0*xy^101.0-396.0*10.0*xy^9.0+56168.0*117.0*xy^116.0-864.0*7.0*xy^6.0";
 UsageCalculus.EqnSolArrayMap2[3] = "8001000.0*xy^124.0-58752.0*xy^15.0-2.697552E7*xy^129.0-5686200.0*xy^24.0+3.999861E7*xy^112.0-9833616.0*xy^101.0-3960.0*xy^9.0+6571656.0*xy^116.0-6048.0*xy^6.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/4128.0*xy^129.0-1.0/31.666666666666664*xy^20.0-1.0/1485.1666666666667*xy^134.0-1.0/2.506172839506173*xy^29.0+1.0/502.66666666666674*xy^117.0-1.0/1236.6666666666665*xy^106.0-1.0/60.666666666666664*xy^14.0+1.0/3630.0*xy^121.0-1.0/9.166666666666668*xy^11.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/4128.0/130.0*xy^130.0-1.0/31.666666666666664/21.0*xy^21.0-1.0/1485.1666666666667/135.0*xy^135.0-1.0/2.506172839506173/30.0*xy^30.0+1.0/502.66666666666674/118.0*xy^118.0-1.0/1236.6666666666665/107.0*xy^107.0-1.0/60.666666666666664/15.0*xy^15.0+1.0/3630.0/122.0*xy^122.0-1.0/9.166666666666668/12.0*xy^12.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/536640.0*xy^130.0-1.0/665.0*xy^21.0-1.0/200497.5*xy^135.0-1.0/75.18518518518519*xy^30.0+1.0/59314.66666666668*xy^118.0-1.0/132323.3333333333*xy^107.0-1.0/910.0*xy^15.0+1.0/442860.0*xy^122.0-1.0/110.00000000000001*xy^12.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "8001000.0*xy^124.0-58752.0*xy^15.0-2.697552E7*xy^129.0-5686200.0*xy^24.0+3.999861E7*xy^112.0-9833616.0*xy^101.0-3960.0*xy^9.0+6571656.0*xy^116.0-6048.0*xy^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "8001000.0*124.0*xy^123.0-58752.0*15.0*xy^14.0-129.0*xy^128.0-5686200.0*24.0*xy^23.0+112.0*xy^111.0-9833616.0*101.0*xy^100.0-3960.0*9.0*xy^8.0+6571656.0*116.0*xy^115.0-6048.0*6.0*xy^5.0";
 UsageCalculus.EqnSolArrayMap2[4] = "9.92124E8*xy^123.0-881280.0*xy^14.0-129.0*xy^128.0-1.364688E8*xy^23.0+112.0*xy^111.0-9.93195216E8*xy^100.0-35640.0*xy^8.0+7.62312096E8*xy^115.0-36288.0*xy^5.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/536640.0*xy^130.0-1.0/665.0*xy^21.0-1.0/200497.5*xy^135.0-1.0/75.18518518518519*xy^30.0+1.0/59314.66666666668*xy^118.0-1.0/132323.3333333333*xy^107.0-1.0/910.0*xy^15.0+1.0/442860.0*xy^122.0-1.0/110.00000000000001*xy^12.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/536640.0/131.0*xy^131.0-1.0/665.0/22.0*xy^22.0-1.0/200497.5/136.0*xy^136.0-1.0/75.18518518518519/31.0*xy^31.0+1.0/59314.66666666668/119.0*xy^119.0-1.0/132323.3333333333/108.0*xy^108.0-1.0/910.0/16.0*xy^16.0+1.0/442860.0/123.0*xy^123.0-1.0/110.00000000000001/13.0*xy^13.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/7.029984E7*xy^131.0-1.0/14630.0*xy^22.0-1.0/2.726766E7*xy^136.0-1.0/2330.740740740741*xy^31.0+1.0/7058445.333333335*xy^119.0-1.0/1.4290919999999998E7*xy^108.0-1.0/14560.0*xy^16.0+1.0/5.447178E7*xy^123.0-1.0/1430.0000000000002*xy^13.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131309() {
 UsageCalculus.TestCase = 131309;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "4*xyz^2^10/--3*xyz^3^3*+4*xyz^1^4*1*xyz^2^5-3*xyz^3^3*+4*xyz^1^4*1*xyz^2^54*xyz^1^4*1*xyz^2^51*xyz^2^5-3*xyz^3^6*-4*xyz^1^7/-1*xyz^2^8*+-3*xyz^3^94*xyz^1^7/-1*xyz^2^8*+-3*xyz^3^91*xyz^2^8*+-3*xyz^3^9-3*xyz^3^94*xyz^1^10*-1*xyz^2/--3*xyz^3^2*+4*xyz^1^31*xyz^2/--3*xyz^3^2*+4*xyz^1^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=308 EqnNumber=9 FamilyID=1 MotifTag=1 Entropy=4 FuncWrapAliasID=1"+
"// MetaRow=[12, 9, 10, 12, 3, 2, 3, 2, 1, 1, 2, 1, 2, 3, 4, 3, 1, 1, 2, 3, 4, 10, 2, 3, 1, 1, 14, 3, 4, 12, 1, 7]"+
"// DOEMatrixRow=[1, 9, 1, 4, 3, 3, 3, 9, 3, 3, 3, 2, 3, 3, 3, 3, 3, 9, 9, 3, 3, 5, 3, 3, 4, 3, 3, 3, 3, 9, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "5.333333333333333*xyz^30.0-12.0*xyz^18.0-12.0*xyz^132.0-324.0*xyz^27.0+27.0*xyz^115.0-9.0*xyz^104.0-3.0*xyz^12.0+5.333333333333333*xyz^158.0-16.0*xyz^48.0-12.0*xyz^9.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "5.333333333333333*30.0*xyz^29.0-12.0*18.0*xyz^17.0-12.0*132.0*xyz^131.0-324.0*27.0*xyz^26.0+27.0*115.0*xyz^114.0-9.0*104.0*xyz^103.0-3.0*12.0*xyz^11.0+5.333333333333333*158.0*xyz^157.0-16.0*48.0*xyz^47.0-12.0*9.0*xyz^8.0";
 UsageCalculus.EqnSolArrayMap2[1] = "160.0*xyz^29.0-216.0*xyz^17.0-1584.0*xyz^131.0-8748.0*xyz^26.0+3105.0*xyz^114.0-936.0*xyz^103.0-36.0*xyz^11.0+842.6666666666666*xyz^157.0-768.0*xyz^47.0-108.0*xyz^8.0";
 UsageCalculus.EqnSolArrayMap3[1] = "5.333333333333333*xyz^30.0-12.0*xyz^18.0-12.0*xyz^132.0-324.0*xyz^27.0+27.0*xyz^115.0-9.0*xyz^104.0-3.0*xyz^12.0+5.333333333333333*xyz^158.0-16.0*xyz^48.0-12.0*xyz^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "5.333333333333333/31.0*xyz^31.0-12.0/19.0*xyz^19.0-12.0/133.0*xyz^133.0-324.0/28.0*xyz^28.0+27.0/116.0*xyz^116.0-9.0/105.0*xyz^105.0-3.0/13.0*xyz^13.0+5.333333333333333/159.0*xyz^159.0-16.0/49.0*xyz^49.0-12.0/10.0*xyz^10.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/5.8125*xyz^31.0-1.0/1.5833333333333333*xyz^19.0-1.0/11.083333333333334*xyz^133.0-11.571428571428571*xyz^28.0+1.0/4.296296296296297*xyz^116.0-1.0/11.666666666666666*xyz^105.0-1.0/4.333333333333333*xyz^13.0+1.0/29.8125*xyz^159.0-1.0/3.0625*xyz^49.0-1.2*xyz^10.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "160.0*xyz^29.0-216.0*xyz^17.0-1584.0*xyz^131.0-8748.0*xyz^26.0+3105.0*xyz^114.0-936.0*xyz^103.0-36.0*xyz^11.0+842.6666666666666*xyz^157.0-768.0*xyz^47.0-108.0*xyz^8.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "160.0*29.0*xyz^28.0-216.0*17.0*xyz^16.0-1584.0*131.0*xyz^130.0-8748.0*26.0*xyz^25.0+3105.0*114.0*xyz^113.0-936.0*103.0*xyz^102.0-36.0*11.0*xyz^10.0+842.6666666666666*157.0*xyz^156.0-768.0*47.0*xyz^46.0-108.0*8.0*xyz^7.0";
 UsageCalculus.EqnSolArrayMap2[2] = "4640.0*xyz^28.0-3672.0*xyz^16.0-207504.0*xyz^130.0-227448.0*xyz^25.0+353970.0*xyz^113.0-96408.0*xyz^102.0-396.0*xyz^10.0+132298.66666666666*xyz^156.0-36096.0*xyz^46.0-864.0*xyz^7.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/5.8125*xyz^31.0-1.0/1.5833333333333333*xyz^19.0-1.0/11.083333333333334*xyz^133.0-11.571428571428571*xyz^28.0+1.0/4.296296296296297*xyz^116.0-1.0/11.666666666666666*xyz^105.0-1.0/4.333333333333333*xyz^13.0+1.0/29.8125*xyz^159.0-1.0/3.0625*xyz^49.0-1.2*xyz^10.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/5.8125/32.0*xyz^32.0-1.0/1.5833333333333333/20.0*xyz^20.0-1.0/11.083333333333334/134.0*xyz^134.0-11.571428571428571/29.0*xyz^29.0+1.0/4.296296296296297/117.0*xyz^117.0-1.0/11.666666666666666/106.0*xyz^106.0-1.0/4.333333333333333/14.0*xyz^14.0+1.0/29.8125/160.0*xyz^160.0-1.0/3.0625/50.0*xyz^50.0-1.2/11.0*xyz^11.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/186.0*xyz^32.0-1.0/31.666666666666664*xyz^20.0-1.0/1485.1666666666667*xyz^134.0-1.0/2.506172839506173*xyz^29.0+1.0/502.66666666666674*xyz^117.0-1.0/1236.6666666666665*xyz^106.0-1.0/60.666666666666664*xyz^14.0+1.0/4770.0*xyz^160.0-1.0/153.125*xyz^50.0-1.0/9.166666666666668*xyz^11.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "4640.0*xyz^28.0-3672.0*xyz^16.0-207504.0*xyz^130.0-227448.0*xyz^25.0+353970.0*xyz^113.0-96408.0*xyz^102.0-396.0*xyz^10.0+132298.66666666666*xyz^156.0-36096.0*xyz^46.0-864.0*xyz^7.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "4640.0*28.0*xyz^27.0-3672.0*16.0*xyz^15.0-207504.0*130.0*xyz^129.0-227448.0*25.0*xyz^24.0+353970.0*113.0*xyz^112.0-96408.0*102.0*xyz^101.0-396.0*10.0*xyz^9.0+132298.66666666666*156.0*xyz^155.0-36096.0*46.0*xyz^45.0-864.0*7.0*xyz^6.0";
 UsageCalculus.EqnSolArrayMap2[3] = "129920.0*xyz^27.0-58752.0*xyz^15.0-2.697552E7*xyz^129.0-5686200.0*xyz^24.0+3.999861E7*xyz^112.0-9833616.0*xyz^101.0-3960.0*xyz^9.0+2.0638592E7*xyz^155.0-1660416.0*xyz^45.0-6048.0*xyz^6.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/186.0*xyz^32.0-1.0/31.666666666666664*xyz^20.0-1.0/1485.1666666666667*xyz^134.0-1.0/2.506172839506173*xyz^29.0+1.0/502.66666666666674*xyz^117.0-1.0/1236.6666666666665*xyz^106.0-1.0/60.666666666666664*xyz^14.0+1.0/4770.0*xyz^160.0-1.0/153.125*xyz^50.0-1.0/9.166666666666668*xyz^11.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/186.0/33.0*xyz^33.0-1.0/31.666666666666664/21.0*xyz^21.0-1.0/1485.1666666666667/135.0*xyz^135.0-1.0/2.506172839506173/30.0*xyz^30.0+1.0/502.66666666666674/118.0*xyz^118.0-1.0/1236.6666666666665/107.0*xyz^107.0-1.0/60.666666666666664/15.0*xyz^15.0+1.0/4770.0/161.0*xyz^161.0-1.0/153.125/51.0*xyz^51.0-1.0/9.166666666666668/12.0*xyz^12.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/6138.0*xyz^33.0-1.0/665.0*xyz^21.0-1.0/200497.5*xyz^135.0-1.0/75.18518518518519*xyz^30.0+1.0/59314.66666666668*xyz^118.0-1.0/132323.3333333333*xyz^107.0-1.0/910.0*xyz^15.0+1.0/767970.0*xyz^161.0-1.0/7809.375*xyz^51.0-1.0/110.00000000000001*xyz^12.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "129920.0*xyz^27.0-58752.0*xyz^15.0-2.697552E7*xyz^129.0-5686200.0*xyz^24.0+3.999861E7*xyz^112.0-9833616.0*xyz^101.0-3960.0*xyz^9.0+2.0638592E7*xyz^155.0-1660416.0*xyz^45.0-6048.0*xyz^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "129920.0*27.0*xyz^26.0-58752.0*15.0*xyz^14.0-129.0*xyz^128.0-5686200.0*24.0*xyz^23.0+112.0*xyz^111.0-9833616.0*101.0*xyz^100.0-3960.0*9.0*xyz^8.0+155.0*xyz^154.0-1660416.0*45.0*xyz^44.0-6048.0*6.0*xyz^5.0";
 UsageCalculus.EqnSolArrayMap2[4] = "3507840.0*xyz^26.0-881280.0*xyz^14.0-129.0*xyz^128.0-1.364688E8*xyz^23.0+112.0*xyz^111.0-9.93195216E8*xyz^100.0-35640.0*xyz^8.0+155.0*xyz^154.0-7.471872E7*xyz^44.0-36288.0*xyz^5.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/6138.0*xyz^33.0-1.0/665.0*xyz^21.0-1.0/200497.5*xyz^135.0-1.0/75.18518518518519*xyz^30.0+1.0/59314.66666666668*xyz^118.0-1.0/132323.3333333333*xyz^107.0-1.0/910.0*xyz^15.0+1.0/767970.0*xyz^161.0-1.0/7809.375*xyz^51.0-1.0/110.00000000000001*xyz^12.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/6138.0/34.0*xyz^34.0-1.0/665.0/22.0*xyz^22.0-1.0/200497.5/136.0*xyz^136.0-1.0/75.18518518518519/31.0*xyz^31.0+1.0/59314.66666666668/119.0*xyz^119.0-1.0/132323.3333333333/108.0*xyz^108.0-1.0/910.0/16.0*xyz^16.0+1.0/767970.0/162.0*xyz^162.0-1.0/7809.375/52.0*xyz^52.0-1.0/110.00000000000001/13.0*xyz^13.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/208692.0*xyz^34.0-1.0/14630.0*xyz^22.0-1.0/2.726766E7*xyz^136.0-1.0/2330.740740740741*xyz^31.0+1.0/7058445.333333335*xyz^119.0-1.0/1.4290919999999998E7*xyz^108.0-1.0/14560.0*xyz^16.0+1.0/1.2441114E8*xyz^162.0-1.0/406087.5*xyz^52.0-1.0/1430.0000000000002*xyz^13.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131310() {
 UsageCalculus.TestCase = 131310;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xyza^3^3*+4*xyza^1^4*1*xyza^2^54*xyza^1^4*1*xyza^2^51*xyza^2^5-3*xyza^3^6*-4*xyza^1^7/-1*xyza^2^8*+-3*xyza^3^94*xyza^1^7/-1*xyza^2^8*+-3*xyza^3^91*xyza^2^8*+-3*xyza^3^9-3*xyza^3^94*xyza^1^10*-1*xyza^2/--3*xyza^3^2*+4*xyza^1^31*xyza^2/--3*xyza^3^2*+4*xyza^1^3-3*xyza^3^2*+4*xyza^1^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=309 EqnNumber=10 FamilyID=2 MotifTag=3 Entropy=1 FuncWrapAliasID=3"+
"// MetaRow=[12, 10, 10, 11, 4, 3, 1, 3, 2, 3, 4, 2, 3, 1, 1, 1, 2, 1, 3, 1, 1, 11, 3, 1, 2, 3, 15, 1, 1, 13, 2, 8]"+
"// DOEMatrixRow=[1, 10, 1, 3, 2, 2, 2, 10, 2, 4, 4, 2, 2, 2, 4, 2, 2, 10, 10, 2, 2, 2, 2, 2, 5, 4, 2, 2, 4, 10, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-12.0*xyza^132.0-324.0*xyza^27.0+27.0*xyza^115.0-9.0*xyza^104.0-3.0*xyza^12.0+5.333333333333333*xyza^158.0-16.0*xyza^48.0-12.0*xyza^9.0-12.0*xyza^9.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-12.0*132.0*xyza^131.0-324.0*27.0*xyza^26.0+27.0*115.0*xyza^114.0-9.0*104.0*xyza^103.0-3.0*12.0*xyza^11.0+5.333333333333333*158.0*xyza^157.0-16.0*48.0*xyza^47.0-12.0*9.0*xyza^8.0-12.0*9.0*xyza^8.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-1584.0*xyza^131.0-8748.0*xyza^26.0+3105.0*xyza^114.0-936.0*xyza^103.0-36.0*xyza^11.0+842.6666666666666*xyza^157.0-768.0*xyza^47.0-108.0*xyza^8.0-108.0*xyza^8.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-12.0*xyza^132.0-324.0*xyza^27.0+27.0*xyza^115.0-9.0*xyza^104.0-3.0*xyza^12.0+5.333333333333333*xyza^158.0-16.0*xyza^48.0-12.0*xyza^9.0-12.0*xyza^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-12.0/133.0*xyza^133.0-324.0/28.0*xyza^28.0+27.0/116.0*xyza^116.0-9.0/105.0*xyza^105.0-3.0/13.0*xyza^13.0+5.333333333333333/159.0*xyza^159.0-16.0/49.0*xyza^49.0-12.0/10.0*xyza^10.0-12.0/10.0*xyza^10.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/11.083333333333334*xyza^133.0-11.571428571428571*xyza^28.0+1.0/4.296296296296297*xyza^116.0-1.0/11.666666666666666*xyza^105.0-1.0/4.333333333333333*xyza^13.0+1.0/29.8125*xyza^159.0-1.0/3.0625*xyza^49.0-1.2*xyza^10.0-1.2*xyza^10.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-1584.0*xyza^131.0-8748.0*xyza^26.0+3105.0*xyza^114.0-936.0*xyza^103.0-36.0*xyza^11.0+842.6666666666666*xyza^157.0-768.0*xyza^47.0-108.0*xyza^8.0-108.0*xyza^8.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-1584.0*131.0*xyza^130.0-8748.0*26.0*xyza^25.0+3105.0*114.0*xyza^113.0-936.0*103.0*xyza^102.0-36.0*11.0*xyza^10.0+842.6666666666666*157.0*xyza^156.0-768.0*47.0*xyza^46.0-108.0*8.0*xyza^7.0-108.0*8.0*xyza^7.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-207504.0*xyza^130.0-227448.0*xyza^25.0+353970.0*xyza^113.0-96408.0*xyza^102.0-396.0*xyza^10.0+132298.66666666666*xyza^156.0-36096.0*xyza^46.0-864.0*xyza^7.0-864.0*xyza^7.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/11.083333333333334*xyza^133.0-11.571428571428571*xyza^28.0+1.0/4.296296296296297*xyza^116.0-1.0/11.666666666666666*xyza^105.0-1.0/4.333333333333333*xyza^13.0+1.0/29.8125*xyza^159.0-1.0/3.0625*xyza^49.0-1.2*xyza^10.0-1.2*xyza^10.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/11.083333333333334/134.0*xyza^134.0-11.571428571428571/29.0*xyza^29.0+1.0/4.296296296296297/117.0*xyza^117.0-1.0/11.666666666666666/106.0*xyza^106.0-1.0/4.333333333333333/14.0*xyza^14.0+1.0/29.8125/160.0*xyza^160.0-1.0/3.0625/50.0*xyza^50.0-1.2/11.0*xyza^11.0-1.2/11.0*xyza^11.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/1485.1666666666667*xyza^134.0-1.0/2.506172839506173*xyza^29.0+1.0/502.66666666666674*xyza^117.0-1.0/1236.6666666666665*xyza^106.0-1.0/60.666666666666664*xyza^14.0+1.0/4770.0*xyza^160.0-1.0/153.125*xyza^50.0-1.0/9.166666666666668*xyza^11.0-1.0/9.166666666666668*xyza^11.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-207504.0*xyza^130.0-227448.0*xyza^25.0+353970.0*xyza^113.0-96408.0*xyza^102.0-396.0*xyza^10.0+132298.66666666666*xyza^156.0-36096.0*xyza^46.0-864.0*xyza^7.0-864.0*xyza^7.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-207504.0*130.0*xyza^129.0-227448.0*25.0*xyza^24.0+353970.0*113.0*xyza^112.0-96408.0*102.0*xyza^101.0-396.0*10.0*xyza^9.0+132298.66666666666*156.0*xyza^155.0-36096.0*46.0*xyza^45.0-864.0*7.0*xyza^6.0-864.0*7.0*xyza^6.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-2.697552E7*xyza^129.0-5686200.0*xyza^24.0+3.999861E7*xyza^112.0-9833616.0*xyza^101.0-3960.0*xyza^9.0+2.0638592E7*xyza^155.0-1660416.0*xyza^45.0-6048.0*xyza^6.0-6048.0*xyza^6.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/1485.1666666666667*xyza^134.0-1.0/2.506172839506173*xyza^29.0+1.0/502.66666666666674*xyza^117.0-1.0/1236.6666666666665*xyza^106.0-1.0/60.666666666666664*xyza^14.0+1.0/4770.0*xyza^160.0-1.0/153.125*xyza^50.0-1.0/9.166666666666668*xyza^11.0-1.0/9.166666666666668*xyza^11.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/1485.1666666666667/135.0*xyza^135.0-1.0/2.506172839506173/30.0*xyza^30.0+1.0/502.66666666666674/118.0*xyza^118.0-1.0/1236.6666666666665/107.0*xyza^107.0-1.0/60.666666666666664/15.0*xyza^15.0+1.0/4770.0/161.0*xyza^161.0-1.0/153.125/51.0*xyza^51.0-1.0/9.166666666666668/12.0*xyza^12.0-1.0/9.166666666666668/12.0*xyza^12.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/200497.5*xyza^135.0-1.0/75.18518518518519*xyza^30.0+1.0/59314.66666666668*xyza^118.0-1.0/132323.3333333333*xyza^107.0-1.0/910.0*xyza^15.0+1.0/767970.0*xyza^161.0-1.0/7809.375*xyza^51.0-1.0/110.00000000000001*xyza^12.0-1.0/110.00000000000001*xyza^12.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-2.697552E7*xyza^129.0-5686200.0*xyza^24.0+3.999861E7*xyza^112.0-9833616.0*xyza^101.0-3960.0*xyza^9.0+2.0638592E7*xyza^155.0-1660416.0*xyza^45.0-6048.0*xyza^6.0-6048.0*xyza^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-129.0*xyza^128.0-5686200.0*24.0*xyza^23.0+112.0*xyza^111.0-9833616.0*101.0*xyza^100.0-3960.0*9.0*xyza^8.0+155.0*xyza^154.0-1660416.0*45.0*xyza^44.0-6048.0*6.0*xyza^5.0-6048.0*6.0*xyza^5.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-129.0*xyza^128.0-1.364688E8*xyza^23.0+112.0*xyza^111.0-9.93195216E8*xyza^100.0-35640.0*xyza^8.0+155.0*xyza^154.0-7.471872E7*xyza^44.0-36288.0*xyza^5.0-36288.0*xyza^5.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/200497.5*xyza^135.0-1.0/75.18518518518519*xyza^30.0+1.0/59314.66666666668*xyza^118.0-1.0/132323.3333333333*xyza^107.0-1.0/910.0*xyza^15.0+1.0/767970.0*xyza^161.0-1.0/7809.375*xyza^51.0-1.0/110.00000000000001*xyza^12.0-1.0/110.00000000000001*xyza^12.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/200497.5/136.0*xyza^136.0-1.0/75.18518518518519/31.0*xyza^31.0+1.0/59314.66666666668/119.0*xyza^119.0-1.0/132323.3333333333/108.0*xyza^108.0-1.0/910.0/16.0*xyza^16.0+1.0/767970.0/162.0*xyza^162.0-1.0/7809.375/52.0*xyza^52.0-1.0/110.00000000000001/13.0*xyza^13.0-1.0/110.00000000000001/13.0*xyza^13.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/2.726766E7*xyza^136.0-1.0/2330.740740740741*xyza^31.0+1.0/7058445.333333335*xyza^119.0-1.0/1.4290919999999998E7*xyza^108.0-1.0/14560.0*xyza^16.0+1.0/1.2441114E8*xyza^162.0-1.0/406087.5*xyza^52.0-1.0/1430.0000000000002*xyza^13.0-1.0/1430.0000000000002*xyza^13.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131311() {
 UsageCalculus.TestCase = 131311;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "4*x^1^4*1*x^2^51*x^2^5-3*x^3^6*-4*x^1^7/-1*x^2^8*+-3*x^3^94*x^1^7/-1*x^2^8*+-3*x^3^91*x^2^8*+-3*x^3^9-3*x^3^94*x^1^10*-1*x^2/--3*x^3^2*+4*x^1^31*x^2/--3*x^3^2*+4*x^1^3-3*x^3^2*+4*x^1^34*x^1^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=310 EqnNumber=11 FamilyID=3 MotifTag=4 Entropy=3 FuncWrapAliasID=4"+
"// MetaRow=[12, 11, 10, 10, 1, 1, 2, 4, 3, 4, 1, 1, 1, 2, 3, 2, 3, 2, 4, 2, 3, 12, 1, 2, 3, 4, 16, 2, 3, 14, 3, 9]"+
"// DOEMatrixRow=[1, 11, 1, 2, 3, 3, 3, 2, 3, 2, 2, 2, 3, 3, 2, 3, 3, 11, 2, 3, 3, 3, 3, 3, 6, 2, 3, 3, 2, 11, 2]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "4.0*x^65.0-324.0*x^27.0+27.0*x^115.0-9.0*x^104.0-3.0*x^12.0+5.333333333333333*x^158.0-16.0*x^48.0-12.0*x^9.0-12.0*x^44.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "4.0*65.0*x^64.0-324.0*27.0*x^26.0+27.0*115.0*x^114.0-9.0*104.0*x^103.0-3.0*12.0*x^11.0+5.333333333333333*158.0*x^157.0-16.0*48.0*x^47.0-12.0*9.0*x^8.0-12.0*44.0*x^43.0";
 UsageCalculus.EqnSolArrayMap2[1] = "260.0*x^64.0-8748.0*x^26.0+3105.0*x^114.0-936.0*x^103.0-36.0*x^11.0+842.6666666666666*x^157.0-768.0*x^47.0-108.0*x^8.0-528.0*x^43.0";
 UsageCalculus.EqnSolArrayMap3[1] = "4.0*x^65.0-324.0*x^27.0+27.0*x^115.0-9.0*x^104.0-3.0*x^12.0+5.333333333333333*x^158.0-16.0*x^48.0-12.0*x^9.0-12.0*x^44.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "4.0/66.0*x^66.0-324.0/28.0*x^28.0+27.0/116.0*x^116.0-9.0/105.0*x^105.0-3.0/13.0*x^13.0+5.333333333333333/159.0*x^159.0-16.0/49.0*x^49.0-12.0/10.0*x^10.0-12.0/45.0*x^45.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/16.5*x^66.0-11.571428571428571*x^28.0+1.0/4.296296296296297*x^116.0-1.0/11.666666666666666*x^105.0-1.0/4.333333333333333*x^13.0+1.0/29.8125*x^159.0-1.0/3.0625*x^49.0-1.2*x^10.0-1.0/3.75*x^45.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "260.0*x^64.0-8748.0*x^26.0+3105.0*x^114.0-936.0*x^103.0-36.0*x^11.0+842.6666666666666*x^157.0-768.0*x^47.0-108.0*x^8.0-528.0*x^43.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "260.0*64.0*x^63.0-8748.0*26.0*x^25.0+3105.0*114.0*x^113.0-936.0*103.0*x^102.0-36.0*11.0*x^10.0+842.6666666666666*157.0*x^156.0-768.0*47.0*x^46.0-108.0*8.0*x^7.0-528.0*43.0*x^42.0";
 UsageCalculus.EqnSolArrayMap2[2] = "16640.0*x^63.0-227448.0*x^25.0+353970.0*x^113.0-96408.0*x^102.0-396.0*x^10.0+132298.66666666666*x^156.0-36096.0*x^46.0-864.0*x^7.0-22704.0*x^42.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/16.5*x^66.0-11.571428571428571*x^28.0+1.0/4.296296296296297*x^116.0-1.0/11.666666666666666*x^105.0-1.0/4.333333333333333*x^13.0+1.0/29.8125*x^159.0-1.0/3.0625*x^49.0-1.2*x^10.0-1.0/3.75*x^45.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/16.5/67.0*x^67.0-11.571428571428571/29.0*x^29.0+1.0/4.296296296296297/117.0*x^117.0-1.0/11.666666666666666/106.0*x^106.0-1.0/4.333333333333333/14.0*x^14.0+1.0/29.8125/160.0*x^160.0-1.0/3.0625/50.0*x^50.0-1.2/11.0*x^11.0-1.0/3.75/46.0*x^46.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/1105.5*x^67.0-1.0/2.506172839506173*x^29.0+1.0/502.66666666666674*x^117.0-1.0/1236.6666666666665*x^106.0-1.0/60.666666666666664*x^14.0+1.0/4770.0*x^160.0-1.0/153.125*x^50.0-1.0/9.166666666666668*x^11.0-1.0/172.5*x^46.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "16640.0*x^63.0-227448.0*x^25.0+353970.0*x^113.0-96408.0*x^102.0-396.0*x^10.0+132298.66666666666*x^156.0-36096.0*x^46.0-864.0*x^7.0-22704.0*x^42.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "16640.0*63.0*x^62.0-227448.0*25.0*x^24.0+353970.0*113.0*x^112.0-96408.0*102.0*x^101.0-396.0*10.0*x^9.0+132298.66666666666*156.0*x^155.0-36096.0*46.0*x^45.0-864.0*7.0*x^6.0-22704.0*42.0*x^41.0";
 UsageCalculus.EqnSolArrayMap2[3] = "1048320.0*x^62.0-5686200.0*x^24.0+3.999861E7*x^112.0-9833616.0*x^101.0-3960.0*x^9.0+2.0638592E7*x^155.0-1660416.0*x^45.0-6048.0*x^6.0-953568.0*x^41.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/1105.5*x^67.0-1.0/2.506172839506173*x^29.0+1.0/502.66666666666674*x^117.0-1.0/1236.6666666666665*x^106.0-1.0/60.666666666666664*x^14.0+1.0/4770.0*x^160.0-1.0/153.125*x^50.0-1.0/9.166666666666668*x^11.0-1.0/172.5*x^46.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/1105.5/68.0*x^68.0-1.0/2.506172839506173/30.0*x^30.0+1.0/502.66666666666674/118.0*x^118.0-1.0/1236.6666666666665/107.0*x^107.0-1.0/60.666666666666664/15.0*x^15.0+1.0/4770.0/161.0*x^161.0-1.0/153.125/51.0*x^51.0-1.0/9.166666666666668/12.0*x^12.0-1.0/172.5/47.0*x^47.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/75174.0*x^68.0-1.0/75.18518518518519*x^30.0+1.0/59314.66666666668*x^118.0-1.0/132323.3333333333*x^107.0-1.0/910.0*x^15.0+1.0/767970.0*x^161.0-1.0/7809.375*x^51.0-1.0/110.00000000000001*x^12.0-1.0/8107.5*x^47.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "1048320.0*x^62.0-5686200.0*x^24.0+3.999861E7*x^112.0-9833616.0*x^101.0-3960.0*x^9.0+2.0638592E7*x^155.0-1660416.0*x^45.0-6048.0*x^6.0-953568.0*x^41.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "1048320.0*62.0*x^61.0-5686200.0*24.0*x^23.0+112.0*x^111.0-9833616.0*101.0*x^100.0-3960.0*9.0*x^8.0+155.0*x^154.0-1660416.0*45.0*x^44.0-6048.0*6.0*x^5.0-953568.0*41.0*x^40.0";
 UsageCalculus.EqnSolArrayMap2[4] = "6.499584E7*x^61.0-1.364688E8*x^23.0+112.0*x^111.0-9.93195216E8*x^100.0-35640.0*x^8.0+155.0*x^154.0-7.471872E7*x^44.0-36288.0*x^5.0-3.9096288E7*x^40.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/75174.0*x^68.0-1.0/75.18518518518519*x^30.0+1.0/59314.66666666668*x^118.0-1.0/132323.3333333333*x^107.0-1.0/910.0*x^15.0+1.0/767970.0*x^161.0-1.0/7809.375*x^51.0-1.0/110.00000000000001*x^12.0-1.0/8107.5*x^47.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/75174.0/69.0*x^69.0-1.0/75.18518518518519/31.0*x^31.0+1.0/59314.66666666668/119.0*x^119.0-1.0/132323.3333333333/108.0*x^108.0-1.0/910.0/16.0*x^16.0+1.0/767970.0/162.0*x^162.0-1.0/7809.375/52.0*x^52.0-1.0/110.00000000000001/13.0*x^13.0-1.0/8107.5/48.0*x^48.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/5187006.0*x^69.0-1.0/2330.740740740741*x^31.0+1.0/7058445.333333335*x^119.0-1.0/1.4290919999999998E7*x^108.0-1.0/14560.0*x^16.0+1.0/1.2441114E8*x^162.0-1.0/406087.5*x^52.0-1.0/1430.0000000000002*x^13.0-1.0/389160.0*x^48.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131312() {
 UsageCalculus.TestCase = 131312;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xy^2^5-3*xy^3^6*-4*xy^1^7/-1*xy^2^8*+-3*xy^3^94*xy^1^7/-1*xy^2^8*+-3*xy^3^91*xy^2^8*+-3*xy^3^9-3*xy^3^94*xy^1^10*-1*xy^2/--3*xy^3^2*+4*xy^1^31*xy^2/--3*xy^3^2*+4*xy^1^3-3*xy^3^2*+4*xy^1^34*xy^1^31*xy012^4/-3*xy012^5*-4*xy012^6/-1*xy012^7";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=311 EqnNumber=12 FamilyID=1 MotifTag=1 Entropy=4 FuncWrapAliasID=1"+
"// MetaRow=[12, 12, 10, 9, 2, 3, 1, 5, 1, 1, 2, 1, 2, 3, 4, 3, 1, 1, 5, 3, 4, 13, 2, 3, 1, 1, 1, 3, 4, 15, 4, 10]"+
"// DOEMatrixRow=[1, 12, 1, 1, 2, 2, 2, 3, 2, 3, 3, 2, 2, 2, 3, 2, 2, 12, 3, 2, 2, 4, 2, 2, 2, 3, 2, 2, 3, 12, 2]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "xy^7.0-324.0*xy^27.0+27.0*xy^115.0-9.0*xy^104.0-3.0*xy^12.0+5.333333333333333*xy^158.0-16.0*xy^48.0-12.0*xy^9.0+16.0*xy^72.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "7.0*xy^6.0-324.0*27.0*xy^26.0+27.0*115.0*xy^114.0-9.0*104.0*xy^103.0-3.0*12.0*xy^11.0+5.333333333333333*158.0*xy^157.0-16.0*48.0*xy^47.0-12.0*9.0*xy^8.0+16.0*72.0*xy^71.0";
 UsageCalculus.EqnSolArrayMap2[1] = "7.0*xy^6.0-8748.0*xy^26.0+3105.0*xy^114.0-936.0*xy^103.0-36.0*xy^11.0+842.6666666666666*xy^157.0-768.0*xy^47.0-108.0*xy^8.0+1152.0*xy^71.0";
 UsageCalculus.EqnSolArrayMap3[1] = "xy^7.0-324.0*xy^27.0+27.0*xy^115.0-9.0*xy^104.0-3.0*xy^12.0+5.333333333333333*xy^158.0-16.0*xy^48.0-12.0*xy^9.0+16.0*xy^72.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0/8.0*xy^8.0-324.0/28.0*xy^28.0+27.0/116.0*xy^116.0-9.0/105.0*xy^105.0-3.0/13.0*xy^13.0+5.333333333333333/159.0*xy^159.0-16.0/49.0*xy^49.0-12.0/10.0*xy^10.0+16.0/73.0*xy^73.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/8.0*xy^8.0-11.571428571428571*xy^28.0+1.0/4.296296296296297*xy^116.0-1.0/11.666666666666666*xy^105.0-1.0/4.333333333333333*xy^13.0+1.0/29.8125*xy^159.0-1.0/3.0625*xy^49.0-1.2*xy^10.0+1.0/4.5625*xy^73.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "7.0*xy^6.0-8748.0*xy^26.0+3105.0*xy^114.0-936.0*xy^103.0-36.0*xy^11.0+842.6666666666666*xy^157.0-768.0*xy^47.0-108.0*xy^8.0+1152.0*xy^71.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "7.0*6.0*xy^5.0-8748.0*26.0*xy^25.0+3105.0*114.0*xy^113.0-936.0*103.0*xy^102.0-36.0*11.0*xy^10.0+842.6666666666666*157.0*xy^156.0-768.0*47.0*xy^46.0-108.0*8.0*xy^7.0+1152.0*71.0*xy^70.0";
 UsageCalculus.EqnSolArrayMap2[2] = "42.0*xy^5.0-227448.0*xy^25.0+353970.0*xy^113.0-96408.0*xy^102.0-396.0*xy^10.0+132298.66666666666*xy^156.0-36096.0*xy^46.0-864.0*xy^7.0+81792.0*xy^70.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/8.0*xy^8.0-11.571428571428571*xy^28.0+1.0/4.296296296296297*xy^116.0-1.0/11.666666666666666*xy^105.0-1.0/4.333333333333333*xy^13.0+1.0/29.8125*xy^159.0-1.0/3.0625*xy^49.0-1.2*xy^10.0+1.0/4.5625*xy^73.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/8.0/9.0*xy^9.0-11.571428571428571/29.0*xy^29.0+1.0/4.296296296296297/117.0*xy^117.0-1.0/11.666666666666666/106.0*xy^106.0-1.0/4.333333333333333/14.0*xy^14.0+1.0/29.8125/160.0*xy^160.0-1.0/3.0625/50.0*xy^50.0-1.2/11.0*xy^11.0+1.0/4.5625/74.0*xy^74.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/72.0*xy^9.0-1.0/2.506172839506173*xy^29.0+1.0/502.66666666666674*xy^117.0-1.0/1236.6666666666665*xy^106.0-1.0/60.666666666666664*xy^14.0+1.0/4770.0*xy^160.0-1.0/153.125*xy^50.0-1.0/9.166666666666668*xy^11.0+1.0/337.625*xy^74.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "42.0*xy^5.0-227448.0*xy^25.0+353970.0*xy^113.0-96408.0*xy^102.0-396.0*xy^10.0+132298.66666666666*xy^156.0-36096.0*xy^46.0-864.0*xy^7.0+81792.0*xy^70.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "42.0*5.0*xy^4.0-227448.0*25.0*xy^24.0+353970.0*113.0*xy^112.0-96408.0*102.0*xy^101.0-396.0*10.0*xy^9.0+132298.66666666666*156.0*xy^155.0-36096.0*46.0*xy^45.0-864.0*7.0*xy^6.0+81792.0*70.0*xy^69.0";
 UsageCalculus.EqnSolArrayMap2[3] = "210.0*xy^4.0-5686200.0*xy^24.0+3.999861E7*xy^112.0-9833616.0*xy^101.0-3960.0*xy^9.0+2.0638592E7*xy^155.0-1660416.0*xy^45.0-6048.0*xy^6.0+5725440.0*xy^69.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/72.0*xy^9.0-1.0/2.506172839506173*xy^29.0+1.0/502.66666666666674*xy^117.0-1.0/1236.6666666666665*xy^106.0-1.0/60.666666666666664*xy^14.0+1.0/4770.0*xy^160.0-1.0/153.125*xy^50.0-1.0/9.166666666666668*xy^11.0+1.0/337.625*xy^74.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/72.0/10.0*xy^10.0-1.0/2.506172839506173/30.0*xy^30.0+1.0/502.66666666666674/118.0*xy^118.0-1.0/1236.6666666666665/107.0*xy^107.0-1.0/60.666666666666664/15.0*xy^15.0+1.0/4770.0/161.0*xy^161.0-1.0/153.125/51.0*xy^51.0-1.0/9.166666666666668/12.0*xy^12.0+1.0/337.625/75.0*xy^75.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/720.0*xy^10.0-1.0/75.18518518518519*xy^30.0+1.0/59314.66666666668*xy^118.0-1.0/132323.3333333333*xy^107.0-1.0/910.0*xy^15.0+1.0/767970.0*xy^161.0-1.0/7809.375*xy^51.0-1.0/110.00000000000001*xy^12.0+1.0/25321.875*xy^75.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "210.0*xy^4.0-5686200.0*xy^24.0+3.999861E7*xy^112.0-9833616.0*xy^101.0-3960.0*xy^9.0+2.0638592E7*xy^155.0-1660416.0*xy^45.0-6048.0*xy^6.0+5725440.0*xy^69.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "210.0*4.0*xy^3.0-5686200.0*24.0*xy^23.0+112.0*xy^111.0-9833616.0*101.0*xy^100.0-3960.0*9.0*xy^8.0+155.0*xy^154.0-1660416.0*45.0*xy^44.0-6048.0*6.0*xy^5.0+5725440.0*69.0*xy^68.0";
 UsageCalculus.EqnSolArrayMap2[4] = "840.0*xy^3.0-1.364688E8*xy^23.0+112.0*xy^111.0-9.93195216E8*xy^100.0-35640.0*xy^8.0+155.0*xy^154.0-7.471872E7*xy^44.0-36288.0*xy^5.0+3.9505536E8*xy^68.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/720.0*xy^10.0-1.0/75.18518518518519*xy^30.0+1.0/59314.66666666668*xy^118.0-1.0/132323.3333333333*xy^107.0-1.0/910.0*xy^15.0+1.0/767970.0*xy^161.0-1.0/7809.375*xy^51.0-1.0/110.00000000000001*xy^12.0+1.0/25321.875*xy^75.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/720.0/11.0*xy^11.0-1.0/75.18518518518519/31.0*xy^31.0+1.0/59314.66666666668/119.0*xy^119.0-1.0/132323.3333333333/108.0*xy^108.0-1.0/910.0/16.0*xy^16.0+1.0/767970.0/162.0*xy^162.0-1.0/7809.375/52.0*xy^52.0-1.0/110.00000000000001/13.0*xy^13.0+1.0/25321.875/76.0*xy^76.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/7920.0*xy^11.0-1.0/2330.740740740741*xy^31.0+1.0/7058445.333333335*xy^119.0-1.0/1.4290919999999998E7*xy^108.0-1.0/14560.0*xy^16.0+1.0/1.2441114E8*xy^162.0-1.0/406087.5*xy^52.0-1.0/1430.0000000000002*xy^13.0+1.0/1924462.5*xy^76.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131313() {
 UsageCalculus.TestCase = 131313;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xyz^3^6*-4*xyz^1^7/-1*xyz^2^8*+-3*xyz^3^94*xyz^1^7/-1*xyz^2^8*+-3*xyz^3^91*xyz^2^8*+-3*xyz^3^9-3*xyz^3^94*xyz^1^10*-1*xyz^2/--3*xyz^3^2*+4*xyz^1^31*xyz^2/--3*xyz^3^2*+4*xyz^1^3-3*xyz^3^2*+4*xyz^1^34*xyz^1^31*xy012^4/-3*xy012^5*-4*xy012^6/-1*xy012^7-3*xyz^3^5*-4*xyz^1^6/-1*xyz^2^7";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=312 EqnNumber=13 FamilyID=2 MotifTag=3 Entropy=1 FuncWrapAliasID=3"+
"// MetaRow=[12, 13, 10, 8, 3, 1, 2, 6, 2, 3, 4, 2, 3, 1, 1, 1, 2, 1, 1, 1, 1, 14, 3, 1, 2, 3, 2, 1, 1, 16, 1, 11]"+
"// DOEMatrixRow=[1, 13, 1, 4, 3, 3, 3, 4, 3, 4, 4, 2, 3, 3, 4, 3, 3, 13, 4, 3, 3, 5, 3, 3, 3, 4, 3, 3, 4, 13, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-324.0*xyz^27.0+27.0*xyz^115.0-9.0*xyz^104.0-3.0*xyz^12.0+5.333333333333333*xyz^158.0-16.0*xyz^48.0-12.0*xyz^9.0+xy012^4.0*16.0*xyz^72.0-12.0*xyz^24.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-324.0*27.0*xyz^26.0+27.0*115.0*xyz^114.0-9.0*104.0*xyz^103.0-3.0*12.0*xyz^11.0+5.333333333333333*158.0*xyz^157.0-16.0*48.0*xyz^47.0-12.0*9.0*xyz^8.0+xy012^4.0*16.0*72.0*xyz^71.0-12.0*24.0*xyz^23.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-8748.0*xyz^26.0+3105.0*xyz^114.0-936.0*xyz^103.0-36.0*xyz^11.0+842.6666666666666*xyz^157.0-768.0*xyz^47.0-108.0*xyz^8.0+xy012^4.0*1152.0*xyz^71.0-288.0*xyz^23.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-324.0*xyz^27.0+27.0*xyz^115.0-9.0*xyz^104.0-3.0*xyz^12.0+5.333333333333333*xyz^158.0-16.0*xyz^48.0-12.0*xyz^9.0+xy012^4.0*16.0*xyz^72.0-12.0*xyz^24.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-324.0/28.0*xyz^28.0+27.0/116.0*xyz^116.0-9.0/105.0*xyz^105.0-3.0/13.0*xyz^13.0+5.333333333333333/159.0*xyz^159.0-16.0/49.0*xyz^49.0-12.0/10.0*xyz^10.0+xy012^4.0*16.0/73.0*xyz^73.0-12.0/25.0*xyz^25.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-11.571428571428571*xyz^28.0+1.0/4.296296296296297*xyz^116.0-1.0/11.666666666666666*xyz^105.0-1.0/4.333333333333333*xyz^13.0+1.0/29.8125*xyz^159.0-1.0/3.0625*xyz^49.0-1.2*xyz^10.0+xy012^4.0/4.5625*xyz^73.0-1.0/2.0833333333333335*xyz^25.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-8748.0*xyz^26.0+3105.0*xyz^114.0-936.0*xyz^103.0-36.0*xyz^11.0+842.6666666666666*xyz^157.0-768.0*xyz^47.0-108.0*xyz^8.0+xy012^4.0*1152.0*xyz^71.0-288.0*xyz^23.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-8748.0*26.0*xyz^25.0+3105.0*114.0*xyz^113.0-936.0*103.0*xyz^102.0-36.0*11.0*xyz^10.0+842.6666666666666*157.0*xyz^156.0-768.0*47.0*xyz^46.0-108.0*8.0*xyz^7.0+xy012^4.0*1152.0*71.0*xyz^70.0-288.0*23.0*xyz^22.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-227448.0*xyz^25.0+353970.0*xyz^113.0-96408.0*xyz^102.0-396.0*xyz^10.0+132298.66666666666*xyz^156.0-36096.0*xyz^46.0-864.0*xyz^7.0+xy012^4.0*81792.0*xyz^70.0-6624.0*xyz^22.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-11.571428571428571*xyz^28.0+1.0/4.296296296296297*xyz^116.0-1.0/11.666666666666666*xyz^105.0-1.0/4.333333333333333*xyz^13.0+1.0/29.8125*xyz^159.0-1.0/3.0625*xyz^49.0-1.2*xyz^10.0+xy012^4.0/4.5625*xyz^73.0-1.0/2.0833333333333335*xyz^25.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-11.571428571428571/29.0*xyz^29.0+1.0/4.296296296296297/117.0*xyz^117.0-1.0/11.666666666666666/106.0*xyz^106.0-1.0/4.333333333333333/14.0*xyz^14.0+1.0/29.8125/160.0*xyz^160.0-1.0/3.0625/50.0*xyz^50.0-1.2/11.0*xyz^11.0+xy012^4.0/4.5625/74.0*xyz^74.0-1.0/2.0833333333333335/26.0*xyz^26.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/2.506172839506173*xyz^29.0+1.0/502.66666666666674*xyz^117.0-1.0/1236.6666666666665*xyz^106.0-1.0/60.666666666666664*xyz^14.0+1.0/4770.0*xyz^160.0-1.0/153.125*xyz^50.0-0.10909090909090909*xyz^11.0+xy012^4.0/337.625*xyz^74.0-1.0/54.16666666666667*xyz^26.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-227448.0*xyz^25.0+353970.0*xyz^113.0-96408.0*xyz^102.0-396.0*xyz^10.0+132298.66666666666*xyz^156.0-36096.0*xyz^46.0-864.0*xyz^7.0+xy012^4.0*81792.0*xyz^70.0-6624.0*xyz^22.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-227448.0*25.0*xyz^24.0+353970.0*113.0*xyz^112.0-96408.0*102.0*xyz^101.0-396.0*10.0*xyz^9.0+132298.66666666666*156.0*xyz^155.0-36096.0*46.0*xyz^45.0-864.0*7.0*xyz^6.0+xy012^4.0*81792.0*70.0*xyz^69.0-6624.0*22.0*xyz^21.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-5686200.0*xyz^24.0+3.999861E7*xyz^112.0-9833616.0*xyz^101.0-3960.0*xyz^9.0+2.0638592E7*xyz^155.0-1660416.0*xyz^45.0-6048.0*xyz^6.0+xy012^4.0*5725440.0*xyz^69.0-145728.0*xyz^21.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/2.506172839506173*xyz^29.0+1.0/502.66666666666674*xyz^117.0-1.0/1236.6666666666665*xyz^106.0-1.0/60.666666666666664*xyz^14.0+1.0/4770.0*xyz^160.0-1.0/153.125*xyz^50.0-0.10909090909090909*xyz^11.0+xy012^4.0/337.625*xyz^74.0-1.0/54.16666666666667*xyz^26.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/2.506172839506173/30.0*xyz^30.0+1.0/502.66666666666674/118.0*xyz^118.0-1.0/1236.6666666666665/107.0*xyz^107.0-1.0/60.666666666666664/15.0*xyz^15.0+1.0/4770.0/161.0*xyz^161.0-1.0/153.125/51.0*xyz^51.0-0.10909090909090909/12.0*xyz^12.0+xy012^4.0/337.625/75.0*xyz^75.0-1.0/54.16666666666667/27.0*xyz^27.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/75.18518518518519*xyz^30.0+1.0/59314.66666666668*xyz^118.0-1.0/132323.3333333333*xyz^107.0-1.0/910.0*xyz^15.0+1.0/767970.0*xyz^161.0-1.0/7809.375*xyz^51.0-0.00909090909090909*xyz^12.0+xy012^4.0/25321.875*xyz^75.0-1.0/1462.5000000000002*xyz^27.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-5686200.0*xyz^24.0+3.999861E7*xyz^112.0-9833616.0*xyz^101.0-3960.0*xyz^9.0+2.0638592E7*xyz^155.0-1660416.0*xyz^45.0-6048.0*xyz^6.0+xy012^4.0*5725440.0*xyz^69.0-145728.0*xyz^21.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-5686200.0*24.0*xyz^23.0+112.0*xyz^111.0-9833616.0*101.0*xyz^100.0-3960.0*9.0*xyz^8.0+155.0*xyz^154.0-1660416.0*45.0*xyz^44.0-6048.0*6.0*xyz^5.0+xy012^4.0*5725440.0*69.0*xyz^68.0-145728.0*21.0*xyz^20.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1.364688E8*xyz^23.0+112.0*xyz^111.0-9.93195216E8*xyz^100.0-35640.0*xyz^8.0+155.0*xyz^154.0-7.471872E7*xyz^44.0-36288.0*xyz^5.0+xy012^4.0*3.9505536E8*xyz^68.0-3060288.0*xyz^20.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/75.18518518518519*xyz^30.0+1.0/59314.66666666668*xyz^118.0-1.0/132323.3333333333*xyz^107.0-1.0/910.0*xyz^15.0+1.0/767970.0*xyz^161.0-1.0/7809.375*xyz^51.0-0.00909090909090909*xyz^12.0+xy012^4.0/25321.875*xyz^75.0-1.0/1462.5000000000002*xyz^27.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/75.18518518518519/31.0*xyz^31.0+1.0/59314.66666666668/119.0*xyz^119.0-1.0/132323.3333333333/108.0*xyz^108.0-1.0/910.0/16.0*xyz^16.0+1.0/767970.0/162.0*xyz^162.0-1.0/7809.375/52.0*xyz^52.0-0.00909090909090909/13.0*xyz^13.0+xy012^4.0/25321.875/76.0*xyz^76.0-1.0/1462.5000000000002/28.0*xyz^28.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/2330.740740740741*xyz^31.0+1.0/7058445.333333335*xyz^119.0-1.0/1.4290919999999998E7*xyz^108.0-1.0/14560.0*xyz^16.0+1.0/1.2441114E8*xyz^162.0-1.0/406087.5*xyz^52.0-6.993006993006993E-4*xyz^13.0+xy012^4.0/1924462.5*xyz^76.0-1.0/40950.00000000001*xyz^28.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131314() {
 UsageCalculus.TestCase = 131314;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "4*xyza^1^7/-1*xyza^2^8*+-3*xyza^3^91*xyza^2^8*+-3*xyza^3^9-3*xyza^3^94*xyza^1^10*-1*xyza^2/--3*xyza^3^2*+4*xyza^1^31*xyza^2/--3*xyza^3^2*+4*xyza^1^3-3*xyza^3^2*+4*xyza^1^34*xyza^1^31*xy012^4/-3*xy012^5*-4*xy012^6/-1*xy012^7-3*xyza^3^5*-4*xyza^1^6/-1*xyza^2^74*xyza^1^6/-1*xyza^2^7";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=313 EqnNumber=14 FamilyID=3 MotifTag=4 Entropy=3 FuncWrapAliasID=4"+
"// MetaRow=[12, 14, 10, 7, 4, 2, 3, 7, 3, 4, 1, 1, 1, 2, 3, 2, 3, 2, 3, 2, 3, 15, 1, 2, 3, 4, 3, 2, 3, 1, 2, 12]"+
"// DOEMatrixRow=[1, 14, 1, 3, 2, 2, 2, 5, 2, 2, 2, 2, 2, 2, 2, 2, 2, 14, 5, 2, 2, 2, 2, 2, 4, 2, 2, 2, 2, 14, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-36.0*xyza^18.0-9.0*xyza^104.0-3.0*xyza^12.0+5.333333333333333*xyza^158.0-16.0*xyza^48.0-12.0*xyza^9.0+xy012^4.0*16.0*xyza^72.0+12.0*xyza^107.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-36.0*18.0*xyza^17.0-9.0*104.0*xyza^103.0-3.0*12.0*xyza^11.0+5.333333333333333*158.0*xyza^157.0-16.0*48.0*xyza^47.0-12.0*9.0*xyza^8.0+xy012^4.0*16.0*72.0*xyza^71.0+12.0*107.0*xyza^106.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-648.0*xyza^17.0-936.0*xyza^103.0-36.0*xyza^11.0+842.6666666666666*xyza^157.0-768.0*xyza^47.0-108.0*xyza^8.0+xy012^4.0*1152.0*xyza^71.0+1284.0*xyza^106.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-36.0*xyza^18.0-9.0*xyza^104.0-3.0*xyza^12.0+5.333333333333333*xyza^158.0-16.0*xyza^48.0-12.0*xyza^9.0+xy012^4.0*16.0*xyza^72.0+12.0*xyza^107.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-36.0/19.0*xyza^19.0-9.0/105.0*xyza^105.0-3.0/13.0*xyza^13.0+5.333333333333333/159.0*xyza^159.0-16.0/49.0*xyza^49.0-12.0/10.0*xyza^10.0+xy012^4.0*16.0/73.0*xyza^73.0+12.0/108.0*xyza^108.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.894736842105263*xyza^19.0-1.0/11.666666666666666*xyza^105.0-1.0/4.333333333333333*xyza^13.0+1.0/29.8125*xyza^159.0-1.0/3.0625*xyza^49.0-1.2*xyza^10.0+xy012^4.0/4.5625*xyza^73.0+1.0/9.0*xyza^108.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-648.0*xyza^17.0-936.0*xyza^103.0-36.0*xyza^11.0+842.6666666666666*xyza^157.0-768.0*xyza^47.0-108.0*xyza^8.0+xy012^4.0*1152.0*xyza^71.0+1284.0*xyza^106.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-648.0*17.0*xyza^16.0-936.0*103.0*xyza^102.0-36.0*11.0*xyza^10.0+842.6666666666666*157.0*xyza^156.0-768.0*47.0*xyza^46.0-108.0*8.0*xyza^7.0+xy012^4.0*1152.0*71.0*xyza^70.0+1284.0*106.0*xyza^105.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-11016.0*xyza^16.0-96408.0*xyza^102.0-396.0*xyza^10.0+132298.66666666666*xyza^156.0-36096.0*xyza^46.0-864.0*xyza^7.0+xy012^4.0*81792.0*xyza^70.0+136104.0*xyza^105.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.894736842105263*xyza^19.0-1.0/11.666666666666666*xyza^105.0-1.0/4.333333333333333*xyza^13.0+1.0/29.8125*xyza^159.0-1.0/3.0625*xyza^49.0-1.2*xyza^10.0+xy012^4.0/4.5625*xyza^73.0+1.0/9.0*xyza^108.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.894736842105263/20.0*xyza^20.0-1.0/11.666666666666666/106.0*xyza^106.0-1.0/4.333333333333333/14.0*xyza^14.0+1.0/29.8125/160.0*xyza^160.0-1.0/3.0625/50.0*xyza^50.0-1.2/11.0*xyza^11.0+xy012^4.0/4.5625/74.0*xyza^74.0+1.0/9.0/109.0*xyza^109.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/10.555555555555555*xyza^20.0-1.0/1236.6666666666665*xyza^106.0-1.0/60.666666666666664*xyza^14.0+1.0/4770.0*xyza^160.0-1.0/153.125*xyza^50.0-0.10909090909090909*xyza^11.0+xy012^4.0/337.625*xyza^74.0+1.0/981.0*xyza^109.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-11016.0*xyza^16.0-96408.0*xyza^102.0-396.0*xyza^10.0+132298.66666666666*xyza^156.0-36096.0*xyza^46.0-864.0*xyza^7.0+xy012^4.0*81792.0*xyza^70.0+136104.0*xyza^105.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-11016.0*16.0*xyza^15.0-96408.0*102.0*xyza^101.0-396.0*10.0*xyza^9.0+132298.66666666666*156.0*xyza^155.0-36096.0*46.0*xyza^45.0-864.0*7.0*xyza^6.0+xy012^4.0*81792.0*70.0*xyza^69.0+136104.0*105.0*xyza^104.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-176256.0*xyza^15.0-9833616.0*xyza^101.0-3960.0*xyza^9.0+2.0638592E7*xyza^155.0-1660416.0*xyza^45.0-6048.0*xyza^6.0+xy012^4.0*5725440.0*xyza^69.0+1.429092E7*xyza^104.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/10.555555555555555*xyza^20.0-1.0/1236.6666666666665*xyza^106.0-1.0/60.666666666666664*xyza^14.0+1.0/4770.0*xyza^160.0-1.0/153.125*xyza^50.0-0.10909090909090909*xyza^11.0+xy012^4.0/337.625*xyza^74.0+1.0/981.0*xyza^109.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/10.555555555555555/21.0*xyza^21.0-1.0/1236.6666666666665/107.0*xyza^107.0-1.0/60.666666666666664/15.0*xyza^15.0+1.0/4770.0/161.0*xyza^161.0-1.0/153.125/51.0*xyza^51.0-0.10909090909090909/12.0*xyza^12.0+xy012^4.0/337.625/75.0*xyza^75.0+1.0/981.0/110.0*xyza^110.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/221.66666666666666*xyza^21.0-1.0/132323.3333333333*xyza^107.0-1.0/910.0*xyza^15.0+1.0/767970.0*xyza^161.0-1.0/7809.375*xyza^51.0-0.00909090909090909*xyza^12.0+xy012^4.0/25321.875*xyza^75.0+1.0/107910.0*xyza^110.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-176256.0*xyza^15.0-9833616.0*xyza^101.0-3960.0*xyza^9.0+2.0638592E7*xyza^155.0-1660416.0*xyza^45.0-6048.0*xyza^6.0+xy012^4.0*5725440.0*xyza^69.0+1.429092E7*xyza^104.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-176256.0*15.0*xyza^14.0-9833616.0*101.0*xyza^100.0-3960.0*9.0*xyza^8.0+155.0*xyza^154.0-1660416.0*45.0*xyza^44.0-6048.0*6.0*xyza^5.0+xy012^4.0*5725440.0*69.0*xyza^68.0+0.0*104.0*xyza^103.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-2643840.0*xyza^14.0-9.93195216E8*xyza^100.0-35640.0*xyza^8.0+155.0*xyza^154.0-7.471872E7*xyza^44.0-36288.0*xyza^5.0+xy012^4.0*3.9505536E8*xyza^68.0+0.0*xyza^103.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/221.66666666666666*xyza^21.0-1.0/132323.3333333333*xyza^107.0-1.0/910.0*xyza^15.0+1.0/767970.0*xyza^161.0-1.0/7809.375*xyza^51.0-0.00909090909090909*xyza^12.0+xy012^4.0/25321.875*xyza^75.0+1.0/107910.0*xyza^110.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/221.66666666666666/22.0*xyza^22.0-1.0/132323.3333333333/108.0*xyza^108.0-1.0/910.0/16.0*xyza^16.0+1.0/767970.0/162.0*xyza^162.0-1.0/7809.375/52.0*xyza^52.0-0.00909090909090909/13.0*xyza^13.0+xy012^4.0/25321.875/76.0*xyza^76.0+1.0/107910.0/111.0*xyza^111.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/4876.666666666666*xyza^22.0-1.0/1.4290919999999998E7*xyza^108.0-1.0/14560.0*xyza^16.0+1.0/1.2441114E8*xyza^162.0-1.0/406087.5*xyza^52.0-6.993006993006993E-4*xyza^13.0+xy012^4.0/1924462.5*xyza^76.0+1.0/1.197801E7*xyza^111.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131315() {
 UsageCalculus.TestCase = 131315;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x^2^8*+-3*x^3^9-3*x^3^94*x^1^10*-1*x^2/--3*x^3^2*+4*x^1^31*x^2/--3*x^3^2*+4*x^1^3-3*x^3^2*+4*x^1^34*x^1^31*xy012^4/-3*xy012^5*-4*xy012^6/-1*xy012^7-3*x^3^5*-4*x^1^6/-1*x^2^74*x^1^6/-1*x^2^71*x0^7";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=314 EqnNumber=15 FamilyID=1 MotifTag=1 Entropy=4 FuncWrapAliasID=1"+
"// MetaRow=[12, 15, 10, 6, 1, 3, 1, 8, 1, 1, 2, 1, 2, 3, 4, 3, 1, 1, 4, 3, 4, 16, 2, 3, 1, 1, 4, 3, 4, 2, 3, 13]"+
"// DOEMatrixRow=[1, 15, 1, 2, 3, 3, 3, 6, 3, 3, 3, 2, 3, 3, 3, 3, 3, 15, 6, 3, 3, 3, 3, 3, 5, 3, 3, 3, 3, 15, 2]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "3.0*x^10.0-3.0*x^12.0+5.333333333333333*x^158.0-16.0*x^48.0-12.0*x^9.0+16.0*x^72.0+12.0*x^171.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "3.0*10.0*x^9.0-3.0*12.0*x^11.0+5.333333333333333*158.0*x^157.0-16.0*48.0*x^47.0-12.0*9.0*x^8.0+16.0*72.0*x^71.0+12.0*171.0*x^170.0";
 UsageCalculus.EqnSolArrayMap2[1] = "30.0*x^9.0-36.0*x^11.0+842.6666666666666*x^157.0-768.0*x^47.0-108.0*x^8.0+1152.0*x^71.0+2052.0*x^170.0";
 UsageCalculus.EqnSolArrayMap3[1] = "3.0*x^10.0-3.0*x^12.0+5.333333333333333*x^158.0-16.0*x^48.0-12.0*x^9.0+16.0*x^72.0+12.0*x^171.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "3.0/11.0*x^11.0-3.0/13.0*x^13.0+5.333333333333333/159.0*x^159.0-16.0/49.0*x^49.0-12.0/10.0*x^10.0+16.0/73.0*x^73.0+12.0/172.0*x^172.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/3.6666666666666665*x^11.0-1.0/4.333333333333333*x^13.0+1.0/29.8125*x^159.0-1.0/3.0625*x^49.0-1.2*x^10.0+1.0/4.5625*x^73.0+1.0/14.333333333333334*x^172.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "30.0*x^9.0-36.0*x^11.0+842.6666666666666*x^157.0-768.0*x^47.0-108.0*x^8.0+1152.0*x^71.0+2052.0*x^170.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "30.0*9.0*x^8.0-36.0*11.0*x^10.0+842.6666666666666*157.0*x^156.0-768.0*47.0*x^46.0-108.0*8.0*x^7.0+1152.0*71.0*x^70.0+2052.0*170.0*x^169.0";
 UsageCalculus.EqnSolArrayMap2[2] = "270.0*x^8.0-396.0*x^10.0+132298.66666666666*x^156.0-36096.0*x^46.0-864.0*x^7.0+81792.0*x^70.0+348840.0*x^169.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/3.6666666666666665*x^11.0-1.0/4.333333333333333*x^13.0+1.0/29.8125*x^159.0-1.0/3.0625*x^49.0-1.2*x^10.0+1.0/4.5625*x^73.0+1.0/14.333333333333334*x^172.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/3.6666666666666665/12.0*x^12.0-1.0/4.333333333333333/14.0*x^14.0+1.0/29.8125/160.0*x^160.0-1.0/3.0625/50.0*x^50.0-1.2/11.0*x^11.0+1.0/4.5625/74.0*x^74.0+1.0/14.333333333333334/173.0*x^173.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/44.0*x^12.0-1.0/60.666666666666664*x^14.0+1.0/4770.0*x^160.0-1.0/153.125*x^50.0-1.0/9.166666666666668*x^11.0+1.0/337.625*x^74.0+1.0/2479.666666666667*x^173.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "270.0*x^8.0-396.0*x^10.0+132298.66666666666*x^156.0-36096.0*x^46.0-864.0*x^7.0+81792.0*x^70.0+348840.0*x^169.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "270.0*8.0*x^7.0-396.0*10.0*x^9.0+132298.66666666666*156.0*x^155.0-36096.0*46.0*x^45.0-864.0*7.0*x^6.0+81792.0*70.0*x^69.0+348840.0*169.0*x^168.0";
 UsageCalculus.EqnSolArrayMap2[3] = "2160.0*x^7.0-3960.0*x^9.0+2.0638592E7*x^155.0-1660416.0*x^45.0-6048.0*x^6.0+5725440.0*x^69.0+5.895396E7*x^168.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/44.0*x^12.0-1.0/60.666666666666664*x^14.0+1.0/4770.0*x^160.0-1.0/153.125*x^50.0-1.0/9.166666666666668*x^11.0+1.0/337.625*x^74.0+1.0/2479.666666666667*x^173.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/44.0/13.0*x^13.0-1.0/60.666666666666664/15.0*x^15.0+1.0/4770.0/161.0*x^161.0-1.0/153.125/51.0*x^51.0-1.0/9.166666666666668/12.0*x^12.0+1.0/337.625/75.0*x^75.0+1.0/2479.666666666667/174.0*x^174.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/572.0*x^13.0-1.0/910.0*x^15.0+1.0/767970.0*x^161.0-1.0/7809.375*x^51.0-1.0/110.00000000000001*x^12.0+1.0/25321.875*x^75.0+1.0/431462.00000000006*x^174.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "2160.0*x^7.0-3960.0*x^9.0+2.0638592E7*x^155.0-1660416.0*x^45.0-6048.0*x^6.0+5725440.0*x^69.0+5.895396E7*x^168.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "2160.0*7.0*x^6.0-3960.0*9.0*x^8.0+155.0*x^154.0-1660416.0*45.0*x^44.0-6048.0*6.0*x^5.0+5725440.0*69.0*x^68.0+0.0*168.0*x^167.0";
 UsageCalculus.EqnSolArrayMap2[4] = "15120.0*x^6.0-35640.0*x^8.0+155.0*x^154.0-7.471872E7*x^44.0-36288.0*x^5.0+3.9505536E8*x^68.0+0.0*x^167.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/572.0*x^13.0-1.0/910.0*x^15.0+1.0/767970.0*x^161.0-1.0/7809.375*x^51.0-1.0/110.00000000000001*x^12.0+1.0/25321.875*x^75.0+1.0/431462.00000000006*x^174.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/572.0/14.0*x^14.0-1.0/910.0/16.0*x^16.0+1.0/767970.0/162.0*x^162.0-1.0/7809.375/52.0*x^52.0-1.0/110.00000000000001/13.0*x^13.0+1.0/25321.875/76.0*x^76.0+1.0/431462.00000000006/175.0*x^175.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/8008.0*x^14.0-1.0/14560.0*x^16.0+1.0/1.2441114E8*x^162.0-1.0/406087.5*x^52.0-1.0/1430.0000000000002*x^13.0+1.0/1924462.5*x^76.0+1.0/7.550585000000001E7*x^175.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131316() {
 UsageCalculus.TestCase = 131316;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xy^3^94*xy^1^10*-1*xy^2/--3*xy^3^2*+4*xy^1^31*xy^2/--3*xy^3^2*+4*xy^1^3-3*xy^3^2*+4*xy^1^34*xy^1^31*xy012^4/-3*xy012^5*-4*xy012^6/-1*xy012^7-3*xy^3^5*-4*xy^1^6/-1*xy^2^74*xy^1^6/-1*xy^2^71*x0^7-3*xy^3^8*4*xy^1^9*-1*xy^2^10/--3*xy^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=315 EqnNumber=16 FamilyID=2 MotifTag=3 Entropy=1 FuncWrapAliasID=3"+
"// MetaRow=[12, 16, 10, 5, 2, 1, 2, 9, 2, 3, 4, 2, 3, 1, 1, 1, 2, 1, 5, 1, 1, 1, 3, 1, 2, 3, 5, 1, 1, 3, 4, 14]"+
"// DOEMatrixRow=[1, 16, 1, 1, 2, 2, 2, 7, 2, 4, 4, 2, 2, 2, 4, 2, 2, 16, 7, 2, 2, 4, 2, 2, 6, 4, 2, 2, 4, 16, 2]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "5.333333333333333*xy^158.0-16.0*xy^48.0-12.0*xy^9.0+16.0*xy^72.0+x0^7.0*12.0*xy^171.0+4.0*xy^36.0-3.0*xy^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "5.333333333333333*158.0*xy^157.0-16.0*48.0*xy^47.0-12.0*9.0*xy^8.0+16.0*72.0*xy^71.0+x0^7.0*12.0*171.0*xy^170.0+4.0*36.0*xy^35.0-3.0*3.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap2[1] = "842.6666666666666*xy^157.0-768.0*xy^47.0-108.0*xy^8.0+1152.0*xy^71.0+x0^7.0*2052.0*xy^170.0+144.0*xy^35.0-9.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap3[1] = "5.333333333333333*xy^158.0-16.0*xy^48.0-12.0*xy^9.0+16.0*xy^72.0+x0^7.0*12.0*xy^171.0+4.0*xy^36.0-3.0*xy^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "5.333333333333333/159.0*xy^159.0-16.0/49.0*xy^49.0-12.0/10.0*xy^10.0+16.0/73.0*xy^73.0+x0^7.0*12.0/172.0*xy^172.0+4.0/37.0*xy^37.0-3.0/4.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/29.8125*xy^159.0-1.0/3.0625*xy^49.0-1.2*xy^10.0+0.2191780821917808*xy^73.0+x0^7.0/14.333333333333334*xy^172.0+1.0/9.25*xy^37.0-1.0/1.3333333333333333*xy^4.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "842.6666666666666*xy^157.0-768.0*xy^47.0-108.0*xy^8.0+1152.0*xy^71.0+x0^7.0*2052.0*xy^170.0+144.0*xy^35.0-9.0*xy^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "842.6666666666666*157.0*xy^156.0-768.0*47.0*xy^46.0-108.0*8.0*xy^7.0+1152.0*71.0*xy^70.0+x0^7.0*2052.0*170.0*xy^169.0+144.0*35.0*xy^34.0-9.0*2.0*xy^1.0";
 UsageCalculus.EqnSolArrayMap2[2] = "132298.66666666666*xy^156.0-36096.0*xy^46.0-864.0*xy^7.0+81792.0*xy^70.0+x0^7.0*348840.0*xy^169.0+5040.0*xy^34.0-18.0*xy";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/29.8125*xy^159.0-1.0/3.0625*xy^49.0-1.2*xy^10.0+0.2191780821917808*xy^73.0+x0^7.0/14.333333333333334*xy^172.0+1.0/9.25*xy^37.0-1.0/1.3333333333333333*xy^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/29.8125/160.0*xy^160.0-1.0/3.0625/50.0*xy^50.0-1.2/11.0*xy^11.0+0.2191780821917808/74.0*xy^74.0+x0^7.0/14.333333333333334/173.0*xy^173.0+1.0/9.25/38.0*xy^38.0-1.0/1.3333333333333333/5.0*xy^5.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/4770.0*xy^160.0-1.0/153.125*xy^50.0-1.0/9.166666666666668*xy^11.0+0.0029618659755646054*xy^74.0+x0^7.0/2479.666666666667*xy^173.0+1.0/351.5*xy^38.0-1.0/6.666666666666666*xy^5.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "132298.66666666666*xy^156.0-36096.0*xy^46.0-864.0*xy^7.0+81792.0*xy^70.0+x0^7.0*348840.0*xy^169.0+5040.0*xy^34.0-18.0*xy";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "132298.66666666666*156.0*xy^155.0-36096.0*46.0*xy^45.0-864.0*7.0*xy^6.0+81792.0*70.0*xy^69.0+x0^7.0*348840.0*169.0*xy^168.0+5040.0*34.0*xy^33.0-18.0";
 UsageCalculus.EqnSolArrayMap2[3] = "2.0638592E7*xy^155.0-1660416.0*xy^45.0-6048.0*xy^6.0+5725440.0*xy^69.0+x0^7.0*5.895396E7*xy^168.0+171360.0*xy^33.0-18.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/4770.0*xy^160.0-1.0/153.125*xy^50.0-1.0/9.166666666666668*xy^11.0+0.0029618659755646054*xy^74.0+x0^7.0/2479.666666666667*xy^173.0+1.0/351.5*xy^38.0-1.0/6.666666666666666*xy^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/4770.0/161.0*xy^161.0-1.0/153.125/51.0*xy^51.0-1.0/9.166666666666668/12.0*xy^12.0+0.0029618659755646054/75.0*xy^75.0+x0^7.0/2479.666666666667/174.0*xy^174.0+1.0/351.5/39.0*xy^39.0-1.0/6.666666666666666/6.0*xy^6.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/767970.0*xy^161.0-1.0/7809.375*xy^51.0-1.0/110.00000000000001*xy^12.0+3.9491546340861405E-5*xy^75.0+x0^7.0/431462.00000000006*xy^174.0+1.0/13708.5*xy^39.0-1.0/40.0*xy^6.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "2.0638592E7*xy^155.0-1660416.0*xy^45.0-6048.0*xy^6.0+5725440.0*xy^69.0+x0^7.0*5.895396E7*xy^168.0+171360.0*xy^33.0-18.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "155.0*xy^154.0-1660416.0*45.0*xy^44.0-6048.0*6.0*xy^5.0+5725440.0*69.0*xy^68.0+x0^7.0*5.895396E7*168.0*xy^167.0+171360.0*33.0*xy^32.0-18.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "155.0*xy^154.0-7.471872E7*xy^44.0-36288.0*xy^5.0+3.9505536E8*xy^68.0+x0^7.0*9.90426528E9*xy^167.0+5654880.0*xy^32.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/767970.0*xy^161.0-1.0/7809.375*xy^51.0-1.0/110.00000000000001*xy^12.0+3.9491546340861405E-5*xy^75.0-5.0*xy^75.0+x0^7.0/431462.00000000006*xy^174.0+1.0/13708.5*xy^39.0-1.0/40.0*xy^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/767970.0/162.0*xy^162.0-1.0/7809.375/52.0*xy^52.0-1.0/110.00000000000001/13.0*xy^13.0+3.9491546340861405E-5/76.0*xy^76.0-5.0/76.0*xy^76.0+x0^7.0/431462.00000000006/175.0*xy^175.0+1.0/13708.5/40.0*xy^40.0-1.0/40.0/7.0*xy^7.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/1.2441114E8*xy^162.0-1.0/406087.5*xy^52.0-1.0/1430.0000000000002*xy^13.0+1.0/1924462.5000000002*xy^76.0-1.0/15.2*xy^76.0-0.06578947368421052*xy^76.0+x0^7.0/7.550585000000001E7*xy^175.0+1.0/548340.0*xy^40.0-1.0/280.0*xy^7.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131317() {
 UsageCalculus.TestCase = 131317;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "4*xyz^1^10*-1*xyz^2/--3*xyz^3^2*+4*xyz^1^31*xyz^2/--3*xyz^3^2*+4*xyz^1^3-3*xyz^3^2*+4*xyz^1^34*xyz^1^31*xy012^4/-3*xy012^5*-4*xy012^6/-1*xy012^7-3*xyz^3^5*-4*xyz^1^6/-1*xyz^2^74*xyz^1^6/-1*xyz^2^71*x0^7-3*xyz^3^8*4*xyz^1^9*-1*xyz^2^10/--3*xyz^34*xyz^1^9*-1*xyz^2^10/--3*xyz^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=316 EqnNumber=17 FamilyID=3 MotifTag=4 Entropy=3 FuncWrapAliasID=4"+
"// MetaRow=[12, 17, 10, 4, 3, 2, 3, 10, 3, 4, 1, 1, 1, 2, 3, 2, 3, 2, 1, 2, 3, 2, 1, 2, 3, 4, 6, 2, 3, 4, 1, 15]"+
"// DOEMatrixRow=[1, 17, 1, 4, 3, 3, 3, 8, 3, 2, 2, 2, 3, 3, 2, 3, 3, 17, 8, 3, 3, 5, 3, 3, 2, 2, 3, 3, 2, 2, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-7.111111111111111*xyz^61.0-16.0*xyz^48.0-12.0*xyz^9.0+xy012^4.0*16.0*xyz^72.0+x0^7.0*12.0*xyz^171.0+1.3333333333333333*xyz^92.0+xyz^59.0-3.0*xyz^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-7.111111111111111*61.0*xyz^60.0-16.0*48.0*xyz^47.0-12.0*9.0*xyz^8.0+xy012^4.0*16.0*72.0*xyz^71.0+x0^7.0*12.0*171.0*xyz^170.0+1.3333333333333333*92.0*xyz^91.0+59.0*xyz^58.0-3.0*3.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-433.77777777777777*xyz^60.0-768.0*xyz^47.0-108.0*xyz^8.0+xy012^4.0*1152.0*xyz^71.0+x0^7.0*2052.0*xyz^170.0+122.66666666666666*xyz^91.0+59.0*xyz^58.0-9.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-7.111111111111111*xyz^61.0-16.0*xyz^48.0-12.0*xyz^9.0+xy012^4.0*16.0*xyz^72.0+x0^7.0*12.0*xyz^171.0+1.3333333333333333*xyz^92.0+xyz^59.0-3.0*xyz^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-7.111111111111111/62.0*xyz^62.0-16.0/49.0*xyz^49.0-12.0/10.0*xyz^10.0+xy012^4.0*16.0/73.0*xyz^73.0+x0^7.0*12.0/172.0*xyz^172.0+1.3333333333333333/93.0*xyz^93.0+1.0/60.0*xyz^60.0-3.0/4.0*xyz^4.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/8.71875*xyz^62.0-1.0/3.0625*xyz^49.0-1.2*xyz^10.0+xy012^4.0*0.2191780821917808*xyz^73.0+x0^7.0/14.333333333333334*xyz^172.0+1.0/69.75*xyz^93.0+1.0/60.0*xyz^60.0-1.0/1.3333333333333333*xyz^4.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-433.77777777777777*xyz^60.0-768.0*xyz^47.0-108.0*xyz^8.0+xy012^4.0*1152.0*xyz^71.0+x0^7.0*2052.0*xyz^170.0+122.66666666666666*xyz^91.0+59.0*xyz^58.0-9.0*xyz^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-433.77777777777777*60.0*xyz^59.0-768.0*47.0*xyz^46.0-108.0*8.0*xyz^7.0+xy012^4.0*1152.0*71.0*xyz^70.0+x0^7.0*2052.0*170.0*xyz^169.0+122.66666666666666*91.0*xyz^90.0+59.0*58.0*xyz^57.0-9.0*2.0*xyz^1.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-26026.666666666668*xyz^59.0-36096.0*xyz^46.0-864.0*xyz^7.0+xy012^4.0*81792.0*xyz^70.0+x0^7.0*348840.0*xyz^169.0+11162.666666666666*xyz^90.0+3422.0*xyz^57.0-18.0*xyz";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/8.71875*xyz^62.0-1.0/3.0625*xyz^49.0-1.2*xyz^10.0+xy012^4.0*0.2191780821917808*xyz^73.0+x0^7.0/14.333333333333334*xyz^172.0+1.0/69.75*xyz^93.0+1.0/60.0*xyz^60.0-1.0/1.3333333333333333*xyz^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/8.71875/63.0*xyz^63.0-1.0/3.0625/50.0*xyz^50.0-1.2/11.0*xyz^11.0+xy012^4.0*0.2191780821917808/74.0*xyz^74.0+x0^7.0/14.333333333333334/173.0*xyz^173.0+1.0/69.75/94.0*xyz^94.0+1.0/60.0/61.0*xyz^61.0-1.0/1.3333333333333333/5.0*xyz^5.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/549.28125*xyz^63.0-1.0/153.125*xyz^50.0-0.10909090909090909*xyz^11.0+xy012^4.0*0.0029618659755646054*xyz^74.0+x0^7.0/2479.666666666667*xyz^173.0+1.0/6556.5*xyz^94.0+1.0/3660.0*xyz^61.0-1.0/6.666666666666666*xyz^5.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-26026.666666666668*xyz^59.0-36096.0*xyz^46.0-864.0*xyz^7.0+xy012^4.0*81792.0*xyz^70.0+x0^7.0*348840.0*xyz^169.0+11162.666666666666*xyz^90.0+3422.0*xyz^57.0-18.0*xyz";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-26026.666666666668*59.0*xyz^58.0-36096.0*46.0*xyz^45.0-864.0*7.0*xyz^6.0+xy012^4.0*81792.0*70.0*xyz^69.0+x0^7.0*348840.0*169.0*xyz^168.0+11162.666666666666*90.0*xyz^89.0+3422.0*57.0*xyz^56.0-18.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-1535573.3333333335*xyz^58.0-1660416.0*xyz^45.0-6048.0*xyz^6.0+xy012^4.0*5725440.0*xyz^69.0+x0^7.0*5.895396E7*xyz^168.0+1004640.0*xyz^89.0+195054.0*xyz^56.0-18.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/549.28125*xyz^63.0-1.0/153.125*xyz^50.0-0.10909090909090909*xyz^11.0+xy012^4.0*0.0029618659755646054*xyz^74.0+x0^7.0/2479.666666666667*xyz^173.0+1.0/6556.5*xyz^94.0+1.0/3660.0*xyz^61.0-1.0/6.666666666666666*xyz^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/549.28125/64.0*xyz^64.0-1.0/153.125/51.0*xyz^51.0-0.10909090909090909/12.0*xyz^12.0+xy012^4.0*0.0029618659755646054/75.0*xyz^75.0+x0^7.0/2479.666666666667/174.0*xyz^174.0+1.0/6556.5/95.0*xyz^95.0+1.0/3660.0/62.0*xyz^62.0-1.0/6.666666666666666/6.0*xyz^6.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/35154.0*xyz^64.0-1.0/7809.375*xyz^51.0-0.00909090909090909*xyz^12.0+xy012^4.0*3.9491546340861405E-5*xyz^75.0+x0^7.0/431462.00000000006*xyz^174.0+1.0/622867.5*xyz^95.0+1.0/226920.0*xyz^62.0-1.0/40.0*xyz^6.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-1535573.3333333335*xyz^58.0-1660416.0*xyz^45.0-6048.0*xyz^6.0+xy012^4.0*5725440.0*xyz^69.0+x0^7.0*5.895396E7*xyz^168.0+1004640.0*xyz^89.0+195054.0*xyz^56.0-18.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-1535573.3333333335*58.0*xyz^57.0-1660416.0*45.0*xyz^44.0-6048.0*6.0*xyz^5.0+xy012^4.0*5725440.0*69.0*xyz^68.0+x0^7.0*5.895396E7*168.0*xyz^167.0+1004640.0*89.0*xyz^88.0+195054.0*56.0*xyz^55.0-18.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-8.906325333333334E7*xyz^57.0-7.471872E7*xyz^44.0-36288.0*xyz^5.0+xy012^4.0*3.9505536E8*xyz^68.0+x0^7.0*9.90426528E9*xyz^167.0+8.941296E7*xyz^88.0+1.0923024E7*xyz^55.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/35154.0*xyz^64.0-1.0/7809.375*xyz^51.0-0.00909090909090909*xyz^12.0+xy012^4.0*3.9491546340861405E-5*xyz^75.0-5.0*xyz^75.0+x0^7.0/431462.00000000006*xyz^174.0+1.0/622867.5*xyz^95.0+1.0/226920.0*xyz^62.0-1.0/40.0*xyz^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/35154.0/65.0*xyz^65.0-1.0/7809.375/52.0*xyz^52.0-0.00909090909090909/13.0*xyz^13.0+xy012^4.0*3.9491546340861405E-5/76.0*xyz^76.0-5.0/76.0*xyz^76.0+x0^7.0/431462.00000000006/175.0*xyz^175.0+1.0/622867.5/96.0*xyz^96.0+1.0/226920.0/63.0*xyz^63.0-1.0/40.0/7.0*xyz^7.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/2285010.0*xyz^65.0-1.0/406087.5*xyz^52.0-6.993006993006993E-4*xyz^13.0+xy012^4.0/1924462.5000000002*xyz^76.0-1.0/15.2*xyz^76.0-0.06578947368421052*xyz^76.0+x0^7.0/7.550585000000001E7*xyz^175.0+1.0/5.979528E7*xyz^96.0+1.0/1.429596E7*xyz^63.0-1.0/280.0*xyz^7.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131318() {
 UsageCalculus.TestCase = 131318;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xyza^2/--3*xyza^3^2*+4*xyza^1^3-3*xyza^3^2*+4*xyza^1^34*xyza^1^31*xy012^4/-3*xy012^5*-4*xy012^6/-1*xy012^7-3*xyza^3^5*-4*xyza^1^6/-1*xyza^2^74*xyza^1^6/-1*xyza^2^71*x0^7-3*xyza^3^8*4*xyza^1^9*-1*xyza^2^10/--3*xyza^34*xyza^1^9*-1*xyza^2^10/--3*xyza^31*x0^10/--3*x0";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=317 EqnNumber=18 FamilyID=1 MotifTag=1 Entropy=4 FuncWrapAliasID=1"+
"// MetaRow=[12, 18, 10, 3, 4, 3, 1, 1, 1, 1, 2, 1, 2, 3, 4, 3, 1, 1, 2, 3, 4, 3, 2, 3, 1, 1, 7, 3, 4, 5, 2, 16]"+
"// DOEMatrixRow=[1, 18, 1, 3, 2, 2, 2, 9, 2, 3, 3, 2, 2, 2, 3, 2, 2, 18, 9, 2, 2, 2, 2, 2, 3, 3, 2, 2, 3, 3, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "1.3333333333333333*xyza^11.0-12.0*xyza^9.0+xy012^4.0*16.0*xyza^72.0+x0^7.0*12.0*xyza^171.0+x0^10.0*x0/2.25*xyza^120.0+x0^10.0*x0/3.0*xyza^87.0-x0^10.0*x0*xyza^31.0-x0*3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "1.3333333333333333*11.0*xyza^10.0-12.0*9.0*xyza^8.0+xy012^4.0*16.0*72.0*xyza^71.0+x0^7.0*12.0*171.0*xyza^170.0+x0^10.0*x0/2.25*120.0*xyza^119.0+x0^10.0*x0/3.0*87.0*xyza^86.0-x0^10.0*x0*31.0*xyza^30.0-x0*3.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "14.666666666666666*xyza^10.0-108.0*xyza^8.0+xy012^4.0*1152.0*xyza^71.0+x0^7.0*2052.0*xyza^170.0+x0^10.0*x0*53.333333333333336*xyza^119.0+x0^10.0*x0*29.0*xyza^86.0-x0^10.0*x0*31.0*xyza^30.0-x0*0.0";
 UsageCalculus.EqnSolArrayMap3[1] = "1.3333333333333333*xyza^11.0-12.0*xyza^9.0+xy012^4.0*16.0*xyza^72.0+x0^7.0*12.0*xyza^171.0+x0^10.0*x0/2.25*xyza^120.0+x0^10.0*x0/3.0*xyza^87.0-x0^10.0*x0*xyza^31.0-x0*3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.3333333333333333/12.0*xyza^12.0-12.0/10.0*xyza^10.0+xy012^4.0*16.0/73.0*xyza^73.0+x0^7.0*12.0/172.0*xyza^172.0+x0^10.0*x0/2.25/121.0*xyza^121.0+x0^10.0*x0/3.0/88.0*xyza^88.0-x0^10.0*x0/32.0*xyza^32.0-x0*3.0*xyza";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/9.0*xyza^12.0-1.2*xyza^10.0+xy012^4.0*0.2191780821917808*xyza^73.0+x0^7.0*0.06976744186046512*xyza^172.0+x0^10.0*x0*0.0036730945821854912*xyza^121.0+x0^10.0*x0*0.003787878787878788*xyza^88.0-x0^10.0*x0/32.0*xyza^32.0-x0*3.0*xyza";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "14.666666666666666*xyza^10.0-108.0*xyza^8.0+xy012^4.0*1152.0*xyza^71.0+x0^7.0*2052.0*xyza^170.0+x0^10.0*x0*53.333333333333336*xyza^119.0+x0^10.0*x0*29.0*xyza^86.0-x0^10.0*x0*31.0*xyza^30.0-x0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "14.666666666666666*10.0*xyza^9.0-108.0*8.0*xyza^7.0+xy012^4.0*1152.0*71.0*xyza^70.0+x0^7.0*2052.0*170.0*xyza^169.0+x0^10.0*x0*53.333333333333336*119.0*xyza^118.0+x0^10.0*x0*29.0*86.0*xyza^85.0-x0^10.0*x0*31.0*30.0*xyza^29.0-x0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[2] = "146.66666666666666*xyza^9.0-864.0*xyza^7.0+xy012^4.0*81792.0*xyza^70.0+x0^7.0*348840.0*xyza^169.0+x0^10.0*x0*6346.666666666667*xyza^118.0+x0^10.0*x0*2494.0*xyza^85.0-x0^10.0*x0*930.0*xyza^29.0-x0*0.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/9.0*xyza^12.0-1.2*xyza^10.0+xy012^4.0*0.2191780821917808*xyza^73.0+x0^7.0*0.06976744186046512*xyza^172.0+x0^10.0*x0*0.0036730945821854912*xyza^121.0+x0^10.0*x0*0.003787878787878788*xyza^88.0-x0^10.0*x0/32.0*xyza^32.0-x0*3.0*xyza";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/9.0/13.0*xyza^13.0-1.2/11.0*xyza^11.0+xy012^4.0*0.2191780821917808/74.0*xyza^74.0+x0^7.0*0.06976744186046512/173.0*xyza^173.0+x0^10.0*x0*0.0036730945821854912/122.0*xyza^122.0+x0^10.0*x0*0.003787878787878788/89.0*xyza^89.0-x0^10.0*x0/32.0/33.0*xyza^33.0-x0*3.0/2.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/117.0*xyza^13.0-0.10909090909090909*xyza^11.0+xy012^4.0*0.0029618659755646054*xyza^74.0+x0^7.0*4.032800107541336E-4*xyza^173.0+x0^10.0*x0*3.0107332640864684E-5*xyza^122.0+x0^10.0*x0*4.256043581886279E-5*xyza^89.0-x0^10.0*x0*9.46969696969697E-4*xyza^33.0-x0*1.5*xyza^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "146.66666666666666*xyza^9.0-864.0*xyza^7.0+xy012^4.0*81792.0*xyza^70.0+x0^7.0*348840.0*xyza^169.0+x0^10.0*x0*6346.666666666667*xyza^118.0+x0^10.0*x0*2494.0*xyza^85.0-x0^10.0*x0*930.0*xyza^29.0-x0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "146.66666666666666*9.0*xyza^8.0-864.0*7.0*xyza^6.0+xy012^4.0*81792.0*70.0*xyza^69.0+x0^7.0*348840.0*169.0*xyza^168.0+x0^10.0*x0*6346.666666666667*118.0*xyza^117.0+x0^10.0*x0*2494.0*85.0*xyza^84.0-x0^10.0*x0*930.0*29.0*xyza^28.0-x0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[3] = "1320.0*xyza^8.0-6048.0*xyza^6.0+xy012^4.0*5725440.0*xyza^69.0+x0^7.0*5.895396E7*xyza^168.0+x0^10.0*x0*748906.6666666667*xyza^117.0+x0^10.0*x0*211990.0*xyza^84.0-x0^10.0*x0*26970.0*xyza^28.0-x0*0.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/117.0*xyza^13.0-0.10909090909090909*xyza^11.0+xy012^4.0*0.0029618659755646054*xyza^74.0+x0^7.0*4.032800107541336E-4*xyza^173.0-4.0*xyza^173.0+x0^10.0*x0*3.0107332640864684E-5*xyza^122.0-5.0*xyza^122.0+x0^10.0*x0*4.256043581886279E-5*xyza^89.0-5.0*xyza^89.0-x0^10.0*x0*9.46969696969697E-4*xyza^33.0-4.0*xyza^33.0-x0*1.5*xyza^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/117.0/14.0*xyza^14.0-0.10909090909090909/12.0*xyza^12.0+xy012^4.0*0.0029618659755646054/75.0*xyza^75.0+x0^7.0*4.032800107541336E-4/174.0*xyza^174.0-4.0/174.0*xyza^174.0+x0^10.0*x0*3.0107332640864684E-5/123.0*xyza^123.0-5.0/123.0*xyza^123.0+x0^10.0*x0*4.256043581886279E-5/90.0*xyza^90.0-5.0/90.0*xyza^90.0-x0^10.0*x0*9.46969696969697E-4/34.0*xyza^34.0-4.0/34.0*xyza^34.0-x0*1.5/3.0*xyza^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/1638.0*xyza^14.0-0.00909090909090909*xyza^12.0+xy012^4.0*3.9491546340861405E-5*xyza^75.0+x0^7.0/431462.00000000006*xyza^174.0-1.0/43.5*xyza^174.0-0.022988505747126436*xyza^174.0+x0^10.0*x0/4085383.5*xyza^123.0-1.0/24.6*xyza^123.0-0.04065040650406504*xyza^123.0+x0^10.0*x0/2114640.0*xyza^90.0-1.0/18.0*xyza^90.0-0.05555555555555555*xyza^90.0-x0^10.0*x0/35904.0*xyza^34.0-1.0/8.5*xyza^34.0-0.11764705882352941*xyza^34.0-x0/2.0*xyza^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "1320.0*xyza^8.0-6048.0*xyza^6.0+xy012^4.0*5725440.0*xyza^69.0+x0^7.0*5.895396E7*xyza^168.0+x0^10.0*x0*748906.6666666667*xyza^117.0+x0^10.0*x0*211990.0*xyza^84.0-x0^10.0*x0*26970.0*xyza^28.0-x0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "1320.0*8.0*xyza^7.0-6048.0*6.0*xyza^5.0+xy012^4.0*5725440.0*69.0*xyza^68.0+x0^7.0*5.895396E7*168.0*xyza^167.0+x0^10.0*x0*748906.6666666667*117.0*xyza^116.0+x0^10.0*x0*211990.0*84.0*xyza^83.0-x0^10.0*x0*26970.0*28.0*xyza^27.0-x0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "10560.0*xyza^7.0-36288.0*xyza^5.0+xy012^4.0*3.9505536E8*xyza^68.0+x0^7.0*9.90426528E9*xyza^167.0+x0^10.0*x0*8.762208000000001E7*xyza^116.0+x0^10.0*x0*1.780716E7*xyza^83.0-x0^10.0*x0*755160.0*xyza^27.0-x0*0.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/1638.0*xyza^14.0-0.00909090909090909*xyza^12.0+xy012^4.0*3.9491546340861405E-5*xyza^75.0-5.0*xyza^75.0+x0^7.0/431462.00000000006*xyza^174.0-1.0/43.5*xyza^174.0-0.022988505747126436*xyza^174.0+x0^10.0*x0/4085383.5*xyza^123.0-1.0/24.6*xyza^123.0-0.04065040650406504*xyza^123.0+x0^10.0*x0/2114640.0*xyza^90.0-1.0/18.0*xyza^90.0-0.05555555555555555*xyza^90.0-x0^10.0*x0/35904.0*xyza^34.0-1.0/8.5*xyza^34.0-0.11764705882352941*xyza^34.0-x0/2.0*xyza^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/1638.0/15.0*xyza^15.0-0.00909090909090909/13.0*xyza^13.0+xy012^4.0*3.9491546340861405E-5/76.0*xyza^76.0-5.0/76.0*xyza^76.0+x0^7.0/431462.00000000006/175.0*xyza^175.0-1.0/43.5/175.0*xyza^175.0-0.022988505747126436/175.0*xyza^175.0+x0^10.0*x0/4085383.5/124.0*xyza^124.0-1.0/24.6/124.0*xyza^124.0-0.04065040650406504/124.0*xyza^124.0+x0^10.0*x0/2114640.0/91.0*xyza^91.0-1.0/18.0/91.0*xyza^91.0-0.05555555555555555/91.0*xyza^91.0-x0^10.0*x0/35904.0/35.0*xyza^35.0-1.0/8.5/35.0*xyza^35.0-0.11764705882352941/35.0*xyza^35.0-x0*2.0/4.0*xyza^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/24570.0*xyza^15.0-6.993006993006993E-4*xyza^13.0+xy012^4.0/1924462.5000000002*xyza^76.0-1.0/15.2*xyza^76.0-0.06578947368421052*xyza^76.0+x0^7.0/7.550585000000001E7*xyza^175.0-1.0/7612.5*xyza^175.0-1.3136288998357964E-4*xyza^175.0+x0^10.0*x0/5.06587554E8*xyza^124.0-1.0/3050.4*xyza^124.0-3.2782585890375033E-4*xyza^124.0+x0^10.0*x0/1.9243224E8*xyza^91.0-1.0/1638.0*xyza^91.0-6.105006105006105E-4*xyza^91.0-x0^10.0*x0/1256640.0*xyza^35.0-1.0/297.5*xyza^35.0-0.003361344537815126*xyza^35.0-x0/2.0*xyza^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131319() {
 UsageCalculus.TestCase = 131319;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*x^3^2*+4*x^1^34*x^1^31*xy012^4/-3*xy012^5*-4*xy012^6/-1*xy012^7-3*x^3^5*-4*x^1^6/-1*x^2^74*x^1^6/-1*x^2^71*x0^7-3*x^3^8*4*x^1^9*-1*x^2^10/--3*x^34*x^1^9*-1*x^2^10/--3*x^31*x0^10/--3*x0-3*x^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=318 EqnNumber=19 FamilyID=2 MotifTag=3 Entropy=1 FuncWrapAliasID=3"+
"// MetaRow=[12, 19, 10, 2, 1, 1, 2, 3, 2, 3, 4, 2, 3, 1, 1, 1, 2, 1, 3, 1, 1, 4, 3, 1, 2, 3, 8, 1, 1, 6, 3, 17]"+
"// DOEMatrixRow=[1, 19, 1, 2, 3, 3, 3, 10, 3, 4, 4, 2, 3, 3, 4, 3, 3, 19, 10, 3, 3, 3, 3, 3, 4, 4, 3, 3, 4, 4, 2]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "16.0*x^72.0+12.0*x^171.0+1.0/2.25*x^120.0+1.0/3.0*x^87.0-x^31.0-3.0-3.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "16.0*72.0*x^71.0+12.0*171.0*x^170.0+1.0/2.25*120.0*x^119.0+1.0/3.0*87.0*x^86.0-31.0*x^30.0-3.0*0.0-3.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[1] = "1152.0*x^71.0+2052.0*x^170.0+53.333333333333336*x^119.0+29.0*x^86.0-31.0*x^30.0-9.0*x^2.0";
 UsageCalculus.EqnSolArrayMap3[1] = "16.0*x^72.0+12.0*x^171.0+1.0/2.25*x^120.0+1.0/3.0*x^87.0-x^31.0-3.0-3.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "16.0/73.0*x^73.0+12.0/172.0*x^172.0+1.0/2.25/121.0*x^121.0+1.0/3.0/88.0*x^88.0-1.0/32.0*x^32.0-3.0*x-3.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/4.5625*x^73.0+1.0/14.333333333333334*x^172.0+1.0/272.25*x^121.0+1.0/264.0*x^88.0-1.0/32.0*x^32.0-3.0*x-1.0/1.3333333333333333*x^4.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "1152.0*x^71.0+2052.0*x^170.0+53.333333333333336*x^119.0+29.0*x^86.0-31.0*x^30.0-9.0*x^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "1152.0*71.0*x^70.0+2052.0*170.0*x^169.0+53.333333333333336*119.0*x^118.0+29.0*86.0*x^85.0-31.0*30.0*x^29.0-9.0*2.0*x^1.0";
 UsageCalculus.EqnSolArrayMap2[2] = "81792.0*x^70.0+348840.0*x^169.0+6346.666666666667*x^118.0+2494.0*x^85.0-930.0*x^29.0-18.0*x";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/4.5625*x^73.0+1.0/14.333333333333334*x^172.0+1.0/272.25*x^121.0+1.0/264.0*x^88.0-1.0/32.0*x^32.0-3.0*x-1.0/1.3333333333333333*x^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/4.5625/74.0*x^74.0+1.0/14.333333333333334/173.0*x^173.0+1.0/272.25/122.0*x^122.0+1.0/264.0/89.0*x^89.0-1.0/32.0/33.0*x^33.0-3.0/2.0*x^2.0-1.0/1.3333333333333333/5.0*x^5.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/337.625*x^74.0+1.0/2479.666666666667*x^173.0+1.0/33214.5*x^122.0+1.0/23496.0*x^89.0-1.0/1056.0*x^33.0-1.5*x^2.0-1.0/6.666666666666666*x^5.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "81792.0*x^70.0+348840.0*x^169.0+6346.666666666667*x^118.0+2494.0*x^85.0-930.0*x^29.0-18.0*x";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "81792.0*70.0*x^69.0+348840.0*169.0*x^168.0+6346.666666666667*118.0*x^117.0+2494.0*85.0*x^84.0-930.0*29.0*x^28.0-18.0";
 UsageCalculus.EqnSolArrayMap2[3] = "5725440.0*x^69.0+5.895396E7*x^168.0+748906.6666666667*x^117.0+211990.0*x^84.0-26970.0*x^28.0-18.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/337.625*x^74.0+1.0/2479.666666666667*x^173.0+1.0/33214.5*x^122.0+1.0/23496.0*x^89.0-1.0/1056.0*x^33.0-1.5*x^2.0-1.0/6.666666666666666*x^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/337.625/75.0*x^75.0+1.0/2479.666666666667/174.0*x^174.0+1.0/33214.5/123.0*x^123.0+1.0/23496.0/90.0*x^90.0-1.0/1056.0/34.0*x^34.0-1.5/3.0*x^3.0-1.0/6.666666666666666/6.0*x^6.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/25321.875*x^75.0+1.0/431462.00000000006*x^174.0+1.0/4085383.5*x^123.0+1.0/2114640.0*x^90.0-1.0/35904.0*x^34.0-1.0/2.0*x^3.0-1.0/40.0*x^6.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "5725440.0*x^69.0+5.895396E7*x^168.0+748906.6666666667*x^117.0+211990.0*x^84.0-26970.0*x^28.0-18.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "5725440.0*69.0*x^68.0+168.0*x^167.0+748906.6666666667*117.0*x^116.0+211990.0*84.0*x^83.0-26970.0*28.0*x^27.0-18.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "3.9505536E8*x^68.0+168.0*x^167.0+8.762208000000001E7*x^116.0+1.780716E7*x^83.0-755160.0*x^27.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/25321.875*x^75.0+1.0/431462.00000000006*x^174.0+1.0/4085383.5*x^123.0+1.0/2114640.0*x^90.0-1.0/35904.0*x^34.0-1.0/2.0*x^3.0-1.0/40.0*x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/25321.875/76.0*x^76.0+1.0/431462.00000000006/175.0*x^175.0+1.0/4085383.5/124.0*x^124.0+1.0/2114640.0/91.0*x^91.0-1.0/35904.0/35.0*x^35.0-1.0/2.0/4.0*x^4.0-1.0/40.0/7.0*x^7.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/1924462.5*x^76.0+1.0/7.550585000000001E7*x^175.0+1.0/5.06587554E8*x^124.0+1.0/1.9243224E8*x^91.0-1.0/1256640.0*x^35.0-1.0/8.0*x^4.0-1.0/280.0*x^7.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131320() {
 UsageCalculus.TestCase = 131320;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "4*xy^1^31*xy012^4/-3*xy012^5*-4*xy012^6/-1*xy012^7-3*xy^3^5*-4*xy^1^6/-1*xy^2^74*xy^1^6/-1*xy^2^71*x0^7-3*xy^3^8*4*xy^1^9*-1*xy^2^10/--3*xy^34*xy^1^9*-1*xy^2^10/--3*xy^31*x0^10/--3*x0-3*xy^34*xy^1^2*1*xy^2^3/-3*xy^3^4*-4*xy^1^5";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=319 EqnNumber=20 FamilyID=3 MotifTag=4 Entropy=3 FuncWrapAliasID=4"+
"// MetaRow=[12, 20, 10, 1, 2, 3, 1, 4, 3, 4, 1, 1, 1, 2, 3, 2, 3, 2, 4, 2, 3, 5, 1, 2, 3, 4, 9, 2, 3, 7, 4, 18]"+
"// DOEMatrixRow=[1, 20, 20, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 20, 2, 2, 2, 4, 2, 2, 5, 2, 2, 2, 2, 5, 2]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-5.333333333333333*xy^32.0+x0^7.0*12.0*xy^171.0+x0^10.0*x0/2.25*xy^120.0+x0^10.0*x0/3.0*xy^87.0-x0^10.0*x0*xy^31.0-x0*3.0-4.0*xy^55.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-5.333333333333333*32.0*xy^31.0+x0^7.0*12.0*171.0*xy^170.0+x0^10.0*x0/2.25*120.0*xy^119.0+x0^10.0*x0/3.0*87.0*xy^86.0-x0^10.0*x0*31.0*xy^30.0-x0*3.0*0.0-4.0*55.0*xy^54.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-170.66666666666666*xy^31.0+x0^7.0*2052.0*xy^170.0+x0^10.0*x0*53.333333333333336*xy^119.0+x0^10.0*x0*29.0*xy^86.0-x0^10.0*x0*31.0*xy^30.0-x0*0.0-220.0*xy^54.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-5.333333333333333*xy^32.0+x0^7.0*12.0*xy^171.0+x0^10.0*x0/2.25*xy^120.0+x0^10.0*x0/3.0*xy^87.0-x0^10.0*x0*xy^31.0-x0*3.0-4.0*xy^55.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-5.333333333333333/33.0*xy^33.0+x0^7.0*12.0/172.0*xy^172.0+x0^10.0*x0/2.25/121.0*xy^121.0+x0^10.0*x0/3.0/88.0*xy^88.0-x0^10.0*x0/32.0*xy^32.0-x0*3.0*xy-4.0/56.0*xy^56.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-0.1616161616161616*xy^33.0+x0^7.0*0.06976744186046512*xy^172.0+x0^10.0*x0*0.0036730945821854912*xy^121.0+x0^10.0*x0*0.003787878787878788*xy^88.0-x0^10.0*x0/32.0*xy^32.0-x0*3.0*xy-1.0/14.0*xy^56.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-170.66666666666666*xy^31.0+x0^7.0*2052.0*xy^170.0+x0^10.0*x0*53.333333333333336*xy^119.0+x0^10.0*x0*29.0*xy^86.0-x0^10.0*x0*31.0*xy^30.0-x0*0.0-220.0*xy^54.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-170.66666666666666*31.0*xy^30.0+x0^7.0*2052.0*170.0*xy^169.0+x0^10.0*x0*53.333333333333336*119.0*xy^118.0+x0^10.0*x0*29.0*86.0*xy^85.0-x0^10.0*x0*31.0*30.0*xy^29.0-x0*0.0*0.0-220.0*54.0*xy^53.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-5290.666666666666*xy^30.0+x0^7.0*348840.0*xy^169.0+x0^10.0*x0*6346.666666666667*xy^118.0+x0^10.0*x0*2494.0*xy^85.0-x0^10.0*x0*930.0*xy^29.0-x0*0.0-11880.0*xy^53.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-0.1616161616161616*xy^33.0+x0^7.0*0.06976744186046512*xy^172.0+x0^10.0*x0*0.0036730945821854912*xy^121.0+x0^10.0*x0*0.003787878787878788*xy^88.0-x0^10.0*x0/32.0*xy^32.0-x0*3.0*xy-1.0/14.0*xy^56.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-0.1616161616161616/34.0*xy^34.0+x0^7.0*0.06976744186046512/173.0*xy^173.0+x0^10.0*x0*0.0036730945821854912/122.0*xy^122.0+x0^10.0*x0*0.003787878787878788/89.0*xy^89.0-x0^10.0*x0/32.0/33.0*xy^33.0-x0*3.0/2.0*xy^2.0-1.0/14.0/57.0*xy^57.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-0.0047534165181224*xy^34.0+x0^7.0*4.032800107541336E-4*xy^173.0+x0^10.0*x0*3.0107332640864684E-5*xy^122.0+x0^10.0*x0*4.256043581886279E-5*xy^89.0-x0^10.0*x0*9.46969696969697E-4*xy^33.0-x0*1.5*xy^2.0-1.0/798.0*xy^57.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-5290.666666666666*xy^30.0+x0^7.0*348840.0*xy^169.0+x0^10.0*x0*6346.666666666667*xy^118.0+x0^10.0*x0*2494.0*xy^85.0-x0^10.0*x0*930.0*xy^29.0-x0*0.0-11880.0*xy^53.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-5290.666666666666*30.0*xy^29.0+x0^7.0*348840.0*169.0*xy^168.0+x0^10.0*x0*6346.666666666667*118.0*xy^117.0+x0^10.0*x0*2494.0*85.0*xy^84.0-x0^10.0*x0*930.0*29.0*xy^28.0-x0*0.0*0.0-11880.0*53.0*xy^52.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-158719.99999999997*xy^29.0+x0^7.0*5.895396E7*xy^168.0+x0^10.0*x0*748906.6666666667*xy^117.0+x0^10.0*x0*211990.0*xy^84.0-x0^10.0*x0*26970.0*xy^28.0-x0*0.0-629640.0*xy^52.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-0.0047534165181224*xy^34.0+x0^7.0*4.032800107541336E-4*xy^173.0-4.0*xy^173.0+x0^10.0*x0*3.0107332640864684E-5*xy^122.0-5.0*xy^122.0+x0^10.0*x0*4.256043581886279E-5*xy^89.0-5.0*xy^89.0-x0^10.0*x0*9.46969696969697E-4*xy^33.0-4.0*xy^33.0-x0*1.5*xy^2.0-1.0/798.0*xy^57.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-0.0047534165181224/35.0*xy^35.0+x0^7.0*4.032800107541336E-4/174.0*xy^174.0-4.0/174.0*xy^174.0+x0^10.0*x0*3.0107332640864684E-5/123.0*xy^123.0-5.0/123.0*xy^123.0+x0^10.0*x0*4.256043581886279E-5/90.0*xy^90.0-5.0/90.0*xy^90.0-x0^10.0*x0*9.46969696969697E-4/34.0*xy^34.0-4.0/34.0*xy^34.0-x0*1.5/3.0*xy^3.0-1.0/798.0/58.0*xy^58.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.3581190051778285E-4*xy^35.0+x0^7.0/431462.00000000006*xy^174.0-1.0/43.5*xy^174.0-0.022988505747126436*xy^174.0+x0^10.0*x0/4085383.5*xy^123.0-1.0/24.6*xy^123.0-0.04065040650406504*xy^123.0+x0^10.0*x0/2114640.0*xy^90.0-1.0/18.0*xy^90.0-0.05555555555555555*xy^90.0-x0^10.0*x0/35904.0*xy^34.0-1.0/8.5*xy^34.0-0.11764705882352941*xy^34.0-x0/2.0*xy^3.0-1.0/46284.0*xy^58.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-158719.99999999997*xy^29.0+x0^7.0*5.895396E7*xy^168.0+x0^10.0*x0*748906.6666666667*xy^117.0+x0^10.0*x0*211990.0*xy^84.0-x0^10.0*x0*26970.0*xy^28.0-x0*0.0-629640.0*xy^52.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-158719.99999999997*29.0*xy^28.0+x0^7.0*5.895396E7*168.0*xy^167.0+x0^10.0*x0*748906.6666666667*117.0*xy^116.0+x0^10.0*x0*211990.0*84.0*xy^83.0-x0^10.0*x0*26970.0*28.0*xy^27.0-x0*0.0*0.0-629640.0*52.0*xy^51.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-4602879.999999999*xy^28.0+x0^7.0*9.90426528E9*xy^167.0+x0^10.0*x0*8.762208000000001E7*xy^116.0+x0^10.0*x0*1.780716E7*xy^83.0-x0^10.0*x0*755160.0*xy^27.0-x0*0.0-3.274128E7*xy^51.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.3581190051778285E-4*xy^35.0-4.0*xy^35.0+x0^7.0/431462.00000000006*xy^174.0-1.0/43.5*xy^174.0-0.022988505747126436*xy^174.0+x0^10.0*x0/4085383.5*xy^123.0-1.0/24.6*xy^123.0-0.04065040650406504*xy^123.0+x0^10.0*x0/2114640.0*xy^90.0-1.0/18.0*xy^90.0-0.05555555555555555*xy^90.0-x0^10.0*x0/35904.0*xy^34.0-1.0/8.5*xy^34.0-0.11764705882352941*xy^34.0-x0/2.0*xy^3.0-1.0/46284.0*xy^58.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.3581190051778285E-4/36.0*xy^36.0-4.0/36.0*xy^36.0+x0^7.0/431462.00000000006/175.0*xy^175.0-1.0/43.5/175.0*xy^175.0-0.022988505747126436/175.0*xy^175.0+x0^10.0*x0/4085383.5/124.0*xy^124.0-1.0/24.6/124.0*xy^124.0-0.04065040650406504/124.0*xy^124.0+x0^10.0*x0/2114640.0/91.0*xy^91.0-1.0/18.0/91.0*xy^91.0-0.05555555555555555/91.0*xy^91.0-x0^10.0*x0/35904.0/35.0*xy^35.0-1.0/8.5/35.0*xy^35.0-0.11764705882352941/35.0*xy^35.0-x0/2.0/4.0*xy^4.0-1.0/46284.0/59.0*xy^59.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/265072.50000000006*xy^36.0-1.0/9.0*xy^36.0-0.1111111111111111*xy^36.0+x0^7.0/7.550585000000001E7*xy^175.0-1.0/7612.5*xy^175.0-1.3136288998357964E-4*xy^175.0+x0^10.0*x0/5.06587554E8*xy^124.0-1.0/3050.4*xy^124.0-3.2782585890375033E-4*xy^124.0+x0^10.0*x0/1.9243224E8*xy^91.0-1.0/1638.0*xy^91.0-6.105006105006105E-4*xy^91.0-x0^10.0*x0/1256640.0*xy^35.0-1.0/297.5*xy^35.0-0.003361344537815126*xy^35.0-x0/8.0*xy^4.0-1.0/2730756.0*xy^59.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131321() {
 UsageCalculus.TestCase = 131321;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xy012^4/-3*xy012^5*-4*xy012^6/-1*xy012^7-3*xyz^3^5*-4*xyz^1^6/-1*xyz^2^74*xyz^1^6/-1*xyz^2^71*x0^7-3*xyz^3^8*4*xyz^1^9*-1*xyz^2^10/--3*xyz^34*xyz^1^9*-1*xyz^2^10/--3*xyz^31*x0^10/--3*x0-3*xyz^34*xyz^1^2*1*xyz^2^3/-3*xyz^3^4*-4*xyz^1^51*xyz^2^3/-3*xyz^3^4*-4*xyz^1^5";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=320 EqnNumber=21 FamilyID=1 MotifTag=1 Entropy=4 FuncWrapAliasID=1"+
"// MetaRow=[12, 21, 10, 20, 3, 1, 2, 5, 1, 1, 2, 1, 2, 3, 4, 3, 1, 1, 5, 3, 4, 6, 2, 3, 1, 1, 10, 3, 4, 8, 1, 19]"+
"// DOEMatrixRow=[2, 21, 20, 4, 1, 2, 3, 4, 3, 4, 1, 2, 3, 2, 3, 1, 2, 3, 2, 3, 1, 2, 1, 1, 2, 1, 3, 2, 3, 5, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-xy012^4.0*1.3333333333333333+x0^7.0*12.0*xyz^171.0+x0^10.0*x0/2.25*xyz^120.0+x0^10.0*x0/3.0*xyz^87.0-x0^10.0*x0*xyz^31.0-x0*3.0-5.333333333333333*xyz^119.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-xy012^4.0*1.3333333333333333*0.0+x0^7.0*12.0*171.0*xyz^170.0+x0^10.0*x0/2.25*120.0*xyz^119.0+x0^10.0*x0/3.0*87.0*xyz^86.0-x0^10.0*x0*31.0*xyz^30.0-x0*3.0*0.0-5.333333333333333*119.0*xyz^118.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-xy012^4.0*0.0+x0^7.0*2052.0*xyz^170.0+x0^10.0*x0*53.333333333333336*xyz^119.0+x0^10.0*x0*29.0*xyz^86.0-x0^10.0*x0*31.0*xyz^30.0-x0*0.0-634.6666666666666*xyz^118.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-xy012^4.0*1.3333333333333333+x0^7.0*12.0*xyz^171.0+x0^10.0*x0/2.25*xyz^120.0+x0^10.0*x0/3.0*xyz^87.0-x0^10.0*x0*xyz^31.0-x0*3.0-5.333333333333333*xyz^119.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-xy012^4.0*1.3333333333333333*xyz+x0^7.0*12.0/172.0*xyz^172.0+x0^10.0*x0/2.25/121.0*xyz^121.0+x0^10.0*x0/3.0/88.0*xyz^88.0-x0^10.0*x0/32.0*xyz^32.0-x0*3.0*xyz-5.333333333333333/120.0*xyz^120.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-xy012^4.0*1.3333333333333333*xyz+x0^7.0*0.06976744186046512*xyz^172.0+x0^10.0*x0*0.0036730945821854912*xyz^121.0+x0^10.0*x0*0.003787878787878788*xyz^88.0-x0^10.0*x0/32.0*xyz^32.0-x0*3.0*xyz-1.0/22.5*xyz^120.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-xy012^4.0*0.0+x0^7.0*2052.0*xyz^170.0+x0^10.0*x0*53.333333333333336*xyz^119.0+x0^10.0*x0*29.0*xyz^86.0-x0^10.0*x0*31.0*xyz^30.0-x0*0.0-634.6666666666666*xyz^118.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-xy012^4.0*0.0+x0^7.0*2052.0*170.0*xyz^169.0+x0^10.0*x0*53.333333333333336*119.0*xyz^118.0+x0^10.0*x0*29.0*86.0*xyz^85.0-x0^10.0*x0*31.0*30.0*xyz^29.0-x0*0.0*0.0-634.6666666666666*118.0*xyz^117.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-xy012^4.0*0.0+x0^7.0*348840.0*xyz^169.0+x0^10.0*x0*6346.666666666667*xyz^118.0+x0^10.0*x0*2494.0*xyz^85.0-x0^10.0*x0*930.0*xyz^29.0-x0*0.0-74890.66666666666*xyz^117.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-xy012^4.0*1.3333333333333333*xyz+x0^7.0*0.06976744186046512*xyz^172.0+x0^10.0*x0*0.0036730945821854912*xyz^121.0+x0^10.0*x0*0.003787878787878788*xyz^88.0-x0^10.0*x0/32.0*xyz^32.0-x0*3.0*xyz-1.0/22.5*xyz^120.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-xy012^4.0*1.3333333333333333/2.0*xyz^2.0+x0^7.0*0.06976744186046512/173.0*xyz^173.0+x0^10.0*x0*0.0036730945821854912/122.0*xyz^122.0+x0^10.0*x0*0.003787878787878788/89.0*xyz^89.0-x0^10.0*x0/32.0/33.0*xyz^33.0-x0*3.0/2.0*xyz^2.0-1.0/22.5/121.0*xyz^121.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-xy012^4.0*0.6666666666666666*xyz^2.0+x0^7.0*4.032800107541336E-4*xyz^173.0+x0^10.0*x0*3.0107332640864684E-5*xyz^122.0+x0^10.0*x0*4.256043581886279E-5*xyz^89.0-x0^10.0*x0*9.46969696969697E-4*xyz^33.0-x0*1.5*xyz^2.0-1.0/2722.5*xyz^121.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-xy012^4.0*0.0+x0^7.0*348840.0*xyz^169.0+x0^10.0*x0*6346.666666666667*xyz^118.0+x0^10.0*x0*2494.0*xyz^85.0-x0^10.0*x0*930.0*xyz^29.0-x0*0.0-74890.66666666666*xyz^117.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-xy012^4.0*0.0+x0^7.0*348840.0*169.0*xyz^168.0+x0^10.0*x0*6346.666666666667*118.0*xyz^117.0+x0^10.0*x0*2494.0*85.0*xyz^84.0-x0^10.0*x0*930.0*29.0*xyz^28.0-x0*0.0*0.0-74890.66666666666*117.0*xyz^116.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-xy012^4.0*0.0+x0^7.0*5.895396E7*xyz^168.0+x0^10.0*x0*748906.6666666667*xyz^117.0+x0^10.0*x0*211990.0*xyz^84.0-x0^10.0*x0*26970.0*xyz^28.0-x0*0.0-8762207.999999998*xyz^116.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-xy012^4.0*0.6666666666666666*xyz^2.0+x0^7.0*4.032800107541336E-4*xyz^173.0-4.0*xyz^173.0+x0^10.0*x0*3.0107332640864684E-5*xyz^122.0-5.0*xyz^122.0+x0^10.0*x0*4.256043581886279E-5*xyz^89.0-5.0*xyz^89.0-x0^10.0*x0*9.46969696969697E-4*xyz^33.0-4.0*xyz^33.0-x0*1.5*xyz^2.0-1.0/2722.5*xyz^121.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-xy012^4.0*0.6666666666666666/3.0*xyz^3.0+x0^7.0*4.032800107541336E-4/174.0*xyz^174.0-4.0/174.0*xyz^174.0+x0^10.0*x0*3.0107332640864684E-5/123.0*xyz^123.0-5.0/123.0*xyz^123.0+x0^10.0*x0*4.256043581886279E-5/90.0*xyz^90.0-5.0/90.0*xyz^90.0-x0^10.0*x0*9.46969696969697E-4/34.0*xyz^34.0-4.0/34.0*xyz^34.0-x0*1.5/3.0*xyz^3.0-1.0/2722.5/122.0*xyz^122.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-xy012^4.0*0.2222222222222222*xyz^3.0+x0^7.0/431462.00000000006*xyz^174.0-1.0/43.5*xyz^174.0-0.022988505747126436*xyz^174.0+x0^10.0*x0/4085383.5*xyz^123.0-1.0/24.6*xyz^123.0-0.04065040650406504*xyz^123.0+x0^10.0*x0/2114640.0*xyz^90.0-1.0/18.0*xyz^90.0-0.05555555555555555*xyz^90.0-x0^10.0*x0/35904.0*xyz^34.0-1.0/8.5*xyz^34.0-0.11764705882352941*xyz^34.0-x0/2.0*xyz^3.0-1.0/332145.0*xyz^122.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-xy012^4.0*0.0+x0^7.0*5.895396E7*xyz^168.0+x0^10.0*x0*748906.6666666667*xyz^117.0+x0^10.0*x0*211990.0*xyz^84.0-x0^10.0*x0*26970.0*xyz^28.0-x0*0.0-8762207.999999998*xyz^116.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-xy012^4.0*0.0+x0^7.0*5.895396E7*168.0*xyz^167.0+x0^10.0*x0*748906.6666666667*117.0*xyz^116.0+x0^10.0*x0*211990.0*84.0*xyz^83.0-x0^10.0*x0*26970.0*28.0*xyz^27.0-x0*0.0*0.0-8762207.999999998*116.0*xyz^115.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-xy012^4.0*0.0+x0^7.0*9.90426528E9*xyz^167.0+x0^10.0*x0*8.762208000000001E7*xyz^116.0+x0^10.0*x0*1.780716E7*xyz^83.0-x0^10.0*x0*755160.0*xyz^27.0-x0*0.0-1.0164161279999998E9*xyz^115.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-xy012^4.0*0.2222222222222222*xyz^3.0+x0^7.0/431462.00000000006*xyz^174.0-1.0/43.5*xyz^174.0-0.022988505747126436*xyz^174.0+x0^10.0*x0/4085383.5*xyz^123.0-1.0/24.6*xyz^123.0-0.04065040650406504*xyz^123.0+x0^10.0*x0/2114640.0*xyz^90.0-1.0/18.0*xyz^90.0-0.05555555555555555*xyz^90.0-x0^10.0*x0/35904.0*xyz^34.0-1.0/8.5*xyz^34.0-0.11764705882352941*xyz^34.0-x0/2.0*xyz^3.0-1.0/332145.0*xyz^122.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-xy012^4.0*0.2222222222222222/4.0*xyz^4.0+x0^7.0/431462.00000000006/175.0*xyz^175.0-1.0/43.5/175.0*xyz^175.0-0.022988505747126436/175.0*xyz^175.0+x0^10.0*x0/4085383.5/124.0*xyz^124.0-1.0/24.6/124.0*xyz^124.0-0.04065040650406504/124.0*xyz^124.0+x0^10.0*x0/2114640.0/91.0*xyz^91.0-1.0/18.0/91.0*xyz^91.0-0.05555555555555555/91.0*xyz^91.0-x0^10.0*x0/35904.0/35.0*xyz^35.0-1.0/8.5/35.0*xyz^35.0-0.11764705882352941/35.0*xyz^35.0-x0/2.0/4.0*xyz^4.0-1.0/332145.0/123.0*xyz^123.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-xy012^4.0*0.05555555555555555*xyz^4.0+x0^7.0/7.550585000000001E7*xyz^175.0-1.0/7612.5*xyz^175.0-1.3136288998357964E-4*xyz^175.0+x0^10.0*x0/5.06587554E8*xyz^124.0-1.0/3050.4*xyz^124.0-3.2782585890375033E-4*xyz^124.0+x0^10.0*x0/1.9243224E8*xyz^91.0-1.0/1638.0*xyz^91.0-6.105006105006105E-4*xyz^91.0-x0^10.0*x0/1256640.0*xyz^35.0-1.0/297.5*xyz^35.0-0.003361344537815126*xyz^35.0-x0/8.0*xyz^4.0-1.0/4.0853835E7*xyz^123.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131322() {
 UsageCalculus.TestCase = 131322;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xyza^3^5*-4*xyza^1^6/-1*xyza^2^74*xyza^1^6/-1*xyza^2^71*x0^7-3*xyza^3^8*4*xyza^1^9*-1*xyza^2^10/--3*xyza^34*xyza^1^9*-1*xyza^2^10/--3*xyza^31*x0^10/--3*x0-3*xyza^34*xyza^1^2*1*xyza^2^3/-3*xyza^3^4*-4*xyza^1^51*xyza^2^3/-3*xyza^3^4*-4*xyza^1^5-3*xy012^4*-4*xy012^5";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=321 EqnNumber=22 FamilyID=2 MotifTag=3 Entropy=1 FuncWrapAliasID=3"+
"// MetaRow=[12, 22, 10, 19, 4, 2, 3, 6, 2, 3, 4, 2, 3, 1, 1, 1, 2, 1, 1, 1, 1, 7, 3, 1, 2, 3, 11, 1, 1, 9, 2, 20]"+
"// DOEMatrixRow=[2, 22, 20, 3, 1, 3, 1, 5, 1, 1, 2, 1, 1, 3, 4, 2, 3, 4, 3, 1, 2, 3, 2, 3, 4, 2, 1, 3, 4, 6, 1]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^7.0*12.0*xyza^171.0+x0^10.0*x0/2.25*xyza^120.0+x0^10.0*x0/3.0*xyza^87.0-x0^10.0*x0*xyza^31.0-x0*3.0-5.333333333333333*xyza^119.0+xy012^4.0*12.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^7.0*12.0*171.0*xyza^170.0+x0^10.0*x0/2.25*120.0*xyza^119.0+x0^10.0*x0/3.0*87.0*xyza^86.0-x0^10.0*x0*31.0*xyza^30.0-x0*3.0*0.0-5.333333333333333*119.0*xyza^118.0+xy012^4.0*12.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^7.0*2052.0*xyza^170.0+x0^10.0*x0*53.333333333333336*xyza^119.0+x0^10.0*x0*29.0*xyza^86.0-x0^10.0*x0*31.0*xyza^30.0-x0*0.0-634.6666666666666*xyza^118.0+xy012^4.0*0.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^7.0*12.0*xyza^171.0+x0^10.0*x0/2.25*xyza^120.0+x0^10.0*x0/3.0*xyza^87.0-x0^10.0*x0*xyza^31.0-x0*3.0-5.333333333333333*xyza^119.0+xy012^4.0*12.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^7.0*12.0/172.0*xyza^172.0+x0^10.0*x0/2.25/121.0*xyza^121.0+x0^10.0*x0/3.0/88.0*xyza^88.0-x0^10.0*x0/32.0*xyza^32.0-x0*3.0*xyza-5.333333333333333/120.0*xyza^120.0+xy012^4.0*12.0*xyza";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^7.0*0.06976744186046512*xyza^172.0+x0^10.0*x0*0.0036730945821854912*xyza^121.0+x0^10.0*x0*0.003787878787878788*xyza^88.0-x0^10.0*x0/32.0*xyza^32.0-x0*3.0*xyza-0.04444444444444444*xyza^120.0+xy012^4.0*12.0*xyza";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^7.0*2052.0*xyza^170.0+x0^10.0*x0*53.333333333333336*xyza^119.0+x0^10.0*x0*29.0*xyza^86.0-x0^10.0*x0*31.0*xyza^30.0-x0*0.0-634.6666666666666*xyza^118.0+xy012^4.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^7.0*2052.0*170.0*xyza^169.0+x0^10.0*x0*53.333333333333336*119.0*xyza^118.0+x0^10.0*x0*29.0*86.0*xyza^85.0-x0^10.0*x0*31.0*30.0*xyza^29.0-x0*0.0*0.0-634.6666666666666*118.0*xyza^117.0+xy012^4.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^7.0*348840.0*xyza^169.0+x0^10.0*x0*6346.666666666667*xyza^118.0+x0^10.0*x0*2494.0*xyza^85.0-x0^10.0*x0*930.0*xyza^29.0-x0*0.0-74890.66666666666*xyza^117.0+xy012^4.0*0.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^7.0*0.06976744186046512*xyza^172.0+x0^10.0*x0*0.0036730945821854912*xyza^121.0+x0^10.0*x0*0.003787878787878788*xyza^88.0-x0^10.0*x0/32.0*xyza^32.0-x0*3.0*xyza-0.04444444444444444*xyza^120.0+xy012^4.0*12.0*xyza";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^7.0*0.06976744186046512/173.0*xyza^173.0+x0^10.0*x0*0.0036730945821854912/122.0*xyza^122.0+x0^10.0*x0*0.003787878787878788/89.0*xyza^89.0-x0^10.0*x0/32.0/33.0*xyza^33.0-x0*3.0/2.0*xyza^2.0-0.04444444444444444/121.0*xyza^121.0+xy012^4.0*12.0/2.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^7.0*4.032800107541336E-4*xyza^173.0+x0^10.0*x0*3.0107332640864684E-5*xyza^122.0+x0^10.0*x0*4.256043581886279E-5*xyza^89.0-x0^10.0*x0*9.46969696969697E-4*xyza^33.0-x0*1.5*xyza^2.0-3.6730945821854906E-4*xyza^121.0+xy012^4.0*6.0*xyza^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^7.0*348840.0*xyza^169.0+x0^10.0*x0*6346.666666666667*xyza^118.0+x0^10.0*x0*2494.0*xyza^85.0-x0^10.0*x0*930.0*xyza^29.0-x0*0.0-74890.66666666666*xyza^117.0+xy012^4.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^7.0*348840.0*169.0*xyza^168.0+x0^10.0*x0*6346.666666666667*118.0*xyza^117.0+x0^10.0*x0*2494.0*85.0*xyza^84.0-x0^10.0*x0*930.0*29.0*xyza^28.0-x0*0.0*0.0-74890.66666666666*117.0*xyza^116.0+xy012^4.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^7.0*5.895396E7*xyza^168.0+x0^10.0*x0*748906.6666666667*xyza^117.0+x0^10.0*x0*211990.0*xyza^84.0-x0^10.0*x0*26970.0*xyza^28.0-x0*0.0-8762207.999999998*xyza^116.0+xy012^4.0*0.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^7.0*4.032800107541336E-4*xyza^173.0-4.0*xyza^173.0+x0^10.0*x0*3.0107332640864684E-5*xyza^122.0-5.0*xyza^122.0+x0^10.0*x0*4.256043581886279E-5*xyza^89.0-5.0*xyza^89.0-x0^10.0*x0*9.46969696969697E-4*xyza^33.0-4.0*xyza^33.0-x0*1.5*xyza^2.0-3.6730945821854906E-4*xyza^121.0-4.0*xyza^121.0+xy012^4.0*6.0*xyza^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^7.0*4.032800107541336E-4/174.0*xyza^174.0-4.0/174.0*xyza^174.0+x0^10.0*x0*3.0107332640864684E-5/123.0*xyza^123.0-5.0/123.0*xyza^123.0+x0^10.0*x0*4.256043581886279E-5/90.0*xyza^90.0-5.0/90.0*xyza^90.0-x0^10.0*x0*9.46969696969697E-4/34.0*xyza^34.0-4.0/34.0*xyza^34.0-x0*1.5/3.0*xyza^3.0-3.6730945821854906E-4/122.0*xyza^122.0-4.0/122.0*xyza^122.0+xy012^4.0*6.0/3.0*xyza^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^7.0/431462.00000000006*xyza^174.0-1.0/43.5*xyza^174.0-0.022988505747126436*xyza^174.0+x0^10.0*x0/4085383.5*xyza^123.0-1.0/24.6*xyza^123.0-0.04065040650406504*xyza^123.0+x0^10.0*x0/2114640.0*xyza^90.0-1.0/18.0*xyza^90.0-0.05555555555555555*xyza^90.0-x0^10.0*x0/35904.0*xyza^34.0-1.0/8.5*xyza^34.0-0.11764705882352941*xyza^34.0-x0/2.0*xyza^3.0-1.0/332145.00000000006*xyza^122.0-1.0/30.5*xyza^122.0-0.03278688524590164*xyza^122.0+xy012^4.0*2.0*xyza^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^7.0*5.895396E7*xyza^168.0+x0^10.0*x0*748906.6666666667*xyza^117.0+x0^10.0*x0*211990.0*xyza^84.0-x0^10.0*x0*26970.0*xyza^28.0-x0*0.0-8762207.999999998*xyza^116.0+xy012^4.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^7.0*5.895396E7*168.0*xyza^167.0+x0^10.0*x0*748906.6666666667*117.0*xyza^116.0+x0^10.0*x0*211990.0*84.0*xyza^83.0-x0^10.0*x0*26970.0*28.0*xyza^27.0-x0*0.0*0.0-8762207.999999998*116.0*xyza^115.0+xy012^4.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^7.0*9.90426528E9*xyza^167.0+x0^10.0*x0*8.762208000000001E7*xyza^116.0+x0^10.0*x0*1.780716E7*xyza^83.0-x0^10.0*x0*755160.0*xyza^27.0-x0*0.0-1.0164161279999998E9*xyza^115.0+xy012^4.0*0.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^7.0/431462.00000000006*xyza^174.0-1.0/43.5*xyza^174.0-0.022988505747126436*xyza^174.0+x0^10.0*x0/4085383.5*xyza^123.0-1.0/24.6*xyza^123.0-0.04065040650406504*xyza^123.0+x0^10.0*x0/2114640.0*xyza^90.0-1.0/18.0*xyza^90.0-0.05555555555555555*xyza^90.0-x0^10.0*x0/35904.0*xyza^34.0-1.0/8.5*xyza^34.0-0.11764705882352941*xyza^34.0-x0/2.0*xyza^3.0-1.0/332145.00000000006*xyza^122.0-1.0/30.5*xyza^122.0-0.03278688524590164*xyza^122.0+xy012^4.0*2.0*xyza^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^7.0/431462.00000000006/175.0*xyza^175.0-1.0/43.5/175.0*xyza^175.0-0.022988505747126436/175.0*xyza^175.0+x0^10.0*x0/4085383.5/124.0*xyza^124.0-1.0/24.6/124.0*xyza^124.0-0.04065040650406504/124.0*xyza^124.0+x0^10.0*x0/2114640.0/91.0*xyza^91.0-1.0/18.0/91.0*xyza^91.0-0.05555555555555555/91.0*xyza^91.0-x0^10.0*x0/35904.0/35.0*xyza^35.0-1.0/8.5/35.0*xyza^35.0-0.11764705882352941/35.0*xyza^35.0-x0/2.0/4.0*xyza^4.0-1.0/332145.00000000006/123.0*xyza^123.0-1.0/30.5/123.0*xyza^123.0-0.03278688524590164/123.0*xyza^123.0+xy012^4.0*2.0/4.0*xyza^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^7.0/7.550585000000001E7*xyza^175.0-1.0/7612.5*xyza^175.0-1.3136288998357964E-4*xyza^175.0+x0^10.0*x0/5.06587554E8*xyza^124.0-1.0/3050.4*xyza^124.0-3.2782585890375033E-4*xyza^124.0+x0^10.0*x0/1.9243224E8*xyza^91.0-1.0/1638.0*xyza^91.0-6.105006105006105E-4*xyza^91.0-x0^10.0*x0/1256640.0*xyza^35.0-1.0/297.5*xyza^35.0-0.003361344537815126*xyza^35.0-x0/8.0*xyza^4.0-1.0/4.085383500000001E7*xyza^123.0-1.0/3751.5*xyza^123.0-2.665600426496068E-4*xyza^123.0+xy012^4.0/2.0*xyza^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131323() {
 UsageCalculus.TestCase = 131323;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "4*x^1^6/-1*x^2^71*x0^7-3*x^3^8*4*x^1^9*-1*x^2^10/--3*x^34*x^1^9*-1*x^2^10/--3*x^31*x0^10/--3*x0-3*x^34*x^1^2*1*x^2^3/-3*x^3^4*-4*x^1^51*x^2^3/-3*x^3^4*-4*x^1^5-3*xy012^4*-4*xy012^54*x^1^5";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=322 EqnNumber=23 FamilyID=3 MotifTag=4 Entropy=3 FuncWrapAliasID=4"+
"// MetaRow=[12, 23, 10, 18, 1, 3, 1, 7, 3, 4, 1, 1, 1, 2, 3, 2, 3, 2, 3, 2, 3, 8, 1, 2, 3, 4, 12, 2, 3, 10, 3, 21]"+
"// DOEMatrixRow=[2, 23, 20, 2, 1, 1, 2, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 5, 4, 2, 3, 4, 3, 1, 5, 3, 2, 1, 1, 7, 2]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-4.0*x^80.0+1.0/2.25*x^120.0+1.0/3.0*x^87.0-x^31.0-3.0-5.333333333333333*x^119.0+12.0*x^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-4.0*80.0*x^79.0+1.0/2.25*120.0*x^119.0+1.0/3.0*87.0*x^86.0-31.0*x^30.0-3.0*0.0-5.333333333333333*119.0*x^118.0+12.0*6.0*x^5.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-320.0*x^79.0+53.333333333333336*x^119.0+29.0*x^86.0-31.0*x^30.0-634.6666666666666*x^118.0+72.0*x^5.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-4.0*x^80.0+1.0/2.25*x^120.0+1.0/3.0*x^87.0-x^31.0-3.0-5.333333333333333*x^119.0+12.0*x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-4.0/81.0*x^81.0+1.0/2.25/121.0*x^121.0+1.0/3.0/88.0*x^88.0-1.0/32.0*x^32.0-3.0*x-5.333333333333333/120.0*x^120.0+12.0/7.0*x^7.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/20.25*x^81.0+1.0/272.25*x^121.0+1.0/264.0*x^88.0-1.0/32.0*x^32.0-3.0*x-1.0/22.5*x^120.0+1.7142857142857142*x^7.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-320.0*x^79.0+53.333333333333336*x^119.0+29.0*x^86.0-31.0*x^30.0-634.6666666666666*x^118.0+72.0*x^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-320.0*79.0*x^78.0+53.333333333333336*119.0*x^118.0+29.0*86.0*x^85.0-31.0*30.0*x^29.0-634.6666666666666*118.0*x^117.0+72.0*5.0*x^4.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-25280.0*x^78.0+6346.666666666667*x^118.0+2494.0*x^85.0-930.0*x^29.0-74890.66666666666*x^117.0+360.0*x^4.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/20.25*x^81.0+1.0/272.25*x^121.0+1.0/264.0*x^88.0-1.0/32.0*x^32.0-3.0*x-1.0/22.5*x^120.0+1.7142857142857142*x^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/20.25/82.0*x^82.0+1.0/272.25/122.0*x^122.0+1.0/264.0/89.0*x^89.0-1.0/32.0/33.0*x^33.0-3.0/2.0*x^2.0-1.0/22.5/121.0*x^121.0+1.7142857142857142/8.0*x^8.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/1660.5*x^82.0+1.0/33214.5*x^122.0+1.0/23496.0*x^89.0-1.0/1056.0*x^33.0-1.5*x^2.0-1.0/2722.5*x^121.0+1.0/4.666666666666667*x^8.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-25280.0*x^78.0+6346.666666666667*x^118.0+2494.0*x^85.0-930.0*x^29.0-74890.66666666666*x^117.0+360.0*x^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-25280.0*78.0*x^77.0+6346.666666666667*118.0*x^117.0+2494.0*85.0*x^84.0-930.0*29.0*x^28.0-74890.66666666666*117.0*x^116.0+360.0*4.0*x^3.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-1971840.0*x^77.0+748906.6666666667*x^117.0+211990.0*x^84.0-26970.0*x^28.0-8762207.999999998*x^116.0+1440.0*x^3.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/1660.5*x^82.0+1.0/33214.5*x^122.0+1.0/23496.0*x^89.0-1.0/1056.0*x^33.0-1.5*x^2.0-1.0/2722.5*x^121.0+1.0/4.666666666666667*x^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/1660.5/83.0*x^83.0+1.0/33214.5/123.0*x^123.0+1.0/23496.0/90.0*x^90.0-1.0/1056.0/34.0*x^34.0-1.5/3.0*x^3.0-1.0/2722.5/122.0*x^122.0+1.0/4.666666666666667/9.0*x^9.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/137821.5*x^83.0+1.0/4085383.5*x^123.0+1.0/2114640.0*x^90.0-1.0/35904.0*x^34.0-1.0/2.0*x^3.0-1.0/332145.0*x^122.0+1.0/42.0*x^9.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-1971840.0*x^77.0+748906.6666666667*x^117.0+211990.0*x^84.0-26970.0*x^28.0-8762207.999999998*x^116.0+1440.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-1971840.0*77.0*x^76.0+748906.6666666667*117.0*x^116.0+211990.0*84.0*x^83.0-26970.0*28.0*x^27.0-8762207.999999998*116.0*x^115.0+1440.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1.5183168E8*x^76.0+8.762208000000001E7*x^116.0+1.780716E7*x^83.0-755160.0*x^27.0-1.0164161279999998E9*x^115.0+4320.0*x^2.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/137821.5*x^83.0+1.0/4085383.5*x^123.0+1.0/2114640.0*x^90.0-1.0/35904.0*x^34.0-1.0/2.0*x^3.0-1.0/332145.0*x^122.0+1.0/42.0*x^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/137821.5/84.0*x^84.0+1.0/4085383.5/124.0*x^124.0+1.0/2114640.0/91.0*x^91.0-1.0/35904.0/35.0*x^35.0-1.0/2.0/4.0*x^4.0-1.0/332145.0/123.0*x^123.0+1.0/42.0/10.0*x^10.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/1.1577006E7*x^84.0+1.0/5.06587554E8*x^124.0+1.0/1.9243224E8*x^91.0-1.0/1256640.0*x^35.0-1.0/8.0*x^4.0-1.0/4.0853835E7*x^123.0+1.0/420.0*x^10.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131324() {
 UsageCalculus.TestCase = 131324;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x0^7-3*xy^3^8*4*xy^1^9*-1*xy^2^10/--3*xy^34*xy^1^9*-1*xy^2^10/--3*xy^31*x0^10/--3*x0-3*xy^34*xy^1^2*1*xy^2^3/-3*xy^3^4*-4*xy^1^51*xy^2^3/-3*xy^3^4*-4*xy^1^5-3*xy012^4*-4*xy012^54*xy^1^51*xy^2^6*+-3*xy^3^7*4*xy^1^8*-1*xy^2^9";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=323 EqnNumber=24 FamilyID=1 MotifTag=1 Entropy=4 FuncWrapAliasID=1"+
"// MetaRow=[12, 24, 10, 17, 2, 1, 2, 8, 1, 1, 2, 1, 2, 3, 4, 3, 1, 1, 4, 3, 4, 9, 2, 3, 1, 1, 13, 3, 4, 11, 4, 22]"+
"// DOEMatrixRow=[2, 24, 20, 1, 2, 3, 1, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 6, 5, 3, 1, 5, 1, 2, 6, 4, 3, 2, 3, 8, 1]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^7.0+x0^10.0*x0/2.25*xy^120.0+x0^10.0*x0/3.0*xy^87.0-x0^10.0*x0*xy^31.0-x0*3.0-5.333333333333333*xy^119.0+144.0*xy^60.0+12.0*xy^30.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^7.0*0.0+x0^10.0*x0/2.25*120.0*xy^119.0+x0^10.0*x0/3.0*87.0*xy^86.0-x0^10.0*x0*31.0*xy^30.0-x0*3.0*0.0-5.333333333333333*119.0*xy^118.0+144.0*60.0*xy^59.0+12.0*30.0*xy^29.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^7.0*0.0+x0^10.0*x0*53.333333333333336*xy^119.0+x0^10.0*x0*29.0*xy^86.0-x0^10.0*x0*31.0*xy^30.0-x0*0.0-634.6666666666666*xy^118.0+8640.0*xy^59.0+360.0*xy^29.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^7.0+x0^10.0*x0/2.25*xy^120.0+x0^10.0*x0/3.0*xy^87.0-x0^10.0*x0*xy^31.0-x0*3.0-5.333333333333333*xy^119.0+144.0*xy^60.0+12.0*xy^30.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^7.0*xy+x0^10.0*x0/2.25/121.0*xy^121.0+x0^10.0*x0/3.0/88.0*xy^88.0-x0^10.0*x0/32.0*xy^32.0-x0*3.0*xy-5.333333333333333/120.0*xy^120.0+144.0/61.0*xy^61.0+12.0/31.0*xy^31.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^7.0*xy+x0^10.0*x0*0.0036730945821854912*xy^121.0+x0^10.0*x0*0.003787878787878788*xy^88.0-x0^10.0*x0/32.0*xy^32.0-x0*3.0*xy-1.0/22.5*xy^120.0+2.360655737704918*xy^61.0+1.0/2.5833333333333335*xy^31.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^7.0*0.0+x0^10.0*x0*53.333333333333336*xy^119.0+x0^10.0*x0*29.0*xy^86.0-x0^10.0*x0*31.0*xy^30.0-x0*0.0-634.6666666666666*xy^118.0+8640.0*xy^59.0+360.0*xy^29.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^7.0*0.0+x0^10.0*x0*53.333333333333336*119.0*xy^118.0+x0^10.0*x0*29.0*86.0*xy^85.0-x0^10.0*x0*31.0*30.0*xy^29.0-x0*0.0*0.0-634.6666666666666*118.0*xy^117.0+8640.0*59.0*xy^58.0+360.0*29.0*xy^28.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^7.0*0.0+x0^10.0*x0*6346.666666666667*xy^118.0+x0^10.0*x0*2494.0*xy^85.0-x0^10.0*x0*930.0*xy^29.0-x0*0.0-74890.66666666666*xy^117.0+509760.0*xy^58.0+10440.0*xy^28.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^7.0*xy+x0^10.0*x0*0.0036730945821854912*xy^121.0+x0^10.0*x0*0.003787878787878788*xy^88.0-x0^10.0*x0/32.0*xy^32.0-x0*3.0*xy-1.0/22.5*xy^120.0+2.360655737704918*xy^61.0+1.0/2.5833333333333335*xy^31.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^7.0/2.0*xy^2.0+x0^10.0*x0*0.0036730945821854912/122.0*xy^122.0+x0^10.0*x0*0.003787878787878788/89.0*xy^89.0-x0^10.0*x0/32.0/33.0*xy^33.0-x0*3.0/2.0*xy^2.0-1.0/22.5/121.0*xy^121.0+2.360655737704918/62.0*xy^62.0+1.0/2.5833333333333335/32.0*xy^32.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^7.0/2.0*xy^2.0+x0^10.0*x0*3.0107332640864684E-5*xy^122.0+x0^10.0*x0*4.256043581886279E-5*xy^89.0-x0^10.0*x0*9.46969696969697E-4*xy^33.0-x0*1.5*xy^2.0-1.0/2722.5*xy^121.0+1.0/26.26388888888889*xy^62.0+1.0/82.66666666666667*xy^32.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^7.0*0.0+x0^10.0*x0*6346.666666666667*xy^118.0+x0^10.0*x0*2494.0*xy^85.0-x0^10.0*x0*930.0*xy^29.0-x0*0.0-74890.66666666666*xy^117.0+509760.0*xy^58.0+10440.0*xy^28.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^7.0*0.0+x0^10.0*x0*6346.666666666667*118.0*xy^117.0+x0^10.0*x0*2494.0*85.0*xy^84.0-x0^10.0*x0*930.0*29.0*xy^28.0-x0*0.0*0.0-74890.66666666666*117.0*xy^116.0+509760.0*58.0*xy^57.0+10440.0*28.0*xy^27.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^7.0*0.0+x0^10.0*x0*748906.6666666667*xy^117.0+x0^10.0*x0*211990.0*xy^84.0-x0^10.0*x0*26970.0*xy^28.0-x0*0.0-8762207.999999998*xy^116.0+2.956608E7*xy^57.0+292320.0*xy^27.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^7.0/2.0*xy^2.0+x0^10.0*x0*3.0107332640864684E-5*xy^122.0-5.0*xy^122.0+x0^10.0*x0*4.256043581886279E-5*xy^89.0-5.0*xy^89.0-x0^10.0*x0*9.46969696969697E-4*xy^33.0-4.0*xy^33.0-x0*1.5*xy^2.0-1.0/2722.5*xy^121.0+1.0/26.26388888888889*xy^62.0+1.0/82.66666666666667*xy^32.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^7.0/2.0/3.0*xy^3.0+x0^10.0*x0*3.0107332640864684E-5/123.0*xy^123.0-5.0/123.0*xy^123.0+x0^10.0*x0*4.256043581886279E-5/90.0*xy^90.0-5.0/90.0*xy^90.0-x0^10.0*x0*9.46969696969697E-4/34.0*xy^34.0-4.0/34.0*xy^34.0-x0*1.5/3.0*xy^3.0-1.0/2722.5/122.0*xy^122.0+1.0/26.26388888888889/63.0*xy^63.0+1.0/82.66666666666667/33.0*xy^33.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^7.0*0.16666666666666666*xy^3.0+x0^10.0*x0/4085383.5*xy^123.0-1.0/24.6*xy^123.0-0.04065040650406504*xy^123.0+x0^10.0*x0/2114640.0*xy^90.0-1.0/18.0*xy^90.0-0.05555555555555555*xy^90.0-x0^10.0*x0/35904.0*xy^34.0-1.0/8.5*xy^34.0-0.11764705882352941*xy^34.0-x0/2.0*xy^3.0-1.0/332145.0*xy^122.0+1.0/1654.625*xy^63.0+1.0/2728.0*xy^33.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^7.0*0.0+x0^10.0*x0*748906.6666666667*xy^117.0+x0^10.0*x0*211990.0*xy^84.0-x0^10.0*x0*26970.0*xy^28.0-x0*0.0-8762207.999999998*xy^116.0+2.956608E7*xy^57.0+292320.0*xy^27.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^7.0*0.0+x0^10.0*x0*748906.6666666667*117.0*xy^116.0+x0^10.0*x0*211990.0*84.0*xy^83.0-x0^10.0*x0*26970.0*28.0*xy^27.0-x0*0.0*0.0-8762207.999999998*116.0*xy^115.0+57.0*xy^56.0+292320.0*27.0*xy^26.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^7.0*0.0+x0^10.0*x0*8.762208000000001E7*xy^116.0+x0^10.0*x0*1.780716E7*xy^83.0-x0^10.0*x0*755160.0*xy^27.0-x0*0.0-1.0164161279999998E9*xy^115.0+57.0*xy^56.0+7892640.0*xy^26.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^7.0*0.16666666666666666*xy^3.0+x0^10.0*x0/4085383.5*xy^123.0-1.0/24.6*xy^123.0-0.04065040650406504*xy^123.0+x0^10.0*x0/2114640.0*xy^90.0-1.0/18.0*xy^90.0-0.05555555555555555*xy^90.0-x0^10.0*x0/35904.0*xy^34.0-1.0/8.5*xy^34.0-0.11764705882352941*xy^34.0-x0/2.0*xy^3.0-1.0/332145.0*xy^122.0+1.0/1654.625*xy^63.0+1.0/2728.0*xy^33.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^7.0*0.16666666666666666/4.0*xy^4.0+x0^10.0*x0/4085383.5/124.0*xy^124.0-1.0/24.6/124.0*xy^124.0-0.04065040650406504/124.0*xy^124.0+x0^10.0*x0/2114640.0/91.0*xy^91.0-1.0/18.0/91.0*xy^91.0-0.05555555555555555/91.0*xy^91.0-x0^10.0*x0/35904.0/35.0*xy^35.0-1.0/8.5/35.0*xy^35.0-0.11764705882352941/35.0*xy^35.0-x0/2.0/4.0*xy^4.0-1.0/332145.0/123.0*xy^123.0+1.0/1654.625/64.0*xy^64.0+1.0/2728.0/34.0*xy^34.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^7.0*0.041666666666666664*xy^4.0+x0^10.0*x0/5.06587554E8*xy^124.0-1.0/3050.4*xy^124.0-3.2782585890375033E-4*xy^124.0+x0^10.0*x0/1.9243224E8*xy^91.0-1.0/1638.0*xy^91.0-6.105006105006105E-4*xy^91.0-x0^10.0*x0/1256640.0*xy^35.0-1.0/297.5*xy^35.0-0.003361344537815126*xy^35.0-x0/8.0*xy^4.0-1.0/4.0853835E7*xy^123.0+1.0/105896.0*xy^64.0+1.0/92752.0*xy^34.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131325() {
 UsageCalculus.TestCase = 131325;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xyz^3^8*4*xyz^1^9*-1*xyz^2^10/--3*xyz^34*xyz^1^9*-1*xyz^2^10/--3*xyz^31*x0^10/--3*x0-3*xyz^34*xyz^1^2*1*xyz^2^3/-3*xyz^3^4*-4*xyz^1^51*xyz^2^3/-3*xyz^3^4*-4*xyz^1^5-3*xy012^4*-4*xy012^54*xyz^1^51*xyz^2^6*+-3*xyz^3^7*4*xyz^1^8*-1*xyz^2^9-3*xyz^3^7*4*xyz^1^8*-1*xyz^2^9";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=324 EqnNumber=25 FamilyID=2 MotifTag=3 Entropy=1 FuncWrapAliasID=3"+
"// MetaRow=[12, 25, 10, 16, 3, 2, 3, 9, 2, 3, 4, 2, 3, 1, 1, 1, 2, 1, 5, 1, 1, 10, 3, 1, 2, 3, 14, 1, 1, 12, 1, 23]"+
"// DOEMatrixRow=[2, 25, 20, 4, 2, 1, 2, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 7, 6, 1, 2, 1, 2, 3, 1, 1, 1, 3, 4, 9, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^10.0*x0/2.25*xyz^120.0+x0^10.0*x0/3.0*xyz^87.0-x0^10.0*x0*xyz^31.0-x0*3.0-5.333333333333333*xyz^119.0+xy012^4.0*144.0*xyz^60.0+12.0*xyz^30.0+12.0*xyz^30.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^10.0*x0/2.25*120.0*xyz^119.0+x0^10.0*x0/3.0*87.0*xyz^86.0-x0^10.0*x0*31.0*xyz^30.0-x0*3.0*0.0-5.333333333333333*119.0*xyz^118.0+xy012^4.0*144.0*60.0*xyz^59.0+12.0*30.0*xyz^29.0+12.0*30.0*xyz^29.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^10.0*x0*53.333333333333336*xyz^119.0+x0^10.0*x0*29.0*xyz^86.0-x0^10.0*x0*31.0*xyz^30.0-x0*0.0-634.6666666666666*xyz^118.0+xy012^4.0*8640.0*xyz^59.0+360.0*xyz^29.0+360.0*xyz^29.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^10.0*x0/2.25*xyz^120.0+x0^10.0*x0/3.0*xyz^87.0-x0^10.0*x0*xyz^31.0-x0*3.0-5.333333333333333*xyz^119.0+xy012^4.0*144.0*xyz^60.0+12.0*xyz^30.0+12.0*xyz^30.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^10.0*x0/2.25/121.0*xyz^121.0+x0^10.0*x0/3.0/88.0*xyz^88.0-x0^10.0*x0/32.0*xyz^32.0-x0*3.0*xyz-5.333333333333333/120.0*xyz^120.0+xy012^4.0*144.0/61.0*xyz^61.0+12.0/31.0*xyz^31.0+12.0/31.0*xyz^31.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^10.0*x0*0.0036730945821854912*xyz^121.0+x0^10.0*x0*0.003787878787878788*xyz^88.0-x0^10.0*x0/32.0*xyz^32.0-x0*3.0*xyz-0.04444444444444444*xyz^120.0+xy012^4.0*2.360655737704918*xyz^61.0+1.0/2.5833333333333335*xyz^31.0+1.0/2.5833333333333335*xyz^31.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^10.0*x0*53.333333333333336*xyz^119.0+x0^10.0*x0*29.0*xyz^86.0-x0^10.0*x0*31.0*xyz^30.0-x0*0.0-634.6666666666666*xyz^118.0+xy012^4.0*8640.0*xyz^59.0+360.0*xyz^29.0+360.0*xyz^29.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^10.0*x0*53.333333333333336*119.0*xyz^118.0+x0^10.0*x0*29.0*86.0*xyz^85.0-x0^10.0*x0*31.0*30.0*xyz^29.0-x0*0.0*0.0-634.6666666666666*118.0*xyz^117.0+xy012^4.0*8640.0*59.0*xyz^58.0+360.0*29.0*xyz^28.0+360.0*29.0*xyz^28.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^10.0*x0*6346.666666666667*xyz^118.0+x0^10.0*x0*2494.0*xyz^85.0-x0^10.0*x0*930.0*xyz^29.0-x0*0.0-74890.66666666666*xyz^117.0+xy012^4.0*509760.0*xyz^58.0+10440.0*xyz^28.0+10440.0*xyz^28.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^10.0*x0*0.0036730945821854912*xyz^121.0+x0^10.0*x0*0.003787878787878788*xyz^88.0-x0^10.0*x0/32.0*xyz^32.0-x0*3.0*xyz-0.04444444444444444*xyz^120.0+xy012^4.0*2.360655737704918*xyz^61.0+1.0/2.5833333333333335*xyz^31.0+1.0/2.5833333333333335*xyz^31.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^10.0*x0*0.0036730945821854912/122.0*xyz^122.0+x0^10.0*x0*0.003787878787878788/89.0*xyz^89.0-x0^10.0*x0/32.0/33.0*xyz^33.0-x0*3.0/2.0*xyz^2.0-0.04444444444444444/121.0*xyz^121.0+xy012^4.0*2.360655737704918/62.0*xyz^62.0+1.0/2.5833333333333335/32.0*xyz^32.0+1.0/2.5833333333333335/32.0*xyz^32.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^10.0*x0*3.0107332640864684E-5*xyz^122.0+x0^10.0*x0*4.256043581886279E-5*xyz^89.0-x0^10.0*x0*9.46969696969697E-4*xyz^33.0-x0*1.5*xyz^2.0-3.6730945821854906E-4*xyz^121.0+xy012^4.0/26.26388888888889*xyz^62.0+1.0/82.66666666666667*xyz^32.0+1.0/82.66666666666667*xyz^32.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^10.0*x0*6346.666666666667*xyz^118.0+x0^10.0*x0*2494.0*xyz^85.0-x0^10.0*x0*930.0*xyz^29.0-x0*0.0-74890.66666666666*xyz^117.0+xy012^4.0*509760.0*xyz^58.0+10440.0*xyz^28.0+10440.0*xyz^28.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^10.0*x0*6346.666666666667*118.0*xyz^117.0+x0^10.0*x0*2494.0*85.0*xyz^84.0-x0^10.0*x0*930.0*29.0*xyz^28.0-x0*0.0*0.0-74890.66666666666*117.0*xyz^116.0+xy012^4.0*509760.0*58.0*xyz^57.0+10440.0*28.0*xyz^27.0+10440.0*28.0*xyz^27.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^10.0*x0*748906.6666666667*xyz^117.0+x0^10.0*x0*211990.0*xyz^84.0-x0^10.0*x0*26970.0*xyz^28.0-x0*0.0-8762207.999999998*xyz^116.0+xy012^4.0*2.956608E7*xyz^57.0+292320.0*xyz^27.0+292320.0*xyz^27.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^10.0*x0*3.0107332640864684E-5*xyz^122.0-5.0*xyz^122.0+x0^10.0*x0*4.256043581886279E-5*xyz^89.0-5.0*xyz^89.0-x0^10.0*x0*9.46969696969697E-4*xyz^33.0-4.0*xyz^33.0-x0*1.5*xyz^2.0-3.6730945821854906E-4*xyz^121.0-4.0*xyz^121.0+xy012^4.0/26.26388888888889*xyz^62.0+1.0/82.66666666666667*xyz^32.0+1.0/82.66666666666667*xyz^32.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^10.0*x0*3.0107332640864684E-5/123.0*xyz^123.0-5.0/123.0*xyz^123.0+x0^10.0*x0*4.256043581886279E-5/90.0*xyz^90.0-5.0/90.0*xyz^90.0-x0^10.0*x0*9.46969696969697E-4/34.0*xyz^34.0-4.0/34.0*xyz^34.0-x0*1.5/3.0*xyz^3.0-3.6730945821854906E-4/122.0*xyz^122.0-4.0/122.0*xyz^122.0+xy012^4.0/26.26388888888889/63.0*xyz^63.0+1.0/82.66666666666667/33.0*xyz^33.0+1.0/82.66666666666667/33.0*xyz^33.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^10.0*x0/4085383.5*xyz^123.0-1.0/24.6*xyz^123.0-0.04065040650406504*xyz^123.0+x0^10.0*x0/2114640.0*xyz^90.0-1.0/18.0*xyz^90.0-0.05555555555555555*xyz^90.0-x0^10.0*x0/35904.0*xyz^34.0-1.0/8.5*xyz^34.0-0.11764705882352941*xyz^34.0-x0/2.0*xyz^3.0-1.0/332145.00000000006*xyz^122.0-1.0/30.5*xyz^122.0-0.03278688524590164*xyz^122.0+xy012^4.0/1654.625*xyz^63.0+1.0/2728.0*xyz^33.0+1.0/2728.0*xyz^33.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^10.0*x0*748906.6666666667*xyz^117.0+x0^10.0*x0*211990.0*xyz^84.0-x0^10.0*x0*26970.0*xyz^28.0-x0*0.0-8762207.999999998*xyz^116.0+xy012^4.0*2.956608E7*xyz^57.0+292320.0*xyz^27.0+292320.0*xyz^27.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^10.0*x0*748906.6666666667*117.0*xyz^116.0+x0^10.0*x0*211990.0*84.0*xyz^83.0-x0^10.0*x0*26970.0*28.0*xyz^27.0-x0*0.0*0.0-8762207.999999998*116.0*xyz^115.0+xy012^4.0*2.956608E7*57.0*xyz^56.0+292320.0*27.0*xyz^26.0+292320.0*27.0*xyz^26.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^10.0*x0*8.762208000000001E7*xyz^116.0+x0^10.0*x0*1.780716E7*xyz^83.0-x0^10.0*x0*755160.0*xyz^27.0-x0*0.0-1.0164161279999998E9*xyz^115.0+xy012^4.0*1.68526656E9*xyz^56.0+7892640.0*xyz^26.0+7892640.0*xyz^26.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^10.0*x0/4085383.5*xyz^123.0-1.0/24.6*xyz^123.0-0.04065040650406504*xyz^123.0+x0^10.0*x0/2114640.0*xyz^90.0-1.0/18.0*xyz^90.0-0.05555555555555555*xyz^90.0-x0^10.0*x0/35904.0*xyz^34.0-1.0/8.5*xyz^34.0-0.11764705882352941*xyz^34.0-x0/2.0*xyz^3.0-1.0/332145.00000000006*xyz^122.0-1.0/30.5*xyz^122.0-0.03278688524590164*xyz^122.0+xy012^4.0/1654.625*xyz^63.0+1.0/2728.0*xyz^33.0+1.0/2728.0*xyz^33.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^10.0*x0/4085383.5/124.0*xyz^124.0-1.0/24.6/124.0*xyz^124.0-0.04065040650406504/124.0*xyz^124.0+x0^10.0*x0/2114640.0/91.0*xyz^91.0-1.0/18.0/91.0*xyz^91.0-0.05555555555555555/91.0*xyz^91.0-x0^10.0*x0/35904.0/35.0*xyz^35.0-1.0/8.5/35.0*xyz^35.0-0.11764705882352941/35.0*xyz^35.0-x0/2.0/4.0*xyz^4.0-1.0/332145.00000000006/123.0*xyz^123.0-1.0/30.5/123.0*xyz^123.0-0.03278688524590164/123.0*xyz^123.0+xy012^4.0/1654.625/64.0*xyz^64.0+1.0/2728.0/34.0*xyz^34.0+1.0/2728.0/34.0*xyz^34.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^10.0*x0/5.06587554E8*xyz^124.0-1.0/3050.4*xyz^124.0-3.2782585890375033E-4*xyz^124.0+x0^10.0*x0/1.9243224E8*xyz^91.0-1.0/1638.0*xyz^91.0-6.105006105006105E-4*xyz^91.0-x0^10.0*x0/1256640.0*xyz^35.0-1.0/297.5*xyz^35.0-0.003361344537815126*xyz^35.0-x0/8.0*xyz^4.0-1.0/4.085383500000001E7*xyz^123.0-1.0/3751.5*xyz^123.0-2.665600426496068E-4*xyz^123.0+xy012^4.0/105896.0*xyz^64.0+1.0/92752.0*xyz^34.0+1.0/92752.0*xyz^34.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131326() {
 UsageCalculus.TestCase = 131326;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "4*xyza^1^9*-1*xyza^2^10/--3*xyza^31*x0^10/--3*x0-3*xyza^34*xyza^1^2*1*xyza^2^3/-3*xyza^3^4*-4*xyza^1^51*xyza^2^3/-3*xyza^3^4*-4*xyza^1^5-3*xy012^4*-4*xy012^54*xyza^1^51*xyza^2^6*+-3*xyza^3^7*4*xyza^1^8*-1*xyza^2^9-3*xyza^3^7*4*xyza^1^8*-1*xyza^2^94*xy012^8*-1*xy012^9";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=325 EqnNumber=26 FamilyID=3 MotifTag=4 Entropy=3 FuncWrapAliasID=4"+
"// MetaRow=[12, 26, 10, 15, 4, 3, 1, 10, 3, 4, 1, 1, 1, 2, 3, 2, 3, 2, 1, 2, 3, 11, 1, 2, 3, 4, 15, 2, 3, 13, 2, 24]"+
"// DOEMatrixRow=[2, 26, 20, 3, 1, 2, 3, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 8, 7, 2, 3, 2, 3, 1, 2, 3, 2, 1, 1, 10, 1]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^10.0*x0/2.25*xyza^53.0-x0^10.0*x0*xyza^31.0-x0*3.0-5.333333333333333*xyza^119.0+xy012^4.0*144.0*xyza^60.0+12.0*xyza^30.0-xy012^8.0*12.0*xyza^115.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^10.0*x0/2.25*53.0*xyza^52.0-x0^10.0*x0*31.0*xyza^30.0-x0*3.0*0.0-5.333333333333333*119.0*xyza^118.0+xy012^4.0*144.0*60.0*xyza^59.0+12.0*30.0*xyza^29.0-xy012^8.0*12.0*115.0*xyza^114.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^10.0*x0*23.555555555555557*xyza^52.0-x0^10.0*x0*31.0*xyza^30.0-x0*0.0-634.6666666666666*xyza^118.0+xy012^4.0*8640.0*xyza^59.0+360.0*xyza^29.0-xy012^8.0*1380.0*xyza^114.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^10.0*x0/2.25*xyza^53.0-x0^10.0*x0*xyza^31.0-x0*3.0-5.333333333333333*xyza^119.0+xy012^4.0*144.0*xyza^60.0+12.0*xyza^30.0-xy012^8.0*12.0*xyza^115.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^10.0*x0/2.25/54.0*xyza^54.0-x0^10.0*x0/32.0*xyza^32.0-x0*3.0*xyza-5.333333333333333/120.0*xyza^120.0+xy012^4.0*144.0/61.0*xyza^61.0+12.0/31.0*xyza^31.0-xy012^8.0*12.0/116.0*xyza^116.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^10.0*x0*0.00823045267489712*xyza^54.0-x0^10.0*x0/32.0*xyza^32.0-x0*3.0*xyza-0.04444444444444444*xyza^120.0+xy012^4.0*2.360655737704918*xyza^61.0+0.3870967741935484*xyza^31.0-xy012^8.0/9.666666666666666*xyza^116.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^10.0*x0*23.555555555555557*xyza^52.0-x0^10.0*x0*31.0*xyza^30.0-x0*0.0-634.6666666666666*xyza^118.0+xy012^4.0*8640.0*xyza^59.0+360.0*xyza^29.0-xy012^8.0*1380.0*xyza^114.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^10.0*x0*23.555555555555557*52.0*xyza^51.0-x0^10.0*x0*31.0*30.0*xyza^29.0-x0*0.0*0.0-634.6666666666666*118.0*xyza^117.0+xy012^4.0*8640.0*59.0*xyza^58.0+360.0*29.0*xyza^28.0-xy012^8.0*1380.0*114.0*xyza^113.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^10.0*x0*1224.888888888889*xyza^51.0-x0^10.0*x0*930.0*xyza^29.0-x0*0.0-74890.66666666666*xyza^117.0+xy012^4.0*509760.0*xyza^58.0+10440.0*xyza^28.0-xy012^8.0*157320.0*xyza^113.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^10.0*x0*0.00823045267489712*xyza^54.0-x0^10.0*x0/32.0*xyza^32.0-x0*3.0*xyza-0.04444444444444444*xyza^120.0+xy012^4.0*2.360655737704918*xyza^61.0+0.3870967741935484*xyza^31.0-xy012^8.0/9.666666666666666*xyza^116.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^10.0*x0*0.00823045267489712/55.0*xyza^55.0-x0^10.0*x0/32.0/33.0*xyza^33.0-x0*3.0/2.0*xyza^2.0-0.04444444444444444/121.0*xyza^121.0+xy012^4.0*2.360655737704918/62.0*xyza^62.0+0.3870967741935484/32.0*xyza^32.0-xy012^8.0*9.666666666666666/117.0*xyza^117.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^10.0*x0*1.4964459408903854E-4*xyza^55.0-x0^10.0*x0*9.46969696969697E-4*xyza^33.0-x0*1.5*xyza^2.0-3.6730945821854906E-4*xyza^121.0+xy012^4.0/26.26388888888889*xyza^62.0+0.012096774193548387*xyza^32.0-xy012^8.0/12.10344827586207*xyza^117.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^10.0*x0*1224.888888888889*xyza^51.0-x0^10.0*x0*930.0*xyza^29.0-x0*0.0-74890.66666666666*xyza^117.0+xy012^4.0*509760.0*xyza^58.0+10440.0*xyza^28.0-xy012^8.0*157320.0*xyza^113.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^10.0*x0*1224.888888888889*51.0*xyza^50.0-x0^10.0*x0*930.0*29.0*xyza^28.0-x0*0.0*0.0-74890.66666666666*117.0*xyza^116.0+xy012^4.0*509760.0*58.0*xyza^57.0+10440.0*28.0*xyza^27.0-xy012^8.0*157320.0*113.0*xyza^112.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^10.0*x0*62469.333333333336*xyza^50.0-x0^10.0*x0*26970.0*xyza^28.0-x0*0.0-8762207.999999998*xyza^116.0+xy012^4.0*2.956608E7*xyza^57.0+292320.0*xyza^27.0-xy012^8.0*1.777716E7*xyza^112.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^10.0*x0*1.4964459408903854E-4*xyza^55.0-4.0*xyza^55.0-x0^10.0*x0*9.46969696969697E-4*xyza^33.0-4.0*xyza^33.0-x0*1.5*xyza^2.0-3.6730945821854906E-4*xyza^121.0-4.0*xyza^121.0+xy012^4.0/26.26388888888889*xyza^62.0+0.012096774193548387*xyza^32.0-xy012^8.0/12.10344827586207*xyza^117.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^10.0*x0*1.4964459408903854E-4/56.0*xyza^56.0-4.0/56.0*xyza^56.0-x0^10.0*x0*9.46969696969697E-4/34.0*xyza^34.0-4.0/34.0*xyza^34.0-x0*1.5/3.0*xyza^3.0-3.6730945821854906E-4/122.0*xyza^122.0-4.0/122.0*xyza^122.0+xy012^4.0/26.26388888888889/63.0*xyza^63.0+0.012096774193548387/33.0*xyza^33.0-xy012^8.0*12.10344827586207/118.0*xyza^118.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^10.0*x0/374220.0*xyza^56.0-1.0/14.0*xyza^56.0-0.07142857142857142*xyza^56.0-x0^10.0*x0/35904.0*xyza^34.0-1.0/8.5*xyza^34.0-0.11764705882352941*xyza^34.0-x0/2.0*xyza^3.0-1.0/332145.00000000006*xyza^122.0-1.0/30.5*xyza^122.0-0.03278688524590164*xyza^122.0+xy012^4.0/1654.625*xyza^63.0+3.6656891495601173E-4*xyza^33.0-xy012^8.0/9.749287749287749*xyza^118.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^10.0*x0*62469.333333333336*xyza^50.0-x0^10.0*x0*26970.0*xyza^28.0-x0*0.0-8762207.999999998*xyza^116.0+xy012^4.0*2.956608E7*xyza^57.0+292320.0*xyza^27.0-xy012^8.0*1.777716E7*xyza^112.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^10.0*x0*62469.333333333336*50.0*xyza^49.0-x0^10.0*x0*26970.0*28.0*xyza^27.0-x0*0.0*0.0-8762207.999999998*116.0*xyza^115.0+xy012^4.0*2.956608E7*57.0*xyza^56.0+292320.0*27.0*xyza^26.0-0.0*112.0*xyza^111.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^10.0*x0*3123466.666666667*xyza^49.0-x0^10.0*x0*755160.0*xyza^27.0-x0*0.0-1.0164161279999998E9*xyza^115.0+xy012^4.0*1.68526656E9*xyza^56.0+7892640.0*xyza^26.0-0.0*xyza^111.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^10.0*x0/374220.0*xyza^56.0-1.0/14.0*xyza^56.0-0.07142857142857142*xyza^56.0-x0^10.0*x0/35904.0*xyza^34.0-1.0/8.5*xyza^34.0-0.11764705882352941*xyza^34.0-x0/2.0*xyza^3.0-1.0/332145.00000000006*xyza^122.0-1.0/30.5*xyza^122.0-0.03278688524590164*xyza^122.0+xy012^4.0/1654.625*xyza^63.0+3.6656891495601173E-4*xyza^33.0-4.0*xyza^33.0-xy012^8.0/9.749287749287749*xyza^118.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^10.0*x0/374220.0/57.0*xyza^57.0-1.0/14.0/57.0*xyza^57.0-0.07142857142857142/57.0*xyza^57.0-x0^10.0*x0/35904.0/35.0*xyza^35.0-1.0/8.5/35.0*xyza^35.0-0.11764705882352941/35.0*xyza^35.0-x0/2.0/4.0*xyza^4.0-1.0/332145.00000000006/123.0*xyza^123.0-1.0/30.5/123.0*xyza^123.0-0.03278688524590164/123.0*xyza^123.0+xy012^4.0/1654.625/64.0*xyza^64.0+3.6656891495601173E-4/34.0*xyza^34.0-4.0/34.0*xyza^34.0-xy012^8.0*9.749287749287749/119.0*xyza^119.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^10.0*x0/2.133054E7*xyza^57.0-1.0/798.0*xyza^57.0-0.0012531328320802004*xyza^57.0-x0^10.0*x0/1256640.0*xyza^35.0-1.0/297.5*xyza^35.0-0.003361344537815126*xyza^35.0-x0/8.0*xyza^4.0-1.0/4.085383500000001E7*xyza^123.0-1.0/3751.5*xyza^123.0-2.665600426496068E-4*xyza^123.0+xy012^4.0/105896.0*xyza^64.0+1.0/92752.0*xyza^34.0-1.0/8.5*xyza^34.0-0.11764705882352941*xyza^34.0-xy012^8.0/12.206019871420223*xyza^119.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131327() {
 UsageCalculus.TestCase = 131327;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x0^10/--3*x0-3*x^34*x^1^2*1*x^2^3/-3*x^3^4*-4*x^1^51*x^2^3/-3*x^3^4*-4*x^1^5-3*xy012^4*-4*xy012^54*x^1^51*x^2^6*+-3*x^3^7*4*x^1^8*-1*x^2^9-3*x^3^7*4*x^1^8*-1*x^2^94*xy012^8*-1*xy012^91*x^2^9";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=326 EqnNumber=27 FamilyID=1 MotifTag=1 Entropy=4 FuncWrapAliasID=1"+
"// MetaRow=[12, 27, 10, 14, 1, 1, 2, 1, 1, 1, 2, 1, 2, 3, 4, 3, 1, 1, 2, 3, 4, 12, 2, 3, 1, 1, 16, 3, 4, 14, 3, 25]"+
"// DOEMatrixRow=[2, 27, 20, 2, 3, 1, 1, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 9, 8, 3, 1, 3, 1, 2, 3, 4, 3, 2, 3, 11, 2]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "1.0/3.0-3.0-5.333333333333333*x^119.0+144.0*x^60.0+12.0*x^30.0-12.0*x^126.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0-3.0*0.0-5.333333333333333*119.0*x^118.0+144.0*60.0*x^59.0+12.0*30.0*x^29.0-12.0*126.0*x^125.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-634.6666666666666*x^118.0+8640.0*x^59.0+360.0*x^29.0-1512.0*x^125.0";
 UsageCalculus.EqnSolArrayMap3[1] = "1.0/3.0-3.0-5.333333333333333*x^119.0+144.0*x^60.0+12.0*x^30.0-12.0*x^126.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0/3.0*x-3.0/120.0*x^120.0+144.0/61.0*x^61.0+12.0/31.0*x^31.0-12.0/127.0*x^127.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/3.0*x-1.0/40.0*x^120.0+2.360655737704918*x^61.0+1.0/2.5833333333333335*x^31.0-1.0/10.583333333333334*x^127.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-634.6666666666666*x^118.0+8640.0*x^59.0+360.0*x^29.0-1512.0*x^125.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-634.6666666666666*118.0*x^117.0+8640.0*59.0*x^58.0+360.0*29.0*x^28.0-1512.0*125.0*x^124.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-74890.66666666666*x^117.0+509760.0*x^58.0+10440.0*x^28.0-189000.0*x^124.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/3.0*x-1.0/40.0*x^120.0+2.360655737704918*x^61.0+1.0/2.5833333333333335*x^31.0-1.0/10.583333333333334*x^127.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/3.0*x-1.0/40.0/121.0*x^121.0+2.360655737704918/62.0*x^62.0+1.0/2.5833333333333335/32.0*x^32.0-1.0/10.583333333333334/128.0*x^128.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/3.0*x-1.0/4840.0*x^121.0+1.0/26.26388888888889*x^62.0+1.0/82.66666666666667*x^32.0-1.0/1354.6666666666667*x^128.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-74890.66666666666*x^117.0+509760.0*x^58.0+10440.0*x^28.0-189000.0*x^124.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-74890.66666666666*117.0*x^116.0+509760.0*58.0*x^57.0+10440.0*28.0*x^27.0-189000.0*124.0*x^123.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-8762207.999999998*x^116.0+2.956608E7*x^57.0+292320.0*x^27.0-2.3436E7*x^123.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/3.0*x-1.0/4840.0*x^121.0+1.0/26.26388888888889*x^62.0+1.0/82.66666666666667*x^32.0-1.0/1354.6666666666667*x^128.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/3.0*x-1.0/4840.0/122.0*x^122.0+1.0/26.26388888888889/63.0*x^63.0+1.0/82.66666666666667/33.0*x^33.0-1.0/1354.6666666666667/129.0*x^129.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/3.0*x-1.0/590480.0*x^122.0+1.0/1654.625*x^63.0+1.0/2728.0*x^33.0-1.0/174752.0*x^129.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-8762207.999999998*x^116.0+2.956608E7*x^57.0+292320.0*x^27.0-2.3436E7*x^123.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-8762207.999999998*116.0*x^115.0+57.0*x^56.0+292320.0*27.0*x^26.0-0.0*123.0*x^122.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1.0164161279999998E9*x^115.0+57.0*x^56.0+7892640.0*x^26.0-0.0*x^122.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/3.0*x-1.0/590480.0*x^122.0+1.0/1654.625*x^63.0+1.0/2728.0*x^33.0-1.0/174752.0*x^129.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/3.0*x-1.0/590480.0/123.0*x^123.0+1.0/1654.625/64.0*x^64.0+1.0/2728.0/34.0*x^34.0-1.0/174752.0/130.0*x^130.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/3.0*x-1.0/7.262904E7*x^123.0+1.0/105896.0*x^64.0+1.0/92752.0*x^34.0-1.0/2.271776E7*x^130.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131328() {
 UsageCalculus.TestCase = 131328;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xy^34*xy^1^2*1*xy^2^3/-3*xy^3^4*-4*xy^1^51*xy^2^3/-3*xy^3^4*-4*xy^1^5-3*xy012^4*-4*xy012^54*xy^1^51*xy^2^6*+-3*xy^3^7*4*xy^1^8*-1*xy^2^9-3*xy^3^7*4*xy^1^8*-1*xy^2^94*xy012^8*-1*xy012^91*xy^2^9-3*xy^3^10*+4*xy^1*1*xy^2^2/-3*xy^3^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=327 EqnNumber=28 FamilyID=2 MotifTag=3 Entropy=1 FuncWrapAliasID=3"+
"// MetaRow=[12, 28, 10, 13, 2, 3, 1, 2, 3, 2, 3, 2, 3, 1, 1, 1, 2, 1, 3, 1, 1, 13, 3, 1, 2, 3, 1, 1, 1, 15, 4, 26]"+
"// DOEMatrixRow=[2, 28, 20, 1, 2, 3, 2, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 10, 9, 1, 2, 4, 2, 3, 4, 1, 1, 3, 4, 12, 1]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-5.333333333333333*xy^119.0+144.0*xy^60.0+12.0*xy^30.0-12.0*xy^126.0+4.0*xy^24.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-5.333333333333333*119.0*xy^118.0+144.0*60.0*xy^59.0+12.0*30.0*xy^29.0-12.0*126.0*xy^125.0+4.0*24.0*xy^23.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-634.6666666666666*xy^118.0+8640.0*xy^59.0+360.0*xy^29.0-1512.0*xy^125.0+96.0*xy^23.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-5.333333333333333*xy^119.0+144.0*xy^60.0+12.0*xy^30.0-12.0*xy^126.0+4.0*xy^24.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-5.333333333333333/120.0*xy^120.0+144.0/61.0*xy^61.0+12.0/31.0*xy^31.0-12.0/127.0*xy^127.0+4.0/25.0*xy^25.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/22.5*xy^120.0+2.360655737704918*xy^61.0+1.0/2.5833333333333335*xy^31.0-1.0/10.583333333333334*xy^127.0+1.0/6.25*xy^25.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-634.6666666666666*xy^118.0+8640.0*xy^59.0+360.0*xy^29.0-1512.0*xy^125.0+96.0*xy^23.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-634.6666666666666*118.0*xy^117.0+8640.0*59.0*xy^58.0+360.0*29.0*xy^28.0-1512.0*125.0*xy^124.0+96.0*23.0*xy^22.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-74890.66666666666*xy^117.0+509760.0*xy^58.0+10440.0*xy^28.0-189000.0*xy^124.0+2208.0*xy^22.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/22.5*xy^120.0+2.360655737704918*xy^61.0+1.0/2.5833333333333335*xy^31.0-1.0/10.583333333333334*xy^127.0+1.0/6.25*xy^25.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/22.5/121.0*xy^121.0+2.360655737704918/62.0*xy^62.0+1.0/2.5833333333333335/32.0*xy^32.0-1.0/10.583333333333334/128.0*xy^128.0+1.0/6.25/26.0*xy^26.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/2722.5*xy^121.0+1.0/26.26388888888889*xy^62.0+1.0/82.66666666666667*xy^32.0-1.0/1354.6666666666667*xy^128.0+1.0/162.5*xy^26.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-74890.66666666666*xy^117.0+509760.0*xy^58.0+10440.0*xy^28.0-189000.0*xy^124.0+2208.0*xy^22.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-74890.66666666666*117.0*xy^116.0+509760.0*58.0*xy^57.0+10440.0*28.0*xy^27.0-189000.0*124.0*xy^123.0+2208.0*22.0*xy^21.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-8762207.999999998*xy^116.0+2.956608E7*xy^57.0+292320.0*xy^27.0-2.3436E7*xy^123.0+48576.0*xy^21.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/2722.5*xy^121.0+1.0/26.26388888888889*xy^62.0+1.0/82.66666666666667*xy^32.0-1.0/1354.6666666666667*xy^128.0+1.0/162.5*xy^26.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/2722.5/122.0*xy^122.0+1.0/26.26388888888889/63.0*xy^63.0+1.0/82.66666666666667/33.0*xy^33.0-1.0/1354.6666666666667/129.0*xy^129.0+1.0/162.5/27.0*xy^27.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/332145.0*xy^122.0+1.0/1654.625*xy^63.0+1.0/2728.0*xy^33.0-1.0/174752.0*xy^129.0+1.0/4387.5*xy^27.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-8762207.999999998*xy^116.0+2.956608E7*xy^57.0+292320.0*xy^27.0-2.3436E7*xy^123.0+48576.0*xy^21.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-8762207.999999998*116.0*xy^115.0+57.0*xy^56.0+292320.0*27.0*xy^26.0-123.0*xy^122.0+48576.0*21.0*xy^20.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1.0164161279999998E9*xy^115.0+57.0*xy^56.0+7892640.0*xy^26.0-123.0*xy^122.0+1020096.0*xy^20.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/332145.0*xy^122.0+1.0/1654.625*xy^63.0+1.0/2728.0*xy^33.0-1.0/174752.0*xy^129.0+1.0/4387.5*xy^27.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/332145.0/123.0*xy^123.0+1.0/1654.625/64.0*xy^64.0+1.0/2728.0/34.0*xy^34.0-1.0/174752.0/130.0*xy^130.0+1.0/4387.5/28.0*xy^28.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/4.0853835E7*xy^123.0+1.0/105896.0*xy^64.0+1.0/92752.0*xy^34.0-1.0/2.271776E7*xy^130.0+1.0/122850.0*xy^28.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131329() {
 UsageCalculus.TestCase = 131329;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "4*xyz^1^2*1*xyz^2^3/-3*xyz^3^4*-4*xyz^1^51*xyz^2^3/-3*xyz^3^4*-4*xyz^1^5-3*xy012^4*-4*xy012^54*xyz^1^51*xyz^2^6*+-3*xyz^3^7*4*xyz^1^8*-1*xyz^2^9-3*xyz^3^7*4*xyz^1^8*-1*xyz^2^94*xy012^8*-1*xy012^91*xyz^2^9-3*xyz^3^10*+4*xyz^1*1*xyz^2^2/-3*xyz^3^34*x0*1*x0^2/-3*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=328 EqnNumber=29 FamilyID=3 MotifTag=4 Entropy=2 FuncWrapAliasID=4"+
"// MetaRow=[12, 29, 10, 12, 3, 1, 2, 3, 1, 3, 4, 1, 1, 2, 3, 2, 3, 2, 4, 2, 3, 14, 1, 2, 3, 4, 2, 3, 2, 16, 1, 27]"+
"// DOEMatrixRow=[2, 29, 20, 4, 3, 1, 3, 2, 3, 2, 3, 2, 3, 1, 1, 3, 1, 11, 10, 2, 3, 5, 3, 1, 5, 2, 3, 1, 1, 13, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "7.111111111111111*xyz^85.0+xy012^4.0*144.0*xyz^60.0+12.0*xyz^30.0-xy012^8.0*12.0*xyz^126.0-x0*1.3333333333333333*xyz^55.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "7.111111111111111*85.0*xyz^84.0+xy012^4.0*144.0*60.0*xyz^59.0+12.0*30.0*xyz^29.0-xy012^8.0*12.0*126.0*xyz^125.0-x0*1.3333333333333333*55.0*xyz^54.0";
 UsageCalculus.EqnSolArrayMap2[1] = "604.4444444444445*xyz^84.0+xy012^4.0*8640.0*xyz^59.0+360.0*xyz^29.0-xy012^8.0*1512.0*xyz^125.0-x0*73.33333333333333*xyz^54.0";
 UsageCalculus.EqnSolArrayMap3[1] = "7.111111111111111*xyz^85.0+xy012^4.0*144.0*xyz^60.0+12.0*xyz^30.0-xy012^8.0*12.0*xyz^126.0-x0*1.3333333333333333*xyz^55.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "7.111111111111111/86.0*xyz^86.0+xy012^4.0*144.0/61.0*xyz^61.0+12.0/31.0*xyz^31.0-xy012^8.0*12.0/127.0*xyz^127.0-x0*1.3333333333333333/56.0*xyz^56.0";
 UsageCalculus.EqnSolArrayMap4[1] = "0.08268733850129198*xyz^86.0+xy012^4.0*2.360655737704918*xyz^61.0+0.3870967741935484*xyz^31.0-xy012^8.0*0.09448818897637795*xyz^127.0-x0/42.0*xyz^56.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "604.4444444444445*xyz^84.0+xy012^4.0*8640.0*xyz^59.0+360.0*xyz^29.0-xy012^8.0*1512.0*xyz^125.0-x0*73.33333333333333*xyz^54.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "604.4444444444445*84.0*xyz^83.0+xy012^4.0*8640.0*59.0*xyz^58.0+360.0*29.0*xyz^28.0-xy012^8.0*1512.0*125.0*xyz^124.0-x0*73.33333333333333*54.0*xyz^53.0";
 UsageCalculus.EqnSolArrayMap2[2] = "50773.333333333336*xyz^83.0+xy012^4.0*509760.0*xyz^58.0+10440.0*xyz^28.0-xy012^8.0*189000.0*xyz^124.0-x0*3959.9999999999995*xyz^53.0";
 UsageCalculus.EqnSolArrayMap3[2] = "0.08268733850129198*xyz^86.0+xy012^4.0*2.360655737704918*xyz^61.0+0.3870967741935484*xyz^31.0-xy012^8.0*0.09448818897637795*xyz^127.0-x0/42.0*xyz^56.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "0.08268733850129198/87.0*xyz^87.0+xy012^4.0*2.360655737704918/62.0*xyz^62.0+0.3870967741935484/32.0*xyz^32.0-xy012^8.0*0.09448818897637795/128.0*xyz^128.0-x0*42.0/57.0*xyz^57.0";
 UsageCalculus.EqnSolArrayMap4[2] = "9.504291781757699E-4*xyz^87.0+xy012^4.0/26.26388888888889*xyz^62.0+0.012096774193548387*xyz^32.0-xy012^8.0*7.381889763779527E-4*xyz^128.0-x0/1.3571428571428572*xyz^57.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "50773.333333333336*xyz^83.0+xy012^4.0*509760.0*xyz^58.0+10440.0*xyz^28.0-xy012^8.0*189000.0*xyz^124.0-x0*3959.9999999999995*xyz^53.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "50773.333333333336*83.0*xyz^82.0+xy012^4.0*509760.0*58.0*xyz^57.0+10440.0*28.0*xyz^27.0-xy012^8.0*189000.0*124.0*xyz^123.0-x0*3959.9999999999995*53.0*xyz^52.0";
 UsageCalculus.EqnSolArrayMap2[3] = "4214186.666666667*xyz^82.0+xy012^4.0*2.956608E7*xyz^57.0+292320.0*xyz^27.0-xy012^8.0*2.3436E7*xyz^123.0-x0*209879.99999999997*xyz^52.0";
 UsageCalculus.EqnSolArrayMap3[3] = "9.504291781757699E-4*xyz^87.0-4.0*xyz^87.0+xy012^4.0/26.26388888888889*xyz^62.0+0.012096774193548387*xyz^32.0-xy012^8.0*7.381889763779527E-4*xyz^128.0-4.0*xyz^128.0-x0/1.3571428571428572*xyz^57.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "9.504291781757699E-4/88.0*xyz^88.0-4.0/88.0*xyz^88.0+xy012^4.0/26.26388888888889/63.0*xyz^63.0+0.012096774193548387/33.0*xyz^33.0-xy012^8.0*7.381889763779527E-4/129.0*xyz^129.0-4.0/129.0*xyz^129.0-x0*1.3571428571428572/58.0*xyz^58.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/92589.75000000001*xyz^88.0-1.0/22.0*xyz^88.0-0.045454545454545456*xyz^88.0+xy012^4.0/1654.625*xyz^63.0+3.6656891495601173E-4*xyz^33.0-xy012^8.0/174752.0*xyz^129.0-1.0/32.25*xyz^129.0-0.031007751937984496*xyz^129.0-x0/42.73684210526316*xyz^58.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "4214186.666666667*xyz^82.0+xy012^4.0*2.956608E7*xyz^57.0+292320.0*xyz^27.0-xy012^8.0*2.3436E7*xyz^123.0-x0*209879.99999999997*xyz^52.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "4214186.666666667*82.0*xyz^81.0+xy012^4.0*2.956608E7*57.0*xyz^56.0+292320.0*27.0*xyz^26.0-xy012^8.0*2.3436E7*123.0*xyz^122.0-x0*209879.99999999997*52.0*xyz^51.0";
 UsageCalculus.EqnSolArrayMap2[4] = "3.455633066666667E8*xyz^81.0+xy012^4.0*1.68526656E9*xyz^56.0+7892640.0*xyz^26.0-xy012^8.0*2.882628E9*xyz^122.0-x0*1.0913759999999998E7*xyz^51.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/92589.75000000001*xyz^88.0-1.0/22.0*xyz^88.0-0.045454545454545456*xyz^88.0+xy012^4.0/1654.625*xyz^63.0+3.6656891495601173E-4*xyz^33.0-4.0*xyz^33.0-xy012^8.0/174752.0*xyz^129.0-1.0/32.25*xyz^129.0-0.031007751937984496*xyz^129.0-x0/42.73684210526316*xyz^58.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/92589.75000000001/89.0*xyz^89.0-1.0/22.0/89.0*xyz^89.0-0.045454545454545456/89.0*xyz^89.0+xy012^4.0/1654.625/64.0*xyz^64.0+3.6656891495601173E-4/34.0*xyz^34.0-4.0/34.0*xyz^34.0-xy012^8.0/174752.0/130.0*xyz^130.0-1.0/32.25/130.0*xyz^130.0-0.031007751937984496/130.0*xyz^130.0-x0*42.73684210526316/59.0*xyz^59.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/8240487.750000001*xyz^89.0-1.0/1958.0*xyz^89.0-5.107252298263534E-4*xyz^89.0+xy012^4.0/105896.0*xyz^64.0+1.0/92752.0*xyz^34.0-1.0/8.5*xyz^34.0-0.11764705882352941*xyz^34.0-xy012^8.0/2.271776E7*xyz^130.0-1.0/4192.5*xyz^130.0-2.385211687537269E-4*xyz^130.0-x0/1.3805418719211824*xyz^59.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131330() {
 UsageCalculus.TestCase = 131330;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xyza^2^3/-3*xyza^3^4*-4*xyza^1^5-3*xy012^4*-4*xy012^54*xyza^1^51*xyza^2^6*+-3*xyza^3^7*4*xyza^1^8*-1*xyza^2^9-3*xyza^3^7*4*xyza^1^8*-1*xyza^2^94*xy012^8*-1*xy012^91*xyza^2^9-3*xyza^3^10*+4*xyza^1*1*xyza^2^2/-3*xyza^3^34*x0*1*x0^2/-3*x0^31*xyza^2^2/-3*xyza^3^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=329 EqnNumber=30 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[12, 30, 10, 11, 4, 2, 3, 4, 2, 4, 1, 2, 3, 1, 4, 3, 1, 1, 5, 3, 4, 15, 2, 3, 1, 1, 3, 1, 3, 1, 2, 28]"+
"// DOEMatrixRow=[2, 30, 20, 3, 1, 2, 1, 3, 1, 3, 4, 1, 1, 2, 3, 1, 2, 12, 1, 3, 1, 1, 1, 2, 6, 3, 1, 2, 3, 14, 1]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "1.3333333333333333*xyza^18.0+xy012^4.0*144.0*xyza^60.0+12.0*xyza^30.0-xy012^8.0*12.0*xyza^126.0+x0/2.25*xyza^65.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "1.3333333333333333*18.0*xyza^17.0+xy012^4.0*144.0*60.0*xyza^59.0+12.0*30.0*xyza^29.0-xy012^8.0*12.0*126.0*xyza^125.0+x0/2.25*65.0*xyza^64.0";
 UsageCalculus.EqnSolArrayMap2[1] = "24.0*xyza^17.0+xy012^4.0*8640.0*xyza^59.0+360.0*xyza^29.0-xy012^8.0*1512.0*xyza^125.0+x0*28.88888888888889*xyza^64.0";
 UsageCalculus.EqnSolArrayMap3[1] = "1.3333333333333333*xyza^18.0+xy012^4.0*144.0*xyza^60.0+12.0*xyza^30.0-xy012^8.0*12.0*xyza^126.0+x0/2.25*xyza^65.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.3333333333333333/19.0*xyza^19.0+xy012^4.0*144.0/61.0*xyza^61.0+12.0/31.0*xyza^31.0-xy012^8.0*12.0/127.0*xyza^127.0+x0*2.25/66.0*xyza^66.0";
 UsageCalculus.EqnSolArrayMap4[1] = "0.07017543859649122*xyza^19.0+xy012^4.0*2.360655737704918*xyza^61.0+0.3870967741935484*xyza^31.0-xy012^8.0*0.09448818897637795*xyza^127.0+x0/29.333333333333332*xyza^66.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "24.0*xyza^17.0+xy012^4.0*8640.0*xyza^59.0+360.0*xyza^29.0-xy012^8.0*1512.0*xyza^125.0+x0*28.88888888888889*xyza^64.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "24.0*17.0*xyza^16.0+xy012^4.0*8640.0*59.0*xyza^58.0+360.0*29.0*xyza^28.0-xy012^8.0*1512.0*125.0*xyza^124.0+x0*28.88888888888889*64.0*xyza^63.0";
 UsageCalculus.EqnSolArrayMap2[2] = "408.0*xyza^16.0+xy012^4.0*509760.0*xyza^58.0+10440.0*xyza^28.0-xy012^8.0*189000.0*xyza^124.0+x0*1848.888888888889*xyza^63.0";
 UsageCalculus.EqnSolArrayMap3[2] = "0.07017543859649122*xyza^19.0+xy012^4.0*2.360655737704918*xyza^61.0+0.3870967741935484*xyza^31.0-xy012^8.0*0.09448818897637795*xyza^127.0+x0/29.333333333333332*xyza^66.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "0.07017543859649122/20.0*xyza^20.0+xy012^4.0*2.360655737704918/62.0*xyza^62.0+0.3870967741935484/32.0*xyza^32.0-xy012^8.0*0.09448818897637795/128.0*xyza^128.0+x0*29.333333333333332/67.0*xyza^67.0";
 UsageCalculus.EqnSolArrayMap4[2] = "0.003508771929824561*xyza^20.0+xy012^4.0/26.26388888888889*xyza^62.0+0.012096774193548387*xyza^32.0-xy012^8.0*7.381889763779527E-4*xyza^128.0+x0/2.284090909090909*xyza^67.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "408.0*xyza^16.0+xy012^4.0*509760.0*xyza^58.0+10440.0*xyza^28.0-xy012^8.0*189000.0*xyza^124.0+x0*1848.888888888889*xyza^63.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "408.0*16.0*xyza^15.0+xy012^4.0*509760.0*58.0*xyza^57.0+10440.0*28.0*xyza^27.0-xy012^8.0*189000.0*124.0*xyza^123.0+x0*1848.888888888889*63.0*xyza^62.0";
 UsageCalculus.EqnSolArrayMap2[3] = "6528.0*xyza^15.0+xy012^4.0*2.956608E7*xyza^57.0+292320.0*xyza^27.0-xy012^8.0*2.3436E7*xyza^123.0+x0*116480.0*xyza^62.0";
 UsageCalculus.EqnSolArrayMap3[3] = "0.003508771929824561*xyza^20.0+xy012^4.0/26.26388888888889*xyza^62.0+0.012096774193548387*xyza^32.0-xy012^8.0*7.381889763779527E-4*xyza^128.0-4.0*xyza^128.0+x0/2.284090909090909*xyza^67.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "0.003508771929824561/21.0*xyza^21.0+xy012^4.0/26.26388888888889/63.0*xyza^63.0+0.012096774193548387/33.0*xyza^33.0-xy012^8.0*7.381889763779527E-4/129.0*xyza^129.0-4.0/129.0*xyza^129.0+x0*2.284090909090909/68.0*xyza^68.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.6708437761069338E-4*xyza^21.0+xy012^4.0/1654.625*xyza^63.0+3.6656891495601173E-4*xyza^33.0-xy012^8.0/174752.0*xyza^129.0-1.0/32.25*xyza^129.0-0.031007751937984496*xyza^129.0+x0/29.771144278606965*xyza^68.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "6528.0*xyza^15.0+xy012^4.0*2.956608E7*xyza^57.0+292320.0*xyza^27.0-xy012^8.0*2.3436E7*xyza^123.0+x0*116480.0*xyza^62.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "6528.0*15.0*xyza^14.0+xy012^4.0*2.956608E7*57.0*xyza^56.0+292320.0*27.0*xyza^26.0-xy012^8.0*2.3436E7*123.0*xyza^122.0+x0*116480.0*62.0*xyza^61.0";
 UsageCalculus.EqnSolArrayMap2[4] = "97920.0*xyza^14.0+xy012^4.0*1.68526656E9*xyza^56.0+7892640.0*xyza^26.0-xy012^8.0*2.882628E9*xyza^122.0+x0*7221760.0*xyza^61.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.6708437761069338E-4*xyza^21.0-4.0*xyza^21.0+xy012^4.0/1654.625*xyza^63.0+3.6656891495601173E-4*xyza^33.0-4.0*xyza^33.0-xy012^8.0/174752.0*xyza^129.0-1.0/32.25*xyza^129.0-0.031007751937984496*xyza^129.0+x0/29.771144278606965*xyza^68.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.6708437761069338E-4/22.0*xyza^22.0-4.0/22.0*xyza^22.0+xy012^4.0/1654.625/64.0*xyza^64.0+3.6656891495601173E-4/34.0*xyza^34.0-4.0/34.0*xyza^34.0-xy012^8.0/174752.0/130.0*xyza^130.0-1.0/32.25/130.0*xyza^130.0-0.031007751937984496/130.0*xyza^130.0+x0*29.771144278606965/69.0*xyza^69.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/131670.00000000003*xyza^22.0-1.0/5.5*xyza^22.0-0.18181818181818182*xyza^22.0+xy012^4.0/105896.0*xyza^64.0+1.0/92752.0*xyza^34.0-1.0/8.5*xyza^34.0-0.11764705882352941*xyza^34.0-xy012^8.0/2.271776E7*xyza^130.0-1.0/4192.5*xyza^130.0-2.385211687537269E-4*xyza^130.0+x0/2.3176804812834226*xyza^69.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131331() {
 UsageCalculus.TestCase = 131331;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xy012^4*-4*xy012^54*x^1^51*x^2^6*+-3*x^3^7*4*x^1^8*-1*x^2^9-3*x^3^7*4*x^1^8*-1*x^2^94*xy012^8*-1*xy012^91*x^2^9-3*x^3^10*+4*x^1*1*x^2^2/-3*x^3^34*x0*1*x0^2/-3*x0^31*x^2^2/-3*x^3^3-3*x^3^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=330 EqnNumber=31 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[12, 31, 10, 10, 1, 3, 1, 5, 3, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 16, 3, 1, 2, 3, 4, 2, 4, 2, 3, 29]"+
"// DOEMatrixRow=[2, 31, 20, 2, 1, 3, 2, 4, 2, 4, 1, 2, 3, 1, 4, 2, 3, 13, 2, 1, 2, 3, 2, 3, 1, 4, 2, 3, 4, 15, 2]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "144.0*x^60.0+12.0*x^30.0-12.0*x^126.0+1.0/2.25*x^65.0-3.0*x^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "144.0*60.0*x^59.0+12.0*30.0*x^29.0-12.0*126.0*x^125.0+1.0/2.25*65.0*x^64.0-3.0*6.0*x^5.0";
 UsageCalculus.EqnSolArrayMap2[1] = "8640.0*x^59.0+360.0*x^29.0-1512.0*x^125.0+28.88888888888889*x^64.0-18.0*x^5.0";
 UsageCalculus.EqnSolArrayMap3[1] = "144.0*x^60.0+12.0*x^30.0-12.0*x^126.0+1.0/2.25*x^65.0-3.0*x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "144.0/61.0*x^61.0+12.0/31.0*x^31.0-12.0/127.0*x^127.0+1.0/2.25/66.0*x^66.0-3.0/7.0*x^7.0";
 UsageCalculus.EqnSolArrayMap4[1] = "2.360655737704918*x^61.0+1.0/2.5833333333333335*x^31.0-1.0/10.583333333333334*x^127.0+1.0/148.5*x^66.0-1.0/2.3333333333333335*x^7.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "8640.0*x^59.0+360.0*x^29.0-1512.0*x^125.0+28.88888888888889*x^64.0-18.0*x^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "8640.0*59.0*x^58.0+360.0*29.0*x^28.0-1512.0*125.0*x^124.0+28.88888888888889*64.0*x^63.0-18.0*5.0*x^4.0";
 UsageCalculus.EqnSolArrayMap2[2] = "509760.0*x^58.0+10440.0*x^28.0-189000.0*x^124.0+1848.888888888889*x^63.0-90.0*x^4.0";
 UsageCalculus.EqnSolArrayMap3[2] = "2.360655737704918*x^61.0+1.0/2.5833333333333335*x^31.0-1.0/10.583333333333334*x^127.0+1.0/148.5*x^66.0-1.0/2.3333333333333335*x^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "2.360655737704918/62.0*x^62.0+1.0/2.5833333333333335/32.0*x^32.0-1.0/10.583333333333334/128.0*x^128.0+1.0/148.5/67.0*x^67.0-1.0/2.3333333333333335/8.0*x^8.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/26.26388888888889*x^62.0+1.0/82.66666666666667*x^32.0-1.0/1354.6666666666667*x^128.0+1.0/9949.5*x^67.0-1.0/18.666666666666668*x^8.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "509760.0*x^58.0+10440.0*x^28.0-189000.0*x^124.0+1848.888888888889*x^63.0-90.0*x^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "509760.0*58.0*x^57.0+10440.0*28.0*x^27.0-189000.0*124.0*x^123.0+1848.888888888889*63.0*x^62.0-90.0*4.0*x^3.0";
 UsageCalculus.EqnSolArrayMap2[3] = "2.956608E7*x^57.0+292320.0*x^27.0-2.3436E7*x^123.0+116480.0*x^62.0-360.0*x^3.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/26.26388888888889*x^62.0+1.0/82.66666666666667*x^32.0-1.0/1354.6666666666667*x^128.0+1.0/9949.5*x^67.0-1.0/18.666666666666668*x^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/26.26388888888889/63.0*x^63.0+1.0/82.66666666666667/33.0*x^33.0-1.0/1354.6666666666667/129.0*x^129.0+1.0/9949.5/68.0*x^68.0-1.0/18.666666666666668/9.0*x^9.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/1654.625*x^63.0+1.0/2728.0*x^33.0-1.0/174752.0*x^129.0+1.0/676566.0*x^68.0-1.0/168.0*x^9.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "2.956608E7*x^57.0+292320.0*x^27.0-2.3436E7*x^123.0+116480.0*x^62.0-360.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "57.0*x^56.0+292320.0*27.0*x^26.0-123.0*x^122.0+116480.0*62.0*x^61.0-360.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[4] = "57.0*x^56.0+7892640.0*x^26.0-123.0*x^122.0+7221760.0*x^61.0-1080.0*x^2.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/1654.625*x^63.0+1.0/2728.0*x^33.0-1.0/174752.0*x^129.0+1.0/676566.0*x^68.0-1.0/168.0*x^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/1654.625/64.0*x^64.0+1.0/2728.0/34.0*x^34.0-1.0/174752.0/130.0*x^130.0+1.0/676566.0/69.0*x^69.0-1.0/168.0/10.0*x^10.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/105896.0*x^64.0+1.0/92752.0*x^34.0-1.0/2.271776E7*x^130.0+1.0/4.6683054E7*x^69.0-1.0/1680.0*x^10.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131332() {
 UsageCalculus.TestCase = 131332;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "4*xy^1^51*xy^2^6*+-3*xy^3^7*4*xy^1^8*-1*xy^2^9-3*xy^3^7*4*xy^1^8*-1*xy^2^94*xy012^8*-1*xy012^91*xy^2^9-3*xy^3^10*+4*xy^1*1*xy^2^2/-3*xy^3^34*x0*1*x0^2/-3*x0^31*xy^2^2/-3*xy^3^3-3*xy^3^34*x0^4/-1*x0^5*+-3*x0^6*4*x0^7";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=331 EqnNumber=32 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[12, 32, 10, 9, 2, 1, 2, 6, 1, 2, 3, 2, 3, 1, 2, 3, 1, 2, 3, 2, 3, 1, 1, 2, 3, 4, 5, 3, 1, 3, 4, 30]"+
"// DOEMatrixRow=[2, 32, 20, 1, 3, 1, 3, 5, 3, 1, 2, 1, 1, 2, 1, 3, 1, 14, 3, 2, 3, 4, 3, 1, 2, 1, 3, 1, 1, 16, 1]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "48.0*xy^60.0+12.0*xy^30.0-12.0*xy^126.0+x0/2.25*xy^65.0+x0^4.0*36.0*xy^37.0-x0^6.0*12.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "48.0*60.0*xy^59.0+12.0*30.0*xy^29.0-12.0*126.0*xy^125.0+x0/2.25*65.0*xy^64.0+x0^4.0*36.0*37.0*xy^36.0-x0^6.0*12.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "2880.0*xy^59.0+360.0*xy^29.0-1512.0*xy^125.0+x0*28.88888888888889*xy^64.0+x0^4.0*1332.0*xy^36.0-x0^6.0*0.0";
 UsageCalculus.EqnSolArrayMap3[1] = "48.0*xy^60.0+12.0*xy^30.0-12.0*xy^126.0+x0/2.25*xy^65.0+x0^4.0*36.0*xy^37.0-x0^6.0*12.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "48.0/61.0*xy^61.0+12.0/31.0*xy^31.0-12.0/127.0*xy^127.0+x0/2.25/66.0*xy^66.0+x0^4.0*36.0/38.0*xy^38.0-x0^6.0*12.0*xy";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/1.2708333333333333*xy^61.0+1.0/2.5833333333333335*xy^31.0-0.09448818897637795*xy^127.0+x0*0.006734006734006734*xy^66.0+x0^4.0*0.9473684210526315*xy^38.0-x0^6.0*12.0*xy";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "2880.0*xy^59.0+360.0*xy^29.0-1512.0*xy^125.0+x0*28.88888888888889*xy^64.0+x0^4.0*1332.0*xy^36.0-x0^6.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "2880.0*59.0*xy^58.0+360.0*29.0*xy^28.0-1512.0*125.0*xy^124.0+x0*28.88888888888889*64.0*xy^63.0+x0^4.0*1332.0*36.0*xy^35.0-x0^6.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[2] = "169920.0*xy^58.0+10440.0*xy^28.0-189000.0*xy^124.0+x0*1848.888888888889*xy^63.0+x0^4.0*47952.0*xy^35.0-x0^6.0*0.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/1.2708333333333333*xy^61.0+1.0/2.5833333333333335*xy^31.0-0.09448818897637795*xy^127.0+x0*0.006734006734006734*xy^66.0+x0^4.0*0.9473684210526315*xy^38.0-x0^6.0*12.0*xy";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/1.2708333333333333/62.0*xy^62.0+1.0/2.5833333333333335/32.0*xy^32.0-0.09448818897637795/128.0*xy^128.0+x0*0.006734006734006734/67.0*xy^67.0+x0^4.0*0.9473684210526315/39.0*xy^39.0-x0^6.0*12.0/2.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/78.79166666666666*xy^62.0+1.0/82.66666666666667*xy^32.0-7.381889763779527E-4*xy^128.0+x0*1.0050756319413035E-4*xy^67.0+x0^4.0*0.024291497975708502*xy^39.0-x0^6.0*6.0*xy^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "169920.0*xy^58.0+10440.0*xy^28.0-189000.0*xy^124.0+x0*1848.888888888889*xy^63.0+x0^4.0*47952.0*xy^35.0-x0^6.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "169920.0*58.0*xy^57.0+10440.0*28.0*xy^27.0-189000.0*124.0*xy^123.0+x0*1848.888888888889*63.0*xy^62.0+x0^4.0*47952.0*35.0*xy^34.0-x0^6.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[3] = "9855360.0*xy^57.0+292320.0*xy^27.0-2.3436E7*xy^123.0+x0*116480.0*xy^62.0+x0^4.0*1678320.0*xy^34.0-x0^6.0*0.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/78.79166666666666*xy^62.0+1.0/82.66666666666667*xy^32.0-7.381889763779527E-4*xy^128.0-4.0*xy^128.0+x0*1.0050756319413035E-4*xy^67.0-4.0*xy^67.0+x0^4.0*0.024291497975708502*xy^39.0-x0^6.0*6.0*xy^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/78.79166666666666/63.0*xy^63.0+1.0/82.66666666666667/33.0*xy^33.0-7.381889763779527E-4/129.0*xy^129.0-4.0/129.0*xy^129.0+x0*1.0050756319413035E-4/68.0*xy^68.0-4.0/68.0*xy^68.0+x0^4.0*0.024291497975708502/40.0*xy^40.0-x0^6.0*6.0/3.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/4963.874999999999*xy^63.0+1.0/2728.0*xy^33.0-1.0/174752.0*xy^129.0-1.0/32.25*xy^129.0-0.031007751937984496*xy^129.0+x0/676566.0000000001*xy^68.0-1.0/17.0*xy^68.0-0.058823529411764705*xy^68.0+x0^4.0*6.072874493927126E-4*xy^40.0-x0^6.0*2.0*xy^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "9855360.0*xy^57.0+292320.0*xy^27.0-2.3436E7*xy^123.0+x0*116480.0*xy^62.0+x0^4.0*1678320.0*xy^34.0-x0^6.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "9855360.0*57.0*xy^56.0+292320.0*27.0*xy^26.0-123.0*xy^122.0+x0*116480.0*62.0*xy^61.0+x0^4.0*1678320.0*34.0*xy^33.0-x0^6.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "5.6175552E8*xy^56.0+7892640.0*xy^26.0-123.0*xy^122.0+x0*7221760.0*xy^61.0+x0^4.0*5.706288E7*xy^33.0-x0^6.0*0.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/4963.874999999999*xy^63.0+1.0/2728.0*xy^33.0-1.0/174752.0*xy^129.0-1.0/32.25*xy^129.0-0.031007751937984496*xy^129.0+x0/676566.0000000001*xy^68.0-1.0/17.0*xy^68.0-0.058823529411764705*xy^68.0+x0^4.0*6.072874493927126E-4*xy^40.0-4.0*xy^40.0-x0^6.0*2.0*xy^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/4963.874999999999/64.0*xy^64.0+1.0/2728.0/34.0*xy^34.0-1.0/174752.0/130.0*xy^130.0-1.0/32.25/130.0*xy^130.0-0.031007751937984496/130.0*xy^130.0+x0/676566.0000000001/69.0*xy^69.0-1.0/17.0/69.0*xy^69.0-0.058823529411764705/69.0*xy^69.0+x0^4.0*6.072874493927126E-4/41.0*xy^41.0-4.0/41.0*xy^41.0-x0^6.0*2.0/4.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/317687.99999999994*xy^64.0+1.0/92752.0*xy^34.0-1.0/2.271776E7*xy^130.0-1.0/4192.5*xy^130.0-2.385211687537269E-4*xy^130.0+x0/4.668305400000001E7*xy^69.0-1.0/1173.0*xy^69.0-8.525149190110827E-4*xy^69.0+x0^4.0/67513.33333333333*xy^41.0-1.0/10.25*xy^41.0-0.0975609756097561*xy^41.0-x0^6.0/2.0*xy^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131333() {
 UsageCalculus.TestCase = 131333;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xyz^2^6*+-3*xyz^3^7*4*xyz^1^8*-1*xyz^2^9-3*xyz^3^7*4*xyz^1^8*-1*xyz^2^94*xy012^8*-1*xy012^91*xyz^2^9-3*xyz^3^10*+4*xyz^1*1*xyz^2^2/-3*xyz^3^34*x0*1*x0^2/-3*x0^31*xyz^2^2/-3*xyz^3^3-3*xyz^3^34*x0^4/-1*x0^5*+-3*x0^6*4*x0^71*xyz^2^5*+-3*xyz^3^6*4*xyz^1^7";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=332 EqnNumber=33 FamilyID=1 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[12, 33, 10, 8, 3, 2, 3, 7, 2, 3, 4, 1, 1, 2, 3, 1, 2, 1, 4, 3, 4, 2, 3, 1, 1, 1, 6, 1, 2, 4, 1, 31]"+
"// DOEMatrixRow=[2, 33, 20, 4, 2, 3, 1, 6, 1, 2, 3, 2, 3, 1, 2, 1, 2, 15, 4, 3, 1, 5, 1, 2, 3, 2, 1, 2, 3, 1, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "12.0*xyz^8.0+12.0*xyz^30.0-xy012^8.0*12.0*xyz^126.0+x0/2.25*xyz^65.0+x0^4.0*432.0*xyz^37.0-x0^6.0*144.0*xyz^7.0-12.0*xyz^17.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "12.0*8.0*xyz^7.0+12.0*30.0*xyz^29.0-xy012^8.0*12.0*126.0*xyz^125.0+x0/2.25*65.0*xyz^64.0+x0^4.0*432.0*37.0*xyz^36.0-x0^6.0*144.0*7.0*xyz^6.0-12.0*17.0*xyz^16.0";
 UsageCalculus.EqnSolArrayMap2[1] = "96.0*xyz^7.0+360.0*xyz^29.0-xy012^8.0*1512.0*xyz^125.0+x0*28.88888888888889*xyz^64.0+x0^4.0*15984.0*xyz^36.0-x0^6.0*1008.0*xyz^6.0-204.0*xyz^16.0";
 UsageCalculus.EqnSolArrayMap3[1] = "12.0*xyz^8.0+12.0*xyz^30.0-xy012^8.0*12.0*xyz^126.0+x0/2.25*xyz^65.0+x0^4.0*432.0*xyz^37.0-x0^6.0*144.0*xyz^7.0-12.0*xyz^17.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "12.0/9.0*xyz^9.0+12.0/31.0*xyz^31.0-xy012^8.0*12.0/127.0*xyz^127.0+x0/2.25/66.0*xyz^66.0+x0^4.0*432.0/38.0*xyz^38.0-x0^6.0*144.0/8.0*xyz^8.0-12.0/18.0*xyz^18.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.3333333333333333*xyz^9.0+0.3870967741935484*xyz^31.0-xy012^8.0*0.09448818897637795*xyz^127.0+x0*0.006734006734006734*xyz^66.0+x0^4.0*11.368421052631579*xyz^38.0-x0^6.0*18.0*xyz^8.0-1.0/1.5*xyz^18.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "96.0*xyz^7.0+360.0*xyz^29.0-xy012^8.0*1512.0*xyz^125.0+x0*28.88888888888889*xyz^64.0+x0^4.0*15984.0*xyz^36.0-x0^6.0*1008.0*xyz^6.0-204.0*xyz^16.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "96.0*7.0*xyz^6.0+360.0*29.0*xyz^28.0-xy012^8.0*1512.0*125.0*xyz^124.0+x0*28.88888888888889*64.0*xyz^63.0+x0^4.0*15984.0*36.0*xyz^35.0-x0^6.0*1008.0*6.0*xyz^5.0-204.0*16.0*xyz^15.0";
 UsageCalculus.EqnSolArrayMap2[2] = "672.0*xyz^6.0+10440.0*xyz^28.0-xy012^8.0*189000.0*xyz^124.0+x0*1848.888888888889*xyz^63.0+x0^4.0*575424.0*xyz^35.0-x0^6.0*6048.0*xyz^5.0-3264.0*xyz^15.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.3333333333333333*xyz^9.0+0.3870967741935484*xyz^31.0-xy012^8.0*0.09448818897637795*xyz^127.0+x0*0.006734006734006734*xyz^66.0+x0^4.0*11.368421052631579*xyz^38.0-x0^6.0*18.0*xyz^8.0-1.0/1.5*xyz^18.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.3333333333333333/10.0*xyz^10.0+0.3870967741935484/32.0*xyz^32.0-xy012^8.0*0.09448818897637795/128.0*xyz^128.0+x0*0.006734006734006734/67.0*xyz^67.0+x0^4.0*11.368421052631579/39.0*xyz^39.0-x0^6.0*18.0/9.0*xyz^9.0-1.0/1.5/19.0*xyz^19.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/7.5*xyz^10.0+0.012096774193548387*xyz^32.0-xy012^8.0*7.381889763779527E-4*xyz^128.0+x0*1.0050756319413035E-4*xyz^67.0+x0^4.0*0.291497975708502*xyz^39.0-x0^6.0*2.0*xyz^9.0-1.0/28.5*xyz^19.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "672.0*xyz^6.0+10440.0*xyz^28.0-xy012^8.0*189000.0*xyz^124.0+x0*1848.888888888889*xyz^63.0+x0^4.0*575424.0*xyz^35.0-x0^6.0*6048.0*xyz^5.0-3264.0*xyz^15.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "672.0*6.0*xyz^5.0+10440.0*28.0*xyz^27.0-xy012^8.0*189000.0*124.0*xyz^123.0+x0*1848.888888888889*63.0*xyz^62.0+x0^4.0*575424.0*35.0*xyz^34.0-x0^6.0*6048.0*5.0*xyz^4.0-3264.0*15.0*xyz^14.0";
 UsageCalculus.EqnSolArrayMap2[3] = "4032.0*xyz^5.0+292320.0*xyz^27.0-xy012^8.0*2.3436E7*xyz^123.0+x0*116480.0*xyz^62.0+x0^4.0*2.013984E7*xyz^34.0-x0^6.0*30240.0*xyz^4.0-48960.0*xyz^14.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/7.5*xyz^10.0+0.012096774193548387*xyz^32.0-xy012^8.0*7.381889763779527E-4*xyz^128.0-4.0*xyz^128.0+x0*1.0050756319413035E-4*xyz^67.0-4.0*xyz^67.0+x0^4.0*0.291497975708502*xyz^39.0-x0^6.0*2.0*xyz^9.0-1.0/28.5*xyz^19.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/7.5/11.0*xyz^11.0+0.012096774193548387/33.0*xyz^33.0-xy012^8.0*7.381889763779527E-4/129.0*xyz^129.0-4.0/129.0*xyz^129.0+x0*1.0050756319413035E-4/68.0*xyz^68.0-4.0/68.0*xyz^68.0+x0^4.0*0.291497975708502/40.0*xyz^40.0-x0^6.0*2.0/10.0*xyz^10.0-1.0/28.5/20.0*xyz^20.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/82.5*xyz^11.0+3.6656891495601173E-4*xyz^33.0-xy012^8.0/174752.0*xyz^129.0-1.0/32.25*xyz^129.0-0.031007751937984496*xyz^129.0+x0/676566.0000000001*xyz^68.0-1.0/17.0*xyz^68.0-0.058823529411764705*xyz^68.0+x0^4.0*0.00728744939271255*xyz^40.0-x0^6.0/5.0*xyz^10.0-1.0/570.0*xyz^20.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "4032.0*xyz^5.0+292320.0*xyz^27.0-xy012^8.0*2.3436E7*xyz^123.0+x0*116480.0*xyz^62.0+x0^4.0*2.013984E7*xyz^34.0-x0^6.0*30240.0*xyz^4.0-48960.0*xyz^14.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "4032.0*5.0*xyz^4.0+292320.0*27.0*xyz^26.0-xy012^8.0*2.3436E7*123.0*xyz^122.0+x0*116480.0*62.0*xyz^61.0+x0^4.0*2.013984E7*34.0*xyz^33.0-x0^6.0*30240.0*4.0*xyz^3.0-48960.0*14.0*xyz^13.0";
 UsageCalculus.EqnSolArrayMap2[4] = "20160.0*xyz^4.0+7892640.0*xyz^26.0-xy012^8.0*2.882628E9*xyz^122.0+x0*7221760.0*xyz^61.0+x0^4.0*6.8475456E8*xyz^33.0-x0^6.0*120960.0*xyz^3.0-685440.0*xyz^13.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/82.5*xyz^11.0+3.6656891495601173E-4*xyz^33.0-4.0*xyz^33.0-xy012^8.0/174752.0*xyz^129.0-1.0/32.25*xyz^129.0-0.031007751937984496*xyz^129.0+x0/676566.0000000001*xyz^68.0-1.0/17.0*xyz^68.0-0.058823529411764705*xyz^68.0+x0^4.0*0.00728744939271255*xyz^40.0-x0^6.0/5.0*xyz^10.0-1.0/570.0*xyz^20.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/82.5/12.0*xyz^12.0+3.6656891495601173E-4/34.0*xyz^34.0-4.0/34.0*xyz^34.0-xy012^8.0/174752.0/130.0*xyz^130.0-1.0/32.25/130.0*xyz^130.0-0.031007751937984496/130.0*xyz^130.0+x0/676566.0000000001/69.0*xyz^69.0-1.0/17.0/69.0*xyz^69.0-0.058823529411764705/69.0*xyz^69.0+x0^4.0*0.00728744939271255/41.0*xyz^41.0-x0^6.0/5.0/11.0*xyz^11.0-1.0/570.0/21.0*xyz^21.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/990.0*xyz^12.0+1.0/92752.0*xyz^34.0-1.0/8.5*xyz^34.0-0.11764705882352941*xyz^34.0-xy012^8.0/2.271776E7*xyz^130.0-1.0/4192.5*xyz^130.0-2.385211687537269E-4*xyz^130.0+x0/4.668305400000001E7*xyz^69.0-1.0/1173.0*xyz^69.0-8.525149190110827E-4*xyz^69.0+x0^4.0*1.7774266811494024E-4*xyz^41.0-x0^6.0/55.0*xyz^11.0-1.0/11970.0*xyz^21.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131334() {
 UsageCalculus.TestCase = 131334;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xyza^3^7*4*xyza^1^8*-1*xyza^2^94*xy012^8*-1*xy012^91*xyza^2^9-3*xyza^3^10*+4*xyza^1*1*xyza^2^2/-3*xyza^3^34*x0*1*x0^2/-3*x0^31*xyza^2^2/-3*xyza^3^3-3*xyza^3^34*x0^4/-1*x0^5*+-3*x0^6*4*x0^71*xyza^2^5*+-3*xyza^3^6*4*xyza^1^7-3*xyza^3^6*4*xyza^1^7";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=333 EqnNumber=34 FamilyID=3 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[12, 34, 10, 7, 4, 3, 1, 8, 3, 4, 1, 2, 3, 1, 4, 2, 3, 2, 5, 1, 1, 3, 1, 2, 3, 2, 7, 2, 3, 5, 2, 32]"+
"// DOEMatrixRow=[2, 34, 20, 3, 1, 1, 2, 7, 2, 3, 4, 1, 1, 2, 3, 2, 3, 16, 5, 1, 2, 1, 2, 3, 4, 3, 2, 3, 4, 2, 1]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-xy012^8.0*12.0*xyza^126.0+x0/2.25*xyza^65.0+x0^4.0*432.0*xyza^37.0-x0^6.0*144.0*xyza^7.0-12.0*xyza^17.0-12.0*xyza^17.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-xy012^8.0*12.0*126.0*xyza^125.0+x0/2.25*65.0*xyza^64.0+x0^4.0*432.0*37.0*xyza^36.0-x0^6.0*144.0*7.0*xyza^6.0-12.0*17.0*xyza^16.0-12.0*17.0*xyza^16.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-xy012^8.0*1512.0*xyza^125.0+x0*28.88888888888889*xyza^64.0+x0^4.0*15984.0*xyza^36.0-x0^6.0*1008.0*xyza^6.0-204.0*xyza^16.0-204.0*xyza^16.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-xy012^8.0*12.0*xyza^126.0+x0/2.25*xyza^65.0+x0^4.0*432.0*xyza^37.0-x0^6.0*144.0*xyza^7.0-12.0*xyza^17.0-12.0*xyza^17.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-xy012^8.0*12.0/127.0*xyza^127.0+x0/2.25/66.0*xyza^66.0+x0^4.0*432.0/38.0*xyza^38.0-x0^6.0*144.0/8.0*xyza^8.0-12.0/18.0*xyza^18.0-12.0/18.0*xyza^18.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-xy012^8.0*0.09448818897637795*xyza^127.0+x0*0.006734006734006734*xyza^66.0+x0^4.0*11.368421052631579*xyza^38.0-x0^6.0*18.0*xyza^8.0-1.0/1.5*xyza^18.0-1.0/1.5*xyza^18.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-xy012^8.0*1512.0*xyza^125.0+x0*28.88888888888889*xyza^64.0+x0^4.0*15984.0*xyza^36.0-x0^6.0*1008.0*xyza^6.0-204.0*xyza^16.0-204.0*xyza^16.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-xy012^8.0*1512.0*125.0*xyza^124.0+x0*28.88888888888889*64.0*xyza^63.0+x0^4.0*15984.0*36.0*xyza^35.0-x0^6.0*1008.0*6.0*xyza^5.0-204.0*16.0*xyza^15.0-204.0*16.0*xyza^15.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-xy012^8.0*189000.0*xyza^124.0+x0*1848.888888888889*xyza^63.0+x0^4.0*575424.0*xyza^35.0-x0^6.0*6048.0*xyza^5.0-3264.0*xyza^15.0-3264.0*xyza^15.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-xy012^8.0*0.09448818897637795*xyza^127.0+x0*0.006734006734006734*xyza^66.0+x0^4.0*11.368421052631579*xyza^38.0-x0^6.0*18.0*xyza^8.0-1.0/1.5*xyza^18.0-1.0/1.5*xyza^18.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-xy012^8.0*0.09448818897637795/128.0*xyza^128.0+x0*0.006734006734006734/67.0*xyza^67.0+x0^4.0*11.368421052631579/39.0*xyza^39.0-x0^6.0*18.0/9.0*xyza^9.0-1.0/1.5/19.0*xyza^19.0-1.0/1.5/19.0*xyza^19.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-xy012^8.0*7.381889763779527E-4*xyza^128.0+x0*1.0050756319413035E-4*xyza^67.0+x0^4.0*0.291497975708502*xyza^39.0-x0^6.0*2.0*xyza^9.0-1.0/28.5*xyza^19.0-1.0/28.5*xyza^19.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-xy012^8.0*189000.0*xyza^124.0+x0*1848.888888888889*xyza^63.0+x0^4.0*575424.0*xyza^35.0-x0^6.0*6048.0*xyza^5.0-3264.0*xyza^15.0-3264.0*xyza^15.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-xy012^8.0*189000.0*124.0*xyza^123.0+x0*1848.888888888889*63.0*xyza^62.0+x0^4.0*575424.0*35.0*xyza^34.0-x0^6.0*6048.0*5.0*xyza^4.0-3264.0*15.0*xyza^14.0-3264.0*15.0*xyza^14.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-xy012^8.0*2.3436E7*xyza^123.0+x0*116480.0*xyza^62.0+x0^4.0*2.013984E7*xyza^34.0-x0^6.0*30240.0*xyza^4.0-48960.0*xyza^14.0-48960.0*xyza^14.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-xy012^8.0*7.381889763779527E-4*xyza^128.0-4.0*xyza^128.0+x0*1.0050756319413035E-4*xyza^67.0-4.0*xyza^67.0+x0^4.0*0.291497975708502*xyza^39.0-x0^6.0*2.0*xyza^9.0-1.0/28.5*xyza^19.0-1.0/28.5*xyza^19.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-xy012^8.0*7.381889763779527E-4/129.0*xyza^129.0-4.0/129.0*xyza^129.0+x0*1.0050756319413035E-4/68.0*xyza^68.0-4.0/68.0*xyza^68.0+x0^4.0*0.291497975708502/40.0*xyza^40.0-x0^6.0*2.0/10.0*xyza^10.0-1.0/28.5/20.0*xyza^20.0-1.0/28.5/20.0*xyza^20.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-xy012^8.0/174752.0*xyza^129.0-1.0/32.25*xyza^129.0-0.031007751937984496*xyza^129.0+x0/676566.0000000001*xyza^68.0-1.0/17.0*xyza^68.0-0.058823529411764705*xyza^68.0+x0^4.0*0.00728744939271255*xyza^40.0-x0^6.0/5.0*xyza^10.0-1.0/570.0*xyza^20.0-1.0/570.0*xyza^20.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-xy012^8.0*2.3436E7*xyza^123.0+x0*116480.0*xyza^62.0+x0^4.0*2.013984E7*xyza^34.0-x0^6.0*30240.0*xyza^4.0-48960.0*xyza^14.0-48960.0*xyza^14.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-xy012^8.0*2.3436E7*123.0*xyza^122.0+x0*116480.0*62.0*xyza^61.0+x0^4.0*2.013984E7*34.0*xyza^33.0-x0^6.0*30240.0*4.0*xyza^3.0-48960.0*14.0*xyza^13.0-48960.0*14.0*xyza^13.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-xy012^8.0*2.882628E9*xyza^122.0+x0*7221760.0*xyza^61.0+x0^4.0*6.8475456E8*xyza^33.0-x0^6.0*120960.0*xyza^3.0-685440.0*xyza^13.0-685440.0*xyza^13.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-xy012^8.0/174752.0*xyza^129.0-1.0/32.25*xyza^129.0-0.031007751937984496*xyza^129.0+x0/676566.0000000001*xyza^68.0-1.0/17.0*xyza^68.0-0.058823529411764705*xyza^68.0+x0^4.0*0.00728744939271255*xyza^40.0-x0^6.0/5.0*xyza^10.0-1.0/570.0*xyza^20.0-1.0/570.0*xyza^20.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-xy012^8.0/174752.0/130.0*xyza^130.0-1.0/32.25/130.0*xyza^130.0-0.031007751937984496/130.0*xyza^130.0+x0/676566.0000000001/69.0*xyza^69.0-1.0/17.0/69.0*xyza^69.0-0.058823529411764705/69.0*xyza^69.0+x0^4.0*0.00728744939271255/41.0*xyza^41.0-x0^6.0/5.0/11.0*xyza^11.0-1.0/570.0/21.0*xyza^21.0-1.0/570.0/21.0*xyza^21.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-xy012^8.0/2.271776E7*xyza^130.0-1.0/4192.5*xyza^130.0-2.385211687537269E-4*xyza^130.0+x0/4.668305400000001E7*xyza^69.0-1.0/1173.0*xyza^69.0-8.525149190110827E-4*xyza^69.0+x0^4.0*1.7774266811494024E-4*xyza^41.0-x0^6.0/55.0*xyza^11.0-1.0/11970.0*xyza^21.0-1.0/11970.0*xyza^21.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131335() {
 UsageCalculus.TestCase = 131335;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "4*xy012^8*-1*xy012^91*x^2^9-3*x^3^10*+4*x^1*1*x^2^2/-3*x^3^34*x0*1*x0^2/-3*x0^31*x^2^2/-3*x^3^3-3*x^3^34*x0^4/-1*x0^5*+-3*x0^6*4*x0^71*x^2^5*+-3*x^3^6*4*x^1^7-3*x^3^6*4*x^1^74*x0^7";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=334 EqnNumber=35 FamilyID=1 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[12, 35, 10, 6, 1, 1, 2, 9, 1, 1, 2, 1, 1, 2, 1, 3, 1, 1, 1, 2, 3, 4, 2, 3, 1, 3, 8, 3, 4, 6, 3, 1]"+
"// DOEMatrixRow=[2, 35, 20, 2, 1, 2, 3, 8, 3, 4, 1, 2, 3, 1, 4, 3, 1, 17, 6, 2, 3, 2, 3, 1, 5, 4, 3, 1, 1, 3, 2]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-4.0*x^11.0+1.0/2.25*x^65.0+432.0*x^37.0-144.0*x^7.0-12.0*x^17.0-12.0*x^84.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-4.0*11.0*x^10.0+1.0/2.25*65.0*x^64.0+432.0*37.0*x^36.0-144.0*7.0*x^6.0-12.0*17.0*x^16.0-12.0*84.0*x^83.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-44.0*x^10.0+28.88888888888889*x^64.0+15984.0*x^36.0-1008.0*x^6.0-204.0*x^16.0-1008.0*x^83.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-4.0*x^11.0+1.0/2.25*x^65.0+432.0*x^37.0-144.0*x^7.0-12.0*x^17.0-12.0*x^84.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-4.0/12.0*x^12.0+1.0/2.25/66.0*x^66.0+432.0/38.0*x^38.0-144.0/8.0*x^8.0-12.0/18.0*x^18.0-12.0/85.0*x^85.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/3.0*x^12.0+1.0/148.5*x^66.0+11.368421052631579*x^38.0-18.0*x^8.0-1.0/1.5*x^18.0-1.0/7.083333333333333*x^85.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-44.0*x^10.0+28.88888888888889*x^64.0+15984.0*x^36.0-1008.0*x^6.0-204.0*x^16.0-1008.0*x^83.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-44.0*10.0*x^9.0+28.88888888888889*64.0*x^63.0+15984.0*36.0*x^35.0-1008.0*6.0*x^5.0-204.0*16.0*x^15.0-1008.0*83.0*x^82.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-440.0*x^9.0+1848.888888888889*x^63.0+575424.0*x^35.0-6048.0*x^5.0-3264.0*x^15.0-83664.0*x^82.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/3.0*x^12.0+1.0/148.5*x^66.0+11.368421052631579*x^38.0-18.0*x^8.0-1.0/1.5*x^18.0-1.0/7.083333333333333*x^85.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/3.0/13.0*x^13.0+1.0/148.5/67.0*x^67.0+11.368421052631579/39.0*x^39.0-18.0/9.0*x^9.0-1.0/1.5/19.0*x^19.0-1.0/7.083333333333333/86.0*x^86.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/39.0*x^13.0+1.0/9949.5*x^67.0+1.0/3.430555555555556*x^39.0-2.0*x^9.0-1.0/28.5*x^19.0-1.0/609.1666666666666*x^86.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-440.0*x^9.0+1848.888888888889*x^63.0+575424.0*x^35.0-6048.0*x^5.0-3264.0*x^15.0-83664.0*x^82.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-440.0*9.0*x^8.0+1848.888888888889*63.0*x^62.0+575424.0*35.0*x^34.0-6048.0*5.0*x^4.0-3264.0*15.0*x^14.0-83664.0*82.0*x^81.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-3960.0*x^8.0+116480.0*x^62.0+2.013984E7*x^34.0-30240.0*x^4.0-48960.0*x^14.0-6860448.0*x^81.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/39.0*x^13.0+1.0/9949.5*x^67.0+1.0/3.430555555555556*x^39.0-2.0*x^9.0-1.0/28.5*x^19.0-1.0/609.1666666666666*x^86.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/39.0/14.0*x^14.0+1.0/9949.5/68.0*x^68.0+1.0/3.430555555555556/40.0*x^40.0-2.0/10.0*x^10.0-1.0/28.5/20.0*x^20.0-1.0/609.1666666666666/87.0*x^87.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/546.0*x^14.0+1.0/676566.0*x^68.0+1.0/137.22222222222223*x^40.0-1.0/5.0*x^10.0-1.0/570.0*x^20.0-1.0/52997.5*x^87.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-3960.0*x^8.0+116480.0*x^62.0+2.013984E7*x^34.0-30240.0*x^4.0-48960.0*x^14.0-6860448.0*x^81.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-3960.0*8.0*x^7.0+116480.0*62.0*x^61.0+34.0*x^33.0-30240.0*4.0*x^3.0-48960.0*14.0*x^13.0-6860448.0*81.0*x^80.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-31680.0*x^7.0+7221760.0*x^61.0+34.0*x^33.0-120960.0*x^3.0-685440.0*x^13.0-5.55696288E8*x^80.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/546.0*x^14.0+1.0/676566.0*x^68.0+1.0/137.22222222222223*x^40.0-1.0/5.0*x^10.0-1.0/570.0*x^20.0-1.0/52997.5*x^87.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/546.0/15.0*x^15.0+1.0/676566.0/69.0*x^69.0+1.0/137.22222222222223/41.0*x^41.0-1.0/5.0/11.0*x^11.0-1.0/570.0/21.0*x^21.0-1.0/52997.5/88.0*x^88.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/8190.0*x^15.0+1.0/4.6683054E7*x^69.0+1.0/5626.111111111111*x^41.0-1.0/55.0*x^11.0-1.0/11970.0*x^21.0-1.0/4663780.0*x^88.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131336() {
 UsageCalculus.TestCase = 131336;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xy^2^9-3*xy^3^10*+4*xy^1*1*xy^2^2/-3*xy^3^34*x0*1*x0^2/-3*x0^31*xy^2^2/-3*xy^3^3-3*xy^3^34*x0^4/-1*x0^5*+-3*x0^6*4*x0^71*xy^2^5*+-3*xy^3^6*4*xy^1^7-3*xy^3^6*4*xy^1^74*x0^71*xy^2^8/--3*xy^3^9*+4*xy^1^10*1*xy^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=335 EqnNumber=36 FamilyID=2 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[12, 36, 10, 5, 2, 3, 1, 10, 2, 3, 4, 2, 3, 1, 2, 1, 2, 1, 2, 3, 4, 5, 3, 1, 2, 4, 9, 1, 1, 7, 4, 2]"+
"// DOEMatrixRow=[2, 36, 20, 1, 2, 3, 1, 9, 1, 1, 2, 1, 1, 2, 1, 1, 2, 18, 7, 3, 1, 3, 1, 2, 6, 1, 1, 2, 3, 4, 1]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "xy^11.0+x0/2.25*xy^65.0+x0^4.0*432.0*xy^37.0-x0^6.0*144.0*xy^7.0-12.0*xy^17.0-x0^71.0*16.0*xy^119.0-12.0*xy^25.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "11.0*xy^10.0+x0/2.25*65.0*xy^64.0+x0^4.0*432.0*37.0*xy^36.0-x0^6.0*144.0*7.0*xy^6.0-12.0*17.0*xy^16.0-x0^71.0*16.0*119.0*xy^118.0-12.0*25.0*xy^24.0";
 UsageCalculus.EqnSolArrayMap2[1] = "11.0*xy^10.0+x0*28.88888888888889*xy^64.0+x0^4.0*15984.0*xy^36.0-x0^6.0*1008.0*xy^6.0-204.0*xy^16.0-x0^71.0*1904.0*xy^118.0-300.0*xy^24.0";
 UsageCalculus.EqnSolArrayMap3[1] = "xy^11.0+x0/2.25*xy^65.0+x0^4.0*432.0*xy^37.0-x0^6.0*144.0*xy^7.0-12.0*xy^17.0-x0^71.0*16.0*xy^119.0-12.0*xy^25.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0/12.0*xy^12.0+x0/2.25/66.0*xy^66.0+x0^4.0*432.0/38.0*xy^38.0-x0^6.0*144.0/8.0*xy^8.0-12.0/18.0*xy^18.0-x0^71.0*16.0/120.0*xy^120.0-12.0/26.0*xy^26.0";
 UsageCalculus.EqnSolArrayMap4[1] = "0.08333333333333333*xy^12.0+x0*0.006734006734006734*xy^66.0+x0^4.0*11.368421052631579*xy^38.0-x0^6.0*18.0*xy^8.0-0.6666666666666666*xy^18.0-x0^71.0/7.5*xy^120.0-1.0/2.1666666666666665*xy^26.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "11.0*xy^10.0+x0*28.88888888888889*xy^64.0+x0^4.0*15984.0*xy^36.0-x0^6.0*1008.0*xy^6.0-204.0*xy^16.0-x0^71.0*1904.0*xy^118.0-300.0*xy^24.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "11.0*10.0*xy^9.0+x0*28.88888888888889*64.0*xy^63.0+x0^4.0*15984.0*36.0*xy^35.0-x0^6.0*1008.0*6.0*xy^5.0-204.0*16.0*xy^15.0-x0^71.0*1904.0*118.0*xy^117.0-300.0*24.0*xy^23.0";
 UsageCalculus.EqnSolArrayMap2[2] = "110.0*xy^9.0+x0*1848.888888888889*xy^63.0+x0^4.0*575424.0*xy^35.0-x0^6.0*6048.0*xy^5.0-3264.0*xy^15.0-x0^71.0*224672.0*xy^117.0-7200.0*xy^23.0";
 UsageCalculus.EqnSolArrayMap3[2] = "0.08333333333333333*xy^12.0+x0*0.006734006734006734*xy^66.0+x0^4.0*11.368421052631579*xy^38.0-x0^6.0*18.0*xy^8.0-0.6666666666666666*xy^18.0-x0^71.0/7.5*xy^120.0-1.0/2.1666666666666665*xy^26.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "0.08333333333333333/13.0*xy^13.0+x0*0.006734006734006734/67.0*xy^67.0+x0^4.0*11.368421052631579/39.0*xy^39.0-x0^6.0*18.0/9.0*xy^9.0-0.6666666666666666/19.0*xy^19.0-x0^71.0/7.5/121.0*xy^121.0-1.0/2.1666666666666665/27.0*xy^27.0";
 UsageCalculus.EqnSolArrayMap4[2] = "0.00641025641025641*xy^13.0+x0*1.0050756319413035E-4*xy^67.0+x0^4.0*0.291497975708502*xy^39.0-x0^6.0*2.0*xy^9.0-0.03508771929824561*xy^19.0-x0^71.0/907.5*xy^121.0-1.0/58.49999999999999*xy^27.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "110.0*xy^9.0+x0*1848.888888888889*xy^63.0+x0^4.0*575424.0*xy^35.0-x0^6.0*6048.0*xy^5.0-3264.0*xy^15.0-x0^71.0*224672.0*xy^117.0-7200.0*xy^23.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "110.0*9.0*xy^8.0+x0*1848.888888888889*63.0*xy^62.0+x0^4.0*575424.0*35.0*xy^34.0-x0^6.0*6048.0*5.0*xy^4.0-3264.0*15.0*xy^14.0-x0^71.0*224672.0*117.0*xy^116.0-7200.0*23.0*xy^22.0";
 UsageCalculus.EqnSolArrayMap2[3] = "990.0*xy^8.0+x0*116480.0*xy^62.0+x0^4.0*2.013984E7*xy^34.0-x0^6.0*30240.0*xy^4.0-48960.0*xy^14.0-x0^71.0*2.6286624E7*xy^116.0-165600.0*xy^22.0";
 UsageCalculus.EqnSolArrayMap3[3] = "0.00641025641025641*xy^13.0+x0*1.0050756319413035E-4*xy^67.0-4.0*xy^67.0+x0^4.0*0.291497975708502*xy^39.0-x0^6.0*2.0*xy^9.0-0.03508771929824561*xy^19.0-x0^71.0/907.5*xy^121.0-1.0/58.49999999999999*xy^27.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "0.00641025641025641/14.0*xy^14.0+x0*1.0050756319413035E-4/68.0*xy^68.0-4.0/68.0*xy^68.0+x0^4.0*0.291497975708502/40.0*xy^40.0-x0^6.0*2.0/10.0*xy^10.0-0.03508771929824561/20.0*xy^20.0-x0^71.0/907.5/122.0*xy^122.0-1.0/58.49999999999999/28.0*xy^28.0";
 UsageCalculus.EqnSolArrayMap4[3] = "4.578754578754579E-4*xy^14.0+x0/676566.0000000001*xy^68.0-1.0/17.0*xy^68.0-0.058823529411764705*xy^68.0+x0^4.0*0.00728744939271255*xy^40.0-x0^6.0/5.0*xy^10.0-0.0017543859649122805*xy^20.0-x0^71.0/110715.0*xy^122.0-1.0/1637.9999999999998*xy^28.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "990.0*xy^8.0+x0*116480.0*xy^62.0+x0^4.0*2.013984E7*xy^34.0-x0^6.0*30240.0*xy^4.0-48960.0*xy^14.0-x0^71.0*2.6286624E7*xy^116.0-165600.0*xy^22.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "990.0*8.0*xy^7.0+x0*116480.0*62.0*xy^61.0+x0^4.0*2.013984E7*34.0*xy^33.0-x0^6.0*30240.0*4.0*xy^3.0-48960.0*14.0*xy^13.0-x0^71.0*2.6286624E7*116.0*xy^115.0-165600.0*22.0*xy^21.0";
 UsageCalculus.EqnSolArrayMap2[4] = "7920.0*xy^7.0+x0*7221760.0*xy^61.0+x0^4.0*6.8475456E8*xy^33.0-x0^6.0*120960.0*xy^3.0-685440.0*xy^13.0-x0^71.0*3.049248384E9*xy^115.0-3643200.0*xy^21.0";
 UsageCalculus.EqnSolArrayMap3[4] = "4.578754578754579E-4*xy^14.0-4.0*xy^14.0+x0/676566.0000000001*xy^68.0-1.0/17.0*xy^68.0-0.058823529411764705*xy^68.0+x0^4.0*0.00728744939271255*xy^40.0-x0^6.0/5.0*xy^10.0-0.0017543859649122805*xy^20.0-x0^71.0/110715.0*xy^122.0-1.0/1637.9999999999998*xy^28.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "4.578754578754579E-4/15.0*xy^15.0-4.0/15.0*xy^15.0+x0/676566.0000000001/69.0*xy^69.0-1.0/17.0/69.0*xy^69.0-0.058823529411764705/69.0*xy^69.0+x0^4.0*0.00728744939271255/41.0*xy^41.0-x0^6.0/5.0/11.0*xy^11.0-0.0017543859649122805/21.0*xy^21.0-x0^71.0/110715.0/123.0*xy^123.0-1.0/1637.9999999999998/29.0*xy^29.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/32760.0*xy^15.0-1.0/3.75*xy^15.0-0.26666666666666666*xy^15.0+x0/4.668305400000001E7*xy^69.0-1.0/1173.0*xy^69.0-8.525149190110827E-4*xy^69.0+x0^4.0*1.7774266811494024E-4*xy^41.0-x0^6.0/55.0*xy^11.0-8.354218880534669E-5*xy^21.0-x0^71.0/1.3617945E7*xy^123.0-1.0/47501.99999999999*xy^29.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131337() {
 UsageCalculus.TestCase = 131337;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xyz^3^10*+4*xyz^1*1*xyz^2^2/-3*xyz^3^34*x0*1*x0^2/-3*x0^31*xyz^2^2/-3*xyz^3^3-3*xyz^3^34*x0^4/-1*x0^5*+-3*x0^6*4*x0^71*xyz^2^5*+-3*xyz^3^6*4*xyz^1^7-3*xyz^3^6*4*xyz^1^74*x0^71*xyz^2^8/--3*xyz^3^9*+4*xyz^1^10*1*xyz^2-3*xyz^3^9*+4*xyz^1^10*1*xyz^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=336 EqnNumber=37 FamilyID=3 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[12, 37, 10, 4, 3, 1, 2, 1, 3, 4, 1, 1, 1, 2, 3, 2, 3, 2, 3, 1, 1, 6, 1, 2, 3, 1, 10, 2, 3, 8, 1, 3]"+
"// DOEMatrixRow=[2, 37, 20, 4, 2, 1, 2, 10, 2, 3, 4, 2, 3, 1, 2, 3, 1, 19, 8, 1, 2, 4, 2, 3, 1, 2, 3, 1, 4, 5, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0/2.25*xyz^65.0+x0^4.0*432.0*xyz^37.0-x0^6.0*144.0*xyz^7.0-12.0*xyz^17.0-x0^71.0*16.0*xyz^119.0-12.0*xyz^25.0-12.0*xyz^25.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0/2.25*65.0*xyz^64.0+x0^4.0*432.0*37.0*xyz^36.0-x0^6.0*144.0*7.0*xyz^6.0-12.0*17.0*xyz^16.0-x0^71.0*16.0*119.0*xyz^118.0-12.0*25.0*xyz^24.0-12.0*25.0*xyz^24.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0*28.88888888888889*xyz^64.0+x0^4.0*15984.0*xyz^36.0-x0^6.0*1008.0*xyz^6.0-204.0*xyz^16.0-x0^71.0*1904.0*xyz^118.0-300.0*xyz^24.0-300.0*xyz^24.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0/2.25*xyz^65.0+x0^4.0*432.0*xyz^37.0-x0^6.0*144.0*xyz^7.0-12.0*xyz^17.0-x0^71.0*16.0*xyz^119.0-12.0*xyz^25.0-12.0*xyz^25.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0/2.25/66.0*xyz^66.0+x0^4.0*432.0/38.0*xyz^38.0-x0^6.0*144.0/8.0*xyz^8.0-12.0/18.0*xyz^18.0-x0^71.0*16.0/120.0*xyz^120.0-12.0/26.0*xyz^26.0-12.0/26.0*xyz^26.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0*0.006734006734006734*xyz^66.0+x0^4.0*11.368421052631579*xyz^38.0-x0^6.0*18.0*xyz^8.0-0.6666666666666666*xyz^18.0-x0^71.0/7.5*xyz^120.0-1.0/2.1666666666666665*xyz^26.0-1.0/2.1666666666666665*xyz^26.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0*28.88888888888889*xyz^64.0+x0^4.0*15984.0*xyz^36.0-x0^6.0*1008.0*xyz^6.0-204.0*xyz^16.0-x0^71.0*1904.0*xyz^118.0-300.0*xyz^24.0-300.0*xyz^24.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0*28.88888888888889*64.0*xyz^63.0+x0^4.0*15984.0*36.0*xyz^35.0-x0^6.0*1008.0*6.0*xyz^5.0-204.0*16.0*xyz^15.0-x0^71.0*1904.0*118.0*xyz^117.0-300.0*24.0*xyz^23.0-300.0*24.0*xyz^23.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0*1848.888888888889*xyz^63.0+x0^4.0*575424.0*xyz^35.0-x0^6.0*6048.0*xyz^5.0-3264.0*xyz^15.0-x0^71.0*224672.0*xyz^117.0-7200.0*xyz^23.0-7200.0*xyz^23.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0*0.006734006734006734*xyz^66.0+x0^4.0*11.368421052631579*xyz^38.0-x0^6.0*18.0*xyz^8.0-0.6666666666666666*xyz^18.0-x0^71.0/7.5*xyz^120.0-1.0/2.1666666666666665*xyz^26.0-1.0/2.1666666666666665*xyz^26.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0*0.006734006734006734/67.0*xyz^67.0+x0^4.0*11.368421052631579/39.0*xyz^39.0-x0^6.0*18.0/9.0*xyz^9.0-0.6666666666666666/19.0*xyz^19.0-x0^71.0/7.5/121.0*xyz^121.0-1.0/2.1666666666666665/27.0*xyz^27.0-1.0/2.1666666666666665/27.0*xyz^27.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0*1.0050756319413035E-4*xyz^67.0+x0^4.0*0.291497975708502*xyz^39.0-x0^6.0*2.0*xyz^9.0-0.03508771929824561*xyz^19.0-x0^71.0/907.5*xyz^121.0-1.0/58.49999999999999*xyz^27.0-1.0/58.49999999999999*xyz^27.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0*1848.888888888889*xyz^63.0+x0^4.0*575424.0*xyz^35.0-x0^6.0*6048.0*xyz^5.0-3264.0*xyz^15.0-x0^71.0*224672.0*xyz^117.0-7200.0*xyz^23.0-7200.0*xyz^23.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0*1848.888888888889*63.0*xyz^62.0+x0^4.0*575424.0*35.0*xyz^34.0-x0^6.0*6048.0*5.0*xyz^4.0-3264.0*15.0*xyz^14.0-x0^71.0*224672.0*117.0*xyz^116.0-7200.0*23.0*xyz^22.0-7200.0*23.0*xyz^22.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0*116480.0*xyz^62.0+x0^4.0*2.013984E7*xyz^34.0-x0^6.0*30240.0*xyz^4.0-48960.0*xyz^14.0-x0^71.0*2.6286624E7*xyz^116.0-165600.0*xyz^22.0-165600.0*xyz^22.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0*1.0050756319413035E-4*xyz^67.0-4.0*xyz^67.0+x0^4.0*0.291497975708502*xyz^39.0-x0^6.0*2.0*xyz^9.0-0.03508771929824561*xyz^19.0-x0^71.0/907.5*xyz^121.0-1.0/58.49999999999999*xyz^27.0-1.0/58.49999999999999*xyz^27.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0*1.0050756319413035E-4/68.0*xyz^68.0-4.0/68.0*xyz^68.0+x0^4.0*0.291497975708502/40.0*xyz^40.0-x0^6.0*2.0/10.0*xyz^10.0-0.03508771929824561/20.0*xyz^20.0-x0^71.0/907.5/122.0*xyz^122.0-1.0/58.49999999999999/28.0*xyz^28.0-1.0/58.49999999999999/28.0*xyz^28.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0/676566.0000000001*xyz^68.0-1.0/17.0*xyz^68.0-0.058823529411764705*xyz^68.0+x0^4.0*0.00728744939271255*xyz^40.0-x0^6.0/5.0*xyz^10.0-0.0017543859649122805*xyz^20.0-x0^71.0/110715.0*xyz^122.0-1.0/1637.9999999999998*xyz^28.0-1.0/1637.9999999999998*xyz^28.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0*116480.0*xyz^62.0+x0^4.0*2.013984E7*xyz^34.0-x0^6.0*30240.0*xyz^4.0-48960.0*xyz^14.0-x0^71.0*2.6286624E7*xyz^116.0-165600.0*xyz^22.0-165600.0*xyz^22.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0*116480.0*62.0*xyz^61.0+x0^4.0*2.013984E7*34.0*xyz^33.0-x0^6.0*30240.0*4.0*xyz^3.0-48960.0*14.0*xyz^13.0-x0^71.0*2.6286624E7*116.0*xyz^115.0-165600.0*22.0*xyz^21.0-165600.0*22.0*xyz^21.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0*7221760.0*xyz^61.0+x0^4.0*6.8475456E8*xyz^33.0-x0^6.0*120960.0*xyz^3.0-685440.0*xyz^13.0-x0^71.0*3.049248384E9*xyz^115.0-3643200.0*xyz^21.0-3643200.0*xyz^21.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0/676566.0000000001*xyz^68.0-1.0/17.0*xyz^68.0-0.058823529411764705*xyz^68.0+x0^4.0*0.00728744939271255*xyz^40.0-x0^6.0/5.0*xyz^10.0-0.0017543859649122805*xyz^20.0-x0^71.0/110715.0*xyz^122.0-1.0/1637.9999999999998*xyz^28.0-1.0/1637.9999999999998*xyz^28.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0/676566.0000000001/69.0*xyz^69.0-1.0/17.0/69.0*xyz^69.0-0.058823529411764705/69.0*xyz^69.0+x0^4.0*0.00728744939271255/41.0*xyz^41.0-x0^6.0/5.0/11.0*xyz^11.0-0.0017543859649122805/21.0*xyz^21.0-x0^71.0/110715.0/123.0*xyz^123.0-1.0/1637.9999999999998/29.0*xyz^29.0-1.0/1637.9999999999998/29.0*xyz^29.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0/4.668305400000001E7*xyz^69.0-1.0/1173.0*xyz^69.0-8.525149190110827E-4*xyz^69.0+x0^4.0*1.7774266811494024E-4*xyz^41.0-x0^6.0/55.0*xyz^11.0-8.354218880534669E-5*xyz^21.0-x0^71.0/1.3617945E7*xyz^123.0-1.0/47501.99999999999*xyz^29.0-1.0/47501.99999999999*xyz^29.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131338() {
 UsageCalculus.TestCase = 131338;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "4*x0*1*x0^2/-3*x0^31*xyza^2^2/-3*xyza^3^3-3*xyza^3^34*x0^4/-1*x0^5*+-3*x0^6*4*x0^71*xyza^2^5*+-3*xyza^3^6*4*xyza^1^7-3*xyza^3^6*4*xyza^1^74*x0^71*xyza^2^8/--3*xyza^3^9*+4*xyza^1^10*1*xyza^2-3*xyza^3^9*+4*xyza^1^10*1*xyza^24*x0^10*1*x0";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=337 EqnNumber=38 FamilyID=1 MotifTag=2 Entropy=4 FuncWrapAliasID=2"+
"// MetaRow=[12, 38, 10, 3, 4, 2, 3, 2, 1, 1, 2, 1, 2, 3, 4, 3, 1, 1, 4, 2, 3, 7, 2, 3, 1, 2, 11, 3, 4, 9, 2, 4]"+
"// DOEMatrixRow=[2, 38, 20, 3, 1, 2, 3, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 20, 9, 2, 3, 5, 3, 1, 2, 3, 1, 2, 1, 6, 1]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0/2.25*xyza^10.0+x0^4.0*432.0*xyza^37.0-x0^6.0*144.0*xyza^7.0-12.0*xyza^17.0-x0^71.0*16.0*xyza^119.0-12.0*xyza^25.0-x0^10.0*x0*12.0*xyza^47.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0/2.25*10.0*xyza^9.0+x0^4.0*432.0*37.0*xyza^36.0-x0^6.0*144.0*7.0*xyza^6.0-12.0*17.0*xyza^16.0-x0^71.0*16.0*119.0*xyza^118.0-12.0*25.0*xyza^24.0-x0^10.0*x0*47.0*xyza^46.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0*4.444444444444445*xyza^9.0+x0^4.0*15984.0*xyza^36.0-x0^6.0*1008.0*xyza^6.0-204.0*xyza^16.0-x0^71.0*1904.0*xyza^118.0-300.0*xyza^24.0-x0^10.0*x0*47.0*xyza^46.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0/2.25*xyza^10.0+x0^4.0*432.0*xyza^37.0-x0^6.0*144.0*xyza^7.0-12.0*xyza^17.0-x0^71.0*16.0*xyza^119.0-12.0*xyza^25.0-x0^10.0*x0*12.0*xyza^47.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0/2.25/11.0*xyza^11.0+x0^4.0*432.0/38.0*xyza^38.0-x0^6.0*144.0/8.0*xyza^8.0-12.0/18.0*xyza^18.0-x0^71.0*16.0/120.0*xyza^120.0-12.0/26.0*xyza^26.0-x0^10.0*x0*12.0/48.0*xyza^48.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0*0.04040404040404041*xyza^11.0+x0^4.0*11.368421052631579*xyza^38.0-x0^6.0*18.0*xyza^8.0-0.6666666666666666*xyza^18.0-x0^71.0/7.5*xyza^120.0-0.46153846153846156*xyza^26.0-x0^10.0*x0/4.0*xyza^48.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0*4.444444444444445*xyza^9.0+x0^4.0*15984.0*xyza^36.0-x0^6.0*1008.0*xyza^6.0-204.0*xyza^16.0-x0^71.0*1904.0*xyza^118.0-300.0*xyza^24.0-x0^10.0*x0*47.0*xyza^46.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0*4.444444444444445*9.0*xyza^8.0+x0^4.0*15984.0*36.0*xyza^35.0-x0^6.0*1008.0*6.0*xyza^5.0-204.0*16.0*xyza^15.0-x0^71.0*1904.0*118.0*xyza^117.0-300.0*24.0*xyza^23.0-x0^10.0*x0*46.0*xyza^45.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0*40.0*xyza^8.0+x0^4.0*575424.0*xyza^35.0-x0^6.0*6048.0*xyza^5.0-3264.0*xyza^15.0-x0^71.0*224672.0*xyza^117.0-7200.0*xyza^23.0-x0^10.0*x0*46.0*xyza^45.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0*0.04040404040404041*xyza^11.0+x0^4.0*11.368421052631579*xyza^38.0-x0^6.0*18.0*xyza^8.0-0.6666666666666666*xyza^18.0-x0^71.0/7.5*xyza^120.0-0.46153846153846156*xyza^26.0-x0^10.0*x0/4.0*xyza^48.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0*0.04040404040404041/12.0*xyza^12.0+x0^4.0*11.368421052631579/39.0*xyza^39.0-x0^6.0*18.0/9.0*xyza^9.0-0.6666666666666666/19.0*xyza^19.0-x0^71.0/7.5/121.0*xyza^121.0-0.46153846153846156/27.0*xyza^27.0-x0^10.0*x0/4.0/49.0*xyza^49.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0*0.0033670033670033673*xyza^12.0+x0^4.0*0.291497975708502*xyza^39.0-x0^6.0*2.0*xyza^9.0-0.03508771929824561*xyza^19.0-x0^71.0/907.5*xyza^121.0-0.017094017094017096*xyza^27.0-x0^10.0*x0/196.0*xyza^49.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0*40.0*xyza^8.0+x0^4.0*575424.0*xyza^35.0-x0^6.0*6048.0*xyza^5.0-3264.0*xyza^15.0-x0^71.0*224672.0*xyza^117.0-7200.0*xyza^23.0-x0^10.0*x0*46.0*xyza^45.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0*40.0*8.0*xyza^7.0+x0^4.0*575424.0*35.0*xyza^34.0-x0^6.0*6048.0*5.0*xyza^4.0-3264.0*15.0*xyza^14.0-x0^71.0*224672.0*117.0*xyza^116.0-7200.0*23.0*xyza^22.0-x0^10.0*x0*45.0*xyza^44.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0*320.0*xyza^7.0+x0^4.0*2.013984E7*xyza^34.0-x0^6.0*30240.0*xyza^4.0-48960.0*xyza^14.0-x0^71.0*2.6286624E7*xyza^116.0-165600.0*xyza^22.0-x0^10.0*x0*45.0*xyza^44.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0*0.0033670033670033673*xyza^12.0+x0^4.0*0.291497975708502*xyza^39.0-x0^6.0*2.0*xyza^9.0-0.03508771929824561*xyza^19.0-x0^71.0/907.5*xyza^121.0-0.017094017094017096*xyza^27.0-x0^10.0*x0/196.0*xyza^49.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0*0.0033670033670033673/13.0*xyza^13.0+x0^4.0*0.291497975708502/40.0*xyza^40.0-x0^6.0*2.0/10.0*xyza^10.0-0.03508771929824561/20.0*xyza^20.0-x0^71.0/907.5/122.0*xyza^122.0-0.017094017094017096/28.0*xyza^28.0-x0^10.0*x0/196.0/50.0*xyza^50.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0*2.59000259000259E-4*xyza^13.0+x0^4.0*0.00728744939271255*xyza^40.0-x0^6.0/5.0*xyza^10.0-0.0017543859649122805*xyza^20.0-x0^71.0/110715.0*xyza^122.0-6.105006105006106E-4*xyza^28.0-x0^10.0*x0/9800.0*xyza^50.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0*320.0*xyza^7.0+x0^4.0*2.013984E7*xyza^34.0-x0^6.0*30240.0*xyza^4.0-48960.0*xyza^14.0-x0^71.0*2.6286624E7*xyza^116.0-165600.0*xyza^22.0-x0^10.0*x0*45.0*xyza^44.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0*320.0*7.0*xyza^6.0+x0^4.0*2.013984E7*34.0*xyza^33.0-x0^6.0*30240.0*4.0*xyza^3.0-48960.0*14.0*xyza^13.0-x0^71.0*2.6286624E7*116.0*xyza^115.0-165600.0*22.0*xyza^21.0-x0^10.0*x0*44.0*xyza^43.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0*2240.0*xyza^6.0+x0^4.0*6.8475456E8*xyza^33.0-x0^6.0*120960.0*xyza^3.0-685440.0*xyza^13.0-x0^71.0*3.049248384E9*xyza^115.0-3643200.0*xyza^21.0-x0^10.0*x0*44.0*xyza^43.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0*2.59000259000259E-4*xyza^13.0-4.0*xyza^13.0+x0^4.0*0.00728744939271255*xyza^40.0-x0^6.0/5.0*xyza^10.0-0.0017543859649122805*xyza^20.0-x0^71.0/110715.0*xyza^122.0-6.105006105006106E-4*xyza^28.0-4.0*xyza^28.0-x0^10.0*x0/9800.0*xyza^50.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0*2.59000259000259E-4/14.0*xyza^14.0-4.0/14.0*xyza^14.0+x0^4.0*0.00728744939271255/41.0*xyza^41.0-x0^6.0/5.0/11.0*xyza^11.0-0.0017543859649122805/21.0*xyza^21.0-x0^71.0/110715.0/123.0*xyza^123.0-6.105006105006106E-4/29.0*xyza^29.0-4.0/29.0*xyza^29.0-x0^10.0*x0/9800.0/51.0*xyza^51.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0/54053.99999999999*xyza^14.0-1.0/3.5*xyza^14.0-0.2857142857142857*xyza^14.0+x0^4.0*1.7774266811494024E-4*xyza^41.0-x0^6.0/55.0*xyza^11.0-8.354218880534669E-5*xyza^21.0-x0^71.0/1.3617945E7*xyza^123.0-1.0/47501.99999999999*xyza^29.0-1.0/7.25*xyza^29.0-0.13793103448275862*xyza^29.0-x0^10.0*x0/499800.0*xyza^51.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131339() {
 UsageCalculus.TestCase = 131339;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x^2^2/-3*x^3^3-3*x^3^34*x0^4/-1*x0^5*+-3*x0^6*4*x0^71*x^2^5*+-3*x^3^6*4*x^1^7-3*x^3^6*4*x^1^74*x0^71*x^2^8/--3*x^3^9*+4*x^1^10*1*x^2-3*x^3^9*+4*x^1^10*1*x^24*x0^10*1*x01*x^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=338 EqnNumber=39 FamilyID=2 MotifTag=3 Entropy=1 FuncWrapAliasID=3"+
"// MetaRow=[12, 39, 10, 2, 1, 3, 1, 3, 2, 3, 4, 2, 3, 1, 1, 1, 2, 1, 5, 3, 4, 8, 3, 1, 2, 3, 12, 1, 1, 10, 3, 5]"+
"// DOEMatrixRow=[2, 39, 20, 2, 3, 1, 1, 2, 1, 1, 2, 1, 2, 3, 4, 2, 3, 21, 10, 3, 1, 1, 1, 2, 3, 4, 2, 3, 2, 7, 2]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-1.0/3.0*x^10.0+432.0*x^37.0-144.0*x^7.0-12.0*x^17.0-16.0*x^119.0-12.0*x^25.0-12.0*x^49.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-1.0/3.0*10.0*x^9.0+432.0*37.0*x^36.0-144.0*7.0*x^6.0-12.0*17.0*x^16.0-16.0*119.0*x^118.0-12.0*25.0*x^24.0-12.0*49.0*x^48.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-3.3333333333333335*x^9.0+15984.0*x^36.0-1008.0*x^6.0-204.0*x^16.0-1904.0*x^118.0-300.0*x^24.0-588.0*x^48.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-1.0/3.0*x^10.0+432.0*x^37.0-144.0*x^7.0-12.0*x^17.0-16.0*x^119.0-12.0*x^25.0-12.0*x^49.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.0/3.0/11.0*x^11.0+432.0/38.0*x^38.0-144.0/8.0*x^8.0-12.0/18.0*x^18.0-16.0/120.0*x^120.0-12.0/26.0*x^26.0-12.0/50.0*x^50.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/33.0*x^11.0+11.368421052631579*x^38.0-18.0*x^8.0-1.0/1.5*x^18.0-1.0/7.5*x^120.0-1.0/2.1666666666666665*x^26.0-1.0/4.166666666666667*x^50.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-3.3333333333333335*x^9.0+15984.0*x^36.0-1008.0*x^6.0-204.0*x^16.0-1904.0*x^118.0-300.0*x^24.0-588.0*x^48.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-3.3333333333333335*9.0*x^8.0+15984.0*36.0*x^35.0-1008.0*6.0*x^5.0-204.0*16.0*x^15.0-1904.0*118.0*x^117.0-300.0*24.0*x^23.0-588.0*48.0*x^47.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-30.0*x^8.0+575424.0*x^35.0-6048.0*x^5.0-3264.0*x^15.0-224672.0*x^117.0-7200.0*x^23.0-28224.0*x^47.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/33.0*x^11.0+11.368421052631579*x^38.0-18.0*x^8.0-1.0/1.5*x^18.0-1.0/7.5*x^120.0-1.0/2.1666666666666665*x^26.0-1.0/4.166666666666667*x^50.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/33.0/12.0*x^12.0+11.368421052631579/39.0*x^39.0-18.0/9.0*x^9.0-1.0/1.5/19.0*x^19.0-1.0/7.5/121.0*x^121.0-1.0/2.1666666666666665/27.0*x^27.0-1.0/4.166666666666667/51.0*x^51.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/396.0*x^12.0+1.0/3.430555555555556*x^39.0-2.0*x^9.0-1.0/28.5*x^19.0-1.0/907.5*x^121.0-1.0/58.49999999999999*x^27.0-1.0/212.50000000000003*x^51.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-30.0*x^8.0+575424.0*x^35.0-6048.0*x^5.0-3264.0*x^15.0-224672.0*x^117.0-7200.0*x^23.0-28224.0*x^47.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-30.0*8.0*x^7.0+575424.0*35.0*x^34.0-6048.0*5.0*x^4.0-3264.0*15.0*x^14.0-224672.0*117.0*x^116.0-7200.0*23.0*x^22.0-28224.0*47.0*x^46.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-240.0*x^7.0+2.013984E7*x^34.0-30240.0*x^4.0-48960.0*x^14.0-2.6286624E7*x^116.0-165600.0*x^22.0-1326528.0*x^46.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/396.0*x^12.0+1.0/3.430555555555556*x^39.0-2.0*x^9.0-1.0/28.5*x^19.0-1.0/907.5*x^121.0-1.0/58.49999999999999*x^27.0-1.0/212.50000000000003*x^51.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/396.0/13.0*x^13.0+1.0/3.430555555555556/40.0*x^40.0-2.0/10.0*x^10.0-1.0/28.5/20.0*x^20.0-1.0/907.5/122.0*x^122.0-1.0/58.49999999999999/28.0*x^28.0-1.0/212.50000000000003/52.0*x^52.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/5148.0*x^13.0+1.0/137.22222222222223*x^40.0-1.0/5.0*x^10.0-1.0/570.0*x^20.0-1.0/110715.0*x^122.0-1.0/1637.9999999999998*x^28.0-1.0/11050.000000000002*x^52.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-240.0*x^7.0+2.013984E7*x^34.0-30240.0*x^4.0-48960.0*x^14.0-2.6286624E7*x^116.0-165600.0*x^22.0-1326528.0*x^46.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-240.0*7.0*x^6.0+34.0*x^33.0-30240.0*4.0*x^3.0-48960.0*14.0*x^13.0-116.0*x^115.0-165600.0*22.0*x^21.0-1326528.0*46.0*x^45.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1680.0*x^6.0+34.0*x^33.0-120960.0*x^3.0-685440.0*x^13.0-116.0*x^115.0-3643200.0*x^21.0-6.1020288E7*x^45.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/5148.0*x^13.0+1.0/137.22222222222223*x^40.0-1.0/5.0*x^10.0-1.0/570.0*x^20.0-1.0/110715.0*x^122.0-1.0/1637.9999999999998*x^28.0-1.0/11050.000000000002*x^52.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/5148.0/14.0*x^14.0+1.0/137.22222222222223/41.0*x^41.0-1.0/5.0/11.0*x^11.0-1.0/570.0/21.0*x^21.0-1.0/110715.0/123.0*x^123.0-1.0/1637.9999999999998/29.0*x^29.0-1.0/11050.000000000002/53.0*x^53.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/72072.0*x^14.0+1.0/5626.111111111111*x^41.0-1.0/55.0*x^11.0-1.0/11970.0*x^21.0-1.0/1.3617945E7*x^123.0-1.0/47501.99999999999*x^29.0-1.0/585650.0000000001*x^53.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131340() {
 UsageCalculus.TestCase = 131340;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xy^3^34*x0^4/-1*x0^5*+-3*x0^6*4*x0^71*xy^2^5*+-3*xy^3^6*4*xy^1^7-3*xy^3^6*4*xy^1^74*x0^71*xy^2^8/--3*xy^3^9*+4*xy^1^10*1*xy^2-3*xy^3^9*+4*xy^1^10*1*xy^24*x0^10*1*x01*xy^2-3*xy^3^2*-4*xy^1^3/-1*xy^2^4*+-3*xy^3^5";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=339 EqnNumber=40 FamilyID=3 MotifTag=4 Entropy=3 FuncWrapAliasID=4"+
"// MetaRow=[12, 40, 10, 1, 2, 1, 2, 4, 3, 4, 1, 1, 1, 2, 3, 2, 3, 2, 1, 1, 1, 9, 1, 2, 3, 4, 13, 2, 3, 11, 4, 6]"+
"// DOEMatrixRow=[2, 40, 19, 1, 2, 3, 2, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 22, 1, 1, 2, 3, 2, 3, 4, 1, 3, 1, 3, 8, 1]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^4.0*432.0*xy^37.0-x0^6.0*144.0*xy^7.0-12.0*xy^17.0-x0^71.0*16.0*xy^119.0-12.0*xy^25.0-x0^10.0*x01*12.0*xy^49.0-36.0*xy^15.0-3.0*xy^8.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^4.0*432.0*37.0*xy^36.0-x0^6.0*144.0*7.0*xy^6.0-12.0*17.0*xy^16.0-x0^71.0*16.0*119.0*xy^118.0-12.0*25.0*xy^24.0-x0^10.0*x01*12.0*49.0*xy^48.0-36.0*15.0*xy^14.0-3.0*8.0*xy^7.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^4.0*15984.0*xy^36.0-x0^6.0*1008.0*xy^6.0-204.0*xy^16.0-x0^71.0*1904.0*xy^118.0-300.0*xy^24.0-x0^10.0*x01*588.0*xy^48.0-540.0*xy^14.0-24.0*xy^7.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^4.0*432.0*xy^37.0-x0^6.0*144.0*xy^7.0-12.0*xy^17.0-x0^71.0*16.0*xy^119.0-12.0*xy^25.0-x0^10.0*x01*12.0*xy^49.0-36.0*xy^15.0-3.0*xy^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^4.0*432.0/38.0*xy^38.0-x0^6.0*144.0/8.0*xy^8.0-12.0/18.0*xy^18.0-x0^71.0*16.0/120.0*xy^120.0-12.0/26.0*xy^26.0-x0^10.0*x01*12.0/50.0*xy^50.0-36.0/16.0*xy^16.0-3.0/9.0*xy^9.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^4.0*11.368421052631579*xy^38.0-x0^6.0*18.0*xy^8.0-0.6666666666666666*xy^18.0-x0^71.0/7.5*xy^120.0-0.46153846153846156*xy^26.0-x0^10.0*x01/4.166666666666667*xy^50.0-2.25*xy^16.0-1.0/3.0*xy^9.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^4.0*15984.0*xy^36.0-x0^6.0*1008.0*xy^6.0-204.0*xy^16.0-x0^71.0*1904.0*xy^118.0-300.0*xy^24.0-x0^10.0*x01*588.0*xy^48.0-540.0*xy^14.0-24.0*xy^7.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^4.0*15984.0*36.0*xy^35.0-x0^6.0*1008.0*6.0*xy^5.0-204.0*16.0*xy^15.0-x0^71.0*1904.0*118.0*xy^117.0-300.0*24.0*xy^23.0-x0^10.0*x01*588.0*48.0*xy^47.0-540.0*14.0*xy^13.0-24.0*7.0*xy^6.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^4.0*575424.0*xy^35.0-x0^6.0*6048.0*xy^5.0-3264.0*xy^15.0-x0^71.0*224672.0*xy^117.0-7200.0*xy^23.0-x0^10.0*x01*28224.0*xy^47.0-7560.0*xy^13.0-168.0*xy^6.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^4.0*11.368421052631579*xy^38.0-x0^6.0*18.0*xy^8.0-0.6666666666666666*xy^18.0-x0^71.0/7.5*xy^120.0-0.46153846153846156*xy^26.0-x0^10.0*x01/4.166666666666667*xy^50.0-2.25*xy^16.0-1.0/3.0*xy^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^4.0*11.368421052631579/39.0*xy^39.0-x0^6.0*18.0/9.0*xy^9.0-0.6666666666666666/19.0*xy^19.0-x0^71.0/7.5/121.0*xy^121.0-0.46153846153846156/27.0*xy^27.0-x0^10.0*x01/4.166666666666667/51.0*xy^51.0-2.25/17.0*xy^17.0-1.0/3.0/10.0*xy^10.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^4.0*0.291497975708502*xy^39.0-x0^6.0*2.0*xy^9.0-0.03508771929824561*xy^19.0-x0^71.0/907.5*xy^121.0-0.017094017094017096*xy^27.0-x0^10.0*x01/212.50000000000003*xy^51.0-1.0/7.555555555555555*xy^17.0-1.0/30.0*xy^10.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^4.0*575424.0*xy^35.0-x0^6.0*6048.0*xy^5.0-3264.0*xy^15.0-x0^71.0*224672.0*xy^117.0-7200.0*xy^23.0-x0^10.0*x01*28224.0*xy^47.0-7560.0*xy^13.0-168.0*xy^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^4.0*575424.0*35.0*xy^34.0-x0^6.0*6048.0*5.0*xy^4.0-3264.0*15.0*xy^14.0-x0^71.0*224672.0*117.0*xy^116.0-7200.0*23.0*xy^22.0-x0^10.0*x01*28224.0*47.0*xy^46.0-7560.0*13.0*xy^12.0-168.0*6.0*xy^5.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^4.0*2.013984E7*xy^34.0-x0^6.0*30240.0*xy^4.0-48960.0*xy^14.0-x0^71.0*2.6286624E7*xy^116.0-165600.0*xy^22.0-x0^10.0*x01*1326528.0*xy^46.0-98280.0*xy^12.0-1008.0*xy^5.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^4.0*0.291497975708502*xy^39.0-x0^6.0*2.0*xy^9.0-0.03508771929824561*xy^19.0-x0^71.0/907.5*xy^121.0-0.017094017094017096*xy^27.0-x0^10.0*x01/212.50000000000003*xy^51.0-1.0/7.555555555555555*xy^17.0-1.0/30.0*xy^10.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^4.0*0.291497975708502/40.0*xy^40.0-x0^6.0*2.0/10.0*xy^10.0-0.03508771929824561/20.0*xy^20.0-x0^71.0/907.5/122.0*xy^122.0-0.017094017094017096/28.0*xy^28.0-x0^10.0*x01/212.50000000000003/52.0*xy^52.0-1.0/7.555555555555555/18.0*xy^18.0-1.0/30.0/11.0*xy^11.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^4.0*0.00728744939271255*xy^40.0-x0^6.0/5.0*xy^10.0-0.0017543859649122805*xy^20.0-x0^71.0/110715.0*xy^122.0-6.105006105006106E-4*xy^28.0-x0^10.0*x01/11050.000000000002*xy^52.0-1.0/136.0*xy^18.0-1.0/330.0*xy^11.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^4.0*2.013984E7*xy^34.0-x0^6.0*30240.0*xy^4.0-48960.0*xy^14.0-x0^71.0*2.6286624E7*xy^116.0-165600.0*xy^22.0-x0^10.0*x01*1326528.0*xy^46.0-98280.0*xy^12.0-1008.0*xy^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^4.0*2.013984E7*34.0*xy^33.0-x0^6.0*30240.0*4.0*xy^3.0-48960.0*14.0*xy^13.0-x0^71.0*2.6286624E7*116.0*xy^115.0-165600.0*22.0*xy^21.0-x0^10.0*x01*1326528.0*46.0*xy^45.0-98280.0*12.0*xy^11.0-1008.0*5.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^4.0*6.8475456E8*xy^33.0-x0^6.0*120960.0*xy^3.0-685440.0*xy^13.0-x0^71.0*3.049248384E9*xy^115.0-3643200.0*xy^21.0-x0^10.0*x01*6.1020288E7*xy^45.0-1179360.0*xy^11.0-5040.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^4.0*0.00728744939271255*xy^40.0-x0^6.0/5.0*xy^10.0-0.0017543859649122805*xy^20.0-x0^71.0/110715.0*xy^122.0-6.105006105006106E-4*xy^28.0-4.0*xy^28.0-x0^10.0*x01/11050.000000000002*xy^52.0-1.0/136.0*xy^18.0-1.0/330.0*xy^11.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^4.0*0.00728744939271255/41.0*xy^41.0-x0^6.0/5.0/11.0*xy^11.0-0.0017543859649122805/21.0*xy^21.0-x0^71.0/110715.0/123.0*xy^123.0-6.105006105006106E-4/29.0*xy^29.0-4.0/29.0*xy^29.0-x0^10.0*x01/11050.000000000002/53.0*xy^53.0-1.0/136.0/19.0*xy^19.0-1.0/330.0/12.0*xy^12.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^4.0*1.7774266811494024E-4*xy^41.0-x0^6.0/55.0*xy^11.0-8.354218880534669E-5*xy^21.0-x0^71.0/1.3617945E7*xy^123.0-1.0/47501.99999999999*xy^29.0-1.0/7.25*xy^29.0-0.13793103448275862*xy^29.0-x0^10.0*x01/585650.0000000001*xy^53.0-1.0/2584.0*xy^19.0-1.0/3960.0*xy^12.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131341() {
 UsageCalculus.TestCase = 131341;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "4*x0^4/-1*x0^5*+-3*x0^6*4*x0^71*xyz^2^5*+-3*xyz^3^6*4*xyz^1^7-3*xyz^3^6*4*xyz^1^74*x0^71*xyz^2^8/--3*xyz^3^9*+4*xyz^1^10*1*xyz^2-3*xyz^3^9*+4*xyz^1^10*1*xyz^24*x0^10*1*x01*xyz^2-3*xyz^3^2*-4*xyz^1^3/-1*xyz^2^4*+-3*xyz^3^54*x0^3/-1*x0^4*+-3*x0^5";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=340 EqnNumber=41 FamilyID=1 MotifTag=1 Entropy=4 FuncWrapAliasID=1"+
"// MetaRow=[12, 41, 10, 20, 3, 2, 3, 5, 1, 1, 2, 1, 2, 3, 4, 3, 1, 1, 2, 3, 2, 10, 2, 3, 1, 1, 14, 3, 4, 12, 1, 7]"+
"// DOEMatrixRow=[3, 41, 19, 4, 3, 1, 3, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 23, 2, 3, 1, 4, 3, 1, 5, 2, 1, 2, 4, 9, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^4.0*576.0-x0^6.0*144.0*xyz^7.0-12.0*xyz^17.0-x0^71.0*16.0*xyz^119.0-12.0*xyz^25.0-x0^10.0*x01*12.0*xyz^49.0-108.0*xyz^15.0+x0^3.0*9.0*xyz^57.0-x0^5.0*3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^4.0*576.0*0.0-x0^6.0*144.0*7.0*xyz^6.0-12.0*17.0*xyz^16.0-x0^71.0*16.0*119.0*xyz^118.0-12.0*25.0*xyz^24.0-x0^10.0*x01*12.0*49.0*xyz^48.0-108.0*15.0*xyz^14.0+x0^3.0*9.0*57.0*xyz^56.0-x0^5.0*3.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^4.0*0.0-x0^6.0*1008.0*xyz^6.0-204.0*xyz^16.0-x0^71.0*1904.0*xyz^118.0-300.0*xyz^24.0-x0^10.0*x01*588.0*xyz^48.0-1620.0*xyz^14.0+x0^3.0*513.0*xyz^56.0-x0^5.0*0.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^4.0*576.0-x0^6.0*144.0*xyz^7.0-12.0*xyz^17.0-x0^71.0*16.0*xyz^119.0-12.0*xyz^25.0-x0^10.0*x01*12.0*xyz^49.0-108.0*xyz^15.0+x0^3.0*9.0*xyz^57.0-x0^5.0*3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^4.0*576.0*xyz-x0^6.0*144.0/8.0*xyz^8.0-12.0/18.0*xyz^18.0-x0^71.0*16.0/120.0*xyz^120.0-12.0/26.0*xyz^26.0-x0^10.0*x01*12.0/50.0*xyz^50.0-108.0/16.0*xyz^16.0+x0^3.0*9.0/58.0*xyz^58.0-x0^5.0*3.0*xyz";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^4.0*576.0*xyz-x0^6.0*18.0*xyz^8.0-0.6666666666666666*xyz^18.0-x0^71.0/7.5*xyz^120.0-0.46153846153846156*xyz^26.0-x0^10.0*x01/4.166666666666667*xyz^50.0-6.75*xyz^16.0+x0^3.0*0.15517241379310345*xyz^58.0-x0^5.0*3.0*xyz";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^4.0*0.0-x0^6.0*1008.0*xyz^6.0-204.0*xyz^16.0-x0^71.0*1904.0*xyz^118.0-300.0*xyz^24.0-x0^10.0*x01*588.0*xyz^48.0-1620.0*xyz^14.0+x0^3.0*513.0*xyz^56.0-x0^5.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^4.0*0.0-x0^6.0*1008.0*6.0*xyz^5.0-204.0*16.0*xyz^15.0-x0^71.0*1904.0*118.0*xyz^117.0-300.0*24.0*xyz^23.0-x0^10.0*x01*588.0*48.0*xyz^47.0-1620.0*14.0*xyz^13.0+x0^3.0*513.0*56.0*xyz^55.0-x0^5.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^4.0*0.0-x0^6.0*6048.0*xyz^5.0-3264.0*xyz^15.0-x0^71.0*224672.0*xyz^117.0-7200.0*xyz^23.0-x0^10.0*x01*28224.0*xyz^47.0-22680.0*xyz^13.0+x0^3.0*28728.0*xyz^55.0-x0^5.0*0.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^4.0*576.0*xyz-x0^6.0*18.0*xyz^8.0-0.6666666666666666*xyz^18.0-x0^71.0/7.5*xyz^120.0-0.46153846153846156*xyz^26.0-x0^10.0*x01/4.166666666666667*xyz^50.0-6.75*xyz^16.0+x0^3.0*0.15517241379310345*xyz^58.0-x0^5.0*3.0*xyz";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^4.0*576.0/2.0*xyz^2.0-x0^6.0*18.0/9.0*xyz^9.0-0.6666666666666666/19.0*xyz^19.0-x0^71.0/7.5/121.0*xyz^121.0-0.46153846153846156/27.0*xyz^27.0-x0^10.0*x01/4.166666666666667/51.0*xyz^51.0-6.75/17.0*xyz^17.0+x0^3.0*0.15517241379310345/59.0*xyz^59.0-x0^5.0*3.0/2.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^4.0*288.0*xyz^2.0-x0^6.0*2.0*xyz^9.0-0.03508771929824561*xyz^19.0-x0^71.0/907.5*xyz^121.0-0.017094017094017096*xyz^27.0-x0^10.0*x01/212.50000000000003*xyz^51.0-0.39705882352941174*xyz^17.0+x0^3.0*0.002630040911747516*xyz^59.0-x0^5.0*1.5*xyz^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^4.0*0.0-x0^6.0*6048.0*xyz^5.0-3264.0*xyz^15.0-x0^71.0*224672.0*xyz^117.0-7200.0*xyz^23.0-x0^10.0*x01*28224.0*xyz^47.0-22680.0*xyz^13.0+x0^3.0*28728.0*xyz^55.0-x0^5.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^4.0*0.0-x0^6.0*6048.0*5.0*xyz^4.0-3264.0*15.0*xyz^14.0-x0^71.0*224672.0*117.0*xyz^116.0-7200.0*23.0*xyz^22.0-x0^10.0*x01*28224.0*47.0*xyz^46.0-22680.0*13.0*xyz^12.0+x0^3.0*28728.0*55.0*xyz^54.0-x0^5.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^4.0*0.0-x0^6.0*30240.0*xyz^4.0-48960.0*xyz^14.0-x0^71.0*2.6286624E7*xyz^116.0-165600.0*xyz^22.0-x0^10.0*x01*1326528.0*xyz^46.0-294840.0*xyz^12.0+x0^3.0*1580040.0*xyz^54.0-x0^5.0*0.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^4.0*288.0*xyz^2.0-x0^6.0*2.0*xyz^9.0-0.03508771929824561*xyz^19.0-x0^71.0/907.5*xyz^121.0-0.017094017094017096*xyz^27.0-x0^10.0*x01/212.50000000000003*xyz^51.0-0.39705882352941174*xyz^17.0+x0^3.0*0.002630040911747516*xyz^59.0-x0^5.0*1.5*xyz^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^4.0*288.0/3.0*xyz^3.0-x0^6.0*2.0/10.0*xyz^10.0-0.03508771929824561/20.0*xyz^20.0-x0^71.0/907.5/122.0*xyz^122.0-0.017094017094017096/28.0*xyz^28.0-x0^10.0*x01/212.50000000000003/52.0*xyz^52.0-0.39705882352941174/18.0*xyz^18.0+x0^3.0*0.002630040911747516/60.0*xyz^60.0-x0^5.0*1.5/3.0*xyz^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^4.0*96.0*xyz^3.0-x0^6.0/5.0*xyz^10.0-0.0017543859649122805*xyz^20.0-x0^71.0/110715.0*xyz^122.0-6.105006105006106E-4*xyz^28.0-x0^10.0*x01/11050.000000000002*xyz^52.0-0.022058823529411763*xyz^18.0+x0^3.0*4.383401519579194E-5*xyz^60.0-x0^5.0/2.0*xyz^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^4.0*0.0-x0^6.0*30240.0*xyz^4.0-48960.0*xyz^14.0-x0^71.0*2.6286624E7*xyz^116.0-165600.0*xyz^22.0-x0^10.0*x01*1326528.0*xyz^46.0-294840.0*xyz^12.0+x0^3.0*1580040.0*xyz^54.0-x0^5.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^4.0*0.0-x0^6.0*30240.0*4.0*xyz^3.0-48960.0*14.0*xyz^13.0-x0^71.0*2.6286624E7*116.0*xyz^115.0-165600.0*22.0*xyz^21.0-x0^10.0*x01*1326528.0*46.0*xyz^45.0-294840.0*12.0*xyz^11.0+x0^3.0*1580040.0*54.0*xyz^53.0-x0^5.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^4.0*0.0-x0^6.0*120960.0*xyz^3.0-685440.0*xyz^13.0-x0^71.0*3.049248384E9*xyz^115.0-3643200.0*xyz^21.0-x0^10.0*x01*6.1020288E7*xyz^45.0-3538080.0*xyz^11.0+x0^3.0*8.532216E7*xyz^53.0-x0^5.0*0.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^4.0*96.0*xyz^3.0-x0^6.0/5.0*xyz^10.0-0.0017543859649122805*xyz^20.0-x0^71.0/110715.0*xyz^122.0-6.105006105006106E-4*xyz^28.0-4.0*xyz^28.0-x0^10.0*x01/11050.000000000002*xyz^52.0-0.022058823529411763*xyz^18.0+x0^3.0*4.383401519579194E-5*xyz^60.0-5.0*xyz^60.0-x0^5.0/2.0*xyz^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^4.0*96.0/4.0*xyz^4.0-x0^6.0/5.0/11.0*xyz^11.0-0.0017543859649122805/21.0*xyz^21.0-x0^71.0/110715.0/123.0*xyz^123.0-6.105006105006106E-4/29.0*xyz^29.0-4.0/29.0*xyz^29.0-x0^10.0*x01/11050.000000000002/53.0*xyz^53.0-0.022058823529411763/19.0*xyz^19.0+x0^3.0*4.383401519579194E-5/61.0*xyz^61.0-5.0/61.0*xyz^61.0-x0^5.0*2.0/4.0*xyz^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^4.0*24.0*xyz^4.0-x0^6.0/55.0*xyz^11.0-8.354218880534669E-5*xyz^21.0-x0^71.0/1.3617945E7*xyz^123.0-1.0/47501.99999999999*xyz^29.0-1.0/7.25*xyz^29.0-0.13793103448275862*xyz^29.0-x0^10.0*x01/585650.0000000001*xyz^53.0-0.0011609907120743034*xyz^19.0+x0^3.0/1391613.3333333333*xyz^61.0-1.0/12.2*xyz^61.0-0.08196721311475409*xyz^61.0-x0^5.0/2.0*xyz^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131342() {
 UsageCalculus.TestCase = 131342;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xyza^2^5*+-3*xyza^3^6*4*xyza^1^7-3*xyza^3^6*4*xyza^1^74*x0^71*xyza^2^8/--3*xyza^3^9*+4*xyza^1^10*1*xyza^2-3*xyza^3^9*+4*xyza^1^10*1*xyza^24*x0^10*1*x01*xyza^2-3*xyza^3^2*-4*xyza^1^3/-1*xyza^2^4*+-3*xyza^3^54*x0^3/-1*x0^4*+-3*x0^51*xyza^2^4*+-3*xyza^3^5";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=341 EqnNumber=42 FamilyID=2 MotifTag=3 Entropy=1 FuncWrapAliasID=3"+
"// MetaRow=[12, 42, 10, 19, 4, 3, 1, 6, 2, 3, 4, 2, 3, 1, 1, 1, 2, 1, 3, 1, 3, 11, 3, 1, 2, 3, 15, 1, 1, 13, 2, 8]"+
"// DOEMatrixRow=[3, 42, 19, 3, 1, 2, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 24, 3, 1, 2, 5, 1, 2, 6, 3, 2, 3, 1, 10, 1]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "12.0*xyza^7.0-12.0*xyza^17.0-x0^71.0*16.0*xyza^119.0-12.0*xyza^25.0-x0^10.0*x01*12.0*xyza^49.0-324.0*xyza^15.0+x0^3.0*27.0*xyza^57.0-x0^51.0*9.0*xyza^6.0-3.0*xyza^8.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "12.0*7.0*xyza^6.0-12.0*17.0*xyza^16.0-x0^71.0*16.0*119.0*xyza^118.0-12.0*25.0*xyza^24.0-x0^10.0*x01*12.0*49.0*xyza^48.0-324.0*15.0*xyza^14.0+x0^3.0*27.0*57.0*xyza^56.0-x0^51.0*9.0*6.0*xyza^5.0-3.0*8.0*xyza^7.0";
 UsageCalculus.EqnSolArrayMap2[1] = "84.0*xyza^6.0-204.0*xyza^16.0-x0^71.0*1904.0*xyza^118.0-300.0*xyza^24.0-x0^10.0*x01*588.0*xyza^48.0-4860.0*xyza^14.0+x0^3.0*1539.0*xyza^56.0-x0^51.0*54.0*xyza^5.0-24.0*xyza^7.0";
 UsageCalculus.EqnSolArrayMap3[1] = "12.0*xyza^7.0-12.0*xyza^17.0-x0^71.0*16.0*xyza^119.0-12.0*xyza^25.0-x0^10.0*x01*12.0*xyza^49.0-324.0*xyza^15.0+x0^3.0*27.0*xyza^57.0-x0^51.0*9.0*xyza^6.0-3.0*xyza^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "12.0/8.0*xyza^8.0-12.0/18.0*xyza^18.0-x0^71.0*16.0/120.0*xyza^120.0-12.0/26.0*xyza^26.0-x0^10.0*x01*12.0/50.0*xyza^50.0-324.0/16.0*xyza^16.0+x0^3.0*27.0/58.0*xyza^58.0-x0^51.0*9.0/7.0*xyza^7.0-3.0/9.0*xyza^9.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.5*xyza^8.0-0.6666666666666666*xyza^18.0-x0^71.0/7.5*xyza^120.0-0.46153846153846156*xyza^26.0-x0^10.0*x01/4.166666666666667*xyza^50.0-20.25*xyza^16.0+x0^3.0*0.46551724137931033*xyza^58.0-x0^51.0*1.2857142857142858*xyza^7.0-1.0/3.0*xyza^9.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "84.0*xyza^6.0-204.0*xyza^16.0-x0^71.0*1904.0*xyza^118.0-300.0*xyza^24.0-x0^10.0*x01*588.0*xyza^48.0-4860.0*xyza^14.0+x0^3.0*1539.0*xyza^56.0-x0^51.0*54.0*xyza^5.0-24.0*xyza^7.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "84.0*6.0*xyza^5.0-204.0*16.0*xyza^15.0-x0^71.0*1904.0*118.0*xyza^117.0-300.0*24.0*xyza^23.0-x0^10.0*x01*588.0*48.0*xyza^47.0-4860.0*14.0*xyza^13.0+x0^3.0*1539.0*56.0*xyza^55.0-x0^51.0*54.0*5.0*xyza^4.0-24.0*7.0*xyza^6.0";
 UsageCalculus.EqnSolArrayMap2[2] = "504.0*xyza^5.0-3264.0*xyza^15.0-x0^71.0*224672.0*xyza^117.0-7200.0*xyza^23.0-x0^10.0*x01*28224.0*xyza^47.0-68040.0*xyza^13.0+x0^3.0*86184.0*xyza^55.0-x0^51.0*270.0*xyza^4.0-168.0*xyza^6.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.5*xyza^8.0-0.6666666666666666*xyza^18.0-x0^71.0/7.5*xyza^120.0-0.46153846153846156*xyza^26.0-x0^10.0*x01/4.166666666666667*xyza^50.0-20.25*xyza^16.0+x0^3.0*0.46551724137931033*xyza^58.0-x0^51.0*1.2857142857142858*xyza^7.0-1.0/3.0*xyza^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.5/9.0*xyza^9.0-0.6666666666666666/19.0*xyza^19.0-x0^71.0/7.5/121.0*xyza^121.0-0.46153846153846156/27.0*xyza^27.0-x0^10.0*x01/4.166666666666667/51.0*xyza^51.0-20.25/17.0*xyza^17.0+x0^3.0*0.46551724137931033/59.0*xyza^59.0-x0^51.0*1.2857142857142858/8.0*xyza^8.0-1.0/3.0/10.0*xyza^10.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/6.0*xyza^9.0-0.03508771929824561*xyza^19.0-x0^71.0/907.5*xyza^121.0-0.017094017094017096*xyza^27.0-x0^10.0*x01/212.50000000000003*xyza^51.0-1.1911764705882353*xyza^17.0+x0^3.0*0.007890122735242549*xyza^59.0-x0^51.0/6.222222222222221*xyza^8.0-1.0/30.0*xyza^10.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "504.0*xyza^5.0-3264.0*xyza^15.0-x0^71.0*224672.0*xyza^117.0-7200.0*xyza^23.0-x0^10.0*x01*28224.0*xyza^47.0-68040.0*xyza^13.0+x0^3.0*86184.0*xyza^55.0-x0^51.0*270.0*xyza^4.0-168.0*xyza^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "504.0*5.0*xyza^4.0-3264.0*15.0*xyza^14.0-x0^71.0*224672.0*117.0*xyza^116.0-7200.0*23.0*xyza^22.0-x0^10.0*x01*28224.0*47.0*xyza^46.0-68040.0*13.0*xyza^12.0+x0^3.0*86184.0*55.0*xyza^54.0-x0^51.0*270.0*4.0*xyza^3.0-168.0*6.0*xyza^5.0";
 UsageCalculus.EqnSolArrayMap2[3] = "2520.0*xyza^4.0-48960.0*xyza^14.0-x0^71.0*2.6286624E7*xyza^116.0-165600.0*xyza^22.0-x0^10.0*x01*1326528.0*xyza^46.0-884520.0*xyza^12.0+x0^3.0*4740120.0*xyza^54.0-x0^51.0*1080.0*xyza^3.0-1008.0*xyza^5.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/6.0*xyza^9.0-0.03508771929824561*xyza^19.0-x0^71.0/907.5*xyza^121.0-0.017094017094017096*xyza^27.0-x0^10.0*x01/212.50000000000003*xyza^51.0-1.1911764705882353*xyza^17.0+x0^3.0*0.007890122735242549*xyza^59.0-x0^51.0/6.222222222222221*xyza^8.0-1.0/30.0*xyza^10.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/6.0/10.0*xyza^10.0-0.03508771929824561/20.0*xyza^20.0-x0^71.0/907.5/122.0*xyza^122.0-0.017094017094017096/28.0*xyza^28.0-x0^10.0*x01/212.50000000000003/52.0*xyza^52.0-1.1911764705882353/18.0*xyza^18.0+x0^3.0*0.007890122735242549/60.0*xyza^60.0-x0^51.0/6.222222222222221/9.0*xyza^9.0-1.0/30.0/11.0*xyza^11.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/60.0*xyza^10.0-0.0017543859649122805*xyza^20.0-x0^71.0/110715.0*xyza^122.0-6.105006105006106E-4*xyza^28.0-x0^10.0*x01/11050.000000000002*xyza^52.0-0.0661764705882353*xyza^18.0+x0^3.0*1.315020455873758E-4*xyza^60.0-x0^51.0/55.99999999999999*xyza^9.0-1.0/330.0*xyza^11.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "2520.0*xyza^4.0-48960.0*xyza^14.0-x0^71.0*2.6286624E7*xyza^116.0-165600.0*xyza^22.0-x0^10.0*x01*1326528.0*xyza^46.0-884520.0*xyza^12.0+x0^3.0*4740120.0*xyza^54.0-x0^51.0*1080.0*xyza^3.0-1008.0*xyza^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "2520.0*4.0*xyza^3.0-48960.0*14.0*xyza^13.0-x0^71.0*2.6286624E7*116.0*xyza^115.0-165600.0*22.0*xyza^21.0-x0^10.0*x01*1326528.0*46.0*xyza^45.0-884520.0*12.0*xyza^11.0+x0^3.0*4740120.0*54.0*xyza^53.0-x0^51.0*1080.0*3.0*xyza^2.0-1008.0*5.0*xyza^4.0";
 UsageCalculus.EqnSolArrayMap2[4] = "10080.0*xyza^3.0-685440.0*xyza^13.0-x0^71.0*3.049248384E9*xyza^115.0-3643200.0*xyza^21.0-x0^10.0*x01*6.1020288E7*xyza^45.0-1.061424E7*xyza^11.0+x0^3.0*2.5596648E8*xyza^53.0-x0^51.0*3240.0*xyza^2.0-5040.0*xyza^4.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/60.0*xyza^10.0-0.0017543859649122805*xyza^20.0-x0^71.0/110715.0*xyza^122.0-6.105006105006106E-4*xyza^28.0-4.0*xyza^28.0-x0^10.0*x01/11050.000000000002*xyza^52.0-0.0661764705882353*xyza^18.0+x0^3.0*1.315020455873758E-4*xyza^60.0-4.0*xyza^60.0-x0^51.0/55.99999999999999*xyza^9.0-1.0/330.0*xyza^11.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/60.0/11.0*xyza^11.0-0.0017543859649122805/21.0*xyza^21.0-x0^71.0/110715.0/123.0*xyza^123.0-6.105006105006106E-4/29.0*xyza^29.0-4.0/29.0*xyza^29.0-x0^10.0*x01/11050.000000000002/53.0*xyza^53.0-0.0661764705882353/19.0*xyza^19.0+x0^3.0*1.315020455873758E-4/61.0*xyza^61.0-4.0/61.0*xyza^61.0-x0^51.0/55.99999999999999/10.0*xyza^10.0-1.0/330.0/12.0*xyza^12.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/660.0*xyza^11.0-8.354218880534669E-5*xyza^21.0-x0^71.0/1.3617945E7*xyza^123.0-1.0/47501.99999999999*xyza^29.0-1.0/7.25*xyza^29.0-0.13793103448275862*xyza^29.0-x0^10.0*x01/585650.0000000001*xyza^53.0-0.00348297213622291*xyza^19.0+x0^3.0/463871.11111111107*xyza^61.0-1.0/15.25*xyza^61.0-0.06557377049180328*xyza^61.0-x0^51.0/559.9999999999999*xyza^10.0-1.0/3960.0*xyza^12.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131343() {
 UsageCalculus.TestCase = 131343;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*x^3^6*4*x^1^74*x0^71*x^2^8/--3*x^3^9*+4*x^1^10*1*x^2-3*x^3^9*+4*x^1^10*1*x^24*x0^10*1*x01*x^2-3*x^3^2*-4*x^1^3/-1*x^2^4*+-3*x^3^54*x0^3/-1*x0^4*+-3*x0^51*x^2^4*+-3*x^3^5-3*x^3^5";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=342 EqnNumber=43 FamilyID=3 MotifTag=4 Entropy=3 FuncWrapAliasID=4"+
"// MetaRow=[12, 43, 10, 18, 1, 1, 2, 7, 3, 4, 1, 1, 1, 2, 3, 2, 3, 2, 4, 2, 4, 12, 1, 2, 3, 4, 16, 2, 3, 14, 3, 9]"+
"// DOEMatrixRow=[3, 43, 19, 2, 1, 3, 2, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 25, 4, 2, 3, 1, 2, 3, 1, 4, 3, 1, 2, 11, 2]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-16.0*x^119.0-12.0*x^25.0-12.0*x^49.0-324.0*x^15.0+27.0*x^57.0-9.0*x^6.0-3.0*x^8.0-3.0*x^8.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-16.0*119.0*x^118.0-12.0*25.0*x^24.0-12.0*49.0*x^48.0-324.0*15.0*x^14.0+27.0*57.0*x^56.0-9.0*6.0*x^5.0-3.0*8.0*x^7.0-3.0*8.0*x^7.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-1904.0*x^118.0-300.0*x^24.0-588.0*x^48.0-4860.0*x^14.0+1539.0*x^56.0-54.0*x^5.0-24.0*x^7.0-24.0*x^7.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-16.0*x^119.0-12.0*x^25.0-12.0*x^49.0-324.0*x^15.0+27.0*x^57.0-9.0*x^6.0-3.0*x^8.0-3.0*x^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-16.0/120.0*x^120.0-12.0/26.0*x^26.0-12.0/50.0*x^50.0-324.0/16.0*x^16.0+27.0/58.0*x^58.0-9.0/7.0*x^7.0-3.0/9.0*x^9.0-3.0/9.0*x^9.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/7.5*x^120.0-1.0/2.1666666666666665*x^26.0-1.0/4.166666666666667*x^50.0-20.25*x^16.0+1.0/2.1481481481481484*x^58.0-1.2857142857142858*x^7.0-1.0/3.0*x^9.0-1.0/3.0*x^9.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-1904.0*x^118.0-300.0*x^24.0-588.0*x^48.0-4860.0*x^14.0+1539.0*x^56.0-54.0*x^5.0-24.0*x^7.0-24.0*x^7.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-1904.0*118.0*x^117.0-300.0*24.0*x^23.0-588.0*48.0*x^47.0-4860.0*14.0*x^13.0+1539.0*56.0*x^55.0-54.0*5.0*x^4.0-24.0*7.0*x^6.0-24.0*7.0*x^6.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-224672.0*x^117.0-7200.0*x^23.0-28224.0*x^47.0-68040.0*x^13.0+86184.0*x^55.0-270.0*x^4.0-168.0*x^6.0-168.0*x^6.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/7.5*x^120.0-1.0/2.1666666666666665*x^26.0-1.0/4.166666666666667*x^50.0-20.25*x^16.0+1.0/2.1481481481481484*x^58.0-1.2857142857142858*x^7.0-1.0/3.0*x^9.0-1.0/3.0*x^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/7.5/121.0*x^121.0-1.0/2.1666666666666665/27.0*x^27.0-1.0/4.166666666666667/51.0*x^51.0-20.25/17.0*x^17.0+1.0/2.1481481481481484/59.0*x^59.0-1.2857142857142858/8.0*x^8.0-1.0/3.0/10.0*x^10.0-1.0/3.0/10.0*x^10.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/907.5*x^121.0-1.0/58.49999999999999*x^27.0-1.0/212.50000000000003*x^51.0-1.1911764705882353*x^17.0+1.0/126.74074074074075*x^59.0-1.0/6.222222222222221*x^8.0-1.0/30.0*x^10.0-1.0/30.0*x^10.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-224672.0*x^117.0-7200.0*x^23.0-28224.0*x^47.0-68040.0*x^13.0+86184.0*x^55.0-270.0*x^4.0-168.0*x^6.0-168.0*x^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-224672.0*117.0*x^116.0-7200.0*23.0*x^22.0-28224.0*47.0*x^46.0-68040.0*13.0*x^12.0+86184.0*55.0*x^54.0-270.0*4.0*x^3.0-168.0*6.0*x^5.0-168.0*6.0*x^5.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-2.6286624E7*x^116.0-165600.0*x^22.0-1326528.0*x^46.0-884520.0*x^12.0+4740120.0*x^54.0-1080.0*x^3.0-1008.0*x^5.0-1008.0*x^5.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/907.5*x^121.0-1.0/58.49999999999999*x^27.0-1.0/212.50000000000003*x^51.0-1.1911764705882353*x^17.0+1.0/126.74074074074075*x^59.0-1.0/6.222222222222221*x^8.0-1.0/30.0*x^10.0-1.0/30.0*x^10.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/907.5/122.0*x^122.0-1.0/58.49999999999999/28.0*x^28.0-1.0/212.50000000000003/52.0*x^52.0-1.1911764705882353/18.0*x^18.0+1.0/126.74074074074075/60.0*x^60.0-1.0/6.222222222222221/9.0*x^9.0-1.0/30.0/11.0*x^11.0-1.0/30.0/11.0*x^11.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/110715.0*x^122.0-1.0/1637.9999999999998*x^28.0-1.0/11050.000000000002*x^52.0-1.0/15.11111111111111*x^18.0+1.0/7604.444444444445*x^60.0-1.0/55.99999999999999*x^9.0-1.0/330.0*x^11.0-1.0/330.0*x^11.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-2.6286624E7*x^116.0-165600.0*x^22.0-1326528.0*x^46.0-884520.0*x^12.0+4740120.0*x^54.0-1080.0*x^3.0-1008.0*x^5.0-1008.0*x^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-116.0*x^115.0-165600.0*22.0*x^21.0-1326528.0*46.0*x^45.0-884520.0*12.0*x^11.0+4740120.0*54.0*x^53.0-1080.0*3.0*x^2.0-1008.0*5.0*x^4.0-1008.0*5.0*x^4.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-116.0*x^115.0-3643200.0*x^21.0-6.1020288E7*x^45.0-1.061424E7*x^11.0+2.5596648E8*x^53.0-3240.0*x^2.0-5040.0*x^4.0-5040.0*x^4.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/110715.0*x^122.0-1.0/1637.9999999999998*x^28.0-1.0/11050.000000000002*x^52.0-1.0/15.11111111111111*x^18.0+1.0/7604.444444444445*x^60.0-1.0/55.99999999999999*x^9.0-1.0/330.0*x^11.0-1.0/330.0*x^11.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/110715.0/123.0*x^123.0-1.0/1637.9999999999998/29.0*x^29.0-1.0/11050.000000000002/53.0*x^53.0-1.0/15.11111111111111/19.0*x^19.0+1.0/7604.444444444445/61.0*x^61.0-1.0/55.99999999999999/10.0*x^10.0-1.0/330.0/12.0*x^12.0-1.0/330.0/12.0*x^12.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/1.3617945E7*x^123.0-1.0/47501.99999999999*x^29.0-1.0/585650.0000000001*x^53.0-1.0/287.1111111111111*x^19.0+1.0/463871.1111111112*x^61.0-1.0/559.9999999999999*x^10.0-1.0/3960.0*x^12.0-1.0/3960.0*x^12.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131344() {
 UsageCalculus.TestCase = 131344;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "4*x0^71*xy^2^8/--3*xy^3^9*+4*xy^1^10*1*xy^2-3*xy^3^9*+4*xy^1^10*1*xy^24*x0^10*1*x01*xy^2-3*xy^3^2*-4*xy^1^3/-1*xy^2^4*+-3*xy^3^54*x0^3/-1*x0^4*+-3*x0^51*xy^2^4*+-3*xy^3^5-3*xy^3^54*x0^6/1*x0^7*--3*x0^8/-4*x0^9";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=343 EqnNumber=44 FamilyID=1 MotifTag=1 Entropy=4 FuncWrapAliasID=1"+
"// MetaRow=[12, 44, 10, 17, 2, 3, 1, 8, 1, 1, 2, 1, 2, 3, 4, 3, 1, 1, 5, 3, 1, 13, 2, 3, 1, 1, 1, 3, 4, 15, 4, 10]"+
"// DOEMatrixRow=[3, 44, 19, 1, 3, 1, 3, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 26, 5, 3, 1, 2, 3, 1, 2, 1, 1, 2, 3, 12, 1]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^71.0*5.333333333333333*xy^35.0-12.0*xy^25.0-x0^10.0*x01*12.0*xy^49.0-324.0*xy^15.0+x0^3.0*27.0*xy^57.0-x0^51.0*9.0*xy^6.0-3.0*xy^8.0-x0^6.0*2.25*xy^57.0+x0^8.0/1.3333333333333333";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^71.0*5.333333333333333*35.0*xy^34.0-12.0*25.0*xy^24.0-x0^10.0*x01*12.0*49.0*xy^48.0-324.0*15.0*xy^14.0+x0^3.0*27.0*57.0*xy^56.0-x0^51.0*9.0*6.0*xy^5.0-3.0*8.0*xy^7.0-x0^6.0*2.25*57.0*xy^56.0+x0^8.0/1.3333333333333333*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^71.0*186.66666666666666*xy^34.0-300.0*xy^24.0-x0^10.0*x01*588.0*xy^48.0-4860.0*xy^14.0+x0^3.0*1539.0*xy^56.0-x0^51.0*54.0*xy^5.0-24.0*xy^7.0-x0^6.0*128.25*xy^56.0+x0^8.0*0.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^71.0*5.333333333333333*xy^35.0-12.0*xy^25.0-x0^10.0*x01*12.0*xy^49.0-324.0*xy^15.0+x0^3.0*27.0*xy^57.0-x0^51.0*9.0*xy^6.0-3.0*xy^8.0-x0^6.0*2.25*xy^57.0+x0^8.0/1.3333333333333333";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^71.0*5.333333333333333/36.0*xy^36.0-12.0/26.0*xy^26.0-x0^10.0*x01*12.0/50.0*xy^50.0-324.0/16.0*xy^16.0+x0^3.0*27.0/58.0*xy^58.0-x0^51.0*9.0/7.0*xy^7.0-3.0/9.0*xy^9.0-x0^6.0*2.25/58.0*xy^58.0+x0^8.0/1.3333333333333333*xy";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^71.0/6.75*xy^36.0-0.46153846153846156*xy^26.0-x0^10.0*x01/4.166666666666667*xy^50.0-20.25*xy^16.0+x0^3.0*0.46551724137931033*xy^58.0-x0^51.0*1.2857142857142858*xy^7.0-0.3333333333333333*xy^9.0-x0^6.0*0.03879310344827586*xy^58.0+x0^8.0/1.3333333333333333*xy";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^71.0*186.66666666666666*xy^34.0-300.0*xy^24.0-x0^10.0*x01*588.0*xy^48.0-4860.0*xy^14.0+x0^3.0*1539.0*xy^56.0-x0^51.0*54.0*xy^5.0-24.0*xy^7.0-x0^6.0*128.25*xy^56.0+x0^8.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^71.0*186.66666666666666*34.0*xy^33.0-300.0*24.0*xy^23.0-x0^10.0*x01*588.0*48.0*xy^47.0-4860.0*14.0*xy^13.0+x0^3.0*1539.0*56.0*xy^55.0-x0^51.0*54.0*5.0*xy^4.0-24.0*7.0*xy^6.0-x0^6.0*128.25*56.0*xy^55.0+x0^8.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^71.0*6346.666666666666*xy^33.0-7200.0*xy^23.0-x0^10.0*x01*28224.0*xy^47.0-68040.0*xy^13.0+x0^3.0*86184.0*xy^55.0-x0^51.0*270.0*xy^4.0-168.0*xy^6.0-x0^6.0*7182.0*xy^55.0+x0^8.0*0.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^71.0/6.75*xy^36.0-0.46153846153846156*xy^26.0-x0^10.0*x01/4.166666666666667*xy^50.0-20.25*xy^16.0+x0^3.0*0.46551724137931033*xy^58.0-x0^51.0*1.2857142857142858*xy^7.0-0.3333333333333333*xy^9.0-x0^6.0*0.03879310344827586*xy^58.0+x0^8.0/1.3333333333333333*xy";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^71.0/6.75/37.0*xy^37.0-0.46153846153846156/27.0*xy^27.0-x0^10.0*x01/4.166666666666667/51.0*xy^51.0-20.25/17.0*xy^17.0+x0^3.0*0.46551724137931033/59.0*xy^59.0-x0^51.0*1.2857142857142858/8.0*xy^8.0-0.3333333333333333/10.0*xy^10.0-x0^6.0*0.03879310344827586/59.0*xy^59.0+x0^8.0*1.3333333333333333/2.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^71.0/249.75*xy^37.0-0.017094017094017096*xy^27.0-x0^10.0*x01/212.50000000000003*xy^51.0-1.1911764705882353*xy^17.0+x0^3.0*0.007890122735242549*xy^59.0-x0^51.0/6.222222222222221*xy^8.0-0.03333333333333333*xy^10.0-x0^6.0*6.57510227936879E-4*xy^59.0+x0^8.0/1.5*xy^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^71.0*6346.666666666666*xy^33.0-7200.0*xy^23.0-x0^10.0*x01*28224.0*xy^47.0-68040.0*xy^13.0+x0^3.0*86184.0*xy^55.0-x0^51.0*270.0*xy^4.0-168.0*xy^6.0-x0^6.0*7182.0*xy^55.0+x0^8.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^71.0*6346.666666666666*33.0*xy^32.0-7200.0*23.0*xy^22.0-x0^10.0*x01*28224.0*47.0*xy^46.0-68040.0*13.0*xy^12.0+x0^3.0*86184.0*55.0*xy^54.0-x0^51.0*270.0*4.0*xy^3.0-168.0*6.0*xy^5.0-x0^6.0*7182.0*55.0*xy^54.0+x0^8.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^71.0*209439.99999999997*xy^32.0-165600.0*xy^22.0-x0^10.0*x01*1326528.0*xy^46.0-884520.0*xy^12.0+x0^3.0*4740120.0*xy^54.0-x0^51.0*1080.0*xy^3.0-1008.0*xy^5.0-x0^6.0*395010.0*xy^54.0+x0^8.0*0.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^71.0/249.75*xy^37.0-0.017094017094017096*xy^27.0-x0^10.0*x01/212.50000000000003*xy^51.0-1.1911764705882353*xy^17.0+x0^3.0*0.007890122735242549*xy^59.0-x0^51.0/6.222222222222221*xy^8.0-0.03333333333333333*xy^10.0-x0^6.0*6.57510227936879E-4*xy^59.0-4.0*xy^59.0+x0^8.0/1.5*xy^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^71.0/249.75/38.0*xy^38.0-0.017094017094017096/28.0*xy^28.0-x0^10.0*x01/212.50000000000003/52.0*xy^52.0-1.1911764705882353/18.0*xy^18.0+x0^3.0*0.007890122735242549/60.0*xy^60.0-x0^51.0/6.222222222222221/9.0*xy^9.0-0.03333333333333333/11.0*xy^11.0-x0^6.0*6.57510227936879E-4/60.0*xy^60.0-4.0/60.0*xy^60.0+x0^8.0*1.5/3.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^71.0/9490.5*xy^38.0-6.105006105006106E-4*xy^28.0-x0^10.0*x01/11050.000000000002*xy^52.0-0.0661764705882353*xy^18.0+x0^3.0*1.315020455873758E-4*xy^60.0-x0^51.0/55.99999999999999*xy^9.0-0.0030303030303030303*xy^11.0-x0^6.0/91253.33333333333*xy^60.0-1.0/15.0*xy^60.0-0.06666666666666667*xy^60.0+x0^8.0/2.0*xy^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^71.0*209439.99999999997*xy^32.0-165600.0*xy^22.0-x0^10.0*x01*1326528.0*xy^46.0-884520.0*xy^12.0+x0^3.0*4740120.0*xy^54.0-x0^51.0*1080.0*xy^3.0-1008.0*xy^5.0-x0^6.0*395010.0*xy^54.0+x0^8.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^71.0*209439.99999999997*32.0*xy^31.0-165600.0*22.0*xy^21.0-x0^10.0*x01*1326528.0*46.0*xy^45.0-884520.0*12.0*xy^11.0+x0^3.0*4740120.0*54.0*xy^53.0-x0^51.0*1080.0*3.0*xy^2.0-1008.0*5.0*xy^4.0-x0^6.0*395010.0*54.0*xy^53.0+x0^8.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^71.0*6702079.999999999*xy^31.0-3643200.0*xy^21.0-x0^10.0*x01*6.1020288E7*xy^45.0-1.061424E7*xy^11.0+x0^3.0*2.5596648E8*xy^53.0-x0^51.0*3240.0*xy^2.0-5040.0*xy^4.0-x0^6.0*2.133054E7*xy^53.0+x0^8.0*0.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^71.0/9490.5*xy^38.0-6.105006105006106E-4*xy^28.0-4.0*xy^28.0-x0^10.0*x01/11050.000000000002*xy^52.0-0.0661764705882353*xy^18.0+x0^3.0*1.315020455873758E-4*xy^60.0-4.0*xy^60.0-x0^51.0/55.99999999999999*xy^9.0-0.0030303030303030303*xy^11.0-x0^6.0/91253.33333333333*xy^60.0-1.0/15.0*xy^60.0-0.06666666666666667*xy^60.0+x0^8.0/2.0*xy^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^71.0/9490.5/39.0*xy^39.0-6.105006105006106E-4/29.0*xy^29.0-4.0/29.0*xy^29.0-x0^10.0*x01/11050.000000000002/53.0*xy^53.0-0.0661764705882353/19.0*xy^19.0+x0^3.0*1.315020455873758E-4/61.0*xy^61.0-4.0/61.0*xy^61.0-x0^51.0/55.99999999999999/10.0*xy^10.0-0.0030303030303030303/12.0*xy^12.0-x0^6.0/91253.33333333333/61.0*xy^61.0-1.0/15.0/61.0*xy^61.0-0.06666666666666667/61.0*xy^61.0+x0^8.0*2.0/4.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^71.0/370129.5*xy^39.0-1.0/47501.99999999999*xy^29.0-1.0/7.25*xy^29.0-0.13793103448275862*xy^29.0-x0^10.0*x01/585650.0000000001*xy^53.0-0.00348297213622291*xy^19.0+x0^3.0/463871.11111111107*xy^61.0-1.0/15.25*xy^61.0-0.06557377049180328*xy^61.0-x0^51.0/559.9999999999999*xy^10.0-2.525252525252525E-4*xy^12.0-x0^6.0/5566453.333333333*xy^61.0-1.0/915.0*xy^61.0-0.001092896174863388*xy^61.0+x0^8.0/2.0*xy^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131345() {
 UsageCalculus.TestCase = 131345;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xyz^2^8/--3*xyz^3^9*+4*xyz^1^10*1*xyz^2-3*xyz^3^9*+4*xyz^1^10*1*xyz^24*x0^10*1*x01*xyz^2-3*xyz^3^2*-4*xyz^1^3/-1*xyz^2^4*+-3*xyz^3^54*x0^3/-1*x0^4*+-3*x0^51*xyz^2^4*+-3*xyz^3^5-3*xyz^3^54*x0^6/1*x0^7*--3*x0^8/-4*x0^91*xyz^2^7*--3*xyz^3^8/-4*xyz^1^9";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=344 EqnNumber=45 FamilyID=2 MotifTag=3 Entropy=1 FuncWrapAliasID=3"+
"// MetaRow=[12, 45, 10, 16, 3, 1, 2, 9, 2, 3, 4, 2, 3, 1, 1, 1, 2, 1, 1, 1, 2, 14, 3, 1, 2, 3, 2, 1, 1, 16, 1, 11]"+
"// DOEMatrixRow=[3, 45, 19, 4, 2, 3, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 27, 6, 1, 2, 3, 1, 2, 3, 2, 3, 1, 4, 13, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "1.3333333333333333*xyz^35.0-12.0*xyz^25.0-x0^10.0*x01*12.0*xyz^49.0-324.0*xyz^15.0+x0^3.0*27.0*xyz^57.0-x0^51.0*9.0*xyz^6.0-3.0*xyz^8.0-x0^6.0*1.6875*xyz^87.0+x0^8.0/1.7777777777777777*xyz^30.0+1.0/1.3333333333333333*xyz^21.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "1.3333333333333333*35.0*xyz^34.0-12.0*25.0*xyz^24.0-x0^10.0*x01*12.0*49.0*xyz^48.0-324.0*15.0*xyz^14.0+x0^3.0*27.0*57.0*xyz^56.0-x0^51.0*9.0*6.0*xyz^5.0-3.0*8.0*xyz^7.0-x0^6.0*1.6875*87.0*xyz^86.0+x0^8.0/1.7777777777777777*30.0*xyz^29.0+1.0/1.3333333333333333*21.0*xyz^20.0";
 UsageCalculus.EqnSolArrayMap2[1] = "46.666666666666664*xyz^34.0-300.0*xyz^24.0-x0^10.0*x01*588.0*xyz^48.0-4860.0*xyz^14.0+x0^3.0*1539.0*xyz^56.0-x0^51.0*54.0*xyz^5.0-24.0*xyz^7.0-x0^6.0*146.8125*xyz^86.0+x0^8.0*16.875*xyz^29.0+15.75*xyz^20.0";
 UsageCalculus.EqnSolArrayMap3[1] = "1.3333333333333333*xyz^35.0-12.0*xyz^25.0-x0^10.0*x01*12.0*xyz^49.0-324.0*xyz^15.0+x0^3.0*27.0*xyz^57.0-x0^51.0*9.0*xyz^6.0-3.0*xyz^8.0-x0^6.0*1.6875*xyz^87.0+x0^8.0/1.7777777777777777*xyz^30.0+1.0/1.3333333333333333*xyz^21.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.3333333333333333/36.0*xyz^36.0-12.0/26.0*xyz^26.0-x0^10.0*x01*12.0/50.0*xyz^50.0-324.0/16.0*xyz^16.0+x0^3.0*27.0/58.0*xyz^58.0-x0^51.0*9.0/7.0*xyz^7.0-3.0/9.0*xyz^9.0-x0^6.0*1.6875/88.0*xyz^88.0+x0^8.0/1.7777777777777777/31.0*xyz^31.0+1.0/1.3333333333333333/22.0*xyz^22.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/27.0*xyz^36.0-0.46153846153846156*xyz^26.0-x0^10.0*x01/4.166666666666667*xyz^50.0-20.25*xyz^16.0+x0^3.0*0.46551724137931033*xyz^58.0-x0^51.0*1.2857142857142858*xyz^7.0-0.3333333333333333*xyz^9.0-x0^6.0*0.019176136363636364*xyz^88.0+x0^8.0/55.11111111111111*xyz^31.0+1.0/29.333333333333332*xyz^22.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "46.666666666666664*xyz^34.0-300.0*xyz^24.0-x0^10.0*x01*588.0*xyz^48.0-4860.0*xyz^14.0+x0^3.0*1539.0*xyz^56.0-x0^51.0*54.0*xyz^5.0-24.0*xyz^7.0-x0^6.0*146.8125*xyz^86.0+x0^8.0*16.875*xyz^29.0+15.75*xyz^20.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "46.666666666666664*34.0*xyz^33.0-300.0*24.0*xyz^23.0-x0^10.0*x01*588.0*48.0*xyz^47.0-4860.0*14.0*xyz^13.0+x0^3.0*1539.0*56.0*xyz^55.0-x0^51.0*54.0*5.0*xyz^4.0-24.0*7.0*xyz^6.0-x0^6.0*146.8125*86.0*xyz^85.0+x0^8.0*16.875*29.0*xyz^28.0+15.75*20.0*xyz^19.0";
 UsageCalculus.EqnSolArrayMap2[2] = "1586.6666666666665*xyz^33.0-7200.0*xyz^23.0-x0^10.0*x01*28224.0*xyz^47.0-68040.0*xyz^13.0+x0^3.0*86184.0*xyz^55.0-x0^51.0*270.0*xyz^4.0-168.0*xyz^6.0-x0^6.0*12625.875*xyz^85.0+x0^8.0*489.375*xyz^28.0+315.0*xyz^19.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/27.0*xyz^36.0-0.46153846153846156*xyz^26.0-x0^10.0*x01/4.166666666666667*xyz^50.0-20.25*xyz^16.0+x0^3.0*0.46551724137931033*xyz^58.0-x0^51.0*1.2857142857142858*xyz^7.0-0.3333333333333333*xyz^9.0-x0^6.0*0.019176136363636364*xyz^88.0+x0^8.0/55.11111111111111*xyz^31.0+1.0/29.333333333333332*xyz^22.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/27.0/37.0*xyz^37.0-0.46153846153846156/27.0*xyz^27.0-x0^10.0*x01/4.166666666666667/51.0*xyz^51.0-20.25/17.0*xyz^17.0+x0^3.0*0.46551724137931033/59.0*xyz^59.0-x0^51.0*1.2857142857142858/8.0*xyz^8.0-0.3333333333333333/10.0*xyz^10.0-x0^6.0*0.019176136363636364/89.0*xyz^89.0+x0^8.0/55.11111111111111/32.0*xyz^32.0+1.0/29.333333333333332/23.0*xyz^23.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/999.0*xyz^37.0-0.017094017094017096*xyz^27.0-x0^10.0*x01/212.50000000000003*xyz^51.0-1.1911764705882353*xyz^17.0+x0^3.0*0.007890122735242549*xyz^59.0-x0^51.0/6.222222222222221*xyz^8.0-0.03333333333333333*xyz^10.0-x0^6.0*2.1546220633299285E-4*xyz^89.0+x0^8.0/1763.5555555555554*xyz^32.0+1.0/674.6666666666666*xyz^23.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "1586.6666666666665*xyz^33.0-7200.0*xyz^23.0-x0^10.0*x01*28224.0*xyz^47.0-68040.0*xyz^13.0+x0^3.0*86184.0*xyz^55.0-x0^51.0*270.0*xyz^4.0-168.0*xyz^6.0-x0^6.0*12625.875*xyz^85.0+x0^8.0*489.375*xyz^28.0+315.0*xyz^19.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "1586.6666666666665*33.0*xyz^32.0-7200.0*23.0*xyz^22.0-x0^10.0*x01*28224.0*47.0*xyz^46.0-68040.0*13.0*xyz^12.0+x0^3.0*86184.0*55.0*xyz^54.0-x0^51.0*270.0*4.0*xyz^3.0-168.0*6.0*xyz^5.0-x0^6.0*12625.875*85.0*xyz^84.0+x0^8.0*489.375*28.0*xyz^27.0+315.0*19.0*xyz^18.0";
 UsageCalculus.EqnSolArrayMap2[3] = "52359.99999999999*xyz^32.0-165600.0*xyz^22.0-x0^10.0*x01*1326528.0*xyz^46.0-884520.0*xyz^12.0+x0^3.0*4740120.0*xyz^54.0-x0^51.0*1080.0*xyz^3.0-1008.0*xyz^5.0-x0^6.0*1073199.375*xyz^84.0+x0^8.0*13702.5*xyz^27.0+5985.0*xyz^18.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/999.0*xyz^37.0-0.017094017094017096*xyz^27.0-x0^10.0*x01/212.50000000000003*xyz^51.0-1.1911764705882353*xyz^17.0+x0^3.0*0.007890122735242549*xyz^59.0-x0^51.0/6.222222222222221*xyz^8.0-0.03333333333333333*xyz^10.0-x0^6.0*2.1546220633299285E-4*xyz^89.0-4.0*xyz^89.0+x0^8.0/1763.5555555555554*xyz^32.0+1.0/674.6666666666666*xyz^23.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/999.0/38.0*xyz^38.0-0.017094017094017096/28.0*xyz^28.0-x0^10.0*x01/212.50000000000003/52.0*xyz^52.0-1.1911764705882353/18.0*xyz^18.0+x0^3.0*0.007890122735242549/60.0*xyz^60.0-x0^51.0/6.222222222222221/9.0*xyz^9.0-0.03333333333333333/11.0*xyz^11.0-x0^6.0*2.1546220633299285E-4/90.0*xyz^90.0-4.0/90.0*xyz^90.0+x0^8.0/1763.5555555555554/33.0*xyz^33.0+1.0/674.6666666666666/24.0*xyz^24.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/37962.0*xyz^38.0-6.105006105006106E-4*xyz^28.0-x0^10.0*x01/11050.000000000002*xyz^52.0-0.0661764705882353*xyz^18.0+x0^3.0*1.315020455873758E-4*xyz^60.0-x0^51.0/55.99999999999999*xyz^9.0-0.0030303030303030303*xyz^11.0-x0^6.0/417706.6666666667*xyz^90.0-1.0/22.5*xyz^90.0-0.044444444444444446*xyz^90.0+x0^8.0/58197.33333333333*xyz^33.0+1.0/16192.0*xyz^24.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "52359.99999999999*xyz^32.0-165600.0*xyz^22.0-x0^10.0*x01*1326528.0*xyz^46.0-884520.0*xyz^12.0+x0^3.0*4740120.0*xyz^54.0-x0^51.0*1080.0*xyz^3.0-1008.0*xyz^5.0-x0^6.0*1073199.375*xyz^84.0+x0^8.0*13702.5*xyz^27.0+5985.0*xyz^18.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "52359.99999999999*32.0*xyz^31.0-165600.0*22.0*xyz^21.0-x0^10.0*x01*1326528.0*46.0*xyz^45.0-884520.0*12.0*xyz^11.0+x0^3.0*4740120.0*54.0*xyz^53.0-x0^51.0*1080.0*3.0*xyz^2.0-1008.0*5.0*xyz^4.0-x0^6.0*1073199.375*84.0*xyz^83.0+x0^8.0*13702.5*27.0*xyz^26.0+5985.0*18.0*xyz^17.0";
 UsageCalculus.EqnSolArrayMap2[4] = "1675519.9999999998*xyz^31.0-3643200.0*xyz^21.0-x0^10.0*x01*6.1020288E7*xyz^45.0-1.061424E7*xyz^11.0+x0^3.0*2.5596648E8*xyz^53.0-x0^51.0*3240.0*xyz^2.0-5040.0*xyz^4.0-x0^6.0*9.01487475E7*xyz^83.0+x0^8.0*369967.5*xyz^26.0+107730.0*xyz^17.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/37962.0*xyz^38.0-6.105006105006106E-4*xyz^28.0-4.0*xyz^28.0-x0^10.0*x01/11050.000000000002*xyz^52.0-0.0661764705882353*xyz^18.0+x0^3.0*1.315020455873758E-4*xyz^60.0-4.0*xyz^60.0-x0^51.0/55.99999999999999*xyz^9.0-0.0030303030303030303*xyz^11.0-x0^6.0/417706.6666666667*xyz^90.0-1.0/22.5*xyz^90.0-0.044444444444444446*xyz^90.0+x0^8.0/58197.33333333333*xyz^33.0+1.0/16192.0*xyz^24.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/37962.0/39.0*xyz^39.0-6.105006105006106E-4/29.0*xyz^29.0-4.0/29.0*xyz^29.0-x0^10.0*x01/11050.000000000002/53.0*xyz^53.0-0.0661764705882353/19.0*xyz^19.0+x0^3.0*1.315020455873758E-4/61.0*xyz^61.0-4.0/61.0*xyz^61.0-x0^51.0/55.99999999999999/10.0*xyz^10.0-0.0030303030303030303/12.0*xyz^12.0-x0^6.0/417706.6666666667/91.0*xyz^91.0-1.0/22.5/91.0*xyz^91.0-0.044444444444444446/91.0*xyz^91.0+x0^8.0/58197.33333333333/34.0*xyz^34.0+1.0/16192.0/25.0*xyz^25.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/1480518.0*xyz^39.0-1.0/47501.99999999999*xyz^29.0-1.0/7.25*xyz^29.0-0.13793103448275862*xyz^29.0-x0^10.0*x01/585650.0000000001*xyz^53.0-0.00348297213622291*xyz^19.0+x0^3.0/463871.11111111107*xyz^61.0-1.0/15.25*xyz^61.0-0.06557377049180328*xyz^61.0-x0^51.0/559.9999999999999*xyz^10.0-2.525252525252525E-4*xyz^12.0-x0^6.0/3.801130666666667E7*xyz^91.0-1.0/2047.5*xyz^91.0-4.884004884004884E-4*xyz^91.0+x0^8.0/1978709.3333333333*xyz^34.0+1.0/404800.0*xyz^25.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131346() {
 UsageCalculus.TestCase = 131346;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xyza^3^9*+4*xyza^1^10*1*xyza^24*x0^10*1*x01*xyza^2-3*xyza^3^2*-4*xyza^1^3/-1*xyza^2^4*+-3*xyza^3^54*x0^3/-1*x0^4*+-3*x0^51*xyza^2^4*+-3*xyza^3^5-3*xyza^3^54*x0^6/1*x0^7*--3*x0^8/-4*x0^91*xyza^2^7*--3*xyza^3^8/-4*xyza^1^9-3*xyza^3^8/-4*xyza^1^9";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=345 EqnNumber=46 FamilyID=3 MotifTag=4 Entropy=3 FuncWrapAliasID=4"+
"// MetaRow=[12, 46, 10, 15, 4, 2, 3, 10, 3, 4, 1, 1, 1, 2, 3, 2, 3, 2, 3, 2, 3, 15, 1, 2, 3, 4, 3, 2, 3, 1, 2, 12]"+
"// DOEMatrixRow=[3, 46, 19, 3, 1, 1, 2, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 28, 7, 2, 3, 4, 2, 3, 4, 3, 1, 2, 1, 14, 1]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^10.0*x01*12.0*xyza^49.0-324.0*xyza^15.0+x0^3.0*27.0*xyza^57.0-x0^51.0*9.0*xyza^6.0-3.0*xyza^8.0-x0^6.0*1.6875*xyza^87.0+x0^8.0/1.7777777777777777*xyza^30.0+1.0/1.3333333333333333*xyza^21.0+1.0/1.3333333333333333*xyza^21.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^10.0*x01*12.0*49.0*xyza^48.0-324.0*15.0*xyza^14.0+x0^3.0*27.0*57.0*xyza^56.0-x0^51.0*9.0*6.0*xyza^5.0-3.0*8.0*xyza^7.0-x0^6.0*1.6875*87.0*xyza^86.0+x0^8.0/1.7777777777777777*30.0*xyza^29.0+1.0/1.3333333333333333*21.0*xyza^20.0+1.0/1.3333333333333333*21.0*xyza^20.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^10.0*x01*588.0*xyza^48.0-4860.0*xyza^14.0+x0^3.0*1539.0*xyza^56.0-x0^51.0*54.0*xyza^5.0-24.0*xyza^7.0-x0^6.0*146.8125*xyza^86.0+x0^8.0*16.875*xyza^29.0+15.75*xyza^20.0+15.75*xyza^20.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^10.0*x01*12.0*xyza^49.0-324.0*xyza^15.0+x0^3.0*27.0*xyza^57.0-x0^51.0*9.0*xyza^6.0-3.0*xyza^8.0-x0^6.0*1.6875*xyza^87.0+x0^8.0/1.7777777777777777*xyza^30.0+1.0/1.3333333333333333*xyza^21.0+1.0/1.3333333333333333*xyza^21.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^10.0*x01*12.0/50.0*xyza^50.0-324.0/16.0*xyza^16.0+x0^3.0*27.0/58.0*xyza^58.0-x0^51.0*9.0/7.0*xyza^7.0-3.0/9.0*xyza^9.0-x0^6.0*1.6875/88.0*xyza^88.0+x0^8.0/1.7777777777777777/31.0*xyza^31.0+1.0/1.3333333333333333/22.0*xyza^22.0+1.0/1.3333333333333333/22.0*xyza^22.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^10.0*x01/4.166666666666667*xyza^50.0-20.25*xyza^16.0+x0^3.0*0.46551724137931033*xyza^58.0-x0^51.0*1.2857142857142858*xyza^7.0-0.3333333333333333*xyza^9.0-x0^6.0*0.019176136363636364*xyza^88.0+x0^8.0/55.11111111111111*xyza^31.0+1.0/29.333333333333332*xyza^22.0+1.0/29.333333333333332*xyza^22.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^10.0*x01*588.0*xyza^48.0-4860.0*xyza^14.0+x0^3.0*1539.0*xyza^56.0-x0^51.0*54.0*xyza^5.0-24.0*xyza^7.0-x0^6.0*146.8125*xyza^86.0+x0^8.0*16.875*xyza^29.0+15.75*xyza^20.0+15.75*xyza^20.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^10.0*x01*588.0*48.0*xyza^47.0-4860.0*14.0*xyza^13.0+x0^3.0*1539.0*56.0*xyza^55.0-x0^51.0*54.0*5.0*xyza^4.0-24.0*7.0*xyza^6.0-x0^6.0*146.8125*86.0*xyza^85.0+x0^8.0*16.875*29.0*xyza^28.0+15.75*20.0*xyza^19.0+15.75*20.0*xyza^19.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^10.0*x01*28224.0*xyza^47.0-68040.0*xyza^13.0+x0^3.0*86184.0*xyza^55.0-x0^51.0*270.0*xyza^4.0-168.0*xyza^6.0-x0^6.0*12625.875*xyza^85.0+x0^8.0*489.375*xyza^28.0+315.0*xyza^19.0+315.0*xyza^19.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^10.0*x01/4.166666666666667*xyza^50.0-20.25*xyza^16.0+x0^3.0*0.46551724137931033*xyza^58.0-x0^51.0*1.2857142857142858*xyza^7.0-0.3333333333333333*xyza^9.0-x0^6.0*0.019176136363636364*xyza^88.0+x0^8.0/55.11111111111111*xyza^31.0+1.0/29.333333333333332*xyza^22.0+1.0/29.333333333333332*xyza^22.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^10.0*x01/4.166666666666667/51.0*xyza^51.0-20.25/17.0*xyza^17.0+x0^3.0*0.46551724137931033/59.0*xyza^59.0-x0^51.0*1.2857142857142858/8.0*xyza^8.0-0.3333333333333333/10.0*xyza^10.0-x0^6.0*0.019176136363636364/89.0*xyza^89.0+x0^8.0/55.11111111111111/32.0*xyza^32.0+1.0/29.333333333333332/23.0*xyza^23.0+1.0/29.333333333333332/23.0*xyza^23.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^10.0*x01/212.50000000000003*xyza^51.0-1.1911764705882353*xyza^17.0+x0^3.0*0.007890122735242549*xyza^59.0-x0^51.0/6.222222222222221*xyza^8.0-0.03333333333333333*xyza^10.0-x0^6.0*2.1546220633299285E-4*xyza^89.0+x0^8.0/1763.5555555555554*xyza^32.0+1.0/674.6666666666666*xyza^23.0+1.0/674.6666666666666*xyza^23.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^10.0*x01*28224.0*xyza^47.0-68040.0*xyza^13.0+x0^3.0*86184.0*xyza^55.0-x0^51.0*270.0*xyza^4.0-168.0*xyza^6.0-x0^6.0*12625.875*xyza^85.0+x0^8.0*489.375*xyza^28.0+315.0*xyza^19.0+315.0*xyza^19.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^10.0*x01*28224.0*47.0*xyza^46.0-68040.0*13.0*xyza^12.0+x0^3.0*86184.0*55.0*xyza^54.0-x0^51.0*270.0*4.0*xyza^3.0-168.0*6.0*xyza^5.0-x0^6.0*12625.875*85.0*xyza^84.0+x0^8.0*489.375*28.0*xyza^27.0+315.0*19.0*xyza^18.0+315.0*19.0*xyza^18.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^10.0*x01*1326528.0*xyza^46.0-884520.0*xyza^12.0+x0^3.0*4740120.0*xyza^54.0-x0^51.0*1080.0*xyza^3.0-1008.0*xyza^5.0-x0^6.0*1073199.375*xyza^84.0+x0^8.0*13702.5*xyza^27.0+5985.0*xyza^18.0+5985.0*xyza^18.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^10.0*x01/212.50000000000003*xyza^51.0-1.1911764705882353*xyza^17.0+x0^3.0*0.007890122735242549*xyza^59.0-x0^51.0/6.222222222222221*xyza^8.0-0.03333333333333333*xyza^10.0-x0^6.0*2.1546220633299285E-4*xyza^89.0-4.0*xyza^89.0+x0^8.0/1763.5555555555554*xyza^32.0+1.0/674.6666666666666*xyza^23.0+1.0/674.6666666666666*xyza^23.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^10.0*x01/212.50000000000003/52.0*xyza^52.0-1.1911764705882353/18.0*xyza^18.0+x0^3.0*0.007890122735242549/60.0*xyza^60.0-x0^51.0/6.222222222222221/9.0*xyza^9.0-0.03333333333333333/11.0*xyza^11.0-x0^6.0*2.1546220633299285E-4/90.0*xyza^90.0-4.0/90.0*xyza^90.0+x0^8.0/1763.5555555555554/33.0*xyza^33.0+1.0/674.6666666666666/24.0*xyza^24.0+1.0/674.6666666666666/24.0*xyza^24.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^10.0*x01/11050.000000000002*xyza^52.0-0.0661764705882353*xyza^18.0+x0^3.0*1.315020455873758E-4*xyza^60.0-x0^51.0/55.99999999999999*xyza^9.0-0.0030303030303030303*xyza^11.0-x0^6.0/417706.6666666667*xyza^90.0-1.0/22.5*xyza^90.0-0.044444444444444446*xyza^90.0+x0^8.0/58197.33333333333*xyza^33.0+1.0/16192.0*xyza^24.0+1.0/16192.0*xyza^24.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^10.0*x01*1326528.0*xyza^46.0-884520.0*xyza^12.0+x0^3.0*4740120.0*xyza^54.0-x0^51.0*1080.0*xyza^3.0-1008.0*xyza^5.0-x0^6.0*1073199.375*xyza^84.0+x0^8.0*13702.5*xyza^27.0+5985.0*xyza^18.0+5985.0*xyza^18.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^10.0*x01*1326528.0*46.0*xyza^45.0-884520.0*12.0*xyza^11.0+x0^3.0*4740120.0*54.0*xyza^53.0-x0^51.0*1080.0*3.0*xyza^2.0-1008.0*5.0*xyza^4.0-x0^6.0*1073199.375*84.0*xyza^83.0+x0^8.0*13702.5*27.0*xyza^26.0+5985.0*18.0*xyza^17.0+5985.0*18.0*xyza^17.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^10.0*x01*6.1020288E7*xyza^45.0-1.061424E7*xyza^11.0+x0^3.0*2.5596648E8*xyza^53.0-x0^51.0*3240.0*xyza^2.0-5040.0*xyza^4.0-x0^6.0*9.01487475E7*xyza^83.0+x0^8.0*369967.5*xyza^26.0+107730.0*xyza^17.0+107730.0*xyza^17.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^10.0*x01/11050.000000000002*xyza^52.0-0.0661764705882353*xyza^18.0+x0^3.0*1.315020455873758E-4*xyza^60.0-4.0*xyza^60.0-x0^51.0/55.99999999999999*xyza^9.0-0.0030303030303030303*xyza^11.0-x0^6.0/417706.6666666667*xyza^90.0-1.0/22.5*xyza^90.0-0.044444444444444446*xyza^90.0+x0^8.0/58197.33333333333*xyza^33.0+1.0/16192.0*xyza^24.0+1.0/16192.0*xyza^24.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^10.0*x01/11050.000000000002/53.0*xyza^53.0-0.0661764705882353/19.0*xyza^19.0+x0^3.0*1.315020455873758E-4/61.0*xyza^61.0-4.0/61.0*xyza^61.0-x0^51.0/55.99999999999999/10.0*xyza^10.0-0.0030303030303030303/12.0*xyza^12.0-x0^6.0/417706.6666666667/91.0*xyza^91.0-1.0/22.5/91.0*xyza^91.0-0.044444444444444446/91.0*xyza^91.0+x0^8.0/58197.33333333333/34.0*xyza^34.0+1.0/16192.0/25.0*xyza^25.0+1.0/16192.0/25.0*xyza^25.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^10.0*x01/585650.0000000001*xyza^53.0-0.00348297213622291*xyza^19.0+x0^3.0/463871.11111111107*xyza^61.0-1.0/15.25*xyza^61.0-0.06557377049180328*xyza^61.0-x0^51.0/559.9999999999999*xyza^10.0-2.525252525252525E-4*xyza^12.0-x0^6.0/3.801130666666667E7*xyza^91.0-1.0/2047.5*xyza^91.0-4.884004884004884E-4*xyza^91.0+x0^8.0/1978709.3333333333*xyza^34.0+1.0/404800.0*xyza^25.0+1.0/404800.0*xyza^25.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131347() {
 UsageCalculus.TestCase = 131347;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "4*x0^10*1*x01*x^2-3*x^3^2*-4*x^1^3/-1*x^2^4*+-3*x^3^54*x0^3/-1*x0^4*+-3*x0^51*x^2^4*+-3*x^3^5-3*x^3^54*x0^6/1*x0^7*--3*x0^8/-4*x0^91*x^2^7*--3*x^3^8/-4*x^1^9-3*x^3^8/-4*x^1^94*x0^9";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=346 EqnNumber=47 FamilyID=1 MotifTag=1 Entropy=4 FuncWrapAliasID=1"+
"// MetaRow=[12, 47, 10, 14, 1, 3, 1, 1, 1, 1, 2, 1, 2, 3, 4, 3, 1, 1, 4, 3, 4, 16, 2, 3, 1, 1, 4, 3, 4, 2, 3, 13]"+
"// DOEMatrixRow=[3, 47, 19, 2, 1, 2, 3, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 29, 8, 3, 1, 5, 3, 1, 5, 4, 2, 3, 2, 15, 2]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "4.0*x^2.0-324.0*x^15.0+27.0*x^57.0-9.0*x^6.0-3.0*x^8.0-1.6875*x^87.0+1.0/1.7777777777777777*x^30.0+1.0/1.3333333333333333*x^21.0+1.0/1.3333333333333333*x^106.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "4.0*2.0*x^1.0-324.0*15.0*x^14.0+27.0*57.0*x^56.0-9.0*6.0*x^5.0-3.0*8.0*x^7.0-1.6875*87.0*x^86.0+1.0/1.7777777777777777*30.0*x^29.0+1.0/1.3333333333333333*21.0*x^20.0+1.0/1.3333333333333333*106.0*x^105.0";
 UsageCalculus.EqnSolArrayMap2[1] = "8.0*x-4860.0*x^14.0+1539.0*x^56.0-54.0*x^5.0-24.0*x^7.0-146.8125*x^86.0+16.875*x^29.0+15.75*x^20.0+79.5*x^105.0";
 UsageCalculus.EqnSolArrayMap3[1] = "4.0*x^2.0-324.0*x^15.0+27.0*x^57.0-9.0*x^6.0-3.0*x^8.0-1.6875*x^87.0+1.0/1.7777777777777777*x^30.0+1.0/1.3333333333333333*x^21.0+1.0/1.3333333333333333*x^106.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "4.0/3.0*x^3.0-324.0/16.0*x^16.0+27.0/58.0*x^58.0-9.0/7.0*x^7.0-3.0/9.0*x^9.0-1.6875/88.0*x^88.0+1.0/1.7777777777777777/31.0*x^31.0+1.0/1.3333333333333333/22.0*x^22.0+1.0/1.3333333333333333/107.0*x^107.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.3333333333333333*x^3.0-20.25*x^16.0+1.0/2.1481481481481484*x^58.0-1.2857142857142858*x^7.0-1.0/3.0*x^9.0-1.0/52.148148148148145*x^88.0+1.0/55.11111111111111*x^31.0+1.0/29.333333333333332*x^22.0+1.0/142.66666666666666*x^107.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "8.0*x-4860.0*x^14.0+1539.0*x^56.0-54.0*x^5.0-24.0*x^7.0-146.8125*x^86.0+16.875*x^29.0+15.75*x^20.0+79.5*x^105.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0-4860.0*14.0*x^13.0+1539.0*56.0*x^55.0-54.0*5.0*x^4.0-24.0*7.0*x^6.0-146.8125*86.0*x^85.0+16.875*29.0*x^28.0+15.75*20.0*x^19.0+79.5*105.0*x^104.0";
 UsageCalculus.EqnSolArrayMap2[2] = "8.0-68040.0*x^13.0+86184.0*x^55.0-270.0*x^4.0-168.0*x^6.0-12625.875*x^85.0+489.375*x^28.0+315.0*x^19.0+8347.5*x^104.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.3333333333333333*x^3.0-20.25*x^16.0+1.0/2.1481481481481484*x^58.0-1.2857142857142858*x^7.0-1.0/3.0*x^9.0-1.0/52.148148148148145*x^88.0+1.0/55.11111111111111*x^31.0+1.0/29.333333333333332*x^22.0+1.0/142.66666666666666*x^107.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.3333333333333333/4.0*x^4.0-20.25/17.0*x^17.0+1.0/2.1481481481481484/59.0*x^59.0-1.2857142857142858/8.0*x^8.0-1.0/3.0/10.0*x^10.0-1.0/52.148148148148145/89.0*x^89.0+1.0/55.11111111111111/32.0*x^32.0+1.0/29.333333333333332/23.0*x^23.0+1.0/142.66666666666666/108.0*x^108.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/3.0*x^4.0-1.1911764705882353*x^17.0+1.0/126.74074074074075*x^59.0-1.0/6.222222222222221*x^8.0-1.0/30.0*x^10.0-1.0/4641.185185185185*x^89.0+1.0/1763.5555555555554*x^32.0+1.0/674.6666666666666*x^23.0+1.0/15407.999999999998*x^108.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "8.0-68040.0*x^13.0+86184.0*x^55.0-270.0*x^4.0-168.0*x^6.0-12625.875*x^85.0+489.375*x^28.0+315.0*x^19.0+8347.5*x^104.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "0.0-68040.0*13.0*x^12.0+86184.0*55.0*x^54.0-270.0*4.0*x^3.0-168.0*6.0*x^5.0-12625.875*85.0*x^84.0+489.375*28.0*x^27.0+315.0*19.0*x^18.0+8347.5*104.0*x^103.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-884520.0*x^12.0+4740120.0*x^54.0-1080.0*x^3.0-1008.0*x^5.0-1073199.375*x^84.0+13702.5*x^27.0+5985.0*x^18.0+868140.0*x^103.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/3.0*x^4.0-1.1911764705882353*x^17.0+1.0/126.74074074074075*x^59.0-1.0/6.222222222222221*x^8.0-1.0/30.0*x^10.0-1.0/4641.185185185185*x^89.0+1.0/1763.5555555555554*x^32.0+1.0/674.6666666666666*x^23.0+1.0/15407.999999999998*x^108.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/3.0/5.0*x^5.0-1.1911764705882353/18.0*x^18.0+1.0/126.74074074074075/60.0*x^60.0-1.0/6.222222222222221/9.0*x^9.0-1.0/30.0/11.0*x^11.0-1.0/4641.185185185185/90.0*x^90.0+1.0/1763.5555555555554/33.0*x^33.0+1.0/674.6666666666666/24.0*x^24.0+1.0/15407.999999999998/109.0*x^109.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/15.0*x^5.0-1.0/15.11111111111111*x^18.0+1.0/7604.444444444445*x^60.0-1.0/55.99999999999999*x^9.0-1.0/330.0*x^11.0-1.0/417706.6666666667*x^90.0+1.0/58197.33333333333*x^33.0+1.0/16192.0*x^24.0+1.0/1679471.9999999998*x^109.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-884520.0*x^12.0+4740120.0*x^54.0-1080.0*x^3.0-1008.0*x^5.0-1073199.375*x^84.0+13702.5*x^27.0+5985.0*x^18.0+868140.0*x^103.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-884520.0*12.0*x^11.0+4740120.0*54.0*x^53.0-1080.0*3.0*x^2.0-1008.0*5.0*x^4.0-1073199.375*84.0*x^83.0+13702.5*27.0*x^26.0+5985.0*18.0*x^17.0+868140.0*103.0*x^102.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1.061424E7*x^11.0+2.5596648E8*x^53.0-3240.0*x^2.0-5040.0*x^4.0-9.01487475E7*x^83.0+369967.5*x^26.0+107730.0*x^17.0+8.941842E7*x^102.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/15.0*x^5.0-1.0/15.11111111111111*x^18.0+1.0/7604.444444444445*x^60.0-1.0/55.99999999999999*x^9.0-1.0/330.0*x^11.0-1.0/417706.6666666667*x^90.0+1.0/58197.33333333333*x^33.0+1.0/16192.0*x^24.0+1.0/1679471.9999999998*x^109.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/15.0/6.0*x^6.0-1.0/15.11111111111111/19.0*x^19.0+1.0/7604.444444444445/61.0*x^61.0-1.0/55.99999999999999/10.0*x^10.0-1.0/330.0/12.0*x^12.0-1.0/417706.6666666667/91.0*x^91.0+1.0/58197.33333333333/34.0*x^34.0+1.0/16192.0/25.0*x^25.0+1.0/1679471.9999999998/110.0*x^110.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/90.0*x^6.0-1.0/287.1111111111111*x^19.0+1.0/463871.1111111112*x^61.0-1.0/559.9999999999999*x^10.0-1.0/3960.0*x^12.0-1.0/3.801130666666667E7*x^91.0+1.0/1978709.3333333333*x^34.0+1.0/404800.0*x^25.0+1.0/1.8474191999999997E8*x^110.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131348() {
 UsageCalculus.TestCase = 131348;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xy^2-3*xy^3^2*-4*xy^1^3/-1*xy^2^4*+-3*xy^3^54*x0^3/-1*x0^4*+-3*x0^51*xy^2^4*+-3*xy^3^5-3*xy^3^54*x0^6/1*x0^7*--3*x0^8/-4*x0^91*xy^2^7*--3*xy^3^8/-4*xy^1^9-3*xy^3^8/-4*xy^1^94*x0^91*xy^2^10*-3*xy^3*-4*xy^1^2/-1*xy^2^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=347 EqnNumber=48 FamilyID=2 MotifTag=3 Entropy=1 FuncWrapAliasID=3"+
"// MetaRow=[12, 48, 10, 13, 2, 1, 2, 3, 2, 3, 4, 2, 3, 1, 1, 1, 2, 1, 5, 1, 1, 1, 3, 1, 2, 3, 5, 1, 1, 3, 4, 14]"+
"// DOEMatrixRow=[3, 48, 19, 1, 2, 3, 1, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 30, 9, 1, 2, 1, 1, 2, 6, 1, 3, 1, 3, 16, 1]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "xy^2.0-324.0*xy^15.0+x0^3.0*27.0*xy^57.0-x0^51.0*9.0*xy^6.0-3.0*xy^8.0-x0^6.0*1.6875*xy^87.0+x0^8.0/1.7777777777777777*xy^30.0+1.0/1.3333333333333333*xy^21.0-x0^91.0*9.0*xy^129.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "2.0*xy^1.0-324.0*15.0*xy^14.0+x0^3.0*27.0*57.0*xy^56.0-x0^51.0*9.0*6.0*xy^5.0-3.0*8.0*xy^7.0-x0^6.0*1.6875*87.0*xy^86.0+x0^8.0/1.7777777777777777*30.0*xy^29.0+1.0/1.3333333333333333*21.0*xy^20.0-x0^91.0*9.0*129.0*xy^128.0";
 UsageCalculus.EqnSolArrayMap2[1] = "2.0*xy-4860.0*xy^14.0+x0^3.0*1539.0*xy^56.0-x0^51.0*54.0*xy^5.0-24.0*xy^7.0-x0^6.0*146.8125*xy^86.0+x0^8.0*16.875*xy^29.0+15.75*xy^20.0-x0^91.0*1161.0*xy^128.0";
 UsageCalculus.EqnSolArrayMap3[1] = "xy^2.0-324.0*xy^15.0+x0^3.0*27.0*xy^57.0-x0^51.0*9.0*xy^6.0-3.0*xy^8.0-x0^6.0*1.6875*xy^87.0+x0^8.0/1.7777777777777777*xy^30.0+1.0/1.3333333333333333*xy^21.0-x0^91.0*9.0*xy^129.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0/3.0*xy^3.0-324.0/16.0*xy^16.0+x0^3.0*27.0/58.0*xy^58.0-x0^51.0*9.0/7.0*xy^7.0-3.0/9.0*xy^9.0-x0^6.0*1.6875/88.0*xy^88.0+x0^8.0/1.7777777777777777/31.0*xy^31.0+1.0/1.3333333333333333/22.0*xy^22.0-x0^91.0*9.0/130.0*xy^130.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/3.0*xy^3.0-20.25*xy^16.0+x0^3.0*0.46551724137931033*xy^58.0-x0^51.0*1.2857142857142858*xy^7.0-0.3333333333333333*xy^9.0-x0^6.0*0.019176136363636364*xy^88.0+x0^8.0/55.11111111111111*xy^31.0+0.034090909090909095*xy^22.0-x0^91.0/14.444444444444445*xy^130.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "2.0*xy-4860.0*xy^14.0+x0^3.0*1539.0*xy^56.0-x0^51.0*54.0*xy^5.0-24.0*xy^7.0-x0^6.0*146.8125*xy^86.0+x0^8.0*16.875*xy^29.0+15.75*xy^20.0-x0^91.0*1161.0*xy^128.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "2.0-4860.0*14.0*xy^13.0+x0^3.0*1539.0*56.0*xy^55.0-x0^51.0*54.0*5.0*xy^4.0-24.0*7.0*xy^6.0-x0^6.0*146.8125*86.0*xy^85.0+x0^8.0*16.875*29.0*xy^28.0+15.75*20.0*xy^19.0-x0^91.0*1161.0*128.0*xy^127.0";
 UsageCalculus.EqnSolArrayMap2[2] = "2.0-68040.0*xy^13.0+x0^3.0*86184.0*xy^55.0-x0^51.0*270.0*xy^4.0-168.0*xy^6.0-x0^6.0*12625.875*xy^85.0+x0^8.0*489.375*xy^28.0+315.0*xy^19.0-x0^91.0*148608.0*xy^127.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/3.0*xy^3.0-20.25*xy^16.0+x0^3.0*0.46551724137931033*xy^58.0-x0^51.0*1.2857142857142858*xy^7.0-0.3333333333333333*xy^9.0-x0^6.0*0.019176136363636364*xy^88.0+x0^8.0/55.11111111111111*xy^31.0+0.034090909090909095*xy^22.0-x0^91.0/14.444444444444445*xy^130.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/3.0/4.0*xy^4.0-20.25/17.0*xy^17.0+x0^3.0*0.46551724137931033/59.0*xy^59.0-x0^51.0*1.2857142857142858/8.0*xy^8.0-0.3333333333333333/10.0*xy^10.0-x0^6.0*0.019176136363636364/89.0*xy^89.0+x0^8.0/55.11111111111111/32.0*xy^32.0+0.034090909090909095/23.0*xy^23.0-x0^91.0*14.444444444444445/131.0*xy^131.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/12.0*xy^4.0-1.1911764705882353*xy^17.0+x0^3.0*0.007890122735242549*xy^59.0-x0^51.0/6.222222222222221*xy^8.0-0.03333333333333333*xy^10.0-x0^6.0*2.1546220633299285E-4*xy^89.0+x0^8.0/1763.5555555555554*xy^32.0+0.001482213438735178*xy^23.0-x0^91.0/9.069230769230769*xy^131.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "2.0-68040.0*xy^13.0+x0^3.0*86184.0*xy^55.0-x0^51.0*270.0*xy^4.0-168.0*xy^6.0-x0^6.0*12625.875*xy^85.0+x0^8.0*489.375*xy^28.0+315.0*xy^19.0-x0^91.0*148608.0*xy^127.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "0.0-68040.0*13.0*xy^12.0+x0^3.0*86184.0*55.0*xy^54.0-x0^51.0*270.0*4.0*xy^3.0-168.0*6.0*xy^5.0-x0^6.0*12625.875*85.0*xy^84.0+x0^8.0*489.375*28.0*xy^27.0+315.0*19.0*xy^18.0-x0^91.0*148608.0*127.0*xy^126.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-884520.0*xy^12.0+x0^3.0*4740120.0*xy^54.0-x0^51.0*1080.0*xy^3.0-1008.0*xy^5.0-x0^6.0*1073199.375*xy^84.0+x0^8.0*13702.5*xy^27.0+5985.0*xy^18.0-x0^91.0*1.8873216E7*xy^126.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/12.0*xy^4.0-1.1911764705882353*xy^17.0+x0^3.0*0.007890122735242549*xy^59.0-x0^51.0/6.222222222222221*xy^8.0-0.03333333333333333*xy^10.0-x0^6.0*2.1546220633299285E-4*xy^89.0-4.0*xy^89.0+x0^8.0/1763.5555555555554*xy^32.0+0.001482213438735178*xy^23.0-x0^91.0/9.069230769230769*xy^131.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/12.0/5.0*xy^5.0-1.1911764705882353/18.0*xy^18.0+x0^3.0*0.007890122735242549/60.0*xy^60.0-x0^51.0/6.222222222222221/9.0*xy^9.0-0.03333333333333333/11.0*xy^11.0-x0^6.0*2.1546220633299285E-4/90.0*xy^90.0-4.0/90.0*xy^90.0+x0^8.0/1763.5555555555554/33.0*xy^33.0+0.001482213438735178/24.0*xy^24.0-x0^91.0*9.069230769230769/132.0*xy^132.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/60.0*xy^5.0-0.0661764705882353*xy^18.0+x0^3.0*1.315020455873758E-4*xy^60.0-x0^51.0/55.99999999999999*xy^9.0-0.0030303030303030303*xy^11.0-x0^6.0/417706.6666666667*xy^90.0-1.0/22.5*xy^90.0-0.044444444444444446*xy^90.0+x0^8.0/58197.33333333333*xy^33.0+6.175889328063242E-5*xy^24.0-x0^91.0/14.554707379134861*xy^132.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-884520.0*xy^12.0+x0^3.0*4740120.0*xy^54.0-x0^51.0*1080.0*xy^3.0-1008.0*xy^5.0-x0^6.0*1073199.375*xy^84.0+x0^8.0*13702.5*xy^27.0+5985.0*xy^18.0-x0^91.0*1.8873216E7*xy^126.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-884520.0*12.0*xy^11.0+x0^3.0*4740120.0*54.0*xy^53.0-x0^51.0*1080.0*3.0*xy^2.0-1008.0*5.0*xy^4.0-x0^6.0*1073199.375*84.0*xy^83.0+x0^8.0*13702.5*27.0*xy^26.0+5985.0*18.0*xy^17.0-0.0*126.0*xy^125.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1.061424E7*xy^11.0+x0^3.0*2.5596648E8*xy^53.0-x0^51.0*3240.0*xy^2.0-5040.0*xy^4.0-x0^6.0*9.01487475E7*xy^83.0+x0^8.0*369967.5*xy^26.0+107730.0*xy^17.0-0.0*xy^125.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/60.0*xy^5.0-0.0661764705882353*xy^18.0+x0^3.0*1.315020455873758E-4*xy^60.0-4.0*xy^60.0-x0^51.0/55.99999999999999*xy^9.0-0.0030303030303030303*xy^11.0-x0^6.0/417706.6666666667*xy^90.0-1.0/22.5*xy^90.0-0.044444444444444446*xy^90.0+x0^8.0/58197.33333333333*xy^33.0+6.175889328063242E-5*xy^24.0-5.0*xy^24.0-x0^91.0/14.554707379134861*xy^132.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/60.0/6.0*xy^6.0-0.0661764705882353/19.0*xy^19.0+x0^3.0*1.315020455873758E-4/61.0*xy^61.0-4.0/61.0*xy^61.0-x0^51.0/55.99999999999999/10.0*xy^10.0-0.0030303030303030303/12.0*xy^12.0-x0^6.0/417706.6666666667/91.0*xy^91.0-1.0/22.5/91.0*xy^91.0-0.044444444444444446/91.0*xy^91.0+x0^8.0/58197.33333333333/34.0*xy^34.0+6.175889328063242E-5/25.0*xy^25.0-5.0/25.0*xy^25.0-x0^91.0*14.554707379134861/133.0*xy^133.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/360.0*xy^6.0-0.00348297213622291*xy^19.0+x0^3.0/463871.11111111107*xy^61.0-1.0/15.25*xy^61.0-0.06557377049180328*xy^61.0-x0^51.0/559.9999999999999*xy^10.0-2.525252525252525E-4*xy^12.0-x0^6.0/3.801130666666667E7*xy^91.0-1.0/2047.5*xy^91.0-4.884004884004884E-4*xy^91.0+x0^8.0/1978709.3333333333*xy^34.0+1.0/404799.99999999994*xy^25.0-1.0/5.0*xy^25.0-0.2*xy^25.0-x0^91.0/9.137937062937063*xy^133.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131349() {
 UsageCalculus.TestCase = 131349;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xyz^3^2*-4*xyz^1^3/-1*xyz^2^4*+-3*xyz^3^54*x0^3/-1*x0^4*+-3*x0^51*xyz^2^4*+-3*xyz^3^5-3*xyz^3^54*x0^6/1*x0^7*--3*x0^8/-4*x0^91*xyz^2^7*--3*xyz^3^8/-4*xyz^1^9-3*xyz^3^8/-4*xyz^1^94*x0^91*xyz^2^10*-3*xyz^3*-4*xyz^1^2/-1*xyz^2^3-3*xyz^3*-4*xyz^1^2/-1*xyz^2^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=348 EqnNumber=49 FamilyID=3 MotifTag=4 Entropy=3 FuncWrapAliasID=4"+
"// MetaRow=[12, 49, 10, 12, 3, 2, 3, 4, 3, 4, 1, 1, 1, 2, 3, 2, 3, 2, 1, 2, 3, 2, 1, 2, 3, 4, 6, 2, 3, 4, 1, 15]"+
"// DOEMatrixRow=[3, 49, 19, 4, 2, 1, 2, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 31, 10, 2, 3, 2, 3, 1, 1, 2, 1, 2, 4, 1, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-324.0*xyz^15.0+x0^3.0*27.0*xyz^57.0-x0^51.0*9.0*xyz^6.0-3.0*xyz^8.0-x0^6.0*1.6875*xyz^87.0+x0^8.0/1.7777777777777777*xyz^30.0+1.0/1.3333333333333333*xyz^21.0-x0^91.0*9.0*xyz^129.0-12.0*xyz^11.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-324.0*15.0*xyz^14.0+x0^3.0*27.0*57.0*xyz^56.0-x0^51.0*9.0*6.0*xyz^5.0-3.0*8.0*xyz^7.0-x0^6.0*1.6875*87.0*xyz^86.0+x0^8.0/1.7777777777777777*30.0*xyz^29.0+1.0/1.3333333333333333*21.0*xyz^20.0-x0^91.0*9.0*129.0*xyz^128.0-12.0*11.0*xyz^10.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-4860.0*xyz^14.0+x0^3.0*1539.0*xyz^56.0-x0^51.0*54.0*xyz^5.0-24.0*xyz^7.0-x0^6.0*146.8125*xyz^86.0+x0^8.0*16.875*xyz^29.0+15.75*xyz^20.0-x0^91.0*1161.0*xyz^128.0-132.0*xyz^10.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-324.0*xyz^15.0+x0^3.0*27.0*xyz^57.0-x0^51.0*9.0*xyz^6.0-3.0*xyz^8.0-x0^6.0*1.6875*xyz^87.0+x0^8.0/1.7777777777777777*xyz^30.0+1.0/1.3333333333333333*xyz^21.0-x0^91.0*9.0*xyz^129.0-12.0*xyz^11.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-324.0/16.0*xyz^16.0+x0^3.0*27.0/58.0*xyz^58.0-x0^51.0*9.0/7.0*xyz^7.0-3.0/9.0*xyz^9.0-x0^6.0*1.6875/88.0*xyz^88.0+x0^8.0/1.7777777777777777/31.0*xyz^31.0+1.0/1.3333333333333333/22.0*xyz^22.0-x0^91.0*9.0/130.0*xyz^130.0-12.0/12.0*xyz^12.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-20.25*xyz^16.0+x0^3.0*0.46551724137931033*xyz^58.0-x0^51.0*1.2857142857142858*xyz^7.0-0.3333333333333333*xyz^9.0-x0^6.0*0.019176136363636364*xyz^88.0+x0^8.0/55.11111111111111*xyz^31.0+0.034090909090909095*xyz^22.0-x0^91.0/14.444444444444445*xyz^130.0-xyz^12.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-4860.0*xyz^14.0+x0^3.0*1539.0*xyz^56.0-x0^51.0*54.0*xyz^5.0-24.0*xyz^7.0-x0^6.0*146.8125*xyz^86.0+x0^8.0*16.875*xyz^29.0+15.75*xyz^20.0-x0^91.0*1161.0*xyz^128.0-132.0*xyz^10.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-4860.0*14.0*xyz^13.0+x0^3.0*1539.0*56.0*xyz^55.0-x0^51.0*54.0*5.0*xyz^4.0-24.0*7.0*xyz^6.0-x0^6.0*146.8125*86.0*xyz^85.0+x0^8.0*16.875*29.0*xyz^28.0+15.75*20.0*xyz^19.0-x0^91.0*1161.0*128.0*xyz^127.0-132.0*10.0*xyz^9.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-68040.0*xyz^13.0+x0^3.0*86184.0*xyz^55.0-x0^51.0*270.0*xyz^4.0-168.0*xyz^6.0-x0^6.0*12625.875*xyz^85.0+x0^8.0*489.375*xyz^28.0+315.0*xyz^19.0-x0^91.0*148608.0*xyz^127.0-1320.0*xyz^9.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-20.25*xyz^16.0+x0^3.0*0.46551724137931033*xyz^58.0-x0^51.0*1.2857142857142858*xyz^7.0-0.3333333333333333*xyz^9.0-x0^6.0*0.019176136363636364*xyz^88.0+x0^8.0/55.11111111111111*xyz^31.0+0.034090909090909095*xyz^22.0-x0^91.0/14.444444444444445*xyz^130.0-xyz^12.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-20.25/17.0*xyz^17.0+x0^3.0*0.46551724137931033/59.0*xyz^59.0-x0^51.0*1.2857142857142858/8.0*xyz^8.0-0.3333333333333333/10.0*xyz^10.0-x0^6.0*0.019176136363636364/89.0*xyz^89.0+x0^8.0/55.11111111111111/32.0*xyz^32.0+0.034090909090909095/23.0*xyz^23.0-x0^91.0/14.444444444444445/131.0*xyz^131.0-1.0/13.0*xyz^13.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.1911764705882353*xyz^17.0+x0^3.0*0.007890122735242549*xyz^59.0-x0^51.0/6.222222222222221*xyz^8.0-0.03333333333333333*xyz^10.0-x0^6.0*2.1546220633299285E-4*xyz^89.0+x0^8.0/1763.5555555555554*xyz^32.0+0.001482213438735178*xyz^23.0-x0^91.0/1892.2222222222222*xyz^131.0-1.0/13.0*xyz^13.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-68040.0*xyz^13.0+x0^3.0*86184.0*xyz^55.0-x0^51.0*270.0*xyz^4.0-168.0*xyz^6.0-x0^6.0*12625.875*xyz^85.0+x0^8.0*489.375*xyz^28.0+315.0*xyz^19.0-x0^91.0*148608.0*xyz^127.0-1320.0*xyz^9.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-68040.0*13.0*xyz^12.0+x0^3.0*86184.0*55.0*xyz^54.0-x0^51.0*270.0*4.0*xyz^3.0-168.0*6.0*xyz^5.0-x0^6.0*12625.875*85.0*xyz^84.0+x0^8.0*489.375*28.0*xyz^27.0+315.0*19.0*xyz^18.0-x0^91.0*148608.0*127.0*xyz^126.0-1320.0*9.0*xyz^8.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-884520.0*xyz^12.0+x0^3.0*4740120.0*xyz^54.0-x0^51.0*1080.0*xyz^3.0-1008.0*xyz^5.0-x0^6.0*1073199.375*xyz^84.0+x0^8.0*13702.5*xyz^27.0+5985.0*xyz^18.0-x0^91.0*1.8873216E7*xyz^126.0-11880.0*xyz^8.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.1911764705882353*xyz^17.0+x0^3.0*0.007890122735242549*xyz^59.0-x0^51.0/6.222222222222221*xyz^8.0-0.03333333333333333*xyz^10.0-x0^6.0*2.1546220633299285E-4*xyz^89.0-4.0*xyz^89.0+x0^8.0/1763.5555555555554*xyz^32.0+0.001482213438735178*xyz^23.0-x0^91.0/1892.2222222222222*xyz^131.0-1.0/13.0*xyz^13.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.1911764705882353/18.0*xyz^18.0+x0^3.0*0.007890122735242549/60.0*xyz^60.0-x0^51.0/6.222222222222221/9.0*xyz^9.0-0.03333333333333333/11.0*xyz^11.0-x0^6.0*2.1546220633299285E-4/90.0*xyz^90.0-4.0/90.0*xyz^90.0+x0^8.0/1763.5555555555554/33.0*xyz^33.0+0.001482213438735178/24.0*xyz^24.0-x0^91.0/1892.2222222222222/132.0*xyz^132.0-1.0/13.0/14.0*xyz^14.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-0.0661764705882353*xyz^18.0+x0^3.0*1.315020455873758E-4*xyz^60.0-x0^51.0/55.99999999999999*xyz^9.0-0.0030303030303030303*xyz^11.0-x0^6.0/417706.6666666667*xyz^90.0-1.0/22.5*xyz^90.0-0.044444444444444446*xyz^90.0+x0^8.0/58197.33333333333*xyz^33.0+6.175889328063242E-5*xyz^24.0-x0^91.0/249773.3333333333*xyz^132.0-1.0/182.0*xyz^14.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-884520.0*xyz^12.0+x0^3.0*4740120.0*xyz^54.0-x0^51.0*1080.0*xyz^3.0-1008.0*xyz^5.0-x0^6.0*1073199.375*xyz^84.0+x0^8.0*13702.5*xyz^27.0+5985.0*xyz^18.0-x0^91.0*1.8873216E7*xyz^126.0-11880.0*xyz^8.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-884520.0*12.0*xyz^11.0+x0^3.0*4740120.0*54.0*xyz^53.0-x0^51.0*1080.0*3.0*xyz^2.0-1008.0*5.0*xyz^4.0-x0^6.0*1073199.375*84.0*xyz^83.0+x0^8.0*13702.5*27.0*xyz^26.0+5985.0*18.0*xyz^17.0-x0^91.0*1.8873216E7*126.0*xyz^125.0-11880.0*8.0*xyz^7.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1.061424E7*xyz^11.0+x0^3.0*2.5596648E8*xyz^53.0-x0^51.0*3240.0*xyz^2.0-5040.0*xyz^4.0-x0^6.0*9.01487475E7*xyz^83.0+x0^8.0*369967.5*xyz^26.0+107730.0*xyz^17.0-x0^91.0*2.378025216E9*xyz^125.0-95040.0*xyz^7.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-0.0661764705882353*xyz^18.0+x0^3.0*1.315020455873758E-4*xyz^60.0-4.0*xyz^60.0-x0^51.0/55.99999999999999*xyz^9.0-0.0030303030303030303*xyz^11.0-x0^6.0/417706.6666666667*xyz^90.0-1.0/22.5*xyz^90.0-0.044444444444444446*xyz^90.0+x0^8.0/58197.33333333333*xyz^33.0+6.175889328063242E-5*xyz^24.0-5.0*xyz^24.0-x0^91.0/249773.3333333333*xyz^132.0-1.0/182.0*xyz^14.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-0.0661764705882353/19.0*xyz^19.0+x0^3.0*1.315020455873758E-4/61.0*xyz^61.0-4.0/61.0*xyz^61.0-x0^51.0/55.99999999999999/10.0*xyz^10.0-0.0030303030303030303/12.0*xyz^12.0-x0^6.0/417706.6666666667/91.0*xyz^91.0-1.0/22.5/91.0*xyz^91.0-0.044444444444444446/91.0*xyz^91.0+x0^8.0/58197.33333333333/34.0*xyz^34.0+6.175889328063242E-5/25.0*xyz^25.0-5.0/25.0*xyz^25.0-x0^91.0/249773.3333333333/133.0*xyz^133.0-1.0/182.0/15.0*xyz^15.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-0.00348297213622291*xyz^19.0+x0^3.0/463871.11111111107*xyz^61.0-1.0/15.25*xyz^61.0-0.06557377049180328*xyz^61.0-x0^51.0/559.9999999999999*xyz^10.0-2.525252525252525E-4*xyz^12.0-x0^6.0/3.801130666666667E7*xyz^91.0-1.0/2047.5*xyz^91.0-4.884004884004884E-4*xyz^91.0+x0^8.0/1978709.3333333333*xyz^34.0+1.0/404799.99999999994*xyz^25.0-1.0/5.0*xyz^25.0-0.2*xyz^25.0-x0^91.0/3.3219853333333332E7*xyz^133.0-1.0/2730.0*xyz^15.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131350() {
 UsageCalculus.TestCase = 131350;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "4*x0^3/-1*x0^4*+-3*x0^51*xyza^2^4*+-3*xyza^3^5-3*xyza^3^54*x0^6/1*x0^7*--3*x0^8/-4*x0^91*xyza^2^7*--3*xyza^3^8/-4*xyza^1^9-3*xyza^3^8/-4*xyza^1^94*x0^91*xyza^2^10*-3*xyza^3*-4*xyza^1^2/-1*xyza^2^3-3*xyza^3*-4*xyza^1^2/-1*xyza^2^34*x0^2/-1*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=349 EqnNumber=50 FamilyID=1 MotifTag=1 Entropy=4 FuncWrapAliasID=1"+
"// MetaRow=[12, 50, 10, 11, 4, 3, 1, 5, 1, 1, 2, 1, 2, 3, 4, 3, 1, 1, 2, 3, 4, 3, 2, 3, 1, 1, 7, 3, 4, 5, 2, 16]"+
"// DOEMatrixRow=[3, 50, 19, 3, 1, 2, 3, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 32, 1, 3, 1, 3, 1, 2, 3, 4, 2, 3, 1, 2, 1]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^3.0*36.0-x0^51.0*9.0*xyza^6.0-3.0*xyza^8.0-x0^6.0*1.6875*xyza^87.0+x0^8.0/1.7777777777777777*xyza^30.0+1.0/1.3333333333333333*xyza^21.0-x0^91.0*9.0*xyza^129.0+x0^2.0*12.0*xyza^42.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^3.0*36.0*0.0-x0^51.0*9.0*6.0*xyza^5.0-3.0*8.0*xyza^7.0-x0^6.0*1.6875*87.0*xyza^86.0+x0^8.0/1.7777777777777777*30.0*xyza^29.0+1.0/1.3333333333333333*21.0*xyza^20.0-x0^91.0*9.0*129.0*xyza^128.0+x0^2.0*12.0*42.0*xyza^41.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^3.0*0.0-x0^51.0*54.0*xyza^5.0-24.0*xyza^7.0-x0^6.0*146.8125*xyza^86.0+x0^8.0*16.875*xyza^29.0+15.75*xyza^20.0-x0^91.0*1161.0*xyza^128.0+x0^2.0*504.0*xyza^41.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^3.0*36.0-x0^51.0*9.0*xyza^6.0-3.0*xyza^8.0-x0^6.0*1.6875*xyza^87.0+x0^8.0/1.7777777777777777*xyza^30.0+1.0/1.3333333333333333*xyza^21.0-x0^91.0*9.0*xyza^129.0+x0^2.0*12.0*xyza^42.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^3.0*36.0*xyza-x0^51.0*9.0/7.0*xyza^7.0-3.0/9.0*xyza^9.0-x0^6.0*1.6875/88.0*xyza^88.0+x0^8.0/1.7777777777777777/31.0*xyza^31.0+1.0/1.3333333333333333/22.0*xyza^22.0-x0^91.0*9.0/130.0*xyza^130.0+x0^2.0*12.0/43.0*xyza^43.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^3.0*36.0*xyza-x0^51.0*1.2857142857142858*xyza^7.0-0.3333333333333333*xyza^9.0-x0^6.0*0.019176136363636364*xyza^88.0+x0^8.0/55.11111111111111*xyza^31.0+0.034090909090909095*xyza^22.0-x0^91.0*0.06923076923076923*xyza^130.0+x0^2.0/3.5833333333333335*xyza^43.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^3.0*0.0-x0^51.0*54.0*xyza^5.0-24.0*xyza^7.0-x0^6.0*146.8125*xyza^86.0+x0^8.0*16.875*xyza^29.0+15.75*xyza^20.0-x0^91.0*1161.0*xyza^128.0+x0^2.0*504.0*xyza^41.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^3.0*0.0-x0^51.0*54.0*5.0*xyza^4.0-24.0*7.0*xyza^6.0-x0^6.0*146.8125*86.0*xyza^85.0+x0^8.0*16.875*29.0*xyza^28.0+15.75*20.0*xyza^19.0-x0^91.0*1161.0*128.0*xyza^127.0+x0^2.0*504.0*41.0*xyza^40.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^3.0*0.0-x0^51.0*270.0*xyza^4.0-168.0*xyza^6.0-x0^6.0*12625.875*xyza^85.0+x0^8.0*489.375*xyza^28.0+315.0*xyza^19.0-x0^91.0*148608.0*xyza^127.0+x0^2.0*20664.0*xyza^40.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^3.0*36.0*xyza-x0^51.0*1.2857142857142858*xyza^7.0-0.3333333333333333*xyza^9.0-x0^6.0*0.019176136363636364*xyza^88.0+x0^8.0/55.11111111111111*xyza^31.0+0.034090909090909095*xyza^22.0-x0^91.0*0.06923076923076923*xyza^130.0+x0^2.0/3.5833333333333335*xyza^43.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^3.0*36.0/2.0*xyza^2.0-x0^51.0*1.2857142857142858/8.0*xyza^8.0-0.3333333333333333/10.0*xyza^10.0-x0^6.0*0.019176136363636364/89.0*xyza^89.0+x0^8.0/55.11111111111111/32.0*xyza^32.0+0.034090909090909095/23.0*xyza^23.0-x0^91.0*0.06923076923076923/131.0*xyza^131.0+x0^2.0*3.5833333333333335/44.0*xyza^44.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^3.0*18.0*xyza^2.0-x0^51.0/6.222222222222221*xyza^8.0-0.03333333333333333*xyza^10.0-x0^6.0*2.1546220633299285E-4*xyza^89.0+x0^8.0/1763.5555555555554*xyza^32.0+0.001482213438735178*xyza^23.0-x0^91.0*5.284791544333529E-4*xyza^131.0+x0^2.0/12.27906976744186*xyza^44.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^3.0*0.0-x0^51.0*270.0*xyza^4.0-168.0*xyza^6.0-x0^6.0*12625.875*xyza^85.0+x0^8.0*489.375*xyza^28.0+315.0*xyza^19.0-x0^91.0*148608.0*xyza^127.0+x0^2.0*20664.0*xyza^40.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^3.0*0.0-x0^51.0*270.0*4.0*xyza^3.0-168.0*6.0*xyza^5.0-x0^6.0*12625.875*85.0*xyza^84.0+x0^8.0*489.375*28.0*xyza^27.0+315.0*19.0*xyza^18.0-x0^91.0*148608.0*127.0*xyza^126.0+x0^2.0*20664.0*40.0*xyza^39.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^3.0*0.0-x0^51.0*1080.0*xyza^3.0-1008.0*xyza^5.0-x0^6.0*1073199.375*xyza^84.0+x0^8.0*13702.5*xyza^27.0+5985.0*xyza^18.0-x0^91.0*1.8873216E7*xyza^126.0+x0^2.0*826560.0*xyza^39.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^3.0*18.0*xyza^2.0-x0^51.0/6.222222222222221*xyza^8.0-0.03333333333333333*xyza^10.0-x0^6.0*2.1546220633299285E-4*xyza^89.0-4.0*xyza^89.0+x0^8.0/1763.5555555555554*xyza^32.0+0.001482213438735178*xyza^23.0-x0^91.0*5.284791544333529E-4*xyza^131.0-4.0*xyza^131.0+x0^2.0/12.27906976744186*xyza^44.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^3.0*18.0/3.0*xyza^3.0-x0^51.0/6.222222222222221/9.0*xyza^9.0-0.03333333333333333/11.0*xyza^11.0-x0^6.0*2.1546220633299285E-4/90.0*xyza^90.0-4.0/90.0*xyza^90.0+x0^8.0/1763.5555555555554/33.0*xyza^33.0+0.001482213438735178/24.0*xyza^24.0-x0^91.0*5.284791544333529E-4/132.0*xyza^132.0-4.0/132.0*xyza^132.0+x0^2.0*12.27906976744186/45.0*xyza^45.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^3.0*6.0*xyza^3.0-x0^51.0/55.99999999999999*xyza^9.0-0.0030303030303030303*xyza^11.0-x0^6.0/417706.6666666667*xyza^90.0-1.0/22.5*xyza^90.0-0.044444444444444446*xyza^90.0+x0^8.0/58197.33333333333*xyza^33.0+6.175889328063242E-5*xyza^24.0-x0^91.0/249773.3333333333*xyza^132.0-1.0/33.0*xyza^132.0-0.030303030303030304*xyza^132.0+x0^2.0/3.6647727272727275*xyza^45.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^3.0*0.0-x0^51.0*1080.0*xyza^3.0-1008.0*xyza^5.0-x0^6.0*1073199.375*xyza^84.0+x0^8.0*13702.5*xyza^27.0+5985.0*xyza^18.0-x0^91.0*1.8873216E7*xyza^126.0+x0^2.0*826560.0*xyza^39.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^3.0*0.0-x0^51.0*1080.0*3.0*xyza^2.0-1008.0*5.0*xyza^4.0-x0^6.0*1073199.375*84.0*xyza^83.0+x0^8.0*13702.5*27.0*xyza^26.0+5985.0*18.0*xyza^17.0-x0^91.0*1.8873216E7*126.0*xyza^125.0+x0^2.0*826560.0*39.0*xyza^38.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^3.0*0.0-x0^51.0*3240.0*xyza^2.0-5040.0*xyza^4.0-x0^6.0*9.01487475E7*xyza^83.0+x0^8.0*369967.5*xyza^26.0+107730.0*xyza^17.0-x0^91.0*2.378025216E9*xyza^125.0+x0^2.0*3.223584E7*xyza^38.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^3.0*6.0*xyza^3.0-x0^51.0/55.99999999999999*xyza^9.0-0.0030303030303030303*xyza^11.0-x0^6.0/417706.6666666667*xyza^90.0-1.0/22.5*xyza^90.0-0.044444444444444446*xyza^90.0+x0^8.0/58197.33333333333*xyza^33.0+6.175889328063242E-5*xyza^24.0-5.0*xyza^24.0-x0^91.0/249773.3333333333*xyza^132.0-1.0/33.0*xyza^132.0-0.030303030303030304*xyza^132.0+x0^2.0/3.6647727272727275*xyza^45.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^3.0*6.0/4.0*xyza^4.0-x0^51.0/55.99999999999999/10.0*xyza^10.0-0.0030303030303030303/12.0*xyza^12.0-x0^6.0/417706.6666666667/91.0*xyza^91.0-1.0/22.5/91.0*xyza^91.0-0.044444444444444446/91.0*xyza^91.0+x0^8.0/58197.33333333333/34.0*xyza^34.0+6.175889328063242E-5/25.0*xyza^25.0-5.0/25.0*xyza^25.0-x0^91.0/249773.3333333333/133.0*xyza^133.0-1.0/33.0/133.0*xyza^133.0-0.030303030303030304/133.0*xyza^133.0+x0^2.0*3.6647727272727275/46.0*xyza^46.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^3.0*1.5*xyza^4.0-x0^51.0/559.9999999999999*xyza^10.0-2.525252525252525E-4*xyza^12.0-x0^6.0/3.801130666666667E7*xyza^91.0-1.0/2047.5*xyza^91.0-4.884004884004884E-4*xyza^91.0+x0^8.0/1978709.3333333333*xyza^34.0+1.0/404799.99999999994*xyza^25.0-1.0/5.0*xyza^25.0-0.2*xyza^25.0-x0^91.0/3.3219853333333332E7*xyza^133.0-1.0/4389.0*xyza^133.0-2.2784233310549102E-4*xyza^133.0+x0^2.0/12.551937984496123*xyza^46.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131351() {
 UsageCalculus.TestCase = 131351;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x^2^4*+-3*x^3^5-3*x^3^54*x0^6/1*x0^7*--3*x0^8/-4*x0^91*x^2^7*--3*x^3^8/-4*x^1^9-3*x^3^8/-4*x^1^94*x0^91*x^2^10*-3*x^3*-4*x^1^2/-1*x^2^3-3*x^3*-4*x^1^2/-1*x^2^34*x0^2/-1*x0^31*x^2^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=350 EqnNumber=51 FamilyID=2 MotifTag=3 Entropy=1 FuncWrapAliasID=3"+
"// MetaRow=[12, 51, 10, 10, 1, 1, 2, 6, 2, 3, 4, 2, 3, 1, 1, 1, 2, 1, 3, 1, 1, 4, 3, 1, 2, 3, 8, 1, 1, 6, 3, 17]"+
"// DOEMatrixRow=[3, 51, 19, 2, 3, 1, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 33, 2, 1, 2, 4, 2, 3, 4, 1, 3, 1, 2, 3, 2]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "3.0*x^6.0-3.0*x^8.0-1.6875*x^87.0+1.0/1.7777777777777777*x^30.0+1.0/1.3333333333333333*x^21.0-9.0*x^129.0+12.0*x^47.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "3.0*6.0*x^5.0-3.0*8.0*x^7.0-1.6875*87.0*x^86.0+1.0/1.7777777777777777*30.0*x^29.0+1.0/1.3333333333333333*21.0*x^20.0-9.0*129.0*x^128.0+12.0*47.0*x^46.0";
 UsageCalculus.EqnSolArrayMap2[1] = "18.0*x^5.0-24.0*x^7.0-146.8125*x^86.0+16.875*x^29.0+15.75*x^20.0-1161.0*x^128.0+564.0*x^46.0";
 UsageCalculus.EqnSolArrayMap3[1] = "3.0*x^6.0-3.0*x^8.0-1.6875*x^87.0+1.0/1.7777777777777777*x^30.0+1.0/1.3333333333333333*x^21.0-9.0*x^129.0+12.0*x^47.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "3.0/7.0*x^7.0-3.0/9.0*x^9.0-1.6875/88.0*x^88.0+1.0/1.7777777777777777/31.0*x^31.0+1.0/1.3333333333333333/22.0*x^22.0-9.0/130.0*x^130.0+12.0/48.0*x^48.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/2.3333333333333335*x^7.0-1.0/3.0*x^9.0-1.0/52.148148148148145*x^88.0+1.0/55.11111111111111*x^31.0+1.0/29.333333333333332*x^22.0-1.0/14.444444444444445*x^130.0+1.0/4.0*x^48.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "18.0*x^5.0-24.0*x^7.0-146.8125*x^86.0+16.875*x^29.0+15.75*x^20.0-1161.0*x^128.0+564.0*x^46.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "18.0*5.0*x^4.0-24.0*7.0*x^6.0-146.8125*86.0*x^85.0+16.875*29.0*x^28.0+15.75*20.0*x^19.0-1161.0*128.0*x^127.0+564.0*46.0*x^45.0";
 UsageCalculus.EqnSolArrayMap2[2] = "90.0*x^4.0-168.0*x^6.0-12625.875*x^85.0+489.375*x^28.0+315.0*x^19.0-148608.0*x^127.0+25944.0*x^45.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/2.3333333333333335*x^7.0-1.0/3.0*x^9.0-1.0/52.148148148148145*x^88.0+1.0/55.11111111111111*x^31.0+1.0/29.333333333333332*x^22.0-1.0/14.444444444444445*x^130.0+1.0/4.0*x^48.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/2.3333333333333335/8.0*x^8.0-1.0/3.0/10.0*x^10.0-1.0/52.148148148148145/89.0*x^89.0+1.0/55.11111111111111/32.0*x^32.0+1.0/29.333333333333332/23.0*x^23.0-1.0/14.444444444444445/131.0*x^131.0+1.0/4.0/49.0*x^49.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/18.666666666666668*x^8.0-1.0/30.0*x^10.0-1.0/4641.185185185185*x^89.0+1.0/1763.5555555555554*x^32.0+1.0/674.6666666666666*x^23.0-1.0/1892.2222222222222*x^131.0+1.0/196.0*x^49.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "90.0*x^4.0-168.0*x^6.0-12625.875*x^85.0+489.375*x^28.0+315.0*x^19.0-148608.0*x^127.0+25944.0*x^45.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "90.0*4.0*x^3.0-168.0*6.0*x^5.0-12625.875*85.0*x^84.0+489.375*28.0*x^27.0+315.0*19.0*x^18.0-148608.0*127.0*x^126.0+25944.0*45.0*x^44.0";
 UsageCalculus.EqnSolArrayMap2[3] = "360.0*x^3.0-1008.0*x^5.0-1073199.375*x^84.0+13702.5*x^27.0+5985.0*x^18.0-1.8873216E7*x^126.0+1167480.0*x^44.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/18.666666666666668*x^8.0-1.0/30.0*x^10.0-1.0/4641.185185185185*x^89.0+1.0/1763.5555555555554*x^32.0+1.0/674.6666666666666*x^23.0-1.0/1892.2222222222222*x^131.0+1.0/196.0*x^49.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/18.666666666666668/9.0*x^9.0-1.0/30.0/11.0*x^11.0-1.0/4641.185185185185/90.0*x^90.0+1.0/1763.5555555555554/33.0*x^33.0+1.0/674.6666666666666/24.0*x^24.0-1.0/1892.2222222222222/132.0*x^132.0+1.0/196.0/50.0*x^50.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/168.0*x^9.0-1.0/330.0*x^11.0-1.0/417706.6666666667*x^90.0+1.0/58197.33333333333*x^33.0+1.0/16192.0*x^24.0-1.0/249773.3333333333*x^132.0+1.0/9800.0*x^50.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "360.0*x^3.0-1008.0*x^5.0-1073199.375*x^84.0+13702.5*x^27.0+5985.0*x^18.0-1.8873216E7*x^126.0+1167480.0*x^44.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "360.0*3.0*x^2.0-1008.0*5.0*x^4.0-1073199.375*84.0*x^83.0+13702.5*27.0*x^26.0+5985.0*18.0*x^17.0-126.0*x^125.0+1167480.0*44.0*x^43.0";
 UsageCalculus.EqnSolArrayMap2[4] = "1080.0*x^2.0-5040.0*x^4.0-9.01487475E7*x^83.0+369967.5*x^26.0+107730.0*x^17.0-126.0*x^125.0+5.136912E7*x^43.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/168.0*x^9.0-1.0/330.0*x^11.0-1.0/417706.6666666667*x^90.0+1.0/58197.33333333333*x^33.0+1.0/16192.0*x^24.0-1.0/249773.3333333333*x^132.0+1.0/9800.0*x^50.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/168.0/10.0*x^10.0-1.0/330.0/12.0*x^12.0-1.0/417706.6666666667/91.0*x^91.0+1.0/58197.33333333333/34.0*x^34.0+1.0/16192.0/25.0*x^25.0-1.0/249773.3333333333/133.0*x^133.0+1.0/9800.0/51.0*x^51.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/1680.0*x^10.0-1.0/3960.0*x^12.0-1.0/3.801130666666667E7*x^91.0+1.0/1978709.3333333333*x^34.0+1.0/404800.0*x^25.0-1.0/3.3219853333333332E7*x^133.0+1.0/499800.0*x^51.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131352() {
 UsageCalculus.TestCase = 131352;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xy^3^54*x0^6/1*x0^7*--3*x0^8/-4*x0^91*xy^2^7*--3*xy^3^8/-4*xy^1^9-3*xy^3^8/-4*xy^1^94*x0^91*xy^2^10*-3*xy^3*-4*xy^1^2/-1*xy^2^3-3*xy^3*-4*xy^1^2/-1*xy^2^34*x0^2/-1*x0^31*xy^2^3-3*xy^3^4*4*xy^1^5/1*xy^2^6*--3*xy^3^7";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=351 EqnNumber=52 FamilyID=3 MotifTag=4 Entropy=3 FuncWrapAliasID=4"+
"// MetaRow=[12, 52, 10, 9, 2, 3, 1, 7, 3, 4, 1, 1, 1, 2, 3, 2, 3, 2, 4, 2, 3, 5, 1, 2, 3, 4, 9, 2, 3, 7, 4, 18]"+
"// DOEMatrixRow=[3, 52, 19, 1, 2, 3, 2, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 34, 3, 2, 3, 5, 3, 1, 5, 2, 1, 2, 3, 4, 1]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^6.0*1.6875*xy^87.0+x0^8.0/1.7777777777777777*xy^30.0+1.0/1.3333333333333333*xy^21.0-x0^91.0*9.0*xy^129.0+x0^2.0*12.0*xy^47.0-36.0*xy^31.0-3.0*xy^10.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^6.0*1.6875*87.0*xy^86.0+x0^8.0/1.7777777777777777*30.0*xy^29.0+1.0/1.3333333333333333*21.0*xy^20.0-x0^91.0*9.0*129.0*xy^128.0+x0^2.0*12.0*47.0*xy^46.0-36.0*31.0*xy^30.0-3.0*10.0*xy^9.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^6.0*146.8125*xy^86.0+x0^8.0*16.875*xy^29.0+15.75*xy^20.0-x0^91.0*1161.0*xy^128.0+x0^2.0*564.0*xy^46.0-1116.0*xy^30.0-30.0*xy^9.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^6.0*1.6875*xy^87.0+x0^8.0/1.7777777777777777*xy^30.0+1.0/1.3333333333333333*xy^21.0-x0^91.0*9.0*xy^129.0+x0^2.0*12.0*xy^47.0-36.0*xy^31.0-3.0*xy^10.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^6.0*1.6875/88.0*xy^88.0+x0^8.0/1.7777777777777777/31.0*xy^31.0+1.0/1.3333333333333333/22.0*xy^22.0-x0^91.0*9.0/130.0*xy^130.0+x0^2.0*12.0/48.0*xy^48.0-36.0/32.0*xy^32.0-3.0/11.0*xy^11.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^6.0*0.019176136363636364*xy^88.0+x0^8.0/55.11111111111111*xy^31.0+0.034090909090909095*xy^22.0-x0^91.0*0.06923076923076923*xy^130.0+x0^2.0/4.0*xy^48.0-1.125*xy^32.0-1.0/3.6666666666666665*xy^11.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^6.0*146.8125*xy^86.0+x0^8.0*16.875*xy^29.0+15.75*xy^20.0-x0^91.0*1161.0*xy^128.0+x0^2.0*564.0*xy^46.0-1116.0*xy^30.0-30.0*xy^9.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^6.0*146.8125*86.0*xy^85.0+x0^8.0*16.875*29.0*xy^28.0+15.75*20.0*xy^19.0-x0^91.0*1161.0*128.0*xy^127.0+x0^2.0*564.0*46.0*xy^45.0-1116.0*30.0*xy^29.0-30.0*9.0*xy^8.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^6.0*12625.875*xy^85.0+x0^8.0*489.375*xy^28.0+315.0*xy^19.0-x0^91.0*148608.0*xy^127.0+x0^2.0*25944.0*xy^45.0-33480.0*xy^29.0-270.0*xy^8.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^6.0*0.019176136363636364*xy^88.0+x0^8.0/55.11111111111111*xy^31.0+0.034090909090909095*xy^22.0-x0^91.0*0.06923076923076923*xy^130.0+x0^2.0/4.0*xy^48.0-1.125*xy^32.0-1.0/3.6666666666666665*xy^11.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^6.0*0.019176136363636364/89.0*xy^89.0+x0^8.0/55.11111111111111/32.0*xy^32.0+0.034090909090909095/23.0*xy^23.0-x0^91.0*0.06923076923076923/131.0*xy^131.0+x0^2.0/4.0/49.0*xy^49.0-1.125/33.0*xy^33.0-1.0/3.6666666666666665/12.0*xy^12.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^6.0*2.1546220633299285E-4*xy^89.0+x0^8.0/1763.5555555555554*xy^32.0+0.001482213438735178*xy^23.0-x0^91.0*5.284791544333529E-4*xy^131.0+x0^2.0/196.0*xy^49.0-1.0/29.333333333333332*xy^33.0-1.0/44.0*xy^12.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^6.0*12625.875*xy^85.0+x0^8.0*489.375*xy^28.0+315.0*xy^19.0-x0^91.0*148608.0*xy^127.0+x0^2.0*25944.0*xy^45.0-33480.0*xy^29.0-270.0*xy^8.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^6.0*12625.875*85.0*xy^84.0+x0^8.0*489.375*28.0*xy^27.0+315.0*19.0*xy^18.0-x0^91.0*148608.0*127.0*xy^126.0+x0^2.0*25944.0*45.0*xy^44.0-33480.0*29.0*xy^28.0-270.0*8.0*xy^7.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^6.0*1073199.375*xy^84.0+x0^8.0*13702.5*xy^27.0+5985.0*xy^18.0-x0^91.0*1.8873216E7*xy^126.0+x0^2.0*1167480.0*xy^44.0-970920.0*xy^28.0-2160.0*xy^7.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^6.0*2.1546220633299285E-4*xy^89.0-4.0*xy^89.0+x0^8.0/1763.5555555555554*xy^32.0+0.001482213438735178*xy^23.0-x0^91.0*5.284791544333529E-4*xy^131.0-4.0*xy^131.0+x0^2.0/196.0*xy^49.0-1.0/29.333333333333332*xy^33.0-1.0/44.0*xy^12.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^6.0*2.1546220633299285E-4/90.0*xy^90.0-4.0/90.0*xy^90.0+x0^8.0/1763.5555555555554/33.0*xy^33.0+0.001482213438735178/24.0*xy^24.0-x0^91.0*5.284791544333529E-4/132.0*xy^132.0-4.0/132.0*xy^132.0+x0^2.0/196.0/50.0*xy^50.0-1.0/29.333333333333332/34.0*xy^34.0-1.0/44.0/13.0*xy^13.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^6.0/417706.6666666667*xy^90.0-1.0/22.5*xy^90.0-0.044444444444444446*xy^90.0+x0^8.0/58197.33333333333*xy^33.0+6.175889328063242E-5*xy^24.0-x0^91.0/249773.3333333333*xy^132.0-1.0/33.0*xy^132.0-0.030303030303030304*xy^132.0+x0^2.0/9800.0*xy^50.0-1.0/997.3333333333333*xy^34.0-1.0/572.0*xy^13.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^6.0*1073199.375*xy^84.0+x0^8.0*13702.5*xy^27.0+5985.0*xy^18.0-x0^91.0*1.8873216E7*xy^126.0+x0^2.0*1167480.0*xy^44.0-970920.0*xy^28.0-2160.0*xy^7.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^6.0*1073199.375*84.0*xy^83.0+x0^8.0*13702.5*27.0*xy^26.0+5985.0*18.0*xy^17.0-x0^91.0*1.8873216E7*126.0*xy^125.0+x0^2.0*1167480.0*44.0*xy^43.0-970920.0*28.0*xy^27.0-2160.0*7.0*xy^6.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^6.0*9.01487475E7*xy^83.0+x0^8.0*369967.5*xy^26.0+107730.0*xy^17.0-x0^91.0*2.378025216E9*xy^125.0+x0^2.0*5.136912E7*xy^43.0-2.718576E7*xy^27.0-15120.0*xy^6.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^6.0/417706.6666666667*xy^90.0-1.0/22.5*xy^90.0-0.044444444444444446*xy^90.0+x0^8.0/58197.33333333333*xy^33.0+6.175889328063242E-5*xy^24.0-5.0*xy^24.0-x0^91.0/249773.3333333333*xy^132.0-1.0/33.0*xy^132.0-0.030303030303030304*xy^132.0+x0^2.0/9800.0*xy^50.0-1.0/997.3333333333333*xy^34.0-1.0/572.0*xy^13.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^6.0/417706.6666666667/91.0*xy^91.0-1.0/22.5/91.0*xy^91.0-0.044444444444444446/91.0*xy^91.0+x0^8.0/58197.33333333333/34.0*xy^34.0+6.175889328063242E-5/25.0*xy^25.0-5.0/25.0*xy^25.0-x0^91.0/249773.3333333333/133.0*xy^133.0-1.0/33.0/133.0*xy^133.0-0.030303030303030304/133.0*xy^133.0+x0^2.0/9800.0/51.0*xy^51.0-1.0/997.3333333333333/35.0*xy^35.0-1.0/572.0/14.0*xy^14.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^6.0/3.801130666666667E7*xy^91.0-1.0/2047.5*xy^91.0-4.884004884004884E-4*xy^91.0+x0^8.0/1978709.3333333333*xy^34.0+1.0/404799.99999999994*xy^25.0-1.0/5.0*xy^25.0-0.2*xy^25.0-x0^91.0/3.3219853333333332E7*xy^133.0-1.0/4389.0*xy^133.0-2.2784233310549102E-4*xy^133.0+x0^2.0/499800.0*xy^51.0-1.0/34906.666666666664*xy^35.0-1.0/8008.0*xy^14.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131353() {
 UsageCalculus.TestCase = 131353;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "4*x0^6/1*x0^7*--3*x0^8/-4*x0^91*xyz^2^7*--3*xyz^3^8/-4*xyz^1^9-3*xyz^3^8/-4*xyz^1^94*x0^91*xyz^2^10*-3*xyz^3*-4*xyz^1^2/-1*xyz^2^3-3*xyz^3*-4*xyz^1^2/-1*xyz^2^34*x0^2/-1*x0^31*xyz^2^3-3*xyz^3^4*4*xyz^1^5/1*xyz^2^6*--3*xyz^3^74*x0^5/1*x0^6*--3*x0^7";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=352 EqnNumber=53 FamilyID=1 MotifTag=1 Entropy=4 FuncWrapAliasID=1"+
"// MetaRow=[12, 53, 10, 8, 3, 1, 2, 8, 1, 1, 2, 1, 2, 3, 4, 3, 1, 1, 5, 3, 4, 6, 2, 3, 1, 1, 10, 3, 4, 8, 1, 19]"+
"// DOEMatrixRow=[3, 53, 19, 4, 3, 1, 3, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 35, 4, 3, 1, 1, 1, 2, 6, 3, 2, 3, 4, 5, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^6.0*2.25*xyz^30.0+x0^8.0/1.7777777777777777*xyz^30.0+1.0/1.3333333333333333*xyz^21.0-x0^91.0*9.0*xyz^129.0+x0^2.0*12.0*xyz^47.0-x0^5.0*108.0*xyz^98.0-x0^5.0*9.0*xyz^77.0-x0^7.0*3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^6.0*2.25*30.0*xyz^29.0+x0^8.0/1.7777777777777777*30.0*xyz^29.0+1.0/1.3333333333333333*21.0*xyz^20.0-x0^91.0*9.0*129.0*xyz^128.0+x0^2.0*12.0*47.0*xyz^46.0-x0^5.0*108.0*98.0*xyz^97.0-x0^5.0*9.0*77.0*xyz^76.0-x0^7.0*3.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^6.0*67.5*xyz^29.0+x0^8.0*16.875*xyz^29.0+15.75*xyz^20.0-x0^91.0*1161.0*xyz^128.0+x0^2.0*564.0*xyz^46.0-x0^5.0*10584.0*xyz^97.0-x0^5.0*693.0*xyz^76.0-x0^7.0*0.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^6.0*2.25*xyz^30.0+x0^8.0/1.7777777777777777*xyz^30.0+1.0/1.3333333333333333*xyz^21.0-x0^91.0*9.0*xyz^129.0+x0^2.0*12.0*xyz^47.0-x0^5.0*108.0*xyz^98.0-x0^5.0*9.0*xyz^77.0-x0^7.0*3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^6.0*2.25/31.0*xyz^31.0+x0^8.0/1.7777777777777777/31.0*xyz^31.0+1.0/1.3333333333333333/22.0*xyz^22.0-x0^91.0*9.0/130.0*xyz^130.0+x0^2.0*12.0/48.0*xyz^48.0-x0^5.0*108.0/99.0*xyz^99.0-x0^5.0*9.0/78.0*xyz^78.0-x0^7.0*3.0*xyz";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^6.0*0.07258064516129033*xyz^31.0+x0^8.0/55.11111111111111*xyz^31.0+0.034090909090909095*xyz^22.0-x0^91.0*0.06923076923076923*xyz^130.0+x0^2.0*0.25*xyz^48.0-x0^5.0*1.0909090909090908*xyz^99.0-x0^5.0*0.11538461538461539*xyz^78.0-x0^7.0*3.0*xyz";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^6.0*67.5*xyz^29.0+x0^8.0*16.875*xyz^29.0+15.75*xyz^20.0-x0^91.0*1161.0*xyz^128.0+x0^2.0*564.0*xyz^46.0-x0^5.0*10584.0*xyz^97.0-x0^5.0*693.0*xyz^76.0-x0^7.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^6.0*67.5*29.0*xyz^28.0+x0^8.0*16.875*29.0*xyz^28.0+15.75*20.0*xyz^19.0-x0^91.0*1161.0*128.0*xyz^127.0+x0^2.0*564.0*46.0*xyz^45.0-x0^5.0*10584.0*97.0*xyz^96.0-x0^5.0*693.0*76.0*xyz^75.0-x0^7.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^6.0*1957.5*xyz^28.0+x0^8.0*489.375*xyz^28.0+315.0*xyz^19.0-x0^91.0*148608.0*xyz^127.0+x0^2.0*25944.0*xyz^45.0-x0^5.0*1026648.0*xyz^96.0-x0^5.0*52668.0*xyz^75.0-x0^7.0*0.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^6.0*0.07258064516129033*xyz^31.0+x0^8.0/55.11111111111111*xyz^31.0+0.034090909090909095*xyz^22.0-x0^91.0*0.06923076923076923*xyz^130.0+x0^2.0*0.25*xyz^48.0-x0^5.0*1.0909090909090908*xyz^99.0-x0^5.0*0.11538461538461539*xyz^78.0-x0^7.0*3.0*xyz";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^6.0*0.07258064516129033/32.0*xyz^32.0+x0^8.0/55.11111111111111/32.0*xyz^32.0+0.034090909090909095/23.0*xyz^23.0-x0^91.0*0.06923076923076923/131.0*xyz^131.0+x0^2.0*0.25/49.0*xyz^49.0-x0^5.0*1.0909090909090908/100.0*xyz^100.0-x0^5.0*0.11538461538461539/79.0*xyz^79.0-x0^7.0*3.0/2.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^6.0*0.0022681451612903227*xyz^32.0+x0^8.0/1763.5555555555554*xyz^32.0+0.001482213438735178*xyz^23.0-x0^91.0*5.284791544333529E-4*xyz^131.0+x0^2.0*0.00510204081632653*xyz^49.0-x0^5.0*0.010909090909090908*xyz^100.0-x0^5.0*0.0014605647517039924*xyz^79.0-x0^7.0*1.5*xyz^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^6.0*1957.5*xyz^28.0+x0^8.0*489.375*xyz^28.0+315.0*xyz^19.0-x0^91.0*148608.0*xyz^127.0+x0^2.0*25944.0*xyz^45.0-x0^5.0*1026648.0*xyz^96.0-x0^5.0*52668.0*xyz^75.0-x0^7.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^6.0*1957.5*28.0*xyz^27.0+x0^8.0*489.375*28.0*xyz^27.0+315.0*19.0*xyz^18.0-x0^91.0*148608.0*127.0*xyz^126.0+x0^2.0*25944.0*45.0*xyz^44.0-x0^5.0*1026648.0*96.0*xyz^95.0-x0^5.0*52668.0*75.0*xyz^74.0-x0^7.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^6.0*54810.0*xyz^27.0+x0^8.0*13702.5*xyz^27.0+5985.0*xyz^18.0-x0^91.0*1.8873216E7*xyz^126.0+x0^2.0*1167480.0*xyz^44.0-x0^5.0*9.8558208E7*xyz^95.0-x0^5.0*3950100.0*xyz^74.0-x0^7.0*0.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^6.0*0.0022681451612903227*xyz^32.0+x0^8.0/1763.5555555555554*xyz^32.0+0.001482213438735178*xyz^23.0-x0^91.0*5.284791544333529E-4*xyz^131.0-4.0*xyz^131.0+x0^2.0*0.00510204081632653*xyz^49.0-x0^5.0*0.010909090909090908*xyz^100.0-x0^5.0*0.0014605647517039924*xyz^79.0-x0^7.0*1.5*xyz^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^6.0*0.0022681451612903227/33.0*xyz^33.0+x0^8.0/1763.5555555555554/33.0*xyz^33.0+0.001482213438735178/24.0*xyz^24.0-x0^91.0*5.284791544333529E-4/132.0*xyz^132.0-4.0/132.0*xyz^132.0+x0^2.0*0.00510204081632653/50.0*xyz^50.0-x0^5.0*0.010909090909090908/101.0*xyz^101.0-x0^5.0*0.0014605647517039924/80.0*xyz^80.0-x0^7.0*1.5/3.0*xyz^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^6.0*6.87316715542522E-5*xyz^33.0+x0^8.0/58197.33333333333*xyz^33.0+6.175889328063242E-5*xyz^24.0-x0^91.0/249773.3333333333*xyz^132.0-1.0/33.0*xyz^132.0-0.030303030303030304*xyz^132.0+x0^2.0*1.020408163265306E-4*xyz^50.0-x0^5.0*1.08010801080108E-4*xyz^101.0-x0^5.0*1.8257059396299905E-5*xyz^80.0-x0^7.0/2.0*xyz^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^6.0*54810.0*xyz^27.0+x0^8.0*13702.5*xyz^27.0+5985.0*xyz^18.0-x0^91.0*1.8873216E7*xyz^126.0+x0^2.0*1167480.0*xyz^44.0-x0^5.0*9.8558208E7*xyz^95.0-x0^5.0*3950100.0*xyz^74.0-x0^7.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^6.0*54810.0*27.0*xyz^26.0+x0^8.0*13702.5*27.0*xyz^26.0+5985.0*18.0*xyz^17.0-x0^91.0*1.8873216E7*126.0*xyz^125.0+x0^2.0*1167480.0*44.0*xyz^43.0-x0^5.0*9.8558208E7*95.0*xyz^94.0-x0^5.0*3950100.0*74.0*xyz^73.0-x0^7.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^6.0*1479870.0*xyz^26.0+x0^8.0*369967.5*xyz^26.0+107730.0*xyz^17.0-x0^91.0*2.378025216E9*xyz^125.0+x0^2.0*5.136912E7*xyz^43.0-x0^5.0*9.36302976E9*xyz^94.0-x0^5.0*2.923074E8*xyz^73.0-x0^7.0*0.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^6.0*6.87316715542522E-5*xyz^33.0-5.0*xyz^33.0+x0^8.0/58197.33333333333*xyz^33.0+6.175889328063242E-5*xyz^24.0-5.0*xyz^24.0-x0^91.0/249773.3333333333*xyz^132.0-1.0/33.0*xyz^132.0-0.030303030303030304*xyz^132.0+x0^2.0*1.020408163265306E-4*xyz^50.0-4.0*xyz^50.0-x0^5.0*1.08010801080108E-4*xyz^101.0-4.0*xyz^101.0-x0^5.0*1.8257059396299905E-5*xyz^80.0-5.0*xyz^80.0-x0^7.0/2.0*xyz^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^6.0*6.87316715542522E-5/34.0*xyz^34.0-5.0/34.0*xyz^34.0+x0^8.0/58197.33333333333/34.0*xyz^34.0+6.175889328063242E-5/25.0*xyz^25.0-5.0/25.0*xyz^25.0-x0^91.0/249773.3333333333/133.0*xyz^133.0-1.0/33.0/133.0*xyz^133.0-0.030303030303030304/133.0*xyz^133.0+x0^2.0*1.020408163265306E-4/51.0*xyz^51.0-4.0/51.0*xyz^51.0-x0^5.0*1.08010801080108E-4/102.0*xyz^102.0-4.0/102.0*xyz^102.0-x0^5.0*1.8257059396299905E-5/81.0*xyz^81.0-5.0/81.0*xyz^81.0-x0^7.0*2.0/4.0*xyz^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^6.0/494677.3333333333*xyz^34.0-1.0/6.8*xyz^34.0-0.14705882352941177*xyz^34.0+x0^8.0/1978709.3333333333*xyz^34.0+1.0/404799.99999999994*xyz^25.0-1.0/5.0*xyz^25.0-0.2*xyz^25.0-x0^91.0/3.3219853333333332E7*xyz^133.0-1.0/4389.0*xyz^133.0-2.2784233310549102E-4*xyz^133.0+x0^2.0/499800.00000000006*xyz^51.0-1.0/12.75*xyz^51.0-0.0784313725490196*xyz^51.0-x0^5.0/944350.0000000001*xyz^102.0-1.0/25.5*xyz^102.0-0.0392156862745098*xyz^102.0-x0^5.0/4436639.999999999*xyz^81.0-1.0/16.2*xyz^81.0-0.06172839506172839*xyz^81.0-x0^7.0/2.0*xyz^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131354() {
 UsageCalculus.TestCase = 131354;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xyza^2^7*--3*xyza^3^8/-4*xyza^1^9-3*xyza^3^8/-4*xyza^1^94*x0^91*xyza^2^10*-3*xyza^3*-4*xyza^1^2/-1*xyza^2^3-3*xyza^3*-4*xyza^1^2/-1*xyza^2^34*x0^2/-1*x0^31*xyza^2^3-3*xyza^3^4*4*xyza^1^5/1*xyza^2^6*--3*xyza^3^74*x0^5/1*x0^6*--3*x0^71*xyza^2^6*--3*xyza^3^7";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=353 EqnNumber=54 FamilyID=2 MotifTag=3 Entropy=1 FuncWrapAliasID=3"+
"// MetaRow=[12, 54, 10, 7, 4, 2, 3, 9, 2, 3, 4, 2, 3, 1, 1, 1, 2, 1, 1, 1, 1, 7, 3, 1, 2, 3, 11, 1, 1, 9, 2, 20]"+
"// DOEMatrixRow=[3, 54, 19, 3, 1, 2, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 36, 5, 1, 2, 3, 2, 3, 1, 4, 3, 1, 1, 6, 1]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "1.0/1.3333333333333333*xyza^30.0+1.0/1.3333333333333333*xyza^21.0-x0^91.0*9.0*xyza^129.0+x0^2.0*12.0*xyza^47.0-x0^5.0*324.0*xyza^116.0-x0^5.0*27.0*xyza^95.0-x0^71.0*9.0*xyza^18.0-3.0*xyza^10.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/1.3333333333333333*30.0*xyza^29.0+1.0/1.3333333333333333*21.0*xyza^20.0-x0^91.0*9.0*129.0*xyza^128.0+x0^2.0*12.0*47.0*xyza^46.0-x0^5.0*324.0*116.0*xyza^115.0-x0^5.0*27.0*95.0*xyza^94.0-x0^71.0*9.0*18.0*xyza^17.0-3.0*10.0*xyza^9.0";
 UsageCalculus.EqnSolArrayMap2[1] = "22.5*xyza^29.0+15.75*xyza^20.0-x0^91.0*1161.0*xyza^128.0+x0^2.0*564.0*xyza^46.0-x0^5.0*37584.0*xyza^115.0-x0^5.0*2565.0*xyza^94.0-x0^71.0*162.0*xyza^17.0-30.0*xyza^9.0";
 UsageCalculus.EqnSolArrayMap3[1] = "1.0/1.3333333333333333*xyza^30.0+1.0/1.3333333333333333*xyza^21.0-x0^91.0*9.0*xyza^129.0+x0^2.0*12.0*xyza^47.0-x0^5.0*324.0*xyza^116.0-x0^5.0*27.0*xyza^95.0-x0^71.0*9.0*xyza^18.0-3.0*xyza^10.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0/1.3333333333333333/31.0*xyza^31.0+1.0/1.3333333333333333/22.0*xyza^22.0-x0^91.0*9.0/130.0*xyza^130.0+x0^2.0*12.0/48.0*xyza^48.0-x0^5.0*324.0/117.0*xyza^117.0-x0^5.0*27.0/96.0*xyza^96.0-x0^71.0*9.0/19.0*xyza^19.0-3.0/11.0*xyza^11.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/41.33333333333333*xyza^31.0+0.034090909090909095*xyza^22.0-x0^91.0*0.06923076923076923*xyza^130.0+x0^2.0*0.25*xyza^48.0-x0^5.0*2.769230769230769*xyza^117.0-x0^5.0*0.28125*xyza^96.0-x0^71.0/2.111111111111111*xyza^19.0-1.0/3.6666666666666665*xyza^11.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "22.5*xyza^29.0+15.75*xyza^20.0-x0^91.0*1161.0*xyza^128.0+x0^2.0*564.0*xyza^46.0-x0^5.0*37584.0*xyza^115.0-x0^5.0*2565.0*xyza^94.0-x0^71.0*162.0*xyza^17.0-30.0*xyza^9.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "22.5*29.0*xyza^28.0+15.75*20.0*xyza^19.0-x0^91.0*1161.0*128.0*xyza^127.0+x0^2.0*564.0*46.0*xyza^45.0-x0^5.0*37584.0*115.0*xyza^114.0-x0^5.0*2565.0*94.0*xyza^93.0-x0^71.0*162.0*17.0*xyza^16.0-30.0*9.0*xyza^8.0";
 UsageCalculus.EqnSolArrayMap2[2] = "652.5*xyza^28.0+315.0*xyza^19.0-x0^91.0*148608.0*xyza^127.0+x0^2.0*25944.0*xyza^45.0-x0^5.0*4322160.0*xyza^114.0-x0^5.0*241110.0*xyza^93.0-x0^71.0*2754.0*xyza^16.0-270.0*xyza^8.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/41.33333333333333*xyza^31.0+0.034090909090909095*xyza^22.0-x0^91.0*0.06923076923076923*xyza^130.0+x0^2.0*0.25*xyza^48.0-x0^5.0*2.769230769230769*xyza^117.0-x0^5.0*0.28125*xyza^96.0-x0^71.0/2.111111111111111*xyza^19.0-1.0/3.6666666666666665*xyza^11.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/41.33333333333333/32.0*xyza^32.0+0.034090909090909095/23.0*xyza^23.0-x0^91.0*0.06923076923076923/131.0*xyza^131.0+x0^2.0*0.25/49.0*xyza^49.0-x0^5.0*2.769230769230769/118.0*xyza^118.0-x0^5.0*0.28125/97.0*xyza^97.0-x0^71.0/2.111111111111111/20.0*xyza^20.0-1.0/3.6666666666666665/12.0*xyza^12.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/1322.6666666666665*xyza^32.0+0.001482213438735178*xyza^23.0-x0^91.0*5.284791544333529E-4*xyza^131.0+x0^2.0*0.00510204081632653*xyza^49.0-x0^5.0*0.02346805736636245*xyza^118.0-x0^5.0*0.0028994845360824743*xyza^97.0-x0^71.0/42.22222222222222*xyza^20.0-1.0/44.0*xyza^12.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "652.5*xyza^28.0+315.0*xyza^19.0-x0^91.0*148608.0*xyza^127.0+x0^2.0*25944.0*xyza^45.0-x0^5.0*4322160.0*xyza^114.0-x0^5.0*241110.0*xyza^93.0-x0^71.0*2754.0*xyza^16.0-270.0*xyza^8.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "652.5*28.0*xyza^27.0+315.0*19.0*xyza^18.0-x0^91.0*148608.0*127.0*xyza^126.0+x0^2.0*25944.0*45.0*xyza^44.0-x0^5.0*4322160.0*114.0*xyza^113.0-x0^5.0*241110.0*93.0*xyza^92.0-x0^71.0*2754.0*16.0*xyza^15.0-270.0*8.0*xyza^7.0";
 UsageCalculus.EqnSolArrayMap2[3] = "18270.0*xyza^27.0+5985.0*xyza^18.0-x0^91.0*1.8873216E7*xyza^126.0+x0^2.0*1167480.0*xyza^44.0-x0^5.0*4.9272624E8*xyza^113.0-x0^5.0*2.242323E7*xyza^92.0-x0^71.0*44064.0*xyza^15.0-2160.0*xyza^7.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/1322.6666666666665*xyza^32.0+0.001482213438735178*xyza^23.0-x0^91.0*5.284791544333529E-4*xyza^131.0-4.0*xyza^131.0+x0^2.0*0.00510204081632653*xyza^49.0-x0^5.0*0.02346805736636245*xyza^118.0-x0^5.0*0.0028994845360824743*xyza^97.0-x0^71.0/42.22222222222222*xyza^20.0-1.0/44.0*xyza^12.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/1322.6666666666665/33.0*xyza^33.0+0.001482213438735178/24.0*xyza^24.0-x0^91.0*5.284791544333529E-4/132.0*xyza^132.0-4.0/132.0*xyza^132.0+x0^2.0*0.00510204081632653/50.0*xyza^50.0-x0^5.0*0.02346805736636245/119.0*xyza^119.0-x0^5.0*0.0028994845360824743/98.0*xyza^98.0-x0^71.0/42.22222222222222/21.0*xyza^21.0-1.0/44.0/13.0*xyza^13.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/43647.99999999999*xyza^33.0+6.175889328063242E-5*xyza^24.0-x0^91.0/249773.3333333333*xyza^132.0-1.0/33.0*xyza^132.0-0.030303030303030304*xyza^132.0+x0^2.0*1.020408163265306E-4*xyza^50.0-x0^5.0*1.9721056610388614E-4*xyza^119.0-x0^5.0*2.9586576898800758E-5*xyza^98.0-x0^71.0/886.6666666666666*xyza^21.0-1.0/572.0*xyza^13.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "18270.0*xyza^27.0+5985.0*xyza^18.0-x0^91.0*1.8873216E7*xyza^126.0+x0^2.0*1167480.0*xyza^44.0-x0^5.0*4.9272624E8*xyza^113.0-x0^5.0*2.242323E7*xyza^92.0-x0^71.0*44064.0*xyza^15.0-2160.0*xyza^7.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "18270.0*27.0*xyza^26.0+5985.0*18.0*xyza^17.0-x0^91.0*1.8873216E7*126.0*xyza^125.0+x0^2.0*1167480.0*44.0*xyza^43.0-x0^5.0*4.9272624E8*113.0*xyza^112.0-x0^5.0*2.242323E7*92.0*xyza^91.0-x0^71.0*44064.0*15.0*xyza^14.0-2160.0*7.0*xyza^6.0";
 UsageCalculus.EqnSolArrayMap2[4] = "493290.0*xyza^26.0+107730.0*xyza^17.0-x0^91.0*2.378025216E9*xyza^125.0+x0^2.0*5.136912E7*xyza^43.0-x0^5.0*5.567806512E10*xyza^112.0-x0^5.0*2.06293716E9*xyza^91.0-x0^71.0*660960.0*xyza^14.0-15120.0*xyza^6.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/43647.99999999999*xyza^33.0+6.175889328063242E-5*xyza^24.0-5.0*xyza^24.0-x0^91.0/249773.3333333333*xyza^132.0-1.0/33.0*xyza^132.0-0.030303030303030304*xyza^132.0+x0^2.0*1.020408163265306E-4*xyza^50.0-4.0*xyza^50.0-x0^5.0*1.9721056610388614E-4*xyza^119.0-4.0*xyza^119.0-x0^5.0*2.9586576898800758E-5*xyza^98.0-5.0*xyza^98.0-x0^71.0/886.6666666666666*xyza^21.0-1.0/572.0*xyza^13.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/43647.99999999999/34.0*xyza^34.0+6.175889328063242E-5/25.0*xyza^25.0-5.0/25.0*xyza^25.0-x0^91.0/249773.3333333333/133.0*xyza^133.0-1.0/33.0/133.0*xyza^133.0-0.030303030303030304/133.0*xyza^133.0+x0^2.0*1.020408163265306E-4/51.0*xyza^51.0-4.0/51.0*xyza^51.0-x0^5.0*1.9721056610388614E-4/120.0*xyza^120.0-4.0/120.0*xyza^120.0-x0^5.0*2.9586576898800758E-5/99.0*xyza^99.0-5.0/99.0*xyza^99.0-x0^71.0/886.6666666666666/22.0*xyza^22.0-1.0/572.0/14.0*xyza^14.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/1484031.9999999998*xyza^34.0+1.0/404799.99999999994*xyza^25.0-1.0/5.0*xyza^25.0-0.2*xyza^25.0-x0^91.0/3.3219853333333332E7*xyza^133.0-1.0/4389.0*xyza^133.0-2.2784233310549102E-4*xyza^133.0+x0^2.0/499800.00000000006*xyza^51.0-1.0/12.75*xyza^51.0-0.0784313725490196*xyza^51.0-x0^5.0/608486.6666666666*xyza^120.0-1.0/30.0*xyza^120.0-0.03333333333333333*xyza^120.0-x0^5.0/3346112.0*xyza^99.0-1.0/19.8*xyza^99.0-0.050505050505050504*xyza^99.0-x0^71.0/19506.666666666664*xyza^22.0-1.0/8008.0*xyza^14.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131355() {
 UsageCalculus.TestCase = 131355;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*x^3^8/-4*x^1^94*x0^91*x^2^10*-3*x^3*-4*x^1^2/-1*x^2^3-3*x^3*-4*x^1^2/-1*x^2^34*x0^2/-1*x0^31*x^2^3-3*x^3^4*4*x^1^5/1*x^2^6*--3*x^3^74*x0^5/1*x0^6*--3*x0^71*x^2^6*--3*x^3^7-3*x^3^7";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=354 EqnNumber=55 FamilyID=3 MotifTag=4 Entropy=3 FuncWrapAliasID=4"+
"// MetaRow=[12, 55, 10, 6, 1, 3, 1, 10, 3, 4, 1, 1, 1, 2, 3, 2, 3, 2, 3, 2, 3, 8, 1, 2, 3, 4, 12, 2, 3, 10, 3, 21]"+
"// DOEMatrixRow=[3, 55, 19, 2, 1, 3, 2, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 37, 6, 2, 3, 4, 3, 1, 2, 1, 1, 2, 3, 7, 2]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-9.0*x^129.0+12.0*x^47.0-324.0*x^116.0-27.0*x^95.0-9.0*x^18.0-3.0*x^10.0-3.0*x^10.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-9.0*129.0*x^128.0+12.0*47.0*x^46.0-324.0*116.0*x^115.0-27.0*95.0*x^94.0-9.0*18.0*x^17.0-3.0*10.0*x^9.0-3.0*10.0*x^9.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-1161.0*x^128.0+564.0*x^46.0-37584.0*x^115.0-2565.0*x^94.0-162.0*x^17.0-30.0*x^9.0-30.0*x^9.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-9.0*x^129.0+12.0*x^47.0-324.0*x^116.0-27.0*x^95.0-9.0*x^18.0-3.0*x^10.0-3.0*x^10.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-9.0/130.0*x^130.0+12.0/48.0*x^48.0-324.0/117.0*x^117.0-27.0/96.0*x^96.0-9.0/19.0*x^19.0-3.0/11.0*x^11.0-3.0/11.0*x^11.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/14.444444444444445*x^130.0+1.0/4.0*x^48.0-2.769230769230769*x^117.0-1.0/3.5555555555555554*x^96.0-1.0/2.111111111111111*x^19.0-1.0/3.6666666666666665*x^11.0-1.0/3.6666666666666665*x^11.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-1161.0*x^128.0+564.0*x^46.0-37584.0*x^115.0-2565.0*x^94.0-162.0*x^17.0-30.0*x^9.0-30.0*x^9.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-1161.0*128.0*x^127.0+564.0*46.0*x^45.0-37584.0*115.0*x^114.0-2565.0*94.0*x^93.0-162.0*17.0*x^16.0-30.0*9.0*x^8.0-30.0*9.0*x^8.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-148608.0*x^127.0+25944.0*x^45.0-4322160.0*x^114.0-241110.0*x^93.0-2754.0*x^16.0-270.0*x^8.0-270.0*x^8.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/14.444444444444445*x^130.0+1.0/4.0*x^48.0-2.769230769230769*x^117.0-1.0/3.5555555555555554*x^96.0-1.0/2.111111111111111*x^19.0-1.0/3.6666666666666665*x^11.0-1.0/3.6666666666666665*x^11.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/14.444444444444445/131.0*x^131.0+1.0/4.0/49.0*x^49.0-2.769230769230769/118.0*x^118.0-1.0/3.5555555555555554/97.0*x^97.0-1.0/2.111111111111111/20.0*x^20.0-1.0/3.6666666666666665/12.0*x^12.0-1.0/3.6666666666666665/12.0*x^12.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/1892.2222222222222*x^131.0+1.0/196.0*x^49.0-1.0/42.611111111111114*x^118.0-1.0/344.88888888888886*x^97.0-1.0/42.22222222222222*x^20.0-1.0/44.0*x^12.0-1.0/44.0*x^12.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-148608.0*x^127.0+25944.0*x^45.0-4322160.0*x^114.0-241110.0*x^93.0-2754.0*x^16.0-270.0*x^8.0-270.0*x^8.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-148608.0*127.0*x^126.0+25944.0*45.0*x^44.0-4322160.0*114.0*x^113.0-241110.0*93.0*x^92.0-2754.0*16.0*x^15.0-270.0*8.0*x^7.0-270.0*8.0*x^7.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-1.8873216E7*x^126.0+1167480.0*x^44.0-4.9272624E8*x^113.0-2.242323E7*x^92.0-44064.0*x^15.0-2160.0*x^7.0-2160.0*x^7.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/1892.2222222222222*x^131.0+1.0/196.0*x^49.0-1.0/42.611111111111114*x^118.0-1.0/344.88888888888886*x^97.0-1.0/42.22222222222222*x^20.0-1.0/44.0*x^12.0-1.0/44.0*x^12.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/1892.2222222222222/132.0*x^132.0+1.0/196.0/50.0*x^50.0-1.0/42.611111111111114/119.0*x^119.0-1.0/344.88888888888886/98.0*x^98.0-1.0/42.22222222222222/21.0*x^21.0-1.0/44.0/13.0*x^13.0-1.0/44.0/13.0*x^13.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/249773.3333333333*x^132.0+1.0/9800.0*x^50.0-1.0/5070.722222222223*x^119.0-1.0/33799.11111111111*x^98.0-1.0/886.6666666666666*x^21.0-1.0/572.0*x^13.0-1.0/572.0*x^13.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-1.8873216E7*x^126.0+1167480.0*x^44.0-4.9272624E8*x^113.0-2.242323E7*x^92.0-44064.0*x^15.0-2160.0*x^7.0-2160.0*x^7.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-126.0*x^125.0+1167480.0*44.0*x^43.0-113.0*x^112.0-92.0*x^91.0-44064.0*15.0*x^14.0-2160.0*7.0*x^6.0-2160.0*7.0*x^6.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-126.0*x^125.0+5.136912E7*x^43.0-113.0*x^112.0-92.0*x^91.0-660960.0*x^14.0-15120.0*x^6.0-15120.0*x^6.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/249773.3333333333*x^132.0+1.0/9800.0*x^50.0-1.0/5070.722222222223*x^119.0-1.0/33799.11111111111*x^98.0-1.0/886.6666666666666*x^21.0-1.0/572.0*x^13.0-1.0/572.0*x^13.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/249773.3333333333/133.0*x^133.0+1.0/9800.0/51.0*x^51.0-1.0/5070.722222222223/120.0*x^120.0-1.0/33799.11111111111/99.0*x^99.0-1.0/886.6666666666666/22.0*x^22.0-1.0/572.0/14.0*x^14.0-1.0/572.0/14.0*x^14.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/3.3219853333333332E7*x^133.0+1.0/499800.0*x^51.0-1.0/608486.6666666667*x^120.0-1.0/3346112.0*x^99.0-1.0/19506.666666666664*x^22.0-1.0/8008.0*x^14.0-1.0/8008.0*x^14.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131356() {
 UsageCalculus.TestCase = 131356;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "4*x0^91*xy^2^10*-3*xy^3*-4*xy^1^2/-1*xy^2^3-3*xy^3*-4*xy^1^2/-1*xy^2^34*x0^2/-1*x0^31*xy^2^3-3*xy^3^4*4*xy^1^5/1*xy^2^6*--3*xy^3^74*x0^5/1*x0^6*--3*x0^71*xy^2^6*--3*xy^3^7-3*xy^3^74*x0^8*+1*x0^9*-3*x0^10*-4*x0";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=355 EqnNumber=56 FamilyID=1 MotifTag=1 Entropy=4 FuncWrapAliasID=1"+
"// MetaRow=[12, 56, 10, 5, 2, 1, 2, 1, 1, 1, 2, 1, 2, 3, 4, 3, 1, 1, 4, 3, 4, 9, 2, 3, 1, 1, 13, 3, 4, 11, 4, 22]"+
"// DOEMatrixRow=[3, 56, 19, 1, 3, 1, 3, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 38, 7, 3, 1, 5, 1, 2, 3, 2, 3, 1, 4, 8, 1]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^91.0*48.0*xy^23.0+x0^2.0*12.0*xy^47.0-x0^5.0*324.0*xy^116.0-x0^5.0*27.0*xy^95.0-x0^71.0*9.0*xy^18.0-3.0*xy^10.0-x0^8.0*x0*36.0*xy^77.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^91.0*48.0*23.0*xy^22.0+x0^2.0*12.0*47.0*xy^46.0-x0^5.0*324.0*116.0*xy^115.0-x0^5.0*27.0*95.0*xy^94.0-x0^71.0*9.0*18.0*xy^17.0-3.0*10.0*xy^9.0-x0^8.0*x0*77.0*xy^76.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^91.0*1104.0*xy^22.0+x0^2.0*564.0*xy^46.0-x0^5.0*37584.0*xy^115.0-x0^5.0*2565.0*xy^94.0-x0^71.0*162.0*xy^17.0-30.0*xy^9.0-x0^8.0*x0*77.0*xy^76.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^91.0*48.0*xy^23.0+x0^2.0*12.0*xy^47.0-x0^5.0*324.0*xy^116.0-x0^5.0*27.0*xy^95.0-x0^71.0*9.0*xy^18.0-3.0*xy^10.0-x0^8.0*x0*36.0*xy^77.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^91.0*48.0/24.0*xy^24.0+x0^2.0*12.0/48.0*xy^48.0-x0^5.0*324.0/117.0*xy^117.0-x0^5.0*27.0/96.0*xy^96.0-x0^71.0*9.0/19.0*xy^19.0-3.0/11.0*xy^11.0-x0^8.0*x0*36.0/78.0*xy^78.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^91.0*2.0*xy^24.0+x0^2.0*0.25*xy^48.0-x0^5.0*2.769230769230769*xy^117.0-x0^5.0*0.28125*xy^96.0-x0^71.0/2.111111111111111*xy^19.0-0.2727272727272727*xy^11.0-x0^8.0*x0/2.1666666666666665*xy^78.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^91.0*1104.0*xy^22.0+x0^2.0*564.0*xy^46.0-x0^5.0*37584.0*xy^115.0-x0^5.0*2565.0*xy^94.0-x0^71.0*162.0*xy^17.0-30.0*xy^9.0-x0^8.0*x0*77.0*xy^76.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^91.0*1104.0*22.0*xy^21.0+x0^2.0*564.0*46.0*xy^45.0-x0^5.0*37584.0*115.0*xy^114.0-x0^5.0*2565.0*94.0*xy^93.0-x0^71.0*162.0*17.0*xy^16.0-30.0*9.0*xy^8.0-x0^8.0*x0*76.0*xy^75.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^91.0*24288.0*xy^21.0+x0^2.0*25944.0*xy^45.0-x0^5.0*4322160.0*xy^114.0-x0^5.0*241110.0*xy^93.0-x0^71.0*2754.0*xy^16.0-270.0*xy^8.0-x0^8.0*x0*76.0*xy^75.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^91.0*2.0*xy^24.0+x0^2.0*0.25*xy^48.0-x0^5.0*2.769230769230769*xy^117.0-x0^5.0*0.28125*xy^96.0-x0^71.0/2.111111111111111*xy^19.0-0.2727272727272727*xy^11.0-x0^8.0*x0/2.1666666666666665*xy^78.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^91.0*2.0/25.0*xy^25.0+x0^2.0*0.25/49.0*xy^49.0-x0^5.0*2.769230769230769/118.0*xy^118.0-x0^5.0*0.28125/97.0*xy^97.0-x0^71.0/2.111111111111111/20.0*xy^20.0-0.2727272727272727/12.0*xy^12.0-x0^8.0*x0/2.1666666666666665/79.0*xy^79.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^91.0*0.08*xy^25.0+x0^2.0*0.00510204081632653*xy^49.0-x0^5.0*0.02346805736636245*xy^118.0-x0^5.0*0.0028994845360824743*xy^97.0-x0^71.0/42.22222222222222*xy^20.0-0.022727272727272724*xy^12.0-x0^8.0*x0/171.16666666666666*xy^79.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^91.0*24288.0*xy^21.0+x0^2.0*25944.0*xy^45.0-x0^5.0*4322160.0*xy^114.0-x0^5.0*241110.0*xy^93.0-x0^71.0*2754.0*xy^16.0-270.0*xy^8.0-x0^8.0*x0*76.0*xy^75.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^91.0*24288.0*21.0*xy^20.0+x0^2.0*25944.0*45.0*xy^44.0-x0^5.0*4322160.0*114.0*xy^113.0-x0^5.0*241110.0*93.0*xy^92.0-x0^71.0*2754.0*16.0*xy^15.0-270.0*8.0*xy^7.0-x0^8.0*x0*75.0*xy^74.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^91.0*510048.0*xy^20.0+x0^2.0*1167480.0*xy^44.0-x0^5.0*4.9272624E8*xy^113.0-x0^5.0*2.242323E7*xy^92.0-x0^71.0*44064.0*xy^15.0-2160.0*xy^7.0-x0^8.0*x0*75.0*xy^74.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^91.0*0.08*xy^25.0+x0^2.0*0.00510204081632653*xy^49.0-x0^5.0*0.02346805736636245*xy^118.0-x0^5.0*0.0028994845360824743*xy^97.0-x0^71.0/42.22222222222222*xy^20.0-0.022727272727272724*xy^12.0-x0^8.0*x0/171.16666666666666*xy^79.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^91.0*0.08/26.0*xy^26.0+x0^2.0*0.00510204081632653/50.0*xy^50.0-x0^5.0*0.02346805736636245/119.0*xy^119.0-x0^5.0*0.0028994845360824743/98.0*xy^98.0-x0^71.0/42.22222222222222/21.0*xy^21.0-0.022727272727272724/13.0*xy^13.0-x0^8.0*x0/171.16666666666666/80.0*xy^80.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^91.0*0.003076923076923077*xy^26.0+x0^2.0*1.020408163265306E-4*xy^50.0-x0^5.0*1.9721056610388614E-4*xy^119.0-x0^5.0*2.9586576898800758E-5*xy^98.0-x0^71.0/886.6666666666666*xy^21.0-0.001748251748251748*xy^13.0-x0^8.0*x0/13693.333333333332*xy^80.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^91.0*510048.0*xy^20.0+x0^2.0*1167480.0*xy^44.0-x0^5.0*4.9272624E8*xy^113.0-x0^5.0*2.242323E7*xy^92.0-x0^71.0*44064.0*xy^15.0-2160.0*xy^7.0-x0^8.0*x0*75.0*xy^74.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^91.0*510048.0*20.0*xy^19.0+x0^2.0*1167480.0*44.0*xy^43.0-x0^5.0*4.9272624E8*113.0*xy^112.0-x0^5.0*2.242323E7*92.0*xy^91.0-x0^71.0*44064.0*15.0*xy^14.0-2160.0*7.0*xy^6.0-x0^8.0*x0*74.0*xy^73.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^91.0*1.020096E7*xy^19.0+x0^2.0*5.136912E7*xy^43.0-x0^5.0*5.567806512E10*xy^112.0-x0^5.0*2.06293716E9*xy^91.0-x0^71.0*660960.0*xy^14.0-15120.0*xy^6.0-x0^8.0*x0*74.0*xy^73.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^91.0*0.003076923076923077*xy^26.0+x0^2.0*1.020408163265306E-4*xy^50.0-4.0*xy^50.0-x0^5.0*1.9721056610388614E-4*xy^119.0-4.0*xy^119.0-x0^5.0*2.9586576898800758E-5*xy^98.0-5.0*xy^98.0-x0^71.0/886.6666666666666*xy^21.0-0.001748251748251748*xy^13.0-x0^8.0*x0/13693.333333333332*xy^80.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^91.0*0.003076923076923077/27.0*xy^27.0+x0^2.0*1.020408163265306E-4/51.0*xy^51.0-4.0/51.0*xy^51.0-x0^5.0*1.9721056610388614E-4/120.0*xy^120.0-4.0/120.0*xy^120.0-x0^5.0*2.9586576898800758E-5/99.0*xy^99.0-5.0/99.0*xy^99.0-x0^71.0/886.6666666666666/22.0*xy^22.0-0.001748251748251748/14.0*xy^14.0-x0^8.0*x0/13693.333333333332/81.0*xy^81.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^91.0*1.1396011396011396E-4*xy^27.0+x0^2.0/499800.00000000006*xy^51.0-1.0/12.75*xy^51.0-0.0784313725490196*xy^51.0-x0^5.0/608486.6666666666*xy^120.0-1.0/30.0*xy^120.0-0.03333333333333333*xy^120.0-x0^5.0/3346112.0*xy^99.0-1.0/19.8*xy^99.0-0.050505050505050504*xy^99.0-x0^71.0/19506.666666666664*xy^22.0-1.2487512487512485E-4*xy^14.0-x0^8.0*x0/1109160.0*xy^81.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131357() {
 UsageCalculus.TestCase = 131357;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xyz^2^10*-3*xyz^3*-4*xyz^1^2/-1*xyz^2^3-3*xyz^3*-4*xyz^1^2/-1*xyz^2^34*x0^2/-1*x0^31*xyz^2^3-3*xyz^3^4*4*xyz^1^5/1*xyz^2^6*--3*xyz^3^74*x0^5/1*x0^6*--3*x0^71*xyz^2^6*--3*xyz^3^7-3*xyz^3^74*x0^8*+1*x0^9*-3*x0^10*-4*x01*xyz^2^9*-3*xyz^3^10*-4*xyz^1";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=356 EqnNumber=57 FamilyID=2 MotifTag=3 Entropy=1 FuncWrapAliasID=3"+
"// MetaRow=[12, 57, 10, 4, 3, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 1, 2, 1, 5, 1, 1, 10, 3, 1, 2, 3, 14, 1, 1, 12, 1, 23]"+
"// DOEMatrixRow=[3, 57, 19, 4, 2, 3, 1, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 39, 8, 1, 2, 1, 2, 3, 4, 3, 1, 2, 1, 9, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-12.0*xyz^23.0+x0^2.0*12.0*xyz^47.0-x0^5.0*324.0*xyz^116.0-x0^5.0*27.0*xyz^95.0-x0^71.0*9.0*xyz^18.0-3.0*xyz^10.0-x0^8.0*x01*432.0*xyz^102.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-12.0*23.0*xyz^22.0+x0^2.0*12.0*47.0*xyz^46.0-x0^5.0*324.0*116.0*xyz^115.0-x0^5.0*27.0*95.0*xyz^94.0-x0^71.0*9.0*18.0*xyz^17.0-3.0*10.0*xyz^9.0-x0^8.0*x01*102.0*xyz^101.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-276.0*xyz^22.0+x0^2.0*564.0*xyz^46.0-x0^5.0*37584.0*xyz^115.0-x0^5.0*2565.0*xyz^94.0-x0^71.0*162.0*xyz^17.0-30.0*xyz^9.0-x0^8.0*x01*102.0*xyz^101.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-12.0*xyz^23.0+x0^2.0*12.0*xyz^47.0-x0^5.0*324.0*xyz^116.0-x0^5.0*27.0*xyz^95.0-x0^71.0*9.0*xyz^18.0-3.0*xyz^10.0-x0^8.0*x01*432.0*xyz^102.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-12.0/24.0*xyz^24.0+x0^2.0*12.0/48.0*xyz^48.0-x0^5.0*324.0/117.0*xyz^117.0-x0^5.0*27.0/96.0*xyz^96.0-x0^71.0*9.0/19.0*xyz^19.0-3.0/11.0*xyz^11.0-x0^8.0*x01*432.0/103.0*xyz^103.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-0.5*xyz^24.0+x0^2.0*0.25*xyz^48.0-x0^5.0*2.769230769230769*xyz^117.0-x0^5.0*0.28125*xyz^96.0-x0^71.0/2.111111111111111*xyz^19.0-0.2727272727272727*xyz^11.0-x0^8.0*x01*4.194174757281553*xyz^103.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-276.0*xyz^22.0+x0^2.0*564.0*xyz^46.0-x0^5.0*37584.0*xyz^115.0-x0^5.0*2565.0*xyz^94.0-x0^71.0*162.0*xyz^17.0-30.0*xyz^9.0-x0^8.0*x01*102.0*xyz^101.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-276.0*22.0*xyz^21.0+x0^2.0*564.0*46.0*xyz^45.0-x0^5.0*37584.0*115.0*xyz^114.0-x0^5.0*2565.0*94.0*xyz^93.0-x0^71.0*162.0*17.0*xyz^16.0-30.0*9.0*xyz^8.0-x0^8.0*x01*101.0*xyz^100.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-6072.0*xyz^21.0+x0^2.0*25944.0*xyz^45.0-x0^5.0*4322160.0*xyz^114.0-x0^5.0*241110.0*xyz^93.0-x0^71.0*2754.0*xyz^16.0-270.0*xyz^8.0-x0^8.0*x01*101.0*xyz^100.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-0.5*xyz^24.0+x0^2.0*0.25*xyz^48.0-x0^5.0*2.769230769230769*xyz^117.0-x0^5.0*0.28125*xyz^96.0-x0^71.0/2.111111111111111*xyz^19.0-0.2727272727272727*xyz^11.0-x0^8.0*x01*4.194174757281553*xyz^103.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-0.5/25.0*xyz^25.0+x0^2.0*0.25/49.0*xyz^49.0-x0^5.0*2.769230769230769/118.0*xyz^118.0-x0^5.0*0.28125/97.0*xyz^97.0-x0^71.0/2.111111111111111/20.0*xyz^20.0-0.2727272727272727/12.0*xyz^12.0-x0^8.0*x01*4.194174757281553/104.0*xyz^104.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-0.02*xyz^25.0+x0^2.0*0.00510204081632653*xyz^49.0-x0^5.0*0.02346805736636245*xyz^118.0-x0^5.0*0.0028994845360824743*xyz^97.0-x0^71.0/42.22222222222222*xyz^20.0-0.022727272727272724*xyz^12.0-x0^8.0*x01/24.796296296296298*xyz^104.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-6072.0*xyz^21.0+x0^2.0*25944.0*xyz^45.0-x0^5.0*4322160.0*xyz^114.0-x0^5.0*241110.0*xyz^93.0-x0^71.0*2754.0*xyz^16.0-270.0*xyz^8.0-x0^8.0*x01*101.0*xyz^100.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-6072.0*21.0*xyz^20.0+x0^2.0*25944.0*45.0*xyz^44.0-x0^5.0*4322160.0*114.0*xyz^113.0-x0^5.0*241110.0*93.0*xyz^92.0-x0^71.0*2754.0*16.0*xyz^15.0-270.0*8.0*xyz^7.0-x0^8.0*x01*100.0*xyz^99.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-127512.0*xyz^20.0+x0^2.0*1167480.0*xyz^44.0-x0^5.0*4.9272624E8*xyz^113.0-x0^5.0*2.242323E7*xyz^92.0-x0^71.0*44064.0*xyz^15.0-2160.0*xyz^7.0-x0^8.0*x01*100.0*xyz^99.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-0.02*xyz^25.0+x0^2.0*0.00510204081632653*xyz^49.0-x0^5.0*0.02346805736636245*xyz^118.0-x0^5.0*0.0028994845360824743*xyz^97.0-x0^71.0/42.22222222222222*xyz^20.0-0.022727272727272724*xyz^12.0-x0^8.0*x01/24.796296296296298*xyz^104.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-0.02/26.0*xyz^26.0+x0^2.0*0.00510204081632653/50.0*xyz^50.0-x0^5.0*0.02346805736636245/119.0*xyz^119.0-x0^5.0*0.0028994845360824743/98.0*xyz^98.0-x0^71.0/42.22222222222222/21.0*xyz^21.0-0.022727272727272724/13.0*xyz^13.0-x0^8.0*x01/24.796296296296298/105.0*xyz^105.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-7.692307692307692E-4*xyz^26.0+x0^2.0*1.020408163265306E-4*xyz^50.0-x0^5.0*1.9721056610388614E-4*xyz^119.0-x0^5.0*2.9586576898800758E-5*xyz^98.0-x0^71.0/886.6666666666666*xyz^21.0-0.001748251748251748*xyz^13.0-x0^8.0*x01/2603.6111111111113*xyz^105.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-127512.0*xyz^20.0+x0^2.0*1167480.0*xyz^44.0-x0^5.0*4.9272624E8*xyz^113.0-x0^5.0*2.242323E7*xyz^92.0-x0^71.0*44064.0*xyz^15.0-2160.0*xyz^7.0-x0^8.0*x01*100.0*xyz^99.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-127512.0*20.0*xyz^19.0+x0^2.0*1167480.0*44.0*xyz^43.0-x0^5.0*4.9272624E8*113.0*xyz^112.0-x0^5.0*2.242323E7*92.0*xyz^91.0-x0^71.0*44064.0*15.0*xyz^14.0-2160.0*7.0*xyz^6.0-x0^8.0*x01*99.0*xyz^98.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-2550240.0*xyz^19.0+x0^2.0*5.136912E7*xyz^43.0-x0^5.0*5.567806512E10*xyz^112.0-x0^5.0*2.06293716E9*xyz^91.0-x0^71.0*660960.0*xyz^14.0-15120.0*xyz^6.0-x0^8.0*x01*99.0*xyz^98.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-7.692307692307692E-4*xyz^26.0-4.0*xyz^26.0+x0^2.0*1.020408163265306E-4*xyz^50.0-4.0*xyz^50.0-x0^5.0*1.9721056610388614E-4*xyz^119.0-4.0*xyz^119.0-x0^5.0*2.9586576898800758E-5*xyz^98.0-5.0*xyz^98.0-x0^71.0/886.6666666666666*xyz^21.0-0.001748251748251748*xyz^13.0-x0^8.0*x01/2603.6111111111113*xyz^105.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-7.692307692307692E-4/27.0*xyz^27.0-4.0/27.0*xyz^27.0+x0^2.0*1.020408163265306E-4/51.0*xyz^51.0-4.0/51.0*xyz^51.0-x0^5.0*1.9721056610388614E-4/120.0*xyz^120.0-4.0/120.0*xyz^120.0-x0^5.0*2.9586576898800758E-5/99.0*xyz^99.0-5.0/99.0*xyz^99.0-x0^71.0/886.6666666666666/22.0*xyz^22.0-0.001748251748251748/14.0*xyz^14.0-x0^8.0*x01/2603.6111111111113/106.0*xyz^106.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/35100.0*xyz^27.0-1.0/6.75*xyz^27.0-0.14814814814814814*xyz^27.0+x0^2.0/499800.00000000006*xyz^51.0-1.0/12.75*xyz^51.0-0.0784313725490196*xyz^51.0-x0^5.0/608486.6666666666*xyz^120.0-1.0/30.0*xyz^120.0-0.03333333333333333*xyz^120.0-x0^5.0/3346112.0*xyz^99.0-1.0/19.8*xyz^99.0-0.050505050505050504*xyz^99.0-x0^71.0/19506.666666666664*xyz^22.0-1.2487512487512485E-4*xyz^14.0-x0^8.0*x01/275982.7777777778*xyz^106.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131358() {
 UsageCalculus.TestCase = 131358;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xyza^3*-4*xyza^1^2/-1*xyza^2^34*x0^2/-1*x0^31*xyza^2^3-3*xyza^3^4*4*xyza^1^5/1*xyza^2^6*--3*xyza^3^74*x0^5/1*x0^6*--3*x0^71*xyza^2^6*--3*xyza^3^7-3*xyza^3^74*x0^8*+1*x0^9*-3*x0^10*-4*x01*xyza^2^9*-3*xyza^3^10*-4*xyza^1-3*xyza^3^10*-4*xyza^1";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=357 EqnNumber=58 FamilyID=3 MotifTag=4 Entropy=3 FuncWrapAliasID=4"+
"// MetaRow=[12, 58, 10, 3, 4, 3, 1, 3, 1, 3, 4, 1, 1, 2, 3, 2, 3, 2, 1, 2, 3, 11, 1, 2, 3, 4, 15, 2, 3, 13, 2, 24]"+
"// DOEMatrixRow=[3, 58, 19, 3, 1, 1, 2, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 40, 9, 2, 3, 2, 3, 1, 5, 4, 2, 3, 2, 10, 1]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0*12.0*xyza^47.0-x0^5.0*324.0*xyza^116.0-x0^5.0*27.0*xyza^95.0-x0^71.0*9.0*xyza^18.0-3.0*xyza^10.0-x0^8.0*x01*432.0*xyza^102.0+12.0*xyza^14.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0*12.0*47.0*xyza^46.0-x0^5.0*324.0*116.0*xyza^115.0-x0^5.0*27.0*95.0*xyza^94.0-x0^71.0*9.0*18.0*xyza^17.0-3.0*10.0*xyza^9.0-x0^8.0*x01*432.0*102.0*xyza^101.0+12.0*14.0*xyza^13.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*564.0*xyza^46.0-x0^5.0*37584.0*xyza^115.0-x0^5.0*2565.0*xyza^94.0-x0^71.0*162.0*xyza^17.0-30.0*xyza^9.0-x0^8.0*x01*44064.0*xyza^101.0+168.0*xyza^13.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0*12.0*xyza^47.0-x0^5.0*324.0*xyza^116.0-x0^5.0*27.0*xyza^95.0-x0^71.0*9.0*xyza^18.0-3.0*xyza^10.0-x0^8.0*x01*432.0*xyza^102.0+12.0*xyza^14.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0*12.0/48.0*xyza^48.0-x0^5.0*324.0/117.0*xyza^117.0-x0^5.0*27.0/96.0*xyza^96.0-x0^71.0*9.0/19.0*xyza^19.0-3.0/11.0*xyza^11.0-x0^8.0*x01*432.0/103.0*xyza^103.0+12.0/15.0*xyza^15.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0*0.25*xyza^48.0-x0^5.0*2.769230769230769*xyza^117.0-x0^5.0*0.28125*xyza^96.0-x0^71.0/2.111111111111111*xyza^19.0-0.2727272727272727*xyza^11.0-x0^8.0*x01*4.194174757281553*xyza^103.0+1.0/1.25*xyza^15.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*564.0*xyza^46.0-x0^5.0*37584.0*xyza^115.0-x0^5.0*2565.0*xyza^94.0-x0^71.0*162.0*xyza^17.0-30.0*xyza^9.0-x0^8.0*x01*44064.0*xyza^101.0+168.0*xyza^13.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*564.0*46.0*xyza^45.0-x0^5.0*37584.0*115.0*xyza^114.0-x0^5.0*2565.0*94.0*xyza^93.0-x0^71.0*162.0*17.0*xyza^16.0-30.0*9.0*xyza^8.0-x0^8.0*x01*44064.0*101.0*xyza^100.0+168.0*13.0*xyza^12.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*25944.0*xyza^45.0-x0^5.0*4322160.0*xyza^114.0-x0^5.0*241110.0*xyza^93.0-x0^71.0*2754.0*xyza^16.0-270.0*xyza^8.0-x0^8.0*x01*4450464.0*xyza^100.0+2184.0*xyza^12.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0*0.25*xyza^48.0-x0^5.0*2.769230769230769*xyza^117.0-x0^5.0*0.28125*xyza^96.0-x0^71.0/2.111111111111111*xyza^19.0-0.2727272727272727*xyza^11.0-x0^8.0*x01*4.194174757281553*xyza^103.0+1.0/1.25*xyza^15.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0*0.25/49.0*xyza^49.0-x0^5.0*2.769230769230769/118.0*xyza^118.0-x0^5.0*0.28125/97.0*xyza^97.0-x0^71.0/2.111111111111111/20.0*xyza^20.0-0.2727272727272727/12.0*xyza^12.0-x0^8.0*x01*4.194174757281553/104.0*xyza^104.0+1.0/1.25/16.0*xyza^16.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0*0.00510204081632653*xyza^49.0-x0^5.0*0.02346805736636245*xyza^118.0-x0^5.0*0.0028994845360824743*xyza^97.0-x0^71.0/42.22222222222222*xyza^20.0-0.022727272727272724*xyza^12.0-x0^8.0*x01/24.796296296296298*xyza^104.0+1.0/20.0*xyza^16.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*25944.0*xyza^45.0-x0^5.0*4322160.0*xyza^114.0-x0^5.0*241110.0*xyza^93.0-x0^71.0*2754.0*xyza^16.0-270.0*xyza^8.0-x0^8.0*x01*4450464.0*xyza^100.0+2184.0*xyza^12.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*25944.0*45.0*xyza^44.0-x0^5.0*4322160.0*114.0*xyza^113.0-x0^5.0*241110.0*93.0*xyza^92.0-x0^71.0*2754.0*16.0*xyza^15.0-270.0*8.0*xyza^7.0-x0^8.0*x01*4450464.0*100.0*xyza^99.0+2184.0*12.0*xyza^11.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*1167480.0*xyza^44.0-x0^5.0*4.9272624E8*xyza^113.0-x0^5.0*2.242323E7*xyza^92.0-x0^71.0*44064.0*xyza^15.0-2160.0*xyza^7.0-x0^8.0*x01*4.450464E8*xyza^99.0+26208.0*xyza^11.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0*0.00510204081632653*xyza^49.0-x0^5.0*0.02346805736636245*xyza^118.0-x0^5.0*0.0028994845360824743*xyza^97.0-x0^71.0/42.22222222222222*xyza^20.0-0.022727272727272724*xyza^12.0-x0^8.0*x01/24.796296296296298*xyza^104.0+1.0/20.0*xyza^16.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0*0.00510204081632653/50.0*xyza^50.0-x0^5.0*0.02346805736636245/119.0*xyza^119.0-x0^5.0*0.0028994845360824743/98.0*xyza^98.0-x0^71.0/42.22222222222222/21.0*xyza^21.0-0.022727272727272724/13.0*xyza^13.0-x0^8.0*x01/24.796296296296298/105.0*xyza^105.0+1.0/20.0/17.0*xyza^17.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0*1.020408163265306E-4*xyza^50.0-x0^5.0*1.9721056610388614E-4*xyza^119.0-x0^5.0*2.9586576898800758E-5*xyza^98.0-x0^71.0/886.6666666666666*xyza^21.0-0.001748251748251748*xyza^13.0-x0^8.0*x01/2603.6111111111113*xyza^105.0+1.0/340.0*xyza^17.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*1167480.0*xyza^44.0-x0^5.0*4.9272624E8*xyza^113.0-x0^5.0*2.242323E7*xyza^92.0-x0^71.0*44064.0*xyza^15.0-2160.0*xyza^7.0-x0^8.0*x01*4.450464E8*xyza^99.0+26208.0*xyza^11.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*1167480.0*44.0*xyza^43.0-x0^5.0*4.9272624E8*113.0*xyza^112.0-x0^5.0*2.242323E7*92.0*xyza^91.0-x0^71.0*44064.0*15.0*xyza^14.0-2160.0*7.0*xyza^6.0-x0^8.0*x01*4.450464E8*99.0*xyza^98.0+26208.0*11.0*xyza^10.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*5.136912E7*xyza^43.0-x0^5.0*5.567806512E10*xyza^112.0-x0^5.0*2.06293716E9*xyza^91.0-x0^71.0*660960.0*xyza^14.0-15120.0*xyza^6.0-x0^8.0*x01*4.40595936E10*xyza^98.0+288288.0*xyza^10.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0*1.020408163265306E-4*xyza^50.0-4.0*xyza^50.0-x0^5.0*1.9721056610388614E-4*xyza^119.0-4.0*xyza^119.0-x0^5.0*2.9586576898800758E-5*xyza^98.0-5.0*xyza^98.0-x0^71.0/886.6666666666666*xyza^21.0-0.001748251748251748*xyza^13.0-x0^8.0*x01/2603.6111111111113*xyza^105.0+1.0/340.0*xyza^17.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0*1.020408163265306E-4/51.0*xyza^51.0-4.0/51.0*xyza^51.0-x0^5.0*1.9721056610388614E-4/120.0*xyza^120.0-4.0/120.0*xyza^120.0-x0^5.0*2.9586576898800758E-5/99.0*xyza^99.0-5.0/99.0*xyza^99.0-x0^71.0/886.6666666666666/22.0*xyza^22.0-0.001748251748251748/14.0*xyza^14.0-x0^8.0*x01/2603.6111111111113/106.0*xyza^106.0+1.0/340.0/18.0*xyza^18.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0/499800.00000000006*xyza^51.0-1.0/12.75*xyza^51.0-0.0784313725490196*xyza^51.0-x0^5.0/608486.6666666666*xyza^120.0-1.0/30.0*xyza^120.0-0.03333333333333333*xyza^120.0-x0^5.0/3346112.0*xyza^99.0-1.0/19.8*xyza^99.0-0.050505050505050504*xyza^99.0-x0^71.0/19506.666666666664*xyza^22.0-1.2487512487512485E-4*xyza^14.0-x0^8.0*x01/275982.7777777778*xyza^106.0+1.0/6120.0*xyza^18.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131359() {
 UsageCalculus.TestCase = 131359;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "4*x0^2/-1*x0^31*x^2^3-3*x^3^4*4*x^1^5/1*x^2^6*--3*x^3^74*x0^5/1*x0^6*--3*x0^71*x^2^6*--3*x^3^7-3*x^3^74*x0^8*+1*x0^9*-3*x0^10*-4*x01*x^2^9*-3*x^3^10*-4*x^1-3*x^3^10*-4*x^14*x0";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=358 EqnNumber=59 FamilyID=1 MotifTag=1 Entropy=4 FuncWrapAliasID=1"+
"// MetaRow=[12, 59, 10, 2, 1, 1, 2, 4, 2, 4, 1, 2, 3, 1, 4, 3, 1, 1, 2, 3, 4, 12, 2, 3, 1, 1, 16, 3, 4, 14, 3, 25]"+
"// DOEMatrixRow=[3, 59, 19, 2, 1, 2, 3, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 41, 10, 3, 1, 3, 1, 2, 6, 1, 3, 1, 3, 11, 2]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-4.0*x^5.0-324.0*x^116.0-27.0*x^95.0-9.0*x^18.0-3.0*x^10.0-432.0*x^102.0+12.0*x^27.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-4.0*5.0*x^4.0-324.0*116.0*x^115.0-27.0*95.0*x^94.0-9.0*18.0*x^17.0-3.0*10.0*x^9.0-432.0*102.0*x^101.0+12.0*27.0*x^26.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-20.0*x^4.0-37584.0*x^115.0-2565.0*x^94.0-162.0*x^17.0-30.0*x^9.0-44064.0*x^101.0+324.0*x^26.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-4.0*x^5.0-324.0*x^116.0-27.0*x^95.0-9.0*x^18.0-3.0*x^10.0-432.0*x^102.0+12.0*x^27.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-4.0/6.0*x^6.0-324.0/117.0*x^117.0-27.0/96.0*x^96.0-9.0/19.0*x^19.0-3.0/11.0*x^11.0-432.0/103.0*x^103.0+12.0/28.0*x^28.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/1.5*x^6.0-2.769230769230769*x^117.0-1.0/3.5555555555555554*x^96.0-1.0/2.111111111111111*x^19.0-1.0/3.6666666666666665*x^11.0-4.194174757281553*x^103.0+1.0/2.3333333333333335*x^28.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-20.0*x^4.0-37584.0*x^115.0-2565.0*x^94.0-162.0*x^17.0-30.0*x^9.0-44064.0*x^101.0+324.0*x^26.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-20.0*4.0*x^3.0-37584.0*115.0*x^114.0-2565.0*94.0*x^93.0-162.0*17.0*x^16.0-30.0*9.0*x^8.0-44064.0*101.0*x^100.0+324.0*26.0*x^25.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-80.0*x^3.0-4322160.0*x^114.0-241110.0*x^93.0-2754.0*x^16.0-270.0*x^8.0-4450464.0*x^100.0+8424.0*x^25.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/1.5*x^6.0-2.769230769230769*x^117.0-1.0/3.5555555555555554*x^96.0-1.0/2.111111111111111*x^19.0-1.0/3.6666666666666665*x^11.0-4.194174757281553*x^103.0+1.0/2.3333333333333335*x^28.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/1.5/7.0*x^7.0-2.769230769230769/118.0*x^118.0-1.0/3.5555555555555554/97.0*x^97.0-1.0/2.111111111111111/20.0*x^20.0-1.0/3.6666666666666665/12.0*x^12.0-4.194174757281553/104.0*x^104.0+1.0/2.3333333333333335/29.0*x^29.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/10.5*x^7.0-1.0/42.611111111111114*x^118.0-1.0/344.88888888888886*x^97.0-1.0/42.22222222222222*x^20.0-1.0/44.0*x^12.0-1.0/24.796296296296298*x^104.0+1.0/67.66666666666667*x^29.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-80.0*x^3.0-4322160.0*x^114.0-241110.0*x^93.0-2754.0*x^16.0-270.0*x^8.0-4450464.0*x^100.0+8424.0*x^25.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-80.0*3.0*x^2.0-4322160.0*114.0*x^113.0-241110.0*93.0*x^92.0-2754.0*16.0*x^15.0-270.0*8.0*x^7.0-4450464.0*100.0*x^99.0+8424.0*25.0*x^24.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-240.0*x^2.0-4.9272624E8*x^113.0-2.242323E7*x^92.0-44064.0*x^15.0-2160.0*x^7.0-4.450464E8*x^99.0+210600.0*x^24.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/10.5*x^7.0-1.0/42.611111111111114*x^118.0-1.0/344.88888888888886*x^97.0-1.0/42.22222222222222*x^20.0-1.0/44.0*x^12.0-1.0/24.796296296296298*x^104.0+1.0/67.66666666666667*x^29.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/10.5/8.0*x^8.0-1.0/42.611111111111114/119.0*x^119.0-1.0/344.88888888888886/98.0*x^98.0-1.0/42.22222222222222/21.0*x^21.0-1.0/44.0/13.0*x^13.0-1.0/24.796296296296298/105.0*x^105.0+1.0/67.66666666666667/30.0*x^30.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/84.0*x^8.0-1.0/5070.722222222223*x^119.0-1.0/33799.11111111111*x^98.0-1.0/886.6666666666666*x^21.0-1.0/572.0*x^13.0-1.0/2603.6111111111113*x^105.0+1.0/2030.0000000000002*x^30.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-240.0*x^2.0-4.9272624E8*x^113.0-2.242323E7*x^92.0-44064.0*x^15.0-2160.0*x^7.0-4.450464E8*x^99.0+210600.0*x^24.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-240.0*2.0*x^1.0-113.0*x^112.0-92.0*x^91.0-44064.0*15.0*x^14.0-2160.0*7.0*x^6.0-99.0*x^98.0+210600.0*24.0*x^23.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-480.0*x-113.0*x^112.0-92.0*x^91.0-660960.0*x^14.0-15120.0*x^6.0-99.0*x^98.0+5054400.0*x^23.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/84.0*x^8.0-1.0/5070.722222222223*x^119.0-1.0/33799.11111111111*x^98.0-1.0/886.6666666666666*x^21.0-1.0/572.0*x^13.0-1.0/2603.6111111111113*x^105.0+1.0/2030.0000000000002*x^30.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/84.0/9.0*x^9.0-1.0/5070.722222222223/120.0*x^120.0-1.0/33799.11111111111/99.0*x^99.0-1.0/886.6666666666666/22.0*x^22.0-1.0/572.0/14.0*x^14.0-1.0/2603.6111111111113/106.0*x^106.0+1.0/2030.0000000000002/31.0*x^31.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/756.0*x^9.0-1.0/608486.6666666667*x^120.0-1.0/3346112.0*x^99.0-1.0/19506.666666666664*x^22.0-1.0/8008.0*x^14.0-1.0/275982.7777777778*x^106.0+1.0/62930.00000000001*x^31.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131360() {
 UsageCalculus.TestCase = 131360;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xy^2^3-3*xy^3^4*4*xy^1^5/1*xy^2^6*--3*xy^3^74*x0^5/1*x0^6*--3*x0^71*xy^2^6*--3*xy^3^7-3*xy^3^74*x0^8*+1*x0^9*-3*x0^10*-4*x01*xy^2^9*-3*xy^3^10*-4*xy^1-3*xy^3^10*-4*xy^14*x01*xy^2^2*+-3*xy^3^3*4*xy^1^4/1*xy^2^5";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=359 EqnNumber=60 FamilyID=2 MotifTag=3 Entropy=1 FuncWrapAliasID=3"+
"// MetaRow=[12, 60, 10, 1, 2, 3, 1, 5, 3, 1, 2, 1, 1, 2, 1, 1, 2, 1, 3, 1, 1, 13, 3, 1, 2, 3, 1, 1, 1, 15, 4, 26]"+
"// DOEMatrixRow=[3, 60, 18, 1, 2, 3, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 42, 1, 1, 2, 4, 2, 3, 1, 2, 1, 2, 4, 12, 1]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "xy^5.0-x0^5.0*324.0*xy^116.0-x0^5.0*27.0*xy^95.0-x0^71.0*9.0*xy^18.0-3.0*xy^10.0-x0^8.0*x01*432.0*xy^102.0+x01*144.0*xy^31.0-12.0*xy^18.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "5.0*xy^4.0-x0^5.0*324.0*116.0*xy^115.0-x0^5.0*27.0*95.0*xy^94.0-x0^71.0*9.0*18.0*xy^17.0-3.0*10.0*xy^9.0-x0^8.0*x01*432.0*102.0*xy^101.0+x01*144.0*31.0*xy^30.0-12.0*18.0*xy^17.0";
 UsageCalculus.EqnSolArrayMap2[1] = "5.0*xy^4.0-x0^5.0*37584.0*xy^115.0-x0^5.0*2565.0*xy^94.0-x0^71.0*162.0*xy^17.0-30.0*xy^9.0-x0^8.0*x01*44064.0*xy^101.0+x01*4464.0*xy^30.0-216.0*xy^17.0";
 UsageCalculus.EqnSolArrayMap3[1] = "xy^5.0-x0^5.0*324.0*xy^116.0-x0^5.0*27.0*xy^95.0-x0^71.0*9.0*xy^18.0-3.0*xy^10.0-x0^8.0*x01*432.0*xy^102.0+x01*144.0*xy^31.0-12.0*xy^18.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0/6.0*xy^6.0-x0^5.0*324.0/117.0*xy^117.0-x0^5.0*27.0/96.0*xy^96.0-x0^71.0*9.0/19.0*xy^19.0-3.0/11.0*xy^11.0-x0^8.0*x01*432.0/103.0*xy^103.0+x01*144.0/32.0*xy^32.0-12.0/19.0*xy^19.0";
 UsageCalculus.EqnSolArrayMap4[1] = "0.16666666666666666*xy^6.0-x0^5.0*2.769230769230769*xy^117.0-x0^5.0*0.28125*xy^96.0-x0^71.0/2.111111111111111*xy^19.0-0.2727272727272727*xy^11.0-x0^8.0*x01*4.194174757281553*xy^103.0+x01*4.5*xy^32.0-1.0/1.5833333333333333*xy^19.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "5.0*xy^4.0-x0^5.0*37584.0*xy^115.0-x0^5.0*2565.0*xy^94.0-x0^71.0*162.0*xy^17.0-30.0*xy^9.0-x0^8.0*x01*44064.0*xy^101.0+x01*4464.0*xy^30.0-216.0*xy^17.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "5.0*4.0*xy^3.0-x0^5.0*37584.0*115.0*xy^114.0-x0^5.0*2565.0*94.0*xy^93.0-x0^71.0*162.0*17.0*xy^16.0-30.0*9.0*xy^8.0-x0^8.0*x01*44064.0*101.0*xy^100.0+x01*4464.0*30.0*xy^29.0-216.0*17.0*xy^16.0";
 UsageCalculus.EqnSolArrayMap2[2] = "20.0*xy^3.0-x0^5.0*4322160.0*xy^114.0-x0^5.0*241110.0*xy^93.0-x0^71.0*2754.0*xy^16.0-270.0*xy^8.0-x0^8.0*x01*4450464.0*xy^100.0+x01*133920.0*xy^29.0-3672.0*xy^16.0";
 UsageCalculus.EqnSolArrayMap3[2] = "0.16666666666666666*xy^6.0-x0^5.0*2.769230769230769*xy^117.0-x0^5.0*0.28125*xy^96.0-x0^71.0/2.111111111111111*xy^19.0-0.2727272727272727*xy^11.0-x0^8.0*x01*4.194174757281553*xy^103.0+x01*4.5*xy^32.0-1.0/1.5833333333333333*xy^19.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "0.16666666666666666/7.0*xy^7.0-x0^5.0*2.769230769230769/118.0*xy^118.0-x0^5.0*0.28125/97.0*xy^97.0-x0^71.0/2.111111111111111/20.0*xy^20.0-0.2727272727272727/12.0*xy^12.0-x0^8.0*x01*4.194174757281553/104.0*xy^104.0+x01*4.5/33.0*xy^33.0-1.0/1.5833333333333333/20.0*xy^20.0";
 UsageCalculus.EqnSolArrayMap4[2] = "0.023809523809523808*xy^7.0-x0^5.0*0.02346805736636245*xy^118.0-x0^5.0*0.0028994845360824743*xy^97.0-x0^71.0/42.22222222222222*xy^20.0-0.022727272727272724*xy^12.0-x0^8.0*x01*0.040328603435399554*xy^104.0+x01/7.333333333333333*xy^33.0-1.0/31.666666666666664*xy^20.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "20.0*xy^3.0-x0^5.0*4322160.0*xy^114.0-x0^5.0*241110.0*xy^93.0-x0^71.0*2754.0*xy^16.0-270.0*xy^8.0-x0^8.0*x01*4450464.0*xy^100.0+x01*133920.0*xy^29.0-3672.0*xy^16.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "20.0*3.0*xy^2.0-x0^5.0*4322160.0*114.0*xy^113.0-x0^5.0*241110.0*93.0*xy^92.0-x0^71.0*2754.0*16.0*xy^15.0-270.0*8.0*xy^7.0-x0^8.0*x01*4450464.0*100.0*xy^99.0+x01*133920.0*29.0*xy^28.0-3672.0*16.0*xy^15.0";
 UsageCalculus.EqnSolArrayMap2[3] = "60.0*xy^2.0-x0^5.0*4.9272624E8*xy^113.0-x0^5.0*2.242323E7*xy^92.0-x0^71.0*44064.0*xy^15.0-2160.0*xy^7.0-x0^8.0*x01*4.450464E8*xy^99.0+x01*3883680.0*xy^28.0-58752.0*xy^15.0";
 UsageCalculus.EqnSolArrayMap3[3] = "0.023809523809523808*xy^7.0-x0^5.0*0.02346805736636245*xy^118.0-x0^5.0*0.0028994845360824743*xy^97.0-x0^71.0/42.22222222222222*xy^20.0-0.022727272727272724*xy^12.0-x0^8.0*x01*0.040328603435399554*xy^104.0+x01/7.333333333333333*xy^33.0-1.0/31.666666666666664*xy^20.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "0.023809523809523808/8.0*xy^8.0-x0^5.0*0.02346805736636245/119.0*xy^119.0-x0^5.0*0.0028994845360824743/98.0*xy^98.0-x0^71.0/42.22222222222222/21.0*xy^21.0-0.022727272727272724/13.0*xy^13.0-x0^8.0*x01*0.040328603435399554/105.0*xy^105.0+x01/7.333333333333333/34.0*xy^34.0-1.0/31.666666666666664/21.0*xy^21.0";
 UsageCalculus.EqnSolArrayMap4[3] = "0.002976190476190476*xy^8.0-x0^5.0*1.9721056610388614E-4*xy^119.0-x0^5.0*2.9586576898800758E-5*xy^98.0-x0^71.0/886.6666666666666*xy^21.0-0.001748251748251748*xy^13.0-x0^8.0*x01*3.8408193747999574E-4*xy^105.0+x01/249.33333333333331*xy^34.0-1.0/665.0*xy^21.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "60.0*xy^2.0-x0^5.0*4.9272624E8*xy^113.0-x0^5.0*2.242323E7*xy^92.0-x0^71.0*44064.0*xy^15.0-2160.0*xy^7.0-x0^8.0*x01*4.450464E8*xy^99.0+x01*3883680.0*xy^28.0-58752.0*xy^15.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "60.0*2.0*xy^1.0-x0^5.0*4.9272624E8*113.0*xy^112.0-x0^5.0*2.242323E7*92.0*xy^91.0-x0^71.0*44064.0*15.0*xy^14.0-2160.0*7.0*xy^6.0-x0^8.0*x01*4.450464E8*99.0*xy^98.0+x01*3883680.0*28.0*xy^27.0-58752.0*15.0*xy^14.0";
 UsageCalculus.EqnSolArrayMap2[4] = "120.0*xy-x0^5.0*5.567806512E10*xy^112.0-x0^5.0*2.06293716E9*xy^91.0-x0^71.0*660960.0*xy^14.0-15120.0*xy^6.0-x0^8.0*x01*4.40595936E10*xy^98.0+x01*1.0874304E8*xy^27.0-881280.0*xy^14.0";
 UsageCalculus.EqnSolArrayMap3[4] = "0.002976190476190476*xy^8.0-x0^5.0*1.9721056610388614E-4*xy^119.0-4.0*xy^119.0-x0^5.0*2.9586576898800758E-5*xy^98.0-5.0*xy^98.0-x0^71.0/886.6666666666666*xy^21.0-0.001748251748251748*xy^13.0-x0^8.0*x01*3.8408193747999574E-4*xy^105.0-4.0*xy^105.0+x01/249.33333333333331*xy^34.0-1.0/665.0*xy^21.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "0.002976190476190476/9.0*xy^9.0-x0^5.0*1.9721056610388614E-4/120.0*xy^120.0-4.0/120.0*xy^120.0-x0^5.0*2.9586576898800758E-5/99.0*xy^99.0-5.0/99.0*xy^99.0-x0^71.0/886.6666666666666/22.0*xy^22.0-0.001748251748251748/14.0*xy^14.0-x0^8.0*x01*3.8408193747999574E-4/106.0*xy^106.0-4.0/106.0*xy^106.0+x01/249.33333333333331/35.0*xy^35.0-1.0/665.0/22.0*xy^22.0";
 UsageCalculus.EqnSolArrayMap4[4] = "3.3068783068783067E-4*xy^9.0-x0^5.0/608486.6666666666*xy^120.0-1.0/30.0*xy^120.0-0.03333333333333333*xy^120.0-x0^5.0/3346112.0*xy^99.0-1.0/19.8*xy^99.0-0.050505050505050504*xy^99.0-x0^71.0/19506.666666666664*xy^22.0-1.2487512487512485E-4*xy^14.0-x0^8.0*x01/275982.77777777775*xy^106.0-1.0/26.5*xy^106.0-0.03773584905660377*xy^106.0+x01/8726.666666666666*xy^35.0-1.0/14630.0*xy^22.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131361() {
 UsageCalculus.TestCase = 131361;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xyz^3^4*4*xyz^1^5/1*xyz^2^6*--3*xyz^3^74*x0^5/1*x0^6*--3*x0^71*xyz^2^6*--3*xyz^3^7-3*xyz^3^74*x0^8*+1*x0^9*-3*x0^10*-4*x01*xyz^2^9*-3*xyz^3^10*-4*xyz^1-3*xyz^3^10*-4*xyz^14*x01*xyz^2^2*+-3*xyz^3^3*4*xyz^1^4/1*xyz^2^5-3*xyz^3^3*4*xyz^1^4/1*xyz^2^5";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=360 EqnNumber=61 FamilyID=3 MotifTag=4 Entropy=2 FuncWrapAliasID=4"+
"// MetaRow=[12, 61, 10, 20, 3, 1, 2, 6, 1, 2, 3, 2, 3, 1, 2, 3, 1, 2, 4, 2, 3, 14, 1, 2, 3, 4, 2, 3, 2, 16, 1, 27]"+
"// DOEMatrixRow=[4, 61, 18, 4, 2, 1, 2, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 43, 2, 3, 1, 5, 3, 1, 2, 3, 2, 3, 1, 13, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^5.0*324.0*xyz^116.0-x0^5.0*27.0*xyz^95.0-x0^71.0*9.0*xyz^18.0-3.0*xyz^10.0-x0^8.0*x01*432.0*xyz^102.0+x01*144.0*xyz^31.0-12.0*xyz^18.0-12.0*xyz^18.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^5.0*324.0*116.0*xyz^115.0-x0^5.0*27.0*95.0*xyz^94.0-x0^71.0*9.0*18.0*xyz^17.0-3.0*10.0*xyz^9.0-x0^8.0*x01*432.0*102.0*xyz^101.0+x01*144.0*31.0*xyz^30.0-12.0*18.0*xyz^17.0-12.0*18.0*xyz^17.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^5.0*37584.0*xyz^115.0-x0^5.0*2565.0*xyz^94.0-x0^71.0*162.0*xyz^17.0-30.0*xyz^9.0-x0^8.0*x01*44064.0*xyz^101.0+x01*4464.0*xyz^30.0-216.0*xyz^17.0-216.0*xyz^17.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^5.0*324.0*xyz^116.0-x0^5.0*27.0*xyz^95.0-x0^71.0*9.0*xyz^18.0-3.0*xyz^10.0-x0^8.0*x01*432.0*xyz^102.0+x01*144.0*xyz^31.0-12.0*xyz^18.0-12.0*xyz^18.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^5.0*324.0/117.0*xyz^117.0-x0^5.0*27.0/96.0*xyz^96.0-x0^71.0*9.0/19.0*xyz^19.0-3.0/11.0*xyz^11.0-x0^8.0*x01*432.0/103.0*xyz^103.0+x01*144.0/32.0*xyz^32.0-12.0/19.0*xyz^19.0-12.0/19.0*xyz^19.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^5.0*2.769230769230769*xyz^117.0-x0^5.0*0.28125*xyz^96.0-x0^71.0/2.111111111111111*xyz^19.0-0.2727272727272727*xyz^11.0-x0^8.0*x01*4.194174757281553*xyz^103.0+x01*4.5*xyz^32.0-1.0/1.5833333333333333*xyz^19.0-1.0/1.5833333333333333*xyz^19.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^5.0*37584.0*xyz^115.0-x0^5.0*2565.0*xyz^94.0-x0^71.0*162.0*xyz^17.0-30.0*xyz^9.0-x0^8.0*x01*44064.0*xyz^101.0+x01*4464.0*xyz^30.0-216.0*xyz^17.0-216.0*xyz^17.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^5.0*37584.0*115.0*xyz^114.0-x0^5.0*2565.0*94.0*xyz^93.0-x0^71.0*162.0*17.0*xyz^16.0-30.0*9.0*xyz^8.0-x0^8.0*x01*44064.0*101.0*xyz^100.0+x01*4464.0*30.0*xyz^29.0-216.0*17.0*xyz^16.0-216.0*17.0*xyz^16.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^5.0*4322160.0*xyz^114.0-x0^5.0*241110.0*xyz^93.0-x0^71.0*2754.0*xyz^16.0-270.0*xyz^8.0-x0^8.0*x01*4450464.0*xyz^100.0+x01*133920.0*xyz^29.0-3672.0*xyz^16.0-3672.0*xyz^16.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^5.0*2.769230769230769*xyz^117.0-x0^5.0*0.28125*xyz^96.0-x0^71.0/2.111111111111111*xyz^19.0-0.2727272727272727*xyz^11.0-x0^8.0*x01*4.194174757281553*xyz^103.0+x01*4.5*xyz^32.0-1.0/1.5833333333333333*xyz^19.0-1.0/1.5833333333333333*xyz^19.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^5.0*2.769230769230769/118.0*xyz^118.0-x0^5.0*0.28125/97.0*xyz^97.0-x0^71.0/2.111111111111111/20.0*xyz^20.0-0.2727272727272727/12.0*xyz^12.0-x0^8.0*x01*4.194174757281553/104.0*xyz^104.0+x01*4.5/33.0*xyz^33.0-1.0/1.5833333333333333/20.0*xyz^20.0-1.0/1.5833333333333333/20.0*xyz^20.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^5.0*0.02346805736636245*xyz^118.0-x0^5.0*0.0028994845360824743*xyz^97.0-x0^71.0/42.22222222222222*xyz^20.0-0.022727272727272724*xyz^12.0-x0^8.0*x01*0.040328603435399554*xyz^104.0+x01/7.333333333333333*xyz^33.0-1.0/31.666666666666664*xyz^20.0-1.0/31.666666666666664*xyz^20.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^5.0*4322160.0*xyz^114.0-x0^5.0*241110.0*xyz^93.0-x0^71.0*2754.0*xyz^16.0-270.0*xyz^8.0-x0^8.0*x01*4450464.0*xyz^100.0+x01*133920.0*xyz^29.0-3672.0*xyz^16.0-3672.0*xyz^16.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^5.0*4322160.0*114.0*xyz^113.0-x0^5.0*241110.0*93.0*xyz^92.0-x0^71.0*2754.0*16.0*xyz^15.0-270.0*8.0*xyz^7.0-x0^8.0*x01*4450464.0*100.0*xyz^99.0+x01*133920.0*29.0*xyz^28.0-3672.0*16.0*xyz^15.0-3672.0*16.0*xyz^15.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^5.0*4.9272624E8*xyz^113.0-x0^5.0*2.242323E7*xyz^92.0-x0^71.0*44064.0*xyz^15.0-2160.0*xyz^7.0-x0^8.0*x01*4.450464E8*xyz^99.0+x01*3883680.0*xyz^28.0-58752.0*xyz^15.0-58752.0*xyz^15.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^5.0*0.02346805736636245*xyz^118.0-x0^5.0*0.0028994845360824743*xyz^97.0-x0^71.0/42.22222222222222*xyz^20.0-0.022727272727272724*xyz^12.0-x0^8.0*x01*0.040328603435399554*xyz^104.0+x01/7.333333333333333*xyz^33.0-1.0/31.666666666666664*xyz^20.0-1.0/31.666666666666664*xyz^20.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^5.0*0.02346805736636245/119.0*xyz^119.0-x0^5.0*0.0028994845360824743/98.0*xyz^98.0-x0^71.0/42.22222222222222/21.0*xyz^21.0-0.022727272727272724/13.0*xyz^13.0-x0^8.0*x01*0.040328603435399554/105.0*xyz^105.0+x01/7.333333333333333/34.0*xyz^34.0-1.0/31.666666666666664/21.0*xyz^21.0-1.0/31.666666666666664/21.0*xyz^21.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^5.0*1.9721056610388614E-4*xyz^119.0-x0^5.0*2.9586576898800758E-5*xyz^98.0-x0^71.0/886.6666666666666*xyz^21.0-0.001748251748251748*xyz^13.0-x0^8.0*x01*3.8408193747999574E-4*xyz^105.0+x01/249.33333333333331*xyz^34.0-1.0/665.0*xyz^21.0-1.0/665.0*xyz^21.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^5.0*4.9272624E8*xyz^113.0-x0^5.0*2.242323E7*xyz^92.0-x0^71.0*44064.0*xyz^15.0-2160.0*xyz^7.0-x0^8.0*x01*4.450464E8*xyz^99.0+x01*3883680.0*xyz^28.0-58752.0*xyz^15.0-58752.0*xyz^15.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^5.0*4.9272624E8*113.0*xyz^112.0-x0^5.0*2.242323E7*92.0*xyz^91.0-x0^71.0*44064.0*15.0*xyz^14.0-2160.0*7.0*xyz^6.0-x0^8.0*x01*4.450464E8*99.0*xyz^98.0+x01*3883680.0*28.0*xyz^27.0-58752.0*15.0*xyz^14.0-58752.0*15.0*xyz^14.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^5.0*5.567806512E10*xyz^112.0-x0^5.0*2.06293716E9*xyz^91.0-x0^71.0*660960.0*xyz^14.0-15120.0*xyz^6.0-x0^8.0*x01*4.40595936E10*xyz^98.0+x01*1.0874304E8*xyz^27.0-881280.0*xyz^14.0-881280.0*xyz^14.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^5.0*1.9721056610388614E-4*xyz^119.0-4.0*xyz^119.0-x0^5.0*2.9586576898800758E-5*xyz^98.0-5.0*xyz^98.0-x0^71.0/886.6666666666666*xyz^21.0-0.001748251748251748*xyz^13.0-x0^8.0*x01*3.8408193747999574E-4*xyz^105.0-4.0*xyz^105.0+x01/249.33333333333331*xyz^34.0-1.0/665.0*xyz^21.0-1.0/665.0*xyz^21.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^5.0*1.9721056610388614E-4/120.0*xyz^120.0-4.0/120.0*xyz^120.0-x0^5.0*2.9586576898800758E-5/99.0*xyz^99.0-5.0/99.0*xyz^99.0-x0^71.0/886.6666666666666/22.0*xyz^22.0-0.001748251748251748/14.0*xyz^14.0-x0^8.0*x01*3.8408193747999574E-4/106.0*xyz^106.0-4.0/106.0*xyz^106.0+x01/249.33333333333331/35.0*xyz^35.0-1.0/665.0/22.0*xyz^22.0-1.0/665.0/22.0*xyz^22.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^5.0/608486.6666666666*xyz^120.0-1.0/30.0*xyz^120.0-0.03333333333333333*xyz^120.0-x0^5.0/3346112.0*xyz^99.0-1.0/19.8*xyz^99.0-0.050505050505050504*xyz^99.0-x0^71.0/19506.666666666664*xyz^22.0-1.2487512487512485E-4*xyz^14.0-x0^8.0*x01/275982.77777777775*xyz^106.0-1.0/26.5*xyz^106.0-0.03773584905660377*xyz^106.0+x01/8726.666666666666*xyz^35.0-1.0/14630.0*xyz^22.0-1.0/14630.0*xyz^22.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131362() {
 UsageCalculus.TestCase = 131362;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "4*x0^5/1*x0^6*--3*x0^71*xyza^2^6*--3*xyza^3^7-3*xyza^3^74*x0^8*+1*x0^9*-3*x0^10*-4*x01*xyza^2^9*-3*xyza^3^10*-4*xyza^1-3*xyza^3^10*-4*xyza^14*x01*xyza^2^2*+-3*xyza^3^3*4*xyza^1^4/1*xyza^2^5-3*xyza^3^3*4*xyza^1^4/1*xyza^2^54*x0^4/1*x0^5";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=361 EqnNumber=62 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[12, 62, 10, 19, 4, 2, 3, 7, 2, 3, 4, 1, 1, 2, 3, 1, 2, 1, 5, 3, 4, 15, 2, 3, 1, 1, 3, 1, 3, 1, 2, 28]"+
"// DOEMatrixRow=[4, 62, 18, 3, 1, 2, 3, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 44, 3, 1, 2, 1, 1, 2, 3, 4, 3, 1, 2, 14, 1]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^5.0*36.0*xyza^18.0-x0^71.0*9.0*xyza^18.0-3.0*xyza^10.0-x0^8.0*x01*432.0*xyza^102.0+x01*144.0*xyza^31.0-12.0*xyza^18.0-x0^4.0*12.0*xyza^67.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^5.0*36.0*18.0*xyza^17.0-x0^71.0*9.0*18.0*xyza^17.0-3.0*10.0*xyza^9.0-x0^8.0*x01*432.0*102.0*xyza^101.0+x01*144.0*31.0*xyza^30.0-12.0*18.0*xyza^17.0-x0^4.0*12.0*67.0*xyza^66.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^5.0*648.0*xyza^17.0-x0^71.0*162.0*xyza^17.0-30.0*xyza^9.0-x0^8.0*x01*44064.0*xyza^101.0+x01*4464.0*xyza^30.0-216.0*xyza^17.0-x0^4.0*804.0*xyza^66.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^5.0*36.0*xyza^18.0-x0^71.0*9.0*xyza^18.0-3.0*xyza^10.0-x0^8.0*x01*432.0*xyza^102.0+x01*144.0*xyza^31.0-12.0*xyza^18.0-x0^4.0*12.0*xyza^67.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^5.0*36.0/19.0*xyza^19.0-x0^71.0*9.0/19.0*xyza^19.0-3.0/11.0*xyza^11.0-x0^8.0*x01*432.0/103.0*xyza^103.0+x01*144.0/32.0*xyza^32.0-12.0/19.0*xyza^19.0-x0^4.0*12.0/68.0*xyza^68.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^5.0*1.894736842105263*xyza^19.0-x0^71.0/2.111111111111111*xyza^19.0-0.2727272727272727*xyza^11.0-x0^8.0*x01*4.194174757281553*xyza^103.0+x01*4.5*xyza^32.0-0.631578947368421*xyza^19.0-x0^4.0/5.666666666666667*xyza^68.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^5.0*648.0*xyza^17.0-x0^71.0*162.0*xyza^17.0-30.0*xyza^9.0-x0^8.0*x01*44064.0*xyza^101.0+x01*4464.0*xyza^30.0-216.0*xyza^17.0-x0^4.0*804.0*xyza^66.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^5.0*648.0*17.0*xyza^16.0-x0^71.0*162.0*17.0*xyza^16.0-30.0*9.0*xyza^8.0-x0^8.0*x01*44064.0*101.0*xyza^100.0+x01*4464.0*30.0*xyza^29.0-216.0*17.0*xyza^16.0-x0^4.0*804.0*66.0*xyza^65.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^5.0*11016.0*xyza^16.0-x0^71.0*2754.0*xyza^16.0-270.0*xyza^8.0-x0^8.0*x01*4450464.0*xyza^100.0+x01*133920.0*xyza^29.0-3672.0*xyza^16.0-x0^4.0*53064.0*xyza^65.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^5.0*1.894736842105263*xyza^19.0-x0^71.0/2.111111111111111*xyza^19.0-0.2727272727272727*xyza^11.0-x0^8.0*x01*4.194174757281553*xyza^103.0+x01*4.5*xyza^32.0-0.631578947368421*xyza^19.0-x0^4.0/5.666666666666667*xyza^68.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^5.0*1.894736842105263/20.0*xyza^20.0-x0^71.0/2.111111111111111/20.0*xyza^20.0-0.2727272727272727/12.0*xyza^12.0-x0^8.0*x01*4.194174757281553/104.0*xyza^104.0+x01*4.5/33.0*xyza^33.0-0.631578947368421/20.0*xyza^20.0-x0^4.0*5.666666666666667/69.0*xyza^69.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^5.0*0.09473684210526315*xyza^20.0-x0^71.0/42.22222222222222*xyza^20.0-0.022727272727272724*xyza^12.0-x0^8.0*x01*0.040328603435399554*xyza^104.0+x01/7.333333333333333*xyza^33.0-0.031578947368421054*xyza^20.0-x0^4.0/12.176470588235293*xyza^69.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^5.0*11016.0*xyza^16.0-x0^71.0*2754.0*xyza^16.0-270.0*xyza^8.0-x0^8.0*x01*4450464.0*xyza^100.0+x01*133920.0*xyza^29.0-3672.0*xyza^16.0-x0^4.0*53064.0*xyza^65.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^5.0*11016.0*16.0*xyza^15.0-x0^71.0*2754.0*16.0*xyza^15.0-270.0*8.0*xyza^7.0-x0^8.0*x01*4450464.0*100.0*xyza^99.0+x01*133920.0*29.0*xyza^28.0-3672.0*16.0*xyza^15.0-x0^4.0*53064.0*65.0*xyza^64.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^5.0*176256.0*xyza^15.0-x0^71.0*44064.0*xyza^15.0-2160.0*xyza^7.0-x0^8.0*x01*4.450464E8*xyza^99.0+x01*3883680.0*xyza^28.0-58752.0*xyza^15.0-x0^4.0*3449160.0*xyza^64.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^5.0*0.09473684210526315*xyza^20.0-x0^71.0/42.22222222222222*xyza^20.0-0.022727272727272724*xyza^12.0-x0^8.0*x01*0.040328603435399554*xyza^104.0+x01/7.333333333333333*xyza^33.0-0.031578947368421054*xyza^20.0-x0^4.0/12.176470588235293*xyza^69.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^5.0*0.09473684210526315/21.0*xyza^21.0-x0^71.0/42.22222222222222/21.0*xyza^21.0-0.022727272727272724/13.0*xyza^13.0-x0^8.0*x01*0.040328603435399554/105.0*xyza^105.0+x01/7.333333333333333/34.0*xyza^34.0-0.031578947368421054/21.0*xyza^21.0-x0^4.0*12.176470588235293/70.0*xyza^70.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^5.0*0.004511278195488721*xyza^21.0-x0^71.0/886.6666666666666*xyza^21.0-0.001748251748251748*xyza^13.0-x0^8.0*x01*3.8408193747999574E-4*xyza^105.0+x01/249.33333333333331*xyza^34.0-0.0015037593984962407*xyza^21.0-x0^4.0/5.748792270531402*xyza^70.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^5.0*176256.0*xyza^15.0-x0^71.0*44064.0*xyza^15.0-2160.0*xyza^7.0-x0^8.0*x01*4.450464E8*xyza^99.0+x01*3883680.0*xyza^28.0-58752.0*xyza^15.0-x0^4.0*3449160.0*xyza^64.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^5.0*176256.0*15.0*xyza^14.0-x0^71.0*44064.0*15.0*xyza^14.0-2160.0*7.0*xyza^6.0-x0^8.0*x01*4.450464E8*99.0*xyza^98.0+x01*3883680.0*28.0*xyza^27.0-58752.0*15.0*xyza^14.0-x0^4.0*3449160.0*64.0*xyza^63.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^5.0*2643840.0*xyza^14.0-x0^71.0*660960.0*xyza^14.0-15120.0*xyza^6.0-x0^8.0*x01*4.40595936E10*xyza^98.0+x01*1.0874304E8*xyza^27.0-881280.0*xyza^14.0-x0^4.0*2.2074624E8*xyza^63.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^5.0*0.004511278195488721*xyza^21.0-x0^71.0/886.6666666666666*xyza^21.0-0.001748251748251748*xyza^13.0-x0^8.0*x01*3.8408193747999574E-4*xyza^105.0-4.0*xyza^105.0+x01/249.33333333333331*xyza^34.0-0.0015037593984962407*xyza^21.0-x0^4.0/5.748792270531402*xyza^70.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^5.0*0.004511278195488721/22.0*xyza^22.0-x0^71.0/886.6666666666666/22.0*xyza^22.0-0.001748251748251748/14.0*xyza^14.0-x0^8.0*x01*3.8408193747999574E-4/106.0*xyza^106.0-4.0/106.0*xyza^106.0+x01/249.33333333333331/35.0*xyza^35.0-0.0015037593984962407/22.0*xyza^22.0-x0^4.0*5.748792270531402/71.0*xyza^71.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^5.0*2.0505809979494188E-4*xyza^22.0-x0^71.0/19506.666666666664*xyza^22.0-1.2487512487512485E-4*xyza^14.0-x0^8.0*x01/275982.77777777775*xyza^106.0-1.0/26.5*xyza^106.0-0.03773584905660377*xyza^106.0+x01/8726.666666666666*xyza^35.0-6.835269993164731E-5*xyza^22.0-x0^4.0/12.350420168067226*xyza^71.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131363() {
 UsageCalculus.TestCase = 131363;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x^2^6*--3*x^3^7-3*x^3^74*x0^8*+1*x0^9*-3*x0^10*-4*x01*x^2^9*-3*x^3^10*-4*x^1-3*x^3^10*-4*x^14*x01*x^2^2*+-3*x^3^3*4*x^1^4/1*x^2^5-3*x^3^3*4*x^1^4/1*x^2^54*x0^4/1*x0^51*x^2^5";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=362 EqnNumber=63 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[12, 63, 10, 18, 1, 3, 1, 8, 3, 4, 1, 2, 3, 1, 4, 2, 3, 2, 1, 1, 1, 16, 3, 1, 2, 3, 4, 2, 4, 2, 3, 29]"+
"// DOEMatrixRow=[4, 63, 18, 2, 3, 1, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 45, 4, 2, 3, 2, 3, 1, 4, 1, 1, 2, 3, 15, 2]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "3.0*x^18.0-3.0*x^10.0-432.0*x^102.0+144.0*x^31.0-12.0*x^18.0-12.0*x^74.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "3.0*18.0*x^17.0-3.0*10.0*x^9.0-432.0*102.0*x^101.0+144.0*31.0*x^30.0-12.0*18.0*x^17.0-12.0*74.0*x^73.0";
 UsageCalculus.EqnSolArrayMap2[1] = "54.0*x^17.0-30.0*x^9.0-44064.0*x^101.0+4464.0*x^30.0-216.0*x^17.0-888.0*x^73.0";
 UsageCalculus.EqnSolArrayMap3[1] = "3.0*x^18.0-3.0*x^10.0-432.0*x^102.0+144.0*x^31.0-12.0*x^18.0-12.0*x^74.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "3.0/19.0*x^19.0-3.0/11.0*x^11.0-432.0/103.0*x^103.0+144.0/32.0*x^32.0-12.0/19.0*x^19.0-12.0/75.0*x^75.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/6.333333333333333*x^19.0-1.0/3.6666666666666665*x^11.0-4.194174757281553*x^103.0+4.5*x^32.0-1.0/1.5833333333333333*x^19.0-1.0/6.25*x^75.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "54.0*x^17.0-30.0*x^9.0-44064.0*x^101.0+4464.0*x^30.0-216.0*x^17.0-888.0*x^73.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "54.0*17.0*x^16.0-30.0*9.0*x^8.0-44064.0*101.0*x^100.0+4464.0*30.0*x^29.0-216.0*17.0*x^16.0-888.0*73.0*x^72.0";
 UsageCalculus.EqnSolArrayMap2[2] = "918.0*x^16.0-270.0*x^8.0-4450464.0*x^100.0+133920.0*x^29.0-3672.0*x^16.0-64824.0*x^72.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/6.333333333333333*x^19.0-1.0/3.6666666666666665*x^11.0-4.194174757281553*x^103.0+4.5*x^32.0-1.0/1.5833333333333333*x^19.0-1.0/6.25*x^75.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/6.333333333333333/20.0*x^20.0-1.0/3.6666666666666665/12.0*x^12.0-4.194174757281553/104.0*x^104.0+4.5/33.0*x^33.0-1.0/1.5833333333333333/20.0*x^20.0-1.0/6.25/76.0*x^76.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/126.66666666666666*x^20.0-1.0/44.0*x^12.0-1.0/24.796296296296298*x^104.0+1.0/7.333333333333333*x^33.0-1.0/31.666666666666664*x^20.0-1.0/475.0*x^76.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "918.0*x^16.0-270.0*x^8.0-4450464.0*x^100.0+133920.0*x^29.0-3672.0*x^16.0-64824.0*x^72.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "918.0*16.0*x^15.0-270.0*8.0*x^7.0-4450464.0*100.0*x^99.0+133920.0*29.0*x^28.0-3672.0*16.0*x^15.0-64824.0*72.0*x^71.0";
 UsageCalculus.EqnSolArrayMap2[3] = "14688.0*x^15.0-2160.0*x^7.0-4.450464E8*x^99.0+3883680.0*x^28.0-58752.0*x^15.0-4667328.0*x^71.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/126.66666666666666*x^20.0-1.0/44.0*x^12.0-1.0/24.796296296296298*x^104.0+1.0/7.333333333333333*x^33.0-1.0/31.666666666666664*x^20.0-1.0/475.0*x^76.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/126.66666666666666/21.0*x^21.0-1.0/44.0/13.0*x^13.0-1.0/24.796296296296298/105.0*x^105.0+1.0/7.333333333333333/34.0*x^34.0-1.0/31.666666666666664/21.0*x^21.0-1.0/475.0/77.0*x^77.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/2660.0*x^21.0-1.0/572.0*x^13.0-1.0/2603.6111111111113*x^105.0+1.0/249.33333333333331*x^34.0-1.0/665.0*x^21.0-1.0/36575.0*x^77.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "14688.0*x^15.0-2160.0*x^7.0-4.450464E8*x^99.0+3883680.0*x^28.0-58752.0*x^15.0-4667328.0*x^71.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "14688.0*15.0*x^14.0-2160.0*7.0*x^6.0-99.0*x^98.0+3883680.0*28.0*x^27.0-58752.0*15.0*x^14.0-4667328.0*71.0*x^70.0";
 UsageCalculus.EqnSolArrayMap2[4] = "220320.0*x^14.0-15120.0*x^6.0-99.0*x^98.0+1.0874304E8*x^27.0-881280.0*x^14.0-3.31380288E8*x^70.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/2660.0*x^21.0-1.0/572.0*x^13.0-1.0/2603.6111111111113*x^105.0+1.0/249.33333333333331*x^34.0-1.0/665.0*x^21.0-1.0/36575.0*x^77.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/2660.0/22.0*x^22.0-1.0/572.0/14.0*x^14.0-1.0/2603.6111111111113/106.0*x^106.0+1.0/249.33333333333331/35.0*x^35.0-1.0/665.0/22.0*x^22.0-1.0/36575.0/78.0*x^78.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/58520.0*x^22.0-1.0/8008.0*x^14.0-1.0/275982.7777777778*x^106.0+1.0/8726.666666666666*x^35.0-1.0/14630.0*x^22.0-1.0/2852850.0*x^78.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131364() {
 UsageCalculus.TestCase = 131364;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xy^3^74*x0^8*+1*x0^9*-3*x0^10*-4*x01*xy^2^9*-3*xy^3^10*-4*xy^1-3*xy^3^10*-4*xy^14*x01*xy^2^2*+-3*xy^3^3*4*xy^1^4/1*xy^2^5-3*xy^3^3*4*xy^1^4/1*xy^2^54*x0^4/1*x0^51*xy^2^5-3*xy^3^6/-4*xy^1^7*+1*xy^2^8*-3*xy^3^9";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=363 EqnNumber=64 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[12, 64, 10, 17, 2, 1, 2, 9, 1, 1, 2, 1, 1, 2, 1, 3, 1, 1, 2, 3, 2, 1, 1, 2, 3, 4, 5, 3, 1, 3, 4, 30]"+
"// DOEMatrixRow=[4, 64, 18, 1, 2, 3, 2, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 46, 5, 3, 1, 3, 1, 2, 5, 2, 3, 1, 4, 16, 1]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^8.0*x01*432.0*xy^102.0+x01*144.0*xy^31.0-12.0*xy^18.0-x0^4.0*12.0*xy^74.0-2.25*xy^39.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^8.0*x01*432.0*102.0*xy^101.0+x01*144.0*31.0*xy^30.0-12.0*18.0*xy^17.0-x0^4.0*12.0*74.0*xy^73.0-2.25*39.0*xy^38.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^8.0*x01*44064.0*xy^101.0+x01*4464.0*xy^30.0-216.0*xy^17.0-x0^4.0*888.0*xy^73.0-87.75*xy^38.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^8.0*x01*432.0*xy^102.0+x01*144.0*xy^31.0-12.0*xy^18.0-x0^4.0*12.0*xy^74.0-2.25*xy^39.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^8.0*x01*432.0/103.0*xy^103.0+x01*144.0/32.0*xy^32.0-12.0/19.0*xy^19.0-x0^4.0*12.0/75.0*xy^75.0-2.25/40.0*xy^40.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^8.0*x01*4.194174757281553*xy^103.0+x01*4.5*xy^32.0-0.631578947368421*xy^19.0-x0^4.0/6.25*xy^75.0-1.0/17.77777777777778*xy^40.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^8.0*x01*44064.0*xy^101.0+x01*4464.0*xy^30.0-216.0*xy^17.0-x0^4.0*888.0*xy^73.0-87.75*xy^38.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^8.0*x01*44064.0*101.0*xy^100.0+x01*4464.0*30.0*xy^29.0-216.0*17.0*xy^16.0-x0^4.0*888.0*73.0*xy^72.0-87.75*38.0*xy^37.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^8.0*x01*4450464.0*xy^100.0+x01*133920.0*xy^29.0-3672.0*xy^16.0-x0^4.0*64824.0*xy^72.0-3334.5*xy^37.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^8.0*x01*4.194174757281553*xy^103.0+x01*4.5*xy^32.0-0.631578947368421*xy^19.0-x0^4.0/6.25*xy^75.0-1.0/17.77777777777778*xy^40.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^8.0*x01*4.194174757281553/104.0*xy^104.0+x01*4.5/33.0*xy^33.0-0.631578947368421/20.0*xy^20.0-x0^4.0/6.25/76.0*xy^76.0-1.0/17.77777777777778/41.0*xy^41.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^8.0*x01*0.040328603435399554*xy^104.0+x01/7.333333333333333*xy^33.0-0.031578947368421054*xy^20.0-x0^4.0/475.0*xy^76.0-1.0/728.8888888888889*xy^41.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^8.0*x01*4450464.0*xy^100.0+x01*133920.0*xy^29.0-3672.0*xy^16.0-x0^4.0*64824.0*xy^72.0-3334.5*xy^37.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^8.0*x01*4450464.0*100.0*xy^99.0+x01*133920.0*29.0*xy^28.0-3672.0*16.0*xy^15.0-x0^4.0*64824.0*72.0*xy^71.0-3334.5*37.0*xy^36.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^8.0*x01*4.450464E8*xy^99.0+x01*3883680.0*xy^28.0-58752.0*xy^15.0-x0^4.0*4667328.0*xy^71.0-123376.5*xy^36.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^8.0*x01*0.040328603435399554*xy^104.0+x01/7.333333333333333*xy^33.0-0.031578947368421054*xy^20.0-x0^4.0/475.0*xy^76.0-1.0/728.8888888888889*xy^41.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^8.0*x01*0.040328603435399554/105.0*xy^105.0+x01/7.333333333333333/34.0*xy^34.0-0.031578947368421054/21.0*xy^21.0-x0^4.0/475.0/77.0*xy^77.0-1.0/728.8888888888889/42.0*xy^42.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^8.0*x01*3.8408193747999574E-4*xy^105.0+x01/249.33333333333331*xy^34.0-0.0015037593984962407*xy^21.0-x0^4.0/36575.0*xy^77.0-1.0/30613.333333333336*xy^42.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^8.0*x01*4.450464E8*xy^99.0+x01*3883680.0*xy^28.0-58752.0*xy^15.0-x0^4.0*4667328.0*xy^71.0-123376.5*xy^36.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^8.0*x01*4.450464E8*99.0*xy^98.0+x01*3883680.0*28.0*xy^27.0-58752.0*15.0*xy^14.0-x0^4.0*4667328.0*71.0*xy^70.0-123376.5*36.0*xy^35.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^8.0*x01*4.40595936E10*xy^98.0+x01*1.0874304E8*xy^27.0-881280.0*xy^14.0-x0^4.0*3.31380288E8*xy^70.0-4441554.0*xy^35.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^8.0*x01*3.8408193747999574E-4*xy^105.0-4.0*xy^105.0+x01/249.33333333333331*xy^34.0-0.0015037593984962407*xy^21.0-x0^4.0/36575.0*xy^77.0-1.0/30613.333333333336*xy^42.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^8.0*x01*3.8408193747999574E-4/106.0*xy^106.0-4.0/106.0*xy^106.0+x01/249.33333333333331/35.0*xy^35.0-0.0015037593984962407/22.0*xy^22.0-x0^4.0/36575.0/78.0*xy^78.0-1.0/30613.333333333336/43.0*xy^43.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^8.0*x01/275982.77777777775*xy^106.0-1.0/26.5*xy^106.0-0.03773584905660377*xy^106.0+x01/8726.666666666666*xy^35.0-6.835269993164731E-5*xy^22.0-x0^4.0/2852850.0*xy^78.0-1.0/1316373.3333333335*xy^43.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131365() {
 UsageCalculus.TestCase = 131365;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "4*x0^8*+1*x0^9*-3*x0^10*-4*x01*xyz^2^9*-3*xyz^3^10*-4*xyz^1-3*xyz^3^10*-4*xyz^14*x01*xyz^2^2*+-3*xyz^3^3*4*xyz^1^4/1*xyz^2^5-3*xyz^3^3*4*xyz^1^4/1*xyz^2^54*x0^4/1*x0^51*xyz^2^5-3*xyz^3^6/-4*xyz^1^7*+1*xyz^2^8*-3*xyz^3^94*x0^7*+1*x0^8*-3*x0^9";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=364 EqnNumber=65 FamilyID=1 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[12, 65, 10, 16, 3, 2, 3, 10, 2, 3, 4, 2, 3, 1, 2, 1, 2, 1, 3, 1, 3, 2, 3, 1, 1, 1, 6, 1, 2, 4, 1, 31]"+
"// DOEMatrixRow=[4, 65, 18, 4, 3, 1, 3, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 47, 6, 1, 2, 4, 2, 3, 6, 3, 1, 2, 1, 1, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^8.0*x01*576.0*xyz^25.0+x01*144.0*xyz^31.0-12.0*xyz^18.0-x0^4.0*12.0*xyz^74.0+x0^7.0*6.75*xyz^124.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^8.0*x01*576.0*25.0*xyz^24.0+x01*144.0*31.0*xyz^30.0-12.0*18.0*xyz^17.0-x0^4.0*12.0*74.0*xyz^73.0+x0^7.0*6.75*124.0*xyz^123.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^8.0*x01*14400.0*xyz^24.0+x01*4464.0*xyz^30.0-216.0*xyz^17.0-x0^4.0*888.0*xyz^73.0+x0^7.0*837.0*xyz^123.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^8.0*x01*576.0*xyz^25.0+x01*144.0*xyz^31.0-12.0*xyz^18.0-x0^4.0*12.0*xyz^74.0+x0^7.0*6.75*xyz^124.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^8.0*x01*576.0/26.0*xyz^26.0+x01*144.0/32.0*xyz^32.0-12.0/19.0*xyz^19.0-x0^4.0*12.0/75.0*xyz^75.0+x0^7.0*6.75/125.0*xyz^125.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^8.0*x01*22.153846153846153*xyz^26.0+x01*4.5*xyz^32.0-0.631578947368421*xyz^19.0-x0^4.0*0.16*xyz^75.0+x0^7.0/18.51851851851852*xyz^125.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^8.0*x01*14400.0*xyz^24.0+x01*4464.0*xyz^30.0-216.0*xyz^17.0-x0^4.0*888.0*xyz^73.0+x0^7.0*837.0*xyz^123.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^8.0*x01*14400.0*24.0*xyz^23.0+x01*4464.0*30.0*xyz^29.0-216.0*17.0*xyz^16.0-x0^4.0*888.0*73.0*xyz^72.0+x0^7.0*837.0*123.0*xyz^122.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^8.0*x01*345600.0*xyz^23.0+x01*133920.0*xyz^29.0-3672.0*xyz^16.0-x0^4.0*64824.0*xyz^72.0+x0^7.0*102951.0*xyz^122.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^8.0*x01*22.153846153846153*xyz^26.0+x01*4.5*xyz^32.0-0.631578947368421*xyz^19.0-x0^4.0*0.16*xyz^75.0+x0^7.0/18.51851851851852*xyz^125.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^8.0*x01*22.153846153846153/27.0*xyz^27.0+x01*4.5/33.0*xyz^33.0-0.631578947368421/20.0*xyz^20.0-x0^4.0*0.16/76.0*xyz^76.0+x0^7.0*18.51851851851852/126.0*xyz^126.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^8.0*x01*0.8205128205128205*xyz^27.0+x01/7.333333333333333*xyz^33.0-0.031578947368421054*xyz^20.0-x0^4.0*0.002105263157894737*xyz^76.0+x0^7.0/6.803999999999999*xyz^126.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^8.0*x01*345600.0*xyz^23.0+x01*133920.0*xyz^29.0-3672.0*xyz^16.0-x0^4.0*64824.0*xyz^72.0+x0^7.0*102951.0*xyz^122.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^8.0*x01*345600.0*23.0*xyz^22.0+x01*133920.0*29.0*xyz^28.0-3672.0*16.0*xyz^15.0-x0^4.0*64824.0*72.0*xyz^71.0+x0^7.0*102951.0*122.0*xyz^121.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^8.0*x01*7948800.0*xyz^22.0+x01*3883680.0*xyz^28.0-58752.0*xyz^15.0-x0^4.0*4667328.0*xyz^71.0+x0^7.0*1.2560022E7*xyz^121.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^8.0*x01*0.8205128205128205*xyz^27.0+x01/7.333333333333333*xyz^33.0-0.031578947368421054*xyz^20.0-x0^4.0*0.002105263157894737*xyz^76.0+x0^7.0/6.803999999999999*xyz^126.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^8.0*x01*0.8205128205128205/28.0*xyz^28.0+x01/7.333333333333333/34.0*xyz^34.0-0.031578947368421054/21.0*xyz^21.0-x0^4.0*0.002105263157894737/77.0*xyz^77.0+x0^7.0*6.803999999999999/127.0*xyz^127.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^8.0*x01*0.029304029304029304*xyz^28.0+x01/249.33333333333331*xyz^34.0-0.0015037593984962407*xyz^21.0-x0^4.0*2.734107997265892E-5*xyz^77.0+x0^7.0/18.665490887713112*xyz^127.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^8.0*x01*7948800.0*xyz^22.0+x01*3883680.0*xyz^28.0-58752.0*xyz^15.0-x0^4.0*4667328.0*xyz^71.0+x0^7.0*1.2560022E7*xyz^121.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^8.0*x01*7948800.0*22.0*xyz^21.0+x01*3883680.0*28.0*xyz^27.0-58752.0*15.0*xyz^14.0-x0^4.0*4667328.0*71.0*xyz^70.0+0.0*121.0*xyz^120.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^8.0*x01*1.748736E8*xyz^21.0+x01*1.0874304E8*xyz^27.0-881280.0*xyz^14.0-x0^4.0*3.31380288E8*xyz^70.0+0.0*xyz^120.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^8.0*x01*0.029304029304029304*xyz^28.0+x01/249.33333333333331*xyz^34.0-0.0015037593984962407*xyz^21.0-x0^4.0*2.734107997265892E-5*xyz^77.0-5.0*xyz^77.0+x0^7.0/18.665490887713112*xyz^127.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^8.0*x01*0.029304029304029304/29.0*xyz^29.0+x01/249.33333333333331/35.0*xyz^35.0-0.0015037593984962407/22.0*xyz^22.0-x0^4.0*2.734107997265892E-5/78.0*xyz^78.0-5.0/78.0*xyz^78.0+x0^7.0*18.665490887713112/128.0*xyz^128.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^8.0*x01*0.0010104837691044587*xyz^29.0+x01/8726.666666666666*xyz^35.0-6.835269993164731E-5*xyz^22.0-x0^4.0/2852850.0*xyz^78.0-1.0/15.6*xyz^78.0-0.0641025641025641*xyz^78.0+x0^7.0/6.857574803149605*xyz^128.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131366() {
 UsageCalculus.TestCase = 131366;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xyza^2^9*-3*xyza^3^10*-4*xyza^1-3*xyza^3^10*-4*xyza^14*x01*xyza^2^2*+-3*xyza^3^3*4*xyza^1^4/1*xyza^2^5-3*xyza^3^3*4*xyza^1^4/1*xyza^2^54*x0^4/1*x0^51*xyza^2^5-3*xyza^3^6/-4*xyza^1^7*+1*xyza^2^8*-3*xyza^3^94*x0^7*+1*x0^8*-3*x0^91*xyza^2^8*-3*xyza^3^9";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=365 EqnNumber=66 FamilyID=3 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[12, 66, 10, 15, 4, 3, 1, 1, 3, 4, 1, 1, 1, 2, 3, 2, 3, 2, 4, 2, 4, 3, 1, 2, 3, 2, 7, 2, 3, 5, 2, 32]"+
"// DOEMatrixRow=[4, 66, 18, 3, 1, 2, 1, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 48, 7, 2, 3, 5, 3, 1, 1, 4, 2, 3, 2, 3, 1]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "12.0*xyza^25.0+x01*144.0*xyza^31.0-12.0*xyza^18.0-x0^4.0*12.0*xyza^74.0-x0^7.0*20.25*xyza^146.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "12.0*25.0*xyza^24.0+x01*144.0*31.0*xyza^30.0-12.0*18.0*xyza^17.0-x0^4.0*12.0*74.0*xyza^73.0-x0^7.0*20.25*146.0*xyza^145.0";
 UsageCalculus.EqnSolArrayMap2[1] = "300.0*xyza^24.0+x01*4464.0*xyza^30.0-216.0*xyza^17.0-x0^4.0*888.0*xyza^73.0-x0^7.0*2956.5*xyza^145.0";
 UsageCalculus.EqnSolArrayMap3[1] = "12.0*xyza^25.0+x01*144.0*xyza^31.0-12.0*xyza^18.0-x0^4.0*12.0*xyza^74.0-x0^7.0*20.25*xyza^146.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "12.0/26.0*xyza^26.0+x01*144.0/32.0*xyza^32.0-12.0/19.0*xyza^19.0-x0^4.0*12.0/75.0*xyza^75.0-x0^7.0*20.25/147.0*xyza^147.0";
 UsageCalculus.EqnSolArrayMap4[1] = "0.46153846153846156*xyza^26.0+x01*4.5*xyza^32.0-0.631578947368421*xyza^19.0-x0^4.0*0.16*xyza^75.0-x0^7.0/7.2592592592592595*xyza^147.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "300.0*xyza^24.0+x01*4464.0*xyza^30.0-216.0*xyza^17.0-x0^4.0*888.0*xyza^73.0-x0^7.0*2956.5*xyza^145.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "300.0*24.0*xyza^23.0+x01*4464.0*30.0*xyza^29.0-216.0*17.0*xyza^16.0-x0^4.0*888.0*73.0*xyza^72.0-x0^7.0*2956.5*145.0*xyza^144.0";
 UsageCalculus.EqnSolArrayMap2[2] = "7200.0*xyza^23.0+x01*133920.0*xyza^29.0-3672.0*xyza^16.0-x0^4.0*64824.0*xyza^72.0-x0^7.0*428692.5*xyza^144.0";
 UsageCalculus.EqnSolArrayMap3[2] = "0.46153846153846156*xyza^26.0+x01*4.5*xyza^32.0-0.631578947368421*xyza^19.0-x0^4.0*0.16*xyza^75.0-x0^7.0/7.2592592592592595*xyza^147.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "0.46153846153846156/27.0*xyza^27.0+x01*4.5/33.0*xyza^33.0-0.631578947368421/20.0*xyza^20.0-x0^4.0*0.16/76.0*xyza^76.0-x0^7.0*7.2592592592592595/148.0*xyza^148.0";
 UsageCalculus.EqnSolArrayMap4[2] = "0.017094017094017096*xyza^27.0+x01/7.333333333333333*xyza^33.0-0.031578947368421054*xyza^20.0-x0^4.0*0.002105263157894737*xyza^76.0-x0^7.0/20.387755102040817*xyza^148.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "7200.0*xyza^23.0+x01*133920.0*xyza^29.0-3672.0*xyza^16.0-x0^4.0*64824.0*xyza^72.0-x0^7.0*428692.5*xyza^144.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "7200.0*23.0*xyza^22.0+x01*133920.0*29.0*xyza^28.0-3672.0*16.0*xyza^15.0-x0^4.0*64824.0*72.0*xyza^71.0-x0^7.0*428692.5*144.0*xyza^143.0";
 UsageCalculus.EqnSolArrayMap2[3] = "165600.0*xyza^22.0+x01*3883680.0*xyza^28.0-58752.0*xyza^15.0-x0^4.0*4667328.0*xyza^71.0-x0^7.0*6.173172E7*xyza^143.0";
 UsageCalculus.EqnSolArrayMap3[3] = "0.017094017094017096*xyza^27.0+x01/7.333333333333333*xyza^33.0-0.031578947368421054*xyza^20.0-x0^4.0*0.002105263157894737*xyza^76.0-x0^7.0/20.387755102040817*xyza^148.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "0.017094017094017096/28.0*xyza^28.0+x01/7.333333333333333/34.0*xyza^34.0-0.031578947368421054/21.0*xyza^21.0-x0^4.0*0.002105263157894737/77.0*xyza^77.0-x0^7.0*20.387755102040817/149.0*xyza^149.0";
 UsageCalculus.EqnSolArrayMap4[3] = "6.105006105006106E-4*xyza^28.0+x01/249.33333333333331*xyza^34.0-0.0015037593984962407*xyza^21.0-x0^4.0*2.734107997265892E-5*xyza^77.0-x0^7.0/7.308308308308308*xyza^149.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "165600.0*xyza^22.0+x01*3883680.0*xyza^28.0-58752.0*xyza^15.0-x0^4.0*4667328.0*xyza^71.0-x0^7.0*6.173172E7*xyza^143.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "165600.0*22.0*xyza^21.0+x01*3883680.0*28.0*xyza^27.0-58752.0*15.0*xyza^14.0-x0^4.0*4667328.0*71.0*xyza^70.0-0.0*143.0*xyza^142.0";
 UsageCalculus.EqnSolArrayMap2[4] = "3643200.0*xyza^21.0+x01*1.0874304E8*xyza^27.0-881280.0*xyza^14.0-x0^4.0*3.31380288E8*xyza^70.0-0.0*xyza^142.0";
 UsageCalculus.EqnSolArrayMap3[4] = "6.105006105006106E-4*xyza^28.0-4.0*xyza^28.0+x01/249.33333333333331*xyza^34.0-0.0015037593984962407*xyza^21.0-x0^4.0*2.734107997265892E-5*xyza^77.0-5.0*xyza^77.0-x0^7.0/7.308308308308308*xyza^149.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "6.105006105006106E-4/29.0*xyza^29.0-4.0/29.0*xyza^29.0+x01/249.33333333333331/35.0*xyza^35.0-0.0015037593984962407/22.0*xyza^22.0-x0^4.0*2.734107997265892E-5/78.0*xyza^78.0-5.0/78.0*xyza^78.0-x0^7.0*7.308308308308308/150.0*xyza^150.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/47501.99999999999*xyza^29.0-1.0/7.25*xyza^29.0-0.13793103448275862*xyza^29.0+x01/8726.666666666666*xyza^35.0-6.835269993164731E-5*xyza^22.0-x0^4.0/2852850.0*xyza^78.0-1.0/15.6*xyza^78.0-0.0641025641025641*xyza^78.0-x0^7.0/20.524585673195453*xyza^150.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131367() {
 UsageCalculus.TestCase = 131367;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*x^3^10*-4*x^14*x01*x^2^2*+-3*x^3^3*4*x^1^4/1*x^2^5-3*x^3^3*4*x^1^4/1*x^2^54*x0^4/1*x0^51*x^2^5-3*x^3^6/-4*x^1^7*+1*x^2^8*-3*x^3^94*x0^7*+1*x0^8*-3*x0^91*x^2^8*-3*x^3^9-3*x^3^9";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=366 EqnNumber=67 FamilyID=1 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[12, 67, 10, 14, 1, 1, 2, 3, 1, 1, 2, 1, 2, 3, 4, 3, 1, 1, 5, 3, 1, 4, 2, 3, 1, 3, 8, 3, 4, 6, 3, 1]"+
"// DOEMatrixRow=[4, 67, 18, 2, 1, 3, 2, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 49, 8, 3, 1, 1, 1, 2, 3, 1, 3, 1, 3, 4, 2]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "144.0*x^31.0-12.0*x^18.0-12.0*x^74.0-20.25*x^146.0-3.0*x^12.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "144.0*31.0*x^30.0-12.0*18.0*x^17.0-12.0*74.0*x^73.0-20.25*146.0*x^145.0-3.0*12.0*x^11.0";
 UsageCalculus.EqnSolArrayMap2[1] = "4464.0*x^30.0-216.0*x^17.0-888.0*x^73.0-2956.5*x^145.0-36.0*x^11.0";
 UsageCalculus.EqnSolArrayMap3[1] = "144.0*x^31.0-12.0*x^18.0-12.0*x^74.0-20.25*x^146.0-3.0*x^12.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "144.0/32.0*x^32.0-12.0/19.0*x^19.0-12.0/75.0*x^75.0-20.25/147.0*x^147.0-3.0/13.0*x^13.0";
 UsageCalculus.EqnSolArrayMap4[1] = "4.5*x^32.0-1.0/1.5833333333333333*x^19.0-1.0/6.25*x^75.0-1.0/7.2592592592592595*x^147.0-1.0/4.333333333333333*x^13.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "4464.0*x^30.0-216.0*x^17.0-888.0*x^73.0-2956.5*x^145.0-36.0*x^11.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "4464.0*30.0*x^29.0-216.0*17.0*x^16.0-888.0*73.0*x^72.0-2956.5*145.0*x^144.0-36.0*11.0*x^10.0";
 UsageCalculus.EqnSolArrayMap2[2] = "133920.0*x^29.0-3672.0*x^16.0-64824.0*x^72.0-428692.5*x^144.0-396.0*x^10.0";
 UsageCalculus.EqnSolArrayMap3[2] = "4.5*x^32.0-1.0/1.5833333333333333*x^19.0-1.0/6.25*x^75.0-1.0/7.2592592592592595*x^147.0-1.0/4.333333333333333*x^13.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "4.5/33.0*x^33.0-1.0/1.5833333333333333/20.0*x^20.0-1.0/6.25/76.0*x^76.0-1.0/7.2592592592592595/148.0*x^148.0-1.0/4.333333333333333/14.0*x^14.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/7.333333333333333*x^33.0-1.0/31.666666666666664*x^20.0-1.0/475.0*x^76.0-1.0/1074.3703703703704*x^148.0-1.0/60.666666666666664*x^14.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "133920.0*x^29.0-3672.0*x^16.0-64824.0*x^72.0-428692.5*x^144.0-396.0*x^10.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "133920.0*29.0*x^28.0-3672.0*16.0*x^15.0-64824.0*72.0*x^71.0-428692.5*144.0*x^143.0-396.0*10.0*x^9.0";
 UsageCalculus.EqnSolArrayMap2[3] = "3883680.0*x^28.0-58752.0*x^15.0-4667328.0*x^71.0-6.173172E7*x^143.0-3960.0*x^9.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/7.333333333333333*x^33.0-1.0/31.666666666666664*x^20.0-1.0/475.0*x^76.0-1.0/1074.3703703703704*x^148.0-1.0/60.666666666666664*x^14.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/7.333333333333333/34.0*x^34.0-1.0/31.666666666666664/21.0*x^21.0-1.0/475.0/77.0*x^77.0-1.0/1074.3703703703704/149.0*x^149.0-1.0/60.666666666666664/15.0*x^15.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/249.33333333333331*x^34.0-1.0/665.0*x^21.0-1.0/36575.0*x^77.0-1.0/160081.1851851852*x^149.0-1.0/910.0*x^15.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "3883680.0*x^28.0-58752.0*x^15.0-4667328.0*x^71.0-6.173172E7*x^143.0-3960.0*x^9.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "3883680.0*28.0*x^27.0-58752.0*15.0*x^14.0-4667328.0*71.0*x^70.0-143.0*x^142.0-3960.0*9.0*x^8.0";
 UsageCalculus.EqnSolArrayMap2[4] = "1.0874304E8*x^27.0-881280.0*x^14.0-3.31380288E8*x^70.0-143.0*x^142.0-35640.0*x^8.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/249.33333333333331*x^34.0-1.0/665.0*x^21.0-1.0/36575.0*x^77.0-1.0/160081.1851851852*x^149.0-1.0/910.0*x^15.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/249.33333333333331/35.0*x^35.0-1.0/665.0/22.0*x^22.0-1.0/36575.0/78.0*x^78.0-1.0/160081.1851851852/150.0*x^150.0-1.0/910.0/16.0*x^16.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/8726.666666666666*x^35.0-1.0/14630.0*x^22.0-1.0/2852850.0*x^78.0-1.0/2.401217777777778E7*x^150.0-1.0/14560.0*x^16.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131368() {
 UsageCalculus.TestCase = 131368;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "4*x01*xy^2^2*+-3*xy^3^3*4*xy^1^4/1*xy^2^5-3*xy^3^3*4*xy^1^4/1*xy^2^54*x0^4/1*x0^51*xy^2^5-3*xy^3^6/-4*xy^1^7*+1*xy^2^8*-3*xy^3^94*x0^7*+1*x0^8*-3*x0^91*xy^2^8*-3*xy^3^9-3*xy^3^94*x0^10*-1*x0/--3*x0^2*+4*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=367 EqnNumber=68 FamilyID=2 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[12, 68, 10, 13, 2, 3, 1, 4, 2, 3, 4, 2, 3, 1, 1, 1, 2, 1, 1, 1, 2, 5, 3, 1, 2, 4, 9, 1, 1, 7, 4, 2]"+
"// DOEMatrixRow=[4, 68, 18, 1, 3, 1, 3, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 50, 9, 1, 2, 3, 2, 3, 4, 2, 1, 2, 4, 5, 1]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x01*48.0*xy^4.0-12.0*xy^18.0-x0^4.0*12.0*xy^74.0-x0^7.0*20.25*xy^146.0+x0^10.0*x0*4.0*xy^97.0-x0^2.0*12.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x01*48.0*4.0*xy^3.0-12.0*18.0*xy^17.0-x0^4.0*12.0*74.0*xy^73.0-x0^7.0*20.25*146.0*xy^145.0+x0^10.0*x0*4.0*97.0*xy^96.0-x0^2.0*12.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x01*192.0*xy^3.0-216.0*xy^17.0-x0^4.0*888.0*xy^73.0-x0^7.0*2956.5*xy^145.0+x0^10.0*x0*388.0*xy^96.0-x0^2.0*0.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x01*48.0*xy^4.0-12.0*xy^18.0-x0^4.0*12.0*xy^74.0-x0^7.0*20.25*xy^146.0+x0^10.0*x0*4.0*xy^97.0-x0^2.0*12.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x01*48.0/5.0*xy^5.0-12.0/19.0*xy^19.0-x0^4.0*12.0/75.0*xy^75.0-x0^7.0*20.25/147.0*xy^147.0+x0^10.0*x0*4.0/98.0*xy^98.0-x0^2.0*12.0*xy";
 UsageCalculus.EqnSolArrayMap4[1] = "x01*9.6*xy^5.0-0.631578947368421*xy^19.0-x0^4.0*0.16*xy^75.0-x0^7.0*0.1377551020408163*xy^147.0+x0^10.0*x0*0.04081632653061224*xy^98.0-x0^2.0*12.0*xy";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x01*192.0*xy^3.0-216.0*xy^17.0-x0^4.0*888.0*xy^73.0-x0^7.0*2956.5*xy^145.0+x0^10.0*x0*388.0*xy^96.0-x0^2.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x01*192.0*3.0*xy^2.0-216.0*17.0*xy^16.0-x0^4.0*888.0*73.0*xy^72.0-x0^7.0*2956.5*145.0*xy^144.0+x0^10.0*x0*388.0*96.0*xy^95.0-x0^2.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x01*576.0*xy^2.0-3672.0*xy^16.0-x0^4.0*64824.0*xy^72.0-x0^7.0*428692.5*xy^144.0+x0^10.0*x0*37248.0*xy^95.0-x0^2.0*0.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x01*9.6*xy^5.0-0.631578947368421*xy^19.0-x0^4.0*0.16*xy^75.0-x0^7.0*0.1377551020408163*xy^147.0+x0^10.0*x0*0.04081632653061224*xy^98.0-x0^2.0*12.0*xy";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x01*9.6/6.0*xy^6.0-0.631578947368421/20.0*xy^20.0-x0^4.0*0.16/76.0*xy^76.0-x0^7.0*0.1377551020408163/148.0*xy^148.0+x0^10.0*x0*0.04081632653061224/99.0*xy^99.0-x0^2.0*12.0/2.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x01*1.5999999999999999*xy^6.0-0.031578947368421054*xy^20.0-x0^4.0*0.002105263157894737*xy^76.0-x0^7.0*9.307777164920022E-4*xy^148.0+x0^10.0*x0*4.1228612657184083E-4*xy^99.0-x0^2.0*6.0*xy^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x01*576.0*xy^2.0-3672.0*xy^16.0-x0^4.0*64824.0*xy^72.0-x0^7.0*428692.5*xy^144.0+x0^10.0*x0*37248.0*xy^95.0-x0^2.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x01*576.0*2.0*xy^1.0-3672.0*16.0*xy^15.0-x0^4.0*64824.0*72.0*xy^71.0-x0^7.0*428692.5*144.0*xy^143.0+x0^10.0*x0*37248.0*95.0*xy^94.0-x0^2.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x01*1152.0*xy-58752.0*xy^15.0-x0^4.0*4667328.0*xy^71.0-x0^7.0*6.173172E7*xy^143.0+x0^10.0*x0*3538560.0*xy^94.0-x0^2.0*0.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x01*1.5999999999999999*xy^6.0-0.031578947368421054*xy^20.0-x0^4.0*0.002105263157894737*xy^76.0-x0^7.0*9.307777164920022E-4*xy^148.0-4.0*xy^148.0+x0^10.0*x0*4.1228612657184083E-4*xy^99.0-4.0*xy^99.0-x0^2.0*6.0*xy^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x01*1.5999999999999999/7.0*xy^7.0-0.031578947368421054/21.0*xy^21.0-x0^4.0*0.002105263157894737/77.0*xy^77.0-x0^7.0*9.307777164920022E-4/149.0*xy^149.0-4.0/149.0*xy^149.0+x0^10.0*x0*4.1228612657184083E-4/100.0*xy^100.0-4.0/100.0*xy^100.0-x0^2.0*6.0/3.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x01/4.375*xy^7.0-0.0015037593984962407*xy^21.0-x0^4.0*2.734107997265892E-5*xy^77.0-x0^7.0/160081.1851851852*xy^149.0-1.0/37.25*xy^149.0-0.026845637583892617*xy^149.0+x0^10.0*x0/242550.0*xy^100.0-1.0/25.0*xy^100.0-0.04*xy^100.0-x0^2.0*2.0*xy^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x01*1152.0*xy-58752.0*xy^15.0-x0^4.0*4667328.0*xy^71.0-x0^7.0*6.173172E7*xy^143.0+x0^10.0*x0*3538560.0*xy^94.0-x0^2.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x01*1152.0-58752.0*15.0*xy^14.0-x0^4.0*4667328.0*71.0*xy^70.0-x0^7.0*6.173172E7*143.0*xy^142.0+x0^10.0*x0*3538560.0*94.0*xy^93.0-x0^2.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x01*1152.0-881280.0*xy^14.0-x0^4.0*3.31380288E8*xy^70.0-x0^7.0*8.82763596E9*xy^142.0+x0^10.0*x0*3.3262464E8*xy^93.0-x0^2.0*0.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x01/4.375*xy^7.0-0.0015037593984962407*xy^21.0-x0^4.0*2.734107997265892E-5*xy^77.0-5.0*xy^77.0-x0^7.0/160081.1851851852*xy^149.0-1.0/37.25*xy^149.0-0.026845637583892617*xy^149.0+x0^10.0*x0/242550.0*xy^100.0-1.0/25.0*xy^100.0-0.04*xy^100.0-x0^2.0*2.0*xy^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x01/4.375/8.0*xy^8.0-0.0015037593984962407/22.0*xy^22.0-x0^4.0*2.734107997265892E-5/78.0*xy^78.0-5.0/78.0*xy^78.0-x0^7.0/160081.1851851852/150.0*xy^150.0-1.0/37.25/150.0*xy^150.0-0.026845637583892617/150.0*xy^150.0+x0^10.0*x0/242550.0/101.0*xy^101.0-1.0/25.0/101.0*xy^101.0-0.04/101.0*xy^101.0-x0^2.0*2.0/4.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x01/35.0*xy^8.0-6.835269993164731E-5*xy^22.0-x0^4.0/2852850.0*xy^78.0-1.0/15.6*xy^78.0-0.0641025641025641*xy^78.0-x0^7.0/2.401217777777778E7*xy^150.0-1.0/5587.5*xy^150.0-1.7897091722595077E-4*xy^150.0+x0^10.0*x0/2.449755E7*xy^101.0-1.0/2525.0*xy^101.0-3.9603960396039607E-4*xy^101.0-x0^2.0/2.0*xy^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131369() {
 UsageCalculus.TestCase = 131369;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xyz^2^2*+-3*xyz^3^3*4*xyz^1^4/1*xyz^2^5-3*xyz^3^3*4*xyz^1^4/1*xyz^2^54*x0^4/1*x0^51*xyz^2^5-3*xyz^3^6/-4*xyz^1^7*+1*xyz^2^8*-3*xyz^3^94*x0^7*+1*x0^8*-3*x0^91*xyz^2^8*-3*xyz^3^9-3*xyz^3^94*x0^10*-1*x0/--3*x0^2*+4*x0^31*xyz^2/--3*xyz^3^2*+4*xyz^1^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=368 EqnNumber=69 FamilyID=3 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[12, 69, 10, 12, 3, 1, 2, 5, 3, 4, 1, 1, 1, 2, 3, 2, 3, 2, 3, 2, 3, 6, 1, 2, 3, 1, 10, 2, 3, 8, 1, 3]"+
"// DOEMatrixRow=[4, 69, 18, 4, 2, 3, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 1, 10, 2, 3, 4, 3, 1, 5, 3, 2, 3, 1, 6, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "12.0*xyz^4.0-12.0*xyz^18.0-x0^4.0*12.0*xyz^74.0-x0^7.0*20.25*xyz^146.0+x0^10.0*x0*5.333333333333333*xyz^108.0-x0^2.0*16.0*xyz^11.0-12.0*xyz^9.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "12.0*4.0*xyz^3.0-12.0*18.0*xyz^17.0-x0^4.0*12.0*74.0*xyz^73.0-x0^7.0*20.25*146.0*xyz^145.0+x0^10.0*x0*5.333333333333333*108.0*xyz^107.0-x0^2.0*16.0*11.0*xyz^10.0-12.0*9.0*xyz^8.0";
 UsageCalculus.EqnSolArrayMap2[1] = "48.0*xyz^3.0-216.0*xyz^17.0-x0^4.0*888.0*xyz^73.0-x0^7.0*2956.5*xyz^145.0+x0^10.0*x0*576.0*xyz^107.0-x0^2.0*176.0*xyz^10.0-108.0*xyz^8.0";
 UsageCalculus.EqnSolArrayMap3[1] = "12.0*xyz^4.0-12.0*xyz^18.0-x0^4.0*12.0*xyz^74.0-x0^7.0*20.25*xyz^146.0+x0^10.0*x0*5.333333333333333*xyz^108.0-x0^2.0*16.0*xyz^11.0-12.0*xyz^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "12.0/5.0*xyz^5.0-12.0/19.0*xyz^19.0-x0^4.0*12.0/75.0*xyz^75.0-x0^7.0*20.25/147.0*xyz^147.0+x0^10.0*x0*5.333333333333333/109.0*xyz^109.0-x0^2.0*16.0/12.0*xyz^12.0-12.0/10.0*xyz^10.0";
 UsageCalculus.EqnSolArrayMap4[1] = "2.4*xyz^5.0-0.631578947368421*xyz^19.0-x0^4.0*0.16*xyz^75.0-x0^7.0*0.1377551020408163*xyz^147.0+x0^10.0*x0*0.04892966360856269*xyz^109.0-x0^2.0*1.3333333333333333*xyz^12.0-1.2*xyz^10.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "48.0*xyz^3.0-216.0*xyz^17.0-x0^4.0*888.0*xyz^73.0-x0^7.0*2956.5*xyz^145.0+x0^10.0*x0*576.0*xyz^107.0-x0^2.0*176.0*xyz^10.0-108.0*xyz^8.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "48.0*3.0*xyz^2.0-216.0*17.0*xyz^16.0-x0^4.0*888.0*73.0*xyz^72.0-x0^7.0*2956.5*145.0*xyz^144.0+x0^10.0*x0*576.0*107.0*xyz^106.0-x0^2.0*176.0*10.0*xyz^9.0-108.0*8.0*xyz^7.0";
 UsageCalculus.EqnSolArrayMap2[2] = "144.0*xyz^2.0-3672.0*xyz^16.0-x0^4.0*64824.0*xyz^72.0-x0^7.0*428692.5*xyz^144.0+x0^10.0*x0*61632.0*xyz^106.0-x0^2.0*1760.0*xyz^9.0-864.0*xyz^7.0";
 UsageCalculus.EqnSolArrayMap3[2] = "2.4*xyz^5.0-0.631578947368421*xyz^19.0-x0^4.0*0.16*xyz^75.0-x0^7.0*0.1377551020408163*xyz^147.0+x0^10.0*x0*0.04892966360856269*xyz^109.0-x0^2.0*1.3333333333333333*xyz^12.0-1.2*xyz^10.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "2.4/6.0*xyz^6.0-0.631578947368421/20.0*xyz^20.0-x0^4.0*0.16/76.0*xyz^76.0-x0^7.0*0.1377551020408163/148.0*xyz^148.0+x0^10.0*x0*0.04892966360856269/110.0*xyz^110.0-x0^2.0*1.3333333333333333/13.0*xyz^13.0-1.2/11.0*xyz^11.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/2.5*xyz^6.0-0.031578947368421054*xyz^20.0-x0^4.0*0.002105263157894737*xyz^76.0-x0^7.0*9.307777164920022E-4*xyz^148.0+x0^10.0*x0*4.448151237142063E-4*xyz^110.0-x0^2.0/9.75*xyz^13.0-1.0/9.166666666666668*xyz^11.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "144.0*xyz^2.0-3672.0*xyz^16.0-x0^4.0*64824.0*xyz^72.0-x0^7.0*428692.5*xyz^144.0+x0^10.0*x0*61632.0*xyz^106.0-x0^2.0*1760.0*xyz^9.0-864.0*xyz^7.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "144.0*2.0*xyz^1.0-3672.0*16.0*xyz^15.0-x0^4.0*64824.0*72.0*xyz^71.0-x0^7.0*428692.5*144.0*xyz^143.0+x0^10.0*x0*61632.0*106.0*xyz^105.0-x0^2.0*1760.0*9.0*xyz^8.0-864.0*7.0*xyz^6.0";
 UsageCalculus.EqnSolArrayMap2[3] = "288.0*xyz-58752.0*xyz^15.0-x0^4.0*4667328.0*xyz^71.0-x0^7.0*6.173172E7*xyz^143.0+x0^10.0*x0*6532992.0*xyz^105.0-x0^2.0*15840.0*xyz^8.0-6048.0*xyz^6.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/2.5*xyz^6.0-0.031578947368421054*xyz^20.0-x0^4.0*0.002105263157894737*xyz^76.0-x0^7.0*9.307777164920022E-4*xyz^148.0-4.0*xyz^148.0+x0^10.0*x0*4.448151237142063E-4*xyz^110.0-4.0*xyz^110.0-x0^2.0/9.75*xyz^13.0-1.0/9.166666666666668*xyz^11.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/2.5/7.0*xyz^7.0-0.031578947368421054/21.0*xyz^21.0-x0^4.0*0.002105263157894737/77.0*xyz^77.0-x0^7.0*9.307777164920022E-4/149.0*xyz^149.0-4.0/149.0*xyz^149.0+x0^10.0*x0*4.448151237142063E-4/111.0*xyz^111.0-4.0/111.0*xyz^111.0-x0^2.0/9.75/14.0*xyz^14.0-1.0/9.166666666666668/12.0*xyz^12.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/17.5*xyz^7.0-0.0015037593984962407*xyz^21.0-x0^4.0*2.734107997265892E-5*xyz^77.0-x0^7.0/160081.1851851852*xyz^149.0-1.0/37.25*xyz^149.0-0.026845637583892617*xyz^149.0+x0^10.0*x0/249541.875*xyz^111.0-1.0/27.75*xyz^111.0-0.036036036036036036*xyz^111.0-x0^2.0/136.5*xyz^14.0-1.0/110.00000000000001*xyz^12.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "288.0*xyz-58752.0*xyz^15.0-x0^4.0*4667328.0*xyz^71.0-x0^7.0*6.173172E7*xyz^143.0+x0^10.0*x0*6532992.0*xyz^105.0-x0^2.0*15840.0*xyz^8.0-6048.0*xyz^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "288.0-58752.0*15.0*xyz^14.0-x0^4.0*4667328.0*71.0*xyz^70.0-x0^7.0*6.173172E7*143.0*xyz^142.0+x0^10.0*x0*6532992.0*105.0*xyz^104.0-x0^2.0*15840.0*8.0*xyz^7.0-6048.0*6.0*xyz^5.0";
 UsageCalculus.EqnSolArrayMap2[4] = "288.0-881280.0*xyz^14.0-x0^4.0*3.31380288E8*xyz^70.0-x0^7.0*8.82763596E9*xyz^142.0+x0^10.0*x0*6.8596416E8*xyz^104.0-x0^2.0*126720.0*xyz^7.0-36288.0*xyz^5.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/17.5*xyz^7.0-0.0015037593984962407*xyz^21.0-x0^4.0*2.734107997265892E-5*xyz^77.0-5.0*xyz^77.0-x0^7.0/160081.1851851852*xyz^149.0-1.0/37.25*xyz^149.0-0.026845637583892617*xyz^149.0+x0^10.0*x0/249541.875*xyz^111.0-1.0/27.75*xyz^111.0-0.036036036036036036*xyz^111.0-x0^2.0/136.5*xyz^14.0-1.0/110.00000000000001*xyz^12.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/17.5/8.0*xyz^8.0-0.0015037593984962407/22.0*xyz^22.0-x0^4.0*2.734107997265892E-5/78.0*xyz^78.0-5.0/78.0*xyz^78.0-x0^7.0/160081.1851851852/150.0*xyz^150.0-1.0/37.25/150.0*xyz^150.0-0.026845637583892617/150.0*xyz^150.0+x0^10.0*x0/249541.875/112.0*xyz^112.0-1.0/27.75/112.0*xyz^112.0-0.036036036036036036/112.0*xyz^112.0-x0^2.0/136.5/15.0*xyz^15.0-1.0/110.00000000000001/13.0*xyz^13.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/140.0*xyz^8.0-6.835269993164731E-5*xyz^22.0-x0^4.0/2852850.0*xyz^78.0-1.0/15.6*xyz^78.0-0.0641025641025641*xyz^78.0-x0^7.0/2.401217777777778E7*xyz^150.0-1.0/5587.5*xyz^150.0-1.7897091722595077E-4*xyz^150.0+x0^10.0*x0/2.794869E7*xyz^112.0-1.0/3108.0*xyz^112.0-3.2175032175032174E-4*xyz^112.0-x0^2.0/2047.5*xyz^15.0-1.0/1430.0000000000002*xyz^13.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131370() {
 UsageCalculus.TestCase = 131370;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xyza^3^3*4*xyza^1^4/1*xyza^2^54*x0^4/1*x0^51*xyza^2^5-3*xyza^3^6/-4*xyza^1^7*+1*xyza^2^8*-3*xyza^3^94*x0^7*+1*x0^8*-3*x0^91*xyza^2^8*-3*xyza^3^9-3*xyza^3^94*x0^10*-1*x0/--3*x0^2*+4*x0^31*xyza^2/--3*xyza^3^2*+4*xyza^1^3-3*xyza^3^2*+4*xyza^1^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=369 EqnNumber=70 FamilyID=1 MotifTag=2 Entropy=4 FuncWrapAliasID=2"+
"// MetaRow=[12, 70, 10, 11, 4, 2, 3, 6, 1, 1, 2, 1, 2, 3, 4, 3, 1, 1, 4, 3, 4, 7, 2, 3, 1, 2, 11, 3, 4, 9, 2, 4]"+
"// DOEMatrixRow=[4, 70, 18, 3, 1, 1, 2, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 2, 1, 3, 1, 5, 1, 2, 6, 4, 3, 1, 2, 7, 1]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^4.0*12.0*xyza^74.0-x0^7.0*20.25*xyza^146.0+x0^10.0*x0*5.333333333333333*xyza^108.0-x0^2.0*16.0*xyza^11.0-12.0*xyza^9.0-12.0*xyza^9.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^4.0*12.0*74.0*xyza^73.0-x0^7.0*20.25*146.0*xyza^145.0+x0^10.0*x0*5.333333333333333*108.0*xyza^107.0-x0^2.0*16.0*11.0*xyza^10.0-12.0*9.0*xyza^8.0-12.0*9.0*xyza^8.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^4.0*888.0*xyza^73.0-x0^7.0*2956.5*xyza^145.0+x0^10.0*x0*576.0*xyza^107.0-x0^2.0*176.0*xyza^10.0-108.0*xyza^8.0-108.0*xyza^8.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^4.0*12.0*xyza^74.0-x0^7.0*20.25*xyza^146.0+x0^10.0*x0*5.333333333333333*xyza^108.0-x0^2.0*16.0*xyza^11.0-12.0*xyza^9.0-12.0*xyza^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^4.0*12.0/75.0*xyza^75.0-x0^7.0*20.25/147.0*xyza^147.0+x0^10.0*x0*5.333333333333333/109.0*xyza^109.0-x0^2.0*16.0/12.0*xyza^12.0-12.0/10.0*xyza^10.0-12.0/10.0*xyza^10.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^4.0*0.16*xyza^75.0-x0^7.0*0.1377551020408163*xyza^147.0+x0^10.0*x0*0.04892966360856269*xyza^109.0-x0^2.0*1.3333333333333333*xyza^12.0-1.2*xyza^10.0-1.2*xyza^10.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^4.0*888.0*xyza^73.0-x0^7.0*2956.5*xyza^145.0+x0^10.0*x0*576.0*xyza^107.0-x0^2.0*176.0*xyza^10.0-108.0*xyza^8.0-108.0*xyza^8.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^4.0*888.0*73.0*xyza^72.0-x0^7.0*2956.5*145.0*xyza^144.0+x0^10.0*x0*576.0*107.0*xyza^106.0-x0^2.0*176.0*10.0*xyza^9.0-108.0*8.0*xyza^7.0-108.0*8.0*xyza^7.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^4.0*64824.0*xyza^72.0-x0^7.0*428692.5*xyza^144.0+x0^10.0*x0*61632.0*xyza^106.0-x0^2.0*1760.0*xyza^9.0-864.0*xyza^7.0-864.0*xyza^7.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^4.0*0.16*xyza^75.0-x0^7.0*0.1377551020408163*xyza^147.0+x0^10.0*x0*0.04892966360856269*xyza^109.0-x0^2.0*1.3333333333333333*xyza^12.0-1.2*xyza^10.0-1.2*xyza^10.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^4.0*0.16/76.0*xyza^76.0-x0^7.0*0.1377551020408163/148.0*xyza^148.0+x0^10.0*x0*0.04892966360856269/110.0*xyza^110.0-x0^2.0*1.3333333333333333/13.0*xyza^13.0-1.2/11.0*xyza^11.0-1.2/11.0*xyza^11.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^4.0*0.002105263157894737*xyza^76.0-x0^7.0*9.307777164920022E-4*xyza^148.0+x0^10.0*x0*4.448151237142063E-4*xyza^110.0-x0^2.0/9.75*xyza^13.0-1.0/9.166666666666668*xyza^11.0-1.0/9.166666666666668*xyza^11.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^4.0*64824.0*xyza^72.0-x0^7.0*428692.5*xyza^144.0+x0^10.0*x0*61632.0*xyza^106.0-x0^2.0*1760.0*xyza^9.0-864.0*xyza^7.0-864.0*xyza^7.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^4.0*64824.0*72.0*xyza^71.0-x0^7.0*428692.5*144.0*xyza^143.0+x0^10.0*x0*61632.0*106.0*xyza^105.0-x0^2.0*1760.0*9.0*xyza^8.0-864.0*7.0*xyza^6.0-864.0*7.0*xyza^6.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^4.0*4667328.0*xyza^71.0-x0^7.0*6.173172E7*xyza^143.0+x0^10.0*x0*6532992.0*xyza^105.0-x0^2.0*15840.0*xyza^8.0-6048.0*xyza^6.0-6048.0*xyza^6.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^4.0*0.002105263157894737*xyza^76.0-x0^7.0*9.307777164920022E-4*xyza^148.0-4.0*xyza^148.0+x0^10.0*x0*4.448151237142063E-4*xyza^110.0-4.0*xyza^110.0-x0^2.0/9.75*xyza^13.0-1.0/9.166666666666668*xyza^11.0-1.0/9.166666666666668*xyza^11.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^4.0*0.002105263157894737/77.0*xyza^77.0-x0^7.0*9.307777164920022E-4/149.0*xyza^149.0-4.0/149.0*xyza^149.0+x0^10.0*x0*4.448151237142063E-4/111.0*xyza^111.0-4.0/111.0*xyza^111.0-x0^2.0/9.75/14.0*xyza^14.0-1.0/9.166666666666668/12.0*xyza^12.0-1.0/9.166666666666668/12.0*xyza^12.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^4.0*2.734107997265892E-5*xyza^77.0-x0^7.0/160081.1851851852*xyza^149.0-1.0/37.25*xyza^149.0-0.026845637583892617*xyza^149.0+x0^10.0*x0/249541.875*xyza^111.0-1.0/27.75*xyza^111.0-0.036036036036036036*xyza^111.0-x0^2.0/136.5*xyza^14.0-1.0/110.00000000000001*xyza^12.0-1.0/110.00000000000001*xyza^12.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^4.0*4667328.0*xyza^71.0-x0^7.0*6.173172E7*xyza^143.0+x0^10.0*x0*6532992.0*xyza^105.0-x0^2.0*15840.0*xyza^8.0-6048.0*xyza^6.0-6048.0*xyza^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^4.0*4667328.0*71.0*xyza^70.0-x0^7.0*6.173172E7*143.0*xyza^142.0+x0^10.0*x0*6532992.0*105.0*xyza^104.0-x0^2.0*15840.0*8.0*xyza^7.0-6048.0*6.0*xyza^5.0-6048.0*6.0*xyza^5.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^4.0*3.31380288E8*xyza^70.0-x0^7.0*8.82763596E9*xyza^142.0+x0^10.0*x0*6.8596416E8*xyza^104.0-x0^2.0*126720.0*xyza^7.0-36288.0*xyza^5.0-36288.0*xyza^5.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^4.0*2.734107997265892E-5*xyza^77.0-5.0*xyza^77.0-x0^7.0/160081.1851851852*xyza^149.0-1.0/37.25*xyza^149.0-0.026845637583892617*xyza^149.0+x0^10.0*x0/249541.875*xyza^111.0-1.0/27.75*xyza^111.0-0.036036036036036036*xyza^111.0-x0^2.0/136.5*xyza^14.0-1.0/110.00000000000001*xyza^12.0-1.0/110.00000000000001*xyza^12.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^4.0*2.734107997265892E-5/78.0*xyza^78.0-5.0/78.0*xyza^78.0-x0^7.0/160081.1851851852/150.0*xyza^150.0-1.0/37.25/150.0*xyza^150.0-0.026845637583892617/150.0*xyza^150.0+x0^10.0*x0/249541.875/112.0*xyza^112.0-1.0/27.75/112.0*xyza^112.0-0.036036036036036036/112.0*xyza^112.0-x0^2.0/136.5/15.0*xyza^15.0-1.0/110.00000000000001/13.0*xyza^13.0-1.0/110.00000000000001/13.0*xyza^13.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^4.0/2852850.0*xyza^78.0-1.0/15.6*xyza^78.0-0.0641025641025641*xyza^78.0-x0^7.0/2.401217777777778E7*xyza^150.0-1.0/5587.5*xyza^150.0-1.7897091722595077E-4*xyza^150.0+x0^10.0*x0/2.794869E7*xyza^112.0-1.0/3108.0*xyza^112.0-3.2175032175032174E-4*xyza^112.0-x0^2.0/2047.5*xyza^15.0-1.0/1430.0000000000002*xyza^13.0-1.0/1430.0000000000002*xyza^13.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131371() {
 UsageCalculus.TestCase = 131371;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "4*x0^4/1*x0^51*x^2^5-3*x^3^6/-4*x^1^7*+1*x^2^8*-3*x^3^94*x0^7*+1*x0^8*-3*x0^91*x^2^8*-3*x^3^9-3*x^3^94*x0^10*-1*x0/--3*x0^2*+4*x0^31*x^2/--3*x^3^2*+4*x^1^3-3*x^3^2*+4*x^1^34*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=370 EqnNumber=71 FamilyID=2 MotifTag=3 Entropy=1 FuncWrapAliasID=3"+
"// MetaRow=[12, 71, 10, 10, 1, 3, 1, 7, 2, 3, 4, 2, 3, 1, 1, 1, 2, 1, 5, 1, 1, 8, 3, 1, 2, 3, 12, 1, 1, 10, 3, 5]"+
"// DOEMatrixRow=[4, 71, 18, 2, 1, 2, 3, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 3, 2, 1, 2, 1, 2, 3, 1, 1, 1, 2, 3, 8, 2]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "4.0*x^7.0-20.25*x^146.0+5.333333333333333*x^108.0-16.0*x^11.0-12.0*x^9.0-12.0*x^40.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "4.0*7.0*x^6.0-20.25*146.0*x^145.0+5.333333333333333*108.0*x^107.0-16.0*11.0*x^10.0-12.0*9.0*x^8.0-12.0*40.0*x^39.0";
 UsageCalculus.EqnSolArrayMap2[1] = "28.0*x^6.0-2956.5*x^145.0+576.0*x^107.0-176.0*x^10.0-108.0*x^8.0-480.0*x^39.0";
 UsageCalculus.EqnSolArrayMap3[1] = "4.0*x^7.0-20.25*x^146.0+5.333333333333333*x^108.0-16.0*x^11.0-12.0*x^9.0-12.0*x^40.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "4.0/8.0*x^8.0-20.25/147.0*x^147.0+5.333333333333333/109.0*x^109.0-16.0/12.0*x^12.0-12.0/10.0*x^10.0-12.0/41.0*x^41.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/2.0*x^8.0-1.0/7.2592592592592595*x^147.0+1.0/20.4375*x^109.0-1.3333333333333333*x^12.0-1.2*x^10.0-1.0/3.4166666666666665*x^41.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "28.0*x^6.0-2956.5*x^145.0+576.0*x^107.0-176.0*x^10.0-108.0*x^8.0-480.0*x^39.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "28.0*6.0*x^5.0-2956.5*145.0*x^144.0+576.0*107.0*x^106.0-176.0*10.0*x^9.0-108.0*8.0*x^7.0-480.0*39.0*x^38.0";
 UsageCalculus.EqnSolArrayMap2[2] = "168.0*x^5.0-428692.5*x^144.0+61632.0*x^106.0-1760.0*x^9.0-864.0*x^7.0-18720.0*x^38.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/2.0*x^8.0-1.0/7.2592592592592595*x^147.0+1.0/20.4375*x^109.0-1.3333333333333333*x^12.0-1.2*x^10.0-1.0/3.4166666666666665*x^41.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/2.0/9.0*x^9.0-1.0/7.2592592592592595/148.0*x^148.0+1.0/20.4375/110.0*x^110.0-1.3333333333333333/13.0*x^13.0-1.2/11.0*x^11.0-1.0/3.4166666666666665/42.0*x^42.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/18.0*x^9.0-1.0/1074.3703703703704*x^148.0+1.0/2248.125*x^110.0-1.0/9.75*x^13.0-1.0/9.166666666666668*x^11.0-1.0/143.5*x^42.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "168.0*x^5.0-428692.5*x^144.0+61632.0*x^106.0-1760.0*x^9.0-864.0*x^7.0-18720.0*x^38.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "168.0*5.0*x^4.0-428692.5*144.0*x^143.0+61632.0*106.0*x^105.0-1760.0*9.0*x^8.0-864.0*7.0*x^6.0-18720.0*38.0*x^37.0";
 UsageCalculus.EqnSolArrayMap2[3] = "840.0*x^4.0-6.173172E7*x^143.0+6532992.0*x^105.0-15840.0*x^8.0-6048.0*x^6.0-711360.0*x^37.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/18.0*x^9.0-1.0/1074.3703703703704*x^148.0+1.0/2248.125*x^110.0-1.0/9.75*x^13.0-1.0/9.166666666666668*x^11.0-1.0/143.5*x^42.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/18.0/10.0*x^10.0-1.0/1074.3703703703704/149.0*x^149.0+1.0/2248.125/111.0*x^111.0-1.0/9.75/14.0*x^14.0-1.0/9.166666666666668/12.0*x^12.0-1.0/143.5/43.0*x^43.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/180.0*x^10.0-1.0/160081.1851851852*x^149.0+1.0/249541.875*x^111.0-1.0/136.5*x^14.0-1.0/110.00000000000001*x^12.0-1.0/6170.5*x^43.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "840.0*x^4.0-6.173172E7*x^143.0+6532992.0*x^105.0-15840.0*x^8.0-6048.0*x^6.0-711360.0*x^37.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "840.0*4.0*x^3.0-143.0*x^142.0+6532992.0*105.0*x^104.0-15840.0*8.0*x^7.0-6048.0*6.0*x^5.0-711360.0*37.0*x^36.0";
 UsageCalculus.EqnSolArrayMap2[4] = "3360.0*x^3.0-143.0*x^142.0+6.8596416E8*x^104.0-126720.0*x^7.0-36288.0*x^5.0-2.632032E7*x^36.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/180.0*x^10.0-1.0/160081.1851851852*x^149.0+1.0/249541.875*x^111.0-1.0/136.5*x^14.0-1.0/110.00000000000001*x^12.0-1.0/6170.5*x^43.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/180.0/11.0*x^11.0-1.0/160081.1851851852/150.0*x^150.0+1.0/249541.875/112.0*x^112.0-1.0/136.5/15.0*x^15.0-1.0/110.00000000000001/13.0*x^13.0-1.0/6170.5/44.0*x^44.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/1980.0*x^11.0-1.0/2.401217777777778E7*x^150.0+1.0/2.794869E7*x^112.0-1.0/2047.5*x^15.0-1.0/1430.0000000000002*x^13.0-1.0/271502.0*x^44.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131372() {
 UsageCalculus.TestCase = 131372;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xy^2^5-3*xy^3^6/-4*xy^1^7*+1*xy^2^8*-3*xy^3^94*x0^7*+1*x0^8*-3*x0^91*xy^2^8*-3*xy^3^9-3*xy^3^94*x0^10*-1*x0/--3*x0^2*+4*x0^31*xy^2/--3*xy^3^2*+4*xy^1^3-3*xy^3^2*+4*xy^1^34*x0^31*xy^2^4*--3*xy^3^5/-4*xy^1^6*+1*xy^2^7";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=371 EqnNumber=72 FamilyID=3 MotifTag=4 Entropy=3 FuncWrapAliasID=4"+
"// MetaRow=[12, 72, 10, 9, 2, 1, 2, 8, 3, 4, 1, 1, 1, 2, 3, 2, 3, 2, 1, 2, 3, 9, 1, 2, 3, 4, 13, 2, 3, 11, 4, 6]"+
"// DOEMatrixRow=[4, 72, 18, 1, 2, 3, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 4, 3, 2, 3, 2, 3, 1, 2, 3, 2, 3, 4, 9, 1]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "xy^7.0-x0^7.0*20.25*xy^146.0+x0^10.0*x0*5.333333333333333*xy^108.0-x0^2.0*16.0*xy^11.0-12.0*xy^9.0-x0^31.0*9.0*xy^70.0+1.0/1.3333333333333333*xy^24.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "7.0*xy^6.0-x0^7.0*20.25*146.0*xy^145.0+x0^10.0*x0*5.333333333333333*108.0*xy^107.0-x0^2.0*16.0*11.0*xy^10.0-12.0*9.0*xy^8.0-x0^31.0*9.0*70.0*xy^69.0+1.0/1.3333333333333333*24.0*xy^23.0";
 UsageCalculus.EqnSolArrayMap2[1] = "7.0*xy^6.0-x0^7.0*2956.5*xy^145.0+x0^10.0*x0*576.0*xy^107.0-x0^2.0*176.0*xy^10.0-108.0*xy^8.0-x0^31.0*630.0*xy^69.0+18.0*xy^23.0";
 UsageCalculus.EqnSolArrayMap3[1] = "xy^7.0-x0^7.0*20.25*xy^146.0+x0^10.0*x0*5.333333333333333*xy^108.0-x0^2.0*16.0*xy^11.0-12.0*xy^9.0-x0^31.0*9.0*xy^70.0+1.0/1.3333333333333333*xy^24.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0/8.0*xy^8.0-x0^7.0*20.25/147.0*xy^147.0+x0^10.0*x0*5.333333333333333/109.0*xy^109.0-x0^2.0*16.0/12.0*xy^12.0-12.0/10.0*xy^10.0-x0^31.0*9.0/71.0*xy^71.0+1.0/1.3333333333333333/25.0*xy^25.0";
 UsageCalculus.EqnSolArrayMap4[1] = "0.125*xy^8.0-x0^7.0*0.1377551020408163*xy^147.0+x0^10.0*x0*0.04892966360856269*xy^109.0-x0^2.0*1.3333333333333333*xy^12.0-1.2*xy^10.0-x0^31.0/7.888888888888889*xy^71.0+1.0/33.33333333333333*xy^25.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "7.0*xy^6.0-x0^7.0*2956.5*xy^145.0+x0^10.0*x0*576.0*xy^107.0-x0^2.0*176.0*xy^10.0-108.0*xy^8.0-x0^31.0*630.0*xy^69.0+18.0*xy^23.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "7.0*6.0*xy^5.0-x0^7.0*2956.5*145.0*xy^144.0+x0^10.0*x0*576.0*107.0*xy^106.0-x0^2.0*176.0*10.0*xy^9.0-108.0*8.0*xy^7.0-x0^31.0*630.0*69.0*xy^68.0+18.0*23.0*xy^22.0";
 UsageCalculus.EqnSolArrayMap2[2] = "42.0*xy^5.0-x0^7.0*428692.5*xy^144.0+x0^10.0*x0*61632.0*xy^106.0-x0^2.0*1760.0*xy^9.0-864.0*xy^7.0-x0^31.0*43470.0*xy^68.0+414.0*xy^22.0";
 UsageCalculus.EqnSolArrayMap3[2] = "0.125*xy^8.0-x0^7.0*0.1377551020408163*xy^147.0+x0^10.0*x0*0.04892966360856269*xy^109.0-x0^2.0*1.3333333333333333*xy^12.0-1.2*xy^10.0-x0^31.0/7.888888888888889*xy^71.0+1.0/33.33333333333333*xy^25.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "0.125/9.0*xy^9.0-x0^7.0*0.1377551020408163/148.0*xy^148.0+x0^10.0*x0*0.04892966360856269/110.0*xy^110.0-x0^2.0*1.3333333333333333/13.0*xy^13.0-1.2/11.0*xy^11.0-x0^31.0/7.888888888888889/72.0*xy^72.0+1.0/33.33333333333333/26.0*xy^26.0";
 UsageCalculus.EqnSolArrayMap4[2] = "0.013888888888888888*xy^9.0-x0^7.0*9.307777164920022E-4*xy^148.0+x0^10.0*x0*4.448151237142063E-4*xy^110.0-x0^2.0/9.75*xy^13.0-0.10909090909090909*xy^11.0-x0^31.0/568.0*xy^72.0+1.0/866.6666666666665*xy^26.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "42.0*xy^5.0-x0^7.0*428692.5*xy^144.0+x0^10.0*x0*61632.0*xy^106.0-x0^2.0*1760.0*xy^9.0-864.0*xy^7.0-x0^31.0*43470.0*xy^68.0+414.0*xy^22.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "42.0*5.0*xy^4.0-x0^7.0*428692.5*144.0*xy^143.0+x0^10.0*x0*61632.0*106.0*xy^105.0-x0^2.0*1760.0*9.0*xy^8.0-864.0*7.0*xy^6.0-x0^31.0*43470.0*68.0*xy^67.0+414.0*22.0*xy^21.0";
 UsageCalculus.EqnSolArrayMap2[3] = "210.0*xy^4.0-x0^7.0*6.173172E7*xy^143.0+x0^10.0*x0*6532992.0*xy^105.0-x0^2.0*15840.0*xy^8.0-6048.0*xy^6.0-x0^31.0*2955960.0*xy^67.0+9108.0*xy^21.0";
 UsageCalculus.EqnSolArrayMap3[3] = "0.013888888888888888*xy^9.0-x0^7.0*9.307777164920022E-4*xy^148.0-4.0*xy^148.0+x0^10.0*x0*4.448151237142063E-4*xy^110.0-4.0*xy^110.0-x0^2.0/9.75*xy^13.0-0.10909090909090909*xy^11.0-x0^31.0/568.0*xy^72.0+1.0/866.6666666666665*xy^26.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "0.013888888888888888/10.0*xy^10.0-x0^7.0*9.307777164920022E-4/149.0*xy^149.0-4.0/149.0*xy^149.0+x0^10.0*x0*4.448151237142063E-4/111.0*xy^111.0-4.0/111.0*xy^111.0-x0^2.0/9.75/14.0*xy^14.0-0.10909090909090909/12.0*xy^12.0-x0^31.0/568.0/73.0*xy^73.0+1.0/866.6666666666665/27.0*xy^27.0";
 UsageCalculus.EqnSolArrayMap4[3] = "0.0013888888888888887*xy^10.0-x0^7.0/160081.1851851852*xy^149.0-1.0/37.25*xy^149.0-0.026845637583892617*xy^149.0+x0^10.0*x0/249541.875*xy^111.0-1.0/27.75*xy^111.0-0.036036036036036036*xy^111.0-x0^2.0/136.5*xy^14.0-0.00909090909090909*xy^12.0-x0^31.0/41464.0*xy^73.0+1.0/23399.999999999996*xy^27.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "210.0*xy^4.0-x0^7.0*6.173172E7*xy^143.0+x0^10.0*x0*6532992.0*xy^105.0-x0^2.0*15840.0*xy^8.0-6048.0*xy^6.0-x0^31.0*2955960.0*xy^67.0+9108.0*xy^21.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "210.0*4.0*xy^3.0-x0^7.0*6.173172E7*143.0*xy^142.0+x0^10.0*x0*6532992.0*105.0*xy^104.0-x0^2.0*15840.0*8.0*xy^7.0-6048.0*6.0*xy^5.0-x0^31.0*2955960.0*67.0*xy^66.0+9108.0*21.0*xy^20.0";
 UsageCalculus.EqnSolArrayMap2[4] = "840.0*xy^3.0-x0^7.0*8.82763596E9*xy^142.0+x0^10.0*x0*6.8596416E8*xy^104.0-x0^2.0*126720.0*xy^7.0-36288.0*xy^5.0-x0^31.0*1.9804932E8*xy^66.0+191268.0*xy^20.0";
 UsageCalculus.EqnSolArrayMap3[4] = "0.0013888888888888887*xy^10.0-x0^7.0/160081.1851851852*xy^149.0-1.0/37.25*xy^149.0-0.026845637583892617*xy^149.0+x0^10.0*x0/249541.875*xy^111.0-1.0/27.75*xy^111.0-0.036036036036036036*xy^111.0-x0^2.0/136.5*xy^14.0-0.00909090909090909*xy^12.0-x0^31.0/41464.0*xy^73.0+1.0/23399.999999999996*xy^27.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "0.0013888888888888887/11.0*xy^11.0-x0^7.0/160081.1851851852/150.0*xy^150.0-1.0/37.25/150.0*xy^150.0-0.026845637583892617/150.0*xy^150.0+x0^10.0*x0/249541.875/112.0*xy^112.0-1.0/27.75/112.0*xy^112.0-0.036036036036036036/112.0*xy^112.0-x0^2.0/136.5/15.0*xy^15.0-0.00909090909090909/13.0*xy^13.0-x0^31.0/41464.0/74.0*xy^74.0+1.0/23399.999999999996/28.0*xy^28.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.2626262626262624E-4*xy^11.0-x0^7.0/2.401217777777778E7*xy^150.0-1.0/5587.5*xy^150.0-1.7897091722595077E-4*xy^150.0+x0^10.0*x0/2.794869E7*xy^112.0-1.0/3108.0*xy^112.0-3.2175032175032174E-4*xy^112.0-x0^2.0/2047.5*xy^15.0-6.993006993006993E-4*xy^13.0-x0^31.0/3068336.0*xy^74.0+1.0/655199.9999999999*xy^28.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131373() {
 UsageCalculus.TestCase = 131373;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xyz^3^6/-4*xyz^1^7*+1*xyz^2^8*-3*xyz^3^94*x0^7*+1*x0^8*-3*x0^91*xyz^2^8*-3*xyz^3^9-3*xyz^3^94*x0^10*-1*x0/--3*x0^2*+4*x0^31*xyz^2/--3*xyz^3^2*+4*xyz^1^3-3*xyz^3^2*+4*xyz^1^34*x0^31*xyz^2^4*--3*xyz^3^5/-4*xyz^1^6*+1*xyz^2^7-3*xyz^3^5/-4*xyz^1^6*+1*xyz^2^7";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=372 EqnNumber=73 FamilyID=1 MotifTag=1 Entropy=4 FuncWrapAliasID=1"+
"// MetaRow=[12, 73, 10, 8, 3, 2, 3, 9, 1, 1, 2, 1, 2, 3, 4, 3, 1, 1, 2, 3, 4, 10, 2, 3, 1, 1, 14, 3, 4, 12, 1, 7]"+
"// DOEMatrixRow=[4, 73, 18, 4, 2, 1, 2, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 5, 4, 3, 1, 3, 1, 2, 3, 4, 3, 1, 1, 10, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^7.0*20.25*xyz^146.0+x0^10.0*x0*5.333333333333333*xyz^108.0-x0^2.0*16.0*xyz^11.0-12.0*xyz^9.0-x0^31.0*9.0*xyz^70.0+1.0/1.3333333333333333*xyz^24.0+1.0/1.3333333333333333*xyz^24.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^7.0*20.25*146.0*xyz^145.0+x0^10.0*x0*5.333333333333333*108.0*xyz^107.0-x0^2.0*16.0*11.0*xyz^10.0-12.0*9.0*xyz^8.0-x0^31.0*9.0*70.0*xyz^69.0+1.0/1.3333333333333333*24.0*xyz^23.0+1.0/1.3333333333333333*24.0*xyz^23.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^7.0*2956.5*xyz^145.0+x0^10.0*x0*576.0*xyz^107.0-x0^2.0*176.0*xyz^10.0-108.0*xyz^8.0-x0^31.0*630.0*xyz^69.0+18.0*xyz^23.0+18.0*xyz^23.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^7.0*20.25*xyz^146.0+x0^10.0*x0*5.333333333333333*xyz^108.0-x0^2.0*16.0*xyz^11.0-12.0*xyz^9.0-x0^31.0*9.0*xyz^70.0+1.0/1.3333333333333333*xyz^24.0+1.0/1.3333333333333333*xyz^24.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^7.0*20.25/147.0*xyz^147.0+x0^10.0*x0*5.333333333333333/109.0*xyz^109.0-x0^2.0*16.0/12.0*xyz^12.0-12.0/10.0*xyz^10.0-x0^31.0*9.0/71.0*xyz^71.0+1.0/1.3333333333333333/25.0*xyz^25.0+1.0/1.3333333333333333/25.0*xyz^25.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^7.0*0.1377551020408163*xyz^147.0+x0^10.0*x0*0.04892966360856269*xyz^109.0-x0^2.0*1.3333333333333333*xyz^12.0-1.2*xyz^10.0-x0^31.0/7.888888888888889*xyz^71.0+1.0/33.33333333333333*xyz^25.0+1.0/33.33333333333333*xyz^25.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^7.0*2956.5*xyz^145.0+x0^10.0*x0*576.0*xyz^107.0-x0^2.0*176.0*xyz^10.0-108.0*xyz^8.0-x0^31.0*630.0*xyz^69.0+18.0*xyz^23.0+18.0*xyz^23.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^7.0*2956.5*145.0*xyz^144.0+x0^10.0*x0*576.0*107.0*xyz^106.0-x0^2.0*176.0*10.0*xyz^9.0-108.0*8.0*xyz^7.0-x0^31.0*630.0*69.0*xyz^68.0+18.0*23.0*xyz^22.0+18.0*23.0*xyz^22.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^7.0*428692.5*xyz^144.0+x0^10.0*x0*61632.0*xyz^106.0-x0^2.0*1760.0*xyz^9.0-864.0*xyz^7.0-x0^31.0*43470.0*xyz^68.0+414.0*xyz^22.0+414.0*xyz^22.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^7.0*0.1377551020408163*xyz^147.0+x0^10.0*x0*0.04892966360856269*xyz^109.0-x0^2.0*1.3333333333333333*xyz^12.0-1.2*xyz^10.0-x0^31.0/7.888888888888889*xyz^71.0+1.0/33.33333333333333*xyz^25.0+1.0/33.33333333333333*xyz^25.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^7.0*0.1377551020408163/148.0*xyz^148.0+x0^10.0*x0*0.04892966360856269/110.0*xyz^110.0-x0^2.0*1.3333333333333333/13.0*xyz^13.0-1.2/11.0*xyz^11.0-x0^31.0/7.888888888888889/72.0*xyz^72.0+1.0/33.33333333333333/26.0*xyz^26.0+1.0/33.33333333333333/26.0*xyz^26.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^7.0*9.307777164920022E-4*xyz^148.0+x0^10.0*x0*4.448151237142063E-4*xyz^110.0-x0^2.0/9.75*xyz^13.0-0.10909090909090909*xyz^11.0-x0^31.0/568.0*xyz^72.0+1.0/866.6666666666665*xyz^26.0+1.0/866.6666666666665*xyz^26.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^7.0*428692.5*xyz^144.0+x0^10.0*x0*61632.0*xyz^106.0-x0^2.0*1760.0*xyz^9.0-864.0*xyz^7.0-x0^31.0*43470.0*xyz^68.0+414.0*xyz^22.0+414.0*xyz^22.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^7.0*428692.5*144.0*xyz^143.0+x0^10.0*x0*61632.0*106.0*xyz^105.0-x0^2.0*1760.0*9.0*xyz^8.0-864.0*7.0*xyz^6.0-x0^31.0*43470.0*68.0*xyz^67.0+414.0*22.0*xyz^21.0+414.0*22.0*xyz^21.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^7.0*6.173172E7*xyz^143.0+x0^10.0*x0*6532992.0*xyz^105.0-x0^2.0*15840.0*xyz^8.0-6048.0*xyz^6.0-x0^31.0*2955960.0*xyz^67.0+9108.0*xyz^21.0+9108.0*xyz^21.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^7.0*9.307777164920022E-4*xyz^148.0-4.0*xyz^148.0+x0^10.0*x0*4.448151237142063E-4*xyz^110.0-4.0*xyz^110.0-x0^2.0/9.75*xyz^13.0-0.10909090909090909*xyz^11.0-x0^31.0/568.0*xyz^72.0+1.0/866.6666666666665*xyz^26.0+1.0/866.6666666666665*xyz^26.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^7.0*9.307777164920022E-4/149.0*xyz^149.0-4.0/149.0*xyz^149.0+x0^10.0*x0*4.448151237142063E-4/111.0*xyz^111.0-4.0/111.0*xyz^111.0-x0^2.0/9.75/14.0*xyz^14.0-0.10909090909090909/12.0*xyz^12.0-x0^31.0/568.0/73.0*xyz^73.0+1.0/866.6666666666665/27.0*xyz^27.0+1.0/866.6666666666665/27.0*xyz^27.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^7.0/160081.1851851852*xyz^149.0-1.0/37.25*xyz^149.0-0.026845637583892617*xyz^149.0+x0^10.0*x0/249541.875*xyz^111.0-1.0/27.75*xyz^111.0-0.036036036036036036*xyz^111.0-x0^2.0/136.5*xyz^14.0-0.00909090909090909*xyz^12.0-x0^31.0/41464.0*xyz^73.0+1.0/23399.999999999996*xyz^27.0+1.0/23399.999999999996*xyz^27.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^7.0*6.173172E7*xyz^143.0+x0^10.0*x0*6532992.0*xyz^105.0-x0^2.0*15840.0*xyz^8.0-6048.0*xyz^6.0-x0^31.0*2955960.0*xyz^67.0+9108.0*xyz^21.0+9108.0*xyz^21.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^7.0*6.173172E7*143.0*xyz^142.0+x0^10.0*x0*6532992.0*105.0*xyz^104.0-x0^2.0*15840.0*8.0*xyz^7.0-6048.0*6.0*xyz^5.0-x0^31.0*2955960.0*67.0*xyz^66.0+9108.0*21.0*xyz^20.0+9108.0*21.0*xyz^20.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^7.0*8.82763596E9*xyz^142.0+x0^10.0*x0*6.8596416E8*xyz^104.0-x0^2.0*126720.0*xyz^7.0-36288.0*xyz^5.0-x0^31.0*1.9804932E8*xyz^66.0+191268.0*xyz^20.0+191268.0*xyz^20.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^7.0/160081.1851851852*xyz^149.0-1.0/37.25*xyz^149.0-0.026845637583892617*xyz^149.0+x0^10.0*x0/249541.875*xyz^111.0-1.0/27.75*xyz^111.0-0.036036036036036036*xyz^111.0-x0^2.0/136.5*xyz^14.0-0.00909090909090909*xyz^12.0-x0^31.0/41464.0*xyz^73.0+1.0/23399.999999999996*xyz^27.0+1.0/23399.999999999996*xyz^27.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^7.0/160081.1851851852/150.0*xyz^150.0-1.0/37.25/150.0*xyz^150.0-0.026845637583892617/150.0*xyz^150.0+x0^10.0*x0/249541.875/112.0*xyz^112.0-1.0/27.75/112.0*xyz^112.0-0.036036036036036036/112.0*xyz^112.0-x0^2.0/136.5/15.0*xyz^15.0-0.00909090909090909/13.0*xyz^13.0-x0^31.0/41464.0/74.0*xyz^74.0+1.0/23399.999999999996/28.0*xyz^28.0+1.0/23399.999999999996/28.0*xyz^28.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^7.0/2.401217777777778E7*xyz^150.0-1.0/5587.5*xyz^150.0-1.7897091722595077E-4*xyz^150.0+x0^10.0*x0/2.794869E7*xyz^112.0-1.0/3108.0*xyz^112.0-3.2175032175032174E-4*xyz^112.0-x0^2.0/2047.5*xyz^15.0-6.993006993006993E-4*xyz^13.0-x0^31.0/3068336.0*xyz^74.0+1.0/655199.9999999999*xyz^28.0+1.0/655199.9999999999*xyz^28.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131374() {
 UsageCalculus.TestCase = 131374;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "4*x0^7*+1*x0^8*-3*x0^91*xyza^2^8*-3*xyza^3^9-3*xyza^3^94*x0^10*-1*x0/--3*x0^2*+4*x0^31*xyza^2/--3*xyza^3^2*+4*xyza^1^3-3*xyza^3^2*+4*xyza^1^34*x0^31*xyza^2^4*--3*xyza^3^5/-4*xyza^1^6*+1*xyza^2^7-3*xyza^3^5/-4*xyza^1^6*+1*xyza^2^74*x0^6*+1*x0^7";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=373 EqnNumber=74 FamilyID=2 MotifTag=3 Entropy=1 FuncWrapAliasID=3"+
"// MetaRow=[12, 74, 10, 7, 4, 3, 1, 10, 2, 3, 4, 2, 3, 1, 1, 1, 2, 1, 3, 1, 1, 11, 3, 1, 2, 3, 15, 1, 1, 13, 2, 8]"+
"// DOEMatrixRow=[4, 74, 18, 3, 1, 2, 3, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 6, 5, 1, 2, 4, 2, 3, 4, 1, 1, 2, 3, 11, 1]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^7.0*36.0*xyza^22.0+x0^10.0*x0*5.333333333333333*xyza^108.0-x0^2.0*16.0*xyza^11.0-12.0*xyza^9.0-x0^31.0*9.0*xyza^70.0+1.0/1.3333333333333333*xyza^24.0+x0^6.0/1.3333333333333333*xyza^91.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^7.0*36.0*22.0*xyza^21.0+x0^10.0*x0*5.333333333333333*108.0*xyza^107.0-x0^2.0*16.0*11.0*xyza^10.0-12.0*9.0*xyza^8.0-x0^31.0*9.0*70.0*xyza^69.0+1.0/1.3333333333333333*24.0*xyza^23.0+x0^6.0/1.3333333333333333*91.0*xyza^90.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^7.0*792.0*xyza^21.0+x0^10.0*x0*576.0*xyza^107.0-x0^2.0*176.0*xyza^10.0-108.0*xyza^8.0-x0^31.0*630.0*xyza^69.0+18.0*xyza^23.0+x0^6.0*68.25*xyza^90.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^7.0*36.0*xyza^22.0+x0^10.0*x0*5.333333333333333*xyza^108.0-x0^2.0*16.0*xyza^11.0-12.0*xyza^9.0-x0^31.0*9.0*xyza^70.0+1.0/1.3333333333333333*xyza^24.0+x0^6.0/1.3333333333333333*xyza^91.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^7.0*36.0/23.0*xyza^23.0+x0^10.0*x0*5.333333333333333/109.0*xyza^109.0-x0^2.0*16.0/12.0*xyza^12.0-12.0/10.0*xyza^10.0-x0^31.0*9.0/71.0*xyza^71.0+1.0/1.3333333333333333/25.0*xyza^25.0+x0^6.0*1.3333333333333333/92.0*xyza^92.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^7.0*1.565217391304348*xyza^23.0+x0^10.0*x0*0.04892966360856269*xyza^109.0-x0^2.0*1.3333333333333333*xyza^12.0-1.2*xyza^10.0-x0^31.0/7.888888888888889*xyza^71.0+0.030000000000000006*xyza^25.0+x0^6.0/69.0*xyza^92.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^7.0*792.0*xyza^21.0+x0^10.0*x0*576.0*xyza^107.0-x0^2.0*176.0*xyza^10.0-108.0*xyza^8.0-x0^31.0*630.0*xyza^69.0+18.0*xyza^23.0+x0^6.0*68.25*xyza^90.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^7.0*792.0*21.0*xyza^20.0+x0^10.0*x0*576.0*107.0*xyza^106.0-x0^2.0*176.0*10.0*xyza^9.0-108.0*8.0*xyza^7.0-x0^31.0*630.0*69.0*xyza^68.0+18.0*23.0*xyza^22.0+x0^6.0*68.25*90.0*xyza^89.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^7.0*16632.0*xyza^20.0+x0^10.0*x0*61632.0*xyza^106.0-x0^2.0*1760.0*xyza^9.0-864.0*xyza^7.0-x0^31.0*43470.0*xyza^68.0+414.0*xyza^22.0+x0^6.0*6142.5*xyza^89.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^7.0*1.565217391304348*xyza^23.0+x0^10.0*x0*0.04892966360856269*xyza^109.0-x0^2.0*1.3333333333333333*xyza^12.0-1.2*xyza^10.0-x0^31.0/7.888888888888889*xyza^71.0+0.030000000000000006*xyza^25.0+x0^6.0/69.0*xyza^92.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^7.0*1.565217391304348/24.0*xyza^24.0+x0^10.0*x0*0.04892966360856269/110.0*xyza^110.0-x0^2.0*1.3333333333333333/13.0*xyza^13.0-1.2/11.0*xyza^11.0-x0^31.0/7.888888888888889/72.0*xyza^72.0+0.030000000000000006/26.0*xyza^26.0+x0^6.0*69.0/93.0*xyza^93.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^7.0*0.06521739130434782*xyza^24.0+x0^10.0*x0*4.448151237142063E-4*xyza^110.0-x0^2.0/9.75*xyza^13.0-0.10909090909090909*xyza^11.0-x0^31.0/568.0*xyza^72.0+0.0011538461538461542*xyza^26.0+x0^6.0/1.3478260869565217*xyza^93.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^7.0*16632.0*xyza^20.0+x0^10.0*x0*61632.0*xyza^106.0-x0^2.0*1760.0*xyza^9.0-864.0*xyza^7.0-x0^31.0*43470.0*xyza^68.0+414.0*xyza^22.0+x0^6.0*6142.5*xyza^89.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^7.0*16632.0*20.0*xyza^19.0+x0^10.0*x0*61632.0*106.0*xyza^105.0-x0^2.0*1760.0*9.0*xyza^8.0-864.0*7.0*xyza^6.0-x0^31.0*43470.0*68.0*xyza^67.0+414.0*22.0*xyza^21.0+x0^6.0*6142.5*89.0*xyza^88.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^7.0*332640.0*xyza^19.0+x0^10.0*x0*6532992.0*xyza^105.0-x0^2.0*15840.0*xyza^8.0-6048.0*xyza^6.0-x0^31.0*2955960.0*xyza^67.0+9108.0*xyza^21.0+x0^6.0*546682.5*xyza^88.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^7.0*0.06521739130434782*xyza^24.0+x0^10.0*x0*4.448151237142063E-4*xyza^110.0-4.0*xyza^110.0-x0^2.0/9.75*xyza^13.0-0.10909090909090909*xyza^11.0-x0^31.0/568.0*xyza^72.0+0.0011538461538461542*xyza^26.0+x0^6.0/1.3478260869565217*xyza^93.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^7.0*0.06521739130434782/25.0*xyza^25.0+x0^10.0*x0*4.448151237142063E-4/111.0*xyza^111.0-4.0/111.0*xyza^111.0-x0^2.0/9.75/14.0*xyza^14.0-0.10909090909090909/12.0*xyza^12.0-x0^31.0/568.0/73.0*xyza^73.0+0.0011538461538461542/27.0*xyza^27.0+x0^6.0*1.3478260869565217/94.0*xyza^94.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^7.0*0.002608695652173913*xyza^25.0+x0^10.0*x0/249541.875*xyza^111.0-1.0/27.75*xyza^111.0-0.036036036036036036*xyza^111.0-x0^2.0/136.5*xyza^14.0-0.00909090909090909*xyza^12.0-x0^31.0/41464.0*xyza^73.0+4.273504273504275E-5*xyza^27.0+x0^6.0/69.74193548387098*xyza^94.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^7.0*332640.0*xyza^19.0+x0^10.0*x0*6532992.0*xyza^105.0-x0^2.0*15840.0*xyza^8.0-6048.0*xyza^6.0-x0^31.0*2955960.0*xyza^67.0+9108.0*xyza^21.0+x0^6.0*546682.5*xyza^88.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^7.0*332640.0*19.0*xyza^18.0+x0^10.0*x0*6532992.0*105.0*xyza^104.0-x0^2.0*15840.0*8.0*xyza^7.0-6048.0*6.0*xyza^5.0-x0^31.0*2955960.0*67.0*xyza^66.0+9108.0*21.0*xyza^20.0+x0^6.0*546682.5*88.0*xyza^87.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^7.0*6320160.0*xyza^18.0+x0^10.0*x0*6.8596416E8*xyza^104.0-x0^2.0*126720.0*xyza^7.0-36288.0*xyza^5.0-x0^31.0*1.9804932E8*xyza^66.0+191268.0*xyza^20.0+x0^6.0*4.810806E7*xyza^87.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^7.0*0.002608695652173913*xyza^25.0+x0^10.0*x0/249541.875*xyza^111.0-1.0/27.75*xyza^111.0-0.036036036036036036*xyza^111.0-x0^2.0/136.5*xyza^14.0-0.00909090909090909*xyza^12.0-x0^31.0/41464.0*xyza^73.0+4.273504273504275E-5*xyza^27.0-5.0*xyza^27.0+x0^6.0/69.74193548387098*xyza^94.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^7.0*0.002608695652173913/26.0*xyza^26.0+x0^10.0*x0/249541.875/112.0*xyza^112.0-1.0/27.75/112.0*xyza^112.0-0.036036036036036036/112.0*xyza^112.0-x0^2.0/136.5/15.0*xyza^15.0-0.00909090909090909/13.0*xyza^13.0-x0^31.0/41464.0/74.0*xyza^74.0+4.273504273504275E-5/28.0*xyza^28.0-5.0/28.0*xyza^28.0+x0^6.0*69.74193548387098/95.0*xyza^95.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^7.0*1.0033444816053511E-4*xyza^26.0+x0^10.0*x0/2.794869E7*xyza^112.0-1.0/3108.0*xyza^112.0-3.2175032175032174E-4*xyza^112.0-x0^2.0/2047.5*xyza^15.0-6.993006993006993E-4*xyza^13.0-x0^31.0/3068336.0*xyza^74.0+1.0/655199.9999999998*xyza^28.0-1.0/5.6*xyza^28.0-0.17857142857142858*xyza^28.0+x0^6.0/1.3621646623496761*xyza^95.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131375() {
 UsageCalculus.TestCase = 131375;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x^2^8*-3*x^3^9-3*x^3^94*x0^10*-1*x0/--3*x0^2*+4*x0^31*x^2/--3*x^3^2*+4*x^1^3-3*x^3^2*+4*x^1^34*x0^31*x^2^4*--3*x^3^5/-4*x^1^6*+1*x^2^7-3*x^3^5/-4*x^1^6*+1*x^2^74*x0^6*+1*x0^71*x^2^7";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=374 EqnNumber=75 FamilyID=3 MotifTag=4 Entropy=3 FuncWrapAliasID=4"+
"// MetaRow=[12, 75, 10, 6, 1, 1, 2, 1, 3, 4, 1, 1, 1, 2, 3, 2, 3, 2, 4, 2, 3, 12, 1, 2, 3, 4, 16, 2, 3, 14, 3, 9]"+
"// DOEMatrixRow=[4, 75, 18, 2, 3, 1, 1, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 7, 6, 2, 3, 5, 3, 1, 5, 2, 3, 1, 4, 12, 2]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-3.0*x^22.0+5.333333333333333*x^108.0-16.0*x^11.0-12.0*x^9.0-9.0*x^70.0+1.0/1.3333333333333333*x^24.0+1.0/1.3333333333333333*x^100.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-3.0*22.0*x^21.0+5.333333333333333*108.0*x^107.0-16.0*11.0*x^10.0-12.0*9.0*x^8.0-9.0*70.0*x^69.0+1.0/1.3333333333333333*24.0*x^23.0+1.0/1.3333333333333333*100.0*x^99.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-66.0*x^21.0+576.0*x^107.0-176.0*x^10.0-108.0*x^8.0-630.0*x^69.0+18.0*x^23.0+75.0*x^99.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-3.0*x^22.0+5.333333333333333*x^108.0-16.0*x^11.0-12.0*x^9.0-9.0*x^70.0+1.0/1.3333333333333333*x^24.0+1.0/1.3333333333333333*x^100.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-3.0/23.0*x^23.0+5.333333333333333/109.0*x^109.0-16.0/12.0*x^12.0-12.0/10.0*x^10.0-9.0/71.0*x^71.0+1.0/1.3333333333333333/25.0*x^25.0+1.0/1.3333333333333333/101.0*x^101.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/7.666666666666667*x^23.0+1.0/20.4375*x^109.0-1.3333333333333333*x^12.0-1.2*x^10.0-1.0/7.888888888888889*x^71.0+1.0/33.33333333333333*x^25.0+1.0/134.66666666666666*x^101.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-66.0*x^21.0+576.0*x^107.0-176.0*x^10.0-108.0*x^8.0-630.0*x^69.0+18.0*x^23.0+75.0*x^99.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-66.0*21.0*x^20.0+576.0*107.0*x^106.0-176.0*10.0*x^9.0-108.0*8.0*x^7.0-630.0*69.0*x^68.0+18.0*23.0*x^22.0+75.0*99.0*x^98.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-1386.0*x^20.0+61632.0*x^106.0-1760.0*x^9.0-864.0*x^7.0-43470.0*x^68.0+414.0*x^22.0+7425.0*x^98.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/7.666666666666667*x^23.0+1.0/20.4375*x^109.0-1.3333333333333333*x^12.0-1.2*x^10.0-1.0/7.888888888888889*x^71.0+1.0/33.33333333333333*x^25.0+1.0/134.66666666666666*x^101.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/7.666666666666667/24.0*x^24.0+1.0/20.4375/110.0*x^110.0-1.3333333333333333/13.0*x^13.0-1.2/11.0*x^11.0-1.0/7.888888888888889/72.0*x^72.0+1.0/33.33333333333333/26.0*x^26.0+1.0/134.66666666666666/102.0*x^102.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/184.0*x^24.0+1.0/2248.125*x^110.0-1.0/9.75*x^13.0-1.0/9.166666666666668*x^11.0-1.0/568.0*x^72.0+1.0/866.6666666666665*x^26.0+1.0/13735.999999999998*x^102.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-1386.0*x^20.0+61632.0*x^106.0-1760.0*x^9.0-864.0*x^7.0-43470.0*x^68.0+414.0*x^22.0+7425.0*x^98.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-1386.0*20.0*x^19.0+61632.0*106.0*x^105.0-1760.0*9.0*x^8.0-864.0*7.0*x^6.0-43470.0*68.0*x^67.0+414.0*22.0*x^21.0+7425.0*98.0*x^97.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-27720.0*x^19.0+6532992.0*x^105.0-15840.0*x^8.0-6048.0*x^6.0-2955960.0*x^67.0+9108.0*x^21.0+727650.0*x^97.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/184.0*x^24.0+1.0/2248.125*x^110.0-1.0/9.75*x^13.0-1.0/9.166666666666668*x^11.0-1.0/568.0*x^72.0+1.0/866.6666666666665*x^26.0+1.0/13735.999999999998*x^102.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/184.0/25.0*x^25.0+1.0/2248.125/111.0*x^111.0-1.0/9.75/14.0*x^14.0-1.0/9.166666666666668/12.0*x^12.0-1.0/568.0/73.0*x^73.0+1.0/866.6666666666665/27.0*x^27.0+1.0/13735.999999999998/103.0*x^103.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/4600.0*x^25.0+1.0/249541.875*x^111.0-1.0/136.5*x^14.0-1.0/110.00000000000001*x^12.0-1.0/41464.0*x^73.0+1.0/23399.999999999996*x^27.0+1.0/1414807.9999999998*x^103.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-27720.0*x^19.0+6532992.0*x^105.0-15840.0*x^8.0-6048.0*x^6.0-2955960.0*x^67.0+9108.0*x^21.0+727650.0*x^97.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-27720.0*19.0*x^18.0+6532992.0*105.0*x^104.0-15840.0*8.0*x^7.0-6048.0*6.0*x^5.0-2955960.0*67.0*x^66.0+9108.0*21.0*x^20.0+727650.0*97.0*x^96.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-526680.0*x^18.0+6.8596416E8*x^104.0-126720.0*x^7.0-36288.0*x^5.0-1.9804932E8*x^66.0+191268.0*x^20.0+7.058205E7*x^96.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/4600.0*x^25.0+1.0/249541.875*x^111.0-1.0/136.5*x^14.0-1.0/110.00000000000001*x^12.0-1.0/41464.0*x^73.0+1.0/23399.999999999996*x^27.0+1.0/1414807.9999999998*x^103.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/4600.0/26.0*x^26.0+1.0/249541.875/112.0*x^112.0-1.0/136.5/15.0*x^15.0-1.0/110.00000000000001/13.0*x^13.0-1.0/41464.0/74.0*x^74.0+1.0/23399.999999999996/28.0*x^28.0+1.0/1414807.9999999998/104.0*x^104.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/119600.0*x^26.0+1.0/2.794869E7*x^112.0-1.0/2047.5*x^15.0-1.0/1430.0000000000002*x^13.0-1.0/3068336.0*x^74.0+1.0/655199.9999999999*x^28.0+1.0/1.4714003199999997E8*x^104.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131376() {
 UsageCalculus.TestCase = 131376;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xy^3^94*x0^10*-1*x0/--3*x0^2*+4*x0^31*xy^2/--3*xy^3^2*+4*xy^1^3-3*xy^3^2*+4*xy^1^34*x0^31*xy^2^4*--3*xy^3^5/-4*xy^1^6*+1*xy^2^7-3*xy^3^5/-4*xy^1^6*+1*xy^2^74*x0^6*+1*x0^71*xy^2^7-3*xy^3^8/4*xy^1^9*-1*xy^2^10/--3*xy^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=375 EqnNumber=76 FamilyID=1 MotifTag=1 Entropy=4 FuncWrapAliasID=1"+
"// MetaRow=[12, 76, 10, 5, 2, 3, 1, 2, 1, 1, 2, 1, 2, 3, 4, 3, 1, 1, 5, 3, 4, 13, 2, 3, 1, 1, 1, 3, 4, 15, 4, 10]"+
"// DOEMatrixRow=[4, 76, 18, 1, 2, 3, 2, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 8, 7, 3, 1, 1, 1, 2, 6, 3, 1, 2, 1, 13, 1]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^10.0*x0*5.333333333333333*xy^108.0-x0^2.0*16.0*xy^11.0-12.0*xy^9.0-x0^31.0*9.0*xy^70.0+1.0/1.3333333333333333*xy^24.0+x0^6.0/1.3333333333333333*xy^100.0+1.0/4.0*xy^36.0-3.0*xy^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^10.0*x0*5.333333333333333*108.0*xy^107.0-x0^2.0*16.0*11.0*xy^10.0-12.0*9.0*xy^8.0-x0^31.0*9.0*70.0*xy^69.0+1.0/1.3333333333333333*24.0*xy^23.0+x0^6.0/1.3333333333333333*100.0*xy^99.0+1.0/4.0*36.0*xy^35.0-3.0*3.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^10.0*x0*576.0*xy^107.0-x0^2.0*176.0*xy^10.0-108.0*xy^8.0-x0^31.0*630.0*xy^69.0+18.0*xy^23.0+x0^6.0*75.0*xy^99.0+9.0*xy^35.0-9.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^10.0*x0*5.333333333333333*xy^108.0-x0^2.0*16.0*xy^11.0-12.0*xy^9.0-x0^31.0*9.0*xy^70.0+1.0/1.3333333333333333*xy^24.0+x0^6.0/1.3333333333333333*xy^100.0+1.0/4.0*xy^36.0-3.0*xy^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^10.0*x0*5.333333333333333/109.0*xy^109.0-x0^2.0*16.0/12.0*xy^12.0-12.0/10.0*xy^10.0-x0^31.0*9.0/71.0*xy^71.0+1.0/1.3333333333333333/25.0*xy^25.0+x0^6.0/1.3333333333333333/101.0*xy^101.0+1.0/4.0/37.0*xy^37.0-3.0/4.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^10.0*x0*0.04892966360856269*xy^109.0-x0^2.0*1.3333333333333333*xy^12.0-1.2*xy^10.0-x0^31.0/7.888888888888889*xy^71.0+0.030000000000000006*xy^25.0+x0^6.0/134.66666666666666*xy^101.0+1.0/148.0*xy^37.0-1.0/1.3333333333333333*xy^4.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^10.0*x0*576.0*xy^107.0-x0^2.0*176.0*xy^10.0-108.0*xy^8.0-x0^31.0*630.0*xy^69.0+18.0*xy^23.0+x0^6.0*75.0*xy^99.0+9.0*xy^35.0-9.0*xy^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^10.0*x0*576.0*107.0*xy^106.0-x0^2.0*176.0*10.0*xy^9.0-108.0*8.0*xy^7.0-x0^31.0*630.0*69.0*xy^68.0+18.0*23.0*xy^22.0+x0^6.0*75.0*99.0*xy^98.0+9.0*35.0*xy^34.0-9.0*2.0*xy^1.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^10.0*x0*61632.0*xy^106.0-x0^2.0*1760.0*xy^9.0-864.0*xy^7.0-x0^31.0*43470.0*xy^68.0+414.0*xy^22.0+x0^6.0*7425.0*xy^98.0+315.0*xy^34.0-18.0*xy";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^10.0*x0*0.04892966360856269*xy^109.0-x0^2.0*1.3333333333333333*xy^12.0-1.2*xy^10.0-x0^31.0/7.888888888888889*xy^71.0+0.030000000000000006*xy^25.0+x0^6.0/134.66666666666666*xy^101.0+1.0/148.0*xy^37.0-1.0/1.3333333333333333*xy^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^10.0*x0*0.04892966360856269/110.0*xy^110.0-x0^2.0*1.3333333333333333/13.0*xy^13.0-1.2/11.0*xy^11.0-x0^31.0/7.888888888888889/72.0*xy^72.0+0.030000000000000006/26.0*xy^26.0+x0^6.0/134.66666666666666/102.0*xy^102.0+1.0/148.0/38.0*xy^38.0-1.0/1.3333333333333333/5.0*xy^5.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^10.0*x0*4.448151237142063E-4*xy^110.0-x0^2.0/9.75*xy^13.0-0.10909090909090909*xy^11.0-x0^31.0/568.0*xy^72.0+0.0011538461538461542*xy^26.0+x0^6.0/13735.999999999998*xy^102.0+1.0/5624.0*xy^38.0-1.0/6.666666666666666*xy^5.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^10.0*x0*61632.0*xy^106.0-x0^2.0*1760.0*xy^9.0-864.0*xy^7.0-x0^31.0*43470.0*xy^68.0+414.0*xy^22.0+x0^6.0*7425.0*xy^98.0+315.0*xy^34.0-18.0*xy";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^10.0*x0*61632.0*106.0*xy^105.0-x0^2.0*1760.0*9.0*xy^8.0-864.0*7.0*xy^6.0-x0^31.0*43470.0*68.0*xy^67.0+414.0*22.0*xy^21.0+x0^6.0*7425.0*98.0*xy^97.0+315.0*34.0*xy^33.0-18.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^10.0*x0*6532992.0*xy^105.0-x0^2.0*15840.0*xy^8.0-6048.0*xy^6.0-x0^31.0*2955960.0*xy^67.0+9108.0*xy^21.0+x0^6.0*727650.0*xy^97.0+10710.0*xy^33.0-18.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^10.0*x0*4.448151237142063E-4*xy^110.0-4.0*xy^110.0-x0^2.0/9.75*xy^13.0-0.10909090909090909*xy^11.0-x0^31.0/568.0*xy^72.0+0.0011538461538461542*xy^26.0+x0^6.0/13735.999999999998*xy^102.0+1.0/5624.0*xy^38.0-1.0/6.666666666666666*xy^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^10.0*x0*4.448151237142063E-4/111.0*xy^111.0-4.0/111.0*xy^111.0-x0^2.0/9.75/14.0*xy^14.0-0.10909090909090909/12.0*xy^12.0-x0^31.0/568.0/73.0*xy^73.0+0.0011538461538461542/27.0*xy^27.0+x0^6.0/13735.999999999998/103.0*xy^103.0+1.0/5624.0/39.0*xy^39.0-1.0/6.666666666666666/6.0*xy^6.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^10.0*x0/249541.875*xy^111.0-1.0/27.75*xy^111.0-0.036036036036036036*xy^111.0-x0^2.0/136.5*xy^14.0-0.00909090909090909*xy^12.0-x0^31.0/41464.0*xy^73.0+4.273504273504275E-5*xy^27.0+x0^6.0/1414807.9999999998*xy^103.0+1.0/219336.0*xy^39.0-1.0/40.0*xy^6.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^10.0*x0*6532992.0*xy^105.0-x0^2.0*15840.0*xy^8.0-6048.0*xy^6.0-x0^31.0*2955960.0*xy^67.0+9108.0*xy^21.0+x0^6.0*727650.0*xy^97.0+10710.0*xy^33.0-18.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^10.0*x0*6532992.0*105.0*xy^104.0-x0^2.0*15840.0*8.0*xy^7.0-6048.0*6.0*xy^5.0-x0^31.0*2955960.0*67.0*xy^66.0+9108.0*21.0*xy^20.0+x0^6.0*727650.0*97.0*xy^96.0+10710.0*33.0*xy^32.0-18.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^10.0*x0*6.8596416E8*xy^104.0-x0^2.0*126720.0*xy^7.0-36288.0*xy^5.0-x0^31.0*1.9804932E8*xy^66.0+191268.0*xy^20.0+x0^6.0*7.058205E7*xy^96.0+353430.0*xy^32.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^10.0*x0/249541.875*xy^111.0-1.0/27.75*xy^111.0-0.036036036036036036*xy^111.0-x0^2.0/136.5*xy^14.0-0.00909090909090909*xy^12.0-x0^31.0/41464.0*xy^73.0+4.273504273504275E-5*xy^27.0-5.0*xy^27.0+x0^6.0/1414807.9999999998*xy^103.0+1.0/219336.0*xy^39.0-1.0/40.0*xy^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^10.0*x0/249541.875/112.0*xy^112.0-1.0/27.75/112.0*xy^112.0-0.036036036036036036/112.0*xy^112.0-x0^2.0/136.5/15.0*xy^15.0-0.00909090909090909/13.0*xy^13.0-x0^31.0/41464.0/74.0*xy^74.0+4.273504273504275E-5/28.0*xy^28.0-5.0/28.0*xy^28.0+x0^6.0/1414807.9999999998/104.0*xy^104.0+1.0/219336.0/40.0*xy^40.0-1.0/40.0/7.0*xy^7.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^10.0*x0/2.794869E7*xy^112.0-1.0/3108.0*xy^112.0-3.2175032175032174E-4*xy^112.0-x0^2.0/2047.5*xy^15.0-6.993006993006993E-4*xy^13.0-x0^31.0/3068336.0*xy^74.0+1.0/655199.9999999998*xy^28.0-1.0/5.6*xy^28.0-0.17857142857142858*xy^28.0+x0^6.0/1.4714003199999997E8*xy^104.0+1.0/8773440.0*xy^40.0-1.0/280.0*xy^7.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131377() {
 UsageCalculus.TestCase = 131377;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "4*x0^10*-1*x0/--3*x0^2*+4*x0^31*xyz^2/--3*xyz^3^2*+4*xyz^1^3-3*xyz^3^2*+4*xyz^1^34*x0^31*xyz^2^4*--3*xyz^3^5/-4*xyz^1^6*+1*xyz^2^7-3*xyz^3^5/-4*xyz^1^6*+1*xyz^2^74*x0^6*+1*x0^71*xyz^2^7-3*xyz^3^8/4*xyz^1^9*-1*xyz^2^10/--3*xyz^34*x0^9*-1*x0^10/--3*x0";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=376 EqnNumber=77 FamilyID=2 MotifTag=3 Entropy=1 FuncWrapAliasID=3"+
"// MetaRow=[12, 77, 10, 4, 3, 1, 2, 3, 2, 3, 4, 2, 3, 1, 1, 1, 2, 1, 1, 1, 1, 14, 3, 1, 2, 3, 2, 1, 1, 16, 1, 11]"+
"// DOEMatrixRow=[4, 77, 18, 4, 3, 1, 3, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 9, 8, 1, 2, 3, 2, 3, 1, 4, 2, 3, 2, 14, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^10.0*x0*7.111111111111111*xyz^11.0-x0^2.0*16.0*xyz^11.0-12.0*xyz^9.0-x0^31.0*9.0*xyz^70.0+1.0/1.3333333333333333*xyz^24.0+x0^6.0/1.3333333333333333*xyz^100.0+x0^9.0*x0/12.0*xyz^67.0+x0^9.0*x0*xyz^34.0-x0*3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^10.0*x0*7.111111111111111*11.0*xyz^10.0-x0^2.0*16.0*11.0*xyz^10.0-12.0*9.0*xyz^8.0-x0^31.0*9.0*70.0*xyz^69.0+1.0/1.3333333333333333*24.0*xyz^23.0+x0^6.0/1.3333333333333333*100.0*xyz^99.0+x0^9.0*x0/12.0*67.0*xyz^66.0+x0^9.0*x0*34.0*xyz^33.0-x0*3.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^10.0*x0*78.22222222222221*xyz^10.0-x0^2.0*176.0*xyz^10.0-108.0*xyz^8.0-x0^31.0*630.0*xyz^69.0+18.0*xyz^23.0+x0^6.0*75.0*xyz^99.0+x0^9.0*x0*5.583333333333333*xyz^66.0+x0^9.0*x0*34.0*xyz^33.0-x0*0.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^10.0*x0*7.111111111111111*xyz^11.0-x0^2.0*16.0*xyz^11.0-12.0*xyz^9.0-x0^31.0*9.0*xyz^70.0+1.0/1.3333333333333333*xyz^24.0+x0^6.0/1.3333333333333333*xyz^100.0+x0^9.0*x0/12.0*xyz^67.0+x0^9.0*x0*xyz^34.0-x0*3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^10.0*x0*7.111111111111111/12.0*xyz^12.0-x0^2.0*16.0/12.0*xyz^12.0-12.0/10.0*xyz^10.0-x0^31.0*9.0/71.0*xyz^71.0+1.0/1.3333333333333333/25.0*xyz^25.0+x0^6.0/1.3333333333333333/101.0*xyz^101.0+x0^9.0*x0/12.0/68.0*xyz^68.0+x0^9.0*x0/35.0*xyz^35.0-x0*3.0*xyz";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^10.0*x0*0.5925925925925926*xyz^12.0-x0^2.0*1.3333333333333333*xyz^12.0-1.2*xyz^10.0-x0^31.0/7.888888888888889*xyz^71.0+0.030000000000000006*xyz^25.0+x0^6.0*0.007425742574257426*xyz^101.0+x0^9.0*x0*0.0012254901960784314*xyz^68.0+x0^9.0*x0/35.0*xyz^35.0-x0*3.0*xyz";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^10.0*x0*78.22222222222221*xyz^10.0-x0^2.0*176.0*xyz^10.0-108.0*xyz^8.0-x0^31.0*630.0*xyz^69.0+18.0*xyz^23.0+x0^6.0*75.0*xyz^99.0+x0^9.0*x0*5.583333333333333*xyz^66.0+x0^9.0*x0*34.0*xyz^33.0-x0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^10.0*x0*78.22222222222221*10.0*xyz^9.0-x0^2.0*176.0*10.0*xyz^9.0-108.0*8.0*xyz^7.0-x0^31.0*630.0*69.0*xyz^68.0+18.0*23.0*xyz^22.0+x0^6.0*75.0*99.0*xyz^98.0+x0^9.0*x0*5.583333333333333*66.0*xyz^65.0+x0^9.0*x0*34.0*33.0*xyz^32.0-x0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^10.0*x0*782.2222222222222*xyz^9.0-x0^2.0*1760.0*xyz^9.0-864.0*xyz^7.0-x0^31.0*43470.0*xyz^68.0+414.0*xyz^22.0+x0^6.0*7425.0*xyz^98.0+x0^9.0*x0*368.5*xyz^65.0+x0^9.0*x0*1122.0*xyz^32.0-x0*0.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^10.0*x0*0.5925925925925926*xyz^12.0-x0^2.0*1.3333333333333333*xyz^12.0-1.2*xyz^10.0-x0^31.0/7.888888888888889*xyz^71.0+0.030000000000000006*xyz^25.0+x0^6.0*0.007425742574257426*xyz^101.0+x0^9.0*x0*0.0012254901960784314*xyz^68.0+x0^9.0*x0/35.0*xyz^35.0-x0*3.0*xyz";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^10.0*x0*0.5925925925925926/13.0*xyz^13.0-x0^2.0*1.3333333333333333/13.0*xyz^13.0-1.2/11.0*xyz^11.0-x0^31.0/7.888888888888889/72.0*xyz^72.0+0.030000000000000006/26.0*xyz^26.0+x0^6.0*0.007425742574257426/102.0*xyz^102.0+x0^9.0*x0*0.0012254901960784314/69.0*xyz^69.0+x0^9.0*x0/35.0/36.0*xyz^36.0-x0*3.0/2.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^10.0*x0*0.04558404558404558*xyz^13.0-x0^2.0/9.75*xyz^13.0-0.10909090909090909*xyz^11.0-x0^31.0/568.0*xyz^72.0+0.0011538461538461542*xyz^26.0+x0^6.0*7.280139778683751E-5*xyz^102.0+x0^9.0*x0*1.7760727479397556E-5*xyz^69.0+x0^9.0*x0*7.936507936507937E-4*xyz^36.0-x0*1.5*xyz^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^10.0*x0*782.2222222222222*xyz^9.0-x0^2.0*1760.0*xyz^9.0-864.0*xyz^7.0-x0^31.0*43470.0*xyz^68.0+414.0*xyz^22.0+x0^6.0*7425.0*xyz^98.0+x0^9.0*x0*368.5*xyz^65.0+x0^9.0*x0*1122.0*xyz^32.0-x0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^10.0*x0*782.2222222222222*9.0*xyz^8.0-x0^2.0*1760.0*9.0*xyz^8.0-864.0*7.0*xyz^6.0-x0^31.0*43470.0*68.0*xyz^67.0+414.0*22.0*xyz^21.0+x0^6.0*7425.0*98.0*xyz^97.0+x0^9.0*x0*368.5*65.0*xyz^64.0+x0^9.0*x0*1122.0*32.0*xyz^31.0-x0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^10.0*x0*7040.0*xyz^8.0-x0^2.0*15840.0*xyz^8.0-6048.0*xyz^6.0-x0^31.0*2955960.0*xyz^67.0+9108.0*xyz^21.0+x0^6.0*727650.0*xyz^97.0+x0^9.0*x0*23952.5*xyz^64.0+x0^9.0*x0*35904.0*xyz^31.0-x0*0.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^10.0*x0*0.04558404558404558*xyz^13.0-x0^2.0/9.75*xyz^13.0-0.10909090909090909*xyz^11.0-x0^31.0/568.0*xyz^72.0+0.0011538461538461542*xyz^26.0+x0^6.0*7.280139778683751E-5*xyz^102.0-5.0*xyz^102.0+x0^9.0*x0*1.7760727479397556E-5*xyz^69.0-5.0*xyz^69.0+x0^9.0*x0*7.936507936507937E-4*xyz^36.0-4.0*xyz^36.0-x0*1.5*xyz^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^10.0*x0*0.04558404558404558/14.0*xyz^14.0-x0^2.0/9.75/14.0*xyz^14.0-0.10909090909090909/12.0*xyz^12.0-x0^31.0/568.0/73.0*xyz^73.0+0.0011538461538461542/27.0*xyz^27.0+x0^6.0*7.280139778683751E-5/103.0*xyz^103.0-5.0/103.0*xyz^103.0+x0^9.0*x0*1.7760727479397556E-5/70.0*xyz^70.0-5.0/70.0*xyz^70.0+x0^9.0*x0*7.936507936507937E-4/37.0*xyz^37.0-4.0/37.0*xyz^37.0-x0*1.5/3.0*xyz^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^10.0*x0*0.003256003256003256*xyz^14.0-x0^2.0/136.5*xyz^14.0-0.00909090909090909*xyz^12.0-x0^31.0/41464.0*xyz^73.0+4.273504273504275E-5*xyz^27.0+x0^6.0/1414808.0*xyz^103.0-1.0/20.6*xyz^103.0-0.04854368932038835*xyz^103.0+x0^9.0*x0/3941280.0*xyz^70.0-1.0/14.0*xyz^70.0-0.07142857142857142*xyz^70.0+x0^9.0*x0/46620.0*xyz^37.0-1.0/9.25*xyz^37.0-0.10810810810810811*xyz^37.0-x0/2.0*xyz^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^10.0*x0*7040.0*xyz^8.0-x0^2.0*15840.0*xyz^8.0-6048.0*xyz^6.0-x0^31.0*2955960.0*xyz^67.0+9108.0*xyz^21.0+x0^6.0*727650.0*xyz^97.0+x0^9.0*x0*23952.5*xyz^64.0+x0^9.0*x0*35904.0*xyz^31.0-x0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^10.0*x0*7040.0*8.0*xyz^7.0-x0^2.0*15840.0*8.0*xyz^7.0-6048.0*6.0*xyz^5.0-x0^31.0*2955960.0*67.0*xyz^66.0+9108.0*21.0*xyz^20.0+x0^6.0*727650.0*97.0*xyz^96.0+x0^9.0*x0*23952.5*64.0*xyz^63.0+x0^9.0*x0*35904.0*31.0*xyz^30.0-x0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^10.0*x0*56320.0*xyz^7.0-x0^2.0*126720.0*xyz^7.0-36288.0*xyz^5.0-x0^31.0*1.9804932E8*xyz^66.0+191268.0*xyz^20.0+x0^6.0*7.058205E7*xyz^96.0+x0^9.0*x0*1532960.0*xyz^63.0+x0^9.0*x0*1113024.0*xyz^30.0-x0*0.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^10.0*x0*0.003256003256003256*xyz^14.0-x0^2.0/136.5*xyz^14.0-0.00909090909090909*xyz^12.0-x0^31.0/41464.0*xyz^73.0+4.273504273504275E-5*xyz^27.0-5.0*xyz^27.0+x0^6.0/1414808.0*xyz^103.0-1.0/20.6*xyz^103.0-0.04854368932038835*xyz^103.0+x0^9.0*x0/3941280.0*xyz^70.0-1.0/14.0*xyz^70.0-0.07142857142857142*xyz^70.0+x0^9.0*x0/46620.0*xyz^37.0-1.0/9.25*xyz^37.0-0.10810810810810811*xyz^37.0-x0/2.0*xyz^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^10.0*x0*0.003256003256003256/15.0*xyz^15.0-x0^2.0/136.5/15.0*xyz^15.0-0.00909090909090909/13.0*xyz^13.0-x0^31.0/41464.0/74.0*xyz^74.0+4.273504273504275E-5/28.0*xyz^28.0-5.0/28.0*xyz^28.0+x0^6.0/1414808.0/104.0*xyz^104.0-1.0/20.6/104.0*xyz^104.0-0.04854368932038835/104.0*xyz^104.0+x0^9.0*x0/3941280.0/71.0*xyz^71.0-1.0/14.0/71.0*xyz^71.0-0.07142857142857142/71.0*xyz^71.0+x0^9.0*x0/46620.0/38.0*xyz^38.0-1.0/9.25/38.0*xyz^38.0-0.10810810810810811/38.0*xyz^38.0-x0*2.0/4.0*xyz^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^10.0*x0*2.170668837335504E-4*xyz^15.0-x0^2.0/2047.5*xyz^15.0-6.993006993006993E-4*xyz^13.0-x0^31.0/3068336.0*xyz^74.0+1.0/655199.9999999998*xyz^28.0-1.0/5.6*xyz^28.0-0.17857142857142858*xyz^28.0+x0^6.0/1.47140032E8*xyz^104.0-1.0/2142.4*xyz^104.0-4.667662434652726E-4*xyz^104.0+x0^9.0*x0/2.7983088E8*xyz^71.0-1.0/994.0*xyz^71.0-0.0010060362173038228*xyz^71.0+x0^9.0*x0/1771560.0*xyz^38.0-1.0/351.5*xyz^38.0-0.002844950213371266*xyz^38.0-x0/2.0*xyz^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131378() {
 UsageCalculus.TestCase = 131378;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xyza^2/--3*xyza^3^2*+4*xyza^1^3-3*xyza^3^2*+4*xyza^1^34*x0^31*xyza^2^4*--3*xyza^3^5/-4*xyza^1^6*+1*xyza^2^7-3*xyza^3^5/-4*xyza^1^6*+1*xyza^2^74*x0^6*+1*x0^71*xyza^2^7-3*xyza^3^8/4*xyza^1^9*-1*xyza^2^10/--3*xyza^34*x0^9*-1*x0^10/--3*x01*xyza^2^10/--3*xyza^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=377 EqnNumber=78 FamilyID=3 MotifTag=4 Entropy=3 FuncWrapAliasID=4"+
"// MetaRow=[12, 78, 10, 3, 4, 2, 3, 4, 3, 4, 1, 1, 1, 2, 3, 2, 3, 2, 3, 2, 3, 15, 1, 2, 3, 4, 3, 2, 3, 1, 2, 12]"+
"// DOEMatrixRow=[4, 78, 18, 3, 1, 2, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 10, 9, 2, 3, 4, 3, 1, 2, 1, 3, 1, 3, 15, 1]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "1.3333333333333333*xyza^11.0-12.0*xyza^9.0-x0^31.0*9.0*xyza^70.0+1.0/1.3333333333333333*xyza^24.0+x0^6.0/1.3333333333333333*xyza^100.0+x0^9.0*x01/36.0*xyza^82.0+x0^9.0*x01/3.0*xyza^49.0-x01*xyza^15.0-3.0*xyza^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "1.3333333333333333*11.0*xyza^10.0-12.0*9.0*xyza^8.0-x0^31.0*9.0*70.0*xyza^69.0+1.0/1.3333333333333333*24.0*xyza^23.0+x0^6.0/1.3333333333333333*100.0*xyza^99.0+x0^9.0*x01/36.0*82.0*xyza^81.0+x0^9.0*x01/3.0*49.0*xyza^48.0-x01*15.0*xyza^14.0-3.0*3.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap2[1] = "14.666666666666666*xyza^10.0-108.0*xyza^8.0-x0^31.0*630.0*xyza^69.0+18.0*xyza^23.0+x0^6.0*75.0*xyza^99.0+x0^9.0*x01*2.2777777777777777*xyza^81.0+x0^9.0*x01*16.333333333333332*xyza^48.0-x01*15.0*xyza^14.0-9.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap3[1] = "1.3333333333333333*xyza^11.0-12.0*xyza^9.0-x0^31.0*9.0*xyza^70.0+1.0/1.3333333333333333*xyza^24.0+x0^6.0/1.3333333333333333*xyza^100.0+x0^9.0*x01/36.0*xyza^82.0+x0^9.0*x01/3.0*xyza^49.0-x01*xyza^15.0-3.0*xyza^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.3333333333333333/12.0*xyza^12.0-12.0/10.0*xyza^10.0-x0^31.0*9.0/71.0*xyza^71.0+1.0/1.3333333333333333/25.0*xyza^25.0+x0^6.0/1.3333333333333333/101.0*xyza^101.0+x0^9.0*x01/36.0/83.0*xyza^83.0+x0^9.0*x01/3.0/50.0*xyza^50.0-x01/16.0*xyza^16.0-3.0/4.0*xyza^4.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/9.0*xyza^12.0-1.2*xyza^10.0-x0^31.0/7.888888888888889*xyza^71.0+0.030000000000000006*xyza^25.0+x0^6.0*0.007425742574257426*xyza^101.0+x0^9.0*x01*3.3467202141900936E-4*xyza^83.0+x0^9.0*x01*0.006666666666666667*xyza^50.0-x01/16.0*xyza^16.0-1.0/1.3333333333333333*xyza^4.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "14.666666666666666*xyza^10.0-108.0*xyza^8.0-x0^31.0*630.0*xyza^69.0+18.0*xyza^23.0+x0^6.0*75.0*xyza^99.0+x0^9.0*x01*2.2777777777777777*xyza^81.0+x0^9.0*x01*16.333333333333332*xyza^48.0-x01*15.0*xyza^14.0-9.0*xyza^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "14.666666666666666*10.0*xyza^9.0-108.0*8.0*xyza^7.0-x0^31.0*630.0*69.0*xyza^68.0+18.0*23.0*xyza^22.0+x0^6.0*75.0*99.0*xyza^98.0+x0^9.0*x01*2.2777777777777777*81.0*xyza^80.0+x0^9.0*x01*16.333333333333332*48.0*xyza^47.0-x01*15.0*14.0*xyza^13.0-9.0*2.0*xyza^1.0";
 UsageCalculus.EqnSolArrayMap2[2] = "146.66666666666666*xyza^9.0-864.0*xyza^7.0-x0^31.0*43470.0*xyza^68.0+414.0*xyza^22.0+x0^6.0*7425.0*xyza^98.0+x0^9.0*x01*184.5*xyza^80.0+x0^9.0*x01*784.0*xyza^47.0-x01*210.0*xyza^13.0-18.0*xyza";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/9.0*xyza^12.0-1.2*xyza^10.0-x0^31.0/7.888888888888889*xyza^71.0+0.030000000000000006*xyza^25.0+x0^6.0*0.007425742574257426*xyza^101.0+x0^9.0*x01*3.3467202141900936E-4*xyza^83.0-4.0*xyza^83.0+x0^9.0*x01*0.006666666666666667*xyza^50.0-x01/16.0*xyza^16.0-1.0/1.3333333333333333*xyza^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/9.0/13.0*xyza^13.0-1.2/11.0*xyza^11.0-x0^31.0/7.888888888888889/72.0*xyza^72.0+0.030000000000000006/26.0*xyza^26.0+x0^6.0*0.007425742574257426/102.0*xyza^102.0+x0^9.0*x01*3.3467202141900936E-4/84.0*xyza^84.0-4.0/84.0*xyza^84.0+x0^9.0*x01*0.006666666666666667/51.0*xyza^51.0-x01/16.0/17.0*xyza^17.0-1.0/1.3333333333333333/5.0*xyza^5.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/117.0*xyza^13.0-0.10909090909090909*xyza^11.0-x0^31.0/568.0*xyza^72.0+0.0011538461538461542*xyza^26.0+x0^6.0*7.280139778683751E-5*xyza^102.0+x0^9.0*x01/250992.0*xyza^84.0-1.0/21.0*xyza^84.0-0.047619047619047616*xyza^84.0+x0^9.0*x01*1.3071895424836603E-4*xyza^51.0-x01/272.0*xyza^17.0-1.0/6.666666666666666*xyza^5.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "146.66666666666666*xyza^9.0-864.0*xyza^7.0-x0^31.0*43470.0*xyza^68.0+414.0*xyza^22.0+x0^6.0*7425.0*xyza^98.0+x0^9.0*x01*184.5*xyza^80.0+x0^9.0*x01*784.0*xyza^47.0-x01*210.0*xyza^13.0-18.0*xyza";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "146.66666666666666*9.0*xyza^8.0-864.0*7.0*xyza^6.0-x0^31.0*43470.0*68.0*xyza^67.0+414.0*22.0*xyza^21.0+x0^6.0*7425.0*98.0*xyza^97.0+x0^9.0*x01*184.5*80.0*xyza^79.0+x0^9.0*x01*784.0*47.0*xyza^46.0-x01*210.0*13.0*xyza^12.0-18.0";
 UsageCalculus.EqnSolArrayMap2[3] = "1320.0*xyza^8.0-6048.0*xyza^6.0-x0^31.0*2955960.0*xyza^67.0+9108.0*xyza^21.0+x0^6.0*727650.0*xyza^97.0+x0^9.0*x01*14760.0*xyza^79.0+x0^9.0*x01*36848.0*xyza^46.0-x01*2730.0*xyza^12.0-18.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/117.0*xyza^13.0-0.10909090909090909*xyza^11.0-x0^31.0/568.0*xyza^72.0+0.0011538461538461542*xyza^26.0+x0^6.0*7.280139778683751E-5*xyza^102.0-5.0*xyza^102.0+x0^9.0*x01/250992.0*xyza^84.0-1.0/21.0*xyza^84.0-0.047619047619047616*xyza^84.0+x0^9.0*x01*1.3071895424836603E-4*xyza^51.0-4.0*xyza^51.0-x01/272.0*xyza^17.0-1.0/6.666666666666666*xyza^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/117.0/14.0*xyza^14.0-0.10909090909090909/12.0*xyza^12.0-x0^31.0/568.0/73.0*xyza^73.0+0.0011538461538461542/27.0*xyza^27.0+x0^6.0*7.280139778683751E-5/103.0*xyza^103.0-5.0/103.0*xyza^103.0+x0^9.0*x01/250992.0/85.0*xyza^85.0-1.0/21.0/85.0*xyza^85.0-0.047619047619047616/85.0*xyza^85.0+x0^9.0*x01*1.3071895424836603E-4/52.0*xyza^52.0-4.0/52.0*xyza^52.0-x01/272.0/18.0*xyza^18.0-1.0/6.666666666666666/6.0*xyza^6.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/1638.0*xyza^14.0-0.00909090909090909*xyza^12.0-x0^31.0/41464.0*xyza^73.0+4.273504273504275E-5*xyza^27.0+x0^6.0/1414808.0*xyza^103.0-1.0/20.6*xyza^103.0-0.04854368932038835*xyza^103.0+x0^9.0*x01/2.133432E7*xyza^85.0-1.0/1785.0*xyza^85.0-5.602240896358543E-4*xyza^85.0+x0^9.0*x01/397799.99999999994*xyza^52.0-1.0/13.0*xyza^52.0-0.07692307692307693*xyza^52.0-x01/4896.0*xyza^18.0-1.0/40.0*xyza^6.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "1320.0*xyza^8.0-6048.0*xyza^6.0-x0^31.0*2955960.0*xyza^67.0+9108.0*xyza^21.0+x0^6.0*727650.0*xyza^97.0+x0^9.0*x01*14760.0*xyza^79.0+x0^9.0*x01*36848.0*xyza^46.0-x01*2730.0*xyza^12.0-18.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "1320.0*8.0*xyza^7.0-6048.0*6.0*xyza^5.0-x0^31.0*2955960.0*67.0*xyza^66.0+9108.0*21.0*xyza^20.0+x0^6.0*727650.0*97.0*xyza^96.0+x0^9.0*x01*14760.0*79.0*xyza^78.0+x0^9.0*x01*36848.0*46.0*xyza^45.0-x01*2730.0*12.0*xyza^11.0-18.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "10560.0*xyza^7.0-36288.0*xyza^5.0-x0^31.0*1.9804932E8*xyza^66.0+191268.0*xyza^20.0+x0^6.0*7.058205E7*xyza^96.0+x0^9.0*x01*1166040.0*xyza^78.0+x0^9.0*x01*1695008.0*xyza^45.0-x01*32760.0*xyza^11.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/1638.0*xyza^14.0-0.00909090909090909*xyza^12.0-x0^31.0/41464.0*xyza^73.0+4.273504273504275E-5*xyza^27.0-5.0*xyza^27.0+x0^6.0/1414808.0*xyza^103.0-1.0/20.6*xyza^103.0-0.04854368932038835*xyza^103.0+x0^9.0*x01/2.133432E7*xyza^85.0-1.0/1785.0*xyza^85.0-5.602240896358543E-4*xyza^85.0-4.0*xyza^85.0+x0^9.0*x01/397799.99999999994*xyza^52.0-1.0/13.0*xyza^52.0-0.07692307692307693*xyza^52.0-x01/4896.0*xyza^18.0-1.0/40.0*xyza^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/1638.0/15.0*xyza^15.0-0.00909090909090909/13.0*xyza^13.0-x0^31.0/41464.0/74.0*xyza^74.0+4.273504273504275E-5/28.0*xyza^28.0-5.0/28.0*xyza^28.0+x0^6.0/1414808.0/104.0*xyza^104.0-1.0/20.6/104.0*xyza^104.0-0.04854368932038835/104.0*xyza^104.0+x0^9.0*x01/2.133432E7/86.0*xyza^86.0-1.0/1785.0/86.0*xyza^86.0-5.602240896358543E-4/86.0*xyza^86.0-4.0/86.0*xyza^86.0+x0^9.0*x01/397799.99999999994/53.0*xyza^53.0-1.0/13.0/53.0*xyza^53.0-0.07692307692307693/53.0*xyza^53.0-x01/4896.0/19.0*xyza^19.0-1.0/40.0/7.0*xyza^7.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/24570.0*xyza^15.0-6.993006993006993E-4*xyza^13.0-x0^31.0/3068336.0*xyza^74.0+1.0/655199.9999999998*xyza^28.0-1.0/5.6*xyza^28.0-0.17857142857142858*xyza^28.0+x0^6.0/1.47140032E8*xyza^104.0-1.0/2142.4*xyza^104.0-4.667662434652726E-4*xyza^104.0+x0^9.0*x01/1.83475152E9*xyza^86.0-1.0/153510.0*xyza^86.0-1.0/153510.0*xyza^86.0-1.0/21.5*xyza^86.0-0.046511627906976744*xyza^86.0+x0^9.0*x01/2.1083399999999996E7*xyza^53.0-1.0/689.0*xyza^53.0-0.001451378809869376*xyza^53.0-x01/93024.0*xyza^19.0-1.0/280.0*xyza^7.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131379() {
 UsageCalculus.TestCase = 131379;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*x^3^2*+4*x^1^34*x0^31*x^2^4*--3*x^3^5/-4*x^1^6*+1*x^2^7-3*x^3^5/-4*x^1^6*+1*x^2^74*x0^6*+1*x0^71*x^2^7-3*x^3^8/4*x^1^9*-1*x^2^10/--3*x^34*x0^9*-1*x0^10/--3*x01*x^2^10/--3*x^3-3*x^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=378 EqnNumber=79 FamilyID=1 MotifTag=1 Entropy=4 FuncWrapAliasID=1"+
"// MetaRow=[12, 79, 10, 2, 1, 3, 1, 5, 1, 1, 2, 1, 2, 3, 4, 3, 1, 1, 4, 3, 4, 16, 2, 3, 1, 1, 4, 3, 4, 2, 3, 13]"+
"// DOEMatrixRow=[4, 79, 18, 2, 1, 3, 2, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 11, 10, 3, 1, 5, 1, 2, 3, 2, 1, 2, 4, 16, 2]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-9.0*x^70.0+1.0/1.3333333333333333*x^24.0+1.0/1.3333333333333333*x^100.0+1.0/36.0*x^82.0+1.0/3.0*x^49.0-x^15.0-3.0*x^3.0-3.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-9.0*70.0*x^69.0+1.0/1.3333333333333333*24.0*x^23.0+1.0/1.3333333333333333*100.0*x^99.0+1.0/36.0*82.0*x^81.0+1.0/3.0*49.0*x^48.0-15.0*x^14.0-3.0*3.0*x^2.0-3.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-630.0*x^69.0+18.0*x^23.0+75.0*x^99.0+2.2777777777777777*x^81.0+16.333333333333332*x^48.0-15.0*x^14.0-9.0*x^2.0-9.0*x^2.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-9.0*x^70.0+1.0/1.3333333333333333*x^24.0+1.0/1.3333333333333333*x^100.0+1.0/36.0*x^82.0+1.0/3.0*x^49.0-x^15.0-3.0*x^3.0-3.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-9.0/71.0*x^71.0+1.0/1.3333333333333333/25.0*x^25.0+1.0/1.3333333333333333/101.0*x^101.0+1.0/36.0/83.0*x^83.0+1.0/3.0/50.0*x^50.0-1.0/16.0*x^16.0-3.0/4.0*x^4.0-3.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/7.888888888888889*x^71.0+1.0/33.33333333333333*x^25.0+1.0/134.66666666666666*x^101.0+1.0/2988.0*x^83.0+1.0/150.0*x^50.0-1.0/16.0*x^16.0-1.0/1.3333333333333333*x^4.0-1.0/1.3333333333333333*x^4.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-630.0*x^69.0+18.0*x^23.0+75.0*x^99.0+2.2777777777777777*x^81.0+16.333333333333332*x^48.0-15.0*x^14.0-9.0*x^2.0-9.0*x^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-630.0*69.0*x^68.0+18.0*23.0*x^22.0+75.0*99.0*x^98.0+2.2777777777777777*81.0*x^80.0+16.333333333333332*48.0*x^47.0-15.0*14.0*x^13.0-9.0*2.0*x^1.0-9.0*2.0*x^1.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-43470.0*x^68.0+414.0*x^22.0+7425.0*x^98.0+184.5*x^80.0+784.0*x^47.0-210.0*x^13.0-18.0*x-18.0*x";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/7.888888888888889*x^71.0+1.0/33.33333333333333*x^25.0+1.0/134.66666666666666*x^101.0+1.0/2988.0*x^83.0+1.0/150.0*x^50.0-1.0/16.0*x^16.0-1.0/1.3333333333333333*x^4.0-1.0/1.3333333333333333*x^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/7.888888888888889/72.0*x^72.0+1.0/33.33333333333333/26.0*x^26.0+1.0/134.66666666666666/102.0*x^102.0+1.0/2988.0/84.0*x^84.0+1.0/150.0/51.0*x^51.0-1.0/16.0/17.0*x^17.0-1.0/1.3333333333333333/5.0*x^5.0-1.0/1.3333333333333333/5.0*x^5.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/568.0*x^72.0+1.0/866.6666666666665*x^26.0+1.0/13735.999999999998*x^102.0+1.0/250992.0*x^84.0+1.0/7650.0*x^51.0-1.0/272.0*x^17.0-1.0/6.666666666666666*x^5.0-1.0/6.666666666666666*x^5.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-43470.0*x^68.0+414.0*x^22.0+7425.0*x^98.0+184.5*x^80.0+784.0*x^47.0-210.0*x^13.0-18.0*x-18.0*x";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-43470.0*68.0*x^67.0+414.0*22.0*x^21.0+7425.0*98.0*x^97.0+184.5*80.0*x^79.0+784.0*47.0*x^46.0-210.0*13.0*x^12.0-18.0-18.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-2955960.0*x^67.0+9108.0*x^21.0+727650.0*x^97.0+14760.0*x^79.0+36848.0*x^46.0-2730.0*x^12.0-18.0-18.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/568.0*x^72.0+1.0/866.6666666666665*x^26.0+1.0/13735.999999999998*x^102.0+1.0/250992.0*x^84.0+1.0/7650.0*x^51.0-1.0/272.0*x^17.0-1.0/6.666666666666666*x^5.0-1.0/6.666666666666666*x^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/568.0/73.0*x^73.0+1.0/866.6666666666665/27.0*x^27.0+1.0/13735.999999999998/103.0*x^103.0+1.0/250992.0/85.0*x^85.0+1.0/7650.0/52.0*x^52.0-1.0/272.0/18.0*x^18.0-1.0/6.666666666666666/6.0*x^6.0-1.0/6.666666666666666/6.0*x^6.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/41464.0*x^73.0+1.0/23399.999999999996*x^27.0+1.0/1414807.9999999998*x^103.0+1.0/2.133432E7*x^85.0+1.0/397800.0*x^52.0-1.0/4896.0*x^18.0-1.0/40.0*x^6.0-1.0/40.0*x^6.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-2955960.0*x^67.0+9108.0*x^21.0+727650.0*x^97.0+14760.0*x^79.0+36848.0*x^46.0-2730.0*x^12.0-18.0-18.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-2955960.0*67.0*x^66.0+9108.0*21.0*x^20.0+727650.0*97.0*x^96.0+14760.0*79.0*x^78.0+36848.0*46.0*x^45.0-2730.0*12.0*x^11.0-18.0*0.0-18.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1.9804932E8*x^66.0+191268.0*x^20.0+7.058205E7*x^96.0+1166040.0*x^78.0+1695008.0*x^45.0-32760.0*x^11.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/41464.0*x^73.0+1.0/23399.999999999996*x^27.0+1.0/1414807.9999999998*x^103.0+1.0/2.133432E7*x^85.0+1.0/397800.0*x^52.0-1.0/4896.0*x^18.0-1.0/40.0*x^6.0-1.0/40.0*x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/41464.0/74.0*x^74.0+1.0/23399.999999999996/28.0*x^28.0+1.0/1414807.9999999998/104.0*x^104.0+1.0/86.0*x^86.0+1.0/397800.0/53.0*x^53.0-1.0/4896.0/19.0*x^19.0-1.0/40.0/7.0*x^7.0-1.0/40.0/7.0*x^7.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/3068336.0*x^74.0+1.0/655199.9999999999*x^28.0+1.0/1.4714003199999997E8*x^104.0+1.0/86.0*x^86.0+1.0/2.10834E7*x^53.0-1.0/93024.0*x^19.0-1.0/280.0*x^7.0-1.0/280.0*x^7.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131380() {
 UsageCalculus.TestCase = 131380;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "4*x0^31*xy^2^4*--3*xy^3^5/-4*xy^1^6*+1*xy^2^7-3*xy^3^5/-4*xy^1^6*+1*xy^2^74*x0^6*+1*x0^71*xy^2^7-3*xy^3^8/4*xy^1^9*-1*xy^2^10/--3*xy^34*x0^9*-1*x0^10/--3*x01*xy^2^10/--3*xy^3-3*xy^34*x0^2*1*x0^3/-3*x0^4*-4*x0^5";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=379 EqnNumber=80 FamilyID=2 MotifTag=3 Entropy=1 FuncWrapAliasID=3"+
"// MetaRow=[12, 80, 10, 1, 2, 1, 2, 6, 2, 3, 4, 2, 3, 1, 1, 1, 2, 1, 5, 1, 1, 1, 3, 1, 2, 3, 5, 1, 1, 3, 4, 14]"+
"// DOEMatrixRow=[4, 80, 17, 1, 3, 1, 3, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 12, 1, 1, 2, 1, 2, 3, 4, 3, 2, 3, 1, 1, 1]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^31.0*3.0*xy^30.0+1.0/1.3333333333333333*xy^24.0+x0^6.0/1.3333333333333333*xy^100.0+x0^9.0*x01/36.0*xy^82.0+x0^9.0*x01/3.0*xy^49.0-x01*xy^15.0-3.0*xy^3.0-x0^2.0*4.0*xy^34.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^31.0*3.0*30.0*xy^29.0+1.0/1.3333333333333333*24.0*xy^23.0+x0^6.0/1.3333333333333333*100.0*xy^99.0+x0^9.0*x01/36.0*82.0*xy^81.0+x0^9.0*x01/3.0*49.0*xy^48.0-x01*15.0*xy^14.0-3.0*3.0*xy^2.0-x0^2.0*4.0*34.0*xy^33.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^31.0*90.0*xy^29.0+18.0*xy^23.0+x0^6.0*75.0*xy^99.0+x0^9.0*x01*2.2777777777777777*xy^81.0+x0^9.0*x01*16.333333333333332*xy^48.0-x01*15.0*xy^14.0-9.0*xy^2.0-x0^2.0*136.0*xy^33.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^31.0*3.0*xy^30.0+1.0/1.3333333333333333*xy^24.0+x0^6.0/1.3333333333333333*xy^100.0+x0^9.0*x01/36.0*xy^82.0+x0^9.0*x01/3.0*xy^49.0-x01*xy^15.0-3.0*xy^3.0-x0^2.0*4.0*xy^34.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^31.0*3.0/31.0*xy^31.0+1.0/1.3333333333333333/25.0*xy^25.0+x0^6.0/1.3333333333333333/101.0*xy^101.0+x0^9.0*x01/36.0/83.0*xy^83.0+x0^9.0*x01/3.0/50.0*xy^50.0-x01/16.0*xy^16.0-3.0/4.0*xy^4.0-x0^2.0*4.0/35.0*xy^35.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^31.0/10.333333333333334*xy^31.0+0.030000000000000006*xy^25.0+x0^6.0*0.007425742574257426*xy^101.0+x0^9.0*x01*3.3467202141900936E-4*xy^83.0+x0^9.0*x01*0.006666666666666667*xy^50.0-x01/16.0*xy^16.0-0.75*xy^4.0-x0^2.0/8.75*xy^35.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^31.0*90.0*xy^29.0+18.0*xy^23.0+x0^6.0*75.0*xy^99.0+x0^9.0*x01*2.2777777777777777*xy^81.0+x0^9.0*x01*16.333333333333332*xy^48.0-x01*15.0*xy^14.0-9.0*xy^2.0-x0^2.0*136.0*xy^33.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^31.0*90.0*29.0*xy^28.0+18.0*23.0*xy^22.0+x0^6.0*75.0*99.0*xy^98.0+x0^9.0*x01*2.2777777777777777*81.0*xy^80.0+x0^9.0*x01*16.333333333333332*48.0*xy^47.0-x01*15.0*14.0*xy^13.0-9.0*2.0*xy^1.0-x0^2.0*136.0*33.0*xy^32.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^31.0*2610.0*xy^28.0+414.0*xy^22.0+x0^6.0*7425.0*xy^98.0+x0^9.0*x01*184.5*xy^80.0+x0^9.0*x01*784.0*xy^47.0-x01*210.0*xy^13.0-18.0*xy-x0^2.0*4488.0*xy^32.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^31.0/10.333333333333334*xy^31.0+0.030000000000000006*xy^25.0+x0^6.0*0.007425742574257426*xy^101.0+x0^9.0*x01*3.3467202141900936E-4*xy^83.0-4.0*xy^83.0+x0^9.0*x01*0.006666666666666667*xy^50.0-x01/16.0*xy^16.0-0.75*xy^4.0-x0^2.0/8.75*xy^35.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^31.0/10.333333333333334/32.0*xy^32.0+0.030000000000000006/26.0*xy^26.0+x0^6.0*0.007425742574257426/102.0*xy^102.0+x0^9.0*x01*3.3467202141900936E-4/84.0*xy^84.0-4.0/84.0*xy^84.0+x0^9.0*x01*0.006666666666666667/51.0*xy^51.0-x01/16.0/17.0*xy^17.0-0.75/5.0*xy^5.0-x0^2.0*8.75/36.0*xy^36.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^31.0/330.6666666666667*xy^32.0+0.0011538461538461542*xy^26.0+x0^6.0*7.280139778683751E-5*xy^102.0+x0^9.0*x01/250992.0*xy^84.0-1.0/21.0*xy^84.0-0.047619047619047616*xy^84.0+x0^9.0*x01*1.3071895424836603E-4*xy^51.0-x01/272.0*xy^17.0-0.15*xy^5.0-x0^2.0/4.114285714285714*xy^36.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^31.0*2610.0*xy^28.0+414.0*xy^22.0+x0^6.0*7425.0*xy^98.0+x0^9.0*x01*184.5*xy^80.0+x0^9.0*x01*784.0*xy^47.0-x01*210.0*xy^13.0-18.0*xy-x0^2.0*4488.0*xy^32.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^31.0*2610.0*28.0*xy^27.0+414.0*22.0*xy^21.0+x0^6.0*7425.0*98.0*xy^97.0+x0^9.0*x01*184.5*80.0*xy^79.0+x0^9.0*x01*784.0*47.0*xy^46.0-x01*210.0*13.0*xy^12.0-18.0-x0^2.0*4488.0*32.0*xy^31.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^31.0*73080.0*xy^27.0+9108.0*xy^21.0+x0^6.0*727650.0*xy^97.0+x0^9.0*x01*14760.0*xy^79.0+x0^9.0*x01*36848.0*xy^46.0-x01*2730.0*xy^12.0-18.0-x0^2.0*143616.0*xy^31.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^31.0/330.6666666666667*xy^32.0+0.0011538461538461542*xy^26.0+x0^6.0*7.280139778683751E-5*xy^102.0-5.0*xy^102.0+x0^9.0*x01/250992.0*xy^84.0-1.0/21.0*xy^84.0-0.047619047619047616*xy^84.0+x0^9.0*x01*1.3071895424836603E-4*xy^51.0-4.0*xy^51.0-x01/272.0*xy^17.0-0.15*xy^5.0-x0^2.0/4.114285714285714*xy^36.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^31.0/330.6666666666667/33.0*xy^33.0+0.0011538461538461542/27.0*xy^27.0+x0^6.0*7.280139778683751E-5/103.0*xy^103.0-5.0/103.0*xy^103.0+x0^9.0*x01/250992.0/85.0*xy^85.0-1.0/21.0/85.0*xy^85.0-0.047619047619047616/85.0*xy^85.0+x0^9.0*x01*1.3071895424836603E-4/52.0*xy^52.0-4.0/52.0*xy^52.0-x01/272.0/18.0*xy^18.0-0.15/6.0*xy^6.0-x0^2.0*4.114285714285714/37.0*xy^37.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^31.0/10912.0*xy^33.0+4.273504273504275E-5*xy^27.0+x0^6.0/1414808.0*xy^103.0-1.0/20.6*xy^103.0-0.04854368932038835*xy^103.0+x0^9.0*x01/2.133432E7*xy^85.0-1.0/1785.0*xy^85.0-5.602240896358543E-4*xy^85.0+x0^9.0*x01/397799.99999999994*xy^52.0-1.0/13.0*xy^52.0-0.07692307692307693*xy^52.0-x01/4896.0*xy^18.0-0.024999999999999998*xy^6.0-x0^2.0/8.993055555555557*xy^37.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^31.0*73080.0*xy^27.0+9108.0*xy^21.0+x0^6.0*727650.0*xy^97.0+x0^9.0*x01*14760.0*xy^79.0+x0^9.0*x01*36848.0*xy^46.0-x01*2730.0*xy^12.0-18.0-x0^2.0*143616.0*xy^31.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^31.0*73080.0*27.0*xy^26.0+9108.0*21.0*xy^20.0+x0^6.0*727650.0*97.0*xy^96.0+x0^9.0*x01*14760.0*79.0*xy^78.0+x0^9.0*x01*36848.0*46.0*xy^45.0-x01*2730.0*12.0*xy^11.0-18.0*0.0-x0^2.0*143616.0*31.0*xy^30.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^31.0*1973160.0*xy^26.0+191268.0*xy^20.0+x0^6.0*7.058205E7*xy^96.0+x0^9.0*x01*1166040.0*xy^78.0+x0^9.0*x01*1695008.0*xy^45.0-x01*32760.0*xy^11.0-x0^2.0*4452096.0*xy^30.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^31.0/10912.0*xy^33.0+4.273504273504275E-5*xy^27.0-5.0*xy^27.0+x0^6.0/1414808.0*xy^103.0-1.0/20.6*xy^103.0-0.04854368932038835*xy^103.0+x0^9.0*x01/2.133432E7*xy^85.0-1.0/1785.0*xy^85.0-5.602240896358543E-4*xy^85.0-4.0*xy^85.0+x0^9.0*x01/397799.99999999994*xy^52.0-1.0/13.0*xy^52.0-0.07692307692307693*xy^52.0-x01/4896.0*xy^18.0-0.024999999999999998*xy^6.0-x0^2.0/8.993055555555557*xy^37.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^31.0/10912.0/34.0*xy^34.0+4.273504273504275E-5/28.0*xy^28.0-5.0/28.0*xy^28.0+x0^6.0/1414808.0/104.0*xy^104.0-1.0/20.6/104.0*xy^104.0-0.04854368932038835/104.0*xy^104.0+x0^9.0*x01/2.133432E7/86.0*xy^86.0-1.0/1785.0/86.0*xy^86.0-5.602240896358543E-4/86.0*xy^86.0-4.0/86.0*xy^86.0+x0^9.0*x01/397799.99999999994/53.0*xy^53.0-1.0/13.0/53.0*xy^53.0-0.07692307692307693/53.0*xy^53.0-x01/4896.0/19.0*xy^19.0-0.024999999999999998/7.0*xy^7.0-x0^2.0*8.993055555555557/38.0*xy^38.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^31.0/371008.0*xy^34.0+1.0/655199.9999999998*xy^28.0-1.0/5.6*xy^28.0-0.17857142857142858*xy^28.0+x0^6.0/1.47140032E8*xy^104.0-1.0/2142.4*xy^104.0-4.667662434652726E-4*xy^104.0+x0^9.0*x01/1.83475152E9*xy^86.0-1.0/153510.0*xy^86.0-1.0/153510.0*xy^86.0-1.0/21.5*xy^86.0-0.046511627906976744*xy^86.0+x0^9.0*x01/2.1083399999999996E7*xy^53.0-1.0/689.0*xy^53.0-0.001451378809869376*xy^53.0-x01/93024.0*xy^19.0-0.0035714285714285713*xy^7.0-x0^2.0/4.225482625482624*xy^38.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131381() {
 UsageCalculus.TestCase = 131381;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xyz^2^4*--3*xyz^3^5/-4*xyz^1^6*+1*xyz^2^7-3*xyz^3^5/-4*xyz^1^6*+1*xyz^2^74*x0^6*+1*x0^71*xyz^2^7-3*xyz^3^8/4*xyz^1^9*-1*xyz^2^10/--3*xyz^34*x0^9*-1*x0^10/--3*x01*xyz^2^10/--3*xyz^3-3*xyz^34*x0^2*1*x0^3/-3*x0^4*-4*x0^51*xyz^2^3/-3*xyz^3^4*-4*xyz^1^5";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=380 EqnNumber=81 FamilyID=3 MotifTag=4 Entropy=3 FuncWrapAliasID=4"+
"// MetaRow=[12, 81, 10, 20, 3, 2, 3, 7, 3, 4, 1, 1, 1, 2, 3, 2, 3, 2, 1, 2, 3, 2, 1, 2, 3, 4, 6, 2, 3, 4, 1, 15]"+
"// DOEMatrixRow=[5, 81, 17, 4, 2, 3, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 13, 2, 3, 1, 2, 3, 1, 5, 4, 3, 1, 2, 3, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "1.0/1.3333333333333333*xyz^30.0+1.0/1.3333333333333333*xyz^24.0+x0^6.0/1.3333333333333333*xyz^100.0+x0^9.0*x01/36.0*xyz^82.0+x0^9.0*x01/3.0*xyz^49.0-x01*xyz^15.0-3.0*xyz^3.0-x0^2.0*5.333333333333333*xyz^52.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/1.3333333333333333*30.0*xyz^29.0+1.0/1.3333333333333333*24.0*xyz^23.0+x0^6.0/1.3333333333333333*100.0*xyz^99.0+x0^9.0*x01/36.0*82.0*xyz^81.0+x0^9.0*x01/3.0*49.0*xyz^48.0-x01*15.0*xyz^14.0-3.0*3.0*xyz^2.0-x0^2.0*5.333333333333333*52.0*xyz^51.0";
 UsageCalculus.EqnSolArrayMap2[1] = "22.5*xyz^29.0+18.0*xyz^23.0+x0^6.0*75.0*xyz^99.0+x0^9.0*x01*2.2777777777777777*xyz^81.0+x0^9.0*x01*16.333333333333332*xyz^48.0-x01*15.0*xyz^14.0-9.0*xyz^2.0-x0^2.0*277.3333333333333*xyz^51.0";
 UsageCalculus.EqnSolArrayMap3[1] = "1.0/1.3333333333333333*xyz^30.0+1.0/1.3333333333333333*xyz^24.0+x0^6.0/1.3333333333333333*xyz^100.0+x0^9.0*x01/36.0*xyz^82.0+x0^9.0*x01/3.0*xyz^49.0-x01*xyz^15.0-3.0*xyz^3.0-x0^2.0*5.333333333333333*xyz^52.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0/1.3333333333333333/31.0*xyz^31.0+1.0/1.3333333333333333/25.0*xyz^25.0+x0^6.0/1.3333333333333333/101.0*xyz^101.0+x0^9.0*x01/36.0/83.0*xyz^83.0+x0^9.0*x01/3.0/50.0*xyz^50.0-x01/16.0*xyz^16.0-3.0/4.0*xyz^4.0-x0^2.0*5.333333333333333/53.0*xyz^53.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/41.33333333333333*xyz^31.0+0.030000000000000006*xyz^25.0+x0^6.0*0.007425742574257426*xyz^101.0+x0^9.0*x01*3.3467202141900936E-4*xyz^83.0+x0^9.0*x01*0.006666666666666667*xyz^50.0-x01/16.0*xyz^16.0-0.75*xyz^4.0-x0^2.0/9.9375*xyz^53.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "22.5*xyz^29.0+18.0*xyz^23.0+x0^6.0*75.0*xyz^99.0+x0^9.0*x01*2.2777777777777777*xyz^81.0+x0^9.0*x01*16.333333333333332*xyz^48.0-x01*15.0*xyz^14.0-9.0*xyz^2.0-x0^2.0*277.3333333333333*xyz^51.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "22.5*29.0*xyz^28.0+18.0*23.0*xyz^22.0+x0^6.0*75.0*99.0*xyz^98.0+x0^9.0*x01*2.2777777777777777*81.0*xyz^80.0+x0^9.0*x01*16.333333333333332*48.0*xyz^47.0-x01*15.0*14.0*xyz^13.0-9.0*2.0*xyz^1.0-x0^2.0*277.3333333333333*51.0*xyz^50.0";
 UsageCalculus.EqnSolArrayMap2[2] = "652.5*xyz^28.0+414.0*xyz^22.0+x0^6.0*7425.0*xyz^98.0+x0^9.0*x01*184.5*xyz^80.0+x0^9.0*x01*784.0*xyz^47.0-x01*210.0*xyz^13.0-18.0*xyz-x0^2.0*14143.999999999998*xyz^50.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/41.33333333333333*xyz^31.0+0.030000000000000006*xyz^25.0+x0^6.0*0.007425742574257426*xyz^101.0+x0^9.0*x01*3.3467202141900936E-4*xyz^83.0-4.0*xyz^83.0+x0^9.0*x01*0.006666666666666667*xyz^50.0-x01/16.0*xyz^16.0-0.75*xyz^4.0-x0^2.0/9.9375*xyz^53.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/41.33333333333333/32.0*xyz^32.0+0.030000000000000006/26.0*xyz^26.0+x0^6.0*0.007425742574257426/102.0*xyz^102.0+x0^9.0*x01*3.3467202141900936E-4/84.0*xyz^84.0-4.0/84.0*xyz^84.0+x0^9.0*x01*0.006666666666666667/51.0*xyz^51.0-x01/16.0/17.0*xyz^17.0-0.75/5.0*xyz^5.0-x0^2.0*9.9375/54.0*xyz^54.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/1322.6666666666665*xyz^32.0+0.0011538461538461542*xyz^26.0+x0^6.0*7.280139778683751E-5*xyz^102.0+x0^9.0*x01/250992.0*xyz^84.0-1.0/21.0*xyz^84.0-0.047619047619047616*xyz^84.0+x0^9.0*x01*1.3071895424836603E-4*xyz^51.0-x01/272.0*xyz^17.0-0.15*xyz^5.0-x0^2.0/5.433962264150943*xyz^54.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "652.5*xyz^28.0+414.0*xyz^22.0+x0^6.0*7425.0*xyz^98.0+x0^9.0*x01*184.5*xyz^80.0+x0^9.0*x01*784.0*xyz^47.0-x01*210.0*xyz^13.0-18.0*xyz-x0^2.0*14143.999999999998*xyz^50.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "652.5*28.0*xyz^27.0+414.0*22.0*xyz^21.0+x0^6.0*7425.0*98.0*xyz^97.0+x0^9.0*x01*184.5*80.0*xyz^79.0+x0^9.0*x01*784.0*47.0*xyz^46.0-x01*210.0*13.0*xyz^12.0-18.0-x0^2.0*14143.999999999998*50.0*xyz^49.0";
 UsageCalculus.EqnSolArrayMap2[3] = "18270.0*xyz^27.0+9108.0*xyz^21.0+x0^6.0*727650.0*xyz^97.0+x0^9.0*x01*14760.0*xyz^79.0+x0^9.0*x01*36848.0*xyz^46.0-x01*2730.0*xyz^12.0-18.0-x0^2.0*707199.9999999999*xyz^49.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/1322.6666666666665*xyz^32.0+0.0011538461538461542*xyz^26.0+x0^6.0*7.280139778683751E-5*xyz^102.0-5.0*xyz^102.0+x0^9.0*x01/250992.0*xyz^84.0-1.0/21.0*xyz^84.0-0.047619047619047616*xyz^84.0+x0^9.0*x01*1.3071895424836603E-4*xyz^51.0-4.0*xyz^51.0-x01/272.0*xyz^17.0-0.15*xyz^5.0-x0^2.0/5.433962264150943*xyz^54.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/1322.6666666666665/33.0*xyz^33.0+0.0011538461538461542/27.0*xyz^27.0+x0^6.0*7.280139778683751E-5/103.0*xyz^103.0-5.0/103.0*xyz^103.0+x0^9.0*x01/250992.0/85.0*xyz^85.0-1.0/21.0/85.0*xyz^85.0-0.047619047619047616/85.0*xyz^85.0+x0^9.0*x01*1.3071895424836603E-4/52.0*xyz^52.0-4.0/52.0*xyz^52.0-x01/272.0/18.0*xyz^18.0-0.15/6.0*xyz^6.0-x0^2.0*5.433962264150943/55.0*xyz^55.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/43647.99999999999*xyz^33.0+4.273504273504275E-5*xyz^27.0+x0^6.0/1414808.0*xyz^103.0-1.0/20.6*xyz^103.0-0.04854368932038835*xyz^103.0+x0^9.0*x01/2.133432E7*xyz^85.0-1.0/1785.0*xyz^85.0-5.602240896358543E-4*xyz^85.0+x0^9.0*x01/397799.99999999994*xyz^52.0-1.0/13.0*xyz^52.0-0.07692307692307693*xyz^52.0-x01/4896.0*xyz^18.0-0.024999999999999998*xyz^6.0-x0^2.0/10.121527777777779*xyz^55.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "18270.0*xyz^27.0+9108.0*xyz^21.0+x0^6.0*727650.0*xyz^97.0+x0^9.0*x01*14760.0*xyz^79.0+x0^9.0*x01*36848.0*xyz^46.0-x01*2730.0*xyz^12.0-18.0-x0^2.0*707199.9999999999*xyz^49.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "18270.0*27.0*xyz^26.0+9108.0*21.0*xyz^20.0+x0^6.0*727650.0*97.0*xyz^96.0+x0^9.0*x01*14760.0*79.0*xyz^78.0+x0^9.0*x01*36848.0*46.0*xyz^45.0-x01*2730.0*12.0*xyz^11.0-18.0*0.0-x0^2.0*707199.9999999999*49.0*xyz^48.0";
 UsageCalculus.EqnSolArrayMap2[4] = "493290.0*xyz^26.0+191268.0*xyz^20.0+x0^6.0*7.058205E7*xyz^96.0+x0^9.0*x01*1166040.0*xyz^78.0+x0^9.0*x01*1695008.0*xyz^45.0-x01*32760.0*xyz^11.0-x0^2.0*3.465279999999999E7*xyz^48.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/43647.99999999999*xyz^33.0+4.273504273504275E-5*xyz^27.0-5.0*xyz^27.0+x0^6.0/1414808.0*xyz^103.0-1.0/20.6*xyz^103.0-0.04854368932038835*xyz^103.0+x0^9.0*x01/2.133432E7*xyz^85.0-1.0/1785.0*xyz^85.0-5.602240896358543E-4*xyz^85.0-4.0*xyz^85.0+x0^9.0*x01/397799.99999999994*xyz^52.0-1.0/13.0*xyz^52.0-0.07692307692307693*xyz^52.0-x01/4896.0*xyz^18.0-0.024999999999999998*xyz^6.0-x0^2.0/10.121527777777779*xyz^55.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/43647.99999999999/34.0*xyz^34.0+4.273504273504275E-5/28.0*xyz^28.0-5.0/28.0*xyz^28.0+x0^6.0/1414808.0/104.0*xyz^104.0-1.0/20.6/104.0*xyz^104.0-0.04854368932038835/104.0*xyz^104.0+x0^9.0*x01/2.133432E7/86.0*xyz^86.0-1.0/1785.0/86.0*xyz^86.0-5.602240896358543E-4/86.0*xyz^86.0-4.0/86.0*xyz^86.0+x0^9.0*x01/397799.99999999994/53.0*xyz^53.0-1.0/13.0/53.0*xyz^53.0-0.07692307692307693/53.0*xyz^53.0-x01/4896.0/19.0*xyz^19.0-0.024999999999999998/7.0*xyz^7.0-x0^2.0*10.121527777777779/56.0*xyz^56.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/1484031.9999999998*xyz^34.0+1.0/655199.9999999998*xyz^28.0-1.0/5.6*xyz^28.0-0.17857142857142858*xyz^28.0+x0^6.0/1.47140032E8*xyz^104.0-1.0/2142.4*xyz^104.0-4.667662434652726E-4*xyz^104.0+x0^9.0*x01/1.83475152E9*xyz^86.0-1.0/153510.0*xyz^86.0-1.0/153510.0*xyz^86.0-1.0/21.5*xyz^86.0-0.046511627906976744*xyz^86.0+x0^9.0*x01/2.1083399999999996E7*xyz^53.0-1.0/689.0*xyz^53.0-0.001451378809869376*xyz^53.0-x01/93024.0*xyz^19.0-0.0035714285714285713*xyz^7.0-x0^2.0/5.532761578044597*xyz^56.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131382() {
 UsageCalculus.TestCase = 131382;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xyza^3^5/-4*xyza^1^6*+1*xyza^2^74*x0^6*+1*x0^71*xyza^2^7-3*xyza^3^8/4*xyza^1^9*-1*xyza^2^10/--3*xyza^34*x0^9*-1*x0^10/--3*x01*xyza^2^10/--3*xyza^3-3*xyza^34*x0^2*1*x0^3/-3*x0^4*-4*x0^51*xyza^2^3/-3*xyza^3^4*-4*xyza^1^5-3*xyza^3^4*-4*xyza^1^5";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=381 EqnNumber=82 FamilyID=1 MotifTag=1 Entropy=4 FuncWrapAliasID=1"+
"// MetaRow=[12, 82, 10, 19, 4, 3, 1, 8, 1, 1, 2, 1, 2, 3, 4, 3, 1, 1, 2, 3, 4, 3, 2, 3, 1, 1, 7, 3, 4, 5, 2, 16]"+
"// DOEMatrixRow=[5, 82, 17, 3, 1, 1, 2, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 14, 3, 1, 2, 3, 1, 2, 6, 1, 1, 2, 3, 4, 1]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^6.0/1.3333333333333333*xyza^100.0+x0^9.0*x01/36.0*xyza^82.0+x0^9.0*x01/3.0*xyza^49.0-x01*xyza^15.0-3.0*xyza^3.0-x0^2.0*5.333333333333333*xyza^52.0+12.0*xyza^13.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^6.0/1.3333333333333333*100.0*xyza^99.0+x0^9.0*x01/36.0*82.0*xyza^81.0+x0^9.0*x01/3.0*49.0*xyza^48.0-x01*15.0*xyza^14.0-3.0*3.0*xyza^2.0-x0^2.0*5.333333333333333*52.0*xyza^51.0+12.0*13.0*xyza^12.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^6.0*75.0*xyza^99.0+x0^9.0*x01*2.2777777777777777*xyza^81.0+x0^9.0*x01*16.333333333333332*xyza^48.0-x01*15.0*xyza^14.0-9.0*xyza^2.0-x0^2.0*277.3333333333333*xyza^51.0+156.0*xyza^12.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^6.0/1.3333333333333333*xyza^100.0+x0^9.0*x01/36.0*xyza^82.0+x0^9.0*x01/3.0*xyza^49.0-x01*xyza^15.0-3.0*xyza^3.0-x0^2.0*5.333333333333333*xyza^52.0+12.0*xyza^13.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^6.0/1.3333333333333333/101.0*xyza^101.0+x0^9.0*x01/36.0/83.0*xyza^83.0+x0^9.0*x01/3.0/50.0*xyza^50.0-x01/16.0*xyza^16.0-3.0/4.0*xyza^4.0-x0^2.0*5.333333333333333/53.0*xyza^53.0+12.0/14.0*xyza^14.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^6.0*0.007425742574257426*xyza^101.0+x0^9.0*x01*3.3467202141900936E-4*xyza^83.0+x0^9.0*x01*0.006666666666666667*xyza^50.0-x01/16.0*xyza^16.0-0.75*xyza^4.0-x0^2.0/9.9375*xyza^53.0+1.0/1.1666666666666667*xyza^14.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^6.0*75.0*xyza^99.0+x0^9.0*x01*2.2777777777777777*xyza^81.0+x0^9.0*x01*16.333333333333332*xyza^48.0-x01*15.0*xyza^14.0-9.0*xyza^2.0-x0^2.0*277.3333333333333*xyza^51.0+156.0*xyza^12.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^6.0*75.0*99.0*xyza^98.0+x0^9.0*x01*2.2777777777777777*81.0*xyza^80.0+x0^9.0*x01*16.333333333333332*48.0*xyza^47.0-x01*15.0*14.0*xyza^13.0-9.0*2.0*xyza^1.0-x0^2.0*277.3333333333333*51.0*xyza^50.0+156.0*12.0*xyza^11.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^6.0*7425.0*xyza^98.0+x0^9.0*x01*184.5*xyza^80.0+x0^9.0*x01*784.0*xyza^47.0-x01*210.0*xyza^13.0-18.0*xyza-x0^2.0*14143.999999999998*xyza^50.0+1872.0*xyza^11.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^6.0*0.007425742574257426*xyza^101.0+x0^9.0*x01*3.3467202141900936E-4*xyza^83.0-4.0*xyza^83.0+x0^9.0*x01*0.006666666666666667*xyza^50.0-x01/16.0*xyza^16.0-0.75*xyza^4.0-x0^2.0/9.9375*xyza^53.0+1.0/1.1666666666666667*xyza^14.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^6.0*0.007425742574257426/102.0*xyza^102.0+x0^9.0*x01*3.3467202141900936E-4/84.0*xyza^84.0-4.0/84.0*xyza^84.0+x0^9.0*x01*0.006666666666666667/51.0*xyza^51.0-x01/16.0/17.0*xyza^17.0-0.75/5.0*xyza^5.0-x0^2.0/9.9375/54.0*xyza^54.0+1.0/1.1666666666666667/15.0*xyza^15.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^6.0*7.280139778683751E-5*xyza^102.0+x0^9.0*x01/250992.0*xyza^84.0-1.0/21.0*xyza^84.0-0.047619047619047616*xyza^84.0+x0^9.0*x01*1.3071895424836603E-4*xyza^51.0-x01/272.0*xyza^17.0-0.15*xyza^5.0-x0^2.0/536.625*xyza^54.0+1.0/17.5*xyza^15.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^6.0*7425.0*xyza^98.0+x0^9.0*x01*184.5*xyza^80.0+x0^9.0*x01*784.0*xyza^47.0-x01*210.0*xyza^13.0-18.0*xyza-x0^2.0*14143.999999999998*xyza^50.0+1872.0*xyza^11.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^6.0*7425.0*98.0*xyza^97.0+x0^9.0*x01*184.5*80.0*xyza^79.0+x0^9.0*x01*784.0*47.0*xyza^46.0-x01*210.0*13.0*xyza^12.0-18.0-x0^2.0*14143.999999999998*50.0*xyza^49.0+1872.0*11.0*xyza^10.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^6.0*727650.0*xyza^97.0+x0^9.0*x01*14760.0*xyza^79.0+x0^9.0*x01*36848.0*xyza^46.0-x01*2730.0*xyza^12.0-18.0-x0^2.0*707199.9999999999*xyza^49.0+20592.0*xyza^10.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^6.0*7.280139778683751E-5*xyza^102.0-5.0*xyza^102.0+x0^9.0*x01/250992.0*xyza^84.0-1.0/21.0*xyza^84.0-0.047619047619047616*xyza^84.0+x0^9.0*x01*1.3071895424836603E-4*xyza^51.0-4.0*xyza^51.0-x01/272.0*xyza^17.0-0.15*xyza^5.0-x0^2.0/536.625*xyza^54.0+1.0/17.5*xyza^15.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^6.0*7.280139778683751E-5/103.0*xyza^103.0-5.0/103.0*xyza^103.0+x0^9.0*x01/250992.0/85.0*xyza^85.0-1.0/21.0/85.0*xyza^85.0-0.047619047619047616/85.0*xyza^85.0+x0^9.0*x01*1.3071895424836603E-4/52.0*xyza^52.0-4.0/52.0*xyza^52.0-x01/272.0/18.0*xyza^18.0-0.15/6.0*xyza^6.0-x0^2.0/536.625/55.0*xyza^55.0+1.0/17.5/16.0*xyza^16.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^6.0/1414808.0*xyza^103.0-1.0/20.6*xyza^103.0-0.04854368932038835*xyza^103.0+x0^9.0*x01/2.133432E7*xyza^85.0-1.0/1785.0*xyza^85.0-5.602240896358543E-4*xyza^85.0+x0^9.0*x01/397799.99999999994*xyza^52.0-1.0/13.0*xyza^52.0-0.07692307692307693*xyza^52.0-x01/4896.0*xyza^18.0-0.024999999999999998*xyza^6.0-x0^2.0/29514.375*xyza^55.0+1.0/280.0*xyza^16.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^6.0*727650.0*xyza^97.0+x0^9.0*x01*14760.0*xyza^79.0+x0^9.0*x01*36848.0*xyza^46.0-x01*2730.0*xyza^12.0-18.0-x0^2.0*707199.9999999999*xyza^49.0+20592.0*xyza^10.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^6.0*727650.0*97.0*xyza^96.0+x0^9.0*x01*14760.0*79.0*xyza^78.0+x0^9.0*x01*36848.0*46.0*xyza^45.0-x01*2730.0*12.0*xyza^11.0-18.0*0.0-x0^2.0*707199.9999999999*49.0*xyza^48.0+20592.0*10.0*xyza^9.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^6.0*7.058205E7*xyza^96.0+x0^9.0*x01*1166040.0*xyza^78.0+x0^9.0*x01*1695008.0*xyza^45.0-x01*32760.0*xyza^11.0-x0^2.0*3.465279999999999E7*xyza^48.0+205920.0*xyza^9.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^6.0/1414808.0*xyza^103.0-1.0/20.6*xyza^103.0-0.04854368932038835*xyza^103.0+x0^9.0*x01/2.133432E7*xyza^85.0-1.0/1785.0*xyza^85.0-5.602240896358543E-4*xyza^85.0-4.0*xyza^85.0+x0^9.0*x01/397799.99999999994*xyza^52.0-1.0/13.0*xyza^52.0-0.07692307692307693*xyza^52.0-x01/4896.0*xyza^18.0-0.024999999999999998*xyza^6.0-x0^2.0/29514.375*xyza^55.0+1.0/280.0*xyza^16.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^6.0/1414808.0/104.0*xyza^104.0-1.0/20.6/104.0*xyza^104.0-0.04854368932038835/104.0*xyza^104.0+x0^9.0*x01/2.133432E7/86.0*xyza^86.0-1.0/1785.0/86.0*xyza^86.0-5.602240896358543E-4/86.0*xyza^86.0-4.0/86.0*xyza^86.0+x0^9.0*x01/397799.99999999994/53.0*xyza^53.0-1.0/13.0/53.0*xyza^53.0-0.07692307692307693/53.0*xyza^53.0-x01/4896.0/19.0*xyza^19.0-0.024999999999999998/7.0*xyza^7.0-x0^2.0/29514.375/56.0*xyza^56.0+1.0/280.0/17.0*xyza^17.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^6.0/1.47140032E8*xyza^104.0-1.0/2142.4*xyza^104.0-4.667662434652726E-4*xyza^104.0+x0^9.0*x01/1.83475152E9*xyza^86.0-1.0/153510.0*xyza^86.0-1.0/153510.0*xyza^86.0-1.0/21.5*xyza^86.0-0.046511627906976744*xyza^86.0+x0^9.0*x01/2.1083399999999996E7*xyza^53.0-1.0/689.0*xyza^53.0-0.001451378809869376*xyza^53.0-x01/93024.0*xyza^19.0-0.0035714285714285713*xyza^7.0-x0^2.0/1652805.0*xyza^56.0+1.0/4760.0*xyza^17.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131383() {
 UsageCalculus.TestCase = 131383;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "4*x0^6*+1*x0^71*x^2^7-3*x^3^8/4*x^1^9*-1*x^2^10/--3*x^34*x0^9*-1*x0^10/--3*x01*x^2^10/--3*x^3-3*x^34*x0^2*1*x0^3/-3*x0^4*-4*x0^51*x^2^3/-3*x^3^4*-4*x^1^5-3*x^3^4*-4*x^1^54*x0^5";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=382 EqnNumber=83 FamilyID=2 MotifTag=3 Entropy=1 FuncWrapAliasID=3"+
"// MetaRow=[12, 83, 10, 18, 1, 1, 2, 9, 2, 3, 4, 2, 3, 1, 1, 1, 2, 1, 3, 1, 1, 4, 3, 1, 2, 3, 8, 1, 1, 6, 3, 17]"+
"// DOEMatrixRow=[5, 83, 17, 2, 1, 2, 3, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 15, 4, 2, 3, 4, 2, 3, 1, 2, 3, 1, 4, 5, 2]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "4.0*x^9.0+1.0/36.0*x^82.0+1.0/3.0*x^49.0-x^15.0-3.0*x^3.0-5.333333333333333*x^52.0+12.0*x^62.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "4.0*9.0*x^8.0+1.0/36.0*82.0*x^81.0+1.0/3.0*49.0*x^48.0-15.0*x^14.0-3.0*3.0*x^2.0-5.333333333333333*52.0*x^51.0+12.0*62.0*x^61.0";
 UsageCalculus.EqnSolArrayMap2[1] = "36.0*x^8.0+2.2777777777777777*x^81.0+16.333333333333332*x^48.0-15.0*x^14.0-9.0*x^2.0-277.3333333333333*x^51.0+744.0*x^61.0";
 UsageCalculus.EqnSolArrayMap3[1] = "4.0*x^9.0+1.0/36.0*x^82.0+1.0/3.0*x^49.0-x^15.0-3.0*x^3.0-5.333333333333333*x^52.0+12.0*x^62.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "4.0/10.0*x^10.0+1.0/36.0/83.0*x^83.0+1.0/3.0/50.0*x^50.0-1.0/16.0*x^16.0-3.0/4.0*x^4.0-5.333333333333333/53.0*x^53.0+12.0/63.0*x^63.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/2.5*x^10.0+1.0/2988.0*x^83.0+1.0/150.0*x^50.0-1.0/16.0*x^16.0-1.0/1.3333333333333333*x^4.0-1.0/9.9375*x^53.0+1.0/5.25*x^63.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "36.0*x^8.0+2.2777777777777777*x^81.0+16.333333333333332*x^48.0-15.0*x^14.0-9.0*x^2.0-277.3333333333333*x^51.0+744.0*x^61.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "36.0*8.0*x^7.0+2.2777777777777777*81.0*x^80.0+16.333333333333332*48.0*x^47.0-15.0*14.0*x^13.0-9.0*2.0*x^1.0-277.3333333333333*51.0*x^50.0+744.0*61.0*x^60.0";
 UsageCalculus.EqnSolArrayMap2[2] = "288.0*x^7.0+184.5*x^80.0+784.0*x^47.0-210.0*x^13.0-18.0*x-14143.999999999998*x^50.0+45384.0*x^60.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/2.5*x^10.0+1.0/2988.0*x^83.0+1.0/150.0*x^50.0-1.0/16.0*x^16.0-1.0/1.3333333333333333*x^4.0-1.0/9.9375*x^53.0+1.0/5.25*x^63.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/2.5/11.0*x^11.0+1.0/2988.0/84.0*x^84.0+1.0/150.0/51.0*x^51.0-1.0/16.0/17.0*x^17.0-1.0/1.3333333333333333/5.0*x^5.0-1.0/9.9375/54.0*x^54.0+1.0/5.25/64.0*x^64.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/27.5*x^11.0+1.0/250992.0*x^84.0+1.0/7650.0*x^51.0-1.0/272.0*x^17.0-1.0/6.666666666666666*x^5.0-1.0/536.625*x^54.0+1.0/336.0*x^64.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "288.0*x^7.0+184.5*x^80.0+784.0*x^47.0-210.0*x^13.0-18.0*x-14143.999999999998*x^50.0+45384.0*x^60.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "288.0*7.0*x^6.0+184.5*80.0*x^79.0+784.0*47.0*x^46.0-210.0*13.0*x^12.0-18.0-14143.999999999998*50.0*x^49.0+45384.0*60.0*x^59.0";
 UsageCalculus.EqnSolArrayMap2[3] = "2016.0*x^6.0+14760.0*x^79.0+36848.0*x^46.0-2730.0*x^12.0-18.0-707199.9999999999*x^49.0+2723040.0*x^59.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/27.5*x^11.0+1.0/250992.0*x^84.0+1.0/7650.0*x^51.0-1.0/272.0*x^17.0-1.0/6.666666666666666*x^5.0-1.0/536.625*x^54.0+1.0/336.0*x^64.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/27.5/12.0*x^12.0+1.0/250992.0/85.0*x^85.0+1.0/7650.0/52.0*x^52.0-1.0/272.0/18.0*x^18.0-1.0/6.666666666666666/6.0*x^6.0-1.0/536.625/55.0*x^55.0+1.0/336.0/65.0*x^65.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/330.0*x^12.0+1.0/2.133432E7*x^85.0+1.0/397800.0*x^52.0-1.0/4896.0*x^18.0-1.0/40.0*x^6.0-1.0/29514.375*x^55.0+1.0/21840.0*x^65.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "2016.0*x^6.0+14760.0*x^79.0+36848.0*x^46.0-2730.0*x^12.0-18.0-707199.9999999999*x^49.0+2723040.0*x^59.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "2016.0*6.0*x^5.0+14760.0*79.0*x^78.0+36848.0*46.0*x^45.0-2730.0*12.0*x^11.0-18.0*0.0-707199.9999999999*49.0*x^48.0+2723040.0*59.0*x^58.0";
 UsageCalculus.EqnSolArrayMap2[4] = "12096.0*x^5.0+1166040.0*x^78.0+1695008.0*x^45.0-32760.0*x^11.0-3.465279999999999E7*x^48.0+1.6065936E8*x^58.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/330.0*x^12.0+1.0/2.133432E7*x^85.0+1.0/397800.0*x^52.0-1.0/4896.0*x^18.0-1.0/40.0*x^6.0-1.0/29514.375*x^55.0+1.0/21840.0*x^65.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/330.0/13.0*x^13.0+1.0/86.0*x^86.0+1.0/397800.0/53.0*x^53.0-1.0/4896.0/19.0*x^19.0-1.0/40.0/7.0*x^7.0-1.0/29514.375/56.0*x^56.0+1.0/21840.0/66.0*x^66.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/4290.0*x^13.0+1.0/86.0*x^86.0+1.0/2.10834E7*x^53.0-1.0/93024.0*x^19.0-1.0/280.0*x^7.0-1.0/1652805.0*x^56.0+1.0/1441440.0*x^66.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131384() {
 UsageCalculus.TestCase = 131384;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xy^2^7-3*xy^3^8/4*xy^1^9*-1*xy^2^10/--3*xy^34*x0^9*-1*x0^10/--3*x01*xy^2^10/--3*xy^3-3*xy^34*x0^2*1*x0^3/-3*x0^4*-4*x0^51*xy^2^3/-3*xy^3^4*-4*xy^1^5-3*xy^3^4*-4*xy^1^54*x0^51*xy^2^6*+-3*xy^3^7*4*xy^1^8*-1*xy^2^9";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=383 EqnNumber=84 FamilyID=3 MotifTag=4 Entropy=3 FuncWrapAliasID=4"+
"// MetaRow=[12, 84, 10, 17, 2, 3, 1, 10, 3, 4, 1, 1, 1, 2, 3, 2, 3, 2, 4, 2, 3, 5, 1, 2, 3, 4, 9, 2, 3, 7, 4, 18]"+
"// DOEMatrixRow=[5, 84, 17, 1, 2, 3, 1, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 16, 5, 3, 1, 5, 3, 1, 2, 3, 1, 2, 1, 6, 1]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "xy^9.0+x0^9.0*x01/36.0*xy^82.0+x0^9.0*x01/3.0*xy^49.0-x01*xy^15.0-3.0*xy^3.0-x0^2.0*5.333333333333333*xy^52.0+x0^51.0*144.0*xy^70.0+12.0*xy^30.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "9.0*xy^8.0+x0^9.0*x01/36.0*82.0*xy^81.0+x0^9.0*x01/3.0*49.0*xy^48.0-x01*15.0*xy^14.0-3.0*3.0*xy^2.0-x0^2.0*5.333333333333333*52.0*xy^51.0+x0^51.0*144.0*70.0*xy^69.0+12.0*30.0*xy^29.0";
 UsageCalculus.EqnSolArrayMap2[1] = "9.0*xy^8.0+x0^9.0*x01*2.2777777777777777*xy^81.0+x0^9.0*x01*16.333333333333332*xy^48.0-x01*15.0*xy^14.0-9.0*xy^2.0-x0^2.0*277.3333333333333*xy^51.0+x0^51.0*10080.0*xy^69.0+360.0*xy^29.0";
 UsageCalculus.EqnSolArrayMap3[1] = "xy^9.0+x0^9.0*x01/36.0*xy^82.0+x0^9.0*x01/3.0*xy^49.0-x01*xy^15.0-3.0*xy^3.0-x0^2.0*5.333333333333333*xy^52.0+x0^51.0*144.0*xy^70.0+12.0*xy^30.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0/10.0*xy^10.0+x0^9.0*x01/36.0/83.0*xy^83.0+x0^9.0*x01/3.0/50.0*xy^50.0-x01/16.0*xy^16.0-3.0/4.0*xy^4.0-x0^2.0*5.333333333333333/53.0*xy^53.0+x0^51.0*144.0/71.0*xy^71.0+12.0/31.0*xy^31.0";
 UsageCalculus.EqnSolArrayMap4[1] = "0.1*xy^10.0+x0^9.0*x01*3.3467202141900936E-4*xy^83.0+x0^9.0*x01*0.006666666666666667*xy^50.0-x01/16.0*xy^16.0-0.75*xy^4.0-x0^2.0*0.10062893081761005*xy^53.0+x0^51.0*2.028169014084507*xy^71.0+1.0/2.5833333333333335*xy^31.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "9.0*xy^8.0+x0^9.0*x01*2.2777777777777777*xy^81.0+x0^9.0*x01*16.333333333333332*xy^48.0-x01*15.0*xy^14.0-9.0*xy^2.0-x0^2.0*277.3333333333333*xy^51.0+x0^51.0*10080.0*xy^69.0+360.0*xy^29.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "9.0*8.0*xy^7.0+x0^9.0*x01*2.2777777777777777*81.0*xy^80.0+x0^9.0*x01*16.333333333333332*48.0*xy^47.0-x01*15.0*14.0*xy^13.0-9.0*2.0*xy^1.0-x0^2.0*277.3333333333333*51.0*xy^50.0+x0^51.0*10080.0*69.0*xy^68.0+360.0*29.0*xy^28.0";
 UsageCalculus.EqnSolArrayMap2[2] = "72.0*xy^7.0+x0^9.0*x01*184.5*xy^80.0+x0^9.0*x01*784.0*xy^47.0-x01*210.0*xy^13.0-18.0*xy-x0^2.0*14143.999999999998*xy^50.0+x0^51.0*695520.0*xy^68.0+10440.0*xy^28.0";
 UsageCalculus.EqnSolArrayMap3[2] = "0.1*xy^10.0+x0^9.0*x01*3.3467202141900936E-4*xy^83.0-4.0*xy^83.0+x0^9.0*x01*0.006666666666666667*xy^50.0-x01/16.0*xy^16.0-0.75*xy^4.0-x0^2.0*0.10062893081761005*xy^53.0+x0^51.0*2.028169014084507*xy^71.0+1.0/2.5833333333333335*xy^31.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "0.1/11.0*xy^11.0+x0^9.0*x01*3.3467202141900936E-4/84.0*xy^84.0-4.0/84.0*xy^84.0+x0^9.0*x01*0.006666666666666667/51.0*xy^51.0-x01/16.0/17.0*xy^17.0-0.75/5.0*xy^5.0-x0^2.0*0.10062893081761005/54.0*xy^54.0+x0^51.0*2.028169014084507/72.0*xy^72.0+1.0/2.5833333333333335/32.0*xy^32.0";
 UsageCalculus.EqnSolArrayMap4[2] = "0.009090909090909092*xy^11.0+x0^9.0*x01/250992.0*xy^84.0-1.0/21.0*xy^84.0-0.047619047619047616*xy^84.0+x0^9.0*x01*1.3071895424836603E-4*xy^51.0-x01/272.0*xy^17.0-0.15*xy^5.0-x0^2.0*0.0018634987188446306*xy^54.0+x0^51.0/35.5*xy^72.0+1.0/82.66666666666667*xy^32.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "72.0*xy^7.0+x0^9.0*x01*184.5*xy^80.0+x0^9.0*x01*784.0*xy^47.0-x01*210.0*xy^13.0-18.0*xy-x0^2.0*14143.999999999998*xy^50.0+x0^51.0*695520.0*xy^68.0+10440.0*xy^28.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "72.0*7.0*xy^6.0+x0^9.0*x01*184.5*80.0*xy^79.0+x0^9.0*x01*784.0*47.0*xy^46.0-x01*210.0*13.0*xy^12.0-18.0-x0^2.0*14143.999999999998*50.0*xy^49.0+x0^51.0*695520.0*68.0*xy^67.0+10440.0*28.0*xy^27.0";
 UsageCalculus.EqnSolArrayMap2[3] = "504.0*xy^6.0+x0^9.0*x01*14760.0*xy^79.0+x0^9.0*x01*36848.0*xy^46.0-x01*2730.0*xy^12.0-18.0-x0^2.0*707199.9999999999*xy^49.0+x0^51.0*4.729536E7*xy^67.0+292320.0*xy^27.0";
 UsageCalculus.EqnSolArrayMap3[3] = "0.009090909090909092*xy^11.0+x0^9.0*x01/250992.0*xy^84.0-1.0/21.0*xy^84.0-0.047619047619047616*xy^84.0+x0^9.0*x01*1.3071895424836603E-4*xy^51.0-4.0*xy^51.0-x01/272.0*xy^17.0-0.15*xy^5.0-x0^2.0*0.0018634987188446306*xy^54.0+x0^51.0/35.5*xy^72.0+1.0/82.66666666666667*xy^32.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "0.009090909090909092/12.0*xy^12.0+x0^9.0*x01/250992.0/85.0*xy^85.0-1.0/21.0/85.0*xy^85.0-0.047619047619047616/85.0*xy^85.0+x0^9.0*x01*1.3071895424836603E-4/52.0*xy^52.0-4.0/52.0*xy^52.0-x01/272.0/18.0*xy^18.0-0.15/6.0*xy^6.0-x0^2.0*0.0018634987188446306/55.0*xy^55.0+x0^51.0/35.5/73.0*xy^73.0+1.0/82.66666666666667/33.0*xy^33.0";
 UsageCalculus.EqnSolArrayMap4[3] = "7.575757575757577E-4*xy^12.0+x0^9.0*x01/2.133432E7*xy^85.0-1.0/1785.0*xy^85.0-5.602240896358543E-4*xy^85.0+x0^9.0*x01/397799.99999999994*xy^52.0-1.0/13.0*xy^52.0-0.07692307692307693*xy^52.0-x01/4896.0*xy^18.0-0.024999999999999998*xy^6.0-x0^2.0*3.388179488808419E-5*xy^55.0+x0^51.0/2591.5*xy^73.0+1.0/2728.0*xy^33.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "504.0*xy^6.0+x0^9.0*x01*14760.0*xy^79.0+x0^9.0*x01*36848.0*xy^46.0-x01*2730.0*xy^12.0-18.0-x0^2.0*707199.9999999999*xy^49.0+x0^51.0*4.729536E7*xy^67.0+292320.0*xy^27.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "504.0*6.0*xy^5.0+x0^9.0*x01*14760.0*79.0*xy^78.0+x0^9.0*x01*36848.0*46.0*xy^45.0-x01*2730.0*12.0*xy^11.0-18.0*0.0-x0^2.0*707199.9999999999*49.0*xy^48.0+x0^51.0*4.729536E7*67.0*xy^66.0+292320.0*27.0*xy^26.0";
 UsageCalculus.EqnSolArrayMap2[4] = "3024.0*xy^5.0+x0^9.0*x01*1166040.0*xy^78.0+x0^9.0*x01*1695008.0*xy^45.0-x01*32760.0*xy^11.0-x0^2.0*3.465279999999999E7*xy^48.0+x0^51.0*3.16878912E9*xy^66.0+7892640.0*xy^26.0";
 UsageCalculus.EqnSolArrayMap3[4] = "7.575757575757577E-4*xy^12.0-4.0*xy^12.0+x0^9.0*x01/2.133432E7*xy^85.0-1.0/1785.0*xy^85.0-5.602240896358543E-4*xy^85.0-4.0*xy^85.0+x0^9.0*x01/397799.99999999994*xy^52.0-1.0/13.0*xy^52.0-0.07692307692307693*xy^52.0-x01/4896.0*xy^18.0-0.024999999999999998*xy^6.0-x0^2.0*3.388179488808419E-5*xy^55.0-5.0*xy^55.0+x0^51.0/2591.5*xy^73.0+1.0/2728.0*xy^33.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "7.575757575757577E-4/13.0*xy^13.0-4.0/13.0*xy^13.0+x0^9.0*x01/2.133432E7/86.0*xy^86.0-1.0/1785.0/86.0*xy^86.0-5.602240896358543E-4/86.0*xy^86.0-4.0/86.0*xy^86.0+x0^9.0*x01/397799.99999999994/53.0*xy^53.0-1.0/13.0/53.0*xy^53.0-0.07692307692307693/53.0*xy^53.0-x01/4896.0/19.0*xy^19.0-0.024999999999999998/7.0*xy^7.0-x0^2.0*3.388179488808419E-5/56.0*xy^56.0-5.0/56.0*xy^56.0+x0^51.0/2591.5/74.0*xy^74.0+1.0/2728.0/34.0*xy^34.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/17159.999999999996*xy^13.0-1.0/3.25*xy^13.0-0.3076923076923077*xy^13.0+x0^9.0*x01/1.83475152E9*xy^86.0-1.0/153510.0*xy^86.0-1.0/153510.0*xy^86.0-1.0/21.5*xy^86.0-0.046511627906976744*xy^86.0+x0^9.0*x01/2.1083399999999996E7*xy^53.0-1.0/689.0*xy^53.0-0.001451378809869376*xy^53.0-x01/93024.0*xy^19.0-0.0035714285714285713*xy^7.0-x0^2.0/1652805.0000000002*xy^56.0-1.0/11.2*xy^56.0-0.08928571428571429*xy^56.0+x0^51.0/191771.0*xy^74.0+1.0/92752.0*xy^34.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131385() {
 UsageCalculus.TestCase = 131385;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xyz^3^8/4*xyz^1^9*-1*xyz^2^10/--3*xyz^34*x0^9*-1*x0^10/--3*x01*xyz^2^10/--3*xyz^3-3*xyz^34*x0^2*1*x0^3/-3*x0^4*-4*x0^51*xyz^2^3/-3*xyz^3^4*-4*xyz^1^5-3*xyz^3^4*-4*xyz^1^54*x0^51*xyz^2^6*+-3*xyz^3^7*4*xyz^1^8*-1*xyz^2^9-3*xyz^3^7*4*xyz^1^8*-1*xyz^2^9";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=384 EqnNumber=85 FamilyID=1 MotifTag=1 Entropy=4 FuncWrapAliasID=1"+
"// MetaRow=[12, 85, 10, 16, 3, 1, 2, 1, 1, 1, 2, 1, 2, 3, 4, 3, 1, 1, 5, 3, 4, 6, 2, 3, 1, 1, 10, 3, 4, 8, 1, 19]"+
"// DOEMatrixRow=[5, 85, 17, 4, 2, 1, 2, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 17, 6, 1, 2, 1, 1, 2, 3, 4, 2, 3, 2, 7, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^9.0*x01/36.0*xyz^82.0+x0^9.0*x01/3.0*xyz^49.0-x01*xyz^15.0-3.0*xyz^3.0-x0^2.0*5.333333333333333*xyz^52.0+x0^51.0*144.0*xyz^70.0+12.0*xyz^30.0+12.0*xyz^30.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^9.0*x01/36.0*82.0*xyz^81.0+x0^9.0*x01/3.0*49.0*xyz^48.0-x01*15.0*xyz^14.0-3.0*3.0*xyz^2.0-x0^2.0*5.333333333333333*52.0*xyz^51.0+x0^51.0*144.0*70.0*xyz^69.0+12.0*30.0*xyz^29.0+12.0*30.0*xyz^29.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^9.0*x01*2.2777777777777777*xyz^81.0+x0^9.0*x01*16.333333333333332*xyz^48.0-x01*15.0*xyz^14.0-9.0*xyz^2.0-x0^2.0*277.3333333333333*xyz^51.0+x0^51.0*10080.0*xyz^69.0+360.0*xyz^29.0+360.0*xyz^29.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^9.0*x01/36.0*xyz^82.0+x0^9.0*x01/3.0*xyz^49.0-x01*xyz^15.0-3.0*xyz^3.0-x0^2.0*5.333333333333333*xyz^52.0+x0^51.0*144.0*xyz^70.0+12.0*xyz^30.0+12.0*xyz^30.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^9.0*x01/36.0/83.0*xyz^83.0+x0^9.0*x01/3.0/50.0*xyz^50.0-x01/16.0*xyz^16.0-3.0/4.0*xyz^4.0-x0^2.0*5.333333333333333/53.0*xyz^53.0+x0^51.0*144.0/71.0*xyz^71.0+12.0/31.0*xyz^31.0+12.0/31.0*xyz^31.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^9.0*x01*3.3467202141900936E-4*xyz^83.0+x0^9.0*x01*0.006666666666666667*xyz^50.0-x01/16.0*xyz^16.0-0.75*xyz^4.0-x0^2.0*0.10062893081761005*xyz^53.0+x0^51.0*2.028169014084507*xyz^71.0+1.0/2.5833333333333335*xyz^31.0+1.0/2.5833333333333335*xyz^31.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^9.0*x01*2.2777777777777777*xyz^81.0+x0^9.0*x01*16.333333333333332*xyz^48.0-x01*15.0*xyz^14.0-9.0*xyz^2.0-x0^2.0*277.3333333333333*xyz^51.0+x0^51.0*10080.0*xyz^69.0+360.0*xyz^29.0+360.0*xyz^29.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^9.0*x01*2.2777777777777777*81.0*xyz^80.0+x0^9.0*x01*16.333333333333332*48.0*xyz^47.0-x01*15.0*14.0*xyz^13.0-9.0*2.0*xyz^1.0-x0^2.0*277.3333333333333*51.0*xyz^50.0+x0^51.0*10080.0*69.0*xyz^68.0+360.0*29.0*xyz^28.0+360.0*29.0*xyz^28.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^9.0*x01*184.5*xyz^80.0+x0^9.0*x01*784.0*xyz^47.0-x01*210.0*xyz^13.0-18.0*xyz-x0^2.0*14143.999999999998*xyz^50.0+x0^51.0*695520.0*xyz^68.0+10440.0*xyz^28.0+10440.0*xyz^28.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^9.0*x01*3.3467202141900936E-4*xyz^83.0-4.0*xyz^83.0+x0^9.0*x01*0.006666666666666667*xyz^50.0-x01/16.0*xyz^16.0-0.75*xyz^4.0-x0^2.0*0.10062893081761005*xyz^53.0+x0^51.0*2.028169014084507*xyz^71.0+1.0/2.5833333333333335*xyz^31.0+1.0/2.5833333333333335*xyz^31.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^9.0*x01*3.3467202141900936E-4/84.0*xyz^84.0-4.0/84.0*xyz^84.0+x0^9.0*x01*0.006666666666666667/51.0*xyz^51.0-x01/16.0/17.0*xyz^17.0-0.75/5.0*xyz^5.0-x0^2.0*0.10062893081761005/54.0*xyz^54.0+x0^51.0*2.028169014084507/72.0*xyz^72.0+1.0/2.5833333333333335/32.0*xyz^32.0+1.0/2.5833333333333335/32.0*xyz^32.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^9.0*x01/250992.0*xyz^84.0-1.0/21.0*xyz^84.0-0.047619047619047616*xyz^84.0+x0^9.0*x01*1.3071895424836603E-4*xyz^51.0-x01/272.0*xyz^17.0-0.15*xyz^5.0-x0^2.0*0.0018634987188446306*xyz^54.0+x0^51.0/35.5*xyz^72.0+1.0/82.66666666666667*xyz^32.0+1.0/82.66666666666667*xyz^32.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^9.0*x01*184.5*xyz^80.0+x0^9.0*x01*784.0*xyz^47.0-x01*210.0*xyz^13.0-18.0*xyz-x0^2.0*14143.999999999998*xyz^50.0+x0^51.0*695520.0*xyz^68.0+10440.0*xyz^28.0+10440.0*xyz^28.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^9.0*x01*184.5*80.0*xyz^79.0+x0^9.0*x01*784.0*47.0*xyz^46.0-x01*210.0*13.0*xyz^12.0-18.0-x0^2.0*14143.999999999998*50.0*xyz^49.0+x0^51.0*695520.0*68.0*xyz^67.0+10440.0*28.0*xyz^27.0+10440.0*28.0*xyz^27.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^9.0*x01*14760.0*xyz^79.0+x0^9.0*x01*36848.0*xyz^46.0-x01*2730.0*xyz^12.0-18.0-x0^2.0*707199.9999999999*xyz^49.0+x0^51.0*4.729536E7*xyz^67.0+292320.0*xyz^27.0+292320.0*xyz^27.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^9.0*x01/250992.0*xyz^84.0-1.0/21.0*xyz^84.0-0.047619047619047616*xyz^84.0+x0^9.0*x01*1.3071895424836603E-4*xyz^51.0-4.0*xyz^51.0-x01/272.0*xyz^17.0-0.15*xyz^5.0-x0^2.0*0.0018634987188446306*xyz^54.0+x0^51.0/35.5*xyz^72.0+1.0/82.66666666666667*xyz^32.0+1.0/82.66666666666667*xyz^32.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^9.0*x01/250992.0/85.0*xyz^85.0-1.0/21.0/85.0*xyz^85.0-0.047619047619047616/85.0*xyz^85.0+x0^9.0*x01*1.3071895424836603E-4/52.0*xyz^52.0-4.0/52.0*xyz^52.0-x01/272.0/18.0*xyz^18.0-0.15/6.0*xyz^6.0-x0^2.0*0.0018634987188446306/55.0*xyz^55.0+x0^51.0/35.5/73.0*xyz^73.0+1.0/82.66666666666667/33.0*xyz^33.0+1.0/82.66666666666667/33.0*xyz^33.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^9.0*x01/2.133432E7*xyz^85.0-1.0/1785.0*xyz^85.0-5.602240896358543E-4*xyz^85.0+x0^9.0*x01/397799.99999999994*xyz^52.0-1.0/13.0*xyz^52.0-0.07692307692307693*xyz^52.0-x01/4896.0*xyz^18.0-0.024999999999999998*xyz^6.0-x0^2.0*3.388179488808419E-5*xyz^55.0+x0^51.0/2591.5*xyz^73.0+1.0/2728.0*xyz^33.0+1.0/2728.0*xyz^33.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^9.0*x01*14760.0*xyz^79.0+x0^9.0*x01*36848.0*xyz^46.0-x01*2730.0*xyz^12.0-18.0-x0^2.0*707199.9999999999*xyz^49.0+x0^51.0*4.729536E7*xyz^67.0+292320.0*xyz^27.0+292320.0*xyz^27.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^9.0*x01*14760.0*79.0*xyz^78.0+x0^9.0*x01*36848.0*46.0*xyz^45.0-x01*2730.0*12.0*xyz^11.0-18.0*0.0-x0^2.0*707199.9999999999*49.0*xyz^48.0+x0^51.0*4.729536E7*67.0*xyz^66.0+292320.0*27.0*xyz^26.0+292320.0*27.0*xyz^26.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^9.0*x01*1166040.0*xyz^78.0+x0^9.0*x01*1695008.0*xyz^45.0-x01*32760.0*xyz^11.0-x0^2.0*3.465279999999999E7*xyz^48.0+x0^51.0*3.16878912E9*xyz^66.0+7892640.0*xyz^26.0+7892640.0*xyz^26.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^9.0*x01/2.133432E7*xyz^85.0-1.0/1785.0*xyz^85.0-5.602240896358543E-4*xyz^85.0-4.0*xyz^85.0+x0^9.0*x01/397799.99999999994*xyz^52.0-1.0/13.0*xyz^52.0-0.07692307692307693*xyz^52.0-x01/4896.0*xyz^18.0-0.024999999999999998*xyz^6.0-x0^2.0*3.388179488808419E-5*xyz^55.0-5.0*xyz^55.0+x0^51.0/2591.5*xyz^73.0+1.0/2728.0*xyz^33.0+1.0/2728.0*xyz^33.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^9.0*x01/2.133432E7/86.0*xyz^86.0-1.0/1785.0/86.0*xyz^86.0-5.602240896358543E-4/86.0*xyz^86.0-4.0/86.0*xyz^86.0+x0^9.0*x01/397799.99999999994/53.0*xyz^53.0-1.0/13.0/53.0*xyz^53.0-0.07692307692307693/53.0*xyz^53.0-x01/4896.0/19.0*xyz^19.0-0.024999999999999998/7.0*xyz^7.0-x0^2.0*3.388179488808419E-5/56.0*xyz^56.0-5.0/56.0*xyz^56.0+x0^51.0/2591.5/74.0*xyz^74.0+1.0/2728.0/34.0*xyz^34.0+1.0/2728.0/34.0*xyz^34.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^9.0*x01/1.83475152E9*xyz^86.0-1.0/153510.0*xyz^86.0-1.0/153510.0*xyz^86.0-1.0/21.5*xyz^86.0-0.046511627906976744*xyz^86.0+x0^9.0*x01/2.1083399999999996E7*xyz^53.0-1.0/689.0*xyz^53.0-0.001451378809869376*xyz^53.0-x01/93024.0*xyz^19.0-0.0035714285714285713*xyz^7.0-x0^2.0/1652805.0000000002*xyz^56.0-1.0/11.2*xyz^56.0-0.08928571428571429*xyz^56.0+x0^51.0/191771.0*xyz^74.0+1.0/92752.0*xyz^34.0+1.0/92752.0*xyz^34.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131386() {
 UsageCalculus.TestCase = 131386;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "4*x0^9*-1*x0^10/--3*x01*xyza^2^10/--3*xyza^3-3*xyza^34*x0^2*1*x0^3/-3*x0^4*-4*x0^51*xyza^2^3/-3*xyza^3^4*-4*xyza^1^5-3*xyza^3^4*-4*xyza^1^54*x0^51*xyza^2^6*+-3*xyza^3^7*4*xyza^1^8*-1*xyza^2^9-3*xyza^3^7*4*xyza^1^8*-1*xyza^2^94*x0^8*-1*x0^9";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=385 EqnNumber=86 FamilyID=2 MotifTag=3 Entropy=1 FuncWrapAliasID=3"+
"// MetaRow=[12, 86, 10, 15, 4, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 1, 2, 1, 1, 1, 1, 7, 3, 1, 2, 3, 11, 1, 1, 9, 2, 20]"+
"// DOEMatrixRow=[5, 86, 17, 3, 1, 2, 3, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 18, 7, 2, 3, 2, 3, 1, 4, 1, 3, 1, 3, 8, 1]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^9.0*x01/2.25*xyza^15.0-x01*xyza^15.0-3.0*xyza^3.0-x0^2.0*5.333333333333333*xyza^52.0+x0^51.0*144.0*xyza^70.0+12.0*xyza^30.0-x0^8.0*12.0*xyza^115.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^9.0*x01/2.25*15.0*xyza^14.0-x01*15.0*xyza^14.0-3.0*3.0*xyza^2.0-x0^2.0*5.333333333333333*52.0*xyza^51.0+x0^51.0*144.0*70.0*xyza^69.0+12.0*30.0*xyza^29.0-x0^8.0*12.0*115.0*xyza^114.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^9.0*x01*6.666666666666667*xyza^14.0-x01*15.0*xyza^14.0-9.0*xyza^2.0-x0^2.0*277.3333333333333*xyza^51.0+x0^51.0*10080.0*xyza^69.0+360.0*xyza^29.0-x0^8.0*1380.0*xyza^114.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^9.0*x01/2.25*xyza^15.0-x01*xyza^15.0-3.0*xyza^3.0-x0^2.0*5.333333333333333*xyza^52.0+x0^51.0*144.0*xyza^70.0+12.0*xyza^30.0-x0^8.0*12.0*xyza^115.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^9.0*x01/2.25/16.0*xyza^16.0-x01/16.0*xyza^16.0-3.0/4.0*xyza^4.0-x0^2.0*5.333333333333333/53.0*xyza^53.0+x0^51.0*144.0/71.0*xyza^71.0+12.0/31.0*xyza^31.0-x0^8.0*12.0/116.0*xyza^116.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^9.0*x01*0.027777777777777776*xyza^16.0-x01/16.0*xyza^16.0-0.75*xyza^4.0-x0^2.0*0.10062893081761005*xyza^53.0+x0^51.0*2.028169014084507*xyza^71.0+0.3870967741935484*xyza^31.0-x0^8.0/9.666666666666666*xyza^116.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^9.0*x01*6.666666666666667*xyza^14.0-x01*15.0*xyza^14.0-9.0*xyza^2.0-x0^2.0*277.3333333333333*xyza^51.0+x0^51.0*10080.0*xyza^69.0+360.0*xyza^29.0-x0^8.0*1380.0*xyza^114.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^9.0*x01*6.666666666666667*14.0*xyza^13.0-x01*15.0*14.0*xyza^13.0-9.0*2.0*xyza^1.0-x0^2.0*277.3333333333333*51.0*xyza^50.0+x0^51.0*10080.0*69.0*xyza^68.0+360.0*29.0*xyza^28.0-x0^8.0*1380.0*114.0*xyza^113.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^9.0*x01*93.33333333333334*xyza^13.0-x01*210.0*xyza^13.0-18.0*xyza-x0^2.0*14143.999999999998*xyza^50.0+x0^51.0*695520.0*xyza^68.0+10440.0*xyza^28.0-x0^8.0*157320.0*xyza^113.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^9.0*x01*0.027777777777777776*xyza^16.0-x01/16.0*xyza^16.0-0.75*xyza^4.0-x0^2.0*0.10062893081761005*xyza^53.0+x0^51.0*2.028169014084507*xyza^71.0+0.3870967741935484*xyza^31.0-x0^8.0/9.666666666666666*xyza^116.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^9.0*x01*0.027777777777777776/17.0*xyza^17.0-x01/16.0/17.0*xyza^17.0-0.75/5.0*xyza^5.0-x0^2.0*0.10062893081761005/54.0*xyza^54.0+x0^51.0*2.028169014084507/72.0*xyza^72.0+0.3870967741935484/32.0*xyza^32.0-x0^8.0*9.666666666666666/117.0*xyza^117.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^9.0*x01*0.001633986928104575*xyza^17.0-x01/272.0*xyza^17.0-0.15*xyza^5.0-x0^2.0*0.0018634987188446306*xyza^54.0+x0^51.0/35.5*xyza^72.0+0.012096774193548387*xyza^32.0-x0^8.0/12.10344827586207*xyza^117.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^9.0*x01*93.33333333333334*xyza^13.0-x01*210.0*xyza^13.0-18.0*xyza-x0^2.0*14143.999999999998*xyza^50.0+x0^51.0*695520.0*xyza^68.0+10440.0*xyza^28.0-x0^8.0*157320.0*xyza^113.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^9.0*x01*93.33333333333334*13.0*xyza^12.0-x01*210.0*13.0*xyza^12.0-18.0-x0^2.0*14143.999999999998*50.0*xyza^49.0+x0^51.0*695520.0*68.0*xyza^67.0+10440.0*28.0*xyza^27.0-x0^8.0*157320.0*113.0*xyza^112.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^9.0*x01*1213.3333333333335*xyza^12.0-x01*2730.0*xyza^12.0-18.0-x0^2.0*707199.9999999999*xyza^49.0+x0^51.0*4.729536E7*xyza^67.0+292320.0*xyza^27.0-x0^8.0*1.777716E7*xyza^112.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^9.0*x01*0.001633986928104575*xyza^17.0-x01/272.0*xyza^17.0-0.15*xyza^5.0-x0^2.0*0.0018634987188446306*xyza^54.0+x0^51.0/35.5*xyza^72.0+0.012096774193548387*xyza^32.0-x0^8.0/12.10344827586207*xyza^117.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^9.0*x01*0.001633986928104575/18.0*xyza^18.0-x01/272.0/18.0*xyza^18.0-0.15/6.0*xyza^6.0-x0^2.0*0.0018634987188446306/55.0*xyza^55.0+x0^51.0/35.5/73.0*xyza^73.0+0.012096774193548387/33.0*xyza^33.0-x0^8.0*12.10344827586207/118.0*xyza^118.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^9.0*x01*9.077705156136527E-5*xyza^18.0-x01/4896.0*xyza^18.0-0.024999999999999998*xyza^6.0-x0^2.0*3.388179488808419E-5*xyza^55.0+x0^51.0/2591.5*xyza^73.0+3.6656891495601173E-4*xyza^33.0-x0^8.0/9.749287749287749*xyza^118.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^9.0*x01*1213.3333333333335*xyza^12.0-x01*2730.0*xyza^12.0-18.0-x0^2.0*707199.9999999999*xyza^49.0+x0^51.0*4.729536E7*xyza^67.0+292320.0*xyza^27.0-x0^8.0*1.777716E7*xyza^112.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^9.0*x01*1213.3333333333335*12.0*xyza^11.0-x01*2730.0*12.0*xyza^11.0-18.0*0.0-x0^2.0*707199.9999999999*49.0*xyza^48.0+x0^51.0*4.729536E7*67.0*xyza^66.0+292320.0*27.0*xyza^26.0-0.0*112.0*xyza^111.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^9.0*x01*14560.000000000002*xyza^11.0-x01*32760.0*xyza^11.0-x0^2.0*3.465279999999999E7*xyza^48.0+x0^51.0*3.16878912E9*xyza^66.0+7892640.0*xyza^26.0-0.0*xyza^111.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^9.0*x01*9.077705156136527E-5*xyza^18.0-5.0*xyza^18.0-x01/4896.0*xyza^18.0-0.024999999999999998*xyza^6.0-x0^2.0*3.388179488808419E-5*xyza^55.0-5.0*xyza^55.0+x0^51.0/2591.5*xyza^73.0+3.6656891495601173E-4*xyza^33.0-4.0*xyza^33.0-x0^8.0/9.749287749287749*xyza^118.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^9.0*x01*9.077705156136527E-5/19.0*xyza^19.0-5.0/19.0*xyza^19.0-x01/4896.0/19.0*xyza^19.0-0.024999999999999998/7.0*xyza^7.0-x0^2.0*3.388179488808419E-5/56.0*xyza^56.0-5.0/56.0*xyza^56.0+x0^51.0/2591.5/74.0*xyza^74.0+3.6656891495601173E-4/34.0*xyza^34.0-4.0/34.0*xyza^34.0-x0^8.0*9.749287749287749/119.0*xyza^119.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^9.0*x01/209304.00000000003*xyza^19.0-1.0/3.8*xyza^19.0-0.2631578947368421*xyza^19.0-x01/93024.0*xyza^19.0-0.0035714285714285713*xyza^7.0-x0^2.0/1652805.0000000002*xyza^56.0-1.0/11.2*xyza^56.0-0.08928571428571429*xyza^56.0+x0^51.0/191771.0*xyza^74.0+1.0/92752.0*xyza^34.0-1.0/8.5*xyza^34.0-0.11764705882352941*xyza^34.0-x0^8.0/12.206019871420223*xyza^119.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131387() {
 UsageCalculus.TestCase = 131387;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x^2^10/--3*x^3-3*x^34*x0^2*1*x0^3/-3*x0^4*-4*x0^51*x^2^3/-3*x^3^4*-4*x^1^5-3*x^3^4*-4*x^1^54*x0^51*x^2^6*+-3*x^3^7*4*x^1^8*-1*x^2^9-3*x^3^7*4*x^1^8*-1*x^2^94*x0^8*-1*x0^91*x^2^9";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=386 EqnNumber=87 FamilyID=3 MotifTag=4 Entropy=3 FuncWrapAliasID=4"+
"// MetaRow=[12, 87, 10, 14, 1, 3, 1, 3, 1, 3, 4, 1, 1, 2, 3, 2, 3, 2, 3, 2, 3, 8, 1, 2, 3, 4, 12, 2, 3, 10, 3, 21]"+
"// DOEMatrixRow=[5, 87, 17, 2, 3, 1, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 19, 8, 3, 1, 3, 1, 2, 5, 2, 1, 2, 4, 9, 2]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "1.0/3.0*x^15.0-3.0*x^3.0-5.333333333333333*x^52.0+144.0*x^70.0+12.0*x^30.0-12.0*x^126.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "1.0/3.0*15.0*x^14.0-3.0*3.0*x^2.0-5.333333333333333*52.0*x^51.0+144.0*70.0*x^69.0+12.0*30.0*x^29.0-12.0*126.0*x^125.0";
 UsageCalculus.EqnSolArrayMap2[1] = "5.0*x^14.0-9.0*x^2.0-277.3333333333333*x^51.0+10080.0*x^69.0+360.0*x^29.0-1512.0*x^125.0";
 UsageCalculus.EqnSolArrayMap3[1] = "1.0/3.0*x^15.0-3.0*x^3.0-5.333333333333333*x^52.0+144.0*x^70.0+12.0*x^30.0-12.0*x^126.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0/3.0/16.0*x^16.0-3.0/4.0*x^4.0-5.333333333333333/53.0*x^53.0+144.0/71.0*x^71.0+12.0/31.0*x^31.0-12.0/127.0*x^127.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/48.0*x^16.0-1.0/1.3333333333333333*x^4.0-1.0/9.9375*x^53.0+2.028169014084507*x^71.0+1.0/2.5833333333333335*x^31.0-1.0/10.583333333333334*x^127.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "5.0*x^14.0-9.0*x^2.0-277.3333333333333*x^51.0+10080.0*x^69.0+360.0*x^29.0-1512.0*x^125.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "5.0*14.0*x^13.0-9.0*2.0*x^1.0-277.3333333333333*51.0*x^50.0+10080.0*69.0*x^68.0+360.0*29.0*x^28.0-1512.0*125.0*x^124.0";
 UsageCalculus.EqnSolArrayMap2[2] = "70.0*x^13.0-18.0*x-14143.999999999998*x^50.0+695520.0*x^68.0+10440.0*x^28.0-189000.0*x^124.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/48.0*x^16.0-1.0/1.3333333333333333*x^4.0-1.0/9.9375*x^53.0+2.028169014084507*x^71.0+1.0/2.5833333333333335*x^31.0-1.0/10.583333333333334*x^127.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/48.0/17.0*x^17.0-1.0/1.3333333333333333/5.0*x^5.0-1.0/9.9375/54.0*x^54.0+2.028169014084507/72.0*x^72.0+1.0/2.5833333333333335/32.0*x^32.0-1.0/10.583333333333334/128.0*x^128.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/816.0*x^17.0-1.0/6.666666666666666*x^5.0-1.0/536.625*x^54.0+1.0/35.5*x^72.0+1.0/82.66666666666667*x^32.0-1.0/1354.6666666666667*x^128.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "70.0*x^13.0-18.0*x-14143.999999999998*x^50.0+695520.0*x^68.0+10440.0*x^28.0-189000.0*x^124.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "70.0*13.0*x^12.0-18.0-14143.999999999998*50.0*x^49.0+695520.0*68.0*x^67.0+10440.0*28.0*x^27.0-189000.0*124.0*x^123.0";
 UsageCalculus.EqnSolArrayMap2[3] = "910.0*x^12.0-18.0-707199.9999999999*x^49.0+4.729536E7*x^67.0+292320.0*x^27.0-2.3436E7*x^123.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/816.0*x^17.0-1.0/6.666666666666666*x^5.0-1.0/536.625*x^54.0+1.0/35.5*x^72.0+1.0/82.66666666666667*x^32.0-1.0/1354.6666666666667*x^128.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/816.0/18.0*x^18.0-1.0/6.666666666666666/6.0*x^6.0-1.0/536.625/55.0*x^55.0+1.0/35.5/73.0*x^73.0+1.0/82.66666666666667/33.0*x^33.0-1.0/1354.6666666666667/129.0*x^129.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/14688.0*x^18.0-1.0/40.0*x^6.0-1.0/29514.375*x^55.0+1.0/2591.5*x^73.0+1.0/2728.0*x^33.0-1.0/174752.0*x^129.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "910.0*x^12.0-18.0-707199.9999999999*x^49.0+4.729536E7*x^67.0+292320.0*x^27.0-2.3436E7*x^123.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "910.0*12.0*x^11.0-18.0*0.0-707199.9999999999*49.0*x^48.0+67.0*x^66.0+292320.0*27.0*x^26.0-0.0*123.0*x^122.0";
 UsageCalculus.EqnSolArrayMap2[4] = "10920.0*x^11.0-3.465279999999999E7*x^48.0+67.0*x^66.0+7892640.0*x^26.0-0.0*x^122.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/14688.0*x^18.0-1.0/40.0*x^6.0-1.0/29514.375*x^55.0+1.0/2591.5*x^73.0+1.0/2728.0*x^33.0-1.0/174752.0*x^129.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/14688.0/19.0*x^19.0-1.0/40.0/7.0*x^7.0-1.0/29514.375/56.0*x^56.0+1.0/2591.5/74.0*x^74.0+1.0/2728.0/34.0*x^34.0-1.0/174752.0/130.0*x^130.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/279072.0*x^19.0-1.0/280.0*x^7.0-1.0/1652805.0*x^56.0+1.0/191771.0*x^74.0+1.0/92752.0*x^34.0-1.0/2.271776E7*x^130.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131388() {
 UsageCalculus.TestCase = 131388;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xy^34*x0^2*1*x0^3/-3*x0^4*-4*x0^51*xy^2^3/-3*xy^3^4*-4*xy^1^5-3*xy^3^4*-4*xy^1^54*x0^51*xy^2^6*+-3*xy^3^7*4*xy^1^8*-1*xy^2^9-3*xy^3^7*4*xy^1^8*-1*xy^2^94*x0^8*-1*x0^91*xy^2^9-3*xy^3^10*+4*xy^1*1*xy^2^2/-3*xy^3^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=387 EqnNumber=88 FamilyID=1 MotifTag=1 Entropy=4 FuncWrapAliasID=1"+
"// MetaRow=[12, 88, 10, 13, 2, 1, 2, 4, 2, 4, 1, 2, 3, 1, 4, 3, 1, 1, 4, 3, 4, 9, 2, 3, 1, 1, 13, 3, 4, 11, 4, 22]"+
"// DOEMatrixRow=[5, 88, 17, 1, 2, 3, 2, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 20, 9, 1, 2, 4, 2, 3, 6, 3, 2, 3, 1, 10, 1]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^2.0*5.333333333333333*xy^52.0+x0^51.0*144.0*xy^70.0+12.0*xy^30.0-x0^8.0*12.0*xy^126.0+4.0*xy^24.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^2.0*5.333333333333333*52.0*xy^51.0+x0^51.0*144.0*70.0*xy^69.0+12.0*30.0*xy^29.0-x0^8.0*12.0*126.0*xy^125.0+4.0*24.0*xy^23.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^2.0*277.3333333333333*xy^51.0+x0^51.0*10080.0*xy^69.0+360.0*xy^29.0-x0^8.0*1512.0*xy^125.0+96.0*xy^23.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^2.0*5.333333333333333*xy^52.0+x0^51.0*144.0*xy^70.0+12.0*xy^30.0-x0^8.0*12.0*xy^126.0+4.0*xy^24.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^2.0*5.333333333333333/53.0*xy^53.0+x0^51.0*144.0/71.0*xy^71.0+12.0/31.0*xy^31.0-x0^8.0*12.0/127.0*xy^127.0+4.0/25.0*xy^25.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^2.0*0.10062893081761005*xy^53.0+x0^51.0*2.028169014084507*xy^71.0+0.3870967741935484*xy^31.0-x0^8.0/10.583333333333334*xy^127.0+1.0/6.25*xy^25.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^2.0*277.3333333333333*xy^51.0+x0^51.0*10080.0*xy^69.0+360.0*xy^29.0-x0^8.0*1512.0*xy^125.0+96.0*xy^23.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^2.0*277.3333333333333*51.0*xy^50.0+x0^51.0*10080.0*69.0*xy^68.0+360.0*29.0*xy^28.0-x0^8.0*1512.0*125.0*xy^124.0+96.0*23.0*xy^22.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^2.0*14143.999999999998*xy^50.0+x0^51.0*695520.0*xy^68.0+10440.0*xy^28.0-x0^8.0*189000.0*xy^124.0+2208.0*xy^22.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^2.0*0.10062893081761005*xy^53.0+x0^51.0*2.028169014084507*xy^71.0+0.3870967741935484*xy^31.0-x0^8.0/10.583333333333334*xy^127.0+1.0/6.25*xy^25.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^2.0*0.10062893081761005/54.0*xy^54.0+x0^51.0*2.028169014084507/72.0*xy^72.0+0.3870967741935484/32.0*xy^32.0-x0^8.0/10.583333333333334/128.0*xy^128.0+1.0/6.25/26.0*xy^26.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^2.0*0.0018634987188446306*xy^54.0+x0^51.0/35.5*xy^72.0+0.012096774193548387*xy^32.0-x0^8.0/1354.6666666666667*xy^128.0+1.0/162.5*xy^26.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^2.0*14143.999999999998*xy^50.0+x0^51.0*695520.0*xy^68.0+10440.0*xy^28.0-x0^8.0*189000.0*xy^124.0+2208.0*xy^22.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^2.0*14143.999999999998*50.0*xy^49.0+x0^51.0*695520.0*68.0*xy^67.0+10440.0*28.0*xy^27.0-x0^8.0*189000.0*124.0*xy^123.0+2208.0*22.0*xy^21.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^2.0*707199.9999999999*xy^49.0+x0^51.0*4.729536E7*xy^67.0+292320.0*xy^27.0-x0^8.0*2.3436E7*xy^123.0+48576.0*xy^21.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^2.0*0.0018634987188446306*xy^54.0+x0^51.0/35.5*xy^72.0+0.012096774193548387*xy^32.0-x0^8.0/1354.6666666666667*xy^128.0+1.0/162.5*xy^26.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^2.0*0.0018634987188446306/55.0*xy^55.0+x0^51.0/35.5/73.0*xy^73.0+0.012096774193548387/33.0*xy^33.0-x0^8.0/1354.6666666666667/129.0*xy^129.0+1.0/162.5/27.0*xy^27.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^2.0*3.388179488808419E-5*xy^55.0+x0^51.0/2591.5*xy^73.0+3.6656891495601173E-4*xy^33.0-x0^8.0/174752.0*xy^129.0+1.0/4387.5*xy^27.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^2.0*707199.9999999999*xy^49.0+x0^51.0*4.729536E7*xy^67.0+292320.0*xy^27.0-x0^8.0*2.3436E7*xy^123.0+48576.0*xy^21.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^2.0*707199.9999999999*49.0*xy^48.0+x0^51.0*4.729536E7*67.0*xy^66.0+292320.0*27.0*xy^26.0-x0^8.0*2.3436E7*123.0*xy^122.0+48576.0*21.0*xy^20.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^2.0*3.465279999999999E7*xy^48.0+x0^51.0*3.16878912E9*xy^66.0+7892640.0*xy^26.0-x0^8.0*2.882628E9*xy^122.0+1020096.0*xy^20.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^2.0*3.388179488808419E-5*xy^55.0-5.0*xy^55.0+x0^51.0/2591.5*xy^73.0+3.6656891495601173E-4*xy^33.0-4.0*xy^33.0-x0^8.0/174752.0*xy^129.0+1.0/4387.5*xy^27.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^2.0*3.388179488808419E-5/56.0*xy^56.0-5.0/56.0*xy^56.0+x0^51.0/2591.5/74.0*xy^74.0+3.6656891495601173E-4/34.0*xy^34.0-4.0/34.0*xy^34.0-x0^8.0/174752.0/130.0*xy^130.0+1.0/4387.5/28.0*xy^28.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^2.0/1652805.0000000002*xy^56.0-1.0/11.2*xy^56.0-0.08928571428571429*xy^56.0+x0^51.0/191771.0*xy^74.0+1.0/92752.0*xy^34.0-1.0/8.5*xy^34.0-0.11764705882352941*xy^34.0-x0^8.0/2.271776E7*xy^130.0+1.0/122850.0*xy^28.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131389() {
 UsageCalculus.TestCase = 131389;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "4*x0^2*1*x0^3/-3*x0^4*-4*x0^51*xyz^2^3/-3*xyz^3^4*-4*xyz^1^5-3*xyz^3^4*-4*xyz^1^54*x0^51*xyz^2^6*+-3*xyz^3^7*4*xyz^1^8*-1*xyz^2^9-3*xyz^3^7*4*xyz^1^8*-1*xyz^2^94*x0^8*-1*x0^91*xyz^2^9-3*xyz^3^10*+4*xyz^1*1*xyz^2^2/-3*xyz^3^34*x0*1*x0^2/-3*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=388 EqnNumber=89 FamilyID=2 MotifTag=3 Entropy=1 FuncWrapAliasID=3"+
"// MetaRow=[12, 89, 10, 12, 3, 2, 3, 5, 3, 1, 2, 1, 1, 2, 1, 1, 2, 1, 5, 1, 1, 10, 3, 1, 2, 3, 14, 1, 1, 12, 1, 23]"+
"// DOEMatrixRow=[5, 89, 17, 4, 3, 1, 3, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 21, 10, 2, 3, 5, 3, 1, 1, 4, 3, 1, 2, 11, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0*7.111111111111111*xyz^18.0+x0^51.0*144.0*xyz^70.0+12.0*xyz^30.0-x0^8.0*12.0*xyz^126.0-x0*1.3333333333333333*xyz^55.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0*7.111111111111111*18.0*xyz^17.0+x0^51.0*144.0*70.0*xyz^69.0+12.0*30.0*xyz^29.0-x0^8.0*12.0*126.0*xyz^125.0-x0*1.3333333333333333*55.0*xyz^54.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*128.0*xyz^17.0+x0^51.0*10080.0*xyz^69.0+360.0*xyz^29.0-x0^8.0*1512.0*xyz^125.0-x0*73.33333333333333*xyz^54.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0*7.111111111111111*xyz^18.0+x0^51.0*144.0*xyz^70.0+12.0*xyz^30.0-x0^8.0*12.0*xyz^126.0-x0*1.3333333333333333*xyz^55.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0*7.111111111111111/19.0*xyz^19.0+x0^51.0*144.0/71.0*xyz^71.0+12.0/31.0*xyz^31.0-x0^8.0*12.0/127.0*xyz^127.0-x0*1.3333333333333333/56.0*xyz^56.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0*0.3742690058479532*xyz^19.0+x0^51.0*2.028169014084507*xyz^71.0+0.3870967741935484*xyz^31.0-x0^8.0*0.09448818897637795*xyz^127.0-x0/42.0*xyz^56.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*128.0*xyz^17.0+x0^51.0*10080.0*xyz^69.0+360.0*xyz^29.0-x0^8.0*1512.0*xyz^125.0-x0*73.33333333333333*xyz^54.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*128.0*17.0*xyz^16.0+x0^51.0*10080.0*69.0*xyz^68.0+360.0*29.0*xyz^28.0-x0^8.0*1512.0*125.0*xyz^124.0-x0*73.33333333333333*54.0*xyz^53.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*2176.0*xyz^16.0+x0^51.0*695520.0*xyz^68.0+10440.0*xyz^28.0-x0^8.0*189000.0*xyz^124.0-x0*3959.9999999999995*xyz^53.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0*0.3742690058479532*xyz^19.0+x0^51.0*2.028169014084507*xyz^71.0+0.3870967741935484*xyz^31.0-x0^8.0*0.09448818897637795*xyz^127.0-x0/42.0*xyz^56.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0*0.3742690058479532/20.0*xyz^20.0+x0^51.0*2.028169014084507/72.0*xyz^72.0+0.3870967741935484/32.0*xyz^32.0-x0^8.0*0.09448818897637795/128.0*xyz^128.0-x0*42.0/57.0*xyz^57.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0*0.01871345029239766*xyz^20.0+x0^51.0/35.5*xyz^72.0+0.012096774193548387*xyz^32.0-x0^8.0*7.381889763779527E-4*xyz^128.0-x0/1.3571428571428572*xyz^57.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*2176.0*xyz^16.0+x0^51.0*695520.0*xyz^68.0+10440.0*xyz^28.0-x0^8.0*189000.0*xyz^124.0-x0*3959.9999999999995*xyz^53.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*2176.0*16.0*xyz^15.0+x0^51.0*695520.0*68.0*xyz^67.0+10440.0*28.0*xyz^27.0-x0^8.0*189000.0*124.0*xyz^123.0-x0*3959.9999999999995*53.0*xyz^52.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*34816.0*xyz^15.0+x0^51.0*4.729536E7*xyz^67.0+292320.0*xyz^27.0-x0^8.0*2.3436E7*xyz^123.0-x0*209879.99999999997*xyz^52.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0*0.01871345029239766*xyz^20.0+x0^51.0/35.5*xyz^72.0+0.012096774193548387*xyz^32.0-x0^8.0*7.381889763779527E-4*xyz^128.0-4.0*xyz^128.0-x0/1.3571428571428572*xyz^57.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0*0.01871345029239766/21.0*xyz^21.0+x0^51.0/35.5/73.0*xyz^73.0+0.012096774193548387/33.0*xyz^33.0-x0^8.0*7.381889763779527E-4/129.0*xyz^129.0-4.0/129.0*xyz^129.0-x0*1.3571428571428572/58.0*xyz^58.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0*8.911166805903648E-4*xyz^21.0+x0^51.0/2591.5*xyz^73.0+3.6656891495601173E-4*xyz^33.0-x0^8.0/174752.0*xyz^129.0-1.0/32.25*xyz^129.0-0.031007751937984496*xyz^129.0-x0/42.73684210526316*xyz^58.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*34816.0*xyz^15.0+x0^51.0*4.729536E7*xyz^67.0+292320.0*xyz^27.0-x0^8.0*2.3436E7*xyz^123.0-x0*209879.99999999997*xyz^52.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*34816.0*15.0*xyz^14.0+x0^51.0*4.729536E7*67.0*xyz^66.0+292320.0*27.0*xyz^26.0-x0^8.0*2.3436E7*123.0*xyz^122.0-x0*209879.99999999997*52.0*xyz^51.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*522240.0*xyz^14.0+x0^51.0*3.16878912E9*xyz^66.0+7892640.0*xyz^26.0-x0^8.0*2.882628E9*xyz^122.0-x0*1.0913759999999998E7*xyz^51.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0*8.911166805903648E-4*xyz^21.0-4.0*xyz^21.0+x0^51.0/2591.5*xyz^73.0+3.6656891495601173E-4*xyz^33.0-4.0*xyz^33.0-x0^8.0/174752.0*xyz^129.0-1.0/32.25*xyz^129.0-0.031007751937984496*xyz^129.0-x0/42.73684210526316*xyz^58.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0*8.911166805903648E-4/22.0*xyz^22.0-4.0/22.0*xyz^22.0+x0^51.0/2591.5/74.0*xyz^74.0+3.6656891495601173E-4/34.0*xyz^34.0-4.0/34.0*xyz^34.0-x0^8.0/174752.0/130.0*xyz^130.0-1.0/32.25/130.0*xyz^130.0-0.031007751937984496/130.0*xyz^130.0-x0*42.73684210526316/59.0*xyz^59.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0/24688.125*xyz^22.0-1.0/5.5*xyz^22.0-0.18181818181818182*xyz^22.0+x0^51.0/191771.0*xyz^74.0+1.0/92752.0*xyz^34.0-1.0/8.5*xyz^34.0-0.11764705882352941*xyz^34.0-x0^8.0/2.271776E7*xyz^130.0-1.0/4192.5*xyz^130.0-2.385211687537269E-4*xyz^130.0-x0/1.3805418719211824*xyz^59.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131390() {
 UsageCalculus.TestCase = 131390;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xyza^2^3/-3*xyza^3^4*-4*xyza^1^5-3*xyza^3^4*-4*xyza^1^54*x0^51*xyza^2^6*+-3*xyza^3^7*4*xyza^1^8*-1*xyza^2^9-3*xyza^3^7*4*xyza^1^8*-1*xyza^2^94*x0^8*-1*x0^91*xyza^2^9-3*xyza^3^10*+4*xyza^1*1*xyza^2^2/-3*xyza^3^34*x0*1*x0^2/-3*x0^31*xyza^2^2/-3*xyza^3^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=389 EqnNumber=90 FamilyID=3 MotifTag=4 Entropy=3 FuncWrapAliasID=4"+
"// MetaRow=[12, 90, 10, 11, 4, 3, 1, 6, 1, 2, 3, 2, 3, 1, 2, 3, 1, 2, 1, 2, 3, 11, 1, 2, 3, 4, 15, 2, 3, 13, 2, 24]"+
"// DOEMatrixRow=[5, 90, 17, 3, 1, 2, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 22, 1, 3, 1, 1, 1, 2, 3, 1, 1, 2, 3, 12, 1]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "1.3333333333333333*xyza^18.0+x0^51.0*144.0*xyza^70.0+12.0*xyza^30.0-x0^8.0*12.0*xyza^126.0+x0/2.25*xyza^65.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "1.3333333333333333*18.0*xyza^17.0+x0^51.0*144.0*70.0*xyza^69.0+12.0*30.0*xyza^29.0-x0^8.0*12.0*126.0*xyza^125.0+x0/2.25*65.0*xyza^64.0";
 UsageCalculus.EqnSolArrayMap2[1] = "24.0*xyza^17.0+x0^51.0*10080.0*xyza^69.0+360.0*xyza^29.0-x0^8.0*1512.0*xyza^125.0+x0*28.88888888888889*xyza^64.0";
 UsageCalculus.EqnSolArrayMap3[1] = "1.3333333333333333*xyza^18.0+x0^51.0*144.0*xyza^70.0+12.0*xyza^30.0-x0^8.0*12.0*xyza^126.0+x0/2.25*xyza^65.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.3333333333333333/19.0*xyza^19.0+x0^51.0*144.0/71.0*xyza^71.0+12.0/31.0*xyza^31.0-x0^8.0*12.0/127.0*xyza^127.0+x0*2.25/66.0*xyza^66.0";
 UsageCalculus.EqnSolArrayMap4[1] = "0.07017543859649122*xyza^19.0+x0^51.0*2.028169014084507*xyza^71.0+0.3870967741935484*xyza^31.0-x0^8.0*0.09448818897637795*xyza^127.0+x0/29.333333333333332*xyza^66.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "24.0*xyza^17.0+x0^51.0*10080.0*xyza^69.0+360.0*xyza^29.0-x0^8.0*1512.0*xyza^125.0+x0*28.88888888888889*xyza^64.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "24.0*17.0*xyza^16.0+x0^51.0*10080.0*69.0*xyza^68.0+360.0*29.0*xyza^28.0-x0^8.0*1512.0*125.0*xyza^124.0+x0*28.88888888888889*64.0*xyza^63.0";
 UsageCalculus.EqnSolArrayMap2[2] = "408.0*xyza^16.0+x0^51.0*695520.0*xyza^68.0+10440.0*xyza^28.0-x0^8.0*189000.0*xyza^124.0+x0*1848.888888888889*xyza^63.0";
 UsageCalculus.EqnSolArrayMap3[2] = "0.07017543859649122*xyza^19.0+x0^51.0*2.028169014084507*xyza^71.0+0.3870967741935484*xyza^31.0-x0^8.0*0.09448818897637795*xyza^127.0+x0/29.333333333333332*xyza^66.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "0.07017543859649122/20.0*xyza^20.0+x0^51.0*2.028169014084507/72.0*xyza^72.0+0.3870967741935484/32.0*xyza^32.0-x0^8.0*0.09448818897637795/128.0*xyza^128.0+x0*29.333333333333332/67.0*xyza^67.0";
 UsageCalculus.EqnSolArrayMap4[2] = "0.003508771929824561*xyza^20.0+x0^51.0/35.5*xyza^72.0+0.012096774193548387*xyza^32.0-x0^8.0*7.381889763779527E-4*xyza^128.0+x0/2.284090909090909*xyza^67.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "408.0*xyza^16.0+x0^51.0*695520.0*xyza^68.0+10440.0*xyza^28.0-x0^8.0*189000.0*xyza^124.0+x0*1848.888888888889*xyza^63.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "408.0*16.0*xyza^15.0+x0^51.0*695520.0*68.0*xyza^67.0+10440.0*28.0*xyza^27.0-x0^8.0*189000.0*124.0*xyza^123.0+x0*1848.888888888889*63.0*xyza^62.0";
 UsageCalculus.EqnSolArrayMap2[3] = "6528.0*xyza^15.0+x0^51.0*4.729536E7*xyza^67.0+292320.0*xyza^27.0-x0^8.0*2.3436E7*xyza^123.0+x0*116480.0*xyza^62.0";
 UsageCalculus.EqnSolArrayMap3[3] = "0.003508771929824561*xyza^20.0+x0^51.0/35.5*xyza^72.0+0.012096774193548387*xyza^32.0-x0^8.0*7.381889763779527E-4*xyza^128.0-4.0*xyza^128.0+x0/2.284090909090909*xyza^67.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "0.003508771929824561/21.0*xyza^21.0+x0^51.0/35.5/73.0*xyza^73.0+0.012096774193548387/33.0*xyza^33.0-x0^8.0*7.381889763779527E-4/129.0*xyza^129.0-4.0/129.0*xyza^129.0+x0*2.284090909090909/68.0*xyza^68.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.6708437761069338E-4*xyza^21.0+x0^51.0/2591.5*xyza^73.0+3.6656891495601173E-4*xyza^33.0-x0^8.0/174752.0*xyza^129.0-1.0/32.25*xyza^129.0-0.031007751937984496*xyza^129.0+x0/29.771144278606965*xyza^68.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "6528.0*xyza^15.0+x0^51.0*4.729536E7*xyza^67.0+292320.0*xyza^27.0-x0^8.0*2.3436E7*xyza^123.0+x0*116480.0*xyza^62.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "6528.0*15.0*xyza^14.0+x0^51.0*4.729536E7*67.0*xyza^66.0+292320.0*27.0*xyza^26.0-x0^8.0*2.3436E7*123.0*xyza^122.0+x0*116480.0*62.0*xyza^61.0";
 UsageCalculus.EqnSolArrayMap2[4] = "97920.0*xyza^14.0+x0^51.0*3.16878912E9*xyza^66.0+7892640.0*xyza^26.0-x0^8.0*2.882628E9*xyza^122.0+x0*7221760.0*xyza^61.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.6708437761069338E-4*xyza^21.0-4.0*xyza^21.0+x0^51.0/2591.5*xyza^73.0+3.6656891495601173E-4*xyza^33.0-4.0*xyza^33.0-x0^8.0/174752.0*xyza^129.0-1.0/32.25*xyza^129.0-0.031007751937984496*xyza^129.0+x0/29.771144278606965*xyza^68.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.6708437761069338E-4/22.0*xyza^22.0-4.0/22.0*xyza^22.0+x0^51.0/2591.5/74.0*xyza^74.0+3.6656891495601173E-4/34.0*xyza^34.0-4.0/34.0*xyza^34.0-x0^8.0/174752.0/130.0*xyza^130.0-1.0/32.25/130.0*xyza^130.0-0.031007751937984496/130.0*xyza^130.0+x0*29.771144278606965/69.0*xyza^69.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/131670.00000000003*xyza^22.0-1.0/5.5*xyza^22.0-0.18181818181818182*xyza^22.0+x0^51.0/191771.0*xyza^74.0+1.0/92752.0*xyza^34.0-1.0/8.5*xyza^34.0-0.11764705882352941*xyza^34.0-x0^8.0/2.271776E7*xyza^130.0-1.0/4192.5*xyza^130.0-2.385211687537269E-4*xyza^130.0+x0/2.3176804812834226*xyza^69.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131391() {
 UsageCalculus.TestCase = 131391;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*x^3^4*-4*x^1^54*x0^51*x^2^6*+-3*x^3^7*4*x^1^8*-1*x^2^9-3*x^3^7*4*x^1^8*-1*x^2^94*x0^8*-1*x0^91*x^2^9-3*x^3^10*+4*x^1*1*x^2^2/-3*x^3^34*x0*1*x0^2/-3*x0^31*x^2^2/-3*x^3^3-3*x^3^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=390 EqnNumber=91 FamilyID=1 MotifTag=1 Entropy=4 FuncWrapAliasID=1"+
"// MetaRow=[12, 91, 10, 10, 1, 1, 2, 7, 2, 3, 4, 1, 1, 2, 3, 1, 2, 1, 2, 3, 4, 12, 2, 3, 1, 1, 16, 3, 4, 14, 3, 25]"+
"// DOEMatrixRow=[5, 91, 17, 2, 1, 3, 2, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 23, 2, 1, 2, 3, 2, 3, 4, 2, 3, 1, 4, 13, 2]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "144.0*x^70.0+12.0*x^30.0-12.0*x^126.0+1.0/2.25*x^65.0-3.0*x^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "144.0*70.0*x^69.0+12.0*30.0*x^29.0-12.0*126.0*x^125.0+1.0/2.25*65.0*x^64.0-3.0*6.0*x^5.0";
 UsageCalculus.EqnSolArrayMap2[1] = "10080.0*x^69.0+360.0*x^29.0-1512.0*x^125.0+28.88888888888889*x^64.0-18.0*x^5.0";
 UsageCalculus.EqnSolArrayMap3[1] = "144.0*x^70.0+12.0*x^30.0-12.0*x^126.0+1.0/2.25*x^65.0-3.0*x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "144.0/71.0*x^71.0+12.0/31.0*x^31.0-12.0/127.0*x^127.0+1.0/2.25/66.0*x^66.0-3.0/7.0*x^7.0";
 UsageCalculus.EqnSolArrayMap4[1] = "2.028169014084507*x^71.0+1.0/2.5833333333333335*x^31.0-1.0/10.583333333333334*x^127.0+1.0/148.5*x^66.0-1.0/2.3333333333333335*x^7.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "10080.0*x^69.0+360.0*x^29.0-1512.0*x^125.0+28.88888888888889*x^64.0-18.0*x^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "10080.0*69.0*x^68.0+360.0*29.0*x^28.0-1512.0*125.0*x^124.0+28.88888888888889*64.0*x^63.0-18.0*5.0*x^4.0";
 UsageCalculus.EqnSolArrayMap2[2] = "695520.0*x^68.0+10440.0*x^28.0-189000.0*x^124.0+1848.888888888889*x^63.0-90.0*x^4.0";
 UsageCalculus.EqnSolArrayMap3[2] = "2.028169014084507*x^71.0+1.0/2.5833333333333335*x^31.0-1.0/10.583333333333334*x^127.0+1.0/148.5*x^66.0-1.0/2.3333333333333335*x^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "2.028169014084507/72.0*x^72.0+1.0/2.5833333333333335/32.0*x^32.0-1.0/10.583333333333334/128.0*x^128.0+1.0/148.5/67.0*x^67.0-1.0/2.3333333333333335/8.0*x^8.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/35.5*x^72.0+1.0/82.66666666666667*x^32.0-1.0/1354.6666666666667*x^128.0+1.0/9949.5*x^67.0-1.0/18.666666666666668*x^8.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "695520.0*x^68.0+10440.0*x^28.0-189000.0*x^124.0+1848.888888888889*x^63.0-90.0*x^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "695520.0*68.0*x^67.0+10440.0*28.0*x^27.0-189000.0*124.0*x^123.0+1848.888888888889*63.0*x^62.0-90.0*4.0*x^3.0";
 UsageCalculus.EqnSolArrayMap2[3] = "4.729536E7*x^67.0+292320.0*x^27.0-2.3436E7*x^123.0+116480.0*x^62.0-360.0*x^3.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/35.5*x^72.0+1.0/82.66666666666667*x^32.0-1.0/1354.6666666666667*x^128.0+1.0/9949.5*x^67.0-1.0/18.666666666666668*x^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/35.5/73.0*x^73.0+1.0/82.66666666666667/33.0*x^33.0-1.0/1354.6666666666667/129.0*x^129.0+1.0/9949.5/68.0*x^68.0-1.0/18.666666666666668/9.0*x^9.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/2591.5*x^73.0+1.0/2728.0*x^33.0-1.0/174752.0*x^129.0+1.0/676566.0*x^68.0-1.0/168.0*x^9.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "4.729536E7*x^67.0+292320.0*x^27.0-2.3436E7*x^123.0+116480.0*x^62.0-360.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "67.0*x^66.0+292320.0*27.0*x^26.0-123.0*x^122.0+116480.0*62.0*x^61.0-360.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[4] = "67.0*x^66.0+7892640.0*x^26.0-123.0*x^122.0+7221760.0*x^61.0-1080.0*x^2.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/2591.5*x^73.0+1.0/2728.0*x^33.0-1.0/174752.0*x^129.0+1.0/676566.0*x^68.0-1.0/168.0*x^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/2591.5/74.0*x^74.0+1.0/2728.0/34.0*x^34.0-1.0/174752.0/130.0*x^130.0+1.0/676566.0/69.0*x^69.0-1.0/168.0/10.0*x^10.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/191771.0*x^74.0+1.0/92752.0*x^34.0-1.0/2.271776E7*x^130.0+1.0/4.6683054E7*x^69.0-1.0/1680.0*x^10.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131392() {
 UsageCalculus.TestCase = 131392;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "4*x0^51*xy^2^6*+-3*xy^3^7*4*xy^1^8*-1*xy^2^9-3*xy^3^7*4*xy^1^8*-1*xy^2^94*x0^8*-1*x0^91*xy^2^9-3*xy^3^10*+4*xy^1*1*xy^2^2/-3*xy^3^34*x0*1*x0^2/-3*x0^31*xy^2^2/-3*xy^3^3-3*xy^3^3-2*x0^2*-3*x0^3/-4*x0^4*+-2*x0^5";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=391 EqnNumber=92 FamilyID=2 MotifTag=3 Entropy=1 FuncWrapAliasID=3"+
"// MetaRow=[12, 92, 10, 9, 2, 3, 1, 8, 3, 4, 1, 2, 3, 1, 4, 2, 3, 2, 3, 1, 1, 13, 3, 1, 2, 3, 1, 1, 1, 15, 4, 26]"+
"// DOEMatrixRow=[5, 92, 17, 1, 3, 1, 3, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 24, 3, 2, 3, 4, 3, 1, 5, 3, 1, 2, 1, 14, 1]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^51.0*48.0*xy^8.0+12.0*xy^30.0-x0^8.0*12.0*xy^126.0+x0/2.25*xy^65.0-3.0*xy^6.0-x0^2.0*3.0-x0^5.0*2.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^51.0*48.0*8.0*xy^7.0+12.0*30.0*xy^29.0-x0^8.0*12.0*126.0*xy^125.0+x0/2.25*65.0*xy^64.0-3.0*6.0*xy^5.0-x0^2.0*3.0*0.0-x0^5.0*2.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^51.0*384.0*xy^7.0+360.0*xy^29.0-x0^8.0*1512.0*xy^125.0+x0*28.88888888888889*xy^64.0-18.0*xy^5.0-x0^2.0*0.0-x0^5.0*0.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^51.0*48.0*xy^8.0+12.0*xy^30.0-x0^8.0*12.0*xy^126.0+x0/2.25*xy^65.0-3.0*xy^6.0-x0^2.0*3.0-x0^5.0*2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^51.0*48.0/9.0*xy^9.0+12.0/31.0*xy^31.0-x0^8.0*12.0/127.0*xy^127.0+x0/2.25/66.0*xy^66.0-3.0/7.0*xy^7.0-x0^2.0*3.0*xy-x0^5.0*2.0*xy";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^51.0*5.333333333333333*xy^9.0+0.3870967741935484*xy^31.0-x0^8.0*0.09448818897637795*xy^127.0+x0/148.5*xy^66.0-0.42857142857142855*xy^7.0-x0^2.0*3.0*xy-x0^5.0*2.0*xy";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^51.0*384.0*xy^7.0+360.0*xy^29.0-x0^8.0*1512.0*xy^125.0+x0*28.88888888888889*xy^64.0-18.0*xy^5.0-x0^2.0*0.0-x0^5.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^51.0*384.0*7.0*xy^6.0+360.0*29.0*xy^28.0-x0^8.0*1512.0*125.0*xy^124.0+x0*28.88888888888889*64.0*xy^63.0-18.0*5.0*xy^4.0-x0^2.0*0.0*0.0-x0^5.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^51.0*2688.0*xy^6.0+10440.0*xy^28.0-x0^8.0*189000.0*xy^124.0+x0*1848.888888888889*xy^63.0-90.0*xy^4.0-x0^2.0*0.0-x0^5.0*0.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^51.0*5.333333333333333*xy^9.0+0.3870967741935484*xy^31.0-x0^8.0*0.09448818897637795*xy^127.0+x0/148.5*xy^66.0-0.42857142857142855*xy^7.0-x0^2.0*3.0*xy-x0^5.0*2.0*xy";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^51.0*5.333333333333333/10.0*xy^10.0+0.3870967741935484/32.0*xy^32.0-x0^8.0*0.09448818897637795/128.0*xy^128.0+x0/148.5/67.0*xy^67.0-0.42857142857142855/8.0*xy^8.0-x0^2.0*3.0/2.0*xy^2.0-x0^5.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^51.0/1.875*xy^10.0+0.012096774193548387*xy^32.0-x0^8.0*7.381889763779527E-4*xy^128.0+x0/9949.5*xy^67.0-0.05357142857142857*xy^8.0-x0^2.0*1.5*xy^2.0-x0^5.0*xy^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^51.0*2688.0*xy^6.0+10440.0*xy^28.0-x0^8.0*189000.0*xy^124.0+x0*1848.888888888889*xy^63.0-90.0*xy^4.0-x0^2.0*0.0-x0^5.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^51.0*2688.0*6.0*xy^5.0+10440.0*28.0*xy^27.0-x0^8.0*189000.0*124.0*xy^123.0+x0*1848.888888888889*63.0*xy^62.0-90.0*4.0*xy^3.0-x0^2.0*0.0*0.0-x0^5.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^51.0*16128.0*xy^5.0+292320.0*xy^27.0-x0^8.0*2.3436E7*xy^123.0+x0*116480.0*xy^62.0-360.0*xy^3.0-x0^2.0*0.0-x0^5.0*0.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^51.0/1.875*xy^10.0+0.012096774193548387*xy^32.0-x0^8.0*7.381889763779527E-4*xy^128.0-4.0*xy^128.0+x0/9949.5*xy^67.0-0.05357142857142857*xy^8.0-x0^2.0*1.5*xy^2.0-x0^5.0*xy^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^51.0/1.875/11.0*xy^11.0+0.012096774193548387/33.0*xy^33.0-x0^8.0*7.381889763779527E-4/129.0*xy^129.0-4.0/129.0*xy^129.0+x0/9949.5/68.0*xy^68.0-0.05357142857142857/9.0*xy^9.0-x0^2.0*1.5/3.0*xy^3.0-x0^5.0/3.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^51.0/20.625*xy^11.0+3.6656891495601173E-4*xy^33.0-x0^8.0/174752.0*xy^129.0-1.0/32.25*xy^129.0-0.031007751937984496*xy^129.0+x0/676566.0*xy^68.0-0.005952380952380952*xy^9.0-x0^2.0*0.5*xy^3.0-x0^5.0/3.0*xy^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^51.0*16128.0*xy^5.0+292320.0*xy^27.0-x0^8.0*2.3436E7*xy^123.0+x0*116480.0*xy^62.0-360.0*xy^3.0-x0^2.0*0.0-x0^5.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^51.0*16128.0*5.0*xy^4.0+292320.0*27.0*xy^26.0-x0^8.0*2.3436E7*123.0*xy^122.0+x0*116480.0*62.0*xy^61.0-360.0*3.0*xy^2.0-x0^2.0*0.0*0.0-x0^5.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^51.0*80640.0*xy^4.0+7892640.0*xy^26.0-x0^8.0*2.882628E9*xy^122.0+x0*7221760.0*xy^61.0-1080.0*xy^2.0-x0^2.0*0.0-x0^5.0*0.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^51.0/20.625*xy^11.0+3.6656891495601173E-4*xy^33.0-4.0*xy^33.0-x0^8.0/174752.0*xy^129.0-1.0/32.25*xy^129.0-0.031007751937984496*xy^129.0+x0/676566.0*xy^68.0-0.005952380952380952*xy^9.0-x0^2.0*0.5*xy^3.0-x0^5.0/3.0*xy^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^51.0/20.625/12.0*xy^12.0+3.6656891495601173E-4/34.0*xy^34.0-4.0/34.0*xy^34.0-x0^8.0/174752.0/130.0*xy^130.0-1.0/32.25/130.0*xy^130.0-0.031007751937984496/130.0*xy^130.0+x0/676566.0/69.0*xy^69.0-0.005952380952380952/10.0*xy^10.0-x0^2.0*0.5/4.0*xy^4.0-x0^5.0*3.0/4.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^51.0/247.5*xy^12.0+1.0/92752.0*xy^34.0-1.0/8.5*xy^34.0-0.11764705882352941*xy^34.0-x0^8.0/2.271776E7*xy^130.0-1.0/4192.5*xy^130.0-2.385211687537269E-4*xy^130.0+x0/4.6683054E7*xy^69.0-5.952380952380952E-4*xy^10.0-x0^2.0*0.125*xy^4.0-x0^5.0/1.3333333333333333*xy^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131393() {
 UsageCalculus.TestCase = 131393;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xyz^2^6*+-3*xyz^3^7*4*xyz^1^8*-1*xyz^2^9-3*xyz^3^7*4*xyz^1^8*-1*xyz^2^94*x0^8*-1*x0^91*xyz^2^9-3*xyz^3^10*+4*xyz^1*1*xyz^2^2/-3*xyz^3^34*x0*1*x0^2/-3*x0^31*xyz^2^2/-3*xyz^3^3-3*xyz^3^3-2*x0^2*-3*x0^3/-4*x0^4*+-2*x0^53*xyz^3^3/-4*xyz^2^4*+-2*xyz^3^5";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=392 EqnNumber=93 FamilyID=3 MotifTag=4 Entropy=2 FuncWrapAliasID=4"+
"// MetaRow=[12, 93, 10, 8, 3, 1, 2, 9, 1, 1, 2, 1, 1, 2, 1, 3, 1, 1, 4, 2, 3, 14, 1, 2, 3, 4, 2, 3, 2, 16, 1, 27]"+
"// DOEMatrixRow=[5, 93, 17, 4, 2, 3, 1, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 25, 4, 3, 1, 5, 1, 2, 6, 4, 2, 3, 2, 15, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "12.0*xyz^8.0+12.0*xyz^30.0-x0^8.0*12.0*xyz^126.0+x0/2.25*xyz^65.0-3.0*xyz^6.0-x0^2.0*1.5+x0^53.0*xyz^12.0-2.0*xyz^8.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "12.0*8.0*xyz^7.0+12.0*30.0*xyz^29.0-x0^8.0*12.0*126.0*xyz^125.0+x0/2.25*65.0*xyz^64.0-3.0*6.0*xyz^5.0-x0^2.0*1.5*0.0+x0^53.0*12.0*xyz^11.0-2.0*8.0*xyz^7.0";
 UsageCalculus.EqnSolArrayMap2[1] = "96.0*xyz^7.0+360.0*xyz^29.0-x0^8.0*1512.0*xyz^125.0+x0*28.88888888888889*xyz^64.0-18.0*xyz^5.0-x0^2.0*0.0+x0^53.0*12.0*xyz^11.0-16.0*xyz^7.0";
 UsageCalculus.EqnSolArrayMap3[1] = "12.0*xyz^8.0+12.0*xyz^30.0-x0^8.0*12.0*xyz^126.0+x0/2.25*xyz^65.0-3.0*xyz^6.0-x0^2.0*1.5+x0^53.0*xyz^12.0-2.0*xyz^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "12.0/9.0*xyz^9.0+12.0/31.0*xyz^31.0-x0^8.0*12.0/127.0*xyz^127.0+x0/2.25/66.0*xyz^66.0-3.0/7.0*xyz^7.0-x0^2.0*1.5*xyz+x0^53.0/13.0*xyz^13.0-2.0/9.0*xyz^9.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.3333333333333333*xyz^9.0+0.3870967741935484*xyz^31.0-x0^8.0*0.09448818897637795*xyz^127.0+x0/148.5*xyz^66.0-0.42857142857142855*xyz^7.0-x0^2.0*1.5*xyz+x0^53.0/13.0*xyz^13.0-1.0/4.5*xyz^9.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "96.0*xyz^7.0+360.0*xyz^29.0-x0^8.0*1512.0*xyz^125.0+x0*28.88888888888889*xyz^64.0-18.0*xyz^5.0-x0^2.0*0.0+x0^53.0*12.0*xyz^11.0-16.0*xyz^7.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "96.0*7.0*xyz^6.0+360.0*29.0*xyz^28.0-x0^8.0*1512.0*125.0*xyz^124.0+x0*28.88888888888889*64.0*xyz^63.0-18.0*5.0*xyz^4.0-x0^2.0*0.0*0.0+x0^53.0*12.0*11.0*xyz^10.0-16.0*7.0*xyz^6.0";
 UsageCalculus.EqnSolArrayMap2[2] = "672.0*xyz^6.0+10440.0*xyz^28.0-x0^8.0*189000.0*xyz^124.0+x0*1848.888888888889*xyz^63.0-90.0*xyz^4.0-x0^2.0*0.0+x0^53.0*132.0*xyz^10.0-112.0*xyz^6.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.3333333333333333*xyz^9.0+0.3870967741935484*xyz^31.0-x0^8.0*0.09448818897637795*xyz^127.0+x0/148.5*xyz^66.0-0.42857142857142855*xyz^7.0-x0^2.0*1.5*xyz+x0^53.0/13.0*xyz^13.0-1.0/4.5*xyz^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.3333333333333333/10.0*xyz^10.0+0.3870967741935484/32.0*xyz^32.0-x0^8.0*0.09448818897637795/128.0*xyz^128.0+x0/148.5/67.0*xyz^67.0-0.42857142857142855/8.0*xyz^8.0-x0^2.0*1.5/2.0*xyz^2.0+x0^53.0/13.0/14.0*xyz^14.0-1.0/4.5/10.0*xyz^10.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/7.5*xyz^10.0+0.012096774193548387*xyz^32.0-x0^8.0*7.381889763779527E-4*xyz^128.0+x0/9949.5*xyz^67.0-0.05357142857142857*xyz^8.0-x0^2.0*0.75*xyz^2.0+x0^53.0/182.0*xyz^14.0-1.0/45.0*xyz^10.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "672.0*xyz^6.0+10440.0*xyz^28.0-x0^8.0*189000.0*xyz^124.0+x0*1848.888888888889*xyz^63.0-90.0*xyz^4.0-x0^2.0*0.0+x0^53.0*132.0*xyz^10.0-112.0*xyz^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "672.0*6.0*xyz^5.0+10440.0*28.0*xyz^27.0-x0^8.0*189000.0*124.0*xyz^123.0+x0*1848.888888888889*63.0*xyz^62.0-90.0*4.0*xyz^3.0-x0^2.0*0.0*0.0+x0^53.0*132.0*10.0*xyz^9.0-112.0*6.0*xyz^5.0";
 UsageCalculus.EqnSolArrayMap2[3] = "4032.0*xyz^5.0+292320.0*xyz^27.0-x0^8.0*2.3436E7*xyz^123.0+x0*116480.0*xyz^62.0-360.0*xyz^3.0-x0^2.0*0.0+x0^53.0*1320.0*xyz^9.0-672.0*xyz^5.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/7.5*xyz^10.0+0.012096774193548387*xyz^32.0-x0^8.0*7.381889763779527E-4*xyz^128.0-4.0*xyz^128.0+x0/9949.5*xyz^67.0-0.05357142857142857*xyz^8.0-x0^2.0*0.75*xyz^2.0+x0^53.0/182.0*xyz^14.0-1.0/45.0*xyz^10.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/7.5/11.0*xyz^11.0+0.012096774193548387/33.0*xyz^33.0-x0^8.0*7.381889763779527E-4/129.0*xyz^129.0-4.0/129.0*xyz^129.0+x0/9949.5/68.0*xyz^68.0-0.05357142857142857/9.0*xyz^9.0-x0^2.0*0.75/3.0*xyz^3.0+x0^53.0/182.0/15.0*xyz^15.0-1.0/45.0/11.0*xyz^11.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/82.5*xyz^11.0+3.6656891495601173E-4*xyz^33.0-x0^8.0/174752.0*xyz^129.0-1.0/32.25*xyz^129.0-0.031007751937984496*xyz^129.0+x0/676566.0*xyz^68.0-0.005952380952380952*xyz^9.0-x0^2.0*0.25*xyz^3.0+x0^53.0/2730.0*xyz^15.0-1.0/495.0*xyz^11.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "4032.0*xyz^5.0+292320.0*xyz^27.0-x0^8.0*2.3436E7*xyz^123.0+x0*116480.0*xyz^62.0-360.0*xyz^3.0-x0^2.0*0.0+x0^53.0*1320.0*xyz^9.0-672.0*xyz^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "4032.0*5.0*xyz^4.0+292320.0*27.0*xyz^26.0-x0^8.0*2.3436E7*123.0*xyz^122.0+x0*116480.0*62.0*xyz^61.0-360.0*3.0*xyz^2.0-x0^2.0*0.0*0.0+x0^53.0*1320.0*9.0*xyz^8.0-672.0*5.0*xyz^4.0";
 UsageCalculus.EqnSolArrayMap2[4] = "20160.0*xyz^4.0+7892640.0*xyz^26.0-x0^8.0*2.882628E9*xyz^122.0+x0*7221760.0*xyz^61.0-1080.0*xyz^2.0-x0^2.0*0.0+x0^53.0*11880.0*xyz^8.0-3360.0*xyz^4.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/82.5*xyz^11.0+3.6656891495601173E-4*xyz^33.0-4.0*xyz^33.0-x0^8.0/174752.0*xyz^129.0-1.0/32.25*xyz^129.0-0.031007751937984496*xyz^129.0+x0/676566.0*xyz^68.0-0.005952380952380952*xyz^9.0-x0^2.0*0.25*xyz^3.0+x0^53.0/2730.0*xyz^15.0-1.0/495.0*xyz^11.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/82.5/12.0*xyz^12.0+3.6656891495601173E-4/34.0*xyz^34.0-4.0/34.0*xyz^34.0-x0^8.0/174752.0/130.0*xyz^130.0-1.0/32.25/130.0*xyz^130.0-0.031007751937984496/130.0*xyz^130.0+x0/676566.0/69.0*xyz^69.0-0.005952380952380952/10.0*xyz^10.0-x0^2.0*0.25/4.0*xyz^4.0+x0^53.0/2730.0/16.0*xyz^16.0-1.0/495.0/12.0*xyz^12.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/990.0*xyz^12.0+1.0/92752.0*xyz^34.0-1.0/8.5*xyz^34.0-0.11764705882352941*xyz^34.0-x0^8.0/2.271776E7*xyz^130.0-1.0/4192.5*xyz^130.0-2.385211687537269E-4*xyz^130.0+x0/4.6683054E7*xyz^69.0-5.952380952380952E-4*xyz^10.0-x0^2.0*0.0625*xyz^4.0+x0^53.0/43680.0*xyz^16.0-1.0/5940.0*xyz^12.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131394() {
 UsageCalculus.TestCase = 131394;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xyza^3^7*4*xyza^1^8*-1*xyza^2^94*x0^8*-1*x0^91*xyza^2^9-3*xyza^3^10*+4*xyza^1*1*xyza^2^2/-3*xyza^3^34*x0*1*x0^2/-3*x0^31*xyza^2^2/-3*xyza^3^3-3*xyza^3^3-2*x0^2*-3*x0^3/-4*x0^4*+-2*x0^53*xyza^3^3/-4*xyza^2^4*+-2*xyza^3^54*xyza^2^4*+-2*xyza^3^5";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=393 EqnNumber=94 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[12, 94, 10, 7, 4, 2, 3, 10, 2, 3, 4, 2, 3, 1, 2, 1, 2, 1, 5, 3, 4, 15, 2, 3, 1, 1, 3, 1, 3, 1, 2, 28]"+
"// DOEMatrixRow=[5, 94, 17, 3, 1, 1, 2, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 26, 5, 1, 2, 1, 2, 3, 1, 1, 3, 1, 3, 16, 1]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^8.0*12.0*xyza^126.0+x0/2.25*xyza^65.0-3.0*xyza^6.0-x0^2.0*3.0+x0^53.0*2.0*xyza^12.0-4.0*xyza^63.0-2.0*xyza^8.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^8.0*12.0*126.0*xyza^125.0+x0/2.25*65.0*xyza^64.0-3.0*6.0*xyza^5.0-x0^2.0*3.0*0.0+x0^53.0*2.0*12.0*xyza^11.0-4.0*63.0*xyza^62.0-2.0*8.0*xyza^7.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^8.0*1512.0*xyza^125.0+x0*28.88888888888889*xyza^64.0-18.0*xyza^5.0-x0^2.0*0.0+x0^53.0*24.0*xyza^11.0-252.0*xyza^62.0-16.0*xyza^7.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^8.0*12.0*xyza^126.0+x0/2.25*xyza^65.0-3.0*xyza^6.0-x0^2.0*3.0+x0^53.0*2.0*xyza^12.0-4.0*xyza^63.0-2.0*xyza^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^8.0*12.0/127.0*xyza^127.0+x0/2.25/66.0*xyza^66.0-3.0/7.0*xyza^7.0-x0^2.0*3.0*xyza+x0^53.0*2.0/13.0*xyza^13.0-4.0/64.0*xyza^64.0-2.0/9.0*xyza^9.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^8.0*0.09448818897637795*xyza^127.0+x0/148.5*xyza^66.0-0.42857142857142855*xyza^7.0-x0^2.0*3.0*xyza+x0^53.0/6.5*xyza^13.0-1.0/16.0*xyza^64.0-1.0/4.5*xyza^9.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^8.0*1512.0*xyza^125.0+x0*28.88888888888889*xyza^64.0-18.0*xyza^5.0-x0^2.0*0.0+x0^53.0*24.0*xyza^11.0-252.0*xyza^62.0-16.0*xyza^7.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^8.0*1512.0*125.0*xyza^124.0+x0*28.88888888888889*64.0*xyza^63.0-18.0*5.0*xyza^4.0-x0^2.0*0.0*0.0+x0^53.0*24.0*11.0*xyza^10.0-252.0*62.0*xyza^61.0-16.0*7.0*xyza^6.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^8.0*189000.0*xyza^124.0+x0*1848.888888888889*xyza^63.0-90.0*xyza^4.0-x0^2.0*0.0+x0^53.0*264.0*xyza^10.0-15624.0*xyza^61.0-112.0*xyza^6.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^8.0*0.09448818897637795*xyza^127.0+x0/148.5*xyza^66.0-0.42857142857142855*xyza^7.0-x0^2.0*3.0*xyza+x0^53.0/6.5*xyza^13.0-1.0/16.0*xyza^64.0-1.0/4.5*xyza^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^8.0*0.09448818897637795/128.0*xyza^128.0+x0/148.5/67.0*xyza^67.0-0.42857142857142855/8.0*xyza^8.0-x0^2.0*3.0/2.0*xyza^2.0+x0^53.0/6.5/14.0*xyza^14.0-1.0/16.0/65.0*xyza^65.0-1.0/4.5/10.0*xyza^10.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^8.0*7.381889763779527E-4*xyza^128.0+x0/9949.5*xyza^67.0-0.05357142857142857*xyza^8.0-x0^2.0*1.5*xyza^2.0+x0^53.0/91.0*xyza^14.0-1.0/1040.0*xyza^65.0-1.0/45.0*xyza^10.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^8.0*189000.0*xyza^124.0+x0*1848.888888888889*xyza^63.0-90.0*xyza^4.0-x0^2.0*0.0+x0^53.0*264.0*xyza^10.0-15624.0*xyza^61.0-112.0*xyza^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^8.0*189000.0*124.0*xyza^123.0+x0*1848.888888888889*63.0*xyza^62.0-90.0*4.0*xyza^3.0-x0^2.0*0.0*0.0+x0^53.0*264.0*10.0*xyza^9.0-15624.0*61.0*xyza^60.0-112.0*6.0*xyza^5.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^8.0*2.3436E7*xyza^123.0+x0*116480.0*xyza^62.0-360.0*xyza^3.0-x0^2.0*0.0+x0^53.0*2640.0*xyza^9.0-953064.0*xyza^60.0-672.0*xyza^5.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^8.0*7.381889763779527E-4*xyza^128.0-4.0*xyza^128.0+x0/9949.5*xyza^67.0-0.05357142857142857*xyza^8.0-x0^2.0*1.5*xyza^2.0+x0^53.0/91.0*xyza^14.0-1.0/1040.0*xyza^65.0-1.0/45.0*xyza^10.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^8.0*7.381889763779527E-4/129.0*xyza^129.0-4.0/129.0*xyza^129.0+x0/9949.5/68.0*xyza^68.0-0.05357142857142857/9.0*xyza^9.0-x0^2.0*1.5/3.0*xyza^3.0+x0^53.0/91.0/15.0*xyza^15.0-1.0/1040.0/66.0*xyza^66.0-1.0/45.0/11.0*xyza^11.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^8.0/174752.0*xyza^129.0-1.0/32.25*xyza^129.0-0.031007751937984496*xyza^129.0+x0/676566.0*xyza^68.0-0.005952380952380952*xyza^9.0-x0^2.0*0.5*xyza^3.0+x0^53.0/1365.0*xyza^15.0-1.0/68640.0*xyza^66.0-1.0/495.0*xyza^11.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^8.0*2.3436E7*xyza^123.0+x0*116480.0*xyza^62.0-360.0*xyza^3.0-x0^2.0*0.0+x0^53.0*2640.0*xyza^9.0-953064.0*xyza^60.0-672.0*xyza^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^8.0*2.3436E7*123.0*xyza^122.0+x0*116480.0*62.0*xyza^61.0-360.0*3.0*xyza^2.0-x0^2.0*0.0*0.0+x0^53.0*2640.0*9.0*xyza^8.0-953064.0*60.0*xyza^59.0-672.0*5.0*xyza^4.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^8.0*2.882628E9*xyza^122.0+x0*7221760.0*xyza^61.0-1080.0*xyza^2.0-x0^2.0*0.0+x0^53.0*23760.0*xyza^8.0-5.718384E7*xyza^59.0-3360.0*xyza^4.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^8.0/174752.0*xyza^129.0-1.0/32.25*xyza^129.0-0.031007751937984496*xyza^129.0+x0/676566.0*xyza^68.0-0.005952380952380952*xyza^9.0-x0^2.0*0.5*xyza^3.0+x0^53.0/1365.0*xyza^15.0-1.0/68640.0*xyza^66.0-1.0/495.0*xyza^11.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^8.0/174752.0/130.0*xyza^130.0-1.0/32.25/130.0*xyza^130.0-0.031007751937984496/130.0*xyza^130.0+x0/676566.0/69.0*xyza^69.0-0.005952380952380952/10.0*xyza^10.0-x0^2.0*0.5/4.0*xyza^4.0+x0^53.0/1365.0/16.0*xyza^16.0-1.0/68640.0/67.0*xyza^67.0-1.0/495.0/12.0*xyza^12.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^8.0/2.271776E7*xyza^130.0-1.0/4192.5*xyza^130.0-2.385211687537269E-4*xyza^130.0+x0/4.6683054E7*xyza^69.0-5.952380952380952E-4*xyza^10.0-x0^2.0*0.125*xyza^4.0+x0^53.0/21840.0*xyza^16.0-1.0/4598880.0*xyza^67.0-1.0/5940.0*xyza^12.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131395() {
 UsageCalculus.TestCase = 131395;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "4*x0^8*-1*x0^91*x^2^9-3*x^3^10*+4*x^1*1*x^2^2/-3*x^3^34*x0*1*x0^2/-3*x0^31*x^2^2/-3*x^3^3-3*x^3^3-2*x0^2*-3*x0^3/-4*x0^4*+-2*x0^53*x^3^3/-4*x^2^4*+-2*x^3^54*x^2^4*+-2*x^3^5-2*x0^5";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=394 EqnNumber=95 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[12, 95, 10, 6, 1, 3, 1, 1, 3, 4, 1, 1, 1, 2, 3, 2, 3, 2, 1, 1, 1, 16, 3, 1, 2, 3, 4, 2, 4, 2, 3, 29]"+
"// DOEMatrixRow=[5, 95, 17, 2, 1, 2, 3, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 27, 6, 2, 3, 2, 3, 1, 2, 3, 1, 2, 4, 1, 2]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-4.0*x^11.0+1.0/2.25*x^65.0-3.0*x^6.0-3.0+2.0*x^12.0-4.0*x^63.0-2.0*x^8.0-2.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-4.0*11.0*x^10.0+1.0/2.25*65.0*x^64.0-3.0*6.0*x^5.0-3.0*0.0+2.0*12.0*x^11.0-4.0*63.0*x^62.0-2.0*8.0*x^7.0-2.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-44.0*x^10.0+28.88888888888889*x^64.0-18.0*x^5.0+24.0*x^11.0-252.0*x^62.0-16.0*x^7.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-4.0*x^11.0+1.0/2.25*x^65.0-3.0*x^6.0-3.0+2.0*x^12.0-4.0*x^63.0-2.0*x^8.0-2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-4.0/12.0*x^12.0+1.0/2.25/66.0*x^66.0-3.0/7.0*x^7.0-3.0*x+2.0/13.0*x^13.0-4.0/64.0*x^64.0-2.0/9.0*x^9.0-2.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/3.0*x^12.0+1.0/148.5*x^66.0-1.0/2.3333333333333335*x^7.0-3.0*x+1.0/6.5*x^13.0-1.0/16.0*x^64.0-1.0/4.5*x^9.0-2.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-44.0*x^10.0+28.88888888888889*x^64.0-18.0*x^5.0+24.0*x^11.0-252.0*x^62.0-16.0*x^7.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-44.0*10.0*x^9.0+28.88888888888889*64.0*x^63.0-18.0*5.0*x^4.0+24.0*11.0*x^10.0-252.0*62.0*x^61.0-16.0*7.0*x^6.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-440.0*x^9.0+1848.888888888889*x^63.0-90.0*x^4.0+264.0*x^10.0-15624.0*x^61.0-112.0*x^6.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/3.0*x^12.0+1.0/148.5*x^66.0-1.0/2.3333333333333335*x^7.0-3.0*x+1.0/6.5*x^13.0-1.0/16.0*x^64.0-1.0/4.5*x^9.0-2.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/3.0/13.0*x^13.0+1.0/148.5/67.0*x^67.0-1.0/2.3333333333333335/8.0*x^8.0-3.0/2.0*x^2.0+1.0/6.5/14.0*x^14.0-1.0/16.0/65.0*x^65.0-1.0/4.5/10.0*x^10.0-x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/39.0*x^13.0+1.0/9949.5*x^67.0-1.0/18.666666666666668*x^8.0-1.5*x^2.0+1.0/91.0*x^14.0-1.0/1040.0*x^65.0-0.022222222222222223*x^10.0-x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-440.0*x^9.0+1848.888888888889*x^63.0-90.0*x^4.0+264.0*x^10.0-15624.0*x^61.0-112.0*x^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-440.0*9.0*x^8.0+1848.888888888889*63.0*x^62.0-90.0*4.0*x^3.0+264.0*10.0*x^9.0-15624.0*61.0*x^60.0-112.0*6.0*x^5.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-3960.0*x^8.0+116480.0*x^62.0-360.0*x^3.0+2640.0*x^9.0-953064.0*x^60.0-672.0*x^5.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/39.0*x^13.0+1.0/9949.5*x^67.0-1.0/18.666666666666668*x^8.0-1.5*x^2.0+1.0/91.0*x^14.0-1.0/1040.0*x^65.0-0.022222222222222223*x^10.0-x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/39.0/14.0*x^14.0+1.0/9949.5/68.0*x^68.0-1.0/18.666666666666668/9.0*x^9.0-1.5/3.0*x^3.0+1.0/91.0/15.0*x^15.0-1.0/1040.0/66.0*x^66.0-0.022222222222222223/11.0*x^11.0-1.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/546.0*x^14.0+1.0/676566.0*x^68.0-1.0/168.0*x^9.0-1.0/2.0*x^3.0+1.0/1365.0*x^15.0-1.0/68640.0*x^66.0-1.0/495.0*x^11.0-1.0/3.0*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-3960.0*x^8.0+116480.0*x^62.0-360.0*x^3.0+2640.0*x^9.0-953064.0*x^60.0-672.0*x^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-3960.0*8.0*x^7.0+116480.0*62.0*x^61.0-360.0*3.0*x^2.0+2640.0*9.0*x^8.0-953064.0*60.0*x^59.0-672.0*5.0*x^4.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-31680.0*x^7.0+7221760.0*x^61.0-1080.0*x^2.0+23760.0*x^8.0-5.718384E7*x^59.0-3360.0*x^4.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/546.0*x^14.0+1.0/676566.0*x^68.0-1.0/168.0*x^9.0-1.0/2.0*x^3.0+1.0/1365.0*x^15.0-1.0/68640.0*x^66.0-1.0/495.0*x^11.0-1.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/546.0/15.0*x^15.0+1.0/676566.0/69.0*x^69.0-1.0/168.0/10.0*x^10.0-1.0/2.0/4.0*x^4.0+1.0/1365.0/16.0*x^16.0-1.0/68640.0/67.0*x^67.0-1.0/495.0/12.0*x^12.0-1.0/3.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/8190.0*x^15.0+1.0/4.6683054E7*x^69.0-1.0/1680.0*x^10.0-1.0/8.0*x^4.0+1.0/21840.0*x^16.0-1.0/4598880.0*x^67.0-1.0/5940.0*x^12.0-1.0/12.0*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131396() {
 UsageCalculus.TestCase = 131396;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xy^2^9-3*xy^3^10*+4*xy^1*1*xy^2^2/-3*xy^3^34*x0*1*x0^2/-3*x0^31*xy^2^2/-3*xy^3^3-3*xy^3^3-2*x0^2*-3*x0^3/-4*x0^4*+-2*x0^53*xy^3^3/-4*xy^2^4*+-2*xy^3^54*xy^2^4*+-2*xy^3^5-2*x0^53*xy^2^6*-4*xy^3^7/--2*xy^2^8*+3*xy^3^9";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=395 EqnNumber=96 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[12, 96, 10, 5, 2, 1, 2, 3, 1, 1, 2, 1, 2, 3, 4, 3, 1, 1, 2, 3, 2, 1, 1, 2, 3, 4, 5, 3, 1, 3, 4, 30]"+
"// DOEMatrixRow=[5, 96, 17, 1, 2, 3, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 28, 7, 3, 1, 3, 1, 2, 3, 4, 2, 3, 1, 2, 1]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "xy^11.0+x0/2.25*xy^65.0-3.0*xy^6.0-x0^2.0*3.0+x0^53.0*2.0*xy^12.0-4.0*xy^63.0-2.0*xy^8.0+x0^53.0*12.0*xy^40.0-6.0*xy^22.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "11.0*xy^10.0+x0/2.25*65.0*xy^64.0-3.0*6.0*xy^5.0-x0^2.0*3.0*0.0+x0^53.0*2.0*12.0*xy^11.0-4.0*63.0*xy^62.0-2.0*8.0*xy^7.0+x0^53.0*12.0*40.0*xy^39.0-6.0*22.0*xy^21.0";
 UsageCalculus.EqnSolArrayMap2[1] = "11.0*xy^10.0+x0*28.88888888888889*xy^64.0-18.0*xy^5.0-x0^2.0*0.0+x0^53.0*24.0*xy^11.0-252.0*xy^62.0-16.0*xy^7.0+x0^53.0*480.0*xy^39.0-132.0*xy^21.0";
 UsageCalculus.EqnSolArrayMap3[1] = "xy^11.0+x0/2.25*xy^65.0-3.0*xy^6.0-x0^2.0*3.0+x0^53.0*2.0*xy^12.0-4.0*xy^63.0-2.0*xy^8.0+x0^53.0*12.0*xy^40.0-6.0*xy^22.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "1.0/12.0*xy^12.0+x0/2.25/66.0*xy^66.0-3.0/7.0*xy^7.0-x0^2.0*3.0*xy+x0^53.0*2.0/13.0*xy^13.0-4.0/64.0*xy^64.0-2.0/9.0*xy^9.0+x0^53.0*12.0/41.0*xy^41.0-6.0/23.0*xy^23.0";
 UsageCalculus.EqnSolArrayMap4[1] = "0.08333333333333333*xy^12.0+x0/148.5*xy^66.0-0.42857142857142855*xy^7.0-x0^2.0*3.0*xy+x0^53.0/6.5*xy^13.0-1.0/16.0*xy^64.0-0.2222222222222222*xy^9.0+x0^53.0/3.4166666666666665*xy^41.0-1.0/3.8333333333333335*xy^23.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "11.0*xy^10.0+x0*28.88888888888889*xy^64.0-18.0*xy^5.0-x0^2.0*0.0+x0^53.0*24.0*xy^11.0-252.0*xy^62.0-16.0*xy^7.0+x0^53.0*480.0*xy^39.0-132.0*xy^21.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "11.0*10.0*xy^9.0+x0*28.88888888888889*64.0*xy^63.0-18.0*5.0*xy^4.0-x0^2.0*0.0*0.0+x0^53.0*24.0*11.0*xy^10.0-252.0*62.0*xy^61.0-16.0*7.0*xy^6.0+x0^53.0*480.0*39.0*xy^38.0-132.0*21.0*xy^20.0";
 UsageCalculus.EqnSolArrayMap2[2] = "110.0*xy^9.0+x0*1848.888888888889*xy^63.0-90.0*xy^4.0-x0^2.0*0.0+x0^53.0*264.0*xy^10.0-15624.0*xy^61.0-112.0*xy^6.0+x0^53.0*18720.0*xy^38.0-2772.0*xy^20.0";
 UsageCalculus.EqnSolArrayMap3[2] = "0.08333333333333333*xy^12.0+x0/148.5*xy^66.0-0.42857142857142855*xy^7.0-x0^2.0*3.0*xy+x0^53.0/6.5*xy^13.0-1.0/16.0*xy^64.0-0.2222222222222222*xy^9.0+x0^53.0/3.4166666666666665*xy^41.0-1.0/3.8333333333333335*xy^23.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "0.08333333333333333/13.0*xy^13.0+x0/148.5/67.0*xy^67.0-0.42857142857142855/8.0*xy^8.0-x0^2.0*3.0/2.0*xy^2.0+x0^53.0/6.5/14.0*xy^14.0-1.0/16.0/65.0*xy^65.0-0.2222222222222222/10.0*xy^10.0+x0^53.0/3.4166666666666665/42.0*xy^42.0-1.0/3.8333333333333335/24.0*xy^24.0";
 UsageCalculus.EqnSolArrayMap4[2] = "0.00641025641025641*xy^13.0+x0/9949.5*xy^67.0-0.05357142857142857*xy^8.0-x0^2.0*1.5*xy^2.0+x0^53.0/91.0*xy^14.0-1.0/1040.0*xy^65.0-0.02222222222222222*xy^10.0+x0^53.0/143.5*xy^42.0-1.0/92.0*xy^24.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "110.0*xy^9.0+x0*1848.888888888889*xy^63.0-90.0*xy^4.0-x0^2.0*0.0+x0^53.0*264.0*xy^10.0-15624.0*xy^61.0-112.0*xy^6.0+x0^53.0*18720.0*xy^38.0-2772.0*xy^20.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "110.0*9.0*xy^8.0+x0*1848.888888888889*63.0*xy^62.0-90.0*4.0*xy^3.0-x0^2.0*0.0*0.0+x0^53.0*264.0*10.0*xy^9.0-15624.0*61.0*xy^60.0-112.0*6.0*xy^5.0+x0^53.0*18720.0*38.0*xy^37.0-2772.0*20.0*xy^19.0";
 UsageCalculus.EqnSolArrayMap2[3] = "990.0*xy^8.0+x0*116480.0*xy^62.0-360.0*xy^3.0-x0^2.0*0.0+x0^53.0*2640.0*xy^9.0-953064.0*xy^60.0-672.0*xy^5.0+x0^53.0*711360.0*xy^37.0-55440.0*xy^19.0";
 UsageCalculus.EqnSolArrayMap3[3] = "0.00641025641025641*xy^13.0+x0/9949.5*xy^67.0-0.05357142857142857*xy^8.0-x0^2.0*1.5*xy^2.0+x0^53.0/91.0*xy^14.0-1.0/1040.0*xy^65.0-0.02222222222222222*xy^10.0+x0^53.0/143.5*xy^42.0-1.0/92.0*xy^24.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "0.00641025641025641/14.0*xy^14.0+x0/9949.5/68.0*xy^68.0-0.05357142857142857/9.0*xy^9.0-x0^2.0*1.5/3.0*xy^3.0+x0^53.0/91.0/15.0*xy^15.0-1.0/1040.0/66.0*xy^66.0-0.02222222222222222/11.0*xy^11.0+x0^53.0/143.5/43.0*xy^43.0-1.0/92.0/25.0*xy^25.0";
 UsageCalculus.EqnSolArrayMap4[3] = "4.578754578754579E-4*xy^14.0+x0/676566.0*xy^68.0-0.005952380952380952*xy^9.0-x0^2.0*0.5*xy^3.0+x0^53.0/1365.0*xy^15.0-1.0/68640.0*xy^66.0-0.0020202020202020198*xy^11.0+x0^53.0/6170.5*xy^43.0-1.0/2300.0*xy^25.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "990.0*xy^8.0+x0*116480.0*xy^62.0-360.0*xy^3.0-x0^2.0*0.0+x0^53.0*2640.0*xy^9.0-953064.0*xy^60.0-672.0*xy^5.0+x0^53.0*711360.0*xy^37.0-55440.0*xy^19.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "990.0*8.0*xy^7.0+x0*116480.0*62.0*xy^61.0-360.0*3.0*xy^2.0-x0^2.0*0.0*0.0+x0^53.0*2640.0*9.0*xy^8.0-953064.0*60.0*xy^59.0-672.0*5.0*xy^4.0+x0^53.0*711360.0*37.0*xy^36.0-55440.0*19.0*xy^18.0";
 UsageCalculus.EqnSolArrayMap2[4] = "7920.0*xy^7.0+x0*7221760.0*xy^61.0-1080.0*xy^2.0-x0^2.0*0.0+x0^53.0*23760.0*xy^8.0-5.718384E7*xy^59.0-3360.0*xy^4.0+x0^53.0*2.632032E7*xy^36.0-1053360.0*xy^18.0";
 UsageCalculus.EqnSolArrayMap3[4] = "4.578754578754579E-4*xy^14.0-4.0*xy^14.0+x0/676566.0*xy^68.0-0.005952380952380952*xy^9.0-x0^2.0*0.5*xy^3.0+x0^53.0/1365.0*xy^15.0-1.0/68640.0*xy^66.0-0.0020202020202020198*xy^11.0+x0^53.0/6170.5*xy^43.0-1.0/2300.0*xy^25.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "4.578754578754579E-4/15.0*xy^15.0-4.0/15.0*xy^15.0+x0/676566.0/69.0*xy^69.0-0.005952380952380952/10.0*xy^10.0-x0^2.0*0.5/4.0*xy^4.0+x0^53.0/1365.0/16.0*xy^16.0-1.0/68640.0/67.0*xy^67.0-0.0020202020202020198/12.0*xy^12.0+x0^53.0/6170.5/44.0*xy^44.0-1.0/2300.0/26.0*xy^26.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/32760.0*xy^15.0-1.0/3.75*xy^15.0-0.26666666666666666*xy^15.0+x0/4.6683054E7*xy^69.0-5.952380952380952E-4*xy^10.0-x0^2.0*0.125*xy^4.0+x0^53.0/21840.0*xy^16.0-1.0/4598880.0*xy^67.0-1.683501683501683E-4*xy^12.0+x0^53.0/271502.0*xy^44.0-1.0/59800.0*xy^26.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131397() {
 UsageCalculus.TestCase = 131397;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xyz^3^10*+4*xyz^1*1*xyz^2^2/-3*xyz^3^34*x0*1*x0^2/-3*x0^31*xyz^2^2/-3*xyz^3^3-3*xyz^3^3-2*x0^2*-3*x0^3/-4*x0^4*+-2*x0^53*xyz^3^3/-4*xyz^2^4*+-2*xyz^3^54*xyz^2^4*+-2*xyz^3^5-2*x0^53*xyz^2^6*-4*xyz^3^7/--2*xyz^2^8*+3*xyz^3^94*xyz^3^7/--2*xyz^2^8*+3*xyz^3^9";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=396 EqnNumber=97 FamilyID=1 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[12, 97, 10, 4, 3, 2, 3, 4, 2, 3, 4, 2, 3, 1, 1, 1, 2, 1, 3, 1, 3, 2, 3, 1, 1, 1, 6, 1, 2, 4, 1, 31]"+
"// DOEMatrixRow=[5, 97, 17, 4, 2, 1, 2, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 29, 8, 1, 2, 4, 2, 3, 4, 1, 3, 1, 2, 3, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0/2.25*xyz^65.0-3.0*xyz^6.0-x0^2.0*3.0+x0^53.0*2.0*xyz^12.0-4.0*xyz^63.0-2.0*xyz^8.0+x0^53.0*18.0*xyz^157.0-9.0*xyz^139.0-6.0*xyz^22.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0/2.25*65.0*xyz^64.0-3.0*6.0*xyz^5.0-x0^2.0*3.0*0.0+x0^53.0*2.0*12.0*xyz^11.0-4.0*63.0*xyz^62.0-2.0*8.0*xyz^7.0+x0^53.0*18.0*157.0*xyz^156.0-9.0*139.0*xyz^138.0-6.0*22.0*xyz^21.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0*28.88888888888889*xyz^64.0-18.0*xyz^5.0-x0^2.0*0.0+x0^53.0*24.0*xyz^11.0-252.0*xyz^62.0-16.0*xyz^7.0+x0^53.0*2826.0*xyz^156.0-1251.0*xyz^138.0-132.0*xyz^21.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0/2.25*xyz^65.0-3.0*xyz^6.0-x0^2.0*3.0+x0^53.0*2.0*xyz^12.0-4.0*xyz^63.0-2.0*xyz^8.0+x0^53.0*18.0*xyz^157.0-9.0*xyz^139.0-6.0*xyz^22.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0/2.25/66.0*xyz^66.0-3.0/7.0*xyz^7.0-x0^2.0*3.0*xyz+x0^53.0*2.0/13.0*xyz^13.0-4.0/64.0*xyz^64.0-2.0/9.0*xyz^9.0+x0^53.0*18.0/158.0*xyz^158.0-9.0/140.0*xyz^140.0-6.0/23.0*xyz^23.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0/148.5*xyz^66.0-0.42857142857142855*xyz^7.0-x0^2.0*3.0*xyz+x0^53.0/6.5*xyz^13.0-1.0/16.0*xyz^64.0-0.2222222222222222*xyz^9.0+x0^53.0/8.777777777777779*xyz^158.0-1.0/15.555555555555555*xyz^140.0-1.0/3.8333333333333335*xyz^23.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0*28.88888888888889*xyz^64.0-18.0*xyz^5.0-x0^2.0*0.0+x0^53.0*24.0*xyz^11.0-252.0*xyz^62.0-16.0*xyz^7.0+x0^53.0*2826.0*xyz^156.0-1251.0*xyz^138.0-132.0*xyz^21.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0*28.88888888888889*64.0*xyz^63.0-18.0*5.0*xyz^4.0-x0^2.0*0.0*0.0+x0^53.0*24.0*11.0*xyz^10.0-252.0*62.0*xyz^61.0-16.0*7.0*xyz^6.0+x0^53.0*2826.0*156.0*xyz^155.0-1251.0*138.0*xyz^137.0-132.0*21.0*xyz^20.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0*1848.888888888889*xyz^63.0-90.0*xyz^4.0-x0^2.0*0.0+x0^53.0*264.0*xyz^10.0-15624.0*xyz^61.0-112.0*xyz^6.0+x0^53.0*440856.0*xyz^155.0-172638.0*xyz^137.0-2772.0*xyz^20.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0/148.5*xyz^66.0-0.42857142857142855*xyz^7.0-x0^2.0*3.0*xyz+x0^53.0/6.5*xyz^13.0-1.0/16.0*xyz^64.0-0.2222222222222222*xyz^9.0+x0^53.0/8.777777777777779*xyz^158.0-1.0/15.555555555555555*xyz^140.0-1.0/3.8333333333333335*xyz^23.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0/148.5/67.0*xyz^67.0-0.42857142857142855/8.0*xyz^8.0-x0^2.0*3.0/2.0*xyz^2.0+x0^53.0/6.5/14.0*xyz^14.0-1.0/16.0/65.0*xyz^65.0-0.2222222222222222/10.0*xyz^10.0+x0^53.0/8.777777777777779/159.0*xyz^159.0-1.0/15.555555555555555/141.0*xyz^141.0-1.0/3.8333333333333335/24.0*xyz^24.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0/9949.5*xyz^67.0-0.05357142857142857*xyz^8.0-x0^2.0*1.5*xyz^2.0+x0^53.0/91.0*xyz^14.0-1.0/1040.0*xyz^65.0-0.02222222222222222*xyz^10.0+x0^53.0/1395.6666666666667*xyz^159.0-1.0/2193.3333333333335*xyz^141.0-1.0/92.0*xyz^24.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0*1848.888888888889*xyz^63.0-90.0*xyz^4.0-x0^2.0*0.0+x0^53.0*264.0*xyz^10.0-15624.0*xyz^61.0-112.0*xyz^6.0+x0^53.0*440856.0*xyz^155.0-172638.0*xyz^137.0-2772.0*xyz^20.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0*1848.888888888889*63.0*xyz^62.0-90.0*4.0*xyz^3.0-x0^2.0*0.0*0.0+x0^53.0*264.0*10.0*xyz^9.0-15624.0*61.0*xyz^60.0-112.0*6.0*xyz^5.0+x0^53.0*440856.0*155.0*xyz^154.0-172638.0*137.0*xyz^136.0-2772.0*20.0*xyz^19.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0*116480.0*xyz^62.0-360.0*xyz^3.0-x0^2.0*0.0+x0^53.0*2640.0*xyz^9.0-953064.0*xyz^60.0-672.0*xyz^5.0+x0^53.0*6.833268E7*xyz^154.0-2.3651406E7*xyz^136.0-55440.0*xyz^19.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0/9949.5*xyz^67.0-0.05357142857142857*xyz^8.0-x0^2.0*1.5*xyz^2.0+x0^53.0/91.0*xyz^14.0-1.0/1040.0*xyz^65.0-0.02222222222222222*xyz^10.0+x0^53.0/1395.6666666666667*xyz^159.0-1.0/2193.3333333333335*xyz^141.0-1.0/92.0*xyz^24.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0/9949.5/68.0*xyz^68.0-0.05357142857142857/9.0*xyz^9.0-x0^2.0*1.5/3.0*xyz^3.0+x0^53.0/91.0/15.0*xyz^15.0-1.0/1040.0/66.0*xyz^66.0-0.02222222222222222/11.0*xyz^11.0+x0^53.0/1395.6666666666667/160.0*xyz^160.0-1.0/2193.3333333333335/142.0*xyz^142.0-1.0/92.0/25.0*xyz^25.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0/676566.0*xyz^68.0-0.005952380952380952*xyz^9.0-x0^2.0*0.5*xyz^3.0+x0^53.0/1365.0*xyz^15.0-1.0/68640.0*xyz^66.0-0.0020202020202020198*xyz^11.0+x0^53.0/223306.6666666667*xyz^160.0-1.0/311453.3333333334*xyz^142.0-1.0/2300.0*xyz^25.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0*116480.0*xyz^62.0-360.0*xyz^3.0-x0^2.0*0.0+x0^53.0*2640.0*xyz^9.0-953064.0*xyz^60.0-672.0*xyz^5.0+x0^53.0*6.833268E7*xyz^154.0-2.3651406E7*xyz^136.0-55440.0*xyz^19.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0*116480.0*62.0*xyz^61.0-360.0*3.0*xyz^2.0-x0^2.0*0.0*0.0+x0^53.0*2640.0*9.0*xyz^8.0-953064.0*60.0*xyz^59.0-672.0*5.0*xyz^4.0+x0^53.0*6.833268E7*154.0*xyz^153.0-136.0*xyz^135.0-55440.0*19.0*xyz^18.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0*7221760.0*xyz^61.0-1080.0*xyz^2.0-x0^2.0*0.0+x0^53.0*23760.0*xyz^8.0-5.718384E7*xyz^59.0-3360.0*xyz^4.0+x0^53.0*1.052323272E10*xyz^153.0-136.0*xyz^135.0-1053360.0*xyz^18.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0/676566.0*xyz^68.0-0.005952380952380952*xyz^9.0-x0^2.0*0.5*xyz^3.0+x0^53.0/1365.0*xyz^15.0-1.0/68640.0*xyz^66.0-0.0020202020202020198*xyz^11.0+x0^53.0/223306.6666666667*xyz^160.0-1.0/311453.3333333334*xyz^142.0-1.0/2300.0*xyz^25.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0/676566.0/69.0*xyz^69.0-0.005952380952380952/10.0*xyz^10.0-x0^2.0*0.5/4.0*xyz^4.0+x0^53.0/1365.0/16.0*xyz^16.0-1.0/68640.0/67.0*xyz^67.0-0.0020202020202020198/12.0*xyz^12.0+x0^53.0/223306.6666666667/161.0*xyz^161.0-1.0/311453.3333333334/143.0*xyz^143.0-1.0/2300.0/26.0*xyz^26.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0/4.6683054E7*xyz^69.0-5.952380952380952E-4*xyz^10.0-x0^2.0*0.125*xyz^4.0+x0^53.0/21840.0*xyz^16.0-1.0/4598880.0*xyz^67.0-1.683501683501683E-4*xyz^12.0+x0^53.0/3.5952373333333336E7*xyz^161.0-1.0/4.453782666666667E7*xyz^143.0-1.0/59800.0*xyz^26.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131398() {
 UsageCalculus.TestCase = 131398;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "4*x0*1*x0^2/-3*x0^31*xyza^2^2/-3*xyza^3^3-3*xyza^3^3-2*x0^2*-3*x0^3/-4*x0^4*+-2*x0^53*xyza^3^3/-4*xyza^2^4*+-2*xyza^3^54*xyza^2^4*+-2*xyza^3^5-2*x0^53*xyza^2^6*-4*xyza^3^7/--2*xyza^2^8*+3*xyza^3^94*xyza^3^7/--2*xyza^2^8*+3*xyza^3^9-2*x0^8*+3*x0^9";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=397 EqnNumber=98 FamilyID=3 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[12, 98, 10, 3, 4, 3, 1, 5, 3, 4, 1, 1, 1, 2, 3, 2, 3, 2, 4, 2, 4, 3, 1, 2, 3, 2, 7, 2, 3, 5, 2, 32]"+
"// DOEMatrixRow=[5, 98, 17, 3, 1, 2, 3, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 30, 9, 2, 3, 5, 3, 1, 5, 2, 1, 2, 3, 4, 1]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0/2.25*xyza^10.0-3.0*xyza^6.0-x0^2.0*3.0+x0^53.0*2.0*xyza^12.0-4.0*xyza^63.0-2.0*xyza^8.0+x0^53.0*18.0*xyza^157.0-9.0*xyza^139.0-6.0*xyza^22.0-x0^8.0*6.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0/2.25*10.0*xyza^9.0-3.0*6.0*xyza^5.0-x0^2.0*3.0*0.0+x0^53.0*2.0*12.0*xyza^11.0-4.0*63.0*xyza^62.0-2.0*8.0*xyza^7.0+x0^53.0*18.0*157.0*xyza^156.0-9.0*139.0*xyza^138.0-6.0*22.0*xyza^21.0-x0^8.0*6.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0*4.444444444444445*xyza^9.0-18.0*xyza^5.0-x0^2.0*0.0+x0^53.0*24.0*xyza^11.0-252.0*xyza^62.0-16.0*xyza^7.0+x0^53.0*2826.0*xyza^156.0-1251.0*xyza^138.0-132.0*xyza^21.0-x0^8.0*0.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0/2.25*xyza^10.0-3.0*xyza^6.0-x0^2.0*3.0+x0^53.0*2.0*xyza^12.0-4.0*xyza^63.0-2.0*xyza^8.0+x0^53.0*18.0*xyza^157.0-9.0*xyza^139.0-6.0*xyza^22.0-x0^8.0*6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0/2.25/11.0*xyza^11.0-3.0/7.0*xyza^7.0-x0^2.0*3.0*xyza+x0^53.0*2.0/13.0*xyza^13.0-4.0/64.0*xyza^64.0-2.0/9.0*xyza^9.0+x0^53.0*18.0/158.0*xyza^158.0-9.0/140.0*xyza^140.0-6.0/23.0*xyza^23.0-x0^8.0*6.0*xyza";
 UsageCalculus.EqnSolArrayMap4[1] = "x0/24.75*xyza^11.0-0.42857142857142855*xyza^7.0-x0^2.0*3.0*xyza+x0^53.0/6.5*xyza^13.0-1.0/16.0*xyza^64.0-0.2222222222222222*xyza^9.0+x0^53.0/8.777777777777779*xyza^158.0-1.0/15.555555555555555*xyza^140.0-0.2608695652173913*xyza^23.0-x0^8.0*6.0*xyza";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0*4.444444444444445*xyza^9.0-18.0*xyza^5.0-x0^2.0*0.0+x0^53.0*24.0*xyza^11.0-252.0*xyza^62.0-16.0*xyza^7.0+x0^53.0*2826.0*xyza^156.0-1251.0*xyza^138.0-132.0*xyza^21.0-x0^8.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0*4.444444444444445*9.0*xyza^8.0-18.0*5.0*xyza^4.0-x0^2.0*0.0*0.0+x0^53.0*24.0*11.0*xyza^10.0-252.0*62.0*xyza^61.0-16.0*7.0*xyza^6.0+x0^53.0*2826.0*156.0*xyza^155.0-1251.0*138.0*xyza^137.0-132.0*21.0*xyza^20.0-x0^8.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0*40.0*xyza^8.0-90.0*xyza^4.0-x0^2.0*0.0+x0^53.0*264.0*xyza^10.0-15624.0*xyza^61.0-112.0*xyza^6.0+x0^53.0*440856.0*xyza^155.0-172638.0*xyza^137.0-2772.0*xyza^20.0-x0^8.0*0.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0/24.75*xyza^11.0-0.42857142857142855*xyza^7.0-x0^2.0*3.0*xyza+x0^53.0/6.5*xyza^13.0-1.0/16.0*xyza^64.0-0.2222222222222222*xyza^9.0+x0^53.0/8.777777777777779*xyza^158.0-1.0/15.555555555555555*xyza^140.0-0.2608695652173913*xyza^23.0-x0^8.0*6.0*xyza";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0/24.75/12.0*xyza^12.0-0.42857142857142855/8.0*xyza^8.0-x0^2.0*3.0/2.0*xyza^2.0+x0^53.0/6.5/14.0*xyza^14.0-1.0/16.0/65.0*xyza^65.0-0.2222222222222222/10.0*xyza^10.0+x0^53.0/8.777777777777779/159.0*xyza^159.0-1.0/15.555555555555555/141.0*xyza^141.0-0.2608695652173913/24.0*xyza^24.0-x0^8.0*6.0/2.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0/297.0*xyza^12.0-0.05357142857142857*xyza^8.0-x0^2.0*1.5*xyza^2.0+x0^53.0/91.0*xyza^14.0-1.0/1040.0*xyza^65.0-0.02222222222222222*xyza^10.0+x0^53.0/1395.6666666666667*xyza^159.0-1.0/2193.3333333333335*xyza^141.0-0.010869565217391304*xyza^24.0-x0^8.0*3.0*xyza^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0*40.0*xyza^8.0-90.0*xyza^4.0-x0^2.0*0.0+x0^53.0*264.0*xyza^10.0-15624.0*xyza^61.0-112.0*xyza^6.0+x0^53.0*440856.0*xyza^155.0-172638.0*xyza^137.0-2772.0*xyza^20.0-x0^8.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0*40.0*8.0*xyza^7.0-90.0*4.0*xyza^3.0-x0^2.0*0.0*0.0+x0^53.0*264.0*10.0*xyza^9.0-15624.0*61.0*xyza^60.0-112.0*6.0*xyza^5.0+x0^53.0*440856.0*155.0*xyza^154.0-172638.0*137.0*xyza^136.0-2772.0*20.0*xyza^19.0-x0^8.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0*320.0*xyza^7.0-360.0*xyza^3.0-x0^2.0*0.0+x0^53.0*2640.0*xyza^9.0-953064.0*xyza^60.0-672.0*xyza^5.0+x0^53.0*6.833268E7*xyza^154.0-2.3651406E7*xyza^136.0-55440.0*xyza^19.0-x0^8.0*0.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0/297.0*xyza^12.0-0.05357142857142857*xyza^8.0-x0^2.0*1.5*xyza^2.0+x0^53.0/91.0*xyza^14.0-1.0/1040.0*xyza^65.0-0.02222222222222222*xyza^10.0+x0^53.0/1395.6666666666667*xyza^159.0-1.0/2193.3333333333335*xyza^141.0-0.010869565217391304*xyza^24.0-x0^8.0*3.0*xyza^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0/297.0/13.0*xyza^13.0-0.05357142857142857/9.0*xyza^9.0-x0^2.0*1.5/3.0*xyza^3.0+x0^53.0/91.0/15.0*xyza^15.0-1.0/1040.0/66.0*xyza^66.0-0.02222222222222222/11.0*xyza^11.0+x0^53.0/1395.6666666666667/160.0*xyza^160.0-1.0/2193.3333333333335/142.0*xyza^142.0-0.010869565217391304/25.0*xyza^25.0-x0^8.0*3.0/3.0*xyza^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0/3861.0*xyza^13.0-0.005952380952380952*xyza^9.0-x0^2.0*0.5*xyza^3.0+x0^53.0/1365.0*xyza^15.0-1.0/68640.0*xyza^66.0-0.0020202020202020198*xyza^11.0+x0^53.0/223306.6666666667*xyza^160.0-1.0/311453.3333333334*xyza^142.0-4.3478260869565214E-4*xyza^25.0-x0^8.0*xyza^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0*320.0*xyza^7.0-360.0*xyza^3.0-x0^2.0*0.0+x0^53.0*2640.0*xyza^9.0-953064.0*xyza^60.0-672.0*xyza^5.0+x0^53.0*6.833268E7*xyza^154.0-2.3651406E7*xyza^136.0-55440.0*xyza^19.0-x0^8.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0*320.0*7.0*xyza^6.0-360.0*3.0*xyza^2.0-x0^2.0*0.0*0.0+x0^53.0*2640.0*9.0*xyza^8.0-953064.0*60.0*xyza^59.0-672.0*5.0*xyza^4.0+x0^53.0*6.833268E7*154.0*xyza^153.0-136.0*xyza^135.0-55440.0*19.0*xyza^18.0-x0^8.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0*2240.0*xyza^6.0-1080.0*xyza^2.0-x0^2.0*0.0+x0^53.0*23760.0*xyza^8.0-5.718384E7*xyza^59.0-3360.0*xyza^4.0+x0^53.0*1.052323272E10*xyza^153.0-136.0*xyza^135.0-1053360.0*xyza^18.0-x0^8.0*0.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0/3861.0*xyza^13.0-0.005952380952380952*xyza^9.0-x0^2.0*0.5*xyza^3.0+x0^53.0/1365.0*xyza^15.0-1.0/68640.0*xyza^66.0-0.0020202020202020198*xyza^11.0+x0^53.0/223306.6666666667*xyza^160.0-1.0/311453.3333333334*xyza^142.0-4.3478260869565214E-4*xyza^25.0-4.0*xyza^25.0-x0^8.0*xyza^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0/3861.0/14.0*xyza^14.0-0.005952380952380952/10.0*xyza^10.0-x0^2.0*0.5/4.0*xyza^4.0+x0^53.0/1365.0/16.0*xyza^16.0-1.0/68640.0/67.0*xyza^67.0-0.0020202020202020198/12.0*xyza^12.0+x0^53.0/223306.6666666667/161.0*xyza^161.0-1.0/311453.3333333334/143.0*xyza^143.0-4.3478260869565214E-4/26.0*xyza^26.0-4.0/26.0*xyza^26.0-x0^8.0/4.0*xyza^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0/54054.0*xyza^14.0-5.952380952380952E-4*xyza^10.0-x0^2.0*0.125*xyza^4.0+x0^53.0/21840.0*xyza^16.0-1.0/4598880.0*xyza^67.0-1.683501683501683E-4*xyza^12.0+x0^53.0/3.5952373333333336E7*xyza^161.0-1.0/4.453782666666667E7*xyza^143.0-1.0/59800.00000000001*xyza^26.0-1.0/6.5*xyza^26.0-0.15384615384615385*xyza^26.0-x0^8.0/4.0*xyza^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131399() {
 UsageCalculus.TestCase = 131399;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x^2^2/-3*x^3^3-3*x^3^3-2*x0^2*-3*x0^3/-4*x0^4*+-2*x0^53*x^3^3/-4*x^2^4*+-2*x^3^54*x^2^4*+-2*x^3^5-2*x0^53*x^2^6*-4*x^3^7/--2*x^2^8*+3*x^3^94*x^3^7/--2*x^2^8*+3*x^3^9-2*x0^8*+3*x0^93*x^3^9";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=398 EqnNumber=99 FamilyID=1 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[12, 99, 10, 2, 1, 1, 2, 6, 1, 1, 2, 1, 2, 3, 4, 3, 1, 1, 5, 3, 1, 4, 2, 3, 1, 3, 8, 3, 4, 6, 3, 1]"+
"// DOEMatrixRow=[5, 99, 17, 2, 3, 1, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 31, 10, 3, 1, 1, 1, 2, 6, 3, 2, 3, 4, 5, 2]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-1.0/3.0*x^10.0-3.0*x^6.0-3.0+2.0*x^12.0-4.0*x^63.0-2.0*x^8.0+18.0*x^157.0-9.0*x^139.0-6.0*x^22.0-6.0*x^12.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-1.0/3.0*10.0*x^9.0-3.0*6.0*x^5.0-3.0*0.0+2.0*12.0*x^11.0-4.0*63.0*x^62.0-2.0*8.0*x^7.0+18.0*157.0*x^156.0-9.0*139.0*x^138.0-6.0*22.0*x^21.0-6.0*12.0*x^11.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-3.3333333333333335*x^9.0-18.0*x^5.0+24.0*x^11.0-252.0*x^62.0-16.0*x^7.0+2826.0*x^156.0-1251.0*x^138.0-132.0*x^21.0-72.0*x^11.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-1.0/3.0*x^10.0-3.0*x^6.0-3.0+2.0*x^12.0-4.0*x^63.0-2.0*x^8.0+18.0*x^157.0-9.0*x^139.0-6.0*x^22.0-6.0*x^12.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.0/3.0/11.0*x^11.0-3.0/7.0*x^7.0-3.0*x+2.0/13.0*x^13.0-4.0/64.0*x^64.0-2.0/9.0*x^9.0+18.0/158.0*x^158.0-9.0/140.0*x^140.0-6.0/23.0*x^23.0-6.0/13.0*x^13.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/33.0*x^11.0-1.0/2.3333333333333335*x^7.0-3.0*x+1.0/6.5*x^13.0-1.0/16.0*x^64.0-1.0/4.5*x^9.0+1.0/8.777777777777779*x^158.0-1.0/15.555555555555555*x^140.0-1.0/3.8333333333333335*x^23.0-1.0/2.1666666666666665*x^13.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-3.3333333333333335*x^9.0-18.0*x^5.0+24.0*x^11.0-252.0*x^62.0-16.0*x^7.0+2826.0*x^156.0-1251.0*x^138.0-132.0*x^21.0-72.0*x^11.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-3.3333333333333335*9.0*x^8.0-18.0*5.0*x^4.0+24.0*11.0*x^10.0-252.0*62.0*x^61.0-16.0*7.0*x^6.0+2826.0*156.0*x^155.0-1251.0*138.0*x^137.0-132.0*21.0*x^20.0-72.0*11.0*x^10.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-30.0*x^8.0-90.0*x^4.0+264.0*x^10.0-15624.0*x^61.0-112.0*x^6.0+440856.0*x^155.0-172638.0*x^137.0-2772.0*x^20.0-792.0*x^10.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/33.0*x^11.0-1.0/2.3333333333333335*x^7.0-3.0*x+1.0/6.5*x^13.0-1.0/16.0*x^64.0-1.0/4.5*x^9.0+1.0/8.777777777777779*x^158.0-1.0/15.555555555555555*x^140.0-1.0/3.8333333333333335*x^23.0-1.0/2.1666666666666665*x^13.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/33.0/12.0*x^12.0-1.0/2.3333333333333335/8.0*x^8.0-3.0/2.0*x^2.0+1.0/6.5/14.0*x^14.0-1.0/16.0/65.0*x^65.0-1.0/4.5/10.0*x^10.0+1.0/8.777777777777779/159.0*x^159.0-1.0/15.555555555555555/141.0*x^141.0-1.0/3.8333333333333335/24.0*x^24.0-1.0/2.1666666666666665/14.0*x^14.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/396.0*x^12.0-1.0/18.666666666666668*x^8.0-1.5*x^2.0+1.0/91.0*x^14.0-1.0/1040.0*x^65.0-1.0/45.0*x^10.0+1.0/1395.6666666666667*x^159.0-1.0/2193.3333333333335*x^141.0-1.0/92.0*x^24.0-1.0/30.333333333333332*x^14.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-30.0*x^8.0-90.0*x^4.0+264.0*x^10.0-15624.0*x^61.0-112.0*x^6.0+440856.0*x^155.0-172638.0*x^137.0-2772.0*x^20.0-792.0*x^10.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-30.0*8.0*x^7.0-90.0*4.0*x^3.0+264.0*10.0*x^9.0-15624.0*61.0*x^60.0-112.0*6.0*x^5.0+440856.0*155.0*x^154.0-172638.0*137.0*x^136.0-2772.0*20.0*x^19.0-792.0*10.0*x^9.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-240.0*x^7.0-360.0*x^3.0+2640.0*x^9.0-953064.0*x^60.0-672.0*x^5.0+6.833268E7*x^154.0-2.3651406E7*x^136.0-55440.0*x^19.0-7920.0*x^9.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/396.0*x^12.0-1.0/18.666666666666668*x^8.0-1.5*x^2.0+1.0/91.0*x^14.0-1.0/1040.0*x^65.0-1.0/45.0*x^10.0+1.0/1395.6666666666667*x^159.0-1.0/2193.3333333333335*x^141.0-1.0/92.0*x^24.0-1.0/30.333333333333332*x^14.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/396.0/13.0*x^13.0-1.0/18.666666666666668/9.0*x^9.0-1.5/3.0*x^3.0+1.0/91.0/15.0*x^15.0-1.0/1040.0/66.0*x^66.0-1.0/45.0/11.0*x^11.0+1.0/1395.6666666666667/160.0*x^160.0-1.0/2193.3333333333335/142.0*x^142.0-1.0/92.0/25.0*x^25.0-1.0/30.333333333333332/15.0*x^15.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/5148.0*x^13.0-1.0/168.0*x^9.0-1.0/2.0*x^3.0+1.0/1365.0*x^15.0-1.0/68640.0*x^66.0-1.0/495.0*x^11.0+1.0/223306.6666666667*x^160.0-1.0/311453.3333333334*x^142.0-1.0/2300.0*x^25.0-1.0/455.0*x^15.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-240.0*x^7.0-360.0*x^3.0+2640.0*x^9.0-953064.0*x^60.0-672.0*x^5.0+6.833268E7*x^154.0-2.3651406E7*x^136.0-55440.0*x^19.0-7920.0*x^9.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-240.0*7.0*x^6.0-360.0*3.0*x^2.0+2640.0*9.0*x^8.0-953064.0*60.0*x^59.0-672.0*5.0*x^4.0+154.0*x^153.0-136.0*x^135.0-55440.0*19.0*x^18.0-7920.0*9.0*x^8.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1680.0*x^6.0-1080.0*x^2.0+23760.0*x^8.0-5.718384E7*x^59.0-3360.0*x^4.0+154.0*x^153.0-136.0*x^135.0-1053360.0*x^18.0-71280.0*x^8.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/5148.0*x^13.0-1.0/168.0*x^9.0-1.0/2.0*x^3.0+1.0/1365.0*x^15.0-1.0/68640.0*x^66.0-1.0/495.0*x^11.0+1.0/223306.6666666667*x^160.0-1.0/311453.3333333334*x^142.0-1.0/2300.0*x^25.0-1.0/455.0*x^15.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/5148.0/14.0*x^14.0-1.0/168.0/10.0*x^10.0-1.0/2.0/4.0*x^4.0+1.0/1365.0/16.0*x^16.0-1.0/68640.0/67.0*x^67.0-1.0/495.0/12.0*x^12.0+1.0/223306.6666666667/161.0*x^161.0-1.0/311453.3333333334/143.0*x^143.0-1.0/2300.0/26.0*x^26.0-1.0/455.0/16.0*x^16.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/72072.0*x^14.0-1.0/1680.0*x^10.0-1.0/8.0*x^4.0+1.0/21840.0*x^16.0-1.0/4598880.0*x^67.0-1.0/5940.0*x^12.0+1.0/3.5952373333333336E7*x^161.0-1.0/4.453782666666667E7*x^143.0-1.0/59800.0*x^26.0-1.0/7280.0*x^16.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff131400() {
 UsageCalculus.TestCase = 131400;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xy^3^3-2*x0^2*-3*x0^3/-4*x0^4*+-2*x0^53*xy^3^3/-4*xy^2^4*+-2*xy^3^54*xy^2^4*+-2*xy^3^5-2*x0^53*xy^2^6*-4*xy^3^7/--2*xy^2^8*+3*xy^3^94*xy^3^7/--2*xy^2^8*+3*xy^3^9-2*x0^8*+3*x0^93*xy^3^9";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=399 EqnNumber=100 FamilyID=2 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[12, 100, 9, 1, 2, 3, 1, 7, 2, 3, 4, 2, 3, 1, 1, 1, 2, 1, 1, 1, 2, 5, 3, 1, 2, 4, 9, 1, 1, 7, 4, 2]"+
"// DOEMatrixRow=[5, 100, 16, 1, 2, 3, 2, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 32, 1, 1, 2, 3, 2, 3, 1, 4, 3, 1, 1, 6, 1]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-3.0*xy^6.0-x0^2.0*3.0+x0^53.0*2.0*xy^12.0-4.0*xy^63.0-2.0*xy^8.0+x0^53.0*18.0*xy^157.0-9.0*xy^139.0-6.0*xy^22.0-x0^8.0*6.0*xy^12.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-3.0*6.0*xy^5.0-x0^2.0*3.0*0.0+x0^53.0*2.0*12.0*xy^11.0-4.0*63.0*xy^62.0-2.0*8.0*xy^7.0+x0^53.0*18.0*157.0*xy^156.0-9.0*139.0*xy^138.0-6.0*22.0*xy^21.0-x0^8.0*6.0*12.0*xy^11.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-18.0*xy^5.0-x0^2.0*0.0+x0^53.0*24.0*xy^11.0-252.0*xy^62.0-16.0*xy^7.0+x0^53.0*2826.0*xy^156.0-1251.0*xy^138.0-132.0*xy^21.0-x0^8.0*72.0*xy^11.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-3.0*xy^6.0-x0^2.0*3.0+x0^53.0*2.0*xy^12.0-4.0*xy^63.0-2.0*xy^8.0+x0^53.0*18.0*xy^157.0-9.0*xy^139.0-6.0*xy^22.0-x0^8.0*6.0*xy^12.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-3.0/7.0*xy^7.0-x0^2.0*3.0*xy+x0^53.0*2.0/13.0*xy^13.0-4.0/64.0*xy^64.0-2.0/9.0*xy^9.0+x0^53.0*18.0/158.0*xy^158.0-9.0/140.0*xy^140.0-6.0/23.0*xy^23.0-x0^8.0*6.0/13.0*xy^13.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-0.42857142857142855*xy^7.0-x0^2.0*3.0*xy+x0^53.0/6.5*xy^13.0-1.0/16.0*xy^64.0-0.2222222222222222*xy^9.0+x0^53.0/8.777777777777779*xy^158.0-1.0/15.555555555555555*xy^140.0-0.2608695652173913*xy^23.0-x0^8.0/2.1666666666666665*xy^13.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-18.0*xy^5.0-x0^2.0*0.0+x0^53.0*24.0*xy^11.0-252.0*xy^62.0-16.0*xy^7.0+x0^53.0*2826.0*xy^156.0-1251.0*xy^138.0-132.0*xy^21.0-x0^8.0*72.0*xy^11.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-18.0*5.0*xy^4.0-x0^2.0*0.0*0.0+x0^53.0*24.0*11.0*xy^10.0-252.0*62.0*xy^61.0-16.0*7.0*xy^6.0+x0^53.0*2826.0*156.0*xy^155.0-1251.0*138.0*xy^137.0-132.0*21.0*xy^20.0-x0^8.0*72.0*11.0*xy^10.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-90.0*xy^4.0-x0^2.0*0.0+x0^53.0*264.0*xy^10.0-15624.0*xy^61.0-112.0*xy^6.0+x0^53.0*440856.0*xy^155.0-172638.0*xy^137.0-2772.0*xy^20.0-x0^8.0*792.0*xy^10.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-0.42857142857142855*xy^7.0-x0^2.0*3.0*xy+x0^53.0/6.5*xy^13.0-1.0/16.0*xy^64.0-0.2222222222222222*xy^9.0+x0^53.0/8.777777777777779*xy^158.0-1.0/15.555555555555555*xy^140.0-0.2608695652173913*xy^23.0-x0^8.0/2.1666666666666665*xy^13.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-0.42857142857142855/8.0*xy^8.0-x0^2.0*3.0/2.0*xy^2.0+x0^53.0/6.5/14.0*xy^14.0-1.0/16.0/65.0*xy^65.0-0.2222222222222222/10.0*xy^10.0+x0^53.0/8.777777777777779/159.0*xy^159.0-1.0/15.555555555555555/141.0*xy^141.0-0.2608695652173913/24.0*xy^24.0-x0^8.0*2.1666666666666665/14.0*xy^14.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-0.05357142857142857*xy^8.0-x0^2.0*1.5*xy^2.0+x0^53.0/91.0*xy^14.0-1.0/1040.0*xy^65.0-0.02222222222222222*xy^10.0+x0^53.0/1395.6666666666667*xy^159.0-1.0/2193.3333333333335*xy^141.0-0.010869565217391304*xy^24.0-x0^8.0/6.461538461538462*xy^14.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-90.0*xy^4.0-x0^2.0*0.0+x0^53.0*264.0*xy^10.0-15624.0*xy^61.0-112.0*xy^6.0+x0^53.0*440856.0*xy^155.0-172638.0*xy^137.0-2772.0*xy^20.0-x0^8.0*792.0*xy^10.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-90.0*4.0*xy^3.0-x0^2.0*0.0*0.0+x0^53.0*264.0*10.0*xy^9.0-15624.0*61.0*xy^60.0-112.0*6.0*xy^5.0+x0^53.0*440856.0*155.0*xy^154.0-172638.0*137.0*xy^136.0-2772.0*20.0*xy^19.0-x0^8.0*792.0*10.0*xy^9.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-360.0*xy^3.0-x0^2.0*0.0+x0^53.0*2640.0*xy^9.0-953064.0*xy^60.0-672.0*xy^5.0+x0^53.0*6.833268E7*xy^154.0-2.3651406E7*xy^136.0-55440.0*xy^19.0-x0^8.0*7920.0*xy^9.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-0.05357142857142857*xy^8.0-x0^2.0*1.5*xy^2.0+x0^53.0/91.0*xy^14.0-1.0/1040.0*xy^65.0-0.02222222222222222*xy^10.0+x0^53.0/1395.6666666666667*xy^159.0-1.0/2193.3333333333335*xy^141.0-0.010869565217391304*xy^24.0-x0^8.0/6.461538461538462*xy^14.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-0.05357142857142857/9.0*xy^9.0-x0^2.0*1.5/3.0*xy^3.0+x0^53.0/91.0/15.0*xy^15.0-1.0/1040.0/66.0*xy^66.0-0.02222222222222222/11.0*xy^11.0+x0^53.0/1395.6666666666667/160.0*xy^160.0-1.0/2193.3333333333335/142.0*xy^142.0-0.010869565217391304/25.0*xy^25.0-x0^8.0*6.461538461538462/15.0*xy^15.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-0.005952380952380952*xy^9.0-x0^2.0*0.5*xy^3.0+x0^53.0/1365.0*xy^15.0-1.0/68640.0*xy^66.0-0.0020202020202020198*xy^11.0+x0^53.0/223306.6666666667*xy^160.0-1.0/311453.3333333334*xy^142.0-4.3478260869565214E-4*xy^25.0-x0^8.0/2.321428571428571*xy^15.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-360.0*xy^3.0-x0^2.0*0.0+x0^53.0*2640.0*xy^9.0-953064.0*xy^60.0-672.0*xy^5.0+x0^53.0*6.833268E7*xy^154.0-2.3651406E7*xy^136.0-55440.0*xy^19.0-x0^8.0*7920.0*xy^9.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-360.0*3.0*xy^2.0-x0^2.0*0.0*0.0+x0^53.0*2640.0*9.0*xy^8.0-953064.0*60.0*xy^59.0-672.0*5.0*xy^4.0+x0^53.0*6.833268E7*154.0*xy^153.0-136.0*xy^135.0-55440.0*19.0*xy^18.0-x0^8.0*7920.0*9.0*xy^8.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1080.0*xy^2.0-x0^2.0*0.0+x0^53.0*23760.0*xy^8.0-5.718384E7*xy^59.0-3360.0*xy^4.0+x0^53.0*1.052323272E10*xy^153.0-136.0*xy^135.0-1053360.0*xy^18.0-x0^8.0*71280.0*xy^8.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-0.005952380952380952*xy^9.0-x0^2.0*0.5*xy^3.0+x0^53.0/1365.0*xy^15.0-1.0/68640.0*xy^66.0-0.0020202020202020198*xy^11.0+x0^53.0/223306.6666666667*xy^160.0-1.0/311453.3333333334*xy^142.0-4.3478260869565214E-4*xy^25.0-4.0*xy^25.0-x0^8.0/2.321428571428571*xy^15.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-0.005952380952380952/10.0*xy^10.0-x0^2.0*0.5/4.0*xy^4.0+x0^53.0/1365.0/16.0*xy^16.0-1.0/68640.0/67.0*xy^67.0-0.0020202020202020198/12.0*xy^12.0+x0^53.0/223306.6666666667/161.0*xy^161.0-1.0/311453.3333333334/143.0*xy^143.0-4.3478260869565214E-4/26.0*xy^26.0-4.0/26.0*xy^26.0-x0^8.0*2.321428571428571/16.0*xy^16.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-5.952380952380952E-4*xy^10.0-x0^2.0*0.125*xy^4.0+x0^53.0/21840.0*xy^16.0-1.0/4598880.0*xy^67.0-1.683501683501683E-4*xy^12.0+x0^53.0/3.5952373333333336E7*xy^161.0-1.0/4.453782666666667E7*xy^143.0-1.0/59800.00000000001*xy^26.0-1.0/6.5*xy^26.0-0.15384615384615385*xy^26.0-x0^8.0/6.892307692307693*xy^16.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
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
