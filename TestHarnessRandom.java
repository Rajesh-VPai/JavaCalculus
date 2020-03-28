/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculus;

import static Calculus.MathsContxtLAv0_1.parse;
import static Calculus.Usage.DiffWithRespTo;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;

/**
 *
 * @author Administrator
 */
public class TestHarnessRandom {

    public static Logger log = Logger.getLogger(TestHarnessRandom.class.getName());

    public static String EqnUnderTestX;
    public static String EqnUnderTestY;
    
    
    public static int TestCase = 0;
    public static int EndTestCase = 0;
    public static int TestCaseLoopTimes = 0;
    public static String EqnRegressionDiffStatus = "All RED";
    public static String EqnRegressionIntegreStatus = "All RED";
    public static String TestCaseName = "Standard";
    public static String TestCaseMatrixID = "Standard";
    
    public static long TestCaseMgtACoeff=0;
    public static long TestCaseMgtbCoeffY=0;
    public static long TestCaseMgtbCoeffX=0;
    public static double TestCaseMgtc=0;
    public static long TestCaseMgtModulusY=0;
    public static long TestCaseMgtModulusX=0;
    public static int TestCaseMgtMaxExponent=0;
    public static String TestCaseTechDiffWithRespTo="";
                    
    public static int TestCasedups = 0;
    public static int TestCaseNumEqnChanged=0;
    public static int TestCasesizex = 0;
    public static int TestCasesizey = 0;
    public static int TestCaseretry=0;
    public static int TestCasepixel=0;
    public static int ProgramStoppedAt=0;
    
    
    TestHarnessRandom(int MaxOrder, String All, String MyEndTestCase,String RegrORIndivORLimit) {
        
        

        if ((All.equalsIgnoreCase("All")) && (RegrORIndivORLimit.equalsIgnoreCase("Regression"))) {
            TestCase = 5019;
            TestCaseLoopTimes = 80001;
        } else if ((All.equalsIgnoreCase("All")) && (RegrORIndivORLimit.equalsIgnoreCase("LimitedRegression"))) {
            TestCase = 5019;
            //TestCaseLoopTimes = 80001;
            EndTestCase=Integer.parseInt(MyEndTestCase);
        } else if (RegrORIndivORLimit.equalsIgnoreCase("Individual")) {
            TestCase = Integer.parseInt(All);
            TestCaseLoopTimes = 1;
            EndTestCase=Integer.parseInt(MyEndTestCase);
        } else if ((All.equalsIgnoreCase("All")) && (RegrORIndivORLimit.equalsIgnoreCase("Individual"))) {
            System.out.println(" Wrong Input :All & Individual");
            TestCase = 5019;
            TestCaseLoopTimes = 1;
            EndTestCase=Integer.parseInt(MyEndTestCase);
        } else if ((!All.equalsIgnoreCase("All")) && (RegrORIndivORLimit.equalsIgnoreCase("Regression"))) {
            TestCase = Integer.parseInt(All);
            TestCaseLoopTimes = 100001;
        }else if ((!All.equalsIgnoreCase("All")) && (RegrORIndivORLimit.equalsIgnoreCase("LimitedRegression"))&& (!MyEndTestCase.equalsIgnoreCase("-1"))) {
            TestCase = Integer.parseInt(All);
            //TestCaseLoopTimes = Integer.parseInt(MyEndTestCase)-TestCase+1;
            EndTestCase=Integer.parseInt(MyEndTestCase);
        }

    }

    public static String TestPredicate() {
        //String Exprn = "0 < = x < 5 "; 
        //String Exprn = "(0 < = x)&&(x < 5 )"; //A&&B
        String Exprn = "(!(0 > x))&&((5 > x )))";//(A'||B')&&(A||B)
        return Exprn;
    }

    public static String FailingTestHarnessDiff(String AlgoName,int j) {
        
        return EqnUnderTestX;
    }

    
   
