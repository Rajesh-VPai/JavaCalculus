/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculus;

import Calculus.MathsContxtLAv0_1.DiffExpr;
import Calculus.MathsContxtLAv0_1.Expression;
import Calculus.MathsContxtLAv0_1.FoG;
import Calculus.MathsContxtLAv0_1.FoGLowLvL;
import Calculus.MathsContxtLAv0_1.IntegrExpr;
import static Calculus.MathsContxtLAv0_1.MyFuncDiff;
import static Calculus.MathsContxtLAv0_1.MyFuncExpress;
import static Calculus.MathsContxtLAv0_1.MyFuncIntegr;
import static Calculus.MathsContxtLAv0_1.MyFuncSimple;
import Calculus.MathsContxtLAv0_1.OrderVar;
import Calculus.MathsContxtLAv0_1.Predicate;
import Calculus.MathsContxtLAv0_1.SimpleAlgebra;
import Calculus.MathsContxtLAv0_1.SimpleAlgebraHghLvl;
import Calculus.MathsContxtLAv0_1.SimpleExpression;
import static Calculus.MathsContxtLAv0_1.eatAll;
import static Calculus.MathsContxtLAv0_1.parse;
import static Calculus.MathsContxtLAv0_1.parseAlgebra;
import static Calculus.MathsContxtLAv0_1.parseAlgebraHghLvl;
import static Calculus.MathsContxtLAv0_1.parseDiff;
import static Calculus.MathsContxtLAv0_1.parseFoG;
import static Calculus.MathsContxtLAv0_1.parseFoGLowLvL;
import static Calculus.MathsContxtLAv0_1.parseIntegr;
import static Calculus.MathsContxtLAv0_1.parseOrder;
import static Calculus.MathsContxtLAv0_1.parsePredicate;
import static Calculus.MathsContxtLAv0_1.parseSimple;
import static Calculus.MathsContxtLAv0_1.variablesDiff;
import static Calculus.TestHarness.PassFailTestCaseString;
import static Calculus.TestHarness.PassFailTestCaseValue;
import static Calculus.TestHarness.TestPredicate;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import org.apache.log4j.Logger;

/**
 *
 * @author Administrator
 */
public class Usage {

    public static Logger log = Logger.getLogger(Usage.class.getName());
    public static String DiffWithRespTo = "x";
    public static int MaxDiffOrder = 6;
    public static int MaxIntegreOrder = 6;
    
    static String EqnUnderTest;
    // Differentiation Mapping
    static String[] EqnSolArrayMap1;
    static String[] EqnSolArrayDiffAlone;
    static String[] EqnSolArrayMap2;
    
    // Integration Mapping
    static String[] EqnSolArrayMap3;
    static String[] EqnSolArrayIntegrAlone;
    static String[] EqnSolArrayMap4;
    
    static String[] EqnSolArrayIntegr_BeforeDiff;
    static String[] EqnSolArrayDiff_AfterIntegr;
    
    static String[] EqnSolArrayDiff_BeforeIntegr;
    static String[] EqnSolArrayIntegr_AfterDiff;
    
    
    static int[] EqnSolOrder;
    static int TestCase = 0;
    static int EndTestCase = 0;
    static int LastTestCaseHarness=110007;
    static int TestCaseLoopTimes = 110007;
    static String EqnRegressionDiffStatus = "All RED";
    static String EqnRegressionIntegreStatus = "All RED";
    static String TestCaseName = "Standard";
    static String TestCaseMatrixID = "Standard";
    
public static String FailingLowLevelUnitTestCases() {
        //UnStructured Testing Test Cases
        //String Exprn="x^2 - x +2 + y^3 + y + 4";

        //HighLevel Unit Test for Whole Program 
        //14th Order Diff
        /* ************************************************************************ */
        //Failing Test Cases: Low Level Analysed/Debugged Failure
        //Simple Basic Equation
        //String Exprn = ;
        //Simple Basic Equation
        String Exprn = "x^8 + x^5 + x^4 - x - 25.0";
        //Palindromic String-Equation Test
        //String Exprn = " 25.0 + x - x^4 -x^5 -x^8 + x^8 + x^5 + x^4 - x - 25.0";
        //Palindromic String-Equation Test-Rearranged
        //String Exprn = " x^8 -x^8 + x^5 -x^5 + x^4 - x^4 + 25.0 + x - x - 25.0";
        //Test for LookAheadFuncMultDiv
        //Straight Numbers Leading + Trailing Co-eff :(LookAheadFuncMultDiv & ConstExprn)
        //(Polynomials)
        //String Exprn = "1/x^8 + 1/x^5 + 1/x^4 - 25.0";
        //Functions 
        //String Exprn = "(2*x+1)*x^9 + x^7 + x^5 + x^2 - sin(x^2)- sin(2*x+5) ";
        //String Exprn = "sin(2.0*7.0*x)+25.0";
        //Parenthesis
        //String Exprn = "(x^8+2*x+1) + x^7  - sin(x^4+ 2*x+ 5) ";
        //Parenthesis with Constants
        //String Exprn="(114.70000000000073*(x-11)+28843.09)*(x-1)*(x-2)*(x-3)*(x-4)*(x-5)*(x-6)*(x-7)*(x-8)*(x-9)*(x-10)*(1.0)*(x-12)*(x-13)*(x-14)*(x-15)*(x-16)*(x-17)*(x-18)*(x-19)*(x-20)*(x-21)";
        //Addition Subtraction
        //String Exprn = "(x^8+2*x+1) + x^7  - (x^4+ 2*x+ 5) ";
        //Multiplication Division
        //String Exprn = "(x^8+2*x+1) + x^7  - (x^4+ 2*x+ 5) ";
        //Parenthesis within Parenthesis
        //Add Operation
        //Subtraction
        //Divide Operation
        //Multiplication
        //Constants
        //String Exprn="11.0*12.0*x*13.0*14.0";
        return Exprn;
    }
public static String FailingTestHarnessDiff(String AlgoName,int j) {
//Equation Component Testing
//1)	Variables :L=3:Single Letter, Multi Letter, with Numerics
//2)	Coefficient:L=9:0.0,0,1.0,1,-1.0,-1,5,-5,-5.0
//3)	Exponent:L=6: +ve,-ve,0,1,Independent Constants, Long Form (x * x*x)
//4)	Operator:L=2: *,/
//5)	Constants:L=3: Start of Expr, Middle (2-5) Terms, End Term
//6)	Independent Constants:L=3:Single Letter, Multi Letter, with Numerics
//7)	Expression
//8)	Term:L=3: Start Term, Middle (2-5) Terms, End Term
//9)	Term Sign:L=3: +ve, -ve, No Sign
//10)	Exponent Sign:L=3: +ve, -ve, No Sign
//11)	Coefficient Sign:L=3: +ve, -ve, No Sign
//12)	Variable Sign:L=3: +ve, -ve, No Sign
//13)	Parenthesis:L=3 : 1st Term, 2nd Term , 3-5 Terms
//14)	Functions:L5: Sin, Cos, Tan, Log, Ln
//15)	Argument of Functions:L=4: Expr Alone(3 types), Expr with Inner Function
        if((j >= 100)&&(j <= 105))
            TestHarness.SanityTestCases(AlgoName,j);
        else if((j >= 5019)&&(j <= 5042))
            TestHarnessUnitTest.UnitTestCases(AlgoName,j);
            //
            // Variants
            //
        else if ((j >= 10001)&&(j <= 10005))
            TestHarnessNames.Names(j);
        else if((j >= 20001)&&(j <= 20092))
            TestHarnessCoefficients.Coefficients(AlgoName,j);
        else if((j >= 30001)&&(j <= 30011))
            TestHarness.Exponent(AlgoName,j);
        else if((j >= 40001)&&(j <= 40034))
            TestHarnessSignedX.SignedX(AlgoName,j);
        else if((j >= 50001)&&(j <= 50029))
           TestHarnessIndConstant.IndConstant(AlgoName,j);
        else if((j >= 80001)&&(j <= 80012))
            TestHarness.Parenthesis(AlgoName,j);
        else if((j >= 110001)&&(j <= 110007))
            TestHarness.SoftwareEngg(AlgoName,j);
        else {
            switch (j) {
            //Function Test Cases
            case 90001:
                TestHarness.TestCaseDiff90001();
                break;
            //Function Argument Test Cases
            case 100001:
                TestHarness.TestCaseDiff100001();
                break;
            default:
                System.out.println(ConsoleColors.RED +"FailingTestHarnessDiff:j= " + j  + ": Infinite Loop"+ ConsoleColors.RESET);
                break;
         }
        }
        
        return EqnUnderTest;
    }
    public static void mainPredicate(String[] args) {
        Map<String, Double> variables = new HashMap<>();
        String Exprn = TestPredicate();
        String DiffWithRespTo = "x";
        Predicate expValue;

        MyFuncExpress();
        Exprn = eatAll(Exprn, ' ');

        int i = 1;
        for (double x = -2, y = 7; i < 10; y++, x++, i++) {
            variables.put("x", x);
            variables.put("y", y);
            System.out.println("main: x=" + x + " Exprn=" + Exprn);
            expValue = parsePredicate(Exprn, variables);
            System.out.println(" main:Result(Simplified Diff Value)=" + expValue.eval());
            System.out.print(System.lineSeparator());
        }
    }

