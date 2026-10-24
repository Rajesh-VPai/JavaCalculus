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
import Calculus.DiffrIntegrSep;
import static Calculus.MathematicalTestHarness.GBLMyLogLevel;
import static Calculus.MathematicalTestHarness.GBLSilent;
import static Calculus.MathematicalTestHarness.HideInRecurseFlag;
import Calculus.MathsContxtLAv;
import static Calculus.MathsContxtLAv.eatAll;
import static Calculus.MathsContxtLAv.parseSimple;
import Calculus.RuleAnalytics;
import static Calculus.UsageCalculus.ruleAnalytics;
import static JavaCalculusTestHarness.EnhancedDOEAlgebraGenerator.DiffWithRespTo;
import static JavaCalculusTestHarness.FisherClassDOETrial2.EquationComment;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.util.*;

public class SymbolicTestCaseGeneratorHadammard {

    static Random rand = new Random();
    public static String RunName = "Hd3_8_" + rand.nextInt(1,10) + "Hd3_8_";
    public static List<String> IndConstNamesList = new ArrayList<>();
    public static String GenerateFile = "BothOldFile";//Fisher;//Hadammard//BothOldFile
    public static Map<String, Double> variables = new HashMap<>();
    //public static String DiffWithRespTo = "x";
    public static int Index = 0;
    public static int IndexHadamard = 0;
    public static boolean DupFlag = false;
    public static boolean MyDebugVerboseFlag = true;
    public static boolean MyDebugVerboseFlagLowLevel = false;
    public static FileWriter writer = null;
    public static FileWriter writer2 = null;
    public static FileWriter writer4 = null;
    public static FileWriter writer6 = null;
    public static String AlgoName2 = "Hadammard";
    public static StringBuilder equationsHadammard = new StringBuilder("");
    public static StringBuilder sbHadammard = new StringBuilder();
    public static boolean LowInitFlagRecordTimeOverall = false;
    public static boolean LowInitFlagRecordTimeHadammard = false;
    public static double CompletionTime = 0.0;
    public static double CompletionTimeHadammard = 0.0;
    public static int NumOfEquations = 250;//100;//250;//10;//250;//100//500
    public static int NextEmitID = 3750;
    public static Map<Integer, String> EqnDB = new HashMap<>();
    public static int EqnDBIndex = 0;
    public static int EqnDBDupCount = 0;

