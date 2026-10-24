/*
CC0 1.0 Universal (CC0 1.0) Public Domain Dedication

To the extent possible under law, the author(s) have dedicated all copyright
and related rights to this software to the public domain worldwide. This
software is distributed without any warranty.

You may copy, modify, distribute, and perform the work, even for commercial
purposes, all without asking permission.

For more information, see <https://creativecommons.org/publicdomain/zero/1.0/>
*/
package JavaCalculusTestHarness;

import Calculus.ConsoleColors;
import Calculus.MathsExpressionParser;
import static Calculus.MathsExpressionParser.eatAll;
import static Calculus.MathsExpressionParser.parse;
import static Calculus.MathsContxtLAv.variables;
import static Calculus.UsageCalculus.EqnDB;
import static Calculus.UsageCalculus.EqnDBDupCount;
import static Calculus.UsageCalculus.EqnDBIndex;
import static Calculus.UsageCalculus.SetVariablesAll;
import static JavaCalculusTestHarness.SymbolicTestCaseGeneratorDOE.Index;
import static JavaCalculusTestHarness.SymbolicTestCaseGeneratorDOE.MyDebugVerboseFlag;
import static JavaCalculusTestHarness.SymbolicTestCaseGeneratorDOE.DupFlag;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Rajesh V Pai
 */
public class FisherClassDOETrial2 {

    public static final String[] JOIN_OP_MAP = {
        "", // 0: No operator
        "*", // 1: Multiplication
        "/", // 2: Division
        "*-", // 3: Multiplication with negation
        "/-", // 4: Division with negation
        "*+", // 5: Multiplication with positive emphasis
        "/+" // 6: Division with positive emphasis
    };
    public static String EquationComment = "";

    public class ColumnIndex {

        // ─── Equation Metadata ─────────────────────────────
        public static final int EQUATION_NUMBER_0 = 0;
        public static final int EQUATION_NUMBER_1 = 1;
        public static final int EQUATION_FAMILY_ID = 24;
        public static final int AUDIT_TRAIL_FLAG = 23;

        // ─── Term Structure ────────────────────────────────
        public static final int NUM_OF_TERMS = 2;
        public static final int NUM_OF_FACTORS_PER_TERM = 3;
        public static final int TERM_SIGN = 5;
        public static final int TERM_ROLE = 6;

        // ─── Coefficient Properties ────────────────────────
        public static final int COEFF_TYPE = 7;
        public static final int COEFF_SIGN = 8;
        public static final int COEFF_MAGNITUDE = 9;
        public static final int COEFF_NOISE_FLAG = 10;

        // ─── Variable Properties ───────────────────────────
        public static final int IS_VAR = 11;
        public static final int VAR_LETTERS = 12;
        public static final int VAR_DIGITS = 13;
        public static final int VAR_STYLE = 14;
        public static final int VAR_SIGN = 15;
        public static final int VAR_NOISE_INJECTION = 16;

        // ─── Exponent Properties ───────────────────────────
        public static final int EXP_TYPE = 17;
        public static final int EXP_MAGNITUDE = 18;
        public static final int EXP_STYLE = 19;
        public static final int EXP_NOISE_FLAG = 20;

        // ─── Join Operator Properties ──────────────────────
        public static final int JOIN_OP_IDX = 21;
        public static final int JOIN_OP_STYLE = 22;
        public static final int JOIN_OP_AMBIGUITY_FLAG = 23; // overlaps with AUDIT_TRAIL_FLAG

        // ─── Function Wrapping ─────────────────────────────
        public static final int FUNC_WRAP_IDX = 24;
        public static final int FUNC_WRAP_DEPTH = 25;
        public static final int FUNC_WRAP_NOISE_FLAG = 26;
        public static final int FUNC_WRAP_COMPOSITION_STYLE = 27;

        // ─── Symbolic Metrics ──────────────────────────────
        public static final int SYMBOLIC_ENTROPY = 28;
        public static final int MOTIF_TAG_ID = 29;
        public static final int OBFUSCATION = 30;

        // ─── Independent Constant Section ──────────────────
        public static final int IND_CONST_PRESENCE_FLAG = 10;
        public static final int IND_CONST_LETTERS = 11;
        public static final int IND_CONST_DIGITS = 12;
        public static final int IND_CONST_STYLE = 13;
        public static final int IND_CONST_ALIAS_ID = 14;
        public static final int IND_CONST_REUSE_MODE = 15;
        public static final int IND_CONST_NOISE_INJECTION = 16;
        public static final int IND_CONST_SCOPE_TAG = 17;
        public static final int IND_CONST_ENTROPY_SCORE = 18;
        public static final int IND_CONST_MOTIF_TAG = 19;

        // ─── Term-Level Motif ──────────────────────────────
        public static final int TERM_MOTIF_TAG = 25;

        // ─── Reuse and Redundancy ──────────────────────────
        public static final int SYMBOL_REUSE = 20;
        public static final int JOIN_OP_REDUNDANCY = 19; // if present
        public static final int JOIN_OP_ALIAS_ID = 20; // if present
        public static final int FUNC_WRAP_ALIAS_ID = 25; // if present

