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

public class CoPilotEqnHadammard3 {
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
case 120301L:
 TestCaseDiff120301(); 
 break;
case 120302L:
 TestCaseDiff120302(); 
 break;
case 120303L:
 TestCaseDiff120303(); 
 break;
case 120304L:
 TestCaseDiff120304(); 
 break;
case 120305L:
 TestCaseDiff120305(); 
 break;
case 120306L:
 TestCaseDiff120306(); 
 break;
case 120307L:
 TestCaseDiff120307(); 
 break;
case 120308L:
 TestCaseDiff120308(); 
 break;
case 120309L:
 TestCaseDiff120309(); 
 break;
case 120310L:
 TestCaseDiff120310(); 
 break;
case 120311L:
 TestCaseDiff120311(); 
 break;
case 120312L:
 TestCaseDiff120312(); 
 break;
case 120313L:
 TestCaseDiff120313(); 
 break;
case 120314L:
 TestCaseDiff120314(); 
 break;
case 120315L:
 TestCaseDiff120315(); 
 break;
case 120316L:
 TestCaseDiff120316(); 
 break;
case 120317L:
 TestCaseDiff120317(); 
 break;
case 120318L:
 TestCaseDiff120318(); 
 break;
case 120319L:
 TestCaseDiff120319(); 
 break;
case 120320L:
 TestCaseDiff120320(); 
 break;
case 120321L:
 TestCaseDiff120321(); 
 break;
case 120322L:
 TestCaseDiff120322(); 
 break;
case 120323L:
 TestCaseDiff120323(); 
 break;
case 120324L:
 TestCaseDiff120324(); 
 break;
case 120325L:
 TestCaseDiff120325(); 
 break;
case 120326L:
 TestCaseDiff120326(); 
 break;
case 120327L:
 TestCaseDiff120327(); 
 break;
case 120328L:
 TestCaseDiff120328(); 
 break;
case 120329L:
 TestCaseDiff120329(); 
 break;
case 120330L:
 TestCaseDiff120330(); 
 break;
case 120331L:
 TestCaseDiff120331(); 
 break;
case 120332L:
 TestCaseDiff120332(); 
 break;
case 120333L:
 TestCaseDiff120333(); 
 break;
case 120334L:
 TestCaseDiff120334(); 
 break;
case 120335L:
 TestCaseDiff120335(); 
 break;
case 120336L:
 TestCaseDiff120336(); 
 break;
case 120337L:
 TestCaseDiff120337(); 
 break;
case 120338L:
 TestCaseDiff120338(); 
 break;
case 120339L:
 TestCaseDiff120339(); 
 break;
case 120340L:
 TestCaseDiff120340(); 
 break;
case 120341L:
 TestCaseDiff120341(); 
 break;
case 120342L:
 TestCaseDiff120342(); 
 break;
case 120343L:
 TestCaseDiff120343(); 
 break;
case 120344L:
 TestCaseDiff120344(); 
 break;
case 120345L:
 TestCaseDiff120345(); 
 break;
case 120346L:
 TestCaseDiff120346(); 
 break;
case 120347L:
 TestCaseDiff120347(); 
 break;
case 120348L:
 TestCaseDiff120348(); 
 break;
case 120349L:
 TestCaseDiff120349(); 
 break;
case 120350L:
 TestCaseDiff120350(); 
 break;
case 120351L:
 TestCaseDiff120351(); 
 break;
case 120352L:
 TestCaseDiff120352(); 
 break;
case 120353L:
 TestCaseDiff120353(); 
 break;
case 120354L:
 TestCaseDiff120354(); 
 break;
case 120355L:
 TestCaseDiff120355(); 
 break;
case 120356L:
 TestCaseDiff120356(); 
 break;
case 120357L:
 TestCaseDiff120357(); 
 break;
case 120358L:
 TestCaseDiff120358(); 
 break;
case 120359L:
 TestCaseDiff120359(); 
 break;
case 120360L:
 TestCaseDiff120360(); 
 break;
case 120361L:
 TestCaseDiff120361(); 
 break;
case 120362L:
 TestCaseDiff120362(); 
 break;
case 120363L:
 TestCaseDiff120363(); 
 break;
case 120364L:
 TestCaseDiff120364(); 
 break;
case 120365L:
 TestCaseDiff120365(); 
 break;
case 120366L:
 TestCaseDiff120366(); 
 break;
case 120367L:
 TestCaseDiff120367(); 
 break;
case 120368L:
 TestCaseDiff120368(); 
 break;
case 120369L:
 TestCaseDiff120369(); 
 break;
case 120370L:
 TestCaseDiff120370(); 
 break;
case 120371L:
 TestCaseDiff120371(); 
 break;
case 120372L:
 TestCaseDiff120372(); 
 break;
case 120373L:
 TestCaseDiff120373(); 
 break;
case 120374L:
 TestCaseDiff120374(); 
 break;
case 120375L:
 TestCaseDiff120375(); 
 break;
case 120376L:
 TestCaseDiff120376(); 
 break;
case 120377L:
 TestCaseDiff120377(); 
 break;
case 120378L:
 TestCaseDiff120378(); 
 break;
case 120379L:
 TestCaseDiff120379(); 
 break;
case 120380L:
 TestCaseDiff120380(); 
 break;
case 120381L:
 TestCaseDiff120381(); 
 break;
case 120382L:
 TestCaseDiff120382(); 
 break;
case 120383L:
 TestCaseDiff120383(); 
 break;
case 120384L:
 TestCaseDiff120384(); 
 break;
case 120385L:
 TestCaseDiff120385(); 
 break;
case 120386L:
 TestCaseDiff120386(); 
 break;
case 120387L:
 TestCaseDiff120387(); 
 break;
case 120388L:
 TestCaseDiff120388(); 
 break;
case 120389L:
 TestCaseDiff120389(); 
 break;
case 120390L:
 TestCaseDiff120390(); 
 break;
case 120391L:
 TestCaseDiff120391(); 
 break;
case 120392L:
 TestCaseDiff120392(); 
 break;
case 120393L:
 TestCaseDiff120393(); 
 break;
case 120394L:
 TestCaseDiff120394(); 
 break;
case 120395L:
 TestCaseDiff120395(); 
 break;
case 120396L:
 TestCaseDiff120396(); 
 break;
case 120397L:
 TestCaseDiff120397(); 
 break;
case 120398L:
 TestCaseDiff120398(); 
 break;
case 120399L:
 TestCaseDiff120399(); 
 break;
case 120400L:
 TestCaseDiff120400(); 
 break;
default:
                    System.out.println(ConsoleColors.RED + "CoPilotEqnBasic TestCase:j= " + j + ": Gap" + ConsoleColors.RESET);
                    break;
            }
        }
    }
