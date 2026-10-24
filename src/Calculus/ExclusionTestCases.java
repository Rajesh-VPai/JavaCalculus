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
package Calculus;

import org.apache.log4j.Logger;

/**
 *
 * @author Administrator
 */
public class ExclusionTestCases {

    public static Logger log = Logger.getLogger(ExclusionTestCases.class.getName());

    public static boolean IntegralGapInfinity(long j) {
        //Infinite Loops
        if (IntegralKnownIssues(j)) {
            return true;
        }
        return false;
    }

    public static boolean DifferentialGapInfinity(long j) {
//        //Infinite Loops
        if (DifferentialKnownIssues(j)) {
            return true;
        }
        return false;
    }

    public static boolean IntegralGapException(long j) {
        return false;
    }

    public static boolean DifferentialGapException(long j) {
//        if ( (j==80041) ||(j==80042) ||( j==80043) || (j==80091) )
//            return true;
        return false;
    }

    public static boolean TrueDifferentialGapInfinity(long j) {
        //80037, 80085, 90011,
        if ((j == 80037) || (j == 80085) || (j == 90011)) {
            return true;
        }
        return false;
    }

    public static boolean TrueIntegralGapInfinity(long j) {
        return false;
    }

    public static boolean TrueIntegralGapException(long j) {

        return false;
    }

    public static boolean TrueDifferentialGapException(long j) {
        //20044, 30007, 30008,
        if ((j == 20044) || (j == 30007) || (j == 30008)) {
            return true;
        }
        return false;
    }

    public static boolean IntegralGapWrongAnswer(long j) {
        //Exclude the Wrong Answer Test Cases from the Reporting
        //Test Cases will however be executed
        // Return False to exclude from reporting

        return false;
    }

    public static boolean DifferentialGapWrongAnswer(long j) {
        //Exclude the Wrong Answer Test Cases from the Reporting 
        //Test Cases will however be executed
        // Return False to exclude from reporting

        return false;
    }

    public static boolean IntegralKnownIssues(long j) {
        //Exclude the Known Issues Test Cases from the Reporting
        //Test Cases will however be executed
        // Return False to exclude from reporting
        if (IsolationTestCaseINTEGRE(j)) {
            return true;
        } else if (MixedIsolationTestCaseINTEGRE(j)) {
            return true;
        } else if (CoPilotEqnBasicTestCaseINTEGRE(j)) {
            return true;
        } else if (SanityTestCaseINTEGRE(j)) {
            return true;
        } else if (UnitTestCaseINTEGRE(j)) {
            return true;
        } else if (NamesTestCaseINTEGRE(j)) {
            return true;
        } else if (CoefficientsTestCaseINTEGRE(j)) {
            return true;
        } else if (ExponentTestCaseINTEGRE(j)) {
            return true;
        } else if (SignedXTestCaseINTEGRE(j)) {
            return true;
        } else if (InfinityNANTestCaseINTEGRE(j)) {
            return true;
        } else if (InfinityNANLOOPSTestCaseINTEGRE(j)) {
            return true;
        }else if (IndConstantTestCaseINTEGRE(j)) {
            return true;
        }  else if (ParenthesisTestCaseINTEGRE(j)) {
            return true;
        } else if (FuncTestCaseINTEGRE(j)) {
            return true;
        } else if (FuncArgTestCaseINTEGRE(j)) {
            return true;
        } else if (SoftEnggTestCaseINTEGRE(j)) {
            return true;
        } else if (FisherDOEINTEGRE(j)) {
            return true;
        } else if (HadammardINTEGRE(j)) {
            return true;
        }
        return false;
    }

