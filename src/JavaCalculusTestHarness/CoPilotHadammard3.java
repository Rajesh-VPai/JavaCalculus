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
public class CoPilotHadammard3 {
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
     
                case 121301L:
 TestCaseDiff121301(); 
 break;
case 121302L:
 TestCaseDiff121302(); 
 break;
case 121303L:
 TestCaseDiff121303(); 
 break;
case 121304L:
 TestCaseDiff121304(); 
 break;
case 121305L:
 TestCaseDiff121305(); 
 break;
case 121306L:
 TestCaseDiff121306(); 
 break;
case 121307L:
 TestCaseDiff121307(); 
 break;
case 121308L:
 TestCaseDiff121308(); 
 break;
case 121309L:
 TestCaseDiff121309(); 
 break;
case 121310L:
 TestCaseDiff121310(); 
 break;
case 121311L:
 TestCaseDiff121311(); 
 break;
case 121312L:
 TestCaseDiff121312(); 
 break;
case 121313L:
 TestCaseDiff121313(); 
 break;
case 121314L:
 TestCaseDiff121314(); 
 break;
case 121315L:
 TestCaseDiff121315(); 
 break;
case 121316L:
 TestCaseDiff121316(); 
 break;
case 121317L:
 TestCaseDiff121317(); 
 break;
case 121318L:
 TestCaseDiff121318(); 
 break;
case 121319L:
 TestCaseDiff121319(); 
 break;
case 121320L:
 TestCaseDiff121320(); 
 break;
case 121321L:
 TestCaseDiff121321(); 
 break;
case 121322L:
 TestCaseDiff121322(); 
 break;
case 121323L:
 TestCaseDiff121323(); 
 break;
case 121324L:
 TestCaseDiff121324(); 
 break;
case 121325L:
 TestCaseDiff121325(); 
 break;
case 121326L:
 TestCaseDiff121326(); 
 break;
case 121327L:
 TestCaseDiff121327(); 
 break;
case 121328L:
 TestCaseDiff121328(); 
 break;
case 121329L:
 TestCaseDiff121329(); 
 break;
case 121330L:
 TestCaseDiff121330(); 
 break;
case 121331L:
 TestCaseDiff121331(); 
 break;
case 121332L:
 TestCaseDiff121332(); 
 break;
case 121333L:
 TestCaseDiff121333(); 
 break;
case 121334L:
 TestCaseDiff121334(); 
 break;
case 121335L:
 TestCaseDiff121335(); 
 break;
case 121336L:
 TestCaseDiff121336(); 
 break;
case 121337L:
 TestCaseDiff121337(); 
 break;
case 121338L:
 TestCaseDiff121338(); 
 break;
case 121339L:
 TestCaseDiff121339(); 
 break;
case 121340L:
 TestCaseDiff121340(); 
 break;
case 121341L:
 TestCaseDiff121341(); 
 break;
case 121342L:
 TestCaseDiff121342(); 
 break;
case 121343L:
 TestCaseDiff121343(); 
 break;
case 121344L:
 TestCaseDiff121344(); 
 break;
case 121345L:
 TestCaseDiff121345(); 
 break;
case 121346L:
 TestCaseDiff121346(); 
 break;
case 121347L:
 TestCaseDiff121347(); 
 break;
case 121348L:
 TestCaseDiff121348(); 
 break;
case 121349L:
 TestCaseDiff121349(); 
 break;
case 121350L:
 TestCaseDiff121350(); 
 break;
case 121351L:
 TestCaseDiff121351(); 
 break;
case 121352L:
 TestCaseDiff121352(); 
 break;
case 121353L:
 TestCaseDiff121353(); 
 break;
case 121354L:
 TestCaseDiff121354(); 
 break;
case 121355L:
 TestCaseDiff121355(); 
 break;
case 121356L:
 TestCaseDiff121356(); 
 break;
case 121357L:
 TestCaseDiff121357(); 
 break;
case 121358L:
 TestCaseDiff121358(); 
 break;
case 121359L:
 TestCaseDiff121359(); 
 break;
case 121360L:
 TestCaseDiff121360(); 
 break;
case 121361L:
 TestCaseDiff121361(); 
 break;
case 121362L:
 TestCaseDiff121362(); 
 break;
case 121363L:
 TestCaseDiff121363(); 
 break;
case 121364L:
 TestCaseDiff121364(); 
 break;
case 121365L:
 TestCaseDiff121365(); 
 break;
case 121366L:
 TestCaseDiff121366(); 
 break;
case 121367L:
 TestCaseDiff121367(); 
 break;
case 121368L:
 TestCaseDiff121368(); 
 break;
case 121369L:
 TestCaseDiff121369(); 
 break;
case 121370L:
 TestCaseDiff121370(); 
 break;
case 121371L:
 TestCaseDiff121371(); 
 break;
case 121372L:
 TestCaseDiff121372(); 
 break;
case 121373L:
 TestCaseDiff121373(); 
 break;
case 121374L:
 TestCaseDiff121374(); 
 break;
case 121375L:
 TestCaseDiff121375(); 
 break;
case 121376L:
 TestCaseDiff121376(); 
 break;
case 121377L:
 TestCaseDiff121377(); 
 break;
case 121378L:
 TestCaseDiff121378(); 
 break;
case 121379L:
 TestCaseDiff121379(); 
 break;
case 121380L:
 TestCaseDiff121380(); 
 break;
case 121381L:
 TestCaseDiff121381(); 
 break;
case 121382L:
 TestCaseDiff121382(); 
 break;
case 121383L:
 TestCaseDiff121383(); 
 break;
case 121384L:
 TestCaseDiff121384(); 
 break;
case 121385L:
 TestCaseDiff121385(); 
 break;
case 121386L:
 TestCaseDiff121386(); 
 break;
case 121387L:
 TestCaseDiff121387(); 
 break;
case 121388L:
 TestCaseDiff121388(); 
 break;
case 121389L:
 TestCaseDiff121389(); 
 break;
case 121390L:
 TestCaseDiff121390(); 
 break;
case 121391L:
 TestCaseDiff121391(); 
 break;
case 121392L:
 TestCaseDiff121392(); 
 break;
case 121393L:
 TestCaseDiff121393(); 
 break;
case 121394L:
 TestCaseDiff121394(); 
 break;
case 121395L:
 TestCaseDiff121395(); 
 break;
case 121396L:
 TestCaseDiff121396(); 
 break;
case 121397L:
 TestCaseDiff121397(); 
 break;
case 121398L:
 TestCaseDiff121398(); 
 break;
case 121399L:
 TestCaseDiff121399(); 
 break;
case 121400L:
 TestCaseDiff121400(); 
 break;

                
default:
                    System.out.println(ConsoleColors.RED + "CoPilotEqnBasic TestCase:j= " + j + ": Gap" + ConsoleColors.RESET);
                    break;
            }
        }
    }
    
   public static void TestCaseDiff121301() {
 UsageCalculus.TestCase = 121301;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*x0/-1*x0^2*-2*x0^3-1*x^2*-2*x^3*3*x/1*x^22*x^33*x0/1*x0^21*x^2*--3*x^3*1*x-3*x^3*1*x/2*x^2*-3*x^31*x02*x^2*-3*x^33*x^3*-1*x/2*x^22*x0^2*-3*x0^3*1*x0/-3*x0^23*x^31*x/-3*x^2-3*x0^2*-1*x0^3*2*x03*x0/-1*x0^2-1*x^2*-2*x^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=300 EqnNumber=4 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[31, 4, 13, 14, 1, 3, 1, 5, 3, 1, 2, 1, 1, 2, 1, 3, 1, 1, 5, 3, 4, 2, 1, 2, 3, 4, 2, 1, 1, 16, 1, 18, 3, 20, 29]"+
"// DOEMatrixRow=[28, 5, 16, 3, 1, 3, 1, 5, 3, 4, 1, 1, 1, 2, 3, 1, 2, 6, 5, 1, 2, 1, 3, 2, 6, 3, 1, 2, 3, 7, 1, 6, 4]"+
//Tail EqnIndex=300 EqnNumber=4 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[31, 4, 13, 14, 1, 3, 1, 5, 3, 1, 2, 1, 1, 2, 1, 3, 1, 1, 5, 3, 4, 2, 1, 2, 3, 4, 2, 1, 1, 16, 1, 18, 3, 20, 29]"+
"// DOEMatrixRow=[28, 5, 16, 3, 1, 3, 1, 5, 3, 4, 1, 1, 1, 2, 3, 1, 2, 6, 5, 1, 2, 1, 3, 2, 6, 3, 1, 2, 3, 7, 1, 6, 4]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "6.0+18.0*x^67.0-3.0*x^4.0-2.25*x^132.0-6.0+2.0*x^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+18.0*67.0*x^66.0-3.0*4.0*x^3.0-2.25*132.0*x^131.0-6.0*0.0+2.0*5.0*x^4.0";
 UsageCalculus.EqnSolArrayMap2[1] = "1206.0*x^66.0-12.0*x^3.0-297.0*x^131.0+10.0*x^4.0";
 UsageCalculus.EqnSolArrayMap3[1] = "6.0+18.0*x^67.0-3.0*x^4.0-2.25*x^132.0-6.0+2.0*x^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "6.0*x+18.0/68.0*x^68.0-3.0/5.0*x^5.0-2.25/133.0*x^133.0-6.0*x+2.0/6.0*x^6.0";
 UsageCalculus.EqnSolArrayMap4[1] = "6.0*x+1.0/3.7777777777777777*x^68.0-1.0/1.6666666666666667*x^5.0-1.0/59.111111111111114*x^133.0-6.0*x+1.0/3.0*x^6.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "1206.0*x^66.0-12.0*x^3.0-297.0*x^131.0+10.0*x^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "1206.0*66.0*x^65.0-12.0*3.0*x^2.0-297.0*131.0*x^130.0+10.0*4.0*x^3.0";
 UsageCalculus.EqnSolArrayMap2[2] = "79596.0*x^65.0-36.0*x^2.0-38907.0*x^130.0+40.0*x^3.0";
 UsageCalculus.EqnSolArrayMap3[2] = "6.0*x+1.0/3.7777777777777777*x^68.0-1.0/1.6666666666666667*x^5.0-1.0/59.111111111111114*x^133.0-6.0*x+1.0/3.0*x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "6.0/2.0*x^2.0+1.0/3.7777777777777777/69.0*x^69.0-1.0/1.6666666666666667/6.0*x^6.0-1.0/59.111111111111114/134.0*x^134.0-6.0/2.0*x^2.0+1.0/3.0/7.0*x^7.0";
 UsageCalculus.EqnSolArrayMap4[2] = "3.0*x^2.0+1.0/260.6666666666667*x^69.0-1.0/10.0*x^6.0-1.0/7920.88888888889*x^134.0-3.0*x^2.0+1.0/21.0*x^7.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "79596.0*x^65.0-36.0*x^2.0-38907.0*x^130.0+40.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "79596.0*65.0*x^64.0-36.0*2.0*x^1.0-38907.0*130.0*x^129.0+40.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[3] = "5173740.0*x^64.0-72.0*x-5057910.0*x^129.0+120.0*x^2.0";
 UsageCalculus.EqnSolArrayMap3[3] = "3.0*x^2.0+1.0/260.6666666666667*x^69.0-1.0/10.0*x^6.0-1.0/7920.88888888889*x^134.0-3.0*x^2.0+1.0/21.0*x^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "3.0/3.0*x^3.0+1.0/260.6666666666667/70.0*x^70.0-1.0/10.0/7.0*x^7.0-1.0/7920.88888888889/135.0*x^135.0-3.0/3.0*x^3.0+1.0/21.0/8.0*x^8.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x^3.0+1.0/18246.666666666668*x^70.0-1.0/70.0*x^7.0-1.0/1069320.0*x^135.0-x^3.0+1.0/168.0*x^8.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "5173740.0*x^64.0-72.0*x-5057910.0*x^129.0+120.0*x^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "5173740.0*64.0*x^63.0-72.0-5057910.0*129.0*x^128.0+120.0*2.0*x^1.0";
 UsageCalculus.EqnSolArrayMap2[4] = "3.3111936E8*x^63.0-72.0-6.5247039E8*x^128.0+240.0*x";
 UsageCalculus.EqnSolArrayMap3[4] = "x^3.0+1.0/18246.666666666668*x^70.0-1.0/70.0*x^7.0-9.351737552837317E-7*x^135.0-x^3.0+1.0/168.0*x^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/4.0*x^4.0+1.0/18246.666666666668/71.0*x^71.0-1.0/70.0/8.0*x^8.0-9.351737552837317E-7/136.0*x^136.0-1.0/4.0*x^4.0+1.0/168.0/9.0*x^9.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/4.0*x^4.0+1.0/1295513.3333333335*x^71.0-1.0/560.0*x^8.0-1.0/1.4542752E8*x^136.0-1.0/19.428571428571427*x^136.0-1.0/4.0*x^4.0+1.0/1512.0*x^9.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff121302() {
 UsageCalculus.TestCase = 121302;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-1*xy^2*-2*xy^3*3*xy/1*xy^22*xy^33*x0/1*x0^21*xy^2*--3*xy^3*1*xy-3*xy^3*1*xy/2*xy^2*-3*xy^31*x02*xy^2*-3*xy^33*xy^3*-1*xy/2*xy^22*x0^2*-3*x0^3*1*x0/-3*x0^23*xy^31*xy/-3*xy^2-3*x0^2*-1*x0^3*2*x01*xy^3*2*xy/3*xy^2*--1*xy^32*xy-1*xy^2*-2*xy^32*xy^3*3*xy";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=301 EqnNumber=5 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[96, 5, 14, 15, 2, 1, 2, 6, 1, 2, 3, 2, 3, 1, 2, 1, 2, 1, 1, 1, 1, 3, 2, 3, 1, 1, 3, 2, 3, 1, 2, 19, 4, 21, 30]"+
"// DOEMatrixRow=[94, 6, 17, 4, 2, 1, 2, 6, 1, 1, 2, 1, 2, 3, 4, 2, 3, 7, 6, 2, 3, 2, 1, 3, 1, 4, 2, 3, 4, 8, 2, 7, 5]"+
//Tail EqnIndex=301 EqnNumber=5 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[96, 5, 14, 15, 2, 1, 2, 6, 1, 2, 3, 2, 3, 1, 2, 1, 2, 1, 1, 1, 1, 3, 2, 3, 1, 1, 3, 2, 3, 1, 2, 19, 4, 21, 30]"+
"// DOEMatrixRow=[94, 6, 17, 4, 2, 1, 2, 6, 1, 1, 2, 1, 2, 3, 4, 2, 3, 7, 6, 2, 3, 2, 1, 3, 1, 4, 2, 3, 4, 8, 2, 7, 5]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0*18.0*xy^67.0-3.0*xy^4.0-x02*x0*2.25*xy^132.0+x0^2.0*x01*4.0*xy^39.0-xy^33.0+6.0*xy^38.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0*18.0*67.0*xy^66.0-3.0*4.0*xy^3.0-x02*x0*2.25*132.0*xy^131.0+x0^2.0*x01*4.0*39.0*xy^38.0-33.0*xy^32.0+6.0*38.0*xy^37.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0*1206.0*xy^66.0-12.0*xy^3.0-x02*x0*297.0*xy^131.0+x0^2.0*x01*156.0*xy^38.0-33.0*xy^32.0+228.0*xy^37.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0*18.0*xy^67.0-3.0*xy^4.0-x02*x0*2.25*xy^132.0+x0^2.0*x01*4.0*xy^39.0-xy^33.0+6.0*xy^38.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0*18.0/68.0*xy^68.0-3.0/5.0*xy^5.0-x02*x0*2.25/133.0*xy^133.0+x0^2.0*x01*4.0/40.0*xy^40.0-1.0/34.0*xy^34.0+6.0/39.0*xy^39.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0/3.7777777777777777*xy^68.0-0.6*xy^5.0-x02*x0*0.016917293233082706*xy^133.0+x0^2.0*x01/10.0*xy^40.0-1.0/34.0*xy^34.0+1.0/6.5*xy^39.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0*1206.0*xy^66.0-12.0*xy^3.0-x02*x0*297.0*xy^131.0+x0^2.0*x01*156.0*xy^38.0-33.0*xy^32.0+228.0*xy^37.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0*1206.0*66.0*xy^65.0-12.0*3.0*xy^2.0-x02*x0*297.0*131.0*xy^130.0+x0^2.0*x01*156.0*38.0*xy^37.0-33.0*32.0*xy^31.0+228.0*37.0*xy^36.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0*79596.0*xy^65.0-36.0*xy^2.0-x02*x0*38907.0*xy^130.0+x0^2.0*x01*5928.0*xy^37.0-1056.0*xy^31.0+8436.0*xy^36.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0/3.7777777777777777*xy^68.0-0.6*xy^5.0-x02*x0*0.016917293233082706*xy^133.0+x0^2.0*x01/10.0*xy^40.0-1.0/34.0*xy^34.0+1.0/6.5*xy^39.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0/3.7777777777777777/69.0*xy^69.0-0.6/6.0*xy^6.0-x02*x0*0.016917293233082706/134.0*xy^134.0+x0^2.0*x01/10.0/41.0*xy^41.0-1.0/34.0/35.0*xy^35.0+1.0/6.5/40.0*xy^40.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0/260.6666666666667*xy^69.0-0.09999999999999999*xy^6.0-x02*x0*1.262484569633038E-4*xy^134.0+x0^2.0*x01/410.0*xy^41.0-1.0/1190.0*xy^35.0+1.0/260.0*xy^40.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0*79596.0*xy^65.0-36.0*xy^2.0-x02*x0*38907.0*xy^130.0+x0^2.0*x01*5928.0*xy^37.0-1056.0*xy^31.0+8436.0*xy^36.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0*79596.0*65.0*xy^64.0-36.0*2.0*xy^1.0-x02*x0*38907.0*130.0*xy^129.0+x0^2.0*x01*5928.0*37.0*xy^36.0-1056.0*31.0*xy^30.0+8436.0*36.0*xy^35.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0*5173740.0*xy^64.0-72.0*xy-x02*x0*5057910.0*xy^129.0+x0^2.0*x01*219336.0*xy^36.0-32736.0*xy^30.0+303696.0*xy^35.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0/260.6666666666667*xy^69.0-0.09999999999999999*xy^6.0-x02*x0*1.262484569633038E-4*xy^134.0-4.0*xy^134.0+x0^2.0*x01/410.0*xy^41.0-1.0/1190.0*xy^35.0+1.0/260.0*xy^40.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0/260.6666666666667/70.0*xy^70.0-0.09999999999999999/7.0*xy^7.0-x02*x0*1.262484569633038E-4/135.0*xy^135.0-4.0/135.0*xy^135.0+x0^2.0*x01/410.0/42.0*xy^42.0-1.0/1190.0/36.0*xy^36.0+1.0/260.0/41.0*xy^41.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0/18246.666666666668*xy^70.0-0.014285714285714285*xy^7.0-x02*x0/1069320.0*xy^135.0-1.0/33.75*xy^135.0-0.02962962962962963*xy^135.0+x0^2.0*x01/17220.0*xy^42.0-1.0/42840.0*xy^36.0+1.0/10660.0*xy^41.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0*5173740.0*xy^64.0-72.0*xy-x02*x0*5057910.0*xy^129.0+x0^2.0*x01*219336.0*xy^36.0-32736.0*xy^30.0+303696.0*xy^35.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0*5173740.0*64.0*xy^63.0-72.0-x02*x0*5057910.0*129.0*xy^128.0+x0^2.0*x01*219336.0*36.0*xy^35.0-32736.0*30.0*xy^29.0+303696.0*35.0*xy^34.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0*3.3111936E8*xy^63.0-72.0-x02*x0*6.5247039E8*xy^128.0+x0^2.0*x01*7896096.0*xy^35.0-982080.0*xy^29.0+1.062936E7*xy^34.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0/18246.666666666668*xy^70.0-0.014285714285714285*xy^7.0-x02*x0/1069320.0*xy^135.0-1.0/33.75*xy^135.0-0.02962962962962963*xy^135.0+x0^2.0*x01/17220.0*xy^42.0-1.0/42840.0*xy^36.0+1.0/10660.0*xy^41.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0/18246.666666666668/71.0*xy^71.0-0.014285714285714285/8.0*xy^8.0-x02*x0/1069320.0/136.0*xy^136.0-1.0/33.75/136.0*xy^136.0-0.02962962962962963/136.0*xy^136.0+x0^2.0*x01/17220.0/43.0*xy^43.0-1.0/42840.0/37.0*xy^37.0+1.0/10660.0/42.0*xy^42.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0/1295513.3333333335*xy^71.0-0.0017857142857142857*xy^8.0-x02*x0/1.4542752E8*xy^136.0-1.0/4590.0*xy^136.0-2.178649237472767E-4*xy^136.0+x0^2.0*x01/740460.0*xy^43.0-1.0/1585080.0*xy^37.0+1.0/447720.0*xy^42.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff121303() {
 UsageCalculus.TestCase = 121303;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xyz^33*x0/1*x0^21*xyz^2*--3*xyz^3*1*xyz-3*xyz^3*1*xyz/2*xyz^2*-3*xyz^31*x02*xyz^2*-3*xyz^33*xyz^3*-1*xyz/2*xyz^22*x0^2*-3*x0^3*1*x0/-3*x0^23*xyz^31*xyz/-3*xyz^2-3*x0^2*-1*x0^3*2*x01*xyz^3*2*xyz/3*xyz^2*--1*xyz^32*xyz3*x0^2*--1*x0^3-1*xyz^3*2*xyz/3*xyz^22*xyz^3*3*xyz3*x0/1*x0^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=302 EqnNumber=6 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[61, 6, 15, 16, 3, 2, 3, 7, 2, 3, 4, 1, 1, 2, 3, 2, 3, 2, 3, 2, 3, 4, 3, 1, 2, 3, 4, 3, 4, 2, 3, 20, 5, 22, 31]"+
"// DOEMatrixRow=[59, 7, 18, 1, 3, 2, 3, 7, 2, 3, 4, 2, 3, 1, 1, 3, 1, 8, 7, 3, 1, 3, 2, 1, 2, 1, 3, 1, 1, 9, 1, 8, 6]"+
//Tail EqnIndex=302 EqnNumber=6 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[61, 6, 15, 16, 3, 2, 3, 7, 2, 3, 4, 1, 1, 2, 3, 2, 3, 2, 3, 2, 3, 4, 3, 1, 2, 3, 4, 3, 4, 2, 3, 20, 5, 22, 31]"+
"// DOEMatrixRow=[59, 7, 18, 1, 3, 2, 3, 7, 2, 3, 4, 2, 3, 1, 1, 3, 1, 8, 7, 3, 1, 3, 2, 1, 2, 1, 3, 1, 1, 9, 1, 8, 6]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0*6.0*xyz^39.0-3.0*xyz^4.0-x02*x0*2.25*xyz^132.0+x0^2.0*4.0*xyz^38.0-x0^2.0*xyz^32.0-x0^3.0-x0*2.0*xyz^29.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0*6.0*39.0*xyz^38.0-3.0*4.0*xyz^3.0-x02*x0*2.25*132.0*xyz^131.0+x0^2.0*4.0*38.0*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0-x0*2.0*29.0*xyz^28.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0*234.0*xyz^38.0-12.0*xyz^3.0-x02*x0*297.0*xyz^131.0+x0^2.0*152.0*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0-x0*58.0*xyz^28.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0*6.0*xyz^39.0-3.0*xyz^4.0-x02*x0*2.25*xyz^132.0+x0^2.0*4.0*xyz^38.0-x0^2.0*xyz^32.0-x0^3.0-x0*2.0*xyz^29.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0*6.0/40.0*xyz^40.0-3.0/5.0*xyz^5.0-x02*x0*2.25/133.0*xyz^133.0+x0^2.0*4.0/39.0*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz-x0*2.0/30.0*xyz^30.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0/6.666666666666667*xyz^40.0-0.6*xyz^5.0-x02*x0*0.016917293233082706*xyz^133.0+x0^2.0*0.10256410256410256*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz-x0/15.0*xyz^30.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0*234.0*xyz^38.0-12.0*xyz^3.0-x02*x0*297.0*xyz^131.0+x0^2.0*152.0*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0-x0*58.0*xyz^28.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0*234.0*38.0*xyz^37.0-12.0*3.0*xyz^2.0-x02*x0*297.0*131.0*xyz^130.0+x0^2.0*152.0*37.0*xyz^36.0-x0^2.0*32.0*31.0*xyz^30.0-x0^3.0*0.0*0.0-x0*58.0*28.0*xyz^27.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0*8892.0*xyz^37.0-36.0*xyz^2.0-x02*x0*38907.0*xyz^130.0+x0^2.0*5624.0*xyz^36.0-x0^2.0*992.0*xyz^30.0-x0^3.0*0.0-x0*1624.0*xyz^27.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0/6.666666666666667*xyz^40.0-0.6*xyz^5.0-x02*x0*0.016917293233082706*xyz^133.0+x0^2.0*0.10256410256410256*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz-x0/15.0*xyz^30.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0/6.666666666666667/41.0*xyz^41.0-0.6/6.0*xyz^6.0-x02*x0*0.016917293233082706/134.0*xyz^134.0+x0^2.0*0.10256410256410256/40.0*xyz^40.0-x0^2.0/33.0/34.0*xyz^34.0-x0^3.0/2.0*xyz^2.0-x0*15.0/31.0*xyz^31.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0/273.33333333333337*xyz^41.0-0.09999999999999999*xyz^6.0-x02*x0*1.262484569633038E-4*xyz^134.0+x0^2.0*0.002564102564102564*xyz^40.0-x0^2.0*8.9126559714795E-4*xyz^34.0-x0^3.0/2.0*xyz^2.0-x0/2.066666666666667*xyz^31.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0*8892.0*xyz^37.0-36.0*xyz^2.0-x02*x0*38907.0*xyz^130.0+x0^2.0*5624.0*xyz^36.0-x0^2.0*992.0*xyz^30.0-x0^3.0*0.0-x0*1624.0*xyz^27.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0*8892.0*37.0*xyz^36.0-36.0*2.0*xyz^1.0-x02*x0*38907.0*130.0*xyz^129.0+x0^2.0*5624.0*36.0*xyz^35.0-x0^2.0*992.0*30.0*xyz^29.0-x0^3.0*0.0*0.0-x0*1624.0*27.0*xyz^26.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0*329004.0*xyz^36.0-72.0*xyz-x02*x0*5057910.0*xyz^129.0+x0^2.0*202464.0*xyz^35.0-x0^2.0*29760.0*xyz^29.0-x0^3.0*0.0-x0*43848.0*xyz^26.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0/273.33333333333337*xyz^41.0-0.09999999999999999*xyz^6.0-x02*x0*1.262484569633038E-4*xyz^134.0-4.0*xyz^134.0+x0^2.0*0.002564102564102564*xyz^40.0-x0^2.0*8.9126559714795E-4*xyz^34.0-4.0*xyz^34.0-x0^3.0/2.0*xyz^2.0-x0/2.066666666666667*xyz^31.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0/273.33333333333337/42.0*xyz^42.0-0.09999999999999999/7.0*xyz^7.0-x02*x0*1.262484569633038E-4/135.0*xyz^135.0-4.0/135.0*xyz^135.0+x0^2.0*0.002564102564102564/41.0*xyz^41.0-x0^2.0*8.9126559714795E-4/35.0*xyz^35.0-4.0/35.0*xyz^35.0-x0^3.0/2.0/3.0*xyz^3.0-x0*2.066666666666667/32.0*xyz^32.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0/11480.000000000002*xyz^42.0-0.014285714285714285*xyz^7.0-x02*x0/1069320.0*xyz^135.0-1.0/33.75*xyz^135.0-0.02962962962962963*xyz^135.0+x0^2.0*6.253908692933083E-5*xyz^41.0-x0^2.0/39270.0*xyz^35.0-1.0/8.75*xyz^35.0-0.11428571428571428*xyz^35.0-x0^3.0*0.16666666666666666*xyz^3.0-x0/15.483870967741934*xyz^32.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0*329004.0*xyz^36.0-72.0*xyz-x02*x0*5057910.0*xyz^129.0+x0^2.0*202464.0*xyz^35.0-x0^2.0*29760.0*xyz^29.0-x0^3.0*0.0-x0*43848.0*xyz^26.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0*329004.0*36.0*xyz^35.0-72.0-x02*x0*5057910.0*129.0*xyz^128.0+x0^2.0*202464.0*35.0*xyz^34.0-x0^2.0*29760.0*29.0*xyz^28.0-x0^3.0*0.0*0.0-x0*43848.0*26.0*xyz^25.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0*1.1844144E7*xyz^35.0-72.0-x02*x0*6.5247039E8*xyz^128.0+x0^2.0*7086240.0*xyz^34.0-x0^2.0*863040.0*xyz^28.0-x0^3.0*0.0-x0*1140048.0*xyz^25.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0/11480.000000000002*xyz^42.0-0.014285714285714285*xyz^7.0-x02*x0/1069320.0*xyz^135.0-1.0/33.75*xyz^135.0-0.02962962962962963*xyz^135.0+x0^2.0*6.253908692933083E-5*xyz^41.0-5.0*xyz^41.0-x0^2.0/39270.0*xyz^35.0-1.0/8.75*xyz^35.0-0.11428571428571428*xyz^35.0-x0^3.0*0.16666666666666666*xyz^3.0-x0/15.483870967741934*xyz^32.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0/11480.000000000002/43.0*xyz^43.0-0.014285714285714285/8.0*xyz^8.0-x02*x0/1069320.0/136.0*xyz^136.0-1.0/33.75/136.0*xyz^136.0-0.02962962962962963/136.0*xyz^136.0+x0^2.0*6.253908692933083E-5/42.0*xyz^42.0-5.0/42.0*xyz^42.0-x0^2.0/39270.0/36.0*xyz^36.0-1.0/8.75/36.0*xyz^36.0-0.11428571428571428/36.0*xyz^36.0-x0^3.0*0.16666666666666666/4.0*xyz^4.0-x0*15.483870967741934/33.0*xyz^33.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0/493640.00000000006*xyz^43.0-0.0017857142857142857*xyz^8.0-x02*x0/1.4542752E8*xyz^136.0-1.0/4590.0*xyz^136.0-2.178649237472767E-4*xyz^136.0+x0^2.0/671580.0*xyz^42.0-1.0/8.4*xyz^42.0-0.11904761904761904*xyz^42.0-x0^2.0/1413720.0*xyz^36.0-1.0/315.0*xyz^36.0-0.0031746031746031746*xyz^36.0-x0^3.0*0.041666666666666664*xyz^4.0-x0/2.13125*xyz^33.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff121304() {
 UsageCalculus.TestCase = 121304;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*x0/1*x0^21*xyza^2*--3*xyza^3*1*xyza-3*xyza^3*1*xyza/2*xyza^2*-3*xyza^31*x02*xyza^2*-3*xyza^33*xyza^3*-1*xyza/2*xyza^22*x0^2*-3*x0^3*1*x0/-3*x0^23*xyza^31*xyza/-3*xyza^2-3*x0^2*-1*x0^3*2*x01*xyza^3*2*xyza/3*xyza^2*--1*xyza^32*xyza3*x0^2*--1*x0^3-1*xyza^3*2*xyza/3*xyza^22*xyza/3*xyza^2*-1*xyza^3*-3*xyza3*x0^23*x0/1*x0^21*xyza^2*--3*xyza^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=303 EqnNumber=7 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[26, 7, 16, 17, 4, 3, 1, 8, 3, 4, 1, 2, 3, 1, 4, 3, 1, 1, 4, 3, 4, 5, 1, 2, 3, 4, 5, 1, 1, 3, 4, 21, 6, 23, 32]"+
"// DOEMatrixRow=[24, 8, 19, 2, 1, 3, 1, 8, 3, 4, 1, 1, 1, 2, 3, 1, 2, 9, 8, 1, 2, 4, 3, 2, 3, 2, 1, 2, 3, 10, 2, 9, 7]"+
//Tail EqnIndex=303 EqnNumber=7 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[26, 7, 16, 17, 4, 3, 1, 8, 3, 4, 1, 2, 3, 1, 4, 3, 1, 1, 4, 3, 4, 5, 1, 2, 3, 4, 5, 1, 1, 3, 4, 21, 6, 23, 32]"+
"// DOEMatrixRow=[24, 8, 19, 2, 1, 3, 1, 8, 3, 4, 1, 1, 1, 2, 3, 1, 2, 9, 8, 1, 2, 4, 3, 2, 3, 2, 1, 2, 3, 10, 2, 9, 7]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0*9.0*xyza^6.0-3.0*xyza^4.0-x02*x0*2.25*xyza^132.0+x0^2.0*4.0*xyza^38.0-x0^2.0*xyza^32.0-x0^3.0-x0^23.0*x0*2.0*xyza^37.0-3.0*xyza^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0*9.0*6.0*xyza^5.0-3.0*4.0*xyza^3.0-x02*x0*2.25*132.0*xyza^131.0+x0^2.0*4.0*38.0*xyza^37.0-x0^2.0*32.0*xyza^31.0-x0^3.0*0.0-x0^23.0*x0*2.0*37.0*xyza^36.0-3.0*3.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0*54.0*xyza^5.0-12.0*xyza^3.0-x02*x0*297.0*xyza^131.0+x0^2.0*152.0*xyza^37.0-x0^2.0*32.0*xyza^31.0-x0^3.0*0.0-x0^23.0*x0*74.0*xyza^36.0-9.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0*9.0*xyza^6.0-3.0*xyza^4.0-x02*x0*2.25*xyza^132.0+x0^2.0*4.0*xyza^38.0-x0^2.0*xyza^32.0-x0^3.0-x0^23.0*x0*2.0*xyza^37.0-3.0*xyza^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0*9.0/7.0*xyza^7.0-3.0/5.0*xyza^5.0-x02*x0*2.25/133.0*xyza^133.0+x0^2.0*4.0/39.0*xyza^39.0-x0^2.0/33.0*xyza^33.0-x0^3.0*xyza-x0^23.0*x0*2.0/38.0*xyza^38.0-3.0/4.0*xyza^4.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0*1.2857142857142858*xyza^7.0-0.6*xyza^5.0-x02*x0*0.016917293233082706*xyza^133.0+x0^2.0*0.10256410256410256*xyza^39.0-x0^2.0/33.0*xyza^33.0-x0^3.0*xyza-x0^23.0*x0/19.0*xyza^38.0-1.0/1.3333333333333333*xyza^4.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0*54.0*xyza^5.0-12.0*xyza^3.0-x02*x0*297.0*xyza^131.0+x0^2.0*152.0*xyza^37.0-x0^2.0*32.0*xyza^31.0-x0^3.0*0.0-x0^23.0*x0*74.0*xyza^36.0-9.0*xyza^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0*54.0*5.0*xyza^4.0-12.0*3.0*xyza^2.0-x02*x0*297.0*131.0*xyza^130.0+x0^2.0*152.0*37.0*xyza^36.0-x0^2.0*32.0*31.0*xyza^30.0-x0^3.0*0.0*0.0-x0^23.0*x0*74.0*36.0*xyza^35.0-9.0*2.0*xyza^1.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0*270.0*xyza^4.0-36.0*xyza^2.0-x02*x0*38907.0*xyza^130.0+x0^2.0*5624.0*xyza^36.0-x0^2.0*992.0*xyza^30.0-x0^3.0*0.0-x0^23.0*x0*2664.0*xyza^35.0-18.0*xyza";
 UsageCalculus.EqnSolArrayMap3[2] = "x0*1.2857142857142858*xyza^7.0-0.6*xyza^5.0-x02*x0*0.016917293233082706*xyza^133.0+x0^2.0*0.10256410256410256*xyza^39.0-x0^2.0/33.0*xyza^33.0-x0^3.0*xyza-x0^23.0*x0/19.0*xyza^38.0-1.0/1.3333333333333333*xyza^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0*1.2857142857142858/8.0*xyza^8.0-0.6/6.0*xyza^6.0-x02*x0*0.016917293233082706/134.0*xyza^134.0+x0^2.0*0.10256410256410256/40.0*xyza^40.0-x0^2.0/33.0/34.0*xyza^34.0-x0^3.0/2.0*xyza^2.0-x0^23.0*x0/19.0/39.0*xyza^39.0-1.0/1.3333333333333333/5.0*xyza^5.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0/6.222222222222221*xyza^8.0-0.09999999999999999*xyza^6.0-x02*x0*1.262484569633038E-4*xyza^134.0+x0^2.0*0.002564102564102564*xyza^40.0-x0^2.0*8.9126559714795E-4*xyza^34.0-x0^3.0/2.0*xyza^2.0-x0^23.0*x0/741.0*xyza^39.0-1.0/6.666666666666666*xyza^5.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0*270.0*xyza^4.0-36.0*xyza^2.0-x02*x0*38907.0*xyza^130.0+x0^2.0*5624.0*xyza^36.0-x0^2.0*992.0*xyza^30.0-x0^3.0*0.0-x0^23.0*x0*2664.0*xyza^35.0-18.0*xyza";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0*270.0*4.0*xyza^3.0-36.0*2.0*xyza^1.0-x02*x0*38907.0*130.0*xyza^129.0+x0^2.0*5624.0*36.0*xyza^35.0-x0^2.0*992.0*30.0*xyza^29.0-x0^3.0*0.0*0.0-x0^23.0*x0*2664.0*35.0*xyza^34.0-18.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0*1080.0*xyza^3.0-72.0*xyza-x02*x0*5057910.0*xyza^129.0+x0^2.0*202464.0*xyza^35.0-x0^2.0*29760.0*xyza^29.0-x0^3.0*0.0-x0^23.0*x0*93240.0*xyza^34.0-18.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0/6.222222222222221*xyza^8.0-0.09999999999999999*xyza^6.0-x02*x0*1.262484569633038E-4*xyza^134.0-4.0*xyza^134.0+x0^2.0*0.002564102564102564*xyza^40.0-x0^2.0*8.9126559714795E-4*xyza^34.0-4.0*xyza^34.0-x0^3.0/2.0*xyza^2.0-x0^23.0*x0/741.0*xyza^39.0-1.0/6.666666666666666*xyza^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0/6.222222222222221/9.0*xyza^9.0-0.09999999999999999/7.0*xyza^7.0-x02*x0*1.262484569633038E-4/135.0*xyza^135.0-4.0/135.0*xyza^135.0+x0^2.0*0.002564102564102564/41.0*xyza^41.0-x0^2.0*8.9126559714795E-4/35.0*xyza^35.0-4.0/35.0*xyza^35.0-x0^3.0/2.0/3.0*xyza^3.0-x0^23.0*x0/741.0/40.0*xyza^40.0-1.0/6.666666666666666/6.0*xyza^6.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0/55.99999999999999*xyza^9.0-0.014285714285714285*xyza^7.0-x02*x0/1069320.0*xyza^135.0-1.0/33.75*xyza^135.0-0.02962962962962963*xyza^135.0+x0^2.0*6.253908692933083E-5*xyza^41.0-x0^2.0/39270.0*xyza^35.0-1.0/8.75*xyza^35.0-0.11428571428571428*xyza^35.0-x0^3.0*0.16666666666666666*xyza^3.0-x0^23.0*x0/29640.0*xyza^40.0-1.0/40.0*xyza^6.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0*1080.0*xyza^3.0-72.0*xyza-x02*x0*5057910.0*xyza^129.0+x0^2.0*202464.0*xyza^35.0-x0^2.0*29760.0*xyza^29.0-x0^3.0*0.0-x0^23.0*x0*93240.0*xyza^34.0-18.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0*1080.0*3.0*xyza^2.0-72.0-x02*x0*5057910.0*129.0*xyza^128.0+x0^2.0*202464.0*35.0*xyza^34.0-x0^2.0*29760.0*29.0*xyza^28.0-x0^3.0*0.0*0.0-x0^23.0*x0*93240.0*34.0*xyza^33.0-18.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0*3240.0*xyza^2.0-72.0-x02*x0*6.5247039E8*xyza^128.0+x0^2.0*7086240.0*xyza^34.0-x0^2.0*863040.0*xyza^28.0-x0^3.0*0.0-x0^23.0*x0*3170160.0*xyza^33.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0/55.99999999999999*xyza^9.0-0.014285714285714285*xyza^7.0-x02*x0/1069320.0*xyza^135.0-1.0/33.75*xyza^135.0-0.02962962962962963*xyza^135.0+x0^2.0*6.253908692933083E-5*xyza^41.0-5.0*xyza^41.0-x0^2.0/39270.0*xyza^35.0-1.0/8.75*xyza^35.0-0.11428571428571428*xyza^35.0-x0^3.0*0.16666666666666666*xyza^3.0-x0^23.0*x0/29640.0*xyza^40.0-1.0/40.0*xyza^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0/55.99999999999999/10.0*xyza^10.0-0.014285714285714285/8.0*xyza^8.0-x02*x0/1069320.0/136.0*xyza^136.0-1.0/33.75/136.0*xyza^136.0-0.02962962962962963/136.0*xyza^136.0+x0^2.0*6.253908692933083E-5/42.0*xyza^42.0-5.0/42.0*xyza^42.0-x0^2.0/39270.0/36.0*xyza^36.0-1.0/8.75/36.0*xyza^36.0-0.11428571428571428/36.0*xyza^36.0-x0^3.0*0.16666666666666666/4.0*xyza^4.0-x0^23.0*x0/29640.0/41.0*xyza^41.0-1.0/40.0/7.0*xyza^7.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0/559.9999999999999*xyza^10.0-0.0017857142857142857*xyza^8.0-x02*x0/1.4542752E8*xyza^136.0-1.0/4590.0*xyza^136.0-2.178649237472767E-4*xyza^136.0+x0^2.0/671580.0*xyza^42.0-1.0/8.4*xyza^42.0-0.11904761904761904*xyza^42.0-x0^2.0/1413720.0*xyza^36.0-1.0/315.0*xyza^36.0-0.0031746031746031746*xyza^36.0-x0^3.0*0.041666666666666664*xyza^4.0-x0^23.0*x0/1215240.0*xyza^41.0-1.0/280.0*xyza^7.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff121305() {
 UsageCalculus.TestCase = 121305;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x^2*--3*x^3*1*x-3*x^3*1*x/2*x^2*-3*x^31*x02*x^2*-3*x^33*x^3*-1*x/2*x^22*x0^2*-3*x0^3*1*x0/-3*x0^23*x^31*x/-3*x^2-3*x0^2*-1*x0^3*2*x01*x^3*2*x/3*x^2*--1*x^32*x3*x0^2*--1*x0^3-1*x^3*2*x/3*x^22*x/3*x^2*-1*x^3*-3*x3*x0^21*x^3*-3*x-3*x/1*x^2*-2*x^31*x^2*--3*x^3-3*x^3*1*x";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=304 EqnNumber=8 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[91, 8, 17, 18, 1, 1, 2, 9, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 5, 1, 1, 6, 2, 3, 1, 1, 6, 2, 3, 4, 1, 22, 7, 24, 1]"+
"// DOEMatrixRow=[89, 9, 20, 3, 2, 1, 2, 9, 1, 1, 2, 1, 2, 3, 4, 2, 3, 10, 9, 2, 3, 5, 1, 3, 4, 3, 2, 3, 4, 11, 1, 10, 8]"+
//Tail EqnIndex=304 EqnNumber=8 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[91, 8, 17, 18, 1, 1, 2, 9, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 5, 1, 1, 6, 2, 3, 1, 1, 6, 2, 3, 4, 1, 22, 7, 24, 1]"+
"// DOEMatrixRow=[89, 9, 20, 3, 2, 1, 2, 9, 1, 1, 2, 1, 2, 3, 4, 2, 3, 10, 9, 2, 3, 5, 1, 3, 4, 3, 2, 3, 4, 11, 1, 10, 8]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "3.0*x^6.0-3.0*x^4.0-2.25*x^132.0+4.0*x^38.0-x^32.0-1.0+2.0*x^36.0+18.0*x^39.0-3.0*x^3.0-3.0*x^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "3.0*6.0*x^5.0-3.0*4.0*x^3.0-2.25*132.0*x^131.0+4.0*38.0*x^37.0-32.0*x^31.0-1.0*0.0+2.0*36.0*x^35.0+18.0*39.0*x^38.0-3.0*3.0*x^2.0-3.0*4.0*x^3.0";
 UsageCalculus.EqnSolArrayMap2[1] = "18.0*x^5.0-12.0*x^3.0-297.0*x^131.0+152.0*x^37.0-32.0*x^31.0+72.0*x^35.0+702.0*x^38.0-9.0*x^2.0-12.0*x^3.0";
 UsageCalculus.EqnSolArrayMap3[1] = "3.0*x^6.0-3.0*x^4.0-2.25*x^132.0+4.0*x^38.0-x^32.0-1.0+2.0*x^36.0+18.0*x^39.0-3.0*x^3.0-3.0*x^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "3.0/7.0*x^7.0-3.0/5.0*x^5.0-2.25/133.0*x^133.0+4.0/39.0*x^39.0-1.0/33.0*x^33.0-1.0*x+2.0/37.0*x^37.0+18.0/40.0*x^40.0-3.0/4.0*x^4.0-3.0/5.0*x^5.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/2.3333333333333335*x^7.0-1.0/1.6666666666666667*x^5.0-1.0/59.111111111111114*x^133.0+1.0/9.75*x^39.0-1.0/33.0*x^33.0-x+1.0/18.5*x^37.0+1.0/2.2222222222222223*x^40.0-1.0/1.3333333333333333*x^4.0-1.0/1.6666666666666667*x^5.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "18.0*x^5.0-12.0*x^3.0-297.0*x^131.0+152.0*x^37.0-32.0*x^31.0+72.0*x^35.0+702.0*x^38.0-9.0*x^2.0-12.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "18.0*5.0*x^4.0-12.0*3.0*x^2.0-297.0*131.0*x^130.0+152.0*37.0*x^36.0-32.0*31.0*x^30.0+72.0*35.0*x^34.0+702.0*38.0*x^37.0-9.0*2.0*x^1.0-12.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[2] = "90.0*x^4.0-36.0*x^2.0-38907.0*x^130.0+5624.0*x^36.0-992.0*x^30.0+2520.0*x^34.0+26676.0*x^37.0-18.0*x-36.0*x^2.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/2.3333333333333335*x^7.0-1.0/1.6666666666666667*x^5.0-1.0/59.111111111111114*x^133.0+1.0/9.75*x^39.0-0.030303030303030304*x^33.0-x+1.0/18.5*x^37.0+1.0/2.2222222222222223*x^40.0-1.0/1.3333333333333333*x^4.0-1.0/1.6666666666666667*x^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/2.3333333333333335/8.0*x^8.0-1.0/1.6666666666666667/6.0*x^6.0-1.0/59.111111111111114/134.0*x^134.0+1.0/9.75/40.0*x^40.0-0.030303030303030304/34.0*x^34.0-1.0/2.0*x^2.0+1.0/18.5/38.0*x^38.0+1.0/2.2222222222222223/41.0*x^41.0-1.0/1.3333333333333333/5.0*x^5.0-1.0/1.6666666666666667/6.0*x^6.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/18.666666666666668*x^8.0-1.0/10.0*x^6.0-1.0/7920.88888888889*x^134.0+1.0/390.0*x^40.0-1.0/1122.0*x^34.0-1.0/2.0*x^2.0+1.0/703.0*x^38.0+1.0/91.11111111111111*x^41.0-1.0/6.666666666666666*x^5.0-1.0/10.0*x^6.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "90.0*x^4.0-36.0*x^2.0-38907.0*x^130.0+5624.0*x^36.0-992.0*x^30.0+2520.0*x^34.0+26676.0*x^37.0-18.0*x-36.0*x^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "90.0*4.0*x^3.0-36.0*2.0*x^1.0-38907.0*130.0*x^129.0+5624.0*36.0*x^35.0-992.0*30.0*x^29.0+2520.0*34.0*x^33.0+26676.0*37.0*x^36.0-18.0-36.0*2.0*x^1.0";
 UsageCalculus.EqnSolArrayMap2[3] = "360.0*x^3.0-72.0*x-5057910.0*x^129.0+202464.0*x^35.0-29760.0*x^29.0+85680.0*x^33.0+987012.0*x^36.0-18.0-72.0*x";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/18.666666666666668*x^8.0-1.0/10.0*x^6.0-1.0/7920.88888888889*x^134.0+1.0/390.0*x^40.0-1.0/1122.0*x^34.0-1.0/2.0*x^2.0+1.0/703.0*x^38.0+1.0/91.11111111111111*x^41.0-1.0/6.666666666666666*x^5.0-1.0/10.0*x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/18.666666666666668/9.0*x^9.0-1.0/10.0/7.0*x^7.0-1.0/7920.88888888889/135.0*x^135.0+1.0/390.0/41.0*x^41.0-1.0/1122.0/35.0*x^35.0-1.0/2.0/3.0*x^3.0+1.0/703.0/39.0*x^39.0+1.0/91.11111111111111/42.0*x^42.0-1.0/6.666666666666666/6.0*x^6.0-1.0/10.0/7.0*x^7.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/168.0*x^9.0-1.0/70.0*x^7.0-1.0/1069320.0*x^135.0+1.0/15990.0*x^41.0-1.0/39270.0*x^35.0-1.0/6.0*x^3.0+1.0/27417.0*x^39.0+1.0/3826.666666666667*x^42.0-1.0/40.0*x^6.0-1.0/70.0*x^7.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "360.0*x^3.0-72.0*x-5057910.0*x^129.0+202464.0*x^35.0-29760.0*x^29.0+85680.0*x^33.0+987012.0*x^36.0-18.0-72.0*x";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "360.0*3.0*x^2.0-72.0-5057910.0*129.0*x^128.0+202464.0*35.0*x^34.0-29760.0*29.0*x^28.0+85680.0*33.0*x^32.0+987012.0*36.0*x^35.0-18.0*0.0-72.0";
 UsageCalculus.EqnSolArrayMap2[4] = "1080.0*x^2.0-72.0-6.5247039E8*x^128.0+7086240.0*x^34.0-863040.0*x^28.0+2827440.0*x^32.0+3.5532432E7*x^35.0-72.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/168.0*x^9.0-1.0/70.0*x^7.0-1.0/1069320.0*x^135.0+1.0/15990.0*x^41.0-1.0/39270.0*x^35.0-1.0/6.0*x^3.0+1.0/27417.0*x^39.0+1.0/3826.666666666667*x^42.0-1.0/40.0*x^6.0-1.0/70.0*x^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/168.0/10.0*x^10.0-1.0/70.0/8.0*x^8.0-1.0/1069320.0/136.0*x^136.0+1.0/15990.0/42.0*x^42.0-1.0/39270.0/36.0*x^36.0-1.0/6.0/4.0*x^4.0+1.0/27417.0/40.0*x^40.0+1.0/3826.666666666667/43.0*x^43.0-1.0/40.0/7.0*x^7.0-1.0/70.0/8.0*x^8.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/1680.0*x^10.0-1.0/560.0*x^8.0-1.0/1.4542752E8*x^136.0+1.0/671580.0*x^42.0-1.0/1413720.0*x^36.0-1.0/24.0*x^4.0+1.0/1096680.0*x^40.0+1.0/164546.6666666667*x^43.0-1.0/280.0*x^7.0-1.0/560.0*x^8.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff121306() {
 UsageCalculus.TestCase = 121306;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xy^3*1*xy/2*xy^2*-3*xy^31*x02*xy^2*-3*xy^33*xy^3*-1*xy/2*xy^22*x0^2*-3*x0^3*1*x0/-3*x0^23*xy^31*xy/-3*xy^2-3*x0^2*-1*x0^3*2*x01*xy^3*2*xy/3*xy^2*--1*xy^32*xy3*x0^2*--1*x0^3-1*xy^3*2*xy/3*xy^22*xy/3*xy^2*-1*xy^3*-3*xy3*x0^21*xy^3*-3*xy-3*xy/1*xy^2*-2*xy^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xy^3-3*xy^3*1*xy1*x0/2*x0^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=305 EqnNumber=9 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[56, 9, 18, 19, 2, 3, 1, 10, 2, 3, 4, 2, 3, 1, 2, 3, 1, 2, 1, 2, 3, 7, 3, 1, 2, 3, 7, 3, 4, 5, 2, 23, 8, 25, 2]"+
"// DOEMatrixRow=[54, 10, 1, 4, 3, 2, 3, 10, 2, 3, 4, 2, 3, 1, 1, 3, 1, 11, 10, 3, 1, 1, 2, 1, 5, 4, 3, 1, 1, 12, 2, 11, 9]"+
//Tail EqnIndex=305 EqnNumber=9 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[56, 9, 18, 19, 2, 3, 1, 10, 2, 3, 4, 2, 3, 1, 2, 3, 1, 2, 1, 2, 3, 7, 3, 1, 2, 3, 7, 3, 4, 5, 2, 23, 8, 25, 2]"+
"// DOEMatrixRow=[54, 10, 1, 4, 3, 2, 3, 10, 2, 3, 4, 2, 3, 1, 1, 3, 1, 11, 10, 3, 1, 1, 2, 1, 5, 4, 3, 1, 1, 12, 2, 11, 9]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x02*x0*2.25*xy^132.0+x0^2.0*4.0*xy^38.0-x0^2.0*xy^32.0-x0^3.0+x0^21.0*2.0*xy^36.0+x0^2.0*x0*36.0*xy^37.0-x0*1.5*xy^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x02*x0*2.25*132.0*xy^131.0+x0^2.0*4.0*38.0*xy^37.0-x0^2.0*32.0*xy^31.0-x0^3.0*0.0+x0^21.0*2.0*36.0*xy^35.0+x0^2.0*x0*36.0*37.0*xy^36.0-x0*1.5*3.0*xy^2.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x02*x0*297.0*xy^131.0+x0^2.0*152.0*xy^37.0-x0^2.0*32.0*xy^31.0-x0^3.0*0.0+x0^21.0*72.0*xy^35.0+x0^2.0*x0*1332.0*xy^36.0-x0*4.5*xy^2.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x02*x0*2.25*xy^132.0+x0^2.0*4.0*xy^38.0-x0^2.0*xy^32.0-x0^3.0+x0^21.0*2.0*xy^36.0+x0^2.0*x0*36.0*xy^37.0-x0*1.5*xy^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x02*x0*2.25/133.0*xy^133.0+x0^2.0*4.0/39.0*xy^39.0-x0^2.0/33.0*xy^33.0-x0^3.0*xy+x0^21.0*2.0/37.0*xy^37.0+x0^2.0*x0*36.0/38.0*xy^38.0-x0*1.5/4.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x02*x0*0.016917293233082706*xy^133.0+x0^2.0*0.10256410256410256*xy^39.0-x0^2.0/33.0*xy^33.0-x0^3.0*xy+x0^21.0*0.05405405405405406*xy^37.0+x0^2.0*x0*0.9473684210526315*xy^38.0-x0/2.6666666666666665*xy^4.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x02*x0*297.0*xy^131.0+x0^2.0*152.0*xy^37.0-x0^2.0*32.0*xy^31.0-x0^3.0*0.0+x0^21.0*72.0*xy^35.0+x0^2.0*x0*1332.0*xy^36.0-x0*4.5*xy^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x02*x0*297.0*131.0*xy^130.0+x0^2.0*152.0*37.0*xy^36.0-x0^2.0*32.0*31.0*xy^30.0-x0^3.0*0.0*0.0+x0^21.0*72.0*35.0*xy^34.0+x0^2.0*x0*1332.0*36.0*xy^35.0-x0*4.5*2.0*xy^1.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x02*x0*38907.0*xy^130.0+x0^2.0*5624.0*xy^36.0-x0^2.0*992.0*xy^30.0-x0^3.0*0.0+x0^21.0*2520.0*xy^34.0+x0^2.0*x0*47952.0*xy^35.0-x0*9.0*xy";
 UsageCalculus.EqnSolArrayMap3[2] = "-x02*x0*0.016917293233082706*xy^133.0+x0^2.0*0.10256410256410256*xy^39.0-x0^2.0/33.0*xy^33.0-x0^3.0*xy+x0^21.0*0.05405405405405406*xy^37.0+x0^2.0*x0*0.9473684210526315*xy^38.0-x0/2.6666666666666665*xy^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x02*x0*0.016917293233082706/134.0*xy^134.0+x0^2.0*0.10256410256410256/40.0*xy^40.0-x0^2.0/33.0/34.0*xy^34.0-x0^3.0/2.0*xy^2.0+x0^21.0*0.05405405405405406/38.0*xy^38.0+x0^2.0*x0*0.9473684210526315/39.0*xy^39.0-x0*2.6666666666666665/5.0*xy^5.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x02*x0*1.262484569633038E-4*xy^134.0+x0^2.0*0.002564102564102564*xy^40.0-x0^2.0*8.9126559714795E-4*xy^34.0-x0^3.0/2.0*xy^2.0+x0^21.0*0.001422475106685633*xy^38.0+x0^2.0*x0*0.024291497975708502*xy^39.0-x0/1.875*xy^5.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x02*x0*38907.0*xy^130.0+x0^2.0*5624.0*xy^36.0-x0^2.0*992.0*xy^30.0-x0^3.0*0.0+x0^21.0*2520.0*xy^34.0+x0^2.0*x0*47952.0*xy^35.0-x0*9.0*xy";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x02*x0*38907.0*130.0*xy^129.0+x0^2.0*5624.0*36.0*xy^35.0-x0^2.0*992.0*30.0*xy^29.0-x0^3.0*0.0*0.0+x0^21.0*2520.0*34.0*xy^33.0+x0^2.0*x0*47952.0*35.0*xy^34.0-x0*9.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x02*x0*5057910.0*xy^129.0+x0^2.0*202464.0*xy^35.0-x0^2.0*29760.0*xy^29.0-x0^3.0*0.0+x0^21.0*85680.0*xy^33.0+x0^2.0*x0*1678320.0*xy^34.0-x0*9.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x02*x0*1.262484569633038E-4*xy^134.0-4.0*xy^134.0+x0^2.0*0.002564102564102564*xy^40.0-x0^2.0*8.9126559714795E-4*xy^34.0-4.0*xy^34.0-x0^3.0/2.0*xy^2.0+x0^21.0*0.001422475106685633*xy^38.0+x0^2.0*x0*0.024291497975708502*xy^39.0-x0/1.875*xy^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x02*x0*1.262484569633038E-4/135.0*xy^135.0-4.0/135.0*xy^135.0+x0^2.0*0.002564102564102564/41.0*xy^41.0-x0^2.0*8.9126559714795E-4/35.0*xy^35.0-4.0/35.0*xy^35.0-x0^3.0/2.0/3.0*xy^3.0+x0^21.0*0.001422475106685633/39.0*xy^39.0+x0^2.0*x0*0.024291497975708502/40.0*xy^40.0-x0*1.875/6.0*xy^6.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x02*x0/1069320.0*xy^135.0-1.0/33.75*xy^135.0-0.02962962962962963*xy^135.0+x0^2.0*6.253908692933083E-5*xy^41.0-x0^2.0/39270.0*xy^35.0-1.0/8.75*xy^35.0-0.11428571428571428*xy^35.0-x0^3.0*0.16666666666666666*xy^3.0+x0^21.0*3.6473720684247E-5*xy^39.0+x0^2.0*x0*6.072874493927126E-4*xy^40.0-x0/3.2*xy^6.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x02*x0*5057910.0*xy^129.0+x0^2.0*202464.0*xy^35.0-x0^2.0*29760.0*xy^29.0-x0^3.0*0.0+x0^21.0*85680.0*xy^33.0+x0^2.0*x0*1678320.0*xy^34.0-x0*9.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x02*x0*5057910.0*129.0*xy^128.0+x0^2.0*202464.0*35.0*xy^34.0-x0^2.0*29760.0*29.0*xy^28.0-x0^3.0*0.0*0.0+x0^21.0*85680.0*33.0*xy^32.0+x0^2.0*x0*1678320.0*34.0*xy^33.0-x0*9.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x02*x0*6.5247039E8*xy^128.0+x0^2.0*7086240.0*xy^34.0-x0^2.0*863040.0*xy^28.0-x0^3.0*0.0+x0^21.0*2827440.0*xy^32.0+x0^2.0*x0*5.706288E7*xy^33.0-x0*0.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x02*x0/1069320.0*xy^135.0-1.0/33.75*xy^135.0-0.02962962962962963*xy^135.0+x0^2.0*6.253908692933083E-5*xy^41.0-5.0*xy^41.0-x0^2.0/39270.0*xy^35.0-1.0/8.75*xy^35.0-0.11428571428571428*xy^35.0-x0^3.0*0.16666666666666666*xy^3.0+x0^21.0*3.6473720684247E-5*xy^39.0-5.0*xy^39.0+x0^2.0*x0*6.072874493927126E-4*xy^40.0-4.0*xy^40.0-x0/3.2*xy^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x02*x0/1069320.0/136.0*xy^136.0-1.0/33.75/136.0*xy^136.0-0.02962962962962963/136.0*xy^136.0+x0^2.0*6.253908692933083E-5/42.0*xy^42.0-5.0/42.0*xy^42.0-x0^2.0/39270.0/36.0*xy^36.0-1.0/8.75/36.0*xy^36.0-0.11428571428571428/36.0*xy^36.0-x0^3.0*0.16666666666666666/4.0*xy^4.0+x0^21.0*3.6473720684247E-5/40.0*xy^40.0-5.0/40.0*xy^40.0+x0^2.0*x0*6.072874493927126E-4/41.0*xy^41.0-4.0/41.0*xy^41.0-x0*3.2/7.0*xy^7.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x02*x0/1.4542752E8*xy^136.0-1.0/4590.0*xy^136.0-2.178649237472767E-4*xy^136.0+x0^2.0/671580.0*xy^42.0-1.0/8.4*xy^42.0-0.11904761904761904*xy^42.0-x0^2.0/1413720.0*xy^36.0-1.0/315.0*xy^36.0-0.0031746031746031746*xy^36.0-x0^3.0*0.041666666666666664*xy^4.0+x0^21.0/1096680.0*xy^40.0-1.0/8.0*xy^40.0-0.125*xy^40.0+x0^2.0*x0/67513.33333333333*xy^41.0-1.0/10.25*xy^41.0-0.0975609756097561*xy^41.0-x0/2.1875*xy^7.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff121307() {
 UsageCalculus.TestCase = 121307;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x02*xyz^2*-3*xyz^33*xyz^3*-1*xyz/2*xyz^22*x0^2*-3*x0^3*1*x0/-3*x0^23*xyz^31*xyz/-3*xyz^2-3*x0^2*-1*x0^3*2*x01*xyz^3*2*xyz/3*xyz^2*--1*xyz^32*xyz3*x0^2*--1*x0^3-1*xyz^3*2*xyz/3*xyz^22*xyz/3*xyz^2*-1*xyz^3*-3*xyz3*x0^21*xyz^3*-3*xyz-3*xyz/1*xyz^2*-2*xyz^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyz^33*xyz/-1*xyz^2-1*x0^2*-2*x0^3*3*x01*x0/2*x0^22*xyz^2*-3*xyz^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=306 EqnNumber=10 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[18, 10, 19, 20, 3, 1, 2, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 2, 3, 4, 8, 1, 2, 3, 4, 8, 1, 1, 6, 3, 24, 9, 26, 3]"+
"// DOEMatrixRow=[19, 11, 2, 1, 1, 3, 1, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 12, 1, 1, 2, 3, 1, 2, 6, 1, 1, 2, 3, 13, 1, 12, 10]"+
//Tail EqnIndex=306 EqnNumber=10 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[18, 10, 19, 20, 3, 1, 2, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 2, 3, 4, 8, 1, 2, 3, 4, 8, 1, 1, 6, 3, 24, 9, 26, 3]"+
"// DOEMatrixRow=[19, 11, 2, 1, 1, 3, 1, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 12, 1, 1, 2, 3, 1, 2, 6, 1, 1, 2, 3, 13, 1, 12, 10]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x02*x0/2.0*xyz^95.0+x0^2.0*4.0*xyz^38.0-x0^2.0*xyz^32.0-x0^3.0+x0^21.0*2.0*xyz^36.0-x0^2.0*x0*36.0*xyz^70.0-x0^2.0*x01*x0*9.0*xyz^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x02*x0/2.0*95.0*xyz^94.0+x0^2.0*4.0*38.0*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0+x0^21.0*2.0*36.0*xyz^35.0-x0^2.0*x0*36.0*70.0*xyz^69.0-x0^2.0*x01*x0*5.0*xyz^4.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x02*x0*47.5*xyz^94.0+x0^2.0*152.0*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0+x0^21.0*72.0*xyz^35.0-x0^2.0*x0*2520.0*xyz^69.0-x0^2.0*x01*x0*5.0*xyz^4.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x02*x0/2.0*xyz^95.0+x0^2.0*4.0*xyz^38.0-x0^2.0*xyz^32.0-x0^3.0+x0^21.0*2.0*xyz^36.0-x0^2.0*x0*36.0*xyz^70.0-x0^2.0*x01*x0*9.0*xyz^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x02*x0/2.0/96.0*xyz^96.0+x0^2.0*4.0/39.0*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz+x0^21.0*2.0/37.0*xyz^37.0-x0^2.0*x0*36.0/71.0*xyz^71.0-x0^2.0*x01*x0*9.0/6.0*xyz^6.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x02*x0*0.005208333333333333*xyz^96.0+x0^2.0*0.10256410256410256*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz+x0^21.0*0.05405405405405406*xyz^37.0-x0^2.0*x0*0.5070422535211268*xyz^71.0-x0^2.0*x01*x0*1.5*xyz^6.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x02*x0*47.5*xyz^94.0+x0^2.0*152.0*xyz^37.0-x0^2.0*32.0*xyz^31.0-x0^3.0*0.0+x0^21.0*72.0*xyz^35.0-x0^2.0*x0*2520.0*xyz^69.0-x0^2.0*x01*x0*5.0*xyz^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x02*x0*47.5*94.0*xyz^93.0+x0^2.0*152.0*37.0*xyz^36.0-x0^2.0*32.0*31.0*xyz^30.0-x0^3.0*0.0*0.0+x0^21.0*72.0*35.0*xyz^34.0-x0^2.0*x0*2520.0*69.0*xyz^68.0-x0^2.0*x01*x0*4.0*xyz^3.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x02*x0*4465.0*xyz^93.0+x0^2.0*5624.0*xyz^36.0-x0^2.0*992.0*xyz^30.0-x0^3.0*0.0+x0^21.0*2520.0*xyz^34.0-x0^2.0*x0*173880.0*xyz^68.0-x0^2.0*x01*x0*4.0*xyz^3.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x02*x0*0.005208333333333333*xyz^96.0+x0^2.0*0.10256410256410256*xyz^39.0-x0^2.0/33.0*xyz^33.0-x0^3.0*xyz+x0^21.0*0.05405405405405406*xyz^37.0-x0^2.0*x0*0.5070422535211268*xyz^71.0-x0^2.0*x01*x0*1.5*xyz^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x02*x0*0.005208333333333333/97.0*xyz^97.0+x0^2.0*0.10256410256410256/40.0*xyz^40.0-x0^2.0/33.0/34.0*xyz^34.0-x0^3.0/2.0*xyz^2.0+x0^21.0*0.05405405405405406/38.0*xyz^38.0-x0^2.0*x0*0.5070422535211268/72.0*xyz^72.0-x0^2.0*x01*x0*1.5/7.0*xyz^7.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x02*x0*5.3694158075601374E-5*xyz^97.0+x0^2.0*0.002564102564102564*xyz^40.0-x0^2.0*8.9126559714795E-4*xyz^34.0-x0^3.0/2.0*xyz^2.0+x0^21.0*0.001422475106685633*xyz^38.0-x0^2.0*x0*0.007042253521126761*xyz^72.0-x0^2.0*x01*x0/4.666666666666667*xyz^7.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x02*x0*4465.0*xyz^93.0+x0^2.0*5624.0*xyz^36.0-x0^2.0*992.0*xyz^30.0-x0^3.0*0.0+x0^21.0*2520.0*xyz^34.0-x0^2.0*x0*173880.0*xyz^68.0-x0^2.0*x01*x0*4.0*xyz^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x02*x0*4465.0*93.0*xyz^92.0+x0^2.0*5624.0*36.0*xyz^35.0-x0^2.0*992.0*30.0*xyz^29.0-x0^3.0*0.0*0.0+x0^21.0*2520.0*34.0*xyz^33.0-x0^2.0*x0*173880.0*68.0*xyz^67.0-x0^2.0*x01*x0*3.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x02*x0*415245.0*xyz^92.0+x0^2.0*202464.0*xyz^35.0-x0^2.0*29760.0*xyz^29.0-x0^3.0*0.0+x0^21.0*85680.0*xyz^33.0-x0^2.0*x0*1.182384E7*xyz^67.0-x0^2.0*x01*x0*3.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x02*x0*5.3694158075601374E-5*xyz^97.0-5.0*xyz^97.0+x0^2.0*0.002564102564102564*xyz^40.0-x0^2.0*8.9126559714795E-4*xyz^34.0-4.0*xyz^34.0-x0^3.0/2.0*xyz^2.0+x0^21.0*0.001422475106685633*xyz^38.0-x0^2.0*x0*0.007042253521126761*xyz^72.0-x0^2.0*x01*x0/4.666666666666667*xyz^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x02*x0*5.3694158075601374E-5/98.0*xyz^98.0-5.0/98.0*xyz^98.0+x0^2.0*0.002564102564102564/41.0*xyz^41.0-x0^2.0*8.9126559714795E-4/35.0*xyz^35.0-4.0/35.0*xyz^35.0-x0^3.0/2.0/3.0*xyz^3.0+x0^21.0*0.001422475106685633/39.0*xyz^39.0-x0^2.0*x0*0.007042253521126761/73.0*xyz^73.0-x0^2.0*x01*x0/4.666666666666667/8.0*xyz^8.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x02*x0/1825152.0*xyz^98.0-1.0/19.6*xyz^98.0-0.05102040816326531*xyz^98.0+x0^2.0*6.253908692933083E-5*xyz^41.0-x0^2.0/39270.0*xyz^35.0-1.0/8.75*xyz^35.0-0.11428571428571428*xyz^35.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^21.0*3.6473720684247E-5*xyz^39.0-x0^2.0*x0*9.646922631680494E-5*xyz^73.0-x0^2.0*x01*x0/37.333333333333336*xyz^8.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x02*x0*415245.0*xyz^92.0+x0^2.0*202464.0*xyz^35.0-x0^2.0*29760.0*xyz^29.0-x0^3.0*0.0+x0^21.0*85680.0*xyz^33.0-x0^2.0*x0*1.182384E7*xyz^67.0-x0^2.0*x01*x0*3.0*xyz^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x02*x0*415245.0*92.0*xyz^91.0+x0^2.0*202464.0*35.0*xyz^34.0-x0^2.0*29760.0*29.0*xyz^28.0-x0^3.0*0.0*0.0+x0^21.0*85680.0*33.0*xyz^32.0-x0^2.0*x0*1.182384E7*67.0*xyz^66.0-x0^2.0*x01*x0*2.0*xyz^1.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x02*x0*3.820254E7*xyz^91.0+x0^2.0*7086240.0*xyz^34.0-x0^2.0*863040.0*xyz^28.0-x0^3.0*0.0+x0^21.0*2827440.0*xyz^32.0-x0^2.0*x0*7.9219728E8*xyz^66.0-x0^2.0*x01*x0*2.0*xyz";
 UsageCalculus.EqnSolArrayMap3[4] = "-x02*x0/1825152.0*xyz^98.0-1.0/19.6*xyz^98.0-0.05102040816326531*xyz^98.0+x0^2.0*6.253908692933083E-5*xyz^41.0-5.0*xyz^41.0-x0^2.0/39270.0*xyz^35.0-1.0/8.75*xyz^35.0-0.11428571428571428*xyz^35.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^21.0*3.6473720684247E-5*xyz^39.0-5.0*xyz^39.0-x0^2.0*x0*9.646922631680494E-5*xyz^73.0-5.0*xyz^73.0-x0^2.0*x01*x0/37.333333333333336*xyz^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x02*x0/1825152.0/99.0*xyz^99.0-1.0/19.6/99.0*xyz^99.0-0.05102040816326531/99.0*xyz^99.0+x0^2.0*6.253908692933083E-5/42.0*xyz^42.0-5.0/42.0*xyz^42.0-x0^2.0/39270.0/36.0*xyz^36.0-1.0/8.75/36.0*xyz^36.0-0.11428571428571428/36.0*xyz^36.0-x0^3.0*0.16666666666666666/4.0*xyz^4.0+x0^21.0*3.6473720684247E-5/40.0*xyz^40.0-5.0/40.0*xyz^40.0-x0^2.0*x0*9.646922631680494E-5/74.0*xyz^74.0-5.0/74.0*xyz^74.0-x0^2.0*x01*x0/37.333333333333336/9.0*xyz^9.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x02*x0/1.80690048E8*xyz^99.0-1.0/1940.4*xyz^99.0-5.153576582148011E-4*xyz^99.0+x0^2.0/671580.0*xyz^42.0-1.0/8.4*xyz^42.0-0.11904761904761904*xyz^42.0-x0^2.0/1413720.0*xyz^36.0-1.0/315.0*xyz^36.0-0.0031746031746031746*xyz^36.0-x0^3.0*0.041666666666666664*xyz^4.0+x0^21.0/1096680.0*xyz^40.0-1.0/8.0*xyz^40.0-0.125*xyz^40.0-x0^2.0*x0/767084.0*xyz^74.0-1.0/14.8*xyz^74.0-0.06756756756756757*xyz^74.0-x0^2.0*x01*x0/336.0*xyz^9.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff121308() {
 UsageCalculus.TestCase = 121308;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xyza^2*-3*xyza^33*xyza^3*-1*xyza/2*xyza^22*x0^2*-3*x0^3*1*x0/-3*x0^23*xyza^31*xyza/-3*xyza^2-3*x0^2*-1*x0^3*2*x01*xyza^3*2*xyza/3*xyza^2*--1*xyza^32*xyza3*x0^2*--1*x0^3-1*xyza^3*2*xyza/3*xyza^22*xyza/3*xyza^2*-1*xyza^3*-3*xyza3*x0^21*xyza^3*-3*xyza-3*xyza/1*xyza^2*-2*xyza^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyza^33*xyza/-1*xyza^2-1*x0^2*-2*x0^3*3*x02*xyza^3*3*xyza/1*xyza^2*--3*xyza^33*xyza2*xyza^2*-3*xyza^33*xyza^3*-1*xyza";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=307 EqnNumber=11 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[86, 11, 20, 1, 4, 2, 3, 2, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 1, 1, 9, 2, 3, 1, 1, 9, 2, 3, 7, 4, 25, 10, 27, 4]"+
"// DOEMatrixRow=[84, 12, 3, 2, 3, 1, 2, 3, 1, 1, 2, 1, 2, 3, 4, 2, 3, 13, 2, 3, 1, 4, 2, 3, 1, 2, 3, 1, 4, 14, 2, 13, 11]"+
//Tail EqnIndex=307 EqnNumber=11 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[86, 11, 20, 1, 4, 2, 3, 2, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 1, 1, 9, 2, 3, 1, 1, 9, 2, 3, 7, 4, 25, 10, 27, 4]"+
"// DOEMatrixRow=[84, 12, 3, 2, 3, 1, 2, 3, 1, 1, 2, 1, 2, 3, 4, 2, 3, 13, 2, 3, 1, 4, 2, 3, 1, 2, 3, 1, 4, 14, 2, 13, 11]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^2.0*x0*xyza^95.0+x0^2.0*4.0*xyza^38.0-x0^2.0*xyza^32.0-x0^3.0+x0^21.0*2.0*xyza^36.0-x0^2.0*x0*36.0*xyza^70.0+162.0*xyza^78.0-9.0*xyza^72.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^2.0*x0*95.0*xyza^94.0+x0^2.0*4.0*38.0*xyza^37.0-x0^2.0*32.0*xyza^31.0-x0^3.0*0.0+x0^21.0*2.0*36.0*xyza^35.0-x0^2.0*x0*36.0*70.0*xyza^69.0+162.0*78.0*xyza^77.0-9.0*72.0*xyza^71.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^2.0*x0*95.0*xyza^94.0+x0^2.0*152.0*xyza^37.0-x0^2.0*32.0*xyza^31.0-x0^3.0*0.0+x0^21.0*72.0*xyza^35.0-x0^2.0*x0*2520.0*xyza^69.0+12636.0*xyza^77.0-648.0*xyza^71.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^2.0*x0*xyza^95.0+x0^2.0*4.0*xyza^38.0-x0^2.0*xyza^32.0-x0^3.0+x0^21.0*2.0*xyza^36.0-x0^2.0*x0*36.0*xyza^70.0+162.0*xyza^78.0-9.0*xyza^72.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^2.0*x0/96.0*xyza^96.0+x0^2.0*4.0/39.0*xyza^39.0-x0^2.0/33.0*xyza^33.0-x0^3.0*xyza+x0^21.0*2.0/37.0*xyza^37.0-x0^2.0*x0*36.0/71.0*xyza^71.0+162.0/79.0*xyza^79.0-9.0/73.0*xyza^73.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^2.0*x0/96.0*xyza^96.0+x0^2.0*0.10256410256410256*xyza^39.0-x0^2.0/33.0*xyza^33.0-x0^3.0*xyza+x0^21.0*0.05405405405405406*xyza^37.0-x0^2.0*x0/1.9722222222222223*xyza^71.0+2.050632911392405*xyza^79.0-1.0/8.11111111111111*xyza^73.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^2.0*x0*95.0*xyza^94.0+x0^2.0*152.0*xyza^37.0-x0^2.0*32.0*xyza^31.0-x0^3.0*0.0+x0^21.0*72.0*xyza^35.0-x0^2.0*x0*2520.0*xyza^69.0+12636.0*xyza^77.0-648.0*xyza^71.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^2.0*x0*95.0*94.0*xyza^93.0+x0^2.0*152.0*37.0*xyza^36.0-x0^2.0*32.0*31.0*xyza^30.0-x0^3.0*0.0*0.0+x0^21.0*72.0*35.0*xyza^34.0-x0^2.0*x0*2520.0*69.0*xyza^68.0+12636.0*77.0*xyza^76.0-648.0*71.0*xyza^70.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^2.0*x0*8930.0*xyza^93.0+x0^2.0*5624.0*xyza^36.0-x0^2.0*992.0*xyza^30.0-x0^3.0*0.0+x0^21.0*2520.0*xyza^34.0-x0^2.0*x0*173880.0*xyza^68.0+972972.0*xyza^76.0-46008.0*xyza^70.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^2.0*x0/96.0*xyza^96.0+x0^2.0*0.10256410256410256*xyza^39.0-x0^2.0/33.0*xyza^33.0-x0^3.0*xyza+x0^21.0*0.05405405405405406*xyza^37.0-x0^2.0*x0/1.9722222222222223*xyza^71.0+2.050632911392405*xyza^79.0-1.0/8.11111111111111*xyza^73.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^2.0*x0/96.0/97.0*xyza^97.0+x0^2.0*0.10256410256410256/40.0*xyza^40.0-x0^2.0/33.0/34.0*xyza^34.0-x0^3.0/2.0*xyza^2.0+x0^21.0*0.05405405405405406/38.0*xyza^38.0-x0^2.0*x0/1.9722222222222223/72.0*xyza^72.0+2.050632911392405/80.0*xyza^80.0-1.0/8.11111111111111/74.0*xyza^74.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^2.0*x0*1.0738831615120275E-4*xyza^97.0+x0^2.0*0.002564102564102564*xyza^40.0-x0^2.0*8.9126559714795E-4*xyza^34.0-x0^3.0/2.0*xyza^2.0+x0^21.0*0.001422475106685633*xyza^38.0-x0^2.0*x0/142.0*xyza^72.0+1.0/39.01234567901235*xyza^80.0-1.0/600.2222222222222*xyza^74.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^2.0*x0*8930.0*xyza^93.0+x0^2.0*5624.0*xyza^36.0-x0^2.0*992.0*xyza^30.0-x0^3.0*0.0+x0^21.0*2520.0*xyza^34.0-x0^2.0*x0*173880.0*xyza^68.0+972972.0*xyza^76.0-46008.0*xyza^70.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^2.0*x0*8930.0*93.0*xyza^92.0+x0^2.0*5624.0*36.0*xyza^35.0-x0^2.0*992.0*30.0*xyza^29.0-x0^3.0*0.0*0.0+x0^21.0*2520.0*34.0*xyza^33.0-x0^2.0*x0*173880.0*68.0*xyza^67.0+972972.0*76.0*xyza^75.0-46008.0*70.0*xyza^69.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^2.0*x0*830490.0*xyza^92.0+x0^2.0*202464.0*xyza^35.0-x0^2.0*29760.0*xyza^29.0-x0^3.0*0.0+x0^21.0*85680.0*xyza^33.0-x0^2.0*x0*1.182384E7*xyza^67.0+7.3945872E7*xyza^75.0-3220560.0*xyza^69.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^2.0*x0*1.0738831615120275E-4*xyza^97.0-4.0*xyza^97.0+x0^2.0*0.002564102564102564*xyza^40.0-x0^2.0*8.9126559714795E-4*xyza^34.0-4.0*xyza^34.0-x0^3.0/2.0*xyza^2.0+x0^21.0*0.001422475106685633*xyza^38.0-x0^2.0*x0/142.0*xyza^72.0+1.0/39.01234567901235*xyza^80.0-1.0/600.2222222222222*xyza^74.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^2.0*x0*1.0738831615120275E-4/98.0*xyza^98.0-4.0/98.0*xyza^98.0+x0^2.0*0.002564102564102564/41.0*xyza^41.0-x0^2.0*8.9126559714795E-4/35.0*xyza^35.0-4.0/35.0*xyza^35.0-x0^3.0/2.0/3.0*xyza^3.0+x0^21.0*0.001422475106685633/39.0*xyza^39.0-x0^2.0*x0/142.0/73.0*xyza^73.0+1.0/39.01234567901235/81.0*xyza^81.0-1.0/600.2222222222222/75.0*xyza^75.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^2.0*x0/912576.0*xyza^98.0-1.0/24.5*xyza^98.0-0.04081632653061224*xyza^98.0+x0^2.0*6.253908692933083E-5*xyza^41.0-x0^2.0/39270.0*xyza^35.0-1.0/8.75*xyza^35.0-0.11428571428571428*xyza^35.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^21.0*3.6473720684247E-5*xyza^39.0-x0^2.0*x0/10366.0*xyza^73.0+1.0/3160.0*xyza^81.0-1.0/45016.666666666664*xyza^75.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^2.0*x0*830490.0*xyza^92.0+x0^2.0*202464.0*xyza^35.0-x0^2.0*29760.0*xyza^29.0-x0^3.0*0.0+x0^21.0*85680.0*xyza^33.0-x0^2.0*x0*1.182384E7*xyza^67.0+7.3945872E7*xyza^75.0-3220560.0*xyza^69.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^2.0*x0*830490.0*92.0*xyza^91.0+x0^2.0*202464.0*35.0*xyza^34.0-x0^2.0*29760.0*29.0*xyza^28.0-x0^3.0*0.0*0.0+x0^21.0*85680.0*33.0*xyza^32.0-x0^2.0*x0*1.182384E7*67.0*xyza^66.0+75.0*xyza^74.0-3220560.0*69.0*xyza^68.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^2.0*x0*7.640508E7*xyza^91.0+x0^2.0*7086240.0*xyza^34.0-x0^2.0*863040.0*xyza^28.0-x0^3.0*0.0+x0^21.0*2827440.0*xyza^32.0-x0^2.0*x0*7.9219728E8*xyza^66.0+75.0*xyza^74.0-2.2221864E8*xyza^68.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^2.0*x0/912576.0*xyza^98.0-1.0/24.5*xyza^98.0-0.04081632653061224*xyza^98.0+x0^2.0*6.253908692933083E-5*xyza^41.0-5.0*xyza^41.0-x0^2.0/39270.0*xyza^35.0-1.0/8.75*xyza^35.0-0.11428571428571428*xyza^35.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^21.0*3.6473720684247E-5*xyza^39.0-5.0*xyza^39.0-x0^2.0*x0/10366.0*xyza^73.0+1.0/3160.0*xyza^81.0-1.0/45016.666666666664*xyza^75.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^2.0*x0/912576.0/99.0*xyza^99.0-1.0/24.5/99.0*xyza^99.0-0.04081632653061224/99.0*xyza^99.0+x0^2.0*6.253908692933083E-5/42.0*xyza^42.0-5.0/42.0*xyza^42.0-x0^2.0/39270.0/36.0*xyza^36.0-1.0/8.75/36.0*xyza^36.0-0.11428571428571428/36.0*xyza^36.0-x0^3.0*0.16666666666666666/4.0*xyza^4.0+x0^21.0*3.6473720684247E-5/40.0*xyza^40.0-5.0/40.0*xyza^40.0-x0^2.0*x0/10366.0/74.0*xyza^74.0+1.0/3160.0/82.0*xyza^82.0-1.0/45016.666666666664/76.0*xyza^76.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^2.0*x0/9.0345024E7*xyza^99.0-1.0/2425.5*xyza^99.0-4.1228612657184083E-4*xyza^99.0+x0^2.0/671580.0*xyza^42.0-1.0/8.4*xyza^42.0-0.11904761904761904*xyza^42.0-x0^2.0/1413720.0*xyza^36.0-1.0/315.0*xyza^36.0-0.0031746031746031746*xyza^36.0-x0^3.0*0.041666666666666664*xyza^4.0+x0^21.0/1096680.0*xyza^40.0-1.0/8.0*xyza^40.0-0.125*xyza^40.0-x0^2.0*x0/767084.0*xyza^74.0+1.0/259120.0*xyza^82.0-1.0/3421266.6666666665*xyza^76.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff121309() {
 UsageCalculus.TestCase = 121309;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*x^3*-1*x/2*x^23*x^3*-1*x2*x0^2*-3*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=308 EqnNumber=12 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[51, 12, 1, 2, 1, 3, 1, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 2, 3, 10, 3, 1, 2, 3, 10, 3, 4, 8, 1, 26, 11, 28, 5]"+
"// DOEMatrixRow=[48, 13, 4, 3, 1, 2, 3, 4, 2, 3, 4, 2, 3, 1, 1, 3, 1, 14, 3, 1, 2, 5, 3, 1, 2, 3, 1, 2, 1, 15, 1, 14, 12]"+
//Tail EqnIndex=308 EqnNumber=12 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[51, 12, 1, 2, 1, 3, 1, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 2, 3, 10, 3, 1, 2, 3, 10, 3, 4, 8, 1, 26, 11, 28, 5]"+
"// DOEMatrixRow=[48, 13, 4, 3, 1, 2, 3, 4, 2, 3, 4, 2, 3, 1, 1, 3, 1, 14, 3, 1, 2, 5, 3, 1, 2, 3, 1, 2, 1, 15, 1, 14, 12]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-4.5*x^30.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-4.5*30.0*x^29.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-135.0*x^29.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-4.5*x^30.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-4.5/31.0*x^31.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/6.888888888888889*x^31.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-135.0*x^29.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-135.0*29.0*x^28.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-3915.0*x^28.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/6.888888888888889*x^31.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/6.888888888888889/32.0*x^32.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/220.44444444444446*x^32.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-3915.0*x^28.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-3915.0*28.0*x^27.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-109620.0*x^27.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/220.44444444444446*x^32.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/220.44444444444446/33.0*x^33.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/7274.666666666667*x^33.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-109620.0*x^27.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-109620.0*27.0*x^26.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-2959740.0*x^26.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/7274.666666666667*x^33.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/7274.666666666667/34.0*x^34.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/247338.6666666667*x^34.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff121310() {
 UsageCalculus.TestCase = 121310;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*x0^2*-3*x0^3*1*x0/-3*x0^23*xy^32*x0^2*-3*x0^33*xy^3*1*xy";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=309 EqnNumber=13 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[16, 13, 2, 3, 2, 1, 2, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 3, 4, 11, 1, 2, 3, 4, 11, 1, 1, 9, 2, 27, 12, 29, 6]"+
"// DOEMatrixRow=[14, 15, 5, 4, 2, 3, 1, 5, 3, 4, 1, 1, 1, 2, 3, 1, 2, 15, 4, 2, 3, 1, 1, 2, 3, 4, 2, 3, 2, 16, 2, 15, 13]"+
//Tail EqnIndex=309 EqnNumber=13 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[16, 13, 2, 3, 2, 1, 2, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 3, 4, 11, 1, 2, 3, 4, 11, 1, 1, 9, 2, 27, 12, 29, 6]"+
"// DOEMatrixRow=[14, 15, 5, 4, 2, 3, 1, 5, 3, 4, 1, 1, 1, 2, 3, 1, 2, 15, 4, 2, 3, 1, 1, 2, 3, 4, 2, 3, 2, 16, 2, 15, 13]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^2.0*x0*6.0*xy^36.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^2.0*x0*36.0*xy^35.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^2.0*x0*36.0*xy^35.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^2.0*x0*6.0*xy^36.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^2.0*x0*6.0/37.0*xy^37.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^2.0*x0/6.166666666666667*xy^37.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^2.0*x0*36.0*xy^35.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^2.0*x0*35.0*xy^34.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^2.0*x0*35.0*xy^34.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^2.0*x0/6.166666666666667*xy^37.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^2.0*x0/6.166666666666667/38.0*xy^38.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^2.0*x0/234.33333333333334*xy^38.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^2.0*x0*35.0*xy^34.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^2.0*x0*34.0*xy^33.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^2.0*x0*34.0*xy^33.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^2.0*x0/234.33333333333334*xy^38.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^2.0*x0/234.33333333333334/39.0*xy^39.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^2.0*x0/9139.0*xy^39.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^2.0*x0*34.0*xy^33.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^2.0*x0*33.0*xy^32.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^2.0*x0*33.0*xy^32.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^2.0*x0/9139.0*xy^39.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^2.0*x0/9139.0/40.0*xy^40.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^2.0*x0/365560.0*xy^40.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff121311() {
 UsageCalculus.TestCase = 121311;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xyz^31*xyz/-3*xyz^2-3*x0^2*-1*x0^3*2*x03*xyz^3*1*xyz1*xyz/-3*xyz^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=310 EqnNumber=14 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[81, 14, 3, 4, 3, 2, 3, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 1, 1, 12, 2, 3, 1, 1, 12, 2, 3, 10, 3, 28, 13, 30, 7]"+
"// DOEMatrixRow=[79, 16, 6, 1, 3, 1, 2, 6, 1, 1, 2, 1, 2, 3, 4, 2, 3, 16, 5, 3, 1, 2, 3, 1, 4, 1, 3, 1, 3, 1, 1, 16, 14]"+
//Tail EqnIndex=310 EqnNumber=14 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[81, 14, 3, 4, 3, 2, 3, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 1, 1, 12, 2, 3, 1, 1, 12, 2, 3, 10, 3, 28, 13, 30, 7]"+
"// DOEMatrixRow=[79, 16, 6, 1, 3, 1, 2, 6, 1, 1, 2, 1, 2, 3, 4, 2, 3, 16, 5, 3, 1, 2, 3, 1, 4, 1, 3, 1, 3, 1, 1, 16, 14]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-xyz^34.0-2.0*xyz^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-34.0*xyz^33.0-2.0*6.0*xyz^5.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-34.0*xyz^33.0-12.0*xyz^5.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-xyz^34.0-2.0*xyz^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.0/35.0*xyz^35.0-2.0/7.0*xyz^7.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/35.0*xyz^35.0-1.0/3.5*xyz^7.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-34.0*xyz^33.0-12.0*xyz^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-34.0*33.0*xyz^32.0-12.0*5.0*xyz^4.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-1122.0*xyz^32.0-60.0*xyz^4.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/35.0*xyz^35.0-1.0/3.5*xyz^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/35.0/36.0*xyz^36.0-1.0/3.5/8.0*xyz^8.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/1260.0*xyz^36.0-1.0/28.0*xyz^8.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-1122.0*xyz^32.0-60.0*xyz^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-1122.0*32.0*xyz^31.0-60.0*4.0*xyz^3.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-35904.0*xyz^31.0-240.0*xyz^3.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/1260.0*xyz^36.0-1.0/28.0*xyz^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/1260.0/37.0*xyz^37.0-1.0/28.0/9.0*xyz^9.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/46620.0*xyz^37.0-1.0/252.0*xyz^9.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-35904.0*xyz^31.0-240.0*xyz^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-35904.0*31.0*xyz^30.0-240.0*3.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-1113024.0*xyz^30.0-720.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/46620.0*xyz^37.0-1.0/252.0*xyz^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/46620.0/38.0*xyz^38.0-1.0/252.0/10.0*xyz^10.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/1771560.0*xyz^38.0-1.0/2520.0*xyz^10.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff121312() {
 UsageCalculus.TestCase = 121312;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xyza/-3*xyza^2-3*x0^2*-1*x0^3*2*x01*xyza^3*2*xyza/3*xyza^2*--1*xyza^32*xyza1*xyza/-3*xyza^2-3*x0^2*-1*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=311 EqnNumber=15 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[45, 15, 4, 5, 4, 3, 1, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 2, 13, 3, 1, 2, 3, 13, 3, 4, 11, 4, 29, 14, 31, 8]"+
"// DOEMatrixRow=[43, 17, 7, 2, 1, 2, 3, 7, 2, 3, 4, 2, 3, 1, 1, 3, 1, 17, 6, 1, 2, 3, 1, 2, 5, 2, 1, 2, 4, 2, 1, 17, 15]"+
//Tail EqnIndex=311 EqnNumber=15 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[45, 15, 4, 5, 4, 3, 1, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 2, 13, 3, 1, 2, 3, 13, 3, 4, 11, 4, 29, 14, 31, 8]"+
"// DOEMatrixRow=[43, 17, 7, 2, 1, 2, 3, 7, 2, 3, 4, 2, 3, 1, 1, 3, 1, 17, 6, 1, 2, 3, 1, 2, 5, 2, 1, 2, 4, 2, 1, 17, 15]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-1.0/3.0*xyza^3.0+1.3333333333333333*xyza^41.0+1.0/3.0*xyza^35.0+x0^2.0*3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-1.0/3.0*3.0*xyza^2.0+1.3333333333333333*41.0*xyza^40.0+1.0/3.0*35.0*xyza^34.0+x0^2.0*3.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-xyza^2.0+54.666666666666664*xyza^40.0+11.666666666666666*xyza^34.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-1.0/3.0*xyza^3.0+1.3333333333333333*xyza^41.0+1.0/3.0*xyza^35.0+x0^2.0*3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-1.0/3.0/4.0*xyza^4.0+1.3333333333333333/42.0*xyza^42.0+1.0/3.0/36.0*xyza^36.0+x0^2.0*3.0*xyza";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/12.0*xyza^4.0+1.0/31.5*xyza^42.0+0.009259259259259259*xyza^36.0+x0^2.0*3.0*xyza";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-xyza^2.0+54.666666666666664*xyza^40.0+11.666666666666666*xyza^34.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-2.0*xyza^1.0+54.666666666666664*40.0*xyza^39.0+11.666666666666666*34.0*xyza^33.0+x0^2.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-2.0*xyza+2186.6666666666665*xyza^39.0+396.66666666666663*xyza^33.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/12.0*xyza^4.0+1.0/31.5*xyza^42.0+0.009259259259259259*xyza^36.0+x0^2.0*3.0*xyza";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/12.0/5.0*xyza^5.0+1.0/31.5/43.0*xyza^43.0+0.009259259259259259/37.0*xyza^37.0+x0^2.0*3.0/2.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/60.0*xyza^5.0+1.0/1354.5*xyza^43.0+2.5025025025025025E-4*xyza^37.0+x0^2.0*1.5*xyza^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-2.0*xyza+2186.6666666666665*xyza^39.0+396.66666666666663*xyza^33.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-2.0+2186.6666666666665*39.0*xyza^38.0+396.66666666666663*33.0*xyza^32.0+x0^2.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-2.0+85280.0*xyza^38.0+13089.999999999998*xyza^32.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/60.0*xyza^5.0+1.0/1354.5*xyza^43.0+2.5025025025025025E-4*xyza^37.0-4.0*xyza^37.0+x0^2.0*1.5*xyza^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/60.0/6.0*xyza^6.0+1.0/1354.5/44.0*xyza^44.0+2.5025025025025025E-4/38.0*xyza^38.0-4.0/38.0*xyza^38.0+x0^2.0*1.5/3.0*xyza^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/360.0*xyza^6.0+1.0/59598.0*xyza^44.0+1.0/151848.0*xyza^38.0-1.0/9.5*xyza^38.0-0.10526315789473684*xyza^38.0+x0^2.0/2.0*xyza^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-2.0+85280.0*xyza^38.0+13089.999999999998*xyza^32.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-0.0+85280.0*38.0*xyza^37.0+13089.999999999998*32.0*xyza^31.0+x0^2.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "3240640.0*xyza^37.0+418879.99999999994*xyza^31.0+x0^2.0*0.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/360.0*xyza^6.0+1.0/59598.0*xyza^44.0+1.0/151848.0*xyza^38.0-1.0/9.5*xyza^38.0-0.10526315789473684*xyza^38.0+x0^2.0/2.0*xyza^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/360.0/7.0*xyza^7.0+1.0/59598.0/45.0*xyza^45.0+1.0/151848.0/39.0*xyza^39.0-1.0/9.5/39.0*xyza^39.0-0.10526315789473684/39.0*xyza^39.0+x0^2.0*2.0/4.0*xyza^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/2520.0*xyza^7.0+1.0/2681910.0*xyza^45.0+1.0/5922072.0*xyza^39.0-1.0/370.5*xyza^39.0-0.002699055330634278*xyza^39.0+x0^2.0/2.0*xyza^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff121313() {
 UsageCalculus.TestCase = 121313;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*x0^2*-1*x0^3*2*x01*x^3*2*x/3*x^2*--1*x^32*x3*x0^2*--1*x0^3-1*x^3*2*x/3*x^2-3*x0^2*-1*x0^31*x^3*2*x";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=312 EqnNumber=16 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[11, 16, 5, 6, 1, 1, 2, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 3, 14, 1, 2, 3, 4, 14, 1, 1, 12, 1, 30, 15, 32, 9]"+
"// DOEMatrixRow=[9, 18, 8, 3, 2, 3, 1, 8, 3, 4, 1, 1, 1, 2, 3, 1, 2, 18, 7, 2, 3, 4, 2, 3, 6, 3, 2, 3, 1, 3, 2, 18, 16]"+
//Tail EqnIndex=312 EqnNumber=16 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[11, 16, 5, 6, 1, 1, 2, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 3, 14, 1, 2, 3, 4, 14, 1, 1, 12, 1, 30, 15, 32, 9]"+
"// DOEMatrixRow=[9, 18, 8, 3, 2, 3, 1, 8, 3, 4, 1, 1, 1, 2, 3, 1, 2, 18, 7, 2, 3, 4, 2, 3, 6, 3, 2, 3, 1, 3, 2, 18, 16]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "4.0*x^38.0-x^32.0-1.0-1.0/1.5*x^6.0+6.0*x^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "4.0*38.0*x^37.0-32.0*x^31.0-1.0*0.0-1.0/1.5*6.0*x^5.0+6.0*4.0*x^3.0";
 UsageCalculus.EqnSolArrayMap2[1] = "152.0*x^37.0-32.0*x^31.0-4.0*x^5.0+24.0*x^3.0";
 UsageCalculus.EqnSolArrayMap3[1] = "4.0*x^38.0-x^32.0-1.0-1.0/1.5*x^6.0+6.0*x^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "4.0/39.0*x^39.0-1.0/33.0*x^33.0-1.0*x-1.0/1.5/7.0*x^7.0+6.0/5.0*x^5.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/9.75*x^39.0-1.0/33.0*x^33.0-x-1.0/10.5*x^7.0+1.2*x^5.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "152.0*x^37.0-32.0*x^31.0-4.0*x^5.0+24.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "152.0*37.0*x^36.0-32.0*31.0*x^30.0-4.0*5.0*x^4.0+24.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[2] = "5624.0*x^36.0-992.0*x^30.0-20.0*x^4.0+72.0*x^2.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/9.75*x^39.0-0.030303030303030304*x^33.0-x-1.0/10.5*x^7.0+1.2*x^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/9.75/40.0*x^40.0-0.030303030303030304/34.0*x^34.0-1.0/2.0*x^2.0-1.0/10.5/8.0*x^8.0+1.2/6.0*x^6.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/390.0*x^40.0-1.0/1122.0*x^34.0-1.0/2.0*x^2.0-1.0/84.0*x^8.0+1.0/5.0*x^6.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "5624.0*x^36.0-992.0*x^30.0-20.0*x^4.0+72.0*x^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "5624.0*36.0*x^35.0-992.0*30.0*x^29.0-20.0*4.0*x^3.0+72.0*2.0*x^1.0";
 UsageCalculus.EqnSolArrayMap2[3] = "202464.0*x^35.0-29760.0*x^29.0-80.0*x^3.0+144.0*x";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/390.0*x^40.0-1.0/1122.0*x^34.0-1.0/2.0*x^2.0-1.0/84.0*x^8.0+1.0/5.0*x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/390.0/41.0*x^41.0-1.0/1122.0/35.0*x^35.0-1.0/2.0/3.0*x^3.0-1.0/84.0/9.0*x^9.0+1.0/5.0/7.0*x^7.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/15990.0*x^41.0-1.0/39270.0*x^35.0-1.0/6.0*x^3.0-1.0/756.0*x^9.0+1.0/35.0*x^7.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "202464.0*x^35.0-29760.0*x^29.0-80.0*x^3.0+144.0*x";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "202464.0*35.0*x^34.0-29760.0*29.0*x^28.0-80.0*3.0*x^2.0+144.0";
 UsageCalculus.EqnSolArrayMap2[4] = "7086240.0*x^34.0-863040.0*x^28.0-240.0*x^2.0+144.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/15990.0*x^41.0-1.0/39270.0*x^35.0-1.0/6.0*x^3.0-1.0/756.0*x^9.0+1.0/35.0*x^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/15990.0/42.0*x^42.0-1.0/39270.0/36.0*x^36.0-1.0/6.0/4.0*x^4.0-1.0/756.0/10.0*x^10.0+1.0/35.0/8.0*x^8.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/671580.0*x^42.0-1.0/1413720.0*x^36.0-1.0/24.0*x^4.0-1.0/7560.0*x^10.0+1.0/280.0*x^8.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff121314() {
 UsageCalculus.TestCase = 121314;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xy^3*2*xy/3*xy^2*--1*xy^32*xy3*x0^2*--1*x0^3-1*xy^3*2*xy/3*xy^22*xy/3*xy^2*-1*xy^3*-3*xy3*x0^21*xy^3*2*xy2*xy/3*xy^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=313 EqnNumber=17 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[76, 17, 6, 7, 2, 3, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 4, 15, 2, 3, 1, 1, 15, 2, 3, 13, 2, 31, 16, 1, 10]"+
"// DOEMatrixRow=[74, 19, 9, 4, 3, 1, 2, 9, 1, 1, 2, 1, 2, 3, 4, 2, 3, 19, 8, 3, 1, 5, 3, 1, 1, 4, 3, 1, 2, 4, 1, 19, 17]"+
//Tail EqnIndex=313 EqnNumber=17 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[76, 17, 6, 7, 2, 3, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 4, 15, 2, 3, 1, 1, 15, 2, 3, 13, 2, 31, 16, 1, 10]"+
"// DOEMatrixRow=[74, 19, 9, 4, 3, 1, 2, 9, 1, 1, 2, 1, 2, 3, 4, 2, 3, 19, 8, 3, 1, 5, 3, 1, 1, 4, 3, 1, 2, 4, 1, 19, 17]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0/1.5*xy^38.0-x0^2.0*xy^32.0-x0^3.0-1.0/2.25*xy^38.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0/1.5*38.0*xy^37.0-x0^2.0*32.0*xy^31.0-x0^3.0*0.0-1.0/2.25*38.0*xy^37.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*25.333333333333332*xy^37.0-x0^2.0*32.0*xy^31.0-x0^3.0*0.0-16.88888888888889*xy^37.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0/1.5*xy^38.0-x0^2.0*xy^32.0-x0^3.0-1.0/2.25*xy^38.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0/1.5/39.0*xy^39.0-x0^2.0/33.0*xy^33.0-x0^3.0*xy-1.0/2.25/39.0*xy^39.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0*0.017094017094017096*xy^39.0-x0^2.0/33.0*xy^33.0-x0^3.0*xy-1.0/87.75*xy^39.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*25.333333333333332*xy^37.0-x0^2.0*32.0*xy^31.0-x0^3.0*0.0-16.88888888888889*xy^37.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*25.333333333333332*37.0*xy^36.0-x0^2.0*32.0*31.0*xy^30.0-x0^3.0*0.0*0.0-16.88888888888889*37.0*xy^36.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*937.3333333333333*xy^36.0-x0^2.0*992.0*xy^30.0-x0^3.0*0.0-624.8888888888889*xy^36.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0*0.017094017094017096*xy^39.0-x0^2.0/33.0*xy^33.0-x0^3.0*xy-1.0/87.75*xy^39.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0*0.017094017094017096/40.0*xy^40.0-x0^2.0/33.0/34.0*xy^34.0-x0^3.0/2.0*xy^2.0-1.0/87.75/40.0*xy^40.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0*4.273504273504274E-4*xy^40.0-x0^2.0*8.9126559714795E-4*xy^34.0-x0^3.0/2.0*xy^2.0-1.0/3510.0*xy^40.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*937.3333333333333*xy^36.0-x0^2.0*992.0*xy^30.0-x0^3.0*0.0-624.8888888888889*xy^36.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*937.3333333333333*36.0*xy^35.0-x0^2.0*992.0*30.0*xy^29.0-x0^3.0*0.0*0.0-624.8888888888889*36.0*xy^35.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*33744.0*xy^35.0-x0^2.0*29760.0*xy^29.0-x0^3.0*0.0-22496.0*xy^35.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0*4.273504273504274E-4*xy^40.0-4.0*xy^40.0-x0^2.0*8.9126559714795E-4*xy^34.0-4.0*xy^34.0-x0^3.0/2.0*xy^2.0-1.0/3510.0*xy^40.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0*4.273504273504274E-4/41.0*xy^41.0-4.0/41.0*xy^41.0-x0^2.0*8.9126559714795E-4/35.0*xy^35.0-4.0/35.0*xy^35.0-x0^3.0/2.0/3.0*xy^3.0-1.0/3510.0/41.0*xy^41.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0/95939.99999999999*xy^41.0-1.0/10.25*xy^41.0-0.0975609756097561*xy^41.0-x0^2.0/39270.0*xy^35.0-1.0/8.75*xy^35.0-0.11428571428571428*xy^35.0-x0^3.0/6.0*xy^3.0-1.0/143910.0*xy^41.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*33744.0*xy^35.0-x0^2.0*29760.0*xy^29.0-x0^3.0*0.0-22496.0*xy^35.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*33744.0*35.0*xy^34.0-x0^2.0*29760.0*29.0*xy^28.0-x0^3.0*0.0*0.0-22496.0*35.0*xy^34.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*1181040.0*xy^34.0-x0^2.0*863040.0*xy^28.0-x0^3.0*0.0-787360.0*xy^34.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0/95939.99999999999*xy^41.0-1.0/10.25*xy^41.0-0.0975609756097561*xy^41.0-x0^2.0/39270.0*xy^35.0-1.0/8.75*xy^35.0-0.11428571428571428*xy^35.0-x0^3.0/6.0*xy^3.0-1.0/143910.0*xy^41.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0/95939.99999999999/42.0*xy^42.0-1.0/10.25/42.0*xy^42.0-0.0975609756097561/42.0*xy^42.0-x0^2.0/39270.0/36.0*xy^36.0-1.0/8.75/36.0*xy^36.0-0.11428571428571428/36.0*xy^36.0-x0^3.0/6.0/4.0*xy^4.0-1.0/143910.0/42.0*xy^42.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0/4029479.9999999995*xy^42.0-1.0/430.5*xy^42.0-0.0023228803716608595*xy^42.0-x0^2.0/1413720.0*xy^36.0-1.0/315.0*xy^36.0-0.0031746031746031746*xy^36.0-x0^3.0/24.0*xy^4.0-1.0/6044220.0*xy^42.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff121315() {
 UsageCalculus.TestCase = 121315;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xyz3*x0^2*--1*x0^3-1*xyz^3*2*xyz/3*xyz^22*xyz/3*xyz^2*-1*xyz^3*-3*xyz3*x0^21*xyz^3*-3*xyz-3*xyz/1*xyz^2*-2*xyz^32*xyz/3*xyz^23*x0^2*--1*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=314 EqnNumber=18 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[40, 18, 7, 8, 3, 1, 2, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 5, 3, 1, 16, 3, 1, 2, 3, 16, 3, 4, 14, 3, 32, 1, 2, 11]"+
"// DOEMatrixRow=[38, 20, 10, 1, 1, 2, 3, 10, 2, 3, 4, 2, 3, 1, 1, 3, 1, 20, 9, 1, 2, 1, 1, 2, 3, 1, 1, 2, 3, 5, 2, 20, 18]"+
//Tail EqnIndex=314 EqnNumber=18 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[40, 18, 7, 8, 3, 1, 2, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 5, 3, 1, 16, 3, 1, 2, 3, 16, 3, 4, 14, 3, 32, 1, 2, 11]"+
"// DOEMatrixRow=[38, 20, 10, 1, 1, 2, 3, 10, 2, 3, 4, 2, 3, 1, 1, 3, 1, 20, 9, 1, 2, 1, 1, 2, 3, 1, 1, 2, 3, 5, 2, 20, 18]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0*2.0-x0^3.0+x0^21.0*2.0*xyz^36.0+x0^2.0*2.0*xyz^59.0-x0^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0*2.0*0.0-x0^3.0*0.0+x0^21.0*2.0*36.0*xyz^35.0+x0^2.0*2.0*59.0*xyz^58.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*72.0*xyz^35.0+x0^2.0*118.0*xyz^58.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0*2.0-x0^3.0+x0^21.0*2.0*xyz^36.0+x0^2.0*2.0*xyz^59.0-x0^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0*xyz-x0^3.0*xyz+x0^21.0*2.0/37.0*xyz^37.0+x0^2.0*2.0/60.0*xyz^60.0-x0^3.0*xyz";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0*xyz-x0^3.0*xyz+x0^21.0*0.05405405405405406*xyz^37.0+x0^2.0*0.03333333333333333*xyz^60.0-x0^3.0*xyz";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*72.0*xyz^35.0+x0^2.0*118.0*xyz^58.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^21.0*72.0*35.0*xyz^34.0+x0^2.0*118.0*58.0*xyz^57.0-x0^3.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*2520.0*xyz^34.0+x0^2.0*6844.0*xyz^57.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0*xyz-x0^3.0*xyz+x0^21.0*0.05405405405405406*xyz^37.0+x0^2.0*0.03333333333333333*xyz^60.0-x0^3.0*xyz";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0/2.0*xyz^2.0-x0^3.0/2.0*xyz^2.0+x0^21.0*0.05405405405405406/38.0*xyz^38.0+x0^2.0*0.03333333333333333/61.0*xyz^61.0-x0^3.0/2.0*xyz^2.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0/2.0*xyz^2.0-x0^3.0/2.0*xyz^2.0+x0^21.0*0.001422475106685633*xyz^38.0+x0^2.0*5.46448087431694E-4*xyz^61.0-x0^3.0/2.0*xyz^2.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*2520.0*xyz^34.0+x0^2.0*6844.0*xyz^57.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^21.0*2520.0*34.0*xyz^33.0+x0^2.0*6844.0*57.0*xyz^56.0-x0^3.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*85680.0*xyz^33.0+x0^2.0*390108.0*xyz^56.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0/2.0*xyz^2.0-x0^3.0/2.0*xyz^2.0+x0^21.0*0.001422475106685633*xyz^38.0+x0^2.0*5.46448087431694E-4*xyz^61.0-4.0*xyz^61.0-x0^3.0/2.0*xyz^2.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0/2.0/3.0*xyz^3.0-x0^3.0/2.0/3.0*xyz^3.0+x0^21.0*0.001422475106685633/39.0*xyz^39.0+x0^2.0*5.46448087431694E-4/62.0*xyz^62.0-4.0/62.0*xyz^62.0-x0^3.0*2.0/3.0*xyz^3.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0*0.16666666666666666*xyz^3.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^21.0*3.6473720684247E-5*xyz^39.0+x0^2.0/113460.0*xyz^62.0-1.0/15.5*xyz^62.0-0.06451612903225806*xyz^62.0-x0^3.0/1.5*xyz^3.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*85680.0*xyz^33.0+x0^2.0*390108.0*xyz^56.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^21.0*85680.0*33.0*xyz^32.0+x0^2.0*390108.0*56.0*xyz^55.0-x0^3.0*0.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*2827440.0*xyz^32.0+x0^2.0*2.1846048E7*xyz^55.0-x0^3.0*0.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0*0.16666666666666666*xyz^3.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^21.0*3.6473720684247E-5*xyz^39.0-5.0*xyz^39.0+x0^2.0/113460.0*xyz^62.0-1.0/15.5*xyz^62.0-0.06451612903225806*xyz^62.0-x0^3.0/1.5*xyz^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0*0.16666666666666666/4.0*xyz^4.0-x0^3.0*0.16666666666666666/4.0*xyz^4.0+x0^21.0*3.6473720684247E-5/40.0*xyz^40.0-5.0/40.0*xyz^40.0+x0^2.0/113460.0/63.0*xyz^63.0-1.0/15.5/63.0*xyz^63.0-0.06451612903225806/63.0*xyz^63.0-x0^3.0*1.5/4.0*xyz^4.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0*0.041666666666666664*xyz^4.0-x0^3.0*0.041666666666666664*xyz^4.0+x0^21.0/1096680.0*xyz^40.0-1.0/8.0*xyz^40.0-0.125*xyz^40.0+x0^2.0/7147980.0*xyz^63.0-1.0/976.5*xyz^63.0-0.0010240655401945725*xyz^63.0-x0^3.0/2.6666666666666665*xyz^4.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff121316() {
 UsageCalculus.TestCase = 121316;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*x0^2*--1*x0^3-1*xyza^3*2*xyza/3*xyza^22*xyza/3*xyza^2*-1*xyza^3*-3*xyza3*x0^21*xyza^3*-3*xyza-3*xyza/1*xyza^2*-2*xyza^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyza^33*x0^2*--1*x0^3-1*xyza^3*2*xyza";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=315 EqnNumber=19 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[6, 19, 8, 9, 4, 2, 3, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 1, 1, 2, 1, 1, 2, 3, 4, 1, 1, 1, 15, 4, 1, 2, 3, 12]"+
"// DOEMatrixRow=[4, 21, 11, 2, 3, 1, 1, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 21, 10, 2, 3, 2, 3, 1, 4, 2, 3, 1, 4, 6, 1, 1, 19]"+
//Tail EqnIndex=315 EqnNumber=19 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[6, 19, 8, 9, 4, 2, 3, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 1, 1, 2, 1, 1, 2, 3, 4, 1, 1, 1, 15, 4, 1, 2, 3, 12]"+
"// DOEMatrixRow=[4, 21, 11, 2, 3, 1, 1, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 21, 10, 2, 3, 2, 3, 1, 4, 2, 3, 1, 4, 6, 1, 1, 19]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "x0^2.0*3.0-x0^3.0+x0^21.0*2.0*xyza^36.0+x0^2.0*x0*36.0*xyza^67.0-x0^3.0-2.0*xyza^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "x0^2.0*3.0*0.0-x0^3.0*0.0+x0^21.0*2.0*36.0*xyza^35.0+x0^2.0*x0*36.0*67.0*xyza^66.0-x0^3.0*0.0-2.0*4.0*xyza^3.0";
 UsageCalculus.EqnSolArrayMap2[1] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*72.0*xyza^35.0+x0^2.0*x0*2412.0*xyza^66.0-x0^3.0*0.0-8.0*xyza^3.0";
 UsageCalculus.EqnSolArrayMap3[1] = "x0^2.0*3.0-x0^3.0+x0^21.0*2.0*xyza^36.0+x0^2.0*x0*36.0*xyza^67.0-x0^3.0-2.0*xyza^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "x0^2.0*3.0*xyza-x0^3.0*xyza+x0^21.0*2.0/37.0*xyza^37.0+x0^2.0*x0*36.0/68.0*xyza^68.0-x0^3.0*xyza-2.0/5.0*xyza^5.0";
 UsageCalculus.EqnSolArrayMap4[1] = "x0^2.0*3.0*xyza-x0^3.0*xyza+x0^21.0*0.05405405405405406*xyza^37.0+x0^2.0*x0*0.5294117647058824*xyza^68.0-x0^3.0*xyza-1.0/2.5*xyza^5.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*72.0*xyza^35.0+x0^2.0*x0*2412.0*xyza^66.0-x0^3.0*0.0-8.0*xyza^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^21.0*72.0*35.0*xyza^34.0+x0^2.0*x0*2412.0*66.0*xyza^65.0-x0^3.0*0.0*0.0-8.0*3.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap2[2] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*2520.0*xyza^34.0+x0^2.0*x0*159192.0*xyza^65.0-x0^3.0*0.0-24.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap3[2] = "x0^2.0*3.0*xyza-x0^3.0*xyza+x0^21.0*0.05405405405405406*xyza^37.0+x0^2.0*x0*0.5294117647058824*xyza^68.0-x0^3.0*xyza-1.0/2.5*xyza^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "x0^2.0*3.0/2.0*xyza^2.0-x0^3.0/2.0*xyza^2.0+x0^21.0*0.05405405405405406/38.0*xyza^38.0+x0^2.0*x0*0.5294117647058824/69.0*xyza^69.0-x0^3.0/2.0*xyza^2.0-1.0/2.5/6.0*xyza^6.0";
 UsageCalculus.EqnSolArrayMap4[2] = "x0^2.0*1.5*xyza^2.0-x0^3.0/2.0*xyza^2.0+x0^21.0*0.001422475106685633*xyza^38.0+x0^2.0*x0*0.0076726342710997444*xyza^69.0-x0^3.0/2.0*xyza^2.0-1.0/15.0*xyza^6.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*2520.0*xyza^34.0+x0^2.0*x0*159192.0*xyza^65.0-x0^3.0*0.0-24.0*xyza^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^21.0*2520.0*34.0*xyza^33.0+x0^2.0*x0*159192.0*65.0*xyza^64.0-x0^3.0*0.0*0.0-24.0*2.0*xyza^1.0";
 UsageCalculus.EqnSolArrayMap2[3] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*85680.0*xyza^33.0+x0^2.0*x0*1.034748E7*xyza^64.0-x0^3.0*0.0-48.0*xyza";
 UsageCalculus.EqnSolArrayMap3[3] = "x0^2.0*1.5*xyza^2.0-x0^3.0/2.0*xyza^2.0+x0^21.0*0.001422475106685633*xyza^38.0+x0^2.0*x0*0.0076726342710997444*xyza^69.0-x0^3.0/2.0*xyza^2.0-1.0/15.0*xyza^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "x0^2.0*1.5/3.0*xyza^3.0-x0^3.0/2.0/3.0*xyza^3.0+x0^21.0*0.001422475106685633/39.0*xyza^39.0+x0^2.0*x0*0.0076726342710997444/70.0*xyza^70.0-x0^3.0/2.0/3.0*xyza^3.0-1.0/15.0/7.0*xyza^7.0";
 UsageCalculus.EqnSolArrayMap4[3] = "x0^2.0*0.5*xyza^3.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^21.0*3.6473720684247E-5*xyza^39.0+x0^2.0*x0*1.0960906101571063E-4*xyza^70.0-x0^3.0/6.0*xyza^3.0-1.0/105.0*xyza^7.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*85680.0*xyza^33.0+x0^2.0*x0*1.034748E7*xyza^64.0-x0^3.0*0.0-48.0*xyza";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "x0^2.0*0.0-x0^3.0*0.0*0.0+x0^21.0*85680.0*33.0*xyza^32.0+x0^2.0*x0*1.034748E7*64.0*xyza^63.0-x0^3.0*0.0*0.0-48.0";
 UsageCalculus.EqnSolArrayMap2[4] = "x0^2.0*0.0-x0^3.0*0.0+x0^21.0*2827440.0*xyza^32.0+x0^2.0*x0*6.6223872E8*xyza^63.0-x0^3.0*0.0-48.0";
 UsageCalculus.EqnSolArrayMap3[4] = "x0^2.0*0.5*xyza^3.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^21.0*3.6473720684247E-5*xyza^39.0-5.0*xyza^39.0+x0^2.0*x0*1.0960906101571063E-4*xyza^70.0-4.0*xyza^70.0-x0^3.0/6.0*xyza^3.0-1.0/105.0*xyza^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "x0^2.0*0.5/4.0*xyza^4.0-x0^3.0*0.16666666666666666/4.0*xyza^4.0+x0^21.0*3.6473720684247E-5/40.0*xyza^40.0-5.0/40.0*xyza^40.0+x0^2.0*x0*1.0960906101571063E-4/71.0*xyza^71.0-4.0/71.0*xyza^71.0-x0^3.0/6.0/4.0*xyza^4.0-1.0/105.0/8.0*xyza^8.0";
 UsageCalculus.EqnSolArrayMap4[4] = "x0^2.0*0.125*xyza^4.0-x0^3.0*0.041666666666666664*xyza^4.0+x0^21.0/1096680.0*xyza^40.0-1.0/8.0*xyza^40.0-0.125*xyza^40.0+x0^2.0*x0/647756.6666666666*xyza^71.0-1.0/17.75*xyza^71.0-0.056338028169014086*xyza^71.0-x0^3.0/24.0*xyza^4.0-1.0/840.0*xyza^8.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff121317() {
 UsageCalculus.TestCase = 121317;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-1*x^3*2*x/3*x^22*x/3*x^2*-1*x^3*-3*x3*x0^21*x^3*-3*x-3*x/1*x^2*-2*x^31*x0^2*-2*x0^3*3*x0/-1*x0^22*x^33*x/-1*x^2-1*x0^2*-2*x0^3*3*x0-1*x^3*2*x2*x/3*x^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=316 EqnNumber=20 FamilyID=1 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[71, 20, 9, 10, 1, 3, 1, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 1, 2, 3, 2, 16, 1, 2, 3, 4, 13]"+
"// DOEMatrixRow=[69, 22, 12, 3, 1, 2, 3, 2, 1, 1, 2, 1, 2, 3, 4, 2, 3, 22, 1, 3, 1, 3, 1, 2, 5, 3, 1, 2, 1, 7, 2, 3, 20]"+
//Tail EqnIndex=316 EqnNumber=20 FamilyID=1 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[71, 20, 9, 10, 1, 3, 1, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 1, 2, 3, 2, 16, 1, 2, 3, 4, 13]"+
"// DOEMatrixRow=[69, 22, 12, 3, 1, 2, 3, 2, 1, 1, 2, 1, 2, 3, 4, 2, 3, 22, 1, 3, 1, 3, 1, 2, 5, 3, 1, 2, 1, 7, 2, 3, 20]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "2.0*x^36.0-36.0*x^70.0+6.0-1.0/1.5*x^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "2.0*36.0*x^35.0-36.0*70.0*x^69.0+6.0*0.0-1.0/1.5*6.0*x^5.0";
 UsageCalculus.EqnSolArrayMap2[1] = "72.0*x^35.0-2520.0*x^69.0-4.0*x^5.0";
 UsageCalculus.EqnSolArrayMap3[1] = "2.0*x^36.0-36.0*x^70.0+6.0-1.0/1.5*x^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "2.0/37.0*x^37.0-36.0/71.0*x^71.0+6.0*x-1.0/1.5/7.0*x^7.0";
 UsageCalculus.EqnSolArrayMap4[1] = "1.0/18.5*x^37.0-1.0/1.9722222222222223*x^71.0+6.0*x-1.0/10.5*x^7.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "72.0*x^35.0-2520.0*x^69.0-4.0*x^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "72.0*35.0*x^34.0-2520.0*69.0*x^68.0-4.0*5.0*x^4.0";
 UsageCalculus.EqnSolArrayMap2[2] = "2520.0*x^34.0-173880.0*x^68.0-20.0*x^4.0";
 UsageCalculus.EqnSolArrayMap3[2] = "1.0/18.5*x^37.0-1.0/1.9722222222222223*x^71.0+6.0*x-1.0/10.5*x^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "1.0/18.5/38.0*x^38.0-1.0/1.9722222222222223/72.0*x^72.0+6.0/2.0*x^2.0-1.0/10.5/8.0*x^8.0";
 UsageCalculus.EqnSolArrayMap4[2] = "1.0/703.0*x^38.0-1.0/142.0*x^72.0+3.0*x^2.0-1.0/84.0*x^8.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "2520.0*x^34.0-173880.0*x^68.0-20.0*x^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "2520.0*34.0*x^33.0-173880.0*68.0*x^67.0-20.0*4.0*x^3.0";
 UsageCalculus.EqnSolArrayMap2[3] = "85680.0*x^33.0-1.182384E7*x^67.0-80.0*x^3.0";
 UsageCalculus.EqnSolArrayMap3[3] = "1.0/703.0*x^38.0-1.0/142.0*x^72.0+3.0*x^2.0-1.0/84.0*x^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "1.0/703.0/39.0*x^39.0-1.0/142.0/73.0*x^73.0+3.0/3.0*x^3.0-1.0/84.0/9.0*x^9.0";
 UsageCalculus.EqnSolArrayMap4[3] = "1.0/27417.0*x^39.0-1.0/10366.0*x^73.0+x^3.0-1.0/756.0*x^9.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "85680.0*x^33.0-1.182384E7*x^67.0-80.0*x^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "85680.0*33.0*x^32.0-67.0*x^66.0-80.0*3.0*x^2.0";
 UsageCalculus.EqnSolArrayMap2[4] = "2827440.0*x^32.0-67.0*x^66.0-240.0*x^2.0";
 UsageCalculus.EqnSolArrayMap3[4] = "1.0/27417.0*x^39.0-9.646922631680494E-5*x^73.0+x^3.0-1.0/756.0*x^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "1.0/27417.0/40.0*x^40.0-9.646922631680494E-5/74.0*x^74.0+1.0/4.0*x^4.0-1.0/756.0/10.0*x^10.0";
 UsageCalculus.EqnSolArrayMap4[4] = "1.0/1096680.0*x^40.0-1.0/767084.0*x^74.0-1.0/14.8*x^74.0+1.0/4.0*x^4.0-1.0/7560.0*x^10.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff121318() {
 UsageCalculus.TestCase = 121318;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xy/3*xy^2*-1*xy^3*-3*xy3*x0^21*xy^3*-3*xy-3*xy/1*xy^2*-2*xy^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xy^33*xy/-1*xy^2-1*x0^2*-2*x0^3*3*x02*xy^3*3*xy/1*xy^2*--3*xy^33*xy2*xy/3*xy^23*x0^2*-1*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=317 EqnNumber=21 FamilyID=3 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[35, 21, 10, 11, 2, 1, 2, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 3, 4, 3, 1, 2, 3, 2, 3, 1, 3, 1, 2, 3, 4, 5, 14]"+
"// DOEMatrixRow=[33, 23, 13, 4, 2, 3, 1, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 23, 2, 1, 2, 4, 2, 3, 6, 4, 2, 3, 2, 8, 1, 4, 1]"+
//Tail EqnIndex=317 EqnNumber=21 FamilyID=3 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[35, 21, 10, 11, 2, 1, 2, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 3, 4, 3, 1, 2, 3, 2, 3, 1, 3, 1, 2, 3, 4, 5, 14]"+
"// DOEMatrixRow=[33, 23, 13, 4, 2, 3, 1, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 23, 2, 1, 2, 4, 2, 3, 6, 4, 2, 3, 2, 8, 1, 4, 1]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^21.0*6.0*xy^10.0-x0^2.0*x0*36.0*xy^70.0+x0^2.0*18.0*xy^63.0+x0^2.0*xy^57.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^21.0*6.0*10.0*xy^9.0-x0^2.0*x0*36.0*70.0*xy^69.0+x0^2.0*18.0*63.0*xy^62.0+x0^2.0*57.0*xy^56.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^21.0*60.0*xy^9.0-x0^2.0*x0*2520.0*xy^69.0+x0^2.0*1134.0*xy^62.0+x0^2.0*57.0*xy^56.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^21.0*6.0*xy^10.0-x0^2.0*x0*36.0*xy^70.0+x0^2.0*18.0*xy^63.0+x0^2.0*xy^57.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^21.0*6.0/11.0*xy^11.0-x0^2.0*x0*36.0/71.0*xy^71.0+x0^2.0*18.0/64.0*xy^64.0+x0^2.0/58.0*xy^58.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^21.0*0.5454545454545454*xy^11.0-x0^2.0*x0*0.5070422535211268*xy^71.0+x0^2.0*0.28125*xy^64.0+x0^2.0/58.0*xy^58.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^21.0*60.0*xy^9.0-x0^2.0*x0*2520.0*xy^69.0+x0^2.0*1134.0*xy^62.0+x0^2.0*57.0*xy^56.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^21.0*60.0*9.0*xy^8.0-x0^2.0*x0*2520.0*69.0*xy^68.0+x0^2.0*1134.0*62.0*xy^61.0+x0^2.0*57.0*56.0*xy^55.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^21.0*540.0*xy^8.0-x0^2.0*x0*173880.0*xy^68.0+x0^2.0*70308.0*xy^61.0+x0^2.0*3192.0*xy^55.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^21.0*0.5454545454545454*xy^11.0-x0^2.0*x0*0.5070422535211268*xy^71.0+x0^2.0*0.28125*xy^64.0+x0^2.0/58.0*xy^58.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^21.0*0.5454545454545454/12.0*xy^12.0-x0^2.0*x0*0.5070422535211268/72.0*xy^72.0+x0^2.0*0.28125/65.0*xy^65.0+x0^2.0*58.0/59.0*xy^59.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^21.0*0.04545454545454545*xy^12.0-x0^2.0*x0*0.007042253521126761*xy^72.0+x0^2.0*0.004326923076923077*xy^65.0+x0^2.0/1.0172413793103448*xy^59.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^21.0*540.0*xy^8.0-x0^2.0*x0*173880.0*xy^68.0+x0^2.0*70308.0*xy^61.0+x0^2.0*3192.0*xy^55.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^21.0*540.0*8.0*xy^7.0-x0^2.0*x0*173880.0*68.0*xy^67.0+x0^2.0*70308.0*61.0*xy^60.0+x0^2.0*3192.0*55.0*xy^54.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^21.0*4320.0*xy^7.0-x0^2.0*x0*1.182384E7*xy^67.0+x0^2.0*4288788.0*xy^60.0+x0^2.0*175560.0*xy^54.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^21.0*0.04545454545454545*xy^12.0-x0^2.0*x0*0.007042253521126761*xy^72.0+x0^2.0*0.004326923076923077*xy^65.0+x0^2.0/1.0172413793103448*xy^59.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^21.0*0.04545454545454545/13.0*xy^13.0-x0^2.0*x0*0.007042253521126761/73.0*xy^73.0+x0^2.0*0.004326923076923077/66.0*xy^66.0+x0^2.0172413793103448/60.0*xy^60.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^21.0*0.003496503496503496*xy^13.0-x0^2.0*x0*9.646922631680494E-5*xy^73.0+x0^2.0*6.555944055944056E-5*xy^66.0+x0^2.0172413793103448/60.0*xy^60.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^21.0*4320.0*xy^7.0-x0^2.0*x0*1.182384E7*xy^67.0+x0^2.0*4288788.0*xy^60.0+x0^2.0*175560.0*xy^54.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^21.0*4320.0*7.0*xy^6.0-x0^2.0*x0*1.182384E7*67.0*xy^66.0+x0^2.0*4288788.0*60.0*xy^59.0+x0^2.0*175560.0*54.0*xy^53.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^21.0*30240.0*xy^6.0-x0^2.0*x0*7.9219728E8*xy^66.0+x0^2.0*2.5732728E8*xy^59.0+x0^2.0*9480240.0*xy^53.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^21.0*0.003496503496503496*xy^13.0-x0^2.0*x0*9.646922631680494E-5*xy^73.0-5.0*xy^73.0+x0^2.0*6.555944055944056E-5*xy^66.0-5.0*xy^66.0+x0^2.0172413793103448/60.0*xy^60.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^21.0*0.003496503496503496/14.0*xy^14.0-x0^2.0*x0*9.646922631680494E-5/74.0*xy^74.0-5.0/74.0*xy^74.0+x0^2.0*6.555944055944056E-5/67.0*xy^67.0-5.0/67.0*xy^67.0+x0^2.0172413793103448*60.0/61.0*xy^61.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^21.0*2.497502497502497E-4*xy^14.0-x0^2.0*x0/767084.0*xy^74.0-1.0/14.8*xy^74.0-0.06756756756756757*xy^74.0+x0^2.0/1021973.3333333334*xy^67.0-1.0/13.4*xy^67.0-0.07462686567164178*xy^67.0+x0^2.0172413793103448/1.0166666666666666*xy^61.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff121319() {
 UsageCalculus.TestCase = 121319;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*x0^21*xyz^3*-3*xyz-3*xyz/1*xyz^2*-2*xyz^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyz^33*xyz/-1*xyz^2-1*x0^2*-2*x0^3*3*x02*xyz^3*3*xyz/1*xyz^2*--3*xyz^33*xyz1*x0^2*--3*x0^3-3*xyz^3*1*xyz/2*xyz^23*x0^2*-1*x0^31*xyz^3*-3*xyz";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=318 EqnNumber=22 FamilyID=1 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[2, 22, 11, 12, 3, 2, 3, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 1, 1, 4, 2, 3, 1, 3, 4, 2, 4, 2, 3, 4, 5, 6, 15]"+
"// DOEMatrixRow=[100, 24, 14, 1, 3, 1, 2, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 24, 3, 2, 3, 5, 3, 1, 1, 1, 3, 1, 3, 9, 2, 5, 2]"+
//Tail EqnIndex=318 EqnNumber=22 FamilyID=1 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[2, 22, 11, 12, 3, 2, 3, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 1, 1, 4, 2, 3, 1, 3, 4, 2, 4, 2, 3, 4, 5, 6, 15]"+
"// DOEMatrixRow=[100, 24, 14, 1, 3, 1, 2, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 24, 3, 2, 3, 5, 3, 1, 1, 1, 3, 1, 3, 9, 2, 5, 2]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^21.0*9.0*xyz^4.0-x0^2.0*x0*36.0*xyz^70.0+x0^2.0*162.0*xyz^39.0-x0^2.0*9.0*xyz^33.0-x0^3.0*3.0-x0^2.0*4.5*xyz^31.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^21.0*9.0*4.0*xyz^3.0-x0^2.0*x0*36.0*70.0*xyz^69.0+x0^2.0*162.0*39.0*xyz^38.0-x0^2.0*9.0*33.0*xyz^32.0-x0^3.0*3.0*0.0-x0^2.0*4.5*31.0*xyz^30.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^21.0*36.0*xyz^3.0-x0^2.0*x0*2520.0*xyz^69.0+x0^2.0*6318.0*xyz^38.0-x0^2.0*297.0*xyz^32.0-x0^3.0*0.0-x0^2.0*139.5*xyz^30.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^21.0*9.0*xyz^4.0-x0^2.0*x0*36.0*xyz^70.0+x0^2.0*162.0*xyz^39.0-x0^2.0*9.0*xyz^33.0-x0^3.0*3.0-x0^2.0*4.5*xyz^31.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^21.0*9.0/5.0*xyz^5.0-x0^2.0*x0*36.0/71.0*xyz^71.0+x0^2.0*162.0/40.0*xyz^40.0-x0^2.0*9.0/34.0*xyz^34.0-x0^3.0*xyz-x0^2.0*4.5/32.0*xyz^32.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^21.0*1.8*xyz^5.0-x0^2.0*x0*0.5070422535211268*xyz^71.0+x0^2.0*4.05*xyz^40.0-x0^2.0*0.2647058823529412*xyz^34.0-x0^3.0*xyz-x0^2.0/7.111111111111111*xyz^32.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^21.0*36.0*xyz^3.0-x0^2.0*x0*2520.0*xyz^69.0+x0^2.0*6318.0*xyz^38.0-x0^2.0*297.0*xyz^32.0-x0^3.0*0.0-x0^2.0*139.5*xyz^30.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^21.0*36.0*3.0*xyz^2.0-x0^2.0*x0*2520.0*69.0*xyz^68.0+x0^2.0*6318.0*38.0*xyz^37.0-x0^2.0*297.0*32.0*xyz^31.0-x0^3.0*0.0*0.0-x0^2.0*139.5*30.0*xyz^29.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^21.0*108.0*xyz^2.0-x0^2.0*x0*173880.0*xyz^68.0+x0^2.0*240084.0*xyz^37.0-x0^2.0*9504.0*xyz^31.0-x0^3.0*0.0-x0^2.0*4185.0*xyz^29.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^21.0*1.8*xyz^5.0-x0^2.0*x0*0.5070422535211268*xyz^71.0+x0^2.0*4.05*xyz^40.0-x0^2.0*0.2647058823529412*xyz^34.0-x0^3.0*xyz-x0^2.0/7.111111111111111*xyz^32.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^21.0*1.8/6.0*xyz^6.0-x0^2.0*x0*0.5070422535211268/72.0*xyz^72.0+x0^2.0*4.05/41.0*xyz^41.0-x0^2.0*0.2647058823529412/35.0*xyz^35.0-x0^3.0/2.0*xyz^2.0-x0^2.0*7.111111111111111/33.0*xyz^33.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^21.0*0.3*xyz^6.0-x0^2.0*x0*0.007042253521126761*xyz^72.0+x0^2.0*0.09878048780487804*xyz^41.0-x0^2.0*0.007563025210084034*xyz^35.0-x0^3.0/2.0*xyz^2.0-x0^2.0/4.640625*xyz^33.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^21.0*108.0*xyz^2.0-x0^2.0*x0*173880.0*xyz^68.0+x0^2.0*240084.0*xyz^37.0-x0^2.0*9504.0*xyz^31.0-x0^3.0*0.0-x0^2.0*4185.0*xyz^29.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^21.0*108.0*2.0*xyz^1.0-x0^2.0*x0*173880.0*68.0*xyz^67.0+x0^2.0*240084.0*37.0*xyz^36.0-x0^2.0*9504.0*31.0*xyz^30.0-x0^3.0*0.0*0.0-x0^2.0*4185.0*29.0*xyz^28.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^21.0*216.0*xyz-x0^2.0*x0*1.182384E7*xyz^67.0+x0^2.0*8883108.0*xyz^36.0-x0^2.0*294624.0*xyz^30.0-x0^3.0*0.0-x0^2.0*121365.0*xyz^28.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^21.0*0.3*xyz^6.0-x0^2.0*x0*0.007042253521126761*xyz^72.0+x0^2.0*0.09878048780487804*xyz^41.0-x0^2.0*0.007563025210084034*xyz^35.0-x0^3.0/2.0*xyz^2.0-x0^2.0/4.640625*xyz^33.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^21.0*0.3/7.0*xyz^7.0-x0^2.0*x0*0.007042253521126761/73.0*xyz^73.0+x0^2.0*0.09878048780487804/42.0*xyz^42.0-x0^2.0*0.007563025210084034/36.0*xyz^36.0-x0^3.0/2.0/3.0*xyz^3.0-x0^2.0*4.640625/34.0*xyz^34.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^21.0*0.04285714285714286*xyz^7.0-x0^2.0*x0*9.646922631680494E-5*xyz^73.0+x0^2.0*0.00235191637630662*xyz^42.0-x0^2.0*2.100840336134454E-4*xyz^36.0-x0^3.0*0.16666666666666666*xyz^3.0-x0^2.0/7.326599326599327*xyz^34.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^21.0*216.0*xyz-x0^2.0*x0*1.182384E7*xyz^67.0+x0^2.0*8883108.0*xyz^36.0-x0^2.0*294624.0*xyz^30.0-x0^3.0*0.0-x0^2.0*121365.0*xyz^28.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^21.0*216.0-x0^2.0*x0*1.182384E7*67.0*xyz^66.0+x0^2.0*8883108.0*36.0*xyz^35.0-x0^2.0*294624.0*30.0*xyz^29.0-x0^3.0*0.0*0.0-x0^2.0*121365.0*28.0*xyz^27.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^21.0*216.0-x0^2.0*x0*7.9219728E8*xyz^66.0+x0^2.0*3.19791888E8*xyz^35.0-x0^2.0*8838720.0*xyz^29.0-x0^3.0*0.0-x0^2.0*3398220.0*xyz^27.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^21.0*0.04285714285714286*xyz^7.0-x0^2.0*x0*9.646922631680494E-5*xyz^73.0-5.0*xyz^73.0+x0^2.0*0.00235191637630662*xyz^42.0-x0^2.0*2.100840336134454E-4*xyz^36.0-4.0*xyz^36.0-x0^3.0*0.16666666666666666*xyz^3.0-x0^2.0/7.326599326599327*xyz^34.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^21.0*0.04285714285714286/8.0*xyz^8.0-x0^2.0*x0*9.646922631680494E-5/74.0*xyz^74.0-5.0/74.0*xyz^74.0+x0^2.0*0.00235191637630662/43.0*xyz^43.0-x0^2.0*2.100840336134454E-4/37.0*xyz^37.0-4.0/37.0*xyz^37.0-x0^3.0*0.16666666666666666/4.0*xyz^4.0-x0^2.0*7.326599326599327/35.0*xyz^35.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^21.0*0.005357142857142857*xyz^8.0-x0^2.0*x0/767084.0*xyz^74.0-1.0/14.8*xyz^74.0-0.06756756756756757*xyz^74.0+x0^2.0*5.46957296815493E-5*xyz^43.0-x0^2.0/176120.0*xyz^37.0-1.0/9.25*xyz^37.0-0.10810810810810811*xyz^37.0-x0^3.0*0.041666666666666664*xyz^4.0-x0^2.0/4.777113970588235*xyz^35.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff121320() {
 UsageCalculus.TestCase = 121320;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xyza^3*-3*xyza-3*xyza/1*xyza^2*-2*xyza^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyza^33*xyza/-1*xyza^2-1*x0^2*-2*x0^3*3*x02*xyza^3*3*xyza/1*xyza^2*--3*xyza^33*xyza1*x0^2*--3*x0^3-3*xyza^3*1*xyza/2*xyza^21*xyza/2*xyza^2*-3*xyza^3*-1*xyza2*x0^21*xyza^3*-3*xyza-3*xyza/1*xyza^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=319 EqnNumber=23 FamilyID=2 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[66, 23, 12, 13, 4, 3, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 2, 3, 5, 3, 1, 2, 4, 5, 3, 1, 3, 4, 5, 6, 7, 16]"+
"// DOEMatrixRow=[61, 25, 15, 2, 1, 2, 3, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 25, 4, 3, 1, 1, 1, 2, 3, 2, 1, 2, 4, 10, 1, 6, 3]"+
//Tail EqnIndex=319 EqnNumber=23 FamilyID=2 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[66, 23, 12, 13, 4, 3, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 2, 3, 5, 3, 1, 2, 4, 5, 3, 1, 3, 4, 5, 6, 7, 16]"+
"// DOEMatrixRow=[61, 25, 15, 2, 1, 2, 3, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 25, 4, 3, 1, 1, 1, 2, 3, 2, 1, 2, 4, 10, 1, 6, 3]"
;
 UsageCalculus.DiffWithRespTo = "xyza";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-3.0*xyza^4.0-x0^2.0*x0*36.0*xyza^70.0+x0^2.0*162.0*xyza^39.0-x0^2.0*9.0*xyza^33.0-x0^3.0*3.0+x0^21.0*6.75*xyza^35.0-3.0*xyza^3.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-3.0*4.0*xyza^3.0-x0^2.0*x0*36.0*70.0*xyza^69.0+x0^2.0*162.0*39.0*xyza^38.0-x0^2.0*9.0*33.0*xyza^32.0-x0^3.0*3.0*0.0+x0^21.0*6.75*35.0*xyza^34.0-3.0*3.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-12.0*xyza^3.0-x0^2.0*x0*2520.0*xyza^69.0+x0^2.0*6318.0*xyza^38.0-x0^2.0*297.0*xyza^32.0-x0^3.0*0.0+x0^21.0*236.25*xyza^34.0-9.0*xyza^2.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-3.0*xyza^4.0-x0^2.0*x0*36.0*xyza^70.0+x0^2.0*162.0*xyza^39.0-x0^2.0*9.0*xyza^33.0-x0^3.0*3.0+x0^21.0*6.75*xyza^35.0-3.0*xyza^3.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-3.0/5.0*xyza^5.0-x0^2.0*x0*36.0/71.0*xyza^71.0+x0^2.0*162.0/40.0*xyza^40.0-x0^2.0*9.0/34.0*xyza^34.0-x0^3.0*xyza+x0^21.0*6.75/36.0*xyza^36.0-3.0/4.0*xyza^4.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-0.6*xyza^5.0-x0^2.0*x0*0.5070422535211268*xyza^71.0+x0^2.0*4.05*xyza^40.0-x0^2.0*0.2647058823529412*xyza^34.0-x0^3.0*xyza+x0^21.0/5.333333333333333*xyza^36.0-1.0/1.3333333333333333*xyza^4.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-12.0*xyza^3.0-x0^2.0*x0*2520.0*xyza^69.0+x0^2.0*6318.0*xyza^38.0-x0^2.0*297.0*xyza^32.0-x0^3.0*0.0+x0^21.0*236.25*xyza^34.0-9.0*xyza^2.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-12.0*3.0*xyza^2.0-x0^2.0*x0*2520.0*69.0*xyza^68.0+x0^2.0*6318.0*38.0*xyza^37.0-x0^2.0*297.0*32.0*xyza^31.0-x0^3.0*0.0*0.0+x0^21.0*236.25*34.0*xyza^33.0-9.0*2.0*xyza^1.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-36.0*xyza^2.0-x0^2.0*x0*173880.0*xyza^68.0+x0^2.0*240084.0*xyza^37.0-x0^2.0*9504.0*xyza^31.0-x0^3.0*0.0+x0^21.0*8032.5*xyza^33.0-18.0*xyza";
 UsageCalculus.EqnSolArrayMap3[2] = "-0.6*xyza^5.0-x0^2.0*x0*0.5070422535211268*xyza^71.0+x0^2.0*4.05*xyza^40.0-x0^2.0*0.2647058823529412*xyza^34.0-x0^3.0*xyza+x0^21.0/5.333333333333333*xyza^36.0-1.0/1.3333333333333333*xyza^4.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-0.6/6.0*xyza^6.0-x0^2.0*x0*0.5070422535211268/72.0*xyza^72.0+x0^2.0*4.05/41.0*xyza^41.0-x0^2.0*0.2647058823529412/35.0*xyza^35.0-x0^3.0/2.0*xyza^2.0+x0^21.0/5.333333333333333/37.0*xyza^37.0-1.0/1.3333333333333333/5.0*xyza^5.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-0.09999999999999999*xyza^6.0-x0^2.0*x0*0.007042253521126761*xyza^72.0+x0^2.0*0.09878048780487804*xyza^41.0-x0^2.0*0.007563025210084034*xyza^35.0-x0^3.0/2.0*xyza^2.0+x0^21.0/197.33333333333331*xyza^37.0-1.0/6.666666666666666*xyza^5.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-36.0*xyza^2.0-x0^2.0*x0*173880.0*xyza^68.0+x0^2.0*240084.0*xyza^37.0-x0^2.0*9504.0*xyza^31.0-x0^3.0*0.0+x0^21.0*8032.5*xyza^33.0-18.0*xyza";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-36.0*2.0*xyza^1.0-x0^2.0*x0*173880.0*68.0*xyza^67.0+x0^2.0*240084.0*37.0*xyza^36.0-x0^2.0*9504.0*31.0*xyza^30.0-x0^3.0*0.0*0.0+x0^21.0*8032.5*33.0*xyza^32.0-18.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-72.0*xyza-x0^2.0*x0*1.182384E7*xyza^67.0+x0^2.0*8883108.0*xyza^36.0-x0^2.0*294624.0*xyza^30.0-x0^3.0*0.0+x0^21.0*265072.5*xyza^32.0-18.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-0.09999999999999999*xyza^6.0-x0^2.0*x0*0.007042253521126761*xyza^72.0+x0^2.0*0.09878048780487804*xyza^41.0-x0^2.0*0.007563025210084034*xyza^35.0-x0^3.0/2.0*xyza^2.0+x0^21.0/197.33333333333331*xyza^37.0-1.0/6.666666666666666*xyza^5.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-0.09999999999999999/7.0*xyza^7.0-x0^2.0*x0*0.007042253521126761/73.0*xyza^73.0+x0^2.0*0.09878048780487804/42.0*xyza^42.0-x0^2.0*0.007563025210084034/36.0*xyza^36.0-x0^3.0/2.0/3.0*xyza^3.0+x0^21.0/197.33333333333331/38.0*xyza^38.0-1.0/6.666666666666666/6.0*xyza^6.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-0.014285714285714285*xyza^7.0-x0^2.0*x0*9.646922631680494E-5*xyza^73.0+x0^2.0*0.00235191637630662*xyza^42.0-x0^2.0*2.100840336134454E-4*xyza^36.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^21.0/7498.666666666666*xyza^38.0-1.0/40.0*xyza^6.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-72.0*xyza-x0^2.0*x0*1.182384E7*xyza^67.0+x0^2.0*8883108.0*xyza^36.0-x0^2.0*294624.0*xyza^30.0-x0^3.0*0.0+x0^21.0*265072.5*xyza^32.0-18.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-72.0-x0^2.0*x0*1.182384E7*67.0*xyza^66.0+x0^2.0*8883108.0*36.0*xyza^35.0-x0^2.0*294624.0*30.0*xyza^29.0-x0^3.0*0.0*0.0+x0^21.0*265072.5*32.0*xyza^31.0-18.0*0.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-72.0-x0^2.0*x0*7.9219728E8*xyza^66.0+x0^2.0*3.19791888E8*xyza^35.0-x0^2.0*8838720.0*xyza^29.0-x0^3.0*0.0+x0^21.0*8482320.0*xyza^31.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-0.014285714285714285*xyza^7.0-x0^2.0*x0*9.646922631680494E-5*xyza^73.0-5.0*xyza^73.0+x0^2.0*0.00235191637630662*xyza^42.0-x0^2.0*2.100840336134454E-4*xyza^36.0-4.0*xyza^36.0-x0^3.0*0.16666666666666666*xyza^3.0+x0^21.0/7498.666666666666*xyza^38.0-1.0/40.0*xyza^6.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-0.014285714285714285/8.0*xyza^8.0-x0^2.0*x0*9.646922631680494E-5/74.0*xyza^74.0-5.0/74.0*xyza^74.0+x0^2.0*0.00235191637630662/43.0*xyza^43.0-x0^2.0*2.100840336134454E-4/37.0*xyza^37.0-4.0/37.0*xyza^37.0-x0^3.0*0.16666666666666666/4.0*xyza^4.0+x0^21.0/7498.666666666666/39.0*xyza^39.0-1.0/40.0/7.0*xyza^7.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-0.0017857142857142857*xyza^8.0-x0^2.0*x0/767084.0*xyza^74.0-1.0/14.8*xyza^74.0-0.06756756756756757*xyza^74.0+x0^2.0*5.46957296815493E-5*xyza^43.0-x0^2.0/176120.0*xyza^37.0-1.0/9.25*xyza^37.0-0.10810810810810811*xyza^37.0-x0^3.0*0.041666666666666664*xyza^4.0+x0^21.0/292448.0*xyza^39.0-1.0/280.0*xyza^7.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff121321() {
 UsageCalculus.TestCase = 121321;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*x/1*x^2*-2*x^31*x0^2*-2*x0^3*3*x0/-1*x0^22*x^33*x/-1*x^2-1*x0^2*-2*x0^3*3*x02*x^3*3*x/1*x^2*--3*x^33*x1*x0^2*--3*x0^3-3*x^3*1*x/2*x^21*x/2*x^2*-3*x^3*-1*x2*x0^23*x^3*-1*x-1*x/2*x^2*-3*x-3*x/1*x^21*x0^2*-2*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=320 EqnNumber=24 FamilyID=3 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[30, 24, 13, 14, 1, 1, 2, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 4, 6, 1, 2, 3, 1, 6, 1, 2, 4, 1, 6, 7, 8, 17]"+
"// DOEMatrixRow=[28, 26, 16, 3, 2, 3, 1, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 26, 5, 1, 2, 3, 2, 3, 4, 3, 2, 3, 1, 11, 2, 7, 4]"+
//Tail EqnIndex=320 EqnNumber=24 FamilyID=3 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[30, 24, 13, 14, 1, 1, 2, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 4, 6, 1, 2, 3, 1, 6, 1, 2, 4, 1, 6, 7, 8, 17]"+
"// DOEMatrixRow=[28, 26, 16, 3, 2, 3, 1, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 26, 5, 1, 2, 3, 2, 3, 4, 3, 2, 3, 1, 11, 2, 7, 4]"
;
 UsageCalculus.DiffWithRespTo = "x";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-36.0*x^70.0+162.0*x^39.0-9.0*x^33.0-3.0+2.25*x^35.0+1.5*x^4.0+6.0*x^22.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-36.0*70.0*x^69.0+162.0*39.0*x^38.0-9.0*33.0*x^32.0-3.0*0.0+2.25*35.0*x^34.0+1.5*4.0*x^3.0+6.0*22.0*x^21.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-2520.0*x^69.0+6318.0*x^38.0-297.0*x^32.0+78.75*x^34.0+6.0*x^3.0+132.0*x^21.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-36.0*x^70.0+162.0*x^39.0-9.0*x^33.0-3.0+2.25*x^35.0+1.5*x^4.0+6.0*x^22.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-36.0/71.0*x^71.0+162.0/40.0*x^40.0-9.0/34.0*x^34.0-3.0*x+2.25/36.0*x^36.0+1.5/5.0*x^5.0+6.0/23.0*x^23.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-1.0/1.9722222222222223*x^71.0+4.05*x^40.0-1.0/3.7777777777777777*x^34.0-3.0*x+1.0/16.0*x^36.0+1.0/3.3333333333333335*x^5.0+1.0/3.8333333333333335*x^23.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-2520.0*x^69.0+6318.0*x^38.0-297.0*x^32.0+78.75*x^34.0+6.0*x^3.0+132.0*x^21.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-2520.0*69.0*x^68.0+6318.0*38.0*x^37.0-297.0*32.0*x^31.0+78.75*34.0*x^33.0+6.0*3.0*x^2.0+132.0*21.0*x^20.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-173880.0*x^68.0+240084.0*x^37.0-9504.0*x^31.0+2677.5*x^33.0+18.0*x^2.0+2772.0*x^20.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-1.0/1.9722222222222223*x^71.0+4.05*x^40.0-1.0/3.7777777777777777*x^34.0-3.0*x+1.0/16.0*x^36.0+1.0/3.3333333333333335*x^5.0+1.0/3.8333333333333335*x^23.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-1.0/1.9722222222222223/72.0*x^72.0+4.05/41.0*x^41.0-1.0/3.7777777777777777/35.0*x^35.0-3.0/2.0*x^2.0+1.0/16.0/37.0*x^37.0+1.0/3.3333333333333335/6.0*x^6.0+1.0/3.8333333333333335/24.0*x^24.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-1.0/142.0*x^72.0+1.0/10.123456790123457*x^41.0-1.0/132.22222222222223*x^35.0-1.5*x^2.0+1.0/592.0*x^37.0+1.0/20.0*x^6.0+1.0/92.0*x^24.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-173880.0*x^68.0+240084.0*x^37.0-9504.0*x^31.0+2677.5*x^33.0+18.0*x^2.0+2772.0*x^20.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-173880.0*68.0*x^67.0+240084.0*37.0*x^36.0-9504.0*31.0*x^30.0+2677.5*33.0*x^32.0+18.0*2.0*x^1.0+2772.0*20.0*x^19.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-1.182384E7*x^67.0+8883108.0*x^36.0-294624.0*x^30.0+88357.5*x^32.0+36.0*x+55440.0*x^19.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-1.0/142.0*x^72.0+1.0/10.123456790123457*x^41.0-1.0/132.22222222222223*x^35.0-1.5*x^2.0+1.0/592.0*x^37.0+1.0/20.0*x^6.0+1.0/92.0*x^24.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-1.0/142.0/73.0*x^73.0+1.0/10.123456790123457/42.0*x^42.0-1.0/132.22222222222223/36.0*x^36.0-1.5/3.0*x^3.0+1.0/592.0/38.0*x^38.0+1.0/20.0/7.0*x^7.0+1.0/92.0/25.0*x^25.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-1.0/10366.0*x^73.0+1.0/425.1851851851852*x^42.0-1.0/4760.0*x^36.0-1.0/2.0*x^3.0+1.0/22496.0*x^38.0+1.0/140.0*x^7.0+1.0/2300.0*x^25.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-1.182384E7*x^67.0+8883108.0*x^36.0-294624.0*x^30.0+88357.5*x^32.0+36.0*x+55440.0*x^19.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-67.0*x^66.0+8883108.0*36.0*x^35.0-294624.0*30.0*x^29.0+88357.5*32.0*x^31.0+36.0+55440.0*19.0*x^18.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-67.0*x^66.0+3.19791888E8*x^35.0-8838720.0*x^29.0+2827440.0*x^31.0+36.0+1053360.0*x^18.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-1.0/10366.0*x^73.0+1.0/425.1851851851852*x^42.0-1.0/4760.0*x^36.0-1.0/2.0*x^3.0+1.0/22496.0*x^38.0+1.0/140.0*x^7.0+1.0/2300.0*x^25.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-1.0/10366.0/74.0*x^74.0+1.0/425.1851851851852/43.0*x^43.0-1.0/4760.0/37.0*x^37.0-1.0/2.0/4.0*x^4.0+1.0/22496.0/39.0*x^39.0+1.0/140.0/8.0*x^8.0+1.0/2300.0/26.0*x^26.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/767084.0*x^74.0+1.0/18282.962962962964*x^43.0-1.0/176120.0*x^37.0-1.0/8.0*x^4.0+1.0/877344.0*x^39.0+1.0/1120.0*x^8.0+1.0/59800.0*x^26.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff121322() {
 UsageCalculus.TestCase = 121322;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x0^2*-2*x0^3*3*x0/-1*x0^22*xy^33*xy/-1*xy^2-1*x0^2*-2*x0^3*3*x02*xy^3*3*xy/1*xy^2*--3*xy^33*xy1*x0^2*--3*x0^3-3*xy^3*1*xy/2*xy^21*xy/2*xy^2*-3*xy^3*-1*xy2*x0^23*xy^3*-1*xy-1*xy/2*xy^2*-3*xy2*x0^2*-3*x0*1*x0^2/-3*x03*xy1*x0^2*-2*x0^32*xy^3*3*xy";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=321 EqnNumber=25 FamilyID=1 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[97, 25, 14, 15, 2, 3, 1, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 1, 7, 2, 3, 1, 2, 7, 2, 3, 5, 2, 7, 8, 9, 18]"+
"// DOEMatrixRow=[94, 27, 17, 4, 3, 1, 2, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 27, 6, 2, 3, 4, 3, 1, 5, 4, 3, 1, 2, 12, 1, 8, 5]"+
//Tail EqnIndex=321 EqnNumber=25 FamilyID=1 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[97, 25, 14, 15, 2, 3, 1, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 1, 7, 2, 3, 1, 2, 7, 2, 3, 5, 2, 7, 8, 9, 18]"+
"// DOEMatrixRow=[94, 27, 17, 4, 3, 1, 2, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 27, 6, 2, 3, 4, 3, 1, 5, 4, 3, 1, 2, 12, 1, 8, 5]"
;
 UsageCalculus.DiffWithRespTo = "xy";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-x0^2.0*x0*6.0*xy^36.0+x0^2.0*162.0*xy^39.0-x0^2.0*9.0*xy^33.0-x0^3.0*3.0+x0^23.0*2.25*xy^35.0-x0^2.0*9.0*xy^7.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-x0^2.0*x0*6.0*36.0*xy^35.0+x0^2.0*162.0*39.0*xy^38.0-x0^2.0*9.0*33.0*xy^32.0-x0^3.0*3.0*0.0+x0^23.0*2.25*35.0*xy^34.0-x0^2.0*9.0*7.0*xy^6.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-x0^2.0*x0*216.0*xy^35.0+x0^2.0*6318.0*xy^38.0-x0^2.0*297.0*xy^32.0-x0^3.0*0.0+x0^23.0*78.75*xy^34.0-x0^2.0*63.0*xy^6.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-x0^2.0*x0*6.0*xy^36.0+x0^2.0*162.0*xy^39.0-x0^2.0*9.0*xy^33.0-x0^3.0*3.0+x0^23.0*2.25*xy^35.0-x0^2.0*9.0*xy^7.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-x0^2.0*x0*6.0/37.0*xy^37.0+x0^2.0*162.0/40.0*xy^40.0-x0^2.0*9.0/34.0*xy^34.0-x0^3.0*xy+x0^23.0*2.25/36.0*xy^36.0-x0^2.0*9.0/8.0*xy^8.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-x0^2.0*x0*0.16216216216216217*xy^37.0+x0^2.0*4.05*xy^40.0-x0^2.0*0.2647058823529412*xy^34.0-x0^3.0*xy+x0^23.0*0.0625*xy^36.0-x0^2.0*1.125*xy^8.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-x0^2.0*x0*216.0*xy^35.0+x0^2.0*6318.0*xy^38.0-x0^2.0*297.0*xy^32.0-x0^3.0*0.0+x0^23.0*78.75*xy^34.0-x0^2.0*63.0*xy^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-x0^2.0*x0*216.0*35.0*xy^34.0+x0^2.0*6318.0*38.0*xy^37.0-x0^2.0*297.0*32.0*xy^31.0-x0^3.0*0.0*0.0+x0^23.0*78.75*34.0*xy^33.0-x0^2.0*63.0*6.0*xy^5.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-x0^2.0*x0*7560.0*xy^34.0+x0^2.0*240084.0*xy^37.0-x0^2.0*9504.0*xy^31.0-x0^3.0*0.0+x0^23.0*2677.5*xy^33.0-x0^2.0*378.0*xy^5.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-x0^2.0*x0*0.16216216216216217*xy^37.0+x0^2.0*4.05*xy^40.0-x0^2.0*0.2647058823529412*xy^34.0-x0^3.0*xy+x0^23.0*0.0625*xy^36.0-x0^2.0*1.125*xy^8.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-x0^2.0*x0*0.16216216216216217/38.0*xy^38.0+x0^2.0*4.05/41.0*xy^41.0-x0^2.0*0.2647058823529412/35.0*xy^35.0-x0^3.0/2.0*xy^2.0+x0^23.0*0.0625/37.0*xy^37.0-x0^2.0*1.125/9.0*xy^9.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-x0^2.0*x0*0.004267425320056899*xy^38.0+x0^2.0*0.09878048780487804*xy^41.0-x0^2.0*0.007563025210084034*xy^35.0-x0^3.0/2.0*xy^2.0+x0^23.0*0.0016891891891891893*xy^37.0-x0^2.0/8.0*xy^9.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-x0^2.0*x0*7560.0*xy^34.0+x0^2.0*240084.0*xy^37.0-x0^2.0*9504.0*xy^31.0-x0^3.0*0.0+x0^23.0*2677.5*xy^33.0-x0^2.0*378.0*xy^5.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-x0^2.0*x0*7560.0*34.0*xy^33.0+x0^2.0*240084.0*37.0*xy^36.0-x0^2.0*9504.0*31.0*xy^30.0-x0^3.0*0.0*0.0+x0^23.0*2677.5*33.0*xy^32.0-x0^2.0*378.0*5.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-x0^2.0*x0*257040.0*xy^33.0+x0^2.0*8883108.0*xy^36.0-x0^2.0*294624.0*xy^30.0-x0^3.0*0.0+x0^23.0*88357.5*xy^32.0-x0^2.0*1890.0*xy^4.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-x0^2.0*x0*0.004267425320056899*xy^38.0+x0^2.0*0.09878048780487804*xy^41.0-x0^2.0*0.007563025210084034*xy^35.0-x0^3.0/2.0*xy^2.0+x0^23.0*0.0016891891891891893*xy^37.0-x0^2.0/8.0*xy^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-x0^2.0*x0*0.004267425320056899/39.0*xy^39.0+x0^2.0*0.09878048780487804/42.0*xy^42.0-x0^2.0*0.007563025210084034/36.0*xy^36.0-x0^3.0/2.0/3.0*xy^3.0+x0^23.0*0.0016891891891891893/38.0*xy^38.0-x0^2.0*8.0/10.0*xy^10.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-x0^2.0*x0*1.0942116205274101E-4*xy^39.0+x0^2.0*0.00235191637630662*xy^42.0-x0^2.0*2.100840336134454E-4*xy^36.0-x0^3.0*0.16666666666666666*xy^3.0+x0^23.0*4.4452347083926033E-5*xy^38.0-x0^2.0/1.25*xy^10.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-x0^2.0*x0*257040.0*xy^33.0+x0^2.0*8883108.0*xy^36.0-x0^2.0*294624.0*xy^30.0-x0^3.0*0.0+x0^23.0*88357.5*xy^32.0-x0^2.0*1890.0*xy^4.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-x0^2.0*x0*257040.0*33.0*xy^32.0+x0^2.0*8883108.0*36.0*xy^35.0-x0^2.0*294624.0*30.0*xy^29.0-x0^3.0*0.0*0.0+x0^23.0*88357.5*32.0*xy^31.0-x0^2.0*1890.0*4.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-x0^2.0*x0*8482320.0*xy^32.0+x0^2.0*3.19791888E8*xy^35.0-x0^2.0*8838720.0*xy^29.0-x0^3.0*0.0+x0^23.0*2827440.0*xy^31.0-x0^2.0*7560.0*xy^3.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-x0^2.0*x0*1.0942116205274101E-4*xy^39.0-4.0*xy^39.0+x0^2.0*0.00235191637630662*xy^42.0-x0^2.0*2.100840336134454E-4*xy^36.0-4.0*xy^36.0-x0^3.0*0.16666666666666666*xy^3.0+x0^23.0*4.4452347083926033E-5*xy^38.0-5.0*xy^38.0-x0^2.0/1.25*xy^10.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-x0^2.0*x0*1.0942116205274101E-4/40.0*xy^40.0-4.0/40.0*xy^40.0+x0^2.0*0.00235191637630662/43.0*xy^43.0-x0^2.0*2.100840336134454E-4/37.0*xy^37.0-4.0/37.0*xy^37.0-x0^3.0*0.16666666666666666/4.0*xy^4.0+x0^23.0*4.4452347083926033E-5/39.0*xy^39.0-5.0/39.0*xy^39.0-x0^2.0*1.25/11.0*xy^11.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-x0^2.0*x0/365559.99999999994*xy^40.0-1.0/10.0*xy^40.0-0.1*xy^40.0+x0^2.0*5.46957296815493E-5*xy^43.0-x0^2.0/176120.0*xy^37.0-1.0/9.25*xy^37.0-0.10810810810810811*xy^37.0-x0^3.0*0.041666666666666664*xy^4.0+x0^23.0/877344.0*xy^39.0-1.0/7.8*xy^39.0-0.1282051282051282*xy^39.0-x0^2.0/8.8*xy^11.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff121323() {
 UsageCalculus.TestCase = 121323;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xyz^33*xyz/-1*xyz^2-1*x0^2*-2*x0^3*3*x02*xyz^3*3*xyz/1*xyz^2*--3*xyz^33*xyz1*x0^2*--3*x0^3-3*xyz^3*1*xyz/2*xyz^21*xyz/2*xyz^2*-3*xyz^3*-1*xyz2*x0^23*xyz^3*-1*xyz-1*xyz/2*xyz^2*-3*xyz2*x0^2*-3*x0*1*x0^2/-3*x03*xyz1*xyz^2/-3*xyz-3*xyz*-1*xyz^2*2*xyz2*xyz^3*3*xyz3*xyz/-1*xyz^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=322 EqnNumber=26 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[61, 26, 15, 16, 3, 1, 2, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 3, 8, 3, 1, 2, 3, 8, 3, 4, 6, 3, 8, 9, 10, 19]"+
"// DOEMatrixRow=[59, 28, 18, 1, 1, 2, 3, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 28, 7, 3, 1, 5, 1, 2, 6, 1, 1, 2, 3, 13, 2, 9, 6]"+
//Tail EqnIndex=322 EqnNumber=26 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[61, 26, 15, 16, 3, 1, 2, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 3, 8, 3, 1, 2, 3, 8, 3, 4, 6, 3, 8, 9, 10, 19]"+
"// DOEMatrixRow=[59, 28, 18, 1, 1, 2, 3, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 28, 7, 3, 1, 5, 1, 2, 6, 1, 1, 2, 3, 13, 2, 9, 6]"
;
 UsageCalculus.DiffWithRespTo = "xyz";
 UsageCalculus.MaxDiffOrder = 14;
 UsageCalculus.MaxIntegreOrder = 14;

 UsageCalculus.EqnSolArrayMap1[1] = "-2.0*xyz^36.0+x0^2.0*162.0*xyz^39.0-x0^2.0*9.0*xyz^33.0-x0^3.0*3.0+x0^23.0*2.25*xyz^35.0-1.0/2.0*xyz^6.0-18.0*xyz^9.0";
 UsageCalculus.EqnSolArrayDiffAlone[1] = "-2.0*36.0*xyz^35.0+x0^2.0*162.0*39.0*xyz^38.0-x0^2.0*9.0*33.0*xyz^32.0-x0^3.0*3.0*0.0+x0^23.0*2.25*35.0*xyz^34.0-1.0/2.0*6.0*xyz^5.0-18.0*9.0*xyz^8.0";
 UsageCalculus.EqnSolArrayMap2[1] = "-72.0*xyz^35.0+x0^2.0*6318.0*xyz^38.0-x0^2.0*297.0*xyz^32.0-x0^3.0*0.0+x0^23.0*78.75*xyz^34.0-3.0*xyz^5.0-162.0*xyz^8.0";
 UsageCalculus.EqnSolArrayMap3[1] = "-2.0*xyz^36.0+x0^2.0*162.0*xyz^39.0-x0^2.0*9.0*xyz^33.0-x0^3.0*3.0+x0^23.0*2.25*xyz^35.0-1.0/2.0*xyz^6.0-18.0*xyz^9.0";
 UsageCalculus.EqnSolArrayIntegrAlone[1] = "-2.0/37.0*xyz^37.0+x0^2.0*162.0/40.0*xyz^40.0-x0^2.0*9.0/34.0*xyz^34.0-x0^3.0*xyz+x0^23.0*2.25/36.0*xyz^36.0-1.0/2.0/7.0*xyz^7.0-18.0/10.0*xyz^10.0";
 UsageCalculus.EqnSolArrayMap4[1] = "-0.05405405405405406*xyz^37.0+x0^2.0*4.05*xyz^40.0-x0^2.0*0.2647058823529412*xyz^34.0-x0^3.0*xyz+x0^23.0/16.0*xyz^36.0-1.0/14.0*xyz^7.0-1.8*xyz^10.0";
 UsageCalculus.EqnSolOrder[1] = 1;

 UsageCalculus.EqnSolArrayMap1[2] = "-72.0*xyz^35.0+x0^2.0*6318.0*xyz^38.0-x0^2.0*297.0*xyz^32.0-x0^3.0*0.0+x0^23.0*78.75*xyz^34.0-3.0*xyz^5.0-162.0*xyz^8.0";
 UsageCalculus.EqnSolArrayDiffAlone[2] = "-72.0*35.0*xyz^34.0+x0^2.0*6318.0*38.0*xyz^37.0-x0^2.0*297.0*32.0*xyz^31.0-x0^3.0*0.0*0.0+x0^23.0*78.75*34.0*xyz^33.0-3.0*5.0*xyz^4.0-162.0*8.0*xyz^7.0";
 UsageCalculus.EqnSolArrayMap2[2] = "-2520.0*xyz^34.0+x0^2.0*240084.0*xyz^37.0-x0^2.0*9504.0*xyz^31.0-x0^3.0*0.0+x0^23.0*2677.5*xyz^33.0-15.0*xyz^4.0-1296.0*xyz^7.0";
 UsageCalculus.EqnSolArrayMap3[2] = "-0.05405405405405406*xyz^37.0+x0^2.0*4.05*xyz^40.0-x0^2.0*0.2647058823529412*xyz^34.0-x0^3.0*xyz+x0^23.0/16.0*xyz^36.0-1.0/14.0*xyz^7.0-1.8*xyz^10.0";
 UsageCalculus.EqnSolArrayIntegrAlone[2] = "-0.05405405405405406/38.0*xyz^38.0+x0^2.0*4.05/41.0*xyz^41.0-x0^2.0*0.2647058823529412/35.0*xyz^35.0-x0^3.0/2.0*xyz^2.0+x0^23.0/16.0/37.0*xyz^37.0-1.0/14.0/8.0*xyz^8.0-1.8/11.0*xyz^11.0";
 UsageCalculus.EqnSolArrayMap4[2] = "-0.001422475106685633*xyz^38.0+x0^2.0*0.09878048780487804*xyz^41.0-x0^2.0*0.007563025210084034*xyz^35.0-x0^3.0/2.0*xyz^2.0+x0^23.0/592.0*xyz^37.0-1.0/112.0*xyz^8.0-1.0/6.111111111111111*xyz^11.0";
 UsageCalculus.EqnSolOrder[2] = 2;

 UsageCalculus.EqnSolArrayMap1[3] = "-2520.0*xyz^34.0+x0^2.0*240084.0*xyz^37.0-x0^2.0*9504.0*xyz^31.0-x0^3.0*0.0+x0^23.0*2677.5*xyz^33.0-15.0*xyz^4.0-1296.0*xyz^7.0";
 UsageCalculus.EqnSolArrayDiffAlone[3] = "-2520.0*34.0*xyz^33.0+x0^2.0*240084.0*37.0*xyz^36.0-x0^2.0*9504.0*31.0*xyz^30.0-x0^3.0*0.0*0.0+x0^23.0*2677.5*33.0*xyz^32.0-15.0*4.0*xyz^3.0-1296.0*7.0*xyz^6.0";
 UsageCalculus.EqnSolArrayMap2[3] = "-85680.0*xyz^33.0+x0^2.0*8883108.0*xyz^36.0-x0^2.0*294624.0*xyz^30.0-x0^3.0*0.0+x0^23.0*88357.5*xyz^32.0-60.0*xyz^3.0-9072.0*xyz^6.0";
 UsageCalculus.EqnSolArrayMap3[3] = "-0.001422475106685633*xyz^38.0+x0^2.0*0.09878048780487804*xyz^41.0-x0^2.0*0.007563025210084034*xyz^35.0-x0^3.0/2.0*xyz^2.0+x0^23.0/592.0*xyz^37.0-1.0/112.0*xyz^8.0-1.0/6.111111111111111*xyz^11.0";
 UsageCalculus.EqnSolArrayIntegrAlone[3] = "-0.001422475106685633/39.0*xyz^39.0+x0^2.0*0.09878048780487804/42.0*xyz^42.0-x0^2.0*0.007563025210084034/36.0*xyz^36.0-x0^3.0/2.0/3.0*xyz^3.0+x0^23.0/592.0/38.0*xyz^38.0-1.0/112.0/9.0*xyz^9.0-1.0/6.111111111111111/12.0*xyz^12.0";
 UsageCalculus.EqnSolArrayMap4[3] = "-3.6473720684247E-5*xyz^39.0+x0^2.0*0.00235191637630662*xyz^42.0-x0^2.0*2.100840336134454E-4*xyz^36.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^23.0/22496.0*xyz^38.0-1.0/1008.0*xyz^9.0-1.0/73.33333333333333*xyz^12.0";
 UsageCalculus.EqnSolOrder[3] = 3;

 UsageCalculus.EqnSolArrayMap1[4] = "-85680.0*xyz^33.0+x0^2.0*8883108.0*xyz^36.0-x0^2.0*294624.0*xyz^30.0-x0^3.0*0.0+x0^23.0*88357.5*xyz^32.0-60.0*xyz^3.0-9072.0*xyz^6.0";
 UsageCalculus.EqnSolArrayDiffAlone[4] = "-85680.0*33.0*xyz^32.0+x0^2.0*8883108.0*36.0*xyz^35.0-x0^2.0*294624.0*30.0*xyz^29.0-x0^3.0*0.0*0.0+x0^23.0*88357.5*32.0*xyz^31.0-60.0*3.0*xyz^2.0-9072.0*6.0*xyz^5.0";
 UsageCalculus.EqnSolArrayMap2[4] = "-2827440.0*xyz^32.0+x0^2.0*3.19791888E8*xyz^35.0-x0^2.0*8838720.0*xyz^29.0-x0^3.0*0.0+x0^23.0*2827440.0*xyz^31.0-180.0*xyz^2.0-54432.0*xyz^5.0";
 UsageCalculus.EqnSolArrayMap3[4] = "-3.6473720684247E-5*xyz^39.0-5.0*xyz^39.0+x0^2.0*0.00235191637630662*xyz^42.0-x0^2.0*2.100840336134454E-4*xyz^36.0-4.0*xyz^36.0-x0^3.0*0.16666666666666666*xyz^3.0+x0^23.0/22496.0*xyz^38.0-1.0/1008.0*xyz^9.0-1.0/73.33333333333333*xyz^12.0";
 UsageCalculus.EqnSolArrayIntegrAlone[4] = "-3.6473720684247E-5/40.0*xyz^40.0-5.0/40.0*xyz^40.0+x0^2.0*0.00235191637630662/43.0*xyz^43.0-x0^2.0*2.100840336134454E-4/37.0*xyz^37.0-4.0/37.0*xyz^37.0-x0^3.0*0.16666666666666666/4.0*xyz^4.0+x0^23.0/22496.0/39.0*xyz^39.0-1.0/1008.0/10.0*xyz^10.0-1.0/73.33333333333333/13.0*xyz^13.0";
 UsageCalculus.EqnSolArrayMap4[4] = "-1.0/1096680.0*xyz^40.0-1.0/8.0*xyz^40.0-0.125*xyz^40.0+x0^2.0*5.46957296815493E-5*xyz^43.0-x0^2.0/176120.0*xyz^37.0-1.0/9.25*xyz^37.0-0.10810810810810811*xyz^37.0-x0^3.0*0.041666666666666664*xyz^4.0+x0^23.0/877344.0*xyz^39.0-1.0/10080.0*xyz^10.0-1.0/953.3333333333333*xyz^13.0";
 UsageCalculus.EqnSolOrder[4] = 4;

 UsageCalculus.EqnSolArrayMap1[5] = "";
 UsageCalculus.EqnSolArrayDiffAlone[5] = "";
 UsageCalculus.EqnSolArrayMap2[5] = "";
 UsageCalculus.EqnSolArrayMap3[5] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
 UsageCalculus.EqnSolArrayMap4[5] = "";
 UsageCalculus.EqnSolOrder[5] = 5;

 UsageCalculus.EqnSolArrayMap1[6] = "";
 UsageCalculus.EqnSolArrayDiffAlone[6] = "";
 UsageCalculus.EqnSolArrayMap2[6] = "";
 UsageCalculus.EqnSolArrayMap3[6] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
 UsageCalculus.EqnSolArrayMap4[6] = "";
 UsageCalculus.EqnSolOrder[6] = 6;

 UsageCalculus.EqnSolArrayMap1[7] = "";
 UsageCalculus.EqnSolArrayDiffAlone[7] = "";
 UsageCalculus.EqnSolArrayMap2[7] = "";
 UsageCalculus.EqnSolArrayMap3[7] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
 UsageCalculus.EqnSolArrayMap4[7] = "";
 UsageCalculus.EqnSolOrder[7] = 7;

 UsageCalculus.EqnSolArrayMap1[8] = "";
 UsageCalculus.EqnSolArrayDiffAlone[8] = "";
 UsageCalculus.EqnSolArrayMap2[8] = "";
 UsageCalculus.EqnSolArrayMap3[8] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[8] = "";
 UsageCalculus.EqnSolArrayMap4[8] = "";
 UsageCalculus.EqnSolOrder[8] = 8;

 UsageCalculus.EqnSolArrayMap1[9] = "";
 UsageCalculus.EqnSolArrayDiffAlone[9] = "";
 UsageCalculus.EqnSolArrayMap2[9] = "";
 UsageCalculus.EqnSolArrayMap3[9] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[9] = "";
 UsageCalculus.EqnSolArrayMap4[9] = "";
 UsageCalculus.EqnSolOrder[9] = 9;

 UsageCalculus.EqnSolArrayMap1[10] = "";
 UsageCalculus.EqnSolArrayDiffAlone[10] = "";
 UsageCalculus.EqnSolArrayMap2[10] = "";
 UsageCalculus.EqnSolArrayMap3[10] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[10] = "";
 UsageCalculus.EqnSolArrayMap4[10] = "";
 UsageCalculus.EqnSolOrder[10] = 10;

 UsageCalculus.EqnSolArrayMap1[11] = "";
 UsageCalculus.EqnSolArrayDiffAlone[11] = "";
 UsageCalculus.EqnSolArrayMap2[11] = "";
 UsageCalculus.EqnSolArrayMap3[11] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[11] = "";
 UsageCalculus.EqnSolArrayMap4[11] = "";
 UsageCalculus.EqnSolOrder[11] = 11;

 UsageCalculus.EqnSolArrayMap1[12] = "";
 UsageCalculus.EqnSolArrayDiffAlone[12] = "";
 UsageCalculus.EqnSolArrayMap2[12] = "";
 UsageCalculus.EqnSolArrayMap3[12] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[12] = "";
 UsageCalculus.EqnSolArrayMap4[12] = "";
 UsageCalculus.EqnSolOrder[12] = 12;

 UsageCalculus.EqnSolArrayMap1[13] = "";
 UsageCalculus.EqnSolArrayDiffAlone[13] = "";
 UsageCalculus.EqnSolArrayMap2[13] = "";
 UsageCalculus.EqnSolArrayMap3[13] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[13] = "";
 UsageCalculus.EqnSolArrayMap4[13] = "";
 UsageCalculus.EqnSolOrder[13] = 13;

 UsageCalculus.EqnSolArrayMap1[14] = "";
 UsageCalculus.EqnSolArrayDiffAlone[14] = "";
 UsageCalculus.EqnSolArrayMap2[14] = "";
 UsageCalculus.EqnSolArrayMap3[14] = "";
 UsageCalculus.EqnSolArrayIntegrAlone[14] = "";
 UsageCalculus.EqnSolArrayMap4[14] = "";
 UsageCalculus.EqnSolOrder[14] = 14;

}

public static void TestCaseDiff121324() {
 UsageCalculus.TestCase = 121324;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xyza/-1*xyza^2-1*x0^2*-2*x0^3*3*x02*xyza^3*3*xyza/1*xyza^2*--3*xyza^33*xyza1*x0^2*--3*x0^3-3*xyza^3*1*xyza/2*xyza^21*xyza/2*xyza^2*-3*xyza^3*-1*xyza2*x0^23*xyza^3*-1*xyza-1*xyza/2*xyza^2*-3*xyza2*x0^2*-3*x0*1*x0^2/-3*x03*xyza1*xyza^2/-3*xyza-3*xyza*-1*xyza^2*2*xyza1*xy012^2*2*xy012/3*xy012^2*-1*xy0122*xyza3*xyza/-1*xyza^2-1*x0^2*-2*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=323 EqnNumber=27 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[25, 27, 16, 17, 4, 2, 3, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 5, 3, 4, 9, 1, 2, 3, 4, 9, 1, 1, 7, 4, 9, 10, 11, 20]"+
"// DOEMatrixRow=[23, 29, 19, 2, 3, 1, 1, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 29, 8, 1, 2, 1, 2, 3, 1, 2, 3, 1, 4, 14, 1, 10, 7]"+
//Tail EqnIndex=323 EqnNumber=27 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[25, 27, 16, 17, 4, 2, 3, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 5, 3, 4, 9, 1, 2, 3, 4, 9, 1, 1, 7, 4, 9, 10, 11, 20]"+
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

public static void TestCaseDiff121325() {
 UsageCalculus.TestCase = 121325;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-1*x0^2*-2*x0^3*3*x02*x^3*3*x/1*x^2*--3*x^33*x1*x0^2*--3*x0^3-3*x^3*1*x/2*x^21*x/2*x^2*-3*x^3*-1*x2*x0^23*x^3*-1*x-1*x/2*x^2*-3*x2*x0^2*-3*x0*1*x0^2/-3*x03*x1*x^2/-3*x-3*x*-1*x^2*2*x1*xy012^2*2*xy012/3*xy012^2*-1*xy0122*x3*x^2*-1*x-1*x/2*x^2*-3*x^3-1*x0^2*-2*x0^32*x^3*3*x";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=324 EqnNumber=28 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[91, 28, 17, 18, 1, 3, 1, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 1, 1, 1, 10, 2, 3, 1, 1, 10, 2, 3, 8, 1, 10, 11, 12, 21]"+
"// DOEMatrixRow=[89, 30, 20, 3, 1, 2, 3, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 30, 9, 2, 3, 2, 3, 1, 2, 3, 1, 2, 1, 15, 2, 11, 8]"+
//Tail EqnIndex=324 EqnNumber=28 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[91, 28, 17, 18, 1, 3, 1, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 1, 1, 1, 10, 2, 3, 1, 1, 10, 2, 3, 8, 1, 10, 11, 12, 21]"+
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

public static void TestCaseDiff121326() {
 UsageCalculus.TestCase = 121326;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xy^3*3*xy/1*xy^2*--3*xy^33*xy1*x0^2*--3*x0^3-3*xy^3*1*xy/2*xy^21*xy/2*xy^2*-3*xy^3*-1*xy2*x0^23*xy^3*-1*xy-1*xy/2*xy^2*-3*xy2*x0^2*-3*x0*1*x0^2/-3*x03*xy1*xy^2/-3*xy-3*xy*-1*xy^2*2*xy1*xy012^2*2*xy012/3*xy012^2*-1*xy0122*xy3*xy^2*-1*xy-1*xy/2*xy^2*-3*xy^32*xy012^2*-3*xy012^3*1*xy012/-3*xy012^23*xy^32*xy^3*3*xy3*xy/1*xy^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=325 EqnNumber=29 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[56, 29, 18, 19, 2, 1, 2, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 2, 3, 11, 3, 1, 2, 3, 11, 3, 4, 9, 2, 11, 12, 13, 22]"+
"// DOEMatrixRow=[54, 31, 1, 4, 2, 3, 1, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 31, 10, 3, 1, 3, 1, 2, 3, 4, 2, 3, 2, 16, 1, 12, 9]"+
//Tail EqnIndex=325 EqnNumber=29 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[56, 29, 18, 19, 2, 1, 2, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 2, 3, 11, 3, 1, 2, 3, 11, 3, 4, 9, 2, 11, 12, 13, 22]"+
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

public static void TestCaseDiff121327() {
 UsageCalculus.TestCase = 121327;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xyz1*x0^2*--3*x0^3-3*xyz^3*1*xyz/2*xyz^21*xyz/2*xyz^2*-3*xyz^3*-1*xyz2*x0^23*xyz^3*-1*xyz-1*xyz/2*xyz^2*-3*xyz2*x0^2*-3*x0*1*x0^2/-3*x03*xyz1*xyz^2/-3*xyz-3*xyz*-1*xyz^2*2*xyz1*xy012^2*2*xy012/3*xy012^2*-1*xy0122*xyz3*xyz^2*-1*xyz-1*xyz/2*xyz^2*-3*xyz^32*xy012^2*-3*xy012^3*1*xy012/-3*xy012^23*xyz^31*xyz/-3*xyz^2-3*x0^2*-1*x0^3*2*x03*xyz/1*xyz^21*x0^2*--3*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=326 EqnNumber=30 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[20, 30, 19, 20, 3, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 3, 1, 1, 4, 3, 4, 12, 1, 2, 3, 4, 12, 1, 1, 10, 3, 12, 13, 14, 23]"+
"// DOEMatrixRow=[18, 32, 2, 1, 3, 1, 2, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 32, 1, 1, 2, 4, 2, 3, 4, 1, 3, 1, 3, 1, 2, 13, 10]"+
//Tail EqnIndex=326 EqnNumber=30 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[20, 30, 19, 20, 3, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 3, 1, 1, 4, 3, 4, 12, 1, 2, 3, 4, 12, 1, 1, 10, 3, 12, 13, 14, 23]"+
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

public static void TestCaseDiff121328() {
 UsageCalculus.TestCase = 121328;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x0^2*--3*x0^3-3*xyza^3*1*xyza/2*xyza^21*xyza/2*xyza^2*-3*xyza^3*-1*xyza2*x0^23*xyza^3*-1*xyza-1*xyza/2*xyza^2*-3*xyza2*x0^2*-3*x0*1*x0^2/-3*x03*xyza1*xyza^2/-3*xyza-3*xyza*-1*xyza^2*2*xyza1*xy012^2*2*xy012/3*xy012^2*-1*xy0122*xyza3*xyza^2*-1*xyza-1*xyza/2*xyza^2*-3*xyza^32*xy012^2*-3*xy012^3*1*xy012/-3*xy012^23*xyza^31*xyza/-3*xyza^2-3*x0^2*-1*x0^3*2*x01*xyza^3*2*xyza/3*xyza^2*--1*xyza^32*xyza1*x0^2*--3*x0^3-3*xyza^3*1*xyza";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=327 EqnNumber=31 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[86, 31, 20, 1, 4, 3, 1, 3, 1, 3, 4, 1, 1, 2, 3, 1, 2, 1, 5, 1, 1, 13, 2, 3, 1, 1, 13, 2, 3, 11, 4, 13, 14, 15, 24]"+
"// DOEMatrixRow=[84, 33, 3, 2, 1, 2, 3, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 33, 2, 3, 1, 5, 3, 1, 5, 2, 1, 2, 4, 2, 1, 14, 11]"+
//Tail EqnIndex=327 EqnNumber=31 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[86, 31, 20, 1, 4, 3, 1, 3, 1, 3, 4, 1, 1, 2, 3, 1, 2, 1, 5, 1, 1, 13, 2, 3, 1, 1, 13, 2, 3, 11, 4, 13, 14, 15, 24]"+
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

public static void TestCaseDiff121329() {
 UsageCalculus.TestCase = 121329;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*x^3*1*x/2*x^2-3*x^3*1*x1*x/2*x^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=328 EqnNumber=32 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[51, 32, 1, 2, 1, 1, 2, 4, 2, 4, 1, 2, 3, 1, 4, 2, 3, 2, 1, 2, 3, 14, 3, 1, 2, 3, 14, 3, 4, 12, 1, 14, 15, 16, 25]"+
"// DOEMatrixRow=[49, 34, 4, 3, 2, 3, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 34, 3, 1, 2, 1, 1, 2, 6, 3, 2, 3, 1, 3, 2, 15, 12]"+
//Tail EqnIndex=328 EqnNumber=32 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[51, 32, 1, 2, 1, 1, 2, 4, 2, 4, 1, 2, 3, 1, 4, 2, 3, 2, 1, 2, 3, 14, 3, 1, 2, 3, 14, 3, 4, 12, 1, 14, 15, 16, 25]"+
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

public static void TestCaseDiff121330() {
 UsageCalculus.TestCase = 121330;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xy/2*xy^2*-3*xy^3*-1*xy2*x0^21*xy/2*xy^22*x0^2*-3*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=329 EqnNumber=33 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[15, 33, 2, 3, 2, 3, 1, 5, 3, 1, 2, 1, 1, 2, 1, 3, 1, 1, 2, 3, 4, 15, 1, 2, 3, 4, 15, 1, 1, 13, 2, 15, 16, 17, 26]"+
"// DOEMatrixRow=[13, 35, 5, 4, 3, 1, 2, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 35, 4, 2, 3, 2, 3, 1, 1, 4, 3, 1, 2, 4, 1, 16, 13]"+
//Tail EqnIndex=329 EqnNumber=33 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[15, 33, 2, 3, 2, 3, 1, 5, 3, 1, 2, 1, 1, 2, 1, 3, 1, 1, 2, 3, 4, 15, 1, 2, 3, 4, 15, 1, 1, 13, 2, 15, 16, 17, 26]"+
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

public static void TestCaseDiff121331() {
 UsageCalculus.TestCase = 121331;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*x0^23*xyz^3*-1*xyz-1*xyz/2*xyz^2*-3*xyz2*x0^2*-3*x0^33*xyz^3*-1*xyz";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=330 EqnNumber=34 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[81, 34, 3, 4, 3, 1, 2, 6, 1, 2, 3, 2, 3, 1, 2, 1, 2, 1, 3, 1, 1, 16, 2, 3, 1, 1, 16, 2, 3, 14, 3, 16, 1, 18, 27]"+
"// DOEMatrixRow=[79, 36, 6, 1, 1, 2, 3, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 36, 5, 3, 1, 3, 1, 2, 3, 1, 1, 2, 3, 5, 2, 17, 14]"+
//Tail EqnIndex=330 EqnNumber=34 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[81, 34, 3, 4, 3, 1, 2, 6, 1, 2, 3, 2, 3, 1, 2, 1, 2, 1, 3, 1, 1, 16, 2, 3, 1, 1, 16, 2, 3, 14, 3, 16, 1, 18, 27]"+
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

public static void TestCaseDiff121332() {
 UsageCalculus.TestCase = 121332;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xyza^3*-1*xyza-1*xyza/2*xyza^2*-3*xyza2*x0^2*-3*x0*1*x0^2/-3*x03*xyza3*xyza^3*-1*xyza-1*xyza/2*xyza^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=331 EqnNumber=35 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[46, 35, 4, 5, 4, 2, 3, 7, 2, 3, 4, 1, 1, 2, 3, 2, 3, 2, 4, 2, 3, 1, 3, 1, 2, 3, 1, 3, 4, 15, 4, 17, 2, 19, 28]"+
"// DOEMatrixRow=[44, 37, 7, 2, 3, 1, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 37, 6, 1, 2, 4, 2, 3, 4, 2, 3, 1, 4, 6, 1, 18, 15]"+
//Tail EqnIndex=331 EqnNumber=35 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[46, 35, 4, 5, 4, 2, 3, 7, 2, 3, 4, 1, 1, 2, 3, 2, 3, 2, 4, 2, 3, 1, 3, 1, 2, 3, 1, 3, 4, 15, 4, 17, 2, 19, 28]"+
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

public static void TestCaseDiff121333() {
 UsageCalculus.TestCase = 121333;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-1*x/2*x^2*-3*x2*x0^2*-3*x0*1*x0^2/-3*x03*x1*x^2/-3*x-3*x*-1*x^2*2*x-1*x/2*x^22*x0^2*-3*x0";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=332 EqnNumber=36 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[10, 36, 5, 6, 1, 3, 1, 8, 3, 4, 1, 2, 3, 1, 4, 3, 1, 1, 5, 3, 4, 2, 1, 2, 3, 4, 2, 1, 1, 16, 1, 18, 3, 20, 29]"+
"// DOEMatrixRow=[8, 38, 8, 3, 1, 2, 3, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 38, 7, 2, 3, 5, 3, 1, 5, 3, 1, 2, 1, 7, 2, 19, 16]"+
//Tail EqnIndex=332 EqnNumber=36 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[10, 36, 5, 6, 1, 3, 1, 8, 3, 4, 1, 2, 3, 1, 4, 3, 1, 1, 5, 3, 4, 2, 1, 2, 3, 4, 2, 1, 1, 16, 1, 18, 3, 20, 29]"+
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

public static void TestCaseDiff121334() {
 UsageCalculus.TestCase = 121334;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*x0^2*-3*x0*1*x0^2/-3*x03*xy1*xy^2/-3*xy-3*xy*-1*xy^2*2*xy1*xy012^2*2*xy012/3*xy012^2*-1*xy0122*xy2*x0^2*-3*x03*xy*1*xy^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=333 EqnNumber=37 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[76, 37, 6, 7, 2, 1, 2, 9, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 3, 2, 3, 1, 1, 3, 2, 3, 1, 2, 19, 4, 21, 30]"+
"// DOEMatrixRow=[73, 39, 9, 4, 2, 3, 1, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 39, 8, 3, 1, 1, 1, 2, 6, 4, 2, 3, 2, 8, 1, 20, 17]"+
//Tail EqnIndex=333 EqnNumber=37 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[76, 37, 6, 7, 2, 1, 2, 9, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 3, 2, 3, 1, 1, 3, 2, 3, 1, 2, 19, 4, 21, 30]"+
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

public static void TestCaseDiff121335() {
 UsageCalculus.TestCase = 121335;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xyz1*xyz^2/-3*xyz-3*xyz*-1*xyz^2*2*xyz1*xy012^2*2*xy012/3*xy012^2*-1*xy0122*xyz3*xyz^2*-1*xyz-1*xyz/2*xyz^2*-3*xyz^33*xyz*1*xyz^21*xyz^2/-3*xyz";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=334 EqnNumber=38 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[41, 38, 7, 8, 3, 2, 3, 10, 2, 3, 4, 2, 3, 1, 2, 3, 1, 2, 3, 2, 3, 4, 3, 1, 2, 3, 4, 3, 4, 2, 3, 20, 5, 22, 31]"+
"// DOEMatrixRow=[39, 40, 10, 1, 3, 1, 2, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 40, 9, 1, 2, 3, 2, 3, 1, 1, 3, 1, 3, 9, 2, 1, 18]"+
//Tail EqnIndex=334 EqnNumber=38 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[41, 38, 7, 8, 3, 2, 3, 10, 2, 3, 4, 2, 3, 1, 2, 3, 1, 2, 3, 2, 3, 4, 3, 1, 2, 3, 4, 3, 4, 2, 3, 20, 5, 22, 31]"+
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

public static void TestCaseDiff121336() {
 UsageCalculus.TestCase = 121336;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xyza^2/-3*xyza-3*xyza*-1*xyza^2*2*xyza1*xy012^2*2*xy012/3*xy012^2*-1*xy0122*xyza3*xyza^2*-1*xyza-1*xyza/2*xyza^2*-3*xyza^32*xy012^2*-3*xy012^3*1*xy012/-3*xy012^23*xyza^31*xyza^2/-3*xyza-3*xyza*-1*xyza^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=335 EqnNumber=39 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[5, 39, 8, 9, 4, 3, 1, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 4, 3, 4, 5, 1, 2, 3, 4, 5, 1, 1, 3, 4, 21, 6, 23, 32]"+
"// DOEMatrixRow=[3, 41, 11, 2, 1, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 3, 1, 41, 10, 2, 3, 4, 3, 1, 2, 3, 1, 2, 4, 10, 1, 2, 19]"+
//Tail EqnIndex=335 EqnNumber=39 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[5, 39, 8, 9, 4, 3, 1, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 4, 3, 4, 5, 1, 2, 3, 4, 5, 1, 1, 3, 4, 21, 6, 23, 32]"+
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

public static void TestCaseDiff121337() {
 UsageCalculus.TestCase = 121337;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*x*-1*x^2*2*x1*xy012^2*2*xy012/3*xy012^2*-1*xy0122*x3*x^2*-1*x-1*x/2*x^2*-3*x^32*xy012^2*-3*xy012^3*1*xy012/-3*xy012^23*x^31*x/-3*x^2-3*x0^2*-1*x0^3*2*x0-3*x*-1*x^21*xy012^2*2*xy012";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=336 EqnNumber=40 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[70, 40, 9, 10, 1, 1, 2, 3, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 5, 1, 1, 6, 2, 3, 1, 1, 6, 2, 3, 4, 1, 22, 7, 24, 1]"+
"// DOEMatrixRow=[68, 42, 12, 3, 2, 3, 1, 3, 1, 3, 4, 1, 1, 2, 3, 1, 2, 42, 1, 3, 1, 5, 1, 2, 3, 4, 2, 3, 1, 11, 2, 3, 20]"+
//Tail EqnIndex=336 EqnNumber=40 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[70, 40, 9, 10, 1, 1, 2, 3, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 5, 1, 1, 6, 2, 3, 1, 1, 6, 2, 3, 4, 1, 22, 7, 24, 1]"+
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

public static void TestCaseDiff121338() {
 UsageCalculus.TestCase = 121338;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xy012^2*2*xy012/3*xy012^2*-1*xy0122*xy3*xy^2*-1*xy-1*xy/2*xy^2*-3*xy^32*xy012^2*-3*xy012^3*1*xy012/-3*xy012^23*xy^31*xy/-3*xy^2-3*x0^2*-1*x0^3*2*x01*xy^3*2*xy/3*xy^2*--1*xy^32*xy1*xy012^2*2*xy0122*xy/3*xy^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=337 EqnNumber=41 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[36, 41, 10, 11, 2, 3, 1, 4, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 1, 2, 3, 7, 3, 1, 2, 3, 7, 3, 4, 5, 2, 23, 8, 25, 2]"+
"// DOEMatrixRow=[34, 43, 13, 4, 3, 1, 2, 4, 2, 4, 1, 2, 3, 1, 4, 2, 3, 43, 2, 1, 2, 1, 2, 3, 4, 1, 3, 1, 2, 12, 1, 4, 1]"+
//Tail EqnIndex=337 EqnNumber=41 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[36, 41, 10, 11, 2, 3, 1, 4, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 1, 2, 3, 7, 3, 1, 2, 3, 7, 3, 4, 5, 2, 23, 8, 25, 2]"+
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

public static void TestCaseDiff121339() {
 UsageCalculus.TestCase = 121339;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xyz3*xyz^2*-1*xyz-1*xyz/2*xyz^2*-3*xyz^32*xy012^2*-3*xy012^3*1*xy012/-3*xy012^23*xyz^31*xyz/-3*xyz^2-3*x0^2*-1*x0^3*2*x01*xyz^3*2*xyz/3*xyz^2*--1*xyz^32*xyz3*x0^2*--1*x0^3-1*xyz^3*2*xyz/3*xyz^22*xyz/3*xyz^23*xyz^2*-1*xyz";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=338 EqnNumber=42 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[1, 42, 11, 12, 3, 1, 2, 5, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 2, 3, 4, 8, 1, 2, 3, 4, 8, 1, 1, 6, 3, 24, 9, 26, 3]"+
"// DOEMatrixRow=[99, 44, 14, 1, 1, 2, 3, 5, 3, 1, 2, 1, 1, 2, 1, 3, 1, 44, 3, 2, 3, 2, 3, 1, 5, 2, 1, 2, 3, 13, 2, 5, 2]"+
//Tail EqnIndex=338 EqnNumber=42 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[1, 42, 11, 12, 3, 1, 2, 5, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 2, 3, 4, 8, 1, 2, 3, 4, 8, 1, 1, 6, 3, 24, 9, 26, 3]"+
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

public static void TestCaseDiff121340() {
 UsageCalculus.TestCase = 121340;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xyza^2*-1*xyza-1*xyza/2*xyza^2*-3*xyza^32*xy012^2*-3*xy012^3*1*xy012/-3*xy012^23*xyza^31*xyza/-3*xyza^2-3*x0^2*-1*x0^3*2*x01*xyza^3*2*xyza/3*xyza^2*--1*xyza^32*xyza3*x0^2*--1*x0^3-1*xyza^3*2*xyza/3*xyza^22*xyza/3*xyza^2*-1*xyza^3*-3*xyza3*x0^23*xyza^2*-1*xyza-1*xyza/2*xyza^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=339 EqnNumber=43 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[65, 43, 12, 13, 4, 2, 3, 6, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 1, 1, 9, 2, 3, 1, 1, 9, 2, 3, 7, 4, 25, 10, 27, 4]"+
"// DOEMatrixRow=[63, 45, 15, 2, 3, 1, 1, 6, 1, 2, 3, 2, 3, 1, 2, 1, 2, 45, 4, 3, 1, 3, 1, 2, 6, 3, 2, 3, 4, 14, 1, 6, 3]"+
//Tail EqnIndex=339 EqnNumber=43 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[65, 43, 12, 13, 4, 2, 3, 6, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 1, 1, 9, 2, 3, 1, 1, 9, 2, 3, 7, 4, 25, 10, 27, 4]"+
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

public static void TestCaseDiff121341() {
 UsageCalculus.TestCase = 121341;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-1*x/2*x^2*-3*x^32*xy012^2*-3*xy012^3*1*xy012/-3*xy012^23*x^31*x/-3*x^2-3*x0^2*-1*x0^3*2*x01*x^3*2*x/3*x^2*--1*x^32*x3*x0^2*--1*x0^3-1*x^3*2*x/3*x^22*x/3*x^2*-1*x^3*-3*x3*x0^21*x^3*-3*x-3*x/1*x^2*-2*x^3-1*x/2*x^22*xy012^2*-3*xy012^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=340 EqnNumber=44 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[31, 44, 13, 14, 1, 3, 1, 7, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 2, 3, 10, 3, 1, 2, 3, 10, 3, 4, 8, 1, 26, 11, 28, 5]"+
"// DOEMatrixRow=[29, 46, 16, 3, 1, 2, 3, 7, 2, 3, 4, 1, 1, 2, 3, 2, 3, 46, 5, 1, 2, 4, 2, 3, 1, 4, 3, 1, 1, 15, 2, 7, 4]"+
//Tail EqnIndex=340 EqnNumber=44 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[31, 44, 13, 14, 1, 3, 1, 7, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 2, 3, 10, 3, 1, 2, 3, 10, 3, 4, 8, 1, 26, 11, 28, 5]"+
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

public static void TestCaseDiff121342() {
 UsageCalculus.TestCase = 121342;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xy012^2*-3*xy012^3*1*xy012/-3*xy012^23*xy^31*xy/-3*xy^2-3*x0^2*-1*x0^3*2*x01*xy^3*2*xy/3*xy^2*--1*xy^32*xy3*x0^2*--1*x0^3-1*xy^3*2*xy/3*xy^22*xy/3*xy^2*-1*xy^3*-3*xy3*x0^21*xy^3*-3*xy-3*xy/1*xy^2*-2*xy^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xy^32*xy012^2*-3*xy012^33*xy^3*1*xy";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=341 EqnNumber=45 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[96, 45, 14, 15, 2, 1, 2, 8, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 3, 4, 11, 1, 2, 3, 4, 11, 1, 1, 9, 2, 27, 12, 29, 6]"+
"// DOEMatrixRow=[94, 47, 17, 4, 2, 3, 1, 8, 3, 4, 1, 2, 3, 1, 4, 3, 1, 47, 6, 2, 3, 5, 3, 1, 2, 1, 1, 2, 3, 16, 1, 8, 5]"+
//Tail EqnIndex=341 EqnNumber=45 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[96, 45, 14, 15, 2, 1, 2, 8, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 3, 4, 11, 1, 2, 3, 4, 11, 1, 1, 9, 2, 27, 12, 29, 6]"+
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

public static void TestCaseDiff121343() {
 UsageCalculus.TestCase = 121343;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xyz^31*xyz/-3*xyz^2-3*x0^2*-1*x0^3*2*x01*xyz^3*2*xyz/3*xyz^2*--1*xyz^32*xyz3*x0^2*--1*x0^3-1*xyz^3*2*xyz/3*xyz^22*xyz/3*xyz^2*-1*xyz^3*-3*xyz3*x0^21*xyz^3*-3*xyz-3*xyz/1*xyz^2*-2*xyz^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyz^33*xyz/-1*xyz^2-1*x0^2*-2*x0^3*3*x03*xyz^3*1*xyz1*xyz/-3*xyz^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=342 EqnNumber=46 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[60, 46, 15, 16, 3, 2, 3, 9, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 1, 1, 12, 2, 3, 1, 1, 12, 2, 3, 10, 3, 28, 13, 30, 7]"+
"// DOEMatrixRow=[58, 48, 18, 1, 3, 1, 2, 9, 1, 1, 2, 1, 1, 2, 1, 1, 2, 48, 7, 3, 1, 1, 1, 2, 3, 2, 3, 1, 4, 1, 2, 9, 6]"+
//Tail EqnIndex=342 EqnNumber=46 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[60, 46, 15, 16, 3, 2, 3, 9, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 1, 1, 12, 2, 3, 1, 1, 12, 2, 3, 10, 3, 28, 13, 30, 7]"+
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

public static void TestCaseDiff121344() {
 UsageCalculus.TestCase = 121344;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xyza/-3*xyza^2-3*x0^2*-1*x0^3*2*x01*xyza^3*2*xyza/3*xyza^2*--1*xyza^32*xyza3*x0^2*--1*x0^3-1*xyza^3*2*xyza/3*xyza^22*xyza/3*xyza^2*-1*xyza^3*-3*xyza3*x0^21*xyza^3*-3*xyza-3*xyza/1*xyza^2*-2*xyza^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyza^33*xyza/-1*xyza^2-1*x0^2*-2*x0^3*3*x02*xyza^3*3*xyza/1*xyza^2*--3*xyza^33*xyza1*xyza/-3*xyza^2-3*x0^2*-1*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=343 EqnNumber=47 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[26, 47, 16, 17, 4, 3, 1, 10, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 2, 13, 3, 1, 2, 3, 13, 3, 4, 11, 4, 29, 14, 31, 8]"+
"// DOEMatrixRow=[24, 49, 19, 2, 1, 2, 3, 10, 2, 3, 4, 2, 3, 1, 2, 3, 1, 49, 8, 1, 2, 3, 2, 3, 4, 3, 1, 2, 1, 2, 1, 10, 7]"+
//Tail EqnIndex=343 EqnNumber=47 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[26, 47, 16, 17, 4, 3, 1, 10, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 2, 13, 3, 1, 2, 3, 13, 3, 4, 11, 4, 29, 14, 31, 8]"+
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

public static void TestCaseDiff121345() {
 UsageCalculus.TestCase = 121345;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*x0^2*-1*x0^3*2*x01*x^3*2*x/3*x^2*--1*x^32*x3*x0^2*--1*x0^3-1*x^3*2*x/3*x^22*x/3*x^2*-1*x^3*-3*x3*x0^21*x^3*-3*x-3*x/1*x^2*-2*x^31*x0^2*-2*x0^3*3*x0/-1*x0^22*x^33*x/-1*x^2-1*x0^2*-2*x0^3*3*x02*x^3*3*x/1*x^2*--3*x^33*x1*x0^2*--3*x0^3-3*x^3*1*x/2*x^2-3*x0^2*-1*x0^31*x^3*2*x";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=344 EqnNumber=48 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[91, 48, 17, 18, 1, 1, 2, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 3, 14, 1, 2, 3, 4, 14, 1, 1, 12, 1, 30, 15, 32, 9]"+
"// DOEMatrixRow=[89, 50, 20, 3, 2, 3, 1, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 50, 9, 2, 3, 4, 3, 1, 5, 4, 2, 3, 2, 3, 2, 11, 8]"+
//Tail EqnIndex=344 EqnNumber=48 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[91, 48, 17, 18, 1, 1, 2, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 3, 14, 1, 2, 3, 4, 14, 1, 1, 12, 1, 30, 15, 32, 9]"+
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

public static void TestCaseDiff121346() {
 UsageCalculus.TestCase = 121346;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xy^3*2*xy/3*xy^2*--1*xy^32*xy3*x0^2*--1*x0^3-1*xy^3*2*xy/3*xy^22*xy/3*xy^2*-1*xy^3*-3*xy3*x0^21*xy^3*-3*xy-3*xy/1*xy^2*-2*xy^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xy^33*xy/-1*xy^2-1*x0^2*-2*x0^3*3*x02*xy^3*3*xy/1*xy^2*--3*xy^33*xy1*x0^2*--3*x0^3-3*xy^3*1*xy/2*xy^21*xy/2*xy^2*-3*xy*-1*xy^22*x0^21*xy^3*2*xy2*xy/3*xy^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=345 EqnNumber=49 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[55, 49, 18, 19, 2, 3, 1, 2, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 4, 15, 2, 3, 1, 1, 15, 2, 3, 13, 2, 31, 16, 1, 10]"+
"// DOEMatrixRow=[53, 51, 1, 4, 3, 1, 2, 3, 1, 1, 2, 1, 2, 3, 4, 2, 3, 1, 10, 3, 1, 5, 1, 2, 6, 1, 3, 1, 3, 4, 1, 12, 9]"+
//Tail EqnIndex=345 EqnNumber=49 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[55, 49, 18, 19, 2, 3, 1, 2, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 4, 15, 2, 3, 1, 1, 15, 2, 3, 13, 2, 31, 16, 1, 10]"+
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

public static void TestCaseDiff121347() {
 UsageCalculus.TestCase = 121347;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xyz3*x0^2*--1*x0^3-1*xyz^3*2*xyz/3*xyz^22*xyz/3*xyz^2*-1*xyz^3*-3*xyz3*x0^21*xyz^3*-3*xyz-3*xyz/1*xyz^2*-2*xyz^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyz^33*xyz/-1*xyz^2-1*x0^2*-2*x0^3*3*x02*xyz^3*3*xyz/1*xyz^2*--3*xyz^33*xyz1*x0^2*--3*x0^3-3*xyz^3*1*xyz/2*xyz^21*xyz/2*xyz^2*-3*xyz*-1*xyz^22*x0^23*xyz*-1*xyz^2-1*xyz^2/2*xyz*-3*xyz^22*xyz/3*xyz^23*x0^2*--1*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=346 EqnNumber=50 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[21, 50, 19, 20, 3, 1, 2, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 5, 3, 1, 16, 3, 1, 2, 3, 16, 3, 4, 14, 3, 32, 1, 2, 11]"+
"// DOEMatrixRow=[18, 52, 2, 1, 1, 2, 3, 4, 2, 3, 4, 2, 3, 1, 1, 3, 1, 2, 1, 1, 2, 1, 2, 3, 1, 2, 1, 2, 4, 5, 2, 13, 10]"+
//Tail EqnIndex=346 EqnNumber=50 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[21, 50, 19, 20, 3, 1, 2, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 5, 3, 1, 16, 3, 1, 2, 3, 16, 3, 4, 14, 3, 32, 1, 2, 11]"+
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

public static void TestCaseDiff121348() {
 UsageCalculus.TestCase = 121348;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*x0^2*--1*x0^3-1*xyza^3*2*xyza/3*xyza^22*xyza/3*xyza^2*-1*xyza^3*-3*xyza3*x0^21*xyza^3*-3*xyza-3*xyza/1*xyza^2*-2*xyza^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyza^33*xyza/-1*xyza^2-1*x0^2*-2*x0^3*3*x02*xyza^3*3*xyza/1*xyza^2*--3*xyza^33*xyza1*x0^2*--3*x0^3-3*xyza^3*1*xyza/2*xyza^21*xyza/2*xyza^2*-3*xyza*-1*xyza^22*x0^23*xyza*-1*xyza^2-1*xyza^2/2*xyza*-3*xyza^22*xyza*-3*xyza^2*1*xyza/-3*xyza^23*xy012^23*x0^2*--1*x0^3-1*xyza^3*2*xyza";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=347 EqnNumber=51 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[86, 51, 20, 1, 4, 2, 3, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 1, 1, 2, 1, 1, 2, 3, 4, 1, 1, 1, 15, 4, 1, 2, 3, 12]"+
"// DOEMatrixRow=[84, 53, 3, 2, 3, 1, 1, 5, 3, 4, 1, 1, 1, 2, 3, 1, 2, 3, 2, 3, 1, 2, 3, 1, 2, 3, 2, 3, 1, 6, 1, 14, 11]"+
//Tail EqnIndex=347 EqnNumber=51 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[86, 51, 20, 1, 4, 2, 3, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 1, 1, 2, 1, 1, 2, 3, 4, 1, 1, 1, 15, 4, 1, 2, 3, 12]"+
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

public static void TestCaseDiff121349() {
 UsageCalculus.TestCase = 121349;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-1*x^3*2*x/3*x^2-1*x^3*2*x2*x/3*x^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=348 EqnNumber=52 FamilyID=1 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[50, 52, 1, 2, 1, 3, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 1, 2, 3, 2, 16, 1, 2, 3, 4, 13]"+
"// DOEMatrixRow=[48, 54, 4, 3, 1, 2, 3, 6, 1, 1, 2, 1, 2, 3, 4, 2, 3, 4, 3, 1, 2, 3, 1, 2, 3, 4, 3, 1, 2, 7, 2, 15, 12]"+
//Tail EqnIndex=348 EqnNumber=52 FamilyID=1 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[50, 52, 1, 2, 1, 3, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 1, 2, 3, 2, 16, 1, 2, 3, 4, 13]"+
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

public static void TestCaseDiff121350() {
 UsageCalculus.TestCase = 121350;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xy/3*xy^2*-1*xy^3*-3*xy3*x0^22*xy/3*xy^23*x0^2*-1*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=349 EqnNumber=53 FamilyID=3 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[15, 53, 2, 3, 2, 1, 2, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 3, 4, 3, 1, 2, 3, 2, 3, 1, 3, 1, 2, 3, 4, 5, 14]"+
"// DOEMatrixRow=[13, 55, 5, 4, 2, 3, 1, 7, 2, 3, 4, 2, 3, 1, 1, 3, 1, 5, 4, 2, 3, 4, 2, 3, 4, 1, 1, 2, 3, 8, 1, 16, 13]"+
//Tail EqnIndex=349 EqnNumber=53 FamilyID=3 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[15, 53, 2, 3, 2, 1, 2, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 3, 4, 3, 1, 2, 3, 2, 3, 1, 3, 1, 2, 3, 4, 5, 14]"+
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

public static void TestCaseDiff121351() {
 UsageCalculus.TestCase = 121351;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*x0^21*xyz^3*-3*xyz-3*xyz/1*xyz^2*-2*xyz^33*x0^2*-1*x0^31*xyz^3*-3*xyz";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=350 EqnNumber=54 FamilyID=1 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[81, 54, 3, 4, 3, 2, 3, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 1, 1, 4, 2, 3, 1, 3, 4, 2, 4, 2, 3, 4, 5, 6, 15]"+
"// DOEMatrixRow=[79, 56, 6, 1, 3, 1, 2, 8, 3, 4, 1, 1, 1, 2, 3, 1, 2, 6, 5, 3, 1, 5, 3, 1, 5, 2, 3, 1, 4, 9, 2, 17, 14]"+
//Tail EqnIndex=350 EqnNumber=54 FamilyID=1 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[81, 54, 3, 4, 3, 2, 3, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 1, 1, 4, 2, 3, 1, 3, 4, 2, 4, 2, 3, 4, 5, 6, 15]"+
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

public static void TestCaseDiff121352() {
 UsageCalculus.TestCase = 121352;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xyza^3*-3*xyza-3*xyza/1*xyza^2*-2*xyza^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyza^31*xyza^3*-3*xyza-3*xyza/1*xyza^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=351 EqnNumber=55 FamilyID=2 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[45, 55, 4, 5, 4, 3, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 2, 3, 5, 3, 1, 2, 4, 5, 3, 1, 3, 4, 5, 6, 7, 16]"+
"// DOEMatrixRow=[43, 57, 7, 2, 1, 2, 3, 9, 1, 1, 2, 1, 2, 3, 4, 2, 3, 7, 6, 1, 2, 1, 1, 2, 6, 3, 1, 2, 1, 10, 1, 18, 15]"+
//Tail EqnIndex=351 EqnNumber=55 FamilyID=2 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[45, 55, 4, 5, 4, 3, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 2, 3, 5, 3, 1, 2, 4, 5, 3, 1, 3, 4, 5, 6, 7, 16]"+
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

public static void TestCaseDiff121353() {
 UsageCalculus.TestCase = 121353;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*x/1*x^2*-2*x^31*x0^2*-2*x0^3*3*x0/-1*x0^22*x^33*x/-1*x^2-1*x0^2*-2*x0^3*3*x0-3*x/1*x^21*x0^2*-2*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=352 EqnNumber=56 FamilyID=3 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[10, 56, 5, 6, 1, 1, 2, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 4, 6, 1, 2, 3, 1, 6, 1, 2, 4, 1, 6, 7, 8, 17]"+
"// DOEMatrixRow=[8, 58, 8, 3, 2, 3, 1, 10, 2, 3, 4, 2, 3, 1, 1, 3, 1, 8, 7, 2, 3, 2, 3, 1, 1, 4, 2, 3, 2, 11, 2, 19, 16]"+
//Tail EqnIndex=352 EqnNumber=56 FamilyID=3 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[10, 56, 5, 6, 1, 1, 2, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 4, 6, 1, 2, 3, 1, 6, 1, 2, 4, 1, 6, 7, 8, 17]"+
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

public static void TestCaseDiff121354() {
 UsageCalculus.TestCase = 121354;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x0^2*-2*x0^3*3*x0/-1*x0^22*xy^33*xy/-1*xy^2-1*x0^2*-2*x0^3*3*x02*xy^3*3*xy/1*xy^2*--3*xy^33*xy1*x0^2*-2*x0^32*xy^3*3*xy";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=353 EqnNumber=57 FamilyID=1 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[76, 57, 6, 7, 2, 3, 1, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 1, 7, 2, 3, 1, 2, 7, 2, 3, 5, 2, 7, 8, 9, 18]"+
"// DOEMatrixRow=[74, 59, 9, 4, 3, 1, 2, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 9, 8, 3, 1, 3, 1, 2, 3, 1, 3, 1, 3, 12, 1, 20, 17]"+
//Tail EqnIndex=353 EqnNumber=57 FamilyID=1 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[76, 57, 6, 7, 2, 3, 1, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 1, 7, 2, 3, 1, 2, 7, 2, 3, 5, 2, 7, 8, 9, 18]"+
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

public static void TestCaseDiff121355() {
 UsageCalculus.TestCase = 121355;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xyz^33*xyz/-1*xyz^2-1*x0^2*-2*x0^3*3*x02*xyz^3*3*xyz/1*xyz^2*--3*xyz^33*xyz1*x0^2*--3*x0^3-3*xyz^3*1*xyz/2*xyz^22*xyz^3*3*xyz3*xyz/-1*xyz^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=354 EqnNumber=58 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[40, 58, 7, 8, 3, 1, 2, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 3, 8, 3, 1, 2, 3, 8, 3, 4, 6, 3, 8, 9, 10, 19]"+
"// DOEMatrixRow=[38, 60, 10, 1, 1, 2, 3, 2, 1, 1, 2, 1, 2, 3, 4, 2, 3, 10, 9, 1, 2, 4, 2, 3, 4, 2, 1, 2, 4, 13, 2, 1, 18]"+
//Tail EqnIndex=354 EqnNumber=58 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[40, 58, 7, 8, 3, 1, 2, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 3, 8, 3, 1, 2, 3, 8, 3, 4, 6, 3, 8, 9, 10, 19]"+
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

public static void TestCaseDiff121356() {
 UsageCalculus.TestCase = 121356;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xyza/-1*xyza^2-1*x0^2*-2*x0^3*3*x02*xyza^3*3*xyza/1*xyza^2*--3*xyza^33*xyza1*x0^2*--3*x0^3-3*xyza^3*1*xyza/2*xyza^21*xyza/2*xyza^2*-3*xyza*-1*xyza^22*x0^23*xyza/-1*xyza^2-1*x0^2*-2*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=355 EqnNumber=59 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[5, 59, 8, 9, 4, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 3, 1, 1, 5, 3, 4, 9, 1, 2, 3, 4, 9, 1, 1, 7, 4, 9, 10, 11, 20]"+
"// DOEMatrixRow=[3, 61, 11, 2, 3, 1, 1, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 11, 10, 2, 3, 5, 3, 1, 5, 3, 2, 3, 1, 14, 1, 2, 19]"+
//Tail EqnIndex=355 EqnNumber=59 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[5, 59, 8, 9, 4, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 3, 1, 1, 5, 3, 4, 9, 1, 2, 3, 4, 9, 1, 1, 7, 4, 9, 10, 11, 20]"+
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

public static void TestCaseDiff121357() {
 UsageCalculus.TestCase = 121357;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-1*x0^2*-2*x0^3*3*x02*x^3*3*x/1*x^2*--3*x^33*x1*x0^2*--3*x0^3-3*x^3*1*x/2*x^21*x/2*x^2*-3*x*-1*x^22*x0^23*x*-1*x^2-1*x^2/2*x*-3*x^2-1*x0^2*-2*x0^32*x^3*3*x";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=356 EqnNumber=60 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[71, 60, 9, 10, 1, 3, 1, 3, 1, 3, 4, 1, 1, 2, 3, 1, 2, 1, 1, 1, 1, 10, 2, 3, 1, 1, 10, 2, 3, 8, 1, 10, 11, 12, 21]"+
"// DOEMatrixRow=[69, 62, 12, 3, 1, 2, 3, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 12, 1, 3, 1, 1, 1, 2, 6, 4, 3, 1, 2, 15, 2, 3, 20]"+
//Tail EqnIndex=356 EqnNumber=60 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[71, 60, 9, 10, 1, 3, 1, 3, 1, 3, 4, 1, 1, 2, 3, 1, 2, 1, 1, 1, 1, 10, 2, 3, 1, 1, 10, 2, 3, 8, 1, 10, 11, 12, 21]"+
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

public static void TestCaseDiff121358() {
 UsageCalculus.TestCase = 121358;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xy^3*3*xy/1*xy^2*--3*xy^33*xy1*x0^2*--3*x0^3-3*xy^3*1*xy/2*xy^21*xy/2*xy^2*-3*xy*-1*xy^22*x0^23*xy*-1*xy^2-1*xy^2/2*xy*-3*xy^22*xy*-3*xy^2*1*xy/-3*xy^23*xy012^22*xy^3*3*xy3*xy/1*xy^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=357 EqnNumber=61 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[35, 61, 10, 11, 2, 1, 2, 4, 2, 4, 1, 2, 3, 1, 4, 2, 3, 2, 3, 2, 3, 11, 3, 1, 2, 3, 11, 3, 4, 9, 2, 11, 12, 13, 22]"+
"// DOEMatrixRow=[33, 63, 13, 4, 2, 3, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 13, 2, 1, 2, 3, 2, 3, 1, 1, 1, 2, 3, 16, 1, 4, 1]"+
//Tail EqnIndex=357 EqnNumber=61 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[35, 61, 10, 11, 2, 1, 2, 4, 2, 4, 1, 2, 3, 1, 4, 2, 3, 2, 3, 2, 3, 11, 3, 1, 2, 3, 11, 3, 4, 9, 2, 11, 12, 13, 22]"+
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

public static void TestCaseDiff121359() {
 UsageCalculus.TestCase = 121359;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xyz1*x0^2*--3*x0^3-3*xyz^3*1*xyz/2*xyz^21*xyz/2*xyz^2*-3*xyz*-1*xyz^22*x0^23*xyz*-1*xyz^2-1*xyz^2/2*xyz*-3*xyz^22*xyz*-3*xyz^2*1*xyz/-3*xyz^23*xy012^21*xyz/-3*xyz^2-3*xyz^2*1*xyz/2*xyz^23*xyz/1*xyz^21*x0^2*--3*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=358 EqnNumber=62 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[1, 62, 11, 12, 3, 2, 3, 5, 3, 1, 2, 1, 1, 2, 1, 3, 1, 1, 4, 3, 4, 12, 1, 2, 3, 4, 12, 1, 1, 10, 3, 12, 13, 14, 23]"+
"// DOEMatrixRow=[98, 64, 14, 1, 3, 1, 2, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 14, 3, 2, 3, 4, 3, 1, 2, 3, 2, 3, 4, 1, 2, 5, 2]"+
//Tail EqnIndex=358 EqnNumber=62 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[1, 62, 11, 12, 3, 2, 3, 5, 3, 1, 2, 1, 1, 2, 1, 3, 1, 1, 4, 3, 4, 12, 1, 2, 3, 4, 12, 1, 1, 10, 3, 12, 13, 14, 23]"+
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

public static void TestCaseDiff121360() {
 UsageCalculus.TestCase = 121360;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x0^2*--3*x0^3-3*xyza^3*1*xyza/2*xyza^21*xyza/2*xyza^2*-3*xyza*-1*xyza^22*x0^23*xyza*-1*xyza^2-1*xyza^2/2*xyza*-3*xyza^22*xyza*-3*xyza^2*1*xyza/-3*xyza^23*xy012^21*xyza/-3*xyza^2-3*xyza^2*1*xyza/2*xyza^21*xyza/2*xyza^2*-3*xyza^3*-1*xyza2*xy012^21*x0^2*--3*x0^3-3*xyza^3*1*xyza";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=359 EqnNumber=63 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[66, 63, 12, 13, 4, 3, 1, 6, 1, 2, 3, 2, 3, 1, 2, 1, 2, 1, 5, 1, 1, 13, 2, 3, 1, 1, 13, 2, 3, 11, 4, 13, 14, 15, 24]"+
"// DOEMatrixRow=[64, 65, 15, 2, 1, 2, 3, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 15, 4, 3, 1, 5, 1, 2, 3, 4, 3, 1, 1, 2, 1, 6, 3]"+
//Tail EqnIndex=359 EqnNumber=63 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[66, 63, 12, 13, 4, 3, 1, 6, 1, 2, 3, 2, 3, 1, 2, 1, 2, 1, 5, 1, 1, 13, 2, 3, 1, 1, 13, 2, 3, 11, 4, 13, 14, 15, 24]"+
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

public static void TestCaseDiff121361() {
 UsageCalculus.TestCase = 121361;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*x^3*1*x/2*x^21*x/2*x^2*-3*x*-1*x^22*x0^23*x*-1*x^2-1*x^2/2*x*-3*x^22*x*-3*x^2*1*x/-3*x^23*xy012^21*x/-3*x^2-3*x^2*1*x/2*x^21*x/2*x^2*-3*x^3*-1*x2*xy012^23*x^3*-1*x-1*x/2*x^2*-3*x^3-3*x^3*1*x1*x/2*x^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=360 EqnNumber=64 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[30, 64, 13, 14, 1, 1, 2, 7, 2, 3, 4, 1, 1, 2, 3, 2, 3, 2, 1, 2, 3, 14, 3, 1, 2, 3, 14, 3, 4, 12, 1, 14, 15, 16, 25]"+
"// DOEMatrixRow=[28, 66, 16, 3, 2, 3, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 16, 5, 1, 2, 1, 2, 3, 4, 1, 1, 2, 3, 4, 2, 7, 4]"+
//Tail EqnIndex=360 EqnNumber=64 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[30, 64, 13, 14, 1, 1, 2, 7, 2, 3, 4, 1, 1, 2, 3, 2, 3, 2, 1, 2, 3, 14, 3, 1, 2, 3, 14, 3, 4, 12, 1, 14, 15, 16, 25]"+
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

public static void TestCaseDiff121362() {
 UsageCalculus.TestCase = 121362;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xy/2*xy^2*-3*xy*-1*xy^22*x0^23*xy*-1*xy^2-1*xy^2/2*xy*-3*xy^22*xy*-3*xy^2*1*xy/-3*xy^23*xy012^21*xy/-3*xy^2-3*xy^2*1*xy/2*xy^21*xy/2*xy^2*-3*xy^3*-1*xy2*xy012^23*xy^3*-1*xy-1*xy/2*xy^2*-3*xy^32*x0^2*-3*x0^3*1*x0/-3*x0^23*xy^31*xy/2*xy^22*x0^2*-3*x0";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=361 EqnNumber=65 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[95, 65, 14, 15, 2, 3, 1, 8, 3, 4, 1, 2, 3, 1, 4, 3, 1, 1, 2, 3, 4, 15, 1, 2, 3, 4, 15, 1, 1, 13, 2, 15, 16, 17, 26]"+
"// DOEMatrixRow=[93, 67, 17, 4, 3, 1, 2, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 17, 6, 2, 3, 2, 3, 1, 5, 2, 3, 1, 4, 5, 1, 8, 5]"+
//Tail EqnIndex=361 EqnNumber=65 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[95, 65, 14, 15, 2, 3, 1, 8, 3, 4, 1, 2, 3, 1, 4, 3, 1, 1, 2, 3, 4, 15, 1, 2, 3, 4, 15, 1, 1, 13, 2, 15, 16, 17, 26]"+
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

public static void TestCaseDiff121363() {
 UsageCalculus.TestCase = 121363;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*x0^23*xyz*-1*xyz^2-1*xyz^2/2*xyz*-3*xyz^22*xyz*-3*xyz^2*1*xyz/-3*xyz^23*xy012^21*xyz/-3*xyz^2-3*xyz^2*1*xyz/2*xyz^21*xyz/2*xyz^2*-3*xyz^3*-1*xyz2*xy012^23*xyz^3*-1*xyz-1*xyz/2*xyz^2*-3*xyz^32*x0^2*-3*x0^3*1*x0/-3*x0^23*xyz^31*xyz/-3*xyz^2-3*x0^2*-1*x0^3*2*x02*x0^2*-3*x03*xyz*-1*xyz^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=362 EqnNumber=66 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[61, 66, 15, 16, 3, 1, 2, 9, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 3, 1, 1, 16, 2, 3, 1, 1, 16, 2, 3, 14, 3, 16, 1, 18, 27]"+
"// DOEMatrixRow=[59, 68, 18, 1, 1, 2, 3, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 18, 7, 3, 1, 3, 1, 2, 6, 3, 1, 2, 1, 6, 2, 9, 6]"+
//Tail EqnIndex=362 EqnNumber=66 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[61, 66, 15, 16, 3, 1, 2, 9, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 3, 1, 1, 16, 2, 3, 1, 1, 16, 2, 3, 14, 3, 16, 1, 18, 27]"+
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

public static void TestCaseDiff121364() {
 UsageCalculus.TestCase = 121364;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xyza*-1*xyza^2-1*xyza^2/2*xyza*-3*xyza^22*xyza*-3*xyza^2*1*xyza/-3*xyza^23*xy012^21*xyza/-3*xyza^2-3*xyza^2*1*xyza/2*xyza^21*xyza/2*xyza^2*-3*xyza^3*-1*xyza2*xy012^23*xyza^3*-1*xyza-1*xyza/2*xyza^2*-3*xyza^32*x0^2*-3*x0^3*1*x0/-3*x0^23*xyza^31*xyza/-3*xyza^2-3*x0^2*-1*x0^3*2*x01*xyza^3*2*xyza/3*xyza^2*--1*xyza^32*xyza3*xyza*-1*xyza^2-1*xyza^2/2*xyza";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=363 EqnNumber=67 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[25, 67, 16, 17, 4, 2, 3, 10, 2, 3, 4, 2, 3, 1, 2, 3, 1, 2, 4, 2, 3, 1, 3, 1, 2, 3, 1, 3, 4, 15, 4, 17, 2, 19, 28]"+
"// DOEMatrixRow=[23, 69, 19, 2, 3, 1, 1, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 19, 8, 1, 2, 4, 2, 3, 1, 4, 2, 3, 2, 7, 1, 10, 7]"+
//Tail EqnIndex=363 EqnNumber=67 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[25, 67, 16, 17, 4, 2, 3, 10, 2, 3, 4, 2, 3, 1, 2, 3, 1, 2, 4, 2, 3, 1, 3, 1, 2, 3, 1, 3, 4, 15, 4, 17, 2, 19, 28]"+
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

public static void TestCaseDiff121365() {
 UsageCalculus.TestCase = 121365;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-1*x^2/2*x*-3*x^22*x*-3*x^2*1*x/-3*x^23*xy012^21*x/-3*x^2-3*x^2*1*x/2*x^21*x/2*x^2*-3*x^3*-1*x2*xy012^23*x^3*-1*x-1*x/2*x^2*-3*x^32*x0^2*-3*x0^3*1*x0/-3*x0^23*x^31*x/-3*x^2-3*x0^2*-1*x0^3*2*x01*x^3*2*x/3*x^2*--1*x^32*x3*x0^2*--1*x0^3-1*x^3*2*x/3*x^2-1*x^2/2*x2*x*-3*x^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=364 EqnNumber=68 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[90, 68, 17, 18, 1, 3, 1, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 3, 4, 2, 1, 2, 3, 4, 2, 1, 1, 16, 1, 18, 3, 20, 29]"+
"// DOEMatrixRow=[88, 70, 20, 3, 1, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 3, 1, 20, 9, 2, 3, 5, 3, 1, 2, 1, 3, 1, 3, 8, 2, 11, 8]"+
//Tail EqnIndex=364 EqnNumber=68 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[90, 68, 17, 18, 1, 3, 1, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 3, 4, 2, 1, 2, 3, 4, 2, 1, 1, 16, 1, 18, 3, 20, 29]"+
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

public static void TestCaseDiff121366() {
 UsageCalculus.TestCase = 121366;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xy*-3*xy^2*1*xy/-3*xy^23*xy012^21*xy/-3*xy^2-3*xy^2*1*xy/2*xy^21*xy/2*xy^2*-3*xy^3*-1*xy2*xy012^23*xy^3*-1*xy-1*xy/2*xy^2*-3*xy^32*x0^2*-3*x0^3*1*x0/-3*x0^23*xy^31*xy/-3*xy^2-3*x0^2*-1*x0^3*2*x01*xy^3*2*xy/3*xy^2*--1*xy^32*xy3*x0^2*--1*x0^3-1*xy^3*2*xy/3*xy^22*xy/3*xy^2*-1*xy^3*-3*xy3*x0^22*xy*-3*xy^23*xy012^2*1*xy012";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=365 EqnNumber=69 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[56, 69, 18, 19, 2, 1, 2, 3, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 1, 1, 3, 2, 3, 1, 1, 3, 2, 3, 1, 2, 19, 4, 21, 30]"+
"// DOEMatrixRow=[54, 71, 1, 4, 2, 3, 1, 3, 1, 3, 4, 1, 1, 2, 3, 1, 2, 21, 10, 3, 1, 1, 1, 2, 3, 2, 1, 2, 4, 9, 1, 12, 9]"+
//Tail EqnIndex=365 EqnNumber=69 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[56, 69, 18, 19, 2, 1, 2, 3, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 1, 1, 3, 2, 3, 1, 1, 3, 2, 3, 1, 2, 19, 4, 21, 30]"+
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

public static void TestCaseDiff121367() {
 UsageCalculus.TestCase = 121367;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xy012^21*xyz/-3*xyz^2-3*xyz^2*1*xyz/2*xyz^21*xyz/2*xyz^2*-3*xyz^3*-1*xyz2*xy012^23*xyz^3*-1*xyz-1*xyz/2*xyz^2*-3*xyz^32*x0^2*-3*x0^3*1*x0/-3*x0^23*xyz^31*xyz/-3*xyz^2-3*x0^2*-1*x0^3*2*x01*xyz^3*2*xyz/3*xyz^2*--1*xyz^32*xyz3*x0^2*--1*x0^3-1*xyz^3*2*xyz/3*xyz^22*xyz/3*xyz^2*-1*xyz^3*-3*xyz3*x0^21*xyz^3*-3*xyz-3*xyz/1*xyz^2*-2*xyz^33*xy012^2*1*xy0121*xyz/-3*xyz^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=366 EqnNumber=70 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[20, 70, 19, 20, 3, 2, 3, 4, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 2, 4, 3, 1, 2, 3, 4, 3, 4, 2, 3, 20, 5, 22, 31]"+
"// DOEMatrixRow=[18, 72, 2, 1, 3, 1, 2, 4, 2, 4, 1, 2, 3, 1, 4, 2, 3, 22, 1, 1, 2, 3, 2, 3, 4, 3, 2, 3, 1, 10, 2, 13, 10]"+
//Tail EqnIndex=366 EqnNumber=70 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[20, 70, 19, 20, 3, 2, 3, 4, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 2, 4, 3, 1, 2, 3, 4, 3, 4, 2, 3, 20, 5, 22, 31]"+
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

public static void TestCaseDiff121368() {
 UsageCalculus.TestCase = 121368;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xyza/-3*xyza^2-3*xyza^2*1*xyza/2*xyza^21*xyza/2*xyza^2*-3*xyza^3*-1*xyza2*xy012^23*xyza^3*-1*xyza-1*xyza/2*xyza^2*-3*xyza^32*x0^2*-3*x0^3*1*x0/-3*x0^23*xyza^31*xyza/-3*xyza^2-3*x0^2*-1*x0^3*2*x01*xyza^3*2*xyza/3*xyza^2*--1*xyza^32*xyza3*x0^2*--1*x0^3-1*xyza^3*2*xyza/3*xyza^22*xyza/3*xyza^2*-1*xyza^3*-3*xyza3*x0^21*xyza^3*-3*xyza-3*xyza/1*xyza^2*-2*xyza^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyza^31*xyza/-3*xyza^2-3*xyza^2*1*xyza";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=367 EqnNumber=71 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[85, 71, 20, 1, 4, 3, 1, 5, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 3, 5, 1, 2, 3, 4, 5, 1, 1, 3, 4, 21, 6, 23, 32]"+
"// DOEMatrixRow=[83, 73, 3, 2, 1, 2, 3, 5, 3, 1, 2, 1, 1, 2, 1, 3, 1, 23, 2, 3, 1, 4, 3, 1, 5, 4, 3, 1, 2, 11, 1, 14, 11]"+
//Tail EqnIndex=367 EqnNumber=71 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[85, 71, 20, 1, 4, 3, 1, 5, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 3, 5, 1, 2, 3, 4, 5, 1, 1, 3, 4, 21, 6, 23, 32]"+
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

public static void TestCaseDiff121369() {
 UsageCalculus.TestCase = 121369;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*x^2*1*x/2*x^2-3*x^2*1*x1*x/2*x^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=368 EqnNumber=72 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[51, 72, 1, 2, 1, 1, 2, 6, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 4, 6, 2, 3, 1, 1, 6, 2, 3, 4, 1, 22, 7, 24, 1]"+
"// DOEMatrixRow=[49, 74, 4, 3, 2, 3, 1, 6, 1, 2, 3, 2, 3, 1, 2, 1, 2, 24, 3, 1, 2, 5, 1, 2, 6, 1, 1, 2, 3, 12, 2, 15, 12]"+
//Tail EqnIndex=368 EqnNumber=72 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[51, 72, 1, 2, 1, 1, 2, 6, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 4, 6, 2, 3, 1, 1, 6, 2, 3, 4, 1, 22, 7, 24, 1]"+
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

public static void TestCaseDiff121370() {
 UsageCalculus.TestCase = 121370;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xy/2*xy^2*-3*xy^3*-1*xy2*xy012^21*xy/2*xy^22*xy012^2*-3*xy012^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=369 EqnNumber=73 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[15, 73, 2, 3, 2, 3, 1, 7, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 5, 3, 1, 7, 3, 1, 2, 3, 7, 3, 4, 5, 2, 23, 8, 25, 2]"+
"// DOEMatrixRow=[13, 75, 5, 4, 3, 1, 2, 7, 2, 3, 4, 1, 1, 2, 3, 2, 3, 25, 4, 2, 3, 1, 2, 3, 1, 2, 3, 1, 4, 13, 1, 16, 13]"+
//Tail EqnIndex=369 EqnNumber=73 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[15, 73, 2, 3, 2, 3, 1, 7, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 5, 3, 1, 7, 3, 1, 2, 3, 7, 3, 4, 5, 2, 23, 8, 25, 2]"+
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

public static void TestCaseDiff121371() {
 UsageCalculus.TestCase = 121371;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xy012^23*xyz^3*-1*xyz-1*xyz/2*xyz^2*-3*xyz^32*xy012^2*-3*xy012^33*xyz^3*-1*xyz";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=370 EqnNumber=74 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[80, 74, 3, 4, 3, 1, 2, 8, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 1, 1, 2, 8, 1, 2, 3, 4, 8, 1, 1, 6, 3, 24, 9, 26, 3]"+
"// DOEMatrixRow=[78, 76, 6, 1, 1, 2, 3, 8, 3, 4, 1, 2, 3, 1, 4, 3, 1, 26, 5, 3, 1, 2, 3, 1, 2, 3, 1, 2, 1, 14, 2, 17, 14]"+
//Tail EqnIndex=370 EqnNumber=74 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[80, 74, 3, 4, 3, 1, 2, 8, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 1, 1, 2, 8, 1, 2, 3, 4, 8, 1, 1, 6, 3, 24, 9, 26, 3]"+
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

public static void TestCaseDiff121372() {
 UsageCalculus.TestCase = 121372;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xyza^3*-1*xyza-1*xyza/2*xyza^2*-3*xyza^32*x0^2*-3*x0^3*1*x0/-3*x0^23*xyza^33*xyza^3*-1*xyza-1*xyza/2*xyza^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=371 EqnNumber=75 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[46, 75, 4, 5, 4, 2, 3, 9, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 2, 3, 9, 2, 3, 1, 1, 9, 2, 3, 7, 4, 25, 10, 27, 4]"+
"// DOEMatrixRow=[43, 77, 7, 2, 3, 1, 1, 9, 1, 1, 2, 1, 1, 2, 1, 1, 2, 27, 6, 1, 2, 3, 1, 2, 3, 4, 2, 3, 2, 15, 1, 18, 15]"+
//Tail EqnIndex=371 EqnNumber=75 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[46, 75, 4, 5, 4, 2, 3, 9, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 2, 3, 9, 2, 3, 1, 1, 9, 2, 3, 7, 4, 25, 10, 27, 4]"+
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

public static void TestCaseDiff121373() {
 UsageCalculus.TestCase = 121373;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-1*x/2*x^2*-3*x^32*x0^2*-3*x0^3*1*x0/-3*x0^23*x^31*x/-3*x^2-3*x0^2*-1*x0^3*2*x0-1*x/2*x^22*x0^2*-3*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=372 EqnNumber=76 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[10, 76, 5, 6, 1, 3, 1, 10, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 3, 4, 10, 3, 1, 2, 3, 10, 3, 4, 8, 1, 26, 11, 28, 5]"+
"// DOEMatrixRow=[8, 78, 8, 3, 1, 2, 3, 10, 2, 3, 4, 2, 3, 1, 2, 3, 1, 28, 7, 2, 3, 4, 2, 3, 4, 1, 3, 1, 3, 16, 2, 19, 16]"+
//Tail EqnIndex=372 EqnNumber=76 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[10, 76, 5, 6, 1, 3, 1, 10, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 3, 4, 10, 3, 1, 2, 3, 10, 3, 4, 8, 1, 26, 11, 28, 5]"+
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

public static void TestCaseDiff121374() {
 UsageCalculus.TestCase = 121374;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*x0^2*-3*x0^3*1*x0/-3*x0^23*xy^31*xy/-3*xy^2-3*x0^2*-1*x0^3*2*x01*xy^3*2*xy/3*xy^2*--1*xy^32*xy2*x0^2*-3*x0^33*xy^3*1*xy";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=373 EqnNumber=77 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[75, 77, 6, 7, 2, 1, 2, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 1, 1, 11, 1, 2, 3, 4, 11, 1, 1, 9, 2, 27, 12, 29, 6]"+
"// DOEMatrixRow=[73, 79, 9, 4, 2, 3, 1, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 29, 8, 3, 1, 5, 3, 1, 5, 2, 1, 2, 4, 1, 1, 20, 17]"+
//Tail EqnIndex=373 EqnNumber=77 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[75, 77, 6, 7, 2, 1, 2, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 1, 1, 11, 1, 2, 3, 4, 11, 1, 1, 9, 2, 27, 12, 29, 6]"+
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

public static void TestCaseDiff121375() {
 UsageCalculus.TestCase = 121375;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xyz^31*xyz/-3*xyz^2-3*x0^2*-1*x0^3*2*x01*xyz^3*2*xyz/3*xyz^2*--1*xyz^32*xyz3*x0^2*--1*x0^3-1*xyz^3*2*xyz/3*xyz^23*xyz^3*1*xyz1*xyz/-3*xyz^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=374 EqnNumber=78 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[40, 78, 7, 8, 3, 2, 3, 2, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 2, 3, 12, 2, 3, 1, 1, 12, 2, 3, 10, 3, 28, 13, 30, 7]"+
"// DOEMatrixRow=[38, 80, 10, 1, 3, 1, 2, 3, 1, 1, 2, 1, 2, 3, 4, 2, 3, 30, 9, 1, 2, 1, 1, 2, 6, 3, 2, 3, 1, 2, 1, 1, 18]"+
//Tail EqnIndex=374 EqnNumber=78 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[40, 78, 7, 8, 3, 2, 3, 2, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 2, 3, 12, 2, 3, 1, 1, 12, 2, 3, 10, 3, 28, 13, 30, 7]"+
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

public static void TestCaseDiff121376() {
 UsageCalculus.TestCase = 121376;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xyza/-3*xyza^2-3*x0^2*-1*x0^3*2*x01*xyza^3*2*xyza/3*xyza^2*--1*xyza^32*xyza3*x0^2*--1*x0^3-1*xyza^3*2*xyza/3*xyza^22*xyza/3*xyza^2*-1*xyza^3*-3*xyza3*x0^21*xyza/-3*xyza^2-3*x0^2*-1*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=375 EqnNumber=79 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[5, 79, 8, 9, 4, 3, 1, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 4, 13, 3, 1, 2, 3, 13, 3, 4, 11, 4, 29, 14, 31, 8]"+
"// DOEMatrixRow=[3, 81, 11, 2, 1, 2, 3, 4, 2, 3, 4, 2, 3, 1, 1, 3, 1, 31, 10, 2, 3, 2, 3, 1, 1, 4, 3, 1, 2, 3, 2, 3, 19]"+
//Tail EqnIndex=375 EqnNumber=79 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[5, 79, 8, 9, 4, 3, 1, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 4, 13, 3, 1, 2, 3, 13, 3, 4, 11, 4, 29, 14, 31, 8]"+
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

public static void TestCaseDiff121377() {
 UsageCalculus.TestCase = 121377;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*x0^2*-1*x0^3*2*x01*x^3*2*x/3*x^2*--1*x^32*x3*x0^2*--1*x0^3-1*x^3*2*x/3*x^22*x/3*x^2*-1*x^3*-3*x3*x0^21*x^3*-3*x-3*x/1*x^2*-2*x^3-3*x0^2*-1*x0^31*x^3*2*x";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=376 EqnNumber=80 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[70, 80, 9, 10, 1, 1, 2, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 1, 14, 1, 2, 3, 4, 14, 1, 1, 12, 1, 30, 15, 32, 9]"+
"// DOEMatrixRow=[68, 82, 12, 3, 2, 3, 1, 5, 3, 4, 1, 1, 1, 2, 3, 1, 2, 32, 1, 3, 1, 3, 1, 2, 3, 1, 1, 2, 3, 4, 1, 4, 20]"+
//Tail EqnIndex=376 EqnNumber=80 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[70, 80, 9, 10, 1, 1, 2, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 1, 14, 1, 2, 3, 4, 14, 1, 1, 12, 1, 30, 15, 32, 9]"+
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

public static void TestCaseDiff121378() {
 UsageCalculus.TestCase = 121378;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xy^3*2*xy/3*xy^2*--1*xy^32*xy3*x0^2*--1*x0^3-1*xy^3*2*xy/3*xy^22*xy/3*xy^2*-1*xy^3*-3*xy3*x0^21*xy^3*-3*xy-3*xy/1*xy^2*-2*xy^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xy^31*xy^3*2*xy2*xy/3*xy^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=377 EqnNumber=81 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[35, 81, 10, 11, 2, 3, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 3, 15, 2, 3, 1, 1, 15, 2, 3, 13, 2, 31, 16, 1, 10]"+
"// DOEMatrixRow=[33, 83, 13, 4, 3, 1, 2, 6, 1, 1, 2, 1, 2, 3, 4, 2, 3, 33, 2, 1, 2, 4, 2, 3, 4, 2, 3, 1, 4, 5, 2, 5, 1]"+
//Tail EqnIndex=377 EqnNumber=81 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[35, 81, 10, 11, 2, 3, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 3, 15, 2, 3, 1, 1, 15, 2, 3, 13, 2, 31, 16, 1, 10]"+
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

public static void TestCaseDiff121379() {
 UsageCalculus.TestCase = 121379;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xyz3*x0^2*--1*x0^3-1*xyz^3*2*xyz/3*xyz^22*xyz/3*xyz^2*-1*xyz^3*-3*xyz3*x0^21*xyz^3*-3*xyz-3*xyz/1*xyz^2*-2*xyz^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyz^33*xyz/-1*xyz^2-1*x0^2*-2*x0^3*3*x02*xyz/3*xyz^23*x0^2*--1*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=378 EqnNumber=82 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[1, 82, 11, 12, 3, 1, 2, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 5, 3, 4, 16, 3, 1, 2, 3, 16, 3, 4, 14, 3, 32, 1, 2, 11]"+
"// DOEMatrixRow=[99, 84, 14, 1, 1, 2, 3, 7, 2, 3, 4, 2, 3, 1, 1, 3, 1, 34, 3, 2, 3, 5, 3, 1, 5, 3, 1, 2, 1, 6, 1, 6, 2]"+
//Tail EqnIndex=378 EqnNumber=82 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[1, 82, 11, 12, 3, 1, 2, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 5, 3, 4, 16, 3, 1, 2, 3, 16, 3, 4, 14, 3, 32, 1, 2, 11]"+
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

public static void TestCaseDiff121380() {
 UsageCalculus.TestCase = 121380;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*x0^2*--1*x0^3-1*xyza^3*2*xyza/3*xyza^22*xyza/3*xyza^2*-1*xyza^3*-3*xyza3*x0^21*xyza^3*-3*xyza-3*xyza/1*xyza^2*-2*xyza^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyza^33*xyza/-1*xyza^2-1*x0^2*-2*x0^3*3*x02*xyza^3*3*xyza/1*xyza^2*--3*xyza^33*xyza3*x0^2*--1*x0^3-1*xyza^3*2*xyza";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=379 EqnNumber=83 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[65, 83, 12, 13, 4, 2, 3, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 1, 1, 1, 1, 1, 2, 3, 4, 1, 1, 1, 15, 4, 1, 2, 3, 12]"+
"// DOEMatrixRow=[63, 85, 15, 2, 3, 1, 1, 8, 3, 4, 1, 1, 1, 2, 3, 1, 2, 35, 4, 3, 1, 1, 1, 2, 6, 4, 2, 3, 2, 7, 2, 7, 3]"+
//Tail EqnIndex=379 EqnNumber=83 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[65, 83, 12, 13, 4, 2, 3, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 1, 1, 1, 1, 1, 2, 3, 4, 1, 1, 1, 15, 4, 1, 2, 3, 12]"+
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

public static void TestCaseDiff121381() {
 UsageCalculus.TestCase = 121381;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-1*x^3*2*x/3*x^22*x/3*x^2*-1*x^3*-3*x3*x0^21*x^3*-3*x-3*x/1*x^2*-2*x^31*x0^2*-2*x0^3*3*x0/-1*x0^22*x^33*x/-1*x^2-1*x0^2*-2*x0^3*3*x02*x^3*3*x/1*x^2*--3*x^33*x1*x0^2*--3*x0^3-3*x^3*1*x/2*x^2-1*x^3*2*x2*x/3*x^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=380 EqnNumber=84 FamilyID=1 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[30, 84, 13, 14, 1, 3, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 1, 2, 3, 2, 16, 1, 2, 3, 4, 13]"+
"// DOEMatrixRow=[28, 86, 16, 3, 1, 2, 3, 9, 1, 1, 2, 1, 2, 3, 4, 2, 3, 36, 5, 1, 2, 3, 2, 3, 1, 1, 3, 1, 3, 8, 1, 8, 4]"+
//Tail EqnIndex=380 EqnNumber=84 FamilyID=1 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[30, 84, 13, 14, 1, 3, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 2, 3, 2, 3, 1, 1, 1, 2, 3, 2, 16, 1, 2, 3, 4, 13]"+
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

public static void TestCaseDiff121382() {
 UsageCalculus.TestCase = 121382;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xy/3*xy^2*-1*xy^3*-3*xy3*x0^21*xy^3*-3*xy-3*xy/1*xy^2*-2*xy^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xy^33*xy/-1*xy^2-1*x0^2*-2*x0^3*3*x02*xy^3*3*xy/1*xy^2*--3*xy^33*xy1*x0^2*--3*x0^3-3*xy^3*1*xy/2*xy^21*xy/2*xy^2*-3*xy^3*-1*xy2*x0^22*xy/3*xy^23*x0^2*-1*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=381 EqnNumber=85 FamilyID=3 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[96, 85, 14, 15, 2, 1, 2, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 3, 4, 3, 1, 2, 3, 2, 3, 1, 3, 1, 2, 3, 4, 5, 14]"+
"// DOEMatrixRow=[94, 87, 17, 4, 2, 3, 1, 10, 2, 3, 4, 2, 3, 1, 1, 3, 1, 37, 6, 2, 3, 4, 3, 1, 2, 3, 1, 2, 4, 9, 2, 9, 5]"+
//Tail EqnIndex=381 EqnNumber=85 FamilyID=3 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[96, 85, 14, 15, 2, 1, 2, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 3, 4, 3, 1, 2, 3, 2, 3, 1, 3, 1, 2, 3, 4, 5, 14]"+
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

public static void TestCaseDiff121383() {
 UsageCalculus.TestCase = 121383;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*x0^21*xyz^3*-3*xyz-3*xyz/1*xyz^2*-2*xyz^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyz^33*xyz/-1*xyz^2-1*x0^2*-2*x0^3*3*x02*xyz^3*3*xyz/1*xyz^2*--3*xyz^33*xyz1*x0^2*--3*x0^3-3*xyz^3*1*xyz/2*xyz^21*xyz/2*xyz^2*-3*xyz^3*-1*xyz2*x0^22*xyz^3*-3*xyz-3*xyz/1*xyz^2*-2*xyz^33*x0^2*-1*x0^31*xyz^3*-3*xyz";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=382 EqnNumber=86 FamilyID=1 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[60, 86, 15, 16, 3, 2, 3, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 1, 1, 4, 2, 3, 1, 3, 4, 2, 4, 2, 3, 4, 5, 6, 15]"+
"// DOEMatrixRow=[58, 88, 18, 1, 3, 1, 2, 1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 38, 7, 3, 1, 5, 1, 2, 3, 4, 2, 3, 1, 10, 1, 10, 6]"+
//Tail EqnIndex=382 EqnNumber=86 FamilyID=1 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[60, 86, 15, 16, 3, 2, 3, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 1, 1, 4, 2, 3, 1, 3, 4, 2, 4, 2, 3, 4, 5, 6, 15]"+
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

public static void TestCaseDiff121384() {
 UsageCalculus.TestCase = 121384;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xyza^3*-3*xyza-3*xyza/1*xyza^2*-2*xyza^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyza^33*xyza/-1*xyza^2-1*x0^2*-2*x0^3*3*x02*xyza^3*3*xyza/1*xyza^2*--3*xyza^33*xyza1*x0^2*--3*x0^3-3*xyza^3*1*xyza/2*xyza^21*xyza/2*xyza^2*-3*xyza^3*-1*xyza2*x0^22*xyza^3*-3*xyza-3*xyza/1*xyza^2*-2*xyza^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyza^31*xyza^3*-3*xyza-3*xyza/1*xyza^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=383 EqnNumber=87 FamilyID=2 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[25, 87, 16, 17, 4, 3, 1, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 2, 3, 5, 3, 1, 2, 4, 5, 3, 1, 3, 4, 5, 6, 7, 16]"+
"// DOEMatrixRow=[22, 89, 19, 2, 1, 2, 3, 2, 1, 1, 2, 1, 2, 3, 4, 2, 3, 39, 8, 1, 2, 1, 2, 3, 4, 1, 3, 1, 2, 11, 2, 11, 7]"+
//Tail EqnIndex=383 EqnNumber=87 FamilyID=2 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[25, 87, 16, 17, 4, 3, 1, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 2, 3, 5, 3, 1, 2, 4, 5, 3, 1, 3, 4, 5, 6, 7, 16]"+
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

public static void TestCaseDiff121385() {
 UsageCalculus.TestCase = 121385;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*x/1*x^2*-2*x^31*x0^2*-2*x0^3*3*x0/-1*x0^22*x^33*x/-1*x^2-1*x0^2*-2*x0^3*3*x02*x^3*3*x/1*x^2*--3*x^33*x1*x0^2*--3*x0^3-3*x^3*1*x/2*x^21*x/2*x^2*-3*x^3*-1*x2*x0^22*x^3*-3*x-3*x/1*x^2*-2*x^31*x0^2*-2*x0^3*3*x0/-1*x0^22*x^33*x/-1*x^2-1*x0^2*-2*x0^3*3*x0-3*x/1*x^21*x0^2*-2*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=384 EqnNumber=88 FamilyID=3 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[91, 88, 17, 18, 1, 1, 2, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 4, 6, 1, 2, 3, 1, 6, 1, 2, 4, 1, 6, 7, 8, 17]"+
"// DOEMatrixRow=[89, 90, 20, 3, 2, 3, 1, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 40, 9, 2, 3, 2, 3, 1, 5, 2, 1, 2, 3, 12, 1, 12, 8]"+
//Tail EqnIndex=384 EqnNumber=88 FamilyID=3 MotifTag=1 Entropy=2 FuncWrapAliasID=1"+
"// MetaRow=[91, 88, 17, 18, 1, 1, 2, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 2, 3, 4, 6, 1, 2, 3, 1, 6, 1, 2, 4, 1, 6, 7, 8, 17]"+
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

public static void TestCaseDiff121386() {
 UsageCalculus.TestCase = 121386;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x0^2*-2*x0^3*3*x0/-1*x0^22*xy^33*xy/-1*xy^2-1*x0^2*-2*x0^3*3*x02*xy^3*3*xy/1*xy^2*--3*xy^33*xy1*x0^2*--3*x0^3-3*xy^3*1*xy/2*xy^21*xy/2*xy^2*-3*xy^3*-1*xy2*x0^22*xy^3*-3*xy-3*xy/1*xy^2*-2*xy^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xy^33*xy/-1*xy^2-1*x0^2*-2*x0^3*3*x02*xy^3*3*xy/1*xy^2*--3*xy^33*xy1*x0^2*-2*x0^32*xy^3*3*xy";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=385 EqnNumber=89 FamilyID=1 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[55, 89, 18, 19, 2, 3, 1, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 1, 7, 2, 3, 1, 2, 7, 2, 3, 5, 2, 7, 8, 9, 18]"+
"// DOEMatrixRow=[53, 91, 1, 4, 3, 1, 2, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 41, 10, 3, 1, 3, 1, 2, 6, 3, 2, 3, 4, 13, 2, 13, 9]"+
//Tail EqnIndex=385 EqnNumber=89 FamilyID=1 MotifTag=2 Entropy=3 FuncWrapAliasID=2"+
"// MetaRow=[55, 89, 18, 19, 2, 3, 1, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 3, 1, 1, 7, 2, 3, 1, 2, 7, 2, 3, 5, 2, 7, 8, 9, 18]"+
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

public static void TestCaseDiff121387() {
 UsageCalculus.TestCase = 121387;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xyz^33*xyz/-1*xyz^2-1*x0^2*-2*x0^3*3*x02*xyz^3*3*xyz/1*xyz^2*--3*xyz^33*xyz1*x0^2*--3*x0^3-3*xyz^3*1*xyz/2*xyz^21*xyz/2*xyz^2*-3*xyz^3*-1*xyz2*x0^22*xyz^3*-3*xyz-3*xyz/1*xyz^2*-2*xyz^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyz^33*xyz/-1*xyz^2-1*x0^2*-2*x0^3*3*x02*xyz^3*3*xyz/1*xyz^2*--3*xyz^33*xyz1*xyz^2*--3*xyz^3-3*xy012^3*1*xy012/2*xy012^22*xyz^3*3*xyz3*xyz/-1*xyz^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=386 EqnNumber=90 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[19, 90, 19, 20, 3, 1, 2, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 3, 8, 3, 1, 2, 3, 8, 3, 4, 6, 3, 8, 9, 10, 19]"+
"// DOEMatrixRow=[17, 92, 2, 1, 1, 2, 3, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 42, 1, 1, 2, 4, 2, 3, 1, 4, 3, 1, 1, 14, 1, 14, 10]"+
//Tail EqnIndex=386 EqnNumber=90 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[19, 90, 19, 20, 3, 1, 2, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 4, 2, 3, 8, 3, 1, 2, 3, 8, 3, 4, 6, 3, 8, 9, 10, 19]"+
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

public static void TestCaseDiff121388() {
 UsageCalculus.TestCase = 121388;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xyza/-1*xyza^2-1*x0^2*-2*x0^3*3*x02*xyza^3*3*xyza/1*xyza^2*--3*xyza^33*xyza1*x0^2*--3*x0^3-3*xyza^3*1*xyza/2*xyza^21*xyza/2*xyza^2*-3*xyza^3*-1*xyza2*x0^22*xyza^3*-3*xyza-3*xyza/1*xyza^2*-2*xyza^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyza^33*xyza/-1*xyza^2-1*x0^2*-2*x0^3*3*x02*xyza^3*3*xyza/1*xyza^2*--3*xyza^33*xyza1*xyza^2*--3*xyza^3-3*xy012^3*1*xy012/2*xy012^21*xyza/2*xyza^2*-3*xyza^3*-1*xyza2*xyza^23*xyza/-1*xyza^2-1*x0^2*-2*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=387 EqnNumber=91 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[86, 91, 20, 1, 4, 2, 3, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 5, 3, 4, 9, 1, 2, 3, 4, 9, 1, 1, 7, 4, 9, 10, 11, 20]"+
"// DOEMatrixRow=[84, 93, 3, 2, 3, 1, 1, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 43, 2, 3, 1, 5, 3, 1, 2, 1, 1, 2, 3, 15, 2, 15, 11]"+
//Tail EqnIndex=387 EqnNumber=91 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[86, 91, 20, 1, 4, 2, 3, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 5, 3, 4, 9, 1, 2, 3, 4, 9, 1, 1, 7, 4, 9, 10, 11, 20]"+
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

public static void TestCaseDiff121389() {
 UsageCalculus.TestCase = 121389;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-1*x0^2*-2*x0^3*3*x0-1*x0^2*-2*x0^32*x^3*3*x";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=388 EqnNumber=92 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[50, 92, 1, 2, 1, 3, 1, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 1, 1, 1, 10, 2, 3, 1, 1, 10, 2, 3, 8, 1, 10, 11, 12, 21]"+
"// DOEMatrixRow=[48, 94, 4, 3, 1, 2, 3, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 44, 3, 1, 2, 1, 1, 2, 3, 2, 3, 1, 4, 16, 1, 16, 12]"+
//Tail EqnIndex=388 EqnNumber=92 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[50, 92, 1, 2, 1, 3, 1, 7, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 1, 1, 1, 10, 2, 3, 1, 1, 10, 2, 3, 8, 1, 10, 11, 12, 21]"+
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

public static void TestCaseDiff121390() {
 UsageCalculus.TestCase = 121390;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xy^3*3*xy/1*xy^2*--3*xy^33*xy2*xy^3*3*xy3*xy/1*xy^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=389 EqnNumber=93 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[14, 93, 2, 3, 2, 1, 2, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 2, 3, 11, 3, 1, 2, 3, 11, 3, 4, 9, 2, 11, 12, 13, 22]"+
"// DOEMatrixRow=[12, 95, 5, 4, 2, 3, 1, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 45, 4, 2, 3, 2, 3, 1, 4, 3, 1, 2, 1, 1, 2, 17, 13]"+
//Tail EqnIndex=389 EqnNumber=93 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[14, 93, 2, 3, 2, 1, 2, 8, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 3, 2, 3, 11, 3, 1, 2, 3, 11, 3, 4, 9, 2, 11, 12, 13, 22]"+
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

public static void TestCaseDiff121391() {
 UsageCalculus.TestCase = 121391;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "3*xyz1*x0^2*--3*x0^3-3*xyz^3*1*xyz/2*xyz^23*xyz/1*xyz^21*x0^2*--3*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=390 EqnNumber=94 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[81, 94, 3, 4, 3, 2, 3, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 3, 4, 12, 1, 2, 3, 4, 12, 1, 1, 10, 3, 12, 13, 14, 23]"+
"// DOEMatrixRow=[79, 96, 6, 1, 3, 1, 2, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 46, 5, 3, 1, 3, 1, 2, 5, 4, 2, 3, 2, 3, 1, 18, 14]"+
//Tail EqnIndex=390 EqnNumber=94 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[81, 94, 3, 4, 3, 2, 3, 9, 2, 3, 4, 2, 3, 1, 1, 3, 1, 1, 4, 3, 4, 12, 1, 2, 3, 4, 12, 1, 1, 10, 3, 12, 13, 14, 23]"+
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

public static void TestCaseDiff121392() {
 UsageCalculus.TestCase = 121392;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*x0^2*--3*x0^3-3*xyza^3*1*xyza/2*xyza^21*xyza/2*xyza^2*-3*xyza^3*-1*xyza2*x0^21*x0^2*--3*x0^3-3*xyza^3*1*xyza";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=391 EqnNumber=95 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[45, 95, 4, 5, 4, 3, 1, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 1, 1, 13, 2, 3, 1, 1, 13, 2, 3, 11, 4, 13, 14, 15, 24]"+
"// DOEMatrixRow=[43, 97, 7, 2, 1, 2, 3, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 47, 6, 1, 2, 4, 2, 3, 6, 1, 3, 1, 3, 4, 2, 19, 15]"+
//Tail EqnIndex=391 EqnNumber=95 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[45, 95, 4, 5, 4, 3, 1, 10, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 5, 1, 1, 13, 2, 3, 1, 1, 13, 2, 3, 11, 4, 13, 14, 15, 24]"+
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

public static void TestCaseDiff121393() {
 UsageCalculus.TestCase = 121393;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*x^3*1*x/2*x^21*x/2*x^2*-3*x^3*-1*x2*x0^22*x^3*-3*x-3*x/1*x^2*-2*x^3-3*x^3*1*x1*x/2*x^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=392 EqnNumber=96 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[9, 96, 5, 6, 1, 1, 2, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 2, 3, 14, 3, 1, 2, 3, 14, 3, 4, 12, 1, 14, 15, 16, 25]"+
"// DOEMatrixRow=[7, 98, 8, 3, 2, 3, 1, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 48, 7, 2, 3, 5, 3, 1, 1, 2, 1, 2, 4, 5, 1, 20, 16]"+
//Tail EqnIndex=392 EqnNumber=96 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[9, 96, 5, 6, 1, 1, 2, 1, 1, 1, 2, 1, 2, 3, 4, 2, 3, 2, 1, 2, 3, 14, 3, 1, 2, 3, 14, 3, 4, 12, 1, 14, 15, 16, 25]"+
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

public static void TestCaseDiff121394() {
 UsageCalculus.TestCase = 121394;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xy/2*xy^2*-3*xy^3*-1*xy2*x0^22*xy^3*-3*xy-3*xy/1*xy^2*-2*xy^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xy^31*xy/2*xy^22*x0^2*-3*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=393 EqnNumber=97 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[76, 97, 6, 7, 2, 3, 1, 2, 3, 2, 3, 2, 3, 1, 1, 3, 1, 1, 2, 3, 4, 15, 1, 2, 3, 4, 15, 1, 1, 13, 2, 15, 16, 17, 26]"+
"// DOEMatrixRow=[74, 99, 9, 4, 3, 1, 2, 3, 2, 3, 4, 2, 3, 1, 1, 3, 1, 49, 8, 3, 1, 1, 1, 2, 3, 4, 2, 3, 1, 6, 2, 1, 17]"+
//Tail EqnIndex=393 EqnNumber=97 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[76, 97, 6, 7, 2, 3, 1, 2, 3, 2, 3, 2, 3, 1, 1, 3, 1, 1, 2, 3, 4, 15, 1, 2, 3, 4, 15, 1, 1, 13, 2, 15, 16, 17, 26]"+
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

public static void TestCaseDiff121395() {
 UsageCalculus.TestCase = 121395;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*x0^22*xyz^3*-3*xyz-3*xyz/1*xyz^2*-2*xyz^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyz^33*xyz/-1*xyz^2-1*x0^2*-2*x0^3*3*x02*x0^2*-3*x0^32*xyz^3*-3*xyz";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=394 EqnNumber=98 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[40, 98, 7, 8, 3, 1, 2, 3, 1, 3, 4, 1, 1, 2, 3, 1, 2, 1, 3, 1, 1, 16, 2, 3, 1, 1, 16, 2, 3, 14, 3, 16, 1, 18, 27]"+
"// DOEMatrixRow=[38, 100, 10, 1, 1, 2, 3, 4, 3, 4, 1, 1, 1, 2, 3, 1, 2, 50, 9, 1, 2, 3, 2, 3, 4, 1, 3, 1, 2, 7, 1, 2, 18]"+
//Tail EqnIndex=394 EqnNumber=98 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[40, 98, 7, 8, 3, 1, 2, 3, 1, 3, 4, 1, 1, 2, 3, 1, 2, 1, 3, 1, 1, 16, 2, 3, 1, 1, 16, 2, 3, 14, 3, 16, 1, 18, 27]"+
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

public static void TestCaseDiff121396() {
 UsageCalculus.TestCase = 121396;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xyza^3*-3*xyza-3*xyza/1*xyza^2*-2*xyza^31*x0^2*-2*x0^3*3*x0/-1*x0^22*xyza^33*xyza/-1*xyza^2-1*x0^2*-2*x0^3*3*x02*xyza^3*3*xyza/1*xyza^2*--3*xyza^33*xyza2*xyza^3*-3*xyza-3*xyza/1*xyza^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=395 EqnNumber=99 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[4, 99, 8, 9, 4, 2, 3, 4, 2, 4, 1, 2, 3, 1, 4, 2, 3, 2, 4, 2, 3, 1, 3, 1, 2, 3, 1, 3, 4, 15, 4, 17, 2, 19, 28]"+
"// DOEMatrixRow=[2, 1, 11, 2, 3, 1, 1, 5, 1, 1, 2, 1, 2, 3, 4, 2, 3, 1, 10, 2, 3, 4, 3, 1, 5, 2, 1, 2, 3, 8, 2, 3, 19]"+
//Tail EqnIndex=395 EqnNumber=99 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[4, 99, 8, 9, 4, 2, 3, 4, 2, 4, 1, 2, 3, 1, 4, 2, 3, 2, 4, 2, 3, 1, 3, 1, 2, 3, 1, 3, 4, 15, 4, 17, 2, 19, 28]"+
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

public static void TestCaseDiff121397() {
 UsageCalculus.TestCase = 121397;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*x/1*x^2*-2*x^31*x0^2*-2*x0^3*3*x0/-1*x0^22*x^33*x/-1*x^2-1*x0^2*-2*x0^3*3*x02*x^3*3*x/1*x^2*--3*x^33*x1*x^2*--3*x^3-3*xy012^3*1*xy012/2*xy012^2-3*x/1*x^21*x0^2*-2*x0^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=396 EqnNumber=100 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[71, 100, 9, 10, 1, 3, 1, 5, 3, 1, 2, 1, 1, 2, 1, 3, 1, 1, 5, 3, 4, 2, 1, 2, 3, 4, 2, 1, 1, 16, 1, 18, 3, 20, 29]"+
"// DOEMatrixRow=[68, 2, 12, 3, 1, 2, 3, 6, 2, 3, 4, 2, 3, 1, 1, 3, 1, 2, 1, 3, 1, 5, 1, 2, 6, 3, 2, 3, 4, 9, 1, 4, 20]"+
//Tail EqnIndex=396 EqnNumber=100 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[71, 100, 9, 10, 1, 3, 1, 5, 3, 1, 2, 1, 1, 2, 1, 3, 1, 1, 5, 3, 4, 2, 1, 2, 3, 4, 2, 1, 1, 16, 1, 18, 3, 20, 29]"+
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

public static void TestCaseDiff121398() {
 UsageCalculus.TestCase = 121398;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "-3*xy012/1*xy012^2*-2*xy012^3*3*xy0121*xy^22*xy^3*3*xy3*x0/-1*x0^2*-2*x0^3-1*xy^2*-2*xy^3*3*xy/1*xy^22*xy^33*x0/1*x0^21*xy^2*--3*xy^3*1*xy-3*xy^3*1*xy/2*xy^2*-3*xy^31*x0-3*xy012/1*xy012^21*xy^2*-2*xy^3";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=397 EqnNumber=1 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[35, 1, 10, 11, 2, 1, 2, 6, 1, 2, 3, 2, 3, 1, 2, 1, 2, 1, 1, 1, 1, 3, 2, 3, 1, 1, 3, 2, 3, 1, 2, 19, 4, 21, 30]"+
"// DOEMatrixRow=[34, 2, 13, 4, 1, 3, 1, 2, 3, 4, 1, 2, 3, 2, 3, 1, 2, 3, 2, 1, 1, 2, 3, 2, 3, 4, 1, 1, 2, 3, 2, 3, 1]"+
//Tail EqnIndex=397 EqnNumber=1 FamilyID=1 MotifTag=1 Entropy=3 FuncWrapAliasID=1"+
"// MetaRow=[35, 1, 10, 11, 2, 1, 2, 6, 1, 2, 3, 2, 3, 1, 2, 1, 2, 1, 1, 1, 1, 3, 2, 3, 1, 1, 3, 2, 3, 1, 2, 19, 4, 21, 30]"+
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

public static void TestCaseDiff121399() {
 UsageCalculus.TestCase = 121399;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "1*xyz^22*xyz^3*3*xyz3*x0/-1*x0^2*-2*x0^3-1*xyz^2*-2*xyz^3*3*xyz/1*xyz^22*xyz^33*x0/1*x0^21*xyz^2*--3*xyz^3*1*xyz-3*xyz^3*1*xyz/2*xyz^2*-3*xyz^31*x02*xyz^2*-3*xyz^33*xyz^3*-1*xyz/2*xyz^21*xyz^2*-2*xyz^32*xyz^3*3*xyz";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=398 EqnNumber=2 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[100, 2, 11, 12, 3, 2, 3, 7, 2, 3, 4, 1, 1, 2, 3, 2, 3, 2, 3, 2, 3, 4, 3, 1, 2, 3, 4, 3, 4, 2, 3, 20, 5, 22, 31]"+
"// DOEMatrixRow=[99, 3, 14, 1, 2, 1, 2, 3, 1, 1, 2, 1, 1, 3, 4, 2, 3, 4, 3, 2, 3, 4, 1, 3, 4, 1, 2, 3, 4, 5, 1, 4, 2]"+
//Tail EqnIndex=398 EqnNumber=2 FamilyID=2 MotifTag=3 Entropy=4 FuncWrapAliasID=3"+
"// MetaRow=[100, 2, 11, 12, 3, 2, 3, 7, 2, 3, 4, 1, 1, 2, 3, 2, 3, 2, 3, 2, 3, 4, 3, 1, 2, 3, 4, 3, 4, 2, 3, 20, 5, 22, 31]"+
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

public static void TestCaseDiff121400() {
 UsageCalculus.TestCase = 121400;
 UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
 UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
 UsageCalculus.EqnUnderTest = "2*xyza^3*3*xyza3*x0/-1*x0^2*-2*x0^3-1*xyza^2*-2*xyza^3*3*xyza/1*xyza^22*xyza^33*x0/1*x0^21*xyza^2*--3*xyza^3*1*xyza-3*xyza^3*1*xyza/2*xyza^2*-3*xyza^31*x02*xyza^2*-3*xyza^33*xyza^3*-1*xyza/2*xyza^22*x0^2*-3*x0^3*1*x0/-3*x0^23*xyza^32*xyza^3*3*xyza3*x0/-1*x0^2";
 UsageCalculus.TestCaseName = "Simple: Exponent";
 UsageCalculus.TestCaseMatrixID = "Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent";
 UsageCalculus.EquationComment = "// EqnIndex=399 EqnNumber=3 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[62, 3, 12, 13, 4, 3, 1, 8, 3, 4, 1, 2, 3, 1, 4, 3, 1, 1, 4, 3, 4, 5, 1, 2, 3, 4, 5, 1, 1, 3, 4, 21, 6, 23, 32]"+
"// DOEMatrixRow=[64, 4, 15, 2, 3, 2, 3, 4, 2, 3, 4, 2, 3, 1, 1, 3, 1, 5, 4, 3, 1, 5, 2, 1, 5, 2, 3, 1, 1, 6, 2, 5, 3]"+
//Tail EqnIndex=399 EqnNumber=3 FamilyID=3 MotifTag=4 Entropy=1 FuncWrapAliasID=4"+
"// MetaRow=[62, 3, 12, 13, 4, 3, 1, 8, 3, 4, 1, 2, 3, 1, 4, 3, 1, 1, 4, 3, 4, 5, 1, 2, 3, 4, 5, 1, 1, 3, 4, 21, 6, 23, 32]"+
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