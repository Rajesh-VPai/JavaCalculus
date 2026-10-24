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
import Calculus.MathsContxtLAv;
import static Calculus.MathsExpressionParser.eatAll;
import static Calculus.MathsExpressionParser.parse;
import static Calculus.MathsContxtLAv.variables;
import Calculus.MathsExpressionParser;
import static Calculus.UsageCalculus.DiffWithRespTo;
import static Calculus.UsageCalculus.DupChecknInsert;
import static Calculus.UsageCalculus.EqnUnderTest;
import static Calculus.UsageCalculus.SetVariablesAll;
import static JavaCalculusTestHarness.EnhancedDOEAlgebraGenerator.Exp_Sign;
import static JavaCalculusTestHarness.EnhancedDOEAlgebraGenerator.Operator1;
import static JavaCalculusTestHarness.EnhancedDOEAlgebraGenerator.Operator3;
import static JavaCalculusTestHarness.EnhancedDOEAlgebraGenerator.Operator4;
import static JavaCalculusTestHarness.EnhancedDOEAlgebraGenerator.Operator5;
import static JavaCalculusTestHarness.EnhancedDOEAlgebraGenerator.isIndConstMethod;
import static JavaCalculusTestHarness.EnhancedDOEAlgebraGenerator.isVarMethod;
import static JavaCalculusTestHarness.EnhancedDOEAlgebraGenerator.preOpOperator;
import static JavaCalculusTestHarness.SymbolicTestCaseGeneratorHadammard.DupFlag;
import static JavaCalculusTestHarness.SymbolicTestCaseGeneratorHadammard.EqnDB;
import static JavaCalculusTestHarness.SymbolicTestCaseGeneratorHadammard.EqnDBDupCount;
import static JavaCalculusTestHarness.SymbolicTestCaseGeneratorHadammard.EqnDBIndex;
import static JavaCalculusTestHarness.SymbolicTestCaseGeneratorHadammard.IndexHadamard;
import static JavaCalculusTestHarness.SymbolicTestCaseGeneratorHadammard.MyDebugVerboseFlag;
import static JavaCalculusTestHarness.SymbolicTestCaseGeneratorHadammard.MyDebugVerboseFlagLowLevel;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;
/**
 *
 * @author Rajesh V Pai
 */
public class EnhancedHadammard {
  