        // ─── Variance Columns (if used) ────────────────────
        public static final int VARIANCE_1 = 31;
        public static final int VARIANCE_2 = 32;
    }

    public class DOEMatrixIndex {

        // ─── Equation Metadata ─────────────────────────────
        public static final int EQUATION_NUMBER_0 = 0;
        public static final int EQUATION_NUMBER_1 = 1;
        public static final int EQUATION_FAMILY_ID = 24;
        public static final int AUDIT_TRAIL_FLAG = 23;

        // ─── Term Structure ────────────────────────────────
        public static final int NUM_OF_TERMS = 2;
        public static final int NUM_OF_FACTORS_PER_TERM = 3;

        // ─── Differential & Integral Properties ─────────────
        public static final int DIFF_WITH_RESP_TO_LEN = 4;
        public static final int MAX_DIFF_ORDER = 5;
        public static final int MAX_INTEGRE_ORDER = 6;
        public static final int DIFF_STRESS_PROFILE = 7;
        public static final int INTEGRE_STRESS_PROFILE = 8;

        // ─── Canonical & Constant Flags ─────────────────────
        public static final int CANONICAL_FLAG = 9;
        public static final int IND_CONST_PRESENCE_FLAG = 10;

        // ─── Independent Constant Properties ────────────────
        public static final int IND_CONST_LETTERS = 11;
        public static final int IND_CONST_DIGITS = 12;
        public static final int IND_CONST_STYLE = 13;
        public static final int IND_CONST_ALIAS_ID = 14;
        public static final int IND_CONST_REUSE_MODE = 15;
        public static final int IND_CONST_NOISE_INJECTION = 16;
        public static final int IND_CONST_SCOPE_TAG = 17;
        public static final int IND_CONST_ENTROPY_SCORE = 18;
        public static final int IND_CONST_MOTIF_TAG = 19;

        // ─── Symbolic Metrics ───────────────────────────────
        public static final int SYMBOL_REUSE = 20;
        public static final int SYMBOLIC_ENTROPY = 21;
        public static final int MOTIF_TAG_ID = 22;
        public static final int TERM_MOTIF_TAG = 25;

        // ─── Obfuscation & Variance ─────────────────────────
        public static final int OBFUSCATION = 30;
        public static final int VARIANCE_1 = 31;
        public static final int VARIANCE_2 = 32;
    }

    public class DOEFactorMatrixIndex {

        // ─── Equation Metadata ─────────────────────────────
        public static final int EQUATION_NUMBER_0 = 0;
        public static final int EQUATION_NUMBER_1 = 1;

        // ─── Coefficient Properties ────────────────────────
        public static final int COEFF_TYPE = 2;
        public static final int COEFF_SIGN = 3;
        public static final int COEFF_MAGNITUDE = 4;
        public static final int COEFF_NOISE_FLAG = 5;

        // ─── Variable Properties ───────────────────────────
        public static final int IS_VAR = 6;
        public static final int VAR_LETTERS = 7;
        public static final int VAR_DIGITS = 8;
        public static final int VAR_STYLE = 9;
        public static final int VAR_SIGN = 10;
        public static final int VAR_NOISE_INJECTION = 11;

        // ─── Exponent Properties ───────────────────────────
        public static final int EXP_TYPE = 12;
        public static final int EXP_MAGNITUDE = 13;
        public static final int EXP_STYLE = 14;
        public static final int EXP_NOISE_FLAG = 15;

        // ─── Join Operator Properties ──────────────────────
        public static final int JOIN_OP_IDX = 16;
        public static final int JOIN_OP_STYLE = 17;
        public static final int JOIN_OP_AMBIGUITY_FLAG = 18;
        public static final int JOIN_OP_REDUNDANCY = 19;
        public static final int JOIN_OP_ALIAS_ID = 20;

        // ─── Function Wrapping ─────────────────────────────
        public static final int FUNC_WRAP_IDX = 21;
        public static final int FUNC_WRAP_DEPTH = 22;
        public static final int FUNC_WRAP_NOISE_FLAG = 23;
        public static final int FUNC_WRAP_COMPOSITION_STYLE = 24;
        public static final int FUNC_WRAP_ALIAS_ID = 25;

        // ─── Factor Role & Symbolic Metrics ────────────────
        public static final int FACTOR_ROLE = 26;
        public static final int SYMBOL_REUSE = 27;
        public static final int SYMBOLIC_ENTROPY = 28;
        public static final int MOTIF_TAG_ID = 29;
        public static final int OBFUSCATION = 30;
    }
    private static int[][] metaDOE = null;
    private static int[][] DOEMatrix = null;
    private static int[][] DOEFactorMatrix = null;
    public static String ConfigFileNameMETA = "meta_DOETrial2.txt";//
    public static long LengthMETA = 32;// Length (Number of Signal Columns of Orthogonal Matrix)
    public static long ROWSDOEMETA = 2000;
    public static String ConfigFileNameDOEMat = "DOEMatrixTrial2.txt";//
    public static long LengthDOEMat = 31;// Length (Number of Signal Columns of Orthogonal Matrix)
    public static long ROWSDOEMat = 2000;
    public static String ConfigFileNameFactorMat = "DOEFactorMatrixTrial2.txt";//
    public static long LengthFactor = 31;// Length (Number of Signal Columns of Orthogonal Matrix)
    public static long ROWSDOEFactor = 2000;
    public static String DiffWithRespTo = "x";
    static String[] factorOperator3 = {"*-", "/-", "*+", "/+", "*", "/"};
    static String[] equationOperators = {"+", "-"};