    public static void main(String[] args) {
        if (LowInitFlagRecordTimeOverall == false) {
            LocalDateTime current = LocalDateTime.now();
            String[] TimeTaken = current.toString().split(":");
            CompletionTime = Double.parseDouble(TimeTaken[1]);
            System.out.println(ConsoleColors.BLUE + "SymbolicTestCaseGenerator:Started:MathsContxtLAv:Run Started Time:" + current + " " + ConsoleColors.RESET);
        }
        System.out.println("main:NumOfEquations=" + NumOfEquations);
        int NumOfFiles = 1;//1//4;//10
        long caseStartHadammard = 3750 ;
        boolean OldFlag = true;//false;
        boolean OldFlagCyclicHadammard = false;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String Path = "data\\";
        String dump = "dump\\";
        String msg = "";

        System.out.println("main:GenerateFile=" + GenerateFile);
        if (GenerateFile.equalsIgnoreCase("Hadammard")) {
            caseStartHadammard = 120001L;
            OldFlag = true;
        } else if (GenerateFile.equalsIgnoreCase("BothOldFile")) {
            caseStartHadammard = 3750;
            OldFlag = true;
        }

//        for (int k = 0; k < 1; k++) {
//            CreateCaseStatementFileInParallel(Path, dump, k);
//        }
       int i=IndexHadamard;
      try{
          //caseStartHadammard+=i;
          i=0;
//        for (; i <= NumOfEquations*NumOfFiles; i++) {
//            sb2.append("case ").append(caseStartHadammard + i).append("L:\n");
//            sb2.append(" TestCaseDiff").append(caseStartHadammard + i).append("(); \n");
//            sb2.append(" break;\n");
//        }
//        
//        writer2.write(sb2.toString());
//        writer2.flush();
//        sb2.setLength(0);
        } catch (Exception HyperDOEse) {
            //System.out.println(HyperDOEse.getStackTrace());
            //System.out.println(HyperDOEse.getMessage());
            //HyperDOEse.printStackTrace();
        }
        EqnDB = new HashMap<>();
        EqnDB.clear();
        EqnDBIndex = 0;
        EqnDBDupCount = 0;
        try {
//            if (GenerateFile.equalsIgnoreCase("Hadammard")) {
//                caseStartHadammard = 120001L;
//                OldFlag = true;
//            } else if (GenerateFile.equalsIgnoreCase("BothOldFile")) {
//                caseStartHadammard = 3760 ;
//                OldFlag = true;
//            }
            boolean Flag = false;
            CreateFilesParallel(Path, dump, 1);
            for (int j = 0, k=1; j <= NumOfEquations;j++) {
                    DupFlag = false;
                    if (GenerateFile.equalsIgnoreCase("Hadammard")) {
                        GenerateFileGenerateCodeHadammard(OldFlagCyclicHadammard,  caseStartHadammard, i, k, NumOfFiles, Flag, OldFlag);
                    } else if (GenerateFile.equalsIgnoreCase("BothOldFile")) {
                        GenerateFileGenerateCode(caseStartHadammard,i, NumOfFiles, Flag);
                    }
                    //System.out.println("main:EqnDBDupCount=" + EqnDBDupCount + " DupFlag=" + DupFlag + " i=" + i + " caseStart=" + (caseStart+i) );
                    //System.out.print(System.lineSeparator());
                    if ((OldFlagCyclicHadammard == false)) {
                        Index++;
                    } else if ((OldFlagCyclicHadammard == true) && (IndexHadamard >= 0)) {
                        IndexHadamard++;
                    }
//                    if(DupFlag==false)
//                        j++;
                    System.out.println("main:NumOfEquations=" + NumOfEquations + " Last TestCase ID:=" + NextEmitID + " j=" + j + " DupFlag=" + DupFlag + " IndexHadamard=" +IndexHadamard + " Index=" + Index);
                }
                if (GenerateFile.equalsIgnoreCase("Fisher")) {
                    System.out.println("Writing to File:" + Path + dump + "CoPilotEqnDOE"  + RunName + ".java" + " Complete.");
                } else if (GenerateFile.equalsIgnoreCase("Hadammard")) {
                    System.out.println("Writing to File:" + Path + dump + "CoPilotEqnHadammard" + RunName + ".java" + " Complete.");
                } else if (GenerateFile.equalsIgnoreCase("BothOldFile")) {
                    if (AlgoName2.equalsIgnoreCase("Hadammard")) {
                        System.out.println(ConsoleColors.BLUE + "Writing to File:" + Path + dump + " AlgoName2=" + AlgoName2 + "CoPilotEqnBasicBothOldFileHadammard_" + RunName + NumOfEquations + ".java" + " Complete (RunName + NumOfEquations)." + ConsoleColors.RESET);
                    }
                }
        } catch (Exception HyperDOEse) {
            //System.out.println(HyperDOEse.getStackTrace());
            //System.out.println(HyperDOEse.getMessage());
            //HyperDOEse.printStackTrace();
        }
        System.out.println("main:EqnDBDupCount=" + EqnDBDupCount);
        for (int m = 0; m < EqnDB.size(); m++) {
            String Exprn = EqnDB.get(m);
            if ((Exprn != null) && (!Exprn.equalsIgnoreCase("")) && (Exprn.contains(":Dup with"))) {
                System.out.println(ConsoleColors.RED + "DUP: Exprn=" + Exprn + ConsoleColors.RESET);
            }
        }
        System.out.println("main:GenerateFile=" + GenerateFile);
        System.out.println("main:NumOfEquations=" + NumOfEquations + " Last TestCase ID:=" + NextEmitID);
        EqnDB.clear();
        EqnDBIndex = 0;
        EqnDBDupCount = 0;
        if (LowInitFlagRecordTimeOverall == false) {
            LocalDateTime current = LocalDateTime.now();
            String[] TimeTaken = current.toString().split(":");
            CompletionTime = Double.parseDouble(TimeTaken[1]) - CompletionTime;
            System.out.println(ConsoleColors.BLUE + "SymbolicTestCaseGenerator:Completed:Run Completed Time:" + current + " " + " CompletionTime=" + CompletionTime + " minutes" + ConsoleColors.RESET);
            LowInitFlagRecordTimeOverall = true;
        }
    }

