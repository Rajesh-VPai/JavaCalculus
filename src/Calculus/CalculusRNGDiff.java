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

import static Calculus.CalculusApplication.GetPrimeNumber;
import static Calculus.CalculusApplication.PrimeNumber;
import Calculus.DiffrIntegrSep.DiffExpr;
import Calculus.MathsExpressionParser.Expression;
import static Calculus.DiffrIntegrSep.MyFuncDiff;
import static Calculus.MathsContxtLAv.MyFuncExpress;
import static Calculus.MathsContxtLAv.MyFuncSimple;
import Calculus.MathsContxtLAv.SimpleExpression;
import static Calculus.MathsContxtLAv.eatAll;
import static Calculus.MathsExpressionParser.parse;
import static Calculus.DiffrIntegrSep.parseDiff;
import static Calculus.MathsContxtLAv.parseSimple;
import static Calculus.UsageCalculus.FormEquation;
import Plot.PlotSSCCE;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.util.List;
import javax.swing.ImageIcon;
import java.util.LinkedList;

/**
 *
 * @author Administrator
 */
public class CalculusRNGDiff {

    public static Logger log = Logger.getLogger(CalculusRNGDiff.class.getName());
    public static LinkedList<String> TupleStore;
    public static int x = 0, y = 0;
    public static String RandomEquation(String a, String c, String RandVar) {
        String Exprn = a + " * " + RandVar + "^7" + " + " + RandVar + "^5" + " + " + RandVar + "^2" + " - " + RandVar + " + " + c;
        Exprn = eatAll(Exprn, ' ');
        return Exprn;
    }

