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

import static Calculus.MathematicalTestHarness.GBLMyLogLevel;
import static Calculus.MathematicalTestHarness.GBLSilent;
import static Calculus.MathematicalTestHarness.HideInRecurseFlag;
import static Calculus.MathsContxtLAv.PerfFLAG;
import static Calculus.MathsContxtLAv.StrCurrentTimeTaken;
import static Calculus.MathsExpressionParser.eatAll;
import static Calculus.MathsExpressionParser.parse;
import static Calculus.MathsContxtLAv.parseSimple;
import static Calculus.UsageCalculus.DiffWithRespTo;
import JavaCalculusTestHarness.SymbolicTestCaseGeneratorDOE;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author pai_c
 */
public class PerformanceEnggGenAI {
    // Random Data Begin
    static Random rand = new Random();
    static Double ReduceNextDouble=rand.nextDouble(0.0,1.0);
    static Double IncreaseNextDouble=rand.nextDouble(0.0,1.0);
    // Random Data End
    // Performance Data Begin
    
    // Performance Data End
    // Parallel Data Begin
    public static int NumOfEquations = 250;//250;//100//500
    public static int NumOfFiles = 10;//1//4;//10
    // Parallel Data End
    // Sequential Data Begin
    public static long caseStart = 3500;//120001L;
    public static long caseStartHadammard = 3500 + NumOfEquations;
    // Sequential Data End
    // Equation Data Begin
    public static String EquationChop=eatAll("Work/batch Size/number of Files",' ');// Work/batchSize/numberofFiles
    public static String EquationbatchSize=eatAll("m*x+c",' ');// y=m*x+c
    public static Map<String, Double> variables = new HashMap<>();
    static int numberofFiles=NumOfFiles;
    static int batchSize=NumOfEquations;
    static Double mReduce=1.0;
    static Double xIncrease=1.0;
    // Equation Data End
    // Chop Data Begin (Batch)
    public static Double ChopBegin(String[] args){
        int i=NumOfEquations*NumOfFiles;
        Double SeqOutputWork=1.0;
        variables.put("Work", i*1.0);
        variables.put("m", mReduce*1.0);
        variables.put("x", xIncrease*1.0);
        variables.put("numberofFiles", numberofFiles*1.0);
        variables.put("batchSize", batchSize*1.0);
        variables.put("SeqOutputWork", SeqOutputWork*1.0);
        //expSimpleMap1 = parseSimple(EquationChop, variables, DiffWithRespTo, "Map1", "Diffr", HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
        //StrexpSimpleExpressMap1 = expSimpleMap1.SimpleExpr();
        PerfFLAG=false;
        SymbolicTestCaseGeneratorDOE.main(args);
        //expValue = parse(EquationChop, variables, DiffWithRespTo, false, "Silent", MathsContxtLAv.LogLevel.Off);
        //ExprnexpValue = expValue.eval();
        variables.put("ExprnexpValue", 1.0*NumOfEquations);
        return variables.get("ExprnexpValue");
    }
    public static Double ChopComputeReduction(String[] args){
        int i=NumOfEquations*NumOfFiles;
        Double SeqOutputWork=1.0;
        variables.put("Work", i*1.0);
        variables.put("m", mReduce*1.0);
        variables.put("x", xIncrease*1.0);
        variables.put("numberofFiles", numberofFiles*1.0);
        variables.put("batchSize", batchSize*1.0);
        variables.put("SeqOutputWork", SeqOutputWork*1.0);
        //expSimpleMap1 = parseSimple(EquationChop, variables, DiffWithRespTo, "Map1", "Diffr", HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
        //StrexpSimpleExpressMap1 = expSimpleMap1.SimpleExpr();
        PerfFLAG=false;
        //expValue = parse(EquationChop, variables, DiffWithRespTo, false, "Silent", MathsContxtLAv.LogLevel.Off);
        //ExprnexpValue = expValue.eval();
        SymbolicTestCaseGeneratorDOE.main(args);
        variables.put("ExprnexpValue", 1.0*NumOfEquations);
        return variables.get("ExprnexpValue");
    }
    public static Double ChopComputeIncrease(String[] args){
        int i=NumOfEquations*NumOfFiles;
        Double SeqOutputWork=1.0;
        variables.put("Work", i*1.0);
        variables.put("m", mReduce*1.0);
        variables.put("x", xIncrease*1.0);
        variables.put("numberofFiles", numberofFiles*1.0);
        variables.put("batchSize", batchSize*1.0);
        variables.put("SeqOutputWork", SeqOutputWork*1.0);
        //expSimpleMap1 = parseSimple(EquationChop, variables, DiffWithRespTo, "Map1", "Diffr", HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
        //StrexpSimpleExpressMap1 = expSimpleMap1.SimpleExpr();
        PerfFLAG=false;
        //expValue = parse(EquationChop, variables, DiffWithRespTo, false, "Silent", MathsContxtLAv.LogLevel.Off);
        //ExprnexpValue = expValue.eval();
        SymbolicTestCaseGeneratorDOE.main(args);
        variables.put("ExprnexpValue", 1.0*NumOfEquations);
        return variables.get("ExprnexpValue");
    }
    // Chop Data End (Batch)
    // Map Data Begin (Batch)
       static MathsContxtLAv.SimpleExpression expSimpleMap1 = (() -> "");
       static MathsExpressionParser.Expression expValue = (() -> Double.NaN);
       static String StrexpSimpleExpressMap1 = "";
       static double ExprnexpValue = 0;
    // Map Data End (Batch)
    // Variation Mechanism Begin 
       public static Double ReductionbatchSize(Double Parameter){
           variables.put("batchSize", Parameter);
           return variables.get("batchSize");
       }
       public static Double IncreasebatchSize(Double Parameter){
           variables.put("batchSize", Parameter);
           return variables.get("batchSize");
       }
    // Variation Mechanism End   
       // Human Understandable Data Begin
       static int NumberOfSimulations=50;
       // Human Understandable Data Begin
       // main Begin
    public static void main(String[] args){
        Double SimulatedBatchSize=1.0;
        
        for (int i=0; (SimulatedBatchSize.intValue() != NumOfEquations*NumOfFiles) &&(i <= NumberOfSimulations); i++){
            System.out.println(" ********************* SIMULATION Reduction " + i + " Begin ************************* ");
            SimulatedBatchSize=ChopBegin(args);
            System.out.println("SeqOutputWork=" + variables.get("SeqOutputWork"));
            System.out.println("batchSize(Equations)="  + variables.get("batchSize"));
            System.out.println("numberofFiles="  + variables.get("numberofFiles"));
            System.out.println("ExprnexpValue="  + variables.get("ExprnexpValue"));
            System.out.println("SimulatedBatchSize(Equations)="  + SimulatedBatchSize*NumOfEquations);
            System.out.println(" ********************* SIMULATION Reduction " + i + " End ************************* ");
            System.out.println("ReduceNextDouble="  + ReduceNextDouble);
            batchSize = ReductionbatchSize(batchSize*1.0*ReduceNextDouble).intValue();
            System.out.println(" ********************* Load Time Taken " + i + " Begin ************************* ");
            System.out.println("StrCurrentTimeTaken="  + StrCurrentTimeTaken);
            LocalDateTime current = LocalDateTime.now();
            String[] TimeTaken = current.toString().split(":");
            String localStrCurrentTimeTaken = "";
            if (TimeTaken.length == 3) {
               localStrCurrentTimeTaken = "" + (Integer.parseInt(TimeTaken[1]) * 60) + (Double.parseDouble(TimeTaken[2]));
            } else {
               localStrCurrentTimeTaken = "" + (Integer.parseInt(TimeTaken[1]) * 60);
            }
            System.out.println("parse Completed:Run Time:" + current + " Time Taken=" + (1000.0 * (Double.parseDouble(localStrCurrentTimeTaken) - Double.parseDouble(StrCurrentTimeTaken))) + " milli seconds.");
            System.out.println(" ********************* Load Time Taken " + i + " End ************************* ");
            System.out.println(" ********************* SIMULATION Increase " + i + " Begin ************************* ");
            SimulatedBatchSize=ChopComputeIncrease(args);
            System.out.println("SeqOutputWork=" + variables.get("SeqOutputWork"));
            System.out.println("batchSize(Equations)="  + variables.get("batchSize"));
            System.out.println("numberofFiles="  + variables.get("numberofFiles"));
            System.out.println("ExprnexpValue="  + variables.get("ExprnexpValue"));
            System.out.println("SimulatedBatchSize(Equations)="  + SimulatedBatchSize);
            System.out.println(" ********************* SIMULATION Increase " + i + " End ************************* ");
            System.out.println("IncreaseNextDouble="  + IncreaseNextDouble);
            batchSize = IncreasebatchSize(batchSize*1.0*IncreaseNextDouble).intValue();
            System.out.println(" ********************* Load Time Taken " + i + " Begin ************************* ");
            System.out.println("StrCurrentTimeTaken="  + StrCurrentTimeTaken);
            LocalDateTime current1 = LocalDateTime.now();
            String[] TimeTaken1 = current.toString().split(":");
            String localStrCurrentTimeTaken1 = "";
            if (TimeTaken1.length == 3) {
               localStrCurrentTimeTaken1 = "" + (Integer.parseInt(TimeTaken1[1]) * 60) + (Double.parseDouble(TimeTaken1[2]));
            } else {
               localStrCurrentTimeTaken = "" + (Integer.parseInt(TimeTaken1[1]) * 60);
            }
            System.out.println("parse Completed:Run Time:" + current + " Time Taken=" + (1000.0 * (Double.parseDouble(localStrCurrentTimeTaken1) - Double.parseDouble(StrCurrentTimeTaken))) + " milli seconds.");
            System.out.println(" ********************* Load Time Taken " + i + " End ************************* ");
        }
    }
    // main End
}