    private static void CreateCaseStatementFileInParallel(String Path, String dump, int k) {
        try {
            
            if ((writer2 = new FileWriter(Path + dump + "CaseJavaHadammard" + k + GenerateFile + ".txt")) == null) {
                String msg = "Input: can't open " + Path + dump + "CaseJavaHadammard" + k + GenerateFile + ".txt";
                System.out.println(msg);
            }
            System.out.println("main:Opened File Name: Infile=" + Path + dump + "CaseJavaHadammard" + k + GenerateFile + ".txt" + " For Writing.");
        } catch (Exception HyperDOEse) {
            //System.out.println(HyperDOEse.getStackTrace());
            //System.out.println(HyperDOEse.getMessage());
            //HyperDOEse.printStackTrace();
        }
    }

    private static void CreateFileOne(String AlgoName, String Path, String dump, int k) {
        try {
            if (AlgoName.equalsIgnoreCase("Hadammard")) {
                if ((writer4 = new FileWriter(Path + dump + "CoPilotEqnHadammard" + k + ".java")) == null) {
                    String msg = "Input: can't open " + Path + dump + "CoPilotEqnHadammard" + k + ".java";
                    System.out.println(msg);
                }
                System.out.println("main:Opened File Name: Infile=" + Path + dump + "CoPilotEqnHadammard" + k + ".java" + " For Writing.");
            }
        } catch (Exception HyperDOEse) {
            //System.out.println(HyperDOEse.getStackTrace());
            //System.out.println(HyperDOEse.getMessage());
            //HyperDOEse.printStackTrace();
        }
    }

    private static void CreateFilesParallel(String Path, String dump, int k) {
        try {
            if ((AlgoName2.equalsIgnoreCase("Hadammard"))) {
                if ((writer6 = new FileWriter(Path + dump + "CoPilotEqnBasicBothOldFileHadammard_" + k + RunName + NumOfEquations + ".java")) == null) {
                    String msg = "Input: can't open " + Path + dump + "CoPilotEqnBasicBothOldFileHadammard_" + k + RunName + NumOfEquations + ".java";
                    System.out.println(msg);
                }
                System.out.println("main:Opened File Name: Infile=" + Path + dump + "CoPilotEqnBasicBothOldFileHadammard_" + k + RunName + NumOfEquations + ".java" + " For Writing.");
            }
        } catch (Exception HyperDOEse) {
            //System.out.println(HyperDOEse.getStackTrace());
            //System.out.println(HyperDOEse.getMessage());
            //HyperDOEse.printStackTrace();
        }
    }

    private static void GenerateFileGenerateCodeHadammard(boolean OldFlagCyclicHadammard, long caseStartHadammard, int i, int k, int NumOfFiles, boolean Flag, boolean OldFlag) {
        if (OldFlag == true) {
            equationsHadammard.append(EnhancedHadammard.generateEquations(IndexHadamard, AlgoName2, NumOfEquations, caseStartHadammard + i));
        } else {
            equationsHadammard.append(HadammardClassTrial2.generateEquations(IndexHadamard, NumOfEquations, caseStartHadammard+i));
        }
        String[] TempData = equationsHadammard.toString().split("@DiffWithRespTo@");
        if (TempData.length == 2) {
            DiffWithRespTo = TempData[1];
        } else {
            DiffWithRespTo = "x";
        }
        if (MyDebugVerboseFlag) {
            System.out.println("main:Hadammard ONLY:equations=" + equationsHadammard);
        }
        generateTestCaseMethodHadammard(AlgoName2, TempData[0], writer4, DiffWithRespTo);
        equationsHadammard.setLength(0);
    }

    private static void GenerateFileGenerateCode(long caseStartHadammard, int i, int NumOfFiles, boolean Flag) {
        if ((AlgoName2.equalsIgnoreCase("Hadammard"))) {
            if (LowInitFlagRecordTimeHadammard == false) {
                LocalDateTime current = LocalDateTime.now();
                String[] TimeTaken = current.toString().split(":");
                CompletionTimeHadammard = Double.parseDouble(TimeTaken[1]);
                System.out.println(ConsoleColors.BLUE + "SymbolicTestCaseGenerator:Started:MathsContxtLAv:Run Started Time:" + current + " " + ConsoleColors.RESET);
            }
            EquationNCodeGenHadammard(caseStartHadammard, i);
        }
    }