    //Equation Component Testing
//2)	Variables :L=3:Single Letter, Multi Letter, with Numerics , with Underscore
//3)	Coefficient:L=9:0.0,0,1.0,1,-1.0,-1,5,-5,-5.0
//4)	Exponent:L=6: +ve,-ve,0,1,Independent Constants, Long Form (x * x*x)
//5)	Operator:L=2: *,/
//6)	Constants:L=3: Start of Expr, Middle (2-5) Terms, End Term
//7)	Independent Constants:L=3:Single Letter, Multi Letter, with Numerics
//8)	Expression
//9)	Term:L=3: Start Term, Middle (2-5) Terms, End Term
//10)	Term Sign:L=3: +ve, -ve, No Sign
//11)	Exponent Sign:L=3: +ve, -ve, No Sign
//12)	Coefficient Sign:L=3: +ve, -ve, No Sign
//12)	Variable Sign:L=3: +ve, -ve, No Sign
//13)	Parentheses:L=3 : 1st Term, 2nd Term , 3-5 Terms
//14)
    // Actual Config Meta
    //0) Untouched
    //1) Untouched
    //2) NumOfTerms:L=6: 1,2,3,4,5,6
    //3) Coefficient:L=9:0.0,0,1.0,1,-1.0,-1,5,-5,-5.0
    //4) Variables :L=4:Single Letter, Multi Letter, with Numerics , with Underscore
    //5) Independent Constants:L=4:Single Letter, Multi Letter, with Numerics
//6)	Operator:L=2: *,/
//7)	ConstantsCoeff:L=3: Start of Expr, Middle (2-5) Terms, End Term
//8)	Term:L=3: Start Term, Middle (2-5) Terms, End Term
//9)	Term Sign:L=3: +ve, -ve, No Sign
//10)	Exponent Sign:L=3: +ve, -ve, No Sign
//11)	Coefficient Sign:L=3: +ve, -ve, No Sign
//12)	Variable Sign:L=3: +ve, -ve, No Sign
//13)	Parentheses:L=3 : 1st Term, 2nd Term , 3-5 Terms
//14) 
    // Actual Config Term
    //0) Untouched
    //1) Untouched
    //2) Exponent:L=6: +ve,-ve,0,1,Independent Constants, Long Form (x * x*x)
    //3) Coefficient:L=9:0.0,0,1.0,1,-1.0,-1,5,-5,-5.0
    //4) Variables :L=4:Single Letter, Multi Letter, with Numerics , with Underscore
    //5) Independent Constants:L=4:Single Letter, Multi Letter, with Numerics
//6)	Operator:L=2: *,/
//7)	ConstantsCoeff:L=3: Start of Expr, Middle (2-5) Terms, End Term
//8)	Term:L=3: Start Term, Middle (2-5) Terms, End Term
//9)	Term Sign:L=3: +ve, -ve, No Sign
//10)	Exponent Sign:L=3: +ve, -ve, No Sign
//11)	Coefficient Sign:L=3: +ve, -ve, No Sign
//12)	Variable Sign:L=3: +ve, -ve, No Sign
//13)	Parentheses:L=3 : 1st Term, 2nd Term , 3-5 Terms
//14)   
////col0=coeff, col1=, col2=isVar,col3=letters, col4=digits, col5=exponents(exp), col6=preOp, col7=isComplex  
//    static int[][] doeMatrix = {
//        {0, 0, 0, 2, 1, 0, 0, 0},
//        {1, 1, 1, 1, 2, 3, 1, 1},
//        {2, 2, 0, 3, 0, 1, 2, 0},
//        {0, 3, 1, 1, 1, 2, 0, 1},
//        {1, 0, 0, 2, 2, 0, 1, 0},
//        {2, 1, 1, 1, 0, 3, 2, 0},
//        {0, 2, 0, 2, 1, 2, 0, 1},
//        {1, 3, 1, 3, 2, 1, 1, 0}
//    };
    //col0=numTerms, col1=useConst, col2=useParen,col3, col4:Equation Number of DOEMatrix, col5=termsign(equationOperators)(op)
//    static int[][] metaDOE = {
//        {2, 1, 1, 0, 1, 0},
//        {2, 0, 0, 2, 3, 2},
//        {2, 1, 0, 4, 5, 1},
//        {2, 0, 1, 6, 7, 3},
//        {2, 1, 1, 1, 4, 2},
//        
//        {2, 1, 1, 0, 1, 0},
//        {2, 0, 0, 2, 3, 2},
//        {2, 1, 0, 4, 5, 1},
//        {2, 0, 1, 6, 7, 3},
//        {2, 1, 1, 1, 4, 2}
//    };
//    public static int[][] metaDOE = {
//        //DataArray:Header:0 1 2 3 4 5 6 7 8 9 10 11 12 
//        //DataArray:Header(Name):_EquationNumber_0_500_ _EquationNumber_1_500_ _NumOfTerms_2_6_ _useConst_3_2_ _Coefficient_4_9_ _Variables_5_4_ _Independent_Constants_6_4_ _Operator_7_2_ _ConstantsCoeff_8_3_ _useParen_9_2_ Operator2_10_2 isVar_11_2 DiffWithRespToLen_12_4
//        {1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1},//Row=0  Unique Row 
//        {1, 2, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2},//Row=1  Unique Row 
//        {1, 3, 1, 2, 3, 3, 3, 2, 3, 2, 2, 2, 3},//Row=2  Unique Row 
//        {1, 4, 1, 1, 4, 4, 4, 2, 2, 2, 2, 2, 4},//Row=3  Unique Row 
//        {1, 5, 6, 2, 5, 2, 2, 2, 3, 2, 2, 2, 2},//Row=4  Unique Row 
//        {2, 6, 6, 1, 6, 3, 3, 2, 2, 2, 2, 2, 3},//Row=5  Unique Row 
//        {2, 7, 6, 2, 3, 4, 2, 1, 3, 1, 2, 1, 3},//Row=6  Unique Row 
//        {2, 8, 6, 1, 4, 1, 3, 1, 1, 2, 1, 2, 4},//Row=7  Unique Row 
//        {2, 9, 6, 2, 5, 2, 4, 2, 3, 1, 2, 1, 1},//Row=8  Unique Row 
//        {2, 10, 5, 1, 6, 3, 1, 1, 1, 2, 1, 2, 3},//Row=9  Unique Row 
//        {3, 11, 5, 2, 7, 4, 2, 1, 2, 1, 2, 1, 4},//Row=10  Unique Row 
//        {3, 12, 5, 1, 8, 1, 3, 2, 3, 2, 1, 2, 1},//Row=11  Unique Row 
//        {3, 13, 5, 2, 9, 2, 4, 1, 1, 1, 2, 1, 2},//Row=12  Unique Row 
//        {3, 14, 5, 1, 1, 3, 1, 2, 3, 2, 1, 2, 3},//Row=13  Unique Row 
//        {3, 15, 4, 2, 3, 4, 2, 1, 1, 1, 2, 1, 4},//Row=14  Unique Row 
//        {4, 16, 4, 1, 4, 1, 3, 2, 3, 2, 1, 2, 1},//Row=15  Unique Row 
//        {4, 17, 4, 2, 5, 2, 4, 1, 1, 1, 2, 1, 2},//Row=16  Unique Row 
//        {4, 18, 4, 1, 6, 3, 1, 2, 3, 2, 1, 2, 3},//Row=17  Unique Row 
//        {4, 19, 4, 2, 7, 4, 2, 1, 1, 1, 2, 1, 4},//Row=18  Unique Row 
//        {4, 20, 3, 1, 8, 1, 3, 2, 3, 2, 1, 2, 1},//Row=19  Unique Row 
//        {5, 21, 3, 2, 9, 2, 4, 1, 1, 1, 2, 1, 2},//Row=20  Unique Row 
//    };
//    public static int[][] doeMatrix = {
//        //DataArray:Header:0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
//        //DataArray:Header(Name):_EquationNumber_0_500_ _EquationNumber_1_500_ isVar_2_2_ Coefficient_letters_3_9_ CONSTANTS_digits_4_5 
//        //isIndConst_5_2_ indConstletters_6_9_ indConstdigits_7_5_ Exponent_IDX_8_9
//        //Exponent_Sign_9_3_ Variable_Sign_10_3_ factorJoinOps_11_6_ ISCOMPLEX_12_2 
//        //Operator3_13_6 Operator4_14_6 Operator5_15_6 DiffWithRespToLen_16_4
//        {1, 1, 1, 9, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},//Row=0  Unique Row 
//        {1, 2, 1, 8, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},//Row=1  Unique Row 
//        {1, 3, 1, 7, 1, 2, 1, 2, 3, 1, 2, 1, 2, 1, 2, 1},//Row=2  Unique Row 
//        {1, 4, 1, 6, 4, 2, 1, 3, 1, 2, 3, 1, 2, 1, 2, 1},//Row=3  Unique Row 
//        {1, 5, 1, 5, 2, 3, 1, 4, 3, 1, 3, 1, 2, 1, 2, 1},//Row=4  Unique Row 
//        {1, 6, 1, 4, 3, 1, 2, 5, 2, 1, 2, 1, 2, 1, 2, 3},//Row=5  Unique Row 
//        {1, 7, 1, 3, 4, 3, 1, 1, 2, 3, 1, 2, 1, 2, 1, 4},//Row=6  Unique Row 
//        {1, 8, 1, 2, 5, 2, 1, 2, 3, 1, 2, 1, 2, 1, 2, 1},//Row=7  Unique Row 
//        {1, 9, 1, 1, 6, 1, 2, 3, 1, 2, 3, 1, 2, 1, 2, 3},//Row=8  Unique Row 
//        {1, 10, 2, 9, 1, 2, 1, 4, 2, 3, 1, 2, 1, 1, 2, 4},//Row=9  Unique Row 
//        {2, 11, 2, 8, 2, 1, 2, 5, 3, 1, 2, 1, 2, 1, 1, 1},//Row=10  Unique Row 
//        {2, 12, 2, 7, 3, 1, 2, 1, 1, 2, 3, 2, 1, 2, 1, 2},//Row=11  Unique Row 
//        {2, 13, 2, 6, 4, 1, 2, 3, 2, 3, 1, 1, 2, 1, 2, 3},//Row=12  Unique Row 
//        {2, 14, 2, 5, 6, 1, 2, 4, 3, 1, 2, 1, 1, 2, 1, 4},//Row=13  Unique Row 
//        {2, 15, 2, 4, 1, 2, 1, 5, 1, 2, 3, 2, 1, 1, 2, 1},//Row=14  Unique Row 
//        {2, 16, 2, 3, 2, 1, 2, 1, 2, 3, 1, 1, 2, 1, 1, 2},//Row=15  Unique Row 
//        {2, 17, 2, 2, 3, 1, 2, 3, 1, 1, 2, 1, 1, 2, 1, 3},//Row=16  Unique Row 
//        {2, 18, 2, 1, 4, 1, 2, 4, 2, 3, 1, 2, 1, 1, 2, 4},//Row=17  Unique Row 
//        {2, 19, 2, 9, 5, 3, 1, 5, 3, 1, 2, 1, 2, 1, 1, 1},//Row=18  Unique Row 
//        {2, 20, 1, 8, 6, 2, 1, 1, 1, 2, 3, 2, 1, 2, 1, 2},//Row=19  Unique Row 
//        {3, 21, 1, 7, 1, 2, 1, 2, 3, 1, 1, 1, 2, 1, 2, 3},//Row=20  Unique Row 
//        
//    };
    public static int[][] metaHadamard =null;
    public static int[][] HadamardMatrix = null;
    public static String ConfigFileNameMETA = "metaHadamard.txt";//"meta_doe.txt";//DOEMatrix.txt
    public static long LengthMETA = 33;//11;// Length (Number of Signal Columns of Orthogonal Matrix)
    public static long ROWSDOEMETA = 2000;
    public static String ConfigFileNameHadamardMat = "HadamardMatrix.txt";//"meta_doe.txt";//DOEMatrix.txt
    public static long LengthDOEMat = 18;// Length (Number of Signal Columns of Orthogonal Matrix)
    public static long ROWSDOEMat = 2000;
    //public static String DiffWithRespTo = "x";
    static String[] factorOperator3 = {"*", "/", "*-", "/-", "*+", "/+"};
    static String[] equationOperators = {"+", "-"};
    static Random rand = new Random();
    private static String Term1="";
    private static String Term2="";
    