    public static void mainDiff(String... args) {
        Map<String, Double> variables = new HashMap<>();
        Map<String, String> variablesDiff = new HashMap<>();
        //String Exprn = eatAll(TestCases(), ' ');
        //String Exprn = eatAll(HighLevelUnitTestCases(), ' ');
        //String Exprn = eatAll(FailingHighLevelUnitTestCases(), ' ');
        String Exprn = eatAll(FailingLowLevelUnitTestCases(), ' ');
        SimpleExpression expSimple;
        Expression expValue;
        DiffExpr exp;

        MyFuncExpress();
        MyFuncDiff();
        MyFuncSimple();

        String DiffWithRespTo = "x";
        String Constant = "C";
        //String DiffWithRespTo = "Xn";
        variablesDiff.put(DiffWithRespTo, DiffWithRespTo);

        String StrexpSimpleExpress = "";

        int i = 1;
        for (double x = 1, y = 7; i < 5; y++, x++, i++) {
            variables.put(DiffWithRespTo, x);
            variables.put("y", y);
            variables.put(Constant, 5.0);

            System.out.println("main: x=" + x + " Exprn=" + Exprn);
            expSimple = parseSimple(Exprn, variables, variablesDiff, DiffWithRespTo);
            expValue = parse(Exprn, variables, DiffWithRespTo);
            System.out.println(" main:Result(Expn Value)=" + expValue.eval());

            StrexpSimpleExpress = expSimple.SimpleExpr();

            System.out.println("main: x=" + x + " Basic Simple Exprn=" + StrexpSimpleExpress);
            expValue = parse(StrexpSimpleExpress, variables, DiffWithRespTo);
            System.out.println("main: x=" + x + " Basic Simple (Exprn Value)=" + expValue.eval());

            exp = parseDiff(Exprn, variables, variablesDiff, DiffWithRespTo);
            StrexpSimpleExpress = exp.DiffExpr();
            System.out.println(" main:Result(Diff Equation)(" + i + " th order)=> " + StrexpSimpleExpress);
            expValue = parse(StrexpSimpleExpress, variables, DiffWithRespTo);
            System.out.println(" main:Result(Diff Value)=" + expValue.eval());

            expSimple = parseSimple(StrexpSimpleExpress, variables, variablesDiff, DiffWithRespTo);
            StrexpSimpleExpress = expSimple.SimpleExpr();
            System.out.println(" main:Result(Simplified Diff Equation)(" + i + " th order)=> " + StrexpSimpleExpress);
            expValue = parse(StrexpSimpleExpress, variables, DiffWithRespTo);
            System.out.println(" main:Result(Simplified Diff Value)=" + expValue.eval());
            System.out.print(System.lineSeparator());
            expValue = parse(Exprn, variables, DiffWithRespTo);
            System.out.println(" main:Result(Expn Value)=" + expValue.eval());
            Exprn = StrexpSimpleExpress;
        }
    }