    private static void EquationNCodeGenHadammard(long caseStartHadammard, int i) {
        equationsHadammard.append(EnhancedHadammard.generateEquations(IndexHadamard, AlgoName2, NumOfEquations , caseStartHadammard + IndexHadamard));
        System.out.println("main:EqnDBDupCount=" + EqnDBDupCount + " AlgoName2=" + AlgoName2 + " DupFlag=" + DupFlag + " i=" + i + " caseStartHadammard=" + (caseStartHadammard + IndexHadamard));
        String[] TempData = equationsHadammard.toString().split("@DiffWithRespTo@");
        if (TempData.length == 2) {
            DiffWithRespTo = TempData[1];
        } else {
            DiffWithRespTo = "x";
        }
        if (MyDebugVerboseFlag) {
            System.out.println("main:Hadammard:BothFiles:equations=" + equationsHadammard);
        }
        if (DupFlag==false){
        generateTestCaseMethodHadammard( AlgoName2, TempData[0], writer6, DiffWithRespTo);
        if (LowInitFlagRecordTimeHadammard == false) {
            LocalDateTime current = LocalDateTime.now();
            String[] TimeTaken = current.toString().split(":");
            CompletionTimeHadammard = Double.parseDouble(TimeTaken[1]) - CompletionTime;
            System.out.println(ConsoleColors.BLUE + "SymbolicTestCaseGenerator:Completed:Run Completed Time:" + current + " " + " CompletionTime=" + CompletionTimeHadammard + " minutes" + ConsoleColors.RESET);
            LowInitFlagRecordTimeHadammard = true;
        }
        }else {
            System.out.println(ConsoleColors.RED + "main:Hadammard:BothFiles:DUPLICATE=" + NextEmitID + " NOT WRITTEN"+ ConsoleColors.RESET);
        }
        equationsHadammard.setLength(0);
    }