    public static String generateEquations(int Index, String AlgoName2,int NumOfTerms, long TestCase) {
        StringBuilder equations = new StringBuilder("");
        System.out.println("Hadammard:generateEquations:Index=" + Index);
        if ((Index==0)){
            MyScanfHdMeta();
            MyScanfHadamard();
        }
        int[] metaRow = metaHadamard[Index];
        //for (int[] metaRow : metaDOE) { ;//metaDOE) {
        if (MyDebugVerboseFlagLowLevel) {
            System.out.println("Hadammard:generateEquations:DiffWithRespTo=" + DiffWithRespTo);
        }
        equations.append(generateEquationFromMetaDOE(metaRow)) ;
        DupFlag = DupChecknInsert(equations.toString(), ""+TestCase, DiffWithRespTo);
        equations.append("@DiffWithRespTo@" + DiffWithRespTo);
                
        if (MyDebugVerboseFlag) {
            System.out.println("Hadammard:generateEquations:equations=" + equations);
        }
       
        //}
        return equations.toString();
    }
//DataArray:Header:0 1 2 3 4 5 6 7 8 9 10
//DataArray:Header(Name):_EquationNumber_0_500_ _EquationNumber_1_500_ _NumOfTerms_2_6_ _useConst_3_2_ 
    //_Operator1_4_2_ OPERATORIDX_5_2_ CONSTANTS_6_5_ _useParen_7_2_ Operator2_8_2 isVar_9_2 DiffWithDRespToLen_10_5
    static final int METAEquationNumber = 1;
    static final int METANUMTERMS = 2;
    static final int METAUSECONST = 3;
    static final int METAOPERATOR1 = 4;
    static final int METAOPERATORIDX = 5;
    static final int META_CONSTANTS = 6;
    static final int METAPARENSTYLE = 7;
    static final int METAOperator2 = 8;
    static final int METAisVar = 9;
    static final int METADiffWithRespToLen = 10;

    private static StringBuilder generateEquationFromMetaDOE(int[] meta) {
        int numTerms = 2;//rand.nextInt(0,15);//meta[METANUMTERMS];
        boolean useConst = useConstant(meta);
        String op2 = MetaOperator6(meta);
        
        boolean useParen = useParenthesis(meta);
        String op1 = Operator1(meta);
        boolean isVar = isVar(meta);
        int DiffLen = meta[METADiffWithRespToLen] - 1;
        if (isVar) {
            //DiffWithRespTo = generateAlphaName(true, false, DiffLen, 1);
            DiffWithRespTo = generateAlphaNameDefined(true, false, DiffLen, 1);
        } else {
            //DiffWithRespTo = generateAlphaName(true, false, 1, 1);
            DiffWithRespTo = generateAlphaNameDefined(true, false, 1, 1);
        }
        if (MyDebugVerboseFlag) {
            System.out.println("Hadammard:generateEquationFromMetaDOE:numTerms=" + numTerms + " useConst=" + useConst + " useParen=" + useParen);
        }
        List<String> terms = new ArrayList<>();
        terms.clear();
        for (int i = 0; i < numTerms; i++) {
            int rowIdx = meta[METAEquationNumber] - 1;
            String term = generateTermFromHadammardSimple(HadamardMatrix[rowIdx+i], numTerms,DiffWithRespTo);
            if (MyDebugVerboseFlagLowLevel) {
                System.out.println("Hadammard:generateEquationFromMetaDOE:term=" + term + " numTerms=" + numTerms + " i=" + i + " DiffWithRespTo=" + DiffWithRespTo);
            }
            //if (useParen) term = "(" + term + ")";
            if ( (term.startsWith("+"))||(term.startsWith("-")) )
                terms.add(term);
            else if (i==0)
                terms.add(term);
            else {
                term="+" + term;
                terms.add(term);
            }
        }
        System.out.println("terms:");
        terms.forEach(System.out::println);
        StringBuilder equation = new StringBuilder("");
        //equation=String.join(" " + op2 + " ", terms);
        equation.append(String.join(" " , terms));
        terms.clear();
        //if (useConst) equation += " + " + generateAlphaName(false, false, 2, 1);
        if (MyDebugVerboseFlag) {
            System.out.println("Hadammard:generateEquationFromMetaDOE:equation=" + equation + " DiffWithRespTo="+ DiffWithRespTo);
        }
        return equation;
    }

    public static boolean useConstant(int[] meta) {
        if (meta[METAUSECONST] == 1) {
            return false;
        } else if (meta[METAUSECONST] == 2) {
            return true;
        }
        return false;
    }

    public static boolean useParenthesis(int[] meta) {
        if (meta[METAPARENSTYLE] == 1) {
            return false;
        } else if (meta[METAPARENSTYLE] == 2) {
            return true;
        }
        return false;
    }

    public static String Operator1(int[] meta) {
        if (meta[METAOPERATOR1] == 1) {
            return equationOperators[0];
        } else if (meta[METAOPERATOR1] == 2) {
            return equationOperators[1];
        }
        return "";
    }

    public static String MetaOperator6(int[] meta) {
        if (meta[METAOPERATORIDX] == 1) {
            return equationOperators [0];
        } else if (meta[METAOPERATORIDX] == 2) {
            return equationOperators [1];
        }
        return "";
    }

    public static boolean isVar(int[] meta) {
        if (meta[METAisVar] == 1) {
            return false;
        } else if (meta[METAisVar] == 2) {
            return true;
        }
        return false;
    }