    public static void mainIntegral(String... args) {
        Map<String, Double> variables = new HashMap<>();
        Map<String, String> variablesIntegr = new HashMap<>();
        //String Exprn = eatAll(TestCases(), ' ');
        //String Exprn = eatAll(HighLevelUnitTestCases(), ' ');
        //String Exprn = eatAll(FailingHighLevelUnitTestCases(), ' ');
        String Exprn = eatAll(FailingLowLevelUnitTestCases(), ' ');
        SimpleExpression expSimple;
        Expression expValue;
        IntegrExpr expIntgr;

        MyFuncExpress();
        MyFuncSimple();
        MyFuncIntegr();

        String DiffWithRespTo = "x";
        String Constant = "C";
        //String DiffWithRespTo = "Xn";
        String StrexpIntegrExpress = "";
        String StrexpSimpleExpress = "";
        variablesIntegr.put(DiffWithRespTo, DiffWithRespTo);
        variablesIntegr.put(Constant, Constant);
        StrexpIntegrExpress = Exprn;

        int i = 1;
        for (double x = -20, y = 7; i < 5; y++, x++, i++) {
            variables.put(DiffWithRespTo, x);
            variables.put("y", y);
            variables.put(Constant, 5.0);
            System.out.println("main: x=" + x + " Basic Simple Exprn=" + StrexpIntegrExpress);
            expValue = parse(StrexpIntegrExpress, variables, DiffWithRespTo);
            System.out.println("main: x=" + x + " Basic Simple (Exprn Value)=" + expValue.eval());

            expIntgr = parseIntegr(StrexpIntegrExpress, variables, variablesDiff, DiffWithRespTo);
            StrexpIntegrExpress = expIntgr.IntegrExpr();
            System.out.println(" main:Result(Integral Equation)(" + i + " th order)=> " + StrexpIntegrExpress);
            expValue = parse(StrexpIntegrExpress, variables, DiffWithRespTo);
            System.out.println(" main:Result(Integral Value)=" + expValue.eval());

            expSimple = parseSimple(StrexpIntegrExpress, variables, variablesDiff, DiffWithRespTo);
            StrexpIntegrExpress = expSimple.SimpleExpr();
            System.out.println(" main:Result(Simplified Integral Equation)(" + i + " th order)=> " + StrexpIntegrExpress);
            expValue = parse(StrexpIntegrExpress, variables, DiffWithRespTo);
            System.out.println(" main:Result(Simplified Integral Value)=" + expValue.eval());
            expValue = parse(Exprn, variables, DiffWithRespTo);
            System.out.println(" main:Result(Expn Value)=" + expValue.eval());

            System.out.print(System.lineSeparator());
        }
    }

    public static String RandomEquation(String a, String c, String RandVar) {
        String Exprn = a + " * " + RandVar + "^7" + " + " + RandVar + "^5" + " + " + RandVar + "^2" + " - " + RandVar + " + " + c;
        Exprn = eatAll(Exprn, ' ');
        return Exprn;
    }

    public static String BrownianMotionEquation(String N, String ETA, String r, String R, String T, String x, String t, String RandVar) {
        String Exprn = N + "*" + "sqrt((3*" + N + "*" + ETA + "*" + r + ")/(2*" + R + "*" + T + "))" + "*" + "exp((-3*" + Math.PI + "*" + ETA + "*" + N + "*" + r + "*" + x + "^2)/(2*" + R + "*" + T + "*" + t + "))";
        Exprn = eatAll(Exprn, ' ');
        return Exprn;
    }

    public static String FormEquation(long Xn,long MgtACoeff, long Mgtc, long MgtbCoeff,String TechDiffWithRespTo, int MgtMaxExponent) {
        //if(Xn==0) MaxExponent=5;
        //else MaxExponent=(int)Xn;
        long bCoeffStore=MgtbCoeff;
        //log.fatal("FormEquation: MgtbCoeff=" + MgtbCoeff );
        String Exprn = MgtACoeff + " * " + TechDiffWithRespTo + "^" + (MgtMaxExponent );
        for (int i = MgtMaxExponent - 1; i > 1; i--) {
            if(MgtbCoeff >2)
                    Exprn = Exprn + " + " + MgtbCoeff + "*" + TechDiffWithRespTo + "^" + i;
            else {
                Exprn = Exprn + " + " + MgtbCoeff + "*" + TechDiffWithRespTo + "^" + i;
                MgtbCoeff=bCoeffStore;
            }
            //MgtbCoeff=GetPrimeNumber(MgtbCoeff,i);
            MgtbCoeff++;
            //log.fatal("FormEquation: MgtbCoeff=" + MgtbCoeff + " i=" + i);
        }
        if(MgtbCoeff > 2)
                    Exprn =Exprn + " + " + MgtbCoeff + "*" + TechDiffWithRespTo;
        else 
            Exprn =Exprn + " + " + TechDiffWithRespTo;
        Exprn = Exprn + " + " + Mgtc;
        Exprn = eatAll(Exprn, ' ');
        log.warn("FormEquation:Exprn=" + Exprn);
        return Exprn;
    }