    public static void TestCaseDiff5019() {
        //Test Case 5019
        TestCase = 5019;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values Except 4th Order Integration";
        EqnUnderTestX = "7*Xn^7+7*Xn^6+8*Xn^5+9*Xn^4+10*Xn^3+11*Xn^2+12*Xn+5";
        EqnUnderTestY = "7*Xn^7+7*Xn^6+8*Xn^5+9*Xn^4+10*Xn^3+11*Xn^2+12*Xn+5";
        TestCaseName = "Standard:Independent COnstant:Basic Equation:Divide Operator";
        TestCaseMatrixID="Unit TestCase";
        
        //Test Metrics
        TestCasedups = 561;
        TestCasesizex = 768;
        TestCasesizey = 1024;
        TestCasepixel=10000;
        
        TestCaseMgtACoeff=7;
        TestCaseMgtbCoeffY=7;
        TestCaseMgtbCoeffY=7;
        TestCaseMgtc=5;
        TestCaseMgtModulusY=1021;
        TestCaseMgtModulusX=761;
        TestCaseMgtMaxExponent=7;
        TestCaseTechDiffWithRespTo="Xn";
        
        TestCaseretry=0;
        ProgramStoppedAt=0;
        TestCaseNumEqnChanged=2;
        
        
        
    }
    public static void TestCaseDiff5020() {
        //Test Case 5020
        TestCase = 5020;
        EqnRegressionDiffStatus = "All Green Including Values";
        EqnRegressionIntegreStatus = "All Green Including Values Except 4th Order Integration";
        EqnUnderTestX = "41*Xn^37+761*Xn^36+762*Xn^35+763*Xn^34+764*Xn^33+765*Xn^32+766*Xn^31+767*Xn^30+768*Xn^29+769*Xn^28+770*Xn^27+771*Xn^26+772*Xn^25+773*Xn^24+774*Xn^23+775*Xn^22+776*Xn^21+777*Xn^20+778*Xn^19+779*Xn^18+780*Xn^17+781*Xn^16+782*Xn^15+783*Xn^14+784*Xn^13+785*Xn^12+786*Xn^11+787*Xn^10+788*Xn^9+789*Xn^8+790*Xn^7+791*Xn^6+792*Xn^5+793*Xn^4+794*Xn^3+795*Xn^2+796*Xn+5";
        EqnUnderTestY = "41*Xn^37+1021*Xn^36+1022*Xn^35+1023*Xn^34+1024*Xn^33+1025*Xn^32+1026*Xn^31+1027*Xn^30+1028*Xn^29+1029*Xn^28+1030*Xn^27+1031*Xn^26+1032*Xn^25+1033*Xn^24+1034*Xn^23+1035*Xn^22+1036*Xn^21+1037*Xn^20+1038*Xn^19+1039*Xn^18+1040*Xn^17+1041*Xn^16+1042*Xn^15+1043*Xn^14+1044*Xn^13+1045*Xn^12+1046*Xn^11+1047*Xn^10+1048*Xn^9+1049*Xn^8+1050*Xn^7+1051*Xn^6+1052*Xn^5+1053*Xn^4+1054*Xn^3+1055*Xn^2+1056*Xn+5";
        TestCaseName = "Standard:Independent COnstant:Basic Equation:Divide Operator";
        TestCaseMatrixID="Unit TestCase";
        
        //Test Metrics
        TestCasedups = 1040;
        TestCasesizex = 768;
        TestCasesizey = 1024;
        TestCasepixel=10000;
        
        TestCaseMgtACoeff=41;
        TestCaseMgtbCoeffY=1021;
        TestCaseMgtbCoeffX=761;
        TestCaseMgtc=5.0;
        TestCaseMgtModulusY=1021;
        TestCaseMgtModulusX=761;
        TestCaseMgtMaxExponent=37;
        TestCaseTechDiffWithRespTo="Xn";
        
        TestCaseretry=0;
        ProgramStoppedAt=10000;
        TestCaseNumEqnChanged=1;
        
        
        
    }
}