    public static String generateAlphaName(boolean isVar, boolean isIndConst, int letters, int digits, String DiffWithRespTo, boolean isTail) {
        // Base letters: x, y, z
        char[] baseLetters = {'x', 'y', 'z', 'a', 'b', 'c', 'p', 'q'};
        // Base digits: 0,1,2,3,4,5,6,7,8,9
        char[] basedigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        StringBuilder sb = new StringBuilder();

        
// Optionally append a digit suffix (0–9)
        if (isTail){
            sb.append(DiffWithRespTo);
        }else if ( (isVar) && (!DiffWithRespTo.equalsIgnoreCase("")) ) {
            sb.append(DiffWithRespTo + "^" + digits);
            if (MyDebugVerboseFlag) {
                System.out.println("generateAlphaName:FSM1:sb.toString()=" + sb.toString() + " DiffWithRespTo=" + DiffWithRespTo);
            }
        }else if ((isVar) && (DiffWithRespTo.equalsIgnoreCase(""))) {
            // Choose 1 or 2 base letters
            int letterCount = letters;
            for (int i = 0; i < letterCount; i++) {
                sb.append(baseLetters[i % baseLetters.length]);
            }
            if (MyDebugVerboseFlag) {
                System.out.println("generateAlphaName:FSM2:sb.toString()=" + sb.toString() + " DiffWithRespTo=" + DiffWithRespTo);
            }
        }else if (DiffWithRespTo.equalsIgnoreCase("")) {
            // Choose 1 or 2 base letters
            int letterCount = letters;
            for (int i = 0; i < letterCount; i++) {
                sb.append(baseLetters[i % baseLetters.length]);
            }
            if (MyDebugVerboseFlag) {
                System.out.println("generateAlphaName:FSM3:sb.toString()=" + sb.toString() + " DiffWithRespTo=" + DiffWithRespTo);
            }
        }else if ( (isIndConst)&&(isVar==false)&&(!DiffWithRespTo.equalsIgnoreCase("")) ) { // Optionally append a digit suffix (0–9)
                    int letterCount = letters;
            for (int i = 0; i < letterCount; i++) {
                sb.append(baseLetters[i % baseLetters.length]);
            }
            for (int i = 0; i < digits; i++) {
                sb.append(basedigits[i % basedigits.length]);
            }
            //sb.append(rand.nextInt(2)); // Produces 0 or 1
            //.add(sb.toString());
            if (MyDebugVerboseFlag) {
                System.out.println("generateAlphaName:IndConst:FSM1:sb.toString()=" + sb.toString() + " DiffWithRespTo=" + DiffWithRespTo);
            }
        }else if ( (isIndConst)) {
            int letterCount = letters;
            for (int i = 0; i < letterCount; i++) {
                sb.append(baseLetters[i % baseLetters.length]);
            }
            for (int i = 0; i < digits; i++) {
                sb.append(basedigits[i % basedigits.length]);
            }
            //sb.append(rand.nextInt(2)); // Produces 0 or 1
            //IndConstNamesList.add(sb.toString());
            if (MyDebugVerboseFlag) {
                System.out.println("generateAlphaName:IndConst:FSM2:sb.toString()=" + sb.toString() + " DiffWithRespTo=" + DiffWithRespTo);
            }
        }
if (MyDebugVerboseFlag) {
                System.out.println("generateAlphaName:Return Value:sb.toString()=" + sb.toString() + " DiffWithRespTo=" + DiffWithRespTo);
            }
        return sb.toString(); // Examples: x, y, z, x0, xy, yz1, etc.
    }

    public static boolean DupChecknInsert(String EqnUnderTest, String TestCase) {
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
            if ((TempDataStr.length >= 3) && (!Exprn.contains("@")) && (!Exprn.contains("TestCase")) && (!Exprn.contains(":Dup with "))) {
                Exprn = eatAll(Exprn, ' ');
                SetVariablesAll();
                expValue1 = parse(Exprn, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
            }
            DBExprnexpValue = expValue1.eval();
            if ((EqnUnderTest != null) && (!EqnUnderTest.equalsIgnoreCase("")) && (Exprn != null)
                    && ((Exprn.equalsIgnoreCase(EqnUnderTest)))) {//||(DBExprnexpValue == ExprnexpValue)) ) {
                DupFlag = true;
                String[] DataTemp = Temp.split("@");
                if ((Integer.parseInt(DataTemp[1])) > 100) {
                    DupList = DupList + ":" + Integer.parseInt(DataTemp[1]);
                }
                break;
            }
            DBExprnexpValue = Double.NaN;
        }
        if ((!EqnUnderTest.equalsIgnoreCase("")) && (((DupFlag == false) && (i == EqnDB.size())) || (EqnDB.isEmpty()) || (DupList.equalsIgnoreCase("")))) {
            System.out.println("DupChecknInsert:Inserting TestCase=" + Index + "@" + " TestCase:" + TestCase + "@" + " DupList=" + DupList + " EqnUnderTest=" + EqnUnderTest);
            EqnDB.put(i, "TestCase@" + Index + "@" + " TestCase:" + TestCase + "@" + EqnUnderTest);
            EqnDBIndex++;
        } else if ((!EqnUnderTest.equalsIgnoreCase(""))) {
            System.out.println(ConsoleColors.RED + "DupChecknInsert:Got DUP TestCase=" + Index + "@" + " TestCase:" + TestCase + "@" + " DupList=" + DupList + " EqnUnderTest=" + EqnUnderTest + ConsoleColors.RESET);
            System.out.println(ConsoleColors.RED + "DupChecknInsert:Got DUP TestCase=" + Index + "@" + " TestCase:" + TestCase + "@" + " DupList=" + DupList + " Exprn=" + Exprn + ConsoleColors.RESET);
            EqnDB.put(EqnDBIndex, "TestCase@" + Index + "@" + " TestCase:" + TestCase + "@" + ":Dup with " + DupList + ":");
            EqnDBDupCount++;
            EqnDBIndex++;
        }
        return DupFlag;
    }