    public static void mainRegresssionDiffTest(int MaxOrder, TestHarness TestData) {
        String Exprn = "";
        Map<String, Double> variables = new HashMap<>();
        Map<String, String> variablesDiff = new HashMap<>();
        //String Exprn = eatAll(TestCases(), ' ');
        //String Exprn = eatAll(HighLevelUnitTestCases(), ' ');
        //String Exprn = eatAll(FailingHighLevelUnitTestCases(), ' ');
        //String Exprn = eatAll(FailingLowLevelUnitTestCases(), ' ');
        //Exprn = eatAll(Exprn, ' ');
        SimpleExpression expSimple;
        Expression expValue;
        DiffExpr exp;
        OrderVar expOrder;

        MyFuncExpress();
        MyFuncDiff();
        MyFuncSimple();

        String Constant = "C";
        //String DiffWithRespTo = "Xn";

        String StrexpSimpleExpressMap1 = "";
        String StrexpDiffExpress = "";
        String StrexpSimpleExpressMap2 = "";
        String myOrder = "";

        double ExprnexpValue = 0;
        double DblexpValueMap1 = 0;
        double DblexpDiffValue = 0;
        double DblexpValueMap2 = 0;
        int j = TestCase;
        boolean TestCasePassStrFlag = false;
        boolean TestCasePassValFlag = false;
        boolean TestCasePassHighLevelFlag = true;
        HashMap<Integer, String> FailedTestCases = new HashMap<Integer, String>();
        HashMap<Integer, String> ExceptionTestCases = new HashMap<Integer, String>();
        int MaxIndexFail = 0;
        int MaxIndexExcept = 0;
        int MaxOrder1 = MaxOrder;
        int i = 1;
        int TotalTestCases = 0;
        
        String OverallRegressionStatus = "Diff:Pass All (5019 to 100001) Except Test Cases: "
                + "\n" + "TestCases:Unit Test Cases" + " All Passing"
                + "\n" + "TestCases:Names " + " All Passing"
                + "\n" + "TestCases:Coefficients " + " 20016 , 20017"
                + "\n" + "TestCases:Exponent " + " 30006 to 30008";
        System.out.print(ConsoleColors.BLUE + "Diff Overall Regression Status" + OverallRegressionStatus + ConsoleColors.RESET);
        System.out.print(System.lineSeparator());
        if(EndTestCase > LastTestCaseHarness)
            EndTestCase=LastTestCaseHarness;
        while (j <= EndTestCase) {
            EqnUnderTest = "";
            String TempExprn = "";

            TempExprn = FailingTestHarnessDiff("mainDiffTest",j);
            if (MaxOrder == -1) {
                MaxOrder1 = MaxDiffOrder; //From Test Case
            } else if (MaxOrder >= MaxDiffOrder) {
                MaxOrder1 = MaxDiffOrder;
            } else {
                MaxOrder1 = MaxOrder;
            }

            if ((!EqnUnderTest.equalsIgnoreCase("")) && (TempExprn != null) && (!TempExprn.equalsIgnoreCase(""))) {
                Exprn = eatAll(TempExprn, ' ');
            } else {
                j = RegressionControl(j);
                System.out.println(ConsoleColors.RED + "mainDiffTest: j=" + j + " TestCase=" + TestCase);
                continue;
            }
            System.out.println(ConsoleColors.YELLOW + "Test Case " + TestCase + " EndTestCase=" + EndTestCase + " j=" + j +  ConsoleColors.RESET);
            System.out.println(ConsoleColors.BLUE + "Test Case " + TestCase + " Exprn=" + Exprn + ConsoleColors.RESET);
            System.out.println(ConsoleColors.BLUE + "Test Case Name=" + TestCaseName + ConsoleColors.RESET);
            System.out.println(ConsoleColors.BLUE + "Test Case Name=" + TestCaseMatrixID + ConsoleColors.RESET);
            System.out.println(ConsoleColors.BLUE + "Regression Status : Test Case should be " + EqnRegressionDiffStatus + ConsoleColors.RESET);
            i = 1;
            TotalTestCases++;
            TestCasePassHighLevelFlag=true;
            String StageMapping = "";
            variablesDiff.put(DiffWithRespTo, DiffWithRespTo);
            try {
                for (double x = 1, y = 7; i < MaxOrder1; y++, x++, i++) {
                    TestCasePassStrFlag = false;
                    TestCasePassValFlag = false;
                    variables.put(DiffWithRespTo, x);
                    variables.put("y", y);
                    variables.put("a", 1.0);
                    variables.put("b", 2.0);//variables.put("b", 0.0);
                    variables.put("c", -1.0);
                    variables.put("d", 2.0);
                    variables.put("p", 3.0);
                    variables.put("q", 0.0);
                    variables.put("r", -1.0);
                    variables.put("s", 2.0);
                    variables.put(Constant, 5.0);
                    StageMapping = "Basic Mapping";
                    expOrder = parseOrder(Exprn, DiffWithRespTo);
                    myOrder = expOrder.eval();
                    System.out.println("main: " + DiffWithRespTo + "=" + x + " Exprn=" + Exprn + " Order=" + myOrder);

                    expSimple = parseSimple(Exprn, variables, variablesDiff, DiffWithRespTo);
                    StrexpSimpleExpressMap1 = expSimple.SimpleExpr();
                    System.out.println("main: " + DiffWithRespTo + "=" + x + " Basic Simple Exprn=" + StrexpSimpleExpressMap1);
                    
                    
                    expValue = parse(StrexpSimpleExpressMap1, variables, DiffWithRespTo);
                    ExprnexpValue = expValue.eval();
                    System.out.println(" main:Result(Expn Value)=" + ExprnexpValue);
                    
                    expValue = parse(StrexpSimpleExpressMap1, variables, DiffWithRespTo);
                    DblexpValueMap1 = expValue.eval();
                    System.out.println("main: " + DiffWithRespTo + "=" + x + " Basic Simple (Exprn Value)=" + DblexpValueMap1);
                    StageMapping = "Differentiation";
                    exp = parseDiff(StrexpSimpleExpressMap1, variables, variablesDiff, DiffWithRespTo);
                    StrexpDiffExpress = exp.DiffExpr();
                    System.out.println(" main:Result(Diff Equation)(" + i + " th order)=> " + StrexpDiffExpress);
                    StageMapping = "Differentiation Mapping";
                    expSimple = parseSimple(StrexpDiffExpress, variables, variablesDiff, DiffWithRespTo);
                    StrexpSimpleExpressMap2 = expSimple.SimpleExpr();
                    expValue = parse(StrexpDiffExpress, variables, DiffWithRespTo);
                    DblexpDiffValue = expValue.eval();
                    System.out.println("main: " + DiffWithRespTo + "=" + x + " Result(Diff Value)=" + DblexpDiffValue);
                    System.out.println(" main:Result(Simplified Diff Equation)(" + i + " th order)=> " + StrexpSimpleExpressMap2);
                    expValue = parse(StrexpSimpleExpressMap2, variables, DiffWithRespTo);
                    DblexpValueMap2 = expValue.eval();
                    System.out.println("main: " + DiffWithRespTo + "=" + x + " Result(Simplified Diff Value)=" + expValue.eval());
                    System.out.print(System.lineSeparator());
                    if (PassFailTestCaseString(TestCase, i, "Diff" , Exprn, StrexpSimpleExpressMap1, StrexpDiffExpress, StrexpSimpleExpressMap2, EqnUnderTest, EqnSolArrayMap1[i], EqnSolArrayDiffAlone[i], EqnSolArrayMap2[i])) {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass STRING TEST Complete" + ConsoleColors.RESET);
                        TestCasePassStrFlag = true;
                    } else {
                        System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "FAIL STRING TEST Complete" + ConsoleColors.RESET);
                        if(TestCasePassHighLevelFlag==true)
                            TestCasePassHighLevelFlag=false;
                    }

                    if (PassFailTestCaseValue(TestCase, i, "Diff",Exprn, ExprnexpValue, DblexpValueMap1, DblexpDiffValue, DblexpValueMap2,variables)) {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass VALUE TEST Complete" + ConsoleColors.RESET);
                        TestCasePassValFlag = true;
                    } else {
                        System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "FAIL VALUE TEST Complete" + ConsoleColors.RESET);
                         if(TestCasePassHighLevelFlag==true)
                            TestCasePassHighLevelFlag=false;
                    }
                    Exprn = StrexpSimpleExpressMap2;
                    System.out.print(System.lineSeparator());

                    if ((TestCasePassStrFlag == true) && (TestCasePassValFlag == true))
                ;//Do Nothing : Test Case Passed
                    else {
                        String Temp = FailedTestCases.get(MaxIndexFail);
                        String HashVal = "";
                        if ((Temp != null) && (!Temp.equalsIgnoreCase(""))) {
                            HashVal = Temp + "," + ":Order=" + (i ) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag;
                        } else {
                            HashVal = "TestCase=" + TestCase + ":Order=" + (i ) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag;
                        }
                        FailedTestCases.put(MaxIndexFail, HashVal);
                        //i=MaxOrder1;
                    }
                }
            } catch (Exception MyException) {
                System.out.print(System.lineSeparator());
                System.out.print(System.lineSeparator());
                MyException.printStackTrace();
                System.out.println(ConsoleColors.RED + "TestCase " + TestCase + " Failed at Order=" + i + " due to Exception at Stage=" + StageMapping + "." + ConsoleColors.RESET);
                System.out.print(System.lineSeparator());
                String Temp = FailedTestCases.get(MaxIndexFail);
                String HashVal = "";
                if ((Temp != null) && (!Temp.equalsIgnoreCase(""))) {
                            HashVal = Temp + "," + ":Order=" + (i ) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag;
                } else {
                            HashVal = "TestCase=" + TestCase + ":Order=" + (i ) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag;
                       }
                FailedTestCases.put(MaxIndexFail, HashVal);
                String Temp1 = ExceptionTestCases.get(MaxIndexExcept);
                String HashVal1 = "";
                if ((Temp1 != null) && (!Temp1.equalsIgnoreCase(""))) {
                            HashVal1 = Temp1 + "," + ":Order=" + (i ) ;
                } else {
                            HashVal1 = "TestCase=" + TestCase + ":Order=" + (i ) ;
                       }
                ExceptionTestCases.put(MaxIndexExcept, HashVal);
                MaxIndexExcept++;
                //i=MaxOrder1;
                TestCasePassHighLevelFlag=false;
            }
            System.out.print(System.lineSeparator());