    //DataArray:Header:0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17
    //DataArray:Header(Name):_EquationNumber_0_500_ _EquationNumber_1_500_ isVar_2_2_ Coefficient_letters_3_100_ CONSTANTS_digits_4_5 
    //isIndConst_5_2_ indConstletters_6_9_ indConstdigits_7_5_ Exponent_IDX_8_100
    //Exponent_Sign_9_3_ Variable_Sign_10_3_ factorJoinOps_11_3_ ISCOMPLEX_12_2 
    //Operator3_13_2 Operator4_14_2 Operator5_15_2 DiffWithRespToLen_16_4 NumOfFactors_17_20
    // Column constants to make matrices self-documenting and safe
    private static final int DOECOLEquationNumber = 1;
    private static final int DOECOLISVAR = 2;
    private static final int DOECOLCOEFF_letters = 3;
    private static final int DOECOLCONSTANTS_digits = 4;
    private static final int DOECOLisIndConst = 5;
    private static final int DOECOLindConstletters = 6;
    private static final int DOECOLindConstdigits = 7;
    private static final int DOECOLEXP_IDX = 8; 
    private static final int DOECOLEXP_SIGN = 9;
    private static final int DOECOLVAR_SIGN = 10;
    private static final int DOECOLFACTORJOIN = 11;
    private static final int DOECOLISCOMPLEX = 12;
    private static final int DOECOLOperator3 = 13;
    private static final int DOECOLOperator4 = 14;
    private static final int DOECOLOperator5 = 15;
    private static final int DOECOLDiffWithRespToLen = 16;
    private static final int DOECOLNumOfFactors = 17;
    

    private static String generateTermFromHadammardComplex(int[] row, int NumOfTerms,String DiffWithRespTo) {
        if (row[DOECOLNumOfFactors] > 2){
            int rowIdx=row[DOECOLEquationNumber];
            String TermFactor="";
            for(int k=0;k <row[DOECOLNumOfFactors];k++)
                TermFactor= TermFactor + generateFactorsFromDOE(HadamardMatrix[rowIdx+k],NumOfTerms, DiffWithRespTo);
            return TermFactor;
        }
        int coeff = row[DOECOLCOEFF_letters];//coefficients1;//coefficients[row[0]];
        boolean isVar = isVarMethod(row);
        int letters = row[DOECOLCOEFF_letters];
        int digits = row[DOECOLCONSTANTS_digits];
        boolean isIndConst = isIndConstMethod(row);
        int indConstletters = row[DOECOLindConstletters];
        int indConstdigits = row[DOECOLindConstdigits];
        int exp = -1;
        if (Exp_Sign(row).equalsIgnoreCase("")) {
            exp = row[DOECOLEXP_IDX];
        } else {
            exp = -row[DOECOLEXP_IDX];
        }
        String preOp = preOpOperator(row);
        boolean isComplex = isComplexMethod(row);
        String op = Operator1(row);
        String Operator3 = Operator3(row);
        String Operator4 = Operator4(row);
        String Operator5 = Operator5(row);
        int DiffLen = row[DOECOLDiffWithRespToLen] - 1;
        String factorVar = "";
        String factor = "";
        String factor1 = "";
        if ((isVar) && (!DiffWithRespTo.equalsIgnoreCase(""))) {
            factorVar = DiffWithRespTo + "^" + row[DOECOLEXP_IDX];
        }
        if (isIndConst) {
            factor1 = generateAlphaNameDefined(isVar, isIndConst, letters, digits) + "^" + exp;
        }
        String factor4="";
        if (isComplex) {
            String nested = generateAlphaNameDefined(true, isIndConst, letters, digits) + "^" + row[DOECOLEXP_IDX];
            factor4 = factorVar + factor1 + Operator3 + nested;
        }
        if ((isVar)&&(!factorVar.equalsIgnoreCase("")) && (isIndConst) &&(!factor1.equalsIgnoreCase(""))&& (isComplex)&&(!factor4.equalsIgnoreCase(""))) {
            if (MyDebugVerboseFlagLowLevel) {
                System.out.println("Hadammard:COMPLEX:factorVar=" + factorVar + " factor=" + factor + " factor1=" + factor1 + " factor4=" + factor4 );
            }
            return preOp + coeff + Operator3 + factorVar + Operator5 + factor + Operator4 + factor4;
        }
        String Str1 = "";
        String Str2 = "";
        String Str3 = "";
        if ( (isVar) &&(!factorVar.equalsIgnoreCase("")) ){
            Str1 = Operator3 + factorVar;
        }
        if ( (isIndConst) &&(!factor.equalsIgnoreCase("") ) ){
            Str2 = Operator3 + factor;
        }
        if ( (isComplex)&& (!factor4.equalsIgnoreCase("") ) ){
            Str3 = Operator4 + factor4;
        }
        //coefficient only Term 
        if ( (isVar==false) && (isIndConst==false)){
            factor1 = generateAlphaNameDefined(isVar, isIndConst, letters, digits) + "^" + exp;
            Str2 = Operator3 + factor1;
        } 
//        if (!IndConstNamesList.contains(factor))
//            IndConstNamesList.add(factor);
//        if (!IndConstNamesList.contains(factor1))
//            IndConstNamesList.add(factor1);
        if (MyDebugVerboseFlagLowLevel) {
            System.out.print("Hadammard:Choice:row=");
            for (int i = 0; i < row.length; i++) {
                System.out.print(row[i] + " ");
            }
            System.out.print(System.lineSeparator());
            System.out.println("Hadammard:Choice:isVar=" + isVar + " isIndConst=" + isIndConst + " isComplex=" + isComplex);
            System.out.println("Hadammard:Choice:factorVar=" + factorVar + " factor=" + factor + " factor1=" + factor1 + " coeff=" + coeff);
        }
        //return preOp + coeff + Str1 + Str2 + Str3;
        Term1=coeff + Str1;
        Term2=Str2 + Str3;
        return preOp + Term1 + Term2;
    }

    public static boolean isVarMethod(int[] row) {
        if (row[DOECOLISVAR] == 1) {
            int RandBoolean = rand.nextInt(0,1);
            if(RandBoolean==0)
                return false;
            else
                return true;
        } else if (row[DOECOLISVAR] == 2) {
            int RandBoolean = rand.nextInt(0,1);
            if(RandBoolean==0)
                return false;
            else
                return true;
        }
        return false;
    }

    public static boolean isIndConstMethod(int[] row) {
        if (row[DOECOLisIndConst] == 1) {
            return false;
        } else if (row[DOECOLisIndConst] == 2) {
            return true;
        }
        return false;
    }

    public static String preOpOperator(int[] row) {
        if (row[DOECOLFACTORJOIN] == 1) {
            return equationOperators[0];
        } else if (row[DOECOLFACTORJOIN] == 2) {
            return equationOperators[1];
        }
        return "";
    }

    public static boolean isComplexMethod(int[] row) {
        if (row[DOECOLISCOMPLEX] == 1) {
            int RandBoolean = rand.nextInt(0,1);
            if(RandBoolean==0)
                return false;
            else
                return true;
        } else if (row[DOECOLISCOMPLEX] == 2) {
            int RandBoolean = rand.nextInt(0,1);
            if(RandBoolean==0)
                return false;
            else
                return true;
        }
        return false;
    }

    public static String Operator2(int[] row) {
        if (row[DOECOLFACTORJOIN] == 1) {
            return equationOperators[0];
        } else if (row[DOECOLFACTORJOIN] == 2) {
            return equationOperators[1];
        }
        return "";
    }