    public static void MyScanfMETA() {
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
//            din.readLine();
//            din.readLine();
            metaDOE = new int[(int) ROWSDOEMETA][(int) LengthMETA];
            for (int i = 0; i < ROWSDOEMETA; i++) {
                String Temp = din.readLine();
                if ((Temp != null) && (!Temp.equalsIgnoreCase(""))) {
                    Temp = Temp.replace("},", ",");
                    Temp = Temp.replace("{", "");
                    String[] TempData = Temp.split(",");
                    //System.out.println("MyScanfMETA:Temp=" + Temp + " TempData.length=" + TempData.length);
                    for (int j = 0; (j < LengthMETA) && (j < TempData.length) && (LengthMETA <= TempData.length); j++) {
                        metaDOE[i][j] = Integer.parseInt(TempData[j].trim());
                    }
                }
            }
            if (MyDebugVerboseFlag) {
                System.out.println("MyScanfMETA:meta=" + Arrays.toString(metaDOE[0]));
            }
        } catch (Exception HyperDOEse) {
            System.out.println(HyperDOEse.getStackTrace());
            System.out.println(HyperDOEse.getMessage());
            HyperDOEse.printStackTrace();
        }
    }

    public static void MyScanfDOE() {
        String Path = "data\\";
        String msg = "";
        try {
            FileInputStream fpinputDOEMat = null;
            if ((fpinputDOEMat = new FileInputStream(Path + ConfigFileNameDOEMat)) == null) {
                msg = "Input: can't open " + Path + ConfigFileNameDOEMat;
                System.out.println(msg);
            }
            System.out.println("MyScanfDOE:Opened File Name: Infile=" + Path + ConfigFileNameDOEMat);
            BufferedReader din = new BufferedReader(new InputStreamReader(fpinputDOEMat));
//            // READ THE COMMENTS
//            din.readLine();
//            din.readLine();
//            din.readLine();
//            din.readLine();
//            din.readLine();
            DOEMatrix = new int[(int) ROWSDOEMat][(int) LengthDOEMat];
            for (int i = 0; i < ROWSDOEMat; i++) {
                String Temp = din.readLine();
                if ((Temp != null) && (!Temp.equalsIgnoreCase(""))) {
                    Temp = Temp.replace("},", ",");
                    Temp = Temp.replace("{", "");
                    String[] TempData = Temp.split(",");
                    //System.out.println("MyScanfDOE:Temp=" + Temp + " TempData.length=" + TempData.length);
                    for (int j = 0; (j < LengthDOEMat) && (j < TempData.length) && (LengthDOEMat <= TempData.length); j++) {
                        DOEMatrix[i][j] = Integer.parseInt(TempData[j].trim());
                    }
                }
            }
            if (MyDebugVerboseFlag) {
                System.out.println("MyScanfDOE:DOEMatrix=" + Arrays.toString(DOEMatrix[0]));
            }
        } catch (Exception HyperDOEse) {
            System.out.println(HyperDOEse.getStackTrace());
            System.out.println(HyperDOEse.getMessage());
            HyperDOEse.printStackTrace();
        }
    }

    public static void MyScanfFactorDOE() {
        String Path = "data\\";
        String msg = "";
        try {
            FileInputStream fpinputMETA = null;
            if ((fpinputMETA = new FileInputStream(Path + ConfigFileNameFactorMat)) == null) {
                msg = "Input: can't open " + Path + ConfigFileNameFactorMat;
                System.out.println(msg);
            }
            System.out.println("MyScanfFactorDOE:Opened File Name: Infile=" + Path + ConfigFileNameFactorMat);
            BufferedReader din = new BufferedReader(new InputStreamReader(fpinputMETA));
//            // READ THE COMMENTS
//            din.readLine();
//            din.readLine();
//            din.readLine();
            DOEFactorMatrix = new int[(int) ROWSDOEFactor][(int) LengthFactor];
            for (int i = 0; i < ROWSDOEFactor; i++) {
                String Temp = din.readLine();
                if ((Temp != null) && (!Temp.equalsIgnoreCase(""))) {
                    Temp = Temp.replace("},", ",");
                    Temp = Temp.replace("{", "");
                    String[] TempData = Temp.split(",");
                    //System.out.println("MyScanfFactorDOE:Temp=" + Temp + " TempData.length=" + TempData.length);
                    for (int j = 0; (j < LengthFactor) && (j < TempData.length) && (LengthFactor <= TempData.length); j++) {
                        DOEFactorMatrix[i][j] = Integer.parseInt(TempData[j].trim());
                    }
                }
            }
            if (MyDebugVerboseFlag) {
                System.out.println("MyScanfFactorDOE:DOEFactorMatrix=" + Arrays.toString(DOEFactorMatrix[0]));
            }
        } catch (Exception HyperDOEse) {
            System.out.println(HyperDOEse.getStackTrace());
            System.out.println(HyperDOEse.getMessage());
            HyperDOEse.printStackTrace();
        }
    }

    public static String generateEquations(int Index, int NumOfEquations, long caseStart) {
        String equations = "";
        String equationsTail = "";
        if (Index == 0) {
            MyScanfMETA();
            MyScanfDOE();
            MyScanfFactorDOE();
        }
        int[] metaRow = metaDOE[Index];
        //for (int[] metaRow : metaDOE) { //metaDOE) {
        if (MyDebugVerboseFlag) {
            System.out.println("generateEquations:DiffWithRespTo=" + DiffWithRespTo + " TestCase(Index)=" + Index);
        }
        if (MyDebugVerboseFlag) {
            System.out.println("generateEquationFromMetaDOE:meta=" + Arrays.toString(metaRow));
        }

        equations = generateEquationFromMetaDOE(metaRow);
        equationsTail=generateTailFromMetaDOE(metaRow);
        equations = equations + equationsTail;
        DupFlag = DupChecknInsert(equations,""+caseStart);
        equations = equations + "@DiffWithRespTo@" + DiffWithRespTo;

        if (MyDebugVerboseFlag) {
            System.out.println("generateEquations:equations=" + equations);
        }

        //}
        return equations;
    }

    private static String generateEquationFromMetaDOE(int[] meta) {
        if (meta == null || DOEMatrix == null || DOEFactorMatrix == null) {
            return "";
        }
        if (MyDebugVerboseFlag) {
            System.out.println("generateEquationFromMetaDOE:meta=" + Arrays.toString(meta));
        }
        int diffLen = Math.max(1, meta[DOEMatrixIndex.DIFF_WITH_RESP_TO_LEN]);
        boolean isVar = (meta[ColumnIndex.IS_VAR] == 1);
        if (MyDebugVerboseFlag) {
            System.out.println("generateEquationFromMetaDOE:Default:DiffWithRespTo=" + DiffWithRespTo + " diffLen=" + diffLen);
        }
        DiffWithRespTo = generateAlphaName(true, false, diffLen, 1, "",false);
        if (MyDebugVerboseFlag) {
            System.out.println("generateEquationFromMetaDOE:New:DiffWithRespTo=" + DiffWithRespTo + " diffLen=" + diffLen);
        }
        int numTerms = Math.max(1, meta[ColumnIndex.NUM_OF_TERMS]);
        int rowIdx = meta[ColumnIndex.EQUATION_NUMBER_1] - 1;

        List<String> terms = new ArrayList<>();
        for (int i = 0; i < numTerms; i++) {
            int termRowIdx = rowIdx + i;
            if (termRowIdx >= 0 && termRowIdx < DOEMatrix.length) {
                int[] termRow = DOEMatrix[termRowIdx];
                String term = generateTermFromDOE(termRow, DiffWithRespTo);
                if (!term.trim().isEmpty()) {
                    terms.add(term);
                }
                if (MyDebugVerboseFlag) {
                    System.out.println("generateEquationFromMetaDOE:term=" + term + " i=" + i + " numTerms=" + numTerms);
                }
            }
        }

        String equation = String.join(" ", terms).trim();
        if (equation.isEmpty()) {
            equation = "1";
        }

        try {
            int equationIndex = Index;
            int equationNumber = meta[ColumnIndex.EQUATION_NUMBER_1];
            int motifTag = meta[ColumnIndex.TERM_MOTIF_TAG];
            int entropyScore = meta[ColumnIndex.SYMBOLIC_ENTROPY];
            int funcWrapAliasID = meta[ColumnIndex.FUNC_WRAP_ALIAS_ID];
            int familyID = meta[ColumnIndex.EQUATION_FAMILY_ID];

            StringBuilder commentBuilder = new StringBuilder();
            commentBuilder.append("// EqnIndex=").append(equationIndex)
                    .append(" EqnNumber=").append(equationNumber)
                    .append(" FamilyID=").append(familyID)
                    .append(" MotifTag=").append(motifTag)
                    .append(" Entropy=").append(entropyScore)
                    .append(" FuncWrapAliasID=").append(funcWrapAliasID).append("\"+\n");

            commentBuilder.append("\"// MetaRow=").append(Arrays.toString(meta)).append("\"+\n");

            if (equationNumber - 1 >= 0 && equationNumber - 1 < DOEMatrix.length) {
                int[] matrixRow = DOEMatrix[equationNumber - 1];
                commentBuilder.append("\"// DOEMatrixRow=").append(Arrays.toString(matrixRow)).append("\"\n");
            } else {
                commentBuilder.append("\"// DOEMatrixRow=Unavailable\n").append("\"\n");
            }

            EquationComment = commentBuilder.toString();
            if (MyDebugVerboseFlag) {
                System.out.println("generateEquationFromMetaDOE:equation=" + equation);
            }
        } catch (Exception ex) {
            EquationComment = "// Equation metadata unavailable due to error: " + ex.getMessage();
            System.out.println(ex.getStackTrace());
            ex.printStackTrace();
        }

        return equation;
    }

    private static String generateTermFromDOE(int[] row, String DiffWithRespTo) {
        if (row == null || DOEFactorMatrix == null) {
            return "1";
        }
        if (MyDebugVerboseFlag) {
            System.out.println("generateTermFromDOE:meta=" + Arrays.toString(row));
        }
        List<String> factors = new ArrayList<>();
        int numFactors = Math.max(0, row[DOEMatrixIndex.NUM_OF_FACTORS_PER_TERM]);
        int rowIdx = row[DOEMatrixIndex.EQUATION_NUMBER_1];

        for (int k = 0; k < numFactors; k++) {
            int factorRowIdx = rowIdx + k;
            String factor = "";
            String joinOp = "";

            if (factorRowIdx >= 0 && factorRowIdx < DOEFactorMatrix.length) {
                int[] rowFactor = DOEFactorMatrix[factorRowIdx];
                factor = generateFactor(rowFactor, row, DiffWithRespTo, k);
            } else {
                factor = "1";
            }
            if (MyDebugVerboseFlag) {
                System.out.println("generateTermFromDOE:Factor=" + factor + " k=" + k);
            }
            factors.add(factor);
        }

        String term = String.join(" ", factors).trim();
        if (MyDebugVerboseFlag) {
            System.out.println("generateTermFromDOE:term=" + term);
        }
        return term.isEmpty() ? "1" : term;
    }

    private static String generateFactor(int[] rowFactor, int[] row, String DiffWithRespTo, int factorPosition) {
        try {
            if (rowFactor == null) {
                return "";
            }

            boolean isVar = (rowFactor[DOEFactorMatrixIndex.IS_VAR] == 1);
            boolean isIndConst = (row != null && row[DOEMatrixIndex.IND_CONST_PRESENCE_FLAG] == 1);

            String baseSymbol;
            if (isIndConst) {
                int constLetters = Math.max(1, row[DOEMatrixIndex.IND_CONST_LETTERS]);
                int constDigits = Math.max(0, row[DOEMatrixIndex.IND_CONST_DIGITS]);
                baseSymbol = generateAlphaName(false, true, constLetters, constDigits,DiffWithRespTo, false);

                int style = row[DOEMatrixIndex.IND_CONST_STYLE];
                int alias = row[DOEMatrixIndex.IND_CONST_ALIAS_ID];
                int motif = row[DOEMatrixIndex.IND_CONST_MOTIF_TAG];
                int entropy = row[DOEMatrixIndex.IND_CONST_ENTROPY_SCORE];

                //baseSymbol = "(" + baseSymbol + ")_s" + style + "_a" + alias + "_m" + motif + "_e" + entropy;
            } else {
                int varLetters = Math.max(1, rowFactor[DOEFactorMatrixIndex.VAR_LETTERS]);
                int varDigits = Math.max(0, rowFactor[DOEFactorMatrixIndex.VAR_DIGITS]);
                baseSymbol = generateAlphaName(true, false, varLetters, varDigits,DiffWithRespTo,true);
            }

            String coeffPrefix = "";
            int coeffType = rowFactor[DOEFactorMatrixIndex.COEFF_TYPE];
            int coeffSign = rowFactor[DOEFactorMatrixIndex.COEFF_SIGN];
            int coeffMag = rowFactor[DOEFactorMatrixIndex.COEFF_MAGNITUDE];
            if (coeffType != 0) {
                String sign = (coeffSign == 2) ? "-" : "";
                coeffPrefix = sign + (coeffMag != 0 ? coeffMag : 1) + "*";
            }

            String exponentSuffix = "";
            int expType = rowFactor[DOEFactorMatrixIndex.EXP_TYPE];
            int expMag = rowFactor[DOEFactorMatrixIndex.EXP_MAGNITUDE];
            if (expType != 0) {
                if (expMag == 0) {
                    return coeffPrefix.isEmpty() ? "1" : coeffPrefix.substring(0, coeffPrefix.length() - 1);
                }
                if (expMag != 1) {
                    exponentSuffix = "^" + expMag;
                }
            }

//        String wrapPrefix = "", wrapSuffix = "";
//        int funcIdx = rowFactor[DOEFactorMatrixIndex.FUNC_WRAP_IDX];
//        int funcDepth = rowFactor[DOEFactorMatrixIndex.FUNC_WRAP_DEPTH];
//        String funcName = switch (funcIdx) {
//            case 1 -> "sin";
//            case 2 -> "cos";
//            case 3 -> "tan";
//            case 4 -> "exp";
//            case 5 -> "log";
//            default -> null;
//        };
//        if (funcName != null && funcDepth > 0) {
//            wrapPrefix = funcName.repeat(funcDepth).replaceAll("(?<=.)(?=.)", "(");
//            wrapSuffix = ")".repeat(funcDepth);
//        }
            int joinIdx = rowFactor[DOEFactorMatrixIndex.JOIN_OP_IDX];
            String joinOp = (factorPosition > 0 && joinIdx >= 0 && joinIdx < JOIN_OP_MAP.length)
                    ? JOIN_OP_MAP[joinIdx] + " " : "";
            if (MyDebugVerboseFlag) {
                System.out.println("generateFactor:return Value:Factor=" + (joinOp + coeffPrefix /*+ wrapPrefix*/ + baseSymbol + exponentSuffix /*+ wrapSuffix */).trim());
            }
            return (joinOp + coeffPrefix /*+ wrapPrefix*/ + baseSymbol + exponentSuffix /*+ wrapSuffix*/).trim();
        } catch (Exception ex) {
            if (MyDebugVerboseFlag) {
                System.out.println("generateFactor: error at factorPosition=" + factorPosition + " → " + ex.getMessage());
            }
            return "";
        }
    }
    private static String generateTailFromMetaDOE(int[] meta) {
        if (meta == null || DOEMatrix == null || DOEFactorMatrix == null) {
            return "";
        }
        if (MyDebugVerboseFlag) {
            System.out.println("generateTailFromMetaDOE:meta=" + Arrays.toString(meta));
        }
        int diffLen = Math.max(1, meta[DOEMatrixIndex.DIFF_WITH_RESP_TO_LEN]);
        boolean isVar = (meta[ColumnIndex.IS_VAR] == 1);
        if (MyDebugVerboseFlag) {
            System.out.println("generateTailFromMetaDOE:Default:DiffWithRespTo=" + DiffWithRespTo + " diffLen=" + diffLen);
        }
        int numTerms = Math.max(0, meta[ColumnIndex.NUM_OF_TERMS]) % 2;
        int rowIdx = meta[ColumnIndex.EQUATION_NUMBER_1] - 1;

        List<String> terms = new ArrayList<>();
        for (int i = 0; i < numTerms; i++) {
            int termRowIdx = rowIdx + i;
            if (termRowIdx >= 0 && termRowIdx < DOEMatrix.length) {
                int[] termRow = DOEMatrix[termRowIdx];
                String term = generateTermTailFromDOE(termRow, DiffWithRespTo);
                if (!term.trim().isEmpty()) {
                    terms.add(term);
                }
                if (MyDebugVerboseFlag) {
                    System.out.println("generateTailFromMetaDOE:term=" + term + " i=" + i + " numTerms=" + numTerms);
                }
            }
        }

        String equation = String.join(" ", terms).trim();
        if (equation.isEmpty()) {
            equation = "1";
        }

        try {
            int equationIndex = Index;
            int equationNumber = meta[ColumnIndex.EQUATION_NUMBER_1];
            int motifTag = meta[ColumnIndex.TERM_MOTIF_TAG];
            int entropyScore = meta[ColumnIndex.SYMBOLIC_ENTROPY];
            int funcWrapAliasID = meta[ColumnIndex.FUNC_WRAP_ALIAS_ID];
            int familyID = meta[ColumnIndex.EQUATION_FAMILY_ID];

            StringBuilder commentBuilder = new StringBuilder(EquationComment);
            commentBuilder.append("//Tail EqnIndex=").append(equationIndex)
                    .append(" EqnNumber=").append(equationNumber)
                    .append(" FamilyID=").append(familyID)
                    .append(" MotifTag=").append(motifTag)
                    .append(" Entropy=").append(entropyScore)
                    .append(" FuncWrapAliasID=").append(funcWrapAliasID).append("\"+\n");

            commentBuilder.append("\"// MetaRow=").append(Arrays.toString(meta)).append("\"+\n");

            if (equationNumber - 1 >= 0 && equationNumber - 1 < DOEMatrix.length) {
                int[] matrixRow = DOEMatrix[equationNumber - 1];
                commentBuilder.append("\"// DOEMatrixRow=").append(Arrays.toString(matrixRow)).append("\"\n");
            } else {
                commentBuilder.append("\"// DOEMatrixRow=Unavailable\n").append("\"\n");
            }

            EquationComment = commentBuilder.toString();
            if (MyDebugVerboseFlag) {
                System.out.println("generateTailFromMetaDOE:equation=" + equation);
            }
        } catch (Exception ex) {
            EquationComment = "// Equation metadata unavailable due to error: " + ex.getMessage();
            System.out.println(ex.getStackTrace());
            ex.printStackTrace();
        }

        return equation;
    }

    private static String generateTermTailFromDOE(int[] row, String DiffWithRespTo) {
        if (row == null || DOEFactorMatrix == null) {
            return "1";
        }
        if (MyDebugVerboseFlag) {
            System.out.println("generateTermTailFromDOE:meta=" + Arrays.toString(row));
        }
        List<String> factors = new ArrayList<>();
        int numFactors = Math.max(0, row[DOEMatrixIndex.NUM_OF_FACTORS_PER_TERM])%2;
        int rowIdx = row[DOEMatrixIndex.EQUATION_NUMBER_1];

        for (int k = 0; k < numFactors; k++) {
            int factorRowIdx = rowIdx + k;
            String factor = "";
            String joinOp = "";

            if (factorRowIdx >= 0 && factorRowIdx < DOEFactorMatrix.length) {
                int[] rowFactor = DOEFactorMatrix[factorRowIdx];
                factor = generateTailFactor(rowFactor, row, DiffWithRespTo, k);
            } else {
                factor = "1";
            }
            if (MyDebugVerboseFlag) {
                System.out.println("generateTermTailFromDOE:Factor=" + factor + " k=" + k);
            }
            factors.add(factor);
        }

        String term = String.join(" ", factors).trim();
        if (MyDebugVerboseFlag) {
            System.out.println("generateTermTailFromDOE:term=" + term);
        }
        return term.isEmpty() ? "1" : term;
    }