            if (TestCaseLoopTimes == 1) {
                break;
            } else {
                j = RegressionControl(j);
                //System.out.println(ConsoleColors.RED +"mainDiffTest: j="+ j + " TestCase=" + TestCase);
            }
            if (TestCasePassHighLevelFlag==false) MaxIndexFail++;
        }
        System.out.println(ConsoleColors.RED + "mainDiffTest: TestCase Summary : Total Failed=" + MaxIndexFail + " Out of Run TestCases=" + TotalTestCases +  " Failed Test Cases are:" + ConsoleColors.RESET);
        for (int y = 0; y < MaxIndexFail; y++) {
            System.out.print(ConsoleColors.RED + " " + FailedTestCases.get(y) + ", " + ConsoleColors.RESET);
            if ((y !=0)&&(y % 5 == 0) ) {
                System.out.print(System.lineSeparator());
            }
        }
        System.out.print(System.lineSeparator());
        System.out.println(ConsoleColors.RED + "mainDiffTest: Exception TestCase Summary : Total Exceptions=" + MaxIndexExcept + " Exception Test Cases are:" + ConsoleColors.RESET);
        for (int y = 0; y < MaxIndexExcept; y++) {
            System.out.print(ConsoleColors.RED + " " + ExceptionTestCases.get(y) + ", " + ConsoleColors.RESET);
            if ((y !=0)&&(y % 5 == 0)) {
                System.out.print(System.lineSeparator());
            }
        }
        System.out.print(System.lineSeparator());
    }

    public static int RegressionControl(int j) {
        if ((j >= 100) && (j < 105)) {
            j++;
        } else if ((j >= 5019) && (j < 5042)) {
            j++;
        } else if ((j >= 10001) && (j < 10005)) {
            j++;
        } else if ((j >= 20001) && (j < 20092)) {
            j++;
        } else if ((j >= 30001) && (j < 30011)) {
            j++;
        }  else if ((j >= 40001) && (j < 40034)) {
            j++;
        }else if ((j >= 50001) && (j < 50029)) {
            j++;
        }else if( (j >= 80001) && (j < 80012)){
            j++;
        } else if( (j >= 110001) && (j < 110007)){
            j++;
        } else if (j == 90001) {
            j = 100001;
        }else if (j == 100001) {
            j = 110001;
        }else if (j == 110007) {
            j = 120001;
        } 
//        else if ((j >= 90001) && (j < 90002)) {
//            j++;
//        } else if ((j >= 100001) && (j < 100002)) {
//            j++;
//        }    
        //Bypass Gaps Section
        else if ((j < 100)) {
            j = 100;
        }else if ((j == 105)) {
            j = 5019;
        }else if (j == 5042) {
            j = 10001;
        } else if (j == 10005) {
            j = 20001;
        } else if (j == 20092) {
            j = 30001;
        } else if (j == 30011) {
            j = 40001;
        }else if (j == 40034) {
            j = 50001;
        }else if (j == 50029) {
            j = 80001;
        } else if (j == 80012) {
            j = 90001;
        }
        else {
            System.out.println(ConsoleColors.RED + "RegressionControl:j= " + j + ": Infinite Loop" + ConsoleColors.RESET);
        }
        return j;

    }

    public static void mainRegressionIntegrTest(int MaxOrder, TestHarness TestData) {

        String Exprn = "";
        Map<String, Double> variables = new HashMap<>();
        Map<String, String> variablesDiff = new HashMap<>();
        //String Exprn = eatAll(TestCases(), ' ');
        //String Exprn = eatAll(HighLevelUnitTestCases(), ' ');
        //String Exprn = eatAll(FailingHighLevelUnitTestCases(), ' ');
        //String Exprn = eatAll(FailingLowLevelUnitTestCases(), ' ');
        //Exprn = eatAll(Exprn, ' ');
        SimpleExpression expSimple;
        Expression expValue;
        IntegrExpr exp;
        OrderVar expOrder;

        MyFuncExpress();
        MyFuncDiff();
        MyFuncSimple();
        MyFuncIntegr();
        
        String Constant = "C";
        //String DiffWithRespTo = "Xn";

        String StrexpSimpleExpressMap1 = "";
        String StrexpDiffExpress = "";
        String StrexpSimpleExpressMap2 = "";
        String myOrder = "";

        double ExprnexpValue = 0;
        double DblexpValueMap1 = 0;
        double DblexpDiffValue = 0;
        double DblexpValueMap2 = 0;
        int j = TestCase;
        boolean TestCasePassStrFlag = false;
        boolean TestCasePassValFlag = false;
        boolean TestCasePassHighLevelFlag = true;
        HashMap<Integer, String> FailedTestCases = new HashMap<Integer, String>();
        HashMap<Integer, String> ExceptionTestCases = new HashMap<Integer, String>();
        int MaxIndexFail = 0;
        int MaxIndexExcept = 0;
        int MaxOrder1 = MaxOrder;
        int i = 1;
        int TotalTestCases=0;
        String OverallRegressionStatus = "Integral:"
                + "\n" + "TestCases:Unit Test Cases" + " 24"
                + "\n" + "TestCases:Names "
                + "\n" + "TestCases:Coefficients " + " 20016, 20017 "
                + "\n" + "TestCases:Exponent " + " 30002 to 30008";
        System.out.print(ConsoleColors.BLUE + "Integral Overall Regression Status =" + OverallRegressionStatus + ConsoleColors.RESET);
        System.out.print(System.lineSeparator());
        if(EndTestCase > LastTestCaseHarness)
            EndTestCase=LastTestCaseHarness;
            
        while (j <= EndTestCase) {
            EqnUnderTest = "";
            String TempExprn = "";

            TempExprn = FailingTestHarnessDiff("mainIntegrTest",j);
            if (MaxOrder == -1) {
                MaxOrder1 = MaxIntegreOrder; //From Test Case
            } else if (MaxOrder > MaxIntegreOrder) {
                MaxOrder1 = MaxIntegreOrder;
            } else {
                MaxOrder1 = MaxOrder;
            }

            if ((!EqnUnderTest.equalsIgnoreCase("")) && (TempExprn != null) && (!TempExprn.equalsIgnoreCase(""))) {
                Exprn = eatAll(TempExprn, ' ');
            } else {
                j = RegressionControl(j);
                System.out.println(ConsoleColors.RED + "mainIntegrTest: j=" + j + " TestCase=" + TestCase);
                continue;
            }
            System.out.println(ConsoleColors.BLUE + "Test Case " + TestCase + " Exprn=" + Exprn + ConsoleColors.RESET);
            System.out.println(ConsoleColors.BLUE + "Test Case Name=" + TestCaseName + ConsoleColors.RESET);
            System.out.println(ConsoleColors.BLUE + "Test Case Name=" + TestCaseMatrixID + ConsoleColors.RESET);
            System.out.println(ConsoleColors.BLUE + "Integral Regression Status : Test Case should be " + EqnRegressionIntegreStatus + ConsoleColors.RESET);
            i = 1;
            TotalTestCases++;
            TestCasePassHighLevelFlag=true;
            String StageMapping = "";
            variablesDiff.put(DiffWithRespTo, DiffWithRespTo);
            try {
                for (double x = 1, y = 7; i < MaxOrder1; y++, /*x++,*/ i++) {
                    TestCasePassStrFlag = false;
                    TestCasePassValFlag = false;
                    variables.put(DiffWithRespTo, x);
                    variables.put("y", y);
                    variables.put("a", 1.0);
                    variables.put("b", 2.0);//variables.put("b", 0.0);
                    variables.put("c", -1.0);
                    variables.put("d", 2.0);
                    variables.put("p", 1.0);
                    variables.put("q", 0.0);
                    variables.put("r", -1.0);
                    variables.put("s", 2.0);
                    variables.put(Constant, 5.0);
                    StageMapping = "Basic Mapping";
                    expOrder = parseOrder(Exprn, DiffWithRespTo);
                    myOrder = expOrder.eval();
                    System.out.println("main: " + DiffWithRespTo + "=" + x + " Exprn=" + Exprn + " Order=" + myOrder);
                    expSimple = parseSimple(Exprn, variables, variablesDiff, DiffWithRespTo);
                    StrexpSimpleExpressMap1 = expSimple.SimpleExpr();
                    System.out.println("main: " + DiffWithRespTo + "=" + x + " Basic Simple Exprn=" + StrexpSimpleExpressMap1);
                    
                    expValue = parse(StrexpSimpleExpressMap1, variables, DiffWithRespTo);
                    ExprnexpValue = expValue.eval();
                    System.out.println(" main:Result(Expn Value)=" + ExprnexpValue);
                    
                    expValue = parse(StrexpSimpleExpressMap1, variables, DiffWithRespTo);
                    DblexpValueMap1 = expValue.eval();
                    System.out.println("main: " + DiffWithRespTo + "=" + x + " Basic Simple (Exprn Value)=" + DblexpValueMap1);

                    StageMapping = "Integration";
                    exp = parseIntegr(StrexpSimpleExpressMap1, variables, variablesDiff, DiffWithRespTo);
                    StrexpDiffExpress = exp.IntegrExpr();
                    System.out.println(" main:Result(Integral Equation)(" + i + " th order)=> " + StrexpDiffExpress);
                    
                    StageMapping = "Integration Mapping";
                    expSimple = parseSimple(StrexpDiffExpress, variables, variablesDiff, DiffWithRespTo);
                    StrexpSimpleExpressMap2 = expSimple.SimpleExpr();
                    System.out.println(" main:Result(Simplified Integral Equation)(" + i + " th order)=> " + StrexpSimpleExpressMap2);
                    expValue = parse(StrexpDiffExpress, variables, DiffWithRespTo);
                    DblexpDiffValue = expValue.eval();
                    System.out.println("main: " + DiffWithRespTo + "=" + x + " Result(Integral Value)=" + DblexpDiffValue);
                    expValue = parse(StrexpSimpleExpressMap2, variables, DiffWithRespTo);
                    DblexpValueMap2 = expValue.eval();
                    System.out.println("main: " + DiffWithRespTo + "=" + x + " Result(Simplified Integral Value)=" + expValue.eval());
                    System.out.print(System.lineSeparator());

                    if (PassFailTestCaseString(TestCase, i, "Integre" , Exprn, StrexpSimpleExpressMap1, StrexpDiffExpress, StrexpSimpleExpressMap2, EqnUnderTest, EqnSolArrayMap3[i], EqnSolArrayIntegrAlone[i], EqnSolArrayMap4[i])) {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass STRING TEST Complete" + ConsoleColors.RESET);
                        TestCasePassStrFlag = true;
                    } else {
                        System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "FAIL STRING TEST Complete" + ConsoleColors.RESET);
                        if(TestCasePassHighLevelFlag==true)
                            TestCasePassHighLevelFlag=false;
                    }

                    if (PassFailTestCaseValue(TestCase, i, "Integre" , Exprn, ExprnexpValue, DblexpValueMap1, DblexpDiffValue, DblexpValueMap2,variables)) {
                        System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass VALUE TEST Complete" + ConsoleColors.RESET);
                        TestCasePassValFlag = true;
                    } else {
                        System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "FAIL VALUE TEST Complete" + ConsoleColors.RESET);
                        if(TestCasePassHighLevelFlag==true)
                            TestCasePassHighLevelFlag=false;
                    }
                    Exprn = StrexpSimpleExpressMap2;
                    System.out.print(System.lineSeparator());

                    if ((TestCasePassStrFlag == true) && (TestCasePassValFlag == true))
                ;//Do Nothing : Test Case Passed
                    else {
                        String Temp = FailedTestCases.get(MaxIndexFail);
                        String HashVal = "";
                        if ((Temp != null) && (!Temp.equalsIgnoreCase(""))) {
                            HashVal = Temp + "," + ":Order=" + (i ) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag;
                        } else {
                            HashVal = "TestCase=" + TestCase + ":Order=" + (i ) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag;
                        }
                        FailedTestCases.put(MaxIndexFail, HashVal);
                        //i=MaxOrder1;
                    }
                }
            } catch (Exception MyException) {
                System.out.print(System.lineSeparator());
                System.out.print(System.lineSeparator());
                MyException.printStackTrace();
                System.out.println(ConsoleColors.RED + "TestCase " + TestCase + " Failed at Order=" + i + " due to Exception at Stage=" + StageMapping + "." + ConsoleColors.RESET);
                System.out.print(System.lineSeparator());
                String Temp = FailedTestCases.get(MaxIndexFail);
                String HashVal = "";
                if ((Temp != null) && (!Temp.equalsIgnoreCase(""))) {
                            HashVal = Temp + "," + ":Order=" + (i ) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag;
                } else {
                            HashVal = "TestCase=" + TestCase + ":Order=" + (i ) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag;
                       }
                FailedTestCases.put(MaxIndexFail, HashVal);
                String Temp1 = ExceptionTestCases.get(MaxIndexExcept);
                String HashVal1 = "";
                if ((Temp1 != null) && (!Temp1.equalsIgnoreCase(""))) {
                            HashVal1 = Temp1 + "," + ":Order=" + (i ) ;
                } else {
                            HashVal1 = "TestCase=" + TestCase + ":Order=" + (i ) ;
                       }
                ExceptionTestCases.put(MaxIndexExcept, HashVal);
                MaxIndexExcept++;
                i=MaxOrder1;
                TestCasePassHighLevelFlag=false;
            }
            System.out.print(System.lineSeparator());

            if (TestCaseLoopTimes == 1) {
                break;
            } else {
                j = RegressionControl(j);
            }
            if (TestCasePassHighLevelFlag==false) MaxIndexFail++;
        }
        for(int a=0; a < 10; a++)
                System.out.print(System.lineSeparator());
        System.out.println(ConsoleColors.RED + "mainIntegrTest: TestCase Summary : Total Failed=" + MaxIndexFail + " Out of Run TestCases=" + TotalTestCases + " Failed Test Cases are:" + ConsoleColors.RESET);
        for (int y = 0; y < MaxIndexFail; y++) {
            System.out.print(ConsoleColors.RED + " " + FailedTestCases.get(y) + ", " + ConsoleColors.RESET);
            if  ((y !=0)&&(y % 5 == 0)) {
                System.out.print(System.lineSeparator());
            }
        }
        System.out.print(System.lineSeparator());
        System.out.println(ConsoleColors.RED + "mainIntegrTest: Exception TestCase Summary : Total Exceptions=" + MaxIndexExcept + " Exception Test Cases are:" + ConsoleColors.RESET);
        for (int y = 0; y < MaxIndexExcept; y++) {
            System.out.print(ConsoleColors.RED + " " + ExceptionTestCases.get(y) + ", " + ConsoleColors.RESET);
            if ((y !=0)&&(y % 5 == 0)) {
                System.out.print(System.lineSeparator());
            }
        }
        System.out.print(System.lineSeparator());
    }
    public static void mainUser(String... args) {
        System.out.println(ConsoleColors.BLUE + "Differentiation / Integration:" + ConsoleColors.RESET);
        String TechDiffWithRespTo=DiffWithRespTo;
        String xExprn = "Enter*Your*Equation/Here:x^2+25:";
        Scanner scanner = new Scanner(System.in);
        
        System.out.print(xExprn);
        xExprn=scanner.nextLine();
        xExprn = eatAll(xExprn, ' ');
        System.out.print("You Entered Equation:Example:x^2+25:"+xExprn);
        System.out.print(System.lineSeparator());
        
        
        System.out.print("DiffWithRespTo:[" + TechDiffWithRespTo+"]:");
        TechDiffWithRespTo=scanner.nextLine();
        
        if(TechDiffWithRespTo.equalsIgnoreCase(""))
            TechDiffWithRespTo=DiffWithRespTo;
        //TechDiffWithRespTo = eatAll(TechDiffWithRespTo, ' ');
        
        if (xExprn.contains(TechDiffWithRespTo)) {
                System.out.print("You Entered Primary Variable:"+TechDiffWithRespTo);
                System.out.print(System.lineSeparator());
        }
        else {
             System.out.println("You Entered Equation:"+xExprn);
             System.out.println("You Entered Primary Variable:"+TechDiffWithRespTo + " but Equation entered does not contain " + TechDiffWithRespTo);
             System.out.println("Proceeding with Entered Values");
        }
        System.out.print("Diff And Integration Order:");
        String Temp=scanner.nextLine();
        int TechDiffOrder=2;
        if (!Temp.equalsIgnoreCase(""))
            TechDiffOrder=Integer.parseInt(Temp);
        System.out.print("You Entered Diff And Integration Order:"+(TechDiffOrder));
        System.out.print(System.lineSeparator());
        
        System.out.println(ConsoleColors.BLUE + "Differentiation Started:" + ConsoleColors.RESET);
        
        UserDiff( xExprn, "mainUser", TechDiffOrder, TechDiffWithRespTo) ;
        System.out.print(System.lineSeparator());
        System.out.print(System.lineSeparator());
        System.out.print(System.lineSeparator());
        
        System.out.println(ConsoleColors.BLUE + "Integration Started:" + ConsoleColors.RESET);
        UserIntegr( xExprn, "mainUser", TechDiffOrder, TechDiffWithRespTo) ;
        
    }
    public static String UserDiff(String Exprn,  String AlgoName,   int TechDiffOrder, String TechDiffWithRespTo) {
        Map<String, Double> variables = new HashMap<>();
        Map<String, String> variablesDiff = new HashMap<>();
        MyFuncExpress();
        MyFuncDiff();
        MyFuncSimple();
        SimpleExpression expSimple;
        Expression expValue;
        String StrexpSimpleExpress = "";
        String StrexpDiffExpress = "";
        int TechDiffOrderIndex = 1;
        expValue = parse(Exprn, variables, TechDiffWithRespTo);
        for (; (TechDiffOrderIndex <=  TechDiffOrder) ; TechDiffOrderIndex++) {
            variables.put(TechDiffWithRespTo, 1.0);
            expSimple = parseSimple(Exprn, variables, variablesDiff, TechDiffWithRespTo);
            StrexpSimpleExpress = expSimple.SimpleExpr();
            System.out.println("UserDiff: TechDiffWithRespTo=" + TechDiffWithRespTo + " Basic Simple Exprn=" + StrexpSimpleExpress);

            DiffExpr exp = parseDiff(StrexpSimpleExpress, variables, variablesDiff, TechDiffWithRespTo);
            StrexpDiffExpress = exp.DiffExpr();
            System.out.println("UserDiff:Result(Diff Equation)(" + TechDiffOrderIndex + " th order)=> " + StrexpDiffExpress);

            expSimple = parseSimple(StrexpDiffExpress, variables, variablesDiff, TechDiffWithRespTo);
            StrexpSimpleExpress = expSimple.SimpleExpr();
            System.out.println("UserDiff: TechDiffWithRespTo=" + TechDiffWithRespTo + " Basic Simple Exprn=" + StrexpSimpleExpress);
            expValue = parse(StrexpSimpleExpress, variables, TechDiffWithRespTo);
            System.out.println("UserDiff:Result(Value)(" + TechDiffWithRespTo + "=" + variables.get(TechDiffWithRespTo) + ")=" + expValue.eval());
            Exprn = StrexpSimpleExpress;
            
        }
       return StrexpSimpleExpress;
    }
    public static String UserIntegr(String Exprn,  String AlgoName,   int TechDiffOrder, String TechDiffWithRespTo) {
        Map<String, Double> variables = new HashMap<>();
        Map<String, String> variablesDiff = new HashMap<>();
        MyFuncExpress();
        MyFuncDiff();
        MyFuncSimple();
        variablesDiff.put(TechDiffWithRespTo, TechDiffWithRespTo);
        SimpleExpression expSimple;
        Expression expValue;
        IntegrExpr exp;
        String StrexpSimpleExpress = "";
        String StrexpDiffExpress = "";
        int TechDiffOrderIndex = 1;
        expValue = parse(Exprn, variables, TechDiffWithRespTo);
        for (; (TechDiffOrderIndex <=  TechDiffOrder) ; TechDiffOrderIndex++) {
            variables.put(TechDiffWithRespTo, 1.0);
            expSimple = parseSimple(Exprn, variables, variablesDiff, TechDiffWithRespTo);
            StrexpSimpleExpress = expSimple.SimpleExpr();
            System.out.println("UserIntegr: TechDiffWithRespTo=" + TechDiffWithRespTo + " Basic Simple Exprn=" + StrexpSimpleExpress);

            exp = parseIntegr(StrexpSimpleExpress, variables, variablesDiff, TechDiffWithRespTo);
            StrexpDiffExpress = exp.IntegrExpr();
            System.out.println("UserIntegr:Result(Integr Equation)(" + TechDiffOrderIndex + " th order)=> " + StrexpDiffExpress);

            expSimple = parseSimple(StrexpDiffExpress, variables, variablesDiff, TechDiffWithRespTo);
            StrexpSimpleExpress = expSimple.SimpleExpr();
            System.out.println("UserIntegr: TechDiffWithRespTo=" + TechDiffWithRespTo + " Basic Simple Exprn=" + StrexpSimpleExpress);
            expValue = parse(StrexpSimpleExpress, variables, TechDiffWithRespTo);
            System.out.println("UserIntegr:Result(Value)(" + TechDiffWithRespTo + "=" + variables.get(TechDiffWithRespTo) + ")=" + expValue.eval());
            Exprn = StrexpSimpleExpress;
            
        }
       return StrexpSimpleExpress;
    }
    
    public static void mainAlgebraUser(String... args){
        Map<String, Double> variables = new HashMap<>();
        Map<String, String> variablesDiff = new HashMap<>();
        String StrexpSimpleExpress = "";
        SimpleExpression expSimple;
        String FuncF="x^2+25";
        
        String FuncG="2*x+98";
        //SimpleAlgebra F;
        SimpleAlgebraHghLvl F;
        FoG FuncComp;
        //FoGLowLvL FuncComp;
        
        String TechDiffWithRespTo=DiffWithRespTo;
        System.out.println(ConsoleColors.BLUE + "Algebra / Function Composition:" + ConsoleColors.RESET);
        System.out.print("Enter*Your* First Equation/Here:x^2+25:");
        
        Scanner scanner = new Scanner(System.in);

        FuncF=scanner.nextLine();
        FuncF = eatAll(FuncF, ' ');
        System.out.println("You Entered First Equation:Example:x^2+25:"+FuncF);
        System.out.print(System.lineSeparator());
        System.out.print("Enter*Your* Second Equation/Here:x^2+25:");
        FuncG=scanner.nextLine();
        FuncG = eatAll(FuncG, ' ');
        
        System.out.println("You Entered Second Equation:Example:x^2+25:"+FuncG);
        System.out.print(System.lineSeparator());
             
        System.out.print("DiffWithRespTo:[" + TechDiffWithRespTo+"]:");
        TechDiffWithRespTo=scanner.nextLine();
        
        if(TechDiffWithRespTo.equalsIgnoreCase(""))
            TechDiffWithRespTo=DiffWithRespTo;
        TechDiffWithRespTo = eatAll(TechDiffWithRespTo, ' ');
        
        if ((FuncF.contains(TechDiffWithRespTo))&&(FuncF.contains(TechDiffWithRespTo))) {
                System.out.print("You Entered Primary Variable:"+TechDiffWithRespTo);
                System.out.print(System.lineSeparator());
        }
        else {
             System.out.println("You Entered First Equation:"+FuncF);
             System.out.println("You Entered Second Equation:"+FuncG);
             System.out.println("You Entered Primary Variable:"+TechDiffWithRespTo + " but Equation entered does not contain " + TechDiffWithRespTo);
             System.out.println("Proceeding with Entered Values");
        }
        
        //F=parseAlgebra(FuncF, FuncG, "*", variables, TechDiffWithRespTo);
        F=parseAlgebraHghLvl(FuncF, FuncG, "*", variables, TechDiffWithRespTo);

        expSimple = parseSimple(F.Algebra(), variables, variablesDiff, TechDiffWithRespTo);
        StrexpSimpleExpress = expSimple.SimpleExpr();
        System.out.println("mainAlgebra: TechDiffWithRespTo=" + TechDiffWithRespTo + " Basic Simple Algebraic Exprn=" + StrexpSimpleExpress);

        FuncComp=parseFoG(FuncF, FuncG, variables, TechDiffWithRespTo);
        
        //FuncComp=parseFoGLowLvL(FuncF, FuncG, variables, TechDiffWithRespTo);
        if (!FuncComp.Substitute().contains("(")){
            expSimple = parseSimple(FuncComp.Substitute(), variables, variablesDiff, TechDiffWithRespTo);
            StrexpSimpleExpress = expSimple.SimpleExpr();
        }else
            StrexpSimpleExpress = FuncComp.Substitute();
        System.out.println("mainAlgebra: TechDiffWithRespTo=" + TechDiffWithRespTo + " Basic Function Composition FoG=" + StrexpSimpleExpress);

    }
}