public static void TestCaseDiff120301() {
 UsageCalculus.TestCase = 120301;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+21+22/x^14-23*x^15+24+25/x^17-26*x^18+27*xyzxyzxyzxyzxyzxyzxyzxyzxyz^-19+28/x^20-29*x^21+30*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-22+31/x^23-32*x^24+33*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-25+34/x^26-35*x^27+36+37/x^29-38*x^30";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "21.0+22.0/x^14.0-23.0*x^15.0+24.0+25.0/x^17.0-26.0*x^18.0+27.0+28.0/x^20.0-29.0*x^21.0+30.0+31.0/x^23.0-32.0*x^24.0+33.0+34.0/x^26.0-35.0*x^27.0+36.0+37.0/x^29.0-38.0*x^30.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+22.0*-14.0/x^15.0-23.0*15.0*x^14.0+24.0*0.0+25.0*-17.0/x^18.0-26.0*18.0*x^17.0+27.0*0.0+28.0*-20.0/x^21.0-29.0*21.0*x^20.0+30.0*0.0+31.0*-23.0/x^24.0-32.0*24.0*x^23.0+33.0*0.0+34.0*-26.0/x^27.0-35.0*27.0*x^26.0+36.0*0.0+37.0*-29.0/x^30.0-38.0*30.0*x^29.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-308.0/x^15.0-345.0*x^14.0-425.0/x^18.0-468.0*x^17.0-560.0/x^21.0-609.0*x^20.0-713.0/x^24.0-768.0*x^23.0-884.0/x^27.0-945.0*x^26.0-1073.0/x^30.0-1140.0*x^29.0";
 UsageCalculus.EqnSolArrayMap3[1] = "21.0+22.0/x^14.0-23.0*x^15.0+24.0+25.0/x^17.0-26.0*x^18.0+27.0+28.0/x^20.0-29.0*x^21.0+30.0+31.0/x^23.0-32.0*x^24.0+33.0+34.0/x^26.0-35.0*x^27.0+36.0+37.0/x^29.0-38.0*x^30.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "21.0*x+22.0/-13.0/x^13.0-23.0/16.0*x^16.0+24.0*x+25.0/-16.0/x^16.0-26.0/19.0*x^19.0+27.0*x+28.0/-19.0/x^19.0-29.0/22.0*x^22.0+30.0*x+31.0/-22.0/x^22.0-32.0/25.0*x^25.0+33.0*x+34.0/-25.0/x^25.0-35.0/28.0*x^28.0+36.0*x+37.0/-28.0/x^28.0-38.0/31.0*x^31.0";
 UsageCalculus.EqnSolArrayMap4[1] = "21.0*x-1.6923076923076923/x^13.0-1.4375*x^16.0+24.0*x-1.5625/x^16.0-1.368421052631579*x^19.0+27.0*x-1.4736842105263157/x^19.0-1.3181818181818181*x^22.0+30.0*x-1.4090909090909092/x^22.0-1.28*x^25.0+33.0*x-1.36/x^25.0-1.25*x^28.0+36.0*x-1.3214285714285714/x^28.0-1.2258064516129032*x^31.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-308.0/x^15.0-345.0*x^14.0-425.0/x^18.0-468.0*x^17.0-560.0/x^21.0-609.0*x^20.0-713.0/x^24.0-768.0*x^23.0-884.0/x^27.0-945.0*x^26.0-1073.0/x^30.0-1140.0*x^29.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-308.0*-15.0/x^16.0-345.0*14.0*x^13.0-425.0*-18.0/x^19.0-468.0*17.0*x^16.0-560.0*-21.0/x^22.0-609.0*20.0*x^19.0-713.0*-24.0/x^25.0-768.0*23.0*x^22.0-884.0*-27.0/x^28.0-945.0*26.0*x^25.0-1073.0*-30.0/x^31.0-1140.0*29.0*x^28.0";
 UsageCalculus.EqnSolArrayMap2[2] = "4620.0/x^16.0-4830.0*x^13.0+7650.0/x^19.0-7956.0*x^16.0+11760.0/x^22.0-12180.0*x^19.0+17112.0/x^25.0-17664.0*x^22.0+23868.0/x^28.0-24570.0*x^25.0+32190.0/x^31.0-33060.0*x^28.0";
 UsageCalculus.EqnSolArrayMap3[2] = "21.0*x-1.6923076923076923/x^13.0-1.4375*x^16.0+24.0*x-1.5625/x^16.0-1.368421052631579*x^19.0+27.0*x-1.4736842105263157/x^19.0-1.3181818181818181*x^22.0+30.0*x-1.4090909090909092/x^22.0-1.28*x^25.0+33.0*x-1.36/x^25.0-1.25*x^28.0+36.0*x-1.3214285714285714/x^28.0-1.2258064516129032*x^31.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "21.0/2.0*x^2.0-1.6923076923076923/-12.0/x^12.0-1.4375/17.0*x^17.0+24.0/2.0*x^2.0-1.5625/-15.0/x^15.0-1.368421052631579/20.0*x^20.0+27.0/2.0*x^2.0-1.4736842105263157/-18.0/x^18.0-1.3181818181818181/23.0*x^23.0+30.0/2.0*x^2.0-1.4090909090909092/-21.0/x^21.0-1.28/26.0*x^26.0+33.0/2.0*x^2.0-1.36/-24.0/x^24.0-1.25/29.0*x^29.0+36.0/2.0*x^2.0-1.3214285714285714/-27.0/x^27.0-1.2258064516129032/32.0*x^32.0";
 UsageCalculus.EqnSolArrayMap4[2] = "10.5*x^2.0+1.0/7.090909090909091/x^12.0-1.0/11.826086956521738*x^17.0+12.0*x^2.0+1.0/9.6/x^15.0-1.0/14.615384615384615*x^20.0+13.5*x^2.0+1.0/12.214285714285715/x^18.0-1.0/17.448275862068968*x^23.0+15.0*x^2.0+1.0/14.903225806451612/x^21.0-1.0/20.3125*x^26.0+16.5*x^2.0+1.0/17.64705882352941/x^24.0-1.0/23.2*x^29.0+18.0*x^2.0+1.0/20.43243243243243/x^27.0-1.0/26.105263157894736*x^32.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "4620.0/x^16.0-4830.0*x^13.0+7650.0/x^19.0-7956.0*x^16.0+11760.0/x^22.0-12180.0*x^19.0+17112.0/x^25.0-17664.0*x^22.0+23868.0/x^28.0-24570.0*x^25.0+32190.0/x^31.0-33060.0*x^28.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "4620.0*-16.0/x^17.0-4830.0*13.0*x^12.0+7650.0*-19.0/x^20.0-7956.0*16.0*x^15.0+11760.0*-22.0/x^23.0-12180.0*19.0*x^18.0+17112.0*-25.0/x^26.0-17664.0*22.0*x^21.0+23868.0*-28.0/x^29.0-24570.0*25.0*x^24.0+32190.0*-31.0/x^32.0-33060.0*28.0*x^27.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-73920.0/x^17.0-62790.0*x^12.0-145350.0/x^20.0-127296.0*x^15.0-258720.0/x^23.0-231420.0*x^18.0-427800.0/x^26.0-388608.0*x^21.0-668304.0/x^29.0-614250.0*x^24.0-997890.0/x^32.0-925680.0*x^27.0";
 UsageCalculus.EqnSolArrayMap3[3] = "10.5*x^2.0+1.0/7.090909090909091/x^12.0-1.0/11.826086956521738*x^17.0+12.0*x^2.0+1.0/9.6/x^15.0-1.0/14.615384615384615*x^20.0+13.5*x^2.0+1.0/12.214285714285715/x^18.0-1.0/17.448275862068968*x^23.0+15.0*x^2.0+1.0/14.903225806451612/x^21.0-1.0/20.3125*x^26.0+16.5*x^2.0+1.0/17.64705882352941/x^24.0-1.0/23.2*x^29.0+18.0*x^2.0+1.0/20.43243243243243/x^27.0-1.0/26.105263157894736*x^32.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "10.5/3.0*x^3.0+1.0/7.090909090909091/-11.0/x^11.0-1.0/11.826086956521738/18.0*x^18.0+12.0/3.0*x^3.0+1.0/9.6/-14.0/x^14.0-1.0/14.615384615384615/21.0*x^21.0+13.5/3.0*x^3.0+1.0/12.214285714285715/-17.0/x^17.0-1.0/17.448275862068968/24.0*x^24.0+15.0/3.0*x^3.0+1.0/14.903225806451612/-20.0/x^20.0-1.0/20.3125/27.0*x^27.0+16.5/3.0*x^3.0+1.0/17.64705882352941/-23.0/x^23.0-1.0/23.2/30.0*x^30.0+18.0/3.0*x^3.0+1.0/20.43243243243243/-26.0/x^26.0-1.0/26.105263157894736/33.0*x^33.0";
 UsageCalculus.EqnSolArrayMap4[3] = "3.5*x^3.0-1.0/78.0/x^11.0-1.0/212.86956521739128*x^18.0+4.0*x^3.0-1.0/134.4/x^14.0-1.0/306.9230769230769*x^21.0+4.5*x^3.0-1.0/207.64285714285717/x^17.0-1.0/418.75862068965523*x^24.0+5.0*x^3.0-1.0/298.06451612903226/x^20.0-1.0/548.4375*x^27.0+5.5*x^3.0-1.0/405.8823529411764/x^23.0-1.0/696.0*x^30.0+6.0*x^3.0-1.0/531.2432432432432/x^26.0-1.0/861.4736842105262*x^33.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-73920.0/x^17.0-62790.0*x^12.0-145350.0/x^20.0-127296.0*x^15.0-258720.0/x^23.0-231420.0*x^18.0-427800.0/x^26.0-388608.0*x^21.0-668304.0/x^29.0-614250.0*x^24.0-997890.0/x^32.0-925680.0*x^27.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-73920.0*-17.0/x^18.0-62790.0*12.0*x^11.0-145350.0*-20.0/x^21.0-127296.0*15.0*x^14.0-258720.0*-23.0/x^24.0-231420.0*18.0*x^17.0-427800.0*-26.0/x^27.0-388608.0*21.0*x^20.0-668304.0*-29.0/x^30.0-614250.0*24.0*x^23.0-997890.0*-32.0/x^33.0-925680.0*27.0*x^26.0";
 UsageCalculus.EqnSolArrayMap2[4] = "1256640.0/x^18.0-753480.0*x^11.0+2907000.0/x^21.0-1909440.0*x^14.0+5950560.0/x^24.0-4165560.0*x^17.0+1.11228E7/x^27.0-8160768.0*x^20.0+1.9380816E7/x^30.0-1.4742E7*x^23.0+3.193248E7/x^33.0-2.499336E7*x^26.0";
 UsageCalculus.EqnSolArrayMap3[4] = "3.5*x^3.0-1.0/78.0/x^11.0-1.0/212.86956521739128*x^18.0+4.0*x^3.0-1.0/134.4/x^14.0-1.0/306.9230769230769*x^21.0+4.5*x^3.0-1.0/207.64285714285717/x^17.0-1.0/418.75862068965523*x^24.0+5.0*x^3.0-1.0/298.06451612903226/x^20.0-1.0/548.4375*x^27.0+5.5*x^3.0-1.0/405.8823529411764/x^23.0-1.0/696.0*x^30.0+6.0*x^3.0-1.0/531.2432432432432/x^26.0-1.0/861.4736842105262*x^33.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "3.5/4.0*x^4.0-1.0/78.0/-10.0/x^10.0-1.0/212.86956521739128/19.0*x^19.0+4.0/4.0*x^4.0-1.0/134.4/-13.0/x^13.0-1.0/306.9230769230769/22.0*x^22.0+4.5/4.0*x^4.0-1.0/207.64285714285717/-16.0/x^16.0-1.0/418.75862068965523/25.0*x^25.0+5.0/4.0*x^4.0-1.0/298.06451612903226/-19.0/x^19.0-1.0/548.4375/28.0*x^28.0+5.5/4.0*x^4.0-1.0/405.8823529411764/-22.0/x^22.0-1.0/696.0/31.0*x^31.0+6.0/4.0*x^4.0-1.0/531.2432432432432/-25.0/x^25.0-1.0/861.4736842105262/34.0*x^34.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/1.1428571428571428*x^4.0+1.0/780.0/x^10.0-1.0/4044.5217391304345*x^19.0+x^4.0+1.0/1747.2/x^13.0-1.0/6752.3076923076915*x^22.0+1.125*x^4.0+1.0/3322.2857142857147/x^16.0-1.0/10468.96551724138*x^25.0+1.25*x^4.0+1.0/5663.225806451613/x^19.0-1.0/15356.25*x^28.0+1.375*x^4.0+1.0/8929.411764705881/x^22.0-1.0/21576.0*x^31.0+1.5*x^4.0+1.0/13281.08108108108/x^25.0-1.0/29290.105263157893*x^34.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120302() {
 UsageCalculus.TestCase = 120302;
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

public static void TestCaseDiff120303() {
 UsageCalculus.TestCase = 120303;
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

public static void TestCaseDiff120304() {
 UsageCalculus.TestCase = 120304;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+24";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "24.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "";
 UsageCalculus.EqnSolArrayMap3[1] = "24.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "24.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "24.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "";
 UsageCalculus.EqnSolArrayMap2[2] = "";
 UsageCalculus.EqnSolArrayMap3[2] = "24.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "24.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "12.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "";
 UsageCalculus.EqnSolArrayMap2[3] = "";
 UsageCalculus.EqnSolArrayMap3[3] = "12.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "12.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "4.0*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "";
 UsageCalculus.EqnSolArrayMap2[4] = "";
 UsageCalculus.EqnSolArrayMap3[4] = "4.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "4.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120305() {
 UsageCalculus.TestCase = 120305;
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

public static void TestCaseDiff120306() {
 UsageCalculus.TestCase = 120306;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-26*x^18+27*xyzxyzxyzxyzxyzxyzxyzxyzxyz^-19+28/x^20";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-26.0*x^18.0+27.0+28.0/x^20.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-26.0*18.0*x^17.0+27.0*0.0+28.0*-20.0/x^21.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-468.0*x^17.0-560.0/x^21.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-26.0*x^18.0+27.0+28.0/x^20.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-26.0/19.0*x^19.0+27.0*x+28.0/-19.0/x^19.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.368421052631579*x^19.0+27.0*x-1.4736842105263157/x^19.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-468.0*x^17.0-560.0/x^21.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-468.0*17.0*x^16.0-560.0*-21.0/x^22.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-7956.0*x^16.0+11760.0/x^22.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.368421052631579*x^19.0+27.0*x-1.4736842105263157/x^19.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.368421052631579/20.0*x^20.0+27.0/2.0*x^2.0-1.4736842105263157/-18.0/x^18.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/14.615384615384615*x^20.0+13.5*x^2.0+1.0/12.214285714285715/x^18.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-7956.0*x^16.0+11760.0/x^22.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-7956.0*16.0*x^15.0+11760.0*-22.0/x^23.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-127296.0*x^15.0-258720.0/x^23.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/14.615384615384615*x^20.0+13.5*x^2.0+1.0/12.214285714285715/x^18.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/14.615384615384615/21.0*x^21.0+13.5/3.0*x^3.0+1.0/12.214285714285715/-17.0/x^17.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/306.9230769230769*x^21.0+4.5*x^3.0-1.0/207.64285714285717/x^17.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-127296.0*x^15.0-258720.0/x^23.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-127296.0*15.0*x^14.0-258720.0*-23.0/x^24.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1909440.0*x^14.0+5950560.0/x^24.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/306.9230769230769*x^21.0+4.5*x^3.0-1.0/207.64285714285717/x^17.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/306.9230769230769/22.0*x^22.0+4.5/4.0*x^4.0-1.0/207.64285714285717/-16.0/x^16.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/6752.3076923076915*x^22.0+1.125*x^4.0+1.0/3322.2857142857147/x^16.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120307() {
 UsageCalculus.TestCase = 120307;
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

public static void TestCaseDiff120308() {
 UsageCalculus.TestCase = 120308;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+28/x^20-29*x^21+30*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-22+31/x^23-32*x^24";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "28.0/x^20.0-29.0*x^21.0+30.0+31.0/x^23.0-32.0*x^24.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "28.0*-20.0/x^21.0-29.0*21.0*x^20.0+30.0*0.0+31.0*-23.0/x^24.0-32.0*24.0*x^23.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-560.0/x^21.0-609.0*x^20.0-713.0/x^24.0-768.0*x^23.0";
 UsageCalculus.EqnSolArrayMap3[1] = "28.0/x^20.0-29.0*x^21.0+30.0+31.0/x^23.0-32.0*x^24.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "28.0/-19.0/x^19.0-29.0/22.0*x^22.0+30.0*x+31.0/-22.0/x^22.0-32.0/25.0*x^25.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.4736842105263157/x^19.0-1.3181818181818181*x^22.0+30.0*x-1.4090909090909092/x^22.0-1.28*x^25.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-560.0/x^21.0-609.0*x^20.0-713.0/x^24.0-768.0*x^23.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-560.0*-21.0/x^22.0-609.0*20.0*x^19.0-713.0*-24.0/x^25.0-768.0*23.0*x^22.0";
 UsageCalculus.EqnSolArrayMap2[2] = "11760.0/x^22.0-12180.0*x^19.0+17112.0/x^25.0-17664.0*x^22.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.4736842105263157/x^19.0-1.3181818181818181*x^22.0+30.0*x-1.4090909090909092/x^22.0-1.28*x^25.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.4736842105263157/-18.0/x^18.0-1.3181818181818181/23.0*x^23.0+30.0/2.0*x^2.0-1.4090909090909092/-21.0/x^21.0-1.28/26.0*x^26.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/12.214285714285715/x^18.0-1.0/17.448275862068968*x^23.0+15.0*x^2.0+1.0/14.903225806451612/x^21.0-1.0/20.3125*x^26.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "11760.0/x^22.0-12180.0*x^19.0+17112.0/x^25.0-17664.0*x^22.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "11760.0*-22.0/x^23.0-12180.0*19.0*x^18.0+17112.0*-25.0/x^26.0-17664.0*22.0*x^21.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-258720.0/x^23.0-231420.0*x^18.0-427800.0/x^26.0-388608.0*x^21.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/12.214285714285715/x^18.0-1.0/17.448275862068968*x^23.0+15.0*x^2.0+1.0/14.903225806451612/x^21.0-1.0/20.3125*x^26.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/12.214285714285715/-17.0/x^17.0-1.0/17.448275862068968/24.0*x^24.0+15.0/3.0*x^3.0+1.0/14.903225806451612/-20.0/x^20.0-1.0/20.3125/27.0*x^27.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/207.64285714285717/x^17.0-1.0/418.75862068965523*x^24.0+5.0*x^3.0-1.0/298.06451612903226/x^20.0-1.0/548.4375*x^27.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-258720.0/x^23.0-231420.0*x^18.0-427800.0/x^26.0-388608.0*x^21.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-258720.0*-23.0/x^24.0-231420.0*18.0*x^17.0-427800.0*-26.0/x^27.0-388608.0*21.0*x^20.0";
 UsageCalculus.EqnSolArrayMap2[4] = "5950560.0/x^24.0-4165560.0*x^17.0+1.11228E7/x^27.0-8160768.0*x^20.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/207.64285714285717/x^17.0-1.0/418.75862068965523*x^24.0+5.0*x^3.0-1.0/298.06451612903226/x^20.0-1.0/548.4375*x^27.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/207.64285714285717/-16.0/x^16.0-1.0/418.75862068965523/25.0*x^25.0+5.0/4.0*x^4.0-1.0/298.06451612903226/-19.0/x^19.0-1.0/548.4375/28.0*x^28.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/3322.2857142857147/x^16.0-1.0/10468.96551724138*x^25.0+1.25*x^4.0+1.0/5663.225806451613/x^19.0-1.0/15356.25*x^28.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120309() {
 UsageCalculus.TestCase = 120309;
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

public static void TestCaseDiff120310() {
 UsageCalculus.TestCase = 120310;
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

public static void TestCaseDiff120311() {
 UsageCalculus.TestCase = 120311;
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

public static void TestCaseDiff120312() {
 UsageCalculus.TestCase = 120312;
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

public static void TestCaseDiff120313() {
 UsageCalculus.TestCase = 120313;
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

public static void TestCaseDiff120314() {
 UsageCalculus.TestCase = 120314;
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

public static void TestCaseDiff120315() {
 UsageCalculus.TestCase = 120315;
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

public static void TestCaseDiff120316() {
 UsageCalculus.TestCase = 120316;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+36+37/x^29-38*x^30+39+40/x^32-41*x^33+42*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-34+43/x^35-44*x^36+45*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-37+46/x^38-47*x^39+48*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-40";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "36.0+37.0/x^29.0-38.0*x^30.0+39.0+40.0/x^32.0-41.0*x^33.0+42.0+43.0/x^35.0-44.0*x^36.0+45.0+46.0/x^38.0-47.0*x^39.0+48.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+37.0*-29.0/x^30.0-38.0*30.0*x^29.0+39.0*0.0+40.0*-32.0/x^33.0-41.0*33.0*x^32.0+42.0*0.0+43.0*-35.0/x^36.0-44.0*36.0*x^35.0+45.0*0.0+46.0*-38.0/x^39.0-47.0*39.0*x^38.0+48.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-1073.0/x^30.0-1140.0*x^29.0-1280.0/x^33.0-1353.0*x^32.0-1505.0/x^36.0-1584.0*x^35.0-1748.0/x^39.0-1833.0*x^38.0";
 UsageCalculus.EqnSolArrayMap3[1] = "36.0+37.0/x^29.0-38.0*x^30.0+39.0+40.0/x^32.0-41.0*x^33.0+42.0+43.0/x^35.0-44.0*x^36.0+45.0+46.0/x^38.0-47.0*x^39.0+48.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "36.0*x+37.0/-28.0/x^28.0-38.0/31.0*x^31.0+39.0*x+40.0/-31.0/x^31.0-41.0/34.0*x^34.0+42.0*x+43.0/-34.0/x^34.0-44.0/37.0*x^37.0+45.0*x+46.0/-37.0/x^37.0-47.0/40.0*x^40.0+48.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "36.0*x-1.3214285714285714/x^28.0-1.2258064516129032*x^31.0+39.0*x-1.2903225806451613/x^31.0-1.2058823529411764*x^34.0+42.0*x-1.2647058823529411/x^34.0-1.1891891891891893*x^37.0+45.0*x-1.2432432432432432/x^37.0-1.175*x^40.0+48.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-1073.0/x^30.0-1140.0*x^29.0-1280.0/x^33.0-1353.0*x^32.0-1505.0/x^36.0-1584.0*x^35.0-1748.0/x^39.0-1833.0*x^38.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-1073.0*-30.0/x^31.0-1140.0*29.0*x^28.0-1280.0*-33.0/x^34.0-1353.0*32.0*x^31.0-1505.0*-36.0/x^37.0-1584.0*35.0*x^34.0-1748.0*-39.0/x^40.0-1833.0*38.0*x^37.0";
 UsageCalculus.EqnSolArrayMap2[2] = "32190.0/x^31.0-33060.0*x^28.0+42240.0/x^34.0-43296.0*x^31.0+54180.0/x^37.0-55440.0*x^34.0+68172.0/x^40.0-69654.0*x^37.0";
 UsageCalculus.EqnSolArrayMap3[2] = "36.0*x-1.3214285714285714/x^28.0-1.2258064516129032*x^31.0+39.0*x-1.2903225806451613/x^31.0-1.2058823529411764*x^34.0+42.0*x-1.2647058823529411/x^34.0-1.1891891891891893*x^37.0+45.0*x-1.2432432432432432/x^37.0-1.175*x^40.0+48.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "36.0/2.0*x^2.0-1.3214285714285714/-27.0/x^27.0-1.2258064516129032/32.0*x^32.0+39.0/2.0*x^2.0-1.2903225806451613/-30.0/x^30.0-1.2058823529411764/35.0*x^35.0+42.0/2.0*x^2.0-1.2647058823529411/-33.0/x^33.0-1.1891891891891893/38.0*x^38.0+45.0/2.0*x^2.0-1.2432432432432432/-36.0/x^36.0-1.175/41.0*x^41.0+48.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "18.0*x^2.0+1.0/20.43243243243243/x^27.0-1.0/26.105263157894736*x^32.0+19.5*x^2.0+1.0/23.25/x^30.0-1.0/29.02439024390244*x^35.0+21.0*x^2.0+1.0/26.093023255813954/x^33.0-1.0/31.954545454545453*x^38.0+22.5*x^2.0+1.0/28.956521739130437/x^36.0-1.0/34.8936170212766*x^41.0+24.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "32190.0/x^31.0-33060.0*x^28.0+42240.0/x^34.0-43296.0*x^31.0+54180.0/x^37.0-55440.0*x^34.0+68172.0/x^40.0-69654.0*x^37.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "32190.0*-31.0/x^32.0-33060.0*28.0*x^27.0+42240.0*-34.0/x^35.0-43296.0*31.0*x^30.0+54180.0*-37.0/x^38.0-55440.0*34.0*x^33.0+68172.0*-40.0/x^41.0-69654.0*37.0*x^36.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-997890.0/x^32.0-925680.0*x^27.0-1436160.0/x^35.0-1342176.0*x^30.0-2004660.0/x^38.0-1884960.0*x^33.0-2726880.0/x^41.0-2577198.0*x^36.0";
 UsageCalculus.EqnSolArrayMap3[3] = "18.0*x^2.0+1.0/20.43243243243243/x^27.0-1.0/26.105263157894736*x^32.0+19.5*x^2.0+1.0/23.25/x^30.0-1.0/29.02439024390244*x^35.0+21.0*x^2.0+1.0/26.093023255813954/x^33.0-1.0/31.954545454545453*x^38.0+22.5*x^2.0+1.0/28.956521739130437/x^36.0-1.0/34.8936170212766*x^41.0+24.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "18.0/3.0*x^3.0+1.0/20.43243243243243/-26.0/x^26.0-1.0/26.105263157894736/33.0*x^33.0+19.5/3.0*x^3.0+1.0/23.25/-29.0/x^29.0-1.0/29.02439024390244/36.0*x^36.0+21.0/3.0*x^3.0+1.0/26.093023255813954/-32.0/x^32.0-1.0/31.954545454545453/39.0*x^39.0+22.5/3.0*x^3.0+1.0/28.956521739130437/-35.0/x^35.0-1.0/34.8936170212766/42.0*x^42.0+24.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "6.0*x^3.0-1.0/531.2432432432432/x^26.0-1.0/861.4736842105262*x^33.0+6.5*x^3.0-1.0/674.25/x^29.0-1.0/1044.878048780488*x^36.0+7.0*x^3.0-1.0/834.9767441860465/x^32.0-1.0/1246.2272727272727*x^39.0+7.5*x^3.0-1.0/1013.4782608695652/x^35.0-1.0/1465.531914893617*x^42.0+8.0*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-997890.0/x^32.0-925680.0*x^27.0-1436160.0/x^35.0-1342176.0*x^30.0-2004660.0/x^38.0-1884960.0*x^33.0-2726880.0/x^41.0-2577198.0*x^36.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-997890.0*-32.0/x^33.0-925680.0*27.0*x^26.0-1436160.0*-35.0/x^36.0-1342176.0*30.0*x^29.0-2004660.0*-38.0/x^39.0-1884960.0*33.0*x^32.0-2726880.0*-41.0/x^42.0-2577198.0*36.0*x^35.0";
 UsageCalculus.EqnSolArrayMap2[4] = "3.193248E7/x^33.0-2.499336E7*x^26.0+5.02656E7/x^36.0-4.026528E7*x^29.0+7.617708E7/x^39.0-6.220368E7*x^32.0+1.1180208E8/x^42.0-9.2779128E7*x^35.0";
 UsageCalculus.EqnSolArrayMap3[4] = "6.0*x^3.0-1.0/531.2432432432432/x^26.0-1.0/861.4736842105262*x^33.0+6.5*x^3.0-1.0/674.25/x^29.0-1.0/1044.878048780488*x^36.0+7.0*x^3.0-1.0/834.9767441860465/x^32.0-1.0/1246.2272727272727*x^39.0+7.5*x^3.0-1.0/1013.4782608695652/x^35.0-1.0/1465.531914893617*x^42.0+8.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "6.0/4.0*x^4.0-1.0/531.2432432432432/-25.0/x^25.0-1.0/861.4736842105262/34.0*x^34.0+6.5/4.0*x^4.0-1.0/674.25/-28.0/x^28.0-1.0/1044.878048780488/37.0*x^37.0+7.0/4.0*x^4.0-1.0/834.9767441860465/-31.0/x^31.0-1.0/1246.2272727272727/40.0*x^40.0+7.5/4.0*x^4.0-1.0/1013.4782608695652/-34.0/x^34.0-1.0/1465.531914893617/43.0*x^43.0+8.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.5*x^4.0+1.0/13281.08108108108/x^25.0-1.0/29290.105263157893*x^34.0+1.625*x^4.0+1.0/18879.0/x^28.0-1.0/38660.48780487805*x^37.0+1.75*x^4.0+1.0/25884.279069767443/x^31.0-1.0/49849.09090909091*x^40.0+1.875*x^4.0+1.0/34458.260869565216/x^34.0-1.0/63017.872340425536*x^43.0+2.0*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120317() {
 UsageCalculus.TestCase = 120317;
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

public static void TestCaseDiff120318() {
 UsageCalculus.TestCase = 120318;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-38*x^30+39+40/x^32-41*x^33+42*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-34+43/x^35-44*x^36+45*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-37+46/x^38-47*x^39+48*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-40+49/x^41-50*x^42+51+52/x^44";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-38.0*x^30.0+39.0+40.0/x^32.0-41.0*x^33.0+42.0+43.0/x^35.0-44.0*x^36.0+45.0+46.0/x^38.0-47.0*x^39.0+48.0+49.0/x^41.0-50.0*x^42.0+51.0+52.0/x^44.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-38.0*30.0*x^29.0+39.0*0.0+40.0*-32.0/x^33.0-41.0*33.0*x^32.0+42.0*0.0+43.0*-35.0/x^36.0-44.0*36.0*x^35.0+45.0*0.0+46.0*-38.0/x^39.0-47.0*39.0*x^38.0+48.0*0.0+49.0*-41.0/x^42.0-50.0*42.0*x^41.0+51.0*0.0+52.0*-44.0/x^45.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-1140.0*x^29.0-1280.0/x^33.0-1353.0*x^32.0-1505.0/x^36.0-1584.0*x^35.0-1748.0/x^39.0-1833.0*x^38.0-2009.0/x^42.0-2100.0*x^41.0-2288.0/x^45.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-38.0*x^30.0+39.0+40.0/x^32.0-41.0*x^33.0+42.0+43.0/x^35.0-44.0*x^36.0+45.0+46.0/x^38.0-47.0*x^39.0+48.0+49.0/x^41.0-50.0*x^42.0+51.0+52.0/x^44.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-38.0/31.0*x^31.0+39.0*x+40.0/-31.0/x^31.0-41.0/34.0*x^34.0+42.0*x+43.0/-34.0/x^34.0-44.0/37.0*x^37.0+45.0*x+46.0/-37.0/x^37.0-47.0/40.0*x^40.0+48.0*x+49.0/-40.0/x^40.0-50.0/43.0*x^43.0+51.0*x+52.0/-43.0/x^43.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.2258064516129032*x^31.0+39.0*x-1.2903225806451613/x^31.0-1.2058823529411764*x^34.0+42.0*x-1.2647058823529411/x^34.0-1.1891891891891893*x^37.0+45.0*x-1.2432432432432432/x^37.0-1.175*x^40.0+48.0*x-1.225/x^40.0-1.1627906976744187*x^43.0+51.0*x-1.2093023255813953/x^43.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-1140.0*x^29.0-1280.0/x^33.0-1353.0*x^32.0-1505.0/x^36.0-1584.0*x^35.0-1748.0/x^39.0-1833.0*x^38.0-2009.0/x^42.0-2100.0*x^41.0-2288.0/x^45.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-1140.0*29.0*x^28.0-1280.0*-33.0/x^34.0-1353.0*32.0*x^31.0-1505.0*-36.0/x^37.0-1584.0*35.0*x^34.0-1748.0*-39.0/x^40.0-1833.0*38.0*x^37.0-2009.0*-42.0/x^43.0-2100.0*41.0*x^40.0-2288.0*-45.0/x^46.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-33060.0*x^28.0+42240.0/x^34.0-43296.0*x^31.0+54180.0/x^37.0-55440.0*x^34.0+68172.0/x^40.0-69654.0*x^37.0+84378.0/x^43.0-86100.0*x^40.0+102960.0/x^46.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.2258064516129032*x^31.0+39.0*x-1.2903225806451613/x^31.0-1.2058823529411764*x^34.0+42.0*x-1.2647058823529411/x^34.0-1.1891891891891893*x^37.0+45.0*x-1.2432432432432432/x^37.0-1.175*x^40.0+48.0*x-1.225/x^40.0-1.1627906976744187*x^43.0+51.0*x-1.2093023255813953/x^43.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.2258064516129032/32.0*x^32.0+39.0/2.0*x^2.0-1.2903225806451613/-30.0/x^30.0-1.2058823529411764/35.0*x^35.0+42.0/2.0*x^2.0-1.2647058823529411/-33.0/x^33.0-1.1891891891891893/38.0*x^38.0+45.0/2.0*x^2.0-1.2432432432432432/-36.0/x^36.0-1.175/41.0*x^41.0+48.0/2.0*x^2.0-1.225/-39.0/x^39.0-1.1627906976744187/44.0*x^44.0+51.0/2.0*x^2.0-1.2093023255813953/-42.0/x^42.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/26.105263157894736*x^32.0+19.5*x^2.0+1.0/23.25/x^30.0-1.0/29.02439024390244*x^35.0+21.0*x^2.0+1.0/26.093023255813954/x^33.0-1.0/31.954545454545453*x^38.0+22.5*x^2.0+1.0/28.956521739130437/x^36.0-1.0/34.8936170212766*x^41.0+24.0*x^2.0+1.0/31.83673469387755/x^39.0-1.0/37.839999999999996*x^44.0+25.5*x^2.0+1.0/34.73076923076923/x^42.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-33060.0*x^28.0+42240.0/x^34.0-43296.0*x^31.0+54180.0/x^37.0-55440.0*x^34.0+68172.0/x^40.0-69654.0*x^37.0+84378.0/x^43.0-86100.0*x^40.0+102960.0/x^46.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-33060.0*28.0*x^27.0+42240.0*-34.0/x^35.0-43296.0*31.0*x^30.0+54180.0*-37.0/x^38.0-55440.0*34.0*x^33.0+68172.0*-40.0/x^41.0-69654.0*37.0*x^36.0+84378.0*-43.0/x^44.0-86100.0*40.0*x^39.0+102960.0*-46.0/x^47.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-925680.0*x^27.0-1436160.0/x^35.0-1342176.0*x^30.0-2004660.0/x^38.0-1884960.0*x^33.0-2726880.0/x^41.0-2577198.0*x^36.0-3628254.0/x^44.0-3444000.0*x^39.0-4736160.0/x^47.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/26.105263157894736*x^32.0+19.5*x^2.0+1.0/23.25/x^30.0-1.0/29.02439024390244*x^35.0+21.0*x^2.0+1.0/26.093023255813954/x^33.0-1.0/31.954545454545453*x^38.0+22.5*x^2.0+1.0/28.956521739130437/x^36.0-1.0/34.8936170212766*x^41.0+24.0*x^2.0+1.0/31.83673469387755/x^39.0-1.0/37.839999999999996*x^44.0+25.5*x^2.0+1.0/34.73076923076923/x^42.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/26.105263157894736/33.0*x^33.0+19.5/3.0*x^3.0+1.0/23.25/-29.0/x^29.0-1.0/29.02439024390244/36.0*x^36.0+21.0/3.0*x^3.0+1.0/26.093023255813954/-32.0/x^32.0-1.0/31.954545454545453/39.0*x^39.0+22.5/3.0*x^3.0+1.0/28.956521739130437/-35.0/x^35.0-1.0/34.8936170212766/42.0*x^42.0+24.0/3.0*x^3.0+1.0/31.83673469387755/-38.0/x^38.0-1.0/37.839999999999996/45.0*x^45.0+25.5/3.0*x^3.0+1.0/34.73076923076923/-41.0/x^41.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/861.4736842105262*x^33.0+6.5*x^3.0-1.0/674.25/x^29.0-1.0/1044.878048780488*x^36.0+7.0*x^3.0-1.0/834.9767441860465/x^32.0-1.0/1246.2272727272727*x^39.0+7.5*x^3.0-1.0/1013.4782608695652/x^35.0-1.0/1465.531914893617*x^42.0+8.0*x^3.0-1.0/1209.7959183673468/x^38.0-1.0/1702.7999999999997*x^45.0+8.5*x^3.0-1.0/1423.9615384615386/x^41.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-925680.0*x^27.0-1436160.0/x^35.0-1342176.0*x^30.0-2004660.0/x^38.0-1884960.0*x^33.0-2726880.0/x^41.0-2577198.0*x^36.0-3628254.0/x^44.0-3444000.0*x^39.0-4736160.0/x^47.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-925680.0*27.0*x^26.0-1436160.0*-35.0/x^36.0-1342176.0*30.0*x^29.0-2004660.0*-38.0/x^39.0-1884960.0*33.0*x^32.0-2726880.0*-41.0/x^42.0-2577198.0*36.0*x^35.0-3628254.0*-44.0/x^45.0-3444000.0*39.0*x^38.0-4736160.0*-47.0/x^48.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-2.499336E7*x^26.0+5.02656E7/x^36.0-4.026528E7*x^29.0+7.617708E7/x^39.0-6.220368E7*x^32.0+1.1180208E8/x^42.0-9.2779128E7*x^35.0+1.59643176E8/x^45.0-1.34316E8*x^38.0+2.2259952E8/x^48.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/861.4736842105262*x^33.0+6.5*x^3.0-1.0/674.25/x^29.0-1.0/1044.878048780488*x^36.0+7.0*x^3.0-1.0/834.9767441860465/x^32.0-1.0/1246.2272727272727*x^39.0+7.5*x^3.0-1.0/1013.4782608695652/x^35.0-1.0/1465.531914893617*x^42.0+8.0*x^3.0-1.0/1209.7959183673468/x^38.0-1.0/1702.7999999999997*x^45.0+8.5*x^3.0-1.0/1423.9615384615386/x^41.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/861.4736842105262/34.0*x^34.0+6.5/4.0*x^4.0-1.0/674.25/-28.0/x^28.0-1.0/1044.878048780488/37.0*x^37.0+7.0/4.0*x^4.0-1.0/834.9767441860465/-31.0/x^31.0-1.0/1246.2272727272727/40.0*x^40.0+7.5/4.0*x^4.0-1.0/1013.4782608695652/-34.0/x^34.0-1.0/1465.531914893617/43.0*x^43.0+8.0/4.0*x^4.0-1.0/1209.7959183673468/-37.0/x^37.0-1.0/1702.7999999999997/46.0*x^46.0+8.5/4.0*x^4.0-1.0/1423.9615384615386/-40.0/x^40.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/29290.105263157893*x^34.0+1.625*x^4.0+1.0/18879.0/x^28.0-1.0/38660.48780487805*x^37.0+1.75*x^4.0+1.0/25884.279069767443/x^31.0-1.0/49849.09090909091*x^40.0+1.875*x^4.0+1.0/34458.260869565216/x^34.0-1.0/63017.872340425536*x^43.0+2.0*x^4.0+1.0/44762.44897959183/x^37.0-1.0/78328.79999999999*x^46.0+2.125*x^4.0+1.0/56958.461538461546/x^40.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120319() {
 UsageCalculus.TestCase = 120319;
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

public static void TestCaseDiff120320() {
 UsageCalculus.TestCase = 120320;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+40/x^32-41*x^33+42*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-34+43/x^35-44*x^36+45*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-37+46/x^38-47*x^39+48*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-40+49/x^41-50*x^42+51+52/x^44-53*x^45+54+55/x^47-56*x^48";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "40.0/x^32.0-41.0*x^33.0+42.0+43.0/x^35.0-44.0*x^36.0+45.0+46.0/x^38.0-47.0*x^39.0+48.0+49.0/x^41.0-50.0*x^42.0+51.0+52.0/x^44.0-53.0*x^45.0+54.0+55.0/x^47.0-56.0*x^48.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "40.0*-32.0/x^33.0-41.0*33.0*x^32.0+42.0*0.0+43.0*-35.0/x^36.0-44.0*36.0*x^35.0+45.0*0.0+46.0*-38.0/x^39.0-47.0*39.0*x^38.0+48.0*0.0+49.0*-41.0/x^42.0-50.0*42.0*x^41.0+51.0*0.0+52.0*-44.0/x^45.0-53.0*45.0*x^44.0+54.0*0.0+55.0*-47.0/x^48.0-56.0*48.0*x^47.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-1280.0/x^33.0-1353.0*x^32.0-1505.0/x^36.0-1584.0*x^35.0-1748.0/x^39.0-1833.0*x^38.0-2009.0/x^42.0-2100.0*x^41.0-2288.0/x^45.0-2385.0*x^44.0-2585.0/x^48.0-2688.0*x^47.0";
 UsageCalculus.EqnSolArrayMap3[1] = "40.0/x^32.0-41.0*x^33.0+42.0+43.0/x^35.0-44.0*x^36.0+45.0+46.0/x^38.0-47.0*x^39.0+48.0+49.0/x^41.0-50.0*x^42.0+51.0+52.0/x^44.0-53.0*x^45.0+54.0+55.0/x^47.0-56.0*x^48.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "40.0/-31.0/x^31.0-41.0/34.0*x^34.0+42.0*x+43.0/-34.0/x^34.0-44.0/37.0*x^37.0+45.0*x+46.0/-37.0/x^37.0-47.0/40.0*x^40.0+48.0*x+49.0/-40.0/x^40.0-50.0/43.0*x^43.0+51.0*x+52.0/-43.0/x^43.0-53.0/46.0*x^46.0+54.0*x+55.0/-46.0/x^46.0-56.0/49.0*x^49.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.2903225806451613/x^31.0-1.2058823529411764*x^34.0+42.0*x-1.2647058823529411/x^34.0-1.1891891891891893*x^37.0+45.0*x-1.2432432432432432/x^37.0-1.175*x^40.0+48.0*x-1.225/x^40.0-1.1627906976744187*x^43.0+51.0*x-1.2093023255813953/x^43.0-1.1521739130434783*x^46.0+54.0*x-1.1956521739130435/x^46.0-1.1428571428571428*x^49.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-1280.0/x^33.0-1353.0*x^32.0-1505.0/x^36.0-1584.0*x^35.0-1748.0/x^39.0-1833.0*x^38.0-2009.0/x^42.0-2100.0*x^41.0-2288.0/x^45.0-2385.0*x^44.0-2585.0/x^48.0-2688.0*x^47.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-1280.0*-33.0/x^34.0-1353.0*32.0*x^31.0-1505.0*-36.0/x^37.0-1584.0*35.0*x^34.0-1748.0*-39.0/x^40.0-1833.0*38.0*x^37.0-2009.0*-42.0/x^43.0-2100.0*41.0*x^40.0-2288.0*-45.0/x^46.0-2385.0*44.0*x^43.0-2585.0*-48.0/x^49.0-2688.0*47.0*x^46.0";
 UsageCalculus.EqnSolArrayMap2[2] = "42240.0/x^34.0-43296.0*x^31.0+54180.0/x^37.0-55440.0*x^34.0+68172.0/x^40.0-69654.0*x^37.0+84378.0/x^43.0-86100.0*x^40.0+102960.0/x^46.0-104940.0*x^43.0+124080.0/x^49.0-126336.0*x^46.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.2903225806451613/x^31.0-1.2058823529411764*x^34.0+42.0*x-1.2647058823529411/x^34.0-1.1891891891891893*x^37.0+45.0*x-1.2432432432432432/x^37.0-1.175*x^40.0+48.0*x-1.225/x^40.0-1.1627906976744187*x^43.0+51.0*x-1.2093023255813953/x^43.0-1.1521739130434783*x^46.0+54.0*x-1.1956521739130435/x^46.0-1.1428571428571428*x^49.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.2903225806451613/-30.0/x^30.0-1.2058823529411764/35.0*x^35.0+42.0/2.0*x^2.0-1.2647058823529411/-33.0/x^33.0-1.1891891891891893/38.0*x^38.0+45.0/2.0*x^2.0-1.2432432432432432/-36.0/x^36.0-1.175/41.0*x^41.0+48.0/2.0*x^2.0-1.225/-39.0/x^39.0-1.1627906976744187/44.0*x^44.0+51.0/2.0*x^2.0-1.2093023255813953/-42.0/x^42.0-1.1521739130434783/47.0*x^47.0+54.0/2.0*x^2.0-1.1956521739130435/-45.0/x^45.0-1.1428571428571428/50.0*x^50.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/23.25/x^30.0-1.0/29.02439024390244*x^35.0+21.0*x^2.0+1.0/26.093023255813954/x^33.0-1.0/31.954545454545453*x^38.0+22.5*x^2.0+1.0/28.956521739130437/x^36.0-1.0/34.8936170212766*x^41.0+24.0*x^2.0+1.0/31.83673469387755/x^39.0-1.0/37.839999999999996*x^44.0+25.5*x^2.0+1.0/34.73076923076923/x^42.0-1.0/40.79245283018868*x^47.0+27.0*x^2.0+1.0/37.63636363636364/x^45.0-1.0/43.75*x^50.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "42240.0/x^34.0-43296.0*x^31.0+54180.0/x^37.0-55440.0*x^34.0+68172.0/x^40.0-69654.0*x^37.0+84378.0/x^43.0-86100.0*x^40.0+102960.0/x^46.0-104940.0*x^43.0+124080.0/x^49.0-126336.0*x^46.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "42240.0*-34.0/x^35.0-43296.0*31.0*x^30.0+54180.0*-37.0/x^38.0-55440.0*34.0*x^33.0+68172.0*-40.0/x^41.0-69654.0*37.0*x^36.0+84378.0*-43.0/x^44.0-86100.0*40.0*x^39.0+102960.0*-46.0/x^47.0-104940.0*43.0*x^42.0+124080.0*-49.0/x^50.0-126336.0*46.0*x^45.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-1436160.0/x^35.0-1342176.0*x^30.0-2004660.0/x^38.0-1884960.0*x^33.0-2726880.0/x^41.0-2577198.0*x^36.0-3628254.0/x^44.0-3444000.0*x^39.0-4736160.0/x^47.0-4512420.0*x^42.0-6079920.0/x^50.0-5811456.0*x^45.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/23.25/x^30.0-1.0/29.02439024390244*x^35.0+21.0*x^2.0+1.0/26.093023255813954/x^33.0-1.0/31.954545454545453*x^38.0+22.5*x^2.0+1.0/28.956521739130437/x^36.0-1.0/34.8936170212766*x^41.0+24.0*x^2.0+1.0/31.83673469387755/x^39.0-1.0/37.839999999999996*x^44.0+25.5*x^2.0+1.0/34.73076923076923/x^42.0-1.0/40.79245283018868*x^47.0+27.0*x^2.0+1.0/37.63636363636364/x^45.0-1.0/43.75*x^50.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/23.25/-29.0/x^29.0-1.0/29.02439024390244/36.0*x^36.0+21.0/3.0*x^3.0+1.0/26.093023255813954/-32.0/x^32.0-1.0/31.954545454545453/39.0*x^39.0+22.5/3.0*x^3.0+1.0/28.956521739130437/-35.0/x^35.0-1.0/34.8936170212766/42.0*x^42.0+24.0/3.0*x^3.0+1.0/31.83673469387755/-38.0/x^38.0-1.0/37.839999999999996/45.0*x^45.0+25.5/3.0*x^3.0+1.0/34.73076923076923/-41.0/x^41.0-1.0/40.79245283018868/48.0*x^48.0+27.0/3.0*x^3.0+1.0/37.63636363636364/-44.0/x^44.0-1.0/43.75/51.0*x^51.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/674.25/x^29.0-1.0/1044.878048780488*x^36.0+7.0*x^3.0-1.0/834.9767441860465/x^32.0-1.0/1246.2272727272727*x^39.0+7.5*x^3.0-1.0/1013.4782608695652/x^35.0-1.0/1465.531914893617*x^42.0+8.0*x^3.0-1.0/1209.7959183673468/x^38.0-1.0/1702.7999999999997*x^45.0+8.5*x^3.0-1.0/1423.9615384615386/x^41.0-1.0/1958.0377358490566*x^48.0+9.0*x^3.0-1.0/1656.0000000000002/x^44.0-1.0/2231.25*x^51.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-1436160.0/x^35.0-1342176.0*x^30.0-2004660.0/x^38.0-1884960.0*x^33.0-2726880.0/x^41.0-2577198.0*x^36.0-3628254.0/x^44.0-3444000.0*x^39.0-4736160.0/x^47.0-4512420.0*x^42.0-6079920.0/x^50.0-5811456.0*x^45.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-1436160.0*-35.0/x^36.0-1342176.0*30.0*x^29.0-2004660.0*-38.0/x^39.0-1884960.0*33.0*x^32.0-2726880.0*-41.0/x^42.0-2577198.0*36.0*x^35.0-3628254.0*-44.0/x^45.0-3444000.0*39.0*x^38.0-4736160.0*-47.0/x^48.0-4512420.0*42.0*x^41.0-6079920.0*-50.0/x^51.0-5811456.0*45.0*x^44.0";
 UsageCalculus.EqnSolArrayMap2[4] = "5.02656E7/x^36.0-4.026528E7*x^29.0+7.617708E7/x^39.0-6.220368E7*x^32.0+1.1180208E8/x^42.0-9.2779128E7*x^35.0+1.59643176E8/x^45.0-1.34316E8*x^38.0+2.2259952E8/x^48.0-1.8952164E8*x^41.0+3.03996E8/x^51.0-2.6151552E8*x^44.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/674.25/x^29.0-1.0/1044.878048780488*x^36.0+7.0*x^3.0-1.0/834.9767441860465/x^32.0-1.0/1246.2272727272727*x^39.0+7.5*x^3.0-1.0/1013.4782608695652/x^35.0-1.0/1465.531914893617*x^42.0+8.0*x^3.0-1.0/1209.7959183673468/x^38.0-1.0/1702.7999999999997*x^45.0+8.5*x^3.0-1.0/1423.9615384615386/x^41.0-1.0/1958.0377358490566*x^48.0+9.0*x^3.0-1.0/1656.0000000000002/x^44.0-1.0/2231.25*x^51.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/674.25/-28.0/x^28.0-1.0/1044.878048780488/37.0*x^37.0+7.0/4.0*x^4.0-1.0/834.9767441860465/-31.0/x^31.0-1.0/1246.2272727272727/40.0*x^40.0+7.5/4.0*x^4.0-1.0/1013.4782608695652/-34.0/x^34.0-1.0/1465.531914893617/43.0*x^43.0+8.0/4.0*x^4.0-1.0/1209.7959183673468/-37.0/x^37.0-1.0/1702.7999999999997/46.0*x^46.0+8.5/4.0*x^4.0-1.0/1423.9615384615386/-40.0/x^40.0-1.0/1958.0377358490566/49.0*x^49.0+9.0/4.0*x^4.0-1.0/1656.0000000000002/-43.0/x^43.0-1.0/2231.25/52.0*x^52.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/18879.0/x^28.0-1.0/38660.48780487805*x^37.0+1.75*x^4.0+1.0/25884.279069767443/x^31.0-1.0/49849.09090909091*x^40.0+1.875*x^4.0+1.0/34458.260869565216/x^34.0-1.0/63017.872340425536*x^43.0+2.0*x^4.0+1.0/44762.44897959183/x^37.0-1.0/78328.79999999999*x^46.0+2.125*x^4.0+1.0/56958.461538461546/x^40.0-1.0/95943.84905660378*x^49.0+2.25*x^4.0+1.0/71208.00000000001/x^43.0-1.0/116025.0*x^52.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120321() {
 UsageCalculus.TestCase = 120321;
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

public static void TestCaseDiff120322() {
 UsageCalculus.TestCase = 120322;
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

public static void TestCaseDiff120323() {
 UsageCalculus.TestCase = 120323;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+43/x^35-44*x^36+45*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-37+46/x^38-47*x^39+48*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-40+49/x^41-50*x^42+51+52/x^44-53*x^45+54+55/x^47-56*x^48+57*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-49+58/x^50-59*x^51+60*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-52+61/x^53-62*x^54";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "43.0/x^35.0-44.0*x^36.0+45.0+46.0/x^38.0-47.0*x^39.0+48.0+49.0/x^41.0-50.0*x^42.0+51.0+52.0/x^44.0-53.0*x^45.0+54.0+55.0/x^47.0-56.0*x^48.0+57.0+58.0/x^50.0-59.0*x^51.0+60.0+61.0/x^53.0-62.0*x^54.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "43.0*-35.0/x^36.0-44.0*36.0*x^35.0+45.0*0.0+46.0*-38.0/x^39.0-47.0*39.0*x^38.0+48.0*0.0+49.0*-41.0/x^42.0-50.0*42.0*x^41.0+51.0*0.0+52.0*-44.0/x^45.0-53.0*45.0*x^44.0+54.0*0.0+55.0*-47.0/x^48.0-56.0*48.0*x^47.0+57.0*0.0+58.0*-50.0/x^51.0-59.0*51.0*x^50.0+60.0*0.0+61.0*-53.0/x^54.0-62.0*54.0*x^53.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-1505.0/x^36.0-1584.0*x^35.0-1748.0/x^39.0-1833.0*x^38.0-2009.0/x^42.0-2100.0*x^41.0-2288.0/x^45.0-2385.0*x^44.0-2585.0/x^48.0-2688.0*x^47.0-2900.0/x^51.0-3009.0*x^50.0-3233.0/x^54.0-3348.0*x^53.0";
 UsageCalculus.EqnSolArrayMap3[1] = "43.0/x^35.0-44.0*x^36.0+45.0+46.0/x^38.0-47.0*x^39.0+48.0+49.0/x^41.0-50.0*x^42.0+51.0+52.0/x^44.0-53.0*x^45.0+54.0+55.0/x^47.0-56.0*x^48.0+57.0+58.0/x^50.0-59.0*x^51.0+60.0+61.0/x^53.0-62.0*x^54.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "43.0/-34.0/x^34.0-44.0/37.0*x^37.0+45.0*x+46.0/-37.0/x^37.0-47.0/40.0*x^40.0+48.0*x+49.0/-40.0/x^40.0-50.0/43.0*x^43.0+51.0*x+52.0/-43.0/x^43.0-53.0/46.0*x^46.0+54.0*x+55.0/-46.0/x^46.0-56.0/49.0*x^49.0+57.0*x+58.0/-49.0/x^49.0-59.0/52.0*x^52.0+60.0*x+61.0/-52.0/x^52.0-62.0/55.0*x^55.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.2647058823529411/x^34.0-1.1891891891891893*x^37.0+45.0*x-1.2432432432432432/x^37.0-1.175*x^40.0+48.0*x-1.225/x^40.0-1.1627906976744187*x^43.0+51.0*x-1.2093023255813953/x^43.0-1.1521739130434783*x^46.0+54.0*x-1.1956521739130435/x^46.0-1.1428571428571428*x^49.0+57.0*x-1.183673469387755/x^49.0-1.1346153846153846*x^52.0+60.0*x-1.1730769230769231/x^52.0-1.1272727272727272*x^55.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-1505.0/x^36.0-1584.0*x^35.0-1748.0/x^39.0-1833.0*x^38.0-2009.0/x^42.0-2100.0*x^41.0-2288.0/x^45.0-2385.0*x^44.0-2585.0/x^48.0-2688.0*x^47.0-2900.0/x^51.0-3009.0*x^50.0-3233.0/x^54.0-3348.0*x^53.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-1505.0*-36.0/x^37.0-1584.0*35.0*x^34.0-1748.0*-39.0/x^40.0-1833.0*38.0*x^37.0-2009.0*-42.0/x^43.0-2100.0*41.0*x^40.0-2288.0*-45.0/x^46.0-2385.0*44.0*x^43.0-2585.0*-48.0/x^49.0-2688.0*47.0*x^46.0-2900.0*-51.0/x^52.0-3009.0*50.0*x^49.0-3233.0*-54.0/x^55.0-3348.0*53.0*x^52.0";
 UsageCalculus.EqnSolArrayMap2[2] = "54180.0/x^37.0-55440.0*x^34.0+68172.0/x^40.0-69654.0*x^37.0+84378.0/x^43.0-86100.0*x^40.0+102960.0/x^46.0-104940.0*x^43.0+124080.0/x^49.0-126336.0*x^46.0+147900.0/x^52.0-150450.0*x^49.0+174582.0/x^55.0-177444.0*x^52.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.2647058823529411/x^34.0-1.1891891891891893*x^37.0+45.0*x-1.2432432432432432/x^37.0-1.175*x^40.0+48.0*x-1.225/x^40.0-1.1627906976744187*x^43.0+51.0*x-1.2093023255813953/x^43.0-1.1521739130434783*x^46.0+54.0*x-1.1956521739130435/x^46.0-1.1428571428571428*x^49.0+57.0*x-1.183673469387755/x^49.0-1.1346153846153846*x^52.0+60.0*x-1.1730769230769231/x^52.0-1.1272727272727272*x^55.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.2647058823529411/-33.0/x^33.0-1.1891891891891893/38.0*x^38.0+45.0/2.0*x^2.0-1.2432432432432432/-36.0/x^36.0-1.175/41.0*x^41.0+48.0/2.0*x^2.0-1.225/-39.0/x^39.0-1.1627906976744187/44.0*x^44.0+51.0/2.0*x^2.0-1.2093023255813953/-42.0/x^42.0-1.1521739130434783/47.0*x^47.0+54.0/2.0*x^2.0-1.1956521739130435/-45.0/x^45.0-1.1428571428571428/50.0*x^50.0+57.0/2.0*x^2.0-1.183673469387755/-48.0/x^48.0-1.1346153846153846/53.0*x^53.0+60.0/2.0*x^2.0-1.1730769230769231/-51.0/x^51.0-1.1272727272727272/56.0*x^56.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/26.093023255813954/x^33.0-1.0/31.954545454545453*x^38.0+22.5*x^2.0+1.0/28.956521739130437/x^36.0-1.0/34.8936170212766*x^41.0+24.0*x^2.0+1.0/31.83673469387755/x^39.0-1.0/37.839999999999996*x^44.0+25.5*x^2.0+1.0/34.73076923076923/x^42.0-1.0/40.79245283018868*x^47.0+27.0*x^2.0+1.0/37.63636363636364/x^45.0-1.0/43.75*x^50.0+28.5*x^2.0+1.0/40.55172413793103/x^48.0-1.0/46.71186440677966*x^53.0+30.0*x^2.0+1.0/43.47540983606557/x^51.0-1.0/49.67741935483871*x^56.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "54180.0/x^37.0-55440.0*x^34.0+68172.0/x^40.0-69654.0*x^37.0+84378.0/x^43.0-86100.0*x^40.0+102960.0/x^46.0-104940.0*x^43.0+124080.0/x^49.0-126336.0*x^46.0+147900.0/x^52.0-150450.0*x^49.0+174582.0/x^55.0-177444.0*x^52.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "54180.0*-37.0/x^38.0-55440.0*34.0*x^33.0+68172.0*-40.0/x^41.0-69654.0*37.0*x^36.0+84378.0*-43.0/x^44.0-86100.0*40.0*x^39.0+102960.0*-46.0/x^47.0-104940.0*43.0*x^42.0+124080.0*-49.0/x^50.0-126336.0*46.0*x^45.0+147900.0*-52.0/x^53.0-150450.0*49.0*x^48.0+174582.0*-55.0/x^56.0-177444.0*52.0*x^51.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-2004660.0/x^38.0-1884960.0*x^33.0-2726880.0/x^41.0-2577198.0*x^36.0-3628254.0/x^44.0-3444000.0*x^39.0-4736160.0/x^47.0-4512420.0*x^42.0-6079920.0/x^50.0-5811456.0*x^45.0-7690800.0/x^53.0-7372050.0*x^48.0-9602010.0/x^56.0-9227088.0*x^51.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/26.093023255813954/x^33.0-1.0/31.954545454545453*x^38.0+22.5*x^2.0+1.0/28.956521739130437/x^36.0-1.0/34.8936170212766*x^41.0+24.0*x^2.0+1.0/31.83673469387755/x^39.0-1.0/37.839999999999996*x^44.0+25.5*x^2.0+1.0/34.73076923076923/x^42.0-1.0/40.79245283018868*x^47.0+27.0*x^2.0+1.0/37.63636363636364/x^45.0-1.0/43.75*x^50.0+28.5*x^2.0+1.0/40.55172413793103/x^48.0-1.0/46.71186440677966*x^53.0+30.0*x^2.0+1.0/43.47540983606557/x^51.0-1.0/49.67741935483871*x^56.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/26.093023255813954/-32.0/x^32.0-1.0/31.954545454545453/39.0*x^39.0+22.5/3.0*x^3.0+1.0/28.956521739130437/-35.0/x^35.0-1.0/34.8936170212766/42.0*x^42.0+24.0/3.0*x^3.0+1.0/31.83673469387755/-38.0/x^38.0-1.0/37.839999999999996/45.0*x^45.0+25.5/3.0*x^3.0+1.0/34.73076923076923/-41.0/x^41.0-1.0/40.79245283018868/48.0*x^48.0+27.0/3.0*x^3.0+1.0/37.63636363636364/-44.0/x^44.0-1.0/43.75/51.0*x^51.0+28.5/3.0*x^3.0+1.0/40.55172413793103/-47.0/x^47.0-1.0/46.71186440677966/54.0*x^54.0+30.0/3.0*x^3.0+1.0/43.47540983606557/-50.0/x^50.0-1.0/49.67741935483871/57.0*x^57.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/834.9767441860465/x^32.0-1.0/1246.2272727272727*x^39.0+7.5*x^3.0-1.0/1013.4782608695652/x^35.0-1.0/1465.531914893617*x^42.0+8.0*x^3.0-1.0/1209.7959183673468/x^38.0-1.0/1702.7999999999997*x^45.0+8.5*x^3.0-1.0/1423.9615384615386/x^41.0-1.0/1958.0377358490566*x^48.0+9.0*x^3.0-1.0/1656.0000000000002/x^44.0-1.0/2231.25*x^51.0+9.5*x^3.0-1.0/1905.9310344827586/x^47.0-1.0/2522.4406779661017*x^54.0+10.0*x^3.0-1.0/2173.7704918032787/x^50.0-1.0/2831.6129032258063*x^57.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-2004660.0/x^38.0-1884960.0*x^33.0-2726880.0/x^41.0-2577198.0*x^36.0-3628254.0/x^44.0-3444000.0*x^39.0-4736160.0/x^47.0-4512420.0*x^42.0-6079920.0/x^50.0-5811456.0*x^45.0-7690800.0/x^53.0-7372050.0*x^48.0-9602010.0/x^56.0-9227088.0*x^51.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-2004660.0*-38.0/x^39.0-1884960.0*33.0*x^32.0-2726880.0*-41.0/x^42.0-2577198.0*36.0*x^35.0-3628254.0*-44.0/x^45.0-3444000.0*39.0*x^38.0-4736160.0*-47.0/x^48.0-4512420.0*42.0*x^41.0-6079920.0*-50.0/x^51.0-5811456.0*45.0*x^44.0-7690800.0*-53.0/x^54.0-7372050.0*48.0*x^47.0-9602010.0*-56.0/x^57.0-9227088.0*51.0*x^50.0";
 UsageCalculus.EqnSolArrayMap2[4] = "7.617708E7/x^39.0-6.220368E7*x^32.0+1.1180208E8/x^42.0-9.2779128E7*x^35.0+1.59643176E8/x^45.0-1.34316E8*x^38.0+2.2259952E8/x^48.0-1.8952164E8*x^41.0+3.03996E8/x^51.0-2.6151552E8*x^44.0+4.076124E8/x^54.0-3.538584E8*x^47.0+5.3771256E8/x^57.0-4.70581488E8*x^50.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/834.9767441860465/x^32.0-1.0/1246.2272727272727*x^39.0+7.5*x^3.0-1.0/1013.4782608695652/x^35.0-1.0/1465.531914893617*x^42.0+8.0*x^3.0-1.0/1209.7959183673468/x^38.0-1.0/1702.7999999999997*x^45.0+8.5*x^3.0-1.0/1423.9615384615386/x^41.0-1.0/1958.0377358490566*x^48.0+9.0*x^3.0-1.0/1656.0000000000002/x^44.0-1.0/2231.25*x^51.0+9.5*x^3.0-1.0/1905.9310344827586/x^47.0-1.0/2522.4406779661017*x^54.0+10.0*x^3.0-1.0/2173.7704918032787/x^50.0-1.0/2831.6129032258063*x^57.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/834.9767441860465/-31.0/x^31.0-1.0/1246.2272727272727/40.0*x^40.0+7.5/4.0*x^4.0-1.0/1013.4782608695652/-34.0/x^34.0-1.0/1465.531914893617/43.0*x^43.0+8.0/4.0*x^4.0-1.0/1209.7959183673468/-37.0/x^37.0-1.0/1702.7999999999997/46.0*x^46.0+8.5/4.0*x^4.0-1.0/1423.9615384615386/-40.0/x^40.0-1.0/1958.0377358490566/49.0*x^49.0+9.0/4.0*x^4.0-1.0/1656.0000000000002/-43.0/x^43.0-1.0/2231.25/52.0*x^52.0+9.5/4.0*x^4.0-1.0/1905.9310344827586/-46.0/x^46.0-1.0/2522.4406779661017/55.0*x^55.0+10.0/4.0*x^4.0-1.0/2173.7704918032787/-49.0/x^49.0-1.0/2831.6129032258063/58.0*x^58.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/25884.279069767443/x^31.0-1.0/49849.09090909091*x^40.0+1.875*x^4.0+1.0/34458.260869565216/x^34.0-1.0/63017.872340425536*x^43.0+2.0*x^4.0+1.0/44762.44897959183/x^37.0-1.0/78328.79999999999*x^46.0+2.125*x^4.0+1.0/56958.461538461546/x^40.0-1.0/95943.84905660378*x^49.0+2.25*x^4.0+1.0/71208.00000000001/x^43.0-1.0/116025.0*x^52.0+2.375*x^4.0+1.0/87672.8275862069/x^46.0-1.0/138734.2372881356*x^55.0+2.5*x^4.0+1.0/106514.75409836066/x^49.0-1.0/164233.54838709676*x^58.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120324() {
 UsageCalculus.TestCase = 120324;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+45*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-37+46/x^38";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "45.0+46.0/x^38.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+46.0*-38.0/x^39.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-1748.0/x^39.0";
 UsageCalculus.EqnSolArrayMap3[1] = "45.0+46.0/x^38.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "45.0*x+46.0/-37.0/x^37.0";
 UsageCalculus.EqnSolArrayMap4[1] = "45.0*x-1.2432432432432432/x^37.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-1748.0/x^39.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-1748.0*-39.0/x^40.0";
 UsageCalculus.EqnSolArrayMap2[2] = "68172.0/x^40.0";
 UsageCalculus.EqnSolArrayMap3[2] = "45.0*x-1.2432432432432432/x^37.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "45.0/2.0*x^2.0-1.2432432432432432/-36.0/x^36.0";
 UsageCalculus.EqnSolArrayMap4[2] = "22.5*x^2.0+1.0/28.956521739130437/x^36.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "68172.0/x^40.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "68172.0*-40.0/x^41.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-2726880.0/x^41.0";
 UsageCalculus.EqnSolArrayMap3[3] = "22.5*x^2.0+1.0/28.956521739130437/x^36.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "22.5/3.0*x^3.0+1.0/28.956521739130437/-35.0/x^35.0";
 UsageCalculus.EqnSolArrayMap4[3] = "7.5*x^3.0-1.0/1013.4782608695652/x^35.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-2726880.0/x^41.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-2726880.0*-41.0/x^42.0";
 UsageCalculus.EqnSolArrayMap2[4] = "1.1180208E8/x^42.0";
 UsageCalculus.EqnSolArrayMap3[4] = "7.5*x^3.0-1.0/1013.4782608695652/x^35.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "7.5/4.0*x^4.0-1.0/1013.4782608695652/-34.0/x^34.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.875*x^4.0+1.0/34458.260869565216/x^34.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120325() {
 UsageCalculus.TestCase = 120325;
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

public static void TestCaseDiff120326() {
 UsageCalculus.TestCase = 120326;
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

public static void TestCaseDiff120327() {
 UsageCalculus.TestCase = 120327;
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

public static void TestCaseDiff120328() {
 UsageCalculus.TestCase = 120328;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+49/x^41-50*x^42+51+52/x^44-53*x^45+54";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "49.0/x^41.0-50.0*x^42.0+51.0+52.0/x^44.0-53.0*x^45.0+54.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "49.0*-41.0/x^42.0-50.0*42.0*x^41.0+51.0*0.0+52.0*-44.0/x^45.0-53.0*45.0*x^44.0+54.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-2009.0/x^42.0-2100.0*x^41.0-2288.0/x^45.0-2385.0*x^44.0";
 UsageCalculus.EqnSolArrayMap3[1] = "49.0/x^41.0-50.0*x^42.0+51.0+52.0/x^44.0-53.0*x^45.0+54.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "49.0/-40.0/x^40.0-50.0/43.0*x^43.0+51.0*x+52.0/-43.0/x^43.0-53.0/46.0*x^46.0+54.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.225/x^40.0-1.1627906976744187*x^43.0+51.0*x-1.2093023255813953/x^43.0-1.1521739130434783*x^46.0+54.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-2009.0/x^42.0-2100.0*x^41.0-2288.0/x^45.0-2385.0*x^44.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-2009.0*-42.0/x^43.0-2100.0*41.0*x^40.0-2288.0*-45.0/x^46.0-2385.0*44.0*x^43.0";
 UsageCalculus.EqnSolArrayMap2[2] = "84378.0/x^43.0-86100.0*x^40.0+102960.0/x^46.0-104940.0*x^43.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.225/x^40.0-1.1627906976744187*x^43.0+51.0*x-1.2093023255813953/x^43.0-1.1521739130434783*x^46.0+54.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.225/-39.0/x^39.0-1.1627906976744187/44.0*x^44.0+51.0/2.0*x^2.0-1.2093023255813953/-42.0/x^42.0-1.1521739130434783/47.0*x^47.0+54.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/31.83673469387755/x^39.0-1.0/37.839999999999996*x^44.0+25.5*x^2.0+1.0/34.73076923076923/x^42.0-1.0/40.79245283018868*x^47.0+27.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "84378.0/x^43.0-86100.0*x^40.0+102960.0/x^46.0-104940.0*x^43.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "84378.0*-43.0/x^44.0-86100.0*40.0*x^39.0+102960.0*-46.0/x^47.0-104940.0*43.0*x^42.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-3628254.0/x^44.0-3444000.0*x^39.0-4736160.0/x^47.0-4512420.0*x^42.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/31.83673469387755/x^39.0-1.0/37.839999999999996*x^44.0+25.5*x^2.0+1.0/34.73076923076923/x^42.0-1.0/40.79245283018868*x^47.0+27.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/31.83673469387755/-38.0/x^38.0-1.0/37.839999999999996/45.0*x^45.0+25.5/3.0*x^3.0+1.0/34.73076923076923/-41.0/x^41.0-1.0/40.79245283018868/48.0*x^48.0+27.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/1209.7959183673468/x^38.0-1.0/1702.7999999999997*x^45.0+8.5*x^3.0-1.0/1423.9615384615386/x^41.0-1.0/1958.0377358490566*x^48.0+9.0*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-3628254.0/x^44.0-3444000.0*x^39.0-4736160.0/x^47.0-4512420.0*x^42.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-3628254.0*-44.0/x^45.0-3444000.0*39.0*x^38.0-4736160.0*-47.0/x^48.0-4512420.0*42.0*x^41.0";
 UsageCalculus.EqnSolArrayMap2[4] = "1.59643176E8/x^45.0-1.34316E8*x^38.0+2.2259952E8/x^48.0-1.8952164E8*x^41.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/1209.7959183673468/x^38.0-1.0/1702.7999999999997*x^45.0+8.5*x^3.0-1.0/1423.9615384615386/x^41.0-1.0/1958.0377358490566*x^48.0+9.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/1209.7959183673468/-37.0/x^37.0-1.0/1702.7999999999997/46.0*x^46.0+8.5/4.0*x^4.0-1.0/1423.9615384615386/-40.0/x^40.0-1.0/1958.0377358490566/49.0*x^49.0+9.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/44762.44897959183/x^37.0-1.0/78328.79999999999*x^46.0+2.125*x^4.0+1.0/56958.461538461546/x^40.0-1.0/95943.84905660378*x^49.0+2.25*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120329() {
 UsageCalculus.TestCase = 120329;
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

public static void TestCaseDiff120330() {
 UsageCalculus.TestCase = 120330;
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

public static void TestCaseDiff120331() {
 UsageCalculus.TestCase = 120331;
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

public static void TestCaseDiff120332() {
 UsageCalculus.TestCase = 120332;
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

public static void TestCaseDiff120333() {
 UsageCalculus.TestCase = 120333;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+54+55/x^47-56*x^48+57*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-49+58/x^50-59*x^51+60*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-52+61/x^53-62*x^54+63*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-55+64/x^56";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "54.0+55.0/x^47.0-56.0*x^48.0+57.0+58.0/x^50.0-59.0*x^51.0+60.0+61.0/x^53.0-62.0*x^54.0+63.0+64.0/x^56.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+55.0*-47.0/x^48.0-56.0*48.0*x^47.0+57.0*0.0+58.0*-50.0/x^51.0-59.0*51.0*x^50.0+60.0*0.0+61.0*-53.0/x^54.0-62.0*54.0*x^53.0+63.0*0.0+64.0*-56.0/x^57.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-2585.0/x^48.0-2688.0*x^47.0-2900.0/x^51.0-3009.0*x^50.0-3233.0/x^54.0-3348.0*x^53.0-3584.0/x^57.0";
 UsageCalculus.EqnSolArrayMap3[1] = "54.0+55.0/x^47.0-56.0*x^48.0+57.0+58.0/x^50.0-59.0*x^51.0+60.0+61.0/x^53.0-62.0*x^54.0+63.0+64.0/x^56.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "54.0*x+55.0/-46.0/x^46.0-56.0/49.0*x^49.0+57.0*x+58.0/-49.0/x^49.0-59.0/52.0*x^52.0+60.0*x+61.0/-52.0/x^52.0-62.0/55.0*x^55.0+63.0*x+64.0/-55.0/x^55.0";
 UsageCalculus.EqnSolArrayMap4[1] = "54.0*x-1.1956521739130435/x^46.0-1.1428571428571428*x^49.0+57.0*x-1.183673469387755/x^49.0-1.1346153846153846*x^52.0+60.0*x-1.1730769230769231/x^52.0-1.1272727272727272*x^55.0+63.0*x-1.1636363636363636/x^55.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-2585.0/x^48.0-2688.0*x^47.0-2900.0/x^51.0-3009.0*x^50.0-3233.0/x^54.0-3348.0*x^53.0-3584.0/x^57.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-2585.0*-48.0/x^49.0-2688.0*47.0*x^46.0-2900.0*-51.0/x^52.0-3009.0*50.0*x^49.0-3233.0*-54.0/x^55.0-3348.0*53.0*x^52.0-3584.0*-57.0/x^58.0";
 UsageCalculus.EqnSolArrayMap2[2] = "124080.0/x^49.0-126336.0*x^46.0+147900.0/x^52.0-150450.0*x^49.0+174582.0/x^55.0-177444.0*x^52.0+204288.0/x^58.0";
 UsageCalculus.EqnSolArrayMap3[2] = "54.0*x-1.1956521739130435/x^46.0-1.1428571428571428*x^49.0+57.0*x-1.183673469387755/x^49.0-1.1346153846153846*x^52.0+60.0*x-1.1730769230769231/x^52.0-1.1272727272727272*x^55.0+63.0*x-1.1636363636363636/x^55.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "54.0/2.0*x^2.0-1.1956521739130435/-45.0/x^45.0-1.1428571428571428/50.0*x^50.0+57.0/2.0*x^2.0-1.183673469387755/-48.0/x^48.0-1.1346153846153846/53.0*x^53.0+60.0/2.0*x^2.0-1.1730769230769231/-51.0/x^51.0-1.1272727272727272/56.0*x^56.0+63.0/2.0*x^2.0-1.1636363636363636/-54.0/x^54.0";
 UsageCalculus.EqnSolArrayMap4[2] = "27.0*x^2.0+1.0/37.63636363636364/x^45.0-1.0/43.75*x^50.0+28.5*x^2.0+1.0/40.55172413793103/x^48.0-1.0/46.71186440677966*x^53.0+30.0*x^2.0+1.0/43.47540983606557/x^51.0-1.0/49.67741935483871*x^56.0+31.5*x^2.0+1.0/46.40625/x^54.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "124080.0/x^49.0-126336.0*x^46.0+147900.0/x^52.0-150450.0*x^49.0+174582.0/x^55.0-177444.0*x^52.0+204288.0/x^58.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "124080.0*-49.0/x^50.0-126336.0*46.0*x^45.0+147900.0*-52.0/x^53.0-150450.0*49.0*x^48.0+174582.0*-55.0/x^56.0-177444.0*52.0*x^51.0+204288.0*-58.0/x^59.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-6079920.0/x^50.0-5811456.0*x^45.0-7690800.0/x^53.0-7372050.0*x^48.0-9602010.0/x^56.0-9227088.0*x^51.0-1.1848704E7/x^59.0";
 UsageCalculus.EqnSolArrayMap3[3] = "27.0*x^2.0+1.0/37.63636363636364/x^45.0-1.0/43.75*x^50.0+28.5*x^2.0+1.0/40.55172413793103/x^48.0-1.0/46.71186440677966*x^53.0+30.0*x^2.0+1.0/43.47540983606557/x^51.0-1.0/49.67741935483871*x^56.0+31.5*x^2.0+1.0/46.40625/x^54.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "27.0/3.0*x^3.0+1.0/37.63636363636364/-44.0/x^44.0-1.0/43.75/51.0*x^51.0+28.5/3.0*x^3.0+1.0/40.55172413793103/-47.0/x^47.0-1.0/46.71186440677966/54.0*x^54.0+30.0/3.0*x^3.0+1.0/43.47540983606557/-50.0/x^50.0-1.0/49.67741935483871/57.0*x^57.0+31.5/3.0*x^3.0+1.0/46.40625/-53.0/x^53.0";
 UsageCalculus.EqnSolArrayMap4[3] = "9.0*x^3.0-1.0/1656.0000000000002/x^44.0-1.0/2231.25*x^51.0+9.5*x^3.0-1.0/1905.9310344827586/x^47.0-1.0/2522.4406779661017*x^54.0+10.0*x^3.0-1.0/2173.7704918032787/x^50.0-1.0/2831.6129032258063*x^57.0+10.5*x^3.0-1.0/2459.53125/x^53.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-6079920.0/x^50.0-5811456.0*x^45.0-7690800.0/x^53.0-7372050.0*x^48.0-9602010.0/x^56.0-9227088.0*x^51.0-1.1848704E7/x^59.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-6079920.0*-50.0/x^51.0-5811456.0*45.0*x^44.0-7690800.0*-53.0/x^54.0-7372050.0*48.0*x^47.0-9602010.0*-56.0/x^57.0-9227088.0*51.0*x^50.0-0.0*-59.0/x^60.0";
 UsageCalculus.EqnSolArrayMap2[4] = "3.03996E8/x^51.0-2.6151552E8*x^44.0+4.076124E8/x^54.0-3.538584E8*x^47.0+5.3771256E8/x^57.0-4.70581488E8*x^50.0+0.0/x^60.0";
 UsageCalculus.EqnSolArrayMap3[4] = "9.0*x^3.0-1.0/1656.0000000000002/x^44.0-1.0/2231.25*x^51.0+9.5*x^3.0-1.0/1905.9310344827586/x^47.0-1.0/2522.4406779661017*x^54.0+10.0*x^3.0-1.0/2173.7704918032787/x^50.0-1.0/2831.6129032258063*x^57.0+10.5*x^3.0-1.0/2459.53125/x^53.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "9.0/4.0*x^4.0-1.0/1656.0000000000002/-43.0/x^43.0-1.0/2231.25/52.0*x^52.0+9.5/4.0*x^4.0-1.0/1905.9310344827586/-46.0/x^46.0-1.0/2522.4406779661017/55.0*x^55.0+10.0/4.0*x^4.0-1.0/2173.7704918032787/-49.0/x^49.0-1.0/2831.6129032258063/58.0*x^58.0+10.5/4.0*x^4.0-1.0/2459.53125/-52.0/x^52.0";
 UsageCalculus.EqnSolArrayMap4[4] = "2.25*x^4.0+1.0/71208.00000000001/x^43.0-1.0/116025.0*x^52.0+2.375*x^4.0+1.0/87672.8275862069/x^46.0-1.0/138734.2372881356*x^55.0+2.5*x^4.0+1.0/106514.75409836066/x^49.0-1.0/164233.54838709676*x^58.0+2.625*x^4.0+1.0/127895.625/x^52.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120334() {
 UsageCalculus.TestCase = 120334;
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

public static void TestCaseDiff120335() {
 UsageCalculus.TestCase = 120335;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-56*x^48+57*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-49+58/x^50-59*x^51+60*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-52+61/x^53-62*x^54+63*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-55+64/x^56-65*x^57+66+67/x^59-68*x^60";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-56.0*x^48.0+57.0+58.0/x^50.0-59.0*x^51.0+60.0+61.0/x^53.0-62.0*x^54.0+63.0+64.0/x^56.0-65.0*x^57.0+66.0+67.0/x^59.0-68.0*x^60.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-56.0*48.0*x^47.0+57.0*0.0+58.0*-50.0/x^51.0-59.0*51.0*x^50.0+60.0*0.0+61.0*-53.0/x^54.0-62.0*54.0*x^53.0+63.0*0.0+64.0*-56.0/x^57.0-65.0*57.0*x^56.0+66.0*0.0+67.0*-59.0/x^60.0-68.0*60.0*x^59.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-2688.0*x^47.0-2900.0/x^51.0-3009.0*x^50.0-3233.0/x^54.0-3348.0*x^53.0-3584.0/x^57.0-3705.0*x^56.0-3953.0/x^60.0-4080.0*x^59.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-56.0*x^48.0+57.0+58.0/x^50.0-59.0*x^51.0+60.0+61.0/x^53.0-62.0*x^54.0+63.0+64.0/x^56.0-65.0*x^57.0+66.0+67.0/x^59.0-68.0*x^60.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-56.0/49.0*x^49.0+57.0*x+58.0/-49.0/x^49.0-59.0/52.0*x^52.0+60.0*x+61.0/-52.0/x^52.0-62.0/55.0*x^55.0+63.0*x+64.0/-55.0/x^55.0-65.0/58.0*x^58.0+66.0*x+67.0/-58.0/x^58.0-68.0/61.0*x^61.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.1428571428571428*x^49.0+57.0*x-1.183673469387755/x^49.0-1.1346153846153846*x^52.0+60.0*x-1.1730769230769231/x^52.0-1.1272727272727272*x^55.0+63.0*x-1.1636363636363636/x^55.0-1.1206896551724137*x^58.0+66.0*x-1.1551724137931034/x^58.0-1.1147540983606556*x^61.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-2688.0*x^47.0-2900.0/x^51.0-3009.0*x^50.0-3233.0/x^54.0-3348.0*x^53.0-3584.0/x^57.0-3705.0*x^56.0-3953.0/x^60.0-4080.0*x^59.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-2688.0*47.0*x^46.0-2900.0*-51.0/x^52.0-3009.0*50.0*x^49.0-3233.0*-54.0/x^55.0-3348.0*53.0*x^52.0-3584.0*-57.0/x^58.0-3705.0*56.0*x^55.0-3953.0*-60.0/x^61.0-4080.0*59.0*x^58.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-126336.0*x^46.0+147900.0/x^52.0-150450.0*x^49.0+174582.0/x^55.0-177444.0*x^52.0+204288.0/x^58.0-207480.0*x^55.0+237180.0/x^61.0-240720.0*x^58.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.1428571428571428*x^49.0+57.0*x-1.183673469387755/x^49.0-1.1346153846153846*x^52.0+60.0*x-1.1730769230769231/x^52.0-1.1272727272727272*x^55.0+63.0*x-1.1636363636363636/x^55.0-1.1206896551724137*x^58.0+66.0*x-1.1551724137931034/x^58.0-1.1147540983606556*x^61.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.1428571428571428/50.0*x^50.0+57.0/2.0*x^2.0-1.183673469387755/-48.0/x^48.0-1.1346153846153846/53.0*x^53.0+60.0/2.0*x^2.0-1.1730769230769231/-51.0/x^51.0-1.1272727272727272/56.0*x^56.0+63.0/2.0*x^2.0-1.1636363636363636/-54.0/x^54.0-1.1206896551724137/59.0*x^59.0+66.0/2.0*x^2.0-1.1551724137931034/-57.0/x^57.0-1.1147540983606556/62.0*x^62.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/43.75*x^50.0+28.5*x^2.0+1.0/40.55172413793103/x^48.0-1.0/46.71186440677966*x^53.0+30.0*x^2.0+1.0/43.47540983606557/x^51.0-1.0/49.67741935483871*x^56.0+31.5*x^2.0+1.0/46.40625/x^54.0-1.0/52.64615384615385*x^59.0+33.0*x^2.0+1.0/49.343283582089555/x^57.0-1.0/55.617647058823536*x^62.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-126336.0*x^46.0+147900.0/x^52.0-150450.0*x^49.0+174582.0/x^55.0-177444.0*x^52.0+204288.0/x^58.0-207480.0*x^55.0+237180.0/x^61.0-240720.0*x^58.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-126336.0*46.0*x^45.0+147900.0*-52.0/x^53.0-150450.0*49.0*x^48.0+174582.0*-55.0/x^56.0-177444.0*52.0*x^51.0+204288.0*-58.0/x^59.0-207480.0*55.0*x^54.0+237180.0*-61.0/x^62.0-240720.0*58.0*x^57.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-5811456.0*x^45.0-7690800.0/x^53.0-7372050.0*x^48.0-9602010.0/x^56.0-9227088.0*x^51.0-1.1848704E7/x^59.0-1.14114E7*x^54.0-1.446798E7/x^62.0-1.396176E7*x^57.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/43.75*x^50.0+28.5*x^2.0+1.0/40.55172413793103/x^48.0-1.0/46.71186440677966*x^53.0+30.0*x^2.0+1.0/43.47540983606557/x^51.0-1.0/49.67741935483871*x^56.0+31.5*x^2.0+1.0/46.40625/x^54.0-1.0/52.64615384615385*x^59.0+33.0*x^2.0+1.0/49.343283582089555/x^57.0-1.0/55.617647058823536*x^62.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/43.75/51.0*x^51.0+28.5/3.0*x^3.0+1.0/40.55172413793103/-47.0/x^47.0-1.0/46.71186440677966/54.0*x^54.0+30.0/3.0*x^3.0+1.0/43.47540983606557/-50.0/x^50.0-1.0/49.67741935483871/57.0*x^57.0+31.5/3.0*x^3.0+1.0/46.40625/-53.0/x^53.0-1.0/52.64615384615385/60.0*x^60.0+33.0/3.0*x^3.0+1.0/49.343283582089555/-56.0/x^56.0-1.0/55.617647058823536/63.0*x^63.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/2231.25*x^51.0+9.5*x^3.0-1.0/1905.9310344827586/x^47.0-1.0/2522.4406779661017*x^54.0+10.0*x^3.0-1.0/2173.7704918032787/x^50.0-1.0/2831.6129032258063*x^57.0+10.5*x^3.0-1.0/2459.53125/x^53.0-1.0/3158.769230769231*x^60.0+11.0*x^3.0-1.0/2763.223880597015/x^56.0-1.0/3503.911764705883*x^63.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-5811456.0*x^45.0-7690800.0/x^53.0-7372050.0*x^48.0-9602010.0/x^56.0-9227088.0*x^51.0-1.1848704E7/x^59.0-1.14114E7*x^54.0-1.446798E7/x^62.0-1.396176E7*x^57.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-5811456.0*45.0*x^44.0-7690800.0*-53.0/x^54.0-7372050.0*48.0*x^47.0-9602010.0*-56.0/x^57.0-9227088.0*51.0*x^50.0-0.0*-59.0/x^60.0-54.0*x^53.0-0.0*-62.0/x^63.0-0.0*57.0*x^56.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-2.6151552E8*x^44.0+4.076124E8/x^54.0-3.538584E8*x^47.0+5.3771256E8/x^57.0-4.70581488E8*x^50.0+0.0/x^60.0-54.0*x^53.0+0.0/x^63.0-0.0*x^56.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/2231.25*x^51.0+9.5*x^3.0-1.0/1905.9310344827586/x^47.0-1.0/2522.4406779661017*x^54.0+10.0*x^3.0-1.0/2173.7704918032787/x^50.0-1.0/2831.6129032258063*x^57.0+10.5*x^3.0-1.0/2459.53125/x^53.0-1.0/3158.769230769231*x^60.0+11.0*x^3.0-1.0/2763.223880597015/x^56.0-1.0/3503.911764705883*x^63.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/2231.25/52.0*x^52.0+9.5/4.0*x^4.0-1.0/1905.9310344827586/-46.0/x^46.0-1.0/2522.4406779661017/55.0*x^55.0+10.0/4.0*x^4.0-1.0/2173.7704918032787/-49.0/x^49.0-1.0/2831.6129032258063/58.0*x^58.0+10.5/4.0*x^4.0-1.0/2459.53125/-52.0/x^52.0-1.0/3158.769230769231/61.0*x^61.0+11.0/4.0*x^4.0-1.0/2763.223880597015/-55.0/x^55.0-1.0/3503.911764705883/64.0*x^64.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/116025.0*x^52.0+2.375*x^4.0+1.0/87672.8275862069/x^46.0-1.0/138734.2372881356*x^55.0+2.5*x^4.0+1.0/106514.75409836066/x^49.0-1.0/164233.54838709676*x^58.0+2.625*x^4.0+1.0/127895.625/x^52.0-1.0/192684.9230769231*x^61.0+2.75*x^4.0+1.0/151977.31343283583/x^55.0-1.0/224250.3529411765*x^64.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120336() {
 UsageCalculus.TestCase = 120336;
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

public static void TestCaseDiff120337() {
 UsageCalculus.TestCase = 120337;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+58/x^50-59*x^51+60*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-52+61/x^53-62*x^54+63*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-55+64/x^56-65*x^57+66+67/x^59-68*x^60+69+70/x^62-71*x^63+72*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-64";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "58.0/x^50.0-59.0*x^51.0+60.0+61.0/x^53.0-62.0*x^54.0+63.0+64.0/x^56.0-65.0*x^57.0+66.0+67.0/x^59.0-68.0*x^60.0+69.0+70.0/x^62.0-71.0*x^63.0+72.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "58.0*-50.0/x^51.0-59.0*51.0*x^50.0+60.0*0.0+61.0*-53.0/x^54.0-62.0*54.0*x^53.0+63.0*0.0+64.0*-56.0/x^57.0-65.0*57.0*x^56.0+66.0*0.0+67.0*-59.0/x^60.0-68.0*60.0*x^59.0+69.0*0.0+70.0*-62.0/x^63.0-71.0*63.0*x^62.0+72.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-2900.0/x^51.0-3009.0*x^50.0-3233.0/x^54.0-3348.0*x^53.0-3584.0/x^57.0-3705.0*x^56.0-3953.0/x^60.0-4080.0*x^59.0-4340.0/x^63.0-4473.0*x^62.0";
 UsageCalculus.EqnSolArrayMap3[1] = "58.0/x^50.0-59.0*x^51.0+60.0+61.0/x^53.0-62.0*x^54.0+63.0+64.0/x^56.0-65.0*x^57.0+66.0+67.0/x^59.0-68.0*x^60.0+69.0+70.0/x^62.0-71.0*x^63.0+72.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "58.0/-49.0/x^49.0-59.0/52.0*x^52.0+60.0*x+61.0/-52.0/x^52.0-62.0/55.0*x^55.0+63.0*x+64.0/-55.0/x^55.0-65.0/58.0*x^58.0+66.0*x+67.0/-58.0/x^58.0-68.0/61.0*x^61.0+69.0*x+70.0/-61.0/x^61.0-71.0/64.0*x^64.0+72.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.183673469387755/x^49.0-1.1346153846153846*x^52.0+60.0*x-1.1730769230769231/x^52.0-1.1272727272727272*x^55.0+63.0*x-1.1636363636363636/x^55.0-1.1206896551724137*x^58.0+66.0*x-1.1551724137931034/x^58.0-1.1147540983606556*x^61.0+69.0*x-1.1475409836065573/x^61.0-1.109375*x^64.0+72.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-2900.0/x^51.0-3009.0*x^50.0-3233.0/x^54.0-3348.0*x^53.0-3584.0/x^57.0-3705.0*x^56.0-3953.0/x^60.0-4080.0*x^59.0-4340.0/x^63.0-4473.0*x^62.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-2900.0*-51.0/x^52.0-3009.0*50.0*x^49.0-3233.0*-54.0/x^55.0-3348.0*53.0*x^52.0-3584.0*-57.0/x^58.0-3705.0*56.0*x^55.0-3953.0*-60.0/x^61.0-4080.0*59.0*x^58.0-4340.0*-63.0/x^64.0-4473.0*62.0*x^61.0";
 UsageCalculus.EqnSolArrayMap2[2] = "147900.0/x^52.0-150450.0*x^49.0+174582.0/x^55.0-177444.0*x^52.0+204288.0/x^58.0-207480.0*x^55.0+237180.0/x^61.0-240720.0*x^58.0+273420.0/x^64.0-277326.0*x^61.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.183673469387755/x^49.0-1.1346153846153846*x^52.0+60.0*x-1.1730769230769231/x^52.0-1.1272727272727272*x^55.0+63.0*x-1.1636363636363636/x^55.0-1.1206896551724137*x^58.0+66.0*x-1.1551724137931034/x^58.0-1.1147540983606556*x^61.0+69.0*x-1.1475409836065573/x^61.0-1.109375*x^64.0+72.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.183673469387755/-48.0/x^48.0-1.1346153846153846/53.0*x^53.0+60.0/2.0*x^2.0-1.1730769230769231/-51.0/x^51.0-1.1272727272727272/56.0*x^56.0+63.0/2.0*x^2.0-1.1636363636363636/-54.0/x^54.0-1.1206896551724137/59.0*x^59.0+66.0/2.0*x^2.0-1.1551724137931034/-57.0/x^57.0-1.1147540983606556/62.0*x^62.0+69.0/2.0*x^2.0-1.1475409836065573/-60.0/x^60.0-1.109375/65.0*x^65.0+72.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/40.55172413793103/x^48.0-1.0/46.71186440677966*x^53.0+30.0*x^2.0+1.0/43.47540983606557/x^51.0-1.0/49.67741935483871*x^56.0+31.5*x^2.0+1.0/46.40625/x^54.0-1.0/52.64615384615385*x^59.0+33.0*x^2.0+1.0/49.343283582089555/x^57.0-1.0/55.617647058823536*x^62.0+34.5*x^2.0+1.0/52.28571428571429/x^60.0-1.0/58.59154929577465*x^65.0+36.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "147900.0/x^52.0-150450.0*x^49.0+174582.0/x^55.0-177444.0*x^52.0+204288.0/x^58.0-207480.0*x^55.0+237180.0/x^61.0-240720.0*x^58.0+273420.0/x^64.0-277326.0*x^61.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "147900.0*-52.0/x^53.0-150450.0*49.0*x^48.0+174582.0*-55.0/x^56.0-177444.0*52.0*x^51.0+204288.0*-58.0/x^59.0-207480.0*55.0*x^54.0+237180.0*-61.0/x^62.0-240720.0*58.0*x^57.0+273420.0*-64.0/x^65.0-277326.0*61.0*x^60.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-7690800.0/x^53.0-7372050.0*x^48.0-9602010.0/x^56.0-9227088.0*x^51.0-1.1848704E7/x^59.0-1.14114E7*x^54.0-1.446798E7/x^62.0-1.396176E7*x^57.0-1.749888E7/x^65.0-1.6916886E7*x^60.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/40.55172413793103/x^48.0-1.0/46.71186440677966*x^53.0+30.0*x^2.0+1.0/43.47540983606557/x^51.0-1.0/49.67741935483871*x^56.0+31.5*x^2.0+1.0/46.40625/x^54.0-1.0/52.64615384615385*x^59.0+33.0*x^2.0+1.0/49.343283582089555/x^57.0-1.0/55.617647058823536*x^62.0+34.5*x^2.0+1.0/52.28571428571429/x^60.0-1.0/58.59154929577465*x^65.0+36.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/40.55172413793103/-47.0/x^47.0-1.0/46.71186440677966/54.0*x^54.0+30.0/3.0*x^3.0+1.0/43.47540983606557/-50.0/x^50.0-1.0/49.67741935483871/57.0*x^57.0+31.5/3.0*x^3.0+1.0/46.40625/-53.0/x^53.0-1.0/52.64615384615385/60.0*x^60.0+33.0/3.0*x^3.0+1.0/49.343283582089555/-56.0/x^56.0-1.0/55.617647058823536/63.0*x^63.0+34.5/3.0*x^3.0+1.0/52.28571428571429/-59.0/x^59.0-1.0/58.59154929577465/66.0*x^66.0+36.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/1905.9310344827586/x^47.0-1.0/2522.4406779661017*x^54.0+10.0*x^3.0-1.0/2173.7704918032787/x^50.0-1.0/2831.6129032258063*x^57.0+10.5*x^3.0-1.0/2459.53125/x^53.0-1.0/3158.769230769231*x^60.0+11.0*x^3.0-1.0/2763.223880597015/x^56.0-1.0/3503.911764705883*x^63.0+11.5*x^3.0-1.0/3084.857142857143/x^59.0-1.0/3867.042253521127*x^66.0+12.0*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-7690800.0/x^53.0-7372050.0*x^48.0-9602010.0/x^56.0-9227088.0*x^51.0-1.1848704E7/x^59.0-1.14114E7*x^54.0-1.446798E7/x^62.0-1.396176E7*x^57.0-1.749888E7/x^65.0-1.6916886E7*x^60.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-7690800.0*-53.0/x^54.0-7372050.0*48.0*x^47.0-9602010.0*-56.0/x^57.0-9227088.0*51.0*x^50.0-0.0*-59.0/x^60.0-54.0*x^53.0-0.0*-62.0/x^63.0-57.0*x^56.0-0.0*-65.0/x^66.0-0.0*60.0*x^59.0";
 UsageCalculus.EqnSolArrayMap2[4] = "4.076124E8/x^54.0-3.538584E8*x^47.0+5.3771256E8/x^57.0-4.70581488E8*x^50.0+0.0/x^60.0-54.0*x^53.0+0.0/x^63.0-57.0*x^56.0+0.0/x^66.0-0.0*x^59.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/1905.9310344827586/x^47.0-1.0/2522.4406779661017*x^54.0+10.0*x^3.0-1.0/2173.7704918032787/x^50.0-1.0/2831.6129032258063*x^57.0+10.5*x^3.0-1.0/2459.53125/x^53.0-1.0/3158.769230769231*x^60.0+11.0*x^3.0-1.0/2763.223880597015/x^56.0-1.0/3503.911764705883*x^63.0+11.5*x^3.0-1.0/3084.857142857143/x^59.0-1.0/3867.042253521127*x^66.0+12.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/1905.9310344827586/-46.0/x^46.0-1.0/2522.4406779661017/55.0*x^55.0+10.0/4.0*x^4.0-1.0/2173.7704918032787/-49.0/x^49.0-1.0/2831.6129032258063/58.0*x^58.0+10.5/4.0*x^4.0-1.0/2459.53125/-52.0/x^52.0-1.0/3158.769230769231/61.0*x^61.0+11.0/4.0*x^4.0-1.0/2763.223880597015/-55.0/x^55.0-1.0/3503.911764705883/64.0*x^64.0+11.5/4.0*x^4.0-1.0/3084.857142857143/-58.0/x^58.0-1.0/3867.042253521127/67.0*x^67.0+12.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/87672.8275862069/x^46.0-1.0/138734.2372881356*x^55.0+2.5*x^4.0+1.0/106514.75409836066/x^49.0-1.0/164233.54838709676*x^58.0+2.625*x^4.0+1.0/127895.625/x^52.0-1.0/192684.9230769231*x^61.0+2.75*x^4.0+1.0/151977.31343283583/x^55.0-1.0/224250.3529411765*x^64.0+2.875*x^4.0+1.0/178921.7142857143/x^58.0-1.0/259091.8309859155*x^67.0+3.0*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120338() {
 UsageCalculus.TestCase = 120338;
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

public static void TestCaseDiff120339() {
 UsageCalculus.TestCase = 120339;
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

public static void TestCaseDiff120340() {
 UsageCalculus.TestCase = 120340;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+61/x^53-62*x^54+63*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-55+64/x^56-65*x^57+66+67/x^59-68*x^60+69+70/x^62-71*x^63+72*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-64+73/x^65-74*x^66+75*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-67+76/x^68-77*x^69+78*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-70";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "61.0/x^53.0-62.0*x^54.0+63.0+64.0/x^56.0-65.0*x^57.0+66.0+67.0/x^59.0-68.0*x^60.0+69.0+70.0/x^62.0-71.0*x^63.0+72.0+73.0/x^65.0-74.0*x^66.0+75.0+76.0/x^68.0-77.0*x^69.0+78.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "61.0*-53.0/x^54.0-62.0*54.0*x^53.0+63.0*0.0+64.0*-56.0/x^57.0-65.0*57.0*x^56.0+66.0*0.0+67.0*-59.0/x^60.0-68.0*60.0*x^59.0+69.0*0.0+70.0*-62.0/x^63.0-71.0*63.0*x^62.0+72.0*0.0+73.0*-65.0/x^66.0-74.0*66.0*x^65.0+75.0*0.0+76.0*-68.0/x^69.0-77.0*69.0*x^68.0+78.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-3233.0/x^54.0-3348.0*x^53.0-3584.0/x^57.0-3705.0*x^56.0-3953.0/x^60.0-4080.0*x^59.0-4340.0/x^63.0-4473.0*x^62.0-4745.0/x^66.0-4884.0*x^65.0-5168.0/x^69.0-5313.0*x^68.0";
 UsageCalculus.EqnSolArrayMap3[1] = "61.0/x^53.0-62.0*x^54.0+63.0+64.0/x^56.0-65.0*x^57.0+66.0+67.0/x^59.0-68.0*x^60.0+69.0+70.0/x^62.0-71.0*x^63.0+72.0+73.0/x^65.0-74.0*x^66.0+75.0+76.0/x^68.0-77.0*x^69.0+78.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "61.0/-52.0/x^52.0-62.0/55.0*x^55.0+63.0*x+64.0/-55.0/x^55.0-65.0/58.0*x^58.0+66.0*x+67.0/-58.0/x^58.0-68.0/61.0*x^61.0+69.0*x+70.0/-61.0/x^61.0-71.0/64.0*x^64.0+72.0*x+73.0/-64.0/x^64.0-74.0/67.0*x^67.0+75.0*x+76.0/-67.0/x^67.0-77.0/70.0*x^70.0+78.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.1730769230769231/x^52.0-1.1272727272727272*x^55.0+63.0*x-1.1636363636363636/x^55.0-1.1206896551724137*x^58.0+66.0*x-1.1551724137931034/x^58.0-1.1147540983606556*x^61.0+69.0*x-1.1475409836065573/x^61.0-1.109375*x^64.0+72.0*x-1.140625/x^64.0-1.1044776119402986*x^67.0+75.0*x-1.1343283582089552/x^67.0-1.1*x^70.0+78.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-3233.0/x^54.0-3348.0*x^53.0-3584.0/x^57.0-3705.0*x^56.0-3953.0/x^60.0-4080.0*x^59.0-4340.0/x^63.0-4473.0*x^62.0-4745.0/x^66.0-4884.0*x^65.0-5168.0/x^69.0-5313.0*x^68.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-3233.0*-54.0/x^55.0-3348.0*53.0*x^52.0-3584.0*-57.0/x^58.0-3705.0*56.0*x^55.0-3953.0*-60.0/x^61.0-4080.0*59.0*x^58.0-4340.0*-63.0/x^64.0-4473.0*62.0*x^61.0-4745.0*-66.0/x^67.0-4884.0*65.0*x^64.0-5168.0*-69.0/x^70.0-5313.0*68.0*x^67.0";
 UsageCalculus.EqnSolArrayMap2[2] = "174582.0/x^55.0-177444.0*x^52.0+204288.0/x^58.0-207480.0*x^55.0+237180.0/x^61.0-240720.0*x^58.0+273420.0/x^64.0-277326.0*x^61.0+313170.0/x^67.0-317460.0*x^64.0+356592.0/x^70.0-361284.0*x^67.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.1730769230769231/x^52.0-1.1272727272727272*x^55.0+63.0*x-1.1636363636363636/x^55.0-1.1206896551724137*x^58.0+66.0*x-1.1551724137931034/x^58.0-1.1147540983606556*x^61.0+69.0*x-1.1475409836065573/x^61.0-1.109375*x^64.0+72.0*x-1.140625/x^64.0-1.1044776119402986*x^67.0+75.0*x-1.1343283582089552/x^67.0-1.1*x^70.0+78.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.1730769230769231/-51.0/x^51.0-1.1272727272727272/56.0*x^56.0+63.0/2.0*x^2.0-1.1636363636363636/-54.0/x^54.0-1.1206896551724137/59.0*x^59.0+66.0/2.0*x^2.0-1.1551724137931034/-57.0/x^57.0-1.1147540983606556/62.0*x^62.0+69.0/2.0*x^2.0-1.1475409836065573/-60.0/x^60.0-1.109375/65.0*x^65.0+72.0/2.0*x^2.0-1.140625/-63.0/x^63.0-1.1044776119402986/68.0*x^68.0+75.0/2.0*x^2.0-1.1343283582089552/-66.0/x^66.0-1.1/71.0*x^71.0+78.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/43.47540983606557/x^51.0-1.0/49.67741935483871*x^56.0+31.5*x^2.0+1.0/46.40625/x^54.0-1.0/52.64615384615385*x^59.0+33.0*x^2.0+1.0/49.343283582089555/x^57.0-1.0/55.617647058823536*x^62.0+34.5*x^2.0+1.0/52.28571428571429/x^60.0-1.0/58.59154929577465*x^65.0+36.0*x^2.0+1.0/55.23287671232877/x^63.0-1.0/61.567567567567565*x^68.0+37.5*x^2.0+1.0/58.184210526315795/x^66.0-1.0/64.54545454545455*x^71.0+39.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "174582.0/x^55.0-177444.0*x^52.0+204288.0/x^58.0-207480.0*x^55.0+237180.0/x^61.0-240720.0*x^58.0+273420.0/x^64.0-277326.0*x^61.0+313170.0/x^67.0-317460.0*x^64.0+356592.0/x^70.0-361284.0*x^67.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "174582.0*-55.0/x^56.0-177444.0*52.0*x^51.0+204288.0*-58.0/x^59.0-207480.0*55.0*x^54.0+237180.0*-61.0/x^62.0-240720.0*58.0*x^57.0+273420.0*-64.0/x^65.0-277326.0*61.0*x^60.0+313170.0*-67.0/x^68.0-317460.0*64.0*x^63.0+356592.0*-70.0/x^71.0-361284.0*67.0*x^66.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-9602010.0/x^56.0-9227088.0*x^51.0-1.1848704E7/x^59.0-1.14114E7*x^54.0-1.446798E7/x^62.0-1.396176E7*x^57.0-1.749888E7/x^65.0-1.6916886E7*x^60.0-2.098239E7/x^68.0-2.031744E7*x^63.0-2.496144E7/x^71.0-2.4206028E7*x^66.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/43.47540983606557/x^51.0-1.0/49.67741935483871*x^56.0+31.5*x^2.0+1.0/46.40625/x^54.0-1.0/52.64615384615385*x^59.0+33.0*x^2.0+1.0/49.343283582089555/x^57.0-1.0/55.617647058823536*x^62.0+34.5*x^2.0+1.0/52.28571428571429/x^60.0-1.0/58.59154929577465*x^65.0+36.0*x^2.0+1.0/55.23287671232877/x^63.0-1.0/61.567567567567565*x^68.0+37.5*x^2.0+1.0/58.184210526315795/x^66.0-1.0/64.54545454545455*x^71.0+39.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/43.47540983606557/-50.0/x^50.0-1.0/49.67741935483871/57.0*x^57.0+31.5/3.0*x^3.0+1.0/46.40625/-53.0/x^53.0-1.0/52.64615384615385/60.0*x^60.0+33.0/3.0*x^3.0+1.0/49.343283582089555/-56.0/x^56.0-1.0/55.617647058823536/63.0*x^63.0+34.5/3.0*x^3.0+1.0/52.28571428571429/-59.0/x^59.0-1.0/58.59154929577465/66.0*x^66.0+36.0/3.0*x^3.0+1.0/55.23287671232877/-62.0/x^62.0-1.0/61.567567567567565/69.0*x^69.0+37.5/3.0*x^3.0+1.0/58.184210526315795/-65.0/x^65.0-1.0/64.54545454545455/72.0*x^72.0+39.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/2173.7704918032787/x^50.0-1.0/2831.6129032258063*x^57.0+10.5*x^3.0-1.0/2459.53125/x^53.0-1.0/3158.769230769231*x^60.0+11.0*x^3.0-1.0/2763.223880597015/x^56.0-1.0/3503.911764705883*x^63.0+11.5*x^3.0-1.0/3084.857142857143/x^59.0-1.0/3867.042253521127*x^66.0+12.0*x^3.0-1.0/3424.4383561643835/x^62.0-1.0/4248.162162162162*x^69.0+12.5*x^3.0-1.0/3781.9736842105267/x^65.0-1.0/4647.272727272727*x^72.0+13.0*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-9602010.0/x^56.0-9227088.0*x^51.0-1.1848704E7/x^59.0-1.14114E7*x^54.0-1.446798E7/x^62.0-1.396176E7*x^57.0-1.749888E7/x^65.0-1.6916886E7*x^60.0-2.098239E7/x^68.0-2.031744E7*x^63.0-2.496144E7/x^71.0-2.4206028E7*x^66.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-9602010.0*-56.0/x^57.0-9227088.0*51.0*x^50.0-0.0*-59.0/x^60.0-54.0*x^53.0-0.0*-62.0/x^63.0-57.0*x^56.0-0.0*-65.0/x^66.0-60.0*x^59.0-0.0*-68.0/x^69.0-63.0*x^62.0-0.0*-71.0/x^72.0-0.0*66.0*x^65.0";
 UsageCalculus.EqnSolArrayMap2[4] = "5.3771256E8/x^57.0-4.70581488E8*x^50.0+0.0/x^60.0-54.0*x^53.0+0.0/x^63.0-57.0*x^56.0+0.0/x^66.0-60.0*x^59.0+0.0/x^69.0-63.0*x^62.0+0.0/x^72.0-0.0*x^65.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/2173.7704918032787/x^50.0-1.0/2831.6129032258063*x^57.0+10.5*x^3.0-1.0/2459.53125/x^53.0-1.0/3158.769230769231*x^60.0+11.0*x^3.0-1.0/2763.223880597015/x^56.0-1.0/3503.911764705883*x^63.0+11.5*x^3.0-1.0/3084.857142857143/x^59.0-1.0/3867.042253521127*x^66.0+12.0*x^3.0-1.0/3424.4383561643835/x^62.0-1.0/4248.162162162162*x^69.0+12.5*x^3.0-1.0/3781.9736842105267/x^65.0-1.0/4647.272727272727*x^72.0+13.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/2173.7704918032787/-49.0/x^49.0-1.0/2831.6129032258063/58.0*x^58.0+10.5/4.0*x^4.0-1.0/2459.53125/-52.0/x^52.0-1.0/3158.769230769231/61.0*x^61.0+11.0/4.0*x^4.0-1.0/2763.223880597015/-55.0/x^55.0-1.0/3503.911764705883/64.0*x^64.0+11.5/4.0*x^4.0-1.0/3084.857142857143/-58.0/x^58.0-1.0/3867.042253521127/67.0*x^67.0+12.0/4.0*x^4.0-1.0/3424.4383561643835/-61.0/x^61.0-1.0/4248.162162162162/70.0*x^70.0+12.5/4.0*x^4.0-1.0/3781.9736842105267/-64.0/x^64.0-1.0/4647.272727272727/73.0*x^73.0+13.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/106514.75409836066/x^49.0-1.0/164233.54838709676*x^58.0+2.625*x^4.0+1.0/127895.625/x^52.0-1.0/192684.9230769231*x^61.0+2.75*x^4.0+1.0/151977.31343283583/x^55.0-1.0/224250.3529411765*x^64.0+2.875*x^4.0+1.0/178921.7142857143/x^58.0-1.0/259091.8309859155*x^67.0+3.0*x^4.0+1.0/208890.7397260274/x^61.0-1.0/297371.3513513513*x^70.0+3.125*x^4.0+1.0/242046.3157894737/x^64.0-1.0/339250.90909090906*x^73.0+3.25*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120341() {
 UsageCalculus.TestCase = 120341;
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

public static void TestCaseDiff120342() {
 UsageCalculus.TestCase = 120342;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+63*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-55+64/x^56-65*x^57+66+67/x^59-68*x^60+69+70/x^62-71*x^63+72*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-64+73/x^65-74*x^66+75*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-67+76/x^68-77*x^69+78*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-70+79/x^71-80*x^72+81+82/x^74";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "63.0+64.0/x^56.0-65.0*x^57.0+66.0+67.0/x^59.0-68.0*x^60.0+69.0+70.0/x^62.0-71.0*x^63.0+72.0+73.0/x^65.0-74.0*x^66.0+75.0+76.0/x^68.0-77.0*x^69.0+78.0+79.0/x^71.0-80.0*x^72.0+81.0+82.0/x^74.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+64.0*-56.0/x^57.0-65.0*57.0*x^56.0+66.0*0.0+67.0*-59.0/x^60.0-68.0*60.0*x^59.0+69.0*0.0+70.0*-62.0/x^63.0-71.0*63.0*x^62.0+72.0*0.0+73.0*-65.0/x^66.0-74.0*66.0*x^65.0+75.0*0.0+76.0*-68.0/x^69.0-77.0*69.0*x^68.0+78.0*0.0+79.0*-71.0/x^72.0-80.0*72.0*x^71.0+81.0*0.0+82.0*-74.0/x^75.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-3584.0/x^57.0-3705.0*x^56.0-3953.0/x^60.0-4080.0*x^59.0-4340.0/x^63.0-4473.0*x^62.0-4745.0/x^66.0-4884.0*x^65.0-5168.0/x^69.0-5313.0*x^68.0-5609.0/x^72.0-5760.0*x^71.0-6068.0/x^75.0";
 UsageCalculus.EqnSolArrayMap3[1] = "63.0+64.0/x^56.0-65.0*x^57.0+66.0+67.0/x^59.0-68.0*x^60.0+69.0+70.0/x^62.0-71.0*x^63.0+72.0+73.0/x^65.0-74.0*x^66.0+75.0+76.0/x^68.0-77.0*x^69.0+78.0+79.0/x^71.0-80.0*x^72.0+81.0+82.0/x^74.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "63.0*x+64.0/-55.0/x^55.0-65.0/58.0*x^58.0+66.0*x+67.0/-58.0/x^58.0-68.0/61.0*x^61.0+69.0*x+70.0/-61.0/x^61.0-71.0/64.0*x^64.0+72.0*x+73.0/-64.0/x^64.0-74.0/67.0*x^67.0+75.0*x+76.0/-67.0/x^67.0-77.0/70.0*x^70.0+78.0*x+79.0/-70.0/x^70.0-80.0/73.0*x^73.0+81.0*x+82.0/-73.0/x^73.0";
 UsageCalculus.EqnSolArrayMap4[1] = "63.0*x-1.1636363636363636/x^55.0-1.1206896551724137*x^58.0+66.0*x-1.1551724137931034/x^58.0-1.1147540983606556*x^61.0+69.0*x-1.1475409836065573/x^61.0-1.109375*x^64.0+72.0*x-1.140625/x^64.0-1.1044776119402986*x^67.0+75.0*x-1.1343283582089552/x^67.0-1.1*x^70.0+78.0*x-1.1285714285714286/x^70.0-1.095890410958904*x^73.0+81.0*x-1.1232876712328768/x^73.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-3584.0/x^57.0-3705.0*x^56.0-3953.0/x^60.0-4080.0*x^59.0-4340.0/x^63.0-4473.0*x^62.0-4745.0/x^66.0-4884.0*x^65.0-5168.0/x^69.0-5313.0*x^68.0-5609.0/x^72.0-5760.0*x^71.0-6068.0/x^75.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-3584.0*-57.0/x^58.0-3705.0*56.0*x^55.0-3953.0*-60.0/x^61.0-4080.0*59.0*x^58.0-4340.0*-63.0/x^64.0-4473.0*62.0*x^61.0-4745.0*-66.0/x^67.0-4884.0*65.0*x^64.0-5168.0*-69.0/x^70.0-5313.0*68.0*x^67.0-5609.0*-72.0/x^73.0-5760.0*71.0*x^70.0-6068.0*-75.0/x^76.0";
 UsageCalculus.EqnSolArrayMap2[2] = "204288.0/x^58.0-207480.0*x^55.0+237180.0/x^61.0-240720.0*x^58.0+273420.0/x^64.0-277326.0*x^61.0+313170.0/x^67.0-317460.0*x^64.0+356592.0/x^70.0-361284.0*x^67.0+403848.0/x^73.0-408960.0*x^70.0+455100.0/x^76.0";
 UsageCalculus.EqnSolArrayMap3[2] = "63.0*x-1.1636363636363636/x^55.0-1.1206896551724137*x^58.0+66.0*x-1.1551724137931034/x^58.0-1.1147540983606556*x^61.0+69.0*x-1.1475409836065573/x^61.0-1.109375*x^64.0+72.0*x-1.140625/x^64.0-1.1044776119402986*x^67.0+75.0*x-1.1343283582089552/x^67.0-1.1*x^70.0+78.0*x-1.1285714285714286/x^70.0-1.095890410958904*x^73.0+81.0*x-1.1232876712328768/x^73.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "63.0/2.0*x^2.0-1.1636363636363636/-54.0/x^54.0-1.1206896551724137/59.0*x^59.0+66.0/2.0*x^2.0-1.1551724137931034/-57.0/x^57.0-1.1147540983606556/62.0*x^62.0+69.0/2.0*x^2.0-1.1475409836065573/-60.0/x^60.0-1.109375/65.0*x^65.0+72.0/2.0*x^2.0-1.140625/-63.0/x^63.0-1.1044776119402986/68.0*x^68.0+75.0/2.0*x^2.0-1.1343283582089552/-66.0/x^66.0-1.1/71.0*x^71.0+78.0/2.0*x^2.0-1.1285714285714286/-69.0/x^69.0-1.095890410958904/74.0*x^74.0+81.0/2.0*x^2.0-1.1232876712328768/-72.0/x^72.0";
 UsageCalculus.EqnSolArrayMap4[2] = "31.5*x^2.0+1.0/46.40625/x^54.0-1.0/52.64615384615385*x^59.0+33.0*x^2.0+1.0/49.343283582089555/x^57.0-1.0/55.617647058823536*x^62.0+34.5*x^2.0+1.0/52.28571428571429/x^60.0-1.0/58.59154929577465*x^65.0+36.0*x^2.0+1.0/55.23287671232877/x^63.0-1.0/61.567567567567565*x^68.0+37.5*x^2.0+1.0/58.184210526315795/x^66.0-1.0/64.54545454545455*x^71.0+39.0*x^2.0+1.0/61.139240506329116/x^69.0-1.0/67.525*x^74.0+40.5*x^2.0+1.0/64.09756097560975/x^72.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "204288.0/x^58.0-207480.0*x^55.0+237180.0/x^61.0-240720.0*x^58.0+273420.0/x^64.0-277326.0*x^61.0+313170.0/x^67.0-317460.0*x^64.0+356592.0/x^70.0-361284.0*x^67.0+403848.0/x^73.0-408960.0*x^70.0+455100.0/x^76.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "204288.0*-58.0/x^59.0-207480.0*55.0*x^54.0+237180.0*-61.0/x^62.0-240720.0*58.0*x^57.0+273420.0*-64.0/x^65.0-277326.0*61.0*x^60.0+313170.0*-67.0/x^68.0-317460.0*64.0*x^63.0+356592.0*-70.0/x^71.0-361284.0*67.0*x^66.0+403848.0*-73.0/x^74.0-408960.0*70.0*x^69.0+455100.0*-76.0/x^77.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-1.1848704E7/x^59.0-1.14114E7*x^54.0-1.446798E7/x^62.0-1.396176E7*x^57.0-1.749888E7/x^65.0-1.6916886E7*x^60.0-2.098239E7/x^68.0-2.031744E7*x^63.0-2.496144E7/x^71.0-2.4206028E7*x^66.0-2.9480904E7/x^74.0-2.86272E7*x^69.0-3.45876E7/x^77.0";
 UsageCalculus.EqnSolArrayMap3[3] = "31.5*x^2.0+1.0/46.40625/x^54.0-1.0/52.64615384615385*x^59.0+33.0*x^2.0+1.0/49.343283582089555/x^57.0-1.0/55.617647058823536*x^62.0+34.5*x^2.0+1.0/52.28571428571429/x^60.0-1.0/58.59154929577465*x^65.0+36.0*x^2.0+1.0/55.23287671232877/x^63.0-1.0/61.567567567567565*x^68.0+37.5*x^2.0+1.0/58.184210526315795/x^66.0-1.0/64.54545454545455*x^71.0+39.0*x^2.0+1.0/61.139240506329116/x^69.0-1.0/67.525*x^74.0+40.5*x^2.0+1.0/64.09756097560975/x^72.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "31.5/3.0*x^3.0+1.0/46.40625/-53.0/x^53.0-1.0/52.64615384615385/60.0*x^60.0+33.0/3.0*x^3.0+1.0/49.343283582089555/-56.0/x^56.0-1.0/55.617647058823536/63.0*x^63.0+34.5/3.0*x^3.0+1.0/52.28571428571429/-59.0/x^59.0-1.0/58.59154929577465/66.0*x^66.0+36.0/3.0*x^3.0+1.0/55.23287671232877/-62.0/x^62.0-1.0/61.567567567567565/69.0*x^69.0+37.5/3.0*x^3.0+1.0/58.184210526315795/-65.0/x^65.0-1.0/64.54545454545455/72.0*x^72.0+39.0/3.0*x^3.0+1.0/61.139240506329116/-68.0/x^68.0-1.0/67.525/75.0*x^75.0+40.5/3.0*x^3.0+1.0/64.09756097560975/-71.0/x^71.0";
 UsageCalculus.EqnSolArrayMap4[3] = "10.5*x^3.0-1.0/2459.53125/x^53.0-1.0/3158.769230769231*x^60.0+11.0*x^3.0-1.0/2763.223880597015/x^56.0-1.0/3503.911764705883*x^63.0+11.5*x^3.0-1.0/3084.857142857143/x^59.0-1.0/3867.042253521127*x^66.0+12.0*x^3.0-1.0/3424.4383561643835/x^62.0-1.0/4248.162162162162*x^69.0+12.5*x^3.0-1.0/3781.9736842105267/x^65.0-1.0/4647.272727272727*x^72.0+13.0*x^3.0-1.0/4157.46835443038/x^68.0-1.0/5064.375*x^75.0+13.5*x^3.0-1.0/4550.926829268293/x^71.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-1.1848704E7/x^59.0-1.14114E7*x^54.0-1.446798E7/x^62.0-1.396176E7*x^57.0-1.749888E7/x^65.0-1.6916886E7*x^60.0-2.098239E7/x^68.0-2.031744E7*x^63.0-2.496144E7/x^71.0-2.4206028E7*x^66.0-2.9480904E7/x^74.0-2.86272E7*x^69.0-3.45876E7/x^77.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*-59.0/x^60.0-54.0*x^53.0-0.0*-62.0/x^63.0-57.0*x^56.0-0.0*-65.0/x^66.0-60.0*x^59.0-0.0*-68.0/x^69.0-63.0*x^62.0-0.0*-71.0/x^72.0-66.0*x^65.0-0.0*-74.0/x^75.0-69.0*x^68.0-0.0*-77.0/x^78.0";
 UsageCalculus.EqnSolArrayMap2[4] = "0.0/x^60.0-54.0*x^53.0+0.0/x^63.0-57.0*x^56.0+0.0/x^66.0-60.0*x^59.0+0.0/x^69.0-63.0*x^62.0+0.0/x^72.0-66.0*x^65.0+0.0/x^75.0-69.0*x^68.0+0.0/x^78.0";
 UsageCalculus.EqnSolArrayMap3[4] = "10.5*x^3.0-1.0/2459.53125/x^53.0-1.0/3158.769230769231*x^60.0+11.0*x^3.0-1.0/2763.223880597015/x^56.0-1.0/3503.911764705883*x^63.0+11.5*x^3.0-1.0/3084.857142857143/x^59.0-1.0/3867.042253521127*x^66.0+12.0*x^3.0-1.0/3424.4383561643835/x^62.0-1.0/4248.162162162162*x^69.0+12.5*x^3.0-1.0/3781.9736842105267/x^65.0-1.0/4647.272727272727*x^72.0+13.0*x^3.0-1.0/4157.46835443038/x^68.0-1.0/5064.375*x^75.0+13.5*x^3.0-1.0/4550.926829268293/x^71.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "10.5/4.0*x^4.0-1.0/2459.53125/-52.0/x^52.0-1.0/3158.769230769231/61.0*x^61.0+11.0/4.0*x^4.0-1.0/2763.223880597015/-55.0/x^55.0-1.0/3503.911764705883/64.0*x^64.0+11.5/4.0*x^4.0-1.0/3084.857142857143/-58.0/x^58.0-1.0/3867.042253521127/67.0*x^67.0+12.0/4.0*x^4.0-1.0/3424.4383561643835/-61.0/x^61.0-1.0/4248.162162162162/70.0*x^70.0+12.5/4.0*x^4.0-1.0/3781.9736842105267/-64.0/x^64.0-1.0/4647.272727272727/73.0*x^73.0+13.0/4.0*x^4.0-1.0/4157.46835443038/-67.0/x^67.0-1.0/5064.375/76.0*x^76.0+13.5/4.0*x^4.0-1.0/4550.926829268293/-70.0/x^70.0";
 UsageCalculus.EqnSolArrayMap4[4] = "2.625*x^4.0+1.0/127895.625/x^52.0-1.0/192684.9230769231*x^61.0+2.75*x^4.0+1.0/151977.31343283583/x^55.0-1.0/224250.3529411765*x^64.0+2.875*x^4.0+1.0/178921.7142857143/x^58.0-1.0/259091.8309859155*x^67.0+3.0*x^4.0+1.0/208890.7397260274/x^61.0-1.0/297371.3513513513*x^70.0+3.125*x^4.0+1.0/242046.3157894737/x^64.0-1.0/339250.90909090906*x^73.0+3.25*x^4.0+1.0/278550.37974683545/x^67.0-1.0/384892.5*x^76.0+3.375*x^4.0+1.0/318564.8780487805/x^70.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120343() {
 UsageCalculus.TestCase = 120343;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-65*x^57+66";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-65.0*x^57.0+66.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-65.0*57.0*x^56.0+66.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-3705.0*x^56.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-65.0*x^57.0+66.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-65.0/58.0*x^58.0+66.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.1206896551724137*x^58.0+66.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-3705.0*x^56.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-3705.0*56.0*x^55.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-207480.0*x^55.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.1206896551724137*x^58.0+66.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.1206896551724137/59.0*x^59.0+66.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/52.64615384615385*x^59.0+33.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-207480.0*x^55.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-207480.0*55.0*x^54.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-1.14114E7*x^54.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/52.64615384615385*x^59.0+33.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/52.64615384615385/60.0*x^60.0+33.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/3158.769230769231*x^60.0+11.0*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-1.14114E7*x^54.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*54.0*x^53.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-0.0*x^53.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/3158.769230769231*x^60.0+11.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/3158.769230769231/61.0*x^61.0+11.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/192684.9230769231*x^61.0+2.75*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120344() {
 UsageCalculus.TestCase = 120344;
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

public static void TestCaseDiff120345() {
 UsageCalculus.TestCase = 120345;
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

public static void TestCaseDiff120346() {
 UsageCalculus.TestCase = 120346;
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

public static void TestCaseDiff120347() {
 UsageCalculus.TestCase = 120347;
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

public static void TestCaseDiff120348() {
 UsageCalculus.TestCase = 120348;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+70/x^62-71*x^63+72*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-64+73/x^65-74*x^66+75*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-67+76/x^68";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "70.0/x^62.0-71.0*x^63.0+72.0+73.0/x^65.0-74.0*x^66.0+75.0+76.0/x^68.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "70.0*-62.0/x^63.0-71.0*63.0*x^62.0+72.0*0.0+73.0*-65.0/x^66.0-74.0*66.0*x^65.0+75.0*0.0+76.0*-68.0/x^69.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-4340.0/x^63.0-4473.0*x^62.0-4745.0/x^66.0-4884.0*x^65.0-5168.0/x^69.0";
 UsageCalculus.EqnSolArrayMap3[1] = "70.0/x^62.0-71.0*x^63.0+72.0+73.0/x^65.0-74.0*x^66.0+75.0+76.0/x^68.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "70.0/-61.0/x^61.0-71.0/64.0*x^64.0+72.0*x+73.0/-64.0/x^64.0-74.0/67.0*x^67.0+75.0*x+76.0/-67.0/x^67.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.1475409836065573/x^61.0-1.109375*x^64.0+72.0*x-1.140625/x^64.0-1.1044776119402986*x^67.0+75.0*x-1.1343283582089552/x^67.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-4340.0/x^63.0-4473.0*x^62.0-4745.0/x^66.0-4884.0*x^65.0-5168.0/x^69.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-4340.0*-63.0/x^64.0-4473.0*62.0*x^61.0-4745.0*-66.0/x^67.0-4884.0*65.0*x^64.0-5168.0*-69.0/x^70.0";
 UsageCalculus.EqnSolArrayMap2[2] = "273420.0/x^64.0-277326.0*x^61.0+313170.0/x^67.0-317460.0*x^64.0+356592.0/x^70.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.1475409836065573/x^61.0-1.109375*x^64.0+72.0*x-1.140625/x^64.0-1.1044776119402986*x^67.0+75.0*x-1.1343283582089552/x^67.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.1475409836065573/-60.0/x^60.0-1.109375/65.0*x^65.0+72.0/2.0*x^2.0-1.140625/-63.0/x^63.0-1.1044776119402986/68.0*x^68.0+75.0/2.0*x^2.0-1.1343283582089552/-66.0/x^66.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/52.28571428571429/x^60.0-1.0/58.59154929577465*x^65.0+36.0*x^2.0+1.0/55.23287671232877/x^63.0-1.0/61.567567567567565*x^68.0+37.5*x^2.0+1.0/58.184210526315795/x^66.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "273420.0/x^64.0-277326.0*x^61.0+313170.0/x^67.0-317460.0*x^64.0+356592.0/x^70.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "273420.0*-64.0/x^65.0-277326.0*61.0*x^60.0+313170.0*-67.0/x^68.0-317460.0*64.0*x^63.0+356592.0*-70.0/x^71.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-1.749888E7/x^65.0-1.6916886E7*x^60.0-2.098239E7/x^68.0-2.031744E7*x^63.0-2.496144E7/x^71.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/52.28571428571429/x^60.0-1.0/58.59154929577465*x^65.0+36.0*x^2.0+1.0/55.23287671232877/x^63.0-1.0/61.567567567567565*x^68.0+37.5*x^2.0+1.0/58.184210526315795/x^66.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/52.28571428571429/-59.0/x^59.0-1.0/58.59154929577465/66.0*x^66.0+36.0/3.0*x^3.0+1.0/55.23287671232877/-62.0/x^62.0-1.0/61.567567567567565/69.0*x^69.0+37.5/3.0*x^3.0+1.0/58.184210526315795/-65.0/x^65.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/3084.857142857143/x^59.0-1.0/3867.042253521127*x^66.0+12.0*x^3.0-1.0/3424.4383561643835/x^62.0-1.0/4248.162162162162*x^69.0+12.5*x^3.0-1.0/3781.9736842105267/x^65.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-1.749888E7/x^65.0-1.6916886E7*x^60.0-2.098239E7/x^68.0-2.031744E7*x^63.0-2.496144E7/x^71.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*-65.0/x^66.0-60.0*x^59.0-0.0*-68.0/x^69.0-63.0*x^62.0-0.0*-71.0/x^72.0";
 UsageCalculus.EqnSolArrayMap2[4] = "0.0/x^66.0-60.0*x^59.0+0.0/x^69.0-63.0*x^62.0+0.0/x^72.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/3084.857142857143/x^59.0-1.0/3867.042253521127*x^66.0+12.0*x^3.0-1.0/3424.4383561643835/x^62.0-1.0/4248.162162162162*x^69.0+12.5*x^3.0-1.0/3781.9736842105267/x^65.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/3084.857142857143/-58.0/x^58.0-1.0/3867.042253521127/67.0*x^67.0+12.0/4.0*x^4.0-1.0/3424.4383561643835/-61.0/x^61.0-1.0/4248.162162162162/70.0*x^70.0+12.5/4.0*x^4.0-1.0/3781.9736842105267/-64.0/x^64.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/178921.7142857143/x^58.0-1.0/259091.8309859155*x^67.0+3.0*x^4.0+1.0/208890.7397260274/x^61.0-1.0/297371.3513513513*x^70.0+3.125*x^4.0+1.0/242046.3157894737/x^64.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120349() {
 UsageCalculus.TestCase = 120349;
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

public static void TestCaseDiff120350() {
 UsageCalculus.TestCase = 120350;
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

public static void TestCaseDiff120351() {
 UsageCalculus.TestCase = 120351;
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

public static void TestCaseDiff120352() {
 UsageCalculus.TestCase = 120352;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-74*x^66+75*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-67+76/x^68-77*x^69+78*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-70+79/x^71-80*x^72+81+82/x^74-83*x^75+84";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-74.0*x^66.0+75.0+76.0/x^68.0-77.0*x^69.0+78.0+79.0/x^71.0-80.0*x^72.0+81.0+82.0/x^74.0-83.0*x^75.0+84.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-74.0*66.0*x^65.0+75.0*0.0+76.0*-68.0/x^69.0-77.0*69.0*x^68.0+78.0*0.0+79.0*-71.0/x^72.0-80.0*72.0*x^71.0+81.0*0.0+82.0*-74.0/x^75.0-83.0*75.0*x^74.0+84.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-4884.0*x^65.0-5168.0/x^69.0-5313.0*x^68.0-5609.0/x^72.0-5760.0*x^71.0-6068.0/x^75.0-6225.0*x^74.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-74.0*x^66.0+75.0+76.0/x^68.0-77.0*x^69.0+78.0+79.0/x^71.0-80.0*x^72.0+81.0+82.0/x^74.0-83.0*x^75.0+84.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-74.0/67.0*x^67.0+75.0*x+76.0/-67.0/x^67.0-77.0/70.0*x^70.0+78.0*x+79.0/-70.0/x^70.0-80.0/73.0*x^73.0+81.0*x+82.0/-73.0/x^73.0-83.0/76.0*x^76.0+84.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.1044776119402986*x^67.0+75.0*x-1.1343283582089552/x^67.0-1.1*x^70.0+78.0*x-1.1285714285714286/x^70.0-1.095890410958904*x^73.0+81.0*x-1.1232876712328768/x^73.0-1.0921052631578947*x^76.0+84.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-4884.0*x^65.0-5168.0/x^69.0-5313.0*x^68.0-5609.0/x^72.0-5760.0*x^71.0-6068.0/x^75.0-6225.0*x^74.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-4884.0*65.0*x^64.0-5168.0*-69.0/x^70.0-5313.0*68.0*x^67.0-5609.0*-72.0/x^73.0-5760.0*71.0*x^70.0-6068.0*-75.0/x^76.0-6225.0*74.0*x^73.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-317460.0*x^64.0+356592.0/x^70.0-361284.0*x^67.0+403848.0/x^73.0-408960.0*x^70.0+455100.0/x^76.0-460650.0*x^73.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.1044776119402986*x^67.0+75.0*x-1.1343283582089552/x^67.0-1.1*x^70.0+78.0*x-1.1285714285714286/x^70.0-1.095890410958904*x^73.0+81.0*x-1.1232876712328768/x^73.0-1.0921052631578947*x^76.0+84.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.1044776119402986/68.0*x^68.0+75.0/2.0*x^2.0-1.1343283582089552/-66.0/x^66.0-1.1/71.0*x^71.0+78.0/2.0*x^2.0-1.1285714285714286/-69.0/x^69.0-1.095890410958904/74.0*x^74.0+81.0/2.0*x^2.0-1.1232876712328768/-72.0/x^72.0-1.0921052631578947/77.0*x^77.0+84.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/61.567567567567565*x^68.0+37.5*x^2.0+1.0/58.184210526315795/x^66.0-1.0/64.54545454545455*x^71.0+39.0*x^2.0+1.0/61.139240506329116/x^69.0-1.0/67.525*x^74.0+40.5*x^2.0+1.0/64.09756097560975/x^72.0-1.0/70.50602409638554*x^77.0+42.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-317460.0*x^64.0+356592.0/x^70.0-361284.0*x^67.0+403848.0/x^73.0-408960.0*x^70.0+455100.0/x^76.0-460650.0*x^73.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-317460.0*64.0*x^63.0+356592.0*-70.0/x^71.0-361284.0*67.0*x^66.0+403848.0*-73.0/x^74.0-408960.0*70.0*x^69.0+455100.0*-76.0/x^77.0-460650.0*73.0*x^72.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-2.031744E7*x^63.0-2.496144E7/x^71.0-2.4206028E7*x^66.0-2.9480904E7/x^74.0-2.86272E7*x^69.0-3.45876E7/x^77.0-3.362745E7*x^72.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/61.567567567567565*x^68.0+37.5*x^2.0+1.0/58.184210526315795/x^66.0-1.0/64.54545454545455*x^71.0+39.0*x^2.0+1.0/61.139240506329116/x^69.0-1.0/67.525*x^74.0+40.5*x^2.0+1.0/64.09756097560975/x^72.0-1.0/70.50602409638554*x^77.0+42.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/61.567567567567565/69.0*x^69.0+37.5/3.0*x^3.0+1.0/58.184210526315795/-65.0/x^65.0-1.0/64.54545454545455/72.0*x^72.0+39.0/3.0*x^3.0+1.0/61.139240506329116/-68.0/x^68.0-1.0/67.525/75.0*x^75.0+40.5/3.0*x^3.0+1.0/64.09756097560975/-71.0/x^71.0-1.0/70.50602409638554/78.0*x^78.0+42.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/4248.162162162162*x^69.0+12.5*x^3.0-1.0/3781.9736842105267/x^65.0-1.0/4647.272727272727*x^72.0+13.0*x^3.0-1.0/4157.46835443038/x^68.0-1.0/5064.375*x^75.0+13.5*x^3.0-1.0/4550.926829268293/x^71.0-1.0/5499.469879518072*x^78.0+14.0*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-2.031744E7*x^63.0-2.496144E7/x^71.0-2.4206028E7*x^66.0-2.9480904E7/x^74.0-2.86272E7*x^69.0-3.45876E7/x^77.0-3.362745E7*x^72.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-63.0*x^62.0-0.0*-71.0/x^72.0-66.0*x^65.0-0.0*-74.0/x^75.0-69.0*x^68.0-0.0*-77.0/x^78.0-0.0*72.0*x^71.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-63.0*x^62.0+0.0/x^72.0-66.0*x^65.0+0.0/x^75.0-69.0*x^68.0+0.0/x^78.0-0.0*x^71.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/4248.162162162162*x^69.0+12.5*x^3.0-1.0/3781.9736842105267/x^65.0-1.0/4647.272727272727*x^72.0+13.0*x^3.0-1.0/4157.46835443038/x^68.0-1.0/5064.375*x^75.0+13.5*x^3.0-1.0/4550.926829268293/x^71.0-1.0/5499.469879518072*x^78.0+14.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/4248.162162162162/70.0*x^70.0+12.5/4.0*x^4.0-1.0/3781.9736842105267/-64.0/x^64.0-1.0/4647.272727272727/73.0*x^73.0+13.0/4.0*x^4.0-1.0/4157.46835443038/-67.0/x^67.0-1.0/5064.375/76.0*x^76.0+13.5/4.0*x^4.0-1.0/4550.926829268293/-70.0/x^70.0-1.0/5499.469879518072/79.0*x^79.0+14.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/297371.3513513513*x^70.0+3.125*x^4.0+1.0/242046.3157894737/x^64.0-1.0/339250.90909090906*x^73.0+3.25*x^4.0+1.0/278550.37974683545/x^67.0-1.0/384892.5*x^76.0+3.375*x^4.0+1.0/318564.8780487805/x^70.0-1.0/434458.1204819277*x^79.0+3.5*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120353() {
 UsageCalculus.TestCase = 120353;
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

public static void TestCaseDiff120354() {
 UsageCalculus.TestCase = 120354;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+76/x^68-77*x^69+78*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-70+79/x^71-80*x^72+81+82/x^74-83*x^75+84+85/x^77-86*x^78+87*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-79+88/x^80";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "76.0/x^68.0-77.0*x^69.0+78.0+79.0/x^71.0-80.0*x^72.0+81.0+82.0/x^74.0-83.0*x^75.0+84.0+85.0/x^77.0-86.0*x^78.0+87.0+88.0/x^80.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "76.0*-68.0/x^69.0-77.0*69.0*x^68.0+78.0*0.0+79.0*-71.0/x^72.0-80.0*72.0*x^71.0+81.0*0.0+82.0*-74.0/x^75.0-83.0*75.0*x^74.0+84.0*0.0+85.0*-77.0/x^78.0-86.0*78.0*x^77.0+87.0*0.0+88.0*-80.0/x^81.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-5168.0/x^69.0-5313.0*x^68.0-5609.0/x^72.0-5760.0*x^71.0-6068.0/x^75.0-6225.0*x^74.0-6545.0/x^78.0-6708.0*x^77.0-7040.0/x^81.0";
 UsageCalculus.EqnSolArrayMap3[1] = "76.0/x^68.0-77.0*x^69.0+78.0+79.0/x^71.0-80.0*x^72.0+81.0+82.0/x^74.0-83.0*x^75.0+84.0+85.0/x^77.0-86.0*x^78.0+87.0+88.0/x^80.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "76.0/-67.0/x^67.0-77.0/70.0*x^70.0+78.0*x+79.0/-70.0/x^70.0-80.0/73.0*x^73.0+81.0*x+82.0/-73.0/x^73.0-83.0/76.0*x^76.0+84.0*x+85.0/-76.0/x^76.0-86.0/79.0*x^79.0+87.0*x+88.0/-79.0/x^79.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.1343283582089552/x^67.0-1.1*x^70.0+78.0*x-1.1285714285714286/x^70.0-1.095890410958904*x^73.0+81.0*x-1.1232876712328768/x^73.0-1.0921052631578947*x^76.0+84.0*x-1.118421052631579/x^76.0-1.0886075949367089*x^79.0+87.0*x-1.1139240506329113/x^79.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-5168.0/x^69.0-5313.0*x^68.0-5609.0/x^72.0-5760.0*x^71.0-6068.0/x^75.0-6225.0*x^74.0-6545.0/x^78.0-6708.0*x^77.0-7040.0/x^81.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-5168.0*-69.0/x^70.0-5313.0*68.0*x^67.0-5609.0*-72.0/x^73.0-5760.0*71.0*x^70.0-6068.0*-75.0/x^76.0-6225.0*74.0*x^73.0-6545.0*-78.0/x^79.0-6708.0*77.0*x^76.0-7040.0*-81.0/x^82.0";
 UsageCalculus.EqnSolArrayMap2[2] = "356592.0/x^70.0-361284.0*x^67.0+403848.0/x^73.0-408960.0*x^70.0+455100.0/x^76.0-460650.0*x^73.0+510510.0/x^79.0-516516.0*x^76.0+570240.0/x^82.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.1343283582089552/x^67.0-1.1*x^70.0+78.0*x-1.1285714285714286/x^70.0-1.095890410958904*x^73.0+81.0*x-1.1232876712328768/x^73.0-1.0921052631578947*x^76.0+84.0*x-1.118421052631579/x^76.0-1.0886075949367089*x^79.0+87.0*x-1.1139240506329113/x^79.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.1343283582089552/-66.0/x^66.0-1.1/71.0*x^71.0+78.0/2.0*x^2.0-1.1285714285714286/-69.0/x^69.0-1.095890410958904/74.0*x^74.0+81.0/2.0*x^2.0-1.1232876712328768/-72.0/x^72.0-1.0921052631578947/77.0*x^77.0+84.0/2.0*x^2.0-1.118421052631579/-75.0/x^75.0-1.0886075949367089/80.0*x^80.0+87.0/2.0*x^2.0-1.1139240506329113/-78.0/x^78.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/58.184210526315795/x^66.0-1.0/64.54545454545455*x^71.0+39.0*x^2.0+1.0/61.139240506329116/x^69.0-1.0/67.525*x^74.0+40.5*x^2.0+1.0/64.09756097560975/x^72.0-1.0/70.50602409638554*x^77.0+42.0*x^2.0+1.0/67.05882352941177/x^75.0-1.0/73.48837209302326*x^80.0+43.5*x^2.0+1.0/70.02272727272728/x^78.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "356592.0/x^70.0-361284.0*x^67.0+403848.0/x^73.0-408960.0*x^70.0+455100.0/x^76.0-460650.0*x^73.0+510510.0/x^79.0-516516.0*x^76.0+570240.0/x^82.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "356592.0*-70.0/x^71.0-361284.0*67.0*x^66.0+403848.0*-73.0/x^74.0-408960.0*70.0*x^69.0+455100.0*-76.0/x^77.0-460650.0*73.0*x^72.0+510510.0*-79.0/x^80.0-516516.0*76.0*x^75.0+570240.0*-82.0/x^83.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-2.496144E7/x^71.0-2.4206028E7*x^66.0-2.9480904E7/x^74.0-2.86272E7*x^69.0-3.45876E7/x^77.0-3.362745E7*x^72.0-4.033029E7/x^80.0-3.9255216E7*x^75.0-4.675968E7/x^83.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/58.184210526315795/x^66.0-1.0/64.54545454545455*x^71.0+39.0*x^2.0+1.0/61.139240506329116/x^69.0-1.0/67.525*x^74.0+40.5*x^2.0+1.0/64.09756097560975/x^72.0-1.0/70.50602409638554*x^77.0+42.0*x^2.0+1.0/67.05882352941177/x^75.0-1.0/73.48837209302326*x^80.0+43.5*x^2.0+1.0/70.02272727272728/x^78.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/58.184210526315795/-65.0/x^65.0-1.0/64.54545454545455/72.0*x^72.0+39.0/3.0*x^3.0+1.0/61.139240506329116/-68.0/x^68.0-1.0/67.525/75.0*x^75.0+40.5/3.0*x^3.0+1.0/64.09756097560975/-71.0/x^71.0-1.0/70.50602409638554/78.0*x^78.0+42.0/3.0*x^3.0+1.0/67.05882352941177/-74.0/x^74.0-1.0/73.48837209302326/81.0*x^81.0+43.5/3.0*x^3.0+1.0/70.02272727272728/-77.0/x^77.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/3781.9736842105267/x^65.0-1.0/4647.272727272727*x^72.0+13.0*x^3.0-1.0/4157.46835443038/x^68.0-1.0/5064.375*x^75.0+13.5*x^3.0-1.0/4550.926829268293/x^71.0-1.0/5499.469879518072*x^78.0+14.0*x^3.0-1.0/4962.352941176471/x^74.0-1.0/5952.558139534884*x^81.0+14.5*x^3.0-1.0/5391.750000000001/x^77.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-2.496144E7/x^71.0-2.4206028E7*x^66.0-2.9480904E7/x^74.0-2.86272E7*x^69.0-3.45876E7/x^77.0-3.362745E7*x^72.0-4.033029E7/x^80.0-3.9255216E7*x^75.0-4.675968E7/x^83.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*-71.0/x^72.0-66.0*x^65.0-0.0*-74.0/x^75.0-69.0*x^68.0-0.0*-77.0/x^78.0-72.0*x^71.0-0.0*-80.0/x^81.0-75.0*x^74.0-0.0*-83.0/x^84.0";
 UsageCalculus.EqnSolArrayMap2[4] = "0.0/x^72.0-66.0*x^65.0+0.0/x^75.0-69.0*x^68.0+0.0/x^78.0-72.0*x^71.0+0.0/x^81.0-75.0*x^74.0+0.0/x^84.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/3781.9736842105267/x^65.0-1.0/4647.272727272727*x^72.0+13.0*x^3.0-1.0/4157.46835443038/x^68.0-1.0/5064.375*x^75.0+13.5*x^3.0-1.0/4550.926829268293/x^71.0-1.0/5499.469879518072*x^78.0+14.0*x^3.0-1.0/4962.352941176471/x^74.0-1.0/5952.558139534884*x^81.0+14.5*x^3.0-1.0/5391.750000000001/x^77.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/3781.9736842105267/-64.0/x^64.0-1.0/4647.272727272727/73.0*x^73.0+13.0/4.0*x^4.0-1.0/4157.46835443038/-67.0/x^67.0-1.0/5064.375/76.0*x^76.0+13.5/4.0*x^4.0-1.0/4550.926829268293/-70.0/x^70.0-1.0/5499.469879518072/79.0*x^79.0+14.0/4.0*x^4.0-1.0/4962.352941176471/-73.0/x^73.0-1.0/5952.558139534884/82.0*x^82.0+14.5/4.0*x^4.0-1.0/5391.750000000001/-76.0/x^76.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/242046.3157894737/x^64.0-1.0/339250.90909090906*x^73.0+3.25*x^4.0+1.0/278550.37974683545/x^67.0-1.0/384892.5*x^76.0+3.375*x^4.0+1.0/318564.8780487805/x^70.0-1.0/434458.1204819277*x^79.0+3.5*x^4.0+1.0/362251.7647058824/x^73.0-1.0/488109.76744186046*x^82.0+3.625*x^4.0+1.0/409773.00000000006/x^76.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120355() {
 UsageCalculus.TestCase = 120355;
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

public static void TestCaseDiff120356() {
 UsageCalculus.TestCase = 120356;
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

public static void TestCaseDiff120357() {
 UsageCalculus.TestCase = 120357;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+79/x^71-80*x^72+81+82/x^74-83*x^75+84+85/x^77-86*x^78+87*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-79+88/x^80-89*x^81+90*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-82+91/x^83-92*x^84+93*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-85+94/x^86";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "79.0/x^71.0-80.0*x^72.0+81.0+82.0/x^74.0-83.0*x^75.0+84.0+85.0/x^77.0-86.0*x^78.0+87.0+88.0/x^80.0-89.0*x^81.0+90.0+91.0/x^83.0-92.0*x^84.0+93.0+94.0/x^86.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "79.0*-71.0/x^72.0-80.0*72.0*x^71.0+81.0*0.0+82.0*-74.0/x^75.0-83.0*75.0*x^74.0+84.0*0.0+85.0*-77.0/x^78.0-86.0*78.0*x^77.0+87.0*0.0+88.0*-80.0/x^81.0-89.0*81.0*x^80.0+90.0*0.0+91.0*-83.0/x^84.0-92.0*84.0*x^83.0+93.0*0.0+94.0*-86.0/x^87.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-5609.0/x^72.0-5760.0*x^71.0-6068.0/x^75.0-6225.0*x^74.0-6545.0/x^78.0-6708.0*x^77.0-7040.0/x^81.0-7209.0*x^80.0-7553.0/x^84.0-7728.0*x^83.0-8084.0/x^87.0";
 UsageCalculus.EqnSolArrayMap3[1] = "79.0/x^71.0-80.0*x^72.0+81.0+82.0/x^74.0-83.0*x^75.0+84.0+85.0/x^77.0-86.0*x^78.0+87.0+88.0/x^80.0-89.0*x^81.0+90.0+91.0/x^83.0-92.0*x^84.0+93.0+94.0/x^86.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "79.0/-70.0/x^70.0-80.0/73.0*x^73.0+81.0*x+82.0/-73.0/x^73.0-83.0/76.0*x^76.0+84.0*x+85.0/-76.0/x^76.0-86.0/79.0*x^79.0+87.0*x+88.0/-79.0/x^79.0-89.0/82.0*x^82.0+90.0*x+91.0/-82.0/x^82.0-92.0/85.0*x^85.0+93.0*x+94.0/-85.0/x^85.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.1285714285714286/x^70.0-1.095890410958904*x^73.0+81.0*x-1.1232876712328768/x^73.0-1.0921052631578947*x^76.0+84.0*x-1.118421052631579/x^76.0-1.0886075949367089*x^79.0+87.0*x-1.1139240506329113/x^79.0-1.0853658536585367*x^82.0+90.0*x-1.1097560975609757/x^82.0-1.0823529411764705*x^85.0+93.0*x-1.1058823529411765/x^85.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-5609.0/x^72.0-5760.0*x^71.0-6068.0/x^75.0-6225.0*x^74.0-6545.0/x^78.0-6708.0*x^77.0-7040.0/x^81.0-7209.0*x^80.0-7553.0/x^84.0-7728.0*x^83.0-8084.0/x^87.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-5609.0*-72.0/x^73.0-5760.0*71.0*x^70.0-6068.0*-75.0/x^76.0-6225.0*74.0*x^73.0-6545.0*-78.0/x^79.0-6708.0*77.0*x^76.0-7040.0*-81.0/x^82.0-7209.0*80.0*x^79.0-7553.0*-84.0/x^85.0-7728.0*83.0*x^82.0-8084.0*-87.0/x^88.0";
 UsageCalculus.EqnSolArrayMap2[2] = "403848.0/x^73.0-408960.0*x^70.0+455100.0/x^76.0-460650.0*x^73.0+510510.0/x^79.0-516516.0*x^76.0+570240.0/x^82.0-576720.0*x^79.0+634452.0/x^85.0-641424.0*x^82.0+703308.0/x^88.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.1285714285714286/x^70.0-1.095890410958904*x^73.0+81.0*x-1.1232876712328768/x^73.0-1.0921052631578947*x^76.0+84.0*x-1.118421052631579/x^76.0-1.0886075949367089*x^79.0+87.0*x-1.1139240506329113/x^79.0-1.0853658536585367*x^82.0+90.0*x-1.1097560975609757/x^82.0-1.0823529411764705*x^85.0+93.0*x-1.1058823529411765/x^85.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.1285714285714286/-69.0/x^69.0-1.095890410958904/74.0*x^74.0+81.0/2.0*x^2.0-1.1232876712328768/-72.0/x^72.0-1.0921052631578947/77.0*x^77.0+84.0/2.0*x^2.0-1.118421052631579/-75.0/x^75.0-1.0886075949367089/80.0*x^80.0+87.0/2.0*x^2.0-1.1139240506329113/-78.0/x^78.0-1.0853658536585367/83.0*x^83.0+90.0/2.0*x^2.0-1.1097560975609757/-81.0/x^81.0-1.0823529411764705/86.0*x^86.0+93.0/2.0*x^2.0-1.1058823529411765/-84.0/x^84.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/61.139240506329116/x^69.0-1.0/67.525*x^74.0+40.5*x^2.0+1.0/64.09756097560975/x^72.0-1.0/70.50602409638554*x^77.0+42.0*x^2.0+1.0/67.05882352941177/x^75.0-1.0/73.48837209302326*x^80.0+43.5*x^2.0+1.0/70.02272727272728/x^78.0-1.0/76.47191011235955*x^83.0+45.0*x^2.0+1.0/72.98901098901098/x^81.0-1.0/79.45652173913044*x^86.0+46.5*x^2.0+1.0/75.95744680851064/x^84.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "403848.0/x^73.0-408960.0*x^70.0+455100.0/x^76.0-460650.0*x^73.0+510510.0/x^79.0-516516.0*x^76.0+570240.0/x^82.0-576720.0*x^79.0+634452.0/x^85.0-641424.0*x^82.0+703308.0/x^88.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "403848.0*-73.0/x^74.0-408960.0*70.0*x^69.0+455100.0*-76.0/x^77.0-460650.0*73.0*x^72.0+510510.0*-79.0/x^80.0-516516.0*76.0*x^75.0+570240.0*-82.0/x^83.0-576720.0*79.0*x^78.0+634452.0*-85.0/x^86.0-641424.0*82.0*x^81.0+703308.0*-88.0/x^89.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-2.9480904E7/x^74.0-2.86272E7*x^69.0-3.45876E7/x^77.0-3.362745E7*x^72.0-4.033029E7/x^80.0-3.9255216E7*x^75.0-4.675968E7/x^83.0-4.556088E7*x^78.0-5.392842E7/x^86.0-5.2596768E7*x^81.0-6.1891104E7/x^89.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/61.139240506329116/x^69.0-1.0/67.525*x^74.0+40.5*x^2.0+1.0/64.09756097560975/x^72.0-1.0/70.50602409638554*x^77.0+42.0*x^2.0+1.0/67.05882352941177/x^75.0-1.0/73.48837209302326*x^80.0+43.5*x^2.0+1.0/70.02272727272728/x^78.0-1.0/76.47191011235955*x^83.0+45.0*x^2.0+1.0/72.98901098901098/x^81.0-1.0/79.45652173913044*x^86.0+46.5*x^2.0+1.0/75.95744680851064/x^84.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/61.139240506329116/-68.0/x^68.0-1.0/67.525/75.0*x^75.0+40.5/3.0*x^3.0+1.0/64.09756097560975/-71.0/x^71.0-1.0/70.50602409638554/78.0*x^78.0+42.0/3.0*x^3.0+1.0/67.05882352941177/-74.0/x^74.0-1.0/73.48837209302326/81.0*x^81.0+43.5/3.0*x^3.0+1.0/70.02272727272728/-77.0/x^77.0-1.0/76.47191011235955/84.0*x^84.0+45.0/3.0*x^3.0+1.0/72.98901098901098/-80.0/x^80.0-1.0/79.45652173913044/87.0*x^87.0+46.5/3.0*x^3.0+1.0/75.95744680851064/-83.0/x^83.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/4157.46835443038/x^68.0-1.0/5064.375*x^75.0+13.5*x^3.0-1.0/4550.926829268293/x^71.0-1.0/5499.469879518072*x^78.0+14.0*x^3.0-1.0/4962.352941176471/x^74.0-1.0/5952.558139534884*x^81.0+14.5*x^3.0-1.0/5391.750000000001/x^77.0-1.0/6423.640449438202*x^84.0+15.0*x^3.0-1.0/5839.120879120878/x^80.0-1.0/6912.717391304348*x^87.0+15.5*x^3.0-1.0/6304.468085106383/x^83.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-2.9480904E7/x^74.0-2.86272E7*x^69.0-3.45876E7/x^77.0-3.362745E7*x^72.0-4.033029E7/x^80.0-3.9255216E7*x^75.0-4.675968E7/x^83.0-4.556088E7*x^78.0-5.392842E7/x^86.0-5.2596768E7*x^81.0-6.1891104E7/x^89.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*-74.0/x^75.0-69.0*x^68.0-0.0*-77.0/x^78.0-72.0*x^71.0-0.0*-80.0/x^81.0-75.0*x^74.0-0.0*-83.0/x^84.0-78.0*x^77.0-0.0*-86.0/x^87.0-81.0*x^80.0-0.0*-89.0/x^90.0";
 UsageCalculus.EqnSolArrayMap2[4] = "0.0/x^75.0-69.0*x^68.0+0.0/x^78.0-72.0*x^71.0+0.0/x^81.0-75.0*x^74.0+0.0/x^84.0-78.0*x^77.0+0.0/x^87.0-81.0*x^80.0+0.0/x^90.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/4157.46835443038/x^68.0-1.0/5064.375*x^75.0+13.5*x^3.0-1.0/4550.926829268293/x^71.0-1.0/5499.469879518072*x^78.0+14.0*x^3.0-1.0/4962.352941176471/x^74.0-1.0/5952.558139534884*x^81.0+14.5*x^3.0-1.0/5391.750000000001/x^77.0-1.0/6423.640449438202*x^84.0+15.0*x^3.0-1.0/5839.120879120878/x^80.0-1.0/6912.717391304348*x^87.0+15.5*x^3.0-1.0/6304.468085106383/x^83.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/4157.46835443038/-67.0/x^67.0-1.0/5064.375/76.0*x^76.0+13.5/4.0*x^4.0-1.0/4550.926829268293/-70.0/x^70.0-1.0/5499.469879518072/79.0*x^79.0+14.0/4.0*x^4.0-1.0/4962.352941176471/-73.0/x^73.0-1.0/5952.558139534884/82.0*x^82.0+14.5/4.0*x^4.0-1.0/5391.750000000001/-76.0/x^76.0-1.0/6423.640449438202/85.0*x^85.0+15.0/4.0*x^4.0-1.0/5839.120879120878/-79.0/x^79.0-1.0/6912.717391304348/88.0*x^88.0+15.5/4.0*x^4.0-1.0/6304.468085106383/-82.0/x^82.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/278550.37974683545/x^67.0-1.0/384892.5*x^76.0+3.375*x^4.0+1.0/318564.8780487805/x^70.0-1.0/434458.1204819277*x^79.0+3.5*x^4.0+1.0/362251.7647058824/x^73.0-1.0/488109.76744186046*x^82.0+3.625*x^4.0+1.0/409773.00000000006/x^76.0-1.0/546009.4382022471*x^85.0+3.75*x^4.0+1.0/461290.54945054936/x^79.0-1.0/608319.1304347826*x^88.0+3.875*x^4.0+1.0/516966.38297872344/x^82.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120358() {
 UsageCalculus.TestCase = 120358;
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

public static void TestCaseDiff120359() {
 UsageCalculus.TestCase = 120359;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+81+82/x^74-83*x^75+84+85/x^77-86*x^78+87*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-79+88/x^80-89*x^81+90*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-82+91/x^83-92*x^84+93*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-85+94/x^86-95*x^87+96+97/x^89-98*x^90";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "81.0+82.0/x^74.0-83.0*x^75.0+84.0+85.0/x^77.0-86.0*x^78.0+87.0+88.0/x^80.0-89.0*x^81.0+90.0+91.0/x^83.0-92.0*x^84.0+93.0+94.0/x^86.0-95.0*x^87.0+96.0+97.0/x^89.0-98.0*x^90.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+82.0*-74.0/x^75.0-83.0*75.0*x^74.0+84.0*0.0+85.0*-77.0/x^78.0-86.0*78.0*x^77.0+87.0*0.0+88.0*-80.0/x^81.0-89.0*81.0*x^80.0+90.0*0.0+91.0*-83.0/x^84.0-92.0*84.0*x^83.0+93.0*0.0+94.0*-86.0/x^87.0-95.0*87.0*x^86.0+96.0*0.0+97.0*-89.0/x^90.0-98.0*90.0*x^89.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-6068.0/x^75.0-6225.0*x^74.0-6545.0/x^78.0-6708.0*x^77.0-7040.0/x^81.0-7209.0*x^80.0-7553.0/x^84.0-7728.0*x^83.0-8084.0/x^87.0-8265.0*x^86.0-8633.0/x^90.0-8820.0*x^89.0";
 UsageCalculus.EqnSolArrayMap3[1] = "81.0+82.0/x^74.0-83.0*x^75.0+84.0+85.0/x^77.0-86.0*x^78.0+87.0+88.0/x^80.0-89.0*x^81.0+90.0+91.0/x^83.0-92.0*x^84.0+93.0+94.0/x^86.0-95.0*x^87.0+96.0+97.0/x^89.0-98.0*x^90.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "81.0*x+82.0/-73.0/x^73.0-83.0/76.0*x^76.0+84.0*x+85.0/-76.0/x^76.0-86.0/79.0*x^79.0+87.0*x+88.0/-79.0/x^79.0-89.0/82.0*x^82.0+90.0*x+91.0/-82.0/x^82.0-92.0/85.0*x^85.0+93.0*x+94.0/-85.0/x^85.0-95.0/88.0*x^88.0+96.0*x+97.0/-88.0/x^88.0-98.0/91.0*x^91.0";
 UsageCalculus.EqnSolArrayMap4[1] = "81.0*x-1.1232876712328768/x^73.0-1.0921052631578947*x^76.0+84.0*x-1.118421052631579/x^76.0-1.0886075949367089*x^79.0+87.0*x-1.1139240506329113/x^79.0-1.0853658536585367*x^82.0+90.0*x-1.1097560975609757/x^82.0-1.0823529411764705*x^85.0+93.0*x-1.1058823529411765/x^85.0-1.0795454545454546*x^88.0+96.0*x-1.1022727272727273/x^88.0-1.0769230769230769*x^91.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-6068.0/x^75.0-6225.0*x^74.0-6545.0/x^78.0-6708.0*x^77.0-7040.0/x^81.0-7209.0*x^80.0-7553.0/x^84.0-7728.0*x^83.0-8084.0/x^87.0-8265.0*x^86.0-8633.0/x^90.0-8820.0*x^89.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-6068.0*-75.0/x^76.0-6225.0*74.0*x^73.0-6545.0*-78.0/x^79.0-6708.0*77.0*x^76.0-7040.0*-81.0/x^82.0-7209.0*80.0*x^79.0-7553.0*-84.0/x^85.0-7728.0*83.0*x^82.0-8084.0*-87.0/x^88.0-8265.0*86.0*x^85.0-8633.0*-90.0/x^91.0-8820.0*89.0*x^88.0";
 UsageCalculus.EqnSolArrayMap2[2] = "455100.0/x^76.0-460650.0*x^73.0+510510.0/x^79.0-516516.0*x^76.0+570240.0/x^82.0-576720.0*x^79.0+634452.0/x^85.0-641424.0*x^82.0+703308.0/x^88.0-710790.0*x^85.0+776970.0/x^91.0-784980.0*x^88.0";
 UsageCalculus.EqnSolArrayMap3[2] = "81.0*x-1.1232876712328768/x^73.0-1.0921052631578947*x^76.0+84.0*x-1.118421052631579/x^76.0-1.0886075949367089*x^79.0+87.0*x-1.1139240506329113/x^79.0-1.0853658536585367*x^82.0+90.0*x-1.1097560975609757/x^82.0-1.0823529411764705*x^85.0+93.0*x-1.1058823529411765/x^85.0-1.0795454545454546*x^88.0+96.0*x-1.1022727272727273/x^88.0-1.0769230769230769*x^91.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "81.0/2.0*x^2.0-1.1232876712328768/-72.0/x^72.0-1.0921052631578947/77.0*x^77.0+84.0/2.0*x^2.0-1.118421052631579/-75.0/x^75.0-1.0886075949367089/80.0*x^80.0+87.0/2.0*x^2.0-1.1139240506329113/-78.0/x^78.0-1.0853658536585367/83.0*x^83.0+90.0/2.0*x^2.0-1.1097560975609757/-81.0/x^81.0-1.0823529411764705/86.0*x^86.0+93.0/2.0*x^2.0-1.1058823529411765/-84.0/x^84.0-1.0795454545454546/89.0*x^89.0+96.0/2.0*x^2.0-1.1022727272727273/-87.0/x^87.0-1.0769230769230769/92.0*x^92.0";
 UsageCalculus.EqnSolArrayMap4[2] = "40.5*x^2.0+1.0/64.09756097560975/x^72.0-1.0/70.50602409638554*x^77.0+42.0*x^2.0+1.0/67.05882352941177/x^75.0-1.0/73.48837209302326*x^80.0+43.5*x^2.0+1.0/70.02272727272728/x^78.0-1.0/76.47191011235955*x^83.0+45.0*x^2.0+1.0/72.98901098901098/x^81.0-1.0/79.45652173913044*x^86.0+46.5*x^2.0+1.0/75.95744680851064/x^84.0-1.0/82.44210526315788*x^89.0+48.0*x^2.0+1.0/78.9278350515464/x^87.0-1.0/85.42857142857143*x^92.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "455100.0/x^76.0-460650.0*x^73.0+510510.0/x^79.0-516516.0*x^76.0+570240.0/x^82.0-576720.0*x^79.0+634452.0/x^85.0-641424.0*x^82.0+703308.0/x^88.0-710790.0*x^85.0+776970.0/x^91.0-784980.0*x^88.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "455100.0*-76.0/x^77.0-460650.0*73.0*x^72.0+510510.0*-79.0/x^80.0-516516.0*76.0*x^75.0+570240.0*-82.0/x^83.0-576720.0*79.0*x^78.0+634452.0*-85.0/x^86.0-641424.0*82.0*x^81.0+703308.0*-88.0/x^89.0-710790.0*85.0*x^84.0+776970.0*-91.0/x^92.0-784980.0*88.0*x^87.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-3.45876E7/x^77.0-3.362745E7*x^72.0-4.033029E7/x^80.0-3.9255216E7*x^75.0-4.675968E7/x^83.0-4.556088E7*x^78.0-5.392842E7/x^86.0-5.2596768E7*x^81.0-6.1891104E7/x^89.0-6.041715E7*x^84.0-7.070427E7/x^92.0-6.907824E7*x^87.0";
 UsageCalculus.EqnSolArrayMap3[3] = "40.5*x^2.0+1.0/64.09756097560975/x^72.0-1.0/70.50602409638554*x^77.0+42.0*x^2.0+1.0/67.05882352941177/x^75.0-1.0/73.48837209302326*x^80.0+43.5*x^2.0+1.0/70.02272727272728/x^78.0-1.0/76.47191011235955*x^83.0+45.0*x^2.0+1.0/72.98901098901098/x^81.0-1.0/79.45652173913044*x^86.0+46.5*x^2.0+1.0/75.95744680851064/x^84.0-1.0/82.44210526315788*x^89.0+48.0*x^2.0+1.0/78.9278350515464/x^87.0-1.0/85.42857142857143*x^92.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "40.5/3.0*x^3.0+1.0/64.09756097560975/-71.0/x^71.0-1.0/70.50602409638554/78.0*x^78.0+42.0/3.0*x^3.0+1.0/67.05882352941177/-74.0/x^74.0-1.0/73.48837209302326/81.0*x^81.0+43.5/3.0*x^3.0+1.0/70.02272727272728/-77.0/x^77.0-1.0/76.47191011235955/84.0*x^84.0+45.0/3.0*x^3.0+1.0/72.98901098901098/-80.0/x^80.0-1.0/79.45652173913044/87.0*x^87.0+46.5/3.0*x^3.0+1.0/75.95744680851064/-83.0/x^83.0-1.0/82.44210526315788/90.0*x^90.0+48.0/3.0*x^3.0+1.0/78.9278350515464/-86.0/x^86.0-1.0/85.42857142857143/93.0*x^93.0";
 UsageCalculus.EqnSolArrayMap4[3] = "13.5*x^3.0-1.0/4550.926829268293/x^71.0-1.0/5499.469879518072*x^78.0+14.0*x^3.0-1.0/4962.352941176471/x^74.0-1.0/5952.558139534884*x^81.0+14.5*x^3.0-1.0/5391.750000000001/x^77.0-1.0/6423.640449438202*x^84.0+15.0*x^3.0-1.0/5839.120879120878/x^80.0-1.0/6912.717391304348*x^87.0+15.5*x^3.0-1.0/6304.468085106383/x^83.0-1.0/7419.78947368421*x^90.0+16.0*x^3.0-1.0/6787.79381443299/x^86.0-1.0/7944.857142857143*x^93.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-3.45876E7/x^77.0-3.362745E7*x^72.0-4.033029E7/x^80.0-3.9255216E7*x^75.0-4.675968E7/x^83.0-4.556088E7*x^78.0-5.392842E7/x^86.0-5.2596768E7*x^81.0-6.1891104E7/x^89.0-6.041715E7*x^84.0-7.070427E7/x^92.0-6.907824E7*x^87.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*-77.0/x^78.0-72.0*x^71.0-0.0*-80.0/x^81.0-75.0*x^74.0-0.0*-83.0/x^84.0-78.0*x^77.0-0.0*-86.0/x^87.0-81.0*x^80.0-0.0*-89.0/x^90.0-84.0*x^83.0-0.0*-92.0/x^93.0-0.0*87.0*x^86.0";
 UsageCalculus.EqnSolArrayMap2[4] = "0.0/x^78.0-72.0*x^71.0+0.0/x^81.0-75.0*x^74.0+0.0/x^84.0-78.0*x^77.0+0.0/x^87.0-81.0*x^80.0+0.0/x^90.0-84.0*x^83.0+0.0/x^93.0-0.0*x^86.0";
 UsageCalculus.EqnSolArrayMap3[4] = "13.5*x^3.0-1.0/4550.926829268293/x^71.0-1.0/5499.469879518072*x^78.0+14.0*x^3.0-1.0/4962.352941176471/x^74.0-1.0/5952.558139534884*x^81.0+14.5*x^3.0-1.0/5391.750000000001/x^77.0-1.0/6423.640449438202*x^84.0+15.0*x^3.0-1.0/5839.120879120878/x^80.0-1.0/6912.717391304348*x^87.0+15.5*x^3.0-1.0/6304.468085106383/x^83.0-1.0/7419.78947368421*x^90.0+16.0*x^3.0-1.0/6787.79381443299/x^86.0-1.0/7944.857142857143*x^93.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "13.5/4.0*x^4.0-1.0/4550.926829268293/-70.0/x^70.0-1.0/5499.469879518072/79.0*x^79.0+14.0/4.0*x^4.0-1.0/4962.352941176471/-73.0/x^73.0-1.0/5952.558139534884/82.0*x^82.0+14.5/4.0*x^4.0-1.0/5391.750000000001/-76.0/x^76.0-1.0/6423.640449438202/85.0*x^85.0+15.0/4.0*x^4.0-1.0/5839.120879120878/-79.0/x^79.0-1.0/6912.717391304348/88.0*x^88.0+15.5/4.0*x^4.0-1.0/6304.468085106383/-82.0/x^82.0-1.0/7419.78947368421/91.0*x^91.0+16.0/4.0*x^4.0-1.0/6787.79381443299/-85.0/x^85.0-1.0/7944.857142857143/94.0*x^94.0";
 UsageCalculus.EqnSolArrayMap4[4] = "3.375*x^4.0+1.0/318564.8780487805/x^70.0-1.0/434458.1204819277*x^79.0+3.5*x^4.0+1.0/362251.7647058824/x^73.0-1.0/488109.76744186046*x^82.0+3.625*x^4.0+1.0/409773.00000000006/x^76.0-1.0/546009.4382022471*x^85.0+3.75*x^4.0+1.0/461290.54945054936/x^79.0-1.0/608319.1304347826*x^88.0+3.875*x^4.0+1.0/516966.38297872344/x^82.0-1.0/675200.8421052631*x^91.0+4.0*x^4.0+1.0/576962.4742268041/x^85.0-1.0/746816.5714285715*x^94.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120360() {
 UsageCalculus.TestCase = 120360;
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

public static void TestCaseDiff120361() {
 UsageCalculus.TestCase = 120361;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-83*x^75+84+85/x^77-86*x^78+87*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-79+88/x^80-89*x^81+90*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-82+91/x^83-92*x^84+93*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-85+94/x^86-95*x^87+96+97/x^89-98*x^90+99+100/x^92-1*x^93+2*xy^-94";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-83.0*x^75.0+84.0+85.0/x^77.0-86.0*x^78.0+87.0+88.0/x^80.0-89.0*x^81.0+90.0+91.0/x^83.0-92.0*x^84.0+93.0+94.0/x^86.0-95.0*x^87.0+96.0+97.0/x^89.0-98.0*x^90.0+99.0+100.0/x^92.0-x^93.0+2.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-83.0*75.0*x^74.0+84.0*0.0+85.0*-77.0/x^78.0-86.0*78.0*x^77.0+87.0*0.0+88.0*-80.0/x^81.0-89.0*81.0*x^80.0+90.0*0.0+91.0*-83.0/x^84.0-92.0*84.0*x^83.0+93.0*0.0+94.0*-86.0/x^87.0-95.0*87.0*x^86.0+96.0*0.0+97.0*-89.0/x^90.0-98.0*90.0*x^89.0+99.0*0.0+100.0*-92.0/x^93.0-93.0*x^92.0+2.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-6225.0*x^74.0-6545.0/x^78.0-6708.0*x^77.0-7040.0/x^81.0-7209.0*x^80.0-7553.0/x^84.0-7728.0*x^83.0-8084.0/x^87.0-8265.0*x^86.0-8633.0/x^90.0-8820.0*x^89.0-9200.0/x^93.0-93.0*x^92.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-83.0*x^75.0+84.0+85.0/x^77.0-86.0*x^78.0+87.0+88.0/x^80.0-89.0*x^81.0+90.0+91.0/x^83.0-92.0*x^84.0+93.0+94.0/x^86.0-95.0*x^87.0+96.0+97.0/x^89.0-98.0*x^90.0+99.0+100.0/x^92.0-x^93.0+2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-83.0/76.0*x^76.0+84.0*x+85.0/-76.0/x^76.0-86.0/79.0*x^79.0+87.0*x+88.0/-79.0/x^79.0-89.0/82.0*x^82.0+90.0*x+91.0/-82.0/x^82.0-92.0/85.0*x^85.0+93.0*x+94.0/-85.0/x^85.0-95.0/88.0*x^88.0+96.0*x+97.0/-88.0/x^88.0-98.0/91.0*x^91.0+99.0*x+100.0/-91.0/x^91.0-1.0/94.0*x^94.0+2.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0921052631578947*x^76.0+84.0*x-1.118421052631579/x^76.0-1.0886075949367089*x^79.0+87.0*x-1.1139240506329113/x^79.0-1.0853658536585367*x^82.0+90.0*x-1.1097560975609757/x^82.0-1.0823529411764705*x^85.0+93.0*x-1.1058823529411765/x^85.0-1.0795454545454546*x^88.0+96.0*x-1.1022727272727273/x^88.0-1.0769230769230769*x^91.0+99.0*x-1.098901098901099/x^91.0-1.0/94.0*x^94.0+2.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-6225.0*x^74.0-6545.0/x^78.0-6708.0*x^77.0-7040.0/x^81.0-7209.0*x^80.0-7553.0/x^84.0-7728.0*x^83.0-8084.0/x^87.0-8265.0*x^86.0-8633.0/x^90.0-8820.0*x^89.0-9200.0/x^93.0-93.0*x^92.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-6225.0*74.0*x^73.0-6545.0*-78.0/x^79.0-6708.0*77.0*x^76.0-7040.0*-81.0/x^82.0-7209.0*80.0*x^79.0-7553.0*-84.0/x^85.0-7728.0*83.0*x^82.0-8084.0*-87.0/x^88.0-8265.0*86.0*x^85.0-8633.0*-90.0/x^91.0-8820.0*89.0*x^88.0-9200.0*-93.0/x^94.0-93.0*92.0*x^91.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-460650.0*x^73.0+510510.0/x^79.0-516516.0*x^76.0+570240.0/x^82.0-576720.0*x^79.0+634452.0/x^85.0-641424.0*x^82.0+703308.0/x^88.0-710790.0*x^85.0+776970.0/x^91.0-784980.0*x^88.0+855600.0/x^94.0-8556.0*x^91.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0921052631578947*x^76.0+84.0*x-1.118421052631579/x^76.0-1.0886075949367089*x^79.0+87.0*x-1.1139240506329113/x^79.0-1.0853658536585367*x^82.0+90.0*x-1.1097560975609757/x^82.0-1.0823529411764705*x^85.0+93.0*x-1.1058823529411765/x^85.0-1.0795454545454546*x^88.0+96.0*x-1.1022727272727273/x^88.0-1.0769230769230769*x^91.0+99.0*x-1.098901098901099/x^91.0-1.0/94.0*x^94.0+2.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0921052631578947/77.0*x^77.0+84.0/2.0*x^2.0-1.118421052631579/-75.0/x^75.0-1.0886075949367089/80.0*x^80.0+87.0/2.0*x^2.0-1.1139240506329113/-78.0/x^78.0-1.0853658536585367/83.0*x^83.0+90.0/2.0*x^2.0-1.1097560975609757/-81.0/x^81.0-1.0823529411764705/86.0*x^86.0+93.0/2.0*x^2.0-1.1058823529411765/-84.0/x^84.0-1.0795454545454546/89.0*x^89.0+96.0/2.0*x^2.0-1.1022727272727273/-87.0/x^87.0-1.0769230769230769/92.0*x^92.0+99.0/2.0*x^2.0-1.098901098901099/-90.0/x^90.0-1.0/94.0/95.0*x^95.0+x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/70.50602409638554*x^77.0+42.0*x^2.0+1.0/67.05882352941177/x^75.0-1.0/73.48837209302326*x^80.0+43.5*x^2.0+1.0/70.02272727272728/x^78.0-1.0/76.47191011235955*x^83.0+45.0*x^2.0+1.0/72.98901098901098/x^81.0-1.0/79.45652173913044*x^86.0+46.5*x^2.0+1.0/75.95744680851064/x^84.0-1.0/82.44210526315788*x^89.0+48.0*x^2.0+1.0/78.9278350515464/x^87.0-1.0/85.42857142857143*x^92.0+49.5*x^2.0+1.0/81.89999999999999/x^90.0-1.1198208286674133E-4*x^95.0+x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-460650.0*x^73.0+510510.0/x^79.0-516516.0*x^76.0+570240.0/x^82.0-576720.0*x^79.0+634452.0/x^85.0-641424.0*x^82.0+703308.0/x^88.0-710790.0*x^85.0+776970.0/x^91.0-784980.0*x^88.0+855600.0/x^94.0-8556.0*x^91.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-460650.0*73.0*x^72.0+510510.0*-79.0/x^80.0-516516.0*76.0*x^75.0+570240.0*-82.0/x^83.0-576720.0*79.0*x^78.0+634452.0*-85.0/x^86.0-641424.0*82.0*x^81.0+703308.0*-88.0/x^89.0-710790.0*85.0*x^84.0+776970.0*-91.0/x^92.0-784980.0*88.0*x^87.0+855600.0*-94.0/x^95.0-8556.0*91.0*x^90.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-3.362745E7*x^72.0-4.033029E7/x^80.0-3.9255216E7*x^75.0-4.675968E7/x^83.0-4.556088E7*x^78.0-5.392842E7/x^86.0-5.2596768E7*x^81.0-6.1891104E7/x^89.0-6.041715E7*x^84.0-7.070427E7/x^92.0-6.907824E7*x^87.0-8.04264E7/x^95.0-778596.0*x^90.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/70.50602409638554*x^77.0+42.0*x^2.0+1.0/67.05882352941177/x^75.0-1.0/73.48837209302326*x^80.0+43.5*x^2.0+1.0/70.02272727272728/x^78.0-1.0/76.47191011235955*x^83.0+45.0*x^2.0+1.0/72.98901098901098/x^81.0-1.0/79.45652173913044*x^86.0+46.5*x^2.0+1.0/75.95744680851064/x^84.0-1.0/82.44210526315788*x^89.0+48.0*x^2.0+1.0/78.9278350515464/x^87.0-1.0/85.42857142857143*x^92.0+49.5*x^2.0+1.0/81.89999999999999/x^90.0-1.1198208286674133E-4*x^95.0-4.0*x^95.0+x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/70.50602409638554/78.0*x^78.0+42.0/3.0*x^3.0+1.0/67.05882352941177/-74.0/x^74.0-1.0/73.48837209302326/81.0*x^81.0+43.5/3.0*x^3.0+1.0/70.02272727272728/-77.0/x^77.0-1.0/76.47191011235955/84.0*x^84.0+45.0/3.0*x^3.0+1.0/72.98901098901098/-80.0/x^80.0-1.0/79.45652173913044/87.0*x^87.0+46.5/3.0*x^3.0+1.0/75.95744680851064/-83.0/x^83.0-1.0/82.44210526315788/90.0*x^90.0+48.0/3.0*x^3.0+1.0/78.9278350515464/-86.0/x^86.0-1.0/85.42857142857143/93.0*x^93.0+49.5/3.0*x^3.0+1.0/81.89999999999999/-89.0/x^89.0-1.1198208286674133E-4/96.0*x^96.0-4.0/96.0*x^96.0+1.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/5499.469879518072*x^78.0+14.0*x^3.0-1.0/4962.352941176471/x^74.0-1.0/5952.558139534884*x^81.0+14.5*x^3.0-1.0/5391.750000000001/x^77.0-1.0/6423.640449438202*x^84.0+15.0*x^3.0-1.0/5839.120879120878/x^80.0-1.0/6912.717391304348*x^87.0+15.5*x^3.0-1.0/6304.468085106383/x^83.0-1.0/7419.78947368421*x^90.0+16.0*x^3.0-1.0/6787.79381443299/x^86.0-1.0/7944.857142857143*x^93.0+16.5*x^3.0-1.0/7289.099999999999/x^89.0-1.0/857280.0*x^96.0-1.0/24.0*x^96.0-1.0/24.0*x^96.0+1.0/3.0*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-3.362745E7*x^72.0-4.033029E7/x^80.0-3.9255216E7*x^75.0-4.675968E7/x^83.0-4.556088E7*x^78.0-5.392842E7/x^86.0-5.2596768E7*x^81.0-6.1891104E7/x^89.0-6.041715E7*x^84.0-7.070427E7/x^92.0-6.907824E7*x^87.0-8.04264E7/x^95.0-778596.0*x^90.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-72.0*x^71.0-0.0*-80.0/x^81.0-75.0*x^74.0-0.0*-83.0/x^84.0-78.0*x^77.0-0.0*-86.0/x^87.0-81.0*x^80.0-0.0*-89.0/x^90.0-84.0*x^83.0-0.0*-92.0/x^93.0-87.0*x^86.0-0.0*-95.0/x^96.0-778596.0*90.0*x^89.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-72.0*x^71.0+0.0/x^81.0-75.0*x^74.0+0.0/x^84.0-78.0*x^77.0+0.0/x^87.0-81.0*x^80.0+0.0/x^90.0-84.0*x^83.0+0.0/x^93.0-87.0*x^86.0+0.0/x^96.0-7.007364E7*x^89.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/5499.469879518072*x^78.0+14.0*x^3.0-1.0/4962.352941176471/x^74.0-1.0/5952.558139534884*x^81.0+14.5*x^3.0-1.0/5391.750000000001/x^77.0-1.0/6423.640449438202*x^84.0+15.0*x^3.0-1.0/5839.120879120878/x^80.0-1.0/6912.717391304348*x^87.0+15.5*x^3.0-1.0/6304.468085106383/x^83.0-1.0/7419.78947368421*x^90.0+16.0*x^3.0-1.0/6787.79381443299/x^86.0-1.0/7944.857142857143*x^93.0+16.5*x^3.0-1.0/7289.099999999999/x^89.0-1.0/857280.0*x^96.0-1.0/24.0*x^96.0-1.0/24.0*x^96.0+1.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/5499.469879518072/79.0*x^79.0+14.0/4.0*x^4.0-1.0/4962.352941176471/-73.0/x^73.0-1.0/5952.558139534884/82.0*x^82.0+14.5/4.0*x^4.0-1.0/5391.750000000001/-76.0/x^76.0-1.0/6423.640449438202/85.0*x^85.0+15.0/4.0*x^4.0-1.0/5839.120879120878/-79.0/x^79.0-1.0/6912.717391304348/88.0*x^88.0+15.5/4.0*x^4.0-1.0/6304.468085106383/-82.0/x^82.0-1.0/7419.78947368421/91.0*x^91.0+16.0/4.0*x^4.0-1.0/6787.79381443299/-85.0/x^85.0-1.0/7944.857142857143/94.0*x^94.0+16.5/4.0*x^4.0-1.0/7289.099999999999/-88.0/x^88.0-1.0/857280.0/97.0*x^97.0-1.0/24.0/97.0*x^97.0-1.0/24.0/97.0*x^97.0+1.0/3.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/434458.1204819277*x^79.0+3.5*x^4.0+1.0/362251.7647058824/x^73.0-1.0/488109.76744186046*x^82.0+3.625*x^4.0+1.0/409773.00000000006/x^76.0-1.0/546009.4382022471*x^85.0+3.75*x^4.0+1.0/461290.54945054936/x^79.0-1.0/608319.1304347826*x^88.0+3.875*x^4.0+1.0/516966.38297872344/x^82.0-1.0/675200.8421052631*x^91.0+4.0*x^4.0+1.0/576962.4742268041/x^85.0-1.0/746816.5714285715*x^94.0+4.125*x^4.0+1.0/641440.7999999999/x^88.0-1.0/8.315616E7*x^97.0-1.0/2328.0*x^97.0-1.0/2328.0*x^97.0+1.0/12.0*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120362() {
 UsageCalculus.TestCase = 120362;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+85/x^77-86*x^78";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "85.0/x^77.0-86.0*x^78.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "85.0*-77.0/x^78.0-86.0*78.0*x^77.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-6545.0/x^78.0-6708.0*x^77.0";
 UsageCalculus.EqnSolArrayMap3[1] = "85.0/x^77.0-86.0*x^78.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "85.0/-76.0/x^76.0-86.0/79.0*x^79.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.118421052631579/x^76.0-1.0886075949367089*x^79.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-6545.0/x^78.0-6708.0*x^77.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-6545.0*-78.0/x^79.0-6708.0*77.0*x^76.0";
 UsageCalculus.EqnSolArrayMap2[2] = "510510.0/x^79.0-516516.0*x^76.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.118421052631579/x^76.0-1.0886075949367089*x^79.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.118421052631579/-75.0/x^75.0-1.0886075949367089/80.0*x^80.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/67.05882352941177/x^75.0-1.0/73.48837209302326*x^80.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "510510.0/x^79.0-516516.0*x^76.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "510510.0*-79.0/x^80.0-516516.0*76.0*x^75.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-4.033029E7/x^80.0-3.9255216E7*x^75.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/67.05882352941177/x^75.0-1.0/73.48837209302326*x^80.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/67.05882352941177/-74.0/x^74.0-1.0/73.48837209302326/81.0*x^81.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/4962.352941176471/x^74.0-1.0/5952.558139534884*x^81.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-4.033029E7/x^80.0-3.9255216E7*x^75.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*-80.0/x^81.0-0.0*75.0*x^74.0";
 UsageCalculus.EqnSolArrayMap2[4] = "0.0/x^81.0-0.0*x^74.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/4962.352941176471/x^74.0-1.0/5952.558139534884*x^81.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/4962.352941176471/-73.0/x^73.0-1.0/5952.558139534884/82.0*x^82.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/362251.7647058824/x^73.0-1.0/488109.76744186046*x^82.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120363() {
 UsageCalculus.TestCase = 120363;
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

public static void TestCaseDiff120364() {
 UsageCalculus.TestCase = 120364;
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

public static void TestCaseDiff120365() {
 UsageCalculus.TestCase = 120365;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+88/x^80-89*x^81+90*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-82+91/x^83-92*x^84";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "88.0/x^80.0-89.0*x^81.0+90.0+91.0/x^83.0-92.0*x^84.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "88.0*-80.0/x^81.0-89.0*81.0*x^80.0+90.0*0.0+91.0*-83.0/x^84.0-92.0*84.0*x^83.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-7040.0/x^81.0-7209.0*x^80.0-7553.0/x^84.0-7728.0*x^83.0";
 UsageCalculus.EqnSolArrayMap3[1] = "88.0/x^80.0-89.0*x^81.0+90.0+91.0/x^83.0-92.0*x^84.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "88.0/-79.0/x^79.0-89.0/82.0*x^82.0+90.0*x+91.0/-82.0/x^82.0-92.0/85.0*x^85.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.1139240506329113/x^79.0-1.0853658536585367*x^82.0+90.0*x-1.1097560975609757/x^82.0-1.0823529411764705*x^85.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-7040.0/x^81.0-7209.0*x^80.0-7553.0/x^84.0-7728.0*x^83.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-7040.0*-81.0/x^82.0-7209.0*80.0*x^79.0-7553.0*-84.0/x^85.0-7728.0*83.0*x^82.0";
 UsageCalculus.EqnSolArrayMap2[2] = "570240.0/x^82.0-576720.0*x^79.0+634452.0/x^85.0-641424.0*x^82.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.1139240506329113/x^79.0-1.0853658536585367*x^82.0+90.0*x-1.1097560975609757/x^82.0-1.0823529411764705*x^85.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.1139240506329113/-78.0/x^78.0-1.0853658536585367/83.0*x^83.0+90.0/2.0*x^2.0-1.1097560975609757/-81.0/x^81.0-1.0823529411764705/86.0*x^86.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/70.02272727272728/x^78.0-1.0/76.47191011235955*x^83.0+45.0*x^2.0+1.0/72.98901098901098/x^81.0-1.0/79.45652173913044*x^86.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "570240.0/x^82.0-576720.0*x^79.0+634452.0/x^85.0-641424.0*x^82.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "570240.0*-82.0/x^83.0-576720.0*79.0*x^78.0+634452.0*-85.0/x^86.0-641424.0*82.0*x^81.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-4.675968E7/x^83.0-4.556088E7*x^78.0-5.392842E7/x^86.0-5.2596768E7*x^81.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/70.02272727272728/x^78.0-1.0/76.47191011235955*x^83.0+45.0*x^2.0+1.0/72.98901098901098/x^81.0-1.0/79.45652173913044*x^86.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/70.02272727272728/-77.0/x^77.0-1.0/76.47191011235955/84.0*x^84.0+45.0/3.0*x^3.0+1.0/72.98901098901098/-80.0/x^80.0-1.0/79.45652173913044/87.0*x^87.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/5391.750000000001/x^77.0-1.0/6423.640449438202*x^84.0+15.0*x^3.0-1.0/5839.120879120878/x^80.0-1.0/6912.717391304348*x^87.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-4.675968E7/x^83.0-4.556088E7*x^78.0-5.392842E7/x^86.0-5.2596768E7*x^81.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*-83.0/x^84.0-78.0*x^77.0-0.0*-86.0/x^87.0-0.0*81.0*x^80.0";
 UsageCalculus.EqnSolArrayMap2[4] = "0.0/x^84.0-78.0*x^77.0+0.0/x^87.0-0.0*x^80.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/5391.750000000001/x^77.0-1.0/6423.640449438202*x^84.0+15.0*x^3.0-1.0/5839.120879120878/x^80.0-1.0/6912.717391304348*x^87.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/5391.750000000001/-76.0/x^76.0-1.0/6423.640449438202/85.0*x^85.0+15.0/4.0*x^4.0-1.0/5839.120879120878/-79.0/x^79.0-1.0/6912.717391304348/88.0*x^88.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/409773.00000000006/x^76.0-1.0/546009.4382022471*x^85.0+3.75*x^4.0+1.0/461290.54945054936/x^79.0-1.0/608319.1304347826*x^88.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120366() {
 UsageCalculus.TestCase = 120366;
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

public static void TestCaseDiff120367() {
 UsageCalculus.TestCase = 120367;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+90*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-82+91/x^83-92*x^84+93*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-85+94/x^86-95*x^87+96";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "90.0+91.0/x^83.0-92.0*x^84.0+93.0+94.0/x^86.0-95.0*x^87.0+96.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+91.0*-83.0/x^84.0-92.0*84.0*x^83.0+93.0*0.0+94.0*-86.0/x^87.0-95.0*87.0*x^86.0+96.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-7553.0/x^84.0-7728.0*x^83.0-8084.0/x^87.0-8265.0*x^86.0";
 UsageCalculus.EqnSolArrayMap3[1] = "90.0+91.0/x^83.0-92.0*x^84.0+93.0+94.0/x^86.0-95.0*x^87.0+96.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "90.0*x+91.0/-82.0/x^82.0-92.0/85.0*x^85.0+93.0*x+94.0/-85.0/x^85.0-95.0/88.0*x^88.0+96.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "90.0*x-1.1097560975609757/x^82.0-1.0823529411764705*x^85.0+93.0*x-1.1058823529411765/x^85.0-1.0795454545454546*x^88.0+96.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-7553.0/x^84.0-7728.0*x^83.0-8084.0/x^87.0-8265.0*x^86.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-7553.0*-84.0/x^85.0-7728.0*83.0*x^82.0-8084.0*-87.0/x^88.0-8265.0*86.0*x^85.0";
 UsageCalculus.EqnSolArrayMap2[2] = "634452.0/x^85.0-641424.0*x^82.0+703308.0/x^88.0-710790.0*x^85.0";
 UsageCalculus.EqnSolArrayMap3[2] = "90.0*x-1.1097560975609757/x^82.0-1.0823529411764705*x^85.0+93.0*x-1.1058823529411765/x^85.0-1.0795454545454546*x^88.0+96.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "90.0/2.0*x^2.0-1.1097560975609757/-81.0/x^81.0-1.0823529411764705/86.0*x^86.0+93.0/2.0*x^2.0-1.1058823529411765/-84.0/x^84.0-1.0795454545454546/89.0*x^89.0+96.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "45.0*x^2.0+1.0/72.98901098901098/x^81.0-1.0/79.45652173913044*x^86.0+46.5*x^2.0+1.0/75.95744680851064/x^84.0-1.0/82.44210526315788*x^89.0+48.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "634452.0/x^85.0-641424.0*x^82.0+703308.0/x^88.0-710790.0*x^85.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "634452.0*-85.0/x^86.0-641424.0*82.0*x^81.0+703308.0*-88.0/x^89.0-710790.0*85.0*x^84.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-5.392842E7/x^86.0-5.2596768E7*x^81.0-6.1891104E7/x^89.0-6.041715E7*x^84.0";
 UsageCalculus.EqnSolArrayMap3[3] = "45.0*x^2.0+1.0/72.98901098901098/x^81.0-1.0/79.45652173913044*x^86.0+46.5*x^2.0+1.0/75.95744680851064/x^84.0-1.0/82.44210526315788*x^89.0+48.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "45.0/3.0*x^3.0+1.0/72.98901098901098/-80.0/x^80.0-1.0/79.45652173913044/87.0*x^87.0+46.5/3.0*x^3.0+1.0/75.95744680851064/-83.0/x^83.0-1.0/82.44210526315788/90.0*x^90.0+48.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "15.0*x^3.0-1.0/5839.120879120878/x^80.0-1.0/6912.717391304348*x^87.0+15.5*x^3.0-1.0/6304.468085106383/x^83.0-1.0/7419.78947368421*x^90.0+16.0*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-5.392842E7/x^86.0-5.2596768E7*x^81.0-6.1891104E7/x^89.0-6.041715E7*x^84.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*-86.0/x^87.0-81.0*x^80.0-0.0*-89.0/x^90.0-0.0*84.0*x^83.0";
 UsageCalculus.EqnSolArrayMap2[4] = "0.0/x^87.0-81.0*x^80.0+0.0/x^90.0-0.0*x^83.0";
 UsageCalculus.EqnSolArrayMap3[4] = "15.0*x^3.0-1.0/5839.120879120878/x^80.0-1.0/6912.717391304348*x^87.0+15.5*x^3.0-1.0/6304.468085106383/x^83.0-1.0/7419.78947368421*x^90.0+16.0*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "15.0/4.0*x^4.0-1.0/5839.120879120878/-79.0/x^79.0-1.0/6912.717391304348/88.0*x^88.0+15.5/4.0*x^4.0-1.0/6304.468085106383/-82.0/x^82.0-1.0/7419.78947368421/91.0*x^91.0+16.0/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "3.75*x^4.0+1.0/461290.54945054936/x^79.0-1.0/608319.1304347826*x^88.0+3.875*x^4.0+1.0/516966.38297872344/x^82.0-1.0/675200.8421052631*x^91.0+4.0*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120368() {
 UsageCalculus.TestCase = 120368;
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

public static void TestCaseDiff120369() {
 UsageCalculus.TestCase = 120369;
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

public static void TestCaseDiff120370() {
 UsageCalculus.TestCase = 120370;
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

public static void TestCaseDiff120371() {
 UsageCalculus.TestCase = 120371;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+94/x^86-95*x^87+96+97/x^89-98*x^90+99+100/x^92-1*x^93+2*xy^-94+3/x^95-4*x^96";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "94.0/x^86.0-95.0*x^87.0+96.0+97.0/x^89.0-98.0*x^90.0+99.0+100.0/x^92.0-x^93.0+2.0+3.0/x^95.0-4.0*x^96.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "94.0*-86.0/x^87.0-95.0*87.0*x^86.0+96.0*0.0+97.0*-89.0/x^90.0-98.0*90.0*x^89.0+99.0*0.0+100.0*-92.0/x^93.0-93.0*x^92.0+2.0*0.0+3.0*-95.0/x^96.0-4.0*96.0*x^95.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-8084.0/x^87.0-8265.0*x^86.0-8633.0/x^90.0-8820.0*x^89.0-9200.0/x^93.0-93.0*x^92.0-285.0/x^96.0-384.0*x^95.0";
 UsageCalculus.EqnSolArrayMap3[1] = "94.0/x^86.0-95.0*x^87.0+96.0+97.0/x^89.0-98.0*x^90.0+99.0+100.0/x^92.0-x^93.0+2.0+3.0/x^95.0-4.0*x^96.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "94.0/-85.0/x^85.0-95.0/88.0*x^88.0+96.0*x+97.0/-88.0/x^88.0-98.0/91.0*x^91.0+99.0*x+100.0/-91.0/x^91.0-1.0/94.0*x^94.0+2.0*x+3.0/-94.0/x^94.0-4.0/97.0*x^97.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.1058823529411765/x^85.0-1.0795454545454546*x^88.0+96.0*x-1.1022727272727273/x^88.0-1.0769230769230769*x^91.0+99.0*x-1.098901098901099/x^91.0-1.0/94.0*x^94.0+2.0*x-1.0/31.333333333333332/x^94.0-1.0/24.25*x^97.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-8084.0/x^87.0-8265.0*x^86.0-8633.0/x^90.0-8820.0*x^89.0-9200.0/x^93.0-93.0*x^92.0-285.0/x^96.0-384.0*x^95.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-8084.0*-87.0/x^88.0-8265.0*86.0*x^85.0-8633.0*-90.0/x^91.0-8820.0*89.0*x^88.0-9200.0*-93.0/x^94.0-93.0*92.0*x^91.0-285.0*-96.0/x^97.0-384.0*95.0*x^94.0";
 UsageCalculus.EqnSolArrayMap2[2] = "703308.0/x^88.0-710790.0*x^85.0+776970.0/x^91.0-784980.0*x^88.0+855600.0/x^94.0-8556.0*x^91.0+27360.0/x^97.0-36480.0*x^94.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.1058823529411765/x^85.0-1.0795454545454546*x^88.0+96.0*x-1.1022727272727273/x^88.0-1.0769230769230769*x^91.0+99.0*x-1.098901098901099/x^91.0-1.0/94.0*x^94.0+2.0*x-1.0/31.333333333333332/x^94.0-1.0/24.25*x^97.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.1058823529411765/-84.0/x^84.0-1.0795454545454546/89.0*x^89.0+96.0/2.0*x^2.0-1.1022727272727273/-87.0/x^87.0-1.0769230769230769/92.0*x^92.0+99.0/2.0*x^2.0-1.098901098901099/-90.0/x^90.0-1.0/94.0/95.0*x^95.0+x^2.0-1.0/31.333333333333332/-93.0/x^93.0-1.0/24.25/98.0*x^98.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/75.95744680851064/x^84.0-1.0/82.44210526315788*x^89.0+48.0*x^2.0+1.0/78.9278350515464/x^87.0-1.0/85.42857142857143*x^92.0+49.5*x^2.0+1.0/81.89999999999999/x^90.0-1.1198208286674133E-4*x^95.0+x^2.0+1.0/2914.0/x^93.0-1.0/2376.5*x^98.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "703308.0/x^88.0-710790.0*x^85.0+776970.0/x^91.0-784980.0*x^88.0+855600.0/x^94.0-8556.0*x^91.0+27360.0/x^97.0-36480.0*x^94.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "703308.0*-88.0/x^89.0-710790.0*85.0*x^84.0+776970.0*-91.0/x^92.0-784980.0*88.0*x^87.0+855600.0*-94.0/x^95.0-8556.0*91.0*x^90.0+27360.0*-97.0/x^98.0-36480.0*94.0*x^93.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-6.1891104E7/x^89.0-6.041715E7*x^84.0-7.070427E7/x^92.0-6.907824E7*x^87.0-8.04264E7/x^95.0-778596.0*x^90.0-2653920.0/x^98.0-3429120.0*x^93.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/75.95744680851064/x^84.0-1.0/82.44210526315788*x^89.0+48.0*x^2.0+1.0/78.9278350515464/x^87.0-1.0/85.42857142857143*x^92.0+49.5*x^2.0+1.0/81.89999999999999/x^90.0-1.1198208286674133E-4*x^95.0-4.0*x^95.0+x^2.0+1.0/2914.0/x^93.0-1.0/2376.5*x^98.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/75.95744680851064/-83.0/x^83.0-1.0/82.44210526315788/90.0*x^90.0+48.0/3.0*x^3.0+1.0/78.9278350515464/-86.0/x^86.0-1.0/85.42857142857143/93.0*x^93.0+49.5/3.0*x^3.0+1.0/81.89999999999999/-89.0/x^89.0-1.1198208286674133E-4/96.0*x^96.0-4.0/96.0*x^96.0+1.0/3.0*x^3.0+1.0/2914.0/-92.0/x^92.0-1.0/2376.5/99.0*x^99.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/6304.468085106383/x^83.0-1.0/7419.78947368421*x^90.0+16.0*x^3.0-1.0/6787.79381443299/x^86.0-1.0/7944.857142857143*x^93.0+16.5*x^3.0-1.0/7289.099999999999/x^89.0-1.0/857280.0*x^96.0-1.0/24.0*x^96.0-1.0/24.0*x^96.0+1.0/3.0*x^3.0-1.0/268088.0/x^92.0-1.0/235273.5*x^99.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-6.1891104E7/x^89.0-6.041715E7*x^84.0-7.070427E7/x^92.0-6.907824E7*x^87.0-8.04264E7/x^95.0-778596.0*x^90.0-2653920.0/x^98.0-3429120.0*x^93.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*-89.0/x^90.0-84.0*x^83.0-0.0*-92.0/x^93.0-87.0*x^86.0-0.0*-95.0/x^96.0-778596.0*90.0*x^89.0-2653920.0*-98.0/x^99.0-3429120.0*93.0*x^92.0";
 UsageCalculus.EqnSolArrayMap2[4] = "0.0/x^90.0-84.0*x^83.0+0.0/x^93.0-87.0*x^86.0+0.0/x^96.0-7.007364E7*x^89.0+2.6008416E8/x^99.0-3.1890816E8*x^92.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/6304.468085106383/x^83.0-1.0/7419.78947368421*x^90.0+16.0*x^3.0-1.0/6787.79381443299/x^86.0-1.0/7944.857142857143*x^93.0+16.5*x^3.0-1.0/7289.099999999999/x^89.0-1.0/857280.0*x^96.0-1.0/24.0*x^96.0-1.0/24.0*x^96.0+1.0/3.0*x^3.0-1.0/268088.0/x^92.0-1.0/235273.5*x^99.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/6304.468085106383/-82.0/x^82.0-1.0/7419.78947368421/91.0*x^91.0+16.0/4.0*x^4.0-1.0/6787.79381443299/-85.0/x^85.0-1.0/7944.857142857143/94.0*x^94.0+16.5/4.0*x^4.0-1.0/7289.099999999999/-88.0/x^88.0-1.0/857280.0/97.0*x^97.0-1.0/24.0/97.0*x^97.0-1.0/24.0/97.0*x^97.0+1.0/3.0/4.0*x^4.0-1.0/268088.0/-91.0/x^91.0-1.0/235273.5/100.0*x^100.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/516966.38297872344/x^82.0-1.0/675200.8421052631*x^91.0+4.0*x^4.0+1.0/576962.4742268041/x^85.0-1.0/746816.5714285715*x^94.0+4.125*x^4.0+1.0/641440.7999999999/x^88.0-1.0/8.315616E7*x^97.0-1.0/2328.0*x^97.0-1.0/2328.0*x^97.0+1.0/12.0*x^4.0+1.0/2.4396008E7/x^91.0-1.0/2.352735E7*x^100.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120372() {
 UsageCalculus.TestCase = 120372;
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

public static void TestCaseDiff120373() {
 UsageCalculus.TestCase = 120373;
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

public static void TestCaseDiff120374() {
 UsageCalculus.TestCase = 120374;
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

public static void TestCaseDiff120375() {
 UsageCalculus.TestCase = 120375;
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

public static void TestCaseDiff120376() {
 UsageCalculus.TestCase = 120376;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+99+100/x^92-1*x^93+2*xy^-94+3/x^95-4*x^96+5*xyzxy^-97+6/x^98-7*x^99+8*xyzxyzxy^-100+9/x^1-10*x^2+11+12/x^4-13*x^5+14";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "99.0+100.0/x^92.0-x^93.0+2.0+3.0/x^95.0-4.0*x^96.0+5.0+6.0/x^98.0-7.0*x^99.0+8.0+9.0/x-10.0*x^2.0+11.0+12.0/x^4.0-13.0*x^5.0+14.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+100.0*-92.0/x^93.0-93.0*x^92.0+2.0*0.0+3.0*-95.0/x^96.0-4.0*96.0*x^95.0+5.0*0.0+6.0*-98.0/x^99.0-7.0*99.0*x^98.0+8.0*0.0-9.0/x^2.0-10.0*2.0*x^1.0+11.0*0.0+12.0*-4.0/x^5.0-13.0*5.0*x^4.0+14.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-9200.0/x^93.0-93.0*x^92.0-285.0/x^96.0-384.0*x^95.0-588.0/x^99.0-693.0*x^98.0-9.0/x^2.0-20.0*x-48.0/x^5.0-65.0*x^4.0";
 UsageCalculus.EqnSolArrayMap3[1] = "99.0+100.0/x^92.0-x^93.0+2.0+3.0/x^95.0-4.0*x^96.0+5.0+6.0/x^98.0-7.0*x^99.0+8.0+9.0/x-10.0*x^2.0+11.0+12.0/x^4.0-13.0*x^5.0+14.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "99.0*x+100.0/-91.0/x^91.0-1.0/94.0*x^94.0+2.0*x+3.0/-94.0/x^94.0-4.0/97.0*x^97.0+5.0*x+6.0/-97.0/x^97.0-7.0/100.0*x^100.0+8.0*x+9.0*ln(x)-10.0/3.0*x^3.0+11.0*x+12.0/-3.0/x^3.0-13.0/6.0*x^6.0+14.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "99.0*x-1.098901098901099/x^91.0-1.0/94.0*x^94.0+2.0*x-1.0/31.333333333333332/x^94.0-1.0/24.25*x^97.0+5.0*x-1.0/16.166666666666668/x^97.0-1.0/14.285714285714286*x^100.0+8.0*x+9.0*ln(x)-3.3333333333333335*x^3.0+11.0*x-4.0/x^3.0-2.1666666666666665*x^6.0+14.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-9200.0/x^93.0-93.0*x^92.0-285.0/x^96.0-384.0*x^95.0-588.0/x^99.0-693.0*x^98.0-9.0/x^2.0-20.0*x-48.0/x^5.0-65.0*x^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-9200.0*-93.0/x^94.0-93.0*92.0*x^91.0-285.0*-96.0/x^97.0-384.0*95.0*x^94.0-588.0*-99.0/x^100.0-693.0*98.0*x^97.0-9.0*-2.0/x^3.0-20.0-48.0*-5.0/x^6.0-65.0*4.0*x^3.0";
 UsageCalculus.EqnSolArrayMap2[2] = "855600.0/x^94.0-8556.0*x^91.0+27360.0/x^97.0-36480.0*x^94.0+58212.0/x^100.0-67914.0*x^97.0+18.0/x^3.0-20.0+240.0/x^6.0-260.0*x^3.0";
 UsageCalculus.EqnSolArrayMap3[2] = "99.0*x-1.098901098901099/x^91.0-1.0/94.0*x^94.0+2.0*x-1.0/31.333333333333332/x^94.0-1.0/24.25*x^97.0+5.0*x-1.0/16.166666666666668/x^97.0-1.0/14.285714285714286*x^100.0+8.0*x+9.0*ln(x)-3.3333333333333335*x^3.0+11.0*x-4.0/x^3.0-2.1666666666666665*x^6.0+14.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "99.0/2.0*x^2.0-1.098901098901099/-90.0/x^90.0-1.0/94.0/95.0*x^95.0+x^2.0-1.0/31.333333333333332/-93.0/x^93.0-1.0/24.25/98.0*x^98.0+5.0/2.0*x^2.0-1.0/16.166666666666668/-96.0/x^96.0-1.0/14.285714285714286/101.0*x^101.0+8.0/2.0*x^2.0+9.0*x-3.3333333333333335/4.0*x^4.0+11.0/2.0*x^2.0-4.0/-2.0/x^2.0-2.1666666666666665/7.0*x^7.0+14.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "49.5*x^2.0+1.0/81.89999999999999/x^90.0-1.1198208286674133E-4*x^95.0+x^2.0+1.0/2914.0/x^93.0-1.0/2376.5*x^98.0+2.5*x^2.0+1.0/1552.0/x^96.0-1.0/1442.857142857143*x^101.0+4.0*x^2.0+9.0*x-1.0/1.2*x^4.0+5.5*x^2.0+2.0/x^2.0-1.0/3.230769230769231*x^7.0+7.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "855600.0/x^94.0-8556.0*x^91.0+27360.0/x^97.0-36480.0*x^94.0+58212.0/x^100.0-67914.0*x^97.0+18.0/x^3.0-20.0+240.0/x^6.0-260.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "855600.0*-94.0/x^95.0-8556.0*91.0*x^90.0+27360.0*-97.0/x^98.0-36480.0*94.0*x^93.0+58212.0*-100.0/x^101.0-67914.0*97.0*x^96.0+18.0*-3.0/x^4.0-20.0*0.0+240.0*-6.0/x^7.0-260.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-8.04264E7/x^95.0-778596.0*x^90.0-2653920.0/x^98.0-3429120.0*x^93.0-5821200.0/x^101.0-6587658.0*x^96.0-54.0/x^4.0-1440.0/x^7.0-780.0*x^2.0";
 UsageCalculus.EqnSolArrayMap3[3] = "49.5*x^2.0+1.0/81.89999999999999/x^90.0-1.1198208286674133E-4*x^95.0-4.0*x^95.0+x^2.0+1.0/2914.0/x^93.0-1.0/2376.5*x^98.0+2.5*x^2.0+1.0/1552.0/x^96.0-1.0/1442.857142857143*x^101.0+4.0*x^2.0+9.0*x-1.0/1.2*x^4.0+5.5*x^2.0+2.0/x^2.0-1.0/3.230769230769231*x^7.0+7.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "49.5/3.0*x^3.0+1.0/81.89999999999999/-89.0/x^89.0-1.1198208286674133E-4/96.0*x^96.0-4.0/96.0*x^96.0+1.0/3.0*x^3.0+1.0/2914.0/-92.0/x^92.0-1.0/2376.5/99.0*x^99.0+2.5/3.0*x^3.0+1.0/1552.0/-95.0/x^95.0-1.0/1442.857142857143/102.0*x^102.0+4.0/3.0*x^3.0+9.0/2.0*x^2.0-1.0/1.2/5.0*x^5.0+5.5/3.0*x^3.0+2.0/-1.0/x^1.0-1.0/3.230769230769231/8.0*x^8.0+7.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "16.5*x^3.0-1.0/7289.099999999999/x^89.0-1.0/857280.0*x^96.0-1.0/24.0*x^96.0-1.0/24.0*x^96.0+1.0/3.0*x^3.0-1.0/268088.0/x^92.0-1.0/235273.5*x^99.0+1.0/1.2*x^3.0-1.0/147440.0/x^95.0-1.0/147171.42857142858*x^102.0+1.3333333333333333*x^3.0+4.5*x^2.0-1.0/6.0*x^5.0+1.8333333333333333*x^3.0-2.0/x-1.0/25.846153846153847*x^8.0+2.3333333333333335*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-8.04264E7/x^95.0-778596.0*x^90.0-2653920.0/x^98.0-3429120.0*x^93.0-5821200.0/x^101.0-6587658.0*x^96.0-54.0/x^4.0-1440.0/x^7.0-780.0*x^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0*-95.0/x^96.0-778596.0*90.0*x^89.0-2653920.0*-98.0/x^99.0-3429120.0*93.0*x^92.0-5821200.0*-101.0/x^102.0-6587658.0*96.0*x^95.0-54.0*-4.0/x^5.0-1440.0*-7.0/x^8.0-780.0*2.0*x^1.0";
 UsageCalculus.EqnSolArrayMap2[4] = "0.0/x^96.0-7.007364E7*x^89.0+2.6008416E8/x^99.0-3.1890816E8*x^92.0+5.879412E8/x^102.0-6.32415168E8*x^95.0+216.0/x^5.0+10080.0/x^8.0-1560.0*x";
 UsageCalculus.EqnSolArrayMap3[4] = "16.5*x^3.0-1.0/7289.099999999999/x^89.0-1.0/857280.0*x^96.0-1.0/24.0*x^96.0-1.0/24.0*x^96.0+1.0/3.0*x^3.0-1.0/268088.0/x^92.0-1.0/235273.5*x^99.0+1.0/1.2*x^3.0-1.0/147440.0/x^95.0-1.0/147171.42857142858*x^102.0+1.3333333333333333*x^3.0+4.5*x^2.0-1.0/6.0*x^5.0+1.8333333333333333*x^3.0-2.0/x-1.0/25.846153846153847*x^8.0+2.3333333333333335*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "16.5/4.0*x^4.0-1.0/7289.099999999999/-88.0/x^88.0-1.0/857280.0/97.0*x^97.0-1.0/24.0/97.0*x^97.0-1.0/24.0/97.0*x^97.0+1.0/3.0/4.0*x^4.0-1.0/268088.0/-91.0/x^91.0-1.0/235273.5/100.0*x^100.0+1.0/1.2/4.0*x^4.0-1.0/147440.0/-94.0/x^94.0-1.0/147171.42857142858/103.0*x^103.0+1.3333333333333333/4.0*x^4.0+4.5/3.0*x^3.0-1.0/6.0/6.0*x^6.0+1.8333333333333333/4.0*x^4.0-2.0*ln(x)-1.0/25.846153846153847/9.0*x^9.0+2.3333333333333335/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "4.125*x^4.0+1.0/641440.7999999999/x^88.0-1.0/8.315616E7*x^97.0-1.0/2328.0*x^97.0-1.0/2328.0*x^97.0+1.0/12.0*x^4.0+1.0/2.4396008E7/x^91.0-1.0/2.352735E7*x^100.0+1.0/4.8*x^4.0+1.0/1.385936E7/x^94.0-1.0/1.5158657142857144E7*x^103.0+1.0/3.0*x^4.0+1.5*x^3.0-1.0/36.0*x^6.0+1.0/2.181818181818182*x^4.0-2.0*ln(x)-1.0/232.6153846153846*x^9.0+1.0/1.7142857142857142*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120377() {
 UsageCalculus.TestCase = 120377;
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

public static void TestCaseDiff120378() {
 UsageCalculus.TestCase = 120378;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-1*x^93+2*xy^-94+3/x^95-4*x^96+5*xyzxy^-97+6/x^98-7*x^99+8*xyzxyzxy^-100+9/x^1-10*x^2+11+12/x^4-13*x^5+14+15/x^7-16*x^8+17*xyzxyzxyzxyzxyzxy^-9+18/x^10";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x^93.0+2.0+3.0/x^95.0-4.0*x^96.0+5.0+6.0/x^98.0-7.0*x^99.0+8.0+9.0/x-10.0*x^2.0+11.0+12.0/x^4.0-13.0*x^5.0+14.0+15.0/x^7.0-16.0*x^8.0+17.0+18.0/x^10.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-93.0*x^92.0+2.0*0.0+3.0*-95.0/x^96.0-4.0*96.0*x^95.0+5.0*0.0+6.0*-98.0/x^99.0-7.0*99.0*x^98.0+8.0*0.0-9.0/x^2.0-10.0*2.0*x^1.0+11.0*0.0+12.0*-4.0/x^5.0-13.0*5.0*x^4.0+14.0*0.0+15.0*-7.0/x^8.0-16.0*8.0*x^7.0+17.0*0.0+18.0*-10.0/x^11.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-93.0*x^92.0-285.0/x^96.0-384.0*x^95.0-588.0/x^99.0-693.0*x^98.0-9.0/x^2.0-20.0*x-48.0/x^5.0-65.0*x^4.0-105.0/x^8.0-128.0*x^7.0-180.0/x^11.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x^93.0+2.0+3.0/x^95.0-4.0*x^96.0+5.0+6.0/x^98.0-7.0*x^99.0+8.0+9.0/x-10.0*x^2.0+11.0+12.0/x^4.0-13.0*x^5.0+14.0+15.0/x^7.0-16.0*x^8.0+17.0+18.0/x^10.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.0/94.0*x^94.0+2.0*x+3.0/-94.0/x^94.0-4.0/97.0*x^97.0+5.0*x+6.0/-97.0/x^97.0-7.0/100.0*x^100.0+8.0*x+9.0*ln(x)-10.0/3.0*x^3.0+11.0*x+12.0/-3.0/x^3.0-13.0/6.0*x^6.0+14.0*x+15.0/-6.0/x^6.0-16.0/9.0*x^9.0+17.0*x+18.0/-9.0/x^9.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/94.0*x^94.0+2.0*x-1.0/31.333333333333332/x^94.0-1.0/24.25*x^97.0+5.0*x-1.0/16.166666666666668/x^97.0-1.0/14.285714285714286*x^100.0+8.0*x+9.0*ln(x)-3.3333333333333335*x^3.0+11.0*x-4.0/x^3.0-2.1666666666666665*x^6.0+14.0*x-2.5/x^6.0-1.7777777777777777*x^9.0+17.0*x-2.0/x^9.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-93.0*x^92.0-285.0/x^96.0-384.0*x^95.0-588.0/x^99.0-693.0*x^98.0-9.0/x^2.0-20.0*x-48.0/x^5.0-65.0*x^4.0-105.0/x^8.0-128.0*x^7.0-180.0/x^11.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-93.0*92.0*x^91.0-285.0*-96.0/x^97.0-384.0*95.0*x^94.0-588.0*-99.0/x^100.0-693.0*98.0*x^97.0-9.0*-2.0/x^3.0-20.0-48.0*-5.0/x^6.0-65.0*4.0*x^3.0-105.0*-8.0/x^9.0-128.0*7.0*x^6.0-180.0*-11.0/x^12.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-8556.0*x^91.0+27360.0/x^97.0-36480.0*x^94.0+58212.0/x^100.0-67914.0*x^97.0+18.0/x^3.0-20.0+240.0/x^6.0-260.0*x^3.0+840.0/x^9.0-896.0*x^6.0+1980.0/x^12.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/94.0*x^94.0+2.0*x-1.0/31.333333333333332/x^94.0-1.0/24.25*x^97.0+5.0*x-1.0/16.166666666666668/x^97.0-1.0/14.285714285714286*x^100.0+8.0*x+9.0*ln(x)-3.3333333333333335*x^3.0+11.0*x-4.0/x^3.0-2.1666666666666665*x^6.0+14.0*x-2.5/x^6.0-1.7777777777777777*x^9.0+17.0*x-2.0/x^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/94.0/95.0*x^95.0+x^2.0-1.0/31.333333333333332/-93.0/x^93.0-1.0/24.25/98.0*x^98.0+5.0/2.0*x^2.0-1.0/16.166666666666668/-96.0/x^96.0-1.0/14.285714285714286/101.0*x^101.0+8.0/2.0*x^2.0+9.0*x-3.3333333333333335/4.0*x^4.0+11.0/2.0*x^2.0-4.0/-2.0/x^2.0-2.1666666666666665/7.0*x^7.0+14.0/2.0*x^2.0-2.5/-5.0/x^5.0-1.7777777777777777/10.0*x^10.0+17.0/2.0*x^2.0-2.0/-8.0/x^8.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.1198208286674133E-4*x^95.0+x^2.0+1.0/2914.0/x^93.0-1.0/2376.5*x^98.0+2.5*x^2.0+1.0/1552.0/x^96.0-1.0/1442.857142857143*x^101.0+4.0*x^2.0+9.0*x-1.0/1.2*x^4.0+5.5*x^2.0+2.0/x^2.0-1.0/3.230769230769231*x^7.0+7.0*x^2.0+1.0/2.0/x^5.0-1.0/5.625*x^10.0+8.5*x^2.0+1.0/4.0/x^8.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-8556.0*x^91.0+27360.0/x^97.0-36480.0*x^94.0+58212.0/x^100.0-67914.0*x^97.0+18.0/x^3.0-20.0+240.0/x^6.0-260.0*x^3.0+840.0/x^9.0-896.0*x^6.0+1980.0/x^12.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-8556.0*91.0*x^90.0+27360.0*-97.0/x^98.0-36480.0*94.0*x^93.0+58212.0*-100.0/x^101.0-67914.0*97.0*x^96.0+18.0*-3.0/x^4.0-20.0*0.0+240.0*-6.0/x^7.0-260.0*3.0*x^2.0+840.0*-9.0/x^10.0-896.0*6.0*x^5.0+1980.0*-12.0/x^13.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-778596.0*x^90.0-2653920.0/x^98.0-3429120.0*x^93.0-5821200.0/x^101.0-6587658.0*x^96.0-54.0/x^4.0-1440.0/x^7.0-780.0*x^2.0-7560.0/x^10.0-5376.0*x^5.0-23760.0/x^13.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.1198208286674133E-4*x^95.0-4.0*x^95.0+x^2.0+1.0/2914.0/x^93.0-1.0/2376.5*x^98.0+2.5*x^2.0+1.0/1552.0/x^96.0-1.0/1442.857142857143*x^101.0+4.0*x^2.0+9.0*x-1.0/1.2*x^4.0+5.5*x^2.0+2.0/x^2.0-1.0/3.230769230769231*x^7.0+7.0*x^2.0+1.0/2.0/x^5.0-1.0/5.625*x^10.0+8.5*x^2.0+1.0/4.0/x^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.1198208286674133E-4/96.0*x^96.0-4.0/96.0*x^96.0+1.0/3.0*x^3.0+1.0/2914.0/-92.0/x^92.0-1.0/2376.5/99.0*x^99.0+2.5/3.0*x^3.0+1.0/1552.0/-95.0/x^95.0-1.0/1442.857142857143/102.0*x^102.0+4.0/3.0*x^3.0+9.0/2.0*x^2.0-1.0/1.2/5.0*x^5.0+5.5/3.0*x^3.0+2.0/-1.0/x^1.0-1.0/3.230769230769231/8.0*x^8.0+7.0/3.0*x^3.0+1.0/2.0/-4.0/x^4.0-1.0/5.625/11.0*x^11.0+8.5/3.0*x^3.0+1.0/4.0/-7.0/x^7.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/857280.0*x^96.0-1.0/24.0*x^96.0-1.0/24.0*x^96.0+1.0/3.0*x^3.0-1.0/268088.0/x^92.0-1.0/235273.5*x^99.0+1.0/1.2*x^3.0-1.0/147440.0/x^95.0-1.0/147171.42857142858*x^102.0+1.3333333333333333*x^3.0+4.5*x^2.0-1.0/6.0*x^5.0+1.8333333333333333*x^3.0-2.0/x-1.0/25.846153846153847*x^8.0+2.3333333333333335*x^3.0-1.0/8.0/x^4.0-1.0/61.875*x^11.0+2.8333333333333335*x^3.0-1.0/28.0/x^7.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-778596.0*x^90.0-2653920.0/x^98.0-3429120.0*x^93.0-5821200.0/x^101.0-6587658.0*x^96.0-54.0/x^4.0-1440.0/x^7.0-780.0*x^2.0-7560.0/x^10.0-5376.0*x^5.0-23760.0/x^13.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-778596.0*90.0*x^89.0-2653920.0*-98.0/x^99.0-3429120.0*93.0*x^92.0-5821200.0*-101.0/x^102.0-6587658.0*96.0*x^95.0-54.0*-4.0/x^5.0-1440.0*-7.0/x^8.0-780.0*2.0*x^1.0-7560.0*-10.0/x^11.0-5376.0*5.0*x^4.0-23760.0*-13.0/x^14.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-7.007364E7*x^89.0+2.6008416E8/x^99.0-3.1890816E8*x^92.0+5.879412E8/x^102.0-6.32415168E8*x^95.0+216.0/x^5.0+10080.0/x^8.0-1560.0*x+75600.0/x^11.0-26880.0*x^4.0+308880.0/x^14.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/857280.0*x^96.0-1.0/24.0*x^96.0-1.0/24.0*x^96.0+1.0/3.0*x^3.0-1.0/268088.0/x^92.0-1.0/235273.5*x^99.0+1.0/1.2*x^3.0-1.0/147440.0/x^95.0-1.0/147171.42857142858*x^102.0+1.3333333333333333*x^3.0+4.5*x^2.0-1.0/6.0*x^5.0+1.8333333333333333*x^3.0-2.0/x-1.0/25.846153846153847*x^8.0+2.3333333333333335*x^3.0-1.0/8.0/x^4.0-1.0/61.875*x^11.0+2.8333333333333335*x^3.0-1.0/28.0/x^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/857280.0/97.0*x^97.0-1.0/24.0/97.0*x^97.0-1.0/24.0/97.0*x^97.0+1.0/3.0/4.0*x^4.0-1.0/268088.0/-91.0/x^91.0-1.0/235273.5/100.0*x^100.0+1.0/1.2/4.0*x^4.0-1.0/147440.0/-94.0/x^94.0-1.0/147171.42857142858/103.0*x^103.0+1.3333333333333333/4.0*x^4.0+4.5/3.0*x^3.0-1.0/6.0/6.0*x^6.0+1.8333333333333333/4.0*x^4.0-2.0*ln(x)-1.0/25.846153846153847/9.0*x^9.0+2.3333333333333335/4.0*x^4.0-1.0/8.0/-3.0/x^3.0-1.0/61.875/12.0*x^12.0+2.8333333333333335/4.0*x^4.0-1.0/28.0/-6.0/x^6.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/8.315616E7*x^97.0-1.0/2328.0*x^97.0-1.0/2328.0*x^97.0+1.0/12.0*x^4.0+1.0/2.4396008E7/x^91.0-1.0/2.352735E7*x^100.0+1.0/4.8*x^4.0+1.0/1.385936E7/x^94.0-1.0/1.5158657142857144E7*x^103.0+1.0/3.0*x^4.0+1.5*x^3.0-1.0/36.0*x^6.0+1.0/2.181818181818182*x^4.0-2.0*ln(x)-1.0/232.6153846153846*x^9.0+1.0/1.7142857142857142*x^4.0+1.0/24.0/x^3.0-1.0/742.5*x^12.0+1.0/1.4117647058823528*x^4.0+1.0/168.0/x^6.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120379() {
 UsageCalculus.TestCase = 120379;
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

public static void TestCaseDiff120380() {
 UsageCalculus.TestCase = 120380;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+3/x^95-4*x^96+5*xyzxy^-97+6/x^98-7*x^99+8*xyzxyzxy^-100+9/x^1-10*x^2+11+12/x^4-13*x^5+14+15/x^7-16*x^8+17*xyzxyzxyzxyzxyzxy^-9+18/x^10-19*x^11+20*xyzxyzxyzxyzxyzxyzxy^-12+21/x^13-22*x^14";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "3.0/x^95.0-4.0*x^96.0+5.0+6.0/x^98.0-7.0*x^99.0+8.0+9.0/x-10.0*x^2.0+11.0+12.0/x^4.0-13.0*x^5.0+14.0+15.0/x^7.0-16.0*x^8.0+17.0+18.0/x^10.0-19.0*x^11.0+20.0+21.0/x^13.0-22.0*x^14.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "3.0*-95.0/x^96.0-4.0*96.0*x^95.0+5.0*0.0+6.0*-98.0/x^99.0-7.0*99.0*x^98.0+8.0*0.0-9.0/x^2.0-10.0*2.0*x^1.0+11.0*0.0+12.0*-4.0/x^5.0-13.0*5.0*x^4.0+14.0*0.0+15.0*-7.0/x^8.0-16.0*8.0*x^7.0+17.0*0.0+18.0*-10.0/x^11.0-19.0*11.0*x^10.0+20.0*0.0+21.0*-13.0/x^14.0-22.0*14.0*x^13.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-285.0/x^96.0-384.0*x^95.0-588.0/x^99.0-693.0*x^98.0-9.0/x^2.0-20.0*x-48.0/x^5.0-65.0*x^4.0-105.0/x^8.0-128.0*x^7.0-180.0/x^11.0-209.0*x^10.0-273.0/x^14.0-308.0*x^13.0";
 UsageCalculus.EqnSolArrayMap3[1] = "3.0/x^95.0-4.0*x^96.0+5.0+6.0/x^98.0-7.0*x^99.0+8.0+9.0/x-10.0*x^2.0+11.0+12.0/x^4.0-13.0*x^5.0+14.0+15.0/x^7.0-16.0*x^8.0+17.0+18.0/x^10.0-19.0*x^11.0+20.0+21.0/x^13.0-22.0*x^14.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "3.0/-94.0/x^94.0-4.0/97.0*x^97.0+5.0*x+6.0/-97.0/x^97.0-7.0/100.0*x^100.0+8.0*x+9.0*ln(x)-10.0/3.0*x^3.0+11.0*x+12.0/-3.0/x^3.0-13.0/6.0*x^6.0+14.0*x+15.0/-6.0/x^6.0-16.0/9.0*x^9.0+17.0*x+18.0/-9.0/x^9.0-19.0/12.0*x^12.0+20.0*x+21.0/-12.0/x^12.0-22.0/15.0*x^15.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/31.333333333333332/x^94.0-1.0/24.25*x^97.0+5.0*x-1.0/16.166666666666668/x^97.0-1.0/14.285714285714286*x^100.0+8.0*x+9.0*ln(x)-3.3333333333333335*x^3.0+11.0*x-4.0/x^3.0-2.1666666666666665*x^6.0+14.0*x-2.5/x^6.0-1.7777777777777777*x^9.0+17.0*x-2.0/x^9.0-1.5833333333333333*x^12.0+20.0*x-1.75/x^12.0-1.4666666666666666*x^15.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-285.0/x^96.0-384.0*x^95.0-588.0/x^99.0-693.0*x^98.0-9.0/x^2.0-20.0*x-48.0/x^5.0-65.0*x^4.0-105.0/x^8.0-128.0*x^7.0-180.0/x^11.0-209.0*x^10.0-273.0/x^14.0-308.0*x^13.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-285.0*-96.0/x^97.0-384.0*95.0*x^94.0-588.0*-99.0/x^100.0-693.0*98.0*x^97.0-9.0*-2.0/x^3.0-20.0-48.0*-5.0/x^6.0-65.0*4.0*x^3.0-105.0*-8.0/x^9.0-128.0*7.0*x^6.0-180.0*-11.0/x^12.0-209.0*10.0*x^9.0-273.0*-14.0/x^15.0-308.0*13.0*x^12.0";
 UsageCalculus.EqnSolArrayMap2[2] = "27360.0/x^97.0-36480.0*x^94.0+58212.0/x^100.0-67914.0*x^97.0+18.0/x^3.0-20.0+240.0/x^6.0-260.0*x^3.0+840.0/x^9.0-896.0*x^6.0+1980.0/x^12.0-2090.0*x^9.0+3822.0/x^15.0-4004.0*x^12.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/31.333333333333332/x^94.0-1.0/24.25*x^97.0+5.0*x-1.0/16.166666666666668/x^97.0-1.0/14.285714285714286*x^100.0+8.0*x+9.0*ln(x)-3.3333333333333335*x^3.0+11.0*x-4.0/x^3.0-2.1666666666666665*x^6.0+14.0*x-2.5/x^6.0-1.7777777777777777*x^9.0+17.0*x-2.0/x^9.0-1.5833333333333333*x^12.0+20.0*x-1.75/x^12.0-1.4666666666666666*x^15.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/31.333333333333332/-93.0/x^93.0-1.0/24.25/98.0*x^98.0+5.0/2.0*x^2.0-1.0/16.166666666666668/-96.0/x^96.0-1.0/14.285714285714286/101.0*x^101.0+8.0/2.0*x^2.0+9.0*x-3.3333333333333335/4.0*x^4.0+11.0/2.0*x^2.0-4.0/-2.0/x^2.0-2.1666666666666665/7.0*x^7.0+14.0/2.0*x^2.0-2.5/-5.0/x^5.0-1.7777777777777777/10.0*x^10.0+17.0/2.0*x^2.0-2.0/-8.0/x^8.0-1.5833333333333333/13.0*x^13.0+20.0/2.0*x^2.0-1.75/-11.0/x^11.0-1.4666666666666666/16.0*x^16.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/2914.0/x^93.0-1.0/2376.5*x^98.0+2.5*x^2.0+1.0/1552.0/x^96.0-1.0/1442.857142857143*x^101.0+4.0*x^2.0+9.0*x-1.0/1.2*x^4.0+5.5*x^2.0+2.0/x^2.0-1.0/3.230769230769231*x^7.0+7.0*x^2.0+1.0/2.0/x^5.0-1.0/5.625*x^10.0+8.5*x^2.0+1.0/4.0/x^8.0-1.0/8.210526315789474*x^13.0+10.0*x^2.0+1.0/6.285714285714286/x^11.0-1.0/10.90909090909091*x^16.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "27360.0/x^97.0-36480.0*x^94.0+58212.0/x^100.0-67914.0*x^97.0+18.0/x^3.0-20.0+240.0/x^6.0-260.0*x^3.0+840.0/x^9.0-896.0*x^6.0+1980.0/x^12.0-2090.0*x^9.0+3822.0/x^15.0-4004.0*x^12.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "27360.0*-97.0/x^98.0-36480.0*94.0*x^93.0+58212.0*-100.0/x^101.0-67914.0*97.0*x^96.0+18.0*-3.0/x^4.0-20.0*0.0+240.0*-6.0/x^7.0-260.0*3.0*x^2.0+840.0*-9.0/x^10.0-896.0*6.0*x^5.0+1980.0*-12.0/x^13.0-2090.0*9.0*x^8.0+3822.0*-15.0/x^16.0-4004.0*12.0*x^11.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-2653920.0/x^98.0-3429120.0*x^93.0-5821200.0/x^101.0-6587658.0*x^96.0-54.0/x^4.0-1440.0/x^7.0-780.0*x^2.0-7560.0/x^10.0-5376.0*x^5.0-23760.0/x^13.0-18810.0*x^8.0-57330.0/x^16.0-48048.0*x^11.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/2914.0/x^93.0-1.0/2376.5*x^98.0+2.5*x^2.0+1.0/1552.0/x^96.0-1.0/1442.857142857143*x^101.0+4.0*x^2.0+9.0*x-1.0/1.2*x^4.0+5.5*x^2.0+2.0/x^2.0-1.0/3.230769230769231*x^7.0+7.0*x^2.0+1.0/2.0/x^5.0-1.0/5.625*x^10.0+8.5*x^2.0+1.0/4.0/x^8.0-1.0/8.210526315789474*x^13.0+10.0*x^2.0+1.0/6.285714285714286/x^11.0-1.0/10.90909090909091*x^16.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/2914.0/-92.0/x^92.0-1.0/2376.5/99.0*x^99.0+2.5/3.0*x^3.0+1.0/1552.0/-95.0/x^95.0-1.0/1442.857142857143/102.0*x^102.0+4.0/3.0*x^3.0+9.0/2.0*x^2.0-1.0/1.2/5.0*x^5.0+5.5/3.0*x^3.0+2.0/-1.0/x^1.0-1.0/3.230769230769231/8.0*x^8.0+7.0/3.0*x^3.0+1.0/2.0/-4.0/x^4.0-1.0/5.625/11.0*x^11.0+8.5/3.0*x^3.0+1.0/4.0/-7.0/x^7.0-1.0/8.210526315789474/14.0*x^14.0+10.0/3.0*x^3.0+1.0/6.285714285714286/-10.0/x^10.0-1.0/10.90909090909091/17.0*x^17.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/268088.0/x^92.0-1.0/235273.5*x^99.0+1.0/1.2*x^3.0-1.0/147440.0/x^95.0-1.0/147171.42857142858*x^102.0+1.3333333333333333*x^3.0+4.5*x^2.0-1.0/6.0*x^5.0+1.8333333333333333*x^3.0-2.0/x-1.0/25.846153846153847*x^8.0+2.3333333333333335*x^3.0-1.0/8.0/x^4.0-1.0/61.875*x^11.0+2.8333333333333335*x^3.0-1.0/28.0/x^7.0-1.0/114.94736842105264*x^14.0+3.3333333333333335*x^3.0-1.0/62.857142857142854/x^10.0-1.0/185.45454545454547*x^17.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-2653920.0/x^98.0-3429120.0*x^93.0-5821200.0/x^101.0-6587658.0*x^96.0-54.0/x^4.0-1440.0/x^7.0-780.0*x^2.0-7560.0/x^10.0-5376.0*x^5.0-23760.0/x^13.0-18810.0*x^8.0-57330.0/x^16.0-48048.0*x^11.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-2653920.0*-98.0/x^99.0-3429120.0*93.0*x^92.0-5821200.0*-101.0/x^102.0-6587658.0*96.0*x^95.0-54.0*-4.0/x^5.0-1440.0*-7.0/x^8.0-780.0*2.0*x^1.0-7560.0*-10.0/x^11.0-5376.0*5.0*x^4.0-23760.0*-13.0/x^14.0-18810.0*8.0*x^7.0-57330.0*-16.0/x^17.0-48048.0*11.0*x^10.0";
 UsageCalculus.EqnSolArrayMap2[4] = "2.6008416E8/x^99.0-3.1890816E8*x^92.0+5.879412E8/x^102.0-6.32415168E8*x^95.0+216.0/x^5.0+10080.0/x^8.0-1560.0*x+75600.0/x^11.0-26880.0*x^4.0+308880.0/x^14.0-150480.0*x^7.0+917280.0/x^17.0-528528.0*x^10.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/268088.0/x^92.0-1.0/235273.5*x^99.0+1.0/1.2*x^3.0-1.0/147440.0/x^95.0-1.0/147171.42857142858*x^102.0+1.3333333333333333*x^3.0+4.5*x^2.0-1.0/6.0*x^5.0+1.8333333333333333*x^3.0-2.0/x-1.0/25.846153846153847*x^8.0+2.3333333333333335*x^3.0-1.0/8.0/x^4.0-1.0/61.875*x^11.0+2.8333333333333335*x^3.0-1.0/28.0/x^7.0-1.0/114.94736842105264*x^14.0+3.3333333333333335*x^3.0-1.0/62.857142857142854/x^10.0-1.0/185.45454545454547*x^17.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/268088.0/-91.0/x^91.0-1.0/235273.5/100.0*x^100.0+1.0/1.2/4.0*x^4.0-1.0/147440.0/-94.0/x^94.0-1.0/147171.42857142858/103.0*x^103.0+1.3333333333333333/4.0*x^4.0+4.5/3.0*x^3.0-1.0/6.0/6.0*x^6.0+1.8333333333333333/4.0*x^4.0-2.0*ln(x)-1.0/25.846153846153847/9.0*x^9.0+2.3333333333333335/4.0*x^4.0-1.0/8.0/-3.0/x^3.0-1.0/61.875/12.0*x^12.0+2.8333333333333335/4.0*x^4.0-1.0/28.0/-6.0/x^6.0-1.0/114.94736842105264/15.0*x^15.0+3.3333333333333335/4.0*x^4.0-1.0/62.857142857142854/-9.0/x^9.0-1.0/185.45454545454547/18.0*x^18.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/2.4396008E7/x^91.0-1.0/2.352735E7*x^100.0+1.0/4.8*x^4.0+1.0/1.385936E7/x^94.0-1.0/1.5158657142857144E7*x^103.0+1.0/3.0*x^4.0+1.5*x^3.0-1.0/36.0*x^6.0+1.0/2.181818181818182*x^4.0-2.0*ln(x)-1.0/232.6153846153846*x^9.0+1.0/1.7142857142857142*x^4.0+1.0/24.0/x^3.0-1.0/742.5*x^12.0+1.0/1.4117647058823528*x^4.0+1.0/168.0/x^6.0-1.0/1724.2105263157896*x^15.0+1.0/1.2*x^4.0+1.0/565.7142857142857/x^9.0-1.0/3338.1818181818185*x^18.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120381() {
 UsageCalculus.TestCase = 120381;
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

public static void TestCaseDiff120382() {
 UsageCalculus.TestCase = 120382;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+6/x^98-7*x^99+8*xyzxyzxy^-100";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "6.0/x^98.0-7.0*x^99.0+8.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "6.0*-98.0/x^99.0-7.0*99.0*x^98.0+8.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-588.0/x^99.0-693.0*x^98.0";
 UsageCalculus.EqnSolArrayMap3[1] = "6.0/x^98.0-7.0*x^99.0+8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "6.0/-97.0/x^97.0-7.0/100.0*x^100.0+8.0*x";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/16.166666666666668/x^97.0-1.0/14.285714285714286*x^100.0+8.0*x";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-588.0/x^99.0-693.0*x^98.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-588.0*-99.0/x^100.0-693.0*98.0*x^97.0";
 UsageCalculus.EqnSolArrayMap2[2] = "58212.0/x^100.0-67914.0*x^97.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/16.166666666666668/x^97.0-1.0/14.285714285714286*x^100.0+8.0*x";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/16.166666666666668/-96.0/x^96.0-1.0/14.285714285714286/101.0*x^101.0+8.0/2.0*x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/1552.0/x^96.0-1.0/1442.857142857143*x^101.0+4.0*x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "58212.0/x^100.0-67914.0*x^97.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "58212.0*-100.0/x^101.0-67914.0*97.0*x^96.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-5821200.0/x^101.0-6587658.0*x^96.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/1552.0/x^96.0-1.0/1442.857142857143*x^101.0+4.0*x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/1552.0/-95.0/x^95.0-1.0/1442.857142857143/102.0*x^102.0+4.0/3.0*x^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/147440.0/x^95.0-1.0/147171.42857142858*x^102.0+1.3333333333333333*x^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-5821200.0/x^101.0-6587658.0*x^96.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-5821200.0*-101.0/x^102.0-6587658.0*96.0*x^95.0";
 UsageCalculus.EqnSolArrayMap2[4] = "5.879412E8/x^102.0-6.32415168E8*x^95.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/147440.0/x^95.0-1.0/147171.42857142858*x^102.0+1.3333333333333333*x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/147440.0/-94.0/x^94.0-1.0/147171.42857142858/103.0*x^103.0+1.3333333333333333/4.0*x^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/1.385936E7/x^94.0-1.0/1.5158657142857144E7*x^103.0+1.0/3.0*x^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120383() {
 UsageCalculus.TestCase = 120383;
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

public static void TestCaseDiff120384() {
 UsageCalculus.TestCase = 120384;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+8*xyzxyzxy^-100+9/x^1-10*x^2+11+12/x^4";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "8.0+9.0/x-10.0*x^2.0+11.0+12.0/x^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0-9.0/x^2.0-10.0*2.0*x^1.0+11.0*0.0+12.0*-4.0/x^5.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-9.0/x^2.0-20.0*x-48.0/x^5.0";
 UsageCalculus.EqnSolArrayMap3[1] = "8.0+9.0/x-10.0*x^2.0+11.0+12.0/x^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "8.0*x+9.0*ln(x)-10.0/3.0*x^3.0+11.0*x+12.0/-3.0/x^3.0";
 UsageCalculus.EqnSolArrayMap4[1] = "8.0*x+9.0*ln(x)-3.3333333333333335*x^3.0+11.0*x-4.0/x^3.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-9.0/x^2.0-20.0*x-48.0/x^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-9.0*-2.0/x^3.0-20.0-48.0*-5.0/x^6.0";
 UsageCalculus.EqnSolArrayMap2[2] = "18.0/x^3.0-20.0+240.0/x^6.0";
 UsageCalculus.EqnSolArrayMap3[2] = "8.0*x+9.0*ln(x)-3.3333333333333335*x^3.0+11.0*x-4.0/x^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "8.0/2.0*x^2.0+9.0*x-3.3333333333333335/4.0*x^4.0+11.0/2.0*x^2.0-4.0/-2.0/x^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "4.0*x^2.0+9.0*x-1.0/1.2*x^4.0+5.5*x^2.0+2.0/x^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "18.0/x^3.0-20.0+240.0/x^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "18.0*-3.0/x^4.0-20.0*0.0+240.0*-6.0/x^7.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-54.0/x^4.0-1440.0/x^7.0";
 UsageCalculus.EqnSolArrayMap3[3] = "4.0*x^2.0+9.0*x-1.0/1.2*x^4.0+5.5*x^2.0+2.0/x^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "4.0/3.0*x^3.0+9.0/2.0*x^2.0-1.0/1.2/5.0*x^5.0+5.5/3.0*x^3.0+2.0/-1.0/x^1.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.3333333333333333*x^3.0+4.5*x^2.0-1.0/6.0*x^5.0+1.8333333333333333*x^3.0-2.0/x";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-54.0/x^4.0-1440.0/x^7.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-54.0*-4.0/x^5.0-1440.0*-7.0/x^8.0";
 UsageCalculus.EqnSolArrayMap2[4] = "216.0/x^5.0+10080.0/x^8.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.3333333333333333*x^3.0+4.5*x^2.0-1.0/6.0*x^5.0+1.8333333333333333*x^3.0-2.0/x";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.3333333333333333/4.0*x^4.0+4.5/3.0*x^3.0-1.0/6.0/6.0*x^6.0+1.8333333333333333/4.0*x^4.0-2.0*ln(x)";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/3.0*x^4.0+1.5*x^3.0-1.0/36.0*x^6.0+1.0/2.181818181818182*x^4.0-2.0*ln(x)";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120385() {
 UsageCalculus.TestCase = 120385;
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

public static void TestCaseDiff120386() {
 UsageCalculus.TestCase = 120386;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-10*x^2+11+12/x^4-13*x^5+14+15/x^7-16*x^8";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-10.0*x^2.0+11.0+12.0/x^4.0-13.0*x^5.0+14.0+15.0/x^7.0-16.0*x^8.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-10.0*2.0*x^1.0+11.0*0.0+12.0*-4.0/x^5.0-13.0*5.0*x^4.0+14.0*0.0+15.0*-7.0/x^8.0-16.0*8.0*x^7.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-20.0*x-48.0/x^5.0-65.0*x^4.0-105.0/x^8.0-128.0*x^7.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-10.0*x^2.0+11.0+12.0/x^4.0-13.0*x^5.0+14.0+15.0/x^7.0-16.0*x^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-10.0/3.0*x^3.0+11.0*x+12.0/-3.0/x^3.0-13.0/6.0*x^6.0+14.0*x+15.0/-6.0/x^6.0-16.0/9.0*x^9.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-3.3333333333333335*x^3.0+11.0*x-4.0/x^3.0-2.1666666666666665*x^6.0+14.0*x-2.5/x^6.0-1.7777777777777777*x^9.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-20.0*x-48.0/x^5.0-65.0*x^4.0-105.0/x^8.0-128.0*x^7.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-20.0-48.0*-5.0/x^6.0-65.0*4.0*x^3.0-105.0*-8.0/x^9.0-128.0*7.0*x^6.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-20.0+240.0/x^6.0-260.0*x^3.0+840.0/x^9.0-896.0*x^6.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-3.3333333333333335*x^3.0+11.0*x-4.0/x^3.0-2.1666666666666665*x^6.0+14.0*x-2.5/x^6.0-1.7777777777777777*x^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-3.3333333333333335/4.0*x^4.0+11.0/2.0*x^2.0-4.0/-2.0/x^2.0-2.1666666666666665/7.0*x^7.0+14.0/2.0*x^2.0-2.5/-5.0/x^5.0-1.7777777777777777/10.0*x^10.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/1.2*x^4.0+5.5*x^2.0+2.0/x^2.0-1.0/3.230769230769231*x^7.0+7.0*x^2.0+1.0/2.0/x^5.0-1.0/5.625*x^10.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-20.0+240.0/x^6.0-260.0*x^3.0+840.0/x^9.0-896.0*x^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-0.0+240.0*-6.0/x^7.0-260.0*3.0*x^2.0+840.0*-9.0/x^10.0-896.0*6.0*x^5.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-1440.0/x^7.0-780.0*x^2.0-7560.0/x^10.0-5376.0*x^5.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/1.2*x^4.0+5.5*x^2.0+2.0/x^2.0-1.0/3.230769230769231*x^7.0+7.0*x^2.0+1.0/2.0/x^5.0-1.0/5.625*x^10.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/1.2/5.0*x^5.0+5.5/3.0*x^3.0+2.0/-1.0/x^1.0-1.0/3.230769230769231/8.0*x^8.0+7.0/3.0*x^3.0+1.0/2.0/-4.0/x^4.0-1.0/5.625/11.0*x^11.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/6.0*x^5.0+1.8333333333333333*x^3.0-2.0/x-1.0/25.846153846153847*x^8.0+2.3333333333333335*x^3.0-1.0/8.0/x^4.0-1.0/61.875*x^11.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-1440.0/x^7.0-780.0*x^2.0-7560.0/x^10.0-5376.0*x^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-1440.0*-7.0/x^8.0-780.0*2.0*x^1.0-7560.0*-10.0/x^11.0-5376.0*5.0*x^4.0";
 UsageCalculus.EqnSolArrayMap2[4] = "10080.0/x^8.0-1560.0*x+75600.0/x^11.0-26880.0*x^4.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/6.0*x^5.0+1.8333333333333333*x^3.0-2.0/x-1.0/25.846153846153847*x^8.0+2.3333333333333335*x^3.0-1.0/8.0/x^4.0-1.0/61.875*x^11.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/6.0/6.0*x^6.0+1.8333333333333333/4.0*x^4.0-2.0*ln(x)-1.0/25.846153846153847/9.0*x^9.0+2.3333333333333335/4.0*x^4.0-1.0/8.0/-3.0/x^3.0-1.0/61.875/12.0*x^12.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/36.0*x^6.0+1.0/2.181818181818182*x^4.0-2.0*ln(x)-1.0/232.6153846153846*x^9.0+1.0/1.7142857142857142*x^4.0+1.0/24.0/x^3.0-1.0/742.5*x^12.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120387() {
 UsageCalculus.TestCase = 120387;
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

public static void TestCaseDiff120388() {
 UsageCalculus.TestCase = 120388;
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

public static void TestCaseDiff120389() {
 UsageCalculus.TestCase = 120389;
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

public static void TestCaseDiff120390() {
 UsageCalculus.TestCase = 120390;
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

public static void TestCaseDiff120391() {
 UsageCalculus.TestCase = 120391;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+15*x^7+16-17*x^9+18*xyzxyzxyzxyzxyzxyz^-10+19/x^11-20*x^12+21+22/x^14-23*x^15+24+25/x^17-26*x^18";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "15.0*x^7.0+16.0-17.0*x^9.0+18.0+19.0/x^11.0-20.0*x^12.0+21.0+22.0/x^14.0-23.0*x^15.0+24.0+25.0/x^17.0-26.0*x^18.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "15.0*7.0*x^6.0+16.0*0.0-17.0*9.0*x^8.0+18.0*0.0+19.0*-11.0/x^12.0-20.0*12.0*x^11.0+21.0*0.0+22.0*-14.0/x^15.0-23.0*15.0*x^14.0+24.0*0.0+25.0*-17.0/x^18.0-26.0*18.0*x^17.0";
 UsageCalculus.EqnSolArrayMap2[1] = "105.0*x^6.0-153.0*x^8.0-209.0/x^12.0-240.0*x^11.0-308.0/x^15.0-345.0*x^14.0-425.0/x^18.0-468.0*x^17.0";
 UsageCalculus.EqnSolArrayMap3[1] = "15.0*x^7.0+16.0-17.0*x^9.0+18.0+19.0/x^11.0-20.0*x^12.0+21.0+22.0/x^14.0-23.0*x^15.0+24.0+25.0/x^17.0-26.0*x^18.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "15.0/8.0*x^8.0+16.0*x-17.0/10.0*x^10.0+18.0*x+19.0/-10.0/x^10.0-20.0/13.0*x^13.0+21.0*x+22.0/-13.0/x^13.0-23.0/16.0*x^16.0+24.0*x+25.0/-16.0/x^16.0-26.0/19.0*x^19.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.875*x^8.0+16.0*x-1.7*x^10.0+18.0*x-1.9/x^10.0-1.5384615384615385*x^13.0+21.0*x-1.6923076923076923/x^13.0-1.4375*x^16.0+24.0*x-1.5625/x^16.0-1.368421052631579*x^19.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "105.0*x^6.0-153.0*x^8.0-209.0/x^12.0-240.0*x^11.0-308.0/x^15.0-345.0*x^14.0-425.0/x^18.0-468.0*x^17.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "105.0*6.0*x^5.0-153.0*8.0*x^7.0-209.0*-12.0/x^13.0-240.0*11.0*x^10.0-308.0*-15.0/x^16.0-345.0*14.0*x^13.0-425.0*-18.0/x^19.0-468.0*17.0*x^16.0";
 UsageCalculus.EqnSolArrayMap2[2] = "630.0*x^5.0-1224.0*x^7.0+2508.0/x^13.0-2640.0*x^10.0+4620.0/x^16.0-4830.0*x^13.0+7650.0/x^19.0-7956.0*x^16.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.875*x^8.0+16.0*x-1.7*x^10.0+18.0*x-1.9/x^10.0-1.5384615384615385*x^13.0+21.0*x-1.6923076923076923/x^13.0-1.4375*x^16.0+24.0*x-1.5625/x^16.0-1.368421052631579*x^19.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.875/9.0*x^9.0+16.0/2.0*x^2.0-1.7/11.0*x^11.0+18.0/2.0*x^2.0-1.9/-9.0/x^9.0-1.5384615384615385/14.0*x^14.0+21.0/2.0*x^2.0-1.6923076923076923/-12.0/x^12.0-1.4375/17.0*x^17.0+24.0/2.0*x^2.0-1.5625/-15.0/x^15.0-1.368421052631579/20.0*x^20.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/4.8*x^9.0+8.0*x^2.0-1.0/6.470588235294118*x^11.0+9.0*x^2.0+1.0/4.736842105263158/x^9.0-1.0/9.1*x^14.0+10.5*x^2.0+1.0/7.090909090909091/x^12.0-1.0/11.826086956521738*x^17.0+12.0*x^2.0+1.0/9.6/x^15.0-1.0/14.615384615384615*x^20.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "630.0*x^5.0-1224.0*x^7.0+2508.0/x^13.0-2640.0*x^10.0+4620.0/x^16.0-4830.0*x^13.0+7650.0/x^19.0-7956.0*x^16.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "630.0*5.0*x^4.0-1224.0*7.0*x^6.0+2508.0*-13.0/x^14.0-2640.0*10.0*x^9.0+4620.0*-16.0/x^17.0-4830.0*13.0*x^12.0+7650.0*-19.0/x^20.0-7956.0*16.0*x^15.0";
 UsageCalculus.EqnSolArrayMap2[3] = "3150.0*x^4.0-8568.0*x^6.0-32604.0/x^14.0-26400.0*x^9.0-73920.0/x^17.0-62790.0*x^12.0-145350.0/x^20.0-127296.0*x^15.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/4.8*x^9.0+8.0*x^2.0-1.0/6.470588235294118*x^11.0+9.0*x^2.0+1.0/4.736842105263158/x^9.0-1.0/9.1*x^14.0+10.5*x^2.0+1.0/7.090909090909091/x^12.0-1.0/11.826086956521738*x^17.0+12.0*x^2.0+1.0/9.6/x^15.0-1.0/14.615384615384615*x^20.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/4.8/10.0*x^10.0+8.0/3.0*x^3.0-1.0/6.470588235294118/12.0*x^12.0+9.0/3.0*x^3.0+1.0/4.736842105263158/-8.0/x^8.0-1.0/9.1/15.0*x^15.0+10.5/3.0*x^3.0+1.0/7.090909090909091/-11.0/x^11.0-1.0/11.826086956521738/18.0*x^18.0+12.0/3.0*x^3.0+1.0/9.6/-14.0/x^14.0-1.0/14.615384615384615/21.0*x^21.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/48.0*x^10.0+2.6666666666666665*x^3.0-1.0/77.64705882352942*x^12.0+3.0*x^3.0-1.0/37.89473684210527/x^8.0-1.0/136.5*x^15.0+3.5*x^3.0-1.0/78.0/x^11.0-1.0/212.86956521739128*x^18.0+4.0*x^3.0-1.0/134.4/x^14.0-1.0/306.9230769230769*x^21.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "3150.0*x^4.0-8568.0*x^6.0-32604.0/x^14.0-26400.0*x^9.0-73920.0/x^17.0-62790.0*x^12.0-145350.0/x^20.0-127296.0*x^15.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "3150.0*4.0*x^3.0-8568.0*6.0*x^5.0-32604.0*-14.0/x^15.0-26400.0*9.0*x^8.0-73920.0*-17.0/x^18.0-62790.0*12.0*x^11.0-145350.0*-20.0/x^21.0-127296.0*15.0*x^14.0";
 UsageCalculus.EqnSolArrayMap2[4] = "12600.0*x^3.0-51408.0*x^5.0+456456.0/x^15.0-237600.0*x^8.0+1256640.0/x^18.0-753480.0*x^11.0+2907000.0/x^21.0-1909440.0*x^14.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/48.0*x^10.0+2.6666666666666665*x^3.0-1.0/77.64705882352942*x^12.0+3.0*x^3.0-1.0/37.89473684210527/x^8.0-1.0/136.5*x^15.0+3.5*x^3.0-1.0/78.0/x^11.0-1.0/212.86956521739128*x^18.0+4.0*x^3.0-1.0/134.4/x^14.0-1.0/306.9230769230769*x^21.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/48.0/11.0*x^11.0+2.6666666666666665/4.0*x^4.0-1.0/77.64705882352942/13.0*x^13.0+3.0/4.0*x^4.0-1.0/37.89473684210527/-7.0/x^7.0-1.0/136.5/16.0*x^16.0+3.5/4.0*x^4.0-1.0/78.0/-10.0/x^10.0-1.0/212.86956521739128/19.0*x^19.0+4.0/4.0*x^4.0-1.0/134.4/-13.0/x^13.0-1.0/306.9230769230769/22.0*x^22.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/528.0*x^11.0+1.0/1.5*x^4.0-1.0/1009.4117647058824*x^13.0+1.0/1.3333333333333333*x^4.0+1.0/265.2631578947369/x^7.0-1.0/2184.0*x^16.0+1.0/1.1428571428571428*x^4.0+1.0/780.0/x^10.0-1.0/4044.5217391304345*x^19.0+x^4.0+1.0/1747.2/x^13.0-1.0/6752.3076923076915*x^22.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120392() {
 UsageCalculus.TestCase = 120392;
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

public static void TestCaseDiff120393() {
 UsageCalculus.TestCase = 120393;
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

public static void TestCaseDiff120394() {
 UsageCalculus.TestCase = 120394;
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

public static void TestCaseDiff120395() {
 UsageCalculus.TestCase = 120395;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+19/x^11-20*x^12+21+22/x^14-23*x^15+24+25/x^17-26*x^18+27*xyzxyzxyzxyzxyzxyzxyzxyzxyz^-19+28/x^20-29*x^21+30*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-22+31/x^23-32*x^24+33*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-25+34/x^26";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "19.0/x^11.0-20.0*x^12.0+21.0+22.0/x^14.0-23.0*x^15.0+24.0+25.0/x^17.0-26.0*x^18.0+27.0+28.0/x^20.0-29.0*x^21.0+30.0+31.0/x^23.0-32.0*x^24.0+33.0+34.0/x^26.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "19.0*-11.0/x^12.0-20.0*12.0*x^11.0+21.0*0.0+22.0*-14.0/x^15.0-23.0*15.0*x^14.0+24.0*0.0+25.0*-17.0/x^18.0-26.0*18.0*x^17.0+27.0*0.0+28.0*-20.0/x^21.0-29.0*21.0*x^20.0+30.0*0.0+31.0*-23.0/x^24.0-32.0*24.0*x^23.0+33.0*0.0+34.0*-26.0/x^27.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-209.0/x^12.0-240.0*x^11.0-308.0/x^15.0-345.0*x^14.0-425.0/x^18.0-468.0*x^17.0-560.0/x^21.0-609.0*x^20.0-713.0/x^24.0-768.0*x^23.0-884.0/x^27.0";
 UsageCalculus.EqnSolArrayMap3[1] = "19.0/x^11.0-20.0*x^12.0+21.0+22.0/x^14.0-23.0*x^15.0+24.0+25.0/x^17.0-26.0*x^18.0+27.0+28.0/x^20.0-29.0*x^21.0+30.0+31.0/x^23.0-32.0*x^24.0+33.0+34.0/x^26.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "19.0/-10.0/x^10.0-20.0/13.0*x^13.0+21.0*x+22.0/-13.0/x^13.0-23.0/16.0*x^16.0+24.0*x+25.0/-16.0/x^16.0-26.0/19.0*x^19.0+27.0*x+28.0/-19.0/x^19.0-29.0/22.0*x^22.0+30.0*x+31.0/-22.0/x^22.0-32.0/25.0*x^25.0+33.0*x+34.0/-25.0/x^25.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.9/x^10.0-1.5384615384615385*x^13.0+21.0*x-1.6923076923076923/x^13.0-1.4375*x^16.0+24.0*x-1.5625/x^16.0-1.368421052631579*x^19.0+27.0*x-1.4736842105263157/x^19.0-1.3181818181818181*x^22.0+30.0*x-1.4090909090909092/x^22.0-1.28*x^25.0+33.0*x-1.36/x^25.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-209.0/x^12.0-240.0*x^11.0-308.0/x^15.0-345.0*x^14.0-425.0/x^18.0-468.0*x^17.0-560.0/x^21.0-609.0*x^20.0-713.0/x^24.0-768.0*x^23.0-884.0/x^27.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-209.0*-12.0/x^13.0-240.0*11.0*x^10.0-308.0*-15.0/x^16.0-345.0*14.0*x^13.0-425.0*-18.0/x^19.0-468.0*17.0*x^16.0-560.0*-21.0/x^22.0-609.0*20.0*x^19.0-713.0*-24.0/x^25.0-768.0*23.0*x^22.0-884.0*-27.0/x^28.0";
 UsageCalculus.EqnSolArrayMap2[2] = "2508.0/x^13.0-2640.0*x^10.0+4620.0/x^16.0-4830.0*x^13.0+7650.0/x^19.0-7956.0*x^16.0+11760.0/x^22.0-12180.0*x^19.0+17112.0/x^25.0-17664.0*x^22.0+23868.0/x^28.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.9/x^10.0-1.5384615384615385*x^13.0+21.0*x-1.6923076923076923/x^13.0-1.4375*x^16.0+24.0*x-1.5625/x^16.0-1.368421052631579*x^19.0+27.0*x-1.4736842105263157/x^19.0-1.3181818181818181*x^22.0+30.0*x-1.4090909090909092/x^22.0-1.28*x^25.0+33.0*x-1.36/x^25.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.9/-9.0/x^9.0-1.5384615384615385/14.0*x^14.0+21.0/2.0*x^2.0-1.6923076923076923/-12.0/x^12.0-1.4375/17.0*x^17.0+24.0/2.0*x^2.0-1.5625/-15.0/x^15.0-1.368421052631579/20.0*x^20.0+27.0/2.0*x^2.0-1.4736842105263157/-18.0/x^18.0-1.3181818181818181/23.0*x^23.0+30.0/2.0*x^2.0-1.4090909090909092/-21.0/x^21.0-1.28/26.0*x^26.0+33.0/2.0*x^2.0-1.36/-24.0/x^24.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/4.736842105263158/x^9.0-1.0/9.1*x^14.0+10.5*x^2.0+1.0/7.090909090909091/x^12.0-1.0/11.826086956521738*x^17.0+12.0*x^2.0+1.0/9.6/x^15.0-1.0/14.615384615384615*x^20.0+13.5*x^2.0+1.0/12.214285714285715/x^18.0-1.0/17.448275862068968*x^23.0+15.0*x^2.0+1.0/14.903225806451612/x^21.0-1.0/20.3125*x^26.0+16.5*x^2.0+1.0/17.64705882352941/x^24.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "2508.0/x^13.0-2640.0*x^10.0+4620.0/x^16.0-4830.0*x^13.0+7650.0/x^19.0-7956.0*x^16.0+11760.0/x^22.0-12180.0*x^19.0+17112.0/x^25.0-17664.0*x^22.0+23868.0/x^28.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "2508.0*-13.0/x^14.0-2640.0*10.0*x^9.0+4620.0*-16.0/x^17.0-4830.0*13.0*x^12.0+7650.0*-19.0/x^20.0-7956.0*16.0*x^15.0+11760.0*-22.0/x^23.0-12180.0*19.0*x^18.0+17112.0*-25.0/x^26.0-17664.0*22.0*x^21.0+23868.0*-28.0/x^29.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-32604.0/x^14.0-26400.0*x^9.0-73920.0/x^17.0-62790.0*x^12.0-145350.0/x^20.0-127296.0*x^15.0-258720.0/x^23.0-231420.0*x^18.0-427800.0/x^26.0-388608.0*x^21.0-668304.0/x^29.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/4.736842105263158/x^9.0-1.0/9.1*x^14.0+10.5*x^2.0+1.0/7.090909090909091/x^12.0-1.0/11.826086956521738*x^17.0+12.0*x^2.0+1.0/9.6/x^15.0-1.0/14.615384615384615*x^20.0+13.5*x^2.0+1.0/12.214285714285715/x^18.0-1.0/17.448275862068968*x^23.0+15.0*x^2.0+1.0/14.903225806451612/x^21.0-1.0/20.3125*x^26.0+16.5*x^2.0+1.0/17.64705882352941/x^24.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/4.736842105263158/-8.0/x^8.0-1.0/9.1/15.0*x^15.0+10.5/3.0*x^3.0+1.0/7.090909090909091/-11.0/x^11.0-1.0/11.826086956521738/18.0*x^18.0+12.0/3.0*x^3.0+1.0/9.6/-14.0/x^14.0-1.0/14.615384615384615/21.0*x^21.0+13.5/3.0*x^3.0+1.0/12.214285714285715/-17.0/x^17.0-1.0/17.448275862068968/24.0*x^24.0+15.0/3.0*x^3.0+1.0/14.903225806451612/-20.0/x^20.0-1.0/20.3125/27.0*x^27.0+16.5/3.0*x^3.0+1.0/17.64705882352941/-23.0/x^23.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/37.89473684210527/x^8.0-1.0/136.5*x^15.0+3.5*x^3.0-1.0/78.0/x^11.0-1.0/212.86956521739128*x^18.0+4.0*x^3.0-1.0/134.4/x^14.0-1.0/306.9230769230769*x^21.0+4.5*x^3.0-1.0/207.64285714285717/x^17.0-1.0/418.75862068965523*x^24.0+5.0*x^3.0-1.0/298.06451612903226/x^20.0-1.0/548.4375*x^27.0+5.5*x^3.0-1.0/405.8823529411764/x^23.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-32604.0/x^14.0-26400.0*x^9.0-73920.0/x^17.0-62790.0*x^12.0-145350.0/x^20.0-127296.0*x^15.0-258720.0/x^23.0-231420.0*x^18.0-427800.0/x^26.0-388608.0*x^21.0-668304.0/x^29.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-32604.0*-14.0/x^15.0-26400.0*9.0*x^8.0-73920.0*-17.0/x^18.0-62790.0*12.0*x^11.0-145350.0*-20.0/x^21.0-127296.0*15.0*x^14.0-258720.0*-23.0/x^24.0-231420.0*18.0*x^17.0-427800.0*-26.0/x^27.0-388608.0*21.0*x^20.0-668304.0*-29.0/x^30.0";
 UsageCalculus.EqnSolArrayMap2[4] = "456456.0/x^15.0-237600.0*x^8.0+1256640.0/x^18.0-753480.0*x^11.0+2907000.0/x^21.0-1909440.0*x^14.0+5950560.0/x^24.0-4165560.0*x^17.0+1.11228E7/x^27.0-8160768.0*x^20.0+1.9380816E7/x^30.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/37.89473684210527/x^8.0-1.0/136.5*x^15.0+3.5*x^3.0-1.0/78.0/x^11.0-1.0/212.86956521739128*x^18.0+4.0*x^3.0-1.0/134.4/x^14.0-1.0/306.9230769230769*x^21.0+4.5*x^3.0-1.0/207.64285714285717/x^17.0-1.0/418.75862068965523*x^24.0+5.0*x^3.0-1.0/298.06451612903226/x^20.0-1.0/548.4375*x^27.0+5.5*x^3.0-1.0/405.8823529411764/x^23.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/37.89473684210527/-7.0/x^7.0-1.0/136.5/16.0*x^16.0+3.5/4.0*x^4.0-1.0/78.0/-10.0/x^10.0-1.0/212.86956521739128/19.0*x^19.0+4.0/4.0*x^4.0-1.0/134.4/-13.0/x^13.0-1.0/306.9230769230769/22.0*x^22.0+4.5/4.0*x^4.0-1.0/207.64285714285717/-16.0/x^16.0-1.0/418.75862068965523/25.0*x^25.0+5.0/4.0*x^4.0-1.0/298.06451612903226/-19.0/x^19.0-1.0/548.4375/28.0*x^28.0+5.5/4.0*x^4.0-1.0/405.8823529411764/-22.0/x^22.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/265.2631578947369/x^7.0-1.0/2184.0*x^16.0+1.0/1.1428571428571428*x^4.0+1.0/780.0/x^10.0-1.0/4044.5217391304345*x^19.0+x^4.0+1.0/1747.2/x^13.0-1.0/6752.3076923076915*x^22.0+1.125*x^4.0+1.0/3322.2857142857147/x^16.0-1.0/10468.96551724138*x^25.0+1.25*x^4.0+1.0/5663.225806451613/x^19.0-1.0/15356.25*x^28.0+1.375*x^4.0+1.0/8929.411764705881/x^22.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120396() {
 UsageCalculus.TestCase = 120396;
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

public static void TestCaseDiff120397() {
 UsageCalculus.TestCase = 120397;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "+21+22/x^14-23*x^15+24+25/x^17-26*x^18+27*xyzxyzxyzxyzxyzxyzxyzxyzxyz^-19+28/x^20-29*x^21+30*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-22+31/x^23-32*x^24+33*xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz^-25+34/x^26-35*x^27+36+37/x^29-38*x^30";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "21.0+22.0/x^14.0-23.0*x^15.0+24.0+25.0/x^17.0-26.0*x^18.0+27.0+28.0/x^20.0-29.0*x^21.0+30.0+31.0/x^23.0-32.0*x^24.0+33.0+34.0/x^26.0-35.0*x^27.0+36.0+37.0/x^29.0-38.0*x^30.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+22.0*-14.0/x^15.0-23.0*15.0*x^14.0+24.0*0.0+25.0*-17.0/x^18.0-26.0*18.0*x^17.0+27.0*0.0+28.0*-20.0/x^21.0-29.0*21.0*x^20.0+30.0*0.0+31.0*-23.0/x^24.0-32.0*24.0*x^23.0+33.0*0.0+34.0*-26.0/x^27.0-35.0*27.0*x^26.0+36.0*0.0+37.0*-29.0/x^30.0-38.0*30.0*x^29.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-308.0/x^15.0-345.0*x^14.0-425.0/x^18.0-468.0*x^17.0-560.0/x^21.0-609.0*x^20.0-713.0/x^24.0-768.0*x^23.0-884.0/x^27.0-945.0*x^26.0-1073.0/x^30.0-1140.0*x^29.0";
 UsageCalculus.EqnSolArrayMap3[1] = "21.0+22.0/x^14.0-23.0*x^15.0+24.0+25.0/x^17.0-26.0*x^18.0+27.0+28.0/x^20.0-29.0*x^21.0+30.0+31.0/x^23.0-32.0*x^24.0+33.0+34.0/x^26.0-35.0*x^27.0+36.0+37.0/x^29.0-38.0*x^30.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "21.0*x+22.0/-13.0/x^13.0-23.0/16.0*x^16.0+24.0*x+25.0/-16.0/x^16.0-26.0/19.0*x^19.0+27.0*x+28.0/-19.0/x^19.0-29.0/22.0*x^22.0+30.0*x+31.0/-22.0/x^22.0-32.0/25.0*x^25.0+33.0*x+34.0/-25.0/x^25.0-35.0/28.0*x^28.0+36.0*x+37.0/-28.0/x^28.0-38.0/31.0*x^31.0";
 UsageCalculus.EqnSolArrayMap4[1] = "21.0*x-1.6923076923076923/x^13.0-1.4375*x^16.0+24.0*x-1.5625/x^16.0-1.368421052631579*x^19.0+27.0*x-1.4736842105263157/x^19.0-1.3181818181818181*x^22.0+30.0*x-1.4090909090909092/x^22.0-1.28*x^25.0+33.0*x-1.36/x^25.0-1.25*x^28.0+36.0*x-1.3214285714285714/x^28.0-1.2258064516129032*x^31.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-308.0/x^15.0-345.0*x^14.0-425.0/x^18.0-468.0*x^17.0-560.0/x^21.0-609.0*x^20.0-713.0/x^24.0-768.0*x^23.0-884.0/x^27.0-945.0*x^26.0-1073.0/x^30.0-1140.0*x^29.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-308.0*-15.0/x^16.0-345.0*14.0*x^13.0-425.0*-18.0/x^19.0-468.0*17.0*x^16.0-560.0*-21.0/x^22.0-609.0*20.0*x^19.0-713.0*-24.0/x^25.0-768.0*23.0*x^22.0-884.0*-27.0/x^28.0-945.0*26.0*x^25.0-1073.0*-30.0/x^31.0-1140.0*29.0*x^28.0";
 UsageCalculus.EqnSolArrayMap2[2] = "4620.0/x^16.0-4830.0*x^13.0+7650.0/x^19.0-7956.0*x^16.0+11760.0/x^22.0-12180.0*x^19.0+17112.0/x^25.0-17664.0*x^22.0+23868.0/x^28.0-24570.0*x^25.0+32190.0/x^31.0-33060.0*x^28.0";
 UsageCalculus.EqnSolArrayMap3[2] = "21.0*x-1.6923076923076923/x^13.0-1.4375*x^16.0+24.0*x-1.5625/x^16.0-1.368421052631579*x^19.0+27.0*x-1.4736842105263157/x^19.0-1.3181818181818181*x^22.0+30.0*x-1.4090909090909092/x^22.0-1.28*x^25.0+33.0*x-1.36/x^25.0-1.25*x^28.0+36.0*x-1.3214285714285714/x^28.0-1.2258064516129032*x^31.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "21.0/2.0*x^2.0-1.6923076923076923/-12.0/x^12.0-1.4375/17.0*x^17.0+24.0/2.0*x^2.0-1.5625/-15.0/x^15.0-1.368421052631579/20.0*x^20.0+27.0/2.0*x^2.0-1.4736842105263157/-18.0/x^18.0-1.3181818181818181/23.0*x^23.0+30.0/2.0*x^2.0-1.4090909090909092/-21.0/x^21.0-1.28/26.0*x^26.0+33.0/2.0*x^2.0-1.36/-24.0/x^24.0-1.25/29.0*x^29.0+36.0/2.0*x^2.0-1.3214285714285714/-27.0/x^27.0-1.2258064516129032/32.0*x^32.0";
 UsageCalculus.EqnSolArrayMap4[2] = "10.5*x^2.0+1.0/7.090909090909091/x^12.0-1.0/11.826086956521738*x^17.0+12.0*x^2.0+1.0/9.6/x^15.0-1.0/14.615384615384615*x^20.0+13.5*x^2.0+1.0/12.214285714285715/x^18.0-1.0/17.448275862068968*x^23.0+15.0*x^2.0+1.0/14.903225806451612/x^21.0-1.0/20.3125*x^26.0+16.5*x^2.0+1.0/17.64705882352941/x^24.0-1.0/23.2*x^29.0+18.0*x^2.0+1.0/20.43243243243243/x^27.0-1.0/26.105263157894736*x^32.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "4620.0/x^16.0-4830.0*x^13.0+7650.0/x^19.0-7956.0*x^16.0+11760.0/x^22.0-12180.0*x^19.0+17112.0/x^25.0-17664.0*x^22.0+23868.0/x^28.0-24570.0*x^25.0+32190.0/x^31.0-33060.0*x^28.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "4620.0*-16.0/x^17.0-4830.0*13.0*x^12.0+7650.0*-19.0/x^20.0-7956.0*16.0*x^15.0+11760.0*-22.0/x^23.0-12180.0*19.0*x^18.0+17112.0*-25.0/x^26.0-17664.0*22.0*x^21.0+23868.0*-28.0/x^29.0-24570.0*25.0*x^24.0+32190.0*-31.0/x^32.0-33060.0*28.0*x^27.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-73920.0/x^17.0-62790.0*x^12.0-145350.0/x^20.0-127296.0*x^15.0-258720.0/x^23.0-231420.0*x^18.0-427800.0/x^26.0-388608.0*x^21.0-668304.0/x^29.0-614250.0*x^24.0-997890.0/x^32.0-925680.0*x^27.0";
 UsageCalculus.EqnSolArrayMap3[3] = "10.5*x^2.0+1.0/7.090909090909091/x^12.0-1.0/11.826086956521738*x^17.0+12.0*x^2.0+1.0/9.6/x^15.0-1.0/14.615384615384615*x^20.0+13.5*x^2.0+1.0/12.214285714285715/x^18.0-1.0/17.448275862068968*x^23.0+15.0*x^2.0+1.0/14.903225806451612/x^21.0-1.0/20.3125*x^26.0+16.5*x^2.0+1.0/17.64705882352941/x^24.0-1.0/23.2*x^29.0+18.0*x^2.0+1.0/20.43243243243243/x^27.0-1.0/26.105263157894736*x^32.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "10.5/3.0*x^3.0+1.0/7.090909090909091/-11.0/x^11.0-1.0/11.826086956521738/18.0*x^18.0+12.0/3.0*x^3.0+1.0/9.6/-14.0/x^14.0-1.0/14.615384615384615/21.0*x^21.0+13.5/3.0*x^3.0+1.0/12.214285714285715/-17.0/x^17.0-1.0/17.448275862068968/24.0*x^24.0+15.0/3.0*x^3.0+1.0/14.903225806451612/-20.0/x^20.0-1.0/20.3125/27.0*x^27.0+16.5/3.0*x^3.0+1.0/17.64705882352941/-23.0/x^23.0-1.0/23.2/30.0*x^30.0+18.0/3.0*x^3.0+1.0/20.43243243243243/-26.0/x^26.0-1.0/26.105263157894736/33.0*x^33.0";
 UsageCalculus.EqnSolArrayMap4[3] = "3.5*x^3.0-1.0/78.0/x^11.0-1.0/212.86956521739128*x^18.0+4.0*x^3.0-1.0/134.4/x^14.0-1.0/306.9230769230769*x^21.0+4.5*x^3.0-1.0/207.64285714285717/x^17.0-1.0/418.75862068965523*x^24.0+5.0*x^3.0-1.0/298.06451612903226/x^20.0-1.0/548.4375*x^27.0+5.5*x^3.0-1.0/405.8823529411764/x^23.0-1.0/696.0*x^30.0+6.0*x^3.0-1.0/531.2432432432432/x^26.0-1.0/861.4736842105262*x^33.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-73920.0/x^17.0-62790.0*x^12.0-145350.0/x^20.0-127296.0*x^15.0-258720.0/x^23.0-231420.0*x^18.0-427800.0/x^26.0-388608.0*x^21.0-668304.0/x^29.0-614250.0*x^24.0-997890.0/x^32.0-925680.0*x^27.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-73920.0*-17.0/x^18.0-62790.0*12.0*x^11.0-145350.0*-20.0/x^21.0-127296.0*15.0*x^14.0-258720.0*-23.0/x^24.0-231420.0*18.0*x^17.0-427800.0*-26.0/x^27.0-388608.0*21.0*x^20.0-668304.0*-29.0/x^30.0-614250.0*24.0*x^23.0-997890.0*-32.0/x^33.0-925680.0*27.0*x^26.0";
 UsageCalculus.EqnSolArrayMap2[4] = "1256640.0/x^18.0-753480.0*x^11.0+2907000.0/x^21.0-1909440.0*x^14.0+5950560.0/x^24.0-4165560.0*x^17.0+1.11228E7/x^27.0-8160768.0*x^20.0+1.9380816E7/x^30.0-1.4742E7*x^23.0+3.193248E7/x^33.0-2.499336E7*x^26.0";
 UsageCalculus.EqnSolArrayMap3[4] = "3.5*x^3.0-1.0/78.0/x^11.0-1.0/212.86956521739128*x^18.0+4.0*x^3.0-1.0/134.4/x^14.0-1.0/306.9230769230769*x^21.0+4.5*x^3.0-1.0/207.64285714285717/x^17.0-1.0/418.75862068965523*x^24.0+5.0*x^3.0-1.0/298.06451612903226/x^20.0-1.0/548.4375*x^27.0+5.5*x^3.0-1.0/405.8823529411764/x^23.0-1.0/696.0*x^30.0+6.0*x^3.0-1.0/531.2432432432432/x^26.0-1.0/861.4736842105262*x^33.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "3.5/4.0*x^4.0-1.0/78.0/-10.0/x^10.0-1.0/212.86956521739128/19.0*x^19.0+4.0/4.0*x^4.0-1.0/134.4/-13.0/x^13.0-1.0/306.9230769230769/22.0*x^22.0+4.5/4.0*x^4.0-1.0/207.64285714285717/-16.0/x^16.0-1.0/418.75862068965523/25.0*x^25.0+5.0/4.0*x^4.0-1.0/298.06451612903226/-19.0/x^19.0-1.0/548.4375/28.0*x^28.0+5.5/4.0*x^4.0-1.0/405.8823529411764/-22.0/x^22.0-1.0/696.0/31.0*x^31.0+6.0/4.0*x^4.0-1.0/531.2432432432432/-25.0/x^25.0-1.0/861.4736842105262/34.0*x^34.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/1.1428571428571428*x^4.0+1.0/780.0/x^10.0-1.0/4044.5217391304345*x^19.0+x^4.0+1.0/1747.2/x^13.0-1.0/6752.3076923076915*x^22.0+1.125*x^4.0+1.0/3322.2857142857147/x^16.0-1.0/10468.96551724138*x^25.0+1.25*x^4.0+1.0/5663.225806451613/x^19.0-1.0/15356.25*x^28.0+1.375*x^4.0+1.0/8929.411764705881/x^22.0-1.0/21576.0*x^31.0+1.5*x^4.0+1.0/13281.08108108108/x^25.0-1.0/29290.105263157893*x^34.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff120398() {
 UsageCalculus.TestCase = 120398;
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

public static void TestCaseDiff120399() {
 UsageCalculus.TestCase = 120399;
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

public static void TestCaseDiff120400() {
 UsageCalculus.TestCase = 120400;
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
}