    public static String Operator3(int[] row) {
        if (row[DOECOLOperator3] == 1) {
            return factorOperator3[0];
        } else if (row[DOECOLOperator3] == 2) {
            return factorOperator3[1];
        } else if (row[DOECOLOperator3] == 3) {
            return factorOperator3[2];
        } else if (row[DOECOLOperator3] == 4) {
            return factorOperator3[3];
        }else if (row[DOECOLOperator3] == 5) {
            return factorOperator3[4];
        } else if (row[DOECOLOperator3] == 6) {
            return factorOperator3[5];
        }
        return "";
    }

    public static String Operator4(int[] row) {
        if (row[DOECOLOperator4] == 1) {
            return factorOperator3[0];
        } else if (row[DOECOLOperator4] == 2) {
            return factorOperator3[1];
        }else if (row[DOECOLOperator4] == 3) {
            return factorOperator3[2];
        } else if (row[DOECOLOperator4] == 4) {
            return factorOperator3[3];
        }else if (row[DOECOLOperator4] == 5) {
            return factorOperator3[4];
        } else if (row[DOECOLOperator4] == 6) {
            return factorOperator3[5];
        }
        return "";
    }

    public static String Operator5(int[] row) {
        if (row[DOECOLOperator4] == 1) {
            return factorOperator3[0];
        } else if (row[DOECOLOperator4] == 2) {
            return factorOperator3[1];
        }else if (row[DOECOLOperator4] == 3) {
            return factorOperator3[2];
        } else if (row[DOECOLOperator4] == 4) {
            return factorOperator3[3];
        }else if (row[DOECOLOperator4] == 5) {
            return factorOperator3[4];
        } else if (row[DOECOLOperator4] == 6) {
            return factorOperator3[5];
        }
        return "";
    }