private static String generateTailFactor(int[] rowFactor, int[] row, String DiffWithRespTo, int factorPosition) {
        try {
            if (rowFactor == null) {
                return "";
            }

            boolean isVar = (rowFactor[DOEFactorMatrixIndex.IS_VAR] == 1);
            boolean isIndConst = (row != null && row[DOEMatrixIndex.IND_CONST_PRESENCE_FLAG] == 1);

            String baseSymbol;
            if (isIndConst) {
                int constLetters = Math.max(1, row[DOEMatrixIndex.IND_CONST_LETTERS]);
                int constDigits = Math.max(0, row[DOEMatrixIndex.IND_CONST_DIGITS]);
                baseSymbol = generateAlphaName(false, true, constLetters, constDigits,DiffWithRespTo, false);

                int style = row[DOEMatrixIndex.IND_CONST_STYLE];
                int alias = row[DOEMatrixIndex.IND_CONST_ALIAS_ID];
                int motif = row[DOEMatrixIndex.IND_CONST_MOTIF_TAG];
                int entropy = row[DOEMatrixIndex.IND_CONST_ENTROPY_SCORE];

                //baseSymbol = "(" + baseSymbol + ")_s" + style + "_a" + alias + "_m" + motif + "_e" + entropy;
            } else {
                int varLetters = Math.max(1, rowFactor[DOEFactorMatrixIndex.VAR_LETTERS]);
                int varDigits = Math.max(0, rowFactor[DOEFactorMatrixIndex.VAR_DIGITS]);
                baseSymbol = generateAlphaName(true, false, varLetters, varDigits,DiffWithRespTo,true);
            }

            String coeffPrefix = "";
            int coeffType = rowFactor[DOEFactorMatrixIndex.COEFF_TYPE];
            int coeffSign = rowFactor[DOEFactorMatrixIndex.COEFF_SIGN];
            int coeffMag = rowFactor[DOEFactorMatrixIndex.COEFF_MAGNITUDE];
            if (coeffType != 0) {
                String sign = (coeffSign == 2) ? "-" : "";
                coeffPrefix = sign + (coeffMag != 0 ? coeffMag : 1) + "*";
            }

            String exponentSuffix = "";
            int expType = rowFactor[DOEFactorMatrixIndex.EXP_TYPE];
            int expMag = rowFactor[DOEFactorMatrixIndex.EXP_MAGNITUDE];
            if (expType != 0) {
                if (expMag == 0) {
                    return coeffPrefix.isEmpty() ? "1" : coeffPrefix.substring(0, coeffPrefix.length() - 1);
                }
                if (expMag != 1) {
                    exponentSuffix = "^" + expMag;
                }
            }

//        String wrapPrefix = "", wrapSuffix = "";
//        int funcIdx = rowFactor[DOEFactorMatrixIndex.FUNC_WRAP_IDX];
//        int funcDepth = rowFactor[DOEFactorMatrixIndex.FUNC_WRAP_DEPTH];
//        String funcName = switch (funcIdx) {
//            case 1 -> "sin";
//            case 2 -> "cos";
//            case 3 -> "tan";
//            case 4 -> "exp";
//            case 5 -> "log";
//            default -> null;
//        };
//        if (funcName != null && funcDepth > 0) {
//            wrapPrefix = funcName.repeat(funcDepth).replaceAll("(?<=.)(?=.)", "(");
//            wrapSuffix = ")".repeat(funcDepth);
//        }
            int joinIdx = rowFactor[DOEFactorMatrixIndex.JOIN_OP_IDX];
            String joinOp = (factorPosition > 0 && joinIdx >= 0 && joinIdx < JOIN_OP_MAP.length)
                    ? JOIN_OP_MAP[joinIdx] + " " : "";
            if (MyDebugVerboseFlag) {
                System.out.println("generateTailFactor:return Value:Factor=" + (joinOp + coeffPrefix /*+ wrapPrefix*/ + baseSymbol + exponentSuffix /*+ wrapSuffix */).trim());
            }
            return (joinOp + coeffPrefix /*+ wrapPrefix*/ + baseSymbol + exponentSuffix /*+ wrapSuffix*/).trim();
        } catch (Exception ex) {
            if (MyDebugVerboseFlag) {
                System.out.println("generateTailFactor: error at factorPosition=" + factorPosition + " → " + ex.getMessage());
            }
            return "";
        }
    }

}