    private static void generateTestCaseMethodHadammard(String AlgoName2, String equation, FileWriter writer7, String DiffWithRespTo1) {
        try {
            String equationDiff = "", equationIntegre = "";
            Calculus.UsageCalculus.DiffWithRespTo=DiffWithRespTo1;
            equation = MathsContxtLAv.eatAll(equation, ' ');
            String parsedEqn = "";
            parsedEqn = StrMap1Parse(equation, "Map1", "Diffr", DiffWithRespTo1);
            if ((equation.contains(DiffWithRespTo1)) && (!parsedEqn.contains(DiffWithRespTo1))) {
                throw new RuntimeException(" Hello World Dropped DIFFWITHRESPTO:NextEmitID=" + NextEmitID);
            }
            parsedEqn = MathsContxtLAv.eatAll(parsedEqn, ' ');
            String diffEqn = differentiate(parsedEqn, DiffWithRespTo1);
            diffEqn = MathsContxtLAv.eatAll(diffEqn, ' ');
            String diffMapped = StrMap2Parse(diffEqn, "Map2", "Diffr", DiffWithRespTo1);
            diffMapped = MathsContxtLAv.eatAll(diffMapped, ' ');

            String parsedEqn1 = "";
            parsedEqn = StrMap1Parse(equation, "Map1", "Integre", DiffWithRespTo1);
            if ((equation.contains(DiffWithRespTo1)) && (!parsedEqn1.contains(DiffWithRespTo1))) {
                throw new RuntimeException(" Hello World Dropped DIFFWITHRESPTO:NextEmitID=" + NextEmitID);
            }
            parsedEqn1 = MathsContxtLAv.eatAll(parsedEqn1, ' ');

            String integrEqn = integrate(parsedEqn1, DiffWithRespTo1);
            integrEqn = MathsContxtLAv.eatAll(integrEqn, ' ');
            String integrMapped = StrMap2Parse(integrEqn, "Map2", "Integre", DiffWithRespTo1);
            integrMapped = MathsContxtLAv.eatAll(integrMapped, ' ');

            sbHadammard.append("public static void TestCaseDiff").append(NextEmitID).append("() {\n")
                    .append(" UsageCalculus.TestCase = ").append(NextEmitID).append(";\n")
                    .append(" UsageCalculus.EqnRegressionDiffStatus = \"All Green Including Values\";\n")
                    .append(" UsageCalculus.EqnRegressionIntegreStatus = \"All Green Including Values\";\n")
                    .append(" UsageCalculus.EqnUnderTest = \"").append(equation).append("\";\n")
                    .append(" UsageCalculus.TestCaseName = \"Simple: Exponent\";\n")
                    .append(" UsageCalculus.TestCaseMatrixID = \"Exponent:+ve Numbers:* Operator:No Exponent Sign:Constant End:Term Sign +&-:Exponent\";\n")
                    .append(" UsageCalculus.EquationComment = \"\"").append(EquationComment).append(";\n")
                    .append(" UsageCalculus.DiffWithRespTo = \"").append(DiffWithRespTo1).append("\";\n")
                    .append(" UsageCalculus.MaxDiffOrder = 14;\n");

            equationDiff = equation;
            equationIntegre = equation;
            boolean WrittenMaxIntegreOrder = false;
            for (int order = 1; order <= 4/*14*/; order++) {
                if (order <= 4) {
                    // Differentiation pipeline
                    String map1Diff = StrMap1Parse(equationDiff, "Map1", "Diffr", DiffWithRespTo1);
                    String diffAlone = differentiate(map1Diff, DiffWithRespTo1);
                    String map2Diff = StrMap2Parse(diffAlone, "Map2", "Diffr", DiffWithRespTo1);

                    // Integration pipeline
                    String map1Integr = StrMap1Parse(equationIntegre, "Map1", "Integre", DiffWithRespTo1);
                    String integrAlone = integrate(map1Integr, DiffWithRespTo1);
                    String map2Integr = StrMap2Parse(integrAlone, "Map2", "Integre", DiffWithRespTo1);
                    if ((map2Integr.contains("ln")) && (WrittenMaxIntegreOrder == false)) {
                        sbHadammard.append(" UsageCalculus.MaxIntegreOrder = " + (order + 1) + ";\n\n");
                        WrittenMaxIntegreOrder = true;
                    } else if ((WrittenMaxIntegreOrder == false)
                            && (!map1Integr.contains("1/" + DiffWithRespTo1))
                            && (!map1Integr.contains("1/" + DiffWithRespTo1 + "^1"))
                            && (!map1Integr.contains("1/" + DiffWithRespTo1 + "^+1"))
                            && (!map1Integr.contains(DiffWithRespTo1 + "^-1"))
                            && (!map1Integr.contains("1.0/" + DiffWithRespTo1))
                            && (!map1Integr.contains("1.0/" + DiffWithRespTo1 + "^1.0"))
                            && (!map1Integr.contains("1.0/" + DiffWithRespTo1 + "^+1.0"))
                            && (!map1Integr.contains(DiffWithRespTo1 + "^-1.0"))) {
                        sbHadammard.append(" UsageCalculus.MaxIntegreOrder = 14;\n\n");
                        WrittenMaxIntegreOrder = true;
                    } else if ((WrittenMaxIntegreOrder == false)
                            && ((map1Integr.contains("1/" + DiffWithRespTo1))
                            || (map1Integr.contains("1/" + DiffWithRespTo1 + "^1"))
                            || (map1Integr.contains("1/" + DiffWithRespTo1 + "^+1"))
                            || (map1Integr.contains(DiffWithRespTo1 + "^-1"))
                            || (map1Integr.contains("1.0/" + DiffWithRespTo1))
                            || (map1Integr.contains("1.0/" + DiffWithRespTo1 + "^1.0"))
                            || (map1Integr.contains("1.0/" + DiffWithRespTo1 + "^+1.0"))
                            || (map1Integr.contains(DiffWithRespTo1 + "^-1.0")))) {
                        sbHadammard.append(" UsageCalculus.MaxIntegreOrder = " + (order + 1) + ";\n\n");
                        WrittenMaxIntegreOrder = true;
                    }
                    // Store results
                    sbHadammard.append(" UsageCalculus.EqnSolArrayMap1[").append(order).append("] = \"").append(map1Diff).append("\";\n")
                            .append(" UsageCalculus.EqnSolArrayDiffAlone[").append(order).append("] = \"").append(diffAlone).append("\";\n")
                            .append(" UsageCalculus.EqnSolArrayMap2[").append(order).append("] = \"").append(map2Diff).append("\";\n")
                            .append(" UsageCalculus.EqnSolArrayMap3[").append(order).append("] = \"").append(map1Integr).append("\";\n")
                            .append(" UsageCalculus.EqnSolArrayIntegrAlone[").append(order).append("] = \"").append(integrAlone).append("\";\n")
                            .append(" UsageCalculus.EqnSolArrayMap4[").append(order).append("] = \"").append(map2Integr).append("\";\n")
                            .append(" UsageCalculus.EqnSolOrder[").append(order).append("] = ").append(order).append(";\n\n");

                    // Advance equation for next order
                    equationDiff = map2Diff;
                    equationIntegre = map2Integr;
                } else if (order > 4) {
                    sbHadammard.append(" UsageCalculus.EqnSolArrayMap1[").append(order).append("] = \"\";\n")
                            .append(" UsageCalculus.EqnSolArrayDiffAlone[").append(order).append("] = \"\";\n")
                            .append(" UsageCalculus.EqnSolArrayMap2[").append(order).append("] = \"\";\n")
                            .append(" UsageCalculus.EqnSolArrayMap3[").append(order).append("] = \"\";\n")
                            .append(" UsageCalculus.EqnSolArrayIntegrAlone[").append(order).append("] = \"\";\n")
                            .append(" UsageCalculus.EqnSolArrayMap4[").append(order).append("] = \"\";\n");
                    sbHadammard.append(" UsageCalculus.EqnSolOrder[").append(order).append("] = ").append(order).append(";\n\n");
                }
            }
            sbHadammard.append("}\n\n");
            //System.out.println(sb.toString());
            writer7.write(sbHadammard.toString());
            writer7.flush();
            sbHadammard.setLength(0);

        } catch (Exception HyperDOEse) {
            //System.out.println(HyperDOEse.getStackTrace());
            //System.out.println(HyperDOEse.getMessage());
            //HyperDOEse.printStackTrace();
        }
        NextEmitID++;
    }

