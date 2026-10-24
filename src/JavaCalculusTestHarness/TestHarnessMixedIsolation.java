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
public class TestHarnessMixedIsolation {
    public static Logger log = Logger.getLogger(TestHarnessMixedIsolation.class.getName());
    //Isolation Test Cases
    public static void MixedIsolationTestCases(String AlgoName,long j){
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
            case 2000:
                TestCaseDiff2000();
                break;
            case 2001:
                TestCaseDiff2001();
                break;
            case 2002:
                TestCaseDiff2002();
                break;
            case 2003:
                TestCaseDiff2003();
                break;
            case 2004:
                TestCaseDiff2004();
                break;
            case 2005:
                TestCaseDiff2005();
                break;
            case 2006:
                TestCaseDiff2006();
                break;
            case 2007:
                TestCaseDiff2007();
                break;
            case 2008:
                TestCaseDiff2008();
                break;
            case 2009:
                TestCaseDiff2009();
                break;
            case 2010:
                TestCaseDiff2010();
                break;
            case 2011:
                TestCaseDiff2011();
                break;
            case 2012:
                TestCaseDiff2012();
                break;
            case 2013:
                TestCaseDiff2013();
                break;
            case 2014:
                TestCaseDiff2014();
                break;
            case 2015:
                TestCaseDiff2015();
                break;
            case 2016:
                TestCaseDiff2016();
                break;
            case 2017:
                TestCaseDiff2017();
                break;
            case 2018:
                TestCaseDiff2018();
                break;
            case 2019:
                TestCaseDiff2019();
                break;
            case 2020:
                TestCaseDiff2020();
                break;
            case 2021:
                TestCaseDiff2021();
                break;
            case 2022:
                TestCaseDiff2022();
                break;
            case 2023:
                TestCaseDiff2023();
                break;
            case 2024:
                TestCaseDiff2024();
                break;
            case 2025:
                TestCaseDiff2025();
                break;
            case 2026:
                TestCaseDiff2026();
                break;
            case 2027:
                TestCaseDiff2027();
                break;
            case 2028:
                TestCaseDiff2028();
                break;
            case 2029:
                TestCaseDiff2029();
                break;
            case 2030:
                TestCaseDiff2030();
                break;
                /* ***************IndConstant Test Case***************** */
            case 2031:
                TestCaseDiff2031();
                break;
            case 2032:
                TestCaseDiff2032();
                break;
            case 2033:
                TestCaseDiff2033();
                break;
            case 2034:
                TestCaseDiff2034();
                break;
            case 2035:
                TestCaseDiff2035();
                break;
            case 2036:
                TestCaseDiff2036();
                break;
            case 2037:
                TestCaseDiff2037();
                break;
            case 2038:
                TestCaseDiff2038();
                break;
            case 2039:
                TestCaseDiff2039();
                break;
            case 2040:
                TestCaseDiff2040();
                break;
            case 2041:
                TestCaseDiff2041();
                break;
                /* ***************Parenthesis Test Case***************** */
            case 2042:
                TestCaseDiff2042();
                break;
            case 2043:
                TestCaseDiff2043();
                break;
            case 2044:
                TestCaseDiff2044();
                break;
            case 2045:
                TestCaseDiff2045();
                break;
            case 2046:
                TestCaseDiff2046();
                break;
            case 2047:
                TestCaseDiff2047();
                break;
            case 2048:
                TestCaseDiff2048();
                break;
            case 2049:
                TestCaseDiff2049();
                break;
            case 2050:
                TestCaseDiff2050();
                break;
            case 2051:
                TestCaseDiff2051();
                break;
            case 2052:
                TestCaseDiff2052();
                break;
             /* ***************Names Test Case***************** */   
            case 2053:
                TestCaseDiff2053();
                break;
            case 2054:
                TestCaseDiff2054();
                break;
            case 2055:
                TestCaseDiff2055();
                break;
            case 2056:
                TestCaseDiff2056();
                break;
            case 2057:
                TestCaseDiff2057();
                break;
            case 2058:
                TestCaseDiff2058();
                break;
            case 2059:
                TestCaseDiff2059();
                break;
            case 2060:
                TestCaseDiff2060();
                break;
            case 2061:
                TestCaseDiff2061();
                break;
            case 2062:
                TestCaseDiff2062();
                break;
            /* Inversion Test Cases */
            case 2063:
                TestCaseDiff2063();
                break;
            case 2064:
                TestCaseDiff2064();
                break;
            case 2065:
                TestCaseDiff2065();
                break;
            case 2066:
                TestCaseDiff2066();
                break;
            case 2067:
                TestCaseDiff2067();
                break;
                /* Coefficients Test Cases */
            case 2068:
                TestCaseDiff2068();
                break;
            case 2069:
                TestCaseDiff2069();
                break;
            case 2070:
                TestCaseDiff2070();
                break;
            case 2071:
                TestCaseDiff2071();
                break;
            case 2072:
                TestCaseDiff2072();
                break;
            case 2073:
                TestCaseDiff2073();
                break;
            case 2074:
                TestCaseDiff2074();
                break;
            case 2075:
                TestCaseDiff2075();
                break;
            case 2076:
                TestCaseDiff2076();
                break;
            case 2077:
                TestCaseDiff2077();
                break;
            case 2078:
                TestCaseDiff2078();
                break;
            case 2079:
                TestCaseDiff2079();
                break;
            case 2080:
                TestCaseDiff2080();
                break;
            case 2081:
                TestCaseDiff2081();
                break;
            case 2082:
                TestCaseDiff2082();
                break;
            default:
                System.out.println(ConsoleColors.RED +"Isolation TestCase:j= " + j  + ": Gap" + ConsoleColors.RESET);
                break;
        }
    }
}
    //Equation Types Test Cases
    
    public static void TestCaseDiff2000() {
        //Test Case 2000
        TestCase = 2000;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";
        EqnUnderTest = "x^8.0 + x^5 + x^4 - x - 25";
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
    public static void TestCaseDiff2001() {
        //Test Case 2001
        TestCase = 2001;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";
        EqnUnderTest = "8.0*x^8 + 5*x^5 + 4*x^4 - 1.0*x - 25";
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
        EqnSolArrayIntegrAlone[3]="1.0/11.25/11.0*x^11.0+1.0/8.4/8.0*x^8.0+1.0/7.5/7.0*x^7.0-1.0/6.0/4.0*x^4.0-12.5/3.0*x^3.00";
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
    public static void TestCaseDiff2002() {
        //Test Case 2002
        TestCase = 2002;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";
        EqnUnderTest = "a*8.0*x^8 + a*5.0*x^5 + a*4*x^4 - a*x - 25*a";
        TestCaseName = "Simple: Coefficients:";
        TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        DiffWithRespTo = "x";
        MaxDiffOrder = 4;
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
        EqnSolArrayDiffAlone[4] = "a*2688.0*5.0*x^4.0+a*300.0*2.0*x^1.0+a*96.0-a*0.0-a*0.0";
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
    public static void TestCaseDiff2003() {
        //Test Case 2003
        TestCase = 2003;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";
        EqnUnderTest = "a*x^8.0 + a*x^5 + a*x^4 - x - 25.0";
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
    public static void TestCaseDiff2004() {
        //Test Case 2004
        TestCase = 2004;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";
        EqnUnderTest = "a+b+a^2.0+x^8 + a+b+a^2*x^5 + a+b+a^2*x^4 - a+b+a^2*x - 25";
        TestCaseName = "Simple: Coefficients:";
        TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        DiffWithRespTo = "x";
        MaxDiffOrder = 14;
        MaxIntegreOrder = 14;
        
        EqnSolArrayMap1[1] = "a+b+a^2.0+x^8.0+a+b+a^2.0*x^5.0+a+b+a^2.0*x^4.0-a+b+a^2.0*x-25.0";
        EqnSolArrayDiffAlone[1] = "a*0.0+b*0.0+a^2.0*0.0+8.0*x^7.0+a*0.0+b*0.0+a^2.0*5.0*x^4.0+a*0.0+b*0.0+a^2.0*4.0*x^3.0-a*0.0+b*0.0+a^2.0-25.0*0.0";
        EqnSolArrayMap2[1] = "a*0.0+b*0.0+a^2.0*0.0+8.0*x^7.0+a*0.0+b*0.0+a^2.0*5.0*x^4.0+a*0.0+b*0.0+a^2.0*4.0*x^3.0-a*0.0+b*0.0+a^2.0";
        EqnSolArrayMap3[1]="a+b+a^2.0+x^8.0+a+b+a^2.0*x^5.0+a+b+a^2.0*x^4.0-a+b+a^2.0*x-25.0";
        EqnSolArrayIntegrAlone[1]="a*x+b*x+a^2.0*x+1.0/9.0*x^9.0+a*x+b*x+a^2.0/6.0*x^6.0+a*x+b*x+a^2.0/5.0*x^5.0-a*x+b*x+a^2.0/2.0*x^2.0-25.0*x";
        EqnSolArrayMap4[1]="a*x+b*x+a^2.0*x+0.1111111111111111*x^9.0+a*x+b*x+a^2.0/6.0*x^6.0+a*x+b*x+a^2.0/5.0*x^5.0-a*x+b*x+a^2.0/2.0*x^2.0-25.0*x";
        EqnSolOrder[1] = 1;

        EqnSolArrayMap1[2] = "a*0.0+b*0.0+a^2.0*0.0+8.0*x^7.0+a*0.0+b*0.0+a^2.0*5.0*x^4.0+a*0.0+b*0.0+a^2.0*4.0*x^3.0-a*0.0+b*0.0+a^2.0";
        EqnSolArrayDiffAlone[2] = "a*0.0+b*0.0*0.0+a^2.0*0.0*0.0+8.0*7.0*x^6.0+a*0.0*0.0+b*0.0*0.0+a^2.0*5.0*4.0*x^3.0+a*0.0*0.0+b*0.0*0.0+a^2.0*4.0*3.0*x^2.0-a*0.0*0.0+b*0.0*0.0+a^2.0*0.0";
        EqnSolArrayMap2[2] = "a*0.0+b*0.0+a^2.0*0.0+56.0*x^6.0+a*0.0+b*0.0+a^2.0*20.0*x^3.0+a*0.0+b*0.0+a^2.0*12.0*x^2.0-a*0.0+b*0.0+a^2.0*0.0";
        EqnSolArrayMap3[2]="a*x+b*x+a^2.0*x+0.1111111111111111*x^9.0+a*x+b*x+a^2.0/6.0*x^6.0+a*x+b*x+a^2.0/5.0*x^5.0-a*x+b*x+a^2.0/2.0*x^2.0-25.0*x";
        EqnSolArrayIntegrAlone[2]="a/2.0*x^2.0+b/2.0*x^2.0+a^2.0/2.0*x^2.0+0.1111111111111111/10.0*x^10.0+a/2.0*x^2.0+b/2.0*x^2.0+a^2.0/6.0/7.0*x^7.0+a/2.0*x^2.0+b/2.0*x^2.0+a^2.0/5.0/6.0*x^6.0-a/2.0*x^2.0+b/2.0*x^2.0+a^2.0/2.0/3.0*x^3.0-25.0/2.0*x^2.0";
        EqnSolArrayMap4[2]="a/2.0*x^2.0+b/2.0*x^2.0+a^2.0/2.0*x^2.0+0.01111111111111111*x^10.0+a/2.0*x^2.0+b/2.0*x^2.0+a^2.0*0.023809523809523808*x^7.0+a/2.0*x^2.0+b/2.0*x^2.0+a^2.0*0.03333333333333333*x^6.0-a/2.0*x^2.0+b/2.0*x^2.0+a^2.0/6.0*x^3.0-12.5*x^2.0";
        EqnSolOrder[2] = 2;

        EqnSolArrayMap1[3] = "a*0.0+b*0.0+a^2.0*0.0+56.0*x^6.0+a*0.0+b*0.0+a^2.0*20.0*x^3.0+a*0.0+b*0.0+a^2.0*12.0*x^2.0-a*0.0+b*0.0+a^2.0*0.0";
        EqnSolArrayDiffAlone[3] = "a*0.0+b*0.0*0.0+a^2.0*0.0*0.0+56.0*6.0*x^5.0+a*0.0*0.0+b*0.0*0.0+a^2.0*20.0*3.0*x^2.0+a*0.0*0.0+b*0.0*0.0+a^2.0*12.0*2.0*x^1.0-a*0.0*0.0+b*0.0*0.0+a^2.0*0.0*0.0";
        EqnSolArrayMap2[3] = "a*0.0+b*0.0+a^2.0*0.0+336.0*x^5.0+a*0.0+b*0.0+a^2.0*60.0*x^2.0+a*0.0+b*0.0+a^2.0*24.0*x-a*0.0+b*0.0+a^2.0*0.0";
        EqnSolArrayMap3[3]="a/2.0*x^2.0+b/2.0*x^2.0+a^2.0/2.0*x^2.0+0.01111111111111111*x^10.0+a/2.0*x^2.0+b/2.0*x^2.0+a^2.0*0.023809523809523808*x^7.0+a/2.0*x^2.0+b/2.0*x^2.0+a^2.0*0.03333333333333333*x^6.0-a/2.0*x^2.0+b/2.0*x^2.0+a^2.0/6.0*x^3.0-12.5*x^2.0";
        EqnSolArrayIntegrAlone[3]="a/2.0/3.0*x^3.0+b/2.0/3.0*x^3.0+a^2.0/2.0/3.0*x^3.0+0.01111111111111111/11.0*x^11.0+a/2.0/3.0*x^3.0+b/2.0/3.0*x^3.0+a^2.0*0.023809523809523808/8.0*x^8.0+a/2.0/3.0*x^3.0+b/2.0/3.0*x^3.0+a^2.0*0.03333333333333333/7.0*x^7.0-a/2.0/3.0*x^3.0+b/2.0/3.0*x^3.0+a^2.0/6.0/4.0*x^4.0-12.5/3.0*x^3.0";
        EqnSolArrayMap4[3]="a*0.16666666666666666*x^3.0+b*0.16666666666666666*x^3.0+a^2.0/6.0*x^3.0+0.0010101010101010099*x^11.0+a*0.16666666666666666*x^3.0+b*0.16666666666666666*x^3.0+a^2.0*0.002976190476190476*x^8.0+a*0.16666666666666666*x^3.0+b*0.16666666666666666*x^3.0+a^2.0*0.0047619047619047615*x^7.0-a*0.16666666666666666*x^3.0+b*0.16666666666666666*x^3.0+a^2.0/24.0*x^4.0-4.166666666666667*x^3.0";
        EqnSolOrder[3] = 3;

        EqnSolArrayMap1[4] = "a*0.0+b*0.0+a^2.0*0.0+336.0*x^5.0+a*0.0+b*0.0+a^2.0*60.0*x^2.0+a*0.0+b*0.0+a^2.0*24.0*x-a*0.0+b*0.0+a^2.0*0.0";
        EqnSolArrayDiffAlone[4] = "a*0.0+b*0.0*0.0+a^2.0*0.0*0.0+336.0*5.0*x^4.0+a*0.0*0.0+b*0.0*0.0+a^2.0*60.0*2.0*x^1.0+a*0.0*0.0+b*0.0*0.0+a^2.0*24.0-a*0.0*0.0+b*0.0*0.0+a^2.0*0.0*0.0";
        EqnSolArrayMap2[4] = "a*0.0+b*0.0+a^2.0*0.0+1680.0*x^4.0+a*0.0+b*0.0+a^2.0*120.0*x+a*0.0+b*0.0+a^2.0*24.0-a*0.0+b*0.0+a^2.0*0.0";
        EqnSolArrayMap3[4]="a*0.16666666666666666*x^3.0+b*0.16666666666666666*x^3.0+a^2.0/6.0*x^3.0+0.0010101010101010099*x^11.0+a*0.16666666666666666*x^3.0+b*0.16666666666666666*x^3.0+a^2.0*0.002976190476190476*x^8.0+a*0.16666666666666666*x^3.0+b*0.16666666666666666*x^3.0+a^2.0*0.0047619047619047615*x^7.0-a*0.16666666666666666*x^3.0+b*0.16666666666666666*x^3.0+a^2.0/24.0*x^4.0-4.166666666666667*x^3.0";
        EqnSolArrayIntegrAlone[4]="a*0.16666666666666666/4.0*x^4.0+b*0.16666666666666666/4.0*x^4.0+a^2.0/6.0/4.0*x^4.0+0.0010101010101010099/12.0*x^12.0+a*0.16666666666666666/4.0*x^4.0+b*0.16666666666666666/4.0*x^4.0+a^2.0*0.002976190476190476/9.0*x^9.0+a*0.16666666666666666/4.0*x^4.0+b*0.16666666666666666/4.0*x^4.0+a^2.0*0.0047619047619047615/8.0*x^8.0-a*0.16666666666666666/4.0*x^4.0+b*0.16666666666666666/4.0*x^4.0+a^2.0/24.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        EqnSolArrayMap4[4]="a*0.041666666666666664*x^4.0+b*0.041666666666666664*x^4.0+a^2.0/24.0*x^4.0+8.417508417508415E-5*x^12.0+a*0.041666666666666664*x^4.0+b*0.041666666666666664*x^4.0+a^2.0*3.3068783068783067E-4*x^9.0+a*0.041666666666666664*x^4.0+b*0.041666666666666664*x^4.0+a^2.0*5.952380952380952E-4*x^8.0-a*0.041666666666666664*x^4.0+b*0.041666666666666664*x^4.0+a^2.0/120.0*x^5.0-1.0416666666666667*x^4.0";
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
     public static void TestCaseDiff2005() {
        //Test Case 50001
        UsageCalculus.TestCase = 2005;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values Except 4th Order Integration";
        UsageCalculus.EqnUnderTest = "p/9*xyc1^9 + p*6.0*xyc1^6.0 + p/5.0*xyc1^5.0 + p*2.0*xyc1^2.0 + p*25.0*xyc1 + p*50.0*1.0";
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
        //Equation Types Test Cases End
        //Zero -Zero, Infinity, -Infinity , NaN, -NaN Test Cases Start
        //Multiply Zero, Divide Zero, Multiply -Zero, Divide -Zero
        //Multiply Infinity, Divide Infinity, Multiply -Infinity, Divide -Infinity
        //Multiply NaN, Divide NaN, Multiply -NaN, Divide -NaN
    public static void TestCaseDiff2006() {
        //Test Case 2006
        TestCase = 2006;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";
        EqnUnderTest = "1.0*0/x^8 + 1.0*0/x^5 + 1.0*0/x^4 - 1.0*0/x - 25*0";
        TestCaseName = "Simple: Coefficients:0";
        TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        DiffWithRespTo = "x";
        MaxDiffOrder = 14;
        MaxIntegreOrder = 2;
        
        EqnSolArrayMap1[1] = "0.0/x^8.0+0.0/x^5.0+0.0/x^4.0-0.0/x";
        EqnSolArrayDiffAlone[1] = "0.0*-8.0/x^9.0+0.0*-5.0/x^6.0+0.0*-4.0/x^5.0+0.0/x^2.0";
        EqnSolArrayMap2[1] = "-0.0/x^9.0-0.0/x^6.0-0.0/x^5.0+0.0/x^2.0";
        EqnSolArrayMap3[1]="0.0/x^8.0+0.0/x^5.0+0.0/x^4.0-0.0/x";
        EqnSolArrayIntegrAlone[1]="0.0/-7.0/x^7.0+0.0/-4.0/x^4.0+0.0/-3.0/x^3.0-0.0*ln(x)";
        EqnSolArrayMap4[1]="-0.0/x^7.0-0.0/x^4.0-0.0/x^3.0-0.0*ln(x)";
        EqnSolOrder[1] = 1;

        EqnSolArrayMap1[2] = "-0.0/x^9.0-0.0/x^6.0-0.0/x^5.0+0.0/x^2.0";
        EqnSolArrayDiffAlone[2] = "-0.0*-9.0/x^10.0-0.0*-6.0/x^7.0-0.0*-5.0/x^6.0+0.0*-2.0/x^3.0";
        EqnSolArrayMap2[2] = "0.0/x^10.0+0.0/x^7.0+0.0/x^6.0-0.0/x^3.0";
        EqnSolArrayMap3[2]="";
        EqnSolArrayIntegrAlone[2]="";
        EqnSolArrayMap4[2]="";
        EqnSolOrder[2] = 2;

        EqnSolArrayMap1[3] = "0.0/x^10.0+0.0/x^7.0+0.0/x^6.0-0.0/x^3.0";
        EqnSolArrayDiffAlone[3] = "0.0*-10.0/x^11.0+0.0*-7.0/x^8.0+0.0*-6.0/x^7.0-0.0*-3.0/x^4.0";
        EqnSolArrayMap2[3] = "-0.0/x^11.0-0.0/x^8.0-0.0/x^7.0+0.0/x^4.0";
        EqnSolArrayMap3[3]="";
        EqnSolArrayIntegrAlone[3]="";
        EqnSolArrayMap4[3]="";
        EqnSolOrder[3] = 3;

        EqnSolArrayMap1[4] = "-0.0/x^11.0-0.0/x^8.0-0.0/x^7.0+0.0/x^4.0";
        EqnSolArrayDiffAlone[4] = "-0.0*-11.0/x^12.0-0.0*-8.0/x^9.0-0.0*-7.0/x^8.0+0.0*-4.0/x^5.0";
        EqnSolArrayMap2[4] = "0.0/x^12.0+0.0/x^9.0+0.0/x^8.0-0.0/x^5.0";
        EqnSolArrayMap3[4]="";
        EqnSolArrayIntegrAlone[4]="";
        EqnSolArrayMap4[4]="";
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
    public static void TestCaseDiff2007() {
        //Test Case 2007
        TestCase = 2007;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";
        EqnUnderTest = "1.0/0/x^8 + 1.0/0/x^5 + 1.0/0/x^4 - 1.0/0/x - 25/0";
        TestCaseName = "Simple: Coefficients:0";
        TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        DiffWithRespTo = "x";
        MaxDiffOrder = 14;
        MaxIntegreOrder = 2;
        
        EqnSolArrayMap1[1] = "Infinity/x^8.0+Infinity/x^5.0+Infinity/x^4.0-Infinity/x-Infinity";
        EqnSolArrayDiffAlone[1] = "Infinity*-8.0/x^9.0+Infinity*-5.0/x^6.0+Infinity*-4.0/x^5.0+Infinity/x^2.0-Infinity*0.0";
        EqnSolArrayMap2[1] = "-Infinity*8.0/x^9.0-Infinity*5.0/x^6.0-Infinity*4.0/x^5.0+Infinity/x^2.0-Infinity*0.0";
        EqnSolArrayMap3[1]="Infinity/x^8.0+Infinity/x^5.0+Infinity/x^4.0-Infinity/x-Infinity";
        EqnSolArrayIntegrAlone[1]="Infinity/-7.0/x^7.0+Infinity/-4.0/x^4.0+Infinity/-3.0/x^3.0-Infinity*ln(x)-Infinity*x";
        EqnSolArrayMap4[1]="-Infinity/7.0/x^7.0-Infinity/4.0/x^4.0-Infinity/3.0/x^3.0-Infinity*ln(x)-Infinity*x";
        EqnSolOrder[1] = 1;

        EqnSolArrayMap1[2] = "-Infinity*8.0/x^9.0-Infinity*5.0/x^6.0-Infinity*4.0/x^5.0+Infinity/x^2.0-Infinity*0.0";
        EqnSolArrayDiffAlone[2] = "-Infinity*8.0*-9.0/x^10.0-Infinity*5.0*-6.0/x^7.0-Infinity*4.0*-5.0/x^6.0+Infinity*-2.0/x^3.0-Infinity*0.0*0.0";
        EqnSolArrayMap2[2] = "Infinity*72.0/x^10.0+Infinity*30.0/x^7.0+Infinity*20.0/x^6.0-Infinity*2.0/x^3.0-Infinity*0.0";
        EqnSolArrayMap3[2]="";
        EqnSolArrayIntegrAlone[2]="";
        EqnSolArrayMap4[2]="";
        EqnSolOrder[2] = 2;

        EqnSolArrayMap1[3] = "Infinity*72.0/x^10.0+Infinity*30.0/x^7.0+Infinity*20.0/x^6.0-Infinity*2.0/x^3.0-Infinity*0.0";
        EqnSolArrayDiffAlone[3] = "Infinity*72.0*-10.0/x^11.0+Infinity*30.0*-7.0/x^8.0+Infinity*20.0*-6.0/x^7.0-Infinity*2.0*-3.0/x^4.0-Infinity*0.0*0.0";
        EqnSolArrayMap2[3] = "-Infinity*720.0/x^11.0-Infinity*210.0/x^8.0-Infinity*120.0/x^7.0+Infinity*6.0/x^4.0-Infinity*0.0";
        EqnSolArrayMap3[3]="";
        EqnSolArrayIntegrAlone[3]="";
        EqnSolArrayMap4[3]="";
        EqnSolOrder[3] = 3;

        EqnSolArrayMap1[4] = "-Infinity*720.0/x^11.0-Infinity*209.99999999999997/x^8.0-Infinity*120.0/x^7.0+Infinity*6.0/x^4.0-Infinity*0.0";
        EqnSolArrayDiffAlone[4] = "-Infinity*720.0*-11.0/x^12.0-Infinity*209.99999999999997*-8.0/x^9.0-Infinity*120.0*-7.0/x^8.0+Infinity*6.0*-4.0/x^5.0-Infinity*0.0*0.0";
        EqnSolArrayMap2[4] = "Infinity*7920.0/x^12.0+Infinity*1679.9999999999998/x^9.0+Infinity*840.0/x^8.0-Infinity*24.0/x^5.0-Infinity*0.0";
        EqnSolArrayMap3[4]="";
        EqnSolArrayIntegrAlone[4]="";
        EqnSolArrayMap4[4]="";
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
    public static void TestCaseDiff2008() {
        //Test Case 2008
        TestCase = 2008;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";
        EqnUnderTest = "1.0*-0/x^8 + 1.0*-0/x^5 + 1.0*-0/x^4 - 1.0*-0/x - 25*-0";
        TestCaseName = "Simple: Coefficients:0";
        TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        DiffWithRespTo = "x";
        MaxDiffOrder = 14;
        MaxIntegreOrder = 2;
        
        EqnSolArrayMap1[1] = "-0.0/x^8.0-0.0/x^5.0-0.0/x^4.0+0.0/x";
        EqnSolArrayDiffAlone[1] = "-0.0*-8.0/x^9.0-0.0*-5.0/x^6.0-0.0*-4.0/x^5.0-0.0/x^2.0";
        EqnSolArrayMap2[1] = "0.0/x^9.0+0.0/x^6.0+0.0/x^5.0-0.0/x^2.0";
        EqnSolArrayMap3[1]="-0.0/x^8.0-0.0/x^5.0-0.0/x^4.0+0.0/x";
        EqnSolArrayIntegrAlone[1]="-0.0/-7.0/x^7.0-0.0/-4.0/x^4.0-0.0/-3.0/x^3.0+0.0*ln(x)";
        EqnSolArrayMap4[1]="0.0/x^7.0+0.0/x^4.0+0.0/x^3.0+0.0*ln(x)";
        EqnSolOrder[1] = 1;

        EqnSolArrayMap1[2] = "0.0/x^9.0+0.0/x^6.0+0.0/x^5.0-0.0/x^2.0";
        EqnSolArrayDiffAlone[2] = "0.0*-9.0/x^10.0+0.0*-6.0/x^7.0+0.0*-5.0/x^6.0-0.0*-2.0/x^3.0";
        EqnSolArrayMap2[2] = "-0.0/x^10.0-0.0/x^7.0-0.0/x^6.0+0.0/x^3.0";
        EqnSolArrayMap3[2]="";
        EqnSolArrayIntegrAlone[2]="";
        EqnSolArrayMap4[2]="";
        EqnSolOrder[2] = 2;

        EqnSolArrayMap1[3] = "-0.0/x^10.0-0.0/x^7.0-0.0/x^6.0+0.0/x^3.0";
        EqnSolArrayDiffAlone[3] = "-0.0*-10.0/x^11.0-0.0*-7.0/x^8.0-0.0*-6.0/x^7.0+0.0*-3.0/x^4.0";
        EqnSolArrayMap2[3] = "0.0/x^11.0+0.0/x^8.0+0.0/x^7.0-0.0/x^4.0";
        EqnSolArrayMap3[3]="";
        EqnSolArrayIntegrAlone[3]="";
        EqnSolArrayMap4[3]="";
        EqnSolOrder[3] = 3;

        EqnSolArrayMap1[4] = "0.0/x^11.0+0.0/x^8.0+0.0/x^7.0-0.0/x^4.0";
        EqnSolArrayDiffAlone[4] = "0.0*-11.0/x^12.0+0.0*-8.0/x^9.0+0.0*-7.0/x^8.0-0.0*-4.0/x^5.0";
        EqnSolArrayMap2[4] = "-0.0/x^12.0-0.0/x^9.0-0.0/x^8.0+0.0/x^5.0";
        EqnSolArrayMap3[4]="";
        EqnSolArrayIntegrAlone[4]="";
        EqnSolArrayMap4[4]="";
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
    
    public static void TestCaseDiff2009() {
        //Test Case 2009
        TestCase = 2009;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";
        EqnUnderTest = "1.0/-0/0.0/x^8 + 1.0/-0/0.0/x^5 + 1.0/-0/0.0/x^4 - 1.0/-0/0.0/x - 25/-0/0.0";
        TestCaseName = "Simple: Coefficients:-0/0.0";
        TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        DiffWithRespTo = "x";
        MaxDiffOrder = 14;
        MaxIntegreOrder = 2;
        
        EqnSolArrayMap1[1] = "-Infinity/x^8.0-Infinity/x^5.0-Infinity/x^4.0+Infinity/x+Infinity";
        EqnSolArrayDiffAlone[1] = "-Infinity*-8.0/x^9.0-Infinity*-5.0/x^6.0-Infinity*-4.0/x^5.0-Infinity/x^2.0+Infinity*0.0";
        EqnSolArrayMap2[1] = "Infinity*8.0/x^9.0+Infinity*5.0/x^6.0+Infinity*4.0/x^5.0-Infinity/x^2.0+Infinity*0.0";
        EqnSolArrayMap3[1]="-Infinity/x^8.0-Infinity/x^5.0-Infinity/x^4.0+Infinity/x+Infinity";
        EqnSolArrayIntegrAlone[1]="-Infinity/-7.0/x^7.0-Infinity/-4.0/x^4.0-Infinity/-3.0/x^3.0+Infinity*ln(x)+Infinity*x";
        EqnSolArrayMap4[1]="Infinity/7.0/x^7.0+Infinity/4.0/x^4.0+Infinity/3.0/x^3.0+Infinity*ln(x)+Infinity*x";
        EqnSolOrder[1] = 1;

        EqnSolArrayMap1[2] = "Infinity*8.0/x^9.0+Infinity*5.0/x^6.0+Infinity*4.0/x^5.0-Infinity/x^2.0+Infinity*0.0";
        EqnSolArrayDiffAlone[2] = "Infinity*8.0*-9.0/x^10.0+Infinity*5.0*-6.0/x^7.0+Infinity*4.0*-5.0/x^6.0-Infinity*-2.0/x^3.0+Infinity*0.0*0.0";
        EqnSolArrayMap2[2] = "-Infinity*72.0/x^10.0-Infinity*30.0/x^7.0-Infinity*20.0/x^6.0+Infinity*2.0/x^3.0+Infinity*0.0";
        EqnSolArrayMap3[2]="";
        EqnSolArrayIntegrAlone[2]="";
        EqnSolArrayMap4[2]="";
        EqnSolOrder[2] = 2;

        EqnSolArrayMap1[3] = "-Infinity*72.0/x^10.0-Infinity*30.0/x^7.0-Infinity*20.0/x^6.0+Infinity*2.0/x^3.0+Infinity*0.0";
        EqnSolArrayDiffAlone[3] = "-Infinity*72.0*-10.0/x^11.0-Infinity*30.0*-7.0/x^8.0-Infinity*20.0*-6.0/x^7.0+Infinity*2.0*-3.0/x^4.0+Infinity*0.0*0.0";
        EqnSolArrayMap2[3] = "Infinity*720.0/x^11.0+Infinity*210.0/x^8.0+Infinity*120.0/x^7.0-Infinity*6.0/x^4.0+Infinity*0.0";
        EqnSolArrayMap3[3]="";
        EqnSolArrayIntegrAlone[3]="";
        EqnSolArrayMap4[3]="";
        EqnSolOrder[3] = 3;

        EqnSolArrayMap1[4] = "Infinity*720.0/x^11.0+Infinity*209.99999999999997/x^8.0+Infinity*120.0/x^7.0-Infinity*6.0/x^4.0+Infinity*0.0";
        EqnSolArrayDiffAlone[4] = "Infinity*720.0*-11.0/x^12.0+Infinity*209.99999999999997*-8.0/x^9.0+Infinity*120.0*-7.0/x^8.0-Infinity*6.0*-4.0/x^5.0+Infinity*0.0*0.0";
        EqnSolArrayMap2[4] = "-Infinity*7920.0/x^12.0-Infinity*1679.9999999999998/x^9.0-Infinity*840.0/x^8.0+Infinity*24.0/x^5.0+Infinity*0.0";
        EqnSolArrayMap3[4]="";
        EqnSolArrayIntegrAlone[4]="";
        EqnSolArrayMap4[4]="";
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
    //25/25 Test Cases
    public static void TestCaseDiff2010() {
        //Test Case 2010
        TestCase = 2010;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";
        EqnUnderTest = "1.0*25/25/x^8 + 1.0*25/25/x^5 + 1.0*25/25/x^4 - 1.0*25/25/x - 25*25/25";
        TestCaseName = "Simple: Coefficients:25/25";
        TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        DiffWithRespTo = "x";
        MaxDiffOrder = 14;
        MaxIntegreOrder = 2;
        
        EqnSolArrayMap1[1] = "1.0/x^8.0+1.0/x^5.0+1.0/x^4.0-1.0/x-25.0";
        EqnSolArrayDiffAlone[1] = "-8.0/x^9.0-5.0/x^6.0-4.0/x^5.0+1.0/x^2.0-25.0*0.0";
        EqnSolArrayMap2[1] = "-8.0/x^9.0-5.0/x^6.0-4.0/x^5.0+1.0/x^2.0";
        EqnSolArrayMap3[1]="1.0/x^8.0+1.0/x^5.0+1.0/x^4.0-1.0/x-25.0";
        EqnSolArrayIntegrAlone[1]="1.0/-7.0/x^7.0+1.0/-4.0/x^4.0+1.0/-3.0/x^3.0-ln(x)-25.0*x";
        EqnSolArrayMap4[1]="-1.0/7.0/x^7.0-1.0/4.0/x^4.0-1.0/3.0/x^3.0-ln(x)-25.0*x";
        EqnSolOrder[1] = 1;

        EqnSolArrayMap1[2] = "-8.0/x^9.0-5.0/x^6.0-4.0/x^5.0+1.0/x^2.0";
        EqnSolArrayDiffAlone[2] = "-8.0*-9.0/x^10.0-5.0*-6.0/x^7.0-4.0*-5.0/x^6.0-2.0/x^3.0";
        EqnSolArrayMap2[2] = "72.0/x^10.0+30.0/x^7.0+20.0/x^6.0-2.0/x^3.0";
        EqnSolArrayMap3[2]="";
        EqnSolArrayIntegrAlone[2]="";
        EqnSolArrayMap4[2]="";
        EqnSolOrder[2] = 2;

        EqnSolArrayMap1[3] = "72.0/x^10.0+30.0/x^7.0+20.0/x^6.0-2.0/x^3.0";
        EqnSolArrayDiffAlone[3] = "72.0*-10.0/x^11.0+30.0*-7.0/x^8.0+20.0*-6.0/x^7.0-2.0*-3.0/x^4.0";
        EqnSolArrayMap2[3] = "-720.0/x^11.0-210.0/x^8.0-120.0/x^7.0+6.0/x^4.0";
        EqnSolArrayMap3[3]="";
        EqnSolArrayIntegrAlone[3]="";
        EqnSolArrayMap4[3]="";
        EqnSolOrder[3] = 3;

        EqnSolArrayMap1[4] = "-720.0/x^11.0-210.0/x^8.0-120.0/x^7.0+6.0/x^4.0";
        EqnSolArrayDiffAlone[4] = "-720.0*-11.0/x^12.0-210.0*-8.0/x^9.0-120.0*-7.0/x^8.0+6.0*-4.0/x^5.0";
        EqnSolArrayMap2[4] = "7920.0/x^12.0+1680.0/x^9.0+840.0/x^8.0-24.0/x^5.0";
        EqnSolArrayMap3[4]="";
        EqnSolArrayIntegrAlone[4]="";
        EqnSolArrayMap4[4]="";
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
    public static void TestCaseDiff2011() {
        //Test Case 2011
        TestCase = 2011;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";
        EqnUnderTest = "1.0/25/25/x^8 + 1.0/25/25/x^5 + 1.0/25/25/x^4 - 1.0/25/25/x - 25/25/25";
        TestCaseName = "Simple: Coefficients:25/25";
        TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        DiffWithRespTo = "x";
        MaxDiffOrder = 14;
        MaxIntegreOrder = 2;
        
        EqnSolArrayMap1[1]       = "1.0/625.0/x^8.0+1.0/625.0/x^5.0+1.0/625.0/x^4.0-1.0/625.0/x-1.0/25.0";
        EqnSolArrayDiffAlone[1]  = "1.0/625.0*-8.0/x^9.0+1.0/625.0*-5.0/x^6.0+1.0/625.0*-4.0/x^5.0+1.0/625.0/x^2.0-1.0/25.0*0.0";
        EqnSolArrayMap2[1]       = "-1.0/78.125/x^9.0-1.0/125.0/x^6.0-1.0/156.25/x^5.0+1.0/625.0/x^2.0";
        EqnSolArrayMap3[1]       ="1.0/625.0/x^8.0+1.0/625.0/x^5.0+1.0/625.0/x^4.0-1.0/625.0/x-1.0/25.0";
        EqnSolArrayIntegrAlone[1]="1.0/625.0/-7.0/x^7.0+1.0/625.0/-4.0/x^4.0+1.0/625.0/-3.0/x^3.0-1.0/625.0*ln(x)-1.0/25.0*x";
        EqnSolArrayMap4[1]       ="-1.0/4375.0/x^7.0-1.0/2500.0/x^4.0-1.0/1875.0/x^3.0-1.0/625.0*ln(x)-1.0/25.0*x";
        EqnSolOrder[1] = 1;

        EqnSolArrayMap1[2] = "-1.0/78.125/x^9.0-1.0/125.0/x^6.0-1.0/156.25/x^5.0+1.0/625.0/x^2.0";
        EqnSolArrayDiffAlone[2] = "-1.0/78.125*-9.0/x^10.0-1.0/125.0*-6.0/x^7.0-1.0/156.25*-5.0/x^6.0+1.0/625.0*-2.0/x^3.0";
        EqnSolArrayMap2[2] = "1.0/8.680555555555555/x^10.0+1.0/20.833333333333332/x^7.0+1.0/31.25/x^6.0-1.0/312.5/x^3.0";
        EqnSolArrayMap3[2]="";
        EqnSolArrayIntegrAlone[2]="";
        EqnSolArrayMap4[2]="";
        EqnSolOrder[2] = 2;

        EqnSolArrayMap1[3] = "1.0/8.680555555555555/x^10.0+1.0/20.833333333333332/x^7.0+1.0/31.25/x^6.0-1.0/312.5/x^3.0";
        EqnSolArrayDiffAlone[3] = "1.0/8.680555555555555*-10.0/x^11.0+1.0/20.833333333333332*-7.0/x^8.0+1.0/31.25*-6.0/x^7.0-1.0/312.5*-3.0/x^4.0";
        EqnSolArrayMap2[3] = "-1.1520000000000001/x^11.0-1.0/2.976190476190476/x^8.0-1.0/5.208333333333333/x^7.0+1.0/104.16666666666667/x^4.0";
        EqnSolArrayMap3[3]="";
        EqnSolArrayIntegrAlone[3]="";
        EqnSolArrayMap4[3]="";
        EqnSolOrder[3] = 3;

        EqnSolArrayMap1[4] = "-1.1520000000000001/x^11.0-1.0/2.976190476190476/x^8.0-1.0/5.208333333333333/x^7.0+1.0/104.16666666666667/x^4.0";
        EqnSolArrayDiffAlone[4] = "-1.1520000000000001*-11.0/x^12.0-1.0/2.976190476190476*-8.0/x^9.0-1.0/5.208333333333333*-7.0/x^8.0+1.0/104.16666666666667*-4.0/x^5.0";
        EqnSolArrayMap2[4] = "12.672/x^12.0+2.688/x^9.0+1.344/x^8.0-1.0/26.041666666666668/x^5.0";
        EqnSolArrayMap3[4]="";
        EqnSolArrayIntegrAlone[4]="";
        EqnSolArrayMap4[4]="";
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
    public static void TestCaseDiff2012() {
        //Test Case 2012
        TestCase = 2012;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";
        EqnUnderTest = "1.0*-25/25/x^8 + 1.0*-25/25/x^5 + 1.0*-25/25/x^4 - 1.0*-25/25/x - 25*-25/25";
        TestCaseName = "Simple: Coefficients:-25/25";
        TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        DiffWithRespTo = "x";
        MaxDiffOrder = 14;
        MaxIntegreOrder = 2;
        
        EqnSolArrayMap1[1] = "-1.0/x^8.0-1.0/x^5.0-1.0/x^4.0+1.0/x+25.0";
        EqnSolArrayDiffAlone[1] = "8.0/x^9.0+5.0/x^6.0+4.0/x^5.0-1.0/x^2.0+25.0*0.0";
        EqnSolArrayMap2[1] = "8.0/x^9.0+5.0/x^6.0+4.0/x^5.0-1.0/x^2.0";
        EqnSolArrayMap3[1]="-1.0/x^8.0-1.0/x^5.0-1.0/x^4.0+1.0/x+25.0";
        EqnSolArrayIntegrAlone[1]="-1.0/-7.0/x^7.0-1.0/-4.0/x^4.0-1.0/-3.0/x^3.0+ln(x)+25.0*x";
        EqnSolArrayMap4[1]="1.0/7.0/x^7.0+1.0/4.0/x^4.0+1.0/3.0/x^3.0+ln(x)+25.0*x";
        EqnSolOrder[1] = 1;

        EqnSolArrayMap1[2] = "8.0/x^9.0+5.0/x^6.0+4.0/x^5.0-1.0/x^2.0";
        EqnSolArrayDiffAlone[2] = "8.0*-9.0/x^10.0+5.0*-6.0/x^7.0+4.0*-5.0/x^6.0+2.0/x^3.0";
        EqnSolArrayMap2[2] = "-72.0/x^10.0-30.0/x^7.0-20.0/x^6.0+2.0/x^3.0";
        EqnSolArrayMap3[2]="";
        EqnSolArrayIntegrAlone[2]="";
        EqnSolArrayMap4[2]="";
        EqnSolOrder[2] = 2;

        EqnSolArrayMap1[3] = "-72.0/x^10.0-30.0/x^7.0-20.0/x^6.0+2.0/x^3.0";
        EqnSolArrayDiffAlone[3] = "-72.0*-10.0/x^11.0-30.0*-7.0/x^8.0-20.0*-6.0/x^7.0+2.0*-3.0/x^4.0";
        EqnSolArrayMap2[3] = "720.0/x^11.0+210.0/x^8.0+120.0/x^7.0-6.0/x^4.0";
        EqnSolArrayMap3[3]="";
        EqnSolArrayIntegrAlone[3]="";
        EqnSolArrayMap4[3]="";
        EqnSolOrder[3] = 3;

        EqnSolArrayMap1[4] = "720.0/x^11.0+210.0/x^8.0+120.0/x^7.0-6.0/x^4.0";
        EqnSolArrayDiffAlone[4] = "720.0*-11.0/x^12.0+210.0*-8.0/x^9.0+120.0*-7.0/x^8.0-6.0*-4.0/x^5.0";
        EqnSolArrayMap2[4] = "-7920.0/x^12.0-1680.0/x^9.0-840.0/x^8.0+24.0/x^5.0";
        EqnSolArrayMap3[4]="";
        EqnSolArrayIntegrAlone[4]="";
        EqnSolArrayMap4[4]="";
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
    public static void TestCaseDiff2013() {
        //Test Case 2013
        TestCase = 2013;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";
        EqnUnderTest = "1.0/-25/25/x^8 + 1.0/-25/25/x^5 + 1.0/-25/25/x^4 - 1.0/-25/25/x - 25/-2525";
        TestCaseName = "Simple: Coefficients:-25/25";
        TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        DiffWithRespTo = "x";
        MaxDiffOrder = 14;
        MaxIntegreOrder = 2;
        
        EqnSolArrayMap1[1] = "-1.0/625.0/x^8.0-1.0/625.0/x^5.0-1.0/625.0/x^4.0+1.0/625.0/x+1.0/101.0";
        EqnSolArrayDiffAlone[1] = "-1.0/625.0*-8.0/x^9.0-1.0/625.0*-5.0/x^6.0-1.0/625.0*-4.0/x^5.0-1.0/625.0/x^2.0+1.0/101.0*0.0";
        EqnSolArrayMap2[1] = "1.0/78.125/x^9.0+1.0/125.0/x^6.0+1.0/156.25/x^5.0-1.0/625.0/x^2.0";
        EqnSolArrayMap3[1]="-1.0/625.0/x^8.0-1.0/625.0/x^5.0-1.0/625.0/x^4.0+1.0/625.0/x+1.0/101.0";
        EqnSolArrayIntegrAlone[1]="-1.0/625.0/-7.0/x^7.0-1.0/625.0/-4.0/x^4.0-1.0/625.0/-3.0/x^3.0+1.0/625.0*ln(x)+1.0/101.0*x";
        EqnSolArrayMap4[1]="1.0/4375.0/x^7.0+1.0/2500.0/x^4.0+1.0/1875.0/x^3.0+1.0/625.0*ln(x)+1.0/101.0*x";
        EqnSolOrder[1] = 1;

        EqnSolArrayMap1[2] = "1.0/78.125/x^9.0+1.0/125.0/x^6.0+1.0/156.25/x^5.0-1.0/625.0/x^2.0";
        EqnSolArrayDiffAlone[2] = "1.0/78.125*-9.0/x^10.0+1.0/125.0*-6.0/x^7.0+1.0/156.25*-5.0/x^6.0-1.0/625.0*-2.0/x^3.0";
        EqnSolArrayMap2[2] = "-1.0/8.680555555555555/x^10.0-1.0/20.833333333333332/x^7.0-1.0/31.25/x^6.0+1.0/312.5/x^3.0";
        EqnSolArrayMap3[2]="";
        EqnSolArrayIntegrAlone[2]="";
        EqnSolArrayMap4[2]="";
        EqnSolOrder[2] = 2;

        EqnSolArrayMap1[3] = "-1.0/8.680555555555555/x^10.0-1.0/20.833333333333332/x^7.0-1.0/31.25/x^6.0+1.0/312.5/x^3.0";
        EqnSolArrayDiffAlone[3] = "-1.0/8.680555555555555*-10.0/x^11.0-1.0/20.833333333333332*-7.0/x^8.0-1.0/31.25*-6.0/x^7.0+1.0/312.5*-3.0/x^4.0";
        EqnSolArrayMap2[3] = "1.1520000000000001/x^11.0+1.0/2.976190476190476/x^8.0+1.0/5.208333333333333/x^7.0-1.0/104.16666666666667/x^4.0";
        EqnSolArrayMap3[3]="";
        EqnSolArrayIntegrAlone[3]="";
        EqnSolArrayMap4[3]="";
        EqnSolOrder[3] = 3;

        EqnSolArrayMap1[4] = "1.1520000000000001/x^11.0+1.0/2.976190476190476/x^8.0+1.0/5.208333333333333/x^7.0-1.0/104.16666666666667/x^4.0";
        EqnSolArrayDiffAlone[4] = "1.1520000000000001*-11.0/x^12.0+1.0/2.976190476190476*-8.0/x^9.0+1.0/5.208333333333333*-7.0/x^8.0-1.0/104.16666666666667*-4.0/x^5.0";
        EqnSolArrayMap2[4] = "-12.672/x^12.0-2.688/x^9.0-1.344/x^8.0+1.0/26.041666666666668/x^5.0";
        EqnSolArrayMap3[4]="";
        EqnSolArrayIntegrAlone[4]="";
        EqnSolArrayMap4[4]="";
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
    public static void TestCaseDiff2014() {
        //Test Case 2014
        TestCase = 2014;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";        
        EqnUnderTest = "10.0*+10*+xyc1^8/xyc1^2 + 10.0*+10*+xyc1^5/xyc1^2 + 1.0*+10*+xyc1^4/xyc1^2 + 1.0*+10*+xyc1/xyc1^2 + 1.0*+5*25";
        TestCaseName = "Complex: Coefficients:+10";
        TestCaseMatrixID="Coefficients:+5:3 Letter with Numerics:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        DiffWithRespTo = "xyc1";
        MaxDiffOrder = 14;
        MaxIntegreOrder = 2;
        
        EqnSolArrayMap1[1] = "100.0*xyc1^6.0+100.0*xyc1^3.0+10.0*xyc1^2.0+10.0/xyc1+125.0";
        EqnSolArrayDiffAlone[1] = "100.0*6.0*xyc1^5.0+100.0*3.0*xyc1^2.0+10.0*2.0*xyc1^1.0-10.0/xyc1^2.0+125.0*0.0";
        EqnSolArrayMap2[1] = "600.0*xyc1^5.0+300.0*xyc1^2.0+20.0*xyc1-10.0/xyc1^2.0";
        EqnSolArrayMap3[1]="100.0*xyc1^6.0+100.0*xyc1^3.0+10.0*xyc1^2.0+10.0/xyc1+125.0";
        EqnSolArrayIntegrAlone[1]="100.0/7.0*xyc1^7.0+100.0/4.0*xyc1^4.0+10.0/3.0*xyc1^3.0+10.0*ln(xyc1)+125.0*xyc1";
        EqnSolArrayMap4[1]="14.285714285714286*xyc1^7.0+25.0*xyc1^4.0+3.3333333333333335*xyc1^3.0+10.0*ln(xyc1)+125.0*xyc1";
        EqnSolOrder[1] = 1;

        EqnSolArrayMap1[2] = "600.0*xyc1^5.0+300.0*xyc1^2.0+20.0*xyc1-10.0/xyc1^2.0";
        EqnSolArrayDiffAlone[2] = "600.0*5.0*xyc1^4.0+300.0*2.0*xyc1^1.0+20.0-10.0*-2.0/xyc1^3.0";
        EqnSolArrayMap2[2] = "3000.0*xyc1^4.0+600.0*xyc1+20.0+20.0/xyc1^3.0";
        EqnSolArrayMap3[2]="";
        EqnSolArrayIntegrAlone[2]="";
        EqnSolArrayMap4[2]="";
        EqnSolOrder[2] = 2;

        EqnSolArrayMap1[3] = "3000.0*xyc1^4.0+600.0*xyc1+20.0+20.0/xyc1^3.0";
        EqnSolArrayDiffAlone[3] = "3000.0*4.0*xyc1^3.0+600.0+20.0*0.0+20.0*-3.0/xyc1^4.0";
        EqnSolArrayMap2[3] = "12000.0*xyc1^3.0+600.0-60.0/xyc1^4.0";
        EqnSolArrayMap3[3]="";
        EqnSolArrayIntegrAlone[3]="";
        EqnSolArrayMap4[3]="";
        EqnSolOrder[3] = 3;

        EqnSolArrayMap1[4] = "12000.0*xyc1^3.0+600.0-60.0/xyc1^4.0";
        EqnSolArrayDiffAlone[4] = "12000.0*3.0*xyc1^2.0+600.0*0.0-60.0*-4.0/xyc1^5.0";
        EqnSolArrayMap2[4] = "36000.0*xyc1^2.0+240.0/xyc1^5.0";
        EqnSolArrayMap3[4]="";
        EqnSolArrayIntegrAlone[4]="";
        EqnSolArrayMap4[4]="";
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
    public static void TestCaseDiff2015() {
        //Test Case 2015
        TestCase = 2015;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";        
        EqnUnderTest = "1.0*+5*+xyc1^8/xyc1^-2 + 1.0*+5*+xyc1^5/xyc1^-2 + 1.0*+5*+xyc1^4/xyc1^-2 + 1.0*+5*+xyc1/xyc1^-3 + 1.0*+5*25";
        TestCaseName = "Complex: Coefficients:+5";
        TestCaseMatrixID="Coefficients:+5:3 Letter with Numerics:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        DiffWithRespTo = "xyc1";
        MaxDiffOrder = 14;
        MaxIntegreOrder = 14;
        
        EqnSolArrayMap1[1] = "5.0*xyc1^10.0+5.0*xyc1^7.0+5.0*xyc1^6.0+5.0*xyc1^4.0+125.0";
        EqnSolArrayDiffAlone[1] = "5.0*10.0*xyc1^9.0+5.0*7.0*xyc1^6.0+5.0*6.0*xyc1^5.0+5.0*4.0*xyc1^3.0+125.0*0.0";
        EqnSolArrayMap2[1] = "50.0*xyc1^9.0+35.0*xyc1^6.0+30.0*xyc1^5.0+20.0*xyc1^3.0";
        EqnSolArrayMap3[1]="5.0*xyc1^10.0+5.0*xyc1^7.0+5.0*xyc1^6.0+5.0*xyc1^4.0+125.0";
        EqnSolArrayIntegrAlone[1]="5.0/11.0*xyc1^11.0+5.0/8.0*xyc1^8.0+5.0/7.0*xyc1^7.0+5.0/5.0*xyc1^5.0+125.0*xyc1";
        EqnSolArrayMap4[1]="1.0/2.2*xyc1^11.0+1.0/1.6*xyc1^8.0+1.0/1.4*xyc1^7.0+xyc1^5.0+125.0*xyc1";
        EqnSolOrder[1] = 1;

        EqnSolArrayMap1[2] = "50.0*xyc1^9.0+35.0*xyc1^6.0+30.0*xyc1^5.0+20.0*xyc1^3.0";
        EqnSolArrayDiffAlone[2] = "50.0*9.0*xyc1^8.0+35.0*6.0*xyc1^5.0+30.0*5.0*xyc1^4.0+20.0*3.0*xyc1^2.0";
        EqnSolArrayMap2[2] = "450.0*xyc1^8.0+210.0*xyc1^5.0+150.0*xyc1^4.0+60.0*xyc1^2.0";
        EqnSolArrayMap3[2]="1.0/2.2*xyc1^11.0+1.0/1.6*xyc1^8.0+0.7142857142857143*xyc1^7.0+xyc1^5.0+125.0*xyc1";
        EqnSolArrayIntegrAlone[2]="1.0/2.2/12.0*xyc1^12.0+1.0/1.6/9.0*xyc1^9.0+0.7142857142857143/8.0*xyc1^8.0+1.0/6.0*xyc1^6.0+125.0/2.0*xyc1^2.0";
        EqnSolArrayMap4[2]="1.0/26.400000000000002*xyc1^12.0+1.0/14.4*xyc1^9.0+1.0/11.2*xyc1^8.0+1.0/6.0*xyc1^6.0+62.5*xyc1^2.0";
        EqnSolOrder[2] = 2;

        EqnSolArrayMap1[3] = "450.0*xyc1^8.0+210.0*xyc1^5.0+150.0*xyc1^4.0+60.0*xyc1^2.0";
        EqnSolArrayDiffAlone[3] = "450.0*8.0*xyc1^7.0+210.0*5.0*xyc1^4.0+150.0*4.0*xyc1^3.0+60.0*2.0*xyc1^1.0";
        EqnSolArrayMap2[3] = "3600.0*xyc1^7.0+1050.0*xyc1^4.0+600.0*xyc1^3.0+120.0*xyc1";
        EqnSolArrayMap3[3]="1.0/26.400000000000002*xyc1^12.0+1.0/14.4*xyc1^9.0+1.0/11.2*xyc1^8.0+1.0/6.0*xyc1^6.0+62.5*xyc1^2.0";
        EqnSolArrayIntegrAlone[3]="1.0/26.400000000000002/13.0*xyc1^13.0+1.0/14.4/10.0*xyc1^10.0+1.0/11.2/9.0*xyc1^9.0+1.0/6.0/7.0*xyc1^7.0+62.5/3.0*xyc1^3.0";
        EqnSolArrayMap4[3]="1.0/343.20000000000005*xyc1^13.0+1.0/144.0*xyc1^10.0+1.0/100.8*xyc1^9.0+1.0/42.0*xyc1^7.0+20.833333333333332*xyc1^3.0";
        EqnSolOrder[3] = 3;

        EqnSolArrayMap1[4] = "3600.0*xyc1^7.0+1050.0*xyc1^4.0+600.0*xyc1^3.0+120.0*xyc1";
        EqnSolArrayDiffAlone[4] = "3600.0*7.0*xyc1^6.0+1050.0*4.0*xyc1^3.0+600.0*3.0*xyc1^2.0+120.0";
        EqnSolArrayMap2[4] = "25200.0*xyc1^6.0+4200.0*xyc1^3.0+1800.0*xyc1^2.0+120.0";
        EqnSolArrayMap3[4]="1.0/343.20000000000005*xyc1^13.0+1.0/144.0*xyc1^10.0+1.0/100.8*xyc1^9.0+1.0/42.0*xyc1^7.0+20.833333333333332*xyc1^3.0";
        EqnSolArrayIntegrAlone[4]="1.0/343.20000000000005/14.0*xyc1^14.0+1.0/144.0/11.0*xyc1^11.0+1.0/100.8/10.0*xyc1^10.0+1.0/42.0/8.0*xyc1^8.0+20.833333333333332/4.0*xyc1^4.0";
        EqnSolArrayMap4[4]="1.0/4804.800000000001*xyc1^14.0+1.0/1584.0*xyc1^11.0+1.0/1008.0*xyc1^10.0+1.0/336.0*xyc1^8.0+5.208333333333333*xyc1^4.0";
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
    public static void TestCaseDiff2016() {
        //Test Case 2016
        TestCase = 2016;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";        
        EqnUnderTest = "1.0*+5*+xyc1^8/xyc1^-2 + 1.0*+5*+xyc1^5/xyc1^-2 + 1.0*+5*+xyc1^4/xyc1^-2 + 1.0*+5*+xyc1/xyc1^-2 + 1.0*+5*25";
        TestCaseName = "Complex: Coefficients:+5";
        TestCaseMatrixID="Coefficients:+5:3 Letter with Numerics:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        DiffWithRespTo = "xyc1";
        MaxDiffOrder = 14;
        MaxIntegreOrder = 14;
        
        EqnSolArrayMap1[1] = "5.0*xyc1^10.0+5.0*xyc1^7.0+5.0*xyc1^6.0+5.0*xyc1^3.0+125.0";
        EqnSolArrayDiffAlone[1] = "5.0*10.0*xyc1^9.0+5.0*7.0*xyc1^6.0+5.0*6.0*xyc1^5.0+5.0*3.0*xyc1^2.0+125.0*0.0";
        EqnSolArrayMap2[1] = "50.0*xyc1^9.0+35.0*xyc1^6.0+30.0*xyc1^5.0+15.0*xyc1^2.0";
        EqnSolArrayMap3[1]="5.0*xyc1^10.0+5.0*xyc1^7.0+5.0*xyc1^6.0+5.0*xyc1^3.0+125.0";
        EqnSolArrayIntegrAlone[1]="5.0/11.0*xyc1^11.0+5.0/8.0*xyc1^8.0+5.0/7.0*xyc1^7.0+5.0/4.0*xyc1^4.0+125.0*xyc1";
        EqnSolArrayMap4[1]="1.0/2.2*xyc1^11.0+1.0/1.6*xyc1^8.0+1.0/1.4*xyc1^7.0+1.25*xyc1^4.0+125.0*xyc1";
        EqnSolOrder[1] = 1;

        EqnSolArrayMap1[2] = "50.0*xyc1^9.0+35.0*xyc1^6.0+30.0*xyc1^5.0+15.0*xyc1^2.0";
        EqnSolArrayDiffAlone[2] = "50.0*9.0*xyc1^8.0+35.0*6.0*xyc1^5.0+30.0*5.0*xyc1^4.0+15.0*2.0*xyc1^1.0";
        EqnSolArrayMap2[2] = "450.0*xyc1^8.0+210.0*xyc1^5.0+150.0*xyc1^4.0+30.0*xyc1";
        EqnSolArrayMap3[2]="1.0/2.2*xyc1^11.0+1.0/1.6*xyc1^8.0+1.0/1.4*xyc1^7.0+1.25*xyc1^4.0+125.0*xyc1";
        EqnSolArrayIntegrAlone[2]="1.0/2.2/12.0*xyc1^12.0+1.0/1.6/9.0*xyc1^9.0+1.0/1.4/8.0*xyc1^8.0+1.25/5.0*xyc1^5.0+125.0/2.0*xyc1^2.0";
        EqnSolArrayMap4[2]="1.0/26.400000000000002*xyc1^12.0+1.0/14.4*xyc1^9.0+1.0/11.2*xyc1^8.0+1.0/4.0*xyc1^5.0+62.5*xyc1^2.0";
        EqnSolOrder[2] = 2;

        EqnSolArrayMap1[3] = "450.0*xyc1^8.0+210.0*xyc1^5.0+150.0*xyc1^4.0+30.0*xyc1";
        EqnSolArrayDiffAlone[3] = "450.0*8.0*xyc1^7.0+210.0*5.0*xyc1^4.0+150.0*4.0*xyc1^3.0+30.0";
        EqnSolArrayMap2[3] = "3600.0*xyc1^7.0+1050.0*xyc1^4.0+600.0*xyc1^3.0+30.0";
        EqnSolArrayMap3[3]="1.0/26.400000000000002*xyc1^12.0+1.0/14.4*xyc1^9.0+1.0/11.2*xyc1^8.0+1.0/4.0*xyc1^5.0+62.5*xyc1^2.0";
        EqnSolArrayIntegrAlone[3]="1.0/26.400000000000002/13.0*xyc1^13.0+1.0/14.4/10.0*xyc1^10.0+1.0/11.2/9.0*xyc1^9.0+1.0/4.0/6.0*xyc1^6.0+62.5/3.0*xyc1^3.0";
        EqnSolArrayMap4[3]="1.0/343.20000000000005*xyc1^13.0+1.0/144.0*xyc1^10.0+1.0/100.8*xyc1^9.0+1.0/24.0*xyc1^6.0+20.833333333333332*xyc1^3.0";
        EqnSolOrder[3] = 3;

        EqnSolArrayMap1[4] = "3600.0*xyc1^7.0+1050.0*xyc1^4.0+600.0*xyc1^3.0+30.0";
        EqnSolArrayDiffAlone[4] = "3600.0*7.0*xyc1^6.0+1050.0*4.0*xyc1^3.0+600.0*3.0*xyc1^2.0+30.0*0.0";
        EqnSolArrayMap2[4] = "25200.0*xyc1^6.0+4200.0*xyc1^3.0+1800.0*xyc1^2.0";
        EqnSolArrayMap3[4]="1.0/343.20000000000005*xyc1^13.0+1.0/144.0*xyc1^10.0+1.0/100.8*xyc1^9.0+1.0/24.0*xyc1^6.0+20.833333333333332*xyc1^3.0";
        EqnSolArrayIntegrAlone[4]="1.0/343.20000000000005/14.0*xyc1^14.0+1.0/144.0/11.0*xyc1^11.0+1.0/100.8/10.0*xyc1^10.0+1.0/24.0/7.0*xyc1^7.0+20.833333333333332/4.0*xyc1^4.0";
        EqnSolArrayMap4[4]="1.0/4804.800000000001*xyc1^14.0+1.0/1584.0*xyc1^11.0+1.0/1008.0*xyc1^10.0+1.0/168.0*xyc1^7.0+5.208333333333333*xyc1^4.0";
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
    public static void TestCaseDiff2017() {
        //Test Case 2017
        TestCase = 2017;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";        
        EqnUnderTest = "1.0*2^3*+5*+xyc1^8/xyc1^2*2^3 + 1.0*2^3*+5*+xyc1^5/xyc1^2*2^3 + 1.0*2^3*+5*+xyc1^4/xyc1^2*2^3 + 1.0*+5*2^3*+xyc1/xyc1^2*2^3 + 1.0*+5*25";
        TestCaseName = "Complex: Coefficients:+5";
        TestCaseMatrixID="Coefficients:+5:3 Letter with Numerics:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        DiffWithRespTo = "xyc1";
        MaxDiffOrder = 14;
        MaxIntegreOrder = 2;
        
        EqnSolArrayMap1[1] = "320.0*xyc1^6.0+320.0*xyc1^3.0+320.0*xyc1^2.0+320.0/xyc1+125.0";
        EqnSolArrayDiffAlone[1] = "320.0*6.0*xyc1^5.0+320.0*3.0*xyc1^2.0+320.0*2.0*xyc1^1.0-320.0/xyc1^2.0+125.0*0.0";
        EqnSolArrayMap2[1] = "1920.0*xyc1^5.0+960.0*xyc1^2.0+640.0*xyc1-320.0/xyc1^2.0";
        EqnSolArrayMap3[1]="320.0*xyc1^6.0+320.0*xyc1^3.0+320.0*xyc1^2.0+320.0/xyc1+125.0";
        EqnSolArrayIntegrAlone[1]="320.0/7.0*xyc1^7.0+320.0/4.0*xyc1^4.0+320.0/3.0*xyc1^3.0+320.0*ln(xyc1)+125.0*xyc1";
        EqnSolArrayMap4[1]="45.714285714285715*xyc1^7.0+80.0*xyc1^4.0+106.66666666666667*xyc1^3.0+320.0*ln(xyc1)+125.0*xyc1";
        EqnSolOrder[1] = 1;

        EqnSolArrayMap1[2] = "1920.0*xyc1^5.0+960.0*xyc1^2.0+640.0*xyc1-320.0/xyc1^2.0";
        EqnSolArrayDiffAlone[2] = "1920.0*5.0*xyc1^4.0+960.0*2.0*xyc1^1.0+640.0-320.0*-2.0/xyc1^3.0";
        EqnSolArrayMap2[2] = "9600.0*xyc1^4.0+1920.0*xyc1+640.0+640.0/xyc1^3.0";
        EqnSolArrayMap3[2]="";
        EqnSolArrayIntegrAlone[2]="";
        EqnSolArrayMap4[2]="";
        EqnSolOrder[2] = 2;

        EqnSolArrayMap1[3] = "9600.0*xyc1^4.0+1920.0*xyc1+640.0+640.0/xyc1^3.0";
        EqnSolArrayDiffAlone[3] = "9600.0*4.0*xyc1^3.0+1920.0+640.0*0.0+640.0*-3.0/xyc1^4.0";
        EqnSolArrayMap2[3] = "38400.0*xyc1^3.0+1920.0-1920.0/xyc1^4.0";
        EqnSolArrayMap3[3]="";
        EqnSolArrayIntegrAlone[3]="";
        EqnSolArrayMap4[3]="";
        EqnSolOrder[3] = 3;

        EqnSolArrayMap1[4] = "38400.0*xyc1^3.0+1920.0-1920.0/xyc1^4.0";
        EqnSolArrayDiffAlone[4] = "38400.0*3.0*xyc1^2.0+1920.0*0.0-1920.0*-4.0/xyc1^5.0";
        EqnSolArrayMap2[4] = "115200.0*xyc1^2.0+7680.0/xyc1^5.0";
        EqnSolArrayMap3[4]="";
        EqnSolArrayIntegrAlone[4]="";
        EqnSolArrayMap4[4]="";
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
    public static void TestCaseDiff2018() {
        //Test Case 4023
        UsageCalculus.TestCase = 2018;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "2^a/x^8 + 2^a/x^5 + 2^a/x^4 - 2/2^a/x- 25/2/3^a";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID = "IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;

        UsageCalculus.EqnSolArrayMap1[1] = "2.0^a/x^8.0+2.0^a/x^5.0+2.0^a/x^4.0-1.0/2.0^a*2.0/x-1.0/3.0^a*12.5";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "2.0^a*-8.0/x^9.0+2.0^a*-5.0/x^6.0+2.0^a*-4.0/x^5.0+1.0/2.0^a*2.0/x^2.0-1.0/3.0^a*12.5*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-2.0^a*8.0/x^9.0-2.0^a*5.0/x^6.0-2.0^a*4.0/x^5.0+1.0/2.0^a*2.0/x^2.0-1.0/3.0^a*0.0";
        UsageCalculus.EqnSolArrayMap3[1] = "2.0^a/x^8.0+2.0^a/x^5.0+2.0^a/x^4.0-1.0/2.0^a*2.0/x-1.0/3.0^a*12.5";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "2.0^a/-7.0/x^7.0+2.0^a/-4.0/x^4.0+2.0^a/-3.0/x^3.0-1.0/2.0^a*2.0*ln(x)-1.0/3.0^a*12.5*x";
        UsageCalculus.EqnSolArrayMap4[1] = "-2.0^a/7.0/x^7.0-2.0^a/4.0/x^4.0-2.0^a/3.0/x^3.0-1.0/2.0^a*2.0*ln(x)-1.0/3.0^a*12.5*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-2.0^a*8.0/x^9.0-2.0^a*5.0/x^6.0-2.0^a*4.0/x^5.0+1.0/2.0^a*2.0/x^2.0-1.0/3.0^a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-2.0^a*8.0*-9.0/x^10.0-2.0^a*5.0*-6.0/x^7.0-2.0^a*4.0*-5.0/x^6.0+1.0/2.0^a*2.0*-2.0/x^3.0-1.0/3.0^a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "2.0^a*72.0/x^10.0+2.0^a*30.0/x^7.0+2.0^a*20.0/x^6.0-1.0/2.0^a*4.0/x^3.0-1.0/3.0^a*0.0";
        UsageCalculus.EqnSolArrayMap3[2] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "";
        UsageCalculus.EqnSolArrayMap4[2] = "";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "2.0^a*72.0/x^10.0+2.0^a*30.0/x^7.0+2.0^a*20.0/x^6.0-1.0/2.0^a*4.0/x^3.0-1.0/3.0^a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "2.0^a*72.0*-10.0/x^11.0+2.0^a*30.0*-7.0/x^8.0+2.0^a*20.0*-6.0/x^7.0-1.0/2.0^a*4.0*-3.0/x^4.0-1.0/3.0^a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-2.0^a*720.0/x^11.0-2.0^a*210.0/x^8.0-2.0^a*120.0/x^7.0+1.0/2.0^a*12.0/x^4.0-1.0/3.0^a*0.0";
        UsageCalculus.EqnSolArrayMap3[3] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "";
        UsageCalculus.EqnSolArrayMap4[3] = "";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-2.0^a*720.0/x^11.0-2.0^a*210.0/x^8.0-2.0^a*120.0/x^7.0+1.0/2.0^a*12.0/x^4.0-1.0/3.0^a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-2.0^a*720.0*-11.0/x^12.0-2.0^a*210.0*-8.0/x^9.0-2.0^a*120.0*-7.0/x^8.0+1.0/2.0^a*12.0*-4.0/x^5.0-1.0/3.0^a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "2.0^a*7920.0/x^12.0+2.0^a*1680.0/x^9.0+2.0^a*840.0/x^8.0-1.0/2.0^a*48.0/x^5.0-1.0/3.0^a*0.0";
        UsageCalculus.EqnSolArrayMap3[4] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "";
        UsageCalculus.EqnSolArrayMap4[4] = "";
        UsageCalculus.EqnSolOrder[4] = 4;

        UsageCalculus.EqnSolArrayMap1[5] = "";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "";
        UsageCalculus.EqnSolArrayMap2[5] = "";
        UsageCalculus.EqnSolArrayMap3[5] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
        UsageCalculus.EqnSolArrayMap4[5] = "";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "";
        UsageCalculus.EqnSolArrayMap2[6] = "";
        UsageCalculus.EqnSolArrayMap3[6] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
        UsageCalculus.EqnSolArrayMap4[6] = "";
        UsageCalculus.EqnSolOrder[6] = 6;

        UsageCalculus.EqnSolArrayMap1[7] = "";
        UsageCalculus.EqnSolArrayDiffAlone[7] = "";
        UsageCalculus.EqnSolArrayMap2[7] = "";
        UsageCalculus.EqnSolArrayMap3[7] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
        UsageCalculus.EqnSolArrayMap4[7] = "";
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
    
    public static void TestCaseDiff2019() {
        //Test Case 2019
        TestCase = 2019;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";        
        EqnUnderTest = "1.0*+5*+xyc1^8/xyc1^-1 + 1.0*+5*+xyc1^5/xyc1^-1 + 1.0*+5*+xyc1^4/xyc1^-1 + 1.0*+5*+xyc1/xyc1^-1 + 1.0*+5*25";
        TestCaseName = "Complex: Coefficients:+5";
        TestCaseMatrixID="Coefficients:+5:3 Letter with Numerics:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        DiffWithRespTo = "xyc1";
        MaxDiffOrder = 14;
        MaxIntegreOrder = 14;
        
        EqnSolArrayMap1[1] = "5.0*xyc1^9.0+5.0*xyc1^6.0+5.0*xyc1^5.0+5.0*xyc1^2.0+125.0";
        EqnSolArrayDiffAlone[1] = "5.0*9.0*xyc1^8.0+5.0*6.0*xyc1^5.0+5.0*5.0*xyc1^4.0+5.0*2.0*xyc1^1.0+125.0*0.0";
        EqnSolArrayMap2[1] = "45.0*xyc1^8.0+30.0*xyc1^5.0+25.0*xyc1^4.0+10.0*xyc1";
        EqnSolArrayMap3[1]="5.0*xyc1^9.0+5.0*xyc1^6.0+5.0*xyc1^5.0+5.0*xyc1^2.0+125.0";
        EqnSolArrayIntegrAlone[1]="5.0/10.0*xyc1^10.0+5.0/7.0*xyc1^7.0+5.0/6.0*xyc1^6.0+5.0/3.0*xyc1^3.0+125.0*xyc1";
        EqnSolArrayMap4[1]="1.0/2.0*xyc1^10.0+1.0/1.4*xyc1^7.0+1.0/1.2*xyc1^6.0+1.6666666666666667*xyc1^3.0+125.0*xyc1";
        EqnSolOrder[1] = 1;

        EqnSolArrayMap1[2] = "45.0*xyc1^8.0+30.0*xyc1^5.0+25.0*xyc1^4.0+10.0*xyc1";
        EqnSolArrayDiffAlone[2] = "45.0*8.0*xyc1^7.0+30.0*5.0*xyc1^4.0+25.0*4.0*xyc1^3.0+10.0";
        EqnSolArrayMap2[2] = "360.0*xyc1^7.0+150.0*xyc1^4.0+100.0*xyc1^3.0+10.0";
        EqnSolArrayMap3[2]="1.0/2.0*xyc1^10.0+1.0/1.4*xyc1^7.0+1.0/1.2*xyc1^6.0+1.6666666666666667*xyc1^3.0+125.0*xyc1";
        EqnSolArrayIntegrAlone[2]="1.0/2.0/11.0*xyc1^11.0+1.0/1.4/8.0*xyc1^8.0+1.0/1.2/7.0*xyc1^7.0+1.6666666666666667/4.0*xyc1^4.0+125.0/2.0*xyc1^2.0";
        EqnSolArrayMap4[2]="1.0/22.0*xyc1^11.0+1.0/11.2*xyc1^8.0+1.0/8.4*xyc1^7.0+1.0/2.4*xyc1^4.0+62.5*xyc1^2.0";
        EqnSolOrder[2] = 2;

        EqnSolArrayMap1[3] = "360.0*xyc1^7.0+150.0*xyc1^4.0+100.0*xyc1^3.0+10.0";
        EqnSolArrayDiffAlone[3] = "360.0*7.0*xyc1^6.0+150.0*4.0*xyc1^3.0+100.0*3.0*xyc1^2.0+10.0*0.0";
        EqnSolArrayMap2[3] = "2520.0*xyc1^6.0+600.0*xyc1^3.0+300.0*xyc1^2.0";
        EqnSolArrayMap3[3]="1.0/22.0*xyc1^11.0+1.0/11.2*xyc1^8.0+1.0/8.4*xyc1^7.0+1.0/2.4*xyc1^4.0+62.5*xyc1^2.0";
        EqnSolArrayIntegrAlone[3]="1.0/22.0/12.0*xyc1^12.0+1.0/11.2/9.0*xyc1^9.0+1.0/8.4/8.0*xyc1^8.0+1.0/2.4/5.0*xyc1^5.0+62.5/3.0*xyc1^3.0";
        EqnSolArrayMap4[3]="1.0/264.0*xyc1^12.0+1.0/100.8*xyc1^9.0+1.0/67.2*xyc1^8.0+1.0/12.0*xyc1^5.0+20.833333333333332*xyc1^3.0";
        EqnSolOrder[3] = 3;

        EqnSolArrayMap1[4] = "2520.0*xyc1^6.0+600.0*xyc1^3.0+300.0*xyc1^2.0";
        EqnSolArrayDiffAlone[4] = "2520.0*6.0*xyc1^5.0+600.0*3.0*xyc1^2.0+300.0*2.0*xyc1^1.0";
        EqnSolArrayMap2[4] = "15120.0*xyc1^5.0+1800.0*xyc1^2.0+600.0*xyc1";
        EqnSolArrayMap3[4]="1.0/264.0*xyc1^12.0+1.0/100.8*xyc1^9.0+1.0/67.2*xyc1^8.0+1.0/12.0*xyc1^5.0+20.833333333333332*xyc1^3.0";
        EqnSolArrayIntegrAlone[4]="1.0/264.0/13.0*xyc1^13.0+1.0/100.8/10.0*xyc1^10.0+1.0/67.2/9.0*xyc1^9.0+1.0/12.0/6.0*xyc1^6.0+20.833333333333332/4.0*xyc1^4.0";
        EqnSolArrayMap4[4]="1.0/3432.0*xyc1^13.0+1.0/1008.0*xyc1^10.0+1.0/604.8000000000001*xyc1^9.0+1.0/72.0*xyc1^6.0+5.208333333333333*xyc1^4.0";
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
    public static void TestCaseDiff2020() {
        //Test Case 2020
        TestCase = 2020;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";        
        EqnUnderTest = "1.0*+5*+xyc1^8/xyc1^1 + 1.0*+5*+xyc1^5/xyc1^1 + 1.0*+5*+xyc1^4/xyc1^1 + 1.0*+5*+xyc1/xyc1^1 + 1.0*+5*25";
        TestCaseName = "Complex: Coefficients:+5";
        TestCaseMatrixID="Coefficients:+5:3 Letter with Numerics:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        DiffWithRespTo = "xyc1";
        MaxDiffOrder = 14;
        MaxIntegreOrder = 2;
        
        EqnSolArrayMap1[1] = "5.0*xyc1^7.0+5.0*xyc1^4.0+5.0*xyc1^3.0+5.0+125.0";
        EqnSolArrayDiffAlone[1] = "5.0*7.0*xyc1^6.0+5.0*4.0*xyc1^3.0+5.0*3.0*xyc1^2.0+5.0*0.0+125.0*0.0";
        EqnSolArrayMap2[1] = "35.0*xyc1^6.0+20.0*xyc1^3.0+15.0*xyc1^2.0";
        EqnSolArrayMap3[1]="5.0*xyc1^7.0+5.0*xyc1^4.0+5.0*xyc1^3.0+5.0+125.0";
        EqnSolArrayIntegrAlone[1]="5.0/8.0*xyc1^8.0+5.0/5.0*xyc1^5.0+5.0/4.0*xyc1^4.0+5.0*xyc1+125.0*xyc1";
        EqnSolArrayMap4[1]="1.0/1.6*xyc1^8.0+xyc1^5.0+1.25*xyc1^4.0+5.0*xyc1+125.0*xyc1";
        EqnSolOrder[1] = 1;

        EqnSolArrayMap1[2] = "35.0*xyc1^6.0+20.0*xyc1^3.0+15.0*xyc1^2.0";
        EqnSolArrayDiffAlone[2] = "35.0*6.0*xyc1^5.0+20.0*3.0*xyc1^2.0+15.0*2.0*xyc1^1.0";
        EqnSolArrayMap2[2] = "210.0*xyc1^5.0+60.0*xyc1^2.0+30.0*xyc1";
        EqnSolArrayMap3[2]="";
        EqnSolArrayIntegrAlone[2]="";
        EqnSolArrayMap4[2]="";
        EqnSolOrder[2] = 2;

        EqnSolArrayMap1[3] = "210.0*xyc1^5.0+60.0*xyc1^2.0+30.0*xyc1";
        EqnSolArrayDiffAlone[3] = "210.0*5.0*xyc1^4.0+60.0*2.0*xyc1^1.0+30.0";
        EqnSolArrayMap2[3] = "1050.0*xyc1^4.0+120.0*xyc1+30.0";
        EqnSolArrayMap3[3]="";
        EqnSolArrayIntegrAlone[3]="";
        EqnSolArrayMap4[3]="";
        EqnSolOrder[3] = 3;

        EqnSolArrayMap1[4] = "1050.0*xyc1^4.0+120.0*xyc1+30.0";
        EqnSolArrayDiffAlone[4] = "1050.0*4.0*xyc1^3.0+120.0+30.0*0.0";
        EqnSolArrayMap2[4] = "4200.0*xyc1^3.0+120.0";
        EqnSolArrayMap3[4]="";
        EqnSolArrayIntegrAlone[4]="";
        EqnSolArrayMap4[4]="";
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
    public static void TestCaseDiff2021() {
        //Test Case 2021
        TestCase = 2021;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";        
        EqnUnderTest = "1.0*+5*+xyc1^8/xyc1^-4 + 1.0*+5*+xyc1^5/xyc1^-3 + 1.0*+5*+xyc1^4/xyc1^-7 + 1.0*+5*+xyc1/xyc1^-9 + 1.0*+5*25";
        TestCaseName = "Complex: Coefficients:+5";
        TestCaseMatrixID="Coefficients:+5:3 Letter with Numerics:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        DiffWithRespTo = "xyc1";
        MaxDiffOrder = 14;
        MaxIntegreOrder = 14;
        
        EqnSolArrayMap1[1] = "5.0*xyc1^12.0+5.0*xyc1^8.0+5.0*xyc1^11.0+5.0*xyc1^10.0+125.0";
        EqnSolArrayDiffAlone[1] = "5.0*12.0*xyc1^11.0+5.0*8.0*xyc1^7.0+5.0*11.0*xyc1^10.0+5.0*10.0*xyc1^9.0+125.0*0.0";
        EqnSolArrayMap2[1] = "60.0*xyc1^11.0+40.0*xyc1^7.0+55.0*xyc1^10.0+50.0*xyc1^9.0";
        EqnSolArrayMap3[1]="5.0*xyc1^12.0+5.0*xyc1^8.0+5.0*xyc1^11.0+5.0*xyc1^10.0+125.0";
        EqnSolArrayIntegrAlone[1]="5.0/13.0*xyc1^13.0+5.0/9.0*xyc1^9.0+5.0/12.0*xyc1^12.0+5.0/11.0*xyc1^11.0+125.0*xyc1";
        EqnSolArrayMap4[1]="1.0/2.6*xyc1^13.0+1.0/1.8*xyc1^9.0+1.0/2.4*xyc1^12.0+1.0/2.2*xyc1^11.0+125.0*xyc1";
        EqnSolOrder[1] = 1;

        EqnSolArrayMap1[2] = "60.0*xyc1^11.0+40.0*xyc1^7.0+55.0*xyc1^10.0+50.0*xyc1^9.0";
        EqnSolArrayDiffAlone[2] = "60.0*11.0*xyc1^10.0+40.0*7.0*xyc1^6.0+55.0*10.0*xyc1^9.0+50.0*9.0*xyc1^8.0";
        EqnSolArrayMap2[2] = "660.0*xyc1^10.0+280.0*xyc1^6.0+550.0*xyc1^9.0+450.0*xyc1^8.0";
        EqnSolArrayMap3[2]="1.0/2.6*xyc1^13.0+1.0/1.8*xyc1^9.0+1.0/2.4*xyc1^12.0+1.0/2.2*xyc1^11.0+125.0*xyc1";
        EqnSolArrayIntegrAlone[2]="1.0/2.6/14.0*xyc1^14.0+1.0/1.8/10.0*xyc1^10.0+1.0/2.4/13.0*xyc1^13.0+1.0/2.2/12.0*xyc1^12.0+125.0/2.0*xyc1^2.0";
        EqnSolArrayMap4[2]="1.0/36.4*xyc1^14.0+1.0/18.0*xyc1^10.0+1.0/31.2*xyc1^13.0+1.0/26.400000000000002*xyc1^12.0+62.5*xyc1^2.0";
        EqnSolOrder[2] = 2;

        EqnSolArrayMap1[3] = "660.0*xyc1^10.0+280.0*xyc1^6.0+550.0*xyc1^9.0+450.0*xyc1^8.0";
        EqnSolArrayDiffAlone[3] = "660.0*10.0*xyc1^9.0+280.0*6.0*xyc1^5.0+550.0*9.0*xyc1^8.0+450.0*8.0*xyc1^7.0";
        EqnSolArrayMap2[3] = "6600.0*xyc1^9.0+1680.0*xyc1^5.0+4950.0*xyc1^8.0+3600.0*xyc1^7.0";
        EqnSolArrayMap3[3]="1.0/36.4*xyc1^14.0+1.0/18.0*xyc1^10.0+1.0/31.2*xyc1^13.0+1.0/26.400000000000002*xyc1^12.0+62.5*xyc1^2.0";
        EqnSolArrayIntegrAlone[3]="1.0/36.4/15.0*xyc1^15.0+1.0/18.0/11.0*xyc1^11.0+1.0/31.2/14.0*xyc1^14.0+1.0/26.400000000000002/13.0*xyc1^13.0+62.5/3.0*xyc1^3.0";
        EqnSolArrayMap4[3]="1.0/546.0*xyc1^15.0+1.0/198.0*xyc1^11.0+1.0/436.8*xyc1^14.0+1.0/343.20000000000005*xyc1^13.0+20.833333333333332*xyc1^3.0";
        EqnSolOrder[3] = 3;

        EqnSolArrayMap1[4] = "6600.0*xyc1^9.0+1680.0*xyc1^5.0+4950.0*xyc1^8.0+3600.0*xyc1^7.0";
        EqnSolArrayDiffAlone[4] = "6600.0*9.0*xyc1^8.0+1680.0*5.0*xyc1^4.0+4950.0*8.0*xyc1^7.0+3600.0*7.0*xyc1^6.0";
        EqnSolArrayMap2[4] = "59400.0*xyc1^8.0+8400.0*xyc1^4.0+39600.0*xyc1^7.0+25200.0*xyc1^6.0";
        EqnSolArrayMap3[4]="1.0/546.0*xyc1^15.0+1.0/198.0*xyc1^11.0+1.0/436.8*xyc1^14.0+1.0/343.20000000000005*xyc1^13.0+20.833333333333332*xyc1^3.0";
        EqnSolArrayIntegrAlone[4]="1.0/546.0/16.0*xyc1^16.0+1.0/198.0/12.0*xyc1^12.0+1.0/436.8/15.0*xyc1^15.0+1.0/343.20000000000005/14.0*xyc1^14.0+20.833333333333332/4.0*xyc1^4.0";
        EqnSolArrayMap4[4]="1.0/8736.0*xyc1^16.0+1.0/2376.0*xyc1^12.0+1.0/6552.0*xyc1^15.0+1.0/4804.800000000001*xyc1^14.0+5.208333333333333*xyc1^4.0";
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
    public static void TestCaseDiff2022() {
        //Test Case 2022
        TestCase = 2022;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";        
        EqnUnderTest = "Xn^2+2*Xn+4";
        TestCaseName = "Complex: Coefficients:+5";
        TestCaseMatrixID="Coefficients:+5:3 Letter with Numerics:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        DiffWithRespTo = "Xn";
        MaxDiffOrder = 14;
        MaxIntegreOrder = 14;
        
        EqnSolArrayMap1[1] = "Xn^2.0+2.0*Xn+4.0";
        EqnSolArrayDiffAlone[1] = "2.0*Xn^1.0+2.0+4.0*0.0";
        EqnSolArrayMap2[1] = "2.0*Xn+2.0";
        EqnSolArrayMap3[1]="Xn^2.0+2.0*Xn+4.0";
        EqnSolArrayIntegrAlone[1]="1.0/3.0*Xn^3.0+Xn^2.0+4.0*Xn";
        EqnSolArrayMap4[1]="0.3333333333333333*Xn^3.0+Xn^2.0+4.0*Xn";
        EqnSolOrder[1] = 1;

        EqnSolArrayMap1[2] = "2.0*Xn+2.0";
        EqnSolArrayDiffAlone[2] = "2.0+2.0*0.0";
        EqnSolArrayMap2[2] = "2.0";
        EqnSolArrayMap3[2]="0.3333333333333333*Xn^3.0+Xn^2.0+4.0*Xn";
        EqnSolArrayIntegrAlone[2]="0.3333333333333333/4.0*Xn^4.0+1.0/3.0*Xn^3.0+4.0/2.0*Xn^2.0";
        EqnSolArrayMap4[2]="1.0/12.0*Xn^4.0+1.0/3.0*Xn^3.0+2.0*Xn^2.0";
        EqnSolOrder[2] = 2;

        EqnSolArrayMap1[3] = "2.0";
        EqnSolArrayDiffAlone[3] = "0.0";
        EqnSolArrayMap2[3] = "";
        EqnSolArrayMap3[3]="1.0/12.0*Xn^4.0+1.0/3.0*Xn^3.0+2.0*Xn^2.0";
        EqnSolArrayIntegrAlone[3]="1.0/12.0/5.0*Xn^5.0+1.0/3.0/4.0*Xn^4.0+2.0/3.0*Xn^3.0";
        EqnSolArrayMap4[3]="1.0/60.0*Xn^5.0+1.0/12.0*Xn^4.0+1.0/1.5*Xn^3.0";
        EqnSolOrder[3] = 3;

        EqnSolArrayMap1[4] = "";
        EqnSolArrayDiffAlone[4] = "";
        EqnSolArrayMap2[4] = "";
        EqnSolArrayMap3[4]="1.0/60.0*Xn^5.0+1.0/12.0*Xn^4.0+1.0/1.5*Xn^3.0";
        EqnSolArrayIntegrAlone[4]="1.0/60.0/6.0*Xn^6.0+1.0/12.0/5.0*Xn^5.0+1.0/1.5/4.0*Xn^4.0";
        EqnSolArrayMap4[4]="1.0/360.0*Xn^6.0+1.0/60.0*Xn^5.0+1.0/6.0*Xn^4.0";
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
    public static void TestCaseDiff2023() {
        //Test Case 50010
        UsageCalculus.TestCase = 2023;
        UsageCalculus.EqnRegressionDiffStatus = "All RED Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All RED Including Values";        
        UsageCalculus.EqnUnderTest = "1.0*1.0*+p*xyc1^8 + 1.0*+p*xyc1^5 + 1.0*+p*xyc1^4 + 1.0*+p*xyc1 + 1.0*+p*25*1.0/1.0";
        UsageCalculus.TestCaseName = "Simple: Coefficients:+a";
        UsageCalculus.TestCaseMatrixID="Coefficients:+a:3 Letter with Numerics:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "p*xyc1^8.0+p*xyc1^5.0+p*xyc1^4.0+p*xyc1+p*25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "p*8.0*xyc1^7.0+p*5.0*xyc1^4.0+p*4.0*xyc1^3.0+p+p*25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "p*8.0*xyc1^7.0+p*5.0*xyc1^4.0+p*4.0*xyc1^3.0+p+p*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="p*xyc1^8.0+p*xyc1^5.0+p*xyc1^4.0+p*xyc1+p*25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="p/9.0*xyc1^9.0+p/6.0*xyc1^6.0+p/5.0*xyc1^5.0+p/2.0*xyc1^2.0+p*25.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="p/9.0*xyc1^9.0+p/6.0*xyc1^6.0+p/5.0*xyc1^5.0+p/2.0*xyc1^2.0+p*25.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "p*8.0*xyc1^7.0+p*5.0*xyc1^4.0+p*4.0*xyc1^3.0+p+p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "p*8.0*7.0*xyc1^6.0+p*5.0*4.0*xyc1^3.0+p*4.0*3.0*xyc1^2.0+p*0.0+p*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "p*56.0*xyc1^6.0+p*20.0*xyc1^3.0+p*12.0*xyc1^2.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="p/9.0*xyc1^9.0+p/6.0*xyc1^6.0+p/5.0*xyc1^5.0+p/2.0*xyc1^2.0+p*25.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="p/9.0/10.0*xyc1^10.0+p/6.0/7.0*xyc1^7.0+p/5.0/6.0*xyc1^6.0+p/2.0/3.0*xyc1^3.0+p*25.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="p*0.011111111111111112*xyc1^10.0+p*0.023809523809523808*xyc1^7.0+p*0.03333333333333333*xyc1^6.0+p*0.16666666666666666*xyc1^3.0+p*12.5*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "p*56.0*xyc1^6.0+p*20.0*xyc1^3.0+p*12.0*xyc1^2.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "p*56.0*6.0*xyc1^5.0+p*20.0*3.0*xyc1^2.0+p*12.0*2.0*xyc1^1.0+p*0.0*0.0+p*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "p*336.0*xyc1^5.0+p*60.0*xyc1^2.0+p*24.0*xyc1+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="p*0.011111111111111112*xyc1^10.0+p*0.023809523809523808*xyc1^7.0+p*0.03333333333333333*xyc1^6.0+p*0.16666666666666666*xyc1^3.0+p*12.5*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="p*0.011111111111111112/11.0*xyc1^11.0+p*0.023809523809523808/8.0*xyc1^8.0+p*0.03333333333333333/7.0*xyc1^7.0+p*0.16666666666666666/4.0*xyc1^4.0+p*12.5/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="p*0.00101010101010101*xyc1^11.0+p*0.002976190476190476*xyc1^8.0+p*0.0047619047619047615*xyc1^7.0+p*0.041666666666666664*xyc1^4.0+p*4.166666666666667*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "p*336.0*xyc1^5.0+p*60.0*xyc1^2.0+p*24.0*xyc1+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "p*336.0*5.0*xyc1^4.0+p*60.0*2.0*xyc1^1.0+p*24.0+p*0.0*0.0+p*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "p*1680.0*xyc1^4.0+p*120.0*xyc1+p*24.0+p*0.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="p*0.00101010101010101*xyc1^11.0+p*0.002976190476190476*xyc1^8.0+p*0.0047619047619047615*xyc1^7.0+p*0.041666666666666664*xyc1^4.0+p*4.166666666666667*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="p*0.00101010101010101/12.0*xyc1^12.0+p*0.002976190476190476/9.0*xyc1^9.0+p*0.0047619047619047615/8.0*xyc1^8.0+p*0.041666666666666664/5.0*xyc1^5.0+p*4.166666666666667/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="p*8.417508417508418E-5*xyc1^12.0+p*3.3068783068783067E-4*xyc1^9.0+p*5.952380952380952E-4*xyc1^8.0+p*0.008333333333333333*xyc1^5.0+p*1.0416666666666667*xyc1^4.0";
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
    public static void TestCaseDiff2024() {
        //Test Case 2024
        TestCase = 2024;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";        
        EqnUnderTest = "y^(1/2)-2.0";
        TestCaseName = "Complex: Coefficients:+5";
        TestCaseMatrixID="Coefficients:+5:3 Letter with Numerics:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        DiffWithRespTo = "y";
        MaxDiffOrder = 14;
        MaxIntegreOrder = 14;
        
        EqnSolArrayMap1[1] = "y^0.5-2.0";
        EqnSolArrayDiffAlone[1] = "";
        EqnSolArrayMap2[1] = "";
        EqnSolArrayMap3[1]="y^0.5-2.0";
        EqnSolArrayIntegrAlone[1]="1.0/1.5*y^1.5-2.0*y";
        EqnSolArrayMap4[1]="1.0/1.5*y^1.5-2.0*y";
        EqnSolOrder[1] = 1;

        EqnSolArrayMap1[2] = "";
        EqnSolArrayDiffAlone[2] = "";
        EqnSolArrayMap2[2] = "";
        EqnSolArrayMap3[2]="1.0/1.5*y^1.5-2.0*y";
        EqnSolArrayIntegrAlone[2]="1.0/1.5/2.5*y^2.5-y^2.0";
        EqnSolArrayMap4[2]="0.26666666666666666*y^2.5-y^2.0";
        EqnSolOrder[2] = 2;

        EqnSolArrayMap1[3] = "";
        EqnSolArrayDiffAlone[3] = "";
        EqnSolArrayMap2[3] = "";
        EqnSolArrayMap3[3]="0.26666666666666666*y^2.5-y^2.0";
        EqnSolArrayIntegrAlone[3]="0.26666666666666666/3.5*y^3.5-1.0/3.0*y^3.0";
        EqnSolArrayMap4[3]="1.0/13.125*y^3.5-1.0/3.0*y^3.0";
        EqnSolOrder[3] = 3;

        EqnSolArrayMap1[4] = "";
        EqnSolArrayDiffAlone[4] = "";
        EqnSolArrayMap2[4] = "";
        EqnSolArrayMap3[4]="1.0/13.125*y^3.5-1.0/3.0*y^3.0";
        EqnSolArrayIntegrAlone[4]="1.0/13.125/4.5*y^4.5-1.0/3.0/4.0*y^4.0";
        EqnSolArrayMap4[4]="1.0/59.0625*y^4.5-1.0/12.0*y^4.0";
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
    public static void TestCaseDiff2025() {
        //Test Case 2005
        TestCase = 2025;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";
        EqnUnderTest = "(a+c+a^2)*x^8 + (a+c+a^2)*x^5 + (a+c+a^2)*x^4 - (a+c+a^2)*x - 25";
        TestCaseName = "Simple: Coefficients:";
        TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        DiffWithRespTo = "x";
        MaxDiffOrder = 14;
        MaxIntegreOrder = 14;
        
        EqnSolArrayMap1[1] = "(a+c+a^2.0)*x^8.0+(a+c+a^2.0)*x^5.0+(a+c+a^2.0)*x^4.0-(a+c+a^2.0)*x-25.0";
        EqnSolArrayDiffAlone[1] = "(a+c+a^2.0)+(a+c+a^2.0)+(a+c+a^2.0)-(a+c+a^2.0)-25.0*0.0";
        EqnSolArrayMap2[1] = "(a+c+a^2.0)+(a+c+a^2.0)+(a+c+a^2.0)-(a+c+a^2.0)";
        EqnSolArrayMap3[1]="x^8.0*(a+c+a^2.0)+x^5.0*(a+c+a^2.0)+x^4.0*(a+c+a^2.0)-x*(a+c+a^2.0)-25.0";
        EqnSolArrayIntegrAlone[1]="1.0/9.0*x^9.0*(a+c+a^2.0)+1.0/6.0*x^6.0*(a+c+a^2.0)+1.0/5.0*x^5.0*(a+c+a^2.0)-1.0/2.0*(a+c+a^2.0)*x^2.0-25.0*x";
        EqnSolArrayMap4[1]="0.1111111111111111*x^9.0*(a+c+a^2.0)+0.16666666666666666*x^6.0*(a+c+a^2.0)+0.2*x^5.0*(a+c+a^2.0)-0.5*x^2.0-25.0*x";
        EqnSolOrder[1] = 1;

        EqnSolArrayMap1[2] = "8.0*x^7.0*(a+c+a^2.0)+5.0*x^4.0*(a+c+a^2.0)+4.0*x^3.0*(a+c+a^2.0)-(a+c+a^2.0)";
        EqnSolArrayDiffAlone[2] = "8.0*7.0*x^6.0*(a+c+a^2.0)+5.0*4.0*x^3.0*(a+c+a^2.0)+4.0*3.0*x^2.0*(a+c+a^2.0)-0.0";
        EqnSolArrayMap2[2] = "56.0*x^6.0*(a+c+a^2.0)+20.0*x^3.0*(a+c+a^2.0)+12.0*x^2.0*(a+c+a^2.0)-0.0";
        EqnSolArrayMap3[2]="0.1111111111111111*x^9.0*(a+c+a^2.0)+0.16666666666666666*x^6.0*(a+c+a^2.0)+0.2*x^5.0*(a+c+a^2.0)-0.5*x^2.0-25.0*x";
        EqnSolArrayIntegrAlone[2]="0.1111111111111111/10.0*x^10.0*(a+c+a^2.0)+0.16666666666666666/7.0*x^7.0*(a+c+a^2.0)+0.2/6.0*x^6.0*(a+c+a^2.0)-0.5/3.0*x^3.0-25.0/2.0*x^2.0";
        EqnSolArrayMap4[2]="0.01111111111111111*x^10.0*(a+c+a^2.0)+0.023809523809523808*x^7.0*(a+c+a^2.0)+0.03333333333333333*x^6.0*(a+c+a^2.0)-0.16666666666666666*x^3.0-12.5*x^2.0";
        EqnSolOrder[2] = 2;

        EqnSolArrayMap1[3] = "";
        EqnSolArrayDiffAlone[3] = "";
        EqnSolArrayMap2[3] = "";
        EqnSolArrayMap3[3]="0.01111111111111111*x^10.0*(a+c+a^2.0)+0.023809523809523808*x^7.0*(a+c+a^2.0)+0.03333333333333333*x^6.0*(a+c+a^2.0)-0.16666666666666666*x^3.0-12.5*x^2.0";
        EqnSolArrayIntegrAlone[3]="0.01111111111111111/11.0*x^11.0*(a+c+a^2.0)+0.023809523809523808/8.0*x^8.0*(a+c+a^2.0)+0.03333333333333333/7.0*x^7.0*(a+c+a^2.0)-0.16666666666666666/4.0*x^4.0-12.5/3.0*x^3.0";
        EqnSolArrayMap4[3]="0.0010101010101010099*x^11.0*(a+c+a^2.0)+0.002976190476190476*x^8.0*(a+c+a^2.0)+0.0047619047619047615*x^7.0*(a+c+a^2.0)-0.041666666666666664*x^4.0-4.166666666666667*x^3.0";
        EqnSolOrder[3] = 3;

        EqnSolArrayMap1[4] = "";
        EqnSolArrayDiffAlone[4] = "";
        EqnSolArrayMap2[4] = "";
        EqnSolArrayMap3[4]="0.0010101010101010099*x^11.0*(a+c+a^2.0)+0.002976190476190476*x^8.0*(a+c+a^2.0)+0.0047619047619047615*x^7.0*(a+c+a^2.0)-0.041666666666666664*x^4.0-4.166666666666667*x^3.0";
        EqnSolArrayIntegrAlone[4]="0.0010101010101010099/12.0*x^12.0*(a+c+a^2.0)+0.002976190476190476/9.0*x^9.0*(a+c+a^2.0)+0.0047619047619047615/8.0*x^8.0*(a+c+a^2.0)-0.041666666666666664/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        EqnSolArrayMap4[4]="8.417508417508415E-5*x^12.0*(a+c+a^2.0)+3.3068783068783067E-4*x^9.0*(a+c+a^2.0)+5.952380952380952E-4*x^8.0*(a+c+a^2.0)-0.008333333333333333*x^5.0-1.0416666666666667*x^4.0";
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
        public static void TestCaseDiff2026() {
        //Test Case 2005
        TestCase = 2026;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";
        EqnUnderTest = "(a+c+x*a^2)*x^8 + (a+c+x*a^2)*x^5 + (a+c+x*a^2)*x^4 - (a+c+x*a^2)*x - 25";
        TestCaseName = "Simple: Coefficients:";
        TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        DiffWithRespTo = "x";
        MaxDiffOrder = 14;
        MaxIntegreOrder = 14;
        
        EqnSolArrayMap1[1] = "(a+c+x*a^2.0)*x^8.0+(a+c+x*a^2.0)*x^5.0+(a+c+x*a^2.0)*x^4.0-(a+c+x*a^2.0)*x-25.0";
        EqnSolArrayDiffAlone[1] = "(a+c+x*a^2.0)*8.0*x^7.0+x^8.0*(a*0.0+c*0.0+a^2.0)+(a+c+x*a^2.0)*5.0*x^4.0+x^5.0*(a*0.0+c*0.0+a^2.0)+(a+c+x*a^2.0)*4.0*x^3.0+x^4.0*(a*0.0+c*0.0+a^2.0)-(a+c+x*a^2.0)*1.0+x*(a*0.0+c*0.0+a^2.0)-25.0*0.0";
        EqnSolArrayMap2[1] = "8.0*(a+c+x*a^2.0)*x^7.0+x^8.0+5.0*(a+c+x*a^2.0)*x^4.0+x^5.0+4.0*(a+c+x*a^2.0)*x^3.0+x^4.0-(a+c+x*a^2.0)+x";
        EqnSolArrayMap3[1]="(a+c+x*a^2.0)*x^8.0+(a+c+x*a^2.0)*x^5.0+(a+c+x*a^2.0)*x^4.0-(a+c+x*a^2.0)*x-25.0";
        EqnSolArrayIntegrAlone[1]="a*x^9.0+c*x+a^2.0/2.0*x^2.0-a*0.8888888888888888*x^9.0+c*0.8888888888888888*x^9.0+a^2.0*0.025*x^10.0+a*x^6.0+c*x+a^2.0/2.0*x^2.0-a*0.8333333333333334*x^6.0+c*0.8333333333333334*x^6.0+a^2.0*0.05714285714285715*x^7.0+a*x^5.0+c*x+a^2.0/2.0*x^2.0-a*0.8*x^5.0+c*0.8*x^5.0+a^2.0*0.08333333333333333*x^6.0-a*x^2.0+c*x+a^2.0/2.0*x^2.0-a*a*2.0*x^2.0+c*c*2.0*x^2.0+a^2.0*0.6666666666666666*x^3.0-25.0*x";
        EqnSolArrayMap4[1]="a*x^9.0+c*x+a^2.0/2.0*x^2.0-a*0.8888888888888888*x^9.0+c*0.8888888888888888*x^9.0+a^2.0*0.025*x^10.0+a*x^6.0+c*x+a^2.0/2.0*x^2.0-a*0.8333333333333334*x^6.0+c*0.8333333333333334*x^6.0+a^2.0*0.05714285714285715*x^7.0+a*x^5.0+c*x+a^2.0/2.0*x^2.0-a*0.8*x^5.0+c*0.8*x^5.0+a^2.0*0.08333333333333333*x^6.0-a*x^2.0+c*x+a^2.0/2.0*x^2.0-a*a*2.0*x^2.0+c*c*2.0*x^2.0+a^2.0*0.6666666666666666*x^3.0-25.0*x";
        EqnSolOrder[1] = 1;

        EqnSolArrayMap1[2] = "8.0*x^7.0*(a+c+x*a^2.0)+x^8.0*(a*0.0+c*0.0+a^2.0)+5.0*(a+c+x*a^2.0)+x^5.0*(a*0.0+c*0.0+a^2.0)+4.0*(a+c+x*a^2.0)+x^4.0*(a*0.0+c*0.0+a^2.0)-x*(a*0.0+c*0.0+a^2.0)+c*0.0+a^2.0";
        EqnSolArrayDiffAlone[2] = "(a+c+x*a^2.0)*8.0*7.0*x^6.0+(a*0.0+c*0.0+a^2.0)*8.0*x^7.0+8.0*x^7.0*(a*0.0+c*0.0+a^2.0)+5.0*(a*0.0+c*0.0+a^2.0)+5.0*x^4.0*(a*0.0+c*0.0+a^2.0)+4.0*(a*0.0+c*0.0+a^2.0)+4.0*x^3.0*(a*0.0+c*0.0+a^2.0)-(a*0.0+c*0.0+a^2.0)+c*0.0";
        EqnSolArrayMap2[2] = "56.0*x^6.0*(a+c+x*a^2.0)+8.0*(a*0.0+c*0.0+a^2.0)+8.0*x^7.0*(a*0.0+c*0.0+a^2.0)+5.0*(a*0.0+c*0.0+a^2.0)+5.0*x^4.0*(a*0.0+c*0.0+a^2.0)+4.0*(a*0.0+c*0.0+a^2.0)+4.0*x^3.0*(a*0.0+c*0.0+a^2.0)-0.0*(a*0.0+c*0.0+a^2.0)+c*0.0";
        EqnSolArrayMap3[2]="a*x^9.0+c*x+a^2.0/2.0*x^2.0-a*0.8888888888888888*x^9.0+c*0.8888888888888888*x^9.0+a^2.0*0.025*x^10.0+a*x^6.0+c*x+a^2.0/2.0*x^2.0-a*0.8333333333333334*x^6.0+c*0.8333333333333334*x^6.0+a^2.0*0.05714285714285715*x^7.0+a*x^5.0+c*x+a^2.0/2.0*x^2.0-a*0.8*x^5.0+c*0.8*x^5.0+a^2.0*0.08333333333333333*x^6.0-a*x^2.0+c*x+a^2.0/2.0*x^2.0-a*a*2.0*x^2.0+c*c*2.0*x^2.0+a^2.0*0.6666666666666666*x^3.0-25.0*x";
        EqnSolArrayIntegrAlone[2]="a/10.0*x^10.0+c/2.0*x^2.0+a^2.0/2.0/3.0*x^3.0-a*0.8888888888888888/10.0*x^10.0+c*0.8888888888888888/10.0*x^10.0+a^2.0*0.025/11.0*x^11.0+a/7.0*x^7.0+c/2.0*x^2.0+a^2.0/2.0/3.0*x^3.0-a*0.8333333333333334/7.0*x^7.0+c*0.8333333333333334/7.0*x^7.0+a^2.0*0.05714285714285715/8.0*x^8.0+a/6.0*x^6.0+c/2.0*x^2.0+a^2.0/2.0/3.0*x^3.0-a*0.8/6.0*x^6.0+c*0.8/6.0*x^6.0+a^2.0*0.08333333333333333/7.0*x^7.0-a/3.0*x^3.0+c/2.0*x^2.0+a^2.0/2.0/3.0*x^3.0-a*a*2.0/3.0*x^3.0+c*c*2.0/3.0*x^3.0+a^2.0*0.6666666666666666/4.0*x^4.0-25.0/2.0*x^2.0";
        EqnSolArrayMap4[2]="a/10.0*x^10.0+c/2.0*x^2.0+a^2.0/6.0*x^3.0-a*0.08888888888888888*x^10.0+c*0.08888888888888888*x^10.0+a^2.0*0.002272727272727273*x^11.0+a/7.0*x^7.0+c/2.0*x^2.0+a^2.0/6.0*x^3.0-a*0.11904761904761905*x^7.0+c*0.11904761904761905*x^7.0+a^2.0*0.0071428571428571435*x^8.0+a/6.0*x^6.0+c/2.0*x^2.0+a^2.0/6.0*x^3.0-a*0.13333333333333333*x^6.0+c*0.13333333333333333*x^6.0+a^2.0*0.011904761904761904*x^7.0-a/3.0*x^3.0+c/2.0*x^2.0+a^2.0/6.0*x^3.0-a*a*0.6666666666666666*x^3.0+c*c*0.6666666666666666*x^3.0+a^2.0*0.16666666666666666*x^4.0-12.5*x^2.0";
        EqnSolOrder[2] = 2;

        EqnSolArrayMap1[3] = "";
        EqnSolArrayDiffAlone[3] = "";
        EqnSolArrayMap2[3] = "";
        EqnSolArrayMap3[3]="a/10.0*x^10.0+c/2.0*x^2.0+a^2.0/6.0*x^3.0-a*0.08888888888888888*x^10.0+c*0.08888888888888888*x^10.0+a^2.0*0.002272727272727273*x^11.0+a/7.0*x^7.0+c/2.0*x^2.0+a^2.0/6.0*x^3.0-a*0.11904761904761905*x^7.0+c*0.11904761904761905*x^7.0+a^2.0*0.0071428571428571435*x^8.0+a/6.0*x^6.0+c/2.0*x^2.0+a^2.0/6.0*x^3.0-a*0.13333333333333333*x^6.0+c*0.13333333333333333*x^6.0+a^2.0*0.011904761904761904*x^7.0-a/3.0*x^3.0+c/2.0*x^2.0+a^2.0/6.0*x^3.0-a*a*0.6666666666666666*x^3.0+c*c*0.6666666666666666*x^3.0+a^2.0*0.16666666666666666*x^4.0-12.5*x^2.0";
        EqnSolArrayIntegrAlone[3]="a/10.0/11.0*x^11.0+c/2.0/3.0*x^3.0+a^2.0/6.0/4.0*x^4.0-a*0.08888888888888888/11.0*x^11.0+c*0.08888888888888888/11.0*x^11.0+a^2.0*0.002272727272727273/12.0*x^12.0+a/7.0/8.0*x^8.0+c/2.0/3.0*x^3.0+a^2.0/6.0/4.0*x^4.0-a*0.11904761904761905/8.0*x^8.0+c*0.11904761904761905/8.0*x^8.0+a^2.0*0.0071428571428571435/9.0*x^9.0+a/6.0/7.0*x^7.0+c/2.0/3.0*x^3.0+a^2.0/6.0/4.0*x^4.0-a*0.13333333333333333/7.0*x^7.0+c*0.13333333333333333/7.0*x^7.0+a^2.0*0.011904761904761904/8.0*x^8.0-a/3.0/4.0*x^4.0+c/2.0/3.0*x^3.0+a^2.0/6.0/4.0*x^4.0-a*a*0.6666666666666666/4.0*x^4.0+c*c*0.6666666666666666/4.0*x^4.0+a^2.0*0.16666666666666666/5.0*x^5.0-12.5/3.0*x^3.0";
        EqnSolArrayMap4[3]="a/110.0*x^11.0+c/6.0*x^3.0+a^2.0/24.0*x^4.0-a*0.008080808080808079*x^11.0+c*0.008080808080808079*x^11.0+a^2.0*1.8939393939393942E-4*x^12.0+a/56.0*x^8.0+c/6.0*x^3.0+a^2.0/24.0*x^4.0-a*0.014880952380952382*x^8.0+c*0.014880952380952382*x^8.0+a^2.0*7.936507936507938E-4*x^9.0+a/42.0*x^7.0+c/6.0*x^3.0+a^2.0/24.0*x^4.0-a*0.019047619047619046*x^7.0+c*0.019047619047619046*x^7.0+a^2.0*0.001488095238095238*x^8.0-a/12.0*x^4.0+c/6.0*x^3.0+a^2.0/24.0*x^4.0-a*a*0.16666666666666666*x^4.0+c*c*0.16666666666666666*x^4.0+a^2.0*0.03333333333333333*x^5.0-4.166666666666667*x^3.0";
        EqnSolOrder[3] = 3;

        EqnSolArrayMap1[4] = "";
        EqnSolArrayDiffAlone[4] = "";
        EqnSolArrayMap2[4] = "";
        EqnSolArrayMap3[4]="a/110.0*x^11.0+c/6.0*x^3.0+a^2.0/24.0*x^4.0-a*0.008080808080808079*x^11.0+c*0.008080808080808079*x^11.0+a^2.0*1.8939393939393942E-4*x^12.0+a/56.0*x^8.0+c/6.0*x^3.0+a^2.0/24.0*x^4.0-a*0.014880952380952382*x^8.0+c*0.014880952380952382*x^8.0+a^2.0*7.936507936507938E-4*x^9.0+a/42.0*x^7.0+c/6.0*x^3.0+a^2.0/24.0*x^4.0-a*0.019047619047619046*x^7.0+c*0.019047619047619046*x^7.0+a^2.0*0.001488095238095238*x^8.0-a/12.0*x^4.0+c/6.0*x^3.0+a^2.0/24.0*x^4.0-a*a*0.16666666666666666*x^4.0+c*c*0.16666666666666666*x^4.0+a^2.0*0.03333333333333333*x^5.0-4.166666666666667*x^3.0";
        EqnSolArrayIntegrAlone[4]="a/110.0/12.0*x^12.0+c/6.0/4.0*x^4.0+a^2.0/24.0/5.0*x^5.0-a*0.008080808080808079/12.0*x^12.0+c*0.008080808080808079/12.0*x^12.0+a^2.0*1.8939393939393942E-4/13.0*x^13.0+a/56.0/9.0*x^9.0+c/6.0/4.0*x^4.0+a^2.0/24.0/5.0*x^5.0-a*0.014880952380952382/9.0*x^9.0+c*0.014880952380952382/9.0*x^9.0+a^2.0*7.936507936507938E-4/10.0*x^10.0+a/42.0/8.0*x^8.0+c/6.0/4.0*x^4.0+a^2.0/24.0/5.0*x^5.0-a*0.019047619047619046/8.0*x^8.0+c*0.019047619047619046/8.0*x^8.0+a^2.0*0.001488095238095238/9.0*x^9.0-a/12.0/5.0*x^5.0+c/6.0/4.0*x^4.0+a^2.0/24.0/5.0*x^5.0-a*a*0.16666666666666666/5.0*x^5.0+c*c*0.16666666666666666/5.0*x^5.0+a^2.0*0.03333333333333333/6.0*x^6.0-4.166666666666667/4.0*x^4.0";
        EqnSolArrayMap4[4]="a/1320.0*x^12.0+c/24.0*x^4.0+a^2.0/120.0*x^5.0-a*6.734006734006732E-4*x^12.0+c*6.734006734006732E-4*x^12.0+a^2.0*1.456876456876457E-5*x^13.0+a/504.0*x^9.0+c/24.0*x^4.0+a^2.0/120.0*x^5.0-a*0.0016534391534391536*x^9.0+c*0.0016534391534391536*x^9.0+a^2.0*7.936507936507938E-5*x^10.0+a/336.0*x^8.0+c/24.0*x^4.0+a^2.0/120.0*x^5.0-a*0.0023809523809523807*x^8.0+c*0.0023809523809523807*x^8.0+a^2.0*1.6534391534391533E-4*x^9.0-a/60.0*x^5.0+c/24.0*x^4.0+a^2.0/120.0*x^5.0-a*a*0.03333333333333333*x^5.0+c*c*0.03333333333333333*x^5.0+a^2.0*0.005555555555555556*x^6.0-1.0416666666666667*x^4.0";
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
        public static void TestCaseDiff2027() {
        //Test Case 2005
        TestCase = 2027;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";
        EqnUnderTest = "x + x + x - x - 25";
        TestCaseName = "Simple: Coefficients:";
        TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        DiffWithRespTo = "x";
        MaxDiffOrder = 3;
        MaxIntegreOrder = 14;
        
        EqnSolArrayMap1[1] = "x+x+x-x-25.0";
        EqnSolArrayDiffAlone[1] = "1.0+1.0+1.0-1.0-25.0*0.0";
        EqnSolArrayMap2[1] = "1.0+1.0+1.0-1.0";
        EqnSolArrayMap3[1]="x+x+x-x-25.0";
        EqnSolArrayIntegrAlone[1]="1.0/2.0*x^2.0+1.0/2.0*x^2.0+1.0/2.0*x^2.0-1.0/2.0*x^2.0-25.0*x";
        EqnSolArrayMap4[1]="1.0/2.0*x^2.0+1.0/2.0*x^2.0+1.0/2.0*x^2.0-1.0/2.0*x^2.0-25.0*x";
        EqnSolOrder[1] = 1;

        EqnSolArrayMap1[2] = "1.0+1.0+1.0-1.0";
        EqnSolArrayDiffAlone[2] = "0.0+1.0*0.0+1.0*0.0-1.0*0.0";
        EqnSolArrayMap2[2] = "";
        EqnSolArrayMap3[2]="1.0/2.0*x^2.0+1.0/2.0*x^2.0+1.0/2.0*x^2.0-1.0/2.0*x^2.0-25.0*x";
        EqnSolArrayIntegrAlone[2]="1.0/2.0/3.0*x^3.0+1.0/2.0/3.0*x^3.0+1.0/2.0/3.0*x^3.0-1.0/2.0/3.0*x^3.0-25.0/2.0*x^2.0";
        EqnSolArrayMap4[2]="1.0/6.0*x^3.0+1.0/6.0*x^3.0+1.0/6.0*x^3.0-1.0/6.0*x^3.0-12.5*x^2.0";
        EqnSolOrder[2] = 2;

        EqnSolArrayMap1[3] = "";
        EqnSolArrayDiffAlone[3] = "";
        EqnSolArrayMap2[3] = "";
        EqnSolArrayMap3[3]="1.0/6.0*x^3.0+1.0/6.0*x^3.0+1.0/6.0*x^3.0-1.0/6.0*x^3.0-12.5*x^2.0";
        EqnSolArrayIntegrAlone[3]="1.0/6.0/4.0*x^4.0+1.0/6.0/4.0*x^4.0+1.0/6.0/4.0*x^4.0-1.0/6.0/4.0*x^4.0-12.5/3.0*x^3.0";
        EqnSolArrayMap4[3]="1.0/24.0*x^4.0+1.0/24.0*x^4.0+1.0/24.0*x^4.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        EqnSolOrder[3] = 3;

        EqnSolArrayMap1[4] = "";
        EqnSolArrayDiffAlone[4] = "";
        EqnSolArrayMap2[4] = "";
        EqnSolArrayMap3[4]="1.0/24.0*x^4.0+1.0/24.0*x^4.0+1.0/24.0*x^4.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        EqnSolArrayIntegrAlone[4]="1.0/24.0/5.0*x^5.0+1.0/24.0/5.0*x^5.0+1.0/24.0/5.0*x^5.0-1.0/24.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        EqnSolArrayMap4[4]="1.0/120.0*x^5.0+1.0/120.0*x^5.0+1.0/120.0*x^5.0-1.0/120.0*x^5.0-1.0416666666666667*x^4.0";
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
     public static void TestCaseDiff2028() {
        //Test Case 2005
        TestCase = 2028;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";
        EqnUnderTest = "1.0 + 2.0 + 3.0 - 4.0 - 25";
        TestCaseName = "Simple: Coefficients:";
        TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        DiffWithRespTo = "x";
        MaxDiffOrder = 3;
        MaxIntegreOrder = 14;
        
        EqnSolArrayMap1[1] = "1.0+2.0+3.0-4.0-25.0";
        EqnSolArrayDiffAlone[1] = "0.0+2.0*0.0+3.0*0.0-4.0*0.0-25.0*0.0";
        EqnSolArrayMap2[1] = "";
        EqnSolArrayMap3[1]="1.0+2.0+3.0-4.0-25.0";
        EqnSolArrayIntegrAlone[1]="1.0*x+2.0*x+3.0*x-4.0*x-25.0*x";
        EqnSolArrayMap4[1]="x+2.0*x+3.0*x-4.0*x-25.0*x";
        EqnSolOrder[1] = 1;

        EqnSolArrayMap1[2] = "";
        EqnSolArrayDiffAlone[2] = "";
        EqnSolArrayMap2[2] = "";
        EqnSolArrayMap3[2]="x+2.0*x+3.0*x-4.0*x-25.0*x";
        EqnSolArrayIntegrAlone[2]="1.0/2.0*x^2.0+x^2.0+3.0/2.0*x^2.0-4.0/2.0*x^2.0-25.0/2.0*x^2.0";
        EqnSolArrayMap4[2]="0.5*x^2.0+x^2.0+1.5*x^2.0-2.0*x^2.0-12.5*x^2.0";
        EqnSolOrder[2] = 2;

        EqnSolArrayMap1[3] = "";
        EqnSolArrayDiffAlone[3] = "";
        EqnSolArrayMap2[3] = "";
        EqnSolArrayMap3[3]="0.5*x^2.0+x^2.0+1.5*x^2.0-2.0*x^2.0-12.5*x^2.0";
        EqnSolArrayIntegrAlone[3]="0.5/3.0*x^3.0+1.0/3.0*x^3.0+1.5/3.0*x^3.0-2.0/3.0*x^3.0-12.5/3.0*x^3.0";
        EqnSolArrayMap4[3]="1.0/6.0*x^3.0+1.0/3.0*x^3.0+1.0/2.0*x^3.0-1.0/1.5*x^3.0-4.166666666666667*x^3.0";
        EqnSolOrder[3] = 3;

        EqnSolArrayMap1[4] = "";
        EqnSolArrayDiffAlone[4] = "";
        EqnSolArrayMap2[4] = "";
        EqnSolArrayMap3[4]="1.0/6.0*x^3.0+1.0/3.0*x^3.0+1.0/2.0*x^3.0-1.0/1.5*x^3.0-4.166666666666667*x^3.0";
        EqnSolArrayIntegrAlone[4]="1.0/6.0/4.0*x^4.0+1.0/3.0/4.0*x^4.0+1.0/2.0/4.0*x^4.0-1.0/1.5/4.0*x^4.0-4.166666666666667/4.0*x^4.0";
        EqnSolArrayMap4[4]="1.0/24.0*x^4.0+1.0/12.0*x^4.0+1.0/8.0*x^4.0-1.0/6.0*x^4.0-1.0416666666666667*x^4.0";
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
     public static void TestCaseDiff2029() {
        //Test Case 2005
        TestCase = 2029;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";
        EqnUnderTest = "(a+c+a^2*x)*x^8 + (a+c+a^2*x)*x^5 + (a+c+a^2*x)/x^4 - (a+c+a^2*x)*x - 25";
        TestCaseName = "Simple: Coefficients:";
        TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        DiffWithRespTo = "x";
        MaxDiffOrder = 2;
        MaxIntegreOrder = 14;
        
        EqnSolArrayMap1[1] = "(a+c+a^2.0*x)*x^8.0+(a+c+a^2.0*x)*x^5.0+(a+c+a^2.0*x)/x^4.0-(a+c+a^2.0*x)*x-25.0";
        EqnSolArrayDiffAlone[1] = "(a+c+a^2.0*x)*8.0*x^7.0+x^8.0*(a*0.0+c*0.0+a^2.0)+(a+c+a^2.0*x)*5.0*x^4.0+x^5.0*(a*0.0+c*0.0+a^2.0)+(x^4.0*(a*0.0+c*0.0+a^2.0)-(a+c+a^2.0*x)*4.0*x^3.0)x^4.0*x^4.0-(a+c+a^2.0*x)*1.0+x*(a*0.0+c*0.0+a^2.0)-25.0*0.0";
        EqnSolArrayMap2[1] = "8.0*x^7.0*(a+c+a^2.0*x)+x^8.0*(a*0.0+c*0.0+a^2.0)+5.0*(a+c+a^2.0*x)+x^5.0*(a*0.0+c*0.0+a^2.0)+4.0*(a+c+a^2.0*x)+x^4.0*(a*0.0+c*0.0+a^2.0)-(a+c+a^2.0*x)+x*(a*0.0+c*0.0+a^2.0)";
        EqnSolArrayMap3[1]="x^8.0*(a+c+a^2.0*x)+x^5.0*(a+c+a^2.0*x)+x^4.0*(a+c+a^2.0*x)-x*(a+c+a^2.0*x)-25.0";
        EqnSolArrayIntegrAlone[1]="a*x^9.0+c*x+a^2.0/2.0*x^2.0-a*0.8888888888888888*x^9.0+c*0.8888888888888888*x^9.0+a^2.0*0.025*x^10.0+a*x^6.0+c*x+a^2.0/2.0*x^2.0-a*0.8333333333333334*x^6.0+c*0.8333333333333334*x^6.0+a^2.0*0.05714285714285715*x^7.0+a*x^5.0+c*x+a^2.0/2.0*x^2.0-a*0.8*x^5.0+c*0.8*x^5.0+a^2.0*0.08333333333333333*x^6.0-a*x^2.0+c*x+a^2.0/2.0*x^2.0-a*a*2.0*x^2.0+c*c*2.0*x^2.0+a^2.0*0.6666666666666666*x^3.0-25.0*x";
        EqnSolArrayMap4[1]="a*x^9.0+c*x+a^2.0/2.0*x^2.0-a*0.8888888888888888*x^9.0+c*0.8888888888888888*x^9.0+a^2.0*0.025*x^10.0+a*x^6.0+c*x+a^2.0/2.0*x^2.0-a*0.8333333333333334*x^6.0+c*0.8333333333333334*x^6.0+a^2.0*0.05714285714285715*x^7.0+a*x^5.0+c*x+a^2.0/2.0*x^2.0-a*0.8*x^5.0+c*0.8*x^5.0+a^2.0*0.08333333333333333*x^6.0-a*x^2.0+c*x+a^2.0/2.0*x^2.0-a*a*2.0*x^2.0+c*c*2.0*x^2.0+a^2.0*0.6666666666666666*x^3.0-25.0*x";
        EqnSolOrder[1] = 1;

        EqnSolArrayMap1[2] = "";
        EqnSolArrayDiffAlone[2] = "";
        EqnSolArrayMap2[2] = "";
        EqnSolArrayMap3[2]="a*x^9.0+c*x+a^2.0/2.0*x^2.0-a*0.8888888888888888*x^9.0+c*0.8888888888888888*x^9.0+a^2.0*0.025*x^10.0+a*x^6.0+c*x+a^2.0/2.0*x^2.0-a*0.8333333333333334*x^6.0+c*0.8333333333333334*x^6.0+a^2.0*0.05714285714285715*x^7.0+a*x^5.0+c*x+a^2.0/2.0*x^2.0-a*0.8*x^5.0+c*0.8*x^5.0+a^2.0*0.08333333333333333*x^6.0-a*x^2.0+c*x+a^2.0/2.0*x^2.0-a*a*2.0*x^2.0+c*c*2.0*x^2.0+a^2.0*0.6666666666666666*x^3.0-25.0*x";
        EqnSolArrayIntegrAlone[2]="a/10.0*x^10.0+c/2.0*x^2.0+a^2.0/2.0/3.0*x^3.0-a*0.8888888888888888/10.0*x^10.0+c*0.8888888888888888/10.0*x^10.0+a^2.0*0.025/11.0*x^11.0+a/7.0*x^7.0+c/2.0*x^2.0+a^2.0/2.0/3.0*x^3.0-a*0.8333333333333334/7.0*x^7.0+c*0.8333333333333334/7.0*x^7.0+a^2.0*0.05714285714285715/8.0*x^8.0+a/6.0*x^6.0+c/2.0*x^2.0+a^2.0/2.0/3.0*x^3.0-a*0.8/6.0*x^6.0+c*0.8/6.0*x^6.0+a^2.0*0.08333333333333333/7.0*x^7.0-a/3.0*x^3.0+c/2.0*x^2.0+a^2.0/2.0/3.0*x^3.0-a*a*2.0/3.0*x^3.0+c*c*2.0/3.0*x^3.0+a^2.0*0.6666666666666666/4.0*x^4.0-25.0/2.0*x^2.0";
        EqnSolArrayMap4[2]="a/10.0*x^10.0+c/2.0*x^2.0+a^2.0/6.0*x^3.0-a*0.08888888888888888*x^10.0+c*0.08888888888888888*x^10.0+a^2.0*0.002272727272727273*x^11.0+a/7.0*x^7.0+c/2.0*x^2.0+a^2.0/6.0*x^3.0-a*0.11904761904761905*x^7.0+c*0.11904761904761905*x^7.0+a^2.0*0.0071428571428571435*x^8.0+a/6.0*x^6.0+c/2.0*x^2.0+a^2.0/6.0*x^3.0-a*0.13333333333333333*x^6.0+c*0.13333333333333333*x^6.0+a^2.0*0.011904761904761904*x^7.0-a/3.0*x^3.0+c/2.0*x^2.0+a^2.0/6.0*x^3.0-a*a*0.6666666666666666*x^3.0+c*c*0.6666666666666666*x^3.0+a^2.0*0.16666666666666666*x^4.0-12.5*x^2.0";
        EqnSolOrder[2] = 2;

        EqnSolArrayMap1[3] = "";
        EqnSolArrayDiffAlone[3] = "";
        EqnSolArrayMap2[3] = "";
        EqnSolArrayMap3[3]="a/10.0*x^10.0+c/2.0*x^2.0+a^2.0/6.0*x^3.0-a*0.08888888888888888*x^10.0+c*0.08888888888888888*x^10.0+a^2.0*0.002272727272727273*x^11.0+a/7.0*x^7.0+c/2.0*x^2.0+a^2.0/6.0*x^3.0-a*0.11904761904761905*x^7.0+c*0.11904761904761905*x^7.0+a^2.0*0.0071428571428571435*x^8.0+a/6.0*x^6.0+c/2.0*x^2.0+a^2.0/6.0*x^3.0-a*0.13333333333333333*x^6.0+c*0.13333333333333333*x^6.0+a^2.0*0.011904761904761904*x^7.0-a/3.0*x^3.0+c/2.0*x^2.0+a^2.0/6.0*x^3.0-a*a*0.6666666666666666*x^3.0+c*c*0.6666666666666666*x^3.0+a^2.0*0.16666666666666666*x^4.0-12.5*x^2.0";
        EqnSolArrayIntegrAlone[3]="a/10.0/11.0*x^11.0+c/2.0/3.0*x^3.0+a^2.0/6.0/4.0*x^4.0-a*0.08888888888888888/11.0*x^11.0+c*0.08888888888888888/11.0*x^11.0+a^2.0*0.002272727272727273/12.0*x^12.0+a/7.0/8.0*x^8.0+c/2.0/3.0*x^3.0+a^2.0/6.0/4.0*x^4.0-a*0.11904761904761905/8.0*x^8.0+c*0.11904761904761905/8.0*x^8.0+a^2.0*0.0071428571428571435/9.0*x^9.0+a/6.0/7.0*x^7.0+c/2.0/3.0*x^3.0+a^2.0/6.0/4.0*x^4.0-a*0.13333333333333333/7.0*x^7.0+c*0.13333333333333333/7.0*x^7.0+a^2.0*0.011904761904761904/8.0*x^8.0-a/3.0/4.0*x^4.0+c/2.0/3.0*x^3.0+a^2.0/6.0/4.0*x^4.0-a*a*0.6666666666666666/4.0*x^4.0+c*c*0.6666666666666666/4.0*x^4.0+a^2.0*0.16666666666666666/5.0*x^5.0-12.5/3.0*x^3.0";
        EqnSolArrayMap4[3]="a/110.0*x^11.0+c/6.0*x^3.0+a^2.0/24.0*x^4.0-a*0.008080808080808079*x^11.0+c*0.008080808080808079*x^11.0+a^2.0*1.8939393939393942E-4*x^12.0+a/56.0*x^8.0+c/6.0*x^3.0+a^2.0/24.0*x^4.0-a*0.014880952380952382*x^8.0+c*0.014880952380952382*x^8.0+a^2.0*7.936507936507938E-4*x^9.0+a/42.0*x^7.0+c/6.0*x^3.0+a^2.0/24.0*x^4.0-a*0.019047619047619046*x^7.0+c*0.019047619047619046*x^7.0+a^2.0*0.001488095238095238*x^8.0-a/12.0*x^4.0+c/6.0*x^3.0+a^2.0/24.0*x^4.0-a*a*0.16666666666666666*x^4.0+c*c*0.16666666666666666*x^4.0+a^2.0*0.03333333333333333*x^5.0-4.166666666666667*x^3.0";
        EqnSolOrder[3] = 3;

        EqnSolArrayMap1[4] = "";
        EqnSolArrayDiffAlone[4] = "";
        EqnSolArrayMap2[4] = "";
        EqnSolArrayMap3[4]="a/110.0*x^11.0+c/6.0*x^3.0+a^2.0/24.0*x^4.0-a*0.008080808080808079*x^11.0+c*0.008080808080808079*x^11.0+a^2.0*1.8939393939393942E-4*x^12.0+a/56.0*x^8.0+c/6.0*x^3.0+a^2.0/24.0*x^4.0-a*0.014880952380952382*x^8.0+c*0.014880952380952382*x^8.0+a^2.0*7.936507936507938E-4*x^9.0+a/42.0*x^7.0+c/6.0*x^3.0+a^2.0/24.0*x^4.0-a*0.019047619047619046*x^7.0+c*0.019047619047619046*x^7.0+a^2.0*0.001488095238095238*x^8.0-a/12.0*x^4.0+c/6.0*x^3.0+a^2.0/24.0*x^4.0-a*a*0.16666666666666666*x^4.0+c*c*0.16666666666666666*x^4.0+a^2.0*0.03333333333333333*x^5.0-4.166666666666667*x^3.0";
        EqnSolArrayIntegrAlone[4]="a/110.0/12.0*x^12.0+c/6.0/4.0*x^4.0+a^2.0/24.0/5.0*x^5.0-a*0.008080808080808079/12.0*x^12.0+c*0.008080808080808079/12.0*x^12.0+a^2.0*1.8939393939393942E-4/13.0*x^13.0+a/56.0/9.0*x^9.0+c/6.0/4.0*x^4.0+a^2.0/24.0/5.0*x^5.0-a*0.014880952380952382/9.0*x^9.0+c*0.014880952380952382/9.0*x^9.0+a^2.0*7.936507936507938E-4/10.0*x^10.0+a/42.0/8.0*x^8.0+c/6.0/4.0*x^4.0+a^2.0/24.0/5.0*x^5.0-a*0.019047619047619046/8.0*x^8.0+c*0.019047619047619046/8.0*x^8.0+a^2.0*0.001488095238095238/9.0*x^9.0-a/12.0/5.0*x^5.0+c/6.0/4.0*x^4.0+a^2.0/24.0/5.0*x^5.0-a*a*0.16666666666666666/5.0*x^5.0+c*c*0.16666666666666666/5.0*x^5.0+a^2.0*0.03333333333333333/6.0*x^6.0-4.166666666666667/4.0*x^4.0";
        EqnSolArrayMap4[4]="a/1320.0*x^12.0+c/24.0*x^4.0+a^2.0/120.0*x^5.0-a*6.734006734006732E-4*x^12.0+c*6.734006734006732E-4*x^12.0+a^2.0*1.456876456876457E-5*x^13.0+a/504.0*x^9.0+c/24.0*x^4.0+a^2.0/120.0*x^5.0-a*0.0016534391534391536*x^9.0+c*0.0016534391534391536*x^9.0+a^2.0*7.936507936507938E-5*x^10.0+a/336.0*x^8.0+c/24.0*x^4.0+a^2.0/120.0*x^5.0-a*0.0023809523809523807*x^8.0+c*0.0023809523809523807*x^8.0+a^2.0*1.6534391534391533E-4*x^9.0-a/60.0*x^5.0+c/24.0*x^4.0+a^2.0/120.0*x^5.0-a*a*0.03333333333333333*x^5.0+c*c*0.03333333333333333*x^5.0+a^2.0*0.005555555555555556*x^6.0-1.0416666666666667*x^4.0";
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
     public static void TestCaseDiff2030() {
        //Test Case 2005
        TestCase = 2030;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";
        EqnUnderTest = "(a+c+x*a^2)*x^8 + (a+c+x*a^2)*x^5 + (a+c+x*a^2)/x^4 - (a+c+x*a^2)*x - 25";
        TestCaseName = "Simple: Coefficients:";
        TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        DiffWithRespTo = "x";
        MaxDiffOrder = 14;
        MaxIntegreOrder = 2;
        
        EqnSolArrayMap1[1] = "(a+c+x*a^2.0)*x^8.0+(a+c+x*a^2.0)*x^5.0+(a+c+x*a^2.0)/x^4.0-(a+c+x*a^2.0)*x-25.0";
        EqnSolArrayDiffAlone[1] = "(a+c+x*a^2.0)*8.0*x^7.0+x^8.0*(a*0.0+c*0.0+a^2.0)+(a+c+x*a^2.0)*5.0*x^4.0+x^5.0*(a*0.0+c*0.0+a^2.0)+(x^4.0*(a*0.0+c*0.0+a^2.0)-(a+c+x*a^2.0)*4.0*x^3.0)x^4.0*x^4.0-(a+c+x*a^2.0)*1.0+x*(a*0.0+c*0.0+a^2.0)-25.0*0.0";
        EqnSolArrayMap2[1] = "8.0*x^7.0*(a+c+a^2.0)+5.0*x^4.0*(a+c+a^2.0)+4.0*x^3.0*(a+c+a^2.0)-(a+c+a^2.0)";
        EqnSolArrayMap3[1]="x^8.0*(a+c+x*a^2.0)+x^5.0*(a+c+x*a^2.0)+x^-4.0*(a+c+x*a^2.0)-x*(a+c+x*a^2.0)-25.0";
        EqnSolArrayIntegrAlone[1]="x^8.0*(a+c+a^2.0)+x^5.0*(a+c+a^2.0)+x^-4.0*(a+c+a^2.0)-x*(a+c+a^2.0)-25.0";
        EqnSolArrayMap4[1]="x^8.0*(a+c+a^2.0)+x^5.0*(a+c+a^2.0)+x^-4.0*(a+c+a^2.0)-x*(a+c+a^2.0)-25.0";
        EqnSolOrder[1] = 1;

        EqnSolArrayMap1[2] = "";
        EqnSolArrayDiffAlone[2] = "";
        EqnSolArrayMap2[2] = "";
        EqnSolArrayMap3[2]="";
        EqnSolArrayIntegrAlone[2]="";
        EqnSolArrayMap4[2]="";
        EqnSolOrder[2] = 2;

        EqnSolArrayMap1[3] = "";
        EqnSolArrayDiffAlone[3] = "";
        EqnSolArrayMap2[3] = "";
        EqnSolArrayMap3[3]="";
        EqnSolArrayIntegrAlone[3]="";
        EqnSolArrayMap4[3]="";
        EqnSolOrder[3] = 3;

        EqnSolArrayMap1[4] = "";
        EqnSolArrayDiffAlone[4] = "";
        EqnSolArrayMap2[4] = "";
        EqnSolArrayMap3[4]="";
        EqnSolArrayIntegrAlone[4]="";
        EqnSolArrayMap4[4]="";
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
     /* **************************************** */
        /* ***************IndConstant Test Case***************** */
        /* **************************************** */
     public static void TestCaseDiff2031() {
        //Test Case 2005
        TestCase = 2031;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";
        EqnUnderTest = "(a+b+a^2)*x^8 + (a+b+a^2)*x^5 + (a+b+a^2)*x^4 - (a+b+a^2)*x - 25";
        TestCaseName = "Simple: Coefficients:";
        TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        DiffWithRespTo = "x";
        MaxDiffOrder = 14;
        MaxIntegreOrder = 14;
        
        EqnSolArrayMap1[1] = "(a+b+a^2.0)*x^8.0+(a+b+a^2.0)*x^5.0+(a+b+a^2.0)*x^4.0-(a+b+a^2.0)*x-25.0";
        EqnSolArrayDiffAlone[1] = "(a+b+a^2.0)+(a+b+a^2.0)+(a+b+a^2.0)-(a+b+a^2.0)-25.0*0.0";
        EqnSolArrayMap2[1] = "8.0*x^7.0*(a+b+a^2.0)+5.0*x^4.0*(a+b+a^2.0)+4.0*x^3.0*(a+b+a^2.0)-(a+b+a^2.0)";
        EqnSolArrayMap3[1]="(a+b+a^2.0)*x^8.0+(a+b+a^2.0)*x^5.0+(a+b+a^2.0)*x^4.0-(a+b+a^2.0)*x-25.0";
        EqnSolArrayIntegrAlone[1]="(a+b+a^2.0)/9.0*x^9.0+(a+b+a^2.0)/6.0*x^6.0+(a+b+a^2.0)/5.0*x^5.0-(a+b+a^2.0)/2.0*x^2.0-25.0*x";
        EqnSolArrayMap4[1]="(a+b+a^2.0)/9.0*x^9.0+(a+b+a^2.0)/6.0*x^6.0+(a+b+a^2.0)/5.0*x^5.0-(a+b+a^2.0)/2.0*x^2.0-25.0*x";
        EqnSolOrder[1] = 1;

        EqnSolArrayMap1[2] = "8.0*x^7.0*(a+b+a^2.0)+5.0*x^4.0*(a+b+a^2.0)+4.0*x^3.0*(a+b+a^2.0)-(a+b+a^2.0)";
        EqnSolArrayDiffAlone[2] = "8.0*7.0*x^6.0*(a+b+a^2.0)+5.0*4.0*x^3.0*(a+b+a^2.0)+4.0*3.0*x^2.0*(a+b+a^2.0)-a+b+a^2.0";
        EqnSolArrayMap2[2] = "56.0*x^6.0*(a+b+a^2.0)+20.0*x^3.0*(a+b+a^2.0)+12.0*x^2.0*(a+b+a^2.0)-a+b+a^2.0";
        EqnSolArrayMap3[2]="(a+b+a^2.0)/9.0*x^9.0+(a+b+a^2.0)/6.0*x^6.0+(a+b+a^2.0)/5.0*x^5.0-(a+b+a^2.0)/2.0*x^2.0-25.0*x";
        EqnSolArrayIntegrAlone[2]="(a+b+a^2.0)/9.0/10.0*x^10.0+(a+b+a^2.0)/6.0/7.0*x^7.0+(a+b+a^2.0)/5.0/6.0*x^6.0-(a+b+a^2.0)/2.0/3.0*x^3.0-25.0/2.0*x^2.0";
        EqnSolArrayMap4[2]="(a+b+a^2.0)/90.0*x^10.0+(a+b+a^2.0)/42.0*x^7.0+(a+b+a^2.0)/30.0*x^6.0-(a+b+a^2.0)/6.0*x^3.0-12.5*x^2.0";
        EqnSolOrder[2] = 2;

        EqnSolArrayMap1[3] = "56.0*x^6.0*(a+b+a^2.0)+20.0*x^3.0*(a+b+a^2.0)+12.0*x^2.0*(a+b+a^2.0)-a+b+a^2.0";
        EqnSolArrayDiffAlone[3] = "56.0*6.0*x^5.0*(a+b+a^2.0)+20.0*3.0*x^2.0*(a+b+a^2.0)+12.0*2.0*x^1.0*(a+b+a^2.0)-a*0.0";
        EqnSolArrayMap2[3] = "336.0*x^5.0*(a+b+a^2.0)+60.0*x^2.0*(a+b+a^2.0)+24.0*x*(a+b+a^2.0)-a*0.0";
        EqnSolArrayMap3[3]="(a+b+a^2.0)/90.0*x^10.0+(a+b+a^2.0)/42.0*x^7.0+(a+b+a^2.0)/30.0*x^6.0-(a+b+a^2.0)/6.0*x^3.0-12.5*x^2.0";
        EqnSolArrayIntegrAlone[3]="(a+b+a^2.0)/90.0/11.0*x^11.0+(a+b+a^2.0)/42.0/8.0*x^8.0+(a+b+a^2.0)/30.0/7.0*x^7.0-(a+b+a^2.0)/6.0/4.0*x^4.0-12.5/3.0*x^3.0";
        EqnSolArrayMap4[3]="(a+b+a^2.0)/990.0*x^11.0+(a+b+a^2.0)/336.0*x^8.0+(a+b+a^2.0)/210.0*x^7.0-(a+b+a^2.0)/24.0*x^4.0-4.166666666666667*x^3.0";
        EqnSolOrder[3] = 3;

        EqnSolArrayMap1[4] = "336.0*x^5.0*(a+b+a^2.0)+60.0*x^2.0*(a+b+a^2.0)+24.0*x*(a+b+a^2.0)-a*0.0";
        EqnSolArrayDiffAlone[4] = "336.0*5.0*x^4.0*(a+b+a^2.0)+60.0*2.0*x^1.0*(a+b+a^2.0)+24.0*(a+b+a^2.0)-a*0.0";
        EqnSolArrayMap2[4] = "1680.0*x^4.0*(a+b+a^2.0)+120.0*x*(a+b+a^2.0)+24.0*(a+b+a^2.0)-a*0.0";
        EqnSolArrayMap3[4]="(a+b+a^2.0)/990.0*x^11.0+(a+b+a^2.0)/336.0*x^8.0+(a+b+a^2.0)/210.0*x^7.0-(a+b+a^2.0)/24.0*x^4.0-4.166666666666667*x^3.0";
        EqnSolArrayIntegrAlone[4]="(a+b+a^2.0)/990.0/12.0*x^12.0+(a+b+a^2.0)/336.0/9.0*x^9.0+(a+b+a^2.0)/210.0/8.0*x^8.0-(a+b+a^2.0)/24.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        EqnSolArrayMap4[4]="(a+b+a^2.0)/11880.0*x^12.0+(a+b+a^2.0)/3024.0*x^9.0+(a+b+a^2.0)/1680.0*x^8.0-(a+b+a^2.0)/120.0*x^5.0-1.0416666666666667*x^4.0";
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
     
          public static void TestCaseDiff2032() {
        //Test Case 50002
        UsageCalculus.TestCase = 2032;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "a*x^8.0 + a*x^5 + a*x^4 - 2*a*x- 25*(2.0)";
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
       
       public static void TestCaseDiff2033() {
        //Test Case 50003
        UsageCalculus.TestCase = 2033;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*a*x^8 + a*x^5 + a*x^4 - 2*x*a- 25.0*2*a*1.0";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a*x^8.0+a*x^5.0+a*x^4.0-a*2.0*x-a*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a*8.0*x^7.0+a*5.0*x^4.0+a*4.0*x^3.0-a*2.0-a*50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a*8.0*x^7.0+a*5.0*x^4.0+a*4.0*x^3.0-a*2.0-a*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="a*x^8.0+a*x^5.0+a*x^4.0-a*2.0*x-a*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a/9.0*x^9.0+a/6.0*x^6.0+a/5.0*x^5.0-a*x^2.0-a*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a/9.0*x^9.0+a/6.0*x^6.0+a/5.0*x^5.0-a*x^2.0-a*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a*8.0*x^7.0+a*5.0*x^4.0+a*4.0*x^3.0-a*2.0-a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a*8.0*7.0*x^6.0+a*5.0*4.0*x^3.0+a*4.0*3.0*x^2.0-a*2.0*0.0-a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a*56.0*x^6.0+a*20.0*x^3.0+a*12.0*x^2.0-a*0.0-a*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a/9.0*x^9.0+a/6.0*x^6.0+a/5.0*x^5.0-a*x^2.0-a*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a/9.0/10.0*x^10.0+a/6.0/7.0*x^7.0+a/5.0/6.0*x^6.0-a/3.0*x^3.0-a*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a*0.011111111111111112*x^10.0+a*0.023809523809523808*x^7.0+a*0.03333333333333333*x^6.0-a/3.0*x^3.0-a*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a*56.0*x^6.0+a*20.0*x^3.0+a*12.0*x^2.0-a*0.0-a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a*56.0*6.0*x^5.0+a*20.0*3.0*x^2.0+a*12.0*2.0*x^1.0-a*0.0*0.0-a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a*336.0*x^5.0+a*60.0*x^2.0+a*24.0*x-a*0.0-a*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a*0.011111111111111112*x^10.0+a*0.023809523809523808*x^7.0+a*0.03333333333333333*x^6.0-a/3.0*x^3.0-a*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a*0.011111111111111112/11.0*x^11.0+a*0.023809523809523808/8.0*x^8.0+a*0.03333333333333333/7.0*x^7.0-a/3.0/4.0*x^4.0-a*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a*0.00101010101010101*x^11.0+a*0.002976190476190476*x^8.0+a*0.0047619047619047615*x^7.0-a*0.08333333333333333*x^4.0-a*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a*336.0*x^5.0+a*60.0*x^2.0+a*24.0*x-a*0.0-a*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a*336.0*5.0*x^4.0+a*60.0*2.0*x^1.0+a*24.0-a*0.0*0.0-a*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a*1680.0*x^4.0+a*120.0*x+a*24.0-a*0.0-a*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a*0.00101010101010101*x^11.0+a*0.002976190476190476*x^8.0+a*0.0047619047619047615*x^7.0-a*0.08333333333333333*x^4.0-a*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a*0.00101010101010101/12.0*x^12.0+a*0.002976190476190476/9.0*x^9.0+a*0.0047619047619047615/8.0*x^8.0-a*0.08333333333333333/5.0*x^5.0-a*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a*8.417508417508418E-5*x^12.0+a*3.3068783068783067E-4*x^9.0+a*5.952380952380952E-4*x^8.0-a*0.016666666666666666*x^5.0-a*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff2034() {
        //Test Case 50004
        UsageCalculus.TestCase = 2034;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*1.0*a^2*x^8 + a^2*x^5 + a^2*x^4 - 2*x*a^2- 25*2*a^3*1.0*1.0/1.0";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a^2.0*x^8.0+a^2.0*x^5.0+a^2.0*x^4.0-a^2.0*2.0*x-a^3.0*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a^2.0*8.0*x^7.0+a^2.0*5.0*x^4.0+a^2.0*4.0*x^3.0-a^2.0*2.0-a^3.0*50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a^2.0*8.0*x^7.0+a^2.0*5.0*x^4.0+a^2.0*4.0*x^3.0-a^2.0*2.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[1]=  "a^2.0*x^8.0+a^2.0*x^5.0+a^2.0*x^4.0-a^2.0*2.0*x-a^3.0*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a^2.0/9.0*x^9.0+a^2.0/6.0*x^6.0+a^2.0/5.0*x^5.0-a^2.0*x^2.0-a^3.0*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a^2.0/9.0*x^9.0+a^2.0/6.0*x^6.0+a^2.0/5.0*x^5.0-a^2.0*x^2.0-a^3.0*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a^2.0*8.0*x^7.0+a^2.0*5.0*x^4.0+a^2.0*4.0*x^3.0-a^2.0*2.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a^2.0*8.0*7.0*x^6.0+a^2.0*5.0*4.0*x^3.0+a^2.0*4.0*3.0*x^2.0-a^2.0*2.0*0.0-a^3.0*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a^2.0*56.0*x^6.0+a^2.0*20.0*x^3.0+a^2.0*12.0*x^2.0-a^2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a^2.0/9.0*x^9.0+a^2.0/6.0*x^6.0+a^2.0/5.0*x^5.0-a^2.0*x^2.0-a^3.0*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a^2.0/9.0/10.0*x^10.0+a^2.0/6.0/7.0*x^7.0+a^2.0/5.0/6.0*x^6.0-a^2.0/3.0*x^3.0-a^3.0*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a^2.0*0.011111111111111112*x^10.0+a^2.0*0.023809523809523808*x^7.0+a^2.0*0.03333333333333333*x^6.0-a^2.0/3.0*x^3.0-a^3.0*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a^2.0*56.0*x^6.0+a^2.0*20.0*x^3.0+a^2.0*12.0*x^2.0-a^2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a^2.0*56.0*6.0*x^5.0+a^2.0*20.0*3.0*x^2.0+a^2.0*12.0*2.0*x^1.0-a^2.0*0.0*0.0-a^3.0*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a^2.0*336.0*x^5.0+a^2.0*60.0*x^2.0+a^2.0*24.0*x-a^2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a^2.0*0.011111111111111112*x^10.0+a^2.0*0.023809523809523808*x^7.0+a^2.0*0.03333333333333333*x^6.0-a^2.0/3.0*x^3.0-a^3.0*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a^2.0*0.011111111111111112/11.0*x^11.0+a^2.0*0.023809523809523808/8.0*x^8.0+a^2.0*0.03333333333333333/7.0*x^7.0-a^2.0/3.0/4.0*x^4.0-a^3.0*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a^2.0*0.00101010101010101*x^11.0+a^2.0*0.002976190476190476*x^8.0+a^2.0*0.0047619047619047615*x^7.0-a^2.0*0.08333333333333333*x^4.0-a^3.0*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a^2.0*336.0*x^5.0+a^2.0*60.0*x^2.0+a^2.0*24.0*x-a^2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a^2.0*336.0*5.0*x^4.0+a^2.0*60.0*2.0*x^1.0+a^2.0*24.0-a^2.0*0.0*0.0-a^3.0*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a^2.0*1680.0*x^4.0+a^2.0*120.0*x+a^2.0*24.0-a^2.0*0.0-a^3.0*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a^2.0*0.00101010101010101*x^11.0+a^2.0*0.002976190476190476*x^8.0+a^2.0*0.0047619047619047615*x^7.0-a^2.0*0.08333333333333333*x^4.0-a^3.0*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a^2.0*0.00101010101010101/12.0*x^12.0+a^2.0*0.002976190476190476/9.0*x^9.0+a^2.0*0.0047619047619047615/8.0*x^8.0-a^2.0*0.08333333333333333/5.0*x^5.0-a^3.0*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a^2.0*8.417508417508418E-5*x^12.0+a^2.0*3.3068783068783067E-4*x^9.0+a^2.0*5.952380952380952E-4*x^8.0-a^2.0*0.016666666666666666*x^5.0-a^3.0*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff2035() {
        //Test Case 50005
        UsageCalculus.TestCase = 2035;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "2^x*x^8 + 2^x*x^5 + 2^x*x^4 - 2*x*2^x- 25.0*2.0*3^x";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 2;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^8.0*2.0^x+x^5.0*2.0^x+x^4.0*2.0^x-2.0*x*2.0^x-50.0*3.0^x";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "2.0^x*8.0*x^7.0+ln(2.0)*2.0^x*x^8.0+2.0^x*5.0*x^4.0+ln(2.0)*2.0^x*x^5.0+2.0^x*4.0*x^3.0+ln(2.0)*2.0^x*x^4.0-2.0^x*2.0+ln(2.0)*2.0^x*2.0*x-50.0*ln(3.0)*3.0^x";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*x^7.0*2.0^x+ln(2.0)*2.0^x*x^8.0+5.0*x^4.0*2.0^x+ln(2.0)*2.0^x*x^5.0+4.0*x^3.0*2.0^x+ln(2.0)*2.0^x*x^4.0-2.0*2.0^x+ln(2.0)*2.0^x*x-ln(3.0)*50.0*3.0^x";
        UsageCalculus.EqnSolArrayMap3[1]="x^8.0*2.0^x+x^5.0*2.0^x+x^4.0*2.0^x-2.0*x*2.0^x-50.0*3.0^x";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="";
        UsageCalculus.EqnSolArrayMap4[1]="";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*x^7.0*2.0^x+x^8.0*ln(2.0)*2.0^x+5.0*x^4.0*2.0^x+x^5.0*ln(2.0)*2.0^x+4.0*x^3.0*2.0^x+x^4.0*ln(2.0)*2.0^x-2.0*2.0^x+2.0*x*ln(2.0)*2.0^x-50.0*ln(3.0)*3.0^x";
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
       
       
       public static void TestCaseDiff2036() {
        //Test Case 50006
        UsageCalculus.TestCase = 2036;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "a^b*x^8 + a^b*x^5 + a^b*x^4 - 2*x*a^b- 25*2.0*a^b";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a^b*x^8.0+a^b*x^5.0+a^b*x^4.0-a^b*2.0*x-a^b*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a^b*8.0*x^7.0+a^b*5.0*x^4.0+a^b*4.0*x^3.0-a^b*2.0-a^b*50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a^b*8.0*x^7.0+a^b*5.0*x^4.0+a^b*4.0*x^3.0-a^b*2.0-a^b*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="a^b*x^8.0+a^b*x^5.0+a^b*x^4.0-a^b*2.0*x-a^b*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a^b/9.0*x^9.0+a^b/6.0*x^6.0+a^b/5.0*x^5.0-a^b*x^2.0-a^b*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a^b/9.0*x^9.0+a^b/6.0*x^6.0+a^b/5.0*x^5.0-a^b*x^2.0-a^b*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a^b*8.0*x^7.0+a^b*5.0*x^4.0+a^b*4.0*x^3.0-a^b*2.0-a^b*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a^b*8.0*7.0*x^6.0+a^b*5.0*4.0*x^3.0+a^b*4.0*3.0*x^2.0-a^b*2.0*0.0-a^b*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a^b*56.0*x^6.0+a^b*20.0*x^3.0+a^b*12.0*x^2.0-a^b*0.0-a^b*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a^b/9.0*x^9.0+a^b/6.0*x^6.0+a^b/5.0*x^5.0-a^b*x^2.0-a^b*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a^b/9.0/10.0*x^10.0+a^b/6.0/7.0*x^7.0+a^b/5.0/6.0*x^6.0-a^b/3.0*x^3.0-a^b*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a^b*0.011111111111111112*x^10.0+a^b*0.023809523809523808*x^7.0+a^b*0.03333333333333333*x^6.0-a^b/3.0*x^3.0-a^b*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a^b*56.0*x^6.0+a^b*20.0*x^3.0+a^b*12.0*x^2.0-a^b*0.0-a^b*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a^b*56.0*6.0*x^5.0+a^b*20.0*3.0*x^2.0+a^b*12.0*2.0*x^1.0-a^b*0.0*0.0-a^b*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a^b*336.0*x^5.0+a^b*60.0*x^2.0+a^b*24.0*x-a^b*0.0-a^b*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a^b*0.011111111111111112*x^10.0+a^b*0.023809523809523808*x^7.0+a^b*0.03333333333333333*x^6.0-a^b/3.0*x^3.0-a^b*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a^b*0.011111111111111112/11.0*x^11.0+a^b*0.023809523809523808/8.0*x^8.0+a^b*0.03333333333333333/7.0*x^7.0-a^b/3.0/4.0*x^4.0-a^b*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a^b*0.00101010101010101*x^11.0+a^b*0.002976190476190476*x^8.0+a^b*0.0047619047619047615*x^7.0-a^b*0.08333333333333333*x^4.0-a^b*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a^b*336.0*x^5.0+a^b*60.0*x^2.0+a^b*24.0*x-a^b*0.0-a^b*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a^b*336.0*5.0*x^4.0+a^b*60.0*2.0*x^1.0+a^b*24.0-a^b*0.0*0.0-a^b*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a^b*1680.0*x^4.0+a^b*120.0*x+a^b*24.0-a^b*0.0-a^b*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a^b*0.00101010101010101*x^11.0+a^b*0.002976190476190476*x^8.0+a^b*0.0047619047619047615*x^7.0-a^b*0.08333333333333333*x^4.0-a^b*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a^b*0.00101010101010101/12.0*x^12.0+a^b*0.002976190476190476/9.0*x^9.0+a^b*0.0047619047619047615/8.0*x^8.0-a^b*0.08333333333333333/5.0*x^5.0-a^b*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a^b*8.417508417508418E-5*x^12.0+a^b*3.3068783068783067E-4*x^9.0+a^b*5.952380952380952E-4*x^8.0-a^b*0.016666666666666666*x^5.0-a^b*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff2037() {
        //Test Case 50007
        UsageCalculus.TestCase = 2037;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "a*b*c*x^8 + a*b*c*x^5 + a*b*c*x^4 - 2*x*a*b*c- 25.0*2*a*b*c";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a*b*c*x^8.0+a*b*c*x^5.0+a*b*c*x^4.0-a*b*c*2.0*x-a*b*c*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a*b*c*8.0*x^7.0+a*b*c*5.0*x^4.0+a*b*c*4.0*x^3.0-a*b*c*2.0-a*b*c*50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a*b*c*8.0*x^7.0+a*b*c*5.0*x^4.0+a*b*c*4.0*x^3.0-a*b*c*2.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayMap3[1] = "a*b*c*x^8.0+a*b*c*x^5.0+a*b*c*x^4.0-a*b*c*2.0*x-a*b*c*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a*b*c/9.0*x^9.0+a*b*c/6.0*x^6.0+a*b*c/5.0*x^5.0-a*b*c*x^2.0-a*b*c*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a*b*c/9.0*x^9.0+a*b*c/6.0*x^6.0+a*b*c/5.0*x^5.0-a*b*c*x^2.0-a*b*c*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a*b*c*8.0*x^7.0+a*b*c*5.0*x^4.0+a*b*c*4.0*x^3.0-a*b*c*2.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a*b*c*8.0*7.0*x^6.0+a*b*c*5.0*4.0*x^3.0+a*b*c*4.0*3.0*x^2.0-a*b*c*2.0*0.0-a*b*c*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a*b*c*56.0*x^6.0+a*b*c*20.0*x^3.0+a*b*c*12.0*x^2.0-a*b*c*0.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a*b*c/9.0*x^9.0+a*b*c/6.0*x^6.0+a*b*c/5.0*x^5.0-a*b*c*x^2.0-a*b*c*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a*b*c/9.0/10.0*x^10.0+a*b*c/6.0/7.0*x^7.0+a*b*c/5.0/6.0*x^6.0-a*b*c/3.0*x^3.0-a*b*c*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a*b*c*0.011111111111111112*x^10.0+a*b*c*0.023809523809523808*x^7.0+a*b*c*0.03333333333333333*x^6.0-a*b*c/3.0*x^3.0-a*b*c*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a*b*c*56.0*x^6.0+a*b*c*20.0*x^3.0+a*b*c*12.0*x^2.0-a*b*c*0.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a*b*c*56.0*6.0*x^5.0+a*b*c*20.0*3.0*x^2.0+a*b*c*12.0*2.0*x^1.0-a*b*c*0.0*0.0-a*b*c*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a*b*c*336.0*x^5.0+a*b*c*60.0*x^2.0+a*b*c*24.0*x-a*b*c*0.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a*b*c*0.011111111111111112*x^10.0+a*b*c*0.023809523809523808*x^7.0+a*b*c*0.03333333333333333*x^6.0-a*b*c/3.0*x^3.0-a*b*c*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a*b*c*0.011111111111111112/11.0*x^11.0+a*b*c*0.023809523809523808/8.0*x^8.0+a*b*c*0.03333333333333333/7.0*x^7.0-a*b*c/3.0/4.0*x^4.0-a*b*c*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a*b*c*0.00101010101010101*x^11.0+a*b*c*0.002976190476190476*x^8.0+a*b*c*0.0047619047619047615*x^7.0-a*b*c*0.08333333333333333*x^4.0-a*b*c*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a*b*c*336.0*x^5.0+a*b*c*60.0*x^2.0+a*b*c*24.0*x-a*b*c*0.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a*b*c*336.0*5.0*x^4.0+a*b*c*60.0*2.0*x^1.0+a*b*c*24.0-a*b*c*0.0*0.0-a*b*c*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a*b*c*1680.0*x^4.0+a*b*c*120.0*x+a*b*c*24.0-a*b*c*0.0-a*b*c*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a*b*c*0.00101010101010101*x^11.0+a*b*c*0.002976190476190476*x^8.0+a*b*c*0.0047619047619047615*x^7.0-a*b*c*0.08333333333333333*x^4.0-a*b*c*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a*b*c*0.00101010101010101/12.0*x^12.0+a*b*c*0.002976190476190476/9.0*x^9.0+a*b*c*0.0047619047619047615/8.0*x^8.0-a*b*c*0.08333333333333333/5.0*x^5.0-a*b*c*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a*b*c*8.417508417508418E-5*x^12.0+a*b*c*3.3068783068783067E-4*x^9.0+a*b*c*5.952380952380952E-4*x^8.0-a*b*c*0.016666666666666666*x^5.0-a*b*c*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff2038() {
        //Test Case 50008
        UsageCalculus.TestCase = 2038;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "a/b/c*x^8 + a/b/c*x^5 + a/b/c*x^4 - 2*x*a/b/c- 25.0*2*a/b/c";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a/b/c*x^8.0+a/b/c*x^5.0+a/b/c*x^4.0-a/b/c*2.0*x-a/b/c*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a/b/c*8.0*x^7.0+a/b/c*5.0*x^4.0+a/b/c*4.0*x^3.0-a/b/c*2.0-a/b/c*50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a/b/c*8.0*x^7.0+a/b/c*5.0*x^4.0+a/b/c*4.0*x^3.0-a/b/c*2.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="a/b/c*x^8.0+a/b/c*x^5.0+a/b/c*x^4.0-a/b/c*2.0*x-a/b/c*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a/b/c/9.0*x^9.0+a/b/c/6.0*x^6.0+a/b/c/5.0*x^5.0-1.0/b/c*x^2.0-a/b/c*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a/b/c/9.0*x^9.0+a/b/c/6.0*x^6.0+a/b/c/5.0*x^5.0-a/b/c*x^2.0-a/b/c*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a/b/c*8.0*x^7.0+a/b/c*5.0*x^4.0+a/b/c*4.0*x^3.0-a/b/c*2.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a/b/c*8.0*7.0*x^6.0+a/b/c*5.0*4.0*x^3.0+a/b/c*4.0*3.0*x^2.0-a/b/c*2.0*0.0-a/b/c*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a/b/c*56.0*x^6.0+a/b/c*20.0*x^3.0+a/b/c*12.0*x^2.0-a/b/c*0.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a/b/c/9.0*x^9.0+a/b/c/6.0*x^6.0+a/b/c/5.0*x^5.0-a/b/c*x^2.0-a/b/c*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a/b/c/9.0/10.0*x^10.0+a/b/c/6.0/7.0*x^7.0+a/b/c/5.0/6.0*x^6.0-a/b/c/3.0*x^3.0-a/b/c*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a/b/c*0.011111111111111112*x^10.0+a/b/c*0.023809523809523808*x^7.0+a/b/c*0.03333333333333333*x^6.0-a/b/c/3.0*x^3.0-a/b/c*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a/b/c*56.0*x^6.0+a/b/c*20.0*x^3.0+a/b/c*12.0*x^2.0-a/b/c*0.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a/b/c*56.0*6.0*x^5.0+a/b/c*20.0*3.0*x^2.0+a/b/c*12.0*2.0*x^1.0-a/b/c*0.0*0.0-a/b/c*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a/b/c*336.0*x^5.0+a/b/c*60.0*x^2.0+a/b/c*24.0*x-a/b/c*0.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a/b/c*0.011111111111111112*x^10.0+a/b/c*0.023809523809523808*x^7.0+a/b/c*0.03333333333333333*x^6.0-a/b/c/3.0*x^3.0-a/b/c*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a/b/c*0.011111111111111112/11.0*x^11.0+a/b/c*0.023809523809523808/8.0*x^8.0+a/b/c*0.03333333333333333/7.0*x^7.0-a/b/c/3.0/4.0*x^4.0-a/b/c*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a/b/c*0.00101010101010101*x^11.0+a/b/c*0.002976190476190476*x^8.0+a/b/c*0.0047619047619047615*x^7.0-a/b/c*0.08333333333333333*x^4.0-a/b/c*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a/b/c*336.0*x^5.0+a/b/c*60.0*x^2.0+a/b/c*24.0*x-a/b/c*0.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a/b/c*336.0*5.0*x^4.0+a/b/c*60.0*2.0*x^1.0+a/b/c*24.0-a/b/c*0.0*0.0-a/b/c*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a/b/c*1680.0*x^4.0+a/b/c*120.0*x+a/b/c*24.0-a/b/c*0.0-a/b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a/b/c*0.00101010101010101*x^11.0+a/b/c*0.002976190476190476*x^8.0+a/b/c*0.0047619047619047615*x^7.0-a/b/c*0.08333333333333333*x^4.0-a/b/c*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a/b/c*0.00101010101010101/12.0*x^12.0+a/b/c*0.002976190476190476/9.0*x^9.0+a/b/c*0.0047619047619047615/8.0*x^8.0-a/b/c*0.08333333333333333/5.0*x^5.0-a/b/c*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a/b/c*8.417508417508418E-5*x^12.0+a/b/c*3.3068783068783067E-4*x^9.0+a/b/c*5.952380952380952E-4*x^8.0-a/b/c*0.016666666666666666*x^5.0-a/b/c*2.0833333333333335*x^4.0";
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
       public static void TestCaseDiff2039() {
        //Test Case 50009
        UsageCalculus.TestCase = 2039;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "a*b/c*x^8 + a*b/c*x^5 + a*b/c*x^4 - 2*x*a*b/c- 25.0*2*a*b/c";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID="IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a*b/c*x^8.0+a*b/c*x^5.0+a*b/c*x^4.0-a*b/c*2.0*x-a*b/c*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a*b/c*8.0*x^7.0+a*b/c*5.0*x^4.0+a*b/c*4.0*x^3.0-a*b/c*2.0-a*b/c*50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a*b/c*8.0*x^7.0+a*b/c*5.0*x^4.0+a*b/c*4.0*x^3.0-a*b/c*2.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[1]="a*b/c*x^8.0+a*b/c*x^5.0+a*b/c*x^4.0-a*b/c*2.0*x-a*b/c*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a*b/c/9.0*x^9.0+a*b/c/6.0*x^6.0+a*b/c/5.0*x^5.0-a*b/c*x^2.0-a*b/c*50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a*b/c/9.0*x^9.0+a*b/c/6.0*x^6.0+a*b/c/5.0*x^5.0-a*b/c*x^2.0-a*b/c*50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a*b/c*8.0*x^7.0+a*b/c*5.0*x^4.0+a*b/c*4.0*x^3.0-a*b/c*2.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a*b/c*8.0*7.0*x^6.0+a*b/c*5.0*4.0*x^3.0+a*b/c*4.0*3.0*x^2.0-a*b/c*2.0*0.0-a*b/c*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a*b/c*56.0*x^6.0+a*b/c*20.0*x^3.0+a*b/c*12.0*x^2.0-a*b/c*0.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a*b/c/9.0*x^9.0+a*b/c/6.0*x^6.0+a*b/c/5.0*x^5.0-a*b/c*x^2.0-a*b/c*50.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a*b/c/9.0/10.0*x^10.0+a*b/c/6.0/7.0*x^7.0+a*b/c/5.0/6.0*x^6.0-a*b/c/3.0*x^3.0-a*b/c*50.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a*b/c*0.011111111111111112*x^10.0+a*b/c*0.023809523809523808*x^7.0+a*b/c*0.03333333333333333*x^6.0-a*b/c/3.0*x^3.0-a*b/c*25.0*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a*b/c*56.0*x^6.0+a*b/c*20.0*x^3.0+a*b/c*12.0*x^2.0-a*b/c*0.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a*b/c*56.0*6.0*x^5.0+a*b/c*20.0*3.0*x^2.0+a*b/c*12.0*2.0*x^1.0-a*b/c*0.0*0.0-a*b/c*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a*b/c*336.0*x^5.0+a*b/c*60.0*x^2.0+a*b/c*24.0*x-a*b/c*0.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a*b/c*0.011111111111111112*x^10.0+a*b/c*0.023809523809523808*x^7.0+a*b/c*0.03333333333333333*x^6.0-a*b/c/3.0*x^3.0-a*b/c*25.0*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a*b/c*0.011111111111111112/11.0*x^11.0+a*b/c*0.023809523809523808/8.0*x^8.0+a*b/c*0.03333333333333333/7.0*x^7.0-a*b/c/3.0/4.0*x^4.0-a*b/c*25.0/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a*b/c*0.00101010101010101*x^11.0+a*b/c*0.002976190476190476*x^8.0+a*b/c*0.0047619047619047615*x^7.0-a*b/c*0.08333333333333333*x^4.0-a*b/c*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a*b/c*336.0*x^5.0+a*b/c*60.0*x^2.0+a*b/c*24.0*x-a*b/c*0.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a*b/c*336.0*5.0*x^4.0+a*b/c*60.0*2.0*x^1.0+a*b/c*24.0-a*b/c*0.0*0.0-a*b/c*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a*b/c*1680.0*x^4.0+a*b/c*120.0*x+a*b/c*24.0-a*b/c*0.0-a*b/c*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a*b/c*0.00101010101010101*x^11.0+a*b/c*0.002976190476190476*x^8.0+a*b/c*0.0047619047619047615*x^7.0-a*b/c*0.08333333333333333*x^4.0-a*b/c*8.333333333333334*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a*b/c*0.00101010101010101/12.0*x^12.0+a*b/c*0.002976190476190476/9.0*x^9.0+a*b/c*0.0047619047619047615/8.0*x^8.0-a*b/c*0.08333333333333333/5.0*x^5.0-a*b/c*8.333333333333334/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a*b/c*8.417508417508418E-5*x^12.0+a*b/c*3.3068783068783067E-4*x^9.0+a*b/c*5.952380952380952E-4*x^8.0-a*b/c*0.016666666666666666*x^5.0-a*b/c*2.0833333333333335*x^4.0";
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
       
       public static void TestCaseDiff2040() {
        //Test Case 2023
        TestCase = 2040;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";        
        EqnUnderTest = "y^0.5-2.0";
        TestCaseName = "Complex: Coefficients:+5";
        TestCaseMatrixID="Coefficients:+5:3 Letter with Numerics:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        DiffWithRespTo = "y";
        MaxDiffOrder = 14;
        MaxIntegreOrder = 14;
        
        EqnSolArrayMap1[1] = "y^0.5-2.0";
        EqnSolArrayDiffAlone[1] = "0.5*y^-0.5-2.0*0.0";
        EqnSolArrayMap2[1] = "1.0/2.0*y^-0.5";
        EqnSolArrayMap3[1]="y^0.5-2.0";
        EqnSolArrayIntegrAlone[1]="1.0/1.5*y^1.5-2.0*y";
        EqnSolArrayMap4[1]="1.0/1.5*y^1.5-2.0*y";
        EqnSolOrder[1] = 1;

        EqnSolArrayMap1[2] = "1.0/2.0*y^-0.5";
        EqnSolArrayDiffAlone[2] = "1.0/2.0*-0.5*y^-1.5";
        EqnSolArrayMap2[2] = "-1.0/4.0/y^1.5";
        EqnSolArrayMap3[2]="1.0/1.5*y^1.5-2.0*y";
        EqnSolArrayIntegrAlone[2]="1.0/1.5/2.5*y^2.5-y^2.0";
        EqnSolArrayMap4[2]="0.26666666666666666*y^2.5-y^2.0";
        EqnSolOrder[2] = 2;

        EqnSolArrayMap1[3] = "-1.0/4.0/y^1.5";
        EqnSolArrayDiffAlone[3] = "-1.0/4.0*-1.5/y^2.5";
        EqnSolArrayMap2[3] = "1.0/2.6666666666666665/y^2.5";
        EqnSolArrayMap3[3]="0.26666666666666666*y^2.5-y^2.0";
        EqnSolArrayIntegrAlone[3]="0.26666666666666666/3.5*y^3.5-1.0/3.0*y^3.0";
        EqnSolArrayMap4[3]="1.0/13.125*y^3.5-1.0/3.0*y^3.0";
        EqnSolOrder[3] = 3;

        EqnSolArrayMap1[4] = "1.0/2.6666666666666665/y^2.5";
        EqnSolArrayDiffAlone[4] = "1.0/2.6666666666666665*-2.5/y^3.5";
        EqnSolArrayMap2[4] = "-1.0/1.0666666666666667/y^3.5";
        EqnSolArrayMap3[4]="1.0/13.125*y^3.5-1.0/3.0*y^3.0";
        EqnSolArrayIntegrAlone[4]="1.0/13.125/4.5*y^4.5-1.0/3.0/4.0*y^4.0";
        EqnSolArrayMap4[4]="1.0/59.0625*y^4.5-1.0/12.0*y^4.0";
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
       /* **************************************** */
        /* ***************IndConstant Test Case***************** */
        /* **************************************** */
     public static void TestCaseDiff2041() {
        //Test Case 2004
        UsageCalculus.TestCase = 2041;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "a+b+a^2+x^8 + a+b+a^2*x^5 + a+b+a^2/x^4 - a+b+a^2*x - 25.0";
        UsageCalculus.TestCaseName = "Simple: Coefficients:";
        UsageCalculus.TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "a+b+a^2.0+x^8.0+a+b+a^2.0*x^5.0+a+b+a^2.0/x^4.0-a+b+a^2.0*x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a*0.0+b*0.0+a^2.0*0.0+8.0*x^7.0+a*0.0+b*0.0+a^2.0*5.0*x^4.0+a*0.0+b*0.0+a^2.0*-4.0/x^5.0-a*0.0+b*0.0+a^2.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "a*0.0+b*0.0+a^2.0*0.0+8.0*x^7.0+a*0.0+b*0.0+a^2.0*5.0*x^4.0+a*0.0+b*0.0-a^2.0*4.0/x^5.0-a*0.0+b*0.0+a^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="a+b+a^2.0+x^8.0+a+b+a^2.0*x^5.0+a+b+a^2.0/x^4.0-a+b+a^2.0*x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="a*x+b*x+a^2.0*x+1.0/9.0*x^9.0+a*x+b*x+a^2.0/6.0*x^6.0+a*x+b*x+a^2.0/-3.0/x^3.0-a*x+b*x+a^2.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="a*x+b*x+a^2.0*x+0.1111111111111111*x^9.0+a*x+b*x+a^2.0/6.0*x^6.0+a*x+b*x-a^2.0/3.0/x^3.0-a*x+b*x+a^2.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "a*0.0+b*0.0+a^2.0*0.0+8.0*x^7.0+a*0.0+b*0.0+a^2.0*5.0*x^4.0+a*0.0+b*0.0-a^2.0*4.0/x^5.0-a*0.0+b*0.0+a^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "a*0.0+b*0.0*0.0+a^2.0*0.0*0.0+8.0*7.0*x^6.0+a*0.0*0.0+b*0.0*0.0+a^2.0*5.0*4.0*x^3.0+a*0.0*0.0+b*0.0*0.0-a^2.0*4.0*-5.0/x^6.0-a*0.0*0.0+b*0.0*0.0+a^2.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a*0.0+b*0.0+a^2.0*0.0+56.0*x^6.0+a*0.0+b*0.0+a^2.0*20.0*x^3.0+a*0.0+b*0.0+a^2.0*20.0/x^6.0-a*0.0+b*0.0+a^2.0*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="a*x+b*x+a^2.0*x+0.1111111111111111*x^9.0+a*x+b*x+a^2.0/6.0*x^6.0+a*x+b*x-a^2.0/3.0/x^3.0-a*x+b*x+a^2.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="a/2.0*x^2.0+b/2.0*x^2.0+a^2.0/2.0*x^2.0+0.1111111111111111/10.0*x^10.0+a/2.0*x^2.0+b/2.0*x^2.0+a^2.0/6.0/7.0*x^7.0+a/2.0*x^2.0+b/2.0*x^2.0-a^2.0/3.0/-2.0/x^2.0-a/2.0*x^2.0+b/2.0*x^2.0+a^2.0/2.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="a/2.0*x^2.0+b/2.0*x^2.0+a^2.0/2.0*x^2.0+0.01111111111111111*x^10.0+a/2.0*x^2.0+b/2.0*x^2.0+a^2.0*0.023809523809523808*x^7.0+a/2.0*x^2.0+b/2.0*x^2.0+a^2.0/6.0/x^2.0-a/2.0*x^2.0+b/2.0*x^2.0+a^2.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a*0.0+b*0.0+a^2.0*0.0+56.0*x^6.0+a*0.0+b*0.0+a^2.0*20.0*x^3.0+a*0.0+b*0.0+a^2.0*20.0/x^6.0-a*0.0+b*0.0+a^2.0*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a*0.0+b*0.0*0.0+a^2.0*0.0*0.0+56.0*6.0*x^5.0+a*0.0*0.0+b*0.0*0.0+a^2.0*20.0*3.0*x^2.0+a*0.0*0.0+b*0.0*0.0+a^2.0*20.0*-6.0/x^7.0-a*0.0*0.0+b*0.0*0.0+a^2.0*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "a*0.0+b*0.0+a^2.0*0.0+336.0*x^5.0+a*0.0+b*0.0+a^2.0*60.0*x^2.0+a*0.0+b*0.0-a^2.0*120.0/x^7.0-a*0.0+b*0.0+a^2.0*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="a/2.0*x^2.0+b/2.0*x^2.0+a^2.0/2.0*x^2.0+0.01111111111111111*x^10.0+a/2.0*x^2.0+b/2.0*x^2.0+a^2.0*0.023809523809523808*x^7.0+a/2.0*x^2.0+b/2.0*x^2.0+a^2.0/6.0/x^2.0-a/2.0*x^2.0+b/2.0*x^2.0+a^2.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="a/2.0/3.0*x^3.0+b/2.0/3.0*x^3.0+a^2.0/2.0/3.0*x^3.0+0.01111111111111111/11.0*x^11.0+a/2.0/3.0*x^3.0+b/2.0/3.0*x^3.0+a^2.0*0.023809523809523808/8.0*x^8.0+a/2.0/3.0*x^3.0+b/2.0/3.0*x^3.0+a^2.0/6.0/-1.0/x^1.0-a/2.0/3.0*x^3.0+b/2.0/3.0*x^3.0+a^2.0/6.0/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="a*0.16666666666666666*x^3.0+b*0.16666666666666666*x^3.0+a^2.0/6.0*x^3.0+0.0010101010101010099*x^11.0+a*0.16666666666666666*x^3.0+b*0.16666666666666666*x^3.0+a^2.0*0.002976190476190476*x^8.0+a*0.16666666666666666*x^3.0+b*0.16666666666666666*x^3.0-a^2.0/6.0/x-a*0.16666666666666666*x^3.0+b*0.16666666666666666*x^3.0+a^2.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "a*0.0+b*0.0+a^2.0*0.0+336.0*x^5.0+a*0.0+b*0.0+a^2.0*60.0*x^2.0+a*0.0+b*0.0-a^2.0*120.0/x^7.0-a*0.0+b*0.0+a^2.0*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "a*0.0+b*0.0*0.0+a^2.0*0.0*0.0+336.0*5.0*x^4.0+a*0.0*0.0+b*0.0*0.0+a^2.0*60.0*2.0*x^1.0+a*0.0*0.0+b*0.0*0.0-a^2.0*120.0*-7.0/x^8.0-a*0.0*0.0+b*0.0*0.0+a^2.0*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a*0.0+b*0.0+a^2.0*0.0+1680.0*x^4.0+a*0.0+b*0.0+a^2.0*120.0*x+a*0.0+b*0.0+a^2.0*840.0/x^8.0-a*0.0+b*0.0+a^2.0*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="a*0.16666666666666666*x^3.0+b*0.16666666666666666*x^3.0+a^2.0/6.0*x^3.0+0.0010101010101010099*x^11.0+a*0.16666666666666666*x^3.0+b*0.16666666666666666*x^3.0+a^2.0*0.002976190476190476*x^8.0+a*0.16666666666666666*x^3.0+b*0.16666666666666666*x^3.0-a^2.0/6.0/x-a*0.16666666666666666*x^3.0+b*0.16666666666666666*x^3.0+a^2.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="a*0.16666666666666666/4.0*x^4.0+b*0.16666666666666666/4.0*x^4.0+a^2.0/6.0/4.0*x^4.0+0.0010101010101010099/12.0*x^12.0+a*0.16666666666666666/4.0*x^4.0+b*0.16666666666666666/4.0*x^4.0+a^2.0*0.002976190476190476/9.0*x^9.0+a*0.16666666666666666/4.0*x^4.0+b*0.16666666666666666/4.0*x^4.0-a^2.0*6.0*ln(x)-a*0.16666666666666666/4.0*x^4.0+b*0.16666666666666666/4.0*x^4.0+a^2.0/24.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="a*0.041666666666666664*x^4.0+b*0.041666666666666664*x^4.0+a^2.0/24.0*x^4.0+8.417508417508415E-5*x^12.0+a*0.041666666666666664*x^4.0+b*0.041666666666666664*x^4.0+a^2.0*3.3068783068783067E-4*x^9.0+a*0.041666666666666664*x^4.0+b*0.041666666666666664*x^4.0-a^2.0*6.0*ln(x)-a*0.041666666666666664*x^4.0+b*0.041666666666666664*x^4.0+a^2.0/120.0*x^5.0-1.0416666666666667*x^4.0";
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
        UsageCalculus.EqnSolArrayMap3[8]="";
        UsageCalculus.EqnSolArrayIntegrAlone[8]="";
        UsageCalculus.EqnSolArrayMap4[8]="";
        UsageCalculus.EqnSolOrder[8] = 8;

        UsageCalculus.EqnSolArrayMap1[9] = "";
        UsageCalculus.EqnSolArrayDiffAlone[9] = "";
        UsageCalculus.EqnSolArrayMap2[9] = "";
        UsageCalculus.EqnSolArrayMap3[9]="";
        UsageCalculus.EqnSolArrayIntegrAlone[9]="";
        UsageCalculus.EqnSolArrayMap4[9]="";
        UsageCalculus.EqnSolOrder[9] = 9;

        UsageCalculus.EqnSolArrayMap1[10] = "";
        UsageCalculus.EqnSolArrayDiffAlone[10] = "";
        UsageCalculus.EqnSolArrayMap2[10] = "";
        UsageCalculus.EqnSolArrayMap3[10]="";
        UsageCalculus.EqnSolArrayIntegrAlone[10]="";
        UsageCalculus.EqnSolArrayMap4[10]="";
        UsageCalculus.EqnSolOrder[10] = 10;

        UsageCalculus.EqnSolArrayMap1[11] = "";
        UsageCalculus.EqnSolArrayDiffAlone[11] = "";
        UsageCalculus.EqnSolArrayMap2[11] = "";
        UsageCalculus.EqnSolArrayMap3[11]="";
        UsageCalculus.EqnSolArrayIntegrAlone[11]="";
        UsageCalculus.EqnSolArrayMap4[11]="";
        UsageCalculus.EqnSolOrder[11] = 11;

        UsageCalculus.EqnSolArrayMap1[12] = "";
        UsageCalculus.EqnSolArrayDiffAlone[12] = "";
        UsageCalculus.EqnSolArrayMap2[12] = "";
        UsageCalculus.EqnSolArrayMap3[12]="";
        UsageCalculus.EqnSolArrayIntegrAlone[12]="";
        UsageCalculus.EqnSolArrayMap4[12]="";
        UsageCalculus.EqnSolOrder[12] = 12;

        UsageCalculus.EqnSolArrayMap1[13] = "";
        UsageCalculus.EqnSolArrayDiffAlone[13] = "";
        UsageCalculus.EqnSolArrayMap2[13] = "";
        UsageCalculus.EqnSolArrayMap3[13]="";
        UsageCalculus.EqnSolArrayIntegrAlone[13]="";
        UsageCalculus.EqnSolArrayMap4[13]="";
        UsageCalculus.EqnSolOrder[13] = 13;

        UsageCalculus.EqnSolArrayMap1[14] = "";
        UsageCalculus.EqnSolArrayDiffAlone[14] = "";
        UsageCalculus.EqnSolArrayMap2[14] = "";
        UsageCalculus.EqnSolArrayMap3[14]="";
        UsageCalculus.EqnSolArrayIntegrAlone[14]="";
        UsageCalculus.EqnSolArrayMap4[14]="";
        UsageCalculus.EqnSolOrder[14] = 14;
    }
     /* ***************Parenthesis Test Case***************** */
        /* ******************* Constants, Variable, Ind Constant ********************* */
        /* **************************************** */
    public static void TestCaseDiff2042() {
        //Test Case 80000
        UsageCalculus.TestCase = 2042;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8 + x^5 + x^4 - 2*x- 25*(2)*1/1";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^8.0+x^5.0+x^4.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-2.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="x^8.0+x^5.0+x^4.0-2.0*x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/9.0*x^9.0+1.0/6.0*x^6.0+0.2*x^5.0-x^2.0-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0-2.0*0.0";
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
    public static void TestCaseDiff2043() {
        //Test Case 80001
        UsageCalculus.TestCase = 2043;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x/5.0";
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
        public static void TestCaseDiff2044() {
        //Test Case 80002
        UsageCalculus.TestCase = 2044;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(6) + x^5 + x^4 - 2*x*(7)- 1.0*(3*10)*25/1";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "6.0*x^8.0+x^5.0+x^4.0-14.0*x-750.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "6.0*8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0-750.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "48.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0";
        UsageCalculus.EqnSolArrayMap3[1]="6.0*x^8.0+x^5.0+x^4.0-14.0*x-750.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="6.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-14.0/2.0*x^2.0-750.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1.5*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-7.0*x^2.0-750.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "48.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "48.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0-14.0*0.0";
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
        public static void TestCaseDiff2045() {
        //Test Case 80003
        UsageCalculus.TestCase = 2045;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(2*4) + x^5*(2*3) + x^4 - x*(2/1)- 25.0*(2)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coeffiecient:Exponent";
        
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
        UsageCalculus.EqnSolArrayDiffAlone[2] = "64.0*7.0*x^6.0+30.0*4.0*x^3.0+4.0*3.0*x^2.0-2.0*0.0";
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
         public static void TestCaseDiff2046() {
        //Test Case 80004
        UsageCalculus.TestCase = 2046;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(6)*x^8 + x^5 + x^4 - 2*x*(7)- 3*25.0*(9)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "6.0*x^8.0+x^5.0+x^4.0-14.0*x-675.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "6.0*8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0-675.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "48.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0";
        UsageCalculus.EqnSolArrayMap3[1]="6.0*x^8.0+x^5.0+x^4.0-14.0*x-675.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="6.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-14.0/2.0*x^2.0-675.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1.5*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-7.0*x^2.0-675.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "48.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "48.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0-14.0*0.0";
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
        public static void TestCaseDiff2047() {
        //Test Case 80005
        UsageCalculus.TestCase = 2047;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(6) + x^5 + x^4 - 2*x*(7)- 1.0*(3*9)*25.0";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "6.0*x^8.0+x^5.0+x^4.0-14.0*x-675.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "6.0*8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0-675.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "48.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0";
        UsageCalculus.EqnSolArrayMap3[1]="6.0*x^8.0+x^5.0+x^4.0-14.0*x-675.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="6.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-14.0/2.0*x^2.0-675.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1.5*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-7.0*x^2.0-675.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "48.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "48.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0-14.0*0.0";
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
      public static void TestCaseDiff2048() {
        //Test Case 80006
        UsageCalculus.TestCase = 2048;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(6)*x^8 + x^5 + x^4 - 1.0*(2)*x*(7)- 1.0*(3)*25*(9.0)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "6.0*x^8.0+x^5.0+x^4.0-14.0*x-675.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "6.0*8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0-675.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "48.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0";
        UsageCalculus.EqnSolArrayMap3[1]="6.0*x^8.0+x^5.0+x^4.0-14.0*x-675.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="6.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-14.0/2.0*x^2.0-675.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1.5*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-7.0*x^2.0-675.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "48.0*x^7.0+5.0*x^4.0+4.0*x^3.0-14.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "48.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0-14.0*0.0";
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
      
        public static void TestCaseDiff2049() {
        //Test Case 80007
        UsageCalculus.TestCase = 2049;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(5*2)/x + x^5/x + x^4/x - 1.0*(2)*x*5/5- 1.0*(2)*25*(2.0)/2";
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
        public static void TestCaseDiff2050() {
        //Test Case 80008
        UsageCalculus.TestCase = 2050;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8 + sin(x) + x^5 + x^4 - x- 25.0";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Coefficients:0.0:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
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
        UsageCalculus.EqnSolArrayMap3[2]="1.0/9.0*x^9.0-8.0*cos(x)+1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*x^6.0-sin(x)+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*x^5.0-1.0*cos(x)+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*x^5.0-cos(x)+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*x^5.0-cos(x)+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*x^4.0-1.0*-sin(x)+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*x^4.0+sin(x)+120.0*x+24.0";
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
        // Parenthesis Test Case
        public static void TestCaseDiff2051() {
        //Test Case 80009
        UsageCalculus.TestCase = 2051;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(7) + x^5*(4*5) + x^4*(3*4) - (2)*x- 25*(1.0)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "7.0*x^8.0+20.0*x^5.0+12.0*x^4.0-2.0*x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "7.0*8.0*x^7.0+20.0*5.0*x^4.0+12.0*4.0*x^3.0-2.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "56.0*x^7.0+100.0*x^4.0+48.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayMap3[1]="7.0*x^8.0+20.0*x^5.0+12.0*x^4.0-2.0*x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="7.0/9.0*x^9.0+20.0/6.0*x^6.0+12.0/5.0*x^5.0-x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1.2857142857142858*x^9.0+3.3333333333333335*x^6.0+2.4*x^5.0-x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "56.0*x^7.0+100.0*x^4.0+48.0*x^3.0-2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "56.0*7.0*x^6.0+100.0*4.0*x^3.0+48.0*3.0*x^2.0-2.0*0.0";
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
        public static void TestCaseDiff2052() {
        //Test Case 80010
        UsageCalculus.TestCase = 2052;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x^8*(5*3+2) + x^5 + x^4 - 2*x*5- 2*(25.0*2)";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:Constants:Coefficient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 2;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "17.0*x^8.0+x^5.0+x^4.0-10.0*x-100.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "17.0*8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-10.0-100.0*0.0";
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
        /* ***************Parenthesis Test Case***************** */
        /* ******************* Constants, Variable, Ind Constant ********************* */
        /* **************************************** */
        /* ***************Names Test Case***************** */
        /* ******************* Constants, Variable, Ind Constant ********************* */
        /* **************************************** */
        public static void TestCaseDiff2053() {
        //Test Case 10001
        UsageCalculus.TestCase = 2053;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0/1.0*x^8 + x^5 + 3.0/3.0*x^4 - x - 25.0";
        UsageCalculus.TestCaseName = "Simple: Variables:1 Letter";
        UsageCalculus.TestCaseMatrixID="Variables:1 Letter:No Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x^8.0+x^5.0+x^4.0-x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-1.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-1.0";
        UsageCalculus.EqnSolArrayMap3[1]="x^8.0+x^5.0+x^4.0-x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*x^7.0+5.0*x^4.0+4.0*x^3.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*7.0*x^6.0+5.0*4.0*x^3.0+4.0*3.0*x^2.0-1.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/9.0*x^9.0+1.0/6.0*x^6.0+1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/9.0/10.0*x^10.0+1.0/6.0/7.0*x^7.0+1.0/5.0/6.0*x^6.0-1.0/2.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/90.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*x^6.0+20.0*x^3.0+12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*x^5.0+20.0*3.0*x^2.0+12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/90.0*x^10.0+1.0/42.0*x^7.0+1.0/30.0*x^6.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/90.0/11.0*x^11.0+1.0/42.0/8.0*x^8.0+1.0/30.0/7.0*x^7.0-1.0/6.0/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/990.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*x^5.0+60.0*x^2.0+24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*x^4.0+60.0*2.0*x^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/990.0*x^11.0+1.0/336.0*x^8.0+1.0/210.0*x^7.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/990.0/12.0*x^12.0+1.0/336.0/9.0*x^9.0+1.0/210.0/8.0*x^8.0-1.0/24.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/11880.0*x^12.0+1.0/3024.0*x^9.0+1.0/1680.0*x^8.0-1.0/120.0*x^5.0-1.0416666666666667*x^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;
        
        UsageCalculus.EqnSolArrayMap1[5] = "1680.0*x^4.0+120.0*x+24.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "1680.0*4.0*x^3.0+120.0+0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "6720.0*x^3.0+120.0+";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "6720.0*x^3.0+120.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "6720.0*3.0*x^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "20160.0*x^2.0+";
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
        public static void TestCaseDiff2054() {
        //Test Case 10002
        UsageCalculus.TestCase = 2054;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "xy^8 + xy^5.0 + xy^4 - xy - 25";
        UsageCalculus.TestCaseName = "Simple: Variables:2 Letter";
        UsageCalculus.TestCaseMatrixID="Variables:2 Letter:No Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xy";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "xy^8.0+xy^5.0+xy^4.0-xy-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*xy^7.0+5.0*xy^4.0+4.0*xy^3.0-1.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*xy^7.0+5.0*xy^4.0+4.0*xy^3.0-1.0";
        UsageCalculus.EqnSolArrayMap3[1]="xy^8.0+xy^5.0+xy^4.0-xy-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/9.0*xy^9.0+1.0/6.0*xy^6.0+1.0/5.0*xy^5.0-1.0/2.0*xy^2.0-25.0*xy";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/9.0*xy^9.0+1.0/6.0*xy^6.0+1.0/5.0*xy^5.0-1.0/2.0*xy^2.0-25.0*xy";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*xy^7.0+5.0*xy^4.0+4.0*xy^3.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*7.0*xy^6.0+5.0*4.0*xy^3.0+4.0*3.0*xy^2.0-1.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*xy^6.0+20.0*xy^3.0+12.0*xy^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/9.0*xy^9.0+1.0/6.0*xy^6.0+1.0/5.0*xy^5.0-1.0/2.0*xy^2.0-25.0*xy";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/9.0/10.0*xy^10.0+1.0/6.0/7.0*xy^7.0+1.0/5.0/6.0*xy^6.0-1.0/2.0/3.0*xy^3.0-25.0/2.0*xy^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/90.0*xy^10.0+1.0/42.0*xy^7.0+1.0/30.0*xy^6.0-1.0/6.0*xy^3.0-12.5*xy^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*xy^6.0+20.0*xy^3.0+12.0*xy^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*xy^5.0+20.0*3.0*xy^2.0+12.0*2.0*xy^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*xy^5.0+60.0*xy^2.0+24.0*xy";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/90.0*xy^10.0+1.0/42.0*xy^7.0+1.0/30.0*xy^6.0-1.0/6.0*xy^3.0-12.5*xy^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/90.0/11.0*xy^11.0+1.0/42.0/8.0*xy^8.0+1.0/30.0/7.0*xy^7.0-1.0/6.0/4.0*xy^4.0-12.5/3.0*xy^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/990.0*xy^11.0+1.0/336.0*xy^8.0+1.0/210.0*xy^7.0-1.0/24.0*xy^4.0-4.166666666666667*xy^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*xy^5.0+60.0*xy^2.0+24.0*xy";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*xy^4.0+60.0*2.0*xy^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*xy^4.0+120.0*xy+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/990.0*xy^11.0+1.0/336.0*xy^8.0+1.0/210.0*xy^7.0-1.0/24.0*xy^4.0-4.166666666666667*xy^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/990.0/12.0*xy^12.0+1.0/336.0/9.0*xy^9.0+1.0/210.0/8.0*xy^8.0-1.0/24.0/5.0*xy^5.0-4.166666666666667/4.0*xy^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/11880.0*xy^12.0+1.0/3024.0*xy^9.0+1.0/1680.0*xy^8.0-1.0/120.0*xy^5.0-1.0416666666666667*xy^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;
        
        UsageCalculus.EqnSolArrayMap1[5] = "1680.0*xy^4.0+120.0*xy+24.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "1680.0*4.0*xy^3.0+120.0+0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "6720.0*xy^3.0+120.0+";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "6720.0*xy^3.0+120.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "6720.0*3.0*xy^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "20160.0*xy^2.0+";
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
        public static void TestCaseDiff2055() {
        //Test Case 10003
        UsageCalculus.TestCase = 2055;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "abc^8 + abc^5.0 + abc^4 - abc - 25";
        UsageCalculus.TestCaseName = "Simple: Variables:3 Letter";
        UsageCalculus.TestCaseMatrixID="Variables:3 Letter:No Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "abc";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "abc^8.0+abc^5.0+abc^4.0-abc-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*abc^7.0+5.0*abc^4.0+4.0*abc^3.0-1.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*abc^7.0+5.0*abc^4.0+4.0*abc^3.0-1.0";
        UsageCalculus.EqnSolArrayMap3[1]="abc^8.0+abc^5.0+abc^4.0-abc-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/9.0*abc^9.0+1.0/6.0*abc^6.0+1.0/5.0*abc^5.0-1.0/2.0*abc^2.0-25.0*abc";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/9.0*abc^9.0+1.0/6.0*abc^6.0+1.0/5.0*abc^5.0-1.0/2.0*abc^2.0-25.0*abc";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*abc^7.0+5.0*abc^4.0+4.0*abc^3.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*7.0*abc^6.0+5.0*4.0*abc^3.0+4.0*3.0*abc^2.0-1.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*abc^6.0+20.0*abc^3.0+12.0*abc^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/9.0*abc^9.0+1.0/6.0*abc^6.0+1.0/5.0*abc^5.0-1.0/2.0*abc^2.0-25.0*abc";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/9.0/10.0*abc^10.0+1.0/6.0/7.0*abc^7.0+1.0/5.0/6.0*abc^6.0-1.0/2.0/3.0*abc^3.0-25.0/2.0*abc^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/90.0*abc^10.0+1.0/42.0*abc^7.0+1.0/30.0*abc^6.0-1.0/6.0*abc^3.0-12.5*abc^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*abc^6.0+20.0*abc^3.0+12.0*abc^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*abc^5.0+20.0*3.0*abc^2.0+12.0*2.0*abc^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*abc^5.0+60.0*abc^2.0+24.0*abc";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/90.0*abc^10.0+1.0/42.0*abc^7.0+1.0/30.0*abc^6.0-1.0/6.0*abc^3.0-12.5*abc^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/90.0/11.0*abc^11.0+1.0/42.0/8.0*abc^8.0+1.0/30.0/7.0*abc^7.0-1.0/6.0/4.0*abc^4.0-12.5/3.0*abc^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/990.0*abc^11.0+1.0/336.0*abc^8.0+1.0/210.0*abc^7.0-1.0/24.0*abc^4.0-4.166666666666667*abc^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*abc^5.0+60.0*abc^2.0+24.0*abc";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*abc^4.0+60.0*2.0*abc^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*abc^4.0+120.0*abc+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/990.0*abc^11.0+1.0/336.0*abc^8.0+1.0/210.0*abc^7.0-1.0/24.0*abc^4.0-4.166666666666667*abc^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/990.0/12.0*abc^12.0+1.0/336.0/9.0*abc^9.0+1.0/210.0/8.0*abc^8.0-1.0/24.0/5.0*abc^5.0-4.166666666666667/4.0*abc^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/11880.0*abc^12.0+1.0/3024.0*abc^9.0+1.0/1680.0*abc^8.0-1.0/120.0*abc^5.0-1.0416666666666667*abc^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;
        
        UsageCalculus.EqnSolArrayMap1[5] = "1680.0*abc^4.0+120.0*abc+24.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "1680.0*4.0*abc^3.0+120.0+0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "6720.0*abc^3.0+120.0+";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "6720.0*abc^3.0+120.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "6720.0*3.0*abc^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "20160.0*abc^2.0+";
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
        public static void TestCaseDiff2056() {
        //Test Case 10004
        UsageCalculus.TestCase = 2056;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "xyc1^8 + xyc1^5 + xyc1^4.0 - xyc1 - 25";
        UsageCalculus.TestCaseName = "Simple: Variables:3 Letter with Numerics";
        UsageCalculus.TestCaseMatrixID="Variables:3 Letter with Numerics:No Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "xyc1^8.0+xyc1^5.0+xyc1^4.0-xyc1-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*xyc1^7.0+5.0*xyc1^4.0+4.0*xyc1^3.0-1.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*xyc1^7.0+5.0*xyc1^4.0+4.0*xyc1^3.0-1.0";
        UsageCalculus.EqnSolArrayMap3[1]="xyc1^8.0+xyc1^5.0+xyc1^4.0-xyc1-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/9.0*xyc1^9.0+1.0/6.0*xyc1^6.0+1.0/5.0*xyc1^5.0-1.0/2.0*xyc1^2.0-25.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/9.0*xyc1^9.0+1.0/6.0*xyc1^6.0+1.0/5.0*xyc1^5.0-1.0/2.0*xyc1^2.0-25.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*xyc1^7.0+5.0*xyc1^4.0+4.0*xyc1^3.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*7.0*xyc1^6.0+5.0*4.0*xyc1^3.0+4.0*3.0*xyc1^2.0-1.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*xyc1^6.0+20.0*xyc1^3.0+12.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/9.0*xyc1^9.0+1.0/6.0*xyc1^6.0+1.0/5.0*xyc1^5.0-1.0/2.0*xyc1^2.0-25.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/9.0/10.0*xyc1^10.0+1.0/6.0/7.0*xyc1^7.0+1.0/5.0/6.0*xyc1^6.0-1.0/2.0/3.0*xyc1^3.0-25.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/90.0*xyc1^10.0+1.0/42.0*xyc1^7.0+1.0/30.0*xyc1^6.0-1.0/6.0*xyc1^3.0-12.5*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*xyc1^6.0+20.0*xyc1^3.0+12.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*xyc1^5.0+20.0*3.0*xyc1^2.0+12.0*2.0*xyc1^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*xyc1^5.0+60.0*xyc1^2.0+24.0*xyc1";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/90.0*xyc1^10.0+1.0/42.0*xyc1^7.0+1.0/30.0*xyc1^6.0-1.0/6.0*xyc1^3.0-12.5*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/90.0/11.0*xyc1^11.0+1.0/42.0/8.0*xyc1^8.0+1.0/30.0/7.0*xyc1^7.0-1.0/6.0/4.0*xyc1^4.0-12.5/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/990.0*xyc1^11.0+1.0/336.0*xyc1^8.0+1.0/210.0*xyc1^7.0-1.0/24.0*xyc1^4.0-4.166666666666667*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*xyc1^5.0+60.0*xyc1^2.0+24.0*xyc1";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*xyc1^4.0+60.0*2.0*xyc1^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*xyc1^4.0+120.0*xyc1+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/990.0*xyc1^11.0+1.0/336.0*xyc1^8.0+1.0/210.0*xyc1^7.0-1.0/24.0*xyc1^4.0-4.166666666666667*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/990.0/12.0*xyc1^12.0+1.0/336.0/9.0*xyc1^9.0+1.0/210.0/8.0*xyc1^8.0-1.0/24.0/5.0*xyc1^5.0-4.166666666666667/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/11880.0*xyc1^12.0+1.0/3024.0*xyc1^9.0+1.0/1680.0*xyc1^8.0-1.0/120.0*xyc1^5.0-1.0416666666666667*xyc1^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;
        
        UsageCalculus.EqnSolArrayMap1[5] = "1680.0*xyc1^4.0+120.0*xyc1+24.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "1680.0*4.0*xyc1^3.0+120.0+0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "6720.0*xyc1^3.0+120.0+";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "6720.0*xyc1^3.0+120.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "6720.0*3.0*xyc1^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "20160.0*xyc1^2.0+";
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
        public static void TestCaseDiff2057() {
        //Test Case 10005
        UsageCalculus.TestCase = 2057;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x2yc1^8 + x2yc1^5 + x2yc1^4.0 - x2yc1 - 25";
        UsageCalculus.TestCaseName = "Simple: Variables:3 Letter with Numerics";
        UsageCalculus.TestCaseMatrixID="Variables:3 Letter with Numerics:No Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x2yc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x2yc1^8.0+x2yc1^5.0+x2yc1^4.0-x2yc1-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*x2yc1^7.0+5.0*x2yc1^4.0+4.0*x2yc1^3.0-1.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*x2yc1^7.0+5.0*x2yc1^4.0+4.0*x2yc1^3.0-1.0";
        UsageCalculus.EqnSolArrayMap3[1]="x2yc1^8.0+x2yc1^5.0+x2yc1^4.0-x2yc1-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/9.0*x2yc1^9.0+1.0/6.0*x2yc1^6.0+1.0/5.0*x2yc1^5.0-1.0/2.0*x2yc1^2.0-25.0*x2yc1";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/9.0*x2yc1^9.0+1.0/6.0*x2yc1^6.0+1.0/5.0*x2yc1^5.0-1.0/2.0*x2yc1^2.0-25.0*x2yc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*x2yc1^7.0+5.0*x2yc1^4.0+4.0*x2yc1^3.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*7.0*x2yc1^6.0+5.0*4.0*x2yc1^3.0+4.0*3.0*x2yc1^2.0-1.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*x2yc1^6.0+20.0*x2yc1^3.0+12.0*x2yc1^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/9.0*x2yc1^9.0+1.0/6.0*x2yc1^6.0+1.0/5.0*x2yc1^5.0-1.0/2.0*x2yc1^2.0-25.0*x2yc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/9.0/10.0*x2yc1^10.0+1.0/6.0/7.0*x2yc1^7.0+1.0/5.0/6.0*x2yc1^6.0-1.0/2.0/3.0*x2yc1^3.0-25.0/2.0*x2yc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/90.0*x2yc1^10.0+1.0/42.0*x2yc1^7.0+1.0/30.0*x2yc1^6.0-1.0/6.0*x2yc1^3.0-12.5*x2yc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*x2yc1^6.0+20.0*x2yc1^3.0+12.0*x2yc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*x2yc1^5.0+20.0*3.0*x2yc1^2.0+12.0*2.0*x2yc1^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*x2yc1^5.0+60.0*x2yc1^2.0+24.0*x2yc1";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/90.0*x2yc1^10.0+1.0/42.0*x2yc1^7.0+1.0/30.0*x2yc1^6.0-1.0/6.0*x2yc1^3.0-12.5*x2yc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/90.0/11.0*x2yc1^11.0+1.0/42.0/8.0*x2yc1^8.0+1.0/30.0/7.0*x2yc1^7.0-1.0/6.0/4.0*x2yc1^4.0-12.5/3.0*x2yc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/990.0*x2yc1^11.0+1.0/336.0*x2yc1^8.0+1.0/210.0*x2yc1^7.0-1.0/24.0*x2yc1^4.0-4.166666666666667*x2yc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*x2yc1^5.0+60.0*x2yc1^2.0+24.0*x2yc1";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*x2yc1^4.0+60.0*2.0*x2yc1^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*x2yc1^4.0+120.0*x2yc1+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/990.0*x2yc1^11.0+1.0/336.0*x2yc1^8.0+1.0/210.0*x2yc1^7.0-1.0/24.0*x2yc1^4.0-4.166666666666667*x2yc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/990.0/12.0*x2yc1^12.0+1.0/336.0/9.0*x2yc1^9.0+1.0/210.0/8.0*x2yc1^8.0-1.0/24.0/5.0*x2yc1^5.0-4.166666666666667/4.0*x2yc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/11880.0*x2yc1^12.0+1.0/3024.0*x2yc1^9.0+1.0/1680.0*x2yc1^8.0-1.0/120.0*x2yc1^5.0-1.0416666666666667*x2yc1^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;
        
        UsageCalculus.EqnSolArrayMap1[5] = "1680.0*x2yc1^4.0+120.0*x2yc1+24.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "1680.0*4.0*x2yc1^3.0+120.0+0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "6720.0*x2yc1^3.0+120.0+";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "6720.0*x2yc1^3.0+120.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "6720.0*3.0*x2yc1^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "20160.0*x2yc1^2.0+";
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
        public static void TestCaseDiff2058() {
        //Test Case 10006
        UsageCalculus.TestCase = 2058;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x2yc1^8.0*xyc1 + x2yc1^5*xyc1 + x2yc1^4*xyc1 - x2yc1*xyc1 - 25";
        UsageCalculus.TestCaseName = "Simple: Variables:3 Letter with Numerics";
        UsageCalculus.TestCaseMatrixID="Variables:3 Letter with Numerics:No Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x2yc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "xyc1*x2yc1^8.0+xyc1*x2yc1^5.0+xyc1*x2yc1^4.0-xyc1*x2yc1-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "xyc1*8.0*x2yc1^7.0+xyc1*5.0*x2yc1^4.0+xyc1*4.0*x2yc1^3.0-xyc1-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "xyc1*8.0*x2yc1^7.0+xyc1*5.0*x2yc1^4.0+xyc1*4.0*x2yc1^3.0-xyc1";
        UsageCalculus.EqnSolArrayMap3[1]="xyc1*x2yc1^8.0+xyc1*x2yc1^5.0+xyc1*x2yc1^4.0-xyc1*x2yc1-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="xyc1/9.0*x2yc1^9.0+xyc1/6.0*x2yc1^6.0+xyc1/5.0*x2yc1^5.0-xyc1/2.0*x2yc1^2.0-25.0*x2yc1";
        UsageCalculus.EqnSolArrayMap4[1]="xyc1/9.0*x2yc1^9.0+xyc1/6.0*x2yc1^6.0+xyc1/5.0*x2yc1^5.0-xyc1/2.0*x2yc1^2.0-25.0*x2yc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "xyc1*8.0*x2yc1^7.0+xyc1*5.0*x2yc1^4.0+xyc1*4.0*x2yc1^3.0-xyc1";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "xyc1*8.0*7.0*x2yc1^6.0+xyc1*5.0*4.0*x2yc1^3.0+xyc1*4.0*3.0*x2yc1^2.0-xyc1*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "xyc1*56.0*x2yc1^6.0+xyc1*20.0*x2yc1^3.0+xyc1*12.0*x2yc1^2.0-xyc1*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="xyc1/9.0*x2yc1^9.0+xyc1/6.0*x2yc1^6.0+xyc1/5.0*x2yc1^5.0-xyc1/2.0*x2yc1^2.0-25.0*x2yc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="xyc1/9.0/10.0*x2yc1^10.0+xyc1/6.0/7.0*x2yc1^7.0+xyc1/5.0/6.0*x2yc1^6.0-xyc1/2.0/3.0*x2yc1^3.0-25.0/2.0*x2yc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="xyc1*0.011111111111111112*x2yc1^10.0+xyc1*0.023809523809523808*x2yc1^7.0+xyc1*0.03333333333333333*x2yc1^6.0-xyc1/6.0*x2yc1^3.0-12.5*x2yc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "xyc1*56.0*x2yc1^6.0+xyc1*20.0*x2yc1^3.0+xyc1*12.0*x2yc1^2.0-xyc1*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "xyc1*56.0*6.0*x2yc1^5.0+xyc1*20.0*3.0*x2yc1^2.0+xyc1*12.0*2.0*x2yc1^1.0-xyc1*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "xyc1*336.0*x2yc1^5.0+xyc1*60.0*x2yc1^2.0+xyc1*24.0*x2yc1-xyc1*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="xyc1*0.011111111111111112*x2yc1^10.0+xyc1*0.023809523809523808*x2yc1^7.0+xyc1*0.03333333333333333*x2yc1^6.0-xyc1/6.0*x2yc1^3.0-12.5*x2yc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="xyc1*0.011111111111111112/11.0*x2yc1^11.0+xyc1*0.023809523809523808/8.0*x2yc1^8.0+xyc1*0.03333333333333333/7.0*x2yc1^7.0-xyc1/6.0/4.0*x2yc1^4.0-12.5/3.0*x2yc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="xyc1*0.00101010101010101*x2yc1^11.0+xyc1*0.002976190476190476*x2yc1^8.0+xyc1*0.0047619047619047615*x2yc1^7.0-xyc1/24.0*x2yc1^4.0-4.166666666666667*x2yc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "xyc1*336.0*x2yc1^5.0+xyc1*60.0*x2yc1^2.0+xyc1*24.0*x2yc1-xyc1*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "xyc1*336.0*5.0*x2yc1^4.0+xyc1*60.0*2.0*x2yc1^1.0+xyc1*24.0-xyc1*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "xyc1*1680.0*x2yc1^4.0+xyc1*120.0*x2yc1+xyc1*24.0-xyc1*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="xyc1*0.00101010101010101*x2yc1^11.0+xyc1*0.002976190476190476*x2yc1^8.0+xyc1*0.0047619047619047615*x2yc1^7.0-xyc1/24.0*x2yc1^4.0-4.166666666666667*x2yc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="xyc1*0.00101010101010101/12.0*x2yc1^12.0+xyc1*0.002976190476190476/9.0*x2yc1^9.0+xyc1*0.0047619047619047615/8.0*x2yc1^8.0-xyc1/24.0/5.0*x2yc1^5.0-4.166666666666667/4.0*x2yc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="xyc1*8.417508417508418E-5*x2yc1^12.0+xyc1*3.3068783068783067E-4*x2yc1^9.0+xyc1*5.952380952380952E-4*x2yc1^8.0-xyc1/120.0*x2yc1^5.0-1.0416666666666667*x2yc1^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;
        
        UsageCalculus.EqnSolArrayMap1[5] = "1680.0*x2yc1^4.0+120.0*x2yc1+24.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "1680.0*4.0*x2yc1^3.0+120.0+0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "6720.0*x2yc1^3.0+120.0+";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "6720.0*x2yc1^3.0+120.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "6720.0*3.0*x2yc1^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "20160.0*x2yc1^2.0+";
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
        public static void TestCaseDiff2059() {
        //Test Case 10007
        UsageCalculus.TestCase = 2059;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x2yc1^8*x1yc1 + x2yc1^5*x1yc1 + x2yc1^4*x1yc1 - x2yc1*x1yc1 - 1.0*25";
        UsageCalculus.TestCaseName = "Simple: Variables:3 Letter with Numerics";
        UsageCalculus.TestCaseMatrixID="Variables:3 Letter with Numerics:No Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x2yc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x1yc1*x2yc1^8.0+x1yc1*x2yc1^5.0+x1yc1*x2yc1^4.0-x1yc1*x2yc1-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "x1yc1*8.0*x2yc1^7.0+x1yc1*5.0*x2yc1^4.0+x1yc1*4.0*x2yc1^3.0-x1yc1-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "x1yc1*8.0*x2yc1^7.0+x1yc1*5.0*x2yc1^4.0+x1yc1*4.0*x2yc1^3.0-x1yc1";
        UsageCalculus.EqnSolArrayMap3[1]="x1yc1*x2yc1^8.0+x1yc1*x2yc1^5.0+x1yc1*x2yc1^4.0-x1yc1*x2yc1-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="x1yc1/9.0*x2yc1^9.0+x1yc1/6.0*x2yc1^6.0+x1yc1/5.0*x2yc1^5.0-x1yc1/2.0*x2yc1^2.0-25.0*x2yc1";
        UsageCalculus.EqnSolArrayMap4[1]="x1yc1/9.0*x2yc1^9.0+x1yc1/6.0*x2yc1^6.0+x1yc1/5.0*x2yc1^5.0-x1yc1/2.0*x2yc1^2.0-25.0*x2yc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "x1yc1*8.0*x2yc1^7.0+x1yc1*5.0*x2yc1^4.0+x1yc1*4.0*x2yc1^3.0-x1yc1";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "x1yc1*8.0*7.0*x2yc1^6.0+x1yc1*5.0*4.0*x2yc1^3.0+x1yc1*4.0*3.0*x2yc1^2.0-x1yc1*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "x1yc1*56.0*x2yc1^6.0+x1yc1*20.0*x2yc1^3.0+x1yc1*12.0*x2yc1^2.0-x1yc1*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="x1yc1/9.0*x2yc1^9.0+x1yc1/6.0*x2yc1^6.0+x1yc1/5.0*x2yc1^5.0-x1yc1/2.0*x2yc1^2.0-25.0*x2yc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="x1yc1/9.0/10.0*x2yc1^10.0+x1yc1/6.0/7.0*x2yc1^7.0+x1yc1/5.0/6.0*x2yc1^6.0-x1yc1/2.0/3.0*x2yc1^3.0-25.0/2.0*x2yc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="x1yc1*0.011111111111111112*x2yc1^10.0+x1yc1*0.023809523809523808*x2yc1^7.0+x1yc1*0.03333333333333333*x2yc1^6.0-x1yc1/6.0*x2yc1^3.0-12.5*x2yc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "x1yc1*56.0*x2yc1^6.0+x1yc1*20.0*x2yc1^3.0+x1yc1*12.0*x2yc1^2.0-x1yc1*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "x1yc1*56.0*6.0*x2yc1^5.0+x1yc1*20.0*3.0*x2yc1^2.0+x1yc1*12.0*2.0*x2yc1^1.0-x1yc1*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "x1yc1*336.0*x2yc1^5.0+x1yc1*60.0*x2yc1^2.0+x1yc1*24.0*x2yc1-x1yc1*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="x1yc1*0.011111111111111112*x2yc1^10.0+x1yc1*0.023809523809523808*x2yc1^7.0+x1yc1*0.03333333333333333*x2yc1^6.0-x1yc1/6.0*x2yc1^3.0-12.5*x2yc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="x1yc1*0.011111111111111112/11.0*x2yc1^11.0+x1yc1*0.023809523809523808/8.0*x2yc1^8.0+x1yc1*0.03333333333333333/7.0*x2yc1^7.0-x1yc1/6.0/4.0*x2yc1^4.0-12.5/3.0*x2yc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="x1yc1*0.00101010101010101*x2yc1^11.0+x1yc1*0.002976190476190476*x2yc1^8.0+x1yc1*0.0047619047619047615*x2yc1^7.0-x1yc1/24.0*x2yc1^4.0-4.166666666666667*x2yc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "x1yc1*336.0*x2yc1^5.0+x1yc1*60.0*x2yc1^2.0+x1yc1*24.0*x2yc1-x1yc1*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "x1yc1*336.0*5.0*x2yc1^4.0+x1yc1*60.0*2.0*x2yc1^1.0+x1yc1*24.0-x1yc1*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "x1yc1*1680.0*x2yc1^4.0+x1yc1*120.0*x2yc1+x1yc1*24.0-x1yc1*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="x1yc1*0.00101010101010101*x2yc1^11.0+x1yc1*0.002976190476190476*x2yc1^8.0+x1yc1*0.0047619047619047615*x2yc1^7.0-x1yc1/24.0*x2yc1^4.0-4.166666666666667*x2yc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="x1yc1*0.00101010101010101/12.0*x2yc1^12.0+x1yc1*0.002976190476190476/9.0*x2yc1^9.0+x1yc1*0.0047619047619047615/8.0*x2yc1^8.0-x1yc1/24.0/5.0*x2yc1^5.0-4.166666666666667/4.0*x2yc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="x1yc1*8.417508417508418E-5*x2yc1^12.0+x1yc1*3.3068783068783067E-4*x2yc1^9.0+x1yc1*5.952380952380952E-4*x2yc1^8.0-x1yc1/120.0*x2yc1^5.0-1.0416666666666667*x2yc1^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;
        
        UsageCalculus.EqnSolArrayMap1[5] = "1680.0*x2yc1^4.0+120.0*x2yc1+24.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "1680.0*4.0*x2yc1^3.0+120.0+0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "6720.0*x2yc1^3.0+120.0+";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "6720.0*x2yc1^3.0+120.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "6720.0*3.0*x2yc1^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "20160.0*x2yc1^2.0+";
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
        public static void TestCaseDiff2060() {
        //Test Case 10008
        UsageCalculus.TestCase = 2060;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x1yc1*x2yc1^8 + x1yc1*x2yc1^5 + x1yc1*x2yc1^4 - x1yc1*x2yc1 - 25*1.0";
        UsageCalculus.TestCaseName = "Simple: Variables:3 Letter with Numerics";
        UsageCalculus.TestCaseMatrixID="Variables:3 Letter with Numerics:No Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x2yc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x1yc1*x2yc1^8.0+x1yc1*x2yc1^5.0+x1yc1*x2yc1^4.0-x1yc1*x2yc1-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "x1yc1*8.0*x2yc1^7.0+x1yc1*5.0*x2yc1^4.0+x1yc1*4.0*x2yc1^3.0-x1yc1-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "x1yc1*8.0*x2yc1^7.0+x1yc1*5.0*x2yc1^4.0+x1yc1*4.0*x2yc1^3.0-x1yc1";
        UsageCalculus.EqnSolArrayMap3[1]="x1yc1*x2yc1^8.0+x1yc1*x2yc1^5.0+x1yc1*x2yc1^4.0-x1yc1*x2yc1-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="x1yc1/9.0*x2yc1^9.0+x1yc1/6.0*x2yc1^6.0+x1yc1/5.0*x2yc1^5.0-x1yc1/2.0*x2yc1^2.0-25.0*x2yc1";
        UsageCalculus.EqnSolArrayMap4[1]="x1yc1/9.0*x2yc1^9.0+x1yc1/6.0*x2yc1^6.0+x1yc1/5.0*x2yc1^5.0-x1yc1/2.0*x2yc1^2.0-25.0*x2yc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "x1yc1*8.0*x2yc1^7.0+x1yc1*5.0*x2yc1^4.0+x1yc1*4.0*x2yc1^3.0-x1yc1";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "x1yc1*8.0*7.0*x2yc1^6.0+x1yc1*5.0*4.0*x2yc1^3.0+x1yc1*4.0*3.0*x2yc1^2.0-x1yc1*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "x1yc1*56.0*x2yc1^6.0+x1yc1*20.0*x2yc1^3.0+x1yc1*12.0*x2yc1^2.0-x1yc1*0.0";
        UsageCalculus.EqnSolArrayMap3[2]="x1yc1/9.0*x2yc1^9.0+x1yc1/6.0*x2yc1^6.0+x1yc1/5.0*x2yc1^5.0-x1yc1/2.0*x2yc1^2.0-25.0*x2yc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="x1yc1/9.0/10.0*x2yc1^10.0+x1yc1/6.0/7.0*x2yc1^7.0+x1yc1/5.0/6.0*x2yc1^6.0-x1yc1/2.0/3.0*x2yc1^3.0-25.0/2.0*x2yc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="x1yc1*0.011111111111111112*x2yc1^10.0+x1yc1*0.023809523809523808*x2yc1^7.0+x1yc1*0.03333333333333333*x2yc1^6.0-x1yc1/6.0*x2yc1^3.0-12.5*x2yc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "x1yc1*56.0*x2yc1^6.0+x1yc1*20.0*x2yc1^3.0+x1yc1*12.0*x2yc1^2.0-x1yc1*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "x1yc1*56.0*6.0*x2yc1^5.0+x1yc1*20.0*3.0*x2yc1^2.0+x1yc1*12.0*2.0*x2yc1^1.0-x1yc1*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "x1yc1*336.0*x2yc1^5.0+x1yc1*60.0*x2yc1^2.0+x1yc1*24.0*x2yc1-x1yc1*0.0";
        UsageCalculus.EqnSolArrayMap3[3]="x1yc1*0.011111111111111112*x2yc1^10.0+x1yc1*0.023809523809523808*x2yc1^7.0+x1yc1*0.03333333333333333*x2yc1^6.0-x1yc1/6.0*x2yc1^3.0-12.5*x2yc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="x1yc1*0.011111111111111112/11.0*x2yc1^11.0+x1yc1*0.023809523809523808/8.0*x2yc1^8.0+x1yc1*0.03333333333333333/7.0*x2yc1^7.0-x1yc1/6.0/4.0*x2yc1^4.0-12.5/3.0*x2yc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="x1yc1*0.00101010101010101*x2yc1^11.0+x1yc1*0.002976190476190476*x2yc1^8.0+x1yc1*0.0047619047619047615*x2yc1^7.0-x1yc1/24.0*x2yc1^4.0-4.166666666666667*x2yc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "x1yc1*336.0*x2yc1^5.0+x1yc1*60.0*x2yc1^2.0+x1yc1*24.0*x2yc1-x1yc1*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "x1yc1*336.0*5.0*x2yc1^4.0+x1yc1*60.0*2.0*x2yc1^1.0+x1yc1*24.0-x1yc1*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "x1yc1*1680.0*x2yc1^4.0+x1yc1*120.0*x2yc1+x1yc1*24.0-x1yc1*0.0";
        UsageCalculus.EqnSolArrayMap3[4]="x1yc1*0.00101010101010101*x2yc1^11.0+x1yc1*0.002976190476190476*x2yc1^8.0+x1yc1*0.0047619047619047615*x2yc1^7.0-x1yc1/24.0*x2yc1^4.0-4.166666666666667*x2yc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="x1yc1*0.00101010101010101/12.0*x2yc1^12.0+x1yc1*0.002976190476190476/9.0*x2yc1^9.0+x1yc1*0.0047619047619047615/8.0*x2yc1^8.0-x1yc1/24.0/5.0*x2yc1^5.0-4.166666666666667/4.0*x2yc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="x1yc1*8.417508417508418E-5*x2yc1^12.0+x1yc1*3.3068783068783067E-4*x2yc1^9.0+x1yc1*5.952380952380952E-4*x2yc1^8.0-x1yc1/120.0*x2yc1^5.0-1.0416666666666667*x2yc1^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;
        
        UsageCalculus.EqnSolArrayMap1[5] = "1680.0*x2yc1^4.0+120.0*x2yc1+24.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "1680.0*4.0*x2yc1^3.0+120.0+0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "6720.0*x2yc1^3.0+120.0+";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "6720.0*x2yc1^3.0+120.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "6720.0*3.0*x2yc1^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "20160.0*x2yc1^2.0+";
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
        public static void TestCaseDiff2061() {
        //Test Case 10009
        UsageCalculus.TestCase = 2061;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x1yc1/x2yc1^8 + x1yc1/x2yc1^5 + x1yc1/x2yc1^4 - x1yc1/x2yc1 - 25/1";
        UsageCalculus.TestCaseName = "Simple: Variables:3 Letter with Numerics";
        UsageCalculus.TestCaseMatrixID="Variables:3 Letter with Numerics:No Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x2yc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x1yc1/x2yc1^8.0+x1yc1/x2yc1^5.0+x1yc1/x2yc1^4.0-x1yc1/x2yc1-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "x1yc1*-8.0/x2yc1^9.0+x1yc1*-5.0/x2yc1^6.0+x1yc1*-4.0/x2yc1^5.0+x1yc1/x2yc1^2.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-x1yc1*8.0/x2yc1^9.0-x1yc1*5.0/x2yc1^6.0-x1yc1*4.0/x2yc1^5.0+x1yc1/x2yc1^2.0";
        UsageCalculus.EqnSolArrayMap3[1]="x1yc1/x2yc1^8.0+x1yc1/x2yc1^5.0+x1yc1/x2yc1^4.0-x1yc1/x2yc1-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="x1yc1/-7.0/x2yc1^7.0+x1yc1/-4.0/x2yc1^4.0+x1yc1/-3.0/x2yc1^3.0-x1yc1*ln(x2yc1)-25.0*x2yc1";
        UsageCalculus.EqnSolArrayMap4[1]="-x1yc1/7.0/x2yc1^7.0-x1yc1/4.0/x2yc1^4.0-x1yc1/3.0/x2yc1^3.0-x1yc1*ln(x2yc1)-25.0*x2yc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-x1yc1*8.0/x2yc1^9.0-x1yc1*5.0/x2yc1^6.0-x1yc1*4.0/x2yc1^5.0+x1yc1/x2yc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-x1yc1*8.0*-9.0/x2yc1^10.0-x1yc1*5.0*-6.0/x2yc1^7.0-x1yc1*4.0*-5.0/x2yc1^6.0+x1yc1*-2.0/x2yc1^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "x1yc1*72.0/x2yc1^10.0+x1yc1*30.0/x2yc1^7.0+x1yc1*20.0/x2yc1^6.0-x1yc1*2.0/x2yc1^3.0";
        UsageCalculus.EqnSolArrayMap3[2]="";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="";
        UsageCalculus.EqnSolArrayMap4[2]="";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "x1yc1*72.0/x2yc1^10.0+x1yc1*30.0/x2yc1^7.0+x1yc1*20.0/x2yc1^6.0-x1yc1*2.0/x2yc1^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "x1yc1*72.0*-10.0/x2yc1^11.0+x1yc1*30.0*-7.0/x2yc1^8.0+x1yc1*20.0*-6.0/x2yc1^7.0-x1yc1*2.0*-3.0/x2yc1^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-x1yc1*720.0/x2yc1^11.0-x1yc1*210.0/x2yc1^8.0-x1yc1*120.0/x2yc1^7.0+x1yc1*6.0/x2yc1^4.0";
        UsageCalculus.EqnSolArrayMap3[3]="";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="";
        UsageCalculus.EqnSolArrayMap4[3]="";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-x1yc1*720.0/x2yc1^11.0-x1yc1*209.99999999999997/x2yc1^8.0-x1yc1*120.0/x2yc1^7.0+x1yc1*6.0/x2yc1^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-x1yc1*720.0*-11.0/x2yc1^12.0-x1yc1*209.99999999999997*-8.0/x2yc1^9.0-x1yc1*120.0*-7.0/x2yc1^8.0+x1yc1*6.0*-4.0/x2yc1^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "x1yc1*7920.0/x2yc1^12.0+x1yc1*1679.9999999999998/x2yc1^9.0+x1yc1*840.0/x2yc1^8.0-x1yc1*24.0/x2yc1^5.0";
        UsageCalculus.EqnSolArrayMap3[4]="";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="";
        UsageCalculus.EqnSolArrayMap4[4]="";
        UsageCalculus.EqnSolOrder[4] = 4;
        
        UsageCalculus.EqnSolArrayMap1[5] = "1680.0*x2yc1^4.0+120.0*x2yc1+24.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "1680.0*4.0*x2yc1^3.0+120.0+0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "6720.0*x2yc1^3.0+120.0+";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "6720.0*x2yc1^3.0+120.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "6720.0*3.0*x2yc1^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "20160.0*x2yc1^2.0+";
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
        public static void TestCaseDiff2062() {
        //Test Case 10010
        UsageCalculus.TestCase = 2062;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "x1yc1x2yc1^8 + x1yc1x2yc1^5 + x1yc1x2yc1^4 - x1yc1x2yc1 - 25/1.0";
        UsageCalculus.TestCaseName = "Simple: Variables:3 Letter with Numerics";
        UsageCalculus.TestCaseMatrixID="Variables:3 Letter with Numerics:No Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x1yc1x2yc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "x1yc1x2yc1^8.0+x1yc1x2yc1^5.0+x1yc1x2yc1^4.0-x1yc1x2yc1-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*x1yc1x2yc1^7.0+5.0*x1yc1x2yc1^4.0+4.0*x1yc1x2yc1^3.0-1.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*x1yc1x2yc1^7.0+5.0*x1yc1x2yc1^4.0+4.0*x1yc1x2yc1^3.0-1.0";
        UsageCalculus.EqnSolArrayMap3[1]="x1yc1x2yc1^8.0+x1yc1x2yc1^5.0+x1yc1x2yc1^4.0-x1yc1x2yc1-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/9.0*x1yc1x2yc1^9.0+1.0/6.0*x1yc1x2yc1^6.0+1.0/5.0*x1yc1x2yc1^5.0-1.0/2.0*x1yc1x2yc1^2.0-25.0*x1yc1x2yc1";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/9.0*x1yc1x2yc1^9.0+1.0/6.0*x1yc1x2yc1^6.0+1.0/5.0*x1yc1x2yc1^5.0-1.0/2.0*x1yc1x2yc1^2.0-25.0*x1yc1x2yc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*x1yc1x2yc1^7.0+5.0*x1yc1x2yc1^4.0+4.0*x1yc1x2yc1^3.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*7.0*x1yc1x2yc1^6.0+5.0*4.0*x1yc1x2yc1^3.0+4.0*3.0*x1yc1x2yc1^2.0-1.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*x1yc1x2yc1^6.0+20.0*x1yc1x2yc1^3.0+12.0*x1yc1x2yc1^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/9.0*x1yc1x2yc1^9.0+1.0/6.0*x1yc1x2yc1^6.0+1.0/5.0*x1yc1x2yc1^5.0-1.0/2.0*x1yc1x2yc1^2.0-25.0*x1yc1x2yc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/9.0/10.0*x1yc1x2yc1^10.0+1.0/6.0/7.0*x1yc1x2yc1^7.0+1.0/5.0/6.0*x1yc1x2yc1^6.0-1.0/2.0/3.0*x1yc1x2yc1^3.0-25.0/2.0*x1yc1x2yc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/90.0*x1yc1x2yc1^10.0+1.0/42.0*x1yc1x2yc1^7.0+1.0/30.0*x1yc1x2yc1^6.0-1.0/6.0*x1yc1x2yc1^3.0-12.5*x1yc1x2yc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*x1yc1x2yc1^6.0+20.0*x1yc1x2yc1^3.0+12.0*x1yc1x2yc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*x1yc1x2yc1^5.0+20.0*3.0*x1yc1x2yc1^2.0+12.0*2.0*x1yc1x2yc1^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*x1yc1x2yc1^5.0+60.0*x1yc1x2yc1^2.0+24.0*x1yc1x2yc1";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/90.0*x1yc1x2yc1^10.0+1.0/42.0*x1yc1x2yc1^7.0+1.0/30.0*x1yc1x2yc1^6.0-1.0/6.0*x1yc1x2yc1^3.0-12.5*x1yc1x2yc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/90.0/11.0*x1yc1x2yc1^11.0+1.0/42.0/8.0*x1yc1x2yc1^8.0+1.0/30.0/7.0*x1yc1x2yc1^7.0-1.0/6.0/4.0*x1yc1x2yc1^4.0-12.5/3.0*x1yc1x2yc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/990.0*x1yc1x2yc1^11.0+1.0/336.0*x1yc1x2yc1^8.0+1.0/210.0*x1yc1x2yc1^7.0-1.0/24.0*x1yc1x2yc1^4.0-4.166666666666667*x1yc1x2yc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*x1yc1x2yc1^5.0+60.0*x1yc1x2yc1^2.0+24.0*x1yc1x2yc1";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*x1yc1x2yc1^4.0+60.0*2.0*x1yc1x2yc1^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*x1yc1x2yc1^4.0+120.0*x1yc1x2yc1+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/990.0*x1yc1x2yc1^11.0+1.0/336.0*x1yc1x2yc1^8.0+1.0/210.0*x1yc1x2yc1^7.0-1.0/24.0*x1yc1x2yc1^4.0-4.166666666666667*x1yc1x2yc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/990.0/12.0*x1yc1x2yc1^12.0+1.0/336.0/9.0*x1yc1x2yc1^9.0+1.0/210.0/8.0*x1yc1x2yc1^8.0-1.0/24.0/5.0*x1yc1x2yc1^5.0-4.166666666666667/4.0*x1yc1x2yc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/11880.0*x1yc1x2yc1^12.0+1.0/3024.0*x1yc1x2yc1^9.0+1.0/1680.0*x1yc1x2yc1^8.0-1.0/120.0*x1yc1x2yc1^5.0-1.0416666666666667*x1yc1x2yc1^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;
        
        UsageCalculus.EqnSolArrayMap1[5] = "1680.0*x2yc1^4.0+120.0*x2yc1+24.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "1680.0*4.0*x2yc1^3.0+120.0+0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "6720.0*x2yc1^3.0+120.0+";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "6720.0*x2yc1^3.0+120.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "6720.0*3.0*x2yc1^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "20160.0*x2yc1^2.0+";
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
/* ***************Names Test Case***************** */
        /* ******************* Constants, Variable, Ind Constant ********************* */
        /* **************************************** */ 
        /* ***************Exponent Inversion  Test Case***************** */
        public static void TestCaseDiff2063() {
        //Test Case 2010
        TestCase = 2063;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";
        EqnUnderTest = "1.0*25.0/25/x^8 + 1.0*25/25/x^5 + 1.0*25/25/x^4 - 1.0*25/25/x - 25*25/25";
        TestCaseName = "Simple: Coefficients:25/25";
        TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        DiffWithRespTo = "x";
        MaxDiffOrder = 14;
        MaxIntegreOrder = 2;
        
        EqnSolArrayMap1[1] = "1.0/x^8.0+1.0/x^5.0+1.0/x^4.0-1.0/x-25.0";
        EqnSolArrayDiffAlone[1] = "-8.0/x^9.0-5.0/x^6.0-4.0/x^5.0+1.0/x^2.0-25.0*0.0";
        EqnSolArrayMap2[1] = "-8.0/x^9.0-5.0/x^6.0-4.0/x^5.0+1.0/x^2.0";
        EqnSolArrayMap3[1]="1.0/x^8.0+1.0/x^5.0+1.0/x^4.0-1.0/x-25.0";
        EqnSolArrayIntegrAlone[1]="1.0/-7.0/x^7.0+1.0/-4.0/x^4.0+1.0/-3.0/x^3.0-ln(x)-25.0*x";
        EqnSolArrayMap4[1]="-1.0/7.0/x^7.0-1.0/4.0/x^4.0-1.0/3.0/x^3.0-ln(x)-25.0*x";
        EqnSolOrder[1] = 1;

        EqnSolArrayMap1[2] = "-8.0/x^9.0-5.0/x^6.0-4.0/x^5.0+1.0/x^2.0";
        EqnSolArrayDiffAlone[2] = "-8.0*-9.0/x^10.0-5.0*-6.0/x^7.0-4.0*-5.0/x^6.0-2.0/x^3.0";
        EqnSolArrayMap2[2] = "72.0/x^10.0+30.0/x^7.0+20.0/x^6.0-2.0/x^3.0";
        EqnSolArrayMap3[2]="";
        EqnSolArrayIntegrAlone[2]="";
        EqnSolArrayMap4[2]="";
        EqnSolOrder[2] = 2;

        EqnSolArrayMap1[3] = "72.0/x^10.0+30.0/x^7.0+20.0/x^6.0-2.0/x^3.0";
        EqnSolArrayDiffAlone[3] = "72.0*-10.0/x^11.0+30.0*-7.0/x^8.0+20.0*-6.0/x^7.0-2.0*-3.0/x^4.0";
        EqnSolArrayMap2[3] = "-720.0/x^11.0-210.0/x^8.0-120.0/x^7.0+6.0/x^4.0";
        EqnSolArrayMap3[3]="";
        EqnSolArrayIntegrAlone[3]="";
        EqnSolArrayMap4[3]="";
        EqnSolOrder[3] = 3;

        EqnSolArrayMap1[4] = "-720.0/x^11.0-210.0/x^8.0-120.0/x^7.0+6.0/x^4.0";
        EqnSolArrayDiffAlone[4] = "-720.0*-11.0/x^12.0-210.0*-8.0/x^9.0-120.0*-7.0/x^8.0+6.0*-4.0/x^5.0";
        EqnSolArrayMap2[4] = "7920.0/x^12.0+1680.0/x^9.0+840.0/x^8.0-24.0/x^5.0";
        EqnSolArrayMap3[4]="";
        EqnSolArrayIntegrAlone[4]="";
        EqnSolArrayMap4[4]="";
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
        public static void TestCaseDiff2064() {
        //Test Case 2011
        TestCase = 2064;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";
        EqnUnderTest = "1.0/25.0/25.0/x^8 + 1.0/25/25/x^5 + 1.0/25/25/x^4 - 1.0/25/25/x - 25/25/25";
        TestCaseName = "Simple: Coefficients:25/25";
        TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        DiffWithRespTo = "x";
        MaxDiffOrder = 14;
        MaxIntegreOrder = 2;
        
        EqnSolArrayMap1[1]       = "1.0/625.0/x^8.0+1.0/625.0/x^5.0+1.0/625.0/x^4.0-1.0/625.0/x-1.0/25.0";
        EqnSolArrayDiffAlone[1]  = "1.0/625.0*-8.0/x^9.0+1.0/625.0*-5.0/x^6.0+1.0/625.0*-4.0/x^5.0+1.0/625.0/x^2.0-1.0/25.0*0.0";
        EqnSolArrayMap2[1]       = "-1.0/78.125/x^9.0-1.0/125.0/x^6.0-1.0/156.25/x^5.0+1.0/625.0/x^2.0";
        EqnSolArrayMap3[1]       ="1.0/625.0/x^8.0+1.0/625.0/x^5.0+1.0/625.0/x^4.0-1.0/625.0/x-1.0/25.0";
        EqnSolArrayIntegrAlone[1]="1.0/625.0/-7.0/x^7.0+1.0/625.0/-4.0/x^4.0+1.0/625.0/-3.0/x^3.0-1.0/625.0*ln(x)-1.0/25.0*x";
        EqnSolArrayMap4[1]       ="-1.0/4375.0/x^7.0-1.0/2500.0/x^4.0-1.0/1875.0/x^3.0-1.0/625.0*ln(x)-1.0/25.0*x";
        EqnSolOrder[1] = 1;

        EqnSolArrayMap1[2] = "-1.0/78.125/x^9.0-1.0/125.0/x^6.0-1.0/156.25/x^5.0+1.0/625.0/x^2.0";
        EqnSolArrayDiffAlone[2] = "-1.0/78.125*-9.0/x^10.0-1.0/125.0*-6.0/x^7.0-1.0/156.25*-5.0/x^6.0+1.0/625.0*-2.0/x^3.0";
        EqnSolArrayMap2[2] = "1.0/8.680555555555555/x^10.0+1.0/20.833333333333332/x^7.0+1.0/31.25/x^6.0-1.0/312.5/x^3.0";
        EqnSolArrayMap3[2]="";
        EqnSolArrayIntegrAlone[2]="";
        EqnSolArrayMap4[2]="";
        EqnSolOrder[2] = 2;

        EqnSolArrayMap1[3] = "1.0/8.680555555555555/x^10.0+1.0/20.833333333333332/x^7.0+1.0/31.25/x^6.0-1.0/312.5/x^3.0";
        EqnSolArrayDiffAlone[3] = "1.0/8.680555555555555*-10.0/x^11.0+1.0/20.833333333333332*-7.0/x^8.0+1.0/31.25*-6.0/x^7.0-1.0/312.5*-3.0/x^4.0";
        EqnSolArrayMap2[3] = "-1.1520000000000001/x^11.0-1.0/2.976190476190476/x^8.0-1.0/5.208333333333333/x^7.0+1.0/104.16666666666667/x^4.0";
        EqnSolArrayMap3[3]="";
        EqnSolArrayIntegrAlone[3]="";
        EqnSolArrayMap4[3]="";
        EqnSolOrder[3] = 3;

        EqnSolArrayMap1[4] = "-1.1520000000000001/x^11.0-1.0/2.976190476190476/x^8.0-1.0/5.208333333333333/x^7.0+1.0/104.16666666666667/x^4.0";
        EqnSolArrayDiffAlone[4] = "-1.1520000000000001*-11.0/x^12.0-1.0/2.976190476190476*-8.0/x^9.0-1.0/5.208333333333333*-7.0/x^8.0+1.0/104.16666666666667*-4.0/x^5.0";
        EqnSolArrayMap2[4] = "12.672/x^12.0+2.688/x^9.0+1.344/x^8.0-1.0/26.041666666666668/x^5.0";
        EqnSolArrayMap3[4]="";
        EqnSolArrayIntegrAlone[4]="";
        EqnSolArrayMap4[4]="";
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
        public static void TestCaseDiff2065() {
        //Test Case 2012
        TestCase = 2065;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";
        EqnUnderTest = "1.0*-25.0/25/x^8 + 1.0*-25/25/x^5 + 1.0*-25/25/x^4 - 1.0*-25/25/x - 25*-25/25";
        TestCaseName = "Simple: Coefficients:-25/25";
        TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        DiffWithRespTo = "x";
        MaxDiffOrder = 14;
        MaxIntegreOrder = 2;
        
        EqnSolArrayMap1[1] = "-1.0/x^8.0-1.0/x^5.0-1.0/x^4.0+1.0/x+25.0";
        EqnSolArrayDiffAlone[1] = "8.0/x^9.0+5.0/x^6.0+4.0/x^5.0-1.0/x^2.0+25.0*0.0";
        EqnSolArrayMap2[1] = "8.0/x^9.0+5.0/x^6.0+4.0/x^5.0-1.0/x^2.0";
        EqnSolArrayMap3[1]="-1.0/x^8.0-1.0/x^5.0-1.0/x^4.0+1.0/x+25.0";
        EqnSolArrayIntegrAlone[1]="-1.0/-7.0/x^7.0-1.0/-4.0/x^4.0-1.0/-3.0/x^3.0+ln(x)+25.0*x";
        EqnSolArrayMap4[1]="1.0/7.0/x^7.0+1.0/4.0/x^4.0+1.0/3.0/x^3.0+ln(x)+25.0*x";
        EqnSolOrder[1] = 1;

        EqnSolArrayMap1[2] = "8.0/x^9.0+5.0/x^6.0+4.0/x^5.0-1.0/x^2.0";
        EqnSolArrayDiffAlone[2] = "8.0*-9.0/x^10.0+5.0*-6.0/x^7.0+4.0*-5.0/x^6.0+2.0/x^3.0";
        EqnSolArrayMap2[2] = "-72.0/x^10.0-30.0/x^7.0-20.0/x^6.0+2.0/x^3.0";
        EqnSolArrayMap3[2]="";
        EqnSolArrayIntegrAlone[2]="";
        EqnSolArrayMap4[2]="";
        EqnSolOrder[2] = 2;

        EqnSolArrayMap1[3] = "-72.0/x^10.0-30.0/x^7.0-20.0/x^6.0+2.0/x^3.0";
        EqnSolArrayDiffAlone[3] = "-72.0*-10.0/x^11.0-30.0*-7.0/x^8.0-20.0*-6.0/x^7.0+2.0*-3.0/x^4.0";
        EqnSolArrayMap2[3] = "720.0/x^11.0+210.0/x^8.0+120.0/x^7.0-6.0/x^4.0";
        EqnSolArrayMap3[3]="";
        EqnSolArrayIntegrAlone[3]="";
        EqnSolArrayMap4[3]="";
        EqnSolOrder[3] = 3;

        EqnSolArrayMap1[4] = "720.0/x^11.0+210.0/x^8.0+120.0/x^7.0-6.0/x^4.0";
        EqnSolArrayDiffAlone[4] = "720.0*-11.0/x^12.0+210.0*-8.0/x^9.0+120.0*-7.0/x^8.0-6.0*-4.0/x^5.0";
        EqnSolArrayMap2[4] = "-7920.0/x^12.0-1680.0/x^9.0-840.0/x^8.0+24.0/x^5.0";
        EqnSolArrayMap3[4]="";
        EqnSolArrayIntegrAlone[4]="";
        EqnSolArrayMap4[4]="";
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
    public static void TestCaseDiff2067() {
        //Test Case 2013
        TestCase = 2067;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";
        EqnUnderTest = "1.0/-25/25.0/x^8 + 1.0/-25/25/x^5 + 1.0/-25/25/x^4 - 1.0/-25/25/x - 25/-2525";
        TestCaseName = "Simple: Coefficients:-25/25";
        TestCaseMatrixID="Coefficients:0:2 Letter:/ Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        DiffWithRespTo = "x";
        MaxDiffOrder = 14;
        MaxIntegreOrder = 2;
        
        EqnSolArrayMap1[1] = "-1.0/625.0/x^8.0-1.0/625.0/x^5.0-1.0/625.0/x^4.0+1.0/625.0/x+1.0/101.0";
        EqnSolArrayDiffAlone[1] = "-1.0/625.0*-8.0/x^9.0-1.0/625.0*-5.0/x^6.0-1.0/625.0*-4.0/x^5.0-1.0/625.0/x^2.0+1.0/101.0*0.0";
        EqnSolArrayMap2[1] = "1.0/78.125/x^9.0+1.0/125.0/x^6.0+1.0/156.25/x^5.0-1.0/625.0/x^2.0";
        EqnSolArrayMap3[1]="-1.0/625.0/x^8.0-1.0/625.0/x^5.0-1.0/625.0/x^4.0+1.0/625.0/x+1.0/101.0";
        EqnSolArrayIntegrAlone[1]="-1.0/625.0/-7.0/x^7.0-1.0/625.0/-4.0/x^4.0-1.0/625.0/-3.0/x^3.0+1.0/625.0*ln(x)+1.0/101.0*x";
        EqnSolArrayMap4[1]="1.0/4375.0/x^7.0+1.0/2500.0/x^4.0+1.0/1875.0/x^3.0+1.0/625.0*ln(x)+1.0/101.0*x";
        EqnSolOrder[1] = 1;

        EqnSolArrayMap1[2] = "1.0/78.125/x^9.0+1.0/125.0/x^6.0+1.0/156.25/x^5.0-1.0/625.0/x^2.0";
        EqnSolArrayDiffAlone[2] = "1.0/78.125*-9.0/x^10.0+1.0/125.0*-6.0/x^7.0+1.0/156.25*-5.0/x^6.0-1.0/625.0*-2.0/x^3.0";
        EqnSolArrayMap2[2] = "-1.0/8.680555555555555/x^10.0-1.0/20.833333333333332/x^7.0-1.0/31.25/x^6.0+1.0/312.5/x^3.0";
        EqnSolArrayMap3[2]="";
        EqnSolArrayIntegrAlone[2]="";
        EqnSolArrayMap4[2]="";
        EqnSolOrder[2] = 2;

        EqnSolArrayMap1[3] = "-1.0/8.680555555555555/x^10.0-1.0/20.833333333333332/x^7.0-1.0/31.25/x^6.0+1.0/312.5/x^3.0";
        EqnSolArrayDiffAlone[3] = "-1.0/8.680555555555555*-10.0/x^11.0-1.0/20.833333333333332*-7.0/x^8.0-1.0/31.25*-6.0/x^7.0+1.0/312.5*-3.0/x^4.0";
        EqnSolArrayMap2[3] = "1.1520000000000001/x^11.0+1.0/2.976190476190476/x^8.0+1.0/5.208333333333333/x^7.0-1.0/104.16666666666667/x^4.0";
        EqnSolArrayMap3[3]="";
        EqnSolArrayIntegrAlone[3]="";
        EqnSolArrayMap4[3]="";
        EqnSolOrder[3] = 3;

        EqnSolArrayMap1[4] = "1.1520000000000001/x^11.0+1.0/2.976190476190476/x^8.0+1.0/5.208333333333333/x^7.0-1.0/104.16666666666667/x^4.0";
        EqnSolArrayDiffAlone[4] = "1.1520000000000001*-11.0/x^12.0+1.0/2.976190476190476*-8.0/x^9.0+1.0/5.208333333333333*-7.0/x^8.0-1.0/104.16666666666667*-4.0/x^5.0";
        EqnSolArrayMap2[4] = "-12.672/x^12.0-2.688/x^9.0-1.344/x^8.0+1.0/26.041666666666668/x^5.0";
        EqnSolArrayMap3[4]="";
        EqnSolArrayIntegrAlone[4]="";
        EqnSolArrayMap4[4]="";
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
    public static void TestCaseDiff2066() {
        //Test Case 2014
        TestCase = 2066;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";        
        EqnUnderTest = "10.0*+10*+xyc1^8/xyc1^2.0 + 10.0*+10*+xyc1^5/xyc1^2 + 1.0*+10*+xyc1^4/xyc1^2 + 1.0*+10*+xyc1/xyc1^2 + 1.0*+5*25";
        TestCaseName = "Complex: Coefficients:+10";
        TestCaseMatrixID="Coefficients:+5:3 Letter with Numerics:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        DiffWithRespTo = "xyc1";
        MaxDiffOrder = 14;
        MaxIntegreOrder = 2;
        
        EqnSolArrayMap1[1] = "100.0*xyc1^6.0+100.0*xyc1^3.0+10.0*xyc1^2.0+10.0/xyc1+125.0";
        EqnSolArrayDiffAlone[1] = "100.0*6.0*xyc1^5.0+100.0*3.0*xyc1^2.0+10.0*2.0*xyc1^1.0-10.0/xyc1^2.0+125.0*0.0";
        EqnSolArrayMap2[1] = "600.0*xyc1^5.0+300.0*xyc1^2.0+20.0*xyc1-10.0/xyc1^2.0";
        EqnSolArrayMap3[1]="100.0*xyc1^6.0+100.0*xyc1^3.0+10.0*xyc1^2.0+10.0/xyc1+125.0";
        EqnSolArrayIntegrAlone[1]="100.0/7.0*xyc1^7.0+100.0/4.0*xyc1^4.0+10.0/3.0*xyc1^3.0+10.0*ln(xyc1)+125.0*xyc1";
        EqnSolArrayMap4[1]="14.285714285714286*xyc1^7.0+25.0*xyc1^4.0+3.3333333333333335*xyc1^3.0+10.0*ln(xyc1)+125.0*xyc1";
        EqnSolOrder[1] = 1;

        EqnSolArrayMap1[2] = "600.0*xyc1^5.0+300.0*xyc1^2.0+20.0*xyc1-10.0/xyc1^2.0";
        EqnSolArrayDiffAlone[2] = "600.0*5.0*xyc1^4.0+300.0*2.0*xyc1^1.0+20.0-10.0*-2.0/xyc1^3.0";
        EqnSolArrayMap2[2] = "3000.0*xyc1^4.0+600.0*xyc1+20.0+20.0/xyc1^3.0";
        EqnSolArrayMap3[2]="";
        EqnSolArrayIntegrAlone[2]="";
        EqnSolArrayMap4[2]="";
        EqnSolOrder[2] = 2;

        EqnSolArrayMap1[3] = "3000.0*xyc1^4.0+600.0*xyc1+20.0+20.0/xyc1^3.0";
        EqnSolArrayDiffAlone[3] = "3000.0*4.0*xyc1^3.0+600.0+20.0*0.0+20.0*-3.0/xyc1^4.0";
        EqnSolArrayMap2[3] = "12000.0*xyc1^3.0+600.0-60.0/xyc1^4.0";
        EqnSolArrayMap3[3]="";
        EqnSolArrayIntegrAlone[3]="";
        EqnSolArrayMap4[3]="";
        EqnSolOrder[3] = 3;

        EqnSolArrayMap1[4] = "12000.0*xyc1^3.0+600.0-60.0/xyc1^4.0";
        EqnSolArrayDiffAlone[4] = "12000.0*3.0*xyc1^2.0+600.0*0.0-60.0*-4.0/xyc1^5.0";
        EqnSolArrayMap2[4] = "36000.0*xyc1^2.0+240.0/xyc1^5.0";
        EqnSolArrayMap3[4]="";
        EqnSolArrayIntegrAlone[4]="";
        EqnSolArrayMap4[4]="";
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
        /* ***************Exponent Inversion  Test Case***************** */
    /* **************************************** */
    /* ***************Coefficients***************** */
    /* **************************************** */
        
        public static void TestCaseDiff2068() {
        //Test Case 20001
        UsageCalculus.TestCase = 2068;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*0.0*x^8.0 + 0.0*x^5 + 0.0*x^4 - 0.0*x- 25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:0.0";
        UsageCalculus.TestCaseMatrixID="Coefficients:0.0:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "0.0*x^8.0+0.0*x^5.0+0.0*x^4.0-0.0*x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+0.0+0.0-0.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "";
        UsageCalculus.EqnSolArrayMap3[1]="0.0*x^8.0+0.0*x^5.0+0.0*x^4.0-0.0*x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="0.0/9.0*x^9.0+0.0/6.0*x^6.0+0.0/5.0*x^5.0-0.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="0.0*x^9.0+0.0*x^6.0+0.0*x^5.0-0.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="0.0*x^9.0+0.0*x^6.0+0.0*x^5.0-0.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="0.0/10.0*x^10.0+0.0/7.0*x^7.0+0.0/6.0*x^6.0-0.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="0.0*x^10.0+0.0*x^7.0+0.0*x^6.0-0.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="0.0*x^10.0+0.0*x^7.0+0.0*x^6.0-0.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="0.0/11.0*x^11.0+0.0/8.0*x^8.0+0.0/7.0*x^7.0-0.0/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="0.0*x^11.0+0.0*x^8.0+0.0*x^7.0-0.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4]="0.0*x^11.0+0.0*x^8.0+0.0*x^7.0-0.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="0.0/12.0*x^12.0+0.0/9.0*x^9.0+0.0/8.0*x^8.0-0.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="0.0*x^12.0+0.0*x^9.0+0.0*x^8.0-0.0*x^5.0-1.0416666666666667*x^4.0";
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
        public static void TestCaseDiff2069() {
        //Test Case 20002
        UsageCalculus.TestCase = 2069;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "0*xy^8 + 0*xy^5.0 + 0*xy^4 - 0*xy - 25*0";
        UsageCalculus.TestCaseName = "Simple: Coefficients:0";
        UsageCalculus.TestCaseMatrixID="Coefficients:0:2 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xy";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "0.0*xy^8.0+0.0*xy^5.0+0.0*xy^4.0-0.0*xy";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "0.0+0.0+0.0-0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "";
        UsageCalculus.EqnSolArrayMap3[1]="0.0*xy^8.0+0.0*xy^5.0+0.0*xy^4.0-0.0*xy";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="0.0/9.0*xy^9.0+0.0/6.0*xy^6.0+0.0/5.0*xy^5.0-0.0/2.0*xy^2.0";
        UsageCalculus.EqnSolArrayMap4[1]="0.0*xy^9.0+0.0*xy^6.0+0.0*xy^5.0-0.0*xy^2.0";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "";
        UsageCalculus.EqnSolArrayMap2[2] = "";
        UsageCalculus.EqnSolArrayMap3[2]="0.0*xy^9.0+0.0*xy^6.0+0.0*xy^5.0-0.0*xy^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="0.0/10.0*xy^10.0+0.0/7.0*xy^7.0+0.0/6.0*xy^6.0-0.0/3.0*xy^3.0";
        UsageCalculus.EqnSolArrayMap4[2]="0.0*xy^10.0+0.0*xy^7.0+0.0*xy^6.0-0.0*xy^3.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "";
        UsageCalculus.EqnSolArrayMap2[3] = "";
        UsageCalculus.EqnSolArrayMap3[3]="0.0*xy^10.0+0.0*xy^7.0+0.0*xy^6.0-0.0*xy^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="0.0/11.0*xy^11.0+0.0/8.0*xy^8.0+0.0/7.0*xy^7.0-0.0/4.0*xy^4.0";
        UsageCalculus.EqnSolArrayMap4[3]="0.0*xy^11.0+0.0*xy^8.0+0.0*xy^7.0-0.0*xy^4.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "";
        UsageCalculus.EqnSolArrayMap2[4] = "";
        UsageCalculus.EqnSolArrayMap3[4]="0.0*xy^11.0+0.0*xy^8.0+0.0*xy^7.0-0.0*xy^4.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="0.0/12.0*xy^12.0+0.0/9.0*xy^9.0+0.0/8.0*xy^8.0-0.0/5.0*xy^5.0";
        UsageCalculus.EqnSolArrayMap4[4]="0.0*xy^12.0+0.0*xy^9.0+0.0*xy^8.0-0.0*xy^5.0";
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
        public static void TestCaseDiff2070() {
        //Test Case 20003
        UsageCalculus.TestCase = 2070;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1*xyc^8 + 1*xyc^5 + 1.0*xyc^4 - 1*xyc - 1*25";
        UsageCalculus.TestCaseName = "Simple: Variables:3 Letter";
        UsageCalculus.TestCaseMatrixID="Coefficients:1:3 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "xyc^8.0+xyc^5.0+xyc^4.0-xyc-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*xyc^7.0+5.0*xyc^4.0+4.0*xyc^3.0-1.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*xyc^7.0+5.0*xyc^4.0+4.0*xyc^3.0-1.0";
        UsageCalculus.EqnSolArrayMap3[1]="xyc^8.0+xyc^5.0+xyc^4.0-xyc-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/9.0*xyc^9.0+1.0/6.0*xyc^6.0+1.0/5.0*xyc^5.0-1.0/2.0*xyc^2.0-25.0*xyc";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/9.0*xyc^9.0+1.0/6.0*xyc^6.0+1.0/5.0*xyc^5.0-1.0/2.0*xyc^2.0-25.0*xyc";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*xyc^7.0+5.0*xyc^4.0+4.0*xyc^3.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*7.0*xyc^6.0+5.0*4.0*xyc^3.0+4.0*3.0*xyc^2.0-1.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*xyc^6.0+20.0*xyc^3.0+12.0*xyc^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/9.0*xyc^9.0+1.0/6.0*xyc^6.0+1.0/5.0*xyc^5.0-1.0/2.0*xyc^2.0-25.0*xyc";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/9.0/10.0*xyc^10.0+1.0/6.0/7.0*xyc^7.0+1.0/5.0/6.0*xyc^6.0-1.0/2.0/3.0*xyc^3.0-25.0/2.0*xyc^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/90.0*xyc^10.0+1.0/42.0*xyc^7.0+1.0/30.0*xyc^6.0-1.0/6.0*xyc^3.0-12.5*xyc^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*xyc^6.0+20.0*xyc^3.0+12.0*xyc^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*xyc^5.0+20.0*3.0*xyc^2.0+12.0*2.0*xyc^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*xyc^5.0+60.0*xyc^2.0+24.0*xyc";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/90.0*xyc^10.0+1.0/42.0*xyc^7.0+1.0/30.0*xyc^6.0-1.0/6.0*xyc^3.0-12.5*xyc^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/90.0/11.0*xyc^11.0+1.0/42.0/8.0*xyc^8.0+1.0/30.0/7.0*xyc^7.0-1.0/6.0/4.0*xyc^4.0-12.5/3.0*xyc^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/990.0*xyc^11.0+1.0/336.0*xyc^8.0+1.0/210.0*xyc^7.0-1.0/24.0*xyc^4.0-4.166666666666667*xyc^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*xyc^5.0+60.0*xyc^2.0+24.0*xyc";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*xyc^4.0+60.0*2.0*xyc^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*xyc^4.0+120.0*xyc+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/990.0*xyc^11.0+1.0/336.0*xyc^8.0+1.0/210.0*xyc^7.0-1.0/24.0*xyc^4.0-4.166666666666667*xyc^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/990.0/12.0*xyc^12.0+1.0/336.0/9.0*xyc^9.0+1.0/210.0/8.0*xyc^8.0-1.0/24.0/5.0*xyc^5.0-4.166666666666667/4.0*xyc^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/11880.0*xyc^12.0+1.0/3024.0*xyc^9.0+1.0/1680.0*xyc^8.0-1.0/120.0*xyc^5.0-1.0416666666666667*xyc^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;
        
        UsageCalculus.EqnSolArrayMap1[5] = "1680.0*xyc^4.0+120.0*xyc+24.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "1680.0*4.0*xyc^3.0+120.0+0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "6720.0*xyc^3.0+120.0";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "6720.0*xyc^3.0+120.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "6720.0*3.0*xyc^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "20160.0*xyc^2.0+";
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
        public static void TestCaseDiff2071() {
        //Test Case 20004
        UsageCalculus.TestCase = 2071;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "1.0*xyc1^8 + 1.0*xyc1^5 + 1.0*xyc1^4.0 - 1.0*xyc1 - 1.0*25";
        UsageCalculus.TestCaseName = "Simple: Variables:3 Letter with Numerics";
        UsageCalculus.TestCaseMatrixID="Coefficients:1.0:3 Letter with Numerics:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "xyc1^8.0+xyc1^5.0+xyc1^4.0-xyc1-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "8.0*xyc1^7.0+5.0*xyc1^4.0+4.0*xyc1^3.0-1.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "8.0*xyc1^7.0+5.0*xyc1^4.0+4.0*xyc1^3.0-1.0";
        UsageCalculus.EqnSolArrayMap3[1]="xyc1^8.0+xyc1^5.0+xyc1^4.0-xyc1-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="1.0/9.0*xyc1^9.0+1.0/6.0*xyc1^6.0+1.0/5.0*xyc1^5.0-1.0/2.0*xyc1^2.0-25.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/9.0*xyc1^9.0+1.0/6.0*xyc1^6.0+1.0/5.0*xyc1^5.0-1.0/2.0*xyc1^2.0-25.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "8.0*xyc1^7.0+5.0*xyc1^4.0+4.0*xyc1^3.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "8.0*7.0*xyc1^6.0+5.0*4.0*xyc1^3.0+4.0*3.0*xyc1^2.0-1.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "56.0*xyc1^6.0+20.0*xyc1^3.0+12.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/9.0*xyc1^9.0+1.0/6.0*xyc1^6.0+1.0/5.0*xyc1^5.0-1.0/2.0*xyc1^2.0-25.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/9.0/10.0*xyc1^10.0+1.0/6.0/7.0*xyc1^7.0+1.0/5.0/6.0*xyc1^6.0-1.0/2.0/3.0*xyc1^3.0-25.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/90.0*xyc1^10.0+1.0/42.0*xyc1^7.0+1.0/30.0*xyc1^6.0-1.0/6.0*xyc1^3.0-12.5*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "56.0*xyc1^6.0+20.0*xyc1^3.0+12.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "56.0*6.0*xyc1^5.0+20.0*3.0*xyc1^2.0+12.0*2.0*xyc1^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "336.0*xyc1^5.0+60.0*xyc1^2.0+24.0*xyc1";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/90.0*xyc1^10.0+1.0/42.0*xyc1^7.0+1.0/30.0*xyc1^6.0-1.0/6.0*xyc1^3.0-12.5*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/90.0/11.0*xyc1^11.0+1.0/42.0/8.0*xyc1^8.0+1.0/30.0/7.0*xyc1^7.0-1.0/6.0/4.0*xyc1^4.0-12.5/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/990.0*xyc1^11.0+1.0/336.0*xyc1^8.0+1.0/210.0*xyc1^7.0-1.0/24.0*xyc1^4.0-4.166666666666667*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "336.0*xyc1^5.0+60.0*xyc1^2.0+24.0*xyc1";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "336.0*5.0*xyc1^4.0+60.0*2.0*xyc1^1.0+24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "1680.0*xyc1^4.0+120.0*xyc1+24.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/990.0*xyc1^11.0+1.0/336.0*xyc1^8.0+1.0/210.0*xyc1^7.0-1.0/24.0*xyc1^4.0-4.166666666666667*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/990.0/12.0*xyc1^12.0+1.0/336.0/9.0*xyc1^9.0+1.0/210.0/8.0*xyc1^8.0-1.0/24.0/5.0*xyc1^5.0-4.166666666666667/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/11880.0*xyc1^12.0+1.0/3024.0*xyc1^9.0+1.0/1680.0*xyc1^8.0-1.0/120.0*xyc1^5.0-1.0416666666666667*xyc1^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;
        
        UsageCalculus.EqnSolArrayMap1[5] = "1680.0*xyc1^4.0+120.0*xyc1+24.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "1680.0*4.0*xyc1^3.0+120.0+0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "6720.0*xyc1^3.0+120.0+";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "6720.0*xyc1^3.0+120.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "6720.0*3.0*xyc1^2.0+0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "20160.0*xyc1^2.0+";
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
    public static void TestCaseDiff2072() {
        //Test Case 20005
        UsageCalculus.TestCase = 2072;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "-1.0*x^8 -1*x^5 -1.0*x^4 -1.0*x- 25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:-1.0";
        UsageCalculus.TestCaseMatrixID="Coefficients:-1.0:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-x^8.0-x^5.0-x^4.0-x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-8.0*x^7.0-5.0*x^4.0-4.0*x^3.0-1.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-8.0*x^7.0-5.0*x^4.0-4.0*x^3.0-1.0";
        UsageCalculus.EqnSolArrayMap3[1]="-x^8.0-x^5.0-x^4.0-x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-1.0/9.0*x^9.0-1.0/6.0*x^6.0-1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="-1.0/9.0*x^9.0-1.0/6.0*x^6.0-1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-8.0*x^7.0-5.0*x^4.0-4.0*x^3.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-8.0*7.0*x^6.0-5.0*4.0*x^3.0-4.0*3.0*x^2.0-1.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-56.0*x^6.0-20.0*x^3.0-12.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="-1.0/9.0*x^9.0-1.0/6.0*x^6.0-1.0/5.0*x^5.0-1.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-1.0/9.0/10.0*x^10.0-1.0/6.0/7.0*x^7.0-1.0/5.0/6.0*x^6.0-1.0/2.0/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="-1.0/90.0*x^10.0-1.0/42.0*x^7.0-1.0/30.0*x^6.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-56.0*x^6.0-20.0*x^3.0-12.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-56.0*6.0*x^5.0-20.0*3.0*x^2.0-12.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-336.0*x^5.0-60.0*x^2.0-24.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="-1.0/90.0*x^10.0-1.0/42.0*x^7.0-1.0/30.0*x^6.0-1.0/6.0*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="-1.0/90.0/11.0*x^11.0-1.0/42.0/8.0*x^8.0-1.0/30.0/7.0*x^7.0-1.0/6.0/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-1.0/990.0*x^11.0-1.0/336.0*x^8.0-1.0/210.0*x^7.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-336.0*x^5.0-60.0*x^2.0-24.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-336.0*5.0*x^4.0-60.0*2.0*x^1.0-24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-1680.0*x^4.0-120.0*x-24.0";
        UsageCalculus.EqnSolArrayMap3[4]="-1.0/990.0*x^11.0-1.0/336.0*x^8.0-1.0/210.0*x^7.0-1.0/24.0*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="-1.0/990.0/12.0*x^12.0-1.0/336.0/9.0*x^9.0-1.0/210.0/8.0*x^8.0-1.0/24.0/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="-1.0/11880.0*x^12.0-1.0/3024.0*x^9.0-1.0/1680.0*x^8.0-1.0/120.0*x^5.0-1.0416666666666667*x^4.0";
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
        public static void TestCaseDiff2073() {
        //Test Case 20006
        UsageCalculus.TestCase = 2073;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "-1*xy^8 -1.0*xy^5 -1*xy^4 -1*xy - 25.0*-1";
        UsageCalculus.TestCaseName = "Simple: Coefficients:-1";
        UsageCalculus.TestCaseMatrixID="Coefficients:-1:2 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xy";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-xy^8.0-xy^5.0-xy^4.0-xy+25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-8.0*xy^7.0-5.0*xy^4.0-4.0*xy^3.0-1.0+25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-8.0*xy^7.0-5.0*xy^4.0-4.0*xy^3.0-1.0";
        UsageCalculus.EqnSolArrayMap3[1]="-xy^8.0-xy^5.0-xy^4.0-xy+25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-1.0/9.0*xy^9.0-1.0/6.0*xy^6.0-1.0/5.0*xy^5.0-1.0/2.0*xy^2.0+25.0*xy";
        UsageCalculus.EqnSolArrayMap4[1]="-1.0/9.0*xy^9.0-1.0/6.0*xy^6.0-1.0/5.0*xy^5.0-1.0/2.0*xy^2.0+25.0*xy";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-8.0*xy^7.0-5.0*xy^4.0-4.0*xy^3.0-1.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-8.0*7.0*xy^6.0-5.0*4.0*xy^3.0-4.0*3.0*xy^2.0-1.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-56.0*xy^6.0-20.0*xy^3.0-12.0*xy^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="-1.0/9.0*xy^9.0-1.0/6.0*xy^6.0-1.0/5.0*xy^5.0-1.0/2.0*xy^2.0+25.0*xy";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-1.0/9.0/10.0*xy^10.0-1.0/6.0/7.0*xy^7.0-1.0/5.0/6.0*xy^6.0-1.0/2.0/3.0*xy^3.0+25.0/2.0*xy^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="-1.0/90.0*xy^10.0-1.0/42.0*xy^7.0-1.0/30.0*xy^6.0-1.0/6.0*xy^3.0+12.5*xy^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-56.0*xy^6.0-20.0*xy^3.0-12.0*xy^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-56.0*6.0*xy^5.0-20.0*3.0*xy^2.0-12.0*2.0*xy^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-336.0*xy^5.0-60.0*xy^2.0-24.0*xy";
        UsageCalculus.EqnSolArrayMap3[3]="-1.0/90.0*xy^10.0-1.0/42.0*xy^7.0-1.0/30.0*xy^6.0-1.0/6.0*xy^3.0+12.5*xy^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="-1.0/90.0/11.0*xy^11.0-1.0/42.0/8.0*xy^8.0-1.0/30.0/7.0*xy^7.0-1.0/6.0/4.0*xy^4.0+12.5/3.0*xy^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-1.0/990.0*xy^11.0-1.0/336.0*xy^8.0-1.0/210.0*xy^7.0-1.0/24.0*xy^4.0+4.166666666666667*xy^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-336.0*xy^5.0-60.0*xy^2.0-24.0*xy";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-336.0*5.0*xy^4.0-60.0*2.0*xy^1.0-24.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-1680.0*xy^4.0-120.0*xy-24.0";
        UsageCalculus.EqnSolArrayMap3[4]="-1.0/990.0*xy^11.0-1.0/336.0*xy^8.0-1.0/210.0*xy^7.0-1.0/24.0*xy^4.0+4.166666666666667*xy^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="-1.0/990.0/12.0*xy^12.0-1.0/336.0/9.0*xy^9.0-1.0/210.0/8.0*xy^8.0-1.0/24.0/5.0*xy^5.0+4.166666666666667/4.0*xy^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="-1.0/11880.0*xy^12.0-1.0/3024.0*xy^9.0-1.0/1680.0*xy^8.0-1.0/120.0*xy^5.0+1.0416666666666667*xy^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;
        
        UsageCalculus.EqnSolArrayMap1[5] = "-1680.0*xy^4.0-120.0*xy-24.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "-1680.0*4.0*xy^3.0-120.0-0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "-1680.0*4.0*xy^3.0-120.0-0.0";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "-6720.0*xy^3.0-120.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "-6720.0*3.0*xy^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "-6720.0*3.0*xy^2.0-0.0";
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
        public static void TestCaseDiff2074() {
        //Test Case 20007
        UsageCalculus.TestCase = 2074;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "5.0*x^8 + 5*x^5 + 5*x^4 - 5*x- 25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:5";
        UsageCalculus.TestCaseMatrixID="Coefficients:5:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "5.0*x^8.0+5.0*x^5.0+5.0*x^4.0-5.0*x-25.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "5.0*8.0*x^7.0+5.0*5.0*x^4.0+5.0*4.0*x^3.0-5.0-25.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "40.0*x^7.0+25.0*x^4.0+20.0*x^3.0-5.0";
        UsageCalculus.EqnSolArrayMap3[1]="5.0*x^8.0+5.0*x^5.0+5.0*x^4.0-5.0*x-25.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="5.0/9.0*x^9.0+5.0/6.0*x^6.0+5.0/5.0*x^5.0-5.0/2.0*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1.8*x^9.0+1.0/1.2*x^6.0+x^5.0-2.5*x^2.0-25.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "40.0*x^7.0+25.0*x^4.0+20.0*x^3.0-5.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "40.0*7.0*x^6.0+25.0*4.0*x^3.0+20.0*3.0*x^2.0-5.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "280.0*x^6.0+100.0*x^3.0+60.0*x^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/1.8*x^9.0+0.8333333333333334*x^6.0+x^5.0-2.5*x^2.0-25.0*x";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/1.8/10.0*x^10.0+0.8333333333333334/7.0*x^7.0+1.0/6.0*x^6.0-2.5/3.0*x^3.0-25.0/2.0*x^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/18.0*x^10.0+1.0/8.4*x^7.0+1.0/6.0*x^6.0-1.0/1.2*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "280.0*x^6.0+100.0*x^3.0+60.0*x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "280.0*6.0*x^5.0+100.0*3.0*x^2.0+60.0*2.0*x^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "1680.0*x^5.0+300.0*x^2.0+120.0*x";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/18.0*x^10.0+1.0/8.4*x^7.0+1.0/6.0*x^6.0-1.0/1.2*x^3.0-12.5*x^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/18.0/11.0*x^11.0+1.0/8.4/8.0*x^8.0+1.0/6.0/7.0*x^7.0-1.0/1.2/4.0*x^4.0-12.5/3.0*x^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/198.0*x^11.0+1.0/67.2*x^8.0+1.0/42.0*x^7.0-1.0/4.8*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "1680.0*x^5.0+300.0*x^2.0+120.0*x";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "1680.0*5.0*x^4.0+300.0*2.0*x^1.0+120.0";
        UsageCalculus.EqnSolArrayMap2[4] = "8400.0*x^4.0+600.0*x+120.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/198.0*x^11.0+1.0/67.2*x^8.0+1.0/42.0*x^7.0-1.0/4.8*x^4.0-4.166666666666667*x^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/198.0/12.0*x^12.0+1.0/67.2/9.0*x^9.0+1.0/42.0/8.0*x^8.0-1.0/4.8/5.0*x^5.0-4.166666666666667/4.0*x^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/2376.0*x^12.0+1.0/604.8000000000001*x^9.0+1.0/336.0*x^8.0-1.0/24.0*x^5.0-1.0416666666666667*x^4.0";
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
        public static void TestCaseDiff2075() {
        //Test Case 20008
        UsageCalculus.TestCase = 2075;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "-5.0*xy^8 - 5*xy^5 - 5*xy^4 - 5*xy - 25*-5";
        UsageCalculus.TestCaseName = "Simple: Coefficients:-5";
        UsageCalculus.TestCaseMatrixID="Coefficients:-5:2 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xy";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-5.0*xy^8.0-5.0*xy^5.0-5.0*xy^4.0-5.0*xy+125.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-5.0*8.0*xy^7.0-5.0*5.0*xy^4.0-5.0*4.0*xy^3.0-5.0+125.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-40.0*xy^7.0-25.0*xy^4.0-20.0*xy^3.0-5.0";
        UsageCalculus.EqnSolArrayMap3[1]="-5.0*xy^8.0-5.0*xy^5.0-5.0*xy^4.0-5.0*xy+125.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-5.0/9.0*xy^9.0-5.0/6.0*xy^6.0-5.0/5.0*xy^5.0-5.0/2.0*xy^2.0+125.0*xy";
        UsageCalculus.EqnSolArrayMap4[1]="-1.0/1.8*xy^9.0-1.0/1.2*xy^6.0-xy^5.0-2.5*xy^2.0+125.0*xy";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-40.0*xy^7.0-25.0*xy^4.0-20.0*xy^3.0-5.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-40.0*7.0*xy^6.0-25.0*4.0*xy^3.0-20.0*3.0*xy^2.0-5.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-280.0*xy^6.0-100.0*xy^3.0-60.0*xy^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="-1.0/1.8*xy^9.0-0.8333333333333334*xy^6.0-xy^5.0-2.5*xy^2.0+125.0*xy";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-1.0/1.8/10.0*xy^10.0-0.8333333333333334/7.0*xy^7.0-1.0/6.0*xy^6.0-2.5/3.0*xy^3.0+125.0/2.0*xy^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="-1.0/18.0*xy^10.0-1.0/8.4*xy^7.0-1.0/6.0*xy^6.0-1.0/1.2*xy^3.0+62.5*xy^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-280.0*xy^6.0-100.0*xy^3.0-60.0*xy^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-280.0*6.0*xy^5.0-100.0*3.0*xy^2.0-60.0*2.0*xy^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-1680.0*xy^5.0-300.0*xy^2.0-120.0*xy";
        UsageCalculus.EqnSolArrayMap3[3]="-1.0/18.0*xy^10.0-1.0/8.4*xy^7.0-1.0/6.0*xy^6.0-1.0/1.2*xy^3.0+62.5*xy^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="-1.0/18.0/11.0*xy^11.0-1.0/8.4/8.0*xy^8.0-1.0/6.0/7.0*xy^7.0-1.0/1.2/4.0*xy^4.0+62.5/3.0*xy^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-1.0/198.0*xy^11.0-1.0/67.2*xy^8.0-1.0/42.0*xy^7.0-1.0/4.8*xy^4.0+20.833333333333332*xy^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-1680.0*xy^5.0-300.0*xy^2.0-120.0*xy";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-1680.0*5.0*xy^4.0-300.0*2.0*xy^1.0-120.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-8400.0*xy^4.0-600.0*xy-120.0";
        UsageCalculus.EqnSolArrayMap3[4]="-1.0/198.0*xy^11.0-1.0/67.2*xy^8.0-1.0/42.0*xy^7.0-1.0/4.8*xy^4.0+20.833333333333332*xy^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="-1.0/198.0/12.0*xy^12.0-1.0/67.2/9.0*xy^9.0-1.0/42.0/8.0*xy^8.0-1.0/4.8/5.0*xy^5.0+20.833333333333332/4.0*xy^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="-1.0/2376.0*xy^12.0-1.0/604.8000000000001*xy^9.0-1.0/336.0*xy^8.0-1.0/24.0*xy^5.0+5.208333333333333*xy^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;
        
        UsageCalculus.EqnSolArrayMap1[5] = "-8400.0*xy^4.0-600.0*xy-120.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "-8400.0*4.0*xy^3.0-600.0-0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "-33600.0*xy^3.0-600.0";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "-33600.0*xy^3.0-600.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "-33600.0*3.0*xy^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "-100800.0*xy^2.0-";
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
        public static void TestCaseDiff2076() {
        //Test Case 20009
        UsageCalculus.TestCase = 2076;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "-5.0*xyc1^8 - 5.0*xyc1^5 - 5*xyc1^4 - 5.0*xyc1 - 5.0*25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:-5.0";
        UsageCalculus.TestCaseMatrixID="Coefficients:-5.0:3 Letter with Numerics:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "-5.0*xyc1^8.0-5.0*xyc1^5.0-5.0*xyc1^4.0-5.0*xyc1-125.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "-5.0*8.0*xyc1^7.0-5.0*5.0*xyc1^4.0-5.0*4.0*xyc1^3.0-5.0-125.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-40.0*xyc1^7.0-25.0*xyc1^4.0-20.0*xyc1^3.0-5.0";
        UsageCalculus.EqnSolArrayMap3[1]="-5.0*xyc1^8.0-5.0*xyc1^5.0-5.0*xyc1^4.0-5.0*xyc1-125.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="-5.0/9.0*xyc1^9.0-5.0/6.0*xyc1^6.0-5.0/5.0*xyc1^5.0-5.0/2.0*xyc1^2.0-125.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="-1.0/1.8*xyc1^9.0-1.0/1.2*xyc1^6.0-xyc1^5.0-2.5*xyc1^2.0-125.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-40.0*xyc1^7.0-25.0*xyc1^4.0-20.0*xyc1^3.0-5.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-40.0*7.0*xyc1^6.0-25.0*4.0*xyc1^3.0-20.0*3.0*xyc1^2.0-5.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "-280.0*xyc1^6.0-100.0*xyc1^3.0-60.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="-1.0/1.8*xyc1^9.0-0.8333333333333334*xyc1^6.0-xyc1^5.0-2.5*xyc1^2.0-125.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="-1.0/1.8/10.0*xyc1^10.0-0.8333333333333334/7.0*xyc1^7.0-1.0/6.0*xyc1^6.0-2.5/3.0*xyc1^3.0-125.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="-1.0/18.0*xyc1^10.0-1.0/8.4*xyc1^7.0-1.0/6.0*xyc1^6.0-1.0/1.2*xyc1^3.0-62.5*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "-280.0*xyc1^6.0-100.0*xyc1^3.0-60.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "-280.0*6.0*xyc1^5.0-100.0*3.0*xyc1^2.0-60.0*2.0*xyc1^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-1680.0*xyc1^5.0-300.0*xyc1^2.0-120.0*xyc1";
        UsageCalculus.EqnSolArrayMap3[3]="-1.0/18.0*xyc1^10.0-1.0/8.4*xyc1^7.0-1.0/6.0*xyc1^6.0-1.0/1.2*xyc1^3.0-62.5*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="-1.0/18.0/11.0*xyc1^11.0-1.0/8.4/8.0*xyc1^8.0-1.0/6.0/7.0*xyc1^7.0-1.0/1.2/4.0*xyc1^4.0-62.5/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="-1.0/198.0*xyc1^11.0-1.0/67.2*xyc1^8.0-1.0/42.0*xyc1^7.0-1.0/4.8*xyc1^4.0-20.833333333333332*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-1680.0*xyc1^5.0-300.0*xyc1^2.0-120.0*xyc1";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-1680.0*5.0*xyc1^4.0-300.0*2.0*xyc1^1.0-120.0";
        UsageCalculus.EqnSolArrayMap2[4] = "-8400.0*xyc1^4.0-600.0*xyc1-120.0";
        UsageCalculus.EqnSolArrayMap3[4]="-1.0/198.0*xyc1^11.0-1.0/67.2*xyc1^8.0-1.0/42.0*xyc1^7.0-1.0/4.8*xyc1^4.0-20.833333333333332*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="-1.0/198.0/12.0*xyc1^12.0-1.0/67.2/9.0*xyc1^9.0-1.0/42.0/8.0*xyc1^8.0-1.0/4.8/5.0*xyc1^5.0-20.833333333333332/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="-1.0/2376.0*xyc1^12.0-1.0/604.8000000000001*xyc1^9.0-1.0/336.0*xyc1^8.0-1.0/24.0*xyc1^5.0-5.208333333333333*xyc1^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;
        
        UsageCalculus.EqnSolArrayMap1[5] = "-8400.0*xyc1^4.0-600.0*xyc1-120.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "-8400.0*4.0*xyc1^3.0-600.0-0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "-33600.0*xyc1^3.0-600.0";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "-33600.0*xyc1^3.0-600.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "-33600.0*3.0*xyc1^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "-100800.0*xyc1^2.0";
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
        public static void TestCaseDiff2077() {
        //Test Case 20010
        UsageCalculus.TestCase = 2077;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "1.0*+5*xyc1^8 + 1.0*+5.0*xyc1^5 + 1.0*+5.0*xyc1^4 + 1.0*+5.0*xyc1 + 1.0*+5.0*25";
        UsageCalculus.TestCaseName = "Simple: Coefficients:+5.0";
        UsageCalculus.TestCaseMatrixID="Coefficients:+5.0:3 Letter with Numerics:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 5;
        
        UsageCalculus.EqnSolArrayMap1[1] = "5.0*xyc1^8.0+5.0*xyc1^5.0+5.0*xyc1^4.0+5.0*xyc1+125.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "5.0*8.0*xyc1^7.0+5.0*5.0*xyc1^4.0+5.0*4.0*xyc1^3.0+5.0+125.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "40.0*xyc1^7.0+25.0*xyc1^4.0+20.0*xyc1^3.0+5.0";
        UsageCalculus.EqnSolArrayMap3[1]="5.0*xyc1^8.0+5.0*xyc1^5.0+5.0*xyc1^4.0+5.0*xyc1+125.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="5.0/9.0*xyc1^9.0+5.0/6.0*xyc1^6.0+5.0/5.0*xyc1^5.0+5.0/2.0*xyc1^2.0+125.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="1.0/1.8*xyc1^9.0+1.0/1.2*xyc1^6.0+xyc1^5.0+2.5*xyc1^2.0+125.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "40.0*xyc1^7.0+25.0*xyc1^4.0+20.0*xyc1^3.0+5.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "40.0*7.0*xyc1^6.0+25.0*4.0*xyc1^3.0+20.0*3.0*xyc1^2.0+5.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "280.0*xyc1^6.0+100.0*xyc1^3.0+60.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap3[2]="1.0/1.8*xyc1^9.0+0.8333333333333334*xyc1^6.0+xyc1^5.0+2.5*xyc1^2.0+125.0*xyc1";
        UsageCalculus.EqnSolArrayIntegrAlone[2]="1.0/1.8/10.0*xyc1^10.0+0.8333333333333334/7.0*xyc1^7.0+1.0/6.0*xyc1^6.0+2.5/3.0*xyc1^3.0+125.0/2.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayMap4[2]="1.0/18.0*xyc1^10.0+1.0/8.4*xyc1^7.0+1.0/6.0*xyc1^6.0+1.0/1.2*xyc1^3.0+62.5*xyc1^2.0";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "280.0*xyc1^6.0+100.0*xyc1^3.0+60.0*xyc1^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "280.0*6.0*xyc1^5.0+100.0*3.0*xyc1^2.0+60.0*2.0*xyc1^1.0";
        UsageCalculus.EqnSolArrayMap2[3] = "1680.0*xyc1^5.0+300.0*xyc1^2.0+120.0*xyc1";
        UsageCalculus.EqnSolArrayMap3[3]="1.0/18.0*xyc1^10.0+1.0/8.4*xyc1^7.0+1.0/6.0*xyc1^6.0+1.0/1.2*xyc1^3.0+62.5*xyc1^2.0";
        UsageCalculus.EqnSolArrayIntegrAlone[3]="1.0/18.0/11.0*xyc1^11.0+1.0/8.4/8.0*xyc1^8.0+1.0/6.0/7.0*xyc1^7.0+1.0/1.2/4.0*xyc1^4.0+62.5/3.0*xyc1^3.0";
        UsageCalculus.EqnSolArrayMap4[3]="1.0/198.0*xyc1^11.0+1.0/67.2*xyc1^8.0+1.0/42.0*xyc1^7.0+1.0/4.8*xyc1^4.0+20.833333333333332*xyc1^3.0";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "1680.0*xyc1^5.0+300.0*xyc1^2.0+120.0*xyc1";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "1680.0*5.0*xyc1^4.0+300.0*2.0*xyc1^1.0+120.0";
        UsageCalculus.EqnSolArrayMap2[4] = "8400.0*xyc1^4.0+600.0*xyc1+120.0";
        UsageCalculus.EqnSolArrayMap3[4]="1.0/198.0*xyc1^11.0+1.0/67.2*xyc1^8.0+1.0/42.0*xyc1^7.0+1.0/4.8*xyc1^4.0+20.833333333333332*xyc1^3.0";
        UsageCalculus.EqnSolArrayIntegrAlone[4]="1.0/198.0/12.0*xyc1^12.0+1.0/67.2/9.0*xyc1^9.0+1.0/42.0/8.0*xyc1^8.0+1.0/4.8/5.0*xyc1^5.0+20.833333333333332/4.0*xyc1^4.0";
        UsageCalculus.EqnSolArrayMap4[4]="1.0/2376.0*xyc1^12.0+1.0/604.8000000000001*xyc1^9.0+1.0/336.0*xyc1^8.0+1.0/24.0*xyc1^5.0+5.208333333333333*xyc1^4.0";
        UsageCalculus.EqnSolOrder[4] = 4;
        
        UsageCalculus.EqnSolArrayMap1[5] = "-8400.0*xyc1^4.0-600.0*xyc1-120.0";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "-8400.0*4.0*xyc1^3.0-600.0-0.0";
        UsageCalculus.EqnSolArrayMap2[5] = "-33600.0*xyc1^3.0-600.0";
        UsageCalculus.EqnSolArrayMap3[5]="";
        UsageCalculus.EqnSolArrayIntegrAlone[5]="";
        UsageCalculus.EqnSolArrayMap4[5]="";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "-33600.0*xyc1^3.0-600.0";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "-33600.0*3.0*xyc1^2.0-0.0";
        UsageCalculus.EqnSolArrayMap2[6] = "-100800.0*xyc1^2.0";
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
       public static void TestCaseDiff2078() {
        //Test Case 2043
        UsageCalculus.TestCase = 2078;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "(x)/5.0";
        UsageCalculus.TestCaseName = "Simple: Parenthesis";
        UsageCalculus.TestCaseMatrixID="Parenthesis:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";
        
        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 3;
        UsageCalculus.MaxIntegreOrder = 14;
        
        UsageCalculus.EqnSolArrayMap1[1] = "0.2*(x)";
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
       public static void TestCaseDiff2079() {
        //Test Case 20017
        UsageCalculus.TestCase = 2079;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";        
        UsageCalculus.EqnUnderTest = "2.0/2.0*1.0*+2*xyc1^8*5^xyc1 + 1.0*+2*xyc1^5*5^xyc1 + 1.0*+2*xyc1^4*5^xyc1 + 1.0*+2*xyc1*5^xyc1 + 1.0*+2*25*5";
        UsageCalculus.TestCaseName = "Simple: Coefficients:5^xyc1:";
        UsageCalculus.TestCaseMatrixID="Coefficients:5^xyc1:3 Letter with Numerics:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 2;
        UsageCalculus.MaxIntegreOrder = 2;
        
        UsageCalculus.EqnSolArrayMap1[1] = "2.0*xyc1^8.0*5.0^xyc1+2.0*xyc1^5.0*5.0^xyc1+2.0*xyc1^4.0*5.0^xyc1+2.0*xyc1*5.0^xyc1+250.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "5.0^xyc1*2.0*8.0*xyc1^7.0+ln(5.0)*5.0^xyc1*2.0*xyc1^8.0+5.0^xyc1*2.0*5.0*xyc1^4.0+ln(5.0)*5.0^xyc1*2.0*xyc1^5.0+5.0^xyc1*2.0*4.0*xyc1^3.0+ln(5.0)*5.0^xyc1*2.0*xyc1^4.0+5.0^xyc1*2.0+ln(5.0)*5.0^xyc1*2.0*xyc1+250.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "16.0*xyc1^7.0*5.0^xyc1+ln(5.0)*ln5.0^xyc1*xyc1^8.0+10.0*xyc1^4.0*5.0^xyc1+ln(5.0)*ln5.0^xyc1*xyc1^5.0+8.0*xyc1^3.0*5.0^xyc1+ln(5.0)*ln5.0^xyc1*xyc1^4.0+2.0*5.0^xyc1+ln(5.0)*ln5.0^xyc1*xyc1";
        UsageCalculus.EqnSolArrayMap3[1]="2.0*xyc1^8.0*5.0^xyc1+2.0*xyc1^5.0*5.0^xyc1+2.0*xyc1^4.0*5.0^xyc1+2.0*xyc1*5.0^xyc1+250.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1]="2.0/9.0*xyc1^9.0/ln(5.0)*5.0^xyc1+2.0/6.0*xyc1^6.0/ln(5.0)*5.0^xyc1+2.0/5.0*xyc1^5.0/ln(5.0)*5.0^xyc1+10.0/2.0*xyc1^2.0/ln(5.0)*5.0^xyc1+250.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1]="0.2222222222222222/ln(5.0)*5.0^xyc1*xyc1^9.0+0.3333333333333333/ln(5.0)*5.0^xyc1*xyc1^6.0+0.4/ln(5.0)*5.0^xyc1*xyc1^5.0+5.0/ln(5.0)*5.0^xyc1*xyc1^2.0+250.0*xyc1";
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
       public static void TestCaseDiff2080() {
        //Test Case 4021
        UsageCalculus.TestCase = 2080;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values Except 4th Order Integration";
        UsageCalculus.EqnUnderTest = "p*9.0/xyc1^9.0 + p/6.0/xyc1^6.0 + p*5.0*xyc1^5.0 + p/2.0/xyc1^2.0 + p/25.0/xyc1 + p*50.0";
        UsageCalculus.TestCaseName = "Standard:Independent Constant:Basic Equation:Divide Operator";
        UsageCalculus.TestCaseMatrixID = "Unit TestCase";

        UsageCalculus.DiffWithRespTo = "xyc1";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;

        UsageCalculus.EqnSolArrayMap1[1] = "p*9.0/xyc1^9.0+p/6.0/xyc1^6.0+p*5.0*xyc1^5.0+p/2.0/xyc1^2.0+p/25.0/xyc1+p*50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "p*9.0*-9.0/xyc1^10.0+p/6.0*-6.0/xyc1^7.0+p*5.0*5.0*xyc1^4.0+p/2.0*-2.0/xyc1^3.0-p/25.0/xyc1^2.0+p*50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-p*81.0/xyc1^10.0-p/xyc1^7.0+p*25.0*xyc1^4.0-p/xyc1^3.0-p/25.0/xyc1^2.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[1] = "p*9.0/xyc1^9.0+p/6.0/xyc1^6.0+p*5.0*xyc1^5.0+p/2.0/xyc1^2.0+p/25.0/xyc1+p*50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "p*9.0/-8.0/xyc1^8.0+p/6.0/-5.0/xyc1^5.0+p*5.0/6.0*xyc1^6.0+p/2.0/-1.0/xyc1^1.0+p*25.0*ln(xyc1)+p*50.0*xyc1";
        UsageCalculus.EqnSolArrayMap4[1] = "-p*1.125/xyc1^8.0-p/30.0/xyc1^5.0+p*0.8333333333333334*xyc1^6.0-p/2.0/xyc1+p*25.0*ln(xyc1)+p*50.0*xyc1";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-p*81.0/xyc1^10.0-p/xyc1^7.0+p*25.0*xyc1^4.0-p/xyc1^3.0-p/25.0/xyc1^2.0+p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-p*81.0*-10.0/xyc1^11.0-p*-7.0/xyc1^8.0+p*25.0*4.0*xyc1^3.0-p*-3.0/xyc1^4.0-p/25.0*-2.0/xyc1^3.0+p*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[2] = "p*810.0/xyc1^11.0+p*7.0/xyc1^8.0+p*100.0*xyc1^3.0+p*3.0/xyc1^4.0+p*0.08/xyc1^3.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[2] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "";
        UsageCalculus.EqnSolArrayMap4[2] = "";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "p*810.0/xyc1^11.0+p*7.0/xyc1^8.0+p*100.0*xyc1^3.0+p*3.0/xyc1^4.0+p*0.08/xyc1^3.0+p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "p*810.0*-11.0/xyc1^12.0+p*7.0*-8.0/xyc1^9.0+p*100.0*3.0*xyc1^2.0+p*3.0*-4.0/xyc1^5.0+p*0.08*-3.0/xyc1^4.0+p*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-p*8910.0/xyc1^12.0-p*56.0/xyc1^9.0+p*300.0*xyc1^2.0-p*12.0/xyc1^5.0-p*0.24/xyc1^4.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[3] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "";
        UsageCalculus.EqnSolArrayMap4[3] = "";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-p*8910.0/xyc1^12.0-p*56.0/xyc1^9.0+p*300.0*xyc1^2.0-p*12.0/xyc1^5.0-p*0.24/xyc1^4.0+p*0.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-p*8910.0*-12.0/xyc1^13.0-p*56.0*-9.0/xyc1^10.0+p*300.0*2.0*xyc1^1.0-p*12.0*-5.0/xyc1^6.0-p*0.24*-4.0/xyc1^5.0+p*0.0*0.0";
        UsageCalculus.EqnSolArrayMap2[4] = "p*106920.0/xyc1^13.0+p*504.0/xyc1^10.0+p*600.0*xyc1+p*60.0/xyc1^6.0+p*0.96/xyc1^5.0+p*0.0";
        UsageCalculus.EqnSolArrayMap3[4] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "";
        UsageCalculus.EqnSolArrayMap4[4] = "";
        UsageCalculus.EqnSolOrder[4] = 4;

        UsageCalculus.EqnSolArrayMap1[5] = "";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "";
        UsageCalculus.EqnSolArrayMap2[5] = "";
        UsageCalculus.EqnSolArrayMap3[5] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
        UsageCalculus.EqnSolArrayMap4[5] = "";
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

    public static void TestCaseDiff2081() {
        //Test Case 4022
        UsageCalculus.TestCase = 2081;
        UsageCalculus.EqnRegressionDiffStatus = "All Green Including Values";
        UsageCalculus.EqnRegressionIntegreStatus = "All Green Including Values";
        UsageCalculus.EqnUnderTest = "a/x^8 + a/x^5 + a/x^4 - 2/a/x- 25*(2)";
        UsageCalculus.TestCaseName = "Simple: IndConstant";
        UsageCalculus.TestCaseMatrixID = "IndConstant:1 Letter:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Parenthesis:COnstants:Coeffiecient:Exponent";

        UsageCalculus.DiffWithRespTo = "x";
        UsageCalculus.MaxDiffOrder = 14;
        UsageCalculus.MaxIntegreOrder = 2;

        UsageCalculus.EqnSolArrayMap1[1] = "a/x^8.0+a/x^5.0+a/x^4.0-1.0/a*2.0/x-50.0";
        UsageCalculus.EqnSolArrayDiffAlone[1] = "a*-8.0/x^9.0+a*-5.0/x^6.0+a*-4.0/x^5.0+1.0/a*2.0/x^2.0-50.0*0.0";
        UsageCalculus.EqnSolArrayMap2[1] = "-a*8.0/x^9.0-a*5.0/x^6.0-a*4.0/x^5.0+1.0/a*2.0/x^2.0";
        UsageCalculus.EqnSolArrayMap3[1] = "a/x^8.0+a/x^5.0+a/x^4.0-1.0/a*2.0/x-50.0";
        UsageCalculus.EqnSolArrayIntegrAlone[1] = "a/-7.0/x^7.0+a/-4.0/x^4.0+a/-3.0/x^3.0-1.0/a*2.0*ln(x)-50.0*x";
        UsageCalculus.EqnSolArrayMap4[1] = "-a/7.0/x^7.0-a/4.0/x^4.0-a/3.0/x^3.0-1.0/a*2.0*ln(x)-50.0*x";
        UsageCalculus.EqnSolOrder[1] = 1;

        UsageCalculus.EqnSolArrayMap1[2] = "-a*8.0/x^9.0-a*5.0/x^6.0-a*4.0/x^5.0+1.0/a*2.0/x^2.0";
        UsageCalculus.EqnSolArrayDiffAlone[2] = "-a*8.0*-9.0/x^10.0-a*5.0*-6.0/x^7.0-a*4.0*-5.0/x^6.0+1.0/a*2.0*-2.0/x^3.0";
        UsageCalculus.EqnSolArrayMap2[2] = "a*72.0/x^10.0+a*30.0/x^7.0+a*20.0/x^6.0-1.0/a*4.0/x^3.0";
        UsageCalculus.EqnSolArrayMap3[2] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[2] = "";
        UsageCalculus.EqnSolArrayMap4[2] = "";
        UsageCalculus.EqnSolOrder[2] = 2;

        UsageCalculus.EqnSolArrayMap1[3] = "a*72.0/x^10.0+a*30.0/x^7.0+a*20.0/x^6.0-1.0/a*4.0/x^3.0";
        UsageCalculus.EqnSolArrayDiffAlone[3] = "a*72.0*-10.0/x^11.0+a*30.0*-7.0/x^8.0+a*20.0*-6.0/x^7.0-1.0/a*4.0*-3.0/x^4.0";
        UsageCalculus.EqnSolArrayMap2[3] = "-a*720.0/x^11.0-a*210.0/x^8.0-a*120.0/x^7.0+1.0/a*12.0/x^4.0";
        UsageCalculus.EqnSolArrayMap3[3] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[3] = "";
        UsageCalculus.EqnSolArrayMap4[3] = "";
        UsageCalculus.EqnSolOrder[3] = 3;

        UsageCalculus.EqnSolArrayMap1[4] = "-a*720.0/x^11.0-a*209.99999999999997/x^8.0-a*120.0/x^7.0+1.0/a*12.0/x^4.0";
        UsageCalculus.EqnSolArrayDiffAlone[4] = "-a*720.0*-11.0/x^12.0-a*209.99999999999997*-8.0/x^9.0-a*120.0*-7.0/x^8.0+1.0/a*12.0*-4.0/x^5.0";
        UsageCalculus.EqnSolArrayMap2[4] = "a*7920.0/x^12.0+a*1679.9999999999998/x^9.0+a*840.0/x^8.0-1.0/a*48.0/x^5.0";
        UsageCalculus.EqnSolArrayMap3[4] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[4] = "";
        UsageCalculus.EqnSolArrayMap4[4] = "";
        UsageCalculus.EqnSolOrder[4] = 4;

        UsageCalculus.EqnSolArrayMap1[5] = "";
        UsageCalculus.EqnSolArrayDiffAlone[5] = "";
        UsageCalculus.EqnSolArrayMap2[5] = "";
        UsageCalculus.EqnSolArrayMap3[5] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[5] = "";
        UsageCalculus.EqnSolArrayMap4[5] = "";
        UsageCalculus.EqnSolOrder[5] = 5;

        UsageCalculus.EqnSolArrayMap1[6] = "";
        UsageCalculus.EqnSolArrayDiffAlone[6] = "";
        UsageCalculus.EqnSolArrayMap2[6] = "";
        UsageCalculus.EqnSolArrayMap3[6] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[6] = "";
        UsageCalculus.EqnSolArrayMap4[6] = "";
        UsageCalculus.EqnSolOrder[6] = 6;

        UsageCalculus.EqnSolArrayMap1[7] = "";
        UsageCalculus.EqnSolArrayDiffAlone[7] = "";
        UsageCalculus.EqnSolArrayMap2[7] = "";
        UsageCalculus.EqnSolArrayMap3[7] = "";
        UsageCalculus.EqnSolArrayIntegrAlone[7] = "";
        UsageCalculus.EqnSolArrayMap4[7] = "";
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
    public static void TestCaseDiff2082() {
        //Test Case Old 2018
        TestCase = 2082;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values";        
        EqnUnderTest = "1.0*+5*+xyc1^8/xyc1^0 + 1.0*+5*+xyc1^5/xyc1^0 + 1.0*+5*+xyc1^4/xyc1^0 + 1.0*+5*+xyc1/xyc1^0 + 1.0*+5*25";
        TestCaseName = "Complex: Coefficients:+5";
        TestCaseMatrixID="Coefficients:+5:3 Letter with Numerics:* Operator:No Exponent Sign:Constant End:Term Sign +&-";
        
        DiffWithRespTo = "xyc1";
        MaxDiffOrder = 14;
        MaxIntegreOrder = 14;
        
        EqnSolArrayMap1[1] = "5.0*xyc1^8.0+5.0*xyc1^5.0+5.0*xyc1^4.0+5.0*xyc1+125.0";
        EqnSolArrayDiffAlone[1] = "5.0*8.0*xyc1^7.0+5.0*5.0*xyc1^4.0+5.0*4.0*xyc1^3.0+5.0+125.0*0.0";
        EqnSolArrayMap2[1] = "40.0*xyc1^7.0+25.0*xyc1^4.0+20.0*xyc1^3.0+5.0";
        EqnSolArrayMap3[1]="5.0*xyc1^8.0+5.0*xyc1^5.0+5.0*xyc1^4.0+5.0*xyc1+125.0";
        EqnSolArrayIntegrAlone[1]="5.0/9.0*xyc1^9.0+5.0/6.0*xyc1^6.0+5.0/5.0*xyc1^5.0+5.0/2.0*xyc1^2.0+125.0*xyc1";
        EqnSolArrayMap4[1]="1.0/1.8*xyc1^9.0+1.0/1.2*xyc1^6.0+xyc1^5.0+2.5*xyc1^2.0+125.0*xyc1";
        EqnSolOrder[1] = 1;

        EqnSolArrayMap1[2] = "40.0*xyc1^7.0+25.0*xyc1^4.0+20.0*xyc1^3.0+5.0";
        EqnSolArrayDiffAlone[2] = "40.0*7.0*xyc1^6.0+25.0*4.0*xyc1^3.0+20.0*3.0*xyc1^2.0+5.0*0.0";
        EqnSolArrayMap2[2] = "280.0*xyc1^6.0+100.0*xyc1^3.0+60.0*xyc1^2.0";
        EqnSolArrayMap3[2]="1.0/1.8*xyc1^9.0+0.8333333333333334*xyc1^6.0+xyc1^5.0+2.5*xyc1^2.0+125.0*xyc1";
        EqnSolArrayIntegrAlone[2]="1.0/1.8/10.0*xyc1^10.0+0.8333333333333334/7.0*xyc1^7.0+1.0/6.0*xyc1^6.0+2.5/3.0*xyc1^3.0+125.0/2.0*xyc1^2.0";
        EqnSolArrayMap4[2]="1.0/18.0*xyc1^10.0+1.0/8.4*xyc1^7.0+1.0/6.0*xyc1^6.0+1.0/1.2*xyc1^3.0+62.5*xyc1^2.0";
        EqnSolOrder[2] = 2;

        EqnSolArrayMap1[3] = "280.0*xyc1^6.0+100.0*xyc1^3.0+60.0*xyc1^2.0";
        EqnSolArrayDiffAlone[3] = "280.0*6.0*xyc1^5.0+100.0*3.0*xyc1^2.0+60.0*2.0*xyc1^1.0";
        EqnSolArrayMap2[3] = "1680.0*xyc1^5.0+300.0*xyc1^2.0+120.0*xyc1";
        EqnSolArrayMap3[3]="1.0/18.0*xyc1^10.0+1.0/8.4*xyc1^7.0+1.0/6.0*xyc1^6.0+1.0/1.2*xyc1^3.0+62.5*xyc1^2.0";
        EqnSolArrayIntegrAlone[3]="1.0/18.0/11.0*xyc1^11.0+1.0/8.4/8.0*xyc1^8.0+1.0/6.0/7.0*xyc1^7.0+1.0/1.2/4.0*xyc1^4.0+62.5/3.0*xyc1^3.0";
        EqnSolArrayMap4[3]="1.0/198.0*xyc1^11.0+1.0/67.2*xyc1^8.0+1.0/42.0*xyc1^7.0+1.0/4.8*xyc1^4.0+20.833333333333332*xyc1^3.0";
        EqnSolOrder[3] = 3;

        EqnSolArrayMap1[4] = "1680.0*xyc1^5.0+300.0*xyc1^2.0+120.0*xyc1";
        EqnSolArrayDiffAlone[4] = "1680.0*5.0*xyc1^4.0+300.0*2.0*xyc1^1.0+120.0";
        EqnSolArrayMap2[4] = "8400.0*xyc1^4.0+600.0*xyc1+120.0";
        EqnSolArrayMap3[4]="1.0/198.0*xyc1^11.0+1.0/67.2*xyc1^8.0+1.0/42.0*xyc1^7.0+1.0/4.8*xyc1^4.0+20.833333333333332*xyc1^3.0";
        EqnSolArrayIntegrAlone[4]="1.0/198.0/12.0*xyc1^12.0+1.0/67.2/9.0*xyc1^9.0+1.0/42.0/8.0*xyc1^8.0+1.0/4.8/5.0*xyc1^5.0+20.833333333333332/4.0*xyc1^4.0";
        EqnSolArrayMap4[4]="1.0/2376.0*xyc1^12.0+1.0/604.8000000000001*xyc1^9.0+1.0/336.0*xyc1^8.0+1.0/24.0*xyc1^5.0+5.208333333333333*xyc1^4.0";
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
}