    public static String Exp_Sign(int[] row) {
        if (row[DOECOLEXP_SIGN] == 1) {
            return "";
        } else if (row[DOECOLEXP_SIGN] == 2) {
            return "-";
        }
        return "";
    }
    public static String generateAlphaName1(boolean isVar, boolean isIndConst, int letters, int digits) {
        // Base letters: x, y, z
        char[] baseLetters = {'x', 'y', 'z'};
        // Base digits: 0,1,2,3,4,5,6,7,8,9
        char[] basedigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        StringBuilder sb = new StringBuilder();

        // Choose 1 or 2 base letters
        int letterCount = letters;
        for (int i = 0; i < letterCount; i++) {
            sb.append(baseLetters[i % baseLetters.length]);
        }

        // Optionally append a digit suffix (0–9)
        if (isIndConst) {
            for (int i = 0; i < digits; i++) {
                sb.append(basedigits[i % basedigits.length]);
            }
            //sb.append(rand.nextInt(2)); // Produces 0 or 1
            //IndConstNamesList.add(sb.toString());
        }

        return sb.toString(); // Examples: x, y, z, x0, xy, yz1, etc.
    }
    public static String generateAlphaNameDefined(boolean isVar, boolean isIndConst, int letters, int digits) {
        if (MyDebugVerboseFlagLowLevel) {
            System.out.println("Hadammard:generateAlphaNameDefined:Entered=");
        }
        List<String> terms = new ArrayList<>();
        terms.clear();
        terms.add(0,"n");
        terms.add(1,"x");
        terms.add(2,"y");
        terms.add(3,"z");    
        terms.add(4,"a");
        terms.add(5,"b");
        terms.add(6,"c");
        terms.add(7,"d");
        terms.add(8,"e");
        terms.add(9,"f");
        terms.add(10,"m");
        terms.add(11,"p");
        terms.add(12,"q");
        terms.add(13,"r");
        terms.add(14,"s");
        terms.add(15,"i");
        terms.add(16,"E1");
        terms.add(17,"ab");
        terms.add(18,"ac");
        terms.add(19,"ad");
        terms.add(20,"am");
        terms.add(21,"ap");
        terms.add(22,"aq");
        terms.add(23,"ar");
        terms.add(24,"as");
        terms.add(25,"ai");
        if (MyDebugVerboseFlagLowLevel) {
            System.out.println("Hadammard:generateAlphaNameDefined:terms:");
            terms.forEach(System.out::println);
        }
//        // Base letters: x, y, z
//        String[] baseLetters = {terms.get(0), terms.get(1), terms.get(2),terms.get(3),terms.get(4),terms.get(5),terms.get(6),terms.get(7),terms.get(8),terms.get(9)
//        ,terms.get(10), terms.get(11), terms.get(12),terms.get(13),terms.get(14),terms.get(15),terms.get(16),terms.get(17),terms.get(18),terms.get(19)
//        ,terms.get(20), terms.get(21), terms.get(22),terms.get(23),terms.get(24),terms.get(25),terms.get(16),terms.get(17),terms.get(18),terms.get(19)}; 
//        // Base digits: 0,1,2,3,4,5,6,7,8,9
        char[] basedigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        StringBuilder sb = new StringBuilder();

        // Choose 1 or 2 base letters
        int letterCount = letters;
        //for (int i = 0; i < letterCount; i++) {
            sb.append(terms.get(letterCount % 26));
        //}

        // Optionally append a digit suffix (0–9)
        if (isIndConst) {
            //for (int i = 0; i < letterCount; i++) {
                sb.append(terms.get(letterCount % basedigits.length));
            //}
            //sb.append(rand.nextInt(2)); // Produces 0 or 1
            //IndConstNamesList.add(sb.toString());
        }
        if (MyDebugVerboseFlagLowLevel)
            System.out.println("Hadammard:generateAlphaNameDefined:Defined Factor=" + sb.toString());
        return sb.toString(); // Examples: x, y, z, x0, xy, yz1, etc.
    }
public static boolean DupChecknInsertOld(String EqnUnderTest, String TestCase) {
        boolean DupFlag = false;
        int i = 0;
        String DupList = "";
        String[] TempDataStr = new String[3];
        MathsExpressionParser.Expression expValue = (() -> Double.NaN);
        MathsExpressionParser.Expression expValue1 = (() -> Double.NaN);
        SetVariablesAll();
        EqnUnderTest=eatAll(EqnUnderTest,' ');
        expValue = parse(EqnUnderTest, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
        double ExprnexpValue = 0;
        ExprnexpValue = expValue.eval();
        double DBExprnexpValue = 0;
        String Exprn = "";
        for (i = 0; (i < EqnDB.size()) && (!EqnDB.isEmpty()); i++) {
            String Temp = EqnDB.get(i);
            if ((Temp != null) && (!Temp.equalsIgnoreCase(""))) {
                TempDataStr = Temp.split("@");
            }
            if (TempDataStr.length >= 3) {
                Exprn = TempDataStr[2];
            }
            if ( (TempDataStr.length >= 3)&&(!Exprn.contains("@")) && (!Exprn.contains("TestCase"))&& (!Exprn.contains(":Dup with "))) {
                Exprn = eatAll(Exprn, ' ');
                SetVariablesAll();
                expValue1 = parse(Exprn, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
            }
            DBExprnexpValue= expValue1.eval();
            if ((EqnUnderTest != null) && (!EqnUnderTest.equalsIgnoreCase("")) && (Exprn != null)
                    && ( (Exprn.equalsIgnoreCase(EqnUnderTest)) )){//||(DBExprnexpValue == ExprnexpValue)) ) {
                DupFlag = true;
                String[] DataTemp = Temp.split("@");
                if ((Integer.parseInt(DataTemp[1])) > 100) {
                    DupList = DupList + ":" + Integer.parseInt(DataTemp[1]);
                }
                break;
            }
            DBExprnexpValue=Double.NaN;
        }
        if ((!EqnUnderTest.equalsIgnoreCase("")) && (((DupFlag == false) && (i == EqnDB.size())) || (EqnDB.isEmpty()) || (DupList.equalsIgnoreCase("")))) {
            //System.out.println("DupChecknInsert:Inserting TestCase=" + IndexHadamard + "@" + " TestCase:" + TestCase + "@" + " DupList=" + DupList + " EqnUnderTest=" + EqnUnderTest);
            EqnDB.put(i, "TestCase@" + IndexHadamard + "@" + " TestCase:" + TestCase + "@" + "@" + EqnUnderTest);
            EqnDBIndex++;
        } else if ((!EqnUnderTest.equalsIgnoreCase(""))) {
            //System.out.println(ConsoleColors.RED + "DupChecknInsert:Got DUP TestCase=" + IndexHadamard + "@" + " TestCase:" + TestCase + "@" + " DupList=" + DupList + " EqnUnderTest=" + EqnUnderTest + ConsoleColors.RESET);
            //System.out.println(ConsoleColors.RED + "DupChecknInsert:Got DUP TestCase=" + IndexHadamard + "@" + " TestCase:" + TestCase + "@" + " DupList=" + DupList + " Exprn=" + Exprn + ConsoleColors.RESET);
            EqnDB.put(EqnDBIndex, "TestCase@" + IndexHadamard + "@" + " TestCase:" + TestCase + "@" + ":Dup with " + DupList + ":");
            EqnDBDupCount++;
            EqnDBIndex++;
        }
        return DupFlag;
    }
public static boolean DupChecknInsert(String EqnUnderTest, String TestCase, String DiffWithRespTo) {
        boolean DupFlag = false;
        int i = 0;
        String DupList = "";
        String[] TempDataStr = new String[3];
        MathsExpressionParser.Expression expValue = (() -> Double.NaN);
        MathsExpressionParser.Expression expValue1 = (() -> Double.NaN);
        SetVariablesAll();
        expValue = parse(EqnUnderTest, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
        double ExprnexpValue = 0;
        ExprnexpValue = expValue.eval();
        double DBExprnexpValue = 0;
        for (i = 0; (i < EqnDB.size()) && (!EqnDB.isEmpty()); i++) {
            String Temp = EqnDB.get(i);
            if ((Temp != null) && (!Temp.equalsIgnoreCase(""))) {
                TempDataStr = Temp.split("@");
            }
            String Exprn = "";
            String ExprnDiffWithRespTo="";
            if (TempDataStr.length >= 4) {
                Exprn = TempDataStr[2];
                ExprnDiffWithRespTo= TempDataStr[3];
            }
            if ((TempDataStr.length >= 4)  && (!Exprn.contains("@:Dup with "))) {
                Exprn = eatAll(Exprn, ' ');
                SetVariablesAll();
                expValue1 = parse(Exprn, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
            }
            DBExprnexpValue = expValue1.eval();
            if ( (EqnUnderTest != null) && (!EqnUnderTest.equalsIgnoreCase("")) && (Exprn != null)
                    && ( ((Exprn.equalsIgnoreCase(EqnUnderTest)) &&(ExprnDiffWithRespTo.equalsIgnoreCase(DiffWithRespTo))))) { //&&(ExprnDiffWithRespTo.equalsIgnoreCase(DiffWithRespTo))) )) { 
                    //||((!ExprnDiffWithRespTo.equalsIgnoreCase(DiffWithRespTo))&&(DBExprnexpValue == ExprnexpValue)) ) ){
                DupFlag = true;
                String[] DataTemp = Temp.split("@");
                if ((Integer.parseInt(DataTemp[1])) > 100) {
                    DupList = DupList + ":" + Integer.parseInt(DataTemp[1]);
                }
            }
            DBExprnexpValue = Double.NaN;
        }
        if ((!EqnUnderTest.equalsIgnoreCase("")) && (((DupFlag == false) && (i == EqnDB.size())) || (EqnDB.isEmpty()) || (DupList.equalsIgnoreCase("")))) {
            System.out.println("DupChecknInsert:Inserting TestCase=" + TestCase + " DupList=" + DupList + " EqnUnderTest=" + EqnUnderTest);
            EqnDB.put(i, "TestCase@" + TestCase + "@" + EqnUnderTest + "@" + DiffWithRespTo);
            EqnDBIndex++;
        } else if ((!EqnUnderTest.equalsIgnoreCase(""))) {
            EqnDB.put(EqnDBIndex, "TestCase@" + TestCase + "@" + ":Dup with " + DupList + ":");
            EqnDBDupCount++;
            EqnDBIndex++;
        }
        return DupFlag;
    }
public static void MyScanfHdMeta(){
    String Path = "data\\";
        String msg = "";
        try {
            FileInputStream fpinputMETA = null;
            if ((fpinputMETA = new FileInputStream(Path + ConfigFileNameMETA)) == null) {
                msg = "Input: can't open " + Path + ConfigFileNameMETA;
                System.out.println(msg);
            }
            System.out.println("MyScanfMETA:Opened File Name: Infile=" + Path + ConfigFileNameMETA);
            BufferedReader din = new BufferedReader(new InputStreamReader(fpinputMETA));
            // READ THE COMMENTS
            din.readLine();
            din.readLine();
            din.readLine();
            metaHadamard=new int[(int)ROWSDOEMETA][(int)LengthMETA];
            for (int i=0; i < ROWSDOEMETA; i++){
                String Temp=din.readLine();
                if( (Temp != null) && (!Temp.equalsIgnoreCase("")) ) {
                Temp=Temp.replace("},", ",");
                Temp=Temp.replace("{", "");
                String[] TempData=Temp.split(",");
                //System.out.println("MyScanfMETA:Temp=" + Temp + " TempData.length=" + TempData.length);
                for (int j=0; j < LengthMETA; j++){
                    metaHadamard[i][j]=Integer.parseInt(TempData[j].trim());
                 }
                }
              }
            } catch (Exception HyperDOEse) {
            System.out.println(HyperDOEse.getStackTrace());
            System.out.println(HyperDOEse.getMessage());
            HyperDOEse.printStackTrace();
        }
}
public static void MyScanfHadamard(){
    String Path = "data\\";
        String msg = "";
        try {
            FileInputStream fpinputDOEMat = null;
            if ((fpinputDOEMat = new FileInputStream(Path + ConfigFileNameHadamardMat)) == null) {
                msg = "Input: can't open " + Path + ConfigFileNameHadamardMat;
                System.out.println(msg);
            }
            System.out.println("MyScanfDOE:Opened File Name: Infile=" + Path + ConfigFileNameHadamardMat);
            BufferedReader din = new BufferedReader(new InputStreamReader(fpinputDOEMat));
            // READ THE COMMENTS
            din.readLine();
            din.readLine();
            din.readLine();
            din.readLine();
            din.readLine();
            HadamardMatrix=new int[(int)ROWSDOEMat][(int)LengthDOEMat];
            for (int i=0; i < ROWSDOEMat; i++){
                String Temp=din.readLine();
                if( (Temp != null) && (!Temp.equalsIgnoreCase("")) ) {
                Temp=Temp.replace("},", ",");
                Temp=Temp.replace("{", "");
                String[] TempData=Temp.split(",");
                //System.out.println("MyScanfDOE:Temp=" + Temp + " TempData.length=" + TempData.length);
                for (int j=0; j < LengthDOEMat; j++){
                    HadamardMatrix[i][j]=Integer.parseInt(TempData[j].trim());
                 }
                }
              }
            } catch (Exception HyperDOEse) {
            System.out.println(HyperDOEse.getStackTrace());
            System.out.println(HyperDOEse.getMessage());
            HyperDOEse.printStackTrace();
        }
}  
public static String generateFactorsFromDOE(int[] row, int NumOfTerms,String DiffWithRespTo){
    int coeff = row[DOECOLCOEFF_letters];
        boolean isVar = isVarMethod(row);
        int letters = row[DOECOLCOEFF_letters];
        int digits = row[DOECOLCONSTANTS_digits];
        boolean isIndConst = isIndConstMethod(row);
        int indConstletters = row[DOECOLindConstletters];
        int indConstdigits = row[DOECOLindConstdigits];
        int exp = -1;
        if (Exp_Sign(row).equalsIgnoreCase("")) {
            exp = row[DOECOLEXP_IDX];
        } else {
            exp = -row[DOECOLEXP_IDX];
        }
        String preOp = preOpOperator(row);
        boolean isComplex = false;//isComplexMethod(row);
        String op = Operator1(row);
        String Operator3 = Operator3(row);
        String Operator4 = Operator4(row);
        String Operator5 = Operator5(row);
        int DiffLen = row[DOECOLDiffWithRespToLen] - 1;
        String factorVar = "";
        String factor = "";
        String factor1 = "";
        if ((isVar) && (!DiffWithRespTo.equalsIgnoreCase(""))) {
            factorVar = DiffWithRespTo + "^" + row[DOECOLEXP_IDX];
        }
        if (isIndConst) {
            factor1 = generateAlphaNameDefined(isVar, isIndConst, letters, digits) + "^" + exp;
        }
        String factor4="";
        if (isComplex) {
            String nested = generateAlphaNameDefined(true, isIndConst, letters, digits) + "^" + row[DOECOLEXP_IDX];
            factor4 = factorVar + factor1 + Operator3 + nested;
        }
        if ((isVar)&&(!factorVar.equalsIgnoreCase("")) && (isIndConst) &&(!factor1.equalsIgnoreCase(""))&& (isComplex)&&(!factor4.equalsIgnoreCase(""))) {
            if (MyDebugVerboseFlagLowLevel) {
                System.out.println("Hadammard:COMPLEX:factorVar=" + factorVar + " factor=" + factor + " factor1=" + factor1 + " factor4=" + factor4 );
            }
            return preOp + coeff + Operator3 + factorVar + Operator5 + factor + Operator4 + factor4;
        }
        String Str1 = "";
        String Str2 = "";
        String Str3 = "";
        if ( (isVar) &&(!factorVar.equalsIgnoreCase("")) ){
            Str1 = Operator3 + factorVar;
        }
        if ( (isIndConst) &&(!factor.equalsIgnoreCase("") ) ){
            Str2 = Operator3 + factor;
        }
        if ( (isComplex)&& (!factor4.equalsIgnoreCase("") ) ){
            Str3 = Operator4 + factor4;
        }
        //coefficient only Term 
        if ( (isVar==false) && (isIndConst==false)){
            //factor1 = generateAlphaName(isVar, isIndConst, letters, digits) + "^" + exp;
            factor1 = generateAlphaNameDefined(isVar, isIndConst, letters, digits) + "^" + exp;
            Str2 = Operator3 + factor1;
        } 
//        if (!IndConstNamesList.contains(factor))
//            IndConstNamesList.add(factor);
//        if (!IndConstNamesList.contains(factor1))
//            IndConstNamesList.add(factor1);
        if (MyDebugVerboseFlagLowLevel) {
            System.out.print("Hadammard:Choice:row=");
            for (int i = 0; i < row.length; i++) {
                System.out.print(row[i] + " ");
            }
            System.out.print(System.lineSeparator());
            System.out.println("Hadammard:Choice:isVar=" + isVar + " isIndConst=" + isIndConst + " isComplex=" + isComplex);
            System.out.println("Hadammard:Choice:factorVar=" + factorVar + " factor=" + factor + " factor1=" + factor1 + " coeff=" + coeff);
        }
        return preOp + coeff + Str1 + Str2 + Str3;
}
private static String generateTermFromHadammardSimple(int[] row, int NumOfTerms,String DiffWithRespTo) {
     int numFactors=3;
        if ((row[DOECOLNumOfFactors] > 2)||( NumOfTerms <= 2)){
            int rowIdx=row[DOECOLEquationNumber];
            List<String> factors = new ArrayList<>();
            String TermFactor="";
            for (int k = 1; k < numFactors /*row[DOECOLNumOfFactors]*/; k++) {
                TermFactor = generateFactorsFromHadammardSimple(HadamardMatrix[rowIdx + k], numFactors, DiffWithRespTo);
                System.out.println("generateTermFromHadammardSimple:TermFactor=" + TermFactor);
                if ((TermFactor.startsWith("+")) || (TermFactor.startsWith("-"))) {
                    factors.add(TermFactor);
                } else if (k == 1) {
                    factors.add(TermFactor);
                } else {
                    TermFactor = "+" + TermFactor;
                    factors.add(TermFactor);
                }
            }
            StringBuilder equation = new StringBuilder("");
            equation.append(String.join(" " , factors));
            factors.clear();
            return equation.toString();
        }
        int coeff = row[DOECOLCOEFF_letters];//coefficients1;//coefficients[row[0]];
        boolean isVar = isVarMethod(row);
        int letters = row[DOECOLCOEFF_letters];
        int digits = row[DOECOLCONSTANTS_digits];
        boolean isIndConst = isIndConstMethod(row);
        int indConstletters = row[DOECOLindConstletters];
        int indConstdigits = row[DOECOLindConstdigits];
        int exp = -1;
        if (Exp_Sign(row).equalsIgnoreCase("")) {
            exp = row[DOECOLEXP_IDX];
        } else {
            exp = -row[DOECOLEXP_IDX];
        }
        String preOp = preOpOperator(row);
        boolean isComplex = isComplexMethod(row);
        String op = Operator1(row);
        String Operator3 = Operator3(row);
        String Operator4 = Operator4(row);
        String Operator5 = Operator5(row);
        int DiffLen = row[DOECOLDiffWithRespToLen] - 1;
        String factorVar = "";
        String factor = "";
        String factor1 = "";
        if ((isVar) && (!DiffWithRespTo.equalsIgnoreCase(""))) {
            factorVar = DiffWithRespTo + "^" + row[DOECOLEXP_IDX];
        }
        if (isIndConst) {
            factor1 = generateAlphaNameDefined(isVar, isIndConst, letters, digits) + "^" + exp;
        }
        String factor4="";
        if (isComplex) {
            String nested = generateAlphaNameDefined(true, isIndConst, letters, digits) + "^" + row[DOECOLEXP_IDX];
            factor4 = factorVar + factor1 + Operator3 + nested;
        }
        if ((isVar)&&(!factorVar.equalsIgnoreCase("")) && (isIndConst) &&(!factor1.equalsIgnoreCase(""))&& (isComplex)&&(!factor4.equalsIgnoreCase(""))) {
            if (MyDebugVerboseFlagLowLevel) {
                System.out.println("Hadammard:COMPLEX:factorVar=" + factorVar + " factor=" + factor + " factor1=" + factor1 + " factor4=" + factor4 );
            }
            return preOp + coeff + Operator3 + factorVar + Operator5 + factor + Operator4 + factor4;
        }
        String Str1 = "";
        String Str2 = "";
        String Str3 = "";
        if ( (isVar) &&(!factorVar.equalsIgnoreCase("")) ){
            Str1 = Operator3 + factorVar;
        }
        if ( (isIndConst) &&(!factor.equalsIgnoreCase("") ) ){
            Str2 = Operator3 + factor;
        }
        if ( (isComplex)&& (!factor4.equalsIgnoreCase("") ) ){
            Str3 = Operator4 + factor4;
        }
        //coefficient only Term 
        if ( (isVar==false) && (isIndConst==false)){
            factor1 = generateAlphaNameDefined(isVar, isIndConst, letters, digits) + "^" + exp;
            Str2 = Operator3 + factor1;
        } 
//        if (!IndConstNamesList.contains(factor))
//            IndConstNamesList.add(factor);
//        if (!IndConstNamesList.contains(factor1))
//            IndConstNamesList.add(factor1);
        if (MyDebugVerboseFlagLowLevel) {
            System.out.print("Hadammard:Choice:row=");
            for (int i = 0; i < row.length; i++) {
                System.out.print(row[i] + " ");
            }
            System.out.print(System.lineSeparator());
            System.out.println("Hadammard:Choice:isVar=" + isVar + " isIndConst=" + isIndConst + " isComplex=" + isComplex);
            System.out.println("Hadammard:Choice:factorVar=" + factorVar + " factor=" + factor + " factor1=" + factor1 + " coeff=" + coeff);
        }
        //return preOp + coeff + Str1 + Str2 + Str3;
        Term1=coeff + Str1;
        Term2=Str2 + Str3;
        return preOp + Term1 + Term2;
    }
public static String generateFactorsFromHadammardSimple(int[] row, int NumOfTerms,String DiffWithRespTo){
    int coeff = rand.nextInt(1, row[DOECOLCOEFF_letters]);//row[DOECOLCOEFF_letters];
        boolean isVar = isVarMethod(row);
        int letters = row[DOECOLCOEFF_letters];
        int digits = row[DOECOLCONSTANTS_digits];
        boolean isIndConst = isIndConstMethod(row);
        int indConstletters = row[DOECOLindConstletters];
        int indConstdigits = row[DOECOLindConstdigits];
        int exp = -1;
        if (Exp_Sign(row).equalsIgnoreCase("")) {
            exp = row[DOECOLEXP_IDX];
        } else {
            exp = -row[DOECOLEXP_IDX];
        }
        String preOp = preOpOperator(row);
        boolean isComplex = false;//isComplexMethod(row);
        String op = Operator1(row);
        String Operator3 = Operator3(row);
        String Operator4 = Operator4(row);
        String Operator5 = Operator5(row);
        int DiffLen = row[DOECOLDiffWithRespToLen] - 1;
        String factorVar = "";
        String factor = "";
        String factor1 = "";
        if ((isVar) && (!DiffWithRespTo.equalsIgnoreCase(""))) {
            factorVar = DiffWithRespTo + "^" + row[DOECOLEXP_IDX];
        }
        if (isIndConst) {
            factor1 = generateAlphaNameDefined(isVar, isIndConst, letters, digits) + "^" + exp;
        }
        String factor4="";
        if (isComplex) {
            String nested = generateAlphaNameDefined(true, isIndConst, letters, digits) + "^" + row[DOECOLEXP_IDX];
            factor4 = factorVar + factor1 + Operator3 + nested;
        }
        if ((isVar)&&(!factorVar.equalsIgnoreCase("")) && (isIndConst) &&(!factor1.equalsIgnoreCase(""))&& (isComplex)&&(!factor4.equalsIgnoreCase(""))) {
            if (MyDebugVerboseFlagLowLevel) {
                System.out.println("Hadammard:COMPLEX:factorVar=" + factorVar + " factor=" + factor + " factor1=" + factor1 + " factor4=" + factor4 );
            }
            return preOp + coeff + Operator3 + factorVar + Operator5 + factor + Operator4 + factor4;
        }
        String Str1 = "";
        String Str2 = "";
        String Str3 = "";
        if ( (isVar) &&(!factorVar.equalsIgnoreCase("")) ){
            Str1 = Operator3 + factorVar;
        }
        if ( (isIndConst) &&(!factor.equalsIgnoreCase("") ) ){
            Str2 = Operator3 + factor;
        }
        if ( (isComplex)&& (!factor4.equalsIgnoreCase("") ) ){
            Str3 = Operator4 + factor4;
        }
        //coefficient only Term 
        if ( (isVar==false) && (isIndConst==false)){
            //factor1 = generateAlphaName(isVar, isIndConst, letters, digits) + "^" + exp;
            factor1 = generateAlphaNameDefined(isVar, isIndConst, letters, digits) + "^" + exp;
            Str2 = Operator3 + factor1;
        } 
//        if (!IndConstNamesList.contains(factor))
//            IndConstNamesList.add(factor);
//        if (!IndConstNamesList.contains(factor1))
//            IndConstNamesList.add(factor1);
        if (MyDebugVerboseFlagLowLevel) {
            System.out.print("Hadammard:Choice:row=");
            for (int i = 0; i < row.length; i++) {
                System.out.print(row[i] + " ");
            }
            System.out.print(System.lineSeparator());
            System.out.println("Hadammard:Choice:isVar=" + isVar + " isIndConst=" + isIndConst + " isComplex=" + isComplex);
            System.out.println("Hadammard:Choice:factorVar=" + factorVar + " factor=" + factor + " factor1=" + factor1 + " coeff=" + coeff);
        }
        return preOp + coeff + Str1 + Str2 + Str3;
}
}