    private static String differentiate(String eqn, String DiffWithRespTo) {
        DiffrIntegrSep.DiffExpr exp = (() -> "");
        eqn = eatAll(eqn, ' ');
        SetVariablesAll(DiffWithRespTo);
        exp = DiffrIntegrSep.parseDiff(eqn, variables, DiffWithRespTo, "Map1", "Diffr");
        return exp.DiffExpr();
    }

    private static String integrate(String eqn, String DiffWithRespTo) {
        DiffrIntegrSep.IntegrExpr exp = (() -> "");
        eqn = eatAll(eqn, ' ');
        SetVariablesAll(DiffWithRespTo);
        final String Myeqn = eqn;
        exp = DiffrIntegrSep.parseIntegr(eqn, variables, DiffWithRespTo, "Map1", "Integre");
        return exp.IntegrExpr();
    }

    private static String StrMap1Parse(String eqn, String MapType, String IntegrORDiffr, String DiffWithRespTo) {
        ruleAnalytics = new RuleAnalytics();
        ruleAnalytics.Init();
        MathsContxtLAv.SimpleExpression expSimpleMap1 = (() -> "");
        eqn = eatAll(eqn, ' ');
        SetVariablesAll(DiffWithRespTo);
        final String Myeqn = eqn;
        expSimpleMap1 = parseSimple(eqn, variables, DiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
        return expSimpleMap1.SimpleExpr();
    }

    private static String StrMap2Parse(String eqn, String MapType, String IntegrORDiffr, String DiffWithRespTo) {
        MathsContxtLAv.SimpleExpression expSimpleMap2 = (() -> "");
        eqn = eatAll(eqn, ' ');
        SetVariablesAll(DiffWithRespTo);
        expSimpleMap2 = parseSimple(eqn, variables, DiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
        return expSimpleMap2.SimpleExpr();
    }

    public static void SetVariablesAll(String DiffWithRespTo) {
        variables.put(DiffWithRespTo, 2.0);
        variables.put("a", 1.0);
        variables.put("b", 2.0);//variables.put("b", 0.0);
        variables.put("c", -1.0);
        variables.put("d", 2.0);
        variables.put("m", -1.0);
        variables.put("p", 3.0);
        variables.put("q", 0.0);
        variables.put("r", -1.0);
        variables.put("s", 2.0);
        variables.put("i", 1.0);
        variables.put("E1", 1.0);
        variables.put("ab", 2.0);
        variables.put("ac", 3.0);
        variables.put("ad", 3.1);
        variables.put("am", 2.1);
        variables.put("ap", 7.0);
        variables.put("aq", 9.0);
        variables.put("ar", 5.0);
        variables.put("as", 6.1);
        variables.put("ai", 1.0);
    }

//    public static void SetVariablesAllAutomatic1() {
//        variables.put(DiffWithRespTo, 1.0);
//        for (int i = 0; i < IndConstNamesList.size(); i++) {
//            variables.put(IndConstNamesList.get(i), (double) rand.nextInt(10));
//        }
//    }
}