    public static long RandomDiff(String Exprn, int planeNum, String AlgoName, long Xn, long MgtACoeff, long MgtbCoeff, long Mgtc, long MgtModulus, String TechDiffWithRespTo) {
        //Value = (a * Factorial + c) % (FactorialSpread + 1);
        Map<String, Double> variables = new HashMap<>();
        MyFuncExpress();
        MyFuncDiff();
        MyFuncSimple();
        String MapType="Map1";
        String IntegrORDiffr="Diffr";
        //log.info("RNGDiff:Expr_LCG_Factorial: Xn=" + Xn + " Basic Simple Exprn=" + Exprn);
        SimpleExpression expSimple;
        Expression expValue;
        String StrexpSimpleExpress = "";
        String StrexpDiffExpress = "";
        int TechDiffOrder = 1;
        long TempXn = 0;
        expValue = parse(Exprn, variables, TechDiffWithRespTo, false, "Silent",MathsExpressionParser.LogLevel.Off);
        TempXn = (long)( expValue.eval().longValue() % (MgtModulus ) );
        long Xnplus1 = TempXn;
        for (; (TechDiffOrder < /*MaxOrderOfX*/ 10) && (TempXn == Xnplus1); TechDiffOrder++) {
            variables.put(TechDiffWithRespTo, ((double) Xn));
            //expSimple = parseSimple(Exprn, variables, variablesDiff, DiffWithRespTo);
            //StrexpSimpleExpress = expSimple.SimpleExpr();
            //log.info("RNGDiff:Expr_LCG_Factorial: Xn=" + Xn + " Basic Simple Exprn=" + StrexpSimpleExpress);

            DiffExpr exp = parseDiff(Exprn, variables, TechDiffWithRespTo,MapType, IntegrORDiffr);
            StrexpDiffExpress = exp.DiffExpr();
            //log.info("RNGDiff:Expr_LCG_Factorial:Result(Diff Equation)(" + TechDiffOrder + " th order)=> " + StrexpDiffExpress);

            //expSimple = parseSimple(StrexpDiffExpress, variables, variablesDiff, DiffWithRespTo);
            //StrexpSimpleExpress = expSimple.SimpleExpr();
            //log.info("RNGDiff:Expr_LCG_Factorial: Xn=" + Xn + " Basic Simple Exprn=" + StrexpSimpleExpress);
            expValue = parse(StrexpDiffExpress, variables, TechDiffWithRespTo, false, "Silent",MathsExpressionParser.LogLevel.Off);
            //log.info("RNGDiff:Expr_LCG_Factorial:Result(Value)(x)=" + expValue.eval());
            Exprn = StrexpDiffExpress;
            if (TechDiffOrder > 1) {
                TempXn = Xnplus1;
            }
            Xnplus1 = (long) (expValue.eval() % (MgtModulus ));
            //Xnplus1=(long)(expValue.eval() );
        }
        //log.warn("RNGDiff:Expr_LCG_Factorial:Depth=" + DiffOrder);
        //log.info("RNGDiff:Expr_LCG_Factorial:Exprn=" + Exprn);
        //log.info("RNGDiff:Expr_LCG_Factorial:Xn=" + Xn);
        //log.info("RNGDiff:Expr_LCG_Factorial:Xnplus1=" + Xnplus1);
        return ((long) Xnplus1);
    }

    
    public static void main(String... args) {
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int sizex = (int) screenSize.getHeight();
        int sizey = (int) screenSize.getWidth();
        PlotSSCCE mySSCCE=new PlotSSCCE(sizex,sizey);
        mySSCCE.createAndShowGUI(sizex,sizey);
        int dups=0;
        int NumEqnChanged=0;
        int timeRetry = 5;
        long i = 0;
        int MgtMaxExponent=37;
        log.fatal("RNGDiffTest:main:Plots Random Pixels on the SCCE Screen. Remember to repaint by Maximize & Restore Down Toggle"); 
        TupleStore = new LinkedList<String>();
        StoreTuple(x, y);
        log.fatal("RNGDiffTest:main:sizex=" + sizex);
        log.fatal("RNGDiffTest:main:sizey=" + sizey);
        log.fatal("RNGDiffTest:main:Total Pixel=" + (sizex*sizey) );
        String TechDiffWithRespTo="Xn";
        long PrimeY = PrimeNumber(sizey) ;
        String yExprn = FormEquation(y, (long) 41, (long) 5, (long) PrimeY, TechDiffWithRespTo, MgtMaxExponent);
        long PrimeX = GetPrimeNumber(sizex,0) ;
        String xExprn = FormEquation(x, (long) 41, (long) 5, (long) PrimeX, TechDiffWithRespTo, MgtMaxExponent);
        
        log.fatal("RNGDiffTest:main:xExprn="+xExprn);
        log.fatal("RNGDiffTest:main:yExprn="+yExprn);
        log.fatal("RNGDiffTest:main:PrimeY=" + PrimeY + " PrimeX=" + PrimeX);
        log.fatal("RNGDiffTest:main:Speed is better if we comment all log.info in MathsContxtLAv4_0 !!!");
        log.fatal("RNGDiffTest:main:Started !!!");
        for (i=0; i < 10000/*(sizex*sizey)*/; i++) {
            //log.fatal("RNGDiff:main:x=" + x + " y=" + y + " i=" + i);
            //if ((x >= 0) && (x < sizex) && (y >= 0) && (y < sizey)) {
                mySSCCE.showPixel("Hello", x,y,0xFFFFFF);
//            } else {
//                log.fatal("RNGDiff:main:NOT Printing");
//            }
           
            while (timeRetry > 0) {
                //yExprn = FormEquation(y, (long) 37.0, (long) 5.0, (long) 17.0, "Xn", (int) 7);
                double temp = (int) RandomDiff(yExprn, 0, "main", (long) y, (long) 37.0, (long) 17.0, (long) 5.0, PrimeY, TechDiffWithRespTo);
                //Mapping "-RND 0 RND" to "0 RND"
                if (temp < 0) {
                    temp = (-1.0) * temp;
                }
                //0 to RND
                if ((temp >= 0) && (temp < sizey)) {
                    y = (int) temp;
                } else {
                    y = ((int) temp % (sizey + 1));
                }
                //log.warn("RNGDiff:main:y:temp=" + temp);
                //log.warn("RNGDiff:main:y=" + y);
                //xExprn = FormEquation(x, (long) 17.0, (long) 5.0, (long) 17.0, "Xn", (int) 7);
                temp = (int) RandomDiff(xExprn, 0, "main", (long) x, (long) 17.0, (long) 17.0, (long) 5.0, PrimeX,TechDiffWithRespTo);
                //Mapping "-RND 0 RND" to "0 RND"
                if (temp < 0) {
                    temp = (-1.0) * temp;
                }
                //0 to RND
                if ((temp >= 0) && (temp < sizex)) {
                    x = (int) temp;
                } else {
                    x = ((int) temp % (sizex + 1));
                }
                //log.warn("RNGDiff:main:x:temp=" + temp);
                //log.warn("RNGDiff:main:x=" + x);
                if (StoreTuple(x, y)) {
                    timeRetry = 5;
                    break;
                } else {
                    log.fatal("RNGDiffTest:main:Found Same Tuple: x=" + x + " y=" + y + " dups=" + (++dups) + " i=" + i + " timeRetry=" + timeRetry );
                    //String Temp = TupleStore.getLast();
                    //String[] TempData = Temp.split("@");
                    //if (TempData.length >= 2) {
                    //    x = (int) Integer.parseInt(TempData[0]);
                    //    y = (int) Integer.parseInt(TempData[1]);
                        x++;
                        y++;
                    //}
                    log.fatal("RNGDiffTest:main:Changing to Tuple: x=" + x + " y=" + y);
                    timeRetry--;
                    continue;
                }
            }
           if(timeRetry==0) {
               MgtMaxExponent+=2;
               NumEqnChanged++;
               yExprn = FormEquation(y, (long) 41.0, (long) 5.0, (long) PrimeY, TechDiffWithRespTo, MgtMaxExponent);
               xExprn = FormEquation(x, (long) 41.0, (long) 5.0, (long) PrimeX, TechDiffWithRespTo, MgtMaxExponent);
               timeRetry=5;
               log.fatal("RNGDiffTest:main:Changed Equation:xExprn="+xExprn);
               log.fatal("RNGDiffTest:main:Changed Equation:yExprn="+yExprn);
               log.fatal("RNGDiffTest:main:Changed Equation: NumEqnChanged=" + NumEqnChanged);
               
           }
        }
        log.fatal("RNGDiffTest:main:Finished !!! Total Pixel="+i);
    }

    public static boolean StoreTuple(long x, long y) {
        if (TupleStore.contains(x + "@" + y)) {
            return false;
        } else {
            TupleStore.add(x + "@" + y);
        }
        return true;
    }
}