    public static boolean DifferentialKnownIssues(long j) {
        //Exclude the Known Issues Test Cases from the Reporting 
        //Test Cases will however be executed
        // Return False to exclude from reporting
        if (IsolationTestCaseDIFFR(j)) {
            return true;
        } else if (MixedIsolationTestCaseDIFFR(j)) {
            return true;
        } else if (InfinityNANTestCaseDIFFR(j)) {
            return true;
        } else if (InfinityNANLOOPSTestCaseDIFFR(j)) {
            return true;
        } else if (CoPilotEqnBasicTestCaseDIFFR(j)) {
            return true;
        } else if (SanityTestCaseDIFFR(j)) {
            return true;
        } else if (UnitTestCaseDIFFR(j)) {
            return true;
        } else if (NamesTestCaseDIFFR(j)) {
            return true;
        } else if (CoefficientsTestCaseDIFFR(j)) {
            return true;
        } else if (ExponentTestCaseDIFFR(j)) {
            return true;
        } else if (SignedXTestCaseDIFFR(j)) {
            return true;
        } else if (IndConstantTestCaseDIFFR(j)) {
            return true;
        } else if (ParenthesisTestCaseDIFFR(j)) {
            return true;
        } else if (FuncTestCaseDIFFR(j)) {
            return true;
        } else if (FuncArgTestCaseDIFFR(j)) {
            return true;
        } else if (SoftEnggTestCaseDIFFR(j)) {
            return true;
        } else if (HadammardDIFFR(j)) {
            return true;
        } else if (FisherDOEDIFFR(j)) {
            return true;
        }
        return false;
    }

    public static boolean IsolationTestCaseINTEGRE(long j) {
        // Number of Integration Known Issues: 2 out of 14
        //Start=1000:End=1015:
        return false;
    }

    public static boolean IsolationTestCaseDIFFR(long j) {
        // Number of Differentiation Known Issues: 2 out of 14
        //Start=1000:End=1015:
        return false;
    }

    public static boolean MixedIsolationTestCaseINTEGRE(long j) {
        // Number of Integration Known Issues: 7 out of 24
        //Start=2000:End=2082:
        if (j==2025)
            return true;
        else if (j==2031)
            return true;
        return false;
    }

    public static boolean MixedIsolationTestCaseDIFFR(long j) {
        // Number of Differentiation Known Issues: 6 out of 24
        //Start=2000:End=2082:
        return false;
    }

    public static boolean CoPilotEqnBasicTestCaseINTEGRE(long j) {
        // Number of Integration Known Issues: 7 out of 24
        //Start=3000:End=3499:
        return false;
    }

    public static boolean CoPilotEqnBasicTestCaseDIFFR(long j) {
        // Number of Differentiation Known Issues: 6 out of 24
        //Start=3000:End=3499:
        return false;
    }

    public static boolean SanityTestCaseINTEGRE(long j) {
        // Number of Integration Known Issues: 6 out of 33
        // Start=4000:End=4033:
        return false;
    }

    public static boolean SanityTestCaseDIFFR(long j) {
        // Number of Differentiation Known Issues: 5 out of 33
        // Start=4000:End=4033:
        return false;
    }

    public static boolean UnitTestCaseINTEGRE(long j) {
        // Number of Integration Known Issues: 2 out of 30
        // Start=5000:End=5033:
        return false;
    }

    public static boolean UnitTestCaseDIFFR(long j) {
        // Number of Differentiation Known Issues: 2 out of 30
        // Start=5000:End=5033:
        return false;
    }

    public static boolean InfinityNANTestCaseINTEGRE(long j) {
        // Number of Integration Known Issues: 1 out of 20
        // Start=6000:End=6019:
        return false;
    }

    public static boolean InfinityNANTestCaseDIFFR(long j) {
        // Number of Differentiation Known Issues: 1 out of 20
        // Start=6000:End=6019: 
        return false;
    }

    public static boolean InfinityNANLOOPSTestCaseINTEGRE(long j) {
        // Number of Integration Known Issues: 0 out of 0
        // Start=7000:End=7005:
        if ((j == 7002)) {
            return true;
        }
        return false;
    }

    public static boolean InfinityNANLOOPSTestCaseDIFFR(long j) {
        // Number of Differentiation Known Issues: 0 out of 0
        // Start=7000:End=7005:
        return false;
    }

    public static boolean NamesTestCaseINTEGRE(long j) {
        // Number of Integration Known Issues: 0 out of 10
        // Start=10001:End=10010:
        return false;
    }

    public static boolean NamesTestCaseDIFFR(long j) {
        // Number of Differentiation Known Issues: 0 out of 10
        // Start=10001:End=10010: 
        return false;
    }

    public static boolean CoefficientsTestCaseINTEGRE(long j) {
        // Number of Integration Known Issues: 0 out of 10
        // Start=20001:End=20069:
        return false;
    }

    public static boolean CoefficientsTestCaseDIFFR(long j) {
        // Number of Differentiation Known Issues: 4 out of 69
        // Start=20001:End=20069:     
        return false;
    }

    public static boolean ExponentTestCaseINTEGRE(long j) {
        // Number of Integration Known Issues: 4 out of 11
        // Start=30001:End=30011:
        return false;
    }

    public static boolean ExponentTestCaseDIFFR(long j) {
        // Number of Differentiation Known Issues: 0 out of 11
        // Start=30001:End=30011: 
        return false;
    }

    public static boolean SignedXTestCaseINTEGRE(long j) {
        // Number of Integration Known Issues: 11 out of 32
        // Start=40001:End=40049:
        return false;
    }

    public static boolean SignedXTestCaseDIFFR(long j) {
        // Number of Differentiation Known Issues: 11 out of 32
        // Start=40001:End=40049: 
        return false;
    }

    public static boolean IndConstantTestCaseINTEGRE(long j) {
        // Number of Integration Known Issues: 56 out of 93
        // Start=50001:End=50093:   
        if (j==50094)
            return true;
        else if (j==50095)
            return true;
        return false;
    }

    public static boolean IndConstantTestCaseDIFFR(long j) {
        // Number of Differentiation Known Issues: 57 out of 93
        // Start=50001:End=50093:
        if (j==50094)
            return true;
        else if (j==50095)
            return true;
        return false;
    }

    public static boolean ParenthesisTestCaseINTEGRE(long j) {
        // Number of Integration Known Issues: 82 out of 102
        // Start=80000:End=80131:   
        // Infinite Loops
        if (j==80054)
            return true;
        else if (j==80076)
            return true;
        else if (j==80077)
            return true;
        else if (j==80085)
            return true;
        else if (j==80119)
            return true;
        else if (j==80123)
            return true;
        else if (j==80126)
            return true;
        return false;
    }

    public static boolean ParenthesisTestCaseDIFFR(long j) {
        // Number of Differentiation Known Issues: 56 out of 102
        // Start=80000:End=80131:
        if ( (j==80054) )
            return true;
        else if (j==80076)
            return true;
        else if (j==80077)
            return true;
        else if (j==80119)
            return true;
        else if (j==80126)
            return true;
        return false;
    }

    public static boolean FuncTestCaseINTEGRE(long j) {
        // Number of Integration Known Issues: 11 out of 32
        // Start=90000:End=90022:
        if(j==90014)
            return true;
        return false;
    }

    public static boolean FuncTestCaseDIFFR(long j) {
        // Number of Differentiation Known Issues: 11 out of 32
        // Start=90000:End=90022: 
        return false;
    }

    public static boolean FuncArgTestCaseINTEGRE(long j) {
        // Number of Integration Known Issues: 0 out of 0
        // Start=100000:End=100009:

        return false;
    }

    public static boolean FuncArgTestCaseDIFFR(long j) {
        // Number of Differentiation Known Issues: 0 out of 0
        // Start=100000:End=100009:
        return false;
    }

    public static boolean SoftEnggTestCaseINTEGRE(long j) {
        // Number of Integration Known Issues: 2 out of 23
        // Start=110001:End=110023:
        if (j==110024)
            return true;
        return false;
    }

    public static boolean SoftEnggTestCaseDIFFR(long j) {
        // Number of Differentiation Known Issues: 1 out of 23
        // Start=110001:End=110023:
        return false;
    }

    public static boolean HadammardINTEGRE(long j) {
        // Number of Integration Known Issues: 2 out of 23
        // Start=120001:End=121400:

        return false;
    }

    public static boolean HadammardDIFFR(long j) {
        // Number of Differentiation Known Issues: 1 out of 23
        // Start=120001:End=121400:

        return false;
    }

    public static boolean FisherDOEINTEGRE(long j) {
        // Number of Integration Known Issues: 2 out of 23
        // Start=130001:End=131400:

        return false;
    }

    public static boolean FisherDOEDIFFR(long j) {
        // Number of Differentiation Known Issues: 1 out of 23
        // Start=130001:End=131400:
        return false;
    }
}
